import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static37 {

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
	public static int anInt1051;

	@OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
	public static int anInt1055 = 0;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)V")
	public static void method835() {
		Static51.anIntArray206 = Static203.method3599(0.4F);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method836(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
