import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class194 {

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
	private int anInt5061;

	@OriginalMember(owner = "client!kn", name = "j", descriptor = "[I")
	private int[] anIntArray346;

	@OriginalMember(owner = "client!kn", name = "k", descriptor = "[I")
	public int[] anIntArray347;

	@OriginalMember(owner = "client!kn", name = "m", descriptor = "J")
	private long aLong129;

	@OriginalMember(owner = "client!kn", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!kn", name = "q", descriptor = "Z")
	public boolean aBoolean400;

	@OriginalMember(owner = "client!kn", name = "t", descriptor = "J")
	private long aLong130;

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
	public int anInt5062 = -1;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "([IZIIB[I)V")
	public void method4214(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4) {
		if (this.anInt5061 != arg2) {
			this.anIntArrayArray31 = null;
			this.anInt5061 = arg2;
		}
		this.anIntArray346 = arg0;
		this.anIntArray347 = arg4;
		this.aBoolean400 = arg1;
		this.anInt5062 = arg3;
		this.method4215();
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V")
	private void method4215() {
		this.aLong129 = -1L;
		@Pc(10) long[] local10 = Class223.aLongArray8;
		this.aLong129 = local10[(int) (((long) (this.anInt5061 >> 8) ^ this.aLong129) & 0xFFL)] ^ this.aLong129 >>> 8;
		this.aLong129 = this.aLong129 >>> 8 ^ local10[(int) (((long) this.anInt5061 ^ this.aLong129) & 0xFFL)];
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong129 = local10[(int) (((long) (this.anIntArray346[local50] >> 24) ^ this.aLong129) & 0xFFL)] ^ this.aLong129 >>> 8;
			this.aLong129 = this.aLong129 >>> 8 ^ local10[(int) ((this.aLong129 ^ (long) (this.anIntArray346[local50] >> 16)) & 0xFFL)];
			this.aLong129 = local10[(int) (((long) (this.anIntArray346[local50] >> 8) ^ this.aLong129) & 0xFFL)] ^ this.aLong129 >>> 8;
			this.aLong129 = this.aLong129 >>> 8 ^ local10[(int) (((long) this.anIntArray346[local50] ^ this.aLong129) & 0xFFL)];
		}
		for (@Pc(150) int local150 = 0; local150 < 5; local150++) {
			this.aLong129 = this.aLong129 >>> 8 ^ local10[(int) (((long) this.anIntArray347[local150] ^ this.aLong129) & 0xFFL)];
		}
		this.aLong129 = this.aLong129 >>> 8 ^ local10[(int) ((this.aLong129 ^ (long) (this.aBoolean400 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)V")
	public void method4216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray347[arg1] = arg0;
		this.method4215();
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILclient!hl;IIIBLclient!dr;ILclient!r;IILclient!cn;)Lclient!da;")
	public Class66 method4219(@OriginalArg(0) int arg0, @OriginalArg(1) Class140 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class84 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class100 arg7, @OriginalArg(9) int arg8, @OriginalArg(11) Class57 arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(97) int local97;
		@Pc(38) int local38;
		if (arg5 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			@Pc(28) int local28 = arg5.anIntArray108[arg8];
			local7 = 2080;
			local38 = local28 >>> 16;
			@Pc(42) int local42 = local28 & 0xFFFF;
			@Pc(47) Class2_Sub3_Sub19 local47 = arg1.method3286(local38);
			if (local47 != null) {
				local13 = local47.method7770(local42) | false;
				local11 = local47.method7768(local42) | false;
				local17 = local47.method7771(local42) | false;
				local15 = arg5.aBoolean184 | false;
			}
			if ((arg5.aBoolean186 || Static564.aBoolean711) && arg3 != -1 && arg3 < arg5.anIntArray108.length) {
				local97 = arg5.anIntArray108[arg3];
				@Pc(101) int local101 = local97 >>> 16;
				@Pc(105) int local105 = local97 & 0xFFFF;
				@Pc(119) Class2_Sub3_Sub19 local119;
				if (local101 == local38) {
					local119 = local47;
				} else {
					local119 = arg1.method3286(local105 >>> 16);
				}
				if (local119 != null) {
					local13 |= local119.method7770(local105);
					local11 |= local119.method7768(local105);
					local17 |= local119.method7771(local105);
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
		@Pc(182) long local182 = (long) (arg4 << 16) | (long) arg6 << 32 | (long) arg0;
		@Pc(184) Class313 local184 = Static6.aClass313_3;
		@Pc(192) Class66 local192;
		synchronized (Static6.aClass313_3) {
			local192 = (Class66) Static6.aClass313_3.method6989(local182);
		}
		if (local192 == null || arg7.method6216(local192.PA(), local7) != 0) {
			if (local192 != null) {
				local7 = arg7.method6215(local7, local192.PA());
			}
			@Pc(219) Class93[] local219 = new Class93[3];
			local97 = 0;
			if (!arg9.method1129(arg0).method1492() || !arg9.method1129(arg4).method1492() || !arg9.method1129(arg6).method1492()) {
				return null;
			}
			@Pc(251) Class93 local251 = arg9.method1129(arg0).method1490();
			if (local251 != null) {
				local97++;
				local219[0] = local251;
			}
			local251 = arg9.method1129(arg4).method1490();
			if (local251 != null) {
				local219[local97++] = local251;
			}
			local251 = arg9.method1129(arg6).method1490();
			if (local251 != null) {
				local219[local97++] = local251;
			}
			local251 = new Class93(local219, local97);
			@Pc(296) int local296 = local7 | 0x4000;
			local192 = arg7.method6191(local251, local296, Static135.anInt2838, 64, 768);
			for (@Pc(306) int local306 = 0; local306 < 5; local306++) {
				for (local38 = 0; local38 < Static65.aShortArrayArrayArray1.length; local38++) {
					if (Static65.aShortArrayArrayArray1[local38][local306].length > this.anIntArray347[local306]) {
						local192.d(Static315.aShortArrayArray31[local38][local306], Static65.aShortArrayArrayArray1[local38][local306][this.anIntArray347[local306]]);
					}
				}
			}
			local192.SA(local7);
			@Pc(356) Class313 local356 = Static6.aClass313_3;
			synchronized (Static6.aClass313_3) {
				Static6.aClass313_3.method6980(local182, local192);
			}
		}
		if (arg5 == null) {
			return local192;
		} else {
			local192 = local192.method7551((byte) 4, local7, true);
			return arg5.method1510(arg8, 2048, arg2, arg3, local192);
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!cn;Lclient!hl;ILclient!mf;Lclient!dr;Lclient!lb;[Lclient!an;Lclient!haa;IILclient!dr;IIILclient!wca;Lclient!r;IZB)Lclient!da;")
	public Class66 method4220(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class140 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class218 arg3, @OriginalArg(4) Class84 arg4, @OriginalArg(5) Class202 arg5, @OriginalArg(6) Class19[] arg6, @OriginalArg(7) Interface9 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class84 arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) Class354 arg14, @OriginalArg(15) Class100 arg15, @OriginalArg(16) int arg16) {
		if (this.anInt5062 != -1) {
			return arg5.method4488(this.anInt5062).method1574(arg11, arg16, arg12, arg14, arg9, arg8, arg10, arg13, arg4, arg1, arg2, arg6, arg15, arg7);
		}
		@Pc(35) int local35 = arg2;
		@Pc(38) long local38 = this.aLong129;
		@Pc(41) int[] local41 = this.anIntArray346;
		if (arg4 != null && (arg4.anInt2057 >= 0 || arg4.anInt2070 >= 0)) {
			local41 = new int[12];
			for (@Pc(57) int local57 = 0; local57 < 12; local57++) {
				local41[local57] = this.anIntArray346[local57];
			}
			if (arg4.anInt2057 >= 0) {
				if (arg4.anInt2057 == 65535) {
					local38 ^= 0xFFFFFFFF00000000L;
					local41[5] = 0;
				} else {
					local41[5] = arg4.anInt2057 | 0x40000000;
					local38 ^= (long) local41[5] << 32;
				}
			}
			if (arg4.anInt2070 >= 0) {
				if (arg4.anInt2070 == 65535) {
					local41[3] = 0;
					local38 ^= 0xFFFFFFFFL;
				} else {
					local41[3] = arg4.anInt2070 | 0x40000000;
					local38 ^= local41[3];
				}
			}
		}
		@Pc(141) boolean local141 = false;
		@Pc(143) boolean local143 = false;
		@Pc(145) boolean local145 = false;
		@Pc(153) boolean local153 = arg4 != null || arg10 != null;
		@Pc(160) int local160 = arg6 == null ? 0 : arg6.length;
		@Pc(196) int local196;
		@Pc(201) int local201;
		for (@Pc(162) int local162 = 0; local162 < local160; local162++) {
			Static538.aClass2_Sub3_Sub19Array6[local162] = null;
			if (arg6[local162] != null) {
				@Pc(182) Class84 local182 = arg1.method3287(arg6[local162].anInt495);
				if (local182.anIntArray108 != null) {
					local153 = true;
					Static20.aClass84Array3[local162] = local182;
					local196 = arg6[local162].anInt496;
					local201 = arg6[local162].anInt498;
					@Pc(206) int local206 = local182.anIntArray108[local196];
					Static538.aClass2_Sub3_Sub19Array6[local162] = arg1.method3286(local206 >>> 16);
					@Pc(219) int local219 = local206 & 0xFFFF;
					Static433.anIntArray501[local162] = local219;
					if (Static538.aClass2_Sub3_Sub19Array6[local162] != null) {
						local143 |= Static538.aClass2_Sub3_Sub19Array6[local162].method7770(local219);
						local141 |= Static538.aClass2_Sub3_Sub19Array6[local162].method7768(local219);
						local145 |= Static538.aClass2_Sub3_Sub19Array6[local162].method7771(local219);
					}
					if ((local182.aBoolean186 || Static564.aBoolean711) && local201 != -1 && local201 < local182.anIntArray108.length) {
						Static210.anIntArray253[local162] = local182.anIntArray110[local196];
						Static531.anIntArray633[local162] = arg6[local162].anInt494;
						@Pc(287) int local287 = local182.anIntArray108[local201];
						Static21.aClass2_Sub3_Sub19Array1[local162] = arg1.method3286(local287 >>> 16);
						@Pc(300) int local300 = local287 & 0xFFFF;
						Static510.anIntArray607[local162] = local300;
						if (Static21.aClass2_Sub3_Sub19Array1[local162] != null) {
							local143 |= Static21.aClass2_Sub3_Sub19Array1[local162].method7770(local300);
							local141 |= Static21.aClass2_Sub3_Sub19Array1[local162].method7768(local300);
							local145 |= Static21.aClass2_Sub3_Sub19Array1[local162].method7771(local300);
						}
					} else {
						Static210.anIntArray253[local162] = 0;
						Static531.anIntArray633[local162] = 0;
						Static21.aClass2_Sub3_Sub19Array1[local162] = null;
						Static510.anIntArray607[local162] = -1;
					}
				}
			}
		}
		@Pc(363) int local363 = -1;
		local196 = -1;
		local201 = 0;
		@Pc(369) Class2_Sub3_Sub19 local369 = null;
		@Pc(371) Class2_Sub3_Sub19 local371 = null;
		@Pc(373) int local373 = -1;
		@Pc(375) int local375 = -1;
		@Pc(377) int local377 = 0;
		@Pc(379) Class2_Sub3_Sub19 local379 = null;
		@Pc(386) Class2_Sub3_Sub19 local386 = null;
		if (local153) {
			@Pc(399) int local399;
			@Pc(465) int local465;
			if (arg4 != null) {
				local363 = arg4.anIntArray108[arg11];
				local399 = local363 >>> 16;
				local369 = arg1.method3286(local399);
				local363 &= 0xFFFF;
				if (local369 != null) {
					local143 |= local369.method7770(local363);
					local141 |= local369.method7768(local363);
					local145 |= local369.method7771(local363);
				}
				if ((arg4.aBoolean186 || Static564.aBoolean711) && arg12 != -1 && arg12 < arg4.anIntArray108.length) {
					local196 = arg4.anIntArray108[arg12];
					local201 = arg4.anIntArray110[arg11];
					local465 = local196 >>> 16;
					local196 &= 0xFFFF;
					local371 = local399 == local465 ? local369 : arg1.method3286(local465);
					if (local371 != null) {
						local143 |= local371.method7770(local196);
						local141 |= local371.method7768(local196);
						local145 |= local371.method7771(local196);
					}
				}
			}
			local35 = arg2 | 0x20;
			if (arg10 != null) {
				local373 = arg10.anIntArray108[arg13];
				local399 = local373 >>> 16;
				local379 = arg1.method3286(local399);
				local373 &= 0xFFFF;
				if (local379 != null) {
					local143 |= local379.method7770(local373);
					local141 |= local379.method7768(local373);
					local145 |= local379.method7771(local373);
				}
				if ((arg10.aBoolean186 || Static564.aBoolean711) && arg9 != -1 && arg9 < arg10.anIntArray108.length) {
					local375 = arg10.anIntArray108[arg9];
					local377 = arg10.anIntArray110[arg13];
					local465 = local375 >>> 16;
					local386 = local399 == local465 ? local379 : arg1.method3286(local465);
					local375 &= 0xFFFF;
					if (local386 != null) {
						local143 |= local386.method7770(local375);
						local141 |= local386.method7768(local375);
						local145 |= local386.method7771(local375);
					}
				}
			}
			if (local143) {
				local35 |= 0x80;
			}
			if (local141) {
				local35 |= 0x100;
			}
			if (local145) {
				local35 |= 0x400;
			}
		}
		@Pc(637) Class313 local637 = Static30.aClass313_7;
		@Pc(645) Class66 local645;
		synchronized (Static30.aClass313_7) {
			local645 = (Class66) Static30.aClass313_7.method6989(local38);
		}
		@Pc(653) Class54 local653 = null;
		if (this.anInt5061 != -1) {
			local653 = arg14.method7795(this.anInt5061);
		}
		@Pc(693) int local693;
		@Pc(699) int local699;
		if (local645 == null || arg15.method6216(local645.PA(), local35) != 0 || local653 != null && local653.anIntArrayArray2 != null && this.anIntArrayArray31 == null) {
			if (local645 != null) {
				local35 = arg15.method6215(local35, local645.PA());
			}
			@Pc(691) boolean local691 = false;
			local693 = 0;
			while (true) {
				if (local693 >= 12) {
					if (local691) {
						if (this.aLong130 != -1L) {
							@Pc(1330) Class313 local1330 = Static30.aClass313_7;
							synchronized (Static30.aClass313_7) {
								local645 = (Class66) Static30.aClass313_7.method6989(this.aLong130);
							}
						}
						if (local645 == null || arg15.method6216(local645.PA(), local35) != 0 || local653 != null && local653.anIntArrayArray2 != null && this.anIntArrayArray31 == null) {
							return null;
						}
					} else {
						@Pc(748) Class93[] local748 = new Class93[12];
						@Pc(756) int local756;
						for (@Pc(750) int local750 = 0; local750 < 12; local750++) {
							local756 = local41[local750];
							@Pc(773) Class93 local773;
							if ((local756 & 0x40000000) != 0) {
								local773 = arg3.method5067(local756 & 0x3FFFFFFF).method7468(this.aBoolean400);
								if (local773 != null) {
									local748[local750] = local773;
								}
							} else if ((Integer.MIN_VALUE & local756) != 0) {
								local773 = arg0.method1129(local756 & 0x3FFFFFFF).method1486();
								if (local773 != null) {
									local748[local750] = local773;
								}
							}
						}
						@Pc(838) int local838;
						@Pc(831) int local831;
						if (local653 != null && local653.anIntArrayArray2 != null) {
							for (local756 = 0; local756 < local653.anIntArrayArray2.length; local756++) {
								if (local653.anIntArrayArray2[local756] != null && local748[local756] != null) {
									local831 = local653.anIntArrayArray2[local756][0];
									local838 = local653.anIntArrayArray2[local756][1];
									@Pc(845) int local845 = local653.anIntArrayArray2[local756][2];
									@Pc(854) int local854 = local653.anIntArrayArray2[local756][3] << 3;
									@Pc(863) int local863 = local653.anIntArrayArray2[local756][4] << 3;
									@Pc(872) int local872 = local653.anIntArrayArray2[local756][5] << 3;
									if (this.anIntArrayArray31 == null) {
										this.anIntArrayArray31 = new int[local653.anIntArrayArray2.length][];
									}
									if (this.anIntArrayArray31[local756] == null) {
										@Pc(894) int[] local894 = this.anIntArrayArray31[local756] = new int[15];
										if (local854 == 0 && local863 == 0 && local872 == 0) {
											local894[13] = -local838;
											local894[0] = local894[4] = local894[8] = 32768;
											local894[14] = -local845;
											local894[12] = -local831;
										} else {
											@Pc(936) int local936 = Class363.anIntArray698[local854];
											@Pc(940) int local940 = Class363.anIntArray697[local854];
											@Pc(944) int local944 = Class363.anIntArray698[local863];
											@Pc(948) int local948 = Class363.anIntArray697[local863];
											@Pc(952) int local952 = Class363.anIntArray698[local872];
											@Pc(956) int local956 = Class363.anIntArray697[local872];
											@Pc(964) int local964 = local940 * local952 + 8192 >> 14;
											@Pc(972) int local972 = local940 * local956 + 8192 >> 14;
											local894[4] = local952 * local936 + 8192 >> 14;
											local894[1] = local944 * -local956 + local948 * local964 + 8192 >> 14;
											local894[7] = -local956 * -local948 + local964 * local944 + 8192 >> 14;
											local894[6] = local952 * -local948 + local972 * local944 + 8192 >> 14;
											local894[8] = local944 * local936 + 8192 >> 14;
											local894[2] = local936 * local948 + 8192 >> 14;
											local894[5] = -local940;
											local894[0] = local952 * local944 + local972 * local948 + 8192 >> 14;
											local894[3] = local936 * local956 + 8192 >> 14;
											local894[13] = -local845 * local894[7] + local894[1] * -local831 + local894[4] * -local838 + 8192 >> 14;
											local894[12] = -local845 * local894[6] + local894[3] * -local838 + local894[0] * -local831 + 8192 >> 14;
											local894[14] = local894[8] * -local845 + -local831 * local894[2] + local894[5] * -local838 + 8192 >> 14;
										}
										local894[11] = local845;
										local894[10] = local838;
										local894[9] = local831;
									}
									if (local854 != 0 || local863 != 0 || local872 != 0) {
										local748[local756].method1762(local854, local872, local863);
									}
									if (local831 != 0 || local838 != 0 || local845 != 0) {
										local748[local756].method1752(local845, local831, local838);
									}
								}
							}
						}
						@Pc(1228) int local1228 = local35 | 0x4000;
						@Pc(1235) Class93 local1235 = new Class93(local748, local748.length);
						local645 = arg15.method6191(local1235, local1228, Static135.anInt2838, 64, 850);
						for (local831 = 0; local831 < 5; local831++) {
							for (local838 = 0; local838 < Static65.aShortArrayArrayArray1.length; local838++) {
								if (this.anIntArray347[local831] < Static65.aShortArrayArrayArray1[local838][local831].length) {
									local645.d(Static315.aShortArrayArray31[local838][local831], Static65.aShortArrayArrayArray1[local838][local831][this.anIntArray347[local831]]);
								}
							}
						}
						local645.SA(local35);
						@Pc(1305) Class313 local1305 = Static30.aClass313_7;
						synchronized (Static30.aClass313_7) {
							Static30.aClass313_7.method6980(local38, local645);
						}
						this.aLong130 = local38;
					}
					break;
				}
				local699 = local41[local693];
				if ((local699 & 0x40000000) == 0) {
					if ((local699 & Integer.MIN_VALUE) != 0 && !arg0.method1129(local699 & 0x3FFFFFFF).method1489()) {
						local691 = true;
					}
				} else if (!arg3.method5067(local699 & 0x3FFFFFFF).method7483(this.aBoolean400)) {
					local691 = true;
				}
				local693++;
			}
		}
		@Pc(1369) Class66 local1369 = local645.method7551((byte) 4, local35, true);
		if (!local153) {
			return local1369;
		}
		@Pc(1375) int local1375 = 0;
		local693 = 1;
		while (local160 > local1375) {
			if (Static538.aClass2_Sub3_Sub19Array6[local1375] != null) {
				local1369.method7560(Static21.aClass2_Sub3_Sub19Array1[local1375], Static531.anIntArray633[local1375] - 1, Static433.anIntArray501[local1375], this.anIntArrayArray31 == null ? null : this.anIntArrayArray31[local1375], local693, Static510.anIntArray607[local1375], false, Static210.anIntArray253[local1375], Static538.aClass2_Sub3_Sub19Array6[local1375]);
			}
			local693 <<= 0x1;
			local1375++;
		}
		if (local369 != null && local379 != null) {
			local1369.method7563(local371, local363, local386, arg8 - 1, local196, local379, local377, arg4.aBooleanArray10, arg16 - 1, local201, false, local373, local369, local375);
		} else if (local369 != null) {
			local1369.method7559(false, local369, local196, local363, local371, arg8 - 1, 0, local201);
		} else if (local379 != null) {
			local1369.method7559(false, local379, local375, local373, local386, arg16 - 1, 0, local377);
		}
		for (local699 = 0; local699 < local160; local699++) {
			Static538.aClass2_Sub3_Sub19Array6[local699] = null;
			Static21.aClass2_Sub3_Sub19Array1[local699] = null;
			Static20.aClass84Array3[local699] = null;
		}
		return local1369;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IILclient!haa;Lclient!dr;ILclient!mf;ILclient!hl;ILclient!lb;Lclient!cn;Lclient!r;)Lclient!da;")
	public Class66 method4221(@OriginalArg(0) int arg0, @OriginalArg(2) Interface9 arg1, @OriginalArg(3) Class84 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class218 arg4, @OriginalArg(7) Class140 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class202 arg7, @OriginalArg(10) Class57 arg8, @OriginalArg(11) Class100 arg9) {
		if (this.anInt5062 != -1) {
			return arg7.method4488(this.anInt5062).method1575(arg1, arg2, arg6, arg5, arg0, arg9, arg3);
		}
		@Pc(33) int local33 = 2048;
		@Pc(41) boolean local41;
		@Pc(56) int local56;
		@Pc(126) int local126;
		@Pc(64) int local64;
		@Pc(130) int local130;
		if (arg2 != null) {
			@Pc(37) boolean local37 = false;
			@Pc(39) boolean local39 = false;
			local41 = false;
			@Pc(43) boolean local43 = false;
			local56 = arg2.anIntArray108[arg3];
			local33 = 2080;
			local64 = local56 >>> 16;
			@Pc(68) int local68 = local56 & 0xFFFF;
			@Pc(75) Class2_Sub3_Sub19 local75 = arg5.method3286(local64);
			if (local75 != null) {
				local39 = local75.method7770(local68) | false;
				local37 = local75.method7768(local68) | false;
				local43 = local75.method7771(local68) | false;
				local41 = arg2.aBoolean184 | false;
			}
			if ((arg2.aBoolean186 || Static564.aBoolean711) && arg6 != -1 && arg2.anIntArray108.length > arg6) {
				local126 = arg2.anIntArray108[arg6];
				local130 = local126 >>> 16;
				@Pc(140) Class2_Sub3_Sub19 local140 = local64 == local130 ? local75 : arg5.method3286(local130);
				@Pc(144) int local144 = local126 & 0xFFFF;
				if (local140 != null) {
					local39 |= local140.method7770(local144);
					local37 |= local140.method7768(local144);
					local43 |= local140.method7771(local144);
				}
			}
			if (local39) {
				local33 = 2208;
			}
			if (local37) {
				local33 |= 0x100;
			}
			if (local41) {
				local33 |= 0x200;
			}
			if (local43) {
				local33 |= 0x400;
			}
		}
		@Pc(195) Class313 local195 = Static6.aClass313_3;
		@Pc(204) Class66 local204;
		synchronized (Static6.aClass313_3) {
			local204 = (Class66) Static6.aClass313_3.method6989(this.aLong129);
		}
		if (local204 == null || arg9.method6216(local204.PA(), local33) != 0) {
			if (local204 != null) {
				local33 = arg9.method6215(local33, local204.PA());
			}
			local41 = false;
			for (@Pc(232) int local232 = 0; local232 < 12; local232++) {
				local56 = this.anIntArray346[local232];
				if ((local56 & 0x40000000) == 0) {
					if ((local56 & Integer.MIN_VALUE) != 0 && !arg8.method1129(local56 & 0x3FFFFFFF).method1492()) {
						local41 = true;
					}
				} else if (!arg4.method5067(local56 & 0x3FFFFFFF).method7470(this.aBoolean400)) {
					local41 = true;
				}
			}
			if (local41) {
				return null;
			}
			@Pc(284) Class93[] local284 = new Class93[12];
			local126 = 0;
			for (@Pc(288) int local288 = 0; local288 < 12; local288++) {
				@Pc(295) int local295 = this.anIntArray346[local288];
				@Pc(313) Class93 local313;
				if ((local295 & 0x40000000) != 0) {
					local313 = arg4.method5067(local295 & 0x3FFFFFFF).method7480(this.aBoolean400);
					if (local313 != null) {
						local284[local126++] = local313;
					}
				} else if ((local295 & Integer.MIN_VALUE) != 0) {
					local313 = arg8.method1129(local295 & 0x3FFFFFFF).method1490();
					if (local313 != null) {
						local284[local126++] = local313;
					}
				}
			}
			@Pc(352) int local352 = local33 | 0x4000;
			@Pc(358) Class93 local358 = new Class93(local284, local126);
			local204 = arg9.method6191(local358, local352, Static135.anInt2838, 64, 768);
			for (local64 = 0; local64 < 5; local64++) {
				for (local130 = 0; local130 < Static65.aShortArrayArrayArray1.length; local130++) {
					if (Static65.aShortArrayArrayArray1[local130][local64].length > this.anIntArray347[local64]) {
						local204.d(Static315.aShortArrayArray31[local130][local64], Static65.aShortArrayArrayArray1[local130][local64][this.anIntArray347[local64]]);
					}
				}
			}
			local204.SA(local33);
			@Pc(418) Class313 local418 = Static6.aClass313_3;
			synchronized (Static6.aClass313_3) {
				Static6.aClass313_3.method6980(this.aLong129, local204);
			}
		}
		if (arg2 == null) {
			return local204;
		} else {
			local204.method7551((byte) 4, local33, true);
			return arg2.method1510(arg3, 2048, arg0, arg6, local204);
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IILclient!mf;Z)V")
	public void method4222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class218 arg2) {
		if (arg0 == -1) {
			this.anIntArray346[arg1] = 0;
		} else if (arg2.method5067(arg0) != null) {
			this.anIntArray346[arg1] = arg0 | 0x40000000;
			this.method4215();
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZI)V")
	public void method4223(@OriginalArg(0) boolean arg0) {
		this.aBoolean400 = arg0;
		this.method4215();
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IILclient!cn;I)V")
	public void method4224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class57 arg2) {
		@Pc(7) int local7 = Static145.anIntArray180[arg0];
		if (arg2.method1129(arg1) != null) {
			this.anIntArray346[local7] = arg1 | Integer.MIN_VALUE;
			this.method4215();
		}
	}
}
