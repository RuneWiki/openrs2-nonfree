import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static434 {

	@OriginalMember(owner = "client!vu", name = "J", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray42;

	@OriginalMember(owner = "client!vu", name = "L", descriptor = "I")
	public static int anInt7227;

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "(III)Z")
	public static boolean method5578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static435.method5599(arg1, arg0) || Static74.method1341(arg1, arg0);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IB)V")
	public static void method5579() {
		Static86.aClass69_60.method1594(5);
	}
}
