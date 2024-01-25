import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!j", name = "G", descriptor = "I")
	public static int anInt2558;

	@OriginalMember(owner = "client!j", name = "H", descriptor = "I")
	public static int anInt2559;

	@OriginalMember(owner = "client!j", name = "N", descriptor = "[Lclient!t;")
	public static Class189[] aClass189Array1;

	@OriginalMember(owner = "client!j", name = "O", descriptor = "Lclient!jh;")
	public static final Class6_Sub10_Sub1 aClass6_Sub10_Sub1_3 = new Class6_Sub10_Sub1(5000);

	@OriginalMember(owner = "client!j", name = "P", descriptor = "[I")
	public static final int[] anIntArray334 = new int[14];

	@OriginalMember(owner = "client!j", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString112 = "Starting 3d Library";

	@OriginalMember(owner = "client!j", name = "S", descriptor = "[Z")
	public static final boolean[] aBooleanArray22 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg2 - arg1;
		@Pc(14) int local14 = arg6 + arg1;
		for (@Pc(16) int local16 = arg6; local16 < local14; local16++) {
			Static14.method247(arg3, arg5, Static11.anIntArrayArray11[local16], arg4);
		}
		for (@Pc(36) int local36 = arg2; local36 > local10; local36--) {
			Static14.method247(arg3, arg5, Static11.anIntArrayArray11[local36], arg4);
		}
		@Pc(66) int local66 = arg1 + arg4;
		@Pc(71) int local71 = arg3 - arg1;
		for (@Pc(73) int local73 = local14; local73 <= local10; local73++) {
			@Pc(79) int[] local79 = Static11.anIntArrayArray11[local73];
			Static14.method247(local66, arg5, local79, arg4);
			Static14.method247(local71, arg0, local79, local66);
			Static14.method247(arg3, arg5, local79, local71);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BLclient!qp;)V")
	public static void method2686(@OriginalArg(1) Class6_Sub32 arg0) {
		if (arg0 == null || Static214.aClass211_24.aClass6_237 == arg0) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt4931;
		@Pc(18) int local18 = arg0.anInt4929;
		@Pc(21) int local21 = arg0.anInt4932;
		@Pc(25) int local25 = (int) arg0.aLong156;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(32) long local32 = arg0.aLong156;
		@Pc(56) Class132 local56;
		@Pc(74) int local74;
		if (local21 == 6) {
			Static131.aClass6_Sub10_Sub1_2.method2886(190);
			Static131.aClass6_Sub10_Sub1_2.method3976(local18);
			local56 = Static249.method4316(local18);
			if (local56.anIntArrayArray126 != null && local56.anIntArrayArray126[0][0] == 5) {
				local74 = local56.anIntArrayArray126[0][1];
				Static41.anIntArray721[local74] = 1 - Static41.anIntArray721[local74];
				Static145.method2740(local74);
			}
		}
		if (local21 == 50) {
			Static99.method5561(false);
		}
		if (local21 == 58) {
			Static215.anInt3935 = Static198.anInt3691;
			Static336.anInt6136 = 2;
			Static194.anInt3669 = Static182.anInt3425;
			Static249.anInt4661 = 0;
			Static131.aClass6_Sub10_Sub1_2.method2886(12);
			Static131.aClass6_Sub10_Sub1_2.method3961(Static300.anInt5672 + local18);
			Static131.aClass6_Sub10_Sub1_2.method3984(local15 + Static44.anInt881);
			Static131.aClass6_Sub10_Sub1_2.method3990(Static354.aBooleanArray30[82] ? 1 : 0);
			Static131.aClass6_Sub10_Sub1_2.method4020(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static218.method3883(local18, local15, local32);
		}
		if (local21 == 26) {
			Static194.anInt3669 = Static182.anInt3425;
			Static336.anInt6136 = 2;
			Static249.anInt4661 = 0;
			Static215.anInt3935 = Static198.anInt3691;
			Static131.aClass6_Sub10_Sub1_2.method2886(100);
			Static131.aClass6_Sub10_Sub1_2.method4019(Static354.aBooleanArray30[82] ? 1 : 0);
			Static131.aClass6_Sub10_Sub1_2.method3961(local18 + Static300.anInt5672);
			Static131.aClass6_Sub10_Sub1_2.method4020(local25);
			Static131.aClass6_Sub10_Sub1_2.method3984(Static44.anInt881 + local15);
			Static165.method5486(local18, local15);
		}
		if (local21 == 33) {
			local56 = Static249.method4316(local18);
			@Pc(207) boolean local207 = true;
			if (local56.anInt3539 > 0) {
				local207 = Static352.method5772(local56);
			}
			if (local207) {
				Static131.aClass6_Sub10_Sub1_2.method2886(190);
				Static131.aClass6_Sub10_Sub1_2.method3976(local18);
			}
		}
		if (local21 == 48) {
			Static131.aClass6_Sub10_Sub1_2.method2886(72);
			Static131.aClass6_Sub10_Sub1_2.method3976(local18);
			Static131.aClass6_Sub10_Sub1_2.method3984(local15);
			Static131.aClass6_Sub10_Sub1_2.method4025(local25);
			Static210.anInt3844 = 0;
			Static200.aClass132_13 = Static249.method4316(local18);
			Static187.anInt3514 = local15;
		}
		if (local21 == 44) {
			Static336.anInt6136 = 2;
			Static194.anInt3669 = Static182.anInt3425;
			Static215.anInt3935 = Static198.anInt3691;
			Static249.anInt4661 = 0;
			Static131.aClass6_Sub10_Sub1_2.method2886(245);
			Static131.aClass6_Sub10_Sub1_2.method3976(Static338.anInt6174);
			Static131.aClass6_Sub10_Sub1_2.method4020(Static300.anInt5672 + local18);
			Static131.aClass6_Sub10_Sub1_2.method4020(Static102.anInt5263);
			Static131.aClass6_Sub10_Sub1_2.method4025(local15 + Static44.anInt881);
			Static131.aClass6_Sub10_Sub1_2.method3961(local25);
			Static131.aClass6_Sub10_Sub1_2.method4019(Static354.aBooleanArray30[82] ? 1 : 0);
			Static131.aClass6_Sub10_Sub1_2.method4025(Static47.anInt922);
			Static165.method5486(local18, local15);
		}
		@Pc(329) Class44_Sub4_Sub4_Sub1 local329;
		if (local21 == 36) {
			local329 = Static343.aClass44_Sub4_Sub4_Sub1Array1[local25];
			if (local329 != null) {
				Static336.anInt6136 = 2;
				Static249.anInt4661 = 0;
				Static215.anInt3935 = Static198.anInt3691;
				Static194.anInt3669 = Static182.anInt3425;
				Static131.aClass6_Sub10_Sub1_2.method2886(122);
				Static131.aClass6_Sub10_Sub1_2.method3984(local25);
				Static131.aClass6_Sub10_Sub1_2.method3990(Static354.aBooleanArray30[82] ? 1 : 0);
				Static343.method5639(true, Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0], Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0], -2, local329.method4714(), 0, local329.method4714(), local329.anIntArray561[0], 0, local329.anIntArray560[0]);
			}
		}
		@Pc(397) Class44_Sub4_Sub4_Sub2 local397;
		if (local21 == 31) {
			local397 = Static239.aClass44_Sub4_Sub4_Sub2Array8[local25];
			if (local397 != null) {
				Static194.anInt3669 = Static182.anInt3425;
				Static336.anInt6136 = 2;
				Static215.anInt3935 = Static198.anInt3691;
				Static249.anInt4661 = 0;
				Static131.aClass6_Sub10_Sub1_2.method2886(112);
				Static131.aClass6_Sub10_Sub1_2.method4025(local25);
				Static131.aClass6_Sub10_Sub1_2.method3978(Static354.aBooleanArray30[82] ? 1 : 0);
				Static343.method5639(true, Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0], Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0], -2, local397.method4714(), 0, local397.method4714(), local397.anIntArray561[0], 0, local397.anIntArray560[0]);
			}
		}
		if (local21 == 49) {
			Static215.anInt3935 = Static198.anInt3691;
			Static336.anInt6136 = 2;
			Static249.anInt4661 = 0;
			Static194.anInt3669 = Static182.anInt3425;
			Static131.aClass6_Sub10_Sub1_2.method2886(88);
			Static131.aClass6_Sub10_Sub1_2.method3984(local25);
			Static131.aClass6_Sub10_Sub1_2.method3968(Static354.aBooleanArray30[82] ? 1 : 0);
			Static131.aClass6_Sub10_Sub1_2.method3961(Static44.anInt881 + local15);
			Static131.aClass6_Sub10_Sub1_2.method4020(Static300.anInt5672 + local18);
			Static165.method5486(local18, local15);
		}
		if (local21 == 15) {
			if (Static115.anInt2157 > 0 && Static354.aBooleanArray30[82] && Static354.aBooleanArray30[81]) {
				Static294.method5028(Static44.anInt881 + local15, Static343.anInt6225, Static300.anInt5672 + local18);
			} else {
				Static243.method4272(local18, local25, local15);
				if (local25 == 1) {
					Static131.aClass6_Sub10_Sub1_2.method3968(-1);
					Static131.aClass6_Sub10_Sub1_2.method3968(-1);
					Static131.aClass6_Sub10_Sub1_2.method4025((int) Static117.aFloat58);
					Static131.aClass6_Sub10_Sub1_2.method3968(57);
					Static131.aClass6_Sub10_Sub1_2.method3968(Static345.anInt6260);
					Static131.aClass6_Sub10_Sub1_2.method3968(Static279.anInt5302);
					Static131.aClass6_Sub10_Sub1_2.method3968(89);
					Static131.aClass6_Sub10_Sub1_2.method4025(Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6340);
					Static131.aClass6_Sub10_Sub1_2.method4025(Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6339);
					Static131.aClass6_Sub10_Sub1_2.method3968(63);
				} else {
					Static194.anInt3669 = Static182.anInt3425;
					Static249.anInt4661 = 0;
					Static215.anInt3935 = Static198.anInt3691;
					Static336.anInt6136 = 1;
				}
				Static343.method5639(true, Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0], Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0], -4, 1, 0, 1, local18, 0, local15);
			}
		}
		if (local21 == 14 && Static109.aClass132_7 == null) {
			Static256.method4369(local15, local18);
			Static109.aClass132_7 = Static6.method131(local18, local15);
			Static298.method5108(Static109.aClass132_7);
		}
		if (local21 == 8) {
			Static131.aClass6_Sub10_Sub1_2.method2886(250);
			Static131.aClass6_Sub10_Sub1_2.method3976(local18);
			Static131.aClass6_Sub10_Sub1_2.method3984(local25);
			Static131.aClass6_Sub10_Sub1_2.method4025(local15);
			Static210.anInt3844 = 0;
			Static200.aClass132_13 = Static249.method4316(local18);
			Static187.anInt3514 = local15;
		}
		if (local21 == 20) {
			Static249.anInt4661 = 0;
			Static194.anInt3669 = Static182.anInt3425;
			Static215.anInt3935 = Static198.anInt3691;
			Static336.anInt6136 = 2;
			Static131.aClass6_Sub10_Sub1_2.method2886(151);
			Static131.aClass6_Sub10_Sub1_2.method4020(local18 + Static300.anInt5672);
			Static131.aClass6_Sub10_Sub1_2.method3961(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static131.aClass6_Sub10_Sub1_2.method4020(Static44.anInt881 + local15);
			Static131.aClass6_Sub10_Sub1_2.method3968(Static354.aBooleanArray30[82] ? 1 : 0);
			Static218.method3883(local18, local15, local32);
		}
		if (local21 == 40) {
			Static131.aClass6_Sub10_Sub1_2.method2886(171);
			Static131.aClass6_Sub10_Sub1_2.method3976(local18);
			Static131.aClass6_Sub10_Sub1_2.method4025(local15);
			Static131.aClass6_Sub10_Sub1_2.method4025(local25);
			Static131.aClass6_Sub10_Sub1_2.method3961(Static252.anInt4705);
			Static131.aClass6_Sub10_Sub1_2.method4006(Static30.anInt572);
			Static210.anInt3844 = 0;
			Static200.aClass132_13 = Static249.method4316(local18);
			Static187.anInt3514 = local15;
		}
		if (local21 == 1003) {
			Static336.anInt6136 = 2;
			Static215.anInt3935 = Static198.anInt3691;
			Static194.anInt3669 = Static182.anInt3425;
			Static249.anInt4661 = 0;
			Static131.aClass6_Sub10_Sub1_2.method2886(170);
			Static131.aClass6_Sub10_Sub1_2.method4020(Static300.anInt5672 + local18);
			Static131.aClass6_Sub10_Sub1_2.method3990(Static354.aBooleanArray30[82] ? 1 : 0);
			Static131.aClass6_Sub10_Sub1_2.method3984(local15 + Static44.anInt881);
			Static131.aClass6_Sub10_Sub1_2.method4020((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static218.method3883(local18, local15, local32);
		}
		if (local21 == 22) {
			Static131.aClass6_Sub10_Sub1_2.method2886(190);
			Static131.aClass6_Sub10_Sub1_2.method3976(local18);
			local56 = Static249.method4316(local18);
			if (local56.anIntArrayArray126 != null && local56.anIntArrayArray126[0][0] == 5) {
				local74 = local56.anIntArrayArray126[0][1];
				if (Static41.anIntArray721[local74] != local56.anIntArray407[0]) {
					Static41.anIntArray721[local74] = local56.anIntArray407[0];
					Static145.method2740(local74);
				}
			}
		}
		if (local21 == 43) {
			local397 = Static239.aClass44_Sub4_Sub4_Sub2Array8[local25];
			if (local397 != null) {
				Static215.anInt3935 = Static198.anInt3691;
				Static249.anInt4661 = 0;
				Static194.anInt3669 = Static182.anInt3425;
				Static336.anInt6136 = 2;
				Static131.aClass6_Sub10_Sub1_2.method2886(111);
				Static131.aClass6_Sub10_Sub1_2.method3961(local25);
				Static131.aClass6_Sub10_Sub1_2.method3968(Static354.aBooleanArray30[82] ? 1 : 0);
				Static343.method5639(true, Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0], Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0], -2, local397.method4714(), 0, local397.method4714(), local397.anIntArray561[0], 0, local397.anIntArray560[0]);
			}
		}
		if (local21 == 35) {
			local329 = Static343.aClass44_Sub4_Sub4_Sub1Array1[local25];
			if (local329 != null) {
				Static336.anInt6136 = 2;
				Static194.anInt3669 = Static182.anInt3425;
				Static215.anInt3935 = Static198.anInt3691;
				Static249.anInt4661 = 0;
				Static131.aClass6_Sub10_Sub1_2.method2886(31);
				Static131.aClass6_Sub10_Sub1_2.method3978(Static354.aBooleanArray30[82] ? 1 : 0);
				Static131.aClass6_Sub10_Sub1_2.method3961(local25);
				Static343.method5639(true, Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0], Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0], -2, local329.method4714(), 0, local329.method4714(), local329.anIntArray561[0], 0, local329.anIntArray560[0]);
			}
		}
		if (local21 == 38) {
			local397 = Static239.aClass44_Sub4_Sub4_Sub2Array8[local25];
			if (local397 != null) {
				Static215.anInt3935 = Static198.anInt3691;
				Static336.anInt6136 = 2;
				Static249.anInt4661 = 0;
				Static194.anInt3669 = Static182.anInt3425;
				Static131.aClass6_Sub10_Sub1_2.method2886(157);
				Static131.aClass6_Sub10_Sub1_2.method4025(Static252.anInt4705);
				Static131.aClass6_Sub10_Sub1_2.method3968(Static354.aBooleanArray30[82] ? 1 : 0);
				Static131.aClass6_Sub10_Sub1_2.method4001(Static30.anInt572);
				Static131.aClass6_Sub10_Sub1_2.method4020(local25);
				Static343.method5639(true, Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0], Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0], -2, local397.method4714(), 0, local397.method4714(), local397.anIntArray561[0], 0, local397.anIntArray560[0]);
			}
		}
		if (local21 == 7) {
			Static131.aClass6_Sub10_Sub1_2.method2886(225);
			Static131.aClass6_Sub10_Sub1_2.method3976(local18);
			Static131.aClass6_Sub10_Sub1_2.method4020(local15);
			Static131.aClass6_Sub10_Sub1_2.method3961(local25);
			Static210.anInt3844 = 0;
			Static200.aClass132_13 = Static249.method4316(local18);
			Static187.anInt3514 = local15;
		}
		if (local21 == 34) {
			Static131.aClass6_Sub10_Sub1_2.method2886(243);
			Static131.aClass6_Sub10_Sub1_2.method3976(local18);
			Static131.aClass6_Sub10_Sub1_2.method4020(local15);
			Static131.aClass6_Sub10_Sub1_2.method3961(local25);
			Static210.anInt3844 = 0;
			Static200.aClass132_13 = Static249.method4316(local18);
			Static187.anInt3514 = local15;
		}
		if (local21 == 11) {
			Static346.method5704();
			local56 = Static249.method4316(local18);
			Static14.anInt257 = 1;
			Static47.anInt922 = local25;
			Static338.anInt6174 = local18;
			Static102.anInt5263 = local15;
			Static298.method5108(local56);
			Static237.aString188 = "<col=ff9040>" + Static211.method3762(local25).aString170 + "<col=ffffff>";
			if (Static237.aString188 == null) {
				Static237.aString188 = "null";
			}
			return;
		}
		if (local21 == 28) {
			Static131.aClass6_Sub10_Sub1_2.method2886(61);
			Static131.aClass6_Sub10_Sub1_2.method3976(local18);
			Static131.aClass6_Sub10_Sub1_2.method4020(local25);
			Static131.aClass6_Sub10_Sub1_2.method3984(local15);
			Static210.anInt3844 = 0;
			Static200.aClass132_13 = Static249.method4316(local18);
			Static187.anInt3514 = local15;
		}
		if (local21 == 25) {
			local329 = Static343.aClass44_Sub4_Sub4_Sub1Array1[local25];
			if (local329 != null) {
				Static194.anInt3669 = Static182.anInt3425;
				Static249.anInt4661 = 0;
				Static336.anInt6136 = 2;
				Static215.anInt3935 = Static198.anInt3691;
				Static131.aClass6_Sub10_Sub1_2.method2886(178);
				Static131.aClass6_Sub10_Sub1_2.method3968(Static354.aBooleanArray30[82] ? 1 : 0);
				Static131.aClass6_Sub10_Sub1_2.method4025(local25);
				Static343.method5639(true, Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0], Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0], -2, local329.method4714(), 0, local329.method4714(), local329.anIntArray561[0], 0, local329.anIntArray560[0]);
			}
		}
		if (local21 == 57) {
			local329 = Static343.aClass44_Sub4_Sub4_Sub1Array1[local25];
			if (local329 != null) {
				Static194.anInt3669 = Static182.anInt3425;
				Static336.anInt6136 = 2;
				Static215.anInt3935 = Static198.anInt3691;
				Static249.anInt4661 = 0;
				Static131.aClass6_Sub10_Sub1_2.method2886(99);
				Static131.aClass6_Sub10_Sub1_2.method3968(Static354.aBooleanArray30[82] ? 1 : 0);
				Static131.aClass6_Sub10_Sub1_2.method4020(local25);
				Static343.method5639(true, Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0], Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0], -2, local329.method4714(), 0, local329.method4714(), local329.anIntArray561[0], 0, local329.anIntArray560[0]);
			}
		}
		if (local21 == 5) {
			Static131.aClass6_Sub10_Sub1_2.method2886(248);
			Static131.aClass6_Sub10_Sub1_2.method3976(local18);
			Static131.aClass6_Sub10_Sub1_2.method4020(Static252.anInt4705);
			Static131.aClass6_Sub10_Sub1_2.method4001(Static30.anInt572);
			Static131.aClass6_Sub10_Sub1_2.method3984(local15);
		}
		if (local21 == 1002) {
			Static215.anInt3935 = Static198.anInt3691;
			Static336.anInt6136 = 2;
			Static249.anInt4661 = 0;
			Static194.anInt3669 = Static182.anInt3425;
			Static131.aClass6_Sub10_Sub1_2.method2886(1);
			Static131.aClass6_Sub10_Sub1_2.method3984(local25);
		}
		if (local21 == 1) {
			Static336.anInt6136 = 2;
			Static249.anInt4661 = 0;
			Static194.anInt3669 = Static182.anInt3425;
			Static215.anInt3935 = Static198.anInt3691;
			Static131.aClass6_Sub10_Sub1_2.method2886(28);
			Static131.aClass6_Sub10_Sub1_2.method3984(Static44.anInt881 + local15);
			Static131.aClass6_Sub10_Sub1_2.method4020(local25);
			Static131.aClass6_Sub10_Sub1_2.method4019(Static354.aBooleanArray30[82] ? 1 : 0);
			Static131.aClass6_Sub10_Sub1_2.method3984(Static300.anInt5672 + local18);
			Static165.method5486(local18, local15);
		}
		if (local21 == 24) {
			Static131.aClass6_Sub10_Sub1_2.method2886(108);
			Static131.aClass6_Sub10_Sub1_2.method3976(local18);
			Static131.aClass6_Sub10_Sub1_2.method3984(local15);
			Static131.aClass6_Sub10_Sub1_2.method4025(local25);
			Static210.anInt3844 = 0;
			Static200.aClass132_13 = Static249.method4316(local18);
			Static187.anInt3514 = local15;
		}
		if (local21 == 12) {
			local329 = Static343.aClass44_Sub4_Sub4_Sub1Array1[local25];
			if (local329 != null) {
				Static215.anInt3935 = Static198.anInt3691;
				Static336.anInt6136 = 2;
				Static249.anInt4661 = 0;
				Static194.anInt3669 = Static182.anInt3425;
				Static131.aClass6_Sub10_Sub1_2.method2886(167);
				Static131.aClass6_Sub10_Sub1_2.method3968(Static354.aBooleanArray30[82] ? 1 : 0);
				Static131.aClass6_Sub10_Sub1_2.method4025(local25);
				Static343.method5639(true, Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0], Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0], -2, local329.method4714(), 0, local329.method4714(), local329.anIntArray561[0], 0, local329.anIntArray560[0]);
			}
		}
		if (local21 == 32) {
			Static194.anInt3669 = Static182.anInt3425;
			Static249.anInt4661 = 0;
			Static215.anInt3935 = Static198.anInt3691;
			Static336.anInt6136 = 2;
			Static131.aClass6_Sub10_Sub1_2.method2886(224);
			Static131.aClass6_Sub10_Sub1_2.method4025(Static252.anInt4705);
			Static131.aClass6_Sub10_Sub1_2.method4025(Static44.anInt881 + local15);
			Static131.aClass6_Sub10_Sub1_2.method3976(Static30.anInt572);
			Static131.aClass6_Sub10_Sub1_2.method3961(local25);
			Static131.aClass6_Sub10_Sub1_2.method3990(Static354.aBooleanArray30[82] ? 1 : 0);
			Static131.aClass6_Sub10_Sub1_2.method3984(Static300.anInt5672 + local18);
			Static165.method5486(local18, local15);
		}
		if (local21 == 1008) {
			Static249.anInt4661 = 0;
			Static215.anInt3935 = Static198.anInt3691;
			Static194.anInt3669 = Static182.anInt3425;
			Static336.anInt6136 = 2;
			local397 = Static239.aClass44_Sub4_Sub4_Sub2Array8[local25];
			if (local397 != null) {
				@Pc(1648) Class18 local1648 = local397.aClass18_1;
				if (local1648.anIntArray37 != null) {
					local1648 = local1648.method369();
				}
				if (local1648 != null) {
					Static131.aClass6_Sub10_Sub1_2.method2886(86);
					Static131.aClass6_Sub10_Sub1_2.method4025(local1648.anInt394);
				}
			}
		}
		if (local21 == 1012 || local21 == 1009 || local21 == 1011 || local21 == 1007 || local21 == 1006) {
			Static300.method5151(local15, local25, local21);
		}
		if (local21 == 19) {
			local329 = Static343.aClass44_Sub4_Sub4_Sub1Array1[local25];
			if (local329 != null) {
				Static194.anInt3669 = Static182.anInt3425;
				Static249.anInt4661 = 0;
				Static215.anInt3935 = Static198.anInt3691;
				Static336.anInt6136 = 2;
				Static131.aClass6_Sub10_Sub1_2.method2886(73);
				Static131.aClass6_Sub10_Sub1_2.method4019(Static354.aBooleanArray30[82] ? 1 : 0);
				Static131.aClass6_Sub10_Sub1_2.method3961(local25);
				Static131.aClass6_Sub10_Sub1_2.method3961(Static102.anInt5263);
				Static131.aClass6_Sub10_Sub1_2.method4001(Static338.anInt6174);
				Static131.aClass6_Sub10_Sub1_2.method3961(Static47.anInt922);
				Static343.method5639(true, Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0], Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0], -2, local329.method4714(), 0, local329.method4714(), local329.anIntArray561[0], 0, local329.anIntArray560[0]);
			}
		}
		if (local21 == 42) {
			Static131.aClass6_Sub10_Sub1_2.method2886(150);
			Static131.aClass6_Sub10_Sub1_2.method3976(local18);
			Static131.aClass6_Sub10_Sub1_2.method4025(local15);
			Static131.aClass6_Sub10_Sub1_2.method3984(local25);
			Static210.anInt3844 = 0;
			Static200.aClass132_13 = Static249.method4316(local18);
			Static187.anInt3514 = local15;
		}
		if (local21 == 17) {
			Static194.anInt3669 = Static182.anInt3425;
			Static215.anInt3935 = Static198.anInt3691;
			Static249.anInt4661 = 0;
			Static336.anInt6136 = 2;
			Static131.aClass6_Sub10_Sub1_2.method2886(204);
			Static131.aClass6_Sub10_Sub1_2.method4025(Static252.anInt4705);
			Static131.aClass6_Sub10_Sub1_2.method4025(local15 + Static44.anInt881);
			Static131.aClass6_Sub10_Sub1_2.method4025((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static131.aClass6_Sub10_Sub1_2.method3978(Static354.aBooleanArray30[82] ? 1 : 0);
			Static131.aClass6_Sub10_Sub1_2.method3976(Static30.anInt572);
			Static131.aClass6_Sub10_Sub1_2.method4025(Static300.anInt5672 + local18);
			Static218.method3883(local18, local15, local32);
		}
		if (local21 == 37 || local21 == 1010) {
			Static28.method474(local15, arg0.aString209, local25, local18);
		}
		if (local21 == 10) {
			Static131.aClass6_Sub10_Sub1_2.method2886(42);
			Static131.aClass6_Sub10_Sub1_2.method3976(local18);
			Static131.aClass6_Sub10_Sub1_2.method4025(local25);
			Static131.aClass6_Sub10_Sub1_2.method3984(local15);
			Static210.anInt3844 = 0;
			Static200.aClass132_13 = Static249.method4316(local18);
			Static187.anInt3514 = local15;
		}
		if (local21 == 60) {
			local329 = Static343.aClass44_Sub4_Sub4_Sub1Array1[local25];
			if (local329 != null) {
				Static215.anInt3935 = Static198.anInt3691;
				Static249.anInt4661 = 0;
				Static336.anInt6136 = 2;
				Static194.anInt3669 = Static182.anInt3425;
				Static131.aClass6_Sub10_Sub1_2.method2886(115);
				Static131.aClass6_Sub10_Sub1_2.method3961(local25);
				Static131.aClass6_Sub10_Sub1_2.method3978(Static354.aBooleanArray30[82] ? 1 : 0);
				Static343.method5639(true, Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0], Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0], -2, local329.method4714(), 0, local329.method4714(), local329.anIntArray561[0], 0, local329.anIntArray560[0]);
			}
		}
		if (local21 == 47) {
			Static215.anInt3935 = Static198.anInt3691;
			Static194.anInt3669 = Static182.anInt3425;
			Static249.anInt4661 = 0;
			Static336.anInt6136 = 2;
			Static131.aClass6_Sub10_Sub1_2.method2886(194);
			Static131.aClass6_Sub10_Sub1_2.method3990(Static354.aBooleanArray30[82] ? 1 : 0);
			Static131.aClass6_Sub10_Sub1_2.method4020((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static131.aClass6_Sub10_Sub1_2.method3984(Static44.anInt881 + local15);
			Static131.aClass6_Sub10_Sub1_2.method3984(local18 + Static300.anInt5672);
			Static218.method3883(local18, local15, local32);
		}
		if (local21 == 16) {
			Static131.aClass6_Sub10_Sub1_2.method2886(240);
			Static131.aClass6_Sub10_Sub1_2.method3976(local18);
			Static131.aClass6_Sub10_Sub1_2.method4020(local25);
			Static131.aClass6_Sub10_Sub1_2.method3984(local15);
			Static210.anInt3844 = 0;
			Static200.aClass132_13 = Static249.method4316(local18);
			Static187.anInt3514 = local15;
		}
		if (local21 == 30) {
			Static336.anInt6136 = 2;
			Static249.anInt4661 = 0;
			Static215.anInt3935 = Static198.anInt3691;
			Static194.anInt3669 = Static182.anInt3425;
			Static131.aClass6_Sub10_Sub1_2.method2886(124);
			Static131.aClass6_Sub10_Sub1_2.method3984(Static44.anInt881 + local15);
			Static131.aClass6_Sub10_Sub1_2.method4020(local25);
			Static131.aClass6_Sub10_Sub1_2.method3961(Static300.anInt5672 + local18);
			Static131.aClass6_Sub10_Sub1_2.method4019(Static354.aBooleanArray30[82] ? 1 : 0);
			Static165.method5486(local18, local15);
		}
		if (local21 == 1005) {
			local56 = Static249.method4316(local18);
			if (local56 == null || local56.anIntArray411[local15] < 100000) {
				Static131.aClass6_Sub10_Sub1_2.method2886(1);
				Static131.aClass6_Sub10_Sub1_2.method3984(local25);
			} else {
				Static23.method356(local56.anIntArray411[local15] + " x " + Static211.method3762(local25).aString170);
			}
			Static210.anInt3844 = 0;
			Static200.aClass132_13 = Static249.method4316(local18);
			Static187.anInt3514 = local15;
		}
		if (local21 == 46) {
			local397 = Static239.aClass44_Sub4_Sub4_Sub2Array8[local25];
			if (local397 != null) {
				Static336.anInt6136 = 2;
				Static249.anInt4661 = 0;
				Static215.anInt3935 = Static198.anInt3691;
				Static194.anInt3669 = Static182.anInt3425;
				Static131.aClass6_Sub10_Sub1_2.method2886(70);
				Static131.aClass6_Sub10_Sub1_2.method4019(Static354.aBooleanArray30[82] ? 1 : 0);
				Static131.aClass6_Sub10_Sub1_2.method3961(local25);
				Static343.method5639(true, Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0], Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0], -2, local397.method4714(), 0, local397.method4714(), local397.anIntArray561[0], 0, local397.anIntArray560[0]);
			}
		}
		if (local21 == 21) {
			local329 = Static343.aClass44_Sub4_Sub4_Sub1Array1[local25];
			if (local329 != null) {
				Static336.anInt6136 = 2;
				Static194.anInt3669 = Static182.anInt3425;
				Static249.anInt4661 = 0;
				Static215.anInt3935 = Static198.anInt3691;
				Static131.aClass6_Sub10_Sub1_2.method2886(53);
				Static131.aClass6_Sub10_Sub1_2.method4020(local25);
				Static131.aClass6_Sub10_Sub1_2.method3990(Static354.aBooleanArray30[82] ? 1 : 0);
				Static343.method5639(true, Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0], Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0], -2, local329.method4714(), 0, local329.method4714(), local329.anIntArray561[0], 0, local329.anIntArray560[0]);
			}
		}
		if (local21 == 13) {
			Static249.anInt4661 = 0;
			Static336.anInt6136 = 2;
			Static194.anInt3669 = Static182.anInt3425;
			Static215.anInt3935 = Static198.anInt3691;
			Static131.aClass6_Sub10_Sub1_2.method2886(101);
			Static131.aClass6_Sub10_Sub1_2.method3984(local18 + Static300.anInt5672);
			Static131.aClass6_Sub10_Sub1_2.method3978(Static354.aBooleanArray30[82] ? 1 : 0);
			Static131.aClass6_Sub10_Sub1_2.method3984(local15 + Static44.anInt881);
			Static131.aClass6_Sub10_Sub1_2.method4025((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static218.method3883(local18, local15, local32);
		}
		if (local21 == 39) {
			if (Static115.anInt2157 > 0 && Static354.aBooleanArray30[82] && Static354.aBooleanArray30[81]) {
				Static294.method5028(Static44.anInt881 + local15, Static343.anInt6225, local18 + Static300.anInt5672);
			} else {
				Static194.anInt3669 = Static182.anInt3425;
				Static215.anInt3935 = Static198.anInt3691;
				Static336.anInt6136 = 1;
				Static249.anInt4661 = 0;
				Static131.aClass6_Sub10_Sub1_2.method2886(254);
				Static131.aClass6_Sub10_Sub1_2.method4025(local15 + Static44.anInt881);
				Static131.aClass6_Sub10_Sub1_2.method4025(Static300.anInt5672 + local18);
			}
		}
		if (local21 == 23) {
			Static131.aClass6_Sub10_Sub1_2.method2886(238);
			Static131.aClass6_Sub10_Sub1_2.method3976(local18);
			Static131.aClass6_Sub10_Sub1_2.method3984(local25);
			Static131.aClass6_Sub10_Sub1_2.method3984(local15);
			Static210.anInt3844 = 0;
			Static200.aClass132_13 = Static249.method4316(local18);
			Static187.anInt3514 = local15;
		}
		if (local21 == 45) {
			local397 = Static239.aClass44_Sub4_Sub4_Sub2Array8[local25];
			if (local397 != null) {
				Static215.anInt3935 = Static198.anInt3691;
				Static194.anInt3669 = Static182.anInt3425;
				Static249.anInt4661 = 0;
				Static336.anInt6136 = 2;
				Static131.aClass6_Sub10_Sub1_2.method2886(164);
				Static131.aClass6_Sub10_Sub1_2.method4025(local25);
				Static131.aClass6_Sub10_Sub1_2.method3990(Static354.aBooleanArray30[82] ? 1 : 0);
				Static343.method5639(true, Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0], Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0], -2, local397.method4714(), 0, local397.method4714(), local397.anIntArray561[0], 0, local397.anIntArray560[0]);
			}
		}
		if (local21 == 51) {
			local329 = Static343.aClass44_Sub4_Sub4_Sub1Array1[local25];
			if (local329 != null) {
				Static215.anInt3935 = Static198.anInt3691;
				Static194.anInt3669 = Static182.anInt3425;
				Static336.anInt6136 = 2;
				Static249.anInt4661 = 0;
				Static131.aClass6_Sub10_Sub1_2.method2886(145);
				Static131.aClass6_Sub10_Sub1_2.method4020(local25);
				Static131.aClass6_Sub10_Sub1_2.method3978(Static354.aBooleanArray30[82] ? 1 : 0);
				Static131.aClass6_Sub10_Sub1_2.method3984(Static252.anInt4705);
				Static131.aClass6_Sub10_Sub1_2.method4006(Static30.anInt572);
				Static343.method5639(true, Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0], Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0], -2, local329.method4714(), 0, local329.method4714(), local329.anIntArray561[0], 0, local329.anIntArray560[0]);
			}
		}
		if (local21 == 18) {
			Static194.anInt3669 = Static182.anInt3425;
			Static336.anInt6136 = 1;
			Static215.anInt3935 = Static198.anInt3691;
			Static249.anInt4661 = 0;
			Static131.aClass6_Sub10_Sub1_2.method2886(137);
			Static131.aClass6_Sub10_Sub1_2.method3976(Static30.anInt572);
			Static131.aClass6_Sub10_Sub1_2.method4025(local18 + Static300.anInt5672);
			Static131.aClass6_Sub10_Sub1_2.method4020(local15 + Static44.anInt881);
			Static131.aClass6_Sub10_Sub1_2.method3961(Static252.anInt4705);
			Static343.method5639(true, Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0], Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0], -4, 1, 0, 1, local18, 0, local15);
		}
		if (local21 == 9) {
			Static131.aClass6_Sub10_Sub1_2.method2886(147);
			Static131.aClass6_Sub10_Sub1_2.method3976(local18);
			Static131.aClass6_Sub10_Sub1_2.method3984(Static47.anInt922);
			Static131.aClass6_Sub10_Sub1_2.method3976(Static338.anInt6174);
			Static131.aClass6_Sub10_Sub1_2.method4020(local25);
			Static131.aClass6_Sub10_Sub1_2.method3961(Static102.anInt5263);
			Static131.aClass6_Sub10_Sub1_2.method3984(local15);
			Static210.anInt3844 = 0;
			Static200.aClass132_13 = Static249.method4316(local18);
			Static187.anInt3514 = local15;
		}
		if (local21 == 41) {
			Static249.anInt4661 = 0;
			Static194.anInt3669 = Static182.anInt3425;
			Static215.anInt3935 = Static198.anInt3691;
			Static336.anInt6136 = 2;
			Static131.aClass6_Sub10_Sub1_2.method2886(89);
			Static131.aClass6_Sub10_Sub1_2.method4020(Static47.anInt922);
			Static131.aClass6_Sub10_Sub1_2.method3990(Static354.aBooleanArray30[82] ? 1 : 0);
			Static131.aClass6_Sub10_Sub1_2.method4025(local15 + Static44.anInt881);
			Static131.aClass6_Sub10_Sub1_2.method3963(Static338.anInt6174);
			Static131.aClass6_Sub10_Sub1_2.method4020((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static131.aClass6_Sub10_Sub1_2.method4025(Static300.anInt5672 + local18);
			Static131.aClass6_Sub10_Sub1_2.method4025(Static102.anInt5263);
			Static218.method3883(local18, local15, local32);
		}
		if (local21 == 59) {
			local397 = Static239.aClass44_Sub4_Sub4_Sub2Array8[local25];
			if (local397 != null) {
				Static249.anInt4661 = 0;
				Static336.anInt6136 = 2;
				Static194.anInt3669 = Static182.anInt3425;
				Static215.anInt3935 = Static198.anInt3691;
				Static131.aClass6_Sub10_Sub1_2.method2886(142);
				Static131.aClass6_Sub10_Sub1_2.method3990(Static354.aBooleanArray30[82] ? 1 : 0);
				Static131.aClass6_Sub10_Sub1_2.method4025(local25);
				Static343.method5639(true, Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0], Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0], -2, local397.method4714(), 0, local397.method4714(), local397.anIntArray561[0], 0, local397.anIntArray560[0]);
			}
		}
		if (local21 == 4) {
			Static194.anInt3669 = Static182.anInt3425;
			Static336.anInt6136 = 2;
			Static249.anInt4661 = 0;
			Static215.anInt3935 = Static198.anInt3691;
			Static131.aClass6_Sub10_Sub1_2.method2886(249);
			Static131.aClass6_Sub10_Sub1_2.method4020(Static44.anInt881 + local15);
			Static131.aClass6_Sub10_Sub1_2.method3990(Static354.aBooleanArray30[82] ? 1 : 0);
			Static131.aClass6_Sub10_Sub1_2.method4025(Static300.anInt5672 + local18);
			Static131.aClass6_Sub10_Sub1_2.method3961(local25);
			Static165.method5486(local18, local15);
		}
		if (local21 == 29) {
			local56 = Static6.method131(local18, local15);
			if (local56 != null) {
				Static346.method5704();
				@Pc(2911) Class6_Sub34 local2911 = Static43.method751(local56);
				Static25.method435(local18, local56.anInt3496, local2911.anInt5016, local15, local56.anInt3486, local2911.method4572());
				Static14.anInt257 = 0;
				Static312.aString270 = Static354.method5812(local56);
				if (Static312.aString270 == null) {
					Static312.aString270 = "Null";
				}
				if (local56.aBoolean261) {
					Static303.aString264 = local56.aString150 + "<col=ffffff>";
					return;
				}
				Static303.aString264 = "<col=00ff00>" + local56.aString148 + "<col=ffffff>";
			}
			return;
		}
		if (local21 == 1004) {
			Static336.anInt6136 = 2;
			Static249.anInt4661 = 0;
			Static194.anInt3669 = Static182.anInt3425;
			Static215.anInt3935 = Static198.anInt3691;
			Static131.aClass6_Sub10_Sub1_2.method2886(126);
			Static131.aClass6_Sub10_Sub1_2.method3984(local25);
		}
		if (local21 == 3) {
			local329 = Static343.aClass44_Sub4_Sub4_Sub1Array1[local25];
			if (local329 != null) {
				Static249.anInt4661 = 0;
				Static336.anInt6136 = 2;
				Static194.anInt3669 = Static182.anInt3425;
				Static215.anInt3935 = Static198.anInt3691;
				Static131.aClass6_Sub10_Sub1_2.method2886(49);
				Static131.aClass6_Sub10_Sub1_2.method3968(Static354.aBooleanArray30[82] ? 1 : 0);
				Static131.aClass6_Sub10_Sub1_2.method4020(local25);
				Static343.method5639(true, Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0], Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0], -2, local329.method4714(), 0, local329.method4714(), local329.anIntArray561[0], 0, local329.anIntArray560[0]);
			}
		}
		if (local21 == 2) {
			local397 = Static239.aClass44_Sub4_Sub4_Sub2Array8[local25];
			if (local397 != null) {
				Static249.anInt4661 = 0;
				Static194.anInt3669 = Static182.anInt3425;
				Static336.anInt6136 = 2;
				Static215.anInt3935 = Static198.anInt3691;
				Static131.aClass6_Sub10_Sub1_2.method2886(33);
				Static131.aClass6_Sub10_Sub1_2.method4020(Static47.anInt922);
				Static131.aClass6_Sub10_Sub1_2.method4019(Static354.aBooleanArray30[82] ? 1 : 0);
				Static131.aClass6_Sub10_Sub1_2.method3976(Static338.anInt6174);
				Static131.aClass6_Sub10_Sub1_2.method4025(Static102.anInt5263);
				Static131.aClass6_Sub10_Sub1_2.method4025(local25);
				Static343.method5639(true, Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0], Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0], -2, local397.method4714(), 0, local397.method4714(), local397.anIntArray561[0], 0, local397.anIntArray560[0]);
			}
		}
		if (Static14.anInt257 != 0) {
			Static14.anInt257 = 0;
			Static298.method5108(Static249.method4316(Static338.anInt6174));
		}
		if (Static79.aBoolean97) {
			Static346.method5704();
		}
		if (Static200.aClass132_13 != null && Static210.anInt3844 == 0) {
			Static298.method5108(Static200.aClass132_13);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!mb;III)V")
	public static void method2687(@OriginalArg(0) Class132 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static350.aClass132_20 != null || Static201.aBoolean284 || (arg0 == null || Static137.method2631(arg0) == null)) {
			return;
		}
		Static350.aClass132_20 = arg0;
		Static214.aClass132_14 = Static137.method2631(arg0);
		Static296.anInt5972 = 0;
		Static63.anInt1136 = arg1;
		Static192.aBoolean276 = false;
		Static336.anInt6135 = arg2;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(Z)V")
	public static void method2689() {
		@Pc(8) int local8 = Static227.aByteArrayArray14.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static227.aByteArrayArray14[local10] != null) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < Static71.anInt1342; local20++) {
					if (Static303.anIntArray647[local10] == Static21.anIntArray33[local20]) {
						local18 = local20;
						break;
					}
				}
				if (local18 == -1) {
					Static21.anIntArray33[Static71.anInt1342] = Static303.anIntArray647[local10];
					local18 = Static71.anInt1342++;
				}
				@Pc(60) Class6_Sub10 local60 = new Class6_Sub10(Static227.aByteArrayArray14[local10]);
				@Pc(62) int local62 = 0;
				while (local60.anInt4188 < Static227.aByteArrayArray14[local10].length && local62 < 511 && Static149.anInt2759 < 1023) {
					@Pc(81) int local81 = local62++ << 6 | local18;
					@Pc(85) int local85 = local60.method4021();
					@Pc(89) int local89 = local85 >> 14;
					@Pc(95) int local95 = local85 >> 7 & 0x3F;
					@Pc(99) int local99 = local85 & 0x3F;
					@Pc(111) int local111 = local95 + (Static303.anIntArray647[local10] >> 8) * 64 - Static44.anInt881;
					@Pc(124) int local124 = (Static303.anIntArray647[local10] & 0xFF) * 64 + local99 - Static300.anInt5672;
					@Pc(130) Class18 local130 = Static162.method3235(local60.method4021());
					if (Static239.aClass44_Sub4_Sub4_Sub2Array8[local81] == null && (local130.aByte4 & 0x1) > 0 && local89 == Static77.anInt1421 && local111 >= 0 && local130.anInt409 + local111 < Static153.anInt2883 && local124 >= 0 && local124 + local130.anInt409 < Static246.anInt4606) {
						Static239.aClass44_Sub4_Sub4_Sub2Array8[local81] = new Class44_Sub4_Sub4_Sub2();
						Static239.aClass44_Sub4_Sub4_Sub2Array8[local81].anInt5127 = local81;
						@Pc(179) Class44_Sub4_Sub4_Sub2 local179 = Static239.aClass44_Sub4_Sub4_Sub2Array8[local81];
						Static191.anIntArray428[Static149.anInt2759++] = local81;
						local179.anInt5105 = Static76.anInt2853;
						local179.method4726(local130);
						local179.method4712(local179.aClass18_1.anInt409);
						local179.anInt5121 = local179.aClass18_1.anInt388 << 3;
						if (local179.anInt5121 == 0) {
							local179.method4715(0);
						} else {
							local179.method4715(Static310.anIntArray658[local179.aClass18_1.aByte1 - 1]);
						}
						local179.method4708(local111, local179.method4714(), local124, true, local89);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "f", descriptor = "(I)Z")
	public static boolean method2690() throws IOException {
		if (Static216.aClass11_5 == null) {
			return false;
		}
		@Pc(15) int local15 = Static216.aClass11_5.method160();
		if (local15 == 0) {
			return false;
		}
		if (Static336.anInt6134 == -1) {
			Static216.aClass11_5.method164(aClass6_Sub10_Sub1_3.aByteArray67, 1, 0);
			aClass6_Sub10_Sub1_3.anInt4188 = 0;
			Static336.anInt6134 = aClass6_Sub10_Sub1_3.method2889();
			Static31.anInt578 = Static214.anIntArray460[Static336.anInt6134];
			local15--;
		}
		if (Static31.anInt578 == -1) {
			if (local15 <= 0) {
				return false;
			}
			Static216.aClass11_5.method164(aClass6_Sub10_Sub1_3.aByteArray67, 1, 0);
			Static31.anInt578 = aClass6_Sub10_Sub1_3.aByteArray67[0] & 0xFF;
			local15--;
		}
		if (Static31.anInt578 == -2) {
			if (local15 <= 1) {
				return false;
			}
			Static216.aClass11_5.method164(aClass6_Sub10_Sub1_3.aByteArray67, 2, 0);
			aClass6_Sub10_Sub1_3.anInt4188 = 0;
			local15 -= 2;
			Static31.anInt578 = aClass6_Sub10_Sub1_3.method4021();
		}
		if (local15 < Static31.anInt578) {
			return false;
		}
		aClass6_Sub10_Sub1_3.anInt4188 = 0;
		Static216.aClass11_5.method164(aClass6_Sub10_Sub1_3.aByteArray67, Static31.anInt578, 0);
		Static303.anInt5738 = 0;
		Static24.anInt387 = Static334.anInt6115;
		Static334.anInt6115 = Static242.anInt4533;
		Static242.anInt4533 = Static336.anInt6134;
		@Pc(130) int local130;
		if (Static336.anInt6134 == 20) {
			local130 = aClass6_Sub10_Sub1_3.method4021();
			@Pc(134) byte local134 = aClass6_Sub10_Sub1_3.method3992();
			Static37.method639(local134, local130);
			Static336.anInt6134 = -1;
			return true;
		}
		@Pc(153) int local153;
		@Pc(160) String local160;
		@Pc(149) String local149;
		if (Static336.anInt6134 == 49) {
			local149 = aClass6_Sub10_Sub1_3.method4023();
			local153 = aClass6_Sub10_Sub1_3.method4021();
			local160 = Static333.method5536(local153).method2150(aClass6_Sub10_Sub1_3);
			Static156.method5548(null, local149, 19, local153, 0, local160, local149);
			Static336.anInt6134 = -1;
			return true;
		} else if (Static336.anInt6134 == 25) {
			for (local130 = 0; local130 < Static343.aClass44_Sub4_Sub4_Sub1Array1.length; local130++) {
				if (Static343.aClass44_Sub4_Sub4_Sub1Array1[local130] != null) {
					Static343.aClass44_Sub4_Sub4_Sub1Array1[local130].anInt5099 = -1;
				}
			}
			for (local153 = 0; local153 < Static239.aClass44_Sub4_Sub4_Sub2Array8.length; local153++) {
				if (Static239.aClass44_Sub4_Sub4_Sub2Array8[local153] != null) {
					Static239.aClass44_Sub4_Sub4_Sub2Array8[local153].anInt5099 = -1;
				}
			}
			Static336.anInt6134 = -1;
			return true;
		} else if (Static336.anInt6134 == 160) {
			Static52.anInt1004 = aClass6_Sub10_Sub1_3.method3972();
			Static126.anInt2340 = aClass6_Sub10_Sub1_3.method3972();
			Static196.anInt3676 = aClass6_Sub10_Sub1_3.method3972();
			Static336.anInt6134 = -1;
			return true;
		} else if (Static336.anInt6134 == 40) {
			Static289.method4943();
			Static203.method3670();
			Static318.anInt5889 += 32;
			Static336.anInt6134 = -1;
			return true;
		} else if (Static336.anInt6134 == 35) {
			Static281.method4844();
			Static336.anInt6134 = -1;
			return true;
		} else if (Static336.anInt6134 == 23) {
			if (Static62.anInt1131 != -1) {
				Static296.method5396(Static62.anInt1131, 0);
			}
			Static336.anInt6134 = -1;
			return true;
		} else {
			@Pc(295) boolean local295;
			@Pc(299) String local299;
			@Pc(312) long local312;
			@Pc(321) int local321;
			@Pc(317) long local317;
			@Pc(325) int local325;
			@Pc(388) String local388;
			if (Static336.anInt6134 == 128) {
				local295 = aClass6_Sub10_Sub1_3.method3972() == 1;
				local299 = aClass6_Sub10_Sub1_3.method4023();
				local160 = local299;
				if (local295) {
					local160 = aClass6_Sub10_Sub1_3.method4023();
				}
				local312 = aClass6_Sub10_Sub1_3.method4021();
				local317 = aClass6_Sub10_Sub1_3.method3996();
				local321 = aClass6_Sub10_Sub1_3.method3972();
				local325 = aClass6_Sub10_Sub1_3.method4021();
				@Pc(331) long local331 = (local312 << 32) + local317;
				@Pc(333) boolean local333 = false;
				@Pc(335) int local335 = 0;
				while (true) {
					if (local335 >= 100) {
						if (local321 <= 1 && Static137.method2628(local160)) {
							local333 = true;
						}
						break;
					}
					if (Static176.aLongArray6[local335] == local331) {
						local333 = true;
						break;
					}
					local335++;
				}
				if (!local333 && Static260.anInt4772 == 0) {
					Static176.aLongArray6[Static197.anInt5288] = local331;
					Static197.anInt5288 = (Static197.anInt5288 + 1) % 100;
					local388 = Static333.method5536(local325).method2150(aClass6_Sub10_Sub1_3);
					if (local321 == 2) {
						Static156.method5548(null, "<img=1>" + local160, 18, local325, 0, local388, "<img=1>" + local299);
					} else if (local321 == 1) {
						Static156.method5548(null, "<img=0>" + local160, 18, local325, 0, local388, "<img=0>" + local299);
					} else {
						Static156.method5548(null, local160, 18, local325, 0, local388, local299);
					}
				}
				Static336.anInt6134 = -1;
				return true;
			} else if (Static336.anInt6134 == 7) {
				Static138.anInt4575 = aClass6_Sub10_Sub1_3.method3977();
				Static149.anInt2752 = aClass6_Sub10_Sub1_3.method3972();
				Static336.anInt6134 = -1;
				return true;
			} else if (Static336.anInt6134 == 173) {
				local130 = aClass6_Sub10_Sub1_3.method3972();
				if (aClass6_Sub10_Sub1_3.method3972() == 0) {
					Static46.aClass169Array1[local130] = new Class169();
				} else {
					aClass6_Sub10_Sub1_3.anInt4188--;
					Static46.aClass169Array1[local130] = new Class169(aClass6_Sub10_Sub1_3);
				}
				Static336.anInt6134 = -1;
				Static168.anInt841 = Static234.anInt36;
				return true;
			} else {
				@Pc(525) int local525;
				if (Static336.anInt6134 == 4) {
					local130 = aClass6_Sub10_Sub1_3.method3995();
					local299 = aClass6_Sub10_Sub1_3.method4023();
					local525 = aClass6_Sub10_Sub1_3.method3995();
					if (Static300.method5159(local130)) {
						Static320.method5355(local525, local299);
					}
					Static336.anInt6134 = -1;
					return true;
				} else if (Static336.anInt6134 == 72) {
					Static352.method5771(Static308.aClass206_5, Static31.anInt578, aClass6_Sub10_Sub1_3);
					Static336.anInt6134 = -1;
					return true;
				} else if (Static336.anInt6134 == 66) {
					local130 = aClass6_Sub10_Sub1_3.method3979();
					local153 = aClass6_Sub10_Sub1_3.method4021();
					local525 = aClass6_Sub10_Sub1_3.method4021();
					if (Static300.method5159(local525)) {
						Static177.method3433(local153, local130);
					}
					Static336.anInt6134 = -1;
					return true;
				} else if (Static336.anInt6134 == 80) {
					Static88.method1490(true);
					Static336.anInt6134 = -1;
					return true;
				} else {
					@Pc(612) int local612;
					@Pc(625) int local625;
					@Pc(631) int local631;
					@Pc(662) Class6_Sub34 local662;
					@Pc(647) Class6_Sub34 local647;
					@Pc(641) long local641;
					if (Static336.anInt6134 == 220) {
						local130 = aClass6_Sub10_Sub1_3.method4005();
						local153 = aClass6_Sub10_Sub1_3.method3979();
						local525 = aClass6_Sub10_Sub1_3.method4021();
						if (local525 == 65535) {
							local525 = -1;
						}
						local612 = aClass6_Sub10_Sub1_3.method4021();
						if (local612 == 65535) {
							local612 = -1;
						}
						local625 = aClass6_Sub10_Sub1_3.method3994();
						if (Static300.method5159(local625)) {
							for (local631 = local612; local631 <= local525; local631++) {
								local641 = ((long) local153 << 32) + (long) local631;
								local647 = (Class6_Sub34) Static126.aClass108_18.method2900(local641);
								if (local647 != null) {
									local662 = new Class6_Sub34(local130, local647.anInt5016);
									local647.method5756();
								} else if (local631 == -1) {
									local662 = new Class6_Sub34(local130, Static249.method4316(local153).aClass6_Sub34_1.anInt5016);
								} else {
									local662 = new Class6_Sub34(local130, -1);
								}
								Static126.aClass108_18.method2898(local641, local662);
							}
						}
						Static336.anInt6134 = -1;
						return true;
					}
					@Pc(723) Class132 local723;
					if (Static336.anInt6134 == 255) {
						local130 = aClass6_Sub10_Sub1_3.method3979();
						local153 = aClass6_Sub10_Sub1_3.method4021();
						if (local130 < -70000) {
							local153 += 32768;
						}
						if (local130 < 0) {
							local723 = null;
						} else {
							local723 = Static249.method4316(local130);
						}
						while (aClass6_Sub10_Sub1_3.anInt4188 < Static31.anInt578) {
							local612 = aClass6_Sub10_Sub1_3.method4017();
							local625 = aClass6_Sub10_Sub1_3.method4021();
							local631 = 0;
							if (local625 != 0) {
								local631 = aClass6_Sub10_Sub1_3.method3972();
								if (local631 == 255) {
									local631 = aClass6_Sub10_Sub1_3.method3979();
								}
							}
							if (local723 != null && local612 >= 0 && local612 < local723.anIntArray414.length) {
								local723.anIntArray414[local612] = local625;
								local723.anIntArray411[local612] = local631;
							}
							Static25.method436(local612, local631, local153, local625 - 1);
						}
						if (local723 != null) {
							Static298.method5108(local723);
						}
						Static203.method3670();
						Static221.anIntArray471[Static94.anInt1733++ & 0x1F] = local153 & 0x7FFF;
						Static336.anInt6134 = -1;
						return true;
					}
					@Pc(1024) int local1024;
					@Pc(855) boolean local855;
					@Pc(1017) int local1017;
					@Pc(1052) int local1052;
					@Pc(853) String local853;
					@Pc(1106) String local1106;
					@Pc(1088) String local1088;
					if (Static336.anInt6134 == 59) {
						local295 = aClass6_Sub10_Sub1_3.method3972() == 1;
						local299 = aClass6_Sub10_Sub1_3.method4023();
						local160 = aClass6_Sub10_Sub1_3.method4023();
						local612 = aClass6_Sub10_Sub1_3.method4021();
						local625 = aClass6_Sub10_Sub1_3.method3972();
						local853 = "";
						local855 = false;
						if (local612 > 0) {
							local853 = aClass6_Sub10_Sub1_3.method4023();
							local855 = aClass6_Sub10_Sub1_3.method3972() == 1;
						}
						for (local321 = 0; local321 < Static57.anInt1094; local321++) {
							if (local295) {
								if (local160.equals(Static86.aStringArray11[local321])) {
									Static86.aStringArray11[local321] = local299;
									Static328.aStringArray42[local321] = local160;
									local299 = null;
									break;
								}
							} else if (local299.equals(Static86.aStringArray11[local321])) {
								if (Static31.anIntArray63[local321] != local612) {
									Static31.anIntArray63[local321] = local612;
									if (local612 > 0) {
										Static247.method4080(5, "", local299 + Static209.aString165, "", 0);
									}
									if (local612 == 0) {
										Static247.method4080(5, "", local299 + Static217.aString172, "", 0);
									}
								}
								Static328.aStringArray42[local321] = local160;
								Static295.aStringArray36[local321] = local853;
								Static108.anIntArray272[local321] = local625;
								local299 = null;
								Static354.aBooleanArray29[local321] = local855;
								break;
							}
						}
						if (local299 != null && Static57.anInt1094 < 200) {
							Static86.aStringArray11[Static57.anInt1094] = local299;
							Static328.aStringArray42[Static57.anInt1094] = local160;
							Static31.anIntArray63[Static57.anInt1094] = local612;
							Static295.aStringArray36[Static57.anInt1094] = local853;
							Static108.anIntArray272[Static57.anInt1094] = local625;
							Static354.aBooleanArray29[Static57.anInt1094] = local855;
							Static57.anInt1094++;
						}
						Static138.anInt4574 = Static234.anInt36;
						local1017 = Static57.anInt1094;
						while (local1017 > 0) {
							@Pc(1021) boolean local1021 = true;
							local1017--;
							for (local1024 = 0; local1024 < local1017; local1024++) {
								if (Static31.anIntArray63[local1024] != Static181.anInt3403 && Static181.anInt3403 == Static31.anIntArray63[local1024 + 1] || Static31.anIntArray63[local1024] == 0 && Static31.anIntArray63[local1024 + 1] != 0) {
									local1052 = Static31.anIntArray63[local1024];
									Static31.anIntArray63[local1024] = Static31.anIntArray63[local1024 + 1];
									Static31.anIntArray63[local1024 + 1] = local1052;
									local388 = Static295.aStringArray36[local1024];
									Static295.aStringArray36[local1024] = Static295.aStringArray36[local1024 + 1];
									Static295.aStringArray36[local1024 + 1] = local388;
									local1088 = Static86.aStringArray11[local1024];
									Static86.aStringArray11[local1024] = Static86.aStringArray11[local1024 + 1];
									Static86.aStringArray11[local1024 + 1] = local1088;
									local1106 = Static328.aStringArray42[local1024];
									Static328.aStringArray42[local1024] = Static328.aStringArray42[local1024 + 1];
									Static328.aStringArray42[local1024 + 1] = local1106;
									@Pc(1124) int local1124 = Static108.anIntArray272[local1024];
									Static108.anIntArray272[local1024] = Static108.anIntArray272[local1024 + 1];
									Static108.anIntArray272[local1024 + 1] = local1124;
									@Pc(1142) boolean local1142 = Static354.aBooleanArray29[local1024];
									Static354.aBooleanArray29[local1024] = Static354.aBooleanArray29[local1024 + 1];
									local1021 = false;
									Static354.aBooleanArray29[local1024 + 1] = local1142;
								}
							}
							if (local1021) {
								break;
							}
						}
						Static336.anInt6134 = -1;
						return true;
					} else if (Static336.anInt6134 == 56) {
						local130 = aClass6_Sub10_Sub1_3.method3972();
						local153 = local130 >> 5;
						local525 = local130 & 0x1F;
						if (local525 == 0) {
							Static330.aClass154Array1[local153] = null;
							Static336.anInt6134 = -1;
							return true;
						}
						@Pc(1210) Class154 local1210 = new Class154();
						local1210.anInt4211 = local525;
						local1210.anInt4219 = aClass6_Sub10_Sub1_3.method3972();
						if (local1210.anInt4219 >= 0 && local1210.anInt4219 < Static94.aClass40Array16.length) {
							if (local1210.anInt4211 == 1 || local1210.anInt4211 == 10) {
								local1210.anInt4206 = aClass6_Sub10_Sub1_3.method4021();
								aClass6_Sub10_Sub1_3.anInt4188 += 5;
							} else if (local1210.anInt4211 >= 2 && local1210.anInt4211 <= 6) {
								if (local1210.anInt4211 == 2) {
									local1210.anInt4205 = 64;
									local1210.anInt4214 = 64;
								}
								if (local1210.anInt4211 == 3) {
									local1210.anInt4205 = 0;
									local1210.anInt4214 = 64;
								}
								if (local1210.anInt4211 == 4) {
									local1210.anInt4205 = 128;
									local1210.anInt4214 = 64;
								}
								if (local1210.anInt4211 == 5) {
									local1210.anInt4214 = 0;
									local1210.anInt4205 = 64;
								}
								if (local1210.anInt4211 == 6) {
									local1210.anInt4214 = 128;
									local1210.anInt4205 = 64;
								}
								local1210.anInt4211 = 2;
								local1210.anInt4208 = aClass6_Sub10_Sub1_3.method4021();
								local1210.anInt4212 = aClass6_Sub10_Sub1_3.method4021();
								local1210.anInt4213 = aClass6_Sub10_Sub1_3.method3972();
								local1210.anInt4204 = aClass6_Sub10_Sub1_3.method4021();
							}
							local1210.anInt4216 = aClass6_Sub10_Sub1_3.method4021();
							if (local1210.anInt4216 == 65535) {
								local1210.anInt4216 = -1;
							}
							Static330.aClass154Array1[local153] = local1210;
						}
						Static336.anInt6134 = -1;
						return true;
					} else if (Static336.anInt6134 == 54) {
						local130 = aClass6_Sub10_Sub1_3.method4021();
						local153 = aClass6_Sub10_Sub1_3.method3979();
						if (Static300.method5159(local130)) {
							@Pc(1380) Class6_Sub30 local1380 = (Class6_Sub30) Static197.aClass108_30.method2900((long) local153);
							if (local1380 != null) {
								Static103.method2104(true, false, local1380);
							}
							if (Static109.aClass132_7 != null) {
								Static298.method5108(Static109.aClass132_7);
								Static109.aClass132_7 = null;
							}
						}
						Static336.anInt6134 = -1;
						return true;
					} else {
						@Pc(1419) String local1419;
						@Pc(1417) String local1417;
						if (Static336.anInt6134 == 187) {
							local130 = aClass6_Sub10_Sub1_3.method4017();
							local153 = aClass6_Sub10_Sub1_3.method3979();
							local525 = aClass6_Sub10_Sub1_3.method3972();
							local1417 = "";
							local1419 = local1417;
							if ((local525 & 0x1) != 0) {
								local1417 = aClass6_Sub10_Sub1_3.method4023();
								if ((local525 & 0x2) == 0) {
									local1419 = local1417;
								} else {
									local1419 = aClass6_Sub10_Sub1_3.method4023();
								}
							}
							local853 = aClass6_Sub10_Sub1_3.method4023();
							if (local130 == 99) {
								Static297.method5064(local853);
							} else if (local1419.equals("") || !Static137.method2628(local1419)) {
								Static247.method4080(local130, local1417, local853, local1419, local153);
							} else {
								Static336.anInt6134 = -1;
								return true;
							}
							Static336.anInt6134 = -1;
							return true;
						} else if (Static336.anInt6134 == 116) {
							local130 = aClass6_Sub10_Sub1_3.method3979();
							local153 = aClass6_Sub10_Sub1_3.method3995();
							Static169.method3300(local153, local130);
							Static336.anInt6134 = -1;
							return true;
						} else if (Static336.anInt6134 == 43) {
							local130 = aClass6_Sub10_Sub1_3.method4021();
							if (Static300.method5159(local130)) {
								Static191.method3588();
							}
							Static336.anInt6134 = -1;
							return true;
						} else if (Static336.anInt6134 == 16) {
							local130 = aClass6_Sub10_Sub1_3.method3994();
							local153 = aClass6_Sub10_Sub1_3.method3994();
							local525 = aClass6_Sub10_Sub1_3.method3994();
							if (Static300.method5159(local130)) {
								Static264.method4479(local525, local153);
							}
							Static336.anInt6134 = -1;
							return true;
						} else if (Static336.anInt6134 == 123) {
							Static88.method1490(false);
							Static336.anInt6134 = -1;
							return true;
						} else if (Static336.anInt6134 == 41) {
							local295 = aClass6_Sub10_Sub1_3.method3972() == 1;
							local299 = aClass6_Sub10_Sub1_3.method4023();
							local160 = local299;
							if (local295) {
								local160 = aClass6_Sub10_Sub1_3.method4023();
							}
							local312 = aClass6_Sub10_Sub1_3.method4021();
							local317 = aClass6_Sub10_Sub1_3.method3996();
							local321 = aClass6_Sub10_Sub1_3.method3972();
							@Pc(1601) long local1601 = local317 + (local312 << 32);
							@Pc(1603) boolean local1603 = false;
							local1052 = 0;
							while (true) {
								if (local1052 >= 100) {
									if (local321 <= 1) {
										if (Static78.aBoolean95 && !Static344.aBoolean415 || Static281.aBoolean368) {
											local1603 = true;
										} else if (Static137.method2628(local160)) {
											local1603 = true;
										}
									}
									break;
								}
								if (local1601 == Static176.aLongArray6[local1052]) {
									local1603 = true;
									break;
								}
								local1052++;
							}
							if (!local1603 && Static260.anInt4772 == 0) {
								Static176.aLongArray6[Static197.anInt5288] = local1601;
								Static197.anInt5288 = (Static197.anInt5288 + 1) % 100;
								@Pc(1675) String local1675 = Static86.method1477(Static118.method2411(Static344.method5644(aClass6_Sub10_Sub1_3)));
								if (local321 == 2) {
									Static156.method5548(null, "<img=1>" + local160, 7, -1, 0, local1675, "<img=1>" + local299);
								} else if (local321 == 1) {
									Static156.method5548(null, "<img=0>" + local160, 7, -1, 0, local1675, "<img=0>" + local299);
								} else {
									Static156.method5548(null, local160, 3, -1, 0, local1675, local299);
								}
							}
							Static336.anInt6134 = -1;
							return true;
						} else if (Static336.anInt6134 == 100) {
							Static340.anInt654 = aClass6_Sub10_Sub1_3.method3994() * 30;
							Static107.anInt1992 = Static234.anInt36;
							Static336.anInt6134 = -1;
							return true;
						} else if (Static336.anInt6134 == 113) {
							local130 = aClass6_Sub10_Sub1_3.method4021();
							local153 = aClass6_Sub10_Sub1_3.method4021();
							local525 = aClass6_Sub10_Sub1_3.method4021();
							local612 = aClass6_Sub10_Sub1_3.method4021();
							if (Static300.method5159(local130) && Static81.aClass132ArrayArray1[local153] != null) {
								for (local625 = local525; local625 < local612; local625++) {
									local631 = aClass6_Sub10_Sub1_3.method3996();
									if (Static81.aClass132ArrayArray1[local153].length > local625 && Static81.aClass132ArrayArray1[local153][local625] != null) {
										Static81.aClass132ArrayArray1[local153][local625].anInt3556 = local631;
									}
								}
							}
							Static336.anInt6134 = -1;
							return true;
						} else {
							@Pc(1873) int local1873;
							if (Static336.anInt6134 == 179) {
								local130 = aClass6_Sub10_Sub1_3.method3989();
								local153 = aClass6_Sub10_Sub1_3.method3989();
								local525 = aClass6_Sub10_Sub1_3.method3989();
								local612 = aClass6_Sub10_Sub1_3.method4003();
								if (local612 >> 30 == 0) {
									@Pc(1982) Class166 local1982;
									@Pc(2007) Class24 local2007;
									@Pc(2033) Class24 local2033;
									@Pc(1987) Class166 local1987;
									@Pc(2002) Class24 local2002;
									if (local612 >> 29 != 0) {
										local625 = local612 & 0xFFFF;
										@Pc(2141) Class44_Sub4_Sub4_Sub2 local2141 = Static239.aClass44_Sub4_Sub4_Sub2Array8[local625];
										if (local2141 != null) {
											if (local153 == 65535) {
												local153 = -1;
											}
											local855 = true;
											if (local153 != -1 && local2141.anInt5148 != -1) {
												if (local2141.anInt5148 == local153) {
													local1982 = Static62.method999(local153);
													if (local1982.aBoolean336 && local1982.anInt4753 != -1) {
														local2033 = Static209.method3737(local1982.anInt4753);
														local1017 = local2033.anInt574;
														if (local1017 == 0 || local1017 == 2) {
															local855 = false;
														} else if (local1017 == 1) {
															local855 = true;
														}
													}
												} else {
													local1982 = Static62.method999(local153);
													local1987 = Static62.method999(local2141.anInt5148);
													if (local1982.anInt4753 != -1 && local1987.anInt4753 != -1) {
														local2002 = Static209.method3737(local1982.anInt4753);
														local2007 = Static209.method3737(local1987.anInt4753);
														if (local2007.anInt588 > local2002.anInt588) {
															local855 = false;
														}
													}
												}
											}
											if (local855) {
												local2141.anInt5122 = 0;
												local2141.anInt5088 = local525 + Static76.anInt2853;
												local2141.anInt5147 = 1;
												local2141.anInt5148 = local153;
												local2141.anInt5107 = 0;
												local2141.anInt5139 = local130;
												if (Static76.anInt2853 < local2141.anInt5088) {
													local2141.anInt5107 = -1;
												}
												if (local2141.anInt5148 != -1 && local2141.anInt5088 == Static76.anInt2853) {
													local321 = Static62.method999(local2141.anInt5148).anInt4753;
													if (local321 != -1) {
														local2033 = Static209.method3737(local321);
														if (local2033 != null && local2033.anIntArray64 != null) {
															Static203.method3667(0, local2141.anInt6339, local2033, local2141.anInt6340, false);
														}
													}
												}
											}
										}
									} else if (local612 >> 28 != 0) {
										local625 = local612 & 0xFFFF;
										@Pc(1947) Class44_Sub4_Sub4_Sub1 local1947;
										if (Static44.anInt879 == local625) {
											local1947 = Static253.aClass44_Sub4_Sub4_Sub1_1;
										} else {
											local1947 = Static343.aClass44_Sub4_Sub4_Sub1Array1[local625];
										}
										if (local1947 != null) {
											if (local153 == 65535) {
												local153 = -1;
											}
											local855 = true;
											if (local153 != -1 && local1947.anInt5148 != -1) {
												if (local1947.anInt5148 == local153) {
													local1982 = Static62.method999(local153);
													if (local1982.aBoolean336 && local1982.anInt4753 != -1) {
														local2033 = Static209.method3737(local1982.anInt4753);
														local1017 = local2033.anInt574;
														if (local1017 == 0 || local1017 == 2) {
															local855 = false;
														} else if (local1017 == 1) {
															local855 = true;
														}
													}
												} else {
													local1982 = Static62.method999(local153);
													local1987 = Static62.method999(local1947.anInt5148);
													if (local1982.anInt4753 != -1 && local1987.anInt4753 != -1) {
														local2002 = Static209.method3737(local1982.anInt4753);
														local2007 = Static209.method3737(local1987.anInt4753);
														if (local2002.anInt588 < local2007.anInt588) {
															local855 = false;
														}
													}
												}
											}
											if (local855) {
												local1947.anInt5088 = local525 + Static76.anInt2853;
												local1947.anInt5139 = local130;
												local1947.anInt5148 = local153;
												local1947.anInt5122 = 0;
												local1947.anInt5107 = 0;
												local1947.anInt5147 = 1;
												if (Static76.anInt2853 < local1947.anInt5088) {
													local1947.anInt5107 = -1;
												}
												if (local1947.anInt5148 == 65535) {
													local1947.anInt5148 = -1;
												}
												if (local1947.anInt5148 != -1 && Static76.anInt2853 == local1947.anInt5088) {
													local321 = Static62.method999(local1947.anInt5148).anInt4753;
													if (local321 != -1) {
														local2033 = Static209.method3737(local321);
														if (local2033 != null && local2033.anIntArray64 != null) {
															Static203.method3667(0, local1947.anInt6339, local2033, local1947.anInt6340, local1947 == Static253.aClass44_Sub4_Sub4_Sub1_1);
														}
													}
												}
											}
										}
									}
								} else {
									local625 = local612 >> 28 & 0x3;
									local631 = (local612 >> 14 & 0x3FFF) - Static44.anInt881;
									local1873 = (local612 & 0x3FFF) - Static300.anInt5672;
									if (local631 >= 0 && local1873 >= 0 && Static153.anInt2883 > local631 && Static246.anInt4606 > local1873) {
										local321 = local631 * 128 + 64;
										local325 = local1873 * 128 + 64;
										@Pc(1916) Class44_Sub4_Sub2 local1916 = new Class44_Sub4_Sub2(local153, 0, Static76.anInt2853, local625, local321, Static306.method5249(local325, local321, local625) - local130, local325, local631, local631, local1873, local1873);
										Static280.aClass211_32.method5585(new Class6_Sub2_Sub4(local1916));
									}
								}
								Static336.anInt6134 = -1;
								return true;
							} else if (Static336.anInt6134 == 28) {
								local130 = aClass6_Sub10_Sub1_3.method3977();
								local153 = aClass6_Sub10_Sub1_3.method3989();
								if (local153 == 65535) {
									local153 = -1;
								}
								Static28.method462(local130, local153);
								Static336.anInt6134 = -1;
								return true;
							} else if (Static336.anInt6134 == 230) {
								local130 = aClass6_Sub10_Sub1_3.method3989();
								if (local130 == 65535) {
									local130 = -1;
								}
								local153 = aClass6_Sub10_Sub1_3.method4011();
								local525 = aClass6_Sub10_Sub1_3.method3962();
								Static327.method3203(local153, local525, local130);
								Static336.anInt6134 = -1;
								return true;
							} else if (Static336.anInt6134 == 197) {
								local130 = aClass6_Sub10_Sub1_3.method3972();
								local153 = aClass6_Sub10_Sub1_3.method3995();
								if (local153 == 65535) {
									local153 = -1;
								}
								local160 = aClass6_Sub10_Sub1_3.method4023();
								local612 = aClass6_Sub10_Sub1_3.method3972();
								if (local130 >= 1 && local130 <= 8) {
									if (local160.equalsIgnoreCase("null")) {
										local160 = null;
									}
									Static325.aStringArray41[local130 - 1] = local160;
									Static278.anIntArray661[local130 - 1] = local153;
									Static230.aBooleanArray25[local130 - 1] = local612 == 0;
								}
								Static336.anInt6134 = -1;
								return true;
							} else if (Static336.anInt6134 == 235) {
								if (Static31.anInt578 == 0) {
									Static171.aString132 = Static295.aString252;
								} else {
									Static171.aString132 = aClass6_Sub10_Sub1_3.method4023();
								}
								Static336.anInt6134 = -1;
								return true;
							} else if (Static336.anInt6134 == 68) {
								local130 = aClass6_Sub10_Sub1_3.method3979();
								@Pc(2479) Class132 local2479 = Static249.method4316(local130);
								for (local525 = 0; local525 < local2479.anIntArray414.length; local525++) {
									local2479.anIntArray414[local525] = -1;
									local2479.anIntArray414[local525] = 0;
								}
								Static298.method5108(local2479);
								Static336.anInt6134 = -1;
								return true;
							} else if (Static336.anInt6134 == 162) {
								local130 = aClass6_Sub10_Sub1_3.method3994();
								local153 = aClass6_Sub10_Sub1_3.method4003();
								local525 = aClass6_Sub10_Sub1_3.method3985();
								if (Static300.method5159(local130)) {
									Static66.method1124(local153, local525);
								}
								Static336.anInt6134 = -1;
								return true;
							} else if (Static336.anInt6134 == 15) {
								local130 = aClass6_Sub10_Sub1_3.method3994();
								local299 = aClass6_Sub10_Sub1_3.method4023();
								local525 = aClass6_Sub10_Sub1_3.method3994();
								if (Static300.method5159(local130)) {
									Static320.method5355(local525, local299);
								}
								Static336.anInt6134 = -1;
								return true;
							} else if (Static336.anInt6134 == 74) {
								Static63.method1030();
								Static336.anInt6134 = -1;
								return false;
							} else if (Static336.anInt6134 == 223) {
								local130 = aClass6_Sub10_Sub1_3.method4022();
								local153 = aClass6_Sub10_Sub1_3.method4003();
								local525 = aClass6_Sub10_Sub1_3.method3989();
								local612 = aClass6_Sub10_Sub1_3.method3967();
								if (Static300.method5159(local525)) {
									Static28.method465(local130, local612, local153);
								}
								Static336.anInt6134 = -1;
								return true;
							} else if (Static336.anInt6134 == 75) {
								Static71.anInt1344 = aClass6_Sub10_Sub1_3.method3972();
								for (local130 = 0; local130 < Static71.anInt1344; local130++) {
									Static39.aStringArray3[local130] = aClass6_Sub10_Sub1_3.method4023();
									Static238.aStringArray34[local130] = aClass6_Sub10_Sub1_3.method4023();
									if (Static238.aStringArray34[local130].equals("")) {
										Static238.aStringArray34[local130] = Static39.aStringArray3[local130];
									}
									Static215.aStringArray26[local130] = aClass6_Sub10_Sub1_3.method4023();
									Static76.aStringArray18[local130] = aClass6_Sub10_Sub1_3.method4023();
									if (Static76.aStringArray18[local130].equals("")) {
										Static76.aStringArray18[local130] = Static215.aStringArray26[local130];
									}
									Static125.aBooleanArray21[local130] = false;
								}
								Static138.anInt4574 = Static234.anInt36;
								Static336.anInt6134 = -1;
								return true;
							} else if (Static336.anInt6134 == 247) {
								local130 = aClass6_Sub10_Sub1_3.method3972();
								@Pc(2708) boolean local2708 = (local130 & 0x1) == 1;
								local160 = aClass6_Sub10_Sub1_3.method4023();
								local1417 = aClass6_Sub10_Sub1_3.method4023();
								local1419 = aClass6_Sub10_Sub1_3.method4023();
								local853 = aClass6_Sub10_Sub1_3.method4023();
								if (local2708) {
									for (local1873 = 0; local1873 < Static71.anInt1344; local1873++) {
										if (Static238.aStringArray34[local1873].equals(local853)) {
											Static39.aStringArray3[local1873] = local160;
											if (local1417.equals("")) {
												Static238.aStringArray34[local1873] = local160;
											} else {
												Static238.aStringArray34[local1873] = local1417;
											}
											Static215.aStringArray26[local1873] = local1419;
											if (local853.equals("")) {
												Static76.aStringArray18[local1873] = local1419;
											} else {
												Static76.aStringArray18[local1873] = local853;
											}
											break;
										}
									}
								} else {
									Static39.aStringArray3[Static71.anInt1344] = local160;
									if (local1417.equals("")) {
										Static238.aStringArray34[Static71.anInt1344] = local160;
									} else {
										Static238.aStringArray34[Static71.anInt1344] = local1417;
									}
									Static215.aStringArray26[Static71.anInt1344] = local1419;
									if (local853.equals("")) {
										Static76.aStringArray18[Static71.anInt1344] = local1419;
									} else {
										Static76.aStringArray18[Static71.anInt1344] = local853;
									}
									Static125.aBooleanArray21[Static71.anInt1344] = (local130 & 0x2) == 2;
									Static71.anInt1344++;
								}
								Static138.anInt4574 = Static234.anInt36;
								Static336.anInt6134 = -1;
								return true;
							} else if (Static336.anInt6134 == 30) {
								if (Static90.aFrame1 != null) {
									Static54.method944(false, -1, Static182.anInt3432, -1);
								}
								@Pc(2853) byte[] local2853 = new byte[Static31.anInt578];
								aClass6_Sub10_Sub1_3.method2879(Static31.anInt578, local2853);
								local299 = Static322.method4786(Static31.anInt578, local2853, 0);
								Static116.method2345(Static13.anInt232 == 1, Static308.aClass206_5, local299, true);
								Static336.anInt6134 = -1;
								return true;
							} else if (Static336.anInt6134 == 11) {
								local130 = aClass6_Sub10_Sub1_3.method4021();
								local153 = aClass6_Sub10_Sub1_3.method3972();
								local525 = aClass6_Sub10_Sub1_3.method3989();
								if (Static300.method5159(local525)) {
									if (local153 == 2) {
										Static241.method5351();
									}
									Static62.anInt1131 = local130;
									Static259.method4412(local130);
									Static222.method3938(false);
									Static140.method2656(Static62.anInt1131);
									for (local612 = 0; local612 < 100; local612++) {
										Static103.aBooleanArray18[local612] = true;
									}
								}
								Static336.anInt6134 = -1;
								return true;
							} else if (Static336.anInt6134 == 110) {
								local130 = aClass6_Sub10_Sub1_3.method3972();
								local153 = aClass6_Sub10_Sub1_3.method3972();
								if (local130 == 255) {
									local153 = -1;
									local130 = -1;
								}
								Static269.method4643(local153, local130);
								Static336.anInt6134 = -1;
								return true;
							} else {
								@Pc(3091) Class183 local3091;
								if (Static336.anInt6134 == 225) {
									local149 = aClass6_Sub10_Sub1_3.method4023();
									@Pc(2982) boolean local2982 = aClass6_Sub10_Sub1_3.method3972() == 1;
									if (local2982) {
										local299 = aClass6_Sub10_Sub1_3.method4023();
									} else {
										local299 = local149;
									}
									local612 = aClass6_Sub10_Sub1_3.method4021();
									@Pc(3000) byte local3000 = aClass6_Sub10_Sub1_3.method3992();
									@Pc(3002) boolean local3002 = false;
									if (local3000 == -128) {
										local3002 = true;
									}
									if (local3002) {
										if (Static61.anInt1127 == 0) {
											Static336.anInt6134 = -1;
											return true;
										}
										for (local1873 = 0; local1873 < Static61.anInt1127 && (!Static233.aClass183Array1[local1873].aString231.equals(local299) || local612 != Static233.aClass183Array1[local1873].anInt5400); local1873++) {
										}
										if (Static61.anInt1127 > local1873) {
											while (Static61.anInt1127 - 1 > local1873) {
												Static233.aClass183Array1[local1873] = Static233.aClass183Array1[local1873 + 1];
												local1873++;
											}
											Static61.anInt1127--;
											Static233.aClass183Array1[Static61.anInt1127] = null;
										}
									} else {
										@Pc(3087) String local3087 = aClass6_Sub10_Sub1_3.method4023();
										local3091 = new Class183();
										local3091.aString234 = local149;
										local3091.aByte76 = local3000;
										local3091.aString233 = local3087;
										local3091.anInt5400 = local612;
										local3091.aString231 = local299;
										for (local325 = Static61.anInt1127 - 1; local325 >= 0; local325--) {
											local1017 = Static233.aClass183Array1[local325].aString231.compareTo(local3091.aString231);
											if (local1017 == 0) {
												Static233.aClass183Array1[local325].anInt5400 = local612;
												Static233.aClass183Array1[local325].aByte76 = local3000;
												Static233.aClass183Array1[local325].aString233 = local3087;
												if (local299.equals(Static253.aClass44_Sub4_Sub4_Sub1_1.aString207)) {
													Static208.aByte89 = local3000;
												}
												Static336.anInt6134 = -1;
												Static255.anInt4732 = Static234.anInt36;
												return true;
											}
											if (local1017 < 0) {
												break;
											}
										}
										if (Static61.anInt1127 >= Static233.aClass183Array1.length) {
											Static336.anInt6134 = -1;
											return true;
										}
										for (local1017 = Static61.anInt1127 - 1; local1017 > local325; local1017--) {
											Static233.aClass183Array1[local1017 + 1] = Static233.aClass183Array1[local1017];
										}
										if (Static61.anInt1127 == 0) {
											Static233.aClass183Array1 = new Class183[100];
										}
										Static233.aClass183Array1[local325 + 1] = local3091;
										Static61.anInt1127++;
										if (local299.equals(Static253.aClass44_Sub4_Sub4_Sub1_1.aString207)) {
											Static208.aByte89 = local3000;
										}
									}
									Static336.anInt6134 = -1;
									Static255.anInt4732 = Static234.anInt36;
									return true;
								} else if (Static336.anInt6134 == 198) {
									local130 = aClass6_Sub10_Sub1_3.method4021();
									if (Static300.method5159(local130)) {
										Static271.method4600();
									}
									Static336.anInt6134 = -1;
									return true;
								} else if (Static336.anInt6134 == 226) {
									local130 = aClass6_Sub10_Sub1_3.method4011();
									local153 = local130 >> 2;
									local525 = local130 & 0x3;
									local612 = Static348.anIntArray718[local153];
									local625 = aClass6_Sub10_Sub1_3.method3989();
									if (local625 == 65535) {
										local625 = -1;
									}
									local631 = aClass6_Sub10_Sub1_3.method4005();
									local1873 = local631 >> 28 & 0x3;
									local321 = local631 >> 14 & 0x3FFF;
									local325 = local631 & 0x3FFF;
									@Pc(3304) int local3304 = local321 - Static44.anInt881;
									local325 -= Static300.anInt5672;
									Static309.method5279(local325, local3304, local153, local1873, local612, local625, local525);
									Static336.anInt6134 = -1;
									return true;
								} else if (Static336.anInt6134 == 77) {
									local130 = aClass6_Sub10_Sub1_3.method3994();
									local153 = aClass6_Sub10_Sub1_3.method4021();
									local525 = aClass6_Sub10_Sub1_3.method3995();
									local612 = aClass6_Sub10_Sub1_3.method4021();
									local625 = aClass6_Sub10_Sub1_3.method3987();
									if (Static300.method5159(local525)) {
										Static171.method3326(local625, local612, local130, local153);
									}
									Static336.anInt6134 = -1;
									return true;
								} else if (Static336.anInt6134 == 48) {
									Static340.anInt657 = aClass6_Sub10_Sub1_3.method3972();
									Static336.anInt6134 = -1;
									return true;
								} else if (Static336.anInt6134 == 45) {
									local130 = aClass6_Sub10_Sub1_3.method3987();
									Static232.aClass196_5 = Static308.aClass206_5.method5515(local130);
									Static336.anInt6134 = -1;
									return true;
								} else if (Static336.anInt6134 == 214) {
									local130 = aClass6_Sub10_Sub1_3.method3972();
									local153 = aClass6_Sub10_Sub1_3.method3995();
									Static169.method3300(local153, local130);
									Static336.anInt6134 = -1;
									return true;
								} else if (Static336.anInt6134 == 131) {
									local130 = aClass6_Sub10_Sub1_3.method4005();
									local153 = aClass6_Sub10_Sub1_3.method3979();
									local525 = aClass6_Sub10_Sub1_3.method3995();
									local612 = aClass6_Sub10_Sub1_3.method4021();
									if (local612 == 65535) {
										local612 = -1;
									}
									if (Static300.method5159(local525)) {
										@Pc(3452) Class132 local3452 = Static249.method4316(local130);
										@Pc(3472) Class147 local3472;
										if (local3452.aBoolean261) {
											Static270.method4573(local130, local153, local612);
											local3472 = Static211.method3762(local612);
											Static171.method3326(local130, local3472.anInt3950, local3472.anInt3959, local3472.anInt3941);
											Static148.method2895(local3472.anInt3957, local130, local3472.anInt3944, local3472.anInt4000);
										} else if (local612 == -1) {
											Static336.anInt6134 = -1;
											local3452.anInt3553 = 0;
											return true;
										} else {
											local3472 = Static211.method3762(local612);
											local3452.anInt3553 = 4;
											local3452.anInt3569 = local3472.anInt3950 * 100 / local153;
											local3452.anInt3512 = local3472.anInt3959;
											local3452.anInt3570 = local3472.anInt3941;
											local3452.anInt3558 = local612;
											Static298.method5108(local3452);
										}
									}
									Static336.anInt6134 = -1;
									return true;
								} else if (Static336.anInt6134 == 50) {
									local130 = aClass6_Sub10_Sub1_3.method3972();
									local153 = aClass6_Sub10_Sub1_3.method3989();
									local525 = aClass6_Sub10_Sub1_3.method3995();
									@Pc(3551) Class44_Sub4_Sub4_Sub2 local3551 = Static239.aClass44_Sub4_Sub4_Sub2Array8[local153];
									if (local3551 != null) {
										Static262.method4417(local3551, local130, local525);
									}
									Static336.anInt6134 = -1;
									return true;
								} else if (Static336.anInt6134 == 81) {
									Static263.method4433(aClass6_Sub10_Sub1_3.method4023());
									Static336.anInt6134 = -1;
									return true;
								} else if (Static336.anInt6134 == 217) {
									local130 = aClass6_Sub10_Sub1_3.method4021();
									local153 = aClass6_Sub10_Sub1_3.method3972();
									local525 = aClass6_Sub10_Sub1_3.method3972();
									local612 = aClass6_Sub10_Sub1_3.method4021();
									local625 = aClass6_Sub10_Sub1_3.method3972();
									local631 = aClass6_Sub10_Sub1_3.method3972();
									if (Static300.method5159(local130)) {
										Static342.method5631(true, local625, local153, local631, local525, local612);
									}
									Static336.anInt6134 = -1;
									return true;
								} else if (Static336.anInt6134 == 96) {
									local130 = aClass6_Sub10_Sub1_3.method3980();
									local153 = aClass6_Sub10_Sub1_3.method3977();
									local525 = aClass6_Sub10_Sub1_3.method4011();
									Static343.anInt6225 = local153 >> 1;
									Static253.aClass44_Sub4_Sub4_Sub1_1.method4477(local525, (local153 & 0x1) == 1, Static343.anInt6225, local130);
									Static336.anInt6134 = -1;
									return true;
								} else if (Static336.anInt6134 == 254) {
									local130 = aClass6_Sub10_Sub1_3.method4021();
									Static99.method5559(local130);
									Static221.anIntArray471[Static94.anInt1733++ & 0x1F] = local130 & 0x7FFF;
									Static336.anInt6134 = -1;
									return true;
								} else if (Static336.anInt6134 == 84) {
									local130 = aClass6_Sub10_Sub1_3.method3989();
									local153 = aClass6_Sub10_Sub1_3.method3987();
									Static37.method639(local153, local130);
									Static336.anInt6134 = -1;
									return true;
								} else if (Static336.anInt6134 == 168) {
									Static203.method3670();
									local130 = aClass6_Sub10_Sub1_3.method4005();
									local153 = aClass6_Sub10_Sub1_3.method3972();
									local525 = aClass6_Sub10_Sub1_3.method3980();
									Static135.anIntArray649[local525] = local130;
									Static260.anIntArray526[local525] = local153;
									Static292.anIntArray618[local525] = 1;
									local612 = Static8.anIntArray377[local525] - 1;
									for (local625 = 0; local625 < local612; local625++) {
										if (local130 >= Class44_Sub5_Sub2.anIntArray583[local625]) {
											Static292.anIntArray618[local525] = local625 + 2;
										}
									}
									Static39.anIntArray94[Static59.anInt1109++ & 0x1F] = local525;
									Static336.anInt6134 = -1;
									return true;
								} else {
									@Pc(3819) long local3819;
									if (Static336.anInt6134 == 127) {
										local295 = aClass6_Sub10_Sub1_3.method3972() == 1;
										local299 = aClass6_Sub10_Sub1_3.method4023();
										local160 = local299;
										if (local295) {
											local160 = aClass6_Sub10_Sub1_3.method4023();
										}
										local312 = aClass6_Sub10_Sub1_3.method4016();
										local317 = aClass6_Sub10_Sub1_3.method4021();
										local3819 = aClass6_Sub10_Sub1_3.method3996();
										local1017 = aClass6_Sub10_Sub1_3.method3972();
										@Pc(3829) long local3829 = local3819 + (local317 << 32);
										@Pc(3831) boolean local3831 = false;
										@Pc(3833) int local3833 = 0;
										while (true) {
											if (local3833 >= 100) {
												if (local1017 <= 1) {
													if (Static78.aBoolean95 && !Static344.aBoolean415 || Static281.aBoolean368) {
														local3831 = true;
													} else if (Static137.method2628(local160)) {
														local3831 = true;
													}
												}
												break;
											}
											if (Static176.aLongArray6[local3833] == local3829) {
												local3831 = true;
												break;
											}
											local3833++;
										}
										if (!local3831 && Static260.anInt4772 == 0) {
											Static176.aLongArray6[Static197.anInt5288] = local3829;
											Static197.anInt5288 = (Static197.anInt5288 + 1) % 100;
											local1088 = Static86.method1477(Static118.method2411(Static344.method5644(aClass6_Sub10_Sub1_3)));
											if (local1017 == 2 || local1017 == 3) {
												Static156.method5548(Static225.method3955(local312), "<img=1>" + local160, 9, -1, 0, local1088, "<img=1>" + local299);
											} else if (local1017 == 1) {
												Static156.method5548(Static225.method3955(local312), "<img=0>" + local160, 9, -1, 0, local1088, "<img=0>" + local299);
											} else {
												Static156.method5548(Static225.method3955(local312), local160, 9, -1, 0, local1088, local299);
											}
										}
										Static336.anInt6134 = -1;
										return true;
									} else if (Static336.anInt6134 == 151) {
										local130 = aClass6_Sub10_Sub1_3.method4003();
										local153 = aClass6_Sub10_Sub1_3.method4021();
										if (local153 == 65535) {
											local153 = -1;
										}
										local525 = aClass6_Sub10_Sub1_3.method3995();
										if (Static300.method5159(local525)) {
											Static354.method5811(local153, 2, local130, -1);
										}
										Static336.anInt6134 = -1;
										return true;
									} else if (Static336.anInt6134 == 120) {
										Static149.anInt2752 = aClass6_Sub10_Sub1_3.method3980();
										Static138.anInt4575 = aClass6_Sub10_Sub1_3.method3980();
										while (aClass6_Sub10_Sub1_3.anInt4188 < Static31.anInt578) {
											Static336.anInt6134 = aClass6_Sub10_Sub1_3.method3972();
											Static124.method2461();
										}
										Static336.anInt6134 = -1;
										return true;
									} else if (Static336.anInt6134 == 88) {
										local130 = aClass6_Sub10_Sub1_3.method3994();
										local153 = aClass6_Sub10_Sub1_3.method3989();
										local525 = aClass6_Sub10_Sub1_3.method4003();
										if (Static300.method5159(local130)) {
											Static323.method5375(local525, local153);
										}
										Static336.anInt6134 = -1;
										return true;
									} else if (Static336.anInt6134 == 94) {
										local130 = aClass6_Sub10_Sub1_3.method4021();
										local153 = aClass6_Sub10_Sub1_3.method4021();
										local525 = aClass6_Sub10_Sub1_3.method4005();
										local612 = aClass6_Sub10_Sub1_3.method3989();
										if (Static300.method5159(local130)) {
											Static322.method4789(local153 + (local612 << 16), local525);
										}
										Static336.anInt6134 = -1;
										return true;
									} else if (Static336.anInt6134 == 136) {
										local130 = aClass6_Sub10_Sub1_3.method3994();
										local153 = aClass6_Sub10_Sub1_3.method4021();
										local525 = aClass6_Sub10_Sub1_3.method3994();
										local612 = aClass6_Sub10_Sub1_3.method3989();
										local625 = aClass6_Sub10_Sub1_3.method4005();
										if (Static300.method5159(local612)) {
											Static354.method5811(local130 | local153 << 16, 7, local625, local525);
										}
										Static336.anInt6134 = -1;
										return true;
									} else if (Static336.anInt6134 == 93) {
										local130 = aClass6_Sub10_Sub1_3.method3994();
										local153 = aClass6_Sub10_Sub1_3.method4021();
										local525 = aClass6_Sub10_Sub1_3.method3987();
										if (Static300.method5159(local153)) {
											Static106.method2148(local525, local130);
										}
										Static336.anInt6134 = -1;
										return true;
									} else if (Static336.anInt6134 == 241) {
										local130 = aClass6_Sub10_Sub1_3.method4005();
										local153 = aClass6_Sub10_Sub1_3.method3989();
										local525 = aClass6_Sub10_Sub1_3.method4021();
										if (Static300.method5159(local153)) {
											Static211.method3761(local130, local525);
										}
										Static336.anInt6134 = -1;
										return true;
									} else if (Static336.anInt6134 == 142) {
										local130 = aClass6_Sub10_Sub1_3.method4021();
										if (local130 == 65535) {
											local130 = -1;
										}
										local153 = aClass6_Sub10_Sub1_3.method3972();
										local525 = aClass6_Sub10_Sub1_3.method4021();
										local612 = aClass6_Sub10_Sub1_3.method3972();
										Static103.method2102(local612, local525, local153, local130);
										Static336.anInt6134 = -1;
										return true;
									} else if (Static336.anInt6134 == 52) {
										local130 = aClass6_Sub10_Sub1_3.method4021();
										local153 = aClass6_Sub10_Sub1_3.method3994();
										@Pc(4262) byte local4262 = aClass6_Sub10_Sub1_3.method3992();
										if (Static300.method5159(local153)) {
											Static211.method3761(local4262, local130);
										}
										Static336.anInt6134 = -1;
										return true;
									} else if (Static336.anInt6134 == 117) {
										local149 = aClass6_Sub10_Sub1_3.method4023();
										local299 = Static86.method1477(Static118.method2411(Static344.method5644(aClass6_Sub10_Sub1_3)));
										Static247.method4080(6, local149, local299, local149, 0);
										Static336.anInt6134 = -1;
										return true;
									} else if (Static336.anInt6134 == 181) {
										local130 = aClass6_Sub10_Sub1_3.method3995();
										local153 = aClass6_Sub10_Sub1_3.method4021();
										if (local153 == 65535) {
											local153 = -1;
										}
										local525 = aClass6_Sub10_Sub1_3.method3987();
										if (Static300.method5159(local130)) {
											Static354.method5811(local153, 1, local525, -1);
										}
										Static336.anInt6134 = -1;
										return true;
									} else if (Static336.anInt6134 == 206) {
										Static138.anInt4575 = aClass6_Sub10_Sub1_3.method3972();
										Static149.anInt2752 = aClass6_Sub10_Sub1_3.method3977();
										for (@Pc(4354) Class6_Sub8 local4354 = (Class6_Sub8) Static33.aClass108_3.method2903(); local4354 != null; local4354 = (Class6_Sub8) Static33.aClass108_3.method2905()) {
											local153 = (int) (local4354.aLong218 & 0x3FFFL);
											local525 = (int) (local4354.aLong218 >> 14 & 0x3FFFL);
											local612 = (int) (local4354.aLong218 >> 28 & 0x3L);
											if (local612 == Static343.anInt6225 && local153 >= Static149.anInt2752 && Static149.anInt2752 + 8 > local153 && Static138.anInt4575 <= local525 && local525 < Static138.anInt4575 + 8) {
												local4354.method5756();
												Static226.method4028(local153, local525, Static343.anInt6225);
											}
										}
										for (@Pc(4421) Class6_Sub5 local4421 = (Class6_Sub5) Static261.aClass211_30.method5594(); local4421 != null; local4421 = (Class6_Sub5) Static261.aClass211_30.method5582()) {
											if (local4421.anInt514 >= Static149.anInt2752 && Static149.anInt2752 + 8 > local4421.anInt514 && local4421.anInt517 >= Static138.anInt4575 && Static138.anInt4575 + 8 > local4421.anInt517 && local4421.anInt513 == Static343.anInt6225) {
												local4421.anInt509 = 0;
											}
										}
										Static336.anInt6134 = -1;
										return true;
									} else if (Static336.anInt6134 == 172) {
										Static255.anInt4732 = Static234.anInt36;
										if (Static31.anInt578 == 0) {
											Static336.anInt6134 = -1;
											Static288.aString238 = null;
											Static221.aString176 = null;
											Static233.aClass183Array1 = null;
											Static61.anInt1127 = 0;
											return true;
										}
										Static221.aString176 = aClass6_Sub10_Sub1_3.method4023();
										local295 = aClass6_Sub10_Sub1_3.method3972() == 1;
										if (local295) {
											aClass6_Sub10_Sub1_3.method4023();
										}
										@Pc(4520) long local4520 = aClass6_Sub10_Sub1_3.method4016();
										Static288.aString238 = Static252.method4318(local4520);
										Static95.aByte21 = aClass6_Sub10_Sub1_3.method3992();
										local612 = aClass6_Sub10_Sub1_3.method3972();
										if (local612 == 255) {
											Static336.anInt6134 = -1;
											return true;
										}
										Static61.anInt1127 = local612;
										@Pc(4546) Class183[] local4546 = new Class183[100];
										for (local631 = 0; local631 < Static61.anInt1127; local631++) {
											local4546[local631] = new Class183();
											local4546[local631].aString234 = aClass6_Sub10_Sub1_3.method4023();
											local295 = aClass6_Sub10_Sub1_3.method3972() == 1;
											if (local295) {
												local4546[local631].aString231 = aClass6_Sub10_Sub1_3.method4023();
											} else {
												local4546[local631].aString231 = local4546[local631].aString234;
											}
											local4546[local631].anInt5400 = aClass6_Sub10_Sub1_3.method4021();
											local4546[local631].aByte76 = aClass6_Sub10_Sub1_3.method3992();
											local4546[local631].aString233 = aClass6_Sub10_Sub1_3.method4023();
											if (local4546[local631].aString231.equals(Static253.aClass44_Sub4_Sub4_Sub1_1.aString207)) {
												Static208.aByte89 = local4546[local631].aByte76;
											}
										}
										local325 = Static61.anInt1127;
										while (local325 > 0) {
											local325--;
											local855 = true;
											for (local1017 = 0; local1017 < local325; local1017++) {
												if (local4546[local1017].aString234.compareTo(local4546[local1017 + 1].aString234) > 0) {
													local3091 = local4546[local1017];
													local4546[local1017] = local4546[local1017 + 1];
													local4546[local1017 + 1] = local3091;
													local855 = false;
												}
											}
											if (local855) {
												break;
											}
										}
										Static336.anInt6134 = -1;
										Static233.aClass183Array1 = local4546;
										return true;
									} else if (Static336.anInt6134 == 112) {
										Static203.method3670();
										Static319.anInt5901 = aClass6_Sub10_Sub1_3.method4022();
										Static336.anInt6134 = -1;
										Static107.anInt1992 = Static234.anInt36;
										return true;
									} else if (Static336.anInt6134 == 213 || Static336.anInt6134 == 146 || Static336.anInt6134 == 118 || Static336.anInt6134 == 39 || Static336.anInt6134 == 62 || Static336.anInt6134 == 205 || Static336.anInt6134 == 238 || Static336.anInt6134 == 174 || Static336.anInt6134 == 200 || Static336.anInt6134 == 196 || Static336.anInt6134 == 86 || Static336.anInt6134 == 119 || Static336.anInt6134 == 189 || Static336.anInt6134 == 53 || Static336.anInt6134 == 165) {
										Static124.method2461();
										Static336.anInt6134 = -1;
										return true;
									} else if (Static336.anInt6134 == 8) {
										local295 = aClass6_Sub10_Sub1_3.method3972() == 1;
										local299 = aClass6_Sub10_Sub1_3.method4023();
										local160 = local299;
										if (local295) {
											local160 = aClass6_Sub10_Sub1_3.method4023();
										}
										local312 = aClass6_Sub10_Sub1_3.method4016();
										local317 = aClass6_Sub10_Sub1_3.method4021();
										local3819 = aClass6_Sub10_Sub1_3.method3996();
										local1017 = aClass6_Sub10_Sub1_3.method3972();
										local1024 = aClass6_Sub10_Sub1_3.method4021();
										@Pc(4831) long local4831 = local3819 + (local317 << 32);
										@Pc(4833) boolean local4833 = false;
										@Pc(4835) int local4835 = 0;
										while (true) {
											if (local4835 >= 100) {
												if (local1017 <= 1 && Static137.method2628(local160)) {
													local4833 = true;
												}
												break;
											}
											if (local4831 == Static176.aLongArray6[local4835]) {
												local4833 = true;
												break;
											}
											local4835++;
										}
										if (!local4833 && Static260.anInt4772 == 0) {
											Static176.aLongArray6[Static197.anInt5288] = local4831;
											Static197.anInt5288 = (Static197.anInt5288 + 1) % 100;
											local1106 = Static333.method5536(local1024).method2150(aClass6_Sub10_Sub1_3);
											if (local1017 == 2) {
												Static156.method5548(Static225.method3955(local312), "<img=1>" + local160, 20, local1024, 0, local1106, "<img=1>" + local299);
											} else if (local1017 == 1) {
												Static156.method5548(Static225.method3955(local312), "<img=0>" + local160, 20, local1024, 0, local1106, "<img=0>" + local299);
											} else {
												Static156.method5548(Static225.method3955(local312), local160, 20, local1024, 0, local1106, local299);
											}
										}
										Static336.anInt6134 = -1;
										return true;
									} else if (Static336.anInt6134 == 26) {
										local130 = aClass6_Sub10_Sub1_3.method4021();
										local299 = aClass6_Sub10_Sub1_3.method4023();
										@Pc(4975) Object[] local4975 = new Object[local299.length() + 1];
										for (local612 = local299.length() - 1; local612 >= 0; local612--) {
											if (local299.charAt(local612) == 's') {
												local4975[local612 + 1] = aClass6_Sub10_Sub1_3.method4023();
											} else {
												local4975[local612 + 1] = Integer.valueOf(aClass6_Sub10_Sub1_3.method3979());
											}
										}
										local4975[0] = Integer.valueOf(aClass6_Sub10_Sub1_3.method3979());
										if (Static300.method5159(local130)) {
											@Pc(5031) Class6_Sub15 local5031 = new Class6_Sub15();
											local5031.anObjectArray2 = local4975;
											Static140.method2654(local5031);
										}
										Static336.anInt6134 = -1;
										return true;
									} else if (Static336.anInt6134 == 101) {
										local130 = aClass6_Sub10_Sub1_3.method4021();
										local153 = aClass6_Sub10_Sub1_3.method3972();
										local525 = aClass6_Sub10_Sub1_3.method3972();
										local612 = aClass6_Sub10_Sub1_3.method3972();
										local625 = aClass6_Sub10_Sub1_3.method3972();
										local631 = aClass6_Sub10_Sub1_3.method4021();
										if (Static300.method5159(local130)) {
											Static345.aBooleanArray28[local153] = true;
											Static108.anIntArray273[local153] = local525;
											Static150.anIntArray346[local153] = local612;
											Static278.anIntArray660[local153] = local625;
											Static311.anIntArray664[local153] = local631;
										}
										Static336.anInt6134 = -1;
										return true;
									} else if (Static336.anInt6134 == 95) {
										local130 = aClass6_Sub10_Sub1_3.method3989();
										local299 = aClass6_Sub10_Sub1_3.method4023();
										local525 = aClass6_Sub10_Sub1_3.method3979();
										if (Static300.method5159(local130)) {
											Static115.method2320(local525, local299);
										}
										Static336.anInt6134 = -1;
										return true;
									} else if (Static336.anInt6134 == 216) {
										local130 = aClass6_Sub10_Sub1_3.method3989();
										local153 = aClass6_Sub10_Sub1_3.method3995();
										if (local153 == 65535) {
											local153 = -1;
										}
										local525 = aClass6_Sub10_Sub1_3.method3994();
										if (local525 == 65535) {
											local525 = -1;
										}
										local612 = aClass6_Sub10_Sub1_3.method4021();
										local625 = aClass6_Sub10_Sub1_3.method4003();
										if (Static300.method5159(local612)) {
											for (local631 = local525; local631 <= local153; local631++) {
												local641 = (long) local631 + ((long) local625 << 32);
												local647 = (Class6_Sub34) Static126.aClass108_18.method2900(local641);
												if (local647 != null) {
													local662 = new Class6_Sub34(local647.anInt5011, local130);
													local647.method5756();
												} else if (local631 == -1) {
													local662 = new Class6_Sub34(Static249.method4316(local625).aClass6_Sub34_1.anInt5011, local130);
												} else {
													local662 = new Class6_Sub34(0, local130);
												}
												Static126.aClass108_18.method2898(local641, local662);
											}
										}
										Static336.anInt6134 = -1;
										return true;
									} else if (Static336.anInt6134 == 102) {
										for (local130 = 0; local130 < Static41.anIntArray721.length; local130++) {
											if (Static41.anIntArray720[local130] != Static41.anIntArray721[local130]) {
												Static41.anIntArray721[local130] = Static41.anIntArray720[local130];
												Static145.method2740(local130);
												Static308.anIntArray654[Static318.anInt5889++ & 0x1F] = local130;
											}
										}
										Static336.anInt6134 = -1;
										return true;
									} else if (Static336.anInt6134 == 91) {
										local130 = aClass6_Sub10_Sub1_3.method4021();
										local153 = aClass6_Sub10_Sub1_3.method3972();
										local525 = aClass6_Sub10_Sub1_3.method3972();
										local612 = aClass6_Sub10_Sub1_3.method4021();
										local625 = aClass6_Sub10_Sub1_3.method3972();
										local631 = aClass6_Sub10_Sub1_3.method3972();
										if (Static300.method5159(local130)) {
											Static187.method3522(local631, local525, local625, local612, local153);
										}
										Static336.anInt6134 = -1;
										return true;
									} else if (Static336.anInt6134 == 124) {
										aClass6_Sub10_Sub1_3.anInt4188 += 28;
										if (aClass6_Sub10_Sub1_3.method3965()) {
											Static263.method4435(aClass6_Sub10_Sub1_3, aClass6_Sub10_Sub1_3.anInt4188 - 28);
										}
										Static336.anInt6134 = -1;
										return true;
									} else if (Static336.anInt6134 == 190) {
										local130 = aClass6_Sub10_Sub1_3.method3994();
										local153 = aClass6_Sub10_Sub1_3.method4003();
										if (Static300.method5159(local130)) {
											Static354.method5811(2047, 5, local153, 0);
										}
										Static336.anInt6134 = -1;
										return true;
									} else {
										@Pc(5423) Class6_Sub30 local5423;
										if (Static336.anInt6134 == 85) {
											local130 = aClass6_Sub10_Sub1_3.method3972();
											local153 = aClass6_Sub10_Sub1_3.method4003();
											local525 = aClass6_Sub10_Sub1_3.method4021();
											local612 = aClass6_Sub10_Sub1_3.method3989();
											if (Static300.method5159(local612)) {
												local5423 = (Class6_Sub30) Static197.aClass108_30.method2900((long) local153);
												if (local5423 != null) {
													Static103.method2104(local525 != local5423.anInt4313, false, local5423);
												}
												Static111.method2245(local130, false, local525, local153);
											}
											Static336.anInt6134 = -1;
											return true;
										} else if (Static336.anInt6134 == 83) {
											local130 = aClass6_Sub10_Sub1_3.method3979();
											local153 = aClass6_Sub10_Sub1_3.method4005();
											local525 = aClass6_Sub10_Sub1_3.method3989();
											if (Static300.method5159(local525)) {
												@Pc(5481) Class6_Sub30 local5481 = (Class6_Sub30) Static197.aClass108_30.method2900((long) local130);
												local5423 = (Class6_Sub30) Static197.aClass108_30.method2900((long) local153);
												if (local5423 != null) {
													Static103.method2104(local5481 == null || local5481.anInt4313 != local5423.anInt4313, false, local5423);
												}
												if (local5481 != null) {
													local5481.method5756();
													Static197.aClass108_30.method2898((long) local153, local5481);
												}
												@Pc(5521) Class132 local5521 = Static249.method4316(local130);
												if (local5521 != null) {
													Static298.method5108(local5521);
												}
												local5521 = Static249.method4316(local153);
												if (local5521 != null) {
													Static298.method5108(local5521);
													Static189.method3558(local5521, true);
												}
												if (Static62.anInt1131 != -1) {
													Static296.method5396(Static62.anInt1131, 1);
												}
											}
											Static336.anInt6134 = -1;
											return true;
										} else if (Static336.anInt6134 == 218) {
											local130 = aClass6_Sub10_Sub1_3.method3994();
											local153 = aClass6_Sub10_Sub1_3.method3987();
											if (Static300.method5159(local130)) {
												Static354.method5811(-1, 3, local153, -1);
											}
											Static336.anInt6134 = -1;
											return true;
										} else if (Static336.anInt6134 == 134) {
											local130 = aClass6_Sub10_Sub1_3.method3994();
											local153 = aClass6_Sub10_Sub1_3.method4011();
											if (Static300.method5159(local130)) {
												Static81.anInt1466 = local153;
											}
											Static336.anInt6134 = -1;
											return true;
										} else if (Static336.anInt6134 == 171) {
											local130 = aClass6_Sub10_Sub1_3.method3979();
											local153 = aClass6_Sub10_Sub1_3.method4021();
											if (local130 < -70000) {
												local153 += 32768;
											}
											if (local130 < 0) {
												local723 = null;
											} else {
												local723 = Static249.method4316(local130);
											}
											if (local723 != null) {
												for (local612 = 0; local612 < local723.anIntArray414.length; local612++) {
													local723.anIntArray414[local612] = 0;
													local723.anIntArray411[local612] = 0;
												}
											}
											Static354.method5817(local153);
											local612 = aClass6_Sub10_Sub1_3.method4021();
											for (local625 = 0; local625 < local612; local625++) {
												local631 = aClass6_Sub10_Sub1_3.method3972();
												if (local631 == 255) {
													local631 = aClass6_Sub10_Sub1_3.method4005();
												}
												local1873 = aClass6_Sub10_Sub1_3.method4021();
												if (local723 != null && local625 < local723.anIntArray414.length) {
													local723.anIntArray414[local625] = local1873;
													local723.anIntArray411[local625] = local631;
												}
												Static25.method436(local625, local631, local153, local1873 - 1);
											}
											if (local723 != null) {
												Static298.method5108(local723);
											}
											Static203.method3670();
											Static221.anIntArray471[Static94.anInt1733++ & 0x1F] = local153 & 0x7FFF;
											Static336.anInt6134 = -1;
											return true;
										} else if (Static336.anInt6134 == 107) {
											local130 = aClass6_Sub10_Sub1_3.method4011();
											local153 = aClass6_Sub10_Sub1_3.method4003();
											local525 = aClass6_Sub10_Sub1_3.method3994();
											if (Static300.method5159(local525)) {
												Static47.method784(local153, local130);
											}
											Static336.anInt6134 = -1;
											return true;
										} else if (Static336.anInt6134 == 169) {
											Static203.method3670();
											Static317.anInt5870 = aClass6_Sub10_Sub1_3.method3972();
											Static336.anInt6134 = -1;
											Static107.anInt1992 = Static234.anInt36;
											return true;
										} else if (Static336.anInt6134 == 79) {
											Static322.method4787();
											Static336.anInt6134 = -1;
											return true;
										} else if (Static336.anInt6134 == 203) {
											local130 = aClass6_Sub10_Sub1_3.method4003();
											local153 = aClass6_Sub10_Sub1_3.method3995();
											local525 = aClass6_Sub10_Sub1_3.method4021();
											local612 = aClass6_Sub10_Sub1_3.method4005();
											if (Static300.method5159(local525)) {
												Static354.method5811(local153, 5, local612, local130);
											}
											Static336.anInt6134 = -1;
											return true;
										} else if (Static336.anInt6134 == 143) {
											Static94.anInt1732 = aClass6_Sub10_Sub1_3.method3972();
											Static336.anInt6134 = -1;
											Static138.anInt4574 = Static234.anInt36;
											return true;
										} else {
											Static346.method5707("T1 - " + Static336.anInt6134 + "," + Static334.anInt6115 + "," + Static24.anInt387 + " - " + Static31.anInt578, null);
											Static63.method1030();
											return true;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
