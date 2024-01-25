import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static520 {

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "Lclient!om;")
	public static Class246 aClass246_242;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIII)I")
	public static int method6922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 / arg1;
		@Pc(13) int local13 = arg2 & arg1 - 1;
		@Pc(17) int local17 = arg0 / arg1;
		@Pc(23) int local23 = arg0 & arg1 - 1;
		@Pc(28) int local28 = Static219.method3812(local17, local7);
		@Pc(37) int local37 = Static219.method3812(local17, local7 + 1);
		@Pc(46) int local46 = Static219.method3812(local17 + 1, local7);
		@Pc(55) int local55 = Static219.method3812(local17 + 1, local7 + 1);
		@Pc(62) int local62 = Static407.method5894(local28, local13, local37, arg1);
		@Pc(78) int local78 = Static407.method5894(local46, local13, local55, arg1);
		return Static407.method5894(local62, local23, local78, arg1);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!gfa;IIIII)V")
	public static void method6926(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static499.anInt7950) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static411.anInt6927) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static157.anInt3168 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class63 local62 = Static554.aClass63ArrayArrayArray4[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static29.aClass139Array6[local17].method6889(local23, local32) + Static29.aClass139Array6[local17].method6889(local23 + 1, local32) + Static29.aClass139Array6[local17].method6889(local23, local32 + 1) + Static29.aClass139Array6[local17].method6889(local23 + 1, local32 + 1)) / 4 - (Static29.aClass139Array6[arg1].method6889(arg2, arg3) + Static29.aClass139Array6[arg1].method6889(arg2 + 1, arg3) + Static29.aClass139Array6[arg1].method6889(arg2, arg3 + 1) + Static29.aClass139Array6[arg1].method6889(arg2 + 1, arg3 + 1)) / 4;
									@Pc(151) Class9_Sub1_Sub4 local151 = local62.aClass9_Sub1_Sub4_1;
									@Pc(154) Class9_Sub1_Sub4 local154 = local62.aClass9_Sub1_Sub4_2;
									if (local151 != null && local151.method7483()) {
										arg0.method7479((local23 - arg2) * Static511.anInt8116 + (1 - arg4) * Static122.anInt2780, local151, (local32 - arg3) * Static511.anInt8116 + (1 - arg5) * Static122.anInt2780, local148, Static482.aClass43_12, local1);
									}
									if (local154 != null && local154.method7483()) {
										arg0.method7479((local23 - arg2) * Static511.anInt8116 + (1 - arg4) * Static122.anInt2780, local154, (local32 - arg3) * Static511.anInt8116 + (1 - arg5) * Static122.anInt2780, local148, Static482.aClass43_12, local1);
									}
									for (@Pc(227) Class16 local227 = local62.aClass16_3; local227 != null; local227 = local227.aClass16_1) {
										@Pc(231) Class9_Sub1_Sub1 local231 = local227.aClass9_Sub1_Sub1_1;
										if (local231 != null && local231.method7483() && (local23 == local231.aShort112 || local23 == local3) && (local32 == local231.aShort115 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort114 + 1 - local231.aShort112;
											@Pc(268) int local268 = local231.aShort113 + 1 - local231.aShort115;
											arg0.method7479((local231.aShort112 - arg2) * Static511.anInt8116 + (local260 - arg4) * Static122.anInt2780, local231, (local231.aShort115 - arg3) * Static511.anInt8116 + (local268 - arg5) * Static122.anInt2780, local148, Static482.aClass43_12, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
