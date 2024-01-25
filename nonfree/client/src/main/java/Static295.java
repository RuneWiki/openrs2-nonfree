import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!sg", name = "r", descriptor = "Lclient!lp;")
	public static Class71 aClass71_5;

	@OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
	public static int anInt5861;

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString63 = null;

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_191 = new Class221(96, 7);

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
	public static int anInt5862 = -1;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILclient!gr;IIIIILclient!dr;IILclient!wp;ZII)Lclient!wp;")
	public static Class49 method4925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class84 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class37 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class49 arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int arg13) {
		if (arg11 == null) {
			return null;
		}
		@Pc(11) int local11 = 1031;
		if (arg2 != null) {
			local11 = arg2.method2276(-1, false, arg7) | 0x407;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(47) long local47 = ((long) arg6 << 48) + (long) ((arg9 << 24) + (arg5 << 16) + arg3) + ((long) arg13 << 32);
		@Pc(49) Class107 local49 = Static98.aClass107_11;
		@Pc(57) Class49 local57;
		synchronized (Static98.aClass107_11) {
			local57 = (Class49) Static98.aClass107_11.method3021(local47);
		}
		@Pc(151) int local151;
		@Pc(157) int local157;
		@Pc(163) int local163;
		@Pc(167) int local167;
		if (local57 == null || arg8.method3686(local57.method5820(), local11) != 0) {
			if (local57 != null) {
				local11 = arg8.method3685(local11, local57.method5820());
			}
			@Pc(86) byte local86;
			if (arg3 == 1) {
				local86 = 9;
			} else if (arg3 == 2) {
				local86 = 12;
			} else if (arg3 == 3) {
				local86 = 15;
			} else if (arg3 == 4) {
				local86 = 18;
			} else {
				local86 = 21;
			}
			@Pc(126) int[] local126 = new int[] { 64, 96, 128 };
			@Pc(144) Class111 local144 = new Class111(local86 * 3 + 1, -local86 + local86 * 6, 0);
			local151 = local144.method3252(0, 0, 0);
			@Pc(155) int[][] local155 = new int[3][local86];
			@Pc(169) int local169;
			@Pc(193) int local193;
			for (local157 = 0; local157 < 3; local157++) {
				local163 = local126[local157];
				local167 = local126[local157];
				for (local169 = 0; local169 < local86; local169++) {
					@Pc(177) int local177 = (local169 << 14) / local86;
					@Pc(185) int local185 = Class101.anIntArray234[local177] * local163 >> 15;
					local193 = Class101.anIntArray235[local177] * local167 >> 15;
					local155[local157][local169] = local144.method3252(local193, 0, local185);
				}
			}
			for (local163 = 0; local163 < 3; local163++) {
				local167 = (local163 * 256 + 128) / 3;
				local169 = 256 - local167;
				@Pc(240) byte local240 = (byte) (local169 * arg5 + arg9 * local167 >> 8);
				@Pc(285) short local285 = (short) ((local167 * (arg6 & 0x7F) + (arg13 & 0x7F) * local169 & 0x7F00) + ((arg13 & 0xFC00) * local169 + local167 * (arg6 & 0xFC00) & 0xFC0000) + (local167 * (arg6 & 0x380) + local169 * (arg13 & 0x380) & 0x38000) >> 8);
				for (local193 = 0; local193 < local86; local193++) {
					if (local163 == 0) {
						local144.method3254(local285, local155[0][(local193 + 1) % local86], local151, (short) -1, local240, (byte) 1, (byte) -1, local155[0][local193]);
					} else {
						local144.method3254(local285, local155[local163 - 1][(local193 + 1) % local86], local155[local163 - 1][local193], (short) -1, local240, (byte) 1, (byte) -1, local155[local163][(local193 + 1) % local86]);
						local144.method3254(local285, local155[local163][(local193 + 1) % local86], local155[local163 - 1][local193], (short) -1, local240, (byte) 1, (byte) -1, local155[local163][local193]);
					}
				}
			}
			local57 = arg8.method3667(local144, local11, Static176.anInt3970, 64, 768);
			@Pc(404) Class107 local404 = Static98.aClass107_11;
			synchronized (Static98.aClass107_11) {
				Static98.aClass107_11.method3018(local47, local57);
			}
		}
		@Pc(423) int local423 = arg3 * 64 - 1;
		@Pc(426) int local426 = -local423;
		@Pc(429) int local429 = -local423;
		@Pc(431) int local431 = local423;
		local151 = local423;
		if (arg12) {
			if (arg0 > 5120 && arg0 < 11264) {
				local151 = local423 + 128;
			}
			if (arg0 > 9216 && arg0 < 15360) {
				local431 = local423 + 128;
			}
			if (arg0 > 1024 && arg0 < 7168) {
				local426 -= 128;
			}
			if (arg0 > 13312 || arg0 < 3072) {
				local429 -= 128;
			}
		}
		@Pc(474) int local474 = arg11.method5826();
		local157 = arg11.method5827();
		local163 = arg11.method5834();
		if (local163 < local429) {
			local163 = local429;
		}
		if (local474 < local426) {
			local474 = local426;
		}
		if (local431 < local157) {
			local157 = local431;
		}
		local167 = arg11.method5853();
		if (local151 < local167) {
			local167 = local151;
		}
		@Pc(513) Class2_Sub9_Sub2 local513 = null;
		if (arg2 != null) {
			@Pc(520) int local520 = arg2.anIntArray197[arg7];
			local513 = Static276.method4760(local520 >> 16);
			arg7 = local520 & 0xFFFF;
		}
		if (local513 == null) {
			local57 = local57.method5810((byte) 3, local11, true);
			local57.method5846((local157 - local474) / 2, 128, (local167 - local163) / 2);
			local57.method5849((local474 + local157) / 2, 0, (local167 + local163) / 2);
		} else {
			local57 = local57.method5810((byte) 3, local11, true);
			local57.method5846((local157 - local474) / 2, 128, (local167 - local163) / 2);
			local57.method5849((local474 + local157) / 2, 0, (local163 + local167) / 2);
			local57.method5844(arg7, local513);
		}
		if (arg4 != 0) {
			local57.method5856(arg4);
		}
		if (arg10 != 0) {
			local57.method5829(arg10);
		}
		if (arg1 != 0) {
			local57.method5849(0, arg1, 0);
		}
		return local57;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
	public static void method4926() {
		Static79.aClass37_2.method3718(Static163.aFloat40, Static149.aFloat38, Static59.aFloat28);
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
	public static void method4928() {
		if (!Static60.aBoolean109) {
			return;
		}
		@Pc(16) Class68 local16 = Static50.method942(Static71.anInt1272, Static310.anInt6128);
		if (local16 != null && local16.anObjectArray21 != null) {
			@Pc(25) Class2_Sub41 local25 = new Class2_Sub41();
			local25.anObjectArray35 = local16.anObjectArray21;
			local25.aClass68_35 = local16;
			Static367.method5890(local25);
		}
		Static60.aBoolean109 = false;
		Static292.anInt5818 = -1;
		Static145.anInt3131 = -1;
		if (local16 != null) {
			Static114.method2241(local16);
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZILclient!lp;IILclient!dr;I)V")
	public static void method4930(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class37 arg4, @OriginalArg(6) int arg5) {
		if (arg0) {
			Static284.aClass46_21.method5016((Static335.anInt6496 - Static284.aClass46_21.method5031()) / 2, (Static25.anInt396 - Static284.aClass46_21.method5022()) / 2);
			Static111.aClass46_9.method5016((Static335.anInt6496 - Static111.aClass46_9.method5031()) / 2, 18);
		}
		arg2.method5233(arg3, -1, Static25.anInt396 / 2 - 26, Static335.anInt6496 / 2, (Static30.aClass172_2 == Static13.aClass172_1 ? Static70.aClass140_28 : Static328.aClass140_156).method4155(Static239.anInt2803));
		@Pc(56) int local56 = Static25.anInt396 / 2 - 18;
		arg4.method3697(Static335.anInt6496 / 2 - 152, local56, 304, 34, arg1, 0);
		arg4.method3697(Static335.anInt6496 / 2 - 151, local56 + 1, 302, 32, 0, 0);
		arg4.method3712(Static335.anInt6496 / 2 - 150, local56 + 2, Static286.anInt5754 * 3, 30, arg5, 0);
		arg4.method3712(Static286.anInt5754 * 3 + Static335.anInt6496 / 2 - 150, local56 - -2, 300 - Static286.anInt5754 * 3, 30, 0, 0);
		arg2.method5233(arg3, -1, Static25.anInt396 / 2 + 4, Static335.anInt6496 / 2, Static319.aString66);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(JZ)V")
	public static void method4931(@OriginalArg(0) long arg0) {
		@Pc(11) int local11 = Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6893 + Static159.anInt2742;
		@Pc(16) int local16 = Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6888 + Static222.anInt6840;
		if (Static98.anInt2002 - local11 < -500 || Static98.anInt2002 - local11 > 500 || Static54.anInt975 - local16 < -500 || Static54.anInt975 - local16 > 500) {
			Static54.anInt975 = local16;
			Static98.anInt2002 = local11;
		}
		@Pc(58) int local58;
		@Pc(66) int local66;
		if (Static98.anInt2002 != local11) {
			local58 = local11 - Static98.anInt2002;
			local66 = (int) (arg0 * (long) local58 / 320L);
			if (local58 <= 0) {
				if (local66 == 0) {
					local66 = -1;
				} else if (local66 < local58) {
					local66 = local58;
				}
			} else if (local66 == 0) {
				local66 = 1;
			} else if (local58 < local66) {
				local66 = local58;
			}
			Static98.anInt2002 += local66;
		}
		if (Static54.anInt975 != local16) {
			local58 = local16 - Static54.anInt975;
			local66 = (int) (arg0 * (long) local58 / 320L);
			if (local58 > 0) {
				if (local66 == 0) {
					local66 = 1;
				} else if (local66 > local58) {
					local66 = local58;
				}
			} else if (local66 == 0) {
				local66 = -1;
			} else if (local66 < local58) {
				local66 = local58;
			}
			Static54.anInt975 += local66;
		}
		if (!Static311.aBoolean549) {
			Static99.aFloat33 += (float) arg0 * Static90.aFloat32 / 6.0F;
			Static366.aFloat48 += Static145.aFloat37 * (float) arg0 / 6.0F;
		}
		Static255.method4486();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)Lclient!bg;")
	public static Class22 method4932() {
		try {
			return (Class22) Class.forName("Class22_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIII)V")
	public static void method4933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static26.anIntArrayArray35 != null) {
			Static26.anIntArrayArray35[arg0][arg1] = (arg3 & 0x7F8) << 21 | arg2 & 0xFFFFFF;
		}
	}
}
