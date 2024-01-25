import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "Lclient!ut;")
	public static final Class358 aClass358_3 = new Class358();

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method2277(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIBIII)V")
	public static void method2278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg0 << 1;
		@Pc(39) int local39 = local13 * (1 - local29) + local21;
		@Pc(48) int local48 = local17 - local25 * (local29 - 1);
		@Pc(56) int local56 = local13 << 2;
		@Pc(60) int local60 = local17 << 2;
		@Pc(68) int local68 = local21 * 3;
		@Pc(76) int local76 = local25 * ((arg0 << 1) - 3);
		@Pc(82) int local82 = local60;
		@Pc(88) int local88 = local56 * (arg0 - 1);
		@Pc(110) int local110;
		@Pc(118) int local118;
		if (arg3 >= Static639.anInt10384 && Static496.anInt8305 >= arg3) {
			local110 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg2 + arg1);
			local118 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg2 - arg1);
			Static197.method3240(local110, Static16.anIntArrayArray2[arg3], local118, arg4);
		}
		while (local9 > 0) {
			if (local39 < 0) {
				while (local39 < 0) {
					local48 += local82;
					local39 += local68;
					local68 += local60;
					local82 += local60;
					local7++;
				}
			}
			if (local48 < 0) {
				local39 += local68;
				local48 += local82;
				local7++;
				local68 += local60;
				local82 += local60;
			}
			local48 += -local76;
			local39 += -local88;
			local88 -= local56;
			local9--;
			local76 -= local56;
			local110 = arg3 - local9;
			local118 = local9 + arg3;
			if (local118 >= Static639.anInt10384 && local110 <= Static496.anInt8305) {
				@Pc(219) int local219 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, local7 + arg2);
				@Pc(227) int local227 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg2 - local7);
				if (local110 >= Static639.anInt10384) {
					Static197.method3240(local219, Static16.anIntArrayArray2[local110], local227, arg4);
				}
				if (local118 <= Static496.anInt8305) {
					Static197.method3240(local219, Static16.anIntArrayArray2[local118], local227, arg4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!eaa", name = "d", descriptor = "(I)V")
	public static void method2284() {
		if (Static193.anInt3730 < 0) {
			Static293.anInt5675 = -1;
			Static193.anInt3730 = 0;
			Static596.anInt3354 = -1;
		}
		if (Static330.anInt763 < Static193.anInt3730) {
			Static596.anInt3354 = -1;
			Static193.anInt3730 = Static330.anInt763;
			Static293.anInt5675 = -1;
		}
		if (Static241.anInt4462 < 0) {
			Static241.anInt4462 = 0;
			Static293.anInt5675 = -1;
			Static596.anInt3354 = -1;
		}
		if (Static330.anInt756 < Static241.anInt4462) {
			Static596.anInt3354 = -1;
			Static293.anInt5675 = -1;
			Static241.anInt4462 = Static330.anInt756;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II)V")
	public static void method2285(@OriginalArg(0) int arg0) {
		Static596.anInt3354 = -1;
		if (arg0 == 37) {
			Static330.aFloat9 = 3.0F;
		} else if (arg0 == 50) {
			Static330.aFloat9 = 4.0F;
		} else if (arg0 == 75) {
			Static330.aFloat9 = 6.0F;
		} else if (arg0 == 100) {
			Static330.aFloat9 = 8.0F;
		} else if (arg0 == 200) {
			Static330.aFloat9 = 16.0F;
		}
		Static596.anInt3354 = -1;
	}
}
