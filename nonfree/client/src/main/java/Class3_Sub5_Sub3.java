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

@OriginalClass("client!lr")
public final class Class3_Sub5_Sub3 extends Class3_Sub5 {

	@OriginalMember(owner = "client!lr", name = "p", descriptor = "D")
	private double aDouble23;

	@OriginalMember(owner = "client!lr", name = "r", descriptor = "Lclient!lja;")
	private Class3_Sub9_Sub3 aClass3_Sub9_Sub3_1;

	@OriginalMember(owner = "client!lr", name = "s", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	private DSPState aDSPState1;

	@OriginalMember(owner = "client!lr", name = "v", descriptor = "I")
	private int anInt6294;

	@OriginalMember(owner = "client!lr", name = "y", descriptor = "Lclient!td;")
	private Class334 aClass334_2;

	@OriginalMember(owner = "client!lr", name = "C", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	private VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!lr", name = "B", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	private final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!lr", name = "G", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	private final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub5_Sub3(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)D")
	public double method5273() {
		@Pc(14) double local14 = this.aDouble23;
		if (this.aClass3_Sub9_Sub3_1 != null) {
			local14 = this.aClass3_Sub9_Sub3_1.method5183();
			if (local14 < 0.0D) {
				local14 = this.aDouble23;
			}
		}
		return (double) -(256.0F / (float) Static656.anInt1392) + local14;
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)Lclient!lja;")
	public Class3_Sub9_Sub3 method5275() {
		return this.aClass3_Sub9_Sub3_1;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method7526(@OriginalArg(1) OggPacket arg0) {
		if (super.anInt8862 < 3) {
			@Pc(127) int local127 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local127 < 0) {
				throw new IllegalStateException(String.valueOf(local127));
			} else if (super.anInt8862 == 2) {
				if (this.aVorbisInfo1.channels > 2 || this.aVorbisInfo1.channels < 1) {
					throw new RuntimeException(String.valueOf(this.aVorbisInfo1.channels));
				}
				this.aDSPState1 = new DSPState(this.aVorbisInfo1);
				this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
				this.aClass334_2 = new Class334(this.aVorbisInfo1.rate, Static656.anInt1392);
				this.aClass3_Sub9_Sub3_1 = new Class3_Sub9_Sub3(this.aVorbisInfo1.channels);
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(34) float[][] local34 = this.aDSPState1.pcmOut(this.aVorbisInfo1.channels);
		this.aDouble23 = this.aDSPState1.granuleTime();
		if (this.aDouble23 == -1.0D) {
			this.aDouble23 = (double) ((float) this.anInt6294 / (float) this.aVorbisInfo1.rate);
		}
		this.aDSPState1.read(local34[0].length);
		this.anInt6294 += local34[0].length;
		@Pc(82) Class3_Sub6_Sub6 local82 = this.aClass3_Sub9_Sub3_1.method5182(local34[0].length, this.aDouble23);
		Static269.method4283(local34, local82.aShortArrayArray3);
		for (@Pc(90) int local90 = 0; local90 < this.aVorbisInfo1.channels; local90++) {
			local82.aShortArrayArray3[local90] = this.aClass334_2.method7681(local82.aShortArrayArray3[local90]);
		}
		this.aClass3_Sub9_Sub3_1.method5184(local82);
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(B)I")
	public int method5279() {
		return this.aClass3_Sub9_Sub3_1 == null ? 0 : this.aClass3_Sub9_Sub3_1.method5188();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
	@Override
	public void method7531() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.a();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.a();
		}
		this.aVorbisComment1.a();
		this.aVorbisInfo1.a();
		if (this.aClass3_Sub9_Sub3_1 != null) {
			this.aClass3_Sub9_Sub3_1.method5187();
		}
	}
}
