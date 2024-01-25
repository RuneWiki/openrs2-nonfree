import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public abstract class Class221 {

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "[S")
	private short[] aShortArray135;

	@OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
	protected int anInt8685 = 4;

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
	private int anInt8684 = 0;

	@OriginalMember(owner = "client!qs", name = "j", descriptor = "I")
	private int anInt8689 = 4;

	@OriginalMember(owner = "client!qs", name = "m", descriptor = "I")
	private int anInt8691 = 4;

	@OriginalMember(owner = "client!qs", name = "h", descriptor = "I")
	private int anInt8687 = 4;

	@OriginalMember(owner = "client!qs", name = "q", descriptor = "[S")
	private final short[] aShortArray136 = new short[512];

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(IIIII)V")
	protected Class221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt8684 = arg0;
		this.anInt8691 = arg2;
		this.anInt8687 = arg3;
		this.anInt8689 = arg4;
		this.anInt8685 = arg1;
		this.method7466();
		this.method7464();
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
	private void method7464() {
		@Pc(12) Random local12 = new Random((long) this.anInt8684);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray136[local14] = (short) local14;
		}
		for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
			@Pc(43) int local43 = 255 - local30;
			@Pc(48) int local48 = Static57.method964(local43, local12);
			@Pc(53) short local53 = this.aShortArray136[local48];
			this.aShortArray136[local48] = this.aShortArray136[local43];
			this.aShortArray136[local43] = this.aShortArray136[local43 + 256] = local53;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V")
	private void method7466() {
		this.aShortArray135 = new short[this.anInt8685];
		for (@Pc(12) int local12 = 0; local12 < this.anInt8685; local12++) {
			this.aShortArray135[local12] = (short) (int) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V")
	protected abstract void method7467();

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIII)V")
	protected final void method7471() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		@Pc(14) int[] local14 = new int[16];
		for (@Pc(16) int local16 = 0; local16 < 128; local16++) {
			local8[local16] = (local16 << 12) / 128;
		}
		for (@Pc(32) int local32 = 0; local32 < 128; local32++) {
			local11[local32] = (local32 << 12) / 128;
		}
		for (@Pc(52) int local52 = 0; local52 < 16; local52++) {
			local14[local52] = (local52 << 12) / 16;
		}
		this.method7467();
		for (@Pc(75) int local75 = 0; local75 < 16; local75++) {
			for (@Pc(79) int local79 = 0; local79 < 128; local79++) {
				for (@Pc(83) int local83 = 0; local83 < 128; local83++) {
					for (@Pc(87) int local87 = 0; local87 < this.anInt8685; local87++) {
						@Pc(96) int local96 = this.aShortArray135[local87] << 12;
						@Pc(103) int local103 = local96 * this.anInt8691 >> 12;
						@Pc(111) int local111 = local14[local75] * local96 >> 12;
						@Pc(119) int local119 = local8[local83] * local96 >> 12;
						@Pc(126) int local126 = local96 * this.anInt8689 >> 12;
						@Pc(133) int local133 = this.anInt8687 * local96 >> 12;
						@Pc(141) int local141 = local96 * local11[local79] >> 12;
						@Pc(146) int local146 = local119 * this.anInt8691;
						@Pc(151) int local151 = local141 * this.anInt8687;
						@Pc(156) int local156 = local111 * this.anInt8689;
						@Pc(160) int local160 = local146 >> 12;
						@Pc(164) int local164 = local160 + 1;
						@Pc(168) int local168 = local160 & 0xFF;
						@Pc(172) int local172 = local151 >> 12;
						@Pc(176) int local176 = local172 + 1;
						@Pc(180) int local180 = local156 >> 12;
						@Pc(184) int local184 = local172 & 0xFF;
						@Pc(188) int local188 = local180 + 1;
						if (local133 > local176) {
							local176 &= 0xFF;
						} else {
							local176 = 0;
						}
						if (local103 > local164) {
							local164 &= 0xFF;
						} else {
							local164 = 0;
						}
						local141 = local151 & 0xFFF;
						local119 = local146 & 0xFFF;
						if (local188 < local126) {
							local188 &= 0xFF;
						} else {
							local188 = 0;
						}
						local180 &= 0xFF;
						local111 = local156 & 0xFFF;
						@Pc(250) short local250 = this.aShortArray136[local180];
						@Pc(254) int local254 = Class375.anIntArray826[local119];
						@Pc(258) int local258 = local119 - 4096;
						@Pc(262) int local262 = local141 - 4096;
						@Pc(267) short local267 = this.aShortArray136[local188];
						@Pc(271) int local271 = local111 - 4096;
						@Pc(275) int local275 = Class375.anIntArray826[local111];
						@Pc(279) int local279 = Class375.anIntArray826[local141];
						@Pc(286) short local286 = this.aShortArray136[local250 + local184];
						@Pc(293) short local293 = this.aShortArray136[local184 + local267];
						@Pc(300) short local300 = this.aShortArray136[local267 + local176];
						@Pc(308) short local308 = this.aShortArray136[local176 + local250];
						@Pc(320) int local320 = Static9.method175(this.aShortArray136[local286 + local168], local119, local111, local141);
						@Pc(332) int local332 = Static9.method175(this.aShortArray136[local286 + local164], local258, local111, local141);
						@Pc(342) int local342 = (local254 * (local332 - local320) >> 12) + local320;
						@Pc(354) int local354 = Static9.method175(this.aShortArray136[local168 + local308], local119, local111, local262);
						@Pc(366) int local366 = Static9.method175(this.aShortArray136[local308 + local164], local258, local111, local262);
						@Pc(376) int local376 = local354 + (local254 * (local366 - local354) >> 12);
						@Pc(389) int local389 = Static9.method175(this.aShortArray136[local168 + local293], local119, local271, local141);
						@Pc(401) int local401 = local342 + (local279 * (local376 - local342) >> 12);
						@Pc(414) int local414 = Static9.method175(this.aShortArray136[local164 + local293], local258, local271, local141);
						@Pc(426) int local426 = local389 + (local254 * (local414 - local389) >> 12);
						@Pc(438) int local438 = Static9.method175(this.aShortArray136[local300 + local168], local119, local271, local262);
						@Pc(450) int local450 = Static9.method175(this.aShortArray136[local300 + local164], local258, local271, local262);
						@Pc(462) int local462 = local438 + (local254 * (local450 - local438) >> 12);
						@Pc(474) int local474 = local426 + (local279 * (local462 - local426) >> 12);
						this.method7473(local401 + (local275 * (local474 - local401) >> 12), local87);
					}
					this.method7472();
				}
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "(I)V")
	protected abstract void method7472();

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)V")
	protected abstract void method7473(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
