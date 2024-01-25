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

@OriginalClass("client!waa")
public final class Class14_Sub27_Sub4 extends Class14_Sub27 {

	@OriginalMember(owner = "client!waa", name = "u", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	private VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!waa", name = "y", descriptor = "I")
	private int anInt10866;

	@OriginalMember(owner = "client!waa", name = "z", descriptor = "Lclient!hn;")
	private Class147 aClass147_2;

	@OriginalMember(owner = "client!waa", name = "B", descriptor = "D")
	private double aDouble23;

	@OriginalMember(owner = "client!waa", name = "C", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	private DSPState aDSPState1;

	@OriginalMember(owner = "client!waa", name = "F", descriptor = "Lclient!b;")
	private Class14_Sub5_Sub1 aClass14_Sub5_Sub1_1;

	@OriginalMember(owner = "client!waa", name = "t", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	private final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!waa", name = "r", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	private final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class14_Sub27_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Z)Lclient!b;")
	public Class14_Sub5_Sub1 method9055() {
		return this.aClass14_Sub5_Sub1_1;
	}

	@OriginalMember(owner = "client!waa", name = "d", descriptor = "(B)I")
	public int method9056() {
		return this.aClass14_Sub5_Sub1_1 == null ? 0 : this.aClass14_Sub5_Sub1_1.method659();
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	@Override
	protected void method9050(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt10860 < 3) {
			@Pc(132) int local132 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local132 < 0) {
				throw new IllegalStateException(String.valueOf(local132));
			} else if (super.anInt10860 == 2) {
				if (this.aVorbisInfo1.channels > 2 || this.aVorbisInfo1.channels < 1) {
					throw new RuntimeException(String.valueOf(this.aVorbisInfo1.channels));
				}
				this.aDSPState1 = new DSPState(this.aVorbisInfo1);
				this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
				this.aClass147_2 = new Class147(this.aVorbisInfo1.rate, Static515.anInt9036);
				this.aClass14_Sub5_Sub1_1 = new Class14_Sub5_Sub1(this.aVorbisInfo1.channels);
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(39) float[][] local39 = this.aDSPState1.pcmOut(this.aVorbisInfo1.channels);
		this.aDouble23 = this.aDSPState1.granuleTime();
		if (this.aDouble23 == -1.0D) {
			this.aDouble23 = (double) ((float) this.anInt10866 / (float) this.aVorbisInfo1.rate);
		}
		this.aDSPState1.read(local39[0].length);
		this.anInt10866 += local39[0].length;
		@Pc(87) Class14_Sub3_Sub5 local87 = this.aClass14_Sub5_Sub1_1.method652(local39[0].length, this.aDouble23);
		Static281.method4057(local87.aShortArrayArray5, local39);
		for (@Pc(95) int local95 = 0; local95 < this.aVorbisInfo1.channels; local95++) {
			local87.aShortArrayArray5[local95] = this.aClass147_2.method3461(local87.aShortArrayArray5[local95]);
		}
		this.aClass14_Sub5_Sub1_1.method648(local87);
	}

	@OriginalMember(owner = "client!waa", name = "c", descriptor = "(I)D")
	public double method9060() {
		@Pc(6) double local6 = this.aDouble23;
		if (this.aClass14_Sub5_Sub1_1 != null) {
			local6 = this.aClass14_Sub5_Sub1_1.method653();
			if (local6 < 0.0D) {
				local6 = this.aDouble23;
			}
		}
		return local6 - (double) (256.0F / (float) Static515.anInt9036);
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)V")
	@Override
	public void method9051() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.b();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.b();
		}
		this.aVorbisComment1.b();
		this.aVorbisInfo1.b();
		if (this.aClass14_Sub5_Sub1_1 != null) {
			this.aClass14_Sub5_Sub1_1.method657();
		}
	}
}
