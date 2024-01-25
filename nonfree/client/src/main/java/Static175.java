import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "Lclient!dj;")
	public static Class75 aClass75_4;

	@OriginalMember(owner = "client!gk", name = "X", descriptor = "[I")
	public static final int[] anIntArray358 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!ps;Z)V")
	public static void method4474(@OriginalArg(0) Class273 arg0) {
		if (arg0.anInt6868 == 5 && arg0.anInt6805 != -1) {
			Static59.method1015(arg0, Static417.aClass162_17);
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BLclient!ps;)V")
	public static void method4476(@OriginalArg(1) Class273 arg0) {
		if (!Static355.aBoolean473) {
			return;
		}
		if (arg0.anObjectArray30 != null) {
			@Pc(23) Class273 local23 = Static494.method6329(Static464.anInt7423, Static460.anInt7404);
			if (local23 != null) {
				@Pc(29) Class2_Sub10 local29 = new Class2_Sub10();
				local29.aClass273_4 = arg0;
				local29.aClass273_3 = local23;
				local29.anObjectArray1 = arg0.anObjectArray30;
				Static566.method7398(local29);
			}
		}
		@Pc(46) Class2_Sub34 local46 = Static555.method7264(Static359.aClass154_45, Static551.aClass64_2);
		local46.aClass2_Sub7_Sub2_2.method4495(arg0.anInt6810);
		local46.aClass2_Sub7_Sub2_2.method4513(arg0.anInt6805);
		local46.aClass2_Sub7_Sub2_2.method4513(Static229.anInt3341);
		local46.aClass2_Sub7_Sub2_2.method4520(Static464.anInt7423);
		local46.aClass2_Sub7_Sub2_2.method4492(Static460.anInt7404);
		local46.aClass2_Sub7_Sub2_2.method4511(arg0.anInt6800);
		Static100.method1508(local46);
	}
}
