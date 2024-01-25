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

@OriginalClass("client!hq")
public final class Class6_Sub13_Sub2 extends Class6_Sub13 {

	@OriginalMember(owner = "client!hq", name = "x", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!hq", name = "z", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	private DSPState aDSPState1;

	@OriginalMember(owner = "client!hq", name = "A", descriptor = "I")
	private int anInt4322;

	@OriginalMember(owner = "client!hq", name = "B", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	private VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!hq", name = "C", descriptor = "Lclient!lk;")
	private Class194 aClass194_2;

	@OriginalMember(owner = "client!hq", name = "H", descriptor = "Lclient!hm;")
	private Class6_Sub3_Sub2 aClass6_Sub3_Sub2_1;

	@OriginalMember(owner = "client!hq", name = "t", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	private final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!hq", name = "v", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	private final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class6_Sub13_Sub2(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	@Override
	protected void method6907(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt8013 < 3) {
			@Pc(18) int local18 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local18 < 0) {
				throw new IllegalStateException(String.valueOf(local18));
			}
			if (super.anInt8013 == 2) {
				if (this.aVorbisInfo1.channels > 2 || this.aVorbisInfo1.channels < 1) {
					throw new RuntimeException(String.valueOf(this.aVorbisInfo1.channels));
				}
				this.aDSPState1 = new DSPState(this.aVorbisInfo1);
				this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
				this.aClass194_2 = new Class194(this.aVorbisInfo1.rate, Static78.anInt1661);
				this.aClass6_Sub3_Sub2_1 = new Class6_Sub3_Sub2(this.aVorbisInfo1.channels);
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(105) float[][] local105 = this.aDSPState1.pcmOut(this.aVorbisInfo1.channels);
		this.aDouble9 = this.aDSPState1.granuleTime();
		if (this.aDouble9 == -1.0D) {
			this.aDouble9 = (double) ((float) this.anInt4322 / (float) this.aVorbisInfo1.rate);
		}
		this.aDSPState1.read(local105[0].length);
		this.anInt4322 += local105[0].length;
		@Pc(153) Class6_Sub2_Sub8 local153 = this.aClass6_Sub3_Sub2_1.method3694(this.aDouble9, local105[0].length);
		Static356.method5700(local153.aShortArrayArray7, local105);
		for (@Pc(161) int local161 = 0; local161 < this.aVorbisInfo1.channels; local161++) {
			local153.aShortArrayArray7[local161] = this.aClass194_2.method5327(local153.aShortArrayArray7[local161]);
		}
		this.aClass6_Sub3_Sub2_1.method3692(local153);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
	@Override
	public void method6910() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.b();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.b();
		}
		this.aVorbisComment1.b();
		this.aVorbisInfo1.b();
		if (this.aClass6_Sub3_Sub2_1 != null) {
			this.aClass6_Sub3_Sub2_1.method3695();
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Z)I")
	public int method3751() {
		return this.aClass6_Sub3_Sub2_1 == null ? 0 : this.aClass6_Sub3_Sub2_1.method3696();
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(B)D")
	public double method3752() {
		@Pc(12) double local12 = this.aDouble9;
		if (this.aClass6_Sub3_Sub2_1 != null) {
			local12 = this.aClass6_Sub3_Sub2_1.method3685();
			if (local12 < 0.0D) {
				local12 = this.aDouble9;
			}
		}
		return (double) -(256.0F / (float) Static78.anInt1661) + local12;
	}

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "(B)Lclient!hm;")
	public Class6_Sub3_Sub2 method3754() {
		return this.aClass6_Sub3_Sub2_1;
	}
}
