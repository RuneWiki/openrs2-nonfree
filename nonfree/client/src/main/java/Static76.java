import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!pe", name = "Ub", descriptor = "[I")
	public static int[] anIntArray214;

	@OriginalMember(owner = "client!pe", name = "Pb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_888 = Static34.method846("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!pe", name = "hc", descriptor = "Lclient!rc;")
	private static Class55 aClass55_890 = Static34.method846("Enter object name");

	@OriginalMember(owner = "client!pe", name = "Rb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_889 = aClass55_890;

	@OriginalMember(owner = "client!pe", name = "Vb", descriptor = "I")
	public static int anInt2217 = -1;

	@OriginalMember(owner = "client!pe", name = "bc", descriptor = "[Lclient!rc;")
	public static Class55[] aClass55Array20 = new Class55[500];

	@OriginalMember(owner = "client!pe", name = "cc", descriptor = "I")
	public static int anInt2223 = 0;

	@OriginalMember(owner = "client!pe", name = "ic", descriptor = "Lclient!rc;")
	public static Class55 aClass55_891 = Static34.method846("Chat panel redrawn");

	@OriginalMember(owner = "client!pe", name = "jc", descriptor = "Lclient!rc;")
	public static Class55 aClass55_892 = Static34.method846("blaugr-Un:");

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "(II)V")
	public static void method1516(@OriginalArg(0) int arg0) {
		if (!Static58.method1197()) {
			return;
		}
		if (Static22.aBoolean44) {
			Static102.anInt3020 = arg0;
		} else {
			Static64.method1339(arg0);
		}
	}

	@OriginalMember(owner = "client!pe", name = "u", descriptor = "(I)V")
	public static void method1517() {
		if (Static58.anInt1746 != 0 || Static77.aClass6_Sub2_Sub14_37 != null) {
			return;
		}
		@Pc(16) int local16 = Static85.anInt2400;
		if (Static102.anInt3029 == 1 && Static68.anInt2013 >= 516 && Static23.anInt1030 >= 160 && Static68.anInt2013 <= 765 && Static23.anInt1030 <= 205) {
			local16 = 0;
		}
		@Pc(50) int local50;
		@Pc(48) int local48;
		@Pc(133) int local133;
		if (!Static109.aBoolean163) {
			if (local16 == 1 && Static94.anInt2645 > 0) {
				local50 = Static10.anIntArray43[Static94.anInt2645 - 1];
				if (local50 == 5 || local50 == 32 || local50 == 24 || local50 == 2 || local50 == 29 || local50 == 25 || local50 == 13 || local50 == 10 || local50 == 56 || local50 == 28 || local50 == 23 || local50 == 1003) {
					local48 = Static107.anIntArray290[Static94.anInt2645 - 1];
					local133 = Static77.anIntArray216[Static94.anInt2645 - 1];
					@Pc(318) Class6_Sub2_Sub14 local318 = Static99.method1897(local133);
					if (local318.aBoolean136 || local318.aBoolean142) {
						Static57.anInt1733 = Static68.anInt2013;
						Static11.anInt702 = local133;
						Static75.aBoolean101 = false;
						Static65.anInt1931 = local48;
						Static56.anInt1716 = Static23.anInt1030;
						Static58.anInt1746 = 2;
						if (local133 >> 16 == Static13.anInt800) {
							Static58.anInt1746 = 1;
						}
						Static54.anInt1680 = 0;
						if (local133 >> 16 == Static1.anInt3) {
							Static58.anInt1746 = 3;
						}
						return;
					}
				}
			}
			if (local16 == 1 && (Static1.anInt5 == 1 || Static51.method1096(Static94.anInt2645 - 1)) && Static94.anInt2645 > 2) {
				local16 = 2;
			}
			if (local16 == 1 && Static94.anInt2645 > 0) {
				Static57.method1185(Static94.anInt2645 - 1);
			}
			if (local16 != 2 || Static94.anInt2645 <= 0) {
				return;
			}
			Static9.method352();
			return;
		}
		if (local16 != 1) {
			local48 = Static27.anInt1358;
			local50 = Static58.anInt1741;
			if (Static1.anInt6 == 0) {
				local48 -= 4;
				local50 -= 4;
			}
			if (Static1.anInt6 == 1) {
				local48 -= 205;
				local50 -= 553;
			}
			if (Static1.anInt6 == 2) {
				local50 -= 17;
				local48 -= 357;
			}
			if (local50 < Static39.anInt1694 - 10 || Static39.anInt1694 + Static96.anInt2823 + 10 < local50 || local48 < Static7.anInt281 - 10 || local48 > Static57.anInt1734 + Static7.anInt281 + 10) {
				Static109.aBoolean163 = false;
				if (Static1.anInt6 == 2) {
					Static72.aBoolean99 = true;
				}
				if (Static1.anInt6 == 1) {
					Static63.aBoolean89 = true;
				}
			}
		}
		if (local16 != 1) {
			return;
		}
		local50 = Static39.anInt1694;
		local48 = Static7.anInt281;
		local133 = Static96.anInt2823;
		@Pc(135) int local135 = Static68.anInt2013;
		@Pc(137) int local137 = Static23.anInt1030;
		@Pc(139) int local139 = -1;
		if (Static1.anInt6 == 0) {
			local137 -= 4;
			local135 -= 4;
		}
		if (Static1.anInt6 == 1) {
			local135 -= 553;
			local137 -= 205;
		}
		if (Static1.anInt6 == 2) {
			local137 -= 357;
			local135 -= 17;
		}
		for (@Pc(160) int local160 = 0; local160 < Static94.anInt2645; local160++) {
			@Pc(175) int local175 = (Static94.anInt2645 - local160 - 1) * 15 + local48 + 31;
			if (local50 < local135 && local135 < local133 + local50 && local175 - 13 < local137 && local137 < local175 + 3) {
				local139 = local160;
			}
		}
		if (local139 != -1) {
			Static57.method1185(local139);
		}
		if (Static1.anInt6 == 2) {
			Static72.aBoolean99 = true;
		}
		if (Static1.anInt6 == 1) {
			Static63.aBoolean89 = true;
		}
		Static109.aBoolean163 = false;
		return;
	}

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "(I)V")
	public static void method1518() {
		aClass55_891 = null;
		anIntArray214 = null;
		aClass55_890 = null;
		aClass55_892 = null;
		aClass55_889 = null;
		aClass55_888 = null;
		aClass55Array20 = null;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!jd;)V")
	public static void method1520(@OriginalArg(1) Class6_Sub2_Sub3_Sub1 arg0) {
		arg0.anInt2720 = 0;
		@Pc(12) int local12 = arg0.anInt2742 - Static85.anInt2389;
		if (arg0.anInt2702 == 0) {
			arg0.anInt2727 = 1024;
		}
		if (arg0.anInt2702 == 1) {
			arg0.anInt2727 = 1536;
		}
		if (arg0.anInt2702 == 2) {
			arg0.anInt2727 = 0;
		}
		@Pc(45) int local45 = arg0.anInt2730 * 128 + arg0.anInt2708 * 64;
		@Pc(55) int local55 = arg0.anInt2708 * 64 + arg0.anInt2753 * 128;
		if (arg0.anInt2702 == 3) {
			arg0.anInt2727 = 512;
		}
		arg0.anInt2744 += (local55 - arg0.anInt2744) / local12;
		arg0.anInt2710 += (local45 - arg0.anInt2710) / local12;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZLclient!fb;I)Z")
	public static boolean method1521(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class20 arg1) {
		Static52.anInt1647 = 20;
		try {
			Static57.aClass5_1 = (Class5) Class.forName("Class5_Sub1_Sub1").getDeclaredConstructor().newInstance();
			return true;
		} catch (@Pc(13) Throwable local13) {
			@Pc(22) Interface1 local22 = arg1.method727();
			if (local22 != null) {
				Static57.aClass5_1 = new Class5_Sub1_Sub2(arg1, local22);
				return true;
			} else if (arg0) {
				Static57.aClass5_1 = new Class5_Sub2(arg1);
				return true;
			} else {
				return false;
			}
		}
	}
}
