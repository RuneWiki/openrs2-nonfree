import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static175 {

	@OriginalMember(owner = "client!gl", name = "N", descriptor = "[[B")
	public static final byte[][] aByteArrayArray14 = new byte[50][];

	@OriginalMember(owner = "client!gl", name = "O", descriptor = "Lclient!il;")
	public static final Class162 aClass162_19 = new Class162(16);

	@OriginalMember(owner = "client!gl", name = "P", descriptor = "[I")
	public static final int[] anIntArray204 = new int[8];

	@OriginalMember(owner = "client!gl", name = "Q", descriptor = "Lclient!fh;")
	public static final Class113 aClass113_5 = new Class113(14, 7);

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZB)V")
	public static void method3011(@OriginalArg(0) boolean arg0) {
		if (Static163.aString22.length() == 0) {
			return;
		}
		Static212.method3438("--> " + Static163.aString22);
		Static40.method697(arg0, Static163.aString22, false);
		Static361.anInt7411 = 0;
		Static428.anInt7331 = 0;
		Static163.aString22 = "";
	}
}
