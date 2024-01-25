import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kia")
public class Class104 {

	@OriginalMember(owner = "client!kia", name = "A", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!kia", name = "i", descriptor = "[I")
	private final int[] anIntArray126 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!kia", name = "s", descriptor = "[I")
	private final int[] anIntArray128 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!kia", name = "C", descriptor = "I")
	protected final int anInt2909;

	@OriginalMember(owner = "client!kia", name = "c", descriptor = "Lclient!sc;")
	private final Class314 aClass314_4;

	@OriginalMember(owner = "client!kia", name = "D", descriptor = "Lclient!vg;")
	private final Class367 aClass367_6;

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "Z")
	public final boolean aBoolean248;

	@OriginalMember(owner = "client!kia", name = "u", descriptor = "I")
	public final int anInt2904;

	@OriginalMember(owner = "client!kia", name = "l", descriptor = "I")
	protected final int anInt2901;

	@OriginalMember(owner = "client!kia", name = "f", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!kia", name = "h", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!kia", name = "t", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!kia", name = "p", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!kia", name = "x", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!kia", name = "B", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(IIIZLclient!vg;Lclient!sc;)V")
	protected Class104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class367 arg4, @OriginalArg(5) Class314 arg5) {
		this.anInt2909 = arg2;
		this.aClass314_4 = arg5;
		this.aClass367_6 = arg4;
		this.aBoolean248 = arg3;
		this.anInt2904 = arg0;
		this.anInt2901 = arg1;
		this.aByteArrayArrayArray12 = new byte[this.anInt2904][this.anInt2901][this.anInt2909];
		this.aByteArrayArrayArray13 = new byte[this.anInt2904][this.anInt2901][this.anInt2909];
		this.anIntArrayArrayArray15 = new int[this.anInt2904][this.anInt2901 + 1][this.anInt2909 + 1];
		this.aByteArrayArrayArray14 = new byte[this.anInt2904][this.anInt2901][this.anInt2909];
		this.aByteArrayArrayArray15 = new byte[this.anInt2904][this.anInt2901 + 1][this.anInt2909 + 1];
		this.aByteArrayArrayArray17 = new byte[this.anInt2904][this.anInt2901][this.anInt2909];
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(Lclient!s;[[ILclient!s;Lclient!ha;ILclient!s;B)V")
	private void method2579(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) Class65 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class109 arg5) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt2901; local13++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt2909; local16++) {
				if (Static55.anInt837 == -1 || Static658.method8808(Static55.anInt837, local16, local13, arg4)) {
					@Pc(37) byte local37 = this.aByteArrayArrayArray12[arg4][local13][local16];
					@Pc(46) byte local46 = this.aByteArrayArrayArray17[arg4][local13][local16];
					@Pc(57) int local57 = this.aByteArrayArrayArray14[arg4][local13][local16] & 0xFF;
					@Pc(68) int local68 = this.aByteArrayArrayArray13[arg4][local13][local16] & 0xFF;
					@Pc(83) Class74 local83 = local57 == 0 ? null : this.aClass367_6.method8496(local57 - 1);
					if (local37 == 0 && local83 == null) {
						local37 = 12;
					}
					@Pc(104) Class335 local104 = local68 == 0 ? null : this.aClass314_4.method7470(local68 - 1);
					@Pc(106) Class74 local106 = local83;
					if (local83 != null && local83.anInt2146 == -1 && local83.anInt2148 == -1) {
						local106 = local83;
						local83 = null;
					}
					if (local83 != null || local104 != null) {
						@Pc(128) int local128 = Static382.anIntArray384[local37];
						@Pc(132) int local132 = Static245.anIntArray43[local37];
						@Pc(145) int local145 = (local83 == null ? 0 : local132) + (local104 == null ? 0 : local128);
						@Pc(147) int local147 = 0;
						@Pc(149) int local149 = 0;
						@Pc(156) int local156 = local83 == null ? -1 : local83.anInt2137;
						@Pc(163) int local163 = local104 == null ? -1 : local104.anInt9177;
						@Pc(166) int[] local166 = new int[local145];
						@Pc(169) int[] local169 = new int[local145];
						@Pc(172) int[] local172 = new int[local145];
						@Pc(175) int[] local175 = new int[local145];
						@Pc(178) int[] local178 = new int[local145];
						@Pc(181) int[] local181 = new int[local145];
						@Pc(192) int[] local192 = local83 == null || local83.anInt2148 == -1 ? null : new int[local145];
						@Pc(196) int local196;
						if (local83 == null) {
							local149 = local132;
						} else {
							for (local196 = 0; local196 < local132; local196++) {
								local166[local147] = Static43.anIntArrayArray3[local37][local149];
								local169[local147] = Static287.anIntArrayArray26[local37][local149];
								local172[local147] = Static191.anIntArrayArray13[local37][local149];
								local178[local147] = local156;
								local181[local147] = local83.anInt2139;
								local175[local147] = local83.anInt2146;
								if (local192 != null) {
									local192[local147] = local83.anInt2148;
								}
								local149++;
								local147++;
							}
							if (!this.aBoolean248 && arg4 == 0) {
								Static277.method4501(local13, local16, local83.anInt2138, local83.anInt2145 * 8, local83.anInt2136);
							}
						}
						if (local104 != null) {
							for (local196 = 0; local196 < local128; local196++) {
								local166[local147] = Static43.anIntArrayArray3[local37][local149];
								local169[local147] = Static287.anIntArrayArray26[local37][local149];
								local172[local147] = Static191.anIntArrayArray13[local37][local149];
								local178[local147] = local163;
								local181[local147] = local104.anInt9183;
								local175[local147] = arg1[local13][local16];
								if (local192 != null) {
									local192[local147] = local175[local147];
								}
								local149++;
								local147++;
							}
						}
						local196 = this.anIntArray128.length;
						@Pc(347) int[] local347 = new int[local196];
						@Pc(350) int[] local350 = new int[local196];
						@Pc(357) int[] local357 = arg5 == null ? null : new int[local196];
						@Pc(366) int[] local366 = arg5 == null && arg0 == null ? null : new int[local196];
						@Pc(374) int local374;
						@Pc(379) int local379;
						@Pc(463) int local463;
						@Pc(471) int local471;
						for (@Pc(368) int local368 = 0; local368 < local196; local368++) {
							local374 = this.anIntArray128[local368];
							local379 = this.anIntArray126[local368];
							if (local46 == 0) {
								local347[local368] = local374;
								local350[local368] = local379;
							} else if (local46 == 1) {
								local347[local368] = local379;
								local350[local368] = 512 - local374;
							} else if (local46 == 2) {
								local347[local368] = 512 - local374;
								local350[local368] = 512 - local379;
							} else if (local46 == 3) {
								local347[local368] = 512 - local379;
								local350[local368] = local374;
							}
							if (local357 != null && Static628.aBooleanArrayArray7[local37][local368]) {
								local463 = (local13 << 9) + local347[local368];
								local471 = local350[local368] + (local16 << 9);
								local357[local368] = arg5.method7702(local463, local471) - arg2.method7702(local463, local471);
							}
							if (local366 != null) {
								if (arg5 != null && !Static628.aBooleanArrayArray7[local37][local368]) {
									local463 = local347[local368] + (local13 << 9);
									local471 = local350[local368] + (local16 << 9);
									local366[local368] = arg2.method7702(local463, local471) - arg5.method7702(local463, local471);
								} else if (arg0 != null && !Static474.aBooleanArrayArray5[local37][local368]) {
									local463 = (local13 << 9) + local347[local368];
									local471 = local350[local368] + (local16 << 9);
									local366[local368] = arg0.method7702(local463, local471) - arg2.method7702(local463, local471);
								}
							}
						}
						local374 = arg2.method7695(local16, local13);
						local379 = arg2.method7695(local16, local13 + 1);
						local463 = arg2.method7695(local16 + 1, local13 + 1);
						local471 = arg2.method7695(local16 + 1, local13);
						@Pc(613) boolean local613 = Static599.method8200(local16, local13);
						if (local613 && arg4 > 1 || !local613 && arg4 > 0) {
							@Pc(626) boolean local626 = true;
							if (local104 != null && !local104.aBoolean786) {
								local626 = false;
							} else if (local68 == 0 && local37 != 0) {
								local626 = false;
							} else if (local57 > 0 && local106 != null && !local106.aBoolean203) {
								local626 = false;
							}
							if (local626 && local379 == local374 && local374 == local463 && local471 == local374) {
								this.aByteArrayArrayArray15[arg4][local13][local16] = (byte) (this.aByteArrayArrayArray15[arg4][local13][local16] | 0x4);
							}
						}
						@Pc(690) int local690 = 0;
						@Pc(692) int local692 = 0;
						@Pc(694) int local694 = 0;
						if (this.aBoolean248) {
							local690 = Static1.method8276(local13, local16);
							local692 = Static71.method8032(local13, local16);
							local694 = Static102.method1991(local13, local16);
						}
						arg2.method7699(local13, local16, local347, local357, local350, local366, local166, local169, local172, local175, local192, local178, local181, local690, local692, local694);
						Static203.method3288(arg4, local13, local16);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(BI[[I)V")
	public final void method2580(@OriginalArg(2) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray15[0];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2901 + 1; local16++) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt2909 + 1; local20++) {
				local10[local16][local20] += arg0[local16][local20];
			}
		}
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(IILclient!mc;II[Lclient!eo;IIII)V")
	public final void method2582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub41 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class106[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = (arg6 & 0x7) * 8;
		@Pc(37) int local37;
		@Pc(66) int local66;
		if (!this.aBoolean248) {
			@Pc(35) Class106 local35 = arg4[arg7];
			for (local37 = 0; local37 < 8; local37++) {
				for (@Pc(40) int local40 = 0; local40 < 8; local40++) {
					@Pc(54) int local54 = arg5 + Static87.method5158(local40 & 0x7, arg3, local37 & 0x7);
					local66 = arg8 + Static369.method5565(arg3, local40 & 0x7, local37 & 0x7);
					if (local54 > 0 && local54 < this.anInt2901 - 1 && local66 > 0 && this.anInt2909 - 1 > local66) {
						local35.method2661(local66, local54);
					}
				}
			}
		}
		@Pc(106) int local106 = (arg1 & 0x7) * 8;
		@Pc(112) int local112 = (arg6 & 0xFFFFFFF8) << 3;
		local37 = (arg1 & 0x1FFFFFF8) << 3;
		@Pc(120) byte local120 = 0;
		@Pc(122) byte local122 = 0;
		if (arg3 == 1) {
			local122 = 1;
		} else if (arg3 == 2) {
			local122 = 1;
			local120 = 1;
		} else if (arg3 == 3) {
			local120 = 1;
		}
		for (local66 = 0; local66 < this.anInt2904; local66++) {
			for (@Pc(148) int local148 = 0; local148 < 64; local148++) {
				for (@Pc(151) int local151 = 0; local151 < 64; local151++) {
					if (local66 == arg0 && local9 <= local148 && local9 + 8 >= local148 && local151 >= local106 && local106 + 8 >= local151) {
						@Pc(215) int local215;
						@Pc(221) int local221;
						if (local148 == local9 + 8 || local151 == local106 + 8) {
							if (arg3 == 0) {
								local215 = local148 + arg5 - local9;
								local221 = local151 + arg8 - local106;
							} else if (arg3 == 1) {
								local215 = local151 + arg5 - local106;
								local221 = local9 + arg8 + 8 - local148;
							} else if (arg3 == 2) {
								local221 = arg8 + local106 + 8 - local151;
								local215 = local9 + arg5 + 8 - local148;
							} else {
								local221 = arg8 + local148 - local9;
								local215 = arg5 + local106 + 8 - local151;
							}
							this.method2591(0, 0, local215, arg2, arg7, 0, local112 + local148, local221, local37 + local151, true);
						} else {
							local215 = Static87.method5158(local151 & 0x7, arg3, local148 & 0x7) + arg5;
							local221 = arg8 + Static369.method5565(arg3, local151 & 0x7, local148 & 0x7);
							this.method2591(local120, local122, local215, arg2, arg7, arg3, local148 + local112, local221, local151 + local37, false);
						}
						if (local148 == 63 || local151 == 63) {
							@Pc(358) byte local358 = 1;
							if (local148 == 63 && local151 == 63) {
								local358 = 3;
							}
							for (@Pc(368) int local368 = 0; local368 < local358; local368++) {
								@Pc(371) int local371 = local148;
								@Pc(373) int local373 = local151;
								if (local368 == 0) {
									local371 = local148 == 63 ? 64 : local148;
									local373 = local151 == 63 ? 64 : local151;
								} else if (local368 == 1) {
									local371 = 64;
								} else if (local368 == 2) {
									local373 = 64;
								}
								@Pc(442) int local442;
								@Pc(432) int local432;
								if (arg3 == 0) {
									local442 = arg5 + local371 - local9;
									local432 = arg8 + local373 - local106;
								} else if (arg3 == 1) {
									local432 = local9 + arg8 + 8 - local371;
									local442 = local373 + arg5 - local106;
								} else if (arg3 == 2) {
									local432 = arg8 + local106 + 8 - local373;
									local442 = arg5 + local9 + 8 - local371;
								} else {
									local442 = local106 + arg5 + 8 - local373;
									local432 = arg8 + local371 - local9;
								}
								if (local442 >= 0 && local442 < this.anInt2901 && local432 >= 0 && this.anInt2909 > local432) {
									this.anIntArrayArrayArray15[arg7][local442][local432] = this.anIntArrayArrayArray15[arg7][local215 + local120][local122 + local221];
								}
							}
						}
					} else {
						this.method2591(0, 0, -1, arg2, 0, 0, 0, -1, 0, false);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "([Lclient!eo;Lclient!ha;I[[[I)V")
	public final void method2583(@OriginalArg(0) Class106[] arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(26) int local26;
		if (!this.aBoolean248) {
			for (local18 = 0; local18 < 4; local18++) {
				for (local22 = 0; local22 < this.anInt2901; local22++) {
					for (local26 = 0; local26 < this.anInt2909; local26++) {
						if ((Static7.aByteArrayArrayArray1[local18][local22][local26] & 0x1) != 0) {
							@Pc(43) int local43 = local18;
							if ((Static7.aByteArrayArrayArray1[1][local22][local26] & 0x2) != 0) {
								local43 = local18 - 1;
							}
							if (local43 >= 0) {
								arg0[local43].method2662(local22, local26);
							}
						}
					}
				}
			}
		}
		for (local18 = 0; local18 < this.anInt2904; local18++) {
			local22 = 0;
			local26 = 0;
			if (!this.aBoolean248) {
				if (Static302.aBoolean504) {
					local26 = 8;
				}
				if (Static409.aBoolean627) {
					local22 = 2;
				}
				if (Static247.anInt9314 != 0) {
					local22 |= 0x1;
					if (Static600.aBoolean837 | local18 == 0) {
						local26 |= 0x10;
					}
				}
			}
			if (Static409.aBoolean627) {
				local26 |= 0x7;
			}
			if (!Static675.aBoolean920) {
				local26 |= 0x20;
			}
			@Pc(158) int[][] local158 = arg2 == null || local18 >= arg2.length ? this.anIntArrayArrayArray15[local18] : arg2[local18];
			Static1.method8272(local18, arg1.method6937(this.anInt2901, this.anInt2909, this.anIntArrayArrayArray15[local18], local158, local22, local26));
		}
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIIIB)V")
	public final void method2584(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2904; local1++) {
			this.method2588(64, local1, arg1, arg0, 64);
		}
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIILclient!mc;I[Lclient!eo;I)V")
	public final void method2585(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub41 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class106[] arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (!this.aBoolean248) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class106 local16 = arg4[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local28 = local18 + arg0;
						@Pc(33) int local33 = arg3 + local22;
						if (local28 >= 0 && local28 < this.anInt2901 && local33 >= 0 && this.anInt2909 > local33) {
							local16.method2661(local33, local28);
						}
					}
				}
			}
		}
		local10 = arg0 + arg5;
		@Pc(80) int local80 = arg3 + arg1;
		for (local18 = 0; local18 < this.anInt2904; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method2591(0, 0, arg0 + local22, arg2, local18, 0, local22 + local10, local28 - -arg3, local28 + local80, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(Z[[BIII[[B[Z[[BLclient!ha;Lclient!tg;IIILclient!daa;)V")
	private void method2587(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) boolean[] arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) Class65 arg7, @OriginalArg(9) Class335 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class74 arg12) {
		@Pc(26) boolean[] local26 = arg12 != null && arg12.aBoolean201 ? Static121.aBooleanArrayArray1[arg3] : Static474.aBooleanArrayArray6[arg3];
		@Pc(48) int local48;
		@Pc(58) Class74 local58;
		@Pc(76) byte local76;
		@Pc(92) int local92;
		@Pc(97) int local97;
		if (arg9 > 0) {
			if (arg10 > 0) {
				local48 = arg6[arg10 - 1][arg9 - 1] & 0xFF;
				if (local48 > 0) {
					local58 = this.aClass367_6.method8496(local48 - 1);
					if (local58.anInt2146 != -1 && local58.aBoolean201) {
						local76 = arg0[arg10 - 1][arg9 - 1];
						local92 = arg4[arg10 - 1][arg9 - 1] * 2 + 4 & 0x7;
						local97 = Static358.method5410(local58, arg7);
						if (Static628.aBooleanArrayArray7[local76][local92]) {
							Static68.anIntArray50[0] = local58.anInt2146;
							Static75.anIntArray59[0] = local97;
							Static62.anIntArray48[0] = local58.anInt2137;
							Static602.anIntArray546[0] = local58.anInt2139;
							Static22.anIntArray17[0] = local58.anInt2147;
							Static110.anIntArray82[0] = 256;
						}
					}
				}
			}
			if (arg10 < arg2 - 1) {
				local48 = arg6[arg10 + 1][arg9 - 1] & 0xFF;
				if (local48 > 0) {
					local58 = this.aClass367_6.method8496(local48 - 1);
					if (local58.anInt2146 != -1 && local58.aBoolean201) {
						local76 = arg0[arg10 + 1][arg9 - 1];
						local92 = arg4[arg10 + 1][arg9 - 1] * 2 + 6 & 0x7;
						local97 = Static358.method5410(local58, arg7);
						if (Static628.aBooleanArrayArray7[local76][local92]) {
							Static68.anIntArray50[2] = local58.anInt2146;
							Static75.anIntArray59[2] = local97;
							Static62.anIntArray48[2] = local58.anInt2137;
							Static602.anIntArray546[2] = local58.anInt2139;
							Static22.anIntArray17[2] = local58.anInt2147;
							Static110.anIntArray82[2] = 512;
						}
					}
				}
			}
		}
		if (arg9 < arg1 - 1) {
			if (arg10 > 0) {
				local48 = arg6[arg10 - 1][arg9 + 1] & 0xFF;
				if (local48 > 0) {
					local58 = this.aClass367_6.method8496(local48 - 1);
					if (local58.anInt2146 != -1 && local58.aBoolean201) {
						local76 = arg0[arg10 - 1][arg9 + 1];
						local92 = arg4[arg10 - 1][arg9 + 1] * 2 + 2 & 0x7;
						local97 = Static358.method5410(local58, arg7);
						if (Static628.aBooleanArrayArray7[local76][local92]) {
							Static68.anIntArray50[6] = local58.anInt2146;
							Static75.anIntArray59[6] = local97;
							Static62.anIntArray48[6] = local58.anInt2137;
							Static602.anIntArray546[6] = local58.anInt2139;
							Static22.anIntArray17[6] = local58.anInt2147;
							Static110.anIntArray82[6] = 64;
						}
					}
				}
			}
			if (arg10 < arg2 - 1) {
				local48 = arg6[arg10 + 1][arg9 + 1] & 0xFF;
				if (local48 > 0) {
					local58 = this.aClass367_6.method8496(local48 - 1);
					if (local58.anInt2146 != -1 && local58.aBoolean201) {
						local76 = arg0[arg10 + 1][arg9 + 1];
						local92 = arg4[arg10 + 1][arg9 + 1] * 2 & 0x7;
						local97 = Static358.method5410(local58, arg7);
						if (Static628.aBooleanArrayArray7[local76][local92]) {
							Static68.anIntArray50[4] = local58.anInt2146;
							Static75.anIntArray59[4] = local97;
							Static62.anIntArray48[4] = local58.anInt2137;
							Static602.anIntArray546[4] = local58.anInt2139;
							Static22.anIntArray17[4] = local58.anInt2147;
							Static110.anIntArray82[4] = 128;
						}
					}
				}
			}
		}
		@Pc(495) int local495;
		@Pc(500) int local500;
		@Pc(502) int local502;
		@Pc(484) byte local484;
		if (arg9 > 0) {
			local48 = arg6[arg10][arg9 - 1] & 0xFF;
			if (local48 > 0) {
				local58 = this.aClass367_6.method8496(local48 - 1);
				if (local58.anInt2146 != -1) {
					local76 = arg0[arg10][arg9 - 1];
					local484 = arg4[arg10][arg9 - 1];
					if (local58.aBoolean201) {
						local97 = 2;
						local495 = local484 * 2 + 4;
						local500 = Static358.method5410(local58, arg7);
						for (local502 = 0; local502 < 3; local502++) {
							local97 &= 0x7;
							local495 &= 0x7;
							if (Static628.aBooleanArrayArray7[local76][local495] && Static22.anIntArray17[local97] <= local58.anInt2147) {
								Static68.anIntArray50[local97] = local58.anInt2146;
								Static75.anIntArray59[local97] = local500;
								Static62.anIntArray48[local97] = local58.anInt2137;
								Static602.anIntArray546[local97] = local58.anInt2139;
								if (Static22.anIntArray17[local97] == local58.anInt2147) {
									Static110.anIntArray82[local97] |= 0x20;
								} else {
									Static110.anIntArray82[local97] = 32;
								}
								Static22.anIntArray17[local97] = local58.anInt2147;
							}
							local495++;
							local97--;
						}
						if (!local26[arg11 & 0x3]) {
							arg5[0] = Static121.aBooleanArrayArray1[local76][local484 + 2 & 0x3];
						}
					} else if (!local26[arg11 & 0x3]) {
						arg5[0] = Static474.aBooleanArrayArray6[local76][local484 + 2 & 0x3];
					}
				}
			}
		}
		if (arg9 < arg1 - 1) {
			local48 = arg6[arg10][arg9 + 1] & 0xFF;
			if (local48 > 0) {
				local58 = this.aClass367_6.method8496(local48 - 1);
				if (local58.anInt2146 != -1) {
					local76 = arg0[arg10][arg9 + 1];
					local484 = arg4[arg10][arg9 + 1];
					if (local58.aBoolean201) {
						local97 = 4;
						local495 = local484 * 2 + 2;
						local500 = Static358.method5410(local58, arg7);
						for (local502 = 0; local502 < 3; local502++) {
							local495 &= 0x7;
							local97 &= 0x7;
							if (Static628.aBooleanArrayArray7[local76][local495] && local58.anInt2147 >= Static22.anIntArray17[local97]) {
								Static68.anIntArray50[local97] = local58.anInt2146;
								Static75.anIntArray59[local97] = local500;
								Static62.anIntArray48[local97] = local58.anInt2137;
								Static602.anIntArray546[local97] = local58.anInt2139;
								if (local58.anInt2147 == Static22.anIntArray17[local97]) {
									Static110.anIntArray82[local97] |= 0x10;
								} else {
									Static110.anIntArray82[local97] = 16;
								}
								Static22.anIntArray17[local97] = local58.anInt2147;
							}
							local495--;
							local97++;
						}
						if (!local26[arg11 + 2 & 0x3]) {
							arg5[2] = Static121.aBooleanArrayArray1[local76][local484 & 0x3];
						}
					} else if (!local26[arg11 + 2 & 0x3]) {
						arg5[2] = Static474.aBooleanArrayArray6[local76][local484 & 0x3];
					}
				}
			}
		}
		if (arg10 > 0) {
			local48 = arg6[arg10 - 1][arg9] & 0xFF;
			if (local48 > 0) {
				local58 = this.aClass367_6.method8496(local48 - 1);
				if (local58.anInt2146 != -1) {
					local76 = arg0[arg10 - 1][arg9];
					local484 = arg4[arg10 - 1][arg9];
					if (local58.aBoolean201) {
						local97 = 6;
						local495 = local484 * 2 + 4;
						local500 = Static358.method5410(local58, arg7);
						for (local502 = 0; local502 < 3; local502++) {
							local97 &= 0x7;
							local495 &= 0x7;
							if (Static628.aBooleanArrayArray7[local76][local495] && Static22.anIntArray17[local97] <= local58.anInt2147) {
								Static68.anIntArray50[local97] = local58.anInt2146;
								Static75.anIntArray59[local97] = local500;
								Static62.anIntArray48[local97] = local58.anInt2137;
								Static602.anIntArray546[local97] = local58.anInt2139;
								if (Static22.anIntArray17[local97] == local58.anInt2147) {
									Static110.anIntArray82[local97] |= 0x8;
								} else {
									Static110.anIntArray82[local97] = 8;
								}
								Static22.anIntArray17[local97] = local58.anInt2147;
							}
							local495--;
							local97++;
						}
						if (!local26[arg11 + 3 & 0x3]) {
							arg5[3] = Static121.aBooleanArrayArray1[local76][local484 + 1 & 0x3];
						}
					} else if (!local26[arg11 + 3 & 0x3]) {
						arg5[3] = Static474.aBooleanArrayArray6[local76][local484 + 1 & 0x3];
					}
				}
			}
		}
		if (arg10 < arg2 - 1) {
			local48 = arg6[arg10 + 1][arg9] & 0xFF;
			if (local48 > 0) {
				local58 = this.aClass367_6.method8496(local48 - 1);
				if (local58.anInt2146 != -1) {
					local76 = arg0[arg10 + 1][arg9];
					local484 = arg4[arg10 + 1][arg9];
					if (local58.aBoolean201) {
						local97 = 4;
						local495 = local484 * 2 + 6;
						local500 = Static358.method5410(local58, arg7);
						for (local502 = 0; local502 < 3; local502++) {
							local97 &= 0x7;
							local495 &= 0x7;
							if (Static628.aBooleanArrayArray7[local76][local495] && Static22.anIntArray17[local97] <= local58.anInt2147) {
								Static68.anIntArray50[local97] = local58.anInt2146;
								Static75.anIntArray59[local97] = local500;
								Static62.anIntArray48[local97] = local58.anInt2137;
								Static602.anIntArray546[local97] = local58.anInt2139;
								if (local58.anInt2147 == Static22.anIntArray17[local97]) {
									Static110.anIntArray82[local97] |= 0x4;
								} else {
									Static110.anIntArray82[local97] = 4;
								}
								Static22.anIntArray17[local97] = local58.anInt2147;
							}
							local495++;
							local97--;
						}
						if (!local26[arg11 + 1 & 0x3]) {
							arg5[1] = Static121.aBooleanArrayArray1[local76][local484 + 3 & 0x3];
						}
					} else if (!local26[arg11 + 1 & 0x3]) {
						arg5[1] = Static474.aBooleanArrayArray6[local76][local484 + 3 & 0x3];
					}
				}
			}
		}
		if (arg12 == null) {
			return;
		}
		local48 = Static358.method5410(arg12, arg7);
		if (!arg12.aBoolean201) {
			return;
		}
		for (@Pc(1163) int local1163 = 0; local1163 < 8; local1163++) {
			@Pc(1173) int local1173 = local1163 - arg11 * 2 & 0x7;
			if (Static628.aBooleanArrayArray7[arg3][local1163] && arg12.anInt2147 >= Static22.anIntArray17[local1173]) {
				Static68.anIntArray50[local1173] = arg12.anInt2146;
				Static75.anIntArray59[local1173] = local48;
				Static62.anIntArray48[local1173] = arg12.anInt2137;
				Static602.anIntArray546[local1173] = arg12.anInt2139;
				if (Static22.anIntArray17[local1173] == arg12.anInt2147) {
					Static110.anIntArray82[local1173] |= 0x2;
				} else {
					Static110.anIntArray82[local1173] = 2;
				}
				Static22.anIntArray17[local1173] = arg12.anInt2147;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIIIII)V")
	public final void method2588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4;
		for (@Pc(1) int local1 = arg3; local1 < arg3 + arg4; local1++) {
			for (local4 = arg2; local4 < arg2 + arg0; local4++) {
				if (local4 >= 0 && this.anInt2901 > local4 && local1 >= 0 && local1 < this.anInt2909) {
					this.anIntArrayArrayArray15[arg1][local4][local1] = arg1 > 0 ? this.anIntArrayArrayArray15[arg1 - 1][local4][local1] - 960 : 0;
				}
			}
		}
		if (arg2 > 0 && arg2 < this.anInt2901) {
			for (local4 = arg3 + 1; local4 < arg4 + arg3; local4++) {
				if (local4 >= 0 && this.anInt2909 > local4) {
					this.anIntArrayArrayArray15[arg1][arg2][local4] = this.anIntArrayArrayArray15[arg1][arg2 - 1][local4];
				}
			}
		}
		if (arg3 > 0 && arg3 < this.anInt2909) {
			for (local4 = arg2 + 1; local4 < arg0 + arg2; local4++) {
				if (local4 >= 0 && this.anInt2901 > local4) {
					this.anIntArrayArrayArray15[arg1][local4][arg3] = this.anIntArrayArrayArray15[arg1][local4][arg3 - 1];
				}
			}
		}
		if (arg2 < 0 || arg3 < 0 || this.anInt2901 <= arg2 || this.anInt2909 <= arg3) {
			return;
		}
		if (arg1 != 0) {
			if (arg2 > 0 && this.anIntArrayArrayArray15[arg1 - 1][arg2 - 1][arg3] != this.anIntArrayArrayArray15[arg1][arg2 - 1][arg3]) {
				this.anIntArrayArrayArray15[arg1][arg2][arg3] = this.anIntArrayArrayArray15[arg1][arg2 - 1][arg3];
				return;
			}
			if (arg3 > 0 && this.anIntArrayArrayArray15[arg1 - 1][arg2][arg3 - 1] != this.anIntArrayArrayArray15[arg1][arg2][arg3 - 1]) {
				this.anIntArrayArrayArray15[arg1][arg2][arg3] = this.anIntArrayArrayArray15[arg1][arg2][arg3 - 1];
				return;
			}
			if (arg2 > 0 && arg3 > 0 && this.anIntArrayArrayArray15[arg1][arg2 - 1][arg3 - 1] != this.anIntArrayArrayArray15[arg1 - 1][arg2 - 1][arg3 - 1]) {
				this.anIntArrayArrayArray15[arg1][arg2][arg3] = this.anIntArrayArrayArray15[arg1][arg2 - 1][arg3 - 1];
				return;
			}
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray15[arg1][arg2 - 1][arg3] != 0) {
			this.anIntArrayArrayArray15[arg1][arg2][arg3] = this.anIntArrayArrayArray15[arg1][arg2 - 1][arg3];
			return;
		}
		if (arg3 > 0 && this.anIntArrayArrayArray15[arg1][arg2][arg3 - 1] != 0) {
			this.anIntArrayArrayArray15[arg1][arg2][arg3] = this.anIntArrayArrayArray15[arg1][arg2][arg3 - 1];
			return;
		}
		if (arg2 > 0 && arg3 > 0 && this.anIntArrayArrayArray15[arg1][arg2 - 1][arg3 - 1] != 0) {
			this.anIntArrayArrayArray15[arg1][arg2][arg3] = this.anIntArrayArrayArray15[arg1][arg2 - 1][arg3 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(Lclient!s;[[IILclient!s;Lclient!s;ILclient!ha;)V")
	private void method2589(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class109 arg3, @OriginalArg(4) Class109 arg4, @OriginalArg(6) Class65 arg5) {
		@Pc(16) byte[][] local16 = this.aByteArrayArrayArray12[arg2];
		@Pc(21) byte[][] local21 = this.aByteArrayArrayArray17[arg2];
		@Pc(26) byte[][] local26 = this.aByteArrayArrayArray13[arg2];
		@Pc(31) byte[][] local31 = this.aByteArrayArrayArray14[arg2];
		for (@Pc(33) int local33 = 0; local33 < this.anInt2901; local33++) {
			@Pc(51) int local51 = this.anInt2901 - 1 > local33 ? local33 + 1 : local33;
			for (@Pc(53) int local53 = 0; local53 < this.anInt2909; local53++) {
				@Pc(71) int local71 = local53 < this.anInt2909 - 1 ? local53 + 1 : local53;
				if (Static55.anInt837 == -1 || Static658.method8808(Static55.anInt837, local53, local33, arg2)) {
					@Pc(85) boolean local85 = false;
					@Pc(87) boolean local87 = false;
					@Pc(90) boolean[] local90 = new boolean[4];
					@Pc(96) int local96 = local16[local33][local53];
					@Pc(102) int local102 = local21[local33][local53];
					@Pc(110) int local110 = local31[local33][local53] & 0xFF;
					@Pc(118) int local118 = local26[local33][local53] & 0xFF;
					@Pc(126) int local126 = local26[local33][local71] & 0xFF;
					@Pc(134) int local134 = local26[local51][local71] & 0xFF;
					@Pc(142) int local142 = local26[local51][local53] & 0xFF;
					if (local110 != 0 || local118 != 0) {
						@Pc(161) Class74 local161 = local110 == 0 ? null : this.aClass367_6.method8496(local110 - 1);
						if (local96 == 0 && local161 == null) {
							local96 = 12;
						}
						@Pc(182) Class335 local182 = local118 == 0 ? null : this.aClass314_4.method7470(local118 - 1);
						@Pc(184) Class74 local184 = local161;
						if (local161 != null) {
							if (local161.anInt2146 == -1 && local161.anInt2148 == -1) {
								local184 = local161;
								local161 = null;
							} else if (local182 != null && local96 != 0) {
								local87 = local161.aBoolean201;
							}
						}
						@Pc(299) int local299;
						@Pc(320) int local320;
						@Pc(389) int local389;
						@Pc(399) int local399;
						if ((local96 == 0 || local96 == 12) && local33 > 0 && local53 > 0 && local33 < this.anInt2901 && this.anInt2909 > local53) {
							@Pc(259) int local259 = local26[local51][local71] == local118 ? 1 : -1;
							@Pc(278) int local278 = local26[local51][local53 - 1] == local118 ? 1 : -1;
							local299 = local26[local33 - 1][local53 - 1] == local118 ? 1 : -1;
							local320 = local118 == local26[local33 - 1][local71] ? 1 : -1;
							if (local26[local33][local53 - 1] == local118) {
								local299++;
								local278++;
							} else {
								local278--;
								local299--;
							}
							if (local118 == local26[local51][local53]) {
								local278++;
								local259++;
							} else {
								local278--;
								local259--;
							}
							if (local26[local33][local71] == local118) {
								local259++;
								local320++;
							} else {
								local259--;
								local320--;
							}
							if (local118 == local26[local33 - 1][local53]) {
								local320++;
								local299++;
							} else {
								local320--;
								local299--;
							}
							local389 = local299 - local259;
							if (local389 < 0) {
								local389 = -local389;
							}
							local399 = local278 - local320;
							if (local399 < 0) {
								local399 = -local399;
							}
							if (local389 == local399) {
								local389 = arg0.method7695(local53, local33) - arg0.method7695(local71, local51);
								if (local389 < 0) {
									local389 = -local389;
								}
								local399 = arg0.method7695(local53, local51) - arg0.method7695(local71, local33);
								if (local399 < 0) {
									local399 = -local399;
								}
							}
							local102 = local389 < local399 ? 1 : 0;
						}
						for (local299 = 0; local299 < 13; local299++) {
							Static22.anIntArray17[local299] = -1;
							Static110.anIntArray82[local299] = 1;
						}
						@Pc(489) boolean[] local489 = local161 != null && local161.aBoolean201 ? Static121.aBooleanArrayArray1[local96] : Static474.aBooleanArrayArray6[local96];
						this.method2587(local16, this.anInt2909, this.anInt2901, local96, local21, local90, local31, arg5, local182, local53, local33, local102, local161);
						@Pc(522) boolean local522 = local161 != null && local161.anInt2148 != local161.anInt2146;
						if (!local522) {
							for (local320 = 0; local320 < 8; local320++) {
								if (Static22.anIntArray17[local320] >= 0 && Static68.anIntArray50[local320] != Static75.anIntArray59[local320]) {
									local522 = true;
									break;
								}
							}
						}
						if (!local489[local102 + 1 & 0x3]) {
							local90[1] = Static337.method5160(local90[1], (Static110.anIntArray82[4] & Static110.anIntArray82[2]) == 0);
						}
						if (!local489[local102 + 3 & 0x3]) {
							local90[3] = Static337.method5160(local90[3], (Static110.anIntArray82[0] & Static110.anIntArray82[6]) == 0);
						}
						if (!local489[local102 & 0x3]) {
							local90[0] = Static337.method5160(local90[0], (Static110.anIntArray82[0] & Static110.anIntArray82[2]) == 0);
						}
						if (!local489[local102 + 2 & 0x3]) {
							local90[2] = Static337.method5160(local90[2], (Static110.anIntArray82[6] & Static110.anIntArray82[4]) == 0);
						}
						if (!local87 && (local96 == 0 || local96 == 12)) {
							if (local90[0] && !local90[1] && !local90[2] && local90[3]) {
								local90[0] = local90[3] = false;
								local96 = local96 == 0 ? 13 : 14;
								local102 = 0;
							} else if (local90[0] && local90[1] && !local90[2] && !local90[3]) {
								local102 = 3;
								local90[0] = local90[1] = false;
								local96 = local96 == 0 ? 13 : 14;
							} else if (!local90[0] && local90[1] && local90[2] && !local90[3]) {
								local90[1] = local90[2] = false;
								local102 = 2;
								local96 = local96 == 0 ? 13 : 14;
							} else if (!local90[0] && !local90[1] && local90[2] && local90[3]) {
								local90[2] = local90[3] = false;
								local96 = local96 == 0 ? 13 : 14;
								local102 = 1;
							}
						}
						@Pc(839) boolean local839 = !local87 && !local90[0] && !local90[2] && !local90[1] && !local90[3];
						@Pc(841) int[] local841 = null;
						@Pc(863) int[] local863;
						@Pc(867) int[] local867;
						@Pc(871) int[] local871;
						if (local839) {
							local399 = local161 == null ? 0 : Static245.anIntArray43[local96];
							local389 = local182 == null ? 0 : Static382.anIntArray384[local96];
							local863 = Static43.anIntArrayArray3[local96];
							local867 = Static287.anIntArrayArray26[local96];
							local871 = Static191.anIntArrayArray13[local96];
						} else if (local87) {
							local867 = Static194.anIntArrayArray14[local96];
							local841 = Static457.anIntArrayArray41[local96];
							local399 = local161 == null ? 0 : Static454.anIntArray434[local96];
							local863 = Static557.anIntArrayArray49[local96];
							local389 = local182 == null ? 0 : Static458.anIntArray441[local96];
							local871 = Static519.anIntArrayArray46[local96];
						} else {
							local841 = Static479.anIntArrayArray42[local96];
							local871 = Static502.anIntArrayArray44[local96];
							local863 = Static208.anIntArrayArray16[local96];
							local389 = local182 == null ? 0 : Static3.anIntArray1[local96];
							local867 = Static269.anIntArrayArray23[local96];
							local399 = local161 == null ? 0 : Static148.anIntArray132[local96];
						}
						@Pc(945) int local945 = local399 + local389;
						if (local945 <= 0) {
							Static203.method3288(arg2, local33, local53);
						} else {
							if (local90[0]) {
								local945++;
							}
							if (local90[2]) {
								local945++;
							}
							if (local90[1]) {
								local945++;
							}
							if (local90[3]) {
								local945++;
							}
							@Pc(975) int local975 = 0;
							@Pc(977) int local977 = 0;
							@Pc(981) int local981 = local945 * 3;
							@Pc(988) int[] local988 = local522 ? new int[local981] : null;
							@Pc(991) int[] local991 = new int[local981];
							@Pc(994) int[] local994 = new int[local981];
							@Pc(997) int[] local997 = new int[local981];
							@Pc(1000) int[] local1000 = new int[local981];
							@Pc(1003) int[] local1003 = new int[local981];
							@Pc(1010) int[] local1010 = arg4 == null ? null : new int[local981];
							@Pc(1019) int[] local1019 = arg4 == null && arg3 == null ? null : new int[local981];
							@Pc(1021) int local1021 = -1;
							@Pc(1023) int local1023 = -1;
							@Pc(1025) int local1025 = 256;
							@Pc(1117) byte local1117;
							@Pc(1071) int local1071;
							@Pc(1073) int local1073;
							@Pc(1300) int local1300;
							@Pc(1306) int local1306;
							@Pc(1315) int local1315;
							@Pc(1320) int local1320;
							@Pc(1343) int local1343;
							@Pc(1325) int local1325;
							@Pc(1338) int local1338;
							@Pc(1394) int local1394;
							@Pc(1400) int local1400;
							if (local161 != null) {
								local1021 = local161.anInt2146;
								local1025 = local161.anInt2139;
								local1023 = local161.anInt2137;
								local1071 = Static358.method5410(local161, arg5);
								for (local1073 = 0; local1073 < local399; local1073++) {
									if (local90[-local102 & 0x3] && local841[0] == local975) {
										Static522.anIntArray486[0] = local863[local975];
										Static522.anIntArray486[1] = 1;
										Static522.anIntArray486[2] = local871[local975];
										Static522.anIntArray486[3] = 1;
										Static522.anIntArray486[4] = local867[local975];
										local1117 = 6;
										Static522.anIntArray486[5] = local871[local975];
									} else if (local90[2 - local102 & 0x3] && local841[2] == local975) {
										Static522.anIntArray486[0] = local863[local975];
										Static522.anIntArray486[1] = 5;
										Static522.anIntArray486[2] = local871[local975];
										Static522.anIntArray486[3] = 5;
										Static522.anIntArray486[4] = local867[local975];
										Static522.anIntArray486[5] = local871[local975];
										local1117 = 6;
									} else if (local90[1 - local102 & 0x3] && local841[1] == local975) {
										Static522.anIntArray486[0] = local863[local975];
										Static522.anIntArray486[1] = 3;
										Static522.anIntArray486[2] = local871[local975];
										Static522.anIntArray486[3] = 3;
										Static522.anIntArray486[4] = local867[local975];
										Static522.anIntArray486[5] = local871[local975];
										local1117 = 6;
									} else if (local90[3 - local102 & 0x3] && local975 == local841[3]) {
										Static522.anIntArray486[0] = local863[local975];
										Static522.anIntArray486[1] = 7;
										Static522.anIntArray486[2] = local871[local975];
										Static522.anIntArray486[3] = 7;
										Static522.anIntArray486[4] = local867[local975];
										Static522.anIntArray486[5] = local871[local975];
										local1117 = 6;
									} else {
										Static522.anIntArray486[0] = local863[local975];
										Static522.anIntArray486[1] = local867[local975];
										local1117 = 3;
										Static522.anIntArray486[2] = local871[local975];
									}
									for (local1300 = 0; local1300 < local1117; local1300++) {
										local1306 = Static522.anIntArray486[local1300];
										local1315 = local1306 - local102 * 2 & 0x7;
										local1320 = this.anIntArray128[local1306];
										local1325 = this.anIntArray126[local1306];
										if (local102 == 1) {
											local1338 = 512 - local1320;
											local1343 = local1325;
										} else if (local102 == 2) {
											local1338 = 512 - local1325;
											local1343 = 512 - local1320;
										} else if (local102 == 3) {
											local1338 = local1320;
											local1343 = 512 - local1325;
										} else {
											local1343 = local1320;
											local1338 = local1325;
										}
										local991[local977] = local1343;
										local994[local977] = local1338;
										if (local1010 != null && Static628.aBooleanArrayArray7[local96][local1306]) {
											local1394 = (local33 << 9) + local1343;
											local1400 = local1338 + (local53 << 9);
											local1010[local977] = arg4.method7702(local1394, local1400) - arg0.method7702(local1394, local1400);
										}
										if (local1019 != null) {
											if (arg4 != null && !Static628.aBooleanArrayArray7[local96][local1306]) {
												local1394 = local1343 + (local33 << 9);
												local1400 = local1338 + (local53 << 9);
												local1019[local977] = arg0.method7702(local1394, local1400) - arg4.method7702(local1394, local1400);
											} else if (arg3 != null && !Static474.aBooleanArrayArray5[local96][local1306]) {
												local1394 = local1343 + (local33 << 9);
												local1400 = local1338 + (local53 << 9);
												local1019[local977] = arg3.method7702(local1394, local1400) - arg0.method7702(local1394, local1400);
											}
										}
										if (local1306 < 8 && local161.anInt2147 < Static22.anIntArray17[local1315]) {
											if (local988 != null) {
												local988[local977] = Static75.anIntArray59[local1315];
											}
											local1003[local977] = Static602.anIntArray546[local1315];
											local1000[local977] = Static62.anIntArray48[local1315];
											local997[local977] = Static68.anIntArray50[local1315];
										} else {
											if (local988 != null) {
												local988[local977] = local1071;
											}
											local1000[local977] = local161.anInt2137;
											local1003[local977] = local161.anInt2139;
											local997[local977] = local1021;
										}
										local977++;
									}
									local975++;
								}
								if (!this.aBoolean248 && arg2 == 0) {
									Static277.method4501(local33, local53, local161.anInt2138, local161.anInt2145 * 8, local161.anInt2136);
								}
								if (local96 != 12 && local161.anInt2146 != -1 && local161.aBoolean202) {
									local85 = true;
								}
							} else if (local839) {
								local975 = Static245.anIntArray43[local96];
							} else if (local87) {
								local975 = Static454.anIntArray434[local96];
							} else {
								local975 = Static148.anIntArray132[local96];
							}
							if (local182 != null) {
								if (local134 == 0) {
									local134 = local118;
								}
								if (local126 == 0) {
									local126 = local118;
								}
								if (local142 == 0) {
									local142 = local118;
								}
								@Pc(1613) Class335 local1613 = this.aClass314_4.method7470(local118 - 1);
								@Pc(1621) Class335 local1621 = this.aClass314_4.method7470(local126 - 1);
								@Pc(1629) Class335 local1629 = this.aClass314_4.method7470(local134 - 1);
								@Pc(1637) Class335 local1637 = this.aClass314_4.method7470(local142 - 1);
								for (local1315 = 0; local1315 < local389; local1315++) {
									if (local90[-local102 & 0x3] && local975 == local841[0]) {
										Static522.anIntArray486[0] = local863[local975];
										Static522.anIntArray486[1] = 1;
										Static522.anIntArray486[2] = local871[local975];
										Static522.anIntArray486[3] = 1;
										Static522.anIntArray486[4] = local867[local975];
										local1117 = 6;
										Static522.anIntArray486[5] = local871[local975];
									} else if (local90[2 - local102 & 0x3] && local975 == local841[2]) {
										Static522.anIntArray486[0] = local863[local975];
										Static522.anIntArray486[1] = 5;
										Static522.anIntArray486[2] = local871[local975];
										Static522.anIntArray486[3] = 5;
										Static522.anIntArray486[4] = local867[local975];
										local1117 = 6;
										Static522.anIntArray486[5] = local871[local975];
									} else if (local90[1 - local102 & 0x3] && local975 == local841[1]) {
										Static522.anIntArray486[0] = local863[local975];
										Static522.anIntArray486[1] = 3;
										Static522.anIntArray486[2] = local871[local975];
										Static522.anIntArray486[3] = 3;
										Static522.anIntArray486[4] = local867[local975];
										Static522.anIntArray486[5] = local871[local975];
										local1117 = 6;
									} else if (local90[3 - local102 & 0x3] && local841[3] == local975) {
										Static522.anIntArray486[0] = local863[local975];
										Static522.anIntArray486[1] = 7;
										Static522.anIntArray486[2] = local871[local975];
										Static522.anIntArray486[3] = 7;
										Static522.anIntArray486[4] = local867[local975];
										Static522.anIntArray486[5] = local871[local975];
										local1117 = 6;
									} else {
										Static522.anIntArray486[0] = local863[local975];
										Static522.anIntArray486[1] = local867[local975];
										local1117 = 3;
										Static522.anIntArray486[2] = local871[local975];
									}
									local975++;
									for (local1320 = 0; local1320 < local1117; local1320++) {
										local1343 = Static522.anIntArray486[local1320];
										local1325 = local1343 - local102 * 2 & 0x7;
										local1338 = this.anIntArray128[local1343];
										local1400 = this.anIntArray126[local1343];
										@Pc(1907) int local1907;
										if (local102 == 1) {
											local1394 = local1400;
											local1907 = 512 - local1338;
										} else if (local102 == 2) {
											local1907 = 512 - local1400;
											local1394 = 512 - local1338;
										} else if (local102 == 3) {
											local1394 = 512 - local1400;
											local1907 = local1338;
										} else {
											local1394 = local1338;
											local1907 = local1400;
										}
										local991[local977] = local1394;
										local994[local977] = local1907;
										@Pc(1966) int local1966;
										@Pc(1972) int local1972;
										if (local1010 != null && Static628.aBooleanArrayArray7[local96][local1343]) {
											local1966 = local1394 + (local33 << 9);
											local1972 = local1907 + (local53 << 9);
											local1010[local977] = arg4.method7702(local1966, local1972) - arg0.method7702(local1966, local1972);
										}
										if (local1019 != null) {
											if (arg4 != null && !Static628.aBooleanArrayArray7[local96][local1343]) {
												local1966 = local1394 + (local33 << 9);
												local1972 = local1907 + (local53 << 9);
												local1019[local977] = arg0.method7702(local1966, local1972) - arg4.method7702(local1966, local1972);
											} else if (arg3 != null && !Static474.aBooleanArrayArray5[local96][local1343]) {
												local1966 = local1394 + (local33 << 9);
												local1972 = (local53 << 9) + local1907;
												local1019[local977] = arg3.method7702(local1966, local1972) - arg0.method7702(local1966, local1972);
											}
										}
										if (local1343 < 8 && Static22.anIntArray17[local1325] >= 0) {
											if (local988 != null) {
												local988[local977] = Static75.anIntArray59[local1325];
											}
											local1003[local977] = Static602.anIntArray546[local1325];
											local1000[local977] = Static62.anIntArray48[local1325];
											local997[local977] = Static68.anIntArray50[local1325];
										} else {
											if (local87 && Static628.aBooleanArrayArray7[local96][local1343]) {
												local1000[local977] = local1023;
												local1003[local977] = local1025;
												local997[local977] = local1021;
											} else if (local1394 == 0 && local1907 == 0) {
												local997[local977] = arg1[local33][local53];
												local1000[local977] = local1613.anInt9177;
												local1003[local977] = local1613.anInt9183;
											} else if (local1394 == 0 && local1907 == 512) {
												local997[local977] = arg1[local33][local71];
												local1000[local977] = local1621.anInt9177;
												local1003[local977] = local1621.anInt9183;
											} else if (local1394 == 512 && local1907 == 512) {
												local997[local977] = arg1[local51][local71];
												local1000[local977] = local1629.anInt9177;
												local1003[local977] = local1629.anInt9183;
											} else if (local1394 == 512 && local1907 == 0) {
												local997[local977] = arg1[local51][local53];
												local1000[local977] = local1637.anInt9177;
												local1003[local977] = local1637.anInt9183;
											} else {
												if (local1394 >= 256) {
													if (local1907 < 256) {
														local1000[local977] = local1637.anInt9177;
														local1003[local977] = local1637.anInt9183;
													} else {
														local1000[local977] = local1629.anInt9177;
														local1003[local977] = local1629.anInt9183;
													}
												} else if (local1907 < 256) {
													local1000[local977] = local1613.anInt9177;
													local1003[local977] = local1613.anInt9183;
												} else {
													local1000[local977] = local1621.anInt9177;
													local1003[local977] = local1621.anInt9183;
												}
												local1966 = Static226.method8108(local1394 << 7 >> 9, arg1[local51][local53], arg1[local33][local53]);
												local1972 = Static226.method8108(local1394 << 7 >> 9, arg1[local51][local71], arg1[local33][local71]);
												local997[local977] = Static226.method8108(local1907 << 7 >> 9, local1972, local1966);
											}
											if (local988 != null) {
												local988[local977] = local997[local977];
											}
										}
										local977++;
									}
								}
								if (local96 != 0 && local182.aBoolean785) {
									local85 = true;
								}
							}
							local1071 = arg0.method7695(local53, local33);
							local1073 = arg0.method7695(local53, local51);
							local1300 = arg0.method7695(local71, local51);
							local1306 = arg0.method7695(local71, local33);
							@Pc(2411) boolean local2411 = Static599.method8200(local53, local33);
							if (local2411 && arg2 > 1 || !local2411 && arg2 > 0) {
								@Pc(2425) boolean local2425 = true;
								if (local182 != null && !local182.aBoolean786) {
									local2425 = false;
								} else if (local118 == 0 && local96 != 0) {
									local2425 = false;
								} else if (local110 > 0 && local184 != null && !local184.aBoolean203) {
									local2425 = false;
								}
								if (local2425 && local1073 == local1071 && local1300 == local1071 && local1306 == local1071) {
									this.aByteArrayArrayArray15[arg2][local33][local53] = (byte) (this.aByteArrayArrayArray15[arg2][local33][local53] | 0x4);
								}
							}
							local1320 = 0;
							local1343 = 0;
							local1325 = 0;
							if (this.aBoolean248) {
								local1320 = Static1.method8276(local33, local53);
								local1343 = Static71.method8032(local33, local53);
								local1325 = Static102.method1991(local33, local53);
							}
							arg0.U(local33, local53, local991, local1010, local994, local1019, local997, local988, local1000, local1003, local1320, local1343, local1325, local85);
							Static203.method3288(arg2, local33, local53);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(ZLclient!ha;Lclient!s;Lclient!s;)V")
	public final void method2590(@OriginalArg(1) Class65 arg0, @OriginalArg(2) Class109 arg1, @OriginalArg(3) Class109 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt2901][this.anInt2909];
		if (Static60.anIntArray443 == null || this.anInt2909 != Static60.anIntArray443.length) {
			Static60.anIntArray443 = new int[this.anInt2909];
			Static348.anIntArray367 = new int[this.anInt2909];
			Static227.anIntArray211 = new int[this.anInt2909];
			Static278.anIntArray295 = new int[this.anInt2909];
			Static568.anIntArray365 = new int[this.anInt2909];
		}
		@Pc(44) int local44;
		for (@Pc(40) int local40 = 0; local40 < this.anInt2904; local40++) {
			for (local44 = 0; local44 < this.anInt2909; local44++) {
				Static60.anIntArray443[local44] = 0;
				Static568.anIntArray365[local44] = 0;
				Static348.anIntArray367[local44] = 0;
				Static227.anIntArray211[local44] = 0;
				Static278.anIntArray295[local44] = 0;
			}
			for (@Pc(73) int local73 = -5; local73 < this.anInt2901; local73++) {
				@Pc(83) int local83;
				@Pc(98) int local98;
				@Pc(170) int local170;
				for (@Pc(77) int local77 = 0; local77 < this.anInt2909; local77++) {
					local83 = local73 + 5;
					@Pc(147) int local147;
					if (local83 < this.anInt2901) {
						local98 = this.aByteArrayArrayArray13[local40][local83][local77] & 0xFF;
						if (local98 > 0) {
							@Pc(111) Class335 local111 = this.aClass314_4.method7470(local98 - 1);
							Static60.anIntArray443[local77] += local111.anInt9173;
							Static568.anIntArray365[local77] += local111.anInt9180;
							Static348.anIntArray367[local77] += local111.anInt9178;
							Static227.anIntArray211[local77] += local111.anInt9176;
							local147 = Static278.anIntArray295[local77]++;
						}
					}
					local98 = local73 - 5;
					if (local98 >= 0) {
						local170 = this.aByteArrayArrayArray13[local40][local98][local77] & 0xFF;
						if (local170 > 0) {
							@Pc(183) Class335 local183 = this.aClass314_4.method7470(local170 - 1);
							Static60.anIntArray443[local77] -= local183.anInt9173;
							Static568.anIntArray365[local77] -= local183.anInt9180;
							Static348.anIntArray367[local77] -= local183.anInt9178;
							Static227.anIntArray211[local77] -= local183.anInt9176;
							local147 = Static278.anIntArray295[local77]--;
						}
					}
				}
				if (local73 >= 0) {
					local83 = 0;
					local98 = 0;
					local170 = 0;
					@Pc(237) int local237 = 0;
					@Pc(239) int local239 = 0;
					for (@Pc(241) int local241 = -5; local241 < this.anInt2909; local241++) {
						@Pc(247) int local247 = local241 + 5;
						if (this.anInt2909 > local247) {
							local170 += Static348.anIntArray367[local247];
							local98 += Static568.anIntArray365[local247];
							local83 += Static60.anIntArray443[local247];
							local239 += Static278.anIntArray295[local247];
							local237 += Static227.anIntArray211[local247];
						}
						@Pc(289) int local289 = local241 - 5;
						if (local289 >= 0) {
							local239 -= Static278.anIntArray295[local289];
							local98 -= Static568.anIntArray365[local289];
							local237 -= Static227.anIntArray211[local289];
							local170 -= Static348.anIntArray367[local289];
							local83 -= Static60.anIntArray443[local289];
						}
						if (local241 >= 0 && local237 > 0 && local239 > 0) {
							local11[local73][local241] = Static278.method4506(local83 * 256 / local237, local170 / local239, local98 / local239);
						}
					}
				}
			}
			if (Static584.aBoolean805) {
				this.method2589(Static495.aClass109Array4[local40], local11, local40, local40 == 0 ? arg1 : null, local40 == 0 ? arg2 : null, arg0);
			} else {
				this.method2579(local40 == 0 ? arg1 : null, local11, Static495.aClass109Array4[local40], arg0, local40, local40 == 0 ? arg2 : null);
			}
			this.aByteArrayArrayArray13[local40] = null;
			this.aByteArrayArrayArray14[local40] = null;
			this.aByteArrayArrayArray12[local40] = null;
			this.aByteArrayArrayArray17[local40] = null;
		}
		if (!this.aBoolean248) {
			if (Static247.anInt9314 != 0) {
				Static213.method8053();
			}
			if (Static409.aBoolean627) {
				Static27.method336();
			}
		}
		for (local44 = 0; local44 < this.anInt2904; local44++) {
			Static495.aClass109Array4[local44].YA();
		}
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIZILclient!mc;IIIIIZ)V")
	private void method2591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5_Sub41 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9) {
		if (arg5 == 1) {
			arg1 = 1;
		} else if (arg5 == 2) {
			arg1 = 1;
			arg0 = 1;
		} else if (arg5 == 3) {
			arg0 = 1;
		}
		@Pc(46) int local46;
		if (arg2 < 0 || arg2 >= this.anInt2901 || arg7 < 0 || this.anInt2909 <= arg7) {
			while (true) {
				local46 = arg3.method7816();
				if (local46 == 0) {
					break;
				}
				if (local46 == 1) {
					arg3.method7816();
					break;
				}
				if (local46 <= 49) {
					arg3.method7816();
				}
			}
			return;
		}
		if (!this.aBoolean248 && !arg9) {
			Static7.aByteArrayArrayArray1[arg4][arg2][arg7] = 0;
		}
		while (true) {
			local46 = arg3.method7816();
			if (local46 == 0) {
				if (this.aBoolean248) {
					this.anIntArrayArrayArray15[0][arg0 + arg2][arg1 + arg7] = 0;
				} else if (arg4 == 0) {
					this.anIntArrayArrayArray15[0][arg0 + arg2][arg7 + arg1] = -Static553.method7676(arg8 + 556238, arg6 + 932731) * 8 << 2;
				} else {
					this.anIntArrayArrayArray15[arg4][arg0 + arg2][arg7 + arg1] = this.anIntArrayArrayArray15[arg4 - 1][arg2 + arg0][arg1 + arg7] - 960;
				}
				break;
			}
			if (local46 == 1) {
				@Pc(174) int local174 = arg3.method7816();
				if (this.aBoolean248) {
					this.anIntArrayArrayArray15[0][arg2 + arg0][arg1 + arg7] = local174 * 8 << 2;
				} else {
					if (local174 == 1) {
						local174 = 0;
					}
					if (arg4 == 0) {
						this.anIntArrayArrayArray15[0][arg2 + arg0][arg1 + arg7] = -local174 * 8 << 2;
					} else {
						this.anIntArrayArrayArray15[arg4][arg2 + arg0][arg1 + arg7] = this.anIntArrayArrayArray15[arg4 - 1][arg0 + arg2][arg7 + arg1] - (local174 * 8 << 2);
					}
				}
				break;
			}
			if (local46 <= 49) {
				if (arg9) {
					arg3.method7816();
				} else {
					this.aByteArrayArrayArray14[arg4][arg2][arg7] = arg3.method7861();
					this.aByteArrayArrayArray12[arg4][arg2][arg7] = (byte) ((local46 - 2) / 4);
					this.aByteArrayArrayArray17[arg4][arg2][arg7] = (byte) (local46 + arg5 - 2 & 0x3);
				}
			} else if (local46 <= 81) {
				if (!this.aBoolean248 && !arg9) {
					Static7.aByteArrayArrayArray1[arg4][arg2][arg7] = (byte) (local46 - 49);
				}
			} else if (!arg9) {
				this.aByteArrayArrayArray13[arg4][arg2][arg7] = (byte) (local46 - 81);
			}
		}
	}
}
