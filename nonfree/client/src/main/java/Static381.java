import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!om", name = "e", descriptor = "Lclient!aa;")
	public static Class2 aClass2_4;

	@OriginalMember(owner = "client!om", name = "b", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_98 = new Class173(48, 11);

	@OriginalMember(owner = "client!om", name = "g", descriptor = "I")
	public static int anInt7743 = 0;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method6454(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (!Static368.aBoolean505) {
			return false;
		} else if (Static192.anInt3745 < 100) {
			return false;
		} else {
			@Pc(45) int local45;
			@Pc(49) int local49;
			if (arg5 != arg3 || arg4 != arg2) {
				for (local45 = arg5; local45 <= arg3; local45++) {
					for (local49 = arg4; local49 <= arg2; local49++) {
						if (Static300.anIntArrayArrayArray13[arg0][local45][local49] == -Static431.anInt8105) {
							return false;
						}
					}
				}
				local49 = (arg5 << Static145.anInt3093) + 1;
				@Pc(120) int local120 = (arg4 << Static145.anInt3093) + 2;
				if (Static60.method1008(Static279.anInt5708 * (arg3 + 1 - arg5), Static499.aClass83Array3[arg0].method7217(arg4, arg5), local120, arg1, (arg2 + 1 - arg4) * Static279.anInt5708, local49)) {
					Static561.anInt5883++;
					return true;
				} else {
					return false;
				}
			} else if (Static181.method3235(arg4, arg0, arg5)) {
				local45 = arg5 << Static145.anInt3093;
				local49 = arg4 << Static145.anInt3093;
				if (Static60.method1008(Static279.anInt5708, Static499.aClass83Array3[arg0].method7217(arg4, arg5), local49, arg1, Static279.anInt5708, local45)) {
					Static561.anInt5883++;
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)V")
	public static void method6457(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub5_Sub16 local8 = Static219.method3587(arg0, 3);
		local8.method7134();
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(I)Z")
	public static boolean method6458() {
		return Static203.anInt3855 >= 1;
	}
}
