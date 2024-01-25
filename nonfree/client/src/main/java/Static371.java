import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "Lclient!pg;")
	private static Class270 aClass270_8;

	@OriginalMember(owner = "client!naa", name = "c", descriptor = "Lclient!rj;")
	public static Class304 aClass304_4;

	@OriginalMember(owner = "client!naa", name = "d", descriptor = "Lclient!tp;")
	public static Class336 aClass336_4;

	@OriginalMember(owner = "client!naa", name = "e", descriptor = "Lclient!eia;")
	public static Interface5 anInterface5_2;

	@OriginalMember(owner = "client!naa", name = "f", descriptor = "Lclient!ls;")
	private static Class216 aClass216_6;

	@OriginalMember(owner = "client!naa", name = "g", descriptor = "Lclient!nd;")
	public static Class238 aClass238_267;

	@OriginalMember(owner = "client!naa", name = "h", descriptor = "Lclient!dl;")
	public static Class79 aClass79_4;

	@OriginalMember(owner = "client!naa", name = "i", descriptor = "Lclient!ef;")
	public static Class2_Sub7_Sub3 aClass2_Sub7_Sub3_3;

	@OriginalMember(owner = "client!naa", name = "j", descriptor = "F")
	public static float aFloat186;

	@OriginalMember(owner = "client!naa", name = "m", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!naa", name = "n", descriptor = "Lclient!gea;")
	public static Class129 aClass129_5;

	@OriginalMember(owner = "client!naa", name = "p", descriptor = "I")
	public static int anInt9378;

	@OriginalMember(owner = "client!naa", name = "q", descriptor = "F")
	public static float aFloat187;

	@OriginalMember(owner = "client!naa", name = "t", descriptor = "[B")
	private static byte[] aByteArray93;

	@OriginalMember(owner = "client!naa", name = "u", descriptor = "I")
	public static int anInt9380;

	@OriginalMember(owner = "client!naa", name = "v", descriptor = "I")
	public static int anInt9381;

	@OriginalMember(owner = "client!naa", name = "w", descriptor = "I")
	public static int anInt9382;

	@OriginalMember(owner = "client!naa", name = "x", descriptor = "[B")
	private static byte[] aByteArray94;

	@OriginalMember(owner = "client!naa", name = "y", descriptor = "[S")
	private static short[] aShortArray143;

	@OriginalMember(owner = "client!naa", name = "z", descriptor = "[I")
	private static int[] anIntArray677;

	@OriginalMember(owner = "client!naa", name = "A", descriptor = "I")
	public static int anInt9383;

	@OriginalMember(owner = "client!naa", name = "B", descriptor = "[S")
	private static short[] aShortArray144;

	@OriginalMember(owner = "client!naa", name = "C", descriptor = "Lclient!tba;")
	private static Class323 aClass323_38;

	@OriginalMember(owner = "client!naa", name = "D", descriptor = "I")
	public static int anInt9384;

	@OriginalMember(owner = "client!naa", name = "E", descriptor = "I")
	public static int anInt9385;

	@OriginalMember(owner = "client!naa", name = "F", descriptor = "[B")
	private static byte[] aByteArray95;

	@OriginalMember(owner = "client!naa", name = "G", descriptor = "I")
	public static int anInt9386;

	@OriginalMember(owner = "client!naa", name = "H", descriptor = "I")
	public static int anInt9387;

	@OriginalMember(owner = "client!naa", name = "I", descriptor = "[B")
	private static byte[] aByteArray96;

	@OriginalMember(owner = "client!naa", name = "J", descriptor = "[[[Lclient!an;")
	private static Class19[][][] aClass19ArrayArrayArray2;

	@OriginalMember(owner = "client!naa", name = "K", descriptor = "I")
	public static int anInt9388;

	@OriginalMember(owner = "client!naa", name = "L", descriptor = "I")
	public static int anInt9389;

	@OriginalMember(owner = "client!naa", name = "M", descriptor = "[B")
	private static byte[] aByteArray97;

	@OriginalMember(owner = "client!naa", name = "N", descriptor = "I")
	public static int anInt9390;

	@OriginalMember(owner = "client!naa", name = "O", descriptor = "I")
	public static int anInt9391;

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "Lclient!tba;")
	private static final Class323 aClass323_37 = new Class323(16);

	@OriginalMember(owner = "client!naa", name = "k", descriptor = "[B")
	private static final byte[] aByteArray92 = new byte[1];

	@OriginalMember(owner = "client!naa", name = "l", descriptor = "I")
	public static int anInt9377 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!naa", name = "o", descriptor = "Lclient!fh;")
	public static final Class114 aClass114_54 = new Class114();

	@OriginalMember(owner = "client!naa", name = "r", descriptor = "[S")
	private static final short[] aShortArray142 = new short[1];

	@OriginalMember(owner = "client!naa", name = "s", descriptor = "I")
	public static int anInt9379 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "()V")
	public static void method7971() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass129_5.anInt3588; local4++) {
			@Pc(32) boolean local32 = aClass2_Sub7_Sub3_3.method2287(local2, aClass129_5.anIntArray232[local4] >> 28 & 0x3, aClass129_5.anIntArray232[local4] >> 14 & 0x3FFF, aClass129_5.anIntArray232[local4] & 0x3FFF);
			if (local32) {
				@Pc(42) Class2_Sub13 local42 = new Class2_Sub13(aClass129_5.anIntArray233[local4]);
				local42.anInt2183 = local2[1] - anInt9384;
				local42.anInt2178 = local2[2] - anInt9385;
				aClass114_54.method2771(local42);
			}
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lclient!ha;)V")
	public static void method7972(@OriginalArg(0) Class13 arg0) {
		@Pc(3) int local3 = anInt9389 - anInt9380;
		@Pc(7) int local7 = anInt9383 - anInt9381;
		@Pc(15) int local15 = (anInt9388 - anInt9391 << 16) / local3;
		@Pc(23) int local23 = (anInt9386 - anInt9387 << 16) / local7;
		method7973(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lclient!ha;IIII)V")
	private static void method7973(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt9389 - anInt9380;
		@Pc(7) int local7 = anInt9383 - anInt9381;
		if (anInt9389 < anInt9390) {
			local3++;
		}
		if (anInt9383 < anInt9382) {
			local7++;
		}
		@Pc(28) int local28;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(70) int local70;
		@Pc(80) int local80;
		@Pc(84) int local84;
		@Pc(93) int local93;
		@Pc(173) int local173;
		@Pc(175) int local175;
		@Pc(177) int local177;
		@Pc(179) int local179;
		for (@Pc(17) int local17 = 0; local17 < local3; local17++) {
			local28 = (arg1 * local17 >> 16) + anInt9391;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt9391;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt9380 + local17;
				if (local50 >= 0 && local50 < anInt9390) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt9386 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt9386 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt9381;
							local173 = local50 + local93 * anInt9390;
							local175 = 0;
							local177 = 0;
							local179 = 0;
							if (local93 >= 0 && local93 < anInt9382) {
								local175 = (aByteArray97[local173] & 0xFF) << 16 | aShortArray143[local173] & 0xFFFF;
								if (local175 != 0) {
									local175 |= 0xFF000000;
								}
								local177 = aByteArray95[local173] & 0xFF;
								local179 = aShortArray144[local173] & 0xFFFF;
							}
							if (local175 == 0 && local177 == 0 && local179 == 0) {
								if (aClass2_Sub7_Sub3_3.anInt2687 != -1) {
									local175 = aClass2_Sub7_Sub3_3.anInt2687 | 0xFF000000;
								} else if ((local17 + anInt9380 & 0x4) == (local57 + anInt9383 & 0x4)) {
									local175 = anIntArray677[aClass216_6.anInt5873 + 1];
								} else {
									local175 = -11840664;
								}
								if (local175 == 0) {
									local175 = -16777216;
								}
								arg0.aa(local28, local70, local44, local84, local175, 0);
							} else if (local179 <= 0) {
								method7990(arg0, local28, local70, local44, local84, local175, local177, aByteArray93[local173], (short[]) null, (byte[]) null, true);
							} else if (local179 == 65535) {
								@Pc(282) Class2_Sub8 local282 = (Class2_Sub8) aClass323_38.method7484((long) (local50 << 16 | local93));
								if (local282 != null) {
									method7990(arg0, local28, local70, local44, local84, local175, local177, aByteArray93[local173], local282.aShortArray15, local282.aByteArray5, true);
								}
							} else {
								aShortArray142[0] = (short) (local179 - 1);
								aByteArray92[0] = aByteArray94[local173];
								method7990(arg0, local28, local70, local44, local84, local175, local177, aByteArray93[local173], aShortArray142, aByteArray92, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt9386 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt9386 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass2_Sub7_Sub3_3.anInt2687 != -1) {
							local93 = aClass2_Sub7_Sub3_3.anInt2687 | 0xFF000000;
						} else if ((local17 + anInt9380 & 0x4) == (local57 + anInt9383 & 0x4)) {
							local93 = anIntArray677[aClass216_6.anInt5873 + 1];
						} else {
							local93 = -11840664;
						}
						if (local93 == 0) {
							local93 = -16777216;
						}
						arg0.aa(local28, local70, local44, local84, local93, 0);
					}
				}
			}
		}
		for (local28 = -16; local28 < local3 + 16; local28++) {
			local40 = (arg1 * local28 >> 16) + anInt9391;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt9391;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt9380;
				if (local57 >= 0 && local57 < anInt9390) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt9386 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt9386 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local173 = local70 + anInt9381;
							if (local173 >= 0 && local173 < anInt9382) {
								local175 = aShortArray144[local57 + local173 * anInt9390] & 0xFFFF;
								if (local175 <= 0) {
									method7988(arg0, local40, local80, local50, local93, (short[]) null, (byte[]) null);
								} else if (local175 == 65535) {
									@Pc(459) Class2_Sub8 local459 = (Class2_Sub8) aClass323_38.method7484((long) (local57 << 16 | local173));
									if (local459 != null) {
										method7988(arg0, local40, local80, local50, local93, local459.aShortArray15, local459.aByteArray5);
									}
								} else {
									aShortArray142[0] = (short) (local175 - 1);
									aByteArray92[0] = aByteArray94[local57 + local173 * anInt9390];
									method7988(arg0, local40, local80, local50, local93, aShortArray142, aByteArray92);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt9380 >> 6;
		local44 = anInt9381 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt9389 >> 6;
		local57 = anInt9383 >> 6;
		if (local50 >= aClass19ArrayArrayArray2[0].length) {
			local50 = aClass19ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass19ArrayArrayArray2[0][0].length) {
			local57 = aClass19ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(641) int local641;
			@Pc(653) int local653;
			@Pc(665) int local665;
			@Pc(675) int local675;
			@Pc(631) int local631;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(589) Class19 local589 = aClass19ArrayArrayArray2[local70][local80][local84];
					if (local589 != null) {
						local173 = (local80 + (anInt9384 >> 6)) * 64;
						local175 = (local84 + (anInt9385 >> 6)) * 64;
						for (@Pc(612) Class16_Sub9 local612 = (Class16_Sub9) local589.method562(); local612 != null; local612 = (Class16_Sub9) local589.method558()) {
							local179 = local173 + local612.aByte120 - anInt9384 - anInt9380;
							local631 = local175 + local612.aByte122 - anInt9385 - anInt9381;
							local641 = (arg1 * local179 >> 16) + anInt9391;
							local653 = (arg1 * (local179 + 1) >> 16) + anInt9391;
							local665 = anInt9386 - (arg2 * (local631 + 1) >> 16);
							local675 = anInt9386 - (arg2 * local631 >> 16);
							method7990(arg0, local641, local665, local653 - local641, local675 - local665, local612.anInt8569, local612.aByte121 & 0xFF, local612.aByte123, local612.aShortArray130, local612.aByteArray90, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(727) Class19 local727 = aClass19ArrayArrayArray2[local70][local84][local93];
					if (local727 != null) {
						local175 = (local84 + (anInt9384 >> 6)) * 64;
						local177 = (local93 + (anInt9385 >> 6)) * 64;
						for (@Pc(750) Class16_Sub9 local750 = (Class16_Sub9) local727.method562(); local750 != null; local750 = (Class16_Sub9) local727.method558()) {
							local631 = local175 + local750.aByte120 - anInt9384 - anInt9380;
							local641 = local177 + local750.aByte122 - anInt9385 - anInt9381;
							local653 = (arg1 * local631 >> 16) + anInt9391;
							local665 = (arg1 * (local631 + 1) >> 16) + anInt9391;
							local675 = anInt9386 - (arg2 * (local641 + 1) >> 16);
							@Pc(813) int local813 = anInt9386 - (arg2 * local641 >> 16);
							method7988(arg0, local653, local675, local665 - local653, local813 - local675, local750.aShortArray130, local750.aByteArray90);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lclient!ha;Lclient!cs;IIII)V")
	private static void method7974(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class2_Sub13 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt2181 = anInt9391 + (arg2 * (arg1.anInt2183 - anInt9380) >> 16);
		arg1.anInt2180 = anInt9386 - (arg3 * (arg1.anInt2178 - anInt9381) >> 16);
	}

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "()V")
	private static void method7975() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(49) int local49;
		for (@Pc(1) int local1 = 0; local1 < anInt9390; local1++) {
			for (local4 = 0; local4 < anInt9382; local4++) {
				local15 = aShortArray144[local1 + local4 * anInt9390] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class2_Sub8 local31 = (Class2_Sub8) aClass323_38.method7484((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray15.length; local35++) {
								@Pc(46) Class5 local46 = aClass304_4.method6956(local31.aShortArray15[local35] & 0xFFFF);
								local49 = local46.anInt78;
								if (local46.anIntArray9 != null) {
									local46 = local46.method77(anInterface5_2);
									if (local46 != null) {
										local49 = local46.anInt78;
									}
								}
								if (local49 != -1) {
									@Pc(70) Class2_Sub13 local70 = new Class2_Sub13(local49);
									local70.anInt2183 = local1;
									local70.anInt2178 = local4;
									aClass114_54.method2771(local70);
								}
							}
						}
					} else {
						@Pc(94) Class5 local94 = aClass304_4.method6956(local15 - 1);
						local35 = local94.anInt78;
						if (local94.anIntArray9 != null) {
							local94 = local94.method77(anInterface5_2);
							if (local94 != null) {
								local35 = local94.anInt78;
							}
						}
						if (local35 != -1) {
							@Pc(118) Class2_Sub13 local118 = new Class2_Sub13(local35);
							local118.anInt2183 = local1;
							local118.anInt2178 = local4;
							aClass114_54.method2771(local118);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass19ArrayArrayArray2[0].length; local15++) {
				for (@Pc(144) int local144 = 0; local144 < aClass19ArrayArrayArray2[0][0].length; local144++) {
					@Pc(153) Class19 local153 = aClass19ArrayArrayArray2[local4][local15][local144];
					if (local153 != null) {
						for (@Pc(160) Class16_Sub9 local160 = (Class16_Sub9) local153.method562(); local160 != null; local160 = (Class16_Sub9) local153.method558()) {
							if (local160.aShortArray130 != null) {
								for (local49 = 0; local49 < local160.aShortArray130.length; local49++) {
									@Pc(177) Class5 local177 = aClass304_4.method6956(local160.aShortArray130[local49] & 0xFFFF);
									@Pc(180) int local180 = local177.anInt78;
									if (local177.anIntArray9 != null) {
										local177 = local177.method77(anInterface5_2);
										if (local177 != null) {
											local180 = local177.anInt78;
										}
									}
									if (local180 != -1) {
										@Pc(201) Class2_Sub13 local201 = new Class2_Sub13(local180);
										local201.anInt2183 = (local15 + (anInt9384 >> 6)) * 64 + local160.aByte120 - anInt9384;
										local201.anInt2178 = (local144 + (anInt9385 >> 6)) * 64 + local160.aByte122 - anInt9385;
										aClass114_54.method2771(local201);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(I)V")
	public static void method7976(@OriginalArg(0) int arg0) {
		aClass2_Sub7_Sub3_3 = (Class2_Sub7_Sub3) aClass323_37.method7484((long) arg0);
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt9380 = arg0 - anInt9384;
		anInt9383 = arg1 - anInt9385;
		anInt9389 = arg2 - anInt9384;
		anInt9381 = arg3 - anInt9385;
		anInt9391 = arg4;
		anInt9387 = arg5;
		anInt9388 = arg6;
		anInt9386 = arg7;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(II)Lclient!ef;")
	public static Class2_Sub7_Sub3 method7978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class2_Sub7_Sub3 local4 = (Class2_Sub7_Sub3) aClass323_37.method7480(); local4 != null; local4 = (Class2_Sub7_Sub3) aClass323_37.method7482()) {
			if (local4.aBoolean216 && local4.method2285(arg1, arg0)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lclient!ha;Lclient!cs;Lclient!up;)V")
	public static void method7979(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class2_Sub13 arg1, @OriginalArg(2) Class353 arg2) {
		if (arg2.anIntArray691 == null) {
			return;
		}
		@Pc(7) int[] local7 = new int[arg2.anIntArray691.length];
		@Pc(20) int local20;
		@Pc(32) int local32;
		for (@Pc(9) int local9 = 0; local9 < local7.length / 2; local9++) {
			local20 = arg2.anIntArray691[local9 * 2] + arg1.anInt2183;
			local32 = arg2.anIntArray691[local9 * 2 + 1] + arg1.anInt2178;
			local7[local9 * 2] = anInt9391 + (anInt9388 - anInt9391) * (local20 - anInt9380) / (anInt9389 - anInt9380);
			local7[local9 * 2 + 1] = anInt9386 - (anInt9386 - anInt9387) * (local32 - anInt9381) / (anInt9383 - anInt9381);
		}
		Static3.method60(arg0, local7, arg2.anInt9800);
		if (arg2.anInt9799 > 0) {
			@Pc(102) int local102;
			@Pc(110) int local110;
			@Pc(120) int local120;
			@Pc(125) int local125;
			@Pc(127) int local127;
			for (local20 = 0; local20 < local7.length / 2 - 1; local20++) {
				local32 = local7[local20 * 2];
				local102 = local7[local20 * 2 + 1];
				local110 = local7[(local20 + 1) * 2];
				local120 = local7[(local20 + 1) * 2 + 1];
				if (local110 < local32) {
					local125 = local32;
					local127 = local102;
					local32 = local110;
					local102 = local120;
					local110 = local125;
					local120 = local127;
				} else if (local110 == local32 && local120 < local102) {
					local125 = local102;
					local102 = local120;
					local120 = local125;
				}
				arg0.method8087(local32, local102, local110, local120, arg2.anIntArray692[arg2.aByteArray101[local20] & 0xFF], arg2.anInt9799, arg2.anInt9808, arg2.anInt9813);
			}
			local32 = local7[local7.length - 2];
			local102 = local7[local7.length - 1];
			local110 = local7[0];
			local120 = local7[1];
			if (local110 < local32) {
				local125 = local32;
				local127 = local102;
				local32 = local110;
				local102 = local120;
				local110 = local125;
				local120 = local127;
			} else if (local110 == local32 && local120 < local102) {
				local125 = local102;
				local102 = local120;
				local120 = local125;
			}
			arg0.method8087(local32, local102, local110, local120, arg2.anIntArray692[arg2.aByteArray101[arg2.aByteArray101.length - 1] & 0xFF], arg2.anInt9799, arg2.anInt9808, arg2.anInt9813);
			return;
		}
		for (local20 = 0; local20 < local7.length / 2 - 1; local20++) {
			arg0.method8130(local7[local20 * 2 + 1], local7[(local20 + 1) * 2], local7[(local20 + 1) * 2 + 1], arg2.anIntArray692[arg2.aByteArray101[local20] & 0xFF], local7[local20 * 2]);
		}
		arg0.method8130(local7[local7.length - 1], local7[0], local7[1], arg2.anIntArray692[arg2.aByteArray101[arg2.aByteArray101.length - 1] & 0xFF], local7[local7.length - 2]);
	}

	@OriginalMember(owner = "client!naa", name = "c", descriptor = "()V")
	public static void method7980() {
		aByteArray96 = null;
		aByteArray97 = null;
		aShortArray143 = null;
		aByteArray95 = null;
		aByteArray93 = null;
		aShortArray144 = null;
		aByteArray94 = null;
		aClass323_38 = null;
		aClass19ArrayArrayArray2 = null;
		anIntArray677 = null;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lclient!nd;Lclient!ls;Lclient!pg;Lclient!rj;Lclient!tp;Lclient!dl;Lclient!eia;)V")
	public static void method7981(@OriginalArg(0) Class238 arg0, @OriginalArg(1) Class216 arg1, @OriginalArg(2) Class270 arg2, @OriginalArg(3) Class304 arg3, @OriginalArg(4) Class336 arg4, @OriginalArg(5) Class79 arg5, @OriginalArg(6) Interface5 arg6) {
		aClass238_267 = arg0;
		aClass216_6 = arg1;
		aClass270_8 = arg2;
		aClass304_4 = arg3;
		aClass336_4 = arg4;
		aClass79_4 = arg5;
		anInterface5_2 = arg6;
		aClass323_37.method7485();
		@Pc(21) int local21 = aClass238_267.method5575("details");
		@Pc(26) int[] local26 = aClass238_267.method5595(local21);
		if (local26 != null) {
			for (@Pc(30) int local30 = 0; local30 < local26.length; local30++) {
				@Pc(39) Class2_Sub7_Sub3 local39 = Static122.method2203(aClass238_267, local21, local26[local30]);
				aClass323_37.method7477(local39, (long) local39.anInt2691);
			}
		}
		Static187.method3201(false, true);
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lclient!ha;Lclient!sl;IIII[I[I)V")
	private static void method7982(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class2_Sub17 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method2859();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method2859();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray96[arg4 + arg5 * anInt9390] = (byte) local21;
					aByteArray95[arg4 + arg5 * anInt9390] = 0;
				} else {
					aByteArray95[arg4 + arg5 * anInt9390] = (byte) local21;
					aByteArray93[arg4 + arg5 * anInt9390] = 0;
					aByteArray96[arg4 + arg5 * anInt9390] = arg1.method2860();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method2859();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method2859();
				local127 = arg1.method2859();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method2859();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray96[arg4 + arg5 * anInt9390] = (byte) local123;
				aByteArray95[arg4 + arg5 * anInt9390] = (byte) local125;
				aByteArray93[arg4 + arg5 * anInt9390] = (byte) local127;
				if (local139 == 1) {
					aShortArray144[arg4 + arg5 * anInt9390] = (short) (arg1.method2825() + 1);
					aByteArray94[arg4 + arg5 * anInt9390] = arg1.method2860();
				} else if (local139 > 1) {
					aShortArray144[arg4 + arg5 * anInt9390] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method2825();
						local218[local220] = arg1.method2860();
					}
					aClass323_38.method7477(new Class2_Sub8(local215, local218), (long) (arg4 << 16 | arg5));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method2825();
						local218[local220] = arg1.method2860();
					}
				}
				if (aClass19ArrayArrayArray2[local118 - 1][arg2 - (anInt9384 >> 6)][arg3 - (anInt9385 >> 6)] == null) {
					aClass19ArrayArrayArray2[local118 - 1][arg2 - (anInt9384 >> 6)][arg3 - (anInt9385 >> 6)] = new Class19();
				}
				@Pc(338) Class16_Sub9 local338 = new Class16_Sub9(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass19ArrayArrayArray2[local118 - 1][arg2 - (anInt9384 >> 6)][arg3 - (anInt9385 >> 6)].method566(local338);
			}
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lclient!ha;II)V")
	public static void method7983(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class2_Sub17 local9 = new Class2_Sub17(aClass238_267.method5572(aClass2_Sub7_Sub3_3.aString26, "area"));
		@Pc(13) int local13 = local9.method2859();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method2859();
		}
		@Pc(33) int local33 = local9.method2859();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method2859();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt3378 < local9.aByteArray26.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method2859() == 0) {
					local58 = local9.method2859();
					local62 = local9.method2859();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt9384;
							local84 = local62 * 64 + local67 - anInt9385;
							method7982(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method2859();
					local62 = local9.method2859();
					local64 = local9.method2859();
					local67 = local9.method2859();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt9384;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt9385;
							method7982(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray97 = new byte[anInt9390 * anInt9382];
			aShortArray143 = new short[anInt9390 * anInt9382];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt9390 * anInt9382];
				for (local64 = 0; local64 < aClass19ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass19ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class19 local205 = aClass19ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class16_Sub9 local212 = (Class16_Sub9) local205.method562(); local212 != null; local212 = (Class16_Sub9) local205.method558()) {
								local191[local64 * 64 + local212.aByte120 + (local67 * 64 + local212.aByte122) * anInt9390] = (byte) local212.anInt8569;
							}
						}
					}
				}
				method7989(local191, aByteArray97, aShortArray143, arg1, arg2);
				for (local67 = 0; local67 < aClass19ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass19ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class19 local276 = aClass19ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class16_Sub9 local283 = (Class16_Sub9) local276.method562(); local283 != null; local283 = (Class16_Sub9) local276.method558()) {
								local148 = local67 * 64 + local283.aByte120 + (local76 * 64 + local283.aByte122) * anInt9390;
								local283.anInt8569 = (aByteArray97[local148] & 0xFF) << 16 | aShortArray143[local148] & 0xFFFF;
								if (local283.anInt8569 != 0) {
									local283.anInt8569 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method7989(aByteArray96, aByteArray97, aShortArray143, arg1, arg2);
			aByteArray96 = null;
			method7975();
			return;
		}
	}

	@OriginalMember(owner = "client!naa", name = "d", descriptor = "()V")
	public static void method7984() {
		aByteArray96 = new byte[anInt9390 * anInt9382];
		aByteArray95 = new byte[anInt9390 * anInt9382];
		aByteArray93 = new byte[anInt9390 * anInt9382];
		aShortArray144 = new short[anInt9390 * anInt9382];
		aByteArray94 = new byte[anInt9390 * anInt9382];
		aClass323_38 = new Class323(1024);
		aClass19ArrayArrayArray2 = new Class19[3][anInt9390 >> 6][anInt9382 >> 6];
		anIntArray677 = new int[aClass216_6.anInt5869 + 1];
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lclient!d;II)V")
	public static void method7985(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < aClass216_6.anInt5869; local1++) {
			anIntArray677[local1 + 1] = method7993(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "(Lclient!ha;)Lclient!fh;")
	public static Class114 method7986(@OriginalArg(0) Class13 arg0) {
		@Pc(3) int local3 = anInt9389 - anInt9380;
		@Pc(7) int local7 = anInt9383 - anInt9381;
		@Pc(15) int local15 = (anInt9388 - anInt9391 << 16) / local3;
		@Pc(23) int local23 = (anInt9386 - anInt9387 << 16) / local7;
		return method7987(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "(Lclient!ha;IIII)Lclient!fh;")
	private static Class114 method7987(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class2_Sub13 local4 = (Class2_Sub13) aClass114_54.method2772(); local4 != null; local4 = (Class2_Sub13) aClass114_54.method2762()) {
			method7974(arg0, local4, arg1, arg2);
		}
		return aClass114_54;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lclient!ha;IIII[S[B)V")
	private static void method7988(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(14) Class5 local14 = aClass304_4.method6956(arg5[local4] & 0xFFFF);
			@Pc(17) int local17 = local14.anInt60;
			if (local17 != -1) {
				@Pc(25) Class220 local25 = aClass79_4.method1974(local17);
				@Pc(49) Class31 local49 = local25.method5164(local14.aBoolean6 ? local14.aBoolean7 : false, local14.aBoolean11 ? arg6[local4] >> 6 & 0x3 : 0, arg0);
				if (local49 != null) {
					@Pc(58) int local58 = arg3 * local49.method8788() >> 2;
					@Pc(65) int local65 = arg4 * local49.method8807() >> 2;
					if (local25.aBoolean424) {
						@Pc(71) int local71 = local14.anInt67;
						@Pc(74) int local74 = local14.anInt72;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(85) int local85 = local71;
							local71 = local74;
							local74 = local85;
						}
						local58 = local71 * arg3;
						local65 = local74 * arg4;
					}
					if (local58 != 0 && local65 != 0) {
						if (local25.anInt5983 == 0) {
							local49.method8795(arg1, arg2 + arg4 - local65, local58, local65);
						} else {
							local49.method8797(arg1, arg2 + arg4 - local65, local58, local65, 0, local25.anInt5983 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "([B[B[SII)V")
	private static void method7989(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt9382];
		@Pc(5) int[] local5 = new int[anInt9382];
		@Pc(8) int[] local8 = new int[anInt9382];
		@Pc(11) int[] local11 = new int[anInt9382];
		@Pc(14) int[] local14 = new int[anInt9382];
		for (@Pc(16) int local16 = -5; local16 < anInt9390; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt9382; local27++) {
				@Pc(50) Class20 local50;
				@Pc(86) int local86;
				if (local21 < anInt9390) {
					local41 = arg0[local21 + local27 * anInt9390] & 0xFF;
					if (local41 > 0) {
						local50 = aClass270_8.method6276(local41 - 1);
						local2[local27] += local50.anInt466;
						local5[local27] += local50.anInt464;
						local8[local27] += local50.anInt463;
						local11[local27] += local50.anInt459;
						local86 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt9390] & 0xFF;
					if (local41 > 0) {
						local50 = aClass270_8.method6276(local41 - 1);
						local2[local27] -= local50.anInt466;
						local5[local27] -= local50.anInt464;
						local8[local27] -= local50.anInt463;
						local11[local27] -= local50.anInt459;
						local86 = local14[local27]--;
					}
				}
			}
			if (local16 >= 0) {
				local41 = 0;
				@Pc(159) int local159 = 0;
				@Pc(161) int local161 = 0;
				@Pc(163) int local163 = 0;
				@Pc(165) int local165 = 0;
				for (@Pc(167) int local167 = -5; local167 < anInt9382; local167++) {
					@Pc(172) int local172 = local167 + 5;
					if (local172 < anInt9382) {
						local41 += local2[local172];
						local159 += local5[local172];
						local161 += local8[local172];
						local163 += local11[local172];
						local165 += local14[local172];
					}
					@Pc(209) int local209 = local167 - 5;
					if (local209 >= 0) {
						local41 -= local2[local209];
						local159 -= local5[local209];
						local161 -= local8[local209];
						local163 -= local11[local209];
						local165 -= local14[local209];
					}
					if (local167 >= 0 && local165 > 0) {
						@Pc(261) int local261;
						if ((arg0[local16 + local167 * anInt9390] & 0xFF) == 0) {
							local261 = local16 + local167 * anInt9390;
							arg1[local261] = 0;
							arg2[local261] = 0;
						} else {
							local261 = local163 == 0 ? 0 : Static455.method8031(local159 / local165, local41 * 256 / local163, local161 / local165);
							@Pc(294) int local294 = (local261 & 0x7F) + arg4;
							if (local294 < 0) {
								local294 = 0;
							} else if (local294 > 127) {
								local294 = 127;
							}
							@Pc(316) int local316 = (local261 + arg3 & 0xFC00) + (local261 & 0x380) + local294;
							@Pc(322) int local322 = local16 + local167 * anInt9390;
							@Pc(333) int local333 = Static476.anIntArray555[Static208.method3505(Static548.method7573(local316)) & 0xFFFF];
							arg1[local322] = (byte) (local333 >> 16 & 0xFF);
							arg2[local322] = (short) (local333 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lclient!ha;IIIIIII[S[BZ)V")
	private static void method7990(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.aa(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray677[arg6];
					if (arg10 || local32 != 0) {
						arg0.aa(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static326.method4972(local20, arg1, local32, arg3, anInt9378, arg2, aByteArrayArrayArray16, arg0, arg5, arg4, arg7 >> 6 & 0x3, anIntArray677[arg6]);
				}
			}
		}
		if (arg8 == null) {
			return;
		}
		if (arg3 == 1) {
			local20 = arg1;
		} else {
			local20 = arg1 + arg3 - 1;
		}
		if (arg4 == 1) {
			local32 = arg2;
		} else {
			local32 = arg2 + arg4 - 1;
		}
		for (@Pc(100) int local100 = 0; local100 < arg8.length; local100++) {
			@Pc(107) int local107 = arg9[local100] & 0x3F;
			if (local107 == 0 || local107 == 2 || local107 == 3 || local107 == 9) {
				@Pc(127) Class5 local127 = aClass304_4.method6956(arg8[local100] & 0xFFFF);
				if (local127.anInt60 == -1) {
					@Pc(133) int local133 = -3355444;
					if (local127.anInt81 == 1) {
						local133 = -3407872;
					}
					@Pc(147) int local147 = arg9[local100] >> 6 & 0x3;
					if (local107 == 0) {
						if (local147 == 0) {
							arg0.P(arg1, arg2, arg4, local133, 0);
						} else if (local147 == 1) {
							arg0.U(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 2) {
							arg0.P(local20, arg2, arg4, local133, 0);
						} else {
							arg0.U(arg1, local32, arg3, local133, 0);
						}
					} else if (local107 == 2) {
						if (local147 == 0) {
							arg0.P(arg1, arg2, arg4, -1, 0);
							arg0.U(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 1) {
							arg0.P(local20, arg2, arg4, -1, 0);
							arg0.U(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 2) {
							arg0.P(local20, arg2, arg4, -1, 0);
							arg0.U(arg1, local32, arg3, local133, 0);
						} else {
							arg0.P(arg1, arg2, arg4, -1, 0);
							arg0.U(arg1, local32, arg3, local133, 0);
						}
					} else if (local107 == 3) {
						if (local147 == 0) {
							arg0.U(arg1, arg2, 1, local133, 0);
						} else if (local147 == 1) {
							arg0.U(local20, arg2, 1, local133, 0);
						} else if (local147 == 2) {
							arg0.U(local20, local32, 1, local133, 0);
						} else {
							arg0.U(arg1, local32, 1, local133, 0);
						}
					} else if (local107 == 9) {
						@Pc(313) int local313;
						if (local147 == 0 || local147 == 2) {
							for (local313 = 0; local313 < arg4; local313++) {
								arg0.U(arg1 + local313, local32 - local313, 1, local133, 0);
							}
						} else {
							for (local313 = 0; local313 < arg4; local313++) {
								arg0.U(arg1 + local313, arg2 + local313, 1, local133, 0);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "(I)Lclient!ef;")
	public static Class2_Sub7_Sub3 method7991(@OriginalArg(0) int arg0) {
		return (Class2_Sub7_Sub3) aClass323_37.method7484((long) arg0);
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lclient!d;III)I")
	private static int method7993(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class273 local4 = aClass216_6.method5090(arg1);
		if (local4 == null) {
			return 0;
		}
		@Pc(11) int local11 = local4.anInt7223;
		if (local11 >= 0 && arg0.method6027(local11).aBoolean514) {
			local11 = -1;
		}
		@Pc(68) int local68;
		@Pc(27) int local27;
		@Pc(33) int local33;
		@Pc(55) int local55;
		if (local4.anInt7212 >= 0) {
			local27 = local4.anInt7212;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static476.anIntArray555[Static208.method3505(Static44.method1173(local55)) & 0xFFFF] | 0xFF000000;
		} else if (local11 >= 0) {
			local68 = Static476.anIntArray555[Static208.method3505(Static44.method1173(arg0.method6027(local11).aShort94)) & 0xFFFF] | 0xFF000000;
		} else if (local4.anInt7209 == -1) {
			local68 = 0;
		} else {
			local27 = local4.anInt7209;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static476.anIntArray555[Static208.method3505(Static44.method1173(local55)) & 0xFFFF] | 0xFF000000;
		}
		return local68;
	}

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "(II)Lclient!qk;")
	public static Class290 method7994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class290 local3 = new Class290();
		for (@Pc(8) Class2_Sub7_Sub3 local8 = (Class2_Sub7_Sub3) aClass323_37.method7480(); local8 != null; local8 = (Class2_Sub7_Sub3) aClass323_37.method7482()) {
			if (local8.aBoolean216 && local8.method2285(arg1, arg0)) {
				local3.method6678(local8);
			}
		}
		return local3;
	}
}
