import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class198 {

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "J")
	private long aLong186;

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "[I")
	public int[] anIntArray349;

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "J")
	private long aLong187;

	@OriginalMember(owner = "client!qi", name = "n", descriptor = "Z")
	public boolean aBoolean403;

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!qi", name = "t", descriptor = "I")
	private int anInt5636;

	@OriginalMember(owner = "client!qi", name = "v", descriptor = "[I")
	private int[] anIntArray350;

	@OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
	public int anInt5633 = -1;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZ)V")
	public void method4669(@OriginalArg(1) boolean arg0) {
		this.aBoolean403 = arg0;
		this.method4675();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZLclient!aj;II)V")
	public void method4670(@OriginalArg(1) Class7 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = Static404.anIntArray420[arg1];
		if (this.anIntArray350[local7] != 0 && arg0.method144(arg2) != null) {
			this.anIntArray350[local7] = arg2 | Integer.MIN_VALUE;
			this.method4675();
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZ[I[III)V")
	public void method4673(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4) {
		this.anIntArray349 = arg3;
		this.aBoolean403 = arg1;
		this.anIntArray350 = arg2;
		if (this.anInt5636 != arg4) {
			this.anInt5636 = arg4;
			this.anIntArrayArray48 = null;
		}
		this.anInt5633 = arg0;
		this.method4675();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!vr;Lclient!ws;ILclient!aj;Lclient!eg;Lclient!kd;ILclient!bc;ILclient!qa;I)Lclient!ka;")
	public Class108 method4674(@OriginalArg(1) Class261 arg0, @OriginalArg(2) Class272 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class7 arg3, @OriginalArg(5) Class59 arg4, @OriginalArg(6) Interface6 arg5, @OriginalArg(8) Class19 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class167 arg8, @OriginalArg(11) int arg9) {
		if (this.anInt5633 != -1) {
			return arg6.method401(this.anInt5633).method3708(arg5, arg2, arg9, arg7, arg4, arg8, arg0);
		}
		@Pc(27) int local27 = 2048;
		@Pc(35) boolean local35;
		@Pc(48) int local48;
		@Pc(115) int local115;
		@Pc(58) int local58;
		if (arg0 != null) {
			@Pc(31) boolean local31 = false;
			@Pc(33) boolean local33 = false;
			local35 = false;
			@Pc(37) boolean local37 = false;
			local48 = arg0.anIntArray494[arg9];
			local27 = 2080;
			local58 = local48 >>> 16;
			@Pc(62) int local62 = local48 & 0xFFFF;
			@Pc(67) Class3_Sub3_Sub17 local67 = arg4.method1548(local58);
			if (local67 != null) {
				local33 = local67.method6063(local62) | false;
				local31 = local67.method6069(local62) | false;
				local37 = local67.method6066(local62) | false;
				local35 = arg0.aBoolean501 | false;
			}
			if ((arg0.aBoolean502 || Static454.aBoolean509) && arg7 != -1 && arg7 < arg0.anIntArray494.length) {
				local115 = arg0.anIntArray494[arg7];
				@Pc(119) int local119 = local115 >>> 16;
				@Pc(123) int local123 = local115 & 0xFFFF;
				@Pc(137) Class3_Sub3_Sub17 local137 = local119 == local58 ? local67 : arg4.method1548(local119);
				if (local137 != null) {
					local33 |= local137.method6063(local123);
					local31 |= local137.method6069(local123);
					local37 |= local137.method6066(local123);
				}
			}
			if (local33) {
				local27 = 2208;
			}
			if (local31) {
				local27 |= 0x100;
			}
			if (local35) {
				local27 |= 0x200;
			}
			if (local37) {
				local27 |= 0x400;
			}
		}
		@Pc(191) Class268 local191 = Static438.aClass268_24;
		@Pc(200) Class108 local200;
		synchronized (Static438.aClass268_24) {
			local200 = (Class108) Static438.aClass268_24.method6166(this.aLong186);
		}
		if (local200 == null || arg8.method6006(local200.ma(), local27) != 0) {
			if (local200 != null) {
				local27 = arg8.method5967(local27, local200.ma());
			}
			local35 = false;
			for (@Pc(228) int local228 = 0; local228 < 12; local228++) {
				local48 = this.anIntArray350[local228];
				if ((local48 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local48) != 0 && !arg3.method144(local48 & 0x3FFFFFFF).method6088()) {
						local35 = true;
					}
				} else if (!arg1.method6283(local48 & 0x3FFFFFFF).method4975(this.aBoolean403)) {
					local35 = true;
				}
			}
			if (local35) {
				return null;
			}
			@Pc(285) Class160[] local285 = new Class160[12];
			local115 = 0;
			for (@Pc(289) int local289 = 0; local289 < 12; local289++) {
				@Pc(296) int local296 = this.anIntArray350[local289];
				@Pc(318) Class160 local318;
				if ((local296 & 0x40000000) != 0) {
					local318 = arg1.method6283(local296 & 0x3FFFFFFF).method4968(this.aBoolean403);
					if (local318 != null) {
						local285[local115++] = local318;
					}
				} else if ((local296 & Integer.MIN_VALUE) != 0) {
					local318 = arg3.method144(local296 & 0x3FFFFFFF).method6087();
					if (local318 != null) {
						local285[local115++] = local318;
					}
				}
			}
			@Pc(357) Class160 local357 = new Class160(local285, local115);
			@Pc(361) int local361 = local27 | 0x4000;
			local200 = arg8.method5984(local357, local361, Static320.anInt1179, 64, 768);
			for (local58 = 0; local58 < 5; local58++) {
				if (Static417.aShortArrayArray9[local58].length > this.anIntArray349[local58]) {
					local200.i(Static243.aShortArray113[local58], Static417.aShortArrayArray9[local58][this.anIntArray349[local58]]);
				}
				if (Static212.aShortArrayArray3[local58].length > this.anIntArray349[local58]) {
					local200.i(Static424.aShortArray114[local58], Static212.aShortArrayArray3[local58][this.anIntArray349[local58]]);
				}
			}
			local200.B(local27);
			@Pc(432) Class268 local432 = Static438.aClass268_24;
			synchronized (Static438.aClass268_24) {
				Static438.aClass268_24.method6164(local200, this.aLong186);
			}
		}
		if (arg0 == null) {
			return local200;
		} else {
			local200.method4930((byte) 4, local27, true);
			return arg0.method6052(local200, arg7, arg2, arg9, 2048);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
	private void method4675() {
		@Pc(7) long[] local7 = Class165.aLongArray8;
		this.aLong186 = -1L;
		this.aLong186 = local7[(int) (((long) (this.anInt5636 >> 8) ^ this.aLong186) & 0xFFL)] ^ this.aLong186 >>> 8;
		this.aLong186 = local7[(int) (((long) this.anInt5636 ^ this.aLong186) & 0xFFL)] ^ this.aLong186 >>> 8;
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong186 = this.aLong186 >>> 8 ^ local7[(int) (((long) (this.anIntArray350[local50] >> 24) ^ this.aLong186) & 0xFFL)];
			this.aLong186 = this.aLong186 >>> 8 ^ local7[(int) (((long) (this.anIntArray350[local50] >> 16) ^ this.aLong186) & 0xFFL)];
			this.aLong186 = local7[(int) (((long) (this.anIntArray350[local50] >> 8) ^ this.aLong186) & 0xFFL)] ^ this.aLong186 >>> 8;
			this.aLong186 = this.aLong186 >>> 8 ^ local7[(int) (((long) this.anIntArray350[local50] ^ this.aLong186) & 0xFFL)];
		}
		for (@Pc(146) int local146 = 0; local146 < 5; local146++) {
			this.aLong186 = this.aLong186 >>> 8 ^ local7[(int) (((long) this.anIntArray349[local146] ^ this.aLong186) & 0xFFL)];
		}
		this.aLong186 = local7[(int) (((long) (this.aBoolean403 ? 1 : 0) ^ this.aLong186) & 0xFFL)] ^ this.aLong186 >>> 8;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBLclient!vr;Lclient!qa;ILclient!eg;Lclient!ws;ILclient!tk;IZ[Lclient!el;Lclient!kd;IILclient!aj;Lclient!vr;ILclient!bc;)Lclient!ka;")
	public Class108 method4677(@OriginalArg(0) int arg0, @OriginalArg(2) Class261 arg1, @OriginalArg(3) Class167 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class59 arg4, @OriginalArg(6) Class272 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class238 arg7, @OriginalArg(9) int arg8, @OriginalArg(11) Class60[] arg9, @OriginalArg(12) Interface6 arg10, @OriginalArg(13) int arg11, @OriginalArg(14) int arg12, @OriginalArg(15) Class7 arg13, @OriginalArg(16) Class261 arg14, @OriginalArg(17) int arg15, @OriginalArg(18) Class19 arg16) {
		if (this.anInt5633 != -1) {
			return arg16.method401(this.anInt5633).method3704(arg3, arg12, arg4, arg11, arg14, arg2, arg15, arg6, arg0, arg1, arg9, arg10, arg8, arg7);
		}
		@Pc(34) int local34 = arg15;
		@Pc(37) long local37 = this.aLong186;
		@Pc(40) int[] local40 = this.anIntArray350;
		if (arg1 != null && (arg1.anInt7414 >= 0 || arg1.anInt7412 >= 0)) {
			local40 = new int[12];
			for (@Pc(59) int local59 = 0; local59 < 12; local59++) {
				local40[local59] = this.anIntArray350[local59];
			}
			if (arg1.anInt7414 >= 0) {
				if (arg1.anInt7414 == 65535) {
					local37 ^= 0xFFFFFFFF00000000L;
					local40[5] = 0;
				} else {
					local40[5] = arg1.anInt7414 | 0x40000000;
					local37 ^= (long) local40[5] << 32;
				}
			}
			if (arg1.anInt7412 >= 0) {
				if (arg1.anInt7412 == 65535) {
					local40[3] = 0;
					local37 ^= 0xFFFFFFFFL;
				} else {
					local40[3] = arg1.anInt7412 | 0x40000000;
					local37 ^= local40[3];
				}
			}
		}
		@Pc(145) boolean local145 = false;
		@Pc(147) boolean local147 = false;
		@Pc(149) boolean local149 = false;
		@Pc(157) boolean local157 = arg1 != null || arg14 != null;
		@Pc(164) int local164 = arg9 == null ? 0 : arg9.length;
		@Pc(198) int local198;
		@Pc(203) int local203;
		@Pc(208) int local208;
		for (@Pc(166) int local166 = 0; local166 < local164; local166++) {
			Static110.aClass3_Sub3_Sub17Array2[local166] = null;
			if (arg9[local166] != null) {
				@Pc(184) Class261 local184 = arg4.method1552(arg9[local166].anInt1694);
				if (local184.anIntArray494 != null) {
					Static237.aClass261Array1[local166] = local184;
					local157 = true;
					local198 = arg9[local166].anInt1697;
					local203 = arg9[local166].anInt1698;
					local208 = local184.anIntArray494[local198];
					Static110.aClass3_Sub3_Sub17Array2[local166] = arg4.method1548(local208 >>> 16);
					@Pc(221) int local221 = local208 & 0xFFFF;
					Static361.anIntArray378[local166] = local221;
					if (Static110.aClass3_Sub3_Sub17Array2[local166] != null) {
						local147 |= Static110.aClass3_Sub3_Sub17Array2[local166].method6063(local221);
						local145 |= Static110.aClass3_Sub3_Sub17Array2[local166].method6069(local221);
						local149 |= Static110.aClass3_Sub3_Sub17Array2[local166].method6066(local221);
					}
					if ((local184.aBoolean502 || Static454.aBoolean509) && local203 != -1 && local184.anIntArray494.length > local203) {
						Static186.anIntArray213[local166] = local184.anIntArray493[local198];
						Static242.anIntArray273[local166] = arg9[local166].anInt1701;
						@Pc(306) int local306 = local184.anIntArray494[local203];
						Static275.aClass3_Sub3_Sub17Array3[local166] = arg4.method1548(local306 >>> 16);
						@Pc(319) int local319 = local306 & 0xFFFF;
						Static416.anIntArray445[local166] = local319;
						if (Static275.aClass3_Sub3_Sub17Array3[local166] != null) {
							local147 |= Static275.aClass3_Sub3_Sub17Array3[local166].method6063(local319);
							local145 |= Static275.aClass3_Sub3_Sub17Array3[local166].method6069(local319);
							local149 |= Static275.aClass3_Sub3_Sub17Array3[local166].method6066(local319);
						}
					} else {
						Static186.anIntArray213[local166] = 0;
						Static242.anIntArray273[local166] = 0;
						Static275.aClass3_Sub3_Sub17Array3[local166] = null;
						Static416.anIntArray445[local166] = -1;
					}
				}
			}
		}
		local198 = -1;
		local203 = -1;
		local208 = 0;
		@Pc(378) Class3_Sub3_Sub17 local378 = null;
		@Pc(380) Class3_Sub3_Sub17 local380 = null;
		@Pc(382) int local382 = -1;
		@Pc(384) int local384 = -1;
		@Pc(386) int local386 = 0;
		@Pc(388) Class3_Sub3_Sub17 local388 = null;
		@Pc(390) Class3_Sub3_Sub17 local390 = null;
		if (local157) {
			local34 = arg15 | 0x20;
			@Pc(407) int local407;
			@Pc(467) int local467;
			if (arg1 != null) {
				local198 = arg1.anIntArray494[arg0];
				local407 = local198 >>> 16;
				local198 &= 0xFFFF;
				local378 = arg4.method1548(local407);
				if (local378 != null) {
					local147 |= local378.method6063(local198);
					local145 |= local378.method6069(local198);
					local149 |= local378.method6066(local198);
				}
				if ((arg1.aBoolean502 || Static454.aBoolean509) && arg3 != -1 && arg3 < arg1.anIntArray494.length) {
					local208 = arg1.anIntArray493[arg0];
					local203 = arg1.anIntArray494[arg3];
					local467 = local203 >>> 16;
					local203 &= 0xFFFF;
					local380 = local407 == local467 ? local378 : arg4.method1548(local467);
					if (local380 != null) {
						local147 |= local380.method6063(local203);
						local145 |= local380.method6069(local203);
						local149 |= local380.method6066(local203);
					}
				}
			}
			if (arg14 != null) {
				local382 = arg14.anIntArray494[arg8];
				local407 = local382 >>> 16;
				local382 &= 0xFFFF;
				local388 = arg4.method1548(local407);
				if (local388 != null) {
					local147 |= local388.method6063(local382);
					local145 |= local388.method6069(local382);
					local149 |= local388.method6066(local382);
				}
				if ((arg14.aBoolean502 || Static454.aBoolean509) && arg12 != -1 && arg12 < arg14.anIntArray494.length) {
					local386 = arg14.anIntArray493[arg8];
					local384 = arg14.anIntArray494[arg12];
					local467 = local384 >>> 16;
					local384 &= 0xFFFF;
					local390 = local467 == local407 ? local388 : arg4.method1548(local467);
					if (local390 != null) {
						local147 |= local390.method6063(local384);
						local145 |= local390.method6069(local384);
						local149 |= local390.method6066(local384);
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
		@Pc(640) Class268 local640 = Static13.aClass268_2;
		@Pc(648) Class108 local648;
		synchronized (Static13.aClass268_2) {
			local648 = (Class108) Static13.aClass268_2.method6166(local37);
		}
		@Pc(656) Class142 local656 = null;
		if (this.anInt5636 != -1) {
			local656 = arg7.method5438(this.anInt5636);
		}
		@Pc(697) int local697;
		@Pc(703) int local703;
		if (local648 == null || arg2.method6006(local648.ma(), local34) != 0 || local656 != null && local656.anIntArrayArray33 != null && this.anIntArrayArray48 == null) {
			if (local648 != null) {
				local34 = arg2.method5967(local34, local648.ma());
			}
			@Pc(695) boolean local695 = false;
			local697 = 0;
			while (true) {
				if (local697 >= 12) {
					if (local695) {
						if (this.aLong187 != -1L) {
							@Pc(755) Class268 local755 = Static13.aClass268_2;
							synchronized (Static13.aClass268_2) {
								local648 = (Class108) Static13.aClass268_2.method6166(this.aLong187);
							}
						}
						if (local648 == null || arg2.method6006(local648.ma(), local34) != 0 || local656 != null && local656.anIntArrayArray33 != null && this.anIntArrayArray48 == null) {
							return null;
						}
					} else {
						@Pc(791) Class160[] local791 = new Class160[12];
						@Pc(799) int local799;
						for (@Pc(793) int local793 = 0; local793 < 12; local793++) {
							local799 = local40[local793];
							@Pc(817) Class160 local817;
							if ((local799 & 0x40000000) != 0) {
								local817 = arg5.method6283(local799 & 0x3FFFFFFF).method4985(this.aBoolean403);
								if (local817 != null) {
									local791[local793] = local817;
								}
							} else if ((Integer.MIN_VALUE & local799) != 0) {
								local817 = arg13.method144(local799 & 0x3FFFFFFF).method6086();
								if (local817 != null) {
									local791[local793] = local817;
								}
							}
						}
						@Pc(878) int local878;
						if (local656 != null && local656.anIntArrayArray33 != null) {
							for (local799 = 0; local799 < local656.anIntArrayArray33.length; local799++) {
								if (local656.anIntArrayArray33[local799] != null && local791[local799] != null) {
									local878 = local656.anIntArrayArray33[local799][0];
									@Pc(885) int local885 = local656.anIntArrayArray33[local799][1];
									@Pc(892) int local892 = local656.anIntArrayArray33[local799][2];
									@Pc(901) int local901 = local656.anIntArrayArray33[local799][3] << 3;
									@Pc(910) int local910 = local656.anIntArrayArray33[local799][4] << 3;
									@Pc(919) int local919 = local656.anIntArrayArray33[local799][5] << 3;
									if (this.anIntArrayArray48 == null) {
										this.anIntArrayArray48 = new int[local656.anIntArrayArray33.length][];
									}
									if (this.anIntArrayArray48[local799] == null) {
										@Pc(941) int[] local941 = this.anIntArrayArray48[local799] = new int[15];
										if (local901 == 0 && local910 == 0 && local919 == 0) {
											local941[12] = -local878;
											local941[0] = local941[4] = local941[8] = 32768;
											local941[14] = -local892;
											local941[13] = -local885;
										} else {
											@Pc(954) int local954 = Class65.anIntArray87[local901];
											@Pc(958) int local958 = Class65.anIntArray88[local901];
											@Pc(962) int local962 = Class65.anIntArray87[local910];
											@Pc(966) int local966 = Class65.anIntArray88[local910];
											@Pc(970) int local970 = Class65.anIntArray87[local919];
											@Pc(974) int local974 = Class65.anIntArray88[local919];
											@Pc(982) int local982 = local970 * local958 + 16384 >> 15;
											@Pc(990) int local990 = local974 * local958 + 16384 >> 15;
											local941[6] = local970 * -local966 + local990 * local962 + 16384 >> 15;
											local941[7] = local982 * local962 + -local966 * -local974 + 16384 >> 15;
											local941[2] = local954 * local966 + 16384 >> 15;
											local941[0] = local966 * local990 + local970 * local962 + 16384 >> 15;
											local941[1] = local982 * local966 + -local974 * local962 + 16384 >> 15;
											local941[5] = -local958;
											local941[4] = local970 * local954 + 16384 >> 15;
											local941[3] = local974 * local954 + 16384 >> 15;
											local941[8] = local954 * local962 + 16384 >> 15;
											local941[13] = -local878 * local941[1] + local941[4] * -local885 + local941[7] * -local892 + 16384 >> 15;
											local941[12] = local941[6] * -local892 + local941[0] * -local878 + local941[3] * -local885 + 16384 >> 15;
											local941[14] = local941[2] * -local878 + local941[5] * -local885 + local941[8] * -local892 + 16384 >> 15;
										}
										local941[9] = local878;
										local941[10] = local885;
										local941[11] = local892;
									}
									if (local901 != 0 || local910 != 0 || local919 != 0) {
										local791[local799].method3783(local919, local901, local910);
									}
									if (local878 != 0 || local885 != 0 || local892 != 0) {
										local791[local799].method3776(local885, local892, local878);
									}
								}
							}
						}
						@Pc(1273) int local1273 = local34 | 0x4000;
						@Pc(1280) Class160 local1280 = new Class160(local791, local791.length);
						local648 = arg2.method5984(local1280, local1273, Static320.anInt1179, 64, 850);
						for (local878 = 0; local878 < 5; local878++) {
							if (this.anIntArray349[local878] < Static417.aShortArrayArray9[local878].length) {
								local648.i(Static243.aShortArray113[local878], Static417.aShortArrayArray9[local878][this.anIntArray349[local878]]);
							}
							if (Static212.aShortArrayArray3[local878].length > this.anIntArray349[local878]) {
								local648.i(Static424.aShortArray114[local878], Static212.aShortArrayArray3[local878][this.anIntArray349[local878]]);
							}
						}
						local648.B(local34);
						@Pc(1353) Class268 local1353 = Static13.aClass268_2;
						synchronized (Static13.aClass268_2) {
							Static13.aClass268_2.method6164(local648, local37);
						}
						this.aLong187 = local37;
					}
					break;
				}
				local703 = local40[local697];
				if ((local703 & 0x40000000) == 0) {
					if ((local703 & Integer.MIN_VALUE) != 0 && !arg13.method144(local703 & 0x3FFFFFFF).method6094()) {
						local695 = true;
					}
				} else if (!arg5.method6283(local703 & 0x3FFFFFFF).method4974(this.aBoolean403)) {
					local695 = true;
				}
				local697++;
			}
		}
		@Pc(1375) Class108 local1375 = local648.method4930((byte) 4, local34, true);
		if (!local157) {
			return local1375;
		}
		@Pc(1381) int local1381 = 0;
		local697 = 1;
		while (local164 > local1381) {
			if (Static110.aClass3_Sub3_Sub17Array2[local1381] != null) {
				local1375.method4934(Static416.anIntArray445[local1381], Static242.anIntArray273[local1381] - 1, this.anIntArrayArray48 == null ? null : this.anIntArrayArray48[local1381], Static110.aClass3_Sub3_Sub17Array2[local1381], Static186.anIntArray213[local1381], Static361.anIntArray378[local1381], Static275.aClass3_Sub3_Sub17Array3[local1381], local697, false);
			}
			local1381++;
			local697 <<= 0x1;
		}
		if (local378 != null && local388 != null) {
			local1375.method4942(local380, local203, local198, local388, local386, local382, arg1.aBooleanArray29, local390, arg6 - 1, local378, arg11 - 1, local384, false, local208);
		} else if (local378 != null) {
			local1375.method4943(false, local380, local203, local378, local208, local198, arg11 - 1, 0);
		} else if (local388 != null) {
			local1375.method4943(false, local390, local384, local388, local386, local382, arg6 - 1, 0);
		}
		for (local703 = 0; local703 < local164; local703++) {
			Static110.aClass3_Sub3_Sub17Array2[local703] = null;
			Static275.aClass3_Sub3_Sub17Array3[local703] = null;
			Static237.aClass261Array1[local703] = null;
		}
		return local1375;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!aj;IIIILclient!qa;IILclient!eg;ILclient!vr;)Lclient!ka;")
	public Class108 method4679(@OriginalArg(0) int arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class167 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class59 arg8, @OriginalArg(11) Class261 arg9) {
		@Pc(12) int local12 = 2048;
		@Pc(99) int local99;
		if (arg9 != null) {
			@Pc(16) boolean local16 = false;
			@Pc(18) boolean local18 = false;
			@Pc(20) boolean local20 = false;
			@Pc(22) boolean local22 = false;
			@Pc(33) int local33 = arg9.anIntArray494[arg4];
			local12 = 2080;
			@Pc(43) int local43 = local33 >>> 16;
			@Pc(48) Class3_Sub3_Sub17 local48 = arg8.method1548(local43);
			@Pc(52) int local52 = local33 & 0xFFFF;
			if (local48 != null) {
				local18 = local48.method6063(local52) | false;
				local16 = local48.method6069(local52) | false;
				local22 = local48.method6066(local52) | false;
				local20 = arg9.aBoolean501 | false;
			}
			if ((arg9.aBoolean502 || Static454.aBoolean509) && arg0 != -1 && arg9.anIntArray494.length > arg0) {
				local99 = arg9.anIntArray494[arg0];
				@Pc(103) int local103 = local99 >>> 16;
				@Pc(107) int local107 = local99 & 0xFFFF;
				@Pc(116) Class3_Sub3_Sub17 local116;
				if (local43 == local103) {
					local116 = local48;
				} else {
					local116 = arg8.method1548(local107 >>> 16);
				}
				if (local116 != null) {
					local18 |= local116.method6063(local107);
					local16 |= local116.method6069(local107);
					local22 |= local116.method6066(local107);
				}
			}
			if (local18) {
				local12 = 2208;
			}
			if (local16) {
				local12 |= 0x100;
			}
			if (local20) {
				local12 |= 0x200;
			}
			if (local22) {
				local12 |= 0x400;
			}
		}
		@Pc(184) long local184 = (long) arg3 | (long) (arg7 << 16) | (long) arg2 << 32;
		@Pc(186) Class268 local186 = Static438.aClass268_24;
		@Pc(194) Class108 local194;
		synchronized (Static438.aClass268_24) {
			local194 = (Class108) Static438.aClass268_24.method6166(local184);
		}
		if (local194 == null || arg6.method6006(local194.ma(), local12) != 0) {
			if (local194 != null) {
				local12 = arg6.method5967(local12, local194.ma());
			}
			@Pc(224) Class160[] local224 = new Class160[3];
			local99 = 0;
			if (!arg1.method144(arg3).method6088() || !arg1.method144(arg7).method6088() || !arg1.method144(arg2).method6088()) {
				return null;
			}
			@Pc(256) Class160 local256 = arg1.method144(arg3).method6087();
			if (local256 != null) {
				local99++;
				local224[0] = local256;
			}
			local256 = arg1.method144(arg7).method6087();
			if (local256 != null) {
				local224[local99++] = local256;
			}
			local256 = arg1.method144(arg2).method6087();
			if (local256 != null) {
				local224[local99++] = local256;
			}
			local256 = new Class160(local224, local99);
			@Pc(301) int local301 = local12 | 0x4000;
			local194 = arg6.method5984(local256, local301, Static320.anInt1179, 64, 768);
			for (@Pc(311) int local311 = 0; local311 < 5; local311++) {
				if (this.anIntArray349[local311] < Static417.aShortArrayArray9[local311].length) {
					local194.i(Static243.aShortArray113[local311], Static417.aShortArrayArray9[local311][this.anIntArray349[local311]]);
				}
				if (Static212.aShortArrayArray3[local311].length > this.anIntArray349[local311]) {
					local194.i(Static424.aShortArray114[local311], Static212.aShortArrayArray3[local311][this.anIntArray349[local311]]);
				}
			}
			local194.B(local12);
			@Pc(372) Class268 local372 = Static438.aClass268_24;
			synchronized (Static438.aClass268_24) {
				Static438.aClass268_24.method6164(local194, local184);
			}
		}
		if (arg9 == null) {
			return local194;
		} else {
			local194 = local194.method4930((byte) 4, local12, true);
			return arg9.method6052(local194, arg0, arg5, arg4, 2048);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)V")
	public void method4681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray349[arg1] = arg0;
		this.method4675();
	}
}
