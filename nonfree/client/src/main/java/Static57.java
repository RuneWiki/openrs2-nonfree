import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!da", name = "V", descriptor = "[I")
	public static final int[] anIntArray106 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!gg;I)Z")
	public static boolean method1012(@OriginalArg(0) Interface3 arg0) {
		@Pc(10) Class60 local10 = Static97.aClass217_4.method5007(arg0.method5420());
		if (local10.anInt1380 == -1) {
			return true;
		} else {
			@Pc(23) Class143 local23 = Static319.aClass24_4.method317(local10.anInt1380);
			return local23.anInt3541 == -1 ? true : local23.method3107();
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BLclient!np;Lclient!dt;)V")
	public static void method1023(@OriginalArg(1) Class155 arg0, @OriginalArg(2) Class62 arg1) {
		@Pc(36) boolean local36 = Static176.aClass78_3.method1646(arg0, arg1.anInt1507, arg1.anInt1511, arg1.aBoolean117 ? Static226.aClass28_Sub1_Sub1_Sub2_2.aClass49_1 : null, arg1.anInt1508, arg1.anInt1577 | 0xFF000000, arg1.anInt1549) == null;
		if (local36) {
			Static12.aClass138_3.method3053(new Class3_Sub38(arg1.anInt1549, arg1.anInt1507, arg1.anInt1508, arg1.anInt1577 | 0xFF000000, arg1.anInt1511, arg1.aBoolean117));
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IBILclient!km;)V")
	public static void method1030(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class28_Sub1_Sub1_Sub1 arg2) {
		if (arg1 == arg2.anInt4314 && arg1 != -1) {
			@Pc(19) Class177 local19 = Static176.aClass43_2.method930(arg1);
			@Pc(22) int local22 = local19.anInt4500;
			if (local22 == 1) {
				arg2.anInt4356 = 0;
				arg2.anInt4315 = 0;
				arg2.anInt4327 = arg0;
				arg2.anInt4317 = 1;
				arg2.anInt4363 = 0;
				Static351.method2911(arg2.aByte73, arg2.anInt5774, arg2.anInt4356, local19, arg2.anInt5766, false);
			}
			if (local22 == 2) {
				arg2.anInt4315 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt4314 == -1 || Static176.aClass43_2.method930(arg1).anInt4520 >= Static176.aClass43_2.method930(arg2.anInt4314).anInt4520) {
			arg2.anInt4375 = arg2.anInt4378;
			arg2.anInt4317 = 1;
			arg2.anInt4314 = arg1;
			arg2.anInt4356 = 0;
			arg2.anInt4315 = 0;
			arg2.anInt4363 = 0;
			arg2.anInt4327 = arg0;
			if (arg2.anInt4314 != -1) {
				Static351.method2911(arg2.aByte73, arg2.anInt5774, arg2.anInt4356, Static176.aClass43_2.method930(arg2.anInt4314), arg2.anInt5766, false);
			}
		}
	}
}
