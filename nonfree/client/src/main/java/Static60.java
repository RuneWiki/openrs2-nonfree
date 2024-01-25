import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static60 {

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
	public static int anInt1603;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "[C")
	public static final char[] aCharArray2 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
	public static int anInt1599 = 0;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BII)Z")
	public static boolean method1447(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static44.method8133(arg0, arg1) || Static113.method2270(arg0, arg1);
	}
}
