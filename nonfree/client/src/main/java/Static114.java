import java.util.Calendar;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!ki", name = "R", descriptor = "[I")
	public static int[] anIntArray434;

	@OriginalMember(owner = "client!ki", name = "fb", descriptor = "I")
	public static int anInt2555;

	@OriginalMember(owner = "client!ki", name = "jb", descriptor = "I")
	public static int anInt2558;

	@OriginalMember(owner = "client!ki", name = "Q", descriptor = "I")
	public static int anInt2545 = 0;

	@OriginalMember(owner = "client!ki", name = "U", descriptor = "Lclient!he;")
	public static Class44 aClass44_27 = new Class44();

	@OriginalMember(owner = "client!ki", name = "Y", descriptor = "Lclient!nativeadvert/browsercontrol;")
	public static browsercontrol aBrowsercontrol1 = null;

	@OriginalMember(owner = "client!ki", name = "bb", descriptor = "[I")
	public static int[] anIntArray435 = new int[1000];

	@OriginalMember(owner = "client!ki", name = "eb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_533 = Static199.method3560("hint_mapmarkers");

	@OriginalMember(owner = "client!ki", name = "hb", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!ki", name = "ib", descriptor = "I")
	public static int anInt2557 = 128;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!og;)V")
	public static void method1981(@OriginalArg(1) Class5_Sub2 arg0) {
		arg0.aBoolean71 = false;
		@Pc(18) Class2_Sub3_Sub3 local18;
		if (arg0.anInt1878 != -1) {
			local18 = Static187.method3447(arg0.anInt1878);
			if (local18 == null || local18.anIntArray76 == null) {
				arg0.anInt1878 = -1;
			} else {
				arg0.anInt1862++;
				if (arg0.anInt1830 < local18.anIntArray76.length && arg0.anInt1862 > local18.anIntArray77[arg0.anInt1830]) {
					arg0.anInt1862 = 1;
					arg0.anInt1830++;
					Static118.method2181(Static31.aClass5_Sub2_Sub2_1 == arg0, arg0.anInt1830, arg0.anInt1849, arg0.anInt1827, local18);
				}
				if (local18.anIntArray76.length <= arg0.anInt1830) {
					arg0.anInt1830 = 0;
					arg0.anInt1862 = 0;
					Static118.method2181(arg0 == Static31.aClass5_Sub2_Sub2_1, arg0.anInt1830, arg0.anInt1849, arg0.anInt1827, local18);
				}
			}
		}
		if (arg0.anInt1857 != -1 && Static123.anInt2808 >= arg0.anInt1819) {
			if (arg0.anInt1843 < 0) {
				arg0.anInt1843 = 0;
			}
			@Pc(132) int local132 = Static19.method266(arg0.anInt1857).anInt4361;
			if (local132 == -1) {
				arg0.anInt1857 = -1;
			} else {
				@Pc(140) Class2_Sub3_Sub3 local140 = Static187.method3447(local132);
				if (local140 == null || local140.anIntArray76 == null) {
					arg0.anInt1857 = -1;
				} else {
					arg0.anInt1874++;
					if (arg0.anInt1843 < local140.anIntArray76.length && local140.anIntArray77[arg0.anInt1843] < arg0.anInt1874) {
						arg0.anInt1843++;
						arg0.anInt1874 = 1;
						Static118.method2181(arg0 == Static31.aClass5_Sub2_Sub2_1, arg0.anInt1843, arg0.anInt1849, arg0.anInt1827, local140);
					}
					if (arg0.anInt1843 >= local140.anIntArray76.length) {
						arg0.anInt1857 = -1;
					}
				}
			}
		}
		if (arg0.anInt1873 != -1 && arg0.anInt1831 <= 1) {
			local18 = Static187.method3447(arg0.anInt1873);
			if (local18.anInt450 == 1 && arg0.anInt1876 > 0 && arg0.anInt1871 <= Static123.anInt2808 && Static123.anInt2808 > arg0.anInt1867) {
				arg0.anInt1831 = 1;
				return;
			}
		}
		if (arg0.anInt1873 != -1 && arg0.anInt1831 == 0) {
			local18 = Static187.method3447(arg0.anInt1873);
			if (local18 == null || local18.anIntArray76 == null) {
				arg0.anInt1873 = -1;
			} else {
				arg0.anInt1835++;
				if (local18.anIntArray76.length > arg0.anInt1848 && local18.anIntArray77[arg0.anInt1848] < arg0.anInt1835) {
					arg0.anInt1835 = 1;
					arg0.anInt1848++;
					Static118.method2181(Static31.aClass5_Sub2_Sub2_1 == arg0, arg0.anInt1848, arg0.anInt1849, arg0.anInt1827, local18);
				}
				if (local18.anIntArray76.length <= arg0.anInt1848) {
					arg0.anInt1829++;
					arg0.anInt1848 -= local18.anInt448;
					if (local18.anInt443 <= arg0.anInt1829) {
						arg0.anInt1873 = -1;
					} else if (arg0.anInt1848 >= 0 && arg0.anInt1848 < local18.anIntArray76.length) {
						Static118.method2181(arg0 == Static31.aClass5_Sub2_Sub2_1, arg0.anInt1848, arg0.anInt1849, arg0.anInt1827, local18);
					} else {
						arg0.anInt1873 = -1;
					}
				}
				arg0.aBoolean71 = local18.aBoolean16;
			}
		}
		if (arg0.anInt1831 > 0) {
			arg0.anInt1831--;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZB)V")
	public static void method1982() {
		Static169.anIntArray647 = new int[104];
		Static145.anInt3289 = 99;
		Static193.anIntArray712 = new int[104];
		Static9.anIntArray33 = new int[104];
		Static55.anIntArray154 = new int[104];
		Static220.aByteArrayArrayArray15 = new byte[4][105][105];
		Static12.aByteArrayArrayArray1 = new byte[4][104][104];
		Static224.anIntArrayArrayArray14 = new int[4][105][105];
		Static170.aByteArrayArrayArray13 = new byte[4][104][104];
		Static126.aByteArrayArrayArray7 = new byte[4][104][104];
		Static128.aByteArrayArrayArray8 = new byte[4][104][104];
		Static226.anIntArray794 = new int[104];
	}

	@OriginalMember(owner = "client!ki", name = "i", descriptor = "(I)V")
	public static void method1983() {
		for (@Pc(11) int local11 = 0; local11 < Static125.anInt1641; local11++) {
			@Pc(17) int local17 = Static156.anIntArray598[local11];
			@Pc(21) Class5_Sub2_Sub2 local21 = Static213.aClass5_Sub2_Sub2Array3[local17];
			@Pc(25) int local25 = Static139.aClass2_Sub23_Sub1_4.method2122();
			if ((local25 & 0x4) != 0) {
				local25 += Static139.aClass2_Sub23_Sub1_4.method2122() << 8;
			}
			Static7.method151(local21, local17, local25);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIII[[[B[I[I[I[I[IIBII)V")
	public static void method1984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[][][] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) byte arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static173.anInt3981 * 128) {
			arg0 = Static173.anInt3981 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static159.anInt4174 * 128) {
			arg2 = Static159.anInt4174 * 128 - 1;
		}
		Static224.anInt4840 = Class77.anIntArray631[arg3];
		Static72.anInt4675 = Class77.anIntArray632[arg3];
		Static132.anInt3060 = Class77.anIntArray631[arg4];
		Static160.anInt3702 = Class77.anIntArray632[arg4];
		Static181.anInt4199 = arg0;
		Static53.anInt1723 = arg1;
		Static59.anInt1039 = arg2;
		Static179.anInt4190 = arg0 / 128;
		Static11.anInt312 = arg2 / 128;
		Static182.anInt4232 = arg5;
		Static66.anInt1312 = Static179.anInt4190 - Static125.anInt1642;
		if (Static66.anInt1312 < 0) {
			Static66.anInt1312 = 0;
		}
		Static190.anInt4422 = Static11.anInt312 - Static125.anInt1642;
		if (Static190.anInt4422 < 0) {
			Static190.anInt4422 = 0;
		}
		Static96.anInt2119 = Static179.anInt4190 + Static125.anInt1642;
		if (Static96.anInt2119 > Static173.anInt3981) {
			Static96.anInt2119 = Static173.anInt3981;
		}
		Static100.anInt2197 = Static11.anInt312 + Static125.anInt1642;
		if (Static100.anInt2197 > Static159.anInt4174) {
			Static100.anInt2197 = Static159.anInt4174;
		}
		@Pc(104) int local104;
		@Pc(115) int local115;
		for (@Pc(101) int local101 = 0; local101 < Static125.anInt1642 + Static125.anInt1642 + 2; local101++) {
			for (local104 = 0; local104 < Static125.anInt1642 + Static125.anInt1642 + 2; local104++) {
				local115 = (local101 - Static125.anInt1642 << 7) - (Static181.anInt4199 & 0x7F);
				@Pc(125) int local125 = (local104 - Static125.anInt1642 << 7) - (Static59.anInt1039 & 0x7F);
				@Pc(131) int local131 = Static179.anInt4190 + local101 - Static125.anInt1642;
				@Pc(137) int local137 = Static11.anInt312 + local104 - Static125.anInt1642;
				if (local131 >= 0 && local137 >= 0 && local131 < Static173.anInt3981 && local137 < Static159.anInt4174) {
					@Pc(161) int local161;
					if (Static100.anIntArrayArrayArray5 == null) {
						local161 = Static11.anIntArrayArrayArray1[0][local131][local137] + 128 - Static53.anInt1723;
					} else {
						local161 = Static100.anIntArrayArrayArray5[0][local131][local137] + 128 - Static53.anInt1723;
					}
					@Pc(186) int local186 = Static11.anIntArrayArrayArray1[3][local131][local137] - Static53.anInt1723 - 1000;
					Static14.aBooleanArrayArray4[local101][local104] = Static41.method566(local115, local186, local161, local125);
				} else {
					Static14.aBooleanArrayArray4[local101][local104] = false;
				}
			}
		}
		for (local104 = 0; local104 < Static125.anInt1642 + Static125.anInt1642 + 1; local104++) {
			for (local115 = 0; local115 < Static125.anInt1642 + Static125.anInt1642 + 1; local115++) {
				Static17.aBooleanArrayArray2[local104][local115] = Static14.aBooleanArrayArray4[local104][local115] || Static14.aBooleanArrayArray4[local104 + 1][local115] || Static14.aBooleanArrayArray4[local104][local115 + 1] || Static14.aBooleanArrayArray4[local104 + 1][local115 + 1];
			}
		}
		Static176.anIntArray667 = arg7;
		Static154.anIntArray577 = arg8;
		Static93.anIntArray364 = arg9;
		Static121.anIntArray795 = arg10;
		Static51.anIntArray146 = arg11;
		Static203.method3590();
		Static193.method3530(arg0, arg1, arg2, arg6, arg12, arg13, arg14, arg15);
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(B)V")
	public static void method1985() {
		Static161.aClass2_Sub23_Sub1_5.method2155(235);
		Static161.aClass2_Sub23_Sub1_5.method2103(0L);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!qe;I)V")
	public static void method1988(@OriginalArg(0) Class78 arg0) {
		@Pc(8) Class2_Sub27 local8 = Static112.method1914(arg0);
		if (local8 == null) {
			return;
		}
		Static22.anInt416 = local8.anInt4762 - Static221.anInt4795;
		@Pc(30) int local30 = Static22.anInt416 + (int) ((double) Static118.aClass64_8.anInt3021 / Static174.aDouble11);
		@Pc(40) int local40 = Static22.anInt416 - (int) ((double) Static118.aClass64_8.anInt3021 / Static174.aDouble11);
		if (local40 < 0) {
			Static22.anInt416 = (int) ((double) Static118.aClass64_8.anInt3021 / Static174.aDouble11);
		}
		if (local30 > Static151.anInt3457) {
			Static22.anInt416 = Static151.anInt3457 - (int) ((double) Static118.aClass64_8.anInt3021 / Static174.aDouble11);
		}
		Static4.anInt123 = Static45.anInt815 + Static30.anInt547 - local8.anInt4761;
		@Pc(85) int local85 = Static4.anInt123 - (int) ((double) Static118.aClass64_8.anInt3040 / Static174.aDouble11);
		@Pc(94) int local94 = Static4.anInt123 + (int) ((double) Static118.aClass64_8.anInt3040 / Static174.aDouble11);
		if (local85 < 0) {
			Static4.anInt123 = (int) ((double) Static118.aClass64_8.anInt3040 / Static174.aDouble11);
		}
		if (Static30.anInt547 < local94) {
			Static4.anInt123 = Static30.anInt547 - (int) ((double) Static118.aClass64_8.anInt3040 / Static174.aDouble11);
		}
	}
}
