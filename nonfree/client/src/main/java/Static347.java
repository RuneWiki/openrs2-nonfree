import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "Lclient!ef;")
	public static final Class89 aClass89_1 = Static211.method4173();

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIBII)Z")
	public static boolean method5936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg3; local12 <= arg1; local12++) {
			for (@Pc(16) int local16 = arg0; local16 <= arg4; local16++) {
				if (arg2 == Static198.anIntArrayArray19[local12][local16] && Static345.anIntArrayArray34[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIZBIZ)V")
	public static void method5937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg2 <= arg1) {
			return;
		}
		@Pc(18) int local18 = (arg2 + arg1) / 2;
		@Pc(20) int local20 = arg1;
		@Pc(24) Class206_Sub1 local24 = Static281.aClass206_Sub1Array1[local18];
		Static281.aClass206_Sub1Array1[local18] = Static281.aClass206_Sub1Array1[arg2];
		Static281.aClass206_Sub1Array1[arg2] = local24;
		for (@Pc(36) int local36 = arg1; local36 < arg2; local36++) {
			if (Static386.method6315(arg4, local24, arg0, arg5, arg3, Static281.aClass206_Sub1Array1[local36]) <= 0) {
				@Pc(53) Class206_Sub1 local53 = Static281.aClass206_Sub1Array1[local36];
				Static281.aClass206_Sub1Array1[local36] = Static281.aClass206_Sub1Array1[local20];
				Static281.aClass206_Sub1Array1[local20++] = local53;
			}
		}
		Static281.aClass206_Sub1Array1[arg2] = Static281.aClass206_Sub1Array1[local20];
		Static281.aClass206_Sub1Array1[local20] = local24;
		method5937(arg0, arg1, local20 - 1, arg3, arg4, arg5);
		method5937(arg0, local20 + 1, arg2, arg3, arg4, arg5);
	}
}
