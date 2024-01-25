import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!qs", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray67;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_76 = new Class243(18, 2);

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
	public static final int anInt7608 = 1338;

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "Z")
	public static boolean aBoolean564 = false;

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_149 = new Class239(13, 8);

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I[IIBI)V")
	public static void method6377(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		arg3--;
		@Pc(17) int local17 = arg2 - 1;
		@Pc(20) int local20 = local17 - 7;
		while (arg3 < local20) {
			@Pc(24) int local24 = arg3 + 1;
			arg1[local24] = arg0;
			@Pc(29) int local29 = local24 + 1;
			arg1[local29] = arg0;
			@Pc(34) int local34 = local29 + 1;
			arg1[local34] = arg0;
			@Pc(39) int local39 = local34 + 1;
			arg1[local39] = arg0;
			@Pc(44) int local44 = local39 + 1;
			arg1[local44] = arg0;
			@Pc(49) int local49 = local44 + 1;
			arg1[local49] = arg0;
			@Pc(54) int local54 = local49 + 1;
			arg1[local54] = arg0;
			arg3 = local54 + 1;
			arg1[arg3] = arg0;
		}
		while (arg3 < local17) {
			arg3++;
			arg1[arg3] = arg0;
		}
	}
}
