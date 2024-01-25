import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!in", name = "v", descriptor = "Lclient!us;")
	public static Class248 aClass248_1;

	@OriginalMember(owner = "client!in", name = "w", descriptor = "Lclient!he;")
	public static Class100 aClass100_34;

	@OriginalMember(owner = "client!in", name = "y", descriptor = "Lclient!um;")
	public static Class244 aClass244_15;

	@OriginalMember(owner = "client!in", name = "u", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_49 = new Class267("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!in", name = "x", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_173 = new Class123(25, 3);

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IZI)Z")
	public static boolean method2864(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static209.method2238(arg1, arg0)) {
			return (arg1 & 0xB000) != 0 | Static231.method6542(arg0, arg1) | Static32.method5526(arg0, arg1) ? true : (arg0 & 0x37) == 0 & (Static22.method654(arg0, arg1) | Static14.method386(arg1, arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(III)V")
	public static void method2865(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub2_Sub7 local8 = Static212.method3218(arg1, 7);
		local8.method3088();
		local8.anInt3749 = arg0;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IZLclient!cu;)V")
	public static void method2866(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class3_Sub2_Sub1_Sub1 arg1) {
		if (Static151.anInt3129 >= 400) {
			return;
		}
		@Pc(12) Class48 local12 = arg1.aClass48_1;
		if (local12.anIntArray103 != null) {
			local12 = local12.method1378(Static393.aClass207_1);
			if (local12 == null) {
				return;
			}
		}
		if (!local12.aBoolean128) {
			return;
		}
		@Pc(38) String local38 = local12.aString11;
		if (local12.anInt1756 != 0) {
			@Pc(57) String local57 = Static4.aClass36_5 == Static24.aClass36_2 ? Static437.aClass267_106.method6581(Static161.anInt3239) : Static121.aClass267_38.method6581(Static161.anInt3239);
			local38 = local38 + Static41.method959(Static302.aClass3_Sub2_Sub1_Sub2_2.anInt6631, local12.anInt1756) + " (" + local57 + local12.anInt1756 + ")";
		}
		if (!Static174.aBoolean224) {
			if (!arg0) {
				@Pc(87) String[] local87 = local12.aStringArray8;
				if (Static62.aBoolean125) {
					local87 = Static155.method2630(local87);
				}
				@Pc(97) int local97;
				if (local87 != null) {
					for (local97 = 4; local97 >= 0; local97--) {
						if (local87[local97] != null && (Static4.aClass36_5 != Static87.aClass36_3 || !local87[local97].equalsIgnoreCase(Static119.aClass267_93.method6581(Static161.anInt3239)))) {
							@Pc(117) byte local117 = 0;
							@Pc(119) int local119 = Static256.anInt4669;
							if (local97 == 0) {
								local117 = 4;
							}
							if (local97 == 1) {
								local117 = 59;
							}
							if (local97 == 2) {
								local117 = 30;
							}
							if (local97 == 3) {
								local117 = 13;
							}
							if (local97 == 4) {
								local117 = 51;
							}
							if (local97 == local12.anInt1762) {
								local119 = local12.anInt1748;
							}
							if (local12.anInt1769 == local97) {
								local119 = local12.anInt1754;
							}
							Static114.method4751(true, (long) arg1.anInt6602, local117, local87[local97], 0, -1, "<col=ffff00>" + local38, 0, false, local119);
						}
					}
				}
				if (Static87.aClass36_3 == Static4.aClass36_5 && local87 != null) {
					for (local97 = 4; local97 >= 0; local97--) {
						if (local87[local97] != null && local87[local97].equalsIgnoreCase(Static119.aClass267_93.method6581(Static161.anInt3239))) {
							@Pc(219) short local219 = 0;
							if (local12.anInt1756 > Static302.aClass3_Sub2_Sub1_Sub2_2.anInt6631) {
								local219 = 2000;
							}
							@Pc(232) short local232 = 0;
							if (local97 == 0) {
								local232 = 4;
							}
							if (local97 == 1) {
								local232 = 59;
							}
							if (local97 == 2) {
								local232 = 30;
							}
							if (local97 == 3) {
								local232 = 13;
							}
							if (local97 == 4) {
								local232 = 51;
							}
							if (local232 != 0) {
								local232 += local219;
							}
							Static114.method4751(true, (long) arg1.anInt6602, local232, local87[local97], 0, -1, "<col=ffff00>" + local38, 0, false, local12.anInt1764);
						}
					}
				}
			}
			Static114.method4751(true, (long) arg1.anInt6602, 1009, Static200.aClass267_52.method6581(Static161.anInt3239), 0, -1, "<col=ffff00>" + local38, 0, arg0, Static90.anInt2075);
		} else if (!arg0) {
			@Pc(336) Class171 local336 = Static327.anInt5631 == -1 ? null : Static80.aClass181_1.method4294(Static327.anInt5631);
			if ((Static405.anInt7261 & 0x2) != 0) {
				if (local336 == null || local12.method1380(local336.anInt4865, Static327.anInt5631) != local336.anInt4865) {
					Static114.method4751(true, (long) arg1.anInt6602, 20, Static104.aString16, 0, -1, Static289.aString36 + " -> <col=ffff00>" + local38, 0, false, Static67.anInt1750);
				}
				return;
			}
		}
	}
}
