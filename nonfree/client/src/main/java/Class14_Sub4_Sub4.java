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

@OriginalClass("client!wca")
public final class Class14_Sub4_Sub4 extends Class14_Sub4 {

	@OriginalMember(owner = "client!wca", name = "O", descriptor = "Z")
	private boolean aBoolean760;

	@OriginalMember(owner = "client!wca", name = "J", descriptor = "I")
	private int anInt10927;

	@OriginalMember(owner = "client!wca", name = "D", descriptor = "Lclient!jagtheora/theora/GranulePos;")
	private GranulePos aGranulePos1;

	@OriginalMember(owner = "client!wca", name = "G", descriptor = "Lclient!jagtheora/theora/DecoderContext;")
	private DecoderContext aDecoderContext1;

	@OriginalMember(owner = "client!wca", name = "x", descriptor = "Z")
	private boolean aBoolean761;

	@OriginalMember(owner = "client!wca", name = "v", descriptor = "I")
	private int anInt10932;

	@OriginalMember(owner = "client!wca", name = "H", descriptor = "Lclient!fia;")
	private Class45 aClass45_34;

	@OriginalMember(owner = "client!wca", name = "P", descriptor = "D")
	private double aDouble25;

	@OriginalMember(owner = "client!wca", name = "A", descriptor = "Lclient!jagtheora/theora/Frame;")
	private Frame aFrame3;

	@OriginalMember(owner = "client!wca", name = "C", descriptor = "Z")
	private boolean aBoolean762;

	@OriginalMember(owner = "client!wca", name = "u", descriptor = "Z")
	private boolean aBoolean763;

	@OriginalMember(owner = "client!wca", name = "y", descriptor = "J")
	private long aLong319;

	@OriginalMember(owner = "client!wca", name = "w", descriptor = "Lclient!jagtheora/theora/SetupInfo;")
	private final SetupInfo aSetupInfo1 = new SetupInfo();

	@OriginalMember(owner = "client!wca", name = "z", descriptor = "Lclient!jagtheora/theora/TheoraInfo;")
	private final TheoraInfo aTheoraInfo1 = new TheoraInfo();

	@OriginalMember(owner = "client!wca", name = "Q", descriptor = "Lclient!jagtheora/theora/TheoraComment;")
	private final TheoraComment aTheoraComment1 = new TheoraComment();

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class14_Sub4_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!ha;B)Lclient!fia;")
	public Class45 method9269(@OriginalArg(0) Class144 arg0) {
		if (this.aFrame3 == null) {
			return null;
		} else if (this.aBoolean760 || this.aClass45_34 == null) {
			this.aClass45_34 = arg0.method6935(this.aFrame3.pixels, this.aFrame3.a, this.aFrame3.a, this.aFrame3.b, false);
			this.aBoolean760 = false;
			return this.aClass45_34;
		} else {
			return this.aClass45_34;
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	@Override
	protected void method9266(@OriginalArg(0) OggPacket arg0) {
		@Pc(17) int local17;
		if (!this.aBoolean763) {
			local17 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local17 == 0) {
				this.aBoolean763 = true;
				if (this.aTheoraInfo1.frameWidth > 2048 || this.aTheoraInfo1.frameHeight > 1024) {
					throw new IllegalStateException();
				}
				this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
				this.aGranulePos1 = new GranulePos();
				this.aFrame3 = new Frame(this.aTheoraInfo1.frameWidth, this.aTheoraInfo1.frameHeight);
				this.anInt10927 = this.aDecoderContext1.getMaxPostProcessingLevel();
				this.method9275(this.anInt10932);
			} else if (local17 < 0) {
				throw new IllegalStateException(String.valueOf(local17));
			}
			return;
		}
		this.aLong319 = Static26.method382();
		local17 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local17 < 0) {
			throw new IllegalStateException(String.valueOf(local17));
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble25 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean761) {
			@Pc(53) boolean local53 = arg0.isKeyFrame() == 1;
			if (!local53) {
				return;
			}
			this.aBoolean761 = false;
		}
		if (!this.aBoolean762 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame3) != 0) {
				throw new IllegalStateException(String.valueOf(local17));
			}
			this.aBoolean760 = true;
		}
	}

	@OriginalMember(owner = "client!wca", name = "d", descriptor = "(I)V")
	@Override
	public void method9267() {
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

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(Z)F")
	public float method9271() {
		return this.aBoolean763 && !this.aTheoraInfo1.a() ? (float) this.aTheoraInfo1.fpsNumerator / (float) this.aTheoraInfo1.fpsDenominator : 0.0F;
	}

	@OriginalMember(owner = "client!wca", name = "d", descriptor = "(Z)D")
	public double method9272() {
		return this.aDouble25;
	}

	@OriginalMember(owner = "client!wca", name = "e", descriptor = "(I)Z")
	public boolean method9273() {
		return this.aBoolean763;
	}

	@OriginalMember(owner = "client!wca", name = "c", descriptor = "(Z)J")
	public long method9274() {
		return this.aLong319;
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(II)V")
	private void method9275(@OriginalArg(0) int arg0) {
		this.anInt10932 = arg0;
		if (!this.aBoolean763) {
			return;
		}
		if (this.anInt10927 < this.anInt10932) {
			this.anInt10932 = this.anInt10927;
		}
		if (this.anInt10932 < 0) {
			this.anInt10932 = 0;
		}
		this.aDecoderContext1.setPostProcessingLevel(this.anInt10932);
	}
}
