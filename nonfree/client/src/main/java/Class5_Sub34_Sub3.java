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

@OriginalClass("client!rga")
public final class Class5_Sub34_Sub3 extends Class5_Sub34 {

	@OriginalMember(owner = "client!rga", name = "t", descriptor = "Z")
	private boolean aBoolean596;

	@OriginalMember(owner = "client!rga", name = "w", descriptor = "Lclient!jagtheora/theora/Frame;")
	private Frame aFrame3;

	@OriginalMember(owner = "client!rga", name = "x", descriptor = "Z")
	private boolean aBoolean597;

	@OriginalMember(owner = "client!rga", name = "B", descriptor = "Lclient!jagtheora/theora/GranulePos;")
	private GranulePos aGranulePos1;

	@OriginalMember(owner = "client!rga", name = "C", descriptor = "J")
	private long aLong208;

	@OriginalMember(owner = "client!rga", name = "H", descriptor = "I")
	private int anInt8259;

	@OriginalMember(owner = "client!rga", name = "I", descriptor = "D")
	private double aDouble17;

	@OriginalMember(owner = "client!rga", name = "L", descriptor = "Lclient!it;")
	private Class28 aClass28_29;

	@OriginalMember(owner = "client!rga", name = "V", descriptor = "Z")
	private boolean aBoolean598;

	@OriginalMember(owner = "client!rga", name = "W", descriptor = "I")
	private int anInt8264;

	@OriginalMember(owner = "client!rga", name = "X", descriptor = "Lclient!jagtheora/theora/DecoderContext;")
	private DecoderContext aDecoderContext1;

	@OriginalMember(owner = "client!rga", name = "Y", descriptor = "Z")
	private boolean aBoolean599;

	@OriginalMember(owner = "client!rga", name = "O", descriptor = "Lclient!jagtheora/theora/SetupInfo;")
	private final SetupInfo aSetupInfo1 = new SetupInfo();

	@OriginalMember(owner = "client!rga", name = "K", descriptor = "Lclient!jagtheora/theora/TheoraInfo;")
	private final TheoraInfo aTheoraInfo1 = new TheoraInfo();

	@OriginalMember(owner = "client!rga", name = "y", descriptor = "Lclient!jagtheora/theora/TheoraComment;")
	private final TheoraComment aTheoraComment1 = new TheoraComment();

	@OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class5_Sub34_Sub3(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(IB)V")
	private void method7180(@OriginalArg(0) int arg0) {
		this.anInt8259 = arg0;
		if (!this.aBoolean599) {
			return;
		}
		if (this.anInt8259 > this.anInt8264) {
			this.anInt8259 = this.anInt8264;
		}
		if (this.anInt8259 < 0) {
			this.anInt8259 = 0;
		}
		this.aDecoderContext1.setPostProcessingLevel(this.anInt8259);
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(ILclient!ha;)Lclient!it;")
	public Class28 method7181(@OriginalArg(1) Class133 arg0) {
		if (this.aFrame3 == null) {
			return null;
		} else if (this.aBoolean598 || this.aClass28_29 == null) {
			this.aClass28_29 = arg0.method7312(this.aFrame3.pixels, this.aFrame3.a, this.aFrame3.a, this.aFrame3.b, false);
			this.aBoolean598 = false;
			return this.aClass28_29;
		} else {
			return this.aClass28_29;
		}
	}

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "(I)J")
	public long method7182() {
		return this.aLong208;
	}

	@OriginalMember(owner = "client!rga", name = "c", descriptor = "(I)Z")
	public boolean method7183() {
		return this.aBoolean599;
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(B)F")
	public float method7184() {
		return this.aBoolean599 && !this.aTheoraInfo1.b() ? (float) this.aTheoraInfo1.fpsNumerator / (float) this.aTheoraInfo1.fpsDenominator : 0.0F;
	}

	@OriginalMember(owner = "client!rga", name = "f", descriptor = "(I)D")
	public double method7185() {
		return this.aDouble17;
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	@Override
	protected void method8629(@OriginalArg(0) OggPacket arg0) {
		@Pc(21) int local21;
		if (!this.aBoolean599) {
			local21 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local21 == 0) {
				this.aBoolean599 = true;
				if (this.aTheoraInfo1.frameWidth > 2048 || this.aTheoraInfo1.frameHeight > 1024) {
					throw new IllegalStateException();
				}
				this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
				this.aGranulePos1 = new GranulePos();
				this.aFrame3 = new Frame(this.aTheoraInfo1.frameWidth, this.aTheoraInfo1.frameHeight);
				this.anInt8264 = this.aDecoderContext1.getMaxPostProcessingLevel();
				this.method7180(this.anInt8259);
			} else if (local21 < 0) {
				throw new IllegalStateException(String.valueOf(local21));
			}
			return;
		}
		this.aLong208 = Static95.method1587();
		local21 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local21 < 0) {
			throw new IllegalStateException(String.valueOf(local21));
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble17 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean596) {
			@Pc(53) boolean local53 = arg0.isKeyFrame() == 1;
			if (!local53) {
				return;
			}
			this.aBoolean596 = false;
		}
		if (!this.aBoolean597 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame3) != 0) {
				throw new IllegalStateException(String.valueOf(local21));
			}
			this.aBoolean598 = true;
		}
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(I)V")
	@Override
	public void method8632() {
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
}
