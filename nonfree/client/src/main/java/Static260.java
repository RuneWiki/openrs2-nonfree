import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!jea", name = "d", descriptor = "I")
	public static int anInt4887;

	@OriginalMember(owner = "client!jea", name = "f", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray1;

	@OriginalMember(owner = "client!jea", name = "h", descriptor = "[I")
	public static int[] anIntArray297;

	@OriginalMember(owner = "client!jea", name = "i", descriptor = "I")
	public static int anInt4890 = 0;

	@OriginalMember(owner = "client!jea", name = "k", descriptor = "[I")
	public static final int[] anIntArray298 = new int[1];

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)I")
	public static int method4303() {
		return Static518.anInt8368 == 1 ? Static326.anInt5718 : 0;
	}

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)[Lclient!iv;")
	public static Class168[] method4304() {
		return new Class168[] { Static207.aClass168_2, Static248.aClass168_3, Static612.aClass168_5 };
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(IIIFIIZI)[I")
	public static int[] method4305(@OriginalArg(3) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class2_Sub4_Sub9 local10 = new Class2_Sub4_Sub9();
		local10.anInt2512 = 4;
		local10.anInt2514 = 8;
		local10.anInt2515 = (int) (arg0 * 4096.0F);
		local10.aBoolean201 = true;
		local10.anInt2516 = 35;
		local10.anInt2519 = 8;
		local10.method8902();
		Static267.method4404(1, 2048);
		local10.method2130(local6, 0);
		return local6;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(BIIIIII)V")
	public static void method4306(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static559.method7857(arg5);
		@Pc(8) int local8 = 0;
		@Pc(13) int local13 = arg5 - arg0;
		if (local13 < 0) {
			local13 = 0;
		}
		@Pc(30) int local30 = arg5;
		@Pc(33) int local33 = -arg5;
		@Pc(35) int local35 = local13;
		@Pc(38) int local38 = -local13;
		@Pc(40) int local40 = -1;
		@Pc(42) int local42 = -1;
		@Pc(46) int[] local46 = Static349.anIntArrayArray71[arg4];
		@Pc(51) int local51 = arg1 - local13;
		@Pc(55) int local55 = local13 + arg1;
		Static188.method3208(local51, arg2, arg1 - arg5, local46);
		Static188.method3208(local55, arg3, local51, local46);
		Static188.method3208(arg1 + arg5, arg2, local55, local46);
		while (local30 > local8) {
			local42 += 2;
			local40 += 2;
			local38 += local42;
			local33 += local40;
			if (local38 >= 0 && local35 >= 1) {
				Static299.anIntArray342[local35] = local8;
				local35--;
				local38 -= local35 << 1;
			}
			local8++;
			@Pc(133) int[] local133;
			@Pc(139) int[] local139;
			@Pc(144) int local144;
			@Pc(149) int local149;
			@Pc(189) int local189;
			@Pc(193) int local193;
			@Pc(198) int local198;
			if (local33 >= 0) {
				local30--;
				local33 -= local30 << 1;
				if (local13 <= local30) {
					local133 = Static349.anIntArrayArray71[arg4 + local30];
					local139 = Static349.anIntArrayArray71[arg4 - local30];
					local144 = arg1 + local8;
					local149 = arg1 - local8;
					Static188.method3208(local144, arg2, local149, local133);
					Static188.method3208(local144, arg2, local149, local139);
				} else {
					local133 = Static349.anIntArrayArray71[arg4 + local30];
					local139 = Static349.anIntArrayArray71[arg4 - local30];
					local144 = Static299.anIntArray342[local30];
					local149 = arg1 + local8;
					local189 = arg1 - local8;
					local193 = local144 + arg1;
					local198 = arg1 - local144;
					Static188.method3208(local198, arg2, local189, local133);
					Static188.method3208(local193, arg3, local198, local133);
					Static188.method3208(local149, arg2, local193, local133);
					Static188.method3208(local198, arg2, local189, local139);
					Static188.method3208(local193, arg3, local198, local139);
					Static188.method3208(local149, arg2, local193, local139);
				}
			}
			local133 = Static349.anIntArrayArray71[local8 + arg4];
			local139 = Static349.anIntArrayArray71[arg4 - local8];
			local144 = local30 + arg1;
			local149 = arg1 - local30;
			if (local8 >= local13) {
				Static188.method3208(local144, arg2, local149, local133);
				Static188.method3208(local144, arg2, local149, local139);
			} else {
				local189 = local35 < local8 ? Static299.anIntArray342[local8] : local35;
				local193 = arg1 + local189;
				local198 = arg1 - local189;
				Static188.method3208(local198, arg2, local149, local133);
				Static188.method3208(local193, arg3, local198, local133);
				Static188.method3208(local144, arg2, local193, local133);
				Static188.method3208(local198, arg2, local149, local139);
				Static188.method3208(local193, arg3, local198, local139);
				Static188.method3208(local144, arg2, local193, local139);
			}
		}
	}

	@OriginalMember(owner = "client!jea", name = "c", descriptor = "(I)V")
	public static void method4307() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < Static456.anInt7428; local7++) {
			for (@Pc(10) int local10 = 0; local10 < Static5.anInt112; local10++) {
				if (Static274.method4475(Static348.aClass84ArrayArrayArray5, true, local7, local10, local5)) {
					local5++;
				}
				if (local5 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(B)Z")
	public static boolean method4309() {
		return Static275.anInt5095 == 0 ? Static191.aClass2_Sub11_Sub1_2.method1530() : true;
	}
}
