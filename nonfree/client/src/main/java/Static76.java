import org.openrs2.deob.annotation.OriginalMember;

public final class Static76 {

	@OriginalMember(owner = "client!cq", name = "i", descriptor = "[I")
	public static final int[] anIntArray74 = new int[200];

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(B)Z")
	public static boolean method1868() {
		if (Static17.aClass3_Sub1_Sub4_1 == null) {
			return false;
		} else {
			if (Static17.aClass3_Sub1_Sub4_1.anInt3485 >= 2000) {
				Static17.aClass3_Sub1_Sub4_1.anInt3485 -= 2000;
			}
			return Static17.aClass3_Sub1_Sub4_1.anInt3485 == 1011;
		}
	}
}
