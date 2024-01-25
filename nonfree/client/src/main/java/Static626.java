import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static626 {

	@OriginalMember(owner = "client!vba", name = "i", descriptor = "I")
	public static int anInt9695;

	@OriginalMember(owner = "client!vba", name = "q", descriptor = "I")
	public static int anInt9703;

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method8267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class247 local7 = Static332.aClass247ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class85 local13 = local7.aClass85_3; local13 != null; local13 = local13.aClass85_1) {
			@Pc(17) Class23_Sub2_Sub1 local17 = local13.aClass23_Sub2_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort123 == arg1 && local17.aShort124 == arg2) {
				Static447.method6466(local17, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIIIIII)V")
	public static void method8268(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static303.anInt9951 <= arg3 - arg0 && Static408.anInt6951 >= arg3 + arg0 && arg2 - arg0 >= Static255.anInt4818 && arg0 + arg2 <= Static658.anInt10079) {
			Static593.method7942(arg4, arg5, arg1, arg3, arg0, arg2);
		} else {
			Static563.method7675(arg3, arg4, arg0, arg2, arg5, arg1);
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lclient!ri;Z)V")
	public static void method8269(@OriginalArg(0) Class3_Sub9 arg0) {
		if (arg0.aClass3_Sub12_6 != null) {
			arg0.aClass3_Sub12_6.anInt8563 = 0;
		}
		arg0.aBoolean604 = false;
		for (@Pc(16) Class3_Sub9 local16 = arg0.method6700(); local16 != null; local16 = arg0.method6696()) {
			method8269(local16);
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIIIIZ)V")
	public static void method8270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static332.aClass247ArrayArrayArray1 == null) {
			Static582.aClass16_12.method8113(arg3, arg1, arg2, -16777216, arg0);
		} else if (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10108 >= 0 && Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10108 < Static251.anInt4680 * 512 && Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10109 >= 0 && Static406.anInt6924 * 512 > Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10109) {
			Static156.anInt5851++;
			if (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2 != null && Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10108 + 256 - Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.method8625() * 256 >> 9 == Static75.anInt1704 && Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10109 - (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.method8625() - 1) * 256 >> 9 == Static217.anInt4007) {
				Static217.anInt4007 = -1;
				Static75.anInt1704 = -1;
				Static349.method5246();
			}
			Static407.method5805();
			if (!arg4) {
				Static114.method2118();
			}
			Static599.method3048();
			Static43.method1225(arg1, arg2, arg3, true, arg0);
			@Pc(121) int local121 = Static612.anInt9538;
			@Pc(123) int local123 = Static272.anInt5119;
			@Pc(125) int local125 = Static247.anInt4589;
			Static209.anInt10104 = Static209.anInt10102;
			@Pc(129) int local129 = Static105.anInt2207;
			@Pc(137) int local137;
			@Pc(170) int local170;
			if (Static378.anInt6662 == 1) {
				local137 = (int) Static461.aFloat178;
				if (local137 < Static559.anInt9018 >> 8) {
					local137 = Static559.anInt9018 >> 8;
				}
				if (Static115.aBooleanArray9[4] && local137 < Static421.anIntArray447[4] + 128) {
					local137 = Static421.anIntArray447[4] + 128;
				}
				local170 = Static550.anInt8913 + (int) Static204.aFloat82 & 0x3FFF;
				Static388.method5656(local129, Static647.anInt9959, Static429.anInt7552, local170, (local137 >> 3) * 3 + 600 << 2, local137, Static194.method5133(Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10108, Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10109, Static576.anInt9136) - 200);
			} else if (Static378.anInt6662 == 4) {
				local137 = (int) Static461.aFloat178;
				if (local137 < Static559.anInt9018 >> 8) {
					local137 = Static559.anInt9018 >> 8;
				}
				if (Static115.aBooleanArray9[4] && local137 < Static421.anIntArray447[4] + 128) {
					local137 = Static421.anIntArray447[4] + 128;
				}
				local170 = (int) Static204.aFloat82 & 0x3FFF;
				Static388.method5656(local129, Static647.anInt9959, Static429.anInt7552, local170, (local137 >> 3) * 3 + 600 << 2, local137, Static194.method5133(Static140.anInt2658, Static276.anInt5174, Static576.anInt9136) - 200);
			} else if (Static378.anInt6662 == 5) {
				Static602.method8011(local129);
			}
			local137 = Static97.anInt2082;
			local170 = Static265.anInt9363;
			@Pc(272) int local272 = Static663.anInt10236;
			@Pc(274) int local274 = Static118.anInt2323;
			@Pc(276) int local276 = Static206.anInt3821;
			@Pc(320) int local320;
			for (@Pc(278) int local278 = 0; local278 < 5; local278++) {
				if (Static115.aBooleanArray9[local278]) {
					local320 = (int) ((double) -Static454.anIntArray473[local278] + Math.random() * (double) (Static454.anIntArray473[local278] * 2 + 1) + Math.sin((double) Static163.anIntArray195[local278] / 100.0D * (double) Static13.anIntArray7[local278]) * (double) Static421.anIntArray447[local278]);
					if (local278 == 4) {
						Static118.anInt2323 += local320;
						if (Static118.anInt2323 < 1024) {
							Static118.anInt2323 = 1024;
						} else if (Static118.anInt2323 > 3072) {
							Static118.anInt2323 = 3072;
						}
					}
					if (local278 == 2) {
						Static663.anInt10236 += local320 << 2;
					}
					if (local278 == 1) {
						Static265.anInt9363 += local320 << 2;
					}
					if (local278 == 3) {
						Static206.anInt3821 = Static206.anInt3821 + local320 & 0x3FFF;
					}
					if (local278 == 0) {
						Static97.anInt2082 += local320 << 2;
					}
				}
			}
			if (Static97.anInt2082 < 0) {
				Static97.anInt2082 = 0;
			}
			if (Static663.anInt10236 < 0) {
				Static663.anInt10236 = 0;
			}
			if (Static97.anInt2082 > (Static410.anInt6962 << 9) - 1) {
				Static97.anInt2082 = (Static410.anInt6962 << 9) - 1;
			}
			if ((Static315.anInt5894 << 9) - 1 < Static663.anInt10236) {
				Static663.anInt10236 = (Static315.anInt5894 << 9) - 1;
			}
			Static321.method5035();
			Static581.method7831();
			Static582.aClass16_12.KA(local125, local123, local125 + local121, local129 + local123);
			Static241.method3895(true);
			if (Static649.aBoolean735) {
				Static539.method7483(Static637.anInt9833);
				if (Static209.anInt10104 != Static200.anInt3625) {
					Static674.aBoolean763 = true;
				}
				Static200.anInt3625 = Static209.anInt10104;
			} else {
				Static582.aClass16_12.ya();
				local320 = Static637.anInt9833;
				if (Static578.aClass10_1 == null) {
					Static582.aClass16_12.GA(local320);
				} else {
					Static578.aClass10_1.method88(local121, local129, local125, Static118.anInt2323, Static582.aClass16_12, local123, Static112.anInt2272 << 3, local320, Static206.anInt3821);
				}
			}
			Static312.method4827();
			Static668.aClass25_9.method4294(Static97.anInt2082, Static265.anInt9363, Static663.anInt10236, -Static118.anInt2323 & 0x3FFF, -Static206.anInt3821 & 0x3FFF, -Static260.anInt4898 & 0x3FFF);
			Static582.aClass16_12.method8135(Static668.aClass25_9);
			Static582.aClass16_12.DA(local121 / 2 + local125, local123 - -(local129 / 2), Static139.anInt2634 << 1, Static139.anInt2634 << 1);
			Static505.method7160(Static139.anInt2634 << 1, local121 / 2 + local125, Static139.anInt2634 << 1, local129 / 2 + local123);
			Static586.method7874(Static265.anInt9363, -Static206.anInt3821 & 0x3FFF, -Static260.anInt4898 & 0x3FFF, Static663.anInt10236, Static97.anInt2082, -Static118.anInt2323 & 0x3FFF);
			@Pc(581) byte local581 = Static227.aClass3_Sub15_11.aClass17_Sub11_1.method4522() == 2 ? (byte) Static156.anInt5851 : 1;
			if (Static649.aBoolean735) {
				Static512.method7235(-Static206.anInt3821 & 0x3FFF, -Static260.anInt4898 & 0x3FFF, -Static118.anInt2323 & 0x3FFF);
				Static272.method4335(Static384.anIntArray26, Static265.anInt9363, Static621.anInt9665, Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10109 >> 9, Static588.aByteArrayArrayArray18, Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142 + 1, Static209.anInt10104, Static457.anIntArray475, Static676.anIntArray669, Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10108 >> 9, Static112.anIntArray151, Static663.anInt10236, local581, Static309.anIntArray373, Static97.anInt2082, Static227.aClass3_Sub15_11.aClass17_Sub10_1.method3894() == 0);
			} else {
				Static643.method8445(Static621.anInt9665, Static97.anInt2082, Static265.anInt9363, Static663.anInt10236, Static588.aByteArrayArrayArray18, Static112.anIntArray151, Static457.anIntArray475, Static384.anIntArray26, Static309.anIntArray373, Static676.anIntArray669, Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142 + 1, local581, Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10108 >> 9, Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10109 >> 9, Static227.aClass3_Sub15_11.aClass17_Sub10_1.method3894() == 0, Static148.aBoolean221 ? Static209.anInt10104 : -1, 0, false);
			}
			Static312.method4827();
			if (Static520.anInt6836 == 10) {
				Static235.method3804(local125, local123, local129, local121);
				Static410.method5821(local125, local121, local123, local129);
				Static190.method3053(local123, local125, local121, local129);
				Static98.method1956(local123, local125, local129, local121);
			}
			Static230.method3704();
			Static206.anInt3821 = local276;
			Static97.anInt2082 = local137;
			Static265.anInt9363 = local170;
			Static118.anInt2323 = local274;
			Static663.anInt10236 = local272;
			if (Static264.aBoolean402 && Static600.aClass366_3.method8103() == 0) {
				Static264.aBoolean402 = false;
			}
			if (Static264.aBoolean402) {
				Static582.aClass16_12.method8113(local129, local125, local121, -16777216, local123);
				Static659.method8584(Static582.aClass16_12, Static117.aClass202_3, Static277.aClass69_9, Static569.aClass335_13.method7694(Static319.anInt5939), false);
			}
			Static241.method3895(false);
		} else {
			Static582.aClass16_12.method8113(arg3, arg1, arg2, -16777216, arg0);
		}
	}
}
