import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class178 {

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "[I")
	private int[] anIntArray263;

	@OriginalMember(owner = "client!jr", name = "j", descriptor = "I")
	private int anInt4982;

	@OriginalMember(owner = "client!jr", name = "o", descriptor = "Z")
	public boolean aBoolean328;

	@OriginalMember(owner = "client!jr", name = "v", descriptor = "J")
	private long aLong156;

	@OriginalMember(owner = "client!jr", name = "y", descriptor = "J")
	private long aLong157;

	@OriginalMember(owner = "client!jr", name = "z", descriptor = "[I")
	public int[] anIntArray266;

	@OriginalMember(owner = "client!jr", name = "x", descriptor = "I")
	public int anInt4993 = -1;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V")
	private void method4484() {
		@Pc(7) long[] local7 = Class3_Sub6.aLongArray21;
		this.aLong156 = -1L;
		this.aLong156 = this.aLong156 >>> 8 ^ local7[(int) ((this.aLong156 ^ (long) (this.anInt4982 >> 8)) & 0xFFL)];
		this.aLong156 = local7[(int) (((long) this.anInt4982 ^ this.aLong156) & 0xFFL)] ^ this.aLong156 >>> 8;
		for (@Pc(58) int local58 = 0; local58 < 12; local58++) {
			this.aLong156 = this.aLong156 >>> 8 ^ local7[(int) (((long) (this.anIntArray263[local58] >> 24) ^ this.aLong156) & 0xFFL)];
			this.aLong156 = this.aLong156 >>> 8 ^ local7[(int) (((long) (this.anIntArray263[local58] >> 16) ^ this.aLong156) & 0xFFL)];
			this.aLong156 = this.aLong156 >>> 8 ^ local7[(int) (((long) (this.anIntArray263[local58] >> 8) ^ this.aLong156) & 0xFFL)];
			this.aLong156 = local7[(int) ((this.aLong156 ^ (long) this.anIntArray263[local58]) & 0xFFL)] ^ this.aLong156 >>> 8;
		}
		for (@Pc(152) int local152 = 0; local152 < 5; local152++) {
			this.aLong156 = this.aLong156 >>> 8 ^ local7[(int) ((this.aLong156 ^ (long) this.anIntArray266[local152]) & 0xFFL)];
		}
		this.aLong156 = this.aLong156 >>> 8 ^ local7[(int) (((long) (this.aBoolean328 ? 1 : 0) ^ this.aLong156) & 0xFFL)];
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIILclient!raa;)V")
	public void method4485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class286 arg2) {
		@Pc(7) int local7 = Static57.anIntArray53[arg0];
		if (arg2.method7188(arg1) != null) {
			this.anIntArray263[local7] = Integer.MIN_VALUE | arg1;
			this.method4484();
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IILclient!cl;I)V")
	public void method4488(@OriginalArg(1) int arg0, @OriginalArg(2) Class53 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == -1) {
			this.anIntArray263[arg0] = 0;
		} else if (arg1.method1770(arg2) != null) {
			this.anIntArray263[arg0] = arg2 | 0x40000000;
			this.method4484();
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(III[IZ[I)V")
	public void method4489(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int[] arg4) {
		this.anIntArray266 = arg2;
		this.aBoolean328 = arg3;
		if (this.anInt4982 != arg1) {
			this.anInt4982 = arg1;
		}
		this.anInt4993 = arg0;
		this.anIntArray263 = arg4;
		this.method4484();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IILclient!nc;ILclient!raa;Lclient!vo;Lclient!ha;IIIII)Lclient!ka;")
	public Class17 method4492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class227 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class286 arg4, @OriginalArg(5) Class361 arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(11) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(93) int local93;
		@Pc(38) int local38;
		if (arg5 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			local7 = 2080;
			@Pc(34) int local34 = arg5.anIntArray638[arg3];
			local38 = local34 >>> 16;
			@Pc(43) Class3_Sub4_Sub8 local43 = arg2.method5974(local38);
			@Pc(47) int local47 = local34 & 0xFFFF;
			if (local43 != null) {
				local13 = local43.method3037(local47) | false;
				local11 = local43.method3036(local47) | false;
				local17 = local43.method3040(local47) | false;
				local15 = arg5.aBoolean710 | false;
			}
			if ((arg5.aBoolean707 || Static583.aBoolean687) && arg7 != -1 && arg7 < arg5.anIntArray638.length) {
				local93 = arg5.anIntArray638[arg7];
				@Pc(97) int local97 = local93 >>> 16;
				@Pc(101) int local101 = local93 & 0xFFFF;
				@Pc(106) Class3_Sub4_Sub8 local106;
				if (local38 == local97) {
					local106 = local43;
				} else {
					local106 = arg2.method5974(local101 >>> 16);
				}
				if (local106 != null) {
					local13 |= local106.method3037(local101);
					local11 |= local106.method3036(local101);
					local17 |= local106.method3040(local101);
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
		@Pc(174) long local174 = (long) (arg8 << 16) | (long) arg9 << 32 | (long) arg1;
		@Pc(176) Class102 local176 = Static83.aClass102_11;
		@Pc(184) Class17 local184;
		synchronized (Static83.aClass102_11) {
			local184 = (Class17) Static83.aClass102_11.method2677(local174);
		}
		if (local184 == null || arg6.method7541(local184.ua(), local7) != 0) {
			if (local184 != null) {
				local7 = arg6.method7501(local7, local184.ua());
			}
			@Pc(214) Class118[] local214 = new Class118[3];
			local93 = 0;
			if (!arg4.method7188(arg1).method6525() || !arg4.method7188(arg8).method6525() || !arg4.method7188(arg9).method6525()) {
				return null;
			}
			@Pc(244) Class118 local244 = arg4.method7188(arg1).method6518();
			if (local244 != null) {
				local93++;
				local214[0] = local244;
			}
			local244 = arg4.method7188(arg8).method6518();
			if (local244 != null) {
				local214[local93++] = local244;
			}
			local244 = arg4.method7188(arg9).method6518();
			if (local244 != null) {
				local214[local93++] = local244;
			}
			@Pc(283) int local283 = local7 | 0x4000;
			local244 = new Class118(local214, local93);
			local184 = arg6.method7490(local244, local283, Static416.anInt7576, 64, 768);
			for (@Pc(299) int local299 = 0; local299 < 5; local299++) {
				for (local38 = 0; local38 < Static341.aShortArrayArrayArray5.length; local38++) {
					if (this.anIntArray266[local299] < Static341.aShortArrayArrayArray5[local38][local299].length) {
						local184.ia(Static494.aShortArrayArray14[local38][local299], Static341.aShortArrayArrayArray5[local38][local299][this.anIntArray266[local299]]);
					}
				}
			}
			local184.s(local7);
			@Pc(357) Class102 local357 = Static83.aClass102_11;
			synchronized (Static83.aClass102_11) {
				Static83.aClass102_11.method2674(local174, local184);
			}
		}
		if (arg5 == null) {
			return local184;
		} else {
			local184 = local184.method5409((byte) 4, local7, true);
			return arg5.method8448(2048, arg7, arg3, arg0, local184);
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILclient!ab;Lclient!vo;ILclient!vo;ZLclient!jp;Lclient!nc;IILclient!raa;Lclient!ha;IILclient!pi;Lclient!cl;[III[Lclient!pba;I)Lclient!ka;")
	public Class17 method4493(@OriginalArg(0) int arg0, @OriginalArg(1) Interface1 arg1, @OriginalArg(2) Class361 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class361 arg4, @OriginalArg(6) Class177 arg5, @OriginalArg(7) Class227 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class286 arg9, @OriginalArg(11) Class5 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class261 arg13, @OriginalArg(15) Class53 arg14, @OriginalArg(16) int[] arg15, @OriginalArg(17) int arg16, @OriginalArg(18) int arg17, @OriginalArg(19) Class256[] arg18) {
		if (this.anInt4993 != -1) {
			return arg5.method4471(this.anInt4993).method2816(arg17, arg2, arg6, arg4, arg11, arg12, arg13, arg3, arg16, arg15, arg8, arg18, arg1, arg10, arg7, arg0);
		}
		@Pc(36) int local36 = arg16;
		@Pc(39) long local39 = this.aLong156;
		@Pc(42) int[] local42 = this.anIntArray263;
		if (arg4 != null && (arg4.anInt9857 >= 0 || arg4.anInt9870 >= 0)) {
			local42 = new int[12];
			for (@Pc(61) int local61 = 0; local61 < 12; local61++) {
				local42[local61] = this.anIntArray263[local61];
			}
			if (arg4.anInt9857 >= 0) {
				if (arg4.anInt9857 == 65535) {
					local42[5] = 0;
					local39 ^= 0xFFFFFFFF00000000L;
				} else {
					local42[5] = arg4.anInt9857 | 0x40000000;
					local39 ^= (long) local42[5] << 32;
				}
			}
			if (arg4.anInt9870 >= 0) {
				if (arg4.anInt9870 == 65535) {
					local42[3] = 0;
					local39 ^= 0xFFFFFFFFL;
				} else {
					local42[3] = arg4.anInt9870 | 0x40000000;
					local39 ^= local42[3];
				}
			}
		}
		@Pc(143) boolean local143 = false;
		@Pc(153) boolean local153 = false;
		@Pc(155) boolean local155 = false;
		@Pc(163) boolean local163 = arg4 != null || arg2 != null;
		@Pc(170) int local170 = arg18 == null ? 0 : arg18.length;
		@Pc(204) int local204;
		@Pc(209) int local209;
		for (@Pc(172) int local172 = 0; local172 < local170; local172++) {
			Static392.aClass3_Sub4_Sub8Array3[local172] = null;
			if (arg18[local172] != null) {
				@Pc(190) Class361 local190 = arg6.method5968(arg18[local172].anInt7639);
				if (local190.anIntArray638 != null) {
					Static579.aClass361Array2[local172] = local190;
					local163 = true;
					local204 = arg18[local172].anInt7631;
					local209 = arg18[local172].anInt7637;
					@Pc(214) int local214 = local190.anIntArray638[local204];
					Static392.aClass3_Sub4_Sub8Array3[local172] = arg6.method5974(local214 >>> 16);
					@Pc(227) int local227 = local214 & 0xFFFF;
					Static356.anIntArray408[local172] = local227;
					if (Static392.aClass3_Sub4_Sub8Array3[local172] != null) {
						local153 |= Static392.aClass3_Sub4_Sub8Array3[local172].method3037(local227);
						local143 |= Static392.aClass3_Sub4_Sub8Array3[local172].method3036(local227);
						local155 |= Static392.aClass3_Sub4_Sub8Array3[local172].method3040(local227);
					}
					if ((local190.aBoolean707 || Static583.aBoolean687) && local209 != -1 && local190.anIntArray638.length > local209) {
						Static140.anIntArray135[local172] = local190.anIntArray642[local204];
						Static325.anIntArray346[local172] = arg18[local172].anInt7629;
						@Pc(295) int local295 = local190.anIntArray638[local209];
						Static336.aClass3_Sub4_Sub8Array2[local172] = arg6.method5974(local295 >>> 16);
						@Pc(308) int local308 = local295 & 0xFFFF;
						Static375.anIntArray418[local172] = local308;
						if (Static336.aClass3_Sub4_Sub8Array2[local172] != null) {
							local153 |= Static336.aClass3_Sub4_Sub8Array2[local172].method3037(local308);
							local143 |= Static336.aClass3_Sub4_Sub8Array2[local172].method3036(local308);
							local155 |= Static336.aClass3_Sub4_Sub8Array2[local172].method3040(local308);
						}
					} else {
						Static140.anIntArray135[local172] = 0;
						Static325.anIntArray346[local172] = 0;
						Static336.aClass3_Sub4_Sub8Array2[local172] = null;
						Static375.anIntArray418[local172] = -1;
					}
				}
			}
		}
		@Pc(371) int local371 = -1;
		local204 = -1;
		local209 = 0;
		@Pc(377) Class3_Sub4_Sub8 local377 = null;
		@Pc(379) Class3_Sub4_Sub8 local379 = null;
		@Pc(381) int local381 = -1;
		@Pc(383) int local383 = -1;
		@Pc(385) int local385 = 0;
		@Pc(387) Class3_Sub4_Sub8 local387 = null;
		@Pc(389) Class3_Sub4_Sub8 local389 = null;
		if (local163) {
			local36 = arg16 | 0x20;
			@Pc(406) int local406;
			@Pc(466) int local466;
			if (arg4 != null) {
				local371 = arg4.anIntArray638[arg11];
				local406 = local371 >>> 16;
				local371 &= 0xFFFF;
				local377 = arg6.method5974(local406);
				if (local377 != null) {
					local153 |= local377.method3037(local371);
					local143 |= local377.method3036(local371);
					local155 |= local377.method3040(local371);
				}
				if ((arg4.aBoolean707 || Static583.aBoolean687) && arg8 != -1 && arg8 < arg4.anIntArray638.length) {
					local204 = arg4.anIntArray638[arg8];
					local209 = arg4.anIntArray642[arg11];
					local466 = local204 >>> 16;
					local204 &= 0xFFFF;
					local379 = local406 == local466 ? local377 : arg6.method5974(local466);
					if (local379 != null) {
						local153 |= local379.method3037(local204);
						local143 |= local379.method3036(local204);
						local155 |= local379.method3040(local204);
					}
				}
			}
			if (arg2 != null) {
				local381 = arg2.anIntArray638[arg17];
				local406 = local381 >>> 16;
				local381 &= 0xFFFF;
				local387 = arg6.method5974(local406);
				if (local387 != null) {
					local153 |= local387.method3037(local381);
					local143 |= local387.method3036(local381);
					local155 |= local387.method3040(local381);
				}
				if ((arg2.aBoolean707 || Static583.aBoolean687) && arg0 != -1 && arg0 < arg2.anIntArray638.length) {
					local385 = arg2.anIntArray642[arg17];
					local383 = arg2.anIntArray638[arg0];
					local466 = local383 >>> 16;
					local383 &= 0xFFFF;
					local389 = local406 == local466 ? local387 : arg6.method5974(local466);
					if (local389 != null) {
						local153 |= local389.method3037(local383);
						local143 |= local389.method3036(local383);
						local155 |= local389.method3040(local383);
					}
				}
			}
			if (local153) {
				local36 |= 0x80;
			}
			if (local143) {
				local36 |= 0x100;
			}
			if (local155) {
				local36 |= 0x400;
			}
		}
		@Pc(634) Class102 local634 = Static613.aClass102_63;
		@Pc(642) Class17 local642;
		synchronized (Static613.aClass102_63) {
			local642 = (Class17) Static613.aClass102_63.method2677(local39);
		}
		@Pc(650) Class143 local650 = null;
		if (this.anInt4982 != -1) {
			local650 = arg13.method6770(this.anInt4982);
		}
		@Pc(684) boolean local684;
		@Pc(686) int local686;
		@Pc(692) int local692;
		@Pc(774) int local774;
		@Pc(780) int local780;
		@Pc(844) int local844;
		if (local642 == null || arg10.method7541(local642.ua(), local36) != 0) {
			if (local642 != null) {
				local36 = arg10.method7501(local36, local642.ua());
			}
			local684 = false;
			for (local686 = 0; local686 < 12; local686++) {
				local692 = local42[local686];
				if ((local692 & 0x40000000) == 0) {
					if ((local692 & Integer.MIN_VALUE) != 0 && !arg9.method7188(local692 & 0x3FFFFFFF).method6522()) {
						local684 = true;
					}
				} else if (!arg14.method1770(local692 & 0x3FFFFFFF).method1477(this.aBoolean328)) {
					local684 = true;
				}
			}
			if (local684) {
				if (this.aLong157 != -1L) {
					@Pc(741) Class102 local741 = Static613.aClass102_63;
					synchronized (Static613.aClass102_63) {
						local642 = (Class17) Static613.aClass102_63.method2677(this.aLong157);
					}
				}
				if (local642 == null || arg10.method7541(local642.ua(), local36) != 0) {
					return null;
				}
			} else {
				@Pc(772) Class118[] local772 = new Class118[12];
				for (local774 = 0; local774 < 12; local774++) {
					local780 = local42[local774];
					@Pc(800) Class118 local800;
					if ((local780 & 0x40000000) != 0) {
						local800 = arg14.method1770(local780 & 0x3FFFFFFF).method1479(this.aBoolean328);
						if (local800 != null) {
							local772[local774] = local800;
						}
					} else if ((Integer.MIN_VALUE & local780) != 0) {
						local800 = arg9.method7188(local780 & 0x3FFFFFFF).method6520();
						if (local800 != null) {
							local772[local774] = local800;
						}
					}
				}
				@Pc(846) int local846;
				if (local650 != null && local650.anIntArrayArray32 != null) {
					for (local780 = 0; local780 < local650.anIntArrayArray32.length; local780++) {
						if (local772[local780] != null) {
							local844 = 0;
							local846 = 0;
							@Pc(848) int local848 = 0;
							@Pc(850) int local850 = 0;
							@Pc(852) int local852 = 0;
							@Pc(854) int local854 = 0;
							if (local650.anIntArrayArray32[local780] != null) {
								local846 = local650.anIntArrayArray32[local780][1];
								local850 = local650.anIntArrayArray32[local780][3] << 3;
								local848 = local650.anIntArrayArray32[local780][2];
								local844 = local650.anIntArrayArray32[local780][0];
								local852 = local650.anIntArrayArray32[local780][4] << 3;
								local854 = local650.anIntArrayArray32[local780][5] << 3;
							}
							if (local850 != 0 || local852 != 0 || local854 != 0) {
								local772[local780].method2927(local852, local850, local854);
							}
							if (local844 != 0 || local846 != 0 || local848 != 0) {
								local772[local780].method2937(local844, local846, local848);
							}
						}
					}
				}
				@Pc(964) Class118 local964 = new Class118(local772, local772.length);
				@Pc(968) int local968 = local36 | 0x4000;
				local642 = arg10.method7490(local964, local968, Static416.anInt7576, 64, 850);
				for (local844 = 0; local844 < 5; local844++) {
					for (local846 = 0; local846 < Static341.aShortArrayArrayArray5.length; local846++) {
						if (this.anIntArray266[local844] < Static341.aShortArrayArrayArray5[local846][local844].length) {
							local642.ia(Static494.aShortArrayArray14[local846][local844], Static341.aShortArrayArrayArray5[local846][local844][this.anIntArray266[local844]]);
						}
					}
				}
				local642.s(local36);
				@Pc(1030) Class102 local1030 = Static613.aClass102_63;
				synchronized (Static613.aClass102_63) {
					Static613.aClass102_63.method2674(local39, local642);
				}
				this.aLong157 = local39;
			}
		}
		@Pc(1052) Class17 local1052 = local642.method5409((byte) 4, local36, true);
		local684 = false;
		if (arg15 != null) {
			for (local686 = 0; local686 < 12; local686++) {
				if (arg15[local686] != -1) {
					local684 = true;
				}
			}
		}
		if (!local163 && !local684) {
			return local1052;
		}
		@Pc(1082) Class39[] local1082 = null;
		if (local650 != null) {
			local1082 = local650.method3682(arg10);
		}
		if (local684 && local1082 != null) {
			for (local692 = 0; local692 < 12; local692++) {
				if (local1082[local692] != null) {
					local1052.method5410(local1082[local692], 0x1 << local692, true);
				}
			}
		}
		local692 = 0;
		local774 = 1;
		while (local170 > local692) {
			if (Static392.aClass3_Sub4_Sub8Array3[local692] != null) {
				local1052.method5419(Static325.anIntArray346[local692] - 1, Static375.anIntArray418[local692], Static336.aClass3_Sub4_Sub8Array2[local692], local774, Static356.anIntArray408[local692], Static140.anIntArray135[local692], null, Static392.aClass3_Sub4_Sub8Array3[local692], false);
			}
			local692++;
			local774 <<= 0x1;
		}
		if (local684) {
			for (local780 = 0; local780 < 12; local780++) {
				if (arg15[local780] != -1) {
					local844 = arg15[local780] - arg7;
					local844 &= 0x3FFF;
					@Pc(1185) Class39 local1185 = arg10.method7552();
					local1185.method7239(local844);
					local1052.method5410(local1185, 0x1 << local780, false);
				}
			}
		}
		if (local684 && local1082 != null) {
			for (local780 = 0; local780 < 12; local780++) {
				if (local1082[local780] != null) {
					local1052.method5410(local1082[local780], 0x1 << local780, false);
				}
			}
		}
		if (local377 != null && local387 != null) {
			local1052.method5428(arg3 - 1, local379, local389, local385, arg4.aBooleanArray28, local377, local204, arg12 - 1, local371, local383, local381, local387, local209, false);
		} else if (local377 != null) {
			local1052.method5421(false, local377, 0, local371, local379, arg12 - 1, local209, local204);
		} else if (local387 != null) {
			local1052.method5421(false, local387, 0, local381, local389, arg3 - 1, local385, local383);
		}
		for (local780 = 0; local780 < local170; local780++) {
			Static392.aClass3_Sub4_Sub8Array3[local780] = null;
			Static336.aClass3_Sub4_Sub8Array2[local780] = null;
			Static579.aClass361Array2[local780] = null;
		}
		return local1052;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(III)V")
	public void method4495(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray266[arg0] = arg1;
		this.method4484();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!vo;Lclient!ab;Lclient!jp;BIIILclient!nc;Lclient!cl;ILclient!ha;Lclient!raa;)Lclient!ka;")
	public Class17 method4496(@OriginalArg(0) Class361 arg0, @OriginalArg(1) Interface1 arg1, @OriginalArg(2) Class177 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class227 arg6, @OriginalArg(8) Class53 arg7, @OriginalArg(10) Class5 arg8, @OriginalArg(11) Class286 arg9) {
		if (this.anInt4993 != -1) {
			return arg2.method4471(this.anInt4993).method2814(arg0, arg6, arg8, arg5, arg4, arg1, arg3);
		}
		@Pc(27) int local27 = 2048;
		@Pc(35) boolean local35;
		@Pc(54) int local54;
		@Pc(114) int local114;
		@Pc(58) int local58;
		@Pc(118) int local118;
		if (arg0 != null) {
			@Pc(31) boolean local31 = false;
			@Pc(33) boolean local33 = false;
			local35 = false;
			@Pc(37) boolean local37 = false;
			local27 = 2080;
			local54 = arg0.anIntArray638[arg4];
			local58 = local54 >>> 16;
			@Pc(62) int local62 = local54 & 0xFFFF;
			@Pc(67) Class3_Sub4_Sub8 local67 = arg6.method5974(local58);
			if (local67 != null) {
				local33 = local67.method3037(local62) | false;
				local31 = local67.method3036(local62) | false;
				local37 = local67.method3040(local62) | false;
				local35 = arg0.aBoolean710 | false;
			}
			if ((arg0.aBoolean707 || Static583.aBoolean687) && arg3 != -1 && arg3 < arg0.anIntArray638.length) {
				local114 = arg0.anIntArray638[arg3];
				local118 = local114 >>> 16;
				@Pc(132) Class3_Sub4_Sub8 local132 = local58 == local118 ? local67 : arg6.method5974(local118);
				@Pc(136) int local136 = local114 & 0xFFFF;
				if (local132 != null) {
					local33 |= local132.method3037(local136);
					local31 |= local132.method3036(local136);
					local37 |= local132.method3040(local136);
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
		@Pc(185) Class102 local185 = Static83.aClass102_11;
		@Pc(194) Class17 local194;
		synchronized (Static83.aClass102_11) {
			local194 = (Class17) Static83.aClass102_11.method2677(this.aLong156);
		}
		if (local194 == null || arg8.method7541(local194.ua(), local27) != 0) {
			if (local194 != null) {
				local27 = arg8.method7501(local27, local194.ua());
			}
			local35 = false;
			for (@Pc(227) int local227 = 0; local227 < 12; local227++) {
				local54 = this.anIntArray263[local227];
				if ((local54 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local54) != 0 && !arg9.method7188(local54 & 0x3FFFFFFF).method6525()) {
						local35 = true;
					}
				} else if (!arg7.method1770(local54 & 0x3FFFFFFF).method1494(this.aBoolean328)) {
					local35 = true;
				}
			}
			if (local35) {
				return null;
			}
			@Pc(282) Class118[] local282 = new Class118[12];
			local114 = 0;
			for (@Pc(286) int local286 = 0; local286 < 12; local286++) {
				@Pc(293) int local293 = this.anIntArray263[local286];
				@Pc(311) Class118 local311;
				if ((local293 & 0x40000000) != 0) {
					local311 = arg7.method1770(local293 & 0x3FFFFFFF).method1488(this.aBoolean328);
					if (local311 != null) {
						local282[local114++] = local311;
					}
				} else if ((local293 & Integer.MIN_VALUE) != 0) {
					local311 = arg9.method7188(local293 & 0x3FFFFFFF).method6518();
					if (local311 != null) {
						local282[local114++] = local311;
					}
				}
			}
			@Pc(353) Class118 local353 = new Class118(local282, local114);
			@Pc(357) int local357 = local27 | 0x4000;
			local194 = arg8.method7490(local353, local357, Static416.anInt7576, 64, 768);
			for (local58 = 0; local58 < 5; local58++) {
				for (local118 = 0; local118 < Static341.aShortArrayArrayArray5.length; local118++) {
					if (this.anIntArray266[local58] < Static341.aShortArrayArrayArray5[local118][local58].length) {
						local194.ia(Static494.aShortArrayArray14[local118][local58], Static341.aShortArrayArrayArray5[local118][local58][this.anIntArray266[local58]]);
					}
				}
			}
			local194.s(local27);
			@Pc(419) Class102 local419 = Static83.aClass102_11;
			synchronized (Static83.aClass102_11) {
				Static83.aClass102_11.method2674(this.aLong156, local194);
			}
		}
		if (arg0 == null) {
			return local194;
		} else {
			local194.method5409((byte) 4, local27, true);
			return arg0.method8448(2048, arg3, arg4, arg5, local194);
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZB)V")
	public void method4497(@OriginalArg(0) boolean arg0) {
		this.aBoolean328 = arg0;
		this.method4484();
	}
}
