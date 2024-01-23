import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "[I")
	private static int[] anIntArray438;

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "[Lclient!hm;")
	public static Class72[] aClass72Array1;

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
	private static int anInt3728;

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
	private static int anInt3729;

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "[[[I")
	private static int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "[Z")
	private static boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
	private static int anInt3730;

	@OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
	private static int anInt3731;

	@OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
	private static int anInt3732;

	@OriginalMember(owner = "client!ol", name = "k", descriptor = "[Z")
	private static boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!ol", name = "m", descriptor = "[I")
	private static int[] anIntArray439;

	@OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
	private static int anInt3734;

	@OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
	private static int anInt3735;

	@OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
	private static int anInt3736;

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "[F")
	private static float[] aFloatArray25 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
	public static int anInt3733 = 0;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIII)V")
	public static void method2933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!Static294.aBoolean445) {
			return;
		}
		if (arg0 == 1 && arg5 > 0) {
			method2935(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
		} else if (arg0 == 4 && arg5 < anInt3729 - 1) {
			method2935(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
		} else if (arg0 == 8 && arg6 > 0) {
			method2935(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
		} else if (arg0 == 2 && arg6 < anInt3734 - 1) {
			method2935(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
		} else if (arg0 == 16 && arg5 > 0 && arg6 < anInt3734 - 1) {
			method2935(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
		} else if (arg0 == 32 && arg5 < anInt3729 - 1 && arg6 < anInt3734 - 1) {
			method2935(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
		} else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
			method2935(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
		} else if (arg0 == 64 && arg5 < anInt3729 - 1 && arg6 > 0) {
			method2935(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!hm;)V")
	public static void method2934(@OriginalArg(0) Class72 arg0) {
		if (anInt3733 >= 255) {
			System.out.println("Number of lights added exceeds maximum!");
		} else {
			aClass72Array1[anInt3733++] = arg0;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIII)V")
	public static void method2935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!Static294.aBoolean445 || anInt3730 == arg3 && anInt3732 == arg4 && anInt3731 == arg5 && anInt3728 == arg4 && anInt3736 == arg5) {
			return;
		}
		@Pc(20) int local20;
		for (local20 = 0; local20 < 4; local20++) {
			aBooleanArray17[local20] = false;
		}
		local20 = 0;
		@Pc(39) int local39 = anIntArrayArrayArray15[arg3][arg4][arg5];
		while (true) {
			@Pc(47) int local47;
			@Pc(53) int local53;
			label72: while (local39 != 0) {
				local47 = (local39 & 0xFF) - 1;
				local39 >>>= 0x8;
				for (local53 = 0; local53 < 4; local53++) {
					if (local47 == anIntArray438[local53]) {
						aBooleanArray17[local53] = true;
						continue label72;
					}
				}
				anIntArray439[local20++] = local47;
			}
			for (local47 = 0; local47 < local20; local47++) {
				for (local53 = 0; local53 < 4; local53++) {
					if (!aBooleanArray17[local53]) {
						anIntArray438[local53] = anIntArray439[local47];
						aBooleanArray17[local53] = true;
						method2947(local53, aClass72Array1[anIntArray439[local47]], arg0, arg1, arg2);
						break;
					}
				}
			}
			for (local47 = 0; local47 < 4; local47++) {
				if (!aBooleanArray17[local47]) {
					anIntArray438[local47] = -1;
					method2943(local47);
				}
			}
			anInt3730 = arg3;
			anInt3732 = arg4;
			anInt3731 = arg5;
			anInt3728 = arg4;
			anInt3736 = arg5;
			return;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!Static294.aBoolean445 || anInt3730 == arg3 && anInt3732 == arg4 && anInt3731 == arg5 && anInt3728 == arg6 && anInt3736 == arg7) {
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
				@Pc(51) int local51 = anIntArrayArrayArray15[arg3][local35][local40];
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
								if (local59 == anIntArray439[local65]) {
									continue label96;
								}
							}
							for (local65 = 0; local65 < 4; local65++) {
								if (local59 == anIntArray438[local65]) {
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
							anIntArray439[local33++] = local59;
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
					anIntArray438[local40] = anIntArray439[local35];
					aBooleanArray17[local40] = true;
					method2947(local40, aClass72Array1[anIntArray439[local35]], arg0, arg1, arg2);
					break;
				}
			}
		}
		for (local35 = 0; local35 < 4; local35++) {
			if (!aBooleanArray17[local35]) {
				anIntArray438[local35] = -1;
				method2943(local35);
			}
		}
		anInt3730 = arg3;
		anInt3732 = arg4;
		anInt3731 = arg5;
		anInt3728 = arg6;
		anInt3736 = arg7;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "()V")
	public static void method2937() {
		aClass72Array1 = null;
		anIntArray438 = null;
		aBooleanArray16 = null;
		anIntArray439 = null;
		aBooleanArray17 = null;
		anIntArrayArrayArray15 = null;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIII)V")
	public static void method2938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!Static294.aBoolean445) {
			return;
		}
		label43: for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (anIntArray438[local4] != -1) {
				@Pc(20) int local20 = anIntArrayArrayArray15[arg0][arg1][arg2];
				@Pc(28) int local28;
				while (local20 != 0) {
					local28 = (local20 & 0xFF) - 1;
					local20 >>>= 0x8;
					if (local28 == anIntArray438[local4]) {
						continue label43;
					}
				}
				local20 = anIntArrayArrayArray15[arg0][arg3][arg4];
				while (local20 != 0) {
					local28 = (local20 & 0xFF) - 1;
					local20 >>>= 0x8;
					if (local28 == anIntArray438[local4]) {
						continue label43;
					}
				}
			}
			anIntArray438[local4] = -1;
			method2943(local4);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)V")
	public static void method2939() {
		anInt3735 = 4;
		anInt3729 = 104;
		anInt3734 = 104;
		anIntArrayArrayArray15 = new int[anInt3735][anInt3729][anInt3734];
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZ)V")
	public static void method2940(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(1) int local1 = 0; local1 < anInt3733; local1++) {
			aClass72Array1[local1].method1660(arg1, arg0);
		}
		anInt3730 = -1;
		anInt3732 = -1;
		anInt3731 = -1;
		anInt3728 = -1;
		anInt3736 = -1;
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "()V")
	public static void method2941() {
		@Pc(1) GL local1 = Static240.aGL1;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 4; local3++) {
			@Pc(10) int local10 = local3 + 16388;
			local1.glLightfv(local10, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local1.glLightf(local10, 4616, 0.0F);
			local1.glLightf(local10, 4615, 0.0F);
		}
		for (local3 = 0; local3 < 4; local3++) {
			anIntArray438[local3] = -1;
			method2943(local3);
		}
	}

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "()V")
	public static void method2942() {
		for (@Pc(1) int local1 = 0; local1 < anInt3733; local1++) {
			@Pc(8) Class72 local8 = aClass72Array1[local1];
			@Pc(11) int local11 = local8.anInt1953;
			if (local8.aBoolean140) {
				local11 = 0;
			}
			@Pc(19) int local19 = local8.anInt1953;
			if (local8.aBoolean142) {
				local19 = 3;
			}
			for (@Pc(26) int local26 = local11; local26 <= local19; local26++) {
				@Pc(31) int local31 = 0;
				@Pc(39) int local39 = (local8.anInt1947 >> 7) - local8.anInt1952;
				if (local39 < 0) {
					local31 = -local39;
					local39 = 0;
				}
				@Pc(55) int local55 = (local8.anInt1947 >> 7) + local8.anInt1952;
				if (local55 > anInt3734 - 1) {
					local55 = anInt3734 - 1;
				}
				for (@Pc(66) int local66 = local39; local66 <= local55; local66++) {
					@Pc(75) short local75 = local8.aShortArray36[local31++];
					@Pc(87) int local87 = (local8.anInt1961 >> 7) + (local75 >> 8) - local8.anInt1952;
					@Pc(95) int local95 = local87 + (local75 & 0xFF) - 1;
					if (local87 < 0) {
						local87 = 0;
					}
					if (local95 > anInt3729 - 1) {
						local95 = anInt3729 - 1;
					}
					for (@Pc(110) int local110 = local87; local110 <= local95; local110++) {
						@Pc(121) int local121 = anIntArrayArrayArray15[local26][local110][local66];
						if ((local121 & 0xFF) == 0) {
							anIntArrayArrayArray15[local26][local110][local66] = local121 | local1 + 1;
						} else if ((local121 & 0xFF00) == 0) {
							anIntArrayArrayArray15[local26][local110][local66] = local121 | local1 + 1 << 8;
						} else if ((local121 & 0xFF0000) == 0) {
							anIntArrayArrayArray15[local26][local110][local66] = local121 | local1 + 1 << 16;
						} else if ((local121 & 0xFF000000) == 0) {
							anIntArrayArrayArray15[local26][local110][local66] = local121 | local1 + 1 << 24;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
	private static void method2943(@OriginalArg(0) int arg0) {
		if (aBooleanArray16[arg0]) {
			aBooleanArray16[arg0] = false;
			@Pc(14) int local14 = arg0 + 16384 + 4;
			@Pc(16) GL local16 = Static240.aGL1;
			local16.glDisable(local14);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(II[[[Lclient!kb;)V")
	public static void method2944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub19[][][] arg2) {
		if (!Static294.aBoolean445) {
			return;
		}
		@Pc(4) GL local4 = Static240.aGL1;
		Static122.method1910(0, 0);
		Static240.method3804(0);
		Static240.method3781();
		Static240.method3789(Static240.anInt4943);
		local4.glDepthMask(false);
		Static240.method3787(false);
		local4.glBlendFunc(774, 1);
		local4.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
		local4.glTexEnvi(8960, 34176, 34166);
		local4.glTexEnvi(8960, 34192, 770);
		label71: for (@Pc(56) int local56 = 0; local56 < anInt3733; local56++) {
			@Pc(63) Class72 local63 = aClass72Array1[local56];
			@Pc(66) int local66 = local63.anInt1953;
			if (local63.aBoolean141) {
				local66--;
			}
			if (local63.aClass57_1 != null) {
				@Pc(76) int local76 = 0;
				@Pc(84) int local84 = (local63.anInt1947 >> 7) - local63.anInt1952;
				@Pc(92) int local92 = (local63.anInt1947 >> 7) + local63.anInt1952;
				if (local92 >= Static276.anInt5533) {
					local92 = Static276.anInt5533 - 1;
				}
				if (local84 < Static97.anInt1857) {
					local76 = Static97.anInt1857 - local84;
					local84 = Static97.anInt1857;
				}
				for (@Pc(112) int local112 = local84; local112 <= local92; local112++) {
					@Pc(121) short local121 = local63.aShortArray36[local76++];
					@Pc(133) int local133 = (local63.anInt1961 >> 7) + (local121 >> 8) - local63.anInt1952;
					@Pc(141) int local141 = local133 + (local121 & 0xFF) - 1;
					if (local133 < Static104.anInt3085) {
						local133 = Static104.anInt3085;
					}
					if (local141 >= Static171.anInt3162) {
						local141 = Static171.anInt3162 - 1;
					}
					for (@Pc(155) int local155 = local133; local155 <= local141; local155++) {
						@Pc(160) Class1_Sub19 local160 = null;
						if (local66 >= 0) {
							local160 = arg2[local66][local155][local112];
						}
						if (local66 < 0 || local160 != null && local160.aBoolean180) {
							Static240.method3809(201.5F - (float) local63.anInt1953 * 50.0F - 1.5F);
							local4.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, local63.aFloat58 }, 0);
							local63.aClass57_1.method1394();
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
		local4.glFogfv(2918, Static34.aFloatArray9, 0);
		local4.glEnableClientState(32888);
		Static240.method3775();
	}

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "()V")
	public static void method2945() {
		anInt3733 = 0;
		for (@Pc(3) int local3 = 0; local3 < anInt3735; local3++) {
			for (@Pc(8) int local8 = 0; local8 < anInt3729; local8++) {
				for (@Pc(13) int local13 = 0; local13 < anInt3734; local13++) {
					anIntArrayArrayArray15[local3][local8][local13] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "()V")
	public static void method2946() {
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			anIntArray438[local1] = -1;
			method2943(local1);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILclient!hm;III)V")
	private static void method2947(@OriginalArg(0) int arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = arg0 + 16384 + 4;
		@Pc(7) GL local7 = Static240.aGL1;
		if (!aBooleanArray16[arg0]) {
			local7.glEnable(local5);
			aBooleanArray16[arg0] = true;
		}
		local7.glLightf(local5, 4617, arg1.aFloat57);
		local7.glLightfv(local5, 4609, arg1.aFloatArray18, 0);
		aFloatArray25[0] = arg1.anInt1961 - arg2;
		aFloatArray25[1] = arg1.anInt1965 - arg3;
		aFloatArray25[2] = arg1.anInt1947 - arg4;
		local7.glLightfv(local5, 4611, aFloatArray25, 0);
	}

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "()V")
	public static void method2948() {
		aClass72Array1 = new Class72[255];
		anIntArray438 = new int[4];
		aBooleanArray16 = new boolean[4];
		anIntArray439 = new int[4];
		aBooleanArray17 = new boolean[4];
		anIntArrayArrayArray15 = new int[anInt3735][anInt3729][anInt3734];
	}
}
