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

@OriginalClass("client!rda")
public final class Class6_Sub37_Sub1 extends Class6_Sub37 {

	@OriginalMember(owner = "client!rda", name = "A", descriptor = "I")
	private int anInt8532;

	@OriginalMember(owner = "client!rda", name = "u", descriptor = "D")
	private double aDouble43;

	@OriginalMember(owner = "client!rda", name = "y", descriptor = "Lclient!jagtheora/theora/GranulePos;")
	private GranulePos aGranulePos1;

	@OriginalMember(owner = "client!rda", name = "H", descriptor = "J")
	private long aLong274;

	@OriginalMember(owner = "client!rda", name = "E", descriptor = "Z")
	private boolean aBoolean659;

	@OriginalMember(owner = "client!rda", name = "I", descriptor = "Z")
	private boolean aBoolean660;

	@OriginalMember(owner = "client!rda", name = "T", descriptor = "Z")
	private boolean aBoolean661;

	@OriginalMember(owner = "client!rda", name = "D", descriptor = "Lclient!tb;")
	private Class49 aClass49_31;

	@OriginalMember(owner = "client!rda", name = "B", descriptor = "Z")
	private boolean aBoolean662;

	@OriginalMember(owner = "client!rda", name = "F", descriptor = "I")
	private int anInt8538;

	@OriginalMember(owner = "client!rda", name = "J", descriptor = "Lclient!jagtheora/theora/DecoderContext;")
	private DecoderContext aDecoderContext1;

	@OriginalMember(owner = "client!rda", name = "O", descriptor = "Lclient!jagtheora/theora/Frame;")
	private Frame aFrame2;

	@OriginalMember(owner = "client!rda", name = "z", descriptor = "Lclient!jagtheora/theora/SetupInfo;")
	private final SetupInfo aSetupInfo1 = new SetupInfo();

	@OriginalMember(owner = "client!rda", name = "x", descriptor = "Lclient!jagtheora/theora/TheoraInfo;")
	private final TheoraInfo aTheoraInfo1 = new TheoraInfo();

	@OriginalMember(owner = "client!rda", name = "N", descriptor = "Lclient!jagtheora/theora/TheoraComment;")
	private final TheoraComment aTheoraComment1 = new TheoraComment();

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class6_Sub37_Sub1(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method8838(@OriginalArg(1) OggPacket arg0) {
		@Pc(24) int local24;
		if (!this.aBoolean661) {
			local24 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local24 == 0) {
				this.aBoolean661 = true;
				if (this.aTheoraInfo1.frameWidth > 2048 || this.aTheoraInfo1.frameHeight > 1024) {
					throw new IllegalStateException();
				}
				this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
				this.aGranulePos1 = new GranulePos();
				this.aFrame2 = new Frame(this.aTheoraInfo1.frameWidth, this.aTheoraInfo1.frameHeight);
				this.anInt8532 = this.aDecoderContext1.getMaxPostProcessingLevel();
				this.method7488(this.anInt8538);
			} else if (local24 < 0) {
				throw new IllegalStateException(String.valueOf(local24));
			}
			return;
		}
		this.aLong274 = Static549.method7758();
		local24 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local24 < 0) {
			throw new IllegalStateException(String.valueOf(local24));
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble43 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean662) {
			@Pc(63) boolean local63 = arg0.isKeyFrame() == 1;
			if (!local63) {
				return;
			}
			this.aBoolean662 = false;
		}
		if (!this.aBoolean659 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame2) != 0) {
				throw new IllegalStateException(String.valueOf(local24));
			}
			this.aBoolean660 = true;
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!ha;I)Lclient!tb;")
	public Class49 method7482(@OriginalArg(0) Class75 arg0) {
		if (this.aFrame2 == null) {
			return null;
		} else if (this.aBoolean660 || this.aClass49_31 == null) {
			this.aClass49_31 = arg0.method6675(this.aFrame2.pixels, this.aFrame2.b, this.aFrame2.b, this.aFrame2.a, false);
			this.aBoolean660 = false;
			return this.aClass49_31;
		} else {
			return this.aClass49_31;
		}
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(B)D")
	public double method7483() {
		return this.aDouble43;
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(I)Z")
	public boolean method7484() {
		return this.aBoolean661;
	}

	@OriginalMember(owner = "client!rda", name = "f", descriptor = "(I)J")
	public long method7486() {
		return this.aLong274;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(B)V")
	@Override
	public void method8837() {
		if (this.aFrame2 != null) {
			this.aFrame2.b();
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

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(II)V")
	private void method7488(@OriginalArg(0) int arg0) {
		this.anInt8538 = arg0;
		if (!this.aBoolean661) {
			return;
		}
		if (this.anInt8538 > this.anInt8532) {
			this.anInt8538 = this.anInt8532;
		}
		if (this.anInt8538 < 0) {
			this.anInt8538 = 0;
		}
		this.aDecoderContext1.setPostProcessingLevel(this.anInt8538);
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(I)F")
	public float method7490() {
		return this.aBoolean661 && !this.aTheoraInfo1.a() ? (float) this.aTheoraInfo1.fpsNumerator / (float) this.aTheoraInfo1.fpsDenominator : 0.0F;
	}
}
