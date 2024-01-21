import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!na", name = "kc", descriptor = "[Lclient!r;")
	public static Class5_Sub2_Sub6_Sub3[] aClass5_Sub2_Sub6_Sub3Array5;

	@OriginalMember(owner = "client!na", name = "D", descriptor = "Lclient!mb;")
	public static Class45 aClass45_887 = Static63.method1251("Stufe)2");

	@OriginalMember(owner = "client!na", name = "Sb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_888 = Static63.method1251("Freunde)2Server)3)3)3");

	@OriginalMember(owner = "client!na", name = "Tb", descriptor = "Z")
	public static boolean aBoolean99 = false;

	@OriginalMember(owner = "client!na", name = "hc", descriptor = "Lclient!mb;")
	private static Class45 aClass45_892 = Static63.method1251("Login");

	@OriginalMember(owner = "client!na", name = "Vb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_889 = aClass45_892;

	@OriginalMember(owner = "client!na", name = "Wb", descriptor = "[S")
	public static short[] aShortArray9 = new short[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 };

	@OriginalMember(owner = "client!na", name = "dc", descriptor = "Lclient!mb;")
	private static Class45 aClass45_891 = Static63.method1251("Enter name:");

	@OriginalMember(owner = "client!na", name = "bc", descriptor = "Lclient!mb;")
	public static Class45 aClass45_890 = aClass45_891;

	@OriginalMember(owner = "client!na", name = "gc", descriptor = "I")
	public static int anInt2162 = -1;

	@OriginalMember(owner = "client!na", name = "mc", descriptor = "Lclient!sa;")
	public static Class67 aClass67_17 = new Class67(20);

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(III)Z")
	public static boolean method1457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class5_Sub2_Sub7 local7 = Static62.method1232(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local7.method608(arg0);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIII)V")
	public static void method1461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static37.anInt1080 == 0 || arg2 == 0 || Static101.anInt1025 >= 50) {
			return;
		}
		Static38.anIntArray177[Static101.anInt1025] = arg1;
		Static40.anIntArray182[Static101.anInt1025] = arg2;
		Static30.anIntArray68[Static101.anInt1025] = arg0;
		Static93.aClass8Array1[Static101.anInt1025] = null;
		Static1.anIntArray1[Static101.anInt1025] = 0;
		Static101.anInt1025++;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "([Lclient!ia;IBIIIIIII)V")
	public static void method1463(@OriginalArg(0) Class5_Sub2_Sub8[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(17) Class5_Sub2_Sub8 local17 = arg0[local11];
			if (local17 != null && (local17.anInt1269 == 0 || local17.aBoolean70) && local17 != null && arg2 == local17.anInt1301 && !Static60.method1218(local17)) {
				@Pc(49) int local49 = local17.anInt1252 + arg1 - arg4;
				@Pc(57) int local57 = arg5 + local17.anInt1294 - arg8;
				@Pc(68) int local68 = arg1 >= local49 ? arg1 : local49;
				@Pc(73) int local73 = local17.anInt1243 + local57;
				@Pc(78) int local78 = local49 + local17.anInt1260;
				@Pc(85) int local85 = arg5 >= local57 ? arg5 : local57;
				@Pc(96) int local96 = arg7 <= local78 ? arg7 : local78;
				@Pc(107) int local107 = local73 >= arg3 ? arg3 : local73;
				if (local17.anInt1269 == 0) {
					method1463(arg0, local68, local17.anInt1262, local107, local17.anInt1265 + local68 - local49, local85, arg6, local96, local17.anInt1244 + local85 - local57);
					if (local17.aClass5_Sub2_Sub8Array1 != null) {
						method1463(local17.aClass5_Sub2_Sub8Array1, local68, local17.anInt1262, local107, local17.anInt1265 + local68 - local49, local85, arg6, local96, local17.anInt1244 + local85 - local57);
					}
				}
				if (local17.aBoolean70) {
					@Pc(190) boolean local190;
					if (Static14.anInt425 >= local68 && local85 <= Static47.anInt1354 && Static14.anInt425 < local96 && Static47.anInt1354 < local107) {
						local190 = true;
					} else {
						local190 = false;
					}
					@Pc(196) boolean local196 = false;
					if (Static108.anInt2830 == 1 && local190) {
						local196 = true;
					}
					@Pc(205) boolean local205 = false;
					if (Static28.anInt881 == 1 && local68 <= Static67.anInt1906 && Static36.anInt1063 >= local85 && local96 > Static67.anInt1906 && local107 > Static36.anInt1063) {
						local205 = true;
					}
					if (local205 && Static104.aClass5_Sub2_Sub8_5 == null && (arg6 & 0x200) != 0 && !Static2.aBoolean2 && Static79.method1504(local17) != null) {
						Static104.aClass5_Sub2_Sub8_5 = local17;
						Static100.anInt2700 = Static14.anInt425;
						Static67.aBoolean93 = false;
						Static40.anInt1173 = 0;
						Static42.anInt800 = Static47.anInt1354;
					}
					if (Static104.aClass5_Sub2_Sub8_5 != null || Static2.aBoolean2) {
						local205 = false;
						local196 = false;
						local190 = false;
					}
					if (!local17.aBoolean63 && local205 && (arg6 & 0x1) != 0) {
						local17.aBoolean63 = true;
						if (local17.anObjectArray15 != null) {
							Static33.method687(0, null, Static36.anInt1063 - local57, local17.anObjectArray15, Static67.anInt1906 - local49, local17);
						}
					}
					if (local17.aBoolean63 && local196 && (arg6 & 0x4) != 0 && local17.anObjectArray21 != null) {
						Static33.method687(0, null, Static47.anInt1354 - local57, local17.anObjectArray21, Static14.anInt425 - local49, local17);
					}
					if (local17.aBoolean63 && !local196 && (arg6 & 0x2) != 0) {
						local17.aBoolean63 = false;
						if (local17.anObjectArray4 != null) {
							Static33.method687(0, null, Static47.anInt1354 - local57, local17.anObjectArray4, Static14.anInt425 - local49, local17);
						}
					}
					if (local196 && (arg6 & 0x8) != 0 && local17.anObjectArray14 != null) {
						Static33.method687(0, null, Static47.anInt1354 - local57, local17.anObjectArray14, Static14.anInt425 - local49, local17);
					}
					if (!local17.aBoolean67 && local190 && (arg6 & 0x10) != 0) {
						local17.aBoolean67 = true;
						if (local17.anObjectArray17 != null) {
							Static33.method687(0, null, Static47.anInt1354 - local57, local17.anObjectArray17, Static14.anInt425 - local49, local17);
						}
					}
					if (local17.aBoolean67 && local190 && (arg6 & 0x40) != 0 && local17.anObjectArray13 != null) {
						Static33.method687(0, null, Static47.anInt1354 - local57, local17.anObjectArray13, Static14.anInt425 - local49, local17);
					}
					if (local17.aBoolean67 && !local190 && (arg6 & 0x20) != 0) {
						local17.aBoolean67 = false;
						if (local17.anObjectArray5 != null) {
							Static33.method687(0, null, Static47.anInt1354 - local57, local17.anObjectArray5, Static14.anInt425 - local49, local17);
						}
					}
					if (local17.anObjectArray12 != null && (arg6 & 0x80) != 0) {
						Static33.method687(0, null, 0, local17.anObjectArray12, 0, local17);
					}
					if (local190 && Static28.anInt882 != 0 && local17.anObjectArray16 != null && (arg6 & 0x400) != 0) {
						Static33.method687(0, null, Static28.anInt882, local17.anObjectArray16, 0, local17);
					}
					if ((arg6 & 0x100) != 0) {
						if (Static108.anInt2827 > local17.anInt1250 && local17.anObjectArray9 != null) {
							Static33.method687(0, null, 0, local17.anObjectArray9, 0, local17);
						}
						if (local17.anInt1250 < Static77.anInt2197 && local17.anObjectArray8 != null) {
							Static33.method687(0, null, 0, local17.anObjectArray8, 0, local17);
						}
						if (Static59.anInt1767 > local17.anInt1250 && local17.anObjectArray6 != null) {
							Static33.method687(0, null, 0, local17.anObjectArray6, 0, local17);
						}
						local17.anInt1250 = Static3.anInt94;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "k", descriptor = "(B)V")
	public static void method1465() {
		aClass45_891 = null;
		aClass45_888 = null;
		aClass45_892 = null;
		aClass45_889 = null;
		aClass45_890 = null;
		aShortArray9 = null;
		aClass45_887 = null;
		aClass67_17 = null;
		aClass5_Sub2_Sub6_Sub3Array5 = null;
	}
}
