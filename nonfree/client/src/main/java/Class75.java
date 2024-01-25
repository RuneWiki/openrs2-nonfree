import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class75 {

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "[I")
	public int[] anIntArray146;

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "[I")
	private int[] anIntArray147;

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "J")
	private long aLong58;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "J")
	private long aLong59;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "Z")
	public boolean aBoolean120;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
	private int anInt2169;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
	public int anInt2160 = -1;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IILclient!ya;IIILclient!m;Lclient!qm;Lclient!gu;Lclient!mq;Lclient!lc;Lclient!ac;)Lclient!t;")
	public Class163 method1841(@OriginalArg(1) int arg0, @OriginalArg(2) Class51 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) Class151 arg4, @OriginalArg(7) Class206 arg5, @OriginalArg(8) Class98 arg6, @OriginalArg(9) Class162 arg7, @OriginalArg(10) Class139 arg8, @OriginalArg(11) Interface1 arg9) {
		if (this.anInt2160 != -1) {
			return arg6.method2241(this.anInt2160).method5173(arg8, arg9, arg2, arg4, arg3, arg0, arg1);
		}
		@Pc(35) int local35 = 2048;
		@Pc(43) boolean local43;
		@Pc(58) int local58;
		@Pc(125) int local125;
		@Pc(66) int local66;
		if (arg8 != null) {
			@Pc(39) boolean local39 = false;
			@Pc(41) boolean local41 = false;
			local43 = false;
			@Pc(45) boolean local45 = false;
			local58 = arg8.anIntArray344[arg3];
			local35 = 2080;
			local66 = local58 >>> 16;
			@Pc(71) Class7_Sub4_Sub18 local71 = arg4.method3289(local66);
			@Pc(75) int local75 = local58 & 0xFFFF;
			if (local71 != null) {
				local41 = local71.method5663(local75) | false;
				local39 = local71.method5666(local75) | false;
				local45 = local71.method5665(local75) | false;
				local43 = arg8.aBoolean243 | false;
			}
			if ((arg8.aBoolean245 || Static262.aBoolean495) && arg0 != -1 && arg0 < arg8.anIntArray344.length) {
				local125 = arg8.anIntArray344[arg0];
				@Pc(129) int local129 = local125 >>> 16;
				@Pc(139) Class7_Sub4_Sub18 local139 = local129 == local66 ? local71 : arg4.method3289(local129);
				@Pc(143) int local143 = local125 & 0xFFFF;
				if (local139 != null) {
					local41 |= local139.method5663(local143);
					local39 |= local139.method5666(local143);
					local45 |= local139.method5665(local143);
				}
			}
			if (local41) {
				local35 = 2208;
			}
			if (local39) {
				local35 |= 0x100;
			}
			if (local43) {
				local35 |= 0x200;
			}
			if (local45) {
				local35 |= 0x400;
			}
		}
		@Pc(192) Class126 local192 = Static36.aClass126_4;
		@Pc(201) Class163 local201;
		synchronized (Static36.aClass126_4) {
			local201 = (Class163) Static36.aClass126_4.method2822(this.aLong59);
		}
		if (local201 == null || arg1.method5352(local201.P(), local35) != 0) {
			if (local201 != null) {
				local35 = arg1.method5323(local35, local201.P());
			}
			local43 = false;
			for (@Pc(232) int local232 = 0; local232 < 12; local232++) {
				local58 = this.anIntArray147[local232];
				if ((local58 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local58) != 0 && !arg7.method3430(local58 & 0x3FFFFFFF).method313()) {
						local43 = true;
					}
				} else if (!arg5.method4320(local58 & 0x3FFFFFFF).method771(this.aBoolean120)) {
					local43 = true;
				}
			}
			if (local43) {
				return null;
			}
			@Pc(289) Class117[] local289 = new Class117[12];
			local125 = 0;
			for (@Pc(293) int local293 = 0; local293 < 12; local293++) {
				@Pc(300) int local300 = this.anIntArray147[local293];
				@Pc(318) Class117 local318;
				if ((local300 & 0x40000000) != 0) {
					local318 = arg5.method4320(local300 & 0x3FFFFFFF).method759(this.aBoolean120);
					if (local318 != null) {
						local289[local125++] = local318;
					}
				} else if ((Integer.MIN_VALUE & local300) != 0) {
					local318 = arg7.method3430(local300 & 0x3FFFFFFF).method310();
					if (local318 != null) {
						local289[local125++] = local318;
					}
				}
			}
			@Pc(360) int local360 = local35 | 0x4000;
			@Pc(366) Class117 local366 = new Class117(local289, local125);
			local201 = arg1.method5346(local366, local360, Static89.anInt1838, 64, 768);
			for (local66 = 0; local66 < 5; local66++) {
				if (this.anIntArray146[local66] < Static407.aShortArrayArray7[local66].length) {
					local201.BA(Static45.aShortArray9[local66], Static407.aShortArrayArray7[local66][this.anIntArray146[local66]]);
				}
				if (Static291.aShortArrayArray3[local66].length > this.anIntArray146[local66]) {
					local201.BA(Static361.aShortArray98[local66], Static291.aShortArrayArray3[local66][this.anIntArray146[local66]]);
				}
			}
			local201.UA(local35);
			@Pc(433) Class126 local433 = Static36.aClass126_4;
			synchronized (Static36.aClass126_4) {
				Static36.aClass126_4.method2824(this.aLong59, local201);
			}
		}
		if (arg8 == null) {
			return local201;
		} else {
			local201.method4654((byte) 4, local35, true);
			return arg8.method3127(arg3, arg0, arg2, 2048, local201);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZ)V")
	public void method1842(@OriginalArg(1) boolean arg0) {
		this.aBoolean120 = arg0;
		this.method1846();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!m;Lclient!lc;IIILclient!ya;IIIILclient!mq;I)Lclient!t;")
	public Class163 method1843(@OriginalArg(0) Class151 arg0, @OriginalArg(1) Class139 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class51 arg5, @OriginalArg(6) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class162 arg8, @OriginalArg(11) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(98) int local98;
		if (arg1 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			local7 = 2080;
			@Pc(32) int local32 = arg1.anIntArray344[arg4];
			@Pc(38) int local38 = local32 >>> 16;
			@Pc(43) Class7_Sub4_Sub18 local43 = arg0.method3289(local38);
			@Pc(47) int local47 = local32 & 0xFFFF;
			if (local43 != null) {
				local13 = local43.method5663(local47) | false;
				local11 = local43.method5666(local47) | false;
				local17 = local43.method5665(local47) | false;
				local15 = arg1.aBoolean243 | false;
			}
			if ((arg1.aBoolean245 || Static262.aBoolean495) && arg2 != -1 && arg1.anIntArray344.length > arg2) {
				local98 = arg1.anIntArray344[arg2];
				@Pc(102) int local102 = local98 >>> 16;
				@Pc(106) int local106 = local98 & 0xFFFF;
				@Pc(111) Class7_Sub4_Sub18 local111;
				if (local38 == local102) {
					local111 = local43;
				} else {
					local111 = arg0.method3289(local106 >>> 16);
				}
				if (local111 != null) {
					local13 |= local111.method5663(local106);
					local11 |= local111.method5666(local106);
					local17 |= local111.method5665(local106);
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
		@Pc(188) long local188 = (long) (arg7 << 16) | (long) arg6 << 32 | (long) arg3;
		@Pc(190) Class126 local190 = Static36.aClass126_4;
		@Pc(198) Class163 local198;
		synchronized (Static36.aClass126_4) {
			local198 = (Class163) Static36.aClass126_4.method2822(local188);
		}
		if (local198 == null || arg5.method5352(local198.P(), local7) != 0) {
			if (local198 != null) {
				local7 = arg5.method5323(local7, local198.P());
			}
			@Pc(228) Class117[] local228 = new Class117[3];
			local98 = 0;
			if (!arg8.method3430(arg3).method313() || !arg8.method3430(arg7).method313() || !arg8.method3430(arg6).method313()) {
				return null;
			}
			@Pc(266) Class117 local266 = arg8.method3430(arg3).method310();
			if (local266 != null) {
				local98++;
				local228[0] = local266;
			}
			local266 = arg8.method3430(arg7).method310();
			if (local266 != null) {
				local228[local98++] = local266;
			}
			local266 = arg8.method3430(arg6).method310();
			if (local266 != null) {
				local228[local98++] = local266;
			}
			@Pc(309) int local309 = local7 | 0x4000;
			local266 = new Class117(local228, local98);
			local198 = arg5.method5346(local266, local309, Static89.anInt1838, 64, 768);
			for (@Pc(325) int local325 = 0; local325 < 5; local325++) {
				if (this.anIntArray146[local325] < Static407.aShortArrayArray7[local325].length) {
					local198.BA(Static45.aShortArray9[local325], Static407.aShortArrayArray7[local325][this.anIntArray146[local325]]);
				}
				if (Static291.aShortArrayArray3[local325].length > this.anIntArray146[local325]) {
					local198.BA(Static361.aShortArray98[local325], Static291.aShortArrayArray3[local325][this.anIntArray146[local325]]);
				}
			}
			local198.UA(local7);
			@Pc(390) Class126 local390 = Static36.aClass126_4;
			synchronized (Static36.aClass126_4) {
				Static36.aClass126_4.method2824(local188, local198);
			}
		}
		if (arg1 == null) {
			return local198;
		} else {
			local198 = local198.method4654((byte) 4, local7, true);
			return arg1.method3127(arg4, arg2, arg9, 2048, local198);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "([IBZII[I)V")
	public void method1845(@OriginalArg(0) int[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		this.anInt2160 = arg2;
		this.aBoolean120 = arg1;
		if (arg3 != this.anInt2169) {
			this.anIntArrayArray13 = null;
			this.anInt2169 = arg3;
		}
		this.anIntArray146 = arg0;
		this.anIntArray147 = arg4;
		this.method1846();
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
	private void method1846() {
		@Pc(7) long[] local7 = Class22_Sub6.aLongArray6;
		this.aLong59 = -1L;
		this.aLong59 = this.aLong59 >>> 8 ^ local7[(int) (((long) (this.anInt2169 >> 8) ^ this.aLong59) & 0xFFL)];
		this.aLong59 = this.aLong59 >>> 8 ^ local7[(int) ((this.aLong59 ^ (long) this.anInt2169) & 0xFFL)];
		for (@Pc(54) int local54 = 0; local54 < 12; local54++) {
			this.aLong59 = local7[(int) ((this.aLong59 ^ (long) (this.anIntArray147[local54] >> 24)) & 0xFFL)] ^ this.aLong59 >>> 8;
			this.aLong59 = local7[(int) ((this.aLong59 ^ (long) (this.anIntArray147[local54] >> 16)) & 0xFFL)] ^ this.aLong59 >>> 8;
			this.aLong59 = local7[(int) ((this.aLong59 ^ (long) (this.anIntArray147[local54] >> 8)) & 0xFFL)] ^ this.aLong59 >>> 8;
			this.aLong59 = this.aLong59 >>> 8 ^ local7[(int) ((this.aLong59 ^ (long) this.anIntArray147[local54]) & 0xFFL)];
		}
		for (@Pc(148) int local148 = 0; local148 < 5; local148++) {
			this.aLong59 = this.aLong59 >>> 8 ^ local7[(int) ((this.aLong59 ^ (long) this.anIntArray146[local148]) & 0xFFL)];
		}
		this.aLong59 = this.aLong59 >>> 8 ^ local7[(int) ((this.aLong59 ^ (long) (this.aBoolean120 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!mq;IBI)V")
	public void method1847(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = Static22.anIntArray440[arg1];
		if (this.anIntArray147[local7] != 0 && arg0.method3430(arg2) != null) {
			this.anIntArray147[local7] = Integer.MIN_VALUE | arg2;
			this.method1846();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIBILclient!gu;Lclient!qm;Lclient!ya;Lclient!mf;Lclient!m;Lclient!lc;Lclient!lc;[Lclient!en;IILclient!ac;ILclient!mq;Z)Lclient!t;")
	public Class163 method1849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class98 arg4, @OriginalArg(6) Class206 arg5, @OriginalArg(7) Class51 arg6, @OriginalArg(8) Class154 arg7, @OriginalArg(9) Class151 arg8, @OriginalArg(10) Class139 arg9, @OriginalArg(11) Class139 arg10, @OriginalArg(12) Class69[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) Interface1 arg14, @OriginalArg(16) int arg15, @OriginalArg(17) Class162 arg16) {
		if (this.anInt2160 != -1) {
			return arg4.method2241(this.anInt2160).method5176(arg7, arg12, arg2, arg0, arg3, arg1, arg13, arg8, arg6, arg11, arg14, arg9, arg10, arg15);
		}
		@Pc(33) int local33 = arg3;
		@Pc(36) long local36 = this.aLong59;
		@Pc(39) int[] local39 = this.anIntArray147;
		if (arg9 != null && (arg9.anInt3947 >= 0 || arg9.anInt3943 >= 0)) {
			local39 = new int[12];
			for (@Pc(55) int local55 = 0; local55 < 12; local55++) {
				local39[local55] = this.anIntArray147[local55];
			}
			if (arg9.anInt3947 >= 0) {
				if (arg9.anInt3947 == 65535) {
					local39[5] = 0;
					local36 ^= 0xFFFFFFFF00000000L;
				} else {
					local39[5] = arg9.anInt3947 | 0x40000000;
					local36 ^= (long) local39[5] << 32;
				}
			}
			if (arg9.anInt3943 >= 0) {
				if (arg9.anInt3943 == 65535) {
					local36 ^= 0xFFFFFFFFL;
					local39[3] = 0;
				} else {
					local39[3] = arg9.anInt3943 | 0x40000000;
					local36 ^= local39[3];
				}
			}
		}
		@Pc(139) boolean local139 = false;
		@Pc(141) boolean local141 = false;
		@Pc(143) boolean local143 = false;
		@Pc(151) boolean local151 = arg9 != null || arg10 != null;
		@Pc(158) int local158 = arg11 == null ? 0 : arg11.length;
		@Pc(192) int local192;
		@Pc(197) int local197;
		for (@Pc(160) int local160 = 0; local160 < local158; local160++) {
			Static99.aClass7_Sub4_Sub18Array1[local160] = null;
			if (arg11[local160] != null) {
				@Pc(178) Class139 local178 = arg8.method3293(arg11[local160].anInt1933);
				if (local178.anIntArray344 != null) {
					Static275.aClass139Array1[local160] = local178;
					local151 = true;
					local192 = arg11[local160].anInt1927;
					local197 = arg11[local160].anInt1929;
					@Pc(202) int local202 = local178.anIntArray344[local192];
					Static99.aClass7_Sub4_Sub18Array1[local160] = arg8.method3289(local202 >>> 16);
					@Pc(215) int local215 = local202 & 0xFFFF;
					Static433.anIntArray606[local160] = local215;
					if (Static99.aClass7_Sub4_Sub18Array1[local160] != null) {
						local141 |= Static99.aClass7_Sub4_Sub18Array1[local160].method5663(local215);
						local139 |= Static99.aClass7_Sub4_Sub18Array1[local160].method5666(local215);
						local143 |= Static99.aClass7_Sub4_Sub18Array1[local160].method5665(local215);
					}
					if ((local178.aBoolean245 || Static262.aBoolean495) && local197 != -1 && local197 < local178.anIntArray344.length) {
						Static166.anIntArray264[local160] = local178.anIntArray345[local192];
						Static327.anIntArray491[local160] = arg11[local160].anInt1928;
						@Pc(283) int local283 = local178.anIntArray344[local197];
						Static149.aClass7_Sub4_Sub18Array5[local160] = arg8.method3289(local283 >>> 16);
						@Pc(296) int local296 = local283 & 0xFFFF;
						Static141.anIntArray223[local160] = local296;
						if (Static149.aClass7_Sub4_Sub18Array5[local160] != null) {
							local141 |= Static149.aClass7_Sub4_Sub18Array5[local160].method5663(local296);
							local139 |= Static149.aClass7_Sub4_Sub18Array5[local160].method5666(local296);
							local143 |= Static149.aClass7_Sub4_Sub18Array5[local160].method5665(local296);
						}
					} else {
						Static166.anIntArray264[local160] = 0;
						Static327.anIntArray491[local160] = 0;
						Static149.aClass7_Sub4_Sub18Array5[local160] = null;
						Static141.anIntArray223[local160] = -1;
					}
				}
			}
		}
		@Pc(359) int local359 = -1;
		local192 = -1;
		local197 = 0;
		@Pc(365) Class7_Sub4_Sub18 local365 = null;
		@Pc(367) Class7_Sub4_Sub18 local367 = null;
		@Pc(369) int local369 = -1;
		@Pc(371) int local371 = -1;
		@Pc(373) int local373 = 0;
		@Pc(375) Class7_Sub4_Sub18 local375 = null;
		@Pc(385) Class7_Sub4_Sub18 local385 = null;
		if (local151) {
			local33 = arg3 | 0x20;
			@Pc(402) int local402;
			@Pc(466) int local466;
			if (arg9 != null) {
				local359 = arg9.anIntArray344[arg13];
				local402 = local359 >>> 16;
				local365 = arg8.method3289(local402);
				local359 &= 0xFFFF;
				if (local365 != null) {
					local141 |= local365.method5663(local359);
					local139 |= local365.method5666(local359);
					local143 |= local365.method5665(local359);
				}
				if ((arg9.aBoolean245 || Static262.aBoolean495) && arg2 != -1 && arg9.anIntArray344.length > arg2) {
					local197 = arg9.anIntArray345[arg13];
					local192 = arg9.anIntArray344[arg2];
					local466 = local192 >>> 16;
					local367 = local402 == local466 ? local365 : arg8.method3289(local466);
					local192 &= 0xFFFF;
					if (local367 != null) {
						local141 |= local367.method5663(local192);
						local139 |= local367.method5666(local192);
						local143 |= local367.method5665(local192);
					}
				}
			}
			if (arg10 != null) {
				local369 = arg10.anIntArray344[arg1];
				local402 = local369 >>> 16;
				local375 = arg8.method3289(local402);
				local369 &= 0xFFFF;
				if (local375 != null) {
					local141 |= local375.method5663(local369);
					local139 |= local375.method5666(local369);
					local143 |= local375.method5665(local369);
				}
				if ((arg10.aBoolean245 || Static262.aBoolean495) && arg12 != -1 && arg12 < arg10.anIntArray344.length) {
					local373 = arg10.anIntArray345[arg1];
					local371 = arg10.anIntArray344[arg12];
					local466 = local371 >>> 16;
					local385 = local402 == local466 ? local375 : arg8.method3289(local466);
					local371 &= 0xFFFF;
					if (local385 != null) {
						local141 |= local385.method5663(local371);
						local139 |= local385.method5666(local371);
						local143 |= local385.method5665(local371);
					}
				}
			}
			if (local141) {
				local33 |= 0x80;
			}
			if (local139) {
				local33 |= 0x100;
			}
			if (local143) {
				local33 |= 0x400;
			}
		}
		@Pc(639) Class126 local639 = Static281.aClass126_61;
		@Pc(647) Class163 local647;
		synchronized (Static281.aClass126_61) {
			local647 = (Class163) Static281.aClass126_61.method2822(local36);
		}
		@Pc(655) Class78 local655 = null;
		if (this.anInt2169 != -1) {
			local655 = arg7.method3341(this.anInt2169);
		}
		@Pc(695) int local695;
		@Pc(701) int local701;
		if (local647 == null || arg6.method5352(local647.P(), local33) != 0 || local655 != null && local655.anIntArrayArray15 != null && this.anIntArrayArray13 == null) {
			if (local647 != null) {
				local33 = arg6.method5323(local33, local647.P());
			}
			@Pc(693) boolean local693 = false;
			local695 = 0;
			while (true) {
				if (local695 >= 12) {
					if (local693) {
						if (this.aLong58 != -1L) {
							@Pc(1327) Class126 local1327 = Static281.aClass126_61;
							synchronized (Static281.aClass126_61) {
								local647 = (Class163) Static281.aClass126_61.method2822(this.aLong58);
							}
						}
						if (local647 == null || arg6.method5352(local647.P(), local33) != 0 || local655 != null && local655.anIntArrayArray15 != null && this.anIntArrayArray13 == null) {
							return null;
						}
					} else {
						@Pc(749) Class117[] local749 = new Class117[12];
						@Pc(757) int local757;
						for (@Pc(751) int local751 = 0; local751 < 12; local751++) {
							local757 = local39[local751];
							@Pc(774) Class117 local774;
							if ((local757 & 0x40000000) != 0) {
								local774 = arg5.method4320(local757 & 0x3FFFFFFF).method773(this.aBoolean120);
								if (local774 != null) {
									local749[local751] = local774;
								}
							} else if ((local757 & Integer.MIN_VALUE) != 0) {
								local774 = arg16.method3430(local757 & 0x3FFFFFFF).method309();
								if (local774 != null) {
									local749[local751] = local774;
								}
							}
						}
						@Pc(832) int local832;
						if (local655 != null && local655.anIntArrayArray15 != null) {
							for (local757 = 0; local757 < local655.anIntArrayArray15.length; local757++) {
								if (local655.anIntArrayArray15[local757] != null && local749[local757] != null) {
									local832 = local655.anIntArrayArray15[local757][0];
									@Pc(839) int local839 = local655.anIntArrayArray15[local757][1];
									@Pc(846) int local846 = local655.anIntArrayArray15[local757][2];
									@Pc(855) int local855 = local655.anIntArrayArray15[local757][3] << 3;
									@Pc(864) int local864 = local655.anIntArrayArray15[local757][4] << 3;
									@Pc(873) int local873 = local655.anIntArrayArray15[local757][5] << 3;
									if (this.anIntArrayArray13 == null) {
										this.anIntArrayArray13 = new int[local655.anIntArrayArray15.length][];
									}
									if (this.anIntArrayArray13[local757] == null) {
										@Pc(895) int[] local895 = this.anIntArrayArray13[local757] = new int[15];
										if (local855 == 0 && local864 == 0 && local873 == 0) {
											local895[0] = local895[4] = local895[8] = 32768;
											local895[14] = -local846;
											local895[13] = -local839;
											local895[12] = -local832;
										} else {
											@Pc(911) int local911 = Class22_Sub7.anIntArray410[local855];
											@Pc(915) int local915 = Class22_Sub7.anIntArray411[local855];
											@Pc(919) int local919 = Class22_Sub7.anIntArray410[local864];
											@Pc(923) int local923 = Class22_Sub7.anIntArray411[local864];
											@Pc(927) int local927 = Class22_Sub7.anIntArray410[local873];
											@Pc(931) int local931 = Class22_Sub7.anIntArray411[local873];
											@Pc(939) int local939 = local927 * local915 + 16384 >> 15;
											@Pc(947) int local947 = local915 * local931 + 16384 >> 15;
											local895[5] = -local915;
											local895[8] = local919 * local911 + 16384 >> 15;
											local895[2] = local911 * local923 + 16384 >> 15;
											local895[7] = -local931 * -local923 + local939 * local919 + 16384 >> 15;
											local895[6] = local947 * local919 + local927 * -local923 + 16384 >> 15;
											local895[0] = local919 * local927 + local923 * local947 + 16384 >> 15;
											local895[1] = -local931 * local919 + local939 * local923 + 16384 >> 15;
											local895[3] = local911 * local931 + 16384 >> 15;
											local895[4] = local911 * local927 + 16384 >> 15;
											local895[12] = -local846 * local895[6] + local895[0] * -local832 + -local839 * local895[3] + 16384 >> 15;
											local895[13] = local895[7] * -local846 + -local839 * local895[4] + -local832 * local895[1] + 16384 >> 15;
											local895[14] = -local839 * local895[5] + -local832 * local895[2] + local895[8] * -local846 + 16384 >> 15;
										}
										local895[11] = local846;
										local895[10] = local839;
										local895[9] = local832;
									}
									if (local855 != 0 || local864 != 0 || local873 != 0) {
										local749[local757].method2598(local864, local873, local855);
									}
									if (local832 != 0 || local839 != 0 || local846 != 0) {
										local749[local757].method2594(local839, local846, local832);
									}
								}
							}
						}
						@Pc(1222) int local1222 = local33 | 0x4000;
						@Pc(1229) Class117 local1229 = new Class117(local749, local749.length);
						local647 = arg6.method5346(local1229, local1222, Static89.anInt1838, 64, 850);
						for (local832 = 0; local832 < 5; local832++) {
							if (this.anIntArray146[local832] < Static407.aShortArrayArray7[local832].length) {
								local647.BA(Static45.aShortArray9[local832], Static407.aShortArrayArray7[local832][this.anIntArray146[local832]]);
							}
							if (Static291.aShortArrayArray3[local832].length > this.anIntArray146[local832]) {
								local647.BA(Static361.aShortArray98[local832], Static291.aShortArrayArray3[local832][this.anIntArray146[local832]]);
							}
						}
						local647.UA(local33);
						@Pc(1300) Class126 local1300 = Static281.aClass126_61;
						synchronized (Static281.aClass126_61) {
							Static281.aClass126_61.method2824(local36, local647);
						}
						this.aLong58 = local36;
					}
					break;
				}
				local701 = local39[local695];
				if ((local701 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local701) != 0 && !arg16.method3430(local701 & 0x3FFFFFFF).method314()) {
						local693 = true;
					}
				} else if (!arg5.method4320(local701 & 0x3FFFFFFF).method776(this.aBoolean120)) {
					local693 = true;
				}
				local695++;
			}
		}
		@Pc(1366) Class163 local1366 = local647.method4654((byte) 4, local33, true);
		if (!local151) {
			return local1366;
		}
		@Pc(1372) int local1372 = 0;
		local695 = 1;
		while (local1372 < local158) {
			if (Static99.aClass7_Sub4_Sub18Array1[local1372] != null) {
				local1366.method4659(false, Static149.aClass7_Sub4_Sub18Array5[local1372], Static327.anIntArray491[local1372] - 1, Static99.aClass7_Sub4_Sub18Array1[local1372], this.anIntArrayArray13 == null ? null : this.anIntArrayArray13[local1372], local695, Static141.anIntArray223[local1372], Static166.anIntArray264[local1372], Static433.anIntArray606[local1372]);
			}
			local695 <<= 0x1;
			local1372++;
		}
		if (local365 != null && local375 != null) {
			local1366.method4664(local365, local192, local373, arg15 - 1, local371, local367, false, local385, local375, arg0 - 1, arg9.aBooleanArray20, local369, local197, local359);
		} else if (local365 != null) {
			local1366.method4660(false, local365, 0, local367, arg15 - 1, local359, local192, local197);
		} else if (local375 != null) {
			local1366.method4660(false, local375, 0, local385, arg0 - 1, local369, local371, local373);
		}
		for (local701 = 0; local701 < local158; local701++) {
			Static99.aClass7_Sub4_Sub18Array1[local701] = null;
			Static149.aClass7_Sub4_Sub18Array5[local701] = null;
			Static275.aClass139Array1[local701] = null;
		}
		return local1366;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIB)V")
	public void method1850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray146[arg0] = arg1;
		this.method1846();
	}
}
