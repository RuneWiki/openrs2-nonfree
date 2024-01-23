import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
	public static int anInt625;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
	public static int anInt618 = 0;

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "Lclient!pb;")
	public static Class96 aClass96_1 = Static250.method3753();

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
	public static int anInt621 = -1;

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "Z")
	public static boolean aBoolean40 = true;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIIII)V")
	public static void method407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(3) int local3 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg6 - arg3;
		@Pc(21) int local21 = arg5 - arg3;
		@Pc(25) int local25 = arg6 * arg6;
		@Pc(29) int local29 = arg5 * arg5;
		@Pc(33) int local33 = local21 * local21;
		@Pc(37) int local37 = local25 << 1;
		@Pc(41) int local41 = local16 * local16;
		@Pc(45) int local45 = local29 << 1;
		@Pc(49) int local49 = local33 << 1;
		@Pc(53) int local53 = arg5 << 1;
		@Pc(57) int local57 = local21 << 1;
		@Pc(66) int local66 = local29 - local37 * (local53 - 1);
		@Pc(70) int local70 = local41 << 1;
		@Pc(80) int local80 = local41 * (1 - local57) + local49;
		@Pc(89) int local89 = local33 - (local57 - 1) * local70;
		@Pc(98) int local98 = local45 + (1 - local53) * local25;
		@Pc(102) int local102 = local25 << 2;
		@Pc(106) int local106 = local29 << 2;
		@Pc(110) int local110 = local41 << 2;
		@Pc(114) int local114 = local33 << 2;
		@Pc(118) int local118 = local45 * 3;
		@Pc(124) int local124 = local70 * (local57 - 3);
		@Pc(128) int local128 = local49 * 3;
		@Pc(130) int local130 = local106;
		@Pc(136) int local136 = (arg5 - 1) * local102;
		@Pc(142) int local142 = (local53 - 3) * local37;
		@Pc(144) int local144 = local114;
		@Pc(150) int local150 = (local21 - 1) * local110;
		@Pc(154) int[] local154 = Static181.anIntArrayArray19[arg4];
		Static19.method343(arg2 - arg6, arg0, local154, arg2 - local16);
		Static19.method343(arg2 - local16, arg1, local154, local16 + arg2);
		Static19.method343(arg2 + local16, arg0, local154, arg2 + arg6);
		while (local9 > 0) {
			@Pc(206) boolean local206 = local21 >= local9;
			if (local98 < 0) {
				while (local98 < 0) {
					local98 += local118;
					local118 += local106;
					local66 += local130;
					local3++;
					local130 += local106;
				}
			}
			if (local66 < 0) {
				local98 += local118;
				local66 += local130;
				local118 += local106;
				local130 += local106;
				local3++;
			}
			local9--;
			local66 += -local142;
			local98 += -local136;
			local136 -= local102;
			if (local206) {
				if (local80 < 0) {
					while (local80 < 0) {
						local80 += local128;
						local11++;
						local89 += local144;
						local144 += local114;
						local128 += local114;
					}
				}
				if (local89 < 0) {
					local80 += local128;
					local89 += local144;
					local11++;
					local144 += local114;
					local128 += local114;
				}
				local89 += -local124;
				local124 -= local110;
				local80 += -local150;
				local150 -= local110;
			}
			@Pc(342) int local342 = arg4 - local9;
			local142 -= local102;
			@Pc(350) int local350 = arg2 + local3;
			@Pc(354) int local354 = local9 + arg4;
			@Pc(359) int local359 = arg2 - local3;
			if (local206) {
				@Pc(365) int local365 = arg2 + local11;
				@Pc(370) int local370 = arg2 - local11;
				Static19.method343(local359, arg0, Static181.anIntArrayArray19[local342], local370);
				Static19.method343(local370, arg1, Static181.anIntArrayArray19[local342], local365);
				Static19.method343(local365, arg0, Static181.anIntArrayArray19[local342], local350);
				Static19.method343(local359, arg0, Static181.anIntArrayArray19[local354], local370);
				Static19.method343(local370, arg1, Static181.anIntArrayArray19[local354], local365);
				Static19.method343(local365, arg0, Static181.anIntArrayArray19[local354], local350);
			} else {
				Static19.method343(local359, arg0, Static181.anIntArrayArray19[local342], local350);
				Static19.method343(local359, arg0, Static181.anIntArrayArray19[local354], local350);
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class8_Sub27 local7 = Static178.aClass8_Sub27ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass134_1 != null && local7.aClass134_1.aLong147 == arg3) {
			return true;
		} else if (local7.aClass141_1 != null && local7.aClass141_1.aLong166 == arg3) {
			return true;
		} else if (local7.aClass120_1 != null && local7.aClass120_1.aLong127 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt4857; local46++) {
				if (local7.aClass170Array3[local46].aLong196 == arg3) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!tk;I)V")
	public static void method410(@OriginalArg(0) Class159 arg0) {
		@Pc(8) int local8 = arg0.anInt5188;
		if (local8 == 324) {
			if (Static197.anInt3895 == -1) {
				Static94.anInt1964 = arg0.anInt5155;
				Static197.anInt3895 = arg0.anInt5144;
			}
			if (Static24.aClass11_1.aBoolean26) {
				arg0.anInt5144 = Static197.anInt3895;
			} else {
				arg0.anInt5144 = Static94.anInt1964;
			}
		} else if (local8 == 325) {
			if (Static197.anInt3895 == -1) {
				Static94.anInt1964 = arg0.anInt5155;
				Static197.anInt3895 = arg0.anInt5144;
			}
			if (Static24.aClass11_1.aBoolean26) {
				arg0.anInt5144 = Static94.anInt1964;
			} else {
				arg0.anInt5144 = Static197.anInt3895;
			}
		} else if (local8 == 327) {
			arg0.anInt5163 = 150;
			arg0.anInt5138 = (int) (Math.sin((double) Static183.anInt3590 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt5151 = 5;
			arg0.anInt5153 = -1;
		} else if (local8 == 328) {
			if (Static21.aClass36_Sub3_Sub1_1.aString144 == null) {
				arg0.anInt5153 = 0;
			} else {
				arg0.anInt5163 = 150;
				arg0.anInt5138 = (int) (Math.sin((double) Static183.anInt3590 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt5151 = 5;
				arg0.anInt5153 = ((int) Static31.method513(Static21.aClass36_Sub3_Sub1_1.aString144) << 11) + 2047;
				arg0.anInt5194 = Static21.aClass36_Sub3_Sub1_1.anInt4104;
				arg0.anInt5175 = 0;
				arg0.anInt5141 = Static21.aClass36_Sub3_Sub1_1.anInt4067;
				arg0.anInt5137 = Static21.aClass36_Sub3_Sub1_1.anInt4122;
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)V")
	public static void method411() {
		if (!Static218.aBoolean362 && Static147.anInt2995 != 2) {
			try {
				Static304.method1290(Static249.aClient1, "tbrefresh");
			} catch (@Pc(18) Throwable local18) {
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIII)I")
	public static int method412(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 1023 - arg1;
		} else if (local3 == 2) {
			return 1023 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLclient!lk;)V")
	public static void method413(@OriginalArg(1) Class36_Sub3 arg0) {
		@Pc(5) Class12 local5 = arg0.method3105();
		arg0.anInt4067 = local5.anInt423;
		if (arg0.anInt4093 == 0) {
			arg0.anInt4148 = 0;
			return;
		}
		if (arg0.anInt4107 != -1 && arg0.anInt4113 == 0) {
			@Pc(32) Class76 local32 = Static115.method1855(arg0.anInt4107);
			if (arg0.anInt4090 > 0 && local32.anInt2225 == 0) {
				arg0.anInt4148++;
				return;
			}
			if (arg0.anInt4090 <= 0 && local32.anInt2216 == 0) {
				arg0.anInt4148++;
				return;
			}
		}
		if (arg0.anInt4125 != -1 && Static183.anInt3590 >= arg0.anInt4149) {
			@Pc(81) Class144 local81 = Static81.method1346(arg0.anInt4125);
			if (local81.aBoolean374 && local81.anInt4680 != -1) {
				@Pc(93) Class76 local93 = Static115.method1855(local81.anInt4680);
				if (arg0.anInt4090 > 0 && local93.anInt2225 == 0) {
					arg0.anInt4148++;
					return;
				}
				if (arg0.anInt4090 <= 0 && local93.anInt2216 == 0) {
					arg0.anInt4148++;
					return;
				}
			}
		}
		@Pc(127) int local127 = arg0.anInt4117;
		@Pc(130) int local130 = arg0.anInt4118;
		@Pc(147) int local147 = arg0.anIntArray310[arg0.anInt4093 - 1] * 128 + arg0.method3110() * 64;
		@Pc(164) int local164 = arg0.anIntArray308[arg0.anInt4093 - 1] * 128 + arg0.method3110() * 64;
		if (local147 - local127 > 256 || local147 - local127 < -256 || local164 - local130 > 256 || local164 - local130 < -256) {
			arg0.anInt4117 = local147;
			arg0.anInt4118 = local164;
			return;
		}
		@Pc(197) int local197 = 4;
		if (local127 >= local147) {
			if (local127 <= local147) {
				if (local164 > local130) {
					arg0.anInt4081 = 1024;
				} else if (local164 < local130) {
					arg0.anInt4081 = 0;
				}
			} else if (local164 > local130) {
				arg0.anInt4081 = 768;
			} else if (local130 <= local164) {
				arg0.anInt4081 = 512;
			} else {
				arg0.anInt4081 = 256;
			}
		} else if (local164 > local130) {
			arg0.anInt4081 = 1280;
		} else if (local130 > local164) {
			arg0.anInt4081 = 1792;
		} else {
			arg0.anInt4081 = 1536;
		}
		@Pc(278) int local278 = local5.anInt422;
		@Pc(280) byte local280 = 1;
		@Pc(289) int local289 = arg0.anInt4081 - arg0.anInt4128 & 0x7FF;
		if (local289 > 1024) {
			local289 -= 2048;
		}
		@Pc(298) boolean local298 = true;
		if (local289 >= -256 && local289 <= 256) {
			local278 = local5.anInt383;
		} else if (local289 >= 256 && local289 < 768) {
			local278 = local5.anInt401;
		} else if (local289 >= -768 && local289 <= -256) {
			local278 = local5.anInt407;
		}
		if (local278 == -1) {
			local278 = local5.anInt383;
		}
		arg0.anInt4067 = local278;
		if (arg0 instanceof Class36_Sub3_Sub2) {
			local298 = ((Class36_Sub3_Sub2) arg0).aClass173_1.aBoolean470;
		}
		if (local298) {
			if (arg0.anInt4081 != arg0.anInt4128 && arg0.anInt4139 == -1 && arg0.anInt4129 != 0) {
				local197 = 2;
			}
			if (arg0.anInt4093 > 2) {
				local197 = 6;
			}
			if (arg0.anInt4093 > 3) {
				local197 = 8;
			}
			if (arg0.anInt4148 > 0 && arg0.anInt4093 > 1) {
				arg0.anInt4148--;
				local197 = 8;
			}
		} else {
			if (arg0.anInt4093 > 1) {
				local197 = 6;
			}
			if (arg0.anInt4093 > 2) {
				local197 = 8;
			}
			if (arg0.anInt4148 > 0 && arg0.anInt4093 > 1) {
				arg0.anInt4148--;
				local197 = 8;
			}
		}
		if (arg0.aByteArray36[arg0.anInt4093 - 1] == 2) {
			local197 <<= 0x1;
			local280 = 2;
		} else if (arg0.aByteArray36[arg0.anInt4093 - 1] == 0) {
			local280 = 0;
			local197 >>= 0x1;
		}
		if (local197 < 8 || local5.anInt421 == -1) {
			if (local5.anInt408 != -1 && local280 == 0) {
				if (local5.anInt422 == arg0.anInt4067 && local5.anInt386 != -1) {
					arg0.anInt4067 = local5.anInt386;
				} else if (arg0.anInt4067 == local5.anInt407 && local5.anInt394 != -1) {
					arg0.anInt4067 = local5.anInt394;
				} else if (arg0.anInt4067 == local5.anInt401 && local5.anInt416 != -1) {
					arg0.anInt4067 = local5.anInt416;
				} else {
					arg0.anInt4067 = local5.anInt408;
				}
			}
		} else if (local5.anInt422 == arg0.anInt4067 && local5.anInt399 != -1) {
			arg0.anInt4067 = local5.anInt399;
		} else if (arg0.anInt4067 == local5.anInt407 && local5.anInt397 != -1) {
			arg0.anInt4067 = local5.anInt397;
		} else if (arg0.anInt4067 == local5.anInt401 && local5.anInt413 != -1) {
			arg0.anInt4067 = local5.anInt413;
		} else {
			arg0.anInt4067 = local5.anInt421;
		}
		if (local5.anInt382 != -1) {
			local197 <<= 0x7;
			if (arg0.anInt4093 == 1) {
				@Pc(654) int local654 = (arg0.anInt4118 <= local164 ? local164 - arg0.anInt4118 : arg0.anInt4118 - local164) << 7;
				@Pc(671) int local671 = (arg0.anInt4117 <= local147 ? local147 - arg0.anInt4117 : arg0.anInt4117 - local147) << 7;
				@Pc(678) int local678 = local671 > local654 ? local671 : local654;
				@Pc(685) int local685 = local5.anInt382 * 2 * local678;
				@Pc(691) int local691 = arg0.anInt4082 * arg0.anInt4082;
				if (local691 > local685) {
					arg0.anInt4082 /= 2;
				} else if (local691 / 2 > local678) {
					arg0.anInt4082 -= local5.anInt382;
					if (arg0.anInt4082 < 0) {
						arg0.anInt4082 = 0;
					}
				} else if (local197 > arg0.anInt4082) {
					arg0.anInt4082 += local5.anInt382;
					if (local197 < arg0.anInt4082) {
						arg0.anInt4082 = local197;
					}
				}
			} else if (local197 > arg0.anInt4082) {
				arg0.anInt4082 += local5.anInt382;
				if (arg0.anInt4082 > local197) {
					arg0.anInt4082 = local197;
				}
			} else if (arg0.anInt4082 > 0) {
				arg0.anInt4082 -= local5.anInt382;
				if (arg0.anInt4082 < 0) {
					arg0.anInt4082 = 0;
				}
			}
			local197 = arg0.anInt4082 >> 7;
			if (local197 < 1) {
				local197 = 1;
			}
		}
		if (local164 > local130) {
			arg0.anInt4118 += local197;
			if (arg0.anInt4118 > local164) {
				arg0.anInt4118 = local164;
			}
		} else if (local164 < local130) {
			arg0.anInt4118 -= local197;
			if (arg0.anInt4118 < local164) {
				arg0.anInt4118 = local164;
			}
		}
		if (local127 < local147) {
			arg0.anInt4117 += local197;
			if (arg0.anInt4117 > local147) {
				arg0.anInt4117 = local147;
			}
		} else if (local127 > local147) {
			arg0.anInt4117 -= local197;
			if (arg0.anInt4117 < local147) {
				arg0.anInt4117 = local147;
			}
		}
		if (arg0.anInt4117 == local147 && arg0.anInt4118 == local164) {
			arg0.anInt4093--;
			if (arg0.anInt4090 > 0) {
				arg0.anInt4090--;
			}
		}
	}
}
