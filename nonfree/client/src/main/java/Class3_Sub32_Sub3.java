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

@OriginalClass("client!oo")
public final class Class3_Sub32_Sub3 extends Class3_Sub32 {

	@OriginalMember(owner = "client!oo", name = "E", descriptor = "Lclient!jagtheora/theora/GranulePos;")
	private GranulePos aGranulePos1;

	@OriginalMember(owner = "client!oo", name = "p", descriptor = "Lclient!jagtheora/theora/Frame;")
	private Frame aFrame1;

	@OriginalMember(owner = "client!oo", name = "C", descriptor = "J")
	private long aLong248;

	@OriginalMember(owner = "client!oo", name = "r", descriptor = "I")
	private int anInt7463;

	@OriginalMember(owner = "client!oo", name = "O", descriptor = "D")
	private double aDouble17;

	@OriginalMember(owner = "client!oo", name = "Q", descriptor = "Lclient!kw;")
	private Class178 aClass178_20;

	@OriginalMember(owner = "client!oo", name = "N", descriptor = "Z")
	private boolean aBoolean501;

	@OriginalMember(owner = "client!oo", name = "R", descriptor = "Lclient!jagtheora/theora/DecoderContext;")
	private DecoderContext aDecoderContext1;

	@OriginalMember(owner = "client!oo", name = "B", descriptor = "Z")
	private boolean aBoolean502;

	@OriginalMember(owner = "client!oo", name = "x", descriptor = "Z")
	private boolean aBoolean503;

	@OriginalMember(owner = "client!oo", name = "z", descriptor = "Z")
	private boolean aBoolean504;

	@OriginalMember(owner = "client!oo", name = "F", descriptor = "I")
	private int anInt7471;

	@OriginalMember(owner = "client!oo", name = "P", descriptor = "Lclient!jagtheora/theora/SetupInfo;")
	private final SetupInfo aSetupInfo1 = new SetupInfo();

	@OriginalMember(owner = "client!oo", name = "I", descriptor = "Lclient!jagtheora/theora/TheoraInfo;")
	private final TheoraInfo aTheoraInfo1 = new TheoraInfo();

	@OriginalMember(owner = "client!oo", name = "v", descriptor = "Lclient!jagtheora/theora/TheoraComment;")
	private final TheoraComment aTheoraComment1 = new TheoraComment();

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub32_Sub3(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)V")
	private void method6446(@OriginalArg(0) int arg0) {
		this.anInt7471 = arg0;
		if (!this.aBoolean502) {
			return;
		}
		if (this.anInt7471 > this.anInt7463) {
			this.anInt7471 = this.anInt7463;
		}
		if (this.anInt7471 < 0) {
			this.anInt7471 = 0;
		}
		this.aDecoderContext1.setPostProcessingLevel(this.anInt7471);
	}

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "(B)J")
	public long method6447() {
		return this.aLong248;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZLclient!ha;)Lclient!kw;")
	public Class178 method6448(@OriginalArg(1) Class22 arg0) {
		if (this.aFrame1 == null) {
			return null;
		} else if (this.aBoolean501 || this.aClass178_20 == null) {
			this.aClass178_20 = arg0.method9322(this.aFrame1.pixels, this.aFrame1.b, this.aFrame1.b, this.aFrame1.a, false);
			this.aBoolean501 = false;
			return this.aClass178_20;
		} else {
			return this.aClass178_20;
		}
	}

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "(I)Z")
	public boolean method6449() {
		return this.aBoolean502;
	}

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "(I)D")
	public double method6451() {
		return this.aDouble17;
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(B)F")
	public float method6453() {
		return this.aBoolean502 && !this.aTheoraInfo1.b() ? (float) this.aTheoraInfo1.fpsNumerator / (float) this.aTheoraInfo1.fpsDenominator : 0.0F;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	@Override
	protected void method8587(@OriginalArg(0) OggPacket arg0) {
		@Pc(17) int local17;
		if (!this.aBoolean502) {
			local17 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local17 == 0) {
				this.aBoolean502 = true;
				if (this.aTheoraInfo1.frameWidth > 2048 || this.aTheoraInfo1.frameHeight > 1024) {
					throw new IllegalStateException();
				}
				this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
				this.aGranulePos1 = new GranulePos();
				this.aFrame1 = new Frame(this.aTheoraInfo1.frameWidth, this.aTheoraInfo1.frameHeight);
				this.anInt7463 = this.aDecoderContext1.getMaxPostProcessingLevel();
				this.method6446(this.anInt7471);
			} else if (local17 < 0) {
				throw new IllegalStateException(String.valueOf(local17));
			}
			return;
		}
		this.aLong248 = Static517.method6965();
		local17 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local17 < 0) {
			throw new IllegalStateException(String.valueOf(local17));
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble17 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean504) {
			@Pc(146) boolean local146 = arg0.isKeyFrame() == 1;
			if (!local146) {
				return;
			}
			this.aBoolean504 = false;
		}
		if (!this.aBoolean503 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame1) != 0) {
				throw new IllegalStateException(String.valueOf(local17));
			}
			this.aBoolean501 = true;
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)V")
	@Override
	public void method8590() {
		if (this.aFrame1 != null) {
			this.aFrame1.a();
		}
		if (this.aDecoderContext1 != null) {
			this.aDecoderContext1.a();
			this.aDecoderContext1 = null;
		}
		if (this.aGranulePos1 != null) {
			this.aGranulePos1.a();
			this.aGranulePos1 = null;
		}
		this.aTheoraInfo1.a();
		this.aTheoraComment1.a();
		this.aSetupInfo1.a();
	}
}
