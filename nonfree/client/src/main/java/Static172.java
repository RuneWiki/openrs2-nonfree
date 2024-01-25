import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!kn", name = "K", descriptor = "I")
	public static int anInt3886 = 0;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIBII)V")
	public static void method3390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg1 << 1;
		@Pc(39) int local39 = (1 - local29) * local13 + local21;
		@Pc(47) int local47 = local17 - (local29 - 1) * local25;
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = local25 * ((arg1 << 1) - 3);
		@Pc(77) int local77 = local55;
		@Pc(91) int local91 = local51 * (arg1 - 1);
		@Pc(109) int local109;
		@Pc(118) int local118;
		if (arg3 >= Static197.anInt4298 && Static38.anInt553 >= arg3) {
			local109 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg2 + arg4);
			local118 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg4 - arg2);
			Static115.method2278(Static364.anIntArrayArray57[arg3], local109, arg0, local118);
		}
		while (local9 > 0) {
			if (local39 < 0) {
				while (local39 < 0) {
					local39 += local63;
					local47 += local77;
					local7++;
					local63 += local55;
					local77 += local55;
				}
			}
			if (local47 < 0) {
				local47 += local77;
				local39 += local63;
				local7++;
				local63 += local55;
				local77 += local55;
			}
			local39 += -local91;
			local47 += -local71;
			local9--;
			local91 -= local51;
			local71 -= local51;
			local109 = arg3 - local9;
			local118 = arg3 + local9;
			if (local118 >= Static197.anInt4298 && local109 <= Static38.anInt553) {
				@Pc(222) int local222 = Static12.method187(Static108.anInt2266, Static205.anInt4504, local7 + arg4);
				@Pc(231) int local231 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg4 - local7);
				if (local109 >= Static197.anInt4298) {
					Static115.method2278(Static364.anIntArrayArray57[local109], local222, arg0, local231);
				}
				if (Static38.anInt553 >= local118) {
					Static115.method2278(Static364.anIntArrayArray57[local118], local222, arg0, local231);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IILjava/util/Random;)I")
	public static int method3391(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static214.method4055(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(45) int local45 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(48) int local48;
			do {
				local48 = arg1.nextInt();
			} while (local45 <= local48);
			return Static158.method3245(local48, arg0);
		}
	}
}
