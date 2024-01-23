import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!od", name = "a", descriptor = "I")
	private static int anInt3732;

	@OriginalMember(owner = "client!od", name = "b", descriptor = "I")
	private static int anInt3733;

	@OriginalMember(owner = "client!od", name = "c", descriptor = "[Lclient!em;")
	public static Class50[] aClass50Array1;

	@OriginalMember(owner = "client!od", name = "d", descriptor = "I")
	private static int anInt3734;

	@OriginalMember(owner = "client!od", name = "e", descriptor = "I")
	private static int anInt3735;

	@OriginalMember(owner = "client!od", name = "f", descriptor = "[[[I")
	private static int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!od", name = "g", descriptor = "[Z")
	private static boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!od", name = "i", descriptor = "I")
	private static int anInt3737;

	@OriginalMember(owner = "client!od", name = "j", descriptor = "[I")
	private static int[] anIntArray403;

	@OriginalMember(owner = "client!od", name = "k", descriptor = "I")
	private static int anInt3738;

	@OriginalMember(owner = "client!od", name = "l", descriptor = "[Z")
	private static boolean[] aBooleanArray21;

	@OriginalMember(owner = "client!od", name = "m", descriptor = "I")
	private static int anInt3739;

	@OriginalMember(owner = "client!od", name = "n", descriptor = "I")
	private static int anInt3740;

	@OriginalMember(owner = "client!od", name = "o", descriptor = "[I")
	private static int[] anIntArray404;

	@OriginalMember(owner = "client!od", name = "h", descriptor = "I")
	public static int anInt3736 = 0;

	@OriginalMember(owner = "client!od", name = "p", descriptor = "[F")
	private static float[] aFloatArray43 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(III)V")
	public static void method3122() {
		anInt3738 = 4;
		anInt3732 = 104;
		anInt3733 = 104;
		anIntArrayArrayArray10 = new int[anInt3738][anInt3732][anInt3733];
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "()V")
	public static void method3123() {
		anInt3736 = 0;
		for (@Pc(3) int local3 = 0; local3 < anInt3738; local3++) {
			for (@Pc(8) int local8 = 0; local8 < anInt3732; local8++) {
				for (@Pc(13) int local13 = 0; local13 < anInt3733; local13++) {
					anIntArrayArrayArray10[local3][local8][local13] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZ)V")
	public static void method3124(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(1) int local1 = 0; local1 < anInt3736; local1++) {
			aClass50Array1[local1].method1076(arg1, arg0);
		}
		anInt3734 = -1;
		anInt3737 = -1;
		anInt3740 = -1;
		anInt3735 = -1;
		anInt3739 = -1;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "()V")
	public static void method3125() {
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			anIntArray403[local1] = -1;
			method3137(local1);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!em;)V")
	public static void method3126(@OriginalArg(0) Class50 arg0) {
		if (anInt3736 >= 255) {
			System.out.println("Number of lights added exceeds maximum!");
		} else {
			aClass50Array1[anInt3736++] = arg0;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIII)V")
	public static void method3127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!Static56.aBoolean66 || anInt3734 == arg3 && anInt3737 == arg4 && anInt3740 == arg5 && anInt3735 == arg4 && anInt3739 == arg5) {
			return;
		}
		@Pc(20) int local20;
		for (local20 = 0; local20 < 4; local20++) {
			aBooleanArray20[local20] = false;
		}
		local20 = 0;
		@Pc(39) int local39 = anIntArrayArrayArray10[arg3][arg4][arg5];
		while (true) {
			@Pc(47) int local47;
			@Pc(53) int local53;
			label72: while (local39 != 0) {
				local47 = (local39 & 0xFF) - 1;
				local39 >>>= 0x8;
				for (local53 = 0; local53 < 4; local53++) {
					if (local47 == anIntArray403[local53]) {
						aBooleanArray20[local53] = true;
						continue label72;
					}
				}
				anIntArray404[local20++] = local47;
			}
			for (local47 = 0; local47 < local20; local47++) {
				for (local53 = 0; local53 < 4; local53++) {
					if (!aBooleanArray20[local53]) {
						anIntArray403[local53] = anIntArray404[local47];
						aBooleanArray20[local53] = true;
						method3138(local53, aClass50Array1[anIntArray404[local47]], arg0, arg1, arg2);
						break;
					}
				}
			}
			for (local47 = 0; local47 < 4; local47++) {
				if (!aBooleanArray20[local47]) {
					anIntArray403[local47] = -1;
					method3137(local47);
				}
			}
			anInt3734 = arg3;
			anInt3737 = arg4;
			anInt3740 = arg5;
			anInt3735 = arg4;
			anInt3739 = arg5;
			return;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!Static56.aBoolean66 || anInt3734 == arg3 && anInt3737 == arg4 && anInt3740 == arg5 && anInt3735 == arg6 && anInt3739 == arg7) {
			return;
		}
		@Pc(20) int local20;
		for (local20 = 0; local20 < 4; local20++) {
			aBooleanArray20[local20] = false;
		}
		local20 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35;
		@Pc(40) int local40;
		label112: for (local35 = arg4; local35 <= arg6; local35++) {
			label110: for (local40 = arg5; local40 <= arg7; local40++) {
				@Pc(51) int local51 = anIntArrayArrayArray10[arg3][local35][local40];
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
								if (local59 == anIntArray404[local65]) {
									continue label96;
								}
							}
							for (local65 = 0; local65 < 4; local65++) {
								if (local59 == anIntArray403[local65]) {
									if (!aBooleanArray20[local65]) {
										aBooleanArray20[local65] = true;
										local20++;
										if (local20 == 4) {
											break label112;
										}
									}
									continue label96;
								}
							}
							anIntArray404[local33++] = local59;
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
				if (!aBooleanArray20[local40]) {
					anIntArray403[local40] = anIntArray404[local35];
					aBooleanArray20[local40] = true;
					method3138(local40, aClass50Array1[anIntArray404[local35]], arg0, arg1, arg2);
					break;
				}
			}
		}
		for (local35 = 0; local35 < 4; local35++) {
			if (!aBooleanArray20[local35]) {
				anIntArray403[local35] = -1;
				method3137(local35);
			}
		}
		anInt3734 = arg3;
		anInt3737 = arg4;
		anInt3740 = arg5;
		anInt3735 = arg6;
		anInt3739 = arg7;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II[[[Lclient!nh;)V")
	public static void method3129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub19[][][] arg2) {
		if (!Static56.aBoolean66) {
			return;
		}
		@Pc(4) GL local4 = Static94.aGL1;
		Static164.method2665(0, 0);
		Static94.method1597(0);
		Static94.method1595();
		Static94.method1600(Static94.anInt2075);
		local4.glDepthMask(false);
		Static94.method1610(false);
		local4.glBlendFunc(774, 1);
		local4.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
		local4.glTexEnvi(8960, 34176, 34166);
		local4.glTexEnvi(8960, 34192, 770);
		label71: for (@Pc(56) int local56 = 0; local56 < anInt3736; local56++) {
			@Pc(63) Class50 local63 = aClass50Array1[local56];
			@Pc(66) int local66 = local63.anInt1326;
			if (local63.aBoolean80) {
				local66--;
			}
			if (local63.aClass137_1 != null) {
				@Pc(76) int local76 = 0;
				@Pc(84) int local84 = (local63.anInt1320 >> 7) - local63.anInt1318;
				@Pc(92) int local92 = (local63.anInt1320 >> 7) + local63.anInt1318;
				if (local92 >= Static70.anInt1344) {
					local92 = Static70.anInt1344 - 1;
				}
				if (local84 < Static47.anInt890) {
					local76 = Static47.anInt890 - local84;
					local84 = Static47.anInt890;
				}
				for (@Pc(112) int local112 = local84; local112 <= local92; local112++) {
					@Pc(121) short local121 = local63.aShortArray28[local76++];
					@Pc(133) int local133 = (local63.anInt1338 >> 7) + (local121 >> 8) - local63.anInt1318;
					@Pc(141) int local141 = local133 + (local121 & 0xFF) - 1;
					if (local133 < Static261.anInt4979) {
						local133 = Static261.anInt4979;
					}
					if (local141 >= Static87.anInt5782) {
						local141 = Static87.anInt5782 - 1;
					}
					for (@Pc(155) int local155 = local133; local155 <= local141; local155++) {
						@Pc(160) Class4_Sub19 local160 = null;
						if (local66 >= 0) {
							local160 = arg2[local66][local155][local112];
						}
						if (local66 < 0 || local160 != null && local160.aBoolean257) {
							Static94.method1613(201.5F - (float) local63.anInt1326 * 50.0F - 1.5F);
							local4.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, local63.aFloat33 }, 0);
							local63.aClass137_1.method3446();
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
		local4.glFogfv(2918, Static178.aFloatArray39, 0);
		local4.glEnableClientState(32888);
		Static94.method1618();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIII)V")
	public static void method3130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!Static56.aBoolean66) {
			return;
		}
		label43: for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (anIntArray403[local4] != -1) {
				@Pc(20) int local20 = anIntArrayArrayArray10[arg0][arg1][arg2];
				@Pc(28) int local28;
				while (local20 != 0) {
					local28 = (local20 & 0xFF) - 1;
					local20 >>>= 0x8;
					if (local28 == anIntArray403[local4]) {
						continue label43;
					}
				}
				local20 = anIntArrayArrayArray10[arg0][arg3][arg4];
				while (local20 != 0) {
					local28 = (local20 & 0xFF) - 1;
					local20 >>>= 0x8;
					if (local28 == anIntArray403[local4]) {
						continue label43;
					}
				}
			}
			anIntArray403[local4] = -1;
			method3137(local4);
		}
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "()V")
	public static void method3131() {
		@Pc(1) GL local1 = Static94.aGL1;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 4; local3++) {
			@Pc(10) int local10 = local3 + 16388;
			local1.glLightfv(local10, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local1.glLightf(local10, 4616, 0.0F);
			local1.glLightf(local10, 4615, 0.0F);
		}
		for (local3 = 0; local3 < 4; local3++) {
			anIntArray403[local3] = -1;
			method3137(local3);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIII)V")
	public static void method3132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!Static56.aBoolean66) {
			return;
		}
		if (arg0 == 1 && arg5 > 0) {
			method3127(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
		} else if (arg0 == 4 && arg5 < anInt3732 - 1) {
			method3127(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
		} else if (arg0 == 8 && arg6 > 0) {
			method3127(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
		} else if (arg0 == 2 && arg6 < anInt3733 - 1) {
			method3127(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
		} else if (arg0 == 16 && arg5 > 0 && arg6 < anInt3733 - 1) {
			method3127(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
		} else if (arg0 == 32 && arg5 < anInt3732 - 1 && arg6 < anInt3733 - 1) {
			method3127(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
		} else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
			method3127(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
		} else if (arg0 == 64 && arg5 < anInt3732 - 1 && arg6 > 0) {
			method3127(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
		}
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "()V")
	public static void method3133() {
		aClass50Array1 = new Class50[255];
		anIntArray403 = new int[4];
		aBooleanArray21 = new boolean[4];
		anIntArray404 = new int[4];
		aBooleanArray20 = new boolean[4];
		anIntArrayArrayArray10 = new int[anInt3738][anInt3732][anInt3733];
	}

	@OriginalMember(owner = "client!od", name = "f", descriptor = "()V")
	public static void method3135() {
		for (@Pc(1) int local1 = 0; local1 < anInt3736; local1++) {
			@Pc(8) Class50 local8 = aClass50Array1[local1];
			@Pc(11) int local11 = local8.anInt1326;
			if (local8.aBoolean78) {
				local11 = 0;
			}
			@Pc(19) int local19 = local8.anInt1326;
			if (local8.aBoolean79) {
				local19 = 3;
			}
			for (@Pc(26) int local26 = local11; local26 <= local19; local26++) {
				@Pc(31) int local31 = 0;
				@Pc(39) int local39 = (local8.anInt1320 >> 7) - local8.anInt1318;
				if (local39 < 0) {
					local31 = -local39;
					local39 = 0;
				}
				@Pc(55) int local55 = (local8.anInt1320 >> 7) + local8.anInt1318;
				if (local55 > anInt3733 - 1) {
					local55 = anInt3733 - 1;
				}
				for (@Pc(66) int local66 = local39; local66 <= local55; local66++) {
					@Pc(75) short local75 = local8.aShortArray28[local31++];
					@Pc(87) int local87 = (local8.anInt1338 >> 7) + (local75 >> 8) - local8.anInt1318;
					@Pc(95) int local95 = local87 + (local75 & 0xFF) - 1;
					if (local87 < 0) {
						local87 = 0;
					}
					if (local95 > anInt3732 - 1) {
						local95 = anInt3732 - 1;
					}
					for (@Pc(110) int local110 = local87; local110 <= local95; local110++) {
						@Pc(121) int local121 = anIntArrayArrayArray10[local26][local110][local66];
						if ((local121 & 0xFF) == 0) {
							anIntArrayArrayArray10[local26][local110][local66] = local121 | local1 + 1;
						} else if ((local121 & 0xFF00) == 0) {
							anIntArrayArrayArray10[local26][local110][local66] = local121 | local1 + 1 << 8;
						} else if ((local121 & 0xFF0000) == 0) {
							anIntArrayArrayArray10[local26][local110][local66] = local121 | local1 + 1 << 16;
						} else if ((local121 & 0xFF000000) == 0) {
							anIntArrayArrayArray10[local26][local110][local66] = local121 | local1 + 1 << 24;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "g", descriptor = "()V")
	public static void method3136() {
		aClass50Array1 = null;
		anIntArray403 = null;
		aBooleanArray21 = null;
		anIntArray404 = null;
		aBooleanArray20 = null;
		anIntArrayArrayArray10 = null;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
	private static void method3137(@OriginalArg(0) int arg0) {
		if (aBooleanArray21[arg0]) {
			aBooleanArray21[arg0] = false;
			@Pc(14) int local14 = arg0 + 16384 + 4;
			@Pc(16) GL local16 = Static94.aGL1;
			local16.glDisable(local14);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!em;III)V")
	private static void method3138(@OriginalArg(0) int arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = arg0 + 16384 + 4;
		@Pc(7) GL local7 = Static94.aGL1;
		if (!aBooleanArray21[arg0]) {
			local7.glEnable(local5);
			aBooleanArray21[arg0] = true;
		}
		local7.glLightf(local5, 4617, arg1.aFloat32);
		local7.glLightfv(local5, 4609, arg1.aFloatArray16, 0);
		aFloatArray43[0] = arg1.anInt1338 - arg2;
		aFloatArray43[1] = arg1.anInt1322 - arg3;
		aFloatArray43[2] = arg1.anInt1320 - arg4;
		local7.glLightfv(local5, 4611, aFloatArray43, 0);
	}
}
