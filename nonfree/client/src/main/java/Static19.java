import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!be", name = "eb", descriptor = "I")
	public static int anInt681;

	@OriginalMember(owner = "client!be", name = "O", descriptor = "Z")
	public static boolean aBoolean36 = true;

	@OriginalMember(owner = "client!be", name = "bb", descriptor = "Z")
	public static boolean aBoolean37 = true;

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(II)Z")
	public static boolean method358(@OriginalArg(0) int arg0) {
		return arg0 == (arg0 & -arg0);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZLclient!ai;)V")
	public static void method359(@OriginalArg(1) Class9_Sub1_Sub1 arg0) {
		@Pc(15) Class1_Sub28 local15 = (Class1_Sub28) Static32.aClass140_1.method4014(Static93.method2008(arg0.aString12));
		if (local15 == null) {
			Static117.method2319(null, 0, arg0.anIntArray43[0], Static137.anInt3321, arg0.anIntArray41[0], arg0, null);
		} else {
			local15.method3671();
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!hc;B)V")
	public static void method360(@OriginalArg(0) Class51 arg0) {
		Static129.anInt3260 = arg0.method1866("runes");
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIII)V")
	public static void method362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18;
		if (arg3 < arg1) {
			for (local18 = arg3; local18 < arg1; local18++) {
				Static29.anIntArrayArray10[local18][arg0] = arg2;
			}
		} else {
			for (local18 = arg1; local18 < arg3; local18++) {
				Static29.anIntArrayArray10[local18][arg0] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(II)Z")
	public static boolean method363(@OriginalArg(1) int arg0) {
		@Pc(35) int local35;
		@Pc(37) int local37;
		@Pc(55) int local55;
		if (Static148.aClass1_Sub2_Sub4_Sub1_4 == null) {
			if (Static125.aClass1_Sub2_Sub4_4 == null) {
				Static148.aClass1_Sub2_Sub4_Sub1_4 = new Class1_Sub2_Sub4_Sub1(512, 512);
			} else {
				Static148.aClass1_Sub2_Sub4_Sub1_4 = (Class1_Sub2_Sub4_Sub1) Static125.aClass1_Sub2_Sub4_4;
			}
			@Pc(32) int[] local32 = Static148.aClass1_Sub2_Sub4_Sub1_4.anIntArray94;
			local35 = local32.length;
			for (local37 = 0; local37 < local35; local37++) {
				local32[local37] = 1;
			}
			@Pc(68) int local68;
			@Pc(72) int local72;
			for (local55 = 1; local55 < 103; local55++) {
				local68 = (103 - local55) * 2048 + 24628;
				for (local72 = 1; local72 < 103; local72++) {
					if ((Static145.aByteArrayArrayArray13[arg0][local72][local55] & 0x18) == 0) {
						Static237.method3929(local32, local68, arg0, local72, local55);
					}
					if (arg0 < 3 && (Static145.aByteArrayArrayArray13[arg0 + 1][local72][local55] & 0x8) != 0) {
						Static237.method3929(local32, local68, arg0 + 1, local72, local55);
					}
					local68 += 4;
				}
			}
			Static180.anInt4139 = 0;
			for (local68 = 0; local68 < 104; local68++) {
				for (local72 = 0; local72 < 104; local72++) {
					@Pc(164) long local164 = Static201.method3337(Static137.anInt3321, local68 + 0, local72);
					if (local164 != 0L) {
						@Pc(179) Class31 local179 = Static77.method1518((int) (local164 >>> 32) & Integer.MAX_VALUE);
						@Pc(182) int local182 = local179.anInt1338;
						@Pc(187) int local187;
						if (local179.anIntArray100 != null) {
							for (local187 = 0; local187 < local179.anIntArray100.length; local187++) {
								if (local179.anIntArray100[local187] != -1) {
									@Pc(205) Class31 local205 = Static77.method1518(local179.anIntArray100[local187]);
									if (local205.anInt1338 >= 0) {
										local182 = local205.anInt1338;
										break;
									}
								}
							}
						}
						if (local182 >= 0) {
							local187 = local68;
							@Pc(234) int local234 = local72;
							if (local182 != 22 && local182 != 29 && local182 != 34 && local182 != 36 && local182 != 46 && local182 != 47 && local182 != 48) {
								@Pc(270) int[][] local270 = Static47.aClass65Array1[Static137.anInt3321].anIntArrayArray19;
								for (@Pc(272) int local272 = 0; local272 < 10; local272++) {
									@Pc(279) int local279 = (int) (Math.random() * 4.0D);
									if (local279 == 0 && local187 > 0 && local68 - 3 < local187 && (local270[local187 - 1][local234] & 0x2C0108) == 0) {
										local187--;
									}
									if (local279 == 1 && local187 < 103 && local68 + 3 > local187 && (local270[local187 + 1][local234] & 0x2C0180) == 0) {
										local187++;
									}
									if (local279 == 2 && local234 > 0 && local234 > local72 - 3 && (local270[local187][local234 - 1] & 0x2C0102) == 0) {
										local234--;
									}
									if (local279 == 3 && local234 < 103 && local72 + 3 > local234 && (local270[local187][local234 + 1] & 0x2C0120) == 0) {
										local234++;
									}
								}
							}
							Static76.anIntArray157[Static180.anInt4139] = local179.anInt1319;
							Static89.anIntArray181[Static180.anInt4139] = local187;
							Static209.anIntArray354[Static180.anInt4139] = local234;
							Static180.anInt4139++;
						}
					}
				}
			}
		}
		@Pc(452) int local452 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (((int) (Math.random() * 20.0D) + 228 << 16) - (10 - ((int) (Math.random() * 20.0D)) - 238));
		local35 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		Static148.aClass1_Sub2_Sub4_Sub1_4.method913();
		for (local37 = 1; local37 < 103; local37++) {
			for (local55 = 1; local55 < 103; local55++) {
				if ((Static145.aByteArrayArrayArray13[arg0][local55][local37] & 0x18) == 0 && !Static59.method1140(local55, arg0, local452, local35, local37)) {
					Static193.aClass73_1.method2864();
					return false;
				}
				if (arg0 < 3 && (Static145.aByteArrayArrayArray13[arg0 + 1][local55][local37] & 0x8) != 0 && !Static59.method1140(local55, arg0 + 1, local452, local35, local37)) {
					Static193.aClass73_1.method2864();
					return false;
				}
			}
		}
		Static125.aClass1_Sub2_Sub4_4 = Static148.aClass1_Sub2_Sub4_Sub1_4;
		Static193.aClass73_1.method2864();
		Static148.aClass1_Sub2_Sub4_Sub1_4 = null;
		return true;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(IIIII)V")
	public static void method364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub2_Sub18 local8 = Static13.method232(arg2, 10);
		local8.method3810();
		local8.anInt5015 = arg0;
		local8.anInt5009 = arg3;
		local8.anInt5008 = arg1;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!se;)Ljava/lang/String;")
	public static String method365(@OriginalArg(1) Class122 arg0) {
		if (Static39.method702(arg0).method3657() == 0) {
			return null;
		} else if (arg0.aString334 == null || arg0.aString334.trim().length() == 0) {
			return Static70.aBoolean113 ? "Hidden-use" : null;
		} else {
			return arg0.aString334;
		}
	}
}
