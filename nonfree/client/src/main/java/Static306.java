import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!lf", name = "w", descriptor = "Lclient!tw;")
	public static Class325 aClass325_1 = new Class325();

	@OriginalMember(owner = "client!lf", name = "x", descriptor = "Z")
	public static boolean aBoolean385 = false;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)V")
	public static void method4607(@OriginalArg(1) int arg0) {
		if (!Static348.aClass3_Sub51_Sub1_5.aBoolean672) {
			arg0 = -1;
		}
		if (arg0 == Static286.anInt5362) {
			return;
		}
		if (arg0 != -1) {
			@Pc(25) Class61 local25 = Static198.aClass210_2.method4926(arg0);
			@Pc(29) Class365 local29 = local25.method1825();
			if (local29 == null) {
				arg0 = -1;
			} else {
				Static467.aClass168_12.method4088(new Point(local25.anInt2098, local25.anInt2107), local29.method8166(), local29.method8160(), local29.method8161(), Static129.aCanvas6);
				Static286.anInt5362 = arg0;
			}
		}
		if (arg0 == -1 && Static286.anInt5362 != -1) {
			Static467.aClass168_12.method4088(new Point(), null, -1, -1, Static129.aCanvas6);
			Static286.anInt5362 = -1;
		}
	}
}
