import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!om", name = "g", descriptor = "Lclient!bg;")
	public static Class21 aClass21_1;

	@OriginalMember(owner = "client!om", name = "i", descriptor = "[I")
	public static int[] anIntArray329;

	@OriginalMember(owner = "client!om", name = "d", descriptor = "I")
	public static int anInt5071 = -2;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BI)V")
	public static void method3976() {
		@Pc(13) Class102 local13 = Static218.aClass102_26;
		synchronized (Static218.aClass102_26) {
			Static218.aClass102_26.method2262(5);
		}
		local13 = Static311.aClass102_42;
		synchronized (Static311.aClass102_42) {
			Static311.aClass102_42.method2262(5);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!mh;III)J")
	public static long method3978(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(15) long local15 = 2147483648L;
		@Pc(17) long local17 = Long.MIN_VALUE;
		@Pc(24) Class68 local24 = Static341.aClass75_4.method1616(arg0.method4623());
		@Pc(45) long local45 = (long) (arg0.method4617() << 14 | arg1 | arg2 << 7 | arg0.method4620() << 20 | 0x40000000);
		if (local24.anInt1821 == 0) {
			local45 |= local17;
		}
		if (local24.anInt1788 == 1) {
			local45 |= local5;
		}
		if (local24.aBoolean208) {
			local45 |= local15;
		}
		return local45 | (long) arg0.method4623() << 32;
	}
}
