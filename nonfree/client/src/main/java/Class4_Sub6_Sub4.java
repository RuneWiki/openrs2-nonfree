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

@OriginalClass("client!qf")
public final class Class4_Sub6_Sub4 extends Class4_Sub6 {

	@OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
	private int anInt7632;

	@OriginalMember(owner = "client!qf", name = "s", descriptor = "Lclient!wp;")
	private Class391 aClass391_2;

	@OriginalMember(owner = "client!qf", name = "v", descriptor = "Lclient!kb;")
	private Class4_Sub3_Sub2 aClass4_Sub3_Sub2_1;

	@OriginalMember(owner = "client!qf", name = "w", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	private DSPState aDSPState1;

	@OriginalMember(owner = "client!qf", name = "y", descriptor = "D")
	private double aDouble26;

	@OriginalMember(owner = "client!qf", name = "C", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	private VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!qf", name = "D", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	private final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!qf", name = "E", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	private final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class4_Sub6_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	@Override
	public void method6631() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.a();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.a();
		}
		this.aVorbisComment1.a();
		this.aVorbisInfo1.a();
		if (this.aClass4_Sub3_Sub2_1 != null) {
			this.aClass4_Sub3_Sub2_1.method4224();
		}
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)D")
	public double method6636() {
		@Pc(6) double local6 = this.aDouble26;
		if (this.aClass4_Sub3_Sub2_1 != null) {
			local6 = this.aClass4_Sub3_Sub2_1.method4223();
			if (local6 < 0.0D) {
				local6 = this.aDouble26;
			}
		}
		return (double) -(256.0F / (float) Static434.anInt6851) + local6;
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(B)I")
	public int method6638() {
		return this.aClass4_Sub3_Sub2_1 == null ? 0 : this.aClass4_Sub3_Sub2_1.method4216();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method6634(@OriginalArg(1) OggPacket arg0) {
		if (super.anInt7625 < 3) {
			@Pc(23) int local23 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local23 < 0) {
				throw new IllegalStateException(String.valueOf(local23));
			}
			if (super.anInt7625 == 2) {
				if (this.aVorbisInfo1.channels <= 2 && this.aVorbisInfo1.channels >= 1) {
					this.aDSPState1 = new DSPState(this.aVorbisInfo1);
					this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
					this.aClass391_2 = new Class391(this.aVorbisInfo1.rate, Static434.anInt6851);
					this.aClass4_Sub3_Sub2_1 = new Class4_Sub3_Sub2(this.aVorbisInfo1.channels);
					return;
				}
				throw new RuntimeException(String.valueOf(this.aVorbisInfo1.channels));
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(107) float[][] local107 = this.aDSPState1.pcmOut(this.aVorbisInfo1.channels);
		this.aDouble26 = this.aDSPState1.granuleTime();
		if (this.aDouble26 == -1.0D) {
			this.aDouble26 = (double) ((float) this.anInt7632 / (float) this.aVorbisInfo1.rate);
		}
		this.aDSPState1.read(local107[0].length);
		this.anInt7632 += local107[0].length;
		@Pc(155) Class4_Sub5_Sub13 local155 = this.aClass4_Sub3_Sub2_1.method4222(local107[0].length, this.aDouble26);
		Static20.method477(local107, local155.aShortArrayArray11);
		for (@Pc(165) int local165 = 0; local165 < this.aVorbisInfo1.channels; local165++) {
			local155.aShortArrayArray11[local165] = this.aClass391_2.method8934(local155.aShortArrayArray11[local165]);
		}
		this.aClass4_Sub3_Sub2_1.method4218(local155);
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(B)Lclient!kb;")
	public Class4_Sub3_Sub2 method6640() {
		return this.aClass4_Sub3_Sub2_1;
	}
}
