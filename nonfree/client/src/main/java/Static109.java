import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!jc", name = "B", descriptor = "Lclient!hc;")
	public static Class51 aClass51_35;

	@OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
	public static int anInt2900;

	@OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
	public static int anInt2904;

	@OriginalMember(owner = "client!jc", name = "N", descriptor = "Lclient!hc;")
	public static Class51 aClass51_36;

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
	public static int anInt2895 = 0;

	@OriginalMember(owner = "client!jc", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString185 = " is already on your ignore list.";

	@OriginalMember(owner = "client!jc", name = "w", descriptor = "Z")
	public static boolean aBoolean156 = true;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)Lclient!ke;")
	public static Class1_Sub2_Sub4 method2226() {
		@Pc(9) byte[] local9 = Static11.aByteArrayArray1[0];
		@Pc(17) int local17 = Static233.anIntArray438[0] * Static218.anIntArray382[0];
		@Pc(20) int[] local20 = new int[local17];
		for (@Pc(28) int local28 = 0; local28 < local17; local28++) {
			local20[local28] = Static102.anIntArray201[local9[local28] & 0xFF];
		}
		@Pc(63) Class1_Sub2_Sub4_Sub1 local63 = new Class1_Sub2_Sub4_Sub1(Static24.anInt806, Static240.anInt5164, Static202.anIntArray345[0], Static79.anIntArray165[0], Static218.anIntArray382[0], Static233.anIntArray438[0], local20);
		Static259.method4155();
		return local63;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(IIIIII)V")
	public static void method2229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = arg0;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = local13 << 1;
		@Pc(21) int local21 = arg0 << 1;
		@Pc(25) int local25 = arg0 * arg0;
		@Pc(29) int local29 = local25 << 1;
		@Pc(38) int local38 = local29 + (1 - local21) * local13;
		@Pc(42) int local42 = local25 << 2;
		@Pc(46) int local46 = local13 << 2;
		@Pc(54) int local54 = local29 * 3;
		@Pc(62) int local62 = ((arg0 << 1) - 3) * local17;
		@Pc(71) int local71 = local25 - local17 * (local21 - 1);
		@Pc(77) int local77 = local46 * (arg0 - 1);
		@Pc(83) int local83 = local42;
		@Pc(105) int local105;
		@Pc(114) int local114;
		if (arg4 >= Static202.anInt4469 && arg4 <= Static94.anInt4237) {
			local105 = Static3.method36(Static167.anInt3907, arg2 + arg3, Static150.anInt3860);
			local114 = Static3.method36(Static167.anInt3907, arg3 - arg2, Static150.anInt3860);
			Static147.method2681(Static29.anIntArrayArray10[arg4], arg1, local114, local105);
		}
		while (local5 > 0) {
			local5--;
			local105 = arg4 - local5;
			if (local38 < 0) {
				while (local38 < 0) {
					local3++;
					local71 += local83;
					local38 += local54;
					local83 += local42;
					local54 += local42;
				}
			}
			local114 = local5 + arg4;
			if (local71 < 0) {
				local71 += local83;
				local38 += local54;
				local3++;
				local83 += local42;
				local54 += local42;
			}
			if (local114 >= Static202.anInt4469 && Static94.anInt4237 >= local105) {
				@Pc(201) int local201 = Static3.method36(Static167.anInt3907, arg3 + local3, Static150.anInt3860);
				@Pc(209) int local209 = Static3.method36(Static167.anInt3907, arg3 - local3, Static150.anInt3860);
				if (local105 >= Static202.anInt4469) {
					Static147.method2681(Static29.anIntArrayArray10[local105], arg1, local209, local201);
				}
				if (local114 <= Static94.anInt4237) {
					Static147.method2681(Static29.anIntArrayArray10[local114], arg1, local209, local201);
				}
			}
			local38 += -local77;
			local71 += -local62;
			local62 -= local46;
			local77 -= local46;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(JI)V")
	public static void method2231(@OriginalArg(0) long arg0) {
		Static171.aClass1_Sub13_Sub1_3.anInt2395 = 0;
		Static171.aClass1_Sub13_Sub1_3.method1766(21);
		Static171.aClass1_Sub13_Sub1_3.method1770(arg0);
		Static170.anInt3979 = 0;
		Static52.anInt1463 = 0;
		Static117.anInt3043 = 1;
		Static243.anInt5242 = -3;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 1 || arg2 < 1 || arg1 > 102 || arg2 > 102) {
			return;
		}
		@Pc(34) int local34;
		if (!Static25.method507() && (Static145.aByteArrayArrayArray13[0][arg1][arg2] & 0x2) == 0) {
			local34 = arg3;
			if ((Static145.aByteArrayArrayArray13[arg3][arg1][arg2] & 0x8) != 0) {
				local34 = 0;
			}
			if (Static171.anInt3993 != local34) {
				return;
			}
		}
		local34 = arg3;
		if (arg3 < 3 && (Static145.aByteArrayArrayArray13[1][arg1][arg2] & 0x2) == 2) {
			local34 = arg3 + 1;
		}
		Static169.method2943(arg0, Static47.aClass65Array1[arg3], local34, arg1, arg3, arg2);
		if (arg5 >= 0) {
			@Pc(86) boolean local86 = Static249.aBoolean270;
			Static249.aBoolean270 = true;
			Static24.method482(false, Static47.aClass65Array1[arg3], arg2, arg3, arg4, arg1, local34, arg6, arg5);
			Static249.aBoolean270 = local86;
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V")
	public static void method2233(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub2_Sub18 local8 = Static13.method232(arg0, 7);
		local8.method3810();
		local8.anInt5009 = arg1;
	}
}
