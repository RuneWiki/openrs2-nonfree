import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
	public static int anInt2332;

	@OriginalMember(owner = "client!fj", name = "h", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray16;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BI)Z")
	public static boolean method2066(@OriginalArg(1) int arg0) {
		if (arg0 == 44 || arg0 == 9 || arg0 == 19 || arg0 == 16 || arg0 == 12) {
			return true;
		} else {
			return arg0 == 25 || arg0 == 1006;
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)V")
	public static void method2068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class96 local10 = new Class96(16);
		for (@Pc(15) Class1_Sub25 local15 = (Class1_Sub25) Static129.aClass96_24.method2342(); local15 != null; local15 = (Class1_Sub25) Static129.aClass96_24.method2339()) {
			local15.method6020();
			@Pc(28) int local28 = (int) (local15.aLong222 >> 28);
			@Pc(39) int local39 = (int) (local15.aLong222 >> 14 & 0x3FFFL) - arg0;
			@Pc(48) int local48 = (int) (local15.aLong222 & 0x3FFFL) - arg1;
			if (local48 >= 0 && local39 >= 0 && Static195.anInt3537 > local48 && local39 < Static118.anInt2419) {
				local10.method2341((long) (local48 | local39 << 14 | local28 << 28), local15);
			}
		}
		Static129.aClass96_24 = local10;
	}
}
