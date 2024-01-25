import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static382 {

	@OriginalMember(owner = "client!ps", name = "F", descriptor = "I")
	public static int anInt6788;

	@OriginalMember(owner = "client!ps", name = "L", descriptor = "I")
	public static int anInt6794;

	@OriginalMember(owner = "client!ps", name = "X", descriptor = "Ljava/lang/String;")
	public static String aString174 = null;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILclient!dn;)V")
	public static void method6134(@OriginalArg(1) Class69 arg0) {
		Static447.anInt7829 = arg0.method1909("p11_full");
		Static226.anInt4370 = arg0.method1909("p12_full");
		Static54.anInt1389 = arg0.method1909("b12_full");
		Static167.anInt3396 = arg0.method1909("hitmarks");
		Static160.anInt8955 = arg0.method1909("hitbar_default");
		Static258.anInt5018 = arg0.method1909("timerbar_default");
		Static75.anInt1800 = arg0.method1909("headicons_pk");
		Static330.anInt6193 = arg0.method1909("headicons_prayer");
		Static72.anInt1757 = arg0.method1909("hint_headicons");
		Static327.anInt6160 = arg0.method1909("hint_mapmarkers");
		Static331.anInt6196 = arg0.method1909("mapflag");
		Static467.anInt8075 = arg0.method1909("cross");
		Static465.anInt8015 = arg0.method1909("mapdots");
		Static221.anInt4327 = arg0.method1909("scrollbar");
		Static233.anInt4513 = arg0.method1909("name_icons");
		Static519.anInt2067 = arg0.method1909("floorshadows");
		Static325.anInt6146 = arg0.method1909("compass");
		Static183.anInt3825 = arg0.method1909("otherlevel");
		Static451.anInt7892 = arg0.method1909("hint_mapedge");
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IB)V")
	public static void method6135(@OriginalArg(0) int arg0) {
		Static313.anInt5997 = -1;
		if (arg0 == 37) {
			Static335.aFloat104 = 3.0F;
		} else if (arg0 == 50) {
			Static335.aFloat104 = 4.0F;
		} else if (arg0 == 75) {
			Static335.aFloat104 = 6.0F;
		} else if (arg0 == 100) {
			Static335.aFloat104 = 8.0F;
		} else if (arg0 == 200) {
			Static335.aFloat104 = 16.0F;
		}
		Static313.anInt5997 = -1;
	}
}
