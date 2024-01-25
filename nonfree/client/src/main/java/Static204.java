import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!ho", name = "l", descriptor = "[I")
	public static int[] anIntArray282;

	@OriginalMember(owner = "client!ho", name = "k", descriptor = "Lclient!vw;")
	public static final Class340 aClass340_7 = new Class340();

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lclient!rt;III)V")
	public static void method3798(@OriginalArg(0) Class6_Sub42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null || arg0 == Static207.aClass211_29.aClass6_154) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt8288;
		@Pc(18) int local18 = arg0.anInt8284;
		@Pc(21) int local21 = arg0.anInt8285;
		@Pc(25) int local25 = (int) arg0.aLong200;
		@Pc(28) long local28 = arg0.aLong200;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		if (local21 == 50) {
			@Pc(42) Class93 local42 = Static100.method2145(local15, local18);
			if (local42 != null) {
				Static353.method5744();
				@Pc(49) Class6_Sub44 local49 = Static69.method1454(local42);
				Static178.method3537(local49.anInt8798, local49.method7359(), local42);
				Static467.aString104 = Static519.method7599(local42);
				if (Static467.aString104 == null) {
					Static467.aString104 = "Null";
				}
				Static568.aString113 = local42.aString31 + "<col=ffffff>";
			}
			return;
		}
		if (local21 == 59) {
			Static460.anInt8492 = 2;
			Static450.anInt8253 = 0;
			Static383.anInt7200 = arg1;
			Static77.anInt1917 = arg2;
			Static298.method4854(Static282.aClass181_63);
			Static547.aClass6_Sub26_Sub2_2.method4965(local25);
			Static547.aClass6_Sub26_Sub2_2.method4995(Static387.aClass273_1.method6617(82) ? 1 : 0);
			Static547.aClass6_Sub26_Sub2_2.method4962(local15 + Static191.anInt4147);
			Static547.aClass6_Sub26_Sub2_2.method4991(Static247.anInt5049 + local18);
			Static454.method7036(local15, local18);
		}
		if (local21 == 5) {
			Static460.anInt8492 = 2;
			Static450.anInt8253 = 0;
			Static77.anInt1917 = arg2;
			Static383.anInt7200 = arg1;
			Static298.method4854(Static350.aClass181_67);
			Static547.aClass6_Sub26_Sub2_2.method4991(local18 + Static247.anInt5049);
			Static547.aClass6_Sub26_Sub2_2.method4962((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static547.aClass6_Sub26_Sub2_2.method4955(Static387.aClass273_1.method6617(82) ? 1 : 0);
			Static547.aClass6_Sub26_Sub2_2.method4962(Static191.anInt4147 + local15);
			Static406.method8178(local18, local15, local28);
		}
		@Pc(194) Class11_Sub1_Sub1_Sub2 local194;
		if (local21 == 16) {
			local194 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local25];
			if (local194 != null) {
				Static460.anInt8492 = 2;
				Static383.anInt7200 = arg1;
				Static450.anInt8253 = 0;
				Static77.anInt1917 = arg2;
				Static298.method4854(Static282.aClass181_62);
				Static547.aClass6_Sub26_Sub2_2.method4946(local25);
				Static547.aClass6_Sub26_Sub2_2.method4995(Static387.aClass273_1.method6617(82) ? 1 : 0);
				Static21.method864(local194.method6212(), local194.method6212(), local194.anIntArray526[0], 0, 0, -2, local194.anIntArray527[0], true);
			}
		}
		if (local21 == 9) {
			if (Static456.anInt8437 > 0 && Static387.aClass273_1.method6617(82) && Static387.aClass273_1.method6617(81)) {
				Static480.method7890(Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77, local15 + Static191.anInt4147, Static247.anInt5049 + local18);
			} else {
				Static35.method1038(local25, local15, local18);
				if (local25 == 1) {
					Static547.aClass6_Sub26_Sub2_2.method4950(-1, -81849);
					Static547.aClass6_Sub26_Sub2_2.method4950(-1, -81849);
					Static547.aClass6_Sub26_Sub2_2.method4962((int) Static412.aFloat175);
					Static547.aClass6_Sub26_Sub2_2.method4950(57, -81849);
					Static547.aClass6_Sub26_Sub2_2.method4950(Static47.anInt1291, -81849);
					Static547.aClass6_Sub26_Sub2_2.method4950(Static146.anInt8629, -81849);
					Static547.aClass6_Sub26_Sub2_2.method4950(89, -81849);
					Static547.aClass6_Sub26_Sub2_2.method4962(Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7347);
					Static547.aClass6_Sub26_Sub2_2.method4962(Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7351);
					Static547.aClass6_Sub26_Sub2_2.method4950(63, -81849);
				} else {
					Static383.anInt7200 = arg1;
					Static450.anInt8253 = 0;
					Static460.anInt8492 = 1;
					Static77.anInt1917 = arg2;
				}
				Static21.method864(1, 1, local15, 0, 0, -4, local18, true);
			}
		}
		if (local21 == 18) {
			Static460.anInt8492 = 1;
			Static383.anInt7200 = arg1;
			Static450.anInt8253 = 0;
			Static77.anInt1917 = arg2;
			Static298.method4854(Static517.aClass181_103);
			Static547.aClass6_Sub26_Sub2_2.method4946(Static191.anInt4147 + local15);
			Static547.aClass6_Sub26_Sub2_2.method4991(Static150.anInt7378);
			Static547.aClass6_Sub26_Sub2_2.method4962(Static247.anInt5049 + local18);
			Static547.aClass6_Sub26_Sub2_2.method4991(Static353.anInt6817);
			Static547.aClass6_Sub26_Sub2_2.method4936(Static244.anInt4934);
			Static21.method864(1, 1, local15, 0, 0, -4, local18, true);
		}
		@Pc(432) Class11_Sub1_Sub1_Sub1 local432;
		@Pc(417) Class6_Sub33 local417;
		if (local21 == 10) {
			local417 = (Class6_Sub33) Static506.aClass305_36.method7447((long) local25);
			if (local417 != null) {
				Static460.anInt8492 = 2;
				Static450.anInt8253 = 0;
				Static383.anInt7200 = arg1;
				local432 = local417.aClass11_Sub1_Sub1_Sub1_2;
				Static77.anInt1917 = arg2;
				Static298.method4854(Static395.aClass181_84);
				Static547.aClass6_Sub26_Sub2_2.method4955(Static387.aClass273_1.method6617(82) ? 1 : 0);
				Static547.aClass6_Sub26_Sub2_2.method4946(local25);
				Static21.method864(local432.method6212(), local432.method6212(), local432.anIntArray526[0], 0, 0, -2, local432.anIntArray527[0], true);
			}
		}
		if (local21 == 4) {
			local194 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local25];
			if (local194 != null) {
				Static450.anInt8253 = 0;
				Static460.anInt8492 = 2;
				Static383.anInt7200 = arg1;
				Static77.anInt1917 = arg2;
				Static298.method4854(Static356.aClass181_76);
				Static547.aClass6_Sub26_Sub2_2.method4971(Static387.aClass273_1.method6617(82) ? 1 : 0);
				Static547.aClass6_Sub26_Sub2_2.method4962(Static353.anInt6817);
				Static547.aClass6_Sub26_Sub2_2.method4991(Static150.anInt7378);
				Static547.aClass6_Sub26_Sub2_2.method4991(local25);
				Static547.aClass6_Sub26_Sub2_2.method4948(Static244.anInt4934);
				Static21.method864(local194.method6212(), local194.method6212(), local194.anIntArray526[0], 0, 0, -2, local194.anIntArray527[0], true);
			}
		}
		if (local21 == 17) {
			local194 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local25];
			if (local194 != null) {
				Static460.anInt8492 = 2;
				Static450.anInt8253 = 0;
				Static77.anInt1917 = arg2;
				Static383.anInt7200 = arg1;
				Static298.method4854(Static508.aClass181_101);
				Static547.aClass6_Sub26_Sub2_2.method4995(Static387.aClass273_1.method6617(82) ? 1 : 0);
				Static547.aClass6_Sub26_Sub2_2.method4991(local25);
				Static21.method864(local194.method6212(), local194.method6212(), local194.anIntArray526[0], 0, 0, -2, local194.anIntArray527[0], true);
			}
		}
		if (local21 == 3) {
			Static383.anInt7200 = arg1;
			Static450.anInt8253 = 0;
			Static460.anInt8492 = 2;
			Static77.anInt1917 = arg2;
			Static298.method4854(Static338.aClass181_71);
			Static547.aClass6_Sub26_Sub2_2.method4991(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Static547.aClass6_Sub26_Sub2_2.method4946(local18 + Static247.anInt5049);
			Static547.aClass6_Sub26_Sub2_2.method4965(local15 + Static191.anInt4147);
			Static547.aClass6_Sub26_Sub2_2.method4950(Static387.aClass273_1.method6617(82) ? 1 : 0, -81849);
			Static406.method8178(local18, local15, local28);
		}
		if (local21 == 22) {
			local417 = (Class6_Sub33) Static506.aClass305_36.method7447((long) local25);
			if (local417 != null) {
				Static77.anInt1917 = arg2;
				Static383.anInt7200 = arg1;
				Static460.anInt8492 = 2;
				local432 = local417.aClass11_Sub1_Sub1_Sub1_2;
				Static450.anInt8253 = 0;
				Static298.method4854(Static113.aClass181_27);
				Static547.aClass6_Sub26_Sub2_2.method4950(Static387.aClass273_1.method6617(82) ? 1 : 0, -81849);
				Static547.aClass6_Sub26_Sub2_2.method4946(local25);
				Static21.method864(local432.method6212(), local432.method6212(), local432.anIntArray526[0], 0, 0, -2, local432.anIntArray527[0], true);
			}
		}
		if (local21 == 48) {
			local194 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local25];
			if (local194 != null) {
				Static460.anInt8492 = 2;
				Static450.anInt8253 = 0;
				Static383.anInt7200 = arg1;
				Static77.anInt1917 = arg2;
				Static298.method4854(Static503.aClass181_100);
				Static547.aClass6_Sub26_Sub2_2.method4962(local25);
				Static547.aClass6_Sub26_Sub2_2.method4971(Static387.aClass273_1.method6617(82) ? 1 : 0);
				Static21.method864(local194.method6212(), local194.method6212(), local194.anIntArray526[0], 0, 0, -2, local194.anIntArray527[0], true);
			}
		}
		if (local21 == 57) {
			local194 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local25];
			if (local194 != null) {
				Static383.anInt7200 = arg1;
				Static450.anInt8253 = 0;
				Static77.anInt1917 = arg2;
				Static460.anInt8492 = 2;
				Static298.method4854(Static536.aClass181_108);
				Static547.aClass6_Sub26_Sub2_2.method4971(Static387.aClass273_1.method6617(82) ? 1 : 0);
				Static547.aClass6_Sub26_Sub2_2.method4965(local25);
				Static21.method864(local194.method6212(), local194.method6212(), local194.anIntArray526[0], 0, 0, -2, local194.anIntArray527[0], true);
			}
		}
		if (local21 == 6) {
			Static77.anInt1917 = arg2;
			Static460.anInt8492 = 2;
			Static383.anInt7200 = arg1;
			Static450.anInt8253 = 0;
			Static298.method4854(Static538.aClass181_110);
			Static547.aClass6_Sub26_Sub2_2.method4946(local18 + Static247.anInt5049);
			Static547.aClass6_Sub26_Sub2_2.method4965(Static191.anInt4147 + local15);
			Static547.aClass6_Sub26_Sub2_2.method4995(Static387.aClass273_1.method6617(82) ? 1 : 0);
			Static547.aClass6_Sub26_Sub2_2.method4965(local25);
			Static454.method7036(local15, local18);
		}
		if (local21 == 25) {
			local417 = (Class6_Sub33) Static506.aClass305_36.method7447((long) local25);
			if (local417 != null) {
				Static383.anInt7200 = arg1;
				Static460.anInt8492 = 2;
				Static450.anInt8253 = 0;
				local432 = local417.aClass11_Sub1_Sub1_Sub1_2;
				Static77.anInt1917 = arg2;
				Static298.method4854(Static31.aClass181_8);
				Static547.aClass6_Sub26_Sub2_2.method4946(local25);
				Static547.aClass6_Sub26_Sub2_2.method4955(Static387.aClass273_1.method6617(82) ? 1 : 0);
				Static21.method864(local432.method6212(), local432.method6212(), local432.anIntArray526[0], 0, 0, -2, local432.anIntArray527[0], true);
			}
		}
		if (local21 == 23) {
			local417 = (Class6_Sub33) Static506.aClass305_36.method7447((long) local25);
			if (local417 != null) {
				local432 = local417.aClass11_Sub1_Sub1_Sub1_2;
				Static450.anInt8253 = 0;
				Static383.anInt7200 = arg1;
				Static77.anInt1917 = arg2;
				Static460.anInt8492 = 2;
				Static298.method4854(Static523.aClass181_105);
				Static547.aClass6_Sub26_Sub2_2.method4995(Static387.aClass273_1.method6617(82) ? 1 : 0);
				Static547.aClass6_Sub26_Sub2_2.method4965(local25);
				Static547.aClass6_Sub26_Sub2_2.method4960(Static244.anInt4934);
				Static547.aClass6_Sub26_Sub2_2.method4946(Static353.anInt6817);
				Static547.aClass6_Sub26_Sub2_2.method4962(Static150.anInt7378);
				Static21.method864(local432.method6212(), local432.method6212(), local432.anIntArray526[0], 0, 0, -2, local432.anIntArray527[0], true);
			}
		}
		if (local21 == 60) {
			local194 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local25];
			if (local194 != null) {
				Static460.anInt8492 = 2;
				Static383.anInt7200 = arg1;
				Static77.anInt1917 = arg2;
				Static450.anInt8253 = 0;
				Static298.method4854(Static142.aClass181_37);
				Static547.aClass6_Sub26_Sub2_2.method4991(local25);
				Static547.aClass6_Sub26_Sub2_2.method4950(Static387.aClass273_1.method6617(82) ? 1 : 0, -81849);
				Static21.method864(local194.method6212(), local194.method6212(), local194.anIntArray526[0], 0, 0, -2, local194.anIntArray527[0], true);
			}
		}
		if (local21 == 51) {
			Static460.anInt8492 = 2;
			Static383.anInt7200 = arg1;
			Static450.anInt8253 = 0;
			Static77.anInt1917 = arg2;
			Static298.method4854(Static426.aClass181_89);
			Static547.aClass6_Sub26_Sub2_2.method4991(local18 + Static247.anInt5049);
			Static547.aClass6_Sub26_Sub2_2.method4946(local25);
			Static547.aClass6_Sub26_Sub2_2.method4991(local15 + Static191.anInt4147);
			Static547.aClass6_Sub26_Sub2_2.method4971(Static387.aClass273_1.method6617(82) ? 1 : 0);
			Static454.method7036(local15, local18);
		}
		if (local21 == 58) {
			Static450.anInt8253 = 0;
			Static77.anInt1917 = arg2;
			Static383.anInt7200 = arg1;
			Static460.anInt8492 = 2;
			Static298.method4854(Static103.aClass181_24);
			Static547.aClass6_Sub26_Sub2_2.method4946(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Static547.aClass6_Sub26_Sub2_2.method4962(local18 + Static247.anInt5049);
			Static547.aClass6_Sub26_Sub2_2.method4950(Static387.aClass273_1.method6617(82) ? 1 : 0, -81849);
			Static547.aClass6_Sub26_Sub2_2.method4946(local15 + Static191.anInt4147);
			Static406.method8178(local18, local15, local28);
		}
		if (local21 == 1011) {
			Static383.anInt7200 = arg1;
			Static450.anInt8253 = 0;
			Static460.anInt8492 = 2;
			Static77.anInt1917 = arg2;
			Static298.method4854(Static130.aClass181_34);
			Static547.aClass6_Sub26_Sub2_2.method4965((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static547.aClass6_Sub26_Sub2_2.method4955(Static387.aClass273_1.method6617(82) ? 1 : 0);
			Static547.aClass6_Sub26_Sub2_2.method4962(local15 + Static191.anInt4147);
			Static547.aClass6_Sub26_Sub2_2.method4946(Static247.anInt5049 + local18);
			Static406.method8178(local18, local15, local28);
		}
		if (local21 == 1009) {
			Static383.anInt7200 = arg1;
			Static77.anInt1917 = arg2;
			Static460.anInt8492 = 2;
			Static450.anInt8253 = 0;
			Static298.method4854(Static30.aClass181_7);
			Static547.aClass6_Sub26_Sub2_2.method4962(local25);
		}
		if (local21 == 8) {
			local194 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local25];
			if (local194 != null) {
				Static450.anInt8253 = 0;
				Static77.anInt1917 = arg2;
				Static460.anInt8492 = 2;
				Static383.anInt7200 = arg1;
				Static298.method4854(Static354.aClass181_75);
				Static547.aClass6_Sub26_Sub2_2.method4955(Static387.aClass273_1.method6617(82) ? 1 : 0);
				Static547.aClass6_Sub26_Sub2_2.method4991(local25);
				Static21.method864(local194.method6212(), local194.method6212(), local194.anIntArray526[0], 0, 0, -2, local194.anIntArray527[0], true);
			}
		}
		if (local21 == 15) {
			local417 = (Class6_Sub33) Static506.aClass305_36.method7447((long) local25);
			if (local417 != null) {
				local432 = local417.aClass11_Sub1_Sub1_Sub1_2;
				Static450.anInt8253 = 0;
				Static383.anInt7200 = arg1;
				Static77.anInt1917 = arg2;
				Static460.anInt8492 = 2;
				Static298.method4854(Static153.aClass181_40);
				Static547.aClass6_Sub26_Sub2_2.method4965(local25);
				Static547.aClass6_Sub26_Sub2_2.method4950(Static387.aClass273_1.method6617(82) ? 1 : 0, -81849);
				Static21.method864(local432.method6212(), local432.method6212(), local432.anIntArray526[0], 0, 0, -2, local432.anIntArray527[0], true);
			}
		}
		if (local21 == 20) {
			@Pc(1440) Class93 local1440 = Static100.method2145(local15, local18);
			if (local1440 != null) {
				Static243.method4250(local1440);
			}
		}
		if (local21 == 44) {
			Static460.anInt8492 = 2;
			Static383.anInt7200 = arg1;
			Static450.anInt8253 = 0;
			Static77.anInt1917 = arg2;
			Static298.method4854(Static153.aClass181_39);
			Static547.aClass6_Sub26_Sub2_2.method4965(Static150.anInt7378);
			Static547.aClass6_Sub26_Sub2_2.method4991(local25);
			Static547.aClass6_Sub26_Sub2_2.method4962(local18 + Static247.anInt5049);
			Static547.aClass6_Sub26_Sub2_2.method4936(Static244.anInt4934);
			Static547.aClass6_Sub26_Sub2_2.method4971(Static387.aClass273_1.method6617(82) ? 1 : 0);
			Static547.aClass6_Sub26_Sub2_2.method4962(Static353.anInt6817);
			Static547.aClass6_Sub26_Sub2_2.method4965(local15 + Static191.anInt4147);
			Static454.method7036(local15, local18);
		}
		if (local21 == 46) {
			if (Static456.anInt8437 > 0 && Static387.aClass273_1.method6617(82) && Static387.aClass273_1.method6617(81)) {
				Static480.method7890(Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77, Static191.anInt4147 + local15, Static247.anInt5049 - -local18);
			} else {
				Static77.anInt1917 = arg2;
				Static460.anInt8492 = 1;
				Static383.anInt7200 = arg1;
				Static450.anInt8253 = 0;
				Static298.method4854(Static420.aClass181_113);
				Static547.aClass6_Sub26_Sub2_2.method4946(Static191.anInt4147 + local15);
				Static547.aClass6_Sub26_Sub2_2.method4946(local18 + Static247.anInt5049);
			}
		}
		if (local21 == 11) {
			Static450.anInt8253 = 0;
			Static77.anInt1917 = arg2;
			Static383.anInt7200 = arg1;
			Static460.anInt8492 = 2;
			Static298.method4854(Static527.aClass181_106);
			Static547.aClass6_Sub26_Sub2_2.method4965(local18 + Static247.anInt5049);
			Static547.aClass6_Sub26_Sub2_2.method4962(local25);
			Static547.aClass6_Sub26_Sub2_2.method4995(Static387.aClass273_1.method6617(82) ? 1 : 0);
			Static547.aClass6_Sub26_Sub2_2.method4991(local15 + Static191.anInt4147);
			Static454.method7036(local15, local18);
		}
		if (local21 == 2 || local21 == 1002) {
			Static303.method4902(local18, local25, arg0.aString101, local15);
		}
		if (local21 == 49) {
			Static383.anInt7200 = arg1;
			Static77.anInt1917 = arg2;
			Static460.anInt8492 = 2;
			Static450.anInt8253 = 0;
			Static298.method4854(Static356.aClass181_76);
			Static547.aClass6_Sub26_Sub2_2.method4971(Static387.aClass273_1.method6617(82) ? 1 : 0);
			Static547.aClass6_Sub26_Sub2_2.method4962(Static353.anInt6817);
			Static547.aClass6_Sub26_Sub2_2.method4991(Static150.anInt7378);
			Static547.aClass6_Sub26_Sub2_2.method4991(Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7392);
			Static547.aClass6_Sub26_Sub2_2.method4948(Static244.anInt4934);
		}
		if (local21 == 1007 || local21 == 1001 || local21 == 1010 || local21 == 1006 || local21 == 1003) {
			Static503.method7507(local21, local15, local25);
		}
		if (local21 == 1004) {
			Static383.anInt7200 = arg1;
			Static77.anInt1917 = arg2;
			Static450.anInt8253 = 0;
			Static460.anInt8492 = 2;
			Static298.method4854(Static185.aClass181_46);
			Static547.aClass6_Sub26_Sub2_2.method4962(local25);
		}
		if (local21 == 47) {
			Static383.anInt7200 = arg1;
			Static460.anInt8492 = 2;
			Static450.anInt8253 = 0;
			Static77.anInt1917 = arg2;
			Static298.method4854(Static305.aClass181_66);
			Static547.aClass6_Sub26_Sub2_2.method4991(local25);
			Static547.aClass6_Sub26_Sub2_2.method4962(Static191.anInt4147 + local15);
			Static547.aClass6_Sub26_Sub2_2.method4955(Static387.aClass273_1.method6617(82) ? 1 : 0);
			Static547.aClass6_Sub26_Sub2_2.method4946(local18 + Static247.anInt5049);
			Static454.method7036(local15, local18);
		}
		if (local21 == 19 && Static469.aClass93_15 == null) {
			Static550.method7857(local18, local15);
			Static469.aClass93_15 = Static100.method2145(local15, local18);
			Static468.method7221(Static469.aClass93_15);
		}
		@Pc(1805) Class11_Sub1_Sub1_Sub2 local1805;
		if (local21 == 21) {
			local1805 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local25];
			if (local1805 != null) {
				Static77.anInt1917 = arg2;
				Static383.anInt7200 = arg1;
				Static460.anInt8492 = 2;
				Static450.anInt8253 = 0;
				Static298.method4854(Static255.aClass181_58);
				Static547.aClass6_Sub26_Sub2_2.method4962(local25);
				Static547.aClass6_Sub26_Sub2_2.method4950(Static387.aClass273_1.method6617(82) ? 1 : 0, -81849);
				Static21.method864(local1805.method6212(), local1805.method6212(), local1805.anIntArray526[0], 0, 0, -2, local1805.anIntArray527[0], true);
			}
		}
		if (local21 == 45) {
			Static450.anInt8253 = 0;
			Static77.anInt1917 = arg2;
			Static383.anInt7200 = arg1;
			Static460.anInt8492 = 2;
			Static298.method4854(Static359.aClass181_73);
			Static547.aClass6_Sub26_Sub2_2.method4962((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static547.aClass6_Sub26_Sub2_2.method4962(Static247.anInt5049 + local18);
			Static547.aClass6_Sub26_Sub2_2.method4965(Static191.anInt4147 + local15);
			Static547.aClass6_Sub26_Sub2_2.method4995(Static387.aClass273_1.method6617(82) ? 1 : 0);
			Static406.method8178(local18, local15, local28);
		}
		@Pc(1938) Class11_Sub1_Sub1_Sub1 local1938;
		@Pc(1925) Class6_Sub33 local1925;
		if (local21 == 12) {
			local1925 = (Class6_Sub33) Static506.aClass305_36.method7447((long) local25);
			if (local1925 != null) {
				Static77.anInt1917 = arg2;
				Static450.anInt8253 = 0;
				Static383.anInt7200 = arg1;
				Static460.anInt8492 = 2;
				local1938 = local1925.aClass11_Sub1_Sub1_Sub1_2;
				Static298.method4854(Static115.aClass181_28);
				Static547.aClass6_Sub26_Sub2_2.method4962(local25);
				Static547.aClass6_Sub26_Sub2_2.method4955(Static387.aClass273_1.method6617(82) ? 1 : 0);
				Static21.method864(local1938.method6212(), local1938.method6212(), local1938.anIntArray526[0], 0, 0, -2, local1938.anIntArray527[0], true);
			}
		}
		if (local21 == 1012) {
			Static450.anInt8253 = 0;
			Static77.anInt1917 = arg2;
			Static383.anInt7200 = arg1;
			Static460.anInt8492 = 2;
			local1925 = (Class6_Sub33) Static506.aClass305_36.method7447((long) local25);
			if (local1925 != null) {
				local1938 = local1925.aClass11_Sub1_Sub1_Sub1_2;
				@Pc(2007) Class222 local2007 = local1938.aClass222_1;
				if (local2007.anIntArray464 != null) {
					local2007 = local2007.method5329(Static435.aClass234_1);
				}
				if (local2007 != null) {
					Static298.method4854(Static218.aClass181_53);
					Static547.aClass6_Sub26_Sub2_2.method4962(local2007.anInt6238);
				}
			}
		}
		if (local21 == 13) {
			local1805 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local25];
			if (local1805 != null) {
				Static450.anInt8253 = 0;
				Static383.anInt7200 = arg1;
				Static460.anInt8492 = 2;
				Static77.anInt1917 = arg2;
				Static298.method4854(Static372.aClass181_115);
				Static547.aClass6_Sub26_Sub2_2.method4991(local25);
				Static547.aClass6_Sub26_Sub2_2.method4950(Static387.aClass273_1.method6617(82) ? 1 : 0, -81849);
				Static21.method864(local1805.method6212(), local1805.method6212(), local1805.anIntArray526[0], 0, 0, -2, local1805.anIntArray527[0], true);
			}
		}
		if (local21 == 30) {
			Static383.anInt7200 = arg1;
			Static450.anInt8253 = 0;
			Static460.anInt8492 = 2;
			Static77.anInt1917 = arg2;
			Static298.method4854(Static335.aClass181_70);
			Static547.aClass6_Sub26_Sub2_2.method4991(local15 + Static191.anInt4147);
			Static547.aClass6_Sub26_Sub2_2.method4995(Static387.aClass273_1.method6617(82) ? 1 : 0);
			Static547.aClass6_Sub26_Sub2_2.method4946(Static150.anInt7378);
			Static547.aClass6_Sub26_Sub2_2.method4965(local18 + Static247.anInt5049);
			Static547.aClass6_Sub26_Sub2_2.method4946(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Static547.aClass6_Sub26_Sub2_2.method4936(Static244.anInt4934);
			Static547.aClass6_Sub26_Sub2_2.method4965(Static353.anInt6817);
			Static406.method8178(local18, local15, local28);
		}
		if (Static25.aBoolean80) {
			Static353.method5744();
		}
		if (Static83.aClass93_3 != null && Static576.anInt9761 == 0) {
			Static468.method7221(Static83.aClass93_3);
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method3799(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static457.method7117(arg5)) {
			if (Static279.aClass93ArrayArray1[arg5] == null) {
				Static325.method5246(Static336.aClass93ArrayArray2[arg5], arg2, arg1, arg0, arg6, arg7, -1, arg4, arg3);
			} else {
				Static325.method5246(Static279.aClass93ArrayArray1[arg5], arg2, arg1, arg0, arg6, arg7, -1, arg4, arg3);
			}
		} else if (arg3 == -1) {
			for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
				Static429.aBooleanArray27[local20] = true;
			}
		} else {
			Static429.aBooleanArray27[arg3] = true;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIII)V")
	public static void method3800(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = arg1 * Static104.aClass6_Sub6_Sub1_4.anInt1170 >> 8;
		if (local6 != 0 && arg0 != -1) {
			Static386.method6071(Static278.aClass168_67, local6, arg0);
			Static439.aBoolean592 = true;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lclient!jg;Z)V")
	public static void method3801(@OriginalArg(0) Interface8 arg0) {
		Static491.anInterface8_1.method6514();
		Static491.anInterface8_1 = arg0;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(BII)Z")
	public static boolean method3803(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
