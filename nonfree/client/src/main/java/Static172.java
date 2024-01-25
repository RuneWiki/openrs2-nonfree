import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!fg", name = "k", descriptor = "[[Lclient!nt;")
	public static Class270[][] aClass270ArrayArray2;

	@OriginalMember(owner = "client!fg", name = "n", descriptor = "[I")
	public static final int[] anIntArray202 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIZLclient!hla;)V")
	public static void method2785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub7_Sub10 arg2) {
		if (arg2 == null || Static419.aClass342_81.aClass3_291 == arg2) {
			return;
		}
		@Pc(18) int local18 = arg2.anInt3909;
		@Pc(21) int local21 = arg2.anInt3911;
		@Pc(24) int local24 = arg2.anInt3913;
		@Pc(28) int local28 = (int) arg2.aLong145;
		if (local24 >= 2000) {
			local24 -= 2000;
		}
		@Pc(37) long local37 = arg2.aLong145;
		@Pc(39) Class144 local39 = null;
		if (local24 == 11) {
			local39 = Static600.aClass144_90;
		} else if (local24 == 52) {
			local39 = Static657.aClass144_100;
		} else if (local24 == 3) {
			local39 = Static94.aClass144_18;
		} else if (local24 == 60) {
			local39 = Static351.aClass144_55;
		} else if (local24 == 1010) {
			local39 = Static367.aClass144_59;
		} else if (local24 == 1007) {
			local39 = Static727.aClass144_114;
		}
		if (local39 != null) {
			Static312.anInt5046 = arg1;
			Static419.anInt10150 = 0;
			Static448.anInt6836 = 2;
			Static213.anInt3512 = arg0;
			@Pc(102) Class3_Sub29 local102 = Static507.method6901(local39, Static95.aClass292_2.aClass88_2);
			local102.aClass3_Sub2_Sub1_1.method2055(local21 + Static189.anInt3243);
			local102.aClass3_Sub2_Sub1_1.method2065(Static43.aClass50_1.method7394(82) ? 1 : 0);
			local102.aClass3_Sub2_Sub1_1.method2037((int) (local37 >>> 32) & Integer.MAX_VALUE);
			local102.aClass3_Sub2_Sub1_1.method2055(Static291.anInt4448 + local18);
			Static95.aClass292_2.method6855(local102);
			Static298.method4187(local21, local18, local37);
		}
		@Pc(151) Class144 local151 = null;
		if (local24 == 18) {
			local151 = Static58.aClass144_12;
		} else if (local24 == 57) {
			local151 = Static137.aClass144_22;
		} else if (local24 == 59) {
			local151 = Static551.aClass144_82;
		} else if (local24 == 46) {
			local151 = Static263.aClass144_43;
		} else if (local24 == 5) {
			local151 = Static315.aClass144_49;
		} else if (local24 == 4) {
			local151 = Static467.aClass144_73;
		} else if (local24 == 53) {
			local151 = Static71.aClass144_13;
		} else if (local24 == 49) {
			local151 = Static604.aClass144_91;
		} else if (local24 == 13) {
			local151 = Static303.aClass144_47;
		} else if (local24 == 50) {
			local151 = Static367.aClass144_58;
		}
		@Pc(262) Class3_Sub29 local262;
		if (local151 != null) {
			@Pc(242) Class9_Sub1_Sub1_Sub2_Sub1 local242 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local28];
			if (local242 != null) {
				Static213.anInt3512 = arg0;
				Static448.anInt6836 = 2;
				Static419.anInt10150 = 0;
				Static312.anInt5046 = arg1;
				local262 = Static507.method6901(local151, Static95.aClass292_2.aClass88_2);
				local262.aClass3_Sub2_Sub1_1.method2020(Static43.aClass50_1.method7394(82) ? 1 : 0);
				local262.aClass3_Sub2_Sub1_1.method2055(local28);
				Static95.aClass292_2.method6855(local262);
				Static671.method8997(0, local242.method7485(), local242.method7485(), local242.anIntArray643[0], 0, -2, true, local242.anIntArray644[0]);
			}
		}
		if (local24 == 9) {
			if (Static432.anInt6579 > 0 && Static43.aClass50_1.method7394(82) && Static43.aClass50_1.method7394(81)) {
				Static688.method9110(Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139, local21 + Static189.anInt3243, Static291.anInt4448 - -local18);
			} else {
				Static419.anInt10150 = 0;
				Static312.anInt5046 = arg1;
				Static213.anInt3512 = arg0;
				Static448.anInt6836 = 1;
				@Pc(349) Class3_Sub29 local349 = Static507.method6901(Static691.aClass144_106, Static95.aClass292_2.aClass88_2);
				local349.aClass3_Sub2_Sub1_1.method2037(local21 + Static189.anInt3243);
				local349.aClass3_Sub2_Sub1_1.method2037(local18 + Static291.anInt4448);
				Static95.aClass292_2.method6855(local349);
			}
		}
		@Pc(391) Class144 local391 = null;
		if (local24 == 22) {
			local391 = Static210.aClass144_34;
		} else if (local24 == 16) {
			local391 = Static370.aClass144_60;
		} else if (local24 == 8) {
			local391 = Static400.aClass144_63;
		} else if (local24 == 58) {
			local391 = Static675.aClass144_103;
		} else if (local24 == 47) {
			local391 = Static245.aClass144_41;
		} else if (local24 == 1011) {
			local391 = Static194.aClass144_33;
		}
		if (local391 != null) {
			Static312.anInt5046 = arg1;
			Static419.anInt10150 = 0;
			Static213.anInt3512 = arg0;
			Static448.anInt6836 = 2;
			local262 = Static507.method6901(local391, Static95.aClass292_2.aClass88_2);
			local262.aClass3_Sub2_Sub1_1.method2032(Static189.anInt3243 + local21);
			local262.aClass3_Sub2_Sub1_1.method2055(Static291.anInt4448 + local18);
			local262.aClass3_Sub2_Sub1_1.method2037(local28);
			local262.aClass3_Sub2_Sub1_1.method2065(Static43.aClass50_1.method7394(82) ? 1 : 0);
			Static95.aClass292_2.method6855(local262);
			Static532.method7080(local18, local21);
		}
		if (local24 == 17) {
			if (Static432.anInt6579 > 0 && Static43.aClass50_1.method7394(82) && Static43.aClass50_1.method7394(81)) {
				Static688.method9110(Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139, Static189.anInt3243 + local21, Static291.anInt4448 - -local18);
			} else {
				local262 = Static10.method360(local21, local18, local28);
				if (local28 == 1) {
					local262.aClass3_Sub2_Sub1_1.method2065(-1);
					local262.aClass3_Sub2_Sub1_1.method2065(-1);
					local262.aClass3_Sub2_Sub1_1.method2032((int) Static382.aFloat40);
					local262.aClass3_Sub2_Sub1_1.method2065(57);
					local262.aClass3_Sub2_Sub1_1.method2065(Static194.anInt3310);
					local262.aClass3_Sub2_Sub1_1.method2065(Static402.anInt6239);
					local262.aClass3_Sub2_Sub1_1.method2065(89);
					local262.aClass3_Sub2_Sub1_1.method2032(Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10694);
					local262.aClass3_Sub2_Sub1_1.method2032(Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10695);
					local262.aClass3_Sub2_Sub1_1.method2065(63);
				} else {
					Static213.anInt3512 = arg0;
					Static419.anInt10150 = 0;
					Static448.anInt6836 = 1;
					Static312.anInt5046 = arg1;
				}
				Static95.aClass292_2.method6855(local262);
				Static671.method8997(0, 1, 1, local21, 0, -4, true, local18);
			}
		}
		@Pc(638) Class144 local638 = null;
		if (local24 == 2) {
			local638 = Static643.aClass144_97;
		} else if (local24 == 51) {
			local638 = Static444.aClass144_68;
		} else if (local24 == 10) {
			local638 = Static304.aClass144_48;
		} else if (local24 == 6) {
			local638 = Static682.aClass144_105;
		} else if (local24 == 12) {
			local638 = Static561.aClass144_85;
		} else if (local24 == 1006) {
			local638 = Static115.aClass144_20;
		}
		@Pc(692) Class3_Sub52 local692;
		@Pc(709) Class9_Sub1_Sub1_Sub2_Sub2 local709;
		@Pc(715) Class3_Sub29 local715;
		if (local638 != null) {
			local692 = (Class3_Sub52) Static94.aClass313_8.method7104((long) local28);
			if (local692 != null) {
				Static312.anInt5046 = arg1;
				Static448.anInt6836 = 2;
				Static419.anInt10150 = 0;
				Static213.anInt3512 = arg0;
				local709 = local692.aClass9_Sub1_Sub1_Sub2_Sub2_2;
				local715 = Static507.method6901(local638, Static95.aClass292_2.aClass88_2);
				local715.aClass3_Sub2_Sub1_1.method2020(Static43.aClass50_1.method7394(82) ? 1 : 0);
				local715.aClass3_Sub2_Sub1_1.method2037(local28);
				Static95.aClass292_2.method6855(local715);
				Static671.method8997(0, local709.method7485(), local709.method7485(), local709.anIntArray643[0], 0, -2, true, local709.anIntArray644[0]);
			}
		}
		@Pc(781) Class3_Sub29 local781;
		if (local24 == 30) {
			Static312.anInt5046 = arg1;
			Static448.anInt6836 = 2;
			Static213.anInt3512 = arg0;
			Static419.anInt10150 = 0;
			local781 = Static507.method6901(Static125.aClass144_21, Static95.aClass292_2.aClass88_2);
			local781.aClass3_Sub2_Sub1_1.method2010(local28);
			local781.aClass3_Sub2_Sub1_1.method2065(Static43.aClass50_1.method7394(82) ? 1 : 0);
			local781.aClass3_Sub2_Sub1_1.method2032(Static418.anInt6410);
			local781.aClass3_Sub2_Sub1_1.method2010(Static189.anInt3243 + local21);
			local781.aClass3_Sub2_Sub1_1.method2037(local18 + Static291.anInt4448);
			local781.aClass3_Sub2_Sub1_1.method2034(Static216.anInt3565);
			local781.aClass3_Sub2_Sub1_1.method2055(Static318.anInt1773);
			Static95.aClass292_2.method6855(local781);
			Static532.method7080(local18, local21);
		}
		@Pc(847) Class270 local847;
		if (local24 == 48) {
			local847 = Static1.method9504(local18, local21);
			if (local847 != null) {
				Static713.method9479(local847);
			}
		}
		if (local24 == 23 && Static710.aClass270_11 == null) {
			Static235.method3411(local18, local21);
			Static710.aClass270_11 = Static1.method9504(local18, local21);
			Static539.method7146(Static710.aClass270_11);
		}
		if (local24 == 45) {
			Static213.anInt3512 = arg0;
			Static419.anInt10150 = 0;
			Static448.anInt6836 = 2;
			Static312.anInt5046 = arg1;
			local781 = Static507.method6901(Static716.aClass144_113, Static95.aClass292_2.aClass88_2);
			local781.aClass3_Sub2_Sub1_1.method2037(Static418.anInt6410);
			local781.aClass3_Sub2_Sub1_1.method2037(Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt8783);
			local781.aClass3_Sub2_Sub1_1.method2074(Static43.aClass50_1.method7394(82) ? 1 : 0);
			local781.aClass3_Sub2_Sub1_1.method2025(Static216.anInt3565);
			local781.aClass3_Sub2_Sub1_1.method2010(Static318.anInt1773);
			Static95.aClass292_2.method6855(local781);
		}
		if (local24 == 44) {
			Static213.anInt3512 = arg0;
			Static448.anInt6836 = 2;
			Static419.anInt10150 = 0;
			Static312.anInt5046 = arg1;
			local781 = Static507.method6901(Static220.aClass144_38, Static95.aClass292_2.aClass88_2);
			local781.aClass3_Sub2_Sub1_1.method2055(Static418.anInt6410);
			local781.aClass3_Sub2_Sub1_1.method2074(Static43.aClass50_1.method7394(82) ? 1 : 0);
			local781.aClass3_Sub2_Sub1_1.method2037(local18 + Static291.anInt4448);
			local781.aClass3_Sub2_Sub1_1.method2032(local21 + Static189.anInt3243);
			local781.aClass3_Sub2_Sub1_1.method2025(Static216.anInt3565);
			local781.aClass3_Sub2_Sub1_1.method2010(Static318.anInt1773);
			local781.aClass3_Sub2_Sub1_1.method2032((int) (local37 >>> 32) & Integer.MAX_VALUE);
			Static95.aClass292_2.method6855(local781);
			Static298.method4187(local21, local18, local37);
		}
		if (local24 == 21) {
			local692 = (Class3_Sub52) Static94.aClass313_8.method7104((long) local28);
			if (local692 != null) {
				Static312.anInt5046 = arg1;
				Static213.anInt3512 = arg0;
				Static419.anInt10150 = 0;
				Static448.anInt6836 = 2;
				local709 = local692.aClass9_Sub1_Sub1_Sub2_Sub2_2;
				local715 = Static507.method6901(Static625.aClass144_95, Static95.aClass292_2.aClass88_2);
				local715.aClass3_Sub2_Sub1_1.method2032(Static418.anInt6410);
				local715.aClass3_Sub2_Sub1_1.method2020(Static43.aClass50_1.method7394(82) ? 1 : 0);
				local715.aClass3_Sub2_Sub1_1.method2037(local28);
				local715.aClass3_Sub2_Sub1_1.method2034(Static216.anInt3565);
				local715.aClass3_Sub2_Sub1_1.method2037(Static318.anInt1773);
				Static95.aClass292_2.method6855(local715);
				Static671.method8997(0, local709.method7485(), local709.method7485(), local709.anIntArray643[0], 0, -2, true, local709.anIntArray644[0]);
			}
		}
		if (local24 == 25) {
			local847 = Static1.method9504(local18, local21);
			if (local847 != null) {
				Static443.method5872();
				@Pc(1126) Class3_Sub47 local1126 = Static85.method1871(local847);
				Static340.method4863(local1126.anInt7683, local847, local1126.method6627());
				Static261.aString59 = Static699.method9255(local847);
				Static96.aString130 = local847.aString93 + "<col=ffffff>";
				if (Static261.aString59 == null) {
					Static261.aString59 = "Null";
				}
			}
			return;
		}
		if (local24 == 1001 || local24 == 1009 || local24 == 1012 || local24 == 1008 || local24 == 1003) {
			Static307.method4547(local28, local24, local18);
		}
		if (local24 == 19) {
			Static419.anInt10150 = 0;
			Static448.anInt6836 = 1;
			Static312.anInt5046 = arg1;
			Static213.anInt3512 = arg0;
			local781 = Static507.method6901(Static141.aClass144_23, Static95.aClass292_2.aClass88_2);
			local781.aClass3_Sub2_Sub1_1.method2025(Static216.anInt3565);
			local781.aClass3_Sub2_Sub1_1.method2037(local18 + Static291.anInt4448);
			local781.aClass3_Sub2_Sub1_1.method2032(Static318.anInt1773);
			local781.aClass3_Sub2_Sub1_1.method2032(Static189.anInt3243 + local21);
			local781.aClass3_Sub2_Sub1_1.method2032(Static418.anInt6410);
			Static95.aClass292_2.method6855(local781);
			Static671.method8997(0, 1, 1, local21, 0, -4, true, local18);
		}
		if (local24 == 15) {
			@Pc(1270) Class9_Sub1_Sub1_Sub2_Sub1 local1270 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local28];
			if (local1270 != null) {
				Static419.anInt10150 = 0;
				Static312.anInt5046 = arg1;
				Static213.anInt3512 = arg0;
				Static448.anInt6836 = 2;
				@Pc(1290) Class3_Sub29 local1290 = Static507.method6901(Static716.aClass144_113, Static95.aClass292_2.aClass88_2);
				local1290.aClass3_Sub2_Sub1_1.method2037(Static418.anInt6410);
				local1290.aClass3_Sub2_Sub1_1.method2037(local28);
				local1290.aClass3_Sub2_Sub1_1.method2074(Static43.aClass50_1.method7394(82) ? 1 : 0);
				local1290.aClass3_Sub2_Sub1_1.method2025(Static216.anInt3565);
				local1290.aClass3_Sub2_Sub1_1.method2010(Static318.anInt1773);
				Static95.aClass292_2.method6855(local1290);
				Static671.method8997(0, local1270.method7485(), local1270.method7485(), local1270.anIntArray643[0], 0, -2, true, local1270.anIntArray644[0]);
			}
		}
		if (local24 == 20 || local24 == 1002) {
			Static412.method5512(arg2.aString58, local28, local18, local21);
		}
		if (Static474.aBoolean505) {
			Static443.method5872();
		}
		if (Static407.aClass270_14 != null && Static96.anInt10770 == 0) {
			Static539.method7146(Static407.aClass270_14);
		}
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(B)V")
	public static void method2787() {
		Static336.method4832(12);
		Static276.method3879();
		System.gc();
	}
}
