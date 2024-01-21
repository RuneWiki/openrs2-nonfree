import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!fd", name = "v", descriptor = "Lclient!pb;")
	public static Class71 aClass71_11;

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_385 = Static151.method2243("<)4col>");

	@OriginalMember(owner = "client!fd", name = "q", descriptor = "[I")
	public static final int[] anIntArray87 = new int[200];

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "[I")
	public static final int[] anIntArray88 = new int[25];

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_386 = Static151.method2243("Registrierter Benutzer");

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_387 = Static151.method2243("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!fd", name = "u", descriptor = "[S")
	public static final short[] aShortArray32 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!fd", name = "w", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_388 = Static151.method2243("Okay");

	@OriginalMember(owner = "client!fd", name = "x", descriptor = "[S")
	public static final short[] aShortArray33 = new short[] { 21, 30, 10, 45, 13, 46, 48, 12 };

	@OriginalMember(owner = "client!fd", name = "y", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_389 = Static151.method2243("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static20.anIntArrayArrayArray1[arg0][local16][local20] == -Static28.anInt638) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(146) int local146 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static72.anIntArrayArrayArray3[arg0][arg1][arg3] + arg5;
			if (!Static123.method3147(local20, local156, local146)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static123.method3147(local169, local156, local146)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static123.method3147(local20, local156, local182)) {
				return false;
			} else if (Static123.method3147(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static131.method1030(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static123.method3147(local16 + 1, Static72.anIntArrayArrayArray3[arg0][arg1][arg3] + arg5, local20 + 1) && Static123.method3147(local16 + 128 - 1, Static72.anIntArrayArrayArray3[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static123.method3147(local16 + 128 - 1, Static72.anIntArrayArrayArray3[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static123.method3147(local16 + 1, Static72.anIntArrayArrayArray3[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}
}
