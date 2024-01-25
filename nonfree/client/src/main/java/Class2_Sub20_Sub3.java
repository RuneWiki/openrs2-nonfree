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
public final class Class2_Sub20_Sub3 extends Class2_Sub20 {

	@OriginalMember(owner = "client!lr", name = "s", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	private VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!lr", name = "t", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	private DSPState aDSPState1;

	@OriginalMember(owner = "client!lr", name = "v", descriptor = "I")
	private int anInt5852;

	@OriginalMember(owner = "client!lr", name = "A", descriptor = "Lclient!go;")
	private Class2_Sub11_Sub3 aClass2_Sub11_Sub3_1;

	@OriginalMember(owner = "client!lr", name = "E", descriptor = "D")
	private double aDouble13;

	@OriginalMember(owner = "client!lr", name = "L", descriptor = "Lclient!pp;")
	private Class276 aClass276_2;

	@OriginalMember(owner = "client!lr", name = "r", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	private final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!lr", name = "w", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	private final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub20_Sub3(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method7363(@OriginalArg(1) OggPacket arg0) {
		if (super.anInt8543 < 3) {
			@Pc(23) int local23 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local23 < 0) {
				throw new IllegalStateException(String.valueOf(local23));
			}
			if (super.anInt8543 == 2) {
				if (this.aVorbisInfo1.channels <= 2 && this.aVorbisInfo1.channels >= 1) {
					this.aDSPState1 = new DSPState(this.aVorbisInfo1);
					this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
					this.aClass276_2 = new Class276(this.aVorbisInfo1.rate, Static489.anInt8544);
					this.aClass2_Sub11_Sub3_1 = new Class2_Sub11_Sub3(this.aVorbisInfo1.channels);
					return;
				}
				throw new RuntimeException(String.valueOf(this.aVorbisInfo1.channels));
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(110) float[][] local110 = this.aDSPState1.pcmOut(this.aVorbisInfo1.channels);
		this.aDouble13 = this.aDSPState1.granuleTime();
		if (this.aDouble13 == -1.0D) {
			this.aDouble13 = (double) ((float) this.anInt5852 / (float) this.aVorbisInfo1.rate);
		}
		this.aDSPState1.read(local110[0].length);
		this.anInt5852 += local110[0].length;
		@Pc(158) Class2_Sub7_Sub19 local158 = this.aClass2_Sub11_Sub3_1.method3284(local110[0].length, this.aDouble13);
		Static311.method8605(local110, local158.aShortArrayArray17);
		for (@Pc(166) int local166 = 0; local166 < this.aVorbisInfo1.channels; local166++) {
			local158.aShortArrayArray17[local166] = this.aClass276_2.method6371(local158.aShortArrayArray17[local166]);
		}
		this.aClass2_Sub11_Sub3_1.method3290(local158);
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)Lclient!go;")
	public Class2_Sub11_Sub3 method5079() {
		return this.aClass2_Sub11_Sub3_1;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Z)V")
	@Override
	public void method7360() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.a();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.a();
		}
		this.aVorbisComment1.a();
		this.aVorbisInfo1.a();
		if (this.aClass2_Sub11_Sub3_1 != null) {
			this.aClass2_Sub11_Sub3_1.method3291();
		}
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(Z)I")
	public int method5081() {
		return this.aClass2_Sub11_Sub3_1 == null ? 0 : this.aClass2_Sub11_Sub3_1.method3281();
	}

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)D")
	public double method5084() {
		@Pc(6) double local6 = this.aDouble13;
		if (this.aClass2_Sub11_Sub3_1 != null) {
			local6 = this.aClass2_Sub11_Sub3_1.method3283();
			if (local6 < 0.0D) {
				local6 = this.aDouble13;
			}
		}
		return local6 - (double) (256.0F / (float) Static489.anInt8544);
	}
}
