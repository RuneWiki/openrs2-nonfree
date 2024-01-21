import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!nb", name = "wc", descriptor = "[I")
	public static int[] anIntArray342;

	@OriginalMember(owner = "client!nb", name = "dd", descriptor = "Lclient!bd;")
	public static Class8 aClass8_28;

	@OriginalMember(owner = "client!nb", name = "jd", descriptor = "Lclient!bd;")
	public static Class8 aClass8_29;

	@OriginalMember(owner = "client!nb", name = "ld", descriptor = "Lclient!lc;")
	public static Class34 aClass34_6;

	@OriginalMember(owner = "client!nb", name = "qd", descriptor = "Lclient!u;")
	public static Class8_Sub1 aClass8_Sub1_24;

	@OriginalMember(owner = "client!nb", name = "dc", descriptor = "Lclient!a;")
	private static Class1 aClass1_2864 = Static94.method1596("Loaded textures");

	@OriginalMember(owner = "client!nb", name = "zc", descriptor = "Lclient!a;")
	private static Class1 aClass1_2865 = Static94.method1596("Login limit exceeded)3");

	@OriginalMember(owner = "client!nb", name = "Ec", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger4 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!nb", name = "Jc", descriptor = "Lclient!a;")
	public static Class1 aClass1_2866 = aClass1_2864;

	@OriginalMember(owner = "client!nb", name = "Xc", descriptor = "Lclient!a;")
	public static Class1 aClass1_2867 = aClass1_2865;

	@OriginalMember(owner = "client!nb", name = "cd", descriptor = "I")
	public static volatile int anInt2761 = 0;

	@OriginalMember(owner = "client!nb", name = "id", descriptor = "[I")
	public static int[] anIntArray345 = new int[1000];

	@OriginalMember(owner = "client!nb", name = "kd", descriptor = "I")
	public static int anInt2766 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!nb", name = "md", descriptor = "I")
	public static int anInt2767 = 0;

	@OriginalMember(owner = "client!nb", name = "nd", descriptor = "Lclient!a;")
	public static Class1 aClass1_2868 = Static94.method1596("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!nb", name = "od", descriptor = "Lclient!a;")
	private static Class1 aClass1_2869 = Static94.method1596("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!nb", name = "pd", descriptor = "[Lclient!aa;")
	public static Class2_Sub1_Sub1_Sub1_Sub1[] aClass2_Sub1_Sub1_Sub1_Sub1Array3 = new Class2_Sub1_Sub1_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!nb", name = "rd", descriptor = "Lclient!a;")
	public static Class1 aClass1_2870 = Static94.method1596("Registrierter Benutzer");

	@OriginalMember(owner = "client!nb", name = "sd", descriptor = "Lclient!a;")
	public static Class1 aClass1_2871 = aClass1_2869;

	@OriginalMember(owner = "client!nb", name = "td", descriptor = "[Lclient!a;")
	public static Class1[] aClass1Array29 = new Class1[100];

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIII)V")
	public static void method1780(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = Static109.aClass3_1.method154(arg0, arg1, arg4);
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(28) int local28;
		@Pc(36) int local36;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (local15 != 0) {
			local24 = Static109.aClass3_1.method173(arg0, arg1, arg4, local15);
			local28 = local24 & 0x1F;
			local34 = local24 >> 6 & 0x3;
			local36 = arg2;
			if (local15 > 0) {
				local36 = arg3;
			}
			local59 = (103 - arg4) * 4 * 512 + arg1 * 4 + 24624;
			local65 = local15 >> 14 & 0x7FFF;
			@Pc(68) int[] local68 = Static86.aClass2_Sub1_Sub2_Sub4_6.anIntArray170;
			@Pc(72) Class2_Sub1_Sub10 local72 = Static28.method739(local65);
			if (local72.anInt1501 == -1) {
				if (local28 == 0 || local28 == 2) {
					if (local34 == 0) {
						local68[local59] = local36;
						local68[local59 + 512] = local36;
						local68[local59 + 1024] = local36;
						local68[local59 + 1536] = local36;
					} else if (local34 == 1) {
						local68[local59] = local36;
						local68[local59 + 1] = local36;
						local68[local59 + 2] = local36;
						local68[local59 + 3] = local36;
					} else if (local34 == 2) {
						local68[local59 + 3] = local36;
						local68[local59 + 512 + 3] = local36;
						local68[local59 + 1024 + 3] = local36;
						local68[local59 + 1539] = local36;
					} else if (local34 == 3) {
						local68[local59 + 1536] = local36;
						local68[local59 + 1 + 1536] = local36;
						local68[local59 + 1536 + 2] = local36;
						local68[local59 + 3 + 1536] = local36;
					}
				}
				if (local28 == 3) {
					if (local34 == 0) {
						local68[local59] = local36;
					} else if (local34 == 1) {
						local68[local59 + 3] = local36;
					} else if (local34 == 2) {
						local68[local59 + 3 + 1536] = local36;
					} else if (local34 == 3) {
						local68[local59 + 1536] = local36;
					}
				}
				if (local28 == 2) {
					if (local34 == 3) {
						local68[local59] = local36;
						local68[local59 + 512] = local36;
						local68[local59 + 1024] = local36;
						local68[local59 + 1536] = local36;
					} else if (local34 == 0) {
						local68[local59] = local36;
						local68[local59 + 1] = local36;
						local68[local59 + 2] = local36;
						local68[local59 + 3] = local36;
					} else if (local34 == 1) {
						local68[local59 + 3] = local36;
						local68[local59 + 512 + 3] = local36;
						local68[local59 + 1027] = local36;
						local68[local59 + 1536 + 3] = local36;
					} else if (local34 == 2) {
						local68[local59 + 1536] = local36;
						local68[local59 + 1537] = local36;
						local68[local59 + 1538] = local36;
						local68[local59 + 1536 + 3] = local36;
					}
				}
			} else {
				@Pc(81) Class2_Sub1_Sub2_Sub2 local81 = Static25.aClass2_Sub1_Sub2_Sub2Array5[local72.anInt1501];
				if (local81 != null) {
					@Pc(94) int local94 = (local72.anInt1481 * 4 - local81.anInt954) / 2;
					@Pc(105) int local105 = (local72.anInt1491 * 4 - local81.anInt957) / 2;
					local81.method637(arg1 * 4 + local94 + 48, local105 + (48 - -((-arg4 + 104 - local72.anInt1491) * 4)));
				}
			}
		}
		local15 = Static109.aClass3_1.method142(arg0, arg1, arg4);
		if (local15 != 0) {
			local24 = Static109.aClass3_1.method173(arg0, arg1, arg4, local15);
			local36 = local15 >> 14 & 0x7FFF;
			local34 = local24 >> 6 & 0x3;
			@Pc(463) Class2_Sub1_Sub10 local463 = Static28.method739(local36);
			local28 = local24 & 0x1F;
			@Pc(489) int local489;
			if (local463.anInt1501 != -1) {
				@Pc(476) Class2_Sub1_Sub2_Sub2 local476 = Static25.aClass2_Sub1_Sub2_Sub2Array5[local463.anInt1501];
				if (local476 != null) {
					local489 = (local463.anInt1491 * 4 - local476.anInt957) / 2;
					local65 = (local463.anInt1481 * 4 - local476.anInt954) / 2;
					local476.method637(local65 + arg1 * 4 + 48, 48 - (-((-arg4 + 104 + -local463.anInt1491) * 4) + -local489));
				}
			} else if (local28 == 9) {
				@Pc(535) int[] local535 = Static86.aClass2_Sub1_Sub2_Sub4_6.anIntArray170;
				local59 = 15658734;
				if (local15 > 0) {
					local59 = 15597568;
				}
				local489 = (52736 - arg4 * 512) * 4 + arg1 * 4 + 24624;
				if (local34 == 0 || local34 == 2) {
					local535[local489 + 1536] = local59;
					local535[local489 + 1024 + 1] = local59;
					local535[local489 + 514] = local59;
					local535[local489 + 3] = local59;
				} else {
					local535[local489] = local59;
					local535[local489 + 513] = local59;
					local535[local489 + 1024 + 2] = local59;
					local535[local489 + 1536 + 3] = local59;
				}
			}
		}
		local15 = Static109.aClass3_1.method125(arg0, arg1, arg4);
		if (local15 == 0) {
			return;
		}
		local24 = local15 >> 14 & 0x7FFF;
		@Pc(644) Class2_Sub1_Sub10 local644 = Static28.method739(local24);
		if (local644.anInt1501 == -1) {
			return;
		}
		@Pc(654) Class2_Sub1_Sub2_Sub2 local654 = Static25.aClass2_Sub1_Sub2_Sub2Array5[local644.anInt1501];
		if (local654 != null) {
			local36 = (local644.anInt1481 * 4 - local654.anInt954) / 2;
			@Pc(678) int local678 = (local644.anInt1491 * 4 - local654.anInt957) / 2;
			local654.method637(arg1 * 4 + local36 + 48, local678 + (104 - (arg4 - -local644.anInt1491)) * 4 + 48);
			return;
		}
	}

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "(I)V")
	public static void method1782() {
		Static13.aClass11_6.method435();
		Static88.aClass11_22.method435();
		Static112.aClass11_27.method435();
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(Z)V")
	public static void method1785() {
		Static13.aClass2_Sub3_Sub1_1.method843();
		@Pc(11) int local11 = Static13.aClass2_Sub3_Sub1_1.method838(1);
		if (local11 == 0) {
			return;
		}
		@Pc(22) int local22 = Static13.aClass2_Sub3_Sub1_1.method838(2);
		if (local22 == 0) {
			Static45.anIntArray156[anInt2767++] = 2047;
			return;
		}
		@Pc(43) int local43;
		@Pc(53) int local53;
		if (local22 == 1) {
			local43 = Static13.aClass2_Sub3_Sub1_1.method838(3);
			Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.method1781(local43, false);
			local53 = Static13.aClass2_Sub3_Sub1_1.method838(1);
			if (local53 == 1) {
				Static45.anIntArray156[anInt2767++] = 2047;
			}
			return;
		}
		@Pc(95) int local95;
		if (local22 == 2) {
			local43 = Static13.aClass2_Sub3_Sub1_1.method838(3);
			Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.method1781(local43, true);
			local53 = Static13.aClass2_Sub3_Sub1_1.method838(3);
			Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.method1781(local53, true);
			local95 = Static13.aClass2_Sub3_Sub1_1.method838(1);
			if (local95 == 1) {
				Static45.anIntArray156[anInt2767++] = 2047;
			}
		} else if (local22 == 3) {
			local43 = Static13.aClass2_Sub3_Sub1_1.method838(1);
			Static2.anInt287 = Static13.aClass2_Sub3_Sub1_1.method838(2);
			local53 = Static13.aClass2_Sub3_Sub1_1.method838(1);
			if (local53 == 1) {
				Static45.anIntArray156[anInt2767++] = 2047;
			}
			local95 = Static13.aClass2_Sub3_Sub1_1.method838(7);
			@Pc(148) int local148 = Static13.aClass2_Sub3_Sub1_1.method838(7);
			Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.method1786(local148, local43 == 1, local95);
		}
	}

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "(I)V")
	public static void method1787() {
		aClass1_2870 = null;
		aClass8_Sub1_24 = null;
		aClass1_2864 = null;
		aClass1_2868 = null;
		aClass1_2867 = null;
		aClass1_2865 = null;
		aClass1Array29 = null;
		aClass2_Sub1_Sub1_Sub1_Sub1Array3 = null;
		aClass8_29 = null;
		aClass1_2869 = null;
		aClass8_28 = null;
		aClass34_6 = null;
		anIntArray342 = null;
		aClass1_2866 = null;
		anIntArray345 = null;
		aBigInteger4 = null;
		aClass1_2871 = null;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(IIIIII)V")
	public static void method1788(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static85.anInt2263 == arg2 && arg1 == Static27.anInt1032 && (arg4 == Static50.anInt1644 || !Static77.aBoolean113)) {
			return;
		}
		Static50.anInt1644 = arg4;
		Static85.anInt2263 = arg2;
		if (!Static77.aBoolean113) {
			Static50.anInt1644 = 0;
		}
		Static27.anInt1032 = arg1;
		Static29.method759(25);
		Static85.method1537(Static112.aClass1_2901, false, null);
		@Pc(45) int local45 = Static47.anInt1563;
		@Pc(47) int local47 = Static25.anInt1022;
		Static25.anInt1022 = (arg2 - 6) * 8;
		@Pc(58) int local58 = Static25.anInt1022 - local47;
		Static47.anInt1563 = (arg1 - 6) * 8;
		@Pc(81) int local81 = Static47.anInt1563 - local45;
		for (@Pc(85) int local85 = 0; local85 < 32768; local85++) {
			@Pc(91) Class2_Sub1_Sub1_Sub1_Sub2 local91 = Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local85];
			if (local91 != null) {
				for (@Pc(95) int local95 = 0; local95 < 10; local95++) {
					local91.anIntArray341[local95] -= local58;
					local91.anIntArray343[local95] -= local81;
				}
				local91.anInt2724 -= local58 * 128;
				local91.anInt2717 -= local81 * 128;
			}
		}
		for (@Pc(141) int local141 = 0; local141 < 2048; local141++) {
			@Pc(147) Class2_Sub1_Sub1_Sub1_Sub1 local147 = aClass2_Sub1_Sub1_Sub1_Sub1Array3[local141];
			if (local147 != null) {
				for (@Pc(151) int local151 = 0; local151 < 10; local151++) {
					local147.anIntArray341[local151] -= local58;
					local147.anIntArray343[local151] -= local81;
				}
				local147.anInt2717 -= local81 * 128;
				local147.anInt2724 -= local58 * 128;
			}
		}
		Static2.anInt287 = arg4;
		@Pc(199) byte local199 = 0;
		Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.method1786(arg3, false, arg0);
		@Pc(207) byte local207 = 104;
		@Pc(209) byte local209 = 1;
		if (local58 < 0) {
			local207 = -1;
			local199 = 103;
			local209 = -1;
		}
		@Pc(222) byte local222 = 104;
		@Pc(224) byte local224 = 0;
		@Pc(226) byte local226 = 1;
		if (local81 < 0) {
			local224 = 103;
			local222 = -1;
			local226 = -1;
		}
		for (@Pc(239) int local239 = local199; local239 != local207; local239 += local209) {
			for (@Pc(243) int local243 = local224; local243 != local222; local243 += local226) {
				@Pc(249) int local249 = local58 + local239;
				@Pc(253) int local253 = local81 + local243;
				for (@Pc(255) int local255 = 0; local255 < 4; local255++) {
					if (local249 >= 0 && local253 >= 0 && local249 < 104 && local253 < 104) {
						Static15.aClass46ArrayArrayArray1[local255][local239][local243] = Static15.aClass46ArrayArrayArray1[local255][local249][local253];
					} else {
						Static15.aClass46ArrayArrayArray1[local255][local239][local243] = null;
					}
				}
			}
		}
		for (@Pc(327) Class2_Sub5 local327 = (Class2_Sub5) Static76.aClass46_7.method1435(); local327 != null; local327 = (Class2_Sub5) Static76.aClass46_7.method1442()) {
			local327.anInt913 -= local81;
			local327.anInt914 -= local58;
			if (local327.anInt914 < 0 || local327.anInt913 < 0 || local327.anInt914 >= 104 || local327.anInt913 >= 104) {
				local327.method1820();
			}
		}
		Static7.anInt1201 = -1;
		if (Static30.anInt1133 != 0) {
			Static30.anInt1133 -= local58;
			Static90.anInt2337 -= local81;
		}
		Static68.aBoolean105 = false;
		Static31.anInt1216 = 0;
		Static93.aClass46_10.method1439();
		Static72.aClass46_6.method1439();
	}
}
