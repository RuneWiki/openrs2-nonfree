import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
	public static int anInt8524;

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "Z")
	public static boolean aBoolean634 = false;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IBLclient!eq;Lclient!d;Ljava/awt/Canvas;)Lclient!ha;")
	public static Class87 method7172(@OriginalArg(0) int arg0, @OriginalArg(2) Class97 arg1, @OriginalArg(3) Interface6 arg2, @OriginalArg(4) Canvas arg3) {
		if (!Static134.method2603()) {
			throw new RuntimeException("");
		} else if (Static472.method6791("jaggl")) {
			@Pc(26) OpenGL local26 = new OpenGL();
			@Pc(46) long local46 = local26.init(arg3, 8, 8, 8, 24, 0, arg0);
			if (local46 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(65) Class87_Sub1_Sub1 local65 = new Class87_Sub1_Sub1(local26, arg3, local46, arg2, arg1, arg0);
			local65.method5151();
			return local65;
		} else {
			throw new RuntimeException("");
		}
	}
}
