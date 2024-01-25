import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class9 {

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "Z")
	public boolean aBoolean6;

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
	private int anInt153;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "[I")
	private int[] anIntArray1;

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "[I")
	public int[] anIntArray2;

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "J")
	private long aLong6;

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "[Lclient!dt;")
	private Class80[] aClass80Array1;

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "J")
	private long aLong7;

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
	public int anInt156 = -1;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)V")
	public void method140(@OriginalArg(0) boolean arg0) {
		this.aBoolean6 = arg0;
		this.method141();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	private void method141() {
		this.aLong6 = -1L;
		@Pc(10) long[] local10 = Class2_Sub1_Sub16.aLongArray16;
		this.aLong6 = local10[(int) ((this.aLong6 ^ (long) (this.anInt153 >> 8)) & 0xFFL)] ^ this.aLong6 >>> 8;
		this.aLong6 = local10[(int) (((long) this.anInt153 ^ this.aLong6) & 0xFFL)] ^ this.aLong6 >>> 8;
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray1.length; local56++) {
			this.aLong6 = local10[(int) (((long) (this.anIntArray1[local56] >> 24) ^ this.aLong6) & 0xFFL)] ^ this.aLong6 >>> 8;
			this.aLong6 = this.aLong6 >>> 8 ^ local10[(int) (((long) (this.anIntArray1[local56] >> 16) ^ this.aLong6) & 0xFFL)];
			this.aLong6 = local10[(int) ((this.aLong6 ^ (long) (this.anIntArray1[local56] >> 8)) & 0xFFL)] ^ this.aLong6 >>> 8;
			this.aLong6 = local10[(int) (((long) this.anIntArray1[local56] ^ this.aLong6) & 0xFFL)] ^ this.aLong6 >>> 8;
		}
		@Pc(155) int local155;
		if (this.aClass80Array1 != null) {
			for (local155 = 0; local155 < this.aClass80Array1.length; local155++) {
				if (this.aClass80Array1[local155] != null) {
					@Pc(177) int[] local177;
					@Pc(171) int[] local171;
					if (this.aBoolean6) {
						local171 = this.aClass80Array1[local155].anIntArray114;
						local177 = this.aClass80Array1[local155].anIntArray118;
					} else {
						local171 = this.aClass80Array1[local155].anIntArray116;
						local177 = this.aClass80Array1[local155].anIntArray117;
					}
					@Pc(195) int local195;
					if (local177 != null) {
						for (local195 = 0; local195 < local177.length; local195++) {
							this.aLong6 = this.aLong6 >>> 8 ^ local10[(int) (((long) (local177[local195] >> 8) ^ this.aLong6) & 0xFFL)];
							this.aLong6 = this.aLong6 >>> 8 ^ local10[(int) ((this.aLong6 ^ (long) local177[local195]) & 0xFFL)];
						}
					}
					if (local171 != null) {
						for (local195 = 0; local195 < local171.length; local195++) {
							this.aLong6 = local10[(int) (((long) (local171[local195] >> 8) ^ this.aLong6) & 0xFFL)] ^ this.aLong6 >>> 8;
							this.aLong6 = this.aLong6 >>> 8 ^ local10[(int) ((this.aLong6 ^ (long) local171[local195]) & 0xFFL)];
						}
					}
					if (this.aClass80Array1[local155].aShortArray49 != null) {
						for (local195 = 0; local195 < this.aClass80Array1[local155].aShortArray49.length; local195++) {
							this.aLong6 = this.aLong6 >>> 8 ^ local10[(int) ((this.aLong6 ^ (long) (this.aClass80Array1[local155].aShortArray49[local195] >> 8)) & 0xFFL)];
							this.aLong6 = local10[(int) (((long) this.aClass80Array1[local155].aShortArray49[local195] ^ this.aLong6) & 0xFFL)] ^ this.aLong6 >>> 8;
						}
					}
					if (this.aClass80Array1[local155].aShortArray48 != null) {
						for (local195 = 0; local195 < this.aClass80Array1[local155].aShortArray48.length; local195++) {
							this.aLong6 = local10[(int) ((this.aLong6 ^ (long) (this.aClass80Array1[local155].aShortArray48[local195] >> 8)) & 0xFFL)] ^ this.aLong6 >>> 8;
							this.aLong6 = local10[(int) ((this.aLong6 ^ (long) this.aClass80Array1[local155].aShortArray48[local195]) & 0xFFL)] ^ this.aLong6 >>> 8;
						}
					}
				}
			}
		}
		for (local155 = 0; local155 < 5; local155++) {
			this.aLong6 = this.aLong6 >>> 8 ^ local10[(int) (((long) this.anIntArray2[local155] ^ this.aLong6) & 0xFFL)];
		}
		this.aLong6 = this.aLong6 >>> 8 ^ local10[(int) (((long) (this.aBoolean6 ? 1 : 0) ^ this.aLong6) & 0xFFL)];
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIB)V")
	public void method143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray2[arg0] = arg1;
		this.method141();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!ep;III)V")
	public void method144(@OriginalArg(0) Class96 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = Static38.anIntArray44[arg2];
		if (arg0.method2464(arg1) != null) {
			this.anIntArray1[local7] = Integer.MIN_VALUE | arg1;
			this.method141();
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!qp;ILclient!je;[IILclient!ep;Lclient!br;IILclient!pa;Lclient!je;ZIILclient!ha;ILclient!tb;ILclient!os;[Lclient!ip;)Lclient!ka;")
	public Class14 method145(@OriginalArg(0) int arg0, @OriginalArg(1) Interface15 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class178 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) Class40 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class272 arg10, @OriginalArg(11) Class178 arg11, @OriginalArg(13) int arg12, @OriginalArg(15) Class101 arg13, @OriginalArg(16) int arg14, @OriginalArg(17) Class343 arg15, @OriginalArg(18) int arg16, @OriginalArg(19) Class267 arg17, @OriginalArg(20) Class171[] arg18) {
		if (this.anInt156 != -1) {
			return arg10.method7200(this.anInt156).method7954(arg9, arg8, (Class21) null, arg2, arg14, arg0, arg12, arg17, arg18, arg5, arg4, arg11, arg7, arg13, arg16, arg1, arg3);
		}
		@Pc(36) int local36 = arg0;
		@Pc(39) long local39 = this.aLong6;
		@Pc(42) int[] local42 = this.anIntArray1;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		if (arg3 != null && (arg3.anInt5131 >= 0 || arg3.anInt5132 >= 0)) {
			local42 = new int[this.anIntArray1.length];
			for (@Pc(64) int local64 = 0; local64 < local42.length; local64++) {
				local42[local64] = this.anIntArray1[local64];
			}
			if (arg3.anInt5131 >= 0) {
				if (arg3.anInt5131 == 65535) {
					local39 ^= 0xFFFFFFFF00000000L;
					local42[5] = 0;
					local44 = true;
				} else {
					local42[5] = arg3.anInt5131 | 0x40000000;
					local39 ^= (long) local42[5] << 32;
				}
			}
			if (arg3.anInt5132 >= 0) {
				if (arg3.anInt5132 == 65535) {
					local42[3] = 0;
					local39 ^= 0xFFFFFFFFL;
				} else {
					local42[3] = arg3.anInt5132 | 0x40000000;
					local39 ^= (long) local42[3];
				}
				local46 = true;
			}
		}
		@Pc(159) boolean local159 = false;
		@Pc(161) boolean local161 = false;
		@Pc(163) boolean local163 = false;
		@Pc(171) boolean local171 = arg3 != null || arg11 != null;
		@Pc(178) int local178 = arg18 == null ? 0 : arg18.length;
		@Pc(219) int local219;
		@Pc(224) int local224;
		for (@Pc(185) int local185 = 0; local185 < local178; local185++) {
			Static351.aClass2_Sub1_Sub18Array3[local185] = null;
			if (arg18[local185] != null) {
				@Pc(205) Class178 local205 = arg7.method1123(arg18[local185].anInt5007);
				if (local205.anIntArray259 != null) {
					Static82.aClass178Array1[local185] = local205;
					local171 = true;
					local219 = arg18[local185].anInt5003;
					local224 = arg18[local185].anInt5010;
					@Pc(229) int local229 = local205.anIntArray259[local219];
					Static351.aClass2_Sub1_Sub18Array3[local185] = arg7.method1120(local229 >>> 16);
					@Pc(242) int local242 = local229 & 0xFFFF;
					Static89.anIntArray82[local185] = local242;
					if (Static351.aClass2_Sub1_Sub18Array3[local185] != null) {
						local161 |= Static351.aClass2_Sub1_Sub18Array3[local185].method8433(local242);
						local159 |= Static351.aClass2_Sub1_Sub18Array3[local185].method8434(local242);
						local163 |= Static351.aClass2_Sub1_Sub18Array3[local185].method8432(local242);
					}
					if ((local205.aBoolean386 || Static135.aBoolean192) && local224 != -1 && local224 < local205.anIntArray259.length) {
						Static254.anIntArray248[local185] = local205.anIntArray257[local219];
						Static20.anIntArray33[local185] = arg18[local185].anInt5005;
						@Pc(330) int local330 = local205.anIntArray259[local224];
						Static70.aClass2_Sub1_Sub18Array1[local185] = arg7.method1120(local330 >>> 16);
						@Pc(343) int local343 = local330 & 0xFFFF;
						Static572.anIntArray505[local185] = local343;
						if (Static70.aClass2_Sub1_Sub18Array1[local185] != null) {
							local161 |= Static70.aClass2_Sub1_Sub18Array1[local185].method8433(local343);
							local159 |= Static70.aClass2_Sub1_Sub18Array1[local185].method8434(local343);
							local163 |= Static70.aClass2_Sub1_Sub18Array1[local185].method8432(local343);
						}
					} else {
						Static254.anIntArray248[local185] = 0;
						Static20.anIntArray33[local185] = 0;
						Static70.aClass2_Sub1_Sub18Array1[local185] = null;
						Static572.anIntArray505[local185] = -1;
					}
				}
			}
		}
		@Pc(384) int local384 = -1;
		local219 = -1;
		local224 = 0;
		@Pc(390) Class2_Sub1_Sub18 local390 = null;
		@Pc(392) Class2_Sub1_Sub18 local392 = null;
		@Pc(394) int local394 = -1;
		@Pc(396) int local396 = -1;
		@Pc(398) int local398 = 0;
		@Pc(400) Class2_Sub1_Sub18 local400 = null;
		@Pc(402) Class2_Sub1_Sub18 local402 = null;
		if (local171) {
			@Pc(415) int local415;
			@Pc(480) int local480;
			if (arg3 != null) {
				local384 = arg3.anIntArray259[arg2];
				local415 = local384 >>> 16;
				local384 &= 0xFFFF;
				local390 = arg7.method1120(local415);
				if (local390 != null) {
					local161 |= local390.method8433(local384);
					local159 |= local390.method8434(local384);
					local163 |= local390.method8432(local384);
				}
				if ((arg3.aBoolean386 || Static135.aBoolean192) && arg5 != -1 && arg5 < arg3.anIntArray259.length) {
					local219 = arg3.anIntArray259[arg5];
					local224 = arg3.anIntArray257[arg2];
					local480 = local219 >>> 16;
					local219 &= 0xFFFF;
					local392 = local415 == local480 ? local390 : arg7.method1120(local480);
					if (local392 != null) {
						local161 |= local392.method8433(local219);
						local159 |= local392.method8434(local219);
						local163 |= local392.method8432(local219);
					}
				}
			}
			local36 = arg0 | 0x20;
			if (arg11 != null) {
				local394 = arg11.anIntArray259[arg8];
				local415 = local394 >>> 16;
				local400 = arg7.method1120(local415);
				local394 &= 0xFFFF;
				if (local400 != null) {
					local161 |= local400.method8433(local394);
					local159 |= local400.method8434(local394);
					local163 |= local400.method8432(local394);
				}
				if ((arg11.aBoolean386 || Static135.aBoolean192) && arg14 != -1 && arg14 < arg11.anIntArray259.length) {
					local398 = arg11.anIntArray257[arg8];
					local396 = arg11.anIntArray259[arg14];
					local480 = local396 >>> 16;
					local396 &= 0xFFFF;
					local402 = local415 == local480 ? local400 : arg7.method1120(local480);
					if (local402 != null) {
						local161 |= local402.method8433(local396);
						local159 |= local402.method8434(local396);
						local163 |= local402.method8432(local396);
					}
				}
			}
			if (local161) {
				local36 |= 0x80;
			}
			if (local159) {
				local36 |= 0x100;
			}
			if (local163) {
				local36 |= 0x400;
			}
		}
		@Pc(651) Class22 local651 = Static68.aClass22_7;
		@Pc(659) Class14 local659;
		synchronized (Static68.aClass22_7) {
			local659 = (Class14) Static68.aClass22_7.method462(local39);
		}
		@Pc(667) Class248 local667 = null;
		if (this.anInt153 != -1) {
			local667 = arg17.method7159(this.anInt153);
		}
		@Pc(698) boolean local698;
		@Pc(700) int local700;
		@Pc(706) int local706;
		@Pc(821) int local821;
		@Pc(827) int local827;
		@Pc(934) int local934;
		if (local659 == null || arg13.method8083(local659.ua(), local36) != 0) {
			if (local659 != null) {
				local36 = arg13.method8095(local36, local659.ua());
			}
			local698 = false;
			local700 = 0;
			while (true) {
				if (local42.length <= local700) {
					if (local698) {
						if (this.aLong7 != -1L) {
							@Pc(787) Class22 local787 = Static68.aClass22_7;
							synchronized (Static68.aClass22_7) {
								local659 = (Class14) Static68.aClass22_7.method462(this.aLong7);
							}
						}
						if (local659 == null || arg13.method8083(local659.ua(), local36) != 0) {
							return null;
						}
					} else {
						@Pc(819) Class159[] local819 = new Class159[local42.length];
						for (local821 = 0; local821 < local42.length; local821++) {
							local827 = local42[local821];
							@Pc(829) Class80 local829 = null;
							@Pc(847) boolean local847 = local821 == 5 && local44 || local821 == 3 && local46;
							@Pc(869) Class159 local869;
							if ((local827 & 0x40000000) != 0) {
								if (!local847 && this.aClass80Array1 != null && this.aClass80Array1[local821] != null) {
									local829 = this.aClass80Array1[local821];
								}
								local869 = arg15.method8549(local827 & 0x3FFFFFFF).method8834(this.aBoolean6, local829);
								if (local869 != null) {
									local819[local821] = local869;
								}
							} else if ((Integer.MIN_VALUE & local827) != 0) {
								local869 = arg6.method2464(local827 & 0x3FFFFFFF).method815();
								if (local869 != null) {
									local819[local821] = local869;
								}
							}
						}
						@Pc(936) int local936;
						if (local667 != null && local667.anIntArrayArray35 != null) {
							for (local827 = 0; local827 < local667.anIntArrayArray35.length; local827++) {
								if (local819[local827] != null) {
									local934 = 0;
									local936 = 0;
									@Pc(938) int local938 = 0;
									@Pc(940) int local940 = 0;
									@Pc(942) int local942 = 0;
									@Pc(944) int local944 = 0;
									if (local667.anIntArrayArray35[local827] != null) {
										local934 = local667.anIntArrayArray35[local827][0];
										local936 = local667.anIntArrayArray35[local827][1];
										local944 = local667.anIntArrayArray35[local827][5] << 3;
										local942 = local667.anIntArrayArray35[local827][4] << 3;
										local938 = local667.anIntArrayArray35[local827][2];
										local940 = local667.anIntArrayArray35[local827][3] << 3;
									}
									if (local940 != 0 || local942 != 0 || local944 != 0) {
										local819[local827].method4366(local942, local944, local940);
									}
									if (local934 != 0 || local936 != 0 || local938 != 0) {
										local819[local827].method4357(local936, local934, local938);
									}
								}
							}
						}
						@Pc(1055) Class159 local1055 = new Class159(local819, local819.length);
						@Pc(1059) int local1059 = local36 | 0x4000;
						local659 = arg13.method8064(local1055, local1059, Static672.anInt11434, 64, 850);
						for (local934 = 0; local934 < 5; local934++) {
							for (local936 = 0; local936 < Static109.aShortArrayArrayArray1.length; local936++) {
								if (this.anIntArray2[local934] < Static109.aShortArrayArrayArray1[local936][local934].length) {
									local659.ia(Static565.aShortArrayArray19[local936][local934], Static109.aShortArrayArrayArray1[local936][local934][this.anIntArray2[local934]]);
								}
							}
						}
						local659.s(local36);
						@Pc(1129) Class22 local1129 = Static68.aClass22_7;
						synchronized (Static68.aClass22_7) {
							Static68.aClass22_7.method470(local39, local659);
						}
						this.aLong7 = local39;
					}
					break;
				}
				local706 = local42[local700];
				@Pc(708) Class80 local708 = null;
				@Pc(722) boolean local722 = local700 == 5 && local44 || local700 == 3 && local46;
				if ((local706 & 0x40000000) != 0) {
					if (!local722 && this.aClass80Array1 != null && this.aClass80Array1[local700] != null) {
						local708 = this.aClass80Array1[local700];
					}
					if (!arg15.method8549(local706 & 0x3FFFFFFF).method8826(local708, this.aBoolean6)) {
						local698 = true;
					}
				} else if ((local706 & Integer.MIN_VALUE) != 0 && !arg6.method2464(local706 & 0x3FFFFFFF).method817()) {
					local698 = true;
				}
				local700++;
			}
		}
		@Pc(1153) Class14 local1153 = local659.method8622((byte) 4, local36, true);
		local698 = false;
		if (arg4 != null) {
			for (local700 = 0; local700 < arg4.length; local700++) {
				if (arg4[local700] != -1) {
					local698 = true;
				}
			}
		}
		if (!local171 && !local698) {
			return local1153;
		}
		@Pc(1185) Class76[] local1185 = null;
		if (local667 != null) {
			local1185 = local667.method6619(arg13);
		}
		if (local698 && local1185 != null) {
			for (local706 = 0; local706 < arg4.length; local706++) {
				if (local1185[local706] != null) {
					local1153.method8621(local1185[local706], 0x1 << local706, true);
				}
			}
		}
		local706 = 0;
		local821 = 1;
		while (local706 < local178) {
			if (Static351.aClass2_Sub1_Sub18Array3[local706] != null) {
				local1153.method8633((int[]) null, Static20.anIntArray33[local706] - 1, local821, Static89.anIntArray82[local706], Static351.aClass2_Sub1_Sub18Array3[local706], Static70.aClass2_Sub1_Sub18Array1[local706], Static254.anIntArray248[local706], Static572.anIntArray505[local706], false);
			}
			local821 <<= 0x1;
			local706++;
		}
		if (local698) {
			for (local827 = 0; local827 < arg4.length; local827++) {
				if (arg4[local827] != -1) {
					local934 = arg4[local827] - arg16;
					local934 &= 0x3FFF;
					@Pc(1288) Class76 local1288 = arg13.method8141();
					local1288.method9633(local934);
					local1153.method8621(local1288, 0x1 << local827, false);
				}
			}
		}
		if (local698 && local1185 != null) {
			for (local827 = 0; local827 < arg4.length; local827++) {
				if (local1185[local827] != null) {
					local1153.method8621(local1185[local827], 0x1 << local827, false);
				}
			}
		}
		if (local390 != null && local400 != null) {
			local1153.method8636(false, local224, local219, arg9 - 1, local392, arg3.aBooleanArray25, local400, local390, local402, local384, local398, local396, arg12 - 1, local394);
		} else if (local390 != null) {
			local1153.method8627(local390, arg12 - 1, false, local384, 0, local392, local219, local224);
		} else if (local400 != null) {
			local1153.method8627(local400, arg9 - 1, false, local394, 0, local402, local396, local398);
		}
		for (local827 = 0; local827 < local178; local827++) {
			Static351.aClass2_Sub1_Sub18Array3[local827] = null;
			Static70.aClass2_Sub1_Sub18Array1[local827] = null;
			Static82.aClass178Array1[local827] = null;
		}
		return local1153;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!tb;Lclient!je;Lclient!pa;Lclient!ha;Lclient!ep;Lclient!qp;IIILclient!br;I)Lclient!ka;")
	public Class14 method147(@OriginalArg(1) Class343 arg0, @OriginalArg(2) Class178 arg1, @OriginalArg(3) Class272 arg2, @OriginalArg(4) Class101 arg3, @OriginalArg(5) Class96 arg4, @OriginalArg(6) Interface15 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class40 arg9) {
		if (this.anInt156 != -1) {
			return arg2.method7200(this.anInt156).method7948(arg9, arg6, arg5, (Class21) null, arg8, arg1, arg7, arg3);
		}
		@Pc(28) int local28 = 2048;
		@Pc(36) boolean local36;
		@Pc(49) int local49;
		@Pc(122) int local122;
		@Pc(59) int local59;
		@Pc(126) int local126;
		if (arg1 != null) {
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			local36 = false;
			@Pc(38) boolean local38 = false;
			local49 = arg1.anIntArray259[arg7];
			local28 = 2080;
			local59 = local49 >>> 16;
			@Pc(63) int local63 = local49 & 0xFFFF;
			@Pc(68) Class2_Sub1_Sub18 local68 = arg9.method1120(local59);
			if (local68 != null) {
				local34 = local68.method8433(local63) | false;
				local32 = local68.method8434(local63) | false;
				local38 = local68.method8432(local63) | false;
				local36 = arg1.aBoolean385 | false;
			}
			if ((arg1.aBoolean386 || Static135.aBoolean192) && arg8 != -1 && arg1.anIntArray259.length > arg8) {
				local122 = arg1.anIntArray259[arg8];
				local126 = local122 >>> 16;
				@Pc(136) Class2_Sub1_Sub18 local136 = local126 == local59 ? local68 : arg9.method1120(local126);
				@Pc(140) int local140 = local122 & 0xFFFF;
				if (local136 != null) {
					local34 |= local136.method8433(local140);
					local32 |= local136.method8434(local140);
					local38 |= local136.method8432(local140);
				}
			}
			if (local34) {
				local28 = 2208;
			}
			if (local32) {
				local28 |= 0x100;
			}
			if (local36) {
				local28 |= 0x200;
			}
			if (local38) {
				local28 |= 0x400;
			}
		}
		@Pc(191) Class22 local191 = Static522.aClass22_48;
		@Pc(200) Class14 local200;
		synchronized (Static522.aClass22_48) {
			local200 = (Class14) Static522.aClass22_48.method462(this.aLong6);
		}
		if (local200 == null || arg3.method8083(local200.ua(), local28) != 0) {
			if (local200 != null) {
				local28 = arg3.method8095(local28, local200.ua());
			}
			local36 = false;
			for (@Pc(228) int local228 = 0; local228 < this.anIntArray1.length; local228++) {
				local49 = this.anIntArray1[local228];
				@Pc(237) Class80 local237 = null;
				if ((local49 & 0x40000000) != 0) {
					if (this.aClass80Array1 != null && this.aClass80Array1[local228] != null) {
						local237 = this.aClass80Array1[local228];
					}
					if (!arg0.method8549(local49 & 0x3FFFFFFF).method8832(local237, this.aBoolean6)) {
						local36 = true;
					}
				} else if ((local49 & Integer.MIN_VALUE) != 0 && !arg4.method2464(local49 & 0x3FFFFFFF).method812()) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(303) Class159[] local303 = new Class159[this.anIntArray1.length];
			local122 = 0;
			for (@Pc(307) int local307 = 0; local307 < this.anIntArray1.length; local307++) {
				@Pc(314) int local314 = this.anIntArray1[local307];
				@Pc(316) Class80 local316 = null;
				@Pc(345) Class159 local345;
				if ((local314 & 0x40000000) != 0) {
					if (this.aClass80Array1 != null && this.aClass80Array1[local307] != null) {
						local316 = this.aClass80Array1[local307];
					}
					local345 = arg0.method8549(local314 & 0x3FFFFFFF).method8835(this.aBoolean6, local316);
					if (local345 != null) {
						local303[local122++] = local345;
					}
				} else if ((local314 & Integer.MIN_VALUE) != 0) {
					local345 = arg4.method2464(local314 & 0x3FFFFFFF).method811();
					if (local345 != null) {
						local303[local122++] = local345;
					}
				}
			}
			@Pc(392) Class159 local392 = new Class159(local303, local122);
			@Pc(396) int local396 = local28 | 0x4000;
			local200 = arg3.method8064(local392, local396, Static672.anInt11434, 64, 768);
			for (local59 = 0; local59 < 5; local59++) {
				for (local126 = 0; local126 < Static109.aShortArrayArrayArray1.length; local126++) {
					if (this.anIntArray2[local59] < Static109.aShortArrayArrayArray1[local126][local59].length) {
						local200.ia(Static565.aShortArrayArray19[local126][local59], Static109.aShortArrayArrayArray1[local126][local59][this.anIntArray2[local59]]);
					}
				}
			}
			local200.s(local28);
			@Pc(458) Class22 local458 = Static522.aClass22_48;
			synchronized (Static522.aClass22_48) {
				Static522.aClass22_48.method470(this.aLong6, local200);
			}
		}
		if (arg1 == null) {
			return local200;
		} else {
			local200.method8622((byte) 4, local28, true);
			return arg1.method4676(arg6, local200, 2048, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "([IIBI[I[Lclient!dt;Z)V")
	public void method148(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class80[] arg4, @OriginalArg(6) boolean arg5) {
		this.anInt156 = arg1;
		this.aClass80Array1 = arg4;
		if (arg2 != this.anInt153) {
			this.anInt153 = arg2;
		}
		this.anIntArray1 = arg3;
		this.anIntArray2 = arg0;
		this.aBoolean6 = arg5;
		this.method141();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIILclient!tb;)V")
	public void method149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class343 arg2) {
		if (arg0 == -1) {
			this.anIntArray1[arg1] = 0;
		} else if (arg2.method8549(arg0) == null) {
			return;
		} else {
			this.anIntArray1[arg1] = arg0 | 0x40000000;
			this.method141();
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIILclient!je;Lclient!ha;Lclient!br;ILclient!ep;III)Lclient!ka;")
	public Class14 method150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class178 arg3, @OriginalArg(5) Class101 arg4, @OriginalArg(6) Class40 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class96 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9) {
		@Pc(13) int local13 = 2048;
		@Pc(104) int local104;
		@Pc(44) int local44;
		if (arg3 != null) {
			@Pc(17) boolean local17 = false;
			@Pc(19) boolean local19 = false;
			@Pc(21) boolean local21 = false;
			@Pc(23) boolean local23 = false;
			@Pc(36) int local36 = arg3.anIntArray259[arg1];
			local13 = 2080;
			local44 = local36 >>> 16;
			@Pc(48) int local48 = local36 & 0xFFFF;
			@Pc(53) Class2_Sub1_Sub18 local53 = arg5.method1120(local44);
			if (local53 != null) {
				local19 = local53.method8433(local48) | false;
				local17 = local53.method8434(local48) | false;
				local23 = local53.method8432(local48) | false;
				local21 = arg3.aBoolean385 | false;
			}
			if ((arg3.aBoolean386 || Static135.aBoolean192) && arg0 != -1 && arg0 < arg3.anIntArray259.length) {
				local104 = arg3.anIntArray259[arg0];
				@Pc(108) int local108 = local104 >>> 16;
				@Pc(112) int local112 = local104 & 0xFFFF;
				@Pc(122) Class2_Sub1_Sub18 local122;
				if (local44 == local108) {
					local122 = local53;
				} else {
					local122 = arg5.method1120(local112 >>> 16);
				}
				if (local122 != null) {
					local19 |= local122.method8433(local112);
					local17 |= local122.method8434(local112);
					local23 |= local122.method8432(local112);
				}
			}
			if (local19) {
				local13 = 2208;
			}
			if (local17) {
				local13 |= 0x100;
			}
			if (local21) {
				local13 |= 0x200;
			}
			if (local23) {
				local13 |= 0x400;
			}
		}
		@Pc(185) long local185 = (long) arg2 | (long) arg9 << 32 | (long) (arg6 << 16);
		@Pc(187) Class22 local187 = Static522.aClass22_48;
		@Pc(195) Class14 local195;
		synchronized (Static522.aClass22_48) {
			local195 = (Class14) Static522.aClass22_48.method462(local185);
		}
		if (local195 == null || arg4.method8083(local195.ua(), local13) != 0) {
			if (local195 != null) {
				local13 = arg4.method8095(local13, local195.ua());
			}
			@Pc(222) Class159[] local222 = new Class159[3];
			local104 = 0;
			if (!arg7.method2464(arg2).method812() || !arg7.method2464(arg6).method812() || !arg7.method2464(arg9).method812()) {
				return null;
			}
			@Pc(252) Class159 local252 = arg7.method2464(arg2).method811();
			if (local252 != null) {
				local104++;
				local222[0] = local252;
			}
			local252 = arg7.method2464(arg6).method811();
			if (local252 != null) {
				local222[local104++] = local252;
			}
			local252 = arg7.method2464(arg9).method811();
			if (local252 != null) {
				local222[local104++] = local252;
			}
			local252 = new Class159(local222, local104);
			@Pc(297) int local297 = local13 | 0x4000;
			local195 = arg4.method8064(local252, local297, Static672.anInt11434, 64, 768);
			for (@Pc(307) int local307 = 0; local307 < 5; local307++) {
				for (local44 = 0; local44 < Static109.aShortArrayArrayArray1.length; local44++) {
					if (Static109.aShortArrayArrayArray1[local44][local307].length > this.anIntArray2[local307]) {
						local195.ia(Static565.aShortArrayArray19[local44][local307], Static109.aShortArrayArrayArray1[local44][local307][this.anIntArray2[local307]]);
					}
				}
			}
			local195.s(local13);
			@Pc(359) Class22 local359 = Static522.aClass22_48;
			synchronized (Static522.aClass22_48) {
				Static522.aClass22_48.method470(local185, local195);
			}
		}
		if (arg3 == null) {
			return local195;
		} else {
			local195 = local195.method8622((byte) 4, local13, true);
			return arg3.method4676(arg8, local195, 2048, arg1, arg0);
		}
	}
}
