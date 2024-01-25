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

@OriginalClass("client!mu")
public final class Class3_Sub32_Sub2 extends Class3_Sub32 {

	@OriginalMember(owner = "client!mu", name = "B", descriptor = "I")
	private int anInt6468;

	@OriginalMember(owner = "client!mu", name = "v", descriptor = "Lclient!tl;")
	private Class359 aClass359_2;

	@OriginalMember(owner = "client!mu", name = "C", descriptor = "Lclient!kc;")
	private Class3_Sub33_Sub1 aClass3_Sub33_Sub1_1;

	@OriginalMember(owner = "client!mu", name = "r", descriptor = "D")
	private double aDouble14;

	@OriginalMember(owner = "client!mu", name = "w", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	private DSPState aDSPState1;

	@OriginalMember(owner = "client!mu", name = "z", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	private VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!mu", name = "s", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	private final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!mu", name = "A", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	private final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub32_Sub2(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)I")
	public int method5616() {
		return this.aClass3_Sub33_Sub1_1 == null ? 0 : this.aClass3_Sub33_Sub1_1.method4818();
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z)V")
	@Override
	public void method8590() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.a();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.a();
		}
		this.aVorbisComment1.a();
		this.aVorbisInfo1.a();
		if (this.aClass3_Sub33_Sub1_1 != null) {
			this.aClass3_Sub33_Sub1_1.method4819();
		}
	}

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "(I)D")
	public double method5618() {
		@Pc(6) double local6 = this.aDouble14;
		if (this.aClass3_Sub33_Sub1_1 != null) {
			local6 = this.aClass3_Sub33_Sub1_1.method4813();
			if (local6 < 0.0D) {
				local6 = this.aDouble14;
			}
		}
		return local6 - (double) (256.0F / (float) Static330.anInt9773);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	@Override
	protected void method8587(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt10068 < 3) {
			@Pc(25) int local25 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local25 < 0) {
				throw new IllegalStateException(String.valueOf(local25));
			}
			if (super.anInt10068 == 2) {
				if (this.aVorbisInfo1.channels <= 2 && this.aVorbisInfo1.channels >= 1) {
					this.aDSPState1 = new DSPState(this.aVorbisInfo1);
					this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
					this.aClass359_2 = new Class359(this.aVorbisInfo1.rate, Static330.anInt9773);
					this.aClass3_Sub33_Sub1_1 = new Class3_Sub33_Sub1(this.aVorbisInfo1.channels);
					return;
				}
				throw new RuntimeException(String.valueOf(this.aVorbisInfo1.channels));
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(119) float[][] local119 = this.aDSPState1.pcmOut(this.aVorbisInfo1.channels);
		this.aDouble14 = this.aDSPState1.granuleTime();
		if (this.aDouble14 == -1.0D) {
			this.aDouble14 = (double) ((float) this.anInt6468 / (float) this.aVorbisInfo1.rate);
		}
		this.aDSPState1.read(local119[0].length);
		this.anInt6468 += local119[0].length;
		@Pc(169) Class3_Sub7_Sub19 local169 = this.aClass3_Sub33_Sub1_1.method4816(local119[0].length, this.aDouble14);
		Static214.method3202(local169.aShortArrayArray4, local119);
		for (@Pc(177) int local177 = 0; local177 < this.aVorbisInfo1.channels; local177++) {
			local169.aShortArrayArray4[local177] = this.aClass359_2.method8264(local169.aShortArrayArray4[local177]);
		}
		this.aClass3_Sub33_Sub1_1.method4811(local169);
	}

	@OriginalMember(owner = "client!mu", name = "h", descriptor = "(I)Lclient!kc;")
	public Class3_Sub33_Sub1 method5620() {
		return this.aClass3_Sub33_Sub1_1;
	}
}
