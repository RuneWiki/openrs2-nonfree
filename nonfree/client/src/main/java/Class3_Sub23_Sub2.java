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

@OriginalClass("client!jaa")
public final class Class3_Sub23_Sub2 extends Class3_Sub23 {

	@OriginalMember(owner = "client!jaa", name = "q", descriptor = "Lclient!fea;")
	private Class3_Sub3_Sub2 aClass3_Sub3_Sub2_1;

	@OriginalMember(owner = "client!jaa", name = "u", descriptor = "I")
	private int anInt4974;

	@OriginalMember(owner = "client!jaa", name = "z", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	private VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!jaa", name = "D", descriptor = "Lclient!ln;")
	private Class208 aClass208_1;

	@OriginalMember(owner = "client!jaa", name = "F", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	private DSPState aDSPState1;

	@OriginalMember(owner = "client!jaa", name = "H", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!jaa", name = "x", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	private final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!jaa", name = "C", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	private final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub23_Sub2(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(B)I")
	public int method4280() {
		return this.aClass3_Sub3_Sub2_1 == null ? 0 : this.aClass3_Sub3_Sub2_1.method2576();
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I)D")
	public double method4281() {
		@Pc(6) double local6 = this.aDouble8;
		if (this.aClass3_Sub3_Sub2_1 != null) {
			local6 = this.aClass3_Sub3_Sub2_1.method2567();
			if (local6 < 0.0D) {
				local6 = this.aDouble8;
			}
		}
		return (double) -(256.0F / (float) Static168.anInt3272) + local6;
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	@Override
	protected void method7999(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt9343 < 3) {
			@Pc(119) int local119 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local119 < 0) {
				throw new IllegalStateException(String.valueOf(local119));
			}
			if (super.anInt9343 == 2) {
				if (this.aVorbisInfo1.channels > 2 || this.aVorbisInfo1.channels < 1) {
					throw new RuntimeException(String.valueOf(this.aVorbisInfo1.channels));
				}
				this.aDSPState1 = new DSPState(this.aVorbisInfo1);
				this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
				this.aClass208_1 = new Class208(this.aVorbisInfo1.rate, Static168.anInt3272);
				this.aClass3_Sub3_Sub2_1 = new Class3_Sub3_Sub2(this.aVorbisInfo1.channels);
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(29) float[][] local29 = this.aDSPState1.pcmOut(this.aVorbisInfo1.channels);
		this.aDouble8 = this.aDSPState1.granuleTime();
		if (this.aDouble8 == -1.0D) {
			this.aDouble8 = (double) ((float) this.anInt4974 / (float) this.aVorbisInfo1.rate);
		}
		this.aDSPState1.read(local29[0].length);
		this.anInt4974 += local29[0].length;
		@Pc(77) Class3_Sub7_Sub11 local77 = this.aClass3_Sub3_Sub2_1.method2568(local29[0].length, this.aDouble8);
		Static59.method1042(local77.aShortArrayArray4, local29);
		for (@Pc(85) int local85 = 0; local85 < this.aVorbisInfo1.channels; local85++) {
			local77.aShortArrayArray4[local85] = this.aClass208_1.method5388(local77.aShortArrayArray4[local85]);
		}
		this.aClass3_Sub3_Sub2_1.method2574(local77);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(B)V")
	@Override
	public void method7994() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.b();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.b();
		}
		this.aVorbisComment1.b();
		this.aVorbisInfo1.b();
		if (this.aClass3_Sub3_Sub2_1 != null) {
			this.aClass3_Sub3_Sub2_1.method2569();
		}
	}

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "(B)Lclient!fea;")
	public Class3_Sub3_Sub2 method4284() {
		return this.aClass3_Sub3_Sub2_1;
	}
}
