import java.awt.Font;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!k", name = "i", descriptor = "Lclient!ub;")
	public static Class10_Sub1_Sub1_Sub4 aClass10_Sub1_Sub1_Sub4_3;

	@OriginalMember(owner = "client!k", name = "k", descriptor = "I")
	public static int anInt1399;

	@OriginalMember(owner = "client!k", name = "r", descriptor = "Lclient!be;")
	public static Class11_Sub1 aClass11_Sub1_9;

	@OriginalMember(owner = "client!k", name = "x", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!k", name = "D", descriptor = "[I")
	public static int[] anIntArray153;

	@OriginalMember(owner = "client!k", name = "E", descriptor = "I")
	public static int anInt1408;

	@OriginalMember(owner = "client!k", name = "G", descriptor = "[Lclient!bc;")
	public static Class10_Sub1_Sub1_Sub1[] aClass10_Sub1_Sub1_Sub1Array6;

	@OriginalMember(owner = "client!k", name = "b", descriptor = "Lclient!va;")
	public static Class61 aClass61_573 = Static88.method1421("null");

	@OriginalMember(owner = "client!k", name = "g", descriptor = "I")
	public static int anInt1397 = 2;

	@OriginalMember(owner = "client!k", name = "h", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!k", name = "s", descriptor = "[I")
	public static int[] anIntArray152 = new int[] { 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800 };

	@OriginalMember(owner = "client!k", name = "t", descriptor = "Lclient!pa;")
	public static Class10_Sub10_Sub1 aClass10_Sub10_Sub1_3 = new Class10_Sub10_Sub1(5000);

	@OriginalMember(owner = "client!k", name = "u", descriptor = "I")
	public static int anInt1405 = 0;

	@OriginalMember(owner = "client!k", name = "v", descriptor = "[[I")
	public static int[][] anIntArrayArray11 = new int[104][104];

	@OriginalMember(owner = "client!k", name = "w", descriptor = "Z")
	public static volatile boolean aBoolean67 = false;

	@OriginalMember(owner = "client!k", name = "B", descriptor = "Lclient!va;")
	private static Class61 aClass61_576 = Static88.method1421("Take");

	@OriginalMember(owner = "client!k", name = "y", descriptor = "Lclient!va;")
	public static Class61 aClass61_574 = aClass61_576;

	@OriginalMember(owner = "client!k", name = "F", descriptor = "Lclient!va;")
	private static Class61 aClass61_577 = Static88.method1421("Connecting to update server");

	@OriginalMember(owner = "client!k", name = "z", descriptor = "Lclient!va;")
	public static Class61 aClass61_575 = aClass61_577;

	@OriginalMember(owner = "client!k", name = "A", descriptor = "I")
	public static int anInt1406 = 0;

	@OriginalMember(owner = "client!k", name = "C", descriptor = "I")
	public static int anInt1407 = 0;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)V")
	public static void method780(@OriginalArg(1) int arg0) {
		if (Static11.anInt319 == arg0) {
			return;
		}
		if (Static11.anInt319 == 0) {
			Static100.method1660();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static37.anInt1047 = 0;
			Static100.anInt2663 = 0;
			Static67.anInt1779 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static40.aClass27_2 != null) {
			Static40.aClass27_2.method610();
		}
		if (Static11.anInt319 == 25 || Static11.anInt319 == 40) {
			Static43.method694();
			Static45.method1525();
		}
		if (Static11.anInt319 == 25) {
			Static64.anInt1737 = 0;
			Static57.anInt1515 = 0;
			Static58.anInt1533 = 0;
			Static51.anInt1410 = 1;
			Static9.anInt302 = 1;
		}
		if (arg0 == 35) {
			Static56.method824();
			Static44.method716();
			if (Static99.aClass15_38 == null) {
				Static99.aClass15_38 = Static8.method166(Static38.aCanvas1, 503, 765);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static99.aClass15_38 = null;
			Static56.method824();
			Static104.method1641(Static106.aClass11_Sub1_15, Static38.aCanvas1, Static60.aClass11_Sub1_11);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			Static99.aClass15_38 = null;
			Static44.method716();
			Static93.method1149(Static60.aClass11_Sub1_11, Static38.aCanvas1);
		}
		Static40.aBoolean51 = true;
		Static11.anInt319 = arg0;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IBI)Z")
	public static boolean method781(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0 && Static6.anInt66 == arg0) {
			return true;
		} else if (arg1 == 1 && arg0 == Static34.anInt1019) {
			return true;
		} else {
			return (arg1 == 2 || arg1 == 3) && Static74.anInt1875 == arg0;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
	public static void method782() {
		aClass61_577 = null;
		aCRC32_1 = null;
		aClass11_Sub1_9 = null;
		aClass10_Sub10_Sub1_3 = null;
		aFont1 = null;
		aClass10_Sub1_Sub1_Sub1Array6 = null;
		aClass61_574 = null;
		anIntArray153 = null;
		aClass61_575 = null;
		aClass61_576 = null;
		aClass61_573 = null;
		anIntArray152 = null;
		anIntArrayArray11 = null;
		aClass10_Sub1_Sub1_Sub4_3 = null;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)I")
	public static int method783() {
		return Static95.anInt2441++;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIII)V")
	public static void method784(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 128 || arg1 < 128 || arg2 > 13056 || arg1 > 13056) {
			Static39.anInt280 = -1;
			Static32.anInt947 = -1;
			return;
		}
		@Pc(37) int local37 = Static39.method230(arg2, Static101.anInt2582, arg1) - arg0;
		@Pc(46) int local46 = arg1 - Static30.anInt918;
		@Pc(50) int local50 = arg2 - Static12.anInt349;
		@Pc(54) int local54 = Static84.anIntArray280[Static75.anInt2015];
		@Pc(58) int local58 = local37 - Static96.anInt2449;
		@Pc(62) int local62 = Static84.anIntArray281[Static75.anInt2015];
		@Pc(66) int local66 = Static84.anIntArray280[Static40.anInt1090];
		@Pc(70) int local70 = Static84.anIntArray281[Static40.anInt1090];
		@Pc(81) int local81 = local66 * local46 + local50 * local70 >> 16;
		@Pc(92) int local92 = local70 * local46 - local50 * local66 >> 16;
		@Pc(94) int local94 = local81;
		@Pc(105) int local105 = local62 * local58 - local54 * local92 >> 16;
		@Pc(115) int local115 = local58 * local54 + local62 * local92 >> 16;
		if (local115 >= 50) {
			Static32.anInt947 = (local105 << 9) / local115 + 167;
			Static39.anInt280 = (local94 << 9) / local115 + 256;
		} else {
			Static39.anInt280 = -1;
			Static32.anInt947 = -1;
		}
	}
}
