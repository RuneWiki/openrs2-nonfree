import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static58 {

	@OriginalMember(owner = "client!cca", name = "c", descriptor = "Lclient!tga;")
	public static final Class315 aClass315_3 = new Class315("WTQA", 2);

	@OriginalMember(owner = "client!cca", name = "g", descriptor = "Z")
	public static boolean aBoolean84 = false;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Z)V")
	public static void method855(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static309.aClass100ArrayArrayArray2 = Static391.aClass100ArrayArrayArray3;
			Static112.aClass16Array3 = Static109.aClass16Array2;
		} else {
			Static309.aClass100ArrayArrayArray2 = Static306.aClass100ArrayArrayArray1;
			Static112.aClass16Array3 = Static45.aClass16Array1;
		}
		Static562.anInt9418 = Static309.aClass100ArrayArrayArray2.length;
	}
}
