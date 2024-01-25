import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "Lclient!la;")
	public static Class35 aClass35_7;

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "J")
	public static long aLong198;

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
	public static int anInt4768 = 0;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!wv;Lclient!r;III)V")
	public static void method4066(@OriginalArg(0) Class365 arg0, @OriginalArg(1) Class12 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) Class200 local15 = arg0.method7902(arg1);
		if (local15 == null) {
			return;
		}
		arg1.da(arg2, arg3, arg2 + arg0.anInt9578, arg3 + arg0.anInt9638);
		if (Static389.anInt6778 == 2 || Static389.anInt6778 == 5 || Static243.aClass10_15 == null) {
			arg1.FA(-16777216, local15, arg2, arg3);
			return;
		}
		@Pc(54) int local54;
		@Pc(56) int local56;
		@Pc(52) int local52;
		@Pc(58) int local58;
		if (Static585.anInt9461 == 4) {
			local52 = (int) -Static143.aFloat61 & 0x3FFF;
			local54 = Static116.anInt2337;
			local56 = anInt4768;
			local58 = 4096;
		} else {
			local52 = (int) -Static143.aFloat61 + Static368.anInt6520 & 0x3FFF;
			local58 = 4096 - Static536.anInt8845 * 16;
			local56 = Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8795;
			local54 = Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8796;
		}
		@Pc(92) int local92 = local54 / 128 + 48 - (Static500.anInt6888 + -104) * 2;
		@Pc(109) int local109 = Static573.anInt9325 * 4 + 48 - local56 / 128 - (Static573.anInt9325 + -104) * 2;
		Static243.aClass10_15.method7673((float) arg0.anInt9578 / 2.0F + (float) arg2, (float) arg3 + (float) arg0.anInt9638 / 2.0F, (float) local92, (float) local109, local58, local52 << 2, local15, arg2, arg3);
		@Pc(160) int local160;
		@Pc(170) int local170;
		@Pc(180) int local180;
		@Pc(191) int local191;
		for (@Pc(143) Class1_Sub32 local143 = (Class1_Sub32) Static590.aClass361_102.method7854(); local143 != null; local143 = (Class1_Sub32) Static590.aClass361_102.method7853()) {
			@Pc(148) int local148 = local143.anInt6144;
			local160 = (Static53.aClass236_1.anIntArray441[local148] >> 14 & 0x3FFF) - Static376.anInt6631;
			local170 = (Static53.aClass236_1.anIntArray441[local148] & 0x3FFF) - Static24.anInt674;
			local180 = local160 * 4 + 2 - local54 / 128;
			local191 = local170 * 4 + 2 - local56 / 128;
			Static537.method7483(Static53.aClass236_1.anIntArray443[local148], arg2, local15, local191, arg3, local180, arg0, arg1);
		}
		for (local160 = 0; local160 < Static568.anInt9276; local160++) {
			local170 = Static354.anIntArray415[local160] * 4 + 2 - local54 / 128;
			local180 = Static439.anIntArray507[local160] * 4 + 2 - local56 / 128;
			@Pc(247) Class306 local247 = Static146.aClass214_1.method4897(Static1.anIntArray1[local160]);
			if (local247.anIntArray570 != null) {
				local247 = local247.method6966(Static121.aClass148_1);
				if (local247 == null || local247.anInt8409 == -1) {
					continue;
				}
			}
			Static537.method7483(local247.anInt8409, arg2, local15, local180, arg3, local170, arg0, arg1);
		}
		@Pc(332) int local332;
		@Pc(343) int local343;
		for (@Pc(284) Class1_Sub37 local284 = (Class1_Sub37) Static186.aClass356_13.method7792(); local284 != null; local284 = (Class1_Sub37) Static186.aClass356_13.method7795()) {
			local180 = (int) (local284.aLong425 >> 28 & 0x3L);
			if (Static76.anInt1848 == local180) {
				local191 = (int) (local284.aLong425 & 0x3FFFL) - Static376.anInt6631;
				@Pc(321) int local321 = (int) (local284.aLong425 >> 14 & 0x3FFFL) - Static24.anInt674;
				local332 = local191 * 4 + 2 - local54 / 128;
				local343 = local321 * 4 + 2 - local56 / 128;
				Static229.method7248(arg3, local343, arg0, local15, local332, arg2, Static523.aClass10Array25[0]);
			}
		}
		@Pc(432) int local432;
		for (local180 = 0; local180 < Static480.anInt8097; local180++) {
			@Pc(376) Class1_Sub39 local376 = (Class1_Sub39) Static131.aClass356_32.method7796((long) Static542.anIntArray599[local180]);
			if (local376 != null) {
				@Pc(381) Class20_Sub2_Sub4_Sub1_Sub2 local381 = local376.aClass20_Sub2_Sub4_Sub1_Sub2_2;
				if (local381.method5362() && Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116 == local381.aByte116) {
					@Pc(395) Class162 local395 = local381.aClass162_1;
					if (local395 != null && local395.anIntArray267 != null) {
						local395 = local395.method3802(Static121.aClass148_1);
					}
					if (local395 != null && local395.aBoolean348 && local395.aBoolean349) {
						local343 = local381.anInt8796 / 128 - local54 / 128;
						local432 = local381.anInt8795 / 128 - local56 / 128;
						if (local395.anInt4389 == -1) {
							Static229.method7248(arg3, local432, arg0, local15, local343, arg2, Static523.aClass10Array25[1]);
						} else {
							Static537.method7483(local395.anInt4389, arg2, local15, local432, arg3, local343, arg0, arg1);
						}
					}
				}
			}
		}
		local191 = Static60.anInt1505;
		@Pc(468) int[] local468 = Static346.anIntArray413;
		@Pc(516) int local516;
		@Pc(520) int local520;
		@Pc(545) int local545;
		for (local332 = 0; local332 < local191; local332++) {
			@Pc(478) Class20_Sub2_Sub4_Sub1_Sub1 local478 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local468[local332]];
			if (local478 != null && local478.method4143() && local478 != Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2 && Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116 == local478.aByte116) {
				local432 = local478.anInt8796 / 128 - local54 / 128;
				local516 = local478.anInt8795 / 128 - local56 / 128;
				@Pc(518) boolean local518 = false;
				for (local520 = 0; local520 < Static184.anInt5417; local520++) {
					if (local478.aString49.equals(Static333.aStringArray26[local520]) && Static476.anIntArray532[local520] != 0) {
						local518 = true;
						break;
					}
				}
				@Pc(543) boolean local543 = false;
				for (local545 = 0; local545 < Static280.anInt5146; local545++) {
					if (local478.aString49.equals(Static254.aClass69Array1[local545].aString21)) {
						local543 = true;
						break;
					}
				}
				@Pc(569) boolean local569 = false;
				if (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt4933 != 0 && local478.anInt4933 != 0 && local478.anInt4933 == Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt4933) {
					local569 = true;
				}
				if (local478.aBoolean378) {
					Static229.method7248(arg3, local516, arg0, local15, local432, arg2, Static523.aClass10Array25[6]);
				} else if (local518) {
					Static229.method7248(arg3, local516, arg0, local15, local432, arg2, Static523.aClass10Array25[3]);
				} else if (local543) {
					Static229.method7248(arg3, local516, arg0, local15, local432, arg2, Static523.aClass10Array25[5]);
				} else if (local569) {
					Static229.method7248(arg3, local516, arg0, local15, local432, arg2, Static523.aClass10Array25[4]);
				} else {
					Static229.method7248(arg3, local516, arg0, local15, local432, arg2, Static523.aClass10Array25[2]);
				}
			}
		}
		@Pc(670) Class221[] local670 = Static276.aClass221Array1;
		@Pc(755) int local755;
		for (local432 = 0; local432 < local670.length; local432++) {
			@Pc(678) Class221 local678 = local670[local432];
			if (local678 != null && local678.anInt6039 != 0 && Static81.anInt1910 % 20 < 10) {
				@Pc(719) int local719;
				if (local678.anInt6039 == 1) {
					@Pc(704) Class1_Sub39 local704 = (Class1_Sub39) Static131.aClass356_32.method7796((long) local678.anInt6044);
					if (local704 != null) {
						@Pc(709) Class20_Sub2_Sub4_Sub1_Sub2 local709 = local704.aClass20_Sub2_Sub4_Sub1_Sub2_2;
						local719 = local709.anInt8796 / 128 - local54 / 128;
						local545 = local709.anInt8795 / 128 - local56 / 128;
						Static112.method1975(local719, arg3, local15, 360000L, local678.anInt6041, local545, arg0, arg2);
					}
				}
				if (local678.anInt6039 == 2) {
					local755 = local678.anInt6035 / 128 - local54 / 128;
					local520 = local678.anInt6042 / 128 - local56 / 128;
					@Pc(771) long local771 = (long) (local678.anInt6038 << 7);
					@Pc(775) long local775 = local771 * local771;
					Static112.method1975(local755, arg3, local15, local775, local678.anInt6041, local520, arg0, arg2);
				}
				if (local678.anInt6039 == 10 && local678.anInt6044 >= 0 && local678.anInt6044 < Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6.length) {
					@Pc(805) Class20_Sub2_Sub4_Sub1_Sub1 local805 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local678.anInt6044];
					if (local805 != null) {
						local520 = local805.anInt8796 / 128 - local54 / 128;
						local719 = local805.anInt8795 / 128 - local56 / 128;
						Static112.method1975(local520, arg3, local15, 360000L, local678.anInt6041, local719, arg0, arg2);
					}
				}
			}
		}
		if (Static585.anInt9461 == 4) {
			return;
		}
		if (Static90.anInt1998 != 0) {
			local516 = Static90.anInt1998 * 4 + Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.method5349() * 2 + 2 - local54 / 128 - 2;
			local755 = Static328.anInt5893 * 4 + Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.method5349() * 2 + 2 - local56 / 128 - 2;
			Static229.method7248(arg3, local755, arg0, local15, local516, arg2, Static482.aClass10Array21[Static275.aBoolean387 ? 1 : 0]);
		}
		arg1.method6418(3, arg0.anInt9578 / 2 + arg2 - 1, arg3 + -1 + arg0.anInt9638 / 2, 3, -1);
		return;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)I")
	public static int method4072(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
