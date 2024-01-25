import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
	public static int anInt1967 = 0;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)V")
	public static void method1614(@OriginalArg(0) int arg0) {
		if (Static25.anInt424 == 0) {
			Static398.aClass1_Sub5_Sub4_4.method4473(arg0);
		} else {
			Static105.anInt2081 = arg0;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!qf;)V")
	public static void method1618(@OriginalArg(1) Class1_Sub14_Sub2 arg0) {
		arg0.method4567();
		@Pc(12) int local12 = Static179.anInt3373;
		@Pc(22) Class47_Sub1_Sub5_Sub2 local22 = Static255.aClass47_Sub1_Sub5_Sub2_2 = Static362.aClass47_Sub1_Sub5_Sub2Array1[local12] = new Class47_Sub1_Sub5_Sub2();
		local22.anInt5358 = local12;
		@Pc(30) int local30 = arg0.method4557(30);
		@Pc(35) byte local35 = (byte) (local30 >> 28);
		@Pc(41) int local41 = local30 >> 14 & 0x3FFF;
		local22.anIntArray407[0] = local41 - Static190.anInt3507;
		@Pc(53) int local53 = local30 & 0x3FFF;
		local22.anInt7060 = (local22.anIntArray407[0] << 7) + (local22.method4317() << 6);
		local22.anIntArray408[0] = local53 - Static331.anInt6034;
		local22.anInt7066 = (local22.anIntArray408[0] << 7) + (local22.method4317() << 6);
		Static1.anInt41 = local22.aByte97 = local35;
		if (Static31.aClass1_Sub14Array1[local12] != null) {
			local22.method4342(Static31.aClass1_Sub14Array1[local12]);
		}
		Static97.anInt1902 = 0;
		Static105.anIntArray107[Static97.anInt1902++] = local12;
		Static32.aByteArray2[local12] = 0;
		Static323.anInt5633 = 0;
		for (@Pc(125) int local125 = 1; local125 < 2048; local125++) {
			if (local125 != local12) {
				@Pc(135) int local135 = arg0.method4557(18);
				@Pc(139) int local139 = local135 >> 16;
				@Pc(145) int local145 = local135 >> 8 & 0xFF;
				@Pc(149) int local149 = local135 & 0xFF;
				@Pc(157) Class144 local157 = Static212.aClass144Array1[local125] = new Class144();
				local157.anInt3835 = local149 + (local139 << 28) + (local145 << 14);
				local157.anInt3832 = 0;
				local157.aBoolean307 = false;
				local157.anInt3830 = -1;
				Static367.anIntArray495[Static323.anInt5633++] = local125;
				Static32.aByteArray2[local125] = 0;
			}
		}
		arg0.method4559();
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(Z)V")
	public static void method1620() {
		Static425.aBoolean635 = true;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!qa;ILclient!m;III)V")
	public static void method1622(@OriginalArg(1) Class121 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface5 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static346.anInt6354 < 100) {
			Static315.method4332(arg0, arg2);
		}
		arg0.pa(arg5, arg3, arg4 + arg5, arg1 + arg3);
		@Pc(34) int local34;
		@Pc(53) int local53;
		if (Static346.anInt6354 < 100) {
			local34 = arg5 + arg4 / 2;
			arg0.NA(arg5, arg3, arg4, arg1, -16777216, 0);
			local53 = arg3 + arg1 / 2 - 18 - 20;
			arg0.method4639(local34 - 152, local53, 304, 34, Static319.aColorArray6[Static379.anInt6823].getRGB(), 0);
			arg0.NA(local34 - 150, local53 + 2, Static346.anInt6354 * 3, 30, Static429.aColorArray2[Static379.anInt6823].getRGB(), 0);
			Static237.aClass4_5.method5840(Static403.aColorArray7[Static379.anInt6823].getRGB(), local53 + 20, -1, local34, Static92.aClass96_33.method1935(Static389.anInt7061));
			return;
		}
		@Pc(109) int local109 = Static347.anInt6358 - (int) ((float) arg4 / Static350.aFloat113);
		local34 = Static39.anInt620 + (int) ((float) arg1 / Static350.aFloat113);
		local53 = (int) ((float) arg4 / Static350.aFloat113) + Static347.anInt6358;
		Static239.anInt4208 = Static347.anInt6358 - (int) ((float) arg4 / Static350.aFloat113);
		Static204.anInt3638 = (int) ((float) (arg1 * 2) / Static350.aFloat113);
		Static205.anInt4952 = (int) ((float) (arg4 * 2) / Static350.aFloat113);
		@Pc(158) int local158 = Static39.anInt620 - (int) ((float) arg1 / Static350.aFloat113);
		Static264.anInt4473 = Static39.anInt620 - (int) ((float) arg1 / Static350.aFloat113);
		Static350.method5179(local109 + Static350.anInt6639, Static350.anInt6636 + local34, local53 + Static350.anInt6639, Static350.anInt6636 + local158, arg5, arg3, arg4 + arg5, arg3 - -arg1 + 1);
		Static350.method5197(arg0);
		@Pc(201) Class142 local201 = Static350.method5198(arg0);
		Static103.method1645(arg0, local201);
		if (Static309.anInt5223 > 0) {
			Static203.anInt2040--;
			if (Static203.anInt2040 == 0) {
				Static309.anInt5223--;
				Static203.anInt2040 = 20;
			}
		}
		if (!Static356.aBoolean529) {
			return;
		}
		@Pc(233) int local233 = arg5 + arg4 - 5;
		@Pc(239) int local239 = arg3 + arg1 - 8;
		Static199.aClass4_4.method5841(local239, local233, 16776960, "Fps:" + Static270.anInt2352);
		@Pc(254) int local254 = local239 - 15;
		@Pc(256) Runtime local256 = Runtime.getRuntime();
		@Pc(266) int local266 = (int) ((local256.totalMemory() - local256.freeMemory()) / 1024L);
		@Pc(268) int local268 = 16776960;
		if (local266 > 65536) {
			local268 = 16711680;
		}
		Static199.aClass4_4.method5841(local254, local233, local268, "Mem:" + local266 + "k");
		local239 = local254 - 15;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILjava/lang/Object;Z)[B")
	public static byte[] method1623(@OriginalArg(1) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return arg1 ? Static46.method1760(local13) : local13;
		} else if (arg0 instanceof Class98) {
			@Pc(27) Class98 local27 = (Class98) arg0;
			return local27.method2918();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!qa;IZIIIIILclient!dn;IIIILclient!c;)Lclient!c;")
	public static Class37 method1625(@OriginalArg(0) int arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class58 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class37 arg13) {
		if (arg13 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg8 != null) {
			local11 = arg8.method1133(-1, false, arg10) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(48) long local48 = ((long) arg12 << 48) + (long) ((arg11 << 24) + (arg5 << 16) + arg7) + ((long) arg6 << 32);
		@Pc(50) Class151 local50 = Static34.aClass151_21;
		@Pc(58) Class37 local58;
		synchronized (Static34.aClass151_21) {
			local58 = (Class37) Static34.aClass151_21.method3288(local48);
		}
		@Pc(159) int local159;
		@Pc(165) int local165;
		@Pc(171) int local171;
		@Pc(175) int local175;
		if (local58 == null || arg1.method4634(local58.n(), local11) != 0) {
			if (local58 != null) {
				local11 = arg1.method4643(local11, local58.n());
			}
			@Pc(98) byte local98;
			if (arg7 == 1) {
				local98 = 9;
			} else if (arg7 == 2) {
				local98 = 12;
			} else if (arg7 == 3) {
				local98 = 15;
			} else if (arg7 == 4) {
				local98 = 18;
			} else {
				local98 = 21;
			}
			@Pc(132) int[] local132 = new int[] { 64, 96, 128 };
			@Pc(150) Class155 local150 = new Class155(local98 * 3 + 1, -local98 + local98 * 2 * 3, 0);
			local159 = local150.method3392(0, 0, 0);
			@Pc(163) int[][] local163 = new int[3][local98];
			@Pc(177) int local177;
			@Pc(201) int local201;
			for (local165 = 0; local165 < 3; local165++) {
				local171 = local132[local165];
				local175 = local132[local165];
				for (local177 = 0; local177 < local98; local177++) {
					@Pc(185) int local185 = (local177 << 14) / local98;
					@Pc(193) int local193 = Class262.anIntArray575[local185] * local171 >> 15;
					local201 = local175 * Class262.anIntArray576[local185] >> 15;
					local163[local165][local177] = local150.method3392(local201, 0, local193);
				}
			}
			for (local171 = 0; local171 < 3; local171++) {
				local175 = (local171 * 256 + 128) / 3;
				local177 = 256 - local175;
				@Pc(252) byte local252 = (byte) (local175 * arg11 + local177 * arg5 >> 8);
				@Pc(297) short local297 = (short) ((local175 * (arg12 & 0x7F) + (arg6 & 0x7F) * local177 & 0x7F00) + ((arg6 & 0xFC00) * local177 + (arg12 & 0xFC00) * local175 & 0xFC0000) + (local177 * (arg6 & 0x380) + local175 * (arg12 & 0x380) & 0x38000) >> 8);
				for (local201 = 0; local201 < local98; local201++) {
					if (local171 == 0) {
						local150.method3404(local159, (byte) 1, (byte) -1, (short) -1, local163[0][(local201 + 1) % local98], local163[0][local201], local252, local297);
					} else {
						local150.method3404(local163[local171 - 1][local201], (byte) 1, (byte) -1, (short) -1, local163[local171 - 1][(local201 + 1) % local98], local163[local171][(local201 + 1) % local98], local252, local297);
						local150.method3404(local163[local171 - 1][local201], (byte) 1, (byte) -1, (short) -1, local163[local171][(local201 + 1) % local98], local163[local171][local201], local252, local297);
					}
				}
			}
			local58 = arg1.method4617(local150, local11, Static270.anInt2351, 64, 768);
			@Pc(424) Class151 local424 = Static34.aClass151_21;
			synchronized (Static34.aClass151_21) {
				Static34.aClass151_21.method3291(local48, local58);
			}
		}
		@Pc(450) int local450 = (arg7 << 6) - 1;
		@Pc(453) int local453 = -local450;
		@Pc(456) int local456 = -local450;
		@Pc(458) int local458 = local450;
		local159 = local450;
		if (arg2) {
			if (arg4 > 13312 || arg4 < 3072) {
				local456 -= 128;
			}
			if (arg4 > 9216 && arg4 < 15360) {
				local458 = local450 + 128;
			}
			if (arg4 > 5120 && arg4 < 11264) {
				local159 = local450 + 128;
			}
			if (arg4 > 1024 && arg4 < 7168) {
				local453 -= 128;
			}
		}
		@Pc(503) int local503 = arg13.la();
		local165 = arg13.VA();
		local171 = arg13.X();
		if (local503 < local453) {
			local503 = local453;
		}
		if (local458 < local165) {
			local165 = local458;
		}
		if (local171 < local456) {
			local171 = local456;
		}
		local175 = arg13.C();
		if (local175 > local159) {
			local175 = local159;
		}
		@Pc(546) Class1_Sub1_Sub16 local546 = null;
		if (arg8 != null) {
			@Pc(553) int local553 = arg8.anIntArray65[arg10];
			local546 = Static322.aClass45_5.method689(local553 >> 16);
			arg10 = local553 & 0xFFFF;
		}
		if (local546 == null) {
			local58 = local58.method4155((byte) 3, local11, true);
			local58.XA(local165 - local503 >> 1, 128, local175 - local171 >> 1);
			local58.ja(local165 + local503 >> 1, 0, local175 + local171 >> 1);
		} else {
			local58 = local58.method4155((byte) 3, local11, true);
			local58.XA(local165 - local503 >> 1, 128, local175 - local171 >> 1);
			local58.ja(local503 + local165 >> 1, 0, local175 + local171 >> 1);
			local58.method4162(local546, arg10);
		}
		if (arg9 != 0) {
			local58.WA(arg9);
		}
		if (arg0 != 0) {
			local58.o(arg0);
		}
		if (arg3 != 0) {
			local58.ja(0, arg3, 0);
		}
		return local58;
	}
}
