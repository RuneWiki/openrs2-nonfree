import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "[I")
	public static int[] anIntArray155;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "Lclient!a;")
	public static Class1 aClass1_1489 = Static94.method1596("Freund hinzuf-Ugen");

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "[I")
	public static int[] anIntArray156 = new int[2048];

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "[Lclient!u;")
	public static Class8_Sub1[] aClass8_Sub1Array1 = new Class8_Sub1[256];

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "[I")
	public static int[] anIntArray157 = new int[4000];

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "[I")
	public static int[] anIntArray158 = new int[] { 0, 15, 6, 8, 0, 0, 1, 0, 0, 5, 0, 0, -2, 0, 0, 0, 0, 0, 1, 7, 0, 0, 0, -2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 1, 4, 0, -1, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 0, -2, 2, 0, 0, 0, 0, 0, 1, -1, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, -1, 0, 4, 0, 0, 0, 1, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 5, 2, 8, 2, 0, 8, 0, 0, 0, 0, 0, 0, 0, -2, 3, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 10, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 6, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 2, 0, 0, 4, 5, 0, 0, 0, 0, 0, 0, 6, 0, 0, 2, 6, 0, 0, 0, 0, 0, 0, 0, 6, 4, 3, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 2, 0, 4, -2, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 3, -1, 0, 0, 0, 0, 0, 14, 0, 6, 0, 0, 6, 1, 0, 2, 0, 0, -2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 6, 2, 4 };

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!bd;II)[Lclient!e;")
	public static Class2_Sub1_Sub2_Sub2[] method1020(@OriginalArg(1) Class8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static87.method1560(arg1, arg2, arg0) ? Static104.method1087() : null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZII)I")
	public static int method1021(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
	public static void method1022() {
		anIntArray155 = null;
		anIntArray158 = null;
		anIntArray156 = null;
		aClass8_Sub1Array1 = null;
		anIntArray157 = null;
		aClass1_1489 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)Z")
	public static boolean method1023() {
		return Static8.aClass14_1 != null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!ab;IIII[BI[Lclient!ad;II)V")
	public static void method1024(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class5[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class2_Sub3 local10 = new Class2_Sub3(arg5);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method825();
			if (local16 == 0) {
				return;
			}
			@Pc(23) int local23 = 0;
			local12 += local16;
			while (true) {
				@Pc(31) int local31 = local10.method825();
				if (local31 == 0) {
					break;
				}
				local23 += local31 - 1;
				@Pc(46) int local46 = local23 >> 12;
				@Pc(52) int local52 = local23 >> 6 & 0x3F;
				@Pc(56) int local56 = local10.method791();
				@Pc(60) int local60 = local56 >> 2;
				@Pc(64) int local64 = local23 & 0x3F;
				@Pc(68) int local68 = local56 & 0x3;
				if (local46 == arg4 && arg0 <= local52 && local52 < arg0 + 8 && arg8 <= local64 && arg8 + 8 > local64) {
					@Pc(107) Class2_Sub1_Sub10 local107 = Static28.method739(local12);
					@Pc(126) int local126 = Static17.method502(local68, local107.anInt1481, local52 & 0x7, local107.anInt1491, arg3, local64 & 0x7) + arg9;
					@Pc(143) int local143 = Static30.method774(local64 & 0x7, local107.anInt1491, local52 & 0x7, local107.anInt1481, arg3, local68) + arg6;
					if (local126 > 0 && local143 > 0 && local126 < 103 && local143 < 103) {
						@Pc(161) Class5 local161 = null;
						@Pc(163) int local163 = arg2;
						if ((Static29.aByteArrayArrayArray2[1][local126][local143] & 0x2) == 2) {
							local163 = arg2 - 1;
						}
						if (local163 >= 0) {
							local161 = arg7[local163];
						}
						Static18.method528(local68 + arg3 & 0x3, local161, local126, arg1, local60, local12, local143, arg2);
					}
				}
			}
		}
	}
}
