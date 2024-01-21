import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "[I")
	public static int[] anIntArray173;

	@OriginalMember(owner = "client!wg", name = "y", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "[[S")
	public static short[][] aShortArrayArray5 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "Z")
	public static boolean aBoolean89 = false;

	@OriginalMember(owner = "client!wg", name = "p", descriptor = "Lclient!ai;")
	public static Class6 aClass6_666 = Static38.method685("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!wg", name = "s", descriptor = "Lclient!ai;")
	public static Class6 aClass6_667 = Static38.method685("<col=40ff00>");

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
	public static void method1510() {
		try {
			if (Static153.aClass32_1 == null) {
				Static153.aClass32_1 = new Class32(Static107.aClass36_4, Static58.method956(new Class6[] { Static177.aClass6_1250, Static9.aClass6_74, Static115.aClass6_797 }).method130());
			} else {
				@Pc(36) byte[] local36 = Static153.aClass32_1.method982();
				if (local36 != null) {
					@Pc(43) Class2_Sub13 local43 = new Class2_Sub13(local36);
					Static117.anInt2796 = local43.method1397();
					Static34.aClass18Array1 = new Class18[Static117.anInt2796];
					for (@Pc(52) int local52 = 0; local52 < Static117.anInt2796; local52++) {
						@Pc(62) Class18 local62 = Static34.aClass18Array1[local52] = new Class18();
						@Pc(66) int local66 = local43.method1397();
						local62.anInt738 = local66 & 0x7FFF;
						local62.aBoolean30 = (local66 & 0x8000) != 0;
						local62.aClass6_203 = local43.method1399();
						local62.anInt744 = local43.method1400();
						local62.anInt737 = local52;
						local62.anInt740 = Static168.method2680(local62.aClass6_203);
					}
					Static143.method2223(Static34.aClass18Array1.length - 1, 0, Static172.anIntArray389, Static123.anIntArray248, Static34.aClass18Array1);
					Static153.aClass32_1 = null;
					Static138.aBoolean134 = true;
				}
			}
		} catch (@Pc(128) Exception local128) {
			local128.printStackTrace();
			Static153.aClass32_1 = null;
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(B)V")
	public static void method1511() {
		aClass6_666 = null;
		anIntArrayArrayArray6 = null;
		aClass6_667 = null;
		anIntArray173 = null;
		aShortArrayArray5 = null;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)V")
	public static void method1516(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		local8[0] = arg1;
		@Pc(19) int[] local19 = new int[4];
		local19[0] = arg0;
		@Pc(25) int local25 = 1;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			if (Static123.anIntArray248[local27] != arg1) {
				local8[local25] = Static123.anIntArray248[local27];
				local19[local25] = Static172.anIntArray389[local27];
				local25++;
			}
		}
		Static123.anIntArray248 = local8;
		Static172.anIntArray389 = local19;
		Static143.method2223(Static34.aClass18Array1.length - 1, 0, Static172.anIntArray389, Static123.anIntArray248, Static34.aClass18Array1);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!wa;B)Z")
	public static boolean method1519(@OriginalArg(0) Class87 arg0) {
		if (arg0.anIntArray390 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray390.length; local17++) {
			@Pc(24) int local24 = Static76.method1167(local17, arg0);
			@Pc(29) int local29 = arg0.anIntArray393[local17];
			if (arg0.anIntArray390[local17] == 2) {
				if (local24 >= local29) {
					return false;
				}
			} else if (arg0.anIntArray390[local17] == 3) {
				if (local29 >= local24) {
					return false;
				}
			} else if (arg0.anIntArray390[local17] == 4) {
				if (local29 == local24) {
					return false;
				}
			} else if (local29 != local24) {
				return false;
			}
		}
		return true;
	}
}
