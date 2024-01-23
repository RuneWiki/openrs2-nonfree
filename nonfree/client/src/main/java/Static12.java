import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
	private static int anInt220;

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "[Lclient!sj;")
	public static Class155[] aClass155Array1;

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
	private static int anInt221;

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
	private static int anInt222;

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "[[[I")
	private static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
	private static int anInt223;

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
	private static int anInt224;

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "[Z")
	private static boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "[I")
	private static int[] anIntArray25;

	@OriginalMember(owner = "client!ao", name = "l", descriptor = "I")
	private static int anInt226;

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
	private static int anInt227;

	@OriginalMember(owner = "client!ao", name = "n", descriptor = "[I")
	private static int[] anIntArray26;

	@OriginalMember(owner = "client!ao", name = "o", descriptor = "[Z")
	private static boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!ao", name = "p", descriptor = "I")
	private static int anInt228;

	@OriginalMember(owner = "client!ao", name = "i", descriptor = "[F")
	private static float[] aFloatArray9 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "I")
	public static int anInt225 = 0;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "()V")
	public static void method193() {
		for (@Pc(1) int local1 = 0; local1 < anInt225; local1++) {
			@Pc(8) Class155 local8 = aClass155Array1[local1];
			@Pc(11) int local11 = local8.anInt4698;
			if (local8.aBoolean303) {
				local11 = 0;
			}
			@Pc(19) int local19 = local8.anInt4698;
			if (local8.aBoolean305) {
				local19 = 3;
			}
			for (@Pc(26) int local26 = local11; local26 <= local19; local26++) {
				@Pc(31) int local31 = 0;
				@Pc(39) int local39 = (local8.anInt4691 >> 7) - local8.anInt4700;
				if (local39 < 0) {
					local31 = -local39;
					local39 = 0;
				}
				@Pc(55) int local55 = (local8.anInt4691 >> 7) + local8.anInt4700;
				if (local55 > anInt220 - 1) {
					local55 = anInt220 - 1;
				}
				for (@Pc(66) int local66 = local39; local66 <= local55; local66++) {
					@Pc(75) short local75 = local8.aShortArray77[local31++];
					@Pc(87) int local87 = (local8.anInt4688 >> 7) + (local75 >> 8) - local8.anInt4700;
					@Pc(95) int local95 = local87 + (local75 & 0xFF) - 1;
					if (local87 < 0) {
						local87 = 0;
					}
					if (local95 > anInt228 - 1) {
						local95 = anInt228 - 1;
					}
					for (@Pc(110) int local110 = local87; local110 <= local95; local110++) {
						@Pc(121) int local121 = anIntArrayArrayArray1[local26][local110][local66];
						if ((local121 & 0xFF) == 0) {
							anIntArrayArrayArray1[local26][local110][local66] = local121 | local1 + 1;
						} else if ((local121 & 0xFF00) == 0) {
							anIntArrayArrayArray1[local26][local110][local66] = local121 | local1 + 1 << 8;
						} else if ((local121 & 0xFF0000) == 0) {
							anIntArrayArrayArray1[local26][local110][local66] = local121 | local1 + 1 << 16;
						} else if ((local121 & 0xFF000000) == 0) {
							anIntArrayArrayArray1[local26][local110][local66] = local121 | local1 + 1 << 24;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "()V")
	public static void method194() {
		aClass155Array1 = null;
		anIntArrayArrayArray1 = null;
		anIntArray26 = null;
		aBooleanArray4 = null;
		aFloatArray9 = null;
		anIntArray25 = null;
		aBooleanArray3 = null;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIII)V")
	public static void method195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!Static298.aBoolean357) {
			return;
		}
		label43: for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (anIntArray26[local4] != -1) {
				@Pc(20) int local20 = anIntArrayArrayArray1[arg0][arg1][arg2];
				@Pc(28) int local28;
				while (local20 != 0) {
					local28 = (local20 & 0xFF) - 1;
					local20 >>>= 0x8;
					if (local28 == anIntArray26[local4]) {
						continue label43;
					}
				}
				local20 = anIntArrayArrayArray1[arg0][arg3][arg4];
				while (local20 != 0) {
					local28 = (local20 & 0xFF) - 1;
					local20 >>>= 0x8;
					if (local28 == anIntArray26[local4]) {
						continue label43;
					}
				}
			}
			anIntArray26[local4] = -1;
			method209(local4);
		}
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "()V")
	public static void method196() {
		@Pc(1) GL local1 = Static178.aGL1;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 4; local3++) {
			@Pc(10) int local10 = local3 + 16388;
			local1.glLightfv(local10, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local1.glLightf(local10, 4616, 0.0F);
			local1.glLightf(local10, 4615, 0.0F);
		}
		for (local3 = 0; local3 < 4; local3++) {
			anIntArray26[local3] = -1;
			method209(local3);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIII)V")
	public static void method197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!Static298.aBoolean357 || anInt223 == arg3 && anInt226 == arg4 && anInt224 == arg5 && anInt222 == arg4 && anInt227 == arg5) {
			return;
		}
		@Pc(20) int local20;
		for (local20 = 0; local20 < 4; local20++) {
			aBooleanArray3[local20] = false;
		}
		local20 = 0;
		@Pc(39) int local39 = anIntArrayArrayArray1[arg3][arg4][arg5];
		while (true) {
			@Pc(47) int local47;
			@Pc(53) int local53;
			label72: while (local39 != 0) {
				local47 = (local39 & 0xFF) - 1;
				local39 >>>= 0x8;
				for (local53 = 0; local53 < 4; local53++) {
					if (local47 == anIntArray26[local53]) {
						aBooleanArray3[local53] = true;
						continue label72;
					}
				}
				anIntArray25[local20++] = local47;
			}
			for (local47 = 0; local47 < local20; local47++) {
				for (local53 = 0; local53 < 4; local53++) {
					if (!aBooleanArray3[local53]) {
						anIntArray26[local53] = anIntArray25[local47];
						aBooleanArray3[local53] = true;
						method198(local53, aClass155Array1[anIntArray25[local47]], arg0, arg1, arg2);
						break;
					}
				}
			}
			for (local47 = 0; local47 < 4; local47++) {
				if (!aBooleanArray3[local47]) {
					anIntArray26[local47] = -1;
					method209(local47);
				}
			}
			anInt223 = arg3;
			anInt226 = arg4;
			anInt224 = arg5;
			anInt222 = arg4;
			anInt227 = arg5;
			return;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILclient!sj;III)V")
	private static void method198(@OriginalArg(0) int arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = arg0 + 16384 + 4;
		@Pc(7) GL local7 = Static178.aGL1;
		if (!aBooleanArray4[arg0]) {
			local7.glEnable(local5);
			aBooleanArray4[arg0] = true;
		}
		local7.glLightf(local5, 4617, arg1.aFloat46);
		local7.glLightfv(local5, 4609, arg1.aFloatArray26, 0);
		aFloatArray9[0] = arg1.anInt4688 - arg2;
		aFloatArray9[1] = arg1.anInt4687 - arg3;
		aFloatArray9[2] = arg1.anInt4691 - arg4;
		local7.glLightfv(local5, 4611, aFloatArray9, 0);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIII)V")
	public static void method199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!Static298.aBoolean357) {
			return;
		}
		if (arg0 == 1 && arg5 > 0) {
			method197(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
		} else if (arg0 == 4 && arg5 < anInt228 - 1) {
			method197(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
		} else if (arg0 == 8 && arg6 > 0) {
			method197(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
		} else if (arg0 == 2 && arg6 < anInt220 - 1) {
			method197(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
		} else if (arg0 == 16 && arg5 > 0 && arg6 < anInt220 - 1) {
			method197(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
		} else if (arg0 == 32 && arg5 < anInt228 - 1 && arg6 < anInt220 - 1) {
			method197(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
		} else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
			method197(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
		} else if (arg0 == 64 && arg5 < anInt228 - 1 && arg6 > 0) {
			method197(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(III)V")
	public static void method200() {
		anInt221 = 4;
		anInt228 = 104;
		anInt220 = 104;
		anIntArrayArrayArray1 = new int[anInt221][anInt228][anInt220];
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZ)V")
	public static void method201(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(1) int local1 = 0; local1 < anInt225; local1++) {
			aClass155Array1[local1].method3752(arg1, arg0);
		}
		anInt223 = -1;
		anInt226 = -1;
		anInt224 = -1;
		anInt222 = -1;
		anInt227 = -1;
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "()V")
	public static void method202() {
		anInt225 = 0;
		for (@Pc(3) int local3 = 0; local3 < anInt221; local3++) {
			for (@Pc(8) int local8 = 0; local8 < anInt228; local8++) {
				for (@Pc(13) int local13 = 0; local13 < anInt220; local13++) {
					anIntArrayArrayArray1[local3][local8][local13] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!sj;)V")
	public static void method203(@OriginalArg(0) Class155 arg0) {
		if (anInt225 >= 255) {
			System.out.println("Number of lights added exceeds maximum!");
		} else {
			aClass155Array1[anInt225++] = arg0;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIIII)V")
	public static void method204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!Static298.aBoolean357 || anInt223 == arg3 && anInt226 == arg4 && anInt224 == arg5 && anInt222 == arg6 && anInt227 == arg7) {
			return;
		}
		@Pc(20) int local20;
		for (local20 = 0; local20 < 4; local20++) {
			aBooleanArray3[local20] = false;
		}
		local20 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35;
		@Pc(40) int local40;
		label112: for (local35 = arg4; local35 <= arg6; local35++) {
			label110: for (local40 = arg5; local40 <= arg7; local40++) {
				@Pc(51) int local51 = anIntArrayArrayArray1[arg3][local35][local40];
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
								if (local59 == anIntArray25[local65]) {
									continue label96;
								}
							}
							for (local65 = 0; local65 < 4; local65++) {
								if (local59 == anIntArray26[local65]) {
									if (!aBooleanArray3[local65]) {
										aBooleanArray3[local65] = true;
										local20++;
										if (local20 == 4) {
											break label112;
										}
									}
									continue label96;
								}
							}
							anIntArray25[local33++] = local59;
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
				if (!aBooleanArray3[local40]) {
					anIntArray26[local40] = anIntArray25[local35];
					aBooleanArray3[local40] = true;
					method198(local40, aClass155Array1[anIntArray25[local35]], arg0, arg1, arg2);
					break;
				}
			}
		}
		for (local35 = 0; local35 < 4; local35++) {
			if (!aBooleanArray3[local35]) {
				anIntArray26[local35] = -1;
				method209(local35);
			}
		}
		anInt223 = arg3;
		anInt226 = arg4;
		anInt224 = arg5;
		anInt222 = arg6;
		anInt227 = arg7;
	}

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "()V")
	private static void method205() {
		aClass155Array1 = null;
		anIntArray26 = null;
		aBooleanArray4 = null;
		anIntArray25 = null;
		aBooleanArray3 = null;
		anIntArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "()V")
	public static void method206() {
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			anIntArray26[local1] = -1;
			method209(local1);
		}
	}

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "()V")
	public static void method207() {
		aClass155Array1 = new Class155[255];
		anIntArray26 = new int[4];
		aBooleanArray4 = new boolean[4];
		anIntArray25 = new int[4];
		aBooleanArray3 = new boolean[4];
		anIntArrayArrayArray1 = new int[anInt221][anInt228][anInt220];
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II[[[Lclient!dk;)V")
	public static void method208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub11[][][] arg2) {
		if (!Static298.aBoolean357) {
			return;
		}
		@Pc(4) GL local4 = Static178.aGL1;
		Static32.method479(0, 0);
		Static178.method2754(0);
		Static178.method2791();
		Static178.method2763(Static178.anInt3491);
		local4.glDepthMask(false);
		Static178.method2776(false);
		local4.glBlendFunc(774, 1);
		local4.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
		local4.glTexEnvi(8960, 34176, 34166);
		local4.glTexEnvi(8960, 34192, 770);
		label71: for (@Pc(56) int local56 = 0; local56 < anInt225; local56++) {
			@Pc(63) Class155 local63 = aClass155Array1[local56];
			@Pc(66) int local66 = local63.anInt4698;
			if (local63.aBoolean306) {
				local66--;
			}
			if (local63.aClass179_1 != null) {
				@Pc(76) int local76 = 0;
				@Pc(84) int local84 = (local63.anInt4691 >> 7) - local63.anInt4700;
				@Pc(92) int local92 = (local63.anInt4691 >> 7) + local63.anInt4700;
				if (local92 >= Static77.anInt1474) {
					local92 = Static77.anInt1474 - 1;
				}
				if (local84 < Static219.anInt4347) {
					local76 = Static219.anInt4347 - local84;
					local84 = Static219.anInt4347;
				}
				for (@Pc(112) int local112 = local84; local112 <= local92; local112++) {
					@Pc(121) short local121 = local63.aShortArray77[local76++];
					@Pc(133) int local133 = (local63.anInt4688 >> 7) + (local121 >> 8) - local63.anInt4700;
					@Pc(141) int local141 = local133 + (local121 & 0xFF) - 1;
					if (local133 < Static106.anInt2266) {
						local133 = Static106.anInt2266;
					}
					if (local141 >= Static137.anInt2811) {
						local141 = Static137.anInt2811 - 1;
					}
					for (@Pc(155) int local155 = local133; local155 <= local141; local155++) {
						@Pc(160) Class4_Sub11 local160 = null;
						if (local66 >= 0) {
							local160 = arg2[local66][local155][local112];
						}
						if (local66 < 0 || local160 != null && local160.aBoolean76) {
							Static178.method2771(201.5F - (float) local63.anInt4698 * 50.0F - 1.5F);
							local4.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, local63.aFloat45 }, 0);
							local63.aClass179_1.method4302();
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
		local4.glFogfv(2918, Static291.aFloatArray32, 0);
		local4.glEnableClientState(32888);
		Static178.method2757();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
	private static void method209(@OriginalArg(0) int arg0) {
		if (aBooleanArray4[arg0]) {
			aBooleanArray4[arg0] = false;
			@Pc(14) int local14 = arg0 + 16384 + 4;
			@Pc(16) GL local16 = Static178.aGL1;
			local16.glDisable(local14);
		}
	}
}
