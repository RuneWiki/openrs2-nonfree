import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "Lclient!np;")
	public static Class155 aClass155_8;

	@OriginalMember(owner = "client!sg", name = "q", descriptor = "Lclient!wp;")
	public static Interface10 anInterface10_8;

	@OriginalMember(owner = "client!sg", name = "n", descriptor = "Lclient!us;")
	public static final Class234 aClass234_118 = new Class234(55, 0);

	@OriginalMember(owner = "client!sg", name = "o", descriptor = "[I")
	public static final int[] anIntArray630 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!sg", name = "r", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_82 = new Class244(44, 7);

	@OriginalMember(owner = "client!sg", name = "s", descriptor = "Lclient!dt;")
	public static Class62 aClass62_18 = null;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I")
	public static int method5206(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5208(@OriginalArg(0) String arg0) {
		if (Static54.aClass236Array1 != null) {
			Static229.method3783(Static189.aClass244_47);
			Static23.aClass3_Sub5_Sub1_1.method2791(Static269.method4260(arg0));
			Static23.aClass3_Sub5_Sub1_1.method2768(arg0);
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)V")
	public static void method5209() {
		Static179.aClass139_37.method3083(50);
		Static103.aClass139_21.method3083(50);
		Static322.aClass139_82.method3083(50);
		Static212.aClass139_45.method3083(50);
		Static116.aClass139_25.method3083(50);
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V")
	public static void method5210() {
		for (@Pc(10) Class3_Sub10 local10 = (Class3_Sub10) Static142.aClass138_17.method3051(); local10 != null; local10 = (Class3_Sub10) Static142.aClass138_17.method3050()) {
			if (local10.aBoolean128) {
				local10.method1310();
			}
		}
		for (@Pc(37) Class3_Sub10 local37 = (Class3_Sub10) Static185.aClass138_23.method3051(); local37 != null; local37 = (Class3_Sub10) Static185.aClass138_23.method3050()) {
			if (local37.aBoolean128) {
				local37.method1310();
			}
		}
	}
}
