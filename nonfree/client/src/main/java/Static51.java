import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!df", name = "d", descriptor = "Lclient!ke;")
	public static Class4_Sub3_Sub5_Sub2 aClass4_Sub3_Sub5_Sub2_2;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "Lclient!fh;")
	public static Class58 aClass58_27;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "Lclient!cc;")
	public static Class26 aClass26_7 = new Class26(50);

	@OriginalMember(owner = "client!df", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString59 = "green:";

	@OriginalMember(owner = "client!df", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray5 = new String[1000];

	@OriginalMember(owner = "client!df", name = "h", descriptor = "I")
	public static int anInt959 = 0;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
	public static void method778() {
		for (@Pc(11) int local11 = 0; local11 < Static211.anInt4158; local11++) {
			@Pc(18) Class80 local18 = Static58.method935(local11);
			if (local18 != null && local18.anInt2191 == 0) {
				Static46.anIntArray62[local11] = 0;
				Static2.anIntArray2[local11] = 0;
			}
		}
		Static289.aClass85_25 = new Class85(16);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V")
	public static void method779(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub3_Sub9 local10 = Static43.method2329(4, arg0);
		local10.method1519();
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BLclient!wf;)Ljava/lang/String;")
	public static String method780(@OriginalArg(1) Class189 arg0) {
		if (Static41.method687(arg0).method3286() == 0) {
			return null;
		} else if (arg0.aString362 == null || arg0.aString362.trim().length() == 0) {
			return Static27.aBoolean26 ? "Hidden-use" : null;
		} else {
			return arg0.aString362;
		}
	}
}
