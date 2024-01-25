import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!af", name = "i", descriptor = "Lclient!an;")
	public static Class16 aClass16_3;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "Lclient!cba;")
	public static Class45 aClass45_4 = null;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)Lclient!fl;")
	public static Class102 method290(@OriginalArg(0) int arg0) {
		@Pc(10) Class102 local10 = (Class102) Static497.aClass125_64.method3446((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static300.aClass16_74.method408(1, arg0);
		local10 = new Class102();
		local10.anInt3119 = arg0;
		if (local20 != null) {
			local10.method2817(new Class12_Sub8(local20));
		}
		local10.method2816();
		if (local10.anInt3110 == 2 && Static72.aClass68_12.method1917((long) arg0) == null) {
			Static72.aClass68_12.method1916(new Class12_Sub18(Static169.anInt3892), (long) arg0);
			Static206.aClass102Array139[Static169.anInt3892++] = local10;
		}
		Static497.aClass125_64.method3437(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZZ)V")
	public static void method291(@OriginalArg(1) boolean arg0) {
		if (Static491.aClass277_2 != null) {
			Static491.aClass277_2.method7170();
			Static491.aClass277_2 = null;
		}
		Static145.anInt3193 = 0;
		Static514.method1479();
		Static500.method7435();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static510.aClass184Array1[local19].method4591();
		}
		Static490.method7294(false);
		System.gc();
		Static408.method6389();
		Static471.anInt8643 = -1;
		Static542.aBoolean685 = false;
		Static381.method6031(true);
		Static492.anInt8088 = 0;
		Static61.anInt1459 = 0;
		Static203.anInt4534 = 0;
		Static184.anInt4228 = 0;
		Static58.anInt1424 = 0;
		Static248.anInt5103 = 0;
		for (@Pc(60) int local60 = 0; local60 < Static22.aClass76Array28.length; local60++) {
			Static22.aClass76Array28[local60] = null;
		}
		Static538.method7929();
		for (@Pc(79) int local79 = 0; local79 < 2048; local79++) {
			Static90.aClass30_Sub1_Sub1_Sub1Array1[local79] = null;
		}
		Static451.anInt4553 = 0;
		Static29.aClass68_7.method1922();
		Static328.anInt6238 = 0;
		Static295.aClass68_45.method1922();
		Static255.method4376();
		Static105.anInt2402 = 0;
		Static393.aClass31_1.method794();
		Static263.method7118();
		Static247.method4266();
		Static479.aClass12_Sub37_2 = null;
		Static234.aLong129 = 0L;
		if (arg0) {
			Static9.method278(11);
			return;
		}
		Static9.method278(2);
		try {
			Static549.method683(Static375.aClass71_3.anApplet1, "loggedout");
		} catch (@Pc(133) Throwable local133) {
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(I)I")
	public static int method292() {
		return Static98.anInt2284;
	}
}
