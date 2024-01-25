import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class214 {

	@OriginalMember(owner = "client!we", name = "b", descriptor = "J")
	private long aLong227;

	@OriginalMember(owner = "client!we", name = "m", descriptor = "Z")
	public boolean aBoolean478;

	@OriginalMember(owner = "client!we", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!we", name = "q", descriptor = "[I")
	public int[] anIntArray832;

	@OriginalMember(owner = "client!we", name = "s", descriptor = "[I")
	private int[] anIntArray833;

	@OriginalMember(owner = "client!we", name = "u", descriptor = "J")
	private long aLong228;

	@OriginalMember(owner = "client!we", name = "w", descriptor = "I")
	private int anInt6570;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "I")
	public int anInt6557 = -1;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZI)V")
	public void method5580(@OriginalArg(0) boolean arg0) {
		this.aBoolean478 = arg0;
		this.method5581();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
	private void method5581() {
		@Pc(5) long[] local5 = Class22_Sub5.aLongArray10;
		this.aLong227 = -1L;
		this.aLong227 = this.aLong227 >>> 8 ^ local5[(int) (((long) (this.anInt6570 >> 8) ^ this.aLong227) & 0xFFL)];
		this.aLong227 = this.aLong227 >>> 8 ^ local5[(int) (((long) this.anInt6570 ^ this.aLong227) & 0xFFL)];
		for (@Pc(48) int local48 = 0; local48 < 12; local48++) {
			this.aLong227 = local5[(int) ((this.aLong227 ^ (long) (this.anIntArray833[local48] >> 24)) & 0xFFL)] ^ this.aLong227 >>> 8;
			this.aLong227 = this.aLong227 >>> 8 ^ local5[(int) (((long) (this.anIntArray833[local48] >> 16) ^ this.aLong227) & 0xFFL)];
			this.aLong227 = this.aLong227 >>> 8 ^ local5[(int) (((long) (this.anIntArray833[local48] >> 8) ^ this.aLong227) & 0xFFL)];
			this.aLong227 = local5[(int) (((long) this.anIntArray833[local48] ^ this.aLong227) & 0xFFL)] ^ this.aLong227 >>> 8;
		}
		for (@Pc(149) int local149 = 0; local149 < 5; local149++) {
			this.aLong227 = this.aLong227 >>> 8 ^ local5[(int) ((this.aLong227 ^ (long) this.anIntArray832[local149]) & 0xFFL)];
		}
		this.aLong227 = local5[(int) (((long) (this.aBoolean478 ? 1 : 0) ^ this.aLong227) & 0xFFL)] ^ this.aLong227 >>> 8;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IILclient!qi;Lclient!pe;III)Lclient!sj;")
	public Class31 method5583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class170 arg2, @OriginalArg(3) Class89 arg3, @OriginalArg(4) int arg4) {
		if (this.anInt6557 != -1) {
			return Static132.method2664(this.anInt6557).method4433(arg2, arg3, arg0, arg4, arg1);
		}
		@Pc(25) int local25 = 1024;
		@Pc(33) boolean local33;
		@Pc(44) int local44;
		@Pc(106) int local106;
		@Pc(54) int local54;
		@Pc(110) int local110;
		if (arg2 != null) {
			@Pc(29) boolean local29 = false;
			@Pc(31) boolean local31 = false;
			local33 = false;
			local44 = arg2.anIntArray652[arg4];
			local25 = 1056;
			local54 = local44 >>> 16;
			@Pc(58) int local58 = local44 & 0xFFFF;
			@Pc(62) Class7_Sub1_Sub14 local62 = Static85.method1807(local54);
			if (local62 != null) {
				local31 = local62.method4053(local58) | false;
				local29 = local62.method4058(local58) | false;
				local33 = arg2.aBoolean365 | false;
			}
			if ((arg2.aBoolean364 || Static214.aBoolean327) && arg0 != -1 && arg0 < arg2.anIntArray652.length) {
				local106 = arg2.anIntArray652[arg0];
				local110 = local106 >>> 16;
				@Pc(114) int local114 = local106 & 0xFFFF;
				@Pc(127) Class7_Sub1_Sub14 local127;
				if (local54 == local110) {
					local127 = local62;
				} else {
					local127 = Static85.method1807(local114 >>> 16);
				}
				if (local127 != null) {
					local31 |= local127.method4053(local114);
					local29 |= local127.method4058(local114);
				}
			}
			if (local31) {
				local25 = 1184;
			}
			if (local29) {
				local25 |= 0x100;
			}
			if (local33) {
				local25 |= 0x200;
			}
		}
		@Pc(173) Class103 local173 = Static41.aClass103_12;
		@Pc(184) Class31 local184;
		synchronized (Static41.aClass103_12) {
			local184 = (Class31) Static41.aClass103_12.method2682(this.aLong227);
		}
		if (local184 == null || arg3.method5399(local184.method1912(), local25) != 0) {
			if (local184 != null) {
				local25 = arg3.method5435(local25, local184.method1912());
			}
			local33 = false;
			for (local44 = 0; local44 < 12; local44++) {
				local106 = this.anIntArray833[local44];
				if ((local106 & 0x40000000) == 0) {
					if ((local106 & Integer.MIN_VALUE) != 0 && !Static268.method4487(local106 & 0x3FFFFFFF).method4061()) {
						local33 = true;
					}
				} else if (!Static17.method4472(local106 & 0x3FFFFFFF).method3595(this.aBoolean478)) {
					local33 = true;
				}
			}
			if (local33) {
				return null;
			}
			@Pc(270) Class140[] local270 = new Class140[12];
			@Pc(272) int local272 = 0;
			for (@Pc(274) int local274 = 0; local274 < 12; local274++) {
				local54 = this.anIntArray833[local274];
				@Pc(294) Class140 local294;
				if ((local54 & 0x40000000) != 0) {
					local294 = Static17.method4472(local54 & 0x3FFFFFFF).method3584(this.aBoolean478);
					if (local294 != null) {
						local270[local272++] = local294;
					}
				} else if ((local54 & Integer.MIN_VALUE) != 0) {
					local294 = Static268.method4487(local54 & 0x3FFFFFFF).method4063();
					if (local294 != null) {
						local270[local272++] = local294;
					}
				}
			}
			@Pc(336) Class140 local336 = new Class140(local270, local272);
			@Pc(340) int local340 = local25 | 0x2000;
			local184 = arg3.method5475(local336, local340, Static341.anInt6483, 64, 768);
			for (local110 = 0; local110 < 5; local110++) {
				if (Static314.aShortArrayArray7[local110].length > this.anIntArray832[local110]) {
					local184.method1929(Static310.aShortArray112[local110], Static314.aShortArrayArray7[local110][this.anIntArray832[local110]]);
				}
				if (Static200.aShortArrayArray4[local110].length > this.anIntArray832[local110]) {
					local184.method1929(Static17.aShortArray110[local110], Static200.aShortArrayArray4[local110][this.anIntArray832[local110]]);
				}
			}
			local184.method1908(local25);
			@Pc(406) Class103 local406 = Static41.aClass103_12;
			synchronized (Static41.aClass103_12) {
				Static41.aClass103_12.method2687(local184, this.aLong227);
			}
		}
		if (arg2 == null) {
			return local184;
		} else {
			local184.method1917((byte) 1, local25, true);
			return arg2.method4324(arg1, arg4, arg0, local184, 1024);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BIIIILclient!qi;IILclient!pe;I)Lclient!sj;")
	public Class31 method5584(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class170 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class89 arg7) {
		@Pc(5) int local5 = 1024;
		@Pc(30) int local30;
		@Pc(34) int local34;
		if (arg4 != null) {
			@Pc(9) boolean local9 = false;
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			local5 = 1056;
			local30 = arg4.anIntArray652[arg2];
			local34 = local30 >>> 16;
			@Pc(38) Class7_Sub1_Sub14 local38 = Static85.method1807(local34);
			@Pc(42) int local42 = local30 & 0xFFFF;
			if (local38 != null) {
				local11 = local38.method4053(local42) | false;
				local9 = local38.method4058(local42) | false;
				local13 = arg4.aBoolean365 | false;
			}
			if ((arg4.aBoolean364 || Static214.aBoolean327) && arg6 != -1 && arg6 < arg4.anIntArray652.length) {
				@Pc(86) int local86 = arg4.anIntArray652[arg6];
				@Pc(90) int local90 = local86 >>> 16;
				@Pc(94) int local94 = local86 & 0xFFFF;
				@Pc(107) Class7_Sub1_Sub14 local107;
				if (local90 == local34) {
					local107 = local38;
				} else {
					local107 = Static85.method1807(local94 >>> 16);
				}
				if (local107 != null) {
					local11 |= local107.method4053(local94);
					local9 |= local107.method4058(local94);
				}
			}
			if (local11) {
				local5 = 1184;
			}
			if (local9) {
				local5 |= 0x100;
			}
			if (local13) {
				local5 |= 0x200;
			}
		}
		@Pc(157) long local157 = (long) arg0 | (long) arg1 << 32 | (long) (arg3 << 16);
		@Pc(167) Class103 local167 = Static41.aClass103_12;
		@Pc(175) Class31 local175;
		synchronized (Static41.aClass103_12) {
			local175 = (Class31) Static41.aClass103_12.method2682(local157);
		}
		if (local175 == null || arg7.method5399(local175.method1912(), local5) != 0) {
			if (local175 != null) {
				local5 = arg7.method5435(local5, local175.method1912());
			}
			@Pc(202) Class140[] local202 = new Class140[3];
			@Pc(204) int local204 = 0;
			if (!Static268.method4487(arg0).method4061() || !Static268.method4487(arg3).method4061() || !Static268.method4487(arg1).method4061()) {
				return null;
			}
			@Pc(228) Class140 local228 = Static268.method4487(arg0).method4063();
			if (local228 != null) {
				local204++;
				local202[0] = local228;
			}
			local228 = Static268.method4487(arg3).method4063();
			if (local228 != null) {
				local202[local204++] = local228;
			}
			local228 = Static268.method4487(arg1).method4063();
			if (local228 != null) {
				local202[local204++] = local228;
			}
			local228 = new Class140(local202, local204);
			local30 = local5 | 0x2000;
			local175 = arg7.method5475(local228, local30, Static341.anInt6483, 64, 768);
			for (local34 = 0; local34 < 5; local34++) {
				if (this.anIntArray832[local34] < Static314.aShortArrayArray7[local34].length) {
					local175.method1929(Static310.aShortArray112[local34], Static314.aShortArrayArray7[local34][this.anIntArray832[local34]]);
				}
				if (Static200.aShortArrayArray4[local34].length > this.anIntArray832[local34]) {
					local175.method1929(Static17.aShortArray110[local34], Static200.aShortArrayArray4[local34][this.anIntArray832[local34]]);
				}
			}
			local175.method1908(local5);
			@Pc(341) Class103 local341 = Static41.aClass103_12;
			synchronized (Static41.aClass103_12) {
				Static41.aClass103_12.method2687(local175, local157);
			}
		}
		if (arg4 == null) {
			return local175;
		} else {
			local175 = local175.method1917((byte) 1, local5, true);
			return arg4.method4324(arg5, arg2, arg6, local175, 1024);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIB)V")
	public void method5586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = Static105.anIntArray755[arg1];
		if (this.anIntArray833[local7] != 0 && Static268.method4487(arg0) != null) {
			this.anIntArray833[local7] = Integer.MIN_VALUE | arg0;
			this.method5581();
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!qi;Lclient!pe;II[Lclient!tc;IIILclient!qi;IZI)Lclient!sj;")
	public Class31 method5587(@OriginalArg(1) Class170 arg0, @OriginalArg(2) Class89 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class190[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class170 arg8, @OriginalArg(10) int arg9, @OriginalArg(12) int arg10) {
		if (this.anInt6557 != -1) {
			return Static132.method2664(this.anInt6557).method4445(arg3, arg10, arg5, arg6, arg7, arg0, arg9, arg1, arg2, arg8, arg4);
		}
		@Pc(27) int local27 = arg5;
		@Pc(30) long local30 = this.aLong227;
		@Pc(33) int[] local33 = this.anIntArray833;
		if (arg0 != null && (arg0.anInt4962 >= 0 || arg0.anInt4967 >= 0)) {
			local33 = new int[12];
			for (@Pc(46) int local46 = 0; local46 < 12; local46++) {
				local33[local46] = this.anIntArray833[local46];
			}
			if (arg0.anInt4962 >= 0) {
				if (arg0.anInt4962 == 65535) {
					local33[5] = 0;
					local30 ^= 0xFFFFFFFF00000000L;
				} else {
					local33[5] = arg0.anInt4962 | 0x40000000;
					local30 ^= (long) local33[5] << 32;
				}
			}
			if (arg0.anInt4967 >= 0) {
				if (arg0.anInt4967 == 65535) {
					local33[3] = 0;
					local30 ^= 0xFFFFFFFFL;
				} else {
					local33[3] = arg0.anInt4967 | 0x40000000;
					local30 ^= local33[3];
				}
			}
		}
		@Pc(127) boolean local127 = false;
		@Pc(134) boolean local134 = false;
		@Pc(142) boolean local142 = arg0 != null || arg8 != null;
		@Pc(149) int local149 = arg4 == null ? 0 : arg4.length;
		@Pc(181) int local181;
		@Pc(186) int local186;
		for (@Pc(151) int local151 = 0; local151 < local149; local151++) {
			Static212.aClass7_Sub1_Sub14Array5[local151] = null;
			if (arg4[local151] != null) {
				@Pc(167) Class170 local167 = Static261.method4379(arg4[local151].anInt5765);
				if (local167.anIntArray652 != null) {
					local142 = true;
					Static6.aClass170Array1[local151] = local167;
					local181 = arg4[local151].anInt5759;
					local186 = arg4[local151].anInt5761;
					@Pc(191) int local191 = local167.anIntArray652[local181];
					Static212.aClass7_Sub1_Sub14Array5[local151] = Static85.method1807(local191 >>> 16);
					@Pc(203) int local203 = local191 & 0xFFFF;
					Static147.anIntArray419[local151] = local203;
					if (Static212.aClass7_Sub1_Sub14Array5[local151] != null) {
						local134 |= Static212.aClass7_Sub1_Sub14Array5[local151].method4053(local203);
						local127 |= Static212.aClass7_Sub1_Sub14Array5[local151].method4058(local203);
					}
					if ((local167.aBoolean364 || Static214.aBoolean327) && local186 != -1 && local186 < local167.anIntArray652.length) {
						Static288.anIntArray200[local151] = local167.anIntArray650[local181];
						Static185.anIntArray512[local151] = arg4[local151].anInt5760;
						@Pc(268) int local268 = local167.anIntArray652[local186];
						Static312.aClass7_Sub1_Sub14Array8[local151] = Static85.method1807(local268 >>> 16);
						@Pc(280) int local280 = local268 & 0xFFFF;
						Static13.anIntArray34[local151] = local280;
						if (Static312.aClass7_Sub1_Sub14Array8[local151] != null) {
							local134 |= Static312.aClass7_Sub1_Sub14Array8[local151].method4053(local280);
							local127 |= Static312.aClass7_Sub1_Sub14Array8[local151].method4058(local280);
						}
					} else {
						Static288.anIntArray200[local151] = 0;
						Static185.anIntArray512[local151] = 0;
						Static312.aClass7_Sub1_Sub14Array8[local151] = null;
						Static13.anIntArray34[local151] = -1;
					}
				}
			}
		}
		@Pc(329) int local329 = -1;
		local181 = -1;
		local186 = 0;
		@Pc(335) Class7_Sub1_Sub14 local335 = null;
		@Pc(337) Class7_Sub1_Sub14 local337 = null;
		@Pc(339) int local339 = -1;
		@Pc(341) int local341 = -1;
		@Pc(343) int local343 = 0;
		@Pc(345) Class7_Sub1_Sub14 local345 = null;
		@Pc(347) Class7_Sub1_Sub14 local347 = null;
		if (local142) {
			local27 = arg5 | 0x20;
			@Pc(364) int local364;
			@Pc(420) int local420;
			if (arg0 != null) {
				local329 = arg0.anIntArray652[arg9];
				local364 = local329 >>> 16;
				local335 = Static85.method1807(local364);
				local329 &= 0xFFFF;
				if (local335 != null) {
					local134 |= local335.method4053(local329);
					local127 |= local335.method4058(local329);
				}
				if ((arg0.aBoolean364 || Static214.aBoolean327) && arg6 != -1 && arg0.anIntArray652.length > arg6) {
					local181 = arg0.anIntArray652[arg6];
					local186 = arg0.anIntArray650[arg9];
					local420 = local181 >>> 16;
					local181 &= 0xFFFF;
					if (local364 == local420) {
						local337 = local335;
					} else {
						local337 = Static85.method1807(local181 >>> 16);
					}
					if (local337 != null) {
						local134 |= local337.method4053(local181);
						local127 |= local337.method4058(local181);
					}
				}
			}
			if (arg8 != null) {
				local339 = arg8.anIntArray652[arg10];
				local364 = local339 >>> 16;
				local345 = Static85.method1807(local364);
				local339 &= 0xFFFF;
				if (local345 != null) {
					local134 |= local345.method4053(local339);
					local127 |= local345.method4058(local339);
				}
				if ((arg8.aBoolean364 || Static214.aBoolean327) && arg3 != -1 && arg8.anIntArray652.length > arg3) {
					local343 = arg8.anIntArray650[arg10];
					local341 = arg8.anIntArray652[arg3];
					local420 = local341 >>> 16;
					local341 &= 0xFFFF;
					if (local420 == local364) {
						local347 = local345;
					} else {
						local347 = Static85.method1807(local341 >>> 16);
					}
					if (local347 != null) {
						local134 |= local347.method4053(local341);
						local127 |= local347.method4058(local341);
					}
				}
			}
			if (local134) {
				local27 |= 0x80;
			}
			if (local127) {
				local27 |= 0x100;
			}
		}
		@Pc(567) Class103 local567 = Static283.aClass103_59;
		@Pc(575) Class31 local575;
		synchronized (Static283.aClass103_59) {
			local575 = (Class31) Static283.aClass103_59.method2682(local30);
		}
		@Pc(583) Class79 local583 = null;
		if (this.anInt6570 != -1) {
			local583 = Static136.method2691(this.anInt6570);
		}
		@Pc(622) int local622;
		@Pc(627) int local627;
		if (local575 == null || arg1.method5399(local575.method1912(), local27) != 0 || local583 != null && local583.anIntArrayArray21 != null && this.anIntArrayArray57 == null) {
			if (local575 != null) {
				local27 = arg1.method5435(local27, local575.method1912());
			}
			@Pc(620) boolean local620 = false;
			local622 = 0;
			while (true) {
				if (local622 >= 12) {
					if (local620) {
						if (this.aLong228 != -1L) {
							@Pc(1247) Class103 local1247 = Static283.aClass103_59;
							synchronized (Static283.aClass103_59) {
								local575 = (Class31) Static283.aClass103_59.method2682(this.aLong228);
							}
						}
						if (local575 == null || arg1.method5399(local575.method1912(), local27) != 0 || local583 != null && local583.anIntArrayArray21 != null && this.anIntArrayArray57 == null) {
							return null;
						}
					} else {
						@Pc(672) Class140[] local672 = new Class140[12];
						@Pc(679) int local679;
						for (@Pc(674) int local674 = 0; local674 < 12; local674++) {
							local679 = local33[local674];
							@Pc(698) Class140 local698;
							if ((local679 & 0x40000000) != 0) {
								local698 = Static17.method4472(local679 & 0x3FFFFFFF).method3585(this.aBoolean478);
								if (local698 != null) {
									local672[local674] = local698;
								}
							} else if ((local679 & Integer.MIN_VALUE) != 0) {
								local698 = Static268.method4487(local679 & 0x3FFFFFFF).method4060();
								if (local698 != null) {
									local672[local674] = local698;
								}
							}
						}
						@Pc(750) int local750;
						if (local583 != null && local583.anIntArrayArray21 != null) {
							for (local679 = 0; local679 < local583.anIntArrayArray21.length; local679++) {
								if (local583.anIntArrayArray21[local679] != null && local672[local679] != null) {
									local750 = local583.anIntArrayArray21[local679][0];
									@Pc(757) int local757 = local583.anIntArrayArray21[local679][1];
									@Pc(764) int local764 = local583.anIntArrayArray21[local679][2];
									@Pc(773) int local773 = local583.anIntArrayArray21[local679][3] << 3;
									@Pc(782) int local782 = local583.anIntArrayArray21[local679][4] << 3;
									@Pc(791) int local791 = local583.anIntArrayArray21[local679][5] << 3;
									if (this.anIntArrayArray57 == null) {
										this.anIntArrayArray57 = new int[local583.anIntArrayArray21.length][];
									}
									if (this.anIntArrayArray57[local679] == null) {
										@Pc(813) int[] local813 = this.anIntArrayArray57[local679] = new int[15];
										if (local773 == 0 && local782 == 0 && local791 == 0) {
											local813[13] = -local757;
											local813[0] = local813[4] = local813[8] = 32768;
											local813[12] = -local750;
											local813[14] = -local764;
										} else {
											@Pc(854) int local854 = Class147.anIntArray603[local773];
											@Pc(858) int local858 = Class147.anIntArray604[local773];
											@Pc(862) int local862 = Class147.anIntArray603[local782];
											@Pc(866) int local866 = Class147.anIntArray604[local782];
											@Pc(870) int local870 = Class147.anIntArray603[local791];
											@Pc(874) int local874 = Class147.anIntArray604[local791];
											@Pc(882) int local882 = local858 * local870 + 16384 >> 15;
											@Pc(890) int local890 = local874 * local858 + 16384 >> 15;
											local813[5] = -local858;
											local813[0] = local890 * local866 + local870 * local862 + 16384 >> 15;
											local813[8] = local854 * local862 + 16384 >> 15;
											local813[2] = local854 * local866 + 16384 >> 15;
											local813[3] = local874 * local854 + 16384 >> 15;
											local813[4] = local854 * local870 + 16384 >> 15;
											local813[1] = -local874 * local862 + local882 * local866 + 16384 >> 15;
											local813[7] = local862 * local882 + -local874 * -local866 + 16384 >> 15;
											local813[6] = local862 * local890 + local870 * -local866 + 16384 >> 15;
											local813[12] = local813[6] * -local764 + local813[3] * -local757 + local813[0] * -local750 + 16384 >> 15;
											local813[13] = local813[7] * -local764 + local813[1] * -local750 + -local757 * local813[4] + 16384 >> 15;
											local813[14] = -local764 * local813[8] + local813[5] * -local757 + local813[2] * -local750 + 16384 >> 15;
										}
										local813[11] = local764;
										local813[10] = local757;
										local813[9] = local750;
									}
									if (local773 != 0 || local782 != 0 || local791 != 0) {
										local672[local679].method3682(local791, local782, local773);
									}
									if (local750 != 0 || local757 != 0 || local764 != 0) {
										local672[local679].method3684(local764, local750, local757);
									}
								}
							}
						}
						@Pc(1140) int local1140 = local27 | 0x2000;
						@Pc(1147) Class140 local1147 = new Class140(local672, local672.length);
						local575 = arg1.method5475(local1147, local1140, Static341.anInt6483, 64, 850);
						for (local750 = 0; local750 < 5; local750++) {
							if (this.anIntArray832[local750] < Static314.aShortArrayArray7[local750].length) {
								local575.method1929(Static310.aShortArray112[local750], Static314.aShortArrayArray7[local750][this.anIntArray832[local750]]);
							}
							if (this.anIntArray832[local750] < Static200.aShortArrayArray4[local750].length) {
								local575.method1929(Static17.aShortArray110[local750], Static200.aShortArrayArray4[local750][this.anIntArray832[local750]]);
							}
						}
						local575.method1908(local27);
						@Pc(1221) Class103 local1221 = Static283.aClass103_59;
						synchronized (Static283.aClass103_59) {
							Static283.aClass103_59.method2687(local575, local30);
						}
						this.aLong228 = local30;
					}
					break;
				}
				local627 = local33[local622];
				if ((local627 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local627) != 0 && !Static268.method4487(local627 & 0x3FFFFFFF).method4062()) {
						local620 = true;
					}
				} else if (!Static17.method4472(local627 & 0x3FFFFFFF).method3594(this.aBoolean478)) {
					local620 = true;
				}
				local622++;
			}
		}
		@Pc(1289) Class31 local1289 = local575.method1917((byte) 1, local27, true);
		if (!local142) {
			return local1289;
		}
		@Pc(1295) int local1295 = 0;
		local622 = 1;
		while (local1295 < local149) {
			if (Static212.aClass7_Sub1_Sub14Array5[local1295] != null) {
				local1289.method1945(Static212.aClass7_Sub1_Sub14Array5[local1295], Static288.anIntArray200[local1295], Static147.anIntArray419[local1295], Static312.aClass7_Sub1_Sub14Array8[local1295], false, Static13.anIntArray34[local1295], local622, this.anIntArrayArray57 == null ? null : this.anIntArrayArray57[local1295], Static185.anIntArray512[local1295] - 1);
			}
			local622 <<= 0x1;
			local1295++;
		}
		if (local335 != null && local345 != null) {
			local1289.method1946(local339, false, arg7 - 1, local335, arg2 - 1, local347, arg0.aBooleanArray23, local181, local186, local341, local343, local337, local329, local345);
		} else if (local335 != null) {
			local1289.method1931(arg2 - 1, local335, local186, local337, local181, local329, false, 0);
		} else if (local345 != null) {
			local1289.method1931(arg7 - 1, local345, local343, local347, local341, local339, false, 0);
		}
		for (local627 = 0; local627 < local149; local627++) {
			Static212.aClass7_Sub1_Sub14Array5[local627] = null;
			Static312.aClass7_Sub1_Sub14Array8[local627] = null;
			Static6.aClass170Array1[local627] = null;
		}
		return local1289;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(III)V")
	public void method5589(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray832[arg0] = arg1;
		this.method5581();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Z[II[III)V")
	public void method5590(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		if (arg4 != this.anInt6570) {
			this.anIntArrayArray57 = null;
			this.anInt6570 = arg4;
		}
		if (arg3 == null) {
			arg3 = new int[12];
			for (@Pc(26) int local26 = 0; local26 < 8; local26++) {
				for (@Pc(29) int local29 = 0; local29 < Static330.anInt6243; local29++) {
					@Pc(36) Class153 local36 = Static268.method4487(local29);
					if (local36 != null && !local36.aBoolean342 && (arg0 ? Static285.anIntArray709[local26] : Static231.anIntArray619[local26]) == local36.anInt4614) {
						arg3[Static105.anIntArray755[local26]] = Integer.MIN_VALUE | local29;
						break;
					}
				}
			}
		}
		this.aBoolean478 = arg0;
		this.anIntArray832 = arg1;
		this.anInt6557 = arg2;
		this.anIntArray833 = arg3;
		this.method5581();
	}
}
