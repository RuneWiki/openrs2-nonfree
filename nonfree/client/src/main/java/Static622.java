import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static622 {

	@OriginalMember(owner = "client!va", name = "I", descriptor = "Z")
	public static boolean aBoolean763;

	@OriginalMember(owner = "client!va", name = "F", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_213 = new Class151(120, 4);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!uea;I)[I")
	public static int[] method8367(@OriginalArg(0) Class4_Sub48 arg0) {
		@Pc(10) Class4_Sub11 local10 = new Class4_Sub11(518);
		@Pc(13) int[] local13 = new int[4];
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			local13[local15] = (int) (Math.random() * 9.9999999E7D);
		}
		local10.method8822(10);
		local10.method8860(local13[0]);
		local10.method8860(local13[1]);
		local10.method8860(local13[2]);
		local10.method8860(local13[3]);
		for (@Pc(62) int local62 = 0; local62 < 10; local62++) {
			local10.method8860((int) (Math.random() * 9.9999999E7D));
		}
		local10.method8838((int) (Math.random() * 9.9999999E7D));
		local10.method8878(Static271.aBigInteger4, Static522.aBigInteger9);
		arg0.aClass4_Sub11_Sub1_2.method8824(local10.aByteArray107, local10.anInt10466, 0);
		return local13;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!kq;IIZ)V")
	public static void method8368(@OriginalArg(0) int arg0, @OriginalArg(1) Class199 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(16) int local16 = arg1.anInt5035;
		@Pc(19) int local19 = arg1.anInt4994;
		if (arg1.aByte76 == 0) {
			arg1.anInt5035 = arg1.anInt4962;
		} else if (arg1.aByte76 == 1) {
			arg1.anInt5035 = arg0 - arg1.anInt4962;
		} else if (arg1.aByte76 == 2) {
			arg1.anInt5035 = arg0 * arg1.anInt4962 >> 14;
		}
		if (arg1.aByte79 == 0) {
			arg1.anInt4994 = arg1.anInt4959;
		} else if (arg1.aByte79 == 1) {
			arg1.anInt4994 = arg2 - arg1.anInt4959;
		} else if (arg1.aByte79 == 2) {
			arg1.anInt4994 = arg1.anInt4959 * arg2 >> 14;
		}
		if (arg1.aByte76 == 4) {
			arg1.anInt5035 = arg1.anInt5025 * arg1.anInt4994 / arg1.anInt4952;
		}
		if (arg1.aByte79 == 4) {
			arg1.anInt4994 = arg1.anInt4952 * arg1.anInt5035 / arg1.anInt5025;
		}
		if (Static110.aBoolean147 && (Static75.method1604(arg1).anInt890 != 0 || arg1.anInt4966 == 0)) {
			if (arg1.anInt4994 < 5 && arg1.anInt5035 < 5) {
				arg1.anInt5035 = 5;
				arg1.anInt4994 = 5;
			} else {
				if (arg1.anInt4994 <= 0) {
					arg1.anInt4994 = 5;
				}
				if (arg1.anInt5035 <= 0) {
					arg1.anInt5035 = 5;
				}
			}
		}
		if (Static468.anInt7445 == arg1.anInt4955) {
			Static593.aClass199_16 = arg1;
		}
		if (arg3 && arg1.anObjectArray3 != null && (local16 != arg1.anInt5035 || local19 != arg1.anInt4994)) {
			@Pc(196) Class4_Sub25 local196 = new Class4_Sub25();
			local196.anObjectArray2 = arg1.anObjectArray3;
			local196.aClass199_6 = arg1;
			Static209.aClass163_20.method3646(local196);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
	public static void method8369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16, @OriginalArg(18) boolean arg17) {
		Static142.aBoolean362 = true;
		Static95.aBoolean132 = Static246.aClass33_6.method8086() > 0;
		Static284.aBoolean342 = true;
		Static323.anInt5049 = arg1 >> Static273.anInt4424;
		Static417.anInt6041 = arg3 >> Static273.anInt4424;
		Static279.anInt4497 = arg1;
		Static398.anInt5802 = arg3;
		Static336.anInt10628 = arg2;
		Static358.anInt5430 = Static323.anInt5049 - Static112.anInt2200;
		if (Static358.anInt5430 < 0) {
			Static169.anInt3015 = -Static358.anInt5430;
			Static358.anInt5430 = 0;
		} else {
			Static169.anInt3015 = 0;
		}
		Static355.anInt5409 = Static417.anInt6041 - Static112.anInt2200;
		if (Static355.anInt5409 < 0) {
			Static71.anInt1499 = -Static355.anInt5409;
			Static355.anInt5409 = 0;
		} else {
			Static71.anInt1499 = 0;
		}
		Static240.anInt3965 = Static323.anInt5049 + Static112.anInt2200;
		if (Static240.anInt3965 > Static51.anInt1108) {
			Static240.anInt3965 = Static51.anInt1108;
		}
		Static181.anInt3123 = Static417.anInt6041 + Static112.anInt2200;
		if (Static181.anInt3123 > Static245.anInt7888) {
			Static181.anInt3123 = Static245.anInt7888;
		}
		@Pc(72) boolean[][] local72 = Static537.aBooleanArrayArray32;
		@Pc(74) boolean[][] local74 = Static211.aBooleanArrayArray37;
		@Pc(78) int local78;
		@Pc(81) int local81;
		@Pc(83) int local83;
		if (Static284.aBoolean342) {
			for (local78 = 0; local78 < Static112.anInt2200 + Static112.anInt2200 + 2; local78++) {
				local81 = 0;
				local83 = 0;
				for (@Pc(85) int local85 = 0; local85 < Static112.anInt2200 + Static112.anInt2200 + 2; local85++) {
					if (local85 > 1) {
						Static443.anIntArray478[local85 - 2] = local81;
					}
					local81 = local83;
					@Pc(103) int local103 = Static323.anInt5049 + local78 - Static112.anInt2200;
					@Pc(109) int local109 = Static417.anInt6041 + local85 - Static112.anInt2200;
					@Pc(123) int local123;
					if (local103 >= 0 && local109 >= 0 && local103 < Static51.anInt1108 && local109 < Static245.anInt7888) {
						local123 = local103 << Static273.anInt4424;
						@Pc(127) int local127 = local109 << Static273.anInt4424;
						@Pc(144) int local144 = Static655.aClass42Array5[Static655.aClass42Array5.length - 1].method7450(local109, local103) - (0x3E8 << Static273.anInt4424 - 7);
						@Pc(166) int local166 = Static146.aClass42Array3 == null ? Static655.aClass42Array5[0].method7450(local109, local103) + Static63.anInt1356 : Static146.aClass42Array3[0].method7450(local109, local103) + Static63.anInt1356;
						local83 = arg15 >= 0 ? Static246.aClass33_6.r(local123, local144, local127, local123, local166, local127, arg15) : Static246.aClass33_6.JA(local123, local144, local127, local123, local166, local127);
						Static211.aBooleanArrayArray37[local78][local85] = local83 == 0;
					} else {
						local83 = -1;
						Static211.aBooleanArrayArray37[local78][local85] = false;
					}
					if (local78 > 0 && local85 > 0) {
						local123 = Static443.anIntArray478[local85 - 1] & Static443.anIntArray478[local85] & local81 & local83;
						Static537.aBooleanArrayArray32[local78 - 1][local85 - 1] = local123 == 0;
					}
				}
				Static443.anIntArray478[Static112.anInt2200 + Static112.anInt2200] = local81;
				Static443.anIntArray478[Static112.anInt2200 + Static112.anInt2200 + 1] = local83;
			}
			if (arg15 >= 0) {
				Static142.aBoolean362 = false;
			} else {
				Static400.anIntArray443 = arg5;
				Static153.anIntArray203 = arg6;
				Static54.anIntArray79 = arg7;
				Static152.anIntArray202 = arg8;
				Static603.anIntArray653 = arg9;
				Static547.method7287(arg10, Static246.aClass33_6);
			}
		} else {
			if (Static30.aBooleanArrayArray6 == null) {
				Static30.aBooleanArrayArray6 = new boolean[Static51.anInt1108 + Static51.anInt1108 + 1][Static245.anInt7888 + Static51.anInt1108 + 1];
			}
			for (local78 = 0; local78 < Static30.aBooleanArrayArray6.length; local78++) {
				for (local81 = 0; local81 < Static30.aBooleanArrayArray6[0].length; local81++) {
					Static30.aBooleanArrayArray6[local78][local81] = true;
				}
			}
			Static211.aBooleanArrayArray37 = Static30.aBooleanArrayArray6;
			Static537.aBooleanArrayArray32 = Static30.aBooleanArrayArray6;
			Static358.anInt5430 = 0;
			Static355.anInt5409 = 0;
			Static240.anInt3965 = Static51.anInt1108;
			Static181.anInt3123 = Static245.anInt7888;
			Static142.aBoolean362 = false;
		}
		Static89.method1794(Static246.aClass33_6);
		if (!Static419.aClass223_4.aBoolean411) {
			@Pc(349) Class236 local349 = Static419.aClass223_4.aClass236_5;
			for (@Pc(354) Class3_Sub6 local354 = (Class3_Sub6) local349.method4958(); local354 != null; local354 = (Class3_Sub6) local349.method4950()) {
				local354.method8898();
				Static405.method5135(local354);
			}
		}
		if (Static95.aBoolean132) {
			for (local78 = 0; local78 < Static355.anInt5402; local78++) {
				Static217.aClass85Array1[local78].method2170(arg14, arg0);
			}
		}
		if (Static186.aBoolean244) {
			Static660.anIntArray717 = Static246.aClass33_6.Y();
			Static246.aClass33_6.K(Static105.anIntArray143);
			local78 = (Static105.anIntArray143[2] - Static105.anIntArray143[0]) / Static71.anInt1495;
			for (local81 = 0; local81 < Static71.anInt1495 - 1; local81++) {
				Static562.anIntArray614[local81] = local78 * (local81 + 1) + Static405.anIntArray446[local81];
			}
			for (local83 = 0; local83 < Static409.aClass10Array1.length; local83++) {
				Static409.aClass10Array1[local83].method194();
			}
		}
		if (Static540.aClass73ArrayArrayArray3 != null) {
			if (Static186.aBoolean244) {
				Static337.method4618(0);
			}
			Static365.method4835(true);
			Static246.aClass33_6.ra(-1, 1583160, 40, 127);
			Static359.method4795(true, arg4, arg10, arg11, arg15, arg16, arg17);
			if (Static186.aBoolean244) {
				Static43.method809();
			}
			Static246.aClass33_6.pa();
			Static365.method4835(false);
		}
		Static359.method4795(false, arg4, arg10, arg11, arg15, arg16, arg17);
		if (Static186.aBoolean244) {
			for (local78 = 0; local78 < Static539.anInt8345; local78++) {
				Static471.aBooleanArrayArrayArray2[local78] = Static444.aBooleanArrayArrayArray1[local78];
			}
			Static337.method4618(0);
			for (local81 = 0; local81 < Static409.aClass10Array1.length; local81++) {
				Static409.aClass10Array1[local81].method194();
			}
		}
		if (Static186.aBoolean244) {
			Static43.method809();
			for (local78 = 0; local78 < Static539.anInt8345; local78++) {
				Static444.aBooleanArrayArrayArray1[local78] = Static471.aBooleanArrayArrayArray2[local78];
			}
			if (Static290.anInt4589 == 2) {
				@Pc(543) int local543;
				if (Static673.aLongArray21[0] < Static673.aLongArray21[1]) {
					if (Static562.anIntArray614[0] + Static405.anIntArray446[0] > Static105.anIntArray143[0]) {
						local543 = Static405.anIntArray446[0]++;
					}
				} else if (Static673.aLongArray21[0] > Static673.aLongArray21[1] && Static562.anIntArray614[0] + Static405.anIntArray446[0] < Static105.anIntArray143[2]) {
					local543 = Static405.anIntArray446[0]--;
				}
			}
		}
		if (!Static284.aBoolean342) {
			Static537.aBooleanArrayArray32 = local72;
			Static211.aBooleanArrayArray37 = local74;
		}
		Static217.method3241();
	}
}
