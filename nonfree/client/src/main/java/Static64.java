import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!el", name = "l", descriptor = "I")
	public static int anInt1379;

	@OriginalMember(owner = "client!el", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString80 = "slide:";

	@OriginalMember(owner = "client!el", name = "d", descriptor = "I")
	public static volatile int anInt1373 = -1;

	@OriginalMember(owner = "client!el", name = "f", descriptor = "I")
	public static int anInt1375 = 128;

	@OriginalMember(owner = "client!el", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString81 = " is already on your friend list.";

	@OriginalMember(owner = "client!el", name = "s", descriptor = "I")
	public static int anInt1382 = -2;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BLclient!km;)V")
	public static void method1188(@OriginalArg(1) Class91 arg0) {
		Static181.aClass91_145 = arg0;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(II)Lclient!r;")
	public static Class142 method1189(@OriginalArg(0) int arg0) {
		@Pc(10) Class142 local10 = (Class142) Static254.aClass135_33.method3316((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static5.aClass91_8.method2495(31, arg0);
		local10 = new Class142();
		if (local22 != null) {
			local10.method3474(arg0, new Class1_Sub11(local22));
		}
		Static254.aClass135_33.method3321((long) arg0, local10);
		return local10;
	}
}
