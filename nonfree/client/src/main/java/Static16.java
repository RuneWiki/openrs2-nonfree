import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!cc", name = "J", descriptor = "[I")
	public static int[] anIntArray49;

	@OriginalMember(owner = "client!cc", name = "L", descriptor = "[I")
	public static int[] anIntArray50;

	@OriginalMember(owner = "client!cc", name = "N", descriptor = "Lclient!ea;")
	public static Class20_Sub1 aClass20_Sub1_2;

	@OriginalMember(owner = "client!cc", name = "B", descriptor = "Lclient!jf;")
	public static Class42 aClass42_5 = new Class42(4096);

	@OriginalMember(owner = "client!cc", name = "H", descriptor = "Lclient!ja;")
	public static Class39 aClass39_268 = Static28.method504("mapdots");

	@OriginalMember(owner = "client!cc", name = "I", descriptor = "I")
	public static int anInt393 = 0;

	@OriginalMember(owner = "client!cc", name = "M", descriptor = "Lclient!ja;")
	public static Class39 aClass39_269 = Static28.method504("<col=c0ff00>");

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BII)I")
	public static int method256(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		} else {
			arg1 = arg1 * (arg0 & 0x7F) / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)Z")
	public static boolean method257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class4_Sub2_Sub10 local7 = Static73.method1207(arg0);
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local7.method921(arg1);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)V")
	public static void method258() {
		Static78.anInt1860 = -1;
		Static40.anInt1002 = 1;
		Static20.anInt563 = -1;
		Static77.aBoolean100 = false;
		Static14.aClass20_10 = null;
		Static130.anInt3174 = 0;
		Static54.anInt1478 = 2;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZZIZB)Lclient!ea;")
	public static Class20_Sub1 method259(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(11) Class75 local11 = null;
		if (Static99.aClass38_2 != null) {
			local11 = new Class75(arg2, Static99.aClass38_2, Static83.aClass38Array1[arg2], 1000000);
		}
		return new Class20_Sub1(local11, Static13.aClass75_1, arg2, arg1, arg3, arg0);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZLclient!he;)V")
	public static void method260(@OriginalArg(1) Class4_Sub5 arg0) {
		@Pc(2) int local2 = arg0.anInt1241;
		if (local2 == 324) {
			if (Static51.anInt2466 == -1) {
				Static129.anInt3146 = arg0.anInt1231;
				Static51.anInt2466 = arg0.anInt1247;
			}
			if (Static58.aClass63_1.aBoolean113) {
				arg0.anInt1247 = Static51.anInt2466;
			} else {
				arg0.anInt1247 = Static129.anInt3146;
			}
		} else if (local2 == 325) {
			if (Static51.anInt2466 == -1) {
				Static129.anInt3146 = arg0.anInt1231;
				Static51.anInt2466 = arg0.anInt1247;
			}
			if (Static58.aClass63_1.aBoolean113) {
				arg0.anInt1247 = Static129.anInt3146;
			} else {
				arg0.anInt1247 = Static51.anInt2466;
			}
		} else if (local2 == 327) {
			arg0.anInt1217 = 150;
			arg0.anInt1227 = (int) (Math.sin((double) Static71.anInt1738 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt1248 = 0;
			arg0.anInt1200 = 5;
		} else if (local2 == 328) {
			arg0.anInt1217 = 150;
			arg0.anInt1227 = (int) (Math.sin((double) Static71.anInt1738 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt1248 = 1;
			arg0.anInt1200 = 5;
		}
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(II)Z")
	public static boolean method261(@OriginalArg(0) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
	public static void method262() {
		aClass42_5 = null;
		anIntArray49 = null;
		aClass20_Sub1_2 = null;
		aClass39_268 = null;
		anIntArray50 = null;
		aClass39_269 = null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIII)V")
	public static void method263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int local11 = arg2; local11 <= arg3 + arg2; local11++) {
			for (@Pc(15) int local15 = arg1; local15 <= arg1 + arg0; local15++) {
				if (local15 >= 0 && local15 < 104 && local11 >= 0 && local11 < 104) {
					Static14.aByteArrayArrayArray1[0][local15][local11] = 127;
					if (arg1 == local15 && local15 > 0) {
						Static6.anIntArrayArrayArray1[0][local15][local11] = Static6.anIntArrayArrayArray1[0][local15 - 1][local11];
					}
					if (arg1 + arg0 == local15 && local15 < 103) {
						Static6.anIntArrayArrayArray1[0][local15][local11] = Static6.anIntArrayArrayArray1[0][local15 + 1][local11];
					}
					if (local11 == arg2 && local11 > 0) {
						Static6.anIntArrayArrayArray1[0][local15][local11] = Static6.anIntArrayArrayArray1[0][local15][local11 - 1];
					}
					if (arg3 + arg2 == local11 && local11 < 103) {
						Static6.anIntArrayArrayArray1[0][local15][local11] = Static6.anIntArrayArrayArray1[0][local15][local11 + 1];
					}
				}
			}
		}
	}
}
