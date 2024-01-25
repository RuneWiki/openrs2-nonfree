import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class58 {

	@OriginalMember(owner = "client!co", name = "a", descriptor = "Z")
	public boolean aBoolean130;

	@OriginalMember(owner = "client!co", name = "c", descriptor = "[I")
	public int[] anIntArray178;

	@OriginalMember(owner = "client!co", name = "e", descriptor = "[I")
	private int[] anIntArray179;

	@OriginalMember(owner = "client!co", name = "j", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!co", name = "k", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!co", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!co", name = "p", descriptor = "I")
	private int anInt1702;

	@OriginalMember(owner = "client!co", name = "h", descriptor = "I")
	public int anInt1697 = -1;

	static {
		new Class88("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IBLclient!ea;I)V")
	public void method1585(@OriginalArg(0) int arg0, @OriginalArg(2) Class78 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = Static183.anIntArray318[arg0];
		if (this.anIntArray179[local7] != 0 && arg1.method2172(arg2) != null) {
			this.anIntArray179[local7] = arg2 | Integer.MIN_VALUE;
			this.method1591();
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIZ[I[I)V")
	public void method1586(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4) {
		if (this.anInt1702 != arg1) {
			this.anIntArrayArray20 = null;
			this.anInt1702 = arg1;
		}
		this.aBoolean130 = arg2;
		this.anIntArray178 = arg3;
		this.anIntArray179 = arg4;
		this.anInt1697 = arg0;
		this.method1591();
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I[Lclient!tr;Lclient!ea;Lclient!jj;IIILclient!dba;ZLclient!qm;Lclient!dba;Lclient!bu;IBLclient!kca;Lclient!gba;ILclient!qa;I)Lclient!r;")
	public Class26 method1587(@OriginalArg(0) int arg0, @OriginalArg(1) Class288[] arg1, @OriginalArg(2) Class78 arg2, @OriginalArg(3) Class160 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class64 arg7, @OriginalArg(9) Class254 arg8, @OriginalArg(10) Class64 arg9, @OriginalArg(11) Class41 arg10, @OriginalArg(12) int arg11, @OriginalArg(14) Interface9 arg12, @OriginalArg(15) Class110 arg13, @OriginalArg(16) int arg14, @OriginalArg(17) Class42 arg15, @OriginalArg(18) int arg16) {
		if (this.anInt1697 != -1) {
			return arg13.method3018(this.anInt1697).method3565(arg15, arg16, arg11, arg7, arg10, arg4, arg6, arg9, arg3, arg14, arg0, arg1, arg5, arg12);
		}
		@Pc(34) int local34 = arg5;
		@Pc(37) long local37 = this.aLong30;
		@Pc(40) int[] local40 = this.anIntArray179;
		if (arg9 != null && (arg9.anInt1969 >= 0 || arg9.anInt1958 >= 0)) {
			local40 = new int[12];
			for (@Pc(56) int local56 = 0; local56 < 12; local56++) {
				local40[local56] = this.anIntArray179[local56];
			}
			if (arg9.anInt1969 >= 0) {
				if (arg9.anInt1969 == 65535) {
					local37 ^= 0xFFFFFFFF00000000L;
					local40[5] = 0;
				} else {
					local40[5] = arg9.anInt1969 | 0x40000000;
					local37 ^= (long) local40[5] << 32;
				}
			}
			if (arg9.anInt1958 >= 0) {
				if (arg9.anInt1958 == 65535) {
					local37 ^= 0xFFFFFFFFL;
					local40[3] = 0;
				} else {
					local40[3] = arg9.anInt1958 | 0x40000000;
					local37 ^= local40[3];
				}
			}
		}
		@Pc(141) boolean local141 = false;
		@Pc(151) boolean local151 = false;
		@Pc(153) boolean local153 = false;
		@Pc(161) boolean local161 = arg9 != null || arg7 != null;
		@Pc(168) int local168 = arg1 == null ? 0 : arg1.length;
		@Pc(202) int local202;
		@Pc(207) int local207;
		for (@Pc(170) int local170 = 0; local170 < local168; local170++) {
			Static9.aClass12_Sub4_Sub13Array1[local170] = null;
			if (arg1[local170] != null) {
				@Pc(188) Class64 local188 = arg10.method911(arg1[local170].anInt8706);
				if (local188.anIntArray185 != null) {
					Static137.aClass64Array2[local170] = local188;
					local161 = true;
					local202 = arg1[local170].anInt8701;
					local207 = arg1[local170].anInt8704;
					@Pc(212) int local212 = local188.anIntArray185[local202];
					Static9.aClass12_Sub4_Sub13Array1[local170] = arg10.method910(local212 >>> 16);
					@Pc(225) int local225 = local212 & 0xFFFF;
					Static72.anIntArray180[local170] = local225;
					if (Static9.aClass12_Sub4_Sub13Array1[local170] != null) {
						local151 |= Static9.aClass12_Sub4_Sub13Array1[local170].method5401(local225);
						local141 |= Static9.aClass12_Sub4_Sub13Array1[local170].method5402(local225);
						local153 |= Static9.aClass12_Sub4_Sub13Array1[local170].method5403(local225);
					}
					if ((local188.aBoolean139 || Static358.aBoolean490) && local207 != -1 && local188.anIntArray185.length > local207) {
						Static480.anIntArray650[local170] = local188.anIntArray184[local202];
						Static149.anIntArray244[local170] = arg1[local170].anInt8708;
						@Pc(311) int local311 = local188.anIntArray185[local207];
						Static381.aClass12_Sub4_Sub13Array4[local170] = arg10.method910(local311 >>> 16);
						@Pc(324) int local324 = local311 & 0xFFFF;
						Static434.anIntArray601[local170] = local324;
						if (Static381.aClass12_Sub4_Sub13Array4[local170] != null) {
							local151 |= Static381.aClass12_Sub4_Sub13Array4[local170].method5401(local324);
							local141 |= Static381.aClass12_Sub4_Sub13Array4[local170].method5402(local324);
							local153 |= Static381.aClass12_Sub4_Sub13Array4[local170].method5403(local324);
						}
					} else {
						Static480.anIntArray650[local170] = 0;
						Static149.anIntArray244[local170] = 0;
						Static381.aClass12_Sub4_Sub13Array4[local170] = null;
						Static434.anIntArray601[local170] = -1;
					}
				}
			}
		}
		@Pc(369) int local369 = -1;
		local202 = -1;
		local207 = 0;
		@Pc(375) Class12_Sub4_Sub13 local375 = null;
		@Pc(377) Class12_Sub4_Sub13 local377 = null;
		@Pc(379) int local379 = -1;
		@Pc(381) int local381 = -1;
		@Pc(383) int local383 = 0;
		@Pc(385) Class12_Sub4_Sub13 local385 = null;
		@Pc(387) Class12_Sub4_Sub13 local387 = null;
		if (local161) {
			@Pc(400) int local400;
			@Pc(460) int local460;
			if (arg9 != null) {
				local369 = arg9.anIntArray185[arg16];
				local400 = local369 >>> 16;
				local369 &= 0xFFFF;
				local375 = arg10.method910(local400);
				if (local375 != null) {
					local151 |= local375.method5401(local369);
					local141 |= local375.method5402(local369);
					local153 |= local375.method5403(local369);
				}
				if ((arg9.aBoolean139 || Static358.aBoolean490) && arg4 != -1 && arg4 < arg9.anIntArray185.length) {
					local207 = arg9.anIntArray184[arg16];
					local202 = arg9.anIntArray185[arg4];
					local460 = local202 >>> 16;
					local202 &= 0xFFFF;
					local377 = local460 == local400 ? local375 : arg10.method910(local460);
					if (local377 != null) {
						local151 |= local377.method5401(local202);
						local141 |= local377.method5402(local202);
						local153 |= local377.method5403(local202);
					}
				}
			}
			local34 = arg5 | 0x20;
			if (arg7 != null) {
				local379 = arg7.anIntArray185[arg11];
				local400 = local379 >>> 16;
				local379 &= 0xFFFF;
				local385 = arg10.method910(local400);
				if (local385 != null) {
					local151 |= local385.method5401(local379);
					local141 |= local385.method5402(local379);
					local153 |= local385.method5403(local379);
				}
				if ((arg7.aBoolean139 || Static358.aBoolean490) && arg6 != -1 && arg7.anIntArray185.length > arg6) {
					local381 = arg7.anIntArray185[arg6];
					local383 = arg7.anIntArray184[arg11];
					local460 = local381 >>> 16;
					local381 &= 0xFFFF;
					local387 = local460 == local400 ? local385 : arg10.method910(local460);
					if (local387 != null) {
						local151 |= local387.method5401(local381);
						local141 |= local387.method5402(local381);
						local153 |= local387.method5403(local381);
					}
				}
			}
			if (local151) {
				local34 |= 0x80;
			}
			if (local141) {
				local34 |= 0x100;
			}
			if (local153) {
				local34 |= 0x400;
			}
		}
		@Pc(636) Class125 local636 = Static156.aClass125_21;
		@Pc(644) Class26 local644;
		synchronized (Static156.aClass125_21) {
			local644 = (Class26) Static156.aClass125_21.method3446(local37);
		}
		@Pc(652) Class166 local652 = null;
		if (this.anInt1702 != -1) {
			local652 = arg3.method4121(this.anInt1702);
		}
		@Pc(692) int local692;
		@Pc(698) int local698;
		if (local644 == null || arg15.method5857(local644.ba(), local34) != 0 || local652 != null && local652.anIntArrayArray48 != null && this.anIntArrayArray20 == null) {
			if (local644 != null) {
				local34 = arg15.method5820(local34, local644.ba());
			}
			@Pc(690) boolean local690 = false;
			local692 = 0;
			while (true) {
				if (local692 >= 12) {
					if (local690) {
						if (this.aLong29 != -1L) {
							@Pc(1332) Class125 local1332 = Static156.aClass125_21;
							synchronized (Static156.aClass125_21) {
								local644 = (Class26) Static156.aClass125_21.method3446(this.aLong29);
							}
						}
						if (local644 == null || arg15.method5857(local644.ba(), local34) != 0 || local652 != null && local652.anIntArrayArray48 != null && this.anIntArrayArray20 == null) {
							return null;
						}
					} else {
						@Pc(744) Class192[] local744 = new Class192[12];
						@Pc(752) int local752;
						for (@Pc(746) int local746 = 0; local746 < 12; local746++) {
							local752 = local40[local746];
							@Pc(767) Class192 local767;
							if ((local752 & 0x40000000) != 0) {
								local767 = arg8.method6340(local752 & 0x3FFFFFFF).method1565(this.aBoolean130);
								if (local767 != null) {
									local744[local746] = local767;
								}
							} else if ((Integer.MIN_VALUE & local752) != 0) {
								local767 = arg2.method2172(local752 & 0x3FFFFFFF).method7742();
								if (local767 != null) {
									local744[local746] = local767;
								}
							}
						}
						@Pc(827) int local827;
						if (local652 != null && local652.anIntArrayArray48 != null) {
							for (local752 = 0; local752 < local652.anIntArrayArray48.length; local752++) {
								if (local652.anIntArrayArray48[local752] != null && local744[local752] != null) {
									local827 = local652.anIntArrayArray48[local752][0];
									@Pc(834) int local834 = local652.anIntArrayArray48[local752][1];
									@Pc(841) int local841 = local652.anIntArrayArray48[local752][2];
									@Pc(850) int local850 = local652.anIntArrayArray48[local752][3] << 3;
									@Pc(859) int local859 = local652.anIntArrayArray48[local752][4] << 3;
									@Pc(868) int local868 = local652.anIntArrayArray48[local752][5] << 3;
									if (this.anIntArrayArray20 == null) {
										this.anIntArrayArray20 = new int[local652.anIntArrayArray48.length][];
									}
									if (this.anIntArrayArray20[local752] == null) {
										@Pc(890) int[] local890 = this.anIntArrayArray20[local752] = new int[15];
										if (local850 == 0 && local859 == 0 && local868 == 0) {
											local890[0] = local890[4] = local890[8] = 32768;
											local890[13] = -local834;
											local890[14] = -local841;
											local890[12] = -local827;
										} else {
											@Pc(935) int local935 = Class12_Sub1_Sub36.anIntArray668[local850];
											@Pc(939) int local939 = Class12_Sub1_Sub36.anIntArray667[local850];
											@Pc(943) int local943 = Class12_Sub1_Sub36.anIntArray668[local859];
											@Pc(947) int local947 = Class12_Sub1_Sub36.anIntArray667[local859];
											@Pc(951) int local951 = Class12_Sub1_Sub36.anIntArray668[local868];
											@Pc(955) int local955 = Class12_Sub1_Sub36.anIntArray667[local868];
											@Pc(963) int local963 = local951 * local939 + 16384 >> 15;
											@Pc(971) int local971 = local939 * local955 + 16384 >> 15;
											local890[5] = -local939;
											local890[1] = -local955 * local943 + local947 * local963 + 16384 >> 15;
											local890[7] = -local955 * -local947 + local943 * local963 + 16384 >> 15;
											local890[3] = local935 * local955 + 16384 >> 15;
											local890[0] = local943 * local951 + local971 * local947 + 16384 >> 15;
											local890[4] = local951 * local935 + 16384 >> 15;
											local890[6] = local951 * -local947 + local971 * local943 + 16384 >> 15;
											local890[2] = local947 * local935 + 16384 >> 15;
											local890[8] = local935 * local943 + 16384 >> 15;
											local890[12] = -local841 * local890[6] + -local834 * local890[3] + local890[0] * -local827 + 16384 >> 15;
											local890[14] = local890[5] * -local834 + local890[2] * -local827 + -local841 * local890[8] + 16384 >> 15;
											local890[13] = local890[4] * -local834 + local890[1] * -local827 + local890[7] * -local841 + 16384 >> 15;
										}
										local890[11] = local841;
										local890[10] = local834;
										local890[9] = local827;
									}
									if (local850 != 0 || local859 != 0 || local868 != 0) {
										local744[local752].method4665(local868, local859, local850);
									}
									if (local827 != 0 || local834 != 0 || local841 != 0) {
										local744[local752].method4662(local841, local834, local827);
									}
								}
							}
						}
						@Pc(1227) int local1227 = local34 | 0x4000;
						@Pc(1234) Class192 local1234 = new Class192(local744, local744.length);
						local644 = arg15.method5812(local1234, local1227, Static391.anInt6916, 64, 850);
						for (local827 = 0; local827 < 5; local827++) {
							if (this.anIntArray178[local827] < Static468.aShortArrayArray10[local827].length) {
								local644.pa(Static516.aShortArray136[local827], Static468.aShortArrayArray10[local827][this.anIntArray178[local827]]);
							}
							if (this.anIntArray178[local827] < Static350.aShortArrayArray5[local827].length) {
								local644.pa(Static437.aShortArray106[local827], Static350.aShortArrayArray5[local827][this.anIntArray178[local827]]);
							}
						}
						local644.m(local34);
						@Pc(1307) Class125 local1307 = Static156.aClass125_21;
						synchronized (Static156.aClass125_21) {
							Static156.aClass125_21.method3437(local644, local37);
						}
						this.aLong29 = local37;
					}
					break;
				}
				local698 = local40[local692];
				if ((local698 & 0x40000000) == 0) {
					if ((local698 & Integer.MIN_VALUE) != 0 && !arg2.method2172(local698 & 0x3FFFFFFF).method7741()) {
						local690 = true;
					}
				} else if (!arg8.method6340(local698 & 0x3FFFFFFF).method1562(this.aBoolean130)) {
					local690 = true;
				}
				local692++;
			}
		}
		@Pc(1374) Class26 local1374 = local644.method7992((byte) 4, local34, true);
		if (!local161) {
			return local1374;
		}
		@Pc(1380) int local1380 = 0;
		local692 = 1;
		while (local168 > local1380) {
			if (Static9.aClass12_Sub4_Sub13Array1[local1380] != null) {
				local1374.method8000(Static434.anIntArray601[local1380], Static9.aClass12_Sub4_Sub13Array1[local1380], false, Static72.anIntArray180[local1380], this.anIntArrayArray20 == null ? null : this.anIntArrayArray20[local1380], Static480.anIntArray650[local1380], local692, Static381.aClass12_Sub4_Sub13Array4[local1380], Static149.anIntArray244[local1380] - 1);
			}
			local1380++;
			local692 <<= 0x1;
		}
		if (local375 != null && local385 != null) {
			local1374.method8007(local377, local369, arg0 - 1, local385, local202, false, local379, arg14 - 1, arg9.aBooleanArray19, local383, local375, local207, local381, local387);
		} else if (local375 != null) {
			local1374.method8001(0, local377, false, local375, local369, local207, local202, arg0 - 1);
		} else if (local385 != null) {
			local1374.method8001(0, local387, false, local385, local379, local383, local381, arg14 - 1);
		}
		for (local698 = 0; local698 < local168; local698++) {
			Static9.aClass12_Sub4_Sub13Array1[local698] = null;
			Static381.aClass12_Sub4_Sub13Array4[local698] = null;
			Static137.aClass64Array2[local698] = null;
		}
		return local1374;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZI)V")
	public void method1588(@OriginalArg(0) boolean arg0) {
		this.aBoolean130 = arg0;
		this.method1591();
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!qa;Lclient!dba;ZIIILclient!ea;IIIILclient!bu;)Lclient!r;")
	public Class26 method1589(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class64 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class78 arg5, @OriginalArg(7) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class41 arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(97) int local97;
		if (arg1 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			@Pc(28) int local28 = arg1.anIntArray185[arg3];
			local7 = 2080;
			@Pc(38) int local38 = local28 >>> 16;
			@Pc(43) Class12_Sub4_Sub13 local43 = arg9.method910(local38);
			@Pc(47) int local47 = local28 & 0xFFFF;
			if (local43 != null) {
				local13 = local43.method5401(local47) | false;
				local11 = local43.method5402(local47) | false;
				local17 = local43.method5403(local47) | false;
				local15 = arg1.aBoolean138 | false;
			}
			if ((arg1.aBoolean139 || Static358.aBoolean490) && arg6 != -1 && arg6 < arg1.anIntArray185.length) {
				local97 = arg1.anIntArray185[arg6];
				@Pc(101) int local101 = local97 >>> 16;
				@Pc(105) int local105 = local97 & 0xFFFF;
				@Pc(114) Class12_Sub4_Sub13 local114;
				if (local101 == local38) {
					local114 = local43;
				} else {
					local114 = arg9.method910(local105 >>> 16);
				}
				if (local114 != null) {
					local13 |= local114.method5401(local105);
					local11 |= local114.method5402(local105);
					local17 |= local114.method5403(local105);
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
		@Pc(186) long local186 = (long) arg4 << 32 | (long) (arg7 << 16) | (long) arg2;
		@Pc(188) Class125 local188 = Static268.aClass125_41;
		@Pc(196) Class26 local196;
		synchronized (Static268.aClass125_41) {
			local196 = (Class26) Static268.aClass125_41.method3446(local186);
		}
		if (local196 == null || arg0.method5857(local196.ba(), local7) != 0) {
			if (local196 != null) {
				local7 = arg0.method5820(local7, local196.ba());
			}
			@Pc(223) Class192[] local223 = new Class192[3];
			local97 = 0;
			if (!arg5.method2172(arg2).method7750() || !arg5.method2172(arg7).method7750() || !arg5.method2172(arg4).method7750()) {
				return null;
			}
			@Pc(255) Class192 local255 = arg5.method2172(arg2).method7748();
			if (local255 != null) {
				local97++;
				local223[0] = local255;
			}
			local255 = arg5.method2172(arg7).method7748();
			if (local255 != null) {
				local223[local97++] = local255;
			}
			local255 = arg5.method2172(arg4).method7748();
			if (local255 != null) {
				local223[local97++] = local255;
			}
			@Pc(294) int local294 = local7 | 0x4000;
			local255 = new Class192(local223, local97);
			local196 = arg0.method5812(local255, local294, Static391.anInt6916, 64, 768);
			for (@Pc(310) int local310 = 0; local310 < 5; local310++) {
				if (this.anIntArray178[local310] < Static468.aShortArrayArray10[local310].length) {
					local196.pa(Static516.aShortArray136[local310], Static468.aShortArrayArray10[local310][this.anIntArray178[local310]]);
				}
				if (Static350.aShortArrayArray5[local310].length > this.anIntArray178[local310]) {
					local196.pa(Static437.aShortArray106[local310], Static350.aShortArrayArray5[local310][this.anIntArray178[local310]]);
				}
			}
			local196.m(local7);
			@Pc(371) Class125 local371 = Static268.aClass125_41;
			synchronized (Static268.aClass125_41) {
				Static268.aClass125_41.method3437(local196, local186);
			}
		}
		if (arg1 == null) {
			return local196;
		} else {
			local196 = local196.method7992((byte) 4, local7, true);
			return arg1.method1826(arg8, 2048, arg3, local196, arg6);
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(III)V")
	public void method1590(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray178[arg0] = arg1;
		this.method1591();
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V")
	private void method1591() {
		@Pc(7) long[] local7 = Class57.aLongArray22;
		this.aLong30 = -1L;
		this.aLong30 = local7[(int) ((this.aLong30 ^ (long) (this.anInt1702 >> 8)) & 0xFFL)] ^ this.aLong30 >>> 8;
		this.aLong30 = local7[(int) (((long) this.anInt1702 ^ this.aLong30) & 0xFFL)] ^ this.aLong30 >>> 8;
		for (@Pc(54) int local54 = 0; local54 < 12; local54++) {
			this.aLong30 = this.aLong30 >>> 8 ^ local7[(int) (((long) (this.anIntArray179[local54] >> 24) ^ this.aLong30) & 0xFFL)];
			this.aLong30 = this.aLong30 >>> 8 ^ local7[(int) (((long) (this.anIntArray179[local54] >> 16) ^ this.aLong30) & 0xFFL)];
			this.aLong30 = local7[(int) ((this.aLong30 ^ (long) (this.anIntArray179[local54] >> 8)) & 0xFFL)] ^ this.aLong30 >>> 8;
			this.aLong30 = local7[(int) ((this.aLong30 ^ (long) this.anIntArray179[local54]) & 0xFFL)] ^ this.aLong30 >>> 8;
		}
		for (@Pc(150) int local150 = 0; local150 < 5; local150++) {
			this.aLong30 = local7[(int) ((this.aLong30 ^ (long) this.anIntArray178[local150]) & 0xFFL)] ^ this.aLong30 >>> 8;
		}
		this.aLong30 = this.aLong30 >>> 8 ^ local7[(int) (((long) (this.aBoolean130 ? 1 : 0) ^ this.aLong30) & 0xFFL)];
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ILclient!bu;ILclient!qa;ILclient!dba;Lclient!qm;ILclient!ea;Lclient!gba;Lclient!kca;I)Lclient!r;")
	public Class26 method1593(@OriginalArg(0) int arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class42 arg3, @OriginalArg(5) Class64 arg4, @OriginalArg(6) Class254 arg5, @OriginalArg(8) Class78 arg6, @OriginalArg(9) Class110 arg7, @OriginalArg(10) Interface9 arg8, @OriginalArg(11) int arg9) {
		if (this.anInt1697 != -1) {
			return arg7.method3018(this.anInt1697).method3566(arg4, arg2, arg3, arg9, arg0, arg1, arg8);
		}
		@Pc(28) int local28 = 2048;
		@Pc(36) boolean local36;
		@Pc(51) int local51;
		@Pc(118) int local118;
		@Pc(59) int local59;
		if (arg4 != null) {
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			local36 = false;
			@Pc(38) boolean local38 = false;
			local51 = arg4.anIntArray185[arg2];
			local28 = 2080;
			local59 = local51 >>> 16;
			@Pc(64) Class12_Sub4_Sub13 local64 = arg1.method910(local59);
			@Pc(68) int local68 = local51 & 0xFFFF;
			if (local64 != null) {
				local34 = local64.method5401(local68) | false;
				local32 = local64.method5402(local68) | false;
				local38 = local64.method5403(local68) | false;
				local36 = arg4.aBoolean138 | false;
			}
			if ((arg4.aBoolean139 || Static358.aBoolean490) && arg9 != -1 && arg4.anIntArray185.length > arg9) {
				local118 = arg4.anIntArray185[arg9];
				@Pc(122) int local122 = local118 >>> 16;
				@Pc(132) Class12_Sub4_Sub13 local132 = local59 == local122 ? local64 : arg1.method910(local122);
				@Pc(136) int local136 = local118 & 0xFFFF;
				if (local132 != null) {
					local34 |= local132.method5401(local136);
					local32 |= local132.method5402(local136);
					local38 |= local132.method5403(local136);
				}
			}
			if (local34) {
				local28 = 2208;
			}
			if (local32) {
				local28 |= 0x100;
			}
			if (local36) {
				local28 |= 0x200;
			}
			if (local38) {
				local28 |= 0x400;
			}
		}
		@Pc(185) Class125 local185 = Static268.aClass125_41;
		@Pc(194) Class26 local194;
		synchronized (Static268.aClass125_41) {
			local194 = (Class26) Static268.aClass125_41.method3446(this.aLong30);
		}
		if (local194 == null || arg3.method5857(local194.ba(), local28) != 0) {
			if (local194 != null) {
				local28 = arg3.method5820(local28, local194.ba());
			}
			local36 = false;
			for (@Pc(222) int local222 = 0; local222 < 12; local222++) {
				local51 = this.anIntArray179[local222];
				if ((local51 & 0x40000000) == 0) {
					if ((local51 & Integer.MIN_VALUE) != 0 && !arg6.method2172(local51 & 0x3FFFFFFF).method7750()) {
						local36 = true;
					}
				} else if (!arg5.method6340(local51 & 0x3FFFFFFF).method1553(this.aBoolean130)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(281) Class192[] local281 = new Class192[12];
			local118 = 0;
			for (@Pc(285) int local285 = 0; local285 < 12; local285++) {
				@Pc(292) int local292 = this.anIntArray179[local285];
				@Pc(312) Class192 local312;
				if ((local292 & 0x40000000) != 0) {
					local312 = arg5.method6340(local292 & 0x3FFFFFFF).method1570(this.aBoolean130);
					if (local312 != null) {
						local281[local118++] = local312;
					}
				} else if ((Integer.MIN_VALUE & local292) != 0) {
					local312 = arg6.method2172(local292 & 0x3FFFFFFF).method7748();
					if (local312 != null) {
						local281[local118++] = local312;
					}
				}
			}
			@Pc(352) int local352 = local28 | 0x4000;
			@Pc(358) Class192 local358 = new Class192(local281, local118);
			local194 = arg3.method5812(local358, local352, Static391.anInt6916, 64, 768);
			for (local59 = 0; local59 < 5; local59++) {
				if (this.anIntArray178[local59] < Static468.aShortArrayArray10[local59].length) {
					local194.pa(Static516.aShortArray136[local59], Static468.aShortArrayArray10[local59][this.anIntArray178[local59]]);
				}
				if (Static350.aShortArrayArray5[local59].length > this.anIntArray178[local59]) {
					local194.pa(Static437.aShortArray106[local59], Static350.aShortArrayArray5[local59][this.anIntArray178[local59]]);
				}
			}
			local194.m(local28);
			@Pc(429) Class125 local429 = Static268.aClass125_41;
			synchronized (Static268.aClass125_41) {
				Static268.aClass125_41.method3437(local194, this.aLong30);
			}
		}
		if (arg4 == null) {
			return local194;
		} else {
			local194.method7992((byte) 4, local28, true);
			return arg4.method1826(arg0, 2048, arg2, local194, arg9);
		}
	}
}
