import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class131 {

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "J")
	private long aLong117;

	@OriginalMember(owner = "client!jl", name = "h", descriptor = "Z")
	public boolean aBoolean347;

	@OriginalMember(owner = "client!jl", name = "l", descriptor = "[I")
	private int[] anIntArray266;

	@OriginalMember(owner = "client!jl", name = "n", descriptor = "[I")
	public int[] anIntArray267;

	@OriginalMember(owner = "client!jl", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
	private int anInt3609;

	@OriginalMember(owner = "client!jl", name = "r", descriptor = "J")
	private long aLong118;

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
	public int anInt3605 = -1;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(III)V")
	public void method2824(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray267[arg1] = arg0;
		this.method2825();
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)V")
	private void method2825() {
		@Pc(7) long[] local7 = Class148.aLongArray5;
		this.aLong117 = -1L;
		this.aLong117 = local7[(int) (((long) (this.anInt3609 >> 8) ^ this.aLong117) & 0xFFL)] ^ this.aLong117 >>> 8;
		this.aLong117 = local7[(int) (((long) this.anInt3609 ^ this.aLong117) & 0xFFL)] ^ this.aLong117 >>> 8;
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong117 = local7[(int) (((long) (this.anIntArray266[local50] >> 24) ^ this.aLong117) & 0xFFL)] ^ this.aLong117 >>> 8;
			this.aLong117 = local7[(int) (((long) (this.anIntArray266[local50] >> 16) ^ this.aLong117) & 0xFFL)] ^ this.aLong117 >>> 8;
			this.aLong117 = local7[(int) (((long) (this.anIntArray266[local50] >> 8) ^ this.aLong117) & 0xFFL)] ^ this.aLong117 >>> 8;
			this.aLong117 = this.aLong117 >>> 8 ^ local7[(int) ((this.aLong117 ^ (long) this.anIntArray266[local50]) & 0xFFL)];
		}
		for (@Pc(146) int local146 = 0; local146 < 5; local146++) {
			this.aLong117 = local7[(int) ((this.aLong117 ^ (long) this.anIntArray267[local146]) & 0xFFL)] ^ this.aLong117 >>> 8;
		}
		this.aLong117 = local7[(int) (((long) (this.aBoolean347 ? 1 : 0) ^ this.aLong117) & 0xFFL)] ^ this.aLong117 >>> 8;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILclient!rt;BILclient!gn;Lclient!pe;Lclient!za;Lclient!eb;ILclient!cf;ILclient!vk;)Lclient!e;")
	public Class8 method2826(@OriginalArg(1) Class226 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class97 arg2, @OriginalArg(5) Class196 arg3, @OriginalArg(6) Class117 arg4, @OriginalArg(7) Class64 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class37 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Interface12 arg9) {
		if (this.anInt3605 != -1) {
			return arg3.method4163(this.anInt3605).method5904(arg7, arg9, arg1, arg8, arg6, arg5, arg4);
		}
		@Pc(27) int local27 = 2048;
		@Pc(35) boolean local35;
		@Pc(54) int local54;
		@Pc(123) int local123;
		@Pc(58) int local58;
		if (arg5 != null) {
			@Pc(31) boolean local31 = false;
			@Pc(33) boolean local33 = false;
			local35 = false;
			@Pc(37) boolean local37 = false;
			local27 = 2080;
			local54 = arg5.anIntArray127[arg6];
			local58 = local54 >>> 16;
			@Pc(63) Class1_Sub3_Sub14 local63 = arg7.method671(local58);
			@Pc(67) int local67 = local54 & 0xFFFF;
			if (local63 != null) {
				local33 = local63.method3588(local67) | false;
				local31 = local63.method3591(local67) | false;
				local37 = local63.method3589(local67) | false;
				local35 = arg5.aBoolean141 | false;
			}
			if ((arg5.aBoolean142 || Static463.aBoolean651) && arg1 != -1 && arg1 < arg5.anIntArray127.length) {
				local123 = arg5.anIntArray127[arg1];
				@Pc(127) int local127 = local123 >>> 16;
				@Pc(131) int local131 = local123 & 0xFFFF;
				@Pc(145) Class1_Sub3_Sub14 local145 = local58 == local127 ? local63 : arg7.method671(local127);
				if (local145 != null) {
					local33 |= local145.method3588(local131);
					local31 |= local145.method3591(local131);
					local37 |= local145.method3589(local131);
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
		@Pc(199) Class77 local199 = Static185.aClass77_25;
		@Pc(208) Class8 local208;
		synchronized (Static185.aClass77_25) {
			local208 = (Class8) Static185.aClass77_25.method1387(this.aLong117);
		}
		if (local208 == null || arg4.method5732(local208.RA(), local27) != 0) {
			if (local208 != null) {
				local27 = arg4.method5696(local27, local208.RA());
			}
			local35 = false;
			for (@Pc(239) int local239 = 0; local239 < 12; local239++) {
				local54 = this.anIntArray266[local239];
				if ((local54 & 0x40000000) == 0) {
					if ((local54 & Integer.MIN_VALUE) != 0 && !arg2.method1757(local54 & 0x3FFFFFFF).method5354()) {
						local35 = true;
					}
				} else if (!arg0.method4788(local54 & 0x3FFFFFFF).method3006(this.aBoolean347)) {
					local35 = true;
				}
			}
			if (local35) {
				return null;
			}
			@Pc(294) Class147[] local294 = new Class147[12];
			local123 = 0;
			for (@Pc(298) int local298 = 0; local298 < 12; local298++) {
				@Pc(305) int local305 = this.anIntArray266[local298];
				@Pc(323) Class147 local323;
				if ((local305 & 0x40000000) != 0) {
					local323 = arg0.method4788(local305 & 0x3FFFFFFF).method3004(this.aBoolean347);
					if (local323 != null) {
						local294[local123++] = local323;
					}
				} else if ((local305 & Integer.MIN_VALUE) != 0) {
					local323 = arg2.method1757(local305 & 0x3FFFFFFF).method5347();
					if (local323 != null) {
						local294[local123++] = local323;
					}
				}
			}
			@Pc(363) int local363 = local27 | 0x4000;
			@Pc(369) Class147 local369 = new Class147(local294, local123);
			local208 = arg4.method5678(local369, local363, Static128.anInt1970, 64, 768);
			for (local58 = 0; local58 < 5; local58++) {
				if (this.anIntArray267[local58] < Static440.aShortArrayArray7[local58].length) {
					local208.q(Static11.aShortArray8[local58], Static440.aShortArrayArray7[local58][this.anIntArray267[local58]]);
				}
				if (Static96.aShortArrayArray3[local58].length > this.anIntArray267[local58]) {
					local208.q(Static173.aShortArray36[local58], Static96.aShortArrayArray3[local58][this.anIntArray267[local58]]);
				}
			}
			local208.D(local27);
			@Pc(440) Class77 local440 = Static185.aClass77_25;
			synchronized (Static185.aClass77_25) {
				Static185.aClass77_25.method1396(local208, this.aLong117);
			}
		}
		if (arg5 == null) {
			return local208;
		} else {
			local208.method5983((byte) 4, local27, true);
			return arg5.method1056(arg8, arg1, local208, arg6, 2048);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZ)V")
	public void method2827(@OriginalArg(1) boolean arg0) {
		this.aBoolean347 = arg0;
		this.method2825();
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I[IZZ[II)V")
	public void method2829(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		this.aBoolean347 = arg2;
		this.anIntArray267 = arg1;
		if (arg4 != this.anInt3609) {
			this.anIntArrayArray29 = null;
			this.anInt3609 = arg4;
		}
		this.anIntArray266 = arg3;
		this.anInt3605 = arg0;
		this.method2825();
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!pe;Lclient!za;Lclient!gn;ZLclient!vk;II[Lclient!ah;Lclient!eb;ILclient!pi;Lclient!cf;IILclient!eb;IILclient!rt;I)Lclient!e;")
	public Class8 method2830(@OriginalArg(0) Class196 arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(4) Interface12 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class9[] arg6, @OriginalArg(8) Class64 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class199 arg9, @OriginalArg(11) Class37 arg10, @OriginalArg(12) int arg11, @OriginalArg(14) Class64 arg12, @OriginalArg(15) int arg13, @OriginalArg(16) int arg14, @OriginalArg(17) Class226 arg15, @OriginalArg(18) int arg16) {
		if (this.anInt3605 != -1) {
			return arg0.method4163(this.anInt3605).method5908(arg16, arg3, arg5, arg4, arg1, arg14, arg11, arg12, arg13, arg8, arg7, arg6, arg9, arg10);
		}
		@Pc(33) int local33 = arg16;
		@Pc(36) long local36 = this.aLong117;
		@Pc(39) int[] local39 = this.anIntArray266;
		if (arg12 != null && (arg12.anInt1202 >= 0 || arg12.anInt1190 >= 0)) {
			local39 = new int[12];
			for (@Pc(58) int local58 = 0; local58 < 12; local58++) {
				local39[local58] = this.anIntArray266[local58];
			}
			if (arg12.anInt1202 >= 0) {
				if (arg12.anInt1202 == 65535) {
					local39[5] = 0;
					local36 ^= 0xFFFFFFFF00000000L;
				} else {
					local39[5] = arg12.anInt1202 | 0x40000000;
					local36 ^= (long) local39[5] << 32;
				}
			}
			if (arg12.anInt1190 >= 0) {
				if (arg12.anInt1190 == 65535) {
					local39[3] = 0;
					local36 ^= 0xFFFFFFFFL;
				} else {
					local39[3] = arg12.anInt1190 | 0x40000000;
					local36 ^= local39[3];
				}
			}
		}
		@Pc(142) boolean local142 = false;
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		@Pc(154) boolean local154 = arg12 != null || arg7 != null;
		@Pc(161) int local161 = arg6 == null ? 0 : arg6.length;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(163) int local163 = 0; local163 < local161; local163++) {
			Static260.aClass1_Sub3_Sub14Array7[local163] = null;
			if (arg6[local163] != null) {
				@Pc(181) Class64 local181 = arg10.method665(arg6[local163].anInt104);
				if (local181.anIntArray127 != null) {
					local154 = true;
					Static185.aClass64Array1[local163] = local181;
					local195 = arg6[local163].anInt109;
					local200 = arg6[local163].anInt108;
					@Pc(205) int local205 = local181.anIntArray127[local195];
					Static260.aClass1_Sub3_Sub14Array7[local163] = arg10.method671(local205 >>> 16);
					@Pc(218) int local218 = local205 & 0xFFFF;
					Static212.anIntArray281[local163] = local218;
					if (Static260.aClass1_Sub3_Sub14Array7[local163] != null) {
						local144 |= Static260.aClass1_Sub3_Sub14Array7[local163].method3588(local218);
						local142 |= Static260.aClass1_Sub3_Sub14Array7[local163].method3591(local218);
						local146 |= Static260.aClass1_Sub3_Sub14Array7[local163].method3589(local218);
					}
					if ((local181.aBoolean142 || Static463.aBoolean651) && local200 != -1 && local181.anIntArray127.length > local200) {
						Static374.anIntArray453[local163] = local181.anIntArray126[local195];
						Static152.anIntArray197[local163] = arg6[local163].anInt105;
						@Pc(303) int local303 = local181.anIntArray127[local200];
						Static464.aClass1_Sub3_Sub14Array8[local163] = arg10.method671(local303 >>> 16);
						@Pc(316) int local316 = local303 & 0xFFFF;
						Static334.anIntArray398[local163] = local316;
						if (Static464.aClass1_Sub3_Sub14Array8[local163] != null) {
							local144 |= Static464.aClass1_Sub3_Sub14Array8[local163].method3588(local316);
							local142 |= Static464.aClass1_Sub3_Sub14Array8[local163].method3591(local316);
							local146 |= Static464.aClass1_Sub3_Sub14Array8[local163].method3589(local316);
						}
					} else {
						Static374.anIntArray453[local163] = 0;
						Static152.anIntArray197[local163] = 0;
						Static464.aClass1_Sub3_Sub14Array8[local163] = null;
						Static334.anIntArray398[local163] = -1;
					}
				}
			}
		}
		@Pc(357) int local357 = -1;
		local195 = -1;
		local200 = 0;
		@Pc(363) Class1_Sub3_Sub14 local363 = null;
		@Pc(365) Class1_Sub3_Sub14 local365 = null;
		@Pc(367) int local367 = -1;
		@Pc(378) int local378 = -1;
		@Pc(380) int local380 = 0;
		@Pc(382) Class1_Sub3_Sub14 local382 = null;
		@Pc(384) Class1_Sub3_Sub14 local384 = null;
		if (local154) {
			local33 = arg16 | 0x20;
			@Pc(401) int local401;
			@Pc(467) int local467;
			if (arg12 != null) {
				local357 = arg12.anIntArray127[arg4];
				local401 = local357 >>> 16;
				local357 &= 0xFFFF;
				local363 = arg10.method671(local401);
				if (local363 != null) {
					local144 |= local363.method3588(local357);
					local142 |= local363.method3591(local357);
					local146 |= local363.method3589(local357);
				}
				if ((arg12.aBoolean142 || Static463.aBoolean651) && arg8 != -1 && arg12.anIntArray127.length > arg8) {
					local200 = arg12.anIntArray126[arg4];
					local195 = arg12.anIntArray127[arg8];
					local467 = local195 >>> 16;
					local365 = local467 == local401 ? local363 : arg10.method671(local467);
					local195 &= 0xFFFF;
					if (local365 != null) {
						local144 |= local365.method3588(local195);
						local142 |= local365.method3591(local195);
						local146 |= local365.method3589(local195);
					}
				}
			}
			if (arg7 != null) {
				local367 = arg7.anIntArray127[arg13];
				local401 = local367 >>> 16;
				local382 = arg10.method671(local401);
				local367 &= 0xFFFF;
				if (local382 != null) {
					local144 |= local382.method3588(local367);
					local142 |= local382.method3591(local367);
					local146 |= local382.method3589(local367);
				}
				if ((arg7.aBoolean142 || Static463.aBoolean651) && arg11 != -1 && arg11 < arg7.anIntArray127.length) {
					local380 = arg7.anIntArray126[arg13];
					local378 = arg7.anIntArray127[arg11];
					local467 = local378 >>> 16;
					local378 &= 0xFFFF;
					local384 = local401 == local467 ? local382 : arg10.method671(local467);
					if (local384 != null) {
						local144 |= local384.method3588(local378);
						local142 |= local384.method3591(local378);
						local146 |= local384.method3589(local378);
					}
				}
			}
			if (local144) {
				local33 |= 0x80;
			}
			if (local142) {
				local33 |= 0x100;
			}
			if (local146) {
				local33 |= 0x400;
			}
		}
		@Pc(651) Class77 local651 = Static309.aClass77_37;
		@Pc(659) Class8 local659;
		synchronized (Static309.aClass77_37) {
			local659 = (Class8) Static309.aClass77_37.method1387(local36);
		}
		@Pc(667) Class164 local667 = null;
		if (this.anInt3609 != -1) {
			local667 = arg9.method4206(this.anInt3609);
		}
		@Pc(708) int local708;
		@Pc(714) int local714;
		if (local659 == null || arg1.method5732(local659.RA(), local33) != 0 || local667 != null && local667.anIntArrayArray41 != null && this.anIntArrayArray29 == null) {
			if (local659 != null) {
				local33 = arg1.method5696(local33, local659.RA());
			}
			@Pc(706) boolean local706 = false;
			local708 = 0;
			while (true) {
				if (local708 >= 12) {
					if (local706) {
						if (this.aLong118 != -1L) {
							@Pc(1360) Class77 local1360 = Static309.aClass77_37;
							synchronized (Static309.aClass77_37) {
								local659 = (Class8) Static309.aClass77_37.method1387(this.aLong118);
							}
						}
						if (local659 == null || arg1.method5732(local659.RA(), local33) != 0 || local667 != null && local667.anIntArrayArray41 != null && this.anIntArrayArray29 == null) {
							return null;
						}
					} else {
						@Pc(760) Class147[] local760 = new Class147[12];
						@Pc(768) int local768;
						for (@Pc(762) int local762 = 0; local762 < 12; local762++) {
							local768 = local39[local762];
							@Pc(786) Class147 local786;
							if ((local768 & 0x40000000) != 0) {
								local786 = arg15.method4788(local768 & 0x3FFFFFFF).method2998(this.aBoolean347);
								if (local786 != null) {
									local760[local762] = local786;
								}
							} else if ((local768 & Integer.MIN_VALUE) != 0) {
								local786 = arg2.method1757(local768 & 0x3FFFFFFF).method5349();
								if (local786 != null) {
									local760[local762] = local786;
								}
							}
						}
						@Pc(851) int local851;
						if (local667 != null && local667.anIntArrayArray41 != null) {
							for (local768 = 0; local768 < local667.anIntArrayArray41.length; local768++) {
								if (local667.anIntArrayArray41[local768] != null && local760[local768] != null) {
									local851 = local667.anIntArrayArray41[local768][0];
									@Pc(858) int local858 = local667.anIntArrayArray41[local768][1];
									@Pc(865) int local865 = local667.anIntArrayArray41[local768][2];
									@Pc(874) int local874 = local667.anIntArrayArray41[local768][3] << 3;
									@Pc(883) int local883 = local667.anIntArrayArray41[local768][4] << 3;
									@Pc(892) int local892 = local667.anIntArrayArray41[local768][5] << 3;
									if (this.anIntArrayArray29 == null) {
										this.anIntArrayArray29 = new int[local667.anIntArrayArray41.length][];
									}
									if (this.anIntArrayArray29[local768] == null) {
										@Pc(914) int[] local914 = this.anIntArrayArray29[local768] = new int[15];
										if (local874 == 0 && local883 == 0 && local892 == 0) {
											local914[14] = -local865;
											local914[12] = -local851;
											local914[13] = -local858;
											local914[0] = local914[4] = local914[8] = 32768;
										} else {
											@Pc(959) int local959 = Class1_Sub29.anIntArray536[local874];
											@Pc(963) int local963 = Class1_Sub29.anIntArray537[local874];
											@Pc(967) int local967 = Class1_Sub29.anIntArray536[local883];
											@Pc(971) int local971 = Class1_Sub29.anIntArray537[local883];
											@Pc(975) int local975 = Class1_Sub29.anIntArray536[local892];
											@Pc(979) int local979 = Class1_Sub29.anIntArray537[local892];
											@Pc(987) int local987 = local963 * local975 + 16384 >> 15;
											@Pc(995) int local995 = local979 * local963 + 16384 >> 15;
											local914[1] = local971 * local987 + -local979 * local967 + 16384 >> 15;
											local914[7] = local987 * local967 + -local971 * -local979 + 16384 >> 15;
											local914[2] = local971 * local959 + 16384 >> 15;
											local914[3] = local979 * local959 + 16384 >> 15;
											local914[4] = local975 * local959 + 16384 >> 15;
											local914[8] = local967 * local959 + 16384 >> 15;
											local914[5] = -local963;
											local914[6] = local975 * -local971 + local995 * local967 + 16384 >> 15;
											local914[0] = local967 * local975 + local995 * local971 + 16384 >> 15;
											local914[12] = -local865 * local914[6] + -local858 * local914[3] + local914[0] * -local851 + 16384 >> 15;
											local914[14] = local914[5] * -local858 + local914[2] * -local851 + -local865 * local914[8] + 16384 >> 15;
											local914[13] = -local858 * local914[4] + local914[1] * -local851 + -local865 * local914[7] + 16384 >> 15;
										}
										local914[11] = local865;
										local914[10] = local858;
										local914[9] = local851;
									}
									if (local874 != 0 || local883 != 0 || local892 != 0) {
										local760[local768].method3297(local892, local874, local883);
									}
									if (local851 != 0 || local858 != 0 || local865 != 0) {
										local760[local768].method3301(local851, local858, local865);
									}
								}
							}
						}
						@Pc(1249) int local1249 = local33 | 0x4000;
						@Pc(1256) Class147 local1256 = new Class147(local760, local760.length);
						local659 = arg1.method5678(local1256, local1249, Static128.anInt1970, 64, 850);
						for (local851 = 0; local851 < 5; local851++) {
							if (Static440.aShortArrayArray7[local851].length > this.anIntArray267[local851]) {
								local659.q(Static11.aShortArray8[local851], Static440.aShortArrayArray7[local851][this.anIntArray267[local851]]);
							}
							if (Static96.aShortArrayArray3[local851].length > this.anIntArray267[local851]) {
								local659.q(Static173.aShortArray36[local851], Static96.aShortArrayArray3[local851][this.anIntArray267[local851]]);
							}
						}
						local659.D(local33);
						@Pc(1331) Class77 local1331 = Static309.aClass77_37;
						synchronized (Static309.aClass77_37) {
							Static309.aClass77_37.method1396(local659, local36);
						}
						this.aLong118 = local36;
					}
					break;
				}
				local714 = local39[local708];
				if ((local714 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local714) != 0 && !arg2.method1757(local714 & 0x3FFFFFFF).method5351()) {
						local706 = true;
					}
				} else if (!arg15.method4788(local714 & 0x3FFFFFFF).method2995(this.aBoolean347)) {
					local706 = true;
				}
				local708++;
			}
		}
		@Pc(1402) Class8 local1402 = local659.method5983((byte) 4, local33, true);
		if (!local154) {
			return local1402;
		}
		@Pc(1408) int local1408 = 0;
		local708 = 1;
		while (local1408 < local161) {
			if (Static260.aClass1_Sub3_Sub14Array7[local1408] != null) {
				local1402.method5989(Static374.anIntArray453[local1408], Static464.aClass1_Sub3_Sub14Array8[local1408], Static334.anIntArray398[local1408], Static152.anIntArray197[local1408] - 1, false, this.anIntArrayArray29 == null ? null : this.anIntArrayArray29[local1408], Static212.anIntArray281[local1408], local708, Static260.aClass1_Sub3_Sub14Array7[local1408]);
			}
			local1408++;
			local708 <<= 0x1;
		}
		if (local363 != null && local382 != null) {
			local1402.method5992(false, local357, local382, local200, arg14 - 1, arg12.aBooleanArray36, local365, local384, arg5 - 1, local367, local195, local380, local378, local363);
		} else if (local363 != null) {
			local1402.method5998(local357, local195, local365, 0, arg14 - 1, local200, false, local363);
		} else if (local382 != null) {
			local1402.method5998(local367, local378, local384, 0, arg5 - 1, local380, false, local382);
		}
		for (local714 = 0; local714 < local161; local714++) {
			Static260.aClass1_Sub3_Sub14Array7[local714] = null;
			Static464.aClass1_Sub3_Sub14Array8[local714] = null;
			Static185.aClass64Array1[local714] = null;
		}
		return local1402;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!eb;Lclient!gn;Lclient!za;IIIIIIIBLclient!cf;)Lclient!e;")
	public Class8 method2831(@OriginalArg(0) Class64 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) Class117 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(11) Class37 arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(100) int local100;
		if (arg0 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			@Pc(28) int local28 = arg0.anIntArray127[arg5];
			local7 = 2080;
			@Pc(38) int local38 = local28 >>> 16;
			@Pc(43) Class1_Sub3_Sub14 local43 = arg9.method671(local38);
			@Pc(47) int local47 = local28 & 0xFFFF;
			if (local43 != null) {
				local13 = local43.method3588(local47) | false;
				local11 = local43.method3591(local47) | false;
				local17 = local43.method3589(local47) | false;
				local15 = arg0.aBoolean141 | false;
			}
			if ((arg0.aBoolean142 || Static463.aBoolean651) && arg8 != -1 && arg0.anIntArray127.length > arg8) {
				local100 = arg0.anIntArray127[arg8];
				@Pc(104) int local104 = local100 >>> 16;
				@Pc(108) int local108 = local100 & 0xFFFF;
				@Pc(122) Class1_Sub3_Sub14 local122;
				if (local38 == local104) {
					local122 = local43;
				} else {
					local122 = arg9.method671(local108 >>> 16);
				}
				if (local122 != null) {
					local13 |= local122.method3588(local108);
					local11 |= local122.method3591(local108);
					local17 |= local122.method3589(local108);
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
		@Pc(187) long local187 = (long) (arg6 << 16) | (long) arg3 << 32 | (long) arg7;
		@Pc(189) Class77 local189 = Static185.aClass77_25;
		@Pc(197) Class8 local197;
		synchronized (Static185.aClass77_25) {
			local197 = (Class8) Static185.aClass77_25.method1387(local187);
		}
		if (local197 == null || arg2.method5732(local197.RA(), local7) != 0) {
			if (local197 != null) {
				local7 = arg2.method5696(local7, local197.RA());
			}
			@Pc(224) Class147[] local224 = new Class147[3];
			local100 = 0;
			if (!arg1.method1757(arg7).method5354() || !arg1.method1757(arg6).method5354() || !arg1.method1757(arg3).method5354()) {
				return null;
			}
			@Pc(258) Class147 local258 = arg1.method1757(arg7).method5347();
			if (local258 != null) {
				local100++;
				local224[0] = local258;
			}
			local258 = arg1.method1757(arg6).method5347();
			if (local258 != null) {
				local224[local100++] = local258;
			}
			local258 = arg1.method1757(arg3).method5347();
			if (local258 != null) {
				local224[local100++] = local258;
			}
			@Pc(297) int local297 = local7 | 0x4000;
			local258 = new Class147(local224, local100);
			local197 = arg2.method5678(local258, local297, Static128.anInt1970, 64, 768);
			for (@Pc(313) int local313 = 0; local313 < 5; local313++) {
				if (Static440.aShortArrayArray7[local313].length > this.anIntArray267[local313]) {
					local197.q(Static11.aShortArray8[local313], Static440.aShortArrayArray7[local313][this.anIntArray267[local313]]);
				}
				if (this.anIntArray267[local313] < Static96.aShortArrayArray3[local313].length) {
					local197.q(Static173.aShortArray36[local313], Static96.aShortArrayArray3[local313][this.anIntArray267[local313]]);
				}
			}
			local197.D(local7);
			@Pc(368) Class77 local368 = Static185.aClass77_25;
			synchronized (Static185.aClass77_25) {
				Static185.aClass77_25.method1396(local197, local187);
			}
		}
		if (arg0 == null) {
			return local197;
		} else {
			local197 = local197.method5983((byte) 4, local7, true);
			return arg0.method1056(arg4, arg8, local197, arg5, 2048);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!gn;III)V")
	public void method2832(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static230.anIntArray295[arg2];
		if (this.anIntArray266[local7] != 0 && arg0.method1757(arg1) != null) {
			this.anIntArray266[local7] = arg1 | Integer.MIN_VALUE;
			this.method2825();
		}
	}
}
