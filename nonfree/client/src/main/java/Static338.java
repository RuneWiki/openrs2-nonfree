import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "I")
	public static int anInt5506;

	@OriginalMember(owner = "client!qu", name = "f", descriptor = "Lclient!rk;")
	public static Class220 aClass220_5;

	@OriginalMember(owner = "client!qu", name = "g", descriptor = "Lclient!kq;")
	public static Class152 aClass152_4;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_207 = new Class56(23, -2);

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_100 = new Class15("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!qu", name = "e", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method4460(@OriginalArg(0) int arg0) {
		@Pc(12) String local12 = Integer.toString(arg0);
		for (@Pc(17) int local17 = local12.length() - 3; local17 > 0; local17 -= 3) {
			local12 = local12.substring(0, local17) + "," + local12.substring(local17);
		}
		if (local12.length() > 9) {
			return " <col=00ff80>" + local12.substring(0, local12.length() - 8) + Static295.aClass15_82.method180(Static429.anInt6999) + " (" + local12 + ")</col>";
		} else if (local12.length() > 6) {
			return " <col=ffffff>" + local12.substring(0, local12.length() - 4) + Static396.aClass15_118.method180(Static429.anInt6999) + " (" + local12 + ")</col>";
		} else {
			return " <col=ffff00>" + local12 + "</col>";
		}
	}
}
