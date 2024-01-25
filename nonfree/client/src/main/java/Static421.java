import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!rca", name = "K", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!rca", name = "N", descriptor = "Lclient!dm;")
	public static Class73 aClass73_66 = new Class73();

	@OriginalMember(owner = "client!rca", name = "P", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_71 = new Class77(50, -1);

	@OriginalMember(owner = "client!rca", name = "h", descriptor = "(I)Ljava/lang/String;")
	public static String method6532() {
		@Pc(7) String local7 = "www";
		if (Static79.aClass285_2 == Static497.aClass285_6) {
			local7 = "www-wtrc";
		} else if (Static79.aClass285_2 == Class12_Sub13_Sub2.lb) {
			local7 = "www-wtqa";
		} else if (Static66.aClass285_1 == Static79.aClass285_2) {
			local7 = "www-wtwip";
		}
		@Pc(28) String local28 = "";
		if (Static366.aString103 != null) {
			local28 = "/p=" + Static366.aString103;
		}
		return "http://" + local7 + "." + Static293.aClass138_7.aString39 + ".com/l=" + Static345.anInt6495 + "/a=" + Static423.anInt79 + local28 + "/";
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(CI)I")
	public static int method6533(@OriginalArg(0) char arg0) {
		return arg0 >= '\u0000' && arg0 < Class5.anIntArray11.length ? Class5.anIntArray11[arg0] : -1;
	}
}
