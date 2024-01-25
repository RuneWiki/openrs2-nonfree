import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "[J")
	public static long[] aLongArray20;

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "Lclient!wu;")
	public static Class380 aClass380_65;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
	public static void method3555() {
		@Pc(16) byte[] local16;
		if (Static288.anObject8 == null) {
			@Pc(9) Class38_Sub1_Sub2 local9 = new Class38_Sub1_Sub2();
			local16 = local9.method5567();
			Static288.anObject8 = Static253.method3515(local16);
		}
		if (Static372.anObject14 == null) {
			@Pc(32) Class38_Sub2_Sub2 local32 = new Class38_Sub2_Sub2();
			local16 = local32.method4313();
			Static372.anObject14 = Static253.method3515(local16);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIZIIIIII)Z")
	public static boolean method3556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static355.method4777(arg5, arg7, arg1)) {
			return false;
		}
		@Pc(20) int local20 = Static421.anIntArray490[2];
		@Pc(24) int local24 = Static421.anIntArray490[0];
		@Pc(28) int local28 = Static421.anIntArray490[1];
		if (!Static355.method4777(arg3, arg2, arg6)) {
			return false;
		}
		@Pc(40) int local40 = Static421.anIntArray490[2];
		@Pc(44) int local44 = Static421.anIntArray490[0];
		@Pc(48) int local48 = Static421.anIntArray490[1];
		if (Static355.method4777(arg8, arg4, arg0)) {
			@Pc(60) int local60 = Static421.anIntArray490[2];
			@Pc(64) int local64 = Static421.anIntArray490[1];
			@Pc(68) int local68 = Static421.anIntArray490[0];
			return Static313.method4244(local60, local48, local20, local64, local28, local44, local40, local68, local24);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method3557(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static124.anInt2182; local16++) {
			if (arg0.equalsIgnoreCase(Static55.aStringArray5[local16])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static198.aStringArray40[local16])) {
				return true;
			}
		}
		return false;
	}
}
