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

@OriginalClass("client!wda")
public final class Class2_Sub7_Sub4 extends Class2_Sub7 {

	@OriginalMember(owner = "client!wda", name = "q", descriptor = "I")
	private int anInt9988;

	@OriginalMember(owner = "client!wda", name = "s", descriptor = "Lclient!md;")
	private Class217 aClass217_2;

	@OriginalMember(owner = "client!wda", name = "t", descriptor = "D")
	private double aDouble53;

	@OriginalMember(owner = "client!wda", name = "u", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	private VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!wda", name = "z", descriptor = "Lclient!vp;")
	private Class2_Sub13_Sub5 aClass2_Sub13_Sub5_1;

	@OriginalMember(owner = "client!wda", name = "C", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	private DSPState aDSPState1;

	@OriginalMember(owner = "client!wda", name = "E", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	private final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!wda", name = "y", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	private final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub7_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(I)I")
	public int method8319() {
		return this.aClass2_Sub13_Sub5_1 == null ? 0 : this.aClass2_Sub13_Sub5_1.method8183();
	}

	@OriginalMember(owner = "client!wda", name = "f", descriptor = "(I)D")
	public double method8320() {
		@Pc(6) double local6 = this.aDouble53;
		if (this.aClass2_Sub13_Sub5_1 != null) {
			local6 = this.aClass2_Sub13_Sub5_1.method8188();
			if (local6 < 0.0D) {
				local6 = this.aDouble53;
			}
		}
		return local6 - (double) (256.0F / (float) Static283.anInt7446);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(B)Lclient!vp;")
	public Class2_Sub13_Sub5 method8322() {
		return this.aClass2_Sub13_Sub5_1;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	@Override
	protected void method8314(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt9987 < 3) {
			@Pc(125) int local125 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local125 < 0) {
				throw new IllegalStateException(String.valueOf(local125));
			} else if (super.anInt9987 == 2) {
				if (this.aVorbisInfo1.channels > 2 || this.aVorbisInfo1.channels < 1) {
					throw new RuntimeException(String.valueOf(this.aVorbisInfo1.channels));
				}
				this.aDSPState1 = new DSPState(this.aVorbisInfo1);
				this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
				this.aClass217_2 = new Class217(this.aVorbisInfo1.rate, Static283.anInt7446);
				this.aClass2_Sub13_Sub5_1 = new Class2_Sub13_Sub5(this.aVorbisInfo1.channels);
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(32) float[][] local32 = this.aDSPState1.pcmOut(this.aVorbisInfo1.channels);
		this.aDouble53 = this.aDSPState1.granuleTime();
		if (this.aDouble53 == -1.0D) {
			this.aDouble53 = (float) this.anInt9988 / (float) this.aVorbisInfo1.rate;
		}
		this.aDSPState1.read(local32[0].length);
		this.anInt9988 += local32[0].length;
		@Pc(80) Class2_Sub2_Sub17 local80 = this.aClass2_Sub13_Sub5_1.method8184(this.aDouble53, local32[0].length);
		Static567.method7773(local80.aShortArrayArray24, local32);
		for (@Pc(88) int local88 = 0; local88 < this.aVorbisInfo1.channels; local88++) {
			local80.aShortArrayArray24[local88] = this.aClass217_2.method4588(local80.aShortArrayArray24[local88]);
		}
		this.aClass2_Sub13_Sub5_1.method8189(local80);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)V")
	@Override
	public void method8318() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.a();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.a();
		}
		this.aVorbisComment1.a();
		this.aVorbisInfo1.a();
		if (this.aClass2_Sub13_Sub5_1 != null) {
			this.aClass2_Sub13_Sub5_1.method8190();
		}
	}
}
