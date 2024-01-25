import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!mu", name = "C", descriptor = "Lclient!eo;")
	public static final Class102 aClass102_3 = new Class102();

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!cb;BLclient!d;Ljava/awt/Canvas;I)Lclient!ha;")
	public static Class143 method5573(@OriginalArg(0) Class50 arg0, @OriginalArg(2) Interface3 arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) int arg3) {
		if (!Static257.method3598()) {
			throw new RuntimeException("");
		} else if (Static374.method6479("jaggl")) {
			@Pc(24) OpenGL local24 = new OpenGL();
			@Pc(34) long local34 = local24.init(arg2, 8, 8, 8, 24, 0, arg3);
			if (local34 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(53) Class143_Sub1_Sub2 local53 = new Class143_Sub1_Sub2(local24, arg2, local34, arg1, arg0, arg3);
			local53.method6287();
			return local53;
		} else {
			throw new RuntimeException("");
		}
	}
}
