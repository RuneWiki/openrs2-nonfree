import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!jh", name = "T", descriptor = "Lclient!qq;")
	public static Class195 aClass195_1;

	@OriginalMember(owner = "client!jh", name = "K", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_105 = new Class48(70, 3);

	@OriginalMember(owner = "client!jh", name = "Q", descriptor = "Lclient!rt;")
	public static final Class205 aClass205_1 = new Class205(1);

	@OriginalMember(owner = "client!jh", name = "R", descriptor = "[I")
	public static final int[] anIntArray369 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!jh", name = "V", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_106 = new Class48(26, 7);

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILclient!tq;II)V")
	public static void method2546(@OriginalArg(0) int arg0, @OriginalArg(1) Class164 arg1, @OriginalArg(2) int arg2) {
		Static330.aClass164_8 = arg1;
		Static364.aClass161ArrayArray3 = new Class161[arg0][arg2];
		if (Static164.anIntArray351 != null) {
			Static39.aClass16_2 = Static22.method3209(Static164.anIntArray351[3], Static164.anIntArray351[0], Static164.anIntArray351[1], Static164.anIntArray351[5], Static164.anIntArray351[4], Static164.anIntArray351[2]);
		}
		Static121.aClass161_1 = new Class161();
		Static286.method4346();
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(II)V")
	public static void method2547(@OriginalArg(1) int arg0) {
		if (Static345.method4878(arg0)) {
			Static99.method1455(-1, Static137.aClass117ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)Ljava/lang/String;")
	public static String method2548() {
		@Pc(12) String local12 = "www";
		if (Static96.aClass73_2 == Static233.aClass73_4) {
			local12 = "www-wtrc";
		} else if (Static351.aClass73_6 == Static96.aClass73_2) {
			local12 = "www-wtqa";
		} else if (Static96.aClass73_2 == Static93.aClass73_1) {
			local12 = "www-wtwip";
		}
		@Pc(33) String local33 = "";
		if (Static348.aString68 != null) {
			local33 = "/p=" + Static348.aString68;
		}
		return "http://" + local12 + "." + Static313.aClass94_8.aString19 + ".com/l=" + Static48.anInt952 + "/a=" + Static380.anInt6150 + local33 + "/";
	}
}
