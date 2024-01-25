import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!ed", name = "O", descriptor = "Lclient!tb;")
	public static Class189 aClass189_3;

	@OriginalMember(owner = "client!ed", name = "C", descriptor = "[I")
	public static final int[] anIntArray120 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ed", name = "K", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_33 = new Class140("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!ed", name = "M", descriptor = "Lclient!vo;")
	public static final Class2_Sub43 aClass2_Sub43_1 = new Class2_Sub43(0, -1);

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIII)V")
	public static void method1480(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = arg2; local3 < arg2 + arg0; local3++) {
			for (local7 = arg1; local7 < arg4 + arg1; local7++) {
				if (local7 >= 0 && local7 < Static66.anInt1177 && local3 >= 0 && Static12.anInt213 > local3) {
					Static327.anIntArrayArrayArray12[arg3][local7][local3] = arg3 > 0 ? Static327.anIntArrayArrayArray12[arg3 - 1][local7][local3] - 240 : 0;
				}
			}
		}
		if (arg1 > 0 && arg1 < Static66.anInt1177) {
			for (local7 = arg2 + 1; local7 < arg0 + arg2; local7++) {
				if (local7 >= 0 && Static12.anInt213 > local7) {
					Static327.anIntArrayArrayArray12[arg3][arg1][local7] = Static327.anIntArrayArrayArray12[arg3][arg1 - 1][local7];
				}
			}
		}
		if (arg2 > 0 && arg2 < Static12.anInt213) {
			for (local7 = arg1 + 1; local7 < arg4 + arg1; local7++) {
				if (local7 >= 0 && Static66.anInt1177 > local7) {
					Static327.anIntArrayArrayArray12[arg3][local7][arg2] = Static327.anIntArrayArrayArray12[arg3][local7][arg2 - 1];
				}
			}
		}
		if (arg1 < 0 || arg2 < 0 || arg1 >= Static66.anInt1177 || Static12.anInt213 <= arg2) {
			return;
		}
		if (arg3 != 0) {
			if (arg1 > 0 && Static327.anIntArrayArrayArray12[arg3 - 1][arg1 - 1][arg2] != Static327.anIntArrayArrayArray12[arg3][arg1 - 1][arg2]) {
				Static327.anIntArrayArrayArray12[arg3][arg1][arg2] = Static327.anIntArrayArrayArray12[arg3][arg1 - 1][arg2];
				return;
			}
			if (arg2 > 0 && Static327.anIntArrayArrayArray12[arg3][arg1][arg2 - 1] != Static327.anIntArrayArrayArray12[arg3 - 1][arg1][arg2 - 1]) {
				Static327.anIntArrayArrayArray12[arg3][arg1][arg2] = Static327.anIntArrayArrayArray12[arg3][arg1][arg2 - 1];
				return;
			}
			if (arg1 > 0 && arg2 > 0 && Static327.anIntArrayArrayArray12[arg3][arg1 - 1][arg2 - 1] != Static327.anIntArrayArrayArray12[arg3 - 1][arg1 - 1][arg2 - 1]) {
				Static327.anIntArrayArrayArray12[arg3][arg1][arg2] = Static327.anIntArrayArrayArray12[arg3][arg1 - 1][arg2 - 1];
				return;
			}
			return;
		}
		if (arg1 > 0 && Static327.anIntArrayArrayArray12[arg3][arg1 - 1][arg2] != 0) {
			Static327.anIntArrayArrayArray12[arg3][arg1][arg2] = Static327.anIntArrayArrayArray12[arg3][arg1 - 1][arg2];
			return;
		}
		if (arg2 > 0 && Static327.anIntArrayArrayArray12[arg3][arg1][arg2 - 1] != 0) {
			Static327.anIntArrayArrayArray12[arg3][arg1][arg2] = Static327.anIntArrayArrayArray12[arg3][arg1][arg2 - 1];
			return;
		}
		if (arg1 > 0 && arg2 > 0 && Static327.anIntArrayArrayArray12[arg3][arg1 - 1][arg2 - 1] != 0) {
			Static327.anIntArrayArrayArray12[arg3][arg1][arg2] = Static327.anIntArrayArrayArray12[arg3][arg1 - 1][arg2 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)Lclient!kp;")
	public static Class1_Sub3 method1481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class51 local7 = Static196.aClass51ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass1_Sub3_1;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!jk;BI)V")
	public static void method1483(@OriginalArg(0) Class2_Sub12_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(22) boolean local22 = arg0.method3172(1) == 1;
		if (local22) {
			Static24.anIntArray71[Static248.anInt5203++] = arg1;
		}
		@Pc(37) int local37 = arg0.method3172(2);
		@Pc(41) Class1_Sub2_Sub3_Sub1 local41 = Static164.aClass1_Sub2_Sub3_Sub1Array1[arg1];
		if (local37 != 0) {
			@Pc(145) int local145;
			@Pc(150) int local150;
			@Pc(155) int local155;
			if (local37 == 1) {
				local145 = arg0.method3172(3);
				local150 = local41.anIntArray535[0];
				local155 = local41.anIntArray534[0];
				if (local145 == 0) {
					local155--;
					local150--;
				} else if (local145 == 1) {
					local155--;
				} else if (local145 == 2) {
					local150++;
					local155--;
				} else if (local145 == 3) {
					local150--;
				} else if (local145 == 4) {
					local150++;
				} else if (local145 == 5) {
					local155++;
					local150--;
				} else if (local145 == 6) {
					local155++;
				} else if (local145 == 7) {
					local150++;
					local155++;
				}
				if (local22) {
					local41.anInt3399 = local155;
					local41.anInt3394 = local150;
				} else {
					local41.anInt3394 = -1;
					local41.method2971(Static28.aByteArray5[arg1], local155, local150);
				}
			} else if (local37 == 2) {
				local145 = arg0.method3172(4);
				local150 = local41.anIntArray535[0];
				local155 = local41.anIntArray534[0];
				if (local145 == 0) {
					local155 -= 2;
					local150 -= 2;
				} else if (local145 == 1) {
					local150--;
					local155 -= 2;
				} else if (local145 == 2) {
					local155 -= 2;
				} else if (local145 == 3) {
					local150++;
					local155 -= 2;
				} else if (local145 == 4) {
					local155 -= 2;
					local150 += 2;
				} else if (local145 == 5) {
					local150 -= 2;
					local155--;
				} else if (local145 == 6) {
					local150 += 2;
					local155--;
				} else if (local145 == 7) {
					local150 -= 2;
				} else if (local145 == 8) {
					local150 += 2;
				} else if (local145 == 9) {
					local150 -= 2;
					local155++;
				} else if (local145 == 10) {
					local155++;
					local150 += 2;
				} else if (local145 == 11) {
					local155 += 2;
					local150 -= 2;
				} else if (local145 == 12) {
					local150--;
					local155 += 2;
				} else if (local145 == 13) {
					local155 += 2;
				} else if (local145 == 14) {
					local155 += 2;
					local150++;
				} else if (local145 == 15) {
					local150 += 2;
					local155 += 2;
				}
				if (local22) {
					local41.anInt3394 = local150;
					local41.anInt3399 = local155;
				} else {
					local41.anInt3394 = -1;
					local41.method2971(Static28.aByteArray5[arg1], local155, local150);
				}
			} else {
				local145 = arg0.method3172(1);
				@Pc(417) int local417;
				@Pc(427) int local427;
				@Pc(441) int local441;
				@Pc(448) int local448;
				if (local145 == 0) {
					local150 = arg0.method3172(12);
					local155 = local150 >> 10;
					local417 = local150 >> 5 & 0x1F;
					if (local417 > 15) {
						local417 -= 32;
					}
					local427 = local150 & 0x1F;
					if (local427 > 15) {
						local427 -= 32;
					}
					local441 = local41.anIntArray535[0] + local417;
					local448 = local427 + local41.anIntArray534[0];
					if (local22) {
						local41.anInt3399 = local448;
						local41.anInt3394 = local441;
					} else {
						local41.anInt3394 = -1;
						local41.method2971(Static28.aByteArray5[arg1], local448, local441);
					}
					local41.aByte77 = (byte) (local41.aByte77 + local155 & 0x3);
					if (Static217.anInt4819 == arg1) {
						Static291.anInt5263 = local41.aByte77;
					}
				} else {
					local150 = arg0.method3172(30);
					local155 = local150 >> 28;
					local417 = local150 >> 14 & 0x3FFF;
					local427 = local150 & 0x3FFF;
					local441 = (Static150.anInt3453 + local41.anIntArray535[0] + local417 & 0x3FFF) - Static150.anInt3453;
					local448 = (local427 + local41.anIntArray534[0] + Static287.anInt5776 & 0x3FFF) - Static287.anInt5776;
					if (local22) {
						local41.anInt3394 = local441;
						local41.anInt3399 = local448;
					} else {
						local41.anInt3394 = -1;
						local41.method2971(Static28.aByteArray5[arg1], local448, local441);
					}
					local41.aByte77 = (byte) (local41.aByte77 + local155 & 0x3);
					if (arg1 == Static217.anInt4819) {
						Static291.anInt5263 = local41.aByte77;
					}
				}
			}
		} else if (local22) {
			local41.anInt3394 = -1;
		} else if (Static217.anInt4819 == arg1) {
			throw new RuntimeException("s:lr");
		} else {
			Static120.anIntArray4[arg1] = (Static287.anInt5776 + local41.anIntArray534[0] >> 6) + (Static150.anInt3453 + local41.anIntArray535[0] >> 6 << 14) + (local41.aByte77 << 28);
			if (local41.anInt3402 == -1) {
				Static251.anIntArray407[arg1] = local41.aClass219_7.method5719();
			} else {
				Static251.anIntArray407[arg1] = local41.anInt3402;
			}
			Static151.anIntArray270[arg1] = local41.anInt6916;
			if (local41.anInt3414 > 0) {
				Static40.method504(local41);
			}
			Static164.aClass1_Sub2_Sub3_Sub1Array1[arg1] = null;
			if (arg0.method3172(1) != 0) {
				Static356.method5686(arg1, arg0);
			}
		}
	}
}
