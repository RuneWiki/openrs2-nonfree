import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!hs", name = "p", descriptor = "I")
	public static int anInt2764;

	@OriginalMember(owner = "client!hs", name = "s", descriptor = "Lclient!gu;")
	public static Class100 aClass100_2;

	@OriginalMember(owner = "client!hs", name = "l", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_56 = new Class237(63, 6);

	@OriginalMember(owner = "client!hs", name = "q", descriptor = "[I")
	public static int[] anIntArray259 = new int[1];

	@OriginalMember(owner = "client!hs", name = "r", descriptor = "I")
	public static int anInt2765 = 0;

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "(III)Ljava/lang/String;")
	public static String method2441(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 - arg1;
		if (local7 < -9) {
			return "<col=ff0000>";
		} else if (local7 < -6) {
			return "<col=ff3000>";
		} else if (local7 < -3) {
			return "<col=ff7000>";
		} else if (local7 < 0) {
			return "<col=ffb000>";
		} else if (local7 > 9) {
			return "<col=00ff00>";
		} else if (local7 > 6) {
			return "<col=40ff00>";
		} else if (local7 > 3) {
			return "<col=80ff00>";
		} else if (local7 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIIZ)V")
	public static void method2442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static389.aClass128_Sub1_1.anInt3565 != 0 && arg1 != 0 && Static442.anInt5016 < 50 && arg2 != -1) {
			Static254.aClass12Array1[Static442.anInt5016++] = new Class12((byte) 1, arg2, arg1, arg3, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIZ)Z")
	public static boolean method2443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static127.method2923(arg0, arg1)) {
			return (arg0 & 0xB000) != 0 | Static268.method4072(arg1, arg0) | Static269.method3932(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (Static383.method5219(arg0, arg1) | Static381.method4264(arg1, arg0));
		} else {
			return false;
		}
	}
}
