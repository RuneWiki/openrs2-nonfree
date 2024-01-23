import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "[I")
	private static int[] anIntArray313;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	private static int anInt2724;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
	private static int anInt2725;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
	private static int anInt2726;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "[Z")
	private static boolean[] aBooleanArray68;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
	private static int anInt2727;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
	private static int anInt2728;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "[[[I")
	private static int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "[Lclient!jn;")
	public static Class90[] aClass90Array1;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
	private static int anInt2729;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "[I")
	private static int[] anIntArray314;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "[Z")
	private static boolean[] aBooleanArray69;

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
	private static int anInt2731;

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
	private static int anInt2732;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "[F")
	private static float[] aFloatArray9 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
	public static int anInt2730 = 0;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!jn;III)V")
	private static void method2399(@OriginalArg(0) int arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = arg0 + 16384 + 4;
		@Pc(7) GL local7 = Static283.aGL1;
		if (!aBooleanArray68[arg0]) {
			local7.glEnable(local5);
			aBooleanArray68[arg0] = true;
		}
		local7.glLightf(local5, 4617, arg1.aFloat43);
		local7.glLightfv(local5, 4609, arg1.aFloatArray8, 0);
		aFloatArray9[0] = arg1.anInt2630 - arg2;
		aFloatArray9[1] = arg1.anInt2632 - arg3;
		aFloatArray9[2] = arg1.anInt2639 - arg4;
		local7.glLightfv(local5, 4611, aFloatArray9, 0);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()V")
	public static void method2400() {
		@Pc(1) GL local1 = Static283.aGL1;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 4; local3++) {
			@Pc(10) int local10 = local3 + 16388;
			local1.glLightfv(local10, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local1.glLightf(local10, 4616, 0.0F);
			local1.glLightf(local10, 4615, 0.0F);
		}
		for (local3 = 0; local3 < 4; local3++) {
			anIntArray313[local3] = -1;
			method2412(local3);
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "()V")
	public static void method2401() {
		anInt2730 = 0;
		for (@Pc(3) int local3 = 0; local3 < anInt2724; local3++) {
			for (@Pc(8) int local8 = 0; local8 < anInt2729; local8++) {
				for (@Pc(13) int local13 = 0; local13 < anInt2727; local13++) {
					anIntArrayArrayArray10[local3][local8][local13] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "()V")
	public static void method2402() {
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			anIntArray313[local1] = -1;
			method2412(local1);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!jn;)V")
	public static void method2403(@OriginalArg(0) Class90 arg0) {
		if (anInt2730 >= 255) {
			System.out.println("Number of lights added exceeds maximum!");
		} else {
			aClass90Array1[anInt2730++] = arg0;
		}
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "()V")
	public static void method2404() {
		for (@Pc(1) int local1 = 0; local1 < anInt2730; local1++) {
			@Pc(8) Class90 local8 = aClass90Array1[local1];
			@Pc(11) int local11 = local8.anInt2638;
			if (local8.aBoolean197) {
				local11 = 0;
			}
			@Pc(19) int local19 = local8.anInt2638;
			if (local8.aBoolean196) {
				local19 = 3;
			}
			for (@Pc(26) int local26 = local11; local26 <= local19; local26++) {
				@Pc(31) int local31 = 0;
				@Pc(39) int local39 = (local8.anInt2639 >> 7) - local8.anInt2633;
				if (local39 < 0) {
					local31 = -local39;
					local39 = 0;
				}
				@Pc(55) int local55 = (local8.anInt2639 >> 7) + local8.anInt2633;
				if (local55 > anInt2727 - 1) {
					local55 = anInt2727 - 1;
				}
				for (@Pc(66) int local66 = local39; local66 <= local55; local66++) {
					@Pc(75) short local75 = local8.aShortArray69[local31++];
					@Pc(87) int local87 = (local8.anInt2630 >> 7) + (local75 >> 8) - local8.anInt2633;
					@Pc(95) int local95 = local87 + (local75 & 0xFF) - 1;
					if (local87 < 0) {
						local87 = 0;
					}
					if (local95 > anInt2729 - 1) {
						local95 = anInt2729 - 1;
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

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIII)V")
	public static void method2405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!Static67.aBoolean95) {
			return;
		}
		label43: for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (anIntArray313[local4] != -1) {
				@Pc(20) int local20 = anIntArrayArrayArray10[arg0][arg1][arg2];
				@Pc(28) int local28;
				while (local20 != 0) {
					local28 = (local20 & 0xFF) - 1;
					local20 >>>= 0x8;
					if (local28 == anIntArray313[local4]) {
						continue label43;
					}
				}
				local20 = anIntArrayArrayArray10[arg0][arg3][arg4];
				while (local20 != 0) {
					local28 = (local20 & 0xFF) - 1;
					local20 >>>= 0x8;
					if (local28 == anIntArray313[local4]) {
						continue label43;
					}
				}
			}
			anIntArray313[local4] = -1;
			method2412(local4);
		}
	}

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "()V")
	public static void method2406() {
		aClass90Array1 = new Class90[255];
		anIntArray313 = new int[4];
		aBooleanArray68 = new boolean[4];
		anIntArray314 = new int[4];
		aBooleanArray69 = new boolean[4];
		anIntArrayArrayArray10 = new int[anInt2724][anInt2729][anInt2727];
	}

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "()V")
	public static void method2407() {
		aClass90Array1 = null;
		anIntArray313 = null;
		aBooleanArray68 = null;
		anIntArray314 = null;
		aBooleanArray69 = null;
		anIntArrayArrayArray10 = null;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!Static67.aBoolean95 || anInt2728 == arg3 && anInt2731 == arg4 && anInt2725 == arg5 && anInt2726 == arg6 && anInt2732 == arg7) {
			return;
		}
		@Pc(20) int local20;
		for (local20 = 0; local20 < 4; local20++) {
			aBooleanArray69[local20] = false;
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
								if (local59 == anIntArray314[local65]) {
									continue label96;
								}
							}
							for (local65 = 0; local65 < 4; local65++) {
								if (local59 == anIntArray313[local65]) {
									if (!aBooleanArray69[local65]) {
										aBooleanArray69[local65] = true;
										local20++;
										if (local20 == 4) {
											break label112;
										}
									}
									continue label96;
								}
							}
							anIntArray314[local33++] = local59;
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
				if (!aBooleanArray69[local40]) {
					anIntArray313[local40] = anIntArray314[local35];
					aBooleanArray69[local40] = true;
					method2399(local40, aClass90Array1[anIntArray314[local35]], arg0, arg1, arg2);
					break;
				}
			}
		}
		for (local35 = 0; local35 < 4; local35++) {
			if (!aBooleanArray69[local35]) {
				anIntArray313[local35] = -1;
				method2412(local35);
			}
		}
		anInt2728 = arg3;
		anInt2731 = arg4;
		anInt2725 = arg5;
		anInt2726 = arg6;
		anInt2732 = arg7;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)V")
	public static void method2409() {
		anInt2724 = 4;
		anInt2729 = 104;
		anInt2727 = 104;
		anIntArrayArrayArray10 = new int[anInt2724][anInt2729][anInt2727];
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II[[[Lclient!qo;)V")
	public static void method2410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub25[][][] arg2) {
		if (!Static67.aBoolean95) {
			return;
		}
		@Pc(4) GL local4 = Static283.aGL1;
		Static53.method5036(0, 0);
		Static283.method4664(0);
		Static283.method4655();
		Static283.method4636(Static283.anInt5686);
		local4.glDepthMask(false);
		Static283.method4651(false);
		local4.glBlendFunc(774, 1);
		local4.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
		local4.glTexEnvi(8960, 34176, 34166);
		local4.glTexEnvi(8960, 34192, 770);
		label71: for (@Pc(56) int local56 = 0; local56 < anInt2730; local56++) {
			@Pc(63) Class90 local63 = aClass90Array1[local56];
			@Pc(66) int local66 = local63.anInt2638;
			if (local63.aBoolean195) {
				local66--;
			}
			if (local63.aClass142_1 != null) {
				@Pc(76) int local76 = 0;
				@Pc(84) int local84 = (local63.anInt2639 >> 7) - local63.anInt2633;
				@Pc(92) int local92 = (local63.anInt2639 >> 7) + local63.anInt2633;
				if (local92 >= Static17.anInt338) {
					local92 = Static17.anInt338 - 1;
				}
				if (local84 < Static198.anInt3862) {
					local76 = Static198.anInt3862 - local84;
					local84 = Static198.anInt3862;
				}
				for (@Pc(112) int local112 = local84; local112 <= local92; local112++) {
					@Pc(121) short local121 = local63.aShortArray69[local76++];
					@Pc(133) int local133 = (local63.anInt2630 >> 7) + (local121 >> 8) - local63.anInt2633;
					@Pc(141) int local141 = local133 + (local121 & 0xFF) - 1;
					if (local133 < Static183.anInt3631) {
						local133 = Static183.anInt3631;
					}
					if (local141 >= Static11.anInt5176) {
						local141 = Static11.anInt5176 - 1;
					}
					for (@Pc(155) int local155 = local133; local155 <= local141; local155++) {
						@Pc(160) Class3_Sub25 local160 = null;
						if (local66 >= 0) {
							local160 = arg2[local66][local155][local112];
						}
						if (local66 < 0 || local160 != null && local160.aBoolean317) {
							Static283.method4634(201.5F - (float) local63.anInt2638 * 50.0F - 1.5F);
							local4.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, local63.aFloat42 }, 0);
							local63.aClass142_1.method3609();
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
		local4.glFogfv(2918, Static226.aFloatArray16, 0);
		local4.glEnableClientState(32888);
		Static283.method4662();
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)V")
	public static void method2411(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(1) int local1 = 0; local1 < anInt2730; local1++) {
			aClass90Array1[local1].method2336(arg0, arg1);
		}
		anInt2728 = -1;
		anInt2731 = -1;
		anInt2725 = -1;
		anInt2726 = -1;
		anInt2732 = -1;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	private static void method2412(@OriginalArg(0) int arg0) {
		if (aBooleanArray68[arg0]) {
			aBooleanArray68[arg0] = false;
			@Pc(14) int local14 = arg0 + 16384 + 4;
			@Pc(16) GL local16 = Static283.aGL1;
			local16.glDisable(local14);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIII)V")
	public static void method2413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!Static67.aBoolean95 || anInt2728 == arg3 && anInt2731 == arg4 && anInt2725 == arg5 && anInt2726 == arg4 && anInt2732 == arg5) {
			return;
		}
		@Pc(20) int local20;
		for (local20 = 0; local20 < 4; local20++) {
			aBooleanArray69[local20] = false;
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
					if (local47 == anIntArray313[local53]) {
						aBooleanArray69[local53] = true;
						continue label72;
					}
				}
				anIntArray314[local20++] = local47;
			}
			for (local47 = 0; local47 < local20; local47++) {
				for (local53 = 0; local53 < 4; local53++) {
					if (!aBooleanArray69[local53]) {
						anIntArray313[local53] = anIntArray314[local47];
						aBooleanArray69[local53] = true;
						method2399(local53, aClass90Array1[anIntArray314[local47]], arg0, arg1, arg2);
						break;
					}
				}
			}
			for (local47 = 0; local47 < 4; local47++) {
				if (!aBooleanArray69[local47]) {
					anIntArray313[local47] = -1;
					method2412(local47);
				}
			}
			anInt2728 = arg3;
			anInt2731 = arg4;
			anInt2725 = arg5;
			anInt2726 = arg4;
			anInt2732 = arg5;
			return;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIII)V")
	public static void method2414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!Static67.aBoolean95) {
			return;
		}
		if (arg0 == 1 && arg5 > 0) {
			method2413(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
		} else if (arg0 == 4 && arg5 < anInt2729 - 1) {
			method2413(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
		} else if (arg0 == 8 && arg6 > 0) {
			method2413(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
		} else if (arg0 == 2 && arg6 < anInt2727 - 1) {
			method2413(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
		} else if (arg0 == 16 && arg5 > 0 && arg6 < anInt2727 - 1) {
			method2413(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
		} else if (arg0 == 32 && arg5 < anInt2729 - 1 && arg6 < anInt2727 - 1) {
			method2413(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
		} else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
			method2413(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
		} else if (arg0 == 64 && arg5 < anInt2729 - 1 && arg6 > 0) {
			method2413(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
		}
	}
}
