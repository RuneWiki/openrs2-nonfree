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

@OriginalClass("client!sm")
public final class Class5_Sub9_Sub2 extends Class5_Sub9 {

	@OriginalMember(owner = "client!sm", name = "t", descriptor = "Lclient!pu;")
	private Class50 aClass50_33;

	@OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
	private int anInt8989;

	@OriginalMember(owner = "client!sm", name = "x", descriptor = "Z")
	private boolean aBoolean767;

	@OriginalMember(owner = "client!sm", name = "y", descriptor = "Z")
	private boolean aBoolean768;

	@OriginalMember(owner = "client!sm", name = "A", descriptor = "D")
	private double aDouble23;

	@OriginalMember(owner = "client!sm", name = "D", descriptor = "Lclient!jagtheora/theora/DecoderContext;")
	private DecoderContext aDecoderContext1;

	@OriginalMember(owner = "client!sm", name = "H", descriptor = "Lclient!jagtheora/theora/GranulePos;")
	private GranulePos aGranulePos1;

	@OriginalMember(owner = "client!sm", name = "K", descriptor = "I")
	private int anInt8996;

	@OriginalMember(owner = "client!sm", name = "N", descriptor = "Z")
	private boolean aBoolean769;

	@OriginalMember(owner = "client!sm", name = "O", descriptor = "Lclient!jagtheora/theora/Frame;")
	private Frame aFrame2;

	@OriginalMember(owner = "client!sm", name = "Q", descriptor = "J")
	private long aLong255;

	@OriginalMember(owner = "client!sm", name = "R", descriptor = "Z")
	private boolean aBoolean770;

	@OriginalMember(owner = "client!sm", name = "s", descriptor = "Lclient!jagtheora/theora/SetupInfo;")
	private final SetupInfo aSetupInfo1 = new SetupInfo();

	@OriginalMember(owner = "client!sm", name = "v", descriptor = "Lclient!jagtheora/theora/TheoraInfo;")
	private final TheoraInfo aTheoraInfo1 = new TheoraInfo();

	@OriginalMember(owner = "client!sm", name = "I", descriptor = "Lclient!jagtheora/theora/TheoraComment;")
	private final TheoraComment aTheoraComment1 = new TheoraComment();

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class5_Sub9_Sub2(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILclient!ha;)Lclient!pu;")
	public Class50 method7631(@OriginalArg(1) Class65 arg0) {
		if (this.aFrame2 == null) {
			return null;
		} else if (this.aBoolean770 || this.aClass50_33 == null) {
			this.aClass50_33 = arg0.method6933(this.aFrame2.pixels, this.aFrame2.a, this.aFrame2.a, this.aFrame2.b, false);
			this.aBoolean770 = false;
			return this.aClass50_33;
		} else {
			return this.aClass50_33;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
	@Override
	public void method8195() {
		if (this.aFrame2 != null) {
			this.aFrame2.b();
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

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)J")
	public long method7632() {
		return this.aLong255;
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)Z")
	public boolean method7634() {
		return this.aBoolean769;
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)V")
	private void method7635(@OriginalArg(1) int arg0) {
		this.anInt8996 = arg0;
		if (!this.aBoolean769) {
			return;
		}
		if (this.anInt8989 < this.anInt8996) {
			this.anInt8996 = this.anInt8989;
		}
		if (this.anInt8996 < 0) {
			this.anInt8996 = 0;
		}
		this.aDecoderContext1.setPostProcessingLevel(this.anInt8996);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;Z)V")
	@Override
	protected void method8197(@OriginalArg(0) OggPacket arg0) {
		@Pc(17) int local17;
		if (!this.aBoolean769) {
			local17 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local17 == 0) {
				this.aBoolean769 = true;
				if (this.aTheoraInfo1.frameWidth > 2048 || this.aTheoraInfo1.frameHeight > 1024) {
					throw new IllegalStateException();
				}
				this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
				this.aGranulePos1 = new GranulePos();
				this.aFrame2 = new Frame(this.aTheoraInfo1.frameWidth, this.aTheoraInfo1.frameHeight);
				this.anInt8989 = this.aDecoderContext1.getMaxPostProcessingLevel();
				this.method7635(this.anInt8996);
			} else if (local17 < 0) {
				throw new IllegalStateException(String.valueOf(local17));
			}
			return;
		}
		this.aLong255 = Static547.method7619();
		local17 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local17 < 0) {
			throw new IllegalStateException(String.valueOf(local17));
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble23 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean768) {
			@Pc(49) boolean local49 = arg0.isKeyFrame() == 1;
			if (!local49) {
				return;
			}
			this.aBoolean768 = false;
		}
		if (!this.aBoolean767 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame2) != 0) {
				throw new IllegalStateException(String.valueOf(local17));
			}
			this.aBoolean770 = true;
		}
	}

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "(I)F")
	public float method7636() {
		return this.aBoolean769 && !this.aTheoraInfo1.a() ? (float) this.aTheoraInfo1.fpsNumerator / (float) this.aTheoraInfo1.fpsDenominator : 0.0F;
	}

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "(Z)D")
	public double method7638() {
		return this.aDouble23;
	}
}
