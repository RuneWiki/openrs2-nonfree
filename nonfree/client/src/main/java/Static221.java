import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "Lclient!sn;")
	public static Class188 aClass188_1;

	@OriginalMember(owner = "client!ns", name = "h", descriptor = "Lclient!mo;")
	public static Class143 aClass143_82;

	@OriginalMember(owner = "client!ns", name = "j", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZLclient!mo;ILclient!mo;)V")
	public static void method3970(@OriginalArg(1) Class143 arg0, @OriginalArg(3) Class143 arg1) {
		Static337.aClass143_113 = arg1;
		Static129.aClass143_60 = arg0;
		Static270.aBoolean345 = true;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	public static String method3972(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(16) int local16 = arg1.indexOf(arg2); local16 != -1; local16 = arg1.indexOf(arg2, arg0.length() + local16)) {
			arg1 = arg1.substring(0, local16) + arg0 + arg1.substring(local16 + arg2.length());
		}
		return arg1;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIZ)I")
	public static int method3973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == arg2) {
			return arg2;
		}
		@Pc(17) int local17 = 128 - arg1;
		@Pc(36) int local36 = (arg0 & 0x7F) * arg1 + (arg2 & 0x7F) * local17 >> 7;
		@Pc(50) int local50 = arg1 * (arg0 & 0x380) + (arg2 & 0x380) * local17 >> 7;
		@Pc(64) int local64 = (arg0 & 0xFC00) * arg1 + (arg2 & 0xFC00) * local17 >> 7;
		return local50 & 0x380 | local64 & 0xFC00 | local36 & 0x7F;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)V")
	public static void method3974() {
		@Pc(5) Class11 local5 = Static277.aClass11_121;
		synchronized (Static277.aClass11_121) {
			Static277.aClass11_121.method214();
		}
		local5 = Static191.aClass11_86;
		synchronized (Static191.aClass11_86) {
			Static191.aClass11_86.method214();
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZIBLclient!e;[Lclient!fn;Lclient!lf;)V")
	public static void method3975(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class46 arg2, @OriginalArg(4) Class65[] arg3, @OriginalArg(5) Class114 arg4) {
		@Pc(9) int local9;
		@Pc(13) int local13;
		@Pc(27) int local27;
		if (!arg0) {
			for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
				for (local9 = 0; local9 < Static195.anInt3965; local9++) {
					for (local13 = 0; local13 < Static298.anInt5716; local13++) {
						if ((Static108.aByteArrayArrayArray5[local5][local9][local13] & 0x1) != 0) {
							local27 = local5;
							if ((Static108.aByteArrayArrayArray5[1][local9][local13] & 0x2) != 0) {
								local27 = local5 - 1;
							}
							if (local27 >= 0) {
								arg3[local27].method2122(local9, local13);
							}
						}
					}
				}
			}
		}
		@Pc(83) int[][] local83 = new int[Static195.anInt3965][Static298.anInt5716];
		for (local9 = 0; local9 < arg1; local9++) {
			for (local13 = 0; local13 < Static298.anInt5716; local13++) {
				Static210.anIntArray377[local13] = 0;
				Static47.anIntArray67[local13] = 0;
				Static101.anIntArray209[local13] = 0;
				Static277.anIntArray476[local13] = 0;
				Static302.anIntArray529[local13] = 0;
			}
			for (local27 = -5; local27 < Static195.anInt3965; local27++) {
				@Pc(131) int local131;
				@Pc(144) int local144;
				@Pc(207) int local207;
				for (@Pc(125) int local125 = 0; local125 < Static298.anInt5716; local125++) {
					local131 = local27 + 5;
					@Pc(188) int local188;
					if (local131 < Static195.anInt3965) {
						local144 = Static208.aByteArrayArrayArray8[local9][local131][local125] & 0xFF;
						if (local144 > 0) {
							@Pc(152) Class48 local152 = Static354.method5983(local144 - 1);
							Static210.anIntArray377[local125] += local152.anInt1632;
							Static47.anIntArray67[local125] += local152.anInt1639;
							Static101.anIntArray209[local125] += local152.anInt1637;
							Static277.anIntArray476[local125] += local152.anInt1625;
							local188 = Static302.anIntArray529[local125]++;
						}
					}
					local144 = local27 - 5;
					if (local144 >= 0) {
						local207 = Static208.aByteArrayArrayArray8[local9][local144][local125] & 0xFF;
						if (local207 > 0) {
							@Pc(218) Class48 local218 = Static354.method5983(local207 - 1);
							Static210.anIntArray377[local125] -= local218.anInt1632;
							Static47.anIntArray67[local125] -= local218.anInt1639;
							Static101.anIntArray209[local125] -= local218.anInt1637;
							Static277.anIntArray476[local125] -= local218.anInt1625;
							local188 = Static302.anIntArray529[local125]--;
						}
					}
				}
				if (local27 >= 0) {
					local131 = 0;
					local144 = 0;
					local207 = 0;
					@Pc(274) int local274 = 0;
					@Pc(276) int local276 = 0;
					for (@Pc(278) int local278 = -5; local278 < Static298.anInt5716; local278++) {
						@Pc(284) int local284 = local278 + 5;
						if (Static298.anInt5716 > local284) {
							local144 += Static47.anIntArray67[local284];
							local131 += Static210.anIntArray377[local284];
							local276 += Static302.anIntArray529[local284];
							local207 += Static101.anIntArray209[local284];
							local274 += Static277.anIntArray476[local284];
						}
						@Pc(321) int local321 = local278 - 5;
						if (local321 >= 0) {
							local144 -= Static47.anIntArray67[local321];
							local274 -= Static277.anIntArray476[local321];
							local207 -= Static101.anIntArray209[local321];
							local131 -= Static210.anIntArray377[local321];
							local276 -= Static302.anIntArray529[local321];
						}
						if (local278 >= 0 && local274 > 0 && local276 > 0) {
							local83[local27][local278] = Static322.method5557(local131 * 256 / local274, local207 / local276, local144 / local276);
						}
					}
				}
			}
			Static100.method2242(arg2, Static208.aByteArrayArrayArray8[local9], arg4, Static300.aByteArrayArrayArray14[local9], Static21.aByteArrayArrayArray4[local9], Static263.aByteArrayArrayArray11[local9], local9, local83, arg0, Static195.anInt3965, Static158.aClass114Array2[local9], Static298.anInt5716);
			Static208.aByteArrayArrayArray8[local9] = null;
			Static263.aByteArrayArrayArray11[local9] = null;
			Static21.aByteArrayArrayArray4[local9] = null;
			Static300.aByteArrayArrayArray14[local9] = null;
		}
		if (!arg0) {
			if (Static9.aBoolean10) {
				Static160.method3102();
			}
			if (Static109.anInt2428 != 0) {
				Static34.method3924();
			}
		}
		for (local13 = 0; local13 < arg1; local13++) {
			Static158.aClass114Array2[local13].method3599();
		}
	}
}
