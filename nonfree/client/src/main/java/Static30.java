import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!au", name = "i", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray2;

	@OriginalMember(owner = "client!au", name = "q", descriptor = "Lclient!hh;")
	public static Class6 aClass6_7;

	@OriginalMember(owner = "client!au", name = "N", descriptor = "I")
	private static int anInt1563;

	@OriginalMember(owner = "client!au", name = "O", descriptor = "I")
	private static int anInt1564;

	@OriginalMember(owner = "client!au", name = "P", descriptor = "I")
	private static int anInt1565;

	@OriginalMember(owner = "client!au", name = "Q", descriptor = "Z")
	private static boolean aBoolean113;

	@OriginalMember(owner = "client!au", name = "R", descriptor = "Z")
	private static boolean aBoolean114;

	@OriginalMember(owner = "client!au", name = "S", descriptor = "I")
	private static int anInt1566;

	@OriginalMember(owner = "client!au", name = "T", descriptor = "I")
	private static int anInt1567;

	@OriginalMember(owner = "client!au", name = "U", descriptor = "I")
	private static int anInt1568;

	@OriginalMember(owner = "client!au", name = "V", descriptor = "Z")
	private static boolean aBoolean115;

	@OriginalMember(owner = "client!au", name = "W", descriptor = "Z")
	private static boolean aBoolean116;

	@OriginalMember(owner = "client!au", name = "X", descriptor = "Z")
	private static boolean aBoolean117;

	@OriginalMember(owner = "client!au", name = "Y", descriptor = "Z")
	private static boolean aBoolean118;

	@OriginalMember(owner = "client!au", name = "Z", descriptor = "Z")
	private static boolean aBoolean119;

	@OriginalMember(owner = "client!au", name = "ab", descriptor = "I")
	private static int anInt1569;

	@OriginalMember(owner = "client!au", name = "bb", descriptor = "I")
	private static int anInt1570;

	@OriginalMember(owner = "client!au", name = "cb", descriptor = "Z")
	private static boolean aBoolean120;

	@OriginalMember(owner = "client!au", name = "db", descriptor = "Z")
	private static boolean aBoolean121;

	@OriginalMember(owner = "client!au", name = "eb", descriptor = "Z")
	private static boolean aBoolean122;

	@OriginalMember(owner = "client!au", name = "x", descriptor = "I")
	public static int anInt1549 = 0;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(II)V")
	public static void method1349(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = Static122.anInt2190 - Static481.anInt10578;
		if (local7 >= 100) {
			Static468.anInt7425 = -1;
			Static351.anInt6038 = -1;
			Static451.anInt7263 = 1;
			return;
		}
		@Pc(22) int local22 = (int) Static376.aFloat104;
		if (local22 < Static604.anInt10087 >> 8) {
			local22 = Static604.anInt10087 >> 8;
		}
		if (Static185.aBooleanArray13[4] && local22 < Static122.anIntArray131[4] + 128) {
			local22 = Static122.anIntArray131[4] + 128;
		}
		@Pc(59) int local59 = Static307.anInt5275 + (int) Static318.aFloat81 & 0x3FFF;
		Static325.method4641((local22 >> 3) * 3 + 600 << 2, local22, local59, Static434.anInt7081, Static365.anInt6231, arg0, Static662.method8831(Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9619, Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9614, Static570.anInt9192) - 200);
		@Pc(103) float local103 = 1.0F - (float) ((100 - local7) * (-local7 + 100) * (100 - local7)) / 1000000.0F;
		Static166.anInt3034 = (int) ((float) (Static166.anInt3034 - Static632.anInt10466) * local103 + (float) Static632.anInt10466);
		Static370.anInt6266 = (int) ((float) Static202.anInt3565 + (float) (Static370.anInt6266 - Static202.anInt3565) * local103);
		Static655.anInt10676 = (int) ((float) Static6.anInt85 + local103 * (float) (Static655.anInt10676 - Static6.anInt85));
		Static564.anInt9117 = (int) ((float) Static180.anInt3305 + local103 * (float) (Static564.anInt9117 - Static180.anInt3305));
		@Pc(156) int local156 = Static40.anInt856 - Static595.anInt9608;
		if (local156 > 8192) {
			local156 -= 16384;
		} else if (local156 < -8192) {
			local156 += 16384;
		}
		Static40.anInt856 = (int) ((float) Static595.anInt9608 + (float) local156 * local103);
		Static40.anInt856 &= 0x3FFF;
	}
}
