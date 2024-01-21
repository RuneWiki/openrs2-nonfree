import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!ud", name = "Y", descriptor = "Lclient!fc;")
	public static Class29 aClass29_4;

	@OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
	public static int anInt3806 = 0;

	@OriginalMember(owner = "client!ud", name = "O", descriptor = "[I")
	public static final int[] anIntArray371 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ud", name = "U", descriptor = "Lclient!s;")
	public static final Class86 aClass86_49 = new Class86(128);

	@OriginalMember(owner = "client!ud", name = "bb", descriptor = "Z")
	public static boolean aBoolean178 = false;

	@OriginalMember(owner = "client!ud", name = "cb", descriptor = "[[I")
	public static final int[][] anIntArrayArray34 = new int[104][104];

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)V")
	public static void method2892() {
		if (Static142.aClass10_1 != null) {
			Static142.aClass10_1.method1787();
		}
		if (Static168.aClass10_2 != null) {
			Static168.aClass10_2.method1787();
		}
	}

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "(B)Z")
	public static boolean method2895() {
		@Pc(5) Class27 local5 = Static85.aClass27_1;
		synchronized (Static85.aClass27_1) {
			if (Static83.anInt1857 == Static6.anInt138) {
				return false;
			} else {
				Static91.anInt1955 = Static55.anIntArray109[Static6.anInt138];
				Static53.anInt1354 = Static141.anIntArray294[Static6.anInt138];
				Static6.anInt138 = Static6.anInt138 + 1 & 0x7F;
				return true;
			}
		}
	}
}
