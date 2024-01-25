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

@OriginalClass("client!gq")
public final class Class3_Sub6_Sub1 extends Class3_Sub6 {

	@OriginalMember(owner = "client!gq", name = "p", descriptor = "Z")
	private boolean aBoolean233;

	@OriginalMember(owner = "client!gq", name = "q", descriptor = "D")
	private double aDouble11;

	@OriginalMember(owner = "client!gq", name = "r", descriptor = "Lclient!jagtheora/theora/DecoderContext;")
	private DecoderContext aDecoderContext1;

	@OriginalMember(owner = "client!gq", name = "t", descriptor = "Z")
	private boolean aBoolean234;

	@OriginalMember(owner = "client!gq", name = "v", descriptor = "Z")
	private boolean aBoolean235;

	@OriginalMember(owner = "client!gq", name = "C", descriptor = "I")
	private int anInt3618;

	@OriginalMember(owner = "client!gq", name = "E", descriptor = "Lclient!jagtheora/theora/GranulePos;")
	private GranulePos aGranulePos1;

	@OriginalMember(owner = "client!gq", name = "H", descriptor = "Z")
	private boolean aBoolean237;

	@OriginalMember(owner = "client!gq", name = "I", descriptor = "I")
	private int anInt3621;

	@OriginalMember(owner = "client!gq", name = "M", descriptor = "Lclient!td;")
	private Class24 aClass24_11;

	@OriginalMember(owner = "client!gq", name = "N", descriptor = "Lclient!jagtheora/theora/Frame;")
	private Frame aFrame2;

	@OriginalMember(owner = "client!gq", name = "O", descriptor = "J")
	private long aLong104;

	@OriginalMember(owner = "client!gq", name = "G", descriptor = "Lclient!jagtheora/theora/SetupInfo;")
	private final SetupInfo aSetupInfo1 = new SetupInfo();

	@OriginalMember(owner = "client!gq", name = "J", descriptor = "Lclient!jagtheora/theora/TheoraInfo;")
	private final TheoraInfo aTheoraInfo1 = new TheoraInfo();

	@OriginalMember(owner = "client!gq", name = "L", descriptor = "Lclient!jagtheora/theora/TheoraComment;")
	private final TheoraComment aTheoraComment1 = new TheoraComment();

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub6_Sub1(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IB)V")
	private void method3253(@OriginalArg(0) int arg0) {
		this.anInt3621 = arg0;
		if (!this.aBoolean237) {
			return;
		}
		if (this.anInt3621 > this.anInt3618) {
			this.anInt3621 = this.anInt3618;
		}
		if (this.anInt3621 < 0) {
			this.anInt3621 = 0;
		}
		this.aDecoderContext1.setPostProcessingLevel(this.anInt3621);
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)F")
	public float method3254() {
		return this.aBoolean237 && !this.aTheoraInfo1.a() ? (float) this.aTheoraInfo1.fpsNumerator / (float) this.aTheoraInfo1.fpsDenominator : 0.0F;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(Z)D")
	public double method3255() {
		return this.aDouble11;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;Z)V")
	@Override
	protected void method8692(@OriginalArg(0) OggPacket arg0) {
		@Pc(15) int local15;
		if (!this.aBoolean237) {
			local15 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local15 == 0) {
				this.aBoolean237 = true;
				if (this.aTheoraInfo1.frameWidth > 2048 || this.aTheoraInfo1.frameHeight > 1024) {
					throw new IllegalStateException();
				}
				this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
				this.aGranulePos1 = new GranulePos();
				this.aFrame2 = new Frame(this.aTheoraInfo1.frameWidth, this.aTheoraInfo1.frameHeight);
				this.anInt3618 = this.aDecoderContext1.getMaxPostProcessingLevel();
				this.method3253(this.anInt3621);
			} else if (local15 < 0) {
				throw new IllegalStateException(String.valueOf(local15));
			}
			return;
		}
		this.aLong104 = Static374.method6036();
		local15 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local15 < 0) {
			throw new IllegalStateException(String.valueOf(local15));
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble11 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean234) {
			@Pc(124) boolean local124 = arg0.isKeyFrame() == 1;
			if (!local124) {
				return;
			}
			this.aBoolean234 = false;
		}
		if (!this.aBoolean235 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame2) != 0) {
				throw new IllegalStateException(String.valueOf(local15));
			}
			this.aBoolean233 = true;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V")
	@Override
	public void method8689() {
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

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)Z")
	public boolean method3259() {
		return this.aBoolean237;
	}

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "(B)J")
	public long method3260() {
		return this.aLong104;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!ha;I)Lclient!td;")
	public Class24 method3262(@OriginalArg(0) Class5 arg0) {
		if (this.aFrame2 == null) {
			return null;
		} else if (this.aBoolean233 || this.aClass24_11 == null) {
			this.aClass24_11 = arg0.method7563(this.aFrame2.pixels, this.aFrame2.a, this.aFrame2.a, this.aFrame2.b, false);
			this.aBoolean233 = false;
			return this.aClass24_11;
		} else {
			return this.aClass24_11;
		}
	}
}
