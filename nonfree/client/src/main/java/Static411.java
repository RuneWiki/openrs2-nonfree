import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!rca", name = "T", descriptor = "Lclient!rk;")
	public static Class249 aClass249_59;

	@OriginalMember(owner = "client!rca", name = "v", descriptor = "I")
	public static int anInt7662 = 0;

	@OriginalMember(owner = "client!rca", name = "w", descriptor = "J")
	public static volatile long aLong184 = 0L;

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(II)V")
	public static void method6442(@OriginalArg(0) int arg0) {
		Static294.anInt5413 = -1;
		Static140.anInt2619 = arg0;
		Static294.anInt5413 = -1;
		Static371.method5897();
	}

	@OriginalMember(owner = "client!rca", name = "e", descriptor = "(B)V")
	public static void method6443() {
		if (Static271.anInt8654 == 8) {
			Static301.method4738(4);
		} else if (Static271.anInt8654 == 4 || Static271.anInt8654 == 5) {
			Static301.method4738(2);
		} else if (Static271.anInt8654 == 11) {
			Static301.method4738(2);
		}
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(III)Z")
	public static boolean method6444(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static261.method4058(arg1, arg0) || Static269.method4299(arg0, arg1);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILclient!ua;BI)V")
	public static void method6445(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub44 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null || Static448.aClass249_63.aClass2_224 == arg1) {
			return;
		}
		@Pc(15) int local15 = arg1.anInt8463;
		@Pc(18) int local18 = arg1.anInt8461;
		@Pc(25) int local25 = arg1.anInt8460;
		@Pc(29) int local29 = (int) arg1.aLong215;
		@Pc(32) long local32 = arg1.aLong215;
		if (local25 >= 2000) {
			local25 -= 2000;
		}
		if (local25 == 60) {
			Static397.anInt7578 = arg2;
			Static515.anInt3810 = 0;
			Static292.anInt5366 = arg0;
			Static142.anInt2630 = 2;
			Static93.method1721(Static426.aClass243_78);
			Static381.aClass2_Sub29_Sub2_2.method5212(Static311.aClass189_1.method4710(82) ? 1 : 0);
			Static381.aClass2_Sub29_Sub2_2.method5228(Static371.anInt6936 + local18);
			Static381.aClass2_Sub29_Sub2_2.method5186(Static238.anInt4280 + local15);
			Static381.aClass2_Sub29_Sub2_2.method5186(local29);
			Static94.method1753(local15, local18);
		}
		if (local25 == 50) {
			Static292.anInt5366 = arg0;
			Static397.anInt7578 = arg2;
			Static515.anInt3810 = 0;
			Static142.anInt2630 = 2;
			Static93.method1721(Static324.aClass243_61);
			Static381.aClass2_Sub29_Sub2_2.method5186(Static371.anInt6936 + local18);
			Static381.aClass2_Sub29_Sub2_2.method5217(local15 + Static238.anInt4280);
			Static381.aClass2_Sub29_Sub2_2.method5212(Static311.aClass189_1.method4710(82) ? 1 : 0);
			Static381.aClass2_Sub29_Sub2_2.method5188(local29);
			Static94.method1753(local15, local18);
		}
		@Pc(146) Class310 local146;
		if (local25 == 18) {
			local146 = Static519.method7538(local18, local15);
			if (local146 != null) {
				Static465.method7011();
				@Pc(153) Class2_Sub39 local153 = Static67.method1257(local146);
				Static260.method4053(local153.anInt7452, local146, local153.method6272());
				Static131.aString66 = Static331.method5295(local146);
				if (Static131.aString66 == null) {
					Static131.aString66 = "Null";
				}
				Static125.aString61 = local146.aString203 + "<col=ffffff>";
			}
			return;
		}
		@Pc(189) Class1_Sub1_Sub2_Sub1 local189;
		if (local25 == 51) {
			local189 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local29];
			if (local189 != null) {
				Static292.anInt5366 = arg0;
				Static515.anInt3810 = 0;
				Static397.anInt7578 = arg2;
				Static142.anInt2630 = 2;
				Static93.method1721(Static84.aClass243_21);
				Static381.aClass2_Sub29_Sub2_2.method5220(Static311.aClass189_1.method4710(82) ? 1 : 0);
				Static381.aClass2_Sub29_Sub2_2.method5228(local29);
				Static318.method5088(true, -2, local189.method4394(), local189.method4394(), 0, local189.anIntArray449[0], local189.anIntArray450[0], 0);
			}
		}
		if (local25 == 19) {
			if (Static475.anInt8486 > 0 && Static311.aClass189_1.method4710(82) && Static311.aClass189_1.method4710(81)) {
				Static161.method2731(Static238.anInt4280 + local15, Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90, local18 + Static371.anInt6936);
			} else {
				Static239.method7444(local29, local15, local18);
				if (local29 == 1) {
					Static381.aClass2_Sub29_Sub2_2.method5172(-1);
					Static381.aClass2_Sub29_Sub2_2.method5172(-1);
					Static381.aClass2_Sub29_Sub2_2.method5217((int) Static161.aFloat56);
					Static381.aClass2_Sub29_Sub2_2.method5172(57);
					Static381.aClass2_Sub29_Sub2_2.method5172(Static87.anInt1767);
					Static381.aClass2_Sub29_Sub2_2.method5172(Static3.anInt111);
					Static381.aClass2_Sub29_Sub2_2.method5172(89);
					Static381.aClass2_Sub29_Sub2_2.method5217(Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7660);
					Static381.aClass2_Sub29_Sub2_2.method5217(Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7659);
					Static381.aClass2_Sub29_Sub2_2.method5172(63);
				} else {
					Static397.anInt7578 = arg2;
					Static515.anInt3810 = 0;
					Static292.anInt5366 = arg0;
					Static142.anInt2630 = 1;
				}
				Static318.method5088(true, -4, 1, 1, 0, local18, local15, 0);
			}
		}
		if (local25 == 15) {
			local146 = Static519.method7538(local18, local15);
			if (local146 != null) {
				Static346.method6461(local146);
			}
		}
		if (local25 == 47) {
			local189 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local29];
			if (local189 != null) {
				Static292.anInt5366 = arg0;
				Static397.anInt7578 = arg2;
				Static142.anInt2630 = 2;
				Static515.anInt3810 = 0;
				Static93.method1721(Static112.aClass243_31);
				Static381.aClass2_Sub29_Sub2_2.method5172(Static311.aClass189_1.method4710(82) ? 1 : 0);
				Static381.aClass2_Sub29_Sub2_2.method5217(local29);
				Static318.method5088(true, -2, local189.method4394(), local189.method4394(), 0, local189.anIntArray449[0], local189.anIntArray450[0], 0);
			}
		}
		if (local25 == 4) {
			Static515.anInt3810 = 0;
			Static292.anInt5366 = arg0;
			Static397.anInt7578 = arg2;
			Static142.anInt2630 = 2;
			Static93.method1721(Static330.aClass243_55);
			Static381.aClass2_Sub29_Sub2_2.method5220(Static311.aClass189_1.method4710(82) ? 1 : 0);
			Static381.aClass2_Sub29_Sub2_2.method5186(Static371.anInt6936 + local18);
			Static381.aClass2_Sub29_Sub2_2.method5188(local29);
			Static381.aClass2_Sub29_Sub2_2.method5228(Static238.anInt4280 + local15);
			Static94.method1753(local15, local18);
		}
		if (local25 == 2 || local25 == 1001) {
			Static72.method1459(local29, local15, local18, arg1.aString179);
		}
		if (local25 == 22) {
			Static292.anInt5366 = arg0;
			Static515.anInt3810 = 0;
			Static142.anInt2630 = 2;
			Static397.anInt7578 = arg2;
			Static93.method1721(Static249.aClass243_53);
			Static381.aClass2_Sub29_Sub2_2.method5186(local29);
			Static381.aClass2_Sub29_Sub2_2.method5186(Static371.anInt6936 + local18);
			Static381.aClass2_Sub29_Sub2_2.method5228(Static238.anInt4280 + local15);
			Static381.aClass2_Sub29_Sub2_2.method5212(Static311.aClass189_1.method4710(82) ? 1 : 0);
			Static94.method1753(local15, local18);
		}
		if (local25 == 1008 || local25 == 1009 || local25 == 1004 || local25 == 1003 || local25 == 1007) {
			Static174.method2896(local25, local15, local29);
		}
		if (local25 == 20) {
			Static292.anInt5366 = arg0;
			Static142.anInt2630 = 2;
			Static397.anInt7578 = arg2;
			Static515.anInt3810 = 0;
			Static93.method1721(Static389.aClass243_74);
			Static381.aClass2_Sub29_Sub2_2.method5188(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static381.aClass2_Sub29_Sub2_2.method5212(Static311.aClass189_1.method4710(82) ? 1 : 0);
			Static381.aClass2_Sub29_Sub2_2.method5217(Static371.anInt6936 + local18);
			Static381.aClass2_Sub29_Sub2_2.method5228(Static238.anInt4280 + local15);
			Static490.method6644(local15, local32, local18);
		}
		if (local25 == 57) {
			Static397.anInt7578 = arg2;
			Static292.anInt5366 = arg0;
			Static142.anInt2630 = 2;
			Static515.anInt3810 = 0;
			Static93.method1721(Static154.aClass243_37);
			Static381.aClass2_Sub29_Sub2_2.method5217(local18 + Static371.anInt6936);
			Static381.aClass2_Sub29_Sub2_2.method5188(Static357.anInt6796);
			Static381.aClass2_Sub29_Sub2_2.method5212(Static311.aClass189_1.method4710(82) ? 1 : 0);
			Static381.aClass2_Sub29_Sub2_2.method5188((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static381.aClass2_Sub29_Sub2_2.method5186(Static238.anInt4280 + local15);
			Static381.aClass2_Sub29_Sub2_2.method5188(Static55.anInt970);
			Static381.aClass2_Sub29_Sub2_2.method5232(Static116.anInt2332);
			Static490.method6644(local15, local32, local18);
		}
		if (local25 == 5) {
			local189 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local29];
			if (local189 != null) {
				Static292.anInt5366 = arg0;
				Static397.anInt7578 = arg2;
				Static515.anInt3810 = 0;
				Static142.anInt2630 = 2;
				Static93.method1721(Static313.aClass243_66);
				Static381.aClass2_Sub29_Sub2_2.method5188(local29);
				Static381.aClass2_Sub29_Sub2_2.method5191(Static311.aClass189_1.method4710(82) ? 1 : 0);
				Static318.method5088(true, -2, local189.method4394(), local189.method4394(), 0, local189.anIntArray449[0], local189.anIntArray450[0], 0);
			}
		}
		if (local25 == 1002) {
			Static515.anInt3810 = 0;
			Static292.anInt5366 = arg0;
			Static142.anInt2630 = 2;
			Static397.anInt7578 = arg2;
			Static93.method1721(Static363.aClass243_14);
			Static381.aClass2_Sub29_Sub2_2.method5217(local29);
		}
		if (local25 == 46) {
			local189 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local29];
			if (local189 != null) {
				Static397.anInt7578 = arg2;
				Static142.anInt2630 = 2;
				Static515.anInt3810 = 0;
				Static292.anInt5366 = arg0;
				Static93.method1721(Static5.aClass243_3);
				Static381.aClass2_Sub29_Sub2_2.method5212(Static311.aClass189_1.method4710(82) ? 1 : 0);
				Static381.aClass2_Sub29_Sub2_2.method5228(local29);
				Static318.method5088(true, -2, local189.method4394(), local189.method4394(), 0, local189.anIntArray449[0], local189.anIntArray450[0], 0);
			}
		}
		if (local25 == 17) {
			Static292.anInt5366 = arg0;
			Static397.anInt7578 = arg2;
			Static142.anInt2630 = 2;
			Static515.anInt3810 = 0;
			Static93.method1721(Static297.aClass243_58);
			Static381.aClass2_Sub29_Sub2_2.method5186(Static55.anInt970);
			Static381.aClass2_Sub29_Sub2_2.method5175(Static116.anInt2332);
			Static381.aClass2_Sub29_Sub2_2.method5172(Static311.aClass189_1.method4710(82) ? 1 : 0);
			Static381.aClass2_Sub29_Sub2_2.method5217(Static357.anInt6796);
			Static381.aClass2_Sub29_Sub2_2.method5228(Static238.anInt4280 + local15);
			Static381.aClass2_Sub29_Sub2_2.method5186(local29);
			Static381.aClass2_Sub29_Sub2_2.method5217(Static371.anInt6936 + local18);
			Static94.method1753(local15, local18);
		}
		@Pc(922) Class1_Sub1_Sub2_Sub2 local922;
		@Pc(905) Class2_Sub11 local905;
		if (local25 == 44) {
			local905 = (Class2_Sub11) Static71.aClass127_13.method3205((long) local29);
			if (local905 != null) {
				Static397.anInt7578 = arg2;
				Static292.anInt5366 = arg0;
				Static515.anInt3810 = 0;
				Static142.anInt2630 = 2;
				local922 = local905.aClass1_Sub1_Sub2_Sub2_1;
				Static93.method1721(Static70.aClass243_16);
				Static381.aClass2_Sub29_Sub2_2.method5188(local29);
				Static381.aClass2_Sub29_Sub2_2.method5172(Static311.aClass189_1.method4710(82) ? 1 : 0);
				Static318.method5088(true, -2, local922.method4394(), local922.method4394(), 0, local922.anIntArray449[0], local922.anIntArray450[0], 0);
			}
		}
		if (local25 == 11) {
			local189 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local29];
			if (local189 != null) {
				Static142.anInt2630 = 2;
				Static292.anInt5366 = arg0;
				Static515.anInt3810 = 0;
				Static397.anInt7578 = arg2;
				Static93.method1721(Static237.aClass243_50);
				Static381.aClass2_Sub29_Sub2_2.method5217(local29);
				Static381.aClass2_Sub29_Sub2_2.method5220(Static311.aClass189_1.method4710(82) ? 1 : 0);
				Static318.method5088(true, -2, local189.method4394(), local189.method4394(), 0, local189.anIntArray449[0], local189.anIntArray450[0], 0);
			}
		}
		if (local25 == 6) {
			local905 = (Class2_Sub11) Static71.aClass127_13.method3205((long) local29);
			if (local905 != null) {
				Static142.anInt2630 = 2;
				Static397.anInt7578 = arg2;
				Static515.anInt3810 = 0;
				local922 = local905.aClass1_Sub1_Sub2_Sub2_1;
				Static292.anInt5366 = arg0;
				Static93.method1721(Static133.aClass243_33);
				Static381.aClass2_Sub29_Sub2_2.method5217(local29);
				Static381.aClass2_Sub29_Sub2_2.method5172(Static311.aClass189_1.method4710(82) ? 1 : 0);
				Static318.method5088(true, -2, local922.method4394(), local922.method4394(), 0, local922.anIntArray449[0], local922.anIntArray450[0], 0);
			}
		}
		if (local25 == 45) {
			local189 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local29];
			if (local189 != null) {
				Static515.anInt3810 = 0;
				Static397.anInt7578 = arg2;
				Static142.anInt2630 = 2;
				Static292.anInt5366 = arg0;
				Static93.method1721(Static162.aClass243_39);
				Static381.aClass2_Sub29_Sub2_2.method5217(local29);
				Static381.aClass2_Sub29_Sub2_2.method5220(Static311.aClass189_1.method4710(82) ? 1 : 0);
				Static318.method5088(true, -2, local189.method4394(), local189.method4394(), 0, local189.anIntArray449[0], local189.anIntArray450[0], 0);
			}
		}
		if (local25 == 1011) {
			Static292.anInt5366 = arg0;
			Static515.anInt3810 = 0;
			Static142.anInt2630 = 2;
			Static397.anInt7578 = arg2;
			local905 = (Class2_Sub11) Static71.aClass127_13.method3205((long) local29);
			if (local905 != null) {
				local922 = local905.aClass1_Sub1_Sub2_Sub2_1;
				@Pc(1179) Class12 local1179 = local922.aClass12_1;
				if (local1179.anIntArray21 != null) {
					local1179 = local1179.method455(Static84.aClass302_1);
				}
				if (local1179 != null) {
					Static93.method1721(Static410.aClass243_77);
					Static381.aClass2_Sub29_Sub2_2.method5217(local1179.anInt314);
				}
			}
		}
		if (local25 == 1006) {
			Static142.anInt2630 = 2;
			Static515.anInt3810 = 0;
			Static397.anInt7578 = arg2;
			Static292.anInt5366 = arg0;
			Static93.method1721(Static331.aClass243_63);
			Static381.aClass2_Sub29_Sub2_2.method5217(local29);
		}
		if (local25 == 59) {
			local905 = (Class2_Sub11) Static71.aClass127_13.method3205((long) local29);
			if (local905 != null) {
				Static397.anInt7578 = arg2;
				Static142.anInt2630 = 2;
				Static515.anInt3810 = 0;
				local922 = local905.aClass1_Sub1_Sub2_Sub2_1;
				Static292.anInt5366 = arg0;
				Static93.method1721(Static46.aClass243_9);
				Static381.aClass2_Sub29_Sub2_2.method5186(local29);
				Static381.aClass2_Sub29_Sub2_2.method5212(Static311.aClass189_1.method4710(82) ? 1 : 0);
				Static318.method5088(true, -2, local922.method4394(), local922.method4394(), 0, local922.anIntArray449[0], local922.anIntArray450[0], 0);
			}
		}
		if (local25 == 49) {
			Static292.anInt5366 = arg0;
			Static515.anInt3810 = 0;
			Static142.anInt2630 = 2;
			Static397.anInt7578 = arg2;
			Static93.method1721(Static489.aClass243_86);
			Static381.aClass2_Sub29_Sub2_2.method5228(local18 + Static371.anInt6936);
			Static381.aClass2_Sub29_Sub2_2.method5188(local15 + Static238.anInt4280);
			Static381.aClass2_Sub29_Sub2_2.method5228((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static381.aClass2_Sub29_Sub2_2.method5212(Static311.aClass189_1.method4710(82) ? 1 : 0);
			Static490.method6644(local15, local32, local18);
		}
		if (local25 == 16) {
			local905 = (Class2_Sub11) Static71.aClass127_13.method3205((long) local29);
			if (local905 != null) {
				Static142.anInt2630 = 2;
				Static515.anInt3810 = 0;
				Static292.anInt5366 = arg0;
				local922 = local905.aClass1_Sub1_Sub2_Sub2_1;
				Static397.anInt7578 = arg2;
				Static93.method1721(Static176.aClass243_41);
				Static381.aClass2_Sub29_Sub2_2.method5217(local29);
				Static381.aClass2_Sub29_Sub2_2.method5172(Static311.aClass189_1.method4710(82) ? 1 : 0);
				Static318.method5088(true, -2, local922.method4394(), local922.method4394(), 0, local922.anIntArray449[0], local922.anIntArray450[0], 0);
			}
		}
		if (local25 == 10) {
			Static515.anInt3810 = 0;
			Static292.anInt5366 = arg0;
			Static397.anInt7578 = arg2;
			Static142.anInt2630 = 2;
			Static93.method1721(Static188.aClass243_2);
			Static381.aClass2_Sub29_Sub2_2.method5228(local18 + Static371.anInt6936);
			Static381.aClass2_Sub29_Sub2_2.method5186(Static238.anInt4280 + local15);
			Static381.aClass2_Sub29_Sub2_2.method5186(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static381.aClass2_Sub29_Sub2_2.method5172(Static311.aClass189_1.method4710(82) ? 1 : 0);
			Static490.method6644(local15, local32, local18);
		}
		if (local25 == 48) {
			local189 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local29];
			if (local189 != null) {
				Static292.anInt5366 = arg0;
				Static515.anInt3810 = 0;
				Static397.anInt7578 = arg2;
				Static142.anInt2630 = 2;
				Static93.method1721(Static111.aClass243_30);
				Static381.aClass2_Sub29_Sub2_2.method5220(Static311.aClass189_1.method4710(82) ? 1 : 0);
				Static381.aClass2_Sub29_Sub2_2.method5186(local29);
				Static318.method5088(true, -2, local189.method4394(), local189.method4394(), 0, local189.anIntArray449[0], local189.anIntArray450[0], 0);
			}
		}
		if (local25 == 13 && Static126.aClass310_16 == null) {
			Static395.method6302(local18, local15);
			Static126.aClass310_16 = Static519.method7538(local18, local15);
			Static273.method4342(Static126.aClass310_16);
		}
		if (local25 == 9) {
			Static142.anInt2630 = 1;
			Static397.anInt7578 = arg2;
			Static515.anInt3810 = 0;
			Static292.anInt5366 = arg0;
			Static93.method1721(Static338.aClass243_64);
			Static381.aClass2_Sub29_Sub2_2.method5217(Static357.anInt6796);
			Static381.aClass2_Sub29_Sub2_2.method5188(local15 + Static238.anInt4280);
			Static381.aClass2_Sub29_Sub2_2.method5186(Static55.anInt970);
			Static381.aClass2_Sub29_Sub2_2.method5217(local18 + Static371.anInt6936);
			Static381.aClass2_Sub29_Sub2_2.method5185(Static116.anInt2332);
			Static318.method5088(true, -4, 1, 1, 0, local18, local15, 0);
		}
		if (local25 == 8) {
			Static142.anInt2630 = 2;
			Static292.anInt5366 = arg0;
			Static515.anInt3810 = 0;
			Static397.anInt7578 = arg2;
			Static93.method1721(Static502.aClass243_89);
			Static381.aClass2_Sub29_Sub2_2.method5212(Static311.aClass189_1.method4710(82) ? 1 : 0);
			Static381.aClass2_Sub29_Sub2_2.method5217(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static381.aClass2_Sub29_Sub2_2.method5228(Static238.anInt4280 + local15);
			Static381.aClass2_Sub29_Sub2_2.method5186(local18 + Static371.anInt6936);
			Static490.method6644(local15, local32, local18);
		}
		if (local25 == 58) {
			local189 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local29];
			if (local189 != null) {
				Static292.anInt5366 = arg0;
				Static515.anInt3810 = 0;
				Static397.anInt7578 = arg2;
				Static142.anInt2630 = 2;
				Static93.method1721(Static395.aClass243_75);
				Static381.aClass2_Sub29_Sub2_2.method5217(Static357.anInt6796);
				Static381.aClass2_Sub29_Sub2_2.method5204(Static116.anInt2332);
				Static381.aClass2_Sub29_Sub2_2.method5186(Static55.anInt970);
				Static381.aClass2_Sub29_Sub2_2.method5172(Static311.aClass189_1.method4710(82) ? 1 : 0);
				Static381.aClass2_Sub29_Sub2_2.method5188(local29);
				Static318.method5088(true, -2, local189.method4394(), local189.method4394(), 0, local189.anIntArray449[0], local189.anIntArray450[0], 0);
			}
		}
		if (local25 == 25) {
			local189 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local29];
			if (local189 != null) {
				Static142.anInt2630 = 2;
				Static515.anInt3810 = 0;
				Static397.anInt7578 = arg2;
				Static292.anInt5366 = arg0;
				Static93.method1721(Static388.aClass243_72);
				Static381.aClass2_Sub29_Sub2_2.method5212(Static311.aClass189_1.method4710(82) ? 1 : 0);
				Static381.aClass2_Sub29_Sub2_2.method5188(local29);
				Static318.method5088(true, -2, local189.method4394(), local189.method4394(), 0, local189.anIntArray449[0], local189.anIntArray450[0], 0);
			}
		}
		if (local25 == 21) {
			local905 = (Class2_Sub11) Static71.aClass127_13.method3205((long) local29);
			if (local905 != null) {
				local922 = local905.aClass1_Sub1_Sub2_Sub2_1;
				Static397.anInt7578 = arg2;
				Static142.anInt2630 = 2;
				Static515.anInt3810 = 0;
				Static292.anInt5366 = arg0;
				Static93.method1721(Static305.aClass243_59);
				Static381.aClass2_Sub29_Sub2_2.method5228(Static357.anInt6796);
				Static381.aClass2_Sub29_Sub2_2.method5212(Static311.aClass189_1.method4710(82) ? 1 : 0);
				Static381.aClass2_Sub29_Sub2_2.method5186(local29);
				Static381.aClass2_Sub29_Sub2_2.method5175(Static116.anInt2332);
				Static381.aClass2_Sub29_Sub2_2.method5186(Static55.anInt970);
				Static318.method5088(true, -2, local922.method4394(), local922.method4394(), 0, local922.anIntArray449[0], local922.anIntArray450[0], 0);
			}
		}
		if (local25 == 12) {
			local905 = (Class2_Sub11) Static71.aClass127_13.method3205((long) local29);
			if (local905 != null) {
				Static142.anInt2630 = 2;
				Static397.anInt7578 = arg2;
				Static292.anInt5366 = arg0;
				local922 = local905.aClass1_Sub1_Sub2_Sub2_1;
				Static515.anInt3810 = 0;
				Static93.method1721(Static487.aClass243_85);
				Static381.aClass2_Sub29_Sub2_2.method5172(Static311.aClass189_1.method4710(82) ? 1 : 0);
				Static381.aClass2_Sub29_Sub2_2.method5188(local29);
				Static318.method5088(true, -2, local922.method4394(), local922.method4394(), 0, local922.anIntArray449[0], local922.anIntArray450[0], 0);
			}
		}
		if (local25 == 1010) {
			Static292.anInt5366 = arg0;
			Static397.anInt7578 = arg2;
			Static515.anInt3810 = 0;
			Static142.anInt2630 = 2;
			Static93.method1721(Static388.aClass243_73);
			Static381.aClass2_Sub29_Sub2_2.method5217(local18 + Static371.anInt6936);
			Static381.aClass2_Sub29_Sub2_2.method5212(Static311.aClass189_1.method4710(82) ? 1 : 0);
			Static381.aClass2_Sub29_Sub2_2.method5228(Static238.anInt4280 + local15);
			Static381.aClass2_Sub29_Sub2_2.method5228(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static490.method6644(local15, local32, local18);
		}
		if (local25 == 30) {
			Static142.anInt2630 = 2;
			Static515.anInt3810 = 0;
			Static397.anInt7578 = arg2;
			Static292.anInt5366 = arg0;
			Static93.method1721(Static395.aClass243_75);
			Static381.aClass2_Sub29_Sub2_2.method5217(Static357.anInt6796);
			Static381.aClass2_Sub29_Sub2_2.method5204(Static116.anInt2332);
			Static381.aClass2_Sub29_Sub2_2.method5186(Static55.anInt970);
			Static381.aClass2_Sub29_Sub2_2.method5172(Static311.aClass189_1.method4710(82) ? 1 : 0);
			Static381.aClass2_Sub29_Sub2_2.method5188(Static266.aClass1_Sub1_Sub2_Sub1_1.anInt5076);
		}
		if (local25 == 23) {
			if (Static475.anInt8486 > 0 && Static311.aClass189_1.method4710(82) && Static311.aClass189_1.method4710(81)) {
				Static161.method2731(Static238.anInt4280 + local15, Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90, local18 + Static371.anInt6936);
			} else {
				Static142.anInt2630 = 1;
				Static397.anInt7578 = arg2;
				Static292.anInt5366 = arg0;
				Static515.anInt3810 = 0;
				Static93.method1721(Static370.aClass243_67);
				Static381.aClass2_Sub29_Sub2_2.method5217(Static371.anInt6936 + local18);
				Static381.aClass2_Sub29_Sub2_2.method5228(local15 + Static238.anInt4280);
			}
		}
		if (local25 == 3) {
			Static142.anInt2630 = 2;
			Static397.anInt7578 = arg2;
			Static292.anInt5366 = arg0;
			Static515.anInt3810 = 0;
			Static93.method1721(Static266.aClass243_56);
			Static381.aClass2_Sub29_Sub2_2.method5188(Static238.anInt4280 + local15);
			Static381.aClass2_Sub29_Sub2_2.method5188(local29);
			Static381.aClass2_Sub29_Sub2_2.method5217(local18 + Static371.anInt6936);
			Static381.aClass2_Sub29_Sub2_2.method5220(Static311.aClass189_1.method4710(82) ? 1 : 0);
			Static94.method1753(local15, local18);
		}
		if (Static21.aBoolean31) {
			Static465.method7011();
		}
		if (Static59.aClass310_2 != null && Static88.anInt1777 == 0) {
			Static273.method4342(Static59.aClass310_2);
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IIIIB)V")
	public static void method6447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub13_Sub15 local8 = Static370.method5893(arg1, 4);
		local8.method6968();
		local8.anInt8314 = arg3;
		local8.anInt8318 = arg2;
		local8.anInt8320 = arg0;
	}
}
