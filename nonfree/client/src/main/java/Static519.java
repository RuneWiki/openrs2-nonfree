import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!um", name = "k", descriptor = "I")
	public static int anInt8950;

	@OriginalMember(owner = "client!um", name = "d", descriptor = "[I")
	public static final int[] anIntArray669 = new int[250];

	@OriginalMember(owner = "client!um", name = "h", descriptor = "Lclient!bc;")
	public static final Class24 aClass24_4 = new Class24(0);

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(BII)Z")
	public static boolean method7319(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "()V")
	public static void method7320() {
		Static123.anInt2132 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static342.anInt9106; local3++) {
			@Pc(8) Class268 local8 = Static175.aClass268Array2[local3];
			@Pc(12) int local12;
			if (Static237.anIntArray424 != null) {
				for (local12 = 0; local12 < Static237.anIntArray424.length; local12++) {
					if (Static237.anIntArray424[local12] != -1000000 && (local8.anInt7561 <= Static237.anIntArray424[local12] || local8.anInt7565 <= Static237.anIntArray424[local12]) && (local8.anInt7557 <= Static194.anIntArray388[local12] || local8.anInt7571 <= Static194.anIntArray388[local12]) && (local8.anInt7557 >= Static287.anIntArray731[local12] || local8.anInt7571 >= Static287.anIntArray731[local12]) && (local8.anInt7556 <= Static512.anIntArray664[local12] || local8.anInt7555 <= Static512.anIntArray664[local12]) && (local8.anInt7556 >= Static409.anIntArray254[local12] || local8.anInt7555 >= Static409.anIntArray254[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt7566 == 1) {
				local12 = local8.anInt7567 + Static387.anInt6907 - Static325.anInt5850;
				if (local12 >= 0 && local12 <= Static387.anInt6907 + Static387.anInt6907) {
					local110 = local8.anInt7559 + Static387.anInt6907 - Static486.anInt8128;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static387.anInt6907 + Static387.anInt6907) {
						continue;
					}
					local128 = local8.anInt7560 + Static387.anInt6907 - Static486.anInt8128;
					if (local128 > Static387.anInt6907 + Static387.anInt6907) {
						local128 = Static387.anInt6907 + Static387.anInt6907;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static6.aBooleanArrayArray3[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static135.anInt2375 - local8.anInt7557;
						if (local164 > Static350.anInt6168) {
							local8.anInt7572 = 1;
						} else {
							if (local164 >= -Static350.anInt6168) {
								continue;
							}
							local8.anInt7572 = 2;
							local164 = -local164;
						}
						local8.anInt7569 = (local8.anInt7556 - Static163.anInt2862 << 8) / local164;
						local8.anInt7563 = (local8.anInt7555 - Static163.anInt2862 << 8) / local164;
						local8.anInt7553 = (local8.anInt7561 - Static382.anInt6590 << 8) / local164;
						local8.anInt7568 = (local8.anInt7565 - Static382.anInt6590 << 8) / local164;
						Static52.aClass268Array1[Static123.anInt2132++] = local8;
					}
				}
			} else if (local8.anInt7566 == 2) {
				local12 = local8.anInt7559 + Static387.anInt6907 - Static486.anInt8128;
				if (local12 >= 0 && local12 <= Static387.anInt6907 + Static387.anInt6907) {
					local110 = local8.anInt7567 + Static387.anInt6907 - Static325.anInt5850;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static387.anInt6907 + Static387.anInt6907) {
						continue;
					}
					local128 = local8.anInt7552 + Static387.anInt6907 - Static325.anInt5850;
					if (local128 > Static387.anInt6907 + Static387.anInt6907) {
						local128 = Static387.anInt6907 + Static387.anInt6907;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static6.aBooleanArrayArray3[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static163.anInt2862 - local8.anInt7556;
						if (local164 > Static350.anInt6168) {
							local8.anInt7572 = 3;
						} else {
							if (local164 >= -Static350.anInt6168) {
								continue;
							}
							local8.anInt7572 = 4;
							local164 = -local164;
						}
						local8.anInt7570 = (local8.anInt7557 - Static135.anInt2375 << 8) / local164;
						local8.anInt7558 = (local8.anInt7571 - Static135.anInt2375 << 8) / local164;
						local8.anInt7553 = (local8.anInt7561 - Static382.anInt6590 << 8) / local164;
						local8.anInt7568 = (local8.anInt7565 - Static382.anInt6590 << 8) / local164;
						Static52.aClass268Array1[Static123.anInt2132++] = local8;
					}
				}
			} else if (local8.anInt7566 == 4) {
				local12 = local8.anInt7561 - Static382.anInt6590;
				if (local12 > Static291.anInt4747) {
					local110 = local8.anInt7559 + Static387.anInt6907 - Static486.anInt8128;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static387.anInt6907 + Static387.anInt6907) {
						continue;
					}
					local128 = local8.anInt7560 + Static387.anInt6907 - Static486.anInt8128;
					if (local128 > Static387.anInt6907 + Static387.anInt6907) {
						local128 = Static387.anInt6907 + Static387.anInt6907;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt7567 + Static387.anInt6907 - Static325.anInt5850;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static387.anInt6907 + Static387.anInt6907) {
						continue;
					}
					local164 = local8.anInt7552 + Static387.anInt6907 - Static325.anInt5850;
					if (local164 > Static387.anInt6907 + Static387.anInt6907) {
						local164 = Static387.anInt6907 + Static387.anInt6907;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static6.aBooleanArrayArray3[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt7572 = 5;
						local8.anInt7570 = (local8.anInt7557 - Static135.anInt2375 << 8) / local12;
						local8.anInt7558 = (local8.anInt7571 - Static135.anInt2375 << 8) / local12;
						local8.anInt7569 = (local8.anInt7556 - Static163.anInt2862 << 8) / local12;
						local8.anInt7563 = (local8.anInt7555 - Static163.anInt2862 << 8) / local12;
						Static52.aClass268Array1[Static123.anInt2132++] = local8;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZIIIBI)V")
	public static void method7323(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 < 1) {
			arg4 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(27) int local27 = arg4 - 334;
		if (local27 < 0) {
			local27 = 0;
		} else if (local27 > 100) {
			local27 = 100;
		}
		@Pc(53) int local53 = Static335.aShort87 + local27 * (Static372.aShort75 - Static335.aShort87) / 100;
		if (Static383.aShort94 > local53) {
			local53 = Static383.aShort94;
		} else if (Static487.aShort110 < local53) {
			local53 = Static487.aShort110;
		}
		@Pc(79) int local79 = arg4 * local53 * 512 / (arg3 * 334);
		@Pc(120) int local120;
		@Pc(127) int local127;
		@Pc(95) short local95;
		if (Static521.aShort120 > local79) {
			local95 = Static521.aShort120;
			local53 = local95 * arg3 * 334 / (arg4 * 512);
			if (local53 > Static487.aShort110) {
				local53 = Static487.aShort110;
				local120 = local53 * 512 * arg4 / (local95 * 334);
				local127 = (arg3 - local120) / 2;
				if (arg0) {
					Static176.aClass121_5.F();
					Static176.aClass121_5.method7109(arg2, local127, arg4, arg1, -16777216);
					Static176.aClass121_5.method7109(arg2, local127, arg4, arg1 + arg3 - local127, -16777216);
				}
				arg1 += local127;
				arg3 -= local127 * 2;
			}
		} else if (Static264.aShort74 < local79) {
			local95 = Static264.aShort74;
			local53 = arg3 * local95 * 334 / (arg4 * 512);
			if (Static383.aShort94 > local53) {
				local53 = Static383.aShort94;
				local120 = arg3 * local95 * 334 / (local53 * 512);
				local127 = (arg4 - local120) / 2;
				if (arg0) {
					Static176.aClass121_5.F();
					Static176.aClass121_5.method7109(arg2, arg3, local127, arg1, -16777216);
					Static176.aClass121_5.method7109(arg4 + arg2 - local127, arg3, local127, arg1, -16777216);
				}
				arg4 -= local127 * 2;
				arg2 += local127;
			}
		}
		Static26.anInt486 = (short) arg3;
		Static121.anInt2101 = arg2;
		Static415.anInt7332 = arg4 * local53 / 334;
		Static63.anInt1005 = (short) arg4;
		Static411.anInt7202 = arg1;
	}
}
