import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!i", name = "u", descriptor = "F")
	public static float aFloat78;

	@OriginalMember(owner = "client!i", name = "v", descriptor = "Lclient!kb;")
	public static Class83 aClass83_68;

	@OriginalMember(owner = "client!i", name = "w", descriptor = "[I")
	public static int[] anIntArray233;

	@OriginalMember(owner = "client!i", name = "x", descriptor = "I")
	public static int anInt2326 = 0;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIZ)V")
	public static void method1759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class1_Sub2_Sub6 local4 = Static104.method831(arg1, 5);
		local4.method1192();
		local4.anInt1565 = arg0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)V")
	public static void method1760(@OriginalArg(0) int arg0) {
		Static205.anInt4563 = arg0;
		Static130.method2205(3);
		Static130.method2205(4);
	}
}
