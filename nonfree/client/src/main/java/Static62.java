import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "Lclient!i;")
	public static Class25 aClass25_3;

	@OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
	public static int anInt1878;

	@OriginalMember(owner = "client!mb", name = "ab", descriptor = "[I")
	public static int[] anIntArray202;

	@OriginalMember(owner = "client!mb", name = "bb", descriptor = "J")
	public static long aLong62;

	@OriginalMember(owner = "client!mb", name = "db", descriptor = "Lclient!e;")
	public static Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_17;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "Lclient!a;")
	public static Class1 aClass1_1906 = Static94.method1596("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
	public static int anInt1863 = 0;

	@OriginalMember(owner = "client!mb", name = "S", descriptor = "Lclient!a;")
	private static Class1 aClass1_1910 = Static94.method1596("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "Lclient!a;")
	public static Class1 aClass1_1907 = aClass1_1910;

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "Lclient!a;")
	private static Class1 aClass1_1908 = Static94.method1596("Click to continue");

	@OriginalMember(owner = "client!mb", name = "D", descriptor = "Lclient!a;")
	public static Class1 aClass1_1909 = aClass1_1908;

	@OriginalMember(owner = "client!mb", name = "P", descriptor = "Lclient!i;")
	public static Class25 aClass25_4 = new Class25(4096);

	@OriginalMember(owner = "client!mb", name = "W", descriptor = "I")
	public static int anInt1877 = 0;

	@OriginalMember(owner = "client!mb", name = "Y", descriptor = "Lclient!a;")
	public static Class1 aClass1_1911 = Static94.method1596("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!mb", name = "Z", descriptor = "Lclient!cb;")
	public static Class11 aClass11_15 = new Class11(30);

	@OriginalMember(owner = "client!mb", name = "cb", descriptor = "I")
	public static int anInt1879 = -1;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BII)I")
	public static int method1296(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) long local11 = (long) ((arg0 << 16) + arg1);
		return Static31.aClass2_Sub1_Sub15_1 != null && Static31.aClass2_Sub1_Sub15_1.aLong96 == local11 ? Static86.aClass2_Sub3_4.anInt1168 * 99 / (Static86.aClass2_Sub3_4.aByteArray7.length - Static31.aClass2_Sub1_Sub15_1.aByte6) + 1 : 0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)Z")
	public static boolean method1297() {
		@Pc(5) Class55 local5 = Static98.aClass55_1;
		synchronized (Static98.aClass55_1) {
			if (Static87.anInt2289 == Static98.anInt2515) {
				return false;
			} else {
				Static96.anInt2469 = Static50.anIntArray167[Static98.anInt2515];
				Static98.anInt2514 = Static86.anIntArray288[Static98.anInt2515];
				Static98.anInt2515 = Static98.anInt2515 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)Lclient!fd;")
	public static Class2_Sub1_Sub6 method1298(@OriginalArg(1) int arg0) {
		@Pc(14) Class2_Sub1_Sub6 local14 = (Class2_Sub1_Sub6) Static93.aClass11_23.method431((long) arg0);
		if (local14 != null) {
			return local14;
		}
		@Pc(24) byte[] local24 = Static53.aClass8_18.method1684(arg0, 14);
		local14 = new Class2_Sub1_Sub6();
		if (local24 != null) {
			local14.method772(new Class2_Sub3(local24));
		}
		Static93.aClass11_23.method430((long) arg0, local14);
		return local14;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public static void method1299() {
		aClass1_1908 = null;
		aClass1_1907 = null;
		aClass1_1906 = null;
		aClass1_1910 = null;
		aClass11_15 = null;
		aClass25_4 = null;
		aClass1_1909 = null;
		anIntArray202 = null;
		aClass25_3 = null;
		aClass1_1911 = null;
		aClass2_Sub1_Sub2_Sub2_17 = null;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)V")
	public static void method1300() {
		while (true) {
			if (Static13.aClass2_Sub3_Sub1_1.method833(Static83.anInt2224) >= 11) {
				@Pc(26) int local26 = Static13.aClass2_Sub3_Sub1_1.method838(11);
				if (local26 != 2047) {
					@Pc(33) boolean local33 = false;
					if (Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[local26] == null) {
						Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[local26] = new Class2_Sub1_Sub1_Sub1_Sub1();
						if (Static40.aClass2_Sub3Array5[local26] != null) {
							Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[local26].method119(Static40.aClass2_Sub3Array5[local26]);
						}
						local33 = true;
					}
					Static93.anIntArray292[Static99.anInt2521++] = local26;
					@Pc(69) Class2_Sub1_Sub1_Sub1_Sub1 local69 = Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[local26];
					local69.anInt2755 = Static69.anInt2806;
					@Pc(77) int local77 = Static13.aClass2_Sub3_Sub1_1.method838(5);
					@Pc(82) int local82 = Static13.aClass2_Sub3_Sub1_1.method838(5);
					if (local77 > 15) {
						local77 -= 32;
					}
					if (local82 > 15) {
						local82 -= 32;
					}
					@Pc(101) int local101 = Static18.anIntArray88[Static13.aClass2_Sub3_Sub1_1.method838(3)];
					if (local33) {
						local69.anInt2741 = local101;
					}
					@Pc(111) int local111 = Static13.aClass2_Sub3_Sub1_1.method838(1);
					@Pc(116) int local116 = Static13.aClass2_Sub3_Sub1_1.method838(1);
					if (local116 == 1) {
						Static45.anIntArray156[Static67.anInt2767++] = local26;
					}
					local69.method1786(local82 + Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local111 == 1, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0] + local77);
					continue;
				}
			}
			Static13.aClass2_Sub3_Sub1_1.method834();
			return;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIZ)I")
	public static int method1301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		} else {
			arg1 = arg1 * (arg0 & 0x7F) / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		}
	}
}
