import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "[I")
	public static int[] anIntArray230;

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "Lclient!me;")
	public static Class6_Sub2_Sub2_Sub4 aClass6_Sub2_Sub2_Sub4_4;

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
	public static int anInt2299;

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
	public static int anInt2297 = 0;

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "Lclient!rc;")
	private static Class55 aClass55_925 = Static34.method846("wave:");

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "Lclient!rc;")
	public static Class55 aClass55_924 = aClass55_925;

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
	public static volatile int anInt2298 = -1;

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "[I")
	public static int[] anIntArray231 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "Lclient!rc;")
	private static Class55 aClass55_927 = Static34.method846("glow2:");

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "Lclient!rc;")
	public static Class55 aClass55_926 = aClass55_927;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
	public static void method1563() {
		aClass55_926 = null;
		aClass55_924 = null;
		aClass6_Sub2_Sub2_Sub4_4 = null;
		aClass55_925 = null;
		anIntArray230 = null;
		anIntArray231 = null;
		aClass55_927 = null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIBLclient!pb;)[Lclient!bd;")
	public static Class6_Sub2_Sub2_Sub1[] method1564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class40 arg2) {
		return Static44.method1829(arg0, arg1, arg2) ? Static100.method1914() : null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	public static void method1565() {
		Static21.aBoolean43 = true;
		Static91.method1726();
		@Pc(29) boolean local29;
		if (Static14.anInt804 != -1) {
			local29 = Static69.method1383(Static14.anInt804, 261, 190, 1);
			if (!local29) {
				Static63.aBoolean89 = true;
			}
		} else if (Static100.anIntArray277[Static112.anInt3228] != -1) {
			local29 = Static69.method1383(Static100.anIntArray277[Static112.anInt3228], 261, 190, 1);
			if (!local29) {
				Static63.aBoolean89 = true;
			}
		}
		if (Static109.aBoolean163 && Static1.anInt6 == 1) {
			if (Static72.anInt2121 == 1) {
				Static90.method1718();
			} else {
				Static109.method2036();
			}
		}
		Static92.method1746();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IILclient!d;IB)V")
	public static void method1566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub4 arg2, @OriginalArg(3) int arg3) {
		if (Static94.anInt2645 >= 400) {
			return;
		}
		if (arg2.anIntArray48 != null) {
			arg2 = arg2.method542();
		}
		if (arg2 == null || !arg2.aBoolean39) {
			return;
		}
		@Pc(32) Class55 local32 = arg2.aClass55_279;
		if (arg2.anInt869 != 0) {
			local32 = Static89.method1698(new Class55[] { local32, Static67.method1363(Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt679, arg2.anInt869), Static110.aClass55_1320, Static70.aClass55_825, Static58.method1196(arg2.anInt869), Static10.aClass55_248 });
		}
		if (Static43.anInt1463 == 1) {
			Static86.method1643(9, arg3, arg0, Static89.method1698(new Class55[] { Static22.aClass55_370, Static90.aClass55_1051, local32 }), Static34.aClass55_513, arg1);
		} else if (Static102.anInt3029 != 1) {
			@Pc(117) Class55[] local117 = arg2.aClass55Array4;
			if (Static107.aBoolean158) {
				local117 = Static77.method1533(local117);
			}
			@Pc(127) int local127;
			if (local117 != null) {
				for (local127 = 4; local127 >= 0; local127--) {
					if (local117[local127] != null && !local117[local127].method1642(Static33.aClass55_482)) {
						@Pc(146) byte local146 = 0;
						if (local127 == 0) {
							local146 = 38;
						}
						if (local127 == 1) {
							local146 = 1;
						}
						if (local127 == 2) {
							local146 = 53;
						}
						if (local127 == 3) {
							local146 = 22;
						}
						if (local127 == 4) {
							local146 = 3;
						}
						Static86.method1643(local146, arg3, arg0, Static89.method1698(new Class55[] { Static15.aClass55_287, local32 }), local117[local127], arg1);
					}
				}
			}
			if (local117 != null) {
				for (local127 = 4; local127 >= 0; local127--) {
					if (local117[local127] != null && local117[local127].method1642(Static33.aClass55_482)) {
						@Pc(221) int local221 = 0;
						@Pc(223) short local223 = 0;
						if (Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt679 < arg2.anInt869) {
							local223 = 2000;
						}
						if (local127 == 0) {
							local221 = local223 + 38;
						}
						if (local127 == 1) {
							local221 = local223 + 1;
						}
						if (local127 == 2) {
							local221 = local223 + 53;
						}
						if (local127 == 3) {
							local221 = local223 + 22;
						}
						if (local127 == 4) {
							local221 = local223 + 3;
						}
						Static86.method1643(local221, arg3, arg0, Static89.method1698(new Class55[] { Static15.aClass55_287, local32 }), local117[local127], arg1);
					}
				}
			}
			Static86.method1643(1001, arg3, arg0, Static89.method1698(new Class55[] { Static15.aClass55_287, local32 }), Static39.aClass55_660, arg1);
		} else if ((Static66.anInt1971 & 0x2) == 2) {
			Static86.method1643(34, arg3, arg0, Static89.method1698(new Class55[] { Static86.aClass55_1000, Static90.aClass55_1051, local32 }), Static66.aClass55_780, arg1);
		}
	}
}
