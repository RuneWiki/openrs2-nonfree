import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!km", name = "H", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_103 = new Class225(103, 10);

	@OriginalMember(owner = "client!km", name = "O", descriptor = "I")
	public static int anInt5253 = 0;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/awt/Canvas;ILclient!nca;BLclient!d;)Lclient!ha;")
	public static Class145 method4724(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(4) Interface3 arg3) {
		if (!Static604.method8252()) {
			throw new RuntimeException("");
		} else if (Static548.method7659("jaggl")) {
			@Pc(36) OpenGL local36 = new OpenGL();
			@Pc(46) long local46 = local36.init(arg0, 8, 8, 8, 24, 0, arg1);
			if (local46 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(68) Class145_Sub1_Sub1 local68 = new Class145_Sub1_Sub1(local36, arg0, local46, arg3, arg2, arg1);
			local68.method9765();
			return local68;
		} else {
			throw new RuntimeException("");
		}
	}
}
