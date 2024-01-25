import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "[I")
	public static int[] anIntArray226;

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "Lclient!me;")
	public static Class151 aClass151_1;

	@OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
	public static int anInt3611 = 0;

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
	public static void method2936() {
		Static105.method1619();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static447.aClass14Array3[local8].method288();
		}
		Static72.method1154();
		Static417.method5509();
		System.gc();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)I")
	public static int method2937(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(21) int local21 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local21;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2938(@OriginalArg(1) String arg0) {
		Static90.method1430(arg0, "", 0, "", 0);
	}
}
