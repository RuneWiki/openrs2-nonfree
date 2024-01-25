import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!eba", name = "e", descriptor = "I")
	public static int anInt2937;

	@OriginalMember(owner = "client!eba", name = "w", descriptor = "Lclient!ac;")
	public static Class5 aClass5_9;

	@OriginalMember(owner = "client!eba", name = "k", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_29 = new Class218(9, -1);

	@OriginalMember(owner = "client!eba", name = "q", descriptor = "Lclient!us;")
	public static final Class344 aClass344_28 = new Class344(60, 2);

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!kha;ZILjava/awt/Canvas;Lclient!d;)Lclient!ha;")
	public static Class33 method2720(@OriginalArg(0) Class181 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) Interface5 arg3) {
		if (!Static211.method4161()) {
			throw new RuntimeException("");
		} else if (Static30.method575("jaggl")) {
			@Pc(24) OpenGL local24 = new OpenGL();
			@Pc(34) long local34 = local24.init(arg2, 8, 8, 8, 24, 0, arg1);
			if (local34 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(53) Class33_Sub1_Sub1 local53 = new Class33_Sub1_Sub1(local24, arg2, local34, arg3, arg0, arg1);
			local53.method2116();
			return local53;
		} else {
			throw new RuntimeException("");
		}
	}
}
