import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "Lclient!fh;")
	public static Class58 aClass58_36;

	@OriginalMember(owner = "client!eg", name = "s", descriptor = "[Lclient!uj;")
	public static Class4_Sub3_Sub14[] aClass4_Sub3_Sub14Array7;

	@OriginalMember(owner = "client!eg", name = "H", descriptor = "I")
	public static int anInt1244;

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
	public static int anInt1231 = 0;

	@OriginalMember(owner = "client!eg", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString76 = "";

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZIIII)V")
	public static void method1015(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static156.anInt3086 <= arg3 && arg3 <= Static218.anInt4231) {
			@Pc(19) int local19 = Static3.method9(Static48.anInt902, arg0, Static131.anInt2553);
			@Pc(25) int local25 = Static3.method9(Static48.anInt902, arg1, Static131.anInt2553);
			Static130.method1976(local19, local25, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIB)V")
	public static void method1019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) Class4_Sub3_Sub9 local10 = Static43.method2329(8, arg3);
		local10.method1520();
		local10.anInt2001 = arg0;
		local10.anInt1994 = arg1;
		local10.anInt1993 = arg2;
	}
}
