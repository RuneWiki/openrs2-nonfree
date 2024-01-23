import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!og", name = "a", descriptor = "[Z")
	private static boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!og", name = "b", descriptor = "I")
	private static int anInt3744;

	@OriginalMember(owner = "client!og", name = "d", descriptor = "I")
	private static int anInt3745;

	@OriginalMember(owner = "client!og", name = "e", descriptor = "I")
	private static int anInt3746;

	@OriginalMember(owner = "client!og", name = "f", descriptor = "[I")
	private static int[] anIntArray279;

	@OriginalMember(owner = "client!og", name = "g", descriptor = "I")
	private static int anInt3747;

	@OriginalMember(owner = "client!og", name = "i", descriptor = "I")
	private static int anInt3749;

	@OriginalMember(owner = "client!og", name = "j", descriptor = "I")
	private static int anInt3750;

	@OriginalMember(owner = "client!og", name = "k", descriptor = "[I")
	private static int[] anIntArray280;

	@OriginalMember(owner = "client!og", name = "l", descriptor = "[[[I")
	private static int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!og", name = "m", descriptor = "[Lclient!ck;")
	public static Class28[] aClass28Array1;

	@OriginalMember(owner = "client!og", name = "n", descriptor = "I")
	private static int anInt3751;

	@OriginalMember(owner = "client!og", name = "o", descriptor = "[Z")
	private static boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!og", name = "p", descriptor = "I")
	private static int anInt3752;

	@OriginalMember(owner = "client!og", name = "c", descriptor = "[F")
	private static float[] aFloatArray16 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!og", name = "h", descriptor = "I")
	public static int anInt3748 = 0;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ)V")
	public static void method2914(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(1) int local1 = 0; local1 < anInt3748; local1++) {
			aClass28Array1[local1].method615(arg0, arg1);
		}
		anInt3750 = -1;
		anInt3752 = -1;
		anInt3744 = -1;
		anInt3751 = -1;
		anInt3745 = -1;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!ck;III)V")
	private static void method2915(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = arg0 + 16384 + 4;
		@Pc(7) GL local7 = Static116.aGL1;
		if (!aBooleanArray16[arg0]) {
			local7.glEnable(local5);
			aBooleanArray16[arg0] = true;
		}
		local7.glLightf(local5, 4617, arg1.aFloat8);
		local7.glLightfv(local5, 4609, arg1.aFloatArray3, 0);
		aFloatArray16[0] = arg1.anInt863 - arg2;
		aFloatArray16[1] = arg1.anInt862 - arg3;
		aFloatArray16[2] = arg1.anInt877 - arg4;
		local7.glLightfv(local5, 4611, aFloatArray16, 0);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)V")
	public static void method2916() {
		anInt3749 = 4;
		anInt3747 = 104;
		anInt3746 = 104;
		anIntArrayArrayArray9 = new int[anInt3749][anInt3747][anInt3746];
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "()V")
	public static void method2917() {
		anInt3748 = 0;
		for (@Pc(3) int local3 = 0; local3 < anInt3749; local3++) {
			for (@Pc(8) int local8 = 0; local8 < anInt3747; local8++) {
				for (@Pc(13) int local13 = 0; local13 < anInt3746; local13++) {
					anIntArrayArrayArray9[local3][local8][local13] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "()V")
	public static void method2918() {
		@Pc(1) GL local1 = Static116.aGL1;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 4; local3++) {
			@Pc(10) int local10 = local3 + 16388;
			local1.glLightfv(local10, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local1.glLightf(local10, 4616, 0.0F);
			local1.glLightf(local10, 4615, 0.0F);
		}
		for (local3 = 0; local3 < 4; local3++) {
			anIntArray280[local3] = -1;
			method2925(local3);
		}
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "()V")
	public static void method2919() {
		aClass28Array1 = new Class28[255];
		anIntArray280 = new int[4];
		aBooleanArray16 = new boolean[4];
		anIntArray279 = new int[4];
		aBooleanArray15 = new boolean[4];
		anIntArrayArrayArray9 = new int[anInt3749][anInt3747][anInt3746];
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!ck;)V")
	public static void method2921(@OriginalArg(0) Class28 arg0) {
		if (anInt3748 >= 255) {
			System.out.println("Number of lights added exceeds maximum!");
		} else {
			aClass28Array1[anInt3748++] = arg0;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!Static76.aBoolean117 || anInt3750 == arg3 && anInt3752 == arg4 && anInt3744 == arg5 && anInt3751 == arg6 && anInt3745 == arg7) {
			return;
		}
		@Pc(20) int local20;
		for (local20 = 0; local20 < 4; local20++) {
			aBooleanArray15[local20] = false;
		}
		local20 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35;
		@Pc(40) int local40;
		label112: for (local35 = arg4; local35 <= arg6; local35++) {
			label110: for (local40 = arg5; local40 <= arg7; local40++) {
				@Pc(51) int local51 = anIntArrayArrayArray9[arg3][local35][local40];
				while (true) {
					while (true) {
						label96: while (true) {
							if (local51 == 0) {
								continue label110;
							}
							@Pc(59) int local59 = (local51 & 0xFF) - 1;
							local51 >>>= 0x8;
							@Pc(65) int local65;
							for (local65 = 0; local65 < local33; local65++) {
								if (local59 == anIntArray279[local65]) {
									continue label96;
								}
							}
							for (local65 = 0; local65 < 4; local65++) {
								if (local59 == anIntArray280[local65]) {
									if (!aBooleanArray15[local65]) {
										aBooleanArray15[local65] = true;
										local20++;
										if (local20 == 4) {
											break label112;
										}
									}
									continue label96;
								}
							}
							anIntArray279[local33++] = local59;
							local20++;
							if (local20 == 4) {
								break label112;
							}
						}
					}
				}
			}
		}
		for (local35 = 0; local35 < local33; local35++) {
			for (local40 = 0; local40 < 4; local40++) {
				if (!aBooleanArray15[local40]) {
					anIntArray280[local40] = anIntArray279[local35];
					aBooleanArray15[local40] = true;
					method2915(local40, aClass28Array1[anIntArray279[local35]], arg0, arg1, arg2);
					break;
				}
			}
		}
		for (local35 = 0; local35 < 4; local35++) {
			if (!aBooleanArray15[local35]) {
				anIntArray280[local35] = -1;
				method2925(local35);
			}
		}
		anInt3750 = arg3;
		anInt3752 = arg4;
		anInt3744 = arg5;
		anInt3751 = arg6;
		anInt3745 = arg7;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II[[[Lclient!sg;)V")
	public static void method2923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8_Sub27[][][] arg2) {
		if (!Static76.aBoolean117) {
			return;
		}
		@Pc(4) GL local4 = Static116.aGL1;
		Static108.method1772(0, 0);
		Static116.method1884(0);
		Static116.method1892();
		Static116.method1897(Static116.anInt2378);
		local4.glDepthMask(false);
		Static116.method1883(false);
		local4.glBlendFunc(774, 1);
		local4.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
		local4.glTexEnvi(8960, 34176, 34166);
		local4.glTexEnvi(8960, 34192, 770);
		label71: for (@Pc(56) int local56 = 0; local56 < anInt3748; local56++) {
			@Pc(63) Class28 local63 = aClass28Array1[local56];
			@Pc(66) int local66 = local63.anInt870;
			if (local63.aBoolean61) {
				local66--;
			}
			if (local63.aClass80_1 != null) {
				@Pc(76) int local76 = 0;
				@Pc(84) int local84 = (local63.anInt877 >> 7) - local63.anInt876;
				@Pc(92) int local92 = (local63.anInt877 >> 7) + local63.anInt876;
				if (local92 >= Static93.anInt1950) {
					local92 = Static93.anInt1950 - 1;
				}
				if (local84 < Static270.anInt5342) {
					local76 = Static270.anInt5342 - local84;
					local84 = Static270.anInt5342;
				}
				for (@Pc(112) int local112 = local84; local112 <= local92; local112++) {
					@Pc(121) short local121 = local63.aShortArray6[local76++];
					@Pc(133) int local133 = (local63.anInt863 >> 7) + (local121 >> 8) - local63.anInt876;
					@Pc(141) int local141 = local133 + (local121 & 0xFF) - 1;
					if (local133 < Static21.anInt579) {
						local133 = Static21.anInt579;
					}
					if (local141 >= Static257.anInt5096) {
						local141 = Static257.anInt5096 - 1;
					}
					for (@Pc(155) int local155 = local133; local155 <= local141; local155++) {
						@Pc(160) Class8_Sub27 local160 = null;
						if (local66 >= 0) {
							local160 = arg2[local66][local155][local112];
						}
						if (local66 < 0 || local160 != null && local160.aBoolean387) {
							Static116.method1868(201.5F - (float) local63.anInt870 * 50.0F - 1.5F);
							local4.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, local63.aFloat9 }, 0);
							local63.aClass80_1.method1822();
							continue label71;
						}
					}
				}
			}
		}
		local4.glTexEnvi(8960, 34176, 5890);
		local4.glTexEnvi(8960, 34192, 768);
		local4.glBlendFunc(770, 771);
		local4.glDepthMask(true);
		local4.glFogfv(2918, Static233.aFloatArray22, 0);
		local4.glEnableClientState(32888);
		Static116.method1877();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIII)V")
	public static void method2924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!Static76.aBoolean117 || anInt3750 == arg3 && anInt3752 == arg4 && anInt3744 == arg5 && anInt3751 == arg4 && anInt3745 == arg5) {
			return;
		}
		@Pc(20) int local20;
		for (local20 = 0; local20 < 4; local20++) {
			aBooleanArray15[local20] = false;
		}
		local20 = 0;
		@Pc(39) int local39 = anIntArrayArrayArray9[arg3][arg4][arg5];
		while (true) {
			@Pc(47) int local47;
			@Pc(53) int local53;
			label72: while (local39 != 0) {
				local47 = (local39 & 0xFF) - 1;
				local39 >>>= 0x8;
				for (local53 = 0; local53 < 4; local53++) {
					if (local47 == anIntArray280[local53]) {
						aBooleanArray15[local53] = true;
						continue label72;
					}
				}
				anIntArray279[local20++] = local47;
			}
			for (local47 = 0; local47 < local20; local47++) {
				for (local53 = 0; local53 < 4; local53++) {
					if (!aBooleanArray15[local53]) {
						anIntArray280[local53] = anIntArray279[local47];
						aBooleanArray15[local53] = true;
						method2915(local53, aClass28Array1[anIntArray279[local47]], arg0, arg1, arg2);
						break;
					}
				}
			}
			for (local47 = 0; local47 < 4; local47++) {
				if (!aBooleanArray15[local47]) {
					anIntArray280[local47] = -1;
					method2925(local47);
				}
			}
			anInt3750 = arg3;
			anInt3752 = arg4;
			anInt3744 = arg5;
			anInt3751 = arg4;
			anInt3745 = arg5;
			return;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
	private static void method2925(@OriginalArg(0) int arg0) {
		if (aBooleanArray16[arg0]) {
			aBooleanArray16[arg0] = false;
			@Pc(14) int local14 = arg0 + 16384 + 4;
			@Pc(16) GL local16 = Static116.aGL1;
			local16.glDisable(local14);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIII)V")
	public static void method2926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!Static76.aBoolean117) {
			return;
		}
		label43: for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (anIntArray280[local4] != -1) {
				@Pc(20) int local20 = anIntArrayArrayArray9[arg0][arg1][arg2];
				@Pc(28) int local28;
				while (local20 != 0) {
					local28 = (local20 & 0xFF) - 1;
					local20 >>>= 0x8;
					if (local28 == anIntArray280[local4]) {
						continue label43;
					}
				}
				local20 = anIntArrayArrayArray9[arg0][arg3][arg4];
				while (local20 != 0) {
					local28 = (local20 & 0xFF) - 1;
					local20 >>>= 0x8;
					if (local28 == anIntArray280[local4]) {
						continue label43;
					}
				}
			}
			anIntArray280[local4] = -1;
			method2925(local4);
		}
	}

	@OriginalMember(owner = "client!og", name = "e", descriptor = "()V")
	public static void method2927() {
		aClass28Array1 = null;
		anIntArray280 = null;
		aBooleanArray16 = null;
		anIntArray279 = null;
		aBooleanArray15 = null;
		anIntArrayArrayArray9 = null;
	}

	@OriginalMember(owner = "client!og", name = "f", descriptor = "()V")
	public static void method2928() {
		for (@Pc(1) int local1 = 0; local1 < anInt3748; local1++) {
			@Pc(8) Class28 local8 = aClass28Array1[local1];
			@Pc(11) int local11 = local8.anInt870;
			if (local8.aBoolean60) {
				local11 = 0;
			}
			@Pc(19) int local19 = local8.anInt870;
			if (local8.aBoolean62) {
				local19 = 3;
			}
			for (@Pc(26) int local26 = local11; local26 <= local19; local26++) {
				@Pc(31) int local31 = 0;
				@Pc(39) int local39 = (local8.anInt877 >> 7) - local8.anInt876;
				if (local39 < 0) {
					local31 = -local39;
					local39 = 0;
				}
				@Pc(55) int local55 = (local8.anInt877 >> 7) + local8.anInt876;
				if (local55 > anInt3746 - 1) {
					local55 = anInt3746 - 1;
				}
				for (@Pc(66) int local66 = local39; local66 <= local55; local66++) {
					@Pc(75) short local75 = local8.aShortArray6[local31++];
					@Pc(87) int local87 = (local8.anInt863 >> 7) + (local75 >> 8) - local8.anInt876;
					@Pc(95) int local95 = local87 + (local75 & 0xFF) - 1;
					if (local87 < 0) {
						local87 = 0;
					}
					if (local95 > anInt3747 - 1) {
						local95 = anInt3747 - 1;
					}
					for (@Pc(110) int local110 = local87; local110 <= local95; local110++) {
						@Pc(121) int local121 = anIntArrayArrayArray9[local26][local110][local66];
						if ((local121 & 0xFF) == 0) {
							anIntArrayArrayArray9[local26][local110][local66] = local121 | local1 + 1;
						} else if ((local121 & 0xFF00) == 0) {
							anIntArrayArrayArray9[local26][local110][local66] = local121 | local1 + 1 << 8;
						} else if ((local121 & 0xFF0000) == 0) {
							anIntArrayArrayArray9[local26][local110][local66] = local121 | local1 + 1 << 16;
						} else if ((local121 & 0xFF000000) == 0) {
							anIntArrayArrayArray9[local26][local110][local66] = local121 | local1 + 1 << 24;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "g", descriptor = "()V")
	public static void method2929() {
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			anIntArray280[local1] = -1;
			method2925(local1);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIII)V")
	public static void method2930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!Static76.aBoolean117) {
			return;
		}
		if (arg0 == 1 && arg5 > 0) {
			method2924(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
		} else if (arg0 == 4 && arg5 < anInt3747 - 1) {
			method2924(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
		} else if (arg0 == 8 && arg6 > 0) {
			method2924(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
		} else if (arg0 == 2 && arg6 < anInt3746 - 1) {
			method2924(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
		} else if (arg0 == 16 && arg5 > 0 && arg6 < anInt3746 - 1) {
			method2924(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
		} else if (arg0 == 32 && arg5 < anInt3747 - 1 && arg6 < anInt3746 - 1) {
			method2924(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
		} else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
			method2924(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
		} else if (arg0 == 64 && arg5 < anInt3747 - 1 && arg6 > 0) {
			method2924(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
		}
	}
}
