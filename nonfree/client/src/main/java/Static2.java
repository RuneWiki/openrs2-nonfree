import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "[I")
	public static int[] anIntArray230;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray6 = new byte[50][];

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "J")
	public static long aLong65 = 0L;

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "Lclient!qa;")
	public static Class54 aClass54_30 = new Class54(50);

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
	public static int anInt1862 = 0;

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray23 = new int[104][104];

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "Lclient!vc;")
	public static Class71 aClass71_904 = Static38.method736("mapback");

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "Lclient!pb;")
	public static Class52 aClass52_10 = new Class52();

	@OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
	public static final int anInt1865 = 3353893;

	@OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
	public static int anInt1866 = 0;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIII)V")
	public static void method1233(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 128 || arg2 < 128 || arg0 > 13056 || arg2 > 13056) {
			Static42.anInt1070 = -1;
			Static95.anInt2287 = -1;
			return;
		}
		@Pc(37) int local37 = Static26.method989(arg0, Static23.anInt728, arg2) - arg1;
		@Pc(41) int local41 = local37 - Static5.anInt202;
		@Pc(45) int local45 = arg0 - Static37.anInt572;
		@Pc(49) int local49 = arg2 - Static1.anInt1;
		@Pc(53) int local53 = Class5_Sub1_Sub10_Sub2.anIntArray241[Static31.anInt815];
		@Pc(57) int local57 = Class5_Sub1_Sub10_Sub2.anIntArray240[Static31.anInt815];
		@Pc(61) int local61 = Class5_Sub1_Sub10_Sub2.anIntArray241[Static4.anInt171];
		@Pc(70) int local70 = Class5_Sub1_Sub10_Sub2.anIntArray240[Static4.anInt171];
		@Pc(80) int local80 = local45 * local70 + local49 * local61 >> 16;
		@Pc(91) int local91 = local49 * local70 - local45 * local61 >> 16;
		@Pc(93) int local93 = local80;
		@Pc(104) int local104 = local57 * local41 - local91 * local53 >> 16;
		@Pc(114) int local114 = local91 * local57 + local41 * local53 >> 16;
		if (local114 < 50) {
			Static95.anInt2287 = -1;
			Static42.anInt1070 = -1;
		} else {
			Static95.anInt2287 = (local104 << 9) / local114 + 167;
			Static42.anInt1070 = (local93 << 9) / local114 + 256;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!nb;II)Lclient!ia;")
	public static Class5_Sub1_Sub10_Sub1 method1235(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1) {
		return Static1.method9(arg0, arg1) ? Static89.method1409() : null;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
	public static void method1237() {
		Static61.aClass5_Sub11_Sub1_8.method1553(189);
		if (Static95.anInt2286 != -1) {
			Static117.method1924(Static95.anInt2286);
			Static88.anInt2058 = -1;
			Static16.aBoolean22 = true;
			Static95.anInt2286 = -1;
			Static28.aBoolean33 = true;
		}
		if (Static62.anInt1577 != -1) {
			Static117.method1924(Static62.anInt1577);
			Static68.aBoolean72 = true;
			Static88.anInt2058 = -1;
			Static62.anInt1577 = -1;
		}
		if (Static68.anInt1659 != -1) {
			Static117.method1924(Static68.anInt1659);
			Static68.anInt1659 = -1;
			Static27.method571(30);
		}
		if (Static75.anInt1857 != -1) {
			Static117.method1924(Static75.anInt1857);
			Static75.anInt1857 = -1;
		}
		if (Static47.anInt1298 != -1) {
			Static117.method1924(Static47.anInt1298);
			Static47.anInt1298 = -1;
			Static88.anInt2058 = -1;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
	public static void method1239() {
		aClass52_10 = null;
		anIntArrayArray23 = null;
		aClass71_904 = null;
		anIntArray230 = null;
		aClass54_30 = null;
		aByteArrayArray6 = null;
	}
}
