import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "Lclient!nf;")
	public static Class69_Sub1 aClass69_Sub1_99;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_856 = Static81.method1507("flash2:");

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_855 = aClass24_856;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
	public static volatile int anInt2833 = 0;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "Lclient!dj;")
	public static Class24 aClass24_857 = aClass24_856;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "Lclient!dj;")
	public static Class24 aClass24_858 = null;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIII)V")
	public static void method2156(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static177.method3022(Static13.anInt308, arg0, Static52.anInt1338);
		@Pc(17) int local17 = Static177.method3022(Static13.anInt308, arg1, Static52.anInt1338);
		@Pc(23) int local23 = Static177.method3022(Static63.anInt1608, arg2, Static63.anInt1595);
		@Pc(29) int local29 = Static177.method3022(Static63.anInt1608, arg5, Static63.anInt1595);
		@Pc(38) int local38 = Static177.method3022(Static13.anInt308, arg0 + arg3, Static52.anInt1338);
		@Pc(47) int local47 = Static177.method3022(Static13.anInt308, arg1 - arg3, Static52.anInt1338);
		for (@Pc(55) int local55 = local11; local55 < local38; local55++) {
			Static39.method731(Static98.anIntArrayArray16[local55], local23, local29, arg4);
		}
		for (@Pc(71) int local71 = local17; local71 > local47; local71--) {
			Static39.method731(Static98.anIntArrayArray16[local71], local23, local29, arg4);
		}
		@Pc(95) int local95 = Static177.method3022(Static63.anInt1608, arg3 + arg2, Static63.anInt1595);
		@Pc(103) int local103 = Static177.method3022(Static63.anInt1608, arg5 - arg3, Static63.anInt1595);
		for (@Pc(105) int local105 = local38; local105 <= local47; local105++) {
			@Pc(111) int[] local111 = Static98.anIntArrayArray16[local105];
			Static39.method731(local111, local23, local95, arg4);
			Static39.method731(local111, local103, local29, arg4);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)I")
	public static int method2157(@OriginalArg(0) int arg0) {
		@Pc(8) double local8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(29) double local29 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(36) double local36 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(38) double local38 = local8;
		@Pc(40) double local40 = local8;
		if (local29 > local8) {
			local38 = local29;
		}
		if (local38 < local36) {
			local38 = local36;
		}
		@Pc(54) double local54 = 0.0D;
		if (local8 > local29) {
			local40 = local29;
		}
		if (local40 > local36) {
			local40 = local36;
		}
		@Pc(68) double local68 = 0.0D;
		@Pc(74) double local74 = (local40 + local38) / 2.0D;
		if (local40 != local38) {
			if (local74 < 0.5D) {
				local68 = (local38 - local40) / (local38 + local40);
			}
			if (local74 >= 0.5D) {
				local68 = (local38 - local40) / ((2.0D - local38) - local40);
			}
			if (local8 == local38) {
				local54 = (local29 - local36) / (-local40 + local38);
			} else if (local38 == local29) {
				local54 = (local36 - local8) / (-local40 + local38) + 2.0D;
			} else if (local38 == local36) {
				local54 = (local8 - local29) / (-local40 + local38) + 4.0D;
			}
		}
		@Pc(159) int local159 = (int) (local68 * 256.0D);
		if (local159 < 0) {
			local159 = 0;
		} else if (local159 > 255) {
			local159 = 255;
		}
		@Pc(179) int local179 = (int) (local74 * 256.0D);
		if (local179 < 0) {
			local179 = 0;
		} else if (local179 > 255) {
			local179 = 255;
		}
		if (local179 > 243) {
			local159 >>= 0x4;
		} else if (local179 > 217) {
			local159 >>= 0x3;
		} else if (local179 > 192) {
			local159 >>= 0x2;
		} else if (local179 > 179) {
			local159 >>= 0x1;
		}
		local54 /= 6.0D;
		@Pc(237) int local237 = (int) (local54 * 256.0D);
		return (local179 >> 1) + (local159 >> 5 << 7) + (local237 >> 2 << 10);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!dj;I)Z")
	public static boolean method2158(@OriginalArg(0) Class24 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(9) int local9 = 0; local9 < Static105.anInt2367; local9++) {
			if (arg0.method771(Static152.aClass24Array22[local9])) {
				return true;
			}
		}
		return arg0.method771(Static87.aClass5_Sub2_Sub1_1.aClass24_173);
	}
}
