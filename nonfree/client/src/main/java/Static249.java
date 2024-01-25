import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "[[I")
	public static int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "Lclient!fl;")
	public static Class75 aClass75_2;

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "Lclient!cq;")
	public static Class39 aClass39_1;

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "[I")
	public static final int[] anIntArray557 = new int[200];

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "I")
	public static int anInt4494 = 0;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method3984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class227 local7 = Static297.aClass227ArrayArrayArray7[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class164 local13 = local7.aClass164_25; local13 != null; local13 = local13.aClass164_19) {
			@Pc(17) Class12_Sub1 local17 = local13.aClass12_Sub1_2;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort97 == arg1 && local17.aShort94 == arg2) {
				Static385.method5712(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIBLclient!vp;I)V")
	public static void method3985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2_Sub42 arg3, @OriginalArg(5) int arg4) {
		if (arg3.anInt6543 == -1 && arg3.anIntArray788 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		@Pc(22) int local22 = Static16.anInt400 * arg3.anInt6539 >> 8;
		if (arg3.anInt6541 < arg1) {
			local15 = arg1 - arg3.anInt6541;
		} else if (arg3.anInt6542 > arg1) {
			local15 = arg3.anInt6542 - arg1;
		}
		if (arg3.anInt6545 < arg2) {
			local15 += arg2 - arg3.anInt6545;
		} else if (arg2 < arg3.anInt6536) {
			local15 += arg3.anInt6536 - arg2;
		}
		if (arg3.anInt6535 == 0 || local15 - 64 > arg3.anInt6535 || Static16.anInt400 == 0 || arg0 != arg3.anInt6534) {
			if (arg3.aClass2_Sub2_Sub2_2 != null) {
				Static339.aClass2_Sub2_Sub1_2.method110(arg3.aClass2_Sub2_Sub2_2);
				arg3.aClass2_Sub2_Sub2_2 = null;
			}
			if (arg3.aClass2_Sub2_Sub2_3 != null) {
				Static339.aClass2_Sub2_Sub1_2.method110(arg3.aClass2_Sub2_Sub2_3);
				arg3.aClass2_Sub2_Sub2_3 = null;
			}
			return;
		}
		local15 -= 64;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(142) int local142 = local22 * (arg3.anInt6535 - local15) / arg3.anInt6535;
		if (arg3.aClass2_Sub2_Sub2_2 != null) {
			arg3.aClass2_Sub2_Sub2_2.method3191(local142);
		} else if (arg3.anInt6543 >= 0) {
			@Pc(160) Class236 local160 = Static405.method5537(Static14.aClass71_1, arg3.anInt6543, 0);
			if (local160 != null) {
				@Pc(167) Class2_Sub4_Sub1 local167 = local160.method5539().method939(Static154.aClass76_1);
				@Pc(172) Class2_Sub2_Sub2 local172 = Static398.method3187(local167, local142);
				local172.method3196(-1);
				Static339.aClass2_Sub2_Sub1_2.method112(local172);
				arg3.aClass2_Sub2_Sub2_2 = local172;
			}
		}
		if (arg3.aClass2_Sub2_Sub2_3 != null) {
			arg3.aClass2_Sub2_Sub2_3.method3191(local142);
			if (!arg3.aClass2_Sub2_Sub2_3.method5744()) {
				arg3.aClass2_Sub2_Sub2_3 = null;
			}
		} else if (arg3.anIntArray788 != null && (arg3.anInt6544 -= arg4) <= 0) {
			@Pc(216) int local216 = (int) ((double) arg3.anIntArray788.length * Math.random());
			@Pc(224) Class236 local224 = Static405.method5537(Static14.aClass71_1, arg3.anIntArray788[local216], 0);
			if (local224 != null) {
				@Pc(231) Class2_Sub4_Sub1 local231 = local224.method5539().method939(Static154.aClass76_1);
				@Pc(236) Class2_Sub2_Sub2 local236 = Static398.method3187(local231, local142);
				local236.method3196(0);
				Static339.aClass2_Sub2_Sub1_2.method112(local236);
				arg3.anInt6544 = arg3.anInt6537 + (int) (Math.random() * (double) (arg3.anInt6546 - arg3.anInt6537));
				arg3.aClass2_Sub2_Sub2_3 = local236;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V")
	public static void method3986(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = Static295.anInt5281 - Static144.anInt2614;
		if (local7 >= 100) {
			Static283.anInt5017 = 1;
			return;
		}
		@Pc(26) int local26 = (int) Static295.aFloat73;
		if (Static369.anInt6437 >> 8 > local26) {
			local26 = Static369.anInt6437 >> 8;
		}
		if (Static57.aBooleanArray108[4] && Static318.anIntArray570[4] + 128 > local26) {
			local26 = Static318.anIntArray570[4] + 128;
		}
		@Pc(60) int local60 = (int) Static18.aFloat8 + Static303.anInt5443 & 0x3FFF;
		Static355.method5389(Static301.anInt5428, arg0, Static243.anInt4394, local26, local60, Static18.method508(Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6317, Static331.anInt5804, Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6328) - 50, 600 - -((local26 >> 3) * 3));
		@Pc(103) float local103 = 1.0F - (float) ((100 - local7) * (-local7 + 100) * (100 - local7)) / 1000000.0F;
		Static160.anInt2915 = (int) ((float) Static283.anInt5014 + local103 * (float) (Static160.anInt2915 - Static283.anInt5014));
		Static71.anInt1354 = (int) ((float) (Static71.anInt1354 - Static266.anInt4685) * local103 + (float) Static266.anInt4685);
		Static278.anInt1556 = (int) (local103 * (float) (Static278.anInt1556 - Static285.anInt5066) + (float) Static285.anInt5066);
		Static22.anInt547 = (int) ((float) (Static22.anInt547 - Static26.anInt620) * local103 + (float) Static26.anInt620);
		@Pc(153) int local153 = Static392.anInt6749 - Static309.anInt5489;
		if (local153 > 8192) {
			local153 -= 16384;
		} else if (local153 < -8192) {
			local153 += 16384;
		}
		Static392.anInt6749 = (int) ((float) local153 * local103 + (float) Static309.anInt5489);
		Static392.anInt6749 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)Lclient!lk;")
	public static Class2_Sub13 method3988() {
		@Pc(8) Class2_Sub13 local8 = new Class2_Sub13(38);
		local8.method4207(15);
		local8.method4207(Static146.anInt2670);
		local8.method4207(Static335.aBoolean450 ? 1 : 0);
		local8.method4207(Static136.aBoolean194 ? 1 : 0);
		local8.method4207(Static364.aBoolean378 ? 1 : 0);
		local8.method4207(Static264.aBoolean341 ? 1 : 0);
		local8.method4207(0);
		local8.method4207(Static364.aBoolean379 ? 1 : 0);
		local8.method4207(Static158.aBoolean211 ? 1 : 0);
		local8.method4207(Static80.aBoolean128 ? 1 : 0);
		local8.method4207(Static193.anInt6663);
		local8.method4207(Static37.aBoolean52 ? 1 : 0);
		local8.method4207(Static194.aBoolean254 ? 1 : 0);
		local8.method4207(Static116.aBoolean177 ? 1 : 0);
		local8.method4207(Static1.anInt41);
		local8.method4207(Static265.aBoolean343 ? 1 : 0);
		local8.method4207(Static107.anInt2129);
		local8.method4207(Static193.anInt6666);
		local8.method4207(Static16.anInt400);
		local8.method4199(Static123.anInt2360);
		local8.method4199(Static11.anInt3910);
		local8.method4207(Static142.method3057());
		local8.method4218(Static37.anInt767);
		local8.method4207(Static365.anInt2296);
		local8.method4207(Static117.aBoolean178 ? 1 : 0);
		local8.method4207(Static223.aBoolean308 ? 1 : 0);
		local8.method4207(Static301.anInt5429);
		local8.method4207(Static168.aBoolean222 ? 1 : 0);
		local8.method4207(Static180.aBoolean232 ? 1 : 0);
		local8.method4207(Static235.anInt4315);
		local8.method4207(Static265.aBoolean344 ? 1 : 0);
		local8.method4207(Static193.anInt6668);
		local8.method4207(Static244.anInt1013);
		return local8;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method3989(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		Static193.aClass71_90.anInt1745 = 1;
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static106.aClass250_1.anInt6708; local18++) {
			@Pc(25) Class117 local25 = Static106.aClass250_1.method5735(local18);
			if ((!arg1 || local25.aBoolean209) && local25.anInt2884 == -1 && local25.anInt2829 == -1 && local25.anInt2868 == 0 && local25.aString27.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static134.anInt2480 = -1;
					Static240.aShortArray86 = null;
					return;
				}
				if (local16 >= local14.length) {
					@Pc(74) short[] local74 = new short[local14.length * 2];
					for (@Pc(76) int local76 = 0; local76 < local16; local76++) {
						local74[local76] = local14[local76];
					}
					local14 = local74;
				}
				local14[local16++] = (short) local18;
			}
		}
		Static240.aShortArray86 = local14;
		Static134.anInt2480 = local16;
		Static149.anInt2704 = 0;
		@Pc(114) String[] local114 = new String[Static134.anInt2480];
		for (@Pc(116) int local116 = 0; local116 < Static134.anInt2480; local116++) {
			local114[local116] = Static106.aClass250_1.method5735(local14[local116]).aString27;
		}
		Static317.method4924(Static240.aShortArray86, local114);
		Static193.aClass71_90.method1567();
		Static193.aClass71_90.anInt1745 = 2;
	}
}
