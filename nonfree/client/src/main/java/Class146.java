import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class146 {

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "Z")
	public boolean aBoolean316;

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "J")
	private long aLong112;

	@OriginalMember(owner = "client!jk", name = "i", descriptor = "J")
	private long aLong113;

	@OriginalMember(owner = "client!jk", name = "k", descriptor = "[I")
	private int[] anIntArray411;

	@OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
	private int anInt4087;

	@OriginalMember(owner = "client!jk", name = "t", descriptor = "[I")
	public int[] anIntArray412;

	@OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
	public int anInt4084 = -1;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)V")
	private void method3569() {
		@Pc(7) long[] local7 = Class215.aLongArray11;
		this.aLong112 = -1L;
		this.aLong112 = this.aLong112 >>> 8 ^ local7[(int) (((long) (this.anInt4087 >> 8) ^ this.aLong112) & 0xFFL)];
		this.aLong112 = local7[(int) ((this.aLong112 ^ (long) this.anInt4087) & 0xFFL)] ^ this.aLong112 >>> 8;
		for (@Pc(57) int local57 = 0; local57 < 12; local57++) {
			this.aLong112 = local7[(int) ((this.aLong112 ^ (long) (this.anIntArray411[local57] >> 24)) & 0xFFL)] ^ this.aLong112 >>> 8;
			this.aLong112 = this.aLong112 >>> 8 ^ local7[(int) ((this.aLong112 ^ (long) (this.anIntArray411[local57] >> 16)) & 0xFFL)];
			this.aLong112 = local7[(int) ((this.aLong112 ^ (long) (this.anIntArray411[local57] >> 8)) & 0xFFL)] ^ this.aLong112 >>> 8;
			this.aLong112 = local7[(int) (((long) this.anIntArray411[local57] ^ this.aLong112) & 0xFFL)] ^ this.aLong112 >>> 8;
		}
		for (@Pc(151) int local151 = 0; local151 < 5; local151++) {
			this.aLong112 = this.aLong112 >>> 8 ^ local7[(int) (((long) this.anIntArray412[local151] ^ this.aLong112) & 0xFFL)];
		}
		this.aLong112 = this.aLong112 >>> 8 ^ local7[(int) (((long) (this.aBoolean316 ? 1 : 0) ^ this.aLong112) & 0xFFL)];
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIILclient!ib;Lclient!aba;Lclient!qa;IILclient!kca;I)Lclient!r;")
	public Class63 method3570(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class125 arg3, @OriginalArg(6) Class4 arg4, @OriginalArg(7) Class39 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class157 arg8, @OriginalArg(11) int arg9) {
		@Pc(15) int local15 = 2048;
		@Pc(101) int local101;
		if (arg4 != null) {
			@Pc(19) boolean local19 = false;
			@Pc(21) boolean local21 = false;
			@Pc(23) boolean local23 = false;
			@Pc(25) boolean local25 = false;
			local15 = 2080;
			@Pc(42) int local42 = arg4.anIntArray11[arg0];
			@Pc(46) int local46 = local42 >>> 16;
			@Pc(50) int local50 = local42 & 0xFFFF;
			@Pc(55) Class2_Sub13_Sub18 local55 = arg8.method3747(local46);
			if (local55 != null) {
				local21 = local55.method7536(local50) | false;
				local19 = local55.method7534(local50) | false;
				local25 = local55.method7533(local50) | false;
				local23 = arg4.aBoolean10 | false;
			}
			if ((arg4.aBoolean9 || Static112.aBoolean204) && arg6 != -1 && arg6 < arg4.anIntArray11.length) {
				local101 = arg4.anIntArray11[arg6];
				@Pc(105) int local105 = local101 >>> 16;
				@Pc(109) int local109 = local101 & 0xFFFF;
				@Pc(118) Class2_Sub13_Sub18 local118;
				if (local105 == local46) {
					local118 = local55;
				} else {
					local118 = arg8.method3747(local109 >>> 16);
				}
				if (local118 != null) {
					local21 |= local118.method7536(local109);
					local19 |= local118.method7534(local109);
					local25 |= local118.method7533(local109);
				}
			}
			if (local21) {
				local15 = 2208;
			}
			if (local19) {
				local15 |= 0x100;
			}
			if (local23) {
				local15 |= 0x200;
			}
			if (local25) {
				local15 |= 0x400;
			}
		}
		@Pc(186) long local186 = (long) arg1 | (long) (arg9 << 16) | (long) arg7 << 32;
		@Pc(188) Class231 local188 = Static8.aClass231_2;
		@Pc(196) Class63 local196;
		synchronized (Static8.aClass231_2) {
			local196 = (Class63) Static8.aClass231_2.method6228(local186);
		}
		if (local196 == null || arg5.method6070(local196.ba(), local15) != 0) {
			if (local196 != null) {
				local15 = arg5.method6028(local15, local196.ba());
			}
			@Pc(223) Class29[] local223 = new Class29[3];
			local101 = 0;
			if (!arg3.method3173(arg1).method7330() || !arg3.method3173(arg9).method7330() || !arg3.method3173(arg7).method7330()) {
				return null;
			}
			@Pc(253) Class29 local253 = arg3.method3173(arg1).method7326();
			if (local253 != null) {
				local101++;
				local223[0] = local253;
			}
			local253 = arg3.method3173(arg9).method7326();
			if (local253 != null) {
				local223[local101++] = local253;
			}
			local253 = arg3.method3173(arg7).method7326();
			if (local253 != null) {
				local223[local101++] = local253;
			}
			local253 = new Class29(local223, local101);
			@Pc(298) int local298 = local15 | 0x4000;
			local196 = arg5.method6011(local253, local298, Static144.anInt2659, 64, 768);
			for (@Pc(308) int local308 = 0; local308 < 5; local308++) {
				if (this.anIntArray412[local308] < Static225.aShortArrayArray4[local308].length) {
					local196.pa(Static16.aShortArray17[local308], Static225.aShortArrayArray4[local308][this.anIntArray412[local308]]);
				}
				if (Static243.aShortArrayArray5[local308].length > this.anIntArray412[local308]) {
					local196.pa(Static5.aShortArray2[local308], Static243.aShortArrayArray5[local308][this.anIntArray412[local308]]);
				}
			}
			local196.m(local15);
			@Pc(363) Class231 local363 = Static8.aClass231_2;
			synchronized (Static8.aClass231_2) {
				Static8.aClass231_2.method6232(local196, local186);
			}
		}
		if (arg4 == null) {
			return local196;
		} else {
			local196 = local196.method7706((byte) 4, local15, true);
			return arg4.method271(2048, arg6, arg2, arg0, local196);
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!ib;BII)V")
	public void method3571(@OriginalArg(0) Class125 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = Static118.anIntArray307[arg1];
		if (this.anIntArray411[local13] != 0 && arg0.method3173(arg2) != null) {
			this.anIntArray411[local13] = Integer.MIN_VALUE | arg2;
			this.method3569();
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!rv;Lclient!bc;ILclient!hf;Lclient!qa;IIILclient!ib;Lclient!aba;ILclient!kca;)Lclient!r;")
	public Class63 method3573(@OriginalArg(0) Class255 arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(3) Class115 arg2, @OriginalArg(4) Class39 arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class125 arg6, @OriginalArg(9) Class4 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class157 arg9) {
		if (this.anInt4084 != -1) {
			return arg0.method6583(this.anInt4084).method456(arg5, arg7, arg4, arg9, arg8, arg3, arg1);
		}
		@Pc(35) int local35 = 2048;
		@Pc(43) boolean local43;
		@Pc(60) int local60;
		@Pc(121) int local121;
		@Pc(66) int local66;
		if (arg7 != null) {
			@Pc(39) boolean local39 = false;
			@Pc(41) boolean local41 = false;
			local43 = false;
			@Pc(45) boolean local45 = false;
			local35 = 2080;
			local60 = arg7.anIntArray11[arg5];
			local66 = local60 >>> 16;
			@Pc(71) Class2_Sub13_Sub18 local71 = arg9.method3747(local66);
			@Pc(75) int local75 = local60 & 0xFFFF;
			if (local71 != null) {
				local41 = local71.method7536(local75) | false;
				local39 = local71.method7534(local75) | false;
				local45 = local71.method7533(local75) | false;
				local43 = arg7.aBoolean10 | false;
			}
			if ((arg7.aBoolean9 || Static112.aBoolean204) && arg4 != -1 && arg4 < arg7.anIntArray11.length) {
				local121 = arg7.anIntArray11[arg4];
				@Pc(125) int local125 = local121 >>> 16;
				@Pc(129) int local129 = local121 & 0xFFFF;
				@Pc(139) Class2_Sub13_Sub18 local139 = local66 == local125 ? local71 : arg9.method3747(local125);
				if (local139 != null) {
					local41 |= local139.method7536(local129);
					local39 |= local139.method7534(local129);
					local45 |= local139.method7533(local129);
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
		@Pc(188) Class231 local188 = Static8.aClass231_2;
		@Pc(197) Class63 local197;
		synchronized (Static8.aClass231_2) {
			local197 = (Class63) Static8.aClass231_2.method6228(this.aLong112);
		}
		if (local197 == null || arg3.method6070(local197.ba(), local35) != 0) {
			if (local197 != null) {
				local35 = arg3.method6028(local35, local197.ba());
			}
			local43 = false;
			for (@Pc(225) int local225 = 0; local225 < 12; local225++) {
				local60 = this.anIntArray411[local225];
				if ((local60 & 0x40000000) == 0) {
					if ((local60 & Integer.MIN_VALUE) != 0 && !arg6.method3173(local60 & 0x3FFFFFFF).method7330()) {
						local43 = true;
					}
				} else if (!arg2.method2970(local60 & 0x3FFFFFFF).method7482(this.aBoolean316)) {
					local43 = true;
				}
			}
			if (local43) {
				return null;
			}
			@Pc(282) Class29[] local282 = new Class29[12];
			local121 = 0;
			for (@Pc(286) int local286 = 0; local286 < 12; local286++) {
				@Pc(293) int local293 = this.anIntArray411[local286];
				@Pc(313) Class29 local313;
				if ((local293 & 0x40000000) != 0) {
					local313 = arg2.method2970(local293 & 0x3FFFFFFF).method7476(this.aBoolean316);
					if (local313 != null) {
						local282[local121++] = local313;
					}
				} else if ((local293 & Integer.MIN_VALUE) != 0) {
					local313 = arg6.method3173(local293 & 0x3FFFFFFF).method7326();
					if (local313 != null) {
						local282[local121++] = local313;
					}
				}
			}
			@Pc(350) int local350 = local35 | 0x4000;
			@Pc(356) Class29 local356 = new Class29(local282, local121);
			local197 = arg3.method6011(local356, local350, Static144.anInt2659, 64, 768);
			for (local66 = 0; local66 < 5; local66++) {
				if (this.anIntArray412[local66] < Static225.aShortArrayArray4[local66].length) {
					local197.pa(Static16.aShortArray17[local66], Static225.aShortArrayArray4[local66][this.anIntArray412[local66]]);
				}
				if (this.anIntArray412[local66] < Static243.aShortArrayArray5[local66].length) {
					local197.pa(Static5.aShortArray2[local66], Static243.aShortArrayArray5[local66][this.anIntArray412[local66]]);
				}
			}
			local197.m(local35);
			@Pc(427) Class231 local427 = Static8.aClass231_2;
			synchronized (Static8.aClass231_2) {
				Static8.aClass231_2.method6232(local197, this.aLong112);
			}
		}
		if (arg7 == null) {
			return local197;
		} else {
			local197.method7706((byte) 4, local35, true);
			return arg7.method271(2048, arg4, arg8, arg5, local197);
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZZ)V")
	public void method3574(@OriginalArg(0) boolean arg0) {
		this.aBoolean316 = arg0;
		this.method3569();
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IBZ[I[II)V")
	public void method3575(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		this.anIntArray411 = arg2;
		this.anIntArray412 = arg3;
		this.anInt4084 = arg0;
		if (this.anInt4087 != arg4) {
			this.anInt4087 = arg4;
			this.anIntArrayArray46 = null;
		}
		this.aBoolean316 = arg1;
		this.method3569();
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)V")
	public void method3576(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray412[arg1] = arg0;
		this.method3569();
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I[Lclient!js;ILclient!aba;ILclient!kca;Lclient!bc;Lclient!hf;ILclient!ow;ZLclient!ib;ZLclient!aba;ILclient!qa;IILclient!rv;)Lclient!r;")
	public Class63 method3577(@OriginalArg(0) int arg0, @OriginalArg(1) Class149[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class157 arg5, @OriginalArg(6) Interface2 arg6, @OriginalArg(7) Class115 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class218 arg9, @OriginalArg(11) Class125 arg10, @OriginalArg(13) Class4 arg11, @OriginalArg(14) int arg12, @OriginalArg(15) Class39 arg13, @OriginalArg(16) int arg14, @OriginalArg(17) int arg15, @OriginalArg(18) Class255 arg16) {
		if (this.anInt4084 != -1) {
			return arg16.method6583(this.anInt4084).method458(arg4, arg0, arg2, arg13, arg11, arg5, arg12, arg6, arg1, arg3, arg9, arg8, arg14, arg15);
		}
		@Pc(33) int local33 = arg14;
		@Pc(36) long local36 = this.aLong112;
		@Pc(39) int[] local39 = this.anIntArray411;
		if (arg3 != null && (arg3.anInt118 >= 0 || arg3.anInt119 >= 0)) {
			local39 = new int[12];
			for (@Pc(55) int local55 = 0; local55 < 12; local55++) {
				local39[local55] = this.anIntArray411[local55];
			}
			if (arg3.anInt118 >= 0) {
				if (arg3.anInt118 == 65535) {
					local36 ^= 0xFFFFFFFF00000000L;
					local39[5] = 0;
				} else {
					local39[5] = arg3.anInt118 | 0x40000000;
					local36 ^= (long) local39[5] << 32;
				}
			}
			if (arg3.anInt119 >= 0) {
				if (arg3.anInt119 == 65535) {
					local39[3] = 0;
					local36 ^= 0xFFFFFFFFL;
				} else {
					local39[3] = arg3.anInt119 | 0x40000000;
					local36 ^= local39[3];
				}
			}
		}
		@Pc(134) boolean local134 = false;
		@Pc(136) boolean local136 = false;
		@Pc(138) boolean local138 = false;
		@Pc(146) boolean local146 = arg3 != null || arg11 != null;
		@Pc(153) int local153 = arg1 == null ? 0 : arg1.length;
		@Pc(187) int local187;
		@Pc(192) int local192;
		for (@Pc(155) int local155 = 0; local155 < local153; local155++) {
			Static394.aClass2_Sub13_Sub18Array4[local155] = null;
			if (arg1[local155] != null) {
				@Pc(173) Class4 local173 = arg5.method3745(arg1[local155].anInt4196);
				if (local173.anIntArray11 != null) {
					Static276.aClass4Array4[local155] = local173;
					local146 = true;
					local187 = arg1[local155].anInt4200;
					local192 = arg1[local155].anInt4192;
					@Pc(197) int local197 = local173.anIntArray11[local187];
					Static394.aClass2_Sub13_Sub18Array4[local155] = arg5.method3747(local197 >>> 16);
					@Pc(210) int local210 = local197 & 0xFFFF;
					Static150.anIntArray338[local155] = local210;
					if (Static394.aClass2_Sub13_Sub18Array4[local155] != null) {
						local136 |= Static394.aClass2_Sub13_Sub18Array4[local155].method7536(local210);
						local134 |= Static394.aClass2_Sub13_Sub18Array4[local155].method7534(local210);
						local138 |= Static394.aClass2_Sub13_Sub18Array4[local155].method7533(local210);
					}
					if ((local173.aBoolean9 || Static112.aBoolean204) && local192 != -1 && local192 < local173.anIntArray11.length) {
						Static419.anIntArray599[local155] = local173.anIntArray12[local187];
						Static245.anIntArray423[local155] = arg1[local155].anInt4197;
						@Pc(300) int local300 = local173.anIntArray11[local192];
						Static354.aClass2_Sub13_Sub18Array3[local155] = arg5.method3747(local300 >>> 16);
						@Pc(313) int local313 = local300 & 0xFFFF;
						Static2.anIntArray8[local155] = local313;
						if (Static354.aClass2_Sub13_Sub18Array3[local155] != null) {
							local136 |= Static354.aClass2_Sub13_Sub18Array3[local155].method7536(local313);
							local134 |= Static354.aClass2_Sub13_Sub18Array3[local155].method7534(local313);
							local138 |= Static354.aClass2_Sub13_Sub18Array3[local155].method7533(local313);
						}
					} else {
						Static419.anIntArray599[local155] = 0;
						Static245.anIntArray423[local155] = 0;
						Static354.aClass2_Sub13_Sub18Array3[local155] = null;
						Static2.anIntArray8[local155] = -1;
					}
				}
			}
		}
		@Pc(354) int local354 = -1;
		local187 = -1;
		local192 = 0;
		@Pc(360) Class2_Sub13_Sub18 local360 = null;
		@Pc(362) Class2_Sub13_Sub18 local362 = null;
		@Pc(364) int local364 = -1;
		@Pc(366) int local366 = -1;
		@Pc(368) int local368 = 0;
		@Pc(370) Class2_Sub13_Sub18 local370 = null;
		@Pc(372) Class2_Sub13_Sub18 local372 = null;
		if (local146) {
			local33 = arg14 | 0x20;
			@Pc(389) int local389;
			@Pc(453) int local453;
			if (arg3 != null) {
				local354 = arg3.anIntArray11[arg12];
				local389 = local354 >>> 16;
				local360 = arg5.method3747(local389);
				local354 &= 0xFFFF;
				if (local360 != null) {
					local136 |= local360.method7536(local354);
					local134 |= local360.method7534(local354);
					local138 |= local360.method7533(local354);
				}
				if ((arg3.aBoolean9 || Static112.aBoolean204) && arg2 != -1 && arg3.anIntArray11.length > arg2) {
					local187 = arg3.anIntArray11[arg2];
					local192 = arg3.anIntArray12[arg12];
					local453 = local187 >>> 16;
					local187 &= 0xFFFF;
					local362 = local389 == local453 ? local360 : arg5.method3747(local453);
					if (local362 != null) {
						local136 |= local362.method7536(local187);
						local134 |= local362.method7534(local187);
						local138 |= local362.method7533(local187);
					}
				}
			}
			if (arg11 != null) {
				local364 = arg11.anIntArray11[arg8];
				local389 = local364 >>> 16;
				local370 = arg5.method3747(local389);
				local364 &= 0xFFFF;
				if (local370 != null) {
					local136 |= local370.method7536(local364);
					local134 |= local370.method7534(local364);
					local138 |= local370.method7533(local364);
				}
				if ((arg11.aBoolean9 || Static112.aBoolean204) && arg4 != -1 && arg4 < arg11.anIntArray11.length) {
					local368 = arg11.anIntArray12[arg8];
					local366 = arg11.anIntArray11[arg4];
					local453 = local366 >>> 16;
					local366 &= 0xFFFF;
					local372 = local453 == local389 ? local370 : arg5.method3747(local453);
					if (local372 != null) {
						local136 |= local372.method7536(local366);
						local134 |= local372.method7534(local366);
						local138 |= local372.method7533(local366);
					}
				}
			}
			if (local136) {
				local33 |= 0x80;
			}
			if (local134) {
				local33 |= 0x100;
			}
			if (local138) {
				local33 |= 0x400;
			}
		}
		@Pc(621) Class231 local621 = Static421.aClass231_60;
		@Pc(629) Class63 local629;
		synchronized (Static421.aClass231_60) {
			local629 = (Class63) Static421.aClass231_60.method6228(local36);
		}
		@Pc(637) Class24 local637 = null;
		if (this.anInt4087 != -1) {
			local637 = arg9.method5796(this.anInt4087);
		}
		@Pc(677) int local677;
		@Pc(683) int local683;
		if (local629 == null || arg13.method6070(local629.ba(), local33) != 0 || local637 != null && local637.anIntArrayArray4 != null && this.anIntArrayArray46 == null) {
			if (local629 != null) {
				local33 = arg13.method6028(local33, local629.ba());
			}
			@Pc(675) boolean local675 = false;
			local677 = 0;
			while (true) {
				if (local677 >= 12) {
					if (local675) {
						if (this.aLong113 != -1L) {
							@Pc(740) Class231 local740 = Static421.aClass231_60;
							synchronized (Static421.aClass231_60) {
								local629 = (Class63) Static421.aClass231_60.method6228(this.aLong113);
							}
						}
						if (local629 == null || arg13.method6070(local629.ba(), local33) != 0 || local637 != null && local637.anIntArrayArray4 != null && this.anIntArrayArray46 == null) {
							return null;
						}
					} else {
						@Pc(779) Class29[] local779 = new Class29[12];
						@Pc(787) int local787;
						for (@Pc(781) int local781 = 0; local781 < 12; local781++) {
							local787 = local39[local781];
							@Pc(802) Class29 local802;
							if ((local787 & 0x40000000) != 0) {
								local802 = arg7.method2970(local787 & 0x3FFFFFFF).method7481(this.aBoolean316);
								if (local802 != null) {
									local779[local781] = local802;
								}
							} else if ((Integer.MIN_VALUE & local787) != 0) {
								local802 = arg10.method3173(local787 & 0x3FFFFFFF).method7328();
								if (local802 != null) {
									local779[local781] = local802;
								}
							}
						}
						@Pc(862) int local862;
						if (local637 != null && local637.anIntArrayArray4 != null) {
							for (local787 = 0; local787 < local637.anIntArrayArray4.length; local787++) {
								if (local637.anIntArrayArray4[local787] != null && local779[local787] != null) {
									local862 = local637.anIntArrayArray4[local787][0];
									@Pc(869) int local869 = local637.anIntArrayArray4[local787][1];
									@Pc(876) int local876 = local637.anIntArrayArray4[local787][2];
									@Pc(885) int local885 = local637.anIntArrayArray4[local787][3] << 3;
									@Pc(894) int local894 = local637.anIntArrayArray4[local787][4] << 3;
									@Pc(903) int local903 = local637.anIntArrayArray4[local787][5] << 3;
									if (this.anIntArrayArray46 == null) {
										this.anIntArrayArray46 = new int[local637.anIntArrayArray4.length][];
									}
									if (this.anIntArrayArray46[local787] == null) {
										@Pc(925) int[] local925 = this.anIntArrayArray46[local787] = new int[15];
										if (local885 == 0 && local894 == 0 && local903 == 0) {
											local925[13] = -local869;
											local925[12] = -local862;
											local925[0] = local925[4] = local925[8] = 32768;
											local925[14] = -local876;
										} else {
											@Pc(970) int local970 = Class125.anIntArray382[local885];
											@Pc(974) int local974 = Class125.anIntArray381[local885];
											@Pc(978) int local978 = Class125.anIntArray382[local894];
											@Pc(982) int local982 = Class125.anIntArray381[local894];
											@Pc(986) int local986 = Class125.anIntArray382[local903];
											@Pc(990) int local990 = Class125.anIntArray381[local903];
											@Pc(998) int local998 = local974 * local986 + 16384 >> 15;
											@Pc(1006) int local1006 = local990 * local974 + 16384 >> 15;
											local925[1] = local998 * local982 + local978 * -local990 + 16384 >> 15;
											local925[4] = local970 * local986 + 16384 >> 15;
											local925[7] = -local982 * -local990 + local978 * local998 + 16384 >> 15;
											local925[8] = local978 * local970 + 16384 >> 15;
											local925[5] = -local974;
											local925[2] = local982 * local970 + 16384 >> 15;
											local925[3] = local970 * local990 + 16384 >> 15;
											local925[6] = local1006 * local978 + local986 * -local982 + 16384 >> 15;
											local925[0] = local1006 * local982 + local978 * local986 + 16384 >> 15;
											local925[12] = -local876 * local925[6] + local925[3] * -local869 + -local862 * local925[0] + 16384 >> 15;
											local925[14] = -local862 * local925[2] + local925[5] * -local869 + -local876 * local925[8] + 16384 >> 15;
											local925[13] = local925[1] * -local862 + -local869 * local925[4] + local925[7] * -local876 + 16384 >> 15;
										}
										local925[9] = local862;
										local925[11] = local876;
										local925[10] = local869;
									}
									if (local885 != 0 || local894 != 0 || local903 != 0) {
										local779[local787].method863(local885, local903, local894);
									}
									if (local862 != 0 || local869 != 0 || local876 != 0) {
										local779[local787].method858(local876, local869, local862);
									}
								}
							}
						}
						@Pc(1255) int local1255 = local33 | 0x4000;
						@Pc(1262) Class29 local1262 = new Class29(local779, local779.length);
						local629 = arg13.method6011(local1262, local1255, Static144.anInt2659, 64, 850);
						for (local862 = 0; local862 < 5; local862++) {
							if (this.anIntArray412[local862] < Static225.aShortArrayArray4[local862].length) {
								local629.pa(Static16.aShortArray17[local862], Static225.aShortArrayArray4[local862][this.anIntArray412[local862]]);
							}
							if (Static243.aShortArrayArray5[local862].length > this.anIntArray412[local862]) {
								local629.pa(Static5.aShortArray2[local862], Static243.aShortArrayArray5[local862][this.anIntArray412[local862]]);
							}
						}
						local629.m(local33);
						@Pc(1335) Class231 local1335 = Static421.aClass231_60;
						synchronized (Static421.aClass231_60) {
							Static421.aClass231_60.method6232(local629, local36);
						}
						this.aLong113 = local36;
					}
					break;
				}
				local683 = local39[local677];
				if ((local683 & 0x40000000) == 0) {
					if ((local683 & Integer.MIN_VALUE) != 0 && !arg10.method3173(local683 & 0x3FFFFFFF).method7329()) {
						local675 = true;
					}
				} else if (!arg7.method2970(local683 & 0x3FFFFFFF).method7468(this.aBoolean316)) {
					local675 = true;
				}
				local677++;
			}
		}
		@Pc(1361) Class63 local1361 = local629.method7706((byte) 4, local33, true);
		if (!local146) {
			return local1361;
		}
		@Pc(1367) int local1367 = 0;
		local677 = 1;
		while (local1367 < local153) {
			if (Static394.aClass2_Sub13_Sub18Array4[local1367] != null) {
				local1361.method7699(Static150.anIntArray338[local1367], this.anIntArrayArray46 == null ? null : this.anIntArrayArray46[local1367], Static419.anIntArray599[local1367], Static354.aClass2_Sub13_Sub18Array3[local1367], false, local677, Static2.anIntArray8[local1367], Static394.aClass2_Sub13_Sub18Array4[local1367], Static245.anIntArray423[local1367] - 1);
			}
			local677 <<= 0x1;
			local1367++;
		}
		if (local360 != null && local370 != null) {
			local1361.method7692(local372, local366, local192, local364, local370, arg3.aBooleanArray1, false, local362, local368, local187, arg15 - 1, arg0 + -1, local360, local354);
		} else if (local360 != null) {
			local1361.method7698(local360, false, local354, 0, local362, local192, arg15 - 1, local187);
		} else if (local370 != null) {
			local1361.method7698(local370, false, local364, 0, local372, local368, arg0 - 1, local366);
		}
		for (local683 = 0; local683 < local153; local683++) {
			Static394.aClass2_Sub13_Sub18Array4[local683] = null;
			Static354.aClass2_Sub13_Sub18Array3[local683] = null;
			Static276.aClass4Array4[local683] = null;
		}
		return local1361;
	}
}
