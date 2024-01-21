import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!lh", name = "U", descriptor = "B")
	public static byte aByte4;

	@OriginalMember(owner = "client!lh", name = "eb", descriptor = "I")
	public static int anInt3045;

	@OriginalMember(owner = "client!lh", name = "ub", descriptor = "Lclient!kc;")
	public static Class2_Sub1_Sub7_Sub4 aClass2_Sub1_Sub7_Sub4_7;

	@OriginalMember(owner = "client!lh", name = "V", descriptor = "I")
	public static int anInt3038 = 0;

	@OriginalMember(owner = "client!lh", name = "W", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_854 = Static158.method3034("(U3");

	@OriginalMember(owner = "client!lh", name = "mb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_855 = Static158.method3034("m");

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLclient!og;I)Lclient!ob;")
	public static Class60 method2395(@OriginalArg(1) Class2_Sub3 arg0) {
		try {
			@Pc(12) Class60 local12 = new Class60();
			local12.anInt3466 = arg0.method237();
			if (local12.anInt3466 > 32767) {
				local12.anInt3466 = 32767;
			}
			local12.aByteArray39 = new byte[local12.anInt3466];
			arg0.anInt273 += Static114.aClass80_1.method3118(0, local12.aByteArray39, arg0.anInt273, arg0.aByteArray4, local12.anInt3466);
			return local12;
		} catch (@Pc(49) Exception local49) {
			return Static10.aClass60_93;
		}
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(Z)V")
	public static void method2396() {
		for (@Pc(7) int local7 = -1; local7 < Static166.anInt4101; local7++) {
			@Pc(14) int local14;
			if (local7 == -1) {
				local14 = 2047;
			} else {
				local14 = Static169.anIntArray458[local7];
			}
			@Pc(24) Class2_Sub1_Sub1_Sub3_Sub1 local24 = Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local14];
			if (local24 != null) {
				Static94.method2239(local24, 1);
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(II)V")
	public static void method2397(@OriginalArg(0) int arg0) {
		@Pc(8) int[] local8 = Static98.aClass2_Sub1_Sub7_Sub4_6.anIntArray310;
		@Pc(11) int local11 = local8.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local8[local13] = 1;
		}
		@Pc(39) int local39;
		@Pc(41) int local41;
		for (@Pc(25) int local25 = 1; local25 < 103; local25++) {
			local39 = (52736 - local25 * 512) * 4 + 24628;
			for (local41 = 1; local41 < 103; local41++) {
				if ((Static147.aByteArrayArrayArray36[arg0][local41][local25] & 0x18) == 0) {
					Static27.method671(local8, local39, arg0, local41, local25);
				}
				if (arg0 < 3 && (Static147.aByteArrayArrayArray36[arg0 + 1][local41][local25] & 0x8) != 0) {
					Static27.method671(local8, local39, arg0 + 1, local41, local25);
				}
				local39 += 4;
			}
		}
		local39 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		Static98.aClass2_Sub1_Sub7_Sub4_6.method2143();
		local41 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(151) int local151;
		for (@Pc(147) int local147 = 1; local147 < 103; local147++) {
			for (local151 = 1; local151 < 103; local151++) {
				if ((Static147.aByteArrayArrayArray36[arg0][local151][local147] & 0x18) == 0) {
					Static1.method1(local39, local41, local151, arg0, local147);
				}
				if (arg0 < 3 && (Static147.aByteArrayArrayArray36[arg0 + 1][local151][local147] & 0x8) != 0) {
					Static1.method1(local39, local41, local151, arg0 + 1, local147);
				}
			}
		}
		Static81.anInt2408 = 0;
		for (local151 = 0; local151 < 104; local151++) {
			for (@Pc(219) int local219 = 0; local219 < 104; local219++) {
				@Pc(226) long local226 = Static160.method1485(Static62.anInt1923, local151, local219);
				if (local226 != 0L) {
					@Pc(240) int local240 = Static158.method3037((int) (local226 >>> 32) & Integer.MAX_VALUE).anInt1686;
					if (local240 >= 0) {
						@Pc(244) int local244 = local219;
						@Pc(246) int local246 = local151;
						if (local240 != 22 && local240 != 29 && local240 != 34 && local240 != 36 && local240 != 46 && local240 != 47 && local240 != 48) {
							@Pc(280) int[][] local280 = Static48.aClass35Array1[Static62.anInt1923].anIntArrayArray14;
							for (@Pc(282) int local282 = 0; local282 < 10; local282++) {
								@Pc(289) int local289 = (int) (Math.random() * 4.0D);
								if (local289 == 0 && local246 > 0 && local246 > local151 - 3 && (local280[local246 - 1][local244] & 0x12C0108) == 0) {
									local246--;
								}
								if (local289 == 1 && local246 < 103 && local246 < local151 + 3 && (local280[local246 + 1][local244] & 0x12C0180) == 0) {
									local246++;
								}
								if (local289 == 2 && local244 > 0 && local219 - 3 < local244 && (local280[local246][local244 - 1] & 0x12C0102) == 0) {
									local244--;
								}
								if (local289 == 3 && local244 < 103 && local244 < local219 + 3 && (local280[local246][local244 + 1] & 0x12C0120) == 0) {
									local244++;
								}
							}
						}
						Static89.aClass2_Sub1_Sub7_Sub4Array8[Static81.anInt2408] = Static22.aClass2_Sub1_Sub7_Sub4Array3[local240];
						Static84.anIntArray277[Static81.anInt2408] = local246;
						Static193.anIntArray501[Static81.anInt2408] = local244;
						Static81.anInt2408++;
					}
				}
			}
		}
		Static192.aClass44_1.method2448();
	}

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "(I)V")
	public static void method2398() {
		if (Static131.aClass72_2 != null || Static62.aClass72_5 != null) {
			return;
		}
		@Pc(21) int local21 = Static147.anInt3820;
		@Pc(97) int local97;
		@Pc(91) int local91;
		if (Static103.aBoolean115) {
			@Pc(181) int local181;
			if (local21 != 1) {
				local97 = Static157.anInt3985;
				local181 = Static131.anInt215;
				if (Static103.anInt2979 - 10 > local181 || local181 > Static180.anInt3303 + Static103.anInt2979 + 10 || Static176.anInt4301 - 10 > local97 || Static176.anInt4301 + Static73.anInt2175 + 10 < local97) {
					Static103.aBoolean115 = false;
					Static129.method2731(Static176.anInt4301, Static103.anInt2979, Static180.anInt3303, Static73.anInt2175);
				}
			}
			if (local21 != 1) {
				return;
			}
			local181 = Static103.anInt2979;
			local91 = Static180.anInt3303;
			@Pc(228) int local228 = Static74.anInt2294;
			local97 = Static176.anInt4301;
			@Pc(232) int local232 = Static174.anInt4254;
			@Pc(234) int local234 = -1;
			for (@Pc(236) int local236 = 0; local236 < Static169.anInt4148; local236++) {
				@Pc(251) int local251 = local97 + (Static169.anInt4148 - local236 - 1) * 15 + 31;
				if (local228 > local181 && local91 + local181 > local228 && local232 > local251 - 13 && local232 < local251 + 3) {
					local234 = local236;
				}
			}
			if (local234 != -1) {
				Static70.method1641(local234);
			}
			Static103.aBoolean115 = false;
			Static129.method2731(Static176.anInt4301, Static103.anInt2979, Static180.anInt3303, Static73.anInt2175);
			return;
		}
		if (local21 == 1 && Static169.anInt4148 > 0) {
			@Pc(37) short local37 = Static140.aShortArray53[Static169.anInt4148 - 1];
			if (local37 == 49 || local37 == 7 || local37 == 8 || local37 == 33 || local37 == 4 || local37 == 10 || local37 == 31 || local37 == 1 || local37 == 28 || local37 == 58 || local37 == 3 || local37 == 1001) {
				local91 = Static120.anIntArray375[Static169.anInt4148 - 1];
				local97 = Static6.anIntArray27[Static169.anInt4148 - 1];
				@Pc(101) Class72 local101 = Static173.method3201(local91);
				if (Static168.method3121(Static26.method637(local101)) || Static166.method3110(Static26.method637(local101))) {
					Static15.anInt506 = 0;
					Static191.aBoolean181 = false;
					if (Static131.aClass72_2 != null) {
						Static39.method900(Static131.aClass72_2);
					}
					Static131.aClass72_2 = Static173.method3201(local91);
					Static47.anInt2935 = Static74.anInt2294;
					Static157.anInt3993 = local97;
					Static77.anInt2336 = Static174.anInt4254;
					Static39.method900(Static131.aClass72_2);
					return;
				}
			}
		}
		if (local21 == 1 && (Static131.anInt249 == 1 && Static169.anInt4148 > 2 || Static55.method1328(Static169.anInt4148 - 1))) {
			local21 = 2;
		}
		if (local21 == 1 && Static169.anInt4148 > 0) {
			Static70.method1641(Static169.anInt4148 - 1);
		}
		if (local21 == 2 && Static169.anInt4148 > 0) {
			Static17.method428();
			return;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIILclient!aa;Lclient!aa;IIIIJ)V")
	public static void method2399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub1 arg4, @OriginalArg(5) Class2_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class26 local6 = new Class26();
		local6.aLong49 = arg10;
		local6.anInt1765 = arg1 * 128 + 64;
		local6.anInt1773 = arg2 * 128 + 64;
		local6.anInt1775 = arg3;
		local6.aClass2_Sub1_Sub1_5 = arg4;
		local6.aClass2_Sub1_Sub1_6 = arg5;
		local6.anInt1774 = arg6;
		local6.anInt1764 = arg7;
		local6.anInt1771 = arg8;
		local6.anInt1770 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static118.aClass2_Sub17ArrayArrayArray1[local46][arg1][arg2] == null) {
				Static118.aClass2_Sub17ArrayArrayArray1[local46][arg1][arg2] = new Class2_Sub17(local46, arg1, arg2);
			}
		}
		Static118.aClass2_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass26_1 = local6;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIB)I")
	public static int method2401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class2_Sub15 local6 = (Class2_Sub15) Static88.aClass51_7.method2458((long) arg1);
		if (local6 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local6.anIntArray393.length) {
			return local6.anIntArray393[arg0];
		} else {
			return 0;
		}
	}
}
