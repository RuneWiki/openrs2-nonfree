import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
	public static int anInt3107 = 0;

	@OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
	public static int anInt3110 = 0;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)Z")
	public static boolean method2685(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static523.method7738(arg1, arg0) | (arg1 & 0x60000) != 0 || Static476.method7031(arg1, arg0);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBI)Z")
	public static boolean method2686(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!fc;Ljava/lang/String;ZZ)V")
	public static void method2687(@OriginalArg(1) Class100 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		if (!arg2) {
			Static208.method3586(arg1, 3, arg0);
			return;
		}
		@Pc(31) String local31;
		if (Static144.aString33.startsWith("win") && arg0.aBoolean194) {
			local31 = null;
			if (Static7.anApplet1 != null) {
				local31 = Static7.anApplet1.getParameter("haveie6");
			}
			if (local31 == null || !local31.equals("1")) {
				@Pc(49) Class91 local49 = Static208.method3586(arg1, 0, arg0);
				Static104.aClass91_2 = local49;
				Static350.aClass100_15 = arg0;
				Static239.aString46 = arg1;
				return;
			}
		}
		if (Static144.aString33.startsWith("mac")) {
			local31 = null;
			if (Static7.anApplet1 != null) {
				local31 = Static7.anApplet1.getParameter("havefirefox");
			}
			if (local31 != null && local31.equals("1") && arg3) {
				Static208.method3586(arg1, 1, arg0);
				return;
			}
		}
		Static208.method3586(arg1, 2, arg0);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!la;Ljava/awt/Canvas;IIBLclient!d;)Lclient!ha;")
	public static Class133 method2688(@OriginalArg(0) Class207 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Interface3 arg4) {
		@Pc(5) int local5 = 0;
		@Pc(12) int local12 = 0;
		if (arg1 != null) {
			@Pc(17) Dimension local17 = arg1.getSize();
			local5 = local17.width;
			local12 = local17.height;
		}
		return Static193.method7280(arg3, arg2, local12, arg1, arg4, local5, arg0);
	}
}
