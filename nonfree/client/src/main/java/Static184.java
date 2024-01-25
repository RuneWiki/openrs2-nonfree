import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
	public static int anInt3721;

	@OriginalMember(owner = "client!lq", name = "s", descriptor = "[I")
	public static int[] anIntArray281;

	@OriginalMember(owner = "client!lq", name = "n", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_65 = new Class117("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!lq", name = "p", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!lq", name = "q", descriptor = "S")
	public static short aShort60 = 256;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!nq;I)V")
	public static void method3183(@OriginalArg(0) Class144 arg0) {
		Static136.aClass144_109 = arg0;
		Static79.anInt5244 = Static136.aClass144_109.method3890(16);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Ljava/lang/String;BC)I")
	public static int method3186(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(5) int local5 = 0;
		@Pc(8) int local8 = arg0.length();
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (arg0.charAt(local10) == arg1) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZILclient!uo;Z[[I)V")
	public static void method3188(@OriginalArg(1) int arg0, @OriginalArg(2) Class129 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[][] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			@Pc(13) int[][] local13;
			@Pc(25) int local25;
			@Pc(29) int local29;
			if (arg3 == null) {
				local13 = null;
			} else {
				local13 = new int[Static24.anInt454 + 1][Static240.anInt4832 + 1];
				for (local25 = 0; local25 <= Static240.anInt4832; local25++) {
					for (local29 = 0; local29 <= Static24.anInt454; local29++) {
						local13[local29][local25] = Static263.anIntArrayArrayArray13[local7][local29][local25] - arg3[local29][local25];
					}
				}
			}
			local25 = 0;
			local29 = 0;
			if (!arg2) {
				if (Static36.aBoolean36) {
					local29 = 8;
				}
				if (Static52.aBoolean313) {
					local25 = 2;
				}
				if (Static103.anInt1883 != 0) {
					if (local7 == 0 || Static355.anInt6753 >= 96) {
						local29 |= 0x10;
					}
					local25 |= 0x1;
				}
			}
			if (Static52.aBoolean313) {
				local29 |= 0x7;
			}
			@Pc(115) Class77 local115 = arg1.method4948(Static24.anInt454, Static240.anInt4832, Static263.anIntArrayArrayArray13[local7], local13, local25, local29);
			Static338.method5538(local7, local115);
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)I")
	public static int method3190(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)Z")
	public static boolean method3191() throws IOException {
		if (Static291.aClass156_103 == null) {
			return false;
		}
		@Pc(15) int local15 = Static291.aClass156_103.method4193();
		if (local15 == 0) {
			return false;
		}
		if (Static34.anInt635 == -1) {
			Static291.aClass156_103.method4189(1, Static246.aClass11_Sub25_Sub1_3.aByteArray93, 0);
			Static246.aClass11_Sub25_Sub1_3.anInt6076 = 0;
			Static34.anInt635 = Static246.aClass11_Sub25_Sub1_3.method2465();
			local15--;
			Static315.anInt6163 = Static142.anIntArray184[Static34.anInt635];
		}
		if (Static315.anInt6163 == -1) {
			if (local15 <= 0) {
				return false;
			}
			Static291.aClass156_103.method4189(1, Static246.aClass11_Sub25_Sub1_3.aByteArray93, 0);
			Static315.anInt6163 = Static246.aClass11_Sub25_Sub1_3.aByteArray93[0] & 0xFF;
			local15--;
		}
		if (Static315.anInt6163 == -2) {
			if (local15 <= 1) {
				return false;
			}
			Static291.aClass156_103.method4189(2, Static246.aClass11_Sub25_Sub1_3.aByteArray93, 0);
			Static246.aClass11_Sub25_Sub1_3.anInt6076 = 0;
			Static315.anInt6163 = Static246.aClass11_Sub25_Sub1_3.method5187();
			local15 -= 2;
		}
		if (Static315.anInt6163 > local15) {
			return false;
		}
		Static246.aClass11_Sub25_Sub1_3.anInt6076 = 0;
		Static291.aClass156_103.method4189(Static315.anInt6163, Static246.aClass11_Sub25_Sub1_3.aByteArray93, 0);
		Static132.anInt2475 = Static196.anInt4002;
		Static172.anInt3428 = 0;
		Static196.anInt4002 = Static153.anInt2900;
		Static153.anInt2900 = Static34.anInt635;
		@Pc(132) int local132;
		@Pc(136) int local136;
		@Pc(140) int local140;
		if (Static34.anInt635 == 44) {
			local132 = Static246.aClass11_Sub25_Sub1_3.method5201();
			local136 = Static246.aClass11_Sub25_Sub1_3.method5187();
			local140 = Static246.aClass11_Sub25_Sub1_3.method5198();
			if (Static2.method4(local132)) {
				Static275.method4654(local140, local136);
			}
			Static34.anInt635 = -1;
			return true;
		}
		@Pc(171) String local171;
		if (Static34.anInt635 == 210) {
			local132 = Static246.aClass11_Sub25_Sub1_3.method5218();
			local136 = Static246.aClass11_Sub25_Sub1_3.method5187();
			local171 = Static246.aClass11_Sub25_Sub1_3.method5184();
			if (Static2.method4(local136)) {
				Static202.method3625(local132, local171);
			}
			Static34.anInt635 = -1;
			return true;
		} else if (Static34.anInt635 == 237) {
			Static264.anInt5400 = Static246.aClass11_Sub25_Sub1_3.method5185();
			for (local132 = 0; local132 < Static264.anInt5400; local132++) {
				Static110.aStringArray34[local132] = Static246.aClass11_Sub25_Sub1_3.method5184();
				Static92.aStringArray11[local132] = Static246.aClass11_Sub25_Sub1_3.method5184();
				if (Static92.aStringArray11[local132].equals("")) {
					Static92.aStringArray11[local132] = Static110.aStringArray34[local132];
				}
				Static348.aStringArray52[local132] = Static246.aClass11_Sub25_Sub1_3.method5184();
				Static189.aStringArray5[local132] = Static246.aClass11_Sub25_Sub1_3.method5184();
				if (Static189.aStringArray5[local132].equals("")) {
					Static189.aStringArray5[local132] = Static348.aStringArray52[local132];
				}
				Static144.aBooleanArray12[local132] = false;
			}
			Static30.anInt546 = Static301.anInt5969;
			Static34.anInt635 = -1;
			return true;
		} else if (Static34.anInt635 == 49) {
			local132 = Static246.aClass11_Sub25_Sub1_3.method5215();
			local136 = Static246.aClass11_Sub25_Sub1_3.method5187();
			local140 = Static246.aClass11_Sub25_Sub1_3.method5201();
			if (Static2.method4(local136)) {
				Static141.method2173(local140, local132);
			}
			Static34.anInt635 = -1;
			return true;
		} else {
			@Pc(313) boolean local313;
			@Pc(319) int local319;
			@Pc(323) int local323;
			@Pc(325) int local325;
			if (Static34.anInt635 == 18) {
				local132 = Static246.aClass11_Sub25_Sub1_3.method5187();
				local136 = Static246.aClass11_Sub25_Sub1_3.method5185();
				local313 = (local136 & 0x1) == 1;
				while (Static315.anInt6163 > Static246.aClass11_Sub25_Sub1_3.anInt6076) {
					local319 = Static246.aClass11_Sub25_Sub1_3.method5188();
					local323 = Static246.aClass11_Sub25_Sub1_3.method5187();
					local325 = 0;
					if (local323 != 0) {
						local325 = Static246.aClass11_Sub25_Sub1_3.method5185();
						if (local325 == 255) {
							local325 = Static246.aClass11_Sub25_Sub1_3.method5198();
						}
					}
					Static71.method1075(local319, local313, local325, local132, local323 - 1);
				}
				Static222.anIntArray343[Static197.anInt4032++ & 0x1F] = local132;
				Static34.anInt635 = -1;
				return true;
			} else if (Static34.anInt635 == 25) {
				local132 = Static246.aClass11_Sub25_Sub1_3.method5201();
				local136 = Static246.aClass11_Sub25_Sub1_3.method5218();
				local140 = Static246.aClass11_Sub25_Sub1_3.method5171();
				local319 = Static246.aClass11_Sub25_Sub1_3.method5179();
				local323 = Static246.aClass11_Sub25_Sub1_3.method5201();
				if (Static2.method4(local319)) {
					Static10.method167(local132, local136, local140, local323);
				}
				Static34.anInt635 = -1;
				return true;
			} else if (Static34.anInt635 == 92) {
				local132 = Static246.aClass11_Sub25_Sub1_3.method5198();
				local136 = Static246.aClass11_Sub25_Sub1_3.method5187();
				if (local136 == 65535) {
					local136 = -1;
				}
				local140 = Static246.aClass11_Sub25_Sub1_3.method5187();
				local319 = Static246.aClass11_Sub25_Sub1_3.method5215();
				if (Static2.method4(local140)) {
					Static112.method1684(local132, local136, local319);
					@Pc(447) Class170 local447 = Static283.method4717(local136);
					Static10.method167(local447.anInt5334, local319, local447.anInt5331, local447.anInt5338);
					Static101.method1497(local447.anInt5313, local319, local447.anInt5320, local447.anInt5302);
				}
				Static34.anInt635 = -1;
				return true;
			} else {
				@Pc(493) String local493;
				@Pc(489) boolean local489;
				@Pc(506) long local506;
				@Pc(511) long local511;
				@Pc(515) int local515;
				@Pc(525) int local525;
				if (Static34.anInt635 == 15) {
					local489 = Static246.aClass11_Sub25_Sub1_3.method5185() == 1;
					local493 = Static246.aClass11_Sub25_Sub1_3.method5184();
					local171 = local493;
					if (local489) {
						local171 = Static246.aClass11_Sub25_Sub1_3.method5184();
					}
					local506 = Static246.aClass11_Sub25_Sub1_3.method5187();
					local511 = Static246.aClass11_Sub25_Sub1_3.method5221();
					local515 = Static246.aClass11_Sub25_Sub1_3.method5185();
					@Pc(521) long local521 = (local506 << 32) + local511;
					@Pc(523) boolean local523 = false;
					local525 = 0;
					while (true) {
						if (local525 >= 100) {
							if (local515 <= 1) {
								if (Static174.aBoolean219 && !Static186.aBoolean239 || Static137.aBoolean170) {
									local523 = true;
								} else if (Static350.method5660(local171)) {
									local523 = true;
								}
							}
							break;
						}
						if (Static19.aLongArray3[local525] == local521) {
							local523 = true;
							break;
						}
						local525++;
					}
					if (!local523 && Static25.anInt6264 == 0) {
						Static19.aLongArray3[Static318.anInt6175] = local521;
						Static318.anInt6175 = (Static318.anInt6175 + 1) % 100;
						@Pc(590) String local590 = Static81.method1211(Static153.method2455(Static6.method3582(Static246.aClass11_Sub25_Sub1_3)));
						if (local515 == 2) {
							Static40.method582(local590, "<img=1>" + local493, -1, null, 7, 0, "<img=1>" + local171);
						} else if (local515 == 1) {
							Static40.method582(local590, "<img=0>" + local493, -1, null, 7, 0, "<img=0>" + local171);
						} else {
							Static40.method582(local590, local493, -1, null, 3, 0, local171);
						}
					}
					Static34.anInt635 = -1;
					return true;
				} else if (Static34.anInt635 == 239) {
					Static9.anInt153 = Static246.aClass11_Sub25_Sub1_3.method5185();
					Static34.anInt635 = -1;
					return true;
				} else {
					@Pc(872) int local872;
					@Pc(704) boolean local704;
					@Pc(702) String local702;
					@Pc(879) int local879;
					@Pc(953) String local953;
					@Pc(935) String local935;
					@Pc(971) String local971;
					if (Static34.anInt635 == 47) {
						local489 = Static246.aClass11_Sub25_Sub1_3.method5185() == 1;
						local493 = Static246.aClass11_Sub25_Sub1_3.method5184();
						local171 = Static246.aClass11_Sub25_Sub1_3.method5184();
						local319 = Static246.aClass11_Sub25_Sub1_3.method5187();
						local323 = Static246.aClass11_Sub25_Sub1_3.method5185();
						local702 = "";
						local704 = false;
						if (local319 > 0) {
							local702 = Static246.aClass11_Sub25_Sub1_3.method5184();
							local704 = Static246.aClass11_Sub25_Sub1_3.method5185() == 1;
						}
						for (local515 = 0; local515 < Static20.anInt374; local515++) {
							if (local489) {
								if (local171.equals(Static193.aStringArray30[local515])) {
									Static193.aStringArray30[local515] = local493;
									local493 = null;
									Static272.aStringArray40[local515] = local171;
									break;
								}
							} else if (local493.equals(Static193.aStringArray30[local515])) {
								if (Static16.anIntArray18[local515] != local319) {
									Static16.anIntArray18[local515] = local319;
									if (local319 > 0) {
										Static260.method4521(0, "", 5, "", local493 + Static241.aClass117_82.method2684(Static230.anInt4634));
									}
									if (local319 == 0) {
										Static260.method4521(0, "", 5, "", local493 + Static305.aClass117_101.method2684(Static230.anInt4634));
									}
								}
								Static272.aStringArray40[local515] = local171;
								Static91.aStringArray16[local515] = local702;
								Static152.anIntArray425[local515] = local323;
								local493 = null;
								Static87.aBooleanArray9[local515] = local704;
								break;
							}
						}
						if (local493 != null && Static20.anInt374 < 200) {
							Static193.aStringArray30[Static20.anInt374] = local493;
							Static272.aStringArray40[Static20.anInt374] = local171;
							Static16.anIntArray18[Static20.anInt374] = local319;
							Static91.aStringArray16[Static20.anInt374] = local702;
							Static152.anIntArray425[Static20.anInt374] = local323;
							Static87.aBooleanArray9[Static20.anInt374] = local704;
							Static20.anInt374++;
						}
						Static30.anInt546 = Static301.anInt5969;
						local872 = Static20.anInt374;
						while (local872 > 0) {
							@Pc(876) boolean local876 = true;
							local872--;
							for (local879 = 0; local879 < local872; local879++) {
								if (Static155.anInt2961 != Static16.anIntArray18[local879] && Static155.anInt2961 == Static16.anIntArray18[local879 + 1] || Static16.anIntArray18[local879] == 0 && Static16.anIntArray18[local879 + 1] != 0) {
									local525 = Static16.anIntArray18[local879];
									Static16.anIntArray18[local879] = Static16.anIntArray18[local879 + 1];
									Static16.anIntArray18[local879 + 1] = local525;
									local935 = Static91.aStringArray16[local879];
									Static91.aStringArray16[local879] = Static91.aStringArray16[local879 + 1];
									Static91.aStringArray16[local879 + 1] = local935;
									local953 = Static193.aStringArray30[local879];
									Static193.aStringArray30[local879] = Static193.aStringArray30[local879 + 1];
									Static193.aStringArray30[local879 + 1] = local953;
									local971 = Static272.aStringArray40[local879];
									Static272.aStringArray40[local879] = Static272.aStringArray40[local879 + 1];
									Static272.aStringArray40[local879 + 1] = local971;
									@Pc(989) int local989 = Static152.anIntArray425[local879];
									Static152.anIntArray425[local879] = Static152.anIntArray425[local879 + 1];
									Static152.anIntArray425[local879 + 1] = local989;
									@Pc(1007) boolean local1007 = Static87.aBooleanArray9[local879];
									Static87.aBooleanArray9[local879] = Static87.aBooleanArray9[local879 + 1];
									local876 = false;
									Static87.aBooleanArray9[local879 + 1] = local1007;
								}
							}
							if (local876) {
								break;
							}
						}
						Static34.anInt635 = -1;
						return true;
					} else if (Static34.anInt635 == 60) {
						Static105.method1610();
						Static34.anInt635 = -1;
						return true;
					} else if (Static34.anInt635 == 145) {
						local132 = Static246.aClass11_Sub25_Sub1_3.method5185();
						if (Static246.aClass11_Sub25_Sub1_3.method5185() == 0) {
							Static124.aClass116Array1[local132] = new Class116();
						} else {
							Static246.aClass11_Sub25_Sub1_3.anInt6076--;
							Static124.aClass116Array1[local132] = new Class116(Static246.aClass11_Sub25_Sub1_3);
						}
						Static34.anInt635 = -1;
						Static92.anInt1650 = Static301.anInt5969;
						return true;
					} else if (Static34.anInt635 == 0) {
						Static212.anInt4343 = Static246.aClass11_Sub25_Sub1_3.method5185();
						Static34.anInt635 = -1;
						Static46.anInt908 = Static301.anInt5969;
						return true;
					} else if (Static34.anInt635 == 207) {
						local132 = Static246.aClass11_Sub25_Sub1_3.method5198();
						local136 = Static246.aClass11_Sub25_Sub1_3.method5201();
						if (local136 == 65535) {
							local136 = -1;
						}
						local140 = Static246.aClass11_Sub25_Sub1_3.method5171();
						if (Static2.method4(local140)) {
							Static256.method4458(local136, local132);
						}
						Static34.anInt635 = -1;
						return true;
					} else {
						@Pc(1185) long local1185;
						@Pc(1202) Class11_Sub36 local1202;
						@Pc(1191) Class11_Sub36 local1191;
						if (Static34.anInt635 == 16) {
							local132 = Static246.aClass11_Sub25_Sub1_3.method5171();
							if (local132 == 65535) {
								local132 = -1;
							}
							local136 = Static246.aClass11_Sub25_Sub1_3.method5171();
							local140 = Static246.aClass11_Sub25_Sub1_3.method5187();
							if (local140 == 65535) {
								local140 = -1;
							}
							local319 = Static246.aClass11_Sub25_Sub1_3.method5179();
							local323 = Static246.aClass11_Sub25_Sub1_3.method5215();
							if (Static2.method4(local136)) {
								for (local325 = local132; local325 <= local140; local325++) {
									local1185 = ((long) local323 << 32) + (long) local325;
									local1191 = (Class11_Sub36) Static25.aClass58_38.method1009(local1185);
									if (local1191 != null) {
										local1202 = new Class11_Sub36(local1191.anInt5612, local319);
										local1191.method5701();
									} else if (local325 == -1) {
										local1202 = new Class11_Sub36(Static166.method2688(local323).aClass11_Sub36_1.anInt5612, local319);
									} else {
										local1202 = new Class11_Sub36(0, local319);
									}
									Static25.aClass58_38.method1006(local1185, local1202);
								}
							}
							Static34.anInt635 = -1;
							return true;
						} else if (Static34.anInt635 == 37) {
							local132 = Static246.aClass11_Sub25_Sub1_3.method5218();
							local136 = Static246.aClass11_Sub25_Sub1_3.method5201();
							local140 = Static246.aClass11_Sub25_Sub1_3.method5201();
							if (Static2.method4(local136)) {
								Static104.method1589(local132, local140);
							}
							Static34.anInt635 = -1;
							return true;
						} else if (Static34.anInt635 == 6) {
							local132 = Static246.aClass11_Sub25_Sub1_3.method5187();
							local493 = Static246.aClass11_Sub25_Sub1_3.method5184();
							local140 = Static246.aClass11_Sub25_Sub1_3.method5187();
							if (Static2.method4(local140)) {
								Static13.method176(local493, local132);
							}
							Static34.anInt635 = -1;
							return true;
						} else if (Static34.anInt635 == 53) {
							local132 = Static246.aClass11_Sub25_Sub1_3.method5187();
							local136 = Static246.aClass11_Sub25_Sub1_3.method5219();
							Static233.method4161(local132, local136);
							Static34.anInt635 = -1;
							return true;
						} else if (Static34.anInt635 == 155) {
							local132 = Static246.aClass11_Sub25_Sub1_3.method5198();
							Static253.aClass2_8 = Static77.aClass118_7.method2709(local132);
							Static34.anInt635 = -1;
							return true;
						} else if (Static34.anInt635 == 184) {
							local132 = Static246.aClass11_Sub25_Sub1_3.method5171();
							local136 = Static246.aClass11_Sub25_Sub1_3.method5171();
							local140 = Static246.aClass11_Sub25_Sub1_3.method5201();
							local319 = Static246.aClass11_Sub25_Sub1_3.method5218();
							if (Static2.method4(local140)) {
								Static135.method2128(local319, local136 + (local132 << 16));
							}
							Static34.anInt635 = -1;
							return true;
						} else if (Static34.anInt635 == 203) {
							Static107.anInt1990 = Static246.aClass11_Sub25_Sub1_3.method5220();
							Static34.anInt635 = -1;
							Static46.anInt908 = Static301.anInt5969;
							return true;
						} else if (Static34.anInt635 == 125) {
							local132 = Static246.aClass11_Sub25_Sub1_3.method5190();
							local136 = Static246.aClass11_Sub25_Sub1_3.method5200();
							local140 = Static246.aClass11_Sub25_Sub1_3.method5190();
							Static322.anInt6250 = local140 >> 1;
							Static156.aClass67_Sub3_Sub3_Sub2_2.method4384(local132, (local140 & 0x1) == 1, local136, Static322.anInt6250);
							Static34.anInt635 = -1;
							return true;
						} else if (Static34.anInt635 == 176) {
							local132 = Static246.aClass11_Sub25_Sub1_3.method5187();
							local136 = Static246.aClass11_Sub25_Sub1_3.method5198();
							if (Static2.method4(local132)) {
								@Pc(1455) Class11_Sub41 local1455 = (Class11_Sub41) Static197.aClass58_18.method1009((long) local136);
								if (local1455 != null) {
									Static66.method1709(local1455, true, false);
								}
								if (Static242.aClass137_17 != null) {
									Static69.method1039(Static242.aClass137_17);
									Static242.aClass137_17 = null;
								}
							}
							Static34.anInt635 = -1;
							return true;
						} else {
							@Pc(1510) Class11_Sub41 local1510;
							if (Static34.anInt635 == 81) {
								local132 = Static246.aClass11_Sub25_Sub1_3.method5215();
								local136 = Static246.aClass11_Sub25_Sub1_3.method5198();
								local140 = Static246.aClass11_Sub25_Sub1_3.method5171();
								if (Static2.method4(local140)) {
									@Pc(1503) Class11_Sub41 local1503 = (Class11_Sub41) Static197.aClass58_18.method1009((long) local136);
									local1510 = (Class11_Sub41) Static197.aClass58_18.method1009((long) local132);
									if (local1510 != null) {
										Static66.method1709(local1510, local1503 == null || local1510.anInt6364 != local1503.anInt6364, false);
									}
									if (local1503 != null) {
										local1503.method5701();
										Static197.aClass58_18.method1006((long) local132, local1503);
									}
									@Pc(1541) Class137 local1541 = Static166.method2688(local136);
									if (local1541 != null) {
										Static69.method1039(local1541);
									}
									local1541 = Static166.method2688(local132);
									if (local1541 != null) {
										Static69.method1039(local1541);
										Static351.method5429(true, local1541);
									}
									if (Static270.anInt5491 != -1) {
										Static313.method5275(1, Static270.anInt5491);
									}
								}
								Static34.anInt635 = -1;
								return true;
							}
							@Pc(1591) String local1591;
							@Pc(1589) String local1589;
							if (Static34.anInt635 == 72) {
								local132 = Static246.aClass11_Sub25_Sub1_3.method5188();
								local136 = Static246.aClass11_Sub25_Sub1_3.method5198();
								local140 = Static246.aClass11_Sub25_Sub1_3.method5185();
								local1589 = "";
								local1591 = local1589;
								if ((local140 & 0x1) != 0) {
									local1589 = Static246.aClass11_Sub25_Sub1_3.method5184();
									if ((local140 & 0x2) == 0) {
										local1591 = local1589;
									} else {
										local1591 = Static246.aClass11_Sub25_Sub1_3.method5184();
									}
								}
								local702 = Static246.aClass11_Sub25_Sub1_3.method5184();
								if (local132 == 99) {
									Static129.method1991(local702);
								} else if (local1591.equals("") || !Static350.method5660(local1591)) {
									Static260.method4521(local136, local1589, local132, local1591, local702);
								} else {
									Static34.anInt635 = -1;
									return true;
								}
								Static34.anInt635 = -1;
								return true;
							} else if (Static34.anInt635 == 149) {
								Static63.anInt1170 = Static246.aClass11_Sub25_Sub1_3.method5219();
								Static132.anInt2477 = Static246.aClass11_Sub25_Sub1_3.method5185();
								while (Static315.anInt6163 > Static246.aClass11_Sub25_Sub1_3.anInt6076) {
									Static34.anInt635 = Static246.aClass11_Sub25_Sub1_3.method5185();
									Static98.method1463();
								}
								Static34.anInt635 = -1;
								return true;
							} else if (Static34.anInt635 == 252) {
								Static221.anInt4493 = Static246.aClass11_Sub25_Sub1_3.method5185();
								Static266.anInt5457 = Static246.aClass11_Sub25_Sub1_3.method5185();
								Static264.anInt5397 = Static246.aClass11_Sub25_Sub1_3.method5185();
								Static34.anInt635 = -1;
								return true;
							} else if (Static34.anInt635 == 68) {
								Static313.method5272(Static315.anInt6163, Static77.aClass118_7, Static246.aClass11_Sub25_Sub1_3);
								Static34.anInt635 = -1;
								return true;
							} else if (Static34.anInt635 == 180) {
								Static171.method2790();
								Static291.anInt5765 += 32;
								Static34.anInt635 = -1;
								return true;
							} else if (Static34.anInt635 == 236) {
								local132 = Static246.aClass11_Sub25_Sub1_3.method5187();
								local136 = Static246.aClass11_Sub25_Sub1_3.method5185();
								local140 = Static246.aClass11_Sub25_Sub1_3.method5185();
								local319 = Static246.aClass11_Sub25_Sub1_3.method5187();
								local323 = Static246.aClass11_Sub25_Sub1_3.method5185();
								local325 = Static246.aClass11_Sub25_Sub1_3.method5185();
								if (Static2.method4(local132)) {
									Static267.method4623(local323, local140, local136, local325, local319);
								}
								Static34.anInt635 = -1;
								return true;
							} else if (Static34.anInt635 == 183) {
								local132 = Static246.aClass11_Sub25_Sub1_3.method5185();
								local136 = Static246.aClass11_Sub25_Sub1_3.method5171();
								if (Static2.method4(local136)) {
									Static128.anInt2379 = local132;
								}
								Static34.anInt635 = -1;
								return true;
							} else if (Static34.anInt635 == 174) {
								for (local132 = 0; local132 < Static198.anIntArray311.length; local132++) {
									if (Static198.anIntArray311[local132] != Static195.anIntArray342[local132]) {
										Static198.anIntArray311[local132] = Static195.anIntArray342[local132];
										Static259.method4516(local132);
										Static210.anIntArray331[Static291.anInt5765++ & 0x1F] = local132;
									}
								}
								Static34.anInt635 = -1;
								return true;
							} else {
								@Pc(1849) String local1849;
								if (Static34.anInt635 == 84) {
									local1849 = Static246.aClass11_Sub25_Sub1_3.method5184();
									local136 = Static246.aClass11_Sub25_Sub1_3.method5219();
									local140 = Static246.aClass11_Sub25_Sub1_3.method5187();
									if (local140 == 65535) {
										local140 = -1;
									}
									local319 = Static246.aClass11_Sub25_Sub1_3.method5185();
									if (local136 >= 1 && local136 <= 8) {
										if (local1849.equalsIgnoreCase("null")) {
											local1849 = null;
										}
										Static31.aStringArray3[local136 - 1] = local1849;
										Static52.anIntArray372[local136 - 1] = local140;
										Static190.aBooleanArray19[local136 - 1] = local319 == 0;
									}
									Static34.anInt635 = -1;
									return true;
								} else if (Static34.anInt635 == 89) {
									local132 = Static246.aClass11_Sub25_Sub1_3.method5187();
									if (local132 == 65535) {
										local132 = -1;
									}
									local136 = Static246.aClass11_Sub25_Sub1_3.method5185();
									local140 = Static246.aClass11_Sub25_Sub1_3.method5187();
									local319 = Static246.aClass11_Sub25_Sub1_3.method5185();
									Static350.method5656(local132, local319, local136, local140);
									Static34.anInt635 = -1;
									return true;
								} else if (Static34.anInt635 == 200) {
									local132 = Static246.aClass11_Sub25_Sub1_3.method5187();
									if (Static2.method4(local132)) {
										Static49.method712();
									}
									Static34.anInt635 = -1;
									return true;
								} else if (Static34.anInt635 == 233) {
									local132 = Static246.aClass11_Sub25_Sub1_3.method5187();
									local136 = Static246.aClass11_Sub25_Sub1_3.method5185();
									local140 = Static246.aClass11_Sub25_Sub1_3.method5185();
									local319 = Static246.aClass11_Sub25_Sub1_3.method5185();
									local323 = Static246.aClass11_Sub25_Sub1_3.method5185();
									local325 = Static246.aClass11_Sub25_Sub1_3.method5187();
									if (Static2.method4(local132)) {
										Static311.aBooleanArray4[local136] = true;
										Static265.anIntArray410[local136] = local140;
										Static43.anIntArray62[local136] = local319;
										Static9.anIntArray13[local136] = local323;
										Static87.anIntArray105[local136] = local325;
									}
									Static34.anInt635 = -1;
									return true;
								} else {
									@Pc(2066) long local2066;
									if (Static34.anInt635 == 148) {
										local489 = Static246.aClass11_Sub25_Sub1_3.method5185() == 1;
										local493 = Static246.aClass11_Sub25_Sub1_3.method5184();
										local171 = local493;
										if (local489) {
											local171 = Static246.aClass11_Sub25_Sub1_3.method5184();
										}
										local506 = Static246.aClass11_Sub25_Sub1_3.method5174();
										local511 = Static246.aClass11_Sub25_Sub1_3.method5187();
										local2066 = Static246.aClass11_Sub25_Sub1_3.method5221();
										local872 = Static246.aClass11_Sub25_Sub1_3.method5185();
										local879 = Static246.aClass11_Sub25_Sub1_3.method5187();
										@Pc(2081) long local2081 = (local511 << 32) + local2066;
										@Pc(2083) boolean local2083 = false;
										@Pc(2085) int local2085 = 0;
										while (true) {
											if (local2085 >= 100) {
												if (local872 <= 1 && Static350.method5660(local171)) {
													local2083 = true;
												}
												break;
											}
											if (local2081 == Static19.aLongArray3[local2085]) {
												local2083 = true;
												break;
											}
											local2085++;
										}
										if (!local2083 && Static25.anInt6264 == 0) {
											Static19.aLongArray3[Static318.anInt6175] = local2081;
											Static318.anInt6175 = (Static318.anInt6175 + 1) % 100;
											local971 = Static117.method1777(local879).method4596(Static246.aClass11_Sub25_Sub1_3);
											if (local872 == 2) {
												Static40.method582(local971, "<img=1>" + local493, local879, Static6.method3569(local506), 20, 0, "<img=1>" + local171);
											} else if (local872 == 1) {
												Static40.method582(local971, "<img=0>" + local493, local879, Static6.method3569(local506), 20, 0, "<img=0>" + local171);
											} else {
												Static40.method582(local971, local493, local879, Static6.method3569(local506), 20, 0, local171);
											}
										}
										Static34.anInt635 = -1;
										return true;
									} else if (Static34.anInt635 == 201) {
										local132 = Static246.aClass11_Sub25_Sub1_3.method5187();
										if (local132 == 65535) {
											local132 = -1;
										}
										local136 = Static246.aClass11_Sub25_Sub1_3.method5179();
										local140 = Static246.aClass11_Sub25_Sub1_3.method5198();
										if (Static2.method4(local136)) {
											Static296.method4896(-1, local132, local140, 1);
										}
										Static34.anInt635 = -1;
										return true;
									} else if (Static34.anInt635 == 10) {
										local132 = Static246.aClass11_Sub25_Sub1_3.method5185();
										local136 = Static246.aClass11_Sub25_Sub1_3.method5185();
										if (local132 == 255) {
											local136 = -1;
											local132 = -1;
										}
										Static128.method1983(local136, local132);
										Static34.anInt635 = -1;
										return true;
									} else if (Static34.anInt635 == 87) {
										local132 = Static246.aClass11_Sub25_Sub1_3.method5187();
										local136 = Static246.aClass11_Sub25_Sub1_3.method5187();
										local140 = Static246.aClass11_Sub25_Sub1_3.method5187();
										local319 = Static246.aClass11_Sub25_Sub1_3.method5187();
										if (Static2.method4(local132) && Static188.aClass137ArrayArray1[local136] != null) {
											for (local323 = local140; local323 < local319; local323++) {
												local325 = Static246.aClass11_Sub25_Sub1_3.method5221();
												if (local323 < Static188.aClass137ArrayArray1[local136].length && Static188.aClass137ArrayArray1[local136][local323] != null) {
													Static188.aClass137ArrayArray1[local136][local323].anInt4082 = local325;
												}
											}
										}
										Static34.anInt635 = -1;
										return true;
									} else if (Static34.anInt635 == 52) {
										local132 = Static246.aClass11_Sub25_Sub1_3.method5201();
										local136 = Static246.aClass11_Sub25_Sub1_3.method5201();
										local140 = Static246.aClass11_Sub25_Sub1_3.method5201();
										local319 = Static246.aClass11_Sub25_Sub1_3.method5187();
										local323 = Static246.aClass11_Sub25_Sub1_3.method5218();
										if (Static2.method4(local319)) {
											Static296.method4896(local140, local132 << 16 | local136, local323, 7);
										}
										Static34.anInt635 = -1;
										return true;
									} else if (Static34.anInt635 == 138) {
										Static132.anInt2477 = Static246.aClass11_Sub25_Sub1_3.method5190();
										Static63.anInt1170 = Static246.aClass11_Sub25_Sub1_3.method5190();
										Static34.anInt635 = -1;
										return true;
									} else if (Static34.anInt635 == 172) {
										local132 = Static246.aClass11_Sub25_Sub1_3.method5171();
										local136 = Static246.aClass11_Sub25_Sub1_3.method5190();
										local313 = (local136 & 0x1) == 1;
										Static90.method4100(local132, local313);
										Static222.anIntArray343[Static197.anInt4032++ & 0x1F] = local132;
										Static34.anInt635 = -1;
										return true;
									} else if (Static34.anInt635 == 160 || Static34.anInt635 == 41 || Static34.anInt635 == 45 || Static34.anInt635 == 58 || Static34.anInt635 == 57 || Static34.anInt635 == 179 || Static34.anInt635 == 102 || Static34.anInt635 == 71 || Static34.anInt635 == 46 || Static34.anInt635 == 227 || Static34.anInt635 == 122 || Static34.anInt635 == 162 || Static34.anInt635 == 231 || Static34.anInt635 == 169 || Static34.anInt635 == 73) {
										Static98.method1463();
										Static34.anInt635 = -1;
										return true;
									} else if (Static34.anInt635 == 150) {
										local1849 = Static246.aClass11_Sub25_Sub1_3.method5184();
										local136 = Static246.aClass11_Sub25_Sub1_3.method5187();
										local171 = Static117.method1777(local136).method4596(Static246.aClass11_Sub25_Sub1_3);
										Static40.method582(local171, local1849, local136, null, 19, 0, local1849);
										Static34.anInt635 = -1;
										return true;
									} else if (Static34.anInt635 == 40) {
										Static48.method707(false);
										Static34.anInt635 = -1;
										return true;
									} else if (Static34.anInt635 == 97) {
										local132 = Static246.aClass11_Sub25_Sub1_3.method5187();
										local136 = Static246.aClass11_Sub25_Sub1_3.method5218();
										Static233.method4161(local132, local136);
										Static34.anInt635 = -1;
										return true;
									} else if (Static34.anInt635 == 253) {
										local132 = Static246.aClass11_Sub25_Sub1_3.method5171();
										local136 = Static246.aClass11_Sub25_Sub1_3.method5179();
										@Pc(2585) byte local2585 = Static246.aClass11_Sub25_Sub1_3.method5192();
										if (Static2.method4(local136)) {
											Static300.method5108(local2585, local132);
										}
										Static34.anInt635 = -1;
										return true;
									} else {
										@Pc(2688) int local2688;
										if (Static34.anInt635 == 3) {
											local132 = Static246.aClass11_Sub25_Sub1_3.method5185();
											@Pc(2617) boolean local2617 = (local132 & 0x1) == 1;
											local171 = Static246.aClass11_Sub25_Sub1_3.method5184();
											local1589 = Static246.aClass11_Sub25_Sub1_3.method5184();
											if (local1589.equals("")) {
												local1589 = local171;
											}
											local1591 = Static246.aClass11_Sub25_Sub1_3.method5184();
											local702 = Static246.aClass11_Sub25_Sub1_3.method5184();
											if (local702.equals("")) {
												local702 = local1591;
											}
											if (local2617) {
												for (local2688 = 0; local2688 < Static264.anInt5400; local2688++) {
													if (Static92.aStringArray11[local2688].equals(local702)) {
														Static110.aStringArray34[local2688] = local171;
														Static92.aStringArray11[local2688] = local1589;
														Static348.aStringArray52[local2688] = local1591;
														Static189.aStringArray5[local2688] = local702;
														break;
													}
												}
											} else {
												Static110.aStringArray34[Static264.anInt5400] = local171;
												Static92.aStringArray11[Static264.anInt5400] = local1589;
												Static348.aStringArray52[Static264.anInt5400] = local1591;
												Static189.aStringArray5[Static264.anInt5400] = local702;
												Static144.aBooleanArray12[Static264.anInt5400] = (local132 & 0x2) == 2;
												Static264.anInt5400++;
											}
											Static34.anInt635 = -1;
											Static30.anInt546 = Static301.anInt5969;
											return true;
										} else if (Static34.anInt635 == 23) {
											local132 = Static246.aClass11_Sub25_Sub1_3.method5201();
											local136 = Static246.aClass11_Sub25_Sub1_3.method5187();
											local171 = Static246.aClass11_Sub25_Sub1_3.method5184();
											if (Static2.method4(local132)) {
												Static13.method176(local171, local136);
											}
											Static34.anInt635 = -1;
											return true;
										} else if (Static34.anInt635 == 34) {
											Static246.aClass11_Sub25_Sub1_3.anInt6076 += 28;
											if (Static246.aClass11_Sub25_Sub1_3.method5217()) {
												Static62.method920(Static246.aClass11_Sub25_Sub1_3, Static246.aClass11_Sub25_Sub1_3.anInt6076 - 28);
											}
											Static34.anInt635 = -1;
											return true;
										} else {
											@Pc(3261) int local3261;
											if (Static34.anInt635 == 221) {
												local132 = Static246.aClass11_Sub25_Sub1_3.method5187();
												local136 = Static246.aClass11_Sub25_Sub1_3.method5218();
												local140 = Static246.aClass11_Sub25_Sub1_3.method5171();
												local319 = Static246.aClass11_Sub25_Sub1_3.method5187();
												if (local136 >> 30 == 0) {
													@Pc(2851) Class213 local2851;
													@Pc(2875) Class111 local2875;
													@Pc(2870) Class111 local2870;
													@Pc(2906) Class111 local2906;
													@Pc(2856) Class213 local2856;
													if (local136 >> 29 != 0) {
														local323 = local136 & 0xFFFF;
														@Pc(2823) Class67_Sub3_Sub3_Sub1 local2823 = Static356.aClass67_Sub3_Sub3_Sub1Array1[local323];
														if (local2823 != null) {
															if (local132 == 65535) {
																local132 = -1;
															}
															local704 = true;
															if (local132 != -1 && local2823.anInt5043 != -1) {
																if (local2823.anInt5043 == local132) {
																	local2851 = Static89.method1296(local132);
																	if (local2851.aBoolean424 && local2851.anInt6649 != -1) {
																		local2906 = Static306.method5143(local2851.anInt6649);
																		local872 = local2906.anInt2720;
																		if (local872 == 0 || local872 == 2) {
																			local704 = false;
																		} else if (local872 == 1) {
																			local704 = true;
																		}
																	}
																} else {
																	local2851 = Static89.method1296(local132);
																	local2856 = Static89.method1296(local2823.anInt5043);
																	if (local2851.anInt6649 != -1 && local2856.anInt6649 != -1) {
																		local2870 = Static306.method5143(local2851.anInt6649);
																		local2875 = Static306.method5143(local2856.anInt6649);
																		if (local2870.anInt2716 < local2875.anInt2716) {
																			local704 = false;
																		}
																	}
																}
															}
															if (local704) {
																local2823.anInt5043 = local132;
																local2823.anInt5039 = 0;
																local2823.anInt5061 = Static293.anInt5807 + local319;
																local2823.anInt5007 = 0;
																local2823.anInt5033 = local140;
																local2823.anInt5058 = 1;
																if (Static293.anInt5807 < local2823.anInt5061) {
																	local2823.anInt5039 = -1;
																}
																if (local2823.anInt5043 != -1 && local2823.anInt5061 == Static293.anInt5807) {
																	local515 = Static89.method1296(local2823.anInt5043).anInt6649;
																	if (local515 != -1) {
																		local2906 = Static306.method5143(local515);
																		if (local2906 != null && local2906.anIntArray191 != null) {
																			Static354.method5681(local2823.anInt6310, local2823.anInt6308, local2906, false, 0);
																		}
																	}
																}
															}
														}
													} else if (local136 >> 28 != 0) {
														local323 = local136 & 0xFFFF;
														@Pc(3022) Class67_Sub3_Sub3_Sub2 local3022;
														if (Static256.anInt5197 == local323) {
															local3022 = Static156.aClass67_Sub3_Sub3_Sub2_2;
														} else {
															local3022 = Static105.aClass67_Sub3_Sub3_Sub2Array1[local323];
														}
														if (local3022 != null) {
															if (local132 == 65535) {
																local132 = -1;
															}
															local704 = true;
															if (local132 != -1 && local3022.anInt5043 != -1) {
																if (local132 == local3022.anInt5043) {
																	local2851 = Static89.method1296(local132);
																	if (local2851.aBoolean424 && local2851.anInt6649 != -1) {
																		local2906 = Static306.method5143(local2851.anInt6649);
																		local872 = local2906.anInt2720;
																		if (local872 == 0 || local872 == 2) {
																			local704 = false;
																		} else if (local872 == 1) {
																			local704 = true;
																		}
																	}
																} else {
																	local2851 = Static89.method1296(local132);
																	local2856 = Static89.method1296(local3022.anInt5043);
																	if (local2851.anInt6649 != -1 && local2856.anInt6649 != -1) {
																		local2870 = Static306.method5143(local2851.anInt6649);
																		local2875 = Static306.method5143(local2856.anInt6649);
																		if (local2875.anInt2716 > local2870.anInt2716) {
																			local704 = false;
																		}
																	}
																}
															}
															if (local704) {
																local3022.anInt5061 = Static293.anInt5807 + local319;
																local3022.anInt5033 = local140;
																local3022.anInt5058 = 1;
																local3022.anInt5043 = local132;
																local3022.anInt5039 = 0;
																local3022.anInt5007 = 0;
																if (local3022.anInt5061 > Static293.anInt5807) {
																	local3022.anInt5039 = -1;
																}
																if (local3022.anInt5043 == 65535) {
																	local3022.anInt5043 = -1;
																}
																if (local3022.anInt5043 != -1 && Static293.anInt5807 == local3022.anInt5061) {
																	local515 = Static89.method1296(local3022.anInt5043).anInt6649;
																	if (local515 != -1) {
																		local2906 = Static306.method5143(local515);
																		if (local2906 != null && local2906.anIntArray191 != null) {
																			Static354.method5681(local3022.anInt6310, local3022.anInt6308, local2906, local3022 == Static156.aClass67_Sub3_Sub3_Sub2_2, 0);
																		}
																	}
																}
															}
														}
													}
												} else {
													local323 = local136 >> 28 & 0x3;
													local325 = (local136 >> 14 & 0x3FFF) - Static182.anInt3662;
													local2688 = (local136 & 0x3FFF) - Static169.anInt6312;
													if (local325 >= 0 && local2688 >= 0 && local325 < Static24.anInt454 && local2688 < Static240.anInt4832) {
														local515 = local325 * 128 + 64;
														local3261 = local2688 * 128 + 64;
														@Pc(3285) Class67_Sub3_Sub4 local3285 = new Class67_Sub3_Sub4(local132, 0, Static293.anInt5807, local323, local515, Static168.method2721(local515, local323, local3261) - local140, local3261, local325, local325, local2688, local2688);
														Static270.aClass16_42.method190(new Class11_Sub4_Sub21(local3285));
													}
												}
												Static34.anInt635 = -1;
												return true;
											}
											@Pc(3483) Class19 local3483;
											if (Static34.anInt635 == 161) {
												Static229.anInt4584 = Static301.anInt5969;
												if (Static315.anInt6163 == 0) {
													Static333.aString64 = null;
													Static19.anInt1985 = 0;
													Static119.aClass19Array1 = null;
													Static244.aString47 = null;
													Static34.anInt635 = -1;
													return true;
												}
												Static333.aString64 = Static246.aClass11_Sub25_Sub1_3.method5184();
												local489 = Static246.aClass11_Sub25_Sub1_3.method5185() == 1;
												if (local489) {
													Static246.aClass11_Sub25_Sub1_3.method5184();
												}
												@Pc(3340) long local3340 = Static246.aClass11_Sub25_Sub1_3.method5174();
												Static244.aString47 = Static11.method173(local3340);
												Static137.aByte23 = Static246.aClass11_Sub25_Sub1_3.method5175();
												local319 = Static246.aClass11_Sub25_Sub1_3.method5185();
												if (local319 == 255) {
													Static34.anInt635 = -1;
													return true;
												}
												Static19.anInt1985 = local319;
												@Pc(3366) Class19[] local3366 = new Class19[100];
												for (local325 = 0; local325 < Static19.anInt1985; local325++) {
													local3366[local325] = new Class19();
													local3366[local325].aString3 = Static246.aClass11_Sub25_Sub1_3.method5184();
													local489 = Static246.aClass11_Sub25_Sub1_3.method5185() == 1;
													if (local489) {
														local3366[local325].aString4 = Static246.aClass11_Sub25_Sub1_3.method5184();
													} else {
														local3366[local325].aString4 = local3366[local325].aString3;
													}
													local3366[local325].anInt272 = Static246.aClass11_Sub25_Sub1_3.method5187();
													local3366[local325].aByte1 = Static246.aClass11_Sub25_Sub1_3.method5175();
													local3366[local325].aString5 = Static246.aClass11_Sub25_Sub1_3.method5184();
													if (local3366[local325].aString4.equals(Static156.aClass67_Sub3_Sub3_Sub2_2.aString50)) {
														Static163.aByte35 = local3366[local325].aByte1;
													}
												}
												local3261 = Static19.anInt1985;
												while (local3261 > 0) {
													local704 = true;
													local3261--;
													for (local872 = 0; local872 < local3261; local872++) {
														if (local3366[local872].aString3.compareTo(local3366[local872 + 1].aString3) > 0) {
															local3483 = local3366[local872];
															local3366[local872] = local3366[local872 + 1];
															local3366[local872 + 1] = local3483;
															local704 = false;
														}
													}
													if (local704) {
														break;
													}
												}
												Static119.aClass19Array1 = local3366;
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 135) {
												Static63.anInt1170 = Static246.aClass11_Sub25_Sub1_3.method5190();
												Static132.anInt2477 = Static246.aClass11_Sub25_Sub1_3.method5185();
												for (@Pc(3533) Class11_Sub40 local3533 = (Class11_Sub40) Static301.aClass58_35.method1008(); local3533 != null; local3533 = (Class11_Sub40) Static301.aClass58_35.method1004()) {
													local136 = (int) (local3533.aLong215 & 0x3FFFL);
													local140 = (int) (local3533.aLong215 >> 14 & 0x3FFFL);
													local319 = (int) (local3533.aLong215 >> 28 & 0x3L);
													if (Static322.anInt6250 == local319 && Static132.anInt2477 <= local136 && local136 < Static132.anInt2477 + 8 && Static63.anInt1170 <= local140 && local140 < Static63.anInt1170 + 8) {
														local3533.method5701();
														Static212.method3826(Static322.anInt6250, local140, local136);
													}
												}
												for (@Pc(3612) Class11_Sub24 local3612 = (Class11_Sub24) Static21.aClass16_15.method193(); local3612 != null; local3612 = (Class11_Sub24) Static21.aClass16_15.method188()) {
													if (local3612.anInt2702 >= Static132.anInt2477 && local3612.anInt2702 < Static132.anInt2477 + 8 && Static63.anInt1170 <= local3612.anInt2699 && local3612.anInt2699 < Static63.anInt1170 + 8 && Static322.anInt6250 == local3612.anInt2700) {
														local3612.anInt2696 = 0;
													}
												}
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 42) {
												local132 = Static246.aClass11_Sub25_Sub1_3.method5171();
												local136 = Static246.aClass11_Sub25_Sub1_3.method5218();
												local140 = Static246.aClass11_Sub25_Sub1_3.method5171();
												local319 = Static246.aClass11_Sub25_Sub1_3.method5218();
												if (Static2.method4(local140)) {
													Static296.method4896(local319, local132, local136, 5);
												}
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 117) {
												local132 = Static246.aClass11_Sub25_Sub1_3.method5179();
												local136 = Static246.aClass11_Sub25_Sub1_3.method5198();
												if (Static2.method4(local132)) {
													Static296.method4896(-1, -1, local136, 3);
												}
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 141) {
												local132 = Static246.aClass11_Sub25_Sub1_3.method5187();
												local136 = Static246.aClass11_Sub25_Sub1_3.method5218();
												local140 = Static246.aClass11_Sub25_Sub1_3.method5187();
												if (local140 == 65535) {
													local140 = -1;
												}
												if (Static2.method4(local132)) {
													Static296.method4896(-1, local140, local136, 2);
												}
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 74) {
												Static122.anInt2280 = Static246.aClass11_Sub25_Sub1_3.method5185();
												Static30.anInt546 = Static301.anInt5969;
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 248) {
												if (Static29.aFrame1 != null) {
													Static226.method4030(-1, false, Static70.anInt1316, -1);
												}
												@Pc(3796) byte[] local3796 = new byte[Static315.anInt6163];
												Static246.aClass11_Sub25_Sub1_3.method2458(local3796, Static315.anInt6163);
												local493 = Static216.method4853(Static315.anInt6163, 0, local3796);
												Static30.method430(true, Static77.aClass118_7, Static74.anInt1413 == 1, local493);
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 165) {
												if (Static315.anInt6163 == 0) {
													Static282.aString55 = Static17.aClass117_8.method2684(Static230.anInt4634);
												} else {
													Static282.aString55 = Static246.aClass11_Sub25_Sub1_3.method5184();
												}
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 137) {
												local489 = Static246.aClass11_Sub25_Sub1_3.method5185() == 1;
												local493 = Static246.aClass11_Sub25_Sub1_3.method5184();
												local171 = local493;
												if (local489) {
													local171 = Static246.aClass11_Sub25_Sub1_3.method5184();
												}
												local506 = Static246.aClass11_Sub25_Sub1_3.method5187();
												local511 = Static246.aClass11_Sub25_Sub1_3.method5221();
												local515 = Static246.aClass11_Sub25_Sub1_3.method5185();
												local3261 = Static246.aClass11_Sub25_Sub1_3.method5187();
												@Pc(3901) long local3901 = local511 + (local506 << 32);
												@Pc(3903) boolean local3903 = false;
												@Pc(3905) int local3905 = 0;
												while (true) {
													if (local3905 >= 100) {
														if (local515 <= 1 && Static350.method5660(local171)) {
															local3903 = true;
														}
														break;
													}
													if (local3901 == Static19.aLongArray3[local3905]) {
														local3903 = true;
														break;
													}
													local3905++;
												}
												if (!local3903 && Static25.anInt6264 == 0) {
													Static19.aLongArray3[Static318.anInt6175] = local3901;
													Static318.anInt6175 = (Static318.anInt6175 + 1) % 100;
													local935 = Static117.method1777(local3261).method4596(Static246.aClass11_Sub25_Sub1_3);
													if (local515 == 2) {
														Static40.method582(local935, "<img=1>" + local493, local3261, null, 18, 0, "<img=1>" + local171);
													} else if (local515 == 1) {
														Static40.method582(local935, "<img=0>" + local493, local3261, null, 18, 0, "<img=0>" + local171);
													} else {
														Static40.method582(local935, local493, local3261, null, 18, 0, local171);
													}
												}
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 59) {
												local132 = Static246.aClass11_Sub25_Sub1_3.method5187();
												local493 = Static246.aClass11_Sub25_Sub1_3.method5184();
												@Pc(4048) Object[] local4048 = new Object[local493.length() + 1];
												for (local319 = local493.length() - 1; local319 >= 0; local319--) {
													if (local493.charAt(local319) == 's') {
														local4048[local319 + 1] = Static246.aClass11_Sub25_Sub1_3.method5184();
													} else {
														local4048[local319 + 1] = Integer.valueOf(Static246.aClass11_Sub25_Sub1_3.method5198());
													}
												}
												local4048[0] = Integer.valueOf(Static246.aClass11_Sub25_Sub1_3.method5198());
												if (Static2.method4(local132)) {
													@Pc(4103) Class11_Sub13 local4103 = new Class11_Sub13();
													local4103.anObjectArray3 = local4048;
													Static93.method1353(local4103);
												}
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 212) {
												local132 = Static246.aClass11_Sub25_Sub1_3.method5185();
												local136 = local132 >> 5;
												local140 = local132 & 0x1F;
												if (local140 == 0) {
													Static23.aClass119Array1[local136] = null;
													Static34.anInt635 = -1;
													return true;
												}
												@Pc(4146) Class119 local4146 = new Class119();
												local4146.anInt3328 = local140;
												local4146.anInt3323 = Static246.aClass11_Sub25_Sub1_3.method5185();
												if (local4146.anInt3323 >= 0 && local4146.anInt3323 < Static214.aClass97Array18.length) {
													if (local4146.anInt3328 == 1 || local4146.anInt3328 == 10) {
														local4146.anInt3336 = Static246.aClass11_Sub25_Sub1_3.method5187();
														Static246.aClass11_Sub25_Sub1_3.anInt6076 += 5;
													} else if (local4146.anInt3328 >= 2 && local4146.anInt3328 <= 6) {
														if (local4146.anInt3328 == 2) {
															local4146.anInt3324 = 64;
															local4146.anInt3331 = 64;
														}
														if (local4146.anInt3328 == 3) {
															local4146.anInt3331 = 0;
															local4146.anInt3324 = 64;
														}
														if (local4146.anInt3328 == 4) {
															local4146.anInt3324 = 64;
															local4146.anInt3331 = 128;
														}
														if (local4146.anInt3328 == 5) {
															local4146.anInt3324 = 0;
															local4146.anInt3331 = 64;
														}
														if (local4146.anInt3328 == 6) {
															local4146.anInt3331 = 64;
															local4146.anInt3324 = 128;
														}
														local4146.anInt3328 = 2;
														local4146.anInt3330 = Static246.aClass11_Sub25_Sub1_3.method5187();
														local4146.anInt3337 = Static246.aClass11_Sub25_Sub1_3.method5187();
														local4146.anInt3338 = Static246.aClass11_Sub25_Sub1_3.method5185();
														local4146.anInt3333 = Static246.aClass11_Sub25_Sub1_3.method5187();
													}
													local4146.anInt3335 = Static246.aClass11_Sub25_Sub1_3.method5187();
													if (local4146.anInt3335 == 65535) {
														local4146.anInt3335 = -1;
													}
													Static23.aClass119Array1[local136] = local4146;
												}
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 65) {
												local132 = Static246.aClass11_Sub25_Sub1_3.method5187();
												local136 = Static246.aClass11_Sub25_Sub1_3.method5179();
												local140 = Static246.aClass11_Sub25_Sub1_3.method5187();
												if (Static2.method4(local136)) {
													Static195.method3968(local132, local140);
												}
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 130) {
												local132 = Static246.aClass11_Sub25_Sub1_3.method5187();
												local136 = Static246.aClass11_Sub25_Sub1_3.method5185();
												local313 = (local136 & 0x1) == 1;
												Static128.method1984(local313, local132);
												local319 = Static246.aClass11_Sub25_Sub1_3.method5187();
												for (local323 = 0; local323 < local319; local323++) {
													local325 = Static246.aClass11_Sub25_Sub1_3.method5187();
													local2688 = Static246.aClass11_Sub25_Sub1_3.method5200();
													if (local2688 == 255) {
														local2688 = Static246.aClass11_Sub25_Sub1_3.method5218();
													}
													Static71.method1075(local323, local313, local2688, local132, local325 - 1);
												}
												Static222.anIntArray343[Static197.anInt4032++ & 0x1F] = local132;
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 254) {
												local132 = Static246.aClass11_Sub25_Sub1_3.method5187();
												local136 = Static246.aClass11_Sub25_Sub1_3.method5185();
												local140 = Static246.aClass11_Sub25_Sub1_3.method5185();
												local319 = Static246.aClass11_Sub25_Sub1_3.method5187();
												local323 = Static246.aClass11_Sub25_Sub1_3.method5185();
												local325 = Static246.aClass11_Sub25_Sub1_3.method5185();
												if (Static2.method4(local132)) {
													Static196.method3563(local323, local140, local136, local319, true, local325);
												}
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 166) {
												local132 = Static246.aClass11_Sub25_Sub1_3.method5187();
												local136 = Static246.aClass11_Sub25_Sub1_3.method5197();
												local140 = Static246.aClass11_Sub25_Sub1_3.method5207();
												if (Static2.method4(local132)) {
													Static53.method803(local136, local140);
												}
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 192) {
												Static204.method3652();
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 241) {
												if (Static270.anInt5491 != -1) {
													Static313.method5275(0, Static270.anInt5491);
												}
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 4) {
												local489 = Static246.aClass11_Sub25_Sub1_3.method5185() == 1;
												local493 = Static246.aClass11_Sub25_Sub1_3.method5184();
												local171 = local493;
												if (local489) {
													local171 = Static246.aClass11_Sub25_Sub1_3.method5184();
												}
												local506 = Static246.aClass11_Sub25_Sub1_3.method5174();
												local511 = Static246.aClass11_Sub25_Sub1_3.method5187();
												local2066 = Static246.aClass11_Sub25_Sub1_3.method5221();
												local872 = Static246.aClass11_Sub25_Sub1_3.method5185();
												@Pc(4574) long local4574 = (local511 << 32) + local2066;
												@Pc(4576) boolean local4576 = false;
												@Pc(4578) int local4578 = 0;
												while (true) {
													if (local4578 >= 100) {
														if (local872 <= 1) {
															if (Static174.aBoolean219 && !Static186.aBoolean239 || Static137.aBoolean170) {
																local4576 = true;
															} else if (Static350.method5660(local171)) {
																local4576 = true;
															}
														}
														break;
													}
													if (Static19.aLongArray3[local4578] == local4574) {
														local4576 = true;
														break;
													}
													local4578++;
												}
												if (!local4576 && Static25.anInt6264 == 0) {
													Static19.aLongArray3[Static318.anInt6175] = local4574;
													Static318.anInt6175 = (Static318.anInt6175 + 1) % 100;
													local953 = Static81.method1211(Static153.method2455(Static6.method3582(Static246.aClass11_Sub25_Sub1_3)));
													if (local872 == 2 || local872 == 3) {
														Static40.method582(local953, "<img=1>" + local493, -1, Static6.method3569(local506), 9, 0, "<img=1>" + local171);
													} else if (local872 == 1) {
														Static40.method582(local953, "<img=0>" + local493, -1, Static6.method3569(local506), 9, 0, "<img=0>" + local171);
													} else {
														Static40.method582(local953, local493, -1, Static6.method3569(local506), 9, 0, local171);
													}
												}
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 219) {
												local132 = Static246.aClass11_Sub25_Sub1_3.method5215();
												local136 = Static246.aClass11_Sub25_Sub1_3.method5187();
												Static145.method2211(local136, local132);
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 82) {
												local132 = Static246.aClass11_Sub25_Sub1_3.method5187();
												local136 = Static246.aClass11_Sub25_Sub1_3.method5207();
												if (Static2.method4(local132)) {
													Static296.method4896(0, 2047, local136, 5);
												}
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 114) {
												local1849 = Static246.aClass11_Sub25_Sub1_3.method5184();
												local493 = Static81.method1211(Static153.method2455(Static6.method3582(Static246.aClass11_Sub25_Sub1_3)));
												Static260.method4521(0, local1849, 6, local1849, local493);
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 238) {
												local132 = Static246.aClass11_Sub25_Sub1_3.method5187();
												if (Static2.method4(local132)) {
													Static215.method3872();
												}
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 154) {
												local132 = Static246.aClass11_Sub25_Sub1_3.method5215();
												local136 = Static246.aClass11_Sub25_Sub1_3.method5190();
												local140 = Static246.aClass11_Sub25_Sub1_3.method5219();
												Static281.anIntArray428[local136] = local132;
												Static15.anIntArray418[local136] = local140;
												Static8.anIntArray12[local136] = 1;
												local319 = Static270.anIntArray415[local136] - 1;
												for (local323 = 0; local323 < local319; local323++) {
													if (local132 >= Class11_Sub18.anIntArray163[local323]) {
														Static8.anIntArray12[local136] = local323 + 2;
													}
												}
												Static38.anIntArray52[Static208.anInt6377++ & 0x1F] = local136;
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 24) {
												local132 = Static246.aClass11_Sub25_Sub1_3.method5219();
												local136 = Static246.aClass11_Sub25_Sub1_3.method5201();
												if (local136 == 65535) {
													local136 = -1;
												}
												Static220.method3943(local132, local136);
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 20) {
												local132 = Static246.aClass11_Sub25_Sub1_3.method5200();
												local136 = Static246.aClass11_Sub25_Sub1_3.method5187();
												if (local136 == 65535) {
													local136 = -1;
												}
												local140 = Static246.aClass11_Sub25_Sub1_3.method5224();
												Static252.method5137(local132, local140, local136);
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 86) {
												local132 = Static246.aClass11_Sub25_Sub1_3.method5171();
												local136 = Static246.aClass11_Sub25_Sub1_3.method5215();
												local140 = Static246.aClass11_Sub25_Sub1_3.method5200();
												if (Static2.method4(local132)) {
													Static9.method116(local136, local140);
												}
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 234) {
												local132 = Static246.aClass11_Sub25_Sub1_3.method5179();
												local136 = Static246.aClass11_Sub25_Sub1_3.method5171();
												local140 = Static246.aClass11_Sub25_Sub1_3.method5218();
												if (Static2.method4(local132)) {
													Static300.method5108(local140, local136);
												}
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 249) {
												local132 = Static246.aClass11_Sub25_Sub1_3.method5187();
												local136 = Static246.aClass11_Sub25_Sub1_3.method5218();
												local140 = Static246.aClass11_Sub25_Sub1_3.method5187();
												if (local140 == 65535) {
													local140 = -1;
												}
												local319 = Static246.aClass11_Sub25_Sub1_3.method5201();
												if (local319 == 65535) {
													local319 = -1;
												}
												local323 = Static246.aClass11_Sub25_Sub1_3.method5207();
												if (Static2.method4(local132)) {
													for (local325 = local319; local325 <= local140; local325++) {
														local1185 = ((long) local323 << 32) + ((long) local325);
														local1191 = (Class11_Sub36) Static25.aClass58_38.method1009(local1185);
														if (local1191 != null) {
															local1202 = new Class11_Sub36(local136, local1191.anInt5607);
															local1191.method5701();
														} else if (local325 == -1) {
															local1202 = new Class11_Sub36(local136, Static166.method2688(local323).aClass11_Sub36_1.anInt5607);
														} else {
															local1202 = new Class11_Sub36(local136, -1);
														}
														Static25.aClass58_38.method1006(local1185, local1202);
													}
												}
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 80) {
												local132 = Static246.aClass11_Sub25_Sub1_3.method5187();
												local136 = Static246.aClass11_Sub25_Sub1_3.method5185();
												local140 = Static246.aClass11_Sub25_Sub1_3.method5215();
												local319 = Static246.aClass11_Sub25_Sub1_3.method5171();
												if (Static2.method4(local319)) {
													local1510 = (Class11_Sub41) Static197.aClass58_18.method1009((long) local140);
													if (local1510 != null) {
														Static66.method1709(local1510, local132 != local1510.anInt6364, false);
													}
													Static299.method5103(false, local136, local132, local140);
												}
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 62) {
												local132 = Static246.aClass11_Sub25_Sub1_3.method5187();
												local136 = Static246.aClass11_Sub25_Sub1_3.method5200();
												local140 = Static246.aClass11_Sub25_Sub1_3.method5179();
												if (Static2.method4(local140)) {
													if (local136 == 2) {
														Static231.method4379();
													}
													Static270.anInt5491 = local132;
													Static333.method5456(local132);
													Static219.method3921(false);
													Static93.method1349(Static270.anInt5491);
													for (local319 = 0; local319 < 100; local319++) {
														Static292.aBooleanArray22[local319] = true;
													}
												}
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 147) {
												Static4.anInt23 = Static246.aClass11_Sub25_Sub1_3.method5179() * 30;
												Static34.anInt635 = -1;
												Static46.anInt908 = Static301.anInt5969;
												return true;
											} else if (Static34.anInt635 == 196) {
												Static107.method1632(Static246.aClass11_Sub25_Sub1_3.method5184());
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 106) {
												local132 = Static246.aClass11_Sub25_Sub1_3.method5201();
												@Pc(5276) byte local5276 = Static246.aClass11_Sub25_Sub1_3.method5175();
												Static145.method2211(local132, local5276);
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 107) {
												local132 = Static246.aClass11_Sub25_Sub1_3.method5219();
												local136 = local132 >> 2;
												local140 = local132 & 0x3;
												local319 = Static174.anIntArray225[local136];
												local323 = Static246.aClass11_Sub25_Sub1_3.method5218();
												local325 = local323 >> 28 & 0x3;
												local2688 = local323 >> 14 & 0x3FFF;
												local515 = local323 & 0x3FFF;
												local3261 = Static246.aClass11_Sub25_Sub1_3.method5201();
												if (local3261 == 65535) {
													local3261 = -1;
												}
												local2688 -= Static182.anInt3662;
												local515 -= Static169.anInt6312;
												Static280.method162(local325, local2688, local515, local136, local3261, local319, local140);
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 158) {
												Static25.method5367();
												Static34.anInt635 = -1;
												return false;
											} else if (Static34.anInt635 == 131) {
												Static48.method707(true);
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 8) {
												for (local132 = 0; local132 < Static105.aClass67_Sub3_Sub3_Sub2Array1.length; local132++) {
													if (Static105.aClass67_Sub3_Sub3_Sub2Array1[local132] != null) {
														Static105.aClass67_Sub3_Sub3_Sub2Array1[local132].anInt5013 = -1;
													}
												}
												for (local136 = 0; local136 < Static356.aClass67_Sub3_Sub3_Sub1Array1.length; local136++) {
													if (Static356.aClass67_Sub3_Sub3_Sub1Array1[local136] != null) {
														Static356.aClass67_Sub3_Sub3_Sub1Array1[local136].anInt5013 = -1;
													}
												}
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 48) {
												local132 = Static246.aClass11_Sub25_Sub1_3.method5207();
												local136 = Static246.aClass11_Sub25_Sub1_3.method5187();
												local140 = Static246.aClass11_Sub25_Sub1_3.method5203();
												local319 = Static246.aClass11_Sub25_Sub1_3.method5222();
												if (Static2.method4(local136)) {
													Static132.method2063(local319, local140, local132);
												}
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 195) {
												local132 = Static246.aClass11_Sub25_Sub1_3.method5179();
												local136 = Static246.aClass11_Sub25_Sub1_3.method5190();
												local140 = Static246.aClass11_Sub25_Sub1_3.method5187();
												@Pc(5478) Class67_Sub3_Sub3_Sub1 local5478 = Static356.aClass67_Sub3_Sub3_Sub1Array1[local132];
												if (local5478 != null) {
													Static296.method4894(local140, local136, local5478);
												}
												Static34.anInt635 = -1;
												return true;
											} else if (Static34.anInt635 == 151) {
												local1849 = Static246.aClass11_Sub25_Sub1_3.method5184();
												local313 = Static246.aClass11_Sub25_Sub1_3.method5185() == 1;
												if (local313) {
													local493 = Static246.aClass11_Sub25_Sub1_3.method5184();
												} else {
													local493 = local1849;
												}
												local319 = Static246.aClass11_Sub25_Sub1_3.method5187();
												@Pc(5525) byte local5525 = Static246.aClass11_Sub25_Sub1_3.method5175();
												@Pc(5527) boolean local5527 = false;
												if (local5525 == -128) {
													local5527 = true;
												}
												if (local5527) {
													if (Static19.anInt1985 == 0) {
														Static34.anInt635 = -1;
														return true;
													}
													for (local2688 = 0; Static19.anInt1985 > local2688 && (!Static119.aClass19Array1[local2688].aString4.equals(local493) || local319 != Static119.aClass19Array1[local2688].anInt272); local2688++) {
													}
													if (local2688 < Static19.anInt1985) {
														while (local2688 < Static19.anInt1985 - 1) {
															Static119.aClass19Array1[local2688] = Static119.aClass19Array1[local2688 + 1];
															local2688++;
														}
														Static19.anInt1985--;
														Static119.aClass19Array1[Static19.anInt1985] = null;
													}
												} else {
													@Pc(5607) String local5607 = Static246.aClass11_Sub25_Sub1_3.method5184();
													local3483 = new Class19();
													local3483.aString5 = local5607;
													local3483.aByte1 = local5525;
													local3483.aString3 = local1849;
													local3483.anInt272 = local319;
													local3483.aString4 = local493;
													for (local3261 = Static19.anInt1985 - 1; local3261 >= 0; local3261--) {
														local872 = Static119.aClass19Array1[local3261].aString4.compareTo(local3483.aString4);
														if (local872 == 0) {
															Static119.aClass19Array1[local3261].anInt272 = local319;
															Static119.aClass19Array1[local3261].aByte1 = local5525;
															Static119.aClass19Array1[local3261].aString5 = local5607;
															if (local493.equals(Static156.aClass67_Sub3_Sub3_Sub2_2.aString50)) {
																Static163.aByte35 = local5525;
															}
															Static229.anInt4584 = Static301.anInt5969;
															Static34.anInt635 = -1;
															return true;
														}
														if (local872 < 0) {
															break;
														}
													}
													if (Static119.aClass19Array1.length <= Static19.anInt1985) {
														Static34.anInt635 = -1;
														return true;
													}
													for (local872 = Static19.anInt1985 - 1; local872 > local3261; local872--) {
														Static119.aClass19Array1[local872 + 1] = Static119.aClass19Array1[local872];
													}
													if (Static19.anInt1985 == 0) {
														Static119.aClass19Array1 = new Class19[100];
													}
													Static119.aClass19Array1[local3261 + 1] = local3483;
													Static19.anInt1985++;
													if (local493.equals(Static156.aClass67_Sub3_Sub3_Sub2_2.aString50)) {
														Static163.aByte35 = local5525;
													}
												}
												Static229.anInt4584 = Static301.anInt5969;
												Static34.anInt635 = -1;
												return true;
											} else {
												Static38.method554(null, "T1 - " + Static34.anInt635 + "," + Static196.anInt4002 + "," + Static132.anInt2475 + " - " + Static315.anInt6163);
												Static25.method5367();
												return true;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
