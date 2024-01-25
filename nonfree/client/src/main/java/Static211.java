import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "Z")
	public static boolean aBoolean267 = false;

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_53 = new Class177(24, -1);

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
	public static int anInt4295 = 104;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZB)Z")
	public static boolean method3322(@OriginalArg(0) boolean arg0) {
		@Pc(11) boolean local11 = Static30.aClass106_3.method5945();
		if (local11 == arg0) {
			return true;
		}
		if (!arg0) {
			Static30.aClass106_3.method5961();
		} else if (!Static30.aClass106_3.method5963()) {
			arg0 = false;
		}
		if (local11 == arg0) {
			return false;
		} else {
			Static12.aClass34_Sub1_1.aBoolean453 = arg0;
			Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
			return true;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIII)V")
	public static void method3323(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(12) int local12 = -arg2;
		Static228.method3480(arg3 - arg2, arg1, Static60.anIntArrayArray14[arg0], arg2 + arg3);
		@Pc(27) int local27 = -1;
		while (local7 < local9) {
			local27 += 2;
			local12 += local27;
			local7++;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(51) int[] local51 = Static60.anIntArrayArray14[arg0 + local9];
				@Pc(57) int[] local57 = Static60.anIntArrayArray14[arg0 - local9];
				@Pc(61) int local61 = arg3 + local7;
				@Pc(65) int local65 = arg3 - local7;
				Static228.method3480(local65, arg1, local51, local61);
				Static228.method3480(local65, arg1, local57, local61);
			}
			@Pc(82) int local82 = arg3 + local9;
			@Pc(87) int local87 = arg3 - local9;
			@Pc(93) int[] local93 = Static60.anIntArrayArray14[local7 + arg0];
			@Pc(99) int[] local99 = Static60.anIntArrayArray14[arg0 - local7];
			Static228.method3480(local87, arg1, local93, local82);
			Static228.method3480(local87, arg1, local99, local82);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static414.method5610(arg8)) {
			return;
		}
		if (Static181.aClass68ArrayArray3[arg8] == null) {
			Static55.method1066(Static293.aClass68ArrayArray4[arg8], -1, arg4, arg6, arg3, arg2, arg0, arg5, arg7, arg1);
		} else {
			Static55.method1066(Static181.aClass68ArrayArray3[arg8], -1, arg4, arg6, arg3, arg2, arg0, arg5, arg7, arg1);
		}
	}
}
