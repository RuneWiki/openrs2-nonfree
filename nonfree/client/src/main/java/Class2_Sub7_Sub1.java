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

@OriginalClass("client!br")
public final class Class2_Sub7_Sub1 extends Class2_Sub7 {

	@OriginalMember(owner = "client!br", name = "r", descriptor = "Z")
	private boolean aBoolean76;

	@OriginalMember(owner = "client!br", name = "w", descriptor = "Lclient!jagtheora/theora/Frame;")
	private Frame aFrame1;

	@OriginalMember(owner = "client!br", name = "x", descriptor = "Z")
	private boolean aBoolean77;

	@OriginalMember(owner = "client!br", name = "z", descriptor = "J")
	private long aLong42;

	@OriginalMember(owner = "client!br", name = "B", descriptor = "Lclient!jagtheora/theora/DecoderContext;")
	private DecoderContext aDecoderContext1;

	@OriginalMember(owner = "client!br", name = "C", descriptor = "Z")
	private boolean aBoolean78;

	@OriginalMember(owner = "client!br", name = "E", descriptor = "I")
	private int anInt1077;

	@OriginalMember(owner = "client!br", name = "F", descriptor = "I")
	private int anInt1078;

	@OriginalMember(owner = "client!br", name = "G", descriptor = "Lclient!jagtheora/theora/GranulePos;")
	private GranulePos aGranulePos1;

	@OriginalMember(owner = "client!br", name = "I", descriptor = "Z")
	private boolean aBoolean79;

	@OriginalMember(owner = "client!br", name = "K", descriptor = "D")
	private double aDouble11;

	@OriginalMember(owner = "client!br", name = "M", descriptor = "Lclient!cw;")
	private Class61 aClass61_2;

	@OriginalMember(owner = "client!br", name = "A", descriptor = "Lclient!jagtheora/theora/SetupInfo;")
	private final SetupInfo aSetupInfo1 = new SetupInfo();

	@OriginalMember(owner = "client!br", name = "N", descriptor = "Lclient!jagtheora/theora/TheoraInfo;")
	private final TheoraInfo aTheoraInfo1 = new TheoraInfo();

	@OriginalMember(owner = "client!br", name = "Q", descriptor = "Lclient!jagtheora/theora/TheoraComment;")
	private final TheoraComment aTheoraComment1 = new TheoraComment();

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub7_Sub1(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(B)J")
	public long method830() {
		return this.aLong42;
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(I)Z")
	public boolean method831() {
		return this.aBoolean78;
	}

	@OriginalMember(owner = "client!br", name = "f", descriptor = "(I)D")
	public double method833() {
		return this.aDouble11;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!ha;I)Lclient!cw;")
	public Class61 method834(@OriginalArg(0) Class95 arg0) {
		if (this.aFrame1 == null) {
			return null;
		} else if (this.aBoolean77 || this.aClass61_2 == null) {
			this.aClass61_2 = arg0.method7012(this.aFrame1.pixels, this.aFrame1.b, this.aFrame1.b, this.aFrame1.a, false);
			this.aBoolean77 = false;
			return this.aClass61_2;
		} else {
			return this.aClass61_2;
		}
	}

	@OriginalMember(owner = "client!br", name = "g", descriptor = "(I)F")
	public float method836() {
		return this.aBoolean78 && !this.aTheoraInfo1.b() ? (float) this.aTheoraInfo1.fpsNumerator / (float) this.aTheoraInfo1.fpsDenominator : 0.0F;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	@Override
	protected void method8314(@OriginalArg(0) OggPacket arg0) {
		@Pc(21) int local21;
		if (!this.aBoolean78) {
			local21 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local21 == 0) {
				this.aBoolean78 = true;
				if (this.aTheoraInfo1.frameWidth <= 2048 && this.aTheoraInfo1.frameHeight <= 1024) {
					this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
					this.aGranulePos1 = new GranulePos();
					this.aFrame1 = new Frame(this.aTheoraInfo1.frameWidth, this.aTheoraInfo1.frameHeight);
					this.anInt1078 = this.aDecoderContext1.getMaxPostProcessingLevel();
					this.method837(this.anInt1077);
					return;
				}
				throw new IllegalStateException();
			}
			if (local21 < 0) {
				throw new IllegalStateException(String.valueOf(local21));
			}
			return;
		}
		this.aLong42 = Static476.method6413();
		local21 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local21 < 0) {
			throw new IllegalStateException(String.valueOf(local21));
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble11 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean76) {
			@Pc(133) boolean local133 = arg0.isKeyFrame() == 1;
			if (!local133) {
				return;
			}
			this.aBoolean76 = false;
		}
		if (!this.aBoolean79 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame1) != 0) {
				throw new IllegalStateException(String.valueOf(local21));
			}
			this.aBoolean77 = true;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
	@Override
	public void method8318() {
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

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(II)V")
	private void method837(@OriginalArg(1) int arg0) {
		this.anInt1077 = arg0;
		if (!this.aBoolean78) {
			return;
		}
		if (this.anInt1078 < this.anInt1077) {
			this.anInt1077 = this.anInt1078;
		}
		if (this.anInt1077 < 0) {
			this.anInt1077 = 0;
		}
		this.aDecoderContext1.setPostProcessingLevel(this.anInt1077);
	}
}
