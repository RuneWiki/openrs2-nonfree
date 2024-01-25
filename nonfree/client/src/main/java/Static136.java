import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!fba", name = "W", descriptor = "I")
	public static int anInt2885;

	@OriginalMember(owner = "client!fba", name = "S", descriptor = "Lclient!gl;")
	public static final Class117 aClass117_4 = new Class117(10, -1);

	@OriginalMember(owner = "client!fba", name = "V", descriptor = "I")
	public static int anInt2884 = 0;

	@OriginalMember(owner = "client!fba", name = "e", descriptor = "(III)Z")
	public static boolean method2551(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) boolean local22 = (arg1 & 0x37) == 0 ? Static331.method8155(arg1, arg0) : Static104.method6583(arg0, arg1);
		return local22 | (arg0 & 0x10000) != 0 | Static396.method6260(arg1, arg0);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIBII)V")
	public static void method2552(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static289.anInt5545 = arg0;
		Static376.anInt7071 = 0;
		Static96.anInt2302 = 0;
		Class179_Sub2.lb = arg1;
	}

	@OriginalMember(owner = "client!fba", name = "d", descriptor = "(B)V")
	public static void method2556() {
		Static258.aClass6_Sub10_Sub1_2.method1532();
		Static463.anInt8569 = 1;
		Static329.aClass168_79 = null;
	}
}
