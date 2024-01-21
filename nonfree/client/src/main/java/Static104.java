import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!rf", name = "B", descriptor = "Lclient!se;")
	public static Class2_Sub2_Sub4 aClass2_Sub2_Sub4_33;

	@OriginalMember(owner = "client!rf", name = "F", descriptor = "Lclient!k;")
	public static Class2_Sub1_Sub4_Sub2 aClass2_Sub1_Sub4_Sub2_45;

	@OriginalMember(owner = "client!rf", name = "H", descriptor = "Lclient!be;")
	public static Class2_Sub4 aClass2_Sub4_38;

	@OriginalMember(owner = "client!rf", name = "s", descriptor = "Lclient!bc;")
	public static Class8 aClass8_66 = new Class8(260);

	@OriginalMember(owner = "client!rf", name = "C", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1281 = Static119.method1462("Unable to connect)3");

	@OriginalMember(owner = "client!rf", name = "D", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1282 = aClass65_1281;

	@OriginalMember(owner = "client!rf", name = "E", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1283 = Static119.method1462("Konfig geladen)3");

	@OriginalMember(owner = "client!rf", name = "G", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1284 = Static119.method1462(")1j");

	@OriginalMember(owner = "client!rf", name = "I", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1285 = aClass65_1281;

	@OriginalMember(owner = "client!rf", name = "J", descriptor = "I")
	public static volatile int anInt2963 = -1;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILclient!ub;)V")
	public static void method2058(@OriginalArg(1) Class2_Sub1_Sub1_Sub4 arg0) {
		arg0.anInt1920 = arg0.anInt1964;
		if (arg0.anInt1935 == 0) {
			arg0.anInt1946 = 0;
			return;
		}
		if (arg0.anInt1972 != -1 && arg0.anInt1936 == 0) {
			@Pc(29) Class2_Sub1_Sub2 local29 = Static23.method1313(arg0.anInt1972);
			if (arg0.anInt1961 > 0 && local29.anInt165 == 0) {
				arg0.anInt1946++;
				return;
			}
			if (arg0.anInt1961 <= 0 && local29.anInt172 == 0) {
				arg0.anInt1946++;
				return;
			}
		}
		@Pc(77) int local77 = arg0.anIntArray263[arg0.anInt1935 - 1] * 128 + arg0.anInt1929 * 64;
		@Pc(80) int local80 = arg0.anInt1948;
		@Pc(83) int local83 = arg0.anInt1958;
		@Pc(98) int local98 = arg0.anInt1929 * 64 + arg0.anIntArray264[arg0.anInt1935 - 1] * 128;
		if (local77 - local80 > 256 || local77 - local80 < -256 || local98 - local83 > 256 || local98 - local83 < -256) {
			arg0.anInt1958 = local98;
			arg0.anInt1948 = local77;
			return;
		}
		if (local80 >= local77) {
			if (local77 >= local80) {
				if (local98 > local83) {
					arg0.anInt1962 = 1024;
				} else if (local98 < local83) {
					arg0.anInt1962 = 0;
				}
			} else if (local83 < local98) {
				arg0.anInt1962 = 768;
			} else if (local83 > local98) {
				arg0.anInt1962 = 256;
			} else {
				arg0.anInt1962 = 512;
			}
		} else if (local83 < local98) {
			arg0.anInt1962 = 1280;
		} else if (local83 <= local98) {
			arg0.anInt1962 = 1536;
		} else {
			arg0.anInt1962 = 1792;
		}
		@Pc(213) int local213 = arg0.anInt1923;
		@Pc(215) int local215 = 4;
		@Pc(217) boolean local217 = true;
		@Pc(225) int local225 = arg0.anInt1962 - arg0.anInt1965 & 0x7FF;
		if (local225 > 1024) {
			local225 -= 2048;
		}
		if (local225 >= -256 && local225 <= 256) {
			local213 = arg0.anInt1959;
		} else if (local225 >= 256 && local225 < 768) {
			local213 = arg0.anInt1932;
		} else if (local225 >= -768 && local225 <= -256) {
			local213 = arg0.anInt1960;
		}
		if (local213 == -1) {
			local213 = arg0.anInt1959;
		}
		arg0.anInt1920 = local213;
		if (arg0 instanceof Class2_Sub1_Sub1_Sub4_Sub2) {
			local217 = ((Class2_Sub1_Sub1_Sub4_Sub2) arg0).aClass2_Sub1_Sub12_1.aBoolean82;
		}
		if (local217) {
			if (arg0.anInt1962 != arg0.anInt1965 && arg0.anInt1971 == -1 && arg0.anInt1930 != 0) {
				local215 = 2;
			}
			if (arg0.anInt1935 > 2) {
				local215 = 6;
			}
			if (arg0.anInt1935 > 3) {
				local215 = 8;
			}
			if (arg0.anInt1946 > 0 && arg0.anInt1935 > 1) {
				arg0.anInt1946--;
				local215 = 8;
			}
		} else {
			if (arg0.anInt1935 > 1) {
				local215 = 6;
			}
			if (arg0.anInt1935 > 2) {
				local215 = 8;
			}
			if (arg0.anInt1946 > 0 && arg0.anInt1935 > 1) {
				local215 = 8;
				arg0.anInt1946--;
			}
		}
		if (arg0.aBooleanArray14[arg0.anInt1935 - 1]) {
			local215 <<= 0x1;
		}
		if (local215 >= 8 && arg0.anInt1959 == arg0.anInt1920 && arg0.anInt1945 != -1) {
			arg0.anInt1920 = arg0.anInt1945;
		}
		if (local77 > local80) {
			arg0.anInt1948 += local215;
			if (local77 < arg0.anInt1948) {
				arg0.anInt1948 = local77;
			}
		} else if (local77 < local80) {
			arg0.anInt1948 -= local215;
			if (arg0.anInt1948 < local77) {
				arg0.anInt1948 = local77;
			}
		}
		if (local98 > local83) {
			arg0.anInt1958 += local215;
			if (local98 < arg0.anInt1958) {
				arg0.anInt1958 = local98;
			}
		} else if (local98 < local83) {
			arg0.anInt1958 -= local215;
			if (arg0.anInt1958 < local98) {
				arg0.anInt1958 = local98;
			}
		}
		if (local77 != arg0.anInt1948 || local98 != arg0.anInt1958) {
			return;
		}
		arg0.anInt1935--;
		if (arg0.anInt1961 > 0) {
			arg0.anInt1961--;
			return;
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
	public static void method2059() {
		aClass65_1285 = null;
		aClass65_1284 = null;
		aClass65_1281 = null;
		aClass65_1283 = null;
		aClass8_66 = null;
		aClass2_Sub4_38 = null;
		aClass65_1282 = null;
		aClass2_Sub2_Sub4_33 = null;
		aClass2_Sub1_Sub4_Sub2_45 = null;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)I")
	public static int method2060(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZLclient!na;Lclient!wf;ILclient!na;)V")
	public static void method2061(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) Class2_Sub1_Sub4_Sub3_Sub1 arg2, @OriginalArg(4) Class56 arg3) {
		Static115.aClass56_35 = arg1;
		Static105.aBoolean99 = arg0;
		Static35.aClass56_14 = arg3;
		Static35.aClass56_14.method1678(10);
		Static69.aClass2_Sub1_Sub4_Sub3_Sub1_2 = arg2;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIZLclient!e;)V")
	public static void method2062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class2_Sub1_Sub4_Sub1 arg4) {
		if (arg4 == null) {
			return;
		}
		@Pc(12) int local12 = Static82.anInt2719 + Static117.anInt2576 & 0x7FF;
		@Pc(20) int local20 = arg3 * arg3 + arg2 * arg2;
		if (local20 > 6400) {
			return;
		}
		@Pc(28) int local28 = Class2_Sub1_Sub4_Sub4.anIntArray248[local12];
		@Pc(36) int local36 = local28 * 256 / (Static54.anInt1338 + 256);
		@Pc(45) int local45 = Class2_Sub1_Sub4_Sub4.anIntArray251[local12];
		@Pc(53) int local53 = local45 * 256 / (Static54.anInt1338 + 256);
		@Pc(64) int local64 = local53 * arg3 + arg2 * local36 >> 16;
		@Pc(75) int local75 = arg3 * local36 - arg2 * local53 >> 16;
		if (local20 <= 2500) {
			arg4.method461(arg1 + local64 + 94 + 4 - arg4.anInt601 / 2, -local75 + -4 + 83 + (arg0 - arg4.anInt604 / 2));
		} else {
			arg4.method436(Static68.aClass2_Sub1_Sub4_Sub2_43, arg1 + local64 + 94 + 4 - arg4.anInt601 / 2, -local75 + -4 + arg0 - -83 + -(arg4.anInt604 / 2));
		}
	}
}
