import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "Lclient!fh;")
	public static Class58 aClass58_24;

	@OriginalMember(owner = "client!bc", name = "q", descriptor = "[[I")
	public static int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "F")
	public static float aFloat24;

	@OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
	public static int anInt927;

	@OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
	public static int anInt925 = 0;

	@OriginalMember(owner = "client!bc", name = "v", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray3 = new String[1000];

	@OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
	public static int anInt929 = -1;

	@OriginalMember(owner = "client!bc", name = "D", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray4 = new String[100];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIBII)V")
	public static void method758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) int local6 = arg2 + arg6;
		@Pc(14) int local14 = arg4 - arg6;
		@Pc(18) int local18 = arg3 + arg6;
		@Pc(23) int local23 = arg1 - arg6;
		@Pc(25) int local25;
		for (local25 = arg2; local25 < local6; local25++) {
			Static99.method1656(Static220.anIntArrayArray36[local25], arg0, arg3, arg1);
		}
		for (local25 = arg4; local25 > local14; local25--) {
			Static99.method1656(Static220.anIntArrayArray36[local25], arg0, arg3, arg1);
		}
		for (local25 = local6; local25 <= local14; local25++) {
			@Pc(86) int[] local86 = Static220.anIntArrayArray36[local25];
			Static99.method1656(local86, arg0, arg3, local18);
			Static99.method1656(local86, arg5, local18, local23);
			Static99.method1656(local86, arg0, local23, arg1);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIII)Z")
	public static boolean method759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9 = arg3 * Static251.anInt4795 + arg0 * Static113.anInt2272 >> 16;
		@Pc(19) int local19 = arg3 * Static113.anInt2272 - arg0 * Static251.anInt4795 >> 16;
		@Pc(29) int local29 = arg1 * Static52.anInt2247 + local19 * Static183.anInt3487 >> 16;
		@Pc(39) int local39 = arg1 * Static183.anInt3487 - local19 * Static52.anInt2247 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * Static52.anInt2247 + local19 * Static183.anInt3487 >> 16;
		@Pc(76) int local76 = arg2 * Static183.anInt3487 - local19 * Static52.anInt2247 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > arg4 && local66 > arg4) {
			return false;
		} else if (local50 < Static291.anInt5438 && local87 < Static291.anInt5438) {
			return false;
		} else if (local50 > Static157.anInt3123 && local87 > Static157.anInt3123) {
			return false;
		} else if (local56 < Static311.anInt6034 && local93 < Static311.anInt6034) {
			return false;
		} else {
			return local56 <= Static27.anInt403 || local93 <= Static27.anInt403;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
	public static void method763() {
		if (Static249.aClass103_2 != null) {
			Static249.aClass103_2.method3011();
		}
		if (Static30.aClass103_1 != null) {
			Static30.aClass103_1.method3011();
		}
	}
}
