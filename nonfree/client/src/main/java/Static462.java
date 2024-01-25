import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!wu", name = "I", descriptor = "I")
	public static int anInt7410;

	@OriginalMember(owner = "client!wu", name = "W", descriptor = "Lclient!um;")
	public static Class253 aClass253_8;

	@OriginalMember(owner = "client!wu", name = "X", descriptor = "[[I")
	public static int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!wu", name = "H", descriptor = "Lclient!qi;")
	public static Class208 aClass208_42 = new Class208(8);

	@OriginalMember(owner = "client!wu", name = "P", descriptor = "I")
	public static int anInt7417 = 0;

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(II)V")
	public static void method5972(@OriginalArg(1) int arg0) {
		if (!Static126.aClass19_Sub1_1.aBoolean390) {
			arg0 = -1;
		}
		if (Static141.anInt6095 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(26) Class66 local26 = Static285.aClass3_2.method24(arg0);
			@Pc(30) Class52 local30 = local26.method1071();
			if (local30 == null) {
				arg0 = -1;
			} else {
				Static259.aClass177_2.method3853(local30.method895(), local30.method883(), new Point(local26.anInt1216, local26.anInt1222), Static91.aCanvas2, local30.method890());
				Static141.anInt6095 = arg0;
			}
		}
		if (arg0 == -1 && Static141.anInt6095 != -1) {
			Static259.aClass177_2.method3853(-1, -1, new Point(), Static91.aCanvas2, null);
			Static141.anInt6095 = -1;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Z)V")
	public static void method5973() {
		Static148.method1859();
		Static43.aClass59_49 = null;
		Static386.aClass59_46 = null;
		Static199.aClass59_18 = null;
		Static424.aClass117_11 = null;
		Static369.aClass160ArrayArray1 = null;
	}
}
