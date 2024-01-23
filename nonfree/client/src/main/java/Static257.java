import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!sl", name = "V", descriptor = "[C")
	public static char[] aCharArray3 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!sl", name = "Y", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray29 = null;

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(IIIIII)V")
	public static void method4059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(18) int local18 = arg4 - arg3;
		@Pc(23) int local23 = arg1 - arg0;
		if (local18 == 0) {
			if (local23 != 0) {
				Static125.method1931(arg3, arg0, arg1, arg2);
			}
		} else if (local23 == 0) {
			Static63.method1015(arg3, arg4, arg2, arg0);
		} else {
			@Pc(55) int local55 = (local23 << 12) / local18;
			@Pc(64) int local64 = arg0 - (arg3 * local55 >> 12);
			@Pc(76) int local76;
			@Pc(78) int local78;
			if (arg3 < Static48.anInt902) {
				local78 = local64 + (Static48.anInt902 * local55 >> 12);
				local76 = Static48.anInt902;
			} else if (Static131.anInt2553 >= arg3) {
				local76 = arg3;
				local78 = arg0;
			} else {
				local76 = Static131.anInt2553;
				local78 = (Static131.anInt2553 * local55 >> 12) + local64;
			}
			@Pc(115) int local115;
			@Pc(117) int local117;
			if (arg4 < Static48.anInt902) {
				local115 = Static48.anInt902;
				local117 = local64 + (Static48.anInt902 * local55 >> 12);
			} else if (arg4 <= Static131.anInt2553) {
				local115 = arg4;
				local117 = arg1;
			} else {
				local115 = Static131.anInt2553;
				local117 = (local55 * Static131.anInt2553 >> 12) + local64;
			}
			if (Static156.anInt3086 > local117) {
				local115 = (Static156.anInt3086 - local64 << 12) / local55;
				local117 = Static156.anInt3086;
			} else if (Static218.anInt4231 < local117) {
				local115 = (Static218.anInt4231 - local64 << 12) / local55;
				local117 = Static218.anInt4231;
			}
			if (Static156.anInt3086 > local78) {
				local76 = (Static156.anInt3086 - local64 << 12) / local55;
				local78 = Static156.anInt3086;
			} else if (local78 > Static218.anInt4231) {
				local78 = Static218.anInt4231;
				local76 = (Static218.anInt4231 - local64 << 12) / local55;
			}
			Static20.method280(local117, local76, local78, arg2, local115);
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "([ILclient!f;I[I[I)V")
	public static void method4060(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class53_Sub1_Sub1 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(11) int local11 = 0; local11 < arg3.length; local11++) {
			@Pc(23) int local23 = arg3[local11];
			@Pc(27) int local27 = arg2[local11];
			@Pc(31) int local31 = arg0[local11];
			for (@Pc(33) int local33 = 0; local31 != 0 && local33 < arg1.aClass153Array3.length; local33++) {
				if ((local31 & 0x1) != 0) {
					if (local23 == -1) {
						arg1.aClass153Array3[local33] = null;
					} else {
						@Pc(61) Class46 local61 = Static156.method2501(local23);
						@Pc(66) Class153 local66 = arg1.aClass153Array3[local33];
						@Pc(69) int local69 = local61.anInt1238;
						if (local66 != null) {
							if (local66.anInt4457 == local23) {
								if (local69 == 0) {
									local66 = arg1.aClass153Array3[local33] = null;
								} else if (local69 == 1) {
									local66.anInt4463 = 0;
									local66.anInt4465 = 1;
									local66.anInt4461 = 0;
									local66.anInt4466 = 0;
									local66.anInt4462 = local27;
									Static213.method3474(local61, arg1.anInt4002, arg1.anInt3974, 0, Static154.aClass53_Sub1_Sub1_2 == arg1);
								} else if (local69 == 2) {
									local66.anInt4466 = 0;
								}
							} else if (local61.anInt1243 >= Static156.method2501(local66.anInt4457).anInt1243) {
								local66 = arg1.aClass153Array3[local33] = null;
							}
						}
						if (local66 == null) {
							local66 = arg1.aClass153Array3[local33] = new Class153();
							local66.anInt4457 = local23;
							local66.anInt4461 = 0;
							local66.anInt4466 = 0;
							local66.anInt4462 = local27;
							local66.anInt4465 = 1;
							local66.anInt4463 = 0;
							Static213.method3474(local61, arg1.anInt4002, arg1.anInt3974, 0, arg1 == Static154.aClass53_Sub1_Sub1_2);
						}
					}
				}
				local31 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!qc;B)V")
	public static void method4061(@OriginalArg(0) Class53_Sub1 arg0) {
		@Pc(5) Class34 local5 = arg0.method3327();
		arg0.anInt4005 = local5.anInt860;
		if (arg0.anInt3965 == 0) {
			arg0.anInt4037 = 0;
			return;
		}
		if (arg0.anInt4007 != -1 && arg0.anInt3996 == 0) {
			@Pc(41) Class46 local41 = Static156.method2501(arg0.anInt4007);
			if (arg0.anInt4030 > 0 && local41.anInt1240 == 0) {
				arg0.anInt4037++;
				return;
			}
			if (arg0.anInt4030 <= 0 && local41.anInt1237 == 0) {
				arg0.anInt4037++;
				return;
			}
		}
		if (arg0.anInt3961 != -1 && Static50.anInt954 >= arg0.anInt3984) {
			@Pc(95) Class112 local95 = Static132.method2005(arg0.anInt3961);
			if (local95.aBoolean222 && local95.anInt3134 != -1) {
				@Pc(110) Class46 local110 = Static156.method2501(local95.anInt3134);
				if (arg0.anInt4030 > 0 && local110.anInt1240 == 0) {
					arg0.anInt4037++;
					return;
				}
				if (arg0.anInt4030 <= 0 && local110.anInt1237 == 0) {
					arg0.anInt4037++;
					return;
				}
			}
		}
		@Pc(145) int local145 = arg0.anInt3974;
		@Pc(148) int local148 = arg0.anInt4002;
		@Pc(167) int local167 = arg0.anIntArray422[arg0.anInt3965 - 1] * 128 + arg0.method3324() * 64;
		@Pc(184) int local184 = arg0.anIntArray426[arg0.anInt3965 - 1] * 128 + arg0.method3324() * 64;
		if (local167 - local145 > 256 || local167 - local145 < -256 || local184 - local148 > 256 || local184 - local148 < -256) {
			arg0.anInt4002 = local184;
			arg0.anInt3974 = local167;
			return;
		}
		if (local167 <= local145) {
			if (local145 <= local167) {
				if (local184 > local148) {
					arg0.anInt4017 = 1024;
				} else if (local148 > local184) {
					arg0.anInt4017 = 0;
				}
			} else if (local148 < local184) {
				arg0.anInt4017 = 768;
			} else if (local184 >= local148) {
				arg0.anInt4017 = 512;
			} else {
				arg0.anInt4017 = 256;
			}
		} else if (local148 < local184) {
			arg0.anInt4017 = 1280;
		} else if (local148 > local184) {
			arg0.anInt4017 = 1792;
		} else {
			arg0.anInt4017 = 1536;
		}
		@Pc(295) int local295 = local5.anInt828;
		@Pc(304) int local304 = arg0.anInt4017 - arg0.anInt4031 & 0x7FF;
		if (local304 > 1024) {
			local304 -= 2048;
		}
		if (local304 >= -256 && local304 <= 256) {
			local295 = local5.anInt846;
		} else if (local304 >= 256 && local304 < 768) {
			local295 = local5.anInt840;
		} else if (local304 >= -768 && local304 <= -256) {
			local295 = local5.anInt855;
		}
		if (local295 == -1) {
			local295 = local5.anInt846;
		}
		arg0.anInt4005 = local295;
		@Pc(361) int local361 = 4;
		@Pc(363) boolean local363 = true;
		if (arg0 instanceof Class53_Sub1_Sub2) {
			local363 = ((Class53_Sub1_Sub2) arg0).aClass171_1.aBoolean359;
		}
		@Pc(373) byte local373 = 1;
		if (local363) {
			if (arg0.anInt4031 != arg0.anInt4017 && arg0.anInt3985 == -1 && arg0.anInt4009 != 0) {
				local361 = 2;
			}
			if (arg0.anInt3965 > 2) {
				local361 = 6;
			}
			if (arg0.anInt3965 > 3) {
				local361 = 8;
			}
			if (arg0.anInt4037 > 0 && arg0.anInt3965 > 1) {
				local361 = 8;
				arg0.anInt4037--;
			}
		} else {
			if (arg0.anInt3965 > 1) {
				local361 = 6;
			}
			if (arg0.anInt3965 > 2) {
				local361 = 8;
			}
			if (arg0.anInt4037 > 0 && arg0.anInt3965 > 1) {
				arg0.anInt4037--;
				local361 = 8;
			}
		}
		if (arg0.aByteArray51[arg0.anInt3965 - 1] == 2) {
			local373 = 2;
			local361 <<= 0x1;
		} else if (arg0.aByteArray51[arg0.anInt3965 - 1] == 0) {
			local361 >>= 0x1;
			local373 = 0;
		}
		if (local361 < 8 || local5.anInt831 == -1) {
			if (local5.anInt854 != -1 && local373 == 0) {
				if (local5.anInt828 == arg0.anInt4005 && local5.anInt833 != -1) {
					arg0.anInt4005 = local5.anInt833;
				} else if (arg0.anInt4005 == local5.anInt855 && local5.anInt852 != -1) {
					arg0.anInt4005 = local5.anInt852;
				} else if (local5.anInt840 == arg0.anInt4005 && local5.anInt861 != -1) {
					arg0.anInt4005 = local5.anInt861;
				} else {
					arg0.anInt4005 = local5.anInt854;
				}
			}
		} else if (arg0.anInt4005 == local5.anInt828 && local5.anInt829 != -1) {
			arg0.anInt4005 = local5.anInt829;
		} else if (local5.anInt855 == arg0.anInt4005 && local5.anInt867 != -1) {
			arg0.anInt4005 = local5.anInt867;
		} else if (local5.anInt840 == arg0.anInt4005 && local5.anInt857 != -1) {
			arg0.anInt4005 = local5.anInt857;
		} else {
			arg0.anInt4005 = local5.anInt831;
		}
		if (local5.anInt841 != -1) {
			local361 <<= 0x7;
			if (arg0.anInt3965 == 1) {
				@Pc(666) int local666 = arg0.anInt3999 * arg0.anInt3999;
				@Pc(683) int local683 = (local184 >= arg0.anInt4002 ? local184 - arg0.anInt4002 : arg0.anInt4002 - local184) << 7;
				@Pc(701) int local701 = (local167 < arg0.anInt3974 ? arg0.anInt3974 - local167 : -arg0.anInt3974 + local167) << 7;
				@Pc(712) int local712 = local683 >= local701 ? local683 : local701;
				@Pc(719) int local719 = local5.anInt841 * 2 * local712;
				if (local719 < local666) {
					arg0.anInt3999 /= 2;
				} else if (local666 / 2 > local712) {
					arg0.anInt3999 -= local5.anInt841;
					if (arg0.anInt3999 < 0) {
						arg0.anInt3999 = 0;
					}
				} else if (arg0.anInt3999 < local361) {
					arg0.anInt3999 += local5.anInt841;
					if (local361 < arg0.anInt3999) {
						arg0.anInt3999 = local361;
					}
				}
			} else if (arg0.anInt3999 < local361) {
				arg0.anInt3999 += local5.anInt841;
				if (local361 < arg0.anInt3999) {
					arg0.anInt3999 = local361;
				}
			} else if (arg0.anInt3999 > 0) {
				arg0.anInt3999 -= local5.anInt841;
				if (arg0.anInt3999 < 0) {
					arg0.anInt3999 = 0;
				}
			}
			local361 = arg0.anInt3999 >> 7;
			if (local361 < 1) {
				local361 = 1;
			}
		}
		if (local184 > local148) {
			arg0.anInt4002 += local361;
			if (local184 < arg0.anInt4002) {
				arg0.anInt4002 = local184;
			}
		} else if (local148 > local184) {
			arg0.anInt4002 -= local361;
			if (local184 > arg0.anInt4002) {
				arg0.anInt4002 = local184;
			}
		}
		if (local145 < local167) {
			arg0.anInt3974 += local361;
			if (arg0.anInt3974 > local167) {
				arg0.anInt3974 = local167;
			}
		} else if (local145 > local167) {
			arg0.anInt3974 -= local361;
			if (arg0.anInt3974 < local167) {
				arg0.anInt3974 = local167;
			}
		}
		if (arg0.anInt3974 == local167 && arg0.anInt4002 == local184) {
			arg0.anInt3965--;
			if (arg0.anInt4030 > 0) {
				arg0.anInt4030--;
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(II)V")
	public static void method4062(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static93.aBooleanArray12[arg0]) {
			return;
		}
		Static126.aClass58_56.method1368(arg0);
		if (Static188.aClass189ArrayArray115[arg0] == null) {
			return;
		}
		@Pc(25) boolean local25 = true;
		for (@Pc(27) int local27 = 0; local27 < Static188.aClass189ArrayArray115[arg0].length; local27++) {
			if (Static188.aClass189ArrayArray115[arg0][local27] != null) {
				if (Static188.aClass189ArrayArray115[arg0][local27].anInt5915 == 2) {
					local25 = false;
				} else {
					Static188.aClass189ArrayArray115[arg0][local27] = null;
				}
			}
		}
		if (local25) {
			Static188.aClass189ArrayArray115[arg0] = null;
		}
		Static93.aBooleanArray12[arg0] = false;
	}

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "(II)V")
	public static void method4063(@OriginalArg(0) int arg0) {
		@Pc(14) Class4_Sub3_Sub9 local14 = Static43.method2329(7, arg0);
		local14.method1519();
	}
}
