import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
	public static int anInt1159;

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "[Lclient!bi;")
	public static Class4_Sub2_Sub1[] aClass4_Sub2_Sub1Array5;

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "[[Lclient!ia;")
	public static Class64[][] aClass64ArrayArray1;

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "[I")
	public static int[] anIntArray133;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "[I")
	public static int[] anIntArray131 = new int[8];

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "[I")
	public static int[] anIntArray132 = new int[32];

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString31 = "wave:";

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	public static void method951() {
		anIntArray132 = null;
		aString31 = null;
		anIntArray131 = null;
		aClass64ArrayArray1 = null;
		aClass4_Sub2_Sub1Array5 = null;
		anIntArray133 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V")
	public static void method952(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = Static41.anInt856;
		if (arg0 == 0) {
			local7 = 1;
		}
		@Pc(20) int local20;
		@Pc(27) Class12_Sub3_Sub2 local27;
		@Pc(92) int local92;
		@Pc(194) int local194;
		@Pc(201) int local201;
		@Pc(226) int local226;
		@Pc(231) int local231;
		@Pc(117) int local117;
		for (local20 = 0; local20 < local7; local20++) {
			if (arg0 == 0) {
				local27 = Static239.aClass12_Sub3_Sub2_2;
			} else {
				local27 = Static257.aClass12_Sub3_Sub2Array1[Static85.anIntArray179[local20]];
			}
			if (local27 != null && local27.method3374()) {
				@Pc(47) int local47 = local27.method3375();
				if (arg0 == 0 || local47 == arg0) {
					@Pc(87) int local87;
					if (local47 == 1) {
						if ((local27.anInt4141 & 0x7F) == 64 && (local27.anInt4113 & 0x7F) == 64) {
							local87 = local27.anInt4141 >> 7;
							local92 = local27.anInt4113 >> 7;
							if (local87 >= 0 && local87 < 104 && local92 >= 0 && local92 < 104) {
								local117 = Static267.anIntArrayArray28[local87][local92]++;
							}
						}
					} else if (((local47 & 0x1) != 0 || (local27.anInt4141 & 0x7F) == 0 && (local27.anInt4113 & 0x7F) == 0) && ((local47 & 0x1) != 1 || (local27.anInt4141 & 0x7F) == 64 && (local27.anInt4113 & 0x7F) == 64)) {
						local87 = local27.anInt4141 - local47 * 64 >> 7;
						local92 = local27.anInt4113 - local47 * 64 >> 7;
						local194 = local87 + local27.method3375();
						local201 = local92 + local27.method3375();
						if (local194 > 104) {
							local194 = 104;
						}
						if (local92 < 0) {
							local92 = 0;
						}
						if (local87 < 0) {
							local87 = 0;
						}
						if (local201 > 104) {
							local201 = 104;
						}
						for (local226 = local87; local226 < local194; local226++) {
							for (local231 = local92; local231 < local201; local231++) {
								local117 = Static267.anIntArrayArray28[local226][local231]++;
							}
						}
					}
				}
			}
		}
		label223: for (local20 = 0; local20 < local7; local20++) {
			@Pc(270) long local270;
			if (arg0 == 0) {
				local270 = 8791798054912L;
				local27 = Static239.aClass12_Sub3_Sub2_2;
			} else {
				local270 = (long) Static85.anIntArray179[local20] << 32;
				local27 = Static257.aClass12_Sub3_Sub2Array1[Static85.anIntArray179[local20]];
			}
			if (local27 != null && local27.method3374()) {
				local92 = local27.method3375();
				if (arg0 == 0 || local92 == arg0) {
					local27.aBoolean275 = true;
					local27.aBoolean280 = false;
					if ((Static182.aBoolean234 && Static41.anInt856 > 200 || Static41.anInt856 > 50) && arg0 != 0 && local27.anInt4127 == local27.method3361().anInt2564) {
						local27.aBoolean280 = true;
					}
					if (local92 == 1) {
						if ((local27.anInt4141 & 0x7F) == 64 && (local27.anInt4113 & 0x7F) == 64) {
							local201 = local27.anInt4113 >> 7;
							local194 = local27.anInt4141 >> 7;
							if (local194 < 0 || local194 >= 104 || local201 < 0 || local201 >= 104) {
								continue;
							}
							if (Static267.anIntArrayArray28[local194][local201] > 1) {
								local117 = Static267.anIntArrayArray28[local194][local201]--;
								continue;
							}
						}
					} else if ((local92 & 0x1) == 0 && (local27.anInt4141 & 0x7F) == 0 && (local27.anInt4113 & 0x7F) == 0 || (local92 & 0x1) == 1 && (local27.anInt4141 & 0x7F) == 64 && (local27.anInt4113 & 0x7F) == 0) {
						local194 = local27.anInt4141 - local92 * 64 >> 7;
						local201 = local27.anInt4113 - local92 * 64 >> 7;
						local226 = local92 + local194;
						if (local194 < 0) {
							local194 = 0;
						}
						if (local226 > 104) {
							local226 = 104;
						}
						local231 = local92 + local201;
						if (local231 > 104) {
							local231 = 104;
						}
						@Pc(497) boolean local497 = true;
						if (local201 < 0) {
							local201 = 0;
						}
						@Pc(505) int local505;
						@Pc(514) int local514;
						for (local505 = local194; local505 < local226; local505++) {
							for (local514 = local201; local514 < local231; local514++) {
								if (Static267.anIntArrayArray28[local505][local514] <= 1) {
									local497 = false;
									break;
								}
							}
						}
						if (local497) {
							local505 = local194;
							while (true) {
								if (local226 <= local505) {
									continue label223;
								}
								for (local514 = local201; local514 < local231; local514++) {
									local117 = Static267.anIntArrayArray28[local505][local514]--;
								}
								local505++;
							}
						}
					}
					if (local27.anObject6 == null || local27.anInt4131 > Static104.anInt2226 || local27.anInt4177 <= Static104.anInt2226) {
						local27.aBoolean275 = false;
						local27.anInt4135 = Static96.method1559(Static210.anInt4103, local27.anInt4113, local27.anInt4141);
						Static258.method3892(Static210.anInt4103, local27.anInt4141, local27.anInt4113, local27.anInt4135, local92 * 64 + 60 - 64, local27, local27.anInt4121, local270, local27.aBoolean277);
					} else {
						local27.aBoolean275 = false;
						local27.aBoolean280 = false;
						local27.anInt4135 = Static96.method1559(Static210.anInt4103, local27.anInt4113, local27.anInt4141);
						Static179.method2818(Static210.anInt4103, local27.anInt4141, local27.anInt4113, local27.anInt4135, local27, local27.anInt4121, local270, local27.anInt4190, local27.anInt4139, local27.anInt4192, local27.anInt4174);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)Z")
	public static boolean method953(@OriginalArg(1) int arg0) {
		@Pc(7) Class53_Sub1 local7 = Static155.method2476(arg0);
		if (local7 == null) {
			return false;
		} else if (Static260.anInt4951 == 1 || Static260.anInt4951 == 2 || Static251.anInt4743 == 2) {
			Static28.aString8 = local7.aString49;
			Static211.anInt4204 = local7.anInt1775;
			if (Static251.anInt4743 != 0) {
				Static101.anInt4750 = Static211.anInt4204 + 50000;
				Static275.anInt5134 = Static211.anInt4204 + 40000;
				Static187.anInt3757 = Static275.anInt5134;
			}
			return true;
		} else {
			@Pc(55) String local55 = "";
			@Pc(57) String local57 = "";
			if (Static251.anInt4743 != 0) {
				local55 = ":" + (local7.anInt1775 + 7000);
			}
			if (Static90.aString56 != null) {
				local57 = "/p=" + Static90.aString56;
			}
			@Pc(132) String local132 = "http://" + local7.aString49 + local55 + "/l=" + Static139.anInt2870 + "/a=" + Static168.anInt3340 + local57 + "/j" + (Static287.aBoolean169 ? "1" : "0") + ",o" + (Static175.aBoolean213 ? "1" : "0") + ",a2,m" + (Static148.aBoolean198 ? "1" : "0");
			try {
				Static114.aClient1.getAppletContext().showDocument(new URL(local132), "_self");
				return true;
			} catch (@Pc(142) Exception local142) {
				return false;
			}
		}
	}
}
