import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!wf", name = "Nc", descriptor = "[[B")
	public static byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!wf", name = "Wc", descriptor = "I")
	public static int anInt5628;

	@OriginalMember(owner = "client!wf", name = "Kc", descriptor = "I")
	public static int anInt5618 = 0;

	@OriginalMember(owner = "client!wf", name = "Rc", descriptor = "Lclient!hi;")
	public static Class66 aClass66_50 = null;

	@OriginalMember(owner = "client!wf", name = "ad", descriptor = "Z")
	public static boolean aBoolean379 = false;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIILclient!ld;I)V")
	public static void method4703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class99 arg2, @OriginalArg(4) int arg3) {
		if (Static110.anInt2281 >= 400) {
			return;
		}
		if (arg2.anIntArray255 != null) {
			arg2 = arg2.method2647();
		}
		if (arg2 == null || !arg2.aBoolean192) {
			return;
		}
		@Pc(35) String local35 = arg2.aString173;
		if (arg2.anInt3043 != 0) {
			@Pc(46) String local46 = Static118.anInt2486 == 1 ? Static279.aString295 : Static12.aString18;
			local35 = local35 + Static112.method2016(arg2.anInt3043, Static90.aClass15_Sub5_Sub2_2.anInt5625) + " (" + local46 + arg2.anInt3043 + ")";
		}
		if (Static306.anInt5423 == 1) {
			method4707(arg0, Static280.anInt5078, Static272.aString340 + " -> <col=ffff00>" + local35, Static35.aString222, (short) 15, (long) arg1, arg3);
		} else if (Static133.aBoolean168) {
			@Pc(344) Class1_Sub2_Sub17 local344 = Static277.anInt4994 == -1 ? null : Static30.method498(Static277.anInt4994);
			if ((Static102.anInt2065 & 0x2) != 0 && (local344 == null || arg2.method2653(local344.anInt4543, Static277.anInt4994) != local344.anInt4543)) {
				method4707(arg0, Static196.anInt3698, Static88.aString106 + " -> <col=ffff00>" + local35, Static148.aString164, (short) 4, (long) arg1, arg3);
			}
		} else {
			@Pc(108) String[] local108 = arg2.aStringArray22;
			if (Static225.aBoolean286) {
				local108 = Static143.method2466(local108);
			}
			@Pc(121) int local121;
			if (local108 != null) {
				for (local121 = 4; local121 >= 0; local121--) {
					if (local108[local121] != null && (Static118.anInt2486 != 0 || !local108[local121].equalsIgnoreCase(Static225.aString233))) {
						@Pc(142) byte local142 = 0;
						if (local121 == 0) {
							local142 = 49;
						}
						if (local121 == 1) {
							local142 = 25;
						}
						if (local121 == 2) {
							local142 = 13;
						}
						if (local121 == 3) {
							local142 = 36;
						}
						@Pc(169) int local169 = -1;
						if (local121 == arg2.anInt3041) {
							local169 = arg2.anInt3068;
						}
						if (local121 == arg2.anInt3078) {
							local169 = arg2.anInt3067;
						}
						if (local121 == 4) {
							local142 = 39;
						}
						method4707(arg0, local169, "<col=ffff00>" + local35, local108[local121], local142, (long) arg1, arg3);
					}
				}
			}
			if (Static118.anInt2486 == 0 && local108 != null) {
				for (local121 = 4; local121 >= 0; local121--) {
					if (local108[local121] != null && local108[local121].equalsIgnoreCase(Static225.aString233)) {
						@Pc(245) short local245 = 0;
						if (Static90.aClass15_Sub5_Sub2_2.anInt5625 < arg2.anInt3043) {
							local245 = 2000;
						}
						@Pc(255) short local255 = 0;
						if (local121 == 0) {
							local255 = 49;
						}
						if (local121 == 1) {
							local255 = 25;
						}
						if (local121 == 2) {
							local255 = 13;
						}
						if (local121 == 3) {
							local255 = 36;
						}
						if (local121 == 4) {
							local255 = 39;
						}
						if (local255 != 0) {
							local255 += local245;
						}
						method4707(arg0, arg2.anInt3054, "<col=ffff00>" + local35, local108[local121], local255, (long) arg1, arg3);
					}
				}
			}
			method4707(arg0, Static40.anInt5334, "<col=ffff00>" + local35, Static296.aString320, (short) 1004, (long) arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIILjava/lang/String;Ljava/lang/String;SJI)V")
	public static void method4707(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) short arg4, @OriginalArg(6) long arg5, @OriginalArg(7) int arg6) {
		if (Static249.aBoolean307 || Static110.anInt2281 >= 500) {
			return;
		}
		Static164.aStringArray25[Static110.anInt2281] = arg3;
		Static73.aStringArray6[Static110.anInt2281] = arg2;
		Static21.anIntArray19[Static110.anInt2281] = arg1 == -1 ? Static41.anInt850 : arg1;
		Static17.aShortArray2[Static110.anInt2281] = arg4;
		Static32.aLongArray8[Static110.anInt2281] = arg5;
		Static85.anIntArray147[Static110.anInt2281] = arg0;
		Static252.anIntArray400[Static110.anInt2281] = arg6;
		Static110.anInt2281++;
	}

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "(I)V")
	public static void method4708() {
		Static28.anInt497 = -1;
		Static15.aClass1_Sub2_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(IIIII)V")
	public static void method4709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		if (arg2 < arg3) {
			for (local6 = arg2; local6 < arg3; local6++) {
				Static183.anIntArrayArray26[local6][arg0] = arg1;
			}
		} else {
			for (local6 = arg3; local6 < arg2; local6++) {
				Static183.anIntArrayArray26[local6][arg0] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIZII)V")
	public static void method4711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = arg3;
		@Pc(21) int local21 = -arg3;
		@Pc(23) int local23 = -1;
		@Pc(31) int local31 = Static226.method3512(arg3 + arg0, Static29.anInt517, Static11.anInt170);
		@Pc(40) int local40 = Static226.method3512(arg0 - arg3, Static29.anInt517, Static11.anInt170);
		Static273.method4257(local40, Static183.anIntArrayArray26[arg1], arg2, local31);
		while (local16 < local18) {
			local23 += 2;
			local21 += local23;
			@Pc(71) int local71;
			@Pc(67) int local67;
			@Pc(99) int local99;
			@Pc(108) int local108;
			if (local21 > 0) {
				local18--;
				local67 = arg1 + local18;
				local71 = arg1 - local18;
				local21 -= local18 << 1;
				if (Static98.anInt2007 <= local67 && Static213.anInt4452 >= local71) {
					local99 = Static226.method3512(local16 + arg0, Static29.anInt517, Static11.anInt170);
					local108 = Static226.method3512(arg0 - local16, Static29.anInt517, Static11.anInt170);
					if (Static213.anInt4452 >= local67) {
						Static273.method4257(local108, Static183.anIntArrayArray26[local67], arg2, local99);
					}
					if (local71 >= Static98.anInt2007) {
						Static273.method4257(local108, Static183.anIntArrayArray26[local71], arg2, local99);
					}
				}
			}
			local16++;
			local71 = arg1 - local16;
			local67 = local16 + arg1;
			if (local67 >= Static98.anInt2007 && Static213.anInt4452 >= local71) {
				local99 = Static226.method3512(local18 + arg0, Static29.anInt517, Static11.anInt170);
				local108 = Static226.method3512(arg0 - local18, Static29.anInt517, Static11.anInt170);
				if (local67 <= Static213.anInt4452) {
					Static273.method4257(local108, Static183.anIntArrayArray26[local67], arg2, local99);
				}
				if (local71 >= Static98.anInt2007) {
					Static273.method4257(local108, Static183.anIntArrayArray26[local71], arg2, local99);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(IZ)I")
	public static int method4713(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAA) >>> 1);
		@Pc(31) int local31 = (local13 >>> 2 & 0xB3333333) + (local13 & 0x33333333);
		@Pc(39) int local39 = local31 + (local31 >>> 4) & 0xF0F0F0F;
		@Pc(45) int local45 = local39 + (local39 >>> 8);
		@Pc(51) int local51 = local45 + (local45 >>> 16);
		return local51 & 0xFF;
	}
}
