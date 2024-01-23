import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!tk", name = "F", descriptor = "Lclient!nm;")
	public static Class119 aClass119_84;

	@OriginalMember(owner = "client!tk", name = "G", descriptor = "[I")
	public static int[] anIntArray555;

	@OriginalMember(owner = "client!tk", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString192 = "Loading - please wait.";

	@OriginalMember(owner = "client!tk", name = "K", descriptor = "I")
	public static int anInt4987 = 0;

	@OriginalMember(owner = "client!tk", name = "T", descriptor = "[S")
	public static short[] aShortArray83 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method4168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static9.anIntArrayArrayArray2[arg0][local16][local20] == -Static34.anInt651) {
						return false;
					}
				}
			}
			local16 = (arg1 << 7) + 1;
			local20 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static280.anIntArrayArrayArray13[arg0][arg1][arg3] + arg5;
			if (!Static193.method3324(local16, local156, local20)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static193.method3324(local169, local156, local20)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static193.method3324(local16, local156, local182)) {
				return false;
			} else if (Static193.method3324(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static17.method273(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static193.method3324(local16 + 1, Static280.anIntArrayArrayArray13[arg0][arg1][arg3] + arg5, local20 + 1) && Static193.method3324(local16 + 128 - 1, Static280.anIntArrayArrayArray13[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static193.method3324(local16 + 128 - 1, Static280.anIntArrayArrayArray13[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static193.method3324(local16 + 1, Static280.anIntArrayArrayArray13[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I[S)[S")
	public static short[] method4169(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(13) short[] local13 = new short[arg0.length];
			Static317.method1045(arg0, 0, local13, 0, arg0.length);
			return local13;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BZ)V")
	public static void method4170(@OriginalArg(1) boolean arg0) {
		Static175.method2997(Static194.anInt3876, Static315.anInt5636, Static288.anInt5232, arg0);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "([J[Ljava/lang/Object;I)V")
	public static void method4172(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1) {
		Static245.method3862(arg1, 0, arg0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "(B)V")
	public static void method4173() {
		Static241.aClass175_35.method4294();
		Static85.aClass175_12.method4294();
	}
}
