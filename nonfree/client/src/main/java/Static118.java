import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!ek", name = "j", descriptor = "Z")
	public static boolean aBoolean298 = false;

	@OriginalMember(owner = "client!ek", name = "k", descriptor = "[I")
	public static final int[] anIntArray190 = new int[1];

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!ub;IIIII)V")
	public static void method3497(@OriginalArg(0) Class1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static345.anInt6662) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static182.anInt3633) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static253.anInt4651 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class53 local62 = Static60.aClass53ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static499.aClass83Array3[local17].method7217(local32, local23) + Static499.aClass83Array3[local17].method7217(local32, local23 + 1) + Static499.aClass83Array3[local17].method7217(local32 + 1, local23) + Static499.aClass83Array3[local17].method7217(local32 + 1, local23 + 1)) / 4 - (Static499.aClass83Array3[arg1].method7217(arg3, arg2) + Static499.aClass83Array3[arg1].method7217(arg3, arg2 + 1) + Static499.aClass83Array3[arg1].method7217(arg3 + 1, arg2) + Static499.aClass83Array3[arg1].method7217(arg3 + 1, arg2 + 1)) / 4;
									@Pc(151) Class1_Sub4_Sub5 local151 = local62.aClass1_Sub4_Sub5_2;
									@Pc(154) Class1_Sub4_Sub5 local154 = local62.aClass1_Sub4_Sub5_1;
									if (local151 != null && local151.method8114()) {
										arg0.method8127((local32 - arg3) * Static279.anInt5708 + (1 - arg5) * Static96.anInt8036, local148, local1, Static468.aClass44_7, local151, (local23 - arg2) * Static279.anInt5708 + (1 - arg4) * Static96.anInt8036);
									}
									if (local154 != null && local154.method8114()) {
										arg0.method8127((local32 - arg3) * Static279.anInt5708 + (1 - arg5) * Static96.anInt8036, local148, local1, Static468.aClass44_7, local154, (local23 - arg2) * Static279.anInt5708 + (1 - arg4) * Static96.anInt8036);
									}
									for (@Pc(227) Class289 local227 = local62.aClass289_1; local227 != null; local227 = local227.aClass289_3) {
										@Pc(231) Class1_Sub4_Sub2 local231 = local227.aClass1_Sub4_Sub2_1;
										if (local231 != null && local231.method8114() && (local23 == local231.aShort121 || local23 == local3) && (local32 == local231.aShort120 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort122 + 1 - local231.aShort121;
											@Pc(268) int local268 = local231.aShort119 + 1 - local231.aShort120;
											arg0.method8127((local231.aShort120 - arg3) * Static279.anInt5708 + (local268 - arg5) * Static96.anInt8036, local148, local1, Static468.aClass44_7, local231, (local231.aShort121 - arg2) * Static279.anInt5708 + (local260 - arg4) * Static96.anInt8036);
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
