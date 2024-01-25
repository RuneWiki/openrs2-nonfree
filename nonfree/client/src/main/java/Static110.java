import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!gr", name = "h", descriptor = "I")
	public static int anInt2324;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
	public static int anInt2318 = 0;

	@OriginalMember(owner = "client!gr", name = "g", descriptor = "Z")
	public static boolean aBoolean121 = false;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIIIB)V")
	public static void method1879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(11) int local11 = arg4; local11 <= arg0; local11++) {
			Static162.method1731(arg2, Static196.anIntArrayArray37[local11], arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "(I)V")
	public static void method1881() {
		@Pc(5) Class198 local5 = Static94.aClass198_18;
		synchronized (Static94.aClass198_18) {
			Static94.aClass198_18.method5236();
		}
		local5 = Static164.aClass198_57;
		synchronized (Static164.aClass198_57) {
			Static164.aClass198_57.method5236();
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(BIII)I")
	public static int method1882(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 1023 - arg0;
		} else {
			return 1023 - arg2;
		}
	}
}
