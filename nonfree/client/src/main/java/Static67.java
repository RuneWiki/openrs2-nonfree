import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static67 {

	@OriginalMember(owner = "client!dg", name = "q", descriptor = "I")
	public static int anInt1750;

	@OriginalMember(owner = "client!dg", name = "jb", descriptor = "I")
	public static int anInt1775;

	@OriginalMember(owner = "client!dg", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString10 = "";

	@OriginalMember(owner = "client!dg", name = "gb", descriptor = "[S")
	public static final short[] aShortArray15 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZI)Z")
	public static boolean method1385(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static240.method3702(arg0, arg1) | (arg0 & 0x60000) != 0 || Static173.method2864(arg1, arg0) || Static144.method2459(arg0, arg1);
	}
}
