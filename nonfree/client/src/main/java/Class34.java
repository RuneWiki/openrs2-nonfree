import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class34 {

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "[I")
	private int[] anIntArray45;

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!bl", name = "k", descriptor = "J")
	private long aLong56;

	@OriginalMember(owner = "client!bl", name = "p", descriptor = "J")
	private long aLong57;

	@OriginalMember(owner = "client!bl", name = "q", descriptor = "Z")
	public boolean aBoolean90;

	@OriginalMember(owner = "client!bl", name = "s", descriptor = "I")
	private int anInt1121;

	@OriginalMember(owner = "client!bl", name = "t", descriptor = "[I")
	public int[] anIntArray46;

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
	public int anInt1112 = -1;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!tfa;Lclient!eu;IIIIILclient!hca;ILclient!r;II)Lclient!da;")
	public Class61 method1011(@OriginalArg(0) Class311 arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class131 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class12 arg8, @OriginalArg(11) int arg9) {
		@Pc(12) int local12 = 2048;
		@Pc(104) int local104;
		@Pc(43) int local43;
		if (arg6 != null) {
			@Pc(16) boolean local16 = false;
			@Pc(18) boolean local18 = false;
			@Pc(20) boolean local20 = false;
			@Pc(22) boolean local22 = false;
			local12 = 2080;
			@Pc(37) int local37 = arg6.anIntArray202[arg3];
			local43 = local37 >>> 16;
			@Pc(47) int local47 = local37 & 0xFFFF;
			@Pc(52) Class1_Sub3_Sub13 local52 = arg0.method7006(local43);
			if (local52 != null) {
				local18 = local52.method5310(local47) | false;
				local16 = local52.method5313(local47) | false;
				local22 = local52.method5311(local47) | false;
				local20 = arg6.aBoolean307 | false;
			}
			if ((arg6.aBoolean306 || Static153.aBoolean202) && arg9 != -1 && arg9 < arg6.anIntArray202.length) {
				local104 = arg6.anIntArray202[arg9];
				@Pc(108) int local108 = local104 >>> 16;
				@Pc(112) int local112 = local104 & 0xFFFF;
				@Pc(121) Class1_Sub3_Sub13 local121;
				if (local108 == local43) {
					local121 = local52;
				} else {
					local121 = arg0.method7006(local112 >>> 16);
				}
				if (local121 != null) {
					local18 |= local121.method5310(local112);
					local16 |= local121.method5313(local112);
					local22 |= local121.method5311(local112);
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
		@Pc(189) long local189 = (long) arg5 << 32 | (long) (arg4 << 16) | (long) arg7;
		@Pc(191) Class326 local191 = Static282.aClass326_26;
		@Pc(201) Class61 local201;
		synchronized (Static282.aClass326_26) {
			local201 = (Class61) Static282.aClass326_26.method7238(local189);
		}
		if (local201 == null || arg8.method6467(local201.PA(), local12) != 0) {
			if (local201 != null) {
				local12 = arg8.method6445(local12, local201.PA());
			}
			@Pc(228) Class43[] local228 = new Class43[3];
			local104 = 0;
			if (!arg1.method2205(arg7).method7630() || !arg1.method2205(arg4).method7630() || !arg1.method2205(arg5).method7630()) {
				return null;
			}
			@Pc(262) Class43 local262 = arg1.method2205(arg7).method7626();
			if (local262 != null) {
				local104++;
				local228[0] = local262;
			}
			local262 = arg1.method2205(arg4).method7626();
			if (local262 != null) {
				local228[local104++] = local262;
			}
			local262 = arg1.method2205(arg5).method7626();
			if (local262 != null) {
				local228[local104++] = local262;
			}
			@Pc(301) int local301 = local12 | 0x4000;
			local262 = new Class43(local228, local104);
			local201 = arg8.method6407(local262, local301, Static482.anInt8057, 64, 768);
			for (@Pc(317) int local317 = 0; local317 < 5; local317++) {
				for (local43 = 0; local43 < Static235.aShortArrayArrayArray1.length; local43++) {
					if (Static235.aShortArrayArrayArray1[local43][local317].length > this.anIntArray46[local317]) {
						local201.d(Static152.aShortArrayArray2[local43][local317], Static235.aShortArrayArrayArray1[local43][local317][this.anIntArray46[local317]]);
					}
				}
			}
			local201.SA(local12);
			@Pc(375) Class326 local375 = Static282.aClass326_26;
			synchronized (Static282.aClass326_26) {
				Static282.aClass326_26.method7236(local201, local189);
			}
		}
		if (arg6 == null) {
			return local201;
		} else {
			local201 = local201.method7591((byte) 4, local12, true);
			return arg6.method3238(2048, local201, arg3, arg2, arg9);
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZI)V")
	public void method1013(@OriginalArg(0) boolean arg0) {
		this.aBoolean90 = arg0;
		this.method1018();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIILclient!oa;)V")
	public void method1015(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class234 arg2) {
		if (arg1 == -1) {
			this.anIntArray45[arg0] = 0;
		} else if (arg2.method5390(arg1) != null) {
			this.anIntArray45[arg0] = arg1 | 0x40000000;
			this.method1018();
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(III)V")
	public void method1016(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray46[arg1] = arg0;
		this.method1018();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!eu;II)V")
	public void method1017(@OriginalArg(1) Class93 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = Static472.anIntArray625[arg1];
		if (arg0.method2205(arg2) != null) {
			this.anIntArray45[local13] = Integer.MIN_VALUE | arg2;
			this.method1018();
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
	private void method1018() {
		@Pc(7) long[] local7 = Class18.aLongArray2;
		this.aLong56 = -1L;
		this.aLong56 = this.aLong56 >>> 8 ^ local7[(int) (((long) (this.anInt1121 >> 8) ^ this.aLong56) & 0xFFL)];
		this.aLong56 = local7[(int) ((this.aLong56 ^ (long) this.anInt1121) & 0xFFL)] ^ this.aLong56 >>> 8;
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong56 = this.aLong56 >>> 8 ^ local7[(int) ((this.aLong56 ^ (long) (this.anIntArray45[local50] >> 24)) & 0xFFL)];
			this.aLong56 = this.aLong56 >>> 8 ^ local7[(int) (((long) (this.anIntArray45[local50] >> 16) ^ this.aLong56) & 0xFFL)];
			this.aLong56 = local7[(int) ((this.aLong56 ^ (long) (this.anIntArray45[local50] >> 8)) & 0xFFL)] ^ this.aLong56 >>> 8;
			this.aLong56 = local7[(int) ((this.aLong56 ^ (long) this.anIntArray45[local50]) & 0xFFL)] ^ this.aLong56 >>> 8;
		}
		for (@Pc(148) int local148 = 0; local148 < 5; local148++) {
			this.aLong56 = local7[(int) (((long) this.anIntArray46[local148] ^ this.aLong56) & 0xFFL)] ^ this.aLong56 >>> 8;
		}
		this.aLong56 = local7[(int) ((this.aLong56 ^ (long) (this.aBoolean90 ? 1 : 0)) & 0xFFL)] ^ this.aLong56 >>> 8;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IZ[IIB[I)V")
	public void method1019(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4) {
		this.anIntArray46 = arg2;
		this.anIntArray45 = arg4;
		this.anInt1112 = arg3;
		this.aBoolean90 = arg1;
		if (this.anInt1121 != arg0) {
			this.anIntArrayArray5 = null;
			this.anInt1121 = arg0;
		}
		this.method1018();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!tfa;Lclient!hca;Lclient!r;ILclient!hca;I[Lclient!tk;IILclient!ml;ILclient!sba;Lclient!k;IZBILclient!eu;Lclient!oa;)Lclient!da;")
	public Class61 method1020(@OriginalArg(0) Class311 arg0, @OriginalArg(1) Class131 arg1, @OriginalArg(2) Class12 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class131 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class313[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Interface15 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class291 arg11, @OriginalArg(12) Class182 arg12, @OriginalArg(13) int arg13, @OriginalArg(16) int arg14, @OriginalArg(17) Class93 arg15, @OriginalArg(18) Class234 arg16) {
		if (this.anInt1112 != -1) {
			return arg12.method4062(this.anInt1112).method3797(arg1, arg7, arg10, arg0, arg6, arg2, arg13, arg8, arg14, arg11, arg9, arg5, arg4, arg3);
		}
		@Pc(33) int local33 = arg5;
		@Pc(36) long local36 = this.aLong56;
		@Pc(39) int[] local39 = this.anIntArray45;
		if (arg1 != null && (arg1.anInt3740 >= 0 || arg1.anInt3747 >= 0)) {
			local39 = new int[12];
			for (@Pc(55) int local55 = 0; local55 < 12; local55++) {
				local39[local55] = this.anIntArray45[local55];
			}
			if (arg1.anInt3740 >= 0) {
				if (arg1.anInt3740 == 65535) {
					local36 ^= 0xFFFFFFFF00000000L;
					local39[5] = 0;
				} else {
					local39[5] = arg1.anInt3740 | 0x40000000;
					local36 ^= (long) local39[5] << 32;
				}
			}
			if (arg1.anInt3747 >= 0) {
				if (arg1.anInt3747 == 65535) {
					local39[3] = 0;
					local36 ^= 0xFFFFFFFFL;
				} else {
					local39[3] = arg1.anInt3747 | 0x40000000;
					local36 ^= local39[3];
				}
			}
		}
		@Pc(136) boolean local136 = false;
		@Pc(138) boolean local138 = false;
		@Pc(140) boolean local140 = false;
		@Pc(148) boolean local148 = arg1 != null || arg4 != null;
		@Pc(155) int local155 = arg6 == null ? 0 : arg6.length;
		@Pc(189) int local189;
		@Pc(194) int local194;
		for (@Pc(157) int local157 = 0; local157 < local155; local157++) {
			Static355.aClass1_Sub3_Sub13Array5[local157] = null;
			if (arg6[local157] != null) {
				@Pc(175) Class131 local175 = arg0.method7009(arg6[local157].anInt8491);
				if (local175.anIntArray202 != null) {
					Static2.aClass131Array1[local157] = local175;
					local148 = true;
					local189 = arg6[local157].anInt8493;
					local194 = arg6[local157].anInt8492;
					@Pc(199) int local199 = local175.anIntArray202[local189];
					Static355.aClass1_Sub3_Sub13Array5[local157] = arg0.method7006(local199 >>> 16);
					@Pc(214) int local214 = local199 & 0xFFFF;
					Static294.anIntArray330[local157] = local214;
					if (Static355.aClass1_Sub3_Sub13Array5[local157] != null) {
						local138 |= Static355.aClass1_Sub3_Sub13Array5[local157].method5310(local214);
						local136 |= Static355.aClass1_Sub3_Sub13Array5[local157].method5313(local214);
						local140 |= Static355.aClass1_Sub3_Sub13Array5[local157].method5311(local214);
					}
					if ((local175.aBoolean306 || Static153.aBoolean202) && local194 != -1 && local175.anIntArray202.length > local194) {
						Static96.anIntArray118[local157] = local175.anIntArray204[local189];
						Static389.anIntArray460[local157] = arg6[local157].anInt8489;
						@Pc(305) int local305 = local175.anIntArray202[local194];
						Static575.aClass1_Sub3_Sub13Array4[local157] = arg0.method7006(local305 >>> 16);
						@Pc(318) int local318 = local305 & 0xFFFF;
						Static394.anIntArray466[local157] = local318;
						if (Static575.aClass1_Sub3_Sub13Array4[local157] != null) {
							local138 |= Static575.aClass1_Sub3_Sub13Array4[local157].method5310(local318);
							local136 |= Static575.aClass1_Sub3_Sub13Array4[local157].method5313(local318);
							local140 |= Static575.aClass1_Sub3_Sub13Array4[local157].method5311(local318);
						}
					} else {
						Static96.anIntArray118[local157] = 0;
						Static389.anIntArray460[local157] = 0;
						Static575.aClass1_Sub3_Sub13Array4[local157] = null;
						Static394.anIntArray466[local157] = -1;
					}
				}
			}
		}
		@Pc(363) int local363 = -1;
		local189 = -1;
		local194 = 0;
		@Pc(369) Class1_Sub3_Sub13 local369 = null;
		@Pc(371) Class1_Sub3_Sub13 local371 = null;
		@Pc(373) int local373 = -1;
		@Pc(375) int local375 = -1;
		@Pc(377) int local377 = 0;
		@Pc(379) Class1_Sub3_Sub13 local379 = null;
		@Pc(381) Class1_Sub3_Sub13 local381 = null;
		if (local148) {
			@Pc(394) int local394;
			@Pc(458) int local458;
			if (arg1 != null) {
				local363 = arg1.anIntArray202[arg10];
				local394 = local363 >>> 16;
				local363 &= 0xFFFF;
				local369 = arg0.method7006(local394);
				if (local369 != null) {
					local138 |= local369.method5310(local363);
					local136 |= local369.method5313(local363);
					local140 |= local369.method5311(local363);
				}
				if ((arg1.aBoolean306 || Static153.aBoolean202) && arg14 != -1 && arg14 < arg1.anIntArray202.length) {
					local189 = arg1.anIntArray202[arg14];
					local194 = arg1.anIntArray204[arg10];
					local458 = local189 >>> 16;
					local371 = local394 == local458 ? local369 : arg0.method7006(local458);
					local189 &= 0xFFFF;
					if (local371 != null) {
						local138 |= local371.method5310(local189);
						local136 |= local371.method5313(local189);
						local140 |= local371.method5311(local189);
					}
				}
			}
			local33 = arg5 | 0x20;
			if (arg4 != null) {
				local373 = arg4.anIntArray202[arg13];
				local394 = local373 >>> 16;
				local373 &= 0xFFFF;
				local379 = arg0.method7006(local394);
				if (local379 != null) {
					local138 |= local379.method5310(local373);
					local136 |= local379.method5313(local373);
					local140 |= local379.method5311(local373);
				}
				if ((arg4.aBoolean306 || Static153.aBoolean202) && arg8 != -1 && arg4.anIntArray202.length > arg8) {
					local377 = arg4.anIntArray204[arg13];
					local375 = arg4.anIntArray202[arg8];
					local458 = local375 >>> 16;
					local381 = local458 == local394 ? local379 : arg0.method7006(local458);
					local375 &= 0xFFFF;
					if (local381 != null) {
						local138 |= local381.method5310(local375);
						local136 |= local381.method5313(local375);
						local140 |= local381.method5311(local375);
					}
				}
			}
			if (local138) {
				local33 |= 0x80;
			}
			if (local136) {
				local33 |= 0x100;
			}
			if (local140) {
				local33 |= 0x400;
			}
		}
		@Pc(634) Class326 local634 = Static11.aClass326_1;
		@Pc(642) Class61 local642;
		synchronized (Static11.aClass326_1) {
			local642 = (Class61) Static11.aClass326_1.method7238(local36);
		}
		@Pc(650) Class138 local650 = null;
		if (this.anInt1121 != -1) {
			local650 = arg11.method6675(this.anInt1121);
		}
		@Pc(691) int local691;
		@Pc(697) int local697;
		if (local642 == null || arg2.method6467(local642.PA(), local33) != 0 || local650 != null && local650.anIntArrayArray26 != null && this.anIntArrayArray5 == null) {
			if (local642 != null) {
				local33 = arg2.method6445(local33, local642.PA());
			}
			@Pc(689) boolean local689 = false;
			local691 = 0;
			while (true) {
				if (local691 >= 12) {
					if (local689) {
						if (this.aLong57 != -1L) {
							@Pc(1320) Class326 local1320 = Static11.aClass326_1;
							synchronized (Static11.aClass326_1) {
								local642 = (Class61) Static11.aClass326_1.method7238(this.aLong57);
							}
						}
						if (local642 == null || arg2.method6467(local642.PA(), local33) != 0 || local650 != null && local650.anIntArrayArray26 != null && this.anIntArrayArray5 == null) {
							return null;
						}
					} else {
						@Pc(747) Class43[] local747 = new Class43[12];
						@Pc(755) int local755;
						for (@Pc(749) int local749 = 0; local749 < 12; local749++) {
							local755 = local39[local749];
							@Pc(775) Class43 local775;
							if ((local755 & 0x40000000) != 0) {
								local775 = arg16.method5390(local755 & 0x3FFFFFFF).method7116(this.aBoolean90);
								if (local775 != null) {
									local747[local749] = local775;
								}
							} else if ((local755 & Integer.MIN_VALUE) != 0) {
								local775 = arg15.method2205(local755 & 0x3FFFFFFF).method7629();
								if (local775 != null) {
									local747[local749] = local775;
								}
							}
						}
						@Pc(842) int local842;
						@Pc(835) int local835;
						if (local650 != null && local650.anIntArrayArray26 != null) {
							for (local755 = 0; local755 < local650.anIntArrayArray26.length; local755++) {
								if (local650.anIntArrayArray26[local755] != null && local747[local755] != null) {
									local835 = local650.anIntArrayArray26[local755][0];
									local842 = local650.anIntArrayArray26[local755][1];
									@Pc(849) int local849 = local650.anIntArrayArray26[local755][2];
									@Pc(858) int local858 = local650.anIntArrayArray26[local755][3] << 3;
									@Pc(867) int local867 = local650.anIntArrayArray26[local755][4] << 3;
									@Pc(876) int local876 = local650.anIntArrayArray26[local755][5] << 3;
									if (this.anIntArrayArray5 == null) {
										this.anIntArrayArray5 = new int[local650.anIntArrayArray26.length][];
									}
									if (this.anIntArrayArray5[local755] == null) {
										@Pc(898) int[] local898 = this.anIntArrayArray5[local755] = new int[15];
										if (local858 == 0 && local867 == 0 && local876 == 0) {
											local898[14] = -local849;
											local898[0] = local898[4] = local898[8] = 32768;
											local898[13] = -local842;
											local898[12] = -local835;
										} else {
											@Pc(937) int local937 = Class151.anIntArray245[local858];
											@Pc(941) int local941 = Class151.anIntArray244[local858];
											@Pc(945) int local945 = Class151.anIntArray245[local867];
											@Pc(949) int local949 = Class151.anIntArray244[local867];
											@Pc(953) int local953 = Class151.anIntArray245[local876];
											@Pc(957) int local957 = Class151.anIntArray244[local876];
											@Pc(965) int local965 = local941 * local953 + 8192 >> 14;
											@Pc(973) int local973 = local941 * local957 + 8192 >> 14;
											local898[1] = local965 * local949 + local945 * -local957 + 8192 >> 14;
											local898[6] = -local949 * local953 + local973 * local945 + 8192 >> 14;
											local898[4] = local937 * local953 + 8192 >> 14;
											local898[8] = local945 * local937 + 8192 >> 14;
											local898[3] = local957 * local937 + 8192 >> 14;
											local898[0] = local953 * local945 + local973 * local949 + 8192 >> 14;
											local898[5] = -local941;
											local898[7] = local945 * local965 + -local949 * -local957 + 8192 >> 14;
											local898[2] = local937 * local949 + 8192 >> 14;
											local898[12] = local898[6] * -local849 + local898[0] * -local835 + -local842 * local898[3] + 8192 >> 14;
											local898[14] = -local849 * local898[8] + local898[2] * -local835 + -local842 * local898[5] + 8192 >> 14;
											local898[13] = -local849 * local898[7] + local898[1] * -local835 + -local842 * local898[4] + 8192 >> 14;
										}
										local898[10] = local842;
										local898[9] = local835;
										local898[11] = local849;
									}
									if (local858 != 0 || local867 != 0 || local876 != 0) {
										local747[local755].method1376(local867, local876, local858);
									}
									if (local835 != 0 || local842 != 0 || local849 != 0) {
										local747[local755].method1364(local842, local849, local835);
									}
								}
							}
						}
						@Pc(1225) Class43 local1225 = new Class43(local747, local747.length);
						@Pc(1229) int local1229 = local33 | 0x4000;
						local642 = arg2.method6407(local1225, local1229, Static482.anInt8057, 64, 850);
						for (local835 = 0; local835 < 5; local835++) {
							for (local842 = 0; local842 < Static235.aShortArrayArrayArray1.length; local842++) {
								if (Static235.aShortArrayArrayArray1[local842][local835].length > this.anIntArray46[local835]) {
									local642.d(Static152.aShortArrayArray2[local842][local835], Static235.aShortArrayArrayArray1[local842][local835][this.anIntArray46[local835]]);
								}
							}
						}
						local642.SA(local33);
						@Pc(1295) Class326 local1295 = Static11.aClass326_1;
						synchronized (Static11.aClass326_1) {
							Static11.aClass326_1.method7236(local642, local36);
						}
						this.aLong57 = local36;
					}
					break;
				}
				local697 = local39[local691];
				if ((local697 & 0x40000000) == 0) {
					if ((local697 & Integer.MIN_VALUE) != 0 && !arg15.method2205(local697 & 0x3FFFFFFF).method7634()) {
						local689 = true;
					}
				} else if (!arg16.method5390(local697 & 0x3FFFFFFF).method7120(this.aBoolean90)) {
					local689 = true;
				}
				local691++;
			}
		}
		@Pc(1359) Class61 local1359 = local642.method7591((byte) 4, local33, true);
		if (!local148) {
			return local1359;
		}
		@Pc(1365) int local1365 = 0;
		local691 = 1;
		while (local1365 < local155) {
			if (Static355.aClass1_Sub3_Sub13Array5[local1365] != null) {
				local1359.method7610(Static389.anIntArray460[local1365] - 1, Static394.anIntArray466[local1365], Static575.aClass1_Sub3_Sub13Array4[local1365], local691, this.anIntArrayArray5 == null ? null : this.anIntArrayArray5[local1365], Static96.anIntArray118[local1365], false, Static355.aClass1_Sub3_Sub13Array5[local1365], Static294.anIntArray330[local1365]);
			}
			local691 <<= 0x1;
			local1365++;
		}
		if (local369 != null && local379 != null) {
			local1359.method7608(false, local363, arg3 - 1, local189, local369, local371, arg7 - 1, local379, local373, local375, local377, local381, local194, arg1.aBooleanArray9);
		} else if (local369 != null) {
			local1359.method7611(false, arg7 - 1, local363, 0, local371, local369, local189, local194);
		} else if (local379 != null) {
			local1359.method7611(false, arg3 - 1, local373, 0, local381, local379, local375, local377);
		}
		for (local697 = 0; local697 < local155; local697++) {
			Static355.aClass1_Sub3_Sub13Array5[local697] = null;
			Static575.aClass1_Sub3_Sub13Array4[local697] = null;
			Static2.aClass131Array1[local697] = null;
		}
		return local1359;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!k;ILclient!hca;Lclient!tfa;ILclient!oa;Lclient!r;Lclient!ml;Lclient!eu;ZI)Lclient!da;")
	public Class61 method1021(@OriginalArg(0) int arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class131 arg3, @OriginalArg(4) Class311 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class234 arg6, @OriginalArg(7) Class12 arg7, @OriginalArg(8) Interface15 arg8, @OriginalArg(9) Class93 arg9) {
		if (this.anInt1112 != -1) {
			return arg1.method4062(this.anInt1112).method3804(arg0, arg2, arg4, arg7, arg8, arg5, arg3);
		}
		@Pc(28) int local28 = 2048;
		@Pc(36) boolean local36;
		@Pc(55) int local55;
		@Pc(118) int local118;
		@Pc(59) int local59;
		@Pc(122) int local122;
		if (arg3 != null) {
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			local36 = false;
			@Pc(38) boolean local38 = false;
			local28 = 2080;
			local55 = arg3.anIntArray202[arg0];
			local59 = local55 >>> 16;
			@Pc(63) int local63 = local55 & 0xFFFF;
			@Pc(68) Class1_Sub3_Sub13 local68 = arg4.method7006(local59);
			if (local68 != null) {
				local34 = local68.method5310(local63) | false;
				local32 = local68.method5313(local63) | false;
				local38 = local68.method5311(local63) | false;
				local36 = arg3.aBoolean307 | false;
			}
			if ((arg3.aBoolean306 || Static153.aBoolean202) && arg5 != -1 && arg3.anIntArray202.length > arg5) {
				local118 = arg3.anIntArray202[arg5];
				local122 = local118 >>> 16;
				@Pc(126) int local126 = local118 & 0xFFFF;
				@Pc(136) Class1_Sub3_Sub13 local136 = local59 == local122 ? local68 : arg4.method7006(local122);
				if (local136 != null) {
					local34 |= local136.method5310(local126);
					local32 |= local136.method5313(local126);
					local38 |= local136.method5311(local126);
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
		@Pc(185) Class326 local185 = Static282.aClass326_26;
		@Pc(194) Class61 local194;
		synchronized (Static282.aClass326_26) {
			local194 = (Class61) Static282.aClass326_26.method7238(this.aLong56);
		}
		if (local194 == null || arg7.method6467(local194.PA(), local28) != 0) {
			if (local194 != null) {
				local28 = arg7.method6445(local28, local194.PA());
			}
			local36 = false;
			for (@Pc(225) int local225 = 0; local225 < 12; local225++) {
				local55 = this.anIntArray45[local225];
				if ((local55 & 0x40000000) == 0) {
					if ((local55 & Integer.MIN_VALUE) != 0 && !arg9.method2205(local55 & 0x3FFFFFFF).method7630()) {
						local36 = true;
					}
				} else if (!arg6.method5390(local55 & 0x3FFFFFFF).method7114(this.aBoolean90)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(289) Class43[] local289 = new Class43[12];
			local118 = 0;
			for (@Pc(293) int local293 = 0; local293 < 12; local293++) {
				@Pc(300) int local300 = this.anIntArray45[local293];
				@Pc(320) Class43 local320;
				if ((local300 & 0x40000000) != 0) {
					local320 = arg6.method5390(local300 & 0x3FFFFFFF).method7111(this.aBoolean90);
					if (local320 != null) {
						local289[local118++] = local320;
					}
				} else if ((Integer.MIN_VALUE & local300) != 0) {
					local320 = arg9.method2205(local300 & 0x3FFFFFFF).method7626();
					if (local320 != null) {
						local289[local118++] = local320;
					}
				}
			}
			@Pc(359) Class43 local359 = new Class43(local289, local118);
			@Pc(363) int local363 = local28 | 0x4000;
			local194 = arg7.method6407(local359, local363, Static482.anInt8057, 64, 768);
			for (local59 = 0; local59 < 5; local59++) {
				for (local122 = 0; local122 < Static235.aShortArrayArrayArray1.length; local122++) {
					if (Static235.aShortArrayArrayArray1[local122][local59].length > this.anIntArray46[local59]) {
						local194.d(Static152.aShortArrayArray2[local122][local59], Static235.aShortArrayArrayArray1[local122][local59][this.anIntArray46[local59]]);
					}
				}
			}
			local194.SA(local28);
			@Pc(427) Class326 local427 = Static282.aClass326_26;
			synchronized (Static282.aClass326_26) {
				Static282.aClass326_26.method7236(local194, this.aLong56);
			}
		}
		if (arg3 == null) {
			return local194;
		} else {
			local194.method7591((byte) 4, local28, true);
			return arg3.method3238(2048, local194, arg0, arg2, arg5);
		}
	}
}
