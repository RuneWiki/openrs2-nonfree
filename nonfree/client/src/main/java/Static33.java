import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "Lclient!rf;")
	public static final Class288 aClass288_1 = new Class288();

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_23 = new Class362(102, -1);

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!rh;IIII)Z")
	public static boolean method447(@OriginalArg(0) Class1_Sub4_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (!Static368.aBoolean505) {
			return false;
		} else if (Static192.anInt3745 < 100) {
			return false;
		} else if (Static181.method3235(arg1, arg3, arg2)) {
			@Pc(26) int local26 = arg2 << Static145.anInt3093;
			@Pc(35) int local35 = arg1 << Static145.anInt3093;
			@Pc(45) int local45 = Static499.aClass83Array3[arg3].method7217(arg1, arg2) - 1;
			@Pc(51) int local51 = arg0.method8117() + local45;
			if (arg0.aShort92 == 1) {
				if (!Static193.method3363(local51, local51, local35, local26, Static279.anInt5708 + local35, local45, local26, local35, local26)) {
					return false;
				} else if (Static193.method3363(local45, local51, Static279.anInt5708 + local35, local26, local35 + Static279.anInt5708, local45, local26, local35, local26)) {
					Static110.anInt2623++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort92 == 2) {
				if (!Static193.method3363(local51, local51, Static279.anInt5708 + local35, local26, Static279.anInt5708 + local35, local45, local26, local35 + Static279.anInt5708, local26 - -Static279.anInt5708)) {
					return false;
				} else if (Static193.method3363(local51, local45, Static279.anInt5708 + local35, local26, Static279.anInt5708 + local35, local45, Static279.anInt5708 + local26, Static279.anInt5708 + local35, local26 + Static279.anInt5708)) {
					Static110.anInt2623++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort92 == 4) {
				if (!Static193.method3363(local51, local51, local35, Static279.anInt5708 + local26, Static279.anInt5708 + local35, local45, local26 + Static279.anInt5708, local35, local26 + Static279.anInt5708)) {
					return false;
				} else if (Static193.method3363(local45, local51, local35 + Static279.anInt5708, local26 + Static279.anInt5708, Static279.anInt5708 + local35, local45, Static279.anInt5708 + local26, local35, local26 + Static279.anInt5708)) {
					Static110.anInt2623++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort92 == 8) {
				if (!Static193.method3363(local51, local51, local35, local26, local35, local45, local26, local35, Static279.anInt5708 + local26)) {
					return false;
				} else if (Static193.method3363(local51, local45, local35, local26, local35, local45, Static279.anInt5708 + local26, local35, Static279.anInt5708 + local26)) {
					Static110.anInt2623++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort92 == 16) {
				if (Static60.method1008(Static96.anInt8036, local45, local35 + Static96.anInt8036, local51, Static96.anInt8036, local26)) {
					Static110.anInt2623++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort92 == 32) {
				if (Static60.method1008(Static96.anInt8036, local45, local35 + Static96.anInt8036, local51, Static96.anInt8036, local26 + Static96.anInt8036)) {
					Static110.anInt2623++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort92 == 64) {
				if (Static60.method1008(Static96.anInt8036, local45, local35, local51, Static96.anInt8036, local26 + Static96.anInt8036)) {
					Static110.anInt2623++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort92 != 128) {
				return true;
			} else if (Static60.method1008(Static96.anInt8036, local45, local35, local51, Static96.anInt8036, local26)) {
				Static110.anInt2623++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)I")
	public static int method449(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
