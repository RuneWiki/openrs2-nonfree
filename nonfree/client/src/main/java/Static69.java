import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "Lclient!la;")
	public static Class208 aClass208_12;

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "F")
	public static float aFloat8;

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
	public static int anInt1122;

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
	public static int anInt1123 = 0;

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
	public static void method1117() {
		Static232.method3378();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(JIIIZLclient!la;I)V")
	public static void method1119(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Class208 arg3) {
		Static466.method6818(arg0, arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILjava/awt/Canvas;Lclient!la;Lclient!d;I)Lclient!ha;")
	public static Class57 method1120(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Class208 arg1, @OriginalArg(3) Interface1 arg2, @OriginalArg(4) int arg3) {
		if (!Static661.method9148()) {
			throw new RuntimeException("");
		} else if (Static513.method7491("jaggl")) {
			@Pc(28) OpenGL local28 = new OpenGL();
			@Pc(38) long local38 = local28.init(arg0, 8, 8, 8, 24, 0, arg3);
			if (local38 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(66) Class57_Sub3_Sub1 local66 = new Class57_Sub3_Sub1(local28, arg0, local38, arg2, arg1, arg3);
			local66.method7755();
			return local66;
		} else {
			throw new RuntimeException("");
		}
	}
}
