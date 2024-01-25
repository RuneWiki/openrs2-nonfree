import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
	public static int anInt7679 = 0;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!gj;ZILjava/awt/Canvas;Lclient!d;)Lclient!ha;")
	public static Class16 method6428(@OriginalArg(0) Class143 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) Interface5 arg3) {
		if (!Static35.method1089()) {
			throw new RuntimeException("");
		} else if (Static519.method7352("jaggl")) {
			@Pc(34) OpenGL local34 = new OpenGL();
			@Pc(44) long local44 = local34.init(arg2, 8, 8, 8, 24, 0, arg1);
			if (local44 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(63) Class16_Sub1_Sub2 local63 = new Class16_Sub1_Sub2(local34, arg2, local44, arg3, arg0, arg1);
			local63.method6220();
			return local63;
		} else {
			throw new RuntimeException("");
		}
	}
}
