import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static580 {

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard2;

	@OriginalMember(owner = "client!wfa", name = "d", descriptor = "I")
	public static int anInt2905 = 0;

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)[Lclient!og;")
	public static Class247[] method2690() {
		return new Class247[] { Static547.aClass247_4, Static26.aClass247_1, Static562.aClass247_5 };
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(BLclient!jn;)V")
	public static void method2691(@OriginalArg(1) Class176 arg0) {
		Static501.anInt6753 = arg0.method3998("hitmarks");
		Static219.anInt4026 = arg0.method3998("hitbar_default");
		Static347.anInt6680 = arg0.method3998("timerbar_default");
		Static459.anInt8549 = arg0.method3998("headicons_pk");
		Static445.anInt8285 = arg0.method3998("headicons_prayer");
		Static306.anInt6141 = arg0.method3998("hint_headicons");
		Static207.anInt3873 = arg0.method3998("hint_mapmarkers");
		Static16.anInt268 = arg0.method3998("mapflag");
		Static357.anInt6964 = arg0.method3998("cross");
		Static307.anInt6167 = arg0.method3998("mapdots");
		Static346.anInt6666 = arg0.method3998("scrollbar");
		Static492.anInt8941 = arg0.method3998("name_icons");
		Static452.anInt8508 = arg0.method3998("floorshadows");
		Static162.anInt3312 = arg0.method3998("compass");
		Static512.anInt9189 = arg0.method3998("otherlevel");
		Static499.anInt3410 = arg0.method3998("hint_mapedge");
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(8) int arg5) {
		Static161.method524(arg3, arg5, arg4, arg0, 0, arg2, arg1);
	}
}
