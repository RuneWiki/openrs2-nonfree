import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!en", name = "a", descriptor = "I")
	private static int anInt1741;

	@OriginalMember(owner = "client!en", name = "b", descriptor = "[I")
	private static int[] anIntArray179;

	@OriginalMember(owner = "client!en", name = "c", descriptor = "[Lclient!mm;")
	public static Class103[] aClass103Array1;

	@OriginalMember(owner = "client!en", name = "d", descriptor = "I")
	private static int anInt1742;

	@OriginalMember(owner = "client!en", name = "e", descriptor = "[Z")
	private static boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!en", name = "g", descriptor = "I")
	private static int anInt1743;

	@OriginalMember(owner = "client!en", name = "h", descriptor = "I")
	private static int anInt1744;

	@OriginalMember(owner = "client!en", name = "i", descriptor = "I")
	private static int anInt1745;

	@OriginalMember(owner = "client!en", name = "j", descriptor = "I")
	private static int anInt1746;

	@OriginalMember(owner = "client!en", name = "k", descriptor = "I")
	private static int anInt1747;

	@OriginalMember(owner = "client!en", name = "l", descriptor = "[[[I")
	private static int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!en", name = "m", descriptor = "[Z")
	private static boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!en", name = "n", descriptor = "[I")
	private static int[] anIntArray180;

	@OriginalMember(owner = "client!en", name = "o", descriptor = "I")
	private static int anInt1748;

	@OriginalMember(owner = "client!en", name = "f", descriptor = "[F")
	private static float[] aFloatArray3 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!en", name = "p", descriptor = "I")
	public static int anInt1749 = 0;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!mm;III)V")
	private static void method1280(@OriginalArg(0) int arg0, @OriginalArg(1) Class103 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = arg0 + 16384 + 4;
		@Pc(7) GL local7 = Static296.aGL1;
		if (!aBooleanArray6[arg0]) {
			local7.glEnable(local5);
			aBooleanArray6[arg0] = true;
		}
		local7.glLightf(local5, 4617, arg1.aFloat134);
		local7.glLightfv(local5, 4609, arg1.aFloatArray21, 0);
		aFloatArray3[0] = arg1.anInt3861 - arg2;
		aFloatArray3[1] = arg1.anInt3849 - arg3;
		aFloatArray3[2] = arg1.anInt3854 - arg4;
		local7.glLightfv(local5, 4611, aFloatArray3, 0);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!Static10.aBoolean12 || anInt1744 == arg3 && anInt1741 == arg4 && anInt1748 == arg5 && anInt1746 == arg6 && anInt1742 == arg7) {
			return;
		}
		@Pc(20) int local20;
		for (local20 = 0; local20 < 4; local20++) {
			aBooleanArray5[local20] = false;
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
								if (local59 == anIntArray180[local65]) {
									continue label96;
								}
							}
							for (local65 = 0; local65 < 4; local65++) {
								if (local59 == anIntArray179[local65]) {
									if (!aBooleanArray5[local65]) {
										aBooleanArray5[local65] = true;
										local20++;
										if (local20 == 4) {
											break label112;
										}
									}
									continue label96;
								}
							}
							anIntArray180[local33++] = local59;
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
				if (!aBooleanArray5[local40]) {
					anIntArray179[local40] = anIntArray180[local35];
					aBooleanArray5[local40] = true;
					method1280(local40, aClass103Array1[anIntArray180[local35]], arg0, arg1, arg2);
					break;
				}
			}
		}
		for (local35 = 0; local35 < 4; local35++) {
			if (!aBooleanArray5[local35]) {
				anIntArray179[local35] = -1;
				method1290(local35);
			}
		}
		anInt1744 = arg3;
		anInt1741 = arg4;
		anInt1748 = arg5;
		anInt1746 = arg6;
		anInt1742 = arg7;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!mm;)V")
	public static void method1282(@OriginalArg(0) Class103 arg0) {
		if (anInt1749 >= 255) {
			System.out.println("Number of lights added exceeds maximum!");
		} else {
			aClass103Array1[anInt1749++] = arg0;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(III)V")
	public static void method1283() {
		anInt1745 = 4;
		anInt1743 = 104;
		anInt1747 = 104;
		anIntArrayArrayArray6 = new int[anInt1745][anInt1743][anInt1747];
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IZ)V")
	public static void method1284(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(1) int local1 = 0; local1 < anInt1749; local1++) {
			aClass103Array1[local1].method3140(arg0, arg1);
		}
		anInt1744 = -1;
		anInt1741 = -1;
		anInt1748 = -1;
		anInt1746 = -1;
		anInt1742 = -1;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "()V")
	public static void method1285() {
		aClass103Array1 = new Class103[255];
		anIntArray179 = new int[4];
		aBooleanArray6 = new boolean[4];
		anIntArray180 = new int[4];
		aBooleanArray5 = new boolean[4];
		anIntArrayArrayArray6 = new int[anInt1745][anInt1743][anInt1747];
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "()V")
	public static void method1286() {
		aClass103Array1 = null;
		anIntArray179 = null;
		aBooleanArray6 = null;
		anIntArray180 = null;
		aBooleanArray5 = null;
		anIntArrayArrayArray6 = null;
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "()V")
	public static void method1287() {
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			anIntArray179[local1] = -1;
			method1290(local1);
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIII)V")
	public static void method1288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!Static10.aBoolean12 || anInt1744 == arg3 && anInt1741 == arg4 && anInt1748 == arg5 && anInt1746 == arg4 && anInt1742 == arg5) {
			return;
		}
		@Pc(20) int local20;
		for (local20 = 0; local20 < 4; local20++) {
			aBooleanArray5[local20] = false;
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
					if (local47 == anIntArray179[local53]) {
						aBooleanArray5[local53] = true;
						continue label72;
					}
				}
				anIntArray180[local20++] = local47;
			}
			for (local47 = 0; local47 < local20; local47++) {
				for (local53 = 0; local53 < 4; local53++) {
					if (!aBooleanArray5[local53]) {
						anIntArray179[local53] = anIntArray180[local47];
						aBooleanArray5[local53] = true;
						method1280(local53, aClass103Array1[anIntArray180[local47]], arg0, arg1, arg2);
						break;
					}
				}
			}
			for (local47 = 0; local47 < 4; local47++) {
				if (!aBooleanArray5[local47]) {
					anIntArray179[local47] = -1;
					method1290(local47);
				}
			}
			anInt1744 = arg3;
			anInt1741 = arg4;
			anInt1748 = arg5;
			anInt1746 = arg4;
			anInt1742 = arg5;
			return;
		}
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "()V")
	public static void method1289() {
		anInt1749 = 0;
		for (@Pc(3) int local3 = 0; local3 < anInt1745; local3++) {
			for (@Pc(8) int local8 = 0; local8 < anInt1743; local8++) {
				for (@Pc(13) int local13 = 0; local13 < anInt1747; local13++) {
					anIntArrayArrayArray6[local3][local8][local13] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
	private static void method1290(@OriginalArg(0) int arg0) {
		if (aBooleanArray6[arg0]) {
			aBooleanArray6[arg0] = false;
			@Pc(14) int local14 = arg0 + 16384 + 4;
			@Pc(16) GL local16 = Static296.aGL1;
			local16.glDisable(local14);
		}
	}

	@OriginalMember(owner = "client!en", name = "e", descriptor = "()V")
	public static void method1291() {
		@Pc(1) GL local1 = Static296.aGL1;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 4; local3++) {
			@Pc(10) int local10 = local3 + 16388;
			local1.glLightfv(local10, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local1.glLightf(local10, 4616, 0.0F);
			local1.glLightf(local10, 4615, 0.0F);
		}
		for (local3 = 0; local3 < 4; local3++) {
			anIntArray179[local3] = -1;
			method1290(local3);
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIII)V")
	public static void method1292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!Static10.aBoolean12) {
			return;
		}
		label43: for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (anIntArray179[local4] != -1) {
				@Pc(20) int local20 = anIntArrayArrayArray6[arg0][arg1][arg2];
				@Pc(28) int local28;
				while (local20 != 0) {
					local28 = (local20 & 0xFF) - 1;
					local20 >>>= 0x8;
					if (local28 == anIntArray179[local4]) {
						continue label43;
					}
				}
				local20 = anIntArrayArrayArray6[arg0][arg3][arg4];
				while (local20 != 0) {
					local28 = (local20 & 0xFF) - 1;
					local20 >>>= 0x8;
					if (local28 == anIntArray179[local4]) {
						continue label43;
					}
				}
			}
			anIntArray179[local4] = -1;
			method1290(local4);
		}
	}

	@OriginalMember(owner = "client!en", name = "f", descriptor = "()V")
	public static void method1293() {
		for (@Pc(1) int local1 = 0; local1 < anInt1749; local1++) {
			@Pc(8) Class103 local8 = aClass103Array1[local1];
			@Pc(11) int local11 = local8.anInt3848;
			if (local8.aBoolean198) {
				local11 = 0;
			}
			@Pc(19) int local19 = local8.anInt3848;
			if (local8.aBoolean199) {
				local19 = 3;
			}
			for (@Pc(26) int local26 = local11; local26 <= local19; local26++) {
				@Pc(31) int local31 = 0;
				@Pc(39) int local39 = (local8.anInt3854 >> 7) - local8.anInt3860;
				if (local39 < 0) {
					local31 = -local39;
					local39 = 0;
				}
				@Pc(55) int local55 = (local8.anInt3854 >> 7) + local8.anInt3860;
				if (local55 > anInt1747 - 1) {
					local55 = anInt1747 - 1;
				}
				for (@Pc(66) int local66 = local39; local66 <= local55; local66++) {
					@Pc(75) short local75 = local8.aShortArray62[local31++];
					@Pc(87) int local87 = (local8.anInt3861 >> 7) + (local75 >> 8) - local8.anInt3860;
					@Pc(95) int local95 = local87 + (local75 & 0xFF) - 1;
					if (local87 < 0) {
						local87 = 0;
					}
					if (local95 > anInt1743 - 1) {
						local95 = anInt1743 - 1;
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

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIII)V")
	public static void method1294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!Static10.aBoolean12) {
			return;
		}
		if (arg0 == 1 && arg5 > 0) {
			method1288(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
		} else if (arg0 == 4 && arg5 < anInt1743 - 1) {
			method1288(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
		} else if (arg0 == 8 && arg6 > 0) {
			method1288(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
		} else if (arg0 == 2 && arg6 < anInt1747 - 1) {
			method1288(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
		} else if (arg0 == 16 && arg5 > 0 && arg6 < anInt1747 - 1) {
			method1288(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
		} else if (arg0 == 32 && arg5 < anInt1743 - 1 && arg6 < anInt1747 - 1) {
			method1288(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
		} else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
			method1288(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
		} else if (arg0 == 64 && arg5 < anInt1743 - 1 && arg6 > 0) {
			method1288(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(II[[[Lclient!i;)V")
	public static void method1295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub14[][][] arg2) {
		if (!Static10.aBoolean12) {
			return;
		}
		@Pc(4) GL local4 = Static296.aGL1;
		Static141.method2524(0, 0);
		Static296.method4805(0);
		Static296.method4811();
		Static296.method4812(Static296.anInt6198);
		local4.glDepthMask(false);
		Static296.method4840(false);
		local4.glBlendFunc(774, 1);
		local4.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
		local4.glTexEnvi(8960, 34176, 34166);
		local4.glTexEnvi(8960, 34192, 770);
		label71: for (@Pc(56) int local56 = 0; local56 < anInt1749; local56++) {
			@Pc(63) Class103 local63 = aClass103Array1[local56];
			@Pc(66) int local66 = local63.anInt3848;
			if (local63.aBoolean197) {
				local66--;
			}
			if (local63.aClass178_1 != null) {
				@Pc(76) int local76 = 0;
				@Pc(84) int local84 = (local63.anInt3854 >> 7) - local63.anInt3860;
				@Pc(92) int local92 = (local63.anInt3854 >> 7) + local63.anInt3860;
				if (local92 >= Static15.anInt400) {
					local92 = Static15.anInt400 - 1;
				}
				if (local84 < Static78.anInt1884) {
					local76 = Static78.anInt1884 - local84;
					local84 = Static78.anInt1884;
				}
				for (@Pc(112) int local112 = local84; local112 <= local92; local112++) {
					@Pc(121) short local121 = local63.aShortArray62[local76++];
					@Pc(133) int local133 = (local63.anInt3861 >> 7) + (local121 >> 8) - local63.anInt3860;
					@Pc(141) int local141 = local133 + (local121 & 0xFF) - 1;
					if (local133 < Static131.anInt2971) {
						local133 = Static131.anInt2971;
					}
					if (local141 >= Static193.anInt4317) {
						local141 = Static193.anInt4317 - 1;
					}
					for (@Pc(155) int local155 = local133; local155 <= local141; local155++) {
						@Pc(160) Class1_Sub14 local160 = null;
						if (local66 >= 0) {
							local160 = arg2[local66][local155][local112];
						}
						if (local66 < 0 || local160 != null && local160.aBoolean126) {
							Static296.method4806(201.5F - (float) local63.anInt3848 * 50.0F - 1.5F);
							local4.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, local63.aFloat133 }, 0);
							local63.aClass178_1.method4793();
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
		local4.glFogfv(2918, Static201.aFloatArray28, 0);
		local4.glEnableClientState(32888);
		Static296.method4822();
	}
}
