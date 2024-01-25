import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!vo", name = "W", descriptor = "Lclient!ru;")
	public static Class3_Sub1_Sub2 aClass3_Sub1_Sub2_2;

	@OriginalMember(owner = "client!vo", name = "Q", descriptor = "I")
	public static final int anInt7343 = 328;

	@OriginalMember(owner = "client!vo", name = "Y", descriptor = "[I")
	public static final int[] anIntArray490 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILclient!ik;I)V")
	public static void method5937(@OriginalArg(1) Class3_Sub25_Sub1 arg0, @OriginalArg(2) int arg1) {
		Static40.anInt660 = 0;
		Static229.aBoolean280 = false;
		Static26.method475(arg0);
		Static271.method3766(arg0);
		if (Static229.aBoolean280) {
			System.out.println("---endgpp---");
		}
		if (arg1 != arg0.anInt4974) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt4974 + " psize:" + arg1);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIIIZ)V")
	public static void method5939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg2 << 1;
		@Pc(38) int local38 = (1 - local29) * local13 + local21;
		@Pc(47) int local47 = local17 - local25 * (local29 - 1);
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = ((arg2 << 1) - 3) * local25;
		@Pc(82) int local82 = local55;
		@Pc(88) int local88 = local51 * (arg2 - 1);
		@Pc(110) int local110;
		@Pc(119) int local119;
		if (arg3 >= Static316.anInt5349 && Static418.anInt7030 >= arg3) {
			local110 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg4 + arg0);
			local119 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg0 - arg4);
			Static201.method3084(Static296.anIntArrayArray42[arg3], local119, local110, arg1);
		}
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local47 += local82;
					local38 += local63;
					local63 += local55;
					local7++;
					local82 += local55;
				}
			}
			if (local47 < 0) {
				local47 += local82;
				local38 += local63;
				local63 += local55;
				local7++;
				local82 += local55;
			}
			local38 += -local88;
			local47 += -local71;
			local71 -= local51;
			local9--;
			local88 -= local51;
			local110 = arg3 - local9;
			local119 = arg3 + local9;
			if (local119 >= Static316.anInt5349 && local110 <= Static418.anInt7030) {
				@Pc(223) int local223 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg0 + local7);
				@Pc(231) int local231 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg0 - local7);
				if (Static316.anInt5349 <= local110) {
					Static201.method3084(Static296.anIntArrayArray42[local110], local231, local223, arg1);
				}
				if (local119 <= Static418.anInt7030) {
					Static201.method3084(Static296.anIntArrayArray42[local119], local231, local223, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "h", descriptor = "(I)V")
	public static void method5940() {
		@Pc(8) Class3_Sub5 local8 = (Class3_Sub5) Static273.aClass193_38.method4519();
		@Pc(16) boolean local16 = Static296.aClass82_16 != null || Static20.anInt6289 > 0;
		if (local16) {
			Static396.anInt6600 = 1;
		}
		if (Static310.aBoolean386 && Static137.aClass143_1.method5471(81) && Static276.anInt4608 > 2) {
			if (local16) {
				Static133.aClass3_Sub38_1 = (Class3_Sub38) Static325.aClass193_54.aClass3_198.aClass3_267.aClass3_267;
			} else {
				Static287.method5413((Class3_Sub38) Static325.aClass193_54.aClass3_198.aClass3_267.aClass3_267, local8.method5406(), local8.method5408());
			}
		} else if (local16) {
			Static133.aClass3_Sub38_1 = (Class3_Sub38) Static325.aClass193_54.aClass3_198.aClass3_267;
		} else {
			Static287.method5413((Class3_Sub38) Static325.aClass193_54.aClass3_198.aClass3_267, local8.method5406(), local8.method5408());
		}
	}

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(B)V")
	public static void method5941() {
		if (Static248.anInt4237 != -1) {
			Static188.method2953(-1, false, Static248.anInt4237, -1);
			Static248.anInt4237 = -1;
		}
	}
}
