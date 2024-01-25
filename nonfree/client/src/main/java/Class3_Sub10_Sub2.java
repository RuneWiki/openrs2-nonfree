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

@OriginalClass("client!ce")
public final class Class3_Sub10_Sub2 extends Class3_Sub10 {

	@OriginalMember(owner = "client!ce", name = "t", descriptor = "Lclient!jagtheora/theora/Frame;")
	private Frame aFrame25;

	@OriginalMember(owner = "client!ce", name = "u", descriptor = "Z")
	private boolean aBoolean96;

	@OriginalMember(owner = "client!ce", name = "v", descriptor = "Z")
	private boolean aBoolean97;

	@OriginalMember(owner = "client!ce", name = "x", descriptor = "J")
	private long aLong36;

	@OriginalMember(owner = "client!ce", name = "y", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!ce", name = "F", descriptor = "I")
	private int anInt1265;

	@OriginalMember(owner = "client!ce", name = "G", descriptor = "Z")
	private boolean aBoolean98;

	@OriginalMember(owner = "client!ce", name = "K", descriptor = "Z")
	private boolean aBoolean99;

	@OriginalMember(owner = "client!ce", name = "L", descriptor = "Lclient!ac;")
	private Class5 aClass5_2;

	@OriginalMember(owner = "client!ce", name = "P", descriptor = "I")
	private int anInt1269;

	@OriginalMember(owner = "client!ce", name = "R", descriptor = "Lclient!jagtheora/theora/GranulePos;")
	private GranulePos aGranulePos1;

	@OriginalMember(owner = "client!ce", name = "T", descriptor = "Lclient!jagtheora/theora/DecoderContext;")
	private DecoderContext aDecoderContext1;

	@OriginalMember(owner = "client!ce", name = "J", descriptor = "Lclient!jagtheora/theora/SetupInfo;")
	private final SetupInfo aSetupInfo1 = new SetupInfo();

	@OriginalMember(owner = "client!ce", name = "H", descriptor = "Lclient!jagtheora/theora/TheoraInfo;")
	private final TheoraInfo aTheoraInfo1 = new TheoraInfo();

	@OriginalMember(owner = "client!ce", name = "Q", descriptor = "Lclient!jagtheora/theora/TheoraComment;")
	private final TheoraComment aTheoraComment1 = new TheoraComment();

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub10_Sub2(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!ha;B)Lclient!ac;")
	public Class5 method1303(@OriginalArg(0) Class33 arg0) {
		if (this.aFrame25 == null) {
			return null;
		} else if (this.aBoolean97 || this.aClass5_2 == null) {
			this.aClass5_2 = arg0.method6193(this.aFrame25.pixels, this.aFrame25.a, this.aFrame25.a, this.aFrame25.b, false);
			this.aBoolean97 = false;
			return this.aClass5_2;
		} else {
			return this.aClass5_2;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)V")
	private void method1304(@OriginalArg(0) int arg0) {
		this.anInt1265 = arg0;
		if (!this.aBoolean99) {
			return;
		}
		if (this.anInt1265 > this.anInt1269) {
			this.anInt1265 = this.anInt1269;
		}
		if (this.anInt1265 < 0) {
			this.anInt1265 = 0;
		}
		this.aDecoderContext1.setPostProcessingLevel(this.anInt1265);
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)F")
	public float method1305() {
		return this.aBoolean99 && !this.aTheoraInfo1.a() ? (float) this.aTheoraInfo1.fpsNumerator / (float) this.aTheoraInfo1.fpsDenominator : 0.0F;
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)Z")
	public boolean method1307() {
		return this.aBoolean99;
	}

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)J")
	public long method1308() {
		return this.aLong36;
	}

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "(I)D")
	public double method1311() {
		return this.aDouble6;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method6831(@OriginalArg(1) OggPacket arg0) {
		@Pc(21) int local21;
		if (!this.aBoolean99) {
			local21 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local21 == 0) {
				this.aBoolean99 = true;
				if (this.aTheoraInfo1.frameWidth > 2048 || this.aTheoraInfo1.frameHeight > 1024) {
					throw new IllegalStateException();
				}
				this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
				this.aGranulePos1 = new GranulePos();
				this.aFrame25 = new Frame(this.aTheoraInfo1.frameWidth, this.aTheoraInfo1.frameHeight);
				this.anInt1269 = this.aDecoderContext1.getMaxPostProcessingLevel();
				this.method1304(this.anInt1265);
			} else if (local21 < 0) {
				throw new IllegalStateException(String.valueOf(local21));
			}
			return;
		}
		this.aLong36 = Static444.method6719();
		local21 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local21 < 0) {
			throw new IllegalStateException(String.valueOf(local21));
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble6 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean96) {
			@Pc(56) boolean local56 = arg0.isKeyFrame() == 1;
			if (!local56) {
				return;
			}
			this.aBoolean96 = false;
		}
		if (!this.aBoolean98 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame25) != 0) {
				throw new IllegalStateException(String.valueOf(local21));
			}
			this.aBoolean97 = true;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V")
	@Override
	public void method6830() {
		if (this.aFrame25 != null) {
			this.aFrame25.b();
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
