import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!rd", name = "N", descriptor = "F")
	public static float aFloat44;

	@OriginalMember(owner = "client!rd", name = "R", descriptor = "[I")
	public static int[] anIntArray398;

	@OriginalMember(owner = "client!rd", name = "U", descriptor = "[[I")
	public static int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!rd", name = "M", descriptor = "Lclient!hi;")
	public static Class61 aClass61_25 = new Class61();

	@OriginalMember(owner = "client!rd", name = "S", descriptor = "I")
	public static int anInt4482 = 0;

	@OriginalMember(owner = "client!rd", name = "T", descriptor = "I")
	public static int anInt4483 = 0;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3545(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg4 - arg0;
		@Pc(13) int local13 = arg6 + arg0;
		@Pc(24) int local24 = arg3 - arg0;
		@Pc(26) int local26;
		for (local26 = arg6; local26 < local13; local26++) {
			Static126.method1523(Static22.anIntArrayArray3[local26], arg3, arg5, arg2);
		}
		@Pc(45) int local45 = arg2 + arg0;
		for (local26 = arg4; local26 > local9; local26--) {
			Static126.method1523(Static22.anIntArrayArray3[local26], arg3, arg5, arg2);
		}
		for (local26 = local13; local26 <= local9; local26++) {
			@Pc(74) int[] local74 = Static22.anIntArrayArray3[local26];
			Static126.method1523(local74, local45, arg5, arg2);
			Static126.method1523(local74, local24, arg1, local45);
			Static126.method1523(local74, arg3, arg5, local24);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)V")
	public static void method3547(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(13) int local13 = Static219.anIntArray387[arg0];
		@Pc(17) int local17 = Static61.aShortArray23[arg0];
		if (local17 >= 2000) {
			local17 -= 2000;
		}
		@Pc(29) int local29 = (int) Static152.aLongArray7[arg0];
		@Pc(33) long local33 = Static152.aLongArray7[arg0];
		@Pc(37) int local37 = Static164.anIntArray311[arg0];
		if (local17 == 38) {
			anInt4483 = Static249.anInt4936;
			Static216.anInt4283 = 0;
			Static170.anInt3632 = Static40.anInt1015;
			Static127.anInt2837 = 2;
			Static283.aClass1_Sub11_Sub1_3.method2697(166);
			Static283.aClass1_Sub11_Sub1_3.method2655(Static175.aBooleanArray34[82] ? 1 : 0);
			Static283.aClass1_Sub11_Sub1_3.method2640(Static53.anInt5288 + local13);
			Static283.aClass1_Sub11_Sub1_3.method2677(local29);
			Static283.aClass1_Sub11_Sub1_3.method2677(Static83.anInt1875 + local37);
		}
		if (local17 == 1005) {
			anInt4483 = Static249.anInt4936;
			Static170.anInt3632 = Static40.anInt1015;
			Static216.anInt4283 = 0;
			Static127.anInt2837 = 2;
			Static283.aClass1_Sub11_Sub1_3.method2697(203);
			Static283.aClass1_Sub11_Sub1_3.method2677(local29);
		}
		@Pc(116) Class14_Sub2_Sub2 local116;
		if (local17 == 3) {
			local116 = Static254.aClass14_Sub2_Sub2Array1[local29];
			if (local116 != null) {
				Static170.anInt3632 = Static40.anInt1015;
				Static216.anInt4283 = 0;
				Static127.anInt2837 = 2;
				anInt4483 = Static249.anInt4936;
				Static283.aClass1_Sub11_Sub1_3.method2697(126);
				Static283.aClass1_Sub11_Sub1_3.method2640(local29);
				Static283.aClass1_Sub11_Sub1_3.method2655(Static175.aBooleanArray34[82] ? 1 : 0);
			}
		}
		if (local17 == 33) {
			Static283.aClass1_Sub11_Sub1_3.method2697(106);
			Static283.aClass1_Sub11_Sub1_3.method2660(local13);
			Static283.aClass1_Sub11_Sub1_3.method2659(local37);
			Static283.aClass1_Sub11_Sub1_3.method2648(local29);
			Static93.anInt2134 = 0;
			Static199.aClass71_18 = Static56.method1058(local37);
			Static238.anInt3830 = local13;
		}
		if (local17 == 1) {
			Static283.aClass1_Sub11_Sub1_3.method2697(30);
			Static283.aClass1_Sub11_Sub1_3.method2659(local37);
			Static283.aClass1_Sub11_Sub1_3.method2677(local13);
			Static283.aClass1_Sub11_Sub1_3.method2677(local29);
			Static93.anInt2134 = 0;
			Static199.aClass71_18 = Static56.method1058(local37);
			Static238.anInt3830 = local13;
		}
		if (local17 == 43) {
			if (local29 == 0) {
				Static119.method2130(Static140.anInt3034, local13, local37);
			} else if (local29 == 1) {
				if (Static31.anInt745 > 0 && Static175.aBooleanArray34[82] && Static175.aBooleanArray34[81]) {
					Static259.method3977(local13 + Static53.anInt5288, Static83.anInt1875 + local37, Static140.anInt3034);
				} else {
					Static25.method523(local37, local13, 1);
					Static283.aClass1_Sub11_Sub1_3.method2655(Static283.anInt5399);
					Static283.aClass1_Sub11_Sub1_3.method2655(Static122.anInt3995);
					Static283.aClass1_Sub11_Sub1_3.method2660((int) Static298.aFloat58);
					Static283.aClass1_Sub11_Sub1_3.method2655(57);
					Static283.aClass1_Sub11_Sub1_3.method2655(Static245.anInt4881);
					Static283.aClass1_Sub11_Sub1_3.method2655(Static1.anInt4245);
					Static283.aClass1_Sub11_Sub1_3.method2655(89);
					Static283.aClass1_Sub11_Sub1_3.method2660(Static197.aClass14_Sub2_Sub1_2.anInt4680);
					Static283.aClass1_Sub11_Sub1_3.method2660(Static197.aClass14_Sub2_Sub1_2.anInt4630);
					Static283.aClass1_Sub11_Sub1_3.method2655(Static91.anInt2032);
					Static283.aClass1_Sub11_Sub1_3.method2655(63);
				}
			}
		}
		@Pc(326) Class71 local326;
		if (local17 == 28) {
			Static197.method3237();
			local326 = Static56.method1058(local37);
			Static91.anInt2041 = local13;
			Static236.anInt4598 = local29;
			Static105.anInt2467 = local37;
			Static191.anInt3934 = 1;
			Static160.method2779(local326);
			Static194.aString237 = "<col=ff9040>" + Static112.method2060(local29).aString87 + "<col=ffffff>";
			if (Static194.aString237 == null) {
				Static194.aString237 = "null";
			}
			return;
		}
		if (local17 == 1007) {
			Static216.anInt4283 = 0;
			Static170.anInt3632 = Static40.anInt1015;
			Static127.anInt2837 = 2;
			anInt4483 = Static249.anInt4936;
			local116 = Static254.aClass14_Sub2_Sub2Array1[local29];
			if (local116 != null) {
				@Pc(379) Class46 local379 = local116.aClass46_1;
				if (local379.anIntArray148 != null) {
					local379 = local379.method1283();
				}
				if (local379 != null) {
					Static283.aClass1_Sub11_Sub1_3.method2697(90);
					Static283.aClass1_Sub11_Sub1_3.method2640(local379.anInt1572);
				}
			}
		}
		if (local17 == 30) {
			Static127.anInt2837 = 2;
			Static170.anInt3632 = Static40.anInt1015;
			Static216.anInt4283 = 0;
			anInt4483 = Static249.anInt4936;
			Static283.aClass1_Sub11_Sub1_3.method2697(201);
			Static283.aClass1_Sub11_Sub1_3.method2677(local37 + Static83.anInt1875);
			Static283.aClass1_Sub11_Sub1_3.method2640(Static53.anInt5288 + local13);
			Static283.aClass1_Sub11_Sub1_3.method2648(local29);
			Static283.aClass1_Sub11_Sub1_3.method2633(Static175.aBooleanArray34[82] ? 1 : 0);
		}
		if (local17 == 4) {
			Static283.aClass1_Sub11_Sub1_3.method2697(44);
			Static283.aClass1_Sub11_Sub1_3.method2640(Static291.anInt5525);
			Static283.aClass1_Sub11_Sub1_3.method2648(local13);
			Static283.aClass1_Sub11_Sub1_3.method2677(local29);
			Static283.aClass1_Sub11_Sub1_3.method2651(local37);
			Static283.aClass1_Sub11_Sub1_3.method2651(Static90.anInt2022);
			Static93.anInt2134 = 0;
			Static199.aClass71_18 = Static56.method1058(local37);
			Static238.anInt3830 = local13;
		}
		if (local17 == 35) {
			local116 = Static254.aClass14_Sub2_Sub2Array1[local29];
			if (local116 != null) {
				Static127.anInt2837 = 2;
				Static216.anInt4283 = 0;
				anInt4483 = Static249.anInt4936;
				Static170.anInt3632 = Static40.anInt1015;
				Static283.aClass1_Sub11_Sub1_3.method2697(133);
				Static283.aClass1_Sub11_Sub1_3.method2633(Static175.aBooleanArray34[82] ? 1 : 0);
				Static283.aClass1_Sub11_Sub1_3.method2648(local29);
			}
		}
		if (local17 == 12) {
			local116 = Static254.aClass14_Sub2_Sub2Array1[local29];
			if (local116 != null) {
				anInt4483 = Static249.anInt4936;
				Static170.anInt3632 = Static40.anInt1015;
				Static127.anInt2837 = 2;
				Static216.anInt4283 = 0;
				Static283.aClass1_Sub11_Sub1_3.method2697(47);
				Static283.aClass1_Sub11_Sub1_3.method2660(local29);
				Static283.aClass1_Sub11_Sub1_3.method2655(Static175.aBooleanArray34[82] ? 1 : 0);
			}
		}
		if (local17 == 51) {
			Static127.anInt2837 = 2;
			Static216.anInt4283 = 0;
			Static170.anInt3632 = Static40.anInt1015;
			anInt4483 = Static249.anInt4936;
			Static283.aClass1_Sub11_Sub1_3.method2697(92);
			Static283.aClass1_Sub11_Sub1_3.method2660(local37 + Static83.anInt1875);
			Static283.aClass1_Sub11_Sub1_3.method2648(Integer.MAX_VALUE & (int) (local33 >>> 32));
			Static283.aClass1_Sub11_Sub1_3.method2677(Static53.anInt5288 + local13);
			Static283.aClass1_Sub11_Sub1_3.method2633(Static175.aBooleanArray34[82] ? 1 : 0);
		}
		if (local17 == 42) {
			anInt4483 = Static249.anInt4936;
			Static170.anInt3632 = Static40.anInt1015;
			Static127.anInt2837 = 2;
			Static216.anInt4283 = 0;
			Static283.aClass1_Sub11_Sub1_3.method2697(251);
			Static283.aClass1_Sub11_Sub1_3.method2640(Static291.anInt5525);
			Static283.aClass1_Sub11_Sub1_3.method2651(Static90.anInt2022);
			Static283.aClass1_Sub11_Sub1_3.method2677(Static53.anInt5288 + local13);
			Static283.aClass1_Sub11_Sub1_3.method2648(Integer.MAX_VALUE & (int) (local33 >>> 32));
			Static283.aClass1_Sub11_Sub1_3.method2633(Static175.aBooleanArray34[82] ? 1 : 0);
			Static283.aClass1_Sub11_Sub1_3.method2677(Static83.anInt1875 + local37);
		}
		@Pc(731) int local731;
		if (local17 == 29) {
			Static283.aClass1_Sub11_Sub1_3.method2697(192);
			Static283.aClass1_Sub11_Sub1_3.method2659(local37);
			local326 = Static56.method1058(local37);
			if (local326.anIntArrayArray8 != null && local326.anIntArrayArray8[0][0] == 5) {
				local731 = local326.anIntArrayArray8[0][1];
				Static128.anIntArray259[local731] = 1 - Static128.anIntArray259[local731];
				Static250.method3857(local731);
			}
		}
		if (local17 == 58) {
			Static170.anInt3632 = Static40.anInt1015;
			Static127.anInt2837 = 2;
			Static216.anInt4283 = 0;
			anInt4483 = Static249.anInt4936;
			Static283.aClass1_Sub11_Sub1_3.method2697(127);
			Static283.aClass1_Sub11_Sub1_3.method2640(Static53.anInt5288 + local13);
			Static283.aClass1_Sub11_Sub1_3.method2677(Static236.anInt4598);
			Static283.aClass1_Sub11_Sub1_3.method2640(Static83.anInt1875 + local37);
			Static283.aClass1_Sub11_Sub1_3.method2660(Static91.anInt2041);
			Static283.aClass1_Sub11_Sub1_3.method2659(Static105.anInt2467);
			Static283.aClass1_Sub11_Sub1_3.method2660(Integer.MAX_VALUE & (int) (local33 >>> 32));
			Static283.aClass1_Sub11_Sub1_3.method2668(Static175.aBooleanArray34[82] ? 1 : 0);
		}
		if (local17 == 46) {
			local326 = Static164.method2829(local37, local13);
			if (local326 != null) {
				Static197.method3237();
				@Pc(822) Class1_Sub15 local822 = Static36.method769(local326);
				Static139.method2338(local822.anInt1760, local326.anInt2662, local326.anInt2686, local13, local822.method1375(), local37);
				Static191.anInt3934 = 0;
				Static8.aString15 = Static286.method4316(local326);
				if (Static8.aString15 == null) {
					Static8.aString15 = "Null";
				}
				if (local326.aBoolean196) {
					Static170.aString213 = local326.aString154 + "<col=ffffff>";
				} else {
					Static170.aString213 = "<col=00ff00>" + local326.aString153 + "<col=ffffff>";
				}
			}
			return;
		}
		if (local17 == 8) {
			local116 = Static254.aClass14_Sub2_Sub2Array1[local29];
			if (local116 != null) {
				Static127.anInt2837 = 2;
				Static170.anInt3632 = Static40.anInt1015;
				Static216.anInt4283 = 0;
				anInt4483 = Static249.anInt4936;
				Static283.aClass1_Sub11_Sub1_3.method2697(140);
				Static283.aClass1_Sub11_Sub1_3.method2668(Static175.aBooleanArray34[82] ? 1 : 0);
				Static283.aClass1_Sub11_Sub1_3.method2648(local29);
			}
		}
		if (local17 == 60) {
			if (local29 == 0) {
				Static205.anInt4155 = 1;
				Static119.method2130(Static140.anInt3034, local13, local37);
			} else if (Static31.anInt745 > 0 && Static175.aBooleanArray34[82] && Static175.aBooleanArray34[81]) {
				Static259.method3977(Static53.anInt5288 + local13, Static83.anInt1875 - -local37, Static140.anInt3034);
			} else {
				Static283.aClass1_Sub11_Sub1_3.method2697(94);
				Static283.aClass1_Sub11_Sub1_3.method2648(Static53.anInt5288 + local13);
				Static283.aClass1_Sub11_Sub1_3.method2677(local37 + Static83.anInt1875);
			}
		}
		if (local17 == 45) {
			Static261.method4008();
		}
		if (local17 == 59) {
			Static216.anInt4283 = 0;
			Static170.anInt3632 = Static40.anInt1015;
			Static127.anInt2837 = 2;
			anInt4483 = Static249.anInt4936;
			Static283.aClass1_Sub11_Sub1_3.method2697(163);
			Static283.aClass1_Sub11_Sub1_3.method2640(local37 + Static83.anInt1875);
			Static283.aClass1_Sub11_Sub1_3.method2677(local29);
			Static283.aClass1_Sub11_Sub1_3.method2648(local13 + Static53.anInt5288);
			Static283.aClass1_Sub11_Sub1_3.method2645(Static175.aBooleanArray34[82] ? 1 : 0);
		}
		if (local17 == 21) {
			Static283.aClass1_Sub11_Sub1_3.method2697(129);
			Static283.aClass1_Sub11_Sub1_3.method2677(local13);
			Static283.aClass1_Sub11_Sub1_3.method2651(local37);
			Static283.aClass1_Sub11_Sub1_3.method2640(local29);
			Static93.anInt2134 = 0;
			Static199.aClass71_18 = Static56.method1058(local37);
			Static238.anInt3830 = local13;
		}
		@Pc(1081) Class14_Sub2_Sub1 local1081;
		if (local17 == 19) {
			local1081 = Static98.aClass14_Sub2_Sub1Array1[local29];
			if (local1081 != null) {
				anInt4483 = Static249.anInt4936;
				Static216.anInt4283 = 0;
				Static127.anInt2837 = 2;
				Static170.anInt3632 = Static40.anInt1015;
				Static283.aClass1_Sub11_Sub1_3.method2697(255);
				Static283.aClass1_Sub11_Sub1_3.method2655(Static175.aBooleanArray34[82] ? 1 : 0);
				Static283.aClass1_Sub11_Sub1_3.method2640(local29);
			}
		}
		if (local17 == 10) {
			Static283.aClass1_Sub11_Sub1_3.method2697(192);
			Static283.aClass1_Sub11_Sub1_3.method2659(local37);
			local326 = Static56.method1058(local37);
			if (local326.anIntArrayArray8 != null && local326.anIntArrayArray8[0][0] == 5) {
				local731 = local326.anIntArrayArray8[0][1];
				if (local326.anIntArray234[0] != Static128.anIntArray259[local731]) {
					Static128.anIntArray259[local731] = local326.anIntArray234[0];
					Static250.method3857(local731);
				}
			}
		}
		if (local17 == 6) {
			Static170.anInt3632 = Static40.anInt1015;
			anInt4483 = Static249.anInt4936;
			Static127.anInt2837 = 2;
			Static216.anInt4283 = 0;
			Static283.aClass1_Sub11_Sub1_3.method2697(220);
			Static283.aClass1_Sub11_Sub1_3.method2677(Static53.anInt5288 + local13);
			Static283.aClass1_Sub11_Sub1_3.method2645(Static175.aBooleanArray34[82] ? 1 : 0);
			Static283.aClass1_Sub11_Sub1_3.method2677(local29);
			Static283.aClass1_Sub11_Sub1_3.method2648(Static83.anInt1875 + local37);
		}
		if (local17 == 2) {
			local1081 = Static98.aClass14_Sub2_Sub1Array1[local29];
			if (local1081 != null) {
				Static216.anInt4283 = 0;
				Static127.anInt2837 = 2;
				Static170.anInt3632 = Static40.anInt1015;
				anInt4483 = Static249.anInt4936;
				Static283.aClass1_Sub11_Sub1_3.method2697(61);
				Static283.aClass1_Sub11_Sub1_3.method2668(Static175.aBooleanArray34[82] ? 1 : 0);
				Static283.aClass1_Sub11_Sub1_3.method2677(local29);
			}
		}
		if (local17 == 7) {
			local116 = Static254.aClass14_Sub2_Sub2Array1[local29];
			if (local116 != null) {
				anInt4483 = Static249.anInt4936;
				Static170.anInt3632 = Static40.anInt1015;
				Static127.anInt2837 = 2;
				Static216.anInt4283 = 0;
				Static283.aClass1_Sub11_Sub1_3.method2697(236);
				Static283.aClass1_Sub11_Sub1_3.method2640(local29);
				Static283.aClass1_Sub11_Sub1_3.method2633(Static175.aBooleanArray34[82] ? 1 : 0);
			}
		}
		if (local17 == 36) {
			Static283.aClass1_Sub11_Sub1_3.method2697(252);
			Static283.aClass1_Sub11_Sub1_3.method2658(local37);
			Static283.aClass1_Sub11_Sub1_3.method2677(Static91.anInt2041);
			Static283.aClass1_Sub11_Sub1_3.method2648(Static236.anInt4598);
			Static283.aClass1_Sub11_Sub1_3.method2677(local13);
			Static283.aClass1_Sub11_Sub1_3.method2670(Static105.anInt2467);
			Static283.aClass1_Sub11_Sub1_3.method2660(local29);
			Static93.anInt2134 = 0;
			Static199.aClass71_18 = Static56.method1058(local37);
			Static238.anInt3830 = local13;
		}
		if (local17 == 5) {
			local1081 = Static98.aClass14_Sub2_Sub1Array1[local29];
			if (local1081 != null) {
				Static127.anInt2837 = 2;
				anInt4483 = Static249.anInt4936;
				Static216.anInt4283 = 0;
				Static170.anInt3632 = Static40.anInt1015;
				Static283.aClass1_Sub11_Sub1_3.method2697(111);
				Static283.aClass1_Sub11_Sub1_3.method2648(local29);
				Static283.aClass1_Sub11_Sub1_3.method2645(Static175.aBooleanArray34[82] ? 1 : 0);
			}
		}
		if (local17 == 24) {
			Static283.aClass1_Sub11_Sub1_3.method2697(82);
			Static283.aClass1_Sub11_Sub1_3.method2660(local13);
			Static283.aClass1_Sub11_Sub1_3.method2640(local29);
			Static283.aClass1_Sub11_Sub1_3.method2670(local37);
			Static93.anInt2134 = 0;
			Static199.aClass71_18 = Static56.method1058(local37);
			Static238.anInt3830 = local13;
		}
		if (local17 == 22) {
			Static283.aClass1_Sub11_Sub1_3.method2697(34);
			Static283.aClass1_Sub11_Sub1_3.method2677(local13);
			Static283.aClass1_Sub11_Sub1_3.method2677(local29);
			Static283.aClass1_Sub11_Sub1_3.method2670(local37);
			Static93.anInt2134 = 0;
			Static199.aClass71_18 = Static56.method1058(local37);
			Static238.anInt3830 = local13;
		}
		if (local17 == 57) {
			local116 = Static254.aClass14_Sub2_Sub2Array1[local29];
			if (local116 != null) {
				Static127.anInt2837 = 2;
				Static170.anInt3632 = Static40.anInt1015;
				Static216.anInt4283 = 0;
				anInt4483 = Static249.anInt4936;
				Static283.aClass1_Sub11_Sub1_3.method2697(100);
				Static283.aClass1_Sub11_Sub1_3.method2668(Static175.aBooleanArray34[82] ? 1 : 0);
				Static283.aClass1_Sub11_Sub1_3.method2648(Static91.anInt2041);
				Static283.aClass1_Sub11_Sub1_3.method2677(Static236.anInt4598);
				Static283.aClass1_Sub11_Sub1_3.method2659(Static105.anInt2467);
				Static283.aClass1_Sub11_Sub1_3.method2640(local29);
			}
		}
		if (local17 == 18) {
			Static127.anInt2837 = 2;
			anInt4483 = Static249.anInt4936;
			Static170.anInt3632 = Static40.anInt1015;
			Static216.anInt4283 = 0;
			Static283.aClass1_Sub11_Sub1_3.method2697(49);
			Static283.aClass1_Sub11_Sub1_3.method2660(local37 + Static83.anInt1875);
			Static283.aClass1_Sub11_Sub1_3.method2677(local13 + Static53.anInt5288);
			Static283.aClass1_Sub11_Sub1_3.method2668(Static175.aBooleanArray34[82] ? 1 : 0);
			Static283.aClass1_Sub11_Sub1_3.method2660(Integer.MAX_VALUE & (int) (local33 >>> 32));
		}
		if (local17 == 20) {
			local1081 = Static98.aClass14_Sub2_Sub1Array1[local29];
			if (local1081 != null) {
				Static216.anInt4283 = 0;
				anInt4483 = Static249.anInt4936;
				Static170.anInt3632 = Static40.anInt1015;
				Static127.anInt2837 = 2;
				Static283.aClass1_Sub11_Sub1_3.method2697(227);
				Static283.aClass1_Sub11_Sub1_3.method2655(Static175.aBooleanArray34[82] ? 1 : 0);
				Static283.aClass1_Sub11_Sub1_3.method2677(Static291.anInt5525);
				Static283.aClass1_Sub11_Sub1_3.method2670(Static90.anInt2022);
				Static283.aClass1_Sub11_Sub1_3.method2648(local29);
			}
		}
		if (local17 == 9) {
			local1081 = Static98.aClass14_Sub2_Sub1Array1[local29];
			if (local1081 != null) {
				Static170.anInt3632 = Static40.anInt1015;
				Static216.anInt4283 = 0;
				anInt4483 = Static249.anInt4936;
				Static127.anInt2837 = 2;
				Static283.aClass1_Sub11_Sub1_3.method2697(249);
				Static283.aClass1_Sub11_Sub1_3.method2660(local29);
				Static283.aClass1_Sub11_Sub1_3.method2668(Static175.aBooleanArray34[82] ? 1 : 0);
			}
		}
		if (local17 == 1001) {
			Static127.anInt2837 = 2;
			Static170.anInt3632 = Static40.anInt1015;
			Static216.anInt4283 = 0;
			anInt4483 = Static249.anInt4936;
			Static283.aClass1_Sub11_Sub1_3.method2697(138);
			Static283.aClass1_Sub11_Sub1_3.method2677(local29);
		}
		if (local17 == 49) {
			local116 = Static254.aClass14_Sub2_Sub2Array1[local29];
			if (local116 != null) {
				anInt4483 = Static249.anInt4936;
				Static127.anInt2837 = 2;
				Static216.anInt4283 = 0;
				Static170.anInt3632 = Static40.anInt1015;
				Static283.aClass1_Sub11_Sub1_3.method2697(37);
				Static283.aClass1_Sub11_Sub1_3.method2648(Static291.anInt5525);
				Static283.aClass1_Sub11_Sub1_3.method2645(Static175.aBooleanArray34[82] ? 1 : 0);
				Static283.aClass1_Sub11_Sub1_3.method2670(Static90.anInt2022);
				Static283.aClass1_Sub11_Sub1_3.method2677(local29);
			}
		}
		if (local17 == 34) {
			local1081 = Static98.aClass14_Sub2_Sub1Array1[local29];
			if (local1081 != null) {
				Static127.anInt2837 = 2;
				anInt4483 = Static249.anInt4936;
				Static216.anInt4283 = 0;
				Static170.anInt3632 = Static40.anInt1015;
				Static283.aClass1_Sub11_Sub1_3.method2697(234);
				Static283.aClass1_Sub11_Sub1_3.method2640(local29);
				Static283.aClass1_Sub11_Sub1_3.method2655(Static175.aBooleanArray34[82] ? 1 : 0);
			}
		}
		if (local17 == 23) {
			Static283.aClass1_Sub11_Sub1_3.method2697(243);
			Static283.aClass1_Sub11_Sub1_3.method2660(local13);
			Static283.aClass1_Sub11_Sub1_3.method2651(local37);
			Static283.aClass1_Sub11_Sub1_3.method2640(local29);
			Static93.anInt2134 = 0;
			Static199.aClass71_18 = Static56.method1058(local37);
			Static238.anInt3830 = local13;
		}
		if (local17 == 16) {
			Static127.anInt2837 = 2;
			Static170.anInt3632 = Static40.anInt1015;
			anInt4483 = Static249.anInt4936;
			Static216.anInt4283 = 0;
			Static283.aClass1_Sub11_Sub1_3.method2697(107);
			Static283.aClass1_Sub11_Sub1_3.method2633(Static175.aBooleanArray34[82] ? 1 : 0);
			Static283.aClass1_Sub11_Sub1_3.method2640(local37 + Static83.anInt1875);
			Static283.aClass1_Sub11_Sub1_3.method2660((int) (local33 >>> 32) & Integer.MAX_VALUE);
			Static283.aClass1_Sub11_Sub1_3.method2648(Static53.anInt5288 + local13);
		}
		if (local17 == 44) {
			Static283.aClass1_Sub11_Sub1_3.method2697(59);
			Static283.aClass1_Sub11_Sub1_3.method2677(local13);
			Static283.aClass1_Sub11_Sub1_3.method2658(local37);
			Static283.aClass1_Sub11_Sub1_3.method2660(local29);
			Static93.anInt2134 = 0;
			Static199.aClass71_18 = Static56.method1058(local37);
			Static238.anInt3830 = local13;
		}
		if (local17 == 47) {
			if (local29 == 0) {
				Static117.anInt2670 = 1;
				Static119.method2130(Static140.anInt3034, local13, local37);
			} else if (local29 == 1) {
				Static283.aClass1_Sub11_Sub1_3.method2697(142);
				Static283.aClass1_Sub11_Sub1_3.method2648(Static53.anInt5288 + local13);
				Static283.aClass1_Sub11_Sub1_3.method2648(local37 + Static83.anInt1875);
				Static283.aClass1_Sub11_Sub1_3.method2648(Static291.anInt5525);
				Static283.aClass1_Sub11_Sub1_3.method2670(Static90.anInt2022);
			}
		}
		if (local17 == 25) {
			Static283.aClass1_Sub11_Sub1_3.method2697(219);
			Static283.aClass1_Sub11_Sub1_3.method2658(local37);
			Static283.aClass1_Sub11_Sub1_3.method2677(local13);
			Static283.aClass1_Sub11_Sub1_3.method2677(local29);
			Static93.anInt2134 = 0;
			Static199.aClass71_18 = Static56.method1058(local37);
			Static238.anInt3830 = local13;
		}
		if (local17 == 37) {
			Static170.anInt3632 = Static40.anInt1015;
			Static216.anInt4283 = 0;
			Static127.anInt2837 = 2;
			anInt4483 = Static249.anInt4936;
			Static283.aClass1_Sub11_Sub1_3.method2697(187);
			Static283.aClass1_Sub11_Sub1_3.method2660(Static53.anInt5288 + local13);
			Static283.aClass1_Sub11_Sub1_3.method2645(Static175.aBooleanArray34[82] ? 1 : 0);
			Static283.aClass1_Sub11_Sub1_3.method2640(local37 + Static83.anInt1875);
			Static283.aClass1_Sub11_Sub1_3.method2648((int) (local33 >>> 32) & Integer.MAX_VALUE);
		}
		if (local17 == 26) {
			local1081 = Static98.aClass14_Sub2_Sub1Array1[local29];
			if (local1081 != null) {
				Static127.anInt2837 = 2;
				Static216.anInt4283 = 0;
				Static170.anInt3632 = Static40.anInt1015;
				anInt4483 = Static249.anInt4936;
				Static283.aClass1_Sub11_Sub1_3.method2697(213);
				Static283.aClass1_Sub11_Sub1_3.method2645(Static175.aBooleanArray34[82] ? 1 : 0);
				Static283.aClass1_Sub11_Sub1_3.method2677(Static236.anInt4598);
				Static283.aClass1_Sub11_Sub1_3.method2651(Static105.anInt2467);
				Static283.aClass1_Sub11_Sub1_3.method2640(Static91.anInt2041);
				Static283.aClass1_Sub11_Sub1_3.method2640(local29);
			}
		}
		if (local17 == 17) {
			Static283.aClass1_Sub11_Sub1_3.method2697(215);
			Static283.aClass1_Sub11_Sub1_3.method2640(local13);
			Static283.aClass1_Sub11_Sub1_3.method2670(local37);
			Static283.aClass1_Sub11_Sub1_3.method2660(local29);
			Static93.anInt2134 = 0;
			Static199.aClass71_18 = Static56.method1058(local37);
			Static238.anInt3830 = local13;
		}
		if (local17 == 15) {
			local1081 = Static98.aClass14_Sub2_Sub1Array1[local29];
			if (local1081 != null) {
				Static216.anInt4283 = 0;
				Static127.anInt2837 = 2;
				anInt4483 = Static249.anInt4936;
				Static170.anInt3632 = Static40.anInt1015;
				Static283.aClass1_Sub11_Sub1_3.method2697(230);
				Static283.aClass1_Sub11_Sub1_3.method2677(local29);
				Static283.aClass1_Sub11_Sub1_3.method2645(Static175.aBooleanArray34[82] ? 1 : 0);
			}
		}
		if (local17 == 50 && Static3.aClass71_1 == null) {
			Static245.method3810(local37, local13);
			Static3.aClass71_1 = Static164.method2829(local37, local13);
			Static160.method2779(Static3.aClass71_1);
		}
		if (local17 == 39) {
			Static170.anInt3632 = Static40.anInt1015;
			anInt4483 = Static249.anInt4936;
			Static216.anInt4283 = 0;
			Static127.anInt2837 = 2;
			Static283.aClass1_Sub11_Sub1_3.method2697(33);
			Static283.aClass1_Sub11_Sub1_3.method2677(Static236.anInt4598);
			Static283.aClass1_Sub11_Sub1_3.method2648(Static83.anInt1875 + local37);
			Static283.aClass1_Sub11_Sub1_3.method2660(Static53.anInt5288 + local13);
			Static283.aClass1_Sub11_Sub1_3.method2648(local29);
			Static283.aClass1_Sub11_Sub1_3.method2651(Static105.anInt2467);
			Static283.aClass1_Sub11_Sub1_3.method2645(Static175.aBooleanArray34[82] ? 1 : 0);
			Static283.aClass1_Sub11_Sub1_3.method2648(Static91.anInt2041);
		}
		if (local17 == 1006) {
			Static127.anInt2837 = 2;
			anInt4483 = Static249.anInt4936;
			Static216.anInt4283 = 0;
			Static170.anInt3632 = Static40.anInt1015;
			Static283.aClass1_Sub11_Sub1_3.method2697(19);
			Static283.aClass1_Sub11_Sub1_3.method2648((int) (local33 >>> 32) & Integer.MAX_VALUE);
			Static283.aClass1_Sub11_Sub1_3.method2648(Static53.anInt5288 + local13);
			Static283.aClass1_Sub11_Sub1_3.method2648(Static83.anInt1875 + local37);
			Static283.aClass1_Sub11_Sub1_3.method2645(Static175.aBooleanArray34[82] ? 1 : 0);
		}
		if (local17 == 32) {
			anInt4483 = Static249.anInt4936;
			Static216.anInt4283 = 0;
			Static170.anInt3632 = Static40.anInt1015;
			Static127.anInt2837 = 2;
			Static283.aClass1_Sub11_Sub1_3.method2697(190);
			Static283.aClass1_Sub11_Sub1_3.method2668(Static175.aBooleanArray34[82] ? 1 : 0);
			Static283.aClass1_Sub11_Sub1_3.method2640(Static291.anInt5525);
			Static283.aClass1_Sub11_Sub1_3.method2640(local37 + Static83.anInt1875);
			Static283.aClass1_Sub11_Sub1_3.method2648(local29);
			Static283.aClass1_Sub11_Sub1_3.method2640(Static53.anInt5288 + local13);
			Static283.aClass1_Sub11_Sub1_3.method2659(Static90.anInt2022);
		}
		if (local17 == 13 || local17 == 1002) {
			Static142.method2350(local13, local37, Static266.aStringArray50[arg0], local29);
		}
		if (local17 == 31) {
			Static283.aClass1_Sub11_Sub1_3.method2697(160);
			Static283.aClass1_Sub11_Sub1_3.method2677(local13);
			Static283.aClass1_Sub11_Sub1_3.method2670(Static90.anInt2022);
			Static283.aClass1_Sub11_Sub1_3.method2651(local37);
			Static283.aClass1_Sub11_Sub1_3.method2648(Static291.anInt5525);
		}
		if (local17 == 11) {
			local1081 = Static98.aClass14_Sub2_Sub1Array1[local29];
			if (local1081 != null) {
				Static170.anInt3632 = Static40.anInt1015;
				anInt4483 = Static249.anInt4936;
				Static127.anInt2837 = 2;
				Static216.anInt4283 = 0;
				Static283.aClass1_Sub11_Sub1_3.method2697(139);
				Static283.aClass1_Sub11_Sub1_3.method2645(Static175.aBooleanArray34[82] ? 1 : 0);
				Static283.aClass1_Sub11_Sub1_3.method2677(local29);
			}
		}
		if (local17 == 1003) {
			local326 = Static56.method1058(local37);
			if (local326 == null || local326.anIntArray239[local13] < 100000) {
				Static283.aClass1_Sub11_Sub1_3.method2697(138);
				Static283.aClass1_Sub11_Sub1_3.method2677(local29);
			} else {
				Static196.method1924(0, local326.anIntArray239[local13] + " x " + Static112.method2060(local29).aString87, "");
			}
			Static93.anInt2134 = 0;
			Static199.aClass71_18 = Static56.method1058(local37);
			Static238.anInt3830 = local13;
		}
		if (local17 == 48) {
			local1081 = Static98.aClass14_Sub2_Sub1Array1[local29];
			if (local1081 != null) {
				Static216.anInt4283 = 0;
				anInt4483 = Static249.anInt4936;
				Static170.anInt3632 = Static40.anInt1015;
				Static127.anInt2837 = 2;
				Static283.aClass1_Sub11_Sub1_3.method2697(169);
				Static283.aClass1_Sub11_Sub1_3.method2648(local29);
				Static283.aClass1_Sub11_Sub1_3.method2633(Static175.aBooleanArray34[82] ? 1 : 0);
			}
		}
		if (local17 == 41) {
			Static283.aClass1_Sub11_Sub1_3.method2697(244);
			Static283.aClass1_Sub11_Sub1_3.method2659(local37);
			Static283.aClass1_Sub11_Sub1_3.method2660(local29);
			Static283.aClass1_Sub11_Sub1_3.method2640(local13);
			Static93.anInt2134 = 0;
			Static199.aClass71_18 = Static56.method1058(local37);
			Static238.anInt3830 = local13;
		}
		if (local17 == 40) {
			Static170.anInt3632 = Static40.anInt1015;
			anInt4483 = Static249.anInt4936;
			Static127.anInt2837 = 2;
			Static216.anInt4283 = 0;
			Static283.aClass1_Sub11_Sub1_3.method2697(130);
			Static283.aClass1_Sub11_Sub1_3.method2655(Static175.aBooleanArray34[82] ? 1 : 0);
			Static283.aClass1_Sub11_Sub1_3.method2677(local29);
			Static283.aClass1_Sub11_Sub1_3.method2640(Static53.anInt5288 + local13);
			Static283.aClass1_Sub11_Sub1_3.method2660(Static83.anInt1875 + local37);
		}
		if (local17 == 14) {
			local326 = Static56.method1058(local37);
			@Pc(2633) boolean local2633 = true;
			if (local326.anInt2713 > 0) {
				local2633 = Static93.method1673(local326);
			}
			if (local2633) {
				Static283.aClass1_Sub11_Sub1_3.method2697(192);
				Static283.aClass1_Sub11_Sub1_3.method2659(local37);
			}
		}
		if (Static191.anInt3934 != 0) {
			Static191.anInt3934 = 0;
			Static160.method2779(Static56.method1058(Static105.anInt2467));
		}
		if (Static125.aBoolean209) {
			Static197.method3237();
		}
		if (Static199.aClass71_18 != null && Static93.anInt2134 == 0) {
			Static160.method2779(Static199.aClass71_18);
		}
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)I")
	public static int method3548() {
		return Static202.anInt4103 == 0 ? 0 : Static281.anInterface1Array3[Static202.anInt4103].method4016();
	}
}
