import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class201 {

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "Z")
	public boolean aBoolean486;

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
	private int anInt6001;

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "[I")
	public int[] anIntArray442;

	@OriginalMember(owner = "client!qn", name = "n", descriptor = "[I")
	private int[] anIntArray444;

	@OriginalMember(owner = "client!qn", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!qn", name = "u", descriptor = "J")
	private long aLong173;

	@OriginalMember(owner = "client!qn", name = "v", descriptor = "J")
	private long aLong174;

	@OriginalMember(owner = "client!qn", name = "s", descriptor = "I")
	public int anInt6012 = -1;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!io;III)V")
	public void method4758(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static73.anIntArray64[arg1];
		if (this.anIntArray444[local7] != 0 && arg0.method2742(arg2) != null) {
			this.anIntArray444[local7] = arg2 | Integer.MIN_VALUE;
			this.method4768();
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IZII[I[I)V")
	public void method4761(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4) {
		this.anIntArray442 = arg4;
		if (arg0 != this.anInt6001) {
			this.anIntArrayArray44 = null;
			this.anInt6001 = arg0;
		}
		this.aBoolean486 = arg1;
		this.anIntArray444 = arg3;
		this.anInt6012 = arg2;
		this.method4768();
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BII)V")
	public void method4762(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray442[arg0] = arg1;
		this.method4768();
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BZ)V")
	public void method4763(@OriginalArg(1) boolean arg0) {
		this.aBoolean486 = arg0;
		this.method4768();
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILclient!qa;ILclient!dn;ILclient!io;IILclient!cl;Lclient!bk;Lclient!av;Lclient!pn;)Lclient!c;")
	public Class37 method4764(@OriginalArg(0) int arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class58 arg3, @OriginalArg(5) Class122 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class45 arg6, @OriginalArg(9) Class26 arg7, @OriginalArg(10) Interface1 arg8, @OriginalArg(11) Class193 arg9) {
		if (this.anInt6012 != -1) {
			return arg7.method429(this.anInt6012).method4416(arg2, arg1, arg8, arg0, arg3, arg5, arg6);
		}
		@Pc(27) int local27 = 2048;
		@Pc(35) boolean local35;
		@Pc(50) int local50;
		@Pc(118) int local118;
		@Pc(58) int local58;
		if (arg3 != null) {
			@Pc(31) boolean local31 = false;
			@Pc(33) boolean local33 = false;
			local35 = false;
			@Pc(37) boolean local37 = false;
			local50 = arg3.anIntArray65[arg5];
			local27 = 2080;
			local58 = local50 >>> 16;
			@Pc(62) int local62 = local50 & 0xFFFF;
			@Pc(67) Class1_Sub1_Sub16 local67 = arg6.method689(local58);
			if (local67 != null) {
				local33 = local67.method5532(local62) | false;
				local31 = local67.method5530(local62) | false;
				local37 = local67.method5531(local62) | false;
				local35 = arg3.aBoolean121 | false;
			}
			if ((arg3.aBoolean124 || Static147.aBoolean259) && arg2 != -1 && arg2 < arg3.anIntArray65.length) {
				local118 = arg3.anIntArray65[arg2];
				@Pc(122) int local122 = local118 >>> 16;
				@Pc(126) int local126 = local118 & 0xFFFF;
				@Pc(136) Class1_Sub1_Sub16 local136 = local58 == local122 ? local67 : arg6.method689(local122);
				if (local136 != null) {
					local33 |= local136.method5532(local126);
					local31 |= local136.method5530(local126);
					local37 |= local136.method5531(local126);
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
		@Pc(191) Class151 local191 = Static241.aClass151_108;
		@Pc(200) Class37 local200;
		synchronized (Static241.aClass151_108) {
			local200 = (Class37) Static241.aClass151_108.method3288(this.aLong174);
		}
		if (local200 == null || arg1.method4634(local200.n(), local27) != 0) {
			if (local200 != null) {
				local27 = arg1.method4643(local27, local200.n());
			}
			local35 = false;
			for (@Pc(231) int local231 = 0; local231 < 12; local231++) {
				local50 = this.anIntArray444[local231];
				if ((local50 & 0x40000000) == 0) {
					if ((local50 & Integer.MIN_VALUE) != 0 && !arg4.method2742(local50 & 0x3FFFFFFF).method524()) {
						local35 = true;
					}
				} else if (!arg9.method4249(local50 & 0x3FFFFFFF).method4959(this.aBoolean486)) {
					local35 = true;
				}
			}
			if (local35) {
				return null;
			}
			@Pc(289) Class155[] local289 = new Class155[12];
			local118 = 0;
			for (@Pc(293) int local293 = 0; local293 < 12; local293++) {
				@Pc(300) int local300 = this.anIntArray444[local293];
				@Pc(320) Class155 local320;
				if ((local300 & 0x40000000) != 0) {
					local320 = arg9.method4249(local300 & 0x3FFFFFFF).method4967(this.aBoolean486);
					if (local320 != null) {
						local289[local118++] = local320;
					}
				} else if ((local300 & Integer.MIN_VALUE) != 0) {
					local320 = arg4.method2742(local300 & 0x3FFFFFFF).method521();
					if (local320 != null) {
						local289[local118++] = local320;
					}
				}
			}
			@Pc(357) int local357 = local27 | 0x4000;
			@Pc(363) Class155 local363 = new Class155(local289, local118);
			local200 = arg1.method4617(local363, local357, Static300.anInt5009, 64, 768);
			for (local58 = 0; local58 < 5; local58++) {
				if (this.anIntArray442[local58] < Static207.aShortArrayArray3[local58].length) {
					local200.N(Static324.aShortArray98[local58], Static207.aShortArrayArray3[local58][this.anIntArray442[local58]]);
				}
				if (Static68.aShortArrayArray2[local58].length > this.anIntArray442[local58]) {
					local200.N(Static396.aShortArray112[local58], Static68.aShortArrayArray2[local58][this.anIntArray442[local58]]);
				}
			}
			local200.u(local27);
			@Pc(434) Class151 local434 = Static241.aClass151_108;
			synchronized (Static241.aClass151_108) {
				Static241.aClass151_108.method3291(this.aLong174, local200);
			}
		}
		if (arg3 == null) {
			return local200;
		} else {
			local200.method4155((byte) 4, local27, true);
			return arg3.method1137(arg0, arg5, arg2, 2048, local200);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([Lclient!tk;IILclient!av;ILclient!qa;ILclient!fc;Lclient!pn;ZIILclient!dn;ILclient!cl;ILclient!dn;Lclient!io;Lclient!bk;)Lclient!c;")
	public Class37 method4765(@OriginalArg(0) Class226[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface1 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class121 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class81 arg7, @OriginalArg(8) Class193 arg8, @OriginalArg(11) int arg9, @OriginalArg(12) Class58 arg10, @OriginalArg(13) int arg11, @OriginalArg(14) Class45 arg12, @OriginalArg(15) int arg13, @OriginalArg(16) Class58 arg14, @OriginalArg(17) Class122 arg15, @OriginalArg(18) Class26 arg16) {
		if (this.anInt6012 != -1) {
			return arg16.method429(this.anInt6012).method4407(arg9, arg2, arg4, arg5, arg6, arg12, arg7, arg11, arg14, arg13, arg1, arg0, arg3, arg10);
		}
		@Pc(33) int local33 = arg1;
		@Pc(36) long local36 = this.aLong174;
		@Pc(39) int[] local39 = this.anIntArray444;
		if (arg10 != null && (arg10.anInt1427 >= 0 || arg10.anInt1428 >= 0)) {
			local39 = new int[12];
			for (@Pc(52) int local52 = 0; local52 < 12; local52++) {
				local39[local52] = this.anIntArray444[local52];
			}
			if (arg10.anInt1427 >= 0) {
				if (arg10.anInt1427 == 65535) {
					local36 ^= 0xFFFFFFFF00000000L;
					local39[5] = 0;
				} else {
					local39[5] = arg10.anInt1427 | 0x40000000;
					local36 ^= (long) local39[5] << 32;
				}
			}
			if (arg10.anInt1428 >= 0) {
				if (arg10.anInt1428 == 65535) {
					local39[3] = 0;
					local36 ^= 0xFFFFFFFFL;
				} else {
					local39[3] = arg10.anInt1428 | 0x40000000;
					local36 ^= local39[3];
				}
			}
		}
		@Pc(136) boolean local136 = false;
		@Pc(138) boolean local138 = false;
		@Pc(140) boolean local140 = false;
		@Pc(148) boolean local148 = arg10 != null || arg14 != null;
		@Pc(155) int local155 = arg0 == null ? 0 : arg0.length;
		@Pc(189) int local189;
		@Pc(194) int local194;
		for (@Pc(157) int local157 = 0; local157 < local155; local157++) {
			Static157.aClass1_Sub1_Sub16Array4[local157] = null;
			if (arg0[local157] != null) {
				@Pc(175) Class58 local175 = arg12.method690(arg0[local157].anInt6841);
				if (local175.anIntArray65 != null) {
					Static230.aClass58Array2[local157] = local175;
					local148 = true;
					local189 = arg0[local157].anInt6840;
					local194 = arg0[local157].anInt6846;
					@Pc(199) int local199 = local175.anIntArray65[local189];
					Static157.aClass1_Sub1_Sub16Array4[local157] = arg12.method689(local199 >>> 16);
					@Pc(212) int local212 = local199 & 0xFFFF;
					Static314.anIntArray403[local157] = local212;
					if (Static157.aClass1_Sub1_Sub16Array4[local157] != null) {
						local138 |= Static157.aClass1_Sub1_Sub16Array4[local157].method5532(local212);
						local136 |= Static157.aClass1_Sub1_Sub16Array4[local157].method5530(local212);
						local140 |= Static157.aClass1_Sub1_Sub16Array4[local157].method5531(local212);
					}
					if ((local175.aBoolean124 || Static147.aBoolean259) && local194 != -1 && local194 < local175.anIntArray65.length) {
						Static153.anIntArray362[local157] = local175.anIntArray66[local189];
						Static156.anIntArray216[local157] = arg0[local157].anInt6842;
						@Pc(297) int local297 = local175.anIntArray65[local194];
						Static1.aClass1_Sub1_Sub16Array1[local157] = arg12.method689(local297 >>> 16);
						@Pc(310) int local310 = local297 & 0xFFFF;
						Static68.anIntArray60[local157] = local310;
						if (Static1.aClass1_Sub1_Sub16Array1[local157] != null) {
							local138 |= Static1.aClass1_Sub1_Sub16Array1[local157].method5532(local310);
							local136 |= Static1.aClass1_Sub1_Sub16Array1[local157].method5530(local310);
							local140 |= Static1.aClass1_Sub1_Sub16Array1[local157].method5531(local310);
						}
					} else {
						Static153.anIntArray362[local157] = 0;
						Static156.anIntArray216[local157] = 0;
						Static1.aClass1_Sub1_Sub16Array1[local157] = null;
						Static68.anIntArray60[local157] = -1;
					}
				}
			}
		}
		@Pc(355) int local355 = -1;
		local189 = -1;
		local194 = 0;
		@Pc(361) Class1_Sub1_Sub16 local361 = null;
		@Pc(363) Class1_Sub1_Sub16 local363 = null;
		@Pc(365) int local365 = -1;
		@Pc(367) int local367 = -1;
		@Pc(369) int local369 = 0;
		@Pc(371) Class1_Sub1_Sub16 local371 = null;
		@Pc(373) Class1_Sub1_Sub16 local373 = null;
		if (local148) {
			@Pc(386) int local386;
			@Pc(446) int local446;
			if (arg10 != null) {
				local355 = arg10.anIntArray65[arg11];
				local386 = local355 >>> 16;
				local361 = arg12.method689(local386);
				local355 &= 0xFFFF;
				if (local361 != null) {
					local138 |= local361.method5532(local355);
					local136 |= local361.method5530(local355);
					local140 |= local361.method5531(local355);
				}
				if ((arg10.aBoolean124 || Static147.aBoolean259) && arg4 != -1 && arg10.anIntArray65.length > arg4) {
					local189 = arg10.anIntArray65[arg4];
					local194 = arg10.anIntArray66[arg11];
					local446 = local189 >>> 16;
					local363 = local386 == local446 ? local361 : arg12.method689(local446);
					local189 &= 0xFFFF;
					if (local363 != null) {
						local138 |= local363.method5532(local189);
						local136 |= local363.method5530(local189);
						local140 |= local363.method5531(local189);
					}
				}
			}
			local33 = arg1 | 0x20;
			if (arg14 != null) {
				local365 = arg14.anIntArray65[arg9];
				local386 = local365 >>> 16;
				local371 = arg12.method689(local386);
				local365 &= 0xFFFF;
				if (local371 != null) {
					local138 |= local371.method5532(local365);
					local136 |= local371.method5530(local365);
					local140 |= local371.method5531(local365);
				}
				if ((arg14.aBoolean124 || Static147.aBoolean259) && arg2 != -1 && arg14.anIntArray65.length > arg2) {
					local369 = arg14.anIntArray66[arg9];
					local367 = arg14.anIntArray65[arg2];
					local446 = local367 >>> 16;
					local373 = local446 == local386 ? local371 : arg12.method689(local446);
					local367 &= 0xFFFF;
					if (local373 != null) {
						local138 |= local373.method5532(local367);
						local136 |= local373.method5530(local367);
						local140 |= local373.method5531(local367);
					}
				}
			}
			if (local138) {
				local33 |= 0x80;
			}
			if (local136) {
				local33 |= 0x100;
			}
			if (local140) {
				local33 |= 0x400;
			}
		}
		@Pc(622) Class151 local622 = Static299.aClass151_126;
		@Pc(632) Class37 local632;
		synchronized (Static299.aClass151_126) {
			local632 = (Class37) Static299.aClass151_126.method3288(local36);
		}
		@Pc(640) Class231 local640 = null;
		if (this.anInt6001 != -1) {
			local640 = arg7.method1629(this.anInt6001);
		}
		@Pc(681) int local681;
		@Pc(687) int local687;
		if (local632 == null || arg5.method4634(local632.n(), local33) != 0 || local640 != null && local640.anIntArrayArray51 != null && this.anIntArrayArray44 == null) {
			if (local632 != null) {
				local33 = arg5.method4643(local33, local632.n());
			}
			@Pc(679) boolean local679 = false;
			local681 = 0;
			while (true) {
				if (local681 >= 12) {
					if (local679) {
						if (this.aLong173 != -1L) {
							@Pc(1325) Class151 local1325 = Static299.aClass151_126;
							synchronized (Static299.aClass151_126) {
								local632 = (Class37) Static299.aClass151_126.method3288(this.aLong173);
							}
						}
						if (local632 == null || arg5.method4634(local632.n(), local33) != 0 || local640 != null && local640.anIntArrayArray51 != null && this.anIntArrayArray44 == null) {
							return null;
						}
					} else {
						@Pc(737) Class155[] local737 = new Class155[12];
						@Pc(745) int local745;
						for (@Pc(739) int local739 = 0; local739 < 12; local739++) {
							local745 = local39[local739];
							@Pc(762) Class155 local762;
							if ((local745 & 0x40000000) != 0) {
								local762 = arg8.method4249(local745 & 0x3FFFFFFF).method4966(this.aBoolean486);
								if (local762 != null) {
									local737[local739] = local762;
								}
							} else if ((local745 & Integer.MIN_VALUE) != 0) {
								local762 = arg15.method2742(local745 & 0x3FFFFFFF).method525();
								if (local762 != null) {
									local737[local739] = local762;
								}
							}
						}
						@Pc(825) int local825;
						if (local640 != null && local640.anIntArrayArray51 != null) {
							for (local745 = 0; local745 < local640.anIntArrayArray51.length; local745++) {
								if (local640.anIntArrayArray51[local745] != null && local737[local745] != null) {
									local825 = local640.anIntArrayArray51[local745][0];
									@Pc(832) int local832 = local640.anIntArrayArray51[local745][1];
									@Pc(839) int local839 = local640.anIntArrayArray51[local745][2];
									@Pc(848) int local848 = local640.anIntArrayArray51[local745][3] << 3;
									@Pc(857) int local857 = local640.anIntArrayArray51[local745][4] << 3;
									@Pc(866) int local866 = local640.anIntArrayArray51[local745][5] << 3;
									if (this.anIntArrayArray44 == null) {
										this.anIntArrayArray44 = new int[local640.anIntArrayArray51.length][];
									}
									if (this.anIntArrayArray44[local745] == null) {
										@Pc(888) int[] local888 = this.anIntArrayArray44[local745] = new int[15];
										if (local848 == 0 && local857 == 0 && local866 == 0) {
											local888[14] = -local839;
											local888[0] = local888[4] = local888[8] = 32768;
											local888[13] = -local832;
											local888[12] = -local825;
										} else {
											@Pc(904) int local904 = Class262.anIntArray576[local848];
											@Pc(908) int local908 = Class262.anIntArray575[local848];
											@Pc(912) int local912 = Class262.anIntArray576[local857];
											@Pc(916) int local916 = Class262.anIntArray575[local857];
											@Pc(920) int local920 = Class262.anIntArray576[local866];
											@Pc(924) int local924 = Class262.anIntArray575[local866];
											@Pc(932) int local932 = local920 * local908 + 16384 >> 15;
											@Pc(940) int local940 = local924 * local908 + 16384 >> 15;
											local888[3] = local924 * local904 + 16384 >> 15;
											local888[2] = local916 * local904 + 16384 >> 15;
											local888[5] = -local908;
											local888[4] = local920 * local904 + 16384 >> 15;
											local888[8] = local912 * local904 + 16384 >> 15;
											local888[0] = local912 * local920 + local940 * local916 + 16384 >> 15;
											local888[7] = local912 * local932 + -local924 * -local916 + 16384 >> 15;
											local888[6] = -local916 * local920 + local912 * local940 + 16384 >> 15;
											local888[1] = local932 * local916 + local912 * -local924 + 16384 >> 15;
											local888[12] = -local839 * local888[6] + local888[0] * -local825 + -local832 * local888[3] + 16384 >> 15;
											local888[14] = local888[8] * -local839 + -local825 * local888[2] + -local832 * local888[5] + 16384 >> 15;
											local888[13] = local888[7] * -local839 + -local832 * local888[4] + local888[1] * -local825 + 16384 >> 15;
										}
										local888[10] = local832;
										local888[11] = local839;
										local888[9] = local825;
									}
									if (local848 != 0 || local857 != 0 || local866 != 0) {
										local737[local745].method3400(local866, local857, local848);
									}
									if (local825 != 0 || local832 != 0 || local839 != 0) {
										local737[local745].method3395(local839, local825, local832);
									}
								}
							}
						}
						@Pc(1223) Class155 local1223 = new Class155(local737, local737.length);
						@Pc(1227) int local1227 = local33 | 0x4000;
						local632 = arg5.method4617(local1223, local1227, Static300.anInt5009, 64, 850);
						for (local825 = 0; local825 < 5; local825++) {
							if (Static207.aShortArrayArray3[local825].length > this.anIntArray442[local825]) {
								local632.N(Static324.aShortArray98[local825], Static207.aShortArrayArray3[local825][this.anIntArray442[local825]]);
							}
							if (this.anIntArray442[local825] < Static68.aShortArrayArray2[local825].length) {
								local632.N(Static396.aShortArray112[local825], Static68.aShortArrayArray2[local825][this.anIntArray442[local825]]);
							}
						}
						local632.u(local33);
						@Pc(1300) Class151 local1300 = Static299.aClass151_126;
						synchronized (Static299.aClass151_126) {
							Static299.aClass151_126.method3291(local36, local632);
						}
						this.aLong173 = local36;
					}
					break;
				}
				local687 = local39[local681];
				if ((local687 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local687) != 0 && !arg15.method2742(local687 & 0x3FFFFFFF).method523()) {
						local679 = true;
					}
				} else if (!arg8.method4249(local687 & 0x3FFFFFFF).method4964(this.aBoolean486)) {
					local679 = true;
				}
				local681++;
			}
		}
		@Pc(1367) Class37 local1367 = local632.method4155((byte) 4, local33, true);
		if (!local148) {
			return local1367;
		}
		@Pc(1373) int local1373 = 0;
		local681 = 1;
		while (local155 > local1373) {
			if (Static157.aClass1_Sub1_Sub16Array4[local1373] != null) {
				local1367.method4156(Static157.aClass1_Sub1_Sub16Array4[local1373], false, Static314.anIntArray403[local1373], Static153.anIntArray362[local1373], Static68.anIntArray60[local1373], local681, this.anIntArrayArray44 == null ? null : this.anIntArrayArray44[local1373], Static156.anIntArray216[local1373] - 1, Static1.aClass1_Sub1_Sub16Array1[local1373]);
			}
			local1373++;
			local681 <<= 0x1;
		}
		if (local361 != null && local371 != null) {
			local1367.method4172(local355, local369, local194, arg10.aBooleanArray6, arg6 - 1, local361, false, local363, arg13 - 1, local371, local365, local367, local373, local189);
		} else if (local361 != null) {
			local1367.method4160(arg13 - 1, false, local361, local355, local194, local363, local189, 0);
		} else if (local371 != null) {
			local1367.method4160(arg6 - 1, false, local371, local365, local369, local373, local367, 0);
		}
		for (local687 = 0; local687 < local155; local687++) {
			Static157.aClass1_Sub1_Sub16Array4[local687] = null;
			Static1.aClass1_Sub1_Sub16Array1[local687] = null;
			Static230.aClass58Array2[local687] = null;
		}
		return local1367;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILclient!qa;Lclient!dn;IILclient!io;ILclient!cl;IIII)Lclient!c;")
	public Class37 method4766(@OriginalArg(1) Class121 arg0, @OriginalArg(2) Class58 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class122 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class45 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(11) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(100) int local100;
		if (arg1 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			@Pc(28) int local28 = arg1.anIntArray65[arg8];
			local7 = 2080;
			@Pc(38) int local38 = local28 >>> 16;
			@Pc(43) Class1_Sub1_Sub16 local43 = arg6.method689(local38);
			@Pc(47) int local47 = local28 & 0xFFFF;
			if (local43 != null) {
				local13 = local43.method5532(local47) | false;
				local11 = local43.method5530(local47) | false;
				local17 = local43.method5531(local47) | false;
				local15 = arg1.aBoolean121 | false;
			}
			if ((arg1.aBoolean124 || Static147.aBoolean259) && arg2 != -1 && arg1.anIntArray65.length > arg2) {
				local100 = arg1.anIntArray65[arg2];
				@Pc(104) int local104 = local100 >>> 16;
				@Pc(108) int local108 = local100 & 0xFFFF;
				@Pc(113) Class1_Sub1_Sub16 local113;
				if (local38 == local104) {
					local113 = local43;
				} else {
					local113 = arg6.method689(local108 >>> 16);
				}
				if (local113 != null) {
					local13 |= local113.method5532(local108);
					local11 |= local113.method5530(local108);
					local17 |= local113.method5531(local108);
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
		@Pc(183) long local183 = (long) arg7 | (long) (arg5 << 16) | (long) arg3 << 32;
		@Pc(185) Class151 local185 = Static241.aClass151_108;
		@Pc(193) Class37 local193;
		synchronized (Static241.aClass151_108) {
			local193 = (Class37) Static241.aClass151_108.method3288(local183);
		}
		if (local193 == null || arg0.method4634(local193.n(), local7) != 0) {
			if (local193 != null) {
				local7 = arg0.method4643(local7, local193.n());
			}
			@Pc(220) Class155[] local220 = new Class155[3];
			local100 = 0;
			if (!arg4.method2742(arg7).method524() || !arg4.method2742(arg5).method524() || !arg4.method2742(arg3).method524()) {
				return null;
			}
			@Pc(250) Class155 local250 = arg4.method2742(arg7).method521();
			if (local250 != null) {
				local100++;
				local220[0] = local250;
			}
			local250 = arg4.method2742(arg5).method521();
			if (local250 != null) {
				local220[local100++] = local250;
			}
			local250 = arg4.method2742(arg3).method521();
			if (local250 != null) {
				local220[local100++] = local250;
			}
			local250 = new Class155(local220, local100);
			@Pc(297) int local297 = local7 | 0x4000;
			local193 = arg0.method4617(local250, local297, Static300.anInt5009, 64, 768);
			for (@Pc(307) int local307 = 0; local307 < 5; local307++) {
				if (this.anIntArray442[local307] < Static207.aShortArrayArray3[local307].length) {
					local193.N(Static324.aShortArray98[local307], Static207.aShortArrayArray3[local307][this.anIntArray442[local307]]);
				}
				if (this.anIntArray442[local307] < Static68.aShortArrayArray2[local307].length) {
					local193.N(Static396.aShortArray112[local307], Static68.aShortArrayArray2[local307][this.anIntArray442[local307]]);
				}
			}
			local193.u(local7);
			@Pc(368) Class151 local368 = Static241.aClass151_108;
			synchronized (Static241.aClass151_108) {
				Static241.aClass151_108.method3291(local183, local193);
			}
		}
		if (arg1 == null) {
			return local193;
		} else {
			local193 = local193.method4155((byte) 4, local7, true);
			return arg1.method1137(arg9, arg8, arg2, 2048, local193);
		}
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V")
	private void method4768() {
		@Pc(7) long[] local7 = Class1_Sub25.aLongArray5;
		this.aLong174 = -1L;
		this.aLong174 = local7[(int) (((long) (this.anInt6001 >> 8) ^ this.aLong174) & 0xFFL)] ^ this.aLong174 >>> 8;
		this.aLong174 = this.aLong174 >>> 8 ^ local7[(int) (((long) this.anInt6001 ^ this.aLong174) & 0xFFL)];
		for (@Pc(54) int local54 = 0; local54 < 12; local54++) {
			this.aLong174 = this.aLong174 >>> 8 ^ local7[(int) (((long) (this.anIntArray444[local54] >> 24) ^ this.aLong174) & 0xFFL)];
			this.aLong174 = this.aLong174 >>> 8 ^ local7[(int) (((long) (this.anIntArray444[local54] >> 16) ^ this.aLong174) & 0xFFL)];
			this.aLong174 = local7[(int) ((this.aLong174 ^ (long) (this.anIntArray444[local54] >> 8)) & 0xFFL)] ^ this.aLong174 >>> 8;
			this.aLong174 = local7[(int) (((long) this.anIntArray444[local54] ^ this.aLong174) & 0xFFL)] ^ this.aLong174 >>> 8;
		}
		for (@Pc(148) int local148 = 0; local148 < 5; local148++) {
			this.aLong174 = local7[(int) ((this.aLong174 ^ (long) this.anIntArray442[local148]) & 0xFFL)] ^ this.aLong174 >>> 8;
		}
		this.aLong174 = this.aLong174 >>> 8 ^ local7[(int) ((this.aLong174 ^ (long) (this.aBoolean486 ? 1 : 0)) & 0xFFL)];
	}
}
