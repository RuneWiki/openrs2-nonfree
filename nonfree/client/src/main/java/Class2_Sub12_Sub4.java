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

@OriginalClass("client!rs")
public final class Class2_Sub12_Sub4 extends Class2_Sub12 {

	@OriginalMember(owner = "client!rs", name = "C", descriptor = "I")
	private int anInt8872;

	@OriginalMember(owner = "client!rs", name = "S", descriptor = "Lclient!jagtheora/theora/GranulePos;")
	private GranulePos aGranulePos1;

	@OriginalMember(owner = "client!rs", name = "B", descriptor = "Z")
	private boolean aBoolean751;

	@OriginalMember(owner = "client!rs", name = "U", descriptor = "D")
	private double aDouble55;

	@OriginalMember(owner = "client!rs", name = "x", descriptor = "Z")
	private boolean aBoolean752;

	@OriginalMember(owner = "client!rs", name = "F", descriptor = "Z")
	private boolean aBoolean753;

	@OriginalMember(owner = "client!rs", name = "A", descriptor = "Lclient!jagtheora/theora/Frame;")
	private Frame aFrame3;

	@OriginalMember(owner = "client!rs", name = "z", descriptor = "I")
	private int anInt8878;

	@OriginalMember(owner = "client!rs", name = "v", descriptor = "J")
	private long aLong280;

	@OriginalMember(owner = "client!rs", name = "J", descriptor = "Lclient!jagtheora/theora/DecoderContext;")
	private DecoderContext aDecoderContext1;

	@OriginalMember(owner = "client!rs", name = "X", descriptor = "Lclient!ug;")
	private Class43 aClass43_26;

	@OriginalMember(owner = "client!rs", name = "P", descriptor = "Z")
	private boolean aBoolean754;

	@OriginalMember(owner = "client!rs", name = "H", descriptor = "Lclient!jagtheora/theora/SetupInfo;")
	private final SetupInfo aSetupInfo1 = new SetupInfo();

	@OriginalMember(owner = "client!rs", name = "T", descriptor = "Lclient!jagtheora/theora/TheoraInfo;")
	private final TheoraInfo aTheoraInfo1 = new TheoraInfo();

	@OriginalMember(owner = "client!rs", name = "Q", descriptor = "Lclient!jagtheora/theora/TheoraComment;")
	private final TheoraComment aTheoraComment1 = new TheoraComment();

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub12_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)Z")
	public boolean method7844() {
		return this.aBoolean751;
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)V")
	@Override
	public void method7843() {
		if (this.aFrame3 != null) {
			this.aFrame3.b();
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

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "(I)F")
	public float method7845() {
		return this.aBoolean751 && !this.aTheoraInfo1.a() ? (float) this.aTheoraInfo1.fpsNumerator / (float) this.aTheoraInfo1.fpsDenominator : 0.0F;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(BI)V")
	private void method7847(@OriginalArg(1) int arg0) {
		this.anInt8872 = arg0;
		if (!this.aBoolean751) {
			return;
		}
		if (this.anInt8878 < this.anInt8872) {
			this.anInt8872 = this.anInt8878;
		}
		if (this.anInt8872 < 0) {
			this.anInt8872 = 0;
		}
		this.aDecoderContext1.setPostProcessingLevel(this.anInt8872);
	}

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "(B)J")
	public long method7849() {
		return this.aLong280;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!ha;B)Lclient!ug;")
	public Class43 method7850(@OriginalArg(0) Class145 arg0) {
		if (this.aFrame3 == null) {
			return null;
		} else if (this.aBoolean754 || this.aClass43_26 == null) {
			this.aClass43_26 = arg0.method9638(this.aFrame3.pixels, this.aFrame3.b, this.aFrame3.b, this.aFrame3.a, false);
			this.aBoolean754 = false;
			return this.aClass43_26;
		} else {
			return this.aClass43_26;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	@Override
	protected void method7838(@OriginalArg(0) OggPacket arg0) {
		@Pc(20) int local20;
		if (!this.aBoolean751) {
			local20 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local20 == 0) {
				this.aBoolean751 = true;
				if (this.aTheoraInfo1.frameWidth <= 2048 && this.aTheoraInfo1.frameHeight <= 1024) {
					this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
					this.aGranulePos1 = new GranulePos();
					this.aFrame3 = new Frame(this.aTheoraInfo1.frameWidth, this.aTheoraInfo1.frameHeight);
					this.anInt8878 = this.aDecoderContext1.getMaxPostProcessingLevel();
					this.method7847(this.anInt8872);
					return;
				}
				throw new IllegalStateException();
			}
			if (local20 < 0) {
				throw new IllegalStateException(String.valueOf(local20));
			}
			return;
		}
		this.aLong280 = Static567.method7863();
		local20 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local20 < 0) {
			throw new IllegalStateException(String.valueOf(local20));
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble55 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean753) {
			@Pc(146) boolean local146 = arg0.isKeyFrame() == 1;
			if (!local146) {
				return;
			}
			this.aBoolean753 = false;
		}
		if (!this.aBoolean752 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame3) != 0) {
				throw new IllegalStateException(String.valueOf(local20));
			}
			this.aBoolean754 = true;
		}
	}

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "(B)D")
	public double method7852() {
		return this.aDouble55;
	}
}
