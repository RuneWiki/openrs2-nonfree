import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!da", name = "L", descriptor = "Lclient!da;")
	public static Class3_Sub2_Sub6 aClass3_Sub2_Sub6_1;

	@OriginalMember(owner = "client!da", name = "P", descriptor = "Lclient!eh;")
	private static Class28 aClass28_271 = Static170.method3101("World");

	@OriginalMember(owner = "client!da", name = "H", descriptor = "Lclient!eh;")
	public static Class28 aClass28_268 = aClass28_271;

	@OriginalMember(owner = "client!da", name = "I", descriptor = "Lclient!eh;")
	public static Class28 aClass28_269 = aClass28_271;

	@OriginalMember(owner = "client!da", name = "K", descriptor = "Lclient!eh;")
	public static Class28 aClass28_270 = Static170.method3101("Wordpack geladen)3");

	@OriginalMember(owner = "client!da", name = "O", descriptor = "I")
	public static volatile int anInt713 = 0;

	@OriginalMember(owner = "client!da", name = "R", descriptor = "[J")
	public static long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!da", name = "T", descriptor = "I")
	public static int anInt716 = 0;

	@OriginalMember(owner = "client!da", name = "U", descriptor = "I")
	public static int anInt717 = 1;

	@OriginalMember(owner = "client!da", name = "V", descriptor = "[[[Lclient!ea;")
	public static Class23[][][] aClass23ArrayArrayArray1 = new Class23[4][104][104];

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILclient!ca;ZI)V")
	public static void method681(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub2_Sub4 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static30.anInt957 >= 50 || (arg2.anIntArray140 == null || arg2.anIntArray140.length <= arg0)) {
			return;
		}
		@Pc(25) int local25 = arg2.anIntArray140[arg0];
		if (local25 == 0) {
			return;
		}
		@Pc(32) int local32 = local25 >> 8;
		@Pc(38) int local38 = local25 >> 4 & 0x7;
		@Pc(42) int local42 = local25 & 0xF;
		if (local42 == 0) {
			if (arg3) {
				Static18.method567(local38, 0, local32);
			}
		} else if (Static138.anInt3540 != 0) {
			Static17.anIntArray135[Static30.anInt957] = local32;
			Static24.anIntArray155[Static30.anInt957] = local38;
			@Pc(72) int local72 = (arg1 - 64) / 128;
			Static87.anIntArray421[Static30.anInt957] = 0;
			Static43.aClass51Array1[Static30.anInt957] = null;
			@Pc(86) int local86 = (arg4 - 64) / 128;
			Static96.anIntArray695[Static30.anInt957] = local42 + (local72 << 16) + (local86 << 8);
			Static30.anInt957++;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
	public static void method682() {
		aClass23ArrayArrayArray1 = null;
		aLongArray4 = null;
		aClass28_268 = null;
		aClass28_271 = null;
		aClass28_270 = null;
		aClass3_Sub2_Sub6_1 = null;
		aClass28_269 = null;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(III)V")
	public static void method683(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int[] local13 = new int[4];
		local13[0] = arg1;
		@Pc(20) int[] local20 = new int[4];
		@Pc(22) int local22 = 1;
		local20[0] = arg0;
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			if (arg1 != Static96.anIntArray697[local28]) {
				local13[local22] = Static96.anIntArray697[local28];
				local20[local22] = Static109.anIntArray492[local28];
				local22++;
			}
		}
		Static96.anIntArray697 = local13;
		Static109.anIntArray492 = local20;
		Static102.method2117(Static59.aClass67Array1.length - 1, Static96.anIntArray697, 0, Static109.anIntArray492, Static59.aClass67Array1);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III[[[I)V")
	public static void method684(@OriginalArg(3) int[][][] arg0) {
		Static7.anInt228 = 4;
		Static90.anInt2564 = 104;
		Static87.anInt2536 = 104;
		Static149.aClass3_Sub20ArrayArrayArray1 = new Class3_Sub20[4][104][104];
		Static92.anIntArrayArrayArray41 = new int[4][105][105];
		Static35.anIntArrayArrayArray17 = arg0;
		Static116.method2333();
	}
}
