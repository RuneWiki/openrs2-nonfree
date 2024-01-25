import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!sw", name = "j", descriptor = "Lclient!dda;")
	public static Class53 aClass53_125;

	@OriginalMember(owner = "client!sw", name = "h", descriptor = "[I")
	public static final int[] anIntArray623 = new int[500];

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIIILclient!iq;)V")
	public static void method6826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub5 arg4) {
		@Pc(4) Class262 local4 = Static519.method7540(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt7956 = (arg1 << Static175.anInt3259) + Static392.anInt7455;
		arg4.anInt7962 = arg3;
		arg4.anInt7960 = (arg2 << Static175.anInt3259) + Static392.anInt7455;
		for (@Pc(28) Class187 local28 = local4.aClass187_3; local28 != null; local28 = local28.aClass187_1) {
			if (local28.aClass1_Sub1_1.aBoolean569) {
				@Pc(38) int local38 = local28.aClass1_Sub1_1.method6432();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt7962 += local8;
			arg4.aBoolean586 = true;
		} else if (local4.aClass1_Sub4_1 != null) {
			arg4.anInt7962 -= local4.aClass1_Sub4_1.aShort154;
		}
		local4.aClass1_Sub5_1 = arg4;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(ZIIII)V")
	public static void method6827(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg0 && Static367.anInt6894 == arg3 && Static46.anInt834 == arg1 && (Static348.anInt6407 == Static208.anInt3742 || Static281.aClass2_Sub19_Sub1_1.method2159(Static266.anInt4923))) {
			return;
		}
		Static46.anInt834 = arg1;
		Static367.anInt6894 = arg3;
		Static348.anInt6407 = Static208.anInt3742;
		if (Static281.aClass2_Sub19_Sub1_1.method2159(Static266.anInt4923)) {
			Static348.anInt6407 = 0;
		}
		Static301.method4738(arg2);
		Static263.method4275(Static477.aClass47_4, true, Static290.aClass202_161.method5139(Static172.anInt6352));
		@Pc(54) int local54 = Static238.anInt4280;
		Static238.anInt4280 = (Static367.anInt6894 - (Static363.anInt1158 >> 4)) * 8;
		@Pc(65) int local65 = Static371.anInt6936;
		Static371.anInt6936 = (Static46.anInt834 - (Static511.anInt8889 >> 4)) * 8;
		Static356.aClass2_Sub13_Sub16_4 = Static201.method368(Static367.anInt6894 * 8, Static46.anInt834 * 8);
		Static105.aClass86_3 = null;
		@Pc(89) int local89 = Static238.anInt4280 - local54;
		@Pc(94) int local94 = Static371.anInt6936 - local65;
		@Pc(113) int local113;
		@Pc(115) int local115;
		@Pc(166) int local166;
		@Pc(281) int local281;
		if (arg2 == 10) {
			for (local281 = 0; local281 < Static61.anInt1174; local281++) {
				@Pc(287) Class2_Sub11 local287 = Static539.aClass2_Sub11Array1[local281];
				if (local287 != null) {
					@Pc(292) Class1_Sub1_Sub2_Sub2 local292 = local287.aClass1_Sub1_Sub2_Sub2_1;
					for (local115 = 0; local115 < 10; local115++) {
						local292.anIntArray450[local115] -= local89;
						local292.anIntArray449[local115] -= local94;
					}
					local292.anInt7660 -= local89 * 128;
					local292.anInt7659 -= local94 * 128;
				}
			}
		} else {
			Static520.anInt1936 = 0;
			@Pc(101) boolean local101 = false;
			@Pc(107) int local107 = (Static363.anInt1158 - 1) * 128;
			local113 = Static511.anInt8889 * 128 - 128;
			for (local115 = 0; local115 < Static61.anInt1174; local115++) {
				@Pc(121) Class2_Sub11 local121 = Static539.aClass2_Sub11Array1[local115];
				if (local121 != null) {
					@Pc(126) Class1_Sub1_Sub2_Sub2 local126 = local121.aClass1_Sub1_Sub2_Sub2_1;
					local126.anInt7660 -= local89 * 128;
					local126.anInt7659 -= local94 * 128;
					if (local126.anInt7660 >= 0 && local107 >= local126.anInt7660 && local126.anInt7659 >= 0 && local126.anInt7659 <= local113) {
						@Pc(164) boolean local164 = true;
						for (local166 = 0; local166 < 10; local166++) {
							local126.anIntArray450[local166] -= local89;
							local126.anIntArray449[local166] -= local94;
							if (local126.anIntArray450[local166] < 0 || local126.anIntArray450[local166] >= Static363.anInt1158 || local126.anIntArray449[local166] < 0 || Static511.anInt8889 <= local126.anIntArray449[local166]) {
								local164 = false;
							}
						}
						if (local164) {
							Static24.anIntArray39[Static520.anInt1936++] = local126.anInt5076;
						} else {
							local126.method4401(null);
							local121.method7802();
							local101 = true;
						}
					} else {
						local126.method4401(null);
						local121.method7802();
						local101 = true;
					}
				}
			}
			if (local101) {
				Static61.anInt1174 = Static71.aClass127_13.method3209();
				Static71.aClass127_13.method3207(Static539.aClass2_Sub11Array1);
			}
		}
		for (local281 = 0; local281 < 2048; local281++) {
			@Pc(350) Class1_Sub1_Sub2_Sub1 local350 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local281];
			if (local350 != null) {
				for (local113 = 0; local113 < 10; local113++) {
					local350.anIntArray450[local113] -= local89;
					local350.anIntArray449[local113] -= local94;
				}
				local350.anInt7660 -= local89 * 128;
				local350.anInt7659 -= local94 * 128;
			}
		}
		@Pc(400) Class132[] local400 = Static286.aClass132Array1;
		for (local113 = 0; local113 < local400.length; local113++) {
			@Pc(408) Class132 local408 = local400[local113];
			if (local408 != null) {
				local408.anInt3724 -= local94 * 128;
				local408.anInt3726 -= local89 * 128;
			}
		}
		for (@Pc(436) Class2_Sub34 local436 = (Class2_Sub34) Static465.aClass249_64.method6527(); local436 != null; local436 = (Class2_Sub34) Static465.aClass249_64.method6525()) {
			local436.anInt5719 -= local89;
			local436.anInt5726 -= local94;
			if (Static425.anInt6885 != 4 && (local436.anInt5719 < 0 || local436.anInt5726 < 0 || Static363.anInt1158 <= local436.anInt5719 || Static511.anInt8889 <= local436.anInt5726)) {
				local436.method7802();
			}
		}
		if (Static425.anInt6885 != 4) {
			for (@Pc(493) Class2_Sub40 local493 = (Class2_Sub40) Static357.aClass127_36.method3203(); local493 != null; local493 = (Class2_Sub40) Static357.aClass127_36.method3212()) {
				@Pc(501) int local501 = (int) (local493.aLong241 & 0x3FFFL);
				@Pc(506) int local506 = local501 - Static238.anInt4280;
				local166 = (int) (local493.aLong241 >> 14 & 0x3FFFL);
				@Pc(519) int local519 = local166 - Static371.anInt6936;
				if (local506 < 0 || local519 < 0 || Static363.anInt1158 <= local506 || Static511.anInt8889 <= local519) {
					local493.method7802();
				}
			}
		}
		if (Static440.anInt8023 != 0) {
			Static440.anInt8023 -= local89;
			Static203.anInt3677 -= local94;
		}
		Static241.method3721();
		if (arg2 != 10) {
			Static187.anInt3432 -= local89 * 128;
			Static329.anInt3845 -= local94;
			Static68.anInt1456 -= local94;
			Static353.anInt5258 -= local94 * 128;
			Static212.anInt3814 -= local89;
			Static274.anInt4992 -= local89;
			if (Math.abs(local89) > Static363.anInt1158 || Math.abs(local94) > Static511.anInt8889) {
				Static330.method3998();
			}
		} else if (Static427.anInt7875 == 4) {
			Static31.anInt5633 -= local89 * 128;
			Static4.anInt115 -= local89 * 128;
			Static365.anInt6883 -= local94 * 128;
			Static169.anInt3089 -= local94 * 128;
		} else {
			Static427.anInt7875 = 1;
		}
		Static512.method7485();
		Static469.method7062();
		Static354.aClass249_38.method6530();
		Static316.aClass249_33.method6530();
		Static369.aClass107_7.method2838();
		Static460.method7590();
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(II)I")
	public static int method6828(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(77) double local77 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local77 < 0.5D) {
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local77 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		local60 /= 6.0D;
		@Pc(165) int local165 = (int) (local60 * 256.0D);
		@Pc(170) int local170 = (int) (local62 * 256.0D);
		if (local170 < 0) {
			local170 = 0;
		} else if (local170 > 255) {
			local170 = 255;
		}
		@Pc(191) int local191 = (int) (local77 * 256.0D);
		if (local191 < 0) {
			local191 = 0;
		} else if (local191 > 255) {
			local191 = 255;
		}
		if (local191 > 243) {
			local170 >>= 0x4;
		} else if (local191 > 217) {
			local170 >>= 0x3;
		} else if (local191 > 192) {
			local170 >>= 0x2;
		} else if (local191 > 179) {
			local170 >>= 0x1;
		}
		return (local170 >> 5 << 7) + (((local165 >> 2 & 0x3F) << 10) + (local191 >> 1));
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "([FIIIIIFFIIIIF)V")
	public static void method6829(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float arg11) {
		@Pc(5) int local5 = arg9 - arg8;
		@Pc(13) int local13 = arg3 - arg5;
		@Pc(17) int local17 = arg2 - arg1;
		@Pc(38) float local38 = arg0[2] * (float) local5 + (float) local13 * arg0[0] + (float) local17 * arg0[1];
		@Pc(59) float local59 = arg0[3] * (float) local13 + (float) local17 * arg0[4] + (float) local5 * arg0[5];
		@Pc(80) float local80 = (float) local5 * arg0[8] + arg0[7] * (float) local17 + arg0[6] * (float) local13;
		@Pc(95) float local95;
		@Pc(89) float local89;
		if (arg4 == 0) {
			local89 = arg7 + 0.5F - local80;
			local95 = local38 + arg11 + 0.5F;
		} else if (arg4 == 1) {
			local89 = arg7 + local80 + 0.5F;
			local95 = local38 + arg11 + 0.5F;
		} else if (arg4 == 2) {
			local95 = arg11 + 0.5F - local38;
			local89 = arg6 + 0.5F - local59;
		} else if (arg4 == 3) {
			local95 = local38 + arg11 + 0.5F;
			local89 = arg6 + 0.5F - local59;
		} else if (arg4 == 4) {
			local95 = local80 + arg7 + 0.5F;
			local89 = arg6 + 0.5F - local59;
		} else {
			local89 = arg6 + 0.5F - local59;
			local95 = arg7 + 0.5F - local80;
		}
		@Pc(192) float local192;
		if (arg10 == 1) {
			local192 = local95;
			local95 = -local89;
			local89 = local192;
		} else if (arg10 == 2) {
			local89 = -local89;
			local95 = -local95;
		} else if (arg10 == 3) {
			local192 = local95;
			local95 = local89;
			local89 = -local192;
		}
		Static362.aFloat177 = local95;
		Static275.aFloat215 = local89;
	}
}
