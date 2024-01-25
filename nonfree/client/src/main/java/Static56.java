import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
	public static int anInt1065;

	@OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
	public static int anInt1067;

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "Lclient!wq;")
	public static final Class269 aClass269_9 = new Class269(6, 2);

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIZ)V")
	public static void method980(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static69.method1137(arg2)) {
			Static392.method5129(-1, arg0, arg1, arg3, Static87.aClass124ArrayArray7[arg2]);
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIZII)V")
	public static void method981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (!arg2 && arg1 == Static432.anInt7295 && Static414.anInt6796 == arg3 && (Static456.anInt7534 == Static265.anInt4807 || Static453.aClass136_Sub1_1.method3522(Static14.anInt293))) {
			return;
		}
		Static432.anInt7295 = arg1;
		Static414.anInt6796 = arg3;
		Static456.anInt7534 = Static265.anInt4807;
		if (Static453.aClass136_Sub1_1.method3522(Static14.anInt293)) {
			Static456.anInt7534 = 0;
		}
		Static203.method4783(arg0);
		Static163.method4683(true, Static437.aClass76_4, Static277.aClass119_130.method2673(Static394.anInt6582));
		@Pc(54) int local54 = Static199.anInt3480;
		@Pc(56) int local56 = Static164.anInt2731;
		Static199.anInt3480 = (Static432.anInt7295 - (Static296.anInt5187 >> 4)) * 8;
		Static164.anInt2731 = (Static414.anInt6796 - (Static206.anInt3607 >> 4)) * 8;
		Static436.aClass1_Sub5_Sub18_3 = Static167.method1776(Static432.anInt7295 * 8, Static414.anInt6796 * 8);
		Static72.aClass100_1 = null;
		@Pc(89) int local89 = Static199.anInt3480 - local54;
		@Pc(93) int local93 = Static164.anInt2731 - local56;
		@Pc(106) int local106;
		@Pc(114) int local114;
		if (arg0 == 10) {
			for (local106 = 0; local106 < 32768; local106++) {
				@Pc(269) Class25_Sub5_Sub1_Sub1 local269 = Static87.aClass25_Sub5_Sub1_Sub1Array6[local106];
				if (local269 != null) {
					for (local114 = 0; local114 < 10; local114++) {
						local269.anIntArray283[local114] -= local89;
						local269.anIntArray284[local114] -= local93;
					}
					local269.anInt5518 -= local89 * 128;
					local269.anInt5514 -= local93 * 128;
				}
			}
		} else {
			Static328.anInt5608 = 0;
			local106 = Static296.anInt5187 * 128 - 128;
			@Pc(112) int local112 = (Static206.anInt3607 - 1) * 128;
			for (local114 = 0; local114 < 32768; local114++) {
				@Pc(120) Class25_Sub5_Sub1_Sub1 local120 = Static87.aClass25_Sub5_Sub1_Sub1Array6[local114];
				if (local120 != null) {
					local120.anInt5518 -= local89 * 128;
					local120.anInt5514 -= local93 * 128;
					if (local120.anInt5518 >= 0 && local106 >= local120.anInt5518 && local120.anInt5514 >= 0 && local120.anInt5514 <= local112) {
						@Pc(176) boolean local176 = true;
						for (@Pc(178) int local178 = 0; local178 < 10; local178++) {
							local120.anIntArray283[local178] -= local89;
							local120.anIntArray284[local178] -= local93;
							if (local120.anIntArray283[local178] < 0 || Static296.anInt5187 <= local120.anIntArray283[local178] || local120.anIntArray284[local178] < 0 || local120.anIntArray284[local178] >= Static206.anInt3607) {
								local176 = false;
							}
						}
						if (local176) {
							Static31.anIntArray30[Static328.anInt5608++] = local114;
						} else {
							Static87.aClass25_Sub5_Sub1_Sub1Array6[local114].method2590(null);
							Static87.aClass25_Sub5_Sub1_Sub1Array6[local114] = null;
						}
					} else {
						Static87.aClass25_Sub5_Sub1_Sub1Array6[local114].method2590(null);
						Static87.aClass25_Sub5_Sub1_Sub1Array6[local114] = null;
					}
				}
			}
		}
		for (local106 = 0; local106 < 2048; local106++) {
			@Pc(327) Class25_Sub5_Sub1_Sub2 local327 = Static28.aClass25_Sub5_Sub1_Sub2Array1[local106];
			if (local327 != null) {
				for (local114 = 0; local114 < 10; local114++) {
					local327.anIntArray283[local114] -= local89;
					local327.anIntArray284[local114] -= local93;
				}
				local327.anInt5518 -= local89 * 128;
				local327.anInt5514 -= local93 * 128;
			}
		}
		@Pc(379) Class135[] local379 = Static133.aClass135Array1;
		for (local114 = 0; local114 < local379.length; local114++) {
			@Pc(387) Class135 local387 = local379[local114];
			if (local387 != null) {
				local387.anInt3814 -= local93 * 128;
				local387.anInt3818 -= local89 * 128;
			}
		}
		Static421.method5599(local93, local89);
		for (@Pc(425) Class1_Sub3 local425 = (Class1_Sub3) Static413.aClass227_43.method4967(); local425 != null; local425 = (Class1_Sub3) Static413.aClass227_43.method4973()) {
			local425.anInt126 -= local89;
			local425.anInt121 -= local93;
			if (Static226.anInt4010 != 3 && (local425.anInt126 < 0 || local425.anInt121 < 0 || local425.anInt126 >= Static296.anInt5187 || Static206.anInt3607 <= local425.anInt121)) {
				local425.method5915();
			}
		}
		if (Static11.anInt185 != 0) {
			Static11.anInt185 -= local89;
			Static232.anInt4096 -= local93;
		}
		Static257.method3678();
		if (arg0 != 10) {
			Static360.anInt6145 -= local93 * 128;
			Static312.anInt5418 -= local89;
			Static207.anInt6028 -= local93;
			Static145.anInt1966 -= local89;
			Static260.anInt2259 -= local93;
			Static213.anInt258 -= local89 * 128;
			if (Math.abs(local89) > Static296.anInt5187 || Math.abs(local93) > Static206.anInt3607) {
				Static129.method2031();
			}
		} else if (Static333.anInt5693 == 4) {
			Static436.anInt7317 -= local89 * 128;
			Static140.anInt2485 -= local89 * 128;
			Static52.anInt896 -= local93 * 128;
			Static378.anInt2804 -= local93 * 128;
		} else {
			Static333.anInt5693 = 1;
		}
		Static432.method5705();
		Static72.method1154();
		Static340.aClass227_35.method4981();
		Static226.aClass227_24.method4981();
		Static172.aClass262_5.method5812();
		method982();
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V")
	private static void method982() {
		Static331.aClass33_1 = new Class33(8);
		Static132.anInt2382 = 0;
		for (@Pc(21) Class4_Sub2 local21 = (Class4_Sub2) Static78.aClass262_8.method5819(); local21 != null; local21 = (Class4_Sub2) Static78.aClass262_8.method5813()) {
			local21.method1247();
		}
	}
}
