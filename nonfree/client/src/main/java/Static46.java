import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!k", name = "cb", descriptor = "I")
	public static int anInt3209;

	@OriginalMember(owner = "client!k", name = "gb", descriptor = "Lclient!pb;")
	public static Class40 aClass40_39;

	@OriginalMember(owner = "client!k", name = "db", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1343 = Static34.method846("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!k", name = "hb", descriptor = "I")
	public static int anInt3212 = 0;

	@OriginalMember(owner = "client!k", name = "kb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1344 = Static34.method846("_");

	@OriginalMember(owner = "client!k", name = "lb", descriptor = "Lclient!le;")
	public static Class36 aClass36_38 = new Class36(128);

	@OriginalMember(owner = "client!k", name = "mb", descriptor = "I")
	public static int anInt3215 = 127;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!te;IIIIIII)V")
	public static void method2062(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub2_Sub14 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (Static27.aBoolean60) {
			Static112.anInt3241 = 32;
		} else {
			Static112.anInt3241 = 0;
		}
		Static27.aBoolean60 = false;
		if (arg3 <= arg6 && arg6 < arg3 + 16 && arg5 <= arg7 && arg7 < arg5 + 16) {
			if (arg4 == 2 || arg4 == 3) {
				Static72.aBoolean99 = true;
			}
			if (arg4 == 1) {
				Static63.aBoolean89 = true;
			}
			arg1.anInt2905 -= Static45.anInt1471 * 4;
		} else if (arg6 >= arg3 && arg6 < arg3 + 16 && arg5 + arg2 - 16 <= arg7 && arg7 < arg2 + arg5) {
			arg1.anInt2905 += Static45.anInt1471 * 4;
			if (arg4 == 2 || arg4 == 3) {
				Static72.aBoolean99 = true;
			}
			if (arg4 == 1) {
				Static63.aBoolean89 = true;
				return;
			}
		} else if (arg6 >= arg3 - Static112.anInt3241 && Static112.anInt3241 + arg3 + 16 > arg6 && arg7 >= arg5 + 16 && arg2 + arg5 - 16 > arg7 && Static45.anInt1471 > 0) {
			if (arg4 == 1) {
				Static63.aBoolean89 = true;
			}
			if (arg4 == 2 || arg4 == 3) {
				Static72.aBoolean99 = true;
			}
			Static27.aBoolean60 = true;
			@Pc(173) int local173 = (arg2 - 32) * arg2 / arg0;
			if (local173 < 8) {
				local173 = 8;
			}
			@Pc(187) int local187 = arg2 - local173 - 32;
			@Pc(199) int local199 = arg7 - local173 / 2 - arg5 - 16;
			arg1.anInt2905 = (arg0 - arg2) * local199 / local187;
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!k", name = "g", descriptor = "(I)V")
	public static void method2064() {
		aClass40_39 = null;
		aClass55_1344 = null;
		aClass55_1343 = null;
		aClass36_38 = null;
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(III)V")
	public static void method2066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < 100; local9++) {
			if (Static29.aClass55Array10[local9] != null) {
				@Pc(27) int local27 = Static102.anInt3033 + 70 + 4 - local7 * 14;
				@Pc(31) int local31 = Static100.anIntArray276[local9];
				if (local27 < -20) {
					break;
				}
				if (local31 == 0) {
					local7++;
				}
				@Pc(46) Class55 local46 = Static74.aClass55Array16[local9];
				if (local46 != null && local46.method1659(Static63.aClass55_750)) {
					local46 = local46.method1673(5);
				}
				if (local46 != null && local46.method1659(Static34.aClass55_505)) {
					local46 = local46.method1673(5);
				}
				if ((local31 == 1 || local31 == 2) && (local31 == 1 || Static12.anInt717 == 0 || Static12.anInt717 == 1 && Static57.method1186(local46))) {
					local7++;
					if (local27 - 14 < arg1 && arg1 <= local27 && !local46.method1640(Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.aClass55_245)) {
						if (Static91.anInt2554 >= 1) {
							Static86.method1643(17, 0, 0, Static89.method1698(new Class55[] { Static72.aClass55_862, local46 }), Static3.aClass55_10, 0);
						}
						Static86.method1643(41, 0, 0, Static89.method1698(new Class55[] { Static72.aClass55_862, local46 }), Static49.aClass55_598, 0);
						Static86.method1643(50, 0, 0, Static89.method1698(new Class55[] { Static72.aClass55_862, local46 }), Static31.aClass55_447, 0);
					}
				}
				if ((local31 == 3 || local31 == 7) && Static31.anInt1201 == 0 && (local31 == 7 || Static112.anInt3231 == 0 || Static112.anInt3231 == 1 && Static57.method1186(local46))) {
					local7++;
					if (arg1 > local27 - 14 && arg1 <= local27) {
						if (Static91.anInt2554 >= 1) {
							Static86.method1643(17, 0, 0, Static89.method1698(new Class55[] { Static72.aClass55_862, local46 }), Static3.aClass55_10, 0);
						}
						Static86.method1643(41, 0, 0, Static89.method1698(new Class55[] { Static72.aClass55_862, local46 }), Static49.aClass55_598, 0);
						Static86.method1643(50, 0, 0, Static89.method1698(new Class55[] { Static72.aClass55_862, local46 }), Static31.aClass55_447, 0);
					}
				}
				if (local31 == 4 && (Static41.anInt1399 == 0 || Static41.anInt1399 == 1 && Static57.method1186(local46))) {
					local7++;
					if (arg1 > local27 - 14 && arg1 <= local27) {
						Static86.method1643(42, 0, 0, Static89.method1698(new Class55[] { Static72.aClass55_862, local46 }), Static49.aClass55_595, 0);
					}
				}
				if ((local31 == 5 || local31 == 6) && Static31.anInt1201 == 0 && Static112.anInt3231 < 2) {
					local7++;
				}
				if (local31 == 8 && (Static41.anInt1399 == 0 || Static41.anInt1399 == 1 && Static57.method1186(local46))) {
					local7++;
					if (arg1 > local27 - 14 && local27 >= arg1) {
						Static86.method1643(11, 0, 0, Static89.method1698(new Class55[] { Static72.aClass55_862, local46 }), Static44.aClass55_1154, 0);
					}
				}
			}
		}
	}
}
