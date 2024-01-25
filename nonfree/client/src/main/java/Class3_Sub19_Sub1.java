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

@OriginalClass("client!dv")
public final class Class3_Sub19_Sub1 extends Class3_Sub19 {

	@OriginalMember(owner = "client!dv", name = "u", descriptor = "I")
	private int anInt2452;

	@OriginalMember(owner = "client!dv", name = "x", descriptor = "Lclient!jagtheora/theora/DecoderContext;")
	private DecoderContext aDecoderContext1;

	@OriginalMember(owner = "client!dv", name = "y", descriptor = "Z")
	private boolean aBoolean194;

	@OriginalMember(owner = "client!dv", name = "z", descriptor = "I")
	private int anInt2454;

	@OriginalMember(owner = "client!dv", name = "C", descriptor = "Lclient!jagtheora/theora/Frame;")
	private Frame aFrame1;

	@OriginalMember(owner = "client!dv", name = "D", descriptor = "Z")
	private boolean aBoolean195;

	@OriginalMember(owner = "client!dv", name = "E", descriptor = "Z")
	private boolean aBoolean196;

	@OriginalMember(owner = "client!dv", name = "F", descriptor = "J")
	private long aLong75;

	@OriginalMember(owner = "client!dv", name = "J", descriptor = "Lclient!jagtheora/theora/GranulePos;")
	private GranulePos aGranulePos1;

	@OriginalMember(owner = "client!dv", name = "L", descriptor = "Lclient!vr;")
	private Class33 aClass33_5;

	@OriginalMember(owner = "client!dv", name = "O", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!dv", name = "Q", descriptor = "Z")
	private boolean aBoolean197;

	@OriginalMember(owner = "client!dv", name = "N", descriptor = "Lclient!jagtheora/theora/SetupInfo;")
	private final SetupInfo aSetupInfo1 = new SetupInfo();

	@OriginalMember(owner = "client!dv", name = "S", descriptor = "Lclient!jagtheora/theora/TheoraInfo;")
	private final TheoraInfo aTheoraInfo1 = new TheoraInfo();

	@OriginalMember(owner = "client!dv", name = "w", descriptor = "Lclient!jagtheora/theora/TheoraComment;")
	private final TheoraComment aTheoraComment1 = new TheoraComment();

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub19_Sub1(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)F")
	public float method2253() {
		return this.aBoolean197 && !this.aTheoraInfo1.a() ? (float) this.aTheoraInfo1.fpsNumerator / (float) this.aTheoraInfo1.fpsDenominator : 0.0F;
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)D")
	public double method2254() {
		return this.aDouble4;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ZI)V")
	private void method2255(@OriginalArg(1) int arg0) {
		this.anInt2452 = arg0;
		if (!this.aBoolean197) {
			return;
		}
		if (this.anInt2452 > this.anInt2454) {
			this.anInt2452 = this.anInt2454;
		}
		if (this.anInt2452 < 0) {
			this.anInt2452 = 0;
		}
		this.aDecoderContext1.setPostProcessingLevel(this.anInt2452);
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(Z)Z")
	public boolean method2256() {
		return this.aBoolean197;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	@Override
	protected void method8040(@OriginalArg(0) OggPacket arg0) {
		@Pc(22) int local22;
		if (!this.aBoolean197) {
			local22 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local22 == 0) {
				this.aBoolean197 = true;
				if (this.aTheoraInfo1.frameWidth <= 2048 && this.aTheoraInfo1.frameHeight <= 1024) {
					this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
					this.aGranulePos1 = new GranulePos();
					this.aFrame1 = new Frame(this.aTheoraInfo1.frameWidth, this.aTheoraInfo1.frameHeight);
					this.anInt2454 = this.aDecoderContext1.getMaxPostProcessingLevel();
					this.method2255(this.anInt2452);
					return;
				}
				throw new IllegalStateException();
			}
			if (local22 < 0) {
				throw new IllegalStateException(String.valueOf(local22));
			}
			return;
		}
		this.aLong75 = Static524.method7320();
		local22 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local22 < 0) {
			throw new IllegalStateException(String.valueOf(local22));
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble4 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean195) {
			@Pc(140) boolean local140 = arg0.isKeyFrame() == 1;
			if (!local140) {
				return;
			}
			this.aBoolean195 = false;
		}
		if (!this.aBoolean196 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame1) != 0) {
				throw new IllegalStateException(String.valueOf(local22));
			}
			this.aBoolean194 = true;
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILclient!ha;)Lclient!vr;")
	public Class33 method2257(@OriginalArg(1) Class13 arg0) {
		if (this.aFrame1 == null) {
			return null;
		} else if (this.aBoolean194 || this.aClass33_5 == null) {
			this.aClass33_5 = arg0.method8514(this.aFrame1.pixels, this.aFrame1.a, this.aFrame1.a, this.aFrame1.b, false);
			this.aBoolean194 = false;
			return this.aClass33_5;
		} else {
			return this.aClass33_5;
		}
	}

	@OriginalMember(owner = "client!dv", name = "d", descriptor = "(Z)J")
	public long method2258() {
		return this.aLong75;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
	@Override
	public void method8042() {
		if (this.aFrame1 != null) {
			this.aFrame1.b();
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
}
