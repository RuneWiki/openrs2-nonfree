import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static593 {

	@OriginalMember(owner = "client!wu", name = "i", descriptor = "F")
	public static float aFloat214;

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "Lclient!br;")
	public static final Class37 aClass37_9 = new Class37("", 13);

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)V")
	public static void method7895() {
		Static135.anInt2684 = 0;
		Static3.aClass361_1.method7860();
		Static3.aClass361_1.method7855(Static542.aClass1_Sub23_3);
		Static135.anInt2684++;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIZIII)V")
	public static void method7896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == arg3) {
			Static75.method1620(arg0, arg2, arg5, arg3, arg6, arg4);
		} else if (arg6 - arg3 >= Static487.anInt8210 && arg3 + arg6 <= Static278.anInt5111 && arg4 - arg1 >= Static126.anInt6658 && arg4 + arg1 <= Static494.anInt8295) {
			Static138.method2293(arg1, arg4, arg0, arg2, arg6, arg5, arg3);
		} else {
			Static378.method5486(arg3, arg0, arg4, arg5, arg6, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)Lclient!qw;")
	public static Class20_Sub8 method7897(@OriginalArg(1) int arg0) {
		@Pc(7) Class349[] local7 = Class1_Sub3_Sub19.aClass349Array1;
		synchronized (Class1_Sub3_Sub19.aClass349Array1) {
			@Pc(36) Class20_Sub8 local36;
			if (Class1_Sub3_Sub19.aClass349Array1.length <= arg0 || Class1_Sub3_Sub19.aClass349Array1[arg0].method7656()) {
				local36 = new Class20_Sub8();
				local36.aClass20_Sub3Array1 = new Class20_Sub3[arg0];
				for (@Pc(42) int local42 = 0; local42 < arg0; local42++) {
					local36.aClass20_Sub3Array1[local42] = new Class20_Sub3();
				}
			} else {
				local36 = (Class20_Sub8) Class1_Sub3_Sub19.aClass349Array1[arg0].method7659();
				local36.method7704();
				@Pc(75) int local75 = Static371.anIntArray440[arg0]--;
			}
			return local36;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BI)I")
	public static int method7898(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}
}
