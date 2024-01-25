import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "[[B")
	public static final byte[][] aByteArrayArray5 = new byte[1000][];

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "Z")
	public static boolean aBoolean92 = false;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!fi;)V")
	public static void method914(@OriginalArg(0) Class76 arg0) {
		if (Static56.anInt1522 >= 65535) {
			return;
		}
		@Pc(6) Class6_Sub11 local6 = arg0.aClass6_Sub11_1;
		Static411.aClass76Array1[Static56.anInt1522] = arg0;
		Static302.aBooleanArray20[Static56.anInt1522] = false;
		Static56.anInt1522++;
		@Pc(21) int local21 = arg0.anInt2354;
		if (arg0.aBoolean161) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt2354;
		if (arg0.aBoolean162) {
			local29 = Static295.anInt5507 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method6392() + Static437.anInt7761 - local6.method6395() >> Static62.anInt1705;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method6392() + local6.method6395() - Static437.anInt7761 >> Static62.anInt1705;
			if (local73 >= Static61.anInt1698) {
				local73 = Static61.anInt1698 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray25[local41++];
				@Pc(105) int local105 = (local6.method6390() + Static437.anInt7761 - local6.method6395() >> Static62.anInt1705) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static229.anInt4189) {
					local113 = Static229.anInt4189 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static441.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static441.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static56.anInt1522;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static441.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static56.anInt1522 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static441.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static56.anInt1522 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static441.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static56.anInt1522 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIIIBIIIIIIII)V")
	public static void method916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static55.aClass86Array1 == null) {
			return;
		}
		@Pc(22) Class3_Sub2_Sub1 local22;
		@Pc(18) int local18;
		if (arg12 >= 0) {
			local18 = arg12 - 1;
			local22 = Static308.aClass3_Sub2_Sub1_Sub1Array1[local18];
		} else {
			local18 = -arg12 - 1;
			if (local18 == Static4.anInt7923) {
				local22 = Static302.aClass3_Sub2_Sub1_Sub2_2;
			} else {
				local22 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local18];
			}
		}
		if (local22 == null) {
			return;
		}
		@Pc(52) Class106 local52 = Static448.aClass104_4.method2616(arg5);
		@Pc(64) int local64;
		@Pc(61) int local61;
		if (arg9 == 1 || arg9 == 3) {
			local64 = local52.anInt3194;
			local61 = local52.anInt3158;
		} else {
			local61 = local52.anInt3194;
			local64 = local52.anInt3158;
		}
		@Pc(78) int local78 = (local64 >> 1) + arg8;
		@Pc(86) int local86 = (local64 + 1 >> 1) + arg8;
		@Pc(92) int local92 = (local61 >> 1) + arg6;
		@Pc(100) int local100 = (local61 + 1 >> 1) + arg6;
		@Pc(104) Class86 local104 = Static55.aClass86Array1[arg10];
		@Pc(128) int local128 = local104.method6594(local78, local92) + local104.method6594(local86, local92) + local104.method6594(local78, local100) + local104.method6594(local86, local100) >> 2;
		@Pc(132) Class6_Sub34 local132 = new Class6_Sub34();
		local132.anInt6215 = Static66.anInt1741 + arg1;
		local132.anInt6216 = arg6;
		local132.anInt6214 = arg5;
		local132.anInt6210 = local22.aByte103;
		local132.anInt6209 = arg11;
		local132.anInt6212 = arg9;
		@Pc(158) int local158;
		if (arg0 > arg2) {
			local158 = arg0;
			arg0 = arg2;
			arg2 = local158;
		}
		local132.anInt6208 = arg8;
		local132.anInt6222 = arg7 + Static66.anInt1741;
		local132.anInt6219 = arg2 + arg8;
		if (arg4 > arg3) {
			local158 = arg4;
			arg4 = arg3;
			arg3 = local158;
		}
		local132.anInt6220 = arg8 + arg0;
		local132.anInt6213 = (local64 << 6) + (local132.anInt6208 << 7);
		local132.anInt6225 = arg6 + arg4;
		local132.anInt6226 = arg6 + arg3;
		local132.anInt6223 = local128;
		local132.anInt6211 = (local132.anInt6216 << 7) + (local61 << 6);
		Static352.aClass244_39.method5966(local132);
		local22.aClass6_Sub34_3 = local132;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZIZLclient!cq;)V")
	public static void method917(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class6_Sub9 arg2) {
		@Pc(8) int local8 = arg2.anInt1505;
		@Pc(12) int local12 = (int) arg2.aLong229;
		arg2.method6525();
		if (arg0) {
			Static167.method5985(local8);
		}
		Static221.method3325(local8);
		@Pc(27) Class239 local27 = Static121.method2092(local12);
		if (local27 != null) {
			Static437.method6328(local27);
		}
		Static178.method6350();
		if (!arg1 && Static36.anInt1129 != -1) {
			Static101.method1824(1, Static36.anInt1129);
		}
		@Pc(51) Class230 local51 = new Class230(Static432.aClass74_33);
		for (@Pc(60) Class6_Sub9 local60 = (Class6_Sub9) local51.method5635(); local60 != null; local60 = (Class6_Sub9) local51.method5636()) {
			if (!local60.method6531()) {
				local60 = (Class6_Sub9) local51.method5635();
				if (local60 == null) {
					return;
				}
			}
			if (local60.anInt1506 == 3) {
				@Pc(82) int local82 = (int) local60.aLong229;
				if (local8 == local82 >>> 16) {
					method917(true, arg1, local60);
				}
			}
		}
	}
}
