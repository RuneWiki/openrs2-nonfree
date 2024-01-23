import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!fn", name = "u", descriptor = "I")
	public static int anInt1737;

	@OriginalMember(owner = "client!fn", name = "x", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray11;

	@OriginalMember(owner = "client!fn", name = "q", descriptor = "I")
	public static int anInt1733 = 0;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIII)I")
	public static int method1629(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIZII)V")
	public static void method1631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static188.anInt3598 <= arg2 && Static289.anInt5245 >= arg1 && arg3 >= Static231.anInt4333 && arg4 <= Static218.anInt4086) {
			Static311.method4643(arg3, arg1, arg2, arg0, arg4);
		} else {
			Static267.method4130(arg0, arg2, arg1, arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "(I)V")
	public static void method1635() {
		Static201.aClass157Array1 = null;
		Static129.method2270(Static288.anInt5232, -1, 0, Static194.anInt3876, 0, Static315.anInt5636, 0, 0);
		if (Static201.aClass157Array1 != null) {
			Static296.method717(Static178.anInt3541, Static288.anInt5232, 0, -1412584499, Static205.anInt3961, 0, Static201.aClass157Array1, Static194.anInt3876, Static252.aClass157_15.anInt4752);
			Static201.aClass157Array1 = null;
		}
	}

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "(I)V")
	public static void method1636() {
		Static224.method3621(Static64.aClass157_5);
		Static183.anInt3513++;
		if (Static64.aBoolean131 && Static143.aBoolean244) {
			@Pc(29) int local29 = Static64.aClass157_5.anInt4667;
			@Pc(36) int local36 = Static14.anInt309;
			local36 -= Static136.anInt2664;
			@Pc(42) int local42 = Static89.anInt1899;
			if (local36 < Static311.anInt5589) {
				local36 = Static311.anInt5589;
			}
			if (local36 + Static64.aClass157_5.anInt4689 > Static252.aClass157_15.anInt4689 + Static311.anInt5589) {
				local36 = Static311.anInt5589 + Static252.aClass157_15.anInt4689 - Static64.aClass157_5.anInt4689;
			}
			@Pc(76) int local76 = local36 + Static252.aClass157_15.anInt4693 - Static311.anInt5589;
			local42 -= Static203.anInt3368;
			@Pc(85) int local85 = local36 - Static305.anInt5486;
			if (local42 < Static46.anInt1050) {
				local42 = Static46.anInt1050;
			}
			if (local42 + Static64.aClass157_5.anInt4680 > Static46.anInt1050 + Static252.aClass157_15.anInt4680) {
				local42 = Static46.anInt1050 + Static252.aClass157_15.anInt4680 - Static64.aClass157_5.anInt4680;
			}
			@Pc(119) int local119 = local42 - Static286.anInt5174;
			if (Static64.aClass157_5.anInt4670 < Static183.anInt3513 && (local29 < local119 || -local29 > local119 || local85 > local29 || -local29 > local85)) {
				Static6.aBoolean471 = true;
			}
			@Pc(156) int local156 = Static252.aClass157_15.anInt4679 + local42 - Static46.anInt1050;
			@Pc(167) Class1_Sub29 local167;
			if (Static64.aClass157_5.anObjectArray16 != null && Static6.aBoolean471) {
				local167 = new Class1_Sub29();
				local167.aClass157_13 = Static64.aClass157_5;
				local167.anInt4522 = local76;
				local167.anInt4523 = local156;
				local167.anObjectArray2 = Static64.aClass157_5.anObjectArray16;
				Static5.method104(local167);
			}
			if (Static3.anInt114 == 0) {
				if (Static6.aBoolean471) {
					if (Static64.aClass157_5.anObjectArray17 != null) {
						local167 = new Class1_Sub29();
						local167.anInt4523 = local156;
						local167.aClass157_14 = Static4.aClass157_1;
						local167.aClass157_13 = Static64.aClass157_5;
						local167.anInt4522 = local76;
						local167.anObjectArray2 = Static64.aClass157_5.anObjectArray17;
						Static5.method104(local167);
					}
					if (Static4.aClass157_1 != null && Static42.method779(Static64.aClass157_5) != null) {
						Static116.aClass1_Sub13_Sub1_48.method1887(124);
						Static116.aClass1_Sub13_Sub1_48.method1851(Static4.aClass157_1.anInt4672);
						Static116.aClass1_Sub13_Sub1_48.method1865(Static64.aClass157_5.anInt4692);
						Static116.aClass1_Sub13_Sub1_48.method1862(Static4.aClass157_1.anInt4692);
						Static116.aClass1_Sub13_Sub1_48.method1851(Static64.aClass157_5.anInt4672);
					}
				} else if ((Static239.anInt4459 == 1 || Static310.method4599(Static241.anInt4470 - 1)) && Static241.anInt4470 > 2) {
					Static138.method3843();
				} else if (Static241.anInt4470 > 0) {
					Static8.method142();
				}
				Static64.aClass157_5 = null;
			}
		} else if (Static183.anInt3513 > 1) {
			Static64.aClass157_5 = null;
		}
	}
}
