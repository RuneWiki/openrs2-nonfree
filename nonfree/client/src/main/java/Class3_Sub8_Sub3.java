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

@OriginalClass("client!tb")
public final class Class3_Sub8_Sub3 extends Class3_Sub8 {

	@OriginalMember(owner = "client!tb", name = "B", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	private DSPState aDSPState1;

	@OriginalMember(owner = "client!tb", name = "x", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	private VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!tb", name = "y", descriptor = "Lclient!om;")
	private Class272 aClass272_2;

	@OriginalMember(owner = "client!tb", name = "E", descriptor = "Lclient!pp;")
	private Class3_Sub22_Sub3 aClass3_Sub22_Sub3_1;

	@OriginalMember(owner = "client!tb", name = "I", descriptor = "D")
	private double aDouble24;

	@OriginalMember(owner = "client!tb", name = "G", descriptor = "I")
	private int anInt9816;

	@OriginalMember(owner = "client!tb", name = "D", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	private final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!tb", name = "H", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	private final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub8_Sub3(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method9112(@OriginalArg(1) OggPacket arg0) {
		if (super.anInt10908 < 3) {
			@Pc(16) int local16 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local16 < 0) {
				throw new IllegalStateException(String.valueOf(local16));
			}
			if (super.anInt10908 == 2) {
				if (this.aVorbisInfo1.channels > 2 || this.aVorbisInfo1.channels < 1) {
					throw new RuntimeException(String.valueOf(this.aVorbisInfo1.channels));
				}
				this.aDSPState1 = new DSPState(this.aVorbisInfo1);
				this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
				this.aClass272_2 = new Class272(this.aVorbisInfo1.rate, Static103.anInt1658);
				this.aClass3_Sub22_Sub3_1 = new Class3_Sub22_Sub3(this.aVorbisInfo1.channels);
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(108) float[][] local108 = this.aDSPState1.pcmOut(this.aVorbisInfo1.channels);
		this.aDouble24 = this.aDSPState1.granuleTime();
		if (this.aDouble24 == -1.0D) {
			this.aDouble24 = (double) ((float) this.anInt9816 / (float) this.aVorbisInfo1.rate);
		}
		this.aDSPState1.read(local108[0].length);
		this.anInt9816 += local108[0].length;
		@Pc(160) Class3_Sub4_Sub12 local160 = this.aClass3_Sub22_Sub3_1.method7188(local108[0].length, this.aDouble24);
		Static280.method4254(local160.aShortArrayArray3, local108);
		for (@Pc(168) int local168 = 0; local168 < this.aVorbisInfo1.channels; local168++) {
			local160.aShortArrayArray3[local168] = this.aClass272_2.method6850(local160.aShortArrayArray3[local168]);
		}
		this.aClass3_Sub22_Sub3_1.method7189(local160);
	}

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "(B)I")
	public int method8285() {
		return this.aClass3_Sub22_Sub3_1 == null ? 0 : this.aClass3_Sub22_Sub3_1.method7190();
	}

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)Lclient!pp;")
	public Class3_Sub22_Sub3 method8287() {
		return this.aClass3_Sub22_Sub3_1;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	@Override
	public void method9114() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.b();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.b();
		}
		this.aVorbisComment1.b();
		this.aVorbisInfo1.b();
		if (this.aClass3_Sub22_Sub3_1 != null) {
			this.aClass3_Sub22_Sub3_1.method7192();
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)D")
	public double method8289() {
		@Pc(6) double local6 = this.aDouble24;
		if (this.aClass3_Sub22_Sub3_1 != null) {
			local6 = this.aClass3_Sub22_Sub3_1.method7185();
			if (local6 < 0.0D) {
				local6 = this.aDouble24;
			}
		}
		return local6 - (double) (256.0F / (float) Static103.anInt1658);
	}
}
