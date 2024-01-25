import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!sm", name = "o", descriptor = "Lclient!wu;")
	public static Class380 aClass380_94;

	@OriginalMember(owner = "client!sm", name = "C", descriptor = "J")
	public static long aLong170;

	@OriginalMember(owner = "client!sm", name = "r", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_82 = new Class179(64, -1);

	@OriginalMember(owner = "client!sm", name = "A", descriptor = "I")
	public static int anInt5960 = -1;

	@OriginalMember(owner = "client!sm", name = "B", descriptor = "[[I")
	public static final int[][] anIntArrayArray39 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)Lclient!gfa;")
	public static Class2_Sub14 method5093() {
		if (Static193.aClass109_9 == null || Static487.aClass140_1 == null) {
			return null;
		}
		Static487.aClass140_1.method2962(Static193.aClass109_9);
		@Pc(26) Class2_Sub14 local26 = (Class2_Sub14) Static487.aClass140_1.method2965();
		if (local26 == null) {
			return null;
		} else {
			@Pc(36) Class172 local36 = Static193.aClass197_2.method4161(local26.anInt3128);
			return local36 != null && local36.aBoolean296 && local36.method3771(Static193.anInterface1_2) ? local26 : Static248.method3410();
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BI[BIIII)Z")
	public static boolean method5094(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg2 % 8;
		@Pc(19) int local19;
		if (local9 == 0) {
			local19 = 0;
		} else {
			local19 = 8 - local9;
		}
		@Pc(33) int local33 = -((arg3 + 8 - 1) / 8);
		@Pc(43) int local43 = -((arg2 + 8 - 1) / 8);
		for (@Pc(50) int local50 = local33; local50 < 0; local50++) {
			for (@Pc(54) int local54 = local43; local54 < 0; local54++) {
				if (arg0[arg1] == 0) {
					return true;
				}
				arg1 += 8;
			}
			arg1 -= local19;
			if (arg0[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg4;
		}
		return false;
	}
}
