import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "F")
	public static float aFloat3;

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "Lclient!kn;")
	public static Class97 aClass97_1;

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "[Lclient!ka;")
	public static Class21_Sub1[] aClass21_Sub1Array1 = new Class21_Sub1[29];

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "Lclient!hi;")
	public static Class66 aClass66_1 = null;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZ)V")
	public static void method32(@OriginalArg(1) boolean arg0) {
		Static284.aBoolean349 = arg0;
		@Pc(29) boolean local29;
		@Pc(19) int local19;
		@Pc(23) int local23;
		@Pc(33) int local33;
		@Pc(39) int local39;
		@Pc(44) int local44;
		@Pc(51) int local51;
		@Pc(58) int local58;
		@Pc(68) int local68;
		@Pc(196) int local196;
		@Pc(207) int local207;
		if (!Static284.aBoolean349) {
			local19 = Static13.aClass1_Sub14_Sub1_1.method1386();
			local23 = Static13.aClass1_Sub14_Sub1_1.method1383();
			local29 = Static295.method4500(Static13.aClass1_Sub14_Sub1_1.method1394());
			local33 = Static13.aClass1_Sub14_Sub1_1.method1383();
			local39 = Static13.aClass1_Sub14_Sub1_1.method1381();
			local44 = (Static88.anInt1723 - Static13.aClass1_Sub14_Sub1_1.anInt1480) / 16;
			Static281.anIntArrayArray42 = new int[local44][4];
			for (local51 = 0; local51 < local44; local51++) {
				for (local58 = 0; local58 < 4; local58++) {
					Static281.anIntArrayArray42[local51][local58] = Static13.aClass1_Sub14_Sub1_1.method1393();
				}
			}
			local51 = Static13.aClass1_Sub14_Sub1_1.method1366();
			Static309.aByteArrayArray18 = null;
			Static54.aByteArrayArray2 = new byte[local44][];
			Static306.aByteArrayArray17 = new byte[local44][];
			Static168.anIntArray280 = new int[local44];
			Static129.anIntArray224 = new int[local44];
			Static47.anIntArray59 = new int[local44];
			Static175.aByteArrayArray8 = new byte[local44][];
			Static224.anIntArray348 = new int[local44];
			@Pc(465) boolean local465 = false;
			if ((local23 / 8 == 48 || local23 / 8 == 49) && local19 / 8 == 48) {
				local465 = true;
			}
			Static115.aByteArrayArray5 = new byte[local44][];
			Static130.anIntArray225 = new int[local44];
			if (local23 / 8 == 48 && local19 / 8 == 148) {
				local465 = true;
			}
			local44 = 0;
			Static222.anIntArray345 = null;
			for (local68 = (local23 - 6) / 8; local68 <= (local23 + 6) / 8; local68++) {
				for (local196 = (local19 - 6) / 8; local196 <= (local19 + 6) / 8; local196++) {
					local207 = local196 + (local68 << 8);
					if (local465 && (local196 == 49 || local196 == 149 || local196 == 147 || local68 == 50 || local68 == 49 && local196 == 47)) {
						Static224.anIntArray348[local44] = local207;
						Static47.anIntArray59[local44] = -1;
						Static130.anIntArray225[local44] = -1;
						Static168.anIntArray280[local44] = -1;
						Static129.anIntArray224[local44] = -1;
					} else {
						Static224.anIntArray348[local44] = local207;
						Static47.anIntArray59[local44] = Static313.aClass121_73.method3108("m" + local68 + "_" + local196);
						Static130.anIntArray225[local44] = Static313.aClass121_73.method3108("l" + local68 + "_" + local196);
						Static168.anIntArray280[local44] = Static313.aClass121_73.method3108("um" + local68 + "_" + local196);
						Static129.anIntArray224[local44] = Static313.aClass121_73.method3108("ul" + local68 + "_" + local196);
					}
					local44++;
				}
			}
			Static204.method3259(local29, local51, local19, local33, local23, false, local39);
			return;
		}
		local19 = Static13.aClass1_Sub14_Sub1_1.method1367();
		local23 = Static13.aClass1_Sub14_Sub1_1.method1386();
		local29 = Static295.method4500(Static13.aClass1_Sub14_Sub1_1.method1397());
		local33 = Static13.aClass1_Sub14_Sub1_1.method1383();
		local39 = Static13.aClass1_Sub14_Sub1_1.method1383();
		Static13.aClass1_Sub14_Sub1_1.method1405();
		for (local44 = 0; local44 < 4; local44++) {
			for (local51 = 0; local51 < 13; local51++) {
				for (local58 = 0; local58 < 13; local58++) {
					local68 = Static13.aClass1_Sub14_Sub1_1.method1411(1);
					if (local68 == 1) {
						Static4.anIntArrayArrayArray1[local44][local51][local58] = Static13.aClass1_Sub14_Sub1_1.method1411(26);
					} else {
						Static4.anIntArrayArrayArray1[local44][local51][local58] = -1;
					}
				}
			}
		}
		Static13.aClass1_Sub14_Sub1_1.method1407();
		local44 = (Static88.anInt1723 - Static13.aClass1_Sub14_Sub1_1.anInt1480) / 16;
		Static281.anIntArrayArray42 = new int[local44][4];
		for (local51 = 0; local51 < local44; local51++) {
			for (local58 = 0; local58 < 4; local58++) {
				Static281.anIntArrayArray42[local51][local58] = Static13.aClass1_Sub14_Sub1_1.method1393();
			}
		}
		local51 = Static13.aClass1_Sub14_Sub1_1.method1378();
		Static309.aByteArrayArray18 = null;
		Static222.anIntArray345 = null;
		Static175.aByteArrayArray8 = new byte[local44][];
		Static129.anIntArray224 = new int[local44];
		Static224.anIntArray348 = new int[local44];
		Static168.anIntArray280 = new int[local44];
		Static54.aByteArrayArray2 = new byte[local44][];
		Static306.aByteArrayArray17 = new byte[local44][];
		Static47.anIntArray59 = new int[local44];
		Static115.aByteArrayArray5 = new byte[local44][];
		Static130.anIntArray225 = new int[local44];
		local44 = 0;
		for (local58 = 0; local58 < 4; local58++) {
			for (local68 = 0; local68 < 13; local68++) {
				for (local196 = 0; local196 < 13; local196++) {
					local207 = Static4.anIntArrayArrayArray1[local58][local68][local196];
					if (local207 != -1) {
						@Pc(217) int local217 = local207 >> 3 & 0x7FF;
						@Pc(223) int local223 = local207 >> 14 & 0x3FF;
						@Pc(234) int local234 = (local223 / 8 << 8) + (local217 / 8);
						@Pc(236) int local236;
						for (local236 = 0; local236 < local44; local236++) {
							if (Static224.anIntArray348[local236] == local234) {
								local234 = -1;
								break;
							}
						}
						if (local234 != -1) {
							Static224.anIntArray348[local44] = local234;
							@Pc(271) int local271 = local234 & 0xFF;
							local236 = local234 >> 8 & 0xFF;
							Static47.anIntArray59[local44] = Static313.aClass121_73.method3108("m" + local236 + "_" + local271);
							Static130.anIntArray225[local44] = Static313.aClass121_73.method3108("l" + local236 + "_" + local271);
							Static168.anIntArray280[local44] = Static313.aClass121_73.method3108("um" + local236 + "_" + local271);
							Static129.anIntArray224[local44] = Static313.aClass121_73.method3108("ul" + local236 + "_" + local271);
							local44++;
						}
					}
				}
			}
		}
		Static204.method3259(local29, local39, local19, local23, local33, false, local51);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!gi;I)V")
	public static void method34(@OriginalArg(0) Class15_Sub5 arg0) {
		if (Static313.anInt2966 == arg0.anInt5571 || arg0.anInt5594 == -1 || arg0.anInt5585 != 0 || arg0.anInt5539 + 1 > Static80.method1561(arg0.anInt5594).anIntArray395[arg0.anInt5537]) {
			@Pc(29) int local29 = arg0.anInt5571 - arg0.anInt5564;
			@Pc(35) int local35 = Static313.anInt2966 - arg0.anInt5564;
			@Pc(46) int local46 = arg0.anInt5555 * 128 + arg0.method4702() * 64;
			@Pc(57) int local57 = arg0.anInt5533 * 128 + arg0.method4702() * 64;
			@Pc(68) int local68 = arg0.anInt5523 * 128 + arg0.method4702() * 64;
			@Pc(79) int local79 = arg0.anInt5579 * 128 + arg0.method4702() * 64;
			arg0.anInt5557 = ((local29 - local35) * local57 + local79 * local35) / local29;
			arg0.anInt5559 = ((local29 - local35) * local46 + local68 * local35) / local29;
		}
		arg0.anInt5519 = 0;
		if (arg0.anInt5561 == 0) {
			arg0.anInt5593 = 1024;
		}
		if (arg0.anInt5561 == 1) {
			arg0.anInt5593 = 1536;
		}
		if (arg0.anInt5561 == 2) {
			arg0.anInt5593 = 0;
		}
		if (arg0.anInt5561 == 3) {
			arg0.anInt5593 = 512;
		}
		arg0.anInt5554 = arg0.anInt5593;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)Lclient!md;")
	public static Class1_Sub2_Sub11 method35(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) Class1_Sub2_Sub11 local21 = (Class1_Sub2_Sub11) Static160.aClass142_16.method3543((long) arg1 << 32 | (long) arg0);
		if (local21 == null) {
			local21 = new Class1_Sub2_Sub11(arg1, arg0);
			Static160.aClass142_16.method3537(local21, local21.aLong214);
		}
		return local21;
	}
}
