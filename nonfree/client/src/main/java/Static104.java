import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "[Lclient!q;")
	public static Class3_Sub1_Sub2_Sub3[] aClass3_Sub1_Sub2_Sub3Array10;

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
	public static int anInt1773 = 0;

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "Lclient!ae;")
	public static Class5 aClass5_814 = Static56.method972("Handel akzeptieren");

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "Lclient!ae;")
	private static Class5 aClass5_816 = Static56.method972("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "Lclient!ae;")
	public static Class5 aClass5_815 = aClass5_816;

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "Lclient!ae;")
	private static Class5 aClass5_817 = Static56.method972("The server is being updated)3");

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "Z")
	public static boolean aBoolean80 = false;

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "Lclient!ae;")
	private static Class5 aClass5_820 = Static56.method972("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "Lclient!ae;")
	public static Class5 aClass5_818 = aClass5_820;

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "Lclient!ae;")
	public static Class5 aClass5_819 = Static56.method972("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!ua", name = "u", descriptor = "Lclient!ae;")
	public static Class5 aClass5_821 = aClass5_817;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
	public static void method1148() {
		Static79.method1281();
		Static95.method1643();
		Static110.method1915();
		Static70.method1192();
		Static61.method1069();
		Static15.method354();
		Static111.method1919();
		Static51.method1572();
		Static105.method1746();
		Static56.method970();
		Static65.method1590();
		Static33.method650();
		((Class57) Static25.anInterface3_1).method1560();
		Static74.aClass9_18.method283();
		Static65.aClass11_Sub1_92.method1862();
		Static17.aClass11_Sub1_19.method1862();
		Static60.aClass11_Sub1_113.method1862();
		Static60.aClass11_Sub1_112.method1862();
		Static18.aClass11_Sub1_20.method1862();
		Static34.aClass11_Sub1_34.method1862();
		Static74.aClass11_Sub1_67.method1862();
		Static38.aClass11_Sub1_37.method1862();
		Static102.aClass11_Sub1_97.method1862();
		Static110.aClass11_Sub1_106.method1862();
		Static54.aClass11_Sub1_53.method1862();
		Static49.aClass11_Sub1_50.method1862();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	public static void method1149() {
		if (Static87.aClass3_Sub1_Sub17_3 == null) {
			return;
		}
		@Pc(14) Class3_Sub1_Sub17 local14 = Static87.aClass3_Sub1_Sub17_3;
		@Pc(18) Class3_Sub1_Sub17 local18 = Static73.method1217(local14);
		if (local18 == null) {
			Static87.aClass3_Sub1_Sub17_3 = null;
			return;
		}
		Static94.anInt594++;
		@Pc(31) int[] local31 = Static109.method1898(local18);
		@Pc(37) int[] local37 = Static109.method1898(local14);
		@Pc(42) int local42 = Static100.anInt2512 - Static19.anInt694;
		@Pc(47) int local47 = Static49.anInt1325 - Static108.anInt2861;
		if (local14.anInt2627 >= local42 && local42 >= -local14.anInt2627 && local14.anInt2627 >= local47 && local47 >= -local14.anInt2627 && !Static58.aBoolean74) {
			local47 = 0;
			local42 = 0;
		} else if (local14.anInt2593 < Static94.anInt594 || Static58.aBoolean74) {
			Static58.aBoolean74 = true;
		} else {
			local47 = 0;
			local42 = 0;
		}
		@Pc(114) int local114 = local42 + local37[0] - local31[0];
		@Pc(125) int local125 = local47 + local37[1] - local31[1];
		if (local125 < 0) {
			local125 = 0;
		}
		if (local114 < 0) {
			local114 = 0;
		}
		if (local18.anInt2600 < local14.anInt2600 + local125) {
			local125 = local18.anInt2600 - local14.anInt2600;
		}
		if (local18.anInt2667 < local114 + local14.anInt2667) {
			local114 = local18.anInt2667 - local14.anInt2667;
		}
		if (Static87.aClass3_Sub1_Sub17_3.anObjectArray3 != null && Static58.aBoolean74) {
			Static68.method997(0, local14.anObjectArray3, null, local114, local14, local125);
		}
		if (Static46.anInt1282 != 0) {
			return;
		}
		if (Static58.aBoolean74) {
			@Pc(200) int local200 = Static49.anInt1325 - local31[1];
			@Pc(207) int local207 = Static100.anInt2512 - local31[0];
			if (local200 < 0) {
				local200 = 0;
			}
			if (local207 < 0) {
				local207 = 0;
			}
			if (local207 > local18.anInt2667 - 1) {
				local207 = local18.anInt2667 - 1;
			}
			if (local200 > local18.anInt2600 - 1) {
				local200 = local18.anInt2600 - 1;
			}
			@Pc(249) Class3_Sub1_Sub17 local249 = Static42.method804(local207, local200, local14, local18);
			if (Static87.aClass3_Sub1_Sub17_3.anObjectArray15 != null) {
				Static68.method997(0, local14.anObjectArray15, local249, local114, local14, local125);
			}
			if (local249 != null && local14.method1726() != null) {
				Static95.aClass3_Sub6_Sub1_3.method1645(46);
				Static95.aClass3_Sub6_Sub1_3.method1599(local249.anInt2663);
				Static95.aClass3_Sub6_Sub1_3.method1599(local14.anInt2663);
				Static95.aClass3_Sub6_Sub1_3.method1592(local249.anInt2651);
				Static95.aClass3_Sub6_Sub1_3.method1630(local14.anInt2651);
			}
		} else {
			if (Static87.aClass3_Sub1_Sub17_3.anObjectArray16 != null) {
				Static68.method997(0, local14.anObjectArray16, null, local114, local14, local125);
			}
			if ((Static74.anInt1895 == 1 || Static49.method875(Static75.anInt1934 - 1)) && Static75.anInt1934 > 2) {
				Static56.method973();
			} else if (Static75.anInt1934 > 0) {
				Static33.method651(Static75.anInt1934 - 1);
			}
		}
		Static87.aClass3_Sub1_Sub17_3 = null;
		return;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
	public static void method1152() {
		@Pc(14) int local14;
		for (@Pc(7) int local7 = -1; local7 < Static38.anInt1056; local7++) {
			if (local7 == -1) {
				local14 = 2047;
			} else {
				local14 = Static1.anIntArray6[local7];
			}
			@Pc(24) Class3_Sub1_Sub1_Sub1_Sub2 local24 = Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local14];
			if (local24 != null && local24.anInt1522 > 0) {
				local24.anInt1522--;
				if (local24.anInt1522 == 0) {
					local24.aClass5_758 = null;
				}
			}
		}
		for (local14 = 0; local14 < Static115.anInt2977; local14++) {
			@Pc(61) int local61 = Static36.anIntArray320[local14];
			@Pc(65) Class3_Sub1_Sub1_Sub1_Sub1 local65 = Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local61];
			if (local65 != null && local65.anInt1522 > 0) {
				local65.anInt1522--;
				if (local65.anInt1522 == 0) {
					local65.aClass5_758 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIII)V")
	public static void method1153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static18.method406(arg1)) {
			Static100.method1665(-1, arg2, 0, Static31.aClass3_Sub1_Sub17ArrayArray3[arg1], arg0, arg5, 0, arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)Lclient!qd;")
	public static Class3_Sub1_Sub14 method1155(@OriginalArg(0) int arg0) {
		@Pc(11) Class3_Sub1_Sub14 local11 = (Class3_Sub1_Sub14) Static44.aClass9_13.method282((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(25) byte[] local25 = Static19.aClass11_13.method1882(4, arg0);
		local11 = new Class3_Sub1_Sub14();
		if (local25 != null) {
			local11.method1499(new Class3_Sub6(local25), arg0);
		}
		local11.method1497();
		Static44.aClass9_13.method284(local11, (long) arg0);
		return local11;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Lclient!tc;")
	public static Class3_Sub1_Sub16 method1159(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub1_Sub16 local10 = (Class3_Sub1_Sub16) Static80.aClass9_20.method282((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static43.aClass11_25.method1882(16, arg0);
		local10 = new Class3_Sub1_Sub16();
		if (local28 != null) {
			local10.method1684(new Class3_Sub6(local28));
		}
		Static80.aClass9_20.method284(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(III)I")
	public static int method1160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(39) int local39 = Static48.method871(4, arg1 + 45365, arg0 + 91923) + (Static48.method871(2, arg1 + 10294, arg0 - -37821) - 128 >> 1) + (Static48.method871(1, arg1, arg0) + -128 >> 2) - 128;
		local39 = (int) ((double) local39 * 0.3D) + 35;
		if (local39 < 10) {
			local39 = 10;
		} else if (local39 > 60) {
			local39 = 60;
		}
		return local39;
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
	public static void method1161() {
		aClass5_816 = null;
		aClass5_819 = null;
		aClass5_815 = null;
		aClass5_814 = null;
		aClass5_818 = null;
		aClass5_817 = null;
		aClass5_820 = null;
		aClass5_821 = null;
		aClass3_Sub1_Sub2_Sub3Array10 = null;
	}
}
