import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!qt", name = "i", descriptor = "I")
	public static int anInt7711;

	@OriginalMember(owner = "client!qt", name = "q", descriptor = "Lclient!la;")
	public static Class35 aClass35_11;

	@OriginalMember(owner = "client!qt", name = "r", descriptor = "I")
	public static int anInt7718;

	@OriginalMember(owner = "client!qt", name = "f", descriptor = "[I")
	public static final int[] anIntArray514 = new int[32];

	@OriginalMember(owner = "client!qt", name = "j", descriptor = "I")
	public static int anInt7712 = 503;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	public static String method6341(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(14) int local14 = arg2.indexOf(arg1); local14 != -1; local14 = arg2.indexOf(arg1, arg0.length() + local14)) {
			arg2 = arg2.substring(0, local14) + arg0 + arg2.substring(arg1.length() + local14);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lclient!ga;B)V")
	public static void method6342(@OriginalArg(0) Class111 arg0) {
		Static437.anInt8760 = arg0.method2462("hitmarks");
		Static293.anInt5408 = arg0.method2462("hitbar_default");
		Static381.anInt6721 = arg0.method2462("timerbar_default");
		Static519.anInt8577 = arg0.method2462("headicons_pk");
		Static258.anInt4753 = arg0.method2462("headicons_prayer");
		Static152.anInt2853 = arg0.method2462("hint_headicons");
		Static410.anInt7006 = arg0.method2462("hint_mapmarkers");
		Static88.anInt1982 = arg0.method2462("mapflag");
		Static303.anInt9538 = arg0.method2462("cross");
		Static485.anInt8187 = arg0.method2462("mapdots");
		Static293.anInt5413 = arg0.method2462("scrollbar");
		Static46.anInt1216 = arg0.method2462("name_icons");
		Static143.anInt2749 = arg0.method2462("floorshadows");
		Static246.anInt8756 = arg0.method2462("compass");
		Static355.anInt6209 = arg0.method2462("otherlevel");
		Static501.anInt8419 = arg0.method2462("hint_mapedge");
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)I")
	public static int method6347(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}
