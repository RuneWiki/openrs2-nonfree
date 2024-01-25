import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!mj", name = "H", descriptor = "[[S")
	public static short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!mj", name = "O", descriptor = "I")
	public static int anInt4046;

	@OriginalMember(owner = "client!mj", name = "Q", descriptor = "[[I")
	public static int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!mj", name = "N", descriptor = "Lclient!wi;")
	public static final Class214 aClass214_1 = new Class214(100);

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(II)V")
	public static void method3451() {
		@Pc(1) Class198 local1 = Static218.aClass198_41;
		synchronized (Static218.aClass198_41) {
			Static218.aClass198_41.method5243(5);
		}
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(IIIIII)V")
	public static void method3452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg2 << 1;
		@Pc(38) int local38 = local21 + local13 * (1 - local29);
		@Pc(47) int local47 = local17 - (local29 - 1) * local25;
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = ((arg2 << 1) - 3) * local25;
		@Pc(77) int local77 = local55;
		@Pc(83) int local83 = (arg2 - 1) * local51;
		@Pc(98) int local98;
		@Pc(107) int local107;
		if (arg4 >= Static236.anInt4721 && arg4 <= Static73.anInt1425) {
			local98 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg0 + arg1);
			local107 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg0 - arg1);
			Static162.method1731(local98, anIntArrayArray37[arg4], local107, arg3);
		}
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local47 += local77;
					local38 += local63;
					local77 += local55;
					local7++;
					local63 += local55;
				}
			}
			if (local47 < 0) {
				local47 += local77;
				local38 += local63;
				local63 += local55;
				local77 += local55;
				local7++;
			}
			local38 += -local83;
			local47 += -local71;
			local71 -= local51;
			local9--;
			local83 -= local51;
			local98 = arg4 - local9;
			local107 = arg4 + local9;
			if (Static236.anInt4721 <= local107 && Static73.anInt1425 >= local98) {
				@Pc(208) int local208 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg0 + local7);
				@Pc(216) int local216 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg0 - local7);
				if (Static236.anInt4721 <= local98) {
					Static162.method1731(local208, anIntArrayArray37[local98], local216, arg3);
				}
				if (local107 <= Static73.anInt1425) {
					Static162.method1731(local208, anIntArrayArray37[local107], local216, arg3);
				}
			}
		}
	}
}
