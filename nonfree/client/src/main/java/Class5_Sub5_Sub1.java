import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.DecoderContext;
import jagtheora.theora.Frame;
import jagtheora.theora.GranulePos;
import jagtheora.theora.SetupInfo;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class5_Sub5_Sub1 extends Class5_Sub5 {

	@OriginalMember(owner = "client!ei", name = "L", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!ei", name = "p", descriptor = "Z")
	private boolean aBoolean160;

	@OriginalMember(owner = "client!ei", name = "q", descriptor = "Lclient!jagtheora/theora/DecoderContext;")
	private DecoderContext aDecoderContext1;

	@OriginalMember(owner = "client!ei", name = "r", descriptor = "Z")
	private boolean aBoolean161;

	@OriginalMember(owner = "client!ei", name = "s", descriptor = "Lclient!hu;")
	private Class44 aClass44_7;

	@OriginalMember(owner = "client!ei", name = "v", descriptor = "D")
	private double aDouble13;

	@OriginalMember(owner = "client!ei", name = "w", descriptor = "Lclient!jagtheora/theora/GranulePos;")
	private GranulePos aGranulePos1;

	@OriginalMember(owner = "client!ei", name = "x", descriptor = "Lclient!jagtheora/theora/Frame;")
	private Frame aFrame1;

	@OriginalMember(owner = "client!ei", name = "A", descriptor = "Z")
	private boolean aBoolean162;

	@OriginalMember(owner = "client!ei", name = "G", descriptor = "I")
	private int anInt2076;

	@OriginalMember(owner = "client!ei", name = "I", descriptor = "I")
	private int anInt2078;

	@OriginalMember(owner = "client!ei", name = "O", descriptor = "Z")
	private boolean aBoolean163;

	@OriginalMember(owner = "client!ei", name = "P", descriptor = "J")
	private long aLong76;

	@OriginalMember(owner = "client!ei", name = "J", descriptor = "Lclient!jagtheora/theora/SetupInfo;")
	private final SetupInfo aSetupInfo1 = new SetupInfo();

	@OriginalMember(owner = "client!ei", name = "y", descriptor = "Lclient!jagtheora/theora/TheoraInfo;")
	private final TheoraInfo aTheoraInfo1 = new TheoraInfo();

	@OriginalMember(owner = "client!ei", name = "C", descriptor = "Lclient!jagtheora/theora/TheoraComment;")
	private final TheoraComment aTheoraComment1 = new TheoraComment();

	static {
		for (@Pc(10) int local10 = 0; local10 < 100; local10++) {
			aRectangleArray1[local10] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class5_Sub5_Sub1(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(B)F")
	public float method1901() {
		return this.aBoolean161 && !this.aTheoraInfo1.a() ? (float) this.aTheoraInfo1.fpsNumerator / (float) this.aTheoraInfo1.fpsDenominator : 0.0F;
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "(B)D")
	public double method1902() {
		return this.aDouble13;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V")
	private void method1905(@OriginalArg(1) int arg0) {
		this.anInt2076 = arg0;
		if (!this.aBoolean161) {
			return;
		}
		if (this.anInt2078 < this.anInt2076) {
			this.anInt2076 = this.anInt2078;
		}
		if (this.anInt2076 < 0) {
			this.anInt2076 = 0;
		}
		this.aDecoderContext1.setPostProcessingLevel(this.anInt2076);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!ha;B)Lclient!hu;")
	public Class44 method1906(@OriginalArg(0) Class126 arg0) {
		if (this.aFrame1 == null) {
			return null;
		} else if (this.aBoolean162 || this.aClass44_7 == null) {
			this.aClass44_7 = arg0.method7047(this.aFrame1.pixels, this.aFrame1.a, this.aFrame1.a, this.aFrame1.b, false);
			this.aBoolean162 = false;
			return this.aClass44_7;
		} else {
			return this.aClass44_7;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
	@Override
	public void method7384() {
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

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "(B)Z")
	public boolean method1907() {
		return this.aBoolean161;
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)J")
	public long method1908() {
		return this.aLong76;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;Z)V")
	@Override
	protected void method7383(@OriginalArg(0) OggPacket arg0) {
		@Pc(21) int local21;
		if (!this.aBoolean161) {
			local21 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local21 == 0) {
				this.aBoolean161 = true;
				if (this.aTheoraInfo1.frameWidth > 2048 || this.aTheoraInfo1.frameHeight > 1024) {
					throw new IllegalStateException();
				}
				this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
				this.aGranulePos1 = new GranulePos();
				this.aFrame1 = new Frame(this.aTheoraInfo1.frameWidth, this.aTheoraInfo1.frameHeight);
				this.anInt2078 = this.aDecoderContext1.getMaxPostProcessingLevel();
				this.method1905(this.anInt2076);
			} else if (local21 < 0) {
				throw new IllegalStateException(String.valueOf(local21));
			}
			return;
		}
		this.aLong76 = Static205.method3179();
		local21 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local21 < 0) {
			throw new IllegalStateException(String.valueOf(local21));
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble13 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean163) {
			@Pc(55) boolean local55 = arg0.isKeyFrame() == 1;
			if (!local55) {
				return;
			}
			this.aBoolean163 = false;
		}
		if (!this.aBoolean160 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame1) != 0) {
				throw new IllegalStateException(String.valueOf(local21));
			}
			this.aBoolean162 = true;
		}
	}
}
