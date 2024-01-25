import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class283 {

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "[I")
	private int[] anIntArray456;

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "J")
	private long aLong186;

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "Z")
	public boolean aBoolean580;

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "J")
	private long aLong187;

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
	private int anInt7639;

	@OriginalMember(owner = "client!qi", name = "n", descriptor = "[I")
	public int[] anIntArray457;

	@OriginalMember(owner = "client!qi", name = "w", descriptor = "I")
	public int anInt7646 = -1;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIILclient!nu;IILclient!ks;Lclient!r;BILclient!tq;)Lclient!da;")
	public Class52 method6089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class245 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class197 arg6, @OriginalArg(8) Class78 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class323 arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(97) int local97;
		@Pc(38) int local38;
		if (arg6 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			local7 = 2080;
			@Pc(34) int local34 = arg6.anIntArray284[arg8];
			local38 = local34 >>> 16;
			@Pc(42) int local42 = local34 & 0xFFFF;
			@Pc(47) Class1_Sub8_Sub18 local47 = arg4.method5307(local38);
			if (local47 != null) {
				local13 = local47.method7355(local42) | false;
				local11 = local47.method7356(local42) | false;
				local17 = local47.method7359(local42) | false;
				local15 = arg6.aBoolean385 | false;
			}
			if ((arg6.aBoolean384 || Static503.aBoolean658) && arg3 != -1 && arg6.anIntArray284.length > arg3) {
				local97 = arg6.anIntArray284[arg3];
				@Pc(101) int local101 = local97 >>> 16;
				@Pc(105) int local105 = local97 & 0xFFFF;
				@Pc(115) Class1_Sub8_Sub18 local115;
				if (local101 == local38) {
					local115 = local47;
				} else {
					local115 = arg4.method5307(local105 >>> 16);
				}
				if (local115 != null) {
					local13 |= local115.method7355(local105);
					local11 |= local115.method7356(local105);
					local17 |= local115.method7359(local105);
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
		@Pc(194) long local194 = (long) arg2 | (long) arg0 << 32 | (long) (arg5 << 16);
		@Pc(196) Class207 local196 = Static275.aClass207_25;
		@Pc(204) Class52 local204;
		synchronized (Static275.aClass207_25) {
			local204 = (Class52) Static275.aClass207_25.method4390(local194);
		}
		if (local204 == null || arg7.method6819(local204.PA(), local7) != 0) {
			if (local204 != null) {
				local7 = arg7.method6782(local7, local204.PA());
			}
			@Pc(234) Class231[] local234 = new Class231[3];
			local97 = 0;
			if (!arg9.method7153(arg2).method7169() || !arg9.method7153(arg5).method7169() || !arg9.method7153(arg0).method7169()) {
				return null;
			}
			@Pc(266) Class231 local266 = arg9.method7153(arg2).method7166();
			if (local266 != null) {
				local97++;
				local234[0] = local266;
			}
			local266 = arg9.method7153(arg5).method7166();
			if (local266 != null) {
				local234[local97++] = local266;
			}
			local266 = arg9.method7153(arg0).method7166();
			if (local266 != null) {
				local234[local97++] = local266;
			}
			@Pc(305) int local305 = local7 | 0x4000;
			local266 = new Class231(local234, local97);
			local204 = arg7.method6817(local266, local305, Static290.anInt5279, 64, 768);
			for (@Pc(321) int local321 = 0; local321 < 5; local321++) {
				for (local38 = 0; local38 < Static103.aShortArrayArrayArray1.length; local38++) {
					if (this.anIntArray457[local321] < Static103.aShortArrayArrayArray1[local38][local321].length) {
						local204.d(Static327.aShortArrayArray8[local38][local321], Static103.aShortArrayArrayArray1[local38][local321][this.anIntArray457[local321]]);
					}
				}
			}
			local204.SA(local7);
			@Pc(377) Class207 local377 = Static275.aClass207_25;
			synchronized (Static275.aClass207_25) {
				Static275.aClass207_25.method4391(local194, local204);
			}
		}
		if (arg6 == null) {
			return local204;
		} else {
			local204 = local204.method7412((byte) 4, local7, true);
			return arg6.method4033(arg8, 2048, arg3, local204, arg1);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZLclient!tq;Lclient!np;Lclient!mp;ILclient!ks;Lclient!nu;Lclient!r;IIILclient!nf;)Lclient!da;")
	public Class52 method6092(@OriginalArg(1) Class323 arg0, @OriginalArg(2) Class242 arg1, @OriginalArg(3) Class225 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class197 arg4, @OriginalArg(6) Class245 arg5, @OriginalArg(7) Class78 arg6, @OriginalArg(8) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Interface17 arg9) {
		if (this.anInt7646 != -1) {
			return arg1.method5281(this.anInt7646).method7681(arg9, arg4, arg6, arg5, arg8, arg3, arg7);
		}
		@Pc(27) int local27 = 2048;
		@Pc(35) boolean local35;
		@Pc(52) int local52;
		@Pc(118) int local118;
		@Pc(58) int local58;
		@Pc(122) int local122;
		if (arg4 != null) {
			@Pc(31) boolean local31 = false;
			@Pc(33) boolean local33 = false;
			local35 = false;
			@Pc(37) boolean local37 = false;
			local27 = 2080;
			local52 = arg4.anIntArray284[arg7];
			local58 = local52 >>> 16;
			@Pc(62) int local62 = local52 & 0xFFFF;
			@Pc(67) Class1_Sub8_Sub18 local67 = arg5.method5307(local58);
			if (local67 != null) {
				local33 = local67.method7355(local62) | false;
				local31 = local67.method7356(local62) | false;
				local37 = local67.method7359(local62) | false;
				local35 = arg4.aBoolean385 | false;
			}
			if ((arg4.aBoolean384 || Static503.aBoolean658) && arg3 != -1 && arg4.anIntArray284.length > arg3) {
				local118 = arg4.anIntArray284[arg3];
				local122 = local118 >>> 16;
				@Pc(126) int local126 = local118 & 0xFFFF;
				@Pc(140) Class1_Sub8_Sub18 local140 = local122 == local58 ? local67 : arg5.method5307(local122);
				if (local140 != null) {
					local33 |= local140.method7355(local126);
					local31 |= local140.method7356(local126);
					local37 |= local140.method7359(local126);
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
		@Pc(189) Class207 local189 = Static275.aClass207_25;
		@Pc(198) Class52 local198;
		synchronized (Static275.aClass207_25) {
			local198 = (Class52) Static275.aClass207_25.method4390(this.aLong186);
		}
		if (local198 == null || arg6.method6819(local198.PA(), local27) != 0) {
			if (local198 != null) {
				local27 = arg6.method6782(local27, local198.PA());
			}
			local35 = false;
			for (@Pc(229) int local229 = 0; local229 < 12; local229++) {
				local52 = this.anIntArray456[local229];
				if ((local52 & 0x40000000) == 0) {
					if ((local52 & Integer.MIN_VALUE) != 0 && !arg0.method7153(local52 & 0x3FFFFFFF).method7169()) {
						local35 = true;
					}
				} else if (!arg2.method4857(local52 & 0x3FFFFFFF).method4793(this.aBoolean580)) {
					local35 = true;
				}
			}
			if (local35) {
				return null;
			}
			@Pc(286) Class231[] local286 = new Class231[12];
			local118 = 0;
			for (@Pc(290) int local290 = 0; local290 < 12; local290++) {
				@Pc(297) int local297 = this.anIntArray456[local290];
				@Pc(320) Class231 local320;
				if ((local297 & 0x40000000) != 0) {
					local320 = arg2.method4857(local297 & 0x3FFFFFFF).method4776(this.aBoolean580);
					if (local320 != null) {
						local286[local118++] = local320;
					}
				} else if ((Integer.MIN_VALUE & local297) != 0) {
					local320 = arg0.method7153(local297 & 0x3FFFFFFF).method7166();
					if (local320 != null) {
						local286[local118++] = local320;
					}
				}
			}
			@Pc(355) int local355 = local27 | 0x4000;
			@Pc(361) Class231 local361 = new Class231(local286, local118);
			local198 = arg6.method6817(local361, local355, Static290.anInt5279, 64, 768);
			for (local58 = 0; local58 < 5; local58++) {
				for (local122 = 0; local122 < Static103.aShortArrayArrayArray1.length; local122++) {
					if (this.anIntArray457[local58] < Static103.aShortArrayArrayArray1[local122][local58].length) {
						local198.d(Static327.aShortArrayArray8[local122][local58], Static103.aShortArrayArrayArray1[local122][local58][this.anIntArray457[local58]]);
					}
				}
			}
			local198.SA(local27);
			@Pc(427) Class207 local427 = Static275.aClass207_25;
			synchronized (Static275.aClass207_25) {
				Static275.aClass207_25.method4391(this.aLong186, local198);
			}
		}
		if (arg4 == null) {
			return local198;
		} else {
			local198.method7412((byte) 4, local27, true);
			return arg4.method4033(arg7, 2048, arg3, local198, arg8);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!tq;II)V")
	public void method6093(@OriginalArg(1) Class323 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = Static559.anIntArray584[arg2];
		if (arg0.method7153(arg1) != null) {
			this.anIntArray456[local13] = arg1 | Integer.MIN_VALUE;
			this.method6094();
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
	private void method6094() {
		this.aLong186 = -1L;
		@Pc(10) long[] local10 = Class209_Sub2_Sub2.aLongArray17;
		this.aLong186 = local10[(int) (((long) (this.anInt7639 >> 8) ^ this.aLong186) & 0xFFL)] ^ this.aLong186 >>> 8;
		this.aLong186 = local10[(int) ((this.aLong186 ^ (long) this.anInt7639) & 0xFFL)] ^ this.aLong186 >>> 8;
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong186 = local10[(int) (((long) (this.anIntArray456[local50] >> 24) ^ this.aLong186) & 0xFFL)] ^ this.aLong186 >>> 8;
			this.aLong186 = local10[(int) ((this.aLong186 ^ (long) (this.anIntArray456[local50] >> 16)) & 0xFFL)] ^ this.aLong186 >>> 8;
			this.aLong186 = local10[(int) ((this.aLong186 ^ (long) (this.anIntArray456[local50] >> 8)) & 0xFFL)] ^ this.aLong186 >>> 8;
			this.aLong186 = this.aLong186 >>> 8 ^ local10[(int) (((long) this.anIntArray456[local50] ^ this.aLong186) & 0xFFL)];
		}
		for (@Pc(151) int local151 = 0; local151 < 5; local151++) {
			this.aLong186 = local10[(int) ((this.aLong186 ^ (long) this.anIntArray457[local151]) & 0xFFL)] ^ this.aLong186 >>> 8;
		}
		this.aLong186 = this.aLong186 >>> 8 ^ local10[(int) (((long) (this.aBoolean580 ? 1 : 0) ^ this.aLong186) & 0xFFL)];
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZ)V")
	public void method6097(@OriginalArg(1) boolean arg0) {
		this.aBoolean580 = arg0;
		this.method6094();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z[IB[III)V")
	public void method6098(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (this.anInt7639 != arg4) {
			this.anInt7639 = arg4;
		}
		this.aBoolean580 = arg0;
		this.anIntArray457 = arg1;
		this.anIntArray456 = arg2;
		this.anInt7646 = arg3;
		this.method6094();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)V")
	public void method6100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray457[arg1] = arg0;
		this.method6094();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!np;IILclient!nf;Lclient!nu;[ILclient!mp;IZ[Lclient!mg;IIILclient!tq;Lclient!ks;ILclient!ks;BLclient!r;Lclient!vaa;)Lclient!da;")
	public Class52 method6102(@OriginalArg(0) int arg0, @OriginalArg(1) Class242 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface17 arg4, @OriginalArg(5) Class245 arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) Class225 arg7, @OriginalArg(8) int arg8, @OriginalArg(10) Class221[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class323 arg13, @OriginalArg(15) Class197 arg14, @OriginalArg(16) int arg15, @OriginalArg(17) Class197 arg16, @OriginalArg(19) Class78 arg17, @OriginalArg(20) Class340 arg18) {
		if (this.anInt7646 != -1) {
			return arg1.method5281(this.anInt7646).method7670(arg4, arg2, arg16, arg3, arg14, arg12, arg6, arg10, arg8, arg0, arg9, arg17, arg18, arg15, arg11, arg5);
		}
		@Pc(36) int local36 = arg10;
		@Pc(39) long local39 = this.aLong186;
		@Pc(42) int[] local42 = this.anIntArray456;
		if (arg14 != null && (arg14.anInt5077 >= 0 || arg14.anInt5071 >= 0)) {
			local42 = new int[12];
			for (@Pc(55) int local55 = 0; local55 < 12; local55++) {
				local42[local55] = this.anIntArray456[local55];
			}
			if (arg14.anInt5077 >= 0) {
				if (arg14.anInt5077 == 65535) {
					local42[5] = 0;
					local39 ^= 0xFFFFFFFF00000000L;
				} else {
					local42[5] = arg14.anInt5077 | 0x40000000;
					local39 ^= (long) local42[5] << 32;
				}
			}
			if (arg14.anInt5071 >= 0) {
				if (arg14.anInt5071 == 65535) {
					local42[3] = 0;
					local39 ^= 0xFFFFFFFFL;
				} else {
					local42[3] = arg14.anInt5071 | 0x40000000;
					local39 ^= local42[3];
				}
			}
		}
		@Pc(146) boolean local146 = false;
		@Pc(148) boolean local148 = false;
		@Pc(156) boolean local156 = false;
		@Pc(164) boolean local164 = arg14 != null || arg16 != null;
		@Pc(171) int local171 = arg9 == null ? 0 : arg9.length;
		@Pc(205) int local205;
		@Pc(210) int local210;
		for (@Pc(173) int local173 = 0; local173 < local171; local173++) {
			Static380.aClass1_Sub8_Sub18Array3[local173] = null;
			if (arg9[local173] != null) {
				@Pc(191) Class197 local191 = arg5.method5312(arg9[local173].anInt5858);
				if (local191.anIntArray284 != null) {
					local164 = true;
					Static413.aClass197Array2[local173] = local191;
					local205 = arg9[local173].anInt5860;
					local210 = arg9[local173].anInt5857;
					@Pc(215) int local215 = local191.anIntArray284[local205];
					Static380.aClass1_Sub8_Sub18Array3[local173] = arg5.method5307(local215 >>> 16);
					@Pc(228) int local228 = local215 & 0xFFFF;
					Static430.anIntArray463[local173] = local228;
					if (Static380.aClass1_Sub8_Sub18Array3[local173] != null) {
						local148 |= Static380.aClass1_Sub8_Sub18Array3[local173].method7355(local228);
						local146 |= Static380.aClass1_Sub8_Sub18Array3[local173].method7356(local228);
						local156 |= Static380.aClass1_Sub8_Sub18Array3[local173].method7359(local228);
					}
					if ((local191.aBoolean384 || Static503.aBoolean658) && local210 != -1 && local191.anIntArray284.length > local210) {
						Static121.anIntArray95[local173] = local191.anIntArray279[local205];
						Static137.anIntArray115[local173] = arg9[local173].anInt5854;
						@Pc(313) int local313 = local191.anIntArray284[local210];
						Static111.aClass1_Sub8_Sub18Array2[local173] = arg5.method5307(local313 >>> 16);
						@Pc(326) int local326 = local313 & 0xFFFF;
						Static587.anIntArray617[local173] = local326;
						if (Static111.aClass1_Sub8_Sub18Array2[local173] != null) {
							local148 |= Static111.aClass1_Sub8_Sub18Array2[local173].method7355(local326);
							local146 |= Static111.aClass1_Sub8_Sub18Array2[local173].method7356(local326);
							local156 |= Static111.aClass1_Sub8_Sub18Array2[local173].method7359(local326);
						}
					} else {
						Static121.anIntArray95[local173] = 0;
						Static137.anIntArray115[local173] = 0;
						Static111.aClass1_Sub8_Sub18Array2[local173] = null;
						Static587.anIntArray617[local173] = -1;
					}
				}
			}
		}
		@Pc(371) int local371 = -1;
		local205 = -1;
		local210 = 0;
		@Pc(377) Class1_Sub8_Sub18 local377 = null;
		@Pc(379) Class1_Sub8_Sub18 local379 = null;
		@Pc(381) int local381 = -1;
		@Pc(383) int local383 = -1;
		@Pc(385) int local385 = 0;
		@Pc(387) Class1_Sub8_Sub18 local387 = null;
		@Pc(389) Class1_Sub8_Sub18 local389 = null;
		if (local164) {
			@Pc(402) int local402;
			@Pc(466) int local466;
			if (arg14 != null) {
				local371 = arg14.anIntArray284[arg12];
				local402 = local371 >>> 16;
				local377 = arg5.method5307(local402);
				local371 &= 0xFFFF;
				if (local377 != null) {
					local148 |= local377.method7355(local371);
					local146 |= local377.method7356(local371);
					local156 |= local377.method7359(local371);
				}
				if ((arg14.aBoolean384 || Static503.aBoolean658) && arg2 != -1 && arg14.anIntArray284.length > arg2) {
					local210 = arg14.anIntArray279[arg12];
					local205 = arg14.anIntArray284[arg2];
					local466 = local205 >>> 16;
					local379 = local402 == local466 ? local377 : arg5.method5307(local466);
					local205 &= 0xFFFF;
					if (local379 != null) {
						local148 |= local379.method7355(local205);
						local146 |= local379.method7356(local205);
						local156 |= local379.method7359(local205);
					}
				}
			}
			local36 = arg10 | 0x20;
			if (arg16 != null) {
				local381 = arg16.anIntArray284[arg0];
				local402 = local381 >>> 16;
				local381 &= 0xFFFF;
				local387 = arg5.method5307(local402);
				if (local387 != null) {
					local148 |= local387.method7355(local381);
					local146 |= local387.method7356(local381);
					local156 |= local387.method7359(local381);
				}
				if ((arg16.aBoolean384 || Static503.aBoolean658) && arg11 != -1 && arg16.anIntArray284.length > arg11) {
					local383 = arg16.anIntArray284[arg11];
					local385 = arg16.anIntArray279[arg0];
					local466 = local383 >>> 16;
					local383 &= 0xFFFF;
					local389 = local402 == local466 ? local387 : arg5.method5307(local466);
					if (local389 != null) {
						local148 |= local389.method7355(local383);
						local146 |= local389.method7356(local383);
						local156 |= local389.method7359(local383);
					}
				}
			}
			if (local148) {
				local36 |= 0x80;
			}
			if (local146) {
				local36 |= 0x100;
			}
			if (local156) {
				local36 |= 0x400;
			}
		}
		@Pc(635) Class207 local635 = Static236.aClass207_55;
		@Pc(643) Class52 local643;
		synchronized (Static236.aClass207_55) {
			local643 = (Class52) Static236.aClass207_55.method4390(local39);
		}
		@Pc(651) Class114 local651 = null;
		if (this.anInt7639 != -1) {
			local651 = arg18.method7431(this.anInt7639);
		}
		@Pc(685) boolean local685;
		@Pc(687) int local687;
		@Pc(693) int local693;
		@Pc(738) int local738;
		@Pc(744) int local744;
		@Pc(813) int local813;
		if (local643 == null || arg17.method6819(local643.PA(), local36) != 0) {
			if (local643 != null) {
				local36 = arg17.method6782(local36, local643.PA());
			}
			local685 = false;
			for (local687 = 0; local687 < 12; local687++) {
				local693 = local42[local687];
				if ((local693 & 0x40000000) == 0) {
					if ((local693 & Integer.MIN_VALUE) != 0 && !arg13.method7153(local693 & 0x3FFFFFFF).method7171()) {
						local685 = true;
					}
				} else if (!arg7.method4857(local693 & 0x3FFFFFFF).method4789(this.aBoolean580)) {
					local685 = true;
				}
			}
			if (local685) {
				if (this.aLong187 != -1L) {
					@Pc(1023) Class207 local1023 = Static236.aClass207_55;
					synchronized (Static236.aClass207_55) {
						local643 = (Class52) Static236.aClass207_55.method4390(this.aLong187);
					}
				}
				if (local643 == null || arg17.method6819(local643.PA(), local36) != 0) {
					return null;
				}
			} else {
				@Pc(736) Class231[] local736 = new Class231[12];
				for (local738 = 0; local738 < 12; local738++) {
					local744 = local42[local738];
					@Pc(762) Class231 local762;
					if ((local744 & 0x40000000) != 0) {
						local762 = arg7.method4857(local744 & 0x3FFFFFFF).method4778(this.aBoolean580);
						if (local762 != null) {
							local736[local738] = local762;
						}
					} else if ((local744 & Integer.MIN_VALUE) != 0) {
						local762 = arg13.method7153(local744 & 0x3FFFFFFF).method7168();
						if (local762 != null) {
							local736[local738] = local762;
						}
					}
				}
				@Pc(815) int local815;
				if (local651 != null && local651.anIntArrayArray10 != null) {
					for (local744 = 0; local744 < local651.anIntArrayArray10.length; local744++) {
						if (local736[local744] != null) {
							local813 = 0;
							local815 = 0;
							@Pc(817) int local817 = 0;
							@Pc(819) int local819 = 0;
							@Pc(821) int local821 = 0;
							@Pc(823) int local823 = 0;
							if (local651.anIntArrayArray10[local744] != null) {
								local813 = local651.anIntArrayArray10[local744][0];
								local823 = local651.anIntArrayArray10[local744][5] << 3;
								local817 = local651.anIntArrayArray10[local744][2];
								local819 = local651.anIntArrayArray10[local744][3] << 3;
								local821 = local651.anIntArrayArray10[local744][4] << 3;
								local815 = local651.anIntArrayArray10[local744][1];
							}
							if (local819 != 0 || local821 != 0 || local823 != 0) {
								local736[local744].method5064(local819, local823, local821);
							}
							if (local813 != 0 || local815 != 0 || local817 != 0) {
								local736[local744].method5074(local817, local815, local813);
							}
						}
					}
				}
				@Pc(926) Class231 local926 = new Class231(local736, local736.length);
				@Pc(930) int local930 = local36 | 0x4000;
				local643 = arg17.method6817(local926, local930, Static290.anInt5279, 64, 850);
				for (local813 = 0; local813 < 5; local813++) {
					for (local815 = 0; local815 < Static103.aShortArrayArrayArray1.length; local815++) {
						if (Static103.aShortArrayArrayArray1[local815][local813].length > this.anIntArray457[local813]) {
							local643.d(Static327.aShortArrayArray8[local815][local813], Static103.aShortArrayArrayArray1[local815][local813][this.anIntArray457[local813]]);
						}
					}
				}
				local643.SA(local36);
				@Pc(998) Class207 local998 = Static236.aClass207_55;
				synchronized (Static236.aClass207_55) {
					Static236.aClass207_55.method4391(local39, local643);
				}
				this.aLong187 = local39;
			}
		}
		@Pc(1054) Class52 local1054 = local643.method7412((byte) 4, local36, true);
		local685 = false;
		if (arg6 != null) {
			for (local687 = 0; local687 < 12; local687++) {
				if (arg6[local687] != -1) {
					local685 = true;
				}
			}
		}
		if (!local164 && !local685) {
			return local1054;
		}
		@Pc(1081) Class34[] local1081 = null;
		if (local651 != null) {
			local1081 = local651.method2601(arg17);
		}
		if (local685 && local1081 != null) {
			for (local693 = 0; local693 < 12; local693++) {
				if (local1081[local693] != null) {
					local1054.method7403(local1081[local693], 0x1 << local693, true);
				}
			}
		}
		local693 = 0;
		local738 = 1;
		while (local693 < local171) {
			if (Static380.aClass1_Sub8_Sub18Array3[local693] != null) {
				local1054.method7400(false, Static587.anIntArray617[local693], local738, Static137.anIntArray115[local693] - 1, Static121.anIntArray95[local693], Static111.aClass1_Sub8_Sub18Array2[local693], null, Static430.anIntArray463[local693], Static380.aClass1_Sub8_Sub18Array3[local693]);
			}
			local738 <<= 0x1;
			local693++;
		}
		if (local685) {
			for (local744 = 0; local744 < 12; local744++) {
				if (arg6[local744] != -1) {
					local813 = arg6[local744] - arg8;
					local813 &= 0x3FFF;
					@Pc(1183) Class34 local1183 = arg17.method6833();
					local1183.o(local813);
					local1054.method7403(local1183, 0x1 << local744, false);
				}
			}
		}
		if (local685 && local1081 != null) {
			for (local744 = 0; local744 < 12; local744++) {
				if (local1081[local744] != null) {
					local1054.method7403(local1081[local744], 0x1 << local744, false);
				}
			}
		}
		if (local377 != null && local387 != null) {
			local1054.method7406(local385, false, local379, arg14.aBooleanArray23, arg15 - 1, local377, local387, arg3 - 1, local389, local205, local381, local210, local371, local383);
		} else if (local377 != null) {
			local1054.method7394(local379, false, arg3 - 1, local205, local371, local377, 0, local210);
		} else if (local387 != null) {
			local1054.method7394(local389, false, arg15 - 1, local383, local381, local387, 0, local385);
		}
		for (local744 = 0; local744 < local171; local744++) {
			Static380.aClass1_Sub8_Sub18Array3[local744] = null;
			Static111.aClass1_Sub8_Sub18Array2[local744] = null;
			Static413.aClass197Array2[local744] = null;
		}
		return local1054;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BIILclient!mp;)V")
	public void method6103(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class225 arg2) {
		if (arg0 == -1) {
			this.anIntArray456[arg1] = 0;
		} else if (arg2.method4857(arg0) != null) {
			this.anIntArray456[arg1] = arg0 | 0x40000000;
			this.method6094();
		}
	}
}
