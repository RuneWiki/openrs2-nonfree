import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "o", descriptor = "[[Lclient!kp;")
	public static Class196[][] aClass196ArrayArray1;

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_3 = new Class363(113, 1);

	@OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
	public static int anInt11 = 0;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!fa;Ljava/awt/Canvas;IBLclient!pl;)Lclient!r;")
	public static Class100 method13(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class259 arg3) {
		if (!Static418.method6042()) {
			throw new RuntimeException("");
		} else if (Static533.method7648("jaggl")) {
			@Pc(29) OpenGL local29 = new OpenGL();
			@Pc(39) long local39 = local29.init(arg1, 8, 8, 8, 24, 0, arg2);
			if (local39 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(58) Class100_Sub1_Sub2 local58 = new Class100_Sub1_Sub2(local29, arg1, local39, arg0, arg3, arg2);
			local58.method4852();
			return local58;
		} else {
			throw new RuntimeException("");
		}
	}
}
