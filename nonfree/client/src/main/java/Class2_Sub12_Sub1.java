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

@OriginalClass("client!ca")
public final class Class2_Sub12_Sub1 extends Class2_Sub12 {

	@OriginalMember(owner = "client!ca", name = "M", descriptor = "Lclient!fb;")
	private Class2_Sub23_Sub1 aClass2_Sub23_Sub1_1;

	@OriginalMember(owner = "client!ca", name = "A", descriptor = "Lclient!c;")
	private Class51 aClass51_1;

	@OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
	private int anInt1214;

	@OriginalMember(owner = "client!ca", name = "H", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	private VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!ca", name = "z", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!ca", name = "K", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	private DSPState aDSPState1;

	@OriginalMember(owner = "client!ca", name = "y", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	private final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!ca", name = "C", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	private final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub12_Sub1(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
	@Override
	public void method7843() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.b();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.b();
		}
		this.aVorbisComment1.b();
		this.aVorbisInfo1.b();
		if (this.aClass2_Sub23_Sub1_1 != null) {
			this.aClass2_Sub23_Sub1_1.method2417();
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	@Override
	protected void method7838(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt8868 < 3) {
			@Pc(21) int local21 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local21 < 0) {
				throw new IllegalStateException(String.valueOf(local21));
			}
			if (super.anInt8868 == 2) {
				if (this.aVorbisInfo1.channels <= 2 && this.aVorbisInfo1.channels >= 1) {
					this.aDSPState1 = new DSPState(this.aVorbisInfo1);
					this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
					this.aClass51_1 = new Class51(this.aVorbisInfo1.rate, Static24.anInt294);
					this.aClass2_Sub23_Sub1_1 = new Class2_Sub23_Sub1(this.aVorbisInfo1.channels);
					return;
				}
				throw new RuntimeException(String.valueOf(this.aVorbisInfo1.channels));
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(111) float[][] local111 = this.aDSPState1.pcmOut(this.aVorbisInfo1.channels);
		this.aDouble9 = this.aDSPState1.granuleTime();
		if (this.aDouble9 == -1.0D) {
			this.aDouble9 = (double) ((float) this.anInt1214 / (float) this.aVorbisInfo1.rate);
		}
		this.aDSPState1.read(local111[0].length);
		this.anInt1214 += local111[0].length;
		@Pc(161) Class2_Sub6_Sub6 local161 = this.aClass2_Sub23_Sub1_1.method2424(this.aDouble9, local111[0].length);
		Static259.method3683(local161.aShortArrayArray4, local111);
		for (@Pc(169) int local169 = 0; local169 < this.aVorbisInfo1.channels; local169++) {
			local161.aShortArrayArray4[local169] = this.aClass51_1.method1026(local161.aShortArrayArray4[local169]);
		}
		this.aClass2_Sub23_Sub1_1.method2427(local161);
	}

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "(I)Lclient!fb;")
	public Class2_Sub23_Sub1 method1060() {
		return this.aClass2_Sub23_Sub1_1;
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)I")
	public int method1062() {
		return this.aClass2_Sub23_Sub1_1 == null ? 0 : this.aClass2_Sub23_Sub1_1.method2419();
	}

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "(I)D")
	public double method1063() {
		@Pc(13) double local13 = this.aDouble9;
		if (this.aClass2_Sub23_Sub1_1 != null) {
			local13 = this.aClass2_Sub23_Sub1_1.method2422();
			if (local13 < 0.0D) {
				local13 = this.aDouble9;
			}
		}
		return (double) -(256.0F / (float) Static24.anInt294) + local13;
	}
}
