import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static455 {

	@OriginalMember(owner = "client!wv", name = "h", descriptor = "Lclient!tu;")
	public static final Class229 aClass229_37 = new Class229();

	@OriginalMember(owner = "client!wv", name = "j", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_208 = new Class184(78, 2);

	@OriginalMember(owner = "client!wv", name = "m", descriptor = "I")
	public static int anInt5935 = -1;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ILclient!m;Lclient!hs;ILjava/awt/Canvas;)Lclient!qa;")
	public static Class75 method4732(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) Class103 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Canvas arg3) {
		return new h(arg2, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIII)V")
	public static void method4734(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static325.aByteArrayArrayArray15 = new byte[4][arg0][arg1];
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!dn;I)V")
	public static void method4739(@OriginalArg(0) Class56 arg0) {
		Static31.anInt838 = arg0.method1368("p11_full");
		Static126.anInt3503 = arg0.method1368("p12_full");
		Static215.anInt4228 = arg0.method1368("b12_full");
		Static347.anInt6317 = arg0.method1368("hitmarks");
		Static37.anInt1023 = arg0.method1368("hitbar_default");
		Static304.anInt5558 = arg0.method1368("timerbar_default");
		Static137.anInt3152 = arg0.method1368("headicons_pk");
		Static55.anInt1302 = arg0.method1368("headicons_prayer");
		Static237.anInt4553 = arg0.method1368("hint_headicons");
		Static9.anInt250 = arg0.method1368("hint_mapmarkers");
		Static278.anInt6866 = arg0.method1368("mapflag");
		Static136.anInt2296 = arg0.method1368("cross");
		Static287.anInt5244 = arg0.method1368("mapdots");
		Static373.anInt6594 = arg0.method1368("scrollbar");
		Static7.anInt160 = arg0.method1368("name_icons");
		Static241.anInt4607 = arg0.method1368("floorshadows");
		Static330.anInt6005 = arg0.method1368("compass");
		Static160.anInt3380 = arg0.method1368("otherlevel");
		Static50.anInt1236 = arg0.method1368("hint_mapedge");
	}
}
