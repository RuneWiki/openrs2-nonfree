import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!ob", name = "x", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!ob", name = "C", descriptor = "Lclient!nb;")
	public static Class3_Sub1_Sub5_Sub4 aClass3_Sub1_Sub5_Sub4_13;

	@OriginalMember(owner = "client!ob", name = "Lb", descriptor = "Lclient!nb;")
	public static Class3_Sub1_Sub5_Sub4 aClass3_Sub1_Sub5_Sub4_14;

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "Lclient!na;")
	public static Class53 aClass53_381 = Static109.method1737(":chalreq:");

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
	public static int anInt940 = 0;

	@OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
	public static int anInt946 = 0;

	@OriginalMember(owner = "client!ob", name = "M", descriptor = "Lclient!na;")
	private static Class53 aClass53_383 = Static109.method1737("Select a world");

	@OriginalMember(owner = "client!ob", name = "J", descriptor = "Lclient!na;")
	public static Class53 aClass53_382 = aClass53_383;

	@OriginalMember(owner = "client!ob", name = "jb", descriptor = "Lclient!na;")
	private static Class53 aClass53_385 = Static109.method1737("Off");

	@OriginalMember(owner = "client!ob", name = "N", descriptor = "Lclient!na;")
	public static Class53 aClass53_384 = aClass53_385;

	@OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
	public static int anInt957 = -1;

	@OriginalMember(owner = "client!ob", name = "V", descriptor = "[I")
	public static int[] anIntArray110 = new int[100];

	@OriginalMember(owner = "client!ob", name = "Fb", descriptor = "Lclient!na;")
	private static Class53 aClass53_388 = Static109.method1737("Loaded fonts");

	@OriginalMember(owner = "client!ob", name = "wb", descriptor = "Lclient!na;")
	public static Class53 aClass53_386 = aClass53_388;

	@OriginalMember(owner = "client!ob", name = "yb", descriptor = "I")
	public static int anInt989 = -1;

	@OriginalMember(owner = "client!ob", name = "Cb", descriptor = "Lclient!na;")
	public static Class53 aClass53_387 = Static109.method1737("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "(I)I")
	public static int method613() {
		@Pc(9) int local9 = Static77.method1355(Static115.anInt2618, Static72.anInt1813, Static39.anInt1177);
		return local9 - Static95.anInt2273 >= 800 || (Static37.aByteArrayArrayArray17[Static72.anInt1813][Static39.anInt1177 >> 7][Static115.anInt2618 >> 7] & 0x4) == 0 ? 3 : Static72.anInt1813;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BII)I")
	public static int method616(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 2) {
			@Pc(20) int local20 = method616(arg0 >> 1, arg1 * arg1);
			if ((arg0 & 0x1) != 0) {
				local20 *= arg1;
			}
			return local20;
		} else if (arg0 == 1) {
			return arg1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIII)V")
	public static void method626(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15;
		for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
			for (local15 = 0; local15 < 8; local15++) {
				Static107.anIntArrayArrayArray7[arg2][local11 + arg0][arg1 + local15] = 0;
			}
		}
		if (arg0 > 0) {
			for (local15 = 1; local15 < 8; local15++) {
				Static107.anIntArrayArrayArray7[arg2][arg0][local15 + arg1] = Static107.anIntArrayArrayArray7[arg2][arg0 - 1][arg1 + local15];
			}
		}
		if (arg1 > 0) {
			for (local15 = 1; local15 < 8; local15++) {
				Static107.anIntArrayArrayArray7[arg2][local15 + arg0][arg1] = Static107.anIntArrayArrayArray7[arg2][local15 + arg0][arg1 - 1];
			}
		}
		if (arg0 > 0 && Static107.anIntArrayArrayArray7[arg2][arg0 - 1][arg1] != 0) {
			Static107.anIntArrayArrayArray7[arg2][arg0][arg1] = Static107.anIntArrayArrayArray7[arg2][arg0 - 1][arg1];
		} else if (arg1 > 0 && Static107.anIntArrayArrayArray7[arg2][arg0][arg1 - 1] != 0) {
			Static107.anIntArrayArrayArray7[arg2][arg0][arg1] = Static107.anIntArrayArrayArray7[arg2][arg0][arg1 - 1];
		} else if (arg0 > 0 && arg1 > 0 && Static107.anIntArrayArrayArray7[arg2][arg0 - 1][arg1 - 1] != 0) {
			Static107.anIntArrayArrayArray7[arg2][arg0][arg1] = Static107.anIntArrayArrayArray7[arg2][arg0 - 1][arg1 - 1];
		}
	}

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "(B)V")
	public static void method627() {
		aClass53_385 = null;
		aClass53_383 = null;
		aClass53_388 = null;
		aClass53_387 = null;
		aClass53_386 = null;
		aByteArrayArrayArray6 = null;
		aClass3_Sub1_Sub5_Sub4_14 = null;
		aClass53_384 = null;
		aClass53_381 = null;
		aClass3_Sub1_Sub5_Sub4_13 = null;
		aClass53_382 = null;
		anIntArray110 = null;
	}

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "(II)Z")
	public static boolean method637(@OriginalArg(0) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "(BI)Lclient!na;")
	public static Class53 method653(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? Static108.method1725(arg0) : Static40.aClass53_519;
	}
}
