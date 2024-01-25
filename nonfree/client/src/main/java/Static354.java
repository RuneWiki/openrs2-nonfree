import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!mda", name = "i", descriptor = "Lclient!tl;")
	public static Class355 aClass355_1;

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "Z")
	public static final boolean aBoolean391 = false;

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILclient!gda;)V")
	public static void method5206(@OriginalArg(1) Class126 arg0) {
		Static176.anInt3345 = arg0.method3067("hitmarks");
		Static644.anInt10532 = arg0.method3067("hitbar_default");
		Static522.anInt8282 = arg0.method3067("timerbar_default");
		Static53.anInt930 = arg0.method3067("headicons_pk");
		Static246.anInt4309 = arg0.method3067("headicons_prayer");
		Static445.anInt6595 = arg0.method3067("hint_headicons");
		Static677.anInt8510 = arg0.method3067("hint_mapmarkers");
		Static518.anInt8220 = arg0.method3067("mapflag");
		Static628.anInt10021 = arg0.method3067("cross");
		Static125.anInt2088 = arg0.method3067("mapdots");
		Static148.anInt2916 = arg0.method3067("scrollbar");
		Static52.anInt913 = arg0.method3067("name_icons");
		Static605.anInt9763 = arg0.method3067("floorshadows");
		Static104.anInt1716 = arg0.method3067("compass");
		Static493.anInt7983 = arg0.method3067("otherlevel");
		Static214.anInt10029 = arg0.method3067("hint_mapedge");
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(BLjava/lang/String;I)V")
	public static void method5208(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class5_Sub1_Sub18 local14 = Static123.method1827((long) arg1, 3);
		local14.method7441();
		local14.aString99 = arg0;
	}
}
