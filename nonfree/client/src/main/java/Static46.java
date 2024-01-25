import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "B")
	public static byte aByte13;

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "Lclient!vo;")
	public static Class348 aClass348_22;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_18 = new Class90(51, 8);

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
	public static int anInt1310 = 16777215;

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_10 = new Class344(25, 3);

	@OriginalMember(owner = "client!bn", name = "h", descriptor = "Z")
	public static boolean aBoolean115 = false;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IBIIIIIII)V")
	public static void method1131(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5) {
		Static526.method7451(arg2, arg1, arg5, arg0, arg4, arg3, 0);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IBII)V")
	public static void method1133(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class4_Sub6_Sub5 local8 = Static396.method6079(arg0, 9);
		local8.method2303();
		local8.anInt2865 = arg1;
		local8.anInt2872 = arg2;
	}
}
