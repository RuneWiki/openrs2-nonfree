import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
	public static int anInt7466;

	@OriginalMember(owner = "client!pr", name = "i", descriptor = "Lclient!ri;")
	public static Class284 aClass284_120;

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "Lclient!eu;")
	public static final Class95 aClass95_6 = new Class95(3, 2);

	@OriginalMember(owner = "client!pr", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray75 = new int[128][128];

	@OriginalMember(owner = "client!pr", name = "j", descriptor = "Z")
	public static boolean aBoolean521 = false;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
	public static void method5824() {
		@Pc(12) int local12 = Static348.aClass3_Sub51_Sub1_5.method7843(Static37.anInt1122);
		if (local12 == 0) {
			Static435.aByteArrayArrayArray11 = null;
			Static435.method6007(0);
		} else if (local12 == 1) {
			Static378.method5281((byte) 0);
			Static435.method6007(512);
			if (Static428.aByteArrayArrayArray4 != null) {
				Static487.method6593();
			}
		} else {
			Static378.method5281((byte) (Static335.anInt6052 - 4 & 0xFF));
			Static435.method6007(2);
		}
		Static559.anInt9723 = Static594.anInt10310;
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)Z")
	public static boolean method5830() {
		return Static94.aBoolean171;
	}
}
