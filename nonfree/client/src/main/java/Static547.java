import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!th", name = "b", descriptor = "D")
	public static double aDouble4;

	@OriginalMember(owner = "client!th", name = "h", descriptor = "Lclient!jp;")
	public static Class177 aClass177_2;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "I")
	public static int anInt1286 = 0;

	@OriginalMember(owner = "client!th", name = "d", descriptor = "I")
	public static int anInt1288 = 2;

	@OriginalMember(owner = "client!th", name = "i", descriptor = "I")
	public static int anInt1290 = 0;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IILclient!ha;IIIILclient!aj;IBII)V")
	public static void method1364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class3_Sub4_Sub1 arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg3 > arg5 && arg3 < arg6 + arg5 && arg10 - 13 < arg0 && arg0 < arg10 + 3) {
			arg1 = arg8;
		}
		@Pc(39) String local39 = Static36.method1271(arg7);
		Static460.aClass62_9.method8360(Static167.aClass24Array8, arg1, Static51.anIntArray48, arg10, local39, arg5 + 3);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILclient!os;)V")
	public static void method1366(@OriginalArg(1) Class3_Sub7 arg0) {
		arg0.aBoolean732 = false;
		if (arg0.aClass3_Sub30_6 != null) {
			arg0.aClass3_Sub30_6.anInt4760 = 0;
		}
		for (@Pc(18) Class3_Sub7 local18 = arg0.method8761(); local18 != null; local18 = arg0.method8760()) {
			method1366(local18);
		}
	}
}
