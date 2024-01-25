import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.DecoderContext;
import jagtheora.theora.Frame;
import jagtheora.theora.GranulePos;
import jagtheora.theora.SetupInfo;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fda")
public final class Class2_Sub16_Sub2 extends Class2_Sub16 {

	@OriginalMember(owner = "client!fda", name = "p", descriptor = "Z")
	private boolean aBoolean284;

	@OriginalMember(owner = "client!fda", name = "q", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!fda", name = "r", descriptor = "Z")
	private boolean aBoolean285;

	@OriginalMember(owner = "client!fda", name = "u", descriptor = "Lclient!jagtheora/theora/GranulePos;")
	private GranulePos aGranulePos1;

	@OriginalMember(owner = "client!fda", name = "v", descriptor = "I")
	private int anInt3367;

	@OriginalMember(owner = "client!fda", name = "w", descriptor = "Lclient!jagtheora/theora/Frame;")
	private Frame aFrame1;

	@OriginalMember(owner = "client!fda", name = "A", descriptor = "Lclient!kr;")
	private Class20 aClass20_5;

	@OriginalMember(owner = "client!fda", name = "B", descriptor = "I")
	private int anInt3370;

	@OriginalMember(owner = "client!fda", name = "G", descriptor = "Lclient!jagtheora/theora/DecoderContext;")
	private DecoderContext aDecoderContext1;

	@OriginalMember(owner = "client!fda", name = "H", descriptor = "Z")
	private boolean aBoolean286;

	@OriginalMember(owner = "client!fda", name = "I", descriptor = "Z")
	private boolean aBoolean287;

	@OriginalMember(owner = "client!fda", name = "L", descriptor = "J")
	private long aLong92;

	@OriginalMember(owner = "client!fda", name = "s", descriptor = "Lclient!jagtheora/theora/SetupInfo;")
	private final SetupInfo aSetupInfo1 = new SetupInfo();

	@OriginalMember(owner = "client!fda", name = "K", descriptor = "Lclient!jagtheora/theora/TheoraInfo;")
	private final TheoraInfo aTheoraInfo1 = new TheoraInfo();

	@OriginalMember(owner = "client!fda", name = "P", descriptor = "Lclient!jagtheora/theora/TheoraComment;")
	private final TheoraComment aTheoraComment1 = new TheoraComment();

	@OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub16_Sub2(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Z)F")
	public float method2806() {
		return this.aBoolean287 && !this.aTheoraInfo1.a() ? (float) this.aTheoraInfo1.fpsNumerator / (float) this.aTheoraInfo1.fpsDenominator : 0.0F;
	}

	@OriginalMember(owner = "client!fda", name = "c", descriptor = "(I)D")
	public double method2809() {
		return this.aDouble4;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V")
	@Override
	public void method6550() {
		if (this.aFrame1 != null) {
			this.aFrame1.b();
		}
		if (this.aDecoderContext1 != null) {
			this.aDecoderContext1.b();
			this.aDecoderContext1 = null;
		}
		if (this.aGranulePos1 != null) {
			this.aGranulePos1.b();
			this.aGranulePos1 = null;
		}
		this.aTheoraInfo1.b();
		this.aTheoraComment1.b();
		this.aSetupInfo1.b();
	}

	@OriginalMember(owner = "client!fda", name = "g", descriptor = "(I)Z")
	public boolean method2812() {
		return this.aBoolean287;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(ILclient!ha;)Lclient!kr;")
	public Class20 method2813(@OriginalArg(1) Class87 arg0) {
		if (this.aFrame1 == null) {
			return null;
		} else if (this.aBoolean284 || this.aClass20_5 == null) {
			this.aClass20_5 = arg0.method7956(this.aFrame1.pixels, this.aFrame1.a, this.aFrame1.a, this.aFrame1.b, false);
			this.aBoolean284 = false;
			return this.aClass20_5;
		} else {
			return this.aClass20_5;
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(ZLclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method6552(@OriginalArg(1) OggPacket arg0) {
		@Pc(21) int local21;
		if (!this.aBoolean287) {
			local21 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local21 == 0) {
				this.aBoolean287 = true;
				if (this.aTheoraInfo1.frameWidth > 2048 || this.aTheoraInfo1.frameHeight > 1024) {
					throw new IllegalStateException();
				}
				this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
				this.aGranulePos1 = new GranulePos();
				this.aFrame1 = new Frame(this.aTheoraInfo1.frameWidth, this.aTheoraInfo1.frameHeight);
				this.anInt3367 = this.aDecoderContext1.getMaxPostProcessingLevel();
				this.method2815(this.anInt3370);
			} else if (local21 < 0) {
				throw new IllegalStateException(String.valueOf(local21));
			}
			return;
		}
		this.aLong92 = Static438.method6517();
		local21 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local21 < 0) {
			throw new IllegalStateException(String.valueOf(local21));
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble4 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean286) {
			@Pc(56) boolean local56 = arg0.isKeyFrame() == 1;
			if (!local56) {
				return;
			}
			this.aBoolean286 = false;
		}
		if (!this.aBoolean285 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame1) != 0) {
				throw new IllegalStateException(String.valueOf(local21));
			}
			this.aBoolean284 = true;
		}
	}

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "(Z)J")
	public long method2814() {
		return this.aLong92;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(II)V")
	private void method2815(@OriginalArg(1) int arg0) {
		this.anInt3370 = arg0;
		if (!this.aBoolean287) {
			return;
		}
		if (this.anInt3367 < this.anInt3370) {
			this.anInt3370 = this.anInt3367;
		}
		if (this.anInt3370 < 0) {
			this.anInt3370 = 0;
		}
		this.aDecoderContext1.setPostProcessingLevel(this.anInt3370);
	}
}
