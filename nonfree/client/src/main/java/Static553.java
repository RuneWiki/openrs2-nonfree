import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!vfa", name = "x", descriptor = "I")
	public static final int anInt9216 = 52;

	@OriginalMember(owner = "client!vfa", name = "G", descriptor = "I")
	public static int anInt9224 = 0;

	@OriginalMember(owner = "client!vfa", name = "I", descriptor = "Lclient!lga;")
	public static final Class207 aClass207_58 = new Class207(8);

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIILclient!rc;)V")
	public static void method7513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub40 arg2) {
		if (arg2 == null || arg2 == Static166.aClass111_49.aClass1_94) {
			return;
		}
		@Pc(15) int local15 = arg2.anInt7817;
		@Pc(18) int local18 = arg2.anInt7821;
		@Pc(21) int local21 = arg2.anInt7819;
		@Pc(25) int local25 = (int) arg2.aLong199;
		@Pc(28) long local28 = arg2.aLong199;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(54) Class1_Sub9 local54;
		if (local21 == 60) {
			Static300.anInt9559 = 0;
			Static258.anInt4725 = arg0;
			Static119.anInt2475 = arg1;
			Static361.anInt6564 = 2;
			local54 = Static123.method2194(Static469.aClass235_2, Static359.aClass208_83);
			local54.aClass1_Sub3_Sub1_1.method7922(Static326.aClass97_3.method2365(82) ? 1 : 0);
			local54.aClass1_Sub3_Sub1_1.method7937(local15 + Static539.anInt9045);
			local54.aClass1_Sub3_Sub1_1.method7918(local25);
			local54.aClass1_Sub3_Sub1_1.method7937(local18 + Static311.anInt5708);
			Static42.method746(local54);
			Static503.method7065(local15, local18);
		}
		if (local21 == 1003) {
			Static258.anInt4725 = arg0;
			Static300.anInt9559 = 0;
			Static361.anInt6564 = 2;
			Static119.anInt2475 = arg1;
			local54 = Static123.method2194(Static469.aClass235_2, Static21.aClass208_9);
			local54.aClass1_Sub3_Sub1_1.method7917(Static326.aClass97_3.method2365(82) ? 1 : 0);
			local54.aClass1_Sub3_Sub1_1.method7923(Static539.anInt9045 + local15);
			local54.aClass1_Sub3_Sub1_1.method7912(local18 + Static311.anInt5708);
			local54.aClass1_Sub3_Sub1_1.method7918((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static42.method746(local54);
			Static206.method3171(local15, local18, local28);
		}
		if (local21 == 19) {
			Static300.anInt9559 = 0;
			Static361.anInt6564 = 2;
			Static258.anInt4725 = arg0;
			Static119.anInt2475 = arg1;
			local54 = Static123.method2194(Static469.aClass235_2, Static498.aClass208_19);
			local54.aClass1_Sub3_Sub1_1.method7918(Static539.anInt9045 + local15);
			local54.aClass1_Sub3_Sub1_1.method7937(local25);
			local54.aClass1_Sub3_Sub1_1.method7912(Static311.anInt5708 + local18);
			local54.aClass1_Sub3_Sub1_1.method7917(Static326.aClass97_3.method2365(82) ? 1 : 0);
			Static42.method746(local54);
			Static503.method7065(local15, local18);
		}
		@Pc(252) Class11_Sub1_Sub1_Sub3_Sub2 local252;
		@Pc(257) Class1_Sub9 local257;
		@Pc(235) Class1_Sub33 local235;
		if (local21 == 6) {
			local235 = (Class1_Sub33) Static372.aClass91_30.method2271((long) local25);
			if (local235 != null) {
				Static258.anInt4725 = arg0;
				Static361.anInt6564 = 2;
				Static119.anInt2475 = arg1;
				Static300.anInt9559 = 0;
				local252 = local235.aClass11_Sub1_Sub1_Sub3_Sub2_2;
				local257 = Static123.method2194(Static469.aClass235_2, Static88.aClass208_28);
				local257.aClass1_Sub3_Sub1_1.method7922(Static326.aClass97_3.method2365(82) ? 1 : 0);
				local257.aClass1_Sub3_Sub1_1.method7923(local25);
				Static42.method746(local257);
				Static590.method7873(local252.anIntArray454[0], true, 0, -2, local252.anIntArray455[0], 0, local252.method6058(), local252.method6058());
			}
		}
		if (local21 == 23) {
			if (Static203.anInt3822 > 0 && Static326.aClass97_3.method2365(82) && Static326.aClass97_3.method2365(81)) {
				Static499.method7030(Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113, Static539.anInt9045 + local15, Static311.anInt5708 + local18);
			} else {
				local54 = Static114.method1613(local18, local25, local15);
				if (local25 == 1) {
					local54.aClass1_Sub3_Sub1_1.method7917(-1);
					local54.aClass1_Sub3_Sub1_1.method7917(-1);
					local54.aClass1_Sub3_Sub1_1.method7937((int) Static331.aFloat172);
					local54.aClass1_Sub3_Sub1_1.method7917(57);
					local54.aClass1_Sub3_Sub1_1.method7917(Static272.anInt5007);
					local54.aClass1_Sub3_Sub1_1.method7917(Static267.anInt4887);
					local54.aClass1_Sub3_Sub1_1.method7917(89);
					local54.aClass1_Sub3_Sub1_1.method7937(Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8902);
					local54.aClass1_Sub3_Sub1_1.method7937(Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8906);
					local54.aClass1_Sub3_Sub1_1.method7917(63);
				} else {
					Static300.anInt9559 = 0;
					Static119.anInt2475 = arg1;
					Static258.anInt4725 = arg0;
					Static361.anInt6564 = 1;
				}
				Static42.method746(local54);
				Static590.method7873(local18, true, 0, -4, local15, 0, 1, 1);
			}
		}
		if (local21 == 57) {
			local235 = (Class1_Sub33) Static372.aClass91_30.method2271((long) local25);
			if (local235 != null) {
				local252 = local235.aClass11_Sub1_Sub1_Sub3_Sub2_2;
				Static300.anInt9559 = 0;
				Static119.anInt2475 = arg1;
				Static258.anInt4725 = arg0;
				Static361.anInt6564 = 2;
				local257 = Static123.method2194(Static469.aClass235_2, Static331.aClass208_77);
				local257.aClass1_Sub3_Sub1_1.method7918(local25);
				local257.aClass1_Sub3_Sub1_1.method7922(Static326.aClass97_3.method2365(82) ? 1 : 0);
				Static42.method746(local257);
				Static590.method7873(local252.anIntArray454[0], true, 0, -2, local252.anIntArray455[0], 0, local252.method6058(), local252.method6058());
			}
		}
		@Pc(524) Class1_Sub9 local524;
		@Pc(505) Class11_Sub1_Sub1_Sub3_Sub1 local505;
		if (local21 == 3) {
			local505 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local25];
			if (local505 != null) {
				Static300.anInt9559 = 0;
				Static258.anInt4725 = arg0;
				Static361.anInt6564 = 2;
				Static119.anInt2475 = arg1;
				local524 = Static123.method2194(Static469.aClass235_2, Static338.aClass208_79);
				local524.aClass1_Sub3_Sub1_1.method7912(local25);
				local524.aClass1_Sub3_Sub1_1.method7922(Static326.aClass97_3.method2365(82) ? 1 : 0);
				Static42.method746(local524);
				Static590.method7873(local505.anIntArray454[0], true, 0, -2, local505.anIntArray455[0], 0, local505.method6058(), local505.method6058());
			}
		}
		if (local21 == 8) {
			Static258.anInt4725 = arg0;
			Static361.anInt6564 = 2;
			Static300.anInt9559 = 0;
			Static119.anInt2475 = arg1;
			local54 = Static123.method2194(Static469.aClass235_2, Static22.aClass208_10);
			local54.aClass1_Sub3_Sub1_1.method7959(Static326.aClass97_3.method2365(82) ? 1 : 0);
			local54.aClass1_Sub3_Sub1_1.method7923(local25);
			local54.aClass1_Sub3_Sub1_1.method7912(Static311.anInt5708 + local18);
			local54.aClass1_Sub3_Sub1_1.method7923(Static539.anInt9045 + local15);
			Static42.method746(local54);
			Static503.method7065(local15, local18);
		}
		if (local21 == 51) {
			local505 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local25];
			if (local505 != null) {
				Static300.anInt9559 = 0;
				Static258.anInt4725 = arg0;
				Static361.anInt6564 = 2;
				Static119.anInt2475 = arg1;
				local524 = Static123.method2194(Static469.aClass235_2, Static4.aClass208_108);
				local524.aClass1_Sub3_Sub1_1.method7933(Static326.aClass97_3.method2365(82) ? 1 : 0);
				local524.aClass1_Sub3_Sub1_1.method7937(local25);
				Static42.method746(local524);
				Static590.method7873(local505.anIntArray454[0], true, 0, -2, local505.anIntArray455[0], 0, local505.method6058(), local505.method6058());
			}
		}
		if (local21 == 15) {
			local505 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local25];
			if (local505 != null) {
				Static119.anInt2475 = arg1;
				Static258.anInt4725 = arg0;
				Static361.anInt6564 = 2;
				Static300.anInt9559 = 0;
				local524 = Static123.method2194(Static469.aClass235_2, Static446.aClass208_96);
				local524.aClass1_Sub3_Sub1_1.method7923(local25);
				local524.aClass1_Sub3_Sub1_1.method7917(Static326.aClass97_3.method2365(82) ? 1 : 0);
				Static42.method746(local524);
				Static590.method7873(local505.anIntArray454[0], true, 0, -2, local505.anIntArray455[0], 0, local505.method6058(), local505.method6058());
			}
		}
		if (local21 == 13) {
			local505 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local25];
			if (local505 != null) {
				Static300.anInt9559 = 0;
				Static361.anInt6564 = 2;
				Static258.anInt4725 = arg0;
				Static119.anInt2475 = arg1;
				local524 = Static123.method2194(Static469.aClass235_2, Static421.aClass208_89);
				local524.aClass1_Sub3_Sub1_1.method7933(Static326.aClass97_3.method2365(82) ? 1 : 0);
				local524.aClass1_Sub3_Sub1_1.method7937(local25);
				Static42.method746(local524);
				Static590.method7873(local505.anIntArray454[0], true, 0, -2, local505.anIntArray455[0], 0, local505.method6058(), local505.method6058());
			}
		}
		if (local21 == 21) {
			local505 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local25];
			if (local505 != null) {
				Static258.anInt4725 = arg0;
				Static300.anInt9559 = 0;
				Static119.anInt2475 = arg1;
				Static361.anInt6564 = 2;
				local524 = Static123.method2194(Static469.aClass235_2, Static307.aClass208_91);
				local524.aClass1_Sub3_Sub1_1.method7937(Static253.anInt4623);
				local524.aClass1_Sub3_Sub1_1.method7923(local25);
				local524.aClass1_Sub3_Sub1_1.method7917(Static326.aClass97_3.method2365(82) ? 1 : 0);
				local524.aClass1_Sub3_Sub1_1.method7956(Static594.anInt9808);
				local524.aClass1_Sub3_Sub1_1.method7923(Static299.anInt5617);
				Static42.method746(local524);
				Static590.method7873(local505.anIntArray454[0], true, 0, -2, local505.anIntArray455[0], 0, local505.method6058(), local505.method6058());
			}
		}
		if (local21 == 1006) {
			Static119.anInt2475 = arg1;
			Static361.anInt6564 = 2;
			Static258.anInt4725 = arg0;
			Static300.anInt9559 = 0;
			local54 = Static123.method2194(Static469.aClass235_2, Static155.aClass208_33);
			local54.aClass1_Sub3_Sub1_1.method7937(local25);
			Static42.method746(local54);
		}
		if (local21 == 44) {
			Static119.anInt2475 = arg1;
			Static300.anInt9559 = 0;
			Static258.anInt4725 = arg0;
			Static361.anInt6564 = 2;
			local54 = Static123.method2194(Static469.aClass235_2, Static538.aClass208_93);
			local54.aClass1_Sub3_Sub1_1.method7912(local25);
			local54.aClass1_Sub3_Sub1_1.method7969(Static594.anInt9808);
			local54.aClass1_Sub3_Sub1_1.method7959(Static326.aClass97_3.method2365(82) ? 1 : 0);
			local54.aClass1_Sub3_Sub1_1.method7918(Static311.anInt5708 + local18);
			local54.aClass1_Sub3_Sub1_1.method7918(Static299.anInt5617);
			local54.aClass1_Sub3_Sub1_1.method7923(local15 + Static539.anInt9045);
			local54.aClass1_Sub3_Sub1_1.method7912(Static253.anInt4623);
			Static42.method746(local54);
			Static503.method7065(local15, local18);
		}
		if (local21 == 16) {
			Static300.anInt9559 = 0;
			Static361.anInt6564 = 2;
			Static119.anInt2475 = arg1;
			Static258.anInt4725 = arg0;
			local54 = Static123.method2194(Static469.aClass235_2, Static182.aClass208_43);
			local54.aClass1_Sub3_Sub1_1.method7933(Static326.aClass97_3.method2365(82) ? 1 : 0);
			local54.aClass1_Sub3_Sub1_1.method7912(local15 + Static539.anInt9045);
			local54.aClass1_Sub3_Sub1_1.method7937(local18 + Static311.anInt5708);
			local54.aClass1_Sub3_Sub1_1.method7923(local25);
			Static42.method746(local54);
			Static503.method7065(local15, local18);
		}
		if (local21 == 49) {
			local235 = (Class1_Sub33) Static372.aClass91_30.method2271((long) local25);
			if (local235 != null) {
				Static361.anInt6564 = 2;
				Static119.anInt2475 = arg1;
				Static300.anInt9559 = 0;
				Static258.anInt4725 = arg0;
				local252 = local235.aClass11_Sub1_Sub1_Sub3_Sub2_2;
				local257 = Static123.method2194(Static469.aClass235_2, Static328.aClass208_73);
				local257.aClass1_Sub3_Sub1_1.method7922(Static326.aClass97_3.method2365(82) ? 1 : 0);
				local257.aClass1_Sub3_Sub1_1.method7937(local25);
				Static42.method746(local257);
				Static590.method7873(local252.anIntArray454[0], true, 0, -2, local252.anIntArray455[0], 0, local252.method6058(), local252.method6058());
			}
		}
		if (local21 == 47) {
			local235 = (Class1_Sub33) Static372.aClass91_30.method2271((long) local25);
			if (local235 != null) {
				Static119.anInt2475 = arg1;
				Static361.anInt6564 = 2;
				Static258.anInt4725 = arg0;
				local252 = local235.aClass11_Sub1_Sub1_Sub3_Sub2_2;
				Static300.anInt9559 = 0;
				local257 = Static123.method2194(Static469.aClass235_2, Static50.aClass208_25);
				local257.aClass1_Sub3_Sub1_1.method7912(local25);
				local257.aClass1_Sub3_Sub1_1.method7933(Static326.aClass97_3.method2365(82) ? 1 : 0);
				Static42.method746(local257);
				Static590.method7873(local252.anIntArray454[0], true, 0, -2, local252.anIntArray455[0], 0, local252.method6058(), local252.method6058());
			}
		}
		if (local21 == 58) {
			local505 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local25];
			if (local505 != null) {
				Static119.anInt2475 = arg1;
				Static361.anInt6564 = 2;
				Static258.anInt4725 = arg0;
				Static300.anInt9559 = 0;
				local524 = Static123.method2194(Static469.aClass235_2, Static368.aClass208_84);
				local524.aClass1_Sub3_Sub1_1.method7918(local25);
				local524.aClass1_Sub3_Sub1_1.method7959(Static326.aClass97_3.method2365(82) ? 1 : 0);
				Static42.method746(local524);
				Static590.method7873(local505.anIntArray454[0], true, 0, -2, local505.anIntArray455[0], 0, local505.method6058(), local505.method6058());
			}
		}
		if (local21 == 50) {
			Static258.anInt4725 = arg0;
			Static119.anInt2475 = arg1;
			Static300.anInt9559 = 0;
			Static361.anInt6564 = 2;
			local54 = Static123.method2194(Static469.aClass235_2, Static50.aClass208_23);
			local54.aClass1_Sub3_Sub1_1.method7912((int) (local28 >>> 32) & Integer.MAX_VALUE);
			local54.aClass1_Sub3_Sub1_1.method7923(Static539.anInt9045 + local15);
			local54.aClass1_Sub3_Sub1_1.method7937(local18 + Static311.anInt5708);
			local54.aClass1_Sub3_Sub1_1.method7917(Static326.aClass97_3.method2365(82) ? 1 : 0);
			Static42.method746(local54);
			Static206.method3171(local15, local18, local28);
		}
		if (local21 == 48) {
			local505 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local25];
			if (local505 != null) {
				Static258.anInt4725 = arg0;
				Static119.anInt2475 = arg1;
				Static300.anInt9559 = 0;
				Static361.anInt6564 = 2;
				local524 = Static123.method2194(Static469.aClass235_2, Static137.aClass208_32);
				local524.aClass1_Sub3_Sub1_1.method7918(local25);
				local524.aClass1_Sub3_Sub1_1.method7922(Static326.aClass97_3.method2365(82) ? 1 : 0);
				Static42.method746(local524);
				Static590.method7873(local505.anIntArray454[0], true, 0, -2, local505.anIntArray455[0], 0, local505.method6058(), local505.method6058());
			}
		}
		if (local21 == 1010) {
			Static361.anInt6564 = 2;
			Static119.anInt2475 = arg1;
			Static258.anInt4725 = arg0;
			Static300.anInt9559 = 0;
			local54 = Static123.method2194(Static469.aClass235_2, Static395.aClass208_85);
			local54.aClass1_Sub3_Sub1_1.method7937(local25);
			Static42.method746(local54);
		}
		@Pc(1500) Class160 local1500;
		if (local21 == 2) {
			local1500 = Static420.method5959(local18, local15);
			if (local1500 != null) {
				Static193.method3074();
				@Pc(1507) Class1_Sub10 local1507 = Static67.method1098(local1500);
				Static330.method4880(local1507.anInt649, local1500, local1507.method574());
				Static318.aString69 = Static573.method7727(local1500);
				if (Static318.aString69 == null) {
					Static318.aString69 = "Null";
				}
				Static146.aString26 = local1500.aString45 + "<col=ffffff>";
			}
			return;
		}
		if (local21 == 30) {
			Static361.anInt6564 = 2;
			Static258.anInt4725 = arg0;
			Static300.anInt9559 = 0;
			Static119.anInt2475 = arg1;
			local54 = Static123.method2194(Static469.aClass235_2, Static258.aClass208_59);
			local54.aClass1_Sub3_Sub1_1.method7937(local15 + Static539.anInt9045);
			local54.aClass1_Sub3_Sub1_1.method7918(Static311.anInt5708 + local18);
			local54.aClass1_Sub3_Sub1_1.method7923(Integer.MAX_VALUE & (int) (local28 >>> 32));
			local54.aClass1_Sub3_Sub1_1.method7917(Static326.aClass97_3.method2365(82) ? 1 : 0);
			Static42.method746(local54);
			Static206.method3171(local15, local18, local28);
		}
		if (local21 == 45) {
			local1500 = Static420.method5959(local18, local15);
			if (local1500 != null) {
				Static379.method5471(local1500);
			}
		}
		if (local21 == 4) {
			if (Static203.anInt3822 > 0 && Static326.aClass97_3.method2365(82) && Static326.aClass97_3.method2365(81)) {
				Static499.method7030(Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113, Static539.anInt9045 + local15, local18 + Static311.anInt5708);
			} else {
				Static258.anInt4725 = arg0;
				Static300.anInt9559 = 0;
				Static361.anInt6564 = 1;
				Static119.anInt2475 = arg1;
				local54 = Static123.method2194(Static469.aClass235_2, Static278.aClass208_66);
				local54.aClass1_Sub3_Sub1_1.method7923(local15 + Static539.anInt9045);
				local54.aClass1_Sub3_Sub1_1.method7918(Static311.anInt5708 + local18);
				Static42.method746(local54);
			}
		}
		if (local21 == 17) {
			local505 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local25];
			if (local505 != null) {
				Static258.anInt4725 = arg0;
				Static119.anInt2475 = arg1;
				Static361.anInt6564 = 2;
				Static300.anInt9559 = 0;
				local524 = Static123.method2194(Static469.aClass235_2, Static227.aClass208_52);
				local524.aClass1_Sub3_Sub1_1.method7959(Static326.aClass97_3.method2365(82) ? 1 : 0);
				local524.aClass1_Sub3_Sub1_1.method7912(local25);
				Static42.method746(local524);
				Static590.method7873(local505.anIntArray454[0], true, 0, -2, local505.anIntArray455[0], 0, local505.method6058(), local505.method6058());
			}
		}
		if (local21 == 5 || local21 == 1011) {
			Static30.method577(local25, local18, local15, arg2.aString89);
		}
		if (local21 == 11) {
			Static119.anInt2475 = arg1;
			Static300.anInt9559 = 0;
			Static361.anInt6564 = 2;
			Static258.anInt4725 = arg0;
			local54 = Static123.method2194(Static469.aClass235_2, Static93.aClass208_29);
			local54.aClass1_Sub3_Sub1_1.method7922(Static326.aClass97_3.method2365(82) ? 1 : 0);
			local54.aClass1_Sub3_Sub1_1.method7937(Static539.anInt9045 + local15);
			local54.aClass1_Sub3_Sub1_1.method7937((int) (local28 >>> 32) & Integer.MAX_VALUE);
			local54.aClass1_Sub3_Sub1_1.method7937(Static311.anInt5708 + local18);
			Static42.method746(local54);
			Static206.method3171(local15, local18, local28);
		}
		if (local21 == 18) {
			local505 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local25];
			if (local505 != null) {
				Static361.anInt6564 = 2;
				Static119.anInt2475 = arg1;
				Static300.anInt9559 = 0;
				Static258.anInt4725 = arg0;
				local524 = Static123.method2194(Static469.aClass235_2, Static586.aClass208_110);
				local524.aClass1_Sub3_Sub1_1.method7922(Static326.aClass97_3.method2365(82) ? 1 : 0);
				local524.aClass1_Sub3_Sub1_1.method7937(local25);
				Static42.method746(local524);
				Static590.method7873(local505.anIntArray454[0], true, 0, -2, local505.anIntArray455[0], 0, local505.method6058(), local505.method6058());
			}
		}
		if (local21 == 1012) {
			Static300.anInt9559 = 0;
			Static119.anInt2475 = arg1;
			Static361.anInt6564 = 2;
			Static258.anInt4725 = arg0;
			local235 = (Class1_Sub33) Static372.aClass91_30.method2271((long) local25);
			if (local235 != null) {
				local252 = local235.aClass11_Sub1_Sub1_Sub3_Sub2_2;
				@Pc(1953) Class354 local1953 = local252.aClass354_1;
				if (local1953.anIntArray597 != null) {
					local1953 = local1953.method7683(Static390.aClass353_29);
				}
				if (local1953 != null) {
					@Pc(1972) Class1_Sub9 local1972 = Static123.method2194(Static469.aClass235_2, Static502.aClass208_90);
					local1972.aClass1_Sub3_Sub1_1.method7937(local1953.anInt9402);
					Static42.method746(local1972);
				}
			}
		}
		if (local21 == 25) {
			Static258.anInt4725 = arg0;
			Static119.anInt2475 = arg1;
			Static300.anInt9559 = 0;
			Static361.anInt6564 = 2;
			local54 = Static123.method2194(Static469.aClass235_2, Static353.aClass208_81);
			local54.aClass1_Sub3_Sub1_1.method7922(Static326.aClass97_3.method2365(82) ? 1 : 0);
			local54.aClass1_Sub3_Sub1_1.method7937(Static539.anInt9045 + local15);
			local54.aClass1_Sub3_Sub1_1.method7923(Static311.anInt5708 + local18);
			local54.aClass1_Sub3_Sub1_1.method7918(local25);
			Static42.method746(local54);
			Static503.method7065(local15, local18);
		}
		if (local21 == 46) {
			Static300.anInt9559 = 0;
			Static258.anInt4725 = arg0;
			Static361.anInt6564 = 2;
			Static119.anInt2475 = arg1;
			local54 = Static123.method2194(Static469.aClass235_2, Static210.aClass208_49);
			local54.aClass1_Sub3_Sub1_1.method7923(local15 + Static539.anInt9045);
			local54.aClass1_Sub3_Sub1_1.method7937(Integer.MAX_VALUE & (int) (local28 >>> 32));
			local54.aClass1_Sub3_Sub1_1.method7923(Static311.anInt5708 + local18);
			local54.aClass1_Sub3_Sub1_1.method7959(Static326.aClass97_3.method2365(82) ? 1 : 0);
			Static42.method746(local54);
			Static206.method3171(local15, local18, local28);
		}
		if (local21 == 22) {
			local235 = (Class1_Sub33) Static372.aClass91_30.method2271((long) local25);
			if (local235 != null) {
				Static300.anInt9559 = 0;
				Static119.anInt2475 = arg1;
				Static258.anInt4725 = arg0;
				local252 = local235.aClass11_Sub1_Sub1_Sub3_Sub2_2;
				Static361.anInt6564 = 2;
				local257 = Static123.method2194(Static469.aClass235_2, Static213.aClass208_50);
				local257.aClass1_Sub3_Sub1_1.method7923(Static299.anInt5617);
				local257.aClass1_Sub3_Sub1_1.method7918(Static253.anInt4623);
				local257.aClass1_Sub3_Sub1_1.method7936(Static594.anInt9808);
				local257.aClass1_Sub3_Sub1_1.method7933(Static326.aClass97_3.method2365(82) ? 1 : 0);
				local257.aClass1_Sub3_Sub1_1.method7912(local25);
				Static42.method746(local257);
				Static590.method7873(local252.anIntArray454[0], true, 0, -2, local252.anIntArray455[0], 0, local252.method6058(), local252.method6058());
			}
		}
		if (local21 == 59) {
			Static300.anInt9559 = 0;
			Static258.anInt4725 = arg0;
			Static361.anInt6564 = 2;
			Static119.anInt2475 = arg1;
			local54 = Static123.method2194(Static469.aClass235_2, Static484.aClass208_99);
			local54.aClass1_Sub3_Sub1_1.method7937(Static299.anInt5617);
			local54.aClass1_Sub3_Sub1_1.method7918(Static539.anInt9045 + local15);
			local54.aClass1_Sub3_Sub1_1.method7937((int) (local28 >>> 32) & Integer.MAX_VALUE);
			local54.aClass1_Sub3_Sub1_1.method7922(Static326.aClass97_3.method2365(82) ? 1 : 0);
			local54.aClass1_Sub3_Sub1_1.method7918(Static253.anInt4623);
			local54.aClass1_Sub3_Sub1_1.method7923(local18 + Static311.anInt5708);
			local54.aClass1_Sub3_Sub1_1.method7956(Static594.anInt9808);
			Static42.method746(local54);
			Static206.method3171(local15, local18, local28);
		}
		if (local21 == 12) {
			Static300.anInt9559 = 0;
			Static258.anInt4725 = arg0;
			Static361.anInt6564 = 2;
			Static119.anInt2475 = arg1;
			local54 = Static123.method2194(Static469.aClass235_2, Static307.aClass208_91);
			local54.aClass1_Sub3_Sub1_1.method7937(Static253.anInt4623);
			local54.aClass1_Sub3_Sub1_1.method7923(Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt7524);
			local54.aClass1_Sub3_Sub1_1.method7917(Static326.aClass97_3.method2365(82) ? 1 : 0);
			local54.aClass1_Sub3_Sub1_1.method7956(Static594.anInt9808);
			local54.aClass1_Sub3_Sub1_1.method7923(Static299.anInt5617);
			Static42.method746(local54);
		}
		if (local21 == 9) {
			Static300.anInt9559 = 0;
			Static361.anInt6564 = 1;
			Static119.anInt2475 = arg1;
			Static258.anInt4725 = arg0;
			local54 = Static123.method2194(Static469.aClass235_2, Static49.aClass208_22);
			local54.aClass1_Sub3_Sub1_1.method7937(local18 + Static311.anInt5708);
			local54.aClass1_Sub3_Sub1_1.method7912(local15 + Static539.anInt9045);
			local54.aClass1_Sub3_Sub1_1.method7937(Static299.anInt5617);
			local54.aClass1_Sub3_Sub1_1.method7923(Static253.anInt4623);
			local54.aClass1_Sub3_Sub1_1.method7969(Static594.anInt9808);
			Static42.method746(local54);
			Static590.method7873(local18, true, 0, -4, local15, 0, 1, 1);
		}
		if (local21 == 10) {
			local235 = (Class1_Sub33) Static372.aClass91_30.method2271((long) local25);
			if (local235 != null) {
				Static300.anInt9559 = 0;
				Static361.anInt6564 = 2;
				local252 = local235.aClass11_Sub1_Sub1_Sub3_Sub2_2;
				Static119.anInt2475 = arg1;
				Static258.anInt4725 = arg0;
				local257 = Static123.method2194(Static469.aClass235_2, Static550.aClass208_105);
				local257.aClass1_Sub3_Sub1_1.method7918(local25);
				local257.aClass1_Sub3_Sub1_1.method7933(Static326.aClass97_3.method2365(82) ? 1 : 0);
				Static42.method746(local257);
				Static590.method7873(local252.anIntArray454[0], true, 0, -2, local252.anIntArray455[0], 0, local252.method6058(), local252.method6058());
			}
		}
		if (local21 == 1004 || local21 == 1009 || local21 == 1001 || local21 == 1008 || local21 == 1002) {
			Static154.method2540(local21, local15, local25);
		}
		if (local21 == 20 && Static390.aClass160_43 == null) {
			Static352.method5254(local15, local18);
			Static390.aClass160_43 = Static420.method5959(local18, local15);
			Static415.method5900(Static390.aClass160_43);
		}
		if (Static563.aBoolean697) {
			Static193.method3074();
		}
		if (Static375.aClass160_24 != null && Static80.anInt1540 == 0) {
			Static415.method5900(Static375.aClass160_24);
		}
	}
}
