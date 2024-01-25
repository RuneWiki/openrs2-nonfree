import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class173 {

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "[I")
	private int[] anIntArray318;

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
	private int anInt4994;

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "J")
	private long aLong149;

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "J")
	private long aLong150;

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "[I")
	public int[] anIntArray319;

	@OriginalMember(owner = "client!oe", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!oe", name = "s", descriptor = "Z")
	public boolean aBoolean564;

	@OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
	public int anInt4998 = -1;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!oj;ILclient!za;IIILclient!vm;Lclient!rq;IIB)Lclient!e;")
	public Class57 method3906(@OriginalArg(0) int arg0, @OriginalArg(1) Class177 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class34 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class254 arg7, @OriginalArg(8) Class215 arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(94) int local94;
		if (arg1 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			@Pc(28) int local28 = arg1.anIntArray326[arg5];
			local7 = 2080;
			@Pc(38) int local38 = local28 >>> 16;
			@Pc(43) Class1_Sub5_Sub2 local43 = arg7.method5672(local38);
			@Pc(47) int local47 = local28 & 0xFFFF;
			if (local43 != null) {
				local13 = local43.method634(local47) | false;
				local11 = local43.method630(local47) | false;
				local17 = local43.method629(local47) | false;
				local15 = arg1.aBoolean576 | false;
			}
			if ((arg1.aBoolean573 || Static389.aBoolean713) && arg4 != -1 && arg4 < arg1.anIntArray326.length) {
				local94 = arg1.anIntArray326[arg4];
				@Pc(98) int local98 = local94 >>> 16;
				@Pc(102) int local102 = local94 & 0xFFFF;
				@Pc(112) Class1_Sub5_Sub2 local112;
				if (local98 == local38) {
					local112 = local43;
				} else {
					local112 = arg7.method5672(local102 >>> 16);
				}
				if (local112 != null) {
					local13 |= local112.method634(local102);
					local11 |= local112.method630(local102);
					local17 |= local112.method629(local102);
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
		@Pc(175) long local175 = (long) arg0 | (long) (arg2 << 16) | (long) arg6 << 32;
		@Pc(177) Class102 local177 = Static311.aClass102_42;
		@Pc(185) Class57 local185;
		synchronized (Static311.aClass102_42) {
			local185 = (Class57) Static311.aClass102_42.method2258(local175);
		}
		if (local185 == null || arg3.method5783(local185.RA(), local7) != 0) {
			if (local185 != null) {
				local7 = arg3.method5787(local7, local185.RA());
			}
			@Pc(212) Class193[] local212 = new Class193[3];
			local94 = 0;
			if (!arg8.method4766(arg0).method3091() || !arg8.method4766(arg2).method3091() || !arg8.method4766(arg6).method3091()) {
				return null;
			}
			@Pc(244) Class193 local244 = arg8.method4766(arg0).method3089();
			if (local244 != null) {
				local94++;
				local212[0] = local244;
			}
			local244 = arg8.method4766(arg2).method3089();
			if (local244 != null) {
				local212[local94++] = local244;
			}
			local244 = arg8.method4766(arg6).method3089();
			if (local244 != null) {
				local212[local94++] = local244;
			}
			local244 = new Class193(local212, local94);
			@Pc(289) int local289 = local7 | 0x4000;
			local185 = arg3.method5792(local244, local289, Static233.anInt4144, 64, 768);
			for (@Pc(299) int local299 = 0; local299 < 5; local299++) {
				if (Static452.aShortArrayArray13[local299].length > this.anIntArray319[local299]) {
					local185.q(Static220.aShortArray62[local299], Static452.aShortArrayArray13[local299][this.anIntArray319[local299]]);
				}
				if (Static28.aShortArrayArray1[local299].length > this.anIntArray319[local299]) {
					local185.q(Static166.aShortArray47[local299], Static28.aShortArrayArray1[local299][this.anIntArray319[local299]]);
				}
			}
			local185.D(local7);
			@Pc(358) Class102 local358 = Static311.aClass102_42;
			synchronized (Static311.aClass102_42) {
				Static311.aClass102_42.method2272(local175, local185);
			}
		}
		if (arg1 == null) {
			return local185;
		} else {
			local185 = local185.method5966((byte) 4, local7, true);
			return arg1.method3954(local185, 2048, arg4, arg5, arg9);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!rq;BII)V")
	public void method3907(@OriginalArg(0) Class215 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = Static64.anIntArray56[arg1];
		if (this.anIntArray318[local7] != 0 && arg0.method4766(arg2) != null) {
			this.anIntArray318[local7] = Integer.MIN_VALUE | arg2;
			this.method3914();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!vm;ILclient!tb;Lclient!oj;Lclient!ro;Lclient!rq;ILclient!za;ILclient!mk;IZ)Lclient!e;")
	public Class57 method3908(@OriginalArg(0) Class254 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class231 arg2, @OriginalArg(3) Class177 arg3, @OriginalArg(4) Interface9 arg4, @OriginalArg(5) Class215 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class34 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class155 arg9) {
		if (this.anInt4998 != -1) {
			return arg2.method5022(this.anInt4998).method1147(arg0, arg8, arg6, arg7, arg4, arg1, arg3);
		}
		@Pc(27) int local27 = 2048;
		@Pc(35) boolean local35;
		@Pc(50) int local50;
		@Pc(117) int local117;
		@Pc(58) int local58;
		if (arg3 != null) {
			@Pc(31) boolean local31 = false;
			@Pc(33) boolean local33 = false;
			local35 = false;
			@Pc(37) boolean local37 = false;
			local50 = arg3.anIntArray326[arg8];
			local27 = 2080;
			local58 = local50 >>> 16;
			@Pc(63) Class1_Sub5_Sub2 local63 = arg0.method5672(local58);
			@Pc(67) int local67 = local50 & 0xFFFF;
			if (local63 != null) {
				local33 = local63.method634(local67) | false;
				local31 = local63.method630(local67) | false;
				local37 = local63.method629(local67) | false;
				local35 = arg3.aBoolean576 | false;
			}
			if ((arg3.aBoolean573 || Static389.aBoolean713) && arg6 != -1 && arg6 < arg3.anIntArray326.length) {
				local117 = arg3.anIntArray326[arg6];
				@Pc(121) int local121 = local117 >>> 16;
				@Pc(131) Class1_Sub5_Sub2 local131 = local58 == local121 ? local63 : arg0.method5672(local121);
				@Pc(135) int local135 = local117 & 0xFFFF;
				if (local131 != null) {
					local33 |= local131.method634(local135);
					local31 |= local131.method630(local135);
					local37 |= local131.method629(local135);
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
		@Pc(188) Class102 local188 = Static311.aClass102_42;
		@Pc(197) Class57 local197;
		synchronized (Static311.aClass102_42) {
			local197 = (Class57) Static311.aClass102_42.method2258(this.aLong149);
		}
		if (local197 == null || arg7.method5783(local197.RA(), local27) != 0) {
			if (local197 != null) {
				local27 = arg7.method5787(local27, local197.RA());
			}
			local35 = false;
			for (@Pc(225) int local225 = 0; local225 < 12; local225++) {
				local50 = this.anIntArray318[local225];
				if ((local50 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local50) != 0 && !arg5.method4766(local50 & 0x3FFFFFFF).method3091()) {
						local35 = true;
					}
				} else if (!arg9.method3548(local50 & 0x3FFFFFFF).method3698(this.aBoolean564)) {
					local35 = true;
				}
			}
			if (local35) {
				return null;
			}
			@Pc(281) Class193[] local281 = new Class193[12];
			local117 = 0;
			for (@Pc(285) int local285 = 0; local285 < 12; local285++) {
				@Pc(292) int local292 = this.anIntArray318[local285];
				@Pc(307) Class193 local307;
				if ((local292 & 0x40000000) != 0) {
					local307 = arg9.method3548(local292 & 0x3FFFFFFF).method3701(this.aBoolean564);
					if (local307 != null) {
						local281[local117++] = local307;
					}
				} else if ((Integer.MIN_VALUE & local292) != 0) {
					local307 = arg5.method4766(local292 & 0x3FFFFFFF).method3089();
					if (local307 != null) {
						local281[local117++] = local307;
					}
				}
			}
			@Pc(346) int local346 = local27 | 0x4000;
			@Pc(352) Class193 local352 = new Class193(local281, local117);
			local197 = arg7.method5792(local352, local346, Static233.anInt4144, 64, 768);
			for (local58 = 0; local58 < 5; local58++) {
				if (Static452.aShortArrayArray13[local58].length > this.anIntArray319[local58]) {
					local197.q(Static220.aShortArray62[local58], Static452.aShortArrayArray13[local58][this.anIntArray319[local58]]);
				}
				if (this.anIntArray319[local58] < Static28.aShortArrayArray1[local58].length) {
					local197.q(Static166.aShortArray47[local58], Static28.aShortArrayArray1[local58][this.anIntArray319[local58]]);
				}
			}
			local197.D(local27);
			@Pc(425) Class102 local425 = Static311.aClass102_42;
			synchronized (Static311.aClass102_42) {
				Static311.aClass102_42.method2272(this.aLong149, local197);
			}
		}
		if (arg3 == null) {
			return local197;
		} else {
			local197.method5966((byte) 4, local27, true);
			return arg3.method3954(local197, 2048, arg6, arg8, arg1);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZ[II[II)V")
	public void method3910(@OriginalArg(1) boolean arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		this.aBoolean564 = arg0;
		this.anIntArray319 = arg1;
		this.anInt4998 = arg4;
		this.anIntArray318 = arg3;
		if (arg2 != this.anInt4994) {
			this.anInt4994 = arg2;
			this.anIntArrayArray40 = null;
		}
		this.method3914();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V")
	public void method3911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray319[arg0] = arg1;
		this.method3914();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BZ)V")
	public void method3913(@OriginalArg(1) boolean arg0) {
		this.aBoolean564 = arg0;
		this.method3914();
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
	private void method3914() {
		@Pc(7) long[] local7 = Class109.aLongArray6;
		this.aLong149 = -1L;
		this.aLong149 = local7[(int) (((long) (this.anInt4994 >> 8) ^ this.aLong149) & 0xFFL)] ^ this.aLong149 >>> 8;
		this.aLong149 = local7[(int) (((long) this.anInt4994 ^ this.aLong149) & 0xFFL)] ^ this.aLong149 >>> 8;
		for (@Pc(54) int local54 = 0; local54 < 12; local54++) {
			this.aLong149 = local7[(int) ((this.aLong149 ^ (long) (this.anIntArray318[local54] >> 24)) & 0xFFL)] ^ this.aLong149 >>> 8;
			this.aLong149 = local7[(int) (((long) (this.anIntArray318[local54] >> 16) ^ this.aLong149) & 0xFFL)] ^ this.aLong149 >>> 8;
			this.aLong149 = this.aLong149 >>> 8 ^ local7[(int) ((this.aLong149 ^ (long) (this.anIntArray318[local54] >> 8)) & 0xFFL)];
			this.aLong149 = local7[(int) ((this.aLong149 ^ (long) this.anIntArray318[local54]) & 0xFFL)] ^ this.aLong149 >>> 8;
		}
		for (@Pc(150) int local150 = 0; local150 < 5; local150++) {
			this.aLong149 = this.aLong149 >>> 8 ^ local7[(int) (((long) this.anIntArray319[local150] ^ this.aLong149) & 0xFFL)];
		}
		this.aLong149 = local7[(int) ((this.aLong149 ^ (long) (this.aBoolean564 ? 1 : 0)) & 0xFFL)] ^ this.aLong149 >>> 8;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([Lclient!f;Lclient!ro;IILclient!oj;Lclient!za;ILclient!vm;Lclient!mk;IIILclient!bg;ILclient!rq;Lclient!oj;ILclient!tb;Z)Lclient!e;")
	public Class57 method3916(@OriginalArg(0) Class74[] arg0, @OriginalArg(1) Interface9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class177 arg4, @OriginalArg(5) Class34 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class254 arg7, @OriginalArg(8) Class155 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class21 arg12, @OriginalArg(14) Class215 arg13, @OriginalArg(15) Class177 arg14, @OriginalArg(16) int arg15, @OriginalArg(17) Class231 arg16) {
		if (this.anInt4998 != -1) {
			return arg16.method5022(this.anInt4998).method1156(arg11, arg14, arg15, arg0, arg10, arg3, arg12, arg5, arg2, arg4, arg7, arg9, arg1, arg6);
		}
		@Pc(41) int local41 = arg15;
		@Pc(44) long local44 = this.aLong149;
		@Pc(47) int[] local47 = this.anIntArray318;
		if (arg4 != null && (arg4.anInt5033 >= 0 || arg4.anInt5047 >= 0)) {
			local47 = new int[12];
			for (@Pc(60) int local60 = 0; local60 < 12; local60++) {
				local47[local60] = this.anIntArray318[local60];
			}
			if (arg4.anInt5033 >= 0) {
				if (arg4.anInt5033 == 65535) {
					local47[5] = 0;
					local44 ^= 0xFFFFFFFF00000000L;
				} else {
					local47[5] = arg4.anInt5033 | 0x40000000;
					local44 ^= (long) local47[5] << 32;
				}
			}
			if (arg4.anInt5047 >= 0) {
				if (arg4.anInt5047 == 65535) {
					local44 ^= 0xFFFFFFFFL;
					local47[3] = 0;
				} else {
					local47[3] = arg4.anInt5047 | 0x40000000;
					local44 ^= local47[3];
				}
			}
		}
		@Pc(143) boolean local143 = false;
		@Pc(145) boolean local145 = false;
		@Pc(147) boolean local147 = false;
		@Pc(155) boolean local155 = arg4 != null || arg14 != null;
		@Pc(162) int local162 = arg0 == null ? 0 : arg0.length;
		@Pc(198) int local198;
		@Pc(203) int local203;
		for (@Pc(164) int local164 = 0; local164 < local162; local164++) {
			Static391.aClass1_Sub5_Sub2Array3[local164] = null;
			if (arg0[local164] != null) {
				@Pc(184) Class177 local184 = arg7.method5670(arg0[local164].anInt1918);
				if (local184.anIntArray326 != null) {
					Static458.aClass177Array5[local164] = local184;
					local155 = true;
					local198 = arg0[local164].anInt1913;
					local203 = arg0[local164].anInt1917;
					@Pc(208) int local208 = local184.anIntArray326[local198];
					Static391.aClass1_Sub5_Sub2Array3[local164] = arg7.method5672(local208 >>> 16);
					@Pc(223) int local223 = local208 & 0xFFFF;
					Static353.anIntArray415[local164] = local223;
					if (Static391.aClass1_Sub5_Sub2Array3[local164] != null) {
						local145 |= Static391.aClass1_Sub5_Sub2Array3[local164].method634(local223);
						local143 |= Static391.aClass1_Sub5_Sub2Array3[local164].method630(local223);
						local147 |= Static391.aClass1_Sub5_Sub2Array3[local164].method629(local223);
					}
					if ((local184.aBoolean573 || Static389.aBoolean713) && local203 != -1 && local184.anIntArray326.length > local203) {
						Static304.anIntArray347[local164] = local184.anIntArray327[local198];
						Static193.anIntArray216[local164] = arg0[local164].anInt1914;
						@Pc(308) int local308 = local184.anIntArray326[local203];
						Static293.aClass1_Sub5_Sub2Array2[local164] = arg7.method5672(local308 >>> 16);
						@Pc(321) int local321 = local308 & 0xFFFF;
						Static8.anIntArray10[local164] = local321;
						if (Static293.aClass1_Sub5_Sub2Array2[local164] != null) {
							local145 |= Static293.aClass1_Sub5_Sub2Array2[local164].method634(local321);
							local143 |= Static293.aClass1_Sub5_Sub2Array2[local164].method630(local321);
							local147 |= Static293.aClass1_Sub5_Sub2Array2[local164].method629(local321);
						}
					} else {
						Static304.anIntArray347[local164] = 0;
						Static193.anIntArray216[local164] = 0;
						Static293.aClass1_Sub5_Sub2Array2[local164] = null;
						Static8.anIntArray10[local164] = -1;
					}
				}
			}
		}
		@Pc(362) int local362 = -1;
		local198 = -1;
		local203 = 0;
		@Pc(368) Class1_Sub5_Sub2 local368 = null;
		@Pc(370) Class1_Sub5_Sub2 local370 = null;
		@Pc(372) int local372 = -1;
		@Pc(374) int local374 = -1;
		@Pc(376) int local376 = 0;
		@Pc(378) Class1_Sub5_Sub2 local378 = null;
		@Pc(380) Class1_Sub5_Sub2 local380 = null;
		if (local155) {
			@Pc(393) int local393;
			@Pc(458) int local458;
			if (arg4 != null) {
				local362 = arg4.anIntArray326[arg9];
				local393 = local362 >>> 16;
				local362 &= 0xFFFF;
				local368 = arg7.method5672(local393);
				if (local368 != null) {
					local145 |= local368.method634(local362);
					local143 |= local368.method630(local362);
					local147 |= local368.method629(local362);
				}
				if ((arg4.aBoolean573 || Static389.aBoolean713) && arg2 != -1 && arg4.anIntArray326.length > arg2) {
					local198 = arg4.anIntArray326[arg2];
					local203 = arg4.anIntArray327[arg9];
					local458 = local198 >>> 16;
					local198 &= 0xFFFF;
					local370 = local393 == local458 ? local368 : arg7.method5672(local458);
					if (local370 != null) {
						local145 |= local370.method634(local198);
						local143 |= local370.method630(local198);
						local147 |= local370.method629(local198);
					}
				}
			}
			local41 = arg15 | 0x20;
			if (arg14 != null) {
				local372 = arg14.anIntArray326[arg11];
				local393 = local372 >>> 16;
				local372 &= 0xFFFF;
				local378 = arg7.method5672(local393);
				if (local378 != null) {
					local145 |= local378.method634(local372);
					local143 |= local378.method630(local372);
					local147 |= local378.method629(local372);
				}
				if ((arg14.aBoolean573 || Static389.aBoolean713) && arg3 != -1 && arg3 < arg14.anIntArray326.length) {
					local376 = arg14.anIntArray327[arg11];
					local374 = arg14.anIntArray326[arg3];
					local458 = local374 >>> 16;
					local374 &= 0xFFFF;
					local380 = local458 == local393 ? local378 : arg7.method5672(local458);
					if (local380 != null) {
						local145 |= local380.method634(local374);
						local143 |= local380.method630(local374);
						local147 |= local380.method629(local374);
					}
				}
			}
			if (local145) {
				local41 |= 0x80;
			}
			if (local143) {
				local41 |= 0x100;
			}
			if (local147) {
				local41 |= 0x400;
			}
		}
		@Pc(642) Class102 local642 = Static218.aClass102_26;
		@Pc(650) Class57 local650;
		synchronized (Static218.aClass102_26) {
			local650 = (Class57) Static218.aClass102_26.method2258(local44);
		}
		@Pc(658) Class236 local658 = null;
		if (this.anInt4994 != -1) {
			local658 = arg12.method396(this.anInt4994);
		}
		@Pc(698) int local698;
		@Pc(704) int local704;
		if (local650 == null || arg5.method5783(local650.RA(), local41) != 0 || local658 != null && local658.anIntArrayArray60 != null && this.anIntArrayArray40 == null) {
			if (local650 != null) {
				local41 = arg5.method5787(local41, local650.RA());
			}
			@Pc(696) boolean local696 = false;
			local698 = 0;
			while (true) {
				if (local698 >= 12) {
					if (local696) {
						if (this.aLong150 != -1L) {
							@Pc(753) Class102 local753 = Static218.aClass102_26;
							synchronized (Static218.aClass102_26) {
								local650 = (Class57) Static218.aClass102_26.method2258(this.aLong150);
							}
						}
						if (local650 == null || arg5.method5783(local650.RA(), local41) != 0 || local658 != null && local658.anIntArrayArray60 != null && this.anIntArrayArray40 == null) {
							return null;
						}
					} else {
						@Pc(789) Class193[] local789 = new Class193[12];
						@Pc(797) int local797;
						for (@Pc(791) int local791 = 0; local791 < 12; local791++) {
							local797 = local47[local791];
							@Pc(822) Class193 local822;
							if ((local797 & 0x40000000) != 0) {
								local822 = arg8.method3548(local797 & 0x3FFFFFFF).method3711(this.aBoolean564);
								if (local822 != null) {
									local789[local791] = local822;
								}
							} else if ((local797 & Integer.MIN_VALUE) != 0) {
								local822 = arg13.method4766(local797 & 0x3FFFFFFF).method3098();
								if (local822 != null) {
									local789[local791] = local822;
								}
							}
						}
						@Pc(878) int local878;
						if (local658 != null && local658.anIntArrayArray60 != null) {
							for (local797 = 0; local797 < local658.anIntArrayArray60.length; local797++) {
								if (local658.anIntArrayArray60[local797] != null && local789[local797] != null) {
									local878 = local658.anIntArrayArray60[local797][0];
									@Pc(885) int local885 = local658.anIntArrayArray60[local797][1];
									@Pc(892) int local892 = local658.anIntArrayArray60[local797][2];
									@Pc(901) int local901 = local658.anIntArrayArray60[local797][3] << 3;
									@Pc(910) int local910 = local658.anIntArrayArray60[local797][4] << 3;
									@Pc(919) int local919 = local658.anIntArrayArray60[local797][5] << 3;
									if (this.anIntArrayArray40 == null) {
										this.anIntArrayArray40 = new int[local658.anIntArrayArray60.length][];
									}
									if (this.anIntArrayArray40[local797] == null) {
										@Pc(941) int[] local941 = this.anIntArrayArray40[local797] = new int[15];
										if (local901 == 0 && local910 == 0 && local919 == 0) {
											local941[14] = -local892;
											local941[0] = local941[4] = local941[8] = 32768;
											local941[12] = -local878;
											local941[13] = -local885;
										} else {
											@Pc(986) int local986 = Class1_Sub4_Sub8_Sub1.anIntArray49[local901];
											@Pc(990) int local990 = Class1_Sub4_Sub8_Sub1.anIntArray50[local901];
											@Pc(994) int local994 = Class1_Sub4_Sub8_Sub1.anIntArray49[local910];
											@Pc(998) int local998 = Class1_Sub4_Sub8_Sub1.anIntArray50[local910];
											@Pc(1002) int local1002 = Class1_Sub4_Sub8_Sub1.anIntArray49[local919];
											@Pc(1006) int local1006 = Class1_Sub4_Sub8_Sub1.anIntArray50[local919];
											@Pc(1014) int local1014 = local1002 * local990 + 16384 >> 15;
											@Pc(1022) int local1022 = local990 * local1006 + 16384 >> 15;
											local941[4] = local986 * local1002 + 16384 >> 15;
											local941[2] = local986 * local998 + 16384 >> 15;
											local941[5] = -local990;
											local941[1] = local994 * -local1006 + local1014 * local998 + 16384 >> 15;
											local941[7] = local1014 * local994 + -local1006 * -local998 + 16384 >> 15;
											local941[8] = local986 * local994 + 16384 >> 15;
											local941[3] = local986 * local1006 + 16384 >> 15;
											local941[6] = local994 * local1022 + -local998 * local1002 + 16384 >> 15;
											local941[0] = local1022 * local998 + local1002 * local994 + 16384 >> 15;
											local941[14] = local941[2] * -local878 + -local885 * local941[5] + local941[8] * -local892 + 16384 >> 15;
											local941[12] = -local892 * local941[6] + local941[0] * -local878 + local941[3] * -local885 + 16384 >> 15;
											local941[13] = -local892 * local941[7] + local941[1] * -local878 + local941[4] * -local885 + 16384 >> 15;
										}
										local941[9] = local878;
										local941[11] = local892;
										local941[10] = local885;
									}
									if (local901 != 0 || local910 != 0 || local919 != 0) {
										local789[local797].method4253(local901, local910, local919);
									}
									if (local878 != 0 || local885 != 0 || local892 != 0) {
										local789[local797].method4262(local878, local892, local885);
									}
								}
							}
						}
						@Pc(1275) Class193 local1275 = new Class193(local789, local789.length);
						@Pc(1279) int local1279 = local41 | 0x4000;
						local650 = arg5.method5792(local1275, local1279, Static233.anInt4144, 64, 850);
						for (local878 = 0; local878 < 5; local878++) {
							if (Static452.aShortArrayArray13[local878].length > this.anIntArray319[local878]) {
								local650.q(Static220.aShortArray62[local878], Static452.aShortArrayArray13[local878][this.anIntArray319[local878]]);
							}
							if (this.anIntArray319[local878] < Static28.aShortArrayArray1[local878].length) {
								local650.q(Static166.aShortArray47[local878], Static28.aShortArrayArray1[local878][this.anIntArray319[local878]]);
							}
						}
						local650.D(local41);
						@Pc(1350) Class102 local1350 = Static218.aClass102_26;
						synchronized (Static218.aClass102_26) {
							Static218.aClass102_26.method2272(local44, local650);
						}
						this.aLong150 = local44;
					}
					break;
				}
				local704 = local47[local698];
				if ((local704 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local704) != 0 && !arg13.method4766(local704 & 0x3FFFFFFF).method3088()) {
						local696 = true;
					}
				} else if (!arg8.method3548(local704 & 0x3FFFFFFF).method3693(this.aBoolean564)) {
					local696 = true;
				}
				local698++;
			}
		}
		@Pc(1374) Class57 local1374 = local650.method5966((byte) 4, local41, true);
		if (!local155) {
			return local1374;
		}
		@Pc(1380) int local1380 = 0;
		local698 = 1;
		while (local162 > local1380) {
			if (Static391.aClass1_Sub5_Sub2Array3[local1380] != null) {
				local1374.method5961(Static8.anIntArray10[local1380], local698, false, Static193.anIntArray216[local1380] - 1, Static353.anIntArray415[local1380], Static304.anIntArray347[local1380], this.anIntArrayArray40 == null ? null : this.anIntArrayArray40[local1380], Static293.aClass1_Sub5_Sub2Array2[local1380], Static391.aClass1_Sub5_Sub2Array3[local1380]);
			}
			local1380++;
			local698 <<= 0x1;
		}
		if (local368 != null && local378 != null) {
			local1374.method5949(local372, local380, false, local368, arg10 - 1, local370, local378, local198, local374, local362, local203, arg6 - 1, local376, arg4.aBooleanArray15);
		} else if (local368 != null) {
			local1374.method5962(local368, 0, local203, arg10 - 1, local198, local362, false, local370);
		} else if (local378 != null) {
			local1374.method5962(local378, 0, local376, arg6 - 1, local374, local372, false, local380);
		}
		for (local704 = 0; local704 < local162; local704++) {
			Static391.aClass1_Sub5_Sub2Array3[local704] = null;
			Static293.aClass1_Sub5_Sub2Array2[local704] = null;
			Static458.aClass177Array5[local704] = null;
		}
		return local1374;
	}
}
