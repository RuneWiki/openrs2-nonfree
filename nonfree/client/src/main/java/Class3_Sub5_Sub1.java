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

@OriginalClass("client!bd")
public final class Class3_Sub5_Sub1 extends Class3_Sub5 {

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "Z")
	private boolean aBoolean99;

	@OriginalMember(owner = "client!bd", name = "t", descriptor = "Lclient!jagtheora/theora/Frame;")
	private Frame aFrame1;

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
	private int anInt1131;

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "Z")
	private boolean aBoolean100;

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "Z")
	private boolean aBoolean101;

	@OriginalMember(owner = "client!bd", name = "z", descriptor = "Lclient!jagtheora/theora/DecoderContext;")
	private DecoderContext aDecoderContext1;

	@OriginalMember(owner = "client!bd", name = "B", descriptor = "D")
	private double aDouble10;

	@OriginalMember(owner = "client!bd", name = "G", descriptor = "Lclient!jagtheora/theora/GranulePos;")
	private GranulePos aGranulePos1;

	@OriginalMember(owner = "client!bd", name = "I", descriptor = "I")
	private int anInt1138;

	@OriginalMember(owner = "client!bd", name = "K", descriptor = "Z")
	private boolean aBoolean102;

	@OriginalMember(owner = "client!bd", name = "M", descriptor = "J")
	private long aLong21;

	@OriginalMember(owner = "client!bd", name = "O", descriptor = "Lclient!nf;")
	private Class102 aClass102_5;

	@OriginalMember(owner = "client!bd", name = "y", descriptor = "Lclient!jagtheora/theora/SetupInfo;")
	private final SetupInfo aSetupInfo1 = new SetupInfo();

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "Lclient!jagtheora/theora/TheoraInfo;")
	private final TheoraInfo aTheoraInfo1 = new TheoraInfo();

	@OriginalMember(owner = "client!bd", name = "L", descriptor = "Lclient!jagtheora/theora/TheoraComment;")
	private final TheoraComment aTheoraComment1 = new TheoraComment();

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub5_Sub1(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)F")
	public float method1141() {
		return this.aBoolean102 && !this.aTheoraInfo1.b() ? (float) this.aTheoraInfo1.fpsNumerator / (float) this.aTheoraInfo1.fpsDenominator : 0.0F;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)J")
	public long method1142() {
		return this.aLong21;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!ha;I)Lclient!nf;")
	public Class102 method1143(@OriginalArg(0) Class16 arg0) {
		if (this.aFrame1 == null) {
			return null;
		} else if (this.aBoolean100 || this.aClass102_5 == null) {
			this.aClass102_5 = arg0.method8194(this.aFrame1.pixels, this.aFrame1.a, this.aFrame1.a, this.aFrame1.b, false);
			this.aBoolean100 = false;
			return this.aClass102_5;
		} else {
			return this.aClass102_5;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V")
	private void method1144(@OriginalArg(1) int arg0) {
		this.anInt1131 = arg0;
		if (!this.aBoolean102) {
			return;
		}
		if (this.anInt1131 > this.anInt1138) {
			this.anInt1131 = this.anInt1138;
		}
		if (this.anInt1131 < 0) {
			this.anInt1131 = 0;
		}
		this.aDecoderContext1.setPostProcessingLevel(this.anInt1131);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method7526(@OriginalArg(1) OggPacket arg0) {
		@Pc(15) int local15;
		if (!this.aBoolean102) {
			local15 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local15 == 0) {
				this.aBoolean102 = true;
				if (this.aTheoraInfo1.frameWidth > 2048 || this.aTheoraInfo1.frameHeight > 1024) {
					throw new IllegalStateException();
				}
				this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
				this.aGranulePos1 = new GranulePos();
				this.aFrame1 = new Frame(this.aTheoraInfo1.frameWidth, this.aTheoraInfo1.frameHeight);
				this.anInt1138 = this.aDecoderContext1.getMaxPostProcessingLevel();
				this.method1144(this.anInt1131);
			} else if (local15 < 0) {
				throw new IllegalStateException(String.valueOf(local15));
			}
			return;
		}
		this.aLong21 = Static131.method2268();
		local15 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local15 < 0) {
			throw new IllegalStateException(String.valueOf(local15));
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble10 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean101) {
			@Pc(130) boolean local130 = arg0.isKeyFrame() == 1;
			if (!local130) {
				return;
			}
			this.aBoolean101 = false;
		}
		if (!this.aBoolean99 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame1) != 0) {
				throw new IllegalStateException(String.valueOf(local15));
			}
			this.aBoolean100 = true;
		}
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)Z")
	public boolean method1145() {
		return this.aBoolean102;
	}

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)D")
	public double method1146() {
		return this.aDouble10;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	@Override
	public void method7531() {
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
}
