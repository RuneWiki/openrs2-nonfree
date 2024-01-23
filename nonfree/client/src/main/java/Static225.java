import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!qh", name = "C", descriptor = "Lclient!fh;")
	public static Class58 aClass58_83;

	@OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
	public static int anInt4325 = -1;

	@OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
	public static int anInt4330 = 0;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIILclient!f;)V")
	public static void method3602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class53_Sub1_Sub1 arg2) {
		@Pc(14) int local14;
		@Pc(18) int local18;
		if ((arg1 & 0x1) != 0) {
			local14 = Static189.aClass4_Sub10_Sub1_2.method4616();
			local18 = Static189.aClass4_Sub10_Sub1_2.method4666();
			arg2.method3317(Static50.anInt954, local18, local14);
			arg2.anInt3993 = Static50.anInt954 + 300;
			arg2.anInt4022 = Static189.aClass4_Sub10_Sub1_2.method4626();
		}
		if ((arg1 & 0x2) != 0) {
			local14 = Static189.aClass4_Sub10_Sub1_2.method4653();
			if (local14 == 65535) {
				local14 = -1;
			}
			local18 = Static189.aClass4_Sub10_Sub1_2.method4666();
			Static313.method4830(arg2, local14, local18);
		}
		if ((arg1 & 0x8) != 0) {
			local14 = Static189.aClass4_Sub10_Sub1_2.method4626();
			@Pc(71) byte[] local71 = new byte[local14];
			@Pc(76) Class4_Sub10 local76 = new Class4_Sub10(local71);
			Static189.aClass4_Sub10_Sub1_2.method4637(local71, local14);
			Static242.aClass4_Sub10Array1[arg0] = local76;
			arg2.method1170(local76);
		}
		if ((arg1 & 0x4) != 0) {
			arg2.anInt4014 = Static189.aClass4_Sub10_Sub1_2.method4672();
			arg2.anInt4003 = Static189.aClass4_Sub10_Sub1_2.method4653();
		}
		if ((arg1 & 0x800) != 0) {
			local14 = Static189.aClass4_Sub10_Sub1_2.method4660();
			@Pc(120) int[] local120 = new int[local14];
			@Pc(123) int[] local123 = new int[local14];
			@Pc(126) int[] local126 = new int[local14];
			for (@Pc(128) int local128 = 0; local128 < local14; local128++) {
				@Pc(135) int local135 = Static189.aClass4_Sub10_Sub1_2.method4653();
				if (local135 == 65535) {
					local135 = -1;
				}
				local120[local128] = local135;
				local123[local128] = Static189.aClass4_Sub10_Sub1_2.method4642();
				local126[local128] = Static189.aClass4_Sub10_Sub1_2.method4625();
			}
			Static257.method4060(local126, arg2, local123, local120);
		}
		if ((arg1 & 0x10) != 0) {
			arg2.aString234 = Static189.aClass4_Sub10_Sub1_2.method4630();
			if (arg2.aString234.charAt(0) == '~') {
				arg2.aString234 = arg2.aString234.substring(1);
				Static186.method4394(arg2.method1173(), 2, arg2.aString234);
			} else if (arg2 == Static154.aClass53_Sub1_Sub1_2) {
				Static186.method4394(arg2.method1173(), 2, arg2.aString234);
			}
			arg2.anInt3998 = 0;
			arg2.anInt3981 = 0;
			arg2.anInt4023 = 150;
		}
		@Pc(248) int local248;
		@Pc(251) int local251;
		if ((arg1 & 0x20) != 0) {
			local14 = Static189.aClass4_Sub10_Sub1_2.method4667();
			local18 = Static189.aClass4_Sub10_Sub1_2.method4660();
			@Pc(244) boolean local244 = (local14 & 0x8000) != 0;
			local248 = Static189.aClass4_Sub10_Sub1_2.method4642();
			local251 = Static189.aClass4_Sub10_Sub1_2.anInt5713;
			if (arg2.aString88 != null && arg2.aClass147_2 != null) {
				@Pc(264) long local264 = Static108.method1747(arg2.aString88);
				@Pc(266) boolean local266 = false;
				if (local18 <= 1) {
					if (!local244 && (Static42.aBoolean47 && !Static207.aBoolean287 || Static60.aBoolean67)) {
						local266 = true;
					} else {
						for (@Pc(284) int local284 = 0; local284 < Static239.anInt4517; local284++) {
							if (local264 == Static132.aLongArray16[local284]) {
								local266 = true;
								break;
							}
						}
					}
				}
				if (!local266 && Static112.anInt5406 == 0) {
					Static192.aClass4_Sub10_8.anInt5713 = 0;
					@Pc(314) int local314 = -1;
					Static189.aClass4_Sub10_Sub1_2.method4671(local248, Static192.aClass4_Sub10_8.aByteArray71);
					Static192.aClass4_Sub10_8.anInt5713 = 0;
					@Pc(333) String local333;
					if (local244) {
						local14 &= 0x7FFF;
						@Pc(343) Class27 local343 = Static170.method2714(Static192.aClass4_Sub10_8);
						local314 = local343.anInt540;
						local333 = local343.aClass4_Sub3_Sub11_1.method1910(Static192.aClass4_Sub10_8);
					} else {
						local333 = Static97.method2272(method3606(Static7.method110(Static192.aClass4_Sub10_8)));
					}
					arg2.aString234 = local333.trim();
					arg2.anInt3998 = local14 & 0xFF;
					arg2.anInt4023 = 150;
					arg2.anInt3981 = local14 >> 8;
					if (local18 == 2) {
						Static181.method2940("<img=1>" + arg2.method1173(), local314, null, local244 ? 17 : 1, local333);
					} else if (local18 == 1) {
						Static181.method2940("<img=0>" + arg2.method1173(), local314, null, local244 ? 17 : 1, local333);
					} else {
						Static181.method2940(arg2.method1173(), local314, null, local244 ? 17 : 2, local333);
					}
				}
			}
			Static189.aClass4_Sub10_Sub1_2.anInt5713 = local251 + local248;
		}
		if ((arg1 & 0x100) != 0) {
			local14 = Static189.aClass4_Sub10_Sub1_2.method4672();
			local18 = Static189.aClass4_Sub10_Sub1_2.method4632();
			@Pc(456) boolean local456 = true;
			if (local14 == 65535) {
				local14 = -1;
			}
			if (local14 != -1 && arg2.anInt3961 != -1 && Static156.method2501(Static132.method2005(local14).anInt3134).anInt1243 < Static156.method2501(Static132.method2005(arg2.anInt3961).anInt3134).anInt1243) {
				local456 = false;
			}
			if (local456) {
				arg2.anInt3976 = 1;
				arg2.anInt3971 = local18 >> 16;
				arg2.anInt3968 = 0;
				arg2.anInt4026 = 0;
				arg2.anInt3984 = (local18 & 0xFFFF) + Static50.anInt954;
				if (Static50.anInt954 < arg2.anInt3984) {
					arg2.anInt4026 = -1;
				}
				arg2.anInt3961 = local14;
				if (arg2.anInt3961 != -1 && Static50.anInt954 == arg2.anInt3984) {
					local251 = Static132.method2005(arg2.anInt3961).anInt3134;
					if (local251 != -1) {
						@Pc(562) Class46 local562 = Static156.method2501(local251);
						if (local562 != null && local562.anIntArray95 != null) {
							Static213.method3474(local562, arg2.anInt4002, arg2.anInt3974, 0, arg2 == Static154.aClass53_Sub1_Sub1_2);
						}
					}
				}
			}
		}
		if ((arg1 & 0x40) != 0) {
			arg2.anInt3985 = Static189.aClass4_Sub10_Sub1_2.method4667();
			if (arg2.anInt3985 == 65535) {
				arg2.anInt3985 = -1;
			}
		}
		if ((arg1 & 0x200) != 0) {
			arg2.anInt3973 = Static189.aClass4_Sub10_Sub1_2.method4660();
			arg2.anInt4033 = Static189.aClass4_Sub10_Sub1_2.method4666();
			arg2.anInt4013 = Static189.aClass4_Sub10_Sub1_2.method4642();
			arg2.anInt4025 = Static189.aClass4_Sub10_Sub1_2.method4660();
			arg2.anInt4034 = Static189.aClass4_Sub10_Sub1_2.method4625() + Static50.anInt954;
			arg2.anInt3966 = Static189.aClass4_Sub10_Sub1_2.method4625() + Static50.anInt954;
			arg2.anInt4008 = Static189.aClass4_Sub10_Sub1_2.method4626();
			arg2.anInt3965 = 1;
			arg2.anInt4030 = 0;
		}
		if ((arg1 & 0x400) != 0) {
			local18 = Static189.aClass4_Sub10_Sub1_2.method4616();
			local248 = Static189.aClass4_Sub10_Sub1_2.method4666();
			arg2.method3317(Static50.anInt954, local248, local18);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(CZ)C")
	private static char method3605(@OriginalArg(0) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method3606(@OriginalArg(1) String arg0) {
		@Pc(4) int local4 = arg0.length();
		@Pc(12) char[] local12 = new char[local4];
		@Pc(18) byte local18 = 2;
		for (@Pc(20) int local20 = 0; local20 < local4; local20++) {
			@Pc(27) char local27 = arg0.charAt(local20);
			if (local18 == 0) {
				local27 = Character.toLowerCase(local27);
			} else if (local18 == 2 || Character.isUpperCase(local27)) {
				local27 = method3605(local27);
			}
			if (Character.isLetter(local27)) {
				local18 = 0;
			} else if (local27 == '.' || local27 == '?' || local27 == '!') {
				local18 = 2;
			} else if (!Character.isSpaceChar(local27)) {
				local18 = 1;
			} else if (local18 != 2) {
				local18 = 1;
			}
			local12[local20] = local27;
		}
		return new String(local12);
	}
}
