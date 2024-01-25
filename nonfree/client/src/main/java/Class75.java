import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class75 {

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "J")
	private long aLong74;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "Z")
	public boolean aBoolean136;

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
	private int anInt2169;

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "[I")
	public int[] anIntArray194;

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "[I")
	private int[] anIntArray195;

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "J")
	private long aLong75;

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
	public int anInt2171 = -1;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!za;ILclient!gs;ZIILclient!gv;Lclient!jv;IIII)Lclient!e;")
	public Class63 method1888(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class98 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class100 arg5, @OriginalArg(7) Class137 arg6, @OriginalArg(8) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(97) int local97;
		if (arg6 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			local7 = 2080;
			@Pc(32) int local32 = arg6.anIntArray403[arg9];
			@Pc(38) int local38 = local32 >>> 16;
			@Pc(42) int local42 = local32 & 0xFFFF;
			@Pc(47) Class10_Sub1_Sub4 local47 = arg2.method2409(local38);
			if (local47 != null) {
				local13 = local47.method1706(local42) | false;
				local11 = local47.method1711(local42) | false;
				local17 = local47.method1709(local42) | false;
				local15 = arg6.aBoolean273 | false;
			}
			if ((arg6.aBoolean272 || Static102.aBoolean131) && arg1 != -1 && arg6.anIntArray403.length > arg1) {
				local97 = arg6.anIntArray403[arg1];
				@Pc(101) int local101 = local97 >>> 16;
				@Pc(105) int local105 = local97 & 0xFFFF;
				@Pc(110) Class10_Sub1_Sub4 local110;
				if (local38 == local101) {
					local110 = local47;
				} else {
					local110 = arg2.method2409(local105 >>> 16);
				}
				if (local110 != null) {
					local13 |= local110.method1706(local105);
					local11 |= local110.method1711(local105);
					local17 |= local110.method1709(local105);
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
		@Pc(178) long local178 = (long) arg8 | (long) (arg3 << 16) | (long) arg7 << 32;
		@Pc(180) Class267 local180 = Static284.aClass267_51;
		@Pc(188) Class63 local188;
		synchronized (Static284.aClass267_51) {
			local188 = (Class63) Static284.aClass267_51.method6014(local178);
		}
		if (local188 == null || arg0.method5856(local188.RA(), local7) != 0) {
			if (local188 != null) {
				local7 = arg0.method5822(local7, local188.RA());
			}
			@Pc(215) Class192[] local215 = new Class192[3];
			local97 = 0;
			if (!arg5.method2412(arg8).method3693() || !arg5.method2412(arg3).method3693() || !arg5.method2412(arg7).method3693()) {
				return null;
			}
			@Pc(245) Class192 local245 = arg5.method2412(arg8).method3690();
			if (local245 != null) {
				local97++;
				local215[0] = local245;
			}
			local245 = arg5.method2412(arg3).method3690();
			if (local245 != null) {
				local215[local97++] = local245;
			}
			local245 = arg5.method2412(arg7).method3690();
			if (local245 != null) {
				local215[local97++] = local245;
			}
			@Pc(292) int local292 = local7 | 0x4000;
			local245 = new Class192(local215, local97);
			local188 = arg0.method5864(local245, local292, Static92.anInt1932, 64, 768);
			for (@Pc(308) int local308 = 0; local308 < 5; local308++) {
				if (Static283.aShortArrayArray5[local308].length > this.anIntArray194[local308]) {
					local188.q(Static231.aShortArray59[local308], Static283.aShortArrayArray5[local308][this.anIntArray194[local308]]);
				}
				if (Static386.aShortArrayArray8[local308].length > this.anIntArray194[local308]) {
					local188.q(Static158.aShortArray48[local308], Static386.aShortArrayArray8[local308][this.anIntArray194[local308]]);
				}
			}
			local188.D(local7);
			@Pc(371) Class267 local371 = Static284.aClass267_51;
			synchronized (Static284.aClass267_51) {
				Static284.aClass267_51.method6008(local188, local178);
			}
		}
		if (arg6 == null) {
			return local188;
		} else {
			local188 = local188.method6093((byte) 4, local7, true);
			return arg6.method3210(arg4, local188, arg1, arg9, 2048);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!gs;Lclient!cg;Lclient!za;ILclient!hp;ILclient!jv;Lclient!wu;IILclient!gv;B)Lclient!e;")
	public Class63 method1889(@OriginalArg(0) Class98 arg0, @OriginalArg(1) Class38 arg1, @OriginalArg(2) Class50 arg2, @OriginalArg(4) Interface5 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class137 arg5, @OriginalArg(7) Class272 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class100 arg9) {
		if (this.anInt2171 != -1) {
			return arg1.method866(this.anInt2171).method4948(arg5, arg3, arg2, arg8, arg4, arg0, arg7);
		}
		@Pc(27) int local27 = 2048;
		@Pc(35) boolean local35;
		@Pc(54) int local54;
		@Pc(118) int local118;
		@Pc(58) int local58;
		if (arg5 != null) {
			@Pc(31) boolean local31 = false;
			@Pc(33) boolean local33 = false;
			local35 = false;
			@Pc(37) boolean local37 = false;
			local27 = 2080;
			local54 = arg5.anIntArray403[arg4];
			local58 = local54 >>> 16;
			@Pc(62) int local62 = local54 & 0xFFFF;
			@Pc(67) Class10_Sub1_Sub4 local67 = arg0.method2409(local58);
			if (local67 != null) {
				local33 = local67.method1706(local62) | false;
				local31 = local67.method1711(local62) | false;
				local37 = local67.method1709(local62) | false;
				local35 = arg5.aBoolean273 | false;
			}
			if ((arg5.aBoolean272 || Static102.aBoolean131) && arg7 != -1 && arg5.anIntArray403.length > arg7) {
				local118 = arg5.anIntArray403[arg7];
				@Pc(122) int local122 = local118 >>> 16;
				@Pc(126) int local126 = local118 & 0xFFFF;
				@Pc(136) Class10_Sub1_Sub4 local136 = local122 == local58 ? local67 : arg0.method2409(local122);
				if (local136 != null) {
					local33 |= local136.method1706(local126);
					local31 |= local136.method1711(local126);
					local37 |= local136.method1709(local126);
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
		@Pc(191) Class267 local191 = Static284.aClass267_51;
		@Pc(200) Class63 local200;
		synchronized (Static284.aClass267_51) {
			local200 = (Class63) Static284.aClass267_51.method6014(this.aLong74);
		}
		if (local200 == null || arg2.method5856(local200.RA(), local27) != 0) {
			if (local200 != null) {
				local27 = arg2.method5822(local27, local200.RA());
			}
			local35 = false;
			for (@Pc(231) int local231 = 0; local231 < 12; local231++) {
				local54 = this.anIntArray195[local231];
				if ((local54 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local54) != 0 && !arg9.method2412(local54 & 0x3FFFFFFF).method3693()) {
						local35 = true;
					}
				} else if (!arg6.method6068(local54 & 0x3FFFFFFF).method1540(this.aBoolean136)) {
					local35 = true;
				}
			}
			if (local35) {
				return null;
			}
			@Pc(289) Class192[] local289 = new Class192[12];
			local118 = 0;
			for (@Pc(293) int local293 = 0; local293 < 12; local293++) {
				@Pc(300) int local300 = this.anIntArray195[local293];
				@Pc(315) Class192 local315;
				if ((local300 & 0x40000000) != 0) {
					local315 = arg6.method6068(local300 & 0x3FFFFFFF).method1532(this.aBoolean136);
					if (local315 != null) {
						local289[local118++] = local315;
					}
				} else if ((Integer.MIN_VALUE & local300) != 0) {
					local315 = arg9.method2412(local300 & 0x3FFFFFFF).method3690();
					if (local315 != null) {
						local289[local118++] = local315;
					}
				}
			}
			@Pc(357) Class192 local357 = new Class192(local289, local118);
			@Pc(361) int local361 = local27 | 0x4000;
			local200 = arg2.method5864(local357, local361, Static92.anInt1932, 64, 768);
			for (local58 = 0; local58 < 5; local58++) {
				if (Static283.aShortArrayArray5[local58].length > this.anIntArray194[local58]) {
					local200.q(Static231.aShortArray59[local58], Static283.aShortArrayArray5[local58][this.anIntArray194[local58]]);
				}
				if (this.anIntArray194[local58] < Static386.aShortArrayArray8[local58].length) {
					local200.q(Static158.aShortArray48[local58], Static386.aShortArrayArray8[local58][this.anIntArray194[local58]]);
				}
			}
			local200.D(local27);
			@Pc(434) Class267 local434 = Static284.aClass267_51;
			synchronized (Static284.aClass267_51) {
				Static284.aClass267_51.method6008(local200, this.aLong74);
			}
		}
		if (arg5 == null) {
			return local200;
		} else {
			local200.method6093((byte) 4, local27, true);
			return arg5.method3210(arg8, local200, arg7, arg4, 2048);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZB)V")
	public void method1890(@OriginalArg(0) boolean arg0) {
		this.aBoolean136 = arg0;
		this.method1897();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V")
	public void method1891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray194[arg1] = arg0;
		this.method1897();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!gv;III)V")
	public void method1893(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = Static371.anIntArray622[arg2];
		if (this.anIntArray195[local7] != 0 && arg0.method2412(arg1) != null) {
			this.anIntArray195[local7] = Integer.MIN_VALUE | arg1;
			this.method1897();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II[I[IZI)V")
	public void method1894(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		this.anIntArray194 = arg2;
		this.anInt2171 = arg0;
		this.anIntArray195 = arg1;
		this.aBoolean136 = arg3;
		if (this.anInt2169 != arg4) {
			this.anInt2169 = arg4;
			this.anIntArrayArray19 = null;
		}
		this.method1897();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
	private void method1897() {
		this.aLong74 = -1L;
		@Pc(10) long[] local10 = Class217.aLongArray7;
		this.aLong74 = this.aLong74 >>> 8 ^ local10[(int) (((long) (this.anInt2169 >> 8) ^ this.aLong74) & 0xFFL)];
		this.aLong74 = local10[(int) ((this.aLong74 ^ (long) this.anInt2169) & 0xFFL)] ^ this.aLong74 >>> 8;
		for (@Pc(57) int local57 = 0; local57 < 12; local57++) {
			this.aLong74 = this.aLong74 >>> 8 ^ local10[(int) (((long) (this.anIntArray195[local57] >> 24) ^ this.aLong74) & 0xFFL)];
			this.aLong74 = this.aLong74 >>> 8 ^ local10[(int) (((long) (this.anIntArray195[local57] >> 16) ^ this.aLong74) & 0xFFL)];
			this.aLong74 = this.aLong74 >>> 8 ^ local10[(int) ((this.aLong74 ^ (long) (this.anIntArray195[local57] >> 8)) & 0xFFL)];
			this.aLong74 = local10[(int) ((this.aLong74 ^ (long) this.anIntArray195[local57]) & 0xFFL)] ^ this.aLong74 >>> 8;
		}
		for (@Pc(153) int local153 = 0; local153 < 5; local153++) {
			this.aLong74 = local10[(int) ((this.aLong74 ^ (long) this.anIntArray194[local153]) & 0xFFL)] ^ this.aLong74 >>> 8;
		}
		this.aLong74 = this.aLong74 >>> 8 ^ local10[(int) (((long) (this.aBoolean136 ? 1 : 0) ^ this.aLong74) & 0xFFL)];
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!jv;Lclient!jv;Lclient!gs;ILclient!wu;BLclient!si;ILclient!gv;IILclient!za;ILclient!cg;ZLclient!hp;[Lclient!gj;II)Lclient!e;")
	public Class63 method1898(@OriginalArg(0) Class137 arg0, @OriginalArg(1) Class137 arg1, @OriginalArg(2) Class98 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class272 arg4, @OriginalArg(6) Class223 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class100 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class50 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class38 arg12, @OriginalArg(15) Interface5 arg13, @OriginalArg(16) Class91[] arg14, @OriginalArg(17) int arg15, @OriginalArg(18) int arg16) {
		if (this.anInt2171 != -1) {
			return arg12.method866(this.anInt2171).method4936(arg16, arg8, arg1, arg13, arg11, arg0, arg5, arg2, arg3, arg10, arg14, arg9, arg6, arg15);
		}
		@Pc(34) int local34 = arg16;
		@Pc(37) long local37 = this.aLong74;
		@Pc(40) int[] local40 = this.anIntArray195;
		if (arg1 != null && (arg1.anInt4048 >= 0 || arg1.anInt4033 >= 0)) {
			local40 = new int[12];
			for (@Pc(56) int local56 = 0; local56 < 12; local56++) {
				local40[local56] = this.anIntArray195[local56];
			}
			if (arg1.anInt4048 >= 0) {
				if (arg1.anInt4048 == 65535) {
					local37 ^= 0xFFFFFFFF00000000L;
					local40[5] = 0;
				} else {
					local40[5] = arg1.anInt4048 | 0x40000000;
					local37 ^= (long) local40[5] << 32;
				}
			}
			if (arg1.anInt4033 >= 0) {
				if (arg1.anInt4033 == 65535) {
					local37 ^= 0xFFFFFFFFL;
					local40[3] = 0;
				} else {
					local40[3] = arg1.anInt4033 | 0x40000000;
					local37 ^= local40[3];
				}
			}
		}
		@Pc(140) boolean local140 = false;
		@Pc(142) boolean local142 = false;
		@Pc(144) boolean local144 = false;
		@Pc(157) boolean local157 = arg1 != null || arg0 != null;
		@Pc(164) int local164 = arg14 == null ? 0 : arg14.length;
		@Pc(198) int local198;
		@Pc(203) int local203;
		for (@Pc(166) int local166 = 0; local166 < local164; local166++) {
			Static95.aClass10_Sub1_Sub4Array1[local166] = null;
			if (arg14[local166] != null) {
				@Pc(184) Class137 local184 = arg2.method2405(arg14[local166].anInt2758);
				if (local184.anIntArray403 != null) {
					local157 = true;
					Static403.aClass137Array2[local166] = local184;
					local198 = arg14[local166].anInt2761;
					local203 = arg14[local166].anInt2755;
					@Pc(208) int local208 = local184.anIntArray403[local198];
					Static95.aClass10_Sub1_Sub4Array1[local166] = arg2.method2409(local208 >>> 16);
					@Pc(223) int local223 = local208 & 0xFFFF;
					Static424.anIntArray692[local166] = local223;
					if (Static95.aClass10_Sub1_Sub4Array1[local166] != null) {
						local142 |= Static95.aClass10_Sub1_Sub4Array1[local166].method1706(local223);
						local140 |= Static95.aClass10_Sub1_Sub4Array1[local166].method1711(local223);
						local144 |= Static95.aClass10_Sub1_Sub4Array1[local166].method1709(local223);
					}
					if ((local184.aBoolean272 || Static102.aBoolean131) && local203 != -1 && local203 < local184.anIntArray403.length) {
						Static376.anIntArray626[local166] = local184.anIntArray404[local198];
						Static382.anIntArray686[local166] = arg14[local166].anInt2762;
						@Pc(294) int local294 = local184.anIntArray403[local203];
						Static262.aClass10_Sub1_Sub4Array2[local166] = arg2.method2409(local294 >>> 16);
						@Pc(307) int local307 = local294 & 0xFFFF;
						Static223.anIntArray418[local166] = local307;
						if (Static262.aClass10_Sub1_Sub4Array2[local166] != null) {
							local142 |= Static262.aClass10_Sub1_Sub4Array2[local166].method1706(local307);
							local140 |= Static262.aClass10_Sub1_Sub4Array2[local166].method1711(local307);
							local144 |= Static262.aClass10_Sub1_Sub4Array2[local166].method1709(local307);
						}
					} else {
						Static376.anIntArray626[local166] = 0;
						Static382.anIntArray686[local166] = 0;
						Static262.aClass10_Sub1_Sub4Array2[local166] = null;
						Static223.anIntArray418[local166] = -1;
					}
				}
			}
		}
		@Pc(370) int local370 = -1;
		local198 = -1;
		local203 = 0;
		@Pc(376) Class10_Sub1_Sub4 local376 = null;
		@Pc(378) Class10_Sub1_Sub4 local378 = null;
		@Pc(380) int local380 = -1;
		@Pc(382) int local382 = -1;
		@Pc(384) int local384 = 0;
		@Pc(386) Class10_Sub1_Sub4 local386 = null;
		@Pc(388) Class10_Sub1_Sub4 local388 = null;
		if (local157) {
			@Pc(401) int local401;
			@Pc(465) int local465;
			if (arg1 != null) {
				local370 = arg1.anIntArray403[arg8];
				local401 = local370 >>> 16;
				local376 = arg2.method2409(local401);
				local370 &= 0xFFFF;
				if (local376 != null) {
					local142 |= local376.method1706(local370);
					local140 |= local376.method1711(local370);
					local144 |= local376.method1709(local370);
				}
				if ((arg1.aBoolean272 || Static102.aBoolean131) && arg9 != -1 && arg1.anIntArray403.length > arg9) {
					local198 = arg1.anIntArray403[arg9];
					local203 = arg1.anIntArray404[arg8];
					local465 = local198 >>> 16;
					local378 = local465 == local401 ? local376 : arg2.method2409(local465);
					local198 &= 0xFFFF;
					if (local378 != null) {
						local142 |= local378.method1706(local198);
						local140 |= local378.method1711(local198);
						local144 |= local378.method1709(local198);
					}
				}
			}
			local34 = arg16 | 0x20;
			if (arg0 != null) {
				local380 = arg0.anIntArray403[arg15];
				local401 = local380 >>> 16;
				local380 &= 0xFFFF;
				local386 = arg2.method2409(local401);
				if (local386 != null) {
					local142 |= local386.method1706(local380);
					local140 |= local386.method1711(local380);
					local144 |= local386.method1709(local380);
				}
				if ((arg0.aBoolean272 || Static102.aBoolean131) && arg6 != -1 && arg0.anIntArray403.length > arg6) {
					local382 = arg0.anIntArray403[arg6];
					local384 = arg0.anIntArray404[arg15];
					local465 = local382 >>> 16;
					local388 = local465 == local401 ? local386 : arg2.method2409(local465);
					local382 &= 0xFFFF;
					if (local388 != null) {
						local142 |= local388.method1706(local382);
						local140 |= local388.method1711(local382);
						local144 |= local388.method1709(local382);
					}
				}
			}
			if (local142) {
				local34 |= 0x80;
			}
			if (local140) {
				local34 |= 0x100;
			}
			if (local144) {
				local34 |= 0x400;
			}
		}
		@Pc(647) Class267 local647 = Static416.aClass267_78;
		@Pc(657) Class63 local657;
		synchronized (Static416.aClass267_78) {
			local657 = (Class63) Static416.aClass267_78.method6014(local37);
		}
		@Pc(665) Class6 local665 = null;
		if (this.anInt2169 != -1) {
			local665 = arg5.method4952(this.anInt2169);
		}
		@Pc(709) int local709;
		@Pc(715) int local715;
		if (local657 == null || arg10.method5856(local657.RA(), local34) != 0 || local665 != null && local665.anIntArrayArray1 != null && this.anIntArrayArray19 == null) {
			if (local657 != null) {
				local34 = arg10.method5822(local34, local657.RA());
			}
			@Pc(707) boolean local707 = false;
			local709 = 0;
			while (true) {
				if (local709 >= 12) {
					if (local707) {
						if (this.aLong75 != -1L) {
							@Pc(768) Class267 local768 = Static416.aClass267_78;
							synchronized (Static416.aClass267_78) {
								local657 = (Class63) Static416.aClass267_78.method6014(this.aLong75);
							}
						}
						if (local657 == null || arg10.method5856(local657.RA(), local34) != 0 || local665 != null && local665.anIntArrayArray1 != null && this.anIntArrayArray19 == null) {
							return null;
						}
					} else {
						@Pc(807) Class192[] local807 = new Class192[12];
						@Pc(815) int local815;
						for (@Pc(809) int local809 = 0; local809 < 12; local809++) {
							local815 = local40[local809];
							@Pc(834) Class192 local834;
							if ((local815 & 0x40000000) != 0) {
								local834 = arg4.method6068(local815 & 0x3FFFFFFF).method1544(this.aBoolean136);
								if (local834 != null) {
									local807[local809] = local834;
								}
							} else if ((local815 & Integer.MIN_VALUE) != 0) {
								local834 = arg7.method2412(local815 & 0x3FFFFFFF).method3692();
								if (local834 != null) {
									local807[local809] = local834;
								}
							}
						}
						@Pc(892) int local892;
						if (local665 != null && local665.anIntArrayArray1 != null) {
							for (local815 = 0; local815 < local665.anIntArrayArray1.length; local815++) {
								if (local665.anIntArrayArray1[local815] != null && local807[local815] != null) {
									local892 = local665.anIntArrayArray1[local815][0];
									@Pc(899) int local899 = local665.anIntArrayArray1[local815][1];
									@Pc(906) int local906 = local665.anIntArrayArray1[local815][2];
									@Pc(915) int local915 = local665.anIntArrayArray1[local815][3] << 3;
									@Pc(924) int local924 = local665.anIntArrayArray1[local815][4] << 3;
									@Pc(933) int local933 = local665.anIntArrayArray1[local815][5] << 3;
									if (this.anIntArrayArray19 == null) {
										this.anIntArrayArray19 = new int[local665.anIntArrayArray1.length][];
									}
									if (this.anIntArrayArray19[local815] == null) {
										@Pc(955) int[] local955 = this.anIntArrayArray19[local815] = new int[15];
										if (local915 == 0 && local924 == 0 && local933 == 0) {
											local955[12] = -local892;
											local955[13] = -local899;
											local955[0] = local955[4] = local955[8] = 32768;
											local955[14] = -local906;
										} else {
											@Pc(1000) int local1000 = Class250.anIntArray674[local915];
											@Pc(1004) int local1004 = Class250.anIntArray675[local915];
											@Pc(1008) int local1008 = Class250.anIntArray674[local924];
											@Pc(1012) int local1012 = Class250.anIntArray675[local924];
											@Pc(1016) int local1016 = Class250.anIntArray674[local933];
											@Pc(1020) int local1020 = Class250.anIntArray675[local933];
											@Pc(1028) int local1028 = local1004 * local1016 + 16384 >> 15;
											@Pc(1036) int local1036 = local1020 * local1004 + 16384 >> 15;
											local955[6] = local1008 * local1036 + local1016 * -local1012 + 16384 >> 15;
											local955[3] = local1020 * local1000 + 16384 >> 15;
											local955[7] = -local1012 * -local1020 + local1028 * local1008 + 16384 >> 15;
											local955[1] = local1028 * local1012 + -local1020 * local1008 + 16384 >> 15;
											local955[0] = local1036 * local1012 + local1008 * local1016 + 16384 >> 15;
											local955[4] = local1000 * local1016 + 16384 >> 15;
											local955[8] = local1008 * local1000 + 16384 >> 15;
											local955[5] = -local1004;
											local955[2] = local1000 * local1012 + 16384 >> 15;
											local955[13] = -local892 * local955[1] + local955[4] * -local899 + local955[7] * -local906 + 16384 >> 15;
											local955[14] = local955[8] * -local906 + local955[2] * -local892 + local955[5] * -local899 + 16384 >> 15;
											local955[12] = -local906 * local955[6] + local955[0] * -local892 + local955[3] * -local899 + 16384 >> 15;
										}
										local955[10] = local899;
										local955[11] = local906;
										local955[9] = local892;
									}
									if (local915 != 0 || local924 != 0 || local933 != 0) {
										local807[local815].method4337(local924, local933, local915);
									}
									if (local892 != 0 || local899 != 0 || local906 != 0) {
										local807[local815].method4344(local906, local899, local892);
									}
								}
							}
						}
						@Pc(1297) Class192 local1297 = new Class192(local807, local807.length);
						@Pc(1301) int local1301 = local34 | 0x4000;
						local657 = arg10.method5864(local1297, local1301, Static92.anInt1932, 64, 850);
						for (local892 = 0; local892 < 5; local892++) {
							if (Static283.aShortArrayArray5[local892].length > this.anIntArray194[local892]) {
								local657.q(Static231.aShortArray59[local892], Static283.aShortArrayArray5[local892][this.anIntArray194[local892]]);
							}
							if (this.anIntArray194[local892] < Static386.aShortArrayArray8[local892].length) {
								local657.q(Static158.aShortArray48[local892], Static386.aShortArrayArray8[local892][this.anIntArray194[local892]]);
							}
						}
						local657.D(local34);
						@Pc(1372) Class267 local1372 = Static416.aClass267_78;
						synchronized (Static416.aClass267_78) {
							Static416.aClass267_78.method6008(local657, local37);
						}
						this.aLong75 = local37;
					}
					break;
				}
				local715 = local40[local709];
				if ((local715 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local715) != 0 && !arg7.method2412(local715 & 0x3FFFFFFF).method3696()) {
						local707 = true;
					}
				} else if (!arg4.method6068(local715 & 0x3FFFFFFF).method1527(this.aBoolean136)) {
					local707 = true;
				}
				local709++;
			}
		}
		@Pc(1394) Class63 local1394 = local657.method6093((byte) 4, local34, true);
		if (!local157) {
			return local1394;
		}
		@Pc(1400) int local1400 = 0;
		local709 = 1;
		while (local1400 < local164) {
			if (Static95.aClass10_Sub1_Sub4Array1[local1400] != null) {
				local1394.method6103(Static95.aClass10_Sub1_Sub4Array1[local1400], this.anIntArrayArray19 == null ? null : this.anIntArrayArray19[local1400], Static223.anIntArray418[local1400], Static382.anIntArray686[local1400] - 1, false, local709, Static262.aClass10_Sub1_Sub4Array2[local1400], Static424.anIntArray692[local1400], Static376.anIntArray626[local1400]);
			}
			local1400++;
			local709 <<= 0x1;
		}
		if (local376 != null && local386 != null) {
			local1394.method6100(arg3 - 1, arg1.aBooleanArray11, local376, local198, local378, local203, arg11 - 1, local382, local370, false, local380, local388, local386, local384);
		} else if (local376 != null) {
			local1394.method6091(false, 0, local203, arg3 - 1, local376, local198, local378, local370);
		} else if (local386 != null) {
			local1394.method6091(false, 0, local384, arg11 - 1, local386, local382, local388, local380);
		}
		for (local715 = 0; local715 < local164; local715++) {
			Static95.aClass10_Sub1_Sub4Array1[local715] = null;
			Static262.aClass10_Sub1_Sub4Array2[local715] = null;
			Static403.aClass137Array2[local715] = null;
		}
		return local1394;
	}
}
