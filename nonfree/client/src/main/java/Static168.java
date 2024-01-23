import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "Lclient!gf;")
	public static Class62 aClass62_7;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "[I")
	public static int[] anIntArray375 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
	public static int anInt3095 = 0;

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
	public static int anInt3097 = 0;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZIILclient!ak;II)V")
	public static void method2552(@OriginalArg(3) Class7 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		Static186.anInt3480 = arg2;
		Static289.anInt5738 = 0;
		Static279.anInt5596 = arg1;
		Static151.anInt2792 = 10000;
		Static137.anInt3867 = 1;
		Static17.aBoolean34 = false;
		Static262.aClass7_210 = arg0;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)V")
	public static void method2553(@OriginalArg(1) int arg0) {
		@Pc(14) Class1_Sub2_Sub11 local14 = Static163.method3579(1, arg0);
		local14.method1853();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!ak;III)Lclient!rg;")
	public static Class48_Sub2 method2554(@OriginalArg(0) Class7 arg0, @OriginalArg(2) int arg1) {
		return Static139.method2193(arg0, arg1, 0) ? Static12.method268() : null;
	}
}
