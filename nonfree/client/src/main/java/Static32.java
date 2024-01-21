import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!gd", name = "y", descriptor = "Lclient!m;")
	public static Class10_Sub1_Sub1_Sub2 aClass10_Sub1_Sub1_Sub2_8;

	@OriginalMember(owner = "client!gd", name = "A", descriptor = "Lclient!fa;")
	public static Class19 aClass19_4;

	@OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
	public static int anInt942;

	@OriginalMember(owner = "client!gd", name = "F", descriptor = "Lclient!va;")
	private static Class61 aClass61_382 = Static88.method1421("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!gd", name = "B", descriptor = "Lclient!va;")
	public static Class61 aClass61_381 = aClass61_382;

	@OriginalMember(owner = "client!gd", name = "D", descriptor = "Z")
	public static boolean aBoolean44 = false;

	@OriginalMember(owner = "client!gd", name = "I", descriptor = "I")
	public static int anInt944 = 0;

	@OriginalMember(owner = "client!gd", name = "K", descriptor = "Z")
	public static boolean aBoolean45 = false;

	@OriginalMember(owner = "client!gd", name = "M", descriptor = "I")
	public static int anInt947 = -1;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)V")
	public static void method564(@OriginalArg(0) int arg0) {
		if (!Static46.method731()) {
			return;
		}
		if (Static80.aBoolean95) {
			Static16.anInt527 = arg0;
		} else {
			Static54.method803(arg0);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
	public static void method565() {
		Static7.aBoolean3 = true;
		Static46.method733();
		@Pc(28) boolean local28;
		if (Static57.anInt1518 != -1) {
			local28 = Static38.method636(0, 190, -1, 1, 0, Static57.anInt1518, 261, 0);
			if (!local28) {
				Static80.aBoolean94 = true;
			}
		} else if (Static34.anIntArray114[Static25.anInt782] != -1) {
			local28 = Static38.method636(0, 190, -1, 1, 0, Static34.anIntArray114[Static25.anInt782], 261, 0);
			if (!local28) {
				Static80.aBoolean94 = true;
			}
		}
		if (Static82.aBoolean97 && Static10.anInt311 == 1) {
			Static82.method1284();
		}
		Static30.method552();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)I")
	public static int method566() {
		@Pc(13) int local13 = Static39.method230(Static12.anInt349, Static101.anInt2582, Static30.anInt918);
		return local13 - Static96.anInt2449 >= 800 || (Static21.aByteArrayArrayArray4[Static101.anInt2582][Static12.anInt349 >> 7][Static30.anInt918 >> 7] & 0x4) == 0 ? 3 : Static101.anInt2582;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(Z)V")
	public static void method567() {
		aClass61_382 = null;
		aClass19_4 = null;
		aClass10_Sub1_Sub1_Sub2_8 = null;
		aClass61_381 = null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!ed;I)V")
	public static void method568(@OriginalArg(0) Class10_Sub1_Sub5_Sub2 arg0) {
		if (Static95.anInt2442 == arg0.anInt1676 || arg0.anInt1688 == -1 || arg0.anInt1675 != 0 || arg0.anInt1651 + 1 > Static5.method33(arg0.anInt1688).anIntArray109[arg0.anInt1680]) {
			@Pc(34) int local34 = Static95.anInt2442 - arg0.anInt1635;
			@Pc(41) int local41 = arg0.anInt1676 - arg0.anInt1635;
			@Pc(51) int local51 = arg0.anInt1681 * 64 + arg0.anInt1664 * 128;
			@Pc(61) int local61 = arg0.anInt1681 * 64 + arg0.anInt1650 * 128;
			@Pc(71) int local71 = arg0.anInt1681 * 64 + arg0.anInt1648 * 128;
			arg0.anInt1654 = (local71 * local34 + local51 * (local41 - local34)) / local41;
			@Pc(95) int local95 = arg0.anInt1681 * 64 + arg0.anInt1682 * 128;
			arg0.anInt1649 = (local95 * local34 + (local41 - local34) * local61) / local41;
		}
		arg0.anInt1638 = 0;
		if (arg0.anInt1652 == 0) {
			arg0.anInt1634 = 1024;
		}
		if (arg0.anInt1652 == 1) {
			arg0.anInt1634 = 1536;
		}
		if (arg0.anInt1652 == 2) {
			arg0.anInt1634 = 0;
		}
		if (arg0.anInt1652 == 3) {
			arg0.anInt1634 = 512;
		}
		arg0.anInt1646 = arg0.anInt1634;
	}
}
