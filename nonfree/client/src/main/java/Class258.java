import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class258 {

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "[I")
	public int[] anIntArray582;

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "[I")
	private int[] anIntArray583;

	@OriginalMember(owner = "client!rs", name = "m", descriptor = "J")
	private long aLong189;

	@OriginalMember(owner = "client!rs", name = "n", descriptor = "Z")
	public boolean aBoolean487;

	@OriginalMember(owner = "client!rs", name = "o", descriptor = "I")
	private int anInt7363;

	@OriginalMember(owner = "client!rs", name = "q", descriptor = "J")
	private long aLong190;

	@OriginalMember(owner = "client!rs", name = "u", descriptor = "[[I")
	private int[][] anIntArrayArray72;

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "I")
	public int anInt7362 = -1;

	static {
		new Class114("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZB)V")
	public void method6280(@OriginalArg(0) boolean arg0) {
		this.aBoolean487 = arg0;
		this.method6285();
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(III)V")
	public void method6281(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray582[arg0] = arg1;
		this.method6285();
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!op;Lclient!nc;Lclient!tt;I[Lclient!aea;IIIZIILclient!qa;Lclient!tt;Lclient!as;Lclient!jn;Lclient!bo;Lclient!ht;BI)Lclient!r;")
	public Class19 method6282(@OriginalArg(0) Class222 arg0, @OriginalArg(1) Interface10 arg1, @OriginalArg(2) Class280 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class8[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class9 arg10, @OriginalArg(12) Class280 arg11, @OriginalArg(13) Class18 arg12, @OriginalArg(14) Class153 arg13, @OriginalArg(15) Class34 arg14, @OriginalArg(16) Class126 arg15, @OriginalArg(18) int arg16) {
		if (this.anInt7362 != -1) {
			return arg0.method5587(this.anInt7362).method5858(arg8, arg7, arg4, arg9, arg2, arg6, arg12, arg16, arg11, arg3, arg15, arg10, arg5, arg1);
		}
		@Pc(32) int local32 = arg8;
		@Pc(35) long local35 = this.aLong189;
		@Pc(38) int[] local38 = this.anIntArray583;
		if (arg2 != null && (arg2.anInt8099 >= 0 || arg2.anInt8108 >= 0)) {
			local38 = new int[12];
			for (@Pc(62) int local62 = 0; local62 < 12; local62++) {
				local38[local62] = this.anIntArray583[local62];
			}
			if (arg2.anInt8099 >= 0) {
				if (arg2.anInt8099 == 65535) {
					local38[5] = 0;
					local35 ^= 0xFFFFFFFF00000000L;
				} else {
					local38[5] = arg2.anInt8099 | 0x40000000;
					local35 ^= (long) local38[5] << 32;
				}
			}
			if (arg2.anInt8108 >= 0) {
				if (arg2.anInt8108 == 65535) {
					local38[3] = 0;
					local35 ^= 0xFFFFFFFFL;
				} else {
					local38[3] = arg2.anInt8108 | 0x40000000;
					local35 ^= local38[3];
				}
			}
		}
		@Pc(148) boolean local148 = false;
		@Pc(150) boolean local150 = false;
		@Pc(152) boolean local152 = false;
		@Pc(160) boolean local160 = arg2 != null || arg11 != null;
		@Pc(167) int local167 = arg4 == null ? 0 : arg4.length;
		@Pc(200) int local200;
		@Pc(205) int local205;
		for (@Pc(169) int local169 = 0; local169 < local167; local169++) {
			Static65.aClass1_Sub1_Sub8Array27[local169] = null;
			if (arg4[local169] != null) {
				@Pc(186) Class280 local186 = arg15.method3574(arg4[local169].anInt127);
				if (local186.anIntArray629 != null) {
					Static156.aClass280Array1[local169] = local186;
					local160 = true;
					local200 = arg4[local169].anInt124;
					local205 = arg4[local169].anInt121;
					@Pc(210) int local210 = local186.anIntArray629[local200];
					Static65.aClass1_Sub1_Sub8Array27[local169] = arg15.method3573(local210 >>> 16);
					@Pc(223) int local223 = local210 & 0xFFFF;
					Static194.anIntArray314[local169] = local223;
					if (Static65.aClass1_Sub1_Sub8Array27[local169] != null) {
						local150 |= Static65.aClass1_Sub1_Sub8Array27[local169].method3251(local223);
						local148 |= Static65.aClass1_Sub1_Sub8Array27[local169].method3247(local223);
						local152 |= Static65.aClass1_Sub1_Sub8Array27[local169].method3245(local223);
					}
					if ((local186.aBoolean547 || Static306.aBoolean405) && local205 != -1 && local205 < local186.anIntArray629.length) {
						Static438.anIntArray200[local169] = local186.anIntArray630[local200];
						Static348.anIntArray476[local169] = arg4[local169].anInt129;
						@Pc(294) int local294 = local186.anIntArray629[local205];
						Static204.aClass1_Sub1_Sub8Array16[local169] = arg15.method3573(local294 >>> 16);
						@Pc(307) int local307 = local294 & 0xFFFF;
						Static166.anIntArray288[local169] = local307;
						if (Static204.aClass1_Sub1_Sub8Array16[local169] != null) {
							local150 |= Static204.aClass1_Sub1_Sub8Array16[local169].method3251(local307);
							local148 |= Static204.aClass1_Sub1_Sub8Array16[local169].method3247(local307);
							local152 |= Static204.aClass1_Sub1_Sub8Array16[local169].method3245(local307);
						}
					} else {
						Static438.anIntArray200[local169] = 0;
						Static348.anIntArray476[local169] = 0;
						Static204.aClass1_Sub1_Sub8Array16[local169] = null;
						Static166.anIntArray288[local169] = -1;
					}
				}
			}
		}
		@Pc(369) int local369 = -1;
		local200 = -1;
		local205 = 0;
		@Pc(375) Class1_Sub1_Sub8 local375 = null;
		@Pc(377) Class1_Sub1_Sub8 local377 = null;
		@Pc(379) int local379 = -1;
		@Pc(381) int local381 = -1;
		@Pc(383) int local383 = 0;
		@Pc(385) Class1_Sub1_Sub8 local385 = null;
		@Pc(387) Class1_Sub1_Sub8 local387 = null;
		if (local160) {
			local32 = arg8 | 0x20;
			@Pc(404) int local404;
			@Pc(468) int local468;
			if (arg2 != null) {
				local369 = arg2.anIntArray629[arg3];
				local404 = local369 >>> 16;
				local375 = arg15.method3573(local404);
				local369 &= 0xFFFF;
				if (local375 != null) {
					local150 |= local375.method3251(local369);
					local148 |= local375.method3247(local369);
					local152 |= local375.method3245(local369);
				}
				if ((arg2.aBoolean547 || Static306.aBoolean405) && arg16 != -1 && arg16 < arg2.anIntArray629.length) {
					local205 = arg2.anIntArray630[arg3];
					local200 = arg2.anIntArray629[arg16];
					local468 = local200 >>> 16;
					local200 &= 0xFFFF;
					local377 = local468 == local404 ? local375 : arg15.method3573(local468);
					if (local377 != null) {
						local150 |= local377.method3251(local200);
						local148 |= local377.method3247(local200);
						local152 |= local377.method3245(local200);
					}
				}
			}
			if (arg11 != null) {
				local379 = arg11.anIntArray629[arg7];
				local404 = local379 >>> 16;
				local385 = arg15.method3573(local404);
				local379 &= 0xFFFF;
				if (local385 != null) {
					local150 |= local385.method3251(local379);
					local148 |= local385.method3247(local379);
					local152 |= local385.method3245(local379);
				}
				if ((arg11.aBoolean547 || Static306.aBoolean405) && arg6 != -1 && arg6 < arg11.anIntArray629.length) {
					local383 = arg11.anIntArray630[arg7];
					local381 = arg11.anIntArray629[arg6];
					local468 = local381 >>> 16;
					local387 = local404 == local468 ? local385 : arg15.method3573(local468);
					local381 &= 0xFFFF;
					if (local387 != null) {
						local150 |= local387.method3251(local381);
						local148 |= local387.method3247(local381);
						local152 |= local387.method3245(local381);
					}
				}
			}
			if (local150) {
				local32 |= 0x80;
			}
			if (local148) {
				local32 |= 0x100;
			}
			if (local152) {
				local32 |= 0x400;
			}
		}
		@Pc(637) Class316 local637 = Static505.aClass316_61;
		@Pc(645) Class19 local645;
		synchronized (Static505.aClass316_61) {
			local645 = (Class19) Static505.aClass316_61.method7799(local35);
		}
		@Pc(653) Class255 local653 = null;
		if (this.anInt7363 != -1) {
			local653 = arg12.method869(this.anInt7363);
		}
		@Pc(696) int local696;
		@Pc(701) int local701;
		if (local645 == null || arg10.method7607(local645.ba(), local32) != 0 || local653 != null && local653.anIntArrayArray71 != null && this.anIntArrayArray72 == null) {
			if (local645 != null) {
				local32 = arg10.method7606(local32, local645.ba());
			}
			@Pc(694) boolean local694 = false;
			local696 = 0;
			while (true) {
				if (local696 >= 12) {
					if (local694) {
						if (this.aLong190 != -1L) {
							@Pc(1319) Class316 local1319 = Static505.aClass316_61;
							synchronized (Static505.aClass316_61) {
								local645 = (Class19) Static505.aClass316_61.method7799(this.aLong190);
							}
						}
						if (local645 == null || arg10.method7607(local645.ba(), local32) != 0 || local653 != null && local653.anIntArrayArray71 != null && this.anIntArrayArray72 == null) {
							return null;
						}
					} else {
						@Pc(745) Class86[] local745 = new Class86[12];
						@Pc(752) int local752;
						for (@Pc(747) int local747 = 0; local747 < 12; local747++) {
							local752 = local38[local747];
							@Pc(775) Class86 local775;
							if ((local752 & 0x40000000) != 0) {
								local775 = arg13.method4007(local752 & 0x3FFFFFFF).method5012(this.aBoolean487);
								if (local775 != null) {
									local745[local747] = local775;
								}
							} else if ((local752 & Integer.MIN_VALUE) != 0) {
								local775 = arg14.method1364(local752 & 0x3FFFFFFF).method5557();
								if (local775 != null) {
									local745[local747] = local775;
								}
							}
						}
						@Pc(830) int local830;
						if (local653 != null && local653.anIntArrayArray71 != null) {
							for (local752 = 0; local752 < local653.anIntArrayArray71.length; local752++) {
								if (local653.anIntArrayArray71[local752] != null && local745[local752] != null) {
									local830 = local653.anIntArrayArray71[local752][0];
									@Pc(837) int local837 = local653.anIntArrayArray71[local752][1];
									@Pc(844) int local844 = local653.anIntArrayArray71[local752][2];
									@Pc(853) int local853 = local653.anIntArrayArray71[local752][3] << 3;
									@Pc(862) int local862 = local653.anIntArrayArray71[local752][4] << 3;
									@Pc(871) int local871 = local653.anIntArrayArray71[local752][5] << 3;
									if (this.anIntArrayArray72 == null) {
										this.anIntArrayArray72 = new int[local653.anIntArrayArray71.length][];
									}
									if (this.anIntArrayArray72[local752] == null) {
										@Pc(893) int[] local893 = this.anIntArrayArray72[local752] = new int[15];
										if (local853 == 0 && local862 == 0 && local871 == 0) {
											local893[13] = -local837;
											local893[0] = local893[4] = local893[8] = 32768;
											local893[14] = -local844;
											local893[12] = -local830;
										} else {
											@Pc(934) int local934 = Class307.anIntArray743[local853];
											@Pc(938) int local938 = Class307.anIntArray744[local853];
											@Pc(942) int local942 = Class307.anIntArray743[local862];
											@Pc(946) int local946 = Class307.anIntArray744[local862];
											@Pc(950) int local950 = Class307.anIntArray743[local871];
											@Pc(954) int local954 = Class307.anIntArray744[local871];
											@Pc(962) int local962 = local950 * local938 + 16384 >> 15;
											@Pc(970) int local970 = local938 * local954 + 16384 >> 15;
											local893[6] = -local946 * local950 + local942 * local970 + 16384 >> 15;
											local893[7] = -local954 * -local946 + local962 * local942 + 16384 >> 15;
											local893[0] = local946 * local970 + local942 * local950 + 16384 >> 15;
											local893[8] = local942 * local934 + 16384 >> 15;
											local893[2] = local946 * local934 + 16384 >> 15;
											local893[4] = local934 * local950 + 16384 >> 15;
											local893[3] = local954 * local934 + 16384 >> 15;
											local893[5] = -local938;
											local893[1] = local942 * -local954 + local962 * local946 + 16384 >> 15;
											local893[12] = local893[3] * -local837 + -local830 * local893[0] + -local844 * local893[6] + 16384 >> 15;
											local893[13] = -local844 * local893[7] + local893[1] * -local830 + -local837 * local893[4] + 16384 >> 15;
											local893[14] = -local830 * local893[2] + -local837 * local893[5] + local893[8] * -local844 + 16384 >> 15;
										}
										local893[10] = local837;
										local893[9] = local830;
										local893[11] = local844;
									}
									if (local853 != 0 || local862 != 0 || local871 != 0) {
										local745[local752].method2797(local853, local871, local862);
									}
									if (local830 != 0 || local837 != 0 || local844 != 0) {
										local745[local752].method2792(local830, local844, local837);
									}
								}
							}
						}
						@Pc(1221) Class86 local1221 = new Class86(local745, local745.length);
						@Pc(1225) int local1225 = local32 | 0x4000;
						local645 = arg10.method7635(local1221, local1225, Static30.anInt1206, 64, 850);
						for (local830 = 0; local830 < 5; local830++) {
							if (this.anIntArray582[local830] < Static432.aShortArrayArray12[local830].length) {
								local645.pa(Static531.aShortArray169[local830], Static432.aShortArrayArray12[local830][this.anIntArray582[local830]]);
							}
							if (this.anIntArray582[local830] < Static409.aShortArrayArray9[local830].length) {
								local645.pa(Static65.aShortArray158[local830], Static409.aShortArrayArray9[local830][this.anIntArray582[local830]]);
							}
						}
						local645.m(local32);
						@Pc(1295) Class316 local1295 = Static505.aClass316_61;
						synchronized (Static505.aClass316_61) {
							Static505.aClass316_61.method7792(local35, local645);
						}
						this.aLong190 = local35;
					}
					break;
				}
				local701 = local38[local696];
				if ((local701 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local701) != 0 && !arg14.method1364(local701 & 0x3FFFFFFF).method5562()) {
						local694 = true;
					}
				} else if (!arg13.method4007(local701 & 0x3FFFFFFF).method5014(this.aBoolean487)) {
					local694 = true;
				}
				local696++;
			}
		}
		@Pc(1361) Class19 local1361 = local645.method7260((byte) 4, local32, true);
		if (!local160) {
			return local1361;
		}
		@Pc(1367) int local1367 = 0;
		local696 = 1;
		while (local1367 < local167) {
			if (Static65.aClass1_Sub1_Sub8Array27[local1367] != null) {
				local1361.method7254(local696, Static65.aClass1_Sub1_Sub8Array27[local1367], Static166.anIntArray288[local1367], this.anIntArrayArray72 == null ? null : this.anIntArrayArray72[local1367], Static348.anIntArray476[local1367] - 1, Static204.aClass1_Sub1_Sub8Array16[local1367], Static438.anIntArray200[local1367], false, Static194.anIntArray314[local1367]);
			}
			local696 <<= 0x1;
			local1367++;
		}
		if (local375 != null && local385 != null) {
			local1361.method7247(local377, local375, local369, local385, false, local379, arg5 - 1, local205, arg2.aBooleanArray31, local200, local383, local387, arg9 - 1, local381);
		} else if (local375 != null) {
			local1361.method7250(local375, local377, local205, local200, 0, local369, arg9 - 1, false);
		} else if (local385 != null) {
			local1361.method7250(local385, local387, local383, local381, 0, local379, arg5 - 1, false);
		}
		for (local701 = 0; local701 < local167; local701++) {
			Static65.aClass1_Sub1_Sub8Array27[local701] = null;
			Static204.aClass1_Sub1_Sub8Array16[local701] = null;
			Static156.aClass280Array1[local701] = null;
		}
		return local1361;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "([I[IIZII)V")
	public void method6284(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aBoolean487 = arg3;
		this.anIntArray582 = arg0;
		this.anIntArray583 = arg1;
		if (this.anInt7363 != arg4) {
			this.anIntArrayArray72 = null;
			this.anInt7363 = arg4;
		}
		this.anInt7362 = arg2;
		this.method6285();
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
	private void method6285() {
		@Pc(5) long[] local5 = Class132.aLongArray3;
		this.aLong189 = -1L;
		this.aLong189 = this.aLong189 >>> 8 ^ local5[(int) (((long) (this.anInt7363 >> 8) ^ this.aLong189) & 0xFFL)];
		this.aLong189 = local5[(int) (((long) this.anInt7363 ^ this.aLong189) & 0xFFL)] ^ this.aLong189 >>> 8;
		for (@Pc(54) int local54 = 0; local54 < 12; local54++) {
			this.aLong189 = this.aLong189 >>> 8 ^ local5[(int) ((this.aLong189 ^ (long) (this.anIntArray583[local54] >> 24)) & 0xFFL)];
			this.aLong189 = local5[(int) (((long) (this.anIntArray583[local54] >> 16) ^ this.aLong189) & 0xFFL)] ^ this.aLong189 >>> 8;
			this.aLong189 = local5[(int) (((long) (this.anIntArray583[local54] >> 8) ^ this.aLong189) & 0xFFL)] ^ this.aLong189 >>> 8;
			this.aLong189 = this.aLong189 >>> 8 ^ local5[(int) (((long) this.anIntArray583[local54] ^ this.aLong189) & 0xFFL)];
		}
		for (@Pc(147) int local147 = 0; local147 < 5; local147++) {
			this.aLong189 = local5[(int) ((this.aLong189 ^ (long) this.anIntArray582[local147]) & 0xFFL)] ^ this.aLong189 >>> 8;
		}
		this.aLong189 = this.aLong189 >>> 8 ^ local5[(int) (((long) (this.aBoolean487 ? 1 : 0) ^ this.aLong189) & 0xFFL)];
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIILclient!ht;ILclient!tt;ILclient!qa;Lclient!bo;III)Lclient!r;")
	public Class19 method6286(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class126 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class280 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class9 arg6, @OriginalArg(8) Class34 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9) {
		@Pc(11) int local11 = 2048;
		@Pc(103) int local103;
		if (arg4 != null) {
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			@Pc(19) boolean local19 = false;
			@Pc(21) boolean local21 = false;
			@Pc(32) int local32 = arg4.anIntArray629[arg5];
			local11 = 2080;
			@Pc(42) int local42 = local32 >>> 16;
			@Pc(47) Class1_Sub1_Sub8 local47 = arg2.method3573(local42);
			@Pc(51) int local51 = local32 & 0xFFFF;
			if (local47 != null) {
				local17 = local47.method3251(local51) | false;
				local15 = local47.method3247(local51) | false;
				local21 = local47.method3245(local51) | false;
				local19 = arg4.aBoolean548 | false;
			}
			if ((arg4.aBoolean547 || Static306.aBoolean405) && arg8 != -1 && arg4.anIntArray629.length > arg8) {
				local103 = arg4.anIntArray629[arg8];
				@Pc(107) int local107 = local103 >>> 16;
				@Pc(111) int local111 = local103 & 0xFFFF;
				@Pc(127) Class1_Sub1_Sub8 local127;
				if (local107 == local42) {
					local127 = local47;
				} else {
					local127 = arg2.method3573(local111 >>> 16);
				}
				if (local127 != null) {
					local17 |= local127.method3251(local111);
					local15 |= local127.method3247(local111);
					local21 |= local127.method3245(local111);
				}
			}
			if (local17) {
				local11 = 2208;
			}
			if (local15) {
				local11 |= 0x100;
			}
			if (local19) {
				local11 |= 0x200;
			}
			if (local21) {
				local11 |= 0x400;
			}
		}
		@Pc(192) long local192 = (long) (arg9 << 16) | (long) arg3 << 32 | (long) arg1;
		@Pc(194) Class316 local194 = Static140.aClass316_16;
		@Pc(204) Class19 local204;
		synchronized (Static140.aClass316_16) {
			local204 = (Class19) Static140.aClass316_16.method7799(local192);
		}
		if (local204 == null || arg6.method7607(local204.ba(), local11) != 0) {
			if (local204 != null) {
				local11 = arg6.method7606(local11, local204.ba());
			}
			@Pc(231) Class86[] local231 = new Class86[3];
			local103 = 0;
			if (!arg7.method1364(arg1).method5563() || !arg7.method1364(arg9).method5563() || !arg7.method1364(arg3).method5563()) {
				return null;
			}
			@Pc(265) Class86 local265 = arg7.method1364(arg1).method5558();
			if (local265 != null) {
				local103++;
				local231[0] = local265;
			}
			local265 = arg7.method1364(arg9).method5558();
			if (local265 != null) {
				local231[local103++] = local265;
			}
			local265 = arg7.method1364(arg3).method5558();
			if (local265 != null) {
				local231[local103++] = local265;
			}
			@Pc(304) int local304 = local11 | 0x4000;
			local265 = new Class86(local231, local103);
			local204 = arg6.method7635(local265, local304, Static30.anInt1206, 64, 768);
			for (@Pc(320) int local320 = 0; local320 < 5; local320++) {
				if (Static432.aShortArrayArray12[local320].length > this.anIntArray582[local320]) {
					local204.pa(Static531.aShortArray169[local320], Static432.aShortArrayArray12[local320][this.anIntArray582[local320]]);
				}
				if (this.anIntArray582[local320] < Static409.aShortArrayArray9[local320].length) {
					local204.pa(Static65.aShortArray158[local320], Static409.aShortArrayArray9[local320][this.anIntArray582[local320]]);
				}
			}
			local204.m(local11);
			@Pc(382) Class316 local382 = Static140.aClass316_16;
			synchronized (Static140.aClass316_16) {
				Static140.aClass316_16.method7792(local192, local204);
			}
		}
		if (arg4 == null) {
			return local204;
		} else {
			local204 = local204.method7260((byte) 4, local11, true);
			return arg4.method6873(arg8, 2048, local204, arg5, arg0);
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!op;ILclient!jn;Lclient!qa;Lclient!bo;Lclient!ht;Lclient!nc;IIILclient!tt;I)Lclient!r;")
	public Class19 method6289(@OriginalArg(0) Class222 arg0, @OriginalArg(2) Class153 arg1, @OriginalArg(3) Class9 arg2, @OriginalArg(4) Class34 arg3, @OriginalArg(5) Class126 arg4, @OriginalArg(6) Interface10 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(10) Class280 arg8, @OriginalArg(11) int arg9) {
		if (this.anInt7362 != -1) {
			return arg0.method5587(this.anInt7362).method5859(arg5, arg6, arg9, arg4, arg2, arg7, arg8);
		}
		@Pc(25) int local25 = 2048;
		@Pc(33) boolean local33;
		@Pc(50) int local50;
		@Pc(116) int local116;
		@Pc(56) int local56;
		if (arg8 != null) {
			@Pc(29) boolean local29 = false;
			@Pc(31) boolean local31 = false;
			local33 = false;
			@Pc(35) boolean local35 = false;
			local25 = 2080;
			local50 = arg8.anIntArray629[arg6];
			local56 = local50 >>> 16;
			@Pc(61) Class1_Sub1_Sub8 local61 = arg4.method3573(local56);
			@Pc(65) int local65 = local50 & 0xFFFF;
			if (local61 != null) {
				local31 = local61.method3251(local65) | false;
				local29 = local61.method3247(local65) | false;
				local35 = local61.method3245(local65) | false;
				local33 = arg8.aBoolean548 | false;
			}
			if ((arg8.aBoolean547 || Static306.aBoolean405) && arg9 != -1 && arg9 < arg8.anIntArray629.length) {
				local116 = arg8.anIntArray629[arg9];
				@Pc(120) int local120 = local116 >>> 16;
				@Pc(124) int local124 = local116 & 0xFFFF;
				@Pc(134) Class1_Sub1_Sub8 local134 = local120 == local56 ? local61 : arg4.method3573(local120);
				if (local134 != null) {
					local31 |= local134.method3251(local124);
					local29 |= local134.method3247(local124);
					local35 |= local134.method3245(local124);
				}
			}
			if (local31) {
				local25 = 2208;
			}
			if (local29) {
				local25 |= 0x100;
			}
			if (local33) {
				local25 |= 0x200;
			}
			if (local35) {
				local25 |= 0x400;
			}
		}
		@Pc(183) Class316 local183 = Static140.aClass316_16;
		@Pc(192) Class19 local192;
		synchronized (Static140.aClass316_16) {
			local192 = (Class19) Static140.aClass316_16.method7799(this.aLong189);
		}
		if (local192 == null || arg2.method7607(local192.ba(), local25) != 0) {
			if (local192 != null) {
				local25 = arg2.method7606(local25, local192.ba());
			}
			local33 = false;
			for (@Pc(225) int local225 = 0; local225 < 12; local225++) {
				local50 = this.anIntArray583[local225];
				if ((local50 & 0x40000000) == 0) {
					if ((local50 & Integer.MIN_VALUE) != 0 && !arg3.method1364(local50 & 0x3FFFFFFF).method5563()) {
						local33 = true;
					}
				} else if (!arg1.method4007(local50 & 0x3FFFFFFF).method5010(this.aBoolean487)) {
					local33 = true;
				}
			}
			if (local33) {
				return null;
			}
			@Pc(283) Class86[] local283 = new Class86[12];
			local116 = 0;
			for (@Pc(287) int local287 = 0; local287 < 12; local287++) {
				@Pc(293) int local293 = this.anIntArray583[local287];
				@Pc(311) Class86 local311;
				if ((local293 & 0x40000000) != 0) {
					local311 = arg1.method4007(local293 & 0x3FFFFFFF).method5013(this.aBoolean487);
					if (local311 != null) {
						local283[local116++] = local311;
					}
				} else if ((Integer.MIN_VALUE & local293) != 0) {
					local311 = arg3.method1364(local293 & 0x3FFFFFFF).method5558();
					if (local311 != null) {
						local283[local116++] = local311;
					}
				}
			}
			@Pc(354) Class86 local354 = new Class86(local283, local116);
			@Pc(358) int local358 = local25 | 0x4000;
			local192 = arg2.method7635(local354, local358, Static30.anInt1206, 64, 768);
			for (local56 = 0; local56 < 5; local56++) {
				if (this.anIntArray582[local56] < Static432.aShortArrayArray12[local56].length) {
					local192.pa(Static531.aShortArray169[local56], Static432.aShortArrayArray12[local56][this.anIntArray582[local56]]);
				}
				if (this.anIntArray582[local56] < Static409.aShortArrayArray9[local56].length) {
					local192.pa(Static65.aShortArray158[local56], Static409.aShortArrayArray9[local56][this.anIntArray582[local56]]);
				}
			}
			local192.m(local25);
			@Pc(422) Class316 local422 = Static140.aClass316_16;
			synchronized (Static140.aClass316_16) {
				Static140.aClass316_16.method7792(this.aLong189, local192);
			}
		}
		if (arg8 == null) {
			return local192;
		} else {
			local192.method7260((byte) 4, local25, true);
			return arg8.method6873(arg9, 2048, local192, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!bo;III)V")
	public void method6290(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(25) int local25 = Static391.anIntArray513[arg1];
		if (this.anIntArray583[local25] != 0 && arg0.method1364(arg2) != null) {
			this.anIntArray583[local25] = Integer.MIN_VALUE | arg2;
			this.method6285();
		}
	}
}
