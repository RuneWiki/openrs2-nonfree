import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
	public static int anInt1082;

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
	public static int anInt1089;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
	public static int anInt1081 = 1;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "[I")
	public static int[] anIntArray75 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "[I")
	public static int[] anIntArray76 = new int[32];

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "[I")
	public static int[] anIntArray77 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "Z")
	public static boolean aBoolean75 = true;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public static void method771() {
		if (Static138.aFloat29 > Static224.aFloat47) {
			Static224.aFloat47 = (float) ((double) Static224.aFloat47 + (double) Static224.aFloat47 / 30.0D);
			if (Static138.aFloat29 < Static224.aFloat47) {
				Static224.aFloat47 = Static138.aFloat29;
			}
			Static286.method4120();
		} else if (Static138.aFloat29 < Static224.aFloat47) {
			Static224.aFloat47 = (float) ((double) Static224.aFloat47 - (double) Static224.aFloat47 / 30.0D);
			if (Static138.aFloat29 > Static224.aFloat47) {
				Static224.aFloat47 = Static138.aFloat29;
			}
			Static286.method4120();
		}
		if (Static64.anInt1385 == -1 || Static119.anInt2398 == -1) {
			return;
		}
		@Pc(61) int local61 = Static64.anInt1385 - Static52.anInt1147;
		@Pc(66) int local66 = Static119.anInt2398 - Static218.anInt4483;
		if (local66 < 2 || local66 > 2) {
			local66 >>= 0x4;
		}
		if (local61 < 2 || local61 > 2) {
			local61 >>= 0x4;
		}
		Static52.anInt1147 += local61;
		Static218.anInt4483 += local66;
		if (local61 == 0 && local66 == 0) {
			Static64.anInt1385 = -1;
			Static119.anInt2398 = -1;
		}
		Static286.method4120();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)V")
	public static void method773(@OriginalArg(0) boolean arg0) {
		Static16.method2745();
		if (Static23.anInt618 != 30 && Static23.anInt618 != 25) {
			return;
		}
		Static215.anInt4430++;
		if (Static215.anInt4430 < 50 && !arg0) {
			return;
		}
		Static215.anInt4430 = 0;
		if (!Static286.aBoolean461 && Static95.aClass92_4 != null) {
			Static66.aClass8_Sub2_Sub1_4.method2398(219);
			try {
				Static95.aClass92_4.method2178(Static66.aClass8_Sub2_Sub1_4.aByteArray24, Static66.aClass8_Sub2_Sub1_4.anInt2955);
				Static66.aClass8_Sub2_Sub1_4.anInt2955 = 0;
			} catch (@Pc(59) IOException local59) {
				Static286.aBoolean461 = true;
			}
		}
		Static16.method2745();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)V")
	public static void method774(@OriginalArg(1) int arg0) {
		if (arg0 == Static23.anInt618) {
			return;
		}
		if (Static23.anInt618 == 0) {
			Static104.method1691();
		}
		if (arg0 == 40) {
			Static254.method3799();
		}
		if (arg0 != 40 && Static256.aClass92_8 != null) {
			Static256.aClass92_8.method2176();
			Static256.aClass92_8 = null;
		}
		@Pc(61) boolean local61 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		if (arg0 == 25 || arg0 == 28) {
			Static14.anInt370 = 0;
			Static4.anInt46 = 0;
			Static266.anInt5290 = 1;
			Static50.anInt1115 = 0;
			Static92.anInt1943 = 1;
			Static15.method286(true);
		}
		if (arg0 == 25 || arg0 == 10) {
			Static23.method411();
		}
		if (arg0 == 5) {
			Static213.method3342(Static145.aClass132_55);
		} else {
			Static120.method1938();
		}
		@Pc(112) boolean local112 = Static23.anInt618 == 5 || Static23.anInt618 == 10 || Static23.anInt618 == 28;
		if (local61 != local112) {
			if (local61) {
				Static236.anInt4769 = Static212.anInt4368;
				if (Static275.anInt5409 == 0) {
					Static258.method3881();
				} else {
					Static256.method3844(Static212.anInt4368, Static88.aClass132_35, 255);
				}
				Static158.aClass139_2.method3451(false);
			} else {
				Static258.method3881();
				Static158.aClass139_2.method3451(true);
			}
		}
		if (Static116.aBoolean188 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
			Static116.method1906();
		}
		Static23.anInt618 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)Lclient!ql;")
	public static Class8_Sub1_Sub14 method775(@OriginalArg(1) int arg0) {
		@Pc(10) Class8_Sub1_Sub14 local10 = (Class8_Sub1_Sub14) Static138.aClass125_32.method2957((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static64.aClass132_23.method3194(5, arg0);
		local10 = new Class8_Sub1_Sub14();
		if (local20 != null) {
			local10.method3420(new Class8_Sub2(local20));
		}
		Static138.aClass125_32.method2956((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIII)V")
	public static void method776(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class8_Sub23 local12 = (Class8_Sub23) Static188.aClass129_20.method3043((long) arg0);
		if (local12 == null) {
			local12 = new Class8_Sub23();
			Static188.aClass129_20.method3039(local12, (long) arg0);
		}
		if (local12.anIntArray270.length <= arg3) {
			@Pc(39) int[] local39 = new int[arg3 + 1];
			@Pc(44) int[] local44 = new int[arg3 + 1];
			@Pc(46) int local46;
			for (local46 = 0; local46 < local12.anIntArray270.length; local46++) {
				local39[local46] = local12.anIntArray270[local46];
				local44[local46] = local12.anIntArray268[local46];
			}
			for (local46 = local12.anIntArray270.length; local46 < arg3; local46++) {
				local39[local46] = -1;
				local44[local46] = 0;
			}
			local12.anIntArray268 = local44;
			local12.anIntArray270 = local39;
		}
		local12.anIntArray270[arg3] = arg1;
		local12.anIntArray268[arg3] = arg2;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V")
	public static void method777() {
		Static87.aClass61_15.method1379();
		Static219.aClass61_40.method1379();
	}
}
