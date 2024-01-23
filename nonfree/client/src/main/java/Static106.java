import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!hm", name = "R", descriptor = "I")
	public static int anInt2378;

	@OriginalMember(owner = "client!hm", name = "S", descriptor = "Lclient!th;")
	public static Class168 aClass168_81;

	@OriginalMember(owner = "client!hm", name = "X", descriptor = "[I")
	public static int[] anIntArray236;

	@OriginalMember(owner = "client!hm", name = "gb", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!hm", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString138 = "glow1:";

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "(I)V")
	public static void method1763() {
		Static240.aClass89_37.method2265();
		Static263.aClass89_42.method2265();
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IBI)I")
	public static int method1765(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg0 >> 31 & arg1 - 1;
		return ((arg0 >>> 31) + arg0) % arg1 + local11;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(BZ)I")
	public static int method1766(@OriginalArg(1) boolean arg0) {
		@Pc(8) long local8 = Static258.method3967();
		for (@Pc(27) Class1_Sub15 local27 = arg0 ? (Class1_Sub15) Static37.aClass186_4.method4567() : (Class1_Sub15) Static37.aClass186_4.method4579(); local27 != null; local27 = (Class1_Sub15) Static37.aClass186_4.method4579()) {
			if ((local27.aLong99 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local27.aLong99 & 0x4000000000000000L) != 0L) {
					@Pc(50) int local50 = (int) local27.aLong247;
					Static296.anIntArray530[local50] = Static90.anIntArray207[local50];
					local27.method4767();
					return local50;
				}
				local27.method4767();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIII)V")
	public static void method1769(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = arg2 * (arg2 - 32) / arg4;
		if (local15 < 8) {
			local15 = 8;
		}
		Static104.aClass46Array2[0].method3523(arg1, arg3);
		@Pc(44) int local44 = (arg2 - local15 - 32) * arg0 / (arg4 - arg2);
		Static104.aClass46Array2[1].method3523(arg1, arg2 + arg3 - 16);
		if (!Static294.aBoolean367) {
			Static231.method3630(arg1, arg3 + 16, 16, arg2 - 32, Static62.anInt1345);
			Static231.method3630(arg1, local44 + arg3 + 16, 16, local15, Static248.anInt5064);
			Static231.method3646(arg1, local44 + arg3 + 16, local15, Static189.anInt4169);
			Static231.method3646(arg1 + 1, arg3 + (16 - -local44), local15, Static189.anInt4169);
			Static231.method3636(arg1, arg3 + local44 + 16, 16, Static189.anInt4169);
			Static231.method3636(arg1, local44 + arg3 + 17, 16, Static189.anInt4169);
			Static231.method3646(arg1 + 15, arg3 + 16 - -local44, local15, Static76.anInt1761);
			Static231.method3646(arg1 + 14, arg3 - -17 - -local44, local15 - 1, Static76.anInt1761);
			Static231.method3636(arg1, local44 + arg3 + local15 + 15, 16, Static76.anInt1761);
			Static231.method3636(arg1 + 1, arg3 - -14 - (-local44 - local15), 15, Static76.anInt1761);
			return;
		}
		Static156.method2537(arg1, arg3 + 16, 16, arg2 - 32, Static62.anInt1345);
		Static156.method2537(arg1, local44 + arg3 + 16, 16, local15, Static248.anInt5064);
		Static156.method2532(arg1, arg3 + local44 + 16, local15, Static189.anInt4169);
		Static156.method2532(arg1 + 1, local44 + 16 + arg3, local15, Static189.anInt4169);
		Static156.method2531(arg1, arg3 + local44 + 16, 16, Static189.anInt4169);
		Static156.method2531(arg1, arg3 + local44 + 17, 16, Static189.anInt4169);
		Static156.method2532(arg1 + 15, local44 + 16 + arg3, local15, Static76.anInt1761);
		Static156.method2532(arg1 + 14, local44 + 17 + arg3, local15 - 1, Static76.anInt1761);
		Static156.method2531(arg1, arg3 + local44 + local15 + 15, 16, Static76.anInt1761);
		Static156.method2531(arg1 + 1, local15 + local44 + arg3 + 14, 15, Static76.anInt1761);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIII)Lclient!hb;")
	public static Class1_Sub12 method1770(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class1_Sub12 local5 = new Class1_Sub12();
		local5.anInt2207 = arg1;
		local5.anInt2208 = arg0;
		Static48.aClass186_5.method4575((long) arg2, local5);
		Static211.method3377(arg0);
		@Pc(30) Class191 local30 = Static171.method2789(arg2);
		if (local30 != null) {
			Static40.method817(local30);
		}
		if (Static290.aClass191_16 != null) {
			Static40.method817(Static290.aClass191_16);
			Static290.aClass191_16 = null;
		}
		@Pc(47) int local47 = Static181.anInt3973;
		@Pc(49) int local49;
		for (local49 = 0; local49 < local47; local49++) {
			if (Static316.method4772(Static86.aShortArray64[local49])) {
				Static117.method3399(local49);
			}
		}
		if (Static181.anInt3973 == 1) {
			Static128.aBoolean171 = false;
			Static155.method2520(Static96.anInt2211, Static303.anInt6021, Static60.anInt1307, Static175.anInt266);
		} else {
			Static155.method2520(Static96.anInt2211, Static303.anInt6021, Static60.anInt1307, Static175.anInt266);
			local49 = Static176.aClass1_Sub3_Sub5_2.method3510(Static8.aString19);
			for (@Pc(85) int local85 = 0; local85 < Static181.anInt3973; local85++) {
				@Pc(98) int local98 = Static176.aClass1_Sub3_Sub5_2.method3510(Static56.method1051(local85));
				if (local49 < local98) {
					local49 = local98;
				}
			}
			Static175.anInt266 = Static181.anInt3973 * 15 + (Static161.aBoolean230 ? 26 : 22);
			Static60.anInt1307 = local49 + 8;
		}
		if (local30 != null) {
			Static99.method1655(local30, false);
		}
		Static23.method502(arg0);
		if (Static36.anInt902 != -1) {
			Static82.method1413(Static36.anInt902, 1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(BI)I")
	public static int method1772(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local23;
		@Pc(34) double local34 = local23;
		if (local14 > local23) {
			local34 = local14;
		}
		@Pc(42) double local42 = 0.0D;
		if (local23 > local14) {
			local32 = local14;
		}
		if (local30 > local34) {
			local34 = local30;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(64) double local64 = 0.0D;
		@Pc(70) double local70 = (local32 + local34) / 2.0D;
		if (local34 != local32) {
			if (local70 < 0.5D) {
				local64 = (local34 - local32) / (local34 + local32);
			}
			if (local70 >= 0.5D) {
				local64 = (local34 - local32) / (2.0D - local34 - local32);
			}
			if (local23 == local34) {
				local42 = (local14 - local30) / (local34 - local32);
			} else if (local14 == local34) {
				local42 = (local30 - local23) / (-local32 + local34) + 2.0D;
			} else if (local30 == local34) {
				local42 = (local23 - local14) / (-local32 + local34) + 4.0D;
			}
		}
		local42 /= 6.0D;
		@Pc(161) int local161 = (int) (local70 * 256.0D);
		@Pc(166) int local166 = (int) (local42 * 256.0D);
		if (local161 < 0) {
			local161 = 0;
		} else if (local161 > 255) {
			local161 = 255;
		}
		@Pc(183) int local183 = (int) (local64 * 256.0D);
		if (local183 < 0) {
			local183 = 0;
		} else if (local183 > 255) {
			local183 = 255;
		}
		if (local161 > 243) {
			local183 >>= 0x4;
		} else if (local161 > 217) {
			local183 >>= 0x3;
		} else if (local161 > 192) {
			local183 >>= 0x2;
		} else if (local161 > 179) {
			local183 >>= 0x1;
		}
		return (local183 >> 5 << 7) + (local166 >> 2 << 10) + (local161 >> 1);
	}
}
