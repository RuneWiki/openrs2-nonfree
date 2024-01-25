import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!ph", name = "O", descriptor = "I")
	public static int anInt6305 = 0;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIII)Lclient!bda;")
	public static Class15_Sub1_Sub2_Sub2 method5121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(17) Class56 local17 = Static405.aClass56ArrayArrayArray2[arg0][arg2][arg1];
		if (local17 == null) {
			return null;
		}
		@Pc(23) Class15_Sub1_Sub2_Sub2 local23 = null;
		@Pc(25) int local25 = -1;
		for (@Pc(28) Class152 local28 = local17.aClass152_2; local28 != null; local28 = local28.aClass152_3) {
			@Pc(32) Class15_Sub1_Sub2 local32 = local28.aClass15_Sub1_Sub2_1;
			if (local32 instanceof Class15_Sub1_Sub2_Sub2) {
				@Pc(38) Class15_Sub1_Sub2_Sub2 local38 = (Class15_Sub1_Sub2_Sub2) local32;
				@Pc(48) int local48 = (local38.method6692() - 1) * 256 + 252;
				@Pc(56) int local56 = local38.anInt10301 - local48 >> 9;
				@Pc(63) int local63 = local38.anInt10298 - local48 >> 9;
				@Pc(70) int local70 = local38.anInt10301 + local48 >> 9;
				@Pc(77) int local77 = local48 + local38.anInt10298 >> 9;
				if (arg2 >= local56 && arg1 >= local63 && arg2 <= local70 && local77 >= arg1) {
					@Pc(111) int local111 = (local70 + 1 - arg2) * (-arg1 + local77 + 1);
					if (local111 > local25) {
						local23 = local38;
						local25 = local111;
					}
				}
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIILclient!oh;BIZ)V")
	public static void method5122(@OriginalArg(2) int arg0, @OriginalArg(3) Class237 arg1, @OriginalArg(5) int arg2) {
		Static10.aClass8_Sub16_Sub1_1 = null;
		Static642.aBoolean763 = false;
		Static227.anInt5183 = arg0;
		Static570.anInt9813 = 1;
		Static532.anInt9177 = arg2;
		Static542.anInt9401 = 2;
		Static68.aClass237_22 = arg1;
		Static7.anInt6404 = 0;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)V")
	public static void method5123(@OriginalArg(0) int arg0) {
		@Pc(8) Class8_Sub5_Sub8 local8 = Static509.method7344(17, arg0);
		local8.method3512();
	}
}
