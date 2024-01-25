import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public class Class118 {

	@OriginalMember(owner = "client!is", name = "j", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "[I")
	private final int[] anIntArray473 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!is", name = "v", descriptor = "[I")
	private final int[] anIntArray474 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!is", name = "r", descriptor = "Lclient!rq;")
	private final Class218 aClass218_6;

	@OriginalMember(owner = "client!is", name = "q", descriptor = "I")
	public final int anInt5443;

	@OriginalMember(owner = "client!is", name = "C", descriptor = "Z")
	public final boolean aBoolean408;

	@OriginalMember(owner = "client!is", name = "B", descriptor = "I")
	protected final int anInt5448;

	@OriginalMember(owner = "client!is", name = "s", descriptor = "Lclient!m;")
	private final Class153 aClass153_5;

	@OriginalMember(owner = "client!is", name = "c", descriptor = "I")
	protected final int anInt5434;

	@OriginalMember(owner = "client!is", name = "f", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!is", name = "n", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!is", name = "l", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!is", name = "z", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!is", name = "A", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!is", name = "i", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	static {
		new Class134("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(IIIZLclient!rq;Lclient!m;)V")
	protected Class118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class218 arg4, @OriginalArg(5) Class153 arg5) {
		this.aClass218_6 = arg4;
		this.anInt5443 = arg0;
		this.aBoolean408 = arg3;
		this.anInt5448 = arg1;
		this.aClass153_5 = arg5;
		this.anInt5434 = arg2;
		this.anIntArrayArrayArray11 = new int[this.anInt5443][this.anInt5448 + 1][this.anInt5434 + 1];
		this.aByteArrayArrayArray15 = new byte[this.anInt5443][this.anInt5448][this.anInt5434];
		this.aByteArrayArrayArray14 = new byte[this.anInt5443][this.anInt5448 + 1][this.anInt5434 + 1];
		this.aByteArrayArrayArray16 = new byte[this.anInt5443][this.anInt5448][this.anInt5434];
		this.aByteArrayArrayArray17 = new byte[this.anInt5443][this.anInt5448][this.anInt5434];
		this.aByteArrayArrayArray12 = new byte[this.anInt5443][this.anInt5448][this.anInt5434];
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "([[IBI)V")
	public final void method4298(@OriginalArg(0) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray11[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt5448 + 1; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt5434 + 1; local16++) {
				local10[local12][local16] += arg0[local12][local16];
			}
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!za;BLclient!ya;[[ILclient!ya;ILclient!ya;)V")
	private void method4299(@OriginalArg(0) Class163 arg0, @OriginalArg(2) Class162 arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) Class162 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class162 arg5) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5448; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt5434; local7++) {
				if (Static452.anInt7252 == -1 || Static375.method4874(arg4, Static452.anInt7252, local7, local3)) {
					@Pc(32) byte local32 = this.aByteArrayArrayArray16[arg4][local3][local7];
					@Pc(41) byte local41 = this.aByteArrayArrayArray12[arg4][local3][local7];
					@Pc(52) int local52 = this.aByteArrayArrayArray15[arg4][local3][local7] & 0xFF;
					@Pc(63) int local63 = this.aByteArrayArrayArray17[arg4][local3][local7] & 0xFF;
					@Pc(75) Class233 local75 = local52 == 0 ? null : this.aClass218_6.method4676(local52 - 1);
					@Pc(87) Class269 local87 = local63 == 0 ? null : this.aClass153_5.method3081(local63 - 1);
					@Pc(89) int local89 = 0;
					@Pc(91) int local91 = 0;
					if (local32 != 0) {
						local89 = local87 == null ? 0 : Static71.anIntArray119[local32];
						local91 = local75 == null ? 0 : Static348.anIntArray515[local32];
					} else if (local75 != null) {
						local91 = Static348.anIntArray515[local32];
					} else if (local87 != null) {
						local89 = Static348.anIntArray515[local32];
					}
					@Pc(129) int local129 = local91 + local89;
					@Pc(131) int local131 = 0;
					if (local129 != 0) {
						@Pc(139) int[] local139 = new int[local129];
						@Pc(142) int[] local142 = new int[local129];
						@Pc(145) int[] local145 = new int[local129];
						@Pc(148) int[] local148 = new int[local129];
						@Pc(150) boolean local150 = false;
						@Pc(167) int local167;
						@Pc(195) int local195;
						if (local75 == null || local75.anInt6331 == -1 && local75.anInt6330 == -1 && local75.anInt6328 == -1) {
							for (local167 = 0; local167 < local91; local167++) {
								local139[local131] = -1;
								local131++;
							}
						} else {
							local167 = arg0.method5538() ? local75.anInt6328 : local75.anInt6337;
							if (Static142.aBoolean166) {
								local167 = -1;
							}
							for (local195 = 0; local195 < local91; local195++) {
								local145[local131] = local167;
								local148[local131] = local75.anInt6341;
								if (local75.anInt6331 == -1) {
									local139[local131] = -1;
								} else {
									local139[local131] = local75.anInt6331;
								}
								if (local75.anInt6330 == -1) {
									local142[local131] = -1;
								} else {
									local150 = true;
									local142[local131] = local75.anInt6330;
								}
								local131++;
							}
							if (!this.aBoolean408 && arg4 == 0) {
								Static429.method5374(local3, local7, local75.anInt6339, local75.anInt6338 * 8, local75.anInt6333);
							}
						}
						if (!local150) {
							local142 = null;
						}
						if (local87 == null) {
							for (local167 = 0; local167 < local89; local167++) {
								local139[local131] = -1;
								local131++;
							}
						} else {
							local167 = local87.anInt7207;
							if (Static142.aBoolean166) {
								local167 = -1;
							}
							for (local195 = 0; local195 < local89; local195++) {
								local145[local131] = local167;
								local148[local131] = local87.anInt7202;
								local139[local131] = arg2[local3][local7];
								if (local142 != null) {
									local142[local131] = -1;
								}
								local131++;
							}
						}
						local167 = this.anIntArray473.length;
						@Pc(335) int[] local335 = new int[local167];
						@Pc(338) int[] local338 = new int[local167];
						@Pc(345) int[] local345 = arg5 == null ? null : new int[local167];
						@Pc(354) int[] local354 = arg5 == null && arg1 == null ? null : new int[local167];
						@Pc(363) int local363;
						@Pc(368) int local368;
						@Pc(449) int local449;
						@Pc(455) int local455;
						for (@Pc(356) int local356 = 0; local356 < local167; local356++) {
							local363 = this.anIntArray473[local356];
							local368 = this.anIntArray474[local356];
							if (local41 == 0) {
								local335[local356] = local363;
								local338[local356] = local368;
							} else if (local41 == 1) {
								local335[local356] = local368;
								local338[local356] = 128 - local363;
							} else if (local41 == 2) {
								local335[local356] = 128 - local363;
								local338[local356] = 128 - local368;
							} else if (local41 == 3) {
								local335[local356] = 128 - local368;
								local338[local356] = local363;
							}
							if (local345 != null && Static346.aBooleanArrayArray5[local32][local356]) {
								local449 = (local3 << 7) + local363;
								local455 = (local7 << 7) + local363;
								local345[local356] = arg5.ca(local449, local455) - arg3.ca(local449, local455);
							}
							if (local354 != null) {
								if (arg5 != null && !Static346.aBooleanArrayArray5[local32][local356]) {
									local449 = (local3 << 7) + local363;
									local455 = local363 + (local7 << 7);
									local354[local356] = arg3.ca(local449, local455) - arg5.ca(local449, local455);
								} else if (arg1 != null && !Static269.aBooleanArrayArray3[local32][local356]) {
									local449 = local363 + (local3 << 7);
									local455 = (local7 << 7) + local363;
									local354[local356] = arg1.ca(local449, local455) - arg3.ca(local449, local455);
								}
							}
						}
						local363 = arg3.ua(local3, local7);
						local368 = arg3.ua(local3 + 1, local7);
						local449 = arg3.ua(local3 + 1, local7 + 1);
						local455 = arg3.ua(local3, local7 + 1);
						if (arg4 > 0) {
							@Pc(573) boolean local573 = true;
							if (local63 == 0 && local32 != 0) {
								local573 = false;
							}
							if (local52 > 0 && local75 != null && !local75.aBoolean453) {
								local573 = false;
							}
							if (local573 && local363 == local368 && local449 == local363 && local363 == local455) {
								this.aByteArrayArrayArray14[arg4][local3][local7] = (byte) (this.aByteArrayArrayArray14[arg4][local3][local7] | 0x4);
							}
						}
						@Pc(631) int local631 = 0;
						@Pc(633) int local633 = 0;
						@Pc(635) int local635 = 0;
						if (this.aBoolean408) {
							local631 = Static196.method2644(local3, local7);
							local633 = Static2.method8(local3, local7);
							local635 = Static270.method3647(local3, local7);
						}
						arg3.method3275(local3, local7, local335, local345, local338, local354, Static167.anIntArrayArray13[local32], Static290.anIntArrayArray43[local32], Static19.anIntArrayArray2[local32], local139, local142, local145, local148, local631, local633, local635);
						Static345.method4603(arg4, local3, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I[Lclient!et;IIIIIBILclient!sv;)V")
	public final void method4300(@OriginalArg(0) int arg0, @OriginalArg(1) Class71[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class2_Sub13 arg8) {
		@Pc(17) int local17 = (arg3 & 0x7) * 8;
		@Pc(23) int local23 = (arg5 & 0x7) * 8;
		@Pc(32) int local32;
		@Pc(63) int local63;
		if (!this.aBoolean408) {
			@Pc(30) Class71 local30 = arg1[arg0];
			for (local32 = 0; local32 < 8; local32++) {
				for (@Pc(36) int local36 = 0; local36 < 8; local36++) {
					@Pc(51) int local51 = arg6 + Static289.method3845(local36 & 0x7, local32 & 0x7, arg4);
					local63 = Static248.method3156(local36 & 0x7, local32 & 0x7, arg4) + arg7;
					if (local51 > 0 && local51 < this.anInt5448 - 1 && local63 > 0 && local63 < this.anInt5434 - 1) {
						local30.method1616(local63, local51);
					}
				}
			}
		}
		@Pc(107) int local107 = (arg3 & 0xFFFFFFF8) << 3;
		local32 = (arg5 & 0xFFFFFFF8) << 3;
		@Pc(115) byte local115 = 0;
		@Pc(117) byte local117 = 0;
		if (arg4 == 1) {
			local117 = 1;
		} else if (arg4 == 2) {
			local117 = 1;
			local115 = 1;
		} else if (arg4 == 3) {
			local115 = 1;
		}
		for (local63 = 0; local63 < this.anInt5443; local63++) {
			for (@Pc(148) int local148 = 0; local148 < 64; local148++) {
				for (@Pc(152) int local152 = 0; local152 < 64; local152++) {
					if (local63 == arg2 && local148 >= local17 && local17 + 8 >= local148 && local152 >= local23 && local23 + 8 >= local152) {
						@Pc(223) int local223;
						@Pc(229) int local229;
						if (local17 + 8 == local148 || local23 + 8 == local152) {
							if (arg4 == 0) {
								local223 = local148 + arg6 - local17;
								local229 = local152 + arg7 - local23;
							} else if (arg4 == 1) {
								local223 = arg6 + local152 - local23;
								local229 = arg7 + local17 + 8 - local148;
							} else if (arg4 == 2) {
								local223 = local17 + arg6 + 8 - local148;
								local229 = arg7 + local23 + 8 - local152;
							} else {
								local229 = local148 + arg7 - local17;
								local223 = local23 + arg6 + 8 - local152;
							}
							this.method4306(0, arg8, arg0, true, local32 + local152, 0, local223, 0, local148 + local107, local229);
						} else {
							local223 = arg6 + Static289.method3845(local152 & 0x7, local148 & 0x7, arg4);
							local229 = arg7 + Static248.method3156(local152 & 0x7, local148 & 0x7, arg4);
							this.method4306(arg4, arg8, arg0, false, local152 + local32, local117, local223, local115, local107 + local148, local229);
						}
						if (local148 == 63 || local152 == 63) {
							@Pc(367) byte local367 = 1;
							if (local148 == 63 && local152 == 63) {
								local367 = 3;
							}
							for (@Pc(381) int local381 = 0; local381 < local367; local381++) {
								@Pc(385) int local385 = local148;
								@Pc(387) int local387 = local152;
								if (local381 == 0) {
									local387 = local152 == 63 ? 64 : local152;
									local385 = local148 == 63 ? 64 : local148;
								} else if (local381 == 1) {
									local385 = 64;
								} else if (local381 == 2) {
									local387 = 64;
								}
								@Pc(455) int local455;
								@Pc(445) int local445;
								if (arg4 == 0) {
									local445 = local387 + arg7 - local23;
									local455 = arg6 + local385 - local17;
								} else if (arg4 == 1) {
									local445 = arg7 + local17 + 8 - local385;
									local455 = local387 + arg6 - local23;
								} else if (arg4 == 2) {
									local445 = local23 + arg7 + 8 - local387;
									local455 = arg6 + local17 + 8 - local385;
								} else {
									local445 = arg7 + local385 - local17;
									local455 = arg6 + local23 + 8 - local387;
								}
								if (local455 >= 0 && local455 < this.anInt5448 && local445 >= 0 && local445 < this.anInt5434) {
									this.anIntArrayArrayArray11[arg0][local455][local445] = this.anIntArrayArrayArray11[arg0][local115 + local223][local229 + local117];
								}
							}
						}
					} else {
						this.method4306(0, arg8, 0, false, 0, 0, -1, 0, 0, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "([[[II[Lclient!et;Lclient!za;)V")
	public final void method4301(@OriginalArg(0) int[][][] arg0, @OriginalArg(2) Class71[] arg1, @OriginalArg(3) Class163 arg2) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (!this.aBoolean408) {
			for (local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt5448; local10++) {
					for (local14 = 0; local14 < this.anInt5434; local14++) {
						if ((Static253.aByteArrayArrayArray11[local6][local10][local14] & 0x1) != 0) {
							@Pc(31) int local31 = local6;
							if ((Static253.aByteArrayArrayArray11[1][local10][local14] & 0x2) != 0) {
								local31 = local6 - 1;
							}
							if (local31 >= 0) {
								arg1[local31].method1617(local10, local14);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt5443; local6++) {
			local10 = 0;
			local14 = 0;
			if (!this.aBoolean408) {
				if (Static405.aBoolean468) {
					local14 = 8;
				}
				if (Static302.aBoolean346) {
					local10 = 2;
				}
				if (Static235.anInt3809 != 0) {
					if (local6 == 0 | Static18.aBoolean210) {
						local14 |= 0x10;
					}
					local10 |= 0x1;
				}
			}
			if (Static302.aBoolean346) {
				local14 |= 0x7;
			}
			if (!Static169.aBoolean177) {
				local14 |= 0x20;
			}
			@Pc(152) int[][] local152 = arg0 == null || arg0.length <= local6 ? this.anIntArrayArrayArray11[local6] : arg0[local6];
			Static364.method4791(local6, arg2.method5557(this.anInt5448, this.anInt5434, this.anIntArrayArrayArray11[local6], local152, local10, local14));
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ZIIII)V")
	public final void method4303(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5443; local3++) {
			this.method4305(arg1, local3, arg0);
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "([[ILclient!ya;Lclient!za;Lclient!ya;Lclient!ya;II)V")
	private void method4304(@OriginalArg(0) int[][] arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(2) Class163 arg2, @OriginalArg(3) Class162 arg3, @OriginalArg(4) Class162 arg4, @OriginalArg(6) int arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray16[arg5];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray12[arg5];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray17[arg5];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray15[arg5];
		for (@Pc(27) int local27 = 0; local27 < this.anInt5448; local27++) {
			@Pc(41) int local41 = this.anInt5448 - 1 > local27 ? local27 + 1 : local27;
			for (@Pc(43) int local43 = 0; local43 < this.anInt5434; local43++) {
				@Pc(57) int local57 = local43 < this.anInt5434 - 1 ? local43 + 1 : local43;
				if (Static452.anInt7252 == -1 || Static375.method4874(arg5, Static452.anInt7252, local43, local27)) {
					@Pc(71) boolean local71 = false;
					@Pc(73) boolean local73 = false;
					@Pc(76) boolean[] local76 = new boolean[4];
					@Pc(82) int local82 = local10[local27][local43];
					@Pc(88) int local88 = local15[local27][local43];
					@Pc(96) int local96 = local25[local27][local43] & 0xFF;
					@Pc(104) int local104 = local20[local27][local43] & 0xFF;
					@Pc(112) int local112 = local20[local27][local57] & 0xFF;
					@Pc(120) int local120 = local20[local41][local57] & 0xFF;
					@Pc(128) int local128 = local20[local41][local43] & 0xFF;
					if (local96 != 0 || local104 != 0) {
						@Pc(147) Class233 local147 = local96 == 0 ? null : this.aClass218_6.method4676(local96 - 1);
						if (local82 == 0 && local147 == null) {
							local82 = 12;
						}
						@Pc(168) Class269 local168 = local104 == 0 ? null : this.aClass153_5.method3081(local104 - 1);
						@Pc(170) Class233 local170 = local147;
						if (local147 != null) {
							if (local147.anInt6331 == -1 && local147.anInt6330 == -1) {
								local170 = local147;
								local147 = null;
							} else if (local168 != null && local82 != 0) {
								local73 = local147.aBoolean452;
							}
						}
						@Pc(273) int local273;
						@Pc(288) int local288;
						@Pc(357) int local357;
						@Pc(367) int local367;
						if ((local82 == 0 || local82 == 12) && local27 > 0 && local43 > 0 && this.anInt5448 > local27 && local43 < this.anInt5434) {
							@Pc(239) int local239 = local104 == local20[local41][local57] ? 1 : -1;
							@Pc(254) int local254 = local104 == local20[local41][local43 - 1] ? 1 : -1;
							local273 = local20[local27 - 1][local43 - 1] == local104 ? 1 : -1;
							local288 = local20[local27 - 1][local57] == local104 ? 1 : -1;
							if (local104 == local20[local27][local43 - 1]) {
								local273++;
								local254++;
							} else {
								local254--;
								local273--;
							}
							if (local20[local41][local43] == local104) {
								local239++;
								local254++;
							} else {
								local239--;
								local254--;
							}
							if (local104 == local20[local27][local57]) {
								local288++;
								local239++;
							} else {
								local239--;
								local288--;
							}
							if (local104 == local20[local27 - 1][local43]) {
								local288++;
								local273++;
							} else {
								local288--;
								local273--;
							}
							local357 = local273 - local239;
							if (local357 < 0) {
								local357 = -local357;
							}
							local367 = local254 - local288;
							if (local367 < 0) {
								local367 = -local367;
							}
							if (local367 == local357) {
								local357 = arg4.ua(local27, local43) - arg4.ua(local41, local57);
								if (local357 < 0) {
									local357 = -local357;
								}
								local367 = arg4.ua(local41, local43) - arg4.ua(local27, local57);
								if (local367 < 0) {
									local367 = -local367;
								}
							}
							local88 = local367 > local357 ? 1 : 0;
						}
						for (local273 = 0; local273 < 13; local273++) {
							Static219.anIntArray527[local273] = -1;
							Static322.anIntArray482[local273] = 1;
						}
						@Pc(456) boolean[] local456 = local147 != null && local147.aBoolean452 ? Static149.aBooleanArrayArray2[local82] : Static281.aBooleanArrayArray4[local82];
						this.method4309(local25, local27, local15, local82, local43, local76, arg2, this.anInt5434, local147, local10, local168, this.anInt5448, local88);
						@Pc(485) boolean local485 = local147 != null && local147.anInt6330 != local147.anInt6331;
						if (!local485) {
							for (local288 = 0; local288 < 8; local288++) {
								if (Static219.anIntArray527[local288] >= 0 && Static366.anIntArray529[local288] != Static24.anIntArray36[local288]) {
									local485 = true;
									break;
								}
							}
						}
						if (!local456[local88 + 1 & 0x3]) {
							local76[1] = Static380.method356(local76[1], (Static322.anIntArray482[2] & Static322.anIntArray482[4]) == 0);
						}
						if (!local456[local88 + 3 & 0x3]) {
							local76[3] = Static380.method356(local76[3], (Static322.anIntArray482[6] & Static322.anIntArray482[0]) == 0);
						}
						if (!local456[--local88 & 0x3]) {
							local76[0] = Static380.method356(local76[0], (Static322.anIntArray482[0] & Static322.anIntArray482[2]) == 0);
						}
						if (!local456[local88 + 2 & 0x3]) {
							local76[2] = Static380.method356(local76[2], (Static322.anIntArray482[4] & Static322.anIntArray482[6]) == 0);
						}
						if (!local73 && (local82 == 0 || local82 == 12)) {
							if (local76[0] && !local76[1] && !local76[2] && local76[3]) {
								local82 = local82 == 0 ? 13 : 14;
								local76[0] = local76[3] = false;
								local88 = 0;
							} else if (local76[0] && local76[1] && !local76[2] && !local76[3]) {
								local82 = local82 == 0 ? 13 : 14;
								local76[0] = local76[1] = false;
								local88 = 3;
							} else if (!local76[0] && local76[1] && local76[2] && !local76[3]) {
								local82 = local82 == 0 ? 13 : 14;
								local76[1] = local76[2] = false;
								local88 = 2;
							} else if (!local76[0] && !local76[1] && local76[2] && local76[3]) {
								local82 = local82 == 0 ? 13 : 14;
								local88 = 1;
								local76[2] = local76[3] = false;
							}
						}
						@Pc(796) boolean local796 = !local73 && !local76[0] && !local76[2] && !local76[1] && !local76[3];
						@Pc(798) int[] local798 = null;
						@Pc(822) int[] local822;
						@Pc(834) int[] local834;
						@Pc(806) int[] local806;
						if (local796) {
							local822 = Static167.anIntArrayArray13[local82];
							local357 = local168 == null ? 0 : Static71.anIntArray119[local82];
							local806 = Static19.anIntArrayArray2[local82];
							local834 = Static290.anIntArrayArray43[local82];
							local367 = local147 == null ? 0 : Static348.anIntArray515[local82];
						} else if (local73) {
							local367 = local147 == null ? 0 : Static391.anIntArray548[local82];
							local798 = Static181.anIntArrayArray14[local82];
							local806 = Static263.anIntArrayArray20[local82];
							local834 = Static425.anIntArrayArray57[local82];
							local357 = local168 == null ? 0 : Static171.anIntArray235[local82];
							local822 = Static205.anIntArrayArray19[local82];
						} else {
							local806 = Static413.anIntArrayArray54[local82];
							local798 = Static29.anIntArrayArray4[local82];
							local367 = local147 == null ? 0 : Static388.anIntArray414[local82];
							local822 = Static138.anIntArrayArray12[local82];
							local357 = local168 == null ? 0 : Static63.anIntArray103[local82];
							local834 = Static124.anIntArrayArray6[local82];
						}
						@Pc(901) int local901 = local367 + local357;
						if (local901 <= 0) {
							Static345.method4603(arg5, local27, local43);
						} else {
							if (local76[0]) {
								local901++;
							}
							if (local76[2]) {
								local901++;
							}
							if (local76[1]) {
								local901++;
							}
							if (local76[3]) {
								local901++;
							}
							@Pc(934) int local934 = 0;
							@Pc(936) int local936 = 0;
							@Pc(940) int local940 = local901 * 3;
							@Pc(947) int[] local947 = local485 ? new int[local940] : null;
							@Pc(950) int[] local950 = new int[local940];
							@Pc(953) int[] local953 = new int[local940];
							@Pc(956) int[] local956 = new int[local940];
							@Pc(959) int[] local959 = new int[local940];
							@Pc(962) int[] local962 = new int[local940];
							@Pc(969) int[] local969 = arg1 == null ? null : new int[local940];
							@Pc(978) int[] local978 = arg1 == null && arg3 == null ? null : new int[local940];
							@Pc(980) int local980 = -1;
							@Pc(982) int local982 = -1;
							@Pc(984) int local984 = 256;
							@Pc(1062) byte local1062;
							@Pc(1006) int local1006;
							@Pc(1008) int local1008;
							@Pc(1241) int local1241;
							@Pc(1247) int local1247;
							@Pc(1255) int local1255;
							@Pc(1260) int local1260;
							@Pc(1284) int local1284;
							@Pc(1265) int local1265;
							@Pc(1279) int local1279;
							@Pc(1333) int local1333;
							@Pc(1339) int local1339;
							if (local147 != null) {
								local980 = local147.anInt6331;
								local982 = arg2.method5538() ? local147.anInt6328 : local147.anInt6337;
								local984 = local147.anInt6341;
								local1006 = Static126.method439(arg2, local147);
								for (local1008 = 0; local1008 < local367; local1008++) {
									if (local76[-local88 & 0x3] && local934 == local798[0]) {
										Static203.anIntArray299[0] = local822[local934];
										Static203.anIntArray299[1] = 1;
										Static203.anIntArray299[2] = local806[local934];
										Static203.anIntArray299[3] = 1;
										Static203.anIntArray299[4] = local834[local934];
										Static203.anIntArray299[5] = local806[local934];
										local1062 = 6;
									} else if (local76[2 - local88 & 0x3] && local934 == local798[2]) {
										Static203.anIntArray299[0] = local822[local934];
										Static203.anIntArray299[1] = 5;
										Static203.anIntArray299[2] = local806[local934];
										Static203.anIntArray299[3] = 5;
										Static203.anIntArray299[4] = local834[local934];
										Static203.anIntArray299[5] = local806[local934];
										local1062 = 6;
									} else if (local76[1 - local88 & 0x3] && local798[1] == local934) {
										Static203.anIntArray299[0] = local822[local934];
										Static203.anIntArray299[1] = 3;
										Static203.anIntArray299[2] = local806[local934];
										Static203.anIntArray299[3] = 3;
										Static203.anIntArray299[4] = local834[local934];
										local1062 = 6;
										Static203.anIntArray299[5] = local806[local934];
									} else if (local76[3 - local88 & 0x3] && local934 == local798[3]) {
										Static203.anIntArray299[0] = local822[local934];
										Static203.anIntArray299[1] = 7;
										Static203.anIntArray299[2] = local806[local934];
										Static203.anIntArray299[3] = 7;
										Static203.anIntArray299[4] = local834[local934];
										local1062 = 6;
										Static203.anIntArray299[5] = local806[local934];
									} else {
										Static203.anIntArray299[0] = local822[local934];
										Static203.anIntArray299[1] = local834[local934];
										local1062 = 3;
										Static203.anIntArray299[2] = local806[local934];
									}
									local934++;
									for (local1241 = 0; local1241 < local1062; local1241++) {
										local1247 = Static203.anIntArray299[local1241];
										local1255 = local1247 - local88 * 2 & 0x7;
										local1260 = this.anIntArray473[local1247];
										local1265 = this.anIntArray474[local1247];
										if (local88 == 1) {
											local1284 = local1265;
											local1279 = 128 - local1260;
										} else if (local88 == 2) {
											local1279 = 128 - local1265;
											local1284 = 128 - local1260;
										} else if (local88 == 3) {
											local1279 = local1260;
											local1284 = 128 - local1265;
										} else {
											local1279 = local1265;
											local1284 = local1260;
										}
										local950[local936] = local1284;
										local953[local936] = local1279;
										if (local969 != null && Static346.aBooleanArrayArray5[local82][local1247]) {
											local1333 = (local27 << 7) + local1284;
											local1339 = local1279 + (local43 << 7);
											local969[local936] = arg1.ca(local1333, local1339) - arg4.ca(local1333, local1339);
										}
										if (local978 != null) {
											if (arg1 != null && !Static346.aBooleanArrayArray5[local82][local1247]) {
												local1333 = local1284 + (local27 << 7);
												local1339 = local1279 + (local43 << 7);
												local978[local936] = arg4.ca(local1333, local1339) - arg1.ca(local1333, local1339);
											} else if (arg3 != null && !Static269.aBooleanArrayArray3[local82][local1247]) {
												local1333 = local1284 + (local27 << 7);
												local1339 = local1279 + (local43 << 7);
												local978[local936] = arg3.ca(local1333, local1339) - arg4.ca(local1333, local1339);
											}
										}
										if (local1247 < 8 && local147.anInt6336 < Static219.anIntArray527[local1255]) {
											if (local947 != null) {
												local947[local936] = Static24.anIntArray36[local1255];
											}
											local962[local936] = Static87.anIntArray646[local1255];
											local959[local936] = Static276.anIntArray390[local1255];
											local956[local936] = Static366.anIntArray529[local1255];
										} else {
											if (local947 != null) {
												local947[local936] = local1006;
											}
											local959[local936] = arg2.method5538() ? local147.anInt6328 : local147.anInt6337;
											local962[local936] = local147.anInt6341;
											local956[local936] = local980;
										}
										local936++;
									}
								}
								if (!this.aBoolean408 && arg5 == 0) {
									Static429.method5374(local27, local43, local147.anInt6339, local147.anInt6338 * 8, local147.anInt6333);
								}
								if (local82 != 12 && local147.anInt6331 != -1 && local147.aBoolean454) {
									local71 = true;
								}
							} else if (local796) {
								local934 = Static348.anIntArray515[local82];
							} else if (local73) {
								local934 = Static391.anIntArray548[local82];
							} else {
								local934 = Static388.anIntArray414[local82];
							}
							if (local168 != null) {
								if (local128 == 0) {
									local128 = local104;
								}
								if (local120 == 0) {
									local120 = local104;
								}
								if (local112 == 0) {
									local112 = local104;
								}
								@Pc(1580) Class269 local1580 = this.aClass153_5.method3081(local104 - 1);
								@Pc(1588) Class269 local1588 = this.aClass153_5.method3081(local112 - 1);
								@Pc(1596) Class269 local1596 = this.aClass153_5.method3081(local120 - 1);
								@Pc(1604) Class269 local1604 = this.aClass153_5.method3081(local128 - 1);
								for (local1255 = 0; local1255 < local357; local1255++) {
									if (local76[-local88 & 0x3] && local798[0] == local934) {
										Static203.anIntArray299[0] = local822[local934];
										Static203.anIntArray299[1] = 1;
										Static203.anIntArray299[2] = local806[local934];
										Static203.anIntArray299[3] = 1;
										Static203.anIntArray299[4] = local834[local934];
										local1062 = 6;
										Static203.anIntArray299[5] = local806[local934];
									} else if (local76[2 - local88 & 0x3] && local798[2] == local934) {
										Static203.anIntArray299[0] = local822[local934];
										Static203.anIntArray299[1] = 5;
										Static203.anIntArray299[2] = local806[local934];
										Static203.anIntArray299[3] = 5;
										Static203.anIntArray299[4] = local834[local934];
										local1062 = 6;
										Static203.anIntArray299[5] = local806[local934];
									} else if (local76[1 - local88 & 0x3] && local934 == local798[1]) {
										Static203.anIntArray299[0] = local822[local934];
										Static203.anIntArray299[1] = 3;
										Static203.anIntArray299[2] = local806[local934];
										Static203.anIntArray299[3] = 3;
										Static203.anIntArray299[4] = local834[local934];
										local1062 = 6;
										Static203.anIntArray299[5] = local806[local934];
									} else if (local76[3 - local88 & 0x3] && local798[3] == local934) {
										Static203.anIntArray299[0] = local822[local934];
										Static203.anIntArray299[1] = 7;
										Static203.anIntArray299[2] = local806[local934];
										Static203.anIntArray299[3] = 7;
										Static203.anIntArray299[4] = local834[local934];
										Static203.anIntArray299[5] = local806[local934];
										local1062 = 6;
									} else {
										Static203.anIntArray299[0] = local822[local934];
										Static203.anIntArray299[1] = local834[local934];
										local1062 = 3;
										Static203.anIntArray299[2] = local806[local934];
									}
									for (local1260 = 0; local1260 < local1062; local1260++) {
										local1284 = Static203.anIntArray299[local1260];
										local1265 = local1284 - local88 * 2 & 0x7;
										local1279 = this.anIntArray473[local1284];
										local1339 = this.anIntArray474[local1284];
										@Pc(1869) int local1869;
										if (local88 == 1) {
											local1869 = 128 - local1279;
											local1333 = local1339;
										} else if (local88 == 2) {
											local1333 = 128 - local1279;
											local1869 = 128 - local1339;
										} else if (local88 == 3) {
											local1869 = local1279;
											local1333 = 128 - local1339;
										} else {
											local1869 = local1339;
											local1333 = local1279;
										}
										local950[local936] = local1333;
										local953[local936] = local1869;
										@Pc(1927) int local1927;
										@Pc(1933) int local1933;
										if (local969 != null && Static346.aBooleanArrayArray5[local82][local1284]) {
											local1927 = local1333 + (local27 << 7);
											local1933 = local1869 + (local43 << 7);
											local969[local936] = arg1.ca(local1927, local1933) - arg4.ca(local1927, local1933);
										}
										if (local978 != null) {
											if (arg1 != null && !Static346.aBooleanArrayArray5[local82][local1284]) {
												local1927 = (local27 << 7) + local1333;
												local1933 = local1869 + (local43 << 7);
												local978[local936] = arg4.ca(local1927, local1933) - arg1.ca(local1927, local1933);
											} else if (arg3 != null && !Static269.aBooleanArrayArray3[local82][local1284]) {
												local1927 = (local27 << 7) + local1333;
												local1933 = local1869 + (local43 << 7);
												local978[local936] = arg3.ca(local1927, local1933) - arg4.ca(local1927, local1933);
											}
										}
										if (local1284 < 8 && Static219.anIntArray527[local1265] >= 0) {
											if (local947 != null) {
												local947[local936] = Static24.anIntArray36[local1265];
											}
											local962[local936] = Static87.anIntArray646[local1265];
											local959[local936] = Static276.anIntArray390[local1265];
											local956[local936] = Static366.anIntArray529[local1265];
										} else {
											if (local73 && Static346.aBooleanArrayArray5[local82][local1284]) {
												local959[local936] = local982;
												local962[local936] = local984;
												local956[local936] = local980;
											} else if (local1333 == 0 && local1869 == 0) {
												local956[local936] = arg0[local27][local43];
												local959[local936] = local1580.anInt7207;
												local962[local936] = local1580.anInt7202;
											} else if (local1333 == 0 && local1869 == 128) {
												local956[local936] = arg0[local27][local57];
												local959[local936] = local1588.anInt7207;
												local962[local936] = local1588.anInt7202;
											} else if (local1333 == 128 && local1869 == 128) {
												local956[local936] = arg0[local41][local57];
												local959[local936] = local1596.anInt7207;
												local962[local936] = local1596.anInt7202;
											} else if (local1333 == 128 && local1869 == 0) {
												local956[local936] = arg0[local41][local43];
												local959[local936] = local1604.anInt7207;
												local962[local936] = local1604.anInt7202;
											} else {
												if (local1333 < 64) {
													if (local1869 >= 64) {
														local959[local936] = local1588.anInt7207;
														local962[local936] = local1588.anInt7202;
													} else {
														local959[local936] = local1580.anInt7207;
														local962[local936] = local1580.anInt7202;
													}
												} else if (local1869 >= 64) {
													local959[local936] = local1596.anInt7207;
													local962[local936] = local1596.anInt7202;
												} else {
													local959[local936] = local1604.anInt7207;
													local962[local936] = local1604.anInt7202;
												}
												local1927 = Static108.method1677(arg0[local27][local43], local1333 << 7 >> 7, arg0[local41][local43]);
												local1933 = Static108.method1677(arg0[local27][local57], local1333 << 7 >> 7, arg0[local41][local57]);
												local956[local936] = Static108.method1677(local1927, local1869 << 7 >> 7, local1933);
											}
											if (local947 != null) {
												local947[local936] = local956[local936];
											}
										}
										local936++;
									}
									local934++;
								}
								if (local82 != 0 && local168.aBoolean523) {
									local71 = true;
								}
							}
							local1006 = arg4.ua(local27, local43);
							local1008 = arg4.ua(local41, local43);
							local1241 = arg4.ua(local41, local57);
							local1247 = arg4.ua(local27, local57);
							if (arg5 > 0) {
								@Pc(2362) boolean local2362 = true;
								if (local104 == 0 && local82 != 0) {
									local2362 = false;
								}
								if (local96 > 0 && local170 != null && !local170.aBoolean453) {
									local2362 = false;
								}
								if (local2362 && local1006 == local1008 && local1241 == local1006 && local1247 == local1006) {
									this.aByteArrayArrayArray14[arg5][local27][local43] = (byte) (this.aByteArrayArrayArray14[arg5][local27][local43] | 0x4);
								}
							}
							local1255 = 0;
							local1260 = 0;
							local1284 = 0;
							if (this.aBoolean408) {
								local1255 = Static196.method2644(local27, local43);
								local1260 = Static2.method8(local27, local43);
								local1284 = Static270.method3647(local27, local43);
							}
							arg4.pa(local27, local43, local950, local969, local953, local978, local956, local947, local959, local962, local1255, local1260, local1284, local71);
							Static345.method4603(arg5, local27, local43);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IBIIII)V")
	private void method4305(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(13) int local13;
		for (@Pc(3) int local3 = arg2; local3 < arg2 + 64; local3++) {
			for (local13 = arg0; local13 < arg0 + 64; local13++) {
				if (local13 >= 0 && this.anInt5448 > local13 && local3 >= 0 && local3 < this.anInt5434) {
					this.anIntArrayArrayArray11[arg1][local13][local3] = arg1 > 0 ? this.anIntArrayArrayArray11[arg1 - 1][local13][local3] - 240 : 0;
				}
			}
		}
		if (arg0 > 0 && this.anInt5448 > arg0) {
			for (local13 = arg2 + 1; local13 < arg2 + 64; local13++) {
				if (local13 >= 0 && local13 < this.anInt5434) {
					this.anIntArrayArrayArray11[arg1][arg0][local13] = this.anIntArrayArrayArray11[arg1][arg0 - 1][local13];
				}
			}
		}
		if (arg2 > 0 && arg2 < this.anInt5434) {
			for (local13 = arg0 + 1; local13 < arg0 + 64; local13++) {
				if (local13 >= 0 && local13 < this.anInt5448) {
					this.anIntArrayArrayArray11[arg1][local13][arg2] = this.anIntArrayArrayArray11[arg1][local13][arg2 - 1];
				}
			}
		}
		if (arg0 < 0 || arg2 < 0 || this.anInt5448 <= arg0 || this.anInt5434 <= arg2) {
			return;
		}
		if (arg1 == 0) {
			if (arg0 > 0 && this.anIntArrayArrayArray11[arg1][arg0 - 1][arg2] != 0) {
				this.anIntArrayArrayArray11[arg1][arg0][arg2] = this.anIntArrayArrayArray11[arg1][arg0 - 1][arg2];
				return;
			}
			if (arg2 > 0 && this.anIntArrayArrayArray11[arg1][arg0][arg2 - 1] != 0) {
				this.anIntArrayArrayArray11[arg1][arg0][arg2] = this.anIntArrayArrayArray11[arg1][arg0][arg2 - 1];
				return;
			}
			if (arg0 > 0 && arg2 > 0 && this.anIntArrayArrayArray11[arg1][arg0 - 1][arg2 - 1] != 0) {
				this.anIntArrayArrayArray11[arg1][arg0][arg2] = this.anIntArrayArrayArray11[arg1][arg0 - 1][arg2 - 1];
				return;
			}
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray11[arg1][arg0 - 1][arg2] != this.anIntArrayArrayArray11[arg1 - 1][arg0 - 1][arg2]) {
			this.anIntArrayArrayArray11[arg1][arg0][arg2] = this.anIntArrayArrayArray11[arg1][arg0 - 1][arg2];
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray11[arg1 - 1][arg0][arg2 - 1] != this.anIntArrayArrayArray11[arg1][arg0][arg2 - 1]) {
			this.anIntArrayArrayArray11[arg1][arg0][arg2] = this.anIntArrayArrayArray11[arg1][arg0][arg2 - 1];
			return;
		}
		if (arg0 > 0 && arg2 > 0 && this.anIntArrayArrayArray11[arg1 - 1][arg0 - 1][arg2 - 1] != this.anIntArrayArrayArray11[arg1][arg0 - 1][arg2 - 1]) {
			this.anIntArrayArrayArray11[arg1][arg0][arg2] = this.anIntArrayArrayArray11[arg1][arg0 - 1][arg2 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IILclient!sv;IZIIIIII)V")
	private void method4306(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == 1) {
			arg5 = 1;
		} else if (arg0 == 2) {
			arg5 = 1;
			arg7 = 1;
		} else if (arg0 == 3) {
			arg7 = 1;
		}
		@Pc(51) int local51;
		if (arg6 < 0 || arg6 >= this.anInt5448 || arg9 < 0 || this.anInt5434 <= arg9) {
			while (true) {
				local51 = arg1.method3580();
				if (local51 == 0) {
					break;
				}
				if (local51 == 1) {
					arg1.method3580();
					break;
				}
				if (local51 <= 49) {
					arg1.method3580();
				}
			}
			return;
		}
		if (!this.aBoolean408 && !arg3) {
			Static253.aByteArrayArrayArray11[arg2][arg6][arg9] = 0;
		}
		while (true) {
			local51 = arg1.method3580();
			if (local51 == 0) {
				if (this.aBoolean408) {
					this.anIntArrayArrayArray11[0][arg7 + arg6][arg9 + arg5] = 0;
				} else if (arg2 == 0) {
					this.anIntArrayArrayArray11[0][arg7 + arg6][arg5 + arg9] = -Static261.method1849(arg8 + 932731, arg4 + 556238) * 8 << 0;
				} else {
					this.anIntArrayArrayArray11[arg2][arg6 + arg7][arg5 + arg9] = this.anIntArrayArrayArray11[arg2 - 1][arg7 + arg6][arg5 + arg9] - 240;
				}
				break;
			}
			if (local51 == 1) {
				@Pc(192) int local192 = arg1.method3580();
				if (this.aBoolean408) {
					this.anIntArrayArrayArray11[0][arg6 + arg7][arg9 + arg5] = local192 * 8 << 0;
				} else {
					if (local192 == 1) {
						local192 = 0;
					}
					if (arg2 == 0) {
						this.anIntArrayArrayArray11[0][arg6 + arg7][arg9 + arg5] = -local192 * 8 << 0;
					} else {
						this.anIntArrayArrayArray11[arg2][arg7 + arg6][arg9 + arg5] = this.anIntArrayArrayArray11[arg2 - 1][arg7 + arg6][arg9 + arg5] - (local192 * 8 << 0);
					}
				}
				break;
			}
			if (local51 <= 49) {
				if (arg3) {
					arg1.method3580();
				} else {
					this.aByteArrayArrayArray15[arg2][arg6][arg9] = arg1.method3605();
					this.aByteArrayArrayArray16[arg2][arg6][arg9] = (byte) ((local51 - 2) / 4);
					this.aByteArrayArrayArray12[arg2][arg6][arg9] = (byte) (local51 + arg0 - 2 & 0x3);
				}
			} else if (local51 <= 81) {
				if (!this.aBoolean408 && !arg3) {
					Static253.aByteArrayArrayArray11[arg2][arg6][arg9] = (byte) (local51 - 49);
				}
			} else if (!arg3) {
				this.aByteArrayArrayArray17[arg2][arg6][arg9] = (byte) (local51 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!ya;Lclient!za;ILclient!ya;)V")
	public final void method4307(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Class163 arg1, @OriginalArg(3) Class162 arg2) {
		@Pc(15) int[][] local15 = new int[this.anInt5448][this.anInt5434];
		if (Static300.anIntArray418 == null || this.anInt5434 != Static300.anIntArray418.length) {
			Static12.anIntArray16 = new int[this.anInt5434];
			Static281.anIntArray393 = new int[this.anInt5434];
			Static300.anIntArray418 = new int[this.anInt5434];
			Static137.anIntArray556 = new int[this.anInt5434];
			Static357.anIntArray503 = new int[this.anInt5434];
		}
		@Pc(48) int local48;
		for (@Pc(44) int local44 = 0; local44 < this.anInt5443; local44++) {
			for (local48 = 0; local48 < this.anInt5434; local48++) {
				Static300.anIntArray418[local48] = 0;
				Static357.anIntArray503[local48] = 0;
				Static137.anIntArray556[local48] = 0;
				Static281.anIntArray393[local48] = 0;
				Static12.anIntArray16[local48] = 0;
			}
			for (@Pc(81) int local81 = -5; local81 < this.anInt5448; local81++) {
				@Pc(91) int local91;
				@Pc(106) int local106;
				@Pc(172) int local172;
				for (@Pc(85) int local85 = 0; local85 < this.anInt5434; local85++) {
					local91 = local81 + 5;
					@Pc(152) int local152;
					if (this.anInt5448 > local91) {
						local106 = this.aByteArrayArrayArray17[local44][local91][local85] & 0xFF;
						if (local106 > 0) {
							@Pc(116) Class269 local116 = this.aClass153_5.method3081(local106 - 1);
							Static300.anIntArray418[local85] += local116.anInt7208;
							Static357.anIntArray503[local85] += local116.anInt7200;
							Static137.anIntArray556[local85] += local116.anInt7198;
							Static281.anIntArray393[local85] += local116.anInt7199;
							local152 = Static12.anIntArray16[local85]++;
						}
					}
					local106 = local81 - 5;
					if (local106 >= 0) {
						local172 = this.aByteArrayArrayArray17[local44][local106][local85] & 0xFF;
						if (local172 > 0) {
							@Pc(185) Class269 local185 = this.aClass153_5.method3081(local172 - 1);
							Static300.anIntArray418[local85] -= local185.anInt7208;
							Static357.anIntArray503[local85] -= local185.anInt7200;
							Static137.anIntArray556[local85] -= local185.anInt7198;
							Static281.anIntArray393[local85] -= local185.anInt7199;
							local152 = Static12.anIntArray16[local85]--;
						}
					}
				}
				if (local81 >= 0) {
					local91 = 0;
					local106 = 0;
					local172 = 0;
					@Pc(239) int local239 = 0;
					@Pc(241) int local241 = 0;
					for (@Pc(243) int local243 = -5; local243 < this.anInt5434; local243++) {
						@Pc(249) int local249 = local243 + 5;
						if (this.anInt5434 > local249) {
							local91 += Static300.anIntArray418[local249];
							local106 += Static357.anIntArray503[local249];
							local239 += Static281.anIntArray393[local249];
							local172 += Static137.anIntArray556[local249];
							local241 += Static12.anIntArray16[local249];
						}
						@Pc(291) int local291 = local243 - 5;
						if (local291 >= 0) {
							local91 -= Static300.anIntArray418[local291];
							local241 -= Static12.anIntArray16[local291];
							local172 -= Static137.anIntArray556[local291];
							local106 -= Static357.anIntArray503[local291];
							local239 -= Static281.anIntArray393[local291];
						}
						if (local243 >= 0 && local239 > 0 && local241 > 0) {
							local15[local81][local243] = Static189.method2545(local172 / local241, local106 / local241, local91 * 256 / local239);
						}
					}
				}
			}
			if (Static212.aBoolean215) {
				this.method4304(local15, local44 == 0 ? arg2 : null, arg1, local44 == 0 ? arg0 : null, Static345.aClass162Array3[local44], local44);
			} else {
				this.method4299(arg1, local44 == 0 ? arg0 : null, local15, Static345.aClass162Array3[local44], local44, local44 == 0 ? arg2 : null);
			}
			this.aByteArrayArrayArray17[local44] = null;
			this.aByteArrayArrayArray15[local44] = null;
			this.aByteArrayArrayArray16[local44] = null;
			this.aByteArrayArrayArray12[local44] = null;
		}
		if (!this.aBoolean408) {
			if (Static235.anInt3809 != 0) {
				Static31.method465();
			}
			if (Static302.aBoolean346) {
				Static284.method3773();
			}
		}
		for (local48 = 0; local48 < this.anInt5443; local48++) {
			Static345.aClass162Array3[local48].aa();
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIBIILclient!sv;[Lclient!et;)V")
	public final void method4308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class2_Sub13 arg4, @OriginalArg(6) Class71[] arg5) {
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(25) int local25;
		if (!this.aBoolean408) {
			for (local6 = 0; local6 < 4; local6++) {
				@Pc(12) Class71 local12 = arg5[local6];
				for (local14 = 0; local14 < 64; local14++) {
					for (local18 = 0; local18 < 64; local18++) {
						local25 = arg3 + local14;
						@Pc(29) int local29 = local18 + arg2;
						if (local25 >= 0 && local25 < this.anInt5448 && local29 >= 0 && local29 < this.anInt5434) {
							local12.method1616(local29, local25);
						}
					}
				}
			}
		}
		local6 = arg0 + arg3;
		@Pc(88) int local88 = arg1 + arg2;
		for (local14 = 0; local14 < this.anInt5443; local14++) {
			for (local18 = 0; local18 < 64; local18++) {
				for (local25 = 0; local25 < 64; local25++) {
					this.method4306(0, arg4, local14, false, local88 + local25, 0, local18 + arg3, 0, local6 + local18, local25 - -arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "([[BI[[BII[ZLclient!za;IILclient!tf;[[BLclient!wm;II)V")
	private void method4309(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean[] arg5, @OriginalArg(6) Class163 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class233 arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) Class269 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(18) boolean[] local18 = arg8 != null && arg8.aBoolean452 ? Static149.aBooleanArrayArray2[arg3] : Static281.aBooleanArrayArray4[arg3];
		@Pc(37) int local37;
		@Pc(50) Class233 local50;
		@Pc(67) byte local67;
		@Pc(83) int local83;
		@Pc(88) int local88;
		if (arg4 > 0) {
			if (arg1 > 0) {
				local37 = arg0[arg1 - 1][arg4 - 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass218_6.method4676(local37 - 1);
					if (local50.anInt6331 != -1 && local50.aBoolean452) {
						local67 = arg9[arg1 - 1][arg4 - 1];
						local83 = arg2[arg1 - 1][arg4 - 1] * 2 + 4 & 0x7;
						local88 = Static126.method439(arg6, local50);
						if (Static346.aBooleanArrayArray5[local67][local83]) {
							Static366.anIntArray529[0] = local50.anInt6331;
							Static24.anIntArray36[0] = local88;
							Static276.anIntArray390[0] = arg6.method5538() ? local50.anInt6328 : local50.anInt6337;
							Static87.anIntArray646[0] = local50.anInt6341;
							Static219.anIntArray527[0] = local50.anInt6336;
							Static322.anIntArray482[0] = 256;
						}
					}
				}
			}
			if (arg1 < arg11 - 1) {
				local37 = arg0[arg1 + 1][arg4 - 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass218_6.method4676(local37 - 1);
					if (local50.anInt6331 != -1 && local50.aBoolean452) {
						local67 = arg9[arg1 + 1][arg4 - 1];
						local83 = arg2[arg1 + 1][arg4 - 1] * 2 + 6 & 0x7;
						local88 = Static126.method439(arg6, local50);
						if (Static346.aBooleanArrayArray5[local67][local83]) {
							Static366.anIntArray529[2] = local50.anInt6331;
							Static24.anIntArray36[2] = local88;
							Static276.anIntArray390[2] = arg6.method5538() ? local50.anInt6328 : local50.anInt6337;
							Static87.anIntArray646[2] = local50.anInt6341;
							Static219.anIntArray527[2] = local50.anInt6336;
							Static322.anIntArray482[2] = 512;
						}
					}
				}
			}
		}
		if (arg7 - 1 > arg4) {
			if (arg1 > 0) {
				local37 = arg0[arg1 - 1][arg4 + 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass218_6.method4676(local37 - 1);
					if (local50.anInt6331 != -1 && local50.aBoolean452) {
						local67 = arg9[arg1 - 1][arg4 + 1];
						local83 = arg2[arg1 - 1][arg4 + 1] * 2 + 2 & 0x7;
						local88 = Static126.method439(arg6, local50);
						if (Static346.aBooleanArrayArray5[local67][local83]) {
							Static366.anIntArray529[6] = local50.anInt6331;
							Static24.anIntArray36[6] = local88;
							Static276.anIntArray390[6] = arg6.method5538() ? local50.anInt6328 : local50.anInt6337;
							Static87.anIntArray646[6] = local50.anInt6341;
							Static219.anIntArray527[6] = local50.anInt6336;
							Static322.anIntArray482[6] = 64;
						}
					}
				}
			}
			if (arg11 - 1 > arg1) {
				local37 = arg0[arg1 + 1][arg4 + 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass218_6.method4676(local37 - 1);
					if (local50.anInt6331 != -1 && local50.aBoolean452) {
						local67 = arg9[arg1 + 1][arg4 + 1];
						local83 = arg2[arg1 + 1][arg4 + 1] * 2 & 0x7;
						local88 = Static126.method439(arg6, local50);
						if (Static346.aBooleanArrayArray5[local67][local83]) {
							Static366.anIntArray529[4] = local50.anInt6331;
							Static24.anIntArray36[4] = local88;
							Static276.anIntArray390[4] = arg6.method5538() ? local50.anInt6328 : local50.anInt6337;
							Static87.anIntArray646[4] = local50.anInt6341;
							Static219.anIntArray527[4] = local50.anInt6336;
							Static322.anIntArray482[4] = 128;
						}
					}
				}
			}
		}
		@Pc(523) int local523;
		@Pc(528) int local528;
		@Pc(530) int local530;
		@Pc(512) byte local512;
		if (arg4 > 0) {
			local37 = arg0[arg1][arg4 - 1] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass218_6.method4676(local37 - 1);
				if (local50.anInt6331 != -1) {
					local67 = arg9[arg1][arg4 - 1];
					local512 = arg2[arg1][arg4 - 1];
					if (local50.aBoolean452) {
						local88 = 2;
						local523 = local512 * 2 + 4;
						local528 = Static126.method439(arg6, local50);
						for (local530 = 0; local530 < 3; local530++) {
							local88 &= 0x7;
							local523 &= 0x7;
							if (Static346.aBooleanArrayArray5[local67][local523] && Static219.anIntArray527[local88] <= local50.anInt6336) {
								Static366.anIntArray529[local88] = local50.anInt6331;
								Static24.anIntArray36[local88] = local528;
								Static276.anIntArray390[local88] = arg6.method5538() ? local50.anInt6328 : local50.anInt6337;
								Static87.anIntArray646[local88] = local50.anInt6341;
								if (local50.anInt6336 == Static219.anIntArray527[local88]) {
									Static322.anIntArray482[local88] |= 0x20;
								} else {
									Static322.anIntArray482[local88] = 32;
								}
								Static219.anIntArray527[local88] = local50.anInt6336;
							}
							local523++;
							local88--;
						}
						if (!local18[arg12 & 0x3]) {
							arg5[0] = Static149.aBooleanArrayArray2[local67][local512 + 2 & 0x3];
						}
					} else if (!local18[--arg12 & 0x3]) {
						arg5[0] = Static281.aBooleanArrayArray4[local67][local512 + 2 & 0x3];
					}
				}
			}
		}
		if (arg7 - 1 > arg4) {
			local37 = arg0[arg1][arg4 + 1] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass218_6.method4676(local37 - 1);
				if (local50.anInt6331 != -1) {
					local67 = arg9[arg1][arg4 + 1];
					local512 = arg2[arg1][arg4 + 1];
					if (local50.aBoolean452) {
						local88 = 4;
						local523 = local512 * 2 + 2;
						local528 = Static126.method439(arg6, local50);
						for (local530 = 0; local530 < 3; local530++) {
							local88 &= 0x7;
							local523 &= 0x7;
							if (Static346.aBooleanArrayArray5[local67][local523] && Static219.anIntArray527[local88] <= local50.anInt6336) {
								Static366.anIntArray529[local88] = local50.anInt6331;
								Static24.anIntArray36[local88] = local528;
								Static276.anIntArray390[local88] = arg6.method5538() ? local50.anInt6328 : local50.anInt6337;
								Static87.anIntArray646[local88] = local50.anInt6341;
								if (Static219.anIntArray527[local88] == local50.anInt6336) {
									Static322.anIntArray482[local88] |= 0x10;
								} else {
									Static322.anIntArray482[local88] = 16;
								}
								Static219.anIntArray527[local88] = local50.anInt6336;
							}
							local88++;
							local523--;
						}
						if (!local18[arg12 + 2 & 0x3]) {
							arg5[2] = Static149.aBooleanArrayArray2[local67][local512 & 0x3];
						}
					} else if (!local18[arg12 + 2 & 0x3]) {
						arg5[2] = Static281.aBooleanArrayArray4[local67][local512 & 0x3];
					}
				}
			}
		}
		if (arg1 > 0) {
			local37 = arg0[arg1 - 1][arg4] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass218_6.method4676(local37 - 1);
				if (local50.anInt6331 != -1) {
					local67 = arg9[arg1 - 1][arg4];
					local512 = arg2[arg1 - 1][arg4];
					if (local50.aBoolean452) {
						local88 = 6;
						local523 = local512 * 2 + 4;
						local528 = Static126.method439(arg6, local50);
						for (local530 = 0; local530 < 3; local530++) {
							local88 &= 0x7;
							local523 &= 0x7;
							if (Static346.aBooleanArrayArray5[local67][local523] && local50.anInt6336 >= Static219.anIntArray527[local88]) {
								Static366.anIntArray529[local88] = local50.anInt6331;
								Static24.anIntArray36[local88] = local528;
								Static276.anIntArray390[local88] = arg6.method5538() ? local50.anInt6328 : local50.anInt6337;
								Static87.anIntArray646[local88] = local50.anInt6341;
								if (local50.anInt6336 == Static219.anIntArray527[local88]) {
									Static322.anIntArray482[local88] |= 0x8;
								} else {
									Static322.anIntArray482[local88] = 8;
								}
								Static219.anIntArray527[local88] = local50.anInt6336;
							}
							local88++;
							local523--;
						}
						if (!local18[arg12 + 3 & 0x3]) {
							arg5[3] = Static149.aBooleanArrayArray2[local67][local512 + 1 & 0x3];
						}
					} else if (!local18[arg12 + 3 & 0x3]) {
						arg5[3] = Static281.aBooleanArrayArray4[local67][local512 + 1 & 0x3];
					}
				}
			}
		}
		if (arg11 - 1 > arg1) {
			local37 = arg0[arg1 + 1][arg4] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass218_6.method4676(local37 - 1);
				if (local50.anInt6331 != -1) {
					local67 = arg9[arg1 + 1][arg4];
					local512 = arg2[arg1 + 1][arg4];
					if (local50.aBoolean452) {
						local88 = 4;
						local523 = local512 * 2 + 6;
						local528 = Static126.method439(arg6, local50);
						for (local530 = 0; local530 < 3; local530++) {
							local523 &= 0x7;
							local88 &= 0x7;
							if (Static346.aBooleanArrayArray5[local67][local523] && local50.anInt6336 >= Static219.anIntArray527[local88]) {
								Static366.anIntArray529[local88] = local50.anInt6331;
								Static24.anIntArray36[local88] = local528;
								Static276.anIntArray390[local88] = arg6.method5538() ? local50.anInt6328 : local50.anInt6337;
								Static87.anIntArray646[local88] = local50.anInt6341;
								if (local50.anInt6336 == Static219.anIntArray527[local88]) {
									Static322.anIntArray482[local88] |= 0x4;
								} else {
									Static322.anIntArray482[local88] = 4;
								}
								Static219.anIntArray527[local88] = local50.anInt6336;
							}
							local88--;
							local523++;
						}
						if (!local18[arg12 + 1 & 0x3]) {
							arg5[1] = Static149.aBooleanArrayArray2[local67][local512 + 3 & 0x3];
						}
					} else if (!local18[arg12 + 1 & 0x3]) {
						arg5[1] = Static281.aBooleanArrayArray4[local67][local512 + 3 & 0x3];
					}
				}
			}
		}
		if (arg8 == null) {
			return;
		}
		local37 = Static126.method439(arg6, arg8);
		if (!arg8.aBoolean452) {
			return;
		}
		for (@Pc(1251) int local1251 = 0; local1251 < 8; local1251++) {
			@Pc(1262) int local1262 = local1251 - arg12 * 2 & 0x7;
			if (Static346.aBooleanArrayArray5[arg3][local1251] && arg8.anInt6336 >= Static219.anIntArray527[local1262]) {
				Static366.anIntArray529[local1262] = arg8.anInt6331;
				Static24.anIntArray36[local1262] = local37;
				Static276.anIntArray390[local1262] = arg6.method5538() ? arg8.anInt6328 : arg8.anInt6337;
				Static87.anIntArray646[local1262] = arg8.anInt6341;
				if (Static219.anIntArray527[local1262] == arg8.anInt6336) {
					Static322.anIntArray482[local1262] |= 0x2;
				} else {
					Static322.anIntArray482[local1262] = 2;
				}
				Static219.anIntArray527[local1262] = arg8.anInt6336;
			}
		}
		return;
	}
}
