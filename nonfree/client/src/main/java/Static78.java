import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "[I")
	public static int[] anIntArray121;

	@OriginalMember(owner = "client!ep", name = "n", descriptor = "Lclient!nd;")
	public static Class138 aClass138_1;

	@OriginalMember(owner = "client!ep", name = "p", descriptor = "Lclient!lr;")
	public static Class129 aClass129_1;

	@OriginalMember(owner = "client!ep", name = "g", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_21 = new Class109(30);

	@OriginalMember(owner = "client!ep", name = "h", descriptor = "Z")
	public static volatile boolean aBoolean102 = true;

	@OriginalMember(owner = "client!ep", name = "j", descriptor = "S")
	public static short aShort6 = 1;

	@OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
	public static int anInt1476 = -1;

	@OriginalMember(owner = "client!ep", name = "m", descriptor = "Lclient!rg;")
	public static final Class5_Sub12 aClass5_Sub12_2 = new Class5_Sub12(new byte[5000]);

	@OriginalMember(owner = "client!ep", name = "o", descriptor = "I")
	public static int anInt1477 = 0;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BI)V")
	public static void method1414(@OriginalArg(1) int arg0) {
		if (Static250.anInt4969 == 0) {
			Static188.aClass5_Sub16_Sub1_3.method1674(arg0);
		} else {
			Static51.anInt966 = arg0;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZII)V")
	public static void method1415(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class5_Sub14 local12 = (Class5_Sub14) Static118.aClass190_11.method5466((long) arg1);
		if (local12 != null) {
			for (@Pc(21) int local21 = 0; local21 < local12.anIntArray129.length; local21++) {
				local12.anIntArray129[local21] = -1;
				local12.anIntArray128[local21] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIII)Z")
	public static boolean method1416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static14.method278(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(23) int local23 = Static8.aClass51Array1[arg0].method1856(arg1, arg2) - 1;
		@Pc(27) int local27 = local23 - 120;
		@Pc(31) int local31 = local23 - 230;
		@Pc(35) int local35 = local23 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static300.anInt5860) {
					if (!Static72.method1326(local10, local23, local14)) {
						return false;
					}
					if (!Static72.method1326(local10, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static72.method1326(local10, local27, local14)) {
						return false;
					}
					if (!Static72.method1326(local10, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static72.method1326(local10, local31, local14)) {
					return false;
				}
				if (!Static72.method1326(local10, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static168.anInt3377) {
					if (!Static72.method1326(local10, local23, local14 + 128)) {
						return false;
					}
					if (!Static72.method1326(local10 + 128, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static72.method1326(local10, local27, local14 + 128)) {
						return false;
					}
					if (!Static72.method1326(local10 + 128, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static72.method1326(local10, local31, local14 + 128)) {
					return false;
				}
				if (!Static72.method1326(local10 + 128, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static300.anInt5860) {
					if (!Static72.method1326(local10 + 128, local23, local14)) {
						return false;
					}
					if (!Static72.method1326(local10 + 128, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static72.method1326(local10 + 128, local27, local14)) {
						return false;
					}
					if (!Static72.method1326(local10 + 128, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static72.method1326(local10 + 128, local31, local14)) {
					return false;
				}
				if (!Static72.method1326(local10 + 128, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static168.anInt3377) {
					if (!Static72.method1326(local10, local23, local14)) {
						return false;
					}
					if (!Static72.method1326(local10 + 128, local23, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static72.method1326(local10, local27, local14)) {
						return false;
					}
					if (!Static72.method1326(local10 + 128, local27, local14)) {
						return false;
					}
				}
				if (!Static72.method1326(local10, local31, local14)) {
					return false;
				}
				if (!Static72.method1326(local10 + 128, local31, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static72.method1326(local10 + 64, local35, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static72.method1326(local10, local31, local14 + 128);
		} else if (arg3 == 32) {
			return Static72.method1326(local10 + 128, local31, local14 + 128);
		} else if (arg3 == 64) {
			return Static72.method1326(local10 + 128, local31, local14);
		} else if (arg3 == 128) {
			return Static72.method1326(local10, local31, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BZZLclient!g;)V")
	public static void method1417(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class5_Sub18 arg2) {
		@Pc(6) int local6 = arg2.anInt1871;
		@Pc(10) int local10 = (int) arg2.aLong235;
		arg2.method6005();
		if (arg0) {
			Static332.method6049(local6);
		}
		Static202.method3713(local6);
		@Pc(25) Class201 local25 = Static262.method4616(local10);
		if (local25 != null) {
			Static189.method3383(local25);
		}
		Static160.method2837();
		if (!arg1 && Static32.anInt628 != -1) {
			Static123.method2173(1, Static32.anInt628);
		}
		@Pc(54) Class172 local54 = new Class172(Static198.aClass190_21);
		for (@Pc(59) Class5_Sub18 local59 = (Class5_Sub18) local54.method4717(); local59 != null; local59 = (Class5_Sub18) local54.method4721()) {
			if (!local59.method6008()) {
				local59 = (Class5_Sub18) local54.method4717();
				if (local59 == null) {
					return;
				}
			}
			if (local59.anInt1866 == 3) {
				@Pc(80) int local80 = (int) local59.aLong235;
				if (local80 >>> 16 == local6) {
					method1417(true, arg1, local59);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!ti;Z)Z")
	public static boolean method1418(@OriginalArg(0) Class4_Sub5 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static8.aClass51Array1 == Static219.aClass51Array3;
		@Pc(8) int local8 = 0;
		arg0.method5905();
		if (arg0.aShort92 < 0 || arg0.aShort93 < 0 || arg0.aShort91 >= Static350.anInt6715 || arg0.aShort90 >= Static236.anInt4222) {
			return false;
		}
		@Pc(34) int local34;
		@Pc(37) int local37;
		for (@Pc(30) int local30 = arg0.aShort92; local30 <= arg0.aShort91; local30++) {
			for (local34 = arg0.aShort93; local34 <= arg0.aShort90; local34++) {
				local37 = 0;
				if (local30 > arg0.aShort92) {
					local37++;
				}
				if (local30 < arg0.aShort91) {
					local37 += 4;
				}
				if (local34 > arg0.aShort93) {
					local37 += 8;
				}
				if (local34 < arg0.aShort90) {
					local37 += 2;
				}
				Static1.method3(arg0.aByte75, local30, local34);
				@Pc(71) Class174 local71 = Static178.aClass174ArrayArrayArray3[arg0.aByte75][local30][local34];
				@Pc(76) Class84 local76 = Static342.method5881(arg0, local37);
				@Pc(79) Class84 local79 = local71.aClass84_3;
				if (local79 == null) {
					local71.aClass84_3 = local76;
				} else {
					while (local79.aClass84_2 != null) {
						local79 = local79.aClass84_2;
					}
					local79.aClass84_2 = local76;
				}
				local71.aByte45 = (byte) (local71.aByte45 | local37);
				if (local6 && Static127.anIntArrayArray45[local30][local34] != 0) {
					local8 = Static127.anIntArrayArray45[local30][local34];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local34 = arg0.aShort92; local34 <= arg0.aShort91; local34++) {
				for (local37 = arg0.aShort93; local37 <= arg0.aShort90; local37++) {
					if (Static127.anIntArrayArray45[local34][local37] == 0) {
						Static127.anIntArrayArray45[local34][local37] = local8;
					}
				}
			}
		}
		if (arg1) {
			Static274.aClass4_Sub5Array2[Static107.anInt4822++] = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I[BIB)Z")
	public static boolean method1420(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class5_Sub12 local12 = new Class5_Sub12(arg1);
		@Pc(23) int local23 = -1;
		label70: while (true) {
			@Pc(27) int local27 = local12.method5102();
			if (local27 == 0) {
				return local7;
			}
			local23 += local27;
			@Pc(35) int local35 = 0;
			@Pc(37) boolean local37 = false;
			while (true) {
				@Pc(70) int local70;
				@Pc(104) Class156 local104;
				do {
					@Pc(74) int local74;
					@Pc(78) int local78;
					do {
						do {
							do {
								do {
									@Pc(43) int local43;
									while (local37) {
										local43 = local12.method5060();
										if (local43 == 0) {
											continue label70;
										}
										local12.method5115();
									}
									local43 = local12.method5060();
									if (local43 == 0) {
										continue label70;
									}
									local35 += local43 - 1;
									@Pc(58) int local58 = local35 & 0x3F;
									@Pc(64) int local64 = local35 >> 6 & 0x3F;
									local70 = local12.method5115() >> 2;
									local74 = local64 + arg0;
									local78 = local58 + arg2;
								} while (local74 <= 0);
							} while (local78 <= 0);
						} while (Static22.anInt481 - 1 <= local74);
					} while (local78 >= Static269.anInt5281 - 1);
					local104 = Static111.method1967(local23);
				} while (local70 == 22 && !Static323.aBoolean522 && local104.anInt4756 == 0 && local104.anInt4779 != 1 && !local104.aBoolean394);
				if (!local104.method4235()) {
					local7 = false;
					Static75.anInt1444++;
				}
				local37 = true;
			}
		}
	}
}
