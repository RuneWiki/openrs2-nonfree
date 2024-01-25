import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
	public static void method6485() {
		@Pc(14) boolean local14 = Static481.aClass14_Sub29_Sub1_2.method5842() == 1;
		@Pc(18) int local18 = Static481.aClass14_Sub29_Sub1_2.method5884();
		@Pc(22) int local22 = Static481.aClass14_Sub29_Sub1_2.method5842();
		@Pc(26) int local26 = Static481.aClass14_Sub29_Sub1_2.method5900();
		Static74.anInt1617 = Static481.aClass14_Sub29_Sub1_2.method5842();
		Static138.method2197();
		Static545.method7697(local22);
		Static481.aClass14_Sub29_Sub1_2.method4285();
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(59) int local59;
		for (@Pc(44) int local44 = 0; local44 < 4; local44++) {
			for (local48 = 0; local48 < Static26.anInt462 >> 3; local48++) {
				for (local52 = 0; local52 < Static445.anInt6140 >> 3; local52++) {
					local59 = Static481.aClass14_Sub29_Sub1_2.method4289(1);
					if (local59 == 1) {
						Static333.anIntArrayArrayArray4[local44][local48][local52] = Static481.aClass14_Sub29_Sub1_2.method4289(26);
					} else {
						Static333.anIntArrayArrayArray4[local44][local48][local52] = -1;
					}
				}
			}
		}
		Static481.aClass14_Sub29_Sub1_2.method4290();
		local48 = (Static638.anInt10676 - Static481.aClass14_Sub29_Sub1_2.anInt7264) / 16;
		Static659.anIntArrayArray61 = new int[local48][4];
		for (local52 = 0; local52 < local48; local52++) {
			for (local59 = 0; local59 < 4; local59++) {
				Static659.anIntArrayArray61[local52][local59] = Static481.aClass14_Sub29_Sub1_2.method5878();
			}
		}
		Static78.aByteArrayArray13 = new byte[local48][];
		Static384.anIntArray516 = null;
		Static166.anIntArray272 = new int[local48];
		Static513.aByteArrayArray41 = new byte[local48][];
		Static66.anIntArray112 = new int[local48];
		Static582.aByteArrayArray49 = new byte[local48][];
		Static662.anIntArray817 = new int[local48];
		Static332.anIntArray455 = new int[local48];
		Static78.aByteArrayArray14 = new byte[local48][];
		Static521.anIntArray667 = new int[local48];
		Static71.aByteArrayArray11 = null;
		local48 = 0;
		for (local59 = 0; local59 < 4; local59++) {
			for (@Pc(192) int local192 = 0; local192 < Static26.anInt462 >> 3; local192++) {
				for (@Pc(196) int local196 = 0; local196 < Static445.anInt6140 >> 3; local196++) {
					@Pc(206) int local206 = Static333.anIntArrayArrayArray4[local59][local192][local196];
					if (local206 != -1) {
						@Pc(215) int local215 = local206 >> 14 & 0x3FF;
						@Pc(221) int local221 = local206 >> 3 & 0x7FF;
						@Pc(232) int local232 = (local215 / 8 << 8) + (local221 / 8);
						for (@Pc(234) int local234 = 0; local234 < local48; local234++) {
							if (Static332.anIntArray455[local234] == local232) {
								local232 = -1;
								break;
							}
						}
						if (local232 != -1) {
							Static332.anIntArray455[local48] = local232;
							@Pc(267) int local267 = local232 >> 8 & 0xFF;
							@Pc(271) int local271 = local232 & 0xFF;
							Static66.anIntArray112[local48] = Static227.aClass386_126.method9213("m" + local267 + "_" + local271);
							Static521.anIntArray667[local48] = Static227.aClass386_126.method9213("l" + local267 + "_" + local271);
							Static166.anIntArray272[local48] = Static227.aClass386_126.method9213("um" + local267 + "_" + local271);
							Static662.anIntArray817[local48] = Static227.aClass386_126.method9213("ul" + local267 + "_" + local271);
							local48++;
						}
					}
				}
			}
		}
		Static540.method8404(local14, local26, 11, local18);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(15) int local15 = arg3 - 334;
		if (local15 < 0) {
			local15 = 0;
		} else if (local15 > 100) {
			local15 = 100;
		}
		@Pc(41) int local41 = Static26.aShort4 + local15 * (Static175.aShort45 - Static26.aShort4) / 100;
		Static331.anInt6277 = local41 * Static331.anInt6274 >> 8;
		@Pc(53) int local53 = arg0 * local41 >> 8;
		@Pc(59) int local59 = 16384 - arg4 & 0x3FFF;
		@Pc(66) int local66 = 16384 - arg2 & 0x3FFF;
		@Pc(68) int local68 = 0;
		@Pc(70) int local70 = 0;
		@Pc(72) int local72 = local53;
		if (local59 != 0) {
			local70 = -local53 * Class32.anIntArray76[local59] >> 14;
			local72 = Class32.anIntArray77[local59] * local53 >> 14;
		}
		if (local66 != 0) {
			local68 = Class32.anIntArray76[local66] * local72 >> 14;
			local72 = Class32.anIntArray77[local66] * local72 >> 14;
		}
		Static219.anInt4123 = arg2;
		Static233.anInt4273 = arg6 - local68;
		Static396.anInt7302 = arg5 - local70;
		Static668.anInt11106 = arg4;
		Static4.anInt27 = 0;
		Static74.anInt1618 = arg1 - local72;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method6487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(19) int local19;
		if (Static220.method3432(arg3)) {
			local19 = 0;
			@Pc(47) int local47 = 0;
			@Pc(49) int local49 = 0;
			@Pc(51) int local51 = 0;
			@Pc(53) int local53 = 0;
			if (Static128.aBoolean202) {
				local19 = Static508.anInt8975;
				local49 = Static354.anInt6530;
				local53 = Static46.anInt1120;
				local51 = Static185.anInt3544;
				local47 = Static28.anInt705;
				Static46.anInt1120 = 1;
			}
			if (Static46.aClass230ArrayArray1[arg3] == null) {
				Static475.method6872(arg1, arg2, arg4, arg7, arg0, -1, Static559.aClass230ArrayArray2[arg3], arg0 < 0, arg6, arg5);
			} else {
				Static475.method6872(arg1, arg2, arg4, arg7, arg0, -1, Static46.aClass230ArrayArray1[arg3], arg0 < 0, arg6, arg5);
			}
			if (Static128.aBoolean202) {
				if (arg0 >= 0 && Static46.anInt1120 == 2) {
					Static357.method5407(Static508.anInt8975, Static28.anInt705, Static185.anInt3544, Static354.anInt6530);
				}
				Static46.anInt1120 = local53;
				Static354.anInt6530 = local49;
				Static508.anInt8975 = local19;
				Static185.anInt3544 = local51;
				Static28.anInt705 = local47;
			}
		} else if (arg0 == -1) {
			for (local19 = 0; local19 < 100; local19++) {
				Static446.aBooleanArray18[local19] = true;
			}
		} else {
			Static446.aBooleanArray18[arg0] = true;
		}
	}
}
