import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!gv", name = "d", descriptor = "Lclient!du;")
	public static final Class62 aClass62_16 = new Class62(2, 17);

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lclient!jp;ILclient!ir;II)V")
	public static void method1819(@OriginalArg(0) Class1_Sub19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class11_Sub1_Sub3_Sub2 arg2, @OriginalArg(4) int arg3) {
		@Pc(11) byte local11 = -1;
		if ((arg1 & 0x20000) != 0) {
			arg2.aByte56 = arg0.method2910();
			arg2.aByte55 = arg0.method2910();
			arg2.aByte54 = arg0.method2917();
			arg2.aByte57 = (byte) arg0.method2928();
			arg2.anInt3326 = Static98.anInt1304 + arg0.method2896();
			arg2.anInt3321 = Static98.anInt1304 + arg0.method2882();
		}
		if ((arg1 & 0x8000) != 0) {
			arg2.aBoolean328 = arg0.method2919() == 1;
		}
		if ((arg1 & 0x4000) != 0) {
			arg2.anInt3291 = arg0.method2923();
			arg2.anInt3329 = arg0.method2910();
			arg2.anInt3306 = arg0.method2899();
			arg2.anInt3294 = arg0.method2899();
			arg2.anInt3301 = arg0.method2892() + Static98.anInt1304;
			arg2.anInt3341 = arg0.method2938() + Static98.anInt1304;
			arg2.anInt3292 = arg0.method2919();
			arg2.anInt3344 = 0;
			if (arg2.aBoolean327) {
				arg2.anInt3329 += arg2.anInt3365;
				arg2.anInt3306 += arg2.anInt3384;
				arg2.anInt3342 = 0;
				arg2.anInt3294 += arg2.anInt3365;
				arg2.anInt3291 += arg2.anInt3384;
			} else {
				arg2.anInt3329 += arg2.anIntArray247[0];
				arg2.anInt3291 += arg2.anIntArray246[0];
				arg2.anInt3306 += arg2.anIntArray246[0];
				arg2.anInt3294 += arg2.anIntArray247[0];
				arg2.anInt3342 = 1;
			}
		}
		if ((arg1 & 0x8) != 0) {
			arg2.anInt3361 = arg0.method2892();
			if (arg2.anInt3342 == 0) {
				arg2.method2631(arg2.anInt3361);
				arg2.anInt3361 = -1;
			}
		}
		@Pc(219) int local219;
		if ((arg1 & 0x1000) != 0) {
			local219 = arg0.method2938();
			arg2.anInt3269 = arg0.method2884();
			arg2.anInt3332 = arg0.method2884();
			arg2.anInt3274 = local219 & 0x7FFF;
			arg2.aBoolean323 = (local219 & 0x8000) != 0;
			arg2.anInt3336 = arg2.anInt3269 + arg2.anInt3274 + Static98.anInt1304;
		}
		if ((arg1 & 0x800) != 0) {
			local11 = arg0.method2899();
		}
		@Pc(281) int local281;
		@Pc(290) int local290;
		if ((arg1 & 0x10000) != 0) {
			local219 = arg0.method2938();
			local281 = arg0.method2900();
			if (local219 == 65535) {
				local219 = -1;
			}
			local290 = arg0.method2915();
			arg2.method2632(local219, true, local290, local281);
		}
		if ((arg1 & 0x80) != 0) {
			local219 = arg0.method2882();
			local281 = arg0.method2915();
			local290 = arg0.method2928();
			@Pc(316) int local316 = arg0.anInt3698;
			@Pc(327) boolean local327 = (local219 & 0x8000) != 0;
			if (arg2.aString32 != null && arg2.aClass131_1 != null) {
				@Pc(335) boolean local335 = false;
				if (local281 <= 1) {
					if (!local327 && (Static10.aBoolean463 && !Static67.aBoolean619 || Static299.aBoolean459)) {
						local335 = true;
					} else if (Static227.method3225(arg2.aString32)) {
						local335 = true;
					}
				}
				if (!local335 && Static305.anInt5076 == 0) {
					Static452.aClass1_Sub19_7.anInt3698 = 0;
					arg0.method2937(local290, Static452.aClass1_Sub19_7.aByteArray38);
					Static452.aClass1_Sub19_7.anInt3698 = 0;
					@Pc(378) int local378 = -1;
					@Pc(397) String local397;
					if (local327) {
						local219 &= 0x7FFF;
						@Pc(388) Class151 local388 = Static387.method4985(Static452.aClass1_Sub19_7);
						local378 = local388.anInt4386;
						local397 = local388.aClass1_Sub3_Sub10_1.method2183(Static452.aClass1_Sub19_7);
					} else {
						local397 = Static169.method4130(Static71.method917(Static452.aClass1_Sub19_7));
					}
					arg2.aString31 = local397.trim();
					arg2.anInt3305 = 150;
					arg2.anInt3322 = local219 & 0xFF;
					arg2.anInt3339 = local219 >> 8;
					@Pc(436) int local436;
					if (local281 == 1 || local281 == 2) {
						local436 = local327 ? 17 : 1;
					} else {
						local436 = local327 ? 17 : 2;
					}
					if (local281 == 2) {
						Static252.method3561(null, 0, local397, "<img=1>" + arg2.method2650(), local436, local378, "<img=1>" + arg2.method2654());
					} else if (local281 == 1) {
						Static252.method3561(null, 0, local397, "<img=0>" + arg2.method2650(), local436, local378, "<img=0>" + arg2.method2654());
					} else {
						Static252.method3561(null, 0, local397, arg2.method2650(), local436, local378, arg2.method2654());
					}
				}
			}
			arg0.anInt3698 = local316 + local290;
		}
		if ((arg1 & 0x1) != 0) {
			local219 = arg0.method2915();
			@Pc(544) byte[] local544 = new byte[local219];
			@Pc(549) Class1_Sub19 local549 = new Class1_Sub19(local544);
			arg0.method2937(local219, local544);
			Static351.aClass1_Sub19Array1[arg3] = local549;
			arg2.method2649(local549);
		}
		if ((arg1 & 0x10) != 0) {
			local219 = arg0.method2882();
			if (local219 == 65535) {
				local219 = -1;
			}
			arg2.anInt3318 = local219;
		}
		if ((arg1 & 0x2) != 0) {
			local219 = arg0.method2882();
			if (local219 == 65535) {
				local219 = -1;
			}
			local281 = arg0.method2919();
			Static391.method5085(local219, local281, arg2);
		}
		if ((arg1 & 0x100) != 0) {
			local219 = Static98.anInt1304;
			local281 = arg0.method2883();
			local290 = arg0.method2919();
			arg2.method2630(local281, local219, local290);
		}
		if ((arg1 & 0x40) != 0) {
			Static348.aByteArray79[arg3] = arg0.method2923();
		}
		if ((arg1 & 0x400) != 0) {
			local219 = arg0.method2896();
			local281 = arg0.method2877();
			if (local219 == 65535) {
				local219 = -1;
			}
			local290 = arg0.method2919();
			arg2.method2632(local219, false, local290, local281);
		}
		if ((arg1 & 0x2000) != 0) {
			arg2.aString31 = arg0.method2914();
			if (arg2.aString31.charAt(0) == '~') {
				arg2.aString31 = arg2.aString31.substring(1);
				Static439.method5510(arg2.aString31, arg2.method2650(), arg2.method2654(), 2, 0);
			} else if (Static94.aClass11_Sub1_Sub3_Sub2_1 == arg2) {
				Static439.method5510(arg2.aString31, arg2.method2650(), arg2.method2654(), 2, 0);
			}
			arg2.anInt3305 = 150;
			arg2.anInt3339 = 0;
			arg2.anInt3322 = 0;
		}
		if ((arg1 & 0x40000) != 0) {
			local219 = arg0.method2919();
			@Pc(744) int[] local744 = new int[local219];
			@Pc(747) int[] local747 = new int[local219];
			@Pc(750) int[] local750 = new int[local219];
			for (@Pc(752) int local752 = 0; local752 < local219; local752++) {
				@Pc(758) int local758 = arg0.method2938();
				if (local758 == 65535) {
					local758 = -1;
				}
				local744[local752] = local758;
				local747[local752] = arg0.method2928();
				local750[local752] = arg0.method2892();
			}
			Static306.method4066(local744, local747, arg2, local750);
		}
		if ((arg1 & 0x4) != 0) {
			local219 = arg0.method2883();
			local281 = arg0.method2915();
			arg2.method2630(local219, Static98.anInt1304, local281);
			arg2.anInt3309 = Static98.anInt1304 + 300;
			arg2.anInt3316 = arg0.method2928();
		}
		if (!arg2.aBoolean327) {
			return;
		}
		if (local11 == 127) {
			arg2.method2655(arg2.anInt3365, arg2.anInt3384);
			return;
		}
		@Pc(843) byte local843;
		if (local11 == -1) {
			local843 = Static348.aByteArray79[arg3];
		} else {
			local843 = local11;
		}
		arg2.method2651(arg2.anInt3384, local843, arg2.anInt3365);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1820(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		if (arg1 < 128 || arg0 < 128 || Static147.anInt2300 * 128 - 256 < arg1 || (Static293.anInt4886 - 2) * 128 < arg0) {
			Static99.anIntArray133[0] = Static99.anIntArray133[1] = -1;
			return;
		}
		@Pc(52) int local52 = Static135.method1732(arg1, arg0, arg6) - arg3;
		Static329.aClass34_5.W(arg4, 0, 0);
		Static186.aClass117_3.SA(Static329.aClass34_5);
		Static186.aClass117_3.v(arg1, local52, arg0, Static99.anIntArray133);
		Static329.aClass34_5.W(-arg4, 0, 0);
		Static186.aClass117_3.SA(Static329.aClass34_5);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "([I[BB[[BI[II[[B)I")
	public static int method1821(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) byte[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[][] arg6) {
		@Pc(9) int local9 = arg0[arg5];
		@Pc(16) int local16 = local9 + arg4[arg5];
		@Pc(20) int local20 = arg0[arg3];
		@Pc(26) int local26 = local20 + arg4[arg3];
		@Pc(28) int local28 = local9;
		if (local9 < local20) {
			local28 = local20;
		}
		@Pc(35) int local35 = local16;
		if (local26 < local16) {
			local35 = local26;
		}
		@Pc(46) int local46 = arg1[arg5] & 0xFF;
		if ((arg1[arg3] & 0xFF) < local46) {
			local46 = arg1[arg3] & 0xFF;
		}
		@Pc(67) byte[] local67 = arg2[arg5];
		@Pc(71) byte[] local71 = arg6[arg3];
		@Pc(76) int local76 = local28 - local9;
		@Pc(81) int local81 = local28 - local20;
		for (@Pc(83) int local83 = local28; local83 < local35; local83++) {
			@Pc(95) int local95 = local71[local81++] + local67[local76++];
			if (local46 > local95) {
				local46 = local95;
			}
		}
		return -local46;
	}
}
