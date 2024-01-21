import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!jf", name = "Wb", descriptor = "I")
	public static int anInt2037;

	@OriginalMember(owner = "client!jf", name = "Dc", descriptor = "I")
	public static int anInt2062;

	@OriginalMember(owner = "client!jf", name = "ac", descriptor = "Lclient!ic;")
	private static Class34 aClass34_923 = Static56.method816("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@OriginalMember(owner = "client!jf", name = "rb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_918 = aClass34_923;

	@OriginalMember(owner = "client!jf", name = "yb", descriptor = "Lclient!af;")
	public static Class7 aClass7_14 = new Class7(32);

	@OriginalMember(owner = "client!jf", name = "zb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_920 = Static56.method816("::fpsoff");

	@OriginalMember(owner = "client!jf", name = "Cb", descriptor = "I")
	public static int anInt2023 = 0;

	@OriginalMember(owner = "client!jf", name = "Ub", descriptor = "Lclient!ic;")
	private static Class34 aClass34_922 = Static56.method816("Connection timed out)3");

	@OriginalMember(owner = "client!jf", name = "Pb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_921 = aClass34_922;

	@OriginalMember(owner = "client!jf", name = "cc", descriptor = "I")
	public static int anInt2042 = 1;

	@OriginalMember(owner = "client!jf", name = "pc", descriptor = "[I")
	public static int[] anIntArray265 = new int[1000];

	@OriginalMember(owner = "client!jf", name = "uc", descriptor = "[[S")
	public static short[][] aShortArrayArray7 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!jf", name = "Ac", descriptor = "Lclient!ic;")
	private static Class34 aClass34_925 = Static56.method816("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!jf", name = "zc", descriptor = "Lclient!ic;")
	public static Class34 aClass34_924 = aClass34_925;

	@OriginalMember(owner = "client!jf", name = "Gc", descriptor = "I")
	public static final int anInt2065 = 20;

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)V")
	public static void method1223() {
		@Pc(6) int local6 = Static10.aClass8_Sub20_Sub1_1.method1899(8);
		@Pc(19) int local19;
		if (Static41.anInt986 > local6) {
			for (local19 = local6; local19 < Static41.anInt986; local19++) {
				Static2.anIntArray2[Static56.anInt1443++] = Static29.anIntArray109[local19];
			}
		}
		if (local6 > Static41.anInt986) {
			throw new RuntimeException("gppov1");
		}
		Static41.anInt986 = 0;
		for (local19 = 0; local19 < local6; local19++) {
			@Pc(57) int local57 = Static29.anIntArray109[local19];
			@Pc(61) Class8_Sub1_Sub1_Sub4_Sub1 local61 = Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[local57];
			@Pc(66) int local66 = Static10.aClass8_Sub20_Sub1_1.method1899(1);
			if (local66 == 0) {
				Static29.anIntArray109[Static41.anInt986++] = local57;
				local61.anInt2057 = Static21.anInt655;
			} else {
				@Pc(89) int local89 = Static10.aClass8_Sub20_Sub1_1.method1899(2);
				if (local89 == 0) {
					Static29.anIntArray109[Static41.anInt986++] = local57;
					local61.anInt2057 = Static21.anInt655;
					Static3.anIntArray4[Static95.anInt2240++] = local57;
				} else {
					@Pc(133) int local133;
					@Pc(143) int local143;
					if (local89 == 1) {
						Static29.anIntArray109[Static41.anInt986++] = local57;
						local61.anInt2057 = Static21.anInt655;
						local133 = Static10.aClass8_Sub20_Sub1_1.method1899(3);
						local61.method1222(local133, false);
						local143 = Static10.aClass8_Sub20_Sub1_1.method1899(1);
						if (local143 == 1) {
							Static3.anIntArray4[Static95.anInt2240++] = local57;
						}
					} else if (local89 == 2) {
						Static29.anIntArray109[Static41.anInt986++] = local57;
						local61.anInt2057 = Static21.anInt655;
						local133 = Static10.aClass8_Sub20_Sub1_1.method1899(3);
						local61.method1222(local133, true);
						local143 = Static10.aClass8_Sub20_Sub1_1.method1899(3);
						local61.method1222(local143, true);
						@Pc(197) int local197 = Static10.aClass8_Sub20_Sub1_1.method1899(1);
						if (local197 == 1) {
							Static3.anIntArray4[Static95.anInt2240++] = local57;
						}
					} else if (local89 == 3) {
						Static2.anIntArray2[Static56.anInt1443++] = local57;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "(B)V")
	public static void method1225() {
		anIntArray265 = null;
		aClass34_925 = null;
		aClass34_921 = null;
		aClass34_922 = null;
		aClass34_918 = null;
		aClass34_923 = null;
		aClass34_924 = null;
		aClass7_14 = null;
		aClass34_920 = null;
		aShortArrayArray7 = null;
	}
}
