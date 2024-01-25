import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!wm", name = "U", descriptor = "Lclient!lf;")
	public static Class121 aClass121_9;

	@OriginalMember(owner = "client!wm", name = "V", descriptor = "Lclient!ct;")
	public static Class30 aClass30_108;

	@OriginalMember(owner = "client!wm", name = "X", descriptor = "I")
	public static int anInt6978;

	@OriginalMember(owner = "client!wm", name = "T", descriptor = "I")
	public static int anInt6977 = 0;

	@OriginalMember(owner = "client!wm", name = "W", descriptor = "Lclient!jm;")
	public static final Class105 aClass105_19 = new Class105("", 14);

	@OriginalMember(owner = "client!wm", name = "Y", descriptor = "[I")
	public static final int[] anIntArray515 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BI)V")
	public static void method6014(@OriginalArg(1) int arg0) {
		Static211.anInt4227 = arg0;
		@Pc(7) Class21 local7 = Static266.aClass21_141;
		synchronized (Static266.aClass21_141) {
			Static266.aClass21_141.method857();
		}
		local7 = Static362.aClass21_179;
		synchronized (Static362.aClass21_179) {
			Static362.aClass21_179.method857();
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZIII)Lclient!ih;")
	public static Class90 method6015(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class128[] local7 = null;
		@Pc(16) Class62 local16 = Static188.method3531(arg3);
		if (local16.anIntArray161 != null) {
			local7 = new Class128[local16.anIntArray161.length];
			for (@Pc(26) int local26 = 0; local26 < local7.length; local26++) {
				@Pc(35) Class68 local35 = Static174.method3400(local16.anIntArray161[local26]);
				local7[local26] = new Class128(local35.anInt2167, local35.anInt2170, local35.anInt2171, local35.anInt2169, local35.anInt2164, local35.anInt2165, local35.anInt2168, local35.aBoolean151);
			}
		}
		return new Class90(local16.anInt2056, local7, local16.anInt2058, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "()V")
	public static void method6017() {
		Static46.anInt1182 = 0;
		label187: for (@Pc(3) int local3 = 0; local3 < Static258.anInt1131; local3++) {
			@Pc(8) Class152 local8 = Static92.aClass152Array1[local3];
			@Pc(12) int local12;
			if (Static277.anIntArray419 != null) {
				for (local12 = 0; local12 < Static277.anIntArray419.length; local12++) {
					if (Static277.anIntArray419[local12] != -1000000 && (local8.anInt4475 <= Static277.anIntArray419[local12] || local8.anInt4471 <= Static277.anIntArray419[local12]) && (local8.anInt4466 <= Static226.anIntArray373[local12] || local8.anInt4480 <= Static226.anIntArray373[local12]) && (local8.anInt4466 >= Static41.anIntArray71[local12] || local8.anInt4480 >= Static41.anIntArray71[local12]) && (local8.anInt4468 <= Static306.anIntArray456[local12] || local8.anInt4464 <= Static306.anIntArray456[local12]) && (local8.anInt4468 >= Static359.anIntArray507[local12] || local8.anInt4464 >= Static359.anIntArray507[local12])) {
						continue label187;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(121) int local121;
			@Pc(153) int local153;
			@Pc(132) boolean local132;
			if (local8.anInt4479 == 1) {
				local12 = local8.anInt4481 + Static87.anInt1923 - Static79.anInt1760;
				if (local12 >= 0 && local12 <= Static87.anInt1923 + Static87.anInt1923) {
					local110 = local8.anInt4483 + Static87.anInt1923 - Static42.anInt1018;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt4463 + Static87.anInt1923 - Static42.anInt1018;
					if (local121 > Static87.anInt1923 + Static87.anInt1923) {
						local121 = Static87.anInt1923 + Static87.anInt1923;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static28.aBooleanArrayArray1[local12][local110++]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static134.anInt2901 - local8.anInt4466;
						if (local153 > Static66.anInt1545) {
							local8.anInt4476 = 1;
						} else {
							if (local153 >= -Static66.anInt1545) {
								continue;
							}
							local8.anInt4476 = 2;
							local153 = -local153;
						}
						local8.anInt4467 = (local8.anInt4468 - Static320.anInt4358 << 8) / local153;
						local8.anInt4478 = (local8.anInt4464 - Static320.anInt4358 << 8) / local153;
						local8.anInt4473 = (local8.anInt4475 - Static102.anInt6997 << 8) / local153;
						local8.anInt4482 = (local8.anInt4471 - Static102.anInt6997 << 8) / local153;
						Static195.aClass152Array2[Static46.anInt1182++] = local8;
					}
				}
			} else if (local8.anInt4479 == 2) {
				local12 = local8.anInt4483 + Static87.anInt1923 - Static42.anInt1018;
				if (local12 >= 0 && local12 <= Static87.anInt1923 + Static87.anInt1923) {
					local110 = local8.anInt4481 + Static87.anInt1923 - Static79.anInt1760;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt4470 + Static87.anInt1923 - Static79.anInt1760;
					if (local121 > Static87.anInt1923 + Static87.anInt1923) {
						local121 = Static87.anInt1923 + Static87.anInt1923;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static28.aBooleanArrayArray1[local110++][local12]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static320.anInt4358 - local8.anInt4468;
						if (local153 > Static66.anInt1545) {
							local8.anInt4476 = 3;
						} else {
							if (local153 >= -Static66.anInt1545) {
								continue;
							}
							local8.anInt4476 = 4;
							local153 = -local153;
						}
						local8.anInt4472 = (local8.anInt4466 - Static134.anInt2901 << 8) / local153;
						local8.anInt4465 = (local8.anInt4480 - Static134.anInt2901 << 8) / local153;
						local8.anInt4473 = (local8.anInt4475 - Static102.anInt6997 << 8) / local153;
						local8.anInt4482 = (local8.anInt4471 - Static102.anInt6997 << 8) / local153;
						Static195.aClass152Array2[Static46.anInt1182++] = local8;
					}
				}
			} else if (local8.anInt4479 == 4) {
				local12 = local8.anInt4475 - Static102.anInt6997;
				if (local12 > Static66.anInt1546) {
					local110 = local8.anInt4483 + Static87.anInt1923 - Static42.anInt1018;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt4463 + Static87.anInt1923 - Static42.anInt1018;
					if (local121 > Static87.anInt1923 + Static87.anInt1923) {
						local121 = Static87.anInt1923 + Static87.anInt1923;
					}
					if (local110 <= local121) {
						@Pc(405) int local405 = local8.anInt4481 + Static87.anInt1923 - Static79.anInt1760;
						if (local405 < 0) {
							local405 = 0;
						}
						local153 = local8.anInt4470 + Static87.anInt1923 - Static79.anInt1760;
						if (local153 > Static87.anInt1923 + Static87.anInt1923) {
							local153 = Static87.anInt1923 + Static87.anInt1923;
						}
						@Pc(427) boolean local427 = false;
						label159: for (@Pc(429) int local429 = local405; local429 <= local153; local429++) {
							for (@Pc(432) int local432 = local110; local432 <= local121; local432++) {
								if (Static28.aBooleanArrayArray1[local429][local432]) {
									local427 = true;
									break label159;
								}
							}
						}
						if (local427) {
							local8.anInt4476 = 5;
							local8.anInt4472 = (local8.anInt4466 - Static134.anInt2901 << 8) / local12;
							local8.anInt4465 = (local8.anInt4480 - Static134.anInt2901 << 8) / local12;
							local8.anInt4467 = (local8.anInt4468 - Static320.anInt4358 << 8) / local12;
							local8.anInt4478 = (local8.anInt4464 - Static320.anInt4358 << 8) / local12;
							Static195.aClass152Array2[Static46.anInt1182++] = local8;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IBI)Ljava/lang/String;")
	public static String method6018(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 - arg1;
		if (local15 < -9) {
			return "<col=ff0000>";
		} else if (local15 < -6) {
			return "<col=ff3000>";
		} else if (local15 < -3) {
			return "<col=ff7000>";
		} else if (local15 < 0) {
			return "<col=ffb000>";
		} else if (local15 > 9) {
			return "<col=00ff00>";
		} else if (local15 > 6) {
			return "<col=40ff00>";
		} else if (local15 > 3) {
			return "<col=80ff00>";
		} else if (local15 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(B)V")
	public static void method6019() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static26.aBooleanArray1[local3] = false;
		}
		Static133.anInt2876 = 0;
		Static50.anInt1273 = 5;
		Static31.anInt789 = 0;
		Static274.anInt5326 = Static294.anInt5665;
		Static27.anInt623 = Static51.anInt1301;
		Static47.anInt1199 = Static260.anInt5192;
		Static148.anInt3126 = Static14.anInt4971;
		Static33.anInt827 = Static320.anInt4362;
		Static7.anInt214 = -1;
		Static74.anInt1672 = Static272.anInt5295;
		Static2.anInt123 = -1;
	}
}
