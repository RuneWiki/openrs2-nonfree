import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static292 {

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "[I")
	public static final int[] anIntArray326 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "Lclient!lp;")
	public static final Class140 aClass140_29 = new Class140(16);

	@OriginalMember(owner = "client!oc", name = "r", descriptor = "F")
	public static float aFloat84 = 0.0F;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!uu;)V")
	public static void method4189(@OriginalArg(1) Class250 arg0) {
		Static200.anInt3583 = arg0.method5790("p11_full");
		Static110.anInt1951 = arg0.method5790("p12_full");
		Static339.anInt5693 = arg0.method5790("b12_full");
		Static195.anInt3530 = arg0.method5790("hitmarks");
		Static311.anInt5308 = arg0.method5790("hitbar_default");
		Static145.anInt2647 = arg0.method5790("timerbar_default");
		Static345.anInt5819 = arg0.method5790("headicons_pk");
		Static362.anInt6170 = arg0.method5790("headicons_prayer");
		Static51.anInt930 = arg0.method5790("hint_headicons");
		Static205.anInt5935 = arg0.method5790("hint_mapmarkers");
		Static331.anInt7371 = arg0.method5790("mapflag");
		Static105.anInt1900 = arg0.method5790("cross");
		Static90.anInt1611 = arg0.method5790("mapdots");
		Static314.anInt5328 = arg0.method5790("scrollbar");
		Static170.anInt3086 = arg0.method5790("name_icons");
		Static45.anInt763 = arg0.method5790("floorshadows");
		Static126.anInt2305 = arg0.method5790("compass");
		Static426.anInt7184 = arg0.method5790("otherlevel");
		Static6.anInt41 = arg0.method5790("hint_mapedge");
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)V")
	public static void method4190(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static359.aBooleanArray20[arg0]) {
			Static465.aClass250_62.method5792(arg0);
			Static298.aClass82ArrayArray2[arg0] = null;
			Static145.aClass82ArrayArray1[arg0] = null;
			Static359.aBooleanArray20[arg0] = false;
		}
	}
}
