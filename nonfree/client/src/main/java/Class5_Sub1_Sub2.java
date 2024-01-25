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

@OriginalClass("client!nj")
public final class Class5_Sub1_Sub2 extends Class5_Sub1 {

	@OriginalMember(owner = "client!nj", name = "u", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	private VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!nj", name = "v", descriptor = "Lclient!dg;")
	private Class5_Sub14_Sub2 aClass5_Sub14_Sub2_1;

	@OriginalMember(owner = "client!nj", name = "D", descriptor = "Lclient!hr;")
	private Class158 aClass158_2;

	@OriginalMember(owner = "client!nj", name = "I", descriptor = "I")
	private int anInt6891;

	@OriginalMember(owner = "client!nj", name = "K", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	private DSPState aDSPState1;

	@OriginalMember(owner = "client!nj", name = "L", descriptor = "D")
	private double aDouble13;

	@OriginalMember(owner = "client!nj", name = "y", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	private final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!nj", name = "J", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	private final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class5_Sub1_Sub2(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)Lclient!dg;")
	public Class5_Sub14_Sub2 method5853() {
		return this.aClass5_Sub14_Sub2_1;
	}

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "(I)D")
	public double method5854() {
		@Pc(12) double local12 = this.aDouble13;
		if (this.aClass5_Sub14_Sub2_1 != null) {
			local12 = this.aClass5_Sub14_Sub2_1.method1685();
			if (local12 < 0.0D) {
				local12 = this.aDouble13;
			}
		}
		return (double) -(256.0F / (float) Static227.anInt3654) + local12;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
	@Override
	public void method8219() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.a();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.a();
		}
		this.aVorbisComment1.a();
		this.aVorbisInfo1.a();
		if (this.aClass5_Sub14_Sub2_1 != null) {
			this.aClass5_Sub14_Sub2_1.method1691();
		}
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)I")
	public int method5856() {
		return this.aClass5_Sub14_Sub2_1 == null ? 0 : this.aClass5_Sub14_Sub2_1.method1689();
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method8220(@OriginalArg(1) OggPacket arg0) {
		if (super.anInt9874 < 3) {
			@Pc(127) int local127 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local127 < 0) {
				throw new IllegalStateException(String.valueOf(local127));
			} else if (super.anInt9874 == 2) {
				if (this.aVorbisInfo1.channels > 2 || this.aVorbisInfo1.channels < 1) {
					throw new RuntimeException(String.valueOf(this.aVorbisInfo1.channels));
				}
				this.aDSPState1 = new DSPState(this.aVorbisInfo1);
				this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
				this.aClass158_2 = new Class158(this.aVorbisInfo1.rate, Static227.anInt3654);
				this.aClass5_Sub14_Sub2_1 = new Class5_Sub14_Sub2(this.aVorbisInfo1.channels);
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(34) float[][] local34 = this.aDSPState1.pcmOut(this.aVorbisInfo1.channels);
		this.aDouble13 = this.aDSPState1.granuleTime();
		if (this.aDouble13 == -1.0D) {
			this.aDouble13 = (double) ((float) this.anInt6891 / (float) this.aVorbisInfo1.rate);
		}
		this.aDSPState1.read(local34[0].length);
		this.anInt6891 += local34[0].length;
		@Pc(82) Class5_Sub2_Sub17 local82 = this.aClass5_Sub14_Sub2_1.method1684(local34[0].length, this.aDouble13);
		Static195.method2765(local82.aShortArrayArray15, local34);
		for (@Pc(90) int local90 = 0; local90 < this.aVorbisInfo1.channels; local90++) {
			local82.aShortArrayArray15[local90] = this.aClass158_2.method3331(local82.aShortArrayArray15[local90]);
		}
		this.aClass5_Sub14_Sub2_1.method1682(local82);
	}
}
