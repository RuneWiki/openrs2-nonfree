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

@OriginalClass("client!wm")
public final class Class3_Sub6_Sub4 extends Class3_Sub6 {

	@OriginalMember(owner = "client!wm", name = "t", descriptor = "D")
	private double aDouble36;

	@OriginalMember(owner = "client!wm", name = "v", descriptor = "I")
	private int anInt10141;

	@OriginalMember(owner = "client!wm", name = "x", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	private VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!wm", name = "y", descriptor = "Lclient!et;")
	private Class97 aClass97_2;

	@OriginalMember(owner = "client!wm", name = "B", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	private DSPState aDSPState1;

	@OriginalMember(owner = "client!wm", name = "D", descriptor = "Lclient!pm;")
	private Class3_Sub7_Sub4 aClass3_Sub7_Sub4_1;

	@OriginalMember(owner = "client!wm", name = "A", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	private final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!wm", name = "E", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	private final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub6_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(B)I")
	public int method8693() {
		return this.aClass3_Sub7_Sub4_1 == null ? 0 : this.aClass3_Sub7_Sub4_1.method6825();
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
	@Override
	public void method8689() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.b();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.b();
		}
		this.aVorbisComment1.b();
		this.aVorbisInfo1.b();
		if (this.aClass3_Sub7_Sub4_1 != null) {
			this.aClass3_Sub7_Sub4_1.method6827();
		}
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)D")
	public double method8694() {
		@Pc(11) double local11 = this.aDouble36;
		if (this.aClass3_Sub7_Sub4_1 != null) {
			local11 = this.aClass3_Sub7_Sub4_1.method6831();
			if (local11 < 0.0D) {
				local11 = this.aDouble36;
			}
		}
		return (double) -(256.0F / (float) Static276.anInt4980) + local11;
	}

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "(B)Lclient!pm;")
	public Class3_Sub7_Sub4 method8695() {
		return this.aClass3_Sub7_Sub4_1;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;Z)V")
	@Override
	protected void method8692(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt10134 < 3) {
			@Pc(22) int local22 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local22 < 0) {
				throw new IllegalStateException(String.valueOf(local22));
			}
			if (super.anInt10134 == 2) {
				if (this.aVorbisInfo1.channels <= 2 && this.aVorbisInfo1.channels >= 1) {
					this.aDSPState1 = new DSPState(this.aVorbisInfo1);
					this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
					this.aClass97_2 = new Class97(this.aVorbisInfo1.rate, Static276.anInt4980);
					this.aClass3_Sub7_Sub4_1 = new Class3_Sub7_Sub4(this.aVorbisInfo1.channels);
					return;
				}
				throw new RuntimeException(String.valueOf(this.aVorbisInfo1.channels));
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(110) float[][] local110 = this.aDSPState1.pcmOut(this.aVorbisInfo1.channels);
		this.aDouble36 = this.aDSPState1.granuleTime();
		if (this.aDouble36 == -1.0D) {
			this.aDouble36 = (float) this.anInt10141 / (float) this.aVorbisInfo1.rate;
		}
		this.aDSPState1.read(local110[0].length);
		this.anInt10141 += local110[0].length;
		@Pc(158) Class3_Sub4_Sub7 local158 = this.aClass3_Sub7_Sub4_1.method6823(this.aDouble36, local110[0].length);
		Static320.method5249(local158.aShortArrayArray6, local110);
		for (@Pc(166) int local166 = 0; local166 < this.aVorbisInfo1.channels; local166++) {
			local158.aShortArrayArray6[local166] = this.aClass97_2.method2575(local158.aShortArrayArray6[local166]);
		}
		this.aClass3_Sub7_Sub4_1.method6824(local158);
	}
}
