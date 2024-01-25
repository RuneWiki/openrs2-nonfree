import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class5_Sub9_Sub1 extends Class5_Sub9 {

	@OriginalMember(owner = "client!et", name = "w", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	private VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!et", name = "x", descriptor = "Lclient!ph;")
	private Class276 aClass276_1;

	@OriginalMember(owner = "client!et", name = "y", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!et", name = "z", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	private DSPState aDSPState1;

	@OriginalMember(owner = "client!et", name = "E", descriptor = "Lclient!iia;")
	private Class5_Sub17_Sub3 aClass5_Sub17_Sub3_1;

	@OriginalMember(owner = "client!et", name = "F", descriptor = "I")
	private int anInt3097;

	@OriginalMember(owner = "client!et", name = "B", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	private final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!et", name = "C", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	private final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class5_Sub9_Sub1(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;Z)V")
	@Override
	protected void method8197(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt9828 < 3) {
			@Pc(123) int local123 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local123 < 0) {
				throw new IllegalStateException(String.valueOf(local123));
			} else if (super.anInt9828 == 2) {
				if (this.aVorbisInfo1.channels > 2 || this.aVorbisInfo1.channels < 1) {
					throw new RuntimeException(String.valueOf(this.aVorbisInfo1.channels));
				}
				this.aDSPState1 = new DSPState(this.aVorbisInfo1);
				this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
				this.aClass276_1 = new Class276(this.aVorbisInfo1.rate, Static302.anInt5797);
				this.aClass5_Sub17_Sub3_1 = new Class5_Sub17_Sub3(this.aVorbisInfo1.channels);
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(30) float[][] local30 = this.aDSPState1.pcmOut(this.aVorbisInfo1.channels);
		this.aDouble5 = this.aDSPState1.granuleTime();
		if (this.aDouble5 == -1.0D) {
			this.aDouble5 = (double) ((float) this.anInt3097 / (float) this.aVorbisInfo1.rate);
		}
		this.aDSPState1.read(local30[0].length);
		this.anInt3097 += local30[0].length;
		@Pc(78) Class5_Sub3_Sub14 local78 = this.aClass5_Sub17_Sub3_1.method3996(this.aDouble5, local30[0].length);
		Static190.method4469(local78.aShortArrayArray12, local30);
		for (@Pc(86) int local86 = 0; local86 < this.aVorbisInfo1.channels; local86++) {
			local78.aShortArrayArray12[local86] = this.aClass276_1.method6477(local78.aShortArrayArray12[local86]);
		}
		this.aClass5_Sub17_Sub3_1.method3998(local78);
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(I)Lclient!iia;")
	public Class5_Sub17_Sub3 method2739() {
		return this.aClass5_Sub17_Sub3_1;
	}

	@OriginalMember(owner = "client!et", name = "f", descriptor = "(I)D")
	public double method2742() {
		@Pc(6) double local6 = this.aDouble5;
		if (this.aClass5_Sub17_Sub3_1 != null) {
			local6 = this.aClass5_Sub17_Sub3_1.method3994();
			if (local6 < 0.0D) {
				local6 = this.aDouble5;
			}
		}
		return (double) -(256.0F / (float) Static302.anInt5797) + local6;
	}

	@OriginalMember(owner = "client!et", name = "g", descriptor = "(I)I")
	public int method2743() {
		return this.aClass5_Sub17_Sub3_1 == null ? 0 : this.aClass5_Sub17_Sub3_1.method3993();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
	@Override
	public void method8195() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.b();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.b();
		}
		this.aVorbisComment1.b();
		this.aVorbisInfo1.b();
		if (this.aClass5_Sub17_Sub3_1 != null) {
			this.aClass5_Sub17_Sub3_1.method3990();
		}
	}
}
