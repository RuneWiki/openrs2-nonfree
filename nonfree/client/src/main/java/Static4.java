import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
	public static int anInt9359;

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "Lclient!em;")
	public static final Class83 aClass83_202 = new Class83(99, 10);

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_108 = new Class208(26, 3);

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "[I")
	public static final int[] anIntArray591 = new int[5];

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "Lclient!em;")
	public static final Class83 aClass83_203 = new Class83(45, -1);

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method7627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!Static204.aBoolean276) {
			return false;
		} else if (Static397.anInt7106 < 100) {
			return false;
		} else {
			@Pc(34) int local34;
			@Pc(38) int local38;
			if (arg5 != arg2 || arg4 != arg3) {
				for (local34 = arg2; local34 <= arg5; local34++) {
					for (local38 = arg3; local38 <= arg4; local38++) {
						if (-Static239.anInt4403 == Static262.anIntArrayArrayArray14[arg1][local34][local38]) {
							return false;
						}
					}
				}
				local38 = (arg2 << Static166.anInt7796) + 1;
				@Pc(105) int local105 = (arg3 << Static166.anInt7796) + 2;
				if (Static396.method1621(Static165.anInt3157 * (arg5 + 1 - arg2), Static310.aClass129Array5[arg1].method6481(arg3, arg2), local38, Static165.anInt3157 * (arg4 + 1 - arg3), arg0, local105)) {
					Static509.anInt8820++;
					return true;
				} else {
					return false;
				}
			} else if (Static120.method2175(arg3, arg1, arg2)) {
				local34 = arg2 << Static166.anInt7796;
				local38 = arg3 << Static166.anInt7796;
				if (Static396.method1621(Static165.anInt3157, Static310.aClass129Array5[arg1].method6481(arg3, arg2), local34, Static165.anInt3157, arg0, local38)) {
					Static509.anInt8820++;
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZI)I")
	public static int method7629(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(65) double local65 = 0.0D;
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local32 + local46) / 2.0D;
		if (local46 != local32) {
			if (local73 < 0.5D) {
				local67 = (local46 - local32) / (local46 + local32);
			}
			if (local73 >= 0.5D) {
				local67 = (local46 - local32) / (2.0D - local32 - local46);
			}
			if (local46 == local14) {
				local65 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local65 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local65 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
		}
		local65 /= 6.0D;
		@Pc(162) int local162 = (int) (local65 * 256.0D);
		@Pc(167) int local167 = (int) (local67 * 256.0D);
		if (local167 < 0) {
			local167 = 0;
		} else if (local167 > 255) {
			local167 = 255;
		}
		@Pc(186) int local186 = (int) (local73 * 256.0D);
		if (local186 < 0) {
			local186 = 0;
		} else if (local186 > 255) {
			local186 = 255;
		}
		if (local186 > 243) {
			local167 >>= 0x4;
		} else if (local186 > 217) {
			local167 >>= 0x3;
		} else if (local186 > 192) {
			local167 >>= 0x2;
		} else if (local186 > 179) {
			local167 >>= 0x1;
		}
		return (local186 >> 1) + (((local162 >> 2 & 0x3F) << 10) + (local167 >> 5 << 7));
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
	public static void method7630() {
		Static482.method6676();
		for (@Pc(16) int local16 = 0; local16 < 4; local16++) {
			Static590.aClass240Array1[local16].method5260();
		}
		Static339.method5062();
		Static412.method5871();
		System.gc();
		Static31.aClass78_18.ya();
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)V")
	public static void method7631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub8_Sub9 local8 = Static465.method6470(arg0, 1);
		local8.method4833();
		local8.anInt5968 = arg1;
	}
}
