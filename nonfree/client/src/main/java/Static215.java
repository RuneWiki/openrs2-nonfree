import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_56 = new Class267(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "Z")
	public static boolean aBoolean261 = false;

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_75 = new Class92(54, -1);

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V")
	public static void method3236() {
		Static318.method4607();
		Static280.method4210();
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(BILclient!ae;)V")
	public static void method3237(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (Static350.aClass136_13 == null) {
			return;
		}
		try {
			Static350.aClass136_13.method3105(0L);
			Static350.aClass136_13.method3113(24, arg1.aByteArray96, arg0);
		} catch (@Pc(18) Exception local18) {
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!he;I)V")
	public static void method3238(@OriginalArg(0) Class100 arg0) {
		Static146.anInt2984 = arg0.method2494("p11_full");
		Static72.anInt1877 = arg0.method2494("p12_full");
		Static57.anInt1548 = arg0.method2494("b12_full");
		Static231.anInt7985 = arg0.method2494("hitmarks");
		Static367.anInt6660 = arg0.method2494("hitbar_default");
		Static369.anInt4261 = arg0.method2494("timerbar_default");
		Static257.anInt4679 = arg0.method2494("headicons_pk");
		Static392.anInt5059 = arg0.method2494("headicons_prayer");
		Static133.anInt6880 = arg0.method2494("hint_headicons");
		Static211.anInt3898 = arg0.method2494("hint_mapmarkers");
		Static67.anInt1775 = arg0.method2494("mapflag");
		Static284.anInt5108 = arg0.method2494("cross");
		Static321.anInt5549 = arg0.method2494("mapdots");
		Static209.anInt2669 = arg0.method2494("scrollbar");
		Static276.anInt4961 = arg0.method2494("name_icons");
		Static78.anInt1956 = arg0.method2494("floorshadows");
		Static403.anInt7238 = arg0.method2494("compass");
		Static86.anInt1025 = arg0.method2494("otherlevel");
		Static6.anInt255 = arg0.method2494("hint_mapedge");
	}
}
