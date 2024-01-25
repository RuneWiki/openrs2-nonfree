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

@OriginalClass("client!io")
public final class Class14_Sub27_Sub1 extends Class14_Sub27 {

	@OriginalMember(owner = "client!io", name = "t", descriptor = "Z")
	private boolean aBoolean311;

	@OriginalMember(owner = "client!io", name = "x", descriptor = "Z")
	private boolean aBoolean312;

	@OriginalMember(owner = "client!io", name = "y", descriptor = "Lclient!jagtheora/theora/Frame;")
	private Frame aFrame1;

	@OriginalMember(owner = "client!io", name = "A", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!io", name = "B", descriptor = "Lclient!jd;")
	private Class20 aClass20_10;

	@OriginalMember(owner = "client!io", name = "G", descriptor = "I")
	private int anInt4506;

	@OriginalMember(owner = "client!io", name = "H", descriptor = "Lclient!jagtheora/theora/GranulePos;")
	private GranulePos aGranulePos1;

	@OriginalMember(owner = "client!io", name = "I", descriptor = "I")
	private int anInt4507;

	@OriginalMember(owner = "client!io", name = "K", descriptor = "Z")
	private boolean aBoolean313;

	@OriginalMember(owner = "client!io", name = "M", descriptor = "J")
	private long aLong131;

	@OriginalMember(owner = "client!io", name = "P", descriptor = "Lclient!jagtheora/theora/DecoderContext;")
	private DecoderContext aDecoderContext1;

	@OriginalMember(owner = "client!io", name = "R", descriptor = "Z")
	private boolean aBoolean314;

	@OriginalMember(owner = "client!io", name = "D", descriptor = "Lclient!jagtheora/theora/SetupInfo;")
	private final SetupInfo aSetupInfo1 = new SetupInfo();

	@OriginalMember(owner = "client!io", name = "s", descriptor = "Lclient!jagtheora/theora/TheoraInfo;")
	private final TheoraInfo aTheoraInfo1 = new TheoraInfo();

	@OriginalMember(owner = "client!io", name = "w", descriptor = "Lclient!jagtheora/theora/TheoraComment;")
	private final TheoraComment aTheoraComment1 = new TheoraComment();

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class14_Sub27_Sub1(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!ha;B)Lclient!jd;")
	public Class20 method3731(@OriginalArg(0) Class137 arg0) {
		if (this.aFrame1 == null) {
			return null;
		} else if (this.aBoolean313 || this.aClass20_10 == null) {
			this.aClass20_10 = arg0.method7938(this.aFrame1.pixels, this.aFrame1.a, this.aFrame1.a, this.aFrame1.b, false);
			this.aBoolean313 = false;
			return this.aClass20_10;
		} else {
			return this.aClass20_10;
		}
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(I)D")
	public double method3734() {
		return this.aDouble9;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BI)V")
	private void method3735(@OriginalArg(1) int arg0) {
		this.anInt4506 = arg0;
		if (!this.aBoolean314) {
			return;
		}
		if (this.anInt4506 > this.anInt4507) {
			this.anInt4506 = this.anInt4507;
		}
		if (this.anInt4506 < 0) {
			this.anInt4506 = 0;
		}
		this.aDecoderContext1.setPostProcessingLevel(this.anInt4506);
	}

	@OriginalMember(owner = "client!io", name = "e", descriptor = "(B)F")
	public float method3736() {
		return this.aBoolean314 && !this.aTheoraInfo1.a() ? (float) this.aTheoraInfo1.fpsNumerator / (float) this.aTheoraInfo1.fpsDenominator : 0.0F;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
	@Override
	public void method9051() {
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

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(I)J")
	public long method3737() {
		return this.aLong131;
	}

	@OriginalMember(owner = "client!io", name = "d", descriptor = "(I)Z")
	public boolean method3739() {
		return this.aBoolean314;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	@Override
	protected void method9050(@OriginalArg(0) OggPacket arg0) {
		@Pc(15) int local15;
		if (!this.aBoolean314) {
			local15 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local15 == 0) {
				this.aBoolean314 = true;
				if (this.aTheoraInfo1.frameWidth > 2048 || this.aTheoraInfo1.frameHeight > 1024) {
					throw new IllegalStateException();
				}
				this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
				this.aGranulePos1 = new GranulePos();
				this.aFrame1 = new Frame(this.aTheoraInfo1.frameWidth, this.aTheoraInfo1.frameHeight);
				this.anInt4507 = this.aDecoderContext1.getMaxPostProcessingLevel();
				this.method3735(this.anInt4506);
			} else if (local15 < 0) {
				throw new IllegalStateException(String.valueOf(local15));
			}
			return;
		}
		this.aLong131 = Static521.method7499();
		local15 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local15 < 0) {
			throw new IllegalStateException(String.valueOf(local15));
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble9 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean312) {
			@Pc(130) boolean local130 = arg0.isKeyFrame() == 1;
			if (!local130) {
				return;
			}
			this.aBoolean312 = false;
		}
		if (!this.aBoolean311 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame1) != 0) {
				throw new IllegalStateException(String.valueOf(local15));
			}
			this.aBoolean313 = true;
		}
	}
}
