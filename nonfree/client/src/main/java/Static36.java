import java.awt.Canvas;
import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!de", name = "a", descriptor = "Lclient!oa;")
	public static Class64 aClass64_1;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "[Lclient!wd;")
	public static Class97[] aClass97Array1;

	@OriginalMember(owner = "client!de", name = "e", descriptor = "I")
	public static int anInt1022;

	@OriginalMember(owner = "client!de", name = "f", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!de", name = "d", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_658 = Static118.method2249("scape main");

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method671(@OriginalArg(0) Component arg0) {
		@Pc(1) Method local1 = Static32.aMethod1;
		if (local1 != null) {
			try {
				local1.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(19) Throwable local19) {
			}
		}
		arg0.addKeyListener(Static120.aClass53_1);
		arg0.addFocusListener(Static120.aClass53_1);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIII)I")
	public static int method672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}
}
