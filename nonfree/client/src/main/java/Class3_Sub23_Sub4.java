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

@OriginalClass("client!uc")
public final class Class3_Sub23_Sub4 extends Class3_Sub23 {

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "Z")
	private boolean aBoolean699;

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "Lclient!jagtheora/theora/DecoderContext;")
	private DecoderContext aDecoderContext1;

	@OriginalMember(owner = "client!uc", name = "x", descriptor = "Lclient!fd;")
	private Class103 aClass103_45;

	@OriginalMember(owner = "client!uc", name = "A", descriptor = "Z")
	private boolean aBoolean700;

	@OriginalMember(owner = "client!uc", name = "C", descriptor = "Z")
	private boolean aBoolean701;

	@OriginalMember(owner = "client!uc", name = "F", descriptor = "Z")
	private boolean aBoolean702;

	@OriginalMember(owner = "client!uc", name = "G", descriptor = "D")
	private double aDouble28;

	@OriginalMember(owner = "client!uc", name = "I", descriptor = "I")
	private int anInt9353;

	@OriginalMember(owner = "client!uc", name = "J", descriptor = "Lclient!jagtheora/theora/Frame;")
	private Frame aFrame5;

	@OriginalMember(owner = "client!uc", name = "M", descriptor = "J")
	private long aLong255;

	@OriginalMember(owner = "client!uc", name = "N", descriptor = "Lclient!jagtheora/theora/GranulePos;")
	private GranulePos aGranulePos1;

	@OriginalMember(owner = "client!uc", name = "R", descriptor = "I")
	private int anInt9357;

	@OriginalMember(owner = "client!uc", name = "L", descriptor = "Lclient!jagtheora/theora/SetupInfo;")
	private final SetupInfo aSetupInfo1 = new SetupInfo();

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "Lclient!jagtheora/theora/TheoraInfo;")
	private final TheoraInfo aTheoraInfo1 = new TheoraInfo();

	@OriginalMember(owner = "client!uc", name = "w", descriptor = "Lclient!jagtheora/theora/TheoraComment;")
	private final TheoraComment aTheoraComment1 = new TheoraComment();

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub23_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)Z")
	public boolean method8000() {
		return this.aBoolean701;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!ha;)Lclient!fd;")
	public Class103 method8001(@OriginalArg(1) Class82 arg0) {
		if (this.aFrame5 == null) {
			return null;
		} else if (this.aBoolean699 || this.aClass103_45 == null) {
			this.aClass103_45 = arg0.method6180(this.aFrame5.pixels, this.aFrame5.b, this.aFrame5.b, this.aFrame5.a, false);
			this.aBoolean699 = false;
			return this.aClass103_45;
		} else {
			return this.aClass103_45;
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)F")
	public float method8002() {
		return this.aBoolean701 && !this.aTheoraInfo1.a() ? (float) this.aTheoraInfo1.fpsNumerator / (float) this.aTheoraInfo1.fpsDenominator : 0.0F;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	@Override
	protected void method7999(@OriginalArg(0) OggPacket arg0) {
		@Pc(22) int local22;
		if (!this.aBoolean701) {
			local22 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local22 == 0) {
				this.aBoolean701 = true;
				if (this.aTheoraInfo1.frameWidth <= 2048 && this.aTheoraInfo1.frameHeight <= 1024) {
					this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
					this.aGranulePos1 = new GranulePos();
					this.aFrame5 = new Frame(this.aTheoraInfo1.frameWidth, this.aTheoraInfo1.frameHeight);
					this.anInt9357 = this.aDecoderContext1.getMaxPostProcessingLevel();
					this.method8007(this.anInt9353);
					return;
				}
				throw new IllegalStateException();
			}
			if (local22 < 0) {
				throw new IllegalStateException(String.valueOf(local22));
			}
			return;
		}
		this.aLong255 = Static191.method3071();
		local22 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local22 < 0) {
			throw new IllegalStateException(String.valueOf(local22));
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble28 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean702) {
			@Pc(130) boolean local130 = arg0.isKeyFrame() == 1;
			if (!local130) {
				return;
			}
			this.aBoolean702 = false;
		}
		if (!this.aBoolean700 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame5) != 0) {
				throw new IllegalStateException(String.valueOf(local22));
			}
			this.aBoolean699 = true;
		}
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)J")
	public long method8003() {
		return this.aLong255;
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)D")
	public double method8004() {
		return this.aDouble28;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
	@Override
	public void method7994() {
		if (this.aFrame5 != null) {
			this.aFrame5.b();
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

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)V")
	private void method8007(@OriginalArg(1) int arg0) {
		this.anInt9353 = arg0;
		if (!this.aBoolean701) {
			return;
		}
		if (this.anInt9357 < this.anInt9353) {
			this.anInt9353 = this.anInt9357;
		}
		if (this.anInt9353 < 0) {
			this.anInt9353 = 0;
		}
		this.aDecoderContext1.setPostProcessingLevel(this.anInt9353);
	}
}
