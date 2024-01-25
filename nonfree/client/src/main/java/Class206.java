import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lw")
public final class Class206 {

	@OriginalMember(owner = "client!lw", name = "k", descriptor = "[I")
	public static final int[] anIntArray344 = new int[32];

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "[I")
	public int[] anIntArray343;

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "I")
	private int anInt6206;

	@OriginalMember(owner = "client!lw", name = "g", descriptor = "J")
	private long aLong160;

	@OriginalMember(owner = "client!lw", name = "m", descriptor = "[I")
	private int[] anIntArray345;

	@OriginalMember(owner = "client!lw", name = "n", descriptor = "J")
	private long aLong161;

	@OriginalMember(owner = "client!lw", name = "s", descriptor = "Z")
	public boolean aBoolean430;

	@OriginalMember(owner = "client!lw", name = "u", descriptor = "I")
	public int anInt6217 = -1;

	static {
		@Pc(35) int local35 = 2;
		for (@Pc(37) int local37 = 0; local37 < 32; local37++) {
			anIntArray344[local37] = local35 - 1;
			local35 += local35;
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILclient!bc;Lclient!fo;IZLclient!nd;[Lclient!nm;Lclient!of;IILclient!fo;ILclient!r;Lclient!me;IIILclient!oq;ILclient!gm;[I)Lclient!da;")
	public Class65 method4886(@OriginalArg(0) int arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) Class111 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class230 arg4, @OriginalArg(6) Class237[] arg5, @OriginalArg(7) Interface17 arg6, @OriginalArg(8) int arg7, @OriginalArg(10) Class111 arg8, @OriginalArg(11) int arg9, @OriginalArg(12) Class7 arg10, @OriginalArg(13) Class212 arg11, @OriginalArg(14) int arg12, @OriginalArg(15) int arg13, @OriginalArg(16) int arg14, @OriginalArg(17) Class254 arg15, @OriginalArg(18) int arg16, @OriginalArg(19) Class127 arg17, @OriginalArg(20) int[] arg18) {
		if (this.anInt6217 != -1) {
			return arg11.method4992(this.anInt6217).method1368(arg6, arg13, arg7, arg16, arg18, arg12, arg2, arg5, arg3, arg14, arg15, arg10, arg0, arg8, arg9, arg4);
		}
		@Pc(35) int local35 = arg9;
		@Pc(38) long local38 = this.aLong160;
		@Pc(41) int[] local41 = this.anIntArray345;
		if (arg8 != null && (arg8.anInt3149 >= 0 || arg8.anInt3158 >= 0)) {
			local41 = new int[12];
			for (@Pc(54) int local54 = 0; local54 < 12; local54++) {
				local41[local54] = this.anIntArray345[local54];
			}
			if (arg8.anInt3149 >= 0) {
				if (arg8.anInt3149 == 65535) {
					local38 ^= 0xFFFFFFFF00000000L;
					local41[5] = 0;
				} else {
					local41[5] = arg8.anInt3149 | 0x40000000;
					local38 ^= (long) local41[5] << 32;
				}
			}
			if (arg8.anInt3158 >= 0) {
				if (arg8.anInt3158 == 65535) {
					local41[3] = 0;
					local38 ^= 0xFFFFFFFFL;
				} else {
					local41[3] = arg8.anInt3158 | 0x40000000;
					local38 ^= local41[3];
				}
			}
		}
		@Pc(135) boolean local135 = false;
		@Pc(137) boolean local137 = false;
		@Pc(139) boolean local139 = false;
		@Pc(147) boolean local147 = arg8 != null || arg2 != null;
		@Pc(154) int local154 = arg5 == null ? 0 : arg5.length;
		@Pc(188) int local188;
		@Pc(193) int local193;
		for (@Pc(156) int local156 = 0; local156 < local154; local156++) {
			Static151.aClass4_Sub6_Sub8Array2[local156] = null;
			if (arg5[local156] != null) {
				@Pc(174) Class111 local174 = arg15.method5936(arg5[local156].anInt6861);
				if (local174.anIntArray153 != null) {
					Static231.aClass111Array1[local156] = local174;
					local147 = true;
					local188 = arg5[local156].anInt6862;
					local193 = arg5[local156].anInt6863;
					@Pc(198) int local198 = local174.anIntArray153[local188];
					Static151.aClass4_Sub6_Sub8Array2[local156] = arg15.method5940(local198 >>> 16);
					@Pc(211) int local211 = local198 & 0xFFFF;
					Static516.anIntArray542[local156] = local211;
					if (Static151.aClass4_Sub6_Sub8Array2[local156] != null) {
						local137 |= Static151.aClass4_Sub6_Sub8Array2[local156].method3080(local211);
						local135 |= Static151.aClass4_Sub6_Sub8Array2[local156].method3076(local211);
						local139 |= Static151.aClass4_Sub6_Sub8Array2[local156].method3077(local211);
					}
					if ((local174.aBoolean232 || Static165.aBoolean248) && local193 != -1 && local174.anIntArray153.length > local193) {
						Static549.anIntArray566[local156] = local174.anIntArray150[local188];
						Static283.anIntArray311[local156] = arg5[local156].anInt6858;
						@Pc(297) int local297 = local174.anIntArray153[local193];
						Static569.aClass4_Sub6_Sub8Array5[local156] = arg15.method5940(local297 >>> 16);
						@Pc(310) int local310 = local297 & 0xFFFF;
						Static345.anIntArray370[local156] = local310;
						if (Static569.aClass4_Sub6_Sub8Array5[local156] != null) {
							local137 |= Static569.aClass4_Sub6_Sub8Array5[local156].method3080(local310);
							local135 |= Static569.aClass4_Sub6_Sub8Array5[local156].method3076(local310);
							local139 |= Static569.aClass4_Sub6_Sub8Array5[local156].method3077(local310);
						}
					} else {
						Static549.anIntArray566[local156] = 0;
						Static283.anIntArray311[local156] = 0;
						Static569.aClass4_Sub6_Sub8Array5[local156] = null;
						Static345.anIntArray370[local156] = -1;
					}
				}
			}
		}
		@Pc(355) int local355 = -1;
		local188 = -1;
		local193 = 0;
		@Pc(367) Class4_Sub6_Sub8 local367 = null;
		@Pc(369) Class4_Sub6_Sub8 local369 = null;
		@Pc(371) int local371 = -1;
		@Pc(373) int local373 = -1;
		@Pc(375) int local375 = 0;
		@Pc(377) Class4_Sub6_Sub8 local377 = null;
		@Pc(379) Class4_Sub6_Sub8 local379 = null;
		if (local147) {
			@Pc(392) int local392;
			@Pc(452) int local452;
			if (arg8 != null) {
				local355 = arg8.anIntArray153[arg3];
				local392 = local355 >>> 16;
				local367 = arg15.method5940(local392);
				local355 &= 0xFFFF;
				if (local367 != null) {
					local137 |= local367.method3080(local355);
					local135 |= local367.method3076(local355);
					local139 |= local367.method3077(local355);
				}
				if ((arg8.aBoolean232 || Static165.aBoolean248) && arg12 != -1 && arg12 < arg8.anIntArray153.length) {
					local193 = arg8.anIntArray150[arg3];
					local188 = arg8.anIntArray153[arg12];
					local452 = local188 >>> 16;
					local369 = local452 == local392 ? local367 : arg15.method5940(local452);
					local188 &= 0xFFFF;
					if (local369 != null) {
						local137 |= local369.method3080(local188);
						local135 |= local369.method3076(local188);
						local139 |= local369.method3077(local188);
					}
				}
			}
			local35 = arg9 | 0x20;
			if (arg2 != null) {
				local371 = arg2.anIntArray153[arg16];
				local392 = local371 >>> 16;
				local371 &= 0xFFFF;
				local377 = arg15.method5940(local392);
				if (local377 != null) {
					local137 |= local377.method3080(local371);
					local135 |= local377.method3076(local371);
					local139 |= local377.method3077(local371);
				}
				if ((arg2.aBoolean232 || Static165.aBoolean248) && arg14 != -1 && arg2.anIntArray153.length > arg14) {
					local375 = arg2.anIntArray150[arg16];
					local373 = arg2.anIntArray153[arg14];
					local452 = local373 >>> 16;
					local379 = local392 == local452 ? local377 : arg15.method5940(local452);
					local373 &= 0xFFFF;
					if (local379 != null) {
						local137 |= local379.method3080(local373);
						local135 |= local379.method3076(local373);
						local139 |= local379.method3077(local373);
					}
				}
			}
			if (local137) {
				local35 |= 0x80;
			}
			if (local135) {
				local35 |= 0x100;
			}
			if (local139) {
				local35 |= 0x400;
			}
		}
		@Pc(620) Class167 local620 = Static461.aClass167_48;
		@Pc(628) Class65 local628;
		synchronized (Static461.aClass167_48) {
			local628 = (Class65) Static461.aClass167_48.method3966(local38);
		}
		@Pc(636) Class252 local636 = null;
		if (this.anInt6206 != -1) {
			local636 = arg4.method5247(this.anInt6206);
		}
		@Pc(667) boolean local667;
		@Pc(669) int local669;
		@Pc(675) int local675;
		@Pc(725) int local725;
		@Pc(731) int local731;
		@Pc(797) int local797;
		if (local628 == null || arg10.method7793(local628.PA(), local35) != 0) {
			if (local628 != null) {
				local35 = arg10.method7778(local35, local628.PA());
			}
			local667 = false;
			for (local669 = 0; local669 < 12; local669++) {
				local675 = local41[local669];
				if ((local675 & 0x40000000) == 0) {
					if ((local675 & Integer.MIN_VALUE) != 0 && !arg17.method2862(local675 & 0x3FFFFFFF).method4046()) {
						local667 = true;
					}
				} else if (!arg1.method977(local675 & 0x3FFFFFFF).method5324(this.aBoolean430)) {
					local667 = true;
				}
			}
			if (local667) {
				if (this.aLong161 != -1L) {
					@Pc(1006) Class167 local1006 = Static461.aClass167_48;
					synchronized (Static461.aClass167_48) {
						local628 = (Class65) Static461.aClass167_48.method3966(this.aLong161);
					}
				}
				if (local628 == null || arg10.method7793(local628.PA(), local35) != 0) {
					return null;
				}
			} else {
				@Pc(723) Class59[] local723 = new Class59[12];
				for (local725 = 0; local725 < 12; local725++) {
					local731 = local41[local725];
					@Pc(749) Class59 local749;
					if ((local731 & 0x40000000) != 0) {
						local749 = arg1.method977(local731 & 0x3FFFFFFF).method5334(this.aBoolean430);
						if (local749 != null) {
							local723[local725] = local749;
						}
					} else if ((Integer.MIN_VALUE & local731) != 0) {
						local749 = arg17.method2862(local731 & 0x3FFFFFFF).method4047();
						if (local749 != null) {
							local723[local725] = local749;
						}
					}
				}
				@Pc(799) int local799;
				if (local636 != null && local636.anIntArrayArray38 != null) {
					for (local731 = 0; local731 < local636.anIntArrayArray38.length; local731++) {
						if (local723[local731] != null) {
							local797 = 0;
							local799 = 0;
							@Pc(801) int local801 = 0;
							@Pc(803) int local803 = 0;
							@Pc(805) int local805 = 0;
							@Pc(807) int local807 = 0;
							if (local636.anIntArrayArray38[local731] != null) {
								local805 = local636.anIntArrayArray38[local731][4] << 3;
								local807 = local636.anIntArrayArray38[local731][5] << 3;
								local803 = local636.anIntArrayArray38[local731][3] << 3;
								local799 = local636.anIntArrayArray38[local731][1];
								local797 = local636.anIntArrayArray38[local731][0];
								local801 = local636.anIntArrayArray38[local731][2];
							}
							if (local803 != 0 || local805 != 0 || local807 != 0) {
								local723[local731].method1590(local807, local803, local805);
							}
							if (local797 != 0 || local799 != 0 || local801 != 0) {
								local723[local731].method1585(local799, local801, local797);
							}
						}
					}
				}
				@Pc(911) Class59 local911 = new Class59(local723, local723.length);
				@Pc(915) int local915 = local35 | 0x4000;
				local628 = arg10.method7828(local911, local915, Static303.anInt6100, 64, 850);
				for (local797 = 0; local797 < 5; local797++) {
					for (local799 = 0; local799 < Static360.aShortArrayArrayArray3.length; local799++) {
						if (Static360.aShortArrayArrayArray3[local799][local797].length > this.anIntArray343[local797]) {
							local628.d(Static217.aShortArrayArray17[local799][local797], Static360.aShortArrayArrayArray3[local799][local797][this.anIntArray343[local797]]);
						}
					}
				}
				local628.SA(local35);
				@Pc(981) Class167 local981 = Static461.aClass167_48;
				synchronized (Static461.aClass167_48) {
					Static461.aClass167_48.method3974(local38, local628);
				}
				this.aLong161 = local38;
			}
		}
		@Pc(1040) Class65 local1040 = local628.method7682((byte) 4, local35, true);
		local667 = false;
		if (arg18 != null) {
			for (local669 = 0; local669 < 12; local669++) {
				if (arg18[local669] != -1) {
					local667 = true;
				}
			}
		}
		if (!local147 && !local667) {
			return local1040;
		}
		@Pc(1067) Class81[] local1067 = null;
		if (local636 != null) {
			local1067 = local636.method5907(arg10);
		}
		if (local667 && local1067 != null) {
			for (local675 = 0; local675 < 12; local675++) {
				if (local1067[local675] != null) {
					local1040.method7668(local1067[local675], 0x1 << local675, true);
				}
			}
		}
		local675 = 0;
		local725 = 1;
		while (local154 > local675) {
			if (Static151.aClass4_Sub6_Sub8Array2[local675] != null) {
				local1040.method7670(Static549.anIntArray566[local675], false, Static151.aClass4_Sub6_Sub8Array2[local675], Static283.anIntArray311[local675] - 1, null, Static345.anIntArray370[local675], local725, Static569.aClass4_Sub6_Sub8Array5[local675], Static516.anIntArray542[local675]);
			}
			local675++;
			local725 <<= 0x1;
		}
		if (local667) {
			for (local731 = 0; local731 < 12; local731++) {
				if (arg18[local731] != -1) {
					local797 = arg18[local731] - arg0;
					local797 &= 0x3FFF;
					@Pc(1175) Class81 local1175 = arg10.method7842();
					local1175.o(local797);
					local1040.method7668(local1175, 0x1 << local731, false);
				}
			}
		}
		if (local667 && local1067 != null) {
			for (local731 = 0; local731 < 12; local731++) {
				if (local1067[local731] != null) {
					local1040.method7668(local1067[local731], 0x1 << local731, false);
				}
			}
		}
		if (local367 != null && local377 != null) {
			local1040.method7681(local375, local373, arg8.aBooleanArray5, local379, local377, arg7 - 1, false, local367, arg13 - 1, local355, local193, local371, local369, local188);
		} else if (local367 != null) {
			local1040.method7689(0, false, local193, local369, local188, arg7 - 1, local355, local367);
		} else if (local377 != null) {
			local1040.method7689(0, false, local375, local379, local373, arg13 - 1, local371, local377);
		}
		for (local731 = 0; local731 < local154; local731++) {
			Static151.aClass4_Sub6_Sub8Array2[local731] = null;
			Static569.aClass4_Sub6_Sub8Array5[local731] = null;
			Static231.aClass111Array1[local731] = null;
		}
		return local1040;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILclient!r;Lclient!gm;Lclient!of;Lclient!oq;Lclient!fo;ILclient!me;ILclient!bc;IB)Lclient!da;")
	public Class65 method4888(@OriginalArg(1) Class7 arg0, @OriginalArg(2) Class127 arg1, @OriginalArg(3) Interface17 arg2, @OriginalArg(4) Class254 arg3, @OriginalArg(5) Class111 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class212 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class29 arg8, @OriginalArg(10) int arg9) {
		if (this.anInt6217 != -1) {
			return arg6.method4992(this.anInt6217).method1375(arg4, arg3, arg9, arg7, arg5, arg0, arg2);
		}
		@Pc(28) int local28 = 2048;
		@Pc(36) boolean local36;
		@Pc(51) int local51;
		@Pc(117) int local117;
		@Pc(59) int local59;
		@Pc(121) int local121;
		if (arg4 != null) {
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			local36 = false;
			@Pc(38) boolean local38 = false;
			local51 = arg4.anIntArray153[arg5];
			local28 = 2080;
			local59 = local51 >>> 16;
			@Pc(64) Class4_Sub6_Sub8 local64 = arg3.method5940(local59);
			@Pc(68) int local68 = local51 & 0xFFFF;
			if (local64 != null) {
				local34 = local64.method3080(local68) | false;
				local32 = local64.method3076(local68) | false;
				local38 = local64.method3077(local68) | false;
				local36 = arg4.aBoolean234 | false;
			}
			if ((arg4.aBoolean232 || Static165.aBoolean248) && arg7 != -1 && arg7 < arg4.anIntArray153.length) {
				local117 = arg4.anIntArray153[arg7];
				local121 = local117 >>> 16;
				@Pc(131) Class4_Sub6_Sub8 local131 = local121 == local59 ? local64 : arg3.method5940(local121);
				@Pc(135) int local135 = local117 & 0xFFFF;
				if (local131 != null) {
					local34 |= local131.method3080(local135);
					local32 |= local131.method3076(local135);
					local38 |= local131.method3077(local135);
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
		@Pc(186) Class167 local186 = Static526.aClass167_59;
		@Pc(197) Class65 local197;
		synchronized (Static526.aClass167_59) {
			local197 = (Class65) Static526.aClass167_59.method3966(this.aLong160);
		}
		if (local197 == null || arg0.method7793(local197.PA(), local28) != 0) {
			if (local197 != null) {
				local28 = arg0.method7778(local28, local197.PA());
			}
			local36 = false;
			for (@Pc(234) int local234 = 0; local234 < 12; local234++) {
				local51 = this.anIntArray345[local234];
				if ((local51 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local51) != 0 && !arg1.method2862(local51 & 0x3FFFFFFF).method4052()) {
						local36 = true;
					}
				} else if (!arg8.method977(local51 & 0x3FFFFFFF).method5339(this.aBoolean430)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(292) Class59[] local292 = new Class59[12];
			local117 = 0;
			for (@Pc(296) int local296 = 0; local296 < 12; local296++) {
				@Pc(303) int local303 = this.anIntArray345[local296];
				@Pc(321) Class59 local321;
				if ((local303 & 0x40000000) != 0) {
					local321 = arg8.method977(local303 & 0x3FFFFFFF).method5332(this.aBoolean430);
					if (local321 != null) {
						local292[local117++] = local321;
					}
				} else if ((local303 & Integer.MIN_VALUE) != 0) {
					local321 = arg1.method2862(local303 & 0x3FFFFFFF).method4051();
					if (local321 != null) {
						local292[local117++] = local321;
					}
				}
			}
			@Pc(365) int local365 = local28 | 0x4000;
			@Pc(371) Class59 local371 = new Class59(local292, local117);
			local197 = arg0.method7828(local371, local365, Static303.anInt6100, 64, 768);
			for (local59 = 0; local59 < 5; local59++) {
				for (local121 = 0; local121 < Static360.aShortArrayArrayArray3.length; local121++) {
					if (Static360.aShortArrayArrayArray3[local121][local59].length > this.anIntArray343[local59]) {
						local197.d(Static217.aShortArrayArray17[local121][local59], Static360.aShortArrayArrayArray3[local121][local59][this.anIntArray343[local59]]);
					}
				}
			}
			local197.SA(local28);
			@Pc(437) Class167 local437 = Static526.aClass167_59;
			synchronized (Static526.aClass167_59) {
				Static526.aClass167_59.method3974(this.aLong160, local197);
			}
		}
		if (arg4 == null) {
			return local197;
		} else {
			local197.method7682((byte) 4, local28, true);
			return arg4.method2546(2048, arg7, arg5, local197, arg9);
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(BLclient!bc;II)V")
	public void method4889(@OriginalArg(1) Class29 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == -1) {
			this.anIntArray345[arg1] = 0;
		} else if (arg0.method977(arg2) != null) {
			this.anIntArray345[arg1] = arg2 | 0x40000000;
			this.method4895();
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(BIILclient!gm;)V")
	public void method4891(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class127 arg2) {
		@Pc(15) int local15 = Static282.anIntArray309[arg0];
		if (arg2.method2862(arg1) != null) {
			this.anIntArray345[local15] = Integer.MIN_VALUE | arg1;
			this.method4895();
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIIIIILclient!gm;Lclient!fo;Lclient!oq;ILclient!r;)Lclient!da;")
	public Class65 method4892(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class127 arg5, @OriginalArg(8) Class111 arg6, @OriginalArg(9) Class254 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class7 arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(94) int local94;
		@Pc(38) int local38;
		if (arg6 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			@Pc(30) int local30 = arg6.anIntArray153[arg0];
			local7 = 2080;
			local38 = local30 >>> 16;
			@Pc(43) Class4_Sub6_Sub8 local43 = arg7.method5940(local38);
			@Pc(47) int local47 = local30 & 0xFFFF;
			if (local43 != null) {
				local13 = local43.method3080(local47) | false;
				local11 = local43.method3076(local47) | false;
				local17 = local43.method3077(local47) | false;
				local15 = arg6.aBoolean234 | false;
			}
			if ((arg6.aBoolean232 || Static165.aBoolean248) && arg2 != -1 && arg2 < arg6.anIntArray153.length) {
				local94 = arg6.anIntArray153[arg2];
				@Pc(98) int local98 = local94 >>> 16;
				@Pc(102) int local102 = local94 & 0xFFFF;
				@Pc(107) Class4_Sub6_Sub8 local107;
				if (local38 == local98) {
					local107 = local43;
				} else {
					local107 = arg7.method5940(local102 >>> 16);
				}
				if (local107 != null) {
					local13 |= local107.method3080(local102);
					local11 |= local107.method3076(local102);
					local17 |= local107.method3077(local102);
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
		@Pc(175) long local175 = (long) arg8 | (long) arg1 << 32 | (long) (arg3 << 16);
		@Pc(177) Class167 local177 = Static526.aClass167_59;
		@Pc(185) Class65 local185;
		synchronized (Static526.aClass167_59) {
			local185 = (Class65) Static526.aClass167_59.method3966(local175);
		}
		if (local185 == null || arg9.method7793(local185.PA(), local7) != 0) {
			if (local185 != null) {
				local7 = arg9.method7778(local7, local185.PA());
			}
			@Pc(215) Class59[] local215 = new Class59[3];
			local94 = 0;
			if (!arg5.method2862(arg8).method4052() || !arg5.method2862(arg3).method4052() || !arg5.method2862(arg1).method4052()) {
				return null;
			}
			@Pc(247) Class59 local247 = arg5.method2862(arg8).method4051();
			if (local247 != null) {
				local94++;
				local215[0] = local247;
			}
			local247 = arg5.method2862(arg3).method4051();
			if (local247 != null) {
				local215[local94++] = local247;
			}
			local247 = arg5.method2862(arg1).method4051();
			if (local247 != null) {
				local215[local94++] = local247;
			}
			local247 = new Class59(local215, local94);
			@Pc(292) int local292 = local7 | 0x4000;
			local185 = arg9.method7828(local247, local292, Static303.anInt6100, 64, 768);
			for (@Pc(302) int local302 = 0; local302 < 5; local302++) {
				for (local38 = 0; local38 < Static360.aShortArrayArrayArray3.length; local38++) {
					if (Static360.aShortArrayArrayArray3[local38][local302].length > this.anIntArray343[local302]) {
						local185.d(Static217.aShortArrayArray17[local38][local302], Static360.aShortArrayArrayArray3[local38][local302][this.anIntArray343[local302]]);
					}
				}
			}
			local185.SA(local7);
			@Pc(354) Class167 local354 = Static526.aClass167_59;
			synchronized (Static526.aClass167_59) {
				Static526.aClass167_59.method3974(local175, local185);
			}
		}
		if (arg6 == null) {
			return local185;
		} else {
			local185 = local185.method7682((byte) 4, local7, true);
			return arg6.method2546(2048, arg2, arg0, local185, arg4);
		}
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(III)V")
	public void method4893(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray343[arg0] = arg1;
		this.method4895();
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ZI)V")
	public void method4894(@OriginalArg(0) boolean arg0) {
		this.aBoolean430 = arg0;
		this.method4895();
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)V")
	private void method4895() {
		@Pc(7) long[] local7 = Class194.aLongArray7;
		this.aLong160 = -1L;
		this.aLong160 = this.aLong160 >>> 8 ^ local7[(int) ((this.aLong160 ^ (long) (this.anInt6206 >> 8)) & 0xFFL)];
		this.aLong160 = this.aLong160 >>> 8 ^ local7[(int) (((long) this.anInt6206 ^ this.aLong160) & 0xFFL)];
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong160 = local7[(int) (((long) (this.anIntArray345[local50] >> 24) ^ this.aLong160) & 0xFFL)] ^ this.aLong160 >>> 8;
			this.aLong160 = this.aLong160 >>> 8 ^ local7[(int) ((this.aLong160 ^ (long) (this.anIntArray345[local50] >> 16)) & 0xFFL)];
			this.aLong160 = this.aLong160 >>> 8 ^ local7[(int) ((this.aLong160 ^ (long) (this.anIntArray345[local50] >> 8)) & 0xFFL)];
			this.aLong160 = local7[(int) ((this.aLong160 ^ (long) this.anIntArray345[local50]) & 0xFFL)] ^ this.aLong160 >>> 8;
		}
		for (@Pc(152) int local152 = 0; local152 < 5; local152++) {
			this.aLong160 = local7[(int) (((long) this.anIntArray343[local152] ^ this.aLong160) & 0xFFL)] ^ this.aLong160 >>> 8;
		}
		this.aLong160 = this.aLong160 >>> 8 ^ local7[(int) (((long) (this.aBoolean430 ? 1 : 0) ^ this.aLong160) & 0xFFL)];
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "([IZIZ[II)V")
	public void method4897(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		this.anIntArray343 = arg0;
		this.anInt6217 = arg4;
		if (this.anInt6206 != arg2) {
			this.anInt6206 = arg2;
		}
		this.anIntArray345 = arg3;
		this.aBoolean430 = arg1;
		this.method4895();
	}
}
