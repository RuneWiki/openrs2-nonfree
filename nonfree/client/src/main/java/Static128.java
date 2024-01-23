import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
	private static int anInt2665;

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
	private static int anInt2666;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "[[[I")
	private static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
	private static int anInt2668;

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
	private static int anInt2669;

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "[Z")
	private static boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "[Lclient!k;")
	public static Class90[] aClass90Array1;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "[Z")
	private static boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
	private static int anInt2670;

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
	private static int anInt2671;

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
	private static int anInt2672;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "[I")
	private static int[] anIntArray174;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "[I")
	private static int[] anIntArray175;

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
	private static int anInt2673;

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
	public static int anInt2667 = 0;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "[F")
	private static float[] aFloatArray18 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[[[Lclient!vb;)V")
	public static void method2265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub31[][][] arg2) {
		if (!Static56.aBoolean96) {
			return;
		}
		@Pc(4) GL local4 = Static60.aGL1;
		Static4.method119(0, 0);
		Static60.method1139(0);
		Static60.method1172();
		Static60.method1157(Static60.anInt1346);
		local4.glDepthMask(false);
		Static60.method1164(false);
		local4.glBlendFunc(774, 1);
		local4.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
		local4.glTexEnvi(8960, 34176, 34166);
		local4.glTexEnvi(8960, 34192, 770);
		label71: for (@Pc(56) int local56 = 0; local56 < anInt2667; local56++) {
			@Pc(63) Class90 local63 = aClass90Array1[local56];
			@Pc(66) int local66 = local63.anInt2654;
			if (local63.aBoolean212) {
				local66--;
			}
			if (local63.aClass171_1 != null) {
				@Pc(76) int local76 = 0;
				@Pc(84) int local84 = (local63.anInt2649 >> 7) - local63.anInt2652;
				@Pc(92) int local92 = (local63.anInt2649 >> 7) + local63.anInt2652;
				if (local92 >= Static50.anInt1165) {
					local92 = Static50.anInt1165 - 1;
				}
				if (local84 < Static26.anInt549) {
					local76 = Static26.anInt549 - local84;
					local84 = Static26.anInt549;
				}
				for (@Pc(112) int local112 = local84; local112 <= local92; local112++) {
					@Pc(121) short local121 = local63.aShortArray39[local76++];
					@Pc(133) int local133 = (local63.anInt2635 >> 7) + (local121 >> 8) - local63.anInt2652;
					@Pc(141) int local141 = local133 + (local121 & 0xFF) - 1;
					if (local133 < Static281.anInt5831) {
						local133 = Static281.anInt5831;
					}
					if (local141 >= Static222.anInt4612) {
						local141 = Static222.anInt4612 - 1;
					}
					for (@Pc(155) int local155 = local133; local155 <= local141; local155++) {
						@Pc(160) Class2_Sub31 local160 = null;
						if (local66 >= 0) {
							local160 = arg2[local66][local155][local112];
						}
						if (local66 < 0 || local160 != null && local160.aBoolean456) {
							Static60.method1142(201.5F - (float) local63.anInt2654 * 50.0F - 1.5F);
							local4.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, local63.aFloat29 }, 0);
							local63.aClass171_1.method4434();
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
		local4.glFogfv(2918, Static117.aFloatArray14, 0);
		local4.glEnableClientState(32888);
		Static60.method1170();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!k;III)V")
	private static void method2267(@OriginalArg(0) int arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = arg0 + 16384 + 4;
		@Pc(7) GL local7 = Static60.aGL1;
		if (!aBooleanArray14[arg0]) {
			local7.glEnable(local5);
			aBooleanArray14[arg0] = true;
		}
		local7.glLightf(local5, 4617, arg1.aFloat30);
		local7.glLightfv(local5, 4609, arg1.aFloatArray17, 0);
		aFloatArray18[0] = arg1.anInt2635 - arg2;
		aFloatArray18[1] = arg1.anInt2644 - arg3;
		aFloatArray18[2] = arg1.anInt2649 - arg4;
		local7.glLightfv(local5, 4611, aFloatArray18, 0);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	private static void method2268(@OriginalArg(0) int arg0) {
		if (aBooleanArray14[arg0]) {
			aBooleanArray14[arg0] = false;
			@Pc(14) int local14 = arg0 + 16384 + 4;
			@Pc(16) GL local16 = Static60.aGL1;
			local16.glDisable(local14);
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "()V")
	public static void method2269() {
		@Pc(1) GL local1 = Static60.aGL1;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 4; local3++) {
			@Pc(10) int local10 = local3 + 16388;
			local1.glLightfv(local10, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local1.glLightf(local10, 4616, 0.0F);
			local1.glLightf(local10, 4615, 0.0F);
		}
		for (local3 = 0; local3 < 4; local3++) {
			anIntArray175[local3] = -1;
			method2268(local3);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)V")
	public static void method2270(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(1) int local1 = 0; local1 < anInt2667; local1++) {
			aClass90Array1[local1].method2250(arg0, arg1);
		}
		anInt2671 = -1;
		anInt2670 = -1;
		anInt2665 = -1;
		anInt2668 = -1;
		anInt2669 = -1;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "()V")
	public static void method2271() {
		aClass90Array1 = new Class90[255];
		anIntArray175 = new int[4];
		aBooleanArray14 = new boolean[4];
		anIntArray174 = new int[4];
		aBooleanArray15 = new boolean[4];
		anIntArrayArrayArray3 = new int[anInt2666][anInt2672][anInt2673];
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "()V")
	public static void method2272() {
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			anIntArray175[local1] = -1;
			method2268(local1);
		}
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "()V")
	public static void method2273() {
		anInt2667 = 0;
		for (@Pc(3) int local3 = 0; local3 < anInt2666; local3++) {
			for (@Pc(8) int local8 = 0; local8 < anInt2672; local8++) {
				for (@Pc(13) int local13 = 0; local13 < anInt2673; local13++) {
					anIntArrayArrayArray3[local3][local8][local13] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!k;)V")
	public static void method2274(@OriginalArg(0) Class90 arg0) {
		if (anInt2667 >= 255) {
			System.out.println("Number of lights added exceeds maximum!");
		} else {
			aClass90Array1[anInt2667++] = arg0;
		}
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "()V")
	public static void method2275() {
		aClass90Array1 = null;
		anIntArray175 = null;
		aBooleanArray14 = null;
		anIntArray174 = null;
		aBooleanArray15 = null;
		anIntArrayArrayArray3 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIII)V")
	public static void method2276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!Static56.aBoolean96 || anInt2671 == arg3 && anInt2670 == arg4 && anInt2665 == arg5 && anInt2668 == arg4 && anInt2669 == arg5) {
			return;
		}
		@Pc(20) int local20;
		for (local20 = 0; local20 < 4; local20++) {
			aBooleanArray15[local20] = false;
		}
		local20 = 0;
		@Pc(39) int local39 = anIntArrayArrayArray3[arg3][arg4][arg5];
		while (true) {
			@Pc(47) int local47;
			@Pc(53) int local53;
			label72: while (local39 != 0) {
				local47 = (local39 & 0xFF) - 1;
				local39 >>>= 0x8;
				for (local53 = 0; local53 < 4; local53++) {
					if (local47 == anIntArray175[local53]) {
						aBooleanArray15[local53] = true;
						continue label72;
					}
				}
				anIntArray174[local20++] = local47;
			}
			for (local47 = 0; local47 < local20; local47++) {
				for (local53 = 0; local53 < 4; local53++) {
					if (!aBooleanArray15[local53]) {
						anIntArray175[local53] = anIntArray174[local47];
						aBooleanArray15[local53] = true;
						method2267(local53, aClass90Array1[anIntArray174[local47]], arg0, arg1, arg2);
						break;
					}
				}
			}
			for (local47 = 0; local47 < 4; local47++) {
				if (!aBooleanArray15[local47]) {
					anIntArray175[local47] = -1;
					method2268(local47);
				}
			}
			anInt2671 = arg3;
			anInt2670 = arg4;
			anInt2665 = arg5;
			anInt2668 = arg4;
			anInt2669 = arg5;
			return;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIII)V")
	public static void method2277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!Static56.aBoolean96) {
			return;
		}
		label43: for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (anIntArray175[local4] != -1) {
				@Pc(20) int local20 = anIntArrayArrayArray3[arg0][arg1][arg2];
				@Pc(28) int local28;
				while (local20 != 0) {
					local28 = (local20 & 0xFF) - 1;
					local20 >>>= 0x8;
					if (local28 == anIntArray175[local4]) {
						continue label43;
					}
				}
				local20 = anIntArrayArrayArray3[arg0][arg3][arg4];
				while (local20 != 0) {
					local28 = (local20 & 0xFF) - 1;
					local20 >>>= 0x8;
					if (local28 == anIntArray175[local4]) {
						continue label43;
					}
				}
			}
			anIntArray175[local4] = -1;
			method2268(local4);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V")
	public static void method2278() {
		anInt2666 = 4;
		anInt2672 = 104;
		anInt2673 = 104;
		anIntArrayArrayArray3 = new int[anInt2666][anInt2672][anInt2673];
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!Static56.aBoolean96 || anInt2671 == arg3 && anInt2670 == arg4 && anInt2665 == arg5 && anInt2668 == arg6 && anInt2669 == arg7) {
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
				@Pc(51) int local51 = anIntArrayArrayArray3[arg3][local35][local40];
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
								if (local59 == anIntArray174[local65]) {
									continue label96;
								}
							}
							for (local65 = 0; local65 < 4; local65++) {
								if (local59 == anIntArray175[local65]) {
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
							anIntArray174[local33++] = local59;
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
					anIntArray175[local40] = anIntArray174[local35];
					aBooleanArray15[local40] = true;
					method2267(local40, aClass90Array1[anIntArray174[local35]], arg0, arg1, arg2);
					break;
				}
			}
		}
		for (local35 = 0; local35 < 4; local35++) {
			if (!aBooleanArray15[local35]) {
				anIntArray175[local35] = -1;
				method2268(local35);
			}
		}
		anInt2671 = arg3;
		anInt2670 = arg4;
		anInt2665 = arg5;
		anInt2668 = arg6;
		anInt2669 = arg7;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIII)V")
	public static void method2280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!Static56.aBoolean96) {
			return;
		}
		if (arg0 == 1 && arg5 > 0) {
			method2276(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
		} else if (arg0 == 4 && arg5 < anInt2672 - 1) {
			method2276(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
		} else if (arg0 == 8 && arg6 > 0) {
			method2276(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
		} else if (arg0 == 2 && arg6 < anInt2673 - 1) {
			method2276(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
		} else if (arg0 == 16 && arg5 > 0 && arg6 < anInt2673 - 1) {
			method2276(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
		} else if (arg0 == 32 && arg5 < anInt2672 - 1 && arg6 < anInt2673 - 1) {
			method2276(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
		} else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
			method2276(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
		} else if (arg0 == 64 && arg5 < anInt2672 - 1 && arg6 > 0) {
			method2276(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
		}
	}

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "()V")
	public static void method2281() {
		for (@Pc(1) int local1 = 0; local1 < anInt2667; local1++) {
			@Pc(8) Class90 local8 = aClass90Array1[local1];
			@Pc(11) int local11 = local8.anInt2654;
			if (local8.aBoolean214) {
				local11 = 0;
			}
			@Pc(19) int local19 = local8.anInt2654;
			if (local8.aBoolean213) {
				local19 = 3;
			}
			for (@Pc(26) int local26 = local11; local26 <= local19; local26++) {
				@Pc(31) int local31 = 0;
				@Pc(39) int local39 = (local8.anInt2649 >> 7) - local8.anInt2652;
				if (local39 < 0) {
					local31 = -local39;
					local39 = 0;
				}
				@Pc(55) int local55 = (local8.anInt2649 >> 7) + local8.anInt2652;
				if (local55 > anInt2673 - 1) {
					local55 = anInt2673 - 1;
				}
				for (@Pc(66) int local66 = local39; local66 <= local55; local66++) {
					@Pc(75) short local75 = local8.aShortArray39[local31++];
					@Pc(87) int local87 = (local8.anInt2635 >> 7) + (local75 >> 8) - local8.anInt2652;
					@Pc(95) int local95 = local87 + (local75 & 0xFF) - 1;
					if (local87 < 0) {
						local87 = 0;
					}
					if (local95 > anInt2672 - 1) {
						local95 = anInt2672 - 1;
					}
					for (@Pc(110) int local110 = local87; local110 <= local95; local110++) {
						@Pc(121) int local121 = anIntArrayArrayArray3[local26][local110][local66];
						if ((local121 & 0xFF) == 0) {
							anIntArrayArrayArray3[local26][local110][local66] = local121 | local1 + 1;
						} else if ((local121 & 0xFF00) == 0) {
							anIntArrayArrayArray3[local26][local110][local66] = local121 | local1 + 1 << 8;
						} else if ((local121 & 0xFF0000) == 0) {
							anIntArrayArrayArray3[local26][local110][local66] = local121 | local1 + 1 << 16;
						} else if ((local121 & 0xFF000000) == 0) {
							anIntArrayArrayArray3[local26][local110][local66] = local121 | local1 + 1 << 24;
						}
					}
				}
			}
		}
	}
}
