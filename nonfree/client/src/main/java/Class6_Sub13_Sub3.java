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

@OriginalClass("client!sb")
public final class Class6_Sub13_Sub3 extends Class6_Sub13 {

	@OriginalMember(owner = "client!sb", name = "G", descriptor = "[I")
	public static final int[] anIntArray450 = new int[128];

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "Lclient!jagtheora/theora/Frame;")
	private Frame aFrame8;

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "Z")
	private boolean aBoolean705;

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "Z")
	private boolean aBoolean706;

	@OriginalMember(owner = "client!sb", name = "A", descriptor = "D")
	private double aDouble24;

	@OriginalMember(owner = "client!sb", name = "C", descriptor = "Z")
	private boolean aBoolean707;

	@OriginalMember(owner = "client!sb", name = "E", descriptor = "Lclient!ufa;")
	private Class4 aClass4_27;

	@OriginalMember(owner = "client!sb", name = "F", descriptor = "Lclient!jagtheora/theora/GranulePos;")
	private GranulePos aGranulePos1;

	@OriginalMember(owner = "client!sb", name = "J", descriptor = "J")
	private long aLong240;

	@OriginalMember(owner = "client!sb", name = "N", descriptor = "Lclient!jagtheora/theora/DecoderContext;")
	private DecoderContext aDecoderContext1;

	@OriginalMember(owner = "client!sb", name = "P", descriptor = "I")
	private int anInt8841;

	@OriginalMember(owner = "client!sb", name = "S", descriptor = "Z")
	private boolean aBoolean708;

	@OriginalMember(owner = "client!sb", name = "U", descriptor = "I")
	private int anInt8843;

	@OriginalMember(owner = "client!sb", name = "T", descriptor = "Lclient!jagtheora/theora/SetupInfo;")
	private final SetupInfo aSetupInfo1 = new SetupInfo();

	@OriginalMember(owner = "client!sb", name = "x", descriptor = "Lclient!jagtheora/theora/TheoraInfo;")
	private final TheoraInfo aTheoraInfo1 = new TheoraInfo();

	@OriginalMember(owner = "client!sb", name = "K", descriptor = "Lclient!jagtheora/theora/TheoraComment;")
	private final TheoraComment aTheoraComment1 = new TheoraComment();

	static {
		for (@Pc(6) int local6 = 0; local6 < anIntArray450.length; local6++) {
			anIntArray450[local6] = -1;
		}
		for (@Pc(18) int local18 = 65; local18 <= 90; local18++) {
			anIntArray450[local18] = local18 - 65;
		}
		for (@Pc(31) int local31 = 97; local31 <= 122; local31++) {
			anIntArray450[local31] = local31 - 71;
		}
		for (@Pc(46) int local46 = 48; local46 <= 57; local46++) {
			anIntArray450[local46] = local46 + 52 - 48;
		}
		anIntArray450[45] = anIntArray450[47] = 63;
		anIntArray450[42] = anIntArray450[43] = 62;
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class6_Sub13_Sub3(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V")
	private void method7334(@OriginalArg(0) int arg0) {
		this.anInt8843 = arg0;
		if (!this.aBoolean708) {
			return;
		}
		if (this.anInt8841 < this.anInt8843) {
			this.anInt8843 = this.anInt8841;
		}
		if (this.anInt8843 < 0) {
			this.anInt8843 = 0;
		}
		this.aDecoderContext1.setPostProcessingLevel(this.anInt8843);
	}

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "(I)F")
	public float method7335() {
		return this.aBoolean708 && !this.aTheoraInfo1.b() ? (float) this.aTheoraInfo1.fpsNumerator / (float) this.aTheoraInfo1.fpsDenominator : 0.0F;
	}

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)Z")
	public boolean method7337() {
		return this.aBoolean708;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;Z)V")
	@Override
	protected void method8548(@OriginalArg(0) OggPacket arg0) {
		@Pc(15) int local15;
		if (!this.aBoolean708) {
			local15 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local15 == 0) {
				this.aBoolean708 = true;
				if (this.aTheoraInfo1.frameWidth > 2048 || this.aTheoraInfo1.frameHeight > 1024) {
					throw new IllegalStateException();
				}
				this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
				this.aGranulePos1 = new GranulePos();
				this.aFrame8 = new Frame(this.aTheoraInfo1.frameWidth, this.aTheoraInfo1.frameHeight);
				this.anInt8841 = this.aDecoderContext1.getMaxPostProcessingLevel();
				this.method7334(this.anInt8843);
			} else if (local15 < 0) {
				throw new IllegalStateException(String.valueOf(local15));
			}
			return;
		}
		this.aLong240 = Static582.method8056();
		local15 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local15 < 0) {
			throw new IllegalStateException(String.valueOf(local15));
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble24 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean707) {
			@Pc(133) boolean local133 = arg0.isKeyFrame() == 1;
			if (!local133) {
				return;
			}
			this.aBoolean707 = false;
		}
		if (!this.aBoolean706 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame8) != 0) {
				throw new IllegalStateException(String.valueOf(local15));
			}
			this.aBoolean705 = true;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)J")
	public long method7339() {
		return this.aLong240;
	}

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)V")
	@Override
	public void method8553() {
		if (this.aFrame8 != null) {
			this.aFrame8.a();
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

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!ha;I)Lclient!ufa;")
	public Class4 method7340(@OriginalArg(0) Class5 arg0) {
		if (this.aFrame8 == null) {
			return null;
		} else if (this.aBoolean705 || this.aClass4_27 == null) {
			this.aClass4_27 = arg0.method6133(this.aFrame8.pixels, this.aFrame8.a, this.aFrame8.a, this.aFrame8.b, false);
			this.aBoolean705 = false;
			return this.aClass4_27;
		} else {
			return this.aClass4_27;
		}
	}

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "(I)D")
	public double method7341() {
		return this.aDouble24;
	}
}
