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

@OriginalClass("client!ml")
public final class Class5_Sub34_Sub1 extends Class5_Sub34 {

	@OriginalMember(owner = "client!ml", name = "v", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	private VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!ml", name = "y", descriptor = "Lclient!gaa;")
	private Class114 aClass114_3;

	@OriginalMember(owner = "client!ml", name = "A", descriptor = "D")
	private double aDouble13;

	@OriginalMember(owner = "client!ml", name = "B", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	private DSPState aDSPState1;

	@OriginalMember(owner = "client!ml", name = "D", descriptor = "Lclient!sfa;")
	private Class5_Sub1_Sub3 aClass5_Sub1_Sub3_1;

	@OriginalMember(owner = "client!ml", name = "G", descriptor = "I")
	private int anInt5856;

	@OriginalMember(owner = "client!ml", name = "x", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	private final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!ml", name = "F", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	private final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class5_Sub34_Sub1(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)D")
	public double method5203() {
		@Pc(11) double local11 = this.aDouble13;
		if (this.aClass5_Sub1_Sub3_1 != null) {
			local11 = this.aClass5_Sub1_Sub3_1.method7610();
			if (local11 < 0.0D) {
				local11 = this.aDouble13;
			}
		}
		return (double) -(256.0F / (float) Static491.anInt8290) + local11;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	@Override
	protected void method8629(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt10097 < 3) {
			@Pc(125) int local125 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local125 < 0) {
				throw new IllegalStateException(String.valueOf(local125));
			} else if (super.anInt10097 == 2) {
				if (this.aVorbisInfo1.channels > 2 || this.aVorbisInfo1.channels < 1) {
					throw new RuntimeException(String.valueOf(this.aVorbisInfo1.channels));
				}
				this.aDSPState1 = new DSPState(this.aVorbisInfo1);
				this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
				this.aClass114_3 = new Class114(this.aVorbisInfo1.rate, Static491.anInt8290);
				this.aClass5_Sub1_Sub3_1 = new Class5_Sub1_Sub3(this.aVorbisInfo1.channels);
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(32) float[][] local32 = this.aDSPState1.pcmOut(this.aVorbisInfo1.channels);
		this.aDouble13 = this.aDSPState1.granuleTime();
		if (this.aDouble13 == -1.0D) {
			this.aDouble13 = (float) this.anInt5856 / (float) this.aVorbisInfo1.rate;
		}
		this.aDSPState1.read(local32[0].length);
		this.anInt5856 += local32[0].length;
		@Pc(80) Class5_Sub5_Sub9 local80 = this.aClass5_Sub1_Sub3_1.method7609(local32[0].length, this.aDouble13);
		Static136.method2009(local32, local80.aShortArrayArray7);
		for (@Pc(88) int local88 = 0; local88 < this.aVorbisInfo1.channels; local88++) {
			local80.aShortArrayArray7[local88] = this.aClass114_3.method2483(local80.aShortArrayArray7[local88]);
		}
		this.aClass5_Sub1_Sub3_1.method7611(local80);
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(Z)I")
	public int method5205() {
		return this.aClass5_Sub1_Sub3_1 == null ? 0 : this.aClass5_Sub1_Sub3_1.method7612();
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)Lclient!sfa;")
	public Class5_Sub1_Sub3 method5206() {
		return this.aClass5_Sub1_Sub3_1;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	@Override
	public void method8632() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.a();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.a();
		}
		this.aVorbisComment1.a();
		this.aVorbisInfo1.a();
		if (this.aClass5_Sub1_Sub3_1 != null) {
			this.aClass5_Sub1_Sub3_1.method7614();
		}
	}
}
