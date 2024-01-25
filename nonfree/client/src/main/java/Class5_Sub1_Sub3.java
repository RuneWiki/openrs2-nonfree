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

@OriginalClass("client!pp")
public final class Class5_Sub1_Sub3 extends Class5_Sub1 {

	@OriginalMember(owner = "client!pp", name = "u", descriptor = "Lclient!jagtheora/theora/Frame;")
	private Frame aFrame3;

	@OriginalMember(owner = "client!pp", name = "v", descriptor = "J")
	private long aLong245;

	@OriginalMember(owner = "client!pp", name = "x", descriptor = "I")
	private int anInt7954;

	@OriginalMember(owner = "client!pp", name = "C", descriptor = "Lclient!jagtheora/theora/DecoderContext;")
	private DecoderContext aDecoderContext1;

	@OriginalMember(owner = "client!pp", name = "E", descriptor = "Lclient!qda;")
	private Class59 aClass59_24;

	@OriginalMember(owner = "client!pp", name = "H", descriptor = "Z")
	private boolean aBoolean580;

	@OriginalMember(owner = "client!pp", name = "K", descriptor = "I")
	private int anInt7961;

	@OriginalMember(owner = "client!pp", name = "N", descriptor = "D")
	private double aDouble18;

	@OriginalMember(owner = "client!pp", name = "O", descriptor = "Z")
	private boolean aBoolean581;

	@OriginalMember(owner = "client!pp", name = "P", descriptor = "Lclient!jagtheora/theora/GranulePos;")
	private GranulePos aGranulePos1;

	@OriginalMember(owner = "client!pp", name = "U", descriptor = "Z")
	private boolean aBoolean582;

	@OriginalMember(owner = "client!pp", name = "X", descriptor = "Z")
	private boolean aBoolean583;

	@OriginalMember(owner = "client!pp", name = "D", descriptor = "Lclient!jagtheora/theora/SetupInfo;")
	private final SetupInfo aSetupInfo1 = new SetupInfo();

	@OriginalMember(owner = "client!pp", name = "w", descriptor = "Lclient!jagtheora/theora/TheoraInfo;")
	private final TheoraInfo aTheoraInfo1 = new TheoraInfo();

	@OriginalMember(owner = "client!pp", name = "G", descriptor = "Lclient!jagtheora/theora/TheoraComment;")
	private final TheoraComment aTheoraComment1 = new TheoraComment();

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class5_Sub1_Sub3(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
	@Override
	public void method8219() {
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

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)Z")
	public boolean method6765() {
		return this.aBoolean580;
	}

	@OriginalMember(owner = "client!pp", name = "h", descriptor = "(I)D")
	public double method6767() {
		return this.aDouble18;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method8220(@OriginalArg(1) OggPacket arg0) {
		@Pc(17) int local17;
		if (!this.aBoolean580) {
			local17 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local17 == 0) {
				this.aBoolean580 = true;
				if (this.aTheoraInfo1.frameWidth > 2048 || this.aTheoraInfo1.frameHeight > 1024) {
					throw new IllegalStateException();
				}
				this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
				this.aGranulePos1 = new GranulePos();
				this.aFrame3 = new Frame(this.aTheoraInfo1.frameWidth, this.aTheoraInfo1.frameHeight);
				this.anInt7954 = this.aDecoderContext1.getMaxPostProcessingLevel();
				this.method6769(this.anInt7961);
			} else if (local17 < 0) {
				throw new IllegalStateException(String.valueOf(local17));
			}
			return;
		}
		this.aLong245 = Static124.method1947();
		local17 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local17 < 0) {
			throw new IllegalStateException(String.valueOf(local17));
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble18 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean582) {
			@Pc(133) boolean local133 = arg0.isKeyFrame() == 1;
			if (!local133) {
				return;
			}
			this.aBoolean582 = false;
		}
		if (!this.aBoolean581 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame3) != 0) {
				throw new IllegalStateException(String.valueOf(local17));
			}
			this.aBoolean583 = true;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IB)V")
	private void method6769(@OriginalArg(0) int arg0) {
		this.anInt7961 = arg0;
		if (!this.aBoolean580) {
			return;
		}
		if (this.anInt7954 < this.anInt7961) {
			this.anInt7961 = this.anInt7954;
		}
		if (this.anInt7961 < 0) {
			this.anInt7961 = 0;
		}
		this.aDecoderContext1.setPostProcessingLevel(this.anInt7961);
	}

	@OriginalMember(owner = "client!pp", name = "i", descriptor = "(I)F")
	public float method6770() {
		return this.aBoolean580 && !this.aTheoraInfo1.b() ? (float) this.aTheoraInfo1.fpsNumerator / (float) this.aTheoraInfo1.fpsDenominator : 0.0F;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!ha;Z)Lclient!qda;")
	public Class59 method6771(@OriginalArg(0) Class143 arg0) {
		if (this.aFrame3 == null) {
			return null;
		} else if (this.aBoolean583 || this.aClass59_24 == null) {
			this.aClass59_24 = arg0.method6246(this.aFrame3.pixels, this.aFrame3.b, this.aFrame3.b, this.aFrame3.a, false);
			this.aBoolean583 = false;
			return this.aClass59_24;
		} else {
			return this.aClass59_24;
		}
	}

	@OriginalMember(owner = "client!pp", name = "j", descriptor = "(I)J")
	public long method6773() {
		return this.aLong245;
	}
}
