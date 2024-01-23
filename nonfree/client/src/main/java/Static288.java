import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
	public static int anInt1353;

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "F")
	public static float aFloat15;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
	public static int anInt1350 = 0;

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
	public static int anInt1351 = 0;

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "Z")
	public static boolean aBoolean98 = false;

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
	public static int anInt1354 = 0;

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "Lclient!gd;")
	public static Class61 aClass61_12 = new Class61(30);

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
	public static int anInt1355 = 0;

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "[I")
	public static int[] anIntArray93 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "[I")
	public static int[] anIntArray94 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
	public static void method968() {
		Static275.aClass8_Sub2_Sub1_6.method2385();
		@Pc(7) int local7 = Static275.aClass8_Sub2_Sub1_6.method2390(1);
		if (local7 == 0) {
			return;
		}
		@Pc(27) int local27 = Static275.aClass8_Sub2_Sub1_6.method2390(2);
		if (local27 == 0) {
			Static171.anIntArray259[Static291.anInt3609++] = 2047;
			return;
		}
		@Pc(50) int local50;
		@Pc(62) int local62;
		if (local27 == 1) {
			local50 = Static275.aClass8_Sub2_Sub1_6.method2390(3);
			Static21.aClass36_Sub3_Sub1_1.method3107(local50, 1);
			local62 = Static275.aClass8_Sub2_Sub1_6.method2390(1);
			if (local62 == 1) {
				Static171.anIntArray259[Static291.anInt3609++] = 2047;
			}
		} else if (local27 == 2) {
			if (Static275.aClass8_Sub2_Sub1_6.method2390(1) == 1) {
				local50 = Static275.aClass8_Sub2_Sub1_6.method2390(3);
				Static21.aClass36_Sub3_Sub1_1.method3107(local50, 2);
				local62 = Static275.aClass8_Sub2_Sub1_6.method2390(3);
				Static21.aClass36_Sub3_Sub1_1.method3107(local62, 2);
			} else {
				local50 = Static275.aClass8_Sub2_Sub1_6.method2390(3);
				Static21.aClass36_Sub3_Sub1_1.method3107(local50, 0);
			}
			local50 = Static275.aClass8_Sub2_Sub1_6.method2390(1);
			if (local50 == 1) {
				Static171.anIntArray259[Static291.anInt3609++] = 2047;
			}
		} else if (local27 == 3) {
			local50 = Static275.aClass8_Sub2_Sub1_6.method2390(1);
			local62 = Static275.aClass8_Sub2_Sub1_6.method2390(7);
			@Pc(157) int local157 = Static275.aClass8_Sub2_Sub1_6.method2390(7);
			@Pc(162) int local162 = Static275.aClass8_Sub2_Sub1_6.method2390(1);
			if (local162 == 1) {
				Static171.anIntArray259[Static291.anInt3609++] = 2047;
			}
			Static34.anInt770 = Static275.aClass8_Sub2_Sub1_6.method2390(2);
			Static21.aClass36_Sub3_Sub1_1.method3085(local62, local157, local50 == 1);
		}
	}
}
