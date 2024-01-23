import java.security.MessageDigest;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!af", name = "K", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!af", name = "t", descriptor = "I")
	public static int anInt214 = -1;

	@OriginalMember(owner = "client!af", name = "z", descriptor = "[[S")
	public static short[][] aShortArrayArray7 = new short[][] { { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 119, 92, 66, 39, 20, 4, 955, 1845, 4032, 7101, 10178, 14272, 17341, 21433, 27581, 30651, -31811, -27717, -24640, -21581, -17603, -13383, 794, 5020, 7062, 1160, 15128, 17940, 30614, -30952, -26728, -23662, -18536, -14440, -9324, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 955, 1845, 4032, 7101, 10178, 14272, 17341, 21433, 27581, 30651, -31811, -27717, -24640, -21581, -17603, -13383, 794, 5020, 7062, 1160, 15128, 17940, 30614, -30952, -26728, -23662, -18536, -14440, -9324, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 955, 1845, 4032, 7101, 10178, 14272, 17341, 21433, 27581, 30651, -31811, -27717, -24640, -21581, -17603, -13383, 794, 5020, 7062, 1160, 15128, 17940, 30614, -30952, -26728, -23662, -18536, -14440, -9324, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 22461, -21571, 11200, 957, -10317, 5056, -31808, 123, 22453, -21579, 11191, 949, -10325, 4023, -31817, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866 } };

	@OriginalMember(owner = "client!af", name = "Q", descriptor = "[[I")
	public static int[][] anIntArrayArray5 = new int[5][5000];

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIILclient!qf;JZ)V")
	public static void method150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class106 local6 = new Class106();
		local6.aClass5_11 = arg4;
		local6.anInt4668 = arg1 * 128 + 64;
		local6.anInt4669 = arg2 * 128 + 64;
		local6.anInt4670 = arg3;
		local6.aLong176 = arg5;
		if (Static226.aClass2_Sub12ArrayArrayArray3[arg0][arg1][arg2] == null) {
			Static226.aClass2_Sub12ArrayArrayArray3[arg0][arg1][arg2] = new Class2_Sub12(arg0, arg1, arg2);
		}
		Static226.aClass2_Sub12ArrayArrayArray3[arg0][arg1][arg2].aClass106_1 = local6;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!hh;II)V")
	public static void method151(@OriginalArg(1) Class5_Sub2_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		if ((arg2 & 0x100) != 0) {
			local11 = Static139.aClass2_Sub23_Sub1_4.method2107();
			local15 = Static139.aClass2_Sub23_Sub1_4.method2122();
			arg0.method1484(local15, local11, Static123.anInt2808);
		}
		if ((arg2 & 0x40) != 0) {
			arg0.aClass78_422 = Static139.aClass2_Sub23_Sub1_4.method2115();
			if (arg0.aClass78_422.method3042(0) == 126) {
				arg0.aClass78_422 = arg0.aClass78_422.method3052(1);
				Static95.method1663(arg0.aClass78_423, arg0.aClass78_422, 2);
			} else if (Static31.aClass5_Sub2_Sub2_1 == arg0) {
				Static95.method1663(arg0.aClass78_423, arg0.aClass78_422, 2);
			}
			arg0.anInt1845 = 150;
			arg0.anInt1834 = 0;
			arg0.anInt1872 = 0;
		}
		if ((arg2 & 0x20) != 0) {
			local11 = Static139.aClass2_Sub23_Sub1_4.method2095();
			local15 = Static139.aClass2_Sub23_Sub1_4.method2126();
			if (local11 == 65535) {
				local11 = -1;
			}
			Static74.method1233(arg0, local15, local11);
		}
		if ((arg2 & 0x400) != 0) {
			arg0.anInt1828 = Static139.aClass2_Sub23_Sub1_4.method2107();
			arg0.anInt1868 = Static139.aClass2_Sub23_Sub1_4.method2122();
			arg0.anInt1837 = Static139.aClass2_Sub23_Sub1_4.method2122();
			arg0.anInt1860 = Static139.aClass2_Sub23_Sub1_4.method2142();
			arg0.anInt1871 = Static139.aClass2_Sub23_Sub1_4.method2130() + Static123.anInt2808;
			arg0.anInt1867 = Static139.aClass2_Sub23_Sub1_4.method2095() + Static123.anInt2808;
			arg0.anInt1839 = Static139.aClass2_Sub23_Sub1_4.method2126();
			arg0.anInt1876 = 0;
			arg0.anInt1881 = 1;
		}
		if ((arg2 & 0x10) != 0) {
			arg0.anInt1865 = Static139.aClass2_Sub23_Sub1_4.method2130();
			arg0.anInt1836 = Static139.aClass2_Sub23_Sub1_4.method2095();
		}
		if ((arg2 & 0x1) != 0) {
			local11 = Static139.aClass2_Sub23_Sub1_4.method2095();
			local15 = Static139.aClass2_Sub23_Sub1_4.method2126();
			@Pc(184) int local184 = Static139.aClass2_Sub23_Sub1_4.method2107();
			@Pc(187) int local187 = Static139.aClass2_Sub23_Sub1_4.anInt2703;
			@Pc(198) boolean local198 = (local11 & 0x8000) != 0;
			if (arg0.aClass78_423 != null && arg0.aClass112_1 != null) {
				@Pc(209) long local209 = arg0.aClass78_423.method3016();
				@Pc(211) boolean local211 = false;
				if (local15 <= 1) {
					if (!local198 && (Static214.anInt4672 == 1 || Static143.anInt3257 == 1)) {
						local211 = true;
					} else {
						for (@Pc(228) int local228 = 0; local228 < Static72.anInt4686; local228++) {
							if (local209 == Static100.aLongArray6[local228]) {
								local211 = true;
								break;
							}
						}
					}
				}
				if (!local211 && Static132.anInt3014 == 0) {
					Static67.aClass2_Sub23_3.anInt2703 = 0;
					@Pc(256) int local256 = -1;
					Static139.aClass2_Sub23_Sub1_4.method2118(local184, Static67.aClass2_Sub23_3.aByteArray41);
					Static67.aClass2_Sub23_3.anInt2703 = 0;
					@Pc(285) Class78 local285;
					if (local198) {
						local11 &= 0x7FFF;
						@Pc(276) Class55 local276 = Static112.method1915(Static67.aClass2_Sub23_3);
						local256 = local276.anInt2309;
						local285 = local276.aClass2_Sub3_Sub25_1.method2920(Static67.aClass2_Sub23_3);
					} else {
						local285 = Static135.method894(Static82.method1363(Static67.aClass2_Sub23_3).method3035());
					}
					arg0.aClass78_422 = local285.method3018();
					arg0.anInt1845 = 150;
					arg0.anInt1872 = local11 >> 8;
					arg0.anInt1834 = local11 & 0xFF;
					if (local15 == 2) {
						Static188.method3489(Static94.method1640(new Class78[] { Static8.aClass78_27, arg0.aClass78_423 }), null, local198 ? 17 : 1, local256, local285);
					} else if (local15 == 1) {
						Static188.method3489(Static94.method1640(new Class78[] { Static43.aClass78_147, arg0.aClass78_423 }), null, local198 ? 17 : 1, local256, local285);
					} else {
						Static188.method3489(arg0.aClass78_423, null, local198 ? 17 : 2, local256, local285);
					}
				}
			}
			Static139.aClass2_Sub23_Sub1_4.anInt2703 = local187 + local184;
		}
		if ((arg2 & 0x80) != 0) {
			local11 = Static139.aClass2_Sub23_Sub1_4.method2122();
			local15 = Static139.aClass2_Sub23_Sub1_4.method2142();
			arg0.method1484(local15, local11, Static123.anInt2808);
			arg0.anInt1850 = Static123.anInt2808 + 300;
			arg0.anInt1858 = Static139.aClass2_Sub23_Sub1_4.method2122();
		}
		if ((arg2 & 0x200) != 0) {
			arg0.anInt1857 = Static139.aClass2_Sub23_Sub1_4.method2130();
			local11 = Static139.aClass2_Sub23_Sub1_4.method2131();
			arg0.anInt1819 = (local11 & 0xFFFF) + Static123.anInt2808;
			arg0.anInt1843 = 0;
			arg0.anInt1874 = 0;
			if (Static123.anInt2808 < arg0.anInt1819) {
				arg0.anInt1843 = -1;
			}
			arg0.anInt1875 = local11 >> 16;
			if (arg0.anInt1857 == 65535) {
				arg0.anInt1857 = -1;
			}
		}
		if ((arg2 & 0x2) != 0) {
			arg0.anInt1841 = Static139.aClass2_Sub23_Sub1_4.method2136();
			if (arg0.anInt1841 == 65535) {
				arg0.anInt1841 = -1;
			}
		}
		if ((arg2 & 0x8) == 0) {
			return;
		}
		local11 = Static139.aClass2_Sub23_Sub1_4.method2142();
		@Pc(508) byte[] local508 = new byte[local11];
		@Pc(513) Class2_Sub23 local513 = new Class2_Sub23(local508);
		Static139.aClass2_Sub23_Sub1_4.method2100(local508, local11);
		Static95.aClass2_Sub23Array1[arg1] = local513;
		arg0.method1496(local513);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!qe;)Z")
	public static boolean method152(@OriginalArg(1) Class78 arg0) {
		try {
			@Pc(10) int local10 = arg0.method3030();
			if (local10 == -1) {
				return false;
			}
			@Pc(21) Class78 local21 = arg0.method3010(0, local10);
			@Pc(30) Class78 local30 = arg0.method3052(local10 + 1);
			@Pc(33) MessageDigest local33 = MessageDigest.getInstance("SHA");
			local33.reset();
			local33.update(local21.method3013());
			@Pc(43) byte[] local43 = local33.digest();
			@Pc(47) byte[] local47 = local30.method3028();
			@Pc(52) Class2_Sub23 local52 = new Class2_Sub23(5000);
			local52.method2089(local47.length, local47);
			local52.anInt2703 = 0;
			local52.method2096(Static25.aBigInteger1, Static34.aBigInteger2);
			if (local52.aByteArray41[0] != 1) {
				return false;
			}
			for (@Pc(86) int local86 = 0; local86 < 20; local86++) {
				if (local43[local86] != local52.aByteArray41[local86 + 1]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(113) Exception local113) {
			return false;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)V")
	public static void method156(@OriginalArg(1) int arg0) {
		@Pc(10) Class76 local10 = Static11.aClass76_1;
		synchronized (Static11.aClass76_1) {
			Static75.anInt1617 = arg0;
		}
	}
}
