import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static562 {

	@OriginalMember(owner = "client!uba", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString103;

	@OriginalMember(owner = "client!uba", name = "w", descriptor = "I")
	public static int anInt10128;

	@OriginalMember(owner = "client!uba", name = "u", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_229 = new Class215(86, 6);

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIII[BB)Z")
	public static boolean method8434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		@Pc(12) boolean local12 = true;
		@Pc(17) Class2_Sub11 local17 = new Class2_Sub11(arg4);
		@Pc(19) int local19 = -1;
		label54: while (true) {
			@Pc(23) int local23 = local17.method8330();
			if (local23 == 0) {
				return local12;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(39) int local39;
				while (!local33) {
					local39 = local17.method8378();
					if (local39 == 0) {
						continue label54;
					}
					local31 += local39 - 1;
					@Pc(65) int local65 = local31 & 0x3F;
					@Pc(71) int local71 = local31 >> 6 & 0x3F;
					@Pc(77) int local77 = local17.method8383() >> 2;
					@Pc(82) int local82 = local71 + arg1;
					@Pc(86) int local86 = arg3 + local65;
					if (local82 > 0 && local86 > 0 && local82 < arg0 - 1 && local86 < arg2 - 1) {
						@Pc(109) Class161 local109 = Static27.aClass342_3.method8534(local19);
						if (local77 != 22 || Static74.aClass2_Sub13_5.aClass14_Sub12_1.method5129() != 0 || local109.anInt5363 != 0 || local109.anInt5386 == 1 || local109.aBoolean410) {
							local33 = true;
							if (!local109.method4611()) {
								Static405.anInt7686++;
								local12 = false;
							}
						}
					}
				}
				local39 = local17.method8378();
				if (local39 == 0) {
					break;
				}
				local17.method8383();
			}
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method8436(@OriginalArg(1) String arg0) {
		return Static145.method3221(10, arg0);
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IBIIZ)V")
	public static void method8437(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3 && arg1 == Static199.anInt8568 && arg0 == Static93.anInt2688 && (Static12.anInt172 == Static425.anInt8001 || Static74.aClass2_Sub13_5.aClass14_Sub7_2.method3523() == 1)) {
			return;
		}
		Static199.anInt8568 = arg1;
		Static93.anInt2688 = arg0;
		Static425.anInt8001 = Static12.anInt172;
		if (Static74.aClass2_Sub13_5.aClass14_Sub7_2.method3523() == 1) {
			Static425.anInt8001 = 0;
		}
		Static66.method8375(arg2);
		Static151.method3426(true, Static300.aClass68_4, Static58.aClass239_18, Static588.aClass351_14.method8691(Static476.anInt8915), Static186.aClass20_4);
		@Pc(56) int local56 = Static84.anInt2565;
		@Pc(58) int local58 = Static32.anInt723;
		Static84.anInt2565 = (Static199.anInt8568 - (Static47.anInt1794 >> 4)) * 8;
		Static32.anInt723 = (Static93.anInt2688 - (Static209.anInt4742 >> 4)) * 8;
		Static350.aClass2_Sub6_Sub4_3 = Static303.method163(Static199.anInt8568 * 8, Static93.anInt2688 * 8);
		Static563.aClass333_3 = null;
		@Pc(89) int local89 = Static84.anInt2565 - local56;
		@Pc(94) int local94 = Static32.anInt723 - local58;
		@Pc(99) int local99;
		@Pc(112) int local112;
		@Pc(236) int local236;
		@Pc(174) int local174;
		if (arg2 == 11) {
			for (local99 = 0; local99 < Static474.anInt8881; local99++) {
				@Pc(105) Class2_Sub33 local105 = Static62.aClass2_Sub33Array1[local99];
				if (local105 != null) {
					@Pc(110) Class3_Sub1_Sub3_Sub3_Sub1 local110 = local105.aClass3_Sub1_Sub3_Sub3_Sub1_2;
					for (local112 = 0; local112 < 10; local112++) {
						local110.anIntArray358[local112] -= local89;
						local110.anIntArray357[local112] -= local94;
					}
					local110.anInt10310 -= local94 * 512;
					local110.anInt10303 -= local89 * 512;
				}
			}
		} else {
			Static398.anInt7589 = 0;
			@Pc(162) boolean local162 = false;
			@Pc(168) int local168 = Static47.anInt1794 * 512 - 512;
			local174 = (Static209.anInt4742 - 1) * 512;
			for (local112 = 0; local112 < Static474.anInt8881; local112++) {
				@Pc(182) Class2_Sub33 local182 = Static62.aClass2_Sub33Array1[local112];
				if (local182 != null) {
					@Pc(187) Class3_Sub1_Sub3_Sub3_Sub1 local187 = local182.aClass3_Sub1_Sub3_Sub3_Sub1_2;
					local187.anInt10310 -= local94 * 512;
					local187.anInt10303 -= local89 * 512;
					if (local187.anInt10303 >= 0 && local187.anInt10303 <= local168 && local187.anInt10310 >= 0 && local174 >= local187.anInt10310) {
						@Pc(234) boolean local234 = true;
						for (local236 = 0; local236 < 10; local236++) {
							local187.anIntArray358[local236] -= local89;
							local187.anIntArray357[local236] -= local94;
							if (local187.anIntArray358[local236] < 0 || Static47.anInt1794 <= local187.anIntArray358[local236] || local187.anIntArray357[local236] < 0 || local187.anIntArray357[local236] >= Static209.anInt4742) {
								local234 = false;
							}
						}
						if (local234) {
							Static301.anIntArray367[Static398.anInt7589++] = local187.anInt6083;
						} else {
							local187.method3406(null);
							local162 = true;
							local182.method9253();
						}
					} else {
						local187.method3406(null);
						local182.method9253();
						local162 = true;
					}
				}
			}
			if (local162) {
				Static474.anInt8881 = Static600.aClass99_79.method3050();
				Static600.aClass99_79.method3053(Static62.aClass2_Sub33Array1);
			}
		}
		for (local99 = 0; local99 < 2048; local99++) {
			@Pc(348) Class3_Sub1_Sub3_Sub3_Sub2 local348 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local99];
			if (local348 != null) {
				for (local174 = 0; local174 < 10; local174++) {
					local348.anIntArray358[local174] -= local89;
					local348.anIntArray357[local174] -= local94;
				}
				local348.anInt10303 -= local89 * 512;
				local348.anInt10310 -= local94 * 512;
			}
		}
		@Pc(398) Class373[] local398 = Static351.aClass373Array1;
		for (local174 = 0; local174 < local398.length; local174++) {
			@Pc(406) Class373 local406 = local398[local174];
			if (local406 != null) {
				local406.anInt11013 -= local94 * 512;
				local406.anInt11016 -= local89 * 512;
			}
		}
		for (@Pc(438) Class2_Sub37 local438 = (Class2_Sub37) Static270.aClass341_41.method8524(); local438 != null; local438 = (Class2_Sub37) Static270.aClass341_41.method8519()) {
			local438.anInt6987 -= local94;
			local438.anInt6994 -= local89;
			if (Static69.anInt2216 != 4 && (local438.anInt6994 < 0 || local438.anInt6987 < 0 || Static47.anInt1794 <= local438.anInt6994 || Static209.anInt4742 <= local438.anInt6987)) {
				local438.method9253();
			}
		}
		if (Static69.anInt2216 != 4) {
			for (@Pc(495) Class2_Sub45 local495 = (Class2_Sub45) Static378.aClass99_26.method3060(); local495 != null; local495 = (Class2_Sub45) Static378.aClass99_26.method3058()) {
				@Pc(503) int local503 = (int) (local495.aLong278 & 0x3FFFL);
				@Pc(508) int local508 = local503 - Static84.anInt2565;
				local236 = (int) (local495.aLong278 >> 14 & 0x3FFFL);
				@Pc(521) int local521 = local236 - Static32.anInt723;
				if (local508 < 0 || local521 < 0 || Static47.anInt1794 <= local508 || local521 >= Static209.anInt4742) {
					local495.method9253();
				}
			}
		}
		if (Static542.anInt9759 != 0) {
			Static542.anInt9759 -= local89;
			Static339.anInt6841 -= local94;
		}
		Static259.method4749();
		if (arg2 != 11) {
			Static590.anInt10439 -= local94;
			Static135.anInt3347 -= local89 * 512;
			Static129.anInt3274 -= local89;
			Static596.anInt10491 -= local94;
			Static489.anInt9048 -= local89;
			Static621.anInt10870 -= local94 * 512;
			if (Math.abs(local89) > Static47.anInt1794 || Math.abs(local94) > Static209.anInt4742) {
				Static305.method5400();
			}
		} else if (Static496.anInt9165 == 4) {
			Static176.anInt4216 -= local94 * 512;
			Static21.anInt398 -= local89 * 512;
			Static468.anInt8821 -= local94 * 512;
			Static173.anInt4166 -= local89 * 512;
		} else {
			Static496.anInt9165 = 1;
			Static442.anInt8212 = -1;
			Static194.anInt4508 = -1;
		}
		Static165.method3570();
		Static180.method3757();
		Static563.aClass341_65.method8525();
		Static430.aClass341_24.method8525();
		Static513.aClass325_8.method8020();
		Static548.method8182();
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "([BI)[B")
	public static byte[] method8438(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub11 local8 = new Class2_Sub11(arg0);
		@Pc(12) int local12 = local8.method8383();
		@Pc(23) int local23 = local8.method8381();
		if (local23 < 0 || Static226.anInt4992 != 0 && Static226.anInt4992 < local23) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(97) byte[] local97 = new byte[local23];
			local8.method8385(0, local23, local97);
			return local97;
		} else {
			@Pc(44) int local44 = local8.method8381();
			if (local44 < 0 || Static226.anInt4992 != 0 && Static226.anInt4992 < local44) {
				throw new RuntimeException();
			}
			@Pc(65) byte[] local65 = new byte[local44];
			if (local12 == 1) {
				Static54.method1779(local65, local44, arg0, local23);
			} else {
				@Pc(79) Class247 local79 = Static476.aClass247_1;
				synchronized (Static476.aClass247_1) {
					Static476.aClass247_1.method6568(local65, local8);
				}
			}
			return local65;
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIZIIILclient!ha;II)V")
	public static void method8439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class20 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface21 local11 = (Interface21) Static563.method8458(arg2, arg4, arg3);
		@Pc(20) Class161 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(46) int local46;
		if (local11 != null) {
			local20 = Static27.aClass342_3.method8534(local11.method8625());
			local26 = local11.method8624() & 0x3;
			local30 = local11.method8622();
			if (local20.anInt5364 == -1) {
				local46 = arg7;
				if (local20.anInt5363 > 0) {
					local46 = arg0;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg5.method7263(arg6, local46, 4, arg1);
					} else if (local26 == 1) {
						arg5.method7252(4, arg1, local46, arg6);
					} else if (local26 == 2) {
						arg5.method7263(arg6 + 3, local46, 4, arg1);
					} else if (local26 == 3) {
						arg5.method7252(4, arg1 + 3, local46, arg6);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg5.method7278(1, arg6, arg1, 1, local46);
					} else if (local26 == 1) {
						arg5.method7278(1, arg6 + 3, arg1, 1, local46);
					} else if (local26 == 2) {
						arg5.method7278(1, arg6 + 3, arg1 + 3, 1, local46);
					} else if (local26 == 3) {
						arg5.method7278(1, arg6, arg1 + 3, 1, local46);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg5.method7252(4, arg1, local46, arg6);
					} else if (local26 == 1) {
						arg5.method7263(arg6 + 3, local46, 4, arg1);
					} else if (local26 == 2) {
						arg5.method7252(4, arg1 + 3, local46, arg6);
					} else if (local26 == 3) {
						arg5.method7263(arg6, local46, 4, arg1);
					}
				}
			} else {
				Static580.method8637(arg6, local20, arg1, arg5, local26);
			}
		}
		local11 = (Interface21) Static440.method6961(arg2, arg4, arg3, se.class);
		if (local11 != null) {
			local20 = Static27.aClass342_3.method8534(local11.method8625());
			local26 = local11.method8624() & 0x3;
			local30 = local11.method8622();
			if (local20.anInt5364 != -1) {
				Static580.method8637(arg6, local20, arg1, arg5, local26);
			} else if (local30 == 9) {
				local46 = -1118482;
				if (local20.anInt5363 > 0) {
					local46 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg5.method7248(arg1 + 3, arg6, arg6 + 3, local46, arg1);
				} else {
					arg5.method7248(arg1, arg6, arg6 + 3, local46, arg1 + 3);
				}
			}
		}
		local11 = (Interface21) Static336.method5820(arg2, arg4, arg3);
		if (local11 == null) {
			return;
		}
		local20 = Static27.aClass342_3.method8534(local11.method8625());
		local26 = local11.method8624() & 0x3;
		if (local20.anInt5364 != -1) {
			Static580.method8637(arg6, local20, arg1, arg5, local26);
			return;
		}
	}
}
