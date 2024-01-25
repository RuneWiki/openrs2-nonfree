import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!caa", name = "z", descriptor = "F")
	public static float aFloat41;

	@OriginalMember(owner = "client!caa", name = "E", descriptor = "Lclient!ml;")
	public static Class213 aClass213_1;

	@OriginalMember(owner = "client!caa", name = "M", descriptor = "I")
	public static int anInt1441;

	@OriginalMember(owner = "client!caa", name = "B", descriptor = "Z")
	public static boolean aBoolean151 = true;

	@OriginalMember(owner = "client!caa", name = "C", descriptor = "Lclient!bca;")
	public static final Class26 aClass26_1 = new Class26("", 16);

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "(I)V")
	public static void method1263() {
		for (@Pc(15) Class6_Sub14 local15 = (Class6_Sub14) Static199.aClass211_27.method5183(); local15 != null; local15 = (Class6_Sub14) Static199.aClass211_27.method5177()) {
			if (Static256.aClass224ArrayArrayArray1 == null) {
				local15.method8151();
			} else {
				@Pc(33) int local33;
				@Pc(135) Class11_Sub1 local135;
				@Pc(92) Class11_Sub5 local92;
				@Pc(46) Class11_Sub3 local46;
				@Pc(174) Class11_Sub4 local174;
				@Pc(105) Class11_Sub5_Sub2 local105;
				@Pc(59) Class11_Sub3_Sub3 local59;
				@Pc(187) Class11_Sub4_Sub3 local187;
				if (local15.anInt1910 <= Static508.anInt8998) {
					local33 = Static476.anIntArray768[local15.anInt1907];
					if (local33 == 0) {
						local174 = Static298.method4853(local15.anInt1915, local15.anInt1918, local15.anInt1903);
						if (local174 instanceof Class11_Sub4_Sub3) {
							Static222.method4000(local15.anInt1915, local15.anInt1918, local15.anInt1903);
							local187 = (Class11_Sub4_Sub3) local174;
							if (local187.aClass11_Sub4_1 != null) {
								Static253.method4433(local15.anInt1915, local15.anInt1918, local15.anInt1903, local187.aClass11_Sub4_1, null);
							}
						}
					} else if (local33 == 1) {
						local46 = Static541.method7782(local15.anInt1915, local15.anInt1918, local15.anInt1903);
						if (local46 instanceof Class11_Sub3_Sub3) {
							Static438.method6671(local15.anInt1915, local15.anInt1918, local15.anInt1903);
							local59 = (Class11_Sub3_Sub3) local46;
							if (local59.aClass11_Sub3_3 != null) {
								Static163.method3315(local15.anInt1915, local15.anInt1918, local15.anInt1903, local59.aClass11_Sub3_3, null);
							}
						}
					} else if (local33 == 2) {
						local135 = Static178.method3532(local15.anInt1915, local15.anInt1918, local15.anInt1903, ql.class);
						if (local135 instanceof Class11_Sub1_Sub4) {
							Static66.method1374(local15.anInt1915, local15.anInt1918, local15.anInt1903, ql.class);
							@Pc(156) Class11_Sub1_Sub4 local156 = (Class11_Sub1_Sub4) local135;
							if (local156.aClass11_Sub1_1 != null) {
								Static88.method1973(local156.aClass11_Sub1_1, false);
							}
						}
					} else if (local33 == 3) {
						local92 = Static216.method3980(local15.anInt1915, local15.anInt1918, local15.anInt1903);
						if (local92 instanceof Class11_Sub5_Sub2) {
							Static551.method7861(local15.anInt1915, local15.anInt1918, local15.anInt1903);
							local105 = (Class11_Sub5_Sub2) local92;
							if (local105.aClass11_Sub5_1 != null) {
								Static248.method4389(local15.anInt1915, local15.anInt1918, local15.anInt1903, local105.aClass11_Sub5_1);
							}
						}
					}
					local15.method8151();
				} else if (Static508.anInt8998 == local15.anInt1911) {
					local33 = Static476.anIntArray768[local15.anInt1907];
					if (local33 == 0) {
						local174 = Static298.method4853(local15.anInt1915, local15.anInt1918, local15.anInt1903);
						if (local174 instanceof Class11_Sub4_Sub3) {
							local15.method8151();
						} else if (Static165.method3351(local15.anInt1915, local15.anInt1918, local15.anInt1903) == null) {
							local187 = new Class11_Sub4_Sub3(local15.anInt1907, local15.anInt1900, local15.anInt1902, local15.anInt1904, local15.anInt1908, local174);
							Static253.method4433(local15.anInt1915, local15.anInt1918, local15.anInt1903, local187, null);
						} else {
							local15.method8151();
						}
					} else if (local33 == 1) {
						local46 = Static541.method7782(local15.anInt1915, local15.anInt1918, local15.anInt1903);
						if (local46 instanceof Class11_Sub3_Sub3) {
							local15.method8151();
						} else if (Static125.method2481(local15.anInt1915, local15.anInt1918, local15.anInt1903) == null) {
							local59 = new Class11_Sub3_Sub3(local15.anInt1907, local15.anInt1900, local15.anInt1902, local15.anInt1904, local15.anInt1908, local46);
							Static163.method3315(local15.anInt1915, local15.anInt1918, local15.anInt1903, local59, null);
						} else {
							local15.method8151();
						}
					} else if (local33 == 2) {
						local135 = Static178.method3532(local15.anInt1915, local15.anInt1918, local15.anInt1903, ql.class);
						if (local135 instanceof Class11_Sub1_Sub4) {
							local15.method8151();
						} else {
							Static66.method1374(local15.anInt1915, local15.anInt1918, local15.anInt1903, ql.class);
							@Pc(421) Class31 local421 = Static480.aClass57_11.method1469(local15.anInt1916);
							@Pc(434) int local434;
							@Pc(437) int local437;
							if (local15.anInt1900 == 1 || local15.anInt1900 == 3) {
								local434 = local421.anInt1058;
								local437 = local421.anInt1109;
							} else {
								local434 = local421.anInt1109;
								local437 = local421.anInt1058;
							}
							@Pc(478) Class11_Sub1_Sub4 local478 = new Class11_Sub1_Sub4(local15.anInt1907, local15.anInt1900, local15.anInt1915, local15.anInt1902, local15.anInt1904, local15.anInt1908, local15.anInt1918, local15.anInt1918 + local434 - 1, local15.anInt1903, local437 + local15.anInt1903 - 1, local135);
							Static88.method1973(local478, false);
						}
					} else if (local33 == 3) {
						local92 = Static216.method3980(local15.anInt1915, local15.anInt1918, local15.anInt1903);
						if (local92 instanceof Class11_Sub5_Sub2) {
							local15.method8151();
						} else {
							local105 = new Class11_Sub5_Sub2(local15.anInt1902, local15.anInt1904, local15.anInt1908, local92);
							Static248.method4389(local15.anInt1915, local15.anInt1918, local15.anInt1903, local105);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(ICI)I")
	public static int method1264(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local7 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local7 = 1762;
		}
		return local7;
	}
}
