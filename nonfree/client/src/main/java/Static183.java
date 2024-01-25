import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!gca", name = "d", descriptor = "I")
	public static int anInt3686;

	@OriginalMember(owner = "client!gca", name = "c", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_56 = new Class322(33, 6);

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)V")
	public static void method3450() {
		@Pc(15) int local15 = Static687.aClass6_Sub44_33.aClass7_Sub24_2.method7501();
		if (local15 == 0) {
			Static333.aByteArrayArrayArray15 = null;
			Static546.method7743(0);
		} else if (local15 == 1) {
			Static29.method341((byte) 0);
			Static546.method7743(512);
			if (Static272.aByteArrayArrayArray2 != null) {
				Static479.method7157();
			}
		} else {
			Static29.method341((byte) (Static227.anInt4418 - 4 & 0xFF));
			Static546.method7743(2);
		}
		Static497.anInt8378 = Static504.anInt8428;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIBII)V")
	public static void method3451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg3 << 1;
		@Pc(38) int local38 = local21 + (1 - local29) * local13;
		@Pc(47) int local47 = local17 - local25 * (local29 - 1);
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = ((arg3 << 1) - 3) * local25;
		@Pc(77) int local77 = local55;
		@Pc(105) int local105;
		@Pc(114) int local114;
		if (Static605.anInt9561 <= arg0 && Static223.anInt4380 >= arg0) {
			local105 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg2 + arg1);
			local114 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg2 - arg1);
			Static367.method5559(-7, local114, arg4, Static36.anIntArrayArray4[arg0], local105);
		}
		@Pc(130) int local130 = local51 * (arg3 - 1);
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local47 += local77;
					local38 += local63;
					local7++;
					local63 += local55;
					local77 += local55;
				}
			}
			if (local47 < 0) {
				local47 += local77;
				local38 += local63;
				local77 += local55;
				local7++;
				local63 += local55;
			}
			local38 += -local130;
			local47 += -local71;
			local9--;
			local130 -= local51;
			local71 -= local51;
			local105 = arg0 - local9;
			local114 = arg0 + local9;
			if (local114 >= Static605.anInt9561 && local105 <= Static223.anInt4380) {
				@Pc(231) int local231 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg2 + local7);
				@Pc(240) int local240 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg2 - local7);
				if (local105 >= Static605.anInt9561) {
					Static367.method5559(-7, local240, arg4, Static36.anIntArrayArray4[local105], local231);
				}
				if (Static223.anInt4380 >= local114) {
					Static367.method5559(-7, local240, arg4, Static36.anIntArrayArray4[local114], local231);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIB)Z")
	public static boolean method3452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 | Static150.method2925(arg0, arg1) || Static584.method8153(arg0, arg1);
	}
}
