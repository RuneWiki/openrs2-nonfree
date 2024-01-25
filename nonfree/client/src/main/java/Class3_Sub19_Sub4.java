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

@OriginalClass("client!tda")
public final class Class3_Sub19_Sub4 extends Class3_Sub19 {

	@OriginalMember(owner = "client!tda", name = "B", descriptor = "D")
	private double aDouble29;

	@OriginalMember(owner = "client!tda", name = "C", descriptor = "Lclient!nm;")
	private Class3_Sub1_Sub5 aClass3_Sub1_Sub5_1;

	@OriginalMember(owner = "client!tda", name = "E", descriptor = "Lclient!mn;")
	private Class225 aClass225_2;

	@OriginalMember(owner = "client!tda", name = "F", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	private VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!tda", name = "J", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	private DSPState aDSPState1;

	@OriginalMember(owner = "client!tda", name = "M", descriptor = "I")
	private int anInt9205;

	@OriginalMember(owner = "client!tda", name = "I", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	private final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!tda", name = "w", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	private final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub19_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(B)Lclient!nm;")
	public Class3_Sub1_Sub5 method8045() {
		return this.aClass3_Sub1_Sub5_1;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(I)V")
	@Override
	public void method8042() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.b();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.b();
		}
		this.aVorbisComment1.b();
		this.aVorbisInfo1.b();
		if (this.aClass3_Sub1_Sub5_1 != null) {
			this.aClass3_Sub1_Sub5_1.method5788();
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	@Override
	protected void method8040(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt9195 < 3) {
			@Pc(22) int local22 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local22 < 0) {
				throw new IllegalStateException(String.valueOf(local22));
			}
			if (super.anInt9195 == 2) {
				if (this.aVorbisInfo1.channels <= 2 && this.aVorbisInfo1.channels >= 1) {
					this.aDSPState1 = new DSPState(this.aVorbisInfo1);
					this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
					this.aClass225_2 = new Class225(this.aVorbisInfo1.rate, Static348.anInt5701);
					this.aClass3_Sub1_Sub5_1 = new Class3_Sub1_Sub5(this.aVorbisInfo1.channels);
					return;
				}
				throw new RuntimeException(String.valueOf(this.aVorbisInfo1.channels));
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(109) float[][] local109 = this.aDSPState1.pcmOut(this.aVorbisInfo1.channels);
		this.aDouble29 = this.aDSPState1.granuleTime();
		if (this.aDouble29 == -1.0D) {
			this.aDouble29 = (double) ((float) this.anInt9205 / (float) this.aVorbisInfo1.rate);
		}
		this.aDSPState1.read(local109[0].length);
		this.anInt9205 += local109[0].length;
		@Pc(157) Class3_Sub11_Sub15 local157 = this.aClass3_Sub1_Sub5_1.method5785(this.aDouble29, local109[0].length);
		Static369.method5386(local109, local157.aShortArrayArray27);
		for (@Pc(165) int local165 = 0; local165 < this.aVorbisInfo1.channels; local165++) {
			local157.aShortArrayArray27[local165] = this.aClass225_2.method5473(local157.aShortArrayArray27[local165]);
		}
		this.aClass3_Sub1_Sub5_1.method5792(local157);
	}

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "(I)D")
	public double method8049() {
		@Pc(11) double local11 = this.aDouble29;
		if (this.aClass3_Sub1_Sub5_1 != null) {
			local11 = this.aClass3_Sub1_Sub5_1.method5793();
			if (local11 < 0.0D) {
				local11 = this.aDouble29;
			}
		}
		return local11 - (double) (256.0F / (float) Static348.anInt5701);
	}

	@OriginalMember(owner = "client!tda", name = "d", descriptor = "(I)I")
	public int method8050() {
		return this.aClass3_Sub1_Sub5_1 == null ? 0 : this.aClass3_Sub1_Sub5_1.method5787();
	}
}
