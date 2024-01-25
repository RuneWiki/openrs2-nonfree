import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!qh", name = "C", descriptor = "J")
	public static long aLong43 = 0L;

	@OriginalMember(owner = "client!qh", name = "E", descriptor = "I")
	public static final int anInt1056 = 1;

	@OriginalMember(owner = "client!qh", name = "F", descriptor = "I")
	public static int anInt1057 = 0;

	@OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
	public static int anInt1058 = 0;

	@OriginalMember(owner = "client!qh", name = "I", descriptor = "I")
	public static int anInt1060 = 1;

	@OriginalMember(owner = "client!qh", name = "K", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_43 = new Class217(89, 2);

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)V")
	public static void method1017() {
		Static266.method4815(false);
		Static210.anInt4182 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static349.aByteArrayArray18.length; local14++) {
			if (Static200.anIntArray311[local14] != -1 && Static349.aByteArrayArray18[local14] == null) {
				Static349.aByteArrayArray18[local14] = Static166.aClass30_53.method1161(0, Static200.anIntArray311[local14]);
				if (Static349.aByteArrayArray18[local14] == null) {
					local12 = false;
					Static210.anInt4182++;
				}
			}
			if (Static290.anIntArray446[local14] != -1 && Static355.aByteArrayArray19[local14] == null) {
				Static355.aByteArrayArray19[local14] = Static166.aClass30_53.method1151(Static290.anIntArray446[local14], 0, Static232.anIntArrayArray47[local14]);
				if (Static355.aByteArrayArray19[local14] == null) {
					local12 = false;
					Static210.anInt4182++;
				}
			}
			if (Static180.anIntArray280[local14] != -1 && Static258.aByteArrayArray4[local14] == null) {
				Static258.aByteArrayArray4[local14] = Static166.aClass30_53.method1161(0, Static180.anIntArray280[local14]);
				if (Static258.aByteArrayArray4[local14] == null) {
					Static210.anInt4182++;
					local12 = false;
				}
			}
			if (Static112.anIntArray187[local14] != -1 && Static359.aByteArrayArray20[local14] == null) {
				Static359.aByteArrayArray20[local14] = Static166.aClass30_53.method1161(0, Static112.anIntArray187[local14]);
				if (Static359.aByteArrayArray20[local14] == null) {
					local12 = false;
					Static210.anInt4182++;
				}
			}
			if (Static3.anIntArray7 != null && Static42.aByteArrayArray2[local14] == null && Static3.anIntArray7[local14] != -1) {
				Static42.aByteArrayArray2[local14] = Static166.aClass30_53.method1151(Static3.anIntArray7[local14], 0, Static232.anIntArrayArray47[local14]);
				if (Static42.aByteArrayArray2[local14] == null) {
					Static210.anInt4182++;
					local12 = false;
				}
			}
		}
		if (Static134.aClass86_1 == null) {
			if (Static266.aClass1_Sub4_Sub15_3 == null || !Static310.aClass30_88.method1181(Static266.aClass1_Sub4_Sub15_3.aString23 + "_staticelements")) {
				Static134.aClass86_1 = new Class86(0);
			} else if (Static310.aClass30_88.method1182(Static266.aClass1_Sub4_Sub15_3.aString23 + "_staticelements")) {
				Static134.aClass86_1 = Static96.method2063(Static310.aClass30_88, Static204.aBoolean304, Static266.aClass1_Sub4_Sub15_3.aString23 + "_staticelements");
			} else {
				Static210.anInt4182++;
				local12 = false;
			}
		}
		if (!local12) {
			Static295.anInt5680 = 1;
			return;
		}
		local12 = true;
		Static314.anInt6028 = 0;
		@Pc(272) int local272;
		@Pc(283) int local283;
		for (@Pc(253) int local253 = 0; local253 < Static349.aByteArrayArray18.length; local253++) {
			@Pc(259) byte[] local259 = Static355.aByteArrayArray19[local253];
			if (local259 != null) {
				local272 = (Static37.anIntArray60[local253] >> 8) * 64 - Static50.anInt1271;
				local283 = (Static37.anIntArray60[local253] & 0xFF) * 64 - Static299.anInt4036;
				if (Static51.aBoolean88) {
					local283 = 10;
					local272 = 10;
				}
				local12 &= Static310.method5372(local283, local272, local259);
			}
			local259 = Static359.aByteArrayArray20[local253];
			if (local259 != null) {
				local272 = (Static37.anIntArray60[local253] >> 8) * 64 - Static50.anInt1271;
				local283 = (Static37.anIntArray60[local253] & 0xFF) * 64 - Static299.anInt4036;
				if (Static51.aBoolean88) {
					local272 = 10;
					local283 = 10;
				}
				local12 &= Static310.method5372(local283, local272, local259);
			}
		}
		if (!local12) {
			Static295.anInt5680 = 2;
			return;
		}
		if (Static295.anInt5680 != 0) {
			Static291.method5127(true, Static313.aClass106_210.method2927(Static254.anInt5172) + "<br>(100%)", Static24.aClass33_1);
		}
		Static82.method1769();
		Static96.method2069();
		@Pc(378) boolean local378 = false;
		if (Static9.aClass63_1.method4558() && Static24.aBoolean34) {
			for (local272 = 0; local272 < Static349.aByteArrayArray18.length; local272++) {
				if (Static359.aByteArrayArray20[local272] != null || Static258.aByteArrayArray4[local272] != null) {
					local378 = true;
					break;
				}
			}
		}
		if (Static291.aBoolean430) {
			local272 = Static320.anIntArray351[Static326.anInt6155];
		} else {
			local272 = Static133.anIntArray217[Static326.anInt6155];
		}
		if (Static9.aClass63_1.method4656()) {
			local272++;
		}
		Static245.method4674(Static311.anInt5653, Static189.anInt3820, local272, local378, Static9.aClass63_1.method4592() > 0);
		for (local283 = 0; local283 < 4; local283++) {
			Static11.aClass196Array2[local283].method5327();
		}
		Static79.method1689();
		Static344.method4469(false);
		Static102.method6043();
		Static82.method1769();
		System.gc();
		Static266.method4815(true);
		Static276.method4919(4, false);
		@Pc(474) int[][] local474 = null;
		if (!Static51.aBoolean88) {
			Static166.method3124(false);
			Static232.method4302(Static189.anInt3820 >> 4, Static311.anInt5653 >> 4);
			Static343.method5735();
			Static128.method5290(false, Static9.aClass63_1, 4, null);
			local474 = Static102.anIntArrayArrayArray134[0];
			Static266.method4815(true);
			Static171.method3209(false);
			if (Static42.aByteArrayArray2 != null) {
				Static326.method5530();
			}
		}
		if (Static51.aBoolean88) {
			Static128.method5292(false);
			Static232.method4302(Static189.anInt3820 >> 4, Static311.anInt5653 >> 4);
			Static343.method5735();
			Static128.method5290(false, Static9.aClass63_1, 4, null);
			local474 = Static102.anIntArrayArrayArray134[0];
			Static266.method4815(true);
			Static264.method4803(false);
		}
		Static96.method2069();
		Static266.method4815(true);
		Static48.method2774(Static9.aClass63_1, 4, null, false, Static11.aClass196Array2);
		Static45.method1098(4, Static9.aClass63_1);
		Static266.method4815(true);
		@Pc(561) int local561 = Static365.anInt7016;
		if (Static284.anInt6477 < local561) {
			local561 = Static284.anInt6477;
		}
		if (local561 < Static284.anInt6477 - 1) {
			local561 = Static284.anInt6477 - 1;
		}
		if (Static150.method4956()) {
			Static318.method5489(0);
		} else {
			Static318.method5489(local561);
		}
		Static319.method5493();
		if (local378) {
			Static263.method4798(true);
			Static276.method4919(1, true);
			if (!Static51.aBoolean88) {
				Static166.method3124(true);
				Static128.method5290(true, Static9.aClass63_1, 1, local474);
				Static266.method4815(true);
				Static171.method3209(true);
				Static45.method1098(1, Static9.aClass63_1);
			}
			if (Static51.aBoolean88) {
				Static128.method5292(true);
				Static128.method5290(true, Static9.aClass63_1, 1, local474);
				Static266.method4815(true);
				Static264.method4803(true);
			}
			Static96.method2069();
			Static266.method4815(true);
			Static48.method2774(Static9.aClass63_1, 1, Static50.aClass36Array3[0], true, Static11.aClass196Array2);
			Static45.method1098(1, Static9.aClass63_1);
			Static266.method4815(true);
			Static319.method5493();
			Static263.method4798(false);
		}
		@Pc(663) int local663;
		@Pc(667) int local667;
		for (@Pc(659) int local659 = 0; local659 < 4; local659++) {
			for (local663 = 0; local663 < Static311.anInt5653; local663++) {
				for (local667 = 0; local667 < Static189.anInt3820; local667++) {
					Static287.method5073(local663, local667, local659);
				}
			}
		}
		Static113.method2410();
		Static82.method1769();
		Static359.method5946();
		Static96.method2069();
		Static31.aBoolean54 = false;
		Static355.method5866();
		if (Static39.aFrame2 != null && Static165.aClass76_2 != null && Static13.anInt334 == 25) {
			Static280.method5009(Static232.aClass18_158);
			Static339.aClass1_Sub7_Sub2_4.method2115(1057001181);
		}
		if (!Static51.aBoolean88) {
			local663 = (Static171.anInt3574 - (Static311.anInt5653 >> 4)) / 8;
			local667 = (Static171.anInt3574 + (Static311.anInt5653 >> 4)) / 8;
			@Pc(750) int local750 = (Static145.anInt3091 - (Static189.anInt3820 >> 4)) / 8;
			@Pc(759) int local759 = (Static145.anInt3091 + (Static189.anInt3820 >> 4)) / 8;
			for (@Pc(763) int local763 = local663 - 1; local763 <= local667 + 1; local763++) {
				for (@Pc(769) int local769 = local750 - 1; local769 <= local759 + 1; local769++) {
					if (local763 < local663 || local667 < local763 || local750 > local769 || local759 < local769) {
						Static166.aClass30_53.method1159("m" + local763 + "_" + local769);
						Static166.aClass30_53.method1159("l" + local763 + "_" + local769);
					}
				}
			}
		}
		if (Static13.anInt334 == 28) {
			Static44.method1064(10);
		} else {
			Static44.method1064(30);
			if (Static165.aClass76_2 != null) {
				Static280.method5009(Static48.aClass18_98);
			}
		}
		Static198.method3718();
		Static82.method1769();
		Static160.method3013();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)V")
	public static void method1019(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static87.anIntArray147[arg0] = arg1;
		@Pc(19) Class1_Sub14 local19 = (Class1_Sub14) Static228.aClass38_25.method1475((long) arg0);
		if (local19 == null) {
			local19 = new Class1_Sub14(Static183.method3462() + 500L);
			Static228.aClass38_25.method1472(local19, (long) arg0);
		} else {
			local19.aLong54 = Static183.method3462() + 500L;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!ct;I)I")
	public static int method1020(@OriginalArg(0) Class30 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method1154(Static109.anInt2443)) {
			local5++;
		}
		if (arg0.method1154(Static287.anInt5569)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IC)Z")
	public static boolean method1021(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static330.method5560(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static197.aCharArray27;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(33) char local33 = local18[local20];
				if (arg0 == local33) {
					return true;
				}
			}
			@Pc(45) char[] local45 = Static301.aCharArray40;
			for (@Pc(47) int local47 = 0; local47 < local45.length; local47++) {
				@Pc(53) char local53 = local45[local47];
				if (local53 == arg0) {
					return true;
				}
			}
			return false;
		}
	}
}
