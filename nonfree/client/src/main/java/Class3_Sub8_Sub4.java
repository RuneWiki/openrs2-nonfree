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

@OriginalClass("client!vs")
public final class Class3_Sub8_Sub4 extends Class3_Sub8 {

	@OriginalMember(owner = "client!vs", name = "A", descriptor = "Z")
	private boolean aBoolean785;

	@OriginalMember(owner = "client!vs", name = "D", descriptor = "Lclient!jagtheora/theora/GranulePos;")
	private GranulePos aGranulePos1;

	@OriginalMember(owner = "client!vs", name = "Q", descriptor = "I")
	private int anInt10916;

	@OriginalMember(owner = "client!vs", name = "y", descriptor = "I")
	private int anInt10917;

	@OriginalMember(owner = "client!vs", name = "R", descriptor = "Lclient!bka;")
	private Class9 aClass9_35;

	@OriginalMember(owner = "client!vs", name = "v", descriptor = "Z")
	private boolean aBoolean786;

	@OriginalMember(owner = "client!vs", name = "G", descriptor = "Lclient!jagtheora/theora/DecoderContext;")
	private DecoderContext aDecoderContext1;

	@OriginalMember(owner = "client!vs", name = "K", descriptor = "Lclient!jagtheora/theora/Frame;")
	private Frame aFrame3;

	@OriginalMember(owner = "client!vs", name = "N", descriptor = "Z")
	private boolean aBoolean787;

	@OriginalMember(owner = "client!vs", name = "O", descriptor = "Z")
	private boolean aBoolean788;

	@OriginalMember(owner = "client!vs", name = "P", descriptor = "J")
	private long aLong370;

	@OriginalMember(owner = "client!vs", name = "z", descriptor = "D")
	private double aDouble27;

	@OriginalMember(owner = "client!vs", name = "r", descriptor = "Lclient!jagtheora/theora/SetupInfo;")
	private final SetupInfo aSetupInfo1 = new SetupInfo();

	@OriginalMember(owner = "client!vs", name = "u", descriptor = "Lclient!jagtheora/theora/TheoraInfo;")
	private final TheoraInfo aTheoraInfo1 = new TheoraInfo();

	@OriginalMember(owner = "client!vs", name = "I", descriptor = "Lclient!jagtheora/theora/TheoraComment;")
	private final TheoraComment aTheoraComment1 = new TheoraComment();

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub8_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "(I)J")
	public long method9115() {
		return this.aLong370;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)V")
	private void method9116(@OriginalArg(1) int arg0) {
		this.anInt10917 = arg0;
		if (!this.aBoolean787) {
			return;
		}
		if (this.anInt10916 < this.anInt10917) {
			this.anInt10917 = this.anInt10916;
		}
		if (this.anInt10917 < 0) {
			this.anInt10917 = 0;
		}
		this.aDecoderContext1.setPostProcessingLevel(this.anInt10917);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method9112(@OriginalArg(1) OggPacket arg0) {
		@Pc(20) int local20;
		if (!this.aBoolean787) {
			local20 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local20 == 0) {
				this.aBoolean787 = true;
				if (this.aTheoraInfo1.frameWidth > 2048 || this.aTheoraInfo1.frameHeight > 1024) {
					throw new IllegalStateException();
				}
				this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
				this.aGranulePos1 = new GranulePos();
				this.aFrame3 = new Frame(this.aTheoraInfo1.frameWidth, this.aTheoraInfo1.frameHeight);
				this.anInt10916 = this.aDecoderContext1.getMaxPostProcessingLevel();
				this.method9116(this.anInt10917);
			} else if (local20 < 0) {
				throw new IllegalStateException(String.valueOf(local20));
			}
			return;
		}
		this.aLong370 = Static626.method8479();
		local20 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local20 < 0) {
			throw new IllegalStateException(String.valueOf(local20));
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble27 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean788) {
			@Pc(141) boolean local141 = arg0.isKeyFrame() == 1;
			if (!local141) {
				return;
			}
			this.aBoolean788 = false;
		}
		if (!this.aBoolean786 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame3) != 0) {
				throw new IllegalStateException(String.valueOf(local20));
			}
			this.aBoolean785 = true;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
	@Override
	public void method9114() {
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

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "(B)F")
	public float method9118() {
		return this.aBoolean787 && !this.aTheoraInfo1.a() ? (float) this.aTheoraInfo1.fpsNumerator / (float) this.aTheoraInfo1.fpsDenominator : 0.0F;
	}

	@OriginalMember(owner = "client!vs", name = "g", descriptor = "(B)Z")
	public boolean method9119() {
		return this.aBoolean787;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(BLclient!ha;)Lclient!bka;")
	public Class9 method9120(@OriginalArg(1) Class67 arg0) {
		if (this.aFrame3 == null) {
			return null;
		} else if (this.aBoolean785 || this.aClass9_35 == null) {
			this.aClass9_35 = arg0.method7686(this.aFrame3.pixels, this.aFrame3.a, this.aFrame3.a, this.aFrame3.b, false);
			this.aBoolean785 = false;
			return this.aClass9_35;
		} else {
			return this.aClass9_35;
		}
	}

	@OriginalMember(owner = "client!vs", name = "f", descriptor = "(B)D")
	public double method9123() {
		return this.aDouble27;
	}
}
