import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "Lclient!lm;")
	public static Class134 aClass134_118;

	@OriginalMember(owner = "client!qp", name = "F", descriptor = "Lclient!ad;")
	public static Class5 aClass5_1;

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString198 = "RuneScape is loading - please wait...";

	@OriginalMember(owner = "client!qp", name = "w", descriptor = "Lclient!vk;")
	public static final Class207 aClass207_31 = new Class207(16);

	@OriginalMember(owner = "client!qp", name = "y", descriptor = "J")
	public static long aLong153 = 0L;

	@OriginalMember(owner = "client!qp", name = "E", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_82 = new Class37(20);

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)V")
	public static void method4491() {
		@Pc(7) Class108 local7 = null;
		try {
			@Pc(11) Class193 local11 = Static197.aClass215_5.method5655();
			while (local11.anInt5986 == 0) {
				Static163.method2863(1L);
			}
			if (local11.anInt5986 == 1) {
				local7 = (Class108) local11.anObject7;
				@Pc(36) Class1_Sub21 local36 = new Class1_Sub21(Static166.anInt3450 * 6 + 3);
				local36.method5718(1);
				local36.method5698(Static166.anInt3450);
				for (@Pc(46) int local46 = 0; local46 < Static35.anIntArray51.length; local46++) {
					if (Static254.aBooleanArray21[local46]) {
						local36.method5698(local46);
						local36.method5702(Static35.anIntArray51[local46]);
					}
				}
				local7.method2209(local36.aByteArray82, local36.anInt6611, 0);
			}
		} catch (@Pc(77) Exception local77) {
		}
		try {
			if (local7 != null) {
				local7.method2207();
			}
		} catch (@Pc(84) Exception local84) {
		}
		Static222.aLong137 = Static292.method5114();
		Static216.aBoolean367 = false;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILclient!dr;)I")
	public static int method4493(@OriginalArg(1) Class1_Sub12 arg0) {
		@Pc(7) String local7 = Static44.method910(arg0);
		@Pc(14) int[] local14 = null;
		if (Static186.method3282(arg0.anInt1409)) {
			local14 = Static348.method5333((int) arg0.aLong30).anIntArray251;
		} else if (Static332.method5557(arg0.anInt1409)) {
			@Pc(30) Class10_Sub1_Sub2_Sub1 local30 = Static178.aClass10_Sub1_Sub2_Sub1Array1[(int) arg0.aLong30];
			if (local30 != null) {
				local14 = local30.aClass60_1.anIntArray111;
			}
		} else if (Static41.method885(arg0.anInt1409)) {
			if (arg0.anInt1409 == 1008) {
				local14 = Static129.method2097((int) arg0.aLong30).anIntArray158;
			} else {
				local14 = Static129.method2097((int) (arg0.aLong30 >>> 32 & 0x7FFFFFFFL)).anIntArray158;
			}
		}
		if (local14 != null) {
			local7 = local7 + Static57.method1117(local14);
		}
		return Static81.aClass34_4.method792(Static67.aClass8Array4, local7);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!wd;B)[Lclient!vi;")
	public static Class206[] method4495(@OriginalArg(0) Class215 arg0) {
		if (!arg0.method5677()) {
			return new Class206[0];
		}
		@Pc(16) Class193 local16 = arg0.method5668();
		while (local16.anInt5986 == 0) {
			Static163.method2863(10L);
		}
		if (local16.anInt5986 == 2) {
			return new Class206[0];
		}
		@Pc(43) int[] local43 = (int[]) local16.anObject7;
		@Pc(49) Class206[] local49 = new Class206[local43.length >> 2];
		for (@Pc(51) int local51 = 0; local51 < local49.length; local51++) {
			@Pc(57) Class206 local57 = new Class206();
			local49[local51] = local57;
			local57.anInt6440 = local43[local51 << 2];
			local57.anInt6444 = local43[(local51 << 2) + 1];
			local57.anInt6441 = local43[(local51 << 2) + 2];
			local57.anInt6445 = local43[(local51 << 2) + 3];
		}
		return local49;
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V")
	public static void method4496() {
		@Pc(5) Class37 local5 = Static128.aClass37_56;
		synchronized (Static128.aClass37_56) {
			Static128.aClass37_56.method914();
		}
		local5 = Static53.aClass37_25;
		synchronized (Static53.aClass37_25) {
			Static53.aClass37_25.method914();
		}
		local5 = Static354.aClass37_112;
		synchronized (Static354.aClass37_112) {
			Static354.aClass37_112.method914();
		}
		local5 = Static79.aClass37_109;
		synchronized (Static79.aClass37_109) {
			Static79.aClass37_109.method914();
		}
	}

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "(I)V")
	public static void method4497() {
		Static323.aClass37_110.method919();
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "()V")
	public static void method4505() {
		Static327.anInt6424 = 0;
		label187: for (@Pc(3) int local3 = 0; local3 < Static274.anInt5613; local3++) {
			@Pc(8) Class46 local8 = Static82.aClass46Array2[local3];
			@Pc(12) int local12;
			if (Static342.anIntArray258 != null) {
				for (local12 = 0; local12 < Static342.anIntArray258.length; local12++) {
					if (Static342.anIntArray258[local12] != -1000000 && (local8.anInt1330 <= Static342.anIntArray258[local12] || local8.anInt1317 <= Static342.anIntArray258[local12]) && (local8.anInt1329 <= Static334.anIntArray654[local12] || local8.anInt1328 <= Static334.anIntArray654[local12]) && (local8.anInt1329 >= Static259.anIntArray508[local12] || local8.anInt1328 >= Static259.anIntArray508[local12]) && (local8.anInt1326 <= Static18.anIntArray17[local12] || local8.anInt1334 <= Static18.anIntArray17[local12]) && (local8.anInt1326 >= Static253.anIntArray487[local12] || local8.anInt1334 >= Static253.anIntArray487[local12])) {
						continue label187;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(121) int local121;
			@Pc(153) int local153;
			@Pc(132) boolean local132;
			if (local8.anInt1322 == 1) {
				local12 = local8.anInt1319 + Static131.anInt2605 - Static97.anInt1886;
				if (local12 >= 0 && local12 <= Static131.anInt2605 + Static131.anInt2605) {
					local110 = local8.anInt1331 + Static131.anInt2605 - Static349.anInt6708;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt1315 + Static131.anInt2605 - Static349.anInt6708;
					if (local121 > Static131.anInt2605 + Static131.anInt2605) {
						local121 = Static131.anInt2605 + Static131.anInt2605;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static50.aBooleanArrayArray1[local12][local110++]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static286.anInt5739 - local8.anInt1329;
						if (local153 > 32) {
							local8.anInt1324 = 1;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt1324 = 2;
							local153 = -local153;
						}
						local8.anInt1318 = (local8.anInt1326 - Static55.anInt1333 << 8) / local153;
						local8.anInt1335 = (local8.anInt1334 - Static55.anInt1333 << 8) / local153;
						local8.anInt1316 = (local8.anInt1330 - Static310.anInt6184 << 8) / local153;
						local8.anInt1314 = (local8.anInt1317 - Static310.anInt6184 << 8) / local153;
						Static42.aClass46Array1[Static327.anInt6424++] = local8;
					}
				}
			} else if (local8.anInt1322 == 2) {
				local12 = local8.anInt1331 + Static131.anInt2605 - Static349.anInt6708;
				if (local12 >= 0 && local12 <= Static131.anInt2605 + Static131.anInt2605) {
					local110 = local8.anInt1319 + Static131.anInt2605 - Static97.anInt1886;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt1325 + Static131.anInt2605 - Static97.anInt1886;
					if (local121 > Static131.anInt2605 + Static131.anInt2605) {
						local121 = Static131.anInt2605 + Static131.anInt2605;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static50.aBooleanArrayArray1[local110++][local12]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static55.anInt1333 - local8.anInt1326;
						if (local153 > 32) {
							local8.anInt1324 = 3;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt1324 = 4;
							local153 = -local153;
						}
						local8.anInt1327 = (local8.anInt1329 - Static286.anInt5739 << 8) / local153;
						local8.anInt1321 = (local8.anInt1328 - Static286.anInt5739 << 8) / local153;
						local8.anInt1316 = (local8.anInt1330 - Static310.anInt6184 << 8) / local153;
						local8.anInt1314 = (local8.anInt1317 - Static310.anInt6184 << 8) / local153;
						Static42.aClass46Array1[Static327.anInt6424++] = local8;
					}
				}
			} else if (local8.anInt1322 == 4) {
				local12 = local8.anInt1330 - Static310.anInt6184;
				if (local12 > 128) {
					local110 = local8.anInt1331 + Static131.anInt2605 - Static349.anInt6708;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt1315 + Static131.anInt2605 - Static349.anInt6708;
					if (local121 > Static131.anInt2605 + Static131.anInt2605) {
						local121 = Static131.anInt2605 + Static131.anInt2605;
					}
					if (local110 <= local121) {
						@Pc(403) int local403 = local8.anInt1319 + Static131.anInt2605 - Static97.anInt1886;
						if (local403 < 0) {
							local403 = 0;
						}
						local153 = local8.anInt1325 + Static131.anInt2605 - Static97.anInt1886;
						if (local153 > Static131.anInt2605 + Static131.anInt2605) {
							local153 = Static131.anInt2605 + Static131.anInt2605;
						}
						@Pc(425) boolean local425 = false;
						label159: for (@Pc(427) int local427 = local403; local427 <= local153; local427++) {
							for (@Pc(430) int local430 = local110; local430 <= local121; local430++) {
								if (Static50.aBooleanArrayArray1[local427][local430]) {
									local425 = true;
									break label159;
								}
							}
						}
						if (local425) {
							local8.anInt1324 = 5;
							local8.anInt1327 = (local8.anInt1329 - Static286.anInt5739 << 8) / local12;
							local8.anInt1321 = (local8.anInt1328 - Static286.anInt5739 << 8) / local12;
							local8.anInt1318 = (local8.anInt1326 - Static55.anInt1333 << 8) / local12;
							local8.anInt1335 = (local8.anInt1334 - Static55.anInt1333 << 8) / local12;
							Static42.aClass46Array1[Static327.anInt6424++] = local8;
						}
					}
				}
			}
		}
	}
}
