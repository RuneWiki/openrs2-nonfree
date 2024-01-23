import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!lk", name = "eb", descriptor = "Lclient!hj;")
	public static Class1_Sub6_Sub2 aClass1_Sub6_Sub2_1;

	@OriginalMember(owner = "client!lk", name = "V", descriptor = "Lclient!sc;")
	private static Class107 aClass107_746 = Static231.method3737("skill)2");

	@OriginalMember(owner = "client!lk", name = "db", descriptor = "I")
	public static int anInt2799 = 0;

	@OriginalMember(owner = "client!lk", name = "gb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_747 = aClass107_746;

	@OriginalMember(owner = "client!lk", name = "ib", descriptor = "I")
	public static int anInt2802 = 0;

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(II)Lclient!li;")
	public static Class75 method2147(@OriginalArg(1) int arg0) {
		@Pc(12) Class75 local12 = (Class75) Static221.aClass61_90.method1693((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(28) byte[] local28 = Static198.aClass28_69.method819(Static210.method3377(arg0), Static22.method415(arg0));
		local12 = new Class75();
		local12.anInt2725 = arg0;
		if (local28 != null) {
			local12.method2117(new Class1_Sub26(local28));
		}
		local12.method2100();
		if (local12.anInt2744 != -1) {
			local12.method2099(method2147(local12.anInt2733), method2147(local12.anInt2744));
		}
		if (local12.anInt2708 != -1) {
			local12.method2110(method2147(local12.anInt2748), method2147(local12.anInt2708));
		}
		if (!Static13.aBoolean29 && local12.aBoolean229) {
			local12.aClass107Array14 = null;
			local12.anInt2742 = 0;
			local12.aClass107Array15 = null;
			local12.aBoolean231 = false;
			local12.aClass107_737 = Static63.aClass107_426;
		}
		Static221.aClass61_90.method1694((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(BLclient!o;)Z")
	public static boolean method2148(@OriginalArg(1) Class86 arg0) {
		if (arg0.anIntArray278 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray278.length; local17++) {
			@Pc(24) int local24 = Static173.method2748(arg0, local17);
			@Pc(29) int local29 = arg0.anIntArray288[local17];
			if (arg0.anIntArray278[local17] == 2) {
				if (local29 <= local24) {
					return false;
				}
			} else if (arg0.anIntArray278[local17] == 3) {
				if (local24 <= local29) {
					return false;
				}
			} else if (arg0.anIntArray278[local17] == 4) {
				if (local24 == local29) {
					return false;
				}
			} else if (local24 != local29) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(II)Lclient!sc;")
	public static Class107 method2149(@OriginalArg(1) int arg0) {
		return Static149.method2437(new Class107[] { Static115.method2001(arg0 >> 24 & 0xFF), Static21.aClass107_145, Static115.method2001(arg0 >> 16 & 0xFF), Static21.aClass107_145, Static115.method2001(arg0 >> 8 & 0xFF), Static21.aClass107_145, Static115.method2001(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIZII)V")
	public static void method2150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) int local14 = arg1 - arg4;
		@Pc(19) int local19 = arg3 - arg0;
		if (local14 == 0) {
			if (local19 != 0) {
				Static19.method377(arg3, arg0, arg2, arg4);
			}
		} else if (local19 == 0) {
			Static195.method3184(arg4, arg0, arg2, arg1);
		} else {
			@Pc(48) int local48 = (local19 << 12) / local14;
			@Pc(57) int local57 = arg0 - (arg4 * local48 >> 12);
			@Pc(75) int local75;
			@Pc(73) int local73;
			if (Static99.anInt915 > arg1) {
				local75 = Static99.anInt915;
				local73 = local57 + (Static99.anInt915 * local48 >> 12);
			} else if (Static38.anInt784 >= arg1) {
				local73 = arg3;
				local75 = arg1;
			} else {
				local75 = Static38.anInt784;
				local73 = (Static38.anInt784 * local48 >> 12) + local57;
			}
			if (local73 < Static223.anInt4869) {
				local75 = (Static223.anInt4869 - local57 << 12) / local48;
				local73 = Static223.anInt4869;
			} else if (local73 > Static47.anInt1057) {
				local73 = Static47.anInt1057;
				local75 = (Static47.anInt1057 - local57 << 12) / local48;
			}
			@Pc(145) int local145;
			@Pc(147) int local147;
			if (Static99.anInt915 > arg4) {
				local147 = (local48 * Static99.anInt915 >> 12) + local57;
				local145 = Static99.anInt915;
			} else if (arg4 <= Static38.anInt784) {
				local145 = arg4;
				local147 = arg0;
			} else {
				local145 = Static38.anInt784;
				local147 = (Static38.anInt784 * local48 >> 12) + local57;
			}
			if (local147 < Static223.anInt4869) {
				local145 = (Static223.anInt4869 - local57 << 12) / local48;
				local147 = Static223.anInt4869;
			} else if (Static47.anInt1057 < local147) {
				local145 = (Static47.anInt1057 - local57 << 12) / local48;
				local147 = Static47.anInt1057;
			}
			Static29.method581(local75, arg2, local145, local73, local147);
		}
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(Z)V")
	public static void method2152() {
		if (!Static56.aBoolean124) {
			return;
		}
		@Pc(11) Class86 local11 = Static11.method314(Static123.anInt2677, Static153.anInt3386);
		if (local11 != null && local11.anObjectArray13 != null) {
			@Pc(20) Class1_Sub22 local20 = new Class1_Sub22();
			local20.anObjectArray33 = local11.anObjectArray13;
			local20.aClass86_10 = local11;
			Static60.method1156(local20);
		}
		Static56.aBoolean124 = false;
		Static16.method354(local11);
	}
}
