import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uba")
public final class Class337 {

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "[I")
	private int[] anIntArray537;

	@OriginalMember(owner = "client!uba", name = "c", descriptor = "J")
	private long aLong252;

	@OriginalMember(owner = "client!uba", name = "i", descriptor = "I")
	private int anInt9707;

	@OriginalMember(owner = "client!uba", name = "j", descriptor = "Z")
	public boolean aBoolean689;

	@OriginalMember(owner = "client!uba", name = "k", descriptor = "J")
	private long aLong253;

	@OriginalMember(owner = "client!uba", name = "s", descriptor = "[I")
	public int[] anIntArray538;

	@OriginalMember(owner = "client!uba", name = "d", descriptor = "I")
	public int anInt9703 = -1;

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(Lclient!ne;IIIILclient!nf;Lclient!pj;Lclient!uc;Lclient!fba;Lclient!ha;ILclient!ea;)Lclient!ka;")
	public Class83 method7840(@OriginalArg(0) Class220 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Interface17 arg4, @OriginalArg(6) Class258 arg5, @OriginalArg(7) Class338 arg6, @OriginalArg(8) Class97 arg7, @OriginalArg(9) Class16 arg8, @OriginalArg(11) Class79 arg9) {
		if (this.anInt9703 != -1) {
			return arg6.method7851(this.anInt9703).method7317(arg2, arg4, arg1, arg0, arg3, arg8, arg7);
		}
		@Pc(27) int local27 = 2048;
		@Pc(35) boolean local35;
		@Pc(52) int local52;
		@Pc(114) int local114;
		@Pc(58) int local58;
		@Pc(118) int local118;
		if (arg7 != null) {
			@Pc(31) boolean local31 = false;
			@Pc(33) boolean local33 = false;
			local35 = false;
			@Pc(37) boolean local37 = false;
			local27 = 2080;
			local52 = arg7.anIntArray182[arg3];
			local58 = local52 >>> 16;
			@Pc(63) Class8_Sub5_Sub21 local63 = arg0.method5668(local58);
			@Pc(67) int local67 = local52 & 0xFFFF;
			if (local63 != null) {
				local33 = local63.method8390(local67) | false;
				local31 = local63.method8388(local67) | false;
				local37 = local63.method8385(local67) | false;
				local35 = arg7.aBoolean264 | false;
			}
			if ((arg7.aBoolean263 || Static460.aBoolean600) && arg2 != -1 && arg2 < arg7.anIntArray182.length) {
				local114 = arg7.anIntArray182[arg2];
				local118 = local114 >>> 16;
				@Pc(122) int local122 = local114 & 0xFFFF;
				@Pc(136) Class8_Sub5_Sub21 local136 = local118 == local58 ? local63 : arg0.method5668(local118);
				if (local136 != null) {
					local33 |= local136.method8390(local122);
					local31 |= local136.method8388(local122);
					local37 |= local136.method8385(local122);
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
		@Pc(185) Class236 local185 = Static120.aClass236_20;
		@Pc(194) Class83 local194;
		synchronized (Static120.aClass236_20) {
			local194 = (Class83) Static120.aClass236_20.method6242(this.aLong252);
		}
		if (local194 == null || arg8.method6121(local194.ua(), local27) != 0) {
			if (local194 != null) {
				local27 = arg8.method6109(local27, local194.ua());
			}
			local35 = false;
			for (@Pc(222) int local222 = 0; local222 < 12; local222++) {
				local52 = this.anIntArray537[local222];
				if ((local52 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local52) != 0 && !arg9.method2535(local52 & 0x3FFFFFFF).method5567()) {
						local35 = true;
					}
				} else if (!arg5.method6652(local52 & 0x3FFFFFFF).method7054(this.aBoolean689)) {
					local35 = true;
				}
			}
			if (local35) {
				return null;
			}
			@Pc(277) Class344[] local277 = new Class344[12];
			local114 = 0;
			for (@Pc(281) int local281 = 0; local281 < 12; local281++) {
				@Pc(288) int local288 = this.anIntArray537[local281];
				@Pc(311) Class344 local311;
				if ((local288 & 0x40000000) != 0) {
					local311 = arg5.method6652(local288 & 0x3FFFFFFF).method7042(this.aBoolean689);
					if (local311 != null) {
						local277[local114++] = local311;
					}
				} else if ((local288 & Integer.MIN_VALUE) != 0) {
					local311 = arg9.method2535(local288 & 0x3FFFFFFF).method5564();
					if (local311 != null) {
						local277[local114++] = local311;
					}
				}
			}
			@Pc(350) Class344 local350 = new Class344(local277, local114);
			@Pc(354) int local354 = local27 | 0x4000;
			local194 = arg8.method6094(local350, local354, Static344.anInt6676, 64, 768);
			for (local58 = 0; local58 < 5; local58++) {
				for (local118 = 0; local118 < Static450.aShortArrayArrayArray2.length; local118++) {
					if (this.anIntArray538[local58] < Static450.aShortArrayArrayArray2[local118][local58].length) {
						local194.ia(Static174.aShortArrayArray6[local118][local58], Static450.aShortArrayArrayArray2[local118][local58][this.anIntArray538[local58]]);
					}
				}
			}
			local194.s(local27);
			@Pc(418) Class236 local418 = Static120.aClass236_20;
			synchronized (Static120.aClass236_20) {
				Static120.aClass236_20.method6241(this.aLong252, local194);
			}
		}
		if (arg7 == null) {
			return local194;
		} else {
			local194.method7993((byte) 4, local27, true);
			return arg7.method2973(arg1, arg2, local194, arg3, 2048);
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(BLclient!ea;II)V")
	public void method7841(@OriginalArg(1) Class79 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = Static402.anIntArray416[arg1];
		if (arg0.method2535(arg2) != null) {
			this.anIntArray537[local12] = arg2 | Integer.MIN_VALUE;
			this.method7846();
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(Lclient!pj;III)V")
	public void method7842(@OriginalArg(0) Class258 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == -1) {
			this.anIntArray537[arg1] = 0;
		} else if (arg0.method6652(arg2) != null) {
			this.anIntArray537[arg1] = arg2 | 0x40000000;
			this.method7846();
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(ILclient!fba;Lclient!ea;Lclient!ha;ILclient!pj;Lclient!nf;ILclient!ne;Lclient!uc;ILclient!fba;ILclient!mea;ZIIB[Lclient!faa;[II)Lclient!ka;")
	public Class83 method7843(@OriginalArg(0) int arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) Class79 arg2, @OriginalArg(3) Class16 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class258 arg5, @OriginalArg(6) Interface17 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class220 arg8, @OriginalArg(9) Class338 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class97 arg11, @OriginalArg(12) int arg12, @OriginalArg(13) Class202 arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15, @OriginalArg(18) Class96[] arg16, @OriginalArg(19) int[] arg17, @OriginalArg(20) int arg18) {
		if (this.anInt9703 != -1) {
			return arg9.method7851(this.anInt9703).method7315(arg1, arg8, arg6, arg15, arg13, arg17, arg0, arg14, arg18, arg7, arg12, arg3, arg11, arg16, arg10, arg4);
		}
		@Pc(35) int local35 = arg12;
		@Pc(38) long local38 = this.aLong252;
		@Pc(41) int[] local41 = this.anIntArray537;
		if (arg1 != null && (arg1.anInt3604 >= 0 || arg1.anInt3610 >= 0)) {
			local41 = new int[12];
			for (@Pc(57) int local57 = 0; local57 < 12; local57++) {
				local41[local57] = this.anIntArray537[local57];
			}
			if (arg1.anInt3604 >= 0) {
				if (arg1.anInt3604 == 65535) {
					local38 ^= 0xFFFFFFFF00000000L;
					local41[5] = 0;
				} else {
					local41[5] = arg1.anInt3604 | 0x40000000;
					local38 ^= (long) local41[5] << 32;
				}
			}
			if (arg1.anInt3610 >= 0) {
				if (arg1.anInt3610 == 65535) {
					local41[3] = 0;
					local38 ^= 0xFFFFFFFFL;
				} else {
					local41[3] = arg1.anInt3610 | 0x40000000;
					local38 ^= local41[3];
				}
			}
		}
		@Pc(140) boolean local140 = false;
		@Pc(142) boolean local142 = false;
		@Pc(144) boolean local144 = false;
		@Pc(152) boolean local152 = arg1 != null || arg11 != null;
		@Pc(159) int local159 = arg16 == null ? 0 : arg16.length;
		@Pc(193) int local193;
		@Pc(198) int local198;
		for (@Pc(161) int local161 = 0; local161 < local159; local161++) {
			Static109.aClass8_Sub5_Sub21Array6[local161] = null;
			if (arg16[local161] != null) {
				@Pc(179) Class97 local179 = arg8.method5670(arg16[local161].anInt3579);
				if (local179.anIntArray182 != null) {
					Static290.aClass97Array1[local161] = local179;
					local152 = true;
					local193 = arg16[local161].anInt3581;
					local198 = arg16[local161].anInt3584;
					@Pc(203) int local203 = local179.anIntArray182[local193];
					Static109.aClass8_Sub5_Sub21Array6[local161] = arg8.method5668(local203 >>> 16);
					@Pc(216) int local216 = local203 & 0xFFFF;
					Static349.anIntArray377[local161] = local216;
					if (Static109.aClass8_Sub5_Sub21Array6[local161] != null) {
						local142 |= Static109.aClass8_Sub5_Sub21Array6[local161].method8390(local216);
						local140 |= Static109.aClass8_Sub5_Sub21Array6[local161].method8388(local216);
						local144 |= Static109.aClass8_Sub5_Sub21Array6[local161].method8385(local216);
					}
					if ((local179.aBoolean263 || Static460.aBoolean600) && local198 != -1 && local198 < local179.anIntArray182.length) {
						Static386.anIntArray407[local161] = local179.anIntArray180[local193];
						Static24.anIntArray30[local161] = arg16[local161].anInt3586;
						@Pc(283) int local283 = local179.anIntArray182[local198];
						Static77.aClass8_Sub5_Sub21Array5[local161] = arg8.method5668(local283 >>> 16);
						@Pc(296) int local296 = local283 & 0xFFFF;
						Static364.anIntArray387[local161] = local296;
						if (Static77.aClass8_Sub5_Sub21Array5[local161] != null) {
							local142 |= Static77.aClass8_Sub5_Sub21Array5[local161].method8390(local296);
							local140 |= Static77.aClass8_Sub5_Sub21Array5[local161].method8388(local296);
							local144 |= Static77.aClass8_Sub5_Sub21Array5[local161].method8385(local296);
						}
					} else {
						Static386.anIntArray407[local161] = 0;
						Static24.anIntArray30[local161] = 0;
						Static77.aClass8_Sub5_Sub21Array5[local161] = null;
						Static364.anIntArray387[local161] = -1;
					}
				}
			}
		}
		@Pc(355) int local355 = -1;
		local193 = -1;
		local198 = 0;
		@Pc(361) Class8_Sub5_Sub21 local361 = null;
		@Pc(363) Class8_Sub5_Sub21 local363 = null;
		@Pc(365) int local365 = -1;
		@Pc(367) int local367 = -1;
		@Pc(369) int local369 = 0;
		@Pc(371) Class8_Sub5_Sub21 local371 = null;
		@Pc(373) Class8_Sub5_Sub21 local373 = null;
		if (local152) {
			local35 = arg12 | 0x20;
			@Pc(390) int local390;
			@Pc(450) int local450;
			if (arg1 != null) {
				local355 = arg1.anIntArray182[arg18];
				local390 = local355 >>> 16;
				local355 &= 0xFFFF;
				local361 = arg8.method5668(local390);
				if (local361 != null) {
					local142 |= local361.method8390(local355);
					local140 |= local361.method8388(local355);
					local144 |= local361.method8385(local355);
				}
				if ((arg1.aBoolean263 || Static460.aBoolean600) && arg10 != -1 && arg10 < arg1.anIntArray182.length) {
					local198 = arg1.anIntArray180[arg18];
					local193 = arg1.anIntArray182[arg10];
					local450 = local193 >>> 16;
					local363 = local390 == local450 ? local361 : arg8.method5668(local450);
					local193 &= 0xFFFF;
					if (local363 != null) {
						local142 |= local363.method8390(local193);
						local140 |= local363.method8388(local193);
						local144 |= local363.method8385(local193);
					}
				}
			}
			if (arg11 != null) {
				local365 = arg11.anIntArray182[arg7];
				local390 = local365 >>> 16;
				local365 &= 0xFFFF;
				local371 = arg8.method5668(local390);
				if (local371 != null) {
					local142 |= local371.method8390(local365);
					local140 |= local371.method8388(local365);
					local144 |= local371.method8385(local365);
				}
				if ((arg11.aBoolean263 || Static460.aBoolean600) && arg0 != -1 && arg11.anIntArray182.length > arg0) {
					local369 = arg11.anIntArray180[arg7];
					local367 = arg11.anIntArray182[arg0];
					local450 = local367 >>> 16;
					local367 &= 0xFFFF;
					local373 = local450 == local390 ? local371 : arg8.method5668(local450);
					if (local373 != null) {
						local142 |= local373.method8390(local367);
						local140 |= local373.method8388(local367);
						local144 |= local373.method8385(local367);
					}
				}
			}
			if (local142) {
				local35 |= 0x80;
			}
			if (local140) {
				local35 |= 0x100;
			}
			if (local144) {
				local35 |= 0x400;
			}
		}
		@Pc(631) Class236 local631 = Static438.aClass236_75;
		@Pc(639) Class83 local639;
		synchronized (Static438.aClass236_75) {
			local639 = (Class83) Static438.aClass236_75.method6242(local38);
		}
		@Pc(647) Class102 local647 = null;
		if (this.anInt9707 != -1) {
			local647 = arg13.method5415(this.anInt9707);
		}
		@Pc(677) boolean local677;
		@Pc(679) int local679;
		@Pc(685) int local685;
		@Pc(735) int local735;
		@Pc(741) int local741;
		@Pc(808) int local808;
		if (local639 == null || arg3.method6121(local639.ua(), local35) != 0) {
			if (local639 != null) {
				local35 = arg3.method6109(local35, local639.ua());
			}
			local677 = false;
			for (local679 = 0; local679 < 12; local679++) {
				local685 = local41[local679];
				if ((local685 & 0x40000000) == 0) {
					if ((local685 & Integer.MIN_VALUE) != 0 && !arg2.method2535(local685 & 0x3FFFFFFF).method5562()) {
						local677 = true;
					}
				} else if (!arg5.method6652(local685 & 0x3FFFFFFF).method7045(this.aBoolean689)) {
					local677 = true;
				}
			}
			if (local677) {
				if (this.aLong253 != -1L) {
					@Pc(1017) Class236 local1017 = Static438.aClass236_75;
					synchronized (Static438.aClass236_75) {
						local639 = (Class83) Static438.aClass236_75.method6242(this.aLong253);
					}
				}
				if (local639 == null || arg3.method6121(local639.ua(), local35) != 0) {
					return null;
				}
			} else {
				@Pc(733) Class344[] local733 = new Class344[12];
				for (local735 = 0; local735 < 12; local735++) {
					local741 = local41[local735];
					@Pc(759) Class344 local759;
					if ((local741 & 0x40000000) != 0) {
						local759 = arg5.method6652(local741 & 0x3FFFFFFF).method7055(this.aBoolean689);
						if (local759 != null) {
							local733[local735] = local759;
						}
					} else if ((Integer.MIN_VALUE & local741) != 0) {
						local759 = arg2.method2535(local741 & 0x3FFFFFFF).method5568();
						if (local759 != null) {
							local733[local735] = local759;
						}
					}
				}
				@Pc(810) int local810;
				if (local647 != null && local647.anIntArrayArray16 != null) {
					for (local741 = 0; local741 < local647.anIntArrayArray16.length; local741++) {
						if (local733[local741] != null) {
							local808 = 0;
							local810 = 0;
							@Pc(812) int local812 = 0;
							@Pc(814) int local814 = 0;
							@Pc(816) int local816 = 0;
							@Pc(818) int local818 = 0;
							if (local647.anIntArrayArray16[local741] != null) {
								local812 = local647.anIntArrayArray16[local741][2];
								local810 = local647.anIntArrayArray16[local741][1];
								local818 = local647.anIntArrayArray16[local741][5] << 3;
								local816 = local647.anIntArrayArray16[local741][4] << 3;
								local808 = local647.anIntArrayArray16[local741][0];
								local814 = local647.anIntArrayArray16[local741][3] << 3;
							}
							if (local814 != 0 || local816 != 0 || local818 != 0) {
								local733[local741].method8061(local816, local814, local818);
							}
							if (local808 != 0 || local810 != 0 || local812 != 0) {
								local733[local741].method8055(local808, local812, local810);
							}
						}
					}
				}
				@Pc(922) Class344 local922 = new Class344(local733, local733.length);
				@Pc(926) int local926 = local35 | 0x4000;
				local639 = arg3.method6094(local922, local926, Static344.anInt6676, 64, 850);
				for (local808 = 0; local808 < 5; local808++) {
					for (local810 = 0; local810 < Static450.aShortArrayArrayArray2.length; local810++) {
						if (Static450.aShortArrayArrayArray2[local810][local808].length > this.anIntArray538[local808]) {
							local639.ia(Static174.aShortArrayArray6[local810][local808], Static450.aShortArrayArrayArray2[local810][local808][this.anIntArray538[local808]]);
						}
					}
				}
				local639.s(local35);
				@Pc(990) Class236 local990 = Static438.aClass236_75;
				synchronized (Static438.aClass236_75) {
					Static438.aClass236_75.method6241(local38, local639);
				}
				this.aLong253 = local38;
			}
		}
		@Pc(1051) Class83 local1051 = local639.method7993((byte) 4, local35, true);
		local677 = false;
		if (arg17 != null) {
			for (local679 = 0; local679 < 12; local679++) {
				if (arg17[local679] != -1) {
					local677 = true;
				}
			}
		}
		if (!local152 && !local677) {
			return local1051;
		}
		@Pc(1079) Class54[] local1079 = null;
		if (local647 != null) {
			local1079 = local647.method3052(arg3);
		}
		if (local677 && local1079 != null) {
			for (local685 = 0; local685 < 12; local685++) {
				if (local1079[local685] != null) {
					local1051.method7996(local1079[local685], 0x1 << local685, true);
				}
			}
		}
		local685 = 0;
		local735 = 1;
		while (local159 > local685) {
			if (Static109.aClass8_Sub5_Sub21Array6[local685] != null) {
				local1051.method8013(false, Static24.anIntArray30[local685] - 1, Static77.aClass8_Sub5_Sub21Array5[local685], Static349.anIntArray377[local685], Static364.anIntArray387[local685], Static386.anIntArray407[local685], local735, Static109.aClass8_Sub5_Sub21Array6[local685], null);
			}
			local735 <<= 0x1;
			local685++;
		}
		if (local677) {
			for (local741 = 0; local741 < 12; local741++) {
				if (arg17[local741] != -1) {
					local808 = arg17[local741] - arg15;
					local808 &= 0x3FFF;
					@Pc(1185) Class54 local1185 = arg3.method6076();
					local1185.method5144(local808);
					local1051.method7996(local1185, 0x1 << local741, false);
				}
			}
		}
		if (local677 && local1079 != null) {
			for (local741 = 0; local741 < 12; local741++) {
				if (local1079[local741] != null) {
					local1051.method7996(local1079[local741], 0x1 << local741, false);
				}
			}
		}
		if (local361 != null && local371 != null) {
			local1051.method8016(local355, false, local373, arg14 - 1, local371, local367, local363, local369, local361, local193, local198, arg1.aBooleanArray6, local365, arg4 - 1);
		} else if (local361 != null) {
			local1051.method7998(false, local193, local355, local363, local198, local361, arg4 - 1, 0);
		} else if (local371 != null) {
			local1051.method7998(false, local367, local365, local373, local369, local371, arg14 - 1, 0);
		}
		for (local741 = 0; local741 < local159; local741++) {
			Static109.aClass8_Sub5_Sub21Array6[local741] = null;
			Static77.aClass8_Sub5_Sub21Array5[local741] = null;
			Static290.aClass97Array1[local741] = null;
		}
		return local1051;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(III)V")
	public void method7844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray538[arg0] = arg1;
		this.method7846();
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "([I[IZIII)V")
	public void method7845(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aBoolean689 = arg2;
		this.anIntArray537 = arg0;
		this.anInt9703 = arg4;
		if (arg3 != this.anInt9707) {
			this.anInt9707 = arg3;
		}
		this.anIntArray538 = arg1;
		this.method7846();
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)V")
	private void method7846() {
		@Pc(7) long[] local7 = Class21_Sub3.aLongArray10;
		this.aLong252 = -1L;
		this.aLong252 = local7[(int) (((long) (this.anInt9707 >> 8) ^ this.aLong252) & 0xFFL)] ^ this.aLong252 >>> 8;
		this.aLong252 = local7[(int) (((long) this.anInt9707 ^ this.aLong252) & 0xFFL)] ^ this.aLong252 >>> 8;
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong252 = local7[(int) ((this.aLong252 ^ (long) (this.anIntArray537[local50] >> 24)) & 0xFFL)] ^ this.aLong252 >>> 8;
			this.aLong252 = local7[(int) (((long) (this.anIntArray537[local50] >> 16) ^ this.aLong252) & 0xFFL)] ^ this.aLong252 >>> 8;
			this.aLong252 = local7[(int) (((long) (this.anIntArray537[local50] >> 8) ^ this.aLong252) & 0xFFL)] ^ this.aLong252 >>> 8;
			this.aLong252 = this.aLong252 >>> 8 ^ local7[(int) ((this.aLong252 ^ (long) this.anIntArray537[local50]) & 0xFFL)];
		}
		for (@Pc(144) int local144 = 0; local144 < 5; local144++) {
			this.aLong252 = this.aLong252 >>> 8 ^ local7[(int) ((this.aLong252 ^ (long) this.anIntArray538[local144]) & 0xFFL)];
		}
		this.aLong252 = local7[(int) ((this.aLong252 ^ (long) (this.aBoolean689 ? 1 : 0)) & 0xFFL)] ^ this.aLong252 >>> 8;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(ZI)V")
	public void method7848(@OriginalArg(0) boolean arg0) {
		this.aBoolean689 = arg0;
		this.method7846();
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(BIILclient!fba;IILclient!ne;IIILclient!ea;Lclient!ha;)Lclient!ka;")
	public Class83 method7849(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class97 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class220 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class79 arg8, @OriginalArg(11) Class16 arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(97) int local97;
		@Pc(38) int local38;
		if (arg2 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			@Pc(28) int local28 = arg2.anIntArray182[arg3];
			local7 = 2080;
			local38 = local28 >>> 16;
			@Pc(43) Class8_Sub5_Sub21 local43 = arg5.method5668(local38);
			@Pc(47) int local47 = local28 & 0xFFFF;
			if (local43 != null) {
				local13 = local43.method8390(local47) | false;
				local11 = local43.method8388(local47) | false;
				local17 = local43.method8385(local47) | false;
				local15 = arg2.aBoolean264 | false;
			}
			if ((arg2.aBoolean263 || Static460.aBoolean600) && arg6 != -1 && arg2.anIntArray182.length > arg6) {
				local97 = arg2.anIntArray182[arg6];
				@Pc(101) int local101 = local97 >>> 16;
				@Pc(105) int local105 = local97 & 0xFFFF;
				@Pc(115) Class8_Sub5_Sub21 local115;
				if (local38 == local101) {
					local115 = local43;
				} else {
					local115 = arg5.method5668(local105 >>> 16);
				}
				if (local115 != null) {
					local13 |= local115.method8390(local105);
					local11 |= local115.method8388(local105);
					local17 |= local115.method8385(local105);
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
		@Pc(178) long local178 = (long) arg0 | (long) arg7 << 32 | (long) (arg4 << 16);
		@Pc(180) Class236 local180 = Static120.aClass236_20;
		@Pc(188) Class83 local188;
		synchronized (Static120.aClass236_20) {
			local188 = (Class83) Static120.aClass236_20.method6242(local178);
		}
		if (local188 == null || arg9.method6121(local188.ua(), local7) != 0) {
			if (local188 != null) {
				local7 = arg9.method6109(local7, local188.ua());
			}
			@Pc(218) Class344[] local218 = new Class344[3];
			local97 = 0;
			if (!arg8.method2535(arg0).method5567() || !arg8.method2535(arg4).method5567() || !arg8.method2535(arg7).method5567()) {
				return null;
			}
			@Pc(248) Class344 local248 = arg8.method2535(arg0).method5564();
			if (local248 != null) {
				local97++;
				local218[0] = local248;
			}
			local248 = arg8.method2535(arg4).method5564();
			if (local248 != null) {
				local218[local97++] = local248;
			}
			local248 = arg8.method2535(arg7).method5564();
			if (local248 != null) {
				local218[local97++] = local248;
			}
			@Pc(287) int local287 = local7 | 0x4000;
			local248 = new Class344(local218, local97);
			local188 = arg9.method6094(local248, local287, Static344.anInt6676, 64, 768);
			for (@Pc(303) int local303 = 0; local303 < 5; local303++) {
				for (local38 = 0; local38 < Static450.aShortArrayArrayArray2.length; local38++) {
					if (this.anIntArray538[local303] < Static450.aShortArrayArrayArray2[local38][local303].length) {
						local188.ia(Static174.aShortArrayArray6[local38][local303], Static450.aShortArrayArrayArray2[local38][local303][this.anIntArray538[local303]]);
					}
				}
			}
			local188.s(local7);
			@Pc(351) Class236 local351 = Static120.aClass236_20;
			synchronized (Static120.aClass236_20) {
				Static120.aClass236_20.method6241(local178, local188);
			}
		}
		if (arg2 == null) {
			return local188;
		} else {
			local188 = local188.method7993((byte) 4, local7, true);
			return arg2.method2973(arg1, arg6, local188, arg3, 2048);
		}
	}
}
