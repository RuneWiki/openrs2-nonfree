import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!f", name = "k", descriptor = "[I")
	public static int[] anIntArray170;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString88 = "";

	@OriginalMember(owner = "client!f", name = "d", descriptor = "[I")
	public static int[] anIntArray169 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!f", name = "h", descriptor = "[Lclient!ui;")
	public static Class1_Sub3_Sub21[] aClass1_Sub3_Sub21Array1 = new Class1_Sub3_Sub21[14];

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!th;I)Lclient!em;")
	public static Class46 method1160(@OriginalArg(1) Class168 arg0, @OriginalArg(2) int arg1) {
		return Static57.method4770(arg0, arg1) ? Static210.method3370() : null;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!hd;III)V")
	public static void method1162(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class1_Sub2 local12;
		if (arg2 < Static90.anInt2091) {
			local12 = Static7.aClass1_Sub2ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass119_1 != null && local12.aClass119_1.aClass2_7.method3946()) {
				arg0.method3949(local12.aClass119_1.aClass2_7, 128, 0, 0, true);
			}
		}
		if (arg3 < Static90.anInt2091) {
			local12 = Static7.aClass1_Sub2ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass119_1 != null && local12.aClass119_1.aClass2_7.method3946()) {
				arg0.method3949(local12.aClass119_1.aClass2_7, 0, 0, 128, true);
			}
		}
		if (arg2 < Static90.anInt2091 && arg3 < Static77.anInt1766) {
			local12 = Static7.aClass1_Sub2ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass119_1 != null && local12.aClass119_1.aClass2_7.method3946()) {
				arg0.method3949(local12.aClass119_1.aClass2_7, 128, 0, 128, true);
			}
		}
		if (arg2 < Static90.anInt2091 && arg3 > 0) {
			local12 = Static7.aClass1_Sub2ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass119_1 != null && local12.aClass119_1.aClass2_7.method3946()) {
				arg0.method3949(local12.aClass119_1.aClass2_7, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V")
	public static void method1163() {
		if (!Static245.aBoolean315 && Static236.anInt1712 != 2) {
			try {
				Static317.method295(Static241.aClient1, "tbrefresh");
			} catch (@Pc(25) Throwable local25) {
			}
		}
	}
}
