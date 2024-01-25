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

@OriginalClass("client!jm")
public final class Class2_Sub5_Sub1 extends Class2_Sub5 {

	@OriginalMember(owner = "client!jm", name = "A", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	private DSPState aDSPState1;

	@OriginalMember(owner = "client!jm", name = "B", descriptor = "Lclient!pe;")
	private Class257 aClass257_2;

	@OriginalMember(owner = "client!jm", name = "C", descriptor = "Lclient!iha;")
	private Class2_Sub8_Sub2 aClass2_Sub8_Sub2_1;

	@OriginalMember(owner = "client!jm", name = "H", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	private VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!jm", name = "I", descriptor = "I")
	private int anInt5704;

	@OriginalMember(owner = "client!jm", name = "M", descriptor = "D")
	private double aDouble11;

	@OriginalMember(owner = "client!jm", name = "N", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	private final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!jm", name = "J", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	private final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub5_Sub1(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)I")
	public int method4932() {
		return this.aClass2_Sub8_Sub2_1 == null ? 0 : this.aClass2_Sub8_Sub2_1.method4482();
	}

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "(I)Lclient!iha;")
	public Class2_Sub8_Sub2 method4934() {
		return this.aClass2_Sub8_Sub2_1;
	}

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "(B)D")
	public double method4936() {
		@Pc(6) double local6 = this.aDouble11;
		if (this.aClass2_Sub8_Sub2_1 != null) {
			local6 = this.aClass2_Sub8_Sub2_1.method4490();
			if (local6 < 0.0D) {
				local6 = this.aDouble11;
			}
		}
		return (double) -(256.0F / (float) Static215.anInt4848) + local6;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V")
	@Override
	public void method8257() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.a();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.a();
		}
		this.aVorbisComment1.a();
		this.aVorbisInfo1.a();
		if (this.aClass2_Sub8_Sub2_1 != null) {
			this.aClass2_Sub8_Sub2_1.method4489();
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method8260(@OriginalArg(1) OggPacket arg0) {
		if (super.anInt9926 < 3) {
			@Pc(18) int local18 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local18 < 0) {
				throw new IllegalStateException(String.valueOf(local18));
			}
			if (super.anInt9926 == 2) {
				if (this.aVorbisInfo1.channels > 2 || this.aVorbisInfo1.channels < 1) {
					throw new RuntimeException(String.valueOf(this.aVorbisInfo1.channels));
				}
				this.aDSPState1 = new DSPState(this.aVorbisInfo1);
				this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
				this.aClass257_2 = new Class257(this.aVorbisInfo1.rate, Static215.anInt4848);
				this.aClass2_Sub8_Sub2_1 = new Class2_Sub8_Sub2(this.aVorbisInfo1.channels);
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(100) float[][] local100 = this.aDSPState1.pcmOut(this.aVorbisInfo1.channels);
		this.aDouble11 = this.aDSPState1.granuleTime();
		if (this.aDouble11 == -1.0D) {
			this.aDouble11 = (float) this.anInt5704 / (float) this.aVorbisInfo1.rate;
		}
		this.aDSPState1.read(local100[0].length);
		this.anInt5704 += local100[0].length;
		@Pc(148) Class2_Sub6_Sub15 local148 = this.aClass2_Sub8_Sub2_1.method4491(local100[0].length, this.aDouble11);
		Static122.method8784(local148.aShortArrayArray21, local100);
		for (@Pc(156) int local156 = 0; local156 < this.aVorbisInfo1.channels; local156++) {
			local148.aShortArrayArray21[local156] = this.aClass257_2.method6787(local148.aShortArrayArray21[local156]);
		}
		this.aClass2_Sub8_Sub2_1.method4488(local148);
	}
}
