import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class73 {

	@OriginalMember(owner = "client!eu", name = "h", descriptor = "Z")
	public boolean aBoolean147;

	@OriginalMember(owner = "client!eu", name = "j", descriptor = "J")
	private long aLong59;

	@OriginalMember(owner = "client!eu", name = "k", descriptor = "[I")
	private int[] anIntArray190;

	@OriginalMember(owner = "client!eu", name = "l", descriptor = "I")
	private int anInt1807;

	@OriginalMember(owner = "client!eu", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!eu", name = "o", descriptor = "J")
	private long aLong60;

	@OriginalMember(owner = "client!eu", name = "q", descriptor = "[I")
	public int[] anIntArray191;

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "I")
	public int anInt1802 = -1;

	static {
		new Class231("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!qq;Lclient!nc;ILclient!rt;IIILclient!fn;IIII)Lclient!cd;")
	public Class39 method1669(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class174 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class223 arg3, @OriginalArg(4) int arg4, @OriginalArg(7) Class83 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9) {
		@Pc(15) int local15 = 2048;
		@Pc(112) int local112;
		if (arg5 != null) {
			@Pc(19) boolean local19 = false;
			@Pc(21) boolean local21 = false;
			@Pc(23) boolean local23 = false;
			@Pc(25) boolean local25 = false;
			@Pc(38) int local38 = arg5.anIntArray211[arg8];
			local15 = 2080;
			@Pc(46) int local46 = local38 >>> 16;
			@Pc(53) Class6_Sub1_Sub5 local53 = arg1.method4013(local46);
			@Pc(57) int local57 = local38 & 0xFFFF;
			if (local53 != null) {
				local21 = local53.method1090(local57) | false;
				local19 = local53.method1094(local57) | false;
				local25 = local53.method1092(local57) | false;
				local23 = arg5.aBoolean153 | false;
			}
			if ((arg5.aBoolean156 || Static116.aBoolean157) && arg7 != -1 && arg5.anIntArray211.length > arg7) {
				local112 = arg5.anIntArray211[arg7];
				@Pc(116) int local116 = local112 >>> 16;
				@Pc(120) int local120 = local112 & 0xFFFF;
				@Pc(134) Class6_Sub1_Sub5 local134;
				if (local46 == local116) {
					local134 = local53;
				} else {
					local134 = arg1.method4013(local120 >>> 16);
				}
				if (local134 != null) {
					local21 |= local134.method1090(local120);
					local19 |= local134.method1094(local120);
					local25 |= local134.method1092(local120);
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
		@Pc(197) long local197 = (long) arg6 | (long) (arg4 << 16) | (long) arg9 << 32;
		@Pc(199) Class220 local199 = Static61.aClass220_4;
		@Pc(207) Class39 local207;
		synchronized (Static61.aClass220_4) {
			local207 = (Class39) Static61.aClass220_4.method4990(local197);
		}
		if (local207 == null || arg0.method3532(local207.method4900(), local15) != 0) {
			if (local207 != null) {
				local15 = arg0.method3539(local15, local207.method4900());
			}
			@Pc(237) Class266[] local237 = new Class266[3];
			local112 = 0;
			if (!arg3.method5043(arg6).method2745() || !arg3.method5043(arg4).method2745() || !arg3.method5043(arg9).method2745()) {
				return null;
			}
			@Pc(269) Class266 local269 = arg3.method5043(arg6).method2740();
			if (local269 != null) {
				local112++;
				local237[0] = local269;
			}
			local269 = arg3.method5043(arg4).method2740();
			if (local269 != null) {
				local237[local112++] = local269;
			}
			local269 = arg3.method5043(arg9).method2740();
			if (local269 != null) {
				local237[local112++] = local269;
			}
			local269 = new Class266(local237, local112);
			@Pc(316) int local316 = local15 | 0x4000;
			local207 = arg0.method3496(local269, local316, Static392.anInt6525, 64, 768);
			for (@Pc(326) int local326 = 0; local326 < 5; local326++) {
				if (this.anIntArray191[local326] < Static339.aShortArrayArray6[local326].length) {
					local207.method4909(Static348.aShortArray85[local326], Static339.aShortArrayArray6[local326][this.anIntArray191[local326]]);
				}
				if (this.anIntArray191[local326] < Static102.aShortArrayArray5[local326].length) {
					local207.method4909(Static21.aShortArray11[local326], Static102.aShortArrayArray5[local326][this.anIntArray191[local326]]);
				}
			}
			local207.method4891(local15);
			@Pc(381) Class220 local381 = Static61.aClass220_4;
			synchronized (Static61.aClass220_4) {
				Static61.aClass220_4.method4996(local207, local197);
			}
		}
		if (arg5 == null) {
			return local207;
		} else {
			local207 = local207.method4863((byte) 4, local15, true);
			return arg5.method1827(2048, local207, arg8, arg2, arg7);
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!fn;IILclient!dv;IIIZII[Lclient!cc;Lclient!mo;Lclient!rr;Lclient!qq;ILclient!dr;Lclient!fn;Lclient!rt;Lclient!nc;)Lclient!cd;")
	public Class39 method1670(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class59 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class38[] arg8, @OriginalArg(11) Class170 arg9, @OriginalArg(12) Class222 arg10, @OriginalArg(13) Class28 arg11, @OriginalArg(14) int arg12, @OriginalArg(15) Interface4 arg13, @OriginalArg(16) Class83 arg14, @OriginalArg(17) Class223 arg15, @OriginalArg(18) Class174 arg16) {
		if (this.anInt1802 != -1) {
			return arg3.method1468(this.anInt1802).method282(arg11, arg2, arg0, arg12, arg1, arg16, arg4, arg8, arg6, arg14, arg7, arg10, arg13, arg5);
		}
		@Pc(33) int local33 = arg2;
		@Pc(36) long local36 = this.aLong60;
		@Pc(39) int[] local39 = this.anIntArray190;
		if (arg14 != null && (arg14.anInt1986 >= 0 || arg14.anInt1984 >= 0)) {
			local39 = new int[12];
			for (@Pc(55) int local55 = 0; local55 < 12; local55++) {
				local39[local55] = this.anIntArray190[local55];
			}
			if (arg14.anInt1986 >= 0) {
				if (arg14.anInt1986 == 65535) {
					local36 ^= 0xFFFFFFFF00000000L;
					local39[5] = 0;
				} else {
					local39[5] = arg14.anInt1986 | 0x40000000;
					local36 ^= (long) local39[5] << 32;
				}
			}
			if (arg14.anInt1984 >= 0) {
				if (arg14.anInt1984 == 65535) {
					local36 ^= 0xFFFFFFFFL;
					local39[3] = 0;
				} else {
					local39[3] = arg14.anInt1984 | 0x40000000;
					local36 ^= local39[3];
				}
			}
		}
		@Pc(146) boolean local146 = false;
		@Pc(148) boolean local148 = false;
		@Pc(150) boolean local150 = false;
		@Pc(158) boolean local158 = arg14 != null || arg0 != null;
		@Pc(165) int local165 = arg8 == null ? 0 : arg8.length;
		@Pc(199) int local199;
		@Pc(204) int local204;
		for (@Pc(167) int local167 = 0; local167 < local165; local167++) {
			Static421.aClass6_Sub1_Sub5Array7[local167] = null;
			if (arg8[local167] != null) {
				@Pc(185) Class83 local185 = arg16.method4011(arg8[local167].anInt918);
				if (local185.anIntArray211 != null) {
					local158 = true;
					Static315.aClass83Array3[local167] = local185;
					local199 = arg8[local167].anInt922;
					local204 = arg8[local167].anInt916;
					@Pc(209) int local209 = local185.anIntArray211[local199];
					Static421.aClass6_Sub1_Sub5Array7[local167] = arg16.method4013(local209 >>> 16);
					@Pc(222) int local222 = local209 & 0xFFFF;
					Static214.anIntArray318[local167] = local222;
					if (Static421.aClass6_Sub1_Sub5Array7[local167] != null) {
						local148 |= Static421.aClass6_Sub1_Sub5Array7[local167].method1090(local222);
						local146 |= Static421.aClass6_Sub1_Sub5Array7[local167].method1094(local222);
						local150 |= Static421.aClass6_Sub1_Sub5Array7[local167].method1092(local222);
					}
					if ((local185.aBoolean156 || Static116.aBoolean157) && local204 != -1 && local204 < local185.anIntArray211.length) {
						Static2.anIntArray1[local167] = local185.anIntArray212[local199];
						Static24.anIntArray33[local167] = arg8[local167].anInt920;
						@Pc(310) int local310 = local185.anIntArray211[local204];
						Static427.aClass6_Sub1_Sub5Array8[local167] = arg16.method4013(local310 >>> 16);
						@Pc(325) int local325 = local310 & 0xFFFF;
						Static238.anIntArray368[local167] = local325;
						if (Static427.aClass6_Sub1_Sub5Array8[local167] != null) {
							local148 |= Static427.aClass6_Sub1_Sub5Array8[local167].method1090(local325);
							local146 |= Static427.aClass6_Sub1_Sub5Array8[local167].method1094(local325);
							local150 |= Static427.aClass6_Sub1_Sub5Array8[local167].method1092(local325);
						}
					} else {
						Static2.anIntArray1[local167] = 0;
						Static24.anIntArray33[local167] = 0;
						Static427.aClass6_Sub1_Sub5Array8[local167] = null;
						Static238.anIntArray368[local167] = -1;
					}
				}
			}
		}
		@Pc(368) int local368 = -1;
		local199 = -1;
		local204 = 0;
		@Pc(374) Class6_Sub1_Sub5 local374 = null;
		@Pc(376) Class6_Sub1_Sub5 local376 = null;
		@Pc(378) int local378 = -1;
		@Pc(380) int local380 = -1;
		@Pc(382) int local382 = 0;
		@Pc(384) Class6_Sub1_Sub5 local384 = null;
		@Pc(386) Class6_Sub1_Sub5 local386 = null;
		if (local158) {
			local33 = arg2 | 0x20;
			@Pc(403) int local403;
			@Pc(469) int local469;
			if (arg14 != null) {
				local368 = arg14.anIntArray211[arg6];
				local403 = local368 >>> 16;
				local368 &= 0xFFFF;
				local374 = arg16.method4013(local403);
				if (local374 != null) {
					local148 |= local374.method1090(local368);
					local146 |= local374.method1094(local368);
					local150 |= local374.method1092(local368);
				}
				if ((arg14.aBoolean156 || Static116.aBoolean157) && arg12 != -1 && arg14.anIntArray211.length > arg12) {
					local199 = arg14.anIntArray211[arg12];
					local204 = arg14.anIntArray212[arg6];
					local469 = local199 >>> 16;
					local199 &= 0xFFFF;
					local376 = local403 == local469 ? local374 : arg16.method4013(local469);
					if (local376 != null) {
						local148 |= local376.method1090(local199);
						local146 |= local376.method1094(local199);
						local150 |= local376.method1092(local199);
					}
				}
			}
			if (arg0 != null) {
				local378 = arg0.anIntArray211[arg5];
				local403 = local378 >>> 16;
				local384 = arg16.method4013(local403);
				local378 &= 0xFFFF;
				if (local384 != null) {
					local148 |= local384.method1090(local378);
					local146 |= local384.method1094(local378);
					local150 |= local384.method1092(local378);
				}
				if ((arg0.aBoolean156 || Static116.aBoolean157) && arg4 != -1 && arg0.anIntArray211.length > arg4) {
					local382 = arg0.anIntArray212[arg5];
					local380 = arg0.anIntArray211[arg4];
					local469 = local380 >>> 16;
					local380 &= 0xFFFF;
					local386 = local403 == local469 ? local384 : arg16.method4013(local469);
					if (local386 != null) {
						local148 |= local386.method1090(local380);
						local146 |= local386.method1094(local380);
						local150 |= local386.method1092(local380);
					}
				}
			}
			if (local148) {
				local33 |= 0x80;
			}
			if (local146) {
				local33 |= 0x100;
			}
			if (local150) {
				local33 |= 0x400;
			}
		}
		@Pc(645) Class220 local645 = Static135.aClass220_16;
		@Pc(653) Class39 local653;
		synchronized (Static135.aClass220_16) {
			local653 = (Class39) Static135.aClass220_16.method4990(local36);
		}
		@Pc(661) Class208 local661 = null;
		if (this.anInt1807 != -1) {
			local661 = arg10.method5008(this.anInt1807);
		}
		@Pc(702) int local702;
		@Pc(708) int local708;
		if (local653 == null || arg11.method3532(local653.method4900(), local33) != 0 || local661 != null && local661.anIntArrayArray48 != null && this.anIntArrayArray21 == null) {
			if (local653 != null) {
				local33 = arg11.method3539(local33, local653.method4900());
			}
			@Pc(700) boolean local700 = false;
			local702 = 0;
			while (true) {
				if (local702 >= 12) {
					if (local700) {
						if (this.aLong59 != -1L) {
							@Pc(762) Class220 local762 = Static135.aClass220_16;
							synchronized (Static135.aClass220_16) {
								local653 = (Class39) Static135.aClass220_16.method4990(this.aLong59);
							}
						}
						if (local653 == null || arg11.method3532(local653.method4900(), local33) != 0 || local661 != null && local661.anIntArrayArray48 != null && this.anIntArrayArray21 == null) {
							return null;
						}
					} else {
						@Pc(803) Class266[] local803 = new Class266[12];
						@Pc(811) int local811;
						for (@Pc(805) int local805 = 0; local805 < 12; local805++) {
							local811 = local39[local805];
							@Pc(829) Class266 local829;
							if ((local811 & 0x40000000) != 0) {
								local829 = arg9.method3865(local811 & 0x3FFFFFFF).method780(this.aBoolean147);
								if (local829 != null) {
									local803[local805] = local829;
								}
							} else if ((local811 & Integer.MIN_VALUE) != 0) {
								local829 = arg15.method5043(local811 & 0x3FFFFFFF).method2742();
								if (local829 != null) {
									local803[local805] = local829;
								}
							}
						}
						@Pc(890) int local890;
						if (local661 != null && local661.anIntArrayArray48 != null) {
							for (local811 = 0; local811 < local661.anIntArrayArray48.length; local811++) {
								if (local661.anIntArrayArray48[local811] != null && local803[local811] != null) {
									local890 = local661.anIntArrayArray48[local811][0];
									@Pc(897) int local897 = local661.anIntArrayArray48[local811][1];
									@Pc(904) int local904 = local661.anIntArrayArray48[local811][2];
									@Pc(913) int local913 = local661.anIntArrayArray48[local811][3] << 3;
									@Pc(922) int local922 = local661.anIntArrayArray48[local811][4] << 3;
									@Pc(931) int local931 = local661.anIntArrayArray48[local811][5] << 3;
									if (this.anIntArrayArray21 == null) {
										this.anIntArrayArray21 = new int[local661.anIntArrayArray48.length][];
									}
									if (this.anIntArrayArray21[local811] == null) {
										@Pc(953) int[] local953 = this.anIntArrayArray21[local811] = new int[15];
										if (local913 == 0 && local922 == 0 && local931 == 0) {
											local953[12] = -local890;
											local953[0] = local953[4] = local953[8] = 32768;
											local953[14] = -local904;
											local953[13] = -local897;
										} else {
											@Pc(995) int local995 = Class6_Sub1_Sub18.anIntArray643[local913];
											@Pc(999) int local999 = Class6_Sub1_Sub18.anIntArray642[local913];
											@Pc(1003) int local1003 = Class6_Sub1_Sub18.anIntArray643[local922];
											@Pc(1007) int local1007 = Class6_Sub1_Sub18.anIntArray642[local922];
											@Pc(1011) int local1011 = Class6_Sub1_Sub18.anIntArray643[local931];
											@Pc(1015) int local1015 = Class6_Sub1_Sub18.anIntArray642[local931];
											@Pc(1023) int local1023 = local999 * local1011 + 16384 >> 15;
											@Pc(1031) int local1031 = local1015 * local999 + 16384 >> 15;
											local953[2] = local995 * local1007 + 16384 >> 15;
											local953[5] = -local999;
											local953[3] = local1015 * local995 + 16384 >> 15;
											local953[6] = -local1007 * local1011 + local1003 * local1031 + 16384 >> 15;
											local953[4] = local995 * local1011 + 16384 >> 15;
											local953[1] = local1007 * local1023 + local1003 * -local1015 + 16384 >> 15;
											local953[8] = local995 * local1003 + 16384 >> 15;
											local953[7] = -local1015 * -local1007 + local1003 * local1023 + 16384 >> 15;
											local953[0] = local1007 * local1031 + local1003 * local1011 + 16384 >> 15;
											local953[13] = local953[7] * -local904 + local953[1] * -local890 + -local897 * local953[4] + 16384 >> 15;
											local953[12] = local953[3] * -local897 + local953[0] * -local890 + -local904 * local953[6] + 16384 >> 15;
											local953[14] = local953[2] * -local890 + local953[5] * -local897 + local953[8] * -local904 + 16384 >> 15;
										}
										local953[11] = local904;
										local953[10] = local897;
										local953[9] = local890;
									}
									if (local913 != 0 || local922 != 0 || local931 != 0) {
										local803[local811].method5962(local931, local913, local922);
									}
									if (local890 != 0 || local897 != 0 || local904 != 0) {
										local803[local811].method5959(local904, local890, local897);
									}
								}
							}
						}
						@Pc(1280) int local1280 = local33 | 0x4000;
						@Pc(1287) Class266 local1287 = new Class266(local803, local803.length);
						local653 = arg11.method3496(local1287, local1280, Static392.anInt6525, 64, 850);
						for (local890 = 0; local890 < 5; local890++) {
							if (this.anIntArray191[local890] < Static339.aShortArrayArray6[local890].length) {
								local653.method4909(Static348.aShortArray85[local890], Static339.aShortArrayArray6[local890][this.anIntArray191[local890]]);
							}
							if (Static102.aShortArrayArray5[local890].length > this.anIntArray191[local890]) {
								local653.method4909(Static21.aShortArray11[local890], Static102.aShortArrayArray5[local890][this.anIntArray191[local890]]);
							}
						}
						local653.method4891(local33);
						@Pc(1360) Class220 local1360 = Static135.aClass220_16;
						synchronized (Static135.aClass220_16) {
							Static135.aClass220_16.method4996(local653, local36);
						}
						this.aLong59 = local36;
					}
					break;
				}
				local708 = local39[local702];
				if ((local708 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local708) != 0 && !arg15.method5043(local708 & 0x3FFFFFFF).method2739()) {
						local700 = true;
					}
				} else if (!arg9.method3865(local708 & 0x3FFFFFFF).method782(this.aBoolean147)) {
					local700 = true;
				}
				local702++;
			}
		}
		@Pc(1382) Class39 local1382 = local653.method4863((byte) 4, local33, true);
		if (!local158) {
			return local1382;
		}
		@Pc(1388) int local1388 = 0;
		local702 = 1;
		while (local1388 < local165) {
			if (Static421.aClass6_Sub1_Sub5Array7[local1388] != null) {
				local1382.method4903(local702, this.anIntArrayArray21 == null ? null : this.anIntArrayArray21[local1388], false, Static238.anIntArray368[local1388], Static2.anIntArray1[local1388], Static427.aClass6_Sub1_Sub5Array8[local1388], Static214.anIntArray318[local1388], Static24.anIntArray33[local1388] - 1, Static421.aClass6_Sub1_Sub5Array7[local1388]);
			}
			local1388++;
			local702 <<= 0x1;
		}
		if (local374 != null && local384 != null) {
			local1382.method4896(local204, local382, arg1 - 1, local374, local368, local384, arg7 - 1, local378, arg14.aBooleanArray12, local380, local376, local386, local199, false);
		} else if (local374 != null) {
			local1382.method4893(0, local204, local376, local368, arg1 - 1, local199, false, local374);
		} else if (local384 != null) {
			local1382.method4893(0, local382, local386, local378, arg7 - 1, local380, false, local384);
		}
		for (local708 = 0; local708 < local165; local708++) {
			Static421.aClass6_Sub1_Sub5Array7[local708] = null;
			Static427.aClass6_Sub1_Sub5Array8[local708] = null;
			Static315.aClass83Array3[local708] = null;
		}
		return local1382;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IZ)V")
	public void method1671(@OriginalArg(1) boolean arg0) {
		this.aBoolean147 = arg0;
		this.method1675();
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IILclient!nc;Lclient!rt;Lclient!fn;Lclient!dr;Lclient!mo;Lclient!qq;Lclient!dv;III)Lclient!cd;")
	public Class39 method1672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class174 arg2, @OriginalArg(3) Class223 arg3, @OriginalArg(4) Class83 arg4, @OriginalArg(5) Interface4 arg5, @OriginalArg(6) Class170 arg6, @OriginalArg(7) Class28 arg7, @OriginalArg(8) Class59 arg8, @OriginalArg(9) int arg9) {
		if (this.anInt1802 != -1) {
			return arg8.method1468(this.anInt1802).method286(arg4, arg9, arg7, arg1, arg2, arg5, arg0);
		}
		@Pc(27) int local27 = 2048;
		@Pc(35) boolean local35;
		@Pc(48) int local48;
		@Pc(116) int local116;
		@Pc(58) int local58;
		if (arg4 != null) {
			@Pc(31) boolean local31 = false;
			@Pc(33) boolean local33 = false;
			local35 = false;
			@Pc(37) boolean local37 = false;
			local48 = arg4.anIntArray211[arg0];
			local27 = 2080;
			local58 = local48 >>> 16;
			@Pc(63) Class6_Sub1_Sub5 local63 = arg2.method4013(local58);
			@Pc(67) int local67 = local48 & 0xFFFF;
			if (local63 != null) {
				local33 = local63.method1090(local67) | false;
				local31 = local63.method1094(local67) | false;
				local37 = local63.method1092(local67) | false;
				local35 = arg4.aBoolean153 | false;
			}
			if ((arg4.aBoolean156 || Static116.aBoolean157) && arg1 != -1 && arg1 < arg4.anIntArray211.length) {
				local116 = arg4.anIntArray211[arg1];
				@Pc(120) int local120 = local116 >>> 16;
				@Pc(134) Class6_Sub1_Sub5 local134 = local120 == local58 ? local63 : arg2.method4013(local120);
				@Pc(138) int local138 = local116 & 0xFFFF;
				if (local134 != null) {
					local33 |= local134.method1090(local138);
					local31 |= local134.method1094(local138);
					local37 |= local134.method1092(local138);
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
		@Pc(187) Class220 local187 = Static61.aClass220_4;
		@Pc(198) Class39 local198;
		synchronized (Static61.aClass220_4) {
			local198 = (Class39) Static61.aClass220_4.method4990(this.aLong60);
		}
		if (local198 == null || arg7.method3532(local198.method4900(), local27) != 0) {
			if (local198 != null) {
				local27 = arg7.method3539(local27, local198.method4900());
			}
			local35 = false;
			for (@Pc(229) int local229 = 0; local229 < 12; local229++) {
				local48 = this.anIntArray190[local229];
				if ((local48 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local48) != 0 && !arg3.method5043(local48 & 0x3FFFFFFF).method2745()) {
						local35 = true;
					}
				} else if (!arg6.method3865(local48 & 0x3FFFFFFF).method770(this.aBoolean147)) {
					local35 = true;
				}
			}
			if (local35) {
				return null;
			}
			@Pc(289) Class266[] local289 = new Class266[12];
			local116 = 0;
			for (@Pc(293) int local293 = 0; local293 < 12; local293++) {
				@Pc(300) int local300 = this.anIntArray190[local293];
				@Pc(315) Class266 local315;
				if ((local300 & 0x40000000) != 0) {
					local315 = arg6.method3865(local300 & 0x3FFFFFFF).method777(this.aBoolean147);
					if (local315 != null) {
						local289[local116++] = local315;
					}
				} else if ((local300 & Integer.MIN_VALUE) != 0) {
					local315 = arg3.method5043(local300 & 0x3FFFFFFF).method2740();
					if (local315 != null) {
						local289[local116++] = local315;
					}
				}
			}
			@Pc(361) Class266 local361 = new Class266(local289, local116);
			@Pc(365) int local365 = local27 | 0x4000;
			local198 = arg7.method3496(local361, local365, Static392.anInt6525, 64, 768);
			for (local58 = 0; local58 < 5; local58++) {
				if (Static339.aShortArrayArray6[local58].length > this.anIntArray191[local58]) {
					local198.method4909(Static348.aShortArray85[local58], Static339.aShortArrayArray6[local58][this.anIntArray191[local58]]);
				}
				if (Static102.aShortArrayArray5[local58].length > this.anIntArray191[local58]) {
					local198.method4909(Static21.aShortArray11[local58], Static102.aShortArrayArray5[local58][this.anIntArray191[local58]]);
				}
			}
			local198.method4891(local27);
			@Pc(430) Class220 local430 = Static61.aClass220_4;
			synchronized (Static61.aClass220_4) {
				Static61.aClass220_4.method4996(local198, this.aLong60);
			}
		}
		if (arg4 == null) {
			return local198;
		} else {
			local198.method4863((byte) 4, local27, true);
			return arg4.method1827(2048, local198, arg0, arg9, arg1);
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "([IZI[IBI)V")
	public void method1673(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4) {
		this.anIntArray190 = arg0;
		this.anInt1802 = arg2;
		this.aBoolean147 = arg1;
		if (this.anInt1807 != arg4) {
			this.anIntArrayArray21 = null;
			this.anInt1807 = arg4;
		}
		this.anIntArray191 = arg3;
		this.method1675();
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)V")
	private void method1675() {
		this.aLong60 = -1L;
		@Pc(10) long[] local10 = Canvas_Sub1.aLongArray6;
		this.aLong60 = local10[(int) ((this.aLong60 ^ (long) (this.anInt1807 >> 8)) & 0xFFL)] ^ this.aLong60 >>> 8;
		this.aLong60 = local10[(int) ((this.aLong60 ^ (long) this.anInt1807) & 0xFFL)] ^ this.aLong60 >>> 8;
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong60 = this.aLong60 >>> 8 ^ local10[(int) (((long) (this.anIntArray190[local50] >> 24) ^ this.aLong60) & 0xFFL)];
			this.aLong60 = local10[(int) (((long) (this.anIntArray190[local50] >> 16) ^ this.aLong60) & 0xFFL)] ^ this.aLong60 >>> 8;
			this.aLong60 = this.aLong60 >>> 8 ^ local10[(int) ((this.aLong60 ^ (long) (this.anIntArray190[local50] >> 8)) & 0xFFL)];
			this.aLong60 = this.aLong60 >>> 8 ^ local10[(int) ((this.aLong60 ^ (long) this.anIntArray190[local50]) & 0xFFL)];
		}
		for (@Pc(146) int local146 = 0; local146 < 5; local146++) {
			this.aLong60 = local10[(int) (((long) this.anIntArray191[local146] ^ this.aLong60) & 0xFFL)] ^ this.aLong60 >>> 8;
		}
		this.aLong60 = local10[(int) ((this.aLong60 ^ (long) (this.aBoolean147 ? 1 : 0)) & 0xFFL)] ^ this.aLong60 >>> 8;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IILclient!rt;I)V")
	public void method1676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		@Pc(7) int local7 = Static50.anIntArray89[arg1];
		if (this.anIntArray190[local7] != 0 && arg2.method5043(arg0) != null) {
			this.anIntArray190[local7] = Integer.MIN_VALUE | arg0;
			this.method1675();
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(III)V")
	public void method1677(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray191[arg1] = arg0;
		this.method1675();
	}
}
