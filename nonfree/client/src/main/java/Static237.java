import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!hv", name = "e", descriptor = "[J")
	public static long[] aLongArray4;

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "I")
	public static int anInt1804 = 0;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "Lclient!vaa;")
	public static final Class361 aClass361_9 = new Class361(9, 2);

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIII)V")
	public static void method1618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(12) int local12 = -arg3;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg3 + arg0);
		@Pc(31) int local31 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg0 - arg3);
		Static646.method7025(Static569.anIntArrayArray54[arg1], local31, local22, arg2);
		while (local7 < local9) {
			local14 += 2;
			local12 += local14;
			@Pc(63) int local63;
			@Pc(67) int local67;
			@Pc(87) int local87;
			@Pc(96) int local96;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local63 = arg1 - local9;
				local67 = local9 + arg1;
				if (local67 >= Static456.anInt7815 && local63 <= Static604.anInt10083) {
					local87 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg0 + local7);
					local96 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg0 - local7);
					if (local67 <= Static604.anInt10083) {
						Static646.method7025(Static569.anIntArrayArray54[local67], local96, local87, arg2);
					}
					if (Static456.anInt7815 <= local63) {
						Static646.method7025(Static569.anIntArrayArray54[local63], local96, local87, arg2);
					}
				}
			}
			local7++;
			local63 = arg1 - local7;
			local67 = local7 + arg1;
			if (local67 >= Static456.anInt7815 && local63 <= Static604.anInt10083) {
				local87 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg0 + local9);
				local96 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg0 - local9);
				if (Static604.anInt10083 >= local67) {
					Static646.method7025(Static569.anIntArrayArray54[local67], local96, local87, arg2);
				}
				if (local63 >= Static456.anInt7815) {
					Static646.method7025(Static569.anIntArrayArray54[local63], local96, local87, arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)[Lclient!eh;")
	public static Class103[] method1621() {
		return new Class103[] { Static106.aClass103_2, Static160.aClass103_3, Static37.aClass103_1 };
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IZ)Z")
	public static boolean method1622(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}
}
