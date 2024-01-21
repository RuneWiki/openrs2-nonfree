import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!rh", name = "S", descriptor = "I")
	public static int anInt3288;

	@OriginalMember(owner = "client!rh", name = "Z", descriptor = "Lclient!kf;")
	public static Class3_Sub1_Sub3_Sub3 aClass3_Sub1_Sub3_Sub3_14;

	@OriginalMember(owner = "client!rh", name = "ab", descriptor = "[I")
	public static int[] anIntArray350;

	@OriginalMember(owner = "client!rh", name = "U", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1804 = Static122.method531("OFF");

	@OriginalMember(owner = "client!rh", name = "X", descriptor = "Z")
	public static boolean aBoolean221 = false;

	@OriginalMember(owner = "client!rh", name = "Y", descriptor = "[I")
	public static int[] anIntArray349 = new int[500];

	@OriginalMember(owner = "client!rh", name = "eb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1805 = aClass73_1804;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IBIII)V")
	public static void method2381(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static15.method2296(arg0, arg1, arg0 + arg2, arg1 + arg3);
		Static36.method662();
		Static100.anInt2225++;
		Static87.method1528(true);
		Static149.method2456(true);
		Static87.method1528(false);
		Static149.method2456(false);
		Static179.method2755();
		Static180.method2776();
		@Pc(55) int local55;
		@Pc(53) int local53;
		if (!Static22.aBoolean40) {
			local53 = Static25.anInt716 + Static79.anInt1740 & 0x7FF;
			local55 = Static84.anInt1889;
			if (Static48.anInt1129 / 256 > local55) {
				local55 = Static48.anInt1129 / 256;
			}
			if (Static26.aBooleanArray2[4] && Static176.anIntArray418[4] + 128 > local55) {
				local55 = Static176.anIntArray418[4] + 128;
			}
			Static117.method2066(Static107.method1922(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3169, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3159, Static147.anInt3309) - 50, local53, Static43.anInt1006, local55 * 3 + 600, Static28.anInt748, local55);
		}
		if (Static22.aBoolean40) {
			local55 = Static44.method787();
		} else {
			local55 = Static163.method2266();
		}
		@Pc(113) int local113 = Static55.anInt1291;
		local53 = Static34.anInt834;
		@Pc(117) int local117 = Static19.anInt513;
		@Pc(119) int local119 = Static130.anInt2973;
		@Pc(121) int local121 = Static141.anInt3252;
		@Pc(165) int local165;
		for (@Pc(123) int local123 = 0; local123 < 5; local123++) {
			if (Static26.aBooleanArray2[local123]) {
				local165 = (int) ((double) -Static12.anIntArray14[local123] + (double) (Static12.anIntArray14[local123] * 2 + 1) * Math.random() + Math.sin((double) Static43.anIntArray95[local123] * ((double) Static180.anIntArray429[local123] / 100.0D)) * (double) Static176.anIntArray418[local123]);
				if (local123 == 3) {
					Static141.anInt3252 = Static141.anInt3252 + local165 & 0x7FF;
				}
				if (local123 == 4) {
					Static130.anInt2973 += local165;
					if (Static130.anInt2973 < 128) {
						Static130.anInt2973 = 128;
					}
					if (Static130.anInt2973 > 383) {
						Static130.anInt2973 = 383;
					}
				}
				if (local123 == 0) {
					Static34.anInt834 += local165;
				}
				if (local123 == 1) {
					Static55.anInt1291 += local165;
				}
				if (local123 == 2) {
					Static19.anInt513 += local165;
				}
			}
		}
		@Pc(223) int local223 = Static5.anInt107;
		local165 = Static37.anInt899;
		if (local165 >= arg0 && arg0 + arg2 > local165 && local223 >= arg1 && arg3 + arg1 > local223) {
			Static114.anInt2427 = Static37.anInt899 - arg0;
			Static114.anInt2429 = Static5.anInt107 - arg1;
			Static114.anInt2430 = 0;
			Static114.aBoolean165 = true;
		} else {
			Static114.aBoolean165 = false;
			Static114.anInt2430 = 0;
		}
		Static109.method1956();
		Static15.method2297(arg0, arg1, arg2, arg3, 0);
		Static109.method1956();
		Static119.aClass35_1.method1133(Static34.anInt834, Static55.anInt1291, Static19.anInt513, Static130.anInt2973, Static141.anInt3252, local55);
		Static109.method1956();
		Static119.aClass35_1.method1129();
		Static26.method558(arg2, arg0, arg1, arg3);
		Static97.method1679(arg0, arg1);
		((Class53) Static36.anInterface1_2).method1728(Static165.anInt320);
		Static72.method1259(arg3, arg1, arg2, arg0);
		Static55.anInt1291 = local113;
		Static141.anInt3252 = local121;
		Static130.anInt2973 = local119;
		Static19.anInt513 = local117;
		Static34.anInt834 = local53;
		if (Static109.aBoolean175 && Static57.method1000() == 0) {
			Static109.aBoolean175 = false;
		}
		if (Static109.aBoolean175) {
			Static15.method2297(arg0, arg1, arg2, arg3, 0);
			Static104.method1816(false, Static133.aClass73_1696);
		}
		if (!Static109.aBoolean175 && !Static169.aBoolean245 && local165 >= arg0 && arg2 + arg0 > local165 && arg1 <= local223 && local223 < arg1 + arg3) {
			Static28.method565(local223, arg0, local165, arg1);
		}
	}

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "(I)V")
	public static void method2382() {
		aClass73_1804 = null;
		anIntArray349 = null;
		aClass73_1805 = null;
		aClass3_Sub1_Sub3_Sub3_14 = null;
		anIntArray350 = null;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILclient!sd;)Z")
	public static boolean method2383(@OriginalArg(1) Class73 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static107.anInt2468; local11++) {
			if (arg0.method2438(Static116.aClass73Array18[local11])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIBII)V")
	public static void method2384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) int local8 = 0; local8 < Static81.anInt1818; local8++) {
			if (arg2 < Static19.anIntArray47[local8] + Static72.anIntArray176[local8] && Static72.anIntArray176[local8] < arg3 + arg2 && Static34.anIntArray78[local8] + Static163.anIntArray325[local8] > arg1 && arg0 + arg1 > Static163.anIntArray325[local8]) {
				Static84.aBooleanArray7[local8] = true;
			}
		}
	}
}
