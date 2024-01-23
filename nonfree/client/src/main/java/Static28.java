import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bm", name = "u", descriptor = "I")
	public static int anInt694;

	@OriginalMember(owner = "client!bm", name = "y", descriptor = "Lclient!pk;")
	public static Class132 aClass132_9;

	@OriginalMember(owner = "client!bm", name = "z", descriptor = "Lclient!pk;")
	public static Class132 aClass132_10;

	@OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
	public static int anInt690 = 0;

	@OriginalMember(owner = "client!bm", name = "H", descriptor = "Lclient!gd;")
	public static Class61 aClass61_4 = new Class61(200);

	@OriginalMember(owner = "client!bm", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString29 = "Take";

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)V")
	public static void method469(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static119.anInt2398 = Static140.anInt2782 + Static221.anInt4539 - arg0 - 1;
		Static64.anInt1385 = arg1 - Static220.anInt4522;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!pk;I)I")
	public static int method471(@OriginalArg(0) Class132 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method3166(Static60.anInt1298)) {
			local5++;
		}
		if (arg0.method3166(Static22.anInt617)) {
			local5++;
		}
		if (arg0.method3166(Static114.anInt2338)) {
			local5++;
		}
		if (arg0.method3166(Static77.anInt1675)) {
			local5++;
		}
		if (arg0.method3166(Static206.anInt4276)) {
			local5++;
		}
		if (arg0.method3166(Static167.anInt3365)) {
			local5++;
		}
		if (arg0.method3166(Static234.anInt4712)) {
			local5++;
		}
		if (arg0.method3166(Static121.anInt2429)) {
			local5++;
		}
		if (arg0.method3166(Static201.anInt4151)) {
			local5++;
		}
		if (arg0.method3166(Static270.anInt5335)) {
			local5++;
		}
		if (arg0.method3166(Static130.anInt2597)) {
			local5++;
		}
		if (arg0.method3166(Static97.anInt2004)) {
			local5++;
		}
		if (arg0.method3166(Static145.anInt2862)) {
			local5++;
		}
		if (arg0.method3166(Static76.anInt1639)) {
			local5++;
		}
		if (arg0.method3166(Static189.anInt3787)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIII)Z")
	public static boolean method472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static125.method1985(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static124.method1979(local10 + 1, Static195.anIntArrayArrayArray7[arg0][arg1][arg2] + arg3, local14 + 1) && Static124.method1979(local10 + 128 - 1, Static195.anIntArrayArrayArray7[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static124.method1979(local10 + 128 - 1, Static195.anIntArrayArrayArray7[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static124.method1979(local10 + 1, Static195.anIntArrayArrayArray7[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;IIJS)V")
	public static void method477(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(6) long arg5, @OriginalArg(7) short arg6) {
		if (Static147.aBoolean246 || Static185.anInt3679 >= 500) {
			return;
		}
		Static57.aStringArray19[Static185.anInt3679] = arg1;
		Static161.aStringArray47[Static185.anInt3679] = arg3;
		Static65.anIntArray476[Static185.anInt3679] = arg4 == -1 ? Static9.anInt85 : arg4;
		Static204.aShortArray34[Static185.anInt3679] = arg6;
		Static95.aLongArray6[Static185.anInt3679] = arg5;
		Static243.anIntArray368[Static185.anInt3679] = arg0;
		Static190.anIntArray283[Static185.anInt3679] = arg2;
		Static185.anInt3679++;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(BI)V")
	public static void method479(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(12) int local12 = Static243.anIntArray368[arg0];
		@Pc(16) int local16 = Static190.anIntArray283[arg0];
		@Pc(20) int local20 = Static204.aShortArray34[arg0];
		if (local20 >= 2000) {
			local20 -= 2000;
		}
		@Pc(29) int local29 = (int) Static95.aLongArray6[arg0];
		@Pc(33) long local33 = Static95.aLongArray6[arg0];
		@Pc(53) Class159 local53;
		if (local20 == 8) {
			Static66.aClass8_Sub2_Sub1_4.method2398(145);
			Static66.aClass8_Sub2_Sub1_4.method2330(local16);
			local53 = Static82.method1361(local16);
			if (local53.anIntArrayArray35 != null && local53.anIntArrayArray35[0][0] == 5) {
				@Pc(73) int local73 = local53.anIntArrayArray35[0][1];
				if (Static8.anIntArray495[local73] != local53.anIntArray396[0]) {
					Static8.anIntArray495[local73] = local53.anIntArray396[0];
					Static20.method357(local73);
				}
			}
		}
		if (local20 == 13) {
			Static66.aClass8_Sub2_Sub1_4.method2398(164);
			Static66.aClass8_Sub2_Sub1_4.method2333(local12);
			Static66.aClass8_Sub2_Sub1_4.method2371(local16);
			Static66.aClass8_Sub2_Sub1_4.method2363(local29);
			Static139.anInt2774 = 0;
			Static293.aClass159_20 = Static82.method1361(local16);
			Static182.anInt3570 = local12;
		}
		@Pc(135) Class36_Sub3_Sub1 local135;
		if (local20 == 48) {
			local135 = Static230.aClass36_Sub3_Sub1Array1[local29];
			if (local135 != null) {
				Static234.anInt4715 = Static59.anInt1292;
				Static187.anInt3758 = 0;
				Static180.anInt3530 = Static89.anInt1907;
				Static173.anInt3443 = 2;
				Static66.aClass8_Sub2_Sub1_4.method2398(85);
				Static66.aClass8_Sub2_Sub1_4.method2384(Static36.aBooleanArray2[82] ? 1 : 0);
				Static66.aClass8_Sub2_Sub1_4.method2345(local29);
			}
		}
		@Pc(178) Class36_Sub3_Sub2 local178;
		if (local20 == 11) {
			local178 = Static48.aClass36_Sub3_Sub2Array1[local29];
			if (local178 != null) {
				Static187.anInt3758 = 0;
				Static180.anInt3530 = Static89.anInt1907;
				Static173.anInt3443 = 2;
				Static234.anInt4715 = Static59.anInt1292;
				Static66.aClass8_Sub2_Sub1_4.method2398(6);
				Static66.aClass8_Sub2_Sub1_4.method2345(local29);
				Static66.aClass8_Sub2_Sub1_4.method2340(Static36.aBooleanArray2[82] ? 1 : 0);
				Static66.aClass8_Sub2_Sub1_4.method2326(Static106.anInt2200);
				Static66.aClass8_Sub2_Sub1_4.method2366(Static132.anInt2621);
			}
		}
		if (local20 == 24) {
			local53 = Static82.method1361(local16);
			@Pc(228) boolean local228 = true;
			if (local53.anInt5188 > 0) {
				local228 = Static227.method3512(local53);
			}
			if (local228) {
				Static66.aClass8_Sub2_Sub1_4.method2398(145);
				Static66.aClass8_Sub2_Sub1_4.method2330(local16);
			}
		}
		if (local20 == 49) {
			local178 = Static48.aClass36_Sub3_Sub2Array1[local29];
			if (local178 != null) {
				Static180.anInt3530 = Static89.anInt1907;
				Static234.anInt4715 = Static59.anInt1292;
				Static187.anInt3758 = 0;
				Static173.anInt3443 = 2;
				Static66.aClass8_Sub2_Sub1_4.method2398(82);
				Static66.aClass8_Sub2_Sub1_4.method2333(local29);
				Static66.aClass8_Sub2_Sub1_4.method2340(Static36.aBooleanArray2[82] ? 1 : 0);
			}
		}
		if (local20 == 35) {
			Static66.aClass8_Sub2_Sub1_4.method2398(121);
			Static66.aClass8_Sub2_Sub1_4.method2366(local12);
			Static66.aClass8_Sub2_Sub1_4.method2371(local16);
			Static66.aClass8_Sub2_Sub1_4.method2345(local29);
			Static139.anInt2774 = 0;
			Static293.aClass159_20 = Static82.method1361(local16);
			Static182.anInt3570 = local12;
		}
		if (local20 == 58) {
			if (local29 == 0) {
				Static55.anInt1229 = 1;
				Static22.method404(Static34.anInt770, local12, local16);
			} else if (local29 == 1) {
				Static66.aClass8_Sub2_Sub1_4.method2398(229);
				Static66.aClass8_Sub2_Sub1_4.method2345(local12 + Static49.anInt1089);
				Static66.aClass8_Sub2_Sub1_4.method2330(Static106.anInt2200);
				Static66.aClass8_Sub2_Sub1_4.method2363(Static130.anInt2601 + local16);
				Static66.aClass8_Sub2_Sub1_4.method2366(Static132.anInt2621);
			}
		}
		if (local20 == 50) {
			local135 = Static230.aClass36_Sub3_Sub1Array1[local29];
			if (local135 != null) {
				Static234.anInt4715 = Static59.anInt1292;
				Static187.anInt3758 = 0;
				Static180.anInt3530 = Static89.anInt1907;
				Static173.anInt3443 = 2;
				Static66.aClass8_Sub2_Sub1_4.method2398(103);
				Static66.aClass8_Sub2_Sub1_4.method2366(local29);
				Static66.aClass8_Sub2_Sub1_4.method2384(Static36.aBooleanArray2[82] ? 1 : 0);
			}
		}
		if (local20 == 33) {
			Static66.aClass8_Sub2_Sub1_4.method2398(29);
			Static66.aClass8_Sub2_Sub1_4.method2345(local12);
			Static66.aClass8_Sub2_Sub1_4.method2329(local16);
			Static66.aClass8_Sub2_Sub1_4.method2366(local29);
			Static139.anInt2774 = 0;
			Static293.aClass159_20 = Static82.method1361(local16);
			Static182.anInt3570 = local12;
		}
		if (local20 == 47) {
			local135 = Static230.aClass36_Sub3_Sub1Array1[local29];
			if (local135 != null) {
				Static187.anInt3758 = 0;
				Static180.anInt3530 = Static89.anInt1907;
				Static173.anInt3443 = 2;
				Static234.anInt4715 = Static59.anInt1292;
				Static66.aClass8_Sub2_Sub1_4.method2398(172);
				Static66.aClass8_Sub2_Sub1_4.method2345(local29);
				Static66.aClass8_Sub2_Sub1_4.method2368(Static36.aBooleanArray2[82] ? 1 : 0);
			}
		}
		if (local20 == 43) {
			Static66.aClass8_Sub2_Sub1_4.method2398(201);
			Static66.aClass8_Sub2_Sub1_4.method2371(local16);
			Static66.aClass8_Sub2_Sub1_4.method2366(local29);
			Static66.aClass8_Sub2_Sub1_4.method2366(local12);
			Static139.anInt2774 = 0;
			Static293.aClass159_20 = Static82.method1361(local16);
			Static182.anInt3570 = local12;
		}
		if (local20 == 29) {
			Static66.aClass8_Sub2_Sub1_4.method2398(92);
			Static66.aClass8_Sub2_Sub1_4.method2330(local16);
			Static66.aClass8_Sub2_Sub1_4.method2333(Static63.anInt1379);
			Static66.aClass8_Sub2_Sub1_4.method2345(Static244.anInt4874);
			Static66.aClass8_Sub2_Sub1_4.method2329(Static274.anInt5395);
			Static66.aClass8_Sub2_Sub1_4.method2345(local29);
			Static66.aClass8_Sub2_Sub1_4.method2363(local12);
			Static139.anInt2774 = 0;
			Static293.aClass159_20 = Static82.method1361(local16);
			Static182.anInt3570 = local12;
		}
		if (local20 == 44) {
			Static187.anInt3758 = 0;
			Static173.anInt3443 = 2;
			Static234.anInt4715 = Static59.anInt1292;
			Static180.anInt3530 = Static89.anInt1907;
			Static66.aClass8_Sub2_Sub1_4.method2398(125);
			Static66.aClass8_Sub2_Sub1_4.method2340(Static36.aBooleanArray2[82] ? 1 : 0);
			Static66.aClass8_Sub2_Sub1_4.method2366(local16 + Static130.anInt2601);
			Static66.aClass8_Sub2_Sub1_4.method2366(Static49.anInt1089 + local12);
			Static66.aClass8_Sub2_Sub1_4.method2363(local29);
		}
		if (local20 == 15) {
			Static66.aClass8_Sub2_Sub1_4.method2398(100);
			Static66.aClass8_Sub2_Sub1_4.method2333(local12);
			Static66.aClass8_Sub2_Sub1_4.method2345(local29);
			Static66.aClass8_Sub2_Sub1_4.method2371(local16);
			Static139.anInt2774 = 0;
			Static293.aClass159_20 = Static82.method1361(local16);
			Static182.anInt3570 = local12;
		}
		if (local20 == 42 || local20 == 1004) {
			Static89.method1446(local29, Static161.aStringArray47[arg0], local12, local16);
		}
		if (local20 == 21) {
			Static234.anInt4715 = Static59.anInt1292;
			Static187.anInt3758 = 0;
			Static180.anInt3530 = Static89.anInt1907;
			Static173.anInt3443 = 2;
			Static66.aClass8_Sub2_Sub1_4.method2398(9);
			Static66.aClass8_Sub2_Sub1_4.method2384(Static36.aBooleanArray2[82] ? 1 : 0);
			Static66.aClass8_Sub2_Sub1_4.method2363(local29);
			Static66.aClass8_Sub2_Sub1_4.method2363(Static49.anInt1089 + local12);
			Static66.aClass8_Sub2_Sub1_4.method2345(local16 + Static130.anInt2601);
		}
		if (local20 == 1003) {
			Static234.anInt4715 = Static59.anInt1292;
			Static173.anInt3443 = 2;
			Static180.anInt3530 = Static89.anInt1907;
			Static187.anInt3758 = 0;
			local178 = Static48.aClass36_Sub3_Sub2Array1[local29];
			if (local178 != null) {
				@Pc(738) Class173 local738 = local178.aClass173_1;
				if (local738.anIntArray491 != null) {
					local738 = local738.method4245();
				}
				if (local738 != null) {
					Static66.aClass8_Sub2_Sub1_4.method2398(136);
					Static66.aClass8_Sub2_Sub1_4.method2333(local738.anInt5632);
				}
			}
		}
		if (local20 == 31) {
			if (local29 == 0) {
				Static22.method404(Static34.anInt770, local12, local16);
			} else if (local29 == 1) {
				if (Static94.anInt1962 > 0 && Static36.aBooleanArray2[82] && Static36.aBooleanArray2[81]) {
					Static105.method1701(local12 + Static49.anInt1089, Static34.anInt770, local16 + Static130.anInt2601);
				} else {
					Static93.method1494(local16, local12, 1);
					Static66.aClass8_Sub2_Sub1_4.method2340(Static184.anInt3652);
					Static66.aClass8_Sub2_Sub1_4.method2340(Static147.anInt2994);
					Static66.aClass8_Sub2_Sub1_4.method2333((int) Static82.aFloat20);
					Static66.aClass8_Sub2_Sub1_4.method2340(57);
					Static66.aClass8_Sub2_Sub1_4.method2340(Static121.anInt2437);
					Static66.aClass8_Sub2_Sub1_4.method2340(Static2.anInt12);
					Static66.aClass8_Sub2_Sub1_4.method2340(89);
					Static66.aClass8_Sub2_Sub1_4.method2333(Static21.aClass36_Sub3_Sub1_1.anInt4117);
					Static66.aClass8_Sub2_Sub1_4.method2333(Static21.aClass36_Sub3_Sub1_1.anInt4118);
					Static66.aClass8_Sub2_Sub1_4.method2340(Static47.anInt1049);
					Static66.aClass8_Sub2_Sub1_4.method2340(63);
				}
			}
		}
		if (local20 == 26) {
			Static201.method3118();
		}
		if (local20 == 1001) {
			Static234.anInt4715 = Static59.anInt1292;
			Static187.anInt3758 = 0;
			Static180.anInt3530 = Static89.anInt1907;
			Static173.anInt3443 = 2;
			Static66.aClass8_Sub2_Sub1_4.method2398(242);
			Static66.aClass8_Sub2_Sub1_4.method2366(local29);
		}
		if (local20 == 12) {
			Static234.anInt4715 = Static59.anInt1292;
			Static180.anInt3530 = Static89.anInt1907;
			Static187.anInt3758 = 0;
			Static173.anInt3443 = 2;
			Static66.aClass8_Sub2_Sub1_4.method2398(155);
			Static66.aClass8_Sub2_Sub1_4.method2368(Static36.aBooleanArray2[82] ? 1 : 0);
			Static66.aClass8_Sub2_Sub1_4.method2345(local29);
			Static66.aClass8_Sub2_Sub1_4.method2363(local16 + Static130.anInt2601);
			Static66.aClass8_Sub2_Sub1_4.method2363(Static49.anInt1089 + local12);
		}
		if (local20 == 38) {
			local135 = Static230.aClass36_Sub3_Sub1Array1[local29];
			if (local135 != null) {
				Static234.anInt4715 = Static59.anInt1292;
				Static173.anInt3443 = 2;
				Static187.anInt3758 = 0;
				Static180.anInt3530 = Static89.anInt1907;
				Static66.aClass8_Sub2_Sub1_4.method2398(220);
				Static66.aClass8_Sub2_Sub1_4.method2368(Static36.aBooleanArray2[82] ? 1 : 0);
				Static66.aClass8_Sub2_Sub1_4.method2366(local29);
			}
		}
		if (local20 == 39) {
			local135 = Static230.aClass36_Sub3_Sub1Array1[local29];
			if (local135 != null) {
				Static234.anInt4715 = Static59.anInt1292;
				Static180.anInt3530 = Static89.anInt1907;
				Static187.anInt3758 = 0;
				Static173.anInt3443 = 2;
				Static66.aClass8_Sub2_Sub1_4.method2398(210);
				Static66.aClass8_Sub2_Sub1_4.method2356(Static36.aBooleanArray2[82] ? 1 : 0);
				Static66.aClass8_Sub2_Sub1_4.method2333(local29);
			}
		}
		if (local20 == 57) {
			Static187.anInt3758 = 0;
			Static173.anInt3443 = 2;
			Static234.anInt4715 = Static59.anInt1292;
			Static180.anInt3530 = Static89.anInt1907;
			Static66.aClass8_Sub2_Sub1_4.method2398(41);
			Static66.aClass8_Sub2_Sub1_4.method2345(Static244.anInt4874);
			Static66.aClass8_Sub2_Sub1_4.method2345(Static63.anInt1379);
			Static66.aClass8_Sub2_Sub1_4.method2356(Static36.aBooleanArray2[82] ? 1 : 0);
			Static66.aClass8_Sub2_Sub1_4.method2371(Static274.anInt5395);
			Static66.aClass8_Sub2_Sub1_4.method2345(Static130.anInt2601 + local16);
			Static66.aClass8_Sub2_Sub1_4.method2345(local12 + Static49.anInt1089);
			Static66.aClass8_Sub2_Sub1_4.method2345(Integer.MAX_VALUE & (int) (local33 >>> 32));
		}
		if (local20 == 5) {
			Static173.anInt3443 = 2;
			Static234.anInt4715 = Static59.anInt1292;
			Static187.anInt3758 = 0;
			Static180.anInt3530 = Static89.anInt1907;
			Static66.aClass8_Sub2_Sub1_4.method2398(106);
			Static66.aClass8_Sub2_Sub1_4.method2340(Static36.aBooleanArray2[82] ? 1 : 0);
			Static66.aClass8_Sub2_Sub1_4.method2333(local12 + Static49.anInt1089);
			Static66.aClass8_Sub2_Sub1_4.method2366(local16 + Static130.anInt2601);
			Static66.aClass8_Sub2_Sub1_4.method2363(Integer.MAX_VALUE & (int) (local33 >>> 32));
		}
		if (local20 == 1005) {
			Static234.anInt4715 = Static59.anInt1292;
			Static180.anInt3530 = Static89.anInt1907;
			Static187.anInt3758 = 0;
			Static173.anInt3443 = 2;
			Static66.aClass8_Sub2_Sub1_4.method2398(224);
			Static66.aClass8_Sub2_Sub1_4.method2333(local29);
		}
		if (local20 == 23) {
			Static234.anInt4715 = Static59.anInt1292;
			Static173.anInt3443 = 2;
			Static180.anInt3530 = Static89.anInt1907;
			Static187.anInt3758 = 0;
			Static66.aClass8_Sub2_Sub1_4.method2398(39);
			Static66.aClass8_Sub2_Sub1_4.method2356(Static36.aBooleanArray2[82] ? 1 : 0);
			Static66.aClass8_Sub2_Sub1_4.method2366(local12 + Static49.anInt1089);
			Static66.aClass8_Sub2_Sub1_4.method2366(Integer.MAX_VALUE & (int) (local33 >>> 32));
			Static66.aClass8_Sub2_Sub1_4.method2333(Static130.anInt2601 + local16);
		}
		if (local20 == 45) {
			if (local29 == 0) {
				Static92.anInt1948 = 1;
				Static22.method404(Static34.anInt770, local12, local16);
			} else if (Static94.anInt1962 > 0 && Static36.aBooleanArray2[82] && Static36.aBooleanArray2[81]) {
				Static105.method1701(Static49.anInt1089 + local12, Static34.anInt770, Static130.anInt2601 + local16);
			} else {
				Static66.aClass8_Sub2_Sub1_4.method2398(226);
				Static66.aClass8_Sub2_Sub1_4.method2363(local16 + Static130.anInt2601);
				Static66.aClass8_Sub2_Sub1_4.method2345(Static49.anInt1089 + local12);
			}
		}
		if (local20 == 4) {
			local178 = Static48.aClass36_Sub3_Sub2Array1[local29];
			if (local178 != null) {
				Static187.anInt3758 = 0;
				Static173.anInt3443 = 2;
				Static234.anInt4715 = Static59.anInt1292;
				Static180.anInt3530 = Static89.anInt1907;
				Static66.aClass8_Sub2_Sub1_4.method2398(2);
				Static66.aClass8_Sub2_Sub1_4.method2363(local29);
				Static66.aClass8_Sub2_Sub1_4.method2384(Static36.aBooleanArray2[82] ? 1 : 0);
			}
		}
		if (local20 == 1002) {
			Static187.anInt3758 = 0;
			Static234.anInt4715 = Static59.anInt1292;
			Static173.anInt3443 = 2;
			Static180.anInt3530 = Static89.anInt1907;
			Static66.aClass8_Sub2_Sub1_4.method2398(8);
			Static66.aClass8_Sub2_Sub1_4.method2345(Integer.MAX_VALUE & (int) (local33 >>> 32));
			Static66.aClass8_Sub2_Sub1_4.method2368(Static36.aBooleanArray2[82] ? 1 : 0);
			Static66.aClass8_Sub2_Sub1_4.method2345(local12 + Static49.anInt1089);
			Static66.aClass8_Sub2_Sub1_4.method2345(Static130.anInt2601 + local16);
		}
		if (local20 == 25 && Static272.aClass159_19 == null) {
			Static169.method2666(local16, local12);
			Static272.aClass159_19 = Static260.method3916(local12, local16);
			Static128.method2075(Static272.aClass159_19);
		}
		if (local20 == 51) {
			Static66.aClass8_Sub2_Sub1_4.method2398(232);
			Static66.aClass8_Sub2_Sub1_4.method2366(local12);
			Static66.aClass8_Sub2_Sub1_4.method2333(local29);
			Static66.aClass8_Sub2_Sub1_4.method2371(local16);
			Static139.anInt2774 = 0;
			Static293.aClass159_20 = Static82.method1361(local16);
			Static182.anInt3570 = local12;
		}
		if (local20 == 9) {
			local53 = Static260.method3916(local12, local16);
			if (local53 != null) {
				Static184.method2848();
				@Pc(1429) Class8_Sub24 local1429 = Static42.method668(local53);
				Static132.method2144(local53.anInt5148, local16, local12, local53.anInt5150, local1429.anInt4398, local1429.method3350());
				Static149.anInt3012 = 0;
				Static47.aString39 = Static91.method1475(local53);
				if (Static47.aString39 == null) {
					Static47.aString39 = "Null";
				}
				if (local53.aBoolean423) {
					Static153.aString105 = local53.aString178 + "<col=ffffff>";
				} else {
					Static153.aString105 = "<col=00ff00>" + local53.aString183 + "<col=ffffff>";
				}
			}
			return;
		}
		if (local20 == 41) {
			local135 = Static230.aClass36_Sub3_Sub1Array1[local29];
			if (local135 != null) {
				Static173.anInt3443 = 2;
				Static180.anInt3530 = Static89.anInt1907;
				Static187.anInt3758 = 0;
				Static234.anInt4715 = Static59.anInt1292;
				Static66.aClass8_Sub2_Sub1_4.method2398(37);
				Static66.aClass8_Sub2_Sub1_4.method2345(local29);
				Static66.aClass8_Sub2_Sub1_4.method2356(Static36.aBooleanArray2[82] ? 1 : 0);
			}
		}
		if (local20 == 1) {
			Static184.method2848();
			local53 = Static82.method1361(local16);
			Static63.anInt1379 = local29;
			Static274.anInt5395 = local16;
			Static244.anInt4874 = local12;
			Static149.anInt3012 = 1;
			Static128.method2075(local53);
			Static141.aString100 = "<col=ff9040>" + Static140.method2222(local29).aString13 + "<col=ffffff>";
			if (Static141.aString100 == null) {
				Static141.aString100 = "null";
			}
			return;
		}
		if (local20 == 19) {
			Static66.aClass8_Sub2_Sub1_4.method2398(27);
			Static66.aClass8_Sub2_Sub1_4.method2363(Static132.anInt2621);
			Static66.aClass8_Sub2_Sub1_4.method2326(Static106.anInt2200);
			Static66.aClass8_Sub2_Sub1_4.method2333(local12);
			Static66.aClass8_Sub2_Sub1_4.method2330(local16);
		}
		@Pc(1621) Class159 local1621;
		if (local20 == 32) {
			Static66.aClass8_Sub2_Sub1_4.method2398(145);
			Static66.aClass8_Sub2_Sub1_4.method2330(local16);
			local1621 = Static82.method1361(local16);
			if (local1621.anIntArrayArray35 != null && local1621.anIntArrayArray35[0][0] == 5) {
				@Pc(1640) int local1640 = local1621.anIntArrayArray35[0][1];
				Static8.anIntArray495[local1640] = 1 - Static8.anIntArray495[local1640];
				Static20.method357(local1640);
			}
		}
		if (local20 == 1006) {
			local1621 = Static82.method1361(local16);
			if (local1621 == null || local1621.anIntArray399[local12] < 100000) {
				Static66.aClass8_Sub2_Sub1_4.method2398(224);
				Static66.aClass8_Sub2_Sub1_4.method2333(local29);
			} else {
				Static47.method746(0, local1621.anIntArray399[local12] + " x " + Static140.method2222(local29).aString13, "");
			}
			Static139.anInt2774 = 0;
			Static293.aClass159_20 = Static82.method1361(local16);
			Static182.anInt3570 = local12;
		}
		if (local20 == 36) {
			Static66.aClass8_Sub2_Sub1_4.method2398(10);
			Static66.aClass8_Sub2_Sub1_4.method2363(local12);
			Static66.aClass8_Sub2_Sub1_4.method2363(local29);
			Static66.aClass8_Sub2_Sub1_4.method2330(local16);
			Static139.anInt2774 = 0;
			Static293.aClass159_20 = Static82.method1361(local16);
			Static182.anInt3570 = local12;
		}
		if (local20 == 17) {
			Static173.anInt3443 = 2;
			Static180.anInt3530 = Static89.anInt1907;
			Static187.anInt3758 = 0;
			Static234.anInt4715 = Static59.anInt1292;
			Static66.aClass8_Sub2_Sub1_4.method2398(78);
			Static66.aClass8_Sub2_Sub1_4.method2333(Static49.anInt1089 + local12);
			Static66.aClass8_Sub2_Sub1_4.method2340(Static36.aBooleanArray2[82] ? 1 : 0);
			Static66.aClass8_Sub2_Sub1_4.method2333(local16 + Static130.anInt2601);
			Static66.aClass8_Sub2_Sub1_4.method2345(Integer.MAX_VALUE & (int) (local33 >>> 32));
		}
		if (local20 == 14) {
			Static66.aClass8_Sub2_Sub1_4.method2398(184);
			Static66.aClass8_Sub2_Sub1_4.method2330(Static106.anInt2200);
			Static66.aClass8_Sub2_Sub1_4.method2333(local29);
			Static66.aClass8_Sub2_Sub1_4.method2366(Static132.anInt2621);
			Static66.aClass8_Sub2_Sub1_4.method2371(local16);
			Static66.aClass8_Sub2_Sub1_4.method2363(local12);
			Static139.anInt2774 = 0;
			Static293.aClass159_20 = Static82.method1361(local16);
			Static182.anInt3570 = local12;
		}
		if (local20 == 22) {
			Static234.anInt4715 = Static59.anInt1292;
			Static180.anInt3530 = Static89.anInt1907;
			Static187.anInt3758 = 0;
			Static173.anInt3443 = 2;
			Static66.aClass8_Sub2_Sub1_4.method2398(171);
			Static66.aClass8_Sub2_Sub1_4.method2345(local16 + Static130.anInt2601);
			Static66.aClass8_Sub2_Sub1_4.method2366(Integer.MAX_VALUE & (int) (local33 >>> 32));
			Static66.aClass8_Sub2_Sub1_4.method2333(Static49.anInt1089 + local12);
			Static66.aClass8_Sub2_Sub1_4.method2368(Static36.aBooleanArray2[82] ? 1 : 0);
		}
		@Pc(1892) Class36_Sub3_Sub2 local1892;
		if (local20 == 18) {
			local1892 = Static48.aClass36_Sub3_Sub2Array1[local29];
			if (local1892 != null) {
				Static187.anInt3758 = 0;
				Static173.anInt3443 = 2;
				Static180.anInt3530 = Static89.anInt1907;
				Static234.anInt4715 = Static59.anInt1292;
				Static66.aClass8_Sub2_Sub1_4.method2398(137);
				Static66.aClass8_Sub2_Sub1_4.method2333(Static244.anInt4874);
				Static66.aClass8_Sub2_Sub1_4.method2340(Static36.aBooleanArray2[82] ? 1 : 0);
				Static66.aClass8_Sub2_Sub1_4.method2371(Static274.anInt5395);
				Static66.aClass8_Sub2_Sub1_4.method2345(Static63.anInt1379);
				Static66.aClass8_Sub2_Sub1_4.method2333(local29);
			}
		}
		if (local20 == 10) {
			Static234.anInt4715 = Static59.anInt1292;
			Static187.anInt3758 = 0;
			Static173.anInt3443 = 2;
			Static180.anInt3530 = Static89.anInt1907;
			Static66.aClass8_Sub2_Sub1_4.method2398(216);
			Static66.aClass8_Sub2_Sub1_4.method2371(Static106.anInt2200);
			Static66.aClass8_Sub2_Sub1_4.method2333(Integer.MAX_VALUE & (int) (local33 >>> 32));
			Static66.aClass8_Sub2_Sub1_4.method2366(local16 + Static130.anInt2601);
			Static66.aClass8_Sub2_Sub1_4.method2345(Static49.anInt1089 + local12);
			Static66.aClass8_Sub2_Sub1_4.method2366(Static132.anInt2621);
			Static66.aClass8_Sub2_Sub1_4.method2368(Static36.aBooleanArray2[82] ? 1 : 0);
		}
		@Pc(2007) Class36_Sub3_Sub1 local2007;
		if (local20 == 16) {
			local2007 = Static230.aClass36_Sub3_Sub1Array1[local29];
			if (local2007 != null) {
				Static173.anInt3443 = 2;
				Static180.anInt3530 = Static89.anInt1907;
				Static234.anInt4715 = Static59.anInt1292;
				Static187.anInt3758 = 0;
				Static66.aClass8_Sub2_Sub1_4.method2398(140);
				Static66.aClass8_Sub2_Sub1_4.method2363(Static132.anInt2621);
				Static66.aClass8_Sub2_Sub1_4.method2366(local29);
				Static66.aClass8_Sub2_Sub1_4.method2371(Static106.anInt2200);
				Static66.aClass8_Sub2_Sub1_4.method2356(Static36.aBooleanArray2[82] ? 1 : 0);
			}
		}
		if (local20 == 20) {
			Static187.anInt3758 = 0;
			Static234.anInt4715 = Static59.anInt1292;
			Static173.anInt3443 = 2;
			Static180.anInt3530 = Static89.anInt1907;
			Static66.aClass8_Sub2_Sub1_4.method2398(250);
			Static66.aClass8_Sub2_Sub1_4.method2340(Static36.aBooleanArray2[82] ? 1 : 0);
			Static66.aClass8_Sub2_Sub1_4.method2345(Static132.anInt2621);
			Static66.aClass8_Sub2_Sub1_4.method2326(Static106.anInt2200);
			Static66.aClass8_Sub2_Sub1_4.method2345(local16 + Static130.anInt2601);
			Static66.aClass8_Sub2_Sub1_4.method2345(local29);
			Static66.aClass8_Sub2_Sub1_4.method2366(local12 + Static49.anInt1089);
		}
		if (local20 == 7) {
			Static187.anInt3758 = 0;
			Static180.anInt3530 = Static89.anInt1907;
			Static173.anInt3443 = 2;
			Static234.anInt4715 = Static59.anInt1292;
			Static66.aClass8_Sub2_Sub1_4.method2398(72);
			Static66.aClass8_Sub2_Sub1_4.method2371(Static274.anInt5395);
			Static66.aClass8_Sub2_Sub1_4.method2333(local29);
			Static66.aClass8_Sub2_Sub1_4.method2345(Static244.anInt4874);
			Static66.aClass8_Sub2_Sub1_4.method2345(Static130.anInt2601 + local16);
			Static66.aClass8_Sub2_Sub1_4.method2363(Static63.anInt1379);
			Static66.aClass8_Sub2_Sub1_4.method2363(local12 + Static49.anInt1089);
			Static66.aClass8_Sub2_Sub1_4.method2368(Static36.aBooleanArray2[82] ? 1 : 0);
		}
		if (local20 == 30) {
			local2007 = Static230.aClass36_Sub3_Sub1Array1[local29];
			if (local2007 != null) {
				Static173.anInt3443 = 2;
				Static234.anInt4715 = Static59.anInt1292;
				Static180.anInt3530 = Static89.anInt1907;
				Static187.anInt3758 = 0;
				Static66.aClass8_Sub2_Sub1_4.method2398(0);
				Static66.aClass8_Sub2_Sub1_4.method2333(local29);
				Static66.aClass8_Sub2_Sub1_4.method2340(Static36.aBooleanArray2[82] ? 1 : 0);
				Static66.aClass8_Sub2_Sub1_4.method2329(Static274.anInt5395);
				Static66.aClass8_Sub2_Sub1_4.method2363(Static244.anInt4874);
				Static66.aClass8_Sub2_Sub1_4.method2366(Static63.anInt1379);
			}
		}
		if (local20 == 59) {
			local2007 = Static230.aClass36_Sub3_Sub1Array1[local29];
			if (local2007 != null) {
				Static173.anInt3443 = 2;
				Static180.anInt3530 = Static89.anInt1907;
				Static187.anInt3758 = 0;
				Static234.anInt4715 = Static59.anInt1292;
				Static66.aClass8_Sub2_Sub1_4.method2398(79);
				Static66.aClass8_Sub2_Sub1_4.method2345(local29);
				Static66.aClass8_Sub2_Sub1_4.method2368(Static36.aBooleanArray2[82] ? 1 : 0);
			}
		}
		if (local20 == 46) {
			local1892 = Static48.aClass36_Sub3_Sub2Array1[local29];
			if (local1892 != null) {
				Static173.anInt3443 = 2;
				Static187.anInt3758 = 0;
				Static180.anInt3530 = Static89.anInt1907;
				Static234.anInt4715 = Static59.anInt1292;
				Static66.aClass8_Sub2_Sub1_4.method2398(221);
				Static66.aClass8_Sub2_Sub1_4.method2368(Static36.aBooleanArray2[82] ? 1 : 0);
				Static66.aClass8_Sub2_Sub1_4.method2366(local29);
			}
		}
		if (local20 == 2) {
			Static66.aClass8_Sub2_Sub1_4.method2398(143);
			Static66.aClass8_Sub2_Sub1_4.method2371(local16);
			Static66.aClass8_Sub2_Sub1_4.method2366(local29);
			Static66.aClass8_Sub2_Sub1_4.method2363(local12);
			Static139.anInt2774 = 0;
			Static293.aClass159_20 = Static82.method1361(local16);
			Static182.anInt3570 = local12;
		}
		if (local20 == 60) {
			Static180.anInt3530 = Static89.anInt1907;
			Static173.anInt3443 = 2;
			Static187.anInt3758 = 0;
			Static234.anInt4715 = Static59.anInt1292;
			Static66.aClass8_Sub2_Sub1_4.method2398(71);
			Static66.aClass8_Sub2_Sub1_4.method2366(local29);
			Static66.aClass8_Sub2_Sub1_4.method2368(Static36.aBooleanArray2[82] ? 1 : 0);
			Static66.aClass8_Sub2_Sub1_4.method2333(local12 + Static49.anInt1089);
			Static66.aClass8_Sub2_Sub1_4.method2363(local16 + Static130.anInt2601);
		}
		if (local20 == 3) {
			local1892 = Static48.aClass36_Sub3_Sub2Array1[local29];
			if (local1892 != null) {
				Static187.anInt3758 = 0;
				Static180.anInt3530 = Static89.anInt1907;
				Static173.anInt3443 = 2;
				Static234.anInt4715 = Static59.anInt1292;
				Static66.aClass8_Sub2_Sub1_4.method2398(42);
				Static66.aClass8_Sub2_Sub1_4.method2340(Static36.aBooleanArray2[82] ? 1 : 0);
				Static66.aClass8_Sub2_Sub1_4.method2333(local29);
			}
		}
		if (local20 == 28) {
			Static66.aClass8_Sub2_Sub1_4.method2398(196);
			Static66.aClass8_Sub2_Sub1_4.method2366(local29);
			Static66.aClass8_Sub2_Sub1_4.method2371(local16);
			Static66.aClass8_Sub2_Sub1_4.method2366(local12);
			Static139.anInt2774 = 0;
			Static293.aClass159_20 = Static82.method1361(local16);
			Static182.anInt3570 = local12;
		}
		if (local20 == 40) {
			Static173.anInt3443 = 2;
			Static180.anInt3530 = Static89.anInt1907;
			Static234.anInt4715 = Static59.anInt1292;
			Static187.anInt3758 = 0;
			Static66.aClass8_Sub2_Sub1_4.method2398(222);
			Static66.aClass8_Sub2_Sub1_4.method2384(Static36.aBooleanArray2[82] ? 1 : 0);
			Static66.aClass8_Sub2_Sub1_4.method2363(Static130.anInt2601 + local16);
			Static66.aClass8_Sub2_Sub1_4.method2333(Static49.anInt1089 + local12);
			Static66.aClass8_Sub2_Sub1_4.method2366(local29);
		}
		if (local20 == 37) {
			Static66.aClass8_Sub2_Sub1_4.method2398(129);
			Static66.aClass8_Sub2_Sub1_4.method2345(local29);
			Static66.aClass8_Sub2_Sub1_4.method2330(local16);
			Static66.aClass8_Sub2_Sub1_4.method2363(local12);
			Static139.anInt2774 = 0;
			Static293.aClass159_20 = Static82.method1361(local16);
			Static182.anInt3570 = local12;
		}
		if (local20 == 6) {
			local1892 = Static48.aClass36_Sub3_Sub2Array1[local29];
			if (local1892 != null) {
				Static173.anInt3443 = 2;
				Static187.anInt3758 = 0;
				Static234.anInt4715 = Static59.anInt1292;
				Static180.anInt3530 = Static89.anInt1907;
				Static66.aClass8_Sub2_Sub1_4.method2398(213);
				Static66.aClass8_Sub2_Sub1_4.method2363(local29);
				Static66.aClass8_Sub2_Sub1_4.method2340(Static36.aBooleanArray2[82] ? 1 : 0);
			}
		}
		if (local20 == 34) {
			local2007 = Static230.aClass36_Sub3_Sub1Array1[local29];
			if (local2007 != null) {
				Static180.anInt3530 = Static89.anInt1907;
				Static187.anInt3758 = 0;
				Static173.anInt3443 = 2;
				Static234.anInt4715 = Static59.anInt1292;
				Static66.aClass8_Sub2_Sub1_4.method2398(173);
				Static66.aClass8_Sub2_Sub1_4.method2340(Static36.aBooleanArray2[82] ? 1 : 0);
				Static66.aClass8_Sub2_Sub1_4.method2345(local29);
			}
		}
		if (Static149.anInt3012 != 0) {
			Static149.anInt3012 = 0;
			Static128.method2075(Static82.method1361(Static274.anInt5395));
		}
		if (Static215.aBoolean357) {
			Static184.method2848();
		}
		if (Static293.aClass159_20 != null && Static139.anInt2774 == 0) {
			Static128.method2075(Static293.aClass159_20);
		}
	}
}
