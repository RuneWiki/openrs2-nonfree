import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static640 {

	@OriginalMember(owner = "client!wr", name = "q", descriptor = "Lclient!wu;")
	public static Class380 aClass380_136;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!vj;I)Lclient!mga;")
	public static Class221 method8596(@OriginalArg(0) Class2_Sub22 arg0) {
		@Pc(12) int local12 = arg0.method8542();
		return new Class221(local12);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZIIIII)V")
	public static void method8598(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg2 << 1;
		@Pc(38) int local38 = local13 * (1 - local29) + local21;
		@Pc(47) int local47 = local17 - (local29 - 1) * local25;
		@Pc(51) int local51 = local13 << 2;
		@Pc(60) int local60 = local17 << 2;
		@Pc(68) int local68 = local21 * 3;
		@Pc(76) int local76 = ((arg2 << 1) - 3) * local25;
		@Pc(82) int local82 = local60;
		@Pc(97) int local97;
		@Pc(105) int local105;
		if (Static257.anInt4068 <= arg4 && Static67.anInt1214 >= arg4) {
			local97 = Static414.method5547(arg3 + arg0, Static379.anInt5914, Static624.anInt10032);
			local105 = Static414.method5547(arg3 - arg0, Static379.anInt5914, Static624.anInt10032);
			Static134.method1841(Static543.anIntArrayArray57[arg4], local105, local97, arg1);
		}
		@Pc(119) int local119 = local51 * (arg2 - 1);
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local68;
					local47 += local82;
					local7++;
					local82 += local60;
					local68 += local60;
				}
			}
			if (local47 < 0) {
				local38 += local68;
				local47 += local82;
				local68 += local60;
				local7++;
				local82 += local60;
			}
			local38 += -local119;
			local47 += -local76;
			local76 -= local51;
			local9--;
			local119 -= local51;
			local97 = arg4 - local9;
			local105 = local9 + arg4;
			if (local105 >= Static257.anInt4068 && Static67.anInt1214 >= local97) {
				@Pc(212) int local212 = Static414.method5547(local7 + arg3, Static379.anInt5914, Static624.anInt10032);
				@Pc(221) int local221 = Static414.method5547(arg3 - local7, Static379.anInt5914, Static624.anInt10032);
				if (Static257.anInt4068 <= local97) {
					Static134.method1841(Static543.anIntArrayArray57[local97], local221, local212, arg1);
				}
				if (Static67.anInt1214 >= local105) {
					Static134.method1841(Static543.anIntArrayArray57[local105], local221, local212, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IZILclient!paa;I)V")
	public static void method8599(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class261 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg2.anInt6595;
		if (arg2.aByte94 == 0) {
			arg2.anInt6595 = arg2.anInt6604;
		} else if (arg2.aByte94 == 1) {
			arg2.anInt6595 = arg0 - arg2.anInt6604;
		} else if (arg2.aByte94 == 2) {
			arg2.anInt6595 = arg0 * arg2.anInt6604 >> 14;
		}
		@Pc(55) int local55 = arg2.anInt6622;
		if (arg2.lb == 0) {
			arg2.anInt6622 = arg2.anInt6668;
		} else if (arg2.lb == 1) {
			arg2.anInt6622 = arg3 - arg2.anInt6668;
		} else if (arg2.lb == 2) {
			arg2.anInt6622 = arg3 * arg2.anInt6668 >> 14;
		}
		if (arg2.aByte94 == 4) {
			arg2.anInt6595 = arg2.anInt6574 * arg2.anInt6622 / arg2.anInt6648;
		}
		if (arg2.lb == 4) {
			arg2.anInt6622 = arg2.anInt6595 * arg2.anInt6648 / arg2.anInt6574;
		}
		if (Static488.aBoolean602 && (Static76.method1071(arg2).anInt8108 != 0 || arg2.anInt6635 == 0)) {
			if (arg2.anInt6622 < 5 && arg2.anInt6595 < 5) {
				arg2.anInt6622 = 5;
				arg2.anInt6595 = 5;
			} else {
				if (arg2.anInt6595 <= 0) {
					arg2.anInt6595 = 5;
				}
				if (arg2.anInt6622 <= 0) {
					arg2.anInt6622 = 5;
				}
			}
		}
		if (Static476.anInt7607 == arg2.anInt6573) {
			Static352.aClass261_7 = arg2;
		}
		if (arg1 && arg2.anObjectArray29 != null && (arg2.anInt6595 != local8 || local55 != arg2.anInt6622)) {
			@Pc(191) Class2_Sub46 local191 = new Class2_Sub46();
			local191.aClass261_10 = arg2;
			local191.anObjectArray32 = arg2.anObjectArray29;
			Static122.aClass109_13.method2323(local191);
		}
	}
}
