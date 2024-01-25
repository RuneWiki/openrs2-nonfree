import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static47 {

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "S")
	public static short aShort17 = 256;

	@OriginalMember(owner = "client!bq", name = "l", descriptor = "I")
	public static int anInt1279 = 0;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)I")
	public static int method1178(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(BI)V")
	public static void method1179(@OriginalArg(1) int arg0) {
		if (Static33.anIntArray23 == null || arg0 > Static33.anIntArray23.length) {
			Static33.anIntArray23 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(II)V")
	public static void method1180(@OriginalArg(0) int arg0) {
		Static213.method3572(Static573.aClass350_16.method7730(Static201.anInt4321), arg0);
	}
}
