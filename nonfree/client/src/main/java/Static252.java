import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static252 {

	@OriginalMember(owner = "client!jr", name = "B", descriptor = "I")
	public static int anInt4619;

	@OriginalMember(owner = "client!jr", name = "x", descriptor = "[Z")
	public static final boolean[] aBooleanArray19 = new boolean[8];

	@OriginalMember(owner = "client!jr", name = "D", descriptor = "[S")
	public static short[] aShortArray37 = new short[256];

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(III)Z")
	public static boolean method3697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x60000) != 0 | Static99.method1471(arg1, arg0) || Static519.method7180(arg1, arg0) || Static100.method1475(arg0, arg1);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method3698() {
		return Static406.aBoolean553 || Static231.aClass1_Sub40_1 == null ? "" : Static231.aClass1_Sub40_1.aString88;
	}
}
