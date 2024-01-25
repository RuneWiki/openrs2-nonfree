import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!he", name = "R", descriptor = "Lclient!ui;")
	public static Class230 aClass230_35;

	@OriginalMember(owner = "client!he", name = "V", descriptor = "[Lclient!dp;")
	public static Class51[] aClass51Array10;

	@OriginalMember(owner = "client!he", name = "Y", descriptor = "Lclient!cp;")
	public static Interface2 anInterface2_2;

	@OriginalMember(owner = "client!he", name = "Z", descriptor = "Lclient!mu;")
	public static Class127 aClass127_4;

	@OriginalMember(owner = "client!he", name = "ab", descriptor = "I")
	public static int anInt2508;

	@OriginalMember(owner = "client!he", name = "N", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_82 = new Class48(71, 3);

	@OriginalMember(owner = "client!he", name = "Q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray37 = new String[100];

	@OriginalMember(owner = "client!he", name = "S", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_83 = new Class48(63, -1);

	@OriginalMember(owner = "client!he", name = "T", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_60 = new Class211(11, -1);

	@OriginalMember(owner = "client!he", name = "U", descriptor = "I")
	public static int anInt2506 = 1;

	@OriginalMember(owner = "client!he", name = "W", descriptor = "I")
	public static int anInt2507 = 0;

	@OriginalMember(owner = "client!he", name = "X", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray38 = new String[8];

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZB)V")
	public static void method1979(@OriginalArg(0) boolean arg0) {
		while (true) {
			if (Static139.aClass1_Sub33_Sub2_1.method5201(Static121.anInt2167) >= 15) {
				@Pc(18) int local18 = Static139.aClass1_Sub33_Sub2_1.method5191(15);
				if (local18 != 32767) {
					@Pc(25) boolean local25 = false;
					if (Static171.aClass25_Sub1_Sub1_Sub2Array1[local18] == null) {
						Static171.aClass25_Sub1_Sub1_Sub2Array1[local18] = new Class25_Sub1_Sub1_Sub2();
						Static171.aClass25_Sub1_Sub1_Sub2Array1[local18].anInt2331 = local18;
						local25 = true;
					}
					@Pc(46) Class25_Sub1_Sub1_Sub2 local46 = Static171.aClass25_Sub1_Sub1_Sub2Array1[local18];
					Static131.anIntArray302[Static309.anInt5243++] = local18;
					local46.anInt2319 = Static366.anInt5883;
					if (local46.aClass59_1 != null && local46.aClass59_1.method1148()) {
						Static135.method2029(local46);
					}
					@Pc(73) int local73 = Static139.aClass1_Sub33_Sub2_1.method5191(1);
					@Pc(80) int local80;
					if (arg0) {
						local80 = Static139.aClass1_Sub33_Sub2_1.method5191(8);
						if (local80 > 127) {
							local80 -= 256;
						}
					} else {
						local80 = Static139.aClass1_Sub33_Sub2_1.method5191(5);
						if (local80 > 15) {
							local80 -= 32;
						}
					}
					@Pc(100) int local100 = Static139.aClass1_Sub33_Sub2_1.method5191(2);
					@Pc(107) int local107;
					if (arg0) {
						local107 = Static139.aClass1_Sub33_Sub2_1.method5191(8);
						if (local107 > 127) {
							local107 -= 256;
						}
					} else {
						local107 = Static139.aClass1_Sub33_Sub2_1.method5191(5);
						if (local107 > 15) {
							local107 -= 32;
						}
					}
					local46.method1899(Static168.aClass196_2.method4452(Static139.aClass1_Sub33_Sub2_1.method5191(14)));
					@Pc(145) int local145 = Static139.aClass1_Sub33_Sub2_1.method5191(3) + 4 << 11 & 0x3C61;
					@Pc(150) int local150 = Static139.aClass1_Sub33_Sub2_1.method5191(1);
					if (local150 == 1) {
						Static200.anIntArray420[Static382.anInt6197++] = local18;
					}
					local46.method1882(local46.aClass59_1.anInt1420);
					local46.anInt2341 = local46.aClass59_1.anInt1414 << 3;
					if (local46.anInt2341 == 0) {
						local46.method1891(0);
					} else if (local25) {
						local46.method1891(local145);
					}
					local46.method1900(local100, local107 + Static321.aClass25_Sub1_Sub1_Sub1_2.anIntArray295[0], local46.method1877(), local73 == 1, local80 + Static321.aClass25_Sub1_Sub1_Sub1_2.anIntArray296[0]);
					if (local46.aClass59_1.method1148()) {
						Static275.method4229(null, null, local46.aByte70, local46, 0, local46.anIntArray295[0], local46.anIntArray296[0]);
					}
					continue;
				}
			}
			Static139.aClass1_Sub33_Sub2_1.method5193();
			return;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIZ)Lclient!qr;")
	public static Class1_Sub38 method1981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) Class1_Sub38 local7 = new Class1_Sub38();
		local7.anInt5050 = arg1;
		local7.anInt5052 = arg2;
		Static22.aClass77_29.method1370((long) arg0, local7);
		Static144.method2184(arg1);
		@Pc(33) Class117 local33 = Static13.method107(arg0);
		if (local33 != null) {
			Static312.method4635(local33);
		}
		if (Static363.aClass117_17 != null) {
			Static312.method4635(Static363.aClass117_17);
			Static363.aClass117_17 = null;
		}
		Static241.method3347();
		if (local33 != null) {
			Static365.method5064(!arg3, local33);
		}
		if (!arg3) {
			Static387.method5494(arg1);
		}
		if (!arg3 && Static352.anInt5753 != -1) {
			Static350.method4909(Static352.anInt5753, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!ui;Lclient!ui;Lclient!om;I)V")
	public static void method1982(@OriginalArg(0) Class230 arg0, @OriginalArg(1) Class230 arg1, @OriginalArg(2) Interface9 arg2) {
		Static26.aClass230_7 = arg1;
		Static379.anInterface9_1 = arg2;
		Static226.aClass230_57 = arg0;
		if (Static26.aClass230_7 != null) {
			Static328.anInt5515 = Static26.aClass230_7.method4956(1);
		}
		if (Static226.aClass230_57 != null) {
			Static153.anInt2825 = Static226.aClass230_57.method4956(1);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIILclient!sl;)Lclient!bu;")
	public static Class1_Sub6_Sub1 method1983(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class213 arg2) {
		@Pc(10) int local10 = arg2.anInt5477 | arg0 << 8;
		@Pc(19) Class1_Sub6_Sub1 local19 = (Class1_Sub6_Sub1) Static147.aClass219_3.method4799((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(33) byte[] local33 = Static98.aClass230_32.method4961(Static98.aClass230_32.method4982(local10));
		if (local33 == null) {
			local10 = arg2.anInt5477 | arg1 + 65536 << 8;
			local19 = (Class1_Sub6_Sub1) Static147.aClass219_3.method4799((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local33 = Static98.aClass230_32.method4961(Static98.aClass230_32.method4982(local10));
			if (local33 == null) {
				local10 = arg2.anInt5477 | 0xFFFF00;
				local19 = (Class1_Sub6_Sub1) Static147.aClass219_3.method4799((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local33 = Static98.aClass230_32.method4961(Static98.aClass230_32.method4982(local10));
				if (local33 == null) {
					return null;
				} else if (local33.length <= 1) {
					return null;
				} else {
					local19 = Static306.method4557(local33);
					local19.aClass213_2 = arg2;
					Static147.aClass219_3.method4801((long) local10 << 16, local19);
					return local19;
				}
			} else if (local33.length <= 1) {
				return null;
			} else {
				local19 = Static306.method4557(local33);
				local19.aClass213_2 = arg2;
				Static147.aClass219_3.method4801((long) local10 << 16, local19);
				return local19;
			}
		} else if (local33.length <= 1) {
			return null;
		} else {
			local19 = Static306.method4557(local33);
			local19.aClass213_2 = arg2;
			Static147.aClass219_3.method4801((long) local10 << 16, local19);
			return local19;
		}
	}
}
