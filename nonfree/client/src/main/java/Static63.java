import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!el", name = "vb", descriptor = "I")
	public static int anInt1769;

	@OriginalMember(owner = "client!el", name = "Lb", descriptor = "[I")
	public static int[] anIntArray137;

	@OriginalMember(owner = "client!el", name = "Ob", descriptor = "Lclient!gf;")
	public static Class1_Sub2_Sub7 aClass1_Sub2_Sub7_1;

	@OriginalMember(owner = "client!el", name = "ob", descriptor = "Lclient!lc;")
	public static Class79 aClass79_8 = new Class79(5);

	@OriginalMember(owner = "client!el", name = "xb", descriptor = "Z")
	public static boolean aBoolean96 = true;

	@OriginalMember(owner = "client!el", name = "zb", descriptor = "Lclient!lc;")
	public static Class79 aClass79_9 = new Class79(16);

	@OriginalMember(owner = "client!el", name = "Gb", descriptor = "[I")
	public static int[] anIntArray135 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!el", name = "Mb", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray10 = new String[200];

	@OriginalMember(owner = "client!el", name = "Nb", descriptor = "Lclient!se;")
	public static Class122 aClass122_7 = null;

	@OriginalMember(owner = "client!el", name = "Pb", descriptor = "I")
	public static int anInt1779 = 0;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IB)V")
	public static void method1218(@OriginalArg(0) int arg0) {
		if (Static156.method2772(arg0)) {
			Static113.method4185(Static80.aClass122ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIIBI)V")
	public static void method1219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg3 + arg0;
		@Pc(14) int local14 = arg4 - arg0;
		for (@Pc(16) int local16 = arg3; local16 < local6; local16++) {
			Static147.method2681(Static29.anIntArrayArray10[local16], arg2, arg5, arg1);
		}
		@Pc(39) int local39 = arg5 + arg0;
		@Pc(44) int local44 = arg1 - arg0;
		for (@Pc(46) int local46 = arg4; local46 > local14; local46--) {
			Static147.method2681(Static29.anIntArrayArray10[local46], arg2, arg5, arg1);
		}
		for (@Pc(62) int local62 = local6; local62 <= local14; local62++) {
			@Pc(68) int[] local68 = Static29.anIntArrayArray10[local62];
			Static147.method2681(local68, arg2, arg5, local39);
			Static147.method2681(local68, arg2, local44, arg1);
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BI)I")
	public static int method1229(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!el", name = "h", descriptor = "(I)Lclient!s;")
	public static Class115_Sub1 method1235() {
		return Static113.anInt5511 < Static42.aClass115_Sub1Array1.length ? Static42.aClass115_Sub1Array1[Static113.anInt5511++] : null;
	}
}
