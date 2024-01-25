import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static154 {

	@OriginalMember(owner = "client!fga", name = "q", descriptor = "Lclient!tfa;")
	public static Class321 aClass321_2;

	@OriginalMember(owner = "client!fga", name = "s", descriptor = "I")
	public static int anInt2809;

	@OriginalMember(owner = "client!fga", name = "o", descriptor = "Lclient!oi;")
	public static final Class240 aClass240_5 = new Class240("", 17);

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!vd;I)V")
	public static void method2414(@OriginalArg(0) Class353 arg0) {
		Static224.anInt4364 = arg0.method8410("hitmarks");
		Static595.anInt9908 = arg0.method8410("hitbar_default");
		Static466.anInt7616 = arg0.method8410("timerbar_default");
		Static482.anInt8354 = arg0.method8410("headicons_pk");
		Static64.anInt10320 = arg0.method8410("headicons_prayer");
		Static116.anInt2276 = arg0.method8410("hint_headicons");
		Static94.anInt1855 = arg0.method8410("hint_mapmarkers");
		Static499.anInt8643 = arg0.method8410("mapflag");
		Static274.anInt7991 = arg0.method8410("cross");
		Static188.anInt5454 = arg0.method8410("mapdots");
		Static386.anInt5554 = arg0.method8410("scrollbar");
		Static560.anInt9546 = arg0.method8410("name_icons");
		Static484.anInt8383 = arg0.method8410("floorshadows");
		Static240.anInt4805 = arg0.method8410("compass");
		Static326.anInt6218 = arg0.method8410("otherlevel");
		Static572.anInt9597 = arg0.method8410("hint_mapedge");
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(BI)I")
	public static int method2415(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}
