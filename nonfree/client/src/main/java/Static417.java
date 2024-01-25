import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!ou", name = "db", descriptor = "[[Lclient!ig;")
	public static Class13_Sub1[][] aClass13_Sub1ArrayArray2;

	@OriginalMember(owner = "client!ou", name = "X", descriptor = "S")
	public static short aShort89 = 256;

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(II)I")
	public static int method5574(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Z)[I")
	public static int[] method5576() {
		return new int[] { Static114.anInt2095, Static397.anInt6240, Static39.anInt780 };
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIIII)V")
	public static void method5580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(12) int local12 = -arg2;
		@Pc(22) int local22 = -1;
		Static134.method1841(Static543.anIntArrayArray57[arg0], arg3 - arg2, arg2 + arg3, arg1);
		while (local9 > local7) {
			local22 += 2;
			local7++;
			local12 += local22;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(61) int[] local61 = Static543.anIntArrayArray57[arg0 + local9];
				@Pc(68) int[] local68 = Static543.anIntArrayArray57[arg0 - local9];
				@Pc(73) int local73 = arg3 + local7;
				@Pc(78) int local78 = arg3 - local7;
				Static134.method1841(local61, local78, local73, arg1);
				Static134.method1841(local68, local78, local73, arg1);
			}
			@Pc(95) int local95 = arg3 + local9;
			@Pc(99) int local99 = arg3 - local9;
			@Pc(106) int[] local106 = Static543.anIntArrayArray57[arg0 + local7];
			@Pc(112) int[] local112 = Static543.anIntArrayArray57[arg0 - local7];
			Static134.method1841(local106, local99, local95, arg1);
			Static134.method1841(local112, local99, local95, arg1);
		}
	}
}
