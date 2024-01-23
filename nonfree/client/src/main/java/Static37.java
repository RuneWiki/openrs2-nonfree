import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!d", name = "x", descriptor = "Lclient!wd;")
	public static Class111 aClass111_5;

	@OriginalMember(owner = "client!d", name = "C", descriptor = "[I")
	public static int[] anIntArray108;

	@OriginalMember(owner = "client!d", name = "y", descriptor = "[I")
	public static int[] anIntArray107 = new int[100];

	@OriginalMember(owner = "client!d", name = "A", descriptor = "Lclient!he;")
	public static Class44 aClass44_9 = new Class44();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIBIIII)V")
	public static void method493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg3 - arg4;
		Static62.method1006(arg3);
		if (local9 < 0) {
			local9 = 0;
		}
		@Pc(18) int local18 = 0;
		@Pc(21) int local21 = -arg3;
		@Pc(23) int local23 = arg3;
		@Pc(26) int local26 = -local9;
		@Pc(48) int local48;
		@Pc(56) int local56;
		@Pc(64) int local64;
		@Pc(72) int local72;
		if (Static73.anInt1576 <= arg0 && arg0 <= Static137.anInt3137) {
			@Pc(40) int[] local40 = Static183.anIntArrayArray40[arg0];
			local48 = Static80.method1342(arg1 - arg3, Static6.anInt187, Static101.anInt2213);
			local56 = Static80.method1342(arg1 + arg3, Static6.anInt187, Static101.anInt2213);
			local64 = Static80.method1342(arg1 - local9, Static6.anInt187, Static101.anInt2213);
			local72 = Static80.method1342(local9 + arg1, Static6.anInt187, Static101.anInt2213);
			Static221.method3893(arg2, local48, local40, local64);
			Static221.method3893(arg5, local64, local40, local72);
			Static221.method3893(arg2, local72, local40, local56);
		}
		@Pc(92) int local92 = local9;
		@Pc(94) int local94 = -1;
		@Pc(96) int local96 = -1;
		while (local23 > local18) {
			local96 += 2;
			local26 += local96;
			if (local26 >= 0 && local92 >= 1) {
				local92--;
				Static51.anIntArray147[local92] = local18;
				local26 -= local92 << 1;
			}
			local94 += 2;
			local21 += local94;
			local18++;
			@Pc(197) int local197;
			@Pc(206) int local206;
			@Pc(213) int[] local213;
			@Pc(147) int local147;
			if (local21 >= 0) {
				local23--;
				local21 -= local23 << 1;
				local147 = arg0 - local23;
				local48 = local23 + arg0;
				if (local48 >= Static73.anInt1576 && local147 <= Static137.anInt3137) {
					if (local9 > local23) {
						local56 = Static51.anIntArray147[local23];
						local64 = Static80.method1342(arg1 + local18, Static6.anInt187, Static101.anInt2213);
						local72 = Static80.method1342(arg1 - local18, Static6.anInt187, Static101.anInt2213);
						local197 = Static80.method1342(local56 + arg1, Static6.anInt187, Static101.anInt2213);
						local206 = Static80.method1342(arg1 - local56, Static6.anInt187, Static101.anInt2213);
						if (local48 <= Static137.anInt3137) {
							local213 = Static183.anIntArrayArray40[local48];
							Static221.method3893(arg2, local72, local213, local206);
							Static221.method3893(arg5, local206, local213, local197);
							Static221.method3893(arg2, local197, local213, local64);
						}
						if (Static73.anInt1576 <= local147) {
							local213 = Static183.anIntArrayArray40[local147];
							Static221.method3893(arg2, local72, local213, local206);
							Static221.method3893(arg5, local206, local213, local197);
							Static221.method3893(arg2, local197, local213, local64);
						}
					} else {
						local56 = Static80.method1342(local18 + arg1, Static6.anInt187, Static101.anInt2213);
						local64 = Static80.method1342(arg1 - local18, Static6.anInt187, Static101.anInt2213);
						if (Static137.anInt3137 >= local48) {
							Static221.method3893(arg2, local64, Static183.anIntArrayArray40[local48], local56);
						}
						if (local147 >= Static73.anInt1576) {
							Static221.method3893(arg2, local64, Static183.anIntArrayArray40[local147], local56);
						}
					}
				}
			}
			local147 = arg0 - local18;
			local48 = local18 + arg0;
			if (local48 >= Static73.anInt1576 && Static137.anInt3137 >= local147) {
				local64 = arg1 - local23;
				local56 = arg1 + local23;
				if (local56 >= Static6.anInt187 && local64 <= Static101.anInt2213) {
					local56 = Static80.method1342(local56, Static6.anInt187, Static101.anInt2213);
					local64 = Static80.method1342(local64, Static6.anInt187, Static101.anInt2213);
					if (local18 < local9) {
						local72 = local18 > local92 ? Static51.anIntArray147[local18] : local92;
						local197 = Static80.method1342(local72 + arg1, Static6.anInt187, Static101.anInt2213);
						local206 = Static80.method1342(arg1 - local72, Static6.anInt187, Static101.anInt2213);
						if (Static137.anInt3137 >= local48) {
							local213 = Static183.anIntArrayArray40[local48];
							Static221.method3893(arg2, local64, local213, local206);
							Static221.method3893(arg5, local206, local213, local197);
							Static221.method3893(arg2, local197, local213, local56);
						}
						if (Static73.anInt1576 <= local147) {
							local213 = Static183.anIntArrayArray40[local147];
							Static221.method3893(arg2, local64, local213, local206);
							Static221.method3893(arg5, local206, local213, local197);
							Static221.method3893(arg2, local197, local213, local56);
						}
					} else {
						if (Static137.anInt3137 >= local48) {
							Static221.method3893(arg2, local64, Static183.anIntArrayArray40[local48], local56);
						}
						if (Static73.anInt1576 <= local147) {
							Static221.method3893(arg2, local64, Static183.anIntArrayArray40[local147], local56);
						}
					}
				}
			}
		}
	}
}
