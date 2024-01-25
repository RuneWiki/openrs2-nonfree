import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class31 {

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "[I")
	public int[] anIntArray118;

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "J")
	private long aLong39;

	@OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!cj", name = "m", descriptor = "Z")
	public boolean aBoolean88;

	@OriginalMember(owner = "client!cj", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!cj", name = "s", descriptor = "J")
	private long aLong40;

	@OriginalMember(owner = "client!cj", name = "v", descriptor = "[I")
	private int[] anIntArray120;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
	public int anInt962 = -1;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZII)V")
	public void method1003(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static340.anIntArray471[arg1];
		if (this.anIntArray120[local7] != 0 && Static11.method4791(arg0) != null) {
			this.anIntArray120[local7] = arg0 | Integer.MIN_VALUE;
			this.method1005();
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)V")
	public void method1004(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray118[arg1] = arg0;
		this.method1005();
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V")
	private void method1005() {
		@Pc(7) long[] local7 = Class42.aLongArray5;
		this.aLong40 = -1L;
		this.aLong40 = this.aLong40 >>> 8 ^ local7[(int) ((this.aLong40 ^ (long) (this.anInt967 >> 8)) & 0xFFL)];
		this.aLong40 = local7[(int) ((this.aLong40 ^ (long) this.anInt967) & 0xFFL)] ^ this.aLong40 >>> 8;
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong40 = this.aLong40 >>> 8 ^ local7[(int) ((this.aLong40 ^ (long) (this.anIntArray120[local50] >> 24)) & 0xFFL)];
			this.aLong40 = local7[(int) ((this.aLong40 ^ (long) (this.anIntArray120[local50] >> 16)) & 0xFFL)] ^ this.aLong40 >>> 8;
			this.aLong40 = local7[(int) ((this.aLong40 ^ (long) (this.anIntArray120[local50] >> 8)) & 0xFFL)] ^ this.aLong40 >>> 8;
			this.aLong40 = local7[(int) ((this.aLong40 ^ (long) this.anIntArray120[local50]) & 0xFFL)] ^ this.aLong40 >>> 8;
		}
		for (@Pc(150) int local150 = 0; local150 < 5; local150++) {
			this.aLong40 = this.aLong40 >>> 8 ^ local7[(int) (((long) this.anIntArray118[local150] ^ this.aLong40) & 0xFFL)];
		}
		this.aLong40 = this.aLong40 >>> 8 ^ local7[(int) (((long) (this.aBoolean88 ? 1 : 0) ^ this.aLong40) & 0xFFL)];
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I[I[IIIZ)V")
	public void method1009(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg0 != this.anInt967) {
			this.anInt967 = arg0;
			this.anIntArrayArray3 = null;
		}
		if (arg2 == null) {
			arg2 = new int[12];
			for (@Pc(22) int local22 = 0; local22 < 8; local22++) {
				for (@Pc(26) int local26 = 0; local26 < Static229.anInt1683; local26++) {
					@Pc(32) Class209 local32 = Static11.method4791(local26);
					if (local32 != null && !local32.aBoolean545 && (arg4 ? Static268.anIntArray653[local22] : Static12.anIntArray33[local22]) == local32.anInt6153) {
						arg2[Static340.anIntArray471[local22]] = local26 | Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
		this.aBoolean88 = arg4;
		this.anInt962 = arg3;
		this.anIntArray118 = arg1;
		this.anIntArray120 = arg2;
		this.method1005();
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!aa;IIIIIILclient!lo;I)Lclient!hc;")
	public Class78 method1010(@OriginalArg(1) Class2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class121 arg6, @OriginalArg(9) int arg7) {
		@Pc(7) int local7 = 1024;
		@Pc(30) int local30;
		@Pc(36) int local36;
		if (arg6 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			local7 = 1056;
			local30 = arg6.anIntArray446[arg2];
			local36 = local30 >>> 16;
			@Pc(40) Class1_Sub1_Sub3 local40 = Static210.method3849(local36);
			@Pc(44) int local44 = local30 & 0xFFFF;
			if (local40 != null) {
				local13 = local40.method818(local44) | false;
				local11 = local40.method824(local44) | false;
				local15 = arg6.aBoolean318 | false;
			}
			if ((arg6.aBoolean321 || Static334.aBoolean559) && arg7 != -1 && arg7 < arg6.anIntArray446.length) {
				@Pc(85) int local85 = arg6.anIntArray446[arg7];
				@Pc(89) int local89 = local85 >>> 16;
				@Pc(93) int local93 = local85 & 0xFFFF;
				@Pc(102) Class1_Sub1_Sub3 local102;
				if (local36 == local89) {
					local102 = local40;
				} else {
					local102 = Static210.method3849(local93 >>> 16);
				}
				if (local102 != null) {
					local13 |= local102.method818(local93);
					local11 |= local102.method824(local93);
				}
			}
			if (local13) {
				local7 = 1184;
			}
			if (local11) {
				local7 |= 0x100;
			}
			if (local15) {
				local7 |= 0x200;
			}
		}
		@Pc(152) long local152 = (long) arg4 << 32 | (long) (arg5 << 16) | (long) arg1;
		@Pc(154) Class140 local154 = Static102.aClass140_59;
		@Pc(162) Class78 local162;
		synchronized (Static102.aClass140_59) {
			local162 = (Class78) Static102.aClass140_59.method3816(local152);
		}
		if (local162 == null || arg0.method3247(local162.method4398(), local7) != 0) {
			if (local162 != null) {
				local7 = arg0.method3292(local7, local162.method4398());
			}
			@Pc(192) Class12[] local192 = new Class12[3];
			@Pc(194) int local194 = 0;
			if (!Static11.method4791(arg1).method5388() || !Static11.method4791(arg5).method5388() || !Static11.method4791(arg4).method5388()) {
				return null;
			}
			@Pc(222) Class12 local222 = Static11.method4791(arg1).method5385();
			if (local222 != null) {
				local194++;
				local192[0] = local222;
			}
			local222 = Static11.method4791(arg5).method5385();
			if (local222 != null) {
				local192[local194++] = local222;
			}
			local222 = Static11.method4791(arg4).method5385();
			if (local222 != null) {
				local192[local194++] = local222;
			}
			local222 = new Class12(local192, local194);
			local30 = local7 | 0x2000;
			local162 = arg0.method3251(local222, local30, Static8.anInt204, 64, 768);
			for (local36 = 0; local36 < 5; local36++) {
				if (Static172.aShortArrayArray8[local36].length > this.anIntArray118[local36]) {
					local162.method4374(Static204.aShortArray56[local36], Static172.aShortArrayArray8[local36][this.anIntArray118[local36]]);
				}
				if (this.anIntArray118[local36] < Static86.aShortArrayArray3[local36].length) {
					local162.method4374(Static314.aShortArray95[local36], Static86.aShortArrayArray3[local36][this.anIntArray118[local36]]);
				}
			}
			local162.method4373(local7);
			@Pc(340) Class140 local340 = Static102.aClass140_59;
			synchronized (Static102.aClass140_59) {
				Static102.aClass140_59.method3817(local152, local162);
			}
		}
		if (arg6 == null) {
			return local162;
		} else {
			local162 = local162.method4394((byte) 1, local7, true);
			return arg6.method3560(local162, 1024, arg7, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!lo;ILclient!aa;IIII)Lclient!hc;")
	public Class78 method1011(@OriginalArg(0) Class121 arg0, @OriginalArg(2) Class2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (this.anInt962 != -1) {
			return Static232.method5539(this.anInt962).method3568(arg0, arg4, arg2, arg3, arg1);
		}
		@Pc(26) int local26 = 1024;
		@Pc(34) boolean local34;
		@Pc(51) int local51;
		@Pc(105) int local105;
		@Pc(55) int local55;
		@Pc(109) int local109;
		if (arg0 != null) {
			@Pc(30) boolean local30 = false;
			@Pc(32) boolean local32 = false;
			local34 = false;
			local26 = 1056;
			local51 = arg0.anIntArray446[arg4];
			local55 = local51 >>> 16;
			@Pc(59) int local59 = local51 & 0xFFFF;
			@Pc(65) Class1_Sub1_Sub3 local65 = Static210.method3849(local55);
			if (local65 != null) {
				local32 = local65.method818(local59) | false;
				local30 = local65.method824(local59) | false;
				local34 = arg0.aBoolean318 | false;
			}
			if ((arg0.aBoolean321 || Static334.aBoolean559) && arg2 != -1 && arg0.anIntArray446.length > arg2) {
				local105 = arg0.anIntArray446[arg2];
				local109 = local105 >>> 16;
				@Pc(120) Class1_Sub1_Sub3 local120 = local55 == local109 ? local65 : Static210.method3849(local109);
				@Pc(124) int local124 = local105 & 0xFFFF;
				if (local120 != null) {
					local32 |= local120.method818(local124);
					local30 |= local120.method824(local124);
				}
			}
			if (local32) {
				local26 = 1184;
			}
			if (local30) {
				local26 |= 0x100;
			}
			if (local34) {
				local26 |= 0x200;
			}
		}
		@Pc(162) Class140 local162 = Static102.aClass140_59;
		@Pc(171) Class78 local171;
		synchronized (Static102.aClass140_59) {
			local171 = (Class78) Static102.aClass140_59.method3816(this.aLong40);
		}
		if (local171 == null || arg1.method3247(local171.method4398(), local26) != 0) {
			if (local171 != null) {
				local26 = arg1.method3292(local26, local171.method4398());
			}
			local34 = false;
			for (local51 = 0; local51 < 12; local51++) {
				local105 = this.anIntArray120[local51];
				if ((local105 & 0x40000000) == 0) {
					if ((local105 & Integer.MIN_VALUE) != 0 && !Static11.method4791(local105 & 0x3FFFFFFF).method5388()) {
						local34 = true;
					}
				} else if (!Static241.method4285(local105 & 0x3FFFFFFF).method1739(this.aBoolean88)) {
					local34 = true;
				}
			}
			if (local34) {
				return null;
			}
			@Pc(249) Class12[] local249 = new Class12[12];
			@Pc(251) int local251 = 0;
			for (@Pc(253) int local253 = 0; local253 < 12; local253++) {
				local55 = this.anIntArray120[local253];
				@Pc(274) Class12 local274;
				if ((local55 & 0x40000000) != 0) {
					local274 = Static241.method4285(local55 & 0x3FFFFFFF).method1724(this.aBoolean88);
					if (local274 != null) {
						local249[local251++] = local274;
					}
				} else if ((local55 & Integer.MIN_VALUE) != 0) {
					local274 = Static11.method4791(local55 & 0x3FFFFFFF).method5385();
					if (local274 != null) {
						local249[local251++] = local274;
					}
				}
			}
			@Pc(316) int local316 = local26 | 0x2000;
			@Pc(322) Class12 local322 = new Class12(local249, local251);
			local171 = arg1.method3251(local322, local316, Static8.anInt204, 64, 768);
			for (local109 = 0; local109 < 5; local109++) {
				if (this.anIntArray118[local109] < Static172.aShortArrayArray8[local109].length) {
					local171.method4374(Static204.aShortArray56[local109], Static172.aShortArrayArray8[local109][this.anIntArray118[local109]]);
				}
				if (this.anIntArray118[local109] < Static86.aShortArrayArray3[local109].length) {
					local171.method4374(Static314.aShortArray95[local109], Static86.aShortArrayArray3[local109][this.anIntArray118[local109]]);
				}
			}
			local171.method4373(local26);
			@Pc(389) Class140 local389 = Static102.aClass140_59;
			synchronized (Static102.aClass140_59) {
				Static102.aClass140_59.method3817(this.aLong40, local171);
			}
		}
		if (arg0 == null) {
			return local171;
		} else {
			local171.method4394((byte) 1, local26, true);
			return arg0.method3560(local171, 1024, arg2, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)V")
	public void method1012(@OriginalArg(0) boolean arg0) {
		this.aBoolean88 = arg0;
		this.method1005();
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I[Lclient!ff;IIILclient!aa;IIIIZLclient!lo;Lclient!lo;)Lclient!hc;")
	public Class78 method1013(@OriginalArg(0) int arg0, @OriginalArg(1) Class59[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(11) Class121 arg9, @OriginalArg(12) Class121 arg10) {
		if (this.anInt962 != -1) {
			return Static232.method5539(this.anInt962).method3572(arg4, arg2, arg10, arg1, arg5, arg0, arg6, arg3, arg7, arg8, arg9);
		}
		@Pc(30) int local30 = arg3;
		@Pc(33) long local33 = this.aLong40;
		@Pc(36) int[] local36 = this.anIntArray120;
		if (arg10 != null && (arg10.anInt3777 >= 0 || arg10.anInt3774 >= 0)) {
			local36 = new int[12];
			for (@Pc(49) int local49 = 0; local49 < 12; local49++) {
				local36[local49] = this.anIntArray120[local49];
			}
			if (arg10.anInt3777 >= 0) {
				if (arg10.anInt3777 == 65535) {
					local33 ^= 0xFFFFFFFF00000000L;
					local36[5] = 0;
				} else {
					local36[5] = arg10.anInt3777 | 0x40000000;
					local33 ^= (long) local36[5] << 32;
				}
			}
			if (arg10.anInt3774 >= 0) {
				if (arg10.anInt3774 == 65535) {
					local33 ^= 0xFFFFFFFFL;
					local36[3] = 0;
				} else {
					local36[3] = arg10.anInt3774 | 0x40000000;
					local33 ^= local36[3];
				}
			}
		}
		@Pc(131) boolean local131 = false;
		@Pc(133) boolean local133 = false;
		@Pc(141) boolean local141 = arg10 != null || arg9 != null;
		@Pc(148) int local148 = arg1 == null ? 0 : arg1.length;
		@Pc(188) int local188;
		@Pc(193) int local193;
		for (@Pc(150) int local150 = 0; local150 < local148; local150++) {
			Static219.aClass1_Sub1_Sub3Array2[local150] = null;
			if (arg1[local150] != null) {
				@Pc(174) Class121 local174 = Static133.method2520(arg1[local150].anInt1772);
				if (local174.anIntArray446 != null) {
					Static231.aClass121Array1[local150] = local174;
					local141 = true;
					local188 = arg1[local150].anInt1771;
					local193 = arg1[local150].anInt1766;
					@Pc(198) int local198 = local174.anIntArray446[local188];
					Static219.aClass1_Sub1_Sub3Array2[local150] = Static210.method3849(local198 >>> 16);
					@Pc(210) int local210 = local198 & 0xFFFF;
					Static25.anIntArray84[local150] = local210;
					if (Static219.aClass1_Sub1_Sub3Array2[local150] != null) {
						local133 |= Static219.aClass1_Sub1_Sub3Array2[local150].method818(local210);
						local131 |= Static219.aClass1_Sub1_Sub3Array2[local150].method824(local210);
					}
					if ((local174.aBoolean321 || Static334.aBoolean559) && local193 != -1 && local174.anIntArray446.length > local193) {
						Static290.anIntArray709[local150] = local174.anIntArray444[local188];
						Static306.anIntArray742[local150] = arg1[local150].anInt1770;
						@Pc(268) int local268 = local174.anIntArray446[local193];
						Static282.aClass1_Sub1_Sub3Array4[local150] = Static210.method3849(local268 >>> 16);
						@Pc(280) int local280 = local268 & 0xFFFF;
						Static29.anIntArray92[local150] = local280;
						if (Static282.aClass1_Sub1_Sub3Array4[local150] != null) {
							local133 |= Static282.aClass1_Sub1_Sub3Array4[local150].method818(local280);
							local131 |= Static282.aClass1_Sub1_Sub3Array4[local150].method824(local280);
						}
					} else {
						Static290.anIntArray709[local150] = 0;
						Static306.anIntArray742[local150] = 0;
						Static282.aClass1_Sub1_Sub3Array4[local150] = null;
						Static29.anIntArray92[local150] = -1;
					}
				}
			}
		}
		@Pc(334) int local334 = -1;
		local188 = -1;
		local193 = 0;
		@Pc(340) Class1_Sub1_Sub3 local340 = null;
		@Pc(342) Class1_Sub1_Sub3 local342 = null;
		@Pc(344) int local344 = -1;
		@Pc(346) int local346 = -1;
		@Pc(348) int local348 = 0;
		@Pc(350) Class1_Sub1_Sub3 local350 = null;
		@Pc(352) Class1_Sub1_Sub3 local352 = null;
		if (local141) {
			@Pc(365) int local365;
			@Pc(421) int local421;
			if (arg10 != null) {
				local334 = arg10.anIntArray446[arg2];
				local365 = local334 >>> 16;
				local334 &= 0xFFFF;
				local340 = Static210.method3849(local365);
				if (local340 != null) {
					local133 |= local340.method818(local334);
					local131 |= local340.method824(local334);
				}
				if ((arg10.aBoolean321 || Static334.aBoolean559) && arg4 != -1 && arg4 < arg10.anIntArray446.length) {
					local193 = arg10.anIntArray444[arg2];
					local188 = arg10.anIntArray446[arg4];
					local421 = local188 >>> 16;
					local342 = local365 == local421 ? local340 : Static210.method3849(local421);
					local188 &= 0xFFFF;
					if (local342 != null) {
						local133 |= local342.method818(local188);
						local131 |= local342.method824(local188);
					}
				}
			}
			local30 = arg3 | 0x20;
			if (arg9 != null) {
				local344 = arg9.anIntArray446[arg7];
				local365 = local344 >>> 16;
				local344 &= 0xFFFF;
				local350 = Static210.method3849(local365);
				if (local350 != null) {
					local133 |= local350.method818(local344);
					local131 |= local350.method824(local344);
				}
				if ((arg9.aBoolean321 || Static334.aBoolean559) && arg6 != -1 && arg6 < arg9.anIntArray446.length) {
					local346 = arg9.anIntArray446[arg6];
					local348 = arg9.anIntArray444[arg7];
					local421 = local346 >>> 16;
					local352 = local365 == local421 ? local350 : Static210.method3849(local421);
					local346 &= 0xFFFF;
					if (local352 != null) {
						local133 |= local352.method818(local346);
						local131 |= local352.method824(local346);
					}
				}
			}
			if (local133) {
				local30 |= 0x80;
			}
			if (local131) {
				local30 |= 0x100;
			}
		}
		@Pc(568) Class140 local568 = Static69.aClass140_39;
		@Pc(576) Class78 local576;
		synchronized (Static69.aClass140_39) {
			local576 = (Class78) Static69.aClass140_39.method3816(local33);
		}
		@Pc(584) Class45 local584 = null;
		if (this.anInt967 != -1) {
			local584 = Static126.method2408(this.anInt967);
		}
		@Pc(627) int local627;
		@Pc(633) int local633;
		if (local576 == null || arg5.method3247(local576.method4398(), local30) != 0 || local584 != null && local584.anIntArrayArray9 != null && this.anIntArrayArray3 == null) {
			if (local576 != null) {
				local30 = arg5.method3292(local30, local576.method4398());
			}
			@Pc(625) boolean local625 = false;
			local627 = 0;
			while (true) {
				if (local627 >= 12) {
					if (local625) {
						if (this.aLong39 != -1L) {
							@Pc(1262) Class140 local1262 = Static69.aClass140_39;
							synchronized (Static69.aClass140_39) {
								local576 = (Class78) Static69.aClass140_39.method3816(this.aLong39);
							}
						}
						if (local576 == null || arg5.method3247(local576.method4398(), local30) != 0 || local584 != null && local584.anIntArrayArray9 != null && this.anIntArrayArray3 == null) {
							return null;
						}
					} else {
						@Pc(676) Class12[] local676 = new Class12[12];
						@Pc(684) int local684;
						for (@Pc(678) int local678 = 0; local678 < 12; local678++) {
							local684 = local36[local678];
							@Pc(707) Class12 local707;
							if ((local684 & 0x40000000) != 0) {
								local707 = Static241.method4285(local684 & 0x3FFFFFFF).method1727(this.aBoolean88);
								if (local707 != null) {
									local676[local678] = local707;
								}
							} else if ((local684 & Integer.MIN_VALUE) != 0) {
								local707 = Static11.method4791(local684 & 0x3FFFFFFF).method5392();
								if (local707 != null) {
									local676[local678] = local707;
								}
							}
						}
						@Pc(766) int local766;
						if (local584 != null && local584.anIntArrayArray9 != null) {
							for (local684 = 0; local684 < local584.anIntArrayArray9.length; local684++) {
								if (local584.anIntArrayArray9[local684] != null && local676[local684] != null) {
									local766 = local584.anIntArrayArray9[local684][0];
									@Pc(773) int local773 = local584.anIntArrayArray9[local684][1];
									@Pc(780) int local780 = local584.anIntArrayArray9[local684][2];
									@Pc(789) int local789 = local584.anIntArrayArray9[local684][3] << 3;
									@Pc(798) int local798 = local584.anIntArrayArray9[local684][4] << 3;
									@Pc(807) int local807 = local584.anIntArrayArray9[local684][5] << 3;
									if (this.anIntArrayArray3 == null) {
										this.anIntArrayArray3 = new int[local584.anIntArrayArray9.length][];
									}
									if (this.anIntArrayArray3[local684] == null) {
										@Pc(829) int[] local829 = this.anIntArrayArray3[local684] = new int[15];
										if (local789 == 0 && local798 == 0 && local807 == 0) {
											local829[14] = -local780;
											local829[0] = local829[4] = local829[8] = 32768;
											local829[13] = -local773;
											local829[12] = -local766;
										} else {
											@Pc(845) int local845 = Class1_Sub1_Sub16.anIntArray586[local789];
											@Pc(849) int local849 = Class1_Sub1_Sub16.anIntArray587[local789];
											@Pc(853) int local853 = Class1_Sub1_Sub16.anIntArray586[local798];
											@Pc(857) int local857 = Class1_Sub1_Sub16.anIntArray587[local798];
											@Pc(861) int local861 = Class1_Sub1_Sub16.anIntArray586[local807];
											@Pc(865) int local865 = Class1_Sub1_Sub16.anIntArray587[local807];
											@Pc(873) int local873 = local861 * local849 + 16384 >> 15;
											@Pc(881) int local881 = local865 * local849 + 16384 >> 15;
											local829[6] = local881 * local853 + local861 * -local857 + 16384 >> 15;
											local829[4] = local845 * local861 + 16384 >> 15;
											local829[7] = local853 * local873 + -local857 * -local865 + 16384 >> 15;
											local829[2] = local845 * local857 + 16384 >> 15;
											local829[8] = local853 * local845 + 16384 >> 15;
											local829[5] = -local849;
											local829[3] = local845 * local865 + 16384 >> 15;
											local829[1] = local873 * local857 + local853 * -local865 + 16384 >> 15;
											local829[0] = local857 * local881 + local861 * local853 + 16384 >> 15;
											local829[13] = local829[1] * -local766 + -local773 * local829[4] + -local780 * local829[7] + 16384 >> 15;
											local829[14] = -local766 * local829[2] + local829[5] * -local773 + local829[8] * -local780 + 16384 >> 15;
											local829[12] = local829[6] * -local780 + -local766 * local829[0] + -local773 * local829[3] + 16384 >> 15;
										}
										local829[10] = local773;
										local829[11] = local780;
										local829[9] = local766;
									}
									if (local789 != 0 || local798 != 0 || local807 != 0) {
										local676[local684].method379(local807, local798, local789);
									}
									if (local766 != 0 || local773 != 0 || local780 != 0) {
										local676[local684].method371(local773, local766, local780);
									}
								}
							}
						}
						@Pc(1159) int local1159 = local30 | 0x2000;
						@Pc(1166) Class12 local1166 = new Class12(local676, local676.length);
						local576 = arg5.method3251(local1166, local1159, Static8.anInt204, 64, 850);
						for (local766 = 0; local766 < 5; local766++) {
							if (this.anIntArray118[local766] < Static172.aShortArrayArray8[local766].length) {
								local576.method4374(Static204.aShortArray56[local766], Static172.aShortArrayArray8[local766][this.anIntArray118[local766]]);
							}
							if (this.anIntArray118[local766] < Static86.aShortArrayArray3[local766].length) {
								local576.method4374(Static314.aShortArray95[local766], Static86.aShortArrayArray3[local766][this.anIntArray118[local766]]);
							}
						}
						local576.method4373(local30);
						@Pc(1237) Class140 local1237 = Static69.aClass140_39;
						synchronized (Static69.aClass140_39) {
							Static69.aClass140_39.method3817(local33, local576);
						}
						this.aLong39 = local33;
					}
					break;
				}
				local633 = local36[local627];
				if ((local633 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local633) != 0 && !Static11.method4791(local633 & 0x3FFFFFFF).method5393()) {
						local625 = true;
					}
				} else if (!Static241.method4285(local633 & 0x3FFFFFFF).method1738(this.aBoolean88)) {
					local625 = true;
				}
				local627++;
			}
		}
		@Pc(1304) Class78 local1304 = local576.method4394((byte) 1, local30, true);
		if (!local141) {
			return local1304;
		}
		@Pc(1310) int local1310 = 0;
		local627 = 1;
		while (local1310 < local148) {
			if (Static219.aClass1_Sub1_Sub3Array2[local1310] != null) {
				local1304.method4397(false, Static219.aClass1_Sub1_Sub3Array2[local1310], this.anIntArrayArray3 == null ? null : this.anIntArrayArray3[local1310], Static282.aClass1_Sub1_Sub3Array4[local1310], Static25.anIntArray84[local1310], Static306.anIntArray742[local1310] - 1, Static29.anIntArray92[local1310], Static290.anIntArray709[local1310], local627);
			}
			local1310++;
			local627 <<= 0x1;
		}
		if (local340 != null && local350 != null) {
			local1304.method4401(arg8 - 1, local342, local334, false, local340, local352, local350, local188, local193, local348, arg10.aBooleanArray20, local344, arg0 - 1, local346);
		} else if (local340 != null) {
			local1304.method4382(local188, local334, local193, false, local340, 0, arg0 - 1, local342);
		} else if (local350 != null) {
			local1304.method4382(local346, local344, local348, false, local350, 0, arg8 - 1, local352);
		}
		for (local633 = 0; local633 < local148; local633++) {
			Static219.aClass1_Sub1_Sub3Array2[local633] = null;
			Static282.aClass1_Sub1_Sub3Array4[local633] = null;
			Static231.aClass121Array1[local633] = null;
		}
		return local1304;
	}
}
