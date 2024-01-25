import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class284 {

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "[I")
	public int[] anIntArray514;

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "J")
	private long aLong205;

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "Z")
	public boolean aBoolean530;

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "J")
	private long aLong206;

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "[I")
	private int[] anIntArray515;

	@OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
	private int anInt7472;

	@OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
	public int anInt7473 = -1;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z[I[IIII)V")
	public void method6512(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.aBoolean530 = arg0;
		this.anInt7473 = arg4;
		this.anIntArray515 = arg2;
		if (arg3 != this.anInt7472) {
			this.anInt7472 = arg3;
		}
		this.anIntArray514 = arg1;
		this.method6520();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILclient!jf;Z)V")
	public void method6513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class177 arg2) {
		@Pc(7) int local7 = Static214.anIntArray264[arg1];
		if (arg2.method4312(arg0) != null) {
			this.anIntArray515[local7] = arg0 | Integer.MIN_VALUE;
			this.method6520();
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILclient!oba;B)V")
	public void method6514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		if (arg1 == -1) {
			this.anIntArray515[arg0] = 0;
		} else if (arg2.method5960(arg1) != null) {
			this.anIntArray515[arg0] = arg1 | 0x40000000;
			this.method6520();
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIB)V")
	public void method6515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray514[arg1] = arg0;
		this.method6520();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI)V")
	public void method6516(@OriginalArg(0) boolean arg0) {
		this.aBoolean530 = arg0;
		this.method6520();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!jf;ILclient!vha;Lclient!ha;Lclient!eia;IILclient!oba;ILclient!mk;BLclient!ru;)Lclient!ka;")
	public Class193 method6517(@OriginalArg(0) Class177 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class366 arg2, @OriginalArg(3) Class13 arg3, @OriginalArg(4) Interface5 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class250 arg7, @OriginalArg(9) Class228 arg8, @OriginalArg(11) Class308 arg9) {
		if (this.anInt7473 != -1) {
			return arg2.method8551(this.anInt7473).method2746(arg4, arg8, arg3, arg6, arg5, arg9, (Class207) null, arg1);
		}
		@Pc(27) int local27 = 2048;
		@Pc(40) boolean local40;
		@Pc(53) int local53;
		@Pc(123) int local123;
		@Pc(63) int local63;
		@Pc(127) int local127;
		if (arg8 != null) {
			@Pc(36) boolean local36 = false;
			@Pc(38) boolean local38 = false;
			local40 = false;
			@Pc(42) boolean local42 = false;
			local53 = arg8.anIntArray403[arg1];
			local27 = 2080;
			local63 = local53 >>> 16;
			@Pc(67) int local67 = local53 & 0xFFFF;
			@Pc(72) Class2_Sub7_Sub6 local72 = arg9.method7074(local63);
			if (local72 != null) {
				local38 = local72.method3717(local67) | false;
				local36 = local72.method3713(local67) | false;
				local42 = local72.method3712(local67) | false;
				local40 = arg8.aBoolean453 | false;
			}
			if ((arg8.aBoolean451 || Static462.aBoolean531) && arg6 != -1 && arg8.anIntArray403.length > arg6) {
				local123 = arg8.anIntArray403[arg6];
				local127 = local123 >>> 16;
				@Pc(131) int local131 = local123 & 0xFFFF;
				@Pc(145) Class2_Sub7_Sub6 local145 = local63 == local127 ? local72 : arg9.method7074(local127);
				if (local145 != null) {
					local38 |= local145.method3717(local131);
					local36 |= local145.method3713(local131);
					local42 |= local145.method3712(local131);
				}
			}
			if (local38) {
				local27 = 2208;
			}
			if (local36) {
				local27 |= 0x100;
			}
			if (local40) {
				local27 |= 0x200;
			}
			if (local42) {
				local27 |= 0x400;
			}
		}
		@Pc(194) Class69 local194 = Static86.aClass69_10;
		@Pc(203) Class193 local203;
		synchronized (Static86.aClass69_10) {
			local203 = (Class193) Static86.aClass69_10.method1919(this.aLong206);
		}
		if (local203 == null || arg3.method8163(local203.ua(), local27) != 0) {
			if (local203 != null) {
				local27 = arg3.method8122(local27, local203.ua());
			}
			local40 = false;
			for (@Pc(234) int local234 = 0; local234 < 12; local234++) {
				local53 = this.anIntArray515[local234];
				if ((local53 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local53) != 0 && !arg0.method4312(local53 & 0x3FFFFFFF).method7489()) {
						local40 = true;
					}
				} else if (!arg7.method5960(local53 & 0x3FFFFFFF).method7496(this.aBoolean530)) {
					local40 = true;
				}
			}
			if (local40) {
				return null;
			}
			@Pc(296) Class212[] local296 = new Class212[12];
			local123 = 0;
			for (@Pc(300) int local300 = 0; local300 < 12; local300++) {
				@Pc(306) int local306 = this.anIntArray515[local300];
				@Pc(326) Class212 local326;
				if ((local306 & 0x40000000) != 0) {
					local326 = arg7.method5960(local306 & 0x3FFFFFFF).method7505(this.aBoolean530);
					if (local326 != null) {
						local296[local123++] = local326;
					}
				} else if ((Integer.MIN_VALUE & local306) != 0) {
					local326 = arg0.method4312(local306 & 0x3FFFFFFF).method7490();
					if (local326 != null) {
						local296[local123++] = local326;
					}
				}
			}
			@Pc(360) int local360 = local27 | 0x4000;
			@Pc(366) Class212 local366 = new Class212(local296, local123);
			local203 = arg3.method8161(local366, local360, Static223.anInt3813, 64, 768);
			for (local63 = 0; local63 < 5; local63++) {
				for (local127 = 0; local127 < Static260.aShortArrayArrayArray1.length; local127++) {
					if (Static260.aShortArrayArrayArray1[local127][local63].length > this.anIntArray514[local63]) {
						local203.ia(Static97.aShortArrayArray2[local127][local63], Static260.aShortArrayArrayArray1[local127][local63][this.anIntArray514[local63]]);
					}
				}
			}
			local203.s(local27);
			@Pc(422) Class69 local422 = Static86.aClass69_10;
			synchronized (Static86.aClass69_10) {
				Static86.aClass69_10.method1917(this.aLong206, local203);
			}
		}
		if (arg8 == null) {
			return local203;
		} else {
			local203.method6609((byte) 4, local27, true);
			return arg8.method5354(arg6, 2048, arg1, arg5, local203);
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!jf;IIILclient!mk;I[Lclient!hj;Lclient!vha;ILclient!hga;Lclient!mk;IILclient!ru;[IILclient!oba;Lclient!eia;Lclient!ha;IZ)Lclient!ka;")
	public Class193 method6518(@OriginalArg(0) Class177 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class228 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class148[] arg6, @OriginalArg(7) Class366 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class146 arg9, @OriginalArg(10) Class228 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class308 arg12, @OriginalArg(14) int[] arg13, @OriginalArg(15) int arg14, @OriginalArg(16) Class250 arg15, @OriginalArg(17) Interface5 arg16, @OriginalArg(18) Class13 arg17, @OriginalArg(19) int arg18) {
		if (this.anInt7473 != -1) {
			return arg7.method8551(this.anInt7473).method2747((Class207) null, arg14, arg10, arg2, arg9, arg1, arg16, arg12, arg8, arg18, arg6, arg4, arg3, arg11, arg17, arg5, arg13);
		}
		@Pc(34) int local34 = arg1;
		@Pc(37) long local37 = this.aLong206;
		@Pc(40) int[] local40 = this.anIntArray515;
		if (arg4 != null && (arg4.anInt6225 >= 0 || arg4.anInt6232 >= 0)) {
			local40 = new int[12];
			for (@Pc(56) int local56 = 0; local56 < 12; local56++) {
				local40[local56] = this.anIntArray515[local56];
			}
			if (arg4.anInt6225 >= 0) {
				if (arg4.anInt6225 == 65535) {
					local40[5] = 0;
					local37 ^= 0xFFFFFFFF00000000L;
				} else {
					local40[5] = arg4.anInt6225 | 0x40000000;
					local37 ^= (long) local40[5] << 32;
				}
			}
			if (arg4.anInt6232 >= 0) {
				if (arg4.anInt6232 == 65535) {
					local37 ^= 0xFFFFFFFFL;
					local40[3] = 0;
				} else {
					local40[3] = arg4.anInt6232 | 0x40000000;
					local37 ^= (long) local40[3];
				}
			}
		}
		@Pc(139) boolean local139 = false;
		@Pc(141) boolean local141 = false;
		@Pc(143) boolean local143 = false;
		@Pc(151) boolean local151 = arg4 != null || arg10 != null;
		@Pc(158) int local158 = arg6 == null ? 0 : arg6.length;
		@Pc(191) int local191;
		@Pc(196) int local196;
		for (@Pc(160) int local160 = 0; local160 < local158; local160++) {
			Static524.aClass2_Sub7_Sub6Array8[local160] = null;
			if (arg6[local160] != null) {
				@Pc(177) Class228 local177 = arg12.method7075(arg6[local160].anInt4066);
				if (local177.anIntArray403 != null) {
					Static464.aClass228Array2[local160] = local177;
					local151 = true;
					local191 = arg6[local160].anInt4072;
					local196 = arg6[local160].anInt4065;
					@Pc(201) int local201 = local177.anIntArray403[local191];
					Static524.aClass2_Sub7_Sub6Array8[local160] = arg12.method7074(local201 >>> 16);
					@Pc(214) int local214 = local201 & 0xFFFF;
					Static325.anIntArray364[local160] = local214;
					if (Static524.aClass2_Sub7_Sub6Array8[local160] != null) {
						local141 |= Static524.aClass2_Sub7_Sub6Array8[local160].method3717(local214);
						local139 |= Static524.aClass2_Sub7_Sub6Array8[local160].method3713(local214);
						local143 |= Static524.aClass2_Sub7_Sub6Array8[local160].method3712(local214);
					}
					if ((local177.aBoolean451 || Static462.aBoolean531) && local196 != -1 && local196 < local177.anIntArray403.length) {
						Static573.anIntArray674[local160] = local177.anIntArray404[local191];
						Static328.anIntArray370[local160] = arg6[local160].anInt4067;
						@Pc(303) int local303 = local177.anIntArray403[local196];
						Static75.aClass2_Sub7_Sub6Array7[local160] = arg12.method7074(local303 >>> 16);
						@Pc(316) int local316 = local303 & 0xFFFF;
						Static439.anIntArray487[local160] = local316;
						if (Static75.aClass2_Sub7_Sub6Array7[local160] != null) {
							local141 |= Static75.aClass2_Sub7_Sub6Array7[local160].method3717(local316);
							local139 |= Static75.aClass2_Sub7_Sub6Array7[local160].method3713(local316);
							local143 |= Static75.aClass2_Sub7_Sub6Array7[local160].method3712(local316);
						}
					} else {
						Static573.anIntArray674[local160] = 0;
						Static328.anIntArray370[local160] = 0;
						Static75.aClass2_Sub7_Sub6Array7[local160] = null;
						Static439.anIntArray487[local160] = -1;
					}
				}
			}
		}
		@Pc(361) int local361 = -1;
		local191 = -1;
		local196 = 0;
		@Pc(367) Class2_Sub7_Sub6 local367 = null;
		@Pc(369) Class2_Sub7_Sub6 local369 = null;
		@Pc(371) int local371 = -1;
		@Pc(373) int local373 = -1;
		@Pc(375) int local375 = 0;
		@Pc(377) Class2_Sub7_Sub6 local377 = null;
		@Pc(379) Class2_Sub7_Sub6 local379 = null;
		if (local151) {
			@Pc(392) int local392;
			@Pc(456) int local456;
			if (arg4 != null) {
				local361 = arg4.anIntArray403[arg5];
				local392 = local361 >>> 16;
				local361 &= 0xFFFF;
				local367 = arg12.method7074(local392);
				if (local367 != null) {
					local141 |= local367.method3717(local361);
					local139 |= local367.method3713(local361);
					local143 |= local367.method3712(local361);
				}
				if ((arg4.aBoolean451 || Static462.aBoolean531) && arg3 != -1 && arg4.anIntArray403.length > arg3) {
					local196 = arg4.anIntArray404[arg5];
					local191 = arg4.anIntArray403[arg3];
					local456 = local191 >>> 16;
					local369 = local456 == local392 ? local367 : arg12.method7074(local456);
					local191 &= 0xFFFF;
					if (local369 != null) {
						local141 |= local369.method3717(local191);
						local139 |= local369.method3713(local191);
						local143 |= local369.method3712(local191);
					}
				}
			}
			local34 = arg1 | 0x20;
			if (arg10 != null) {
				local371 = arg10.anIntArray403[arg8];
				local392 = local371 >>> 16;
				local377 = arg12.method7074(local392);
				local371 &= 0xFFFF;
				if (local377 != null) {
					local141 |= local377.method3717(local371);
					local139 |= local377.method3713(local371);
					local143 |= local377.method3712(local371);
				}
				if ((arg10.aBoolean451 || Static462.aBoolean531) && arg11 != -1 && arg11 < arg10.anIntArray403.length) {
					local373 = arg10.anIntArray403[arg11];
					local375 = arg10.anIntArray404[arg8];
					local456 = local373 >>> 16;
					local373 &= 0xFFFF;
					local379 = local392 == local456 ? local377 : arg12.method7074(local456);
					if (local379 != null) {
						local141 |= local379.method3717(local373);
						local139 |= local379.method3713(local373);
						local143 |= local379.method3712(local373);
					}
				}
			}
			if (local141) {
				local34 |= 0x80;
			}
			if (local139) {
				local34 |= 0x100;
			}
			if (local143) {
				local34 |= 0x400;
			}
		}
		@Pc(636) Class69 local636 = Static570.aClass69_60;
		@Pc(644) Class193 local644;
		synchronized (Static570.aClass69_60) {
			local644 = (Class193) Static570.aClass69_60.method1919(local37);
		}
		@Pc(652) Class291 local652 = null;
		if (this.anInt7472 != -1) {
			local652 = arg9.method3512(this.anInt7472);
		}
		@Pc(686) boolean local686;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(776) int local776;
		@Pc(781) int local781;
		@Pc(845) int local845;
		if (local644 == null || arg17.method8163(local644.ua(), local34) != 0) {
			if (local644 != null) {
				local34 = arg17.method8122(local34, local644.ua());
			}
			local686 = false;
			for (local688 = 0; local688 < 12; local688++) {
				local693 = local40[local688];
				if ((local693 & 0x40000000) == 0) {
					if ((local693 & Integer.MIN_VALUE) != 0 && !arg0.method4312(local693 & 0x3FFFFFFF).method7492()) {
						local686 = true;
					}
				} else if (!arg15.method5960(local693 & 0x3FFFFFFF).method7511(this.aBoolean530)) {
					local686 = true;
				}
			}
			if (local686) {
				if (this.aLong205 != -1L) {
					@Pc(741) Class69 local741 = Static570.aClass69_60;
					synchronized (Static570.aClass69_60) {
						local644 = (Class193) Static570.aClass69_60.method1919(this.aLong205);
					}
				}
				if (local644 == null || arg17.method8163(local644.ua(), local34) != 0) {
					return null;
				}
			} else {
				@Pc(774) Class212[] local774 = new Class212[12];
				for (local776 = 0; local776 < 12; local776++) {
					local781 = local40[local776];
					@Pc(799) Class212 local799;
					if ((local781 & 0x40000000) != 0) {
						local799 = arg15.method5960(local781 & 0x3FFFFFFF).method7501(this.aBoolean530);
						if (local799 != null) {
							local774[local776] = local799;
						}
					} else if ((local781 & Integer.MIN_VALUE) != 0) {
						local799 = arg0.method4312(local781 & 0x3FFFFFFF).method7488();
						if (local799 != null) {
							local774[local776] = local799;
						}
					}
				}
				@Pc(847) int local847;
				if (local652 != null && local652.anIntArrayArray93 != null) {
					for (local781 = 0; local781 < local652.anIntArrayArray93.length; local781++) {
						if (local774[local781] != null) {
							local845 = 0;
							local847 = 0;
							@Pc(849) int local849 = 0;
							@Pc(851) int local851 = 0;
							@Pc(853) int local853 = 0;
							@Pc(855) int local855 = 0;
							if (local652.anIntArrayArray93[local781] != null) {
								local853 = local652.anIntArrayArray93[local781][4] << 3;
								local851 = local652.anIntArrayArray93[local781][3] << 3;
								local855 = local652.anIntArrayArray93[local781][5] << 3;
								local849 = local652.anIntArrayArray93[local781][2];
								local847 = local652.anIntArrayArray93[local781][1];
								local845 = local652.anIntArrayArray93[local781][0];
							}
							if (local851 != 0 || local853 != 0 || local855 != 0) {
								local774[local781].method4916(local853, local855, local851);
							}
							if (local845 != 0 || local847 != 0 || local849 != 0) {
								local774[local781].method4917(local849, local847, local845);
							}
						}
					}
				}
				@Pc(962) Class212 local962 = new Class212(local774, local774.length);
				@Pc(966) int local966 = local34 | 0x4000;
				local644 = arg17.method8161(local962, local966, Static223.anInt3813, 64, 850);
				for (local845 = 0; local845 < 5; local845++) {
					for (local847 = 0; local847 < Static260.aShortArrayArrayArray1.length; local847++) {
						if (Static260.aShortArrayArrayArray1[local847][local845].length > this.anIntArray514[local845]) {
							local644.ia(Static97.aShortArrayArray2[local847][local845], Static260.aShortArrayArrayArray1[local847][local845][this.anIntArray514[local845]]);
						}
					}
				}
				local644.s(local34);
				@Pc(1026) Class69 local1026 = Static570.aClass69_60;
				synchronized (Static570.aClass69_60) {
					Static570.aClass69_60.method1917(local37, local644);
				}
				this.aLong205 = local37;
			}
		}
		@Pc(1048) Class193 local1048 = local644.method6609((byte) 4, local34, true);
		local686 = false;
		if (arg13 != null) {
			for (local688 = 0; local688 < 12; local688++) {
				if (arg13[local688] != -1) {
					local686 = true;
				}
			}
		}
		if (!local151 && !local686) {
			return local1048;
		}
		@Pc(1075) Class51[] local1075 = null;
		if (local652 != null) {
			local1075 = local652.method6683(arg17);
		}
		if (local686 && local1075 != null) {
			for (local693 = 0; local693 < 12; local693++) {
				if (local1075[local693] != null) {
					local1048.method6627(local1075[local693], 0x1 << local693, true);
				}
			}
		}
		local693 = 0;
		local776 = 1;
		while (local693 < local158) {
			if (Static524.aClass2_Sub7_Sub6Array8[local693] != null) {
				local1048.method6631(Static439.anIntArray487[local693], Static325.anIntArray364[local693], (int[]) null, local776, Static573.anIntArray674[local693], false, Static524.aClass2_Sub7_Sub6Array8[local693], Static328.anIntArray370[local693] - 1, Static75.aClass2_Sub7_Sub6Array7[local693]);
			}
			local693++;
			local776 <<= 0x1;
		}
		if (local686) {
			for (local781 = 0; local781 < 12; local781++) {
				if (arg13[local781] != -1) {
					local845 = arg13[local781] - arg14;
					local845 &= 0x3FFF;
					@Pc(1177) Class51 local1177 = arg17.method8137();
					local1177.method6710(local845);
					local1048.method6627(local1177, 0x1 << local781, false);
				}
			}
		}
		if (local686 && local1075 != null) {
			for (local781 = 0; local781 < 12; local781++) {
				if (local1075[local781] != null) {
					local1048.method6627(local1075[local781], 0x1 << local781, false);
				}
			}
		}
		if (local367 != null && local377 != null) {
			local1048.method6628(local379, local377, arg18 - 1, local367, arg2 - 1, local191, false, local373, arg4.aBooleanArray12, local371, local369, local361, local375, local196);
		} else if (local367 != null) {
			local1048.method6614(false, local369, 0, local361, local367, local191, local196, arg18 - 1);
		} else if (local377 != null) {
			local1048.method6614(false, local379, 0, local371, local377, local373, local375, arg2 - 1);
		}
		for (local781 = 0; local781 < local158; local781++) {
			Static524.aClass2_Sub7_Sub6Array8[local781] = null;
			Static75.aClass2_Sub7_Sub6Array7[local781] = null;
			Static464.aClass228Array2[local781] = null;
		}
		return local1048;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V")
	private void method6520() {
		@Pc(11) long[] local11 = Class16_Sub6_Sub1.aLongArray17;
		this.aLong206 = -1L;
		this.aLong206 = local11[(int) (((long) (this.anInt7472 >> 8) ^ this.aLong206) & 0xFFL)] ^ this.aLong206 >>> 8;
		this.aLong206 = this.aLong206 >>> 8 ^ local11[(int) (((long) this.anInt7472 ^ this.aLong206) & 0xFFL)];
		for (@Pc(54) int local54 = 0; local54 < 12; local54++) {
			this.aLong206 = local11[(int) ((this.aLong206 ^ (long) (this.anIntArray515[local54] >> 24)) & 0xFFL)] ^ this.aLong206 >>> 8;
			this.aLong206 = local11[(int) (((long) (this.anIntArray515[local54] >> 16) ^ this.aLong206) & 0xFFL)] ^ this.aLong206 >>> 8;
			this.aLong206 = local11[(int) (((long) (this.anIntArray515[local54] >> 8) ^ this.aLong206) & 0xFFL)] ^ this.aLong206 >>> 8;
			this.aLong206 = local11[(int) (((long) this.anIntArray515[local54] ^ this.aLong206) & 0xFFL)] ^ this.aLong206 >>> 8;
		}
		for (@Pc(149) int local149 = 0; local149 < 5; local149++) {
			this.aLong206 = this.aLong206 >>> 8 ^ local11[(int) (((long) this.anIntArray514[local149] ^ this.aLong206) & 0xFFL)];
		}
		this.aLong206 = local11[(int) ((this.aLong206 ^ (long) (this.aBoolean530 ? 1 : 0)) & 0xFFL)] ^ this.aLong206 >>> 8;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!ha;IILclient!ru;Lclient!jf;BLclient!mk;IIIII)Lclient!ka;")
	public Class193 method6521(@OriginalArg(0) Class13 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class308 arg2, @OriginalArg(4) Class177 arg3, @OriginalArg(6) Class228 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9) {
		@Pc(10) int local10 = 2048;
		@Pc(100) int local100;
		@Pc(41) int local41;
		if (arg4 != null) {
			@Pc(14) boolean local14 = false;
			@Pc(16) boolean local16 = false;
			@Pc(18) boolean local18 = false;
			@Pc(20) boolean local20 = false;
			@Pc(31) int local31 = arg4.anIntArray403[arg7];
			local10 = 2080;
			local41 = local31 >>> 16;
			@Pc(46) Class2_Sub7_Sub6 local46 = arg2.method7074(local41);
			@Pc(50) int local50 = local31 & 0xFFFF;
			if (local46 != null) {
				local16 = local46.method3717(local50) | false;
				local14 = local46.method3713(local50) | false;
				local20 = local46.method3712(local50) | false;
				local18 = arg4.aBoolean453 | false;
			}
			if ((arg4.aBoolean451 || Static462.aBoolean531) && arg1 != -1 && arg1 < arg4.anIntArray403.length) {
				local100 = arg4.anIntArray403[arg1];
				@Pc(104) int local104 = local100 >>> 16;
				@Pc(108) int local108 = local100 & 0xFFFF;
				@Pc(122) Class2_Sub7_Sub6 local122;
				if (local41 == local104) {
					local122 = local46;
				} else {
					local122 = arg2.method7074(local108 >>> 16);
				}
				if (local122 != null) {
					local16 |= local122.method3717(local108);
					local14 |= local122.method3713(local108);
					local20 |= local122.method3712(local108);
				}
			}
			if (local16) {
				local10 = 2208;
			}
			if (local14) {
				local10 |= 0x100;
			}
			if (local18) {
				local10 |= 0x200;
			}
			if (local20) {
				local10 |= 0x400;
			}
		}
		@Pc(185) long local185 = (long) (arg9 << 16) | (long) arg6 << 32 | (long) arg8;
		@Pc(187) Class69 local187 = Static86.aClass69_10;
		@Pc(195) Class193 local195;
		synchronized (Static86.aClass69_10) {
			local195 = (Class193) Static86.aClass69_10.method1919(local185);
		}
		if (local195 == null || arg0.method8163(local195.ua(), local10) != 0) {
			if (local195 != null) {
				local10 = arg0.method8122(local10, local195.ua());
			}
			@Pc(225) Class212[] local225 = new Class212[3];
			local100 = 0;
			if (!arg3.method4312(arg8).method7489() || !arg3.method4312(arg9).method7489() || !arg3.method4312(arg6).method7489()) {
				return null;
			}
			@Pc(255) Class212 local255 = arg3.method4312(arg8).method7490();
			if (local255 != null) {
				local100++;
				local225[0] = local255;
			}
			local255 = arg3.method4312(arg9).method7490();
			if (local255 != null) {
				local225[local100++] = local255;
			}
			local255 = arg3.method4312(arg6).method7490();
			if (local255 != null) {
				local225[local100++] = local255;
			}
			@Pc(294) int local294 = local10 | 0x4000;
			local255 = new Class212(local225, local100);
			local195 = arg0.method8161(local255, local294, Static223.anInt3813, 64, 768);
			for (@Pc(310) int local310 = 0; local310 < 5; local310++) {
				for (local41 = 0; local41 < Static260.aShortArrayArrayArray1.length; local41++) {
					if (this.anIntArray514[local310] < Static260.aShortArrayArrayArray1[local41][local310].length) {
						local195.ia(Static97.aShortArrayArray2[local41][local310], Static260.aShortArrayArrayArray1[local41][local310][this.anIntArray514[local310]]);
					}
				}
			}
			local195.s(local10);
			@Pc(360) Class69 local360 = Static86.aClass69_10;
			synchronized (Static86.aClass69_10) {
				Static86.aClass69_10.method1917(local185, local195);
			}
		}
		if (arg4 == null) {
			return local195;
		} else {
			local195 = local195.method6609((byte) 4, local10, true);
			return arg4.method5354(arg1, 2048, arg7, arg5, local195);
		}
	}
}
