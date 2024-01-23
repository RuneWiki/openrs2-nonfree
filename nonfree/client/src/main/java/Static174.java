import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!rc", name = "C", descriptor = "D")
	public static double aDouble11;

	@OriginalMember(owner = "client!rc", name = "G", descriptor = "Lclient!rd;")
	public static Class72_Sub1 aClass72_Sub1_30;

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "[I")
	public static int[] anIntArray658 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!rc", name = "w", descriptor = "Lclient!qe;")
	public static Class78 aClass78_699 = Static199.method3560(" (X");

	@OriginalMember(owner = "client!rc", name = "z", descriptor = "Lclient!qe;")
	public static Class78 aClass78_700 = Static199.method3560("<col=00ff00>");

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BJ)V")
	public static void method3165(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(12) InterruptedException local12) {
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[I)[I")
	public static int[] method3166(@OriginalArg(1) int[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) int[] local11 = new int[arg0.length];
			Static231.method2216(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
