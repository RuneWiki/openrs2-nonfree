import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
	public static int anInt6518;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZII)Z")
	public static boolean method5665(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static47.method900(arg0, arg1) | (arg1 & 0x70000) != 0 || Static57.method7333(arg0, arg1);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!sba;IIZ)V")
	public static void method5666(@OriginalArg(0) Class3_Sub7_Sub19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null || Static544.aClass216_66.aClass3_185 == arg0) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt8565;
		@Pc(18) int local18 = arg0.anInt8563;
		@Pc(21) int local21 = arg0.anInt8564;
		@Pc(25) int local25 = (int) arg0.aLong229;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(34) long local34 = arg0.aLong229;
		@Pc(52) Class3_Sub43 local52;
		@Pc(57) Class9_Sub2_Sub1_Sub2_Sub2 local57;
		@Pc(74) Class3_Sub27 local74;
		if (local21 == 10) {
			local52 = (Class3_Sub43) Static545.aClass25_40.method426((long) local25);
			if (local52 != null) {
				local57 = local52.aClass9_Sub2_Sub1_Sub2_Sub2_2;
				Static64.anInt1105 = 2;
				Static351.anInt6517 = 0;
				Static116.anInt2543 = arg1;
				Static337.anInt6295 = arg2;
				local74 = Static59.method1040(Static325.aClass20_2, Static132.aClass314_44);
				local74.aClass3_Sub9_Sub2_2.method5635(Static476.aClass62_2.method1421(82) ? 1 : 0);
				local74.aClass3_Sub9_Sub2_2.method5616(local25);
				Static148.method2572(local74);
				Static276.method4535(local57.anIntArray675[0], true, local57.anIntArray676[0], 0, local57.method8619(), local57.method8619(), 0, -2);
			}
		}
		if (local21 == 22) {
			local52 = (Class3_Sub43) Static545.aClass25_40.method426((long) local25);
			if (local52 != null) {
				Static64.anInt1105 = 2;
				Static337.anInt6295 = arg2;
				Static116.anInt2543 = arg1;
				Static351.anInt6517 = 0;
				local57 = local52.aClass9_Sub2_Sub1_Sub2_Sub2_2;
				local74 = Static59.method1040(Static325.aClass20_2, Static605.aClass314_143);
				local74.aClass3_Sub9_Sub2_2.method5572(Static476.aClass62_2.method1421(82) ? 1 : 0);
				local74.aClass3_Sub9_Sub2_2.method5637(Static491.anInt8353);
				local74.aClass3_Sub9_Sub2_2.method5620(Static260.anInt5074);
				local74.aClass3_Sub9_Sub2_2.method5616(local25);
				local74.aClass3_Sub9_Sub2_2.method5620(Static174.anInt3360);
				Static148.method2572(local74);
				Static276.method4535(local57.anIntArray675[0], true, local57.anIntArray676[0], 0, local57.method8619(), local57.method8619(), 0, -2);
			}
		}
		@Pc(225) Class3_Sub27 local225;
		if (local21 == 57) {
			Static116.anInt2543 = arg1;
			Static337.anInt6295 = arg2;
			Static351.anInt6517 = 0;
			Static64.anInt1105 = 2;
			local225 = Static59.method1040(Static325.aClass20_2, Static42.aClass314_10);
			local225.aClass3_Sub9_Sub2_2.method5595(Static427.anInt7462 + local15);
			local225.aClass3_Sub9_Sub2_2.method5581(Integer.MAX_VALUE & (int) (local34 >>> 32));
			local225.aClass3_Sub9_Sub2_2.method5620(local18 + Static22.anInt329);
			local225.aClass3_Sub9_Sub2_2.method5612(Static476.aClass62_2.method1421(82) ? 1 : 0);
			Static148.method2572(local225);
			Static117.method2148(local15, local18, local34);
		}
		if (local21 == 46) {
			Static116.anInt2543 = arg1;
			Static351.anInt6517 = 0;
			Static337.anInt6295 = arg2;
			Static64.anInt1105 = 2;
			local225 = Static59.method1040(Static325.aClass20_2, Static309.aClass314_89);
			local225.aClass3_Sub9_Sub2_2.method5620(Static260.anInt5074);
			local225.aClass3_Sub9_Sub2_2.method5620(local18 + Static22.anInt329);
			local225.aClass3_Sub9_Sub2_2.method5591(Static491.anInt8353);
			local225.aClass3_Sub9_Sub2_2.method5616(Static427.anInt7462 + local15);
			local225.aClass3_Sub9_Sub2_2.method5593(Static476.aClass62_2.method1421(82) ? 1 : 0);
			local225.aClass3_Sub9_Sub2_2.method5581(local25);
			local225.aClass3_Sub9_Sub2_2.method5581(Static174.anInt3360);
			Static148.method2572(local225);
			Static435.method6602(local18, local15);
		}
		if (local21 == 16) {
			Static351.anInt6517 = 0;
			Static64.anInt1105 = 2;
			Static116.anInt2543 = arg1;
			Static337.anInt6295 = arg2;
			local225 = Static59.method1040(Static325.aClass20_2, Static546.aClass314_136);
			local225.aClass3_Sub9_Sub2_2.method5572(Static476.aClass62_2.method1421(82) ? 1 : 0);
			local225.aClass3_Sub9_Sub2_2.method5595(Static427.anInt7462 + local15);
			local225.aClass3_Sub9_Sub2_2.method5616(Static22.anInt329 + local18);
			local225.aClass3_Sub9_Sub2_2.method5581((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static148.method2572(local225);
			Static117.method2148(local15, local18, local34);
		}
		if (local21 == 1007) {
			Static351.anInt6517 = 0;
			Static64.anInt1105 = 2;
			Static116.anInt2543 = arg1;
			Static337.anInt6295 = arg2;
			local52 = (Class3_Sub43) Static545.aClass25_40.method426((long) local25);
			if (local52 != null) {
				local57 = local52.aClass9_Sub2_Sub1_Sub2_Sub2_2;
				@Pc(436) Class309 local436 = local57.aClass309_1;
				if (local436.anIntArray553 != null) {
					local436 = local436.method7594(Static183.aClass285_1);
				}
				if (local436 != null) {
					@Pc(455) Class3_Sub27 local455 = Static59.method1040(Static325.aClass20_2, Static212.aClass314_69);
					local455.aClass3_Sub9_Sub2_2.method5620(local436.anInt8837);
					Static148.method2572(local455);
				}
			}
		}
		@Pc(471) Class9_Sub2_Sub1_Sub2_Sub1 local471;
		@Pc(490) Class3_Sub27 local490;
		if (local21 == 48) {
			local471 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local25];
			if (local471 != null) {
				Static64.anInt1105 = 2;
				Static351.anInt6517 = 0;
				Static116.anInt2543 = arg1;
				Static337.anInt6295 = arg2;
				local490 = Static59.method1040(Static325.aClass20_2, Static538.aClass314_134);
				local490.aClass3_Sub9_Sub2_2.method5612(Static476.aClass62_2.method1421(82) ? 1 : 0);
				local490.aClass3_Sub9_Sub2_2.method5581(local25);
				Static148.method2572(local490);
				Static276.method4535(local471.anIntArray675[0], true, local471.anIntArray676[0], 0, local471.method8619(), local471.method8619(), 0, -2);
			}
		}
		if (local21 == 6) {
			Static116.anInt2543 = arg1;
			Static64.anInt1105 = 2;
			Static337.anInt6295 = arg2;
			Static351.anInt6517 = 0;
			local225 = Static59.method1040(Static325.aClass20_2, Static326.aClass314_93);
			local225.aClass3_Sub9_Sub2_2.method5620(local25);
			local225.aClass3_Sub9_Sub2_2.method5581(local18 + Static22.anInt329);
			local225.aClass3_Sub9_Sub2_2.method5612(Static476.aClass62_2.method1421(82) ? 1 : 0);
			local225.aClass3_Sub9_Sub2_2.method5620(local15 + Static427.anInt7462);
			Static148.method2572(local225);
			Static435.method6602(local18, local15);
		}
		if (local21 == 9) {
			local52 = (Class3_Sub43) Static545.aClass25_40.method426((long) local25);
			if (local52 != null) {
				Static116.anInt2543 = arg1;
				Static64.anInt1105 = 2;
				Static337.anInt6295 = arg2;
				Static351.anInt6517 = 0;
				local57 = local52.aClass9_Sub2_Sub1_Sub2_Sub2_2;
				local74 = Static59.method1040(Static325.aClass20_2, Static542.aClass314_135);
				local74.aClass3_Sub9_Sub2_2.method5620(local25);
				local74.aClass3_Sub9_Sub2_2.method5612(Static476.aClass62_2.method1421(82) ? 1 : 0);
				Static148.method2572(local74);
				Static276.method4535(local57.anIntArray675[0], true, local57.anIntArray676[0], 0, local57.method8619(), local57.method8619(), 0, -2);
			}
		}
		if (local21 == 17) {
			local52 = (Class3_Sub43) Static545.aClass25_40.method426((long) local25);
			if (local52 != null) {
				Static351.anInt6517 = 0;
				Static116.anInt2543 = arg1;
				Static64.anInt1105 = 2;
				local57 = local52.aClass9_Sub2_Sub1_Sub2_Sub2_2;
				Static337.anInt6295 = arg2;
				local74 = Static59.method1040(Static325.aClass20_2, Static331.aClass314_95);
				local74.aClass3_Sub9_Sub2_2.method5581(local25);
				local74.aClass3_Sub9_Sub2_2.method5572(Static476.aClass62_2.method1421(82) ? 1 : 0);
				Static148.method2572(local74);
				Static276.method4535(local57.anIntArray675[0], true, local57.anIntArray676[0], 0, local57.method8619(), local57.method8619(), 0, -2);
			}
		}
		if (local21 == 20) {
			Static116.anInt2543 = arg1;
			Static64.anInt1105 = 2;
			Static351.anInt6517 = 0;
			Static337.anInt6295 = arg2;
			local225 = Static59.method1040(Static325.aClass20_2, Static195.aClass314_66);
			local225.aClass3_Sub9_Sub2_2.method5612(Static476.aClass62_2.method1421(82) ? 1 : 0);
			local225.aClass3_Sub9_Sub2_2.method5620(Static174.anInt3360);
			local225.aClass3_Sub9_Sub2_2.method5595(local18 + Static22.anInt329);
			local225.aClass3_Sub9_Sub2_2.method5620((int) (local34 >>> 32) & Integer.MAX_VALUE);
			local225.aClass3_Sub9_Sub2_2.method5595(Static427.anInt7462 + local15);
			local225.aClass3_Sub9_Sub2_2.method5590(Static491.anInt8353);
			local225.aClass3_Sub9_Sub2_2.method5595(Static260.anInt5074);
			Static148.method2572(local225);
			Static117.method2148(local15, local18, local34);
		}
		if (local21 == 18) {
			local471 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local25];
			if (local471 != null) {
				Static116.anInt2543 = arg1;
				Static337.anInt6295 = arg2;
				Static351.anInt6517 = 0;
				Static64.anInt1105 = 2;
				local490 = Static59.method1040(Static325.aClass20_2, Static448.aClass314_85);
				local490.aClass3_Sub9_Sub2_2.method5593(Static476.aClass62_2.method1421(82) ? 1 : 0);
				local490.aClass3_Sub9_Sub2_2.method5595(local25);
				Static148.method2572(local490);
				Static276.method4535(local471.anIntArray675[0], true, local471.anIntArray676[0], 0, local471.method8619(), local471.method8619(), 0, -2);
			}
		}
		if (local21 == 4) {
			local471 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local25];
			if (local471 != null) {
				Static116.anInt2543 = arg1;
				Static337.anInt6295 = arg2;
				Static351.anInt6517 = 0;
				Static64.anInt1105 = 2;
				local490 = Static59.method1040(Static325.aClass20_2, Static62.aClass314_23);
				local490.aClass3_Sub9_Sub2_2.method5595(local25);
				local490.aClass3_Sub9_Sub2_2.method5572(Static476.aClass62_2.method1421(82) ? 1 : 0);
				Static148.method2572(local490);
				Static276.method4535(local471.anIntArray675[0], true, local471.anIntArray676[0], 0, local471.method8619(), local471.method8619(), 0, -2);
			}
		}
		if (local21 == 47) {
			Static337.anInt6295 = arg2;
			Static64.anInt1105 = 2;
			Static116.anInt2543 = arg1;
			Static351.anInt6517 = 0;
			local225 = Static59.method1040(Static325.aClass20_2, Static226.aClass314_73);
			local225.aClass3_Sub9_Sub2_2.method5620(Static427.anInt7462 + local15);
			local225.aClass3_Sub9_Sub2_2.method5616(local25);
			local225.aClass3_Sub9_Sub2_2.method5620(Static22.anInt329 + local18);
			local225.aClass3_Sub9_Sub2_2.method5612(Static476.aClass62_2.method1421(82) ? 1 : 0);
			Static148.method2572(local225);
			Static435.method6602(local18, local15);
		}
		if (local21 == 1003) {
			Static64.anInt1105 = 2;
			Static116.anInt2543 = arg1;
			Static337.anInt6295 = arg2;
			Static351.anInt6517 = 0;
			local225 = Static59.method1040(Static325.aClass20_2, Static341.aClass314_97);
			local225.aClass3_Sub9_Sub2_2.method5620(local25);
			Static148.method2572(local225);
		}
		if (local21 == 15) {
			local471 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local25];
			if (local471 != null) {
				Static351.anInt6517 = 0;
				Static116.anInt2543 = arg1;
				Static64.anInt1105 = 2;
				Static337.anInt6295 = arg2;
				local490 = Static59.method1040(Static325.aClass20_2, Static487.aClass314_121);
				local490.aClass3_Sub9_Sub2_2.method5593(Static476.aClass62_2.method1421(82) ? 1 : 0);
				local490.aClass3_Sub9_Sub2_2.method5581(local25);
				local490.aClass3_Sub9_Sub2_2.method5620(Static174.anInt3360);
				local490.aClass3_Sub9_Sub2_2.method5581(Static260.anInt5074);
				local490.aClass3_Sub9_Sub2_2.method5637(Static491.anInt8353);
				Static148.method2572(local490);
				Static276.method4535(local471.anIntArray675[0], true, local471.anIntArray676[0], 0, local471.method8619(), local471.method8619(), 0, -2);
			}
		}
		if (local21 == 8) {
			if (Static544.anInt9130 > 0 && Static476.aClass62_2.method1421(82) && Static476.aClass62_2.method1421(81)) {
				Static99.method7008(Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127, Static22.anInt329 + local18, local15 + Static427.anInt7462);
			} else {
				local225 = Static528.method7683(local18, local15, local25);
				if (local25 == 1) {
					local225.aClass3_Sub9_Sub2_2.method5572(-1);
					local225.aClass3_Sub9_Sub2_2.method5572(-1);
					local225.aClass3_Sub9_Sub2_2.method5620((int) Static170.aFloat71);
					local225.aClass3_Sub9_Sub2_2.method5572(57);
					local225.aClass3_Sub9_Sub2_2.method5572(Static579.anInt9458);
					local225.aClass3_Sub9_Sub2_2.method5572(Static296.anInt5883);
					local225.aClass3_Sub9_Sub2_2.method5572(89);
					local225.aClass3_Sub9_Sub2_2.method5620(Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10152);
					local225.aClass3_Sub9_Sub2_2.method5620(Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10158);
					local225.aClass3_Sub9_Sub2_2.method5572(63);
				} else {
					Static116.anInt2543 = arg1;
					Static351.anInt6517 = 0;
					Static64.anInt1105 = 1;
					Static337.anInt6295 = arg2;
				}
				Static148.method2572(local225);
				Static276.method4535(local15, true, local18, 0, 1, 1, 0, -4);
			}
		}
		if (local21 == 12) {
			Static64.anInt1105 = 2;
			Static337.anInt6295 = arg2;
			Static351.anInt6517 = 0;
			Static116.anInt2543 = arg1;
			local225 = Static59.method1040(Static325.aClass20_2, Static48.aClass314_139);
			local225.aClass3_Sub9_Sub2_2.method5595(Static427.anInt7462 + local15);
			local225.aClass3_Sub9_Sub2_2.method5620(local25);
			local225.aClass3_Sub9_Sub2_2.method5620(Static22.anInt329 + local18);
			local225.aClass3_Sub9_Sub2_2.method5572(Static476.aClass62_2.method1421(82) ? 1 : 0);
			Static148.method2572(local225);
			Static435.method6602(local18, local15);
		}
		if (local21 == 2 && Static9.aClass344_1 == null) {
			Static441.method6426(local15, local18);
			Static9.aClass344_1 = Static258.method4328(local18, local15);
			Static605.method8323(Static9.aClass344_1);
		}
		if (local21 == 13) {
			local471 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local25];
			if (local471 != null) {
				Static351.anInt6517 = 0;
				Static64.anInt1105 = 2;
				Static116.anInt2543 = arg1;
				Static337.anInt6295 = arg2;
				local490 = Static59.method1040(Static325.aClass20_2, Static443.aClass314_111);
				local490.aClass3_Sub9_Sub2_2.method5581(local25);
				local490.aClass3_Sub9_Sub2_2.method5572(Static476.aClass62_2.method1421(82) ? 1 : 0);
				Static148.method2572(local490);
				Static276.method4535(local471.anIntArray675[0], true, local471.anIntArray676[0], 0, local471.method8619(), local471.method8619(), 0, -2);
			}
		}
		if (local21 == 25) {
			Static351.anInt6517 = 0;
			Static337.anInt6295 = arg2;
			Static64.anInt1105 = 2;
			Static116.anInt2543 = arg1;
			local225 = Static59.method1040(Static325.aClass20_2, Static105.aClass314_39);
			local225.aClass3_Sub9_Sub2_2.method5620(Static22.anInt329 + local18);
			local225.aClass3_Sub9_Sub2_2.method5595(local15 + Static427.anInt7462);
			local225.aClass3_Sub9_Sub2_2.method5620(local25);
			local225.aClass3_Sub9_Sub2_2.method5612(Static476.aClass62_2.method1421(82) ? 1 : 0);
			Static148.method2572(local225);
			Static435.method6602(local18, local15);
		}
		if (local21 == 1012 || local21 == 1010 || local21 == 1008 || local21 == 1004 || local21 == 1011) {
			Static309.method5177(local15, local25, local21);
		}
		if (local21 == 1001) {
			Static337.anInt6295 = arg2;
			Static64.anInt1105 = 2;
			Static351.anInt6517 = 0;
			Static116.anInt2543 = arg1;
			local225 = Static59.method1040(Static325.aClass20_2, Static192.aClass314_65);
			local225.aClass3_Sub9_Sub2_2.method5581(Static427.anInt7462 + local15);
			local225.aClass3_Sub9_Sub2_2.method5572(Static476.aClass62_2.method1421(82) ? 1 : 0);
			local225.aClass3_Sub9_Sub2_2.method5595(Static22.anInt329 + local18);
			local225.aClass3_Sub9_Sub2_2.method5620((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static148.method2572(local225);
			Static117.method2148(local15, local18, local34);
		}
		@Pc(1547) Class344 local1547;
		if (local21 == 5) {
			local1547 = Static258.method4328(local18, local15);
			if (local1547 != null) {
				Static218.method3805(local1547);
			}
		}
		if (local21 == 19) {
			Static64.anInt1105 = 2;
			Static351.anInt6517 = 0;
			Static337.anInt6295 = arg2;
			Static116.anInt2543 = arg1;
			local225 = Static59.method1040(Static325.aClass20_2, Static645.aClass314_149);
			local225.aClass3_Sub9_Sub2_2.method5612(Static476.aClass62_2.method1421(82) ? 1 : 0);
			local225.aClass3_Sub9_Sub2_2.method5581((int) (local34 >>> 32) & Integer.MAX_VALUE);
			local225.aClass3_Sub9_Sub2_2.method5595(local15 + Static427.anInt7462);
			local225.aClass3_Sub9_Sub2_2.method5620(local18 + Static22.anInt329);
			Static148.method2572(local225);
			Static117.method2148(local15, local18, local34);
		}
		if (local21 == 11) {
			local471 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local25];
			if (local471 != null) {
				Static337.anInt6295 = arg2;
				Static116.anInt2543 = arg1;
				Static64.anInt1105 = 2;
				Static351.anInt6517 = 0;
				local490 = Static59.method1040(Static325.aClass20_2, Static583.aClass314_148);
				local490.aClass3_Sub9_Sub2_2.method5635(Static476.aClass62_2.method1421(82) ? 1 : 0);
				local490.aClass3_Sub9_Sub2_2.method5620(local25);
				Static148.method2572(local490);
				Static276.method4535(local471.anIntArray675[0], true, local471.anIntArray676[0], 0, local471.method8619(), local471.method8619(), 0, -2);
			}
		}
		if (local21 == 58) {
			Static64.anInt1105 = 1;
			Static116.anInt2543 = arg1;
			Static337.anInt6295 = arg2;
			Static351.anInt6517 = 0;
			local225 = Static59.method1040(Static325.aClass20_2, Static355.aClass314_146);
			local225.aClass3_Sub9_Sub2_2.method5595(Static174.anInt3360);
			local225.aClass3_Sub9_Sub2_2.method5616(Static22.anInt329 + local18);
			local225.aClass3_Sub9_Sub2_2.method5601(Static491.anInt8353);
			local225.aClass3_Sub9_Sub2_2.method5595(Static427.anInt7462 + local15);
			local225.aClass3_Sub9_Sub2_2.method5595(Static260.anInt5074);
			Static148.method2572(local225);
			Static276.method4535(local15, true, local18, 0, 1, 1, 0, -4);
		}
		if (local21 == 3) {
			local52 = (Class3_Sub43) Static545.aClass25_40.method426((long) local25);
			if (local52 != null) {
				Static351.anInt6517 = 0;
				Static64.anInt1105 = 2;
				Static337.anInt6295 = arg2;
				local57 = local52.aClass9_Sub2_Sub1_Sub2_Sub2_2;
				Static116.anInt2543 = arg1;
				local74 = Static59.method1040(Static325.aClass20_2, Static634.aClass314_147);
				local74.aClass3_Sub9_Sub2_2.method5581(local25);
				local74.aClass3_Sub9_Sub2_2.method5612(Static476.aClass62_2.method1421(82) ? 1 : 0);
				Static148.method2572(local74);
				Static276.method4535(local57.anIntArray675[0], true, local57.anIntArray676[0], 0, local57.method8619(), local57.method8619(), 0, -2);
			}
		}
		if (local21 == 44 || local21 == 1002) {
			Static554.method7878(local15, arg0.aString83, local25, local18);
		}
		if (local21 == 59) {
			if (Static544.anInt9130 > 0 && Static476.aClass62_2.method1421(82) && Static476.aClass62_2.method1421(81)) {
				Static99.method7008(Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127, local18 + Static22.anInt329, Static427.anInt7462 - -local15);
			} else {
				Static351.anInt6517 = 0;
				Static116.anInt2543 = arg1;
				Static64.anInt1105 = 1;
				Static337.anInt6295 = arg2;
				local225 = Static59.method1040(Static325.aClass20_2, Static530.aClass314_132);
				local225.aClass3_Sub9_Sub2_2.method5620(Static22.anInt329 + local18);
				local225.aClass3_Sub9_Sub2_2.method5595(local15 + Static427.anInt7462);
				Static148.method2572(local225);
			}
		}
		if (local21 == 49) {
			Static351.anInt6517 = 0;
			Static64.anInt1105 = 2;
			Static116.anInt2543 = arg1;
			Static337.anInt6295 = arg2;
			local225 = Static59.method1040(Static325.aClass20_2, Static464.aClass314_114);
			local225.aClass3_Sub9_Sub2_2.method5572(Static476.aClass62_2.method1421(82) ? 1 : 0);
			local225.aClass3_Sub9_Sub2_2.method5581(local15 + Static427.anInt7462);
			local225.aClass3_Sub9_Sub2_2.method5581(Static22.anInt329 + local18);
			local225.aClass3_Sub9_Sub2_2.method5616(local25);
			Static148.method2572(local225);
			Static435.method6602(local18, local15);
		}
		if (local21 == 1009) {
			Static64.anInt1105 = 2;
			Static351.anInt6517 = 0;
			Static116.anInt2543 = arg1;
			Static337.anInt6295 = arg2;
			local225 = Static59.method1040(Static325.aClass20_2, Static367.aClass314_104);
			local225.aClass3_Sub9_Sub2_2.method5620(local25);
			Static148.method2572(local225);
		}
		if (local21 == 60) {
			Static116.anInt2543 = arg1;
			Static337.anInt6295 = arg2;
			Static64.anInt1105 = 2;
			Static351.anInt6517 = 0;
			local225 = Static59.method1040(Static325.aClass20_2, Static487.aClass314_121);
			local225.aClass3_Sub9_Sub2_2.method5593(Static476.aClass62_2.method1421(82) ? 1 : 0);
			local225.aClass3_Sub9_Sub2_2.method5581(Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10204);
			local225.aClass3_Sub9_Sub2_2.method5620(Static174.anInt3360);
			local225.aClass3_Sub9_Sub2_2.method5581(Static260.anInt5074);
			local225.aClass3_Sub9_Sub2_2.method5637(Static491.anInt8353);
			Static148.method2572(local225);
		}
		if (local21 == 50) {
			local471 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local25];
			if (local471 != null) {
				Static116.anInt2543 = arg1;
				Static337.anInt6295 = arg2;
				Static64.anInt1105 = 2;
				Static351.anInt6517 = 0;
				local490 = Static59.method1040(Static325.aClass20_2, Static27.aClass314_8);
				local490.aClass3_Sub9_Sub2_2.method5616(local25);
				local490.aClass3_Sub9_Sub2_2.method5593(Static476.aClass62_2.method1421(82) ? 1 : 0);
				Static148.method2572(local490);
				Static276.method4535(local471.anIntArray675[0], true, local471.anIntArray676[0], 0, local471.method8619(), local471.method8619(), 0, -2);
			}
		}
		if (local21 == 30) {
			local471 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local25];
			if (local471 != null) {
				Static64.anInt1105 = 2;
				Static351.anInt6517 = 0;
				Static337.anInt6295 = arg2;
				Static116.anInt2543 = arg1;
				local490 = Static59.method1040(Static325.aClass20_2, Static38.aClass314_9);
				local490.aClass3_Sub9_Sub2_2.method5593(Static476.aClass62_2.method1421(82) ? 1 : 0);
				local490.aClass3_Sub9_Sub2_2.method5581(local25);
				Static148.method2572(local490);
				Static276.method4535(local471.anIntArray675[0], true, local471.anIntArray676[0], 0, local471.method8619(), local471.method8619(), 0, -2);
			}
		}
		if (local21 == 51) {
			local471 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local25];
			if (local471 != null) {
				Static351.anInt6517 = 0;
				Static64.anInt1105 = 2;
				Static337.anInt6295 = arg2;
				Static116.anInt2543 = arg1;
				local490 = Static59.method1040(Static325.aClass20_2, Static326.aClass314_92);
				local490.aClass3_Sub9_Sub2_2.method5595(local25);
				local490.aClass3_Sub9_Sub2_2.method5572(Static476.aClass62_2.method1421(82) ? 1 : 0);
				Static148.method2572(local490);
				Static276.method4535(local471.anIntArray675[0], true, local471.anIntArray676[0], 0, local471.method8619(), local471.method8619(), 0, -2);
			}
		}
		if (local21 == 23) {
			Static64.anInt1105 = 2;
			Static351.anInt6517 = 0;
			Static116.anInt2543 = arg1;
			Static337.anInt6295 = arg2;
			local225 = Static59.method1040(Static325.aClass20_2, Static51.aClass314_20);
			local225.aClass3_Sub9_Sub2_2.method5616(Integer.MAX_VALUE & (int) (local34 >>> 32));
			local225.aClass3_Sub9_Sub2_2.method5635(Static476.aClass62_2.method1421(82) ? 1 : 0);
			local225.aClass3_Sub9_Sub2_2.method5581(Static22.anInt329 + local18);
			local225.aClass3_Sub9_Sub2_2.method5581(local15 + Static427.anInt7462);
			Static148.method2572(local225);
			Static117.method2148(local15, local18, local34);
		}
		if (local21 == 21) {
			local1547 = Static258.method4328(local18, local15);
			if (local1547 != null) {
				Static409.method6364();
				@Pc(2342) Class3_Sub50 local2342 = Static76.method1311(local1547);
				Static163.method2789(local1547, local2342.anInt9448, local2342.method8089());
				Static323.aString46 = Static374.method5191(local1547);
				Static372.aString48 = local1547.aString93 + "<col=ffffff>";
				if (Static323.aString46 == null) {
					Static323.aString46 = "Null";
				}
			}
			return;
		}
		if (local21 == 45) {
			local52 = (Class3_Sub43) Static545.aClass25_40.method426((long) local25);
			if (local52 != null) {
				Static351.anInt6517 = 0;
				Static337.anInt6295 = arg2;
				Static64.anInt1105 = 2;
				local57 = local52.aClass9_Sub2_Sub1_Sub2_Sub2_2;
				Static116.anInt2543 = arg1;
				local74 = Static59.method1040(Static325.aClass20_2, Static380.aClass314_107);
				local74.aClass3_Sub9_Sub2_2.method5593(Static476.aClass62_2.method1421(82) ? 1 : 0);
				local74.aClass3_Sub9_Sub2_2.method5581(local25);
				Static148.method2572(local74);
				Static276.method4535(local57.anIntArray675[0], true, local57.anIntArray676[0], 0, local57.method8619(), local57.method8619(), 0, -2);
			}
		}
		if (Static425.aBoolean536) {
			Static409.method6364();
		}
		if (Static490.aClass344_10 != null && Static561.anInt9315 == 0) {
			Static605.method8323(Static490.aClass344_10);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method5667(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local14 > local11 && Static10.method196(arg0.charAt(local11))) {
			local11++;
		}
		while (local14 > local11 && Static10.method196(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(49) int local49 = local14 - local11;
		if (local49 < 1 || local49 > 12) {
			return null;
		}
		@Pc(71) StringBuffer local71 = new StringBuffer(local49);
		for (@Pc(73) int local73 = local11; local73 < local14; local73++) {
			@Pc(79) char local79 = arg0.charAt(local73);
			if (Static291.method4812(local79)) {
				@Pc(89) char local89 = Static461.method6838(local79);
				if (local89 != '\u0000') {
					local71.append(local89);
				}
			}
		}
		if (local71.length() == 0) {
			return null;
		} else {
			return local71.toString();
		}
	}
}
