import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "Lclient!bi;")
	public static Class4_Sub2_Sub1 aClass4_Sub2_Sub1_5;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray26 = new String[1000];

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString108 = " from your friend list first.";

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
	public static int anInt3310 = 0;

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "Z")
	public static boolean aBoolean207 = true;

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString109 = "flash2:";

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "[[I")
	public static int[][] anIntArrayArray27 = new int[5][5000];

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method2630(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 - arg1;
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
		} else if (local7 <= 3) {
			return local7 <= 0 ? "<col=ffff00>" : "<col=c0ff00>";
		} else {
			return "<col=80ff00>";
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLclient!lc;)V")
	public static void method2631(@OriginalArg(1) Class98 arg0) {
		Static174.aClass98_98 = arg0;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)V")
	public static void method2632() {
		Static49.aClass33_9.method838(5);
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(II)V")
	public static void method2633(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub2_Sub21 local8 = Static39.method4121(arg0, 8);
		local8.method4361();
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
	public static void method2634() {
		aString109 = null;
		aStringArray26 = null;
		aString108 = null;
		anIntArrayArray27 = null;
		aClass4_Sub2_Sub1_5 = null;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)I")
	public static int method2635() {
		return 15;
	}
}
