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

@OriginalClass("client!ea")
public final class Class6_Sub13_Sub1 extends Class6_Sub13 {

	@OriginalMember(owner = "client!ea", name = "u", descriptor = "Z")
	private boolean aBoolean165;

	@OriginalMember(owner = "client!ea", name = "v", descriptor = "Lclient!jagtheora/theora/Frame;")
	private Frame aFrame4;

	@OriginalMember(owner = "client!ea", name = "A", descriptor = "Lclient!jagtheora/theora/DecoderContext;")
	private DecoderContext aDecoderContext1;

	@OriginalMember(owner = "client!ea", name = "F", descriptor = "Lclient!jagtheora/theora/GranulePos;")
	private GranulePos aGranulePos1;

	@OriginalMember(owner = "client!ea", name = "L", descriptor = "J")
	private long aLong59;

	@OriginalMember(owner = "client!ea", name = "M", descriptor = "Z")
	private boolean aBoolean166;

	@OriginalMember(owner = "client!ea", name = "O", descriptor = "I")
	private int anInt2284;

	@OriginalMember(owner = "client!ea", name = "R", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!ea", name = "S", descriptor = "Lclient!pga;")
	private Class32 aClass32_5;

	@OriginalMember(owner = "client!ea", name = "T", descriptor = "I")
	private int anInt2287;

	@OriginalMember(owner = "client!ea", name = "W", descriptor = "Z")
	private boolean aBoolean167;

	@OriginalMember(owner = "client!ea", name = "X", descriptor = "Z")
	private boolean aBoolean168;

	@OriginalMember(owner = "client!ea", name = "K", descriptor = "Lclient!jagtheora/theora/SetupInfo;")
	private final SetupInfo aSetupInfo1 = new SetupInfo();

	@OriginalMember(owner = "client!ea", name = "z", descriptor = "Lclient!jagtheora/theora/TheoraInfo;")
	private final TheoraInfo aTheoraInfo1 = new TheoraInfo();

	@OriginalMember(owner = "client!ea", name = "B", descriptor = "Lclient!jagtheora/theora/TheoraComment;")
	private final TheoraComment aTheoraComment1 = new TheoraComment();

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class6_Sub13_Sub1(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)F")
	public float method1907() {
		return this.aBoolean168 && !this.aTheoraInfo1.a() ? (float) this.aTheoraInfo1.fpsNumerator / (float) this.aTheoraInfo1.fpsDenominator : 0.0F;
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)J")
	public long method1908() {
		return this.aLong59;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V")
	private void method1909(@OriginalArg(1) int arg0) {
		this.anInt2284 = arg0;
		if (!this.aBoolean168) {
			return;
		}
		if (this.anInt2284 > this.anInt2287) {
			this.anInt2284 = this.anInt2287;
		}
		if (this.anInt2284 < 0) {
			this.anInt2284 = 0;
		}
		this.aDecoderContext1.setPostProcessingLevel(this.anInt2284);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	@Override
	protected void method6907(@OriginalArg(0) OggPacket arg0) {
		@Pc(15) int local15;
		if (!this.aBoolean168) {
			local15 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local15 == 0) {
				this.aBoolean168 = true;
				if (this.aTheoraInfo1.frameWidth > 2048 || this.aTheoraInfo1.frameHeight > 1024) {
					throw new IllegalStateException();
				}
				this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
				this.aGranulePos1 = new GranulePos();
				this.aFrame4 = new Frame(this.aTheoraInfo1.frameWidth, this.aTheoraInfo1.frameHeight);
				this.anInt2287 = this.aDecoderContext1.getMaxPostProcessingLevel();
				this.method1909(this.anInt2284);
			} else if (local15 < 0) {
				throw new IllegalStateException(String.valueOf(local15));
			}
			return;
		}
		this.aLong59 = Static32.method595();
		local15 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local15 < 0) {
			throw new IllegalStateException(String.valueOf(local15));
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble2 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean167) {
			@Pc(131) boolean local131 = arg0.isKeyFrame() == 1;
			if (!local131) {
				return;
			}
			this.aBoolean167 = false;
		}
		if (!this.aBoolean166 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame4) != 0) {
				throw new IllegalStateException(String.valueOf(local15));
			}
			this.aBoolean165 = true;
		}
	}

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)D")
	public double method1914() {
		return this.aDouble2;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLclient!ha;)Lclient!pga;")
	public Class32 method1915(@OriginalArg(1) Class100 arg0) {
		if (this.aFrame4 == null) {
			return null;
		} else if (this.aBoolean165 || this.aClass32_5 == null) {
			this.aClass32_5 = arg0.method8777(this.aFrame4.pixels, this.aFrame4.a, this.aFrame4.a, this.aFrame4.b, false);
			this.aBoolean165 = false;
			return this.aClass32_5;
		} else {
			return this.aClass32_5;
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)Z")
	public boolean method1916() {
		return this.aBoolean168;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	@Override
	public void method6910() {
		if (this.aFrame4 != null) {
			this.aFrame4.b();
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
}
