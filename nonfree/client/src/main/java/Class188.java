import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class188 {

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "[I")
	private int[] anIntArray481;

	@OriginalMember(owner = "client!pt", name = "e", descriptor = "[I")
	public int[] anIntArray482;

	@OriginalMember(owner = "client!pt", name = "h", descriptor = "J")
	private long aLong164;

	@OriginalMember(owner = "client!pt", name = "k", descriptor = "I")
	private int anInt5615;

	@OriginalMember(owner = "client!pt", name = "l", descriptor = "J")
	private long aLong165;

	@OriginalMember(owner = "client!pt", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!pt", name = "t", descriptor = "Z")
	public boolean aBoolean375;

	@OriginalMember(owner = "client!pt", name = "u", descriptor = "I")
	public int anInt5620 = -1;

	static {
		new Class242("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
		new Class242("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V")
	private void method4317() {
		@Pc(7) long[] local7 = Class112.aLongArray4;
		this.aLong164 = -1L;
		this.aLong164 = this.aLong164 >>> 8 ^ local7[(int) ((this.aLong164 ^ (long) (this.anInt5615 >> 8)) & 0xFFL)];
		this.aLong164 = local7[(int) ((this.aLong164 ^ (long) this.anInt5615) & 0xFFL)] ^ this.aLong164 >>> 8;
		for (@Pc(59) int local59 = 0; local59 < 12; local59++) {
			this.aLong164 = this.aLong164 >>> 8 ^ local7[(int) ((this.aLong164 ^ (long) (this.anIntArray481[local59] >> 24)) & 0xFFL)];
			this.aLong164 = this.aLong164 >>> 8 ^ local7[(int) ((this.aLong164 ^ (long) (this.anIntArray481[local59] >> 16)) & 0xFFL)];
			this.aLong164 = this.aLong164 >>> 8 ^ local7[(int) ((this.aLong164 ^ (long) (this.anIntArray481[local59] >> 8)) & 0xFFL)];
			this.aLong164 = local7[(int) (((long) this.anIntArray481[local59] ^ this.aLong164) & 0xFFL)] ^ this.aLong164 >>> 8;
		}
		for (@Pc(155) int local155 = 0; local155 < 5; local155++) {
			this.aLong164 = local7[(int) (((long) this.anIntArray482[local155] ^ this.aLong164) & 0xFFL)] ^ this.aLong164 >>> 8;
		}
		this.aLong164 = this.aLong164 >>> 8 ^ local7[(int) (((long) (this.aBoolean375 ? 1 : 0) ^ this.aLong164) & 0xFFL)];
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIILclient!aj;Lclient!ru;Lclient!fb;Lclient!tq;Lclient!dm;Lclient!rg;Lclient!qa;IB)Lclient!c;")
	public Class7 method4319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class10 arg2, @OriginalArg(4) Class211 arg3, @OriginalArg(5) Interface4 arg4, @OriginalArg(6) Class233 arg5, @OriginalArg(7) Class50 arg6, @OriginalArg(8) Class204 arg7, @OriginalArg(9) Class30 arg8, @OriginalArg(10) int arg9) {
		if (this.anInt5620 != -1) {
			return arg3.method4931(this.anInt5620).method5340(arg8, arg2, arg1, arg0, arg9, arg4, arg5);
		}
		@Pc(28) int local28 = 2048;
		@Pc(36) boolean local36;
		@Pc(49) int local49;
		@Pc(118) int local118;
		@Pc(59) int local59;
		if (arg5 != null) {
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			local36 = false;
			@Pc(38) boolean local38 = false;
			local49 = arg5.anIntArray593[arg9];
			local28 = 2080;
			local59 = local49 >>> 16;
			@Pc(63) int local63 = local49 & 0xFFFF;
			@Pc(68) Class4_Sub1_Sub12 local68 = arg2.method288(local59);
			if (local68 != null) {
				local34 = local68.method3628(local63) | false;
				local32 = local68.method3625(local63) | false;
				local38 = local68.method3627(local63) | false;
				local36 = arg5.aBoolean452 | false;
			}
			if ((arg5.aBoolean450 || Static218.aBoolean291) && arg1 != -1 && arg1 < arg5.anIntArray593.length) {
				local118 = arg5.anIntArray593[arg1];
				@Pc(122) int local122 = local118 >>> 16;
				@Pc(132) Class4_Sub1_Sub12 local132 = local59 == local122 ? local68 : arg2.method288(local122);
				@Pc(136) int local136 = local118 & 0xFFFF;
				if (local132 != null) {
					local34 |= local132.method3628(local136);
					local32 |= local132.method3625(local136);
					local38 |= local132.method3627(local136);
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
		@Pc(192) Class69 local192 = Static51.aClass69_11;
		@Pc(201) Class7 local201;
		synchronized (Static51.aClass69_11) {
			local201 = (Class7) Static51.aClass69_11.method1591(this.aLong164);
		}
		if (local201 == null || arg8.method4674(local201.n(), local28) != 0) {
			if (local201 != null) {
				local28 = arg8.method4665(local28, local201.n());
			}
			local36 = false;
			for (@Pc(229) int local229 = 0; local229 < 12; local229++) {
				local49 = this.anIntArray481[local229];
				if ((local49 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local49) != 0 && !arg6.method1384(local49 & 0x3FFFFFFF).method3208()) {
						local36 = true;
					}
				} else if (!arg7.method4629(local49 & 0x3FFFFFFF).method2737(this.aBoolean375)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(281) Class208[] local281 = new Class208[12];
			local118 = 0;
			for (@Pc(285) int local285 = 0; local285 < 12; local285++) {
				@Pc(292) int local292 = this.anIntArray481[local285];
				@Pc(317) Class208 local317;
				if ((local292 & 0x40000000) != 0) {
					local317 = arg7.method4629(local292 & 0x3FFFFFFF).method2736(this.aBoolean375);
					if (local317 != null) {
						local281[local118++] = local317;
					}
				} else if ((Integer.MIN_VALUE & local292) != 0) {
					local317 = arg6.method1384(local292 & 0x3FFFFFFF).method3205();
					if (local317 != null) {
						local281[local118++] = local317;
					}
				}
			}
			@Pc(352) int local352 = local28 | 0x4000;
			@Pc(358) Class208 local358 = new Class208(local281, local118);
			local201 = arg8.method4655(local358, local352, Static435.anInt7257, 64, 768);
			for (local59 = 0; local59 < 5; local59++) {
				if (this.anIntArray482[local59] < Static246.aShortArrayArray7[local59].length) {
					local201.N(Static99.aShortArray74[local59], Static246.aShortArrayArray7[local59][this.anIntArray482[local59]]);
				}
				if (this.anIntArray482[local59] < Static30.aShortArrayArray1[local59].length) {
					local201.N(Static49.aShortArray14[local59], Static30.aShortArrayArray1[local59][this.anIntArray482[local59]]);
				}
			}
			local201.u(local28);
			@Pc(429) Class69 local429 = Static51.aClass69_11;
			synchronized (Static51.aClass69_11) {
				Static51.aClass69_11.method1590(this.aLong164, local201);
			}
		}
		if (arg5 == null) {
			return local201;
		} else {
			local201.method4077((byte) 4, local28, true);
			return arg5.method5242(arg1, 2048, arg0, local201, arg9);
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZI)V")
	public void method4320(@OriginalArg(0) boolean arg0) {
		this.aBoolean375 = arg0;
		this.method4317();
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILclient!ta;Lclient!fb;IZIZLclient!dm;ILclient!qa;IILclient!rg;[Lclient!hj;Lclient!tq;Lclient!ru;Lclient!aj;Lclient!tq;I)Lclient!c;")
	public Class7 method4321(@OriginalArg(0) int arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) Class50 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class30 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) Class204 arg10, @OriginalArg(13) Class109[] arg11, @OriginalArg(14) Class233 arg12, @OriginalArg(15) Class211 arg13, @OriginalArg(16) Class10 arg14, @OriginalArg(17) Class233 arg15, @OriginalArg(18) int arg16) {
		if (this.anInt5620 != -1) {
			return arg13.method4931(this.anInt5620).method5335(arg1, arg8, arg16, arg6, arg4, arg15, arg0, arg3, arg14, arg11, arg12, arg2, arg7, arg9);
		}
		@Pc(38) int local38 = arg6;
		@Pc(41) long local41 = this.aLong164;
		@Pc(44) int[] local44 = this.anIntArray481;
		if (arg15 != null && (arg15.anInt6746 >= 0 || arg15.anInt6757 >= 0)) {
			local44 = new int[12];
			for (@Pc(63) int local63 = 0; local63 < 12; local63++) {
				local44[local63] = this.anIntArray481[local63];
			}
			if (arg15.anInt6746 >= 0) {
				if (arg15.anInt6746 == 65535) {
					local44[5] = 0;
					local41 ^= 0xFFFFFFFF00000000L;
				} else {
					local44[5] = arg15.anInt6746 | 0x40000000;
					local41 ^= (long) local44[5] << 32;
				}
			}
			if (arg15.anInt6757 >= 0) {
				if (arg15.anInt6757 == 65535) {
					local44[3] = 0;
					local41 ^= 0xFFFFFFFFL;
				} else {
					local44[3] = arg15.anInt6757 | 0x40000000;
					local41 ^= local44[3];
				}
			}
		}
		@Pc(150) boolean local150 = false;
		@Pc(152) boolean local152 = false;
		@Pc(154) boolean local154 = false;
		@Pc(162) boolean local162 = arg15 != null || arg12 != null;
		@Pc(169) int local169 = arg11 == null ? 0 : arg11.length;
		@Pc(203) int local203;
		@Pc(208) int local208;
		for (@Pc(171) int local171 = 0; local171 < local169; local171++) {
			Static42.aClass4_Sub1_Sub12Array1[local171] = null;
			if (arg11[local171] != null) {
				@Pc(189) Class233 local189 = arg14.method286(arg11[local171].anInt2837);
				if (local189.anIntArray593 != null) {
					local162 = true;
					Static195.aClass233Array7[local171] = local189;
					local203 = arg11[local171].anInt2833;
					local208 = arg11[local171].anInt2836;
					@Pc(213) int local213 = local189.anIntArray593[local203];
					Static42.aClass4_Sub1_Sub12Array1[local171] = arg14.method288(local213 >>> 16);
					@Pc(226) int local226 = local213 & 0xFFFF;
					Static33.anIntArray66[local171] = local226;
					if (Static42.aClass4_Sub1_Sub12Array1[local171] != null) {
						local152 |= Static42.aClass4_Sub1_Sub12Array1[local171].method3628(local226);
						local150 |= Static42.aClass4_Sub1_Sub12Array1[local171].method3625(local226);
						local154 |= Static42.aClass4_Sub1_Sub12Array1[local171].method3627(local226);
					}
					if ((local189.aBoolean450 || Static218.aBoolean291) && local208 != -1 && local208 < local189.anIntArray593.length) {
						Static439.anIntArray644[local171] = local189.anIntArray591[local203];
						Static55.anIntArray93[local171] = arg11[local171].anInt2835;
						@Pc(311) int local311 = local189.anIntArray593[local208];
						Static280.aClass4_Sub1_Sub12Array5[local171] = arg14.method288(local311 >>> 16);
						@Pc(324) int local324 = local311 & 0xFFFF;
						Static247.anIntArray466[local171] = local324;
						if (Static280.aClass4_Sub1_Sub12Array5[local171] != null) {
							local152 |= Static280.aClass4_Sub1_Sub12Array5[local171].method3628(local324);
							local150 |= Static280.aClass4_Sub1_Sub12Array5[local171].method3625(local324);
							local154 |= Static280.aClass4_Sub1_Sub12Array5[local171].method3627(local324);
						}
					} else {
						Static439.anIntArray644[local171] = 0;
						Static55.anIntArray93[local171] = 0;
						Static280.aClass4_Sub1_Sub12Array5[local171] = null;
						Static247.anIntArray466[local171] = -1;
					}
				}
			}
		}
		@Pc(369) int local369 = -1;
		local203 = -1;
		local208 = 0;
		@Pc(375) Class4_Sub1_Sub12 local375 = null;
		@Pc(377) Class4_Sub1_Sub12 local377 = null;
		@Pc(379) int local379 = -1;
		@Pc(381) int local381 = -1;
		@Pc(383) int local383 = 0;
		@Pc(385) Class4_Sub1_Sub12 local385 = null;
		@Pc(387) Class4_Sub1_Sub12 local387 = null;
		if (local162) {
			@Pc(400) int local400;
			@Pc(464) int local464;
			if (arg15 != null) {
				local369 = arg15.anIntArray593[arg16];
				local400 = local369 >>> 16;
				local375 = arg14.method288(local400);
				local369 &= 0xFFFF;
				if (local375 != null) {
					local152 |= local375.method3628(local369);
					local150 |= local375.method3625(local369);
					local154 |= local375.method3627(local369);
				}
				if ((arg15.aBoolean450 || Static218.aBoolean291) && arg8 != -1 && arg15.anIntArray593.length > arg8) {
					local208 = arg15.anIntArray591[arg16];
					local203 = arg15.anIntArray593[arg8];
					local464 = local203 >>> 16;
					local203 &= 0xFFFF;
					local377 = local400 == local464 ? local375 : arg14.method288(local464);
					if (local377 != null) {
						local152 |= local377.method3628(local203);
						local150 |= local377.method3625(local203);
						local154 |= local377.method3627(local203);
					}
				}
			}
			local38 = arg6 | 0x20;
			if (arg12 != null) {
				local379 = arg12.anIntArray593[arg0];
				local400 = local379 >>> 16;
				local379 &= 0xFFFF;
				local385 = arg14.method288(local400);
				if (local385 != null) {
					local152 |= local385.method3628(local379);
					local150 |= local385.method3625(local379);
					local154 |= local385.method3627(local379);
				}
				if ((arg12.aBoolean450 || Static218.aBoolean291) && arg9 != -1 && arg12.anIntArray593.length > arg9) {
					local383 = arg12.anIntArray591[arg0];
					local381 = arg12.anIntArray593[arg9];
					local464 = local381 >>> 16;
					local387 = local464 == local400 ? local385 : arg14.method288(local464);
					local381 &= 0xFFFF;
					if (local387 != null) {
						local152 |= local387.method3628(local381);
						local150 |= local387.method3625(local381);
						local154 |= local387.method3627(local381);
					}
				}
			}
			if (local152) {
				local38 |= 0x80;
			}
			if (local150) {
				local38 |= 0x100;
			}
			if (local154) {
				local38 |= 0x400;
			}
		}
		@Pc(637) Class69 local637 = Static67.aClass69_13;
		@Pc(645) Class7 local645;
		synchronized (Static67.aClass69_13) {
			local645 = (Class7) Static67.aClass69_13.method1591(local41);
		}
		@Pc(653) Class132 local653 = null;
		if (this.anInt5615 != -1) {
			local653 = arg1.method5109(this.anInt5615);
		}
		@Pc(693) int local693;
		@Pc(699) int local699;
		if (local645 == null || arg7.method4674(local645.n(), local38) != 0 || local653 != null && local653.anIntArrayArray32 != null && this.anIntArrayArray51 == null) {
			if (local645 != null) {
				local38 = arg7.method4665(local38, local645.n());
			}
			@Pc(691) boolean local691 = false;
			local693 = 0;
			while (true) {
				if (local693 >= 12) {
					if (local691) {
						if (this.aLong165 != -1L) {
							@Pc(754) Class69 local754 = Static67.aClass69_13;
							synchronized (Static67.aClass69_13) {
								local645 = (Class7) Static67.aClass69_13.method1591(this.aLong165);
							}
						}
						if (local645 == null || arg7.method4674(local645.n(), local38) != 0 || local653 != null && local653.anIntArrayArray32 != null && this.anIntArrayArray51 == null) {
							return null;
						}
					} else {
						@Pc(793) Class208[] local793 = new Class208[12];
						@Pc(801) int local801;
						for (@Pc(795) int local795 = 0; local795 < 12; local795++) {
							local801 = local44[local795];
							@Pc(816) Class208 local816;
							if ((local801 & 0x40000000) != 0) {
								local816 = arg10.method4629(local801 & 0x3FFFFFFF).method2739(this.aBoolean375);
								if (local816 != null) {
									local793[local795] = local816;
								}
							} else if ((local801 & Integer.MIN_VALUE) != 0) {
								local816 = arg5.method1384(local801 & 0x3FFFFFFF).method3206();
								if (local816 != null) {
									local793[local795] = local816;
								}
							}
						}
						@Pc(877) int local877;
						if (local653 != null && local653.anIntArrayArray32 != null) {
							for (local801 = 0; local801 < local653.anIntArrayArray32.length; local801++) {
								if (local653.anIntArrayArray32[local801] != null && local793[local801] != null) {
									local877 = local653.anIntArrayArray32[local801][0];
									@Pc(884) int local884 = local653.anIntArrayArray32[local801][1];
									@Pc(891) int local891 = local653.anIntArrayArray32[local801][2];
									@Pc(900) int local900 = local653.anIntArrayArray32[local801][3] << 3;
									@Pc(909) int local909 = local653.anIntArrayArray32[local801][4] << 3;
									@Pc(918) int local918 = local653.anIntArrayArray32[local801][5] << 3;
									if (this.anIntArrayArray51 == null) {
										this.anIntArrayArray51 = new int[local653.anIntArrayArray32.length][];
									}
									if (this.anIntArrayArray51[local801] == null) {
										@Pc(940) int[] local940 = this.anIntArrayArray51[local801] = new int[15];
										if (local900 == 0 && local909 == 0 && local918 == 0) {
											local940[12] = -local877;
											local940[0] = local940[4] = local940[8] = 32768;
											local940[13] = -local884;
											local940[14] = -local891;
										} else {
											@Pc(956) int local956 = Class56.anIntArray120[local900];
											@Pc(960) int local960 = Class56.anIntArray119[local900];
											@Pc(964) int local964 = Class56.anIntArray120[local909];
											@Pc(968) int local968 = Class56.anIntArray119[local909];
											@Pc(972) int local972 = Class56.anIntArray120[local918];
											@Pc(976) int local976 = Class56.anIntArray119[local918];
											@Pc(984) int local984 = local972 * local960 + 16384 >> 15;
											@Pc(992) int local992 = local976 * local960 + 16384 >> 15;
											local940[0] = local964 * local972 + local968 * local992 + 16384 >> 15;
											local940[1] = local964 * -local976 + local968 * local984 + 16384 >> 15;
											local940[2] = local956 * local968 + 16384 >> 15;
											local940[8] = local956 * local964 + 16384 >> 15;
											local940[4] = local972 * local956 + 16384 >> 15;
											local940[3] = local956 * local976 + 16384 >> 15;
											local940[6] = local972 * -local968 + local992 * local964 + 16384 >> 15;
											local940[7] = -local968 * -local976 + local964 * local984 + 16384 >> 15;
											local940[5] = -local960;
											local940[14] = -local891 * local940[8] + -local884 * local940[5] + -local877 * local940[2] + 16384 >> 15;
											local940[13] = -local891 * local940[7] + local940[1] * -local877 + -local884 * local940[4] + 16384 >> 15;
											local940[12] = -local891 * local940[6] + -local877 * local940[0] + -local884 * local940[3] + 16384 >> 15;
										}
										local940[9] = local877;
										local940[10] = local884;
										local940[11] = local891;
									}
									if (local900 != 0 || local909 != 0 || local918 != 0) {
										local793[local801].method4816(local918, local909, local900);
									}
									if (local877 != 0 || local884 != 0 || local891 != 0) {
										local793[local801].method4805(local891, local877, local884);
									}
								}
							}
						}
						@Pc(1274) Class208 local1274 = new Class208(local793, local793.length);
						@Pc(1278) int local1278 = local38 | 0x4000;
						local645 = arg7.method4655(local1274, local1278, Static435.anInt7257, 64, 850);
						for (local877 = 0; local877 < 5; local877++) {
							if (Static246.aShortArrayArray7[local877].length > this.anIntArray482[local877]) {
								local645.N(Static99.aShortArray74[local877], Static246.aShortArrayArray7[local877][this.anIntArray482[local877]]);
							}
							if (Static30.aShortArrayArray1[local877].length > this.anIntArray482[local877]) {
								local645.N(Static49.aShortArray14[local877], Static30.aShortArrayArray1[local877][this.anIntArray482[local877]]);
							}
						}
						local645.u(local38);
						@Pc(1349) Class69 local1349 = Static67.aClass69_13;
						synchronized (Static67.aClass69_13) {
							Static67.aClass69_13.method1590(local41, local645);
						}
						this.aLong165 = local41;
					}
					break;
				}
				local699 = local44[local693];
				if ((local699 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local699) != 0 && !arg5.method1384(local699 & 0x3FFFFFFF).method3210()) {
						local691 = true;
					}
				} else if (!arg10.method4629(local699 & 0x3FFFFFFF).method2732(this.aBoolean375)) {
					local691 = true;
				}
				local693++;
			}
		}
		@Pc(1371) Class7 local1371 = local645.method4077((byte) 4, local38, true);
		if (!local162) {
			return local1371;
		}
		@Pc(1377) int local1377 = 0;
		local693 = 1;
		while (local1377 < local169) {
			if (Static42.aClass4_Sub1_Sub12Array1[local1377] != null) {
				local1371.method4089(Static247.anIntArray466[local1377], Static439.anIntArray644[local1377], false, Static42.aClass4_Sub1_Sub12Array1[local1377], Static33.anIntArray66[local1377], local693, Static280.aClass4_Sub1_Sub12Array5[local1377], Static55.anIntArray93[local1377] - 1, this.anIntArrayArray51 == null ? null : this.anIntArrayArray51[local1377]);
			}
			local1377++;
			local693 <<= 0x1;
		}
		if (local375 != null && local385 != null) {
			local1371.method4085(arg15.aBooleanArray26, local379, local383, local377, arg3 - 1, local385, local203, local375, local381, false, arg4 - 1, local387, local369, local208);
		} else if (local375 != null) {
			local1371.method4080(local208, 0, local203, local369, false, local375, arg4 - 1, local377);
		} else if (local385 != null) {
			local1371.method4080(local383, 0, local381, local379, false, local385, arg3 - 1, local387);
		}
		for (local699 = 0; local699 < local169; local699++) {
			Static42.aClass4_Sub1_Sub12Array1[local699] = null;
			Static280.aClass4_Sub1_Sub12Array5[local699] = null;
			Static195.aClass233Array7[local699] = null;
		}
		return local1371;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(III)V")
	public void method4322(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray482[arg0] = arg1;
		this.method4317();
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IZLclient!dm;I)V")
	public void method4324(@OriginalArg(0) int arg0, @OriginalArg(2) Class50 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = Static109.anIntArray614[arg2];
		if (this.anIntArray481[local7] != 0 && arg1.method1384(arg0) != null) {
			this.anIntArray481[local7] = arg0 | Integer.MIN_VALUE;
			this.method4317();
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(II[IIZ[I)V")
	public void method4326(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int[] arg4) {
		this.anIntArray481 = arg1;
		this.anInt5620 = arg2;
		this.anIntArray482 = arg4;
		this.aBoolean375 = arg3;
		if (this.anInt5615 != arg0) {
			this.anInt5615 = arg0;
			this.anIntArrayArray51 = null;
		}
		this.method4317();
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!tq;ILclient!dm;ILclient!aj;Lclient!qa;IIIIII)Lclient!c;")
	public Class7 method4327(@OriginalArg(0) Class233 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50 arg2, @OriginalArg(4) Class10 arg3, @OriginalArg(5) Class30 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(100) int local100;
		if (arg0 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			@Pc(28) int local28 = arg0.anIntArray593[arg1];
			local7 = 2080;
			@Pc(38) int local38 = local28 >>> 16;
			@Pc(43) Class4_Sub1_Sub12 local43 = arg3.method288(local38);
			@Pc(47) int local47 = local28 & 0xFFFF;
			if (local43 != null) {
				local13 = local43.method3628(local47) | false;
				local11 = local43.method3625(local47) | false;
				local17 = local43.method3627(local47) | false;
				local15 = arg0.aBoolean452 | false;
			}
			if ((arg0.aBoolean450 || Static218.aBoolean291) && arg7 != -1 && arg7 < arg0.anIntArray593.length) {
				local100 = arg0.anIntArray593[arg7];
				@Pc(104) int local104 = local100 >>> 16;
				@Pc(108) int local108 = local100 & 0xFFFF;
				@Pc(117) Class4_Sub1_Sub12 local117;
				if (local38 == local104) {
					local117 = local43;
				} else {
					local117 = arg3.method288(local108 >>> 16);
				}
				if (local117 != null) {
					local13 |= local117.method3628(local108);
					local11 |= local117.method3625(local108);
					local17 |= local117.method3627(local108);
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
		@Pc(185) long local185 = (long) (arg9 << 16) | (long) arg8 << 32 | (long) arg5;
		@Pc(187) Class69 local187 = Static51.aClass69_11;
		@Pc(195) Class7 local195;
		synchronized (Static51.aClass69_11) {
			local195 = (Class7) Static51.aClass69_11.method1591(local185);
		}
		if (local195 == null || arg4.method4674(local195.n(), local7) != 0) {
			if (local195 != null) {
				local7 = arg4.method4665(local7, local195.n());
			}
			@Pc(225) Class208[] local225 = new Class208[3];
			local100 = 0;
			if (!arg2.method1384(arg5).method3208() || !arg2.method1384(arg9).method3208() || !arg2.method1384(arg8).method3208()) {
				return null;
			}
			@Pc(257) Class208 local257 = arg2.method1384(arg5).method3205();
			if (local257 != null) {
				local100++;
				local225[0] = local257;
			}
			local257 = arg2.method1384(arg9).method3205();
			if (local257 != null) {
				local225[local100++] = local257;
			}
			local257 = arg2.method1384(arg8).method3205();
			if (local257 != null) {
				local225[local100++] = local257;
			}
			local257 = new Class208(local225, local100);
			@Pc(302) int local302 = local7 | 0x4000;
			local195 = arg4.method4655(local257, local302, Static435.anInt7257, 64, 768);
			for (@Pc(312) int local312 = 0; local312 < 5; local312++) {
				if (this.anIntArray482[local312] < Static246.aShortArrayArray7[local312].length) {
					local195.N(Static99.aShortArray74[local312], Static246.aShortArrayArray7[local312][this.anIntArray482[local312]]);
				}
				if (Static30.aShortArrayArray1[local312].length > this.anIntArray482[local312]) {
					local195.N(Static49.aShortArray14[local312], Static30.aShortArrayArray1[local312][this.anIntArray482[local312]]);
				}
			}
			local195.u(local7);
			@Pc(371) Class69 local371 = Static51.aClass69_11;
			synchronized (Static51.aClass69_11) {
				Static51.aClass69_11.method1590(local185, local195);
			}
		}
		if (arg0 == null) {
			return local195;
		} else {
			local195 = local195.method4077((byte) 4, local7, true);
			return arg0.method5242(arg7, 2048, arg6, local195, arg1);
		}
	}
}
