import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static228 {

	@OriginalMember(owner = "client!io", name = "q", descriptor = "I")
	public static int anInt4743;

	@OriginalMember(owner = "client!io", name = "r", descriptor = "I")
	public static int anInt4744;

	@OriginalMember(owner = "client!io", name = "o", descriptor = "Lclient!bca;")
	public static final Class26 aClass26_3 = new Class26("", 14);

	@OriginalMember(owner = "client!io", name = "t", descriptor = "I")
	public static int anInt4746 = 104;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIZ)V")
	public static void method4071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 < arg1) {
			Static115.method2332(arg3, arg1, arg0, Static183.anIntArrayArray26[arg2]);
		} else {
			Static115.method2332(arg1, arg3, arg0, Static183.anIntArrayArray26[arg2]);
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method4072(@OriginalArg(0) String arg0) {
		return Static105.method2177(10, arg0);
	}
}
