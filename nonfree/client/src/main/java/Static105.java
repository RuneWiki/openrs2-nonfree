import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static105 {

	@OriginalMember(owner = "client!ji", name = "U", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!ji", name = "W", descriptor = "I")
	public static int anInt2299;

	@OriginalMember(owner = "client!ji", name = "db", descriptor = "I")
	public static int anInt2303;

	@OriginalMember(owner = "client!ji", name = "ab", descriptor = "J")
	public static long aLong92 = 0L;

	@OriginalMember(owner = "client!ji", name = "bb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_626 = Static231.method3737("<img=0>");

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZZI)Lclient!sc;")
	public static Class107 method1795(@OriginalArg(2) int arg0) {
		return Static7.method243(true, arg0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIBIIII)V")
	public static void method1797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static224.method3669(arg5)) {
			Static34.method673(Static6.aClass86ArrayArray11[arg5], -1, arg4, arg2, arg3, arg6, arg1, arg0);
		}
	}
}
