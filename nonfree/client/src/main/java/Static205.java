import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "Lclient!wd;")
	public static Class111 aClass111_8;

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "Lclient!qe;")
	public static Class78 aClass78_139 = Static199.method3560("; Max)2Age=");

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "Z")
	public static volatile boolean aBoolean25 = true;

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
	public static int anInt740 = 0;

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "[I")
	public static int[] anIntArray123 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "Lclient!wc;")
	public static Class110 aClass110_5 = new Class110(20);

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "Lclient!qe;")
	public static Class78 aClass78_140 = Static199.method3560("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIII)V")
	public static void method541(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static221.method3893(arg2, arg1 - arg3, Static183.anIntArrayArray40[arg0], arg3 + arg1);
		@Pc(16) int local16 = 0;
		@Pc(28) int local28 = arg3;
		@Pc(31) int local31 = -arg3;
		@Pc(33) int local33 = -1;
		while (local28 > local16) {
			local16++;
			local33 += 2;
			local31 += local33;
			if (local31 >= 0) {
				local28--;
				@Pc(53) int[] local53 = Static183.anIntArrayArray40[local28 + arg0];
				@Pc(57) int local57 = local16 + arg1;
				@Pc(63) int[] local63 = Static183.anIntArrayArray40[arg0 - local28];
				@Pc(68) int local68 = arg1 - local16;
				local31 -= local28 << 1;
				Static221.method3893(arg2, local68, local53, local57);
				Static221.method3893(arg2, local68, local63, local57);
			}
			@Pc(90) int local90 = local28 + arg1;
			@Pc(95) int local95 = arg1 - local28;
			@Pc(101) int[] local101 = Static183.anIntArrayArray40[local16 + arg0];
			@Pc(108) int[] local108 = Static183.anIntArrayArray40[arg0 - local16];
			Static221.method3893(arg2, local95, local101, local90);
			Static221.method3893(arg2, local95, local108, local90);
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIII)V")
	public static void method543(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static137.anInt3137 < arg2 || arg0 < Static73.anInt1576) {
			return;
		}
		@Pc(36) boolean local36;
		if (Static6.anInt187 > arg4) {
			local36 = false;
			arg4 = Static6.anInt187;
		} else if (Static101.anInt2213 < arg4) {
			local36 = false;
			arg4 = Static101.anInt2213;
		} else {
			local36 = true;
		}
		@Pc(53) boolean local53;
		if (Static6.anInt187 > arg1) {
			local53 = false;
			arg1 = Static6.anInt187;
		} else if (arg1 > Static101.anInt2213) {
			arg1 = Static101.anInt2213;
			local53 = false;
		} else {
			local53 = true;
		}
		if (arg2 < Static73.anInt1576) {
			arg2 = Static73.anInt1576;
		} else {
			Static221.method3893(arg3, arg4, Static183.anIntArrayArray40[arg2++], arg1);
		}
		if (Static137.anInt3137 < arg0) {
			arg0 = Static137.anInt3137;
		} else {
			Static221.method3893(arg3, arg4, Static183.anIntArrayArray40[arg0--], arg1);
		}
		@Pc(116) int local116;
		if (local36 && local53) {
			for (local116 = arg2; local116 <= arg0; local116++) {
				@Pc(158) int[] local158 = Static183.anIntArrayArray40[local116];
				local158[arg4] = local158[arg1] = arg3;
			}
			return;
		}
		if (local36) {
			for (local116 = arg2; local116 <= arg0; local116++) {
				Static183.anIntArrayArray40[local116][arg4] = arg3;
			}
			return;
		}
		if (local53) {
			for (local116 = arg2; local116 <= arg0; local116++) {
				Static183.anIntArrayArray40[local116][arg1] = arg3;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(IIIIII)V")
	public static void method544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = arg3 - arg1;
		@Pc(12) int local12 = arg4 - arg0;
		if (local12 == 0) {
			if (local7 != 0) {
				Static121.method3983(arg1, arg2, arg3, arg0);
			}
		} else if (local7 == 0) {
			Static160.method2881(arg1, arg0, arg4, arg2);
		} else {
			if (local7 < 0) {
				local7 = -local7;
			}
			if (local12 < 0) {
				local12 = -local12;
			}
			@Pc(50) boolean local50 = local12 < local7;
			@Pc(54) int local54;
			@Pc(60) int local60;
			if (local50) {
				local54 = arg0;
				arg0 = arg1;
				arg1 = local54;
				local60 = arg4;
				arg4 = arg3;
				arg3 = local60;
			}
			if (arg4 < arg0) {
				local54 = arg0;
				arg0 = arg4;
				local60 = arg1;
				arg1 = arg3;
				arg4 = local54;
				arg3 = local60;
			}
			@Pc(87) int local87 = arg3 - arg1;
			if (local87 < 0) {
				local87 = -local87;
			}
			local60 = arg4 - arg0;
			@Pc(104) int local104 = -(local60 >> 1);
			local54 = arg1;
			@Pc(113) int local113 = arg1 >= arg3 ? -1 : 1;
			@Pc(117) int local117;
			if (local50) {
				for (local117 = arg0; local117 <= arg4; local117++) {
					local104 += local87;
					Static183.anIntArrayArray40[local117][local54] = arg2;
					if (local104 > 0) {
						local104 -= local60;
						local54 += local113;
					}
				}
			} else {
				for (local117 = arg0; local117 <= arg4; local117++) {
					local104 += local87;
					Static183.anIntArrayArray40[local54][local117] = arg2;
					if (local104 > 0) {
						local54 += local113;
						local104 -= local60;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!og;B)V")
	public static void method547(@OriginalArg(0) Class5_Sub2 arg0) {
		if (arg0.anInt1840 == 0) {
			return;
		}
		@Pc(39) int local39;
		@Pc(46) int local46;
		if (arg0.anInt1841 != -1 && arg0.anInt1841 < 32768) {
			@Pc(30) Class5_Sub2_Sub1 local30 = Static95.aClass5_Sub2_Sub1Array1[arg0.anInt1841];
			if (local30 != null) {
				local39 = arg0.anInt1849 - local30.anInt1849;
				local46 = arg0.anInt1827 - local30.anInt1827;
				if (local39 != 0 || local46 != 0) {
					arg0.anInt1852 = (int) (Math.atan2((double) local39, (double) local46) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(71) int local71;
		if (arg0.anInt1841 >= 32768) {
			local71 = arg0.anInt1841 - 32768;
			if (Static195.anInt4463 == local71) {
				local71 = 2047;
			}
			@Pc(80) Class5_Sub2_Sub2 local80 = Static213.aClass5_Sub2_Sub2Array3[local71];
			if (local80 != null) {
				local46 = arg0.anInt1849 - local80.anInt1849;
				@Pc(95) int local95 = arg0.anInt1827 - local80.anInt1827;
				if (local46 != 0 || local95 != 0) {
					arg0.anInt1852 = (int) (Math.atan2((double) local46, (double) local95) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt1865 != 0 || arg0.anInt1836 != 0) && (arg0.anInt1881 == 0 || arg0.anInt1833 > 0)) {
			local71 = arg0.anInt1849 + (arg0.anInt1832 - 1) * 64 - (-Static28.anInt497 + -Static28.anInt497 + arg0.anInt1865) * 64;
			local39 = arg0.anInt1827 + arg0.anInt1832 * 64 - (arg0.anInt1836 - Static57.anInt628 - Static57.anInt628) * 64 - 64;
			if (local71 != 0 || local39 != 0) {
				arg0.anInt1852 = (int) (Math.atan2((double) local71, (double) local39) * 325.949D) & 0x7FF;
			}
			arg0.anInt1865 = 0;
			arg0.anInt1836 = 0;
		}
		local71 = arg0.anInt1852 - arg0.anInt1853 & 0x7FF;
		if (local71 == 0) {
			arg0.anInt1825 = 0;
			return;
		}
		arg0.anInt1825++;
		@Pc(243) boolean local243;
		if (local71 <= 1024) {
			arg0.anInt1853 += arg0.anInt1840;
			local243 = true;
			if (arg0.anInt1840 > local71 || 2048 - arg0.anInt1840 < local71) {
				arg0.anInt1853 = arg0.anInt1852;
				local243 = false;
			}
			if (arg0.anInt1878 == arg0.anInt1879 && (arg0.anInt1825 > 25 || local243)) {
				if (arg0.anInt1847 == -1) {
					arg0.anInt1878 = arg0.anInt1880;
				} else {
					arg0.anInt1878 = arg0.anInt1847;
				}
			}
		} else {
			local243 = true;
			arg0.anInt1853 -= arg0.anInt1840;
			if (arg0.anInt1840 > local71 || local71 > 2048 - arg0.anInt1840) {
				arg0.anInt1853 = arg0.anInt1852;
				local243 = false;
			}
			if (arg0.anInt1879 == arg0.anInt1878 && (arg0.anInt1825 > 25 || local243)) {
				if (arg0.anInt1866 == -1) {
					arg0.anInt1878 = arg0.anInt1880;
				} else {
					arg0.anInt1878 = arg0.anInt1866;
				}
			}
		}
		arg0.anInt1853 &= 0x7FF;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)Lclient!gd;")
	public static Class2_Sub3_Sub8 method549() {
		@Pc(7) int local7 = Static131.anIntArray489[0] * Static113.anIntArray423[0];
		@Pc(11) byte[] local11 = Static31.aByteArrayArray3[0];
		@Pc(14) int[] local14 = new int[local7];
		for (@Pc(16) int local16 = 0; local16 < local7; local16++) {
			local14[local16] = Static198.anIntArray725[local11[local16] & 0xFF];
		}
		@Pc(58) Class2_Sub3_Sub8_Sub1 local58 = new Class2_Sub3_Sub8_Sub1(Static142.anInt3236, Static100.anInt2184, Static186.anIntArray702[0], Static37.anIntArray108[0], Static113.anIntArray423[0], Static131.anIntArray489[0], local14);
		Static28.method365();
		return local58;
	}
}
