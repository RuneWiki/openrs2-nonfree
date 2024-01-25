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

@OriginalClass("client!dp")
public final class Class2_Sub16_Sub1 extends Class2_Sub16 {

	@OriginalMember(owner = "client!dp", name = "o", descriptor = "Lclient!ew;")
	private Class101 aClass101_1;

	@OriginalMember(owner = "client!dp", name = "p", descriptor = "Lclient!mi;")
	private Class2_Sub2_Sub4 aClass2_Sub2_Sub4_1;

	@OriginalMember(owner = "client!dp", name = "q", descriptor = "I")
	private int anInt2039;

	@OriginalMember(owner = "client!dp", name = "t", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	private DSPState aDSPState1;

	@OriginalMember(owner = "client!dp", name = "v", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	private VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!dp", name = "w", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!dp", name = "z", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	private final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!dp", name = "r", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	private final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub16_Sub1(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
	@Override
	public void method6550() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.b();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.b();
		}
		this.aVorbisComment1.b();
		this.aVorbisInfo1.b();
		if (this.aClass2_Sub2_Sub4_1 != null) {
			this.aClass2_Sub2_Sub4_1.method5442();
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZLclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method6552(@OriginalArg(1) OggPacket arg0) {
		if (super.anInt7815 < 3) {
			@Pc(24) int local24 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local24 < 0) {
				throw new IllegalStateException(String.valueOf(local24));
			}
			if (super.anInt7815 == 2) {
				if (this.aVorbisInfo1.channels <= 2 && this.aVorbisInfo1.channels >= 1) {
					this.aDSPState1 = new DSPState(this.aVorbisInfo1);
					this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
					this.aClass101_1 = new Class101(this.aVorbisInfo1.rate, Static66.anInt1396);
					this.aClass2_Sub2_Sub4_1 = new Class2_Sub2_Sub4(this.aVorbisInfo1.channels);
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
		this.aDouble2 = this.aDSPState1.granuleTime();
		if (this.aDouble2 == -1.0D) {
			this.aDouble2 = (float) this.anInt2039 / (float) this.aVorbisInfo1.rate;
		}
		this.aDSPState1.read(local110[0].length);
		this.anInt2039 += local110[0].length;
		@Pc(158) Class2_Sub5_Sub8 local158 = this.aClass2_Sub2_Sub4_1.method5449(local110[0].length, this.aDouble2);
		Static14.method294(local158.aShortArrayArray14, local110);
		for (@Pc(166) int local166 = 0; local166 < this.aVorbisInfo1.channels; local166++) {
			local158.aShortArrayArray14[local166] = this.aClass101_1.method2617(local158.aShortArrayArray14[local166]);
		}
		this.aClass2_Sub2_Sub4_1.method5447(local158);
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)D")
	public double method1729() {
		@Pc(14) double local14 = this.aDouble2;
		if (this.aClass2_Sub2_Sub4_1 != null) {
			local14 = this.aClass2_Sub2_Sub4_1.method5446();
			if (local14 < 0.0D) {
				local14 = this.aDouble2;
			}
		}
		return (double) -(256.0F / (float) Static66.anInt1396) + local14;
	}

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "(I)I")
	public int method1730() {
		return this.aClass2_Sub2_Sub4_1 == null ? 0 : this.aClass2_Sub2_Sub4_1.method5445();
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Z)Lclient!mi;")
	public Class2_Sub2_Sub4 method1731() {
		return this.aClass2_Sub2_Sub4_1;
	}
}
