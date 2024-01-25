import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public class Class310 {

	@OriginalMember(owner = "client!rs", name = "m", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "[I")
	private final int[] anIntArray628 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!rs", name = "w", descriptor = "[I")
	private final int[] anIntArray629 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!rs", name = "q", descriptor = "Lclient!wn;")
	private final Class391 aClass391_8;

	@OriginalMember(owner = "client!rs", name = "y", descriptor = "I")
	public final int anInt9399;

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "I")
	protected final int anInt9390;

	@OriginalMember(owner = "client!rs", name = "u", descriptor = "Lclient!vk;")
	private final Class375 aClass375_9;

	@OriginalMember(owner = "client!rs", name = "o", descriptor = "Z")
	public final boolean aBoolean682;

	@OriginalMember(owner = "client!rs", name = "n", descriptor = "I")
	protected final int anInt9395;

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!rs", name = "i", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!rs", name = "s", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!rs", name = "v", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!rs", name = "A", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(IIIZLclient!vk;Lclient!wn;)V")
	protected Class310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class375 arg4, @OriginalArg(5) Class391 arg5) {
		this.aClass391_8 = arg5;
		this.anInt9399 = arg0;
		this.anInt9390 = arg1;
		this.aClass375_9 = arg4;
		this.aBoolean682 = arg3;
		this.anInt9395 = arg2;
		this.anIntArrayArrayArray20 = new int[this.anInt9399][this.anInt9390 + 1][this.anInt9395 + 1];
		this.aByteArrayArrayArray14 = new byte[this.anInt9399][this.anInt9390][this.anInt9395];
		this.aByteArrayArrayArray16 = new byte[this.anInt9399][this.anInt9390 + 1][this.anInt9395 + 1];
		this.aByteArrayArrayArray17 = new byte[this.anInt9399][this.anInt9390][this.anInt9395];
		this.aByteArrayArrayArray18 = new byte[this.anInt9399][this.anInt9390][this.anInt9395];
		this.aByteArrayArrayArray13 = new byte[this.anInt9399][this.anInt9390][this.anInt9395];
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIILclient!gga;[Lclient!sn;II)V")
	public final void method7910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class6_Sub23 arg3, @OriginalArg(4) Class324[] arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (!this.aBoolean682) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class324 local16 = arg4[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local28 = arg5 + local18;
						@Pc(33) int local33 = arg0 + local22;
						if (local28 >= 0 && local28 < this.anInt9390 && local33 >= 0 && local33 < this.anInt9395) {
							local16.method7782(local33, local28);
						}
					}
				}
			}
		}
		local10 = arg5 + arg2;
		@Pc(83) int local83 = arg1 + arg0;
		for (local18 = 0; local18 < this.anInt9399; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method7922(arg3, local10 + local22, 0, local18, arg0 + local28, local83 + local28, false, local22 + arg5, 0, 0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Z[[II)V")
	public final void method7911(@OriginalArg(1) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray20[0];
		for (@Pc(16) int local16 = 0; local16 < this.anInt9390 + 1; local16++) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt9395 + 1; local20++) {
				local10[local16][local20] += arg0[local16][local20];
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIZII)V")
	public final void method7913(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9399; local7++) {
			this.method7918(arg0, 64, arg1, 64, local7);
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIII[Lclient!sn;IIILclient!gga;)V")
	public final void method7915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class324[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class6_Sub23 arg8) {
		@Pc(11) int local11 = (arg7 & 0x7) * 8;
		@Pc(17) int local17 = (arg3 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(58) int local58;
		if (!this.aBoolean682) {
			@Pc(24) Class324 local24 = arg4[arg2];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(46) int local46 = Static645.method8799(local30 & 0x7, local26 & 0x7, arg6) + arg0;
					local58 = Static231.method3392(local30 & 0x7, local26 & 0x7, arg6) + arg5;
					if (local46 > 0 && local46 < this.anInt9390 - 1 && local58 > 0 && this.anInt9395 - 1 > local58) {
						local24.method7782(local58, local46);
					}
				}
			}
		}
		@Pc(105) int local105 = (arg7 & 0xFFFFFFF8) << 3;
		local26 = (arg3 & 0x1FFFFFF8) << 3;
		@Pc(113) byte local113 = 0;
		@Pc(115) byte local115 = 0;
		if (arg6 == 1) {
			local115 = 1;
		} else if (arg6 == 2) {
			local113 = 1;
			local115 = 1;
		} else if (arg6 == 3) {
			local113 = 1;
		}
		for (local58 = 0; local58 < this.anInt9399; local58++) {
			for (@Pc(144) int local144 = 0; local144 < 64; local144++) {
				for (@Pc(148) int local148 = 0; local148 < 64; local148++) {
					if (arg1 == local58 && local11 <= local144 && local11 + 8 >= local144 && local17 <= local148 && local148 <= local17 + 8) {
						@Pc(205) int local205;
						@Pc(217) int local217;
						if (local144 == local11 + 8 || local17 + 8 == local148) {
							if (arg6 == 0) {
								local205 = local144 + arg0 - local11;
								local217 = local148 + arg5 - local17;
							} else if (arg6 == 1) {
								local217 = local11 + arg5 + 8 - local144;
								local205 = local148 + arg0 - local17;
							} else if (arg6 == 2) {
								local205 = local11 + arg0 + 8 - local144;
								local217 = local17 + arg5 + 8 - local148;
							} else {
								local217 = arg5 + local144 - local11;
								local205 = local17 + arg0 + 8 - local148;
							}
							this.method7922(arg8, local144 + local105, 0, arg2, local217, local148 + local26, true, local205, 0, 0);
						} else {
							local205 = Static645.method8799(local148 & 0x7, local144 & 0x7, arg6) + arg0;
							local217 = Static231.method3392(local148 & 0x7, local144 & 0x7, arg6) + arg5;
							this.method7922(arg8, local144 + local105, local115, arg2, local217, local26 + local148, false, local205, local113, arg6);
						}
						if (local144 == 63 || local148 == 63) {
							@Pc(342) byte local342 = 1;
							if (local144 == 63 && local148 == 63) {
								local342 = 3;
							}
							for (@Pc(354) int local354 = 0; local354 < local342; local354++) {
								@Pc(358) int local358 = local144;
								@Pc(360) int local360 = local148;
								if (local354 == 0) {
									local360 = local148 == 63 ? 64 : local148;
									local358 = local144 == 63 ? 64 : local144;
								} else if (local354 == 1) {
									local358 = 64;
								} else if (local354 == 2) {
									local360 = 64;
								}
								@Pc(418) int local418;
								@Pc(410) int local410;
								if (arg6 == 0) {
									local410 = local360 + arg5 - local17;
									local418 = local358 + arg0 - local11;
								} else if (arg6 == 1) {
									local418 = arg0 + local360 - local17;
									local410 = local11 + arg5 + 8 - local358;
								} else if (arg6 == 2) {
									local418 = arg0 + local11 + 8 - local358;
									local410 = local17 + arg5 + 8 - local360;
								} else {
									local418 = arg0 + local17 + 8 - local360;
									local410 = local358 + arg5 - local11;
								}
								if (local418 >= 0 && local418 < this.anInt9390 && local410 >= 0 && this.anInt9395 > local410) {
									this.anIntArrayArrayArray20[arg2][local418][local410] = this.anIntArrayArrayArray20[arg2][local205 + local113][local217 + local115];
								}
							}
						}
					} else {
						this.method7922(arg8, 0, 0, 0, -1, 0, false, -1, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "([[[ILclient!ha;B[Lclient!sn;)V")
	public final void method7916(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(3) Class324[] arg2) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (!this.aBoolean682) {
			for (local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt9390; local10++) {
					for (local14 = 0; local14 < this.anInt9395; local14++) {
						if ((Static90.aByteArrayArrayArray2[local6][local10][local14] & 0x1) != 0) {
							@Pc(31) int local31 = local6;
							if ((Static90.aByteArrayArrayArray2[1][local10][local14] & 0x2) != 0) {
								local31 = local6 - 1;
							}
							if (local31 >= 0) {
								arg2[local31].method7787(local14, local10);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt9399; local6++) {
			local10 = 0;
			local14 = 0;
			if (!this.aBoolean682) {
				if (Static513.aBoolean591) {
					local10 = 2;
				}
				if (Static455.aBoolean507) {
					local14 = 8;
				}
				if (Static306.anInt5215 != 0) {
					if (Static308.aBoolean337 | local6 == 0) {
						local14 |= 0x10;
					}
					local10 |= 0x1;
				}
			}
			if (Static513.aBoolean591) {
				local14 |= 0x7;
			}
			if (!Static243.aBoolean269) {
				local14 |= 0x20;
			}
			@Pc(167) int[][] local167 = arg0 == null || local6 >= arg0.length ? this.anIntArrayArrayArray20[local6] : arg0[local6];
			Static24.method597(local6, arg1.method7437(this.anInt9390, this.anInt9395, this.anIntArrayArrayArray20[local6], local167, local10, local14));
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!s;Lclient!s;[[ILclient!ha;Lclient!s;II)V")
	private void method7917(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class12 arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) Class132 arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(6) int arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray17[arg5];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray18[arg5];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray13[arg5];
		@Pc(37) byte[][] local37 = this.aByteArrayArrayArray14[arg5];
		for (@Pc(39) int local39 = 0; local39 < this.anInt9390; local39++) {
			@Pc(57) int local57 = this.anInt9390 - 1 > local39 ? local39 + 1 : local39;
			for (@Pc(59) int local59 = 0; local59 < this.anInt9395; local59++) {
				@Pc(77) int local77 = this.anInt9395 - 1 > local59 ? local59 + 1 : local59;
				if (Static220.anInt3743 == -1 || Static369.method5324(arg5, Static220.anInt3743, local59, local39)) {
					@Pc(92) boolean local92 = false;
					@Pc(94) boolean local94 = false;
					@Pc(97) boolean[] local97 = new boolean[4];
					@Pc(103) int local103 = local10[local39][local59];
					@Pc(109) int local109 = local15[local39][local59];
					@Pc(117) int local117 = local37[local39][local59] & 0xFF;
					@Pc(125) int local125 = local20[local39][local59] & 0xFF;
					@Pc(133) int local133 = local20[local39][local77] & 0xFF;
					@Pc(141) int local141 = local20[local57][local77] & 0xFF;
					@Pc(149) int local149 = local20[local57][local59] & 0xFF;
					if (local117 != 0 || local125 != 0) {
						@Pc(168) Class38 local168 = local117 == 0 ? null : this.aClass375_9.method8746(local117 - 1);
						if (local103 == 0 && local168 == null) {
							local103 = 12;
						}
						@Pc(189) Class278 local189 = local125 == 0 ? null : this.aClass391_8.method9095(local125 - 1);
						@Pc(191) Class38 local191 = local168;
						if (local168 != null) {
							if (local168.anInt1021 == -1 && local168.anInt1023 == -1) {
								local191 = local168;
								local168 = null;
							} else if (local189 != null && local103 != 0) {
								local94 = local168.aBoolean52;
							}
						}
						@Pc(297) int local297;
						@Pc(312) int local312;
						@Pc(385) int local385;
						@Pc(395) int local395;
						if ((local103 == 0 || local103 == 12) && local39 > 0 && local59 > 0 && this.anInt9390 > local39 && local59 < this.anInt9395) {
							@Pc(263) int local263 = local20[local57][local59 - 1] == local125 ? 1 : -1;
							@Pc(276) int local276 = local20[local57][local77] == local125 ? 1 : -1;
							local297 = local20[local39 - 1][local59 - 1] == local125 ? 1 : -1;
							local312 = local125 == local20[local39 - 1][local77] ? 1 : -1;
							if (local125 == local20[local39][local59 - 1]) {
								local263++;
								local297++;
							} else {
								local297--;
								local263--;
							}
							if (local20[local57][local59] == local125) {
								local263++;
								local276++;
							} else {
								local263--;
								local276--;
							}
							if (local20[local39][local77] == local125) {
								local276++;
								local312++;
							} else {
								local312--;
								local276--;
							}
							if (local20[local39 - 1][local59] == local125) {
								local297++;
								local312++;
							} else {
								local297--;
								local312--;
							}
							local385 = local297 - local276;
							if (local385 < 0) {
								local385 = -local385;
							}
							local395 = local263 - local312;
							if (local395 < 0) {
								local395 = -local395;
							}
							if (local385 == local395) {
								local385 = arg4.method7846(local39, local59) - arg4.method7846(local57, local77);
								if (local385 < 0) {
									local385 = -local385;
								}
								local395 = arg4.method7846(local57, local59) - arg4.method7846(local39, local77);
								if (local395 < 0) {
									local395 = -local395;
								}
							}
							local109 = local395 > local385 ? 1 : 0;
						}
						for (local297 = 0; local297 < 13; local297++) {
							Static540.anIntArray618[local297] = -1;
							Static181.anIntArray177[local297] = 1;
						}
						@Pc(481) boolean[] local481 = local168 != null && local168.aBoolean52 ? Static120.aBooleanArrayArray2[local103] : Static265.aBooleanArrayArray5[local103];
						this.method7920(local189, local10, arg3, local59, local97, local39, local109, local37, local168, this.anInt9395, local15, local103, this.anInt9390);
						@Pc(514) boolean local514 = local168 != null && local168.anInt1023 != local168.anInt1021;
						if (!local514) {
							for (local312 = 0; local312 < 8; local312++) {
								if (Static540.anIntArray618[local312] >= 0 && Static518.anIntArray258[local312] != Static260.anIntArray694[local312]) {
									local514 = true;
									break;
								}
							}
						}
						if (!local481[local109 + 1 & 0x3]) {
							local97[1] = Static184.method2648(local97[1], (Static181.anIntArray177[2] & Static181.anIntArray177[4]) == 0);
						}
						if (!local481[local109 + 3 & 0x3]) {
							local97[3] = Static184.method2648(local97[3], (Static181.anIntArray177[0] & Static181.anIntArray177[6]) == 0);
						}
						if (!local481[local109 & 0x3]) {
							local97[0] = Static184.method2648(local97[0], (Static181.anIntArray177[2] & Static181.anIntArray177[0]) == 0);
						}
						if (!local481[local109 + 2 & 0x3]) {
							local97[2] = Static184.method2648(local97[2], (Static181.anIntArray177[4] & Static181.anIntArray177[6]) == 0);
						}
						if (!local94 && (local103 == 0 || local103 == 12)) {
							if (local97[0] && !local97[1] && !local97[2] && local97[3]) {
								local103 = local103 == 0 ? 13 : 14;
								local109 = 0;
								local97[0] = local97[3] = false;
							} else if (local97[0] && local97[1] && !local97[2] && !local97[3]) {
								local109 = 3;
								local103 = local103 == 0 ? 13 : 14;
								local97[0] = local97[1] = false;
							} else if (!local97[0] && local97[1] && local97[2] && !local97[3]) {
								local103 = local103 == 0 ? 13 : 14;
								local97[1] = local97[2] = false;
								local109 = 2;
							} else if (!local97[0] && !local97[1] && local97[2] && local97[3]) {
								local97[2] = local97[3] = false;
								local103 = local103 == 0 ? 13 : 14;
								local109 = 1;
							}
						}
						@Pc(827) boolean local827 = !local94 && !local97[0] && !local97[2] && !local97[1] && !local97[3];
						@Pc(829) int[] local829 = null;
						@Pc(843) int[] local843;
						@Pc(851) int[] local851;
						@Pc(847) int[] local847;
						if (local827) {
							local395 = local168 == null ? 0 : Static197.anIntArray187[local103];
							local843 = Static570.anIntArrayArray54[local103];
							local847 = Static64.anIntArrayArray5[local103];
							local851 = Static194.anIntArrayArray17[local103];
							local385 = local189 == null ? 0 : Static51.anIntArray61[local103];
						} else if (local94) {
							local851 = Static97.anIntArrayArray9[local103];
							local843 = Static79.anIntArrayArray7[local103];
							local829 = Static555.anIntArrayArray52[local103];
							local395 = local168 == null ? 0 : Static85.anIntArray93[local103];
							local847 = Static215.anIntArrayArray23[local103];
							local385 = local189 == null ? 0 : Static10.anIntArray8[local103];
						} else {
							local847 = Static357.anIntArrayArray32[local103];
							local395 = local168 == null ? 0 : Static266.anIntArray262[local103];
							local851 = Static329.anIntArrayArray34[local103];
							local385 = local189 == null ? 0 : Static307.anIntArray306[local103];
							local829 = Static205.anIntArrayArray19[local103];
							local843 = Static530.anIntArrayArray50[local103];
						}
						@Pc(932) int local932 = local385 + local395;
						if (local932 <= 0) {
							Static408.method5841(arg5, local39, local59);
						} else {
							if (local97[0]) {
								local932++;
							}
							if (local97[2]) {
								local932++;
							}
							if (local97[1]) {
								local932++;
							}
							if (local97[3]) {
								local932++;
							}
							@Pc(965) int local965 = 0;
							@Pc(967) int local967 = 0;
							@Pc(971) int local971 = local932 * 3;
							@Pc(978) int[] local978 = local514 ? new int[local971] : null;
							@Pc(981) int[] local981 = new int[local971];
							@Pc(984) int[] local984 = new int[local971];
							@Pc(987) int[] local987 = new int[local971];
							@Pc(990) int[] local990 = new int[local971];
							@Pc(993) int[] local993 = new int[local971];
							@Pc(1000) int[] local1000 = arg0 == null ? null : new int[local971];
							@Pc(1009) int[] local1009 = arg0 == null && arg1 == null ? null : new int[local971];
							@Pc(1011) int local1011 = -1;
							@Pc(1013) int local1013 = -1;
							@Pc(1015) int local1015 = 256;
							@Pc(1115) byte local1115;
							@Pc(1031) int local1031;
							@Pc(1033) int local1033;
							@Pc(1265) int local1265;
							@Pc(1271) int local1271;
							@Pc(1279) int local1279;
							@Pc(1284) int local1284;
							@Pc(1296) int local1296;
							@Pc(1289) int local1289;
							@Pc(1301) int local1301;
							@Pc(1358) int local1358;
							@Pc(1365) int local1365;
							if (local168 != null) {
								local1015 = local168.anInt1020;
								local1011 = local168.anInt1021;
								local1013 = local168.anInt1014;
								local1031 = Static267.method3975(local168, arg3);
								for (local1033 = 0; local1033 < local395; local1033++) {
									if (local97[-local109 & 0x3] && local829[0] == local965) {
										Static94.anIntArray98[0] = local843[local965];
										Static94.anIntArray98[1] = 1;
										Static94.anIntArray98[2] = local847[local965];
										Static94.anIntArray98[3] = 1;
										Static94.anIntArray98[4] = local851[local965];
										local1115 = 6;
										Static94.anIntArray98[5] = local847[local965];
									} else if (local97[2 - local109 & 0x3] && local829[2] == local965) {
										Static94.anIntArray98[0] = local843[local965];
										Static94.anIntArray98[1] = 5;
										Static94.anIntArray98[2] = local847[local965];
										Static94.anIntArray98[3] = 5;
										Static94.anIntArray98[4] = local851[local965];
										local1115 = 6;
										Static94.anIntArray98[5] = local847[local965];
									} else if (local97[1 - local109 & 0x3] && local829[1] == local965) {
										Static94.anIntArray98[0] = local843[local965];
										Static94.anIntArray98[1] = 3;
										Static94.anIntArray98[2] = local847[local965];
										Static94.anIntArray98[3] = 3;
										Static94.anIntArray98[4] = local851[local965];
										Static94.anIntArray98[5] = local847[local965];
										local1115 = 6;
									} else if (local97[3 - local109 & 0x3] && local965 == local829[3]) {
										Static94.anIntArray98[0] = local843[local965];
										Static94.anIntArray98[1] = 7;
										Static94.anIntArray98[2] = local847[local965];
										Static94.anIntArray98[3] = 7;
										Static94.anIntArray98[4] = local851[local965];
										local1115 = 6;
										Static94.anIntArray98[5] = local847[local965];
									} else {
										Static94.anIntArray98[0] = local843[local965];
										Static94.anIntArray98[1] = local851[local965];
										Static94.anIntArray98[2] = local847[local965];
										local1115 = 3;
									}
									local965++;
									for (local1265 = 0; local1265 < local1115; local1265++) {
										local1271 = Static94.anIntArray98[local1265];
										local1279 = local1271 - local109 * 2 & 0x7;
										local1284 = this.anIntArray629[local1271];
										local1289 = this.anIntArray628[local1271];
										if (local109 == 1) {
											local1296 = local1289;
											local1301 = 512 - local1284;
										} else if (local109 == 2) {
											local1301 = 512 - local1289;
											local1296 = 512 - local1284;
										} else if (local109 == 3) {
											local1301 = local1284;
											local1296 = 512 - local1289;
										} else {
											local1296 = local1284;
											local1301 = local1289;
										}
										local981[local967] = local1296;
										local984[local967] = local1301;
										if (local1000 != null && Static284.aBooleanArrayArray6[local103][local1271]) {
											local1358 = (local39 << 9) + local1296;
											local1365 = (local59 << 9) + local1301;
											local1000[local967] = arg0.method7854(local1365, local1358) - arg4.method7854(local1365, local1358);
										}
										if (local1009 != null) {
											if (arg0 != null && !Static284.aBooleanArrayArray6[local103][local1271]) {
												local1358 = (local39 << 9) + local1296;
												local1365 = local1301 + (local59 << 9);
												local1009[local967] = arg4.method7854(local1365, local1358) - arg0.method7854(local1365, local1358);
											} else if (arg1 != null && !Static45.aBooleanArrayArray1[local103][local1271]) {
												local1358 = local1296 + (local39 << 9);
												local1365 = (local59 << 9) + local1301;
												local1009[local967] = arg1.method7854(local1365, local1358) - arg4.method7854(local1365, local1358);
											}
										}
										if (local1271 < 8 && Static540.anIntArray618[local1279] > local168.anInt1024) {
											if (local978 != null) {
												local978[local967] = Static260.anIntArray694[local1279];
											}
											local993[local967] = Static664.anIntArray706[local1279];
											local990[local967] = Static562.anIntArray627[local1279];
											local987[local967] = Static518.anIntArray258[local1279];
										} else {
											if (local978 != null) {
												local978[local967] = local1031;
											}
											local990[local967] = local168.anInt1014;
											local993[local967] = local168.anInt1020;
											local987[local967] = local1011;
										}
										local967++;
									}
								}
								if (!this.aBoolean682 && arg5 == 0) {
									Static584.method8081(local39, local59, local168.anInt1022, local168.anInt1027 * 8, local168.anInt1025);
								}
								if (local103 != 12 && local168.anInt1021 != -1 && local168.aBoolean51) {
									local92 = true;
								}
							} else if (local827) {
								local965 = Static197.anIntArray187[local103];
							} else if (local94) {
								local965 = Static85.anIntArray93[local103];
							} else {
								local965 = Static266.anIntArray262[local103];
							}
							if (local189 != null) {
								if (local133 == 0) {
									local133 = local125;
								}
								if (local141 == 0) {
									local141 = local125;
								}
								if (local149 == 0) {
									local149 = local125;
								}
								@Pc(1608) Class278 local1608 = this.aClass391_8.method9095(local125 - 1);
								@Pc(1616) Class278 local1616 = this.aClass391_8.method9095(local133 - 1);
								@Pc(1624) Class278 local1624 = this.aClass391_8.method9095(local141 - 1);
								@Pc(1632) Class278 local1632 = this.aClass391_8.method9095(local149 - 1);
								for (local1279 = 0; local1279 < local385; local1279++) {
									if (local97[-local109 & 0x3] && local829[0] == local965) {
										Static94.anIntArray98[0] = local843[local965];
										Static94.anIntArray98[1] = 1;
										Static94.anIntArray98[2] = local847[local965];
										Static94.anIntArray98[3] = 1;
										Static94.anIntArray98[4] = local851[local965];
										Static94.anIntArray98[5] = local847[local965];
										local1115 = 6;
									} else if (local97[2 - local109 & 0x3] && local965 == local829[2]) {
										Static94.anIntArray98[0] = local843[local965];
										Static94.anIntArray98[1] = 5;
										Static94.anIntArray98[2] = local847[local965];
										Static94.anIntArray98[3] = 5;
										Static94.anIntArray98[4] = local851[local965];
										local1115 = 6;
										Static94.anIntArray98[5] = local847[local965];
									} else if (local97[1 - local109 & 0x3] && local965 == local829[1]) {
										Static94.anIntArray98[0] = local843[local965];
										Static94.anIntArray98[1] = 3;
										Static94.anIntArray98[2] = local847[local965];
										Static94.anIntArray98[3] = 3;
										Static94.anIntArray98[4] = local851[local965];
										local1115 = 6;
										Static94.anIntArray98[5] = local847[local965];
									} else if (local97[3 - local109 & 0x3] && local829[3] == local965) {
										Static94.anIntArray98[0] = local843[local965];
										Static94.anIntArray98[1] = 7;
										Static94.anIntArray98[2] = local847[local965];
										Static94.anIntArray98[3] = 7;
										Static94.anIntArray98[4] = local851[local965];
										local1115 = 6;
										Static94.anIntArray98[5] = local847[local965];
									} else {
										Static94.anIntArray98[0] = local843[local965];
										Static94.anIntArray98[1] = local851[local965];
										local1115 = 3;
										Static94.anIntArray98[2] = local847[local965];
									}
									local965++;
									for (local1284 = 0; local1284 < local1115; local1284++) {
										local1296 = Static94.anIntArray98[local1284];
										local1289 = local1296 - local109 * 2 & 0x7;
										local1301 = this.anIntArray629[local1296];
										local1365 = this.anIntArray628[local1296];
										@Pc(1904) int local1904;
										if (local109 == 1) {
											local1904 = 512 - local1301;
											local1358 = local1365;
										} else if (local109 == 2) {
											local1358 = 512 - local1301;
											local1904 = 512 - local1365;
										} else if (local109 == 3) {
											local1904 = local1301;
											local1358 = 512 - local1365;
										} else {
											local1358 = local1301;
											local1904 = local1365;
										}
										local981[local967] = local1358;
										local984[local967] = local1904;
										@Pc(1963) int local1963;
										@Pc(1969) int local1969;
										if (local1000 != null && Static284.aBooleanArrayArray6[local103][local1296]) {
											local1963 = (local39 << 9) + local1358;
											local1969 = (local59 << 9) + local1904;
											local1000[local967] = arg0.method7854(local1969, local1963) - arg4.method7854(local1969, local1963);
										}
										if (local1009 != null) {
											if (arg0 != null && !Static284.aBooleanArrayArray6[local103][local1296]) {
												local1963 = (local39 << 9) + local1358;
												local1969 = local1904 + (local59 << 9);
												local1009[local967] = arg4.method7854(local1969, local1963) - arg0.method7854(local1969, local1963);
											} else if (arg1 != null && !Static45.aBooleanArrayArray1[local103][local1296]) {
												local1963 = (local39 << 9) + local1358;
												local1969 = local1904 + (local59 << 9);
												local1009[local967] = arg1.method7854(local1969, local1963) - arg4.method7854(local1969, local1963);
											}
										}
										if (local1296 < 8 && Static540.anIntArray618[local1289] >= 0) {
											if (local978 != null) {
												local978[local967] = Static260.anIntArray694[local1289];
											}
											local993[local967] = Static664.anIntArray706[local1289];
											local990[local967] = Static562.anIntArray627[local1289];
											local987[local967] = Static518.anIntArray258[local1289];
										} else {
											if (local94 && Static284.aBooleanArrayArray6[local103][local1296]) {
												local990[local967] = local1013;
												local993[local967] = local1015;
												local987[local967] = local1011;
											} else if (local1358 == 0 && local1904 == 0) {
												local987[local967] = arg2[local39][local59];
												local990[local967] = local1608.anInt8020;
												local993[local967] = local1608.anInt8019;
											} else if (local1358 == 0 && local1904 == 512) {
												local987[local967] = arg2[local39][local77];
												local990[local967] = local1616.anInt8020;
												local993[local967] = local1616.anInt8019;
											} else if (local1358 == 512 && local1904 == 512) {
												local987[local967] = arg2[local57][local77];
												local990[local967] = local1624.anInt8020;
												local993[local967] = local1624.anInt8019;
											} else if (local1358 == 512 && local1904 == 0) {
												local987[local967] = arg2[local57][local59];
												local990[local967] = local1632.anInt8020;
												local993[local967] = local1632.anInt8019;
											} else {
												if (local1358 >= 256) {
													if (local1904 < 256) {
														local990[local967] = local1632.anInt8020;
														local993[local967] = local1632.anInt8019;
													} else {
														local990[local967] = local1624.anInt8020;
														local993[local967] = local1624.anInt8019;
													}
												} else if (local1904 >= 256) {
													local990[local967] = local1616.anInt8020;
													local993[local967] = local1616.anInt8019;
												} else {
													local990[local967] = local1608.anInt8020;
													local993[local967] = local1608.anInt8019;
												}
												local1963 = Static391.method5571(arg2[local39][local59], arg2[local57][local59], local1358 << 7 >> 9);
												local1969 = Static391.method5571(arg2[local39][local77], arg2[local57][local77], local1358 << 7 >> 9);
												local987[local967] = Static391.method5571(local1963, local1969, local1904 << 7 >> 9);
											}
											if (local978 != null) {
												local978[local967] = local987[local967];
											}
										}
										local967++;
									}
								}
								if (local103 != 0 && local189.aBoolean554) {
									local92 = true;
								}
							}
							local1031 = arg4.method7846(local39, local59);
							local1033 = arg4.method7846(local57, local59);
							local1265 = arg4.method7846(local57, local77);
							local1271 = arg4.method7846(local39, local77);
							@Pc(2384) boolean local2384 = Static250.method3635(local39, local59);
							if (local2384 && arg5 > 1 || !local2384 && arg5 > 0) {
								@Pc(2397) boolean local2397 = true;
								if (local189 != null && !local189.aBoolean553) {
									local2397 = false;
								} else if (local125 == 0 && local103 != 0) {
									local2397 = false;
								} else if (local117 > 0 && local191 != null && !local191.aBoolean50) {
									local2397 = false;
								}
								if (local2397 && local1033 == local1031 && local1265 == local1031 && local1031 == local1271) {
									this.aByteArrayArrayArray16[arg5][local39][local59] = (byte) (this.aByteArrayArrayArray16[arg5][local39][local59] | 0x4);
								}
							}
							local1284 = 0;
							local1296 = 0;
							local1289 = 0;
							if (this.aBoolean682) {
								local1284 = Static358.method5186(local39, local59);
								local1296 = Static23.method584(local39, local59);
								local1289 = Static524.method7855(local39, local59);
							}
							arg4.U(local39, local59, local981, local1000, local984, local1009, local987, local978, local990, local993, local1284, local1296, local1289, local92);
							Static408.method5841(arg5, local39, local59);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(BIIIII)V")
	public final void method7918(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = arg2; local3 < arg1 + arg2; local3++) {
			for (local7 = arg0; local7 < arg3 + arg0; local7++) {
				if (local7 >= 0 && this.anInt9390 > local7 && local3 >= 0 && local3 < this.anInt9395) {
					this.anIntArrayArrayArray20[arg4][local7][local3] = arg4 <= 0 ? 0 : this.anIntArrayArrayArray20[arg4 - 1][local7][local3] - 960;
				}
			}
		}
		if (arg0 > 0 && arg0 < this.anInt9390) {
			for (local7 = arg2 + 1; local7 < arg2 + arg1; local7++) {
				if (local7 >= 0 && local7 < this.anInt9395) {
					this.anIntArrayArrayArray20[arg4][arg0][local7] = this.anIntArrayArrayArray20[arg4][arg0 - 1][local7];
				}
			}
		}
		if (arg2 > 0 && arg2 < this.anInt9395) {
			for (local7 = arg0 + 1; local7 < arg3 + arg0; local7++) {
				if (local7 >= 0 && this.anInt9390 > local7) {
					this.anIntArrayArrayArray20[arg4][local7][arg2] = this.anIntArrayArrayArray20[arg4][local7][arg2 - 1];
				}
			}
		}
		if (arg0 < 0 || arg2 < 0 || arg0 >= this.anInt9390 || this.anInt9395 <= arg2) {
			return;
		}
		if (arg4 == 0) {
			if (arg0 > 0 && this.anIntArrayArrayArray20[arg4][arg0 - 1][arg2] != 0) {
				this.anIntArrayArrayArray20[arg4][arg0][arg2] = this.anIntArrayArrayArray20[arg4][arg0 - 1][arg2];
			} else if (arg2 > 0 && this.anIntArrayArrayArray20[arg4][arg0][arg2 - 1] != 0) {
				this.anIntArrayArrayArray20[arg4][arg0][arg2] = this.anIntArrayArrayArray20[arg4][arg0][arg2 - 1];
			} else if (arg0 > 0 && arg2 > 0 && this.anIntArrayArrayArray20[arg4][arg0 - 1][arg2 - 1] != 0) {
				this.anIntArrayArrayArray20[arg4][arg0][arg2] = this.anIntArrayArrayArray20[arg4][arg0 - 1][arg2 - 1];
			}
		} else if (arg0 > 0 && this.anIntArrayArrayArray20[arg4 - 1][arg0 - 1][arg2] != this.anIntArrayArrayArray20[arg4][arg0 - 1][arg2]) {
			this.anIntArrayArrayArray20[arg4][arg0][arg2] = this.anIntArrayArrayArray20[arg4][arg0 - 1][arg2];
		} else if (arg2 > 0 && this.anIntArrayArrayArray20[arg4 - 1][arg0][arg2 - 1] != this.anIntArrayArrayArray20[arg4][arg0][arg2 - 1]) {
			this.anIntArrayArrayArray20[arg4][arg0][arg2] = this.anIntArrayArrayArray20[arg4][arg0][arg2 - 1];
		} else if (arg0 > 0 && arg2 > 0 && this.anIntArrayArrayArray20[arg4][arg0 - 1][arg2 - 1] != this.anIntArrayArrayArray20[arg4 - 1][arg0 - 1][arg2 - 1]) {
			this.anIntArrayArrayArray20[arg4][arg0][arg2] = this.anIntArrayArrayArray20[arg4][arg0 - 1][arg2 - 1];
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!s;BLclient!s;Lclient!ha;)V")
	public final void method7919(@OriginalArg(0) Class12 arg0, @OriginalArg(2) Class12 arg1, @OriginalArg(3) Class132 arg2) {
		if (Static554.anIntArray624 == null || this.anInt9395 != Static554.anIntArray624.length) {
			Static115.anIntArray123 = new int[this.anInt9395];
			Static217.anIntArray209 = new int[this.anInt9395];
			Static220.anIntArray211 = new int[this.anInt9395];
			Static93.anIntArray460 = new int[this.anInt9395];
			Static554.anIntArray624 = new int[this.anInt9395];
		}
		@Pc(42) int[][] local42 = new int[this.anInt9390][this.anInt9395];
		@Pc(48) int local48;
		for (@Pc(44) int local44 = 0; local44 < this.anInt9399; local44++) {
			for (local48 = 0; local48 < this.anInt9395; local48++) {
				Static554.anIntArray624[local48] = 0;
				Static220.anIntArray211[local48] = 0;
				Static93.anIntArray460[local48] = 0;
				Static115.anIntArray123[local48] = 0;
				Static217.anIntArray209[local48] = 0;
			}
			for (@Pc(77) int local77 = -5; local77 < this.anInt9390; local77++) {
				@Pc(87) int local87;
				@Pc(102) int local102;
				@Pc(171) int local171;
				for (@Pc(81) int local81 = 0; local81 < this.anInt9395; local81++) {
					local87 = local77 + 5;
					@Pc(148) int local148;
					if (this.anInt9390 > local87) {
						local102 = this.aByteArrayArrayArray13[local44][local87][local81] & 0xFF;
						if (local102 > 0) {
							@Pc(112) Class278 local112 = this.aClass391_8.method9095(local102 - 1);
							Static554.anIntArray624[local81] += local112.anInt8028;
							Static220.anIntArray211[local81] += local112.anInt8023;
							Static93.anIntArray460[local81] += local112.anInt8026;
							Static115.anIntArray123[local81] += local112.anInt8018;
							local148 = Static217.anIntArray209[local81]++;
						}
					}
					local102 = local77 - 5;
					if (local102 >= 0) {
						local171 = this.aByteArrayArrayArray13[local44][local102][local81] & 0xFF;
						if (local171 > 0) {
							@Pc(186) Class278 local186 = this.aClass391_8.method9095(local171 - 1);
							Static554.anIntArray624[local81] -= local186.anInt8028;
							Static220.anIntArray211[local81] -= local186.anInt8023;
							Static93.anIntArray460[local81] -= local186.anInt8026;
							Static115.anIntArray123[local81] -= local186.anInt8018;
							local148 = Static217.anIntArray209[local81]--;
						}
					}
				}
				if (local77 >= 0) {
					local87 = 0;
					local102 = 0;
					local171 = 0;
					@Pc(247) int local247 = 0;
					@Pc(249) int local249 = 0;
					for (@Pc(251) int local251 = -5; local251 < this.anInt9395; local251++) {
						@Pc(257) int local257 = local251 + 5;
						if (local257 < this.anInt9395) {
							local249 += Static217.anIntArray209[local257];
							local247 += Static115.anIntArray123[local257];
							local87 += Static554.anIntArray624[local257];
							local171 += Static93.anIntArray460[local257];
							local102 += Static220.anIntArray211[local257];
						}
						@Pc(299) int local299 = local251 - 5;
						if (local299 >= 0) {
							local249 -= Static217.anIntArray209[local299];
							local247 -= Static115.anIntArray123[local299];
							local171 -= Static93.anIntArray460[local299];
							local87 -= Static554.anIntArray624[local299];
							local102 -= Static220.anIntArray211[local299];
						}
						if (local251 >= 0 && local247 > 0 && local249 > 0) {
							local42[local77][local251] = Static63.method8739(local102 / local249, local87 * 256 / local247, local171 / local249);
						}
					}
				}
			}
			if (Static588.aBoolean688) {
				this.method7917(local44 == 0 ? arg1 : null, local44 == 0 ? arg0 : null, local42, arg2, Static289.aClass12Array3[local44], local44);
			} else {
				this.method7921(Static289.aClass12Array3[local44], local42, local44, local44 == 0 ? arg1 : null, local44 == 0 ? arg0 : null, arg2);
			}
			this.aByteArrayArrayArray13[local44] = null;
			this.aByteArrayArrayArray14[local44] = null;
			this.aByteArrayArrayArray17[local44] = null;
			this.aByteArrayArrayArray18[local44] = null;
		}
		if (!this.aBoolean682) {
			if (Static306.anInt5215 != 0) {
				Static340.method4997();
			}
			if (Static513.aBoolean591) {
				Static55.method3552();
			}
		}
		for (local48 = 0; local48 < this.anInt9399; local48++) {
			Static289.aClass12Array3[local48].YA();
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!pv;[[BLclient!ha;I[ZIII[[BLclient!bja;I[[BII)V")
	private void method7920(@OriginalArg(0) Class278 arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) Class132 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) Class38 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(18) boolean[] local18 = arg8 != null && arg8.aBoolean52 ? Static120.aBooleanArrayArray2[arg11] : Static265.aBooleanArrayArray5[arg11];
		@Pc(37) int local37;
		@Pc(50) Class38 local50;
		@Pc(68) byte local68;
		@Pc(84) int local84;
		@Pc(91) int local91;
		if (arg3 > 0) {
			if (arg5 > 0) {
				local37 = arg7[arg5 - 1][arg3 - 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass375_9.method8746(local37 - 1);
					if (local50.anInt1021 != -1 && local50.aBoolean52) {
						local68 = arg1[arg5 - 1][arg3 - 1];
						local84 = arg10[arg5 - 1][arg3 - 1] * 2 + 4 & 0x7;
						local91 = Static267.method3975(local50, arg2);
						if (Static284.aBooleanArrayArray6[local68][local84]) {
							Static518.anIntArray258[0] = local50.anInt1021;
							Static260.anIntArray694[0] = local91;
							Static562.anIntArray627[0] = local50.anInt1014;
							Static664.anIntArray706[0] = local50.anInt1020;
							Static540.anIntArray618[0] = local50.anInt1024;
							Static181.anIntArray177[0] = 256;
						}
					}
				}
			}
			if (arg5 < arg12 - 1) {
				local37 = arg7[arg5 + 1][arg3 - 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass375_9.method8746(local37 - 1);
					if (local50.anInt1021 != -1 && local50.aBoolean52) {
						local68 = arg1[arg5 + 1][arg3 - 1];
						local84 = arg10[arg5 + 1][arg3 - 1] * 2 + 6 & 0x7;
						local91 = Static267.method3975(local50, arg2);
						if (Static284.aBooleanArrayArray6[local68][local84]) {
							Static518.anIntArray258[2] = local50.anInt1021;
							Static260.anIntArray694[2] = local91;
							Static562.anIntArray627[2] = local50.anInt1014;
							Static664.anIntArray706[2] = local50.anInt1020;
							Static540.anIntArray618[2] = local50.anInt1024;
							Static181.anIntArray177[2] = 512;
						}
					}
				}
			}
		}
		if (arg9 - 1 > arg3) {
			if (arg5 > 0) {
				local37 = arg7[arg5 - 1][arg3 + 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass375_9.method8746(local37 - 1);
					if (local50.anInt1021 != -1 && local50.aBoolean52) {
						local68 = arg1[arg5 - 1][arg3 + 1];
						local84 = arg10[arg5 - 1][arg3 + 1] * 2 + 2 & 0x7;
						local91 = Static267.method3975(local50, arg2);
						if (Static284.aBooleanArrayArray6[local68][local84]) {
							Static518.anIntArray258[6] = local50.anInt1021;
							Static260.anIntArray694[6] = local91;
							Static562.anIntArray627[6] = local50.anInt1014;
							Static664.anIntArray706[6] = local50.anInt1020;
							Static540.anIntArray618[6] = local50.anInt1024;
							Static181.anIntArray177[6] = 64;
						}
					}
				}
			}
			if (arg12 - 1 > arg5) {
				local37 = arg7[arg5 + 1][arg3 + 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass375_9.method8746(local37 - 1);
					if (local50.anInt1021 != -1 && local50.aBoolean52) {
						local68 = arg1[arg5 + 1][arg3 + 1];
						local84 = arg10[arg5 + 1][arg3 + 1] * 2 & 0x7;
						local91 = Static267.method3975(local50, arg2);
						if (Static284.aBooleanArrayArray6[local68][local84]) {
							Static518.anIntArray258[4] = local50.anInt1021;
							Static260.anIntArray694[4] = local91;
							Static562.anIntArray627[4] = local50.anInt1014;
							Static664.anIntArray706[4] = local50.anInt1020;
							Static540.anIntArray618[4] = local50.anInt1024;
							Static181.anIntArray177[4] = 128;
						}
					}
				}
			}
		}
		@Pc(484) int local484;
		@Pc(489) int local489;
		@Pc(491) int local491;
		@Pc(473) byte local473;
		if (arg3 > 0) {
			local37 = arg7[arg5][arg3 - 1] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass375_9.method8746(local37 - 1);
				if (local50.anInt1021 != -1) {
					local68 = arg1[arg5][arg3 - 1];
					local473 = arg10[arg5][arg3 - 1];
					if (local50.aBoolean52) {
						local91 = 2;
						local484 = local473 * 2 + 4;
						local489 = Static267.method3975(local50, arg2);
						for (local491 = 0; local491 < 3; local491++) {
							local91 &= 0x7;
							local484 &= 0x7;
							if (Static284.aBooleanArrayArray6[local68][local484] && local50.anInt1024 >= Static540.anIntArray618[local91]) {
								Static518.anIntArray258[local91] = local50.anInt1021;
								Static260.anIntArray694[local91] = local489;
								Static562.anIntArray627[local91] = local50.anInt1014;
								Static664.anIntArray706[local91] = local50.anInt1020;
								if (local50.anInt1024 == Static540.anIntArray618[local91]) {
									Static181.anIntArray177[local91] |= 0x20;
								} else {
									Static181.anIntArray177[local91] = 32;
								}
								Static540.anIntArray618[local91] = local50.anInt1024;
							}
							local91--;
							local484++;
						}
						if (!local18[arg6 & 0x3]) {
							arg4[0] = Static120.aBooleanArrayArray2[local68][local473 + 2 & 0x3];
						}
					} else if (!local18[arg6 & 0x3]) {
						arg4[0] = Static265.aBooleanArrayArray5[local68][local473 + 2 & 0x3];
					}
				}
			}
		}
		if (arg9 - 1 > arg3) {
			local37 = arg7[arg5][arg3 + 1] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass375_9.method8746(local37 - 1);
				if (local50.anInt1021 != -1) {
					local68 = arg1[arg5][arg3 + 1];
					local473 = arg10[arg5][arg3 + 1];
					if (local50.aBoolean52) {
						local91 = 4;
						local484 = local473 * 2 + 2;
						local489 = Static267.method3975(local50, arg2);
						for (local491 = 0; local491 < 3; local491++) {
							local91 &= 0x7;
							local484 &= 0x7;
							if (Static284.aBooleanArrayArray6[local68][local484] && local50.anInt1024 >= Static540.anIntArray618[local91]) {
								Static518.anIntArray258[local91] = local50.anInt1021;
								Static260.anIntArray694[local91] = local489;
								Static562.anIntArray627[local91] = local50.anInt1014;
								Static664.anIntArray706[local91] = local50.anInt1020;
								if (local50.anInt1024 == Static540.anIntArray618[local91]) {
									Static181.anIntArray177[local91] |= 0x10;
								} else {
									Static181.anIntArray177[local91] = 16;
								}
								Static540.anIntArray618[local91] = local50.anInt1024;
							}
							local484--;
							local91++;
						}
						if (!local18[arg6 + 2 & 0x3]) {
							arg4[2] = Static120.aBooleanArrayArray2[local68][local473 & 0x3];
						}
					} else if (!local18[arg6 + 2 & 0x3]) {
						arg4[2] = Static265.aBooleanArrayArray5[local68][local473 & 0x3];
					}
				}
			}
		}
		if (arg5 > 0) {
			local37 = arg7[arg5 - 1][arg3] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass375_9.method8746(local37 - 1);
				if (local50.anInt1021 != -1) {
					local68 = arg1[arg5 - 1][arg3];
					local473 = arg10[arg5 - 1][arg3];
					if (local50.aBoolean52) {
						local91 = 6;
						local484 = local473 * 2 + 4;
						local489 = Static267.method3975(local50, arg2);
						for (local491 = 0; local491 < 3; local491++) {
							local91 &= 0x7;
							local484 &= 0x7;
							if (Static284.aBooleanArrayArray6[local68][local484] && local50.anInt1024 >= Static540.anIntArray618[local91]) {
								Static518.anIntArray258[local91] = local50.anInt1021;
								Static260.anIntArray694[local91] = local489;
								Static562.anIntArray627[local91] = local50.anInt1014;
								Static664.anIntArray706[local91] = local50.anInt1020;
								if (Static540.anIntArray618[local91] == local50.anInt1024) {
									Static181.anIntArray177[local91] |= 0x8;
								} else {
									Static181.anIntArray177[local91] = 8;
								}
								Static540.anIntArray618[local91] = local50.anInt1024;
							}
							local91++;
							local484--;
						}
						if (!local18[arg6 + 3 & 0x3]) {
							arg4[3] = Static120.aBooleanArrayArray2[local68][local473 + 1 & 0x3];
						}
					} else if (!local18[arg6 + 3 & 0x3]) {
						arg4[3] = Static265.aBooleanArrayArray5[local68][local473 + 1 & 0x3];
					}
				}
			}
		}
		if (arg5 < arg12 - 1) {
			local37 = arg7[arg5 + 1][arg3] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass375_9.method8746(local37 - 1);
				if (local50.anInt1021 != -1) {
					local68 = arg1[arg5 + 1][arg3];
					local473 = arg10[arg5 + 1][arg3];
					if (local50.aBoolean52) {
						local91 = 4;
						local484 = local473 * 2 + 6;
						local489 = Static267.method3975(local50, arg2);
						for (local491 = 0; local491 < 3; local491++) {
							local91 &= 0x7;
							local484 &= 0x7;
							if (Static284.aBooleanArrayArray6[local68][local484] && local50.anInt1024 >= Static540.anIntArray618[local91]) {
								Static518.anIntArray258[local91] = local50.anInt1021;
								Static260.anIntArray694[local91] = local489;
								Static562.anIntArray627[local91] = local50.anInt1014;
								Static664.anIntArray706[local91] = local50.anInt1020;
								if (Static540.anIntArray618[local91] == local50.anInt1024) {
									Static181.anIntArray177[local91] |= 0x4;
								} else {
									Static181.anIntArray177[local91] = 4;
								}
								Static540.anIntArray618[local91] = local50.anInt1024;
							}
							local91--;
							local484++;
						}
						if (!local18[arg6 + 1 & 0x3]) {
							arg4[1] = Static120.aBooleanArrayArray2[local68][local473 + 3 & 0x3];
						}
					} else if (!local18[arg6 + 1 & 0x3]) {
						arg4[1] = Static265.aBooleanArrayArray5[local68][local473 + 3 & 0x3];
					}
				}
			}
		}
		if (arg8 == null) {
			return;
		}
		local37 = Static267.method3975(arg8, arg2);
		if (!arg8.aBoolean52) {
			return;
		}
		for (@Pc(1181) int local1181 = 0; local1181 < 8; local1181++) {
			@Pc(1192) int local1192 = local1181 - arg6 * 2 & 0x7;
			if (Static284.aBooleanArrayArray6[arg11][local1181] && arg8.anInt1024 >= Static540.anIntArray618[local1192]) {
				Static518.anIntArray258[local1192] = arg8.anInt1021;
				Static260.anIntArray694[local1192] = local37;
				Static562.anIntArray627[local1192] = arg8.anInt1014;
				Static664.anIntArray706[local1192] = arg8.anInt1020;
				if (Static540.anIntArray618[local1192] == arg8.anInt1024) {
					Static181.anIntArray177[local1192] |= 0x2;
				} else {
					Static181.anIntArray177[local1192] = 2;
				}
				Static540.anIntArray618[local1192] = arg8.anInt1024;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!s;I[[IILclient!s;Lclient!s;Lclient!ha;)V")
	private void method7921(@OriginalArg(0) Class12 arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class12 arg3, @OriginalArg(5) Class12 arg4, @OriginalArg(6) Class132 arg5) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9390; local7++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt9395; local16++) {
				if (Static220.anInt3743 == -1 || Static369.method5324(arg2, Static220.anInt3743, local16, local7)) {
					@Pc(39) byte local39 = this.aByteArrayArrayArray17[arg2][local7][local16];
					@Pc(48) byte local48 = this.aByteArrayArrayArray18[arg2][local7][local16];
					@Pc(59) int local59 = this.aByteArrayArrayArray14[arg2][local7][local16] & 0xFF;
					@Pc(70) int local70 = this.aByteArrayArrayArray13[arg2][local7][local16] & 0xFF;
					@Pc(82) Class38 local82 = local59 == 0 ? null : this.aClass375_9.method8746(local59 - 1);
					if (local39 == 0 && local82 == null) {
						local39 = 12;
					}
					@Pc(108) Class278 local108 = local70 == 0 ? null : this.aClass391_8.method9095(local70 - 1);
					@Pc(110) Class38 local110 = local82;
					if (local82 != null && local82.anInt1021 == -1 && local82.anInt1023 == -1) {
						local110 = local82;
						local82 = null;
					}
					if (local82 != null || local108 != null) {
						@Pc(132) int local132 = Static51.anIntArray61[local39];
						@Pc(136) int local136 = Static197.anIntArray187[local39];
						@Pc(148) int local148 = (local108 == null ? 0 : local132) + (local82 == null ? 0 : local136);
						@Pc(150) int local150 = 0;
						@Pc(152) int local152 = 0;
						@Pc(159) int local159 = local82 == null ? -1 : local82.anInt1014;
						@Pc(166) int local166 = local108 == null ? -1 : local108.anInt8020;
						@Pc(169) int[] local169 = new int[local148];
						@Pc(172) int[] local172 = new int[local148];
						@Pc(175) int[] local175 = new int[local148];
						@Pc(178) int[] local178 = new int[local148];
						@Pc(181) int[] local181 = new int[local148];
						@Pc(184) int[] local184 = new int[local148];
						@Pc(196) int[] local196 = local82 == null || local82.anInt1023 == -1 ? null : new int[local148];
						@Pc(200) int local200;
						if (local82 == null) {
							local152 = local136;
						} else {
							for (local200 = 0; local200 < local136; local200++) {
								local169[local150] = Static570.anIntArrayArray54[local39][local152];
								local172[local150] = Static194.anIntArrayArray17[local39][local152];
								local175[local150] = Static64.anIntArrayArray5[local39][local152];
								local181[local150] = local159;
								local184[local150] = local82.anInt1020;
								local178[local150] = local82.anInt1021;
								if (local196 != null) {
									local196[local150] = local82.anInt1023;
								}
								local152++;
								local150++;
							}
							if (!this.aBoolean682 && arg2 == 0) {
								Static584.method8081(local7, local16, local82.anInt1022, local82.anInt1027 * 8, local82.anInt1025);
							}
						}
						if (local108 != null) {
							for (local200 = 0; local200 < local132; local200++) {
								local169[local150] = Static570.anIntArrayArray54[local39][local152];
								local172[local150] = Static194.anIntArrayArray17[local39][local152];
								local175[local150] = Static64.anIntArrayArray5[local39][local152];
								local181[local150] = local166;
								local184[local150] = local108.anInt8019;
								local178[local150] = arg1[local7][local16];
								if (local196 != null) {
									local196[local150] = local178[local150];
								}
								local152++;
								local150++;
							}
						}
						local200 = this.anIntArray629.length;
						@Pc(350) int[] local350 = new int[local200];
						@Pc(353) int[] local353 = new int[local200];
						@Pc(360) int[] local360 = arg3 == null ? null : new int[local200];
						@Pc(369) int[] local369 = arg3 == null && arg4 == null ? null : new int[local200];
						@Pc(378) int local378;
						@Pc(383) int local383;
						@Pc(466) int local466;
						@Pc(474) int local474;
						for (@Pc(371) int local371 = 0; local371 < local200; local371++) {
							local378 = this.anIntArray629[local371];
							local383 = this.anIntArray628[local371];
							if (local48 == 0) {
								local350[local371] = local378;
								local353[local371] = local383;
							} else if (local48 == 1) {
								local350[local371] = local383;
								local353[local371] = 512 - local378;
							} else if (local48 == 2) {
								local350[local371] = 512 - local378;
								local353[local371] = 512 - local383;
							} else if (local48 == 3) {
								local350[local371] = 512 - local383;
								local353[local371] = local378;
							}
							if (local360 != null && Static284.aBooleanArrayArray6[local39][local371]) {
								local466 = local350[local371] + (local7 << 9);
								local474 = local353[local371] + (local16 << 9);
								local360[local371] = arg3.method7854(local474, local466) - arg0.method7854(local474, local466);
							}
							if (local369 != null) {
								if (arg3 != null && !Static284.aBooleanArrayArray6[local39][local371]) {
									local466 = local350[local371] + (local7 << 9);
									local474 = (local16 << 9) + local353[local371];
									local369[local371] = arg0.method7854(local474, local466) - arg3.method7854(local474, local466);
								} else if (arg4 != null && !Static45.aBooleanArrayArray1[local39][local371]) {
									local466 = local350[local371] + (local7 << 9);
									local474 = (local16 << 9) + local353[local371];
									local369[local371] = arg4.method7854(local474, local466) - arg0.method7854(local474, local466);
								}
							}
						}
						local378 = arg0.method7846(local7, local16);
						local383 = arg0.method7846(local7 + 1, local16);
						local466 = arg0.method7846(local7 + 1, local16 - -1);
						local474 = arg0.method7846(local7, local16 + 1);
						@Pc(615) boolean local615 = Static250.method3635(local7, local16);
						if (local615 && arg2 > 1 || !local615 && arg2 > 0) {
							@Pc(631) boolean local631 = true;
							if (local108 != null && !local108.aBoolean553) {
								local631 = false;
							} else if (local70 == 0 && local39 != 0) {
								local631 = false;
							} else if (local59 > 0 && local110 != null && !local110.aBoolean50) {
								local631 = false;
							}
							if (local631 && local378 == local383 && local378 == local466 && local378 == local474) {
								this.aByteArrayArrayArray16[arg2][local7][local16] = (byte) (this.aByteArrayArrayArray16[arg2][local7][local16] | 0x4);
							}
						}
						@Pc(695) int local695 = 0;
						@Pc(697) int local697 = 0;
						@Pc(699) int local699 = 0;
						if (this.aBoolean682) {
							local695 = Static358.method5186(local7, local16);
							local697 = Static23.method584(local7, local16);
							local699 = Static524.method7855(local7, local16);
						}
						arg0.method7850(local7, local16, local350, local360, local353, local369, local169, local172, local175, local178, local196, local181, local184, local695, local697, local699);
						Static408.method5841(arg2, local7, local16);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!gga;IIIIIIZIII)V")
	private void method7922(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg9 == 1) {
			arg2 = 1;
		} else if (arg9 == 2) {
			arg2 = 1;
			arg8 = 1;
		} else if (arg9 == 3) {
			arg8 = 1;
		}
		@Pc(70) int local70;
		if (arg7 < 0 || arg7 >= this.anInt9390 || arg4 < 0 || arg4 >= this.anInt9395) {
			while (true) {
				local70 = arg0.method8374();
				if (local70 == 0) {
					return;
				}
				if (local70 == 1) {
					arg0.method8374();
					return;
				}
				if (local70 <= 49) {
					arg0.method8374();
				}
			}
			return;
		}
		if (!this.aBoolean682 && !arg6) {
			Static90.aByteArrayArrayArray2[arg3][arg7][arg4] = 0;
		}
		while (true) {
			local70 = arg0.method8374();
			if (local70 == 0) {
				if (this.aBoolean682) {
					this.anIntArrayArrayArray20[0][arg7 + arg8][arg4 + arg2] = 0;
					return;
				} else if (arg3 == 0) {
					this.anIntArrayArrayArray20[0][arg8 + arg7][arg4 + arg2] = -Static544.method7719(arg1 + 932731, arg5 + 556238) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray20[arg3][arg8 + arg7][arg2 + arg4] = this.anIntArrayArrayArray20[arg3 - 1][arg7 + arg8][arg4 + arg2] - 960;
					return;
				}
			}
			if (local70 == 1) {
				@Pc(159) int local159 = arg0.method8374();
				if (!this.aBoolean682) {
					if (local159 == 1) {
						local159 = 0;
					}
					if (arg3 == 0) {
						this.anIntArrayArrayArray20[0][arg7 + arg8][arg4 + arg2] = -local159 * 8 << 2;
						return;
					}
					this.anIntArrayArrayArray20[arg3][arg7 + arg8][arg4 + arg2] = this.anIntArrayArrayArray20[arg3 - 1][arg8 + arg7][arg4 + arg2] - (local159 * 8 << 2);
					return;
				}
				this.anIntArrayArrayArray20[0][arg7 + arg8][arg4 + arg2] = local159 * 8 << 2;
				return;
			}
			if (local70 <= 49) {
				if (arg6) {
					arg0.method8374();
				} else {
					this.aByteArrayArrayArray14[arg3][arg7][arg4] = arg0.method8391();
					this.aByteArrayArrayArray17[arg3][arg7][arg4] = (byte) ((local70 - 2) / 4);
					this.aByteArrayArrayArray18[arg3][arg7][arg4] = (byte) (arg9 + local70 - 2 & 0x3);
				}
			} else if (local70 <= 81) {
				if (!this.aBoolean682 && !arg6) {
					Static90.aByteArrayArrayArray2[arg3][arg7][arg4] = (byte) (local70 - 49);
				}
			} else if (!arg6) {
				this.aByteArrayArrayArray13[arg3][arg7][arg4] = (byte) (local70 - 81);
			}
		}
	}
}
