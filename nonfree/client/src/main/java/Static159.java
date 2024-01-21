import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!rg", name = "t", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas36;

	@OriginalMember(owner = "client!rg", name = "z", descriptor = "Lclient!ph;")
	public static Class66 aClass66_41;

	@OriginalMember(owner = "client!rg", name = "C", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray41;

	@OriginalMember(owner = "client!rg", name = "o", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1228 = Static158.method3034("M");

	@OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
	public static int anInt4431 = 0;

	@OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
	public static int anInt4432 = 0;

	@OriginalMember(owner = "client!rg", name = "B", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1229 = Static158.method3034("welle2:");

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)V")
	public static void method3414() {
		@Pc(5) Object local5 = Static111.anObject4;
		synchronized (Static111.anObject4) {
			if (Static141.anInt3696 == 0) {
				Static65.aClass81_1.method3153(5, new Class70());
			}
			Static141.anInt3696 = 600;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIII)I")
	public static int method3416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 > 243) {
			arg1 >>= 0x4;
		} else if (arg0 > 217) {
			arg1 >>= 0x3;
		} else if (arg0 > 192) {
			arg1 >>= 0x2;
		} else if (arg0 > 179) {
			arg1 >>= 0x1;
		}
		return (arg0 >> 1) + (arg1 >> 5 << 7) + (arg2 >> 2 << 10);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIBII)V")
	public static void method3417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static165.method3105(arg2);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg2 - arg4;
		@Pc(17) int local17 = arg2;
		@Pc(20) int local20 = -arg2;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(26) int local26 = local15;
		@Pc(28) int local28 = -1;
		@Pc(31) int local31 = -local15;
		@Pc(33) int local33 = -1;
		@Pc(37) int[] local37 = Static42.anIntArrayArray8[arg1];
		@Pc(50) int local50 = arg0 - local15;
		@Pc(54) int local54 = local15 + arg0;
		Static163.method3070(local50, arg0 - arg2, arg5, local37);
		Static163.method3070(local54, local50, arg3, local37);
		Static163.method3070(arg2 + arg0, local54, arg5, local37);
		while (local17 > local10) {
			local33 += 2;
			local31 += local33;
			if (local31 >= 0 && local26 >= 1) {
				Static185.anIntArray482[local26] = local10;
				local26--;
				local31 -= local26 << 1;
			}
			local10++;
			local28 += 2;
			local20 += local28;
			@Pc(120) int[] local120;
			@Pc(127) int[] local127;
			@Pc(136) int local136;
			@Pc(132) int local132;
			@Pc(141) int local141;
			@Pc(150) int local150;
			@Pc(146) int local146;
			if (local20 >= 0) {
				local17--;
				if (local15 > local17) {
					local120 = Static42.anIntArrayArray8[local17 + arg1];
					local127 = Static42.anIntArrayArray8[arg1 - local17];
					local132 = arg0 + local10;
					local136 = Static185.anIntArray482[local17];
					local141 = arg0 - local10;
					local146 = arg0 - local136;
					local150 = local136 + arg0;
					Static163.method3070(local146, local141, arg5, local120);
					Static163.method3070(local150, local146, arg3, local120);
					Static163.method3070(local132, local150, arg5, local120);
					Static163.method3070(local146, local141, arg5, local127);
					Static163.method3070(local150, local146, arg3, local127);
					Static163.method3070(local132, local150, arg5, local127);
				} else {
					local120 = Static42.anIntArrayArray8[arg1 + local17];
					local136 = arg0 + local10;
					local127 = Static42.anIntArrayArray8[arg1 - local17];
					local132 = arg0 - local10;
					Static163.method3070(local136, local132, arg5, local120);
					Static163.method3070(local136, local132, arg5, local127);
				}
				local20 -= local17 << 1;
			}
			local120 = Static42.anIntArrayArray8[arg1 + local10];
			local132 = arg0 - local17;
			local127 = Static42.anIntArrayArray8[arg1 - local10];
			local136 = local17 + arg0;
			if (local10 >= local15) {
				Static163.method3070(local136, local132, arg5, local120);
				Static163.method3070(local136, local132, arg5, local127);
			} else {
				local141 = local10 <= local26 ? local26 : Static185.anIntArray482[local10];
				local150 = local141 + arg0;
				local146 = arg0 - local141;
				Static163.method3070(local146, local132, arg5, local120);
				Static163.method3070(local150, local146, arg3, local120);
				Static163.method3070(local136, local150, arg5, local120);
				Static163.method3070(local146, local132, arg5, local127);
				Static163.method3070(local150, local146, arg3, local127);
				Static163.method3070(local136, local150, arg5, local127);
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIBII)V")
	public static void method3418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = arg3;
		@Pc(15) int local15 = -1;
		@Pc(23) int local23 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg1 + arg3);
		@Pc(32) int local32 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg1 - arg3);
		@Pc(35) int local35 = -arg3;
		Static163.method3070(local23, local32, arg0, Static42.anIntArrayArray8[arg2]);
		while (local13 > local11) {
			local15 += 2;
			local35 += local15;
			@Pc(64) int local64;
			@Pc(68) int local68;
			@Pc(87) int local87;
			@Pc(95) int local95;
			if (local35 > 0) {
				local13--;
				local35 -= local13 << 1;
				local64 = arg2 - local13;
				local68 = arg2 + local13;
				if (local68 >= Static36.anInt1076 && local64 <= Static117.anInt951) {
					local87 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg1 + local11);
					local95 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg1 - local11);
					if (local68 <= Static117.anInt951) {
						Static163.method3070(local87, local95, arg0, Static42.anIntArrayArray8[local68]);
					}
					if (Static36.anInt1076 <= local64) {
						Static163.method3070(local87, local95, arg0, Static42.anIntArrayArray8[local64]);
					}
				}
			}
			local11++;
			local68 = arg2 + local11;
			local64 = arg2 - local11;
			if (Static36.anInt1076 <= local68 && Static117.anInt951 >= local64) {
				local87 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, local13 + arg1);
				local95 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg1 - local13);
				if (Static117.anInt951 >= local68) {
					Static163.method3070(local87, local95, arg0, Static42.anIntArrayArray8[local68]);
				}
				if (local64 >= Static36.anInt1076) {
					Static163.method3070(local87, local95, arg0, Static42.anIntArrayArray8[local64]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIILclient!dg;I)V")
	public static void method3420(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub1_Sub1_Sub3_Sub1 arg2, @OriginalArg(4) int arg3) {
		if (Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1 == arg2 || Static169.anInt4148 >= 400) {
			return;
		}
		@Pc(56) Class60 local56;
		if (arg2.anInt1276 == 0) {
			local56 = Static193.method3536(new Class60[] { arg2.aClass60_288, Static149.method2963(Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt1283, arg2.anInt1283), Static181.aClass60_1216, Static18.aClass60_1219, Static72.method1661(arg2.anInt1283), Static90.aClass60_720 });
		} else {
			local56 = Static193.method3536(new Class60[] { arg2.aClass60_288, Static181.aClass60_1216, Static116.aClass60_910, Static72.method1661(arg2.anInt1276), Static90.aClass60_720 });
		}
		@Pc(133) int local133;
		if (Static29.anInt889 == 1) {
			Static61.method1423(Static193.method3536(new Class60[] { Static162.aClass60_1102, Static164.aClass60_1118, local56 }), Static56.aClass60_405, (short) 41, (long) arg3, arg1, arg0);
		} else if (!Static58.aBoolean74) {
			for (local133 = 7; local133 >= 0; local133--) {
				if (Static63.aClass60Array12[local133] != null) {
					@Pc(145) short local145 = 0;
					if (Static143.anInt3755 == 0 && Static63.aClass60Array12[local133].method2698(Static29.aClass60_210)) {
						if (arg2.anInt1283 > Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt1283) {
							local145 = 2000;
						}
						if (Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt1289 != 0 && arg2.anInt1289 != 0) {
							if (arg2.anInt1289 == Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt1289) {
								local145 = 2000;
							} else {
								local145 = 0;
							}
						}
					} else if (Static56.aBooleanArray6[local133]) {
						local145 = 2000;
					}
					@Pc(199) short local199 = Static18.aShortArray58[local133];
					@Pc(204) short local204 = (short) (local199 + local145);
					Static61.method1423(Static193.method3536(new Class60[] { Static54.aClass60_396, local56 }), Static63.aClass60Array12[local133], local204, (long) arg3, arg1, arg0);
				}
			}
		} else if ((Static101.anInt2923 & 0x8) == 8) {
			Static61.method1423(Static193.method3536(new Class60[] { Static167.aClass60_1132, Static164.aClass60_1118, local56 }), Static4.aClass60_35, (short) 42, (long) arg3, arg1, arg0);
		}
		for (local133 = 0; local133 < Static169.anInt4148; local133++) {
			if (Static140.aShortArray53[local133] == 43) {
				Static196.aClass60Array26[local133] = Static193.method3536(new Class60[] { Static54.aClass60_396, local56 });
				return;
			}
		}
	}
}
