import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!cp", name = "f", descriptor = "Lclient!et;")
	public static Class96 aClass96_1;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "Lclient!lh;")
	public static final Class4_Sub28 aClass4_Sub28_1 = new Class4_Sub28(0, 0);

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "Z")
	public static boolean aBoolean137 = false;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIIII)V")
	public static void method1298(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = arg2;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = arg2 * arg2;
		@Pc(25) int local25 = local21 << 1;
		@Pc(29) int local29 = local17 << 1;
		@Pc(33) int local33 = arg2 << 1;
		@Pc(42) int local42 = (1 - local33) * local17 + local25;
		@Pc(50) int local50 = local21 - (local33 - 1) * local29;
		@Pc(54) int local54 = local17 << 2;
		@Pc(58) int local58 = local21 << 2;
		@Pc(66) int local66 = local25 * 3;
		@Pc(74) int local74 = ((arg2 << 1) - 3) * local29;
		@Pc(80) int local80 = local58;
		@Pc(94) int local94;
		@Pc(103) int local103;
		if (arg4 >= Static252.anInt4971 && arg4 <= Static359.anInt6232) {
			local94 = Static572.method7817(Static68.anInt1306, arg1 + arg3, Static589.anInt9684);
			local103 = Static572.method7817(Static68.anInt1306, arg3 - arg1, Static589.anInt9684);
			Static336.method5023(arg0, local94, Static383.anIntArrayArray62[arg4], local103);
		}
		@Pc(117) int local117 = local54 * (arg2 - 1);
		while (local13 > 0) {
			if (local42 < 0) {
				while (local42 < 0) {
					local42 += local66;
					local50 += local80;
					local66 += local58;
					local11++;
					local80 += local58;
				}
			}
			if (local50 < 0) {
				local50 += local80;
				local42 += local66;
				local11++;
				local80 += local58;
				local66 += local58;
			}
			local42 += -local117;
			local50 += -local74;
			local13--;
			local117 -= local54;
			local74 -= local54;
			local94 = arg4 - local13;
			local103 = local13 + arg4;
			if (local103 >= Static252.anInt4971 && Static359.anInt6232 >= local94) {
				@Pc(209) int local209 = Static572.method7817(Static68.anInt1306, local11 + arg3, Static589.anInt9684);
				@Pc(218) int local218 = Static572.method7817(Static68.anInt1306, arg3 - local11, Static589.anInt9684);
				if (local94 >= Static252.anInt4971) {
					Static336.method5023(arg0, local209, Static383.anIntArrayArray62[local94], local218);
				}
				if (local103 <= Static359.anInt6232) {
					Static336.method5023(arg0, local209, Static383.anIntArrayArray62[local103], local218);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(III)Z")
	public static boolean method1301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static299.method4652(arg1, arg0) | (arg0 & 0x2000) != 0 | Static313.method4800(arg0, arg1)) & Static344.method5100(arg0, arg1);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IBI)V")
	public static void method1302(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static195.aClass196_5.method4386(Static275.aClass198_23.method4407(Static56.anInt953));
		@Pc(24) int local24;
		for (@Pc(18) Class4_Sub18 local18 = (Class4_Sub18) Static354.aClass124_32.method3267(); local18 != null; local18 = (Class4_Sub18) Static354.aClass124_32.method3273()) {
			local24 = Static1.method43(local18);
			if (local13 < local24) {
				local13 = local24;
			}
		}
		local13 += 8;
		local24 = Static300.anInt5730 * 16 + 21;
		@Pc(53) int local53 = arg0 - local13 / 2;
		if (Static2.anInt29 < local13 + local53) {
			local53 = Static2.anInt29 - local13;
		}
		if (local53 < 0) {
			local53 = 0;
		}
		@Pc(73) int local73 = arg1;
		if (Static19.anInt390 < local24 + arg1) {
			local73 = Static19.anInt390 - local24;
		}
		Static473.anInt7981 = local53;
		if (local73 < 0) {
			local73 = 0;
		}
		Static100.anInt9640 = local13;
		Static333.anInt5926 = local73;
		Static325.aBoolean431 = true;
		Static35.anInt711 = Static300.anInt5730 * 16 + (Static272.aBoolean390 ? 26 : 22);
	}
}
