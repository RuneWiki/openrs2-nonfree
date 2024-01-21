import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "Lclient!nh;")
	public static Class62 aClass62_14;

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "[I")
	public static final int[] anIntArray139 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "[Lclient!jd;")
	public static final Class46[] aClass46Array12 = new Class46[1000];

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_511 = Static177.method3050("null");

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "Z")
	public static boolean aBoolean64 = false;

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_512 = Static177.method3050("settings=");

	@OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
	public static int anInt1331 = 0;

	@OriginalMember(owner = "client!fh", name = "r", descriptor = "[[[B")
	public static final byte[][][] aByteArrayArrayArray2 = new byte[4][104][104];

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
	public static void method1028() {
		Static58.aClass66_26.method2218();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIILclient!tg;Lclient!tg;IIIIJ)V")
	public static void method1029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub1_Sub1 arg4, @OriginalArg(5) Class4_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class65 local6 = new Class65();
		local6.aLong107 = arg10;
		local6.anInt2980 = arg1 * 128 + 64;
		local6.anInt2977 = arg2 * 128 + 64;
		local6.anInt2979 = arg3;
		local6.aClass4_Sub1_Sub1_6 = arg4;
		local6.aClass4_Sub1_Sub1_5 = arg5;
		local6.anInt2978 = arg6;
		local6.anInt2983 = arg7;
		local6.anInt2976 = arg8;
		local6.anInt2984 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static28.aClass4_Sub7ArrayArrayArray1[local46][arg1][arg2] == null) {
				Static28.aClass4_Sub7ArrayArrayArray1[local46][arg1][arg2] = new Class4_Sub7(local46, arg1, arg2);
			}
		}
		Static28.aClass4_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass65_1 = local6;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!nh;Lclient!nh;BLclient!nh;Lclient!nh;)V")
	public static void method1030(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(3) Class62 arg2, @OriginalArg(4) Class62 arg3) {
		Static179.aClass62_45 = arg3;
		Static167.aClass62_42 = arg2;
		Static90.aClass62_23 = arg1;
		Static153.aClass62_41 = arg0;
		Static54.aClass1ArrayArray1 = new Class1[Static167.aClass62_42.method2863()][];
		Static139.aBooleanArray13 = new boolean[Static167.aClass62_42.method2863()];
	}
}
