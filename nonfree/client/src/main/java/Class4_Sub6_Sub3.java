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

@OriginalClass("client!fv")
public final class Class4_Sub6_Sub3 extends Class4_Sub6 {

	@OriginalMember(owner = "client!fv", name = "p", descriptor = "I")
	private int anInt3049;

	@OriginalMember(owner = "client!fv", name = "q", descriptor = "Lclient!tf;")
	private Class17 aClass17_27;

	@OriginalMember(owner = "client!fv", name = "u", descriptor = "Z")
	private boolean aBoolean225;

	@OriginalMember(owner = "client!fv", name = "x", descriptor = "Z")
	private boolean aBoolean226;

	@OriginalMember(owner = "client!fv", name = "B", descriptor = "D")
	private double aDouble14;

	@OriginalMember(owner = "client!fv", name = "C", descriptor = "Lclient!jagtheora/theora/GranulePos;")
	private GranulePos aGranulePos1;

	@OriginalMember(owner = "client!fv", name = "E", descriptor = "Lclient!jagtheora/theora/DecoderContext;")
	private DecoderContext aDecoderContext1;

	@OriginalMember(owner = "client!fv", name = "H", descriptor = "Lclient!jagtheora/theora/Frame;")
	private Frame aFrame6;

	@OriginalMember(owner = "client!fv", name = "J", descriptor = "Z")
	private boolean aBoolean227;

	@OriginalMember(owner = "client!fv", name = "L", descriptor = "J")
	private long aLong98;

	@OriginalMember(owner = "client!fv", name = "M", descriptor = "Z")
	private boolean aBoolean228;

	@OriginalMember(owner = "client!fv", name = "N", descriptor = "I")
	private int anInt3060;

	@OriginalMember(owner = "client!fv", name = "z", descriptor = "Lclient!jagtheora/theora/SetupInfo;")
	private final SetupInfo aSetupInfo1 = new SetupInfo();

	@OriginalMember(owner = "client!fv", name = "o", descriptor = "Lclient!jagtheora/theora/TheoraInfo;")
	private final TheoraInfo aTheoraInfo1 = new TheoraInfo();

	@OriginalMember(owner = "client!fv", name = "y", descriptor = "Lclient!jagtheora/theora/TheoraComment;")
	private final TheoraComment aTheoraComment1 = new TheoraComment();

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class4_Sub6_Sub3(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)Z")
	public boolean method2853() {
		return this.aBoolean226;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)V")
	private void method2854(@OriginalArg(1) int arg0) {
		this.anInt3049 = arg0;
		if (!this.aBoolean226) {
			return;
		}
		if (this.anInt3049 > this.anInt3060) {
			this.anInt3049 = this.anInt3060;
		}
		if (this.anInt3049 < 0) {
			this.anInt3049 = 0;
		}
		this.aDecoderContext1.setPostProcessingLevel(this.anInt3049);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method6634(@OriginalArg(1) OggPacket arg0) {
		@Pc(21) int local21;
		if (!this.aBoolean226) {
			local21 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local21 == 0) {
				this.aBoolean226 = true;
				if (this.aTheoraInfo1.frameWidth <= 2048 && this.aTheoraInfo1.frameHeight <= 1024) {
					this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
					this.aGranulePos1 = new GranulePos();
					this.aFrame6 = new Frame(this.aTheoraInfo1.frameWidth, this.aTheoraInfo1.frameHeight);
					this.anInt3060 = this.aDecoderContext1.getMaxPostProcessingLevel();
					this.method2854(this.anInt3049);
					return;
				}
				throw new IllegalStateException();
			}
			if (local21 < 0) {
				throw new IllegalStateException(String.valueOf(local21));
			}
			return;
		}
		this.aLong98 = Static429.method5935();
		local21 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local21 < 0) {
			throw new IllegalStateException(String.valueOf(local21));
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble14 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean227) {
			@Pc(133) boolean local133 = arg0.isKeyFrame() == 1;
			if (!local133) {
				return;
			}
			this.aBoolean227 = false;
		}
		if (!this.aBoolean225 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame6) != 0) {
				throw new IllegalStateException(String.valueOf(local21));
			}
			this.aBoolean228 = true;
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V")
	@Override
	public void method6631() {
		if (this.aFrame6 != null) {
			this.aFrame6.a();
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

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "(I)F")
	public float method2857() {
		return this.aBoolean226 && !this.aTheoraInfo1.b() ? (float) this.aTheoraInfo1.fpsNumerator / (float) this.aTheoraInfo1.fpsDenominator : 0.0F;
	}

	@OriginalMember(owner = "client!fv", name = "g", descriptor = "(I)D")
	public double method2859() {
		return this.aDouble14;
	}

	@OriginalMember(owner = "client!fv", name = "h", descriptor = "(I)J")
	public long method2860() {
		return this.aLong98;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!ha;B)Lclient!tf;")
	public Class17 method2861(@OriginalArg(0) Class33 arg0) {
		if (this.aFrame6 == null) {
			return null;
		} else if (this.aBoolean228 || this.aClass17_27 == null) {
			this.aClass17_27 = arg0.method8156(this.aFrame6.pixels, this.aFrame6.b, this.aFrame6.b, this.aFrame6.a, false);
			this.aBoolean228 = false;
			return this.aClass17_27;
		} else {
			return this.aClass17_27;
		}
	}
}
