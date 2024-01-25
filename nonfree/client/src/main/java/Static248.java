import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!kg", name = "P", descriptor = "Lclient!dda;")
	public static Class53 aClass53_78;

	@OriginalMember(owner = "client!kg", name = "Q", descriptor = "I")
	public static int anInt4541;

	@OriginalMember(owner = "client!kg", name = "R", descriptor = "Lclient!lt;")
	public static Class179 aClass179_16;

	@OriginalMember(owner = "client!kg", name = "O", descriptor = "I")
	public static int anInt4540 = 0;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIBII)V")
	public static void method3943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(12) int local12 = -arg3;
		Static403.method6377(arg2, Static130.anIntArrayArray89[arg0], arg1 + arg3, arg1 - arg3);
		@Pc(26) int local26 = -1;
		while (local7 < local9) {
			local26 += 2;
			local7++;
			local12 += local26;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(49) int[] local49 = Static130.anIntArrayArray89[local9 + arg0];
				@Pc(56) int[] local56 = Static130.anIntArrayArray89[arg0 - local9];
				@Pc(60) int local60 = arg1 + local7;
				@Pc(65) int local65 = arg1 - local7;
				Static403.method6377(arg2, local49, local60, local65);
				Static403.method6377(arg2, local56, local60, local65);
			}
			@Pc(82) int local82 = arg1 + local9;
			@Pc(86) int local86 = arg1 - local9;
			@Pc(92) int[] local92 = Static130.anIntArrayArray89[local7 + arg0];
			@Pc(99) int[] local99 = Static130.anIntArrayArray89[arg0 - local7];
			Static403.method6377(arg2, local92, local82, local86);
			Static403.method6377(arg2, local99, local82, local86);
		}
	}
}
