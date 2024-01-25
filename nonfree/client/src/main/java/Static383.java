import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!ol", name = "k", descriptor = "Lclient!qca;")
	public static Class273 aClass273_3;

	@OriginalMember(owner = "client!ol", name = "o", descriptor = "Ljava/awt/Image;")
	public static Image anImage12;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!ft;ILjava/lang/String;ZZ)V")
	public static void method5284(@OriginalArg(0) Class109 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3) {
			Static248.method3684(arg1, 3, arg0);
			return;
		}
		@Pc(19) String local19;
		if (Static148.aString19.startsWith("win") && arg0.aBoolean206) {
			local19 = null;
			if (Static590.anApplet2 != null) {
				local19 = Static590.anApplet2.getParameter("haveie6");
			}
			if (local19 == null || !local19.equals("1")) {
				@Pc(37) Class260 local37 = Static248.method3684(arg1, 0, arg0);
				Static130.aClass260_4 = local37;
				Static4.aString2 = arg1;
				Static223.aClass109_7 = arg0;
				return;
			}
		}
		if (Static148.aString19.startsWith("mac")) {
			local19 = null;
			if (Static590.anApplet2 != null) {
				local19 = Static590.anApplet2.getParameter("havefirefox");
			}
			if (local19 != null && local19.equals("1") && arg2) {
				Static248.method3684(arg1, 1, arg0);
				return;
			}
		}
		Static248.method3684(arg1, 2, arg0);
	}
}
