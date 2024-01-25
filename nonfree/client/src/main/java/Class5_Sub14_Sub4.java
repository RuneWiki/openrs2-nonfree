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

@OriginalClass("client!ue")
public final class Class5_Sub14_Sub4 extends Class5_Sub14 {

	@OriginalMember(owner = "client!ue", name = "H", descriptor = "Lclient!jagtheora/theora/GranulePos;")
	private GranulePos aGranulePos1;

	@OriginalMember(owner = "client!ue", name = "D", descriptor = "Z")
	private boolean aBoolean678;

	@OriginalMember(owner = "client!ue", name = "Y", descriptor = "Z")
	private boolean aBoolean679;

	@OriginalMember(owner = "client!ue", name = "L", descriptor = "D")
	private double aDouble32;

	@OriginalMember(owner = "client!ue", name = "M", descriptor = "Z")
	private boolean aBoolean680;

	@OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
	private int anInt9663;

	@OriginalMember(owner = "client!ue", name = "J", descriptor = "I")
	private int anInt9664;

	@OriginalMember(owner = "client!ue", name = "N", descriptor = "Z")
	private boolean aBoolean681;

	@OriginalMember(owner = "client!ue", name = "X", descriptor = "Lclient!jagtheora/theora/DecoderContext;")
	private DecoderContext aDecoderContext1;

	@OriginalMember(owner = "client!ue", name = "W", descriptor = "Lclient!hk;")
	private Class155 aClass155_32;

	@OriginalMember(owner = "client!ue", name = "C", descriptor = "J")
	private long aLong280;

	@OriginalMember(owner = "client!ue", name = "T", descriptor = "Lclient!jagtheora/theora/Frame;")
	private Frame aFrame3;

	@OriginalMember(owner = "client!ue", name = "w", descriptor = "Lclient!jagtheora/theora/SetupInfo;")
	private final SetupInfo aSetupInfo1 = new SetupInfo();

	@OriginalMember(owner = "client!ue", name = "E", descriptor = "Lclient!jagtheora/theora/TheoraInfo;")
	private final TheoraInfo aTheoraInfo1 = new TheoraInfo();

	@OriginalMember(owner = "client!ue", name = "y", descriptor = "Lclient!jagtheora/theora/TheoraComment;")
	private final TheoraComment aTheoraComment1 = new TheoraComment();

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class5_Sub14_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)V")
	private void method8234(@OriginalArg(1) int arg0) {
		this.anInt9663 = arg0;
		if (!this.aBoolean678) {
			return;
		}
		if (this.anInt9663 > this.anInt9664) {
			this.anInt9663 = this.anInt9664;
		}
		if (this.anInt9663 < 0) {
			this.anInt9663 = 0;
		}
		this.aDecoderContext1.setPostProcessingLevel(this.anInt9663);
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)Z")
	public boolean method8235() {
		return this.aBoolean678;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!ha;I)Lclient!hk;")
	public Class155 method8237(@OriginalArg(0) Class100 arg0) {
		if (this.aFrame3 == null) {
			return null;
		} else if (this.aBoolean679 || this.aClass155_32 == null) {
			this.aClass155_32 = arg0.method8636(this.aFrame3.pixels, this.aFrame3.b, this.aFrame3.b, this.aFrame3.a, false);
			this.aBoolean679 = false;
			return this.aClass155_32;
		} else {
			return this.aClass155_32;
		}
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)D")
	public double method8239() {
		return this.aDouble32;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method8230(@OriginalArg(1) OggPacket arg0) {
		@Pc(22) int local22;
		if (!this.aBoolean678) {
			local22 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local22 == 0) {
				this.aBoolean678 = true;
				if (this.aTheoraInfo1.frameWidth > 2048 || this.aTheoraInfo1.frameHeight > 1024) {
					throw new IllegalStateException();
				}
				this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
				this.aGranulePos1 = new GranulePos();
				this.aFrame3 = new Frame(this.aTheoraInfo1.frameWidth, this.aTheoraInfo1.frameHeight);
				this.anInt9664 = this.aDecoderContext1.getMaxPostProcessingLevel();
				this.method8234(this.anInt9663);
			} else if (local22 < 0) {
				throw new IllegalStateException(String.valueOf(local22));
			}
			return;
		}
		this.aLong280 = Static480.method6763();
		local22 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local22 < 0) {
			throw new IllegalStateException(String.valueOf(local22));
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble32 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean680) {
			@Pc(148) boolean local148 = arg0.isKeyFrame() == 1;
			if (!local148) {
				return;
			}
			this.aBoolean680 = false;
		}
		if (!this.aBoolean681 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame3) != 0) {
				throw new IllegalStateException(String.valueOf(local22));
			}
			this.aBoolean679 = true;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)F")
	public float method8240() {
		return this.aBoolean678 && !this.aTheoraInfo1.b() ? (float) this.aTheoraInfo1.fpsNumerator / (float) this.aTheoraInfo1.fpsDenominator : 0.0F;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
	@Override
	public void method8231() {
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

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)J")
	public long method8243() {
		return this.aLong280;
	}
}
