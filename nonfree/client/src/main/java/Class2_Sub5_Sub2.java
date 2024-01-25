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

@OriginalClass("client!naa")
public final class Class2_Sub5_Sub2 extends Class2_Sub5 {

	@OriginalMember(owner = "client!naa", name = "x", descriptor = "Z")
	private boolean aBoolean520;

	@OriginalMember(owner = "client!naa", name = "y", descriptor = "I")
	private int anInt7179;

	@OriginalMember(owner = "client!naa", name = "D", descriptor = "Z")
	private boolean aBoolean521;

	@OriginalMember(owner = "client!naa", name = "E", descriptor = "D")
	private double aDouble17;

	@OriginalMember(owner = "client!naa", name = "F", descriptor = "Z")
	private boolean aBoolean522;

	@OriginalMember(owner = "client!naa", name = "H", descriptor = "J")
	private long aLong176;

	@OriginalMember(owner = "client!naa", name = "I", descriptor = "Lclient!jagtheora/theora/GranulePos;")
	private GranulePos aGranulePos1;

	@OriginalMember(owner = "client!naa", name = "J", descriptor = "Lclient!mi;")
	private Class46 aClass46_23;

	@OriginalMember(owner = "client!naa", name = "N", descriptor = "Lclient!jagtheora/theora/Frame;")
	private Frame aFrame3;

	@OriginalMember(owner = "client!naa", name = "Q", descriptor = "I")
	private int anInt7187;

	@OriginalMember(owner = "client!naa", name = "R", descriptor = "Z")
	private boolean aBoolean523;

	@OriginalMember(owner = "client!naa", name = "W", descriptor = "Lclient!jagtheora/theora/DecoderContext;")
	private DecoderContext aDecoderContext1;

	@OriginalMember(owner = "client!naa", name = "Z", descriptor = "Lclient!jagtheora/theora/SetupInfo;")
	private final SetupInfo aSetupInfo1 = new SetupInfo();

	@OriginalMember(owner = "client!naa", name = "w", descriptor = "Lclient!jagtheora/theora/TheoraInfo;")
	private final TheoraInfo aTheoraInfo1 = new TheoraInfo();

	@OriginalMember(owner = "client!naa", name = "z", descriptor = "Lclient!jagtheora/theora/TheoraComment;")
	private final TheoraComment aTheoraComment1 = new TheoraComment();

	@OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub5_Sub2(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lclient!ha;I)Lclient!mi;")
	public Class46 method6127(@OriginalArg(0) Class20 arg0) {
		if (this.aFrame3 == null) {
			return null;
		} else if (this.aBoolean521 || this.aClass46_23 == null) {
			this.aClass46_23 = arg0.method7314(this.aFrame3.pixels, this.aFrame3.a, this.aFrame3.a, this.aFrame3.b, false);
			this.aBoolean521 = false;
			return this.aClass46_23;
		} else {
			return this.aClass46_23;
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(B)V")
	@Override
	public void method8257() {
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

	@OriginalMember(owner = "client!naa", name = "d", descriptor = "(I)Z")
	public boolean method6128() {
		return this.aBoolean522;
	}

	@OriginalMember(owner = "client!naa", name = "e", descriptor = "(I)F")
	public float method6129() {
		return this.aBoolean522 && !this.aTheoraInfo1.b() ? (float) this.aTheoraInfo1.fpsNumerator / (float) this.aTheoraInfo1.fpsDenominator : 0.0F;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(IB)V")
	private void method6130(@OriginalArg(0) int arg0) {
		this.anInt7179 = arg0;
		if (!this.aBoolean522) {
			return;
		}
		if (this.anInt7179 > this.anInt7187) {
			this.anInt7179 = this.anInt7187;
		}
		if (this.anInt7179 < 0) {
			this.anInt7179 = 0;
		}
		this.aDecoderContext1.setPostProcessingLevel(this.anInt7179);
	}

	@OriginalMember(owner = "client!naa", name = "f", descriptor = "(I)J")
	public long method6131() {
		return this.aLong176;
	}

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "(B)D")
	public double method6132() {
		return this.aDouble17;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method8260(@OriginalArg(1) OggPacket arg0) {
		@Pc(21) int local21;
		if (!this.aBoolean522) {
			local21 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local21 == 0) {
				this.aBoolean522 = true;
				if (this.aTheoraInfo1.frameWidth > 2048 || this.aTheoraInfo1.frameHeight > 1024) {
					throw new IllegalStateException();
				}
				this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
				this.aGranulePos1 = new GranulePos();
				this.aFrame3 = new Frame(this.aTheoraInfo1.frameWidth, this.aTheoraInfo1.frameHeight);
				this.anInt7187 = this.aDecoderContext1.getMaxPostProcessingLevel();
				this.method6130(this.anInt7179);
			} else if (local21 < 0) {
				throw new IllegalStateException(String.valueOf(local21));
			}
			return;
		}
		this.aLong176 = Static277.method5091();
		local21 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local21 < 0) {
			throw new IllegalStateException(String.valueOf(local21));
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble17 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean520) {
			@Pc(53) boolean local53 = arg0.isKeyFrame() == 1;
			if (!local53) {
				return;
			}
			this.aBoolean520 = false;
		}
		if (!this.aBoolean523 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame3) != 0) {
				throw new IllegalStateException(String.valueOf(local21));
			}
			this.aBoolean521 = true;
		}
	}
}
