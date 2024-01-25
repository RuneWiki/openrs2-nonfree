import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!ds", name = "w", descriptor = "[I")
	public static int[] anIntArray130;

	@OriginalMember(owner = "client!ds", name = "n", descriptor = "Lclient!mn;")
	public static final Class167 aClass167_10 = new Class167(32);

	@OriginalMember(owner = "client!ds", name = "kb", descriptor = "I")
	public static int anInt1731 = 0;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IZ)V")
	public static void method1529() {
		Static398.anInt6739 = -1;
		Static152.anInt3124 = 1;
		Static124.anInt2565 = 2;
		Static345.anInt5874 = -1;
		Static300.aBoolean350 = false;
		Static212.anInt4104 = 0;
		Static285.aClass187_87 = null;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(BI)Z")
	public static boolean method1530(@OriginalArg(1) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method1537(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 - arg0;
		if (local7 < -9) {
			return "<col=ff0000>";
		} else if (local7 < -6) {
			return "<col=ff3000>";
		} else if (local7 < -3) {
			return "<col=ff7000>";
		} else if (local7 < 0) {
			return "<col=ffb000>";
		} else if (local7 > 9) {
			return "<col=00ff00>";
		} else if (local7 > 6) {
			return "<col=40ff00>";
		} else if (local7 > 3) {
			return "<col=80ff00>";
		} else if (local7 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}
}
