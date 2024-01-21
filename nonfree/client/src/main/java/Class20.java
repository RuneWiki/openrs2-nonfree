import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class20 {

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "[Lclient!vc;")
	private final Class61[] aClass61Array1 = new Class61[5000];

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
	private int anInt670 = 0;

	@OriginalMember(owner = "client!ed", name = "C", descriptor = "I")
	private int anInt687 = 0;

	@OriginalMember(owner = "client!ed", name = "Q", descriptor = "[[I")
	private final int[][] anIntArrayArray6 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!ed", name = "S", descriptor = "[[I")
	private final int[][] anIntArrayArray7 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!ed", name = "R", descriptor = "[I")
	private final int[] anIntArray61 = new int[10000];

	@OriginalMember(owner = "client!ed", name = "U", descriptor = "[I")
	private final int[] anIntArray62 = new int[10000];

	@OriginalMember(owner = "client!ed", name = "T", descriptor = "I")
	private int anInt696 = 0;

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
	private final int anInt679;

	@OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
	private final int anInt693;

	@OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
	private final int anInt682;

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "[[[Lclient!hc;")
	private final Class1_Sub6[][][] aClass1_Sub6ArrayArrayArray1;

	@OriginalMember(owner = "client!ed", name = "L", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!ed", name = "v", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(III[[[I)V")
	public Class20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt679 = arg0;
		this.anInt693 = arg1;
		this.anInt682 = arg2;
		this.aClass1_Sub6ArrayArrayArray1 = new Class1_Sub6[arg0][arg1][arg2];
		this.anIntArrayArrayArray3 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray2 = arg3;
		this.method499();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIII)V")
	public void method449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt693 * 128) {
			arg0 = this.anInt693 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt682 * 128) {
			arg2 = this.anInt682 * 128 - 1;
		}
		Static22.anInt675++;
		Static22.anInt680 = Static76.anIntArray301[arg3];
		Static22.anInt684 = Static76.anIntArray306[arg3];
		Static22.anInt677 = Static76.anIntArray301[arg4];
		Static22.anInt676 = Static76.anIntArray306[arg4];
		Static22.aBooleanArrayArray1 = Static22.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static22.anInt694 = arg0;
		Static22.anInt689 = arg1;
		Static22.anInt672 = arg2;
		Static22.anInt674 = arg0 / 128;
		Static22.anInt686 = arg2 / 128;
		Static22.anInt685 = arg5;
		Static22.anInt688 = Static22.anInt674 - 25;
		if (Static22.anInt688 < 0) {
			Static22.anInt688 = 0;
		}
		Static22.anInt695 = Static22.anInt686 - 25;
		if (Static22.anInt695 < 0) {
			Static22.anInt695 = 0;
		}
		Static22.anInt673 = Static22.anInt674 + 25;
		if (Static22.anInt673 > this.anInt693) {
			Static22.anInt673 = this.anInt693;
		}
		Static22.anInt678 = Static22.anInt686 + 25;
		if (Static22.anInt678 > this.anInt682) {
			Static22.anInt678 = this.anInt682;
		}
		this.method484();
		Static22.anInt681 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt670; local128 < this.anInt679; local128++) {
			@Pc(134) Class1_Sub6[][] local134 = this.aClass1_Sub6ArrayArrayArray1[local128];
			for (local136 = Static22.anInt688; local136 < Static22.anInt673; local136++) {
				for (local139 = Static22.anInt695; local139 < Static22.anInt678; local139++) {
					@Pc(146) Class1_Sub6 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt944 <= arg5 && (Static22.aBooleanArrayArray1[local136 + 25 - Static22.anInt674][local139 + 25 - Static22.anInt686] || this.anIntArrayArrayArray2[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean48 = true;
							local146.aBoolean49 = true;
							if (local146.anInt941 > 0) {
								local146.aBoolean47 = true;
							} else {
								local146.aBoolean47 = false;
							}
							Static22.anInt681++;
						} else {
							local146.aBoolean48 = false;
							local146.aBoolean49 = false;
							local146.anInt934 = 0;
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
		for (@Pc(224) int local224 = this.anInt670; local224 < this.anInt679; local224++) {
			@Pc(230) Class1_Sub6[][] local230 = this.aClass1_Sub6ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static22.anInt674 + local139;
				local241 = Static22.anInt674 - local139;
				if (local237 >= Static22.anInt688 || local241 < Static22.anInt673) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static22.anInt686 + local249;
						local258 = Static22.anInt686 - local249;
						@Pc(270) Class1_Sub6 local270;
						if (local237 >= Static22.anInt688) {
							if (local254 >= Static22.anInt695) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean48) {
									this.method473(local270, true);
								}
							}
							if (local258 < Static22.anInt678) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean48) {
									this.method473(local270, true);
								}
							}
						}
						if (local241 < Static22.anInt673) {
							if (local254 >= Static22.anInt695) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean48) {
									this.method473(local270, true);
								}
							}
							if (local258 < Static22.anInt678) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean48) {
									this.method473(local270, true);
								}
							}
						}
						if (Static22.anInt681 == 0) {
							Static22.aBoolean31 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt670; local136 < this.anInt679; local136++) {
			@Pc(361) Class1_Sub6[][] local361 = this.aClass1_Sub6ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static22.anInt674 + local237;
				local249 = Static22.anInt674 - local237;
				if (local241 >= Static22.anInt688 || local249 < Static22.anInt673) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static22.anInt686 + local254;
						@Pc(389) int local389 = Static22.anInt686 - local254;
						@Pc(401) Class1_Sub6 local401;
						if (local241 >= Static22.anInt688) {
							if (local258 >= Static22.anInt695) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean48) {
									this.method473(local401, false);
								}
							}
							if (local389 < Static22.anInt678) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean48) {
									this.method473(local401, false);
								}
							}
						}
						if (local249 < Static22.anInt673) {
							if (local258 >= Static22.anInt695) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean48) {
									this.method473(local401, false);
								}
							}
							if (local389 < Static22.anInt678) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean48) {
									this.method473(local401, false);
								}
							}
						}
						if (Static22.anInt681 == 0) {
							Static22.aBoolean31 = false;
							return;
						}
					}
				}
			}
		}
		Static22.aBoolean31 = false;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)Lclient!vc;")
	public Class61 method450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt941; local14++) {
			@Pc(20) Class61 local20 = local8.aClass61Array3[local14];
			if ((local20.anInt2677 >> 29 & 0x3) == 2 && local20.anInt2671 == arg1 && local20.anInt2668 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!pc;Lclient!pc;IIIZ)V")
	private void method451(@OriginalArg(0) Class1_Sub1_Sub8_Sub3 arg0, @OriginalArg(1) Class1_Sub1_Sub8_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg1.method1367();
		this.anInt696++;
		@Pc(9) int local9 = 0;
		@Pc(12) int[] local12 = arg1.anIntArray275;
		@Pc(15) int local15 = arg1.anInt1944;
		for (@Pc(17) int local17 = 0; local17 < arg0.anInt1944; local17++) {
			@Pc(23) Class24 local23 = arg0.aClass24Array1[local17];
			@Pc(28) Class24 local28 = arg0.aClass24Array2[local17];
			if (local28.anInt818 != 0) {
				@Pc(38) int local38 = arg0.anIntArray274[local17] - arg3;
				if (local38 <= arg1.anInt1941) {
					@Pc(49) int local49 = arg0.anIntArray275[local17] - arg2;
					if (local49 >= arg1.anInt1945 && local49 <= arg1.anInt1935) {
						@Pc(65) int local65 = arg0.anIntArray283[local17] - arg4;
						if (local65 >= arg1.anInt1938 && local65 <= arg1.anInt1937) {
							for (@Pc(76) int local76 = 0; local76 < local15; local76++) {
								@Pc(82) Class24 local82 = arg1.aClass24Array1[local76];
								@Pc(87) Class24 local87 = arg1.aClass24Array2[local76];
								if (local49 == local12[local76] && local65 == arg1.anIntArray283[local76] && local38 == arg1.anIntArray274[local76] && local87.anInt818 != 0) {
									local23.anInt813 += local87.anInt813;
									local23.anInt821 += local87.anInt821;
									local23.anInt822 += local87.anInt822;
									local23.anInt818 += local87.anInt818;
									local82.anInt813 += local28.anInt813;
									local82.anInt821 += local28.anInt821;
									local82.anInt822 += local28.anInt822;
									local82.anInt818 += local28.anInt818;
									local9++;
									this.anIntArray62[local17] = this.anInt696;
									this.anIntArray61[local76] = this.anInt696;
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
		for (@Pc(193) int local193 = 0; local193 < arg0.anInt1939; local193++) {
			if (this.anIntArray62[arg0.anIntArray277[local193]] == this.anInt696 && this.anIntArray62[arg0.anIntArray282[local193]] == this.anInt696 && this.anIntArray62[arg0.anIntArray269[local193]] == this.anInt696) {
				arg0.anIntArray276[local193] = -1;
			}
		}
		for (@Pc(236) int local236 = 0; local236 < arg1.anInt1939; local236++) {
			if (this.anIntArray61[arg1.anIntArray277[local236]] == this.anInt696 && this.anIntArray61[arg1.anIntArray282[local236]] == this.anInt696 && this.anIntArray61[arg1.anIntArray269[local236]] == this.anInt696) {
				arg1.anIntArray276[local236] = -1;
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIILclient!kd;IIIIII)Z")
	public boolean method452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class1_Sub1_Sub8 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method489(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIII)Z")
	private boolean method453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method485(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(11) int local11 = arg1 << 7;
		@Pc(15) int local15 = arg2 << 7;
		@Pc(26) int local26 = this.anIntArrayArrayArray2[arg0][arg1][arg2] - 1;
		@Pc(30) int local30 = local26 - 120;
		@Pc(34) int local34 = local26 - 230;
		@Pc(38) int local38 = local26 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local11 > Static22.anInt694) {
					if (!this.method469(local11, local26, local15)) {
						return false;
					}
					if (!this.method469(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method469(local11, local30, local15)) {
						return false;
					}
					if (!this.method469(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method469(local11, local34, local15)) {
					return false;
				}
				if (!this.method469(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static22.anInt672) {
					if (!this.method469(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method469(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method469(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method469(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method469(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method469(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static22.anInt694) {
					if (!this.method469(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method469(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method469(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method469(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method469(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method469(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static22.anInt672) {
					if (!this.method469(local11, local26, local15)) {
						return false;
					}
					if (!this.method469(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method469(local11, local30, local15)) {
						return false;
					}
					if (!this.method469(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method469(local11, local34, local15)) {
					return false;
				}
				if (!this.method469(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method469(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method469(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method469(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method469(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method469(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(IIII)V")
	public void method454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class65 local14 = local8.aClass65_1;
		if (local14 != null) {
			@Pc(23) int local23 = arg1 * 128 + 64;
			@Pc(29) int local29 = arg2 * 128 + 64;
			local14.anInt2757 = local23 + (local14.anInt2757 - local23) * arg3 / 16;
			local14.anInt2753 = local29 + (local14.anInt2753 - local29) * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIILclient!kd;IIZ)Z")
	public boolean method456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub1_Sub8 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method489(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V")
	public void method457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class1_Sub6 local31 = this.aClass1_Sub6ArrayArrayArray1[local10][arg0][arg1] = this.aClass1_Sub6ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt949--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt941; local41++) {
					@Pc(47) Class61 local47 = local31.aClass61Array3[local41];
					if ((local47.anInt2677 >> 29 & 0x3) == 2 && local47.anInt2671 == arg0 && local47.anInt2668 == arg1) {
						local47.anInt2665--;
					}
				}
			}
		}
		if (this.aClass1_Sub6ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass1_Sub6ArrayArrayArray1[0][arg0][arg1] = new Class1_Sub6(0, arg0, arg1);
		}
		this.aClass1_Sub6ArrayArrayArray1[0][arg0][arg1].aClass1_Sub6_1 = local8;
		this.aClass1_Sub6ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)V")
	public void method459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static22.aBoolean31 = true;
		Static22.anInt669 = arg0;
		Static22.anInt691 = arg1;
		Static22.anInt692 = -1;
		Static22.anInt671 = -1;
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(IIII)I")
	public int method460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass2_1 != null && local8.aClass2_1.anInt97 == arg3) {
			return local8.aClass2_1.anInt92 & 0xFF;
		} else if (local8.aClass65_1 != null && local8.aClass65_1.anInt2763 == arg3) {
			return local8.aClass65_1.anInt2764 & 0xFF;
		} else if (local8.aClass43_1 != null && local8.aClass43_1.anInt1560 == arg3) {
			return local8.aClass43_1.anInt1566 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt941; local56++) {
				if (local8.aClass61Array3[local56].anInt2677 == arg3) {
					return local8.aClass61Array3[local56].anInt2679 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
	public void method461(@OriginalArg(0) int arg0) {
		this.anInt670 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt693; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt682; local7++) {
				if (this.aClass1_Sub6ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass1_Sub6ArrayArrayArray1[arg0][local4][local7] = new Class1_Sub6(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(III)V")
	public void method462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass43_1 = null;
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "()V")
	public void method464() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt687; local1++) {
			@Pc(7) Class61 local7 = this.aClass61Array1[local1];
			this.method479(local7);
			this.aClass61Array1[local1] = null;
		}
		this.anInt687 = 0;
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(IIII)V")
	public void method465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2].anInt944 = arg3;
		}
	}

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "(IIII)Z")
	private boolean method466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method485(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method469(local11 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg2] - arg3, local15 + 1) && this.method469(local11 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method469(local11 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method469(local11 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(III)I")
	public int method467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt941; local14++) {
			@Pc(20) Class61 local20 = local8.aClass61Array3[local14];
			if ((local20.anInt2677 >> 29 & 0x3) == 2 && local20.anInt2671 == arg1 && local20.anInt2668 == arg2) {
				return local20.anInt2677;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([IIIIII)V")
	public void method468(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class17 local14 = local8.aClass17_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt613;
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
		@Pc(59) Class26 local59 = local8.aClass26_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt836;
		@Pc(68) int local68 = local59.anInt838;
		@Pc(71) int local71 = local59.anInt839;
		@Pc(74) int local74 = local59.anInt837;
		@Pc(79) int[] local79 = this.anIntArrayArray6[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray7[local68];
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

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "(III)Z")
	private boolean method469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static22.anInt690; local1++) {
			@Pc(6) Class53 local6 = Static22.aClass53Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt2445 == 1) {
				local15 = local6.anInt2459 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt2447 + (local6.anInt2443 * local15 >> 8);
					local37 = local6.anInt2461 + (local6.anInt2450 * local15 >> 8);
					local47 = local6.anInt2438 + (local6.anInt2453 * local15 >> 8);
					local57 = local6.anInt2449 + (local6.anInt2451 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2445 == 2) {
				local15 = arg0 - local6.anInt2459;
				if (local15 > 0) {
					local27 = local6.anInt2447 + (local6.anInt2443 * local15 >> 8);
					local37 = local6.anInt2461 + (local6.anInt2450 * local15 >> 8);
					local47 = local6.anInt2438 + (local6.anInt2453 * local15 >> 8);
					local57 = local6.anInt2449 + (local6.anInt2451 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2445 == 3) {
				local15 = local6.anInt2447 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt2459 + (local6.anInt2439 * local15 >> 8);
					local37 = local6.anInt2442 + (local6.anInt2441 * local15 >> 8);
					local47 = local6.anInt2438 + (local6.anInt2453 * local15 >> 8);
					local57 = local6.anInt2449 + (local6.anInt2451 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2445 == 4) {
				local15 = arg2 - local6.anInt2447;
				if (local15 > 0) {
					local27 = local6.anInt2459 + (local6.anInt2439 * local15 >> 8);
					local37 = local6.anInt2442 + (local6.anInt2441 * local15 >> 8);
					local47 = local6.anInt2438 + (local6.anInt2453 * local15 >> 8);
					local57 = local6.anInt2449 + (local6.anInt2451 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2445 == 5) {
				local15 = arg1 - local6.anInt2438;
				if (local15 > 0) {
					local27 = local6.anInt2459 + (local6.anInt2439 * local15 >> 8);
					local37 = local6.anInt2442 + (local6.anInt2441 * local15 >> 8);
					local47 = local6.anInt2447 + (local6.anInt2443 * local15 >> 8);
					local57 = local6.anInt2461 + (local6.anInt2450 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "(III)I")
	public int method470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass65_1 == null ? 0 : local8.aClass65_1.anInt2763;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(IIIIII)Z")
	private boolean method471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray3[arg0][local17][local21] == -Static22.anInt675) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray2[arg0][arg1][arg3] - arg5;
			if (!this.method469(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method469(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method469(local21, local167, local195)) {
				return false;
			} else if (this.method469(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method485(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method469(local17 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg3] - arg5, local21 + 1) && this.method469(local17 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method469(local17 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method469(local17 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIILclient!kd;III)Z")
	public boolean method472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub1_Sub8 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method489(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!hc;Z)V")
	private void method473(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) boolean arg1) {
		Static22.aClass22_5.method512(arg0);
		while (true) {
			@Pc(8) Class1_Sub6 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class1_Sub6[][] local31;
			@Pc(49) Class1_Sub6 local49;
			@Pc(251) int local251;
			@Pc(578) int local578;
			@Pc(583) int local583;
			@Pc(588) int local588;
			@Pc(591) int local591;
			@Pc(600) int local600;
			@Pc(942) Class2 local942;
			@Pc(1116) int local1116;
			@Pc(1001) int local1001;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class61 var12;
										@Pc(612) int var19;
										@Pc(335) int var23;
										@Pc(289) boolean var24;
										@Pc(823) Class1_Sub6 var35;
										while (true) {
											do {
												local8 = (Class1_Sub6) Static22.aClass22_5.method517();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean49);
											local17 = local8.anInt935;
											local20 = local8.anInt937;
											local23 = local8.anInt949;
											local26 = local8.anInt943;
											local31 = this.aClass1_Sub6ArrayArrayArray1[local23];
											if (!local8.aBoolean48) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass1_Sub6ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean49) {
														continue;
													}
												}
												if (local17 <= Static22.anInt674 && local17 > Static22.anInt688) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean49 && (local49.aBoolean48 || (local8.anInt945 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static22.anInt674 && local17 < Static22.anInt673 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean49 && (local49.aBoolean48 || (local8.anInt945 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static22.anInt686 && local20 > Static22.anInt695) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean49 && (local49.aBoolean48 || (local8.anInt945 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static22.anInt686 && local20 < Static22.anInt678 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean49 && (local49.aBoolean48 || (local8.anInt945 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean48 = false;
											if (local8.aClass1_Sub6_1 != null) {
												local49 = local8.aClass1_Sub6_1;
												if (local49.aClass17_1 == null) {
													if (local49.aClass26_1 != null && !this.method485(0, local17, local20)) {
														this.method480(local49.aClass26_1, Static22.anInt680, Static22.anInt684, Static22.anInt677, Static22.anInt676, local17, local20);
													}
												} else if (!this.method485(0, local17, local20)) {
													this.method493(local49.aClass17_1, 0, Static22.anInt680, Static22.anInt684, Static22.anInt677, Static22.anInt676, local17, local20);
												}
												@Pc(225) Class2 local225 = local49.aClass2_1;
												if (local225 != null) {
													local225.aClass1_Sub1_Sub8_1.method1840(0, Static22.anInt680, Static22.anInt684, Static22.anInt677, Static22.anInt676, local225.anInt93 - Static22.anInt694, local225.anInt91 - Static22.anInt689, local225.anInt95 - Static22.anInt672, local225.anInt97);
												}
												for (local251 = 0; local251 < local49.anInt941; local251++) {
													var12 = local49.aClass61Array3[local251];
													if (var12 != null) {
														var12.aClass1_Sub1_Sub8_7.method1840(var12.anInt2669, Static22.anInt680, Static22.anInt684, Static22.anInt677, Static22.anInt676, var12.anInt2670 - Static22.anInt694, var12.anInt2681 - Static22.anInt689, var12.anInt2675 - Static22.anInt672, var12.anInt2677);
													}
												}
											}
											var24 = false;
											if (local8.aClass17_1 == null) {
												if (local8.aClass26_1 != null && !this.method485(local26, local17, local20)) {
													var24 = true;
													this.method480(local8.aClass26_1, Static22.anInt680, Static22.anInt684, Static22.anInt677, Static22.anInt676, local17, local20);
												}
											} else if (!this.method485(local26, local17, local20)) {
												var24 = true;
												this.method493(local8.aClass17_1, local26, Static22.anInt680, Static22.anInt684, Static22.anInt677, Static22.anInt676, local17, local20);
											}
											var23 = 0;
											local251 = 0;
											@Pc(340) Class2 local340 = local8.aClass2_1;
											@Pc(343) Class65 local343 = local8.aClass65_1;
											if (local340 != null || local343 != null) {
												if (Static22.anInt674 == local17) {
													var23++;
												} else if (Static22.anInt674 < local17) {
													var23 += 2;
												}
												if (Static22.anInt686 == local20) {
													var23 += 3;
												} else if (Static22.anInt686 > local20) {
													var23 += 6;
												}
												local251 = Static22.anIntArray67[var23];
												local8.anInt942 = Static22.anIntArray63[var23];
											}
											if (local340 != null) {
												if ((local340.anInt96 & Static22.anIntArray65[var23]) == 0) {
													local8.anInt934 = 0;
												} else if (local340.anInt96 == 16) {
													local8.anInt934 = 3;
													local8.anInt932 = Static22.anIntArray64[var23];
													local8.anInt933 = 3 - local8.anInt932;
												} else if (local340.anInt96 == 32) {
													local8.anInt934 = 6;
													local8.anInt932 = Static22.anIntArray69[var23];
													local8.anInt933 = 6 - local8.anInt932;
												} else if (local340.anInt96 == 64) {
													local8.anInt934 = 12;
													local8.anInt932 = Static22.anIntArray68[var23];
													local8.anInt933 = 12 - local8.anInt932;
												} else {
													local8.anInt934 = 9;
													local8.anInt932 = Static22.anIntArray66[var23];
													local8.anInt933 = 9 - local8.anInt932;
												}
												if ((local340.anInt96 & local251) != 0 && !this.method453(local26, local17, local20, local340.anInt96)) {
													local340.aClass1_Sub1_Sub8_1.method1840(0, Static22.anInt680, Static22.anInt684, Static22.anInt677, Static22.anInt676, local340.anInt93 - Static22.anInt694, local340.anInt91 - Static22.anInt689, local340.anInt95 - Static22.anInt672, local340.anInt97);
												}
												if ((local340.anInt90 & local251) != 0 && !this.method453(local26, local17, local20, local340.anInt90)) {
													local340.aClass1_Sub1_Sub8_2.method1840(0, Static22.anInt680, Static22.anInt684, Static22.anInt677, Static22.anInt676, local340.anInt93 - Static22.anInt694, local340.anInt91 - Static22.anInt689, local340.anInt95 - Static22.anInt672, local340.anInt97);
												}
											}
											if (local343 != null && !this.method466(local26, local17, local20, local343.aClass1_Sub1_Sub8_8.anInt2716)) {
												if ((local343.anInt2758 & local251) != 0) {
													local343.aClass1_Sub1_Sub8_8.method1840(local343.anInt2751, Static22.anInt680, Static22.anInt684, Static22.anInt677, Static22.anInt676, local343.anInt2757 - Static22.anInt694, local343.anInt2761 - Static22.anInt689, local343.anInt2753 - Static22.anInt672, local343.anInt2763);
												} else if ((local343.anInt2758 & 0x300) != 0) {
													local578 = local343.anInt2757 - Static22.anInt694;
													local583 = local343.anInt2761 - Static22.anInt689;
													local588 = local343.anInt2753 - Static22.anInt672;
													local591 = local343.anInt2751;
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
													if ((local343.anInt2758 & 0x100) != 0 && var19 < local600) {
														local629 = local578 + Static22.anIntArray56[local591];
														local635 = local588 + Static22.anIntArray59[local591];
														local343.aClass1_Sub1_Sub8_8.method1840(local591 * 512 + 256, Static22.anInt680, Static22.anInt684, Static22.anInt677, Static22.anInt676, local629, local583, local635, local343.anInt2763);
													}
													if ((local343.anInt2758 & 0x200) != 0 && var19 > local600) {
														local629 = local578 + Static22.anIntArray60[local591];
														local635 = local588 + Static22.anIntArray58[local591];
														local343.aClass1_Sub1_Sub8_8.method1840(local591 * 512 + 1280 & 0x7FF, Static22.anInt680, Static22.anInt684, Static22.anInt677, Static22.anInt676, local629, local583, local635, local343.anInt2763);
													}
												}
											}
											if (var24) {
												@Pc(696) Class43 local696 = local8.aClass43_1;
												if (local696 != null) {
													local696.aClass1_Sub1_Sub8_3.method1840(0, Static22.anInt680, Static22.anInt684, Static22.anInt677, Static22.anInt676, local696.anInt1565 - Static22.anInt694, local696.anInt1569 - Static22.anInt689, local696.anInt1568 - Static22.anInt672, local696.anInt1560);
												}
												@Pc(723) Class49 local723 = local8.aClass49_1;
												if (local723 != null && local723.anInt2120 == 0) {
													if (local723.aClass1_Sub1_Sub8_4 != null) {
														local723.aClass1_Sub1_Sub8_4.method1840(0, Static22.anInt680, Static22.anInt684, Static22.anInt677, Static22.anInt676, local723.anInt2126 - Static22.anInt694, local723.anInt2127 - Static22.anInt689, local723.anInt2117 - Static22.anInt672, local723.anInt2122);
													}
													if (local723.aClass1_Sub1_Sub8_6 != null) {
														local723.aClass1_Sub1_Sub8_6.method1840(0, Static22.anInt680, Static22.anInt684, Static22.anInt677, Static22.anInt676, local723.anInt2126 - Static22.anInt694, local723.anInt2127 - Static22.anInt689, local723.anInt2117 - Static22.anInt672, local723.anInt2122);
													}
													if (local723.aClass1_Sub1_Sub8_5 != null) {
														local723.aClass1_Sub1_Sub8_5.method1840(0, Static22.anInt680, Static22.anInt684, Static22.anInt677, Static22.anInt676, local723.anInt2126 - Static22.anInt694, local723.anInt2127 - Static22.anInt689, local723.anInt2117 - Static22.anInt672, local723.anInt2122);
													}
												}
											}
											local578 = local8.anInt945;
											if (local578 != 0) {
												if (local17 < Static22.anInt674 && (local578 & 0x4) != 0) {
													var35 = local31[local17 + 1][local20];
													if (var35 != null && var35.aBoolean49) {
														Static22.aClass22_5.method512(var35);
													}
												}
												if (local20 < Static22.anInt686 && (local578 & 0x2) != 0) {
													var35 = local31[local17][local20 + 1];
													if (var35 != null && var35.aBoolean49) {
														Static22.aClass22_5.method512(var35);
													}
												}
												if (local17 > Static22.anInt674 && (local578 & 0x1) != 0) {
													var35 = local31[local17 - 1][local20];
													if (var35 != null && var35.aBoolean49) {
														Static22.aClass22_5.method512(var35);
													}
												}
												if (local20 > Static22.anInt686 && (local578 & 0x8) != 0) {
													var35 = local31[local17][local20 - 1];
													if (var35 != null && var35.aBoolean49) {
														Static22.aClass22_5.method512(var35);
													}
												}
											}
											break;
										}
										if (local8.anInt934 != 0) {
											var24 = true;
											for (var23 = 0; var23 < local8.anInt941; var23++) {
												if (local8.aClass61Array3[var23].anInt2682 != Static22.anInt675 && (local8.anIntArray129[var23] & local8.anInt934) == local8.anInt932) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												local942 = local8.aClass2_1;
												if (!this.method453(local26, local17, local20, local942.anInt96)) {
													local942.aClass1_Sub1_Sub8_1.method1840(0, Static22.anInt680, Static22.anInt684, Static22.anInt677, Static22.anInt676, local942.anInt93 - Static22.anInt694, local942.anInt91 - Static22.anInt689, local942.anInt95 - Static22.anInt672, local942.anInt97);
												}
												local8.anInt934 = 0;
											}
										}
										if (!local8.aBoolean47) {
											break;
										}
										try {
											@Pc(981) int local981 = local8.anInt941;
											local8.aBoolean47 = false;
											var23 = 0;
											label559: for (local251 = 0; local251 < local981; local251++) {
												var12 = local8.aClass61Array3[local251];
												if (var12.anInt2682 != Static22.anInt675) {
													for (local1001 = var12.anInt2671; local1001 <= var12.anInt2673; local1001++) {
														for (local578 = var12.anInt2668; local578 <= var12.anInt2680; local578++) {
															var35 = local31[local1001][local578];
															if (var35.aBoolean48) {
																local8.aBoolean47 = true;
																continue label559;
															}
															if (var35.anInt934 != 0) {
																local588 = 0;
																if (local1001 > var12.anInt2671) {
																	local588++;
																}
																if (local1001 < var12.anInt2673) {
																	local588 += 4;
																}
																if (local578 > var12.anInt2668) {
																	local588 += 8;
																}
																if (local578 < var12.anInt2680) {
																	local588 += 2;
																}
																if ((local588 & var35.anInt934) == local8.anInt933) {
																	local8.aBoolean47 = true;
																	continue label559;
																}
															}
														}
													}
													Static22.aClass61Array2[var23++] = var12;
													local578 = Static22.anInt674 - var12.anInt2671;
													local583 = var12.anInt2673 - Static22.anInt674;
													if (local583 > local578) {
														local578 = local583;
													}
													local588 = Static22.anInt686 - var12.anInt2668;
													local591 = var12.anInt2680 - Static22.anInt686;
													if (local591 > local588) {
														var12.anInt2666 = local578 + local591;
													} else {
														var12.anInt2666 = local578 + local588;
													}
												}
											}
											while (var23 > 0) {
												local1116 = -50;
												local1001 = -1;
												@Pc(1125) Class61 local1125;
												for (local578 = 0; local578 < var23; local578++) {
													local1125 = Static22.aClass61Array2[local578];
													if (local1125.anInt2682 != Static22.anInt675) {
														if (local1125.anInt2666 > local1116) {
															local1116 = local1125.anInt2666;
															local1001 = local578;
														} else if (local1125.anInt2666 == local1116) {
															local588 = local1125.anInt2670 - Static22.anInt694;
															local591 = local1125.anInt2675 - Static22.anInt672;
															local600 = Static22.aClass61Array2[local1001].anInt2670 - Static22.anInt694;
															var19 = Static22.aClass61Array2[local1001].anInt2675 - Static22.anInt672;
															if (local588 * local588 + local591 * local591 > local600 * local600 + var19 * var19) {
																local1001 = local578;
															}
														}
													}
												}
												if (local1001 == -1) {
													break;
												}
												local1125 = Static22.aClass61Array2[local1001];
												local1125.anInt2682 = Static22.anInt675;
												if (!this.method471(local26, local1125.anInt2671, local1125.anInt2673, local1125.anInt2668, local1125.anInt2680, local1125.aClass1_Sub1_Sub8_7.anInt2716)) {
													local1125.aClass1_Sub1_Sub8_7.method1840(local1125.anInt2669, Static22.anInt680, Static22.anInt684, Static22.anInt677, Static22.anInt676, local1125.anInt2670 - Static22.anInt694, local1125.anInt2681 - Static22.anInt689, local1125.anInt2675 - Static22.anInt672, local1125.anInt2677);
												}
												for (local588 = local1125.anInt2671; local588 <= local1125.anInt2673; local588++) {
													for (local591 = local1125.anInt2668; local591 <= local1125.anInt2680; local591++) {
														@Pc(1250) Class1_Sub6 local1250 = local31[local588][local591];
														if (local1250.anInt934 != 0) {
															Static22.aClass22_5.method512(local1250);
														} else if ((local588 != local17 || local591 != local20) && local1250.aBoolean49) {
															Static22.aClass22_5.method512(local1250);
														}
													}
												}
											}
											if (!local8.aBoolean47) {
												break;
											}
										} catch (@Pc(1288) Exception local1288) {
											local8.aBoolean47 = false;
											break;
										}
									}
								} while (!local8.aBoolean49);
							} while (local8.anInt934 != 0);
							if (local17 > Static22.anInt674 || local17 <= Static22.anInt688) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean49);
						if (local17 < Static22.anInt674 || local17 >= Static22.anInt673 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean49);
					if (local20 > Static22.anInt686 || local20 <= Static22.anInt695) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean49);
				if (local20 < Static22.anInt686 || local20 >= Static22.anInt678 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean49);
			local8.aBoolean49 = false;
			Static22.anInt681--;
			@Pc(1392) Class49 local1392 = local8.aClass49_1;
			if (local1392 != null && local1392.anInt2120 != 0) {
				if (local1392.aClass1_Sub1_Sub8_4 != null) {
					local1392.aClass1_Sub1_Sub8_4.method1840(0, Static22.anInt680, Static22.anInt684, Static22.anInt677, Static22.anInt676, local1392.anInt2126 - Static22.anInt694, local1392.anInt2127 - Static22.anInt689 - local1392.anInt2120, local1392.anInt2117 - Static22.anInt672, local1392.anInt2122);
				}
				if (local1392.aClass1_Sub1_Sub8_6 != null) {
					local1392.aClass1_Sub1_Sub8_6.method1840(0, Static22.anInt680, Static22.anInt684, Static22.anInt677, Static22.anInt676, local1392.anInt2126 - Static22.anInt694, local1392.anInt2127 - Static22.anInt689 - local1392.anInt2120, local1392.anInt2117 - Static22.anInt672, local1392.anInt2122);
				}
				if (local1392.aClass1_Sub1_Sub8_5 != null) {
					local1392.aClass1_Sub1_Sub8_5.method1840(0, Static22.anInt680, Static22.anInt684, Static22.anInt677, Static22.anInt676, local1392.anInt2126 - Static22.anInt694, local1392.anInt2127 - Static22.anInt689 - local1392.anInt2120, local1392.anInt2117 - Static22.anInt672, local1392.anInt2122);
				}
			}
			if (local8.anInt942 != 0) {
				@Pc(1487) Class65 local1487 = local8.aClass65_1;
				if (local1487 != null && !this.method466(local26, local17, local20, local1487.aClass1_Sub1_Sub8_8.anInt2716)) {
					if ((local1487.anInt2758 & local8.anInt942) != 0) {
						local1487.aClass1_Sub1_Sub8_8.method1840(local1487.anInt2751, Static22.anInt680, Static22.anInt684, Static22.anInt677, Static22.anInt676, local1487.anInt2757 - Static22.anInt694, local1487.anInt2761 - Static22.anInt689, local1487.anInt2753 - Static22.anInt672, local1487.anInt2763);
					} else if ((local1487.anInt2758 & 0x300) != 0) {
						local251 = local1487.anInt2757 - Static22.anInt694;
						local1116 = local1487.anInt2761 - Static22.anInt689;
						local1001 = local1487.anInt2753 - Static22.anInt672;
						local578 = local1487.anInt2751;
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
						if ((local1487.anInt2758 & 0x100) != 0 && local588 >= local583) {
							local591 = local251 + Static22.anIntArray56[local578];
							local600 = local1001 + Static22.anIntArray59[local578];
							local1487.aClass1_Sub1_Sub8_8.method1840(local578 * 512 + 256, Static22.anInt680, Static22.anInt684, Static22.anInt677, Static22.anInt676, local591, local1116, local600, local1487.anInt2763);
						}
						if ((local1487.anInt2758 & 0x200) != 0 && local588 <= local583) {
							local591 = local251 + Static22.anIntArray60[local578];
							local600 = local1001 + Static22.anIntArray58[local578];
							local1487.aClass1_Sub1_Sub8_8.method1840(local578 * 512 + 1280 & 0x7FF, Static22.anInt680, Static22.anInt684, Static22.anInt677, Static22.anInt676, local591, local1116, local600, local1487.anInt2763);
						}
					}
				}
				local942 = local8.aClass2_1;
				if (local942 != null) {
					if ((local942.anInt90 & local8.anInt942) != 0 && !this.method453(local26, local17, local20, local942.anInt90)) {
						local942.aClass1_Sub1_Sub8_2.method1840(0, Static22.anInt680, Static22.anInt684, Static22.anInt677, Static22.anInt676, local942.anInt93 - Static22.anInt694, local942.anInt91 - Static22.anInt689, local942.anInt95 - Static22.anInt672, local942.anInt97);
					}
					if ((local942.anInt96 & local8.anInt942) != 0 && !this.method453(local26, local17, local20, local942.anInt96)) {
						local942.aClass1_Sub1_Sub8_1.method1840(0, Static22.anInt680, Static22.anInt684, Static22.anInt677, Static22.anInt676, local942.anInt93 - Static22.anInt694, local942.anInt91 - Static22.anInt689, local942.anInt95 - Static22.anInt672, local942.anInt97);
					}
				}
			}
			@Pc(1745) Class1_Sub6 local1745;
			if (local23 < this.anInt679 - 1) {
				local1745 = this.aClass1_Sub6ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1745 != null && local1745.aBoolean49) {
					Static22.aClass22_5.method512(local1745);
				}
			}
			if (local17 < Static22.anInt674) {
				local1745 = local31[local17 + 1][local20];
				if (local1745 != null && local1745.aBoolean49) {
					Static22.aClass22_5.method512(local1745);
				}
			}
			if (local20 < Static22.anInt686) {
				local1745 = local31[local17][local20 + 1];
				if (local1745 != null && local1745.aBoolean49) {
					Static22.aClass22_5.method512(local1745);
				}
			}
			if (local17 > Static22.anInt674) {
				local1745 = local31[local17 - 1][local20];
				if (local1745 != null && local1745.aBoolean49) {
					Static22.aClass22_5.method512(local1745);
				}
			}
			if (local20 > Static22.anInt686) {
				local1745 = local31[local17][local20 - 1];
				if (local1745 != null && local1745.aBoolean49) {
					Static22.aClass22_5.method512(local1745);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "(III)I")
	public int method474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass2_1 == null ? 0 : local8.aClass2_1.anInt97;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIILclient!kd;ILclient!kd;Lclient!kd;)V")
	public void method475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub8 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub1_Sub8 arg6, @OriginalArg(7) Class1_Sub1_Sub8 arg7) {
		@Pc(3) Class49 local3 = new Class49();
		local3.aClass1_Sub1_Sub8_5 = arg4;
		local3.anInt2126 = arg1 * 128 + 64;
		local3.anInt2117 = arg2 * 128 + 64;
		local3.anInt2127 = arg3;
		local3.anInt2122 = arg5;
		local3.aClass1_Sub1_Sub8_4 = arg6;
		local3.aClass1_Sub1_Sub8_6 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class1_Sub6 local43 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt941; local47++) {
				if ((local43.aClass61Array3[local47].anInt2679 & 0x100) == 256 && local43.aClass61Array3[local47].aClass1_Sub1_Sub8_7 instanceof Class1_Sub1_Sub8_Sub3) {
					@Pc(71) Class1_Sub1_Sub8_Sub3 local71 = (Class1_Sub1_Sub8_Sub3) local43.aClass61Array3[local47].aClass1_Sub1_Sub8_7;
					local71.method1392();
					if (local71.anInt2716 > local34) {
						local34 = local71.anInt2716;
					}
				}
			}
		}
		local3.anInt2120 = local34;
		if (this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub6(arg0, arg1, arg2);
		}
		this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass49_1 = local3;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!pc;IIIII)V")
	private void method477(@OriginalArg(0) Class1_Sub1_Sub8_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt679) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt693) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt682 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class1_Sub6 local66 = this.aClass1_Sub6ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray2[local17][local24][local34] + this.anIntArrayArrayArray2[local17][local24 + 1][local34] + this.anIntArrayArrayArray2[local17][local24][local34 + 1] + this.anIntArrayArrayArray2[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray2[arg1][arg2][arg3] + this.anIntArrayArrayArray2[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray2[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray2[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class2 local163 = local66.aClass2_1;
									if (local163 != null) {
										@Pc(173) Class1_Sub1_Sub8_Sub3 local173;
										if (local163.aClass1_Sub1_Sub8_1 instanceof Class1_Sub1_Sub8_Sub3) {
											local173 = (Class1_Sub1_Sub8_Sub3) local163.aClass1_Sub1_Sub8_1;
											if (local173.aClass24Array1 != null) {
												this.method451(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
											}
										}
										if (local163.aClass1_Sub1_Sub8_2 instanceof Class1_Sub1_Sub8_Sub3) {
											local173 = (Class1_Sub1_Sub8_Sub3) local163.aClass1_Sub1_Sub8_2;
											if (local173.aClass24Array1 != null) {
												this.method451(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
											}
										}
									}
									for (@Pc(245) int local245 = 0; local245 < local66.anInt941; local245++) {
										@Pc(251) Class61 local251 = local66.aClass61Array3[local245];
										if (local251 != null && local251.aClass1_Sub1_Sub8_7 instanceof Class1_Sub1_Sub8_Sub3) {
											@Pc(261) Class1_Sub1_Sub8_Sub3 local261 = (Class1_Sub1_Sub8_Sub3) local251.aClass1_Sub1_Sub8_7;
											if (local261.aClass24Array1 != null) {
												@Pc(272) int local272 = local251.anInt2673 + 1 - local251.anInt2671;
												@Pc(280) int local280 = local251.anInt2680 + 1 - local251.anInt2668;
												this.method451(arg0, local261, (local251.anInt2671 - arg2) * 128 + (local272 - arg4) * 64, local160, (local251.anInt2668 - arg3) * 128 + (local280 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "(III)V")
	public void method478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass65_1 = null;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!vc;)V")
	private void method479(@OriginalArg(0) Class61 arg0) {
		for (@Pc(2) int local2 = arg0.anInt2671; local2 <= arg0.anInt2673; local2++) {
			for (@Pc(6) int local6 = arg0.anInt2668; local6 <= arg0.anInt2680; local6++) {
				@Pc(17) Class1_Sub6 local17 = this.aClass1_Sub6ArrayArrayArray1[arg0.anInt2665][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt941; local21++) {
						if (local17.aClass61Array3[local21] == arg0) {
							local17.anInt941--;
							for (local36 = local21; local36 < local17.anInt941; local36++) {
								local17.aClass61Array3[local36] = local17.aClass61Array3[local36 + 1];
								local17.anIntArray129[local36] = local17.anIntArray129[local36 + 1];
							}
							local17.aClass61Array3[local17.anInt941] = null;
							break;
						}
					}
					local17.anInt945 = 0;
					for (local36 = 0; local36 < local17.anInt941; local36++) {
						local17.anInt945 |= local17.anIntArray129[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!gb;IIIIII)V")
	private void method480(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray108.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray108[local5] - Static22.anInt694;
			local20 = arg0.anIntArray106[local5] - Static22.anInt689;
			local27 = arg0.anIntArray109[local5] - Static22.anInt672;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray104 != null) {
				Static32.anIntArray101[local5] = local37;
				Static32.anIntArray112[local5] = local59;
				Static32.anIntArray110[local5] = local69;
			}
			Static32.anIntArray99[local5] = Static41.anInt980 + (local37 << 9) / local69;
			Static32.anIntArray113[local5] = Static41.anInt976 + (local59 << 9) / local69;
		}
		Static41.anInt984 = 0;
		local3 = arg0.anIntArray107.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray107[local13];
			local27 = arg0.anIntArray102[local13];
			local37 = arg0.anIntArray111[local13];
			@Pc(142) int local142 = Static32.anIntArray99[local20];
			@Pc(146) int local146 = Static32.anIntArray99[local27];
			@Pc(150) int local150 = Static32.anIntArray99[local37];
			@Pc(154) int local154 = Static32.anIntArray113[local20];
			@Pc(158) int local158 = Static32.anIntArray113[local27];
			@Pc(162) int local162 = Static32.anIntArray113[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static41.aBoolean52 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static41.anInt981 || local146 > Static41.anInt981 || local150 > Static41.anInt981) {
					Static41.aBoolean52 = true;
				}
				if (Static22.aBoolean31 && this.method455(Static22.anInt669, Static22.anInt691, local154, local158, local162, local142, local146, local150)) {
					Static22.anInt692 = arg5;
					Static22.anInt671 = arg6;
				}
				if (arg0.anIntArray104 == null || arg0.anIntArray104[local13] == -1) {
					if (arg0.anIntArray100[local13] != 12345678) {
						Static41.method682(local154, local158, local162, local142, local146, local150, arg0.anIntArray100[local13], arg0.anIntArray103[local13], arg0.anIntArray105[local13]);
					}
				} else if (Static22.aBoolean32) {
					@Pc(364) int local364 = Static41.anInterface4_1.method263(arg0.anIntArray104[local13]);
					Static41.method682(local154, local158, local162, local142, local146, local150, Static22.method490(local364, arg0.anIntArray100[local13]), Static22.method490(local364, arg0.anIntArray103[local13]), Static22.method490(local364, arg0.anIntArray105[local13]));
				} else if (arg0.aBoolean42) {
					Static41.method688(local154, local158, local162, local142, local146, local150, arg0.anIntArray100[local13], arg0.anIntArray103[local13], arg0.anIntArray105[local13], Static32.anIntArray101[0], Static32.anIntArray101[1], Static32.anIntArray101[3], Static32.anIntArray112[0], Static32.anIntArray112[1], Static32.anIntArray112[3], Static32.anIntArray110[0], Static32.anIntArray110[1], Static32.anIntArray110[3], arg0.anIntArray104[local13]);
				} else {
					Static41.method688(local154, local158, local162, local142, local146, local150, arg0.anIntArray100[local13], arg0.anIntArray103[local13], arg0.anIntArray105[local13], Static32.anIntArray101[local20], Static32.anIntArray101[local27], Static32.anIntArray101[local37], Static32.anIntArray112[local20], Static32.anIntArray112[local27], Static32.anIntArray112[local37], Static32.anIntArray110[local20], Static32.anIntArray110[local27], Static32.anIntArray110[local37], arg0.anIntArray104[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "(III)I")
	public int method481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass43_1 == null ? 0 : local8.aClass43_1.anInt1560;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIILclient!kd;IIIIII)V")
	public void method482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub8 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class65 local6 = new Class65();
		local6.anInt2763 = arg9;
		local6.anInt2764 = arg10;
		local6.anInt2757 = arg1 * 128 + arg7 + 64;
		local6.anInt2753 = arg2 * 128 + arg8 + 64;
		local6.anInt2761 = arg3;
		local6.aClass1_Sub1_Sub8_8 = arg4;
		local6.anInt2758 = arg5;
		local6.anInt2751 = arg6;
		for (@Pc(44) int local44 = arg0; local44 >= 0; local44--) {
			if (this.aClass1_Sub6ArrayArrayArray1[local44][arg1][arg2] == null) {
				this.aClass1_Sub6ArrayArrayArray1[local44][arg1][arg2] = new Class1_Sub6(local44, arg1, arg2);
			}
		}
		this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass65_1 = local6;
	}

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "(III)Lclient!n;")
	public Class43 method483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass43_1 == null ? null : local8.aClass43_1;
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "()V")
	private void method484() {
		@Pc(3) int local3 = Static22.anIntArray57[Static22.anInt685];
		@Pc(7) Class53[] local7 = Static22.aClass53ArrayArray1[Static22.anInt685];
		Static22.anInt690 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class53 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt2462 == 1) {
				local27 = local16.anInt2460 + 25 - Static22.anInt674;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2448 + 25 - Static22.anInt686;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2457 + 25 - Static22.anInt686;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static22.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static22.anInt694 - local16.anInt2459;
						if (local79 > 32) {
							local16.anInt2445 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2445 = 2;
							local79 = -local79;
						}
						local16.anInt2443 = (local16.anInt2447 - Static22.anInt672 << 8) / local79;
						local16.anInt2450 = (local16.anInt2461 - Static22.anInt672 << 8) / local79;
						local16.anInt2453 = (local16.anInt2438 - Static22.anInt689 << 8) / local79;
						local16.anInt2451 = (local16.anInt2449 - Static22.anInt689 << 8) / local79;
						Static22.aClass53Array1[Static22.anInt690++] = local16;
					}
				}
			} else if (local16.anInt2462 == 2) {
				local27 = local16.anInt2448 + 25 - Static22.anInt686;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2460 + 25 - Static22.anInt674;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2440 + 25 - Static22.anInt674;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static22.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static22.anInt672 - local16.anInt2447;
						if (local79 > 32) {
							local16.anInt2445 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2445 = 4;
							local79 = -local79;
						}
						local16.anInt2439 = (local16.anInt2459 - Static22.anInt694 << 8) / local79;
						local16.anInt2441 = (local16.anInt2442 - Static22.anInt694 << 8) / local79;
						local16.anInt2453 = (local16.anInt2438 - Static22.anInt689 << 8) / local79;
						local16.anInt2451 = (local16.anInt2449 - Static22.anInt689 << 8) / local79;
						Static22.aClass53Array1[Static22.anInt690++] = local16;
					}
				}
			} else if (local16.anInt2462 == 4) {
				local27 = local16.anInt2438 - Static22.anInt689;
				if (local27 > 128) {
					local40 = local16.anInt2448 + 25 - Static22.anInt686;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2457 + 25 - Static22.anInt686;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt2460 + 25 - Static22.anInt674;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt2440 + 25 - Static22.anInt674;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static22.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt2445 = 5;
							local16.anInt2439 = (local16.anInt2459 - Static22.anInt694 << 8) / local27;
							local16.anInt2441 = (local16.anInt2442 - Static22.anInt694 << 8) / local27;
							local16.anInt2443 = (local16.anInt2447 - Static22.anInt672 << 8) / local27;
							local16.anInt2450 = (local16.anInt2461 - Static22.anInt672 << 8) / local27;
							Static22.aClass53Array1[Static22.anInt690++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "(III)Z")
	private boolean method485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == -Static22.anInt675) {
			return false;
		} else if (local8 == Static22.anInt675) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method469(local23 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg2], local27 + 1) && this.method469(local23 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg2], local27 + 1) && this.method469(local23 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method469(local23 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray3[arg0][arg1][arg2] = Static22.anInt675;
				return true;
			} else {
				this.anIntArrayArrayArray3[arg0][arg1][arg2] = -Static22.anInt675;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "(III)V")
	public void method486() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt679; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt693; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt682; local7++) {
					@Pc(17) Class1_Sub6 local17 = this.aClass1_Sub6ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class2 local22 = local17.aClass2_1;
						if (local22 != null && local22.aClass1_Sub1_Sub8_1 instanceof Class1_Sub1_Sub8_Sub3) {
							@Pc(32) Class1_Sub1_Sub8_Sub3 local32 = (Class1_Sub1_Sub8_Sub3) local22.aClass1_Sub1_Sub8_1;
							if (local32.aClass24Array1 != null) {
								this.method477(local32, local1, local4, local7, 1, 1);
								if (local22.aClass1_Sub1_Sub8_2 instanceof Class1_Sub1_Sub8_Sub3) {
									@Pc(51) Class1_Sub1_Sub8_Sub3 local51 = (Class1_Sub1_Sub8_Sub3) local22.aClass1_Sub1_Sub8_2;
									if (local51.aClass24Array1 != null) {
										this.method477(local51, local1, local4, local7, 1, 1);
										this.method451(local32, local51, 0, 0, 0, false);
										local51.method1374();
									}
								}
								local32.method1374();
							}
						}
						@Pc(98) Class1_Sub1_Sub8_Sub3 local98;
						for (@Pc(82) int local82 = 0; local82 < local17.anInt941; local82++) {
							@Pc(88) Class61 local88 = local17.aClass61Array3[local82];
							if (local88 != null && local88.aClass1_Sub1_Sub8_7 instanceof Class1_Sub1_Sub8_Sub3) {
								local98 = (Class1_Sub1_Sub8_Sub3) local88.aClass1_Sub1_Sub8_7;
								if (local98.aClass24Array1 != null) {
									this.method477(local98, local1, local4, local7, local88.anInt2673 + 1 - local88.anInt2671, local88.anInt2680 - local88.anInt2668 + 1);
									local98.method1374();
								}
							}
						}
						@Pc(134) Class43 local134 = local17.aClass43_1;
						if (local134 != null && local134.aClass1_Sub1_Sub8_3 instanceof Class1_Sub1_Sub8_Sub3) {
							local98 = (Class1_Sub1_Sub8_Sub3) local134.aClass1_Sub1_Sub8_3;
							if (local98.aClass24Array1 != null) {
								this.method500(local98, local1, local4, local7);
								local98.method1374();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "(III)Lclient!wd;")
	public Class65 method487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass65_1;
	}

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "(III)V")
	public void method488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass2_1 = null;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIIILclient!kd;IZII)Z")
	private boolean method489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class1_Sub1_Sub8 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt693 || local4 >= this.anInt682) {
					return false;
				}
				@Pc(28) Class1_Sub6 local28 = this.aClass1_Sub6ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt941 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class61 local52 = new Class61();
		local52.anInt2677 = arg11;
		local52.anInt2679 = arg12;
		local52.anInt2665 = arg0;
		local52.anInt2670 = arg5;
		local52.anInt2675 = arg6;
		local52.anInt2681 = arg7;
		local52.aClass1_Sub1_Sub8_7 = arg8;
		local52.anInt2669 = arg9;
		local52.anInt2671 = arg1;
		local52.anInt2668 = arg2;
		local52.anInt2673 = arg1 + arg3 - 1;
		local52.anInt2680 = arg2 + arg4 - 1;
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
					if (this.aClass1_Sub6ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass1_Sub6ArrayArrayArray1[local130][local98][local101] = new Class1_Sub6(local130, local98, local101);
					}
				}
				@Pc(166) Class1_Sub6 local166 = this.aClass1_Sub6ArrayArrayArray1[arg0][local98][local101];
				local166.aClass61Array3[local166.anInt941] = local52;
				local166.anIntArray129[local166.anInt941] = local104;
				local166.anInt945 |= local104;
				local166.anInt941++;
			}
		}
		if (arg10) {
			this.aClass61Array1[this.anInt687++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "(III)V")
	public void method491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt941; local13++) {
			@Pc(19) Class61 local19 = local8.aClass61Array3[local13];
			if ((local19.anInt2677 >> 29 & 0x3) == 2 && local19.anInt2671 == arg1 && local19.anInt2668 == arg2) {
				this.method479(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "(III)V")
	public void method492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass49_1 = null;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!e;IIIIIII)V")
	private void method493(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static22.anInt694;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static22.anInt672;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray2[arg1][arg6][arg7] - Static22.anInt689;
		@Pc(51) int local51 = this.anIntArrayArrayArray2[arg1][arg6 + 1][arg7] - Static22.anInt689;
		@Pc(66) int local66 = this.anIntArrayArrayArray2[arg1][arg6 + 1][arg7 + 1] - Static22.anInt689;
		@Pc(79) int local79 = this.anIntArrayArrayArray2[arg1][arg6][arg7 + 1] - Static22.anInt689;
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
		@Pc(279) int local279 = Static41.anInt980 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static41.anInt976 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static41.anInt980 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static41.anInt976 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static41.anInt980 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static41.anInt976 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static41.anInt980 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static41.anInt976 + (local89 << 9) / local265;
		Static41.anInt984 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static41.aBoolean52 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static41.anInt981 || local327 > Static41.anInt981 || local295 > Static41.anInt981) {
				Static41.aBoolean52 = true;
			}
			if (Static22.aBoolean31 && this.method455(Static22.anInt669, Static22.anInt691, local319, local335, local303, local311, local327, local295)) {
				Static22.anInt692 = arg6;
				Static22.anInt671 = arg7;
			}
			if (arg0.anInt607 == -1) {
				if (arg0.anInt604 != 12345678) {
					Static41.method682(local319, local335, local303, local311, local327, local295, arg0.anInt604, arg0.anInt603, arg0.anInt609);
				}
			} else if (Static22.aBoolean32) {
				local472 = Static41.anInterface4_1.method263(arg0.anInt607);
				Static41.method682(local319, local335, local303, local311, local327, local295, Static22.method490(local472, arg0.anInt604), Static22.method490(local472, arg0.anInt603), Static22.method490(local472, arg0.anInt609));
			} else if (arg0.aBoolean28) {
				Static41.method688(local319, local335, local303, local311, local327, local295, arg0.anInt604, arg0.anInt603, arg0.anInt609, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt607);
			} else {
				Static41.method688(local319, local335, local303, local311, local327, local295, arg0.anInt604, arg0.anInt603, arg0.anInt609, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt607);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static41.aBoolean52 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static41.anInt981 || local295 > Static41.anInt981 || local327 > Static41.anInt981) {
			Static41.aBoolean52 = true;
		}
		if (Static22.aBoolean31 && this.method455(Static22.anInt669, Static22.anInt691, local287, local303, local335, local279, local295, local327)) {
			Static22.anInt692 = arg6;
			Static22.anInt671 = arg7;
		}
		if (arg0.anInt607 != -1) {
			if (!Static22.aBoolean32) {
				Static41.method688(local287, local303, local335, local279, local295, local327, arg0.anInt606, arg0.anInt609, arg0.anInt603, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt607);
				return;
			}
			local472 = Static41.anInterface4_1.method263(arg0.anInt607);
			Static41.method682(local287, local303, local335, local279, local295, local327, Static22.method490(local472, arg0.anInt606), Static22.method490(local472, arg0.anInt609), Static22.method490(local472, arg0.anInt603));
		} else if (arg0.anInt606 != 12345678) {
			Static41.method682(local287, local303, local335, local279, local295, local327, arg0.anInt606, arg0.anInt609, arg0.anInt603);
			return;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class17 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class17(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass1_Sub6ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass1_Sub6ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub6(local14, arg1, arg2);
				}
			}
			this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass17_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class17(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass1_Sub6ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass1_Sub6ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub6(local14, arg1, arg2);
				}
			}
			this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass17_1 = local12;
		} else {
			@Pc(140) Class26 local140 = new Class26(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass1_Sub6ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass1_Sub6ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub6(local14, arg1, arg2);
				}
			}
			this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass26_1 = local140;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIILclient!kd;II)V")
	public void method496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub8 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class43 local6 = new Class43();
		local6.aClass1_Sub1_Sub8_3 = arg4;
		local6.anInt1565 = arg1 * 128 + 64;
		local6.anInt1568 = arg2 * 128 + 64;
		local6.anInt1569 = arg3;
		local6.anInt1560 = arg5;
		local6.anInt1566 = arg6;
		if (this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub6(arg0, arg1, arg2);
		}
		this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass43_1 = local6;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIILclient!kd;Lclient!kd;IIII)V")
	public void method497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub8 arg4, @OriginalArg(5) Class1_Sub1_Sub8 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class2 local8 = new Class2();
		local8.anInt97 = arg8;
		local8.anInt92 = arg9;
		local8.anInt93 = arg1 * 128 + 64;
		local8.anInt95 = arg2 * 128 + 64;
		local8.anInt91 = arg3;
		local8.aClass1_Sub1_Sub8_1 = arg4;
		local8.aClass1_Sub1_Sub8_2 = arg5;
		local8.anInt96 = arg6;
		local8.anInt90 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass1_Sub6ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass1_Sub6ArrayArrayArray1[local45][arg1][arg2] = new Class1_Sub6(local45, arg1, arg2);
			}
		}
		this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass2_1 = local8;
	}

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "(III)Lclient!ab;")
	public Class2 method498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass2_1;
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "()V")
	public void method499() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt679; local1++) {
			for (local4 = 0; local4 < this.anInt693; local4++) {
				for (local7 = 0; local7 < this.anInt682; local7++) {
					this.aClass1_Sub6ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static22.anInt683; local4++) {
			for (local7 = 0; local7 < Static22.anIntArray57[local4]; local7++) {
				Static22.aClass53ArrayArray1[local4][local7] = null;
			}
			Static22.anIntArray57[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt687; local7++) {
			this.aClass61Array1[local7] = null;
		}
		this.anInt687 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static22.aClass61Array2.length; local76++) {
			Static22.aClass61Array2[local76] = null;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!pc;III)V")
	private void method500(@OriginalArg(0) Class1_Sub1_Sub8_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class1_Sub6 local14;
		@Pc(29) Class1_Sub1_Sub8_Sub3 local29;
		if (arg2 < this.anInt693) {
			local14 = this.aClass1_Sub6ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass43_1 != null && local14.aClass43_1.aClass1_Sub1_Sub8_3 instanceof Class1_Sub1_Sub8_Sub3) {
				local29 = (Class1_Sub1_Sub8_Sub3) local14.aClass43_1.aClass1_Sub1_Sub8_3;
				if (local29.aClass24Array1 != null) {
					this.method451(arg0, local29, 128, 0, 0, true);
				}
			}
		}
		if (arg3 < this.anInt693) {
			local14 = this.aClass1_Sub6ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass43_1 != null && local14.aClass43_1.aClass1_Sub1_Sub8_3 instanceof Class1_Sub1_Sub8_Sub3) {
				local29 = (Class1_Sub1_Sub8_Sub3) local14.aClass43_1.aClass1_Sub1_Sub8_3;
				if (local29.aClass24Array1 != null) {
					this.method451(arg0, local29, 0, 0, 128, true);
				}
			}
		}
		if (arg2 < this.anInt693 && arg3 < this.anInt682) {
			local14 = this.aClass1_Sub6ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass43_1 != null && local14.aClass43_1.aClass1_Sub1_Sub8_3 instanceof Class1_Sub1_Sub8_Sub3) {
				local29 = (Class1_Sub1_Sub8_Sub3) local14.aClass43_1.aClass1_Sub1_Sub8_3;
				if (local29.aClass24Array1 != null) {
					this.method451(arg0, local29, 128, 0, 128, true);
				}
			}
		}
		if (arg2 >= this.anInt693 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass1_Sub6ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass43_1 != null && local14.aClass43_1.aClass1_Sub1_Sub8_3 instanceof Class1_Sub1_Sub8_Sub3) {
			local29 = (Class1_Sub1_Sub8_Sub3) local14.aClass43_1.aClass1_Sub1_Sub8_3;
			if (local29.aClass24Array1 != null) {
				this.method451(arg0, local29, 128, 0, -128, true);
			}
		}
	}
}
