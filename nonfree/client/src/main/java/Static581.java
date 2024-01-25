import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static581 {

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "Lclient!sja;")
	public static final Class342 aClass342_71 = new Class342();

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
	public static int anInt8861 = 0;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)Z")
	public static boolean method7514(@OriginalArg(0) int arg0) {
		return arg0 == 9 || arg0 == 10;
	}
}
