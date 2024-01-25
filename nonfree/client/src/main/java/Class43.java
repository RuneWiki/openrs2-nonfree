import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public abstract class Class43 {

	@OriginalMember(owner = "client!du", name = "j", descriptor = "[S")
	private short[] aShortArray73;

	@OriginalMember(owner = "client!du", name = "d", descriptor = "I")
	private int anInt3900 = 4;

	@OriginalMember(owner = "client!du", name = "m", descriptor = "[S")
	private final short[] aShortArray74 = new short[512];

	@OriginalMember(owner = "client!du", name = "h", descriptor = "I")
	private int anInt3903 = 4;

	@OriginalMember(owner = "client!du", name = "l", descriptor = "I")
	private int anInt3906 = 4;

	@OriginalMember(owner = "client!du", name = "n", descriptor = "I")
	private int anInt3907 = 0;

	@OriginalMember(owner = "client!du", name = "g", descriptor = "I")
	protected int anInt3902 = 4;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(IIIII)V")
	protected Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt3903 = arg4;
		this.anInt3906 = arg3;
		this.anInt3900 = arg2;
		this.anInt3902 = arg1;
		this.anInt3907 = arg0;
		this.method3175();
		this.method3174();
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIII)V")
	protected final void method3173() {
		@Pc(12) int[] local12 = new int[128];
		@Pc(15) int[] local15 = new int[128];
		for (@Pc(17) int local17 = 0; local17 < 128; local17++) {
			local12[local17] = (local17 << 12) / 128;
		}
		@Pc(38) int[] local38 = new int[16];
		for (@Pc(40) int local40 = 0; local40 < 128; local40++) {
			local15[local40] = (local40 << 12) / 128;
		}
		for (@Pc(56) int local56 = 0; local56 < 16; local56++) {
			local38[local56] = (local56 << 12) / 16;
		}
		this.method3176();
		for (@Pc(75) int local75 = 0; local75 < 16; local75++) {
			for (@Pc(79) int local79 = 0; local79 < 128; local79++) {
				for (@Pc(83) int local83 = 0; local83 < 128; local83++) {
					for (@Pc(87) int local87 = 0; local87 < this.anInt3902; local87++) {
						@Pc(96) int local96 = this.aShortArray73[local87] << 12;
						@Pc(103) int local103 = local96 * this.anInt3900 >> 12;
						@Pc(110) int local110 = local96 * this.anInt3906 >> 12;
						@Pc(118) int local118 = local12[local83] * local96 >> 12;
						@Pc(125) int local125 = local96 * this.anInt3903 >> 12;
						@Pc(133) int local133 = local38[local75] * local96 >> 12;
						@Pc(141) int local141 = local96 * local15[local79] >> 12;
						@Pc(146) int local146 = local118 * this.anInt3900;
						@Pc(151) int local151 = local141 * this.anInt3906;
						@Pc(156) int local156 = local133 * this.anInt3903;
						@Pc(160) int local160 = local146 >> 12;
						@Pc(164) int local164 = local160 + 1;
						@Pc(168) int local168 = local151 >> 12;
						@Pc(172) int local172 = local160 & 0xFF;
						@Pc(176) int local176 = local168 + 1;
						@Pc(180) int local180 = local156 >> 12;
						@Pc(184) int local184 = local168 & 0xFF;
						@Pc(188) int local188 = local180 + 1;
						if (local125 > local188) {
							local188 &= 0xFF;
						} else {
							local188 = 0;
						}
						local180 &= 0xFF;
						local118 = local146 & 0xFFF;
						local141 = local151 & 0xFFF;
						local133 = local156 & 0xFFF;
						if (local103 > local164) {
							local164 &= 0xFF;
						} else {
							local164 = 0;
						}
						if (local110 <= local176) {
							local176 = 0;
						} else {
							local176 &= 0xFF;
						}
						@Pc(245) int local245 = Class168.anIntArray389[local133];
						@Pc(250) short local250 = this.aShortArray74[local188];
						@Pc(254) int local254 = local133 - 4096;
						@Pc(258) int local258 = local141 - 4096;
						@Pc(263) short local263 = this.aShortArray74[local180];
						@Pc(267) int local267 = local118 - 4096;
						@Pc(271) int local271 = Class168.anIntArray389[local141];
						@Pc(275) int local275 = Class168.anIntArray389[local118];
						@Pc(282) short local282 = this.aShortArray74[local263 + local176];
						@Pc(289) short local289 = this.aShortArray74[local176 + local250];
						@Pc(296) short local296 = this.aShortArray74[local184 + local263];
						@Pc(304) short local304 = this.aShortArray74[local184 + local250];
						@Pc(316) int local316 = Static19.method386(local141, local118, local133, this.aShortArray74[local172 + local296]);
						@Pc(328) int local328 = Static19.method386(local141, local267, local133, this.aShortArray74[local164 + local296]);
						@Pc(339) int local339 = local316 + ((local328 - local316) * local275 >> 12);
						@Pc(351) int local351 = Static19.method386(local258, local118, local133, this.aShortArray74[local172 + local282]);
						@Pc(364) int local364 = Static19.method386(local258, local267, local133, this.aShortArray74[local164 + local282]);
						@Pc(375) int local375 = local351 + (local275 * (local364 - local351) >> 12);
						@Pc(386) int local386 = ((local375 - local339) * local271 >> 12) + local339;
						@Pc(399) int local399 = Static19.method386(local141, local118, local254, this.aShortArray74[local172 + local304]);
						@Pc(412) int local412 = Static19.method386(local141, local267, local254, this.aShortArray74[local164 + local304]);
						@Pc(423) int local423 = (local275 * (local412 - local399) >> 12) + local399;
						@Pc(435) int local435 = Static19.method386(local258, local118, local254, this.aShortArray74[local289 + local172]);
						@Pc(448) int local448 = Static19.method386(local258, local267, local254, this.aShortArray74[local164 + local289]);
						@Pc(458) int local458 = ((local448 - local435) * local275 >> 12) + local435;
						@Pc(470) int local470 = local423 + ((local458 - local423) * local271 >> 12);
						this.method3178(local386 + (local245 * (local470 - local386) >> 12), local87);
					}
					this.method3177();
				}
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(B)V")
	private void method3174() {
		@Pc(12) Random local12 = new Random((long) this.anInt3907);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray74[local14] = (short) local14;
		}
		for (@Pc(38) int local38 = 0; local38 < 255; local38++) {
			@Pc(44) int local44 = 255 - local38;
			@Pc(49) int local49 = Static408.method1356(local12, local44);
			@Pc(54) short local54 = this.aShortArray74[local49];
			this.aShortArray74[local49] = this.aShortArray74[local44];
			this.aShortArray74[local44] = this.aShortArray74[local44 + 256] = local54;
		}
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(B)V")
	private void method3175() {
		this.aShortArray73 = new short[this.anInt3902];
		for (@Pc(18) int local18 = 0; local18 < this.anInt3902; local18++) {
			this.aShortArray73[local18] = (short) Math.pow(2.0D, (double) local18);
		}
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(I)V")
	protected abstract void method3176();

	@OriginalMember(owner = "client!du", name = "c", descriptor = "(I)V")
	protected abstract void method3177();

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(III)V")
	protected abstract void method3178(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
