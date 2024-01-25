import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static51 {

	@OriginalMember(owner = "client!cg", name = "r", descriptor = "Ljava/lang/Object;")
	public static Object anObject4;

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "Lclient!s;")
	public static final Class217 aClass217_33 = new Class217(68, 1);

	@OriginalMember(owner = "client!cg", name = "q", descriptor = "[I")
	public static final int[] anIntArray74 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!cg", name = "s", descriptor = "[I")
	public static final int[] anIntArray75 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILclient!ph;)V")
	public static void method859(@OriginalArg(1) Class187 arg0) {
		Static337.anInt5681 = arg0.method4278("p11_full");
		Static95.anInt1954 = arg0.method4278("p12_full");
		Static369.anInt6376 = arg0.method4278("b12_full");
		Static217.anInt4143 = arg0.method4278("hitmarks");
		Static31.anInt521 = arg0.method4278("hitbar_default");
		Static157.anInt3177 = arg0.method4278("timerbar_default");
		Static142.anInt2891 = arg0.method4278("headicons_pk");
		Static211.anInt4098 = arg0.method4278("headicons_prayer");
		Static265.anInt4700 = arg0.method4278("hint_headicons");
		Static63.anInt1162 = arg0.method4278("hint_mapmarkers");
		Static352.anInt6041 = arg0.method4278("mapflag");
		Static13.anInt5111 = arg0.method4278("cross");
		Static254.anInt4573 = arg0.method4278("mapdots");
		Static15.anInt298 = arg0.method4278("scrollbar");
		Static40.anInt655 = arg0.method4278("name_icons");
		Static304.anInt5294 = arg0.method4278("floorshadows");
		Static199.anInt4069 = arg0.method4278("compass");
		Static212.anInt4111 = arg0.method4278("otherlevel");
		Static320.anInt5510 = arg0.method4278("hint_mapedge");
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(Z)Z")
	public static boolean method865() {
		return Static207.anInt4055 > 0;
	}
}
