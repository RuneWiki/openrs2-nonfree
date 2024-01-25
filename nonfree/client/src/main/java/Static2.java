import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
	public static int anInt30 = 0;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray1 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIII)V")
	public static void method27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) Class1_Sub43 local8 = (Class1_Sub43) Static305.aClass14_33.method302(); local8 != null; local8 = (Class1_Sub43) Static305.aClass14_33.method313()) {
			Static94.method1468(arg2, arg3, arg0, arg1, local8);
		}
		for (@Pc(35) Class1_Sub43 local35 = (Class1_Sub43) Static337.aClass14_36.method302(); local35 != null; local35 = (Class1_Sub43) Static337.aClass14_36.method313()) {
			@Pc(39) byte local39 = 1;
			@Pc(44) Class118 local44 = local35.aClass10_Sub1_Sub2_Sub1_1.method3408();
			if (local35.aClass10_Sub1_Sub2_Sub1_1.aBoolean307) {
				local39 = 0;
			} else if (local44.anInt2967 == local35.aClass10_Sub1_Sub2_Sub1_1.anInt4034 || local44.anInt2970 == local35.aClass10_Sub1_Sub2_Sub1_1.anInt4034 || local44.anInt2969 == local35.aClass10_Sub1_Sub2_Sub1_1.anInt4034 || local44.anInt2968 == local35.aClass10_Sub1_Sub2_Sub1_1.anInt4034) {
				local39 = 2;
			} else if (local44.anInt2974 == local35.aClass10_Sub1_Sub2_Sub1_1.anInt4034 || local35.aClass10_Sub1_Sub2_Sub1_1.anInt4034 == local44.anInt2984 || local44.anInt2991 == local35.aClass10_Sub1_Sub2_Sub1_1.anInt4034 || local44.anInt2957 == local35.aClass10_Sub1_Sub2_Sub1_1.anInt4034) {
				local39 = 3;
			}
			if (local39 != local35.anInt6224) {
				@Pc(137) int local137 = Static37.method782(local35.aClass10_Sub1_Sub2_Sub1_1);
				if (local137 != local35.anInt6222) {
					if (local35.aClass1_Sub31_Sub1_3 != null) {
						Static142.aClass1_Sub31_Sub2_1.method4444(local35.aClass1_Sub31_Sub1_3);
						local35.aClass1_Sub31_Sub1_3 = null;
					}
					local35.anInt6222 = local137;
				}
				local35.anInt6224 = local39;
			}
			local35.anInt6217 = local35.aClass10_Sub1_Sub2_Sub1_1.anInt6728;
			local35.anInt6221 = local35.aClass10_Sub1_Sub2_Sub1_1.anInt6728 + local35.aClass10_Sub1_Sub2_Sub1_1.method3402() * 64;
			local35.anInt6234 = local35.aClass10_Sub1_Sub2_Sub1_1.anInt6726;
			local35.anInt6229 = local35.aClass10_Sub1_Sub2_Sub1_1.anInt6726 + local35.aClass10_Sub1_Sub2_Sub1_1.method3402() * 64;
			Static94.method1468(arg2, arg3, arg0, arg1, local35);
		}
		for (@Pc(215) Class1_Sub43 local215 = (Class1_Sub43) Static102.aClass207_13.method5560(); local215 != null; local215 = (Class1_Sub43) Static102.aClass207_13.method5559()) {
			@Pc(219) byte local219 = 1;
			@Pc(224) Class118 local224 = local215.aClass10_Sub1_Sub2_Sub2_2.method3408();
			if (local215.aClass10_Sub1_Sub2_Sub2_2.aBoolean307) {
				local219 = 0;
			} else if (local224.anInt2967 == local215.aClass10_Sub1_Sub2_Sub2_2.anInt4034 || local224.anInt2970 == local215.aClass10_Sub1_Sub2_Sub2_2.anInt4034 || local215.aClass10_Sub1_Sub2_Sub2_2.anInt4034 == local224.anInt2969 || local215.aClass10_Sub1_Sub2_Sub2_2.anInt4034 == local224.anInt2968) {
				local219 = 2;
			} else if (local215.aClass10_Sub1_Sub2_Sub2_2.anInt4034 == local224.anInt2974 || local215.aClass10_Sub1_Sub2_Sub2_2.anInt4034 == local224.anInt2984 || local215.aClass10_Sub1_Sub2_Sub2_2.anInt4034 == local224.anInt2991 || local224.anInt2957 == local215.aClass10_Sub1_Sub2_Sub2_2.anInt4034) {
				local219 = 3;
			}
			if (local219 != local215.anInt6224) {
				@Pc(307) int local307 = Static94.method1470(local215.aClass10_Sub1_Sub2_Sub2_2);
				if (local215.anInt6222 != local307) {
					if (local215.aClass1_Sub31_Sub1_3 != null) {
						Static142.aClass1_Sub31_Sub2_1.method4444(local215.aClass1_Sub31_Sub1_3);
						local215.aClass1_Sub31_Sub1_3 = null;
					}
					local215.anInt6222 = local307;
				}
				local215.anInt6224 = local219;
			}
			local215.anInt6217 = local215.aClass10_Sub1_Sub2_Sub2_2.anInt6728;
			local215.anInt6221 = local215.aClass10_Sub1_Sub2_Sub2_2.anInt6728 + local215.aClass10_Sub1_Sub2_Sub2_2.method3402() * 64;
			local215.anInt6234 = local215.aClass10_Sub1_Sub2_Sub2_2.anInt6726;
			local215.anInt6229 = local215.aClass10_Sub1_Sub2_Sub2_2.anInt6726 + local215.aClass10_Sub1_Sub2_Sub2_2.method3402() * 64;
			Static94.method1468(arg2, arg3, arg0, arg1, local215);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Lclient!ln;")
	public static Class1_Sub2_Sub8 method29() {
		return Static150.aClass1_Sub2_Sub8_2;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)I")
	public static int method30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static345.anIntArrayArray60 == null ? 0 : Static345.anIntArrayArray60[arg0][arg1] & 0xFFFFFF;
	}
}
