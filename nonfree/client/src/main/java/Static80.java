import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "Lclient!ua;")
	public static Class24_Sub1 aClass24_Sub1_13;

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "[Lclient!je;")
	public static Class40[] aClass40Array10;

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!oa", name = "H", descriptor = "Lclient!je;")
	private static Class40 aClass40_1056 = Static69.method1231("Drop");

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "Lclient!je;")
	public static Class40 aClass40_1055 = aClass40_1056;

	@OriginalMember(owner = "client!oa", name = "G", descriptor = "I")
	public static int anInt2082 = 0;

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "Lclient!je;")
	public static Class40 aClass40_1057 = Static69.method1231("(U2");

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(III)I")
	public static int method1407(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static48.method873(4, arg1 + 91923, arg0 + 45365) + (Static48.method873(2, arg1 + 37821, arg0 + 10294) + -128 >> 1) + (Static48.method873(1, arg1, arg0) - 128 >> 2) - 128;
		local40 = (int) ((double) local40 * 0.3D) + 35;
		if (local40 < 10) {
			local40 = 10;
		} else if (local40 > 60) {
			local40 = 60;
		}
		return local40;
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)V")
	public static void method1408() {
		aClass40_1057 = null;
		aClass24_Sub1_13 = null;
		aCanvas1 = null;
		aClass40_1055 = null;
		aClass40Array10 = null;
		aClass40_1056 = null;
	}
}
