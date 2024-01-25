import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public class Class202 {

	@OriginalMember(owner = "client!lm", name = "k", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!lm", name = "l", descriptor = "[I")
	private final int[] anIntArray479 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!lm", name = "p", descriptor = "[I")
	private final int[] anIntArray480 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
	protected final int anInt6791;

	@OriginalMember(owner = "client!lm", name = "B", descriptor = "Z")
	public final boolean aBoolean511;

	@OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
	protected final int anInt6805;

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "Lclient!vv;")
	private final Class339 aClass339_5;

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "Lclient!bc;")
	private final Class25 aClass25_5;

	@OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
	public final int anInt6804;

	@OriginalMember(owner = "client!lm", name = "j", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!lm", name = "y", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!lm", name = "z", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(IIIZLclient!vv;Lclient!bc;)V")
	protected Class202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class339 arg4, @OriginalArg(5) Class25 arg5) {
		this.anInt6791 = arg1;
		this.aBoolean511 = arg3;
		this.anInt6805 = arg2;
		this.aClass339_5 = arg4;
		this.aClass25_5 = arg5;
		this.anInt6804 = arg0;
		this.aByteArrayArrayArray14 = new byte[this.anInt6804][this.anInt6791 + 1][this.anInt6805 + 1];
		this.aByteArrayArrayArray16 = new byte[this.anInt6804][this.anInt6791][this.anInt6805];
		this.aByteArrayArrayArray13 = new byte[this.anInt6804][this.anInt6791][this.anInt6805];
		this.anIntArrayArrayArray15 = new int[this.anInt6804][this.anInt6791 + 1][this.anInt6805 + 1];
		this.aByteArrayArrayArray11 = new byte[this.anInt6804][this.anInt6791][this.anInt6805];
		this.aByteArrayArrayArray12 = new byte[this.anInt6804][this.anInt6791][this.anInt6805];
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(II[[I)V")
	public final void method5723(@OriginalArg(2) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray15[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt6791 + 1; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt6805 + 1; local16++) {
				local10[local12][local16] += arg0[local12][local16];
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!oa;Lclient!d;ILclient!d;)V")
	public final void method5724(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(3) Class62 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt6791][this.anInt6805];
		if (Static246.anIntArray323 == null || this.anInt6805 != Static246.anIntArray323.length) {
			Static146.anIntArray722 = new int[this.anInt6805];
			Static289.anIntArray413 = new int[this.anInt6805];
			Static468.anIntArray723 = new int[this.anInt6805];
			Static246.anIntArray323 = new int[this.anInt6805];
			Static549.anIntArray813 = new int[this.anInt6805];
		}
		@Pc(44) int local44;
		for (@Pc(40) int local40 = 0; local40 < this.anInt6804; local40++) {
			for (local44 = 0; local44 < this.anInt6805; local44++) {
				Static246.anIntArray323[local44] = 0;
				Static289.anIntArray413[local44] = 0;
				Static549.anIntArray813[local44] = 0;
				Static146.anIntArray722[local44] = 0;
				Static468.anIntArray723[local44] = 0;
			}
			for (@Pc(73) int local73 = -5; local73 < this.anInt6791; local73++) {
				@Pc(83) int local83;
				@Pc(102) int local102;
				@Pc(171) int local171;
				for (@Pc(77) int local77 = 0; local77 < this.anInt6805; local77++) {
					local83 = local73 + 5;
					@Pc(151) int local151;
					if (local83 < this.anInt6791) {
						local102 = this.aByteArrayArrayArray16[local40][local83][local77] & 0xFF;
						if (local102 > 0) {
							@Pc(115) Class28 local115 = this.aClass25_5.method987(local102 - 1);
							Static246.anIntArray323[local77] += local115.anInt1027;
							Static289.anIntArray413[local77] += local115.anInt1021;
							Static549.anIntArray813[local77] += local115.anInt1023;
							Static146.anIntArray722[local77] += local115.anInt1020;
							local151 = Static468.anIntArray723[local77]++;
						}
					}
					local102 = local73 - 5;
					if (local102 >= 0) {
						local171 = this.aByteArrayArrayArray16[local40][local102][local77] & 0xFF;
						if (local171 > 0) {
							@Pc(186) Class28 local186 = this.aClass25_5.method987(local171 - 1);
							Static246.anIntArray323[local77] -= local186.anInt1027;
							Static289.anIntArray413[local77] -= local186.anInt1021;
							Static549.anIntArray813[local77] -= local186.anInt1023;
							Static146.anIntArray722[local77] -= local186.anInt1020;
							local151 = Static468.anIntArray723[local77]--;
						}
					}
				}
				if (local73 >= 0) {
					local83 = 0;
					local102 = 0;
					local171 = 0;
					@Pc(244) int local244 = 0;
					@Pc(246) int local246 = 0;
					for (@Pc(248) int local248 = -5; local248 < this.anInt6805; local248++) {
						@Pc(254) int local254 = local248 + 5;
						if (this.anInt6805 > local254) {
							local83 += Static246.anIntArray323[local254];
							local171 += Static549.anIntArray813[local254];
							local102 += Static289.anIntArray413[local254];
							local246 += Static468.anIntArray723[local254];
							local244 += Static146.anIntArray722[local254];
						}
						@Pc(296) int local296 = local248 - 5;
						if (local296 >= 0) {
							local246 -= Static468.anIntArray723[local296];
							local171 -= Static549.anIntArray813[local296];
							local244 -= Static146.anIntArray722[local296];
							local83 -= Static246.anIntArray323[local296];
							local102 -= Static289.anIntArray413[local296];
						}
						if (local248 >= 0 && local244 > 0 && local246 > 0) {
							local11[local73][local248] = Static155.method6200(local83 * 256 / local244, local102 / local246, local171 / local246);
						}
					}
				}
			}
			if (Static16.aBoolean42) {
				this.method5728(local11, local40 == 0 ? arg1 : null, arg0, local40, local40 == 0 ? arg2 : null, Static47.aClass62Array1[local40]);
			} else {
				this.method5726(local40 == 0 ? arg1 : null, local40 == 0 ? arg2 : null, local40, Static47.aClass62Array1[local40], arg0, local11);
			}
			this.aByteArrayArrayArray16[local40] = null;
			this.aByteArrayArrayArray13[local40] = null;
			this.aByteArrayArrayArray11[local40] = null;
			this.aByteArrayArrayArray12[local40] = null;
		}
		if (!this.aBoolean511) {
			if (Static58.anInt1473 != 0) {
				Static199.method3762();
			}
			if (Static126.aBoolean220) {
				Static402.method8052();
			}
		}
		for (local44 = 0; local44 < this.anInt6804; local44++) {
			Static47.aClass62Array1[local44].ba();
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(III[Lclient!le;IIILclient!iaa;II)V")
	public final void method5725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class194[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class6_Sub26 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg2 & 0x7) * 8;
		@Pc(20) int local20;
		@Pc(52) int local52;
		if (!this.aBoolean511) {
			@Pc(18) Class194 local18 = arg3[arg5];
			for (local20 = 0; local20 < 8; local20++) {
				for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
					@Pc(39) int local39 = arg4 + Static466.method7187(arg0, local24 & 0x7, local20 & 0x7);
					local52 = arg7 + Static66.method1375(local20 & 0x7, arg0, local24 & 0x7);
					if (local39 > 0 && local39 < this.anInt6791 - 1 && local52 > 0 && local52 < this.anInt6805 - 1) {
						local18.method4813(local52, local39);
					}
				}
			}
		}
		@Pc(96) int local96 = (arg8 & 0x7) * 8;
		@Pc(102) int local102 = (arg2 & 0xFFFFFFF8) << 3;
		local20 = (arg8 & 0x1FFFFFF8) << 3;
		@Pc(114) byte local114 = 0;
		@Pc(116) byte local116 = 0;
		if (arg0 == 1) {
			local116 = 1;
		} else if (arg0 == 2) {
			local116 = 1;
			local114 = 1;
		} else if (arg0 == 3) {
			local114 = 1;
		}
		for (local52 = 0; local52 < this.anInt6804; local52++) {
			for (@Pc(147) int local147 = 0; local147 < 64; local147++) {
				for (@Pc(151) int local151 = 0; local151 < 64; local151++) {
					if (arg1 == local52 && local147 >= local11 && local11 + 8 >= local147 && local151 >= local96 && local96 + 8 >= local151) {
						@Pc(226) int local226;
						@Pc(234) int local234;
						if (local147 == local11 + 8 || local151 == local96 + 8) {
							if (arg0 == 0) {
								local226 = local147 + arg4 - local11;
								local234 = arg7 + local151 - local96;
							} else if (arg0 == 1) {
								local234 = arg7 + local11 + 8 - local147;
								local226 = arg4 + local151 - local96;
							} else if (arg0 == 2) {
								local234 = arg7 + local96 + 8 - local151;
								local226 = arg4 + local11 + 8 - local147;
							} else {
								local226 = arg4 + local96 + 8 - local151;
								local234 = local147 + arg7 - local11;
							}
							this.method5732(0, arg5, arg6, true, local151 + local20, 0, local234, 0, local226, local147 + local102);
						} else {
							local226 = arg4 + Static466.method7187(arg0, local151 & 0x7, local147 & 0x7);
							local234 = arg7 + Static66.method1375(local147 & 0x7, arg0, local151 & 0x7);
							this.method5732(local114, arg5, arg6, false, local20 + local151, local116, local234, arg0, local226, local147 + local102);
						}
						if (local147 == 63 || local151 == 63) {
							@Pc(365) byte local365 = 1;
							if (local147 == 63 && local151 == 63) {
								local365 = 3;
							}
							for (@Pc(377) int local377 = 0; local377 < local365; local377++) {
								@Pc(381) int local381 = local147;
								@Pc(383) int local383 = local151;
								if (local377 == 0) {
									local381 = local147 == 63 ? 64 : local147;
									local383 = local151 == 63 ? 64 : local151;
								} else if (local377 == 1) {
									local381 = 64;
								} else if (local377 == 2) {
									local383 = 64;
								}
								@Pc(430) int local430;
								@Pc(437) int local437;
								if (arg0 == 0) {
									local430 = arg4 + local381 - local11;
									local437 = arg7 + local383 - local96;
								} else if (arg0 == 1) {
									local437 = arg7 + local11 + 8 - local381;
									local430 = local383 + arg4 - local96;
								} else if (arg0 == 2) {
									local430 = local11 + arg4 + 8 - local381;
									local437 = arg7 + local96 + 8 - local383;
								} else {
									local437 = arg7 + local381 - local11;
									local430 = arg4 + local96 + 8 - local383;
								}
								if (local430 >= 0 && local430 < this.anInt6791 && local437 >= 0 && this.anInt6805 > local437) {
									this.anIntArrayArrayArray15[arg5][local430][local437] = this.anIntArrayArrayArray15[arg5][local226 + local114][local116 + local234];
								}
							}
						}
					} else {
						this.method5732(0, 0, arg6, false, 0, 0, -1, 0, -1, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BLclient!d;Lclient!d;ILclient!d;Lclient!oa;[[I)V")
	private void method5726(@OriginalArg(1) Class62 arg0, @OriginalArg(2) Class62 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class62 arg3, @OriginalArg(5) Class9 arg4, @OriginalArg(6) int[][] arg5) {
		for (@Pc(19) int local19 = 0; local19 < this.anInt6791; local19++) {
			for (@Pc(23) int local23 = 0; local23 < this.anInt6805; local23++) {
				if (Static538.anInt9266 == -1 || Static400.method6292(local23, local19, arg2, Static538.anInt9266)) {
					@Pc(47) byte local47 = this.aByteArrayArrayArray11[arg2][local19][local23];
					@Pc(56) byte local56 = this.aByteArrayArrayArray12[arg2][local19][local23];
					@Pc(67) int local67 = this.aByteArrayArrayArray13[arg2][local19][local23] & 0xFF;
					@Pc(78) int local78 = this.aByteArrayArrayArray16[arg2][local19][local23] & 0xFF;
					@Pc(90) Class113 local90 = local67 == 0 ? null : this.aClass339_5.method7934(local67 - 1);
					@Pc(102) Class28 local102 = local78 == 0 ? null : this.aClass25_5.method987(local78 - 1);
					@Pc(104) int local104 = 0;
					@Pc(106) int local106 = 0;
					if (local47 != 0) {
						local106 = local90 == null ? 0 : Static581.anIntArray848[local47];
						local104 = local102 == null ? 0 : Static109.anIntArray196[local47];
					} else if (local90 != null) {
						local106 = Static581.anIntArray848[local47];
					} else if (local102 != null) {
						local104 = Static581.anIntArray848[local47];
					}
					@Pc(144) int local144 = local106 + local104;
					@Pc(146) int local146 = 0;
					if (local144 != 0) {
						@Pc(154) int[] local154 = new int[local144];
						@Pc(157) int[] local157 = new int[local144];
						@Pc(160) int[] local160 = new int[local144];
						@Pc(163) int[] local163 = new int[local144];
						@Pc(165) boolean local165 = false;
						@Pc(182) int local182;
						@Pc(214) int local214;
						if (local90 == null || local90.anInt3826 == -1 && local90.anInt3827 == -1 && local90.anInt3829 == -1) {
							for (local182 = 0; local182 < local106; local182++) {
								local154[local146] = -1;
								local146++;
							}
						} else {
							local182 = arg4.method5458() ? local90.anInt3829 : local90.anInt3834;
							if (Static475.aBoolean647) {
								local182 = -1;
							}
							for (local214 = 0; local214 < local106; local214++) {
								local160[local146] = local182;
								local163[local146] = local90.anInt3833;
								if (local90.anInt3826 == -1) {
									local154[local146] = -1;
								} else {
									local154[local146] = local90.anInt3826;
								}
								if (local90.anInt3827 == -1) {
									local157[local146] = -1;
								} else {
									local157[local146] = local90.anInt3827;
									local165 = true;
								}
								local146++;
							}
							if (!this.aBoolean511 && arg2 == 0) {
								Static502.method7494(local19, local23, local90.anInt3825, local90.anInt3835 * 8, local90.anInt3837);
							}
						}
						if (!local165) {
							local157 = null;
						}
						if (local102 == null) {
							for (local182 = 0; local182 < local104; local182++) {
								local154[local146] = -1;
								local146++;
							}
						} else {
							local182 = local102.anInt1025;
							if (Static475.aBoolean647) {
								local182 = -1;
							}
							for (local214 = 0; local214 < local104; local214++) {
								local160[local146] = local182;
								local163[local146] = local102.anInt1022;
								local154[local146] = arg5[local19][local23];
								if (local157 != null) {
									local157[local146] = -1;
								}
								local146++;
							}
						}
						local182 = this.anIntArray480.length;
						@Pc(355) int[] local355 = new int[local182];
						@Pc(358) int[] local358 = new int[local182];
						@Pc(365) int[] local365 = arg1 == null ? null : new int[local182];
						@Pc(374) int[] local374 = arg1 == null && arg0 == null ? null : new int[local182];
						@Pc(383) int local383;
						@Pc(388) int local388;
						@Pc(469) int local469;
						@Pc(475) int local475;
						for (@Pc(376) int local376 = 0; local376 < local182; local376++) {
							local383 = this.anIntArray480[local376];
							local388 = this.anIntArray479[local376];
							if (local56 == 0) {
								local355[local376] = local383;
								local358[local376] = local388;
							} else if (local56 == 1) {
								local355[local376] = local388;
								local358[local376] = 512 - local383;
							} else if (local56 == 2) {
								local355[local376] = 512 - local383;
								local358[local376] = 512 - local388;
							} else if (local56 == 3) {
								local355[local376] = 512 - local388;
								local358[local376] = local383;
							}
							if (local365 != null && Static392.aBooleanArrayArray7[local47][local376]) {
								local469 = (local19 << 9) + local383;
								local475 = local383 + (local23 << 9);
								local365[local376] = arg1.sa(local469, local475) - arg3.sa(local469, local475);
							}
							if (local374 != null) {
								if (arg1 != null && !Static392.aBooleanArrayArray7[local47][local376]) {
									local469 = (local19 << 9) + local383;
									local475 = (local23 << 9) + local383;
									local374[local376] = arg3.sa(local469, local475) - arg1.sa(local469, local475);
								} else if (arg0 != null && !Static423.aBooleanArrayArray8[local47][local376]) {
									local469 = local383 + (local19 << 9);
									local475 = (local23 << 9) + local383;
									local374[local376] = arg0.sa(local469, local475) - arg3.sa(local469, local475);
								}
							}
						}
						local383 = arg3.JA(local19, local23);
						local388 = arg3.JA(local19 + 1, local23);
						local469 = arg3.JA(local19 + 1, local23 + 1);
						local475 = arg3.JA(local19, local23 + 1);
						if (arg2 > 0) {
							@Pc(599) boolean local599 = true;
							if (local78 == 0 && local47 != 0) {
								local599 = false;
							}
							if (local67 > 0 && local90 != null && !local90.aBoolean317) {
								local599 = false;
							}
							if (local599 && local383 == local388 && local383 == local469 && local383 == local475) {
								this.aByteArrayArrayArray14[arg2][local19][local23] = (byte) (this.aByteArrayArrayArray14[arg2][local19][local23] | 0x4);
							}
						}
						@Pc(654) int local654 = 0;
						@Pc(656) int local656 = 0;
						@Pc(658) int local658 = 0;
						if (this.aBoolean511) {
							local654 = Static249.method4399(local19, local23);
							local656 = Static552.method7226(local19, local23);
							local658 = Static301.method4871(local19, local23);
						}
						arg3.method8201(local19, local23, local355, local365, local358, local374, Static264.anIntArrayArray43[local47], Static332.anIntArrayArray44[local47], Static471.anIntArrayArray73[local47], local154, local157, local160, local163, local654, local656, local658);
						Static371.method5916(arg2, local19, local23);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "([[[ILclient!oa;I[Lclient!le;)V")
	public final void method5727(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(3) Class194[] arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(18) int local18;
		if (!this.aBoolean511) {
			for (local10 = 0; local10 < 4; local10++) {
				for (local14 = 0; local14 < this.anInt6791; local14++) {
					for (local18 = 0; local18 < this.anInt6805; local18++) {
						if ((Static356.aByteArrayArrayArray17[local10][local14][local18] & 0x1) != 0) {
							@Pc(32) int local32 = local10;
							if ((Static356.aByteArrayArrayArray17[1][local14][local18] & 0x2) != 0) {
								local32 = local10 - 1;
							}
							if (local32 >= 0) {
								arg2[local32].method4803(local18, local14);
							}
						}
					}
				}
			}
		}
		for (local10 = 0; local10 < this.anInt6804; local10++) {
			local14 = 0;
			local18 = 0;
			if (!this.aBoolean511) {
				if (Static126.aBoolean220) {
					local14 = 2;
				}
				if (Static490.aBoolean664) {
					local18 = 8;
				}
				if (Static58.anInt1473 != 0) {
					local14 |= 0x1;
					if (Static505.aBoolean677 | local10 == 0) {
						local18 |= 0x10;
					}
				}
			}
			if (Static126.aBoolean220) {
				local18 |= 0x7;
			}
			if (!Static269.aBoolean398) {
				local18 |= 0x20;
			}
			@Pc(140) int[][] local140 = arg0 == null || arg0.length <= local10 ? this.anIntArrayArrayArray15[local10] : arg0[local10];
			Static116.method2337(local10, arg1.method5415(this.anInt6791, this.anInt6805, this.anIntArrayArrayArray15[local10], local140, local14, local18));
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(B[[ILclient!d;Lclient!oa;ILclient!d;Lclient!d;)V")
	private void method5728(@OriginalArg(1) int[][] arg0, @OriginalArg(2) Class62 arg1, @OriginalArg(3) Class9 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class62 arg4, @OriginalArg(6) Class62 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray11[arg3];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray12[arg3];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray16[arg3];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray13[arg3];
		for (@Pc(27) int local27 = 0; local27 < this.anInt6791; local27++) {
			@Pc(53) int local53 = local27 >= this.anInt6791 - 1 ? local27 : local27 + 1;
			for (@Pc(55) int local55 = 0; local55 < this.anInt6805; local55++) {
				@Pc(73) int local73 = this.anInt6805 - 1 <= local55 ? local55 : local55 + 1;
				if (Static538.anInt9266 == -1 || Static400.method6292(local55, local27, arg3, Static538.anInt9266)) {
					@Pc(88) boolean local88 = false;
					@Pc(90) boolean local90 = false;
					@Pc(93) boolean[] local93 = new boolean[4];
					@Pc(99) int local99 = local10[local27][local55];
					@Pc(105) int local105 = local15[local27][local55];
					@Pc(113) int local113 = local25[local27][local55] & 0xFF;
					@Pc(121) int local121 = local20[local27][local55] & 0xFF;
					@Pc(129) int local129 = local20[local27][local73] & 0xFF;
					@Pc(137) int local137 = local20[local53][local73] & 0xFF;
					@Pc(145) int local145 = local20[local53][local55] & 0xFF;
					if (local113 != 0 || local121 != 0) {
						@Pc(167) Class113 local167 = local113 == 0 ? null : this.aClass339_5.method7934(local113 - 1);
						if (local99 == 0 && local167 == null) {
							local99 = 12;
						}
						@Pc(185) Class28 local185 = local121 == 0 ? null : this.aClass25_5.method987(local121 - 1);
						@Pc(187) Class113 local187 = local167;
						if (local167 != null) {
							if (local167.anInt3826 == -1 && local167.anInt3827 == -1) {
								local187 = local167;
								local167 = null;
							} else if (local185 != null && local99 != 0) {
								local90 = local167.aBoolean319;
							}
						}
						@Pc(281) int local281;
						@Pc(311) int local311;
						@Pc(384) int local384;
						@Pc(397) int local397;
						if ((local99 == 0 || local99 == 12) && local27 > 0 && local55 > 0 && this.anInt6791 > local27 && this.anInt6805 > local55) {
							@Pc(262) int local262 = local20[local53][local73] == local121 ? 1 : -1;
							local281 = local20[local27 - 1][local55 - 1] == local121 ? 1 : -1;
							@Pc(296) int local296 = local20[local53][local55 - 1] == local121 ? 1 : -1;
							local311 = local20[local27 - 1][local73] == local121 ? 1 : -1;
							if (local20[local27][local55 - 1] == local121) {
								local281++;
								local296++;
							} else {
								local296--;
								local281--;
							}
							if (local20[local53][local55] == local121) {
								local296++;
								local262++;
							} else {
								local296--;
								local262--;
							}
							if (local20[local27][local73] == local121) {
								local262++;
								local311++;
							} else {
								local311--;
								local262--;
							}
							if (local121 == local20[local27 - 1][local55]) {
								local281++;
								local311++;
							} else {
								local281--;
								local311--;
							}
							local384 = local281 - local262;
							if (local384 < 0) {
								local384 = -local384;
							}
							local397 = local296 - local311;
							if (local397 < 0) {
								local397 = -local397;
							}
							if (local384 == local397) {
								local384 = arg5.JA(local27, local55) - arg5.JA(local53, local73);
								if (local384 < 0) {
									local384 = -local384;
								}
								local397 = arg5.JA(local53, local55) - arg5.JA(local27, local73);
								if (local397 < 0) {
									local397 = -local397;
								}
							}
							local105 = local384 >= local397 ? 0 : 1;
						}
						for (local281 = 0; local281 < 13; local281++) {
							Static562.anIntArray822[local281] = -1;
							Static21.anIntArray57[local281] = 1;
						}
						@Pc(485) boolean[] local485 = local167 != null && local167.aBoolean319 ? Static365.aBooleanArrayArray5[local99] : Static364.aBooleanArrayArray6[local99];
						this.method5735(local99, local15, local185, local167, local105, local55, arg2, local93, local27, local10, this.anInt6805, local25, this.anInt6791);
						@Pc(514) boolean local514 = local167 != null && local167.anInt3827 != local167.anInt3826;
						if (!local514) {
							for (local311 = 0; local311 < 8; local311++) {
								if (Static562.anIntArray822[local311] >= 0 && Static27.anIntArray65[local311] != Static242.anIntArray321[local311]) {
									local514 = true;
									break;
								}
							}
						}
						if (!local485[local105 + 1 & 0x3]) {
							local93[1] = Static201.method3774(local93[1], (Static21.anIntArray57[4] & Static21.anIntArray57[2]) == 0);
						}
						if (!local485[local105 + 3 & 0x3]) {
							local93[3] = Static201.method3774(local93[3], (Static21.anIntArray57[6] & Static21.anIntArray57[0]) == 0);
						}
						if (!local485[local105 & 0x3]) {
							local93[0] = Static201.method3774(local93[0], (Static21.anIntArray57[0] & Static21.anIntArray57[2]) == 0);
						}
						if (!local485[local105 + 2 & 0x3]) {
							local93[2] = Static201.method3774(local93[2], (Static21.anIntArray57[4] & Static21.anIntArray57[6]) == 0);
						}
						if (!local90 && (local99 == 0 || local99 == 12)) {
							if (local93[0] && !local93[1] && !local93[2] && local93[3]) {
								local105 = 0;
								local93[0] = local93[3] = false;
								local99 = local99 == 0 ? 13 : 14;
							} else if (local93[0] && local93[1] && !local93[2] && !local93[3]) {
								local93[0] = local93[1] = false;
								local99 = local99 == 0 ? 13 : 14;
								local105 = 3;
							} else if (!local93[0] && local93[1] && local93[2] && !local93[3]) {
								local93[1] = local93[2] = false;
								local105 = 2;
								local99 = local99 == 0 ? 13 : 14;
							} else if (!local93[0] && !local93[1] && local93[2] && local93[3]) {
								local99 = local99 == 0 ? 13 : 14;
								local93[2] = local93[3] = false;
								local105 = 1;
							}
						}
						@Pc(816) boolean local816 = !local90 && !local93[0] && !local93[2] && !local93[1] && !local93[3];
						@Pc(818) int[] local818 = null;
						@Pc(836) int[] local836;
						@Pc(824) int[] local824;
						@Pc(840) int[] local840;
						if (local816) {
							local824 = Static332.anIntArrayArray44[local99];
							local384 = local185 == null ? 0 : Static109.anIntArray196[local99];
							local836 = Static264.anIntArrayArray43[local99];
							local840 = Static471.anIntArrayArray73[local99];
							local397 = local167 == null ? 0 : Static581.anIntArray848[local99];
						} else if (local90) {
							local824 = Static356.anIntArrayArray47[local99];
							local840 = Static574.anIntArrayArray80[local99];
							local397 = local167 == null ? 0 : Static286.anIntArray407[local99];
							local836 = Static494.anIntArrayArray78[local99];
							local818 = Static484.anIntArrayArray77[local99];
							local384 = local185 == null ? 0 : Static259.anIntArray335[local99];
						} else {
							local384 = local185 == null ? 0 : Static475.anIntArray766[local99];
							local824 = Static189.anIntArrayArray29[local99];
							local818 = Static99.anIntArrayArray14[local99];
							local840 = Static131.anIntArrayArray18[local99];
							local397 = local167 == null ? 0 : Static286.anIntArray406[local99];
							local836 = Static41.anIntArrayArray5[local99];
						}
						@Pc(921) int local921 = local384 + local397;
						if (local921 <= 0) {
							Static371.method5916(arg3, local27, local55);
						} else {
							if (local93[0]) {
								local921++;
							}
							if (local93[2]) {
								local921++;
							}
							if (local93[1]) {
								local921++;
							}
							if (local93[3]) {
								local921++;
							}
							@Pc(951) int local951 = 0;
							@Pc(953) int local953 = 0;
							@Pc(957) int local957 = local921 * 3;
							@Pc(964) int[] local964 = local514 ? new int[local957] : null;
							@Pc(967) int[] local967 = new int[local957];
							@Pc(970) int[] local970 = new int[local957];
							@Pc(973) int[] local973 = new int[local957];
							@Pc(976) int[] local976 = new int[local957];
							@Pc(979) int[] local979 = new int[local957];
							@Pc(986) int[] local986 = arg4 == null ? null : new int[local957];
							@Pc(995) int[] local995 = arg4 == null && arg1 == null ? null : new int[local957];
							@Pc(997) int local997 = -1;
							@Pc(999) int local999 = -1;
							@Pc(1001) int local1001 = 256;
							@Pc(1128) byte local1128;
							@Pc(1051) int local1051;
							@Pc(1053) int local1053;
							@Pc(1283) int local1283;
							@Pc(1289) int local1289;
							@Pc(1298) int local1298;
							@Pc(1303) int local1303;
							@Pc(1321) int local1321;
							@Pc(1308) int local1308;
							@Pc(1326) int local1326;
							@Pc(1375) int local1375;
							@Pc(1381) int local1381;
							if (local167 != null) {
								local997 = local167.anInt3826;
								local999 = arg2.method5458() ? local167.anInt3829 : local167.anInt3834;
								local1001 = local167.anInt3833;
								local1051 = Static499.method7469(arg2, local167);
								for (local1053 = 0; local1053 < local397; local1053++) {
									if (local93[-local105 & 0x3] && local951 == local818[0]) {
										Static22.anIntArray58[0] = local836[local951];
										Static22.anIntArray58[1] = 1;
										Static22.anIntArray58[2] = local840[local951];
										Static22.anIntArray58[3] = 1;
										Static22.anIntArray58[4] = local824[local951];
										local1128 = 6;
										Static22.anIntArray58[5] = local840[local951];
									} else if (local93[2 - local105 & 0x3] && local951 == local818[2]) {
										Static22.anIntArray58[0] = local836[local951];
										Static22.anIntArray58[1] = 5;
										Static22.anIntArray58[2] = local840[local951];
										Static22.anIntArray58[3] = 5;
										Static22.anIntArray58[4] = local824[local951];
										local1128 = 6;
										Static22.anIntArray58[5] = local840[local951];
									} else if (local93[1 - local105 & 0x3] && local951 == local818[1]) {
										Static22.anIntArray58[0] = local836[local951];
										Static22.anIntArray58[1] = 3;
										Static22.anIntArray58[2] = local840[local951];
										Static22.anIntArray58[3] = 3;
										Static22.anIntArray58[4] = local824[local951];
										local1128 = 6;
										Static22.anIntArray58[5] = local840[local951];
									} else if (local93[3 - local105 & 0x3] && local818[3] == local951) {
										Static22.anIntArray58[0] = local836[local951];
										Static22.anIntArray58[1] = 7;
										Static22.anIntArray58[2] = local840[local951];
										Static22.anIntArray58[3] = 7;
										Static22.anIntArray58[4] = local824[local951];
										local1128 = 6;
										Static22.anIntArray58[5] = local840[local951];
									} else {
										Static22.anIntArray58[0] = local836[local951];
										Static22.anIntArray58[1] = local824[local951];
										local1128 = 3;
										Static22.anIntArray58[2] = local840[local951];
									}
									for (local1283 = 0; local1283 < local1128; local1283++) {
										local1289 = Static22.anIntArray58[local1283];
										local1298 = local1289 - local105 * 2 & 0x7;
										local1303 = this.anIntArray480[local1289];
										local1308 = this.anIntArray479[local1289];
										if (local105 == 1) {
											local1321 = local1308;
											local1326 = 512 - local1303;
										} else if (local105 == 2) {
											local1321 = 512 - local1303;
											local1326 = 512 - local1308;
										} else if (local105 == 3) {
											local1326 = local1303;
											local1321 = 512 - local1308;
										} else {
											local1326 = local1308;
											local1321 = local1303;
										}
										local967[local953] = local1321;
										local970[local953] = local1326;
										if (local986 != null && Static392.aBooleanArrayArray7[local99][local1289]) {
											local1375 = (local27 << 9) + local1321;
											local1381 = (local55 << 9) + local1326;
											local986[local953] = arg4.sa(local1375, local1381) - arg5.sa(local1375, local1381);
										}
										if (local995 != null) {
											if (arg4 != null && !Static392.aBooleanArrayArray7[local99][local1289]) {
												local1375 = local1321 + (local27 << 9);
												local1381 = (local55 << 9) + local1326;
												local995[local953] = arg5.sa(local1375, local1381) - arg4.sa(local1375, local1381);
											} else if (arg1 != null && !Static423.aBooleanArrayArray8[local99][local1289]) {
												local1375 = local1321 + (local27 << 9);
												local1381 = (local55 << 9) + local1326;
												local995[local953] = arg1.sa(local1375, local1381) - arg5.sa(local1375, local1381);
											}
										}
										if (local1289 < 8 && Static562.anIntArray822[local1298] > local167.anInt3843) {
											if (local964 != null) {
												local964[local953] = Static27.anIntArray65[local1298];
											}
											local979[local953] = Static525.anIntArray799[local1298];
											local976[local953] = Static581.anIntArray847[local1298];
											local973[local953] = Static242.anIntArray321[local1298];
										} else {
											if (local964 != null) {
												local964[local953] = local1051;
											}
											local976[local953] = arg2.method5458() ? local167.anInt3829 : local167.anInt3834;
											local979[local953] = local167.anInt3833;
											local973[local953] = local997;
										}
										local953++;
									}
									local951++;
								}
								if (!this.aBoolean511 && arg3 == 0) {
									Static502.method7494(local27, local55, local167.anInt3825, local167.anInt3835 * 8, local167.anInt3837);
								}
								if (local99 != 12 && local167.anInt3826 != -1 && local167.aBoolean318) {
									local88 = true;
								}
							} else if (local816) {
								local951 = Static581.anIntArray848[local99];
							} else if (local90) {
								local951 = Static286.anIntArray407[local99];
							} else {
								local951 = Static286.anIntArray406[local99];
							}
							if (local185 != null) {
								if (local145 == 0) {
									local145 = local121;
								}
								if (local137 == 0) {
									local137 = local121;
								}
								if (local129 == 0) {
									local129 = local121;
								}
								@Pc(1609) Class28 local1609 = this.aClass25_5.method987(local121 - 1);
								@Pc(1617) Class28 local1617 = this.aClass25_5.method987(local129 - 1);
								@Pc(1625) Class28 local1625 = this.aClass25_5.method987(local137 - 1);
								@Pc(1633) Class28 local1633 = this.aClass25_5.method987(local145 - 1);
								for (local1298 = 0; local1298 < local384; local1298++) {
									if (local93[-local105 & 0x3] && local818[0] == local951) {
										Static22.anIntArray58[0] = local836[local951];
										Static22.anIntArray58[1] = 1;
										Static22.anIntArray58[2] = local840[local951];
										Static22.anIntArray58[3] = 1;
										Static22.anIntArray58[4] = local824[local951];
										local1128 = 6;
										Static22.anIntArray58[5] = local840[local951];
									} else if (local93[2 - local105 & 0x3] && local951 == local818[2]) {
										Static22.anIntArray58[0] = local836[local951];
										Static22.anIntArray58[1] = 5;
										Static22.anIntArray58[2] = local840[local951];
										Static22.anIntArray58[3] = 5;
										Static22.anIntArray58[4] = local824[local951];
										Static22.anIntArray58[5] = local840[local951];
										local1128 = 6;
									} else if (local93[1 - local105 & 0x3] && local951 == local818[1]) {
										Static22.anIntArray58[0] = local836[local951];
										Static22.anIntArray58[1] = 3;
										Static22.anIntArray58[2] = local840[local951];
										Static22.anIntArray58[3] = 3;
										Static22.anIntArray58[4] = local824[local951];
										Static22.anIntArray58[5] = local840[local951];
										local1128 = 6;
									} else if (local93[3 - local105 & 0x3] && local951 == local818[3]) {
										Static22.anIntArray58[0] = local836[local951];
										Static22.anIntArray58[1] = 7;
										Static22.anIntArray58[2] = local840[local951];
										Static22.anIntArray58[3] = 7;
										Static22.anIntArray58[4] = local824[local951];
										Static22.anIntArray58[5] = local840[local951];
										local1128 = 6;
									} else {
										Static22.anIntArray58[0] = local836[local951];
										Static22.anIntArray58[1] = local824[local951];
										local1128 = 3;
										Static22.anIntArray58[2] = local840[local951];
									}
									for (local1303 = 0; local1303 < local1128; local1303++) {
										local1321 = Static22.anIntArray58[local1303];
										local1308 = local1321 - local105 * 2 & 0x7;
										local1326 = this.anIntArray480[local1321];
										local1381 = this.anIntArray479[local1321];
										@Pc(1900) int local1900;
										if (local105 == 1) {
											local1375 = local1381;
											local1900 = 512 - local1326;
										} else if (local105 == 2) {
											local1375 = 512 - local1326;
											local1900 = 512 - local1381;
										} else if (local105 == 3) {
											local1900 = local1326;
											local1375 = 512 - local1381;
										} else {
											local1375 = local1326;
											local1900 = local1381;
										}
										local967[local953] = local1375;
										local970[local953] = local1900;
										@Pc(1954) int local1954;
										@Pc(1960) int local1960;
										if (local986 != null && Static392.aBooleanArrayArray7[local99][local1321]) {
											local1954 = local1375 + (local27 << 9);
											local1960 = (local55 << 9) + local1900;
											local986[local953] = arg4.sa(local1954, local1960) - arg5.sa(local1954, local1960);
										}
										if (local995 != null) {
											if (arg4 != null && !Static392.aBooleanArrayArray7[local99][local1321]) {
												local1954 = local1375 + (local27 << 9);
												local1960 = local1900 + (local55 << 9);
												local995[local953] = arg5.sa(local1954, local1960) - arg4.sa(local1954, local1960);
											} else if (arg1 != null && !Static423.aBooleanArrayArray8[local99][local1321]) {
												local1954 = (local27 << 9) + local1375;
												local1960 = local1900 + (local55 << 9);
												local995[local953] = arg1.sa(local1954, local1960) - arg5.sa(local1954, local1960);
											}
										}
										if (local1321 < 8 && Static562.anIntArray822[local1308] >= 0) {
											if (local964 != null) {
												local964[local953] = Static27.anIntArray65[local1308];
											}
											local979[local953] = Static525.anIntArray799[local1308];
											local976[local953] = Static581.anIntArray847[local1308];
											local973[local953] = Static242.anIntArray321[local1308];
										} else {
											if (local90 && Static392.aBooleanArrayArray7[local99][local1321]) {
												local976[local953] = local999;
												local979[local953] = local1001;
												local973[local953] = local997;
											} else if (local1375 == 0 && local1900 == 0) {
												local973[local953] = arg0[local27][local55];
												local976[local953] = local1609.anInt1025;
												local979[local953] = local1609.anInt1022;
											} else if (local1375 == 0 && local1900 == 512) {
												local973[local953] = arg0[local27][local73];
												local976[local953] = local1617.anInt1025;
												local979[local953] = local1617.anInt1022;
											} else if (local1375 == 512 && local1900 == 512) {
												local973[local953] = arg0[local53][local73];
												local976[local953] = local1625.anInt1025;
												local979[local953] = local1625.anInt1022;
											} else if (local1375 == 512 && local1900 == 0) {
												local973[local953] = arg0[local53][local55];
												local976[local953] = local1633.anInt1025;
												local979[local953] = local1633.anInt1022;
											} else {
												if (local1375 < 256) {
													if (local1900 < 256) {
														local976[local953] = local1609.anInt1025;
														local979[local953] = local1609.anInt1022;
													} else {
														local976[local953] = local1617.anInt1025;
														local979[local953] = local1617.anInt1022;
													}
												} else if (local1900 >= 256) {
													local976[local953] = local1625.anInt1025;
													local979[local953] = local1625.anInt1022;
												} else {
													local976[local953] = local1633.anInt1025;
													local979[local953] = local1633.anInt1022;
												}
												local1954 = Static137.method2580(arg0[local53][local55], local1375 << 7 >> 9, arg0[local27][local55]);
												local1960 = Static137.method2580(arg0[local53][local73], local1375 << 7 >> 9, arg0[local27][local73]);
												local973[local953] = Static137.method2580(local1960, local1900 << 7 >> 9, local1954);
											}
											if (local964 != null) {
												local964[local953] = local973[local953];
											}
										}
										local953++;
									}
									local951++;
								}
								if (local99 != 0 && local185.aBoolean83) {
									local88 = true;
								}
							}
							local1051 = arg5.JA(local27, local55);
							local1053 = arg5.JA(local53, local55);
							local1283 = arg5.JA(local53, local73);
							local1289 = arg5.JA(local27, local73);
							if (arg3 > 0) {
								@Pc(2380) boolean local2380 = true;
								if (local121 == 0 && local99 != 0) {
									local2380 = false;
								}
								if (local113 > 0 && local187 != null && !local187.aBoolean317) {
									local2380 = false;
								}
								if (local2380 && local1051 == local1053 && local1283 == local1051 && local1289 == local1051) {
									this.aByteArrayArrayArray14[arg3][local27][local55] = (byte) (this.aByteArrayArrayArray14[arg3][local27][local55] | 0x4);
								}
							}
							local1298 = 0;
							local1303 = 0;
							local1321 = 0;
							if (this.aBoolean511) {
								local1298 = Static249.method4399(local27, local55);
								local1303 = Static552.method7226(local27, local55);
								local1321 = Static301.method4871(local27, local55);
							}
							arg5.BA(local27, local55, local967, local986, local970, local995, local973, local964, local976, local979, local1298, local1303, local1321, local88);
							Static371.method5916(arg3, local27, local55);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIII)V")
	public final void method5731(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6804; local3++) {
			this.method5733(arg1, arg0, local3);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILclient!iaa;ZIIIIIBI)V")
	private void method5732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub26 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		if (arg7 == 1) {
			arg5 = 1;
		} else if (arg7 == 2) {
			arg0 = 1;
			arg5 = 1;
		} else if (arg7 == 3) {
			arg0 = 1;
		}
		@Pc(66) int local66;
		if (arg8 < 0 || this.anInt6791 <= arg8 || arg6 < 0 || this.anInt6805 <= arg6) {
			while (true) {
				local66 = arg2.method4966();
				if (local66 == 0) {
					return;
				}
				if (local66 == 1) {
					arg2.method4966();
					return;
				}
				if (local66 <= 49) {
					arg2.method4966();
				}
			}
			return;
		}
		if (!this.aBoolean511 && !arg3) {
			Static356.aByteArrayArrayArray17[arg1][arg8][arg6] = 0;
		}
		while (true) {
			local66 = arg2.method4966();
			if (local66 == 0) {
				if (this.aBoolean511) {
					this.anIntArrayArrayArray15[0][arg8 + arg0][arg5 + arg6] = 0;
					return;
				} else if (arg1 == 0) {
					this.anIntArrayArrayArray15[0][arg0 + arg8][arg6 + arg5] = -Static88.method1970(arg4 + 556238, arg9 + 932731) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray15[arg1][arg0 + arg8][arg5 + arg6] = this.anIntArrayArrayArray15[arg1 - 1][arg8 + arg0][arg5 + arg6] - 960;
					return;
				}
			}
			if (local66 == 1) {
				@Pc(159) int local159 = arg2.method4966();
				if (this.aBoolean511) {
					this.anIntArrayArrayArray15[0][arg0 + arg8][arg5 + arg6] = local159 * 8 << 2;
					return;
				}
				if (local159 == 1) {
					local159 = 0;
				}
				if (arg1 != 0) {
					this.anIntArrayArrayArray15[arg1][arg8 + arg0][arg5 + arg6] = this.anIntArrayArrayArray15[arg1 - 1][arg8 + arg0][arg6 + arg5] - (local159 * 8 << 2);
					return;
				}
				this.anIntArrayArrayArray15[0][arg0 + arg8][arg5 + arg6] = -local159 * 8 << 2;
				return;
			}
			if (local66 <= 49) {
				if (arg3) {
					arg2.method4966();
				} else {
					this.aByteArrayArrayArray13[arg1][arg8][arg6] = arg2.method4972();
					this.aByteArrayArrayArray11[arg1][arg8][arg6] = (byte) ((local66 - 2) / 4);
					this.aByteArrayArrayArray12[arg1][arg8][arg6] = (byte) (arg7 + local66 - 2 & 0x3);
				}
			} else if (local66 <= 81) {
				if (!this.aBoolean511 && !arg3) {
					Static356.aByteArrayArrayArray17[arg1][arg8][arg6] = (byte) (local66 - 49);
				}
			} else if (!arg3) {
				this.aByteArrayArrayArray16[arg1][arg8][arg6] = (byte) (local66 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIII)V")
	private void method5733(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = arg0; local7 < arg0 + 64; local7++) {
			for (local11 = arg1; local11 < arg1 + 64; local11++) {
				if (local11 >= 0 && this.anInt6791 > local11 && local7 >= 0 && this.anInt6805 > local7) {
					this.anIntArrayArrayArray15[arg2][local11][local7] = arg2 > 0 ? this.anIntArrayArrayArray15[arg2 - 1][local11][local7] - 960 : 0;
				}
			}
		}
		if (arg1 > 0 && this.anInt6791 > arg1) {
			for (local11 = arg0 + 1; local11 < arg0 + 64; local11++) {
				if (local11 >= 0 && local11 < this.anInt6805) {
					this.anIntArrayArrayArray15[arg2][arg1][local11] = this.anIntArrayArrayArray15[arg2][arg1 - 1][local11];
				}
			}
		}
		if (arg0 > 0 && arg0 < this.anInt6805) {
			for (local11 = arg1 + 1; local11 < arg1 + 64; local11++) {
				if (local11 >= 0 && this.anInt6791 > local11) {
					this.anIntArrayArrayArray15[arg2][local11][arg0] = this.anIntArrayArrayArray15[arg2][local11][arg0 - 1];
				}
			}
		}
		if (arg1 < 0 || arg0 < 0 || this.anInt6791 <= arg1 || this.anInt6805 <= arg0) {
			return;
		}
		if (arg2 == 0) {
			if (arg1 > 0 && this.anIntArrayArrayArray15[arg2][arg1 - 1][arg0] != 0) {
				this.anIntArrayArrayArray15[arg2][arg1][arg0] = this.anIntArrayArrayArray15[arg2][arg1 - 1][arg0];
				return;
			}
			if (arg0 > 0 && this.anIntArrayArrayArray15[arg2][arg1][arg0 - 1] != 0) {
				this.anIntArrayArrayArray15[arg2][arg1][arg0] = this.anIntArrayArrayArray15[arg2][arg1][arg0 - 1];
				return;
			}
			if (arg1 > 0 && arg0 > 0 && this.anIntArrayArrayArray15[arg2][arg1 - 1][arg0 - 1] != 0) {
				this.anIntArrayArrayArray15[arg2][arg1][arg0] = this.anIntArrayArrayArray15[arg2][arg1 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray15[arg2][arg1 - 1][arg0] != this.anIntArrayArrayArray15[arg2 - 1][arg1 - 1][arg0]) {
			this.anIntArrayArrayArray15[arg2][arg1][arg0] = this.anIntArrayArrayArray15[arg2][arg1 - 1][arg0];
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray15[arg2][arg1][arg0 - 1] != this.anIntArrayArrayArray15[arg2 - 1][arg1][arg0 - 1]) {
			this.anIntArrayArrayArray15[arg2][arg1][arg0] = this.anIntArrayArrayArray15[arg2][arg1][arg0 - 1];
			return;
		}
		if (arg1 > 0 && arg0 > 0 && this.anIntArrayArrayArray15[arg2 - 1][arg1 - 1][arg0 - 1] != this.anIntArrayArrayArray15[arg2][arg1 - 1][arg0 - 1]) {
			this.anIntArrayArrayArray15[arg2][arg1][arg0] = this.anIntArrayArrayArray15[arg2][arg1 - 1][arg0 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "([Lclient!le;Lclient!iaa;IIIII)V")
	public final void method5734(@OriginalArg(0) Class194[] arg0, @OriginalArg(1) Class6_Sub26 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (!this.aBoolean511) {
			for (local6 = 0; local6 < 4; local6++) {
				@Pc(12) Class194 local12 = arg0[local6];
				for (local14 = 0; local14 < 64; local14++) {
					for (local18 = 0; local18 < 64; local18++) {
						local24 = local14 + arg4;
						@Pc(29) int local29 = arg5 + local18;
						if (local24 >= 0 && this.anInt6791 > local24 && local29 >= 0 && local29 < this.anInt6805) {
							local12.method4813(local29, local24);
						}
					}
				}
			}
		}
		local6 = arg4 + arg3;
		@Pc(78) int local78 = arg5 + arg2;
		for (local14 = 0; local14 < this.anInt6804; local14++) {
			for (local18 = 0; local18 < 64; local18++) {
				for (local24 = 0; local24 < 64; local24++) {
					this.method5732(0, local14, arg1, false, local78 + local24, 0, arg5 + local24, 0, arg4 + local18, local6 + local18);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I[[BLclient!bda;Lclient!gf;IILclient!oa;[ZI[[BIB[[BI)V")
	private void method5735(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) Class28 arg2, @OriginalArg(3) Class113 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class9 arg6, @OriginalArg(7) boolean[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte[][] arg9, @OriginalArg(10) int arg10, @OriginalArg(12) byte[][] arg11, @OriginalArg(13) int arg12) {
		@Pc(18) boolean[] local18 = arg3 != null && arg3.aBoolean319 ? Static365.aBooleanArrayArray5[arg0] : Static364.aBooleanArrayArray6[arg0];
		@Pc(37) int local37;
		@Pc(47) Class113 local47;
		@Pc(65) byte local65;
		@Pc(81) int local81;
		@Pc(86) int local86;
		if (arg5 > 0) {
			if (arg8 > 0) {
				local37 = arg11[arg8 - 1][arg5 - 1] & 0xFF;
				if (local37 > 0) {
					local47 = this.aClass339_5.method7934(local37 - 1);
					if (local47.anInt3826 != -1 && local47.aBoolean319) {
						local65 = arg9[arg8 - 1][arg5 - 1];
						local81 = arg1[arg8 - 1][arg5 - 1] * 2 + 4 & 0x7;
						local86 = Static499.method7469(arg6, local47);
						if (Static392.aBooleanArrayArray7[local65][local81]) {
							Static242.anIntArray321[0] = local47.anInt3826;
							Static27.anIntArray65[0] = local86;
							Static581.anIntArray847[0] = arg6.method5458() ? local47.anInt3829 : local47.anInt3834;
							Static525.anIntArray799[0] = local47.anInt3833;
							Static562.anIntArray822[0] = local47.anInt3843;
							Static21.anIntArray57[0] = 256;
						}
					}
				}
			}
			if (arg8 < arg12 - 1) {
				local37 = arg11[arg8 + 1][arg5 - 1] & 0xFF;
				if (local37 > 0) {
					local47 = this.aClass339_5.method7934(local37 - 1);
					if (local47.anInt3826 != -1 && local47.aBoolean319) {
						local65 = arg9[arg8 + 1][arg5 - 1];
						local81 = arg1[arg8 + 1][arg5 - 1] * 2 + 6 & 0x7;
						local86 = Static499.method7469(arg6, local47);
						if (Static392.aBooleanArrayArray7[local65][local81]) {
							Static242.anIntArray321[2] = local47.anInt3826;
							Static27.anIntArray65[2] = local86;
							Static581.anIntArray847[2] = arg6.method5458() ? local47.anInt3829 : local47.anInt3834;
							Static525.anIntArray799[2] = local47.anInt3833;
							Static562.anIntArray822[2] = local47.anInt3843;
							Static21.anIntArray57[2] = 512;
						}
					}
				}
			}
		}
		if (arg5 < arg10 - 1) {
			if (arg8 > 0) {
				local37 = arg11[arg8 - 1][arg5 + 1] & 0xFF;
				if (local37 > 0) {
					local47 = this.aClass339_5.method7934(local37 - 1);
					if (local47.anInt3826 != -1 && local47.aBoolean319) {
						local65 = arg9[arg8 - 1][arg5 + 1];
						local81 = arg1[arg8 - 1][arg5 + 1] * 2 + 2 & 0x7;
						local86 = Static499.method7469(arg6, local47);
						if (Static392.aBooleanArrayArray7[local65][local81]) {
							Static242.anIntArray321[6] = local47.anInt3826;
							Static27.anIntArray65[6] = local86;
							Static581.anIntArray847[6] = arg6.method5458() ? local47.anInt3829 : local47.anInt3834;
							Static525.anIntArray799[6] = local47.anInt3833;
							Static562.anIntArray822[6] = local47.anInt3843;
							Static21.anIntArray57[6] = 64;
						}
					}
				}
			}
			if (arg12 - 1 > arg8) {
				local37 = arg11[arg8 + 1][arg5 + 1] & 0xFF;
				if (local37 > 0) {
					local47 = this.aClass339_5.method7934(local37 - 1);
					if (local47.anInt3826 != -1 && local47.aBoolean319) {
						local65 = arg9[arg8 + 1][arg5 + 1];
						local81 = arg1[arg8 + 1][arg5 + 1] * 2 & 0x7;
						local86 = Static499.method7469(arg6, local47);
						if (Static392.aBooleanArrayArray7[local65][local81]) {
							Static242.anIntArray321[4] = local47.anInt3826;
							Static27.anIntArray65[4] = local86;
							Static581.anIntArray847[4] = arg6.method5458() ? local47.anInt3829 : local47.anInt3834;
							Static525.anIntArray799[4] = local47.anInt3833;
							Static562.anIntArray822[4] = local47.anInt3843;
							Static21.anIntArray57[4] = 128;
						}
					}
				}
			}
		}
		@Pc(514) int local514;
		@Pc(519) int local519;
		@Pc(521) int local521;
		@Pc(503) byte local503;
		if (arg5 > 0) {
			local37 = arg11[arg8][arg5 - 1] & 0xFF;
			if (local37 > 0) {
				local47 = this.aClass339_5.method7934(local37 - 1);
				if (local47.anInt3826 != -1) {
					local65 = arg9[arg8][arg5 - 1];
					local503 = arg1[arg8][arg5 - 1];
					if (local47.aBoolean319) {
						local86 = 2;
						local514 = local503 * 2 + 4;
						local519 = Static499.method7469(arg6, local47);
						for (local521 = 0; local521 < 3; local521++) {
							local514 &= 0x7;
							local86 &= 0x7;
							if (Static392.aBooleanArrayArray7[local65][local514] && Static562.anIntArray822[local86] <= local47.anInt3843) {
								Static242.anIntArray321[local86] = local47.anInt3826;
								Static27.anIntArray65[local86] = local519;
								Static581.anIntArray847[local86] = arg6.method5458() ? local47.anInt3829 : local47.anInt3834;
								Static525.anIntArray799[local86] = local47.anInt3833;
								if (Static562.anIntArray822[local86] == local47.anInt3843) {
									Static21.anIntArray57[local86] |= 0x20;
								} else {
									Static21.anIntArray57[local86] = 32;
								}
								Static562.anIntArray822[local86] = local47.anInt3843;
							}
							local86--;
							local514++;
						}
						if (!local18[arg4 & 0x3]) {
							arg7[0] = Static365.aBooleanArrayArray5[local65][local503 + 2 & 0x3];
						}
					} else if (!local18[arg4 & 0x3]) {
						arg7[0] = Static364.aBooleanArrayArray6[local65][local503 + 2 & 0x3];
					}
				}
			}
		}
		if (arg10 - 1 > arg5) {
			local37 = arg11[arg8][arg5 + 1] & 0xFF;
			if (local37 > 0) {
				local47 = this.aClass339_5.method7934(local37 - 1);
				if (local47.anInt3826 != -1) {
					local65 = arg9[arg8][arg5 + 1];
					local503 = arg1[arg8][arg5 + 1];
					if (local47.aBoolean319) {
						local86 = 4;
						local514 = local503 * 2 + 2;
						local519 = Static499.method7469(arg6, local47);
						for (local521 = 0; local521 < 3; local521++) {
							local514 &= 0x7;
							local86 &= 0x7;
							if (Static392.aBooleanArrayArray7[local65][local514] && local47.anInt3843 >= Static562.anIntArray822[local86]) {
								Static242.anIntArray321[local86] = local47.anInt3826;
								Static27.anIntArray65[local86] = local519;
								Static581.anIntArray847[local86] = arg6.method5458() ? local47.anInt3829 : local47.anInt3834;
								Static525.anIntArray799[local86] = local47.anInt3833;
								if (local47.anInt3843 == Static562.anIntArray822[local86]) {
									Static21.anIntArray57[local86] |= 0x10;
								} else {
									Static21.anIntArray57[local86] = 16;
								}
								Static562.anIntArray822[local86] = local47.anInt3843;
							}
							local86++;
							local514--;
						}
						if (!local18[arg4 + 2 & 0x3]) {
							arg7[2] = Static365.aBooleanArrayArray5[local65][--local503 & 0x3];
						}
					} else if (!local18[arg4 + 2 & 0x3]) {
						arg7[2] = Static364.aBooleanArrayArray6[local65][--local503 & 0x3];
					}
				}
			}
		}
		if (arg8 > 0) {
			local37 = arg11[arg8 - 1][arg5] & 0xFF;
			if (local37 > 0) {
				local47 = this.aClass339_5.method7934(local37 - 1);
				if (local47.anInt3826 != -1) {
					local65 = arg9[arg8 - 1][arg5];
					local503 = arg1[arg8 - 1][arg5];
					if (local47.aBoolean319) {
						local86 = 6;
						local514 = local503 * 2 + 4;
						local519 = Static499.method7469(arg6, local47);
						for (local521 = 0; local521 < 3; local521++) {
							local514 &= 0x7;
							local86 &= 0x7;
							if (Static392.aBooleanArrayArray7[local65][local514] && local47.anInt3843 >= Static562.anIntArray822[local86]) {
								Static242.anIntArray321[local86] = local47.anInt3826;
								Static27.anIntArray65[local86] = local519;
								Static581.anIntArray847[local86] = arg6.method5458() ? local47.anInt3829 : local47.anInt3834;
								Static525.anIntArray799[local86] = local47.anInt3833;
								if (local47.anInt3843 == Static562.anIntArray822[local86]) {
									Static21.anIntArray57[local86] |= 0x8;
								} else {
									Static21.anIntArray57[local86] = 8;
								}
								Static562.anIntArray822[local86] = local47.anInt3843;
							}
							local514--;
							local86++;
						}
						if (!local18[arg4 + 3 & 0x3]) {
							arg7[3] = Static365.aBooleanArrayArray5[local65][local503 + 1 & 0x3];
						}
					} else if (!local18[arg4 + 3 & 0x3]) {
						arg7[3] = Static364.aBooleanArrayArray6[local65][local503 + 1 & 0x3];
					}
				}
			}
		}
		if (arg12 - 1 > arg8) {
			local37 = arg11[arg8 + 1][arg5] & 0xFF;
			if (local37 > 0) {
				local47 = this.aClass339_5.method7934(local37 - 1);
				if (local47.anInt3826 != -1) {
					local65 = arg9[arg8 + 1][arg5];
					local503 = arg1[arg8 + 1][arg5];
					if (local47.aBoolean319) {
						local86 = 4;
						local514 = local503 * 2 + 6;
						local519 = Static499.method7469(arg6, local47);
						for (local521 = 0; local521 < 3; local521++) {
							local514 &= 0x7;
							local86 &= 0x7;
							if (Static392.aBooleanArrayArray7[local65][local514] && Static562.anIntArray822[local86] <= local47.anInt3843) {
								Static242.anIntArray321[local86] = local47.anInt3826;
								Static27.anIntArray65[local86] = local519;
								Static581.anIntArray847[local86] = arg6.method5458() ? local47.anInt3829 : local47.anInt3834;
								Static525.anIntArray799[local86] = local47.anInt3833;
								if (local47.anInt3843 == Static562.anIntArray822[local86]) {
									Static21.anIntArray57[local86] |= 0x4;
								} else {
									Static21.anIntArray57[local86] = 4;
								}
								Static562.anIntArray822[local86] = local47.anInt3843;
							}
							local514++;
							local86--;
						}
						if (!local18[arg4 + 1 & 0x3]) {
							arg7[1] = Static365.aBooleanArrayArray5[local65][local503 + 3 & 0x3];
						}
					} else if (!local18[arg4 + 1 & 0x3]) {
						arg7[1] = Static364.aBooleanArrayArray6[local65][local503 + 3 & 0x3];
					}
				}
			}
		}
		if (arg3 == null) {
			return;
		}
		local37 = Static499.method7469(arg6, arg3);
		if (!arg3.aBoolean319) {
			return;
		}
		for (@Pc(1235) int local1235 = 0; local1235 < 8; local1235++) {
			@Pc(1246) int local1246 = local1235 - arg4 * 2 & 0x7;
			if (Static392.aBooleanArrayArray7[arg0][local1235] && Static562.anIntArray822[local1246] <= arg3.anInt3843) {
				Static242.anIntArray321[local1246] = arg3.anInt3826;
				Static27.anIntArray65[local1246] = local37;
				Static581.anIntArray847[local1246] = arg6.method5458() ? arg3.anInt3829 : arg3.anInt3834;
				Static525.anIntArray799[local1246] = arg3.anInt3833;
				if (arg3.anInt3843 == Static562.anIntArray822[local1246]) {
					Static21.anIntArray57[local1246] |= 0x2;
				} else {
					Static21.anIntArray57[local1246] = 2;
				}
				Static562.anIntArray822[local1246] = arg3.anInt3843;
			}
		}
		return;
	}
}
