import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!rf", name = "y", descriptor = "Lclient!a;")
	public static Class1_Sub1 aClass1_Sub1_24;

	@OriginalMember(owner = "client!rf", name = "B", descriptor = "Lclient!ve;")
	public static Class3_Sub1_Sub5_Sub4_Sub2 aClass3_Sub1_Sub5_Sub4_Sub2_1;

	@OriginalMember(owner = "client!rf", name = "u", descriptor = "[I")
	public static final int[] anIntArray435 = new int[32];

	@OriginalMember(owner = "client!rf", name = "v", descriptor = "Lclient!af;")
	public static final Class5 aClass5_45 = new Class5(30);

	@OriginalMember(owner = "client!rf", name = "w", descriptor = "Lclient!af;")
	public static final Class5 aClass5_46 = new Class5(200);

	@OriginalMember(owner = "client!rf", name = "x", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1354 = Static120.method1824("Benutzen");

	@OriginalMember(owner = "client!rf", name = "A", descriptor = "Z")
	public static boolean aBoolean143 = false;

	@OriginalMember(owner = "client!rf", name = "C", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1356 = Static120.method1824("::fpson");

	@OriginalMember(owner = "client!rf", name = "D", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1357 = Static120.method1824("(U1");

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIII)V")
	public static void method2498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg2; local7 <= arg1; local7++) {
			Static46.method726(arg4, arg0, Static96.anIntArrayArray27[local7], arg3);
		}
	}
}
