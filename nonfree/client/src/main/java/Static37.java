import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Lclient!vc;")
	public static Class77 aClass77_1;

	@OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
	public static int anInt929;

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
	public static int anInt930;

	@OriginalMember(owner = "client!fe", name = "B", descriptor = "Lclient!qc;")
	private static Class60 aClass60_398 = Static121.method2047("green:");

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "Lclient!qc;")
	public static Class60 aClass60_389 = aClass60_398;

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
	public static int anInt926 = 0;

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "[Z")
	public static boolean[] aBooleanArray5 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "Lclient!qc;")
	public static Class60 aClass60_390 = Static121.method2047("::errortest");

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "Lclient!qc;")
	private static Class60 aClass60_391 = Static121.method2047("Free world");

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "Lclient!qc;")
	public static Class60 aClass60_392 = aClass60_398;

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "Lclient!qc;")
	private static Class60 aClass60_393 = Static121.method2047("wishes to trade with you)3");

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "Lclient!qc;")
	public static Class60 aClass60_394 = aClass60_393;

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "Lclient!qc;")
	public static Class60 aClass60_395 = Static121.method2047("p11_full");

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "Lclient!qc;")
	public static Class60 aClass60_396 = aClass60_391;

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "Lclient!qc;")
	public static Class60 aClass60_397 = Static121.method2047("cross");

	@OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
	public static int anInt932 = 0;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!qc;Lclient!qc;Lclient!qc;B)V")
	public static void method637(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) Class60 arg2) {
		Static33.aClass60_368 = arg2;
		Static33.aClass60_362 = arg1;
		Static33.aClass60_364 = arg0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)Z")
	public static boolean method638(@OriginalArg(1) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public static void method639() {
		aClass60_390 = null;
		aClass60_393 = null;
		aClass60_389 = null;
		aClass60_391 = null;
		aClass60_396 = null;
		aClass60_395 = null;
		aBooleanArray5 = null;
		aClass60_398 = null;
		aClass60_397 = null;
		aClass77_1 = null;
		aClass60_394 = null;
		aClass60_392 = null;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)I")
	public static int method640() {
		@Pc(12) int local12 = 3;
		if (Static120.anInt1940 < 310) {
			@Pc(21) int local21 = Static88.anInt2065 >> 7;
			@Pc(26) int local26 = Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2620 >> 7;
			@Pc(31) int local31 = Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2601 >> 7;
			@Pc(35) int local35 = Static74.anInt1856 >> 7;
			if ((Static95.aByteArrayArrayArray5[Static129.anInt3003][local21][local35] & 0x4) != 0) {
				local12 = Static129.anInt3003;
			}
			@Pc(61) int local61;
			if (local21 >= local26) {
				local61 = local21 - local26;
			} else {
				local61 = local26 - local21;
			}
			@Pc(80) int local80;
			if (local31 > local35) {
				local80 = local31 - local35;
			} else {
				local80 = local35 - local31;
			}
			@Pc(100) int local100;
			@Pc(102) int local102;
			if (local80 >= local61) {
				local100 = local61 * 65536 / local80;
				local102 = 32768;
				while (local35 != local31) {
					if (local31 > local35) {
						local35++;
					} else if (local31 < local35) {
						local35--;
					}
					local102 += local100;
					if ((Static95.aByteArrayArrayArray5[Static129.anInt3003][local21][local35] & 0x4) != 0) {
						local12 = Static129.anInt3003;
					}
					if (local102 >= 65536) {
						if (local21 < local26) {
							local21++;
						} else if (local21 > local26) {
							local21--;
						}
						local102 -= 65536;
						if ((Static95.aByteArrayArrayArray5[Static129.anInt3003][local21][local35] & 0x4) != 0) {
							local12 = Static129.anInt3003;
						}
					}
				}
			} else {
				local102 = 32768;
				local100 = local80 * 65536 / local61;
				while (local26 != local21) {
					local102 += local100;
					if (local26 > local21) {
						local21++;
					} else if (local26 < local21) {
						local21--;
					}
					if ((Static95.aByteArrayArrayArray5[Static129.anInt3003][local21][local35] & 0x4) != 0) {
						local12 = Static129.anInt3003;
					}
					if (local102 >= 65536) {
						local102 -= 65536;
						if (local31 > local35) {
							local35++;
						} else if (local31 < local35) {
							local35--;
						}
						if ((Static95.aByteArrayArrayArray5[Static129.anInt3003][local21][local35] & 0x4) != 0) {
							local12 = Static129.anInt3003;
						}
					}
				}
			}
		}
		if ((Static95.aByteArrayArrayArray5[Static129.anInt3003][Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2620 >> 7][Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2601 >> 7] & 0x4) != 0) {
			local12 = Static129.anInt3003;
		}
		return local12;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)V")
	public static void method641(@OriginalArg(0) int arg0) {
		Static84.anInt2019 += arg0 * 128;
		@Pc(20) int local20;
		if (Static84.anInt2019 > Static38.anIntArray73.length) {
			local20 = (int) (Math.random() * 12.0D);
			Static84.anInt2019 -= Static38.anIntArray73.length;
			Static114.method1934(Static103.aClass4_Sub4_Sub3_Sub1Array6[local20]);
		}
		local20 = 0;
		@Pc(42) int local42 = arg0 * 128;
		@Pc(49) int local49 = (256 - arg0) * 128;
		@Pc(75) int local75;
		for (@Pc(51) int local51 = 0; local51 < local49; local51++) {
			local75 = Static84.anIntArray203[local42 + local20] - Static38.anIntArray73[Static38.anIntArray73.length - 1 & local20 + Static84.anInt2019] * arg0 / 6;
			if (local75 < 0) {
				local75 = 0;
			}
			Static84.anIntArray203[local20++] = local75;
		}
		@Pc(105) int local105;
		@Pc(107) int local107;
		@Pc(114) int local114;
		for (local75 = 256 - arg0; local75 < 256; local75++) {
			local105 = local75 * 128;
			for (local107 = 0; local107 < 128; local107++) {
				local114 = (int) (Math.random() * 100.0D);
				if (local114 < 50 && local107 > 10 && local107 < 118) {
					Static84.anIntArray203[local105 + local107] = 255;
				} else {
					Static84.anIntArray203[local107 + local105] = 0;
				}
			}
		}
		if (Static111.anInt2692 > 0) {
			Static111.anInt2692 -= arg0 * 4;
		}
		if (Static129.anInt2996 > 0) {
			Static129.anInt2996 -= arg0 * 4;
		}
		if (Static111.anInt2692 == 0 && Static129.anInt2996 == 0) {
			local105 = (int) ((double) (2000 / arg0) * Math.random());
			if (local105 == 0) {
				Static111.anInt2692 = 1024;
			}
			if (local105 == 1) {
				Static129.anInt2996 = 1024;
			}
		}
		for (local105 = 0; local105 < 256 - arg0; local105++) {
			Static131.anIntArray341[local105] = Static131.anIntArray341[arg0 + local105];
		}
		for (local107 = 256 - arg0; local107 < 256; local107++) {
			Static131.anIntArray341[local107] = (int) (Math.sin((double) Static16.anInt443 / 14.0D) * 16.0D + Math.sin((double) Static16.anInt443 / 15.0D) * 14.0D + Math.sin((double) Static16.anInt443 / 16.0D) * 12.0D);
			Static16.anInt443++;
		}
		Static88.anInt2069 += arg0;
		local114 = ((Static81.anInt1944 & 0x1) + arg0) / 2;
		if (local114 <= 0) {
			return;
		}
		@Pc(300) int local300;
		@Pc(307) int local307;
		for (@Pc(291) int local291 = 0; local291 < Static88.anInt2069 * 100; local291++) {
			local300 = (int) (Math.random() * 124.0D) + 2;
			local307 = (int) (Math.random() * 128.0D) + 128;
			Static84.anIntArray203[(local307 << 7) + local300] = 192;
		}
		Static88.anInt2069 = 0;
		@Pc(337) int local337;
		@Pc(340) int local340;
		for (local300 = 0; local300 < 256; local300++) {
			local307 = 0;
			local337 = local300 * 128;
			for (local340 = -local114; local340 < 128; local340++) {
				if (local340 + local114 < 128) {
					local307 += Static84.anIntArray203[local114 + local337 + local340];
				}
				if (local340 - local114 - 1 >= 0) {
					local307 -= Static84.anIntArray203[local337 + local340 - local114 - 1];
				}
				if (local340 >= 0) {
					Static47.anIntArray117[local337 + local340] = local307 / (local114 * 2 + 1);
				}
			}
		}
		for (local307 = 0; local307 < 128; local307++) {
			local337 = 0;
			for (local340 = -local114; local340 < 256; local340++) {
				@Pc(425) int local425 = local340 * 128;
				if (local114 + local340 < 256) {
					local337 += Static47.anIntArray117[local114 * 128 + local425 + local307];
				}
				if (local340 - local114 - 1 >= 0) {
					local337 -= Static47.anIntArray117[local307 + local425 - (local114 - -1) * 128];
				}
				if (local340 >= 0) {
					Static84.anIntArray203[local425 + local307] = local337 / (local114 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!kd;IILclient!oa;)V")
	public static void method642(@OriginalArg(0) Class40_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class54 arg2) {
		@Pc(7) Class4_Sub6 local7 = new Class4_Sub6();
		local7.aClass40_Sub1_6 = arg0;
		local7.aLong100 = arg1;
		local7.aClass54_1 = arg2;
		local7.anInt669 = 1;
		@Pc(22) Class70 local22 = Static60.aClass70_16;
		synchronized (Static60.aClass70_16) {
			Static60.aClass70_16.method1931(local7);
		}
		Static1.method2();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZBIZZ)Lclient!kd;")
	public static Class40_Sub1 method643(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(11) Class54 local11 = null;
		if (Static61.aClass29_1 != null) {
			local11 = new Class54(arg1, Static61.aClass29_1, Static33.aClass29Array1[arg1], 1000000);
		}
		return new Class40_Sub1(local11, Static75.aClass54_4, arg1, arg2, arg3, arg0);
	}
}
