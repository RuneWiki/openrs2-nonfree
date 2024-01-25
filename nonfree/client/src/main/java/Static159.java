import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!jo", name = "F", descriptor = "Lclient!tq;")
	public static Class191 aClass191_100;

	@OriginalMember(owner = "client!jo", name = "n", descriptor = "Lclient!oo;")
	public static final Class147 aClass147_1 = new Class147();

	@OriginalMember(owner = "client!jo", name = "s", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!jo", name = "E", descriptor = "[I")
	public static final int[] anIntArray272 = new int[1000];

	@OriginalMember(owner = "client!jo", name = "H", descriptor = "S")
	public static short aShort49 = 256;

	@OriginalMember(owner = "client!jo", name = "I", descriptor = "[[I")
	public static final int[][] anIntArrayArray97 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!tq;I)V")
	public static void method3013(@OriginalArg(0) Class191 arg0) {
		Static187.aClass191_120 = arg0;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIBII)V")
	public static void method3014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static208.anInt4045 = arg2;
		Static74.anInt144 = arg3;
		Static88.anInt1900 = arg1;
		Static185.anInt3659 = arg0;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IILclient!qr;I)V")
	public static void method3015(@OriginalArg(1) int arg0, @OriginalArg(2) Class62_Sub1_Sub2_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13;
		@Pc(30) int local30;
		if ((arg0 & 0x800) != 0) {
			local13 = Static269.aClass2_Sub10_Sub1_3.method4403();
			@Pc(16) int[] local16 = new int[local13];
			@Pc(19) int[] local19 = new int[local13];
			@Pc(22) int[] local22 = new int[local13];
			for (@Pc(24) int local24 = 0; local24 < local13; local24++) {
				local30 = Static269.aClass2_Sub10_Sub1_3.method4464();
				if (local30 == 65535) {
					local30 = -1;
				}
				local16[local24] = local30;
				local19[local24] = Static269.aClass2_Sub10_Sub1_3.method4421();
				local22[local24] = Static269.aClass2_Sub10_Sub1_3.method4432();
			}
			Static104.method4928(arg1, local16, local19, local22);
		}
		if ((arg0 & 0x1) != 0) {
			local13 = Static269.aClass2_Sub10_Sub1_3.method4403();
			@Pc(76) byte[] local76 = new byte[local13];
			@Pc(81) Class2_Sub10 local81 = new Class2_Sub10(local76);
			Static269.aClass2_Sub10_Sub1_3.method4426(local13, local76);
			Static338.aClass2_Sub10Array1[arg2] = local81;
			arg1.method4785(local81);
		}
		if ((arg0 & 0x100) != 0) {
			local13 = Static269.aClass2_Sub10_Sub1_3.method4464();
			arg1.anInt5335 = Static269.aClass2_Sub10_Sub1_3.method4403();
			arg1.anInt5359 = Static269.aClass2_Sub10_Sub1_3.method4421();
			arg1.anInt5312 = local13 & 0x7FFF;
			arg1.aBoolean481 = (local13 & 0x8000) != 0;
			arg1.anInt5314 = Static212.anInt4090 + arg1.anInt5312 + arg1.anInt5335;
		}
		@Pc(168) int local168;
		if ((arg0 & 0x4) != 0) {
			local13 = Static269.aClass2_Sub10_Sub1_3.method4437();
			if (local13 == 65535) {
				local13 = -1;
			}
			local168 = Static269.aClass2_Sub10_Sub1_3.method4421();
			Static88.method1960(local168, arg1, local13);
		}
		if ((arg0 & 0x400) != 0) {
			local13 = Static269.aClass2_Sub10_Sub1_3.method4441();
			local168 = Static269.aClass2_Sub10_Sub1_3.method4421();
			arg1.method4772(local168, Static212.anInt4090, local13);
		}
		if ((arg0 & 0x20) != 0) {
			arg1.anInt5323 = Static269.aClass2_Sub10_Sub1_3.method4464();
			arg1.anInt5346 = Static269.aClass2_Sub10_Sub1_3.method4413();
		}
		@Pc(230) int local230;
		if ((arg0 & 0x80) != 0) {
			local13 = Static269.aClass2_Sub10_Sub1_3.method4464();
			local168 = Static269.aClass2_Sub10_Sub1_3.method4422();
			@Pc(227) int local227 = Static269.aClass2_Sub10_Sub1_3.method4403();
			local230 = Static269.aClass2_Sub10_Sub1_3.anInt4807;
			@Pc(241) boolean local241 = (local13 & 0x8000) != 0;
			if (arg1.aString48 != null && arg1.aClass160_2 != null) {
				@Pc(249) boolean local249 = false;
				if (local168 <= 1) {
					if (!local241 && (Static81.aBoolean157 && !Static97.aBoolean601 || Static297.aBoolean539)) {
						local249 = true;
					} else if (Static312.method5481(arg1.aString48)) {
						local249 = true;
					}
				}
				if (!local249 && Static8.anInt164 == 0) {
					Static78.aClass2_Sub10_2.anInt4807 = 0;
					Static269.aClass2_Sub10_Sub1_3.method4417(Static78.aClass2_Sub10_2.aByteArray57, local227);
					Static78.aClass2_Sub10_2.anInt4807 = 0;
					@Pc(293) int local293 = -1;
					@Pc(312) String local312;
					if (local241) {
						local13 &= 0x7FFF;
						@Pc(303) Class175 local303 = Static218.method3877(Static78.aClass2_Sub10_2);
						local293 = local303.anInt5656;
						local312 = local303.aClass2_Sub11_Sub3_1.method2126(Static78.aClass2_Sub10_2);
					} else {
						local312 = Static147.method416(Static26.method739(Static73.method3195(Static78.aClass2_Sub10_2)));
					}
					arg1.aString46 = local312.trim();
					arg1.anInt5354 = local13 & 0xFF;
					arg1.anInt5342 = local13 >> 8;
					arg1.anInt5340 = 150;
					@Pc(353) int local353;
					if (local168 == 1 || local168 == 2) {
						local353 = local241 ? 17 : 1;
					} else {
						local353 = local241 ? 17 : 2;
					}
					if (local168 == 2) {
						Static320.method5406(local293, "<img=1>" + arg1.method4791(), "<img=1>" + arg1.method4789(), 0, local312, local353, null);
					} else if (local168 == 1) {
						Static320.method5406(local293, "<img=0>" + arg1.method4791(), "<img=0>" + arg1.method4789(), 0, local312, local353, null);
					} else {
						Static320.method5406(local293, arg1.method4791(), arg1.method4789(), 0, local312, local353, null);
					}
				}
			}
			Static269.aClass2_Sub10_Sub1_3.anInt4807 = local227 + local230;
		}
		if ((arg0 & 0x40) != 0) {
			arg1.anInt5292 = Static269.aClass2_Sub10_Sub1_3.method4432();
			if (arg1.anInt5292 == 65535) {
				arg1.anInt5292 = -1;
			}
		}
		if ((arg0 & 0x2) != 0) {
			local13 = Static269.aClass2_Sub10_Sub1_3.method4441();
			local168 = Static269.aClass2_Sub10_Sub1_3.method4421();
			arg1.method4772(local168, Static212.anInt4090, local13);
			arg1.anInt5301 = Static212.anInt4090 + 300;
			arg1.anInt5334 = Static269.aClass2_Sub10_Sub1_3.method4422();
		}
		if ((arg0 & 0x1000) != 0) {
			local13 = Static269.aClass2_Sub10_Sub1_3.method4413();
			if (local13 == 65535) {
				local13 = -1;
			}
			local168 = Static269.aClass2_Sub10_Sub1_3.method4444();
			@Pc(521) boolean local521 = true;
			@Pc(588) Class107 local588;
			if (local13 != -1 && arg1.anInt5321 != -1) {
				@Pc(537) Class215 local537;
				if (arg1.anInt5321 == local13) {
					local537 = Static44.method1076(local13);
					if (local537.aBoolean621 && local537.anInt6968 != -1) {
						local588 = Static212.method3773(local537.anInt6968);
						local30 = local588.anInt3273;
						if (local30 == 0) {
							local521 = false;
						} else if (local30 == 1) {
							local521 = true;
						} else if (local30 == 2) {
							arg1.anInt5349 = 0;
							local521 = false;
						}
					}
				} else {
					local537 = Static44.method1076(local13);
					@Pc(542) Class215 local542 = Static44.method1076(arg1.anInt5321);
					if (local537.anInt6968 != -1 && local542.anInt6968 != -1) {
						@Pc(556) Class107 local556 = Static212.method3773(local537.anInt6968);
						@Pc(563) Class107 local563 = Static212.method3773(local542.anInt6968);
						if (local563.anInt3287 > local556.anInt3287) {
							local521 = false;
						}
					}
				}
			}
			if (local521) {
				arg1.anInt5316 = local168 >> 16;
				arg1.anInt5307 = 1;
				arg1.anInt5321 = local13;
				arg1.anInt5317 = 0;
				arg1.anInt5356 = 0;
				arg1.anInt5357 = Static212.anInt4090 + (local168 & 0xFFFF);
				if (Static212.anInt4090 < arg1.anInt5357) {
					arg1.anInt5356 = -1;
				}
				if (arg1.anInt5321 != -1 && Static212.anInt4090 == arg1.anInt5357) {
					local230 = Static44.method1076(arg1.anInt5321).anInt6968;
					if (local230 != -1) {
						local588 = Static212.method3773(local230);
						if (local588 != null && local588.anIntArray280 != null) {
							Static343.method5928(Static41.aClass62_Sub1_Sub2_Sub2_2 == arg1, local588, arg1.anInt5289, 0, arg1.anInt5280);
						}
					}
				}
			}
		}
		if ((arg0 & 0x10) != 0) {
			arg1.aString46 = Static269.aClass2_Sub10_Sub1_3.method4409();
			if (arg1.aString46.charAt(0) == '~') {
				arg1.aString46 = arg1.aString46.substring(1);
				Static66.method1501(arg1.aString46, 0, 2, arg1.method4789(), arg1.method4791());
			} else if (arg1 == Static41.aClass62_Sub1_Sub2_Sub2_2) {
				Static66.method1501(arg1.aString46, 0, 2, arg1.method4789(), arg1.method4791());
			}
			arg1.anInt5354 = 0;
			arg1.anInt5340 = 150;
			arg1.anInt5342 = 0;
		}
		if ((arg0 & 0x200) == 0) {
			return;
		}
		arg1.anInt5351 = Static269.aClass2_Sub10_Sub1_3.method4421();
		arg1.anInt5338 = Static269.aClass2_Sub10_Sub1_3.method4422();
		arg1.anInt5320 = Static269.aClass2_Sub10_Sub1_3.method4414();
		arg1.anInt5339 = Static269.aClass2_Sub10_Sub1_3.method4403();
		arg1.anInt5296 = Static269.aClass2_Sub10_Sub1_3.method4464() + Static212.anInt4090;
		arg1.anInt5343 = Static269.aClass2_Sub10_Sub1_3.method4464() + Static212.anInt4090;
		arg1.anInt5298 = Static269.aClass2_Sub10_Sub1_3.method4414();
		arg1.anInt5367 = 0;
		arg1.anInt5372 = 1;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZBII)V")
	public static void method3016(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static265.method5886(arg3)) {
			Static257.method4678(Static265.aClass146ArrayArray41[arg3], arg1, arg2, -1, arg0);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIZ[[[Lclient!ak;I)Z")
	public static boolean method3018(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class8[][][] arg3, @OriginalArg(5) int arg4) {
		@Pc(22) byte local22 = arg2 ? 1 : (byte) (Static241.anInt4651 & 0xFF);
		if (Static66.aByteArrayArrayArray3[Static182.anInt3603][arg1][arg4] == local22) {
			return false;
		} else if ((Static313.aByteArrayArrayArray12[Static182.anInt3603][arg1][arg4] & 0x4) == 0) {
			return false;
		} else {
			@Pc(54) byte local54 = 0;
			Static119.anIntArray230[0] = arg1;
			@Pc(60) int local60 = 0;
			@Pc(63) int local63 = local54 + 1;
			Static162.anIntArray277[0] = arg4;
			Static66.aByteArrayArrayArray3[Static182.anInt3603][arg1][arg4] = local22;
			while (local60 != local63) {
				@Pc(81) int local81 = Static119.anIntArray230[local60] & 0xFFFF;
				@Pc(89) int local89 = Static119.anIntArray230[local60] >> 16 & 0xFF;
				@Pc(97) int local97 = Static119.anIntArray230[local60] >> 24 & 0xFF;
				@Pc(103) int local103 = Static162.anIntArray277[local60] & 0xFFFF;
				@Pc(111) int local111 = Static162.anIntArray277[local60] >> 16 & 0xFF;
				local60 = local60 + 1 & 0xFFF;
				@Pc(119) boolean local119 = false;
				if ((Static313.aByteArrayArrayArray12[Static182.anInt3603][local81][local103] & 0x4) == 0) {
					local119 = true;
				}
				@Pc(136) boolean local136 = false;
				@Pc(175) int local175;
				@Pc(218) int local218;
				label231: for (@Pc(140) int local140 = Static182.anInt3603 + 1; local140 <= 3; local140++) {
					if ((Static313.aByteArrayArrayArray12[local140][local81][local103] & 0x8) == 0) {
						@Pc(317) Class62_Sub1 local317;
						@Pc(327) int local327;
						@Pc(306) Class8 local306;
						@Pc(312) Class172 local312;
						if (local119 && arg3[local140][local81][local103] != null) {
							if (arg3[local140][local81][local103].aClass62_Sub4_2 != null) {
								local175 = Static84.method1904(local89);
								if (arg3[local140][local81][local103].aClass62_Sub4_2.anInt6405 == local175 || arg3[local140][local81][local103].aClass62_Sub4_1 != null && arg3[local140][local81][local103].aClass62_Sub4_1.anInt6405 == local175) {
									continue;
								}
								if (local97 != 0) {
									local218 = Static84.method1904(local97);
									if (local218 == arg3[local140][local81][local103].aClass62_Sub4_2.anInt6405 || arg3[local140][local81][local103].aClass62_Sub4_1 != null && local218 == arg3[local140][local81][local103].aClass62_Sub4_1.anInt6405) {
										continue;
									}
								}
								if (local111 != 0) {
									local218 = Static84.method1904(local111);
									if (arg3[local140][local81][local103].aClass62_Sub4_2.anInt6405 == local218 || arg3[local140][local81][local103].aClass62_Sub4_1 != null && local218 == arg3[local140][local81][local103].aClass62_Sub4_1.anInt6405) {
										continue;
									}
								}
							}
							local306 = arg3[local140][local81][local103];
							if (local306.aClass172_1 != null) {
								for (local312 = local306.aClass172_1; local312 != null; local312 = local312.aClass172_4) {
									local317 = local312.aClass62_Sub1_1;
									if (local317 instanceof Interface9) {
										@Pc(323) Interface9 local323 = (Interface9) local317;
										local327 = local323.method5581();
										if (local327 == 21) {
											local327 = 19;
										}
										@Pc(338) int local338 = local323.method5580();
										@Pc(344) int local344 = local327 | local338 << 6;
										if (local89 == local344 || local97 != 0 && local97 == local344 || local111 != 0 && local111 == local344) {
											continue label231;
										}
									}
								}
							}
						}
						local306 = arg3[local140][local81][local103];
						if (local306 != null && local306.aClass172_1 != null) {
							for (local312 = local306.aClass172_1; local312 != null; local312 = local312.aClass172_4) {
								local317 = local312.aClass62_Sub1_1;
								if (local317.aShort84 != local317.aShort86 || local317.aShort85 != local317.aShort83) {
									for (@Pc(412) int local412 = local317.aShort84; local412 <= local317.aShort86; local412++) {
										for (local327 = local317.aShort83; local327 <= local317.aShort85; local327++) {
											Static66.aByteArrayArrayArray3[local140][local412][local327] = local22;
										}
									}
								}
							}
						}
						local136 = true;
						Static66.aByteArrayArrayArray3[local140][local81][local103] = local22;
					}
				}
				if (local136) {
					local175 = Static301.aClass73Array31[Static182.anInt3603 + 1].method4931(local81, local103);
					if (local175 > Static110.anIntArray224[arg0]) {
						Static110.anIntArray224[arg0] = local175;
					}
					local218 = local81 << 7;
					if (local218 < Static183.anIntArray295[arg0]) {
						Static183.anIntArray295[arg0] = local218;
					} else if (Static209.anIntArray371[arg0] < local218) {
						Static209.anIntArray371[arg0] = local218;
					}
					@Pc(518) int local518 = local103 << 7;
					if (local518 < Static47.anIntArray90[arg0]) {
						Static47.anIntArray90[arg0] = local518;
					} else if (Static183.anIntArray296[arg0] < local518) {
						Static183.anIntArray296[arg0] = local518;
					}
				}
				if (!local119) {
					if (local81 >= 1 && local22 != Static66.aByteArrayArrayArray3[Static182.anInt3603][local81 - 1][local103]) {
						Static119.anIntArray230[local63] = 0xD3000000 | 0x120000 | local81 - 1;
						Static162.anIntArray277[local63] = local103 | 0x130000;
						local63 = local63 + 1 & 0xFFF;
						Static66.aByteArrayArrayArray3[Static182.anInt3603][local81 - 1][local103] = local22;
					}
					@Pc(597) int local597 = ~Static237.anInt4532;
					local103++;
					if (local597 < ~local103) {
						if (local81 - 1 >= 0 && local22 != Static66.aByteArrayArrayArray3[Static182.anInt3603][local81 - 1][local103] && (Static313.aByteArrayArrayArray12[Static182.anInt3603][local81][local103] & 0x4) == 0 && (Static313.aByteArrayArrayArray12[Static182.anInt3603][local81 - 1][local103 - 1] & 0x4) == 0) {
							Static119.anIntArray230[local63] = local81 - 1 | 0x120000 | 0x52000000;
							Static162.anIntArray277[local63] = local103 | 0x130000;
							Static66.aByteArrayArrayArray3[Static182.anInt3603][local81 - 1][local103] = local22;
							local63 = local63 + 1 & 0xFFF;
						}
						if (local22 != Static66.aByteArrayArrayArray3[Static182.anInt3603][local81][local103]) {
							Static119.anIntArray230[local63] = local81 | 0x520000 | 0x13000000;
							Static162.anIntArray277[local63] = local103 | 0x530000;
							local63 = local63 + 1 & 0xFFF;
							Static66.aByteArrayArrayArray3[Static182.anInt3603][local81][local103] = local22;
						}
						if (local81 + 1 < Static95.anInt6381 && local22 != Static66.aByteArrayArrayArray3[Static182.anInt3603][local81 + 1][local103] && (Static313.aByteArrayArrayArray12[Static182.anInt3603][local81][local103] & 0x4) == 0 && (Static313.aByteArrayArrayArray12[Static182.anInt3603][local81 + 1][local103 - 1] & 0x4) == 0) {
							Static119.anIntArray230[local63] = local81 + 1 | 0x520000 | 0x92000000;
							Static162.anIntArray277[local63] = local103 | 0x530000;
							local63 = local63 + 1 & 0xFFF;
							Static66.aByteArrayArrayArray3[Static182.anInt3603][local81 + 1][local103] = local22;
						}
					}
					local103--;
					if (local81 + 1 < Static95.anInt6381 && Static66.aByteArrayArrayArray3[Static182.anInt3603][local81 + 1][local103] != local22) {
						Static119.anIntArray230[local63] = local81 + 1 | 0x920000 | 0x53000000;
						Static162.anIntArray277[local63] = local103 | 0x930000;
						local63 = local63 + 1 & 0xFFF;
						Static66.aByteArrayArrayArray3[Static182.anInt3603][local81 + 1][local103] = local22;
					}
					local103--;
					if (local103 >= 0) {
						if (local81 - 1 >= 0 && local22 != Static66.aByteArrayArrayArray3[Static182.anInt3603][local81 - 1][local103] && (Static313.aByteArrayArrayArray12[Static182.anInt3603][local81][local103] & 0x4) == 0 && (Static313.aByteArrayArrayArray12[Static182.anInt3603][local81 - 1][local103 + 1] & 0x4) == 0) {
							Static119.anIntArray230[local63] = local81 - 1 | 0xD20000 | 0x12000000;
							Static162.anIntArray277[local63] = local103 | 0xD30000;
							local63 = local63 + 1 & 0xFFF;
							Static66.aByteArrayArrayArray3[Static182.anInt3603][local81 - 1][local103] = local22;
						}
						if (local22 != Static66.aByteArrayArrayArray3[Static182.anInt3603][local81][local103]) {
							Static119.anIntArray230[local63] = local81 | 0xD20000 | 0x93000000;
							Static162.anIntArray277[local63] = local103 | 0xD30000;
							Static66.aByteArrayArrayArray3[Static182.anInt3603][local81][local103] = local22;
							local63 = local63 + 1 & 0xFFF;
						}
						if (Static95.anInt6381 > local81 + 1 && Static66.aByteArrayArrayArray3[Static182.anInt3603][local81 + 1][local103] != local22 && (Static313.aByteArrayArrayArray12[Static182.anInt3603][local81][local103] & 0x4) == 0 && (Static313.aByteArrayArrayArray12[Static182.anInt3603][local81 + 1][local103 + 1] & 0x4) == 0) {
							Static119.anIntArray230[local63] = local81 + 1 | 0xD2000000 | 0x920000;
							Static162.anIntArray277[local63] = local103 | 0x930000;
							local63 = local63 + 1 & 0xFFF;
							Static66.aByteArrayArrayArray3[Static182.anInt3603][local81 + 1][local103] = local22;
						}
					}
				}
			}
			if (Static110.anIntArray224[arg0] != -1000000) {
				Static110.anIntArray224[arg0] += 10;
				Static183.anIntArray295[arg0] -= 50;
				Static209.anIntArray371[arg0] += 50;
				Static183.anIntArray296[arg0] += 50;
				Static47.anIntArray90[arg0] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IBIIIIII)V")
	public static void method3019(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(19) int local19 = 0;
		@Pc(24) int local24 = arg6 - arg0;
		@Pc(29) int local29 = arg3 - arg0;
		@Pc(33) int local33 = arg6 * arg6;
		@Pc(37) int local37 = arg3 * arg3;
		@Pc(41) int local41 = local24 * local24;
		@Pc(45) int local45 = local29 * local29;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = local45 << 1;
		@Pc(61) int local61 = local41 << 1;
		@Pc(65) int local65 = arg3 << 1;
		@Pc(69) int local69 = local29 << 1;
		@Pc(78) int local78 = local33 * (1 - local65) + local49;
		@Pc(87) int local87 = local37 - (local65 - 1) * local53;
		@Pc(96) int local96 = local57 + (1 - local69) * local41;
		@Pc(104) int local104 = local45 - (local69 - 1) * local61;
		@Pc(108) int local108 = local33 << 2;
		@Pc(112) int local112 = local37 << 2;
		@Pc(116) int local116 = local41 << 2;
		@Pc(120) int local120 = local45 << 2;
		@Pc(124) int local124 = local49 * 3;
		@Pc(130) int local130 = local53 * (local65 - 3);
		@Pc(134) int local134 = local57 * 3;
		@Pc(140) int local140 = (local69 - 3) * local61;
		@Pc(142) int local142 = local112;
		@Pc(148) int local148 = local108 * (arg3 - 1);
		@Pc(150) int local150 = local120;
		@Pc(156) int local156 = (local29 - 1) * local116;
		@Pc(160) int[] local160 = Static146.anIntArrayArray91[arg4];
		Static205.method3670(arg2, arg5 - local24, local160, arg5 - arg6);
		Static205.method3670(arg1, local24 + arg5, local160, arg5 - local24);
		Static205.method3670(arg2, arg5 + arg6, local160, arg5 + local24);
		while (local9 > 0) {
			@Pc(200) boolean local200 = local29 >= local9;
			if (local78 < 0) {
				while (local78 < 0) {
					local87 += local142;
					local78 += local124;
					local7++;
					local142 += local112;
					local124 += local112;
				}
			}
			if (local200) {
				if (local96 < 0) {
					while (local96 < 0) {
						local96 += local134;
						local104 += local150;
						local134 += local120;
						local19++;
						local150 += local120;
					}
				}
				if (local104 < 0) {
					local104 += local150;
					local96 += local134;
					local134 += local120;
					local19++;
					local150 += local120;
				}
				local96 += -local156;
				local104 += -local140;
				local156 -= local116;
				local140 -= local116;
			}
			if (local87 < 0) {
				local87 += local142;
				local78 += local124;
				local7++;
				local124 += local112;
				local142 += local112;
			}
			local87 += -local130;
			local78 += -local148;
			local9--;
			local130 -= local108;
			local148 -= local108;
			@Pc(343) int local343 = arg4 - local9;
			@Pc(347) int local347 = local9 + arg4;
			@Pc(352) int local352 = arg5 + local7;
			@Pc(357) int local357 = arg5 - local7;
			if (local200) {
				@Pc(381) int local381 = arg5 + local19;
				@Pc(386) int local386 = arg5 - local19;
				Static205.method3670(arg2, local386, Static146.anIntArrayArray91[local343], local357);
				Static205.method3670(arg1, local381, Static146.anIntArrayArray91[local343], local386);
				Static205.method3670(arg2, local352, Static146.anIntArrayArray91[local343], local381);
				Static205.method3670(arg2, local386, Static146.anIntArrayArray91[local347], local357);
				Static205.method3670(arg1, local381, Static146.anIntArrayArray91[local347], local386);
				Static205.method3670(arg2, local352, Static146.anIntArrayArray91[local347], local381);
			} else {
				Static205.method3670(arg2, local352, Static146.anIntArrayArray91[local343], local357);
				Static205.method3670(arg2, local352, Static146.anIntArrayArray91[local347], local357);
			}
		}
	}
}
