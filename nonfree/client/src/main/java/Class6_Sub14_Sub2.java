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

@OriginalClass("client!k")
public final class Class6_Sub14_Sub2 extends Class6_Sub14 {

	@OriginalMember(owner = "client!k", name = "w", descriptor = "Lclient!jagtheora/theora/GranulePos;")
	private GranulePos aGranulePos1;

	@OriginalMember(owner = "client!k", name = "x", descriptor = "Z")
	private boolean aBoolean318;

	@OriginalMember(owner = "client!k", name = "y", descriptor = "Lclient!jagtheora/theora/Frame;")
	private Frame aFrame2;

	@OriginalMember(owner = "client!k", name = "B", descriptor = "Z")
	private boolean aBoolean319;

	@OriginalMember(owner = "client!k", name = "G", descriptor = "Z")
	private boolean aBoolean320;

	@OriginalMember(owner = "client!k", name = "H", descriptor = "D")
	private double aDouble90;

	@OriginalMember(owner = "client!k", name = "I", descriptor = "I")
	private int anInt4940;

	@OriginalMember(owner = "client!k", name = "J", descriptor = "J")
	private long aLong145;

	@OriginalMember(owner = "client!k", name = "R", descriptor = "I")
	private int anInt4945;

	@OriginalMember(owner = "client!k", name = "T", descriptor = "Lclient!jagtheora/theora/DecoderContext;")
	private DecoderContext aDecoderContext1;

	@OriginalMember(owner = "client!k", name = "V", descriptor = "Z")
	private boolean aBoolean321;

	@OriginalMember(owner = "client!k", name = "Z", descriptor = "Lclient!ho;")
	private Class9 aClass9_24;

	@OriginalMember(owner = "client!k", name = "F", descriptor = "Lclient!jagtheora/theora/SetupInfo;")
	private final SetupInfo aSetupInfo1 = new SetupInfo();

	@OriginalMember(owner = "client!k", name = "v", descriptor = "Lclient!jagtheora/theora/TheoraInfo;")
	private final TheoraInfo aTheoraInfo1 = new TheoraInfo();

	@OriginalMember(owner = "client!k", name = "L", descriptor = "Lclient!jagtheora/theora/TheoraComment;")
	private final TheoraComment aTheoraComment1 = new TheoraComment();

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class6_Sub14_Sub2(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(II)V")
	private void method4205(@OriginalArg(1) int arg0) {
		this.anInt4945 = arg0;
		if (!this.aBoolean318) {
			return;
		}
		if (this.anInt4940 < this.anInt4945) {
			this.anInt4945 = this.anInt4940;
		}
		if (this.anInt4945 < 0) {
			this.anInt4945 = 0;
		}
		this.aDecoderContext1.setPostProcessingLevel(this.anInt4945);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	@Override
	protected void method9061(@OriginalArg(0) OggPacket arg0) {
		@Pc(25) int local25;
		if (!this.aBoolean318) {
			local25 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local25 == 0) {
				this.aBoolean318 = true;
				if (this.aTheoraInfo1.frameWidth > 2048 || this.aTheoraInfo1.frameHeight > 1024) {
					throw new IllegalStateException();
				}
				this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
				this.aGranulePos1 = new GranulePos();
				this.aFrame2 = new Frame(this.aTheoraInfo1.frameWidth, this.aTheoraInfo1.frameHeight);
				this.anInt4940 = this.aDecoderContext1.getMaxPostProcessingLevel();
				this.method4205(this.anInt4945);
			} else if (local25 < 0) {
				throw new IllegalStateException(String.valueOf(local25));
			}
			return;
		}
		this.aLong145 = Static566.method7936();
		local25 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local25 < 0) {
			throw new IllegalStateException(String.valueOf(local25));
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble90 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean321) {
			@Pc(59) boolean local59 = arg0.isKeyFrame() == 1;
			if (!local59) {
				return;
			}
			this.aBoolean321 = false;
		}
		if (!this.aBoolean319 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame2) != 0) {
				throw new IllegalStateException(String.valueOf(local25));
			}
			this.aBoolean320 = true;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B)F")
	public float method4207() {
		return this.aBoolean318 && !this.aTheoraInfo1.a() ? (float) this.aTheoraInfo1.fpsNumerator / (float) this.aTheoraInfo1.fpsDenominator : 0.0F;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!ha;I)Lclient!ho;")
	public Class9 method4208(@OriginalArg(0) Class132 arg0) {
		if (this.aFrame2 == null) {
			return null;
		} else if (this.aBoolean320 || this.aClass9_24 == null) {
			this.aClass9_24 = arg0.method7507(this.aFrame2.pixels, this.aFrame2.b, this.aFrame2.b, this.aFrame2.a, false);
			this.aBoolean320 = false;
			return this.aClass9_24;
		} else {
			return this.aClass9_24;
		}
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(Z)Z")
	public boolean method4209() {
		return this.aBoolean318;
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(B)D")
	public double method4210() {
		return this.aDouble90;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)V")
	@Override
	public void method9058() {
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

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(I)J")
	public long method4211() {
		return this.aLong145;
	}
}
