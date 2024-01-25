import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class174 {

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "J")
	private long aLong176;

	@OriginalMember(owner = "client!rj", name = "h", descriptor = "[I")
	private int[] anIntArray431;

	@OriginalMember(owner = "client!rj", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!rj", name = "n", descriptor = "J")
	private long aLong177;

	@OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
	private int anInt5421;

	@OriginalMember(owner = "client!rj", name = "u", descriptor = "[I")
	public int[] anIntArray434;

	@OriginalMember(owner = "client!rj", name = "v", descriptor = "Z")
	public boolean aBoolean337;

	@OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
	public int anInt5419 = -1;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z[I[IIZI)V")
	public void method4555(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (arg2 != this.anInt5421) {
			this.anInt5421 = arg2;
			this.anIntArrayArray50 = null;
		}
		if (arg0 == null) {
			arg0 = new int[12];
			for (@Pc(26) int local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < Static271.anInt5444; local30++) {
					@Pc(36) Class189 local36 = Static77.method1165(local30);
					if (local36 != null && !local36.aBoolean409 && (arg3 ? Static112.anIntArray140[local26] : Static181.anIntArray63[local26]) == local36.anInt5950) {
						arg0[Static151.anIntArray212[local26]] = local30 | Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
		this.anIntArray434 = arg1;
		this.anInt5419 = arg4;
		this.aBoolean337 = arg3;
		this.anIntArray431 = arg0;
		this.method4564();
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BIIZLclient!tj;III[Lclient!di;IILclient!md;Lclient!md;)Lclient!qb;")
	public Class124 method4556(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class122 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class46[] arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class131 arg9, @OriginalArg(12) Class131 arg10) {
		if (this.anInt5419 != -1) {
			return Static339.method4911(this.anInt5419).method2883(arg6, arg1, arg9, arg0, arg7, arg8, arg3, arg5, arg4, arg10, arg2);
		}
		@Pc(32) int local32 = arg8;
		@Pc(35) long local35 = this.aLong176;
		@Pc(38) int[] local38 = this.anIntArray431;
		if (arg9 != null && (arg9.anInt3981 >= 0 || arg9.anInt3987 >= 0)) {
			local38 = new int[12];
			for (@Pc(57) int local57 = 0; local57 < 12; local57++) {
				local38[local57] = this.anIntArray431[local57];
			}
			if (arg9.anInt3981 >= 0) {
				if (arg9.anInt3981 == 65535) {
					local38[5] = 0;
					local35 ^= 0xFFFFFFFF00000000L;
				} else {
					local38[5] = arg9.anInt3981 | 0x40000000;
					local35 ^= (long) local38[5] << 32;
				}
			}
			if (arg9.anInt3987 >= 0) {
				if (arg9.anInt3987 == 65535) {
					local35 ^= 0xFFFFFFFFL;
					local38[3] = 0;
				} else {
					local38[3] = arg9.anInt3987 | 0x40000000;
					local35 ^= local38[3];
				}
			}
		}
		@Pc(138) boolean local138 = false;
		@Pc(140) boolean local140 = false;
		@Pc(148) boolean local148 = arg9 != null || arg10 != null;
		@Pc(155) int local155 = arg6 == null ? 0 : arg6.length;
		@Pc(188) int local188;
		@Pc(193) int local193;
		for (@Pc(157) int local157 = 0; local157 < local155; local157++) {
			Static33.aClass3_Sub7_Sub21Array1[local157] = null;
			if (arg6[local157] != null) {
				@Pc(174) Class131 local174 = Static343.method5604(arg6[local157].anInt1286);
				if (local174.anIntArray335 != null) {
					local148 = true;
					Static154.aClass131Array5[local157] = local174;
					local188 = arg6[local157].anInt1290;
					local193 = arg6[local157].anInt1287;
					@Pc(198) int local198 = local174.anIntArray335[local188];
					Static33.aClass3_Sub7_Sub21Array1[local157] = Static1.method1(local198 >>> 16);
					@Pc(210) int local210 = local198 & 0xFFFF;
					Static85.anIntArray102[local157] = local210;
					if (Static33.aClass3_Sub7_Sub21Array1[local157] != null) {
						local140 |= Static33.aClass3_Sub7_Sub21Array1[local157].method5289(local210);
						local138 |= Static33.aClass3_Sub7_Sub21Array1[local157].method5287(local210);
					}
					if ((local174.aBoolean228 || Static151.aBoolean164) && local193 != -1 && local193 < local174.anIntArray335.length) {
						Static155.anIntArray112[local157] = local174.anIntArray337[local188];
						Static34.anIntArray49[local157] = arg6[local157].anInt1285;
						@Pc(269) int local269 = local174.anIntArray335[local193];
						Static187.aClass3_Sub7_Sub21Array5[local157] = Static1.method1(local269 >>> 16);
						@Pc(281) int local281 = local269 & 0xFFFF;
						Static316.anIntArray515[local157] = local281;
						if (Static187.aClass3_Sub7_Sub21Array5[local157] != null) {
							local140 |= Static187.aClass3_Sub7_Sub21Array5[local157].method5289(local281);
							local138 |= Static187.aClass3_Sub7_Sub21Array5[local157].method5287(local281);
						}
					} else {
						Static155.anIntArray112[local157] = 0;
						Static34.anIntArray49[local157] = 0;
						Static187.aClass3_Sub7_Sub21Array5[local157] = null;
						Static316.anIntArray515[local157] = -1;
					}
				}
			}
		}
		@Pc(337) int local337 = -1;
		local188 = -1;
		local193 = 0;
		@Pc(343) Class3_Sub7_Sub21 local343 = null;
		@Pc(345) Class3_Sub7_Sub21 local345 = null;
		@Pc(347) int local347 = -1;
		@Pc(354) int local354 = -1;
		@Pc(356) int local356 = 0;
		@Pc(358) Class3_Sub7_Sub21 local358 = null;
		@Pc(360) Class3_Sub7_Sub21 local360 = null;
		if (local148) {
			@Pc(373) int local373;
			@Pc(425) int local425;
			if (arg9 != null) {
				local337 = arg9.anIntArray335[arg4];
				local373 = local337 >>> 16;
				local343 = Static1.method1(local373);
				local337 &= 0xFFFF;
				if (local343 != null) {
					local140 |= local343.method5289(local337);
					local138 |= local343.method5287(local337);
				}
				if ((arg9.aBoolean228 || Static151.aBoolean164) && arg5 != -1 && arg5 < arg9.anIntArray335.length) {
					local188 = arg9.anIntArray335[arg5];
					local193 = arg9.anIntArray337[arg4];
					local425 = local188 >>> 16;
					local188 &= 0xFFFF;
					if (local425 == local373) {
						local345 = local343;
					} else {
						local345 = Static1.method1(local188 >>> 16);
					}
					if (local345 != null) {
						local140 |= local345.method5289(local188);
						local138 |= local345.method5287(local188);
					}
				}
			}
			local32 = arg8 | 0x20;
			if (arg10 != null) {
				local347 = arg10.anIntArray335[arg1];
				local373 = local347 >>> 16;
				local347 &= 0xFFFF;
				local358 = Static1.method1(local373);
				if (local358 != null) {
					local140 |= local358.method5289(local347);
					local138 |= local358.method5287(local347);
				}
				if ((arg10.aBoolean228 || Static151.aBoolean164) && arg7 != -1 && arg10.anIntArray335.length > arg7) {
					local354 = arg10.anIntArray335[arg7];
					local356 = arg10.anIntArray337[arg1];
					local425 = local354 >>> 16;
					local354 &= 0xFFFF;
					if (local425 == local373) {
						local360 = local358;
					} else {
						local360 = Static1.method1(local354 >>> 16);
					}
					if (local360 != null) {
						local140 |= local360.method5289(local354);
						local138 |= local360.method5287(local354);
					}
				}
			}
			if (local140) {
				local32 |= 0x80;
			}
			if (local138) {
				local32 |= 0x100;
			}
		}
		@Pc(586) Class198 local586 = Static336.aClass198_61;
		@Pc(594) Class124 local594;
		synchronized (Static336.aClass198_61) {
			local594 = (Class124) Static336.aClass198_61.method5242(local35);
		}
		@Pc(602) Class54 local602 = null;
		if (this.anInt5421 != -1) {
			local602 = Static251.method4222(this.anInt5421);
		}
		@Pc(645) int local645;
		@Pc(651) int local651;
		if (local594 == null || arg2.method4766(local594.method4108(), local32) != 0 || local602 != null && local602.anIntArrayArray9 != null && this.anIntArrayArray50 == null) {
			if (local594 != null) {
				local32 = arg2.method4799(local32, local594.method4108());
			}
			@Pc(643) boolean local643 = false;
			local645 = 0;
			while (true) {
				if (local645 >= 12) {
					if (local643) {
						if (this.aLong177 != -1L) {
							@Pc(701) Class198 local701 = Static336.aClass198_61;
							synchronized (Static336.aClass198_61) {
								local594 = (Class124) Static336.aClass198_61.method5242(this.aLong177);
							}
						}
						if (local594 == null || arg2.method4766(local594.method4108(), local32) != 0 || local602 != null && local602.anIntArrayArray9 != null && this.anIntArrayArray50 == null) {
							return null;
						}
					} else {
						@Pc(740) Class40[] local740 = new Class40[12];
						@Pc(748) int local748;
						for (@Pc(742) int local742 = 0; local742 < 12; local742++) {
							local748 = local38[local742];
							@Pc(764) Class40 local764;
							if ((local748 & 0x40000000) != 0) {
								local764 = Static230.method5537(local748 & 0x3FFFFFFF).method935(this.aBoolean337);
								if (local764 != null) {
									local740[local742] = local764;
								}
							} else if ((local748 & Integer.MIN_VALUE) != 0) {
								local764 = Static77.method1165(local748 & 0x3FFFFFFF).method5070();
								if (local764 != null) {
									local740[local742] = local764;
								}
							}
						}
						@Pc(821) int local821;
						if (local602 != null && local602.anIntArrayArray9 != null) {
							for (local748 = 0; local748 < local602.anIntArrayArray9.length; local748++) {
								if (local602.anIntArrayArray9[local748] != null && local740[local748] != null) {
									local821 = local602.anIntArrayArray9[local748][0];
									@Pc(828) int local828 = local602.anIntArrayArray9[local748][1];
									@Pc(835) int local835 = local602.anIntArrayArray9[local748][2];
									@Pc(844) int local844 = local602.anIntArrayArray9[local748][3] << 3;
									@Pc(853) int local853 = local602.anIntArrayArray9[local748][4] << 3;
									@Pc(862) int local862 = local602.anIntArrayArray9[local748][5] << 3;
									if (this.anIntArrayArray50 == null) {
										this.anIntArrayArray50 = new int[local602.anIntArrayArray9.length][];
									}
									if (this.anIntArrayArray50[local748] == null) {
										@Pc(884) int[] local884 = this.anIntArrayArray50[local748] = new int[15];
										if (local844 == 0 && local853 == 0 && local862 == 0) {
											local884[12] = -local821;
											local884[0] = local884[4] = local884[8] = 32768;
											local884[13] = -local828;
											local884[14] = -local835;
										} else {
											@Pc(926) int local926 = Class19.anIntArray21[local844];
											@Pc(930) int local930 = Class19.anIntArray20[local844];
											@Pc(934) int local934 = Class19.anIntArray21[local853];
											@Pc(938) int local938 = Class19.anIntArray20[local853];
											@Pc(942) int local942 = Class19.anIntArray21[local862];
											@Pc(946) int local946 = Class19.anIntArray20[local862];
											@Pc(954) int local954 = local942 * local930 + 16384 >> 15;
											@Pc(962) int local962 = local930 * local946 + 16384 >> 15;
											local884[6] = local962 * local934 + -local938 * local942 + 16384 >> 15;
											local884[7] = local954 * local934 + -local938 * -local946 + 16384 >> 15;
											local884[3] = local926 * local946 + 16384 >> 15;
											local884[8] = local934 * local926 + 16384 >> 15;
											local884[1] = local934 * -local946 + local938 * local954 + 16384 >> 15;
											local884[2] = local938 * local926 + 16384 >> 15;
											local884[4] = local926 * local942 + 16384 >> 15;
											local884[5] = -local930;
											local884[0] = local942 * local934 + local962 * local938 + 16384 >> 15;
											local884[14] = local884[8] * -local835 + local884[2] * -local821 + local884[5] * -local828 + 16384 >> 15;
											local884[12] = local884[6] * -local835 + -local828 * local884[3] + local884[0] * -local821 + 16384 >> 15;
											local884[13] = -local828 * local884[4] + local884[1] * -local821 + local884[7] * -local835 + 16384 >> 15;
										}
										local884[11] = local835;
										local884[10] = local828;
										local884[9] = local821;
									}
									if (local844 != 0 || local853 != 0 || local862 != 0) {
										local740[local748].method916(local862, local853, local844);
									}
									if (local821 != 0 || local828 != 0 || local835 != 0) {
										local740[local748].method906(local835, local821, local828);
									}
								}
							}
						}
						@Pc(1219) Class40 local1219 = new Class40(local740, local740.length);
						@Pc(1223) int local1223 = local32 | 0x2000;
						local594 = arg2.method4794(local1219, local1223, Static329.anInt6339, 64, 850);
						for (local821 = 0; local821 < 5; local821++) {
							if (Static196.aShortArrayArray4[local821].length > this.anIntArray434[local821]) {
								local594.method4083(Static333.aShortArray111[local821], Static196.aShortArrayArray4[local821][this.anIntArray434[local821]]);
							}
							if (Static8.aShortArrayArray1[local821].length > this.anIntArray434[local821]) {
								local594.method4083(Static157.aShortArray71[local821], Static8.aShortArrayArray1[local821][this.anIntArray434[local821]]);
							}
						}
						local594.method4080(local32);
						@Pc(1290) Class198 local1290 = Static336.aClass198_61;
						synchronized (Static336.aClass198_61) {
							Static336.aClass198_61.method5231(local35, local594);
						}
						this.aLong177 = local35;
					}
					break;
				}
				local651 = local38[local645];
				if ((local651 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local651) != 0 && !Static77.method1165(local651 & 0x3FFFFFFF).method5066()) {
						local643 = true;
					}
				} else if (!Static230.method5537(local651 & 0x3FFFFFFF).method941(this.aBoolean337)) {
					local643 = true;
				}
				local645++;
			}
		}
		@Pc(1312) Class124 local1312 = local594.method4094((byte) 1, local32, true);
		if (!local148) {
			return local1312;
		}
		@Pc(1318) int local1318 = 0;
		local645 = 1;
		while (local1318 < local155) {
			if (Static33.aClass3_Sub7_Sub21Array1[local1318] != null) {
				local1312.method4114(local645, false, Static316.anIntArray515[local1318], Static85.anIntArray102[local1318], Static33.aClass3_Sub7_Sub21Array1[local1318], this.anIntArrayArray50 == null ? null : this.anIntArrayArray50[local1318], Static155.anIntArray112[local1318], Static34.anIntArray49[local1318] - 1, Static187.aClass3_Sub7_Sub21Array5[local1318]);
			}
			local645 <<= 0x1;
			local1318++;
		}
		if (local343 != null && local358 != null) {
			local1312.method4115(local356, arg9.aBooleanArray18, local343, arg0 - 1, local360, local337, arg3 - 1, local345, local347, local193, local354, false, local358, local188);
		} else if (local343 != null) {
			local1312.method4096(local337, arg3 - 1, 0, local345, false, local188, local343, local193);
		} else if (local358 != null) {
			local1312.method4096(local347, arg0 - 1, 0, local360, false, local354, local358, local356);
		}
		for (local651 = 0; local651 < local155; local651++) {
			Static33.aClass3_Sub7_Sub21Array1[local651] = null;
			Static187.aClass3_Sub7_Sub21Array5[local651] = null;
			Static154.aClass131Array5[local651] = null;
		}
		return local1312;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!tj;IIIIIIIILclient!md;)Lclient!qb;")
	public Class124 method4559(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) Class131 arg7) {
		@Pc(7) int local7 = 1024;
		@Pc(31) int local31;
		@Pc(41) int local41;
		if (arg7 != null) {
			@Pc(16) boolean local16 = false;
			@Pc(18) boolean local18 = false;
			@Pc(20) boolean local20 = false;
			local31 = arg7.anIntArray335[arg4];
			local7 = 1056;
			local41 = local31 >>> 16;
			@Pc(45) Class3_Sub7_Sub21 local45 = Static1.method1(local41);
			@Pc(49) int local49 = local31 & 0xFFFF;
			if (local45 != null) {
				local18 = local45.method5289(local49) | false;
				local16 = local45.method5287(local49) | false;
				local20 = arg7.aBoolean227 | false;
			}
			if ((arg7.aBoolean228 || Static151.aBoolean164) && arg6 != -1 && arg6 < arg7.anIntArray335.length) {
				@Pc(88) int local88 = arg7.anIntArray335[arg6];
				@Pc(92) int local92 = local88 >>> 16;
				@Pc(96) int local96 = local88 & 0xFFFF;
				@Pc(101) Class3_Sub7_Sub21 local101;
				if (local41 == local92) {
					local101 = local45;
				} else {
					local101 = Static1.method1(local96 >>> 16);
				}
				if (local101 != null) {
					local18 |= local101.method5289(local96);
					local16 |= local101.method5287(local96);
				}
			}
			if (local18) {
				local7 = 1184;
			}
			if (local16) {
				local7 |= 0x100;
			}
			if (local20) {
				local7 |= 0x200;
			}
		}
		@Pc(155) long local155 = (long) (arg2 << 16) | (long) arg3 << 32 | (long) arg1;
		@Pc(157) Class198 local157 = Static182.aClass198_31;
		@Pc(165) Class124 local165;
		synchronized (Static182.aClass198_31) {
			local165 = (Class124) Static182.aClass198_31.method5242(local155);
		}
		if (local165 == null || arg0.method4766(local165.method4108(), local7) != 0) {
			if (local165 != null) {
				local7 = arg0.method4799(local7, local165.method4108());
			}
			@Pc(192) Class40[] local192 = new Class40[3];
			@Pc(194) int local194 = 0;
			if (!Static77.method1165(arg1).method5068() || !Static77.method1165(arg2).method5068() || !Static77.method1165(arg3).method5068()) {
				return null;
			}
			@Pc(220) Class40 local220 = Static77.method1165(arg1).method5065();
			if (local220 != null) {
				local194++;
				local192[0] = local220;
			}
			local220 = Static77.method1165(arg2).method5065();
			if (local220 != null) {
				local192[local194++] = local220;
			}
			local220 = Static77.method1165(arg3).method5065();
			if (local220 != null) {
				local192[local194++] = local220;
			}
			local220 = new Class40(local192, local194);
			local31 = local7 | 0x2000;
			local165 = arg0.method4794(local220, local31, Static329.anInt6339, 64, 768);
			for (local41 = 0; local41 < 5; local41++) {
				if (Static196.aShortArrayArray4[local41].length > this.anIntArray434[local41]) {
					local165.method4083(Static333.aShortArray111[local41], Static196.aShortArrayArray4[local41][this.anIntArray434[local41]]);
				}
				if (Static8.aShortArrayArray1[local41].length > this.anIntArray434[local41]) {
					local165.method4083(Static157.aShortArray71[local41], Static8.aShortArrayArray1[local41][this.anIntArray434[local41]]);
				}
			}
			local165.method4080(local7);
			@Pc(338) Class198 local338 = Static182.aClass198_31;
			synchronized (Static182.aClass198_31) {
				Static182.aClass198_31.method5231(local155, local165);
			}
		}
		if (arg7 == null) {
			return local165;
		} else {
			local165 = local165.method4094((byte) 1, local7, true);
			return arg7.method3411(arg6, 1024, arg4, local165, arg5);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZI)V")
	public void method4560(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray434[arg0] = arg1;
		this.method4564();
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!tj;IIIILclient!md;I)Lclient!qb;")
	public Class124 method4561(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class131 arg4) {
		if (this.anInt5419 != -1) {
			return Static339.method4911(this.anInt5419).method2884(arg2, arg0, arg3, arg1, arg4);
		}
		@Pc(24) int local24 = 1024;
		@Pc(32) boolean local32;
		@Pc(49) int local49;
		@Pc(105) int local105;
		@Pc(53) int local53;
		@Pc(109) int local109;
		if (arg4 != null) {
			@Pc(28) boolean local28 = false;
			@Pc(30) boolean local30 = false;
			local32 = false;
			local24 = 1056;
			local49 = arg4.anIntArray335[arg1];
			local53 = local49 >>> 16;
			@Pc(57) Class3_Sub7_Sub21 local57 = Static1.method1(local53);
			@Pc(61) int local61 = local49 & 0xFFFF;
			if (local57 != null) {
				local30 = local57.method5289(local61) | false;
				local28 = local57.method5287(local61) | false;
				local32 = arg4.aBoolean227 | false;
			}
			if ((arg4.aBoolean228 || Static151.aBoolean164) && arg2 != -1 && arg2 < arg4.anIntArray335.length) {
				local105 = arg4.anIntArray335[arg2];
				local109 = local105 >>> 16;
				@Pc(113) int local113 = local105 & 0xFFFF;
				@Pc(122) Class3_Sub7_Sub21 local122;
				if (local53 == local109) {
					local122 = local57;
				} else {
					local122 = Static1.method1(local113 >>> 16);
				}
				if (local122 != null) {
					local30 |= local122.method5289(local113);
					local28 |= local122.method5287(local113);
				}
			}
			if (local30) {
				local24 = 1184;
			}
			if (local28) {
				local24 |= 0x100;
			}
			if (local32) {
				local24 |= 0x200;
			}
		}
		@Pc(163) Class198 local163 = Static182.aClass198_31;
		@Pc(172) Class124 local172;
		synchronized (Static182.aClass198_31) {
			local172 = (Class124) Static182.aClass198_31.method5242(this.aLong176);
		}
		if (local172 == null || arg0.method4766(local172.method4108(), local24) != 0) {
			if (local172 != null) {
				local24 = arg0.method4799(local24, local172.method4108());
			}
			local32 = false;
			for (local49 = 0; local49 < 12; local49++) {
				local105 = this.anIntArray431[local49];
				if ((local105 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local105) != 0 && !Static77.method1165(local105 & 0x3FFFFFFF).method5068()) {
						local32 = true;
					}
				} else if (!Static230.method5537(local105 & 0x3FFFFFFF).method924(this.aBoolean337)) {
					local32 = true;
				}
			}
			if (local32) {
				return null;
			}
			@Pc(259) Class40[] local259 = new Class40[12];
			@Pc(261) int local261 = 0;
			for (@Pc(263) int local263 = 0; local263 < 12; local263++) {
				local53 = this.anIntArray431[local263];
				@Pc(292) Class40 local292;
				if ((local53 & 0x40000000) != 0) {
					local292 = Static230.method5537(local53 & 0x3FFFFFFF).method927(this.aBoolean337);
					if (local292 != null) {
						local259[local261++] = local292;
					}
				} else if ((Integer.MIN_VALUE & local53) != 0) {
					local292 = Static77.method1165(local53 & 0x3FFFFFFF).method5065();
					if (local292 != null) {
						local259[local261++] = local292;
					}
				}
			}
			@Pc(328) int local328 = local24 | 0x2000;
			@Pc(334) Class40 local334 = new Class40(local259, local261);
			local172 = arg0.method4794(local334, local328, Static329.anInt6339, 64, 768);
			for (local109 = 0; local109 < 5; local109++) {
				if (Static196.aShortArrayArray4[local109].length > this.anIntArray434[local109]) {
					local172.method4083(Static333.aShortArray111[local109], Static196.aShortArrayArray4[local109][this.anIntArray434[local109]]);
				}
				if (this.anIntArray434[local109] < Static8.aShortArrayArray1[local109].length) {
					local172.method4083(Static157.aShortArray71[local109], Static8.aShortArrayArray1[local109][this.anIntArray434[local109]]);
				}
			}
			local172.method4080(local24);
			@Pc(409) Class198 local409 = Static182.aClass198_31;
			synchronized (Static182.aClass198_31) {
				Static182.aClass198_31.method5231(this.aLong176, local172);
			}
		}
		if (arg4 == null) {
			return local172;
		} else {
			local172.method4094((byte) 1, local24, true);
			return arg4.method3411(arg2, 1024, arg1, local172, arg3);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZI)V")
	public void method4562(@OriginalArg(0) boolean arg0) {
		this.aBoolean337 = arg0;
		this.method4564();
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
	private void method4564() {
		@Pc(7) long[] local7 = Class27.aLongArray2;
		this.aLong176 = -1L;
		this.aLong176 = local7[(int) (((long) (this.anInt5421 >> 8) ^ this.aLong176) & 0xFFL)] ^ this.aLong176 >>> 8;
		this.aLong176 = local7[(int) ((this.aLong176 ^ (long) this.anInt5421) & 0xFFL)] ^ this.aLong176 >>> 8;
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong176 = local7[(int) ((this.aLong176 ^ (long) (this.anIntArray431[local50] >> 24)) & 0xFFL)] ^ this.aLong176 >>> 8;
			this.aLong176 = local7[(int) ((this.aLong176 ^ (long) (this.anIntArray431[local50] >> 16)) & 0xFFL)] ^ this.aLong176 >>> 8;
			this.aLong176 = local7[(int) ((this.aLong176 ^ (long) (this.anIntArray431[local50] >> 8)) & 0xFFL)] ^ this.aLong176 >>> 8;
			this.aLong176 = local7[(int) (((long) this.anIntArray431[local50] ^ this.aLong176) & 0xFFL)] ^ this.aLong176 >>> 8;
		}
		for (@Pc(146) int local146 = 0; local146 < 5; local146++) {
			this.aLong176 = local7[(int) ((this.aLong176 ^ (long) this.anIntArray434[local146]) & 0xFFL)] ^ this.aLong176 >>> 8;
		}
		this.aLong176 = this.aLong176 >>> 8 ^ local7[(int) ((this.aLong176 ^ (long) (this.aBoolean337 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)V")
	public void method4567(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = Static151.anIntArray212[arg0];
		if (this.anIntArray431[local15] != 0 && Static77.method1165(arg1) != null) {
			this.anIntArray431[local15] = arg1 | Integer.MIN_VALUE;
			this.method4564();
		}
	}
}
