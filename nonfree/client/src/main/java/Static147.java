import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
	public static int anInt2831;

	@OriginalMember(owner = "client!fl", name = "F", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_76 = new Class81(100, 1);

	@OriginalMember(owner = "client!fl", name = "I", descriptor = "I")
	public static int anInt2829 = -1;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IILclient!ga;Lclient!fa;Ljava/awt/Canvas;)Lclient!r;")
	public static Class12 method2384(@OriginalArg(0) int arg0, @OriginalArg(2) Class111 arg1, @OriginalArg(3) Interface5 arg2, @OriginalArg(4) Canvas arg3) {
		if (!Static191.method3385()) {
			throw new RuntimeException("");
		} else if (Static293.method4616("jaggl")) {
			@Pc(29) OpenGL local29 = new OpenGL();
			@Pc(39) long local39 = local29.init(arg3, 8, 8, 8, 24, 0, arg0);
			if (local39 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(58) Class12_Sub2_Sub2 local58 = new Class12_Sub2_Sub2(local29, arg3, local39, arg2, arg1, arg0);
			local58.method6218();
			return local58;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(B)V")
	public static void method2385() {
		Static328.anInt5893 = -1;
		Static389.anInt6778 = 0;
		Static90.anInt1998 = -1;
	}
}
