import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!js", name = "b", descriptor = "D")
	public static double aDouble12;

	@OriginalMember(owner = "client!js", name = "c", descriptor = "Lclient!sf;")
	public static final Class312 aClass312_3 = new Class312("", 10);

	@OriginalMember(owner = "client!js", name = "g", descriptor = "I")
	public static int anInt5108 = 0;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/awt/Canvas;Lclient!d;III)Lclient!ha;")
	public static Class13 method4489(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new oa(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIII)V")
	public static void method4490(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static346.anInt5494 <= arg0 && arg0 <= Static640.anInt10333) {
			@Pc(23) int local23 = Static117.method5173(Static566.anInt9279, arg2, Static392.anInt6753);
			@Pc(31) int local31 = Static117.method5173(Static566.anInt9279, arg1, Static392.anInt6753);
			Static144.method2593(local31, arg0, local23, arg3);
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(B)Lclient!tw;")
	public static Class124 method4491() {
		try {
			return (Class124) Class.forName("Class124_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(19) Throwable local19) {
			return new Class124_Sub2();
		}
	}
}
