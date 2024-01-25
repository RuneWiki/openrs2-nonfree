import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static14 {

	@OriginalMember(owner = "client!aha", name = "B", descriptor = "I")
	public static int anInt194 = 16777215;

	@OriginalMember(owner = "client!aha", name = "t", descriptor = "Z")
	public static boolean aBoolean20 = false;

	@OriginalMember(owner = "client!aha", name = "q", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_3 = new Class322(111, 6);

	@OriginalMember(owner = "client!aha", name = "C", descriptor = "I")
	public static int anInt211 = 0;

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(III)Z")
	public static boolean method189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static622.method8537(arg0, arg1) & Static325.method5113(arg0, arg1);
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V")
	public static void method193(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5) {
		Static601.method8306(arg1, arg5, arg2, arg4, (String) null, arg0, -1, arg3);
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(BI)V")
	public static void method196(@OriginalArg(1) int arg0) {
		Static59.anInt723 = arg0;
		Static556.aClass359_50.method8507();
	}
}
