import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static194 {

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "Lclient!of;")
	public static final Class188 aClass188_32 = new Class188(5);

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "[I")
	public static final int[] anIntArray279 = new int[25];

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
	public static void method2776() {
		Static377.anInt6585 = 0;
		Static93.aClass181_7.method3969();
		Static45.aBoolean34 = false;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(CI)Z")
	public static boolean method2778(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
