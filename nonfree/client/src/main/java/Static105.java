import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static105 {

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "Lclient!ki;")
	public static Class110 aClass110_1;

	@OriginalMember(owner = "client!gk", name = "q", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!gk", name = "t", descriptor = "[Z")
	public static boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "Z")
	public static boolean aBoolean147 = false;

	@OriginalMember(owner = "client!gk", name = "v", descriptor = "I")
	public static int anInt2298 = 0;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(JI)V")
	public static void method2138(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if ((long) 0 == arg0 % 10L) {
			Static54.method1177(arg0 - 1L);
			Static54.method1177(1L);
		} else {
			Static54.method1177(arg0);
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILclient!ra;)V")
	public static void method2139(@OriginalArg(1) Class170 arg0) {
		Static106.anInt2306 = arg0.method4555("p11_full");
		Static132.anInt2861 = arg0.method4555("p12_full");
		Static32.anInt862 = arg0.method4555("b12_full");
		Static319.anInt6051 = arg0.method4555("hitmarks");
		Static298.anInt5726 = arg0.method4555("hitbar_default");
		Static40.anInt987 = arg0.method4555("timerbar_default");
		Static81.anInt1955 = arg0.method4555("headicons_pk");
		Static125.anInt2609 = arg0.method4555("headicons_prayer");
		Static137.anInt2337 = arg0.method4555("hint_headicons");
		Static190.anInt3778 = arg0.method4555("hint_mapmarkers");
		Static192.anInt3800 = arg0.method4555("mapflag");
		Static241.anInt4685 = arg0.method4555("cross");
		Static293.anInt5620 = arg0.method4555("mapdots");
		Static177.anInt2357 = arg0.method4555("scrollbar");
		Static334.anInt6311 = arg0.method4555("name_icons");
		Static171.anInt3517 = arg0.method4555("floorshadows");
		Static12.anInt373 = arg0.method4555("compass");
		Static204.anInt3947 = arg0.method4555("hint_mapedge");
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)Z")
	public static boolean method2140(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static32.aByteArrayArrayArray4[1][arg1][arg0] & 0x2) != 0;
	}
}
