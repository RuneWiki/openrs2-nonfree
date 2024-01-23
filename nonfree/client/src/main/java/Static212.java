import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
	private static int anInt4341;

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "[I")
	private static int[] anIntArray435;

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "[Z")
	private static boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "[Z")
	private static boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
	private static int anInt4343;

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
	private static int anInt4344;

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "[[[I")
	private static int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
	private static int anInt4345;

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
	private static int anInt4346;

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
	private static int anInt4347;

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
	private static int anInt4348;

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "[I")
	private static int[] anIntArray436;

	@OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
	private static int anInt4349;

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "[Lclient!sd;")
	public static Class156[] aClass156Array1;

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
	public static int anInt4342 = 0;

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "[F")
	private static float[] aFloatArray14 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "()V")
	public static void method3531() {
		aClass156Array1 = null;
		anIntArray436 = null;
		aBooleanArray18 = null;
		anIntArray435 = null;
		aBooleanArray17 = null;
		anIntArrayArrayArray13 = null;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIII)V")
	public static void method3532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!Static265.aBoolean348) {
			return;
		}
		label43: for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (anIntArray436[local4] != -1) {
				@Pc(20) int local20 = anIntArrayArrayArray13[arg0][arg1][arg2];
				@Pc(28) int local28;
				while (local20 != 0) {
					local28 = (local20 & 0xFF) - 1;
					local20 >>>= 0x8;
					if (local28 == anIntArray436[local4]) {
						continue label43;
					}
				}
				local20 = anIntArrayArrayArray13[arg0][arg3][arg4];
				while (local20 != 0) {
					local28 = (local20 & 0xFF) - 1;
					local20 >>>= 0x8;
					if (local28 == anIntArray436[local4]) {
						continue label43;
					}
				}
			}
			anIntArray436[local4] = -1;
			method3534(local4);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
	private static void method3534(@OriginalArg(0) int arg0) {
		if (aBooleanArray18[arg0]) {
			aBooleanArray18[arg0] = false;
			@Pc(14) int local14 = arg0 + 16384 + 4;
			@Pc(16) GL local16 = Static116.aGL1;
			local16.glDisable(local14);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!sd;III)V")
	private static void method3535(@OriginalArg(0) int arg0, @OriginalArg(1) Class156 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = arg0 + 16384 + 4;
		@Pc(7) GL local7 = Static116.aGL1;
		if (!aBooleanArray18[arg0]) {
			local7.glEnable(local5);
			aBooleanArray18[arg0] = true;
		}
		local7.glLightf(local5, 4617, arg1.aFloat52);
		local7.glLightfv(local5, 4609, arg1.aFloatArray18, 0);
		aFloatArray14[0] = arg1.anInt4995 - arg2;
		aFloatArray14[1] = arg1.anInt4986 - arg3;
		aFloatArray14[2] = arg1.anInt4984 - arg4;
		local7.glLightfv(local5, 4611, aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "()V")
	public static void method3536() {
		aClass156Array1 = new Class156[255];
		anIntArray436 = new int[4];
		aBooleanArray18 = new boolean[4];
		anIntArray435 = new int[4];
		aBooleanArray17 = new boolean[4];
		anIntArrayArrayArray13 = new int[anInt4343][anInt4347][anInt4349];
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)V")
	public static void method3537() {
		anInt4343 = 4;
		anInt4347 = 104;
		anInt4349 = 104;
		anIntArrayArrayArray13 = new int[anInt4343][anInt4347][anInt4349];
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIII)V")
	public static void method3538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!Static265.aBoolean348 || anInt4341 == arg3 && anInt4344 == arg4 && anInt4345 == arg5 && anInt4348 == arg4 && anInt4346 == arg5) {
			return;
		}
		@Pc(20) int local20;
		for (local20 = 0; local20 < 4; local20++) {
			aBooleanArray17[local20] = false;
		}
		local20 = 0;
		@Pc(39) int local39 = anIntArrayArrayArray13[arg3][arg4][arg5];
		while (true) {
			@Pc(47) int local47;
			@Pc(53) int local53;
			label72: while (local39 != 0) {
				local47 = (local39 & 0xFF) - 1;
				local39 >>>= 0x8;
				for (local53 = 0; local53 < 4; local53++) {
					if (local47 == anIntArray436[local53]) {
						aBooleanArray17[local53] = true;
						continue label72;
					}
				}
				anIntArray435[local20++] = local47;
			}
			for (local47 = 0; local47 < local20; local47++) {
				for (local53 = 0; local53 < 4; local53++) {
					if (!aBooleanArray17[local53]) {
						anIntArray436[local53] = anIntArray435[local47];
						aBooleanArray17[local53] = true;
						method3535(local53, aClass156Array1[anIntArray435[local47]], arg0, arg1, arg2);
						break;
					}
				}
			}
			for (local47 = 0; local47 < 4; local47++) {
				if (!aBooleanArray17[local47]) {
					anIntArray436[local47] = -1;
					method3534(local47);
				}
			}
			anInt4341 = arg3;
			anInt4344 = arg4;
			anInt4345 = arg5;
			anInt4348 = arg4;
			anInt4346 = arg5;
			return;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIII)V")
	public static void method3539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!Static265.aBoolean348) {
			return;
		}
		if (arg0 == 1 && arg5 > 0) {
			method3538(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
		} else if (arg0 == 4 && arg5 < anInt4347 - 1) {
			method3538(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
		} else if (arg0 == 8 && arg6 > 0) {
			method3538(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
		} else if (arg0 == 2 && arg6 < anInt4349 - 1) {
			method3538(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
		} else if (arg0 == 16 && arg5 > 0 && arg6 < anInt4349 - 1) {
			method3538(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
		} else if (arg0 == 32 && arg5 < anInt4347 - 1 && arg6 < anInt4349 - 1) {
			method3538(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
		} else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
			method3538(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
		} else if (arg0 == 64 && arg5 < anInt4347 - 1 && arg6 > 0) {
			method3538(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
		}
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "()V")
	public static void method3540() {
		for (@Pc(1) int local1 = 0; local1 < anInt4342; local1++) {
			@Pc(8) Class156 local8 = aClass156Array1[local1];
			@Pc(11) int local11 = local8.anInt4993;
			if (local8.aBoolean328) {
				local11 = 0;
			}
			@Pc(19) int local19 = local8.anInt4993;
			if (local8.aBoolean329) {
				local19 = 3;
			}
			for (@Pc(26) int local26 = local11; local26 <= local19; local26++) {
				@Pc(31) int local31 = 0;
				@Pc(39) int local39 = (local8.anInt4984 >> 7) - local8.anInt4977;
				if (local39 < 0) {
					local31 = -local39;
					local39 = 0;
				}
				@Pc(55) int local55 = (local8.anInt4984 >> 7) + local8.anInt4977;
				if (local55 > anInt4349 - 1) {
					local55 = anInt4349 - 1;
				}
				for (@Pc(66) int local66 = local39; local66 <= local55; local66++) {
					@Pc(75) short local75 = local8.aShortArray68[local31++];
					@Pc(87) int local87 = (local8.anInt4995 >> 7) + (local75 >> 8) - local8.anInt4977;
					@Pc(95) int local95 = local87 + (local75 & 0xFF) - 1;
					if (local87 < 0) {
						local87 = 0;
					}
					if (local95 > anInt4347 - 1) {
						local95 = anInt4347 - 1;
					}
					for (@Pc(110) int local110 = local87; local110 <= local95; local110++) {
						@Pc(121) int local121 = anIntArrayArrayArray13[local26][local110][local66];
						if ((local121 & 0xFF) == 0) {
							anIntArrayArrayArray13[local26][local110][local66] = local121 | local1 + 1;
						} else if ((local121 & 0xFF00) == 0) {
							anIntArrayArrayArray13[local26][local110][local66] = local121 | local1 + 1 << 8;
						} else if ((local121 & 0xFF0000) == 0) {
							anIntArrayArrayArray13[local26][local110][local66] = local121 | local1 + 1 << 16;
						} else if ((local121 & 0xFF000000) == 0) {
							anIntArrayArrayArray13[local26][local110][local66] = local121 | local1 + 1 << 24;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZ)V")
	public static void method3541(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(1) int local1 = 0; local1 < anInt4342; local1++) {
			aClass156Array1[local1].method3987(arg1, arg0);
		}
		anInt4341 = -1;
		anInt4344 = -1;
		anInt4345 = -1;
		anInt4348 = -1;
		anInt4346 = -1;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!sd;)V")
	public static void method3542(@OriginalArg(0) Class156 arg0) {
		if (anInt4342 >= 255) {
			System.out.println("Number of lights added exceeds maximum!");
		} else {
			aClass156Array1[anInt4342++] = arg0;
		}
	}

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "()V")
	public static void method3543() {
		@Pc(1) GL local1 = Static116.aGL1;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 4; local3++) {
			@Pc(10) int local10 = local3 + 16388;
			local1.glLightfv(local10, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local1.glLightf(local10, 4616, 0.0F);
			local1.glLightf(local10, 4615, 0.0F);
		}
		for (local3 = 0; local3 < 4; local3++) {
			anIntArray436[local3] = -1;
			method3534(local3);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II[[[Lclient!ee;)V")
	public static void method3544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub13[][][] arg2) {
		if (!Static265.aBoolean348) {
			return;
		}
		@Pc(4) GL local4 = Static116.aGL1;
		Static118.method1991(0, 0);
		Static116.method1977(0);
		Static116.method1960();
		Static116.method1945(Static116.anInt2594);
		local4.glDepthMask(false);
		Static116.method1974(false);
		local4.glBlendFunc(774, 1);
		local4.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
		local4.glTexEnvi(8960, 34176, 34166);
		local4.glTexEnvi(8960, 34192, 770);
		label71: for (@Pc(56) int local56 = 0; local56 < anInt4342; local56++) {
			@Pc(63) Class156 local63 = aClass156Array1[local56];
			@Pc(66) int local66 = local63.anInt4993;
			if (local63.aBoolean330) {
				local66--;
			}
			if (local63.aClass183_1 != null) {
				@Pc(76) int local76 = 0;
				@Pc(84) int local84 = (local63.anInt4984 >> 7) - local63.anInt4977;
				@Pc(92) int local92 = (local63.anInt4984 >> 7) + local63.anInt4977;
				if (local92 >= Static84.anInt1964) {
					local92 = Static84.anInt1964 - 1;
				}
				if (local84 < Static281.anInt5559) {
					local76 = Static281.anInt5559 - local84;
					local84 = Static281.anInt5559;
				}
				for (@Pc(112) int local112 = local84; local112 <= local92; local112++) {
					@Pc(121) short local121 = local63.aShortArray68[local76++];
					@Pc(133) int local133 = (local63.anInt4995 >> 7) + (local121 >> 8) - local63.anInt4977;
					@Pc(141) int local141 = local133 + (local121 & 0xFF) - 1;
					if (local133 < Static82.anInt1918) {
						local133 = Static82.anInt1918;
					}
					if (local141 >= Static276.anInt5467) {
						local141 = Static276.anInt5467 - 1;
					}
					for (@Pc(155) int local155 = local133; local155 <= local141; local155++) {
						@Pc(160) Class2_Sub13 local160 = null;
						if (local66 >= 0) {
							local160 = arg2[local66][local155][local112];
						}
						if (local66 < 0 || local160 != null && local160.aBoolean101) {
							Static116.method1957(201.5F - (float) local63.anInt4993 * 50.0F - 1.5F);
							local4.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, local63.aFloat53 }, 0);
							local63.aClass183_1.method4499();
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
		local4.glFogfv(2918, Static235.aFloatArray17, 0);
		local4.glEnableClientState(32888);
		Static116.method1953();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!Static265.aBoolean348 || anInt4341 == arg3 && anInt4344 == arg4 && anInt4345 == arg5 && anInt4348 == arg6 && anInt4346 == arg7) {
			return;
		}
		@Pc(20) int local20;
		for (local20 = 0; local20 < 4; local20++) {
			aBooleanArray17[local20] = false;
		}
		local20 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35;
		@Pc(40) int local40;
		label112: for (local35 = arg4; local35 <= arg6; local35++) {
			label110: for (local40 = arg5; local40 <= arg7; local40++) {
				@Pc(51) int local51 = anIntArrayArrayArray13[arg3][local35][local40];
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
								if (local59 == anIntArray435[local65]) {
									continue label96;
								}
							}
							for (local65 = 0; local65 < 4; local65++) {
								if (local59 == anIntArray436[local65]) {
									if (!aBooleanArray17[local65]) {
										aBooleanArray17[local65] = true;
										local20++;
										if (local20 == 4) {
											break label112;
										}
									}
									continue label96;
								}
							}
							anIntArray435[local33++] = local59;
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
				if (!aBooleanArray17[local40]) {
					anIntArray436[local40] = anIntArray435[local35];
					aBooleanArray17[local40] = true;
					method3535(local40, aClass156Array1[anIntArray435[local35]], arg0, arg1, arg2);
					break;
				}
			}
		}
		for (local35 = 0; local35 < 4; local35++) {
			if (!aBooleanArray17[local35]) {
				anIntArray436[local35] = -1;
				method3534(local35);
			}
		}
		anInt4341 = arg3;
		anInt4344 = arg4;
		anInt4345 = arg5;
		anInt4348 = arg6;
		anInt4346 = arg7;
	}

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "()V")
	public static void method3546() {
		anInt4342 = 0;
		for (@Pc(3) int local3 = 0; local3 < anInt4343; local3++) {
			for (@Pc(8) int local8 = 0; local8 < anInt4347; local8++) {
				for (@Pc(13) int local13 = 0; local13 < anInt4349; local13++) {
					anIntArrayArrayArray13[local3][local8][local13] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "()V")
	public static void method3547() {
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			anIntArray436[local1] = -1;
			method3534(local1);
		}
	}
}
