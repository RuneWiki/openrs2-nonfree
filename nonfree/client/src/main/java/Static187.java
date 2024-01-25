import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "F")
	public static float aFloat25;

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
	public static int anInt3095;

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
	public static int anInt3099;

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "[I")
	public static final int[] anIntArray186 = new int[5];

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
	public static int anInt3100 = 0;

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString36 = "";

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "Lclient!vq;")
	public static final Class382 aClass382_14 = new Class382(11, 0, 1, 2);

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
	public static int anInt3103 = -1;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;BILjava/lang/String;)V")
	public static void method2752(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5) {
		Static218.method3767((String) null, arg2, arg3, arg4, -1, arg1, arg0, arg5);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZILclient!rea;)V")
	public static void method2753(@OriginalArg(1) int arg0, @OriginalArg(2) Class14_Sub21_Sub2 arg1) {
		@Pc(16) boolean local16 = arg1.method7764(1) == 1;
		if (local16) {
			Static429.anIntArray385[Static134.anInt2097++] = arg0;
		}
		@Pc(33) int local33 = arg1.method7764(2);
		@Pc(37) Class4_Sub3_Sub3_Sub3_Sub2 local37 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[arg0];
		if (local33 != 0) {
			@Pc(162) int local162;
			@Pc(167) int local167;
			@Pc(172) int local172;
			if (local33 == 1) {
				local162 = arg1.method7764(3);
				local167 = local37.anIntArray200[0];
				local172 = local37.anIntArray201[0];
				if (local162 == 0) {
					local172--;
					local167--;
				} else if (local162 == 1) {
					local172--;
				} else if (local162 == 2) {
					local172--;
					local167++;
				} else if (local162 == 3) {
					local167--;
				} else if (local162 == 4) {
					local167++;
				} else if (local162 == 5) {
					local167--;
					local172++;
				} else if (local162 == 6) {
					local172++;
				} else if (local162 == 7) {
					local172++;
					local167++;
				}
				if (local16) {
					local37.aBoolean241 = true;
					local37.anInt3319 = local167;
					local37.anInt3313 = local172;
				} else {
					local37.method2886(Static98.aByteArray25[arg0], local172, local167);
				}
			} else if (local33 == 2) {
				local162 = arg1.method7764(4);
				local167 = local37.anIntArray200[0];
				local172 = local37.anIntArray201[0];
				if (local162 == 0) {
					local172 -= 2;
					local167 -= 2;
				} else if (local162 == 1) {
					local172 -= 2;
					local167--;
				} else if (local162 == 2) {
					local172 -= 2;
				} else if (local162 == 3) {
					local172 -= 2;
					local167++;
				} else if (local162 == 4) {
					local172 -= 2;
					local167 += 2;
				} else if (local162 == 5) {
					local172--;
					local167 -= 2;
				} else if (local162 == 6) {
					local167 += 2;
					local172--;
				} else if (local162 == 7) {
					local167 -= 2;
				} else if (local162 == 8) {
					local167 += 2;
				} else if (local162 == 9) {
					local167 -= 2;
					local172++;
				} else if (local162 == 10) {
					local172++;
					local167 += 2;
				} else if (local162 == 11) {
					local167 -= 2;
					local172 += 2;
				} else if (local162 == 12) {
					local172 += 2;
					local167--;
				} else if (local162 == 13) {
					local172 += 2;
				} else if (local162 == 14) {
					local167++;
					local172 += 2;
				} else if (local162 == 15) {
					local172 += 2;
					local167 += 2;
				}
				if (local16) {
					local37.anInt3319 = local167;
					local37.aBoolean241 = true;
					local37.anInt3313 = local172;
				} else {
					local37.method2886(Static98.aByteArray25[arg0], local172, local167);
				}
			} else {
				local162 = arg1.method7764(1);
				@Pc(443) int local443;
				@Pc(455) int local455;
				@Pc(470) int local470;
				@Pc(477) int local477;
				if (local162 == 0) {
					local167 = arg1.method7764(12);
					local172 = local167 >> 10;
					local443 = local167 >> 5 & 0x1F;
					if (local443 > 15) {
						local443 -= 32;
					}
					local455 = local167 & 0x1F;
					if (local455 > 15) {
						local455 -= 32;
					}
					local470 = local443 + local37.anIntArray200[0];
					local477 = local455 + local37.anIntArray201[0];
					if (local16) {
						local37.anInt3319 = local470;
						local37.aBoolean241 = true;
						local37.anInt3313 = local477;
					} else {
						local37.method2886(Static98.aByteArray25[arg0], local477, local470);
					}
					local37.aByte146 = local37.aByte147 = (byte) (local37.aByte146 + local172 & 0x3);
					if (Static551.method7974(local470, local477)) {
						local37.aByte147++;
					}
					if (arg0 == Static597.anInt9858) {
						if (Static391.anInt6811 != local37.aByte146) {
							Static282.aBoolean384 = true;
						}
						Static391.anInt6811 = local37.aByte146;
					}
				} else {
					local167 = arg1.method7764(30);
					local172 = local167 >> 28;
					local443 = local167 >> 14 & 0x3FFF;
					local455 = local167 & 0x3FFF;
					local470 = (local443 + Static36.anInt617 + local37.anIntArray200[0] & 0x3FFF) - Static36.anInt617;
					local477 = (local455 + local37.anIntArray201[0] + Static550.anInt9242 & 0x3FFF) - Static550.anInt9242;
					if (local16) {
						local37.anInt3313 = local477;
						local37.anInt3319 = local470;
						local37.aBoolean241 = true;
					} else {
						local37.method2886(Static98.aByteArray25[arg0], local477, local470);
					}
					local37.aByte146 = local37.aByte147 = (byte) (local172 + local37.aByte146 & 0x3);
					if (Static551.method7974(local470, local477)) {
						local37.aByte147++;
					}
					if (arg0 == Static597.anInt9858) {
						Static391.anInt6811 = local37.aByte146;
					}
				}
			}
		} else if (local16) {
			local37.aBoolean241 = false;
		} else if (Static597.anInt9858 == arg0) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(67) Class245 local67 = Static671.aClass245Array1[arg0] = new Class245();
			local67.anInt6983 = (local37.aByte146 << 28) - (-(local37.anIntArray200[0] + Static36.anInt617 >> 6 << 14) - (local37.anIntArray201[0] + Static550.anInt9242 >> 6));
			if (local37.anInt3322 == -1) {
				local67.anInt6984 = local37.aClass200_7.method4987();
			} else {
				local67.anInt6984 = local37.anInt3322;
			}
			local67.aBoolean492 = local37.aBoolean242;
			local67.anInt6979 = local37.anInt3256;
			local67.aBoolean491 = local37.aBoolean246;
			if (local37.anInt3309 > 0) {
				Static343.method5235(local37);
			}
			Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[arg0] = null;
			if (arg1.method7764(1) != 0) {
				Static323.method5070(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIBII)V")
	public static void method2755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = arg6;
		@Pc(9) int local9 = 0;
		@Pc(14) int local14 = arg1 - arg4;
		@Pc(19) int local19 = arg6 - arg4;
		@Pc(23) int local23 = arg1 * arg1;
		@Pc(27) int local27 = arg6 * arg6;
		@Pc(31) int local31 = local14 * local14;
		@Pc(35) int local35 = local19 * local19;
		@Pc(39) int local39 = local27 << 1;
		@Pc(43) int local43 = local23 << 1;
		@Pc(47) int local47 = local35 << 1;
		@Pc(51) int local51 = local31 << 1;
		@Pc(55) int local55 = arg6 << 1;
		@Pc(59) int local59 = local19 << 1;
		@Pc(67) int local67 = local39 + (1 - local55) * local23;
		@Pc(76) int local76 = local27 - local43 * (local55 - 1);
		@Pc(85) int local85 = local47 + (1 - local59) * local31;
		@Pc(94) int local94 = local35 - (local59 - 1) * local51;
		@Pc(98) int local98 = local23 << 2;
		@Pc(102) int local102 = local27 << 2;
		@Pc(106) int local106 = local31 << 2;
		@Pc(110) int local110 = local35 << 2;
		@Pc(114) int local114 = local39 * 3;
		@Pc(120) int local120 = local43 * (local55 - 3);
		@Pc(124) int local124 = local47 * 3;
		@Pc(130) int local130 = local51 * (local59 - 3);
		@Pc(139) int local139 = local102;
		@Pc(145) int local145 = local98 * (arg6 - 1);
		@Pc(147) int local147 = local110;
		@Pc(153) int local153 = local106 * (local19 - 1);
		@Pc(178) int local178;
		@Pc(186) int local186;
		@Pc(195) int local195;
		@Pc(203) int local203;
		if (Static410.anInt7068 <= arg0 && Static281.anInt5188 >= arg0) {
			@Pc(169) int[] local169 = Static144.anIntArrayArray30[arg0];
			local178 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg5 - arg1);
			local186 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg5 + arg1);
			local195 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg5 - local14);
			local203 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg5 + local14);
			Static240.method4038(local195, local169, arg3, local178);
			Static240.method4038(local203, local169, arg2, local195);
			Static240.method4038(local186, local169, arg3, local203);
		}
		while (local7 > 0) {
			@Pc(234) boolean local234 = local7 <= local19;
			if (local234) {
				if (local85 < 0) {
					while (local85 < 0) {
						local94 += local147;
						local85 += local124;
						local124 += local110;
						local147 += local110;
						local9++;
					}
				}
				if (local94 < 0) {
					local94 += local147;
					local85 += local124;
					local9++;
					local147 += local110;
					local124 += local110;
				}
				local85 += -local153;
				local94 += -local130;
				local130 -= local106;
				local153 -= local106;
			}
			if (local67 < 0) {
				while (local67 < 0) {
					local76 += local139;
					local67 += local114;
					local139 += local102;
					local5++;
					local114 += local102;
				}
			}
			if (local76 < 0) {
				local67 += local114;
				local76 += local139;
				local114 += local102;
				local5++;
				local139 += local102;
			}
			local67 += -local145;
			local76 += -local120;
			local120 -= local98;
			local145 -= local98;
			local7--;
			local178 = arg0 - local7;
			local186 = arg0 + local7;
			if (Static410.anInt7068 <= local186 && Static281.anInt5188 >= local178) {
				local195 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg5 + local5);
				local203 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg5 - local5);
				if (local234) {
					@Pc(417) int local417 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, local9 + arg5);
					@Pc(425) int local425 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg5 - local9);
					@Pc(432) int[] local432;
					if (Static410.anInt7068 <= local178) {
						local432 = Static144.anIntArrayArray30[local178];
						Static240.method4038(local425, local432, arg3, local203);
						Static240.method4038(local417, local432, arg2, local425);
						Static240.method4038(local195, local432, arg3, local417);
					}
					if (local186 <= Static281.anInt5188) {
						local432 = Static144.anIntArrayArray30[local186];
						Static240.method4038(local425, local432, arg3, local203);
						Static240.method4038(local417, local432, arg2, local425);
						Static240.method4038(local195, local432, arg3, local417);
					}
				} else {
					if (Static410.anInt7068 <= local178) {
						Static240.method4038(local195, Static144.anIntArrayArray30[local178], arg3, local203);
					}
					if (local186 <= Static281.anInt5188) {
						Static240.method4038(local195, Static144.anIntArrayArray30[local186], arg3, local203);
					}
				}
			}
		}
	}
}
