import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!i", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString110 = "Loading...";

	@OriginalMember(owner = "client!i", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString112 = "Loading interfaces - ";

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIII)V")
	public static void method1910(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static68.anInt1509 <= arg1 - arg2 && Static43.anInt1054 >= arg2 + arg1 && arg3 - arg2 >= Static127.anInt2664 && arg2 + arg3 <= Static290.anInt6021) {
			Static110.method2047(arg3, arg1, arg5, arg4, arg2, arg0);
		} else {
			Static79.method1514(arg5, arg2, arg4, arg0, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIIIILclient!qh;III)V")
	public static void method1914(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class143 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(9) int local9 = arg6 & 0x3;
		@Pc(23) int local23;
		@Pc(20) int local20;
		if (local9 == 1 || local9 == 3) {
			local20 = arg4.anInt4496;
			local23 = arg4.anInt4494;
		} else {
			local20 = arg4.anInt4494;
			local23 = arg4.anInt4496;
		}
		@Pc(38) int local38;
		@Pc(42) int local42;
		if (local20 + arg7 > 104) {
			local38 = arg7;
			local42 = arg7 + 1;
		} else {
			local42 = arg7 + (local20 + 1 >> 1);
			local38 = (local20 >> 1) + arg7;
		}
		@Pc(69) int local69;
		@Pc(67) int local67;
		if (local23 + arg0 > 104) {
			local67 = arg0 + 1;
			local69 = arg0;
		} else {
			local67 = (local23 + 1 >> 1) + arg0;
			local69 = arg0 + (local23 >> 1);
		}
		@Pc(93) int local93 = (local23 << 6) + (arg0 << 7);
		@Pc(97) int[][] local97 = Static141.anIntArrayArrayArray4[arg2];
		@Pc(105) int local105 = (local20 << 6) + (arg7 << 7);
		@Pc(131) int local131 = local97[local69][local42] + local97[local67][local38] + local97[local69][local38] + local97[local67][local42] >> 2;
		@Pc(133) int local133 = 0;
		@Pc(143) int[][] local143;
		if (arg2 != 0) {
			local143 = Static141.anIntArrayArrayArray4[0];
			local133 = local131 - (local143[local67][local42] + local143[local67][local38] + local143[local69][local38] + local143[local69][local42] >> 2);
		}
		local143 = null;
		if (arg2 < 3) {
			local143 = Static141.anIntArrayArrayArray4[arg2 + 1];
		}
		@Pc(202) Class62 local202 = arg4.method3651(null, local143, arg3, local105, false, local131, true, arg6, local97, local93);
		Static194.method3252(local202.aClass71_Sub1_1, local93 - arg1, local133, local105 - arg5);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIZ)V")
	public static void method1915(@OriginalArg(3) int arg0, @OriginalArg(4) boolean arg1) {
		Static26.anInt552 = 104;
		Static232.anInt4787 = 104;
		Static92.anInt2034 = arg0;
		Static272.aClass2_Sub31ArrayArrayArray3 = new Class2_Sub31[4][Static26.anInt552][Static232.anInt4787];
		Static274.anIntArrayArrayArray14 = new int[4][Static26.anInt552 + 1][Static232.anInt4787 + 1];
		if (Static60.aBoolean106) {
			Static103.aClass2_Sub12ArrayArray2 = new Class2_Sub12[4][];
		}
		if (arg1) {
			Static102.aClass2_Sub31ArrayArrayArray1 = new Class2_Sub31[1][Static26.anInt552][Static232.anInt4787];
			Static157.anIntArrayArray27 = new int[Static26.anInt552][Static232.anInt4787];
			Static144.anIntArrayArrayArray5 = new int[1][Static26.anInt552 + 1][Static232.anInt4787 + 1];
			if (Static60.aBoolean106) {
				Static284.aClass2_Sub12ArrayArray3 = new Class2_Sub12[1][];
			}
		} else {
			Static102.aClass2_Sub31ArrayArrayArray1 = null;
			Static157.anIntArrayArray27 = null;
			Static144.anIntArrayArrayArray5 = null;
			Static284.aClass2_Sub12ArrayArray3 = null;
		}
		Static219.method3700(false);
		Static173.aClass58Array2 = new Class58[500];
		Static72.anInt1555 = 0;
		Static47.aClass58Array1 = new Class58[500];
		Static21.anInt518 = 0;
		Static253.anIntArrayArrayArray13 = new int[4][Static26.anInt552 + 1][Static232.anInt4787 + 1];
		Static292.aClass34Array3 = new Class34[5000];
		Static288.anInt5982 = 0;
		Static225.aClass34Array1 = new Class34[100];
		Static121.aBooleanArrayArray3 = new boolean[Static92.anInt2034 + Static92.anInt2034 + 1][Static92.anInt2034 + Static92.anInt2034 + 1];
		Static162.aBooleanArrayArray4 = new boolean[Static92.anInt2034 + Static92.anInt2034 + 2][Static92.anInt2034 + Static92.anInt2034 + 2];
		Static157.aByteArrayArrayArray10 = new byte[4][Static26.anInt552][Static232.anInt4787];
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(II)V")
	public static void method1916(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub18 local8 = (Class2_Sub18) Static50.aClass79_4.method2002((long) arg0);
		if (local8 != null) {
			for (@Pc(23) int local23 = 0; local23 < local8.anIntArray289.length; local23++) {
				local8.anIntArray289[local23] = -1;
				local8.anIntArray290[local23] = 0;
			}
		}
	}
}
