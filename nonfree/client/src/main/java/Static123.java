import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!je", name = "d", descriptor = "Lclient!dc;")
	public static Class1_Sub2_Sub7 aClass1_Sub2_Sub7_5;

	@OriginalMember(owner = "client!je", name = "k", descriptor = "[I")
	public static int[] anIntArray256;

	@OriginalMember(owner = "client!je", name = "l", descriptor = "Lclient!km;")
	public static Class91 aClass91_97;

	@OriginalMember(owner = "client!je", name = "m", descriptor = "Lclient!km;")
	public static Class91 aClass91_98;

	@OriginalMember(owner = "client!je", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString162 = "Your ignore list is full. Max of 100 users.";

	@OriginalMember(owner = "client!je", name = "i", descriptor = "I")
	public static int anInt2804 = 0;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V")
	public static void method2162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 8) {
			arg1 = 4;
		}
		if (arg1 == 4 && !Static236.aBoolean353) {
			arg0 = 2;
			arg1 = 2;
		}
		if (Static202.anInt4103 != arg1) {
			if (Static261.aBoolean387) {
				return;
			}
			if (Static202.anInt4103 != 0) {
				Static281.anInterface1Array3[Static202.anInt4103].method4019();
			}
			if (arg1 != 0) {
				@Pc(38) Interface1 local38 = Static281.anInterface1Array3[arg1];
				local38.method4018();
				local38.method4017(arg0);
			}
			Static44.anInt1075 = arg0;
			Static202.anInt4103 = arg1;
		} else if (arg1 != 0 && arg0 != Static44.anInt1075) {
			Static281.anInterface1Array3[arg1].method4017(arg0);
			Static44.anInt1075 = arg0;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!km;I)V")
	public static void method2163(@OriginalArg(0) Class91 arg0) {
		if (Static239.aBoolean362) {
			return;
		}
		if (Static277.aBoolean412) {
			Static41.method843();
		} else {
			Static50.method962();
		}
		Static59.aClass1_Sub2_Sub11_16 = Static133.method2243(arg0, Static215.anInt4271);
		@Pc(19) int local19 = Static148.anInt3206;
		@Pc(25) int local25 = local19 * 956 / 503;
		Static59.aClass1_Sub2_Sub11_16.method3778((Static3.anInt122 - local25) / 2, 0, local25, local19);
		Static101.aClass12_1 = Static79.method1371(arg0, Static200.anInt4064);
		Static101.aClass12_1.method3927(Static3.anInt122 / 2 - Static101.aClass12_1.anInt5018 / 2, 18);
		Static239.aBoolean362 = true;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!in;III)V")
	public static void method2164(@OriginalArg(1) Class71 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static277.aBoolean412) {
			Static41.method847(arg1, arg3, arg1 + arg0.anInt2722, arg0.anInt2698 + arg3);
		}
		if (Static147.anInt3196 >= 3) {
			if (Static277.aBoolean412) {
				@Pc(43) Class1_Sub2_Sub11 local43 = arg0.method2100(false);
				if (local43 != null) {
					local43.method3781(arg1, arg3);
				}
			} else {
				Static50.method942(arg1, arg3, arg0.anIntArray244, arg0.anIntArray233);
			}
		} else if (Static277.aBoolean412) {
			((Class1_Sub2_Sub11_Sub1) Static77.aClass1_Sub2_Sub11_8).method3122(arg1, arg3, arg0.anInt2722, arg0.anInt2698, Static77.aClass1_Sub2_Sub11_8.anInt4874 / 2, Static77.aClass1_Sub2_Sub11_8.anInt4869 / 2, (int) Static298.aFloat58, 256, (Class1_Sub2_Sub11_Sub1) arg0.method2100(false));
		} else {
			((Class1_Sub2_Sub11_Sub2) Static77.aClass1_Sub2_Sub11_8).method3785(arg1, arg3, arg0.anInt2722, arg0.anInt2698, Static77.aClass1_Sub2_Sub11_8.anInt4874 / 2, Static77.aClass1_Sub2_Sub11_8.anInt4869 / 2, (int) Static298.aFloat58, arg0.anIntArray244, arg0.anIntArray233);
		}
		Static78.aBooleanArray17[arg2] = true;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public static void method2165() {
		@Pc(13) int local13 = Static279.anInt5379;
		@Pc(15) int local15 = Static116.anInt5594;
		@Pc(17) int local17 = Static88.anInt1955;
		@Pc(23) int local23 = Static276.anInt2924 - 3;
		if (Static198.aClass1_Sub2_Sub11_2 == null || Static146.aClass1_Sub2_Sub11_13 == null) {
			if (Static134.aClass91_110.method2501(Static55.anInt1219) && Static134.aClass91_110.method2501(Static152.anInt3235)) {
				Static198.aClass1_Sub2_Sub11_2 = Static187.method3141(Static55.anInt1219, Static134.aClass91_110);
				Static146.aClass1_Sub2_Sub11_13 = Static187.method3141(Static152.anInt3235, Static134.aClass91_110);
				if (Static277.aBoolean412) {
					if (Static198.aClass1_Sub2_Sub11_2 instanceof Class1_Sub2_Sub11_Sub2_Sub1) {
						Static198.aClass1_Sub2_Sub11_2 = new Class1_Sub2_Sub11_Sub1_Sub1((Class1_Sub2_Sub11_Sub2) Static198.aClass1_Sub2_Sub11_2);
					} else {
						Static198.aClass1_Sub2_Sub11_2 = new Class1_Sub2_Sub11_Sub1((Class1_Sub2_Sub11_Sub2) Static198.aClass1_Sub2_Sub11_2);
					}
					if (Static146.aClass1_Sub2_Sub11_13 instanceof Class1_Sub2_Sub11_Sub2_Sub1) {
						Static146.aClass1_Sub2_Sub11_13 = new Class1_Sub2_Sub11_Sub1_Sub1((Class1_Sub2_Sub11_Sub2) Static146.aClass1_Sub2_Sub11_13);
					} else {
						Static146.aClass1_Sub2_Sub11_13 = new Class1_Sub2_Sub11_Sub1((Class1_Sub2_Sub11_Sub2) Static146.aClass1_Sub2_Sub11_13);
					}
				}
			} else if (Static277.aBoolean412) {
				Static41.method839(local13, local17, local15, 20, Static33.anInt767, 256 - Static229.anInt4530);
			} else {
				Static50.method961(local13, local17, local15, 20, Static33.anInt767, 256 - Static229.anInt4530);
			}
		}
		@Pc(131) int local131;
		@Pc(133) int local133;
		if (Static198.aClass1_Sub2_Sub11_2 != null && Static146.aClass1_Sub2_Sub11_13 != null) {
			local131 = (local15 - Static146.aClass1_Sub2_Sub11_13.anInt4874 * 2) / Static198.aClass1_Sub2_Sub11_2.anInt4874;
			for (local133 = 0; local133 < local131; local133++) {
				Static198.aClass1_Sub2_Sub11_2.method3781(Static146.aClass1_Sub2_Sub11_13.anInt4874 + local13 + Static198.aClass1_Sub2_Sub11_2.anInt4874 * local133, local17);
			}
			Static146.aClass1_Sub2_Sub11_13.method3781(local13, local17);
			Static146.aClass1_Sub2_Sub11_13.method3770(local13 + local15 - Static146.aClass1_Sub2_Sub11_13.anInt4874, local17);
		}
		Static134.aClass1_Sub2_Sub1_3.method458(Static185.aString226, local13 + 3, local17 - -14, Static3.anInt120, -1);
		if (Static277.aBoolean412) {
			Static41.method839(local13, local17 + 20, local15, local23 - 20, Static33.anInt767, 256 - Static229.anInt4530);
		} else {
			Static50.method961(local13, local17 + 20, local15, local23 - 20, Static33.anInt767, 256 - Static229.anInt4530);
		}
		local131 = Static224.anInt4445;
		local133 = Static8.anInt226;
		@Pc(222) int local222;
		@Pc(244) int local244;
		for (local222 = 0; local222 < Static134.anInt2945; local222++) {
			local244 = (Static134.anInt2945 - local222 - 1) * 15 + local17 + 13 + 20;
			if (local13 < local131 && local131 < local13 + local15 && local244 - 13 < local133 && local133 < local244 + 3) {
				if (Static277.aBoolean412) {
					Static41.method839(local13, local244 - 12, local15, 15, Static226.anInt4491, 256 - Static56.anInt1243);
				} else {
					Static50.method961(local13, local244 - 12, local15, 15, Static226.anInt4491, 256 - Static56.anInt1243);
				}
			}
		}
		if ((Static216.aClass1_Sub2_Sub11_17 == null || Static230.aClass1_Sub2_Sub11_10 == null || Static130.aClass1_Sub2_Sub11_12 == null) && Static134.aClass91_110.method2501(Static211.anInt4205) && Static134.aClass91_110.method2501(Static78.anInt1747) && Static134.aClass91_110.method2501(Static53.anInt5282)) {
			Static216.aClass1_Sub2_Sub11_17 = Static187.method3141(Static211.anInt4205, Static134.aClass91_110);
			Static230.aClass1_Sub2_Sub11_10 = Static187.method3141(Static78.anInt1747, Static134.aClass91_110);
			Static130.aClass1_Sub2_Sub11_12 = Static187.method3141(Static53.anInt5282, Static134.aClass91_110);
			if (Static277.aBoolean412) {
				if (Static216.aClass1_Sub2_Sub11_17 instanceof Class1_Sub2_Sub11_Sub2_Sub1) {
					Static216.aClass1_Sub2_Sub11_17 = new Class1_Sub2_Sub11_Sub1_Sub1((Class1_Sub2_Sub11_Sub2) Static216.aClass1_Sub2_Sub11_17);
				} else {
					Static216.aClass1_Sub2_Sub11_17 = new Class1_Sub2_Sub11_Sub1((Class1_Sub2_Sub11_Sub2) Static216.aClass1_Sub2_Sub11_17);
				}
				if (Static230.aClass1_Sub2_Sub11_10 instanceof Class1_Sub2_Sub11_Sub2_Sub1) {
					Static230.aClass1_Sub2_Sub11_10 = new Class1_Sub2_Sub11_Sub1_Sub1((Class1_Sub2_Sub11_Sub2) Static230.aClass1_Sub2_Sub11_10);
				} else {
					Static230.aClass1_Sub2_Sub11_10 = new Class1_Sub2_Sub11_Sub1((Class1_Sub2_Sub11_Sub2) Static230.aClass1_Sub2_Sub11_10);
				}
				if (Static130.aClass1_Sub2_Sub11_12 instanceof Class1_Sub2_Sub11_Sub2_Sub1) {
					Static130.aClass1_Sub2_Sub11_12 = new Class1_Sub2_Sub11_Sub1_Sub1((Class1_Sub2_Sub11_Sub2) Static130.aClass1_Sub2_Sub11_12);
				} else {
					Static130.aClass1_Sub2_Sub11_12 = new Class1_Sub2_Sub11_Sub1((Class1_Sub2_Sub11_Sub2) Static130.aClass1_Sub2_Sub11_12);
				}
			}
		}
		@Pc(466) int local466;
		if (Static216.aClass1_Sub2_Sub11_17 != null && Static230.aClass1_Sub2_Sub11_10 != null && Static130.aClass1_Sub2_Sub11_12 != null) {
			local222 = (local15 - Static130.aClass1_Sub2_Sub11_12.anInt4874 * 2) / Static216.aClass1_Sub2_Sub11_17.anInt4874;
			for (local244 = 0; local244 < local222; local244++) {
				Static216.aClass1_Sub2_Sub11_17.method3781(Static216.aClass1_Sub2_Sub11_17.anInt4874 * local244 + local13 + Static130.aClass1_Sub2_Sub11_12.anInt4874, -Static216.aClass1_Sub2_Sub11_17.anInt4869 + local23 + local17);
			}
			local244 = (local23 - Static130.aClass1_Sub2_Sub11_12.anInt4869 - 20) / Static230.aClass1_Sub2_Sub11_10.anInt4869;
			for (local466 = 0; local466 < local244; local466++) {
				Static230.aClass1_Sub2_Sub11_10.method3781(local13, local17 + local466 * Static230.aClass1_Sub2_Sub11_10.anInt4869 + 20);
				Static230.aClass1_Sub2_Sub11_10.method3770(local15 + local13 - Static230.aClass1_Sub2_Sub11_10.anInt4874, local466 * Static230.aClass1_Sub2_Sub11_10.anInt4869 + 20 + local17);
			}
			Static130.aClass1_Sub2_Sub11_12.method3781(local13, local17 + local23 - Static130.aClass1_Sub2_Sub11_12.anInt4869);
			Static130.aClass1_Sub2_Sub11_12.method3770(local13 + local15 - Static130.aClass1_Sub2_Sub11_12.anInt4874, -Static130.aClass1_Sub2_Sub11_12.anInt4869 + local17 + local23);
		}
		for (local222 = 0; local222 < Static134.anInt2945; local222++) {
			local244 = local17 + (Static134.anInt2945 + -1 + -local222) * 15 + 20 + 13;
			local466 = Static3.anInt120;
			if (local131 > local13 && local131 < local13 + local15 && local244 - 13 < local133 && local133 < local244 + 3) {
				local466 = Static187.anInt3897;
			}
			Static134.aClass1_Sub2_Sub1_3.method458(Static132.method2239(local222), local13 + 3, local244, local466, 0);
		}
		Static282.method4247(Static88.anInt1955, Static276.anInt2924, Static279.anInt5379, Static116.anInt5594);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
	public static void method2167() {
		Static227.aClass135_27.method3324();
		Static140.aClass135_14.method3324();
		Static71.aClass135_5.method3324();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method2168(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? Integer.toString(arg0) : "*";
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2169(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static108.method1987(arg2)) {
			Static36.method772(Static77.aClass71ArrayArray1[arg2], -1, arg4, arg1, arg5, arg0, arg6, arg3);
		}
	}
}
