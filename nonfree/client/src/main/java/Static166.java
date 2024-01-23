import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!qg", name = "ab", descriptor = "[I")
	public static int[] anIntArray243;

	@OriginalMember(owner = "client!qg", name = "mb", descriptor = "I")
	public static int anInt3737;

	@OriginalMember(owner = "client!qg", name = "Z", descriptor = "I")
	public static int anInt3727 = 0;

	@OriginalMember(owner = "client!qg", name = "jb", descriptor = "I")
	public static int anInt3735 = 0;

	@OriginalMember(owner = "client!qg", name = "lb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1268 = Static64.method1101("<col=ffff00>");

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIILclient!ei;I)Lclient!ei;")
	public static Class5_Sub2 method2844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class5_Sub2 arg5) {
		@Pc(4) long local4 = (long) arg3;
		@Pc(19) Class5_Sub2 local19 = (Class5_Sub2) Static50.aClass53_9.method1501(local4);
		if (local19 == null) {
			@Pc(26) Class5_Sub6 local26 = Static215.method3571(Static181.aClass70_Sub1_51, arg3);
			if (local26 == null) {
				return null;
			}
			local19 = local26.method3582(64, 768, -50, -10, -50);
			Static50.aClass53_9.method1497(local19, local4);
		}
		@Pc(46) int local46 = arg5.method2918();
		@Pc(49) int local49 = arg5.method2914();
		@Pc(52) int local52 = arg5.method2915();
		@Pc(55) int local55 = arg5.method2923();
		local19 = local19.method2916(true, true);
		if (arg1 != 0) {
			local19.method2930(arg1);
		}
		@Pc(68) Class5_Sub2_Sub1 local68 = (Class5_Sub2_Sub1) local19;
		if (arg2 != Static26.method2454(Static197.anInt2422, local52 + arg0, arg4 + local46) || Static26.method2454(Static197.anInt2422, arg0 + local55, local49 + arg4) != arg2) {
			for (@Pc(92) int local92 = 0; local92 < local68.anInt3820; local92++) {
				local68.anIntArray257[local92] += Static26.method2454(Static197.anInt2422, local68.anIntArray256[local92] + arg0, arg4 + local68.anIntArray251[local92]) - arg2;
			}
			local68.aBoolean174 = false;
		}
		return local19;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILclient!ib;II)V")
	public static void method2845(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub1_Sub1 arg1, @OriginalArg(3) int arg2) {
		if ((arg2 & 0x20) != 0) {
			arg1.anInt3621 = Static225.aClass1_Sub16_Sub1_4.method3809();
			if (arg1.anInt3621 == 65535) {
				arg1.anInt3621 = -1;
			}
		}
		if ((arg2 & 0x1) != 0) {
			arg1.anInt3630 = Static225.aClass1_Sub16_Sub1_4.method3805();
			arg1.anInt3614 = Static225.aClass1_Sub16_Sub1_4.method3805();
		}
		@Pc(51) int local51;
		if ((arg2 & 0x100) != 0) {
			arg1.anInt3622 = Static225.aClass1_Sub16_Sub1_4.method3794();
			local51 = Static225.aClass1_Sub16_Sub1_4.method3764();
			arg1.anInt3628 = 0;
			arg1.anInt3611 = local51 >> 16;
			if (arg1.anInt3622 == 65535) {
				arg1.anInt3622 = -1;
			}
			arg1.anInt3605 = 0;
			arg1.anInt3631 = Static109.anInt2430 + (local51 & 0xFFFF);
			if (arg1.anInt3631 > Static109.anInt2430) {
				arg1.anInt3605 = -1;
			}
		}
		@Pc(106) int local106;
		if ((arg2 & 0x200) != 0) {
			local51 = Static225.aClass1_Sub16_Sub1_4.method3793();
			local106 = Static225.aClass1_Sub16_Sub1_4.method3793();
			arg1.method2791(Static109.anInt2430, local51, local106);
		}
		if ((arg2 & 0x80) != 0) {
			local51 = Static225.aClass1_Sub16_Sub1_4.method3793();
			@Pc(126) byte[] local126 = new byte[local51];
			@Pc(131) Class1_Sub16 local131 = new Class1_Sub16(local126);
			Static225.aClass1_Sub16_Sub1_4.method3819(local51, local126);
			Static78.aClass1_Sub16Array1[arg0] = local131;
			arg1.method1460(local131);
		}
		if ((arg2 & 0x2) != 0) {
			local51 = Static225.aClass1_Sub16_Sub1_4.method3794();
			local106 = Static225.aClass1_Sub16_Sub1_4.method3787();
			@Pc(161) int local161 = Static225.aClass1_Sub16_Sub1_4.method3763();
			@Pc(164) int local164 = Static225.aClass1_Sub16_Sub1_4.anInt4860;
			@Pc(172) boolean local172 = (local51 & 0x8000) != 0;
			if (arg1.aClass51_619 != null && arg1.aClass111_2 != null) {
				@Pc(183) long local183 = arg1.aClass51_619.method1388();
				@Pc(185) boolean local185 = false;
				if (local106 <= 1) {
					if (!local172 && (Static135.anInt3030 == 1 || Static97.anInt2132 == 1)) {
						local185 = true;
					} else {
						for (@Pc(202) int local202 = 0; local202 < Static113.anInt2474; local202++) {
							if (Static181.aLongArray11[local202] == local183) {
								local185 = true;
								break;
							}
						}
					}
				}
				if (!local185 && Static213.anInt4561 == 0) {
					Static64.aClass1_Sub16_4.anInt4860 = 0;
					Static225.aClass1_Sub16_Sub1_4.method3779(Static64.aClass1_Sub16_4.aByteArray62, local161);
					@Pc(238) int local238 = -1;
					Static64.aClass1_Sub16_4.anInt4860 = 0;
					@Pc(250) Class51 local250;
					if (local172) {
						local51 &= 0x7FFF;
						@Pc(260) Class8 local260 = Static69.method1210(Static64.aClass1_Sub16_4);
						local238 = local260.anInt171;
						local250 = local260.aClass1_Sub2_Sub13_1.method2273(Static64.aClass1_Sub16_4);
					} else {
						local250 = Static94.method2018(Static146.method577(Static64.aClass1_Sub16_4).method1402());
					}
					arg1.aClass51_1249 = local250.method1436();
					arg1.anInt3594 = 150;
					arg1.anInt3617 = local51 >> 8;
					arg1.anInt3597 = local51 & 0xFF;
					if (local106 == 2) {
						Static216.method3597(local238, Static150.method2574(new Class51[] { Static51.aClass51_377, arg1.aClass51_619 }), local172 ? 17 : 1, local250, null);
					} else if (local106 == 1) {
						Static216.method3597(local238, Static150.method2574(new Class51[] { Static228.aClass51_1649, arg1.aClass51_619 }), local172 ? 17 : 1, local250, null);
					} else {
						Static216.method3597(local238, arg1.aClass51_619, local172 ? 17 : 2, local250, null);
					}
				}
			}
			Static225.aClass1_Sub16_Sub1_4.anInt4860 = local161 + local164;
		}
		if ((arg2 & 0x400) != 0) {
			arg1.anInt3615 = Static225.aClass1_Sub16_Sub1_4.method3763();
			arg1.anInt3590 = Static225.aClass1_Sub16_Sub1_4.method3793();
			arg1.anInt3608 = Static225.aClass1_Sub16_Sub1_4.method3787();
			arg1.anInt3602 = Static225.aClass1_Sub16_Sub1_4.method3763();
			arg1.anInt3610 = Static225.aClass1_Sub16_Sub1_4.method3809() + Static109.anInt2430;
			arg1.anInt3578 = Static225.aClass1_Sub16_Sub1_4.method3783() + Static109.anInt2430;
			arg1.anInt3586 = Static225.aClass1_Sub16_Sub1_4.method3793();
			arg1.anInt3619 = 0;
			arg1.anInt3603 = 1;
		}
		if ((arg2 & 0x8) != 0) {
			local51 = Static225.aClass1_Sub16_Sub1_4.method3809();
			local106 = Static225.aClass1_Sub16_Sub1_4.method3793();
			if (local51 == 65535) {
				local51 = -1;
			}
			Static17.method324(local106, local51, arg1);
		}
		if ((arg2 & 0x40) != 0) {
			arg1.aClass51_1249 = Static225.aClass1_Sub16_Sub1_4.method3781();
			if (arg1.aClass51_1249.method1408(0) == 126) {
				arg1.aClass51_1249 = arg1.aClass51_1249.method1394(1);
				Static164.method2798(2, arg1.aClass51_1249, arg1.aClass51_619);
			} else if (arg1 == Static73.aClass5_Sub1_Sub1_1) {
				Static164.method2798(2, arg1.aClass51_1249, arg1.aClass51_619);
			}
			arg1.anInt3594 = 150;
			arg1.anInt3617 = 0;
			arg1.anInt3597 = 0;
		}
		if ((arg2 & 0x10) == 0) {
			return;
		}
		local51 = Static225.aClass1_Sub16_Sub1_4.method3787();
		local106 = Static225.aClass1_Sub16_Sub1_4.method3763();
		arg1.method2791(Static109.anInt2430, local51, local106);
		arg1.anInt3613 = Static109.anInt2430 + 300;
		arg1.anInt3593 = Static225.aClass1_Sub16_Sub1_4.method3763();
	}
}
