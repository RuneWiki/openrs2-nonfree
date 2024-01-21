import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!v", name = "I", descriptor = "I")
	public static int anInt2938;

	@OriginalMember(owner = "client!v", name = "Z", descriptor = "[I")
	public static int[] anIntArray449;

	@OriginalMember(owner = "client!v", name = "rb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!v", name = "Gb", descriptor = "J")
	public static long aLong137;

	@OriginalMember(owner = "client!v", name = "Hb", descriptor = "Lclient!ge;")
	public static Class29_Sub1 aClass29_Sub1_48;

	@OriginalMember(owner = "client!v", name = "ac", descriptor = "Lclient!jd;")
	public static Class11 aClass11_129;

	@OriginalMember(owner = "client!v", name = "H", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1288 = Static63.method1251("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!v", name = "db", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1291 = Static63.method1251("To");

	@OriginalMember(owner = "client!v", name = "S", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1289 = aClass45_1291;

	@OriginalMember(owner = "client!v", name = "Cb", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1294 = Static63.method1251("Take");

	@OriginalMember(owner = "client!v", name = "W", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1290 = aClass45_1294;

	@OriginalMember(owner = "client!v", name = "kb", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1293 = Static63.method1251("To create a new account you need to");

	@OriginalMember(owner = "client!v", name = "ib", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1292 = aClass45_1293;

	@OriginalMember(owner = "client!v", name = "Lb", descriptor = "I")
	public static final int anInt2972 = 7759444;

	@OriginalMember(owner = "client!v", name = "cc", descriptor = "I")
	public static int anInt2981 = 0;

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V")
	public static void method2028() {
		aClass45_1289 = null;
		aClass45_1288 = null;
		aByteArrayArrayArray8 = null;
		aClass45_1293 = null;
		anIntArray449 = null;
		aClass45_1292 = null;
		aClass11_129 = null;
		aClass45_1294 = null;
		aClass45_1290 = null;
		aClass29_Sub1_48 = null;
		aClass45_1291 = null;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(III)V")
	public static void method2034(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) long local6 = (long) (arg1 + (arg0 << 16));
		@Pc(12) Class5_Sub2_Sub11 local12 = (Class5_Sub2_Sub11) Static90.aClass66_9.method1812(local6);
		if (local12 != null) {
			Static101.aClass49_2.method1471(local12);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!we;ILclient!hb;B)V")
	public static void method2037(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub9 arg2) {
		@Pc(17) Class5_Sub15 local17 = new Class5_Sub15();
		local17.anInt2745 = arg2.method1408();
		local17.anInt2752 = arg2.method1434();
		local17.anIntArray420 = new int[local17.anInt2745];
		local17.anIntArray418 = new int[local17.anInt2745];
		local17.aByteArrayArrayArray7 = new byte[local17.anInt2745][][];
		local17.aClass46Array2 = new Class46[local17.anInt2745];
		local17.anIntArray421 = new int[local17.anInt2745];
		local17.aClass46Array1 = new Class46[local17.anInt2745];
		for (@Pc(59) int local59 = 0; local59 < local17.anInt2745; local59++) {
			try {
				@Pc(65) int local65 = arg2.method1408();
				@Pc(82) String local82;
				@Pc(91) String local91;
				@Pc(93) int local93;
				if (local65 == 0 || local65 == 1 || local65 == 2) {
					local82 = new String(arg2.method1448().method1323());
					local91 = new String(arg2.method1448().method1323());
					local93 = 0;
					if (local65 == 1) {
						local93 = arg2.method1434();
					}
					local17.anIntArray421[local59] = local65;
					local17.anIntArray418[local59] = local93;
					local17.aClass46Array1[local59] = arg0.method2169(local91, Static54.method1132(local82));
				} else if (local65 == 3 || local65 == 4) {
					local82 = new String(arg2.method1448().method1323());
					local91 = new String(arg2.method1448().method1323());
					local93 = arg2.method1408();
					@Pc(154) String[] local154 = new String[local93];
					for (@Pc(156) int local156 = 0; local156 < local93; local156++) {
						local154[local156] = new String(arg2.method1448().method1323());
					}
					@Pc(180) byte[][] local180 = new byte[local93][];
					@Pc(193) int local193;
					if (local65 == 3) {
						for (@Pc(187) int local187 = 0; local187 < local93; local187++) {
							local193 = arg2.method1434();
							local180[local187] = new byte[local193];
							arg2.method1433(local180[local187], local193);
						}
					}
					@Pc(217) Class[] local217 = new Class[local93];
					local17.anIntArray421[local59] = local65;
					for (local193 = 0; local193 < local93; local193++) {
						local217[local193] = Static54.method1132(local154[local193]);
					}
					local17.aClass46Array2[local59] = arg0.method2161(Static54.method1132(local82), local91, local217);
					local17.aByteArrayArrayArray7[local59] = local180;
				}
			} catch (@Pc(257) ClassNotFoundException local257) {
				local17.anIntArray420[local59] = -1;
			} catch (@Pc(264) SecurityException local264) {
				local17.anIntArray420[local59] = -2;
			} catch (@Pc(271) NullPointerException local271) {
				local17.anIntArray420[local59] = -3;
			} catch (@Pc(278) Exception local278) {
				local17.anIntArray420[local59] = -4;
			} catch (@Pc(285) Throwable local285) {
				local17.anIntArray420[local59] = -5;
			}
		}
		Static103.aClass10_12.method234(local17);
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(III)I")
	public static int method2040(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class5_Sub6 local17 = (Class5_Sub6) Static87.aClass66_8.method1812((long) arg0);
		if (local17 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(28) int local28 = 0;
			for (@Pc(30) int local30 = 0; local30 < local17.anIntArray147.length; local30++) {
				if (local17.anIntArray149[local30] == arg1) {
					local28 += local17.anIntArray147[local30];
				}
			}
			return local28;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZI)Lclient!sb;")
	public static Class5_Sub2_Sub13 method2042(@OriginalArg(1) int arg0) {
		@Pc(15) Class5_Sub2_Sub13 local15 = (Class5_Sub2_Sub13) Static16.aClass67_4.method1823((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static71.aClass29_Sub1_32.method733(0, arg0);
		if (local25 == null) {
			return null;
		}
		local15 = new Class5_Sub2_Sub13();
		@Pc(35) int local35 = 0;
		@Pc(40) Class5_Sub9 local40 = new Class5_Sub9(local25);
		local40.anInt2140 = local40.aByteArray28.length - 12;
		@Pc(51) int local51 = local40.method1434();
		local15.anInt2696 = local40.method1418();
		local15.anInt2697 = local40.method1418();
		local15.anInt2687 = local40.method1418();
		local15.anInt2695 = local40.method1418();
		local15.anIntArray410 = new int[local51];
		local40.anInt2140 = 0;
		local15.anIntArray409 = new int[local51];
		local15.aClass45Array18 = new Class45[local51];
		while (local40.aByteArray28.length - 12 > local40.anInt2140) {
			@Pc(91) int local91 = local40.method1418();
			if (local91 == 3) {
				local15.aClass45Array18[local35] = local40.method1448();
			} else if (local91 >= 100 || local91 == 21 || local91 == 38 || local91 == 39) {
				local15.anIntArray410[local35] = local40.method1408();
			} else {
				local15.anIntArray410[local35] = local40.method1434();
			}
			local15.anIntArray409[local35++] = local91;
		}
		Static16.aClass67_4.method1818(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIB)I")
	public static int method2045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 2) {
			@Pc(23) int local23 = method2045(arg0 * arg0, arg1 >> 1);
			if ((arg1 & 0x1) != 0) {
				local23 *= arg0;
			}
			return local23;
		} else if (arg1 == 1) {
			return arg0;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(II)I")
	public static int method2047(@OriginalArg(1) int arg0) {
		@Pc(3) Class5_Sub2_Sub16 local3 = Static101.method752(arg0);
		@Pc(6) int local6 = local3.anInt3012;
		@Pc(17) int local17 = local3.anInt3009;
		@Pc(24) int local24 = local3.anInt3006;
		@Pc(31) int local31 = Class40.anIntArray276[local24 - local6];
		return local31 & Static117.anIntArray483[local17] >> local6;
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(III)V")
	public static void method2050(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static64.aClass5_Sub9_Sub1_2.method1466(149);
		Static64.aClass5_Sub9_Sub1_2.method1424(arg0);
		Static64.aClass5_Sub9_Sub1_2.method1430(arg1);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IBI)Z")
	public static boolean method2057(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0 && Static120.anInt3126 == arg1) {
			return true;
		} else if (arg0 == 1 && Static98.anInt2649 == arg1) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && arg1 == Static32.anInt942;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IBLclient!ge;IBIZ)V")
	public static void method2061(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class29_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) long local10 = (long) (arg3 + (arg4 << 16));
		@Pc(16) Class5_Sub2_Sub11 local16 = (Class5_Sub2_Sub11) Static27.aClass66_2.method1812(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class5_Sub2_Sub11) Static45.aClass66_7.method1812(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class5_Sub2_Sub11) Static90.aClass66_9.method1812(local10);
		if (local16 == null) {
			if (!arg5) {
				local16 = (Class5_Sub2_Sub11) Static34.aClass66_4.method1812(local10);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class5_Sub2_Sub11();
			local16.aByte3 = arg1;
			local16.anInt2238 = arg0;
			local16.aClass29_Sub1_35 = arg2;
			if (arg5) {
				Static27.aClass66_2.method1811(local10, local16);
				Static75.anInt2176++;
			} else {
				Static101.aClass49_2.method1472(local16);
				Static90.aClass66_9.method1811(local10, local16);
				Static52.anInt3132++;
			}
		} else if (arg5) {
			local16.method2116();
			Static27.aClass66_2.method1811(local10, local16);
			Static52.anInt3132--;
			Static75.anInt2176++;
		}
	}
}
