import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
	public static int anInt3330;

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "Lclient!ln;")
	public static Class104 aClass104_5;

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
	public static int anInt3332;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray31 = new String[100];

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
	public static int anInt3336 = 0;

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "[I")
	public static int[] anIntArray308 = new int[14];

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "[I")
	public static int[] anIntArray309 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method2409(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			try {
				Static317.method295(Static142.aClass112_2.anApplet1, "loggedout");
			} catch (@Pc(60) Throwable local60) {
			}
			try {
				Static82.anApplet_Sub1_1.getAppletContext().showDocument(new URL(Static82.anApplet_Sub1_1.getCodeBase(), arg0), "_top");
			} catch (@Pc(72) Exception local72) {
			}
			return;
		}
		if (Static294.aBoolean367 && Static24.aBoolean35) {
			try {
				Static317.method293(Static142.aClass112_2.anApplet1, "openjs", new Object[] { (new URL(Static82.anApplet_Sub1_1.getCodeBase(), arg0)).toString() });
				return;
			} catch (@Pc(38) Throwable local38) {
			}
		}
		try {
			Static82.anApplet_Sub1_1.getAppletContext().showDocument(new URL(Static82.anApplet_Sub1_1.getCodeBase(), arg0), "_blank");
		} catch (@Pc(50) Exception local50) {
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIZLclient!th;I)V")
	public static void method2411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(5) Class168 arg2) {
		Static9.anInt285 = 1;
		Static203.anInt5699 = arg0;
		Static309.anInt6195 = 2;
		Static190.aBoolean261 = false;
		Static296.anInt5906 = arg1;
		Static295.anInt5889 = 0;
		Static254.aClass168_172 = arg2;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)V")
	public static void method2415(@OriginalArg(1) int arg0) {
		Static219.aClass89_34.method2265();
		Static219.aClass89_34 = new Class89(arg0);
	}
}
