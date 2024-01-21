import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!m", name = "g", descriptor = "I")
	public static int anInt1951;

	@OriginalMember(owner = "client!m", name = "c", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_605 = Static181.method2795("sl_flags");

	@OriginalMember(owner = "client!m", name = "d", descriptor = "I")
	public static int anInt1949 = 255;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_606 = Static181.method2795("Einloggen");

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public static void method1577() {
		@Pc(7) Class27 local7 = Static85.aClass27_1;
		synchronized (Static85.aClass27_1) {
			Static213.anInt4241++;
			Static6.anInt138 = Static83.anInt1857;
			@Pc(28) int local28;
			if (Static82.anInt1828 < 0) {
				for (local28 = 0; local28 < 112; local28++) {
					Static71.aBooleanArray10[local28] = false;
				}
				Static82.anInt1828 = Static137.anInt2904;
			} else {
				while (Static137.anInt2904 != Static82.anInt1828) {
					local28 = Static180.anIntArray365[Static137.anInt2904];
					Static137.anInt2904 = Static137.anInt2904 + 1 & 0x7F;
					if (local28 >= 0) {
						Static71.aBooleanArray10[local28] = true;
					} else {
						Static71.aBooleanArray10[~local28] = false;
					}
				}
			}
			Static83.anInt1857 = Static69.anInt1633;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)I")
	public static int method1578(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 * 6 - 61440;
		@Pc(23) int local23 = (arg0 * local9 >> 12) + 40960;
		@Pc(33) int local33 = arg0 * (arg0 * arg0 >> 12) >> 12;
		return local23 * local33 >> 12;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IBI)I")
	public static int method1582(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = 0;
		while (arg0 > 0) {
			arg0--;
			local8 = arg1 & 0x1 | local8 << 1;
			arg1 >>>= 0x1;
		}
		return local8;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIILclient!rb;IJIIII)Z")
	public static boolean method1583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class24 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static213.method3227(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}
}
