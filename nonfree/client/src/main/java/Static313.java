import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!ua", name = "K", descriptor = "I")
	public static int anInt5978;

	@OriginalMember(owner = "client!ua", name = "W", descriptor = "[Lclient!kb;")
	public static Class52[] aClass52Array15;

	@OriginalMember(owner = "client!ua", name = "cb", descriptor = "I")
	public static int anInt5990;

	@OriginalMember(owner = "client!ua", name = "I", descriptor = "[I")
	public static final int[] anIntArray753 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!ua", name = "pb", descriptor = "I")
	public static int anInt5999 = 0;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZLclient!mi;)V")
	public static void method5070(@OriginalArg(1) Class7_Sub8 arg0) {
		if (arg0.aClass7_Sub20_5 != null) {
			arg0.aClass7_Sub20_5.anInt3464 = 0;
		}
		arg0.aBoolean427 = false;
		for (@Pc(16) Class7_Sub8 local16 = arg0.method4932(); local16 != null; local16 = arg0.method4930()) {
			method5070(local16);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method5071(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return "<col=ffff00>" + arg0 + "</col>";
		} else if (arg0 < 10000000) {
			return "<col=ffffff>" + arg0 / 1000 + Static281.aString324 + "</col>";
		} else {
			return "<col=00ff80>" + arg0 / 1000000 + Static266.aString332 + "</col>";
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!bi;B)Ljava/lang/String;")
	public static String method5074(@OriginalArg(0) Class26 arg0) {
		if (Static45.method1034(arg0).method3765() == 0) {
			return null;
		} else if (arg0.aString44 == null || arg0.aString44.trim().length() == 0) {
			return Static105.aBoolean439 ? "Hidden-use" : null;
		} else {
			return arg0.aString44;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZI)V")
	public static void method5075(@OriginalArg(0) boolean arg0) {
		Static29.aClass7_Sub3_Sub2_1.method2799(180);
		for (@Pc(20) Class7_Sub17 local20 = (Class7_Sub17) Static247.aClass10_40.method157(); local20 != null; local20 = (Class7_Sub17) Static247.aClass10_40.method155()) {
			if (!local20.method5651()) {
				local20 = (Class7_Sub17) Static247.aClass10_40.method157();
				if (local20 == null) {
					break;
				}
			}
			if (local20.anInt3249 == 0) {
				Static89.method1858(true, arg0, local20);
			}
		}
		if (Static165.aClass26_19 != null) {
			Static245.method4226(Static165.aClass26_19);
			Static165.aClass26_19 = null;
		}
	}
}
