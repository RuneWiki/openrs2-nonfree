import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kga")
public final class Class190 {

	@OriginalMember(owner = "client!kga", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray106;

	@OriginalMember(owner = "client!kga", name = "f", descriptor = "[I")
	public int[] anIntArray369;

	@OriginalMember(owner = "client!kga", name = "h", descriptor = "[I")
	private int[] anIntArray370;

	@OriginalMember(owner = "client!kga", name = "i", descriptor = "J")
	private long aLong147;

	@OriginalMember(owner = "client!kga", name = "k", descriptor = "I")
	private int anInt4733;

	@OriginalMember(owner = "client!kga", name = "o", descriptor = "J")
	private long aLong148;

	@OriginalMember(owner = "client!kga", name = "u", descriptor = "Z")
	public boolean aBoolean356;

	@OriginalMember(owner = "client!kga", name = "l", descriptor = "I")
	public int anInt4734 = -1;

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(III)V")
	public void method3830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray369[arg0] = arg1;
		this.method3835();
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(II[IZ[II)V")
	public void method3832(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		this.anInt4734 = arg4;
		this.anIntArray370 = arg3;
		this.anIntArray369 = arg1;
		this.aBoolean356 = arg2;
		if (arg0 != this.anInt4733) {
			this.anIntArrayArray106 = null;
			this.anInt4733 = arg0;
		}
		this.method3835();
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lclient!ga;ILclient!qj;ILclient!ud;ILclient!rk;Lclient!dh;IILclient!r;Lclient!ln;)Lclient!da;")
	public Class63 method3833(@OriginalArg(0) Class114 arg0, @OriginalArg(2) Interface16 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class326 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class290 arg5, @OriginalArg(7) Class71 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class134 arg8, @OriginalArg(11) Class211 arg9) {
		if (this.anInt4734 != -1) {
			return arg3.method7234(this.anInt4734).method286(arg9, arg7, arg8, arg2, arg1, arg4, arg5);
		}
		@Pc(32) int local32 = 2048;
		@Pc(40) boolean local40;
		@Pc(59) int local59;
		@Pc(123) int local123;
		@Pc(63) int local63;
		@Pc(127) int local127;
		if (arg5 != null) {
			@Pc(36) boolean local36 = false;
			@Pc(38) boolean local38 = false;
			local40 = false;
			@Pc(42) boolean local42 = false;
			local32 = 2080;
			local59 = arg5.anIntArray604[arg4];
			local63 = local59 >>> 16;
			@Pc(67) int local67 = local59 & 0xFFFF;
			@Pc(72) Class1_Sub6_Sub1 local72 = arg9.method4272(local63);
			if (local72 != null) {
				local38 = local72.method348(local67) | false;
				local36 = local72.method346(local67) | false;
				local42 = local72.method353(local67) | false;
				local40 = arg5.aBoolean603 | false;
			}
			if ((arg5.aBoolean599 || Static444.aBoolean410) && arg7 != -1 && arg7 < arg5.anIntArray604.length) {
				local123 = arg5.anIntArray604[arg7];
				local127 = local123 >>> 16;
				@Pc(131) int local131 = local123 & 0xFFFF;
				@Pc(145) Class1_Sub6_Sub1 local145 = local63 == local127 ? local72 : arg9.method4272(local127);
				if (local145 != null) {
					local38 |= local145.method348(local131);
					local36 |= local145.method346(local131);
					local42 |= local145.method353(local131);
				}
			}
			if (local38) {
				local32 = 2208;
			}
			if (local36) {
				local32 |= 0x100;
			}
			if (local40) {
				local32 |= 0x200;
			}
			if (local42) {
				local32 |= 0x400;
			}
		}
		@Pc(196) Class222 local196 = Static396.aClass222_42;
		@Pc(205) Class63 local205;
		synchronized (Static396.aClass222_42) {
			local205 = (Class63) Static396.aClass222_42.method4430(this.aLong148);
		}
		if (local205 == null || arg8.method6915(local205.PA(), local32) != 0) {
			if (local205 != null) {
				local32 = arg8.method6967(local32, local205.PA());
			}
			local40 = false;
			for (@Pc(236) int local236 = 0; local236 < 12; local236++) {
				local59 = this.anIntArray370[local236];
				if ((local59 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local59) != 0 && !arg6.method1494(local59 & 0x3FFFFFFF).method3695()) {
						local40 = true;
					}
				} else if (!arg0.method2217(local59 & 0x3FFFFFFF).method4998(this.aBoolean356)) {
					local40 = true;
				}
			}
			if (local40) {
				return null;
			}
			@Pc(290) Class210[] local290 = new Class210[12];
			local123 = 0;
			for (@Pc(294) int local294 = 0; local294 < 12; local294++) {
				@Pc(301) int local301 = this.anIntArray370[local294];
				@Pc(320) Class210 local320;
				if ((local301 & 0x40000000) != 0) {
					local320 = arg0.method2217(local301 & 0x3FFFFFFF).method5006(this.aBoolean356);
					if (local320 != null) {
						local290[local123++] = local320;
					}
				} else if ((local301 & Integer.MIN_VALUE) != 0) {
					local320 = arg6.method1494(local301 & 0x3FFFFFFF).method3691();
					if (local320 != null) {
						local290[local123++] = local320;
					}
				}
			}
			@Pc(361) Class210 local361 = new Class210(local290, local123);
			@Pc(365) int local365 = local32 | 0x4000;
			local205 = arg8.method6910(local361, local365, Static504.anInt5715, 64, 768);
			for (local63 = 0; local63 < 5; local63++) {
				for (local127 = 0; local127 < Static261.aShortArrayArrayArray1.length; local127++) {
					if (Static261.aShortArrayArrayArray1[local127][local63].length > this.anIntArray369[local63]) {
						local205.d(Static177.aShortArrayArray2[local127][local63], Static261.aShortArrayArrayArray1[local127][local63][this.anIntArray369[local63]]);
					}
				}
			}
			local205.SA(local32);
			@Pc(429) Class222 local429 = Static396.aClass222_42;
			synchronized (Static396.aClass222_42) {
				Static396.aClass222_42.method4434(local205, this.aLong148);
			}
		}
		if (arg5 == null) {
			return local205;
		} else {
			local205.method7417((byte) 4, local32, true);
			return arg5.method6264(arg2, arg7, local205, 2048, arg4);
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lclient!rk;ILclient!ga;Lclient!qj;[Lclient!pba;IILclient!r;IILclient!ln;ZLclient!sh;Lclient!dh;Lclient!rk;IBILclient!ud;)Lclient!da;")
	public Class63 method3834(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class114 arg2, @OriginalArg(3) Interface16 arg3, @OriginalArg(4) Class255[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class134 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class211 arg10, @OriginalArg(12) Class305 arg11, @OriginalArg(13) Class71 arg12, @OriginalArg(14) Class290 arg13, @OriginalArg(15) int arg14, @OriginalArg(17) int arg15, @OriginalArg(18) Class326 arg16) {
		if (this.anInt4734 != -1) {
			return arg16.method7234(this.anInt4734).method280(arg7, arg4, arg13, arg11, arg0, arg8, arg9, arg3, arg1, arg5, arg10, arg15, arg14, arg6);
		}
		@Pc(33) int local33 = arg6;
		@Pc(36) long local36 = this.aLong148;
		@Pc(39) int[] local39 = this.anIntArray370;
		if (arg13 != null && (arg13.anInt7803 >= 0 || arg13.anInt7812 >= 0)) {
			local39 = new int[12];
			for (@Pc(52) int local52 = 0; local52 < 12; local52++) {
				local39[local52] = this.anIntArray370[local52];
			}
			if (arg13.anInt7803 >= 0) {
				if (arg13.anInt7803 == 65535) {
					local36 ^= 0xFFFFFFFF00000000L;
					local39[5] = 0;
				} else {
					local39[5] = arg13.anInt7803 | 0x40000000;
					local36 ^= (long) local39[5] << 32;
				}
			}
			if (arg13.anInt7812 >= 0) {
				if (arg13.anInt7812 == 65535) {
					local39[3] = 0;
					local36 ^= 0xFFFFFFFFL;
				} else {
					local39[3] = arg13.anInt7812 | 0x40000000;
					local36 ^= local39[3];
				}
			}
		}
		@Pc(140) boolean local140 = false;
		@Pc(142) boolean local142 = false;
		@Pc(144) boolean local144 = false;
		@Pc(152) boolean local152 = arg13 != null || arg0 != null;
		@Pc(159) int local159 = arg4 == null ? 0 : arg4.length;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(161) int local161 = 0; local161 < local159; local161++) {
			Static177.aClass1_Sub6_Sub1Array2[local161] = null;
			if (arg4[local161] != null) {
				@Pc(181) Class290 local181 = arg10.method4277(arg4[local161].anInt6889);
				if (local181.anIntArray604 != null) {
					Static9.aClass290Array1[local161] = local181;
					local152 = true;
					local195 = arg4[local161].anInt6888;
					local200 = arg4[local161].anInt6897;
					@Pc(205) int local205 = local181.anIntArray604[local195];
					Static177.aClass1_Sub6_Sub1Array2[local161] = arg10.method4272(local205 >>> 16);
					@Pc(218) int local218 = local205 & 0xFFFF;
					Static111.anIntArray194[local161] = local218;
					if (Static177.aClass1_Sub6_Sub1Array2[local161] != null) {
						local142 |= Static177.aClass1_Sub6_Sub1Array2[local161].method348(local218);
						local140 |= Static177.aClass1_Sub6_Sub1Array2[local161].method346(local218);
						local144 |= Static177.aClass1_Sub6_Sub1Array2[local161].method353(local218);
					}
					if ((local181.aBoolean599 || Static444.aBoolean410) && local200 != -1 && local181.anIntArray604.length > local200) {
						Static278.anIntArray504[local161] = local181.anIntArray603[local195];
						Static314.anIntArray423[local161] = arg4[local161].anInt6893;
						@Pc(286) int local286 = local181.anIntArray604[local200];
						Static152.aClass1_Sub6_Sub1Array1[local161] = arg10.method4272(local286 >>> 16);
						@Pc(299) int local299 = local286 & 0xFFFF;
						Static341.anIntArray298[local161] = local299;
						if (Static152.aClass1_Sub6_Sub1Array1[local161] != null) {
							local142 |= Static152.aClass1_Sub6_Sub1Array1[local161].method348(local299);
							local140 |= Static152.aClass1_Sub6_Sub1Array1[local161].method346(local299);
							local144 |= Static152.aClass1_Sub6_Sub1Array1[local161].method353(local299);
						}
					} else {
						Static278.anIntArray504[local161] = 0;
						Static314.anIntArray423[local161] = 0;
						Static152.aClass1_Sub6_Sub1Array1[local161] = null;
						Static341.anIntArray298[local161] = -1;
					}
				}
			}
		}
		@Pc(362) int local362 = -1;
		local195 = -1;
		local200 = 0;
		@Pc(368) Class1_Sub6_Sub1 local368 = null;
		@Pc(370) Class1_Sub6_Sub1 local370 = null;
		@Pc(372) int local372 = -1;
		@Pc(374) int local374 = -1;
		@Pc(376) int local376 = 0;
		@Pc(378) Class1_Sub6_Sub1 local378 = null;
		@Pc(380) Class1_Sub6_Sub1 local380 = null;
		if (local152) {
			local33 = arg6 | 0x20;
			@Pc(397) int local397;
			@Pc(460) int local460;
			if (arg13 != null) {
				local362 = arg13.anIntArray604[arg5];
				local397 = local362 >>> 16;
				local362 &= 0xFFFF;
				local368 = arg10.method4272(local397);
				if (local368 != null) {
					local142 |= local368.method348(local362);
					local140 |= local368.method346(local362);
					local144 |= local368.method353(local362);
				}
				if ((arg13.aBoolean599 || Static444.aBoolean410) && arg15 != -1 && arg15 < arg13.anIntArray604.length) {
					local200 = arg13.anIntArray603[arg5];
					local195 = arg13.anIntArray604[arg15];
					local460 = local195 >>> 16;
					local195 &= 0xFFFF;
					local370 = local460 == local397 ? local368 : arg10.method4272(local460);
					if (local370 != null) {
						local142 |= local370.method348(local195);
						local140 |= local370.method346(local195);
						local144 |= local370.method353(local195);
					}
				}
			}
			if (arg0 != null) {
				local372 = arg0.anIntArray604[arg14];
				local397 = local372 >>> 16;
				local372 &= 0xFFFF;
				local378 = arg10.method4272(local397);
				if (local378 != null) {
					local142 |= local378.method348(local372);
					local140 |= local378.method346(local372);
					local144 |= local378.method353(local372);
				}
				if ((arg0.aBoolean599 || Static444.aBoolean410) && arg8 != -1 && arg8 < arg0.anIntArray604.length) {
					local374 = arg0.anIntArray604[arg8];
					local376 = arg0.anIntArray603[arg14];
					local460 = local374 >>> 16;
					local380 = local397 == local460 ? local378 : arg10.method4272(local460);
					local374 &= 0xFFFF;
					if (local380 != null) {
						local142 |= local380.method348(local374);
						local140 |= local380.method346(local374);
						local144 |= local380.method353(local374);
					}
				}
			}
			if (local142) {
				local33 |= 0x80;
			}
			if (local140) {
				local33 |= 0x100;
			}
			if (local144) {
				local33 |= 0x400;
			}
		}
		@Pc(634) Class222 local634 = Static40.aClass222_2;
		@Pc(642) Class63 local642;
		synchronized (Static40.aClass222_2) {
			local642 = (Class63) Static40.aClass222_2.method4430(local36);
		}
		@Pc(650) Class140 local650 = null;
		if (this.anInt4733 != -1) {
			local650 = arg11.method6490(this.anInt4733);
		}
		@Pc(694) int local694;
		@Pc(700) int local700;
		if (local642 == null || arg7.method6915(local642.PA(), local33) != 0 || local650 != null && local650.anIntArrayArray87 != null && this.anIntArrayArray106 == null) {
			if (local642 != null) {
				local33 = arg7.method6967(local33, local642.PA());
			}
			@Pc(692) boolean local692 = false;
			local694 = 0;
			while (true) {
				if (local694 >= 12) {
					if (local692) {
						if (this.aLong147 != -1L) {
							@Pc(750) Class222 local750 = Static40.aClass222_2;
							synchronized (Static40.aClass222_2) {
								local642 = (Class63) Static40.aClass222_2.method4430(this.aLong147);
							}
						}
						if (local642 == null || arg7.method6915(local642.PA(), local33) != 0 || local650 != null && local650.anIntArrayArray87 != null && this.anIntArrayArray106 == null) {
							return null;
						}
					} else {
						@Pc(791) Class210[] local791 = new Class210[12];
						@Pc(799) int local799;
						for (@Pc(793) int local793 = 0; local793 < 12; local793++) {
							local799 = local39[local793];
							@Pc(816) Class210 local816;
							if ((local799 & 0x40000000) != 0) {
								local816 = arg2.method2217(local799 & 0x3FFFFFFF).method5007(this.aBoolean356);
								if (local816 != null) {
									local791[local793] = local816;
								}
							} else if ((Integer.MIN_VALUE & local799) != 0) {
								local816 = arg12.method1494(local799 & 0x3FFFFFFF).method3694();
								if (local816 != null) {
									local791[local793] = local816;
								}
							}
						}
						@Pc(879) int local879;
						@Pc(872) int local872;
						if (local650 != null && local650.anIntArrayArray87 != null) {
							for (local799 = 0; local799 < local650.anIntArrayArray87.length; local799++) {
								if (local650.anIntArrayArray87[local799] != null && local791[local799] != null) {
									local872 = local650.anIntArrayArray87[local799][0];
									local879 = local650.anIntArrayArray87[local799][1];
									@Pc(886) int local886 = local650.anIntArrayArray87[local799][2];
									@Pc(895) int local895 = local650.anIntArrayArray87[local799][3] << 3;
									@Pc(904) int local904 = local650.anIntArrayArray87[local799][4] << 3;
									@Pc(913) int local913 = local650.anIntArrayArray87[local799][5] << 3;
									if (this.anIntArrayArray106 == null) {
										this.anIntArrayArray106 = new int[local650.anIntArrayArray87.length][];
									}
									if (this.anIntArrayArray106[local799] == null) {
										@Pc(935) int[] local935 = this.anIntArrayArray106[local799] = new int[15];
										if (local895 == 0 && local904 == 0 && local913 == 0) {
											local935[0] = local935[4] = local935[8] = 32768;
											local935[14] = -local886;
											local935[13] = -local879;
											local935[12] = -local872;
										} else {
											@Pc(951) int local951 = Class1_Sub6_Sub2.anIntArray676[local895];
											@Pc(955) int local955 = Class1_Sub6_Sub2.anIntArray675[local895];
											@Pc(959) int local959 = Class1_Sub6_Sub2.anIntArray676[local904];
											@Pc(963) int local963 = Class1_Sub6_Sub2.anIntArray675[local904];
											@Pc(967) int local967 = Class1_Sub6_Sub2.anIntArray676[local913];
											@Pc(971) int local971 = Class1_Sub6_Sub2.anIntArray675[local913];
											@Pc(979) int local979 = local967 * local955 + 8192 >> 14;
											@Pc(987) int local987 = local955 * local971 + 8192 >> 14;
											local935[5] = -local955;
											local935[7] = -local971 * -local963 + local979 * local959 + 8192 >> 14;
											local935[1] = local963 * local979 + -local971 * local959 + 8192 >> 14;
											local935[2] = local963 * local951 + 8192 >> 14;
											local935[4] = local967 * local951 + 8192 >> 14;
											local935[0] = local967 * local959 + local963 * local987 + 8192 >> 14;
											local935[3] = local951 * local971 + 8192 >> 14;
											local935[6] = local967 * -local963 + local987 * local959 + 8192 >> 14;
											local935[8] = local951 * local959 + 8192 >> 14;
											local935[12] = local935[6] * -local886 + local935[3] * -local879 + -local872 * local935[0] + 8192 >> 14;
											local935[14] = -local879 * local935[5] + -local872 * local935[2] + -local886 * local935[8] + 8192 >> 14;
											local935[13] = -local872 * local935[1] + local935[4] * -local879 + local935[7] * -local886 + 8192 >> 14;
										}
										local935[10] = local879;
										local935[9] = local872;
										local935[11] = local886;
									}
									if (local895 != 0 || local904 != 0 || local913 != 0) {
										local791[local799].method4262(local895, local913, local904);
									}
									if (local872 != 0 || local879 != 0 || local886 != 0) {
										local791[local799].method4268(local879, local886, local872);
									}
								}
							}
						}
						@Pc(1273) int local1273 = local33 | 0x4000;
						@Pc(1280) Class210 local1280 = new Class210(local791, local791.length);
						local642 = arg7.method6910(local1280, local1273, Static504.anInt5715, 64, 850);
						for (local872 = 0; local872 < 5; local872++) {
							for (local879 = 0; local879 < Static261.aShortArrayArrayArray1.length; local879++) {
								if (Static261.aShortArrayArrayArray1[local879][local872].length > this.anIntArray369[local872]) {
									local642.d(Static177.aShortArrayArray2[local879][local872], Static261.aShortArrayArrayArray1[local879][local872][this.anIntArray369[local872]]);
								}
							}
						}
						local642.SA(local33);
						@Pc(1344) Class222 local1344 = Static40.aClass222_2;
						synchronized (Static40.aClass222_2) {
							Static40.aClass222_2.method4434(local642, local36);
						}
						this.aLong147 = local36;
					}
					break;
				}
				local700 = local39[local694];
				if ((local700 & 0x40000000) == 0) {
					if ((local700 & Integer.MIN_VALUE) != 0 && !arg12.method1494(local700 & 0x3FFFFFFF).method3696()) {
						local692 = true;
					}
				} else if (!arg2.method2217(local700 & 0x3FFFFFFF).method5010(this.aBoolean356)) {
					local692 = true;
				}
				local694++;
			}
		}
		@Pc(1368) Class63 local1368 = local642.method7417((byte) 4, local33, true);
		if (!local152) {
			return local1368;
		}
		@Pc(1374) int local1374 = 0;
		local694 = 1;
		while (local1374 < local159) {
			if (Static177.aClass1_Sub6_Sub1Array2[local1374] != null) {
				local1368.method7408(Static177.aClass1_Sub6_Sub1Array2[local1374], Static278.anIntArray504[local1374], this.anIntArrayArray106 == null ? null : this.anIntArrayArray106[local1374], local694, Static314.anIntArray423[local1374] - 1, Static152.aClass1_Sub6_Sub1Array1[local1374], false, Static111.anIntArray194[local1374], Static341.anIntArray298[local1374]);
			}
			local1374++;
			local694 <<= 0x1;
		}
		if (local368 != null && local378 != null) {
			local1368.method7431(false, local374, local200, local362, arg9 - 1, local370, arg13.aBooleanArray17, local380, local378, local195, arg1 - 1, local376, local368, local372);
		} else if (local368 != null) {
			local1368.method7410(arg1 - 1, local200, local370, 0, false, local362, local195, local368);
		} else if (local378 != null) {
			local1368.method7410(arg9 - 1, local376, local380, 0, false, local372, local374, local378);
		}
		for (local700 = 0; local700 < local159; local700++) {
			Static177.aClass1_Sub6_Sub1Array2[local700] = null;
			Static152.aClass1_Sub6_Sub1Array1[local700] = null;
			Static9.aClass290Array1[local700] = null;
		}
		return local1368;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(B)V")
	private void method3835() {
		this.aLong148 = -1L;
		@Pc(10) long[] local10 = Class203.aLongArray15;
		this.aLong148 = this.aLong148 >>> 8 ^ local10[(int) ((this.aLong148 ^ (long) (this.anInt4733 >> 8)) & 0xFFL)];
		this.aLong148 = local10[(int) ((this.aLong148 ^ (long) this.anInt4733) & 0xFFL)] ^ this.aLong148 >>> 8;
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong148 = this.aLong148 >>> 8 ^ local10[(int) ((this.aLong148 ^ (long) (this.anIntArray370[local50] >> 24)) & 0xFFL)];
			this.aLong148 = local10[(int) ((this.aLong148 ^ (long) (this.anIntArray370[local50] >> 16)) & 0xFFL)] ^ this.aLong148 >>> 8;
			this.aLong148 = this.aLong148 >>> 8 ^ local10[(int) ((this.aLong148 ^ (long) (this.anIntArray370[local50] >> 8)) & 0xFFL)];
			this.aLong148 = local10[(int) (((long) this.anIntArray370[local50] ^ this.aLong148) & 0xFFL)] ^ this.aLong148 >>> 8;
		}
		for (@Pc(146) int local146 = 0; local146 < 5; local146++) {
			this.aLong148 = local10[(int) (((long) this.anIntArray369[local146] ^ this.aLong148) & 0xFFL)] ^ this.aLong148 >>> 8;
		}
		this.aLong148 = local10[(int) ((this.aLong148 ^ (long) (this.aBoolean356 ? 1 : 0)) & 0xFFL)] ^ this.aLong148 >>> 8;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIILclient!dh;)V")
	public void method3836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class71 arg2) {
		@Pc(7) int local7 = Static418.anIntArray561[arg1];
		if (arg2.method1494(arg0) != null) {
			this.anIntArray370[local7] = Integer.MIN_VALUE | arg0;
			this.method3835();
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIBIILclient!ln;Lclient!rk;ILclient!dh;Lclient!r;II)Lclient!da;")
	public Class63 method3837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class211 arg3, @OriginalArg(6) Class290 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class71 arg6, @OriginalArg(9) Class134 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(102) int local102;
		@Pc(38) int local38;
		if (arg4 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			local7 = 2080;
			@Pc(34) int local34 = arg4.anIntArray604[arg9];
			local38 = local34 >>> 16;
			@Pc(45) Class1_Sub6_Sub1 local45 = arg3.method4272(local38);
			@Pc(49) int local49 = local34 & 0xFFFF;
			if (local45 != null) {
				local13 = local45.method348(local49) | false;
				local11 = local45.method346(local49) | false;
				local17 = local45.method353(local49) | false;
				local15 = arg4.aBoolean603 | false;
			}
			if ((arg4.aBoolean599 || Static444.aBoolean410) && arg2 != -1 && arg4.anIntArray604.length > arg2) {
				local102 = arg4.anIntArray604[arg2];
				@Pc(106) int local106 = local102 >>> 16;
				@Pc(110) int local110 = local102 & 0xFFFF;
				@Pc(120) Class1_Sub6_Sub1 local120;
				if (local38 == local106) {
					local120 = local45;
				} else {
					local120 = arg3.method4272(local110 >>> 16);
				}
				if (local120 != null) {
					local13 |= local120.method348(local110);
					local11 |= local120.method346(local110);
					local17 |= local120.method353(local110);
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
		@Pc(190) long local190 = (long) arg0 | (long) arg8 << 32 | (long) (arg5 << 16);
		@Pc(192) Class222 local192 = Static396.aClass222_42;
		@Pc(200) Class63 local200;
		synchronized (Static396.aClass222_42) {
			local200 = (Class63) Static396.aClass222_42.method4430(local190);
		}
		if (local200 == null || arg7.method6915(local200.PA(), local7) != 0) {
			if (local200 != null) {
				local7 = arg7.method6967(local7, local200.PA());
			}
			@Pc(230) Class210[] local230 = new Class210[3];
			local102 = 0;
			if (!arg6.method1494(arg0).method3695() || !arg6.method1494(arg5).method3695() || !arg6.method1494(arg8).method3695()) {
				return null;
			}
			@Pc(262) Class210 local262 = arg6.method1494(arg0).method3691();
			if (local262 != null) {
				local102++;
				local230[0] = local262;
			}
			local262 = arg6.method1494(arg5).method3691();
			if (local262 != null) {
				local230[local102++] = local262;
			}
			local262 = arg6.method1494(arg8).method3691();
			if (local262 != null) {
				local230[local102++] = local262;
			}
			local262 = new Class210(local230, local102);
			@Pc(307) int local307 = local7 | 0x4000;
			local200 = arg7.method6910(local262, local307, Static504.anInt5715, 64, 768);
			for (@Pc(317) int local317 = 0; local317 < 5; local317++) {
				for (local38 = 0; local38 < Static261.aShortArrayArrayArray1.length; local38++) {
					if (Static261.aShortArrayArrayArray1[local38][local317].length > this.anIntArray369[local317]) {
						local200.d(Static177.aShortArrayArray2[local38][local317], Static261.aShortArrayArrayArray1[local38][local317][this.anIntArray369[local317]]);
					}
				}
			}
			local200.SA(local7);
			@Pc(371) Class222 local371 = Static396.aClass222_42;
			synchronized (Static396.aClass222_42) {
				Static396.aClass222_42.method4434(local200, local190);
			}
		}
		if (arg4 == null) {
			return local200;
		} else {
			local200 = local200.method7417((byte) 4, local7, true);
			return arg4.method6264(arg1, arg2, local200, 2048, arg9);
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IZ)V")
	public void method3838(@OriginalArg(1) boolean arg0) {
		this.aBoolean356 = arg0;
		this.method3835();
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IILclient!ga;I)V")
	public void method3840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class114 arg2) {
		if (arg1 == -1) {
			this.anIntArray370[arg0] = 0;
		} else if (arg2.method2217(arg1) != null) {
			this.anIntArray370[arg0] = arg1 | 0x40000000;
			this.method3835();
		}
	}
}
