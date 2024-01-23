import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!si", name = "b", descriptor = "Lclient!df;")
	public static Class27 aClass27_9;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "I")
	public static int anInt4302 = 0;

	@OriginalMember(owner = "client!si", name = "c", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1123 = Static231.method3737("");

	@OriginalMember(owner = "client!si", name = "h", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1124 = aClass107_1123;

	@OriginalMember(owner = "client!si", name = "j", descriptor = "Z")
	public static boolean aBoolean380 = false;

	@OriginalMember(owner = "client!si", name = "l", descriptor = "[I")
	public static int[] anIntArray351 = new int[200];

	@OriginalMember(owner = "client!si", name = "n", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1125 = Static231.method3737(")4");

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!sc;)Z")
	public static boolean method3168(@OriginalArg(1) Class107 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static174.anInt3793; local16++) {
			if (arg0.method3096(Static16.aClass107Array1[local16])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IBI)I")
	public static int method3169(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local15 *= arg1;
			}
			arg1 *= arg1;
			arg0 >>= 0x1;
		}
		if (arg0 == 1) {
			return arg1 * local15;
		} else {
			return local15;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)V")
	public static void method3170(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub2_Sub2_Sub1 local13;
		if (Static218.aClass1_Sub2_Sub2_98 == null) {
			local13 = new Class1_Sub2_Sub2_Sub1(512, 512);
		} else {
			local13 = (Class1_Sub2_Sub2_Sub1) Static218.aClass1_Sub2_Sub2_98;
		}
		@Pc(21) int[] local21 = local13.anIntArray13;
		@Pc(24) int local24 = local21.length;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			local21[local26] = 1;
		}
		@Pc(51) int local51;
		@Pc(53) int local53;
		for (@Pc(38) int local38 = 1; local38 < 103; local38++) {
			local51 = (52736 - local38 * 512) * 4 + 24628;
			for (local53 = 1; local53 < 103; local53++) {
				if ((Static221.aByteArrayArrayArray14[arg0][local53][local38] & 0x18) == 0) {
					Static191.method3120(local21, local51, arg0, local53, local38);
				}
				if (arg0 < 3 && (Static221.aByteArrayArrayArray14[arg0 + 1][local53][local38] & 0x8) != 0) {
					Static191.method3120(local21, local51, arg0 + 1, local53, local38);
				}
				local51 += 4;
			}
		}
		local51 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 238 - 10;
		local13.method200();
		local53 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(168) int local168;
		for (@Pc(164) int local164 = 1; local164 < 103; local164++) {
			for (local168 = 1; local168 < 103; local168++) {
				if ((Static221.aByteArrayArrayArray14[arg0][local168][local164] & 0x18) == 0) {
					Static55.method1110(local164, arg0, local53, local168, local51);
				}
				if (arg0 < 3 && (Static221.aByteArrayArrayArray14[arg0 + 1][local168][local164] & 0x8) != 0) {
					Static55.method1110(local164, arg0 + 1, local53, local168, local51);
				}
			}
		}
		Static86.anInt1908 = 0;
		for (local168 = 0; local168 < 104; local168++) {
			for (@Pc(232) int local232 = 0; local232 < 104; local232++) {
				@Pc(239) long local239 = Static59.method1131(Static191.anInt4237, local168, local232);
				if (local239 != 0L) {
					@Pc(254) Class101 local254 = Static170.method2725(Integer.MAX_VALUE & (int) (local239 >>> 32));
					@Pc(257) int local257 = local254.anInt3917;
					@Pc(262) int local262;
					if (local254.anIntArray338 != null) {
						for (local262 = 0; local262 < local254.anIntArray338.length; local262++) {
							if (local254.anIntArray338[local262] != -1) {
								@Pc(277) Class101 local277 = Static170.method2725(local254.anIntArray338[local262]);
								if (local277.anInt3917 >= 0) {
									local257 = local277.anInt3917;
									break;
								}
							}
						}
					}
					if (local257 >= 0) {
						local262 = local168;
						@Pc(307) int local307 = local232;
						if (local257 != 22 && local257 != 29 && local257 != 34 && local257 != 36 && local257 != 46 && local257 != 47 && local257 != 48) {
							@Pc(337) int[][] local337 = Static107.aClass60Array1[Static191.anInt4237].anIntArrayArray24;
							for (@Pc(339) int local339 = 0; local339 < 10; local339++) {
								@Pc(346) int local346 = (int) (Math.random() * 4.0D);
								if (local346 == 0 && local262 > 0 && local168 - 3 < local262 && (local337[local262 - 1][local307] & 0x12C0108) == 0) {
									local262--;
								}
								if (local346 == 1 && local262 < 103 && local168 + 3 > local262 && (local337[local262 + 1][local307] & 0x12C0180) == 0) {
									local262++;
								}
								if (local346 == 2 && local307 > 0 && local232 - 3 < local307 && (local337[local262][local307 - 1] & 0x12C0102) == 0) {
									local307--;
								}
								if (local346 == 3 && local307 < 103 && local307 < local232 + 3 && (local337[local262][local307 + 1] & 0x12C0120) == 0) {
									local307++;
								}
							}
						}
						Static125.anIntArray243[Static86.anInt1908] = local254.anInt3903;
						Static73.anIntArray154[Static86.anInt1908] = local262;
						Static8.anIntArray19[Static86.anInt1908] = local307;
						Static86.anInt1908++;
					}
				}
			}
		}
		Static218.aClass1_Sub2_Sub2_98 = local13;
		Static42.aClass23_1.method2204();
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(III)V")
	public static void method3171() {
		for (@Pc(1) int local1 = 0; local1 < Static11.anInt296; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static159.anInt3497; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static213.anInt4593; local7++) {
					@Pc(16) Class1_Sub9 local16 = Static174.aClass1_Sub9ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class97 local21 = local16.aClass97_1;
						if (local21 != null && local21.aClass5_8.method2302()) {
							Static44.method864(local21.aClass5_8, local1, local4, local7, 1, 1);
							if (local21.aClass5_9 != null && local21.aClass5_9.method2302()) {
								Static44.method864(local21.aClass5_9, local1, local4, local7, 1, 1);
								local21.aClass5_8.method2296(local21.aClass5_9, 0, 0, 0, false);
								local21.aClass5_9 = local21.aClass5_9.method2292();
							}
							local21.aClass5_8 = local21.aClass5_8.method2292();
						}
						for (@Pc(77) int local77 = 0; local77 < local16.anInt1416; local77++) {
							@Pc(83) Class99 local83 = local16.aClass99Array2[local77];
							if (local83 != null && local83.aClass5_10.method2302()) {
								Static44.method864(local83.aClass5_10, local1, local4, local7, local83.anInt3807 + 1 - local83.anInt3819, local83.anInt3811 - local83.anInt3808 + 1);
								local83.aClass5_10 = local83.aClass5_10.method2292();
							}
						}
						@Pc(125) Class40 local125 = local16.aClass40_1;
						if (local125 != null && local125.aClass5_1.method2302()) {
							Static185.method3684(local125.aClass5_1, local1, local4, local7);
							local125.aClass5_1 = local125.aClass5_1.method2292();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)Lclient!wb;")
	public static Class1_Sub2_Sub19 method3172() {
		@Pc(15) Class1_Sub2_Sub19 local15 = (Class1_Sub2_Sub19) Static100.aClass85_3.method2425();
		if (local15 != null) {
			local15.method3735();
			local15.method3682();
			return local15;
		}
		do {
			local15 = (Class1_Sub2_Sub19) Static171.aClass85_5.method2425();
			if (local15 == null) {
				return null;
			}
			if (local15.method3688() > Static209.method3309()) {
				return null;
			}
			local15.method3735();
			local15.method3682();
		} while ((local15.aLong174 & Long.MIN_VALUE) == 0L);
		return local15;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)I")
	public static int method3174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!jb;Lclient!jb;Lclient!jb;B)V")
	public static void method3175(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) Class28 arg2) {
		Static54.aClass28_24 = arg2;
		Static212.aClass28_73 = arg1;
		Static191.aClass28_66 = arg0;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(JIIILclient!sc;II)V")
	public static void method3176(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class107 arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class1_Sub26 local8 = new Class1_Sub26(128);
		local8.method2967(10);
		local8.method2963((int) (Math.random() * 99999.0D));
		local8.method2963(507);
		local8.method2940(arg0);
		local8.method2973((int) (Math.random() * 9.9999999E7D));
		local8.method2979(arg4);
		local8.method2973((int) (Math.random() * 9.9999999E7D));
		local8.method2963(Static156.anInt3410);
		local8.method2967(arg5);
		local8.method2967(arg1);
		local8.method2973((int) (Math.random() * 9.9999999E7D));
		local8.method2963(arg3);
		local8.method2963(arg2);
		local8.method2973((int) (Math.random() * 9.9999999E7D));
		local8.method2991(Static148.aBigInteger3, Static179.aBigInteger4);
		Static193.aClass1_Sub26_Sub1_2.anInt4021 = 0;
		Static193.aClass1_Sub26_Sub1_2.method2967(114);
		Static193.aClass1_Sub26_Sub1_2.method2967(local8.anInt4021);
		Static193.aClass1_Sub26_Sub1_2.method2993(local8.anInt4021, local8.aByteArray52);
		Static122.anInt2676 = 1;
		Static100.anInt2168 = 0;
		Static143.anInt3140 = -3;
		Static59.anInt1428 = 0;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V")
	public static void method3177() {
		Static120.aClass61_50.method1689();
	}
}
