import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!pa", name = "s", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1101 = Static151.method2243("Existing User");

	@OriginalMember(owner = "client!pa", name = "o", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1098 = aClass62_1101;

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1099 = Static151.method2243("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

	@OriginalMember(owner = "client!pa", name = "y", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1103 = Static151.method2243("Your ignore list is full)3 Max of 100 users)3");

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1100 = aClass62_1103;

	@OriginalMember(owner = "client!pa", name = "x", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1102 = Static151.method2243("Die Verbindung konnte");

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BJ)Lclient!mb;")
	public static Class62 method2218(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(37) long local37 = arg0; local37 != 0L; local37 /= 37L) {
				local29++;
			}
			@Pc(51) byte[] local51 = new byte[local29];
			while (arg0 != 0L) {
				@Pc(55) long local55 = arg0;
				arg0 /= 37L;
				local29--;
				local51[local29] = Static210.aByteArray51[(int) (local55 - arg0 * 37L)];
			}
			@Pc(82) Class62 local82 = new Class62();
			local82.aByteArray28 = local51;
			local82.anInt2653 = local51.length;
			return local82;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIII[Lclient!ii;)V")
	public static void method2219(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class47[] arg3) {
		for (@Pc(12) int local12 = 0; local12 < arg3.length; local12++) {
			@Pc(18) Class47 local18 = arg3[local12];
			if (local18 != null && local18.anInt1877 == arg0) {
				if (local18.aByte5 == 0) {
					local18.anInt1858 = local18.anInt1837;
				} else if (local18.aByte5 == 1) {
					local18.anInt1858 = arg2 - local18.anInt1837;
				} else if (local18.aByte5 == 2) {
					local18.anInt1858 = local18.anInt1837 * arg2 >> 14;
				} else if (local18.aByte5 == 3) {
					if (local18.anInt1870 == 2) {
						local18.anInt1858 = (local18.anInt1837 - 1) * local18.anInt1903 + local18.anInt1837 * 32;
					} else if (local18.anInt1870 == 7) {
						local18.anInt1858 = local18.anInt1837 * 12 + local18.anInt1903 * (local18.anInt1837 - 1);
					}
				}
				if (local18.aByte6 == 0) {
					local18.anInt1912 = local18.anInt1841;
				} else if (local18.aByte6 == 1) {
					local18.anInt1912 = (arg2 - local18.anInt1858) / 2 + local18.anInt1841;
				} else if (local18.aByte6 == 2) {
					local18.anInt1912 = arg2 - local18.anInt1858 - local18.anInt1841;
				} else if (local18.aByte6 == 3) {
					local18.anInt1912 = local18.anInt1841 * arg2 >> 14;
				} else if (local18.aByte6 == 4) {
					local18.anInt1912 = (arg2 * local18.anInt1841 >> 14) + (arg2 - local18.anInt1858) / 2;
				} else {
					local18.anInt1912 = arg2 - (arg2 * local18.anInt1841 >> 14) - local18.anInt1858;
				}
				if (local18.aByte3 == 0) {
					local18.anInt1910 = local18.anInt1845;
				} else if (local18.aByte3 == 1) {
					local18.anInt1910 = arg1 - local18.anInt1845;
				} else if (local18.aByte3 == 2) {
					local18.anInt1910 = arg1 * local18.anInt1845 >> 14;
				} else if (local18.aByte3 == 3) {
					if (local18.anInt1870 == 2) {
						local18.anInt1910 = local18.anInt1843 * (local18.anInt1845 - 1) + local18.anInt1845 * 32;
					} else if (local18.anInt1870 == 7) {
						local18.anInt1910 = local18.anInt1845 * 115 + local18.anInt1843 * (local18.anInt1845 - 1);
					}
				}
				if (local18.anInt1836 > local18.anInt1911 - local18.anInt1858) {
					local18.anInt1836 = local18.anInt1911 - local18.anInt1858;
				}
				if (local18.anInt1836 < 0) {
					local18.anInt1836 = 0;
				}
				if (local18.aByte4 == 0) {
					local18.anInt1865 = local18.anInt1864;
				} else if (local18.aByte4 == 1) {
					local18.anInt1865 = (arg1 - local18.anInt1910) / 2 + local18.anInt1864;
				} else if (local18.aByte4 == 2) {
					local18.anInt1865 = arg1 - local18.anInt1864 - local18.anInt1910;
				} else if (local18.aByte4 == 3) {
					local18.anInt1865 = local18.anInt1864 * arg1 >> 14;
				} else if (local18.aByte4 == 4) {
					local18.anInt1865 = (arg1 - local18.anInt1910) / 2 + (arg1 * local18.anInt1864 >> 14);
				} else {
					local18.anInt1865 = arg1 - (arg1 * local18.anInt1864 >> 14) - local18.anInt1910;
				}
				if (local18.anInt1891 > local18.anInt1861 - local18.anInt1910) {
					local18.anInt1891 = local18.anInt1861 - local18.anInt1910;
				}
				if (local18.anInt1891 < 0) {
					local18.anInt1891 = 0;
				}
				if (local18.anInt1870 == 0) {
					Static208.method3033(local18);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZI)V")
	public static void method2221(@OriginalArg(0) boolean arg0) {
		if (Static117.aClass36_2 == null) {
			return;
		}
		try {
			@Pc(11) Class2_Sub11 local11 = new Class2_Sub11(4);
			local11.method1565(arg0 ? 2 : 3);
			local11.method1554(0);
			Static117.aClass36_2.method858(local11.aByteArray26, 4);
		} catch (@Pc(37) IOException local37) {
			try {
				Static117.aClass36_2.method862();
			} catch (@Pc(42) Exception local42) {
			}
			Static69.anInt1430++;
			Static117.aClass36_2 = null;
		}
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(B)V")
	public static void method2222() {
		Static92.aClass53_9.method1649();
		Static23.aClass53_3.method1649();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)V")
	public static void method2223() {
		Static21.aClass71_3 = null;
		Static80.anInt1663 = -1;
		Static35.anInt841 = 1;
		Static49.anInt1075 = -1;
		Static40.aBoolean40 = false;
		Static46.anInt1030 = 0;
		Static59.anInt1222 = 2;
	}
}
