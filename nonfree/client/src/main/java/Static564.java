import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static564 {

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "[I")
	public static final int[] anIntArray596 = new int[1];

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_136 = new Class200(2, 3);

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
	public static int anInt9411 = 0;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[B)Lclient!jj;")
	public static Class3_Sub4_Sub14 method8102(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class3_Sub4_Sub14 local9 = new Class3_Sub4_Sub14();
		@Pc(14) Class3_Sub3 local14 = new Class3_Sub3(arg0);
		local14.anInt4736 = local14.aByteArray54.length - 2;
		@Pc(25) int local25 = local14.method4221();
		@Pc(33) int local33 = local14.aByteArray54.length - local25 - 14;
		local14.anInt4736 = local33;
		@Pc(40) int local40 = local14.method4207();
		local9.anInt4899 = local14.method4221();
		local9.anInt4901 = local14.method4221();
		local9.anInt4900 = local14.method4221();
		local9.anInt4898 = local14.method4221();
		@Pc(68) int local68 = local14.method4225();
		@Pc(84) int local84;
		@Pc(90) int local90;
		if (local68 > 0) {
			local9.aClass280Array1 = new Class280[local68];
			for (local84 = 0; local84 < local68; local84++) {
				local90 = local14.method4221();
				@Pc(97) Class280 local97 = new Class280(Static109.method2234(local90));
				local9.aClass280Array1[local84] = local97;
				while (local90-- > 0) {
					@Pc(110) int local110 = local14.method4207();
					@Pc(114) int local114 = local14.method4207();
					local97.method7109(new Class3_Sub19(local114), (long) local110);
				}
			}
		}
		local14.anInt4736 = 0;
		local9.aString57 = local14.method4256();
		local9.anIntArray259 = new int[local40];
		local9.aStringArray18 = new String[local40];
		local9.anIntArray260 = new int[local40];
		local84 = 0;
		while (local14.anInt4736 < local33) {
			local90 = local14.method4221();
			if (local90 == 3) {
				local9.aStringArray18[local84] = local14.method4233().intern();
			} else if (local90 >= 100 || local90 == 21 || local90 == 38 || local90 == 39) {
				local9.anIntArray259[local84] = local14.method4225();
			} else {
				local9.anIntArray259[local84] = local14.method4207();
			}
			local9.anIntArray260[local84++] = local90;
		}
		return local9;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!ru;)V")
	public static void method8103(@OriginalArg(0) Class301 arg0) {
		Static374.aClass301_3 = arg0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method8104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (!Static500.aBoolean598 || !Static378.aBoolean511) {
			return false;
		} else if (Static127.anInt2678 < 100) {
			return false;
		} else {
			@Pc(38) int local38;
			@Pc(42) int local42;
			if (arg2 != arg5 || arg4 != arg3) {
				for (local38 = arg2; local38 <= arg5; local38++) {
					for (local42 = arg3; local42 <= arg4; local42++) {
						if (Static403.anIntArrayArrayArray21[arg1][local38][local42] == -Static489.anInt8492) {
							return false;
						}
					}
				}
				local42 = (arg2 << Static308.anInt5834) + 1;
				@Pc(105) int local105 = (arg3 << Static308.anInt5834) + 2;
				if (Static34.method1254(Static364.aClass51Array3[arg1].method7835(arg2, arg3), local42, (arg5 + 1 - arg2) * Static384.anInt7200, (arg4 + 1 - arg3) * Static384.anInt7200, arg0, local105)) {
					Static343.anInt6701++;
					return true;
				} else {
					return false;
				}
			} else if (Static69.method1704(arg2, arg3, arg1)) {
				local38 = arg2 << Static308.anInt5834;
				local42 = arg3 << Static308.anInt5834;
				if (Static34.method1254(Static364.aClass51Array3[arg1].method7835(arg2, arg3), local38, Static384.anInt7200, Static384.anInt7200, arg0, local42)) {
					Static343.anInt6701++;
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}
}
