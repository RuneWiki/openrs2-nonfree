import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
	public static int anInt2494;

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray18 = new String[5];

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
	public static int anInt2496 = -1;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)I")
	public static int method2218(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	public static void method2221() {
		if (Static35.aClass137_11 != Static102.aClass137_5) {
			try {
				Static463.method2376("tbrefresh", Static152.aClient1);
			} catch (@Pc(19) Throwable local19) {
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(II)V")
	public static void method2223(@OriginalArg(0) int arg0) {
		Static304.anInt5263 = -1;
		Static434.anInt7031 = 100;
		Static92.anInt1947 = arg0;
		Static440.anInt7076 = 3;
	}
}
