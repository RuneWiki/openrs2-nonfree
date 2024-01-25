import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "I")
	public static int anInt2809;

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "I")
	public static int anInt2808 = 0;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
	public static void method2410() {
		@Pc(1) Class139 local1 = Static78.aClass139_13;
		synchronized (Static78.aClass139_13) {
			Static78.aClass139_13.method3072();
		}
		local1 = Static136.aClass139_31;
		synchronized (Static136.aClass139_31) {
			Static136.aClass139_31.method3072();
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IB)I")
	public static int method2411(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)V")
	public static void method2412() {
		if (Static239.aBoolean441) {
			return;
		}
		Static239.aBoolean441 = true;
		Static55.aBoolean64 = true;
		if (Static164.aClass154_Sub1_1.aBoolean466) {
			Static279.aFloat67 = (int) Static279.aFloat67 - 17 & 0xFFFFFFF0;
		} else {
			Static75.aFloat11 += (-12.0F - Static75.aFloat11) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIIB)V")
	public static void method2413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static174.anInt3035 == 1) {
			Static323.aClass110Array12[Static144.anInt2710 / 100].method5094(Static165.anInt2905 - 8, Static214.anInt3764 - 8);
		}
		if (Static174.anInt3035 == 2) {
			Static323.aClass110Array12[Static144.anInt2710 / 100 + 4].method5094(Static165.anInt2905 - 8, Static214.anInt3764 + -8);
		}
		Static55.method996();
	}
}
