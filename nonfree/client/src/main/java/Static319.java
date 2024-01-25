import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!lu", name = "j", descriptor = "I")
	public static int anInt5940 = 0;

	@OriginalMember(owner = "client!lu", name = "k", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_157 = new Class363(24, 3);

	@OriginalMember(owner = "client!lu", name = "l", descriptor = "[Lclient!wa;")
	public static final Class2_Sub3_Sub19[] aClass2_Sub3_Sub19Array4 = new Class2_Sub3_Sub19[14];

	@OriginalMember(owner = "client!lu", name = "A", descriptor = "I")
	public static int anInt5951 = 0;

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(II[BBILjava/lang/String;)I")
	public static int method4945(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3) {
		@Pc(9) int local9 = arg0;
		for (@Pc(16) int local16 = 0; local16 < local9; local16++) {
			@Pc(24) char local24 = arg3.charAt(local16);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				arg1[local16 + arg2] = (byte) local24;
			} else if (local24 == '€') {
				arg1[arg2 + local16] = -128;
			} else if (local24 == '‚') {
				arg1[arg2 + local16] = -126;
			} else if (local24 == 'ƒ') {
				arg1[arg2 + local16] = -125;
			} else if (local24 == '„') {
				arg1[arg2 + local16] = -124;
			} else if (local24 == '…') {
				arg1[arg2 + local16] = -123;
			} else if (local24 == '†') {
				arg1[local16 + arg2] = -122;
			} else if (local24 == '‡') {
				arg1[local16 + arg2] = -121;
			} else if (local24 == 'ˆ') {
				arg1[arg2 + local16] = -120;
			} else if (local24 == '‰') {
				arg1[local16 + arg2] = -119;
			} else if (local24 == 'Š') {
				arg1[local16 + arg2] = -118;
			} else if (local24 == '‹') {
				arg1[local16 + arg2] = -117;
			} else if (local24 == 'Œ') {
				arg1[local16 + arg2] = -116;
			} else if (local24 == 'Ž') {
				arg1[arg2 + local16] = -114;
			} else if (local24 == '‘') {
				arg1[arg2 + local16] = -111;
			} else if (local24 == '’') {
				arg1[local16 + arg2] = -110;
			} else if (local24 == '“') {
				arg1[local16 + arg2] = -109;
			} else if (local24 == '”') {
				arg1[arg2 + local16] = -108;
			} else if (local24 == '•') {
				arg1[arg2 + local16] = -107;
			} else if (local24 == '–') {
				arg1[local16 + arg2] = -106;
			} else if (local24 == '—') {
				arg1[arg2 + local16] = -105;
			} else if (local24 == '˜') {
				arg1[local16 + arg2] = -104;
			} else if (local24 == '™') {
				arg1[arg2 + local16] = -103;
			} else if (local24 == 'š') {
				arg1[local16 + arg2] = -102;
			} else if (local24 == '›') {
				arg1[arg2 + local16] = -101;
			} else if (local24 == 'œ') {
				arg1[local16 + arg2] = -100;
			} else if (local24 == 'ž') {
				arg1[arg2 + local16] = -98;
			} else if (local24 == 'Ÿ') {
				arg1[local16 + arg2] = -97;
			} else {
				arg1[local16 + arg2] = 63;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILclient!r;)V")
	public static void method4946(@OriginalArg(0) int arg0, @OriginalArg(2) Class100 arg1) {
		if (!Static225.aBoolean343) {
			Static35.anInt907 = 0;
			return;
		}
		if (Static418.aBoolean558) {
			Static116.aLong74 = Static580.aClass241_1.method7166();
		}
		Static237.anInt8062 = 0;
		Static301.anInt5412 = 0;
		Static347.anInt6253 = 0;
		@Pc(25) int[] local25 = arg1.v();
		Static51.anInt1261 = (int) ((float) local25[2] / 3.0F);
		Static47.anInt1133 = (int) ((float) local25[3] / 3.0F);
		arg1.method6211(Static228.anIntArray271);
		if (Static98.anInt2032 != (int) ((float) Static228.anIntArray271[0] / 3.0F) || Static499.anInt8381 != (int) ((float) Static228.anIntArray271[1] / 3.0F)) {
			Static499.anInt8381 = (int) ((float) Static228.anIntArray271[1] / 3.0F);
			Static98.anInt2032 = (int) ((float) Static228.anIntArray271[0] / 3.0F);
			Static101.anInt2055 = Static499.anInt8381 >> 1;
			Static266.anIntArray333 = new int[Static98.anInt2032 * Static499.anInt8381];
			Static230.anInt4316 = Static98.anInt2032 >> 1;
		}
		Static434.aClass68_3 = arg1.method6235();
		Static35.anInt907 = 0;
		for (@Pc(110) int local110 = 0; local110 < Static56.anInt1297; local110++) {
			Static457.method6486(arg0, arg1, Static538.aClass148Array4[local110]);
		}
		for (@Pc(129) int local129 = 0; local129 < Static572.anInt9312; local129++) {
			Static457.method6486(arg0, arg1, Static374.aClass148Array3[local129]);
		}
		for (@Pc(144) int local144 = 0; local144 < Static493.anInt8313; local144++) {
			Static457.method6486(arg0, arg1, Static322.aClass148Array2[local144]);
		}
		Static228.anInt4256 = 0;
		if (Static35.anInt907 > 0) {
			@Pc(171) int local171 = Static266.anIntArray333.length;
			@Pc(178) int local178 = local171 - local171 & 0x7;
			@Pc(180) int local180 = 0;
			while (local178 > local180) {
				Static266.anIntArray333[local180++] = Integer.MAX_VALUE;
				Static266.anIntArray333[local180++] = Integer.MAX_VALUE;
				Static266.anIntArray333[local180++] = Integer.MAX_VALUE;
				Static266.anIntArray333[local180++] = Integer.MAX_VALUE;
				Static266.anIntArray333[local180++] = Integer.MAX_VALUE;
				Static266.anIntArray333[local180++] = Integer.MAX_VALUE;
				Static266.anIntArray333[local180++] = Integer.MAX_VALUE;
				Static266.anIntArray333[local180++] = Integer.MAX_VALUE;
			}
			while (local171 > local180) {
				Static266.anIntArray333[local180++] = Integer.MAX_VALUE;
			}
			Static367.anInt6528 = 1;
			for (@Pc(243) int local243 = 0; local243 < Static35.anInt907; local243++) {
				@Pc(249) Class148 local249 = Static259.aClass148Array1[local243];
				Static517.method7145(local249.aShortArray59[0], local249.aShortArray58[3], local249.aShortArray59[1], local249.aShortArray60[3], local249.aShortArray60[1], local249.aShortArray59[3], local249.aShortArray58[0], local249.aShortArray58[1], local249.aShortArray60[0]);
				Static517.method7145(local249.aShortArray59[1], local249.aShortArray58[3], local249.aShortArray59[2], local249.aShortArray60[3], local249.aShortArray60[2], local249.aShortArray59[3], local249.aShortArray58[1], local249.aShortArray58[2], local249.aShortArray60[1]);
			}
			Static367.anInt6528 = 2;
		}
		if (Static418.aBoolean558) {
			Static277.aLong128 = Static580.aClass241_1.method7166() - Static116.aLong74;
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIIIZ)V")
	public static void method4947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg3 < 1) {
			arg3 = 1;
		}
		if (arg0 < 1) {
			arg0 = 1;
		}
		@Pc(19) int local19 = arg0 - 334;
		if (local19 < 0) {
			local19 = 0;
		} else if (local19 > 100) {
			local19 = 100;
		}
		@Pc(41) int local41 = Static219.aShort44 + local19 * (Static271.aShort56 - Static219.aShort44) / 100;
		if (Static39.aShort19 > local41) {
			local41 = Static39.aShort19;
		} else if (local41 > Static378.aShort77) {
			local41 = Static378.aShort77;
		}
		@Pc(71) int local71 = arg0 * local41 * 512 / (arg3 * 334);
		@Pc(109) int local109;
		@Pc(116) int local116;
		@Pc(84) short local84;
		if (local71 < Static379.aShort78) {
			local84 = Static379.aShort78;
			local41 = arg3 * local84 * 334 / (arg0 * 512);
			if (Static378.aShort77 < local41) {
				local41 = Static378.aShort77;
				local109 = local41 * 512 * arg0 / (local84 * 334);
				local116 = (arg3 - local109) / 2;
				if (arg4) {
					Static307.aClass100_6.JA();
					Static307.aClass100_6.method6261(-16777216, arg1, arg2, arg0, local116);
					Static307.aClass100_6.method6261(-16777216, arg3 + arg1 - local116, arg2, arg0, local116);
				}
				arg1 += local116;
				arg3 -= local116 * 2;
			}
		} else if (local71 > Static201.aShort37) {
			local84 = Static201.aShort37;
			local41 = arg3 * 334 * local84 / (arg0 * 512);
			if (local41 < Static39.aShort19) {
				local41 = Static39.aShort19;
				local109 = arg3 * local84 * 334 / (local41 * 512);
				local116 = (arg0 - local109) / 2;
				if (arg4) {
					Static307.aClass100_6.JA();
					Static307.aClass100_6.method6261(-16777216, arg1, arg2, local116, arg3);
					Static307.aClass100_6.method6261(-16777216, arg1, arg2 + arg0 - local116, local116, arg3);
				}
				arg0 -= local116 * 2;
				arg2 += local116;
			}
		}
		Static430.anInt7301 = (short) arg3;
		Static157.anInt3157 = arg0 * local41 / 334;
		Static133.anInt2820 = arg2;
		Static78.anInt9031 = arg1;
		Static568.anInt9290 = (short) arg0;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIILclient!vda;)J")
	public static long method4948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface24 arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = Long.MIN_VALUE;
		@Pc(14) Class32 local14 = Static541.aClass97_4.method1794(arg2.method7337());
		@Pc(35) long local35 = (long) (arg2.method7336() << 14 | arg1 | arg0 << 7 | arg2.method7340() << 20 | 0x40000000);
		if (local14.anInt807 == 0) {
			local35 |= local7;
		}
		if (local14.anInt775 == 1) {
			local35 |= local5;
		}
		return local35 | (long) arg2.method7337() << 32;
	}
}
