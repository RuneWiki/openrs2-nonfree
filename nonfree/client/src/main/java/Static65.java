import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!l", name = "f", descriptor = "I")
	public static int anInt1666;

	@OriginalMember(owner = "client!l", name = "g", descriptor = "I")
	public static int anInt1667;

	@OriginalMember(owner = "client!l", name = "o", descriptor = "Lclient!ea;")
	public static Class20_Sub1 aClass20_Sub1_11;

	@OriginalMember(owner = "client!l", name = "v", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "Lclient!ja;")
	public static Class39 aClass39_882 = Static28.method504("");

	@OriginalMember(owner = "client!l", name = "e", descriptor = "I")
	public static int anInt1665 = 0;

	@OriginalMember(owner = "client!l", name = "t", descriptor = "Lclient!ja;")
	public static Class39 aClass39_883 = Static28.method504("(U3");

	@OriginalMember(owner = "client!l", name = "u", descriptor = "[[S")
	public static short[][] aShortArrayArray1 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!l", name = "w", descriptor = "Lclient!ja;")
	public static Class39 aClass39_884 = Static28.method504("<br>");

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
	public static void method1150() {
		aShortArrayArray1 = null;
		aClass39_883 = null;
		aClass20_Sub1_11 = null;
		aByteArrayArrayArray4 = null;
		aClass39_884 = null;
		aClass39_882 = null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I")
	public static int method1151(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IBII)V")
	public static void method1152(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 128 || arg2 < 128 || arg0 > 13056 || arg2 > 13056) {
			Static59.anInt1553 = -1;
			Static101.anInt2516 = -1;
			return;
		}
		@Pc(31) int local31 = Static94.method1708(arg0, arg2, Static131.anInt3202) - arg1;
		@Pc(35) int local35 = arg0 - Static69.anInt1723;
		@Pc(39) int local39 = Class4_Sub2_Sub3_Sub2.anIntArray152[Static121.anInt3006];
		@Pc(43) int local43 = Class4_Sub2_Sub3_Sub2.anIntArray155[Static18.anInt423];
		@Pc(47) int local47 = arg2 - Static119.anInt3113;
		@Pc(51) int local51 = Class4_Sub2_Sub3_Sub2.anIntArray155[Static121.anInt3006];
		@Pc(61) int local61 = local35 * local51 + local39 * local47 >> 16;
		@Pc(65) int local65 = local31 - Static97.anInt2445;
		@Pc(69) int local69 = Class4_Sub2_Sub3_Sub2.anIntArray152[Static18.anInt423];
		@Pc(79) int local79 = local47 * local51 - local39 * local35 >> 16;
		@Pc(81) int local81 = local61;
		@Pc(92) int local92 = local65 * local43 - local79 * local69 >> 16;
		@Pc(102) int local102 = local43 * local79 + local65 * local69 >> 16;
		if (local102 >= 50) {
			Static59.anInt1553 = (local92 << 9) / local102 + 167;
			Static101.anInt2516 = (local81 << 9) / local102 + 256;
		} else {
			Static59.anInt1553 = -1;
			Static101.anInt2516 = -1;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ja;B)I")
	public static int method1153(@OriginalArg(0) Class39 arg0) {
		if (Static44.anInt1125 == 1) {
			return 7;
		} else if (arg0.method943(Static59.aClass39_840)) {
			return 1;
		} else if (arg0.method943(Static97.aClass39_1281)) {
			return 1;
		} else if (arg0.method943(Static29.aClass39_406)) {
			return 2;
		} else if (arg0.method943(Static123.aClass39_1631)) {
			return 2;
		} else if (arg0.method943(Static111.aClass39_1466)) {
			return 3;
		} else if (arg0.method943(Static25.aClass39_1781)) {
			return 4;
		} else if (arg0.method943(Static63.aClass39_867)) {
			return 4;
		} else if (arg0.method943(Static69.aClass39_913)) {
			return 5;
		} else if (arg0.method943(Static114.aClass39_1486)) {
			return 6;
		} else {
			return 0;
		}
	}
}
