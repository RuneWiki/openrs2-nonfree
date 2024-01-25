import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static613 {

	@OriginalMember(owner = "client!ufa", name = "l", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_114 = new Class241(92, -1);

	@OriginalMember(owner = "client!ufa", name = "j", descriptor = "I")
	public static int anInt9701 = 0;

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method8454(@OriginalArg(0) String arg0) {
		Static506.aString97 = arg0;
		if (Static371.anApplet1 == null) {
			return;
		}
		try {
			@Pc(15) String local15 = Static371.anApplet1.getParameter("cookieprefix");
			@Pc(30) String local30 = Static371.anApplet1.getParameter("cookiehost");
			@Pc(49) String local49 = local15 + "settings=" + arg0 + "; version=1; path=/; domain=" + local30;
			if (arg0.length() == 0) {
				local49 = local49 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local49 = local49 + "; Expires=" + Static337.method5203(Static549.method7758() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static692.method2494("document.cookie=\"" + local49 + "\"", Static371.anApplet1);
		} catch (@Pc(110) Throwable local110) {
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)V")
	public static void method8455() {
		Static687.aBoolean733 = false;
		Static35.method456();
	}

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "(III)V")
	public static void method8456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static567.aClass121_9 == Static129.aClass121_1) {
			if (!Static223.method4038(0, -2, false, 1, arg0, arg1, 0, 1)) {
				Static223.method4038(0, -3, false, 1, arg0, arg1, 0, 1);
			}
		} else if (!Static223.method4038(0, -3, false, 1, arg0, arg1, 0, 1)) {
			Static223.method4038(0, -2, false, 1, arg0, arg1, 0, 1);
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lclient!jc;B)V")
	public static void method8457(@OriginalArg(0) Class6_Sub15 arg0) {
		@Pc(9) int local9 = arg0.method2992();
		Static66.aClass182Array1 = new Class182[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static66.aClass182Array1[local14] = new Class182();
			Static66.aClass182Array1[local14].anInt5045 = arg0.method2992();
			Static66.aClass182Array1[local14].aString53 = arg0.method2998();
		}
		Static535.anInt4137 = arg0.method2992();
		Static39.anInt536 = arg0.method2992();
		Static253.anInt4796 = arg0.method2992();
		Static241.aClass204_Sub1Array2 = new Class204_Sub1[Static39.anInt536 + 1 - Static535.anInt4137];
		for (@Pc(64) int local64 = 0; local64 < Static253.anInt4796; local64++) {
			@Pc(72) int local72 = arg0.method2992();
			@Pc(80) Class204_Sub1 local80 = Static241.aClass204_Sub1Array2[local72] = new Class204_Sub1();
			local80.anInt6029 = arg0.method3030();
			local80.anInt6021 = arg0.method3015();
			local80.anInt6031 = Static535.anInt4137 + local72;
			local80.aString69 = arg0.method2998();
			local80.aString70 = arg0.method2998();
		}
		Static576.anInt9207 = arg0.method3015();
		Static217.aBoolean339 = true;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(III)V")
	public static void method8458(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static627.aFloat139 < Static627.aFloat140) {
			Static627.aFloat139 = (float) ((double) Static627.aFloat139 + (double) Static627.aFloat139 / 30.0D);
			if (Static627.aFloat139 > Static627.aFloat140) {
				Static627.aFloat139 = Static627.aFloat140;
			}
			Static62.method784();
			Static627.anInt7258 = (int) Static627.aFloat139 >> 1;
			Static627.aByteArrayArrayArray18 = Static609.method8383(Static627.anInt7258);
		} else if (Static627.aFloat140 < Static627.aFloat139) {
			Static627.aFloat139 = (float) ((double) Static627.aFloat139 - (double) Static627.aFloat139 / 30.0D);
			if (Static627.aFloat139 < Static627.aFloat140) {
				Static627.aFloat139 = Static627.aFloat140;
			}
			Static62.method784();
			Static627.anInt7258 = (int) Static627.aFloat139 >> 1;
			Static627.aByteArrayArrayArray18 = Static609.method8383(Static627.anInt7258);
		}
		if (Static499.anInt8390 != -1 && Static51.anInt617 != -1) {
			@Pc(95) int local95 = Static499.anInt8390 - Static91.anInt1364;
			if (local95 < 2 || local95 > 2) {
				local95 /= 8;
			}
			@Pc(112) int local112 = Static51.anInt617 - Static488.anInt8263;
			Static91.anInt1364 += local95;
			if (local112 < 2 || local112 > 2) {
				local112 /= 8;
			}
			if (local95 == 0 && local112 == 0) {
				Static499.anInt8390 = -1;
				Static51.anInt617 = -1;
			}
			Static488.anInt8263 += local112;
			Static62.method784();
		}
		if (Static626.anInt9859 > 0) {
			Static344.anInt5861--;
			if (Static344.anInt5861 == 0) {
				Static626.anInt9859--;
				Static344.anInt5861 = 100;
			}
		} else {
			Static119.anInt2286 = -1;
			Static604.anInt9539 = -1;
		}
		if (!Static316.aBoolean463 || Static527.aClass340_67 == null) {
			return;
		}
		for (@Pc(193) Class6_Sub20 local193 = (Class6_Sub20) Static527.aClass340_67.method8124(); local193 != null; local193 = (Class6_Sub20) Static527.aClass340_67.method8134()) {
			@Pc(202) Class361 local202 = Static627.aClass190_5.method4695(local193.aClass6_Sub24_1.anInt4787);
			if (local193.method3264(arg1, arg0)) {
				if (local202.aStringArray40 != null) {
					if (local202.aStringArray40[4] != null) {
						Static541.method8078(-1, local202.aString116, local202.anInt9818, (long) local193.aClass6_Sub24_1.anInt4787, true, local202.aStringArray40[4], -1, false, 0, false, 1010, (long) local193.aClass6_Sub24_1.anInt4787);
					}
					if (local202.aStringArray40[3] != null) {
						Static541.method8078(-1, local202.aString116, local202.anInt9818, (long) local193.aClass6_Sub24_1.anInt4787, true, local202.aStringArray40[3], -1, false, 0, false, 1001, (long) local193.aClass6_Sub24_1.anInt4787);
					}
					if (local202.aStringArray40[2] != null) {
						Static541.method8078(-1, local202.aString116, local202.anInt9818, (long) local193.aClass6_Sub24_1.anInt4787, true, local202.aStringArray40[2], -1, false, 0, false, 1004, (long) local193.aClass6_Sub24_1.anInt4787);
					}
					if (local202.aStringArray40[1] != null) {
						Static541.method8078(-1, local202.aString116, local202.anInt9818, (long) local193.aClass6_Sub24_1.anInt4787, true, local202.aStringArray40[1], -1, false, 0, false, 1011, (long) local193.aClass6_Sub24_1.anInt4787);
					}
					if (local202.aStringArray40[0] != null) {
						Static541.method8078(-1, local202.aString116, local202.anInt9818, (long) local193.aClass6_Sub24_1.anInt4787, true, local202.aStringArray40[0], -1, false, 0, false, 1012, (long) local193.aClass6_Sub24_1.anInt4787);
					}
				}
				if (!local193.aClass6_Sub24_1.aBoolean365) {
					local193.aClass6_Sub24_1.aBoolean365 = true;
					Static301.method4845(Static84.aClass275_6, local193.aClass6_Sub24_1.anInt4787, local202.anInt9818);
				}
				if (local193.aClass6_Sub24_1.aBoolean365) {
					Static301.method4845(Static547.aClass275_15, local193.aClass6_Sub24_1.anInt4787, local202.anInt9818);
				}
			} else if (local193.aClass6_Sub24_1.aBoolean365) {
				local193.aClass6_Sub24_1.aBoolean365 = false;
				Static301.method4845(Static82.aClass275_5, local193.aClass6_Sub24_1.anInt4787, local202.anInt9818);
			}
		}
	}
}
