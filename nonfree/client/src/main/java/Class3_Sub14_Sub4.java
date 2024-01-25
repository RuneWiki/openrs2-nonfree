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

@OriginalClass("client!u")
public final class Class3_Sub14_Sub4 extends Class3_Sub14 {

	@OriginalMember(owner = "client!u", name = "q", descriptor = "Z")
	private boolean aBoolean664;

	@OriginalMember(owner = "client!u", name = "r", descriptor = "D")
	private double aDouble24;

	@OriginalMember(owner = "client!u", name = "s", descriptor = "Lclient!hh;")
	private Class6 aClass6_36;

	@OriginalMember(owner = "client!u", name = "u", descriptor = "Lclient!jagtheora/theora/Frame;")
	private Frame aFrame3;

	@OriginalMember(owner = "client!u", name = "x", descriptor = "Z")
	private boolean aBoolean665;

	@OriginalMember(owner = "client!u", name = "C", descriptor = "J")
	private long aLong272;

	@OriginalMember(owner = "client!u", name = "H", descriptor = "Lclient!jagtheora/theora/GranulePos;")
	private GranulePos aGranulePos1;

	@OriginalMember(owner = "client!u", name = "I", descriptor = "Lclient!jagtheora/theora/DecoderContext;")
	private DecoderContext aDecoderContext1;

	@OriginalMember(owner = "client!u", name = "J", descriptor = "Z")
	private boolean aBoolean667;

	@OriginalMember(owner = "client!u", name = "L", descriptor = "I")
	private int anInt9600;

	@OriginalMember(owner = "client!u", name = "P", descriptor = "Z")
	private boolean aBoolean668;

	@OriginalMember(owner = "client!u", name = "S", descriptor = "I")
	private int anInt9605;

	@OriginalMember(owner = "client!u", name = "D", descriptor = "Lclient!jagtheora/theora/SetupInfo;")
	private final SetupInfo aSetupInfo1 = new SetupInfo();

	@OriginalMember(owner = "client!u", name = "z", descriptor = "Lclient!jagtheora/theora/TheoraInfo;")
	private final TheoraInfo aTheoraInfo1 = new TheoraInfo();

	@OriginalMember(owner = "client!u", name = "R", descriptor = "Lclient!jagtheora/theora/TheoraComment;")
	private final TheoraComment aTheoraComment1 = new TheoraComment();

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub14_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)D")
	public double method7822() {
		return this.aDouble24;
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(I)J")
	public long method7823() {
		return this.aLong272;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
	@Override
	public void method7818() {
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

	@OriginalMember(owner = "client!u", name = "f", descriptor = "(I)Z")
	public boolean method7824() {
		return this.aBoolean664;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)F")
	public float method7825() {
		return this.aBoolean664 && !this.aTheoraInfo1.a() ? (float) this.aTheoraInfo1.fpsNumerator / (float) this.aTheoraInfo1.fpsDenominator : 0.0F;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	@Override
	protected void method7821(@OriginalArg(0) OggPacket arg0) {
		@Pc(19) int local19;
		if (!this.aBoolean664) {
			local19 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local19 == 0) {
				this.aBoolean664 = true;
				if (this.aTheoraInfo1.frameWidth > 2048 || this.aTheoraInfo1.frameHeight > 1024) {
					throw new IllegalStateException();
				}
				this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
				this.aGranulePos1 = new GranulePos();
				this.aFrame3 = new Frame(this.aTheoraInfo1.frameWidth, this.aTheoraInfo1.frameHeight);
				this.anInt9600 = this.aDecoderContext1.getMaxPostProcessingLevel();
				this.method7830(this.anInt9605);
			} else if (local19 < 0) {
				throw new IllegalStateException(String.valueOf(local19));
			}
			return;
		}
		this.aLong272 = Static15.method380();
		local19 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local19 < 0) {
			throw new IllegalStateException(String.valueOf(local19));
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble24 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean667) {
			@Pc(56) boolean local56 = arg0.isKeyFrame() == 1;
			if (!local56) {
				return;
			}
			this.aBoolean667 = false;
		}
		if (!this.aBoolean665 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame3) != 0) {
				throw new IllegalStateException(String.valueOf(local19));
			}
			this.aBoolean668 = true;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!ha;)Lclient!hh;")
	public Class6 method7827(@OriginalArg(1) Class95 arg0) {
		if (this.aFrame3 == null) {
			return null;
		} else if (this.aBoolean668 || this.aClass6_36 == null) {
			this.aClass6_36 = arg0.method8005(this.aFrame3.pixels, this.aFrame3.a, this.aFrame3.a, this.aFrame3.b, false);
			this.aBoolean668 = false;
			return this.aClass6_36;
		} else {
			return this.aClass6_36;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)V")
	private void method7830(@OriginalArg(0) int arg0) {
		this.anInt9605 = arg0;
		if (!this.aBoolean664) {
			return;
		}
		if (this.anInt9605 > this.anInt9600) {
			this.anInt9605 = this.anInt9600;
		}
		if (this.anInt9605 < 0) {
			this.anInt9605 = 0;
		}
		this.aDecoderContext1.setPostProcessingLevel(this.anInt9605);
	}
}
