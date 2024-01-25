import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!fp", name = "J", descriptor = "[[B")
	public static byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!fp", name = "L", descriptor = "I")
	public static int anInt2449;

	@OriginalMember(owner = "client!fp", name = "M", descriptor = "Lclient!jf;")
	public static Class128 aClass128_1;

	@OriginalMember(owner = "client!fp", name = "K", descriptor = "[[I")
	public static final int[][] anIntArrayArray20 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method2091(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static60.anInt7169; local11++) {
			if (arg0.equalsIgnoreCase(Static325.aStringArray36[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static263.aClass24_Sub3_Sub2_Sub2_4.aString58);
	}
}
