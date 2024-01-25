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

@OriginalClass("client!fl")
public final class Class14_Sub4_Sub2 extends Class14_Sub4 {

	@OriginalMember(owner = "client!fl", name = "F", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	private DSPState aDSPState1;

	@OriginalMember(owner = "client!fl", name = "H", descriptor = "Lclient!wg;")
	private Class14_Sub1_Sub5 aClass14_Sub1_Sub5_1;

	@OriginalMember(owner = "client!fl", name = "E", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
	private int anInt2598;

	@OriginalMember(owner = "client!fl", name = "D", descriptor = "Lclient!nga;")
	private Class250 aClass250_1;

	@OriginalMember(owner = "client!fl", name = "t", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	private VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!fl", name = "u", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	private final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!fl", name = "I", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	private final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class14_Sub4_Sub2(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)I")
	public int method2437() {
		return this.aClass14_Sub1_Sub5_1 == null ? 0 : this.aClass14_Sub1_Sub5_1.method9330();
	}

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "(I)D")
	public double method2438() {
		@Pc(6) double local6 = this.aDouble2;
		if (this.aClass14_Sub1_Sub5_1 != null) {
			local6 = this.aClass14_Sub1_Sub5_1.method9333();
			if (local6 < 0.0D) {
				local6 = this.aDouble2;
			}
		}
		return local6 - (double) (256.0F / (float) Static157.anInt2396);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	@Override
	protected void method9266(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt10922 < 3) {
			@Pc(25) int local25 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local25 < 0) {
				throw new IllegalStateException(String.valueOf(local25));
			}
			if (super.anInt10922 == 2) {
				if (this.aVorbisInfo1.channels <= 2 && this.aVorbisInfo1.channels >= 1) {
					this.aDSPState1 = new DSPState(this.aVorbisInfo1);
					this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
					this.aClass250_1 = new Class250(this.aVorbisInfo1.rate, Static157.anInt2396);
					this.aClass14_Sub1_Sub5_1 = new Class14_Sub1_Sub5(this.aVorbisInfo1.channels);
					return;
				}
				throw new RuntimeException(String.valueOf(this.aVorbisInfo1.channels));
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(122) float[][] local122 = this.aDSPState1.pcmOut(this.aVorbisInfo1.channels);
		this.aDouble2 = this.aDSPState1.granuleTime();
		if (this.aDouble2 == -1.0D) {
			this.aDouble2 = (double) ((float) this.anInt2598 / (float) this.aVorbisInfo1.rate);
		}
		this.aDSPState1.read(local122[0].length);
		this.anInt2598 += local122[0].length;
		@Pc(172) Class14_Sub2_Sub14 local172 = this.aClass14_Sub1_Sub5_1.method9329(local122[0].length, this.aDouble2);
		Static258.method4323(local172.aShortArrayArray3, local122);
		for (@Pc(180) int local180 = 0; local180 < this.aVorbisInfo1.channels; local180++) {
			local172.aShortArrayArray3[local180] = this.aClass250_1.method6132(local172.aShortArrayArray3[local180]);
		}
		this.aClass14_Sub1_Sub5_1.method9332(local172);
	}

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)Lclient!wg;")
	public Class14_Sub1_Sub5 method2439() {
		return this.aClass14_Sub1_Sub5_1;
	}

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)V")
	@Override
	public void method9267() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.b();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.b();
		}
		this.aVorbisComment1.b();
		this.aVorbisInfo1.b();
		if (this.aClass14_Sub1_Sub5_1 != null) {
			this.aClass14_Sub1_Sub5_1.method9324();
		}
	}
}
