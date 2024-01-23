import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
	public static int anInt1738;

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
	public static int anInt1742;

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
	public static int anInt1743;

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "Lclient!he;")
	public static Class44 aClass44_17 = new Class44();

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "Lclient!qe;")
	public static Class78 aClass78_392 = Static199.method3560("(U3");

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
	public static int anInt1744 = 0;

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	public static void method1346() {
		if (Static220.aClass40_3 != null) {
			Static220.aClass40_3.method3710();
		}
		if (Static53.aClass40_2 != null) {
			Static53.aClass40_2.method3710();
		}
		Static1.method2(Static40.aBoolean27);
		Static220.aClass40_3 = Static184.method3395(Static79.aCanvas2, Static133.aClass41_2, 22050, 0);
		Static220.aClass40_3.method3708(Static129.aClass2_Sub21_Sub2_3);
		Static53.aClass40_2 = Static184.method3395(Static79.aCanvas2, Static133.aClass41_2, 2048, 1);
		Static53.aClass40_2.method3708(Static23.aClass2_Sub21_Sub3_1);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method1347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class2_Sub12 local7 = Static226.aClass2_Sub12ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass27_1 != null && local7.aClass27_1.aLong30 == arg3) {
			return true;
		} else if (local7.aClass104_1 != null && local7.aClass104_1.aLong175 == arg3) {
			return true;
		} else if (local7.aClass106_1 != null && local7.aClass106_1.aLong176 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt775; local46++) {
				if (local7.aClass100Array3[local46].aLong169 == arg3) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZIIII)V")
	public static void method1348(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 - arg0 >= Static6.anInt187 && arg0 + arg2 <= Static101.anInt2213 && Static73.anInt1576 <= arg1 - arg0 && arg1 + arg0 <= Static137.anInt3137) {
			Static205.method541(arg1, arg2, arg3, arg0);
		} else {
			Static134.method2443(arg2, arg0, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
	public static void method1349() {
		@Pc(13) int local13 = Static143.aByteArrayArray9.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			if (Static143.aByteArrayArray9[local15] != null) {
				@Pc(23) int local23 = -1;
				for (@Pc(25) int local25 = 0; local25 < Static195.anInt4462; local25++) {
					if (Static87.anIntArray346[local25] == Static171.anIntArray653[local15]) {
						local23 = local25;
						break;
					}
				}
				if (local23 == -1) {
					Static87.anIntArray346[Static195.anInt4462] = Static171.anIntArray653[local15];
					local23 = Static195.anInt4462++;
				}
				@Pc(69) Class2_Sub23 local69 = new Class2_Sub23(Static143.aByteArrayArray9[local15]);
				@Pc(71) int local71 = 0;
				while (Static143.aByteArrayArray9[local15].length > local69.anInt2703 && local71 < 511) {
					@Pc(85) int local85 = local71++ << 6 | local23;
					@Pc(93) int local93 = local69.method2095();
					@Pc(99) int local99 = local93 >> 7 & 0x3F;
					@Pc(103) int local103 = local93 & 0x3F;
					@Pc(116) int local116 = local99 + (Static171.anIntArray653[local15] >> 8) * 64 - Static28.anInt497;
					@Pc(120) int local120 = local93 >> 14;
					@Pc(133) int local133 = local103 + (Static171.anIntArray653[local15] & 0xFF) * 64 - Static57.anInt628;
					@Pc(143) Class2_Sub3_Sub9 local143 = Static35.method432(local69.method2095());
					if (Static95.aClass5_Sub2_Sub1Array1[local85] == null && (local143.aByte8 & 0x1) > 0 && local120 == Static150.anInt3435 && local116 >= 0 && local116 + local143.anInt1284 < 104 && local133 >= 0 && local133 + local143.anInt1284 < 104) {
						Static95.aClass5_Sub2_Sub1Array1[local85] = new Class5_Sub2_Sub1();
						@Pc(192) Class5_Sub2_Sub1 local192 = Static95.aClass5_Sub2_Sub1Array1[local85];
						Static79.anIntArray286[Static50.anInt908++] = local85;
						local192.anInt1826 = Static123.anInt2808;
						local192.aClass2_Sub3_Sub9_1 = local143;
						local192.anInt1847 = local192.aClass2_Sub3_Sub9_1.anInt1297;
						local192.anInt1879 = local192.aClass2_Sub3_Sub9_1.anInt1268;
						local192.anInt1840 = local192.aClass2_Sub3_Sub9_1.anInt1270;
						local192.anInt1855 = local192.aClass2_Sub3_Sub9_1.anInt1266;
						local192.anInt1851 = local192.aClass2_Sub3_Sub9_1.anInt1281;
						local192.anInt1863 = local192.aClass2_Sub3_Sub9_1.anInt1287;
						local192.anInt1866 = local192.aClass2_Sub3_Sub9_1.anInt1283;
						local192.anInt1832 = local192.aClass2_Sub3_Sub9_1.anInt1284;
						local192.anInt1880 = local192.aClass2_Sub3_Sub9_1.anInt1289;
						if (local192.anInt1840 == 0) {
							local192.anInt1853 = 0;
						}
						local192.method1483(local116, local133, true);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)V")
	public static void method1351() {
		try {
			if (Static9.anInt274 == 1) {
				@Pc(12) int local12 = Static39.aClass2_Sub21_Sub2_1.method2793();
				if (local12 > 0 && Static39.aClass2_Sub21_Sub2_1.method2773()) {
					local12 -= Static170.anInt3939;
					if (local12 < 0) {
						local12 = 0;
					}
					Static39.aClass2_Sub21_Sub2_1.method2797(local12);
					return;
				}
				Static39.aClass2_Sub21_Sub2_1.method2800();
				Static39.aClass2_Sub21_Sub2_1.method2778();
				Static209.aClass2_Sub6_2 = null;
				if (Static41.aClass72_52 == null) {
					Static9.anInt274 = 0;
				} else {
					Static9.anInt274 = 2;
				}
				Static87.aClass46_1 = null;
			}
		} catch (@Pc(62) Exception local62) {
			local62.printStackTrace();
			Static39.aClass2_Sub21_Sub2_1.method2800();
			Static87.aClass46_1 = null;
			Static9.anInt274 = 0;
			Static209.aClass2_Sub6_2 = null;
			Static41.aClass72_52 = null;
		}
	}
}
