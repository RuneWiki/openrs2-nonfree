import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!v", name = "k", descriptor = "Lclient!eb;")
	public static Class17 aClass17_11 = new Class17(260);

	@OriginalMember(owner = "client!v", name = "q", descriptor = "Lclient!qf;")
	public static Class60 aClass60_257 = Static59.method1195("sl_arrows");

	@OriginalMember(owner = "client!v", name = "w", descriptor = "Lclient!qf;")
	public static Class60 aClass60_258 = Static59.method1195("null");

	@OriginalMember(owner = "client!v", name = "K", descriptor = "Lclient!qf;")
	public static Class60 aClass60_259 = Static59.method1195("null");

	@OriginalMember(owner = "client!v", name = "O", descriptor = "I")
	public static int anInt720 = 0;

	@OriginalMember(owner = "client!v", name = "Q", descriptor = "Lclient!qf;")
	public static Class60 aClass60_260 = Static59.method1195("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!v", name = "S", descriptor = "Lclient!qf;")
	public static Class60 aClass60_261 = Static59.method1195("::errortest");

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(III)V")
	public static void method462(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class3_Sub1_Sub6 local7 = Static41.method942(arg1);
		@Pc(10) int local10 = local7.anInt1140;
		@Pc(13) int local13 = local7.anInt1142;
		@Pc(24) int local24 = local7.anInt1154;
		@Pc(31) int local31 = Class3_Sub1_Sub1_Sub3.anIntArray185[local10 - local24];
		if (arg0 < 0 || local31 < arg0) {
			arg0 = 0;
		}
		local31 <<= local24;
		Static18.anIntArray80[local13] = Static18.anIntArray80[local13] & ~local31 | local31 & arg0 << local24;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I[BLclient!ca;I)V")
	public static void method464(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) int arg2) {
		@Pc(3) Class3_Sub20 local3 = new Class3_Sub20();
		local3.anInt2997 = 0;
		local3.aByteArray79 = arg0;
		local3.aClass13_4 = arg1;
		local3.aLong107 = arg2;
		@Pc(18) Class5 local18 = Static28.aClass5_22;
		synchronized (Static28.aClass5_22) {
			Static28.aClass5_22.method87(local3);
		}
		Static61.method1248();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IJ)V")
	public static void method468(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < Static107.anInt3035; local12++) {
			if (Static113.aLongArray5[local12] == arg0) {
				Static118.aBoolean115 = true;
				Static107.anInt3035--;
				for (@Pc(32) int local32 = local12; local32 < Static107.anInt3035; local32++) {
					Static113.aLongArray5[local32] = Static113.aLongArray5[local32 + 1];
				}
				Static81.aClass3_Sub12_Sub1_2.method1980(80);
				Static81.aClass3_Sub12_Sub1_2.method1972(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(I)V")
	public static void method469() {
		Static6.aClass39_1.method2141();
		for (@Pc(16) int local16 = 0; local16 < 32; local16++) {
			Static70.aLongArray3[local16] = 0L;
		}
		for (@Pc(30) int local30 = 0; local30 < 32; local30++) {
			Static67.aLongArray2[local30] = 0L;
		}
		Static63.anInt2914 = 0;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(JZ)V")
	public static void method470(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static61.anInt1946; local17++) {
			if (Static83.aLongArray4[local17] == arg0) {
				Static61.anInt1946--;
				Static118.aBoolean115 = true;
				for (@Pc(33) int local33 = local17; local33 < Static61.anInt1946; local33++) {
					Static54.aClass60Array6[local33] = Static54.aClass60Array6[local33 + 1];
					Static41.anIntArray159[local33] = Static41.anIntArray159[local33 + 1];
					Static83.aLongArray4[local33] = Static83.aLongArray4[local33 + 1];
					Static26.anIntArray123[local33] = Static26.anIntArray123[local33 + 1];
				}
				Static80.anInt2518 += 32;
				Static81.aClass3_Sub12_Sub1_2.method1980(93);
				Static81.aClass3_Sub12_Sub1_2.method1972(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V")
	public static void method472() {
		aClass17_11.method646();
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(I)V")
	public static void method474() {
		aClass60_258 = null;
		aClass60_261 = null;
		aClass60_260 = null;
		aClass60_259 = null;
		aClass60_257 = null;
		aClass17_11 = null;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILclient!mf;)I")
	public static int method476(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg1.anIntArrayArray56 == null || arg1.anIntArrayArray56.length <= arg0) {
			return -2;
		}
		try {
			@Pc(24) int[] local24 = arg1.anIntArrayArray56[arg0];
			@Pc(26) int local26 = 0;
			@Pc(28) int local28 = 0;
			@Pc(30) byte local30 = 0;
			while (true) {
				@Pc(32) int local32 = 0;
				@Pc(37) int local37 = local24[local28++];
				@Pc(39) byte local39 = 0;
				if (local37 == 0) {
					return local26;
				}
				if (local37 == 15) {
					local39 = 1;
				}
				if (local37 == 16) {
					local39 = 2;
				}
				if (local37 == 1) {
					local32 = Static68.anIntArray218[local24[local28++]];
				}
				if (local37 == 2) {
					local32 = Static33.anIntArray137[local24[local28++]];
				}
				if (local37 == 17) {
					local39 = 3;
				}
				if (local37 == 3) {
					local32 = Static3.anIntArray23[local24[local28++]];
				}
				@Pc(100) int local100;
				@Pc(111) Class3_Sub15 local111;
				@Pc(116) int local116;
				@Pc(128) int local128;
				if (local37 == 4) {
					local100 = local24[local28++] << 16;
					@Pc(107) int local107 = local100 + local24[local28++];
					local111 = Static86.method1067(local107);
					local116 = local24[local28++];
					if (local116 != -1 && (!Static22.method568(local116).aBoolean57 || Static124.aBoolean117)) {
						for (local128 = 0; local128 < local111.anIntArray235.length; local128++) {
							if (local111.anIntArray235[local128] == local116 + 1) {
								local32 += local111.anIntArray230[local128];
							}
						}
					}
				}
				if (local37 == 5) {
					local32 = Static18.anIntArray80[local24[local28++]];
				}
				if (local37 == 6) {
					local32 = Class3_Sub1_Sub1_Sub2.anIntArray25[Static33.anIntArray137[local24[local28++]] - 1];
				}
				if (local37 == 7) {
					local32 = Static18.anIntArray80[local24[local28++]] * 100 / 46875;
				}
				if (local37 == 8) {
					local32 = Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt622;
				}
				if (local37 == 9) {
					for (local100 = 0; local100 < 25; local100++) {
						if (Static105.aBooleanArray63[local100]) {
							local32 += Static33.anIntArray137[local100];
						}
					}
				}
				if (local37 == 10) {
					local100 = local24[local28++] << 16;
					local100 += local24[local28++];
					local111 = Static86.method1067(local100);
					local116 = local24[local28++];
					if (local116 != -1 && (!Static22.method568(local116).aBoolean57 || Static124.aBoolean117)) {
						for (local128 = 0; local128 < local111.anIntArray235.length; local128++) {
							if (local116 + 1 == local111.anIntArray235[local128]) {
								local32 = 999999999;
								break;
							}
						}
					}
				}
				if (local37 == 11) {
					local32 = Static17.anInt764;
				}
				if (local37 == 12) {
					local32 = Static130.anInt3476;
				}
				if (local37 == 13) {
					local100 = Static18.anIntArray80[local24[local28++]];
					@Pc(314) int local314 = local24[local28++];
					local32 = (0x1 << local314 & local100) == 0 ? 0 : 1;
				}
				if (local37 == 14) {
					local100 = local24[local28++];
					local32 = Static35.method780(local100);
				}
				if (local37 == 18) {
					local32 = (Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1524 >> 7) + Static112.anInt3118;
				}
				if (local37 == 19) {
					local32 = (Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1494 >> 7) + Static13.anInt410;
				}
				if (local37 == 20) {
					local32 = local24[local28++];
				}
				if (local39 == 0) {
					if (local30 == 0) {
						local26 += local32;
					}
					if (local30 == 1) {
						local26 -= local32;
					}
					if (local30 == 2 && local32 != 0) {
						local26 /= local32;
					}
					if (local30 == 3) {
						local26 *= local32;
					}
					local30 = 0;
				} else {
					local30 = local39;
				}
			}
		} catch (@Pc(413) Exception local413) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!v", name = "h", descriptor = "(I)I")
	public static int method480() {
		return Static10.anInt326++;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II[BLclient!qb;I[Lclient!td;)V")
	public static void method482(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class58 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class72[] arg4) {
		@Pc(12) int local12 = -1;
		@Pc(17) Class3_Sub12 local17 = new Class3_Sub12(arg1);
		while (true) {
			@Pc(21) int local21 = local17.method1948();
			if (local21 == 0) {
				return;
			}
			local12 += local21;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local17.method1948();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(45) int local45 = local29 & 0x3F;
				@Pc(49) int local49 = local29 >> 12;
				@Pc(53) int local53 = local17.method1936();
				@Pc(59) int local59 = local29 >> 6 & 0x3F;
				@Pc(63) int local63 = local53 >> 2;
				@Pc(67) int local67 = arg0 + local59;
				@Pc(71) int local71 = arg3 + local45;
				@Pc(75) int local75 = local53 & 0x3;
				if (local67 > 0 && local71 > 0 && local67 < 103 && local71 < 103) {
					@Pc(92) int local92 = local49;
					if ((Static60.aByteArrayArrayArray4[1][local67][local71] & 0x2) == 2) {
						local92 = local49 - 1;
					}
					@Pc(106) Class72 local106 = null;
					if (local92 >= 0) {
						local106 = arg4[local92];
					}
					Static103.method2013(local75, local71, arg2, local67, local12, local106, local63, local49);
				}
			}
		}
	}
}
