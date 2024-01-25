import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!eba", name = "k", descriptor = "I")
	public static int anInt2410;

	@OriginalMember(owner = "client!eba", name = "t", descriptor = "I")
	public static int anInt2418 = 0;

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!js;[[BI)V")
	public static void method2280(@OriginalArg(0) Class179_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(8) int local8 = Static160.aByteArrayArray10.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			@Pc(16) byte[] local16 = arg1[local10];
			if (local16 != null) {
				@Pc(29) int local29 = (Static75.anIntArray18[local10] >> 8) * 64 - Static552.anInt9805;
				@Pc(40) int local40 = (Static75.anIntArray18[local10] & 0xFF) * 64 - Static254.anInt4667;
				Static390.method6204();
				arg0.method4072(Static440.aClass44_12, Static86.aClass111Array1, local40, local29, local16);
			}
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZII)I")
	public static int method2282(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static219.anIntArray194[arg0 & 0x3] : Static453.anIntArray467[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIIIIII)V")
	public static void method2283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static486.anInt8866 <= arg3 - arg4 && Static214.anInt3975 >= arg3 + arg4 && arg1 - arg4 >= Static290.anInt5903 && Static530.anInt9437 >= arg1 + arg4) {
			Static278.method4822(arg3, arg5, arg4, arg0, arg1, arg2);
		} else {
			Static561.method5051(arg1, arg5, arg3, arg4, arg2, arg0);
		}
	}
}
