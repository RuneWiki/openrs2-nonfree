import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!o", name = "f", descriptor = "S")
	public static short aShort53 = 256;

	@OriginalMember(owner = "client!o", name = "g", descriptor = "Z")
	public static boolean aBoolean365 = true;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIBII)V")
	public static void method3972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		if (arg4 < 128 || arg5 < 128 || (Static48.anInt1107 - 2) * 128 < arg4 || arg5 > Static337.anInt6402 * 128 - 256) {
			Static87.anIntArray215[0] = Static87.anIntArray215[1] = -1;
			return;
		}
		@Pc(45) int local45 = Static16.method362(arg4, arg5, Static285.anInt5511) - arg2;
		Static302.aClass21_6.method2810(arg3, 0, 0);
		Static34.aClass2_6.method3239(Static302.aClass21_6);
		Static34.aClass2_6.method3257(arg4, local45, arg5, Static87.anIntArray215);
		Static302.aClass21_6.method2810(-arg3, 0, 0);
		Static34.aClass2_6.method3239(Static302.aClass21_6);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IZLclient!rg;)V")
	public static void method3973(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class177 arg1) {
		@Pc(12) int local12 = arg1.anInt5181 == 0 ? arg1.anInt5179 : arg1.anInt5181;
		@Pc(25) int local25 = arg1.anInt5262 == 0 ? arg1.anInt5209 : arg1.anInt5262;
		Static73.method1435(local25, Static314.aClass177ArrayArray1[arg1.anInt5219 >> 16], arg1.anInt5219, local12, arg0);
		if (arg1.aClass177Array2 != null) {
			Static73.method1435(local25, arg1.aClass177Array2, arg1.anInt5219, local12, arg0);
		}
		@Pc(58) Class1_Sub9 local58 = (Class1_Sub9) Static348.aClass26_20.method870((long) arg1.anInt5219);
		if (local58 != null) {
			Static54.method3231(local58.anInt1104, local25, local12, arg0);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
	public static void method3974() {
		Static121.aClass1_Sub6_Sub1_2.method561();
		Static3.anInt77 = 1;
		Static77.aClass165_25 = null;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)Z")
	public static boolean method3975(@OriginalArg(0) int arg0) {
		if (arg0 == 26 || arg0 == 37 || arg0 == 41 || arg0 == 45 || arg0 == 9 || arg0 == 43 || arg0 == 46 || arg0 == 15) {
			return true;
		} else if (arg0 == 19 || arg0 == 5 || arg0 == 1004 || arg0 == 1001) {
			return true;
		} else if (arg0 == 20 || arg0 == 7 || arg0 == 2 || arg0 == 17 || arg0 == 30) {
			return true;
		} else {
			return arg0 == 21 || arg0 == 13 || arg0 == 39 || arg0 == 40 || arg0 == 36 || arg0 == 58;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3976(@OriginalArg(1) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)V")
	public static void method3977(@OriginalArg(0) int arg0) {
		if (Static198.method3725(arg0)) {
			Static199.method3740(Static314.aClass177ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "([IZLclient!ke;[I[I)V")
	public static void method3978(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class5_Sub3_Sub3_Sub1 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) int local13 = arg0[local7];
			@Pc(17) int local17 = arg2[local7];
			@Pc(21) int local21 = arg3[local7];
			@Pc(23) int local23 = 0;
			while (local17 != 0 && local23 < arg1.aClass59Array3.length) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg1.aClass59Array3[local23] = null;
					} else {
						@Pc(40) Class121 local40 = Static133.method2520(local13);
						@Pc(43) int local43 = local40.anInt3780;
						@Pc(48) Class59 local48 = arg1.aClass59Array3[local23];
						if (local48 != null) {
							if (local48.anInt1772 == local13) {
								if (local43 == 0) {
									local48 = arg1.aClass59Array3[local23] = null;
								} else if (local43 == 1) {
									local48.anInt1769 = 0;
									local48.anInt1770 = 0;
									local48.anInt1766 = 1;
									local48.anInt1767 = local21;
									local48.anInt1771 = 0;
									Static131.method2490(Static130.aClass5_Sub3_Sub3_Sub1_1 == arg1, local40, 0, arg1.anInt5047, arg1.anInt5050);
								} else if (local43 == 2) {
									local48.anInt1769 = 0;
								}
							} else if (local40.anInt3772 >= Static133.method2520(local48.anInt1772).anInt3772) {
								local48 = arg1.aClass59Array3[local23] = null;
							}
						}
						if (local48 == null) {
							local48 = arg1.aClass59Array3[local23] = new Class59();
							local48.anInt1766 = 1;
							local48.anInt1771 = 0;
							local48.anInt1769 = 0;
							local48.anInt1770 = 0;
							local48.anInt1767 = local21;
							local48.anInt1772 = local13;
							Static131.method2490(arg1 == Static130.aClass5_Sub3_Sub3_Sub1_1, local40, 0, arg1.anInt5047, arg1.anInt5050);
						}
					}
				}
				local23++;
				local17 >>>= 0x1;
			}
		}
	}
}
