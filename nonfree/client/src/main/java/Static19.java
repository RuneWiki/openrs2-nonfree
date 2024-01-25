import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!aka", name = "k", descriptor = "I")
	public static int anInt245;

	@OriginalMember(owner = "client!aka", name = "m", descriptor = "I")
	public static int anInt254;

	@OriginalMember(owner = "client!aka", name = "h", descriptor = "[I")
	public static final int[] anIntArray28 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!aka", name = "i", descriptor = "I")
	public static int anInt250 = -1;

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(IILclient!oi;II)V")
	public static void method289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub1_Sub1_Sub2 arg2, @OriginalArg(3) int arg3) {
		@Pc(11) Class92 local11 = arg2.method5930();
		@Pc(21) int local21 = arg2.anInt6870 - arg2.aClass49_7.anInt965 & 0x3FFF;
		if (arg0 == -1) {
			if (local21 != 0 || arg2.anInt6871 > 25) {
				if (arg1 < 0 && local11.anInt1933 != -1) {
					arg2.aBoolean456 = false;
					arg2.anInt6837 = local11.anInt1933;
				} else if (arg1 <= 0 || local11.anInt1936 == -1) {
					arg2.anInt6837 = local11.anInt1914;
				} else {
					arg2.anInt6837 = local11.anInt1936;
				}
				arg2.aBoolean456 = false;
			} else if (!arg2.aBoolean456 || !local11.method1749(arg2.anInt6837)) {
				arg2.anInt6837 = local11.method1746();
				arg2.aBoolean456 = arg2.anInt6837 != -1;
			}
		} else if (arg2.anInt6863 != -1 && (local21 >= 10240 || local21 <= 2048)) {
			@Pc(150) int local150 = Static678.anIntArray623[arg3] - arg2.aClass49_7.anInt965 & 0x3FFF;
			if (arg0 == 2 && local11.anInt1905 != -1) {
				if (local150 > 2048 && local150 <= 6144 && local11.anInt1923 != -1) {
					arg2.anInt6837 = local11.anInt1923;
				} else if (local150 >= 10240 && local150 < 14336 && local11.anInt1915 != -1) {
					arg2.anInt6837 = local11.anInt1915;
				} else if (local150 <= 6144 || local150 >= 10240 || local11.anInt1896 == -1) {
					arg2.anInt6837 = local11.anInt1905;
				} else {
					arg2.anInt6837 = local11.anInt1896;
				}
			} else if (arg0 == 0 && local11.anInt1931 != -1) {
				if (local150 > 2048 && local150 <= 6144 && local11.anInt1935 != -1) {
					arg2.anInt6837 = local11.anInt1935;
				} else if (local150 >= 10240 && local150 < 14336 && local11.anInt1911 != -1) {
					arg2.anInt6837 = local11.anInt1911;
				} else if (local150 <= 6144 || local150 >= 10240 || local11.anInt1897 == -1) {
					arg2.anInt6837 = local11.anInt1931;
				} else {
					arg2.anInt6837 = local11.anInt1897;
				}
			} else if (local150 > 2048 && local150 <= 6144 && local11.anInt1913 != -1) {
				arg2.anInt6837 = local11.anInt1913;
			} else if (local150 >= 10240 && local150 < 14336 && local11.anInt1900 != -1) {
				arg2.anInt6837 = local11.anInt1900;
			} else if (local150 <= 6144 || local150 >= 10240 || local11.anInt1930 == -1) {
				arg2.anInt6837 = local11.anInt1914;
			} else {
				arg2.anInt6837 = local11.anInt1930;
			}
			arg2.aBoolean456 = false;
		} else if (local21 == 0 && arg2.anInt6871 <= 25) {
			arg2.aBoolean456 = false;
			if (arg0 == 2 && local11.anInt1905 != -1) {
				arg2.anInt6837 = local11.anInt1905;
			} else if (arg0 == 0 && local11.anInt1931 != -1) {
				arg2.anInt6837 = local11.anInt1931;
			} else {
				arg2.anInt6837 = local11.anInt1914;
			}
		} else {
			if (arg0 == 2 && local11.anInt1905 != -1) {
				if (arg1 < 0 && local11.anInt1916 != -1) {
					arg2.anInt6837 = local11.anInt1916;
				} else if (arg1 <= 0 || local11.anInt1926 == -1) {
					arg2.anInt6837 = local11.anInt1905;
				} else {
					arg2.anInt6837 = local11.anInt1926;
				}
			} else if (arg0 == 0 && local11.anInt1931 != -1) {
				if (arg1 < 0 && local11.anInt1909 != -1) {
					arg2.anInt6837 = local11.anInt1909;
				} else if (arg1 <= 0 || local11.anInt1895 == -1) {
					arg2.anInt6837 = local11.anInt1931;
				} else {
					arg2.anInt6837 = local11.anInt1895;
				}
			} else if (arg1 < 0 && local11.anInt1919 != -1) {
				arg2.anInt6837 = local11.anInt1919;
			} else if (arg1 <= 0 || local11.anInt1925 == -1) {
				arg2.anInt6837 = local11.anInt1914;
			} else {
				arg2.anInt6837 = local11.anInt1925;
			}
			arg2.aBoolean456 = false;
		}
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(ILclient!uo;)V")
	public static void method290(@OriginalArg(1) Class5_Sub1_Sub20 arg0) {
		@Pc(7) boolean local7 = false;
		arg0.method8955();
		for (@Pc(23) Class5_Sub1_Sub20 local23 = (Class5_Sub1_Sub20) Static244.aClass388_5.method9027(); local23 != null; local23 = (Class5_Sub1_Sub20) Static244.aClass388_5.method9024()) {
			if (Static652.method8996(arg0.method8387(), local23.method8387())) {
				local7 = true;
				Static260.method4247(arg0, local23);
				break;
			}
		}
		if (!local7) {
			Static244.aClass388_5.method9022(arg0);
		}
	}
}
