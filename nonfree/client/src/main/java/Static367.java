import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!pe", name = "ob", descriptor = "I")
	public static int anInt6894;

	@OriginalMember(owner = "client!pe", name = "pb", descriptor = "Lclient!wl;")
	public static Class314 aClass314_1 = new Class314(8);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)Lclient!qda;")
	public static Class233 method5866(@OriginalArg(1) int arg0) {
		@Pc(10) Class233 local10 = (Class233) Static48.aClass231_10.method6228((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static302.aClass53_87.method1616(arg0, 0);
		local10 = new Class233();
		if (local25 != null) {
			local10.method6263(arg0, new Class2_Sub29(local25));
		}
		Static48.aClass231_10.method6232(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIZ)V")
	public static void method5867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static142.anInt2630 == 1) {
			Static144.aClass35Array16[Static515.anInt3810 / 100].method7351(Static292.anInt5366 - 8, Static397.anInt7578 - 8);
		}
		if (Static142.anInt2630 == 2) {
			Static144.aClass35Array16[Static515.anInt3810 / 100 + 4].method7351(Static292.anInt5366 - 8, Static397.anInt7578 + -8);
		}
		Static449.method6864();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIBLclient!wca;)V")
	public static void method5868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class310 arg2) {
		if (arg2.aByte106 == 0) {
			arg2.anInt9184 = arg2.anInt9155;
		} else if (arg2.aByte106 == 1) {
			arg2.anInt9184 = arg2.anInt9155 + (arg0 - arg2.anInt9163) / 2;
		} else if (arg2.aByte106 == 2) {
			arg2.anInt9184 = arg0 - arg2.anInt9163 - arg2.anInt9155;
		} else if (arg2.aByte106 == 3) {
			arg2.anInt9184 = arg2.anInt9155 * arg0 >> 14;
		} else if (arg2.aByte106 == 4) {
			arg2.anInt9184 = (arg0 - arg2.anInt9163) / 2 + (arg2.anInt9155 * arg0 >> 14);
		} else {
			arg2.anInt9184 = arg0 - (arg0 * arg2.anInt9155 >> 14) - arg2.anInt9163;
		}
		if (arg2.aByte107 == 0) {
			arg2.anInt9175 = arg2.anInt9229;
		} else if (arg2.aByte107 == 1) {
			arg2.anInt9175 = arg2.anInt9229 + (arg1 - arg2.anInt9198) / 2;
		} else if (arg2.aByte107 == 2) {
			arg2.anInt9175 = arg1 - arg2.anInt9198 - arg2.anInt9229;
		} else if (arg2.aByte107 == 3) {
			arg2.anInt9175 = arg1 * arg2.anInt9229 >> 14;
		} else if (arg2.aByte107 == 4) {
			arg2.anInt9175 = (arg1 - arg2.anInt9198) / 2 + (arg1 * arg2.anInt9229 >> 14);
		} else {
			arg2.anInt9175 = arg1 - arg2.anInt9198 - (arg1 * arg2.anInt9229 >> 14);
		}
		if (!Static372.aBoolean522) {
			return;
		}
		if (Static67.method1257(arg2).anInt7446 == 0 && arg2.anInt9220 != 0) {
			return;
		}
		if (arg2.anInt9175 < 0) {
			arg2.anInt9175 = 0;
		} else if (arg1 < arg2.anInt9198 + arg2.anInt9175) {
			arg2.anInt9175 = arg1 - arg2.anInt9198;
		}
		if (arg2.anInt9184 < 0) {
			arg2.anInt9184 = 0;
			return;
		}
		if (arg2.anInt9163 + arg2.anInt9184 > arg0) {
			arg2.anInt9184 = arg0 - arg2.anInt9163;
			return;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZII)V")
	public static void method5869(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub13_Sub15 local8 = Static370.method5893(0, 15);
		local8.method6968();
		local8.anInt8318 = arg1;
		local8.anInt8320 = arg0;
	}
}
