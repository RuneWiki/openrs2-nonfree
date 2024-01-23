import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!va", name = "a", descriptor = "[I")
	private static int[] anIntArray502;

	@OriginalMember(owner = "client!va", name = "b", descriptor = "I")
	private static int anInt5541;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "[Lclient!tm;")
	public static Class170[] aClass170Array1;

	@OriginalMember(owner = "client!va", name = "e", descriptor = "[Z")
	private static boolean[] aBooleanArray61;

	@OriginalMember(owner = "client!va", name = "f", descriptor = "I")
	private static int anInt5543;

	@OriginalMember(owner = "client!va", name = "g", descriptor = "[[[I")
	private static int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!va", name = "h", descriptor = "I")
	private static int anInt5544;

	@OriginalMember(owner = "client!va", name = "j", descriptor = "I")
	private static int anInt5545;

	@OriginalMember(owner = "client!va", name = "k", descriptor = "I")
	private static int anInt5546;

	@OriginalMember(owner = "client!va", name = "l", descriptor = "I")
	private static int anInt5547;

	@OriginalMember(owner = "client!va", name = "m", descriptor = "I")
	private static int anInt5548;

	@OriginalMember(owner = "client!va", name = "n", descriptor = "[Z")
	private static boolean[] aBooleanArray62;

	@OriginalMember(owner = "client!va", name = "o", descriptor = "I")
	private static int anInt5549;

	@OriginalMember(owner = "client!va", name = "p", descriptor = "[I")
	private static int[] anIntArray503;

	@OriginalMember(owner = "client!va", name = "d", descriptor = "I")
	public static int anInt5542 = 0;

	@OriginalMember(owner = "client!va", name = "i", descriptor = "[F")
	private static float[] aFloatArray31 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIII)V")
	public static void method4350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!Static302.aBoolean419) {
			return;
		}
		if (arg0 == 1 && arg5 > 0) {
			method4363(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
		} else if (arg0 == 4 && arg5 < anInt5543 - 1) {
			method4363(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
		} else if (arg0 == 8 && arg6 > 0) {
			method4363(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
		} else if (arg0 == 2 && arg6 < anInt5546 - 1) {
			method4363(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
		} else if (arg0 == 16 && arg5 > 0 && arg6 < anInt5546 - 1) {
			method4363(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
		} else if (arg0 == 32 && arg5 < anInt5543 - 1 && arg6 < anInt5546 - 1) {
			method4363(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
		} else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
			method4363(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
		} else if (arg0 == 64 && arg5 < anInt5543 - 1 && arg6 > 0) {
			method4363(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "()V")
	public static void method4351() {
		aClass170Array1 = new Class170[255];
		anIntArray503 = new int[4];
		aBooleanArray61 = new boolean[4];
		anIntArray502 = new int[4];
		aBooleanArray62 = new boolean[4];
		anIntArrayArrayArray17 = new int[anInt5547][anInt5543][anInt5546];
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!tm;)V")
	public static void method4352(@OriginalArg(0) Class170 arg0) {
		if (anInt5542 >= 255) {
			System.out.println("Number of lights added exceeds maximum!");
		} else {
			aClass170Array1[anInt5542++] = arg0;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(III)V")
	public static void method4353() {
		anInt5547 = 4;
		anInt5543 = 104;
		anInt5546 = 104;
		anIntArrayArrayArray17 = new int[anInt5547][anInt5543][anInt5546];
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!tm;III)V")
	private static void method4354(@OriginalArg(0) int arg0, @OriginalArg(1) Class170 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = arg0 + 16384 + 4;
		@Pc(7) GL local7 = Static291.aGL1;
		if (!aBooleanArray61[arg0]) {
			local7.glEnable(local5);
			aBooleanArray61[arg0] = true;
		}
		local7.glLightf(local5, 4617, arg1.aFloat51);
		local7.glLightfv(local5, 4609, arg1.aFloatArray29, 0);
		aFloatArray31[0] = arg1.anInt5278 - arg2;
		aFloatArray31[1] = arg1.anInt5279 - arg3;
		aFloatArray31[2] = arg1.anInt5266 - arg4;
		local7.glLightfv(local5, 4611, aFloatArray31, 0);
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "()V")
	public static void method4355() {
		aClass170Array1 = null;
		anIntArray503 = null;
		aBooleanArray61 = null;
		anIntArray502 = null;
		aBooleanArray62 = null;
		anIntArrayArrayArray17 = null;
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "()V")
	public static void method4356() {
		anInt5542 = 0;
		for (@Pc(3) int local3 = 0; local3 < anInt5547; local3++) {
			for (@Pc(8) int local8 = 0; local8 < anInt5543; local8++) {
				for (@Pc(13) int local13 = 0; local13 < anInt5546; local13++) {
					anIntArrayArrayArray17[local3][local8][local13] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II[[[Lclient!mc;)V")
	public static void method4357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub17[][][] arg2) {
		if (!Static302.aBoolean419) {
			return;
		}
		@Pc(4) GL local4 = Static291.aGL1;
		Static207.method3280(0, 0);
		Static291.method4296(0);
		Static291.method4297();
		Static291.method4310(Static291.anInt5506);
		local4.glDepthMask(false);
		Static291.method4331(false);
		local4.glBlendFunc(774, 1);
		local4.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
		local4.glTexEnvi(8960, 34176, 34166);
		local4.glTexEnvi(8960, 34192, 770);
		label71: for (@Pc(56) int local56 = 0; local56 < anInt5542; local56++) {
			@Pc(63) Class170 local63 = aClass170Array1[local56];
			@Pc(66) int local66 = local63.anInt5272;
			if (local63.aBoolean377) {
				local66--;
			}
			if (local63.aClass100_1 != null) {
				@Pc(76) int local76 = 0;
				@Pc(84) int local84 = (local63.anInt5266 >> 7) - local63.anInt5280;
				@Pc(92) int local92 = (local63.anInt5266 >> 7) + local63.anInt5280;
				if (local92 >= Static315.anInt5923) {
					local92 = Static315.anInt5923 - 1;
				}
				if (local84 < Static137.anInt2713) {
					local76 = Static137.anInt2713 - local84;
					local84 = Static137.anInt2713;
				}
				for (@Pc(112) int local112 = local84; local112 <= local92; local112++) {
					@Pc(121) short local121 = local63.aShortArray90[local76++];
					@Pc(133) int local133 = (local63.anInt5278 >> 7) + (local121 >> 8) - local63.anInt5280;
					@Pc(141) int local141 = local133 + (local121 & 0xFF) - 1;
					if (local133 < Static233.anInt4690) {
						local133 = Static233.anInt4690;
					}
					if (local141 >= Static10.anInt187) {
						local141 = Static10.anInt187 - 1;
					}
					for (@Pc(155) int local155 = local133; local155 <= local141; local155++) {
						@Pc(160) Class1_Sub17 local160 = null;
						if (local66 >= 0) {
							local160 = arg2[local66][local155][local112];
						}
						if (local66 < 0 || local160 != null && local160.aBoolean239) {
							Static291.method4299(201.5F - (float) local63.anInt5272 * 50.0F - 1.5F);
							local4.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, local63.aFloat50 }, 0);
							local63.aClass100_1.method2240();
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
		local4.glFogfv(2918, Static96.aFloatArray15, 0);
		local4.glEnableClientState(32888);
		Static291.method4293();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
	private static void method4358(@OriginalArg(0) int arg0) {
		if (aBooleanArray61[arg0]) {
			aBooleanArray61[arg0] = false;
			@Pc(14) int local14 = arg0 + 16384 + 4;
			@Pc(16) GL local16 = Static291.aGL1;
			local16.glDisable(local14);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIII)V")
	public static void method4359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!Static302.aBoolean419) {
			return;
		}
		label43: for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (anIntArray503[local4] != -1) {
				@Pc(20) int local20 = anIntArrayArrayArray17[arg0][arg1][arg2];
				@Pc(28) int local28;
				while (local20 != 0) {
					local28 = (local20 & 0xFF) - 1;
					local20 >>>= 0x8;
					if (local28 == anIntArray503[local4]) {
						continue label43;
					}
				}
				local20 = anIntArrayArrayArray17[arg0][arg3][arg4];
				while (local20 != 0) {
					local28 = (local20 & 0xFF) - 1;
					local20 >>>= 0x8;
					if (local28 == anIntArray503[local4]) {
						continue label43;
					}
				}
			}
			anIntArray503[local4] = -1;
			method4358(local4);
		}
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "()V")
	public static void method4360() {
		@Pc(1) GL local1 = Static291.aGL1;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 4; local3++) {
			@Pc(10) int local10 = local3 + 16388;
			local1.glLightfv(local10, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local1.glLightf(local10, 4616, 0.0F);
			local1.glLightf(local10, 4615, 0.0F);
		}
		for (local3 = 0; local3 < 4; local3++) {
			anIntArray503[local3] = -1;
			method4358(local3);
		}
	}

	@OriginalMember(owner = "client!va", name = "f", descriptor = "()V")
	public static void method4362() {
		for (@Pc(1) int local1 = 0; local1 < anInt5542; local1++) {
			@Pc(8) Class170 local8 = aClass170Array1[local1];
			@Pc(11) int local11 = local8.anInt5272;
			if (local8.aBoolean378) {
				local11 = 0;
			}
			@Pc(19) int local19 = local8.anInt5272;
			if (local8.aBoolean376) {
				local19 = 3;
			}
			for (@Pc(26) int local26 = local11; local26 <= local19; local26++) {
				@Pc(31) int local31 = 0;
				@Pc(39) int local39 = (local8.anInt5266 >> 7) - local8.anInt5280;
				if (local39 < 0) {
					local31 = -local39;
					local39 = 0;
				}
				@Pc(55) int local55 = (local8.anInt5266 >> 7) + local8.anInt5280;
				if (local55 > anInt5546 - 1) {
					local55 = anInt5546 - 1;
				}
				for (@Pc(66) int local66 = local39; local66 <= local55; local66++) {
					@Pc(75) short local75 = local8.aShortArray90[local31++];
					@Pc(87) int local87 = (local8.anInt5278 >> 7) + (local75 >> 8) - local8.anInt5280;
					@Pc(95) int local95 = local87 + (local75 & 0xFF) - 1;
					if (local87 < 0) {
						local87 = 0;
					}
					if (local95 > anInt5543 - 1) {
						local95 = anInt5543 - 1;
					}
					for (@Pc(110) int local110 = local87; local110 <= local95; local110++) {
						@Pc(121) int local121 = anIntArrayArrayArray17[local26][local110][local66];
						if ((local121 & 0xFF) == 0) {
							anIntArrayArrayArray17[local26][local110][local66] = local121 | local1 + 1;
						} else if ((local121 & 0xFF00) == 0) {
							anIntArrayArrayArray17[local26][local110][local66] = local121 | local1 + 1 << 8;
						} else if ((local121 & 0xFF0000) == 0) {
							anIntArrayArrayArray17[local26][local110][local66] = local121 | local1 + 1 << 16;
						} else if ((local121 & 0xFF000000) == 0) {
							anIntArrayArrayArray17[local26][local110][local66] = local121 | local1 + 1 << 24;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIII)V")
	public static void method4363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!Static302.aBoolean419 || anInt5548 == arg3 && anInt5549 == arg4 && anInt5541 == arg5 && anInt5545 == arg4 && anInt5544 == arg5) {
			return;
		}
		@Pc(20) int local20;
		for (local20 = 0; local20 < 4; local20++) {
			aBooleanArray62[local20] = false;
		}
		local20 = 0;
		@Pc(39) int local39 = anIntArrayArrayArray17[arg3][arg4][arg5];
		while (true) {
			@Pc(47) int local47;
			@Pc(53) int local53;
			label72: while (local39 != 0) {
				local47 = (local39 & 0xFF) - 1;
				local39 >>>= 0x8;
				for (local53 = 0; local53 < 4; local53++) {
					if (local47 == anIntArray503[local53]) {
						aBooleanArray62[local53] = true;
						continue label72;
					}
				}
				anIntArray502[local20++] = local47;
			}
			for (local47 = 0; local47 < local20; local47++) {
				for (local53 = 0; local53 < 4; local53++) {
					if (!aBooleanArray62[local53]) {
						anIntArray503[local53] = anIntArray502[local47];
						aBooleanArray62[local53] = true;
						method4354(local53, aClass170Array1[anIntArray502[local47]], arg0, arg1, arg2);
						break;
					}
				}
			}
			for (local47 = 0; local47 < 4; local47++) {
				if (!aBooleanArray62[local47]) {
					anIntArray503[local47] = -1;
					method4358(local47);
				}
			}
			anInt5548 = arg3;
			anInt5549 = arg4;
			anInt5541 = arg5;
			anInt5545 = arg4;
			anInt5544 = arg5;
			return;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IZ)V")
	public static void method4364(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(1) int local1 = 0; local1 < anInt5542; local1++) {
			aClass170Array1[local1].method4109(arg1, arg0);
		}
		anInt5548 = -1;
		anInt5549 = -1;
		anInt5541 = -1;
		anInt5545 = -1;
		anInt5544 = -1;
	}

	@OriginalMember(owner = "client!va", name = "g", descriptor = "()V")
	public static void method4365() {
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			anIntArray503[local1] = -1;
			method4358(local1);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!Static302.aBoolean419 || anInt5548 == arg3 && anInt5549 == arg4 && anInt5541 == arg5 && anInt5545 == arg6 && anInt5544 == arg7) {
			return;
		}
		@Pc(20) int local20;
		for (local20 = 0; local20 < 4; local20++) {
			aBooleanArray62[local20] = false;
		}
		local20 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35;
		@Pc(40) int local40;
		label112: for (local35 = arg4; local35 <= arg6; local35++) {
			label110: for (local40 = arg5; local40 <= arg7; local40++) {
				@Pc(51) int local51 = anIntArrayArrayArray17[arg3][local35][local40];
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
								if (local59 == anIntArray502[local65]) {
									continue label96;
								}
							}
							for (local65 = 0; local65 < 4; local65++) {
								if (local59 == anIntArray503[local65]) {
									if (!aBooleanArray62[local65]) {
										aBooleanArray62[local65] = true;
										local20++;
										if (local20 == 4) {
											break label112;
										}
									}
									continue label96;
								}
							}
							anIntArray502[local33++] = local59;
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
				if (!aBooleanArray62[local40]) {
					anIntArray503[local40] = anIntArray502[local35];
					aBooleanArray62[local40] = true;
					method4354(local40, aClass170Array1[anIntArray502[local35]], arg0, arg1, arg2);
					break;
				}
			}
		}
		for (local35 = 0; local35 < 4; local35++) {
			if (!aBooleanArray62[local35]) {
				anIntArray503[local35] = -1;
				method4358(local35);
			}
		}
		anInt5548 = arg3;
		anInt5549 = arg4;
		anInt5541 = arg5;
		anInt5545 = arg6;
		anInt5544 = arg7;
	}
}
