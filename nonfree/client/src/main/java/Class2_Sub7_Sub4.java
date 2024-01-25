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

@OriginalClass("client!qa")
public final class Class2_Sub7_Sub4 extends Class2_Sub7 {

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "Z")
	private boolean aBoolean615;

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "Lclient!mq;")
	private Class71 aClass71_30;

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "Z")
	private boolean aBoolean616;

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "J")
	private long aLong237;

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "I")
	private int anInt8459;

	@OriginalMember(owner = "client!qa", name = "E", descriptor = "Z")
	private boolean aBoolean617;

	@OriginalMember(owner = "client!qa", name = "F", descriptor = "Lclient!jagtheora/theora/DecoderContext;")
	private DecoderContext aDecoderContext1;

	@OriginalMember(owner = "client!qa", name = "I", descriptor = "Z")
	private boolean aBoolean618;

	@OriginalMember(owner = "client!qa", name = "M", descriptor = "D")
	private double aDouble17;

	@OriginalMember(owner = "client!qa", name = "N", descriptor = "Lclient!jagtheora/theora/Frame;")
	private Frame aFrame3;

	@OriginalMember(owner = "client!qa", name = "O", descriptor = "I")
	private int anInt8465;

	@OriginalMember(owner = "client!qa", name = "Q", descriptor = "Lclient!jagtheora/theora/GranulePos;")
	private GranulePos aGranulePos1;

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "Lclient!jagtheora/theora/SetupInfo;")
	private final SetupInfo aSetupInfo1 = new SetupInfo();

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "Lclient!jagtheora/theora/TheoraInfo;")
	private final TheoraInfo aTheoraInfo1 = new TheoraInfo();

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "Lclient!jagtheora/theora/TheoraComment;")
	private final TheoraComment aTheoraComment1 = new TheoraComment();

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub7_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)Z")
	public boolean method7542() {
		return this.aBoolean618;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	@Override
	public void method7539() {
		if (this.aFrame3 != null) {
			this.aFrame3.a();
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

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!ha;)Lclient!mq;")
	public Class71 method7544(@OriginalArg(1) Class101 arg0) {
		if (this.aFrame3 == null) {
			return null;
		} else if (this.aBoolean617 || this.aClass71_30 == null) {
			this.aClass71_30 = arg0.method8105(this.aFrame3.pixels, this.aFrame3.b, this.aFrame3.b, this.aFrame3.a, false);
			this.aBoolean617 = false;
			return this.aClass71_30;
		} else {
			return this.aClass71_30;
		}
	}

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)D")
	public double method7545() {
		return this.aDouble17;
	}

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)J")
	public long method7546() {
		return this.aLong237;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	@Override
	protected void method7541(@OriginalArg(0) OggPacket arg0) {
		@Pc(15) int local15;
		if (!this.aBoolean618) {
			local15 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local15 == 0) {
				this.aBoolean618 = true;
				if (this.aTheoraInfo1.frameWidth > 2048 || this.aTheoraInfo1.frameHeight > 1024) {
					throw new IllegalStateException();
				}
				this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
				this.aGranulePos1 = new GranulePos();
				this.aFrame3 = new Frame(this.aTheoraInfo1.frameWidth, this.aTheoraInfo1.frameHeight);
				this.anInt8459 = this.aDecoderContext1.getMaxPostProcessingLevel();
				this.method7549(this.anInt8465);
			} else if (local15 < 0) {
				throw new IllegalStateException(String.valueOf(local15));
			}
			return;
		}
		this.aLong237 = Static99.method1701();
		local15 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local15 < 0) {
			throw new IllegalStateException(String.valueOf(local15));
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble17 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean616) {
			@Pc(130) boolean local130 = arg0.isKeyFrame() == 1;
			if (!local130) {
				return;
			}
			this.aBoolean616 = false;
		}
		if (!this.aBoolean615 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame3) != 0) {
				throw new IllegalStateException(String.valueOf(local15));
			}
			this.aBoolean617 = true;
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)F")
	public float method7547() {
		return this.aBoolean618 && !this.aTheoraInfo1.b() ? (float) this.aTheoraInfo1.fpsNumerator / (float) this.aTheoraInfo1.fpsDenominator : 0.0F;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB)V")
	private void method7549(@OriginalArg(0) int arg0) {
		this.anInt8465 = arg0;
		if (!this.aBoolean618) {
			return;
		}
		if (this.anInt8465 > this.anInt8459) {
			this.anInt8465 = this.anInt8459;
		}
		if (this.anInt8465 < 0) {
			this.anInt8465 = 0;
		}
		this.aDecoderContext1.setPostProcessingLevel(this.anInt8465);
	}
}
