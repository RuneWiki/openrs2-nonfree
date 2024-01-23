import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!la", name = "kb", descriptor = "I")
	public static int anInt2613 = 0;

	@OriginalMember(owner = "client!la", name = "ob", descriptor = "I")
	public static int anInt2617 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!la", name = "qb", descriptor = "I")
	public static int anInt2619 = 0;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BIIII)V")
	public static void method2042(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static193.aClass1_Sub26_Sub1_2.anInt4021 = 0;
		Static193.aClass1_Sub26_Sub1_2.method2967(193);
		Static193.aClass1_Sub26_Sub1_2.method2967(arg2);
		Static193.aClass1_Sub26_Sub1_2.method2967(arg0);
		Static193.aClass1_Sub26_Sub1_2.method2963(arg3);
		Static193.aClass1_Sub26_Sub1_2.method2963(arg1);
		Static100.anInt2168 = 0;
		Static59.anInt1428 = 0;
		Static122.anInt2676 = 1;
		Static143.anInt3140 = -3;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!o;II)V")
	public static void method2043(@OriginalArg(0) int arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) int arg2) {
		if (Static54.aClass86_1 != null || Static40.aBoolean81 || (arg1 == null || Static21.method394(arg1) == null)) {
			return;
		}
		Static54.aClass86_1 = arg1;
		Static83.aClass86_5 = Static21.method394(arg1);
		Static199.anInt4324 = arg2;
		Static157.aBoolean305 = false;
		Static163.anInt3550 = arg0;
		Static191.anInt4238 = 0;
	}

	@OriginalMember(owner = "client!la", name = "e", descriptor = "(III)Z")
	public static boolean method2044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!la", name = "h", descriptor = "(I)V")
	public static void method2045() {
		@Pc(3) Class87 local3 = Static213.aClass87_1;
		synchronized (Static213.aClass87_1) {
			Static179.anInt3928 = Static65.anInt1536;
			Static124.anInt2695++;
			@Pc(27) int local27;
			if (Static131.anInt2857 < 0) {
				for (local27 = 0; local27 < 112; local27++) {
					Static132.aBooleanArray19[local27] = false;
				}
				Static131.anInt2857 = Static192.anInt4250;
			} else {
				while (Static131.anInt2857 != Static192.anInt4250) {
					local27 = Static7.anIntArray17[Static192.anInt4250];
					Static192.anInt4250 = Static192.anInt4250 + 1 & 0x7F;
					if (local27 >= 0) {
						Static132.aBooleanArray19[local27] = true;
					} else {
						Static132.aBooleanArray19[~local27] = false;
					}
				}
			}
			Static65.anInt1536 = Static163.anInt3553;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIILclient!af;IJ)Z")
	public static boolean method2046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(8) long arg7) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static224.method3666(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, 0, false, arg7);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII)I")
	public static int method2047(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 & 0x3;
		if (local12 == 0) {
			return arg2;
		} else if (local12 == 1) {
			return arg1;
		} else if (local12 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(B)V")
	public static void method2048() {
		Static116.aClass61_47.method1689();
	}
}
