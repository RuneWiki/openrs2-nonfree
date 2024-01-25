import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class45 {

	@OriginalMember(owner = "client!da", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "Z")
	public boolean aBoolean93;

	@OriginalMember(owner = "client!da", name = "h", descriptor = "J")
	private long aLong44;

	@OriginalMember(owner = "client!da", name = "i", descriptor = "J")
	private long aLong45;

	@OriginalMember(owner = "client!da", name = "j", descriptor = "[I")
	public int[] anIntArray51;

	@OriginalMember(owner = "client!da", name = "m", descriptor = "I")
	private int anInt1121;

	@OriginalMember(owner = "client!da", name = "q", descriptor = "[I")
	private int[] anIntArray52;

	@OriginalMember(owner = "client!da", name = "f", descriptor = "I")
	public int anInt1117 = -1;

	static {
		new Class151("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BILclient!qa;IIILclient!ej;Lclient!tn;Lclient!rh;Lclient!nm;Lclient!jt;Lclient!bp;)Lclient!c;")
	public Class33 method973(@OriginalArg(2) Class128 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class65 arg4, @OriginalArg(7) Interface11 arg5, @OriginalArg(8) Class213 arg6, @OriginalArg(9) Class171 arg7, @OriginalArg(10) Class129 arg8, @OriginalArg(11) Class27 arg9) {
		if (this.anInt1117 != -1) {
			return arg9.method588(this.anInt1117).method5250(arg0, arg7, arg3, arg2, arg6, arg5, arg1);
		}
		@Pc(35) int local35 = 2048;
		@Pc(43) boolean local43;
		@Pc(56) int local56;
		@Pc(126) int local126;
		@Pc(66) int local66;
		if (arg7 != null) {
			@Pc(39) boolean local39 = false;
			@Pc(41) boolean local41 = false;
			local43 = false;
			@Pc(45) boolean local45 = false;
			local56 = arg7.anIntArray235[arg3];
			local35 = 2080;
			local66 = local56 >>> 16;
			@Pc(70) int local70 = local56 & 0xFFFF;
			@Pc(75) Class1_Sub3_Sub11 local75 = arg6.method4412(local66);
			if (local75 != null) {
				local41 = local75.method3068(local70) | false;
				local39 = local75.method3067(local70) | false;
				local45 = local75.method3070(local70) | false;
				local43 = arg7.aBoolean335 | false;
			}
			if ((arg7.aBoolean334 || Static240.aBoolean304) && arg1 != -1 && arg7.anIntArray235.length > arg1) {
				local126 = arg7.anIntArray235[arg1];
				@Pc(130) int local130 = local126 >>> 16;
				@Pc(140) Class1_Sub3_Sub11 local140 = local130 == local66 ? local75 : arg6.method4412(local130);
				@Pc(144) int local144 = local126 & 0xFFFF;
				if (local140 != null) {
					local41 |= local140.method3068(local144);
					local39 |= local140.method3067(local144);
					local45 |= local140.method3070(local144);
				}
			}
			if (local41) {
				local35 = 2208;
			}
			if (local39) {
				local35 |= 0x100;
			}
			if (local43) {
				local35 |= 0x200;
			}
			if (local45) {
				local35 |= 0x400;
			}
		}
		@Pc(193) Class167 local193 = Static43.aClass167_74;
		@Pc(202) Class33 local202;
		synchronized (Static43.aClass167_74) {
			local202 = (Class33) Static43.aClass167_74.method3386(this.aLong45);
		}
		if (local202 == null || arg0.method3605(local202.n(), local35) != 0) {
			if (local202 != null) {
				local35 = arg0.method3554(local35, local202.n());
			}
			local43 = false;
			for (@Pc(233) int local233 = 0; local233 < 12; local233++) {
				local56 = this.anIntArray52[local233];
				if ((local56 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local56) != 0 && !arg8.method2712(local56 & 0x3FFFFFFF).method1444()) {
						local43 = true;
					}
				} else if (!arg4.method1327(local56 & 0x3FFFFFFF).method1499(this.aBoolean93)) {
					local43 = true;
				}
			}
			if (local43) {
				return null;
			}
			@Pc(287) Class199[] local287 = new Class199[12];
			local126 = 0;
			for (@Pc(291) int local291 = 0; local291 < 12; local291++) {
				@Pc(298) int local298 = this.anIntArray52[local291];
				@Pc(316) Class199 local316;
				if ((local298 & 0x40000000) != 0) {
					local316 = arg4.method1327(local298 & 0x3FFFFFFF).method1501(this.aBoolean93);
					if (local316 != null) {
						local287[local126++] = local316;
					}
				} else if ((local298 & Integer.MIN_VALUE) != 0) {
					local316 = arg8.method2712(local298 & 0x3FFFFFFF).method1446();
					if (local316 != null) {
						local287[local126++] = local316;
					}
				}
			}
			@Pc(356) int local356 = local35 | 0x4000;
			@Pc(362) Class199 local362 = new Class199(local287, local126);
			local202 = arg0.method3602(local362, local356, Static118.anInt2022, 64, 768);
			for (local66 = 0; local66 < 5; local66++) {
				if (this.anIntArray51[local66] < Static101.aShortArrayArray30[local66].length) {
					local202.N(Static250.aShortArray15[local66], Static101.aShortArrayArray30[local66][this.anIntArray51[local66]]);
				}
				if (this.anIntArray51[local66] < Static126.aShortArrayArray12[local66].length) {
					local202.N(Static356.aShortArray73[local66], Static126.aShortArrayArray12[local66][this.anIntArray51[local66]]);
				}
			}
			local202.u(local35);
			@Pc(427) Class167 local427 = Static43.aClass167_74;
			synchronized (Static43.aClass167_74) {
				Static43.aClass167_74.method3392(local202, this.aLong45);
			}
		}
		if (arg7 == null) {
			return local202;
		} else {
			local202.method5383((byte) 4, local35, true);
			return arg7.method3427(2048, arg2, local202, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Z[IIII[I)V")
	public void method974(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4) {
		if (arg3 != this.anInt1121) {
			this.anIntArrayArray31 = null;
			this.anInt1121 = arg3;
		}
		this.anInt1117 = arg2;
		this.aBoolean93 = arg0;
		this.anIntArray52 = arg1;
		this.anIntArray51 = arg4;
		this.method975();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	private void method975() {
		@Pc(7) long[] local7 = Class5_Sub1_Sub1.aLongArray9;
		this.aLong45 = -1L;
		this.aLong45 = local7[(int) (((long) (this.anInt1121 >> 8) ^ this.aLong45) & 0xFFL)] ^ this.aLong45 >>> 8;
		this.aLong45 = local7[(int) (((long) this.anInt1121 ^ this.aLong45) & 0xFFL)] ^ this.aLong45 >>> 8;
		for (@Pc(54) int local54 = 0; local54 < 12; local54++) {
			this.aLong45 = local7[(int) ((this.aLong45 ^ (long) (this.anIntArray52[local54] >> 24)) & 0xFFL)] ^ this.aLong45 >>> 8;
			this.aLong45 = local7[(int) ((this.aLong45 ^ (long) (this.anIntArray52[local54] >> 16)) & 0xFFL)] ^ this.aLong45 >>> 8;
			this.aLong45 = this.aLong45 >>> 8 ^ local7[(int) (((long) (this.anIntArray52[local54] >> 8) ^ this.aLong45) & 0xFFL)];
			this.aLong45 = local7[(int) ((this.aLong45 ^ (long) this.anIntArray52[local54]) & 0xFFL)] ^ this.aLong45 >>> 8;
		}
		for (@Pc(148) int local148 = 0; local148 < 5; local148++) {
			this.aLong45 = this.aLong45 >>> 8 ^ local7[(int) (((long) this.anIntArray51[local148] ^ this.aLong45) & 0xFFL)];
		}
		this.aLong45 = this.aLong45 >>> 8 ^ local7[(int) ((this.aLong45 ^ (long) (this.aBoolean93 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI)V")
	public void method977(@OriginalArg(0) boolean arg0) {
		this.aBoolean93 = arg0;
		this.method975();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BILclient!jt;I)V")
	public void method978(@OriginalArg(1) int arg0, @OriginalArg(2) Class129 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = Static26.anIntArray28[arg2];
		if (this.anIntArray52[local7] != 0 && arg1.method2712(arg0) != null) {
			this.anIntArray52[local7] = arg0 | Integer.MIN_VALUE;
			this.method975();
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILclient!qa;ILclient!nm;IIZLclient!rh;ILclient!jt;)Lclient!c;")
	public Class33 method980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class128 arg3, @OriginalArg(5) Class171 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) Class213 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class129 arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(94) int local94;
		if (arg4 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			@Pc(28) int local28 = arg4.anIntArray235[arg8];
			local7 = 2080;
			@Pc(38) int local38 = local28 >>> 16;
			@Pc(42) int local42 = local28 & 0xFFFF;
			@Pc(47) Class1_Sub3_Sub11 local47 = arg7.method4412(local38);
			if (local47 != null) {
				local13 = local47.method3068(local42) | false;
				local11 = local47.method3067(local42) | false;
				local17 = local47.method3070(local42) | false;
				local15 = arg4.aBoolean335 | false;
			}
			if ((arg4.aBoolean334 || Static240.aBoolean304) && arg5 != -1 && arg4.anIntArray235.length > arg5) {
				local94 = arg4.anIntArray235[arg5];
				@Pc(98) int local98 = local94 >>> 16;
				@Pc(102) int local102 = local94 & 0xFFFF;
				@Pc(111) Class1_Sub3_Sub11 local111;
				if (local98 == local38) {
					local111 = local47;
				} else {
					local111 = arg7.method4412(local102 >>> 16);
				}
				if (local111 != null) {
					local13 |= local111.method3068(local102);
					local11 |= local111.method3067(local102);
					local17 |= local111.method3070(local102);
				}
			}
			if (local13) {
				local7 = 2208;
			}
			if (local11) {
				local7 |= 0x100;
			}
			if (local15) {
				local7 |= 0x200;
			}
			if (local17) {
				local7 |= 0x400;
			}
		}
		@Pc(179) long local179 = (long) arg6 | (long) (arg0 << 16) | (long) arg1 << 32;
		@Pc(181) Class167 local181 = Static43.aClass167_74;
		@Pc(189) Class33 local189;
		synchronized (Static43.aClass167_74) {
			local189 = (Class33) Static43.aClass167_74.method3386(local179);
		}
		if (local189 == null || arg3.method3605(local189.n(), local7) != 0) {
			if (local189 != null) {
				local7 = arg3.method3554(local7, local189.n());
			}
			@Pc(219) Class199[] local219 = new Class199[3];
			local94 = 0;
			if (!arg9.method2712(arg6).method1444() || !arg9.method2712(arg0).method1444() || !arg9.method2712(arg1).method1444()) {
				return null;
			}
			@Pc(255) Class199 local255 = arg9.method2712(arg6).method1446();
			if (local255 != null) {
				local94++;
				local219[0] = local255;
			}
			local255 = arg9.method2712(arg0).method1446();
			if (local255 != null) {
				local219[local94++] = local255;
			}
			local255 = arg9.method2712(arg1).method1446();
			if (local255 != null) {
				local219[local94++] = local255;
			}
			local255 = new Class199(local219, local94);
			@Pc(300) int local300 = local7 | 0x4000;
			local189 = arg3.method3602(local255, local300, Static118.anInt2022, 64, 768);
			for (@Pc(310) int local310 = 0; local310 < 5; local310++) {
				if (Static101.aShortArrayArray30[local310].length > this.anIntArray51[local310]) {
					local189.N(Static250.aShortArray15[local310], Static101.aShortArrayArray30[local310][this.anIntArray51[local310]]);
				}
				if (Static126.aShortArrayArray12[local310].length > this.anIntArray51[local310]) {
					local189.N(Static356.aShortArray73[local310], Static126.aShortArrayArray12[local310][this.anIntArray51[local310]]);
				}
			}
			local189.u(local7);
			@Pc(375) Class167 local375 = Static43.aClass167_74;
			synchronized (Static43.aClass167_74) {
				Static43.aClass167_74.method3392(local189, local179);
			}
		}
		if (arg4 == null) {
			return local189;
		} else {
			local189 = local189.method5383((byte) 4, local7, true);
			return arg4.method3427(2048, arg2, local189, arg5, arg8);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
	public void method981(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray51[arg0] = arg1;
		this.method975();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILclient!rh;Lclient!qa;Lclient!ej;[Lclient!gt;Lclient!bp;IZLclient!jt;Lclient!nm;Lclient!tn;Lclient!ns;IIIILclient!nm;I)Lclient!c;")
	public Class33 method982(@OriginalArg(1) int arg0, @OriginalArg(2) Class213 arg1, @OriginalArg(3) Class128 arg2, @OriginalArg(4) Class65 arg3, @OriginalArg(5) Class99[] arg4, @OriginalArg(6) Class27 arg5, @OriginalArg(7) int arg6, @OriginalArg(9) Class129 arg7, @OriginalArg(10) Class171 arg8, @OriginalArg(11) Interface11 arg9, @OriginalArg(12) Class174 arg10, @OriginalArg(13) int arg11, @OriginalArg(14) int arg12, @OriginalArg(15) int arg13, @OriginalArg(16) int arg14, @OriginalArg(17) Class171 arg15, @OriginalArg(18) int arg16) {
		if (this.anInt1117 != -1) {
			return arg5.method588(this.anInt1117).method5245(arg11, arg0, arg13, arg15, arg9, arg16, arg6, arg4, arg10, arg1, arg12, arg2, arg8, arg14);
		}
		@Pc(34) int local34 = arg13;
		@Pc(37) long local37 = this.aLong45;
		@Pc(40) int[] local40 = this.anIntArray52;
		if (arg15 != null && (arg15.anInt4249 >= 0 || arg15.anInt4255 >= 0)) {
			local40 = new int[12];
			for (@Pc(56) int local56 = 0; local56 < 12; local56++) {
				local40[local56] = this.anIntArray52[local56];
			}
			if (arg15.anInt4249 >= 0) {
				if (arg15.anInt4249 == 65535) {
					local37 ^= 0xFFFFFFFF00000000L;
					local40[5] = 0;
				} else {
					local40[5] = arg15.anInt4249 | 0x40000000;
					local37 ^= (long) local40[5] << 32;
				}
			}
			if (arg15.anInt4255 >= 0) {
				if (arg15.anInt4255 == 65535) {
					local37 ^= 0xFFFFFFFFL;
					local40[3] = 0;
				} else {
					local40[3] = arg15.anInt4255 | 0x40000000;
					local37 ^= local40[3];
				}
			}
		}
		@Pc(145) boolean local145 = false;
		@Pc(147) boolean local147 = false;
		@Pc(149) boolean local149 = false;
		@Pc(157) boolean local157 = arg15 != null || arg8 != null;
		@Pc(164) int local164 = arg4 == null ? 0 : arg4.length;
		@Pc(198) int local198;
		@Pc(203) int local203;
		for (@Pc(166) int local166 = 0; local166 < local164; local166++) {
			Static11.aClass1_Sub3_Sub11Array10[local166] = null;
			if (arg4[local166] != null) {
				@Pc(184) Class171 local184 = arg1.method4410(arg4[local166].anInt2438);
				if (local184.anIntArray235 != null) {
					local157 = true;
					Static449.aClass171Array2[local166] = local184;
					local198 = arg4[local166].anInt2446;
					local203 = arg4[local166].anInt2441;
					@Pc(208) int local208 = local184.anIntArray235[local198];
					Static11.aClass1_Sub3_Sub11Array10[local166] = arg1.method4412(local208 >>> 16);
					@Pc(221) int local221 = local208 & 0xFFFF;
					Static53.anIntArray45[local166] = local221;
					if (Static11.aClass1_Sub3_Sub11Array10[local166] != null) {
						local147 |= Static11.aClass1_Sub3_Sub11Array10[local166].method3068(local221);
						local145 |= Static11.aClass1_Sub3_Sub11Array10[local166].method3067(local221);
						local149 |= Static11.aClass1_Sub3_Sub11Array10[local166].method3070(local221);
					}
					if ((local184.aBoolean334 || Static240.aBoolean304) && local203 != -1 && local203 < local184.anIntArray235.length) {
						Static239.anIntArray204[local166] = local184.anIntArray234[local198];
						Static291.anIntArray254[local166] = arg4[local166].anInt2447;
						@Pc(311) int local311 = local184.anIntArray235[local203];
						Static377.aClass1_Sub3_Sub11Array115[local166] = arg1.method4412(local311 >>> 16);
						@Pc(324) int local324 = local311 & 0xFFFF;
						Static153.anIntArray130[local166] = local324;
						if (Static377.aClass1_Sub3_Sub11Array115[local166] != null) {
							local147 |= Static377.aClass1_Sub3_Sub11Array115[local166].method3068(local324);
							local145 |= Static377.aClass1_Sub3_Sub11Array115[local166].method3067(local324);
							local149 |= Static377.aClass1_Sub3_Sub11Array115[local166].method3070(local324);
						}
					} else {
						Static239.anIntArray204[local166] = 0;
						Static291.anIntArray254[local166] = 0;
						Static377.aClass1_Sub3_Sub11Array115[local166] = null;
						Static153.anIntArray130[local166] = -1;
					}
				}
			}
		}
		@Pc(365) int local365 = -1;
		local198 = -1;
		local203 = 0;
		@Pc(371) Class1_Sub3_Sub11 local371 = null;
		@Pc(373) Class1_Sub3_Sub11 local373 = null;
		@Pc(375) int local375 = -1;
		@Pc(377) int local377 = -1;
		@Pc(379) int local379 = 0;
		@Pc(381) Class1_Sub3_Sub11 local381 = null;
		@Pc(383) Class1_Sub3_Sub11 local383 = null;
		if (local157) {
			local34 = arg13 | 0x20;
			@Pc(400) int local400;
			@Pc(463) int local463;
			if (arg15 != null) {
				local365 = arg15.anIntArray235[arg6];
				local400 = local365 >>> 16;
				local371 = arg1.method4412(local400);
				local365 &= 0xFFFF;
				if (local371 != null) {
					local147 |= local371.method3068(local365);
					local145 |= local371.method3067(local365);
					local149 |= local371.method3070(local365);
				}
				if ((arg15.aBoolean334 || Static240.aBoolean304) && arg12 != -1 && arg12 < arg15.anIntArray235.length) {
					local203 = arg15.anIntArray234[arg6];
					local198 = arg15.anIntArray235[arg12];
					local463 = local198 >>> 16;
					local373 = local400 == local463 ? local371 : arg1.method4412(local463);
					local198 &= 0xFFFF;
					if (local373 != null) {
						local147 |= local373.method3068(local198);
						local145 |= local373.method3067(local198);
						local149 |= local373.method3070(local198);
					}
				}
			}
			if (arg8 != null) {
				local375 = arg8.anIntArray235[arg16];
				local400 = local375 >>> 16;
				local381 = arg1.method4412(local400);
				local375 &= 0xFFFF;
				if (local381 != null) {
					local147 |= local381.method3068(local375);
					local145 |= local381.method3067(local375);
					local149 |= local381.method3070(local375);
				}
				if ((arg8.aBoolean334 || Static240.aBoolean304) && arg14 != -1 && arg8.anIntArray235.length > arg14) {
					local377 = arg8.anIntArray235[arg14];
					local379 = arg8.anIntArray234[arg16];
					local463 = local377 >>> 16;
					local383 = local400 == local463 ? local381 : arg1.method4412(local463);
					local377 &= 0xFFFF;
					if (local383 != null) {
						local147 |= local383.method3068(local377);
						local145 |= local383.method3067(local377);
						local149 |= local383.method3070(local377);
					}
				}
			}
			if (local147) {
				local34 |= 0x80;
			}
			if (local145) {
				local34 |= 0x100;
			}
			if (local149) {
				local34 |= 0x400;
			}
		}
		@Pc(640) Class167 local640 = Static416.aClass167_95;
		@Pc(648) Class33 local648;
		synchronized (Static416.aClass167_95) {
			local648 = (Class33) Static416.aClass167_95.method3386(local37);
		}
		@Pc(656) Class51 local656 = null;
		if (this.anInt1121 != -1) {
			local656 = arg10.method3490(this.anInt1121);
		}
		@Pc(697) int local697;
		@Pc(703) int local703;
		if (local648 == null || arg2.method3605(local648.n(), local34) != 0 || local656 != null && local656.anIntArrayArray34 != null && this.anIntArrayArray31 == null) {
			if (local648 != null) {
				local34 = arg2.method3554(local34, local648.n());
			}
			@Pc(695) boolean local695 = false;
			local697 = 0;
			while (true) {
				if (local697 >= 12) {
					if (local695) {
						if (this.aLong44 != -1L) {
							@Pc(757) Class167 local757 = Static416.aClass167_95;
							synchronized (Static416.aClass167_95) {
								local648 = (Class33) Static416.aClass167_95.method3386(this.aLong44);
							}
						}
						if (local648 == null || arg2.method3605(local648.n(), local34) != 0 || local656 != null && local656.anIntArrayArray34 != null && this.anIntArrayArray31 == null) {
							return null;
						}
					} else {
						@Pc(793) Class199[] local793 = new Class199[12];
						@Pc(801) int local801;
						for (@Pc(795) int local795 = 0; local795 < 12; local795++) {
							local801 = local40[local795];
							@Pc(824) Class199 local824;
							if ((local801 & 0x40000000) != 0) {
								local824 = arg3.method1327(local801 & 0x3FFFFFFF).method1496(this.aBoolean93);
								if (local824 != null) {
									local793[local795] = local824;
								}
							} else if ((local801 & Integer.MIN_VALUE) != 0) {
								local824 = arg7.method2712(local801 & 0x3FFFFFFF).method1438();
								if (local824 != null) {
									local793[local795] = local824;
								}
							}
						}
						@Pc(882) int local882;
						if (local656 != null && local656.anIntArrayArray34 != null) {
							for (local801 = 0; local801 < local656.anIntArrayArray34.length; local801++) {
								if (local656.anIntArrayArray34[local801] != null && local793[local801] != null) {
									local882 = local656.anIntArrayArray34[local801][0];
									@Pc(889) int local889 = local656.anIntArrayArray34[local801][1];
									@Pc(896) int local896 = local656.anIntArrayArray34[local801][2];
									@Pc(905) int local905 = local656.anIntArrayArray34[local801][3] << 3;
									@Pc(914) int local914 = local656.anIntArrayArray34[local801][4] << 3;
									@Pc(923) int local923 = local656.anIntArrayArray34[local801][5] << 3;
									if (this.anIntArrayArray31 == null) {
										this.anIntArrayArray31 = new int[local656.anIntArrayArray34.length][];
									}
									if (this.anIntArrayArray31[local801] == null) {
										@Pc(945) int[] local945 = this.anIntArrayArray31[local801] = new int[15];
										if (local905 == 0 && local914 == 0 && local923 == 0) {
											local945[13] = -local889;
											local945[14] = -local896;
											local945[12] = -local882;
											local945[0] = local945[4] = local945[8] = 32768;
										} else {
											@Pc(990) int local990 = Class1_Sub1_Sub25.anIntArray248[local905];
											@Pc(994) int local994 = Class1_Sub1_Sub25.anIntArray249[local905];
											@Pc(998) int local998 = Class1_Sub1_Sub25.anIntArray248[local914];
											@Pc(1002) int local1002 = Class1_Sub1_Sub25.anIntArray249[local914];
											@Pc(1006) int local1006 = Class1_Sub1_Sub25.anIntArray248[local923];
											@Pc(1010) int local1010 = Class1_Sub1_Sub25.anIntArray249[local923];
											@Pc(1018) int local1018 = local1006 * local994 + 16384 >> 15;
											@Pc(1026) int local1026 = local994 * local1010 + 16384 >> 15;
											local945[5] = -local994;
											local945[0] = local1002 * local1026 + local998 * local1006 + 16384 >> 15;
											local945[4] = local990 * local1006 + 16384 >> 15;
											local945[2] = local990 * local1002 + 16384 >> 15;
											local945[6] = local998 * local1026 + local1006 * -local1002 + 16384 >> 15;
											local945[7] = local998 * local1018 + -local1002 * -local1010 + 16384 >> 15;
											local945[1] = local1002 * local1018 + -local1010 * local998 + 16384 >> 15;
											local945[8] = local990 * local998 + 16384 >> 15;
											local945[3] = local990 * local1010 + 16384 >> 15;
											local945[12] = local945[6] * -local896 + -local889 * local945[3] + -local882 * local945[0] + 16384 >> 15;
											local945[13] = -local896 * local945[7] + -local889 * local945[4] + local945[1] * -local882 + 16384 >> 15;
											local945[14] = local945[8] * -local896 + local945[2] * -local882 + -local889 * local945[5] + 16384 >> 15;
										}
										local945[10] = local889;
										local945[9] = local882;
										local945[11] = local896;
									}
									if (local905 != 0 || local914 != 0 || local923 != 0) {
										local793[local801].method4140(local914, local905, local923);
									}
									if (local882 != 0 || local889 != 0 || local896 != 0) {
										local793[local801].method4134(local882, local896, local889);
									}
								}
							}
						}
						@Pc(1272) int local1272 = local34 | 0x4000;
						@Pc(1279) Class199 local1279 = new Class199(local793, local793.length);
						local648 = arg2.method3602(local1279, local1272, Static118.anInt2022, 64, 850);
						for (local882 = 0; local882 < 5; local882++) {
							if (Static101.aShortArrayArray30[local882].length > this.anIntArray51[local882]) {
								local648.N(Static250.aShortArray15[local882], Static101.aShortArrayArray30[local882][this.anIntArray51[local882]]);
							}
							if (this.anIntArray51[local882] < Static126.aShortArrayArray12[local882].length) {
								local648.N(Static356.aShortArray73[local882], Static126.aShortArrayArray12[local882][this.anIntArray51[local882]]);
							}
						}
						local648.u(local34);
						@Pc(1352) Class167 local1352 = Static416.aClass167_95;
						synchronized (Static416.aClass167_95) {
							Static416.aClass167_95.method3392(local648, local37);
						}
						this.aLong44 = local37;
					}
					break;
				}
				local703 = local40[local697];
				if ((local703 & 0x40000000) == 0) {
					if ((local703 & Integer.MIN_VALUE) != 0 && !arg7.method2712(local703 & 0x3FFFFFFF).method1445()) {
						local695 = true;
					}
				} else if (!arg3.method1327(local703 & 0x3FFFFFFF).method1505(this.aBoolean93)) {
					local695 = true;
				}
				local697++;
			}
		}
		@Pc(1374) Class33 local1374 = local648.method5383((byte) 4, local34, true);
		if (!local157) {
			return local1374;
		}
		@Pc(1380) int local1380 = 0;
		local697 = 1;
		while (local164 > local1380) {
			if (Static11.aClass1_Sub3_Sub11Array10[local1380] != null) {
				local1374.method5394(local697, false, Static239.anIntArray204[local1380], Static291.anIntArray254[local1380] - 1, Static53.anIntArray45[local1380], Static153.anIntArray130[local1380], this.anIntArrayArray31 == null ? null : this.anIntArrayArray31[local1380], Static11.aClass1_Sub3_Sub11Array10[local1380], Static377.aClass1_Sub3_Sub11Array115[local1380]);
			}
			local697 <<= 0x1;
			local1380++;
		}
		if (local371 != null && local381 != null) {
			local1374.method5396(arg0 - 1, local198, false, local371, local203, local365, local383, local375, arg11 - 1, local373, arg15.aBooleanArray19, local381, local377, local379);
		} else if (local371 != null) {
			local1374.method5392(local371, 0, false, arg0 - 1, local203, local373, local365, local198);
		} else if (local381 != null) {
			local1374.method5392(local381, 0, false, arg11 - 1, local379, local383, local375, local377);
		}
		for (local703 = 0; local703 < local164; local703++) {
			Static11.aClass1_Sub3_Sub11Array10[local703] = null;
			Static377.aClass1_Sub3_Sub11Array115[local703] = null;
			Static449.aClass171Array2[local703] = null;
		}
		return local1374;
	}
}
