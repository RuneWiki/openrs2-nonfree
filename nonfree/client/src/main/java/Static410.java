import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static410 {

	@OriginalMember(owner = "client!rca", name = "D", descriptor = "I")
	public static int anInt7286;

	@OriginalMember(owner = "client!rca", name = "H", descriptor = "Lclient!kr;")
	public static Class171 aClass171_127;

	@OriginalMember(owner = "client!rca", name = "I", descriptor = "I")
	public static int anInt7289;

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(III)Z")
	public static boolean method6096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x60000) != 0 | Static137.method2259(arg0, arg1) || Static396.method5968(arg1, arg0);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IZI)Z")
	public static boolean method6097(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x40000) != 0 | Static85.method1465(arg1, arg0) || Static210.method3585(arg1, arg0);
	}
}
