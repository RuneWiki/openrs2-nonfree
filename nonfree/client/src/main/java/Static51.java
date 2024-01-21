import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ib", name = "V", descriptor = "I")
	public static int anInt1299;

	@OriginalMember(owner = "client!ib", name = "X", descriptor = "I")
	public static int anInt1300;

	@OriginalMember(owner = "client!ib", name = "Y", descriptor = "I")
	public static int anInt1301;

	@OriginalMember(owner = "client!ib", name = "Z", descriptor = "I")
	public static int anInt1302;

	@OriginalMember(owner = "client!ib", name = "bb", descriptor = "I")
	public static int anInt1303;

	@OriginalMember(owner = "client!ib", name = "db", descriptor = "I")
	public static int anInt1304;

	@OriginalMember(owner = "client!ib", name = "gb", descriptor = "I")
	private static int anInt1306;

	@OriginalMember(owner = "client!ib", name = "hb", descriptor = "Lclient!p;")
	public static Interface1 anInterface1_1;

	@OriginalMember(owner = "client!ib", name = "ib", descriptor = "I")
	public static int anInt1307;

	@OriginalMember(owner = "client!ib", name = "U", descriptor = "Z")
	public static boolean aBoolean41 = false;

	@OriginalMember(owner = "client!ib", name = "ab", descriptor = "[I")
	public static int[] anIntArray196 = new int[65536];

	@OriginalMember(owner = "client!ib", name = "eb", descriptor = "I")
	public static int anInt1305 = 0;

	@OriginalMember(owner = "client!ib", name = "fb", descriptor = "Z")
	private static boolean aBoolean42 = false;

	@OriginalMember(owner = "client!ib", name = "jb", descriptor = "Z")
	public static boolean aBoolean43 = true;

	@OriginalMember(owner = "client!ib", name = "lb", descriptor = "[I")
	private static int[] anIntArray199 = new int[1024];

	@OriginalMember(owner = "client!ib", name = "mb", descriptor = "Z")
	private static boolean aBoolean44 = false;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([I[IIIIIIIIIIIIII)V")
	private static void method925(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int arg11, @OriginalArg(14) int arg12) {
		if (aBoolean41) {
			if (arg4 > anInt1304) {
				arg4 = anInt1304;
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
		if (!aBoolean42) {
			local34 = arg3 - anInt1302;
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
			if (aBoolean44) {
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
		local34 = arg3 - anInt1302;
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
		if (aBoolean44) {
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

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(D)V")
	public static void method926(@OriginalArg(0) double arg0) {
		method937(arg0);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([IIIIIIII)V")
	private static void method927(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (aBoolean41) {
			if (arg3 > anInt1304) {
				arg3 = anInt1304;
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
		if (!aBoolean43) {
			local32 = arg3 - arg2;
			if (anInt1305 == 0) {
				do {
					arg0[arg1++] = anIntArray196[arg4 >> 8];
					arg4 += arg5;
					local32--;
				} while (local32 > 0);
			} else {
				local98 = anInt1305;
				local102 = 256 - anInt1305;
				do {
					local46 = anIntArray196[arg4 >> 8];
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
		if (anInt1305 == 0) {
			if (local32 > 0) {
				do {
					local46 = anIntArray196[arg4 >> 8];
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
				local46 = anIntArray196[arg4 >> 8];
				do {
					arg0[arg1++] = local46;
					local32--;
				} while (local32 > 0);
				return;
			}
			return;
		}
		local98 = anInt1305;
		local102 = 256 - anInt1305;
		if (local32 > 0) {
			do {
				local46 = anIntArray196[arg4 >> 8];
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
		local46 = anIntArray196[arg4 >> 8];
		local46 = ((local46 & 0xFF00FF) * local102 >> 8 & 0xFF00FF) + ((local46 & 0xFF00) * local102 >> 8 & 0xFF00);
		do {
			local138 = arg0[arg1];
			arg0[arg1++] = local46 + ((local138 & 0xFF00FF) * local98 >> 8 & 0xFF00FF) + ((local138 & 0xFF00) * local98 >> 8 & 0xFF00);
			local32--;
		} while (local32 > 0);
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)I")
	private static int method928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "([I[IIIIIIIIIIIIII)V")
	private static void method929(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int arg11, @OriginalArg(14) int arg12) {
		if (aBoolean41) {
			if (arg4 > anInt1304) {
				arg4 = anInt1304;
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
		@Pc(160) int local160;
		@Pc(148) int local148;
		@Pc(68) int local68;
		@Pc(72) int local72;
		@Pc(109) int local109;
		@Pc(113) int local113;
		@Pc(62) int local62;
		@Pc(34) int local34;
		@Pc(174) int local174;
		@Pc(134) int local134;
		@Pc(177) int local177;
		@Pc(156) int local156;
		@Pc(42) int local42;
		@Pc(50) int local50;
		@Pc(58) int local58;
		if (aBoolean42) {
			local34 = arg3 - anInt1302;
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
				if (local68 < 0) {
					local68 = 0;
				} else if (local68 > 4032) {
					local68 = 4032;
				}
			}
			arg7 = local42 + arg10;
			arg8 = local50 + arg11;
			arg9 = local58 + arg12;
			local62 = arg9 >> 12;
			if (local62 == 0) {
				local109 = 0;
				local113 = 0;
			} else {
				local109 = arg7 / local62;
				local113 = arg8 / local62;
				if (local109 < 0) {
					local109 = 0;
				} else if (local109 > 4032) {
					local109 = 4032;
				}
			}
			local134 = (local68 << 20) + local72;
			local148 = (local109 - local68 >> 3 << 20) + (local113 - local72 >> 3);
			local28 >>= 0x3;
			local156 = arg6 << 3;
			local160 = arg5 >> 8;
			if (aBoolean44) {
				if (local28 > 0) {
					do {
						local174 = arg1[(local134 & 0xFC0) + (local134 >>> 26)];
						local177 = arg2 + 1;
						arg0[arg2] = ((local174 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local174 & 0xFF00) * local160 & 0xFF0000) >> 8;
						local134 += local148;
						local174 = arg1[(local134 & 0xFC0) + (local134 >>> 26)];
						arg0[local177++] = ((local174 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local174 & 0xFF00) * local160 & 0xFF0000) >> 8;
						local134 += local148;
						local174 = arg1[(local134 & 0xFC0) + (local134 >>> 26)];
						arg0[local177++] = ((local174 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local174 & 0xFF00) * local160 & 0xFF0000) >> 8;
						local134 += local148;
						local174 = arg1[(local134 & 0xFC0) + (local134 >>> 26)];
						arg0[local177++] = ((local174 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local174 & 0xFF00) * local160 & 0xFF0000) >> 8;
						local134 += local148;
						local174 = arg1[(local134 & 0xFC0) + (local134 >>> 26)];
						arg0[local177++] = ((local174 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local174 & 0xFF00) * local160 & 0xFF0000) >> 8;
						local134 += local148;
						local174 = arg1[(local134 & 0xFC0) + (local134 >>> 26)];
						arg0[local177++] = ((local174 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local174 & 0xFF00) * local160 & 0xFF0000) >> 8;
						local134 += local148;
						local174 = arg1[(local134 & 0xFC0) + (local134 >>> 26)];
						arg0[local177++] = ((local174 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local174 & 0xFF00) * local160 & 0xFF0000) >> 8;
						local134 += local148;
						local174 = arg1[(local134 & 0xFC0) + (local134 >>> 26)];
						arg2 = local177 + 1;
						arg0[local177] = ((local174 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local174 & 0xFF00) * local160 & 0xFF0000) >> 8;
						local68 = local109;
						local72 = local113;
						arg7 += arg10;
						arg8 += arg11;
						arg9 += arg12;
						local62 = arg9 >> 12;
						if (local62 == 0) {
							local109 = 0;
							local113 = 0;
						} else {
							local109 = arg7 / local62;
							local113 = arg8 / local62;
							if (local109 < 0) {
								local109 = 0;
							} else if (local109 > 4032) {
								local109 = 4032;
							}
						}
						local134 = (local68 << 20) + local72;
						local148 = (local109 - local68 >> 3 << 20) + (local113 - local72 >> 3);
						arg5 += local156;
						local160 = arg5 >> 8;
						local28--;
					} while (local28 > 0);
				}
				local28 = arg4 - arg3 & 0x7;
				if (local28 > 0) {
					do {
						local174 = arg1[(local134 & 0xFC0) + (local134 >>> 26)];
						arg0[arg2++] = ((local174 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local174 & 0xFF00) * local160 & 0xFF0000) >> 8;
						local134 += local148;
						local28--;
					} while (local28 > 0);
					return;
				}
			} else {
				if (local28 > 0) {
					do {
						@Pc(580) int local580;
						if ((local580 = arg1[(local134 & 0xFC0) + (local134 >>> 26)]) != 0) {
							arg0[arg2] = ((local580 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local580 & 0xFF00) * local160 & 0xFF0000) >> 8;
						}
						local177 = arg2 + 1;
						local134 += local148;
						@Pc(617) int local617;
						if ((local617 = arg1[(local134 & 0xFC0) + (local134 >>> 26)]) != 0) {
							arg0[local177] = ((local617 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local617 & 0xFF00) * local160 & 0xFF0000) >> 8;
						}
						local177++;
						local134 += local148;
						@Pc(654) int local654;
						if ((local654 = arg1[(local134 & 0xFC0) + (local134 >>> 26)]) != 0) {
							arg0[local177] = ((local654 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local654 & 0xFF00) * local160 & 0xFF0000) >> 8;
						}
						local177++;
						local134 += local148;
						@Pc(691) int local691;
						if ((local691 = arg1[(local134 & 0xFC0) + (local134 >>> 26)]) != 0) {
							arg0[local177] = ((local691 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local691 & 0xFF00) * local160 & 0xFF0000) >> 8;
						}
						local177++;
						local134 += local148;
						@Pc(728) int local728;
						if ((local728 = arg1[(local134 & 0xFC0) + (local134 >>> 26)]) != 0) {
							arg0[local177] = ((local728 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local728 & 0xFF00) * local160 & 0xFF0000) >> 8;
						}
						local177++;
						local134 += local148;
						@Pc(765) int local765;
						if ((local765 = arg1[(local134 & 0xFC0) + (local134 >>> 26)]) != 0) {
							arg0[local177] = ((local765 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local765 & 0xFF00) * local160 & 0xFF0000) >> 8;
						}
						local177++;
						local134 += local148;
						@Pc(802) int local802;
						if ((local802 = arg1[(local134 & 0xFC0) + (local134 >>> 26)]) != 0) {
							arg0[local177] = ((local802 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local802 & 0xFF00) * local160 & 0xFF0000) >> 8;
						}
						local177++;
						local134 += local148;
						@Pc(839) int local839;
						if ((local839 = arg1[(local134 & 0xFC0) + (local134 >>> 26)]) != 0) {
							arg0[local177] = ((local839 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local839 & 0xFF00) * local160 & 0xFF0000) >> 8;
						}
						arg2 = local177 + 1;
						local68 = local109;
						local72 = local113;
						arg7 += arg10;
						arg8 += arg11;
						arg9 += arg12;
						local62 = arg9 >> 12;
						if (local62 == 0) {
							local109 = 0;
							local113 = 0;
						} else {
							local109 = arg7 / local62;
							local113 = arg8 / local62;
							if (local109 < 0) {
								local109 = 0;
							} else if (local109 > 4032) {
								local109 = 4032;
							}
						}
						local134 = (local68 << 20) + local72;
						local148 = (local109 - local68 >> 3 << 20) + (local113 - local72 >> 3);
						arg5 += local156;
						local160 = arg5 >> 8;
						local28--;
					} while (local28 > 0);
				}
				local28 = arg4 - arg3 & 0x7;
				if (local28 <= 0) {
					return;
				}
				do {
					@Pc(960) int local960;
					if ((local960 = arg1[(local134 & 0xFC0) + (local134 >>> 26)]) != 0) {
						arg0[arg2] = ((local960 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local960 & 0xFF00) * local160 & 0xFF0000) >> 8;
					}
					arg2++;
					local134 += local148;
					local28--;
				} while (local28 > 0);
			}
			return;
		}
		local34 = arg3 - anInt1302;
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
			if (local68 < 0) {
				local68 = 0;
			} else if (local68 > 16256) {
				local68 = 16256;
			}
		}
		arg7 = local42 + arg10;
		arg8 = local50 + arg11;
		arg9 = local58 + arg12;
		local62 = arg9 >> 14;
		if (local62 == 0) {
			local109 = 0;
			local113 = 0;
		} else {
			local109 = arg7 / local62;
			local113 = arg8 / local62;
			if (local109 < 0) {
				local109 = 0;
			} else if (local109 > 16256) {
				local109 = 16256;
			}
		}
		local134 = (local68 << 18) + local72;
		local148 = (local109 - local68 >> 3 << 18) + (local113 - local72 >> 3);
		local28 >>= 0x3;
		local156 = arg6 << 3;
		local160 = arg5 >> 8;
		if (aBoolean44) {
			if (local28 > 0) {
				do {
					local174 = arg1[(local134 & 0x3F80) + (local134 >>> 25)];
					local177 = arg2 + 1;
					arg0[arg2] = ((local174 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local174 & 0xFF00) * local160 & 0xFF0000) >> 8;
					local134 += local148;
					@Pc(1169) int local1169 = arg1[(local134 & 0x3F80) + (local134 >>> 25)];
					@Pc(1172) int local1172 = local177 + 1;
					arg0[local177] = ((local1169 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local1169 & 0xFF00) * local160 & 0xFF0000) >> 8;
					local134 += local148;
					@Pc(1204) int local1204 = arg1[(local134 & 0x3F80) + (local134 >>> 25)];
					@Pc(1207) int local1207 = local1172 + 1;
					arg0[local1172] = ((local1204 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local1204 & 0xFF00) * local160 & 0xFF0000) >> 8;
					local134 += local148;
					@Pc(1239) int local1239 = arg1[(local134 & 0x3F80) + (local134 >>> 25)];
					@Pc(1242) int local1242 = local1207 + 1;
					arg0[local1207] = ((local1239 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local1239 & 0xFF00) * local160 & 0xFF0000) >> 8;
					local134 += local148;
					@Pc(1274) int local1274 = arg1[(local134 & 0x3F80) + (local134 >>> 25)];
					@Pc(1277) int local1277 = local1242 + 1;
					arg0[local1242] = ((local1274 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local1274 & 0xFF00) * local160 & 0xFF0000) >> 8;
					local134 += local148;
					@Pc(1309) int local1309 = arg1[(local134 & 0x3F80) + (local134 >>> 25)];
					@Pc(1312) int local1312 = local1277 + 1;
					arg0[local1277] = ((local1309 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local1309 & 0xFF00) * local160 & 0xFF0000) >> 8;
					local134 += local148;
					@Pc(1344) int local1344 = arg1[(local134 & 0x3F80) + (local134 >>> 25)];
					@Pc(1347) int local1347 = local1312 + 1;
					arg0[local1312] = ((local1344 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local1344 & 0xFF00) * local160 & 0xFF0000) >> 8;
					local134 += local148;
					@Pc(1379) int local1379 = arg1[(local134 & 0x3F80) + (local134 >>> 25)];
					arg2 = local1347 + 1;
					arg0[local1347] = ((local1379 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local1379 & 0xFF00) * local160 & 0xFF0000) >> 8;
					local68 = local109;
					local72 = local113;
					arg7 += arg10;
					arg8 += arg11;
					arg9 += arg12;
					local62 = arg9 >> 14;
					if (local62 == 0) {
						local109 = 0;
						local113 = 0;
					} else {
						local109 = arg7 / local62;
						local113 = arg8 / local62;
						if (local109 < 0) {
							local109 = 0;
						} else if (local109 > 16256) {
							local109 = 16256;
						}
					}
					local134 = (local68 << 18) + local72;
					local148 = (local109 - local68 >> 3 << 18) + (local113 - local72 >> 3);
					arg5 += local156;
					local160 = arg5 >> 8;
					local28--;
				} while (local28 > 0);
			}
			local28 = arg4 - arg3 & 0x7;
			if (local28 > 0) {
				do {
					local174 = arg1[(local134 & 0x3F80) + (local134 >>> 25)];
					arg0[arg2++] = ((local174 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local174 & 0xFF00) * local160 & 0xFF0000) >> 8;
					local134 += local148;
					local28--;
				} while (local28 > 0);
				return;
			}
			return;
		}
		if (local28 > 0) {
			do {
				@Pc(1540) int local1540;
				if ((local1540 = arg1[(local134 & 0x3F80) + (local134 >>> 25)]) != 0) {
					arg0[arg2] = ((local1540 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local1540 & 0xFF00) * local160 & 0xFF0000) >> 8;
				}
				local177 = arg2 + 1;
				local134 += local148;
				@Pc(1577) int local1577;
				if ((local1577 = arg1[(local134 & 0x3F80) + (local134 >>> 25)]) != 0) {
					arg0[local177] = ((local1577 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local1577 & 0xFF00) * local160 & 0xFF0000) >> 8;
				}
				local177++;
				local134 += local148;
				@Pc(1614) int local1614;
				if ((local1614 = arg1[(local134 & 0x3F80) + (local134 >>> 25)]) != 0) {
					arg0[local177] = ((local1614 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local1614 & 0xFF00) * local160 & 0xFF0000) >> 8;
				}
				local177++;
				local134 += local148;
				@Pc(1651) int local1651;
				if ((local1651 = arg1[(local134 & 0x3F80) + (local134 >>> 25)]) != 0) {
					arg0[local177] = ((local1651 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local1651 & 0xFF00) * local160 & 0xFF0000) >> 8;
				}
				local177++;
				local134 += local148;
				@Pc(1688) int local1688;
				if ((local1688 = arg1[(local134 & 0x3F80) + (local134 >>> 25)]) != 0) {
					arg0[local177] = ((local1688 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local1688 & 0xFF00) * local160 & 0xFF0000) >> 8;
				}
				local177++;
				local134 += local148;
				@Pc(1725) int local1725;
				if ((local1725 = arg1[(local134 & 0x3F80) + (local134 >>> 25)]) != 0) {
					arg0[local177] = ((local1725 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local1725 & 0xFF00) * local160 & 0xFF0000) >> 8;
				}
				local177++;
				local134 += local148;
				@Pc(1762) int local1762;
				if ((local1762 = arg1[(local134 & 0x3F80) + (local134 >>> 25)]) != 0) {
					arg0[local177] = ((local1762 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local1762 & 0xFF00) * local160 & 0xFF0000) >> 8;
				}
				local177++;
				local134 += local148;
				@Pc(1799) int local1799;
				if ((local1799 = arg1[(local134 & 0x3F80) + (local134 >>> 25)]) != 0) {
					arg0[local177] = ((local1799 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local1799 & 0xFF00) * local160 & 0xFF0000) >> 8;
				}
				arg2 = local177 + 1;
				local68 = local109;
				local72 = local113;
				arg7 += arg10;
				arg8 += arg11;
				arg9 += arg12;
				local62 = arg9 >> 14;
				if (local62 == 0) {
					local109 = 0;
					local113 = 0;
				} else {
					local109 = arg7 / local62;
					local113 = arg8 / local62;
					if (local109 < 0) {
						local109 = 0;
					} else if (local109 > 16256) {
						local109 = 16256;
					}
				}
				local134 = (local68 << 18) + local72;
				local148 = (local109 - local68 >> 3 << 18) + (local113 - local72 >> 3);
				arg5 += local156;
				local160 = arg5 >> 8;
				local28--;
			} while (local28 > 0);
		}
		local28 = arg4 - arg3 & 0x7;
		if (local28 <= 0) {
			return;
		}
		do {
			@Pc(1920) int local1920;
			if ((local1920 = arg1[(local134 & 0x3F80) + (local134 >>> 25)]) != 0) {
				arg0[arg2] = ((local1920 & 0xFF00FF) * local160 & 0xFF00FF00) + ((local1920 & 0xFF00) * local160 & 0xFF0000) >> 8;
			}
			arg2++;
			local134 += local148;
			local28--;
		} while (local28 > 0);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
	public static void method930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18) {
		@Pc(4) int[] local4 = anInterface1_1.method1154(arg18);
		@Pc(11) int local11;
		if (local4 == null) {
			local11 = anInterface1_1.method1153(arg18);
			method942(arg0, arg1, arg2, arg3, arg4, arg5, method928(local11, arg6), method928(local11, arg7), method928(local11, arg8));
			return;
		}
		aBoolean42 = anInterface1_1.method1151(arg18);
		aBoolean44 = anInterface1_1.method1152(arg18);
		local11 = arg4 - arg3;
		@Pc(46) int local46 = arg1 - arg0;
		@Pc(50) int local50 = arg5 - arg3;
		@Pc(54) int local54 = arg2 - arg0;
		@Pc(58) int local58 = arg7 - arg6;
		@Pc(62) int local62 = arg8 - arg6;
		@Pc(64) int local64 = 0;
		if (arg1 != arg0) {
			local64 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(79) int local79 = 0;
		if (arg2 != arg1) {
			local79 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(94) int local94 = 0;
		if (arg2 != arg0) {
			local94 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		@Pc(115) int local115 = local11 * local54 - local50 * local46;
		if (local115 == 0) {
			return;
		}
		@Pc(130) int local130 = (local58 * local54 - local62 * local46 << 9) / local115;
		@Pc(142) int local142 = (local62 * local11 - local58 * local50 << 9) / local115;
		@Pc(146) int local146 = arg9 - arg10;
		@Pc(150) int local150 = arg12 - arg13;
		@Pc(154) int local154 = arg15 - arg16;
		@Pc(158) int local158 = arg11 - arg9;
		@Pc(162) int local162 = arg14 - arg12;
		@Pc(166) int local166 = arg17 - arg15;
		@Pc(176) int local176 = local158 * arg12 - local162 * arg9 << 14;
		@Pc(186) int local186 = local162 * arg15 - local166 * arg12 << 5;
		@Pc(196) int local196 = local166 * arg9 - local158 * arg15 << 5;
		@Pc(206) int local206 = local146 * arg12 - local150 * arg9 << 14;
		@Pc(216) int local216 = local150 * arg15 - local154 * arg12 << 5;
		@Pc(226) int local226 = local154 * arg9 - local146 * arg15 << 5;
		@Pc(236) int local236 = local150 * local158 - local146 * local162 << 14;
		@Pc(246) int local246 = local154 * local162 - local150 * local166 << 5;
		@Pc(256) int local256 = local146 * local166 - local154 * local158 << 5;
		@Pc(335) int local335;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < anInt1306) {
				if (arg1 > anInt1306) {
					arg1 = anInt1306;
				}
				if (arg2 > anInt1306) {
					arg2 = anInt1306;
				}
				arg6 = (arg6 << 9) + local130 - local130 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local94 * arg0;
						arg3 -= local64 * arg0;
						arg6 -= local142 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local79 * arg1;
						arg1 = 0;
					}
					local335 = arg0 - anInt1301;
					local176 += local196 * local335;
					local206 += local226 * local335;
					local236 += local256 * local335;
					if (arg0 != arg1 && local94 < local64 || arg0 == arg1 && local94 > local79) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray199[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method925(Static46.anIntArray385, local4, arg0, arg5 >> 16, arg4 >> 16, arg6, local130, local176, local206, local236, local186, local216, local246);
									arg5 += local94;
									arg4 += local79;
									arg6 += local142;
									arg0 += Static46.anInt3188;
									local176 += local196;
									local206 += local226;
									local236 += local256;
								}
							}
							method925(Static46.anIntArray385, local4, arg0, arg5 >> 16, arg3 >> 16, arg6, local130, local176, local206, local236, local186, local216, local246);
							arg5 += local94;
							arg3 += local64;
							arg6 += local142;
							arg0 += Static46.anInt3188;
							local176 += local196;
							local206 += local226;
							local236 += local256;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray199[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method925(Static46.anIntArray385, local4, arg0, arg4 >> 16, arg5 >> 16, arg6, local130, local176, local206, local236, local186, local216, local246);
									arg5 += local94;
									arg4 += local79;
									arg6 += local142;
									arg0 += Static46.anInt3188;
									local176 += local196;
									local206 += local226;
									local236 += local256;
								}
							}
							method925(Static46.anIntArray385, local4, arg0, arg3 >> 16, arg5 >> 16, arg6, local130, local176, local206, local236, local186, local216, local246);
							arg5 += local94;
							arg3 += local64;
							arg6 += local142;
							arg0 += Static46.anInt3188;
							local176 += local196;
							local206 += local226;
							local236 += local256;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local94 * arg0;
						arg3 -= local64 * arg0;
						arg6 -= local142 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local79 * arg2;
						arg2 = 0;
					}
					local335 = arg0 - anInt1301;
					local176 += local196 * local335;
					local206 += local226 * local335;
					local236 += local256 * local335;
					if ((arg0 == arg2 || local94 >= local64) && (arg0 != arg2 || local79 <= local64)) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray199[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method925(Static46.anIntArray385, local4, arg0, arg3 >> 16, arg5 >> 16, arg6, local130, local176, local206, local236, local186, local216, local246);
									arg5 += local79;
									arg3 += local64;
									arg6 += local142;
									arg0 += Static46.anInt3188;
									local176 += local196;
									local206 += local226;
									local236 += local256;
								}
							}
							method925(Static46.anIntArray385, local4, arg0, arg3 >> 16, arg4 >> 16, arg6, local130, local176, local206, local236, local186, local216, local246);
							arg4 += local94;
							arg3 += local64;
							arg6 += local142;
							arg0 += Static46.anInt3188;
							local176 += local196;
							local206 += local226;
							local236 += local256;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray199[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method925(Static46.anIntArray385, local4, arg0, arg5 >> 16, arg3 >> 16, arg6, local130, local176, local206, local236, local186, local216, local246);
									arg5 += local79;
									arg3 += local64;
									arg6 += local142;
									arg0 += Static46.anInt3188;
									local176 += local196;
									local206 += local226;
									local236 += local256;
								}
							}
							method925(Static46.anIntArray385, local4, arg0, arg4 >> 16, arg3 >> 16, arg6, local130, local176, local206, local236, local186, local216, local246);
							arg4 += local94;
							arg3 += local64;
							arg6 += local142;
							arg0 += Static46.anInt3188;
							local176 += local196;
							local206 += local226;
							local236 += local256;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < anInt1306) {
				if (arg2 > anInt1306) {
					arg2 = anInt1306;
				}
				if (arg0 > anInt1306) {
					arg0 = anInt1306;
				}
				arg7 = (arg7 << 9) + local130 - local130 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local64 * arg1;
						arg4 -= local79 * arg1;
						arg7 -= local142 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local94 * arg2;
						arg2 = 0;
					}
					local335 = arg1 - anInt1301;
					local176 += local196 * local335;
					local206 += local226 * local335;
					local236 += local256 * local335;
					if (arg1 != arg2 && local64 < local79 || arg1 == arg2 && local64 > local94) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray199[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method925(Static46.anIntArray385, local4, arg1, arg3 >> 16, arg5 >> 16, arg7, local130, local176, local206, local236, local186, local216, local246);
									arg3 += local64;
									arg5 += local94;
									arg7 += local142;
									arg1 += Static46.anInt3188;
									local176 += local196;
									local206 += local226;
									local236 += local256;
								}
							}
							method925(Static46.anIntArray385, local4, arg1, arg3 >> 16, arg4 >> 16, arg7, local130, local176, local206, local236, local186, local216, local246);
							arg3 += local64;
							arg4 += local79;
							arg7 += local142;
							arg1 += Static46.anInt3188;
							local176 += local196;
							local206 += local226;
							local236 += local256;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray199[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method925(Static46.anIntArray385, local4, arg1, arg5 >> 16, arg3 >> 16, arg7, local130, local176, local206, local236, local186, local216, local246);
									arg3 += local64;
									arg5 += local94;
									arg7 += local142;
									arg1 += Static46.anInt3188;
									local176 += local196;
									local206 += local226;
									local236 += local256;
								}
							}
							method925(Static46.anIntArray385, local4, arg1, arg4 >> 16, arg3 >> 16, arg7, local130, local176, local206, local236, local186, local216, local246);
							arg3 += local64;
							arg4 += local79;
							arg7 += local142;
							arg1 += Static46.anInt3188;
							local176 += local196;
							local206 += local226;
							local236 += local256;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local64 * arg1;
						arg4 -= local79 * arg1;
						arg7 -= local142 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local94 * arg0;
						arg0 = 0;
					}
					local335 = arg1 - anInt1301;
					local176 += local196 * local335;
					local206 += local226 * local335;
					local236 += local256 * local335;
					if (local64 < local79) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray199[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method925(Static46.anIntArray385, local4, arg1, arg3 >> 16, arg4 >> 16, arg7, local130, local176, local206, local236, local186, local216, local246);
									arg3 += local94;
									arg4 += local79;
									arg7 += local142;
									arg1 += Static46.anInt3188;
									local176 += local196;
									local206 += local226;
									local236 += local256;
								}
							}
							method925(Static46.anIntArray385, local4, arg1, arg5 >> 16, arg4 >> 16, arg7, local130, local176, local206, local236, local186, local216, local246);
							arg5 += local64;
							arg4 += local79;
							arg7 += local142;
							arg1 += Static46.anInt3188;
							local176 += local196;
							local206 += local226;
							local236 += local256;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray199[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method925(Static46.anIntArray385, local4, arg1, arg4 >> 16, arg3 >> 16, arg7, local130, local176, local206, local236, local186, local216, local246);
									arg3 += local94;
									arg4 += local79;
									arg7 += local142;
									arg1 += Static46.anInt3188;
									local176 += local196;
									local206 += local226;
									local236 += local256;
								}
							}
							method925(Static46.anIntArray385, local4, arg1, arg4 >> 16, arg5 >> 16, arg7, local130, local176, local206, local236, local186, local216, local246);
							arg5 += local64;
							arg4 += local79;
							arg7 += local142;
							arg1 += Static46.anInt3188;
							local176 += local196;
							local206 += local226;
							local236 += local256;
						}
					}
				}
			}
		} else if (arg2 < anInt1306) {
			if (arg0 > anInt1306) {
				arg0 = anInt1306;
			}
			if (arg1 > anInt1306) {
				arg1 = anInt1306;
			}
			arg8 = (arg8 << 9) + local130 - local130 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local79 * arg2;
					arg5 -= local94 * arg2;
					arg8 -= local142 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local64 * arg0;
					arg0 = 0;
				}
				local335 = arg2 - anInt1301;
				local176 += local196 * local335;
				local206 += local226 * local335;
				local236 += local256 * local335;
				if (local79 < local94) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray199[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method925(Static46.anIntArray385, local4, arg2, arg4 >> 16, arg3 >> 16, arg8, local130, local176, local206, local236, local186, local216, local246);
								arg4 += local79;
								arg3 += local64;
								arg8 += local142;
								arg2 += Static46.anInt3188;
								local176 += local196;
								local206 += local226;
								local236 += local256;
							}
						}
						method925(Static46.anIntArray385, local4, arg2, arg4 >> 16, arg5 >> 16, arg8, local130, local176, local206, local236, local186, local216, local246);
						arg4 += local79;
						arg5 += local94;
						arg8 += local142;
						arg2 += Static46.anInt3188;
						local176 += local196;
						local206 += local226;
						local236 += local256;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray199[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method925(Static46.anIntArray385, local4, arg2, arg3 >> 16, arg4 >> 16, arg8, local130, local176, local206, local236, local186, local216, local246);
								arg4 += local79;
								arg3 += local64;
								arg8 += local142;
								arg2 += Static46.anInt3188;
								local176 += local196;
								local206 += local226;
								local236 += local256;
							}
						}
						method925(Static46.anIntArray385, local4, arg2, arg5 >> 16, arg4 >> 16, arg8, local130, local176, local206, local236, local186, local216, local246);
						arg4 += local79;
						arg5 += local94;
						arg8 += local142;
						arg2 += Static46.anInt3188;
						local176 += local196;
						local206 += local226;
						local236 += local256;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local79 * arg2;
					arg5 -= local94 * arg2;
					arg8 -= local142 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local64 * arg1;
					arg1 = 0;
				}
				local335 = arg2 - anInt1301;
				local176 += local196 * local335;
				local206 += local226 * local335;
				local236 += local256 * local335;
				if (local79 < local94) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray199[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method925(Static46.anIntArray385, local4, arg2, arg4 >> 16, arg5 >> 16, arg8, local130, local176, local206, local236, local186, local216, local246);
								arg4 += local64;
								arg5 += local94;
								arg8 += local142;
								arg2 += Static46.anInt3188;
								local176 += local196;
								local206 += local226;
								local236 += local256;
							}
						}
						method925(Static46.anIntArray385, local4, arg2, arg3 >> 16, arg5 >> 16, arg8, local130, local176, local206, local236, local186, local216, local246);
						arg3 += local79;
						arg5 += local94;
						arg8 += local142;
						arg2 += Static46.anInt3188;
						local176 += local196;
						local206 += local226;
						local236 += local256;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray199[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method925(Static46.anIntArray385, local4, arg2, arg5 >> 16, arg4 >> 16, arg8, local130, local176, local206, local236, local186, local216, local246);
								arg4 += local64;
								arg5 += local94;
								arg8 += local142;
								arg2 += Static46.anInt3188;
								local176 += local196;
								local206 += local226;
								local236 += local256;
							}
						}
						method925(Static46.anIntArray385, local4, arg2, arg5 >> 16, arg3 >> 16, arg8, local130, local176, local206, local236, local186, local216, local246);
						arg3 += local79;
						arg5 += local94;
						arg8 += local142;
						arg2 += Static46.anInt3188;
						local176 += local196;
						local206 += local226;
						local236 += local256;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(II)V")
	public static void method931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = anIntArray199[0];
		@Pc(7) int local7 = local3 / Static46.anInt3188;
		@Pc(13) int local13 = local3 - local7 * Static46.anInt3188;
		anInt1302 = arg0 - local13;
		anInt1301 = arg1 - local7;
		anInt1303 = -anInt1302;
		anInt1307 = anInt1304 - anInt1302;
		anInt1299 = -anInt1301;
		anInt1300 = anInt1306 - anInt1301;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!p;)V")
	public static void method932(@OriginalArg(0) Interface1 arg0) {
		anInterface1_1 = arg0;
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "()V")
	public static void method933() {
		anInt1302 = anInt1304 / 2;
		anInt1301 = anInt1306 / 2;
		anInt1303 = -anInt1302;
		anInt1307 = anInt1304 - anInt1302;
		anInt1299 = -anInt1301;
		anInt1300 = anInt1306 - anInt1301;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ID)I")
	public static int method934(@OriginalArg(0) int arg0, @OriginalArg(1) double arg1) {
		@Pc(6) double local6 = (double) (arg0 >> 16) / 256.0D;
		@Pc(15) double local15 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(22) double local22 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = Math.pow(local6, arg1);
		@Pc(30) double local30 = Math.pow(local15, arg1);
		@Pc(34) double local34 = Math.pow(local22, arg1);
		@Pc(39) int local39 = (int) (local26 * 256.0D);
		@Pc(44) int local44 = (int) (local30 * 256.0D);
		@Pc(49) int local49 = (int) (local34 * 256.0D);
		return (local39 << 16) + (local44 << 8) + local49;
	}

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "()V")
	public static void method935() {
		method938(Static46.anInt3186, Static46.anInt3189, Static46.anInt3185, Static46.anInt3190);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIII)V")
	public static void method936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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
			if (arg0 < anInt1306) {
				if (arg1 > anInt1306) {
					arg1 = anInt1306;
				}
				if (arg2 > anInt1306) {
					arg2 = anInt1306;
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
						arg0 = anIntArray199[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method939(Static46.anIntArray385, arg0, arg6, arg5 >> 16, arg4 >> 16);
									arg5 += local31;
									arg4 += local16;
									arg0 += Static46.anInt3188;
								}
							}
							method939(Static46.anIntArray385, arg0, arg6, arg5 >> 16, arg3 >> 16);
							arg5 += local31;
							arg3 += local1;
							arg0 += Static46.anInt3188;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray199[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method939(Static46.anIntArray385, arg0, arg6, arg4 >> 16, arg5 >> 16);
									arg5 += local31;
									arg4 += local16;
									arg0 += Static46.anInt3188;
								}
							}
							method939(Static46.anIntArray385, arg0, arg6, arg3 >> 16, arg5 >> 16);
							arg5 += local31;
							arg3 += local1;
							arg0 += Static46.anInt3188;
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
						arg0 = anIntArray199[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method939(Static46.anIntArray385, arg0, arg6, arg5 >> 16, arg3 >> 16);
									arg5 += local16;
									arg3 += local1;
									arg0 += Static46.anInt3188;
								}
							}
							method939(Static46.anIntArray385, arg0, arg6, arg4 >> 16, arg3 >> 16);
							arg4 += local31;
							arg3 += local1;
							arg0 += Static46.anInt3188;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray199[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method939(Static46.anIntArray385, arg0, arg6, arg3 >> 16, arg5 >> 16);
									arg5 += local16;
									arg3 += local1;
									arg0 += Static46.anInt3188;
								}
							}
							method939(Static46.anIntArray385, arg0, arg6, arg3 >> 16, arg4 >> 16);
							arg4 += local31;
							arg3 += local1;
							arg0 += Static46.anInt3188;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < anInt1306) {
				if (arg2 > anInt1306) {
					arg2 = anInt1306;
				}
				if (arg0 > anInt1306) {
					arg0 = anInt1306;
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
						arg1 = anIntArray199[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method939(Static46.anIntArray385, arg1, arg6, arg3 >> 16, arg5 >> 16);
									arg3 += local1;
									arg5 += local31;
									arg1 += Static46.anInt3188;
								}
							}
							method939(Static46.anIntArray385, arg1, arg6, arg3 >> 16, arg4 >> 16);
							arg3 += local1;
							arg4 += local16;
							arg1 += Static46.anInt3188;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray199[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method939(Static46.anIntArray385, arg1, arg6, arg5 >> 16, arg3 >> 16);
									arg3 += local1;
									arg5 += local31;
									arg1 += Static46.anInt3188;
								}
							}
							method939(Static46.anIntArray385, arg1, arg6, arg4 >> 16, arg3 >> 16);
							arg3 += local1;
							arg4 += local16;
							arg1 += Static46.anInt3188;
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
						arg1 = anIntArray199[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method939(Static46.anIntArray385, arg1, arg6, arg3 >> 16, arg4 >> 16);
									arg3 += local31;
									arg4 += local16;
									arg1 += Static46.anInt3188;
								}
							}
							method939(Static46.anIntArray385, arg1, arg6, arg5 >> 16, arg4 >> 16);
							arg5 += local1;
							arg4 += local16;
							arg1 += Static46.anInt3188;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray199[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method939(Static46.anIntArray385, arg1, arg6, arg4 >> 16, arg3 >> 16);
									arg3 += local31;
									arg4 += local16;
									arg1 += Static46.anInt3188;
								}
							}
							method939(Static46.anIntArray385, arg1, arg6, arg4 >> 16, arg5 >> 16);
							arg5 += local1;
							arg4 += local16;
							arg1 += Static46.anInt3188;
						}
					}
				}
			}
		} else if (arg2 < anInt1306) {
			if (arg0 > anInt1306) {
				arg0 = anInt1306;
			}
			if (arg1 > anInt1306) {
				arg1 = anInt1306;
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
					arg2 = anIntArray199[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method939(Static46.anIntArray385, arg2, arg6, arg4 >> 16, arg3 >> 16);
								arg4 += local16;
								arg3 += local1;
								arg2 += Static46.anInt3188;
							}
						}
						method939(Static46.anIntArray385, arg2, arg6, arg4 >> 16, arg5 >> 16);
						arg4 += local16;
						arg5 += local31;
						arg2 += Static46.anInt3188;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray199[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method939(Static46.anIntArray385, arg2, arg6, arg3 >> 16, arg4 >> 16);
								arg4 += local16;
								arg3 += local1;
								arg2 += Static46.anInt3188;
							}
						}
						method939(Static46.anIntArray385, arg2, arg6, arg5 >> 16, arg4 >> 16);
						arg4 += local16;
						arg5 += local31;
						arg2 += Static46.anInt3188;
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
					arg2 = anIntArray199[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method939(Static46.anIntArray385, arg2, arg6, arg4 >> 16, arg5 >> 16);
								arg4 += local1;
								arg5 += local31;
								arg2 += Static46.anInt3188;
							}
						}
						method939(Static46.anIntArray385, arg2, arg6, arg3 >> 16, arg5 >> 16);
						arg3 += local16;
						arg5 += local31;
						arg2 += Static46.anInt3188;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray199[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method939(Static46.anIntArray385, arg2, arg6, arg5 >> 16, arg4 >> 16);
								arg4 += local1;
								arg5 += local31;
								arg2 += Static46.anInt3188;
							}
						}
						method939(Static46.anIntArray385, arg2, arg6, arg5 >> 16, arg3 >> 16);
						arg3 += local16;
						arg5 += local31;
						arg2 += Static46.anInt3188;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(DII)V")
	private static void method937(@OriginalArg(0) double arg0) {
		@Pc(7) double local7 = arg0 + Math.random() * 0.03D - 0.015D;
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < 512; local13++) {
			@Pc(23) double local23 = (double) (local13 >> 3) / 64.0D + 0.0078125D;
			@Pc(32) double local32 = (double) (local13 & 0x7) / 8.0D + 0.0625D;
			for (@Pc(34) int local34 = 0; local34 < 128; local34++) {
				@Pc(40) double local40 = (double) local34 / 128.0D;
				@Pc(42) double local42 = local40;
				@Pc(44) double local44 = local40;
				@Pc(46) double local46 = local40;
				if (local32 != 0.0D) {
					@Pc(60) double local60;
					if (local40 < 0.5D) {
						local60 = local40 * (local32 + 1.0D);
					} else {
						local60 = local40 + local32 - local40 * local32;
					}
					@Pc(75) double local75 = local40 * 2.0D - local60;
					@Pc(79) double local79 = local23 + 0.3333333333333333D;
					if (local79 > 1.0D) {
						local79--;
					}
					@Pc(93) double local93 = local23 - 0.3333333333333333D;
					if (local93 < 0.0D) {
						local93++;
					}
					if (local79 * 6.0D < 1.0D) {
						local42 = local75 + (local60 - local75) * 6.0D * local79;
					} else if (local79 * 2.0D < 1.0D) {
						local42 = local60;
					} else if (local79 * 3.0D < 2.0D) {
						local42 = local75 + (local60 - local75) * (0.6666666666666666D - local79) * 6.0D;
					} else {
						local42 = local75;
					}
					if (local23 * 6.0D < 1.0D) {
						local44 = local75 + (local60 - local75) * 6.0D * local23;
					} else if (local23 * 2.0D < 1.0D) {
						local44 = local60;
					} else if (local23 * 3.0D < 2.0D) {
						local44 = local75 + (local60 - local75) * (0.6666666666666666D - local23) * 6.0D;
					} else {
						local44 = local75;
					}
					if (local93 * 6.0D < 1.0D) {
						local46 = local75 + (local60 - local75) * 6.0D * local93;
					} else if (local93 * 2.0D < 1.0D) {
						local46 = local60;
					} else if (local93 * 3.0D < 2.0D) {
						local46 = local75 + (local60 - local75) * (0.6666666666666666D - local93) * 6.0D;
					} else {
						local46 = local75;
					}
				}
				@Pc(247) int local247 = (int) (local42 * 256.0D);
				@Pc(252) int local252 = (int) (local44 * 256.0D);
				@Pc(257) int local257 = (int) (local46 * 256.0D);
				@Pc(267) int local267 = (local247 << 16) + (local252 << 8) + local257;
				local267 = method934(local267, local7);
				if (local267 == 0) {
					local267 = 1;
				}
				anIntArray196[local11++] = local267;
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "(IIII)V")
	private static void method938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		anInt1304 = arg2 - arg0;
		anInt1306 = arg3 - arg1;
		method933();
		if (anIntArray199.length < anInt1306) {
			anIntArray199 = new int[Static113.method1867(anInt1306)];
		}
		@Pc(23) int local23 = arg1 * Static46.anInt3188 + arg0;
		for (@Pc(25) int local25 = 0; local25 < anInt1306; local25++) {
			anIntArray199[local25] = local23;
			local23 += Static46.anInt3188;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([IIIIII)V")
	private static void method939(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (aBoolean41) {
			if (arg4 > anInt1304) {
				arg4 = anInt1304;
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
		if (anInt1305 == 0) {
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
		} else if (anInt1305 == 254) {
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
			@Pc(121) int local121 = anInt1305;
			@Pc(125) int local125 = 256 - anInt1305;
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

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
	public static void method940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		aBoolean41 = arg0 < 0 || arg0 > anInt1304 || arg1 < 0 || arg1 > anInt1304 || arg2 < 0 || arg2 > anInt1304;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
	public static void method941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18) {
		@Pc(4) int[] local4 = anInterface1_1.method1154(arg18);
		@Pc(11) int local11;
		if (local4 == null) {
			local11 = anInterface1_1.method1153(arg18);
			method942(arg0, arg1, arg2, arg3, arg4, arg5, method928(local11, arg6), method928(local11, arg7), method928(local11, arg8));
			return;
		}
		aBoolean42 = anInterface1_1.method1151(arg18);
		aBoolean44 = anInterface1_1.method1152(arg18);
		local11 = arg4 - arg3;
		@Pc(46) int local46 = arg1 - arg0;
		@Pc(50) int local50 = arg5 - arg3;
		@Pc(54) int local54 = arg2 - arg0;
		@Pc(58) int local58 = arg7 - arg6;
		@Pc(62) int local62 = arg8 - arg6;
		@Pc(64) int local64 = 0;
		if (arg1 != arg0) {
			local64 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(79) int local79 = 0;
		if (arg2 != arg1) {
			local79 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(94) int local94 = 0;
		if (arg2 != arg0) {
			local94 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		@Pc(115) int local115 = local11 * local54 - local50 * local46;
		if (local115 == 0) {
			return;
		}
		@Pc(130) int local130 = (local58 * local54 - local62 * local46 << 9) / local115;
		@Pc(142) int local142 = (local62 * local11 - local58 * local50 << 9) / local115;
		@Pc(146) int local146 = arg9 - arg10;
		@Pc(150) int local150 = arg12 - arg13;
		@Pc(154) int local154 = arg15 - arg16;
		@Pc(158) int local158 = arg11 - arg9;
		@Pc(162) int local162 = arg14 - arg12;
		@Pc(166) int local166 = arg17 - arg15;
		@Pc(176) int local176 = local158 * arg12 - local162 * arg9 << 14;
		@Pc(186) int local186 = local162 * arg15 - local166 * arg12 << 8;
		@Pc(196) int local196 = local166 * arg9 - local158 * arg15 << 5;
		@Pc(206) int local206 = local146 * arg12 - local150 * arg9 << 14;
		@Pc(216) int local216 = local150 * arg15 - local154 * arg12 << 8;
		@Pc(226) int local226 = local154 * arg9 - local146 * arg15 << 5;
		@Pc(236) int local236 = local150 * local158 - local146 * local162 << 14;
		@Pc(246) int local246 = local154 * local162 - local150 * local166 << 8;
		@Pc(256) int local256 = local146 * local166 - local154 * local158 << 5;
		@Pc(335) int local335;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < anInt1306) {
				if (arg1 > anInt1306) {
					arg1 = anInt1306;
				}
				if (arg2 > anInt1306) {
					arg2 = anInt1306;
				}
				arg6 = (arg6 << 9) + local130 - local130 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local94 * arg0;
						arg3 -= local64 * arg0;
						arg6 -= local142 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local79 * arg1;
						arg1 = 0;
					}
					local335 = arg0 - anInt1301;
					local176 += local196 * local335;
					local206 += local226 * local335;
					local236 += local256 * local335;
					if (arg0 != arg1 && local94 < local64 || arg0 == arg1 && local94 > local79) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray199[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method929(Static46.anIntArray385, local4, arg0, arg5 >> 16, arg4 >> 16, arg6, local130, local176, local206, local236, local186, local216, local246);
									arg5 += local94;
									arg4 += local79;
									arg6 += local142;
									arg0 += Static46.anInt3188;
									local176 += local196;
									local206 += local226;
									local236 += local256;
								}
							}
							method929(Static46.anIntArray385, local4, arg0, arg5 >> 16, arg3 >> 16, arg6, local130, local176, local206, local236, local186, local216, local246);
							arg5 += local94;
							arg3 += local64;
							arg6 += local142;
							arg0 += Static46.anInt3188;
							local176 += local196;
							local206 += local226;
							local236 += local256;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray199[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method929(Static46.anIntArray385, local4, arg0, arg4 >> 16, arg5 >> 16, arg6, local130, local176, local206, local236, local186, local216, local246);
									arg5 += local94;
									arg4 += local79;
									arg6 += local142;
									arg0 += Static46.anInt3188;
									local176 += local196;
									local206 += local226;
									local236 += local256;
								}
							}
							method929(Static46.anIntArray385, local4, arg0, arg3 >> 16, arg5 >> 16, arg6, local130, local176, local206, local236, local186, local216, local246);
							arg5 += local94;
							arg3 += local64;
							arg6 += local142;
							arg0 += Static46.anInt3188;
							local176 += local196;
							local206 += local226;
							local236 += local256;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local94 * arg0;
						arg3 -= local64 * arg0;
						arg6 -= local142 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local79 * arg2;
						arg2 = 0;
					}
					local335 = arg0 - anInt1301;
					local176 += local196 * local335;
					local206 += local226 * local335;
					local236 += local256 * local335;
					if ((arg0 == arg2 || local94 >= local64) && (arg0 != arg2 || local79 <= local64)) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray199[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method929(Static46.anIntArray385, local4, arg0, arg3 >> 16, arg5 >> 16, arg6, local130, local176, local206, local236, local186, local216, local246);
									arg5 += local79;
									arg3 += local64;
									arg6 += local142;
									arg0 += Static46.anInt3188;
									local176 += local196;
									local206 += local226;
									local236 += local256;
								}
							}
							method929(Static46.anIntArray385, local4, arg0, arg3 >> 16, arg4 >> 16, arg6, local130, local176, local206, local236, local186, local216, local246);
							arg4 += local94;
							arg3 += local64;
							arg6 += local142;
							arg0 += Static46.anInt3188;
							local176 += local196;
							local206 += local226;
							local236 += local256;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray199[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method929(Static46.anIntArray385, local4, arg0, arg5 >> 16, arg3 >> 16, arg6, local130, local176, local206, local236, local186, local216, local246);
									arg5 += local79;
									arg3 += local64;
									arg6 += local142;
									arg0 += Static46.anInt3188;
									local176 += local196;
									local206 += local226;
									local236 += local256;
								}
							}
							method929(Static46.anIntArray385, local4, arg0, arg4 >> 16, arg3 >> 16, arg6, local130, local176, local206, local236, local186, local216, local246);
							arg4 += local94;
							arg3 += local64;
							arg6 += local142;
							arg0 += Static46.anInt3188;
							local176 += local196;
							local206 += local226;
							local236 += local256;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < anInt1306) {
				if (arg2 > anInt1306) {
					arg2 = anInt1306;
				}
				if (arg0 > anInt1306) {
					arg0 = anInt1306;
				}
				arg7 = (arg7 << 9) + local130 - local130 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local64 * arg1;
						arg4 -= local79 * arg1;
						arg7 -= local142 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local94 * arg2;
						arg2 = 0;
					}
					local335 = arg1 - anInt1301;
					local176 += local196 * local335;
					local206 += local226 * local335;
					local236 += local256 * local335;
					if (arg1 != arg2 && local64 < local79 || arg1 == arg2 && local64 > local94) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray199[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method929(Static46.anIntArray385, local4, arg1, arg3 >> 16, arg5 >> 16, arg7, local130, local176, local206, local236, local186, local216, local246);
									arg3 += local64;
									arg5 += local94;
									arg7 += local142;
									arg1 += Static46.anInt3188;
									local176 += local196;
									local206 += local226;
									local236 += local256;
								}
							}
							method929(Static46.anIntArray385, local4, arg1, arg3 >> 16, arg4 >> 16, arg7, local130, local176, local206, local236, local186, local216, local246);
							arg3 += local64;
							arg4 += local79;
							arg7 += local142;
							arg1 += Static46.anInt3188;
							local176 += local196;
							local206 += local226;
							local236 += local256;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray199[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method929(Static46.anIntArray385, local4, arg1, arg5 >> 16, arg3 >> 16, arg7, local130, local176, local206, local236, local186, local216, local246);
									arg3 += local64;
									arg5 += local94;
									arg7 += local142;
									arg1 += Static46.anInt3188;
									local176 += local196;
									local206 += local226;
									local236 += local256;
								}
							}
							method929(Static46.anIntArray385, local4, arg1, arg4 >> 16, arg3 >> 16, arg7, local130, local176, local206, local236, local186, local216, local246);
							arg3 += local64;
							arg4 += local79;
							arg7 += local142;
							arg1 += Static46.anInt3188;
							local176 += local196;
							local206 += local226;
							local236 += local256;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local64 * arg1;
						arg4 -= local79 * arg1;
						arg7 -= local142 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local94 * arg0;
						arg0 = 0;
					}
					local335 = arg1 - anInt1301;
					local176 += local196 * local335;
					local206 += local226 * local335;
					local236 += local256 * local335;
					if (local64 < local79) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray199[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method929(Static46.anIntArray385, local4, arg1, arg3 >> 16, arg4 >> 16, arg7, local130, local176, local206, local236, local186, local216, local246);
									arg3 += local94;
									arg4 += local79;
									arg7 += local142;
									arg1 += Static46.anInt3188;
									local176 += local196;
									local206 += local226;
									local236 += local256;
								}
							}
							method929(Static46.anIntArray385, local4, arg1, arg5 >> 16, arg4 >> 16, arg7, local130, local176, local206, local236, local186, local216, local246);
							arg5 += local64;
							arg4 += local79;
							arg7 += local142;
							arg1 += Static46.anInt3188;
							local176 += local196;
							local206 += local226;
							local236 += local256;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray199[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method929(Static46.anIntArray385, local4, arg1, arg4 >> 16, arg3 >> 16, arg7, local130, local176, local206, local236, local186, local216, local246);
									arg3 += local94;
									arg4 += local79;
									arg7 += local142;
									arg1 += Static46.anInt3188;
									local176 += local196;
									local206 += local226;
									local236 += local256;
								}
							}
							method929(Static46.anIntArray385, local4, arg1, arg4 >> 16, arg5 >> 16, arg7, local130, local176, local206, local236, local186, local216, local246);
							arg5 += local64;
							arg4 += local79;
							arg7 += local142;
							arg1 += Static46.anInt3188;
							local176 += local196;
							local206 += local226;
							local236 += local256;
						}
					}
				}
			}
		} else if (arg2 < anInt1306) {
			if (arg0 > anInt1306) {
				arg0 = anInt1306;
			}
			if (arg1 > anInt1306) {
				arg1 = anInt1306;
			}
			arg8 = (arg8 << 9) + local130 - local130 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local79 * arg2;
					arg5 -= local94 * arg2;
					arg8 -= local142 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local64 * arg0;
					arg0 = 0;
				}
				local335 = arg2 - anInt1301;
				local176 += local196 * local335;
				local206 += local226 * local335;
				local236 += local256 * local335;
				if (local79 < local94) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray199[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method929(Static46.anIntArray385, local4, arg2, arg4 >> 16, arg3 >> 16, arg8, local130, local176, local206, local236, local186, local216, local246);
								arg4 += local79;
								arg3 += local64;
								arg8 += local142;
								arg2 += Static46.anInt3188;
								local176 += local196;
								local206 += local226;
								local236 += local256;
							}
						}
						method929(Static46.anIntArray385, local4, arg2, arg4 >> 16, arg5 >> 16, arg8, local130, local176, local206, local236, local186, local216, local246);
						arg4 += local79;
						arg5 += local94;
						arg8 += local142;
						arg2 += Static46.anInt3188;
						local176 += local196;
						local206 += local226;
						local236 += local256;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray199[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method929(Static46.anIntArray385, local4, arg2, arg3 >> 16, arg4 >> 16, arg8, local130, local176, local206, local236, local186, local216, local246);
								arg4 += local79;
								arg3 += local64;
								arg8 += local142;
								arg2 += Static46.anInt3188;
								local176 += local196;
								local206 += local226;
								local236 += local256;
							}
						}
						method929(Static46.anIntArray385, local4, arg2, arg5 >> 16, arg4 >> 16, arg8, local130, local176, local206, local236, local186, local216, local246);
						arg4 += local79;
						arg5 += local94;
						arg8 += local142;
						arg2 += Static46.anInt3188;
						local176 += local196;
						local206 += local226;
						local236 += local256;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local79 * arg2;
					arg5 -= local94 * arg2;
					arg8 -= local142 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local64 * arg1;
					arg1 = 0;
				}
				local335 = arg2 - anInt1301;
				local176 += local196 * local335;
				local206 += local226 * local335;
				local236 += local256 * local335;
				if (local79 < local94) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray199[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method929(Static46.anIntArray385, local4, arg2, arg4 >> 16, arg5 >> 16, arg8, local130, local176, local206, local236, local186, local216, local246);
								arg4 += local64;
								arg5 += local94;
								arg8 += local142;
								arg2 += Static46.anInt3188;
								local176 += local196;
								local206 += local226;
								local236 += local256;
							}
						}
						method929(Static46.anIntArray385, local4, arg2, arg3 >> 16, arg5 >> 16, arg8, local130, local176, local206, local236, local186, local216, local246);
						arg3 += local79;
						arg5 += local94;
						arg8 += local142;
						arg2 += Static46.anInt3188;
						local176 += local196;
						local206 += local226;
						local236 += local256;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray199[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method929(Static46.anIntArray385, local4, arg2, arg5 >> 16, arg4 >> 16, arg8, local130, local176, local206, local236, local186, local216, local246);
								arg4 += local64;
								arg5 += local94;
								arg8 += local142;
								arg2 += Static46.anInt3188;
								local176 += local196;
								local206 += local226;
								local236 += local256;
							}
						}
						method929(Static46.anIntArray385, local4, arg2, arg5 >> 16, arg3 >> 16, arg8, local130, local176, local206, local236, local186, local216, local246);
						arg3 += local79;
						arg5 += local94;
						arg8 += local142;
						arg2 += Static46.anInt3188;
						local176 += local196;
						local206 += local226;
						local236 += local256;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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
			if (arg0 < anInt1306) {
				if (arg1 > anInt1306) {
					arg1 = anInt1306;
				}
				if (arg2 > anInt1306) {
					arg2 = anInt1306;
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
						arg0 = anIntArray199[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method927(Static46.anIntArray385, arg0, arg5 >> 16, arg4 >> 16, arg6, local86);
									arg5 += local60;
									arg4 += local36;
									arg6 += local98;
									arg0 += Static46.anInt3188;
								}
							}
							method927(Static46.anIntArray385, arg0, arg5 >> 16, arg3 >> 16, arg6, local86);
							arg5 += local60;
							arg3 += local48;
							arg6 += local98;
							arg0 += Static46.anInt3188;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray199[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method927(Static46.anIntArray385, arg0, arg4 >> 16, arg5 >> 16, arg6, local86);
									arg5 += local60;
									arg4 += local36;
									arg6 += local98;
									arg0 += Static46.anInt3188;
								}
							}
							method927(Static46.anIntArray385, arg0, arg3 >> 16, arg5 >> 16, arg6, local86);
							arg5 += local60;
							arg3 += local48;
							arg6 += local98;
							arg0 += Static46.anInt3188;
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
						arg0 = anIntArray199[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method927(Static46.anIntArray385, arg0, arg5 >> 16, arg3 >> 16, arg6, local86);
									arg5 += local36;
									arg3 += local48;
									arg6 += local98;
									arg0 += Static46.anInt3188;
								}
							}
							method927(Static46.anIntArray385, arg0, arg4 >> 16, arg3 >> 16, arg6, local86);
							arg4 += local60;
							arg3 += local48;
							arg6 += local98;
							arg0 += Static46.anInt3188;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray199[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method927(Static46.anIntArray385, arg0, arg3 >> 16, arg5 >> 16, arg6, local86);
									arg5 += local36;
									arg3 += local48;
									arg6 += local98;
									arg0 += Static46.anInt3188;
								}
							}
							method927(Static46.anIntArray385, arg0, arg3 >> 16, arg4 >> 16, arg6, local86);
							arg4 += local60;
							arg3 += local48;
							arg6 += local98;
							arg0 += Static46.anInt3188;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < anInt1306) {
				if (arg2 > anInt1306) {
					arg2 = anInt1306;
				}
				if (arg0 > anInt1306) {
					arg0 = anInt1306;
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
						arg1 = anIntArray199[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method927(Static46.anIntArray385, arg1, arg5 >> 16, arg3 >> 16, arg7, local86);
									arg3 += local48;
									arg5 += local60;
									arg7 += local98;
									arg1 += Static46.anInt3188;
								}
							}
							method927(Static46.anIntArray385, arg1, arg4 >> 16, arg3 >> 16, arg7, local86);
							arg3 += local48;
							arg4 += local36;
							arg7 += local98;
							arg1 += Static46.anInt3188;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray199[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method927(Static46.anIntArray385, arg1, arg3 >> 16, arg5 >> 16, arg7, local86);
									arg3 += local48;
									arg5 += local60;
									arg7 += local98;
									arg1 += Static46.anInt3188;
								}
							}
							method927(Static46.anIntArray385, arg1, arg3 >> 16, arg4 >> 16, arg7, local86);
							arg3 += local48;
							arg4 += local36;
							arg7 += local98;
							arg1 += Static46.anInt3188;
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
						arg1 = anIntArray199[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method927(Static46.anIntArray385, arg1, arg3 >> 16, arg4 >> 16, arg7, local86);
									arg3 += local60;
									arg4 += local36;
									arg7 += local98;
									arg1 += Static46.anInt3188;
								}
							}
							method927(Static46.anIntArray385, arg1, arg5 >> 16, arg4 >> 16, arg7, local86);
							arg5 += local48;
							arg4 += local36;
							arg7 += local98;
							arg1 += Static46.anInt3188;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray199[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method927(Static46.anIntArray385, arg1, arg4 >> 16, arg3 >> 16, arg7, local86);
									arg3 += local60;
									arg4 += local36;
									arg7 += local98;
									arg1 += Static46.anInt3188;
								}
							}
							method927(Static46.anIntArray385, arg1, arg4 >> 16, arg5 >> 16, arg7, local86);
							arg5 += local48;
							arg4 += local36;
							arg7 += local98;
							arg1 += Static46.anInt3188;
						}
					}
				}
			}
		} else if (arg2 < anInt1306) {
			if (arg0 > anInt1306) {
				arg0 = anInt1306;
			}
			if (arg1 > anInt1306) {
				arg1 = anInt1306;
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
					arg2 = anIntArray199[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method927(Static46.anIntArray385, arg2, arg4 >> 16, arg3 >> 16, arg8, local86);
								arg4 += local36;
								arg3 += local48;
								arg8 += local98;
								arg2 += Static46.anInt3188;
							}
						}
						method927(Static46.anIntArray385, arg2, arg4 >> 16, arg5 >> 16, arg8, local86);
						arg4 += local36;
						arg5 += local60;
						arg8 += local98;
						arg2 += Static46.anInt3188;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray199[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method927(Static46.anIntArray385, arg2, arg3 >> 16, arg4 >> 16, arg8, local86);
								arg4 += local36;
								arg3 += local48;
								arg8 += local98;
								arg2 += Static46.anInt3188;
							}
						}
						method927(Static46.anIntArray385, arg2, arg5 >> 16, arg4 >> 16, arg8, local86);
						arg4 += local36;
						arg5 += local60;
						arg8 += local98;
						arg2 += Static46.anInt3188;
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
					arg2 = anIntArray199[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method927(Static46.anIntArray385, arg2, arg4 >> 16, arg5 >> 16, arg8, local86);
								arg4 += local48;
								arg5 += local60;
								arg8 += local98;
								arg2 += Static46.anInt3188;
							}
						}
						method927(Static46.anIntArray385, arg2, arg3 >> 16, arg5 >> 16, arg8, local86);
						arg3 += local36;
						arg5 += local60;
						arg8 += local98;
						arg2 += Static46.anInt3188;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray199[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method927(Static46.anIntArray385, arg2, arg5 >> 16, arg4 >> 16, arg8, local86);
								arg4 += local48;
								arg5 += local60;
								arg8 += local98;
								arg2 += Static46.anInt3188;
							}
						}
						method927(Static46.anIntArray385, arg2, arg5 >> 16, arg3 >> 16, arg8, local86);
						arg3 += local36;
						arg5 += local60;
						arg8 += local98;
						arg2 += Static46.anInt3188;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "()V")
	public static void method943() {
		anIntArray199 = null;
		anIntArray196 = null;
		anInterface1_1 = null;
		Class5_Sub2_Sub1_Sub2.anIntArray200 = null;
		Class5_Sub2_Sub1_Sub2.anIntArray195 = null;
		Class5_Sub2_Sub1_Sub2.anIntArray198 = null;
		Class5_Sub2_Sub1_Sub2.anIntArray197 = null;
	}
}
