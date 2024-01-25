import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!id", name = "h", descriptor = "[B")
	public static byte[] aByteArray48;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray12 = new boolean[8];

	@OriginalMember(owner = "client!id", name = "c", descriptor = "I")
	public static int anInt2837 = 0;

	@OriginalMember(owner = "client!id", name = "j", descriptor = "I")
	public static int anInt2843 = 0;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!fp;)V")
	public static void method2685(@OriginalArg(1) Class63 arg0) {
		@Pc(7) int local7 = Static35.anInt920;
		@Pc(9) int local9 = Static361.anInt6937;
		@Pc(11) int local11 = Static182.anInt3706;
		@Pc(13) int local13 = Static208.anInt4100;
		arg0.method4639(local9, local7, local13, -10660793, local11);
		arg0.method4639(local9 + 1, local7 - -1, 16, -16777216, local11 - 2);
		arg0.method4577(local13 - 19, local7 - -1, -16777216, local11 - 2, local9 + 18);
		Static340.aClass33_3.method6024(-1, local9 + 14, Static110.aClass106_84.method2927(Static254.anInt5172), -10660793, local7 + 3);
		@Pc(72) int local72 = Static164.aClass142_1.method4911();
		@Pc(76) int local76 = Static164.aClass142_1.method4915();
		@Pc(78) int local78 = 0;
		for (@Pc(83) Class1_Sub22 local83 = (Class1_Sub22) Static317.aClass42_43.method1543(); local83 != null; local83 = (Class1_Sub22) Static317.aClass42_43.method1551()) {
			@Pc(98) int local98 = (Static224.anInt4512 - local78 - 1) * 16 + local9 + 31;
			@Pc(100) short local100 = -1;
			if (local72 > local7 && local7 + local11 > local72 && local98 - 13 < local76 && local98 + 3 > local76 && local83.aBoolean204) {
				local100 = -256;
			}
			@Pc(141) int[] local141 = null;
			if (Static83.method1776(local83.anInt2822)) {
				local141 = Static243.aClass220_2.method5972((int) local83.aLong104).anIntArray58;
			} else if (Static289.method5105(local83.anInt2822)) {
				@Pc(207) Class11_Sub2_Sub6_Sub2 local207 = Static231.aClass11_Sub2_Sub6_Sub2Array1[(int) local83.aLong104];
				if (local207 != null) {
					@Pc(212) Class208 local212 = local207.aClass208_1;
					if (local212.anIntArray480 != null) {
						local212 = local212.method5539();
					}
					if (local212 != null) {
						local141 = local212.anIntArray476;
					}
				}
			} else if (Static298.method5710(local83.anInt2822)) {
				@Pc(181) Class71 local181;
				if (local83.anInt2822 == 1006) {
					local181 = Static219.method4081((int) local83.aLong104);
				} else {
					local181 = Static219.method4081((int) (local83.aLong104 >>> 32 & 0x7FFFFFFFL));
				}
				if (local181.anIntArray178 != null) {
					local181 = local181.method2282();
				}
				if (local181 != null) {
					local141 = local181.anIntArray181;
				}
			}
			@Pc(228) String local228 = Static123.method2597(local83);
			if (local141 != null) {
				local228 = local228 + Static7.method285(local141);
			}
			Static340.aClass33_3.method6032(local98, local228, Static213.aClass4Array11, local7 + 3, Static74.anIntArray137, local100);
			local78++;
			if (local83.aBoolean203) {
				Static155.aClass4_9.method5948(local7 + Static64.aClass80_17.method2543(local228) + 5, local98 + -12);
			}
		}
		Static271.method594(Static361.anInt6937, Static35.anInt920, Static182.anInt3706, Static208.anInt4100);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/lang/Object;BZ)[B")
	public static byte[] method2686(@OriginalArg(0) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return arg1 ? Static275.method4903(local13) : local13;
		} else if (arg0 instanceof Class10) {
			@Pc(27) Class10 local27 = (Class10) arg0;
			return local27.method345();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIJ)V")
	public static void method2687(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		@Pc(10) int local10 = (int) arg2 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg2 >> 20 & 0x3;
		@Pc(28) int local28 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static366.method6070(0, arg1, local10, 0, true, arg0, Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray505[0], 0, local17, Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray504[0]);
			return;
		}
		@Pc(61) Class71 local61 = Static219.method4081(local28);
		@Pc(75) int local75;
		@Pc(72) int local72;
		if (local17 == 0 || local17 == 2) {
			local72 = local61.anInt2376;
			local75 = local61.anInt2411;
		} else {
			local72 = local61.anInt2411;
			local75 = local61.anInt2376;
		}
		@Pc(86) int local86 = local61.anInt2387;
		if (local17 != 0) {
			local86 = (local86 << local17 & 0xF) + (local86 >> 4 - local17);
		}
		Static366.method6070(local86, arg1, 0, local75, true, arg0, Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray505[0], local72, 0, Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray504[0]);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method2688(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!fp;Lclient!je;III)V")
	public static void method2689(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class155 local12;
		if (arg3 < Static300.anInt5778) {
			local12 = Static105.aClass155ArrayArrayArray3[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass11_Sub1_2 != null && local12.aClass11_Sub1_2.method5913()) {
				arg1.method5915(arg0, local12.aClass11_Sub1_2, true, 0, Static66.anInt1552, 0);
			}
		}
		if (arg4 < Static300.anInt5778) {
			local12 = Static105.aClass155ArrayArrayArray3[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass11_Sub1_2 != null && local12.aClass11_Sub1_2.method5913()) {
				arg1.method5915(arg0, local12.aClass11_Sub1_2, true, 0, 0, Static66.anInt1552);
			}
		}
		if (arg3 < Static300.anInt5778 && arg4 < Static354.anInt6714) {
			local12 = Static105.aClass155ArrayArrayArray3[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass11_Sub1_2 != null && local12.aClass11_Sub1_2.method5913()) {
				arg1.method5915(arg0, local12.aClass11_Sub1_2, true, 0, Static66.anInt1552, Static66.anInt1552);
			}
		}
		if (arg3 < Static300.anInt5778 && arg4 > 0) {
			local12 = Static105.aClass155ArrayArrayArray3[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass11_Sub1_2 != null && local12.aClass11_Sub1_2.method5913()) {
				arg1.method5915(arg0, local12.aClass11_Sub1_2, true, 0, Static66.anInt1552, -Static66.anInt1552);
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BLclient!kg;)Lclient!kg;")
	public static Class112 method2690(@OriginalArg(1) Class112 arg0) {
		if (arg0.anInt3428 != -1) {
			return Static188.method3536(arg0.anInt3428);
		}
		@Pc(20) int local20 = arg0.anInt3376 >>> 16;
		@Pc(32) Class122 local32 = new Class122(Static281.aClass38_30);
		for (@Pc(37) Class1_Sub15 local37 = (Class1_Sub15) local32.method3452(); local37 != null; local37 = (Class1_Sub15) local32.method3450()) {
			if (local37.anInt1496 == local20) {
				return Static188.method3536((int) local37.aLong217);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)Z")
	public static boolean method2691() {
		try {
			if (Static310.anInt5974 == 2) {
				if (Static311.aClass1_Sub31_4 == null) {
					Static311.aClass1_Sub31_4 = Static379.method4127(Class11_Sub2_Sub3.lb, Static149.anInt3140, Static286.anInt5851);
					if (Static311.aClass1_Sub31_4 == null) {
						return false;
					}
				}
				if (Static174.aClass158_1 == null) {
					Static174.aClass158_1 = new Class158(Static228.aClass30_67, Static158.aClass30_49);
				}
				if (Static40.aClass1_Sub6_Sub4_2.method4073(Static107.aClass30_32, Static174.aClass158_1, Static311.aClass1_Sub31_4)) {
					Static40.aClass1_Sub6_Sub4_2.method4063();
					Static40.aClass1_Sub6_Sub4_2.method4060(Static192.anInt3868);
					Static40.aClass1_Sub6_Sub4_2.method4088(Static311.aClass1_Sub31_4, Static162.aBoolean224);
					Static174.aClass158_1 = null;
					Class11_Sub2_Sub3.lb = null;
					Static311.aClass1_Sub31_4 = null;
					Static310.anInt5974 = 0;
					return true;
				}
			}
		} catch (@Pc(64) Exception local64) {
			local64.printStackTrace();
			Static40.aClass1_Sub6_Sub4_2.method4068();
			Class11_Sub2_Sub3.lb = null;
			Static311.aClass1_Sub31_4 = null;
			Static174.aClass158_1 = null;
			Static310.anInt5974 = 0;
		}
		return false;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
	public static void method2692() {
		@Pc(1) Class21 local1 = Static232.aClass21_125;
		synchronized (Static232.aClass21_125) {
			Static232.aClass21_125.method857();
		}
		@Pc(26) Class21 local26 = Static34.aClass21_35;
		synchronized (Static34.aClass21_35) {
			Static34.aClass21_35.method857();
		}
		local26 = Static244.aClass21_134;
		synchronized (Static244.aClass21_134) {
			Static244.aClass21_134.method857();
		}
	}
}
