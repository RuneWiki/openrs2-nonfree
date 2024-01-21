import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class18 {

	@OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
	private int anInt677 = 0;

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
	private int anInt676 = 0;

	@OriginalMember(owner = "client!ed", name = "H", descriptor = "[Lclient!c;")
	private final Class10[] aClass10Array3 = new Class10[5000];

	@OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
	private int anInt687 = 0;

	@OriginalMember(owner = "client!ed", name = "Q", descriptor = "[I")
	private final int[] anIntArray128 = new int[10000];

	@OriginalMember(owner = "client!ed", name = "S", descriptor = "[[I")
	private final int[][] anIntArrayArray25 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!ed", name = "T", descriptor = "[I")
	private final int[] anIntArray129 = new int[10000];

	@OriginalMember(owner = "client!ed", name = "gb", descriptor = "[[I")
	private final int[][] anIntArrayArray26 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
	private final int anInt670;

	@OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
	private final int anInt674;

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
	private final int anInt669;

	@OriginalMember(owner = "client!ed", name = "P", descriptor = "[[[Lclient!dc;")
	private final Class3_Sub5[][][] aClass3_Sub5ArrayArrayArray1;

	@OriginalMember(owner = "client!ed", name = "x", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!ed", name = "G", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(III[[[I)V")
	public Class18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt670 = arg0;
		this.anInt674 = arg1;
		this.anInt669 = arg2;
		this.aClass3_Sub5ArrayArrayArray1 = new Class3_Sub5[arg0][arg1][arg2];
		this.anIntArrayArrayArray2 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray3 = arg3;
		this.method519();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)Z")
	private boolean method491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray2[arg0][arg1][arg2];
		if (local8 == -Static26.anInt660) {
			return false;
		} else if (local8 == Static26.anInt660) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method537(local23 + 1, this.anIntArrayArrayArray3[arg0][arg1][arg2], local27 + 1) && this.method537(local23 + 128 - 1, this.anIntArrayArrayArray3[arg0][arg1 + 1][arg2], local27 + 1) && this.method537(local23 + 128 - 1, this.anIntArrayArrayArray3[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method537(local23 + 1, this.anIntArrayArrayArray3[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray2[arg0][arg1][arg2] = Static26.anInt660;
				return true;
			} else {
				this.anIntArrayArrayArray2[arg0][arg1][arg2] = -Static26.anInt660;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(III)V")
	public void method492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub5 local8 = this.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass43_1 = null;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIII)V")
	public void method493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt674 * 128) {
			arg0 = this.anInt674 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt669 * 128) {
			arg2 = this.anInt669 * 128 - 1;
		}
		Static26.anInt660++;
		Static26.anInt681 = Static21.anIntArray99[arg3];
		Static26.anInt675 = Static21.anIntArray96[arg3];
		Static26.anInt663 = Static21.anIntArray99[arg4];
		Static26.anInt680 = Static21.anIntArray96[arg4];
		Static26.aBooleanArrayArray1 = Static26.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static26.anInt666 = arg0;
		Static26.anInt665 = arg1;
		Static26.anInt668 = arg2;
		Static26.anInt686 = arg0 / 128;
		Static26.anInt673 = arg2 / 128;
		Static26.anInt679 = arg5;
		Static26.anInt682 = Static26.anInt686 - 25;
		if (Static26.anInt682 < 0) {
			Static26.anInt682 = 0;
		}
		Static26.anInt685 = Static26.anInt673 - 25;
		if (Static26.anInt685 < 0) {
			Static26.anInt685 = 0;
		}
		Static26.anInt684 = Static26.anInt686 + 25;
		if (Static26.anInt684 > this.anInt674) {
			Static26.anInt684 = this.anInt674;
		}
		Static26.anInt661 = Static26.anInt673 + 25;
		if (Static26.anInt661 > this.anInt669) {
			Static26.anInt661 = this.anInt669;
		}
		this.method520();
		Static26.anInt667 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt676; local128 < this.anInt670; local128++) {
			@Pc(134) Class3_Sub5[][] local134 = this.aClass3_Sub5ArrayArrayArray1[local128];
			for (local136 = Static26.anInt682; local136 < Static26.anInt684; local136++) {
				for (local139 = Static26.anInt685; local139 < Static26.anInt661; local139++) {
					@Pc(146) Class3_Sub5 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt448 <= arg5 && (Static26.aBooleanArrayArray1[local136 + 25 - Static26.anInt686][local139 + 25 - Static26.anInt673] || this.anIntArrayArrayArray3[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean27 = true;
							local146.aBoolean25 = true;
							if (local146.anInt452 > 0) {
								local146.aBoolean26 = true;
							} else {
								local146.aBoolean26 = false;
							}
							Static26.anInt667++;
						} else {
							local146.aBoolean27 = false;
							local146.aBoolean25 = false;
							local146.anInt457 = 0;
						}
					}
				}
			}
		}
		@Pc(241) int local241;
		@Pc(249) int local249;
		@Pc(254) int local254;
		@Pc(258) int local258;
		@Pc(237) int local237;
		for (@Pc(224) int local224 = this.anInt676; local224 < this.anInt670; local224++) {
			@Pc(230) Class3_Sub5[][] local230 = this.aClass3_Sub5ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static26.anInt686 + local139;
				local241 = Static26.anInt686 - local139;
				if (local237 >= Static26.anInt682 || local241 < Static26.anInt684) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static26.anInt673 + local249;
						local258 = Static26.anInt673 - local249;
						@Pc(270) Class3_Sub5 local270;
						if (local237 >= Static26.anInt682) {
							if (local254 >= Static26.anInt685) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean27) {
									this.method511(local270, true);
								}
							}
							if (local258 < Static26.anInt661) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean27) {
									this.method511(local270, true);
								}
							}
						}
						if (local241 < Static26.anInt684) {
							if (local254 >= Static26.anInt685) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean27) {
									this.method511(local270, true);
								}
							}
							if (local258 < Static26.anInt661) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean27) {
									this.method511(local270, true);
								}
							}
						}
						if (Static26.anInt667 == 0) {
							Static26.aBoolean37 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt676; local136 < this.anInt670; local136++) {
			@Pc(361) Class3_Sub5[][] local361 = this.aClass3_Sub5ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static26.anInt686 + local237;
				local249 = Static26.anInt686 - local237;
				if (local241 >= Static26.anInt682 || local249 < Static26.anInt684) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static26.anInt673 + local254;
						@Pc(389) int local389 = Static26.anInt673 - local254;
						@Pc(401) Class3_Sub5 local401;
						if (local241 >= Static26.anInt682) {
							if (local258 >= Static26.anInt685) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean27) {
									this.method511(local401, false);
								}
							}
							if (local389 < Static26.anInt661) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean27) {
									this.method511(local401, false);
								}
							}
						}
						if (local249 < Static26.anInt684) {
							if (local258 >= Static26.anInt685) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean27) {
									this.method511(local401, false);
								}
							}
							if (local389 < Static26.anInt661) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean27) {
									this.method511(local401, false);
								}
							}
						}
						if (Static26.anInt667 == 0) {
							Static26.aBoolean37 = false;
							return;
						}
					}
				}
			}
		}
		Static26.aBoolean37 = false;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIILclient!qa;III)Z")
	public boolean method494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub3_Sub1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method503(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(III)Lclient!c;")
	public Class10 method495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub5 local8 = this.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt452; local14++) {
			@Pc(20) Class10 local20 = local8.aClass10Array1[local14];
			if ((local20.anInt246 >> 29 & 0x3) == 2 && local20.anInt259 == arg1 && local20.anInt252 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!de;Lclient!de;IIIZ)V")
	private void method496(@OriginalArg(0) Class3_Sub3_Sub1_Sub1 arg0, @OriginalArg(1) Class3_Sub3_Sub1_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg1.method404();
		this.anInt687++;
		@Pc(9) int local9 = 0;
		@Pc(12) int[] local12 = arg1.anIntArray74;
		@Pc(15) int local15 = arg1.anInt538;
		for (@Pc(17) int local17 = 0; local17 < arg0.anInt538; local17++) {
			@Pc(23) Class62 local23 = arg0.aClass62Array2[local17];
			@Pc(28) Class62 local28 = arg0.aClass62Array1[local17];
			if (local28.anInt2629 != 0) {
				@Pc(38) int local38 = arg0.anIntArray76[local17] - arg3;
				if (local38 <= arg1.anInt546) {
					@Pc(49) int local49 = arg0.anIntArray74[local17] - arg2;
					if (local49 >= arg1.anInt545 && local49 <= arg1.anInt540) {
						@Pc(65) int local65 = arg0.anIntArray80[local17] - arg4;
						if (local65 >= arg1.anInt543 && local65 <= arg1.anInt544) {
							for (@Pc(76) int local76 = 0; local76 < local15; local76++) {
								@Pc(82) Class62 local82 = arg1.aClass62Array2[local76];
								@Pc(87) Class62 local87 = arg1.aClass62Array1[local76];
								if (local49 == local12[local76] && local65 == arg1.anIntArray80[local76] && local38 == arg1.anIntArray76[local76] && local87.anInt2629 != 0) {
									local23.anInt2634 += local87.anInt2634;
									local23.anInt2632 += local87.anInt2632;
									local23.anInt2636 += local87.anInt2636;
									local23.anInt2629 += local87.anInt2629;
									local82.anInt2634 += local28.anInt2634;
									local82.anInt2632 += local28.anInt2632;
									local82.anInt2636 += local28.anInt2636;
									local82.anInt2629 += local28.anInt2629;
									local9++;
									this.anIntArray129[local17] = this.anInt687;
									this.anIntArray128[local76] = this.anInt687;
								}
							}
						}
					}
				}
			}
		}
		if (local9 < 3 || !arg5) {
			return;
		}
		for (@Pc(193) int local193 = 0; local193 < arg0.anInt542; local193++) {
			if (this.anIntArray129[arg0.anIntArray88[local193]] == this.anInt687 && this.anIntArray129[arg0.anIntArray82[local193]] == this.anInt687 && this.anIntArray129[arg0.anIntArray89[local193]] == this.anInt687) {
				arg0.anIntArray78[local193] = -1;
			}
		}
		for (@Pc(236) int local236 = 0; local236 < arg1.anInt542; local236++) {
			if (this.anIntArray128[arg1.anIntArray88[local236]] == this.anInt687 && this.anIntArray128[arg1.anIntArray82[local236]] == this.anInt687 && this.anIntArray128[arg1.anIntArray89[local236]] == this.anInt687) {
				arg1.anIntArray78[local236] = -1;
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V")
	public void method497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub5 local8 = this.aClass3_Sub5ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class3_Sub5 local31 = this.aClass3_Sub5ArrayArrayArray1[local10][arg0][arg1] = this.aClass3_Sub5ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt455--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt452; local41++) {
					@Pc(47) Class10 local47 = local31.aClass10Array1[local41];
					if ((local47.anInt246 >> 29 & 0x3) == 2 && local47.anInt259 == arg0 && local47.anInt252 == arg1) {
						local47.anInt263--;
					}
				}
			}
		}
		if (this.aClass3_Sub5ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass3_Sub5ArrayArrayArray1[0][arg0][arg1] = new Class3_Sub5(0, arg0, arg1);
		}
		this.aClass3_Sub5ArrayArrayArray1[0][arg0][arg1].aClass3_Sub5_1 = local8;
		this.aClass3_Sub5ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!h;IIIIIII)V")
	private void method500(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static26.anInt666;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static26.anInt668;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray3[arg1][arg6][arg7] - Static26.anInt665;
		@Pc(51) int local51 = this.anIntArrayArrayArray3[arg1][arg6 + 1][arg7] - Static26.anInt665;
		@Pc(66) int local66 = this.anIntArrayArrayArray3[arg1][arg6 + 1][arg7 + 1] - Static26.anInt665;
		@Pc(79) int local79 = this.anIntArrayArrayArray3[arg1][arg6][arg7 + 1] - Static26.anInt665;
		@Pc(89) int local89 = local15 * arg4 + local7 * arg5 >> 16;
		@Pc(99) int local99 = local15 * arg5 - local7 * arg4 >> 16;
		@Pc(101) int local101 = local89;
		@Pc(111) int local111 = local38 * arg3 - local99 * arg2 >> 16;
		@Pc(121) int local121 = local38 * arg2 + local99 * arg3 >> 16;
		@Pc(123) int local123 = local111;
		if (local121 < 50) {
			return;
		}
		local89 = local14 * arg4 + local21 * arg5 >> 16;
		@Pc(147) int local147 = local14 * arg5 - local21 * arg4 >> 16;
		local21 = local89;
		local89 = local51 * arg3 - local147 * arg2 >> 16;
		@Pc(169) int local169 = local51 * arg2 + local147 * arg3 >> 16;
		local51 = local89;
		if (local169 < 50) {
			return;
		}
		local89 = local27 * arg4 + local20 * arg5 >> 16;
		local27 = local27 * arg5 - local20 * arg4 >> 16;
		@Pc(197) int local197 = local89;
		local89 = local66 * arg3 - local27 * arg2 >> 16;
		local27 = local66 * arg2 + local27 * arg3 >> 16;
		local66 = local89;
		if (local27 < 50) {
			return;
		}
		local89 = local26 * arg4 + local6 * arg5 >> 16;
		@Pc(243) int local243 = local26 * arg5 - local6 * arg4 >> 16;
		@Pc(245) int local245 = local89;
		local89 = local79 * arg3 - local243 * arg2 >> 16;
		@Pc(265) int local265 = local79 * arg2 + local243 * arg3 >> 16;
		if (local265 < 50) {
			return;
		}
		@Pc(279) int local279 = Static51.anInt1370 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static51.anInt1368 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static51.anInt1370 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static51.anInt1368 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static51.anInt1370 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static51.anInt1368 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static51.anInt1370 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static51.anInt1368 + (local89 << 9) / local265;
		Static51.anInt1369 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static51.aBoolean72 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static51.anInt1373 || local327 > Static51.anInt1373 || local295 > Static51.anInt1373) {
				Static51.aBoolean72 = true;
			}
			if (Static26.aBoolean37 && this.method534(Static26.anInt672, Static26.anInt683, local319, local335, local303, local311, local327, local295)) {
				Static26.anInt662 = arg6;
				Static26.anInt678 = arg7;
			}
			if (arg0.anInt885 == -1) {
				if (arg0.anInt881 != 12345678) {
					Static51.method1013(local319, local335, local303, local311, local327, local295, arg0.anInt881, arg0.anInt874, arg0.anInt877);
				}
			} else if (Static26.aBoolean38) {
				local472 = Static51.anInterface4_1.method1547(arg0.anInt885);
				Static51.method1013(local319, local335, local303, local311, local327, local295, Static26.method526(local472, arg0.anInt881), Static26.method526(local472, arg0.anInt874), Static26.method526(local472, arg0.anInt877));
			} else if (arg0.aBoolean47) {
				Static51.method1023(local319, local335, local303, local311, local327, local295, arg0.anInt881, arg0.anInt874, arg0.anInt877, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt885);
			} else {
				Static51.method1023(local319, local335, local303, local311, local327, local295, arg0.anInt881, arg0.anInt874, arg0.anInt877, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt885);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static51.aBoolean72 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static51.anInt1373 || local295 > Static51.anInt1373 || local327 > Static51.anInt1373) {
			Static51.aBoolean72 = true;
		}
		if (Static26.aBoolean37 && this.method534(Static26.anInt672, Static26.anInt683, local287, local303, local335, local279, local295, local327)) {
			Static26.anInt662 = arg6;
			Static26.anInt678 = arg7;
		}
		if (arg0.anInt885 != -1) {
			if (!Static26.aBoolean38) {
				Static51.method1023(local287, local303, local335, local279, local295, local327, arg0.anInt883, arg0.anInt877, arg0.anInt874, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt885);
				return;
			}
			local472 = Static51.anInterface4_1.method1547(arg0.anInt885);
			Static51.method1013(local287, local303, local335, local279, local295, local327, Static26.method526(local472, arg0.anInt883), Static26.method526(local472, arg0.anInt877), Static26.method526(local472, arg0.anInt874));
		} else if (arg0.anInt883 != 12345678) {
			Static51.method1013(local287, local303, local335, local279, local295, local327, arg0.anInt883, arg0.anInt877, arg0.anInt874);
			return;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIII)V")
	public void method501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub5 local8 = this.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class34 local14 = local8.aClass34_1;
		if (local14 != null) {
			@Pc(23) int local23 = arg1 * 128 + 64;
			@Pc(29) int local29 = arg2 * 128 + 64;
			local14.anInt1433 = local23 + (local14.anInt1433 - local23) * arg3 / 16;
			local14.anInt1430 = local29 + (local14.anInt1430 - local29) * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class26 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class26(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass3_Sub5ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass3_Sub5ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub5(local14, arg1, arg2);
				}
			}
			this.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2].aClass26_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class26(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass3_Sub5ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass3_Sub5ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub5(local14, arg1, arg2);
				}
			}
			this.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2].aClass26_1 = local12;
		} else {
			@Pc(140) Class4 local140 = new Class4(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass3_Sub5ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass3_Sub5ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub5(local14, arg1, arg2);
				}
			}
			this.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2].aClass4_1 = local140;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIIILclient!qa;IZII)Z")
	private boolean method503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class3_Sub3_Sub1 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt674 || local4 >= this.anInt669) {
					return false;
				}
				@Pc(28) Class3_Sub5 local28 = this.aClass3_Sub5ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt452 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class10 local52 = new Class10();
		local52.anInt246 = arg11;
		local52.anInt254 = arg12;
		local52.anInt263 = arg0;
		local52.anInt250 = arg5;
		local52.anInt253 = arg6;
		local52.anInt256 = arg7;
		local52.aClass3_Sub3_Sub1_1 = arg8;
		local52.anInt255 = arg9;
		local52.anInt259 = arg1;
		local52.anInt252 = arg2;
		local52.anInt258 = arg1 + arg3 - 1;
		local52.anInt261 = arg2 + arg4 - 1;
		for (@Pc(98) int local98 = arg1; local98 < arg1 + arg3; local98++) {
			for (@Pc(101) int local101 = arg2; local101 < arg2 + arg4; local101++) {
				@Pc(104) int local104 = 0;
				if (local98 > arg1) {
					local104++;
				}
				if (local98 < arg1 + arg3 - 1) {
					local104 += 4;
				}
				if (local101 > arg2) {
					local104 += 8;
				}
				if (local101 < arg2 + arg4 - 1) {
					local104 += 2;
				}
				for (@Pc(130) int local130 = arg0; local130 >= 0; local130--) {
					if (this.aClass3_Sub5ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass3_Sub5ArrayArrayArray1[local130][local98][local101] = new Class3_Sub5(local130, local98, local101);
					}
				}
				@Pc(166) Class3_Sub5 local166 = this.aClass3_Sub5ArrayArrayArray1[arg0][local98][local101];
				local166.aClass10Array1[local166.anInt452] = local52;
				local166.anIntArray63[local166.anInt452] = local104;
				local166.anInt449 |= local104;
				local166.anInt452++;
			}
		}
		if (arg10) {
			this.aClass10Array3[this.anInt677++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(III)Lclient!nc;")
	public Class43 method504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub5 local8 = this.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass43_1;
	}

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "(III)I")
	public int method505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub5 local8 = this.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass43_1 == null ? 0 : local8.aClass43_1.anInt1814;
	}

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "(III)V")
	public void method506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub5 local8 = this.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass34_1 = null;
		}
	}

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "(III)I")
	public int method507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub5 local8 = this.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass34_1 == null ? 0 : local8.aClass34_1.anInt1434;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(IIII)V")
	public void method508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub5 local8 = this.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2].anInt448 = arg3;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIILclient!qa;IIIIII)V")
	public void method509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub3_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class34 local6 = new Class34();
		local6.anInt1434 = arg9;
		local6.anInt1431 = arg10;
		local6.anInt1433 = arg1 * 128 + arg7 + 64;
		local6.anInt1430 = arg2 * 128 + arg8 + 64;
		local6.anInt1432 = arg3;
		local6.aClass3_Sub3_Sub1_2 = arg4;
		local6.anInt1427 = arg5;
		local6.anInt1436 = arg6;
		for (@Pc(44) int local44 = arg0; local44 >= 0; local44--) {
			if (this.aClass3_Sub5ArrayArrayArray1[local44][arg1][arg2] == null) {
				this.aClass3_Sub5ArrayArrayArray1[local44][arg1][arg2] = new Class3_Sub5(local44, arg1, arg2);
			}
		}
		this.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2].aClass34_1 = local6;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!de;IIIII)V")
	private void method510(@OriginalArg(0) Class3_Sub3_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt670) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt674) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt669 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class3_Sub5 local66 = this.aClass3_Sub5ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray3[local17][local24][local34] + this.anIntArrayArrayArray3[local17][local24 + 1][local34] + this.anIntArrayArrayArray3[local17][local24][local34 + 1] + this.anIntArrayArrayArray3[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray3[arg1][arg2][arg3] + this.anIntArrayArrayArray3[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray3[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray3[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class43 local163 = local66.aClass43_1;
									if (local163 != null) {
										@Pc(173) Class3_Sub3_Sub1_Sub1 local173;
										if (local163.aClass3_Sub3_Sub1_4 instanceof Class3_Sub3_Sub1_Sub1) {
											local173 = (Class3_Sub3_Sub1_Sub1) local163.aClass3_Sub3_Sub1_4;
											if (local173.aClass62Array2 != null) {
												this.method496(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
											}
										}
										if (local163.aClass3_Sub3_Sub1_3 instanceof Class3_Sub3_Sub1_Sub1) {
											local173 = (Class3_Sub3_Sub1_Sub1) local163.aClass3_Sub3_Sub1_3;
											if (local173.aClass62Array2 != null) {
												this.method496(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
											}
										}
									}
									for (@Pc(245) int local245 = 0; local245 < local66.anInt452; local245++) {
										@Pc(251) Class10 local251 = local66.aClass10Array1[local245];
										if (local251 != null && local251.aClass3_Sub3_Sub1_1 instanceof Class3_Sub3_Sub1_Sub1) {
											@Pc(261) Class3_Sub3_Sub1_Sub1 local261 = (Class3_Sub3_Sub1_Sub1) local251.aClass3_Sub3_Sub1_1;
											if (local261.aClass62Array2 != null) {
												@Pc(272) int local272 = local251.anInt258 + 1 - local251.anInt259;
												@Pc(280) int local280 = local251.anInt261 + 1 - local251.anInt252;
												this.method496(arg0, local261, (local251.anInt259 - arg2) * 128 + (local272 - arg4) * 64, local160, (local251.anInt252 - arg3) * 128 + (local280 - arg5) * 64, local1);
											}
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!dc;Z)V")
	private void method511(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(1) boolean arg1) {
		Static26.aClass28_6.method889(arg0);
		while (true) {
			@Pc(8) Class3_Sub5 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class3_Sub5[][] local31;
			@Pc(49) Class3_Sub5 local49;
			@Pc(251) int local251;
			@Pc(578) int local578;
			@Pc(583) int local583;
			@Pc(588) int local588;
			@Pc(591) int local591;
			@Pc(600) int local600;
			@Pc(942) Class43 local942;
			@Pc(1116) int local1116;
			@Pc(1001) int local1001;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class10 var12;
										@Pc(612) int var19;
										@Pc(335) int var23;
										@Pc(289) boolean var24;
										@Pc(823) Class3_Sub5 var35;
										while (true) {
											do {
												local8 = (Class3_Sub5) Static26.aClass28_6.method882();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean25);
											local17 = local8.anInt454;
											local20 = local8.anInt458;
											local23 = local8.anInt455;
											local26 = local8.anInt450;
											local31 = this.aClass3_Sub5ArrayArrayArray1[local23];
											if (!local8.aBoolean27) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass3_Sub5ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean25) {
														continue;
													}
												}
												if (local17 <= Static26.anInt686 && local17 > Static26.anInt682) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean25 && (local49.aBoolean27 || (local8.anInt449 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static26.anInt686 && local17 < Static26.anInt684 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean25 && (local49.aBoolean27 || (local8.anInt449 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static26.anInt673 && local20 > Static26.anInt685) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean25 && (local49.aBoolean27 || (local8.anInt449 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static26.anInt673 && local20 < Static26.anInt661 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean25 && (local49.aBoolean27 || (local8.anInt449 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean27 = false;
											if (local8.aClass3_Sub5_1 != null) {
												local49 = local8.aClass3_Sub5_1;
												if (local49.aClass26_1 == null) {
													if (local49.aClass4_1 != null && !this.method491(0, local17, local20)) {
														this.method540(local49.aClass4_1, Static26.anInt681, Static26.anInt675, Static26.anInt663, Static26.anInt680, local17, local20);
													}
												} else if (!this.method491(0, local17, local20)) {
													this.method500(local49.aClass26_1, 0, Static26.anInt681, Static26.anInt675, Static26.anInt663, Static26.anInt680, local17, local20);
												}
												@Pc(225) Class43 local225 = local49.aClass43_1;
												if (local225 != null) {
													local225.aClass3_Sub3_Sub1_4.method1668(0, Static26.anInt681, Static26.anInt675, Static26.anInt663, Static26.anInt680, local225.anInt1828 - Static26.anInt666, local225.anInt1819 - Static26.anInt665, local225.anInt1830 - Static26.anInt668, local225.anInt1814);
												}
												for (local251 = 0; local251 < local49.anInt452; local251++) {
													var12 = local49.aClass10Array1[local251];
													if (var12 != null) {
														var12.aClass3_Sub3_Sub1_1.method1668(var12.anInt255, Static26.anInt681, Static26.anInt675, Static26.anInt663, Static26.anInt680, var12.anInt250 - Static26.anInt666, var12.anInt256 - Static26.anInt665, var12.anInt253 - Static26.anInt668, var12.anInt246);
													}
												}
											}
											var24 = false;
											if (local8.aClass26_1 == null) {
												if (local8.aClass4_1 != null && !this.method491(local26, local17, local20)) {
													var24 = true;
													this.method540(local8.aClass4_1, Static26.anInt681, Static26.anInt675, Static26.anInt663, Static26.anInt680, local17, local20);
												}
											} else if (!this.method491(local26, local17, local20)) {
												var24 = true;
												this.method500(local8.aClass26_1, local26, Static26.anInt681, Static26.anInt675, Static26.anInt663, Static26.anInt680, local17, local20);
											}
											var23 = 0;
											local251 = 0;
											@Pc(340) Class43 local340 = local8.aClass43_1;
											@Pc(343) Class34 local343 = local8.aClass34_1;
											if (local340 != null || local343 != null) {
												if (Static26.anInt686 == local17) {
													var23++;
												} else if (Static26.anInt686 < local17) {
													var23 += 2;
												}
												if (Static26.anInt673 == local20) {
													var23 += 3;
												} else if (Static26.anInt673 > local20) {
													var23 += 6;
												}
												local251 = Static26.anIntArray134[var23];
												local8.anInt451 = Static26.anIntArray130[var23];
											}
											if (local340 != null) {
												if ((local340.anInt1831 & Static26.anIntArray131[var23]) == 0) {
													local8.anInt457 = 0;
												} else if (local340.anInt1831 == 16) {
													local8.anInt457 = 3;
													local8.anInt456 = Static26.anIntArray133[var23];
													local8.anInt447 = 3 - local8.anInt456;
												} else if (local340.anInt1831 == 32) {
													local8.anInt457 = 6;
													local8.anInt456 = Static26.anIntArray136[var23];
													local8.anInt447 = 6 - local8.anInt456;
												} else if (local340.anInt1831 == 64) {
													local8.anInt457 = 12;
													local8.anInt456 = Static26.anIntArray132[var23];
													local8.anInt447 = 12 - local8.anInt456;
												} else {
													local8.anInt457 = 9;
													local8.anInt456 = Static26.anIntArray135[var23];
													local8.anInt447 = 9 - local8.anInt456;
												}
												if ((local340.anInt1831 & local251) != 0 && !this.method527(local26, local17, local20, local340.anInt1831)) {
													local340.aClass3_Sub3_Sub1_4.method1668(0, Static26.anInt681, Static26.anInt675, Static26.anInt663, Static26.anInt680, local340.anInt1828 - Static26.anInt666, local340.anInt1819 - Static26.anInt665, local340.anInt1830 - Static26.anInt668, local340.anInt1814);
												}
												if ((local340.anInt1821 & local251) != 0 && !this.method527(local26, local17, local20, local340.anInt1821)) {
													local340.aClass3_Sub3_Sub1_3.method1668(0, Static26.anInt681, Static26.anInt675, Static26.anInt663, Static26.anInt680, local340.anInt1828 - Static26.anInt666, local340.anInt1819 - Static26.anInt665, local340.anInt1830 - Static26.anInt668, local340.anInt1814);
												}
											}
											if (local343 != null && !this.method513(local26, local17, local20, local343.aClass3_Sub3_Sub1_2.anInt2368)) {
												if ((local343.anInt1427 & local251) != 0) {
													local343.aClass3_Sub3_Sub1_2.method1668(local343.anInt1436, Static26.anInt681, Static26.anInt675, Static26.anInt663, Static26.anInt680, local343.anInt1433 - Static26.anInt666, local343.anInt1432 - Static26.anInt665, local343.anInt1430 - Static26.anInt668, local343.anInt1434);
												} else if ((local343.anInt1427 & 0x300) != 0) {
													local578 = local343.anInt1433 - Static26.anInt666;
													local583 = local343.anInt1432 - Static26.anInt665;
													local588 = local343.anInt1430 - Static26.anInt668;
													local591 = local343.anInt1436;
													if (local591 == 1 || local591 == 2) {
														local600 = -local578;
													} else {
														local600 = local578;
													}
													if (local591 == 2 || local591 == 3) {
														var19 = -local588;
													} else {
														var19 = local588;
													}
													@Pc(629) int local629;
													@Pc(635) int local635;
													if ((local343.anInt1427 & 0x100) != 0 && var19 < local600) {
														local629 = local578 + Static26.anIntArray127[local591];
														local635 = local588 + Static26.anIntArray123[local591];
														local343.aClass3_Sub3_Sub1_2.method1668(local591 * 512 + 256, Static26.anInt681, Static26.anInt675, Static26.anInt663, Static26.anInt680, local629, local583, local635, local343.anInt1434);
													}
													if ((local343.anInt1427 & 0x200) != 0 && var19 > local600) {
														local629 = local578 + Static26.anIntArray126[local591];
														local635 = local588 + Static26.anIntArray124[local591];
														local343.aClass3_Sub3_Sub1_2.method1668(local591 * 512 + 1280 & 0x7FF, Static26.anInt681, Static26.anInt675, Static26.anInt663, Static26.anInt680, local629, local583, local635, local343.anInt1434);
													}
												}
											}
											if (var24) {
												@Pc(696) Class50 local696 = local8.aClass50_1;
												if (local696 != null) {
													local696.aClass3_Sub3_Sub1_5.method1668(0, Static26.anInt681, Static26.anInt675, Static26.anInt663, Static26.anInt680, local696.anInt2181 - Static26.anInt666, local696.anInt2183 - Static26.anInt665, local696.anInt2179 - Static26.anInt668, local696.anInt2184);
												}
												@Pc(723) Class63 local723 = local8.aClass63_1;
												if (local723 != null && local723.anInt2667 == 0) {
													if (local723.aClass3_Sub3_Sub1_6 != null) {
														local723.aClass3_Sub3_Sub1_6.method1668(0, Static26.anInt681, Static26.anInt675, Static26.anInt663, Static26.anInt680, local723.anInt2675 - Static26.anInt666, local723.anInt2668 - Static26.anInt665, local723.anInt2672 - Static26.anInt668, local723.anInt2666);
													}
													if (local723.aClass3_Sub3_Sub1_7 != null) {
														local723.aClass3_Sub3_Sub1_7.method1668(0, Static26.anInt681, Static26.anInt675, Static26.anInt663, Static26.anInt680, local723.anInt2675 - Static26.anInt666, local723.anInt2668 - Static26.anInt665, local723.anInt2672 - Static26.anInt668, local723.anInt2666);
													}
													if (local723.aClass3_Sub3_Sub1_8 != null) {
														local723.aClass3_Sub3_Sub1_8.method1668(0, Static26.anInt681, Static26.anInt675, Static26.anInt663, Static26.anInt680, local723.anInt2675 - Static26.anInt666, local723.anInt2668 - Static26.anInt665, local723.anInt2672 - Static26.anInt668, local723.anInt2666);
													}
												}
											}
											local578 = local8.anInt449;
											if (local578 != 0) {
												if (local17 < Static26.anInt686 && (local578 & 0x4) != 0) {
													var35 = local31[local17 + 1][local20];
													if (var35 != null && var35.aBoolean25) {
														Static26.aClass28_6.method889(var35);
													}
												}
												if (local20 < Static26.anInt673 && (local578 & 0x2) != 0) {
													var35 = local31[local17][local20 + 1];
													if (var35 != null && var35.aBoolean25) {
														Static26.aClass28_6.method889(var35);
													}
												}
												if (local17 > Static26.anInt686 && (local578 & 0x1) != 0) {
													var35 = local31[local17 - 1][local20];
													if (var35 != null && var35.aBoolean25) {
														Static26.aClass28_6.method889(var35);
													}
												}
												if (local20 > Static26.anInt673 && (local578 & 0x8) != 0) {
													var35 = local31[local17][local20 - 1];
													if (var35 != null && var35.aBoolean25) {
														Static26.aClass28_6.method889(var35);
													}
												}
											}
											break;
										}
										if (local8.anInt457 != 0) {
											var24 = true;
											for (var23 = 0; var23 < local8.anInt452; var23++) {
												if (local8.aClass10Array1[var23].anInt264 != Static26.anInt660 && (local8.anIntArray63[var23] & local8.anInt457) == local8.anInt456) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												local942 = local8.aClass43_1;
												if (!this.method527(local26, local17, local20, local942.anInt1831)) {
													local942.aClass3_Sub3_Sub1_4.method1668(0, Static26.anInt681, Static26.anInt675, Static26.anInt663, Static26.anInt680, local942.anInt1828 - Static26.anInt666, local942.anInt1819 - Static26.anInt665, local942.anInt1830 - Static26.anInt668, local942.anInt1814);
												}
												local8.anInt457 = 0;
											}
										}
										if (!local8.aBoolean26) {
											break;
										}
										try {
											@Pc(981) int local981 = local8.anInt452;
											local8.aBoolean26 = false;
											var23 = 0;
											label559: for (local251 = 0; local251 < local981; local251++) {
												var12 = local8.aClass10Array1[local251];
												if (var12.anInt264 != Static26.anInt660) {
													for (local1001 = var12.anInt259; local1001 <= var12.anInt258; local1001++) {
														for (local578 = var12.anInt252; local578 <= var12.anInt261; local578++) {
															var35 = local31[local1001][local578];
															if (var35.aBoolean27) {
																local8.aBoolean26 = true;
																continue label559;
															}
															if (var35.anInt457 != 0) {
																local588 = 0;
																if (local1001 > var12.anInt259) {
																	local588++;
																}
																if (local1001 < var12.anInt258) {
																	local588 += 4;
																}
																if (local578 > var12.anInt252) {
																	local588 += 8;
																}
																if (local578 < var12.anInt261) {
																	local588 += 2;
																}
																if ((local588 & var35.anInt457) == local8.anInt447) {
																	local8.aBoolean26 = true;
																	continue label559;
																}
															}
														}
													}
													Static26.aClass10Array2[var23++] = var12;
													local578 = Static26.anInt686 - var12.anInt259;
													local583 = var12.anInt258 - Static26.anInt686;
													if (local583 > local578) {
														local578 = local583;
													}
													local588 = Static26.anInt673 - var12.anInt252;
													local591 = var12.anInt261 - Static26.anInt673;
													if (local591 > local588) {
														var12.anInt257 = local578 + local591;
													} else {
														var12.anInt257 = local578 + local588;
													}
												}
											}
											while (var23 > 0) {
												local1116 = -50;
												local1001 = -1;
												@Pc(1125) Class10 local1125;
												for (local578 = 0; local578 < var23; local578++) {
													local1125 = Static26.aClass10Array2[local578];
													if (local1125.anInt264 != Static26.anInt660) {
														if (local1125.anInt257 > local1116) {
															local1116 = local1125.anInt257;
															local1001 = local578;
														} else if (local1125.anInt257 == local1116) {
															local588 = local1125.anInt250 - Static26.anInt666;
															local591 = local1125.anInt253 - Static26.anInt668;
															local600 = Static26.aClass10Array2[local1001].anInt250 - Static26.anInt666;
															var19 = Static26.aClass10Array2[local1001].anInt253 - Static26.anInt668;
															if (local588 * local588 + local591 * local591 > local600 * local600 + var19 * var19) {
																local1001 = local578;
															}
														}
													}
												}
												if (local1001 == -1) {
													break;
												}
												local1125 = Static26.aClass10Array2[local1001];
												local1125.anInt264 = Static26.anInt660;
												if (!this.method533(local26, local1125.anInt259, local1125.anInt258, local1125.anInt252, local1125.anInt261, local1125.aClass3_Sub3_Sub1_1.anInt2368)) {
													local1125.aClass3_Sub3_Sub1_1.method1668(local1125.anInt255, Static26.anInt681, Static26.anInt675, Static26.anInt663, Static26.anInt680, local1125.anInt250 - Static26.anInt666, local1125.anInt256 - Static26.anInt665, local1125.anInt253 - Static26.anInt668, local1125.anInt246);
												}
												for (local588 = local1125.anInt259; local588 <= local1125.anInt258; local588++) {
													for (local591 = local1125.anInt252; local591 <= local1125.anInt261; local591++) {
														@Pc(1250) Class3_Sub5 local1250 = local31[local588][local591];
														if (local1250.anInt457 != 0) {
															Static26.aClass28_6.method889(local1250);
														} else if ((local588 != local17 || local591 != local20) && local1250.aBoolean25) {
															Static26.aClass28_6.method889(local1250);
														}
													}
												}
											}
											if (!local8.aBoolean26) {
												break;
											}
										} catch (@Pc(1288) Exception local1288) {
											local8.aBoolean26 = false;
											break;
										}
									}
								} while (!local8.aBoolean25);
							} while (local8.anInt457 != 0);
							if (local17 > Static26.anInt686 || local17 <= Static26.anInt682) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean25);
						if (local17 < Static26.anInt686 || local17 >= Static26.anInt684 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean25);
					if (local20 > Static26.anInt673 || local20 <= Static26.anInt685) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean25);
				if (local20 < Static26.anInt673 || local20 >= Static26.anInt661 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean25);
			local8.aBoolean25 = false;
			Static26.anInt667--;
			@Pc(1392) Class63 local1392 = local8.aClass63_1;
			if (local1392 != null && local1392.anInt2667 != 0) {
				if (local1392.aClass3_Sub3_Sub1_6 != null) {
					local1392.aClass3_Sub3_Sub1_6.method1668(0, Static26.anInt681, Static26.anInt675, Static26.anInt663, Static26.anInt680, local1392.anInt2675 - Static26.anInt666, local1392.anInt2668 - Static26.anInt665 - local1392.anInt2667, local1392.anInt2672 - Static26.anInt668, local1392.anInt2666);
				}
				if (local1392.aClass3_Sub3_Sub1_7 != null) {
					local1392.aClass3_Sub3_Sub1_7.method1668(0, Static26.anInt681, Static26.anInt675, Static26.anInt663, Static26.anInt680, local1392.anInt2675 - Static26.anInt666, local1392.anInt2668 - Static26.anInt665 - local1392.anInt2667, local1392.anInt2672 - Static26.anInt668, local1392.anInt2666);
				}
				if (local1392.aClass3_Sub3_Sub1_8 != null) {
					local1392.aClass3_Sub3_Sub1_8.method1668(0, Static26.anInt681, Static26.anInt675, Static26.anInt663, Static26.anInt680, local1392.anInt2675 - Static26.anInt666, local1392.anInt2668 - Static26.anInt665 - local1392.anInt2667, local1392.anInt2672 - Static26.anInt668, local1392.anInt2666);
				}
			}
			if (local8.anInt451 != 0) {
				@Pc(1487) Class34 local1487 = local8.aClass34_1;
				if (local1487 != null && !this.method513(local26, local17, local20, local1487.aClass3_Sub3_Sub1_2.anInt2368)) {
					if ((local1487.anInt1427 & local8.anInt451) != 0) {
						local1487.aClass3_Sub3_Sub1_2.method1668(local1487.anInt1436, Static26.anInt681, Static26.anInt675, Static26.anInt663, Static26.anInt680, local1487.anInt1433 - Static26.anInt666, local1487.anInt1432 - Static26.anInt665, local1487.anInt1430 - Static26.anInt668, local1487.anInt1434);
					} else if ((local1487.anInt1427 & 0x300) != 0) {
						local251 = local1487.anInt1433 - Static26.anInt666;
						local1116 = local1487.anInt1432 - Static26.anInt665;
						local1001 = local1487.anInt1430 - Static26.anInt668;
						local578 = local1487.anInt1436;
						if (local578 == 1 || local578 == 2) {
							local583 = -local251;
						} else {
							local583 = local251;
						}
						if (local578 == 2 || local578 == 3) {
							local588 = -local1001;
						} else {
							local588 = local1001;
						}
						if ((local1487.anInt1427 & 0x100) != 0 && local588 >= local583) {
							local591 = local251 + Static26.anIntArray127[local578];
							local600 = local1001 + Static26.anIntArray123[local578];
							local1487.aClass3_Sub3_Sub1_2.method1668(local578 * 512 + 256, Static26.anInt681, Static26.anInt675, Static26.anInt663, Static26.anInt680, local591, local1116, local600, local1487.anInt1434);
						}
						if ((local1487.anInt1427 & 0x200) != 0 && local588 <= local583) {
							local591 = local251 + Static26.anIntArray126[local578];
							local600 = local1001 + Static26.anIntArray124[local578];
							local1487.aClass3_Sub3_Sub1_2.method1668(local578 * 512 + 1280 & 0x7FF, Static26.anInt681, Static26.anInt675, Static26.anInt663, Static26.anInt680, local591, local1116, local600, local1487.anInt1434);
						}
					}
				}
				local942 = local8.aClass43_1;
				if (local942 != null) {
					if ((local942.anInt1821 & local8.anInt451) != 0 && !this.method527(local26, local17, local20, local942.anInt1821)) {
						local942.aClass3_Sub3_Sub1_3.method1668(0, Static26.anInt681, Static26.anInt675, Static26.anInt663, Static26.anInt680, local942.anInt1828 - Static26.anInt666, local942.anInt1819 - Static26.anInt665, local942.anInt1830 - Static26.anInt668, local942.anInt1814);
					}
					if ((local942.anInt1831 & local8.anInt451) != 0 && !this.method527(local26, local17, local20, local942.anInt1831)) {
						local942.aClass3_Sub3_Sub1_4.method1668(0, Static26.anInt681, Static26.anInt675, Static26.anInt663, Static26.anInt680, local942.anInt1828 - Static26.anInt666, local942.anInt1819 - Static26.anInt665, local942.anInt1830 - Static26.anInt668, local942.anInt1814);
					}
				}
			}
			@Pc(1745) Class3_Sub5 local1745;
			if (local23 < this.anInt670 - 1) {
				local1745 = this.aClass3_Sub5ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1745 != null && local1745.aBoolean25) {
					Static26.aClass28_6.method889(local1745);
				}
			}
			if (local17 < Static26.anInt686) {
				local1745 = local31[local17 + 1][local20];
				if (local1745 != null && local1745.aBoolean25) {
					Static26.aClass28_6.method889(local1745);
				}
			}
			if (local20 < Static26.anInt673) {
				local1745 = local31[local17][local20 + 1];
				if (local1745 != null && local1745.aBoolean25) {
					Static26.aClass28_6.method889(local1745);
				}
			}
			if (local17 > Static26.anInt686) {
				local1745 = local31[local17 - 1][local20];
				if (local1745 != null && local1745.aBoolean25) {
					Static26.aClass28_6.method889(local1745);
				}
			}
			if (local20 > Static26.anInt673) {
				local1745 = local31[local17][local20 - 1];
				if (local1745 != null && local1745.aBoolean25) {
					Static26.aClass28_6.method889(local1745);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIILclient!qa;IIIIII)Z")
	public boolean method512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class3_Sub3_Sub1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method503(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(IIII)Z")
	private boolean method513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method491(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method537(local11 + 1, this.anIntArrayArrayArray3[arg0][arg1][arg2] - arg3, local15 + 1) && this.method537(local11 + 128 - 1, this.anIntArrayArrayArray3[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method537(local11 + 128 - 1, this.anIntArrayArrayArray3[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method537(local11 + 1, this.anIntArrayArrayArray3[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "(III)Lclient!pd;")
	public Class50 method514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub5 local8 = this.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass50_1 == null ? null : local8.aClass50_1;
	}

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "(III)V")
	public void method515() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt670; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt674; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt669; local7++) {
					@Pc(17) Class3_Sub5 local17 = this.aClass3_Sub5ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class43 local22 = local17.aClass43_1;
						if (local22 != null && local22.aClass3_Sub3_Sub1_4 instanceof Class3_Sub3_Sub1_Sub1) {
							@Pc(32) Class3_Sub3_Sub1_Sub1 local32 = (Class3_Sub3_Sub1_Sub1) local22.aClass3_Sub3_Sub1_4;
							if (local32.aClass62Array2 != null) {
								this.method510(local32, local1, local4, local7, 1, 1);
								if (local22.aClass3_Sub3_Sub1_3 instanceof Class3_Sub3_Sub1_Sub1) {
									@Pc(51) Class3_Sub3_Sub1_Sub1 local51 = (Class3_Sub3_Sub1_Sub1) local22.aClass3_Sub3_Sub1_3;
									if (local51.aClass62Array2 != null) {
										this.method510(local51, local1, local4, local7, 1, 1);
										this.method496(local32, local51, 0, 0, 0, false);
										local51.method413();
									}
								}
								local32.method413();
							}
						}
						@Pc(98) Class3_Sub3_Sub1_Sub1 local98;
						for (@Pc(82) int local82 = 0; local82 < local17.anInt452; local82++) {
							@Pc(88) Class10 local88 = local17.aClass10Array1[local82];
							if (local88 != null && local88.aClass3_Sub3_Sub1_1 instanceof Class3_Sub3_Sub1_Sub1) {
								local98 = (Class3_Sub3_Sub1_Sub1) local88.aClass3_Sub3_Sub1_1;
								if (local98.aClass62Array2 != null) {
									this.method510(local98, local1, local4, local7, local88.anInt258 + 1 - local88.anInt259, local88.anInt261 - local88.anInt252 + 1);
									local98.method413();
								}
							}
						}
						@Pc(134) Class50 local134 = local17.aClass50_1;
						if (local134 != null && local134.aClass3_Sub3_Sub1_5 instanceof Class3_Sub3_Sub1_Sub1) {
							local98 = (Class3_Sub3_Sub1_Sub1) local134.aClass3_Sub3_Sub1_5;
							if (local98.aClass62Array2 != null) {
								this.method539(local98, local1, local4, local7);
								local98.method413();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIILclient!qa;IIZ)Z")
	public boolean method516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class3_Sub3_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return this.method503(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIILclient!qa;ILclient!qa;Lclient!qa;)V")
	public void method517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub3_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub3_Sub1 arg6, @OriginalArg(7) Class3_Sub3_Sub1 arg7) {
		@Pc(3) Class63 local3 = new Class63();
		local3.aClass3_Sub3_Sub1_8 = arg4;
		local3.anInt2675 = arg1 * 128 + 64;
		local3.anInt2672 = arg2 * 128 + 64;
		local3.anInt2668 = arg3;
		local3.anInt2666 = arg5;
		local3.aClass3_Sub3_Sub1_6 = arg6;
		local3.aClass3_Sub3_Sub1_7 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class3_Sub5 local43 = this.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt452; local47++) {
				if ((local43.aClass10Array1[local47].anInt254 & 0x100) == 256 && local43.aClass10Array1[local47].aClass3_Sub3_Sub1_1 instanceof Class3_Sub3_Sub1_Sub1) {
					@Pc(71) Class3_Sub3_Sub1_Sub1 local71 = (Class3_Sub3_Sub1_Sub1) local43.aClass10Array1[local47].aClass3_Sub3_Sub1_1;
					local71.method419();
					if (local71.anInt2368 > local34) {
						local34 = local71.anInt2368;
					}
				}
			}
		}
		local3.anInt2667 = local34;
		if (this.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2] = new Class3_Sub5(arg0, arg1, arg2);
		}
		this.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2].aClass63_1 = local3;
	}

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "(III)I")
	public int method518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub5 local8 = this.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt452; local14++) {
			@Pc(20) Class10 local20 = local8.aClass10Array1[local14];
			if ((local20.anInt246 >> 29 & 0x3) == 2 && local20.anInt259 == arg1 && local20.anInt252 == arg2) {
				return local20.anInt246;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "()V")
	public void method519() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt670; local1++) {
			for (local4 = 0; local4 < this.anInt674; local4++) {
				for (local7 = 0; local7 < this.anInt669; local7++) {
					this.aClass3_Sub5ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static26.anInt671; local4++) {
			for (local7 = 0; local7 < Static26.anIntArray125[local4]; local7++) {
				Static26.aClass25ArrayArray1[local4][local7] = null;
			}
			Static26.anIntArray125[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt677; local7++) {
			this.aClass10Array3[local7] = null;
		}
		this.anInt677 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static26.aClass10Array2.length; local76++) {
			Static26.aClass10Array2[local76] = null;
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "()V")
	private void method520() {
		@Pc(3) int local3 = Static26.anIntArray125[Static26.anInt679];
		@Pc(7) Class25[] local7 = Static26.aClass25ArrayArray1[Static26.anInt679];
		Static26.anInt664 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class25 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt853 == 1) {
				local27 = local16.anInt870 + 25 - Static26.anInt686;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt864 + 25 - Static26.anInt673;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt852 + 25 - Static26.anInt673;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static26.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static26.anInt666 - local16.anInt858;
						if (local79 > 32) {
							local16.anInt856 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt856 = 2;
							local79 = -local79;
						}
						local16.anInt863 = (local16.anInt866 - Static26.anInt668 << 8) / local79;
						local16.anInt854 = (local16.anInt862 - Static26.anInt668 << 8) / local79;
						local16.anInt868 = (local16.anInt857 - Static26.anInt665 << 8) / local79;
						local16.anInt867 = (local16.anInt859 - Static26.anInt665 << 8) / local79;
						Static26.aClass25Array1[Static26.anInt664++] = local16;
					}
				}
			} else if (local16.anInt853 == 2) {
				local27 = local16.anInt864 + 25 - Static26.anInt673;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt870 + 25 - Static26.anInt686;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt871 + 25 - Static26.anInt686;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static26.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static26.anInt668 - local16.anInt866;
						if (local79 > 32) {
							local16.anInt856 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt856 = 4;
							local79 = -local79;
						}
						local16.anInt855 = (local16.anInt858 - Static26.anInt666 << 8) / local79;
						local16.anInt865 = (local16.anInt861 - Static26.anInt666 << 8) / local79;
						local16.anInt868 = (local16.anInt857 - Static26.anInt665 << 8) / local79;
						local16.anInt867 = (local16.anInt859 - Static26.anInt665 << 8) / local79;
						Static26.aClass25Array1[Static26.anInt664++] = local16;
					}
				}
			} else if (local16.anInt853 == 4) {
				local27 = local16.anInt857 - Static26.anInt665;
				if (local27 > 128) {
					local40 = local16.anInt864 + 25 - Static26.anInt673;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt852 + 25 - Static26.anInt673;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt870 + 25 - Static26.anInt686;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt871 + 25 - Static26.anInt686;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static26.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt856 = 5;
							local16.anInt855 = (local16.anInt858 - Static26.anInt666 << 8) / local27;
							local16.anInt865 = (local16.anInt861 - Static26.anInt666 << 8) / local27;
							local16.anInt863 = (local16.anInt866 - Static26.anInt668 << 8) / local27;
							local16.anInt854 = (local16.anInt862 - Static26.anInt668 << 8) / local27;
							Static26.aClass25Array1[Static26.anInt664++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIILclient!qa;Lclient!qa;IIII)V")
	public void method521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub3_Sub1 arg4, @OriginalArg(5) Class3_Sub3_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class43 local8 = new Class43();
		local8.anInt1814 = arg8;
		local8.anInt1820 = arg9;
		local8.anInt1828 = arg1 * 128 + 64;
		local8.anInt1830 = arg2 * 128 + 64;
		local8.anInt1819 = arg3;
		local8.aClass3_Sub3_Sub1_4 = arg4;
		local8.aClass3_Sub3_Sub1_3 = arg5;
		local8.anInt1831 = arg6;
		local8.anInt1821 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass3_Sub5ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass3_Sub5ArrayArrayArray1[local45][arg1][arg2] = new Class3_Sub5(local45, arg1, arg2);
			}
		}
		this.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2].aClass43_1 = local8;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIILclient!qa;II)V")
	public void method522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub3_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class50 local6 = new Class50();
		local6.aClass3_Sub3_Sub1_5 = arg4;
		local6.anInt2181 = arg1 * 128 + 64;
		local6.anInt2179 = arg2 * 128 + 64;
		local6.anInt2183 = arg3;
		local6.anInt2184 = arg5;
		local6.anInt2182 = arg6;
		if (this.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2] = new Class3_Sub5(arg0, arg1, arg2);
		}
		this.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2].aClass50_1 = local6;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([IIIIII)V")
	public void method523(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class3_Sub5 local8 = this.aClass3_Sub5ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class26 local14 = local8.aClass26_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt878;
			if (local19 != 0) {
				for (local24 = 0; local24 < 4; local24++) {
					arg0[arg1] = local19;
					arg0[arg1 + 1] = local19;
					arg0[arg1 + 2] = local19;
					arg0[arg1 + 3] = local19;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(59) Class4 local59 = local8.aClass4_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt117;
		@Pc(68) int local68 = local59.anInt118;
		@Pc(71) int local71 = local59.anInt115;
		@Pc(74) int local74 = local59.anInt116;
		@Pc(79) int[] local79 = this.anIntArrayArray25[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray26[local68];
		@Pc(86) int local86 = 0;
		@Pc(90) int local90;
		if (local71 != 0) {
			for (local90 = 0; local90 < 4; local90++) {
				arg0[arg1] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg0[arg1 + 1] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg0[arg1 + 2] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg0[arg1 + 3] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg1 += 512;
			}
			return;
		}
		for (local90 = 0; local90 < 4; local90++) {
			if (local79[local84[local86++]] != 0) {
				arg0[arg1] = local74;
			}
			if (local79[local84[local86++]] != 0) {
				arg0[arg1 + 1] = local74;
			}
			if (local79[local84[local86++]] != 0) {
				arg0[arg1 + 2] = local74;
			}
			if (local79[local84[local86++]] != 0) {
				arg0[arg1 + 3] = local74;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "(III)V")
	public void method524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub5 local8 = this.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass50_1 = null;
		}
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "()V")
	public void method525() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt677; local1++) {
			@Pc(7) Class10 local7 = this.aClass10Array3[local1];
			this.method528(local7);
			this.aClass10Array3[local1] = null;
		}
		this.anInt677 = 0;
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(IIII)Z")
	private boolean method527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method491(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(11) int local11 = arg1 << 7;
		@Pc(15) int local15 = arg2 << 7;
		@Pc(26) int local26 = this.anIntArrayArrayArray3[arg0][arg1][arg2] - 1;
		@Pc(30) int local30 = local26 - 120;
		@Pc(34) int local34 = local26 - 230;
		@Pc(38) int local38 = local26 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local11 > Static26.anInt666) {
					if (!this.method537(local11, local26, local15)) {
						return false;
					}
					if (!this.method537(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method537(local11, local30, local15)) {
						return false;
					}
					if (!this.method537(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method537(local11, local34, local15)) {
					return false;
				}
				if (!this.method537(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static26.anInt668) {
					if (!this.method537(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method537(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method537(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method537(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method537(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method537(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static26.anInt666) {
					if (!this.method537(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method537(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method537(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method537(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method537(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method537(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static26.anInt668) {
					if (!this.method537(local11, local26, local15)) {
						return false;
					}
					if (!this.method537(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method537(local11, local30, local15)) {
						return false;
					}
					if (!this.method537(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method537(local11, local34, local15)) {
					return false;
				}
				if (!this.method537(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method537(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method537(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method537(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method537(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method537(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!c;)V")
	private void method528(@OriginalArg(0) Class10 arg0) {
		for (@Pc(2) int local2 = arg0.anInt259; local2 <= arg0.anInt258; local2++) {
			for (@Pc(6) int local6 = arg0.anInt252; local6 <= arg0.anInt261; local6++) {
				@Pc(17) Class3_Sub5 local17 = this.aClass3_Sub5ArrayArrayArray1[arg0.anInt263][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt452; local21++) {
						if (local17.aClass10Array1[local21] == arg0) {
							local17.anInt452--;
							for (local36 = local21; local36 < local17.anInt452; local36++) {
								local17.aClass10Array1[local36] = local17.aClass10Array1[local36 + 1];
								local17.anIntArray63[local36] = local17.anIntArray63[local36 + 1];
							}
							local17.aClass10Array1[local17.anInt452] = null;
							break;
						}
					}
					local17.anInt449 = 0;
					for (local36 = 0; local36 < local17.anInt452; local36++) {
						local17.anInt449 |= local17.anIntArray63[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
	public void method529(@OriginalArg(0) int arg0) {
		this.anInt676 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt674; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt669; local7++) {
				if (this.aClass3_Sub5ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass3_Sub5ArrayArrayArray1[arg0][local4][local7] = new Class3_Sub5(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "(III)I")
	public int method531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub5 local8 = this.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass50_1 == null ? 0 : local8.aClass50_1.anInt2184;
	}

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "(III)V")
	public void method532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub5 local8 = this.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass63_1 = null;
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(IIIIII)Z")
	private boolean method533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray2[arg0][local17][local21] == -Static26.anInt660) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray3[arg0][arg1][arg3] - arg5;
			if (!this.method537(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method537(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method537(local21, local167, local195)) {
				return false;
			} else if (this.method537(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method491(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method537(local17 + 1, this.anIntArrayArrayArray3[arg0][arg1][arg3] - arg5, local21 + 1) && this.method537(local17 + 128 - 1, this.anIntArrayArrayArray3[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method537(local17 + 128 - 1, this.anIntArrayArrayArray3[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method537(local17 + 1, this.anIntArrayArrayArray3[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "(IIII)I")
	public int method535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub5 local8 = this.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass43_1 != null && local8.aClass43_1.anInt1814 == arg3) {
			return local8.aClass43_1.anInt1820 & 0xFF;
		} else if (local8.aClass34_1 != null && local8.aClass34_1.anInt1434 == arg3) {
			return local8.aClass34_1.anInt1431 & 0xFF;
		} else if (local8.aClass50_1 != null && local8.aClass50_1.anInt2184 == arg3) {
			return local8.aClass50_1.anInt2182 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt452; local56++) {
				if (local8.aClass10Array1[local56].anInt246 == arg3) {
					return local8.aClass10Array1[local56].anInt254 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(II)V")
	public void method536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static26.aBoolean37 = true;
		Static26.anInt672 = arg0;
		Static26.anInt683 = arg1;
		Static26.anInt662 = -1;
		Static26.anInt678 = -1;
	}

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "(III)Z")
	private boolean method537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static26.anInt664; local1++) {
			@Pc(6) Class25 local6 = Static26.aClass25Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt856 == 1) {
				local15 = local6.anInt858 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt866 + (local6.anInt863 * local15 >> 8);
					local37 = local6.anInt862 + (local6.anInt854 * local15 >> 8);
					local47 = local6.anInt857 + (local6.anInt868 * local15 >> 8);
					local57 = local6.anInt859 + (local6.anInt867 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt856 == 2) {
				local15 = arg0 - local6.anInt858;
				if (local15 > 0) {
					local27 = local6.anInt866 + (local6.anInt863 * local15 >> 8);
					local37 = local6.anInt862 + (local6.anInt854 * local15 >> 8);
					local47 = local6.anInt857 + (local6.anInt868 * local15 >> 8);
					local57 = local6.anInt859 + (local6.anInt867 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt856 == 3) {
				local15 = local6.anInt866 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt858 + (local6.anInt855 * local15 >> 8);
					local37 = local6.anInt861 + (local6.anInt865 * local15 >> 8);
					local47 = local6.anInt857 + (local6.anInt868 * local15 >> 8);
					local57 = local6.anInt859 + (local6.anInt867 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt856 == 4) {
				local15 = arg2 - local6.anInt866;
				if (local15 > 0) {
					local27 = local6.anInt858 + (local6.anInt855 * local15 >> 8);
					local37 = local6.anInt861 + (local6.anInt865 * local15 >> 8);
					local47 = local6.anInt857 + (local6.anInt868 * local15 >> 8);
					local57 = local6.anInt859 + (local6.anInt867 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt856 == 5) {
				local15 = arg1 - local6.anInt857;
				if (local15 > 0) {
					local27 = local6.anInt858 + (local6.anInt855 * local15 >> 8);
					local37 = local6.anInt861 + (local6.anInt865 * local15 >> 8);
					local47 = local6.anInt866 + (local6.anInt863 * local15 >> 8);
					local57 = local6.anInt862 + (local6.anInt854 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "(III)V")
	public void method538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub5 local8 = this.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt452; local13++) {
			@Pc(19) Class10 local19 = local8.aClass10Array1[local13];
			if ((local19.anInt246 >> 29 & 0x3) == 2 && local19.anInt259 == arg1 && local19.anInt252 == arg2) {
				this.method528(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!de;III)V")
	private void method539(@OriginalArg(0) Class3_Sub3_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class3_Sub5 local14;
		@Pc(29) Class3_Sub3_Sub1_Sub1 local29;
		if (arg2 < this.anInt674) {
			local14 = this.aClass3_Sub5ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass50_1 != null && local14.aClass50_1.aClass3_Sub3_Sub1_5 instanceof Class3_Sub3_Sub1_Sub1) {
				local29 = (Class3_Sub3_Sub1_Sub1) local14.aClass50_1.aClass3_Sub3_Sub1_5;
				if (local29.aClass62Array2 != null) {
					this.method496(arg0, local29, 128, 0, 0, true);
				}
			}
		}
		if (arg3 < this.anInt674) {
			local14 = this.aClass3_Sub5ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass50_1 != null && local14.aClass50_1.aClass3_Sub3_Sub1_5 instanceof Class3_Sub3_Sub1_Sub1) {
				local29 = (Class3_Sub3_Sub1_Sub1) local14.aClass50_1.aClass3_Sub3_Sub1_5;
				if (local29.aClass62Array2 != null) {
					this.method496(arg0, local29, 0, 0, 128, true);
				}
			}
		}
		if (arg2 < this.anInt674 && arg3 < this.anInt669) {
			local14 = this.aClass3_Sub5ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass50_1 != null && local14.aClass50_1.aClass3_Sub3_Sub1_5 instanceof Class3_Sub3_Sub1_Sub1) {
				local29 = (Class3_Sub3_Sub1_Sub1) local14.aClass50_1.aClass3_Sub3_Sub1_5;
				if (local29.aClass62Array2 != null) {
					this.method496(arg0, local29, 128, 0, 128, true);
				}
			}
		}
		if (arg2 >= this.anInt674 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass3_Sub5ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass50_1 != null && local14.aClass50_1.aClass3_Sub3_Sub1_5 instanceof Class3_Sub3_Sub1_Sub1) {
			local29 = (Class3_Sub3_Sub1_Sub1) local14.aClass50_1.aClass3_Sub3_Sub1_5;
			if (local29.aClass62Array2 != null) {
				this.method496(arg0, local29, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!ae;IIIIII)V")
	private void method540(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray17.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray17[local5] - Static26.anInt666;
			local20 = arg0.anIntArray20[local5] - Static26.anInt665;
			local27 = arg0.anIntArray23[local5] - Static26.anInt668;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray22 != null) {
				Static5.anIntArray25[local5] = local37;
				Static5.anIntArray29[local5] = local59;
				Static5.anIntArray24[local5] = local69;
			}
			Static5.anIntArray19[local5] = Static51.anInt1370 + (local37 << 9) / local69;
			Static5.anIntArray18[local5] = Static51.anInt1368 + (local59 << 9) / local69;
		}
		Static51.anInt1369 = 0;
		local3 = arg0.anIntArray27.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray27[local13];
			local27 = arg0.anIntArray21[local13];
			local37 = arg0.anIntArray26[local13];
			@Pc(142) int local142 = Static5.anIntArray19[local20];
			@Pc(146) int local146 = Static5.anIntArray19[local27];
			@Pc(150) int local150 = Static5.anIntArray19[local37];
			@Pc(154) int local154 = Static5.anIntArray18[local20];
			@Pc(158) int local158 = Static5.anIntArray18[local27];
			@Pc(162) int local162 = Static5.anIntArray18[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static51.aBoolean72 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static51.anInt1373 || local146 > Static51.anInt1373 || local150 > Static51.anInt1373) {
					Static51.aBoolean72 = true;
				}
				if (Static26.aBoolean37 && this.method534(Static26.anInt672, Static26.anInt683, local154, local158, local162, local142, local146, local150)) {
					Static26.anInt662 = arg5;
					Static26.anInt678 = arg6;
				}
				if (arg0.anIntArray22 == null || arg0.anIntArray22[local13] == -1) {
					if (arg0.anIntArray30[local13] != 12345678) {
						Static51.method1013(local154, local158, local162, local142, local146, local150, arg0.anIntArray30[local13], arg0.anIntArray16[local13], arg0.anIntArray28[local13]);
					}
				} else if (Static26.aBoolean38) {
					@Pc(364) int local364 = Static51.anInterface4_1.method1547(arg0.anIntArray22[local13]);
					Static51.method1013(local154, local158, local162, local142, local146, local150, Static26.method526(local364, arg0.anIntArray30[local13]), Static26.method526(local364, arg0.anIntArray16[local13]), Static26.method526(local364, arg0.anIntArray28[local13]));
				} else if (arg0.aBoolean4) {
					Static51.method1023(local154, local158, local162, local142, local146, local150, arg0.anIntArray30[local13], arg0.anIntArray16[local13], arg0.anIntArray28[local13], Static5.anIntArray25[0], Static5.anIntArray25[1], Static5.anIntArray25[3], Static5.anIntArray29[0], Static5.anIntArray29[1], Static5.anIntArray29[3], Static5.anIntArray24[0], Static5.anIntArray24[1], Static5.anIntArray24[3], arg0.anIntArray22[local13]);
				} else {
					Static51.method1023(local154, local158, local162, local142, local146, local150, arg0.anIntArray30[local13], arg0.anIntArray16[local13], arg0.anIntArray28[local13], Static5.anIntArray25[local20], Static5.anIntArray25[local27], Static5.anIntArray25[local37], Static5.anIntArray29[local20], Static5.anIntArray29[local27], Static5.anIntArray29[local37], Static5.anIntArray24[local20], Static5.anIntArray24[local27], Static5.anIntArray24[local37], arg0.anIntArray22[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "(III)Lclient!kc;")
	public Class34 method541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub5 local8 = this.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass34_1;
	}
}
