import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!og", name = "z", descriptor = "Z")
	public static boolean aBoolean551;

	@OriginalMember(owner = "client!og", name = "C", descriptor = "Lclient!fh;")
	public static Class8_Sub5_Sub7 aClass8_Sub5_Sub7_2;

	@OriginalMember(owner = "client!og", name = "D", descriptor = "Lclient!oh;")
	public static Class237 aClass237_102;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!mfa;)V")
	public static void method6274(@OriginalArg(0) Class204 arg0) {
		if (Static171.anInt4135 >= 65535) {
			return;
		}
		@Pc(6) Class8_Sub1 local6 = arg0.aClass8_Sub1_3;
		Static626.aClass204Array1[Static171.anInt4135] = arg0;
		Static489.aBooleanArray25[Static171.anInt4135] = false;
		Static171.anInt4135++;
		@Pc(21) int local21 = arg0.anInt6626;
		if (arg0.aBoolean458) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt6626;
		if (arg0.aBoolean457) {
			local29 = Static192.anInt4507 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method5207() + Static180.anInt4229 - local6.method5200() >> Static172.anInt4156;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method5207() + local6.method5200() - Static180.anInt4229 >> Static172.anInt4156;
			if (local73 >= Static596.anInt10195) {
				local73 = Static596.anInt10195 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray82[local41++];
				@Pc(105) int local105 = (local6.method5206() + Static180.anInt4229 - local6.method5200() >> Static172.anInt4156) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static489.anInt8688) {
					local113 = Static489.anInt8688 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static528.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static528.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static171.anInt4135;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static528.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static171.anInt4135 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static528.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static171.anInt4135 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static528.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static171.anInt4135 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "f", descriptor = "(I)V")
	public static void method6277(@OriginalArg(0) int arg0) {
		Static245.anInt10232 = arg0;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V")
	public static void method6278() {
		Static281.aStringArray16 = new String[500];
		Static69.anInt7729 = Static446.aClass345_13.anInt10013 + Static446.aClass345_13.anInt10003 + 2;
		Static438.anInt8227 = Static469.aClass345_15.anInt10003 + Static469.aClass345_15.anInt10013 + 2;
		for (@Pc(26) int local26 = 0; local26 < Static281.aStringArray16.length; local26++) {
			Static281.aStringArray16[local26] = "";
		}
		Static481.method7139(Static121.aClass84_1.method2710(Static372.anInt7083));
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II[BIII[BII)V")
	public static void method6279(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(15) int local15 = -(arg0 >> 2);
		@Pc(20) int local20 = -(arg0 & 0x3);
		for (@Pc(23) int local23 = -arg2; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local15; local27 < 0; local27++) {
				local31 = arg7++;
				arg5[local31] += arg1[arg4++];
				@Pc(43) int local43 = arg7++;
				arg5[local43] += arg1[arg4++];
				@Pc(55) int local55 = arg7++;
				arg5[local55] += arg1[arg4++];
				@Pc(67) int local67 = arg7++;
				arg5[local67] += arg1[arg4++];
			}
			for (@Pc(85) int local85 = local20; local85 < 0; local85++) {
				local31 = arg7++;
				arg5[local31] += arg1[arg4++];
			}
			arg4 += arg3;
			arg7 += arg6;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IBIII[BI)V")
	public static void method6280(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5) {
		if (arg3 > 0 && !Static439.method6796(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static439.method6796(arg1)) {
			@Pc(39) int local39 = Static18.method812(arg5);
			@Pc(41) int local41 = 0;
			@Pc(48) int local48 = arg1 > arg3 ? arg3 : arg1;
			@Pc(52) int local52 = arg3 >> 1;
			@Pc(56) int local56 = arg1 >> 1;
			@Pc(58) byte[] local58 = arg4;
			@Pc(65) byte[] local65 = new byte[local56 * local52 * local39];
			while (true) {
				OpenGL.glTexImage2Dub(arg2, local41, arg0, arg3, arg1, 0, arg5, 5121, local58, 0);
				if (local48 <= 1) {
					return;
				}
				@Pc(83) int local83 = local39 * arg3;
				@Pc(85) byte[] local85 = local65;
				for (@Pc(87) int local87 = 0; local87 < local39; local87++) {
					@Pc(91) int local91 = local87;
					@Pc(93) int local93 = local87;
					@Pc(98) int local98 = local87 + local83;
					for (@Pc(100) int local100 = 0; local100 < local56; local100++) {
						for (@Pc(104) int local104 = 0; local104 < local52; local104++) {
							@Pc(110) byte local110 = local58[local93];
							local93 += local39;
							@Pc(120) int local120 = local110 + local58[local93];
							@Pc(126) int local126 = local120 + local58[local98];
							local93 += local39;
							local98 += local39;
							@Pc(140) int local140 = local126 + local58[local98];
							local65[local91] = (byte) (local140 >> 2);
							local98 += local39;
							local91 += local39;
						}
						local93 += local83;
						local98 += local83;
					}
				}
				local65 = local58;
				arg1 = local56;
				arg3 = local52;
				local58 = local85;
				local52 >>= 0x1;
				local56 >>= 0x1;
				local41++;
				local48 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!og", name = "g", descriptor = "(I)V")
	public static void method6282() {
		if (!Static382.method6146()) {
			return;
		}
		if (Static281.aStringArray16 == null) {
			method6278();
		}
		Static258.anInt5553 = 0;
		Static350.aBoolean470 = true;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IZLclient!efa;)V")
	public static void method6283(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class15_Sub1_Sub2_Sub2_Sub1 arg1) {
		if (Static548.anInt9471 >= 400) {
			return;
		}
		if (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2 != arg1) {
			@Pc(83) String local83;
			@Pc(135) int local135;
			if (arg1.anInt3309 == 0) {
				@Pc(94) boolean local94 = true;
				if (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt3281 != -1 && arg1.anInt3281 != -1) {
					@Pc(114) int local114 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt3300 > arg1.anInt3300 ? Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt3300 : arg1.anInt3300;
					@Pc(125) int local125 = arg1.anInt3281 > Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt3281 ? Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt3281 : arg1.anInt3281;
					local135 = local114 * 10 / 100 + local125 + 5;
					@Pc(142) int local142 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt3300 - arg1.anInt3300;
					if (local142 < 0) {
						local142 = -local142;
					}
					if (local142 > local135) {
						local94 = false;
					}
				}
				@Pc(165) String local165 = Static281.aClass217_4 == Static18.aClass217_1 ? Static121.aClass84_30.method2710(Static372.anInt7083) : Static121.aClass84_28.method2710(Static372.anInt7083);
				if (arg1.anInt3310 > arg1.anInt3300) {
					local83 = arg1.method2759() + (local94 ? Static181.method3453(Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt3300, arg1.anInt3300) : "<col=ffffff>") + " (" + local165 + arg1.anInt3300 + "+" + (arg1.anInt3310 - arg1.anInt3300) + ")";
				} else {
					local83 = arg1.method2759() + (local94 ? Static181.method3453(Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt3300, arg1.anInt3300) : "<col=ffffff>") + " (" + local165 + arg1.anInt3300 + ")";
				}
			} else if (arg1.anInt3309 == -1) {
				local83 = arg1.method2759();
			} else {
				local83 = arg1.method2759() + " (" + Static121.aClass84_29.method2710(Static372.anInt7083) + arg1.anInt3309 + ")";
			}
			if (Static147.aBoolean270 && !arg0 && (Static328.anInt9771 & 0x8) != 0) {
				Static192.method3629((long) arg1.anInt8075, false, -1, false, (long) arg1.anInt8075, 18, Static598.aString17, 0, 0, true, Static500.anInt8805, Static4.aString2 + " -> <col=ffffff>" + local83);
			}
			if (arg0) {
				Static192.method3629((long) arg1.anInt8075, false, 0, true, 0L, -1, "<col=cccccc>" + local83, 0, 0, false, -1, "");
			} else {
				for (@Pc(286) int local286 = 7; local286 >= 0; local286--) {
					if (Static370.aStringArray19[local286] != null) {
						@Pc(294) short local294 = 0;
						if (Static207.aClass217_3 == Static18.aClass217_1 && Static370.aStringArray19[local286].equalsIgnoreCase(Static121.aClass84_23.method2710(Static372.anInt7083))) {
							if (arg1.anInt3300 > Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt3300) {
								local294 = 2000;
							}
							if (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt3293 != 0 && arg1.anInt3293 != 0) {
								if (arg1.anInt3293 == Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt3293) {
									local294 = 2000;
								} else {
									local294 = 0;
								}
							}
						} else if (Static560.aBooleanArray28[local286]) {
							local294 = 2000;
						}
						@Pc(350) short local350 = (short) (Static159.aShortArray108[local286] + local294);
						local135 = Static525.anIntArray504[local286] == -1 ? Static394.anInt7610 : Static525.anIntArray504[local286];
						Static192.method3629((long) arg1.anInt8075, false, -1, false, (long) arg1.anInt8075, local350, Static370.aStringArray19[local286], 0, 0, true, local135, "<col=ffffff>" + local83);
					}
				}
			}
			if (!arg0) {
				for (@Pc(428) Class8_Sub5_Sub7 local428 = (Class8_Sub5_Sub7) Static72.aClass43_17.method1422(); local428 != null; local428 = (Class8_Sub5_Sub7) Static72.aClass43_17.method1426()) {
					if (local428.anInt3779 == 15) {
						local428.aString43 = "<col=ffffff>" + local83;
						return;
					}
				}
			}
		} else if (Static147.aBoolean270 && (Static328.anInt9771 & 0x10) != 0) {
			Static192.method3629((long) arg1.anInt8075, false, -1, false, 0L, 11, Static598.aString17, 0, 0, true, Static500.anInt8805, Static4.aString2 + " -> <col=ffffff>" + Static121.aClass84_37.method2710(Static372.anInt7083));
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!rr;IIIII)V")
	public static void method6284(@OriginalArg(0) Class15_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static192.anInt4507) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static489.anInt8688) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static596.anInt10195 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class56 local62 = Static405.aClass56ArrayArrayArray2[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static34.aClass86Array5[local17].method8086(local32, local23) + Static34.aClass86Array5[local17].method8086(local32, local23 + 1) + Static34.aClass86Array5[local17].method8086(local32 + 1, local23) + Static34.aClass86Array5[local17].method8086(local32 + 1, local23 + 1)) / 4 - (Static34.aClass86Array5[arg1].method8086(arg3, arg2) + Static34.aClass86Array5[arg1].method8086(arg3, arg2 + 1) + Static34.aClass86Array5[arg1].method8086(arg3 + 1, arg2) + Static34.aClass86Array5[arg1].method8086(arg3 + 1, arg2 + 1)) / 4;
									@Pc(151) Class15_Sub1_Sub4 local151 = local62.aClass15_Sub1_Sub4_2;
									@Pc(154) Class15_Sub1_Sub4 local154 = local62.aClass15_Sub1_Sub4_1;
									if (local151 != null && local151.method8332()) {
										arg0.method8322(local1, Static269.aClass16_11, local151, (local23 - arg2) * Static572.anInt9827 + (1 - arg4) * Static180.anInt4229, (local32 - arg3) * Static572.anInt9827 + (1 - arg5) * Static180.anInt4229, local148);
									}
									if (local154 != null && local154.method8332()) {
										arg0.method8322(local1, Static269.aClass16_11, local154, (local23 - arg2) * Static572.anInt9827 + (1 - arg4) * Static180.anInt4229, (local32 - arg3) * Static572.anInt9827 + (1 - arg5) * Static180.anInt4229, local148);
									}
									for (@Pc(227) Class152 local227 = local62.aClass152_2; local227 != null; local227 = local227.aClass152_3) {
										@Pc(231) Class15_Sub1_Sub2 local231 = local227.aClass15_Sub1_Sub2_1;
										if (local231 != null && local231.method8332() && (local23 == local231.aShort105 || local23 == local3) && (local32 == local231.aShort103 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort104 + 1 - local231.aShort105;
											@Pc(268) int local268 = local231.aShort106 + 1 - local231.aShort103;
											arg0.method8322(local1, Static269.aClass16_11, local231, (local231.aShort105 - arg2) * Static572.anInt9827 + (local260 - arg4) * Static180.anInt4229, (local231.aShort103 - arg3) * Static572.anInt9827 + (local268 - arg5) * Static180.anInt4229, local148);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
