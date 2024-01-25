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

@OriginalClass("client!sv")
public final class Class5_Sub12_Sub3 extends Class5_Sub12 {

	@OriginalMember(owner = "client!sv", name = "O", descriptor = "Lclient!jagtheora/theora/Frame;")
	private Frame aFrame2;

	@OriginalMember(owner = "client!sv", name = "X", descriptor = "Z")
	private boolean aBoolean715;

	@OriginalMember(owner = "client!sv", name = "L", descriptor = "I")
	private int anInt9353;

	@OriginalMember(owner = "client!sv", name = "w", descriptor = "Z")
	private boolean aBoolean716;

	@OriginalMember(owner = "client!sv", name = "J", descriptor = "I")
	private int anInt9358;

	@OriginalMember(owner = "client!sv", name = "M", descriptor = "Z")
	private boolean aBoolean717;

	@OriginalMember(owner = "client!sv", name = "F", descriptor = "D")
	private double aDouble19;

	@OriginalMember(owner = "client!sv", name = "B", descriptor = "Lclient!jagtheora/theora/GranulePos;")
	private GranulePos aGranulePos1;

	@OriginalMember(owner = "client!sv", name = "W", descriptor = "Z")
	private boolean aBoolean718;

	@OriginalMember(owner = "client!sv", name = "z", descriptor = "J")
	private long aLong273;

	@OriginalMember(owner = "client!sv", name = "U", descriptor = "Lclient!fs;")
	private Class134 aClass134_35;

	@OriginalMember(owner = "client!sv", name = "G", descriptor = "Lclient!jagtheora/theora/DecoderContext;")
	private DecoderContext aDecoderContext1;

	@OriginalMember(owner = "client!sv", name = "E", descriptor = "Lclient!jagtheora/theora/SetupInfo;")
	private final SetupInfo aSetupInfo1 = new SetupInfo();

	@OriginalMember(owner = "client!sv", name = "C", descriptor = "Lclient!jagtheora/theora/TheoraInfo;")
	private final TheoraInfo aTheoraInfo1 = new TheoraInfo();

	@OriginalMember(owner = "client!sv", name = "x", descriptor = "Lclient!jagtheora/theora/TheoraComment;")
	private final TheoraComment aTheoraComment1 = new TheoraComment();

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class5_Sub12_Sub3(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(B)V")
	@Override
	public void method8413() {
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

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(B)J")
	public long method8022() {
		return this.aLong273;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	@Override
	protected void method8408(@OriginalArg(0) OggPacket arg0) {
		@Pc(23) int local23;
		if (!this.aBoolean716) {
			local23 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local23 == 0) {
				this.aBoolean716 = true;
				if (this.aTheoraInfo1.frameWidth > 2048 || this.aTheoraInfo1.frameHeight > 1024) {
					throw new IllegalStateException();
				}
				this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
				this.aGranulePos1 = new GranulePos();
				this.aFrame2 = new Frame(this.aTheoraInfo1.frameWidth, this.aTheoraInfo1.frameHeight);
				this.anInt9353 = this.aDecoderContext1.getMaxPostProcessingLevel();
				this.method8024(this.anInt9358);
			} else if (local23 < 0) {
				throw new IllegalStateException(String.valueOf(local23));
			}
			return;
		}
		this.aLong273 = Static515.method7499(125);
		local23 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local23 < 0) {
			throw new IllegalStateException(String.valueOf(local23));
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble19 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean717) {
			@Pc(151) boolean local151 = arg0.isKeyFrame() == 1;
			if (!local151) {
				return;
			}
			this.aBoolean717 = false;
		}
		if (!this.aBoolean715 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame2) != 0) {
				throw new IllegalStateException(String.valueOf(local23));
			}
			this.aBoolean718 = true;
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IB)V")
	private void method8024(@OriginalArg(0) int arg0) {
		this.anInt9358 = arg0;
		if (!this.aBoolean716) {
			return;
		}
		if (this.anInt9358 > this.anInt9353) {
			this.anInt9358 = this.anInt9353;
		}
		if (this.anInt9358 < 0) {
			this.anInt9358 = 0;
		}
		this.aDecoderContext1.setPostProcessingLevel(this.anInt9358);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Z)Z")
	public boolean method8025() {
		return this.aBoolean716;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!ha;B)Lclient!fs;")
	public Class134 method8026(@OriginalArg(0) Class57 arg0) {
		if (this.aFrame2 == null) {
			return null;
		} else if (this.aBoolean718 || this.aClass134_35 == null) {
			this.aClass134_35 = arg0.method7705(this.aFrame2.pixels, this.aFrame2.a, this.aFrame2.a, this.aFrame2.b, false);
			this.aBoolean718 = false;
			return this.aClass134_35;
		} else {
			return this.aClass134_35;
		}
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)D")
	public double method8027() {
		return this.aDouble19;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)F")
	public float method8028() {
		return this.aBoolean716 && !this.aTheoraInfo1.b() ? (float) this.aTheoraInfo1.fpsNumerator / (float) this.aTheoraInfo1.fpsDenominator : 0.0F;
	}
}
