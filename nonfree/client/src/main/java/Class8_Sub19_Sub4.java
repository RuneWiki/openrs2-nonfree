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

@OriginalClass("client!uea")
public final class Class8_Sub19_Sub4 extends Class8_Sub19 {

	@OriginalMember(owner = "client!uea", name = "v", descriptor = "Z")
	private boolean aBoolean692;

	@OriginalMember(owner = "client!uea", name = "w", descriptor = "Lclient!hu;")
	private Class21 aClass21_32;

	@OriginalMember(owner = "client!uea", name = "x", descriptor = "J")
	private long aLong256;

	@OriginalMember(owner = "client!uea", name = "y", descriptor = "I")
	private int anInt9775;

	@OriginalMember(owner = "client!uea", name = "A", descriptor = "Lclient!jagtheora/theora/Frame;")
	private Frame aFrame2;

	@OriginalMember(owner = "client!uea", name = "C", descriptor = "Z")
	private boolean aBoolean693;

	@OriginalMember(owner = "client!uea", name = "E", descriptor = "D")
	private double aDouble26;

	@OriginalMember(owner = "client!uea", name = "K", descriptor = "Z")
	private boolean aBoolean694;

	@OriginalMember(owner = "client!uea", name = "O", descriptor = "I")
	private int anInt9783;

	@OriginalMember(owner = "client!uea", name = "P", descriptor = "Lclient!jagtheora/theora/GranulePos;")
	private GranulePos aGranulePos1;

	@OriginalMember(owner = "client!uea", name = "V", descriptor = "Lclient!jagtheora/theora/DecoderContext;")
	private DecoderContext aDecoderContext1;

	@OriginalMember(owner = "client!uea", name = "X", descriptor = "Z")
	private boolean aBoolean695;

	@OriginalMember(owner = "client!uea", name = "F", descriptor = "Lclient!jagtheora/theora/SetupInfo;")
	private final SetupInfo aSetupInfo1 = new SetupInfo();

	@OriginalMember(owner = "client!uea", name = "H", descriptor = "Lclient!jagtheora/theora/TheoraInfo;")
	private final TheoraInfo aTheoraInfo1 = new TheoraInfo();

	@OriginalMember(owner = "client!uea", name = "J", descriptor = "Lclient!jagtheora/theora/TheoraComment;")
	private final TheoraComment aTheoraComment1 = new TheoraComment();

	@OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class8_Sub19_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!uea", name = "f", descriptor = "(I)V")
	@Override
	public void method7896() {
		if (this.aFrame2 != null) {
			this.aFrame2.a();
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

	@OriginalMember(owner = "client!uea", name = "g", descriptor = "(I)J")
	public long method7897() {
		return this.aLong256;
	}

	@OriginalMember(owner = "client!uea", name = "h", descriptor = "(I)Z")
	public boolean method7898() {
		return this.aBoolean692;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(ILclient!ha;)Lclient!hu;")
	public Class21 method7899(@OriginalArg(1) Class16 arg0) {
		if (this.aFrame2 == null) {
			return null;
		} else if (this.aBoolean695 || this.aClass21_32 == null) {
			this.aClass21_32 = arg0.method6054(this.aFrame2.pixels, this.aFrame2.a, this.aFrame2.a, this.aFrame2.b, false);
			this.aBoolean695 = false;
			return this.aClass21_32;
		} else {
			return this.aClass21_32;
		}
	}

	@OriginalMember(owner = "client!uea", name = "i", descriptor = "(I)F")
	public float method7900() {
		return this.aBoolean692 && !this.aTheoraInfo1.b() ? (float) this.aTheoraInfo1.fpsNumerator / (float) this.aTheoraInfo1.fpsDenominator : 0.0F;
	}

	@OriginalMember(owner = "client!uea", name = "j", descriptor = "(I)D")
	public double method7903() {
		return this.aDouble26;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	@Override
	protected void method7895(@OriginalArg(0) OggPacket arg0) {
		@Pc(23) int local23;
		if (!this.aBoolean692) {
			local23 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local23 == 0) {
				this.aBoolean692 = true;
				if (this.aTheoraInfo1.frameWidth > 2048 || this.aTheoraInfo1.frameHeight > 1024) {
					throw new IllegalStateException();
				}
				this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
				this.aGranulePos1 = new GranulePos();
				this.aFrame2 = new Frame(this.aTheoraInfo1.frameWidth, this.aTheoraInfo1.frameHeight);
				this.anInt9783 = this.aDecoderContext1.getMaxPostProcessingLevel();
				this.method7907(this.anInt9775);
			} else if (local23 < 0) {
				throw new IllegalStateException(String.valueOf(local23));
			}
			return;
		}
		this.aLong256 = Static342.method5463();
		local23 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local23 < 0) {
			throw new IllegalStateException(String.valueOf(local23));
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble26 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean693) {
			@Pc(139) boolean local139 = arg0.isKeyFrame() == 1;
			if (!local139) {
				return;
			}
			this.aBoolean693 = false;
		}
		if (!this.aBoolean694 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame2) != 0) {
				throw new IllegalStateException(String.valueOf(local23));
			}
			this.aBoolean695 = true;
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(II)V")
	private void method7907(@OriginalArg(1) int arg0) {
		this.anInt9775 = arg0;
		if (!this.aBoolean692) {
			return;
		}
		if (this.anInt9775 > this.anInt9783) {
			this.anInt9775 = this.anInt9783;
		}
		if (this.anInt9775 < 0) {
			this.anInt9775 = 0;
		}
		this.aDecoderContext1.setPostProcessingLevel(this.anInt9775);
	}
}
