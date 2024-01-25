import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!lq", name = "B", descriptor = "I")
	public static int anInt6607;

	@OriginalMember(owner = "client!lq", name = "x", descriptor = "[[I")
	public static final int[][] anIntArrayArray28 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!lq", name = "A", descriptor = "I")
	public static int anInt6606 = -1;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BII)Z")
	public static boolean method5521(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "(B)V")
	public static void method5523() {
		for (@Pc(3) int local3 = 0; local3 < Static125.anInt3107; local3++) {
			@Pc(9) int local9 = Static635.anIntArray570[local3];
			@Pc(17) Class9_Sub4_Sub2_Sub1_Sub1 local17 = ((Class6_Sub42) Static461.aClass380_35.method8747((long) local9)).aClass9_Sub4_Sub2_Sub1_Sub1_1;
			@Pc(21) int local21 = Static84.aClass6_Sub8_Sub1_1.method8246();
			if ((local21 & 0x20) != 0) {
				local21 += Static84.aClass6_Sub8_Sub1_1.method8246() << 8;
			}
			if ((local21 & 0x2000) != 0) {
				local17.anInt4303 = Static84.aClass6_Sub8_Sub1_1.method8201();
				local17.anInt4273 = Static84.aClass6_Sub8_Sub1_1.method8251();
				local17.anInt4291 = Static84.aClass6_Sub8_Sub1_1.method8204();
				local17.anInt4318 = Static84.aClass6_Sub8_Sub1_1.method8251();
				local17.anInt4316 = Static84.aClass6_Sub8_Sub1_1.method8220() + Static384.anInt7234;
				local17.anInt4351 = Static84.aClass6_Sub8_Sub1_1.method8245() + Static384.anInt7234;
				local17.anInt4334 = Static84.aClass6_Sub8_Sub1_1.method8243();
				local17.anInt4291 += local17.anIntArray197[0];
				local17.anInt4318 += local17.anIntArray198[0];
				local17.anInt4359 = 1;
				local17.anInt4303 += local17.anIntArray197[0];
				local17.anInt4361 = 0;
				local17.anInt4273 += local17.anIntArray198[0];
			}
			@Pc(127) int local127;
			@Pc(131) int local131;
			@Pc(143) int local143;
			@Pc(135) int local135;
			@Pc(137) int local137;
			@Pc(139) int local139;
			@Pc(181) int local181;
			@Pc(185) int local185;
			if ((local21 & 0x4) != 0) {
				local127 = Static84.aClass6_Sub8_Sub1_1.method8243();
				if (local127 > 0) {
					for (local131 = 0; local131 < local127; local131++) {
						local135 = -1;
						local137 = -1;
						local139 = -1;
						local143 = Static84.aClass6_Sub8_Sub1_1.method8214();
						if (local143 == 32767) {
							local143 = Static84.aClass6_Sub8_Sub1_1.method8214();
							local137 = Static84.aClass6_Sub8_Sub1_1.method8214();
							local135 = Static84.aClass6_Sub8_Sub1_1.method8214();
							local139 = Static84.aClass6_Sub8_Sub1_1.method8214();
						} else if (local143 == 32766) {
							local143 = -1;
						} else {
							local137 = Static84.aClass6_Sub8_Sub1_1.method8214();
						}
						local181 = Static84.aClass6_Sub8_Sub1_1.method8214();
						local185 = Static84.aClass6_Sub8_Sub1_1.method8246();
						local17.method3623(local185, local137, local143, Static384.anInt7234, local139, local181, local135);
					}
				}
			}
			@Pc(246) int[] local246;
			@Pc(274) short[] local274;
			@Pc(299) short[] local299;
			@Pc(342) long local342;
			if ((local21 & 0x4000) != 0) {
				local127 = local17.aClass158_1.anIntArray261.length;
				local131 = 0;
				if (local17.aClass158_1.aShortArray70 != null) {
					local131 = local17.aClass158_1.aShortArray70.length;
				}
				if (local17.aClass158_1.aShortArray72 != null) {
					local131 = local17.aClass158_1.aShortArray72.length;
				}
				local135 = Static84.aClass6_Sub8_Sub1_1.method8247();
				if ((local135 & 0x1) != 1) {
					local246 = null;
					if ((local135 & 0x2) == 2) {
						local246 = new int[local127];
						for (local139 = 0; local139 < local127; local139++) {
							local246[local139] = Static84.aClass6_Sub8_Sub1_1.method8237();
						}
					}
					local274 = null;
					if ((local135 & 0x4) == 4) {
						local274 = new short[local131];
						for (local181 = 0; local181 < local131; local181++) {
							local274[local181] = (short) Static84.aClass6_Sub8_Sub1_1.method8229();
						}
					}
					local299 = null;
					if ((local135 & 0x8) == 8) {
						local299 = new short[0];
						for (local185 = 0; local185 < 0; local185++) {
							local299[local185] = (short) Static84.aClass6_Sub8_Sub1_1.method8237();
						}
					}
					local342 = (long) local9 | (long) local17.anInt2274++ << 32;
					new Class54(local342, local246, local274, local299);
				}
			}
			if ((local21 & 0x400) != 0) {
				local127 = Static84.aClass6_Sub8_Sub1_1.method8229();
				local17.anInt4320 = Static84.aClass6_Sub8_Sub1_1.method8243();
				local17.anInt4327 = Static84.aClass6_Sub8_Sub1_1.method8246();
				local17.aBoolean348 = (local127 & 0x8000) != 0;
				local17.anInt4349 = local127 & 0x7FFF;
				local17.anInt4340 = local17.anInt4349 + Static384.anInt7234 + local17.anInt4320;
			}
			if ((local21 & 0x2) != 0) {
				local127 = Static84.aClass6_Sub8_Sub1_1.method8229();
				if (local127 == 65535) {
					local127 = -1;
				}
				local131 = Static84.aClass6_Sub8_Sub1_1.method8266();
				local143 = Static84.aClass6_Sub8_Sub1_1.method8243();
				local135 = local143 & 0x7;
				local137 = local143 >> 3 & 0xF;
				if (local137 == 15) {
					local137 = -1;
				}
				local17.method3618(local137, false, local131, local135, local127);
			}
			if ((local21 & 0x8) != 0) {
				local17.anInt4293 = Static84.aClass6_Sub8_Sub1_1.method8220();
				if (local17.anInt4293 == 65535) {
					local17.anInt4293 = -1;
				}
			}
			if ((local21 & 0x8000) != 0) {
				local127 = local17.aClass158_1.anIntArray259.length;
				local131 = 0;
				if (local17.aClass158_1.aShortArray70 != null) {
					local131 = local17.aClass158_1.aShortArray70.length;
				}
				local143 = 0;
				if (local17.aClass158_1.aShortArray72 != null) {
					local143 = local17.aClass158_1.aShortArray72.length;
				}
				local135 = Static84.aClass6_Sub8_Sub1_1.method8246();
				if ((local135 & 0x1) == 1) {
					local17.aClass54_1 = null;
				} else {
					local246 = null;
					if ((local135 & 0x2) == 2) {
						local246 = new int[local127];
						for (local139 = 0; local139 < local127; local139++) {
							local246[local139] = Static84.aClass6_Sub8_Sub1_1.method8229();
						}
					}
					local274 = null;
					if ((local135 & 0x4) == 4) {
						local274 = new short[local131];
						for (local181 = 0; local181 < local131; local181++) {
							local274[local181] = (short) Static84.aClass6_Sub8_Sub1_1.method8229();
						}
					}
					local299 = null;
					if ((local135 & 0x8) == 8) {
						local299 = new short[local143];
						for (local185 = 0; local185 < local143; local185++) {
							local299[local185] = (short) Static84.aClass6_Sub8_Sub1_1.method8229();
						}
					}
					local342 = (long) local9 | (long) local17.anInt2280++ << 32;
					local17.aClass54_1 = new Class54(local342, local246, local274, local299);
				}
			}
			@Pc(622) int[] local622;
			@Pc(625) int[] local625;
			if ((local21 & 0x800) != 0) {
				local127 = Static84.aClass6_Sub8_Sub1_1.method8253();
				local622 = new int[local127];
				local625 = new int[local127];
				for (local135 = 0; local135 < local127; local135++) {
					local137 = Static84.aClass6_Sub8_Sub1_1.method8237();
					if ((local137 & 0xC000) == 49152) {
						local139 = Static84.aClass6_Sub8_Sub1_1.method8237();
						local622[local135] = local139 | local137 << 16;
					} else {
						local622[local135] = local137;
					}
					local625[local135] = Static84.aClass6_Sub8_Sub1_1.method8220();
				}
				local17.method3624(local625, local622);
			}
			if ((local21 & 0x80) != 0) {
				if (local17.aClass158_1.method4869()) {
					Static626.method8555(local17);
				}
				local17.method1994(Static8.aClass309_1.method7453(Static84.aClass6_Sub8_Sub1_1.method8245()));
				local17.method3631(local17.aClass158_1.anInt5826);
				local17.anInt4342 = local17.aClass158_1.anInt5813 << 3;
				if (local17.aClass158_1.method4869()) {
					Static621.method8510((Class9_Sub4_Sub2_Sub1_Sub2) null, (Class356) null, local17.anIntArray197[0], 0, local17.anIntArray198[0], local17.aByte135, local17);
				}
			}
			if ((local21 & 0x10) != 0) {
				@Pc(741) int[] local741 = new int[4];
				for (local131 = 0; local131 < 4; local131++) {
					local741[local131] = Static84.aClass6_Sub8_Sub1_1.method8229();
					if (local741[local131] == 65535) {
						local741[local131] = -1;
					}
				}
				local143 = Static84.aClass6_Sub8_Sub1_1.method8247();
				Static486.method8549(local143, local17, local741);
			}
			if ((local21 & 0x1000) != 0) {
				local127 = Static84.aClass6_Sub8_Sub1_1.method8253();
				local622 = new int[local127];
				local625 = new int[local127];
				@Pc(792) int[] local792 = new int[local127];
				for (local137 = 0; local137 < local127; local137++) {
					local139 = Static84.aClass6_Sub8_Sub1_1.method8245();
					if (local139 == 65535) {
						local139 = -1;
					}
					local622[local137] = local139;
					local625[local137] = Static84.aClass6_Sub8_Sub1_1.method8247();
					local792[local137] = Static84.aClass6_Sub8_Sub1_1.method8220();
				}
				Static464.method6953(local625, local792, local17, local622);
			}
			if ((local21 & 0x100) != 0) {
				local127 = Static84.aClass6_Sub8_Sub1_1.method8229();
				if (local127 == 65535) {
					local127 = -1;
				}
				local131 = Static84.aClass6_Sub8_Sub1_1.method8236();
				local143 = Static84.aClass6_Sub8_Sub1_1.method8243();
				local135 = local143 & 0x7;
				local137 = local143 >> 3 & 0xF;
				if (local137 == 15) {
					local137 = -1;
				}
				local17.method3618(local137, true, local131, local135, local127);
			}
			if ((local21 & 0x40) != 0) {
				local17.anInt2291 = Static84.aClass6_Sub8_Sub1_1.method8237();
				local17.anInt2285 = Static84.aClass6_Sub8_Sub1_1.method8237();
			}
			if ((local21 & 0x200) != 0) {
				local17.aByte43 = Static84.aClass6_Sub8_Sub1_1.method8208();
				local17.aByte42 = Static84.aClass6_Sub8_Sub1_1.method8204();
				local17.aByte41 = Static84.aClass6_Sub8_Sub1_1.method8251();
				local17.aByte44 = (byte) Static84.aClass6_Sub8_Sub1_1.method8253();
				local17.anInt4331 = Static384.anInt7234 + Static84.aClass6_Sub8_Sub1_1.method8237();
				local17.anInt4275 = Static384.anInt7234 + Static84.aClass6_Sub8_Sub1_1.method8245();
			}
			if ((local21 & 0x1) != 0) {
				local17.aString44 = Static84.aClass6_Sub8_Sub1_1.method8221();
				local17.anInt4311 = 100;
			}
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BI)V")
	public static void method5524(@OriginalArg(1) int arg0) {
		@Pc(13) Class6_Sub5_Sub19 local13 = Static348.method5721(arg0, 9);
		local13.method5174();
	}
}
