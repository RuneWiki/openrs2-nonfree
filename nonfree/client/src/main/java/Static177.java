import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!lc", name = "F", descriptor = "Lclient!ct;")
	public static Class30 aClass30_56;

	@OriginalMember(owner = "client!lc", name = "G", descriptor = "Z")
	public static boolean aBoolean275;

	@OriginalMember(owner = "client!lc", name = "t", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_125 = new Class217(47, -1);

	@OriginalMember(owner = "client!lc", name = "x", descriptor = "[B")
	public static final byte[] aByteArray70 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!lc", name = "D", descriptor = "Lclient!tg;")
	public static final Class195 aClass195_6 = new Class195();

	@OriginalMember(owner = "client!lc", name = "E", descriptor = "I")
	public static final int anInt3690 = 1400;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
	public static void method3440() {
		if (Static332.aFloat62 < 1024.0F) {
			Static332.aFloat62 = 1024.0F;
		}
		while (Static357.aFloat76 >= 16384.0F) {
			Static357.aFloat76 -= 16384.0F;
		}
		if (Static332.aFloat62 > 3072.0F) {
			Static332.aFloat62 = 3072.0F;
		}
		while (Static357.aFloat76 < 0.0F) {
			Static357.aFloat76 += 16384.0F;
		}
		@Pc(41) int local41 = Static98.anInt2254 >> 7;
		@Pc(45) int local45 = Static53.anInt1374 >> 7;
		@Pc(56) int local56 = Static8.method288(Static284.anInt6477, Static98.anInt2254, Static53.anInt1374);
		@Pc(58) int local58 = 0;
		@Pc(74) int local74;
		if (local41 > 3 && local45 > 3 && local41 < 100 && local45 < 100) {
			for (local74 = local41 - 4; local74 <= local41 + 4; local74++) {
				for (@Pc(80) int local80 = local45 - 4; local80 <= local45 + 4; local80++) {
					@Pc(84) int local84 = Static284.anInt6477;
					if (local84 < 3 && Static137.method2772(local80, local74)) {
						local84++;
					}
					@Pc(95) int local95 = 0;
					if (Static243.aByteArrayArrayArray6 != null && Static243.aByteArrayArrayArray6[local84] != null) {
						local95 = (Static243.aByteArrayArrayArray6[local84][local74][local80] & 0xFF) * 8;
					}
					@Pc(126) int local126 = local56 + local95 - Static258.aClass36Array2[local84].method4431(local74, local80);
					if (local126 > local58) {
						local58 = local126;
					}
				}
			}
		}
		local74 = local58 * 1536;
		if (local74 > 786432) {
			local74 = 786432;
		}
		if (local74 < 262144) {
			local74 = 262144;
		}
		if (local74 > Static109.anInt2439) {
			Static109.anInt2439 += (local74 - Static109.anInt2439) / 24;
		} else if (Static109.anInt2439 > local74) {
			Static109.anInt2439 += (local74 - Static109.anInt2439) / 80;
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	public static void method3441() {
		Static143.aClass38_12.method1466();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
	public static void method3442(@OriginalArg(1) int arg0) {
		if (Static360.anIntArray510 == null || Static360.anIntArray510.length < arg0) {
			Static360.anIntArray510 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
	public static void method3443() {
		@Pc(5) Class21 local5 = Static14.aClass21_133;
		synchronized (Static14.aClass21_133) {
			Static14.aClass21_133.method851();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILclient!at;Lclient!gt;)V")
	public static void method3447(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1, @OriginalArg(3) Class75 arg2) {
		@Pc(14) Class1_Sub21 local14 = new Class1_Sub21();
		local14.anInt2768 = arg1.method2132();
		local14.anInt2769 = arg1.method2140();
		local14.anIntArray205 = new int[local14.anInt2768];
		local14.aClass121Array1 = new Class121[local14.anInt2768];
		local14.anIntArray206 = new int[local14.anInt2768];
		local14.aClass121Array2 = new Class121[local14.anInt2768];
		local14.aByteArrayArrayArray2 = new byte[local14.anInt2768][][];
		local14.anIntArray204 = new int[local14.anInt2768];
		for (@Pc(58) int local58 = 0; local58 < local14.anInt2768; local58++) {
			try {
				@Pc(64) int local64 = arg1.method2132();
				@Pc(79) String local79;
				@Pc(83) String local83;
				@Pc(85) int local85;
				if (local64 == 0 || local64 == 1 || local64 == 2) {
					local79 = arg1.method2109();
					local83 = arg1.method2109();
					local85 = 0;
					if (local64 == 1) {
						local85 = arg1.method2140();
					}
					local14.anIntArray204[local58] = local64;
					local14.anIntArray206[local58] = local85;
					local14.aClass121Array2[local58] = arg2.method2373(local83, Static296.method5172(local79));
				} else if (local64 == 3 || local64 == 4) {
					local79 = arg1.method2109();
					local83 = arg1.method2109();
					local85 = arg1.method2132();
					@Pc(142) String[] local142 = new String[local85];
					for (@Pc(144) int local144 = 0; local144 < local85; local144++) {
						local142[local144] = arg1.method2109();
					}
					@Pc(163) byte[][] local163 = new byte[local85][];
					@Pc(174) int local174;
					if (local64 == 3) {
						for (@Pc(168) int local168 = 0; local168 < local85; local168++) {
							local174 = arg1.method2140();
							local163[local168] = new byte[local174];
							arg1.method2104(local174, local163[local168]);
						}
					}
					local14.anIntArray204[local58] = local64;
					@Pc(205) Class[] local205 = new Class[local85];
					for (local174 = 0; local174 < local85; local174++) {
						local205[local174] = Static296.method5172(local142[local174]);
					}
					local14.aClass121Array1[local58] = arg2.method2368(local83, local205, Static296.method5172(local79));
					local14.aByteArrayArrayArray2[local58] = local163;
				}
			} catch (@Pc(246) ClassNotFoundException local246) {
				local14.anIntArray205[local58] = -1;
			} catch (@Pc(253) SecurityException local253) {
				local14.anIntArray205[local58] = -2;
			} catch (@Pc(260) NullPointerException local260) {
				local14.anIntArray205[local58] = -3;
			} catch (@Pc(267) Exception local267) {
				local14.anIntArray205[local58] = -4;
			} catch (@Pc(274) Throwable local274) {
				local14.anIntArray205[local58] = -5;
			}
		}
		Static38.aClass42_2.method1549(local14);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIII)V")
	public static void method3448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= Static93.anInt5014 && arg0 <= Static122.anInt1360) {
			@Pc(24) int local24 = Static11.method912(arg3, Static38.anInt945, Static131.anInt2843);
			@Pc(30) int local30 = Static11.method912(arg2, Static38.anInt945, Static131.anInt2843);
			Static313.method5412(arg1, local30, arg0, local24);
		}
	}
}
