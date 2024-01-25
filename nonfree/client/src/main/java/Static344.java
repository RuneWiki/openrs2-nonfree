import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!tq", name = "w", descriptor = "Lclient!g;")
	public static Class83 aClass83_9;

	@OriginalMember(owner = "client!tq", name = "y", descriptor = "[I")
	public static int[] anIntArray764;

	@OriginalMember(owner = "client!tq", name = "v", descriptor = "I")
	public static int anInt6324 = 2;

	@OriginalMember(owner = "client!tq", name = "C", descriptor = "I")
	public static int anInt6327 = 0;

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(II)Lclient!lp;")
	public static Class2_Sub1_Sub8 method5458(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub8 local10 = (Class2_Sub1_Sub8) Static304.aClass55_3.method1250((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = Static340.aClass71_82.method1555(0, arg0 & 0x7FFF);
		} else {
			local27 = Static15.aClass71_3.method1555(0, arg0);
		}
		local10 = new Class2_Sub1_Sub8();
		if (local27 != null) {
			local10.method3514(new Class2_Sub13(local27));
		}
		if (arg0 >= 32768) {
			local10.method3521();
		}
		Static304.aClass55_3.method1248((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg3 - arg4;
		@Pc(20) int local20 = arg2 - arg4;
		@Pc(24) int local24 = arg3 * arg3;
		@Pc(28) int local28 = arg2 * arg2;
		@Pc(32) int local32 = local15 * local15;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg2 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(69) int local69 = local40 + local24 * (1 - local56);
		@Pc(78) int local78 = local28 - local44 * (local56 - 1);
		@Pc(88) int local88 = local32 * (1 - local60) + local48;
		@Pc(96) int local96 = local36 - (local60 - 1) * local52;
		@Pc(105) int local105 = local24 << 2;
		@Pc(109) int local109 = local28 << 2;
		@Pc(113) int local113 = local32 << 2;
		@Pc(117) int local117 = local36 << 2;
		@Pc(121) int local121 = local40 * 3;
		@Pc(127) int local127 = (local56 - 3) * local44;
		@Pc(131) int local131 = local48 * 3;
		@Pc(137) int local137 = local52 * (local60 - 3);
		@Pc(139) int local139 = local109;
		@Pc(145) int local145 = (arg2 - 1) * local105;
		@Pc(147) int local147 = local117;
		@Pc(153) int local153 = local113 * (local20 - 1);
		@Pc(172) int local172;
		@Pc(180) int local180;
		@Pc(189) int local189;
		@Pc(197) int local197;
		if (arg0 >= Static313.anInt5542 && Static345.anInt6084 >= arg0) {
			@Pc(163) int[] local163 = Static267.anIntArrayArray38[arg0];
			local172 = Static355.method5388(Static332.anInt5823, arg5 - arg3, Static202.anInt3722);
			local180 = Static355.method5388(Static332.anInt5823, arg3 + arg5, Static202.anInt3722);
			local189 = Static355.method5388(Static332.anInt5823, arg5 - local15, Static202.anInt3722);
			local197 = Static355.method5388(Static332.anInt5823, local15 + arg5, Static202.anInt3722);
			Static264.method4096(local163, arg6, local189, local172);
			Static264.method4096(local163, arg1, local197, local189);
			Static264.method4096(local163, arg6, local180, local197);
		}
		while (local9 > 0) {
			@Pc(224) boolean local224 = local20 >= local9;
			if (local69 < 0) {
				while (local69 < 0) {
					local78 += local139;
					local69 += local121;
					local139 += local109;
					local121 += local109;
					local7++;
				}
			}
			if (local224) {
				if (local88 < 0) {
					while (local88 < 0) {
						local88 += local131;
						local96 += local147;
						local131 += local117;
						local147 += local117;
						local11++;
					}
				}
				if (local96 < 0) {
					local88 += local131;
					local96 += local147;
					local147 += local117;
					local11++;
					local131 += local117;
				}
				local96 += -local137;
				local88 += -local153;
				local153 -= local113;
				local137 -= local113;
			}
			if (local78 < 0) {
				local69 += local121;
				local78 += local139;
				local121 += local109;
				local139 += local109;
				local7++;
			}
			local69 += -local145;
			local78 += -local127;
			local127 -= local105;
			local9--;
			local145 -= local105;
			local172 = arg0 - local9;
			local180 = arg0 + local9;
			if (Static313.anInt5542 <= local180 && Static345.anInt6084 >= local172) {
				local189 = Static355.method5388(Static332.anInt5823, arg5 + local7, Static202.anInt3722);
				local197 = Static355.method5388(Static332.anInt5823, arg5 - local7, Static202.anInt3722);
				if (local224) {
					@Pc(427) int local427 = Static355.method5388(Static332.anInt5823, local11 + arg5, Static202.anInt3722);
					@Pc(435) int local435 = Static355.method5388(Static332.anInt5823, arg5 - local11, Static202.anInt3722);
					@Pc(442) int[] local442;
					if (Static313.anInt5542 <= local172) {
						local442 = Static267.anIntArrayArray38[local172];
						Static264.method4096(local442, arg6, local435, local197);
						Static264.method4096(local442, arg1, local427, local435);
						Static264.method4096(local442, arg6, local189, local427);
					}
					if (local180 <= Static345.anInt6084) {
						local442 = Static267.anIntArrayArray38[local180];
						Static264.method4096(local442, arg6, local435, local197);
						Static264.method4096(local442, arg1, local427, local435);
						Static264.method4096(local442, arg6, local189, local427);
					}
				} else {
					if (local172 >= Static313.anInt5542) {
						Static264.method4096(Static267.anIntArrayArray38[local172], arg6, local189, local197);
					}
					if (Static345.anInt6084 >= local180) {
						Static264.method4096(Static267.anIntArrayArray38[local180], arg6, local189, local197);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIILclient!we;Lclient!we;)V")
	public static void method5461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class12_Sub4 arg3, @OriginalArg(4) Class12_Sub4 arg4) {
		@Pc(4) Class227 local4 = Static115.method2162(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass12_Sub4_3 = arg3;
			local4.aClass12_Sub4_2 = arg4;
		}
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(Z)V")
	public static void method5462() {
		Static236.aClass246_5.method5685();
		Static67.aClass108_3.method2463();
		Static8.aClass40_1.method917();
		Static11.aClass123_5.method2699();
		Static274.aClass151_4.method3708();
		Static106.aClass250_1.method5725();
		Static351.aClass175_3.method4105();
		Static168.aClass74_1.method1767();
		Static130.aClass162_1.method3874();
		Static235.aClass25_1.method678();
		Static225.aClass47_1.method1073();
		Static201.aClass181_6.method4315();
		Static240.aClass211_4.method5052();
		Static284.aClass249_1.method5723();
		Static82.aClass184_1.method4404();
		Static189.aClass119_3.method2670();
		Static80.aClass171_1.method4052();
		Static336.aClass156_1.method3776();
		Static391.aClass194_2.method4726();
		Static283.aClass223_1.method5292();
		Static261.method4078();
		Static52.method3352();
		Static119.method2189();
		Static55.method1064();
		Static142.aClass154_24.method3746();
		Static195.aClass154_25.method3746();
		Static69.aClass154_5.method3746();
		Static363.aClass154_49.method3746();
		Static157.aClass154_16.method3746();
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZI)V")
	public static void method5463(@OriginalArg(1) int arg0) {
		if (!Static180.aBoolean232) {
			arg0 = -1;
		}
		if (Static191.anInt3365 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(23) Class94 local23 = Static391.aClass194_2.method4729(arg0);
			@Pc(27) Class224 local27 = local23.method2254();
			if (local27 == null) {
				arg0 = -1;
			} else {
				Static92.aClass53_2.method1188(local27.method5309(), Static170.aCanvas4, local27.method5313(), local27.method5307(), new Point(local23.anInt2372, local23.anInt2379));
				Static191.anInt3365 = arg0;
			}
		}
		if (arg0 == -1 && Static191.anInt3365 != -1) {
			Static92.aClass53_2.method1188(-1, Static170.aCanvas4, -1, null, new Point());
			Static191.anInt3365 = -1;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IC)Z")
	public static boolean method5464(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
