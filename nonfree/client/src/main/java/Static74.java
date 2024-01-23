import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!gh", name = "X", descriptor = "I")
	public static int anInt1601;

	@OriginalMember(owner = "client!gh", name = "I", descriptor = "I")
	public static int anInt1594 = 4;

	@OriginalMember(owner = "client!gh", name = "J", descriptor = "I")
	public static int anInt1595 = 0;

	@OriginalMember(owner = "client!gh", name = "K", descriptor = "Lclient!qe;")
	private static Class78 aClass78_357 = Static199.method3560("Continue");

	@OriginalMember(owner = "client!gh", name = "M", descriptor = "[I")
	public static int[] anIntArray271 = new int[anInt1594];

	@OriginalMember(owner = "client!gh", name = "N", descriptor = "[[Lclient!a;")
	public static Class1[][] aClass1ArrayArray1 = new Class1[anInt1594][500];

	@OriginalMember(owner = "client!gh", name = "Q", descriptor = "Z")
	public static boolean aBoolean57 = false;

	@OriginalMember(owner = "client!gh", name = "R", descriptor = "[Lclient!sg;")
	public static Class86[] aClass86Array1 = new Class86[50];

	@OriginalMember(owner = "client!gh", name = "Y", descriptor = "Lclient!qe;")
	public static Class78 aClass78_358 = aClass78_357;

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)V")
	public static void method1230() {
		Static171.aClass110_17.method3889();
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!hh;III)V")
	public static void method1233(@OriginalArg(0) Class5_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.anInt1873 == arg2 && arg2 != -1) {
			@Pc(19) Class2_Sub3_Sub3 local19 = Static187.method3447(arg2);
			@Pc(22) int local22 = local19.anInt439;
			if (local22 == 1) {
				arg0.anInt1829 = 0;
				arg0.anInt1848 = 0;
				arg0.anInt1835 = 0;
				arg0.anInt1831 = arg1;
				Static118.method2181(arg0 == Static31.aClass5_Sub2_Sub2_1, arg0.anInt1848, arg0.anInt1849, arg0.anInt1827, local19);
			}
			if (local22 == 2) {
				arg0.anInt1829 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt1873 == -1 || Static187.method3447(arg2).anInt438 >= Static187.method3447(arg0.anInt1873).anInt438) {
			arg0.anInt1876 = arg0.anInt1881;
			arg0.anInt1829 = 0;
			arg0.anInt1831 = arg1;
			arg0.anInt1835 = 0;
			arg0.anInt1848 = 0;
			arg0.anInt1873 = arg2;
			if (arg0.anInt1873 != -1) {
				Static118.method2181(arg0 == Static31.aClass5_Sub2_Sub2_1, arg0.anInt1848, arg0.anInt1849, arg0.anInt1827, Static187.method3447(arg0.anInt1873));
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!oe;III)[Lclient!gd;")
	public static Class2_Sub3_Sub8[] method1234(@OriginalArg(0) Class72 arg0, @OriginalArg(1) int arg1) {
		return Static55.method713(arg1, arg0) ? Static193.method3531() : null;
	}
}
