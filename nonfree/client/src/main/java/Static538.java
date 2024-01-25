import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!r", name = "w", descriptor = "D")
	public static double aDouble21;

	@OriginalMember(owner = "client!r", name = "v", descriptor = "Lclient!bka;")
	public static Class9 aClass9_20;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BILclient!bha;)V")
	public static void method6233(@OriginalArg(1) int arg0, @OriginalArg(2) Class28 arg1) {
		if (Static121.aBoolean189) {
			arg0 = 0;
			Static121.aBoolean189 = false;
		}
		if (Static67.aClass28_2 != null && Static67.aClass28_2.method634(arg1)) {
			return;
		}
		Static67.aClass28_2 = arg1;
		Static224.aLong143 = Static626.method8479();
		Static101.anInt1604 = arg0;
		Static483.anInt8395 = arg0;
		if (Static483.anInt8395 == 0) {
			Static450.method6668();
			return;
		}
		Static19.aFloat3 = Static643.aFloat194;
		Static274.anInt5026 = Static234.anInt4454;
		Static679.aFloat198 = Static629.aFloat191;
		Static525.aFloat163 = Static104.aFloat19;
		Static187.anInt3300 = Static312.anInt5545;
		Static39.aFloat7 = Static227.aFloat86;
		Static552.anInt9234 = Static636.anInt10300;
		Static599.aFloat183 = Static143.aFloat55;
		Static568.aFloat199 = Static311.aFloat92;
		Static626.aClass275_5 = Static492.aClass275_4;
		Static35.aClass77_1 = Static77.aClass77_4;
		if (Static492.aClass275_4 == null) {
			return;
		}
		if (Static492.aClass275_4.method6913()) {
			Static626.aClass275_5 = Static492.aClass275_4.method6912();
			Static492.aClass275_4 = Static626.aClass275_5;
		}
		if (Static492.aClass275_4 != null && Static67.aClass28_2.aClass275_1 != Static492.aClass275_4) {
			Static492.aClass275_4.method6910(Static67.aClass28_2.aClass275_1);
			return;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
	public static void method6234() {
		Static121.aBoolean189 = true;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V")
	public static void method6236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg2 << 1;
		@Pc(38) int local38 = (1 - local29) * local13 + local21;
		@Pc(47) int local47 = local17 - (local29 - 1) * local25;
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = ((arg2 << 1) - 3) * local25;
		@Pc(77) int local77 = local55;
		Static482.method7040(arg4, arg1 - arg0, Static384.anIntArrayArray38[arg3], arg1 + arg0);
		@Pc(97) int local97 = local51 * (arg2 - 1);
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local47 += local77;
					local38 += local63;
					local7++;
					local77 += local55;
					local63 += local55;
				}
			}
			if (local47 < 0) {
				local38 += local63;
				local47 += local77;
				local7++;
				local63 += local55;
				local77 += local55;
			}
			local38 += -local97;
			local47 += -local71;
			local97 -= local51;
			local9--;
			local71 -= local51;
			@Pc(177) int local177 = arg3 - local9;
			@Pc(181) int local181 = local9 + arg3;
			@Pc(186) int local186 = arg1 + local7;
			@Pc(191) int local191 = arg1 - local7;
			Static482.method7040(arg4, local191, Static384.anIntArrayArray38[local177], local186);
			Static482.method7040(arg4, local191, Static384.anIntArrayArray38[local181], local186);
		}
	}
}
