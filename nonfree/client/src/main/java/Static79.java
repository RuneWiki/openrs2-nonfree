import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas2;

	@OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
	public static int anInt1725;

	@OriginalMember(owner = "client!hb", name = "K", descriptor = "I")
	public static int anInt1729;

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "[[I")
	public static int[][] anIntArrayArray19 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!hb", name = "L", descriptor = "Lclient!qe;")
	private static Class78 aClass78_383 = Static199.method3560("Members only world");

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "Lclient!qe;")
	public static Class78 aClass78_382 = aClass78_383;

	@OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
	public static int anInt1727 = 50;

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "[Lclient!qe;")
	public static Class78[] aClass78Array15 = new Class78[anInt1727];

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "[I")
	public static int[] anIntArray285 = new int[anInt1727];

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "[I")
	public static int[] anIntArray286 = new int[32768];

	@OriginalMember(owner = "client!hb", name = "w", descriptor = "[I")
	public static int[] anIntArray287 = new int[anInt1727];

	@OriginalMember(owner = "client!hb", name = "x", descriptor = "[I")
	public static int[] anIntArray288 = new int[anInt1727];

	@OriginalMember(owner = "client!hb", name = "y", descriptor = "[I")
	public static int[] anIntArray289 = new int[anInt1727];

	@OriginalMember(owner = "client!hb", name = "z", descriptor = "[I")
	public static int[] anIntArray290 = new int[anInt1727];

	@OriginalMember(owner = "client!hb", name = "A", descriptor = "[I")
	public static int[] anIntArray291 = new int[anInt1727];

	@OriginalMember(owner = "client!hb", name = "B", descriptor = "[I")
	public static int[] anIntArray292 = new int[anInt1727];

	@OriginalMember(owner = "client!hb", name = "C", descriptor = "Z")
	public static boolean aBoolean63 = false;

	@OriginalMember(owner = "client!hb", name = "H", descriptor = "[S")
	public static short[] aShortArray53 = new short[500];

	@OriginalMember(owner = "client!hb", name = "M", descriptor = "Lclient!qe;")
	public static Class78 aClass78_384 = Static199.method3560("(U0a )2 via: ");

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILclient!gg;I)V")
	public static void method1336(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub2_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg1.anInt1873 && arg2 != -1) {
			@Pc(14) Class2_Sub3_Sub3 local14 = Static187.method3447(arg2);
			@Pc(17) int local17 = local14.anInt439;
			if (local17 == 1) {
				arg1.anInt1829 = 0;
				arg1.anInt1848 = 0;
				arg1.anInt1835 = 0;
				arg1.anInt1831 = arg0;
				Static118.method2181(false, arg1.anInt1848, arg1.anInt1849, arg1.anInt1827, local14);
			}
			if (local17 == 2) {
				arg1.anInt1829 = 0;
			}
		} else if (arg2 == -1 || arg1.anInt1873 == -1 || Static187.method3447(arg2).anInt438 >= Static187.method3447(arg1.anInt1873).anInt438) {
			arg1.anInt1873 = arg2;
			arg1.anInt1831 = arg0;
			arg1.anInt1848 = 0;
			arg1.anInt1876 = arg1.anInt1881;
			arg1.anInt1829 = 0;
			arg1.anInt1835 = 0;
			if (arg1.anInt1873 != -1) {
				Static118.method2181(false, arg1.anInt1848, arg1.anInt1849, arg1.anInt1827, Static187.method3447(arg1.anInt1873));
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)I")
	public static int method1338(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static120.method2212(arg0);
	}
}
