import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
	private static int anInt2763;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
	private static int anInt2764;

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "[I")
	private static int[] anIntArray253;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
	private static int anInt2765;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
	private static int anInt2766;

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "[I")
	private static int[] anIntArray254;

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "[Z")
	private static boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
	private static int anInt2767;

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "[Z")
	private static boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
	private static int anInt2768;

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
	private static int anInt2769;

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "[[[I")
	private static int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "[Lclient!re;")
	public static Class144[] aClass144Array1;

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
	private static int anInt2771;

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "[F")
	private static float[] aFloatArray8 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
	public static int anInt2770 = 0;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIII)V")
	public static void method2131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!Static188.aBoolean295) {
			return;
		}
		label43: for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (anIntArray253[local4] != -1) {
				@Pc(20) int local20 = anIntArrayArrayArray8[arg0][arg1][arg2];
				@Pc(28) int local28;
				while (local20 != 0) {
					local28 = (local20 & 0xFF) - 1;
					local20 >>>= 0x8;
					if (local28 == anIntArray253[local4]) {
						continue label43;
					}
				}
				local20 = anIntArrayArrayArray8[arg0][arg3][arg4];
				while (local20 != 0) {
					local28 = (local20 & 0xFF) - 1;
					local20 >>>= 0x8;
					if (local28 == anIntArray253[local4]) {
						continue label43;
					}
				}
			}
			anIntArray253[local4] = -1;
			method2139(local4);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
	public static void method2132() {
		anInt2768 = 4;
		anInt2764 = 104;
		anInt2767 = 104;
		anIntArrayArrayArray8 = new int[anInt2768][anInt2764][anInt2767];
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "()V")
	public static void method2133() {
		anInt2770 = 0;
		for (@Pc(3) int local3 = 0; local3 < anInt2768; local3++) {
			for (@Pc(8) int local8 = 0; local8 < anInt2764; local8++) {
				for (@Pc(13) int local13 = 0; local13 < anInt2767; local13++) {
					anIntArrayArrayArray8[local3][local8][local13] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIII)V")
	public static void method2134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!Static188.aBoolean295 || anInt2769 == arg3 && anInt2771 == arg4 && anInt2766 == arg5 && anInt2763 == arg4 && anInt2765 == arg5) {
			return;
		}
		@Pc(20) int local20;
		for (local20 = 0; local20 < 4; local20++) {
			aBooleanArray26[local20] = false;
		}
		local20 = 0;
		@Pc(39) int local39 = anIntArrayArrayArray8[arg3][arg4][arg5];
		while (true) {
			@Pc(47) int local47;
			@Pc(53) int local53;
			label72: while (local39 != 0) {
				local47 = (local39 & 0xFF) - 1;
				local39 >>>= 0x8;
				for (local53 = 0; local53 < 4; local53++) {
					if (local47 == anIntArray253[local53]) {
						aBooleanArray26[local53] = true;
						continue label72;
					}
				}
				anIntArray254[local20++] = local47;
			}
			for (local47 = 0; local47 < local20; local47++) {
				for (local53 = 0; local53 < 4; local53++) {
					if (!aBooleanArray26[local53]) {
						anIntArray253[local53] = anIntArray254[local47];
						aBooleanArray26[local53] = true;
						method2138(local53, aClass144Array1[anIntArray254[local47]], arg0, arg1, arg2);
						break;
					}
				}
			}
			for (local47 = 0; local47 < 4; local47++) {
				if (!aBooleanArray26[local47]) {
					anIntArray253[local47] = -1;
					method2139(local47);
				}
			}
			anInt2769 = arg3;
			anInt2771 = arg4;
			anInt2766 = arg5;
			anInt2763 = arg4;
			anInt2765 = arg5;
			return;
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "()V")
	public static void method2135() {
		@Pc(1) GL local1 = Static277.aGL1;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 4; local3++) {
			@Pc(10) int local10 = local3 + 16388;
			local1.glLightfv(local10, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local1.glLightf(local10, 4616, 0.0F);
			local1.glLightf(local10, 4615, 0.0F);
		}
		for (local3 = 0; local3 < 4; local3++) {
			anIntArray253[local3] = -1;
			method2139(local3);
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "()V")
	public static void method2136() {
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			anIntArray253[local1] = -1;
			method2139(local1);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!re;III)V")
	private static void method2138(@OriginalArg(0) int arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = arg0 + 16384 + 4;
		@Pc(7) GL local7 = Static277.aGL1;
		if (!aBooleanArray27[arg0]) {
			local7.glEnable(local5);
			aBooleanArray27[arg0] = true;
		}
		local7.glLightf(local5, 4617, arg1.aFloat46);
		local7.glLightfv(local5, 4609, arg1.aFloatArray19, 0);
		aFloatArray8[0] = arg1.anInt4502 - arg2;
		aFloatArray8[1] = arg1.anInt4484 - arg3;
		aFloatArray8[2] = arg1.anInt4490 - arg4;
		local7.glLightfv(local5, 4611, aFloatArray8, 0);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	private static void method2139(@OriginalArg(0) int arg0) {
		if (aBooleanArray27[arg0]) {
			aBooleanArray27[arg0] = false;
			@Pc(14) int local14 = arg0 + 16384 + 4;
			@Pc(16) GL local16 = Static277.aGL1;
			local16.glDisable(local14);
		}
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "()V")
	public static void method2140() {
		for (@Pc(1) int local1 = 0; local1 < anInt2770; local1++) {
			@Pc(8) Class144 local8 = aClass144Array1[local1];
			@Pc(11) int local11 = local8.anInt4492;
			if (local8.aBoolean348) {
				local11 = 0;
			}
			@Pc(19) int local19 = local8.anInt4492;
			if (local8.aBoolean347) {
				local19 = 3;
			}
			for (@Pc(26) int local26 = local11; local26 <= local19; local26++) {
				@Pc(31) int local31 = 0;
				@Pc(39) int local39 = (local8.anInt4490 >> 7) - local8.anInt4503;
				if (local39 < 0) {
					local31 = -local39;
					local39 = 0;
				}
				@Pc(55) int local55 = (local8.anInt4490 >> 7) + local8.anInt4503;
				if (local55 > anInt2767 - 1) {
					local55 = anInt2767 - 1;
				}
				for (@Pc(66) int local66 = local39; local66 <= local55; local66++) {
					@Pc(75) short local75 = local8.aShortArray75[local31++];
					@Pc(87) int local87 = (local8.anInt4502 >> 7) + (local75 >> 8) - local8.anInt4503;
					@Pc(95) int local95 = local87 + (local75 & 0xFF) - 1;
					if (local87 < 0) {
						local87 = 0;
					}
					if (local95 > anInt2764 - 1) {
						local95 = anInt2764 - 1;
					}
					for (@Pc(110) int local110 = local87; local110 <= local95; local110++) {
						@Pc(121) int local121 = anIntArrayArrayArray8[local26][local110][local66];
						if ((local121 & 0xFF) == 0) {
							anIntArrayArrayArray8[local26][local110][local66] = local121 | local1 + 1;
						} else if ((local121 & 0xFF00) == 0) {
							anIntArrayArrayArray8[local26][local110][local66] = local121 | local1 + 1 << 8;
						} else if ((local121 & 0xFF0000) == 0) {
							anIntArrayArrayArray8[local26][local110][local66] = local121 | local1 + 1 << 16;
						} else if ((local121 & 0xFF000000) == 0) {
							anIntArrayArrayArray8[local26][local110][local66] = local121 | local1 + 1 << 24;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)V")
	public static void method2141(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(1) int local1 = 0; local1 < anInt2770; local1++) {
			aClass144Array1[local1].method3551(arg0, arg1);
		}
		anInt2769 = -1;
		anInt2771 = -1;
		anInt2766 = -1;
		anInt2763 = -1;
		anInt2765 = -1;
	}

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "()V")
	public static void method2142() {
		aClass144Array1 = new Class144[255];
		anIntArray253 = new int[4];
		aBooleanArray27 = new boolean[4];
		anIntArray254 = new int[4];
		aBooleanArray26 = new boolean[4];
		anIntArrayArrayArray8 = new int[anInt2768][anInt2764][anInt2767];
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!Static188.aBoolean295 || anInt2769 == arg3 && anInt2771 == arg4 && anInt2766 == arg5 && anInt2763 == arg6 && anInt2765 == arg7) {
			return;
		}
		@Pc(20) int local20;
		for (local20 = 0; local20 < 4; local20++) {
			aBooleanArray26[local20] = false;
		}
		local20 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35;
		@Pc(40) int local40;
		label112: for (local35 = arg4; local35 <= arg6; local35++) {
			label110: for (local40 = arg5; local40 <= arg7; local40++) {
				@Pc(51) int local51 = anIntArrayArrayArray8[arg3][local35][local40];
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
								if (local59 == anIntArray254[local65]) {
									continue label96;
								}
							}
							for (local65 = 0; local65 < 4; local65++) {
								if (local59 == anIntArray253[local65]) {
									if (!aBooleanArray26[local65]) {
										aBooleanArray26[local65] = true;
										local20++;
										if (local20 == 4) {
											break label112;
										}
									}
									continue label96;
								}
							}
							anIntArray254[local33++] = local59;
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
				if (!aBooleanArray26[local40]) {
					anIntArray253[local40] = anIntArray254[local35];
					aBooleanArray26[local40] = true;
					method2138(local40, aClass144Array1[anIntArray254[local35]], arg0, arg1, arg2);
					break;
				}
			}
		}
		for (local35 = 0; local35 < 4; local35++) {
			if (!aBooleanArray26[local35]) {
				anIntArray253[local35] = -1;
				method2139(local35);
			}
		}
		anInt2769 = arg3;
		anInt2771 = arg4;
		anInt2766 = arg5;
		anInt2763 = arg6;
		anInt2765 = arg7;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIII)V")
	public static void method2144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!Static188.aBoolean295) {
			return;
		}
		if (arg0 == 1 && arg5 > 0) {
			method2134(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
		} else if (arg0 == 4 && arg5 < anInt2764 - 1) {
			method2134(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
		} else if (arg0 == 8 && arg6 > 0) {
			method2134(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
		} else if (arg0 == 2 && arg6 < anInt2767 - 1) {
			method2134(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
		} else if (arg0 == 16 && arg5 > 0 && arg6 < anInt2767 - 1) {
			method2134(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
		} else if (arg0 == 32 && arg5 < anInt2764 - 1 && arg6 < anInt2767 - 1) {
			method2134(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
		} else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
			method2134(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
		} else if (arg0 == 64 && arg5 < anInt2764 - 1 && arg6 > 0) {
			method2134(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II[[[Lclient!pi;)V")
	public static void method2145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub26[][][] arg2) {
		if (!Static188.aBoolean295) {
			return;
		}
		@Pc(4) GL local4 = Static277.aGL1;
		Static123.method2162(0, 0);
		Static277.method4222(0);
		Static277.method4210();
		Static277.method4212(Static277.anInt5350);
		local4.glDepthMask(false);
		Static277.method4193(false);
		local4.glBlendFunc(774, 1);
		local4.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
		local4.glTexEnvi(8960, 34176, 34166);
		local4.glTexEnvi(8960, 34192, 770);
		label71: for (@Pc(56) int local56 = 0; local56 < anInt2770; local56++) {
			@Pc(63) Class144 local63 = aClass144Array1[local56];
			@Pc(66) int local66 = local63.anInt4492;
			if (local63.aBoolean349) {
				local66--;
			}
			if (local63.aClass178_1 != null) {
				@Pc(76) int local76 = 0;
				@Pc(84) int local84 = (local63.anInt4490 >> 7) - local63.anInt4503;
				@Pc(92) int local92 = (local63.anInt4490 >> 7) + local63.anInt4503;
				if (local92 >= Static152.anInt3232) {
					local92 = Static152.anInt3232 - 1;
				}
				if (local84 < Static172.anInt3652) {
					local76 = Static172.anInt3652 - local84;
					local84 = Static172.anInt3652;
				}
				for (@Pc(112) int local112 = local84; local112 <= local92; local112++) {
					@Pc(121) short local121 = local63.aShortArray75[local76++];
					@Pc(133) int local133 = (local63.anInt4502 >> 7) + (local121 >> 8) - local63.anInt4503;
					@Pc(141) int local141 = local133 + (local121 & 0xFF) - 1;
					if (local133 < Static161.anInt3459) {
						local133 = Static161.anInt3459;
					}
					if (local141 >= Static30.anInt3246) {
						local141 = Static30.anInt3246 - 1;
					}
					for (@Pc(155) int local155 = local133; local155 <= local141; local155++) {
						@Pc(160) Class1_Sub26 local160 = null;
						if (local66 >= 0) {
							local160 = arg2[local66][local155][local112];
						}
						if (local66 < 0 || local160 != null && local160.aBoolean313) {
							Static277.method4221(201.5F - (float) local63.anInt4492 * 50.0F - 1.5F);
							local4.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, local63.aFloat45 }, 0);
							local63.aClass178_1.method4392();
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
		local4.glFogfv(2918, Static28.aFloatArray3, 0);
		local4.glEnableClientState(32888);
		Static277.method4216();
	}

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "()V")
	public static void method2146() {
		aClass144Array1 = null;
		anIntArray253 = null;
		aBooleanArray27 = null;
		anIntArray254 = null;
		aBooleanArray26 = null;
		anIntArrayArrayArray8 = null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!re;)V")
	public static void method2147(@OriginalArg(0) Class144 arg0) {
		if (anInt2770 >= 255) {
			System.out.println("Number of lights added exceeds maximum!");
		} else {
			aClass144Array1[anInt2770++] = arg0;
		}
	}
}
