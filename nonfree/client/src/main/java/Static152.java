import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!fea", name = "t", descriptor = "[Lclient!s;")
	public static Class245[] aClass245Array3;

	@OriginalMember(owner = "client!fea", name = "u", descriptor = "Lclient!la;")
	public static Class6_Sub4_Sub3 aClass6_Sub4_Sub3_2;

	@OriginalMember(owner = "client!fea", name = "v", descriptor = "Lclient!cf;")
	public static Class6_Sub12 aClass6_Sub12_1;

	@OriginalMember(owner = "client!fea", name = "x", descriptor = "Lclient!ni;")
	public static Class223 aClass223_42;

	@OriginalMember(owner = "client!fea", name = "z", descriptor = "I")
	public static int anInt3555;

	@OriginalMember(owner = "client!fea", name = "s", descriptor = "Lclient!gea;")
	public static final Class117 aClass117_2 = new Class117(16);

	@OriginalMember(owner = "client!fea", name = "w", descriptor = "Z")
	public static boolean aBoolean280 = false;

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(II)Z")
	public static boolean method3040(@OriginalArg(0) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Z)V")
	public static void method3042() {
		Static248.method4432();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static313.aClass258Array1[local8].method6645();
		}
		Static485.method7134();
		Static234.method4283();
		Static523.method7457();
		System.gc();
		Static467.aClass5_13.ya();
	}
}
