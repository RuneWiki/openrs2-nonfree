import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static628 {

	@OriginalMember(owner = "client!tu", name = "D", descriptor = "[Lclient!ug;")
	public static Class43[] aClass43Array18;

	@OriginalMember(owner = "client!tu", name = "J", descriptor = "[[I")
	public static final int[][] anIntArrayArray61 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZIIIIII)V")
	public static void method8495(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 < 512 || arg3 < 512 || (Static426.anInt6942 - 2) * 512 < arg1 || arg3 > (Static280.anInt6752 - 2) * 512) {
			Static189.anIntArray243[0] = Static189.anIntArray243[1] = -1;
			return;
		}
		@Pc(57) int local57 = Static324.method4554(arg4, arg1, arg3) - arg2;
		if (Static392.aBoolean549) {
			Static187.method2679(true);
		} else {
			Static359.aClass86_2.method7020(arg0, 0, 0);
			Static396.aClass145_6.method9656(Static359.aClass86_2);
		}
		if (Static591.aBoolean812) {
			Static396.aClass145_6.HA(arg1, local57, arg3, Static96.anInt1733, Static189.anIntArray243);
		} else {
			Static396.aClass145_6.da(arg1, local57, arg3, Static189.anIntArray243);
		}
		if (Static392.aBoolean549) {
			Static116.method1686();
		} else {
			Static359.aClass86_2.method7020(-arg0, 0, 0);
			Static396.aClass145_6.method9656(Static359.aClass86_2);
		}
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(Lclient!r;III[Z)Z")
	public static boolean method8496(@OriginalArg(0) Class2_Sub6_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static158.aClass133Array4 != Static685.aClass133Array5) {
			@Pc(12) int local12 = Static126.aClass133Array1[arg1].method8214(arg2, arg3);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class133 local19 = Static126.aClass133Array1[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method8214(arg2, arg3);
					if (arg4 != null) {
						arg4[local14] = local19.method8213(arg0, arg2, local29, arg3);
						if (!arg4[local14]) {
							continue;
						}
					}
					local19.CA(arg0, arg2, local29, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}
}
