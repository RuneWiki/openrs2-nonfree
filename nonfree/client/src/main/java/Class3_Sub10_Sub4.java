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

@OriginalClass("client!qea")
public final class Class3_Sub10_Sub4 extends Class3_Sub10 {

	@OriginalMember(owner = "client!qea", name = "v", descriptor = "I")
	private int anInt8219;

	@OriginalMember(owner = "client!qea", name = "y", descriptor = "Lclient!wu;")
	private Class381 aClass381_1;

	@OriginalMember(owner = "client!qea", name = "z", descriptor = "D")
	private double aDouble51;

	@OriginalMember(owner = "client!qea", name = "A", descriptor = "Lclient!cf;")
	private Class3_Sub7_Sub2 aClass3_Sub7_Sub2_1;

	@OriginalMember(owner = "client!qea", name = "C", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	private DSPState aDSPState1;

	@OriginalMember(owner = "client!qea", name = "N", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	private VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!qea", name = "D", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	private final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!qea", name = "u", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	private final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub10_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "(I)I")
	public int method6834() {
		return this.aClass3_Sub7_Sub2_1 == null ? 0 : this.aClass3_Sub7_Sub2_1.method1339();
	}

	@OriginalMember(owner = "client!qea", name = "c", descriptor = "(I)D")
	public double method6835() {
		@Pc(10) double local10 = this.aDouble51;
		if (this.aClass3_Sub7_Sub2_1 != null) {
			local10 = this.aClass3_Sub7_Sub2_1.method1334();
			if (local10 < 0.0D) {
				local10 = this.aDouble51;
			}
		}
		return local10 - (double) (256.0F / (float) Static590.anInt9843);
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(Z)V")
	@Override
	public void method6830() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.b();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.b();
		}
		this.aVorbisComment1.b();
		this.aVorbisInfo1.b();
		if (this.aClass3_Sub7_Sub2_1 != null) {
			this.aClass3_Sub7_Sub2_1.method1338();
		}
	}

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method6831(@OriginalArg(1) OggPacket arg0) {
		if (super.anInt8214 < 3) {
			@Pc(22) int local22 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local22 < 0) {
				throw new IllegalStateException(String.valueOf(local22));
			}
			if (super.anInt8214 == 2) {
				if (this.aVorbisInfo1.channels <= 2 && this.aVorbisInfo1.channels >= 1) {
					this.aDSPState1 = new DSPState(this.aVorbisInfo1);
					this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
					this.aClass381_1 = new Class381(this.aVorbisInfo1.rate, Static590.anInt9843);
					this.aClass3_Sub7_Sub2_1 = new Class3_Sub7_Sub2(this.aVorbisInfo1.channels);
					return;
				}
				throw new RuntimeException(String.valueOf(this.aVorbisInfo1.channels));
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(106) float[][] local106 = this.aDSPState1.pcmOut(this.aVorbisInfo1.channels);
		this.aDouble51 = this.aDSPState1.granuleTime();
		if (this.aDouble51 == -1.0D) {
			this.aDouble51 = (float) this.anInt8219 / (float) this.aVorbisInfo1.rate;
		}
		this.aDSPState1.read(local106[0].length);
		this.anInt8219 += local106[0].length;
		@Pc(154) Class3_Sub1_Sub11 local154 = this.aClass3_Sub7_Sub2_1.method1336(local106[0].length, this.aDouble51);
		Static329.method5518(local154.aShortArrayArray8, local106);
		for (@Pc(162) int local162 = 0; local162 < this.aVorbisInfo1.channels; local162++) {
			local154.aShortArrayArray8[local162] = this.aClass381_1.method8656(local154.aShortArrayArray8[local162]);
		}
		this.aClass3_Sub7_Sub2_1.method1340(local154);
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(B)Lclient!cf;")
	public Class3_Sub7_Sub2 method6839() {
		return this.aClass3_Sub7_Sub2_1;
	}
}
