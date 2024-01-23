import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static70 {

	@OriginalMember(owner = "client!en", name = "h", descriptor = "[I")
	public static int[] anIntArray106 = new int[5];

	@OriginalMember(owner = "client!en", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString59 = "Drop";

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IB)V")
	public static void method1136(@OriginalArg(0) int arg0) {
		if (Static92.method1483(arg0)) {
			Static189.method2959(Static210.aClass159ArrayArray6[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BI)V")
	public static void method1138() {
		Static87.aClass61_15.method1381(5);
		Static219.aClass61_40.method1381(5);
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
	public static void method1139() {
		if (Static236.anInt4778 != -1) {
			Static249.method3696(-1, -1, Static236.anInt4778);
			Static236.anInt4778 = -1;
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(BI)V")
	public static void method1140() {
		Static28.aClass61_4.method1381(50);
		Static187.aClass61_32.method1381(50);
		Static240.aClass61_46.method1381(50);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IBI)V")
	public static void method1141(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static19.anInt518 = Static169.aClass24ArrayArray1[arg1][arg0].anInt776;
		Static270.anInt5336 = Static169.aClass24ArrayArray1[arg1][arg0].anInt768;
		Static150.anInt4579 = Static169.aClass24ArrayArray1[arg1][arg0].anInt774;
		Static233.method3550((float) Static19.anInt518, (float) Static270.anInt5336, (float) Static150.anInt4579);
	}
}
