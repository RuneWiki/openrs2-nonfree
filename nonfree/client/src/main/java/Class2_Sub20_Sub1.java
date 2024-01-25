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

@OriginalClass("client!ff")
public final class Class2_Sub20_Sub1 extends Class2_Sub20 {

	@OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
	private int anInt3175;

	@OriginalMember(owner = "client!ff", name = "w", descriptor = "Lclient!jagtheora/theora/Frame;")
	private Frame aFrame3;

	@OriginalMember(owner = "client!ff", name = "x", descriptor = "Z")
	private boolean aBoolean245;

	@OriginalMember(owner = "client!ff", name = "y", descriptor = "Z")
	private boolean aBoolean246;

	@OriginalMember(owner = "client!ff", name = "z", descriptor = "Lclient!jagtheora/theora/GranulePos;")
	private GranulePos aGranulePos1;

	@OriginalMember(owner = "client!ff", name = "A", descriptor = "J")
	private long aLong85;

	@OriginalMember(owner = "client!ff", name = "B", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!ff", name = "E", descriptor = "I")
	private int anInt3180;

	@OriginalMember(owner = "client!ff", name = "G", descriptor = "Lclient!iea;")
	private Class31 aClass31_8;

	@OriginalMember(owner = "client!ff", name = "H", descriptor = "Lclient!jagtheora/theora/DecoderContext;")
	private DecoderContext aDecoderContext1;

	@OriginalMember(owner = "client!ff", name = "J", descriptor = "Z")
	private boolean aBoolean247;

	@OriginalMember(owner = "client!ff", name = "L", descriptor = "Z")
	private boolean aBoolean248;

	@OriginalMember(owner = "client!ff", name = "r", descriptor = "Lclient!jagtheora/theora/SetupInfo;")
	private final SetupInfo aSetupInfo1 = new SetupInfo();

	@OriginalMember(owner = "client!ff", name = "K", descriptor = "Lclient!jagtheora/theora/TheoraInfo;")
	private final TheoraInfo aTheoraInfo1 = new TheoraInfo();

	@OriginalMember(owner = "client!ff", name = "O", descriptor = "Lclient!jagtheora/theora/TheoraComment;")
	private final TheoraComment aTheoraComment1 = new TheoraComment();

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub20_Sub1(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)F")
	public float method2719() {
		return this.aBoolean247 && !this.aTheoraInfo1.b() ? (float) this.aTheoraInfo1.fpsNumerator / (float) this.aTheoraInfo1.fpsDenominator : 0.0F;
	}

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)J")
	public long method2720() {
		return this.aLong85;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!ha;)Lclient!iea;")
	public Class31 method2721(@OriginalArg(1) Class13 arg0) {
		if (this.aFrame3 == null) {
			return null;
		} else if (this.aBoolean248 || this.aClass31_8 == null) {
			this.aClass31_8 = arg0.method8157(this.aFrame3.pixels, this.aFrame3.b, this.aFrame3.b, this.aFrame3.a, false);
			this.aBoolean248 = false;
			return this.aClass31_8;
		} else {
			return this.aClass31_8;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method7363(@OriginalArg(1) OggPacket arg0) {
		@Pc(17) int local17;
		if (!this.aBoolean247) {
			local17 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local17 == 0) {
				this.aBoolean247 = true;
				if (this.aTheoraInfo1.frameWidth > 2048 || this.aTheoraInfo1.frameHeight > 1024) {
					throw new IllegalStateException();
				}
				this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
				this.aGranulePos1 = new GranulePos();
				this.aFrame3 = new Frame(this.aTheoraInfo1.frameWidth, this.aTheoraInfo1.frameHeight);
				this.anInt3180 = this.aDecoderContext1.getMaxPostProcessingLevel();
				this.method2724(this.anInt3175);
			} else if (local17 < 0) {
				throw new IllegalStateException(String.valueOf(local17));
			}
			return;
		}
		this.aLong85 = Static48.method1203();
		local17 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local17 < 0) {
			throw new IllegalStateException(String.valueOf(local17));
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble2 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean246) {
			@Pc(135) boolean local135 = arg0.isKeyFrame() == 1;
			if (!local135) {
				return;
			}
			this.aBoolean246 = false;
		}
		if (!this.aBoolean245 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame3) != 0) {
				throw new IllegalStateException(String.valueOf(local17));
			}
			this.aBoolean248 = true;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)Z")
	public boolean method2722() {
		return this.aBoolean247;
	}

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "(I)D")
	public double method2723() {
		return this.aDouble2;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)V")
	private void method2724(@OriginalArg(1) int arg0) {
		this.anInt3175 = arg0;
		if (!this.aBoolean247) {
			return;
		}
		if (this.anInt3175 > this.anInt3180) {
			this.anInt3175 = this.anInt3180;
		}
		if (this.anInt3175 < 0) {
			this.anInt3175 = 0;
		}
		this.aDecoderContext1.setPostProcessingLevel(this.anInt3175);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
	@Override
	public void method7360() {
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
