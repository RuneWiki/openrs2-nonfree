import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IZ)Z")
	public static boolean method5965(@OriginalArg(1) boolean arg0) {
		@Pc(12) boolean local12 = Static153.aClass22_4.method9332();
		if (arg0 == local12) {
			return true;
		}
		if (!arg0) {
			Static153.aClass22_4.method9372();
		} else if (!Static153.aClass22_4.method9365()) {
			arg0 = false;
		}
		if (local12 == arg0) {
			return false;
		} else {
			Static580.aClass3_Sub22_24.method2423(arg0 ? 1 : 0, Static580.aClass3_Sub22_24.aClass21_Sub19_1);
			Static124.method2284();
			return true;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIII)Lclient!kt;")
	public static Class9_Sub1_Sub1_Sub2 method5966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class364 local13 = Static448.aClass364ArrayArrayArray2[arg2][arg1][arg0];
		if (local13 == null) {
			return null;
		}
		@Pc(20) Class9_Sub1_Sub1_Sub2 local20 = null;
		@Pc(22) int local22 = -1;
		for (@Pc(25) Class181 local25 = local13.aClass181_3; local25 != null; local25 = local25.aClass181_2) {
			@Pc(36) Class9_Sub1_Sub1 local36 = local25.aClass9_Sub1_Sub1_1;
			if (local36 instanceof Class9_Sub1_Sub1_Sub2) {
				@Pc(42) Class9_Sub1_Sub1_Sub2 local42 = (Class9_Sub1_Sub1_Sub2) local36;
				@Pc(52) int local52 = local42.method7485() * 256 + 252 - 256;
				@Pc(60) int local60 = local42.anInt10694 - local52 >> 9;
				@Pc(67) int local67 = local42.anInt10695 - local52 >> 9;
				@Pc(75) int local75 = local42.anInt10694 + local52 >> 9;
				@Pc(82) int local82 = local52 + local42.anInt10695 >> 9;
				if (local60 <= arg1 && arg0 >= local67 && arg1 <= local75 && arg0 <= local82) {
					@Pc(126) int local126 = (local75 + 1 - arg1) * (-arg0 + (local82 - -1));
					if (local22 < local126) {
						local20 = local42;
						local22 = local126;
					}
				}
			}
		}
		return local20;
	}
}
