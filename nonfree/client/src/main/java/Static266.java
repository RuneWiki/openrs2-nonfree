import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
	public static int anInt4855 = 0;

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "Z")
	public static boolean aBoolean337 = false;

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString285 = "M";

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BIII)I")
	public static int method4187(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static104.aByteArrayArrayArray3[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static104.aByteArrayArrayArray3[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLclient!wf;)V")
	public static void method4188(@OriginalArg(1) Class15_Sub5_Sub2 arg0) {
		@Pc(16) Class1_Sub8 local16 = (Class1_Sub8) Static132.aClass142_18.method3543(Static124.method4681(arg0.aString336));
		if (local16 == null) {
			Static224.method3476(0, arg0, arg0.anIntArray501[0], null, null, arg0.anIntArray504[0], Static65.anInt1300);
		} else {
			local16.method471();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[B)V")
	public static void method4190(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class1_Sub14 local10 = new Class1_Sub14(arg0);
		local10.anInt1480 = arg0.length - 2;
		Static94.anInt3439 = local10.method1386();
		Static244.anIntArray389 = new int[Static94.anInt3439];
		Static168.aBooleanArray14 = new boolean[Static94.anInt3439];
		Static169.aByteArrayArray7 = new byte[Static94.anInt3439][];
		Static235.anIntArray468 = new int[Static94.anInt3439];
		Static254.anIntArray412 = new int[Static94.anInt3439];
		Static69.aByteArrayArray15 = new byte[Static94.anInt3439][];
		Static160.anIntArray267 = new int[Static94.anInt3439];
		local10.anInt1480 = arg0.length - Static94.anInt3439 * 8 - 7;
		Static299.anInt5347 = local10.method1386();
		Static130.anInt2594 = local10.method1386();
		@Pc(68) int local68 = (local10.method1378() & 0xFF) + 1;
		@Pc(70) int local70;
		for (local70 = 0; local70 < Static94.anInt3439; local70++) {
			Static244.anIntArray389[local70] = local10.method1386();
		}
		for (local70 = 0; local70 < Static94.anInt3439; local70++) {
			Static254.anIntArray412[local70] = local10.method1386();
		}
		for (local70 = 0; local70 < Static94.anInt3439; local70++) {
			Static160.anIntArray267[local70] = local10.method1386();
		}
		for (local70 = 0; local70 < Static94.anInt3439; local70++) {
			Static235.anIntArray468[local70] = local10.method1386();
		}
		local10.anInt1480 = arg0.length - (local68 - 1) * 3 - Static94.anInt3439 * 8 - 7;
		Static83.anIntArray144 = new int[local68];
		for (local70 = 1; local70 < local68; local70++) {
			Static83.anIntArray144[local70] = local10.method1352();
			if (Static83.anIntArray144[local70] == 0) {
				Static83.anIntArray144[local70] = 1;
			}
		}
		local10.anInt1480 = 0;
		for (local70 = 0; local70 < Static94.anInt3439; local70++) {
			@Pc(209) int local209 = Static235.anIntArray468[local70];
			@Pc(213) int local213 = Static160.anIntArray267[local70];
			@Pc(215) boolean local215 = false;
			@Pc(219) int local219 = local213 * local209;
			@Pc(222) byte[] local222 = new byte[local219];
			Static69.aByteArrayArray15[local70] = local222;
			@Pc(229) byte[] local229 = new byte[local219];
			Static169.aByteArrayArray7[local70] = local229;
			@Pc(237) int local237 = local10.method1378();
			@Pc(244) int local244;
			if ((local237 & 0x1) == 0) {
				for (local244 = 0; local244 < local219; local244++) {
					local222[local244] = local10.method1363();
				}
				if ((local237 & 0x2) != 0) {
					for (local244 = 0; local244 < local219; local244++) {
						@Pc(362) byte local362 = local229[local244] = local10.method1363();
						local215 |= local362 != -1;
					}
				}
			} else {
				local244 = 0;
				label87: while (true) {
					@Pc(253) int local253;
					if (local213 <= local244) {
						if ((local237 & 0x2) == 0) {
							break;
						}
						local244 = 0;
						while (true) {
							if (local244 >= local213) {
								break label87;
							}
							for (local253 = 0; local253 < local209; local253++) {
								@Pc(306) byte local306 = local229[local244 + local213 * local253] = local10.method1363();
								local215 |= local306 != -1;
							}
							local244++;
						}
					}
					for (local253 = 0; local253 < local209; local253++) {
						local222[local244 + local213 * local253] = local10.method1363();
					}
					local244++;
				}
			}
			Static168.aBooleanArray14[local70] = local215;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II[[[Lclient!wk;IIZ)Z")
	public static boolean method4191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub33[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(14) byte local14 = arg4 ? 1 : (byte) (Static188.anInt3597 & 0xFF);
		if (local14 == Static257.aByteArrayArrayArray20[Static65.anInt1300][arg3][arg1]) {
			return false;
		} else if ((Static104.aByteArrayArrayArray3[Static65.anInt1300][arg3][arg1] & 0x4) == 0) {
			return false;
		} else {
			@Pc(41) byte local41 = 0;
			Static296.anIntArray469[0] = arg3;
			@Pc(55) int local55 = local41 + 1;
			Static293.anIntArray466[0] = arg1;
			Static257.aByteArrayArrayArray20[Static65.anInt1300][arg3][arg1] = local14;
			@Pc(67) int local67 = 0;
			while (local67 != local55) {
				@Pc(80) int local80 = Static296.anIntArray469[local67] & 0xFFFF;
				@Pc(88) int local88 = Static296.anIntArray469[local67] >> 24 & 0xFF;
				@Pc(96) int local96 = Static296.anIntArray469[local67] >> 16 & 0xFF;
				@Pc(102) int local102 = Static293.anIntArray466[local67] & 0xFFFF;
				@Pc(110) int local110 = Static293.anIntArray466[local67] >> 16 & 0xFF;
				@Pc(112) boolean local112 = false;
				if ((Static104.aByteArrayArrayArray3[Static65.anInt1300][local80][local102] & 0x4) == 0) {
					local112 = true;
				}
				local67 = local67 + 1 & 0xFFF;
				@Pc(133) boolean local133 = false;
				@Pc(137) int local137;
				@Pc(180) int local180;
				label247: for (local137 = Static65.anInt1300 + 1; local137 <= 3; local137++) {
					if ((Static104.aByteArrayArrayArray3[local137][local80][local102] & 0x8) == 0) {
						@Pc(214) int local214;
						@Pc(352) int local352;
						if (local112 && arg2[local137][local80][local102] != null) {
							if (arg2[local137][local80][local102].aClass160_1 != null) {
								local180 = Static57.method1006(local96);
								if (arg2[local137][local80][local102].aClass160_1.anInt4621 == local180 || arg2[local137][local80][local102].aClass160_1.anInt4620 == local180) {
									continue;
								}
								if (local88 != 0) {
									local214 = Static57.method1006(local88);
									if (local214 == arg2[local137][local80][local102].aClass160_1.anInt4621 || arg2[local137][local80][local102].aClass160_1.anInt4620 == local214) {
										continue;
									}
								}
								if (local110 != 0) {
									local214 = Static57.method1006(local110);
									if (local214 == arg2[local137][local80][local102].aClass160_1.anInt4621 || local214 == arg2[local137][local80][local102].aClass160_1.anInt4620) {
										continue;
									}
								}
							}
							if (arg2[local137][local80][local102].aClass161Array3 != null) {
								for (local180 = 0; local180 < arg2[local137][local80][local102].anInt5733; local180++) {
									local214 = (int) (arg2[local137][local80][local102].aClass161Array3[local180].aLong171 >> 14 & 0x3FL);
									if (local214 == 21) {
										local214 = 19;
									}
									@Pc(346) int local346 = (int) (arg2[local137][local80][local102].aClass161Array3[local180].aLong171 >> 20 & 0x3L);
									local352 = local346 << 6 | local214;
									if (local96 == local352 || local88 != 0 && local88 == local352 || local110 != 0 && local352 == local110) {
										continue label247;
									}
								}
							}
						}
						local133 = true;
						@Pc(400) Class1_Sub33 local400 = arg2[local137][local80][local102];
						if (local400 != null && local400.anInt5733 > 0) {
							for (local214 = 0; local214 < local400.anInt5733; local214++) {
								@Pc(419) Class161 local419 = local400.aClass161Array3[local214];
								if (local419.anInt4641 != local419.anInt4639 || local419.anInt4637 != local419.anInt4636) {
									for (local352 = local419.anInt4641; local352 <= local419.anInt4639; local352++) {
										for (@Pc(452) int local452 = local419.anInt4636; local452 <= local419.anInt4637; local452++) {
											Static257.aByteArrayArrayArray20[local137][local352][local452] = local14;
										}
									}
								}
							}
						}
						Static257.aByteArrayArrayArray20[local137][local80][local102] = local14;
					}
				}
				if (local133) {
					local137 = local80 << 7;
					local180 = local102 << 7;
					if (Static24.anIntArrayArrayArray2[Static65.anInt1300 + 1][local80][local102] > Static72.anIntArray471[arg0]) {
						Static72.anIntArray471[arg0] = Static24.anIntArrayArrayArray2[Static65.anInt1300 + 1][local80][local102];
					}
					if (Static272.anIntArray506[arg0] > local137) {
						Static272.anIntArray506[arg0] = local137;
					} else if (Static179.anIntArray292[arg0] < local137) {
						Static179.anIntArray292[arg0] = local137;
					}
					if (local180 < Static7.anIntArray6[arg0]) {
						Static7.anIntArray6[arg0] = local180;
					} else if (local180 > Static236.anIntArray367[arg0]) {
						Static236.anIntArray367[arg0] = local180;
					}
				}
				if (!local112) {
					if (local80 >= 1 && local14 != Static257.aByteArrayArrayArray20[Static65.anInt1300][local80 - 1][local102]) {
						Static296.anIntArray469[local55] = local80 - 1 | 0x120000 | 0xD3000000;
						Static293.anIntArray466[local55] = local102 | 0x130000;
						Static257.aByteArrayArrayArray20[Static65.anInt1300][local80 - 1][local102] = local14;
						local55 = local55 + 1 & 0xFFF;
					}
					local102++;
					if (local102 < 104) {
						if (local80 - 1 >= 0 && Static257.aByteArrayArrayArray20[Static65.anInt1300][local80 - 1][local102] != local14 && (Static104.aByteArrayArrayArray3[Static65.anInt1300][local80][local102] & 0x4) == 0 && (Static104.aByteArrayArrayArray3[Static65.anInt1300][local80 - 1][local102 - 1] & 0x4) == 0) {
							Static296.anIntArray469[local55] = local80 - 1 | 0x52000000 | 0x120000;
							Static293.anIntArray466[local55] = local102 | 0x130000;
							Static257.aByteArrayArrayArray20[Static65.anInt1300][local80 - 1][local102] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
						if (local14 != Static257.aByteArrayArrayArray20[Static65.anInt1300][local80][local102]) {
							Static296.anIntArray469[local55] = local80 | 0x520000 | 0x13000000;
							Static293.anIntArray466[local55] = local102 | 0x530000;
							local55 = local55 + 1 & 0xFFF;
							Static257.aByteArrayArrayArray20[Static65.anInt1300][local80][local102] = local14;
						}
						if (local80 + 1 < 104 && Static257.aByteArrayArrayArray20[Static65.anInt1300][local80 + 1][local102] != local14 && (Static104.aByteArrayArrayArray3[Static65.anInt1300][local80][local102] & 0x4) == 0 && (Static104.aByteArrayArrayArray3[Static65.anInt1300][local80 + 1][local102 - 1] & 0x4) == 0) {
							Static296.anIntArray469[local55] = local80 + 1 | 0x92000000 | 0x520000;
							Static293.anIntArray466[local55] = local102 | 0x530000;
							Static257.aByteArrayArrayArray20[Static65.anInt1300][local80 + 1][local102] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
					}
					local102--;
					if (local80 + 1 < 104 && local14 != Static257.aByteArrayArrayArray20[Static65.anInt1300][local80 + 1][local102]) {
						Static296.anIntArray469[local55] = 0x53000000 | 0x920000 | local80 + 1;
						Static293.anIntArray466[local55] = local102 | 0x930000;
						Static257.aByteArrayArrayArray20[Static65.anInt1300][local80 + 1][local102] = local14;
						local55 = local55 + 1 & 0xFFF;
					}
					local102--;
					if (local102 >= 0) {
						if (local80 - 1 >= 0 && Static257.aByteArrayArrayArray20[Static65.anInt1300][local80 - 1][local102] != local14 && (Static104.aByteArrayArrayArray3[Static65.anInt1300][local80][local102] & 0x4) == 0 && (Static104.aByteArrayArrayArray3[Static65.anInt1300][local80 - 1][local102 + 1] & 0x4) == 0) {
							Static296.anIntArray469[local55] = local80 - 1 | 0x12000000 | 0xD20000;
							Static293.anIntArray466[local55] = local102 | 0xD30000;
							local55 = local55 + 1 & 0xFFF;
							Static257.aByteArrayArrayArray20[Static65.anInt1300][local80 - 1][local102] = local14;
						}
						if (Static257.aByteArrayArrayArray20[Static65.anInt1300][local80][local102] != local14) {
							Static296.anIntArray469[local55] = local80 | 0xD20000 | 0x93000000;
							Static293.anIntArray466[local55] = local102 | 0xD30000;
							local55 = local55 + 1 & 0xFFF;
							Static257.aByteArrayArrayArray20[Static65.anInt1300][local80][local102] = local14;
						}
						if (local80 + 1 < 104 && local14 != Static257.aByteArrayArrayArray20[Static65.anInt1300][local80 + 1][local102] && (Static104.aByteArrayArrayArray3[Static65.anInt1300][local80][local102] & 0x4) == 0 && (Static104.aByteArrayArrayArray3[Static65.anInt1300][local80 + 1][local102 + 1] & 0x4) == 0) {
							Static296.anIntArray469[local55] = local80 + 1 | 0x920000 | 0xD2000000;
							Static293.anIntArray466[local55] = local102 | 0x930000;
							Static257.aByteArrayArrayArray20[Static65.anInt1300][local80 + 1][local102] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static72.anIntArray471[arg0] != -1000000) {
				Static72.anIntArray471[arg0] += 10;
				Static272.anIntArray506[arg0] -= 50;
				Static179.anIntArray292[arg0] += 50;
				Static236.anIntArray367[arg0] += 50;
				Static7.anIntArray6[arg0] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)Lclient!sb;")
	public static Class1_Sub2_Sub18 method4192(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub2_Sub18 local6 = (Class1_Sub2_Sub18) Static268.aClass148_11.method3600((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(28) byte[] local28 = Static162.aClass121_77.method3115(arg0, 0);
		if (local28 == null || local28.length <= 1) {
			return null;
		} else {
			local6 = Static100.method1819(local28);
			Static268.aClass148_11.method3602(local6, (long) arg0);
			return local6;
		}
	}
}
