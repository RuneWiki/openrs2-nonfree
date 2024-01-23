import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!ie", name = "E", descriptor = "Lclient!cg;")
	public static Class22 aClass22_37;

	@OriginalMember(owner = "client!ie", name = "ab", descriptor = "Lclient!cg;")
	public static Class22 aClass22_38;

	@OriginalMember(owner = "client!ie", name = "Hb", descriptor = "Lclient!cg;")
	public static Class22 aClass22_39;

	@OriginalMember(owner = "client!ie", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString83 = "Ok";

	@OriginalMember(owner = "client!ie", name = "S", descriptor = "Lclient!ld;")
	public static Interface3 anInterface3_1 = null;

	@OriginalMember(owner = "client!ie", name = "ob", descriptor = "I")
	public static int anInt2263 = -1;

	@OriginalMember(owner = "client!ie", name = "vb", descriptor = "[Z")
	public static boolean[] aBooleanArray18 = new boolean[112];

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
	public static void method1890() {
		Static51.aClass172_10.method4346();
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(Z)I")
	public static int method1903() {
		try {
			if (Static176.anInt5566 == 0) {
				if (Static234.aLong160 > Static61.method1150() - 5000L) {
					return 0;
				}
				Static21.aClass119_1 = Static95.aClass184_3.method4611(Static109.anInt2179, Static68.aString68);
				Static139.aLong105 = Static61.method1150();
				Static176.anInt5566 = 1;
			}
			if (Static139.aLong105 + 30000L < Static61.method1150()) {
				return Static59.method1116(1000);
			}
			@Pc(85) int local85;
			@Pc(123) int local123;
			if (Static176.anInt5566 == 1) {
				if (Static21.aClass119_1.anInt3695 == 2) {
					return Static59.method1116(1001);
				}
				if (Static21.aClass119_1.anInt3695 != 1) {
					return -1;
				}
				Static261.aClass91_3 = new Class91((Socket) Static21.aClass119_1.anObject4, Static95.aClass184_3);
				Static175.aClass4_Sub24_Sub1_1.anInt3822 = 0;
				local85 = 0;
				Static21.aClass119_1 = null;
				if (Static223.aBoolean280) {
					local85 = Static106.anInt2113;
				}
				Static175.aClass4_Sub24_Sub1_1.method3116(23);
				Static175.aClass4_Sub24_Sub1_1.method3066(local85);
				Static261.aClass91_3.method2303(Static175.aClass4_Sub24_Sub1_1.anInt3822, Static175.aClass4_Sub24_Sub1_1.aByteArray47);
				if (Static100.aClass112_44 != null) {
					Static100.aClass112_44.method4464();
				}
				if (Static260.aClass112_115 != null) {
					Static260.aClass112_115.method4464();
				}
				local123 = Static261.aClass91_3.method2305();
				if (Static100.aClass112_44 != null) {
					Static100.aClass112_44.method4464();
				}
				if (Static260.aClass112_115 != null) {
					Static260.aClass112_115.method4464();
				}
				if (local123 != 0) {
					return Static59.method1116(local123);
				}
				Static176.anInt5566 = 2;
			}
			if (Static176.anInt5566 == 2) {
				if (Static261.aClass91_3.method2300() < 2) {
					return -1;
				}
				Static86.anInt1743 = Static261.aClass91_3.method2305();
				Static86.anInt1743 <<= 0x8;
				Static86.anInt1743 += Static261.aClass91_3.method2305();
				Static143.anInt2832 = 0;
				Static165.aByteArray43 = new byte[Static86.anInt1743];
				Static176.anInt5566 = 3;
			}
			if (Static176.anInt5566 != 3) {
				return -1;
			}
			local85 = Static261.aClass91_3.method2300();
			if (local85 < 1) {
				return -1;
			}
			if (local85 > Static86.anInt1743 - Static143.anInt2832) {
				local85 = Static86.anInt1743 - Static143.anInt2832;
			}
			Static261.aClass91_3.method2304(Static165.aByteArray43, Static143.anInt2832, local85);
			Static143.anInt2832 += local85;
			if (Static143.anInt2832 < Static86.anInt1743) {
				return -1;
			} else if (Static33.method646(Static165.aByteArray43)) {
				Static214.aClass64_Sub1Array3 = new Class64_Sub1[Static169.anInt3386];
				local123 = 0;
				for (@Pc(238) int local238 = Static179.anInt3614; local238 <= Static168.anInt3365; local238++) {
					@Pc(249) Class64_Sub1 local249 = Static272.method4322(local238);
					if (local249 != null) {
						Static214.aClass64_Sub1Array3[local123++] = local249;
					}
				}
				Static261.aClass91_3.method2302();
				Static261.aClass91_3 = null;
				Static165.aByteArray43 = null;
				Static176.anInt5566 = 0;
				Static197.anInt3945 = 0;
				Static234.aLong160 = Static61.method1150();
				return 0;
			} else {
				return Static59.method1116(1002);
			}
		} catch (@Pc(285) IOException local285) {
			return Static59.method1116(1003);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg5 - arg1;
		@Pc(20) int local20 = arg4 - arg1;
		@Pc(24) int local24 = arg4 * arg4;
		@Pc(28) int local28 = arg5 * arg5;
		@Pc(32) int local32 = local16 * local16;
		@Pc(41) int local41 = local20 * local20;
		@Pc(45) int local45 = local28 << 1;
		@Pc(49) int local49 = local41 << 1;
		@Pc(53) int local53 = local24 << 1;
		@Pc(57) int local57 = arg4 << 1;
		@Pc(61) int local61 = local32 << 1;
		@Pc(69) int local69 = local53 + local28 * (1 - local57);
		@Pc(73) int local73 = local20 << 1;
		@Pc(82) int local82 = local24 - (local57 - 1) * local45;
		@Pc(91) int local91 = local49 + (1 - local73) * local32;
		@Pc(95) int local95 = local28 << 2;
		@Pc(103) int local103 = local41 - local61 * (local73 - 1);
		@Pc(107) int local107 = local32 << 2;
		@Pc(111) int local111 = local41 << 2;
		@Pc(115) int local115 = local53 * 3;
		@Pc(119) int local119 = local24 << 2;
		@Pc(125) int local125 = (local57 - 3) * local45;
		@Pc(127) int local127 = local119;
		@Pc(133) int local133 = (local73 - 3) * local61;
		@Pc(137) int local137 = local49 * 3;
		@Pc(143) int local143 = (local20 - 1) * local107;
		@Pc(149) int local149 = (arg4 - 1) * local95;
		@Pc(151) int local151 = local111;
		@Pc(155) int[] local155 = Static253.anIntArrayArray34[arg0];
		Static190.method3151(arg2 - local16, local155, arg6, arg2 - arg5);
		Static190.method3151(arg2 + local16, local155, arg3, arg2 - local16);
		Static190.method3151(arg2 + arg5, local155, arg6, arg2 + local16);
		while (local9 > 0) {
			@Pc(204) boolean local204 = local9 <= local20;
			if (local69 < 0) {
				while (local69 < 0) {
					local69 += local115;
					local82 += local127;
					local127 += local119;
					local7++;
					local115 += local119;
				}
			}
			local9--;
			@Pc(237) int local237 = arg0 - local9;
			if (local204) {
				if (local91 < 0) {
					while (local91 < 0) {
						local91 += local137;
						local11++;
						local103 += local151;
						local151 += local111;
						local137 += local111;
					}
				}
				if (local103 < 0) {
					local103 += local151;
					local91 += local137;
					local11++;
					local137 += local111;
					local151 += local111;
				}
				local91 += -local143;
				local103 += -local133;
				local143 -= local107;
				local133 -= local107;
			}
			if (local82 < 0) {
				local82 += local127;
				local127 += local119;
				local7++;
				local69 += local115;
				local115 += local119;
			}
			@Pc(335) int local335 = arg0 + local9;
			local82 += -local125;
			local69 += -local149;
			local125 -= local95;
			@Pc(353) int local353 = local7 + arg2;
			local149 -= local95;
			@Pc(362) int local362 = arg2 - local7;
			if (local204) {
				@Pc(369) int local369 = arg2 + local11;
				@Pc(374) int local374 = arg2 - local11;
				Static190.method3151(local374, Static253.anIntArrayArray34[local237], arg6, local362);
				Static190.method3151(local369, Static253.anIntArrayArray34[local237], arg3, local374);
				Static190.method3151(local353, Static253.anIntArrayArray34[local237], arg6, local369);
				Static190.method3151(local374, Static253.anIntArrayArray34[local335], arg6, local362);
				Static190.method3151(local369, Static253.anIntArrayArray34[local335], arg3, local374);
				Static190.method3151(local353, Static253.anIntArrayArray34[local335], arg6, local369);
			} else {
				Static190.method3151(local353, Static253.anIntArrayArray34[local237], arg6, local362);
				Static190.method3151(local353, Static253.anIntArrayArray34[local335], arg6, local362);
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method1907(@OriginalArg(0) String arg0) {
		return Static118.method1996(arg0, 10);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!lg;B)Lclient!lg;")
	public static Class97 method1908(@OriginalArg(0) Class97 arg0) {
		@Pc(12) Class97 local12 = Static41.method792(arg0);
		if (local12 == null) {
			local12 = arg0.aClass97_14;
		}
		return local12;
	}
}
