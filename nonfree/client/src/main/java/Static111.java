import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!me", name = "o", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!me", name = "p", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_985 = Static120.method1824("Type");

	@OriginalMember(owner = "client!me", name = "s", descriptor = "Lclient!rd;")
	public static Class80 aClass80_986 = aClass80_985;

	@OriginalMember(owner = "client!me", name = "u", descriptor = "[I")
	public static final int[] anIntArray326 = new int[5];

	@OriginalMember(owner = "client!me", name = "v", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_987 = Static120.method1824(")2");

	@OriginalMember(owner = "client!me", name = "y", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_988 = Static120.method1824("<br>(X100(U(Y");

	@OriginalMember(owner = "client!me", name = "A", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_989 = Static120.method1824("null");

	@OriginalMember(owner = "client!me", name = "B", descriptor = "I")
	public static int anInt2489 = 0;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "()V")
	public static void method1722() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < Static97.anInt2061; local1++) {
			for (local4 = 0; local4 < Static64.anInt1390; local4++) {
				for (local7 = 0; local7 < Static49.anInt1086; local7++) {
					Static185.aClass3_Sub15ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static185.anInt4185; local4++) {
			for (local7 = 0; local7 < Static185.anIntArray499[local4]; local7++) {
				Static185.aClass60ArrayArray1[local4][local7] = null;
			}
			Static185.anIntArray499[local4] = 0;
		}
		for (local7 = 0; local7 < Static170.anInt3814; local7++) {
			Static153.aClass4Array2[local7] = null;
		}
		Static170.anInt3814 = 0;
		for (@Pc(69) int local69 = 0; local69 < Static161.aClass4Array4.length; local69++) {
			Static161.aClass4Array4[local69] = null;
		}
	}
}
