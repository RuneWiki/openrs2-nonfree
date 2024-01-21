import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!gd", name = "C", descriptor = "Lclient!re;")
	public static Class3_Sub1_Sub3_Sub4 aClass3_Sub1_Sub3_Sub4_45;

	@OriginalMember(owner = "client!gd", name = "J", descriptor = "[Lclient!kf;")
	public static Class3_Sub1_Sub3_Sub3[] aClass3_Sub1_Sub3_Sub3Array49;

	@OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
	public static int anInt3959;

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2104 = Static122.method531("<col=ff3000>");

	@OriginalMember(owner = "client!gd", name = "M", descriptor = "Lclient!sd;")
	private static Class73 aClass73_2108 = Static122.method531("button near the top of that page)3");

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2105 = aClass73_2108;

	@OriginalMember(owner = "client!gd", name = "A", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2106 = Static122.method531("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!gd", name = "P", descriptor = "Lclient!sd;")
	private static Class73 aClass73_2109 = Static122.method531("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!gd", name = "E", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2107 = aClass73_2109;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)Z")
	public static boolean method2788(@OriginalArg(0) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
	public static void method2791() {
		aClass3_Sub1_Sub3_Sub3Array49 = null;
		aClass73_2106 = null;
		aClass73_2104 = null;
		aClass3_Sub1_Sub3_Sub4_45 = null;
		aClass73_2107 = null;
		aClass73_2108 = null;
		aClass73_2105 = null;
		aClass73_2109 = null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IBIIII)V")
	public static void method2793(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static26.anInt719 == arg3 && Static54.anInt1286 == arg4 && (Static33.anInt830 == arg1 || !Static85.aBoolean127)) {
			return;
		}
		Static54.anInt1286 = arg4;
		Static33.anInt830 = arg1;
		Static26.anInt719 = arg3;
		if (!Static85.aBoolean127) {
			Static33.anInt830 = 0;
		}
		Static78.method1320(25);
		Static104.method1816(true, Static133.aClass73_1696);
		@Pc(44) int local44 = Static151.anInt3389;
		Static151.anInt3389 = arg3 * 8 - 48;
		@Pc(55) int local55 = Static151.anInt3389 - local44;
		@Pc(59) int local59 = Static134.anInt3066;
		Static134.anInt3066 = (arg4 - 6) * 8;
		@Pc(69) int local69 = Static134.anInt3066 - local59;
		for (@Pc(73) int local73 = 0; local73 < 32768; local73++) {
			@Pc(79) Class3_Sub1_Sub4_Sub7_Sub2 local79 = Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[local73];
			if (local79 != null) {
				for (@Pc(83) int local83 = 0; local83 < 10; local83++) {
					local79.anIntArray329[local83] -= local55;
					local79.anIntArray326[local83] -= local69;
				}
				local79.anInt3159 -= local69 * 128;
				local79.anInt3169 -= local55 * 128;
			}
		}
		for (@Pc(131) int local131 = 0; local131 < 2048; local131++) {
			@Pc(137) Class3_Sub1_Sub4_Sub7_Sub1 local137 = Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local131];
			if (local137 != null) {
				for (@Pc(141) int local141 = 0; local141 < 10; local141++) {
					local137.anIntArray329[local141] -= local55;
					local137.anIntArray326[local141] -= local69;
				}
				local137.anInt3169 -= local55 * 128;
				local137.anInt3159 -= local69 * 128;
			}
		}
		@Pc(185) byte local185 = 0;
		Static147.anInt3309 = arg1;
		Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.method2267(arg0, false, arg2);
		@Pc(202) byte local202 = 1;
		@Pc(204) byte local204 = 104;
		if (local55 < 0) {
			local185 = 103;
			local204 = -1;
			local202 = -1;
		}
		@Pc(214) byte local214 = 104;
		@Pc(216) byte local216 = 1;
		@Pc(218) byte local218 = 0;
		if (local69 < 0) {
			local216 = -1;
			local214 = -1;
			local218 = 103;
		}
		for (@Pc(228) int local228 = local185; local228 != local204; local228 += local202) {
			for (@Pc(232) int local232 = local218; local232 != local214; local232 += local216) {
				@Pc(238) int local238 = local228 + local55;
				@Pc(242) int local242 = local69 + local232;
				for (@Pc(244) int local244 = 0; local244 < 4; local244++) {
					if (local238 >= 0 && local242 >= 0 && local238 < 104 && local242 < 104) {
						Static99.aClass72ArrayArrayArray1[local244][local228][local232] = Static99.aClass72ArrayArrayArray1[local244][local238][local242];
					} else {
						Static99.aClass72ArrayArrayArray1[local244][local228][local232] = null;
					}
				}
			}
		}
		for (@Pc(310) Class3_Sub10 local310 = (Class3_Sub10) Static29.aClass72_11.method2401(); local310 != null; local310 = (Class3_Sub10) Static29.aClass72_11.method2407()) {
			local310.anInt998 -= local55;
			local310.anInt996 -= local69;
			if (local310.anInt998 < 0 || local310.anInt996 < 0 || local310.anInt998 >= 104 || local310.anInt996 >= 104) {
				local310.method2783();
			}
		}
		Static34.anInt835 = 0;
		if (Static14.anInt354 != 0) {
			Static14.anInt354 -= local55;
			Static29.anInt764 -= local69;
		}
		Static90.anInt2027 = -1;
		Static22.aBoolean40 = false;
		Static121.aClass72_38.method2396();
		Static94.aClass72_29.method2396();
	}
}
