import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public abstract class Class25 {

	@OriginalMember(owner = "client!im", name = "a", descriptor = "[S")
	private short[] aShortArray73;

	@OriginalMember(owner = "client!im", name = "e", descriptor = "I")
	private int anInt4674 = 4;

	@OriginalMember(owner = "client!im", name = "d", descriptor = "I")
	private int anInt4673 = 4;

	@OriginalMember(owner = "client!im", name = "n", descriptor = "[S")
	private final short[] aShortArray74 = new short[512];

	@OriginalMember(owner = "client!im", name = "o", descriptor = "I")
	protected int anInt4683 = 4;

	@OriginalMember(owner = "client!im", name = "m", descriptor = "I")
	private int anInt4682 = 0;

	@OriginalMember(owner = "client!im", name = "j", descriptor = "I")
	private int anInt4679 = 4;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(IIIII)V")
	protected Class25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4679 = arg4;
		this.anInt4682 = arg0;
		this.anInt4683 = arg1;
		this.anInt4673 = arg3;
		this.anInt4674 = arg2;
		this.method4066();
		this.method4065();
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V")
	protected abstract void method4058();

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(B)V")
	protected abstract void method4060();

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BII)V")
	protected abstract void method4062(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIB)V")
	protected final void method4064() {
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
		this.method4060();
		for (@Pc(75) int local75 = 0; local75 < 16; local75++) {
			for (@Pc(79) int local79 = 0; local79 < 128; local79++) {
				for (@Pc(83) int local83 = 0; local83 < 128; local83++) {
					for (@Pc(87) int local87 = 0; local87 < this.anInt4683; local87++) {
						@Pc(96) int local96 = this.aShortArray73[local87] << 12;
						@Pc(103) int local103 = local96 * this.anInt4673 >> 12;
						@Pc(110) int local110 = local96 * this.anInt4679 >> 12;
						@Pc(118) int local118 = local96 * local38[local75] >> 12;
						@Pc(126) int local126 = local96 * local12[local83] >> 12;
						@Pc(134) int local134 = local15[local79] * local96 >> 12;
						@Pc(141) int local141 = this.anInt4674 * local96 >> 12;
						@Pc(146) int local146 = local126 * this.anInt4674;
						@Pc(151) int local151 = local118 * this.anInt4679;
						@Pc(156) int local156 = local134 * this.anInt4673;
						@Pc(160) int local160 = local146 >> 12;
						@Pc(164) int local164 = local160 + 1;
						@Pc(168) int local168 = local156 >> 12;
						@Pc(172) int local172 = local160 & 0xFF;
						@Pc(176) int local176 = local168 + 1;
						@Pc(180) int local180 = local168 & 0xFF;
						@Pc(184) int local184 = local151 >> 12;
						@Pc(188) int local188 = local184 + 1;
						@Pc(192) int local192 = local151 & 0xFFF;
						if (local110 <= local188) {
							local188 = 0;
						} else {
							local188 &= 0xFF;
						}
						if (local141 <= local164) {
							local164 = 0;
						} else {
							local164 &= 0xFF;
						}
						if (local103 <= local176) {
							local176 = 0;
						} else {
							local176 &= 0xFF;
						}
						local134 = local156 & 0xFFF;
						local184 &= 0xFF;
						local126 = local146 & 0xFFF;
						@Pc(245) int local245 = local134 - 4096;
						@Pc(250) short local250 = this.aShortArray74[local188];
						@Pc(255) short local255 = this.aShortArray74[local184];
						@Pc(259) int local259 = local126 - 4096;
						@Pc(263) int local263 = local192 - 4096;
						@Pc(267) int local267 = Class326.anIntArray574[local134];
						@Pc(271) int local271 = Class326.anIntArray574[local126];
						@Pc(275) int local275 = Class326.anIntArray574[local192];
						@Pc(282) short local282 = this.aShortArray74[local180 + local250];
						@Pc(289) short local289 = this.aShortArray74[local255 + local180];
						@Pc(297) short local297 = this.aShortArray74[local176 + local250];
						@Pc(304) short local304 = this.aShortArray74[local255 + local176];
						@Pc(316) int local316 = Static559.method8056(local134, local126, this.aShortArray74[local172 + local289], local192);
						@Pc(328) int local328 = Static559.method8056(local134, local259, this.aShortArray74[local289 + local164], local192);
						@Pc(339) int local339 = (local271 * (local328 - local316) >> 12) + local316;
						@Pc(351) int local351 = Static559.method8056(local245, local126, this.aShortArray74[local304 + local172], local192);
						@Pc(363) int local363 = Static559.method8056(local245, local259, this.aShortArray74[local164 + local304], local192);
						@Pc(374) int local374 = local351 + ((local363 - local351) * local271 >> 12);
						@Pc(386) int local386 = local339 + (local267 * (local374 - local339) >> 12);
						@Pc(398) int local398 = Static559.method8056(local134, local126, this.aShortArray74[local172 + local282], local263);
						@Pc(410) int local410 = Static559.method8056(local134, local259, this.aShortArray74[local282 + local164], local263);
						@Pc(421) int local421 = (local271 * (local410 - local398) >> 12) + local398;
						@Pc(433) int local433 = Static559.method8056(local245, local126, this.aShortArray74[local297 + local172], local263);
						@Pc(445) int local445 = Static559.method8056(local245, local259, this.aShortArray74[local297 + local164], local263);
						@Pc(456) int local456 = ((local445 - local433) * local271 >> 12) + local433;
						@Pc(467) int local467 = (local267 * (local456 - local421) >> 12) + local421;
						this.method4062(local386 + (local275 * (local467 - local386) >> 12), local87);
					}
					this.method4058();
				}
			}
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
	private void method4065() {
		@Pc(12) Random local12 = new Random((long) this.anInt4682);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray74[local14] = (short) local14;
		}
		for (@Pc(34) int local34 = 0; local34 < 255; local34++) {
			@Pc(41) int local41 = 255 - local34;
			@Pc(46) int local46 = Static588.method8281(local12, local41);
			@Pc(51) short local51 = this.aShortArray74[local46];
			this.aShortArray74[local46] = this.aShortArray74[local41];
			this.aShortArray74[local41] = this.aShortArray74[local41 + 256] = local51;
		}
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(B)V")
	private void method4066() {
		this.aShortArray73 = new short[this.anInt4683];
		for (@Pc(17) int local17 = 0; local17 < this.anInt4683; local17++) {
			this.aShortArray73[local17] = (short) (int) Math.pow(2.0D, (double) local17);
		}
	}
}
