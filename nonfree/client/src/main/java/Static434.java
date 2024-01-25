import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!om", name = "g", descriptor = "[Lclient!rfa;")
	public static Class60_Sub1[] aClass60_Sub1Array6;

	@OriginalMember(owner = "client!om", name = "j", descriptor = "Z")
	public static boolean aBoolean553 = false;

	@OriginalMember(owner = "client!om", name = "f", descriptor = "I")
	public static int anInt7427 = 0;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "I")
	public static int anInt7432 = 0;

	@OriginalMember(owner = "client!om", name = "d", descriptor = "I")
	public static int anInt7433 = 0;

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
	public static void method6604() {
		if (Static496.aBoolean641) {
			return;
		}
		Static462.method7027(Static526.aClass243ArrayArrayArray3);
		if (Static104.aClass243ArrayArrayArray1 != null) {
			Static462.method7027(Static104.aClass243ArrayArrayArray1);
		}
		Static496.aBoolean641 = true;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
	public static void method6606() {
		Static168.method3312(Static637.aClass381_13);
		Static323.anInt5579++;
		if (Static486.aBoolean632 && Static636.aBoolean732) {
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 0;
			if (Static93.aBoolean113) {
				local32 = Static24.method290();
				local34 = Static488.method7227();
			}
			@Pc(48) int local48 = local32 + Static331.aClass42_8.method6019();
			@Pc(54) int local54 = local34 + Static331.aClass42_8.method6014();
			local54 -= Static231.anInt4491;
			local48 -= Static75.anInt1038;
			if (local48 < Static22.anInt5053) {
				local48 = Static22.anInt5053;
			}
			if (local48 + Static637.aClass381_13.anInt10159 > Static220.aClass381_4.anInt10159 + Static22.anInt5053) {
				local48 = Static22.anInt5053 + Static220.aClass381_4.anInt10159 - Static637.aClass381_13.anInt10159;
			}
			if (Static603.anInt9534 > local54) {
				local54 = Static603.anInt9534;
			}
			if (Static603.anInt9534 + Static220.aClass381_4.anInt10131 < local54 + Static637.aClass381_13.anInt10131) {
				local54 = Static220.aClass381_4.anInt10131 + Static603.anInt9534 - Static637.aClass381_13.anInt10131;
			}
			@Pc(126) int local126 = local48 + Static220.aClass381_4.anInt10136 - Static22.anInt5053;
			@Pc(133) int local133 = local54 + Static220.aClass381_4.anInt10141 - Static603.anInt9534;
			@Pc(204) Class6_Sub53 local204;
			if (Static331.aClass42_8.method6020()) {
				if (Static637.aClass381_13.anInt10102 < Static323.anInt5579) {
					@Pc(152) int local152 = local48 - Static186.anInt3733;
					@Pc(157) int local157 = local54 - Static419.anInt7216;
					if (Static637.aClass381_13.anInt10148 < local152 || local152 < -Static637.aClass381_13.anInt10148 || Static637.aClass381_13.anInt10148 < local157 || -Static637.aClass381_13.anInt10148 > local157) {
						Static511.aBoolean648 = true;
					}
				}
				if (Static637.aClass381_13.anObjectArray34 != null && Static511.aBoolean648) {
					local204 = new Class6_Sub53();
					local204.anObjectArray3 = Static637.aClass381_13.anObjectArray34;
					local204.aClass381_11 = Static637.aClass381_13;
					local204.anInt9916 = local133;
					local204.anInt9918 = local126;
					Static301.method4842(local204);
					return;
				}
			} else {
				if (Static511.aBoolean648) {
					Static565.method7967();
					if (Static637.aClass381_13.anObjectArray16 != null) {
						local204 = new Class6_Sub53();
						local204.aClass381_12 = Static340.aClass381_9;
						local204.anObjectArray3 = Static637.aClass381_13.anObjectArray16;
						local204.aClass381_11 = Static637.aClass381_13;
						local204.anInt9918 = local126;
						local204.anInt9916 = local133;
						Static301.method4842(local204);
					}
					if (Static340.aClass381_9 != null && Static78.method1071(Static637.aClass381_13) != null) {
						Static227.method4062(Static340.aClass381_9, Static637.aClass381_13);
					}
				} else if ((Static76.anInt1069 == 1 || Static144.method7095()) && Static539.anInt8776 > 2) {
					Static107.method2041(Static231.anInt4491 + Static419.anInt7216, Static75.anInt1038 + Static186.anInt3733);
				} else if (Static37.method488()) {
					Static107.method2041(Static419.anInt7216 + Static231.anInt4491, Static186.anInt3733 + Static75.anInt1038);
				}
				Static637.aClass381_13 = null;
			}
		} else if (Static323.anInt5579 > 1) {
			Static637.aClass381_13 = null;
		}
	}
}
