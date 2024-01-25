import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class398 {

	@OriginalMember(owner = "client!wt", name = "i", descriptor = "[I")
	public int[] anIntArray601;

	@OriginalMember(owner = "client!wt", name = "j", descriptor = "J")
	private long aLong322;

	@OriginalMember(owner = "client!wt", name = "o", descriptor = "I")
	private int anInt11147;

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "[I")
	private int[] anIntArray602;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "J")
	private long aLong323;

	@OriginalMember(owner = "client!wt", name = "g", descriptor = "Z")
	public boolean aBoolean776;

	@OriginalMember(owner = "client!wt", name = "l", descriptor = "[Lclient!km;")
	private Class206[] aClass206Array1;

	@OriginalMember(owner = "client!wt", name = "m", descriptor = "I")
	public int anInt11149 = -1;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZZ)V")
	public void method9449(@OriginalArg(1) boolean arg0) {
		this.aBoolean776 = arg0;
		this.method9451();
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIILclient!es;)V")
	public void method9450(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class103 arg2) {
		@Pc(7) int local7 = Static80.anIntArray76[arg0];
		if (arg2.method2165(arg1) != null) {
			this.anIntArray602[local7] = Integer.MIN_VALUE | arg1;
			this.method9451();
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)V")
	private void method9451() {
		this.aLong322 = -1L;
		@Pc(13) long[] local13 = Class14_Sub7_Sub2.aLongArray5;
		this.aLong322 = this.aLong322 >>> 8 ^ local13[(int) (((long) (this.anInt11147 >> 8) ^ this.aLong322) & 0xFFL)];
		this.aLong322 = this.aLong322 >>> 8 ^ local13[(int) ((this.aLong322 ^ (long) this.anInt11147) & 0xFFL)];
		for (@Pc(53) int local53 = 0; local53 < this.anIntArray602.length; local53++) {
			this.aLong322 = local13[(int) ((this.aLong322 ^ (long) (this.anIntArray602[local53] >> 24)) & 0xFFL)] ^ this.aLong322 >>> 8;
			this.aLong322 = local13[(int) ((this.aLong322 ^ (long) (this.anIntArray602[local53] >> 16)) & 0xFFL)] ^ this.aLong322 >>> 8;
			this.aLong322 = this.aLong322 >>> 8 ^ local13[(int) (((long) (this.anIntArray602[local53] >> 8) ^ this.aLong322) & 0xFFL)];
			this.aLong322 = local13[(int) (((long) this.anIntArray602[local53] ^ this.aLong322) & 0xFFL)] ^ this.aLong322 >>> 8;
		}
		@Pc(153) int local153;
		if (this.aClass206Array1 != null) {
			for (local153 = 0; local153 < this.aClass206Array1.length; local153++) {
				if (this.aClass206Array1[local153] != null) {
					@Pc(170) int[] local170;
					@Pc(176) int[] local176;
					if (this.aBoolean776) {
						local176 = this.aClass206Array1[local153].anIntArray316;
						local170 = this.aClass206Array1[local153].anIntArray313;
					} else {
						local170 = this.aClass206Array1[local153].anIntArray314;
						local176 = this.aClass206Array1[local153].anIntArray315;
					}
					@Pc(193) int local193;
					if (local170 != null) {
						for (local193 = 0; local193 < local170.length; local193++) {
							this.aLong322 = local13[(int) (((long) (local170[local193] >> 8) ^ this.aLong322) & 0xFFL)] ^ this.aLong322 >>> 8;
							this.aLong322 = local13[(int) (((long) local170[local193] ^ this.aLong322) & 0xFFL)] ^ this.aLong322 >>> 8;
						}
					}
					if (local176 != null) {
						for (local193 = 0; local193 < local176.length; local193++) {
							this.aLong322 = this.aLong322 >>> 8 ^ local13[(int) (((long) (local176[local193] >> 8) ^ this.aLong322) & 0xFFL)];
							this.aLong322 = local13[(int) ((this.aLong322 ^ (long) local176[local193]) & 0xFFL)] ^ this.aLong322 >>> 8;
						}
					}
					if (this.aClass206Array1[local153].aShortArray71 != null) {
						for (local193 = 0; local193 < this.aClass206Array1[local153].aShortArray71.length; local193++) {
							this.aLong322 = local13[(int) ((this.aLong322 ^ (long) (this.aClass206Array1[local153].aShortArray71[local193] >> 8)) & 0xFFL)] ^ this.aLong322 >>> 8;
							this.aLong322 = local13[(int) ((this.aLong322 ^ (long) this.aClass206Array1[local153].aShortArray71[local193]) & 0xFFL)] ^ this.aLong322 >>> 8;
						}
					}
					if (this.aClass206Array1[local153].aShortArray72 != null) {
						for (local193 = 0; local193 < this.aClass206Array1[local153].aShortArray72.length; local193++) {
							this.aLong322 = this.aLong322 >>> 8 ^ local13[(int) ((this.aLong322 ^ (long) (this.aClass206Array1[local153].aShortArray72[local193] >> 8)) & 0xFFL)];
							this.aLong322 = this.aLong322 >>> 8 ^ local13[(int) (((long) this.aClass206Array1[local153].aShortArray72[local193] ^ this.aLong322) & 0xFFL)];
						}
					}
				}
			}
		}
		for (local153 = 0; local153 < 10; local153++) {
			this.aLong322 = this.aLong322 >>> 8 ^ local13[(int) ((this.aLong322 ^ (long) this.anIntArray601[local153]) & 0xFFL)];
		}
		this.aLong322 = local13[(int) ((this.aLong322 ^ (long) (this.aBoolean776 ? 1 : 0)) & 0xFFL)] ^ this.aLong322 >>> 8;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "([I[IB[Lclient!km;IZI)V")
	public void method9452(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class206[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (this.anInt11147 != arg5) {
			this.anInt11147 = arg5;
		}
		this.anInt11149 = arg3;
		this.anIntArray601 = arg1;
		this.aBoolean776 = arg4;
		this.anIntArray602 = arg0;
		this.aClass206Array1 = arg2;
		this.method9451();
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!kja;ILclient!jaa;IIILclient!es;Lclient!ha;I)Lclient!ka;")
	public Class129 method9456(@OriginalArg(0) Class204 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class103 arg5, @OriginalArg(7) Class144 arg6) {
		@Pc(24) int local24 = arg2 == null ? 2048 : arg2.method8947() | 0x800;
		@Pc(37) long local37 = (long) (arg1 << 16) | (long) arg4 << 32 | (long) arg3;
		@Pc(39) Class317 local39 = Static306.aClass317_31;
		@Pc(47) Class129 local47;
		synchronized (Static306.aClass317_31) {
			local47 = (Class129) Static306.aClass317_31.method7882(local37);
		}
		if (local47 == null || arg6.method6967(local47.ua(), local24) != 0) {
			if (local47 != null) {
				local24 = arg6.method6937(local24, local47.ua());
			}
			@Pc(81) Class72[] local81 = new Class72[3];
			@Pc(83) int local83 = 0;
			if (!arg5.method2165(arg3).method111() || !arg5.method2165(arg1).method111() || !arg5.method2165(arg4).method111()) {
				return null;
			}
			@Pc(118) Class72 local118 = arg5.method2165(arg3).method108();
			if (local118 != null) {
				local83++;
				local81[0] = local118;
			}
			local118 = arg5.method2165(arg1).method108();
			if (local118 != null) {
				local81[local83++] = local118;
			}
			local118 = arg5.method2165(arg4).method108();
			if (local118 != null) {
				local81[local83++] = local118;
			}
			@Pc(163) int local163 = local24 | 0x4000;
			local118 = new Class72(local81, local83);
			local47 = arg6.method6908(local118, local163, Static457.anInt7618, 64, 768);
			for (@Pc(179) int local179 = 0; local179 < 10; local179++) {
				for (@Pc(183) int local183 = 0; local183 < Static673.aShortArrayArray6[local179].length; local183++) {
					if (Static222.aShortArrayArrayArray1[local179][local183].length > this.anIntArray601[local179]) {
						local47.ia(Static673.aShortArrayArray6[local179][local183], Static222.aShortArrayArrayArray1[local179][local183][this.anIntArray601[local179]]);
					}
				}
			}
			local47.s(local24);
			@Pc(237) Class317 local237 = Static306.aClass317_31;
			synchronized (Static306.aClass317_31) {
				Static306.aClass317_31.method7875(local37, local47);
			}
		}
		if (arg2 == null) {
			return local47;
		} else {
			local47 = local47.method5288((byte) 4, local24, true);
			arg2.method8956(local47, 0);
			return local47;
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!cia;Lclient!jaa;IZLclient!ha;Lclient!kja;Lclient!es;Lclient!bfa;Lclient!cca;)Lclient!ka;")
	public Class129 method9457(@OriginalArg(0) Class61 arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(4) Class144 arg2, @OriginalArg(5) Class204 arg3, @OriginalArg(6) Class103 arg4, @OriginalArg(7) Interface2 arg5, @OriginalArg(8) Class56 arg6) {
		if (this.anInt11149 != -1) {
			return arg0.method1230(this.anInt11149).method8639(arg5, arg2, arg1, (Class194) null);
		}
		@Pc(34) int local34 = arg1 == null ? 2048 : arg1.method8947() | 0x800;
		@Pc(42) Class317 local42 = Static306.aClass317_31;
		@Pc(51) Class129 local51;
		synchronized (Static306.aClass317_31) {
			local51 = (Class129) Static306.aClass317_31.method7882(this.aLong322);
		}
		if (local51 == null || arg2.method6967(local51.ua(), local34) != 0) {
			if (local51 != null) {
				local34 = arg2.method6937(local34, local51.ua());
			}
			@Pc(84) boolean local84 = false;
			for (@Pc(86) int local86 = 0; local86 < this.anIntArray602.length; local86++) {
				@Pc(95) int local95 = this.anIntArray602[local86];
				@Pc(97) Class206 local97 = null;
				if ((local95 & 0x40000000) != 0) {
					if (this.aClass206Array1 != null && this.aClass206Array1[local86] != null) {
						local97 = this.aClass206Array1[local86];
					}
					if (!arg6.method1052(local95 & 0x3FFFFFFF).method6838(local97, this.aBoolean776)) {
						local84 = true;
					}
				} else if ((local95 & Integer.MIN_VALUE) != 0 && !arg4.method2165(local95 & 0x3FFFFFFF).method111()) {
					local84 = true;
				}
			}
			if (local84) {
				return null;
			}
			@Pc(179) Class72[] local179 = new Class72[this.anIntArray602.length];
			@Pc(181) int local181 = 0;
			for (@Pc(183) int local183 = 0; local183 < this.anIntArray602.length; local183++) {
				@Pc(192) int local192 = this.anIntArray602[local183];
				@Pc(194) Class206 local194 = null;
				@Pc(227) Class72 local227;
				if ((local192 & 0x40000000) != 0) {
					if (this.aClass206Array1 != null && this.aClass206Array1[local183] != null) {
						local194 = this.aClass206Array1[local183];
					}
					local227 = arg6.method1052(local192 & 0x3FFFFFFF).method6848(local194, this.aBoolean776);
					if (local227 != null) {
						local179[local181++] = local227;
					}
				} else if ((local192 & Integer.MIN_VALUE) != 0) {
					local227 = arg4.method2165(local192 & 0x3FFFFFFF).method108();
					if (local227 != null) {
						local179[local181++] = local227;
					}
				}
			}
			@Pc(273) Class72 local273 = new Class72(local179, local181);
			@Pc(277) int local277 = local34 | 0x4000;
			local51 = arg2.method6908(local273, local277, Static457.anInt7618, 64, 768);
			for (@Pc(289) int local289 = 0; local289 < 10; local289++) {
				for (@Pc(293) int local293 = 0; local293 < Static673.aShortArrayArray6[local289].length; local293++) {
					if (Static222.aShortArrayArrayArray1[local289][local293].length > this.anIntArray601[local289]) {
						local51.ia(Static673.aShortArrayArray6[local289][local293], Static222.aShortArrayArrayArray1[local289][local293][this.anIntArray601[local289]]);
					}
				}
			}
			local51.s(local34);
			@Pc(351) Class317 local351 = Static306.aClass317_31;
			synchronized (Static306.aClass317_31) {
				Static306.aClass317_31.method7875(this.aLong322, local51);
			}
		}
		if (arg1 == null) {
			return local51;
		} else {
			@Pc(376) Class129 local376 = local51.method5288((byte) 4, local34, true);
			arg1.method8956(local376, 0);
			return local376;
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(III)V")
	public void method9458(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray601[arg1] = arg0;
		this.method9451();
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!cca;III)V")
	public void method9459(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == -1) {
			this.anIntArray602[arg2] = 0;
		} else if (arg0.method1052(arg1) != null) {
			this.anIntArray602[arg2] = arg1 | 0x40000000;
			this.method9451();
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!iia;Lclient!wv;ZIILclient!jaa;ZLclient!cia;Lclient!kja;[Lclient!jaa;Lclient!ha;[ILclient!cca;Lclient!jaa;Lclient!es;Lclient!bfa;)Lclient!ka;")
	public Class129 method9460(@OriginalArg(0) Class175 arg0, @OriginalArg(1) Class400 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class181 arg4, @OriginalArg(7) Class61 arg5, @OriginalArg(8) Class204 arg6, @OriginalArg(9) Class181[] arg7, @OriginalArg(10) Class144 arg8, @OriginalArg(11) int[] arg9, @OriginalArg(12) Class56 arg10, @OriginalArg(13) Class181 arg11, @OriginalArg(14) Class103 arg12, @OriginalArg(15) Interface2 arg13) {
		if (this.anInt11149 != -1) {
			return arg5.method1230(this.anInt11149).method8640(arg9, arg4, arg11, arg3, arg13, (Class194) null, arg0, arg8, arg2, arg7);
		}
		@Pc(31) int local31 = arg2;
		@Pc(34) long local34 = this.aLong322;
		@Pc(37) int[] local37 = this.anIntArray602;
		@Pc(39) boolean local39 = false;
		@Pc(41) boolean local41 = false;
		@Pc(72) int local72;
		@Pc(118) int local118;
		if (arg11 != null) {
			@Pc(47) Class259 local47 = arg11.method8952();
			if (local47 != null && (local47.anInt7195 >= 0 || local47.anInt7202 >= 0)) {
				local37 = new int[this.anIntArray602.length];
				for (local72 = 0; local72 < local37.length; local72++) {
					local37[local72] = this.anIntArray602[local72];
				}
				if (local47.anInt7195 >= 0 && arg1.anInt11169 != -1) {
					local39 = true;
					if (local47.anInt7195 == 65535) {
						local37[arg1.anInt11169] = 0;
						for (local118 = 0; local118 < arg1.anIntArray605.length; local118++) {
							local37[arg1.anIntArray605[local118]] = 0;
						}
						local34 ^= 0xFFFFFFFF00000000L;
					} else {
						local37[arg1.anInt11169] = local47.anInt7195 | 0x40000000;
						for (local118 = 0; local118 < arg1.anIntArray605.length; local118++) {
							local37[arg1.anIntArray605[local118]] = 0;
						}
						local34 ^= (long) local37[arg1.anInt11169] << 32;
					}
				}
				if (local47.anInt7202 >= 0 && arg1.anInt11167 != -1) {
					if (local47.anInt7202 == 65535) {
						local37[arg1.anInt11167] = 0;
						local34 ^= 0xFFFFFFFFL;
						for (local118 = 0; local118 < arg1.anIntArray604.length; local118++) {
							local37[arg1.anIntArray604[local118]] = 0;
						}
					} else {
						local37[arg1.anInt11167] = local47.anInt7202 | 0x40000000;
						for (local118 = 0; local118 < arg1.anIntArray604.length; local118++) {
							local37[arg1.anIntArray604[local118]] = 0;
						}
						local34 ^= (long) local37[arg1.anInt11167];
					}
					local41 = true;
				}
			}
		}
		@Pc(291) boolean local291 = false;
		local72 = arg7 == null ? 0 : arg7.length;
		for (local118 = 0; local118 < local72; local118++) {
			if (arg7[local118] != null) {
				local291 = true;
				local31 |= arg7[local118].method8947();
			}
		}
		if (arg11 != null) {
			local31 |= arg11.method8947();
			local291 = true;
		}
		if (arg4 != null) {
			local31 |= arg4.method8947();
			local291 = true;
		}
		@Pc(353) boolean local353 = false;
		if (arg9 != null) {
			for (@Pc(357) int local357 = 0; local357 < arg9.length; local357++) {
				if (arg9[local357] != -1) {
					local353 = true;
					local31 |= 0x20;
				}
			}
		}
		@Pc(380) Class317 local380 = Static111.aClass317_12;
		@Pc(388) Class129 local388;
		synchronized (Static111.aClass317_12) {
			local388 = (Class129) Static111.aClass317_12.method7882(local34);
		}
		@Pc(396) Class141 local396 = null;
		if (this.anInt11147 != -1) {
			local396 = arg0.method4257(this.anInt11147);
		}
		@Pc(433) int local433;
		@Pc(441) int local441;
		@Pc(606) int local606;
		@Pc(612) int local612;
		if (local388 == null || arg8.method6967(local388.ua(), local31) != 0) {
			if (local388 != null) {
				local31 = arg8.method6937(local31, local388.ua());
			}
			@Pc(431) boolean local431 = false;
			local433 = 0;
			while (true) {
				@Pc(455) int local455;
				if (local433 >= local37.length) {
					if (local431) {
						if (this.aLong323 != -1L) {
							@Pc(980) Class317 local980 = Static111.aClass317_12;
							synchronized (Static111.aClass317_12) {
								local388 = (Class129) Static111.aClass317_12.method7882(this.aLong323);
							}
						}
						if (local388 == null || arg8.method6967(local388.ua(), local31) != 0) {
							return null;
						}
					} else {
						@Pc(604) Class72[] local604 = new Class72[local37.length];
						for (local606 = 0; local606 < local37.length; local606++) {
							local612 = local37[local606];
							@Pc(614) Class206 local614 = null;
							@Pc(639) boolean local639 = local606 == 5 && local39 || local606 == 3 && local41;
							@Pc(658) Class72 local658;
							if ((local612 & 0x40000000) != 0) {
								if (!local639 && this.aClass206Array1 != null && this.aClass206Array1[local606] != null) {
									local614 = this.aClass206Array1[local606];
								}
								local658 = arg10.method1052(local612 & 0x3FFFFFFF).method6830(local614, this.aBoolean776);
								if (local658 != null) {
									local604[local606] = local658;
								}
							} else if ((local612 & Integer.MIN_VALUE) != 0) {
								local658 = arg12.method2165(local612 & 0x3FFFFFFF).method109();
								if (local658 != null) {
									local604[local606] = local658;
								}
							}
						}
						@Pc(737) int local737;
						if (local396 != null && local396.anIntArrayArray24 != null) {
							for (local612 = 0; local612 < local396.anIntArrayArray24.length; local612++) {
								if (local604[local612] != null) {
									local455 = 0;
									local737 = 0;
									@Pc(739) int local739 = 0;
									@Pc(741) int local741 = 0;
									@Pc(743) int local743 = 0;
									@Pc(745) int local745 = 0;
									if (local396.anIntArrayArray24[local612] != null) {
										local743 = local396.anIntArrayArray24[local612][4] << 3;
										local739 = local396.anIntArrayArray24[local612][2];
										local745 = local396.anIntArrayArray24[local612][5] << 3;
										local741 = local396.anIntArrayArray24[local612][3] << 3;
										local455 = local396.anIntArrayArray24[local612][0];
										local737 = local396.anIntArrayArray24[local612][1];
									}
									if (local741 != 0 || local743 != 0 || local745 != 0) {
										local604[local612].method1686(local745, local743, local741);
									}
									if (local455 != 0 || local737 != 0 || local739 != 0) {
										local604[local612].method1694(local739, local737, local455);
									}
								}
							}
						}
						@Pc(867) Class72 local867 = new Class72(local604, local604.length);
						@Pc(871) int local871 = local31 | 0x4000;
						local388 = arg8.method6908(local867, local871, Static457.anInt7618, 64, 850);
						for (local455 = 0; local455 < 10; local455++) {
							for (local737 = 0; local737 < Static673.aShortArrayArray6[local455].length; local737++) {
								if (Static222.aShortArrayArrayArray1[local455][local737].length > this.anIntArray601[local455]) {
									local388.ia(Static673.aShortArrayArray6[local455][local737], Static222.aShortArrayArrayArray1[local455][local737][this.anIntArray601[local455]]);
								}
							}
						}
						if (true) {
							local388.s(local31);
							@Pc(951) Class317 local951 = Static111.aClass317_12;
							synchronized (Static111.aClass317_12) {
								Static111.aClass317_12.method7875(local34, local388);
							}
							this.aLong323 = local34;
						}
					}
					break;
				}
				local441 = local37[local433];
				@Pc(443) Class206 local443 = null;
				@Pc(445) boolean local445 = false;
				if (local39) {
					if (local433 == arg1.anInt11169) {
						local445 = true;
					} else {
						for (local455 = 0; local455 < arg1.anIntArray605.length; local455++) {
							if (arg1.anIntArray605[local455] == local433) {
								local445 = true;
								break;
							}
						}
					}
				}
				if (local41) {
					if (local433 == arg1.anInt11167) {
						local445 = true;
					} else {
						for (local455 = 0; local455 < arg1.anIntArray604.length; local455++) {
							if (local433 == arg1.anIntArray604[local455]) {
								local445 = true;
								break;
							}
						}
					}
				}
				if ((local441 & 0x40000000) != 0) {
					if (!local445 && this.aClass206Array1 != null && this.aClass206Array1[local433] != null) {
						local443 = this.aClass206Array1[local433];
					}
					if (!arg10.method1052(local441 & 0x3FFFFFFF).method6832(local443, this.aBoolean776)) {
						local431 = true;
					}
				} else if ((Integer.MIN_VALUE & local441) != 0 && !arg12.method2165(local441 & 0x3FFFFFFF).method112()) {
					local431 = true;
				}
				local433++;
			}
		}
		@Pc(1017) Class129 local1017 = local388.method5288((byte) 4, local31, true);
		if (!local291 && !local353) {
			return local1017;
		}
		@Pc(1028) Class263[] local1028 = null;
		if (local396 != null) {
			local1028 = local396.method3033(arg8);
		}
		if (local353 && local1028 != null) {
			for (local433 = 0; local433 < arg9.length; local433++) {
				if (local1028[local433] != null) {
					local1017.method5305(local1028[local433], 0x1 << local433, true);
				}
			}
		}
		local433 = 0;
		local441 = 1;
		while (local72 > local433) {
			if (arg7[local433] != null) {
				arg7[local433].method8954(local1017, local441);
			}
			local441 <<= 0x1;
			local433++;
		}
		if (local353) {
			for (local606 = 0; local606 < arg9.length; local606++) {
				if (arg9[local606] != -1) {
					local612 = arg9[local606] - arg3;
					local612 &= 0x3FFF;
					@Pc(1140) Class263 local1140 = arg8.method6914();
					local1140.method8447(local612);
					local1017.method5305(local1140, 0x1 << local606, false);
				}
			}
		}
		if (local353 && local1028 != null) {
			for (local606 = 0; local606 < arg9.length; local606++) {
				if (local1028[local606] != null) {
					local1017.method5305(local1028[local606], 0x1 << local606, false);
				}
			}
		}
		if (arg11 != null && arg4 != null) {
			Static261.method4367(arg4, local1017, arg11);
		} else if (arg11 != null) {
			arg11.method8956(local1017, 0);
		} else if (arg4 != null) {
			arg4.method8956(local1017, 0);
		}
		return local1017;
	}
}
