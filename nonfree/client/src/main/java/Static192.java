import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!gn", name = "z", descriptor = "[I")
	public static int[] anIntArray441;

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
	public static int anInt7406;

	@OriginalMember(owner = "client!gn", name = "h", descriptor = "[I")
	public static final int[] anIntArray440 = new int[2048];

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIII)V")
	public static void method6451(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(12) int local12 = -arg3;
		@Pc(14) int local14 = -1;
		@Pc(27) int local27 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg3 + arg2);
		@Pc(36) int local36 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg2 - arg3);
		Static161.method2977(local36, arg1, local27, Static120.anIntArrayArray18[arg0], -126);
		while (local9 > local7) {
			local14 += 2;
			local12 += local14;
			@Pc(67) int local67;
			@Pc(71) int local71;
			@Pc(98) int local98;
			@Pc(108) int local108;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local67 = arg0 - local9;
				local71 = local9 + arg0;
				if (Static573.anInt8986 <= local71 && local67 <= Static319.anInt5445) {
					local98 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg2 + local7);
					local108 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg2 - local7);
					if (local71 <= Static319.anInt5445) {
						Static161.method2977(local108, arg1, local98, Static120.anIntArrayArray18[local71], -108);
					}
					if (local67 >= Static573.anInt8986) {
						Static161.method2977(local108, arg1, local98, Static120.anIntArrayArray18[local67], -110);
					}
				}
			}
			local7++;
			local67 = arg0 - local7;
			local71 = arg0 + local7;
			if (Static573.anInt8986 <= local71 && local67 <= Static319.anInt5445) {
				local98 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, local9 + arg2);
				local108 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg2 - local9);
				if (Static319.anInt5445 >= local71) {
					Static161.method2977(local108, arg1, local98, Static120.anIntArrayArray18[local71], -115);
				}
				if (Static573.anInt8986 <= local67) {
					Static161.method2977(local108, arg1, local98, Static120.anIntArrayArray18[local67], -122);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(III[BBII)Z")
	public static boolean method6457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg2 % 8;
		@Pc(18) int local18;
		if (local9 == 0) {
			local18 = 0;
		} else {
			local18 = 8 - local9;
		}
		@Pc(31) int local31 = -((arg4 + 8 - 1) / 8);
		@Pc(41) int local41 = -((arg2 + 8 - 1) / 8);
		for (@Pc(43) int local43 = local31; local43 < 0; local43++) {
			for (@Pc(63) int local63 = local41; local63 < 0; local63++) {
				if (arg3[arg1] == 0) {
					return true;
				}
				arg1 += 8;
			}
			arg1 -= local18;
			if (arg3[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg0;
		}
		return false;
	}
}
