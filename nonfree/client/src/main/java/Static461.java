import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!pda", name = "n", descriptor = "I")
	public static int anInt7683 = 0;

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "Lclient!bd;")
	public static Class32 aClass32_44 = new Class32();

	@OriginalMember(owner = "client!pda", name = "o", descriptor = "Z")
	public static boolean aBoolean540 = false;

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(IZ)Z")
	public static boolean method6793(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(ILclient!rea;)V")
	public static void method6794(@OriginalArg(1) Class14_Sub21_Sub2 arg0) {
		@Pc(5) int local5 = 0;
		arg0.method7766();
		@Pc(15) int local15;
		@Pc(48) int local48;
		for (@Pc(10) int local10 = 0; local10 < Static258.anInt4846; local10++) {
			local15 = Static43.anIntArray35[local10];
			if ((Static244.aByteArray56[local15] & 0x1) == 0) {
				if (local5 > 0) {
					Static244.aByteArray56[local15] = (byte) (Static244.aByteArray56[local15] | 0x2);
					local5--;
				} else {
					local48 = arg0.method7764(1);
					if (local48 == 0) {
						local5 = Static370.method5552(arg0);
						Static244.aByteArray56[local15] = (byte) (Static244.aByteArray56[local15] | 0x2);
					} else {
						Static187.method2753(local15, arg0);
					}
				}
			}
		}
		arg0.method7768();
		if (local5 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method7766();
		@Pc(130) int local130;
		for (local15 = 0; local15 < Static258.anInt4846; local15++) {
			local48 = Static43.anIntArray35[local15];
			if ((Static244.aByteArray56[local48] & 0x1) != 0) {
				if (local5 > 0) {
					local5--;
					Static244.aByteArray56[local48] = (byte) (Static244.aByteArray56[local48] | 0x2);
				} else {
					local130 = arg0.method7764(1);
					if (local130 == 0) {
						local5 = Static370.method5552(arg0);
						Static244.aByteArray56[local48] = (byte) (Static244.aByteArray56[local48] | 0x2);
					} else {
						Static187.method2753(local48, arg0);
					}
				}
			}
		}
		arg0.method7768();
		if (local5 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method7766();
		@Pc(222) int local222;
		for (local48 = 0; local48 < Static363.anInt6202; local48++) {
			local130 = Static367.anIntArray340[local48];
			if ((Static244.aByteArray56[local130] & 0x1) != 0) {
				if (local5 > 0) {
					local5--;
					Static244.aByteArray56[local130] = (byte) (Static244.aByteArray56[local130] | 0x2);
				} else {
					local222 = arg0.method7764(1);
					if (local222 == 0) {
						local5 = Static370.method5552(arg0);
						Static244.aByteArray56[local130] = (byte) (Static244.aByteArray56[local130] | 0x2);
					} else if (Static323.method5070(local130, arg0)) {
						Static244.aByteArray56[local130] = (byte) (Static244.aByteArray56[local130] | 0x2);
					}
				}
			}
		}
		arg0.method7768();
		if (local5 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method7766();
		for (local130 = 0; local130 < Static363.anInt6202; local130++) {
			local222 = Static367.anIntArray340[local130];
			if ((Static244.aByteArray56[local222] & 0x1) == 0) {
				if (local5 > 0) {
					Static244.aByteArray56[local222] = (byte) (Static244.aByteArray56[local222] | 0x2);
					local5--;
				} else {
					@Pc(322) int local322 = arg0.method7764(1);
					if (local322 == 0) {
						local5 = Static370.method5552(arg0);
						Static244.aByteArray56[local222] = (byte) (Static244.aByteArray56[local222] | 0x2);
					} else if (Static323.method5070(local222, arg0)) {
						Static244.aByteArray56[local222] = (byte) (Static244.aByteArray56[local222] | 0x2);
					}
				}
			}
		}
		arg0.method7768();
		if (local5 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static258.anInt4846 = 0;
		Static363.anInt6202 = 0;
		for (local222 = 1; local222 < 2048; local222++) {
			Static244.aByteArray56[local222] = (byte) (Static244.aByteArray56[local222] >> 1);
			@Pc(396) Class4_Sub3_Sub3_Sub3_Sub2 local396 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local222];
			if (local396 == null) {
				Static367.anIntArray340[Static363.anInt6202++] = local222;
			} else {
				Static43.anIntArray35[Static258.anInt4846++] = local222;
			}
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(IILclient!jc;Lclient!iha;)V")
	public static void method6796(@OriginalArg(0) int arg0, @OriginalArg(2) Class14_Sub21 arg1, @OriginalArg(3) Class173 arg2) {
		@Pc(9) Class14_Sub15 local9 = new Class14_Sub15();
		local9.anInt2025 = arg1.method7695(99);
		local9.anInt2023 = arg1.method7748();
		local9.anIntArray129 = new int[local9.anInt2025];
		local9.aClass230Array1 = new Class230[local9.anInt2025];
		local9.aClass230Array2 = new Class230[local9.anInt2025];
		local9.aByteArrayArrayArray9 = new byte[local9.anInt2025][][];
		local9.anIntArray130 = new int[local9.anInt2025];
		local9.anIntArray131 = new int[local9.anInt2025];
		for (@Pc(58) int local58 = 0; local58 < local9.anInt2025; local58++) {
			try {
				@Pc(64) int local64 = arg1.method7695(126);
				@Pc(87) String local87;
				@Pc(91) String local91;
				@Pc(93) int local93;
				if (local64 == 0 || local64 == 1 || local64 == 2) {
					local87 = arg1.method7703(0);
					local91 = arg1.method7703(0);
					local93 = 0;
					if (local64 == 1) {
						local93 = arg1.method7748();
					}
					local9.anIntArray129[local58] = local64;
					local9.anIntArray131[local58] = local93;
					local9.aClass230Array2[local58] = arg2.method4244(Static528.method7834(local87), local91);
				} else if (local64 == 3 || local64 == 4) {
					local87 = arg1.method7703(0);
					local91 = arg1.method7703(0);
					local93 = arg1.method7695(127);
					@Pc(150) String[] local150 = new String[local93];
					for (@Pc(152) int local152 = 0; local152 < local93; local152++) {
						local150[local152] = arg1.method7703(0);
					}
					@Pc(169) byte[][] local169 = new byte[local93][];
					@Pc(184) int local184;
					if (local64 == 3) {
						for (@Pc(178) int local178 = 0; local178 < local93; local178++) {
							local184 = arg1.method7748();
							local169[local178] = new byte[local184];
							arg1.method7750(local184, 0, local169[local178]);
						}
					}
					local9.anIntArray129[local58] = local64;
					@Pc(209) Class[] local209 = new Class[local93];
					for (local184 = 0; local184 < local93; local184++) {
						local209[local184] = Static528.method7834(local150[local184]);
					}
					local9.aClass230Array1[local58] = arg2.method4245(local209, Static528.method7834(local87), local91);
					local9.aByteArrayArrayArray9[local58] = local169;
				}
			} catch (@Pc(248) ClassNotFoundException local248) {
				local9.anIntArray130[local58] = -1;
			} catch (@Pc(255) SecurityException local255) {
				local9.anIntArray130[local58] = -2;
			} catch (@Pc(262) NullPointerException local262) {
				local9.anIntArray130[local58] = -3;
			} catch (@Pc(269) Exception local269) {
				local9.anIntArray130[local58] = -4;
			} catch (@Pc(276) Throwable local276) {
				local9.anIntArray130[local58] = -5;
			}
		}
		Static79.aClass32_5.method582(local9);
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(IIII)I")
	public static int method6801(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg2 >> 1) + (arg1 >> 5 << 7) + ((arg0 >> 2 & 0x3F) << 10);
	}
}
