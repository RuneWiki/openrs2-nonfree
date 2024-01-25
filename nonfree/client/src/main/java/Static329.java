import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static329 {

	@OriginalMember(owner = "client!lfa", name = "B", descriptor = "I")
	public static int anInt6225;

	@OriginalMember(owner = "client!lfa", name = "H", descriptor = "Lclient!wia;")
	public static Class386 aClass386_78;

	@OriginalMember(owner = "client!lfa", name = "D", descriptor = "[I")
	public static final int[] anIntArray451 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!lfa", name = "e", descriptor = "(B)V")
	public static void method5156() {
		Static249.method3666();
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(III)Z")
	public static boolean method5158(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && Static553.aByteArrayArrayArray18[1].length > arg1 && arg0 < Static553.aByteArrayArrayArray18[1][arg1].length) {
			return (Static553.aByteArrayArrayArray18[1][arg1][arg0] & 0x2) != 0;
		} else {
			return false;
		}
	}
}
