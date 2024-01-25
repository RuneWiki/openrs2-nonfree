import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
	public static int anInt2646;

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "Lclient!ub;")
	public static Class198 aClass198_90 = new Class198(64);

	@OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
	public static int anInt2645 = 0;

	@OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
	public static int anInt2647 = 104;

	@OriginalMember(owner = "client!gj", name = "t", descriptor = "Z")
	public static boolean aBoolean188 = false;

	@OriginalMember(owner = "client!gj", name = "u", descriptor = "[I")
	public static final int[] anIntArray232 = new int[14];

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V")
	public static void method2335() {
		@Pc(3) Class32[] local3 = Class9.aClass32Array1;
		synchronized (Class9.aClass32Array1) {
			for (@Pc(7) int local7 = 0; local7 < Class9.aClass32Array1.length; local7++) {
				Class9.aClass32Array1[local7] = new Class32();
				Static125.anIntArray260[local7] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLclient!tj;)V")
	public static void method2336(@OriginalArg(1) Class193 arg0) {
		Static264.aClass193_103 = arg0;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIII)V")
	public static void method2337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static5.anInt2965 <= arg2 && arg0 <= Static220.anInt6565 && arg3 >= Static349.anInt6619 && Static195.anInt4097 >= arg1) {
			Static128.method2642(arg1, arg2, arg0, arg4, arg3);
		} else {
			Static113.method2381(arg3, arg0, arg2, arg1, arg4);
		}
	}
}
