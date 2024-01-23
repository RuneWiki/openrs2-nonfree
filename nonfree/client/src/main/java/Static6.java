import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!af", name = "a", descriptor = "I")
	public static int anInt2981;

	@OriginalMember(owner = "client!af", name = "e", descriptor = "[[Lclient!o;")
	public static Class86[][] aClass86ArrayArray11;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "Lclient!sc;")
	private static Class107 aClass107_818 = Static231.method3737(" from your friend list first)3");

	@OriginalMember(owner = "client!af", name = "f", descriptor = "Lclient!sc;")
	public static Class107 aClass107_817 = aClass107_818;

	@OriginalMember(owner = "client!af", name = "h", descriptor = "Lclient!sc;")
	private static Class107 aClass107_819 = Static231.method3737("Take");

	@OriginalMember(owner = "client!af", name = "j", descriptor = "Lclient!sc;")
	public static Class107 aClass107_820 = null;

	@OriginalMember(owner = "client!af", name = "q", descriptor = "Lclient!sc;")
	public static Class107 aClass107_821 = aClass107_819;

	@OriginalMember(owner = "client!af", name = "r", descriptor = "Lclient!sc;")
	public static Class107 aClass107_822 = Static231.method3737("");

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIII)V")
	public static void method2293(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1) {
		Static38.anInt784 = arg1;
		Static47.anInt1057 = arg0;
		Static99.anInt915 = 0;
		Static223.anInt4869 = 0;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIB[B)I")
	public static int method2294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(3) int local3 = -1;
		for (@Pc(10) int local10 = arg0; local10 < arg1; local10++) {
			local3 = Class52.anIntArray179[(local3 ^ arg2[local10]) & 0xFF] ^ local3 >>> 8;
		}
		return ~local3;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIILclient!jb;)Lclient!tg;")
	public static Class1_Sub2_Sub2 method2299(@OriginalArg(0) int arg0, @OriginalArg(3) Class28 arg1) {
		return Static83.method1393(arg0, arg1) ? Static188.method3058() : null;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!vf;I)V")
	public static void method2301(@OriginalArg(0) Class1_Sub26 arg0) {
		@Pc(9) int local9 = Static223.anInt4863 >> 1;
		@Pc(15) int local15 = Static89.anInt1940 >> 2 << 10;
		@Pc(19) byte[][] local19 = new byte[Static170.anInt3706][Static152.anInt3375];
		@Pc(23) int local23;
		@Pc(116) int local116;
		@Pc(126) int local126;
		while (arg0.aByteArray52.length > arg0.anInt4021) {
			local23 = 0;
			@Pc(25) boolean local25 = false;
			@Pc(27) int local27 = 0;
			if (arg0.method2945() == 1) {
				local23 = arg0.method2945();
				local25 = true;
				local27 = arg0.method2945();
			}
			@Pc(46) int local46 = arg0.method2945();
			@Pc(50) int local50 = arg0.method2945();
			@Pc(61) int local61 = Static64.anInt1525 + Static152.anInt3375 - local50 * 64 - 1;
			@Pc(68) int local68 = local46 * 64 - Static101.anInt2179;
			if (local68 >= 0 && local61 - 63 >= 0 && local68 + 63 < Static170.anInt3706 && local61 < Static152.anInt3375) {
				for (local116 = 0; local116 < 64; local116++) {
					@Pc(124) byte[] local124 = local19[local116 + local68];
					for (local126 = 0; local126 < 64; local126++) {
						if (!local25 || local23 * 8 <= local116 && local116 < local23 * 8 + 8 && local27 * 8 <= local126 && local126 < local27 * 8 + 8) {
							local124[local61 - local126] = arg0.method2992();
						}
					}
				}
			} else if (local25) {
				arg0.anInt4021 += 64;
			} else {
				arg0.anInt4021 += 4096;
			}
		}
		@Pc(187) int local187 = Static170.anInt3706;
		local23 = Static152.anInt3375;
		@Pc(192) int[] local192 = new int[local23];
		@Pc(195) int[] local195 = new int[local23];
		@Pc(198) int[] local198 = new int[local23];
		@Pc(201) int[] local201 = new int[local23];
		@Pc(204) int[] local204 = new int[local23];
		for (local116 = -5; local116 < local187; local116++) {
			@Pc(232) int local232;
			@Pc(296) int local296;
			for (@Pc(215) int local215 = 0; local215 < local23; local215++) {
				local126 = local116 + 5;
				@Pc(276) int local276;
				if (local187 > local126) {
					local232 = local19[local126][local215] & 0xFF;
					if (local232 > 0) {
						@Pc(240) Class10 local240 = Static148.method2426(local232 - 1);
						local192[local215] += local240.anInt331;
						local195[local215] += local240.anInt323;
						local201[local215] += local240.anInt329;
						local198[local215] += local240.anInt328;
						local276 = local204[local215]++;
					}
				}
				local232 = local116 - 5;
				if (local232 >= 0) {
					local296 = local19[local232][local215] & 0xFF;
					if (local296 > 0) {
						@Pc(307) Class10 local307 = Static148.method2426(local296 - 1);
						local192[local215] -= local307.anInt331;
						local195[local215] -= local307.anInt323;
						local201[local215] -= local307.anInt329;
						local198[local215] -= local307.anInt328;
						local276 = local204[local215]--;
					}
				}
			}
			if (local116 >= 0) {
				@Pc(362) int[][] local362 = Static43.anIntArrayArrayArray4[local116 >> 6];
				local232 = 0;
				local296 = 0;
				@Pc(368) int local368 = 0;
				@Pc(370) int local370 = 0;
				@Pc(372) int local372 = 0;
				for (@Pc(374) int local374 = -5; local374 < local23; local374++) {
					@Pc(380) int local380 = local374 - 5;
					@Pc(384) int local384 = local374 + 5;
					if (local384 < local23) {
						local370 += local198[local384];
						local296 += local195[local384];
						local372 += local204[local384];
						local232 += local192[local384];
						local368 += local201[local384];
					}
					if (local380 >= 0) {
						local296 -= local195[local380];
						local368 -= local201[local380];
						local370 -= local198[local380];
						local232 -= local192[local380];
						local372 -= local204[local380];
					}
					if (local374 >= 0 && local372 > 0) {
						@Pc(466) int[] local466 = local362[local374 >> 6];
						@Pc(484) int local484 = local370 == 0 ? 0 : Static201.method3225(local368 / local372, local232 * 256 / local370, local296 / local372);
						if (local19[local116][local374] != 0) {
							if (local466 == null) {
								local466 = local362[local374 >> 6] = new int[4096];
							}
							@Pc(508) int local508 = (local484 & 0x7F) + local9;
							if (local508 < 0) {
								local508 = 0;
							} else if (local508 > 127) {
								local508 = 127;
							}
							@Pc(533) int local533 = local508 + (local484 & 0x380) + (local484 + local15 & 0xFC00);
							local466[((local374 & 0x3F) << 6) + (local116 & 0x3F)] = Static74.anIntArray158[Static82.method1388(96, local533)];
						} else if (local466 != null) {
							local466[(local116 & 0x3F) + ((local374 & 0x3F) << 6)] = 0;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIBI)V")
	public static void method2303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) int local18;
		@Pc(47) int local47;
		if (Static167.anInt3590 == 0 && !Static56.aBoolean124) {
			@Pc(14) int local14 = Static146.anInt3164;
			@Pc(16) int local16 = Static232.anInt4367;
			local18 = Static177.anInt3841;
			@Pc(20) int local20 = Static75.anInt1690;
			@Pc(34) int local34 = local14 + (local16 - local14) * (arg2 - arg4) / arg5;
			local47 = (arg3 - arg1) * (local20 - local18) / arg0 + local18;
			Static137.method2291(Static63.aClass107_427, local47, (short) 20, local34, 0L, Static210.aClass107_1225);
		}
		@Pc(65) long local65 = -1L;
		for (local18 = 0; local18 < Static19.anInt394; local18++) {
			@Pc(73) long local73 = Static83.aLongArray4[local18];
			local47 = (int) local73 & 0x7F;
			@Pc(85) int local85 = (int) local73 >> 7 & 0x7F;
			@Pc(92) int local92 = (int) local73 >> 29 & 0x3;
			@Pc(99) int local99 = (int) (local73 >>> 32) & Integer.MAX_VALUE;
			if (local65 != local73) {
				local65 = local73;
				@Pc(153) int local153;
				if (local92 == 2 && Static99.method835(Static191.anInt4237, local47, local85, local73)) {
					@Pc(122) Class101 local122 = Static170.method2725(local99);
					if (local122.anIntArray338 != null) {
						local122 = local122.method2851();
					}
					if (local122 == null) {
						continue;
					}
					if (Static167.anInt3590 == 1) {
						Static137.method2291(Static149.method2437(new Class107[] { aClass107_820, Static170.aClass107_1008, local122.aClass107_1059 }), local85, (short) 43, local47, local73, Static13.aClass107_124);
					} else if (!Static56.aBoolean124) {
						@Pc(143) Class107[] local143 = local122.aClass107Array24;
						if (Static153.aBoolean297) {
							local143 = Static231.method3741(local143);
						}
						if (local143 != null) {
							for (local153 = 4; local153 >= 0; local153--) {
								if (local143[local153] != null) {
									@Pc(161) short local161 = 0;
									if (local153 == 0) {
										local161 = 28;
									}
									if (local153 == 1) {
										local161 = 6;
									}
									if (local153 == 2) {
										local161 = 24;
									}
									if (local153 == 3) {
										local161 = 34;
									}
									if (local153 == 4) {
										local161 = 1006;
									}
									Static137.method2291(Static149.method2437(new Class107[] { Static197.aClass107_1128, local122.aClass107_1059 }), local85, local161, local47, local73, local143[local153]);
								}
							}
						}
						Static137.method2291(Static149.method2437(new Class107[] { Static197.aClass107_1128, local122.aClass107_1059 }), local85, (short) 1005, local47, (long) local122.anInt3903, Static188.aClass107_1098);
					} else if ((Static172.anInt3729 & 0x4) == 4) {
						Static137.method2291(Static149.method2437(new Class107[] { Static219.aClass107_1291, Static170.aClass107_1008, local122.aClass107_1059 }), local85, (short) 17, local47, local73, Static71.aClass107_470);
					}
				}
				@Pc(338) int local338;
				@Pc(346) Class5_Sub5_Sub2 local346;
				@Pc(403) Class5_Sub5_Sub1 local403;
				if (local92 == 1) {
					@Pc(315) Class5_Sub5_Sub2 local315 = Static33.aClass5_Sub5_Sub2Array1[local99];
					if (local315.aClass30_1.anInt961 == 1 && (local315.anInt3021 & 0x7F) == 64 && (local315.anInt3044 & 0x7F) == 64) {
						for (local338 = 0; local338 < Static189.anInt4168; local338++) {
							local346 = Static33.aClass5_Sub5_Sub2Array1[Static37.anIntArray82[local338]];
							if (local346 != null && local346 != local315 && local346.aClass30_1.anInt961 == 1 && local315.anInt3021 == local346.anInt3021 && local346.anInt3044 == local315.anInt3044) {
								Static4.method3662(local85, Static37.anIntArray82[local338], local346.aClass30_1, local47);
							}
						}
						for (local153 = 0; local153 < Static10.anInt285; local153++) {
							local403 = Static198.aClass5_Sub5_Sub1Array1[Static16.anIntArray38[local153]];
							if (local403 != null && local315.anInt3021 == local403.anInt3021 && local403.anInt3044 == local315.anInt3044) {
								Static217.method3558(Static16.anIntArray38[local153], local403, local47, local85);
							}
						}
					}
					Static4.method3662(local85, local99, local315.aClass30_1, local47);
				}
				if (local92 == 0) {
					@Pc(443) Class5_Sub5_Sub1 local443 = Static198.aClass5_Sub5_Sub1Array1[local99];
					if ((local443.anInt3021 & 0x7F) == 64 && (local443.anInt3044 & 0x7F) == 64) {
						for (local338 = 0; local338 < Static189.anInt4168; local338++) {
							local346 = Static33.aClass5_Sub5_Sub2Array1[Static37.anIntArray82[local338]];
							if (local346 != null && local346.aClass30_1.anInt961 == 1 && local346.anInt3021 == local443.anInt3021 && local346.anInt3044 == local443.anInt3044) {
								Static4.method3662(local85, Static37.anIntArray82[local338], local346.aClass30_1, local47);
							}
						}
						for (local153 = 0; local153 < Static10.anInt285; local153++) {
							local403 = Static198.aClass5_Sub5_Sub1Array1[Static16.anIntArray38[local153]];
							if (local403 != null && local403 != local443 && local443.anInt3021 == local403.anInt3021 && local403.anInt3044 == local443.anInt3044) {
								Static217.method3558(Static16.anIntArray38[local153], local403, local47, local85);
							}
						}
					}
					Static217.method3558(local99, local443, local47, local85);
				}
				if (local92 == 3) {
					@Pc(571) Class120 local571 = Static195.aClass120ArrayArrayArray2[Static191.anInt4237][local47][local85];
					if (local571 != null) {
						for (@Pc(578) Class1_Sub2_Sub18 local578 = (Class1_Sub2_Sub18) local571.method3563(); local578 != null; local578 = (Class1_Sub2_Sub18) local571.method3565()) {
							local153 = local578.aClass5_Sub2_1.anInt375;
							@Pc(588) Class75 local588 = Static128.method2147(local153);
							if (Static167.anInt3590 == 1) {
								Static137.method2291(Static149.method2437(new Class107[] { aClass107_820, Static113.aClass107_672, local588.aClass107_737 }), local85, (short) 42, local47, (long) local153, Static13.aClass107_124);
							} else if (!Static56.aBoolean124) {
								@Pc(636) Class107[] local636 = local588.aClass107Array14;
								if (Static153.aBoolean297) {
									local636 = Static231.method3741(local636);
								}
								for (@Pc(644) int local644 = 4; local644 >= 0; local644--) {
									if (local636 != null && local636[local644] != null) {
										@Pc(690) byte local690 = 0;
										if (local644 == 0) {
											local690 = 14;
										}
										if (local644 == 1) {
											local690 = 19;
										}
										if (local644 == 2) {
											local690 = 35;
										}
										if (local644 == 3) {
											local690 = 58;
										}
										if (local644 == 4) {
											local690 = 12;
										}
										Static137.method2291(Static149.method2437(new Class107[] { Static132.aClass107_768, local588.aClass107_737 }), local85, local690, local47, (long) local153, local636[local644]);
									} else if (local644 == 2) {
										Static137.method2291(Static149.method2437(new Class107[] { Static132.aClass107_768, local588.aClass107_737 }), local85, (short) 35, local47, (long) local153, aClass107_821);
									}
								}
								Static137.method2291(Static149.method2437(new Class107[] { Static132.aClass107_768, local588.aClass107_737 }), local85, (short) 1007, local47, (long) local153, Static188.aClass107_1098);
							} else if ((Static172.anInt3729 & 0x1) == 1) {
								Static137.method2291(Static149.method2437(new Class107[] { Static219.aClass107_1291, Static113.aClass107_672, local588.aClass107_737 }), local85, (short) 50, local47, (long) local153, Static71.aClass107_470);
							}
						}
					}
				}
			}
		}
	}
}
