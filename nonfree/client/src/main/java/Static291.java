import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas6;

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "Lclient!pt;")
	public static Class201 aClass201_5;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_124 = new Class25(62, 16);

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_125 = new Class25(108, 0);

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZIIII)V")
	public static void method4115(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static332.aLong306 = 0L;
		@Pc(8) int local8 = Static235.method3217();
		if (arg3 == 3 || local8 == 3) {
			arg0 = true;
		}
		if (!Static257.aClass75_8.method6017()) {
			arg0 = true;
		}
		Static329.method4692(arg3, arg2, arg0, arg1, local8);
	}
}
