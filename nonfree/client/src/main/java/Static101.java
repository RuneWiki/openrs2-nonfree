import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "[[[I")
	private static int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
	private static int anInt2029;

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "[Z")
	private static boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "[I")
	private static int[] anIntArray176;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "[Lclient!h;")
	public static Class61[] aClass61Array1;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
	private static int anInt2030;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
	private static int anInt2031;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
	private static int anInt2032;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
	private static int anInt2033;

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "[Z")
	private static boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
	private static int anInt2034;

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "[I")
	private static int[] anIntArray177;

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
	private static int anInt2035;

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
	private static int anInt2037;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "[F")
	private static float[] aFloatArray8 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
	public static int anInt2036 = 0;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIII)V")
	public static void method1821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!Static311.aBoolean384 || anInt2037 == arg3 && anInt2033 == arg4 && anInt2029 == arg5 && anInt2030 == arg4 && anInt2035 == arg5) {
			return;
		}
		@Pc(20) int local20;
		for (local20 = 0; local20 < 4; local20++) {
			aBooleanArray6[local20] = false;
		}
		local20 = 0;
		@Pc(39) int local39 = anIntArrayArrayArray6[arg3][arg4][arg5];
		while (true) {
			@Pc(47) int local47;
			@Pc(53) int local53;
			label72: while (local39 != 0) {
				local47 = (local39 & 0xFF) - 1;
				local39 >>>= 0x8;
				for (local53 = 0; local53 < 4; local53++) {
					if (local47 == anIntArray177[local53]) {
						aBooleanArray6[local53] = true;
						continue label72;
					}
				}
				anIntArray176[local20++] = local47;
			}
			for (local47 = 0; local47 < local20; local47++) {
				for (local53 = 0; local53 < 4; local53++) {
					if (!aBooleanArray6[local53]) {
						anIntArray177[local53] = anIntArray176[local47];
						aBooleanArray6[local53] = true;
						method1827(local53, aClass61Array1[anIntArray176[local47]], arg0, arg1, arg2);
						break;
					}
				}
			}
			for (local47 = 0; local47 < 4; local47++) {
				if (!aBooleanArray6[local47]) {
					anIntArray177[local47] = -1;
					method1829(local47);
				}
			}
			anInt2037 = arg3;
			anInt2033 = arg4;
			anInt2029 = arg5;
			anInt2030 = arg4;
			anInt2035 = arg5;
			return;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "()V")
	public static void method1822() {
		for (@Pc(1) int local1 = 0; local1 < anInt2036; local1++) {
			@Pc(8) Class61 local8 = aClass61Array1[local1];
			@Pc(11) int local11 = local8.anInt1999;
			if (local8.aBoolean109) {
				local11 = 0;
			}
			@Pc(19) int local19 = local8.anInt1999;
			if (local8.aBoolean110) {
				local19 = 3;
			}
			for (@Pc(26) int local26 = local11; local26 <= local19; local26++) {
				@Pc(31) int local31 = 0;
				@Pc(39) int local39 = (local8.anInt2006 >> 7) - local8.anInt2002;
				if (local39 < 0) {
					local31 = -local39;
					local39 = 0;
				}
				@Pc(55) int local55 = (local8.anInt2006 >> 7) + local8.anInt2002;
				if (local55 > anInt2032 - 1) {
					local55 = anInt2032 - 1;
				}
				for (@Pc(66) int local66 = local39; local66 <= local55; local66++) {
					@Pc(75) short local75 = local8.aShortArray36[local31++];
					@Pc(87) int local87 = (local8.anInt2004 >> 7) + (local75 >> 8) - local8.anInt2002;
					@Pc(95) int local95 = local87 + (local75 & 0xFF) - 1;
					if (local87 < 0) {
						local87 = 0;
					}
					if (local95 > anInt2031 - 1) {
						local95 = anInt2031 - 1;
					}
					for (@Pc(110) int local110 = local87; local110 <= local95; local110++) {
						@Pc(121) int local121 = anIntArrayArrayArray6[local26][local110][local66];
						if ((local121 & 0xFF) == 0) {
							anIntArrayArrayArray6[local26][local110][local66] = local121 | local1 + 1;
						} else if ((local121 & 0xFF00) == 0) {
							anIntArrayArrayArray6[local26][local110][local66] = local121 | local1 + 1 << 8;
						} else if ((local121 & 0xFF0000) == 0) {
							anIntArrayArrayArray6[local26][local110][local66] = local121 | local1 + 1 << 16;
						} else if ((local121 & 0xFF000000) == 0) {
							anIntArrayArrayArray6[local26][local110][local66] = local121 | local1 + 1 << 24;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "()V")
	public static void method1823() {
		anInt2036 = 0;
		for (@Pc(3) int local3 = 0; local3 < anInt2034; local3++) {
			for (@Pc(8) int local8 = 0; local8 < anInt2031; local8++) {
				for (@Pc(13) int local13 = 0; local13 < anInt2032; local13++) {
					anIntArrayArrayArray6[local3][local8][local13] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "()V")
	public static void method1824() {
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			anIntArray177[local1] = -1;
			method1829(local1);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!h;)V")
	public static void method1825(@OriginalArg(0) Class61 arg0) {
		if (anInt2036 >= 255) {
			System.out.println("Number of lights added exceeds maximum!");
		} else {
			aClass61Array1[anInt2036++] = arg0;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!h;III)V")
	private static void method1827(@OriginalArg(0) int arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = arg0 + 16384 + 4;
		@Pc(7) GL local7 = Static156.aGL1;
		if (!aBooleanArray7[arg0]) {
			local7.glEnable(local5);
			aBooleanArray7[arg0] = true;
		}
		local7.glLightf(local5, 4617, arg1.aFloat65);
		local7.glLightfv(local5, 4609, arg1.aFloatArray7, 0);
		aFloatArray8[0] = arg1.anInt2004 - arg2;
		aFloatArray8[1] = arg1.anInt1993 - arg3;
		aFloatArray8[2] = arg1.anInt2006 - arg4;
		local7.glLightfv(local5, 4611, aFloatArray8, 0);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIII)V")
	public static void method1828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!Static311.aBoolean384) {
			return;
		}
		if (arg0 == 1 && arg5 > 0) {
			method1821(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
		} else if (arg0 == 4 && arg5 < anInt2031 - 1) {
			method1821(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
		} else if (arg0 == 8 && arg6 > 0) {
			method1821(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
		} else if (arg0 == 2 && arg6 < anInt2032 - 1) {
			method1821(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
		} else if (arg0 == 16 && arg5 > 0 && arg6 < anInt2032 - 1) {
			method1821(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
		} else if (arg0 == 32 && arg5 < anInt2031 - 1 && arg6 < anInt2032 - 1) {
			method1821(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
		} else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
			method1821(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
		} else if (arg0 == 64 && arg5 < anInt2031 - 1 && arg6 > 0) {
			method1821(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	private static void method1829(@OriginalArg(0) int arg0) {
		if (aBooleanArray7[arg0]) {
			aBooleanArray7[arg0] = false;
			@Pc(14) int local14 = arg0 + 16384 + 4;
			@Pc(16) GL local16 = Static156.aGL1;
			local16.glDisable(local14);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V")
	public static void method1830() {
		anInt2034 = 4;
		anInt2031 = 104;
		anInt2032 = 104;
		anIntArrayArrayArray6 = new int[anInt2034][anInt2031][anInt2032];
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIII)V")
	public static void method1831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!Static311.aBoolean384) {
			return;
		}
		label43: for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (anIntArray177[local4] != -1) {
				@Pc(20) int local20 = anIntArrayArrayArray6[arg0][arg1][arg2];
				@Pc(28) int local28;
				while (local20 != 0) {
					local28 = (local20 & 0xFF) - 1;
					local20 >>>= 0x8;
					if (local28 == anIntArray177[local4]) {
						continue label43;
					}
				}
				local20 = anIntArrayArrayArray6[arg0][arg3][arg4];
				while (local20 != 0) {
					local28 = (local20 & 0xFF) - 1;
					local20 >>>= 0x8;
					if (local28 == anIntArray177[local4]) {
						continue label43;
					}
				}
			}
			anIntArray177[local4] = -1;
			method1829(local4);
		}
	}

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "()V")
	public static void method1832() {
		aClass61Array1 = new Class61[255];
		anIntArray177 = new int[4];
		aBooleanArray7 = new boolean[4];
		anIntArray176 = new int[4];
		aBooleanArray6 = new boolean[4];
		anIntArrayArrayArray6 = new int[anInt2034][anInt2031][anInt2032];
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ)V")
	public static void method1833(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(1) int local1 = 0; local1 < anInt2036; local1++) {
			aClass61Array1[local1].method1804(arg0, arg1);
		}
		anInt2037 = -1;
		anInt2033 = -1;
		anInt2029 = -1;
		anInt2030 = -1;
		anInt2035 = -1;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!Static311.aBoolean384 || anInt2037 == arg3 && anInt2033 == arg4 && anInt2029 == arg5 && anInt2030 == arg6 && anInt2035 == arg7) {
			return;
		}
		@Pc(20) int local20;
		for (local20 = 0; local20 < 4; local20++) {
			aBooleanArray6[local20] = false;
		}
		local20 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35;
		@Pc(40) int local40;
		label112: for (local35 = arg4; local35 <= arg6; local35++) {
			label110: for (local40 = arg5; local40 <= arg7; local40++) {
				@Pc(51) int local51 = anIntArrayArrayArray6[arg3][local35][local40];
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
								if (local59 == anIntArray176[local65]) {
									continue label96;
								}
							}
							for (local65 = 0; local65 < 4; local65++) {
								if (local59 == anIntArray177[local65]) {
									if (!aBooleanArray6[local65]) {
										aBooleanArray6[local65] = true;
										local20++;
										if (local20 == 4) {
											break label112;
										}
									}
									continue label96;
								}
							}
							anIntArray176[local33++] = local59;
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
				if (!aBooleanArray6[local40]) {
					anIntArray177[local40] = anIntArray176[local35];
					aBooleanArray6[local40] = true;
					method1827(local40, aClass61Array1[anIntArray176[local35]], arg0, arg1, arg2);
					break;
				}
			}
		}
		for (local35 = 0; local35 < 4; local35++) {
			if (!aBooleanArray6[local35]) {
				anIntArray177[local35] = -1;
				method1829(local35);
			}
		}
		anInt2037 = arg3;
		anInt2033 = arg4;
		anInt2029 = arg5;
		anInt2030 = arg6;
		anInt2035 = arg7;
	}

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "()V")
	public static void method1835() {
		aClass61Array1 = null;
		anIntArray177 = null;
		aBooleanArray7 = null;
		anIntArray176 = null;
		aBooleanArray6 = null;
		anIntArrayArrayArray6 = null;
	}

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "()V")
	public static void method1836() {
		@Pc(1) GL local1 = Static156.aGL1;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 4; local3++) {
			@Pc(10) int local10 = local3 + 16388;
			local1.glLightfv(local10, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local1.glLightf(local10, 4616, 0.0F);
			local1.glLightf(local10, 4615, 0.0F);
		}
		for (local3 = 0; local3 < 4; local3++) {
			anIntArray177[local3] = -1;
			method1829(local3);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II[[[Lclient!wk;)V")
	public static void method1837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub33[][][] arg2) {
		if (!Static311.aBoolean384) {
			return;
		}
		@Pc(4) GL local4 = Static156.aGL1;
		Static90.method1648(0, 0);
		Static156.method2695(0);
		Static156.method2660();
		Static156.method2699(Static156.anInt3094);
		local4.glDepthMask(false);
		Static156.method2675(false);
		local4.glBlendFunc(774, 1);
		local4.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
		local4.glTexEnvi(8960, 34176, 34166);
		local4.glTexEnvi(8960, 34192, 770);
		label71: for (@Pc(56) int local56 = 0; local56 < anInt2036; local56++) {
			@Pc(63) Class61 local63 = aClass61Array1[local56];
			@Pc(66) int local66 = local63.anInt1999;
			if (local63.aBoolean111) {
				local66--;
			}
			if (local63.aClass26_1 != null) {
				@Pc(76) int local76 = 0;
				@Pc(84) int local84 = (local63.anInt2006 >> 7) - local63.anInt2002;
				@Pc(92) int local92 = (local63.anInt2006 >> 7) + local63.anInt2002;
				if (local92 >= Static124.anInt5504) {
					local92 = Static124.anInt5504 - 1;
				}
				if (local84 < Static236.anInt4291) {
					local76 = Static236.anInt4291 - local84;
					local84 = Static236.anInt4291;
				}
				for (@Pc(112) int local112 = local84; local112 <= local92; local112++) {
					@Pc(121) short local121 = local63.aShortArray36[local76++];
					@Pc(133) int local133 = (local63.anInt2004 >> 7) + (local121 >> 8) - local63.anInt2002;
					@Pc(141) int local141 = local133 + (local121 & 0xFF) - 1;
					if (local133 < Static47.anInt952) {
						local133 = Static47.anInt952;
					}
					if (local141 >= Static310.anInt5666) {
						local141 = Static310.anInt5666 - 1;
					}
					for (@Pc(155) int local155 = local133; local155 <= local141; local155++) {
						@Pc(160) Class1_Sub33 local160 = null;
						if (local66 >= 0) {
							local160 = arg2[local66][local155][local112];
						}
						if (local66 < 0 || local160 != null && local160.aBoolean390) {
							Static156.method2658(201.5F - (float) local63.anInt1999 * 50.0F - 1.5F);
							local4.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, local63.aFloat66 }, 0);
							local63.aClass26_1.method594();
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
		local4.glFogfv(2918, Static283.aFloatArray24, 0);
		local4.glEnableClientState(32888);
		Static156.method2672();
	}
}
