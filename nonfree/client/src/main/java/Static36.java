import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!eb", name = "S", descriptor = "I")
	public static int anInt865;

	@OriginalMember(owner = "client!eb", name = "U", descriptor = "I")
	public static int anInt866;

	@OriginalMember(owner = "client!eb", name = "X", descriptor = "I")
	public static int anInt868;

	@OriginalMember(owner = "client!eb", name = "fb", descriptor = "I")
	private static int anInt869;

	@OriginalMember(owner = "client!eb", name = "gb", descriptor = "I")
	public static int anInt870;

	@OriginalMember(owner = "client!eb", name = "hb", descriptor = "I")
	public static int anInt871;

	@OriginalMember(owner = "client!eb", name = "jb", descriptor = "I")
	public static int anInt872;

	@OriginalMember(owner = "client!eb", name = "lb", descriptor = "I")
	public static int anInt873;

	@OriginalMember(owner = "client!eb", name = "mb", descriptor = "Lclient!og;")
	public static Interface1 anInterface1_2;

	@OriginalMember(owner = "client!eb", name = "V", descriptor = "Z")
	public static boolean aBoolean53 = true;

	@OriginalMember(owner = "client!eb", name = "W", descriptor = "I")
	public static int anInt867 = 0;

	@OriginalMember(owner = "client!eb", name = "Y", descriptor = "F")
	private static float aFloat1 = 1.0F;

	@OriginalMember(owner = "client!eb", name = "Z", descriptor = "Z")
	public static boolean aBoolean54 = false;

	@OriginalMember(owner = "client!eb", name = "bb", descriptor = "[I")
	private static int[] anIntArray85 = new int[1024];

	@OriginalMember(owner = "client!eb", name = "cb", descriptor = "Z")
	private static boolean aBoolean55 = false;

	@OriginalMember(owner = "client!eb", name = "db", descriptor = "Z")
	private static boolean aBoolean56 = false;

	@OriginalMember(owner = "client!eb", name = "eb", descriptor = "[I")
	public static int[] anIntArray86 = new int[65536];

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([I[IIIIIIIIIIIIII)V")
	private static void method651(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int arg11, @OriginalArg(14) int arg12) {
		if (aBoolean54) {
			if (arg4 > anInt868) {
				arg4 = anInt868;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		arg2 += arg3;
		arg5 += arg6 * arg3;
		@Pc(28) int local28 = arg4 - arg3;
		@Pc(140) int local140;
		@Pc(128) int local128;
		@Pc(68) int local68;
		@Pc(72) int local72;
		@Pc(99) int local99;
		@Pc(103) int local103;
		@Pc(62) int local62;
		@Pc(34) int local34;
		@Pc(114) int local114;
		@Pc(157) int local157;
		@Pc(136) int local136;
		@Pc(42) int local42;
		@Pc(50) int local50;
		@Pc(58) int local58;
		@Pc(154) int local154;
		if (!aBoolean55) {
			local34 = arg3 - anInt871;
			local42 = arg7 + (arg10 >> 3) * local34;
			local50 = arg8 + (arg11 >> 3) * local34;
			local58 = arg9 + (arg12 >> 3) * local34;
			local62 = local58 >> 14;
			if (local62 == 0) {
				local68 = 0;
				local72 = 0;
			} else {
				local68 = local42 / local62;
				local72 = local50 / local62;
			}
			arg7 = local42 + arg10;
			arg8 = local50 + arg11;
			arg9 = local58 + arg12;
			local62 = arg9 >> 14;
			if (local62 == 0) {
				local99 = 0;
				local103 = 0;
			} else {
				local99 = arg7 / local62;
				local103 = arg8 / local62;
			}
			local114 = (local68 << 18) + local72;
			local128 = (local99 - local68 >> 3 << 18) + (local103 - local72 >> 3);
			local28 >>= 0x3;
			local136 = arg6 << 3;
			local140 = arg5 >> 8;
			if (aBoolean56) {
				if (local28 > 0) {
					do {
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						local157 = arg2 + 1;
						arg0[arg2] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg0[local157++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg0[local157++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg0[local157++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg0[local157++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg0[local157++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg0[local157++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg2 = local157 + 1;
						arg0[local157] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local68 = local99;
						local72 = local103;
						arg7 += arg10;
						arg8 += arg11;
						arg9 += arg12;
						local62 = arg9 >> 14;
						if (local62 == 0) {
							local99 = 0;
							local103 = 0;
						} else {
							local99 = arg7 / local62;
							local103 = arg8 / local62;
						}
						local114 = (local68 << 18) + local72;
						local128 = (local99 - local68 >> 3 << 18) + (local103 - local72 >> 3);
						arg5 += local136;
						local140 = arg5 >> 8;
						local28--;
					} while (local28 > 0);
				}
				local28 = arg4 - arg3 & 0x7;
				if (local28 > 0) {
					do {
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg0[arg2++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local28--;
					} while (local28 > 0);
					return;
				}
			} else {
				if (local28 > 0) {
					do {
						@Pc(1470) int local1470;
						if ((local1470 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[arg2] = ((local1470 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1470 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						local157 = arg2 + 1;
						local114 += local128;
						@Pc(1507) int local1507;
						if ((local1507 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[local157] = ((local1507 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1507 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						local157++;
						local114 += local128;
						@Pc(1544) int local1544;
						if ((local1544 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[local157] = ((local1544 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1544 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						local157++;
						local114 += local128;
						@Pc(1581) int local1581;
						if ((local1581 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[local157] = ((local1581 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1581 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						local157++;
						local114 += local128;
						@Pc(1618) int local1618;
						if ((local1618 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[local157] = ((local1618 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1618 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						local157++;
						local114 += local128;
						@Pc(1655) int local1655;
						if ((local1655 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[local157] = ((local1655 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1655 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						local157++;
						local114 += local128;
						@Pc(1692) int local1692;
						if ((local1692 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[local157] = ((local1692 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1692 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						local157++;
						local114 += local128;
						@Pc(1729) int local1729;
						if ((local1729 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[local157] = ((local1729 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1729 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						arg2 = local157 + 1;
						local68 = local99;
						local72 = local103;
						arg7 += arg10;
						arg8 += arg11;
						arg9 += arg12;
						local62 = arg9 >> 14;
						if (local62 == 0) {
							local99 = 0;
							local103 = 0;
						} else {
							local99 = arg7 / local62;
							local103 = arg8 / local62;
						}
						local114 = (local68 << 18) + local72;
						local128 = (local99 - local68 >> 3 << 18) + (local103 - local72 >> 3);
						arg5 += local136;
						local140 = arg5 >> 8;
						local28--;
					} while (local28 > 0);
				}
				local28 = arg4 - arg3 & 0x7;
				if (local28 > 0) {
					do {
						@Pc(1840) int local1840;
						if ((local1840 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[arg2] = ((local1840 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1840 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						arg2++;
						local114 += local128;
						local28--;
					} while (local28 > 0);
				}
			}
			return;
		}
		local34 = arg3 - anInt871;
		local42 = arg7 + (arg10 >> 3) * local34;
		local50 = arg8 + (arg11 >> 3) * local34;
		local58 = arg9 + (arg12 >> 3) * local34;
		local62 = local58 >> 12;
		if (local62 == 0) {
			local68 = 0;
			local72 = 0;
		} else {
			local68 = local42 / local62;
			local72 = local50 / local62;
		}
		arg7 = local42 + arg10;
		arg8 = local50 + arg11;
		arg9 = local58 + arg12;
		local62 = arg9 >> 12;
		if (local62 == 0) {
			local99 = 0;
			local103 = 0;
		} else {
			local99 = arg7 / local62;
			local103 = arg8 / local62;
		}
		local114 = (local68 << 20) + local72;
		local128 = (local99 - local68 >> 3 << 20) + (local103 - local72 >> 3);
		local28 >>= 0x3;
		local136 = arg6 << 3;
		local140 = arg5 >> 8;
		if (aBoolean56) {
			if (local28 > 0) {
				do {
					local154 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					local157 = arg2 + 1;
					arg0[arg2] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					@Pc(189) int local189 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg0[local157++] = ((local189 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local189 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					@Pc(224) int local224 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg0[local157++] = ((local224 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local224 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					@Pc(259) int local259 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg0[local157++] = ((local259 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local259 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					@Pc(294) int local294 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg0[local157++] = ((local294 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local294 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					@Pc(329) int local329 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg0[local157++] = ((local329 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local329 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					@Pc(364) int local364 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg0[local157++] = ((local364 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local364 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					@Pc(399) int local399 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg2 = local157 + 1;
					arg0[local157] = ((local399 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local399 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local68 = local99;
					local72 = local103;
					arg7 += arg10;
					arg8 += arg11;
					arg9 += arg12;
					local62 = arg9 >> 12;
					if (local62 == 0) {
						local99 = 0;
						local103 = 0;
					} else {
						local99 = arg7 / local62;
						local103 = arg8 / local62;
					}
					local114 = (local68 << 20) + local72;
					local128 = (local99 - local68 >> 3 << 20) + (local103 - local72 >> 3);
					arg5 += local136;
					local140 = arg5 >> 8;
					local28--;
				} while (local28 > 0);
			}
			local28 = arg4 - arg3 & 0x7;
			if (local28 > 0) {
				do {
					local154 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg0[arg2++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					local28--;
				} while (local28 > 0);
				return;
			}
			return;
		}
		if (local28 > 0) {
			do {
				@Pc(550) int local550;
				if ((local550 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[arg2] = ((local550 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local550 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				local157 = arg2 + 1;
				local114 += local128;
				@Pc(587) int local587;
				if ((local587 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[local157] = ((local587 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local587 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				local157++;
				local114 += local128;
				@Pc(624) int local624;
				if ((local624 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[local157] = ((local624 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local624 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				local157++;
				local114 += local128;
				@Pc(661) int local661;
				if ((local661 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[local157] = ((local661 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local661 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				local157++;
				local114 += local128;
				@Pc(698) int local698;
				if ((local698 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[local157] = ((local698 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local698 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				local157++;
				local114 += local128;
				@Pc(735) int local735;
				if ((local735 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[local157] = ((local735 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local735 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				local157++;
				local114 += local128;
				@Pc(772) int local772;
				if ((local772 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[local157] = ((local772 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local772 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				local157++;
				local114 += local128;
				@Pc(809) int local809;
				if ((local809 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[local157] = ((local809 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local809 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				arg2 = local157 + 1;
				local68 = local99;
				local72 = local103;
				arg7 += arg10;
				arg8 += arg11;
				arg9 += arg12;
				local62 = arg9 >> 12;
				if (local62 == 0) {
					local99 = 0;
					local103 = 0;
				} else {
					local99 = arg7 / local62;
					local103 = arg8 / local62;
				}
				local114 = (local68 << 20) + local72;
				local128 = (local99 - local68 >> 3 << 20) + (local103 - local72 >> 3);
				arg5 += local136;
				local140 = arg5 >> 8;
				local28--;
			} while (local28 > 0);
		}
		local28 = arg4 - arg3 & 0x7;
		if (local28 <= 0) {
			return;
		}
		do {
			@Pc(920) int local920;
			if ((local920 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
				arg0[arg2] = ((local920 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local920 & 0xFF00) * local140 & 0xFF0000) >> 8;
			}
			arg2++;
			local114 += local128;
			local28--;
		} while (local28 > 0);
		return;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)V")
	public static void method652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = anIntArray85[0];
		@Pc(7) int local7 = local3 / Static15.anInt3218;
		@Pc(13) int local13 = local3 - local7 * Static15.anInt3218;
		anInt871 = arg0 - local13;
		anInt870 = arg1 - local7;
		anInt865 = -anInt871;
		anInt866 = anInt868 - anInt871;
		anInt872 = -anInt870;
		anInt873 = anInt869 - anInt870;
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "()V")
	public static void method653() {
		anIntArray85 = null;
		anIntArray86 = null;
		anInterface1_2 = null;
		Class3_Sub1_Sub3_Sub2.anIntArray84 = null;
		Class3_Sub1_Sub3_Sub2.anIntArray83 = null;
		Class3_Sub1_Sub3_Sub2.anIntArray87 = null;
		Class3_Sub1_Sub3_Sub2.anIntArray88 = null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V")
	public static void method654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		aBoolean54 = arg0 < 0 || arg0 > anInt868 || arg1 < 0 || arg1 > anInt868 || arg2 < 0 || arg2 > anInt868;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = arg4 - arg3;
		@Pc(7) int local7 = arg1 - arg0;
		@Pc(11) int local11 = arg5 - arg3;
		@Pc(15) int local15 = arg2 - arg0;
		@Pc(19) int local19 = arg7 - arg6;
		@Pc(23) int local23 = arg8 - arg6;
		@Pc(36) int local36;
		if (arg2 == arg1) {
			local36 = 0;
		} else {
			local36 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(48) int local48;
		if (arg1 == arg0) {
			local48 = 0;
		} else {
			local48 = (local3 << 16) / local7;
		}
		@Pc(60) int local60;
		if (arg2 == arg0) {
			local60 = 0;
		} else {
			local60 = (local11 << 16) / local15;
		}
		@Pc(71) int local71 = local3 * local15 - local11 * local7;
		if (local71 == 0) {
			return;
		}
		@Pc(86) int local86 = (local19 * local15 - local23 * local7 << 8) / local71;
		@Pc(98) int local98 = (local23 * local3 - local19 * local11 << 8) / local71;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < anInt869) {
				if (arg1 > anInt869) {
					arg1 = anInt869;
				}
				if (arg2 > anInt869) {
					arg2 = anInt869;
				}
				arg6 = (arg6 << 8) + local86 - local86 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local60 * arg0;
						arg3 -= local48 * arg0;
						arg6 -= local98 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local36 * arg1;
						arg1 = 0;
					}
					if (arg0 != arg1 && local60 < local48 || arg0 == arg1 && local60 > local36) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray85[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method667(Static15.anIntArray335, arg0, arg5 >> 16, arg4 >> 16, arg6, local86);
									arg5 += local60;
									arg4 += local36;
									arg6 += local98;
									arg0 += Static15.anInt3218;
								}
							}
							method667(Static15.anIntArray335, arg0, arg5 >> 16, arg3 >> 16, arg6, local86);
							arg5 += local60;
							arg3 += local48;
							arg6 += local98;
							arg0 += Static15.anInt3218;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray85[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method667(Static15.anIntArray335, arg0, arg4 >> 16, arg5 >> 16, arg6, local86);
									arg5 += local60;
									arg4 += local36;
									arg6 += local98;
									arg0 += Static15.anInt3218;
								}
							}
							method667(Static15.anIntArray335, arg0, arg3 >> 16, arg5 >> 16, arg6, local86);
							arg5 += local60;
							arg3 += local48;
							arg6 += local98;
							arg0 += Static15.anInt3218;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local60 * arg0;
						arg3 -= local48 * arg0;
						arg6 -= local98 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local36 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && local60 < local48 || arg0 == arg2 && local36 > local48) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray85[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method667(Static15.anIntArray335, arg0, arg5 >> 16, arg3 >> 16, arg6, local86);
									arg5 += local36;
									arg3 += local48;
									arg6 += local98;
									arg0 += Static15.anInt3218;
								}
							}
							method667(Static15.anIntArray335, arg0, arg4 >> 16, arg3 >> 16, arg6, local86);
							arg4 += local60;
							arg3 += local48;
							arg6 += local98;
							arg0 += Static15.anInt3218;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray85[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method667(Static15.anIntArray335, arg0, arg3 >> 16, arg5 >> 16, arg6, local86);
									arg5 += local36;
									arg3 += local48;
									arg6 += local98;
									arg0 += Static15.anInt3218;
								}
							}
							method667(Static15.anIntArray335, arg0, arg3 >> 16, arg4 >> 16, arg6, local86);
							arg4 += local60;
							arg3 += local48;
							arg6 += local98;
							arg0 += Static15.anInt3218;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < anInt869) {
				if (arg2 > anInt869) {
					arg2 = anInt869;
				}
				if (arg0 > anInt869) {
					arg0 = anInt869;
				}
				arg7 = (arg7 << 8) + local86 - local86 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local48 * arg1;
						arg4 -= local36 * arg1;
						arg7 -= local98 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local60 * arg2;
						arg2 = 0;
					}
					if ((arg1 == arg2 || local48 >= local36) && (arg1 != arg2 || local48 <= local60)) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray85[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method667(Static15.anIntArray335, arg1, arg5 >> 16, arg3 >> 16, arg7, local86);
									arg3 += local48;
									arg5 += local60;
									arg7 += local98;
									arg1 += Static15.anInt3218;
								}
							}
							method667(Static15.anIntArray335, arg1, arg4 >> 16, arg3 >> 16, arg7, local86);
							arg3 += local48;
							arg4 += local36;
							arg7 += local98;
							arg1 += Static15.anInt3218;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray85[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method667(Static15.anIntArray335, arg1, arg3 >> 16, arg5 >> 16, arg7, local86);
									arg3 += local48;
									arg5 += local60;
									arg7 += local98;
									arg1 += Static15.anInt3218;
								}
							}
							method667(Static15.anIntArray335, arg1, arg3 >> 16, arg4 >> 16, arg7, local86);
							arg3 += local48;
							arg4 += local36;
							arg7 += local98;
							arg1 += Static15.anInt3218;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local48 * arg1;
						arg4 -= local36 * arg1;
						arg7 -= local98 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local60 * arg0;
						arg0 = 0;
					}
					if (local48 < local36) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray85[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method667(Static15.anIntArray335, arg1, arg3 >> 16, arg4 >> 16, arg7, local86);
									arg3 += local60;
									arg4 += local36;
									arg7 += local98;
									arg1 += Static15.anInt3218;
								}
							}
							method667(Static15.anIntArray335, arg1, arg5 >> 16, arg4 >> 16, arg7, local86);
							arg5 += local48;
							arg4 += local36;
							arg7 += local98;
							arg1 += Static15.anInt3218;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray85[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method667(Static15.anIntArray335, arg1, arg4 >> 16, arg3 >> 16, arg7, local86);
									arg3 += local60;
									arg4 += local36;
									arg7 += local98;
									arg1 += Static15.anInt3218;
								}
							}
							method667(Static15.anIntArray335, arg1, arg4 >> 16, arg5 >> 16, arg7, local86);
							arg5 += local48;
							arg4 += local36;
							arg7 += local98;
							arg1 += Static15.anInt3218;
						}
					}
				}
			}
		} else if (arg2 < anInt869) {
			if (arg0 > anInt869) {
				arg0 = anInt869;
			}
			if (arg1 > anInt869) {
				arg1 = anInt869;
			}
			arg8 = (arg8 << 8) + local86 - local86 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local36 * arg2;
					arg5 -= local60 * arg2;
					arg8 -= local98 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local48 * arg0;
					arg0 = 0;
				}
				if (local36 < local60) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray85[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method667(Static15.anIntArray335, arg2, arg4 >> 16, arg3 >> 16, arg8, local86);
								arg4 += local36;
								arg3 += local48;
								arg8 += local98;
								arg2 += Static15.anInt3218;
							}
						}
						method667(Static15.anIntArray335, arg2, arg4 >> 16, arg5 >> 16, arg8, local86);
						arg4 += local36;
						arg5 += local60;
						arg8 += local98;
						arg2 += Static15.anInt3218;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray85[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method667(Static15.anIntArray335, arg2, arg3 >> 16, arg4 >> 16, arg8, local86);
								arg4 += local36;
								arg3 += local48;
								arg8 += local98;
								arg2 += Static15.anInt3218;
							}
						}
						method667(Static15.anIntArray335, arg2, arg5 >> 16, arg4 >> 16, arg8, local86);
						arg4 += local36;
						arg5 += local60;
						arg8 += local98;
						arg2 += Static15.anInt3218;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local36 * arg2;
					arg5 -= local60 * arg2;
					arg8 -= local98 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local48 * arg1;
					arg1 = 0;
				}
				if (local36 < local60) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray85[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method667(Static15.anIntArray335, arg2, arg4 >> 16, arg5 >> 16, arg8, local86);
								arg4 += local48;
								arg5 += local60;
								arg8 += local98;
								arg2 += Static15.anInt3218;
							}
						}
						method667(Static15.anIntArray335, arg2, arg3 >> 16, arg5 >> 16, arg8, local86);
						arg3 += local36;
						arg5 += local60;
						arg8 += local98;
						arg2 += Static15.anInt3218;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray85[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method667(Static15.anIntArray335, arg2, arg5 >> 16, arg4 >> 16, arg8, local86);
								arg4 += local48;
								arg5 += local60;
								arg8 += local98;
								arg2 += Static15.anInt3218;
							}
						}
						method667(Static15.anIntArray335, arg2, arg5 >> 16, arg3 >> 16, arg8, local86);
						arg3 += local36;
						arg5 += local60;
						arg8 += local98;
						arg2 += Static15.anInt3218;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!og;)V")
	public static void method656(@OriginalArg(0) Interface1 arg0) {
		anInterface1_2 = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(IIII)V")
	private static void method657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		anInt868 = arg2 - arg0;
		anInt869 = arg3 - arg1;
		method659();
		if (anIntArray85.length < anInt869) {
			anIntArray85 = new int[Static50.method902(anInt869)];
		}
		@Pc(23) int local23 = arg1 * Static15.anInt3218 + arg0;
		for (@Pc(25) int local25 = 0; local25 < anInt869; local25++) {
			anIntArray85[local25] = local23;
			local23 += Static15.anInt3218;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([IIIIII)V")
	private static void method658(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (aBoolean54) {
			if (arg4 > anInt868) {
				arg4 = anInt868;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		arg1 += arg3;
		@Pc(24) int local24 = arg4 - arg3 >> 2;
		@Pc(30) int local30;
		if (anInt867 == 0) {
			while (true) {
				local24--;
				if (local24 < 0) {
					local24 = arg4 - arg3 & 0x3;
					while (true) {
						local24--;
						if (local24 < 0) {
							return;
						}
						arg0[arg1++] = arg2;
					}
				}
				local30 = arg1 + 1;
				arg0[arg1] = arg2;
				arg0[local30++] = arg2;
				arg0[local30++] = arg2;
				arg1 = local30 + 1;
				arg0[local30] = arg2;
			}
		} else if (anInt867 == 254) {
			while (true) {
				local24--;
				if (local24 < 0) {
					local24 = arg4 - arg3 & 0x3;
					while (true) {
						local24--;
						if (local24 < 0) {
							return;
						}
						arg0[arg1++] = arg0[arg1];
					}
				}
				local30 = arg1 + 1;
				arg0[arg1] = arg0[local30];
				arg0[local30++] = arg0[local30];
				arg0[local30++] = arg0[local30];
				arg1 = local30 + 1;
				arg0[local30] = arg0[arg1];
			}
		} else {
			@Pc(121) int local121 = anInt867;
			@Pc(125) int local125 = 256 - anInt867;
			@Pc(145) int local145 = ((arg2 & 0xFF00FF) * local125 >> 8 & 0xFF00FF) + ((arg2 & 0xFF00) * local125 >> 8 & 0xFF00);
			while (true) {
				local24--;
				@Pc(150) int local150;
				if (local24 < 0) {
					local24 = arg4 - arg3 & 0x3;
					while (true) {
						local24--;
						if (local24 < 0) {
							return;
						}
						local150 = arg0[arg1];
						arg0[arg1++] = local145 + ((local150 & 0xFF00FF) * local121 >> 8 & 0xFF00FF) + ((local150 & 0xFF00) * local121 >> 8 & 0xFF00);
					}
				}
				local150 = arg0[arg1];
				local30 = arg1 + 1;
				arg0[arg1] = local145 + ((local150 & 0xFF00FF) * local121 >> 8 & 0xFF00FF) + ((local150 & 0xFF00) * local121 >> 8 & 0xFF00);
				@Pc(179) int local179 = arg0[local30];
				@Pc(182) int local182 = local30 + 1;
				arg0[local30] = local145 + ((local179 & 0xFF00FF) * local121 >> 8 & 0xFF00FF) + ((local179 & 0xFF00) * local121 >> 8 & 0xFF00);
				@Pc(208) int local208 = arg0[local182];
				@Pc(211) int local211 = local182 + 1;
				arg0[local182] = local145 + ((local208 & 0xFF00FF) * local121 >> 8 & 0xFF00FF) + ((local208 & 0xFF00) * local121 >> 8 & 0xFF00);
				@Pc(237) int local237 = arg0[local211];
				arg1 = local211 + 1;
				arg0[local211] = local145 + ((local237 & 0xFF00FF) * local121 >> 8 & 0xFF00FF) + ((local237 & 0xFF00) * local121 >> 8 & 0xFF00);
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "()V")
	public static void method659() {
		anInt871 = anInt868 / 2;
		anInt870 = anInt869 / 2;
		anInt865 = -anInt871;
		anInt866 = anInt868 - anInt871;
		anInt872 = -anInt870;
		anInt873 = anInt869 - anInt870;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
	public static void method660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18) {
		@Pc(5) int[] local5 = anInterface1_2.method1721(arg18, aFloat1);
		@Pc(12) int local12;
		if (local5 == null) {
			local12 = anInterface1_2.method1724(arg18);
			method655(arg0, arg1, arg2, arg3, arg4, arg5, method664(local12, arg6), method664(local12, arg7), method664(local12, arg8));
			return;
		}
		aBoolean55 = anInterface1_2.method1720(arg18);
		aBoolean56 = anInterface1_2.method1722(arg18);
		local12 = arg4 - arg3;
		@Pc(47) int local47 = arg1 - arg0;
		@Pc(51) int local51 = arg5 - arg3;
		@Pc(55) int local55 = arg2 - arg0;
		@Pc(59) int local59 = arg7 - arg6;
		@Pc(63) int local63 = arg8 - arg6;
		@Pc(65) int local65 = 0;
		if (arg1 != arg0) {
			local65 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(80) int local80 = 0;
		if (arg2 != arg1) {
			local80 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(95) int local95 = 0;
		if (arg2 != arg0) {
			local95 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		@Pc(116) int local116 = local12 * local55 - local51 * local47;
		if (local116 == 0) {
			return;
		}
		@Pc(131) int local131 = (local59 * local55 - local63 * local47 << 9) / local116;
		@Pc(143) int local143 = (local63 * local12 - local59 * local51 << 9) / local116;
		@Pc(147) int local147 = arg9 - arg10;
		@Pc(151) int local151 = arg12 - arg13;
		@Pc(155) int local155 = arg15 - arg16;
		@Pc(159) int local159 = arg11 - arg9;
		@Pc(163) int local163 = arg14 - arg12;
		@Pc(167) int local167 = arg17 - arg15;
		@Pc(177) int local177 = local159 * arg12 - local163 * arg9 << 14;
		@Pc(187) int local187 = local163 * arg15 - local167 * arg12 << 5;
		@Pc(197) int local197 = local167 * arg9 - local159 * arg15 << 5;
		@Pc(207) int local207 = local147 * arg12 - local151 * arg9 << 14;
		@Pc(217) int local217 = local151 * arg15 - local155 * arg12 << 5;
		@Pc(227) int local227 = local155 * arg9 - local147 * arg15 << 5;
		@Pc(237) int local237 = local151 * local159 - local147 * local163 << 14;
		@Pc(247) int local247 = local155 * local163 - local151 * local167 << 5;
		@Pc(257) int local257 = local147 * local167 - local155 * local159 << 5;
		@Pc(336) int local336;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < anInt869) {
				if (arg1 > anInt869) {
					arg1 = anInt869;
				}
				if (arg2 > anInt869) {
					arg2 = anInt869;
				}
				arg6 = (arg6 << 9) + local131 - local131 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local95 * arg0;
						arg3 -= local65 * arg0;
						arg6 -= local143 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local80 * arg1;
						arg1 = 0;
					}
					local336 = arg0 - anInt870;
					local177 += local197 * local336;
					local207 += local227 * local336;
					local237 += local257 * local336;
					if (arg0 != arg1 && local95 < local65 || arg0 == arg1 && local95 > local80) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray85[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method668(Static15.anIntArray335, local5, arg0, arg5 >> 16, arg4 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
									arg5 += local95;
									arg4 += local80;
									arg6 += local143;
									arg0 += Static15.anInt3218;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method668(Static15.anIntArray335, local5, arg0, arg5 >> 16, arg3 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
							arg5 += local95;
							arg3 += local65;
							arg6 += local143;
							arg0 += Static15.anInt3218;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray85[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method668(Static15.anIntArray335, local5, arg0, arg4 >> 16, arg5 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
									arg5 += local95;
									arg4 += local80;
									arg6 += local143;
									arg0 += Static15.anInt3218;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method668(Static15.anIntArray335, local5, arg0, arg3 >> 16, arg5 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
							arg5 += local95;
							arg3 += local65;
							arg6 += local143;
							arg0 += Static15.anInt3218;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local95 * arg0;
						arg3 -= local65 * arg0;
						arg6 -= local143 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local80 * arg2;
						arg2 = 0;
					}
					local336 = arg0 - anInt870;
					local177 += local197 * local336;
					local207 += local227 * local336;
					local237 += local257 * local336;
					if ((arg0 == arg2 || local95 >= local65) && (arg0 != arg2 || local80 <= local65)) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray85[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method668(Static15.anIntArray335, local5, arg0, arg3 >> 16, arg5 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
									arg5 += local80;
									arg3 += local65;
									arg6 += local143;
									arg0 += Static15.anInt3218;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method668(Static15.anIntArray335, local5, arg0, arg3 >> 16, arg4 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
							arg4 += local95;
							arg3 += local65;
							arg6 += local143;
							arg0 += Static15.anInt3218;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray85[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method668(Static15.anIntArray335, local5, arg0, arg5 >> 16, arg3 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
									arg5 += local80;
									arg3 += local65;
									arg6 += local143;
									arg0 += Static15.anInt3218;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method668(Static15.anIntArray335, local5, arg0, arg4 >> 16, arg3 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
							arg4 += local95;
							arg3 += local65;
							arg6 += local143;
							arg0 += Static15.anInt3218;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < anInt869) {
				if (arg2 > anInt869) {
					arg2 = anInt869;
				}
				if (arg0 > anInt869) {
					arg0 = anInt869;
				}
				arg7 = (arg7 << 9) + local131 - local131 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local65 * arg1;
						arg4 -= local80 * arg1;
						arg7 -= local143 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local95 * arg2;
						arg2 = 0;
					}
					local336 = arg1 - anInt870;
					local177 += local197 * local336;
					local207 += local227 * local336;
					local237 += local257 * local336;
					if (arg1 != arg2 && local65 < local80 || arg1 == arg2 && local65 > local95) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray85[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method668(Static15.anIntArray335, local5, arg1, arg3 >> 16, arg5 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
									arg3 += local65;
									arg5 += local95;
									arg7 += local143;
									arg1 += Static15.anInt3218;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method668(Static15.anIntArray335, local5, arg1, arg3 >> 16, arg4 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
							arg3 += local65;
							arg4 += local80;
							arg7 += local143;
							arg1 += Static15.anInt3218;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray85[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method668(Static15.anIntArray335, local5, arg1, arg5 >> 16, arg3 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
									arg3 += local65;
									arg5 += local95;
									arg7 += local143;
									arg1 += Static15.anInt3218;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method668(Static15.anIntArray335, local5, arg1, arg4 >> 16, arg3 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
							arg3 += local65;
							arg4 += local80;
							arg7 += local143;
							arg1 += Static15.anInt3218;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local65 * arg1;
						arg4 -= local80 * arg1;
						arg7 -= local143 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local95 * arg0;
						arg0 = 0;
					}
					local336 = arg1 - anInt870;
					local177 += local197 * local336;
					local207 += local227 * local336;
					local237 += local257 * local336;
					if (local65 < local80) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray85[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method668(Static15.anIntArray335, local5, arg1, arg3 >> 16, arg4 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
									arg3 += local95;
									arg4 += local80;
									arg7 += local143;
									arg1 += Static15.anInt3218;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method668(Static15.anIntArray335, local5, arg1, arg5 >> 16, arg4 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
							arg5 += local65;
							arg4 += local80;
							arg7 += local143;
							arg1 += Static15.anInt3218;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray85[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method668(Static15.anIntArray335, local5, arg1, arg4 >> 16, arg3 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
									arg3 += local95;
									arg4 += local80;
									arg7 += local143;
									arg1 += Static15.anInt3218;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method668(Static15.anIntArray335, local5, arg1, arg4 >> 16, arg5 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
							arg5 += local65;
							arg4 += local80;
							arg7 += local143;
							arg1 += Static15.anInt3218;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					}
				}
			}
		} else if (arg2 < anInt869) {
			if (arg0 > anInt869) {
				arg0 = anInt869;
			}
			if (arg1 > anInt869) {
				arg1 = anInt869;
			}
			arg8 = (arg8 << 9) + local131 - local131 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local80 * arg2;
					arg5 -= local95 * arg2;
					arg8 -= local143 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local65 * arg0;
					arg0 = 0;
				}
				local336 = arg2 - anInt870;
				local177 += local197 * local336;
				local207 += local227 * local336;
				local237 += local257 * local336;
				if (local80 < local95) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray85[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method668(Static15.anIntArray335, local5, arg2, arg4 >> 16, arg3 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
								arg4 += local80;
								arg3 += local65;
								arg8 += local143;
								arg2 += Static15.anInt3218;
								local177 += local197;
								local207 += local227;
								local237 += local257;
							}
						}
						method668(Static15.anIntArray335, local5, arg2, arg4 >> 16, arg5 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
						arg4 += local80;
						arg5 += local95;
						arg8 += local143;
						arg2 += Static15.anInt3218;
						local177 += local197;
						local207 += local227;
						local237 += local257;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray85[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method668(Static15.anIntArray335, local5, arg2, arg3 >> 16, arg4 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
								arg4 += local80;
								arg3 += local65;
								arg8 += local143;
								arg2 += Static15.anInt3218;
								local177 += local197;
								local207 += local227;
								local237 += local257;
							}
						}
						method668(Static15.anIntArray335, local5, arg2, arg5 >> 16, arg4 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
						arg4 += local80;
						arg5 += local95;
						arg8 += local143;
						arg2 += Static15.anInt3218;
						local177 += local197;
						local207 += local227;
						local237 += local257;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local80 * arg2;
					arg5 -= local95 * arg2;
					arg8 -= local143 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local65 * arg1;
					arg1 = 0;
				}
				local336 = arg2 - anInt870;
				local177 += local197 * local336;
				local207 += local227 * local336;
				local237 += local257 * local336;
				if (local80 < local95) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray85[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method668(Static15.anIntArray335, local5, arg2, arg4 >> 16, arg5 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
								arg4 += local65;
								arg5 += local95;
								arg8 += local143;
								arg2 += Static15.anInt3218;
								local177 += local197;
								local207 += local227;
								local237 += local257;
							}
						}
						method668(Static15.anIntArray335, local5, arg2, arg3 >> 16, arg5 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
						arg3 += local80;
						arg5 += local95;
						arg8 += local143;
						arg2 += Static15.anInt3218;
						local177 += local197;
						local207 += local227;
						local237 += local257;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray85[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method668(Static15.anIntArray335, local5, arg2, arg5 >> 16, arg4 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
								arg4 += local65;
								arg5 += local95;
								arg8 += local143;
								arg2 += Static15.anInt3218;
								local177 += local197;
								local207 += local227;
								local237 += local257;
							}
						}
						method668(Static15.anIntArray335, local5, arg2, arg5 >> 16, arg3 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
						arg3 += local80;
						arg5 += local95;
						arg8 += local143;
						arg2 += Static15.anInt3218;
						local177 += local197;
						local207 += local227;
						local237 += local257;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(FII)V")
	private static void method661(@OriginalArg(0) float arg0) {
		@Pc(9) float local9 = (float) ((double) arg0 + Math.random() * 0.03D - 0.015D);
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < 512; local15++) {
			@Pc(25) double local25 = (double) (local15 >> 3) / 64.0D + 0.0078125D;
			@Pc(34) double local34 = (double) (local15 & 0x7) / 8.0D + 0.0625D;
			for (@Pc(36) int local36 = 0; local36 < 128; local36++) {
				@Pc(42) double local42 = (double) local36 / 128.0D;
				@Pc(44) double local44 = local42;
				@Pc(46) double local46 = local42;
				@Pc(48) double local48 = local42;
				if (local34 != 0.0D) {
					@Pc(62) double local62;
					if (local42 < 0.5D) {
						local62 = local42 * (local34 + 1.0D);
					} else {
						local62 = local42 + local34 - local42 * local34;
					}
					@Pc(77) double local77 = local42 * 2.0D - local62;
					@Pc(81) double local81 = local25 + 0.3333333333333333D;
					if (local81 > 1.0D) {
						local81--;
					}
					@Pc(95) double local95 = local25 - 0.3333333333333333D;
					if (local95 < 0.0D) {
						local95++;
					}
					if (local81 * 6.0D < 1.0D) {
						local44 = local77 + (local62 - local77) * 6.0D * local81;
					} else if (local81 * 2.0D < 1.0D) {
						local44 = local62;
					} else if (local81 * 3.0D < 2.0D) {
						local44 = local77 + (local62 - local77) * (0.6666666666666666D - local81) * 6.0D;
					} else {
						local44 = local77;
					}
					if (local25 * 6.0D < 1.0D) {
						local46 = local77 + (local62 - local77) * 6.0D * local25;
					} else if (local25 * 2.0D < 1.0D) {
						local46 = local62;
					} else if (local25 * 3.0D < 2.0D) {
						local46 = local77 + (local62 - local77) * (0.6666666666666666D - local25) * 6.0D;
					} else {
						local46 = local77;
					}
					if (local95 * 6.0D < 1.0D) {
						local48 = local77 + (local62 - local77) * 6.0D * local95;
					} else if (local95 * 2.0D < 1.0D) {
						local48 = local62;
					} else if (local95 * 3.0D < 2.0D) {
						local48 = local77 + (local62 - local77) * (0.6666666666666666D - local95) * 6.0D;
					} else {
						local48 = local77;
					}
				}
				local44 = Math.pow(local44, (double) local9);
				local46 = Math.pow(local46, (double) local9);
				local48 = Math.pow(local48, (double) local9);
				@Pc(264) int local264 = (int) (local44 * 256.0D);
				@Pc(269) int local269 = (int) (local46 * 256.0D);
				@Pc(274) int local274 = (int) (local48 * 256.0D);
				@Pc(284) int local284 = (local264 << 16) + (local269 << 8) + local274;
				if (local284 == 0) {
					local284 = 1;
				}
				anIntArray86[local13++] = local284;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "()V")
	public static void method662() {
		method657(Static15.anInt3219, Static15.anInt3220, Static15.anInt3215, Static15.anInt3217);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(F)V")
	public static void method663(@OriginalArg(0) float arg0) {
		aFloat1 = arg0;
		method661(aFloat1);
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(II)I")
	private static int method664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIII)V")
	public static void method665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) int local1 = 0;
		if (arg1 != arg0) {
			local1 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(16) int local16 = 0;
		if (arg2 != arg1) {
			local16 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(31) int local31 = 0;
		if (arg2 != arg0) {
			local31 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < anInt869) {
				if (arg1 > anInt869) {
					arg1 = anInt869;
				}
				if (arg2 > anInt869) {
					arg2 = anInt869;
				}
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local31 * arg0;
						arg3 -= local1 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local16 * arg1;
						arg1 = 0;
					}
					if (arg0 != arg1 && local31 < local1 || arg0 == arg1 && local31 > local16) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray85[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method658(Static15.anIntArray335, arg0, arg6, arg5 >> 16, arg4 >> 16);
									arg5 += local31;
									arg4 += local16;
									arg0 += Static15.anInt3218;
								}
							}
							method658(Static15.anIntArray335, arg0, arg6, arg5 >> 16, arg3 >> 16);
							arg5 += local31;
							arg3 += local1;
							arg0 += Static15.anInt3218;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray85[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method658(Static15.anIntArray335, arg0, arg6, arg4 >> 16, arg5 >> 16);
									arg5 += local31;
									arg4 += local16;
									arg0 += Static15.anInt3218;
								}
							}
							method658(Static15.anIntArray335, arg0, arg6, arg3 >> 16, arg5 >> 16);
							arg5 += local31;
							arg3 += local1;
							arg0 += Static15.anInt3218;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local31 * arg0;
						arg3 -= local1 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local16 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && local31 < local1 || arg0 == arg2 && local16 > local1) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray85[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method658(Static15.anIntArray335, arg0, arg6, arg5 >> 16, arg3 >> 16);
									arg5 += local16;
									arg3 += local1;
									arg0 += Static15.anInt3218;
								}
							}
							method658(Static15.anIntArray335, arg0, arg6, arg4 >> 16, arg3 >> 16);
							arg4 += local31;
							arg3 += local1;
							arg0 += Static15.anInt3218;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray85[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method658(Static15.anIntArray335, arg0, arg6, arg3 >> 16, arg5 >> 16);
									arg5 += local16;
									arg3 += local1;
									arg0 += Static15.anInt3218;
								}
							}
							method658(Static15.anIntArray335, arg0, arg6, arg3 >> 16, arg4 >> 16);
							arg4 += local31;
							arg3 += local1;
							arg0 += Static15.anInt3218;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < anInt869) {
				if (arg2 > anInt869) {
					arg2 = anInt869;
				}
				if (arg0 > anInt869) {
					arg0 = anInt869;
				}
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local1 * arg1;
						arg4 -= local16 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local31 * arg2;
						arg2 = 0;
					}
					if (arg1 != arg2 && local1 < local16 || arg1 == arg2 && local1 > local31) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray85[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method658(Static15.anIntArray335, arg1, arg6, arg3 >> 16, arg5 >> 16);
									arg3 += local1;
									arg5 += local31;
									arg1 += Static15.anInt3218;
								}
							}
							method658(Static15.anIntArray335, arg1, arg6, arg3 >> 16, arg4 >> 16);
							arg3 += local1;
							arg4 += local16;
							arg1 += Static15.anInt3218;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray85[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method658(Static15.anIntArray335, arg1, arg6, arg5 >> 16, arg3 >> 16);
									arg3 += local1;
									arg5 += local31;
									arg1 += Static15.anInt3218;
								}
							}
							method658(Static15.anIntArray335, arg1, arg6, arg4 >> 16, arg3 >> 16);
							arg3 += local1;
							arg4 += local16;
							arg1 += Static15.anInt3218;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local1 * arg1;
						arg4 -= local16 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local31 * arg0;
						arg0 = 0;
					}
					if (local1 < local16) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray85[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method658(Static15.anIntArray335, arg1, arg6, arg3 >> 16, arg4 >> 16);
									arg3 += local31;
									arg4 += local16;
									arg1 += Static15.anInt3218;
								}
							}
							method658(Static15.anIntArray335, arg1, arg6, arg5 >> 16, arg4 >> 16);
							arg5 += local1;
							arg4 += local16;
							arg1 += Static15.anInt3218;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray85[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method658(Static15.anIntArray335, arg1, arg6, arg4 >> 16, arg3 >> 16);
									arg3 += local31;
									arg4 += local16;
									arg1 += Static15.anInt3218;
								}
							}
							method658(Static15.anIntArray335, arg1, arg6, arg4 >> 16, arg5 >> 16);
							arg5 += local1;
							arg4 += local16;
							arg1 += Static15.anInt3218;
						}
					}
				}
			}
		} else if (arg2 < anInt869) {
			if (arg0 > anInt869) {
				arg0 = anInt869;
			}
			if (arg1 > anInt869) {
				arg1 = anInt869;
			}
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local16 * arg2;
					arg5 -= local31 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local1 * arg0;
					arg0 = 0;
				}
				if (local16 < local31) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray85[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method658(Static15.anIntArray335, arg2, arg6, arg4 >> 16, arg3 >> 16);
								arg4 += local16;
								arg3 += local1;
								arg2 += Static15.anInt3218;
							}
						}
						method658(Static15.anIntArray335, arg2, arg6, arg4 >> 16, arg5 >> 16);
						arg4 += local16;
						arg5 += local31;
						arg2 += Static15.anInt3218;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray85[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method658(Static15.anIntArray335, arg2, arg6, arg3 >> 16, arg4 >> 16);
								arg4 += local16;
								arg3 += local1;
								arg2 += Static15.anInt3218;
							}
						}
						method658(Static15.anIntArray335, arg2, arg6, arg5 >> 16, arg4 >> 16);
						arg4 += local16;
						arg5 += local31;
						arg2 += Static15.anInt3218;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local16 * arg2;
					arg5 -= local31 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local1 * arg1;
					arg1 = 0;
				}
				if (local16 < local31) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray85[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method658(Static15.anIntArray335, arg2, arg6, arg4 >> 16, arg5 >> 16);
								arg4 += local1;
								arg5 += local31;
								arg2 += Static15.anInt3218;
							}
						}
						method658(Static15.anIntArray335, arg2, arg6, arg3 >> 16, arg5 >> 16);
						arg3 += local16;
						arg5 += local31;
						arg2 += Static15.anInt3218;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray85[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method658(Static15.anIntArray335, arg2, arg6, arg5 >> 16, arg4 >> 16);
								arg4 += local1;
								arg5 += local31;
								arg2 += Static15.anInt3218;
							}
						}
						method658(Static15.anIntArray335, arg2, arg6, arg5 >> 16, arg3 >> 16);
						arg3 += local16;
						arg5 += local31;
						arg2 += Static15.anInt3218;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
	public static void method666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18) {
		@Pc(5) int[] local5 = anInterface1_2.method1721(arg18, aFloat1);
		@Pc(12) int local12;
		if (local5 == null) {
			local12 = anInterface1_2.method1724(arg18);
			method655(arg0, arg1, arg2, arg3, arg4, arg5, method664(local12, arg6), method664(local12, arg7), method664(local12, arg8));
			return;
		}
		aBoolean55 = anInterface1_2.method1720(arg18);
		aBoolean56 = anInterface1_2.method1722(arg18);
		local12 = arg4 - arg3;
		@Pc(47) int local47 = arg1 - arg0;
		@Pc(51) int local51 = arg5 - arg3;
		@Pc(55) int local55 = arg2 - arg0;
		@Pc(59) int local59 = arg7 - arg6;
		@Pc(63) int local63 = arg8 - arg6;
		@Pc(65) int local65 = 0;
		if (arg1 != arg0) {
			local65 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(80) int local80 = 0;
		if (arg2 != arg1) {
			local80 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(95) int local95 = 0;
		if (arg2 != arg0) {
			local95 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		@Pc(116) int local116 = local12 * local55 - local51 * local47;
		if (local116 == 0) {
			return;
		}
		@Pc(131) int local131 = (local59 * local55 - local63 * local47 << 9) / local116;
		@Pc(143) int local143 = (local63 * local12 - local59 * local51 << 9) / local116;
		@Pc(147) int local147 = arg9 - arg10;
		@Pc(151) int local151 = arg12 - arg13;
		@Pc(155) int local155 = arg15 - arg16;
		@Pc(159) int local159 = arg11 - arg9;
		@Pc(163) int local163 = arg14 - arg12;
		@Pc(167) int local167 = arg17 - arg15;
		@Pc(177) int local177 = local159 * arg12 - local163 * arg9 << 14;
		@Pc(187) int local187 = local163 * arg15 - local167 * arg12 << 8;
		@Pc(197) int local197 = local167 * arg9 - local159 * arg15 << 5;
		@Pc(207) int local207 = local147 * arg12 - local151 * arg9 << 14;
		@Pc(217) int local217 = local151 * arg15 - local155 * arg12 << 8;
		@Pc(227) int local227 = local155 * arg9 - local147 * arg15 << 5;
		@Pc(237) int local237 = local151 * local159 - local147 * local163 << 14;
		@Pc(247) int local247 = local155 * local163 - local151 * local167 << 8;
		@Pc(257) int local257 = local147 * local167 - local155 * local159 << 5;
		@Pc(336) int local336;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < anInt869) {
				if (arg1 > anInt869) {
					arg1 = anInt869;
				}
				if (arg2 > anInt869) {
					arg2 = anInt869;
				}
				arg6 = (arg6 << 9) + local131 - local131 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local95 * arg0;
						arg3 -= local65 * arg0;
						arg6 -= local143 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local80 * arg1;
						arg1 = 0;
					}
					local336 = arg0 - anInt870;
					local177 += local197 * local336;
					local207 += local227 * local336;
					local237 += local257 * local336;
					if (arg0 != arg1 && local95 < local65 || arg0 == arg1 && local95 > local80) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray85[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method651(Static15.anIntArray335, local5, arg0, arg5 >> 16, arg4 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
									arg5 += local95;
									arg4 += local80;
									arg6 += local143;
									arg0 += Static15.anInt3218;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method651(Static15.anIntArray335, local5, arg0, arg5 >> 16, arg3 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
							arg5 += local95;
							arg3 += local65;
							arg6 += local143;
							arg0 += Static15.anInt3218;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray85[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method651(Static15.anIntArray335, local5, arg0, arg4 >> 16, arg5 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
									arg5 += local95;
									arg4 += local80;
									arg6 += local143;
									arg0 += Static15.anInt3218;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method651(Static15.anIntArray335, local5, arg0, arg3 >> 16, arg5 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
							arg5 += local95;
							arg3 += local65;
							arg6 += local143;
							arg0 += Static15.anInt3218;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local95 * arg0;
						arg3 -= local65 * arg0;
						arg6 -= local143 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local80 * arg2;
						arg2 = 0;
					}
					local336 = arg0 - anInt870;
					local177 += local197 * local336;
					local207 += local227 * local336;
					local237 += local257 * local336;
					if ((arg0 == arg2 || local95 >= local65) && (arg0 != arg2 || local80 <= local65)) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray85[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method651(Static15.anIntArray335, local5, arg0, arg3 >> 16, arg5 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
									arg5 += local80;
									arg3 += local65;
									arg6 += local143;
									arg0 += Static15.anInt3218;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method651(Static15.anIntArray335, local5, arg0, arg3 >> 16, arg4 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
							arg4 += local95;
							arg3 += local65;
							arg6 += local143;
							arg0 += Static15.anInt3218;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray85[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method651(Static15.anIntArray335, local5, arg0, arg5 >> 16, arg3 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
									arg5 += local80;
									arg3 += local65;
									arg6 += local143;
									arg0 += Static15.anInt3218;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method651(Static15.anIntArray335, local5, arg0, arg4 >> 16, arg3 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
							arg4 += local95;
							arg3 += local65;
							arg6 += local143;
							arg0 += Static15.anInt3218;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < anInt869) {
				if (arg2 > anInt869) {
					arg2 = anInt869;
				}
				if (arg0 > anInt869) {
					arg0 = anInt869;
				}
				arg7 = (arg7 << 9) + local131 - local131 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local65 * arg1;
						arg4 -= local80 * arg1;
						arg7 -= local143 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local95 * arg2;
						arg2 = 0;
					}
					local336 = arg1 - anInt870;
					local177 += local197 * local336;
					local207 += local227 * local336;
					local237 += local257 * local336;
					if (arg1 != arg2 && local65 < local80 || arg1 == arg2 && local65 > local95) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray85[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method651(Static15.anIntArray335, local5, arg1, arg3 >> 16, arg5 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
									arg3 += local65;
									arg5 += local95;
									arg7 += local143;
									arg1 += Static15.anInt3218;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method651(Static15.anIntArray335, local5, arg1, arg3 >> 16, arg4 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
							arg3 += local65;
							arg4 += local80;
							arg7 += local143;
							arg1 += Static15.anInt3218;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray85[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method651(Static15.anIntArray335, local5, arg1, arg5 >> 16, arg3 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
									arg3 += local65;
									arg5 += local95;
									arg7 += local143;
									arg1 += Static15.anInt3218;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method651(Static15.anIntArray335, local5, arg1, arg4 >> 16, arg3 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
							arg3 += local65;
							arg4 += local80;
							arg7 += local143;
							arg1 += Static15.anInt3218;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local65 * arg1;
						arg4 -= local80 * arg1;
						arg7 -= local143 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local95 * arg0;
						arg0 = 0;
					}
					local336 = arg1 - anInt870;
					local177 += local197 * local336;
					local207 += local227 * local336;
					local237 += local257 * local336;
					if (local65 < local80) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray85[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method651(Static15.anIntArray335, local5, arg1, arg3 >> 16, arg4 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
									arg3 += local95;
									arg4 += local80;
									arg7 += local143;
									arg1 += Static15.anInt3218;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method651(Static15.anIntArray335, local5, arg1, arg5 >> 16, arg4 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
							arg5 += local65;
							arg4 += local80;
							arg7 += local143;
							arg1 += Static15.anInt3218;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray85[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method651(Static15.anIntArray335, local5, arg1, arg4 >> 16, arg3 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
									arg3 += local95;
									arg4 += local80;
									arg7 += local143;
									arg1 += Static15.anInt3218;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method651(Static15.anIntArray335, local5, arg1, arg4 >> 16, arg5 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
							arg5 += local65;
							arg4 += local80;
							arg7 += local143;
							arg1 += Static15.anInt3218;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					}
				}
			}
		} else if (arg2 < anInt869) {
			if (arg0 > anInt869) {
				arg0 = anInt869;
			}
			if (arg1 > anInt869) {
				arg1 = anInt869;
			}
			arg8 = (arg8 << 9) + local131 - local131 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local80 * arg2;
					arg5 -= local95 * arg2;
					arg8 -= local143 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local65 * arg0;
					arg0 = 0;
				}
				local336 = arg2 - anInt870;
				local177 += local197 * local336;
				local207 += local227 * local336;
				local237 += local257 * local336;
				if (local80 < local95) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray85[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method651(Static15.anIntArray335, local5, arg2, arg4 >> 16, arg3 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
								arg4 += local80;
								arg3 += local65;
								arg8 += local143;
								arg2 += Static15.anInt3218;
								local177 += local197;
								local207 += local227;
								local237 += local257;
							}
						}
						method651(Static15.anIntArray335, local5, arg2, arg4 >> 16, arg5 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
						arg4 += local80;
						arg5 += local95;
						arg8 += local143;
						arg2 += Static15.anInt3218;
						local177 += local197;
						local207 += local227;
						local237 += local257;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray85[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method651(Static15.anIntArray335, local5, arg2, arg3 >> 16, arg4 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
								arg4 += local80;
								arg3 += local65;
								arg8 += local143;
								arg2 += Static15.anInt3218;
								local177 += local197;
								local207 += local227;
								local237 += local257;
							}
						}
						method651(Static15.anIntArray335, local5, arg2, arg5 >> 16, arg4 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
						arg4 += local80;
						arg5 += local95;
						arg8 += local143;
						arg2 += Static15.anInt3218;
						local177 += local197;
						local207 += local227;
						local237 += local257;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local80 * arg2;
					arg5 -= local95 * arg2;
					arg8 -= local143 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local65 * arg1;
					arg1 = 0;
				}
				local336 = arg2 - anInt870;
				local177 += local197 * local336;
				local207 += local227 * local336;
				local237 += local257 * local336;
				if (local80 < local95) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray85[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method651(Static15.anIntArray335, local5, arg2, arg4 >> 16, arg5 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
								arg4 += local65;
								arg5 += local95;
								arg8 += local143;
								arg2 += Static15.anInt3218;
								local177 += local197;
								local207 += local227;
								local237 += local257;
							}
						}
						method651(Static15.anIntArray335, local5, arg2, arg3 >> 16, arg5 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
						arg3 += local80;
						arg5 += local95;
						arg8 += local143;
						arg2 += Static15.anInt3218;
						local177 += local197;
						local207 += local227;
						local237 += local257;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray85[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method651(Static15.anIntArray335, local5, arg2, arg5 >> 16, arg4 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
								arg4 += local65;
								arg5 += local95;
								arg8 += local143;
								arg2 += Static15.anInt3218;
								local177 += local197;
								local207 += local227;
								local237 += local257;
							}
						}
						method651(Static15.anIntArray335, local5, arg2, arg5 >> 16, arg3 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
						arg3 += local80;
						arg5 += local95;
						arg8 += local143;
						arg2 += Static15.anInt3218;
						local177 += local197;
						local207 += local227;
						local237 += local257;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([IIIIIIII)V")
	private static void method667(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (aBoolean54) {
			if (arg3 > anInt868) {
				arg3 = anInt868;
			}
			if (arg2 < 0) {
				arg2 = 0;
			}
		}
		if (arg2 >= arg3) {
			return;
		}
		arg1 += arg2;
		arg4 += arg5 * arg2;
		@Pc(98) int local98;
		@Pc(102) int local102;
		@Pc(138) int local138;
		@Pc(32) int local32;
		@Pc(46) int local46;
		if (!aBoolean53) {
			local32 = arg3 - arg2;
			if (anInt867 == 0) {
				do {
					arg0[arg1++] = anIntArray86[arg4 >> 8];
					arg4 += arg5;
					local32--;
				} while (local32 > 0);
			} else {
				local98 = anInt867;
				local102 = 256 - anInt867;
				do {
					local46 = anIntArray86[arg4 >> 8];
					arg4 += arg5;
					@Pc(379) int local379 = ((local46 & 0xFF00FF) * local102 >> 8 & 0xFF00FF) + ((local46 & 0xFF00) * local102 >> 8 & 0xFF00);
					local138 = arg0[arg1];
					arg0[arg1++] = local379 + ((local138 & 0xFF00FF) * local98 >> 8 & 0xFF00FF) + ((local138 & 0xFF00) * local98 >> 8 & 0xFF00);
					local32--;
				} while (local32 > 0);
			}
			return;
		}
		local32 = arg3 - arg2 >> 2;
		@Pc(36) int local36 = arg5 << 2;
		@Pc(53) int local53;
		if (anInt867 == 0) {
			if (local32 > 0) {
				do {
					local46 = anIntArray86[arg4 >> 8];
					arg4 += local36;
					local53 = arg1 + 1;
					arg0[arg1] = local46;
					@Pc(58) int local58 = local53 + 1;
					arg0[local53] = local46;
					@Pc(63) int local63 = local58 + 1;
					arg0[local58] = local46;
					arg1 = local63 + 1;
					arg0[local63] = local46;
					local32--;
				} while (local32 > 0);
			}
			local32 = arg3 - arg2 & 0x3;
			if (local32 > 0) {
				local46 = anIntArray86[arg4 >> 8];
				do {
					arg0[arg1++] = local46;
					local32--;
				} while (local32 > 0);
				return;
			}
			return;
		}
		local98 = anInt867;
		local102 = 256 - anInt867;
		if (local32 > 0) {
			do {
				local46 = anIntArray86[arg4 >> 8];
				arg4 += local36;
				local46 = ((local46 & 0xFF00FF) * local102 >> 8 & 0xFF00FF) + ((local46 & 0xFF00) * local102 >> 8 & 0xFF00);
				local138 = arg0[arg1];
				local53 = arg1 + 1;
				arg0[arg1] = local46 + ((local138 & 0xFF00FF) * local98 >> 8 & 0xFF00FF) + ((local138 & 0xFF00) * local98 >> 8 & 0xFF00);
				local138 = arg0[local53];
				arg0[local53++] = local46 + ((local138 & 0xFF00FF) * local98 >> 8 & 0xFF00FF) + ((local138 & 0xFF00) * local98 >> 8 & 0xFF00);
				local138 = arg0[local53];
				arg0[local53++] = local46 + ((local138 & 0xFF00FF) * local98 >> 8 & 0xFF00FF) + ((local138 & 0xFF00) * local98 >> 8 & 0xFF00);
				local138 = arg0[local53];
				arg1 = local53 + 1;
				arg0[local53] = local46 + ((local138 & 0xFF00FF) * local98 >> 8 & 0xFF00FF) + ((local138 & 0xFF00) * local98 >> 8 & 0xFF00);
				local32--;
			} while (local32 > 0);
		}
		local32 = arg3 - arg2 & 0x3;
		if (local32 <= 0) {
			return;
		}
		local46 = anIntArray86[arg4 >> 8];
		local46 = ((local46 & 0xFF00FF) * local102 >> 8 & 0xFF00FF) + ((local46 & 0xFF00) * local102 >> 8 & 0xFF00);
		do {
			local138 = arg0[arg1];
			arg0[arg1++] = local46 + ((local138 & 0xFF00FF) * local98 >> 8 & 0xFF00FF) + ((local138 & 0xFF00) * local98 >> 8 & 0xFF00);
			local32--;
		} while (local32 > 0);
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "([I[IIIIIIIIIIIIII)V")
	private static void method668(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int arg11, @OriginalArg(14) int arg12) {
		if (aBoolean54) {
			if (arg4 > anInt868) {
				arg4 = anInt868;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		arg2 += arg3;
		arg5 += arg6 * arg3;
		@Pc(28) int local28 = arg4 - arg3;
		@Pc(140) int local140;
		@Pc(128) int local128;
		@Pc(62) int local62;
		@Pc(66) int local66;
		@Pc(99) int local99;
		@Pc(103) int local103;
		@Pc(56) int local56;
		@Pc(34) int local34;
		@Pc(114) int local114;
		@Pc(157) int local157;
		@Pc(136) int local136;
		@Pc(40) int local40;
		@Pc(46) int local46;
		@Pc(52) int local52;
		@Pc(154) int local154;
		if (!aBoolean55) {
			local34 = arg3 - anInt871;
			local40 = arg7 + arg10 * local34;
			local46 = arg8 + arg11 * local34;
			local52 = arg9 + arg12 * local34;
			local56 = local52 >> 14;
			if (local56 == 0) {
				local62 = 0;
				local66 = 0;
			} else {
				local62 = local40 / local56;
				local66 = local46 / local56;
			}
			local40 += arg10 * local28;
			local46 += arg11 * local28;
			local52 += arg12 * local28;
			local56 = local52 >> 14;
			if (local56 == 0) {
				local99 = 0;
				local103 = 0;
			} else {
				local99 = local40 / local56;
				local103 = local46 / local56;
			}
			local114 = (local62 << 18) + local66;
			local128 = ((local99 - local62) / local28 << 18) + (local103 - local66) / local28;
			local28 >>= 0x3;
			local136 = arg6 << 3;
			local140 = arg5 >> 8;
			if (aBoolean56) {
				if (local28 > 0) {
					do {
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						local157 = arg2 + 1;
						arg0[arg2] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg0[local157++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg0[local157++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg0[local157++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg0[local157++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg0[local157++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg0[local157++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg2 = local157 + 1;
						arg0[local157] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						arg5 += local136;
						local140 = arg5 >> 8;
						local28--;
					} while (local28 > 0);
				}
				local28 = arg4 - arg3 & 0x7;
				if (local28 > 0) {
					do {
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg0[arg2++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local28--;
					} while (local28 > 0);
					return;
				}
			} else {
				if (local28 > 0) {
					do {
						@Pc(1305) int local1305;
						if ((local1305 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[arg2] = ((local1305 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1305 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						local157 = arg2 + 1;
						local114 += local128;
						@Pc(1342) int local1342;
						if ((local1342 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[local157] = ((local1342 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1342 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						local157++;
						local114 += local128;
						@Pc(1379) int local1379;
						if ((local1379 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[local157] = ((local1379 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1379 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						local157++;
						local114 += local128;
						@Pc(1416) int local1416;
						if ((local1416 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[local157] = ((local1416 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1416 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						local157++;
						local114 += local128;
						@Pc(1453) int local1453;
						if ((local1453 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[local157] = ((local1453 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1453 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						local157++;
						local114 += local128;
						@Pc(1490) int local1490;
						if ((local1490 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[local157] = ((local1490 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1490 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						local157++;
						local114 += local128;
						@Pc(1527) int local1527;
						if ((local1527 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[local157] = ((local1527 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1527 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						local157++;
						local114 += local128;
						@Pc(1564) int local1564;
						if ((local1564 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[local157] = ((local1564 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1564 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						arg2 = local157 + 1;
						local114 += local128;
						arg5 += local136;
						local140 = arg5 >> 8;
						local28--;
					} while (local28 > 0);
				}
				local28 = arg4 - arg3 & 0x7;
				if (local28 > 0) {
					do {
						@Pc(1620) int local1620;
						if ((local1620 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[arg2] = ((local1620 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1620 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						arg2++;
						local114 += local128;
						local28--;
					} while (local28 > 0);
				}
			}
			return;
		}
		local34 = arg3 - anInt871;
		local40 = arg7 + arg10 * local34;
		local46 = arg8 + arg11 * local34;
		local52 = arg9 + arg12 * local34;
		local56 = local52 >> 12;
		if (local56 == 0) {
			local62 = 0;
			local66 = 0;
		} else {
			local62 = local40 / local56;
			local66 = local46 / local56;
		}
		local40 += arg10 * local28;
		local46 += arg11 * local28;
		local52 += arg12 * local28;
		local56 = local52 >> 12;
		if (local56 == 0) {
			local99 = 0;
			local103 = 0;
		} else {
			local99 = local40 / local56;
			local103 = local46 / local56;
		}
		local114 = (local62 << 20) + local66;
		local128 = ((local99 - local62) / local28 << 20) + (local103 - local66) / local28;
		local28 >>= 0x3;
		local136 = arg6 << 3;
		local140 = arg5 >> 8;
		if (aBoolean56) {
			if (local28 > 0) {
				do {
					local154 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					local157 = arg2 + 1;
					arg0[arg2] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					@Pc(189) int local189 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg0[local157++] = ((local189 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local189 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					@Pc(224) int local224 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg0[local157++] = ((local224 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local224 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					@Pc(259) int local259 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg0[local157++] = ((local259 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local259 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					@Pc(294) int local294 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg0[local157++] = ((local294 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local294 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					@Pc(329) int local329 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg0[local157++] = ((local329 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local329 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					@Pc(364) int local364 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg0[local157++] = ((local364 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local364 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					@Pc(399) int local399 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg2 = local157 + 1;
					arg0[local157] = ((local399 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local399 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					arg5 += local136;
					local140 = arg5 >> 8;
					local28--;
				} while (local28 > 0);
			}
			local28 = arg4 - arg3 & 0x7;
			if (local28 > 0) {
				do {
					local154 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg0[arg2++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					local28--;
				} while (local28 > 0);
				return;
			}
			return;
		}
		if (local28 > 0) {
			do {
				@Pc(495) int local495;
				if ((local495 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[arg2] = ((local495 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local495 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				local157 = arg2 + 1;
				local114 += local128;
				@Pc(532) int local532;
				if ((local532 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[local157] = ((local532 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local532 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				local157++;
				local114 += local128;
				@Pc(569) int local569;
				if ((local569 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[local157] = ((local569 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local569 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				local157++;
				local114 += local128;
				@Pc(606) int local606;
				if ((local606 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[local157] = ((local606 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local606 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				local157++;
				local114 += local128;
				@Pc(643) int local643;
				if ((local643 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[local157] = ((local643 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local643 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				local157++;
				local114 += local128;
				@Pc(680) int local680;
				if ((local680 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[local157] = ((local680 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local680 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				local157++;
				local114 += local128;
				@Pc(717) int local717;
				if ((local717 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[local157] = ((local717 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local717 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				local157++;
				local114 += local128;
				@Pc(754) int local754;
				if ((local754 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[local157] = ((local754 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local754 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				arg2 = local157 + 1;
				local114 += local128;
				arg5 += local136;
				local140 = arg5 >> 8;
				local28--;
			} while (local28 > 0);
		}
		local28 = arg4 - arg3 & 0x7;
		if (local28 <= 0) {
			return;
		}
		do {
			@Pc(810) int local810;
			if ((local810 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
				arg0[arg2] = ((local810 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local810 & 0xFF00) * local140 & 0xFF0000) >> 8;
			}
			arg2++;
			local114 += local128;
			local28--;
		} while (local28 > 0);
		return;
	}
}
