import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static229 {

	@OriginalMember(owner = "client!hm", name = "G", descriptor = "Lclient!fe;")
	public static Class5_Sub14_Sub3 aClass5_Sub14_Sub3_1;

	@OriginalMember(owner = "client!hm", name = "eb", descriptor = "I")
	public static int anInt3713;

	@OriginalMember(owner = "client!hm", name = "l", descriptor = "[I")
	public static final int[] anIntArray222 = new int[5];

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V")
	public static void method3276() {
		if (Static539.anInt8853 == 9) {
			Static42.method560(5);
		} else if (Static539.anInt8853 == 5 || Static539.anInt8853 == 6) {
			Static42.method560(3);
		} else if (Static539.anInt8853 == 12) {
			Static42.method560(3);
		}
	}

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "(B)V")
	public static void method3280() {
		Static355.method5246(false);
		if (Static301.anInt4652 >= 0 && Static301.anInt4652 != 0) {
			Static75.method1101(false, Static301.anInt4652);
			Static301.anInt4652 = -1;
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)Z")
	public static boolean method3288(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
