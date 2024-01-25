import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!sr", name = "gb", descriptor = "Lclient!rj;")
	public static Class276 aClass276_4;

	@OriginalMember(owner = "client!sr", name = "y", descriptor = "Z")
	public static boolean aBoolean543 = true;

	@OriginalMember(owner = "client!sr", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString98 = null;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIIIIBII)V")
	public static void method6605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static354.method5292(arg1)) {
			return;
		}
		if (Static538.aClass97ArrayArray2[arg1] == null) {
			Static65.method855(Static375.aClass97ArrayArray1[arg1], -1, arg3, arg5, arg6, arg4, arg7, arg0, arg8, arg2);
		} else {
			Static65.method855(Static538.aClass97ArrayArray2[arg1], -1, arg3, arg5, arg6, arg4, arg7, arg0, arg8, arg2);
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!ud;IIILclient!qe;)V")
	public static void method6611(@OriginalArg(0) Class29_Sub2_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class6_Sub14_Sub2 arg3) {
		if ((arg2 & 0x200) != 0) {
			arg0.aBoolean601 = arg3.method6026() == 1;
		}
		@Pc(28) byte local28 = -1;
		@Pc(39) int local39;
		if ((arg2 & 0x4000) != 0) {
			local39 = arg3.method6026();
			@Pc(42) int[] local42 = new int[local39];
			@Pc(45) int[] local45 = new int[local39];
			@Pc(48) int[] local48 = new int[local39];
			for (@Pc(50) int local50 = 0; local50 < local39; local50++) {
				@Pc(56) int local56 = arg3.method5996();
				if (local56 == 65535) {
					local56 = -1;
				}
				local42[local50] = local56;
				local45[local50] = arg3.method6020();
				local48[local50] = arg3.method6006();
			}
			Static514.method7077(arg0, local42, local45, local48);
		}
		@Pc(105) int local105;
		@Pc(109) int local109;
		if ((arg2 & 0x10000) != 0) {
			local39 = Static358.anInt6263;
			local105 = arg3.method5998();
			local109 = arg3.method6020();
			arg0.method6999(local105, local109, local39);
		}
		if ((arg2 & 0x20000) != 0) {
			arg0.aByte99 = arg3.method6034();
			arg0.lb = arg3.method6034();
			arg0.aByte97 = arg3.method6025();
			arg0.aByte98 = (byte) arg3.method6041();
			arg0.anInt8565 = Static358.anInt6263 + arg3.method6032();
			arg0.anInt8578 = Static358.anInt6263 + arg3.method5996();
		}
		if ((arg2 & 0x80) != 0) {
			local39 = arg3.method6032();
			if (local39 == 65535) {
				local39 = -1;
			}
			local105 = arg3.method6020();
			Static330.method5147(arg0, local105, local39);
		}
		if ((arg2 & 0x8000) != 0) {
			arg0.anInt8506 = arg3.method5983();
			arg0.anInt8547 = arg3.method6025();
			arg0.anInt8570 = arg3.method5983();
			arg0.anInt8559 = arg3.method5983();
			arg0.anInt8507 = arg3.method5982() + Static358.anInt6263;
			arg0.anInt8567 = arg3.method5996() + Static358.anInt6263;
			arg0.anInt8552 = arg3.method6041();
			arg0.anInt8583 = 0;
			if (arg0.aBoolean603) {
				arg0.anInt8506 += arg0.anInt8612;
				arg0.anInt8547 += arg0.anInt8593;
				arg0.anInt8559 += arg0.anInt8593;
				arg0.anInt8570 += arg0.anInt8612;
				arg0.anInt8582 = 0;
			} else {
				arg0.anInt8582 = 1;
				arg0.anInt8506 += arg0.anIntArray661[0];
				arg0.anInt8559 += arg0.anIntArray660[0];
				arg0.anInt8547 += arg0.anIntArray660[0];
				arg0.anInt8570 += arg0.anIntArray661[0];
			}
		}
		if ((arg2 & 0x1000) != 0) {
			local39 = arg3.method6032();
			local105 = arg3.method6027();
			if (local39 == 65535) {
				local39 = -1;
			}
			local109 = arg3.method6041();
			arg0.method7000(true, local39, local109, local105);
		}
		if ((arg2 & 0x10) != 0) {
			Static556.aByteArray122[arg1] = arg3.method6025();
		}
		if ((arg2 & 0x400) != 0) {
			arg0.aString106 = arg3.method5991();
			if (arg0.aString106.charAt(0) == '~') {
				arg0.aString106 = arg0.aString106.substring(1);
				Static164.method2396(arg0.method7017(), 2, arg0.method7018(), arg0.aString106, 0, arg0.aString107);
			} else if (Static426.aClass29_Sub2_Sub1_Sub2_2 == arg0) {
				Static164.method2396(arg0.method7017(), 2, arg0.method7018(), arg0.aString106, 0, arg0.aString107);
			}
			arg0.anInt8521 = 0;
			arg0.anInt8524 = 150;
			arg0.anInt8533 = 0;
		}
		if ((arg2 & 0x2) != 0) {
			local39 = arg3.method6032();
			if (local39 == 65535) {
				local39 = -1;
			}
			arg0.anInt8513 = local39;
		}
		if ((arg2 & 0x20) != 0) {
			local39 = arg3.method6020();
			@Pc(454) byte[] local454 = new byte[local39];
			@Pc(459) Class6_Sub14 local459 = new Class6_Sub14(local454);
			arg3.method5979(local454, local39);
			Static167.aClass6_Sub14Array1[arg1] = local459;
			arg0.method7020(local459);
		}
		if ((arg2 & 0x100) != 0) {
			local39 = arg3.method6006();
			arg0.anInt8579 = arg3.method6020();
			arg0.anInt8554 = arg3.method6020();
			arg0.anInt8522 = local39 & 0x7FFF;
			arg0.aBoolean599 = (local39 & 0x8000) != 0;
			arg0.anInt8575 = arg0.anInt8579 + arg0.anInt8522 + Static358.anInt6263;
		}
		if ((arg2 & 0x2000) != 0) {
			local28 = arg3.method6025();
		}
		if ((arg2 & 0x40) != 0) {
			local39 = arg3.method5998();
			local105 = arg3.method6041();
			arg0.method6999(local39, local105, Static358.anInt6263);
			arg0.anInt8514 = Static358.anInt6263 + 300;
			arg0.anInt8564 = arg3.method6041();
		}
		if ((arg2 & 0x4) != 0) {
			arg0.anInt8601 = arg3.method5996();
			if (arg0.anInt8582 == 0) {
				arg0.method6998(arg0.anInt8601);
				arg0.anInt8601 = -1;
			}
		}
		if ((arg2 & 0x8) != 0) {
			local39 = arg3.method5982();
			local105 = arg3.method6013();
			if (local39 == 65535) {
				local39 = -1;
			}
			local109 = arg3.method6020();
			arg0.method7000(false, local39, local109, local105);
		}
		if (!arg0.aBoolean603) {
			return;
		}
		if (local28 == 127) {
			arg0.method7024(arg0.anInt8612, arg0.anInt8593);
			return;
		}
		@Pc(632) byte local632;
		if (local28 == -1) {
			local632 = Static556.aByteArray122[arg1];
		} else {
			local632 = local28;
		}
		arg0.method7023(local632, arg0.anInt8612, arg0.anInt8593);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIBIIII)V")
	public static void method6613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static441.method6337(arg2);
		@Pc(18) int local18 = 0;
		@Pc(23) int local23 = arg2 - arg4;
		if (local23 < 0) {
			local23 = 0;
		}
		@Pc(29) int local29 = arg2;
		@Pc(32) int local32 = -arg2;
		@Pc(34) int local34 = local23;
		@Pc(37) int local37 = -local23;
		@Pc(39) int local39 = -1;
		@Pc(41) int local41 = -1;
		@Pc(68) int local68;
		@Pc(76) int local76;
		@Pc(84) int local84;
		@Pc(93) int local93;
		if (Static134.anInt2364 <= arg1 && arg1 <= Static60.anInt971) {
			@Pc(59) int[] local59 = Static503.anIntArrayArray12[arg1];
			local68 = Static112.method1759(arg3 - arg2, Static235.anInt3970, Static151.anInt2683);
			local76 = Static112.method1759(arg3 + arg2, Static235.anInt3970, Static151.anInt2683);
			local84 = Static112.method1759(arg3 - local23, Static235.anInt3970, Static151.anInt2683);
			local93 = Static112.method1759(arg3 + local23, Static235.anInt3970, Static151.anInt2683);
			Static455.method6536(local84, local68, arg5, local59);
			Static455.method6536(local93, local84, arg0, local59);
			Static455.method6536(local76, local93, arg5, local59);
		}
		while (local18 < local29) {
			local39 += 2;
			local41 += 2;
			local32 += local39;
			local37 += local41;
			if (local37 >= 0 && local34 >= 1) {
				local34--;
				local37 -= local34 << 1;
				Static305.anIntArray471[local34] = local18;
			}
			local18++;
			@Pc(204) int local204;
			@Pc(213) int local213;
			@Pc(220) int[] local220;
			@Pc(159) int local159;
			if (local32 >= 0) {
				local29--;
				local32 -= local29 << 1;
				local159 = arg1 - local29;
				local68 = local29 + arg1;
				if (Static134.anInt2364 <= local68 && local159 <= Static60.anInt971) {
					if (local29 < local23) {
						local76 = Static305.anIntArray471[local29];
						local84 = Static112.method1759(local18 + arg3, Static235.anInt3970, Static151.anInt2683);
						local93 = Static112.method1759(arg3 - local18, Static235.anInt3970, Static151.anInt2683);
						local204 = Static112.method1759(arg3 + local76, Static235.anInt3970, Static151.anInt2683);
						local213 = Static112.method1759(arg3 - local76, Static235.anInt3970, Static151.anInt2683);
						if (Static60.anInt971 >= local68) {
							local220 = Static503.anIntArrayArray12[local68];
							Static455.method6536(local213, local93, arg5, local220);
							Static455.method6536(local204, local213, arg0, local220);
							Static455.method6536(local84, local204, arg5, local220);
						}
						if (Static134.anInt2364 <= local159) {
							local220 = Static503.anIntArrayArray12[local159];
							Static455.method6536(local213, local93, arg5, local220);
							Static455.method6536(local204, local213, arg0, local220);
							Static455.method6536(local84, local204, arg5, local220);
						}
					} else {
						local76 = Static112.method1759(local18 + arg3, Static235.anInt3970, Static151.anInt2683);
						local84 = Static112.method1759(arg3 - local18, Static235.anInt3970, Static151.anInt2683);
						if (Static60.anInt971 >= local68) {
							Static455.method6536(local76, local84, arg5, Static503.anIntArrayArray12[local68]);
						}
						if (local159 >= Static134.anInt2364) {
							Static455.method6536(local76, local84, arg5, Static503.anIntArrayArray12[local159]);
						}
					}
				}
			}
			local159 = arg1 - local18;
			local68 = local18 + arg1;
			if (Static134.anInt2364 <= local68 && Static60.anInt971 >= local159) {
				local76 = local29 + arg3;
				local84 = arg3 - local29;
				if (Static235.anInt3970 <= local76 && local84 <= Static151.anInt2683) {
					local76 = Static112.method1759(local76, Static235.anInt3970, Static151.anInt2683);
					local84 = Static112.method1759(local84, Static235.anInt3970, Static151.anInt2683);
					if (local18 >= local23) {
						if (local68 <= Static60.anInt971) {
							Static455.method6536(local76, local84, arg5, Static503.anIntArrayArray12[local68]);
						}
						if (local159 >= Static134.anInt2364) {
							Static455.method6536(local76, local84, arg5, Static503.anIntArrayArray12[local159]);
						}
					} else {
						local93 = local34 < local18 ? Static305.anIntArray471[local18] : local34;
						local204 = Static112.method1759(arg3 + local93, Static235.anInt3970, Static151.anInt2683);
						local213 = Static112.method1759(arg3 - local93, Static235.anInt3970, Static151.anInt2683);
						if (Static60.anInt971 >= local68) {
							local220 = Static503.anIntArrayArray12[local68];
							Static455.method6536(local213, local84, arg5, local220);
							Static455.method6536(local204, local213, arg0, local220);
							Static455.method6536(local76, local204, arg5, local220);
						}
						if (Static134.anInt2364 <= local159) {
							local220 = Static503.anIntArrayArray12[local159];
							Static455.method6536(local213, local84, arg5, local220);
							Static455.method6536(local204, local213, arg0, local220);
							Static455.method6536(local76, local204, arg5, local220);
						}
					}
				}
			}
		}
	}
}
