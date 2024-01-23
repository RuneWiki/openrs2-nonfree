import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "F")
	public static float aFloat17;

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
	public static int anInt1550 = 0;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)V")
	public static void method1327(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub3_Sub16 local8 = Static119.method2204(arg0, 3);
		local8.method2719();
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIII)V")
	public static void method1328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= Static68.anInt1509 && arg2 <= Static43.anInt1054) {
			@Pc(18) int local18 = Static202.method3411(Static127.anInt2664, arg0, Static290.anInt6021);
			@Pc(24) int local24 = Static202.method3411(Static127.anInt2664, arg1, Static290.anInt6021);
			Static264.method4418(arg2, local24, arg3, local18);
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIII)V")
	public static void method1329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(13) int local13 = arg2;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = arg2 * arg2;
		@Pc(25) int local25 = local17 << 1;
		@Pc(29) int local29 = local21 << 1;
		@Pc(33) int local33 = local17 << 2;
		@Pc(37) int local37 = arg2 << 1;
		@Pc(45) int local45 = local21 - (local37 - 1) * local25;
		@Pc(54) int local54 = local29 + (1 - local37) * local17;
		@Pc(58) int local58 = local21 << 2;
		@Pc(66) int local66 = local29 * 3;
		@Pc(74) int local74 = local25 * ((arg2 << 1) - 3);
		@Pc(93) int local93;
		@Pc(103) int local103;
		if (arg0 >= Static127.anInt2664 && Static290.anInt6021 >= arg0) {
			local93 = Static202.method3411(Static68.anInt1509, arg3 + arg1, Static43.anInt1054);
			local103 = Static202.method3411(Static68.anInt1509, arg1 - arg3, Static43.anInt1054);
			Static133.method2321(local93, local103, Static274.anIntArrayArray50[arg0], arg4);
		}
		@Pc(117) int local117 = (arg2 - 1) * local33;
		@Pc(123) int local123 = local58;
		while (local13 > 0) {
			local13--;
			if (local54 < 0) {
				while (local54 < 0) {
					local7++;
					local45 += local123;
					local123 += local58;
					local54 += local66;
					local66 += local58;
				}
			}
			if (local45 < 0) {
				local54 += local66;
				local45 += local123;
				local7++;
				local123 += local58;
				local66 += local58;
			}
			local103 = arg0 + local13;
			local45 += -local74;
			local93 = arg0 - local13;
			if (Static127.anInt2664 <= local103 && Static290.anInt6021 >= local93) {
				@Pc(202) int local202 = Static202.method3411(Static68.anInt1509, local7 + arg1, Static43.anInt1054);
				@Pc(210) int local210 = Static202.method3411(Static68.anInt1509, arg1 - local7, Static43.anInt1054);
				if (local93 >= Static127.anInt2664) {
					Static133.method2321(local202, local210, Static274.anIntArrayArray50[local93], arg4);
				}
				if (local103 <= Static290.anInt6021) {
					Static133.method2321(local202, local210, Static274.anIntArrayArray50[local103], arg4);
				}
			}
			local74 -= local33;
			local54 += -local117;
			local117 -= local33;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I[B)Lclient!g;")
	public static Class2_Sub3_Sub5_Sub1 method1330(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(19) Class2_Sub3_Sub5_Sub1 local19 = new Class2_Sub3_Sub5_Sub1(arg0, Static262.anIntArray528, Static40.anIntArray59, Static30.anIntArray46, Static19.anIntArray30, Static273.aByteArrayArray115);
			Static171.method2953();
			return local19;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!mg;Lclient!jd;ZLclient!jd;Lclient!jd;)Z")
	public static boolean method1331(@OriginalArg(0) Class2_Sub5_Sub3 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(3) Class84 arg2, @OriginalArg(4) Class84 arg3) {
		Static212.aClass84_95 = arg3;
		Static2.aClass2_Sub5_Sub3_4 = arg0;
		Static285.aClass84_122 = arg1;
		Static31.aClass84_14 = arg2;
		return true;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IILclient!qh;IBII)Z")
	public static boolean method1332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(6) int arg3) {
		@Pc(10) Class112 local10 = Static188.method3183(arg2.anInt4498);
		if (local10.anInt3398 == -1) {
			return true;
		}
		if (arg2.aBoolean374) {
			@Pc(29) int local29 = arg1 + arg2.anInt4527;
			arg1 = local29 & 0x3;
		} else {
			arg1 = 0;
		}
		@Pc(45) Class71_Sub1 local45 = local10.method2797(arg2.aBoolean371, arg1);
		if (local45 == null) {
			return false;
		}
		@Pc(53) int local53 = arg2.anInt4496;
		@Pc(56) int local56 = local45.anInt5770;
		@Pc(59) int local59 = arg2.anInt4494;
		if ((arg1 & 0x1) == 1) {
			local59 = arg2.anInt4496;
			local53 = arg2.anInt4494;
		}
		@Pc(75) int local75 = local45.anInt5769;
		if (local10.aBoolean275) {
			local56 = local53 * 4;
			local75 = local59 * 4;
		}
		if (local10.anInt3402 == 0) {
			local45.method1860(arg0 * 4 + 48, (-arg3 + 104 + -local59) * 4 + 48, local56, local75);
		} else {
			local45.method1858(arg0 * 4 + 48, (-local59 + 104 + -arg3) * 4 + 48, local56, local75, local10.anInt3402);
		}
		return true;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I[BII[Lclient!f;IZI)[I")
	public static int[] method1333(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class52[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(17) int local17;
		if (!arg5) {
			for (@Pc(10) int local10 = 0; local10 < 4; local10++) {
				for (local17 = 0; local17 < 64; local17++) {
					for (@Pc(24) int local24 = 0; local24 < 64; local24++) {
						if (local17 + arg4 > 0 && local17 + arg4 < 103 && local24 + arg2 > 0 && arg2 + local24 < 103) {
							arg3[local10].anIntArrayArray14[arg4 + local17][local24 + arg2] &= 0xFFDFFFFF;
						}
					}
				}
			}
		}
		@Pc(91) byte local91;
		if (arg5) {
			local91 = 1;
		} else {
			local91 = 4;
		}
		@Pc(100) Class2_Sub26 local100 = new Class2_Sub26(arg1);
		local17 = arg4 + arg0;
		@Pc(116) int local116 = arg2 + arg6;
		@Pc(134) int local134;
		for (@Pc(118) int local118 = 0; local118 < local91; local118++) {
			for (@Pc(127) int local127 = 0; local127 < 64; local127++) {
				for (local134 = 0; local134 < 64; local134++) {
					Static96.method1838(local127 + arg4, arg5, 0, 0, local100, false, local118, local17 + local127, local134 - -arg2, 0, local134 + local116);
				}
			}
		}
		@Pc(173) boolean local173 = false;
		@Pc(175) boolean local175 = false;
		@Pc(203) int local203;
		@Pc(234) int local234;
		@Pc(264) int local264;
		@Pc(248) int local248;
		@Pc(268) int local268;
		while (local100.anInt5328 < local100.aByteArray72.length) {
			local134 = local100.method4261();
			if (local134 == 128) {
				Static287.anIntArray512[0] = local100.method4242();
				local173 = true;
				Static287.anIntArray512[1] = local100.method4255();
				Static287.anIntArray512[2] = local100.method4255();
				Static287.anIntArray512[3] = local100.method4255();
				Static287.anIntArray512[4] = local100.method4242();
			} else {
				if (local134 != 129) {
					local100.anInt5328--;
					break;
				}
				local175 = true;
				for (local203 = 0; local203 < 4; local203++) {
					@Pc(212) byte local212 = local100.method4220();
					if (local212 == 0) {
						local264 = arg4 + 64;
						local248 = arg2;
						local268 = arg2 + 64;
						local234 = arg4;
						if (local268 < 0) {
							local268 = 0;
						} else if (local268 >= 104) {
							local268 = 104;
						}
						if (local264 < 0) {
							local264 = 0;
						} else if (local264 >= 104) {
							local264 = 104;
						}
						if (arg2 < 0) {
							local248 = 0;
						} else if (arg2 >= 104) {
							local248 = 104;
						}
						if (arg4 < 0) {
							local234 = 0;
						} else if (arg4 >= 104) {
							local234 = 104;
						}
						while (local264 > local234) {
							while (local268 > local248) {
								Static157.aByteArrayArrayArray10[local203][local234][local248] = 0;
								local248++;
							}
							local234++;
						}
					} else if (local212 == 1) {
						for (local234 = 0; local234 < 64; local234 += 4) {
							for (local264 = 0; local264 < 64; local264 += 4) {
								@Pc(340) byte local340 = local100.method4220();
								for (local268 = arg4 + local234; local268 < local234 + arg4 + 4; local268++) {
									for (@Pc(360) int local360 = arg2 + local264; local360 < local264 + arg2 + 4; local360++) {
										if (local268 >= 0 && local268 < 104 && local360 >= 0 && local360 < 104) {
											Static157.aByteArrayArrayArray10[local203][local268][local360] = local340;
										}
									}
								}
							}
						}
					} else if (local212 == 2 && local203 > 0) {
						local234 = arg4;
						if (arg4 < 0) {
							local234 = 0;
						} else if (arg4 >= 104) {
							local234 = 104;
						}
						local248 = arg2;
						if (arg2 < 0) {
							local248 = 0;
						} else if (arg2 >= 104) {
							local248 = 104;
						}
						local264 = arg4 + 64;
						local268 = arg2 + 64;
						if (local264 < 0) {
							local264 = 0;
						} else if (local264 >= 104) {
							local264 = 104;
						}
						if (local268 < 0) {
							local268 = 0;
						} else if (local268 >= 104) {
							local268 = 104;
						}
						while (local264 > local234) {
							while (local268 > local248) {
								Static157.aByteArrayArrayArray10[local203][local234][local248] = Static157.aByteArrayArrayArray10[local203 - 1][local234][local248];
								local248++;
							}
							local234++;
						}
					}
				}
			}
		}
		@Pc(599) int local599;
		if (Static60.aBoolean106 && !arg5) {
			@Pc(558) Class147 local558 = null;
			label285: while (true) {
				while (true) {
					while (local100.aByteArray72.length > local100.anInt5328) {
						local203 = local100.method4261();
						if (local203 == 0) {
							local558 = new Class147(local100);
						} else if (local203 == 1) {
							local599 = local100.method4261();
							if (local599 > 0) {
								for (local234 = 0; local234 < local599; local234++) {
									@Pc(616) Class90 local616 = new Class90(local100);
									if (local616.anInt2634 == 31) {
										@Pc(628) Class159 local628 = Static283.method4716(local100.method4242());
										local616.method2254(local628.anInt4883, local628.anInt4882, local628.anInt4875, local628.anInt4874);
									}
									local616.anInt2649 += arg2 << 7;
									local616.anInt2635 += arg4 << 7;
									local268 = local616.anInt2649 >> 7;
									local248 = local616.anInt2635 >> 7;
									if (local248 >= 0 && local268 >= 0 && local248 < 104 && local268 < 104) {
										local616.aBoolean212 = (Static134.aByteArrayArrayArray9[1][local248][local268] & 0x2) != 0;
										local616.anInt2644 = Static141.anIntArrayArrayArray4[local616.anInt2654][local248][local268] - local616.anInt2644;
										Static128.method2274(local616);
									}
								}
							}
						} else if (local203 == 2) {
							if (local558 == null) {
								local558 = new Class147();
							}
							local558.method3712(local100);
						} else {
							throw new IllegalStateException();
						}
					}
					if (local558 == null) {
						local558 = new Class147();
					}
					for (local203 = 0; local203 < 8; local203++) {
						for (local599 = 0; local599 < 8; local599++) {
							local234 = (arg4 >> 3) + local203;
							local264 = (arg2 >> 3) + local599;
							if (local234 >= 0 && local234 < 13 && local264 >= 0 && local264 < 13) {
								Static96.aClass147ArrayArray1[local234][local264] = local558;
							}
						}
					}
					break label285;
				}
			}
		}
		if (!local175) {
			for (local134 = 0; local134 < 4; local134++) {
				for (local203 = 0; local203 < 16; local203++) {
					for (local599 = 0; local599 < 16; local599++) {
						local234 = local203 + (arg4 >> 2);
						local264 = local599 + (arg2 >> 2);
						if (local234 >= 0 && local234 < 26 && local264 >= 0 && local264 < 26) {
							Static157.aByteArrayArrayArray10[local134][local234][local264] = 0;
						}
					}
				}
			}
		}
		return local173 ? Static287.anIntArray512 : null;
	}
}
