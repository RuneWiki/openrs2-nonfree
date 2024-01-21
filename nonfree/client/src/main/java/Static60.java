import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!fj", name = "U", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_416 = Static151.method2243("(U1");

	@OriginalMember(owner = "client!fj", name = "X", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_419 = Static151.method2243("To play on this world move to a free area first)3");

	@OriginalMember(owner = "client!fj", name = "V", descriptor = "Lclient!mb;")
	public static Class62 aClass62_417 = aClass62_419;

	@OriginalMember(owner = "client!fj", name = "W", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_418 = Static151.method2243("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!fj", name = "Z", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_420 = Static151.method2243("<img=0>");

	@OriginalMember(owner = "client!fj", name = "bb", descriptor = "Lclient!q;")
	public static final Class79 aClass79_5 = new Class79(30);

	@OriginalMember(owner = "client!fj", name = "cb", descriptor = "Lclient!mb;")
	public static Class62 aClass62_421 = aClass62_418;

	@OriginalMember(owner = "client!fj", name = "eb", descriptor = "Z")
	public static boolean aBoolean52 = false;

	@OriginalMember(owner = "client!fj", name = "kb", descriptor = "I")
	public static int anInt1269 = 0;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIII)Z")
	public static boolean method843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static131.method1030(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static72.anIntArrayArrayArray3[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static189.anInt3928) {
					if (!Static123.method3147(local10, local24, local14)) {
						return false;
					}
					if (!Static123.method3147(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static123.method3147(local10, local28, local14)) {
						return false;
					}
					if (!Static123.method3147(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static123.method3147(local10, local32, local14)) {
					return false;
				}
				if (!Static123.method3147(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static172.anInt679) {
					if (!Static123.method3147(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static123.method3147(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static123.method3147(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static123.method3147(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static123.method3147(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static123.method3147(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static189.anInt3928) {
					if (!Static123.method3147(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static123.method3147(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static123.method3147(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static123.method3147(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static123.method3147(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static123.method3147(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static172.anInt679) {
					if (!Static123.method3147(local10, local24, local14)) {
						return false;
					}
					if (!Static123.method3147(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static123.method3147(local10, local28, local14)) {
						return false;
					}
					if (!Static123.method3147(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static123.method3147(local10, local32, local14)) {
					return false;
				}
				if (!Static123.method3147(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static123.method3147(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static123.method3147(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static123.method3147(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static123.method3147(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static123.method3147(local10, local32, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(II)Lclient!hg;")
	public static Class2_Sub1_Sub11 method844(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub11 local10 = (Class2_Sub1_Sub11) Static81.aClass53_25.method1648((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static175.aClass71_34.method2130(Static122.method1923(arg0), Static88.method1242(arg0));
		local10 = new Class2_Sub1_Sub11();
		local10.anInt1548 = arg0;
		if (local24 != null) {
			local10.method1065(new Class2_Sub11(local24));
		}
		local10.method1069();
		if (!Static1.aBoolean6 && local10.aBoolean67) {
			local10.aClass62Array43 = null;
		}
		if (local10.aBoolean76) {
			local10.anInt1550 = 0;
			local10.aBoolean72 = false;
		}
		Static81.aClass53_25.method1645((long) arg0, local10);
		return local10;
	}
}
