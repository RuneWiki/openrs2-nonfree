import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!lga", name = "r", descriptor = "I")
	public static int anInt6034;

	@OriginalMember(owner = "client!lga", name = "t", descriptor = "Lclient!el;")
	public static final Class109 aClass109_121 = new Class109(121, 3);

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(IILclient!ha;Lclient!co;BLclient!sb;)Z")
	public static boolean method5152(@OriginalArg(2) Class57 arg0, @OriginalArg(3) Class5_Sub8 arg1, @OriginalArg(5) Class315 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(19) int local19 = Integer.MAX_VALUE;
		@Pc(21) int local21 = Integer.MIN_VALUE;
		if (arg2.anIntArray514 != null) {
			local19 = Static629.anInt9771 - (Static629.anInt9771 - Static629.anInt9761) * (-Static629.anInt9764 + arg2.anInt8882 - -arg1.anInt1432) / (Static629.anInt9768 - Static629.anInt9764);
			local21 = Static629.anInt9771 - (arg2.anInt8888 + arg1.anInt1432 - Static629.anInt9764) * (Static629.anInt9771 - Static629.anInt9761) / (Static629.anInt9768 - Static629.anInt9764);
			local9 = (Static629.anInt9770 - Static629.anInt9762) * (arg1.anInt1430 + arg2.anInt8873 - Static629.anInt9772) / (Static629.anInt9769 - Static629.anInt9772) + Static629.anInt9762;
			local7 = (arg2.anInt8897 + arg1.anInt1430 - Static629.anInt9772) * (Static629.anInt9770 - Static629.anInt9762) / (Static629.anInt9769 - Static629.anInt9772) + Static629.anInt9762;
		}
		@Pc(113) Class134 local113 = null;
		@Pc(115) int local115 = 0;
		@Pc(117) int local117 = 0;
		@Pc(119) int local119 = 0;
		@Pc(121) int local121 = 0;
		if (arg2.anInt8895 != -1) {
			if (arg1.aBoolean141 && arg2.anInt8875 != -1) {
				local113 = arg2.method7606(true, arg0);
			} else {
				local113 = arg2.method7606(false, arg0);
			}
			if (local113 != null) {
				local115 = arg1.anInt1428 - (local113.method9231() + 1 >> 1);
				if (local7 > local115) {
					local7 = local115;
				}
				local117 = arg1.anInt1428 + (local113.method9231() + 1 >> 1);
				local119 = arg1.anInt1431 - (local113.method9232() + 1 >> 1);
				if (local9 < local117) {
					local9 = local117;
				}
				local121 = arg1.anInt1431 + (local113.method9232() + 1 >> 1);
				if (local19 > local119) {
					local19 = local119;
				}
				if (local121 > local21) {
					local21 = local121;
				}
			}
		}
		@Pc(219) Class158 local219 = null;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		@Pc(231) int local231 = 0;
		@Pc(233) int local233 = 0;
		@Pc(235) int local235 = 0;
		@Pc(314) int local314;
		if (arg2.aString116 != null) {
			local219 = Static479.method6983(arg2.anInt8903);
			if (local219 != null) {
				local221 = Static473.aClass224_10.method5255(arg2.aString116, (Class134[]) null, Static433.aStringArray51, (int[]) null);
				local223 = arg1.anInt1428 + (Static629.anInt9770 - Static629.anInt9762) * arg2.anInt8899 / (Static629.anInt9769 - Static629.anInt9772);
				local225 = arg1.anInt1431 - (Static629.anInt9771 - Static629.anInt9761) * arg2.anInt8880 / (Static629.anInt9768 - Static629.anInt9764);
				if (local113 == null) {
					local225 -= local221 * local219.method3133() / 2;
				} else {
					local225 -= (local113.method9232() >> 1) + (local221 * local219.method3128());
				}
				for (local314 = 0; local314 < local221; local314++) {
					@Pc(320) String local320 = Static433.aStringArray51[local314];
					if (local221 - 1 > local314) {
						local320 = local320.substring(0, local320.length() - 4);
					}
					@Pc(337) int local337 = local219.method3130(local320);
					if (local227 < local337) {
						local227 = local337;
					}
				}
				local229 = local223 - local227 / 2;
				if (local229 < local7) {
					local7 = local229;
				}
				local231 = local223 + local227 / 2;
				if (local9 < local231) {
					local9 = local231;
				}
				local233 = local225;
				local235 = local221 * local219.method3128() + local225;
				if (local233 < local19) {
					local19 = local233;
				}
				if (local235 > local21) {
					local21 = local235;
				}
			}
		}
		if (local9 < Static629.anInt9762 || local7 > Static629.anInt9770 || local21 < Static629.anInt9761 || local19 > Static629.anInt9771) {
			return true;
		}
		Static629.method8379(arg0, arg1, arg2);
		if (local113 != null) {
			if (Static31.anInt506 > 0 && (Static496.anInt8292 != -1 && Static496.anInt8292 == arg1.anInt1429 || Static87.anInt1456 != -1 && arg2.anInt8900 == Static87.anInt1456)) {
				if (Static333.anInt5936 > 50) {
					local314 = 200 - Static333.anInt5936 * 2;
				} else {
					local314 = Static333.anInt5936 * 2;
				}
				@Pc(498) int local498 = local314 << 24 | 0xFFFF00;
				arg0.method7687(arg1.anInt1428, local498, arg1.anInt1431, local113.method9236() / 2 + 7);
				arg0.method7687(arg1.anInt1428, local498, arg1.anInt1431, local113.method9236() / 2 + 5);
				arg0.method7687(arg1.anInt1428, local498, arg1.anInt1431, local113.method9236() / 2 + 3);
				arg0.method7687(arg1.anInt1428, local498, arg1.anInt1431, local113.method9236() / 2 + 1);
				arg0.method7687(arg1.anInt1428, local498, arg1.anInt1431, local113.method9236() / 2);
			}
			local113.method9235(arg1.anInt1428 - (local113.method9231() >> 1), arg1.anInt1431 - (local113.method9232() >> 1));
		}
		if (arg2.aString116 != null && local219 != null) {
			Static150.method2110(arg1, local227, arg0, local221, local219, local223, local225, arg2);
		}
		if (arg2.anInt8895 != -1 || arg2.aString116 != null) {
			@Pc(617) Class5_Sub26 local617 = new Class5_Sub26(arg1);
			local617.anInt4758 = local229;
			local617.anInt4762 = local235;
			local617.anInt4760 = local115;
			local617.anInt4757 = local231;
			local617.anInt4755 = local119;
			local617.anInt4761 = local117;
			local617.anInt4764 = local233;
			local617.anInt4754 = local121;
			Static199.aClass102_64.method1921(local617);
		}
		return false;
	}
}
