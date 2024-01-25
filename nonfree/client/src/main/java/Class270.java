import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class270 {

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "Z")
	public boolean aBoolean503;

	@OriginalMember(owner = "client!wq", name = "e", descriptor = "[I")
	public int[] anIntArray510;

	@OriginalMember(owner = "client!wq", name = "i", descriptor = "J")
	private long aLong232;

	@OriginalMember(owner = "client!wq", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray64;

	@OriginalMember(owner = "client!wq", name = "m", descriptor = "I")
	private int anInt7462;

	@OriginalMember(owner = "client!wq", name = "o", descriptor = "J")
	private long aLong233;

	@OriginalMember(owner = "client!wq", name = "p", descriptor = "[I")
	private int[] anIntArray511;

	@OriginalMember(owner = "client!wq", name = "g", descriptor = "I")
	public int anInt7458 = -1;

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)V")
	private void method5990() {
		@Pc(7) long[] local7 = Class5_Sub2.aLongArray38;
		this.aLong232 = -1L;
		this.aLong232 = local7[(int) ((this.aLong232 ^ (long) (this.anInt7462 >> 8)) & 0xFFL)] ^ this.aLong232 >>> 8;
		this.aLong232 = this.aLong232 >>> 8 ^ local7[(int) ((this.aLong232 ^ (long) this.anInt7462) & 0xFFL)];
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong232 = local7[(int) (((long) (this.anIntArray511[local50] >> 24) ^ this.aLong232) & 0xFFL)] ^ this.aLong232 >>> 8;
			this.aLong232 = local7[(int) (((long) (this.anIntArray511[local50] >> 16) ^ this.aLong232) & 0xFFL)] ^ this.aLong232 >>> 8;
			this.aLong232 = this.aLong232 >>> 8 ^ local7[(int) (((long) (this.anIntArray511[local50] >> 8) ^ this.aLong232) & 0xFFL)];
			this.aLong232 = local7[(int) (((long) this.anIntArray511[local50] ^ this.aLong232) & 0xFFL)] ^ this.aLong232 >>> 8;
		}
		for (@Pc(151) int local151 = 0; local151 < 5; local151++) {
			this.aLong232 = this.aLong232 >>> 8 ^ local7[(int) (((long) this.anIntArray510[local151] ^ this.aLong232) & 0xFFL)];
		}
		this.aLong232 = local7[(int) ((this.aLong232 ^ (long) (this.aBoolean503 ? 1 : 0)) & 0xFFL)] ^ this.aLong232 >>> 8;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ZZ)V")
	public void method5992(@OriginalArg(1) boolean arg0) {
		this.aBoolean503 = arg0;
		this.method5990();
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!sb;IIILclient!za;ILclient!iv;IIIILclient!kt;)Lclient!e;")
	public Class57 method5993(@OriginalArg(0) Class219 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Class200 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class120 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class143 arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(97) int local97;
		if (arg9 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			@Pc(30) int local30 = arg9.anIntArray241[arg3];
			local7 = 2080;
			@Pc(38) int local38 = local30 >>> 16;
			@Pc(42) int local42 = local30 & 0xFFFF;
			@Pc(47) Class5_Sub2_Sub6 local47 = arg0.method4756(local38);
			if (local47 != null) {
				local13 = local47.method2002(local42) | false;
				local11 = local47.method2000(local42) | false;
				local17 = local47.method1999(local42) | false;
				local15 = arg9.aBoolean243 | false;
			}
			if ((arg9.aBoolean245 || Static17.aBoolean33) && arg6 != -1 && arg9.anIntArray241.length > arg6) {
				local97 = arg9.anIntArray241[arg6];
				@Pc(101) int local101 = local97 >>> 16;
				@Pc(105) int local105 = local97 & 0xFFFF;
				@Pc(115) Class5_Sub2_Sub6 local115;
				if (local38 == local101) {
					local115 = local47;
				} else {
					local115 = arg0.method4756(local105 >>> 16);
				}
				if (local115 != null) {
					local13 |= local115.method2002(local105);
					local11 |= local115.method2000(local105);
					local17 |= local115.method1999(local105);
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
		@Pc(183) long local183 = (long) arg1 << 32 | (long) (arg7 << 16) | (long) arg8;
		@Pc(185) Class44 local185 = Static335.aClass44_55;
		@Pc(193) Class57 local193;
		synchronized (Static335.aClass44_55) {
			local193 = (Class57) Static335.aClass44_55.method1028(local183);
		}
		if (local193 == null || arg2.method5860(local193.RA(), local7) != 0) {
			if (local193 != null) {
				local7 = arg2.method5879(local7, local193.RA());
			}
			@Pc(223) Class74[] local223 = new Class74[3];
			local97 = 0;
			if (!arg4.method2534(arg8).method2697() || !arg4.method2534(arg7).method2697() || !arg4.method2534(arg1).method2697()) {
				return null;
			}
			@Pc(255) Class74 local255 = arg4.method2534(arg8).method2696();
			if (local255 != null) {
				local97++;
				local223[0] = local255;
			}
			local255 = arg4.method2534(arg7).method2696();
			if (local255 != null) {
				local223[local97++] = local255;
			}
			local255 = arg4.method2534(arg1).method2696();
			if (local255 != null) {
				local223[local97++] = local255;
			}
			@Pc(294) int local294 = local7 | 0x4000;
			local255 = new Class74(local223, local97);
			local193 = arg2.method5882(local255, local294, Static228.anInt3789, 64, 768);
			for (@Pc(310) int local310 = 0; local310 < 5; local310++) {
				if (Static227.aShortArrayArray9[local310].length > this.anIntArray510[local310]) {
					local193.q(Static262.aShortArray72[local310], Static227.aShortArrayArray9[local310][this.anIntArray510[local310]]);
				}
				if (Static391.aShortArrayArray14[local310].length > this.anIntArray510[local310]) {
					local193.q(Static89.aShortArray6[local310], Static391.aShortArrayArray14[local310][this.anIntArray510[local310]]);
				}
			}
			local193.D(local7);
			@Pc(371) Class44 local371 = Static335.aClass44_55;
			synchronized (Static335.aClass44_55) {
				Static335.aClass44_55.method1017(local183, local193);
			}
		}
		if (arg9 == null) {
			return local193;
		} else {
			local193 = local193.method6066((byte) 4, local7, true);
			return arg9.method2987(local193, 2048, arg6, arg3, arg5);
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(III)V")
	public void method5994(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray510[arg0] = arg1;
		this.method5990();
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!iv;Lclient!kt;IILclient!za;ILclient!sb;ILclient!mc;Lclient!ep;ILclient!oi;)Lclient!e;")
	public Class57 method5996(@OriginalArg(0) Class120 arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class200 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class219 arg5, @OriginalArg(8) Interface9 arg6, @OriginalArg(9) Class67 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class180 arg9) {
		if (this.anInt7458 != -1) {
			return arg9.method3713(this.anInt7458).method2787(arg4, arg5, arg1, arg6, arg3, arg2, arg8);
		}
		@Pc(28) int local28 = 2048;
		@Pc(36) boolean local36;
		@Pc(49) int local49;
		@Pc(115) int local115;
		@Pc(59) int local59;
		if (arg1 != null) {
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			local36 = false;
			@Pc(38) boolean local38 = false;
			local49 = arg1.anIntArray241[arg4];
			local28 = 2080;
			local59 = local49 >>> 16;
			@Pc(64) Class5_Sub2_Sub6 local64 = arg5.method4756(local59);
			@Pc(68) int local68 = local49 & 0xFFFF;
			if (local64 != null) {
				local34 = local64.method2002(local68) | false;
				local32 = local64.method2000(local68) | false;
				local38 = local64.method1999(local68) | false;
				local36 = arg1.aBoolean243 | false;
			}
			if ((arg1.aBoolean245 || Static17.aBoolean33) && arg8 != -1 && arg8 < arg1.anIntArray241.length) {
				local115 = arg1.anIntArray241[arg8];
				@Pc(119) int local119 = local115 >>> 16;
				@Pc(123) int local123 = local115 & 0xFFFF;
				@Pc(133) Class5_Sub2_Sub6 local133 = local59 == local119 ? local64 : arg5.method4756(local119);
				if (local133 != null) {
					local34 |= local133.method2002(local123);
					local32 |= local133.method2000(local123);
					local38 |= local133.method1999(local123);
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
		@Pc(187) Class44 local187 = Static335.aClass44_55;
		@Pc(198) Class57 local198;
		synchronized (Static335.aClass44_55) {
			local198 = (Class57) Static335.aClass44_55.method1028(this.aLong232);
		}
		if (local198 == null || arg3.method5860(local198.RA(), local28) != 0) {
			if (local198 != null) {
				local28 = arg3.method5879(local28, local198.RA());
			}
			local36 = false;
			for (@Pc(226) int local226 = 0; local226 < 12; local226++) {
				local49 = this.anIntArray511[local226];
				if ((local49 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local49) != 0 && !arg0.method2534(local49 & 0x3FFFFFFF).method2697()) {
						local36 = true;
					}
				} else if (!arg7.method1452(local49 & 0x3FFFFFFF).method974(this.aBoolean503)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(285) Class74[] local285 = new Class74[12];
			local115 = 0;
			for (@Pc(289) int local289 = 0; local289 < 12; local289++) {
				@Pc(296) int local296 = this.anIntArray511[local289];
				@Pc(313) Class74 local313;
				if ((local296 & 0x40000000) != 0) {
					local313 = arg7.method1452(local296 & 0x3FFFFFFF).method971(this.aBoolean503);
					if (local313 != null) {
						local285[local115++] = local313;
					}
				} else if ((Integer.MIN_VALUE & local296) != 0) {
					local313 = arg0.method2534(local296 & 0x3FFFFFFF).method2696();
					if (local313 != null) {
						local285[local115++] = local313;
					}
				}
			}
			@Pc(355) Class74 local355 = new Class74(local285, local115);
			@Pc(359) int local359 = local28 | 0x4000;
			local198 = arg3.method5882(local355, local359, Static228.anInt3789, 64, 768);
			for (local59 = 0; local59 < 5; local59++) {
				if (this.anIntArray510[local59] < Static227.aShortArrayArray9[local59].length) {
					local198.q(Static262.aShortArray72[local59], Static227.aShortArrayArray9[local59][this.anIntArray510[local59]]);
				}
				if (Static391.aShortArrayArray14[local59].length > this.anIntArray510[local59]) {
					local198.q(Static89.aShortArray6[local59], Static391.aShortArrayArray14[local59][this.anIntArray510[local59]]);
				}
			}
			local198.D(local28);
			@Pc(424) Class44 local424 = Static335.aClass44_55;
			synchronized (Static335.aClass44_55) {
				Static335.aClass44_55.method1017(this.aLong232, local198);
			}
		}
		if (arg1 == null) {
			return local198;
		} else {
			local198.method6066((byte) 4, local28, true);
			return arg1.method2987(local198, 2048, arg8, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!ep;[Lclient!os;Lclient!sb;IILclient!lg;ILclient!iv;Lclient!za;ILclient!kt;ILclient!kt;IILclient!oi;IZLclient!mc;)Lclient!e;")
	public Class57 method5997(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class185[] arg1, @OriginalArg(2) Class219 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class149 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class120 arg6, @OriginalArg(8) Class200 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class143 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class143 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) Class180 arg14, @OriginalArg(16) int arg15, @OriginalArg(18) Interface9 arg16) {
		if (this.anInt7458 != -1) {
			return arg14.method3713(this.anInt7458).method2780(arg9, arg13, arg11, arg8, arg4, arg15, arg2, arg3, arg1, arg7, arg12, arg5, arg16, arg10);
		}
		@Pc(33) int local33 = arg10;
		@Pc(36) long local36 = this.aLong232;
		@Pc(39) int[] local39 = this.anIntArray511;
		if (arg9 != null && (arg9.anInt3778 >= 0 || arg9.anInt3782 >= 0)) {
			local39 = new int[12];
			for (@Pc(52) int local52 = 0; local52 < 12; local52++) {
				local39[local52] = this.anIntArray511[local52];
			}
			if (arg9.anInt3778 >= 0) {
				if (arg9.anInt3778 == 65535) {
					local36 ^= 0xFFFFFFFF00000000L;
					local39[5] = 0;
				} else {
					local39[5] = arg9.anInt3778 | 0x40000000;
					local36 ^= (long) local39[5] << 32;
				}
			}
			if (arg9.anInt3782 >= 0) {
				if (arg9.anInt3782 == 65535) {
					local36 ^= 0xFFFFFFFFL;
					local39[3] = 0;
				} else {
					local39[3] = arg9.anInt3782 | 0x40000000;
					local36 ^= local39[3];
				}
			}
		}
		@Pc(138) boolean local138 = false;
		@Pc(140) boolean local140 = false;
		@Pc(142) boolean local142 = false;
		@Pc(150) boolean local150 = arg9 != null || arg11 != null;
		@Pc(157) int local157 = arg1 == null ? 0 : arg1.length;
		@Pc(191) int local191;
		@Pc(196) int local196;
		for (@Pc(159) int local159 = 0; local159 < local157; local159++) {
			Static182.aClass5_Sub2_Sub6Array3[local159] = null;
			if (arg1[local159] != null) {
				@Pc(177) Class143 local177 = arg2.method4752(arg1[local159].anInt4811);
				if (local177.anIntArray241 != null) {
					local150 = true;
					Static435.aClass143Array2[local159] = local177;
					local191 = arg1[local159].anInt4809;
					local196 = arg1[local159].anInt4806;
					@Pc(201) int local201 = local177.anIntArray241[local191];
					Static182.aClass5_Sub2_Sub6Array3[local159] = arg2.method4756(local201 >>> 16);
					@Pc(214) int local214 = local201 & 0xFFFF;
					Static67.anIntArray60[local159] = local214;
					if (Static182.aClass5_Sub2_Sub6Array3[local159] != null) {
						local140 |= Static182.aClass5_Sub2_Sub6Array3[local159].method2002(local214);
						local138 |= Static182.aClass5_Sub2_Sub6Array3[local159].method2000(local214);
						local142 |= Static182.aClass5_Sub2_Sub6Array3[local159].method1999(local214);
					}
					if ((local177.aBoolean245 || Static17.aBoolean33) && local196 != -1 && local196 < local177.anIntArray241.length) {
						Static196.anIntArray185[local159] = local177.anIntArray239[local191];
						Static36.anIntArray33[local159] = arg1[local159].anInt4808;
						@Pc(281) int local281 = local177.anIntArray241[local196];
						Static14.aClass5_Sub2_Sub6Array1[local159] = arg2.method4756(local281 >>> 16);
						@Pc(294) int local294 = local281 & 0xFFFF;
						Static349.anIntArray403[local159] = local294;
						if (Static14.aClass5_Sub2_Sub6Array1[local159] != null) {
							local140 |= Static14.aClass5_Sub2_Sub6Array1[local159].method2002(local294);
							local138 |= Static14.aClass5_Sub2_Sub6Array1[local159].method2000(local294);
							local142 |= Static14.aClass5_Sub2_Sub6Array1[local159].method1999(local294);
						}
					} else {
						Static196.anIntArray185[local159] = 0;
						Static36.anIntArray33[local159] = 0;
						Static14.aClass5_Sub2_Sub6Array1[local159] = null;
						Static349.anIntArray403[local159] = -1;
					}
				}
			}
		}
		@Pc(358) int local358 = -1;
		local191 = -1;
		local196 = 0;
		@Pc(364) Class5_Sub2_Sub6 local364 = null;
		@Pc(366) Class5_Sub2_Sub6 local366 = null;
		@Pc(368) int local368 = -1;
		@Pc(370) int local370 = -1;
		@Pc(372) int local372 = 0;
		@Pc(374) Class5_Sub2_Sub6 local374 = null;
		@Pc(376) Class5_Sub2_Sub6 local376 = null;
		if (local150) {
			local33 = arg10 | 0x20;
			@Pc(393) int local393;
			@Pc(456) int local456;
			if (arg9 != null) {
				local358 = arg9.anIntArray241[arg5];
				local393 = local358 >>> 16;
				local358 &= 0xFFFF;
				local364 = arg2.method4756(local393);
				if (local364 != null) {
					local140 |= local364.method2002(local358);
					local138 |= local364.method2000(local358);
					local142 |= local364.method1999(local358);
				}
				if ((arg9.aBoolean245 || Static17.aBoolean33) && arg8 != -1 && arg8 < arg9.anIntArray241.length) {
					local191 = arg9.anIntArray241[arg8];
					local196 = arg9.anIntArray239[arg5];
					local456 = local191 >>> 16;
					local191 &= 0xFFFF;
					local366 = local456 == local393 ? local364 : arg2.method4756(local456);
					if (local366 != null) {
						local140 |= local366.method2002(local191);
						local138 |= local366.method2000(local191);
						local142 |= local366.method1999(local191);
					}
				}
			}
			if (arg11 != null) {
				local368 = arg11.anIntArray241[arg12];
				local393 = local368 >>> 16;
				local368 &= 0xFFFF;
				local374 = arg2.method4756(local393);
				if (local374 != null) {
					local140 |= local374.method2002(local368);
					local138 |= local374.method2000(local368);
					local142 |= local374.method1999(local368);
				}
				if ((arg11.aBoolean245 || Static17.aBoolean33) && arg13 != -1 && arg13 < arg11.anIntArray241.length) {
					local372 = arg11.anIntArray239[arg12];
					local370 = arg11.anIntArray241[arg13];
					local456 = local370 >>> 16;
					local370 &= 0xFFFF;
					local376 = local456 == local393 ? local374 : arg2.method4756(local456);
					if (local376 != null) {
						local140 |= local376.method2002(local370);
						local138 |= local376.method2000(local370);
						local142 |= local376.method1999(local370);
					}
				}
			}
			if (local140) {
				local33 |= 0x80;
			}
			if (local138) {
				local33 |= 0x100;
			}
			if (local142) {
				local33 |= 0x400;
			}
		}
		@Pc(625) Class44 local625 = Static200.aClass44_32;
		@Pc(633) Class57 local633;
		synchronized (Static200.aClass44_32) {
			local633 = (Class57) Static200.aClass44_32.method1028(local36);
		}
		@Pc(641) Class133 local641 = null;
		if (this.anInt7462 != -1) {
			local641 = arg4.method3043(this.anInt7462);
		}
		@Pc(684) int local684;
		@Pc(690) int local690;
		if (local633 == null || arg7.method5860(local633.RA(), local33) != 0 || local641 != null && local641.anIntArrayArray25 != null && this.anIntArrayArray64 == null) {
			if (local633 != null) {
				local33 = arg7.method5879(local33, local633.RA());
			}
			@Pc(682) boolean local682 = false;
			local684 = 0;
			while (true) {
				if (local684 >= 12) {
					if (local682) {
						if (this.aLong233 != -1L) {
							@Pc(745) Class44 local745 = Static200.aClass44_32;
							synchronized (Static200.aClass44_32) {
								local633 = (Class57) Static200.aClass44_32.method1028(this.aLong233);
							}
						}
						if (local633 == null || arg7.method5860(local633.RA(), local33) != 0 || local641 != null && local641.anIntArrayArray25 != null && this.anIntArrayArray64 == null) {
							return null;
						}
					} else {
						@Pc(784) Class74[] local784 = new Class74[12];
						@Pc(792) int local792;
						for (@Pc(786) int local786 = 0; local786 < 12; local786++) {
							local792 = local39[local786];
							@Pc(809) Class74 local809;
							if ((local792 & 0x40000000) != 0) {
								local809 = arg0.method1452(local792 & 0x3FFFFFFF).method985(this.aBoolean503);
								if (local809 != null) {
									local784[local786] = local809;
								}
							} else if ((Integer.MIN_VALUE & local792) != 0) {
								local809 = arg6.method2534(local792 & 0x3FFFFFFF).method2690();
								if (local809 != null) {
									local784[local786] = local809;
								}
							}
						}
						@Pc(865) int local865;
						if (local641 != null && local641.anIntArrayArray25 != null) {
							for (local792 = 0; local792 < local641.anIntArrayArray25.length; local792++) {
								if (local641.anIntArrayArray25[local792] != null && local784[local792] != null) {
									local865 = local641.anIntArrayArray25[local792][0];
									@Pc(872) int local872 = local641.anIntArrayArray25[local792][1];
									@Pc(879) int local879 = local641.anIntArrayArray25[local792][2];
									@Pc(888) int local888 = local641.anIntArrayArray25[local792][3] << 3;
									@Pc(897) int local897 = local641.anIntArrayArray25[local792][4] << 3;
									@Pc(906) int local906 = local641.anIntArrayArray25[local792][5] << 3;
									if (this.anIntArrayArray64 == null) {
										this.anIntArrayArray64 = new int[local641.anIntArrayArray25.length][];
									}
									if (this.anIntArrayArray64[local792] == null) {
										@Pc(928) int[] local928 = this.anIntArrayArray64[local792] = new int[15];
										if (local888 == 0 && local897 == 0 && local906 == 0) {
											local928[14] = -local879;
											local928[12] = -local865;
											local928[0] = local928[4] = local928[8] = 32768;
											local928[13] = -local872;
										} else {
											@Pc(973) int local973 = Class30.anIntArray37[local888];
											@Pc(977) int local977 = Class30.anIntArray38[local888];
											@Pc(981) int local981 = Class30.anIntArray37[local897];
											@Pc(985) int local985 = Class30.anIntArray38[local897];
											@Pc(989) int local989 = Class30.anIntArray37[local906];
											@Pc(993) int local993 = Class30.anIntArray38[local906];
											@Pc(1001) int local1001 = local989 * local977 + 16384 >> 15;
											@Pc(1009) int local1009 = local993 * local977 + 16384 >> 15;
											local928[5] = -local977;
											local928[3] = local973 * local993 + 16384 >> 15;
											local928[6] = local981 * local1009 + local989 * -local985 + 16384 >> 15;
											local928[8] = local973 * local981 + 16384 >> 15;
											local928[2] = local973 * local985 + 16384 >> 15;
											local928[7] = -local993 * -local985 + local981 * local1001 + 16384 >> 15;
											local928[4] = local989 * local973 + 16384 >> 15;
											local928[1] = local981 * -local993 + local985 * local1001 + 16384 >> 15;
											local928[0] = local985 * local1009 + local989 * local981 + 16384 >> 15;
											local928[12] = local928[6] * -local879 + -local865 * local928[0] + local928[3] * -local872 + 16384 >> 15;
											local928[14] = -local879 * local928[8] + local928[2] * -local865 + -local872 * local928[5] + 16384 >> 15;
											local928[13] = local928[7] * -local879 + -local865 * local928[1] + -local872 * local928[4] + 16384 >> 15;
										}
										local928[10] = local872;
										local928[11] = local879;
										local928[9] = local865;
									}
									if (local888 != 0 || local897 != 0 || local906 != 0) {
										local784[local792].method1581(local888, local897, local906);
									}
									if (local865 != 0 || local872 != 0 || local879 != 0) {
										local784[local792].method1588(local879, local872, local865);
									}
								}
							}
						}
						@Pc(1264) int local1264 = local33 | 0x4000;
						@Pc(1271) Class74 local1271 = new Class74(local784, local784.length);
						local633 = arg7.method5882(local1271, local1264, Static228.anInt3789, 64, 850);
						for (local865 = 0; local865 < 5; local865++) {
							if (this.anIntArray510[local865] < Static227.aShortArrayArray9[local865].length) {
								local633.q(Static262.aShortArray72[local865], Static227.aShortArrayArray9[local865][this.anIntArray510[local865]]);
							}
							if (Static391.aShortArrayArray14[local865].length > this.anIntArray510[local865]) {
								local633.q(Static89.aShortArray6[local865], Static391.aShortArrayArray14[local865][this.anIntArray510[local865]]);
							}
						}
						local633.D(local33);
						@Pc(1344) Class44 local1344 = Static200.aClass44_32;
						synchronized (Static200.aClass44_32) {
							Static200.aClass44_32.method1017(local36, local633);
						}
						this.aLong233 = local36;
					}
					break;
				}
				local690 = local39[local684];
				if ((local690 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local690) != 0 && !arg6.method2534(local690 & 0x3FFFFFFF).method2692()) {
						local682 = true;
					}
				} else if (!arg0.method1452(local690 & 0x3FFFFFFF).method982(this.aBoolean503)) {
					local682 = true;
				}
				local684++;
			}
		}
		@Pc(1366) Class57 local1366 = local633.method6066((byte) 4, local33, true);
		if (!local150) {
			return local1366;
		}
		@Pc(1372) int local1372 = 0;
		local684 = 1;
		while (local1372 < local157) {
			if (Static182.aClass5_Sub2_Sub6Array3[local1372] != null) {
				local1366.method6058(Static36.anIntArray33[local1372] - 1, Static182.aClass5_Sub2_Sub6Array3[local1372], Static196.anIntArray185[local1372], Static67.anIntArray60[local1372], Static14.aClass5_Sub2_Sub6Array1[local1372], false, Static349.anIntArray403[local1372], local684, this.anIntArrayArray64 == null ? null : this.anIntArrayArray64[local1372]);
			}
			local684 <<= 0x1;
			local1372++;
		}
		if (local364 != null && local374 != null) {
			local1366.method6061(local358, local368, arg9.aBooleanArray13, arg3 - 1, local372, local374, false, arg15 - 1, local366, local196, local376, local370, local364, local191);
		} else if (local364 != null) {
			local1366.method6059(local366, false, local364, arg3 - 1, local196, local191, local358, 0);
		} else if (local374 != null) {
			local1366.method6059(local376, false, local374, arg15 - 1, local372, local370, local368, 0);
		}
		for (local690 = 0; local690 < local157; local690++) {
			Static182.aClass5_Sub2_Sub6Array3[local690] = null;
			Static14.aClass5_Sub2_Sub6Array1[local690] = null;
			Static435.aClass143Array2[local690] = null;
		}
		return local1366;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "([IIII[IZ)V")
	public void method5998(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) boolean arg4) {
		this.aBoolean503 = arg4;
		this.anIntArray510 = arg0;
		this.anIntArray511 = arg3;
		this.anInt7458 = arg2;
		if (this.anInt7462 != arg1) {
			this.anIntArrayArray64 = null;
			this.anInt7462 = arg1;
		}
		this.method5990();
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IILclient!iv;I)V")
	public void method5999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class120 arg2) {
		@Pc(7) int local7 = Static35.anIntArray329[arg0];
		if (this.anIntArray511[local7] != 0 && arg2.method2534(arg1) != null) {
			this.anIntArray511[local7] = arg1 | Integer.MIN_VALUE;
			this.method5990();
		}
	}
}
