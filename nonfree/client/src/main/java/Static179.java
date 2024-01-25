import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
	public static int anInt3616;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
	public static int anInt3618;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
	public static int anInt3617 = 0;

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
	public static int anInt3619 = 0;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!fa;ILclient!jn;Ljava/awt/Canvas;I)Lclient!r;")
	public static Class44 method3232(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class176 arg2, @OriginalArg(3) Canvas arg3) {
		if (!Static52.method684()) {
			throw new RuntimeException("");
		} else if (Static138.method2728("jaggl")) {
			@Pc(24) OpenGL local24 = new OpenGL();
			@Pc(34) long local34 = local24.init(arg3, 8, 8, 8, 24, 0, arg1);
			if (local34 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(58) Class44_Sub2_Sub1 local58 = new Class44_Sub2_Sub1(local24, arg3, local34, arg0, arg2, arg1);
			local58.method4294();
			return local58;
		} else {
			throw new RuntimeException("");
		}
	}
}
