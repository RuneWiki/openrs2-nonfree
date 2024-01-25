import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static343 {

	@OriginalMember(owner = "client!r", name = "O", descriptor = "I")
	public static int anInt6320;

	@OriginalMember(owner = "client!r", name = "Y", descriptor = "Lclient!c;")
	public static Class40 aClass40_4;

	@OriginalMember(owner = "client!r", name = "y", descriptor = "[[I")
	public static final int[][] anIntArrayArray50 = new int[128][128];

	@OriginalMember(owner = "client!r", name = "D", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_167 = new Class158("wave:", "welle:", "ondulation:", "onda:");

	@OriginalMember(owner = "client!r", name = "P", descriptor = "Z")
	public static boolean aBoolean400 = false;

	@OriginalMember(owner = "client!r", name = "U", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_150 = new Class263(23, -2);

	@OriginalMember(owner = "client!r", name = "W", descriptor = "Z")
	public static boolean aBoolean401 = false;

	@OriginalMember(owner = "client!r", name = "Z", descriptor = "I")
	public static int anInt6324 = 0;

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(B)V")
	public static void method4833() {
		if (Static264.aClass106_9 != null) {
			Static264.aClass106_9.method5966();
			Static264.aClass106_9 = null;
			Static190.aClass20_4 = null;
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIIII)V")
	public static void method4835(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 >= Static105.anInt2417 && arg4 <= Static70.anInt1843 && Static362.anInt6654 <= arg2 && Static164.anInt6595 >= arg3) {
			Static276.method4085(arg3, arg0, arg2, arg1, arg4);
		} else {
			Static270.method4031(arg0, arg1, arg4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!qs;)V")
	public static void method4839(@OriginalArg(1) Class211 arg0) {
		Static6.anInt82 = arg0.method4759("p11_full");
		Static125.anInt2790 = arg0.method4759("p12_full");
		Static256.anInt2252 = arg0.method4759("b12_full");
		Static410.anInt7334 = arg0.method4759("hitmarks");
		Static87.anInt2076 = arg0.method4759("hitbar_default");
		Static9.anInt3078 = arg0.method4759("timerbar_default");
		Static129.anInt2884 = arg0.method4759("headicons_pk");
		Static310.anInt5824 = arg0.method4759("headicons_prayer");
		Static100.anInt2370 = arg0.method4759("hint_headicons");
		Static247.anInt4761 = arg0.method4759("hint_mapmarkers");
		Static93.anInt6566 = arg0.method4759("mapflag");
		Static64.anInt1736 = arg0.method4759("cross");
		Static332.anInt6407 = arg0.method4759("mapdots");
		Static2.anInt45 = arg0.method4759("scrollbar");
		Static97.anInt2327 = arg0.method4759("name_icons");
		Static403.anInt7267 = arg0.method4759("floorshadows");
		Static279.anInt5476 = arg0.method4759("compass");
		Static99.anInt2354 = arg0.method4759("otherlevel");
		Static230.anInt4558 = arg0.method4759("hint_mapedge");
	}
}
