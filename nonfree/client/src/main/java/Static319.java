import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static319 {

	@OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
	public static int anInt6196;

	@OriginalMember(owner = "client!ug", name = "I", descriptor = "Lclient!ic;")
	public static Class61 aClass61_5;

	@OriginalMember(owner = "client!ug", name = "J", descriptor = "I")
	public static int anInt6199;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!nq;)V")
	public static void method5308(@OriginalArg(1) Class144 arg0) {
		Static82.anInt1505 = arg0.method3902("p11_full");
		Static229.anInt4581 = arg0.method3902("p12_full");
		Static82.anInt1502 = arg0.method3902("b12_full");
		Static31.anInt548 = arg0.method3902("hitmarks");
		Static351.anInt6346 = arg0.method3902("hitbar_default");
		Static262.anInt5360 = arg0.method3902("timerbar_default");
		Static17.anInt284 = arg0.method3902("headicons_pk");
		Static337.anInt6450 = arg0.method3902("headicons_prayer");
		Static35.anInt644 = arg0.method3902("hint_headicons");
		Static30.anInt542 = arg0.method3902("hint_mapmarkers");
		Static292.anInt5792 = arg0.method3902("mapflag");
		Static79.anInt5253 = arg0.method3902("cross");
		Static350.anInt6676 = arg0.method3902("mapdots");
		Static347.anInt6631 = arg0.method3902("scrollbar");
		Static212.anInt4348 = arg0.method3902("name_icons");
		Static204.anInt4170 = arg0.method3902("floorshadows");
		Static63.anInt1163 = arg0.method3902("compass");
		Static137.anInt2547 = arg0.method3902("hint_mapedge");
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)I")
	public static int method5309(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
