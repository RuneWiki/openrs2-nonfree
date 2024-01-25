import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!eu", name = "d", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_30 = new Class387(47, -1);

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILclient!ka;III)Lclient!cca;")
	public static Class59 method2111(@OriginalArg(0) int arg0, @OriginalArg(1) Class164 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return arg1 == null ? null : new Class59(arg3, arg2, arg4, arg1.na(), arg1.V(), arg1.RA(), arg1.fa(), arg1.EA(), arg1.HA(), arg1.G());
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "([IIIZ[IIIIIIIZ[I[IIB[I[[[B)V")
	public static void method2112(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(12) int[] arg10, @OriginalArg(13) int[] arg11, @OriginalArg(14) int arg12, @OriginalArg(15) byte arg13, @OriginalArg(16) int[] arg14, @OriginalArg(17) byte[][][] arg15) {
		if (Static659.anInt10597 == -1) {
			return;
		}
		@Pc(13) int[] local13 = Static617.aClass57_14.Y();
		@Pc(17) int local17 = local13[0];
		@Pc(21) int local21 = local13[1];
		@Pc(25) int local25 = local13[2];
		@Pc(29) int local29 = local13[3];
		@Pc(31) int local31 = local25;
		@Pc(33) int local33 = local29;
		if (Static659.anInt10597 == 1) {
			local31 = (int) ((double) Static116.anInt3315 * (double) local25 / (double) Static370.anInt10370);
			local33 = (int) ((double) local29 * (double) Static116.anInt3315 / (double) Static370.anInt10370);
		}
		if (!Static554.aBoolean714) {
			if (Static659.anInt10597 == 1) {
				Static316.method4802();
			}
			@Pc(74) int local74 = arg12 - Static338.anInt6025;
			@Pc(79) int local79 = arg1 - Static273.anInt4769;
			@Pc(84) int local84 = arg8 - Static200.anInt3243;
			@Pc(106) int local106 = (int) ((double) local31 * (Static551.aDouble18 * (double) local84 + (double) local79 * Static543.aDouble17 + (double) local74 * Static519.aDouble16) / (double) arg7);
			@Pc(128) int local128 = (int) ((double) local33 * ((double) local84 * Static674.aDouble24 + (double) local74 * Static620.aDouble23 + Static396.aDouble14 * (double) local79) / (double) arg7);
			@Pc(143) double local143 = (double) local84 * Static612.aDouble21 + Static269.aDouble10 * (double) local79 + Static618.aDouble22 * (double) local74;
			@Pc(150) int local150 = Static242.anInt4086 + local106 - Static649.anInt5979;
			@Pc(156) int local156 = Static174.anInt2965 + local128 - Static379.anInt6500;
			@Pc(160) int local160 = Static539.anInt9220 + local150;
			@Pc(164) int local164 = local156 + Static116.anInt3315;
			if (local150 >= 0 && local156 >= 0 && local160 <= Static227.anInt3689 && local164 <= Static370.anInt10370 || Static659.anInt10597 == 2) {
				Static136.anInt2254 = local156;
				Static561.anInt9477 = local150;
				if (Static659.anInt10597 == 2) {
					Static598.aDouble20 = -local143;
				}
			} else if (local160 > 0 && local164 > 0 && Static227.anInt3689 > local150 && Static370.anInt10370 > local156) {
				@Pc(219) int local219 = local150 - Static242.anInt4086;
				@Pc(224) int local224 = local156 - Static174.anInt2965;
				@Pc(226) int local226 = 0;
				@Pc(228) int local228 = 0;
				@Pc(230) int local230 = 0;
				@Pc(232) int local232 = 0;
				@Pc(234) double local234 = 0.0D;
				if (Static659.anInt10597 == 0) {
					local234 = Static598.aDouble20 + local143;
					local226 = local219;
					local228 = local224;
				} else if (Static659.anInt10597 == 1) {
					local230 = local219 / Static324.anInt10471;
					local232 = local224 / Static625.anInt10198;
					local228 = Static625.anInt10198 * local232;
					local226 = local230 * Static324.anInt10471;
					local234 = (local143 + Static598.aDouble20) * (double) (local224 * local228 + local226 * local219) / (double) (local224 * local224 + local219 * local219);
				}
				local234 = -local234;
				@Pc(294) int local294 = 0;
				@Pc(296) int local296 = 0;
				@Pc(298) int local298 = 0;
				@Pc(300) int local300 = 0;
				@Pc(302) int local302 = 0;
				@Pc(304) int local304 = 0;
				@Pc(308) int local308;
				@Pc(313) int local313;
				@Pc(315) int local315;
				@Pc(329) int local329;
				if (local226 >= 0) {
					local308 = 0;
					local313 = Static227.anInt3689 - local226;
					local315 = local313;
					if (Static659.anInt10597 == 1) {
						local298 = Static3.anInt23 - local230;
						local302 = local230;
					}
					local329 = local226;
				} else {
					local308 = -local226;
					local315 = 0;
					local313 = local226 + Static227.anInt3689;
					if (Static659.anInt10597 == 1) {
						local302 = -local230;
						local298 = 0;
					}
					local329 = local308;
				}
				@Pc(355) int local355;
				@Pc(360) int local360;
				@Pc(362) int local362;
				@Pc(364) int local364;
				@Pc(380) int local380;
				if (local228 < 0) {
					local355 = -local228;
					local360 = Static370.anInt10370 + local228;
					local362 = 0;
					local364 = local355;
					if (Static659.anInt10597 == 1) {
						local296 = -local232;
						local294 = 0;
						local300 = local296;
						local304 = Static171.anInt2921 + local232;
					}
					local380 = local355;
				} else {
					local360 = Static370.anInt10370 - local228;
					local355 = 0;
					local364 = local228;
					if (Static659.anInt10597 == 1) {
						local300 = 0;
						local294 = Static171.anInt2921 - local232;
						local296 = local232;
						local304 = local294;
					}
					local380 = 0;
					local362 = local360;
				}
				@Pc(417) Class98 local417 = Static496.aClass339_3.aClass98_8;
				@Pc(431) int local431;
				for (@Pc(422) Class8_Sub10 local422 = (Class8_Sub10) local417.method1777(); local422 != null; local422 = (Class8_Sub10) local417.method1782()) {
					@Pc(427) Class8_Sub7[] local427 = local422.aClass8_Sub7Array1;
					@Pc(429) boolean local429 = true;
					for (local431 = 0; local431 < local427.length; local431++) {
						@Pc(437) Class8_Sub7 local437 = local427[local431];
						@Pc(440) int local440 = local437.anInt6699;
						@Pc(443) int local443 = local437.anInt6698;
						@Pc(446) int local446 = local437.anInt6701;
						@Pc(449) int local449 = local437.anInt6702;
						@Pc(456) int local456;
						local437.anInt6701 = local456 = local446 - local226;
						@Pc(463) int local463;
						local437.anInt6699 = local463 = local440 - local226;
						@Pc(467) int local467 = local437.anInt6700;
						@Pc(474) int local474;
						local437.anInt6702 = local474 = local449 - local228;
						@Pc(482) int local482;
						local437.anInt6698 = local482 = local443 - local228;
						if (local429) {
							@Pc(497) int local497 = (local463 >= local456 ? local456 : local463) - local467;
							if (local497 <= Static227.anInt3689) {
								@Pc(513) int local513 = (local474 > local482 ? local482 : local474) - local467;
								if (Static370.anInt10370 >= local513) {
									@Pc(537) int local537 = (local456 <= local463 ? local463 : local456) + local467;
									if (local537 >= 0) {
										@Pc(558) int local558 = local467 + (local474 <= local482 ? local482 : local474);
										if (local558 >= 0) {
											local429 = false;
										}
									}
								}
							}
						}
					}
					if (local429) {
						local422.method8893();
						Static383.method5604(local422);
					}
				}
				if (Static659.anInt10597 == 0) {
					Static617.aClass57_14.method7730(Static651.anInterface6_1);
				}
				Static617.aClass57_14.F(-local226, -local228);
				Static617.aClass57_14.b(local308, local355, local313, local360, local234);
				Static353.method5308(Static598.aDouble20 + local234);
				Static386.aDouble13 = Static598.aDouble20 + local234;
				if (Static659.anInt10597 == 1) {
					Static164.anInt2529 = local21 - local228 - Static379.anInt6500;
					Static550.anInt9294 = local31;
					Static343.anInt6081 = local17 - local226 - Static649.anInt5979;
					Static382.anInt9820 = local33;
					Static617.aClass57_14.DA(Static343.anInt6081, Static164.anInt2529, Static550.anInt9294, Static382.anInt9820);
				} else {
					Static382.anInt9820 = local33;
					Static550.anInt9294 = local31;
					Static164.anInt2529 = Static174.anInt2965 + local21 - Static379.anInt6500 - local228;
					Static343.anInt6081 = Static242.anInt4086 + local17 - Static649.anInt5979 - local226;
					Static617.aClass57_14.DA(Static343.anInt6081, Static164.anInt2529, Static550.anInt9294, Static382.anInt9820);
				}
				Static637.method8916(Static496.aClass339_3);
				if (local364 > 0) {
					Static617.aClass57_14.KA(0, local362, Static227.anInt3689, local362 + local364);
					Static617.aClass57_14.ya();
					Static617.aClass57_14.GA(Static261.anInt4523);
					Static563.method8131(arg9, arg12, arg1, arg8, arg15, arg10, arg4, arg0, arg14, arg11, arg5, arg13, arg6, arg2, arg3, arg7, 1, false);
				}
				if (local329 > 0) {
					Static617.aClass57_14.KA(local315, local380, local315 + local329, local360 + local380);
					Static617.aClass57_14.ya();
					Static617.aClass57_14.GA(Static261.anInt4523);
					Static563.method8131(arg9, arg12, arg1, arg8, arg15, arg10, arg4, arg0, arg14, arg11, arg5, arg13, arg6, arg2, arg3, arg7, 1, false);
				}
				Static617.aClass57_14.la();
				Static280.method4126();
				if (Static659.anInt10597 == 0) {
					Static617.aClass57_14.method7663();
				}
				Static649.anInt5979 += local226;
				Static379.anInt6500 += local228;
				Static598.aDouble20 += local234;
				Static136.anInt2254 = Static174.anInt2965 + local128 - Static379.anInt6500;
				Static561.anInt9477 = local106 + Static242.anInt4086 - Static649.anInt5979;
				if (Static659.anInt10597 == 1) {
					Static32.anInt566 += local232;
					Static213.anInt3473 += local230;
					for (@Pc(816) int local816 = 0; local816 < Static171.anInt2921; local816++) {
						@Pc(827) int local827 = Static92.method1361(Static171.anInt2921, Static32.anInt566 + local816) * Static3.anInt23;
						for (local431 = 0; local431 < Static3.anInt23; local431++) {
							@Pc(841) int local841 = local827 + Static92.method1361(Static3.anInt23, local431 + Static213.anInt3473);
							@Pc(884) boolean local884 = local294 <= local816 && local294 + local296 > local816 || local816 >= local300 && local300 + local304 > local816 && local431 >= local298 && local431 < local302 + local298;
							Static376.anInterface6Array1[local841].method9031(Static324.anInt10471 * local431, Static625.anInt10198 * local816, Static324.anInt10471, Static625.anInt10198, local884);
						}
					}
				}
			} else {
				Static554.aBoolean714 = true;
			}
		}
		if (Static554.aBoolean714) {
			Static379.anInt6500 = 0;
			Static273.anInt4769 = arg1;
			Static200.anInt3243 = arg8;
			Static338.anInt6025 = arg12;
			Static598.aDouble20 = 0.0D;
			Static649.anInt5979 = 0;
			Static136.anInt2254 = Static174.anInt2965;
			Static561.anInt9477 = Static242.anInt4086;
			if (Static659.anInt10597 == 0) {
				Static617.aClass57_14.method7730(Static651.anInterface6_1);
			}
			Static617.aClass57_14.la();
			Static617.aClass57_14.ya();
			Static617.aClass57_14.GA(Static261.anInt4523);
			Static422.aClass203_12.method8327(Static338.anInt6025, Static273.anInt4769, Static200.anInt3243, Static417.anInt7207, Static314.anInt5581, Static522.anInt8830);
			Static617.aClass57_14.method7657(Static422.aClass203_12);
			if (Static659.anInt10597 == 1) {
				Static550.anInt9294 = local31;
				Static343.anInt6081 = local17;
				Static164.anInt2529 = local21;
				Static382.anInt9820 = local33;
				Static617.aClass57_14.DA(Static343.anInt6081, Static164.anInt2529, Static550.anInt9294, Static382.anInt9820);
			} else {
				Static343.anInt6081 = Static242.anInt4086 + local17;
				Static164.anInt2529 = Static174.anInt2965 + local21;
				Static382.anInt9820 = local33;
				Static550.anInt9294 = local31;
				Static617.aClass57_14.DA(Static343.anInt6081, Static164.anInt2529, Static550.anInt9294, Static382.anInt9820);
			}
			Static386.aDouble13 = 0.0D;
			Static496.aClass339_3.method8425();
			Static637.method8916(Static496.aClass339_3);
			Static563.method8131(arg9, arg12, arg1, arg8, arg15, arg10, arg4, arg0, arg14, arg11, arg5, arg13, arg6, arg2, arg3, arg7, 1, false);
			Static280.method4126();
			Static554.aBoolean714 = false;
			if (Static659.anInt10597 == 0) {
				Static617.aClass57_14.method7663();
			}
			if (Static659.anInt10597 == 1) {
				Static668.method9194();
			}
		}
		if (Static659.anInt10597 == 0) {
			Static651.anInterface6_1.method9030(Static561.anInt9477, Static136.anInt2254, Static539.anInt9220, Static116.anInt3315, 0, 0);
		}
		Static156.anInt2449++;
		Static353.method5308(Static598.aDouble20);
		Static436.aDouble15 = Static598.aDouble20;
		if (Static659.anInt10597 == 0 || Static659.anInt10597 == 2) {
			if (Static659.anInt10597 == 2) {
				Static617.aClass57_14.GA(Static261.anInt4523);
				Static617.aClass57_14.ya();
			}
			Static520.anInt8815 = local17 + Static242.anInt4086 - Static561.anInt9477 - Static649.anInt5979;
			Static635.anInt10331 = local33;
			Static365.anInt6315 = local31;
			Static355.anInt6219 = local21 + Static174.anInt2965 - Static379.anInt6500 - Static136.anInt2254;
			Static617.aClass57_14.DA(Static520.anInt8815, Static355.anInt6219, Static365.anInt6315, Static635.anInt10331);
		} else if (Static659.anInt10597 == 1) {
			Static365.anInt6315 = local31;
			Static355.anInt6219 = local21 - Static379.anInt6500;
			Static520.anInt8815 = local17 - Static649.anInt5979;
			Static635.anInt10331 = local33;
			Static617.aClass57_14.DA(Static520.anInt8815, Static355.anInt6219, Static365.anInt6315, Static635.anInt10331);
			Static617.aClass57_14.KA(Static561.anInt9477, Static136.anInt2254, Static561.anInt9477 + Static539.anInt9220, Static116.anInt3315 + Static136.anInt2254);
		}
		Static563.method8131(arg9, arg12, arg1, arg8, arg15, arg10, arg4, arg0, arg14, arg11, arg5, arg13, arg6, arg2, arg3, arg7, Static659.anInt10597 == 2 ? 0 : 2, Static659.anInt10597 == 1);
		Static617.aClass57_14.la();
		Static617.aClass57_14.DA(local17, local21, local25, local29);
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILclient!nda;II)J")
	public static long method2114(@OriginalArg(1) Interface16 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) long local12 = 4194304L;
		@Pc(14) long local14 = Long.MIN_VALUE;
		@Pc(21) Class55 local21 = Static536.aClass392_2.method9293(0, arg0.method8089());
		@Pc(42) long local42 = (long) (arg0.method8092(18636) << 14 | arg1 << 7 | arg2 | arg0.method8091(false) << 20 | 0x40000000);
		if (local21.anInt951 == 0) {
			local42 |= local14;
		}
		if (local21.anInt905 == 1) {
			local42 |= local12;
		}
		return local42 | (long) arg0.method8089() << 32;
	}
}
