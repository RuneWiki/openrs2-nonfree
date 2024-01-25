import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public class Class70 {

	@OriginalMember(owner = "client!ls", name = "x", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "[I")
	private final int[] anIntArray171 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "[I")
	private final int[] anIntArray170 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!ls", name = "i", descriptor = "I")
	public final int anInt2459;

	@OriginalMember(owner = "client!ls", name = "p", descriptor = "Z")
	public final boolean aBoolean202;

	@OriginalMember(owner = "client!ls", name = "y", descriptor = "I")
	protected final int anInt2468;

	@OriginalMember(owner = "client!ls", name = "B", descriptor = "Lclient!lf;")
	private final Class201 aClass201_2;

	@OriginalMember(owner = "client!ls", name = "z", descriptor = "Lclient!sfa;")
	private final Class305 aClass305_3;

	@OriginalMember(owner = "client!ls", name = "m", descriptor = "I")
	protected final int anInt2463;

	@OriginalMember(owner = "client!ls", name = "q", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!ls", name = "u", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!ls", name = "t", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!ls", name = "w", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!ls", name = "o", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(IIIZLclient!sfa;Lclient!lf;)V")
	protected Class70(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class305 arg4, @OriginalArg(5) Class201 arg5) {
		this.anInt2459 = arg0;
		this.aBoolean202 = arg3;
		this.anInt2468 = arg2;
		this.aClass201_2 = arg5;
		this.aClass305_3 = arg4;
		this.anInt2463 = arg1;
		this.aByteArrayArrayArray10 = new byte[this.anInt2459][this.anInt2463 + 1][this.anInt2468 + 1];
		this.aByteArrayArrayArray12 = new byte[this.anInt2459][this.anInt2463][this.anInt2468];
		this.aByteArrayArrayArray11 = new byte[this.anInt2459][this.anInt2463][this.anInt2468];
		this.aByteArrayArrayArray13 = new byte[this.anInt2459][this.anInt2463][this.anInt2468];
		this.aByteArrayArrayArray9 = new byte[this.anInt2459][this.anInt2463][this.anInt2468];
		this.anIntArrayArrayArray5 = new int[this.anInt2459][this.anInt2463 + 1][this.anInt2468 + 1];
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!r;Lclient!i;Lclient!i;Lclient!i;[[III)V")
	private void method2200(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class139 arg1, @OriginalArg(2) Class139 arg2, @OriginalArg(3) Class139 arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(6) int arg5) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2463; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt2468; local7++) {
				if (Static509.anInt8091 == -1 || Static1.method6(Static509.anInt8091, arg5, local7, local3)) {
					@Pc(31) byte local31 = this.aByteArrayArrayArray11[arg5][local3][local7];
					@Pc(40) byte local40 = this.aByteArrayArrayArray9[arg5][local3][local7];
					@Pc(51) int local51 = this.aByteArrayArrayArray12[arg5][local3][local7] & 0xFF;
					@Pc(62) int local62 = this.aByteArrayArrayArray13[arg5][local3][local7] & 0xFF;
					@Pc(77) Class83 local77 = local51 == 0 ? null : this.aClass305_3.method6565(local51 - 1);
					@Pc(92) Class183 local92 = local62 == 0 ? null : this.aClass201_2.method4715(local62 - 1);
					@Pc(94) int local94 = 0;
					@Pc(96) int local96 = 0;
					if (local31 != 0) {
						local94 = local92 == null ? 0 : Static338.anIntArray468[local31];
						local96 = local77 == null ? 0 : Static508.anIntArray620[local31];
					} else if (local77 != null) {
						local96 = Static508.anIntArray620[local31];
					} else if (local92 != null) {
						local94 = Static508.anIntArray620[local31];
					}
					@Pc(135) int local135 = local96 + local94;
					@Pc(137) int local137 = 0;
					if (local135 != 0) {
						@Pc(143) int local143;
						if (Static504.aBoolean626) {
							local143 = local77 == null ? -1 : local77.anInt2794;
						} else {
							local143 = -1;
						}
						@Pc(155) int[] local155 = new int[local135];
						@Pc(158) int[] local158 = new int[local135];
						@Pc(161) int[] local161 = new int[local135];
						@Pc(164) int[] local164 = new int[local135];
						@Pc(166) boolean local166 = false;
						@Pc(181) int local181;
						if (local77 == null || local77.anInt2798 == -1 && local77.anInt2791 == -1 && local143 == -1) {
							for (local181 = 0; local181 < local96; local181++) {
								local155[local137] = -1;
								local137++;
							}
						} else {
							for (local181 = 0; local181 < local96; local181++) {
								local161[local137] = local143;
								local164[local137] = local77.anInt2789;
								if (local77.anInt2798 == -1) {
									local155[local137] = -1;
								} else {
									local155[local137] = local77.anInt2798;
								}
								if (local77.anInt2791 == -1) {
									local158[local137] = -1;
								} else {
									local158[local137] = local77.anInt2791;
									local166 = true;
								}
								local137++;
							}
							if (!this.aBoolean202 && arg5 == 0) {
								Static354.method5308(local3, local7, local77.anInt2790, local77.anInt2787 * 8, local77.anInt2796);
							}
						}
						if (!local166) {
							local158 = null;
						}
						if (local92 == null) {
							for (local181 = 0; local181 < local94; local181++) {
								local155[local137] = -1;
								local137++;
							}
						} else {
							local181 = local92.anInt5052;
							if (Static504.aBoolean626) {
								local181 = -1;
							}
							for (@Pc(288) int local288 = 0; local288 < local94; local288++) {
								local161[local137] = local181;
								local164[local137] = local92.anInt5055;
								local155[local137] = arg4[local3][local7];
								if (local158 != null) {
									local158[local137] = -1;
								}
								local137++;
							}
						}
						local181 = this.anIntArray171.length;
						@Pc(344) int[] local344 = new int[local181];
						@Pc(347) int[] local347 = new int[local181];
						@Pc(354) int[] local354 = arg3 == null ? null : new int[local181];
						@Pc(363) int[] local363 = arg3 == null && arg1 == null ? null : new int[local181];
						@Pc(372) int local372;
						@Pc(377) int local377;
						@Pc(461) int local461;
						@Pc(467) int local467;
						for (@Pc(365) int local365 = 0; local365 < local181; local365++) {
							local372 = this.anIntArray171[local365];
							local377 = this.anIntArray170[local365];
							if (local40 == 0) {
								local344[local365] = local372;
								local347[local365] = local377;
							} else if (local40 == 1) {
								local344[local365] = local377;
								local347[local365] = 512 - local372;
							} else if (local40 == 2) {
								local344[local365] = 512 - local372;
								local347[local365] = 512 - local377;
							} else if (local40 == 3) {
								local344[local365] = 512 - local377;
								local347[local365] = local372;
							}
							if (local354 != null && Static506.aBooleanArrayArray6[local31][local365]) {
								local461 = local372 + (local3 << 9);
								local467 = (local7 << 9) + local372;
								local354[local365] = arg3.method6890(local461, local467) - arg2.method6890(local461, local467);
							}
							if (local363 != null) {
								if (arg3 != null && !Static506.aBooleanArrayArray6[local31][local365]) {
									local461 = (local3 << 9) + local372;
									local467 = local372 + (local7 << 9);
									local363[local365] = arg2.method6890(local461, local467) - arg3.method6890(local461, local467);
								} else if (arg1 != null && !Static250.aBooleanArrayArray2[local31][local365]) {
									local461 = (local3 << 9) + local372;
									local467 = (local7 << 9) + local372;
									local363[local365] = arg1.method6890(local461, local467) - arg2.method6890(local461, local467);
								}
							}
						}
						local372 = arg2.method6889(local3, local7);
						local377 = arg2.method6889(local3 + 1, local7);
						local461 = arg2.method6889(local3 + 1, local7 + 1);
						local467 = arg2.method6889(local3, local7 + 1);
						@Pc(600) boolean local600 = Static425.method6053(local3, local7);
						if (local600 && arg5 > 1 || !local600 && arg5 > 0) {
							@Pc(613) boolean local613 = true;
							if (local92 != null && !local92.aBoolean394) {
								local613 = false;
							} else if (local62 == 0 && local31 != 0) {
								local613 = false;
							} else if (local51 > 0 && local77 != null && !local77.aBoolean235) {
								local613 = false;
							}
							if (local613 && local372 == local377 && local461 == local372 && local372 == local467) {
								this.aByteArrayArrayArray10[arg5][local3][local7] = (byte) (this.aByteArrayArrayArray10[arg5][local3][local7] | 0x4);
							}
						}
						@Pc(681) int local681 = 0;
						@Pc(683) int local683 = 0;
						@Pc(685) int local685 = 0;
						if (this.aBoolean202) {
							local681 = Static280.method4440(local3, local7);
							local683 = Static474.method6508(local3, local7);
							local685 = Static227.method3892(local3, local7);
						}
						arg2.method6884(local3, local7, local344, local354, local347, local363, Static263.anIntArrayArray36[local31], Static300.anIntArrayArray42[local31], Static121.anIntArrayArray19[local31], local155, local158, local161, local164, local681, local683, local685);
						Static228.method1799(arg5, local3, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "([Lclient!fh;ILclient!qh;IIIIIII)V")
	public final void method2201(@OriginalArg(0) Class95[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub11 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg6 & 0x7) * 8;
		@Pc(20) int local20;
		if (!this.aBoolean202) {
			@Pc(18) Class95 local18 = arg0[arg7];
			for (local20 = 0; local20 < 8; local20++) {
				for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
					@Pc(38) int local38 = Static131.method2570(local20 & 0x7, arg4, local24 & 0x7) + arg8;
					@Pc(51) int local51 = arg1 + Static189.method3257(local20 & 0x7, local24 & 0x7, arg4);
					if (local38 > 0 && local38 < this.anInt2463 - 1 && local51 > 0 && this.anInt2468 - 1 > local51) {
						local18.method2744(local38, local51);
					}
				}
			}
		}
		@Pc(96) int local96 = (arg5 & 0x7) * 8;
		@Pc(102) int local102 = (arg6 & 0x1FFFFFF8) << 3;
		local20 = (arg5 & 0x1FFFFFF8) << 3;
		@Pc(110) byte local110 = 0;
		@Pc(112) byte local112 = 0;
		if (arg4 == 1) {
			local112 = 1;
		} else if (arg4 == 2) {
			local110 = 1;
			local112 = 1;
		} else if (arg4 == 3) {
			local110 = 1;
		}
		for (@Pc(147) int local147 = 0; local147 < this.anInt2459; local147++) {
			for (@Pc(151) int local151 = 0; local151 < 64; local151++) {
				for (@Pc(155) int local155 = 0; local155 < 64; local155++) {
					if (arg3 == local147 && local11 <= local151 && local151 <= local11 + 8 && local155 >= local96 && local96 + 8 >= local155) {
						@Pc(208) int local208;
						@Pc(215) int local215;
						if (local11 + 8 == local151 || local155 == local96 + 8) {
							if (arg4 == 0) {
								local208 = local151 + arg8 - local11;
								local215 = arg1 + local155 - local96;
							} else if (arg4 == 1) {
								local215 = arg1 + local11 + 8 - local151;
								local208 = local155 + arg8 - local96;
							} else if (arg4 == 2) {
								local215 = arg1 + local96 + 8 - local155;
								local208 = arg8 + local11 + 8 - local151;
							} else {
								local208 = local96 + arg8 + 8 - local155;
								local215 = local151 + arg1 - local11;
							}
							this.method2210(local20 + local155, arg2, local208, 0, true, 0, arg7, local151 + local102, local215, 0);
						} else {
							local208 = arg8 + Static131.method2570(local151 & 0x7, arg4, local155 & 0x7);
							local215 = arg1 + Static189.method3257(local151 & 0x7, local155 & 0x7, arg4);
							this.method2210(local20 + local155, arg2, local208, local110, false, local112, arg7, local151 + local102, local215, arg4);
						}
						if (local151 == 63 || local155 == 63) {
							@Pc(352) byte local352 = 1;
							if (local151 == 63 && local155 == 63) {
								local352 = 3;
							}
							for (@Pc(364) int local364 = 0; local364 < local352; local364++) {
								@Pc(368) int local368 = local151;
								@Pc(370) int local370 = local155;
								if (local364 == 0) {
									local370 = local155 == 63 ? 64 : local155;
									local368 = local151 == 63 ? 64 : local151;
								} else if (local364 == 1) {
									local368 = 64;
								} else if (local364 == 2) {
									local370 = 64;
								}
								@Pc(430) int local430;
								@Pc(423) int local423;
								if (arg4 == 0) {
									local430 = arg8 + local368 - local11;
									local423 = local370 + arg1 - local96;
								} else if (arg4 == 1) {
									local423 = local11 + arg1 + 8 - local368;
									local430 = arg8 + local370 - local96;
								} else if (arg4 == 2) {
									local430 = arg8 + local11 + 8 - local368;
									local423 = arg1 + local96 + 8 - local370;
								} else {
									local430 = arg8 + local96 + 8 - local370;
									local423 = arg1 + local368 - local11;
								}
								if (local430 >= 0 && this.anInt2463 > local430 && local423 >= 0 && this.anInt2468 > local423) {
									this.anIntArrayArrayArray5[arg7][local430][local423] = this.anIntArrayArrayArray5[arg7][local208 + local110][local215 + local112];
								}
							}
						}
					} else {
						this.method2210(0, arg2, -1, 0, false, 0, 0, 0, -1, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!i;Lclient!i;Lclient!r;I)V")
	public final void method2202(@OriginalArg(0) Class139 arg0, @OriginalArg(1) Class139 arg1, @OriginalArg(2) Class43 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt2463][this.anInt2468];
		if (Static83.anIntArray134 == null || Static83.anIntArray134.length != this.anInt2468) {
			Static83.anIntArray134 = new int[this.anInt2468];
			Static367.anIntArray497 = new int[this.anInt2468];
			Static15.anIntArray27 = new int[this.anInt2468];
			Static442.anIntArray641 = new int[this.anInt2468];
			Static233.anIntArray359 = new int[this.anInt2468];
		}
		@Pc(48) int local48;
		for (@Pc(44) int local44 = 0; local44 < this.anInt2459; local44++) {
			for (local48 = 0; local48 < this.anInt2468; local48++) {
				Static83.anIntArray134[local48] = 0;
				Static15.anIntArray27[local48] = 0;
				Static442.anIntArray641[local48] = 0;
				Static233.anIntArray359[local48] = 0;
				Static367.anIntArray497[local48] = 0;
			}
			for (@Pc(77) int local77 = -5; local77 < this.anInt2463; local77++) {
				@Pc(87) int local87;
				@Pc(102) int local102;
				@Pc(171) int local171;
				for (@Pc(81) int local81 = 0; local81 < this.anInt2468; local81++) {
					local87 = local77 + 5;
					@Pc(151) int local151;
					if (this.anInt2463 > local87) {
						local102 = this.aByteArrayArrayArray13[local44][local87][local81] & 0xFF;
						if (local102 > 0) {
							@Pc(115) Class183 local115 = this.aClass201_2.method4715(local102 - 1);
							Static83.anIntArray134[local81] += local115.anInt5062;
							Static15.anIntArray27[local81] += local115.anInt5053;
							Static442.anIntArray641[local81] += local115.anInt5051;
							Static233.anIntArray359[local81] += local115.anInt5056;
							local151 = Static367.anIntArray497[local81]++;
						}
					}
					local102 = local77 - 5;
					if (local102 >= 0) {
						local171 = this.aByteArrayArrayArray13[local44][local102][local81] & 0xFF;
						if (local171 > 0) {
							@Pc(184) Class183 local184 = this.aClass201_2.method4715(local171 - 1);
							Static83.anIntArray134[local81] -= local184.anInt5062;
							Static15.anIntArray27[local81] -= local184.anInt5053;
							Static442.anIntArray641[local81] -= local184.anInt5051;
							Static233.anIntArray359[local81] -= local184.anInt5056;
							local151 = Static367.anIntArray497[local81]--;
						}
					}
				}
				if (local77 >= 0) {
					local87 = 0;
					local102 = 0;
					local171 = 0;
					@Pc(245) int local245 = 0;
					@Pc(247) int local247 = 0;
					for (@Pc(249) int local249 = -5; local249 < this.anInt2468; local249++) {
						@Pc(255) int local255 = local249 + 5;
						if (local255 < this.anInt2468) {
							local87 += Static83.anIntArray134[local255];
							local245 += Static233.anIntArray359[local255];
							local247 += Static367.anIntArray497[local255];
							local102 += Static15.anIntArray27[local255];
							local171 += Static442.anIntArray641[local255];
						}
						@Pc(293) int local293 = local249 - 5;
						if (local293 >= 0) {
							local171 -= Static442.anIntArray641[local293];
							local102 -= Static15.anIntArray27[local293];
							local247 -= Static367.anIntArray497[local293];
							local245 -= Static233.anIntArray359[local293];
							local87 -= Static83.anIntArray134[local293];
						}
						if (local249 >= 0 && local245 > 0 && local247 > 0) {
							local11[local77][local249] = Static146.method2756(local87 * 256 / local245, local171 / local247, local102 / local247);
						}
					}
				}
			}
			if (Static76.aBoolean164) {
				this.method2206(arg2, local44 == 0 ? arg0 : null, Static29.aClass139Array6[local44], local11, local44 == 0 ? arg1 : null, local44);
			} else {
				this.method2200(arg2, local44 == 0 ? arg0 : null, Static29.aClass139Array6[local44], local44 == 0 ? arg1 : null, local11, local44);
			}
			this.aByteArrayArrayArray13[local44] = null;
			this.aByteArrayArrayArray12[local44] = null;
			this.aByteArrayArrayArray11[local44] = null;
			this.aByteArrayArrayArray9[local44] = null;
		}
		if (!this.aBoolean202) {
			if (Static118.anInt2701 != 0) {
				Static151.method2791();
			}
			if (Static130.aBoolean241) {
				Static15.method244();
			}
		}
		for (local48 = 0; local48 < this.anInt2459; local48++) {
			Static29.aClass139Array6[local48].BA();
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ILclient!qh;II[Lclient!fh;II)V")
	public final void method2203(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class95[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) int local18;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(36) int local36;
		if (!this.aBoolean202) {
			for (local18 = 0; local18 < 4; local18++) {
				@Pc(24) Class95 local24 = arg3[local18];
				for (local26 = 0; local26 < 64; local26++) {
					for (local30 = 0; local30 < 64; local30++) {
						local36 = arg1 + local26;
						@Pc(41) int local41 = arg5 + local30;
						if (local36 >= 0 && this.anInt2463 > local36 && local41 >= 0 && this.anInt2468 > local41) {
							local24.method2744(local36, local41);
						}
					}
				}
			}
		}
		local18 = arg2 + arg1;
		@Pc(82) int local82 = arg4 + arg5;
		for (local26 = 0; local26 < this.anInt2459; local26++) {
			for (local30 = 0; local30 < 64; local30++) {
				for (local36 = 0; local36 < 64; local36++) {
					this.method2210(local36 + local82, arg0, local30 + arg1, 0, false, 0, local26, local18 + local30, local36 - -arg5, 0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I[[II)V")
	public final void method2204(@OriginalArg(1) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray5[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt2463 + 1; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt2468 + 1; local16++) {
				local10[local12][local16] += arg0[local12][local16];
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIII)V")
	public final void method2205(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2459; local7++) {
			this.method2209(arg1, arg0, local7);
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!r;Lclient!i;ILclient!i;[[ILclient!i;I)V")
	private void method2206(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class139 arg1, @OriginalArg(3) Class139 arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) Class139 arg4, @OriginalArg(6) int arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray11[arg5];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray9[arg5];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray13[arg5];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray12[arg5];
		for (@Pc(27) int local27 = 0; local27 < this.anInt2463; local27++) {
			@Pc(45) int local45 = this.anInt2463 - 1 > local27 ? local27 + 1 : local27;
			for (@Pc(47) int local47 = 0; local47 < this.anInt2468; local47++) {
				@Pc(65) int local65 = local47 >= this.anInt2468 - 1 ? local47 : local47 + 1;
				if (Static509.anInt8091 == -1 || Static1.method6(Static509.anInt8091, arg5, local47, local27)) {
					@Pc(80) boolean local80 = false;
					@Pc(82) boolean local82 = false;
					@Pc(85) boolean[] local85 = new boolean[4];
					@Pc(91) int local91 = local10[local27][local47];
					@Pc(97) int local97 = local15[local27][local47];
					@Pc(105) int local105 = local25[local27][local47] & 0xFF;
					@Pc(113) int local113 = local20[local27][local47] & 0xFF;
					@Pc(121) int local121 = local20[local27][local65] & 0xFF;
					@Pc(129) int local129 = local20[local45][local65] & 0xFF;
					@Pc(137) int local137 = local20[local45][local47] & 0xFF;
					if (local105 != 0 || local113 != 0) {
						@Pc(159) Class83 local159 = local105 == 0 ? null : this.aClass305_3.method6565(local105 - 1);
						if (local91 == 0 && local159 == null) {
							local91 = 12;
						}
						@Pc(177) Class183 local177 = local113 == 0 ? null : this.aClass201_2.method4715(local113 - 1);
						@Pc(179) Class83 local179 = local159;
						if (local159 != null) {
							if (local159.anInt2798 == -1 && local159.anInt2791 == -1) {
								local179 = local159;
								local159 = null;
							} else if (local177 != null && local91 != 0) {
								local82 = local159.aBoolean237;
							}
						}
						@Pc(255) int local255;
						@Pc(308) int local308;
						@Pc(376) int local376;
						@Pc(389) int local389;
						if ((local91 == 0 || local91 == 12) && local27 > 0 && local47 > 0 && local27 < this.anInt2463 && this.anInt2468 > local47) {
							local255 = local113 == local20[local27 - 1][local47 - 1] ? 1 : -1;
							@Pc(272) int local272 = local20[local45][local65] == local113 ? 1 : -1;
							@Pc(289) int local289 = local113 == local20[local45][local47 - 1] ? 1 : -1;
							local308 = local113 == local20[local27 - 1][local65] ? 1 : -1;
							if (local113 == local20[local27][local47 - 1]) {
								local289++;
								local255++;
							} else {
								local255--;
								local289--;
							}
							if (local20[local45][local47] == local113) {
								local289++;
								local272++;
							} else {
								local272--;
								local289--;
							}
							if (local113 == local20[local27][local65]) {
								local308++;
								local272++;
							} else {
								local272--;
								local308--;
							}
							if (local20[local27 - 1][local47] == local113) {
								local308++;
								local255++;
							} else {
								local255--;
								local308--;
							}
							local376 = local255 - local272;
							if (local376 < 0) {
								local376 = -local376;
							}
							local389 = local289 - local308;
							if (local389 < 0) {
								local389 = -local389;
							}
							if (local376 == local389) {
								local376 = arg2.method6889(local27, local47) - arg2.method6889(local45, local65);
								if (local376 < 0) {
									local376 = -local376;
								}
								local389 = arg2.method6889(local45, local47) - arg2.method6889(local27, local65);
								if (local389 < 0) {
									local389 = -local389;
								}
							}
							local97 = local376 >= local389 ? 0 : 1;
						}
						for (local255 = 0; local255 < 13; local255++) {
							Static460.anIntArray583[local255] = -1;
							Static204.anIntArray327[local255] = 1;
						}
						@Pc(470) boolean[] local470 = local159 != null && local159.aBoolean237 ? Static287.aBooleanArrayArray3[local91] : Static299.aBooleanArrayArray4[local91];
						this.method2207(local25, local177, this.anInt2463, local10, local97, local85, local15, local91, local159, arg0, local27, this.anInt2468, local47);
						@Pc(501) boolean local501 = local159 != null && local159.anInt2791 != local159.anInt2798;
						if (!local501) {
							for (local308 = 0; local308 < 8; local308++) {
								if (Static460.anIntArray583[local308] >= 0 && Static267.anIntArray377[local308] != Static470.anIntArray595[local308]) {
									local501 = true;
									break;
								}
							}
						}
						if (!local470[local97 + 1 & 0x3]) {
							local85[1] = Static477.method6551(local85[1], (Static204.anIntArray327[2] & Static204.anIntArray327[4]) == 0);
						}
						if (!local470[local97 + 3 & 0x3]) {
							local85[3] = Static477.method6551(local85[3], (Static204.anIntArray327[6] & Static204.anIntArray327[0]) == 0);
						}
						if (!local470[local97 & 0x3]) {
							local85[0] = Static477.method6551(local85[0], (Static204.anIntArray327[0] & Static204.anIntArray327[2]) == 0);
						}
						if (!local470[local97 + 2 & 0x3]) {
							local85[2] = Static477.method6551(local85[2], (Static204.anIntArray327[6] & Static204.anIntArray327[4]) == 0);
						}
						if (!local82 && (local91 == 0 || local91 == 12)) {
							if (local85[0] && !local85[1] && !local85[2] && local85[3]) {
								local97 = 0;
								local91 = local91 == 0 ? 13 : 14;
								local85[0] = local85[3] = false;
							} else if (local85[0] && local85[1] && !local85[2] && !local85[3]) {
								local91 = local91 == 0 ? 13 : 14;
								local85[0] = local85[1] = false;
								local97 = 3;
							} else if (!local85[0] && local85[1] && local85[2] && !local85[3]) {
								local91 = local91 == 0 ? 13 : 14;
								local85[1] = local85[2] = false;
								local97 = 2;
							} else if (!local85[0] && !local85[1] && local85[2] && local85[3]) {
								local91 = local91 == 0 ? 13 : 14;
								local97 = 1;
								local85[2] = local85[3] = false;
							}
						}
						@Pc(803) boolean local803 = !local82 && !local85[0] && !local85[2] && !local85[1] && !local85[3];
						@Pc(805) int[] local805 = null;
						@Pc(813) int[] local813;
						@Pc(829) int[] local829;
						@Pc(817) int[] local817;
						if (local803) {
							local376 = local177 == null ? 0 : Static338.anIntArray468[local91];
							local817 = Static121.anIntArrayArray19[local91];
							local813 = Static263.anIntArrayArray36[local91];
							local389 = local159 == null ? 0 : Static508.anIntArray620[local91];
							local829 = Static300.anIntArrayArray42[local91];
						} else if (local82) {
							local376 = local177 == null ? 0 : Static17.anIntArray31[local91];
							local829 = Static502.anIntArrayArray62[local91];
							local805 = Static283.anIntArrayArray11[local91];
							local817 = Static452.anIntArrayArray55[local91];
							local813 = Static332.anIntArrayArray48[local91];
							local389 = local159 == null ? 0 : Static347.anIntArray473[local91];
						} else {
							local813 = Static239.anIntArrayArray35[local91];
							local817 = Static59.anIntArrayArray38[local91];
							local376 = local177 == null ? 0 : Static213.anIntArray341[local91];
							local829 = Static576.anIntArrayArray71[local91];
							local389 = local159 == null ? 0 : Static89.anIntArray141[local91];
							local805 = Static114.anIntArrayArray12[local91];
						}
						@Pc(907) int local907 = local376 + local389;
						if (local907 <= 0) {
							Static228.method1799(arg5, local27, local47);
						} else {
							if (local85[0]) {
								local907++;
							}
							if (local85[2]) {
								local907++;
							}
							if (local85[1]) {
								local907++;
							}
							if (local85[3]) {
								local907++;
							}
							@Pc(937) int local937 = 0;
							@Pc(939) int local939 = 0;
							@Pc(943) int local943 = local907 * 3;
							@Pc(950) int[] local950 = local501 ? new int[local943] : null;
							@Pc(953) int[] local953 = new int[local943];
							@Pc(956) int[] local956 = new int[local943];
							@Pc(959) int[] local959 = new int[local943];
							@Pc(962) int[] local962 = new int[local943];
							@Pc(965) int[] local965 = new int[local943];
							@Pc(972) int[] local972 = arg4 == null ? null : new int[local943];
							@Pc(981) int[] local981 = arg4 == null && arg1 == null ? null : new int[local943];
							@Pc(983) int local983 = -1;
							@Pc(985) int local985 = -1;
							@Pc(987) int local987 = 256;
							@Pc(1117) byte local1117;
							@Pc(1031) int local1031;
							@Pc(1033) int local1033;
							@Pc(1266) int local1266;
							@Pc(1272) int local1272;
							@Pc(1281) int local1281;
							@Pc(1286) int local1286;
							@Pc(1303) int local1303;
							@Pc(1291) int local1291;
							@Pc(1301) int local1301;
							@Pc(1359) int local1359;
							@Pc(1365) int local1365;
							if (local159 != null) {
								local985 = local159.anInt2794;
								local987 = local159.anInt2789;
								local983 = local159.anInt2798;
								local1031 = Static316.method7574(arg0, local159);
								for (local1033 = 0; local1033 < local389; local1033++) {
									if (local85[-local97 & 0x3] && local937 == local805[0]) {
										Static98.anIntArray160[0] = local813[local937];
										Static98.anIntArray160[1] = 1;
										Static98.anIntArray160[2] = local817[local937];
										Static98.anIntArray160[3] = 1;
										Static98.anIntArray160[4] = local829[local937];
										Static98.anIntArray160[5] = local817[local937];
										local1117 = 6;
									} else if (local85[2 - local97 & 0x3] && local805[2] == local937) {
										Static98.anIntArray160[0] = local813[local937];
										Static98.anIntArray160[1] = 5;
										Static98.anIntArray160[2] = local817[local937];
										Static98.anIntArray160[3] = 5;
										Static98.anIntArray160[4] = local829[local937];
										Static98.anIntArray160[5] = local817[local937];
										local1117 = 6;
									} else if (local85[1 - local97 & 0x3] && local805[1] == local937) {
										Static98.anIntArray160[0] = local813[local937];
										Static98.anIntArray160[1] = 3;
										Static98.anIntArray160[2] = local817[local937];
										Static98.anIntArray160[3] = 3;
										Static98.anIntArray160[4] = local829[local937];
										Static98.anIntArray160[5] = local817[local937];
										local1117 = 6;
									} else if (local85[3 - local97 & 0x3] && local805[3] == local937) {
										Static98.anIntArray160[0] = local813[local937];
										Static98.anIntArray160[1] = 7;
										Static98.anIntArray160[2] = local817[local937];
										Static98.anIntArray160[3] = 7;
										Static98.anIntArray160[4] = local829[local937];
										Static98.anIntArray160[5] = local817[local937];
										local1117 = 6;
									} else {
										Static98.anIntArray160[0] = local813[local937];
										Static98.anIntArray160[1] = local829[local937];
										Static98.anIntArray160[2] = local817[local937];
										local1117 = 3;
									}
									for (local1266 = 0; local1266 < local1117; local1266++) {
										local1272 = Static98.anIntArray160[local1266];
										local1281 = local1272 - local97 * 2 & 0x7;
										local1286 = this.anIntArray171[local1272];
										local1291 = this.anIntArray170[local1272];
										if (local97 == 1) {
											local1301 = 512 - local1286;
											local1303 = local1291;
										} else if (local97 == 2) {
											local1301 = 512 - local1291;
											local1303 = 512 - local1286;
										} else if (local97 == 3) {
											local1303 = 512 - local1291;
											local1301 = local1286;
										} else {
											local1301 = local1291;
											local1303 = local1286;
										}
										local953[local939] = local1303;
										local956[local939] = local1301;
										if (local972 != null && Static506.aBooleanArrayArray6[local91][local1272]) {
											local1359 = local1303 + (local27 << 9);
											local1365 = local1301 + (local47 << 9);
											local972[local939] = arg4.method6890(local1359, local1365) - arg2.method6890(local1359, local1365);
										}
										if (local981 != null) {
											if (arg4 != null && !Static506.aBooleanArrayArray6[local91][local1272]) {
												local1359 = local1303 + (local27 << 9);
												local1365 = (local47 << 9) + local1301;
												local981[local939] = arg2.method6890(local1359, local1365) - arg4.method6890(local1359, local1365);
											} else if (arg1 != null && !Static250.aBooleanArrayArray2[local91][local1272]) {
												local1359 = (local27 << 9) + local1303;
												local1365 = local1301 + (local47 << 9);
												local981[local939] = arg1.method6890(local1359, local1365) - arg2.method6890(local1359, local1365);
											}
										}
										if (local1272 < 8 && local159.anInt2793 < Static460.anIntArray583[local1281]) {
											if (local950 != null) {
												local950[local939] = Static470.anIntArray595[local1281];
											}
											local965[local939] = Static336.anIntArray463[local1281];
											local962[local939] = Static394.anIntArray541[local1281];
											local959[local939] = Static267.anIntArray377[local1281];
										} else {
											if (local950 != null) {
												local950[local939] = local1031;
											}
											local962[local939] = local159.anInt2794;
											local965[local939] = local159.anInt2789;
											local959[local939] = local983;
										}
										local939++;
									}
									local937++;
								}
								if (!this.aBoolean202 && arg5 == 0) {
									Static354.method5308(local27, local47, local159.anInt2790, local159.anInt2787 * 8, local159.anInt2796);
								}
								if (local91 != 12 && local159.anInt2798 != -1 && local159.aBoolean236) {
									local80 = true;
								}
							} else if (local803) {
								local937 = Static508.anIntArray620[local91];
							} else if (local82) {
								local937 = Static347.anIntArray473[local91];
							} else {
								local937 = Static89.anIntArray141[local91];
							}
							if (local177 != null) {
								if (local137 == 0) {
									local137 = local113;
								}
								if (local129 == 0) {
									local129 = local113;
								}
								if (local121 == 0) {
									local121 = local113;
								}
								@Pc(1585) Class183 local1585 = this.aClass201_2.method4715(local113 - 1);
								@Pc(1593) Class183 local1593 = this.aClass201_2.method4715(local121 - 1);
								@Pc(1601) Class183 local1601 = this.aClass201_2.method4715(local129 - 1);
								@Pc(1609) Class183 local1609 = this.aClass201_2.method4715(local137 - 1);
								for (local1281 = 0; local1281 < local376; local1281++) {
									if (local85[-local97 & 0x3] && local937 == local805[0]) {
										Static98.anIntArray160[0] = local813[local937];
										Static98.anIntArray160[1] = 1;
										Static98.anIntArray160[2] = local817[local937];
										Static98.anIntArray160[3] = 1;
										Static98.anIntArray160[4] = local829[local937];
										local1117 = 6;
										Static98.anIntArray160[5] = local817[local937];
									} else if (local85[2 - local97 & 0x3] && local805[2] == local937) {
										Static98.anIntArray160[0] = local813[local937];
										Static98.anIntArray160[1] = 5;
										Static98.anIntArray160[2] = local817[local937];
										Static98.anIntArray160[3] = 5;
										Static98.anIntArray160[4] = local829[local937];
										Static98.anIntArray160[5] = local817[local937];
										local1117 = 6;
									} else if (local85[1 - local97 & 0x3] && local805[1] == local937) {
										Static98.anIntArray160[0] = local813[local937];
										Static98.anIntArray160[1] = 3;
										Static98.anIntArray160[2] = local817[local937];
										Static98.anIntArray160[3] = 3;
										Static98.anIntArray160[4] = local829[local937];
										Static98.anIntArray160[5] = local817[local937];
										local1117 = 6;
									} else if (local85[3 - local97 & 0x3] && local937 == local805[3]) {
										Static98.anIntArray160[0] = local813[local937];
										Static98.anIntArray160[1] = 7;
										Static98.anIntArray160[2] = local817[local937];
										Static98.anIntArray160[3] = 7;
										Static98.anIntArray160[4] = local829[local937];
										Static98.anIntArray160[5] = local817[local937];
										local1117 = 6;
									} else {
										Static98.anIntArray160[0] = local813[local937];
										Static98.anIntArray160[1] = local829[local937];
										Static98.anIntArray160[2] = local817[local937];
										local1117 = 3;
									}
									for (local1286 = 0; local1286 < local1117; local1286++) {
										local1303 = Static98.anIntArray160[local1286];
										local1291 = local1303 - local97 * 2 & 0x7;
										local1301 = this.anIntArray171[local1303];
										local1365 = this.anIntArray170[local1303];
										@Pc(1889) int local1889;
										if (local97 == 1) {
											local1889 = 512 - local1301;
											local1359 = local1365;
										} else if (local97 == 2) {
											local1359 = 512 - local1301;
											local1889 = 512 - local1365;
										} else if (local97 == 3) {
											local1889 = local1301;
											local1359 = 512 - local1365;
										} else {
											local1889 = local1365;
											local1359 = local1301;
										}
										local953[local939] = local1359;
										local956[local939] = local1889;
										@Pc(1938) int local1938;
										@Pc(1944) int local1944;
										if (local972 != null && Static506.aBooleanArrayArray6[local91][local1303]) {
											local1938 = (local27 << 9) + local1359;
											local1944 = local1889 + (local47 << 9);
											local972[local939] = arg4.method6890(local1938, local1944) - arg2.method6890(local1938, local1944);
										}
										if (local981 != null) {
											if (arg4 != null && !Static506.aBooleanArrayArray6[local91][local1303]) {
												local1938 = (local27 << 9) + local1359;
												local1944 = local1889 + (local47 << 9);
												local981[local939] = arg2.method6890(local1938, local1944) - arg4.method6890(local1938, local1944);
											} else if (arg1 != null && !Static250.aBooleanArrayArray2[local91][local1303]) {
												local1938 = local1359 + (local27 << 9);
												local1944 = local1889 + (local47 << 9);
												local981[local939] = arg1.method6890(local1938, local1944) - arg2.method6890(local1938, local1944);
											}
										}
										if (local1303 < 8 && Static460.anIntArray583[local1291] >= 0) {
											if (local950 != null) {
												local950[local939] = Static470.anIntArray595[local1291];
											}
											local965[local939] = Static336.anIntArray463[local1291];
											local962[local939] = Static394.anIntArray541[local1291];
											local959[local939] = Static267.anIntArray377[local1291];
										} else {
											if (local82 && Static506.aBooleanArrayArray6[local91][local1303]) {
												local962[local939] = local985;
												local965[local939] = local987;
												local959[local939] = local983;
											} else if (local1359 == 0 && local1889 == 0) {
												local959[local939] = arg3[local27][local47];
												local962[local939] = local1585.anInt5052;
												local965[local939] = local1585.anInt5055;
											} else if (local1359 == 0 && local1889 == 512) {
												local959[local939] = arg3[local27][local65];
												local962[local939] = local1593.anInt5052;
												local965[local939] = local1593.anInt5055;
											} else if (local1359 == 512 && local1889 == 512) {
												local959[local939] = arg3[local45][local65];
												local962[local939] = local1601.anInt5052;
												local965[local939] = local1601.anInt5055;
											} else if (local1359 == 512 && local1889 == 0) {
												local959[local939] = arg3[local45][local47];
												local962[local939] = local1609.anInt5052;
												local965[local939] = local1609.anInt5055;
											} else {
												if (local1359 >= 256) {
													if (local1889 < 256) {
														local962[local939] = local1609.anInt5052;
														local965[local939] = local1609.anInt5055;
													} else {
														local962[local939] = local1601.anInt5052;
														local965[local939] = local1601.anInt5055;
													}
												} else if (local1889 < 256) {
													local962[local939] = local1585.anInt5052;
													local965[local939] = local1585.anInt5055;
												} else {
													local962[local939] = local1593.anInt5052;
													local965[local939] = local1593.anInt5055;
												}
												local1938 = Static124.method3213(local1359 << 7 >> 9, arg3[local45][local47], arg3[local27][local47]);
												local1944 = Static124.method3213(local1359 << 7 >> 9, arg3[local45][local65], arg3[local27][local65]);
												local959[local939] = Static124.method3213(local1889 << 7 >> 9, local1944, local1938);
											}
											if (local950 != null) {
												local950[local939] = local959[local939];
											}
										}
										local939++;
									}
									local937++;
								}
								if (local91 != 0 && local177.aBoolean395) {
									local80 = true;
								}
							}
							local1031 = arg2.method6889(local27, local47);
							local1033 = arg2.method6889(local45, local47);
							local1266 = arg2.method6889(local45, local65);
							local1272 = arg2.method6889(local27, local65);
							@Pc(2380) boolean local2380 = Static425.method6053(local27, local47);
							if (local2380 && arg5 > 1 || !local2380 && arg5 > 0) {
								@Pc(2393) boolean local2393 = true;
								if (local177 != null && !local177.aBoolean394) {
									local2393 = false;
								} else if (local113 == 0 && local91 != 0) {
									local2393 = false;
								} else if (local105 > 0 && local179 != null && !local179.aBoolean235) {
									local2393 = false;
								}
								if (local2393 && local1033 == local1031 && local1266 == local1031 && local1272 == local1031) {
									this.aByteArrayArrayArray10[arg5][local27][local47] = (byte) (this.aByteArrayArrayArray10[arg5][local27][local47] | 0x4);
								}
							}
							local1286 = 0;
							local1303 = 0;
							local1291 = 0;
							if (this.aBoolean202) {
								local1286 = Static280.method4440(local27, local47);
								local1303 = Static474.method6508(local27, local47);
								local1291 = Static227.method3892(local27, local47);
							}
							arg2.O(local27, local47, local953, local972, local956, local981, local959, local950, local962, local965, local1286, local1303, local1291, local80);
							Static228.method1799(arg5, local27, local47);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "([[BLclient!kf;I[[BI[Z[[BILclient!er;Lclient!r;IIII)V")
	private void method2207(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class183 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean[] arg5, @OriginalArg(6) byte[][] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class83 arg8, @OriginalArg(9) Class43 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(13) int arg12) {
		@Pc(18) boolean[] local18 = arg8 != null && arg8.aBoolean237 ? Static287.aBooleanArrayArray3[arg7] : Static299.aBooleanArrayArray4[arg7];
		@Pc(34) int local34;
		@Pc(47) Class83 local47;
		@Pc(65) byte local65;
		@Pc(82) int local82;
		@Pc(87) int local87;
		if (arg12 > 0) {
			if (arg10 > 0) {
				local34 = arg0[arg10 - 1][arg12 - 1] & 0xFF;
				if (local34 > 0) {
					local47 = this.aClass305_3.method6565(local34 - 1);
					if (local47.anInt2798 != -1 && local47.aBoolean237) {
						local65 = arg3[arg10 - 1][arg12 - 1];
						local82 = arg6[arg10 - 1][arg12 - 1] * 2 + 4 & 0x7;
						local87 = Static316.method7574(arg9, local47);
						if (Static506.aBooleanArrayArray6[local65][local82]) {
							Static267.anIntArray377[0] = local47.anInt2798;
							Static470.anIntArray595[0] = local87;
							Static394.anIntArray541[0] = local47.anInt2794;
							Static336.anIntArray463[0] = local47.anInt2789;
							Static460.anIntArray583[0] = local47.anInt2793;
							Static204.anIntArray327[0] = 256;
						}
					}
				}
			}
			if (arg2 - 1 > arg10) {
				local34 = arg0[arg10 + 1][arg12 - 1] & 0xFF;
				if (local34 > 0) {
					local47 = this.aClass305_3.method6565(local34 - 1);
					if (local47.anInt2798 != -1 && local47.aBoolean237) {
						local65 = arg3[arg10 + 1][arg12 - 1];
						local82 = arg6[arg10 + 1][arg12 - 1] * 2 + 6 & 0x7;
						local87 = Static316.method7574(arg9, local47);
						if (Static506.aBooleanArrayArray6[local65][local82]) {
							Static267.anIntArray377[2] = local47.anInt2798;
							Static470.anIntArray595[2] = local87;
							Static394.anIntArray541[2] = local47.anInt2794;
							Static336.anIntArray463[2] = local47.anInt2789;
							Static460.anIntArray583[2] = local47.anInt2793;
							Static204.anIntArray327[2] = 512;
						}
					}
				}
			}
		}
		if (arg11 - 1 > arg12) {
			if (arg10 > 0) {
				local34 = arg0[arg10 - 1][arg12 + 1] & 0xFF;
				if (local34 > 0) {
					local47 = this.aClass305_3.method6565(local34 - 1);
					if (local47.anInt2798 != -1 && local47.aBoolean237) {
						local65 = arg3[arg10 - 1][arg12 + 1];
						local82 = arg6[arg10 - 1][arg12 + 1] * 2 + 2 & 0x7;
						local87 = Static316.method7574(arg9, local47);
						if (Static506.aBooleanArrayArray6[local65][local82]) {
							Static267.anIntArray377[6] = local47.anInt2798;
							Static470.anIntArray595[6] = local87;
							Static394.anIntArray541[6] = local47.anInt2794;
							Static336.anIntArray463[6] = local47.anInt2789;
							Static460.anIntArray583[6] = local47.anInt2793;
							Static204.anIntArray327[6] = 64;
						}
					}
				}
			}
			if (arg2 - 1 > arg10) {
				local34 = arg0[arg10 + 1][arg12 + 1] & 0xFF;
				if (local34 > 0) {
					local47 = this.aClass305_3.method6565(local34 - 1);
					if (local47.anInt2798 != -1 && local47.aBoolean237) {
						local65 = arg3[arg10 + 1][arg12 + 1];
						local82 = arg6[arg10 + 1][arg12 + 1] * 2 & 0x7;
						local87 = Static316.method7574(arg9, local47);
						if (Static506.aBooleanArrayArray6[local65][local82]) {
							Static267.anIntArray377[4] = local47.anInt2798;
							Static470.anIntArray595[4] = local87;
							Static394.anIntArray541[4] = local47.anInt2794;
							Static336.anIntArray463[4] = local47.anInt2789;
							Static460.anIntArray583[4] = local47.anInt2793;
							Static204.anIntArray327[4] = 128;
						}
					}
				}
			}
		}
		@Pc(501) int local501;
		@Pc(506) int local506;
		@Pc(508) int local508;
		@Pc(489) byte local489;
		if (arg12 > 0) {
			local34 = arg0[arg10][arg12 - 1] & 0xFF;
			if (local34 > 0) {
				local47 = this.aClass305_3.method6565(local34 - 1);
				if (local47.anInt2798 != -1) {
					local65 = arg3[arg10][arg12 - 1];
					local489 = arg6[arg10][arg12 - 1];
					if (local47.aBoolean237) {
						local87 = 2;
						local501 = local489 * 2 + 4;
						local506 = Static316.method7574(arg9, local47);
						for (local508 = 0; local508 < 3; local508++) {
							local87 &= 0x7;
							local501 &= 0x7;
							if (Static506.aBooleanArrayArray6[local65][local501] && Static460.anIntArray583[local87] <= local47.anInt2793) {
								Static267.anIntArray377[local87] = local47.anInt2798;
								Static470.anIntArray595[local87] = local506;
								Static394.anIntArray541[local87] = local47.anInt2794;
								Static336.anIntArray463[local87] = local47.anInt2789;
								if (local47.anInt2793 == Static460.anIntArray583[local87]) {
									Static204.anIntArray327[local87] |= 0x20;
								} else {
									Static204.anIntArray327[local87] = 32;
								}
								Static460.anIntArray583[local87] = local47.anInt2793;
							}
							local87--;
							local501++;
						}
						if (!local18[arg4 & 0x3]) {
							arg5[0] = Static287.aBooleanArrayArray3[local65][local489 + 2 & 0x3];
						}
					} else if (!local18[arg4 & 0x3]) {
						arg5[0] = Static299.aBooleanArrayArray4[local65][local489 + 2 & 0x3];
					}
				}
			}
		}
		if (arg11 - 1 > arg12) {
			local34 = arg0[arg10][arg12 + 1] & 0xFF;
			if (local34 > 0) {
				local47 = this.aClass305_3.method6565(local34 - 1);
				if (local47.anInt2798 != -1) {
					local65 = arg3[arg10][arg12 + 1];
					local489 = arg6[arg10][arg12 + 1];
					if (local47.aBoolean237) {
						local87 = 4;
						local501 = local489 * 2 + 2;
						local506 = Static316.method7574(arg9, local47);
						for (local508 = 0; local508 < 3; local508++) {
							local501 &= 0x7;
							local87 &= 0x7;
							if (Static506.aBooleanArrayArray6[local65][local501] && Static460.anIntArray583[local87] <= local47.anInt2793) {
								Static267.anIntArray377[local87] = local47.anInt2798;
								Static470.anIntArray595[local87] = local506;
								Static394.anIntArray541[local87] = local47.anInt2794;
								Static336.anIntArray463[local87] = local47.anInt2789;
								if (Static460.anIntArray583[local87] == local47.anInt2793) {
									Static204.anIntArray327[local87] |= 0x10;
								} else {
									Static204.anIntArray327[local87] = 16;
								}
								Static460.anIntArray583[local87] = local47.anInt2793;
							}
							local501--;
							local87++;
						}
						if (!local18[arg4 + 2 & 0x3]) {
							arg5[2] = Static287.aBooleanArrayArray3[local65][local489 & 0x3];
						}
					} else if (!local18[arg4 + 2 & 0x3]) {
						arg5[2] = Static299.aBooleanArrayArray4[local65][--local489 & 0x3];
					}
				}
			}
		}
		if (arg10 > 0) {
			local34 = arg0[arg10 - 1][arg12] & 0xFF;
			if (local34 > 0) {
				local47 = this.aClass305_3.method6565(local34 - 1);
				if (local47.anInt2798 != -1) {
					local65 = arg3[arg10 - 1][arg12];
					local489 = arg6[arg10 - 1][arg12];
					if (local47.aBoolean237) {
						local87 = 6;
						local501 = local489 * 2 + 4;
						local506 = Static316.method7574(arg9, local47);
						for (local508 = 0; local508 < 3; local508++) {
							local87 &= 0x7;
							local501 &= 0x7;
							if (Static506.aBooleanArrayArray6[local65][local501] && local47.anInt2793 >= Static460.anIntArray583[local87]) {
								Static267.anIntArray377[local87] = local47.anInt2798;
								Static470.anIntArray595[local87] = local506;
								Static394.anIntArray541[local87] = local47.anInt2794;
								Static336.anIntArray463[local87] = local47.anInt2789;
								if (local47.anInt2793 == Static460.anIntArray583[local87]) {
									Static204.anIntArray327[local87] |= 0x8;
								} else {
									Static204.anIntArray327[local87] = 8;
								}
								Static460.anIntArray583[local87] = local47.anInt2793;
							}
							local87++;
							local501--;
						}
						if (!local18[arg4 + 3 & 0x3]) {
							arg5[3] = Static287.aBooleanArrayArray3[local65][local489 + 1 & 0x3];
						}
					} else if (!local18[arg4 + 3 & 0x3]) {
						arg5[3] = Static299.aBooleanArrayArray4[local65][local489 + 1 & 0x3];
					}
				}
			}
		}
		if (arg10 < arg2 - 1) {
			local34 = arg0[arg10 + 1][arg12] & 0xFF;
			if (local34 > 0) {
				local47 = this.aClass305_3.method6565(local34 - 1);
				if (local47.anInt2798 != -1) {
					local65 = arg3[arg10 + 1][arg12];
					local489 = arg6[arg10 + 1][arg12];
					if (local47.aBoolean237) {
						local87 = 4;
						local501 = local489 * 2 + 6;
						local506 = Static316.method7574(arg9, local47);
						for (local508 = 0; local508 < 3; local508++) {
							local501 &= 0x7;
							local87 &= 0x7;
							if (Static506.aBooleanArrayArray6[local65][local501] && local47.anInt2793 >= Static460.anIntArray583[local87]) {
								Static267.anIntArray377[local87] = local47.anInt2798;
								Static470.anIntArray595[local87] = local506;
								Static394.anIntArray541[local87] = local47.anInt2794;
								Static336.anIntArray463[local87] = local47.anInt2789;
								if (local47.anInt2793 == Static460.anIntArray583[local87]) {
									Static204.anIntArray327[local87] |= 0x4;
								} else {
									Static204.anIntArray327[local87] = 4;
								}
								Static460.anIntArray583[local87] = local47.anInt2793;
							}
							local87--;
							local501++;
						}
						if (!local18[arg4 + 1 & 0x3]) {
							arg5[1] = Static287.aBooleanArrayArray3[local65][local489 + 3 & 0x3];
						}
					} else if (!local18[arg4 + 1 & 0x3]) {
						arg5[1] = Static299.aBooleanArrayArray4[local65][local489 + 3 & 0x3];
					}
				}
			}
		}
		if (arg8 == null) {
			return;
		}
		local34 = Static316.method7574(arg9, arg8);
		if (!arg8.aBoolean237) {
			return;
		}
		for (@Pc(1209) int local1209 = 0; local1209 < 8; local1209++) {
			@Pc(1219) int local1219 = local1209 - arg4 * 2 & 0x7;
			if (Static506.aBooleanArrayArray6[arg7][local1209] && arg8.anInt2793 >= Static460.anIntArray583[local1219]) {
				Static267.anIntArray377[local1219] = arg8.anInt2798;
				Static470.anIntArray595[local1219] = local34;
				Static394.anIntArray541[local1219] = arg8.anInt2794;
				Static336.anIntArray463[local1219] = arg8.anInt2789;
				if (Static460.anIntArray583[local1219] == arg8.anInt2793) {
					Static204.anIntArray327[local1219] |= 0x2;
				} else {
					Static204.anIntArray327[local1219] = 2;
				}
				Static460.anIntArray583[local1219] = arg8.anInt2793;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIIII)V")
	private void method2209(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(14) int local14;
		for (@Pc(10) int local10 = arg0; local10 < arg0 + 64; local10++) {
			for (local14 = arg1; local14 < arg1 + 64; local14++) {
				if (local14 >= 0 && this.anInt2463 > local14 && local10 >= 0 && local10 < this.anInt2468) {
					this.anIntArrayArrayArray5[arg2][local14][local10] = arg2 <= 0 ? 0 : this.anIntArrayArrayArray5[arg2 - 1][local14][local10] - 960;
				}
			}
		}
		if (arg1 > 0 && arg1 < this.anInt2463) {
			for (local14 = arg0 + 1; local14 < arg0 + 64; local14++) {
				if (local14 >= 0 && local14 < this.anInt2468) {
					this.anIntArrayArrayArray5[arg2][arg1][local14] = this.anIntArrayArrayArray5[arg2][arg1 - 1][local14];
				}
			}
		}
		if (arg0 > 0 && arg0 < this.anInt2468) {
			for (local14 = arg1 + 1; local14 < arg1 + 64; local14++) {
				if (local14 >= 0 && this.anInt2463 > local14) {
					this.anIntArrayArrayArray5[arg2][local14][arg0] = this.anIntArrayArrayArray5[arg2][local14][arg0 - 1];
				}
			}
		}
		if (arg1 < 0 || arg0 < 0 || arg1 >= this.anInt2463 || this.anInt2468 <= arg0) {
			return;
		}
		if (arg2 != 0) {
			if (arg1 > 0 && this.anIntArrayArrayArray5[arg2 - 1][arg1 - 1][arg0] != this.anIntArrayArrayArray5[arg2][arg1 - 1][arg0]) {
				this.anIntArrayArrayArray5[arg2][arg1][arg0] = this.anIntArrayArrayArray5[arg2][arg1 - 1][arg0];
				return;
			}
			if (arg0 > 0 && this.anIntArrayArrayArray5[arg2][arg1][arg0 - 1] != this.anIntArrayArrayArray5[arg2 - 1][arg1][arg0 - 1]) {
				this.anIntArrayArrayArray5[arg2][arg1][arg0] = this.anIntArrayArrayArray5[arg2][arg1][arg0 - 1];
				return;
			}
			if (arg1 > 0 && arg0 > 0 && this.anIntArrayArrayArray5[arg2][arg1 - 1][arg0 - 1] != this.anIntArrayArrayArray5[arg2 - 1][arg1 - 1][arg0 - 1]) {
				this.anIntArrayArrayArray5[arg2][arg1][arg0] = this.anIntArrayArrayArray5[arg2][arg1 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray5[arg2][arg1 - 1][arg0] != 0) {
			this.anIntArrayArrayArray5[arg2][arg1][arg0] = this.anIntArrayArrayArray5[arg2][arg1 - 1][arg0];
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray5[arg2][arg1][arg0 - 1] != 0) {
			this.anIntArrayArrayArray5[arg2][arg1][arg0] = this.anIntArrayArrayArray5[arg2][arg1][arg0 - 1];
			return;
		}
		if (arg1 > 0 && arg0 > 0 && this.anIntArrayArrayArray5[arg2][arg1 - 1][arg0 - 1] != 0) {
			this.anIntArrayArrayArray5[arg2][arg1][arg0] = this.anIntArrayArrayArray5[arg2][arg1 - 1][arg0 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ILclient!qh;IIIZIIIII)V")
	private void method2210(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub11 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg9 == 1) {
			arg5 = 1;
		} else if (arg9 == 2) {
			arg5 = 1;
			arg3 = 1;
		} else if (arg9 == 3) {
			arg3 = 1;
		}
		@Pc(69) int local69;
		if (arg2 < 0 || arg2 >= this.anInt2463 || arg8 < 0 || arg8 >= this.anInt2468) {
			while (true) {
				local69 = arg1.method3118();
				if (local69 == 0) {
					return;
				}
				if (local69 == 1) {
					arg1.method3118();
					return;
				}
				if (local69 <= 49) {
					arg1.method3118();
				}
			}
			return;
		}
		if (!this.aBoolean202 && !arg4) {
			Static154.aByteArrayArrayArray15[arg6][arg2][arg8] = 0;
		}
		while (true) {
			local69 = arg1.method3118();
			if (local69 == 0) {
				if (this.aBoolean202) {
					this.anIntArrayArrayArray5[0][arg3 + arg2][arg5 + arg8] = 0;
					return;
				} else if (arg6 == 0) {
					this.anIntArrayArrayArray5[0][arg2 + arg3][arg8 + arg5] = -Static294.method4658(arg7 + 932731, arg0 + 556238) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray5[arg6][arg3 + arg2][arg8 + arg5] = this.anIntArrayArrayArray5[arg6 - 1][arg3 + arg2][arg5 + arg8] - 960;
					return;
				}
			}
			if (local69 == 1) {
				@Pc(159) int local159 = arg1.method3118();
				if (!this.aBoolean202) {
					if (local159 == 1) {
						local159 = 0;
					}
					if (arg6 != 0) {
						this.anIntArrayArrayArray5[arg6][arg2 + arg3][arg8 + arg5] = this.anIntArrayArrayArray5[arg6 - 1][arg2 + arg3][arg5 + arg8] - (local159 * 8 << 2);
						return;
					}
					this.anIntArrayArrayArray5[0][arg3 + arg2][arg8 + arg5] = -local159 * 8 << 2;
					return;
				}
				this.anIntArrayArrayArray5[0][arg3 + arg2][arg8 + arg5] = local159 * 8 << 2;
				return;
			}
			if (local69 <= 49) {
				if (arg4) {
					arg1.method3118();
				} else {
					this.aByteArrayArrayArray12[arg6][arg2][arg8] = arg1.method3096();
					this.aByteArrayArrayArray11[arg6][arg2][arg8] = (byte) ((local69 - 2) / 4);
					this.aByteArrayArrayArray9[arg6][arg2][arg8] = (byte) (local69 + arg9 - 2 & 0x3);
				}
			} else if (local69 <= 81) {
				if (!this.aBoolean202 && !arg4) {
					Static154.aByteArrayArrayArray15[arg6][arg2][arg8] = (byte) (local69 - 49);
				}
			} else if (!arg4) {
				this.aByteArrayArrayArray13[arg6][arg2][arg8] = (byte) (local69 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "([Lclient!fh;I[[[ILclient!r;)V")
	public final void method2211(@OriginalArg(0) Class95[] arg0, @OriginalArg(2) int[][][] arg1, @OriginalArg(3) Class43 arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(28) int local28;
		if (!this.aBoolean202) {
			for (@Pc(6) int local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt2463; local10++) {
					for (local14 = 0; local14 < this.anInt2468; local14++) {
						if ((Static154.aByteArrayArrayArray15[local6][local10][local14] & 0x1) != 0) {
							local28 = local6;
							if ((Static154.aByteArrayArrayArray15[1][local10][local14] & 0x2) != 0) {
								local28 = local6 - 1;
							}
							if (local28 >= 0) {
								arg0[local28].method2742(local10, local14);
							}
						}
					}
				}
			}
		}
		for (local10 = 0; local10 < this.anInt2459; local10++) {
			local14 = 0;
			local28 = 0;
			if (!this.aBoolean202) {
				if (Static14.aBoolean16) {
					local28 = 8;
				}
				if (Static130.aBoolean241) {
					local14 = 2;
				}
				if (Static118.anInt2701 != 0) {
					local14 |= 0x1;
					if (local10 == 0 | Static12.aBoolean6) {
						local28 |= 0x10;
					}
				}
			}
			if (Static130.aBoolean241) {
				local28 |= 0x7;
			}
			if (!Static265.aBoolean389) {
				local28 |= 0x20;
			}
			@Pc(152) int[][] local152 = arg1 == null || local10 >= arg1.length ? this.anIntArrayArrayArray5[local10] : arg1[local10];
			Static368.method5484(local10, arg2.method7210(this.anInt2463, this.anInt2468, this.anIntArrayArrayArray5[local10], local152, local14, local28));
		}
	}
}
