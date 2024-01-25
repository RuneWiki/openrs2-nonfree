import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!an", name = "u", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!an", name = "i", descriptor = "Z")
	public static boolean aBoolean59 = false;

	@OriginalMember(owner = "client!an", name = "o", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_4 = new Class186(7, 6);

	@OriginalMember(owner = "client!an", name = "x", descriptor = "Z")
	public static boolean aBoolean60 = false;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
	public static void method814() {
		@Pc(7) int local7 = Static255.aClass1_Sub13_Sub2_2.method3056();
		@Pc(11) int local11 = Static255.aClass1_Sub13_Sub2_2.method3016();
		Static198.anInt4113 = Static255.aClass1_Sub13_Sub2_2.method3057();
		@Pc(19) int local19 = Static255.aClass1_Sub13_Sub2_2.method3035();
		@Pc(30) boolean local30 = Static255.aClass1_Sub13_Sub2_2.method3057() == 1;
		Static376.method5720();
		Static265.method4402(local11);
		Static255.aClass1_Sub13_Sub2_2.method3086();
		@Pc(47) int local47;
		@Pc(50) int local50;
		@Pc(56) int local56;
		for (@Pc(44) int local44 = 0; local44 < 4; local44++) {
			for (local47 = 0; local47 < Static542.anInt9387 >> 3; local47++) {
				for (local50 = 0; local50 < Static36.anInt1324 >> 3; local50++) {
					local56 = Static255.aClass1_Sub13_Sub2_2.method3087(1);
					if (local56 == 1) {
						Static131.anIntArrayArrayArray3[local44][local47][local50] = Static255.aClass1_Sub13_Sub2_2.method3087(26);
					} else {
						Static131.anIntArrayArrayArray3[local44][local47][local50] = -1;
					}
				}
			}
		}
		Static255.aClass1_Sub13_Sub2_2.method3091();
		local47 = (Static45.anInt1403 - Static255.aClass1_Sub13_Sub2_2.anInt3400) / 16;
		Static270.anIntArrayArray37 = new int[local47][4];
		for (local50 = 0; local50 < local47; local50++) {
			for (local56 = 0; local56 < 4; local56++) {
				Static270.anIntArrayArray37[local50][local56] = Static255.aClass1_Sub13_Sub2_2.method3037();
			}
		}
		Static419.aByteArrayArray28 = new byte[local47][];
		Static213.anIntArray329 = null;
		Static130.aByteArrayArray12 = new byte[local47][];
		Static161.aByteArrayArray15 = new byte[local47][];
		Static404.anIntArray782 = new int[local47];
		Static467.anIntArray624 = new int[local47];
		Static128.anIntArray247 = new int[local47];
		Static397.aByteArrayArray25 = new byte[local47][];
		Static480.anIntArray638 = new int[local47];
		Static540.aByteArrayArray32 = null;
		Static85.anIntArray178 = new int[local47];
		local47 = 0;
		for (local56 = 0; local56 < 4; local56++) {
			for (@Pc(180) int local180 = 0; local180 < Static542.anInt9387 >> 3; local180++) {
				for (@Pc(183) int local183 = 0; local183 < Static36.anInt1324 >> 3; local183++) {
					@Pc(192) int local192 = Static131.anIntArrayArrayArray3[local56][local180][local183];
					if (local192 != -1) {
						@Pc(202) int local202 = local192 >> 14 & 0x3FF;
						@Pc(208) int local208 = local192 >> 3 & 0x7FF;
						@Pc(218) int local218 = local208 / 8 + (local202 / 8 << 8);
						for (@Pc(220) int local220 = 0; local220 < local47; local220++) {
							if (Static85.anIntArray178[local220] == local218) {
								local218 = -1;
								break;
							}
						}
						if (local218 != -1) {
							Static85.anIntArray178[local47] = local218;
							@Pc(247) int local247 = local218 >> 8 & 0xFF;
							@Pc(251) int local251 = local218 & 0xFF;
							Static128.anIntArray247[local47] = Static350.aClass160_74.method4199("m" + local247 + "_" + local251);
							Static480.anIntArray638[local47] = Static350.aClass160_74.method4199("l" + local247 + "_" + local251);
							Static467.anIntArray624[local47] = Static350.aClass160_74.method4199("um" + local247 + "_" + local251);
							Static404.anIntArray782[local47] = Static350.aClass160_74.method4199("ul" + local247 + "_" + local251);
							local47++;
						}
					}
				}
			}
		}
		Static292.method4920(local7, 10, local19, local30);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IILclient!ks;ILclient!gba;)V")
	public static void method815(@OriginalArg(0) int arg0, @OriginalArg(2) Class47_Sub2_Sub3_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub13_Sub2 arg3) {
		@Pc(19) int local19;
		if ((arg0 & 0x8) != 0) {
			local19 = arg3.method3016();
			@Pc(22) byte[] local22 = new byte[local19];
			@Pc(27) Class1_Sub13 local27 = new Class1_Sub13(local22);
			arg3.method3018(local22, local19);
			Static133.aClass1_Sub13Array1[arg2] = local27;
			arg1.method4376(local27);
		}
		@Pc(45) byte local45 = -1;
		if ((arg0 & 0x8000) != 0) {
			arg1.anInt5031 = arg3.method3063();
			arg1.anInt5055 = arg3.method3073();
			arg1.anInt5064 = arg3.method3079();
			arg1.anInt5003 = arg3.method3044();
			arg1.anInt5020 = arg3.method3027() + Static416.anInt7252;
			arg1.anInt5006 = arg3.method3056() + Static416.anInt7252;
			arg1.anInt5067 = arg3.method3057();
			arg1.anInt5080 = 0;
			if (arg1.aBoolean345) {
				arg1.anInt5064 += arg1.anInt5113;
				arg1.anInt5082 = 0;
				arg1.anInt5003 += arg1.anInt5108;
				arg1.anInt5055 += arg1.anInt5108;
				arg1.anInt5031 += arg1.anInt5113;
			} else {
				arg1.anInt5031 += arg1.anIntArray362[0];
				arg1.anInt5003 += arg1.anIntArray361[0];
				arg1.anInt5082 = 1;
				arg1.anInt5064 += arg1.anIntArray362[0];
				arg1.anInt5055 += arg1.anIntArray361[0];
			}
		}
		@Pc(185) int local185;
		@Pc(189) int local189;
		if ((arg0 & 0x40) != 0) {
			local19 = arg3.method3056();
			local185 = arg3.method3016();
			local189 = arg3.method3016();
			@Pc(192) int local192 = arg3.anInt3400;
			@Pc(203) boolean local203 = (local19 & 0x8000) != 0;
			if (arg1.aString36 != null && arg1.aClass258_1 != null) {
				@Pc(211) boolean local211 = false;
				if (local185 <= 1) {
					if (!local203 && (Static320.aBoolean413 && !Static258.aBoolean339 || Static231.aBoolean483)) {
						local211 = true;
					} else if (Static32.method1279(arg1.aString36)) {
						local211 = true;
					}
				}
				if (!local211 && Static423.anInt8969 == 0) {
					Static265.aClass1_Sub13_4.anInt3400 = 0;
					arg3.method3082(Static265.aClass1_Sub13_4.aByteArray45, local189);
					Static265.aClass1_Sub13_4.anInt3400 = 0;
					@Pc(256) int local256 = -1;
					@Pc(264) String local264;
					if (local203) {
						local19 &= 0x7FFF;
						@Pc(273) Class298 local273 = Static26.method1175(Static265.aClass1_Sub13_4);
						local256 = local273.anInt8545;
						local264 = local273.aClass1_Sub1_Sub17_1.method5816(Static265.aClass1_Sub13_4);
					} else {
						local264 = Static236.method4026(Static398.method5999(Static265.aClass1_Sub13_4));
					}
					arg1.aString35 = local264.trim();
					arg1.anInt5043 = 150;
					arg1.anInt5000 = local19 >> 8;
					arg1.anInt5014 = local19 & 0xFF;
					@Pc(315) int local315;
					if (local185 == 1 || local185 == 2) {
						local315 = local203 ? 17 : 1;
					} else {
						local315 = local203 ? 17 : 2;
					}
					if (local185 == 2) {
						Static49.method1492("<img=1>" + arg1.method4371(), null, local264, "<img=1>" + arg1.method4375(), 0, local315, local256);
					} else if (local185 == 1) {
						Static49.method1492("<img=0>" + arg1.method4371(), null, local264, "<img=0>" + arg1.method4375(), 0, local315, local256);
					} else {
						Static49.method1492(arg1.method4371(), null, local264, arg1.method4375(), 0, local315, local256);
					}
				}
			}
			arg3.anInt3400 = local189 + local192;
		}
		if ((arg0 & 0x800) != 0) {
			local19 = arg3.method3053();
			if (local19 == 65535) {
				local19 = -1;
			}
			local185 = arg3.method3026();
			local189 = arg3.method3043();
			arg1.method4357(local185, false, local189, local19);
		}
		if ((arg0 & 0x2000) != 0) {
			local19 = arg3.method3053();
			arg1.anInt5050 = arg3.method3043();
			arg1.anInt5015 = arg3.method3072();
			arg1.anInt5069 = local19 & 0x7FFF;
			arg1.aBoolean341 = (local19 & 0x8000) != 0;
			arg1.anInt5060 = arg1.anInt5050 + Static416.anInt7252 + arg1.anInt5069;
		}
		if ((arg0 & 0x20000) != 0) {
			local19 = arg3.method3056();
			local185 = arg3.method3029();
			if (local19 == 65535) {
				local19 = -1;
			}
			local189 = arg3.method3016();
			arg1.method4357(local185, true, local189, local19);
		}
		if ((arg0 & 0x1) != 0) {
			local19 = arg3.method3035();
			if (local19 == 65535) {
				local19 = -1;
			}
			local185 = arg3.method3057();
			Static46.method1412(local19, local185, arg1);
		}
		if ((arg0 & 0x4) != 0) {
			arg1.anInt5084 = arg3.method3056();
			if (arg1.anInt5082 == 0) {
				arg1.method4364(arg1.anInt5084);
				arg1.anInt5084 = -1;
			}
		}
		if ((arg0 & 0x80) != 0) {
			Static31.aByteArray13[arg2] = arg3.method3073();
		}
		if ((arg0 & 0x40000) != 0) {
			arg1.aByte49 = arg3.method3079();
			arg1.aByte48 = arg3.method3044();
			arg1.aByte47 = arg3.method3044();
			arg1.aByte46 = (byte) arg3.method3072();
			arg1.anInt5079 = Static416.anInt7252 + arg3.method3027();
			arg1.anInt5034 = Static416.anInt7252 + arg3.method3027();
		}
		if ((arg0 & 0x10000) != 0) {
			local19 = arg3.method3072();
			@Pc(635) int[] local635 = new int[local19];
			@Pc(638) int[] local638 = new int[local19];
			@Pc(641) int[] local641 = new int[local19];
			for (@Pc(643) int local643 = 0; local643 < local19; local643++) {
				@Pc(650) int local650 = arg3.method3027();
				if (local650 == 65535) {
					local650 = -1;
				}
				local635[local643] = local650;
				local638[local643] = arg3.method3043();
				local641[local643] = arg3.method3035();
			}
			Static428.method2375(local638, local641, local635, arg1);
		}
		if ((arg0 & 0x100) != 0) {
			local45 = arg3.method3063();
		}
		if ((arg0 & 0x200) != 0) {
			arg1.aBoolean346 = arg3.method3043() == 1;
		}
		if ((arg0 & 0x10) != 0) {
			local19 = arg3.method3066();
			local185 = arg3.method3016();
			arg1.method4363(local19, Static416.anInt7252, local185);
			arg1.anInt5046 = Static416.anInt7252 + 300;
			arg1.anInt5062 = arg3.method3057();
		}
		if ((arg0 & 0x400) != 0) {
			local19 = Static416.anInt7252;
			local185 = arg3.method3066();
			local189 = arg3.method3043();
			arg1.method4363(local185, local19, local189);
		}
		if ((arg0 & 0x2) != 0) {
			local19 = arg3.method3053();
			if (local19 == 65535) {
				local19 = -1;
			}
			arg1.anInt5061 = local19;
		}
		if ((arg0 & 0x4000) != 0) {
			arg1.aString35 = arg3.method3034();
			if (arg1.aString35.charAt(0) == '~') {
				arg1.aString35 = arg1.aString35.substring(1);
				Static310.method5136(arg1.method4375(), arg1.method4371(), 2, 0, arg1.aString35);
			} else if (arg1 == Static16.aClass47_Sub2_Sub3_Sub2_1) {
				Static310.method5136(arg1.method4375(), arg1.method4371(), 2, 0, arg1.aString35);
			}
			arg1.anInt5000 = 0;
			arg1.anInt5014 = 0;
			arg1.anInt5043 = 150;
		}
		if (!arg1.aBoolean345) {
			return;
		}
		if (local45 == 127) {
			arg1.method4378(arg1.anInt5108, arg1.anInt5113);
			return;
		}
		@Pc(864) byte local864;
		if (local45 == -1) {
			local864 = Static31.aByteArray13[arg2];
		} else {
			local864 = local45;
		}
		arg1.method4377(arg1.anInt5108, arg1.anInt5113, local864);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!us;B)I")
	public static int method816(@OriginalArg(0) Class295 arg0) {
		if (Static453.aClass295_5 == arg0) {
			return 7681;
		} else if (arg0 == Static74.aClass295_2) {
			return 8448;
		} else if (Static269.aClass295_3 == arg0) {
			return 34165;
		} else if (Static361.aClass295_4 == arg0) {
			return 260;
		} else if (arg0 == Static38.aClass295_1) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BLclient!gba;)V")
	public static void method818(@OriginalArg(1) Class1_Sub13_Sub2 arg0) {
		@Pc(5) int local5 = 0;
		arg0.method3086();
		@Pc(15) int local15;
		@Pc(45) int local45;
		for (@Pc(10) int local10 = 0; local10 < Static412.anInt7191; local10++) {
			local15 = Static349.anIntArray479[local10];
			if ((Static38.aByteArray14[local15] & 0x1) == 0) {
				if (local5 > 0) {
					Static38.aByteArray14[local15] = (byte) (Static38.aByteArray14[local15] | 0x2);
					local5--;
				} else {
					local45 = arg0.method3087(1);
					if (local45 == 0) {
						local5 = Static487.method7050(arg0);
						Static38.aByteArray14[local15] = (byte) (Static38.aByteArray14[local15] | 0x2);
					} else {
						Static197.method3652(arg0, local15);
					}
				}
			}
		}
		arg0.method3091();
		if (local5 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method3086();
		@Pc(127) int local127;
		for (local15 = 0; local15 < Static412.anInt7191; local15++) {
			local45 = Static349.anIntArray479[local15];
			if ((Static38.aByteArray14[local45] & 0x1) != 0) {
				if (local5 > 0) {
					Static38.aByteArray14[local45] = (byte) (Static38.aByteArray14[local45] | 0x2);
					local5--;
				} else {
					local127 = arg0.method3087(1);
					if (local127 == 0) {
						local5 = Static487.method7050(arg0);
						Static38.aByteArray14[local45] = (byte) (Static38.aByteArray14[local45] | 0x2);
					} else {
						Static197.method3652(arg0, local45);
					}
				}
			}
		}
		arg0.method3091();
		if (local5 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method3086();
		@Pc(198) int local198;
		for (local45 = 0; local45 < Static457.anInt7806; local45++) {
			local127 = Static430.anIntArray587[local45];
			if ((Static38.aByteArray14[local127] & 0x1) != 0) {
				if (local5 > 0) {
					local5--;
					Static38.aByteArray14[local127] = (byte) (Static38.aByteArray14[local127] | 0x2);
				} else {
					local198 = arg0.method3087(1);
					if (local198 == 0) {
						local5 = Static487.method7050(arg0);
						Static38.aByteArray14[local127] = (byte) (Static38.aByteArray14[local127] | 0x2);
					} else if (Static65.method7160(local127, arg0)) {
						Static38.aByteArray14[local127] = (byte) (Static38.aByteArray14[local127] | 0x2);
					}
				}
			}
		}
		arg0.method3091();
		if (local5 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method3086();
		for (local127 = 0; local127 < Static457.anInt7806; local127++) {
			local198 = Static430.anIntArray587[local127];
			if ((Static38.aByteArray14[local198] & 0x1) == 0) {
				if (local5 > 0) {
					Static38.aByteArray14[local198] = (byte) (Static38.aByteArray14[local198] | 0x2);
					local5--;
				} else {
					@Pc(284) int local284 = arg0.method3087(1);
					if (local284 == 0) {
						local5 = Static487.method7050(arg0);
						Static38.aByteArray14[local198] = (byte) (Static38.aByteArray14[local198] | 0x2);
					} else if (Static65.method7160(local198, arg0)) {
						Static38.aByteArray14[local198] = (byte) (Static38.aByteArray14[local198] | 0x2);
					}
				}
			}
		}
		arg0.method3091();
		if (local5 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static457.anInt7806 = 0;
		Static412.anInt7191 = 0;
		for (local198 = 1; local198 < 2048; local198++) {
			Static38.aByteArray14[local198] = (byte) (Static38.aByteArray14[local198] >> 1);
			@Pc(354) Class47_Sub2_Sub3_Sub2 local354 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local198];
			if (local354 == null) {
				Static430.anIntArray587[Static457.anInt7806++] = local198;
			} else {
				Static349.anIntArray479[Static412.anInt7191++] = local198;
			}
		}
	}
}
