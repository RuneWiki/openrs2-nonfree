import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3 {

	@OriginalMember(owner = "client!ab", name = "s", descriptor = "[Lclient!g;")
	private final Class22[] aClass22Array1 = new Class22[5000];

	@OriginalMember(owner = "client!ab", name = "C", descriptor = "I")
	private int anInt323 = 0;

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
	private int anInt316 = 0;

	@OriginalMember(owner = "client!ab", name = "V", descriptor = "[[I")
	private final int[][] anIntArrayArray1 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!ab", name = "X", descriptor = "[I")
	private final int[] anIntArray32 = new int[10000];

	@OriginalMember(owner = "client!ab", name = "ab", descriptor = "I")
	private int anInt333 = 0;

	@OriginalMember(owner = "client!ab", name = "bb", descriptor = "[I")
	private final int[] anIntArray34 = new int[10000];

	@OriginalMember(owner = "client!ab", name = "db", descriptor = "[[I")
	private final int[][] anIntArrayArray2 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!ab", name = "P", descriptor = "I")
	private final int anInt328;

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
	private final int anInt319;

	@OriginalMember(owner = "client!ab", name = "Q", descriptor = "I")
	private final int anInt329;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "[[[Lclient!fa;")
	private final Class2_Sub6[][][] aClass2_Sub6ArrayArrayArray1;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!ab", name = "F", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(III[[[I)V")
	public Class3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt328 = arg0;
		this.anInt319 = arg1;
		this.anInt329 = arg2;
		this.aClass2_Sub6ArrayArrayArray1 = new Class2_Sub6[arg0][arg1][arg2];
		this.anIntArrayArrayArray1 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray2 = arg3;
		this.method130();
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)I")
	public int method123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass54_1 == null ? 0 : local8.aClass54_1.anInt2317;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)V")
	public void method124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class2_Sub6 local31 = this.aClass2_Sub6ArrayArrayArray1[local10][arg0][arg1] = this.aClass2_Sub6ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt1059--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt1065; local41++) {
					@Pc(47) Class22 local47 = local31.aClass22Array3[local41];
					if ((local47.anInt1226 >> 29 & 0x3) == 2 && local47.anInt1229 == arg0 && local47.anInt1235 == arg1) {
						local47.anInt1225--;
					}
				}
			}
		}
		if (this.aClass2_Sub6ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass2_Sub6ArrayArrayArray1[0][arg0][arg1] = new Class2_Sub6(0, arg0, arg1);
		}
		this.aClass2_Sub6ArrayArrayArray1[0][arg0][arg1].aClass2_Sub6_1 = local8;
		this.aClass2_Sub6ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(III)I")
	public int method125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass27_1 == null ? 0 : local8.aClass27_1.anInt1545;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIILclient!vb;Lclient!vb;IIII)V")
	public void method126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub1 arg4, @OriginalArg(5) Class2_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class12 local8 = new Class12();
		local8.anInt686 = arg8;
		local8.anInt692 = arg9;
		local8.anInt684 = arg1 * 128 + 64;
		local8.anInt695 = arg2 * 128 + 64;
		local8.anInt689 = arg3;
		local8.aClass2_Sub1_Sub1_2 = arg4;
		local8.aClass2_Sub1_Sub1_1 = arg5;
		local8.anInt687 = arg6;
		local8.anInt691 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass2_Sub6ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass2_Sub6ArrayArrayArray1[local45][arg1][arg2] = new Class2_Sub6(local45, arg1, arg2);
			}
		}
		this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass12_1 = local8;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "([IIIIII)V")
	public void method128(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class53 local14 = local8.aClass53_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt2295;
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
		@Pc(59) Class13 local59 = local8.aClass13_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt699;
		@Pc(68) int local68 = local59.anInt697;
		@Pc(71) int local71 = local59.anInt700;
		@Pc(74) int local74 = local59.anInt698;
		@Pc(79) int[] local79 = this.anIntArrayArray2[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray1[local68];
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

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIII)V")
	public void method129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt319 * 128) {
			arg0 = this.anInt319 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt329 * 128) {
			arg2 = this.anInt329 * 128 - 1;
		}
		Static3.anInt311++;
		Static3.anInt308 = Static75.anIntArray254[arg3];
		Static3.anInt326 = Static75.anIntArray256[arg3];
		Static3.anInt324 = Static75.anIntArray254[arg4];
		Static3.anInt321 = Static75.anIntArray256[arg4];
		Static3.aBooleanArrayArray1 = Static3.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static3.anInt303 = arg0;
		Static3.anInt313 = arg1;
		Static3.anInt320 = arg2;
		Static3.anInt306 = arg0 / 128;
		Static3.anInt322 = arg2 / 128;
		Static3.anInt310 = arg5;
		Static3.anInt317 = Static3.anInt306 - 25;
		if (Static3.anInt317 < 0) {
			Static3.anInt317 = 0;
		}
		Static3.anInt312 = Static3.anInt322 - 25;
		if (Static3.anInt312 < 0) {
			Static3.anInt312 = 0;
		}
		Static3.anInt309 = Static3.anInt306 + 25;
		if (Static3.anInt309 > this.anInt319) {
			Static3.anInt309 = this.anInt319;
		}
		Static3.anInt327 = Static3.anInt322 + 25;
		if (Static3.anInt327 > this.anInt329) {
			Static3.anInt327 = this.anInt329;
		}
		this.method155();
		Static3.anInt325 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt323; local128 < this.anInt328; local128++) {
			@Pc(134) Class2_Sub6[][] local134 = this.aClass2_Sub6ArrayArrayArray1[local128];
			for (local136 = Static3.anInt317; local136 < Static3.anInt309; local136++) {
				for (local139 = Static3.anInt312; local139 < Static3.anInt327; local139++) {
					@Pc(146) Class2_Sub6 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt1057 <= arg5 && (Static3.aBooleanArrayArray1[local136 + 25 - Static3.anInt306][local139 + 25 - Static3.anInt322] || this.anIntArrayArrayArray2[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean47 = true;
							local146.aBoolean48 = true;
							if (local146.anInt1065 > 0) {
								local146.aBoolean46 = true;
							} else {
								local146.aBoolean46 = false;
							}
							Static3.anInt325++;
						} else {
							local146.aBoolean47 = false;
							local146.aBoolean48 = false;
							local146.anInt1060 = 0;
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
		for (@Pc(224) int local224 = this.anInt323; local224 < this.anInt328; local224++) {
			@Pc(230) Class2_Sub6[][] local230 = this.aClass2_Sub6ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static3.anInt306 + local139;
				local241 = Static3.anInt306 - local139;
				if (local237 >= Static3.anInt317 || local241 < Static3.anInt309) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static3.anInt322 + local249;
						local258 = Static3.anInt322 - local249;
						@Pc(270) Class2_Sub6 local270;
						if (local237 >= Static3.anInt317) {
							if (local254 >= Static3.anInt312) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean47) {
									this.method138(local270, true);
								}
							}
							if (local258 < Static3.anInt327) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean47) {
									this.method138(local270, true);
								}
							}
						}
						if (local241 < Static3.anInt309) {
							if (local254 >= Static3.anInt312) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean47) {
									this.method138(local270, true);
								}
							}
							if (local258 < Static3.anInt327) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean47) {
									this.method138(local270, true);
								}
							}
						}
						if (Static3.anInt325 == 0) {
							Static3.aBoolean10 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt323; local136 < this.anInt328; local136++) {
			@Pc(361) Class2_Sub6[][] local361 = this.aClass2_Sub6ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static3.anInt306 + local237;
				local249 = Static3.anInt306 - local237;
				if (local241 >= Static3.anInt317 || local249 < Static3.anInt309) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static3.anInt322 + local254;
						@Pc(389) int local389 = Static3.anInt322 - local254;
						@Pc(401) Class2_Sub6 local401;
						if (local241 >= Static3.anInt317) {
							if (local258 >= Static3.anInt312) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean47) {
									this.method138(local401, false);
								}
							}
							if (local389 < Static3.anInt327) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean47) {
									this.method138(local401, false);
								}
							}
						}
						if (local249 < Static3.anInt309) {
							if (local258 >= Static3.anInt312) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean47) {
									this.method138(local401, false);
								}
							}
							if (local389 < Static3.anInt327) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean47) {
									this.method138(local401, false);
								}
							}
						}
						if (Static3.anInt325 == 0) {
							Static3.aBoolean10 = false;
							return;
						}
					}
				}
			}
		}
		Static3.aBoolean10 = false;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "()V")
	public void method130() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt328; local1++) {
			for (local4 = 0; local4 < this.anInt319; local4++) {
				for (local7 = 0; local7 < this.anInt329; local7++) {
					this.aClass2_Sub6ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static3.anInt314; local4++) {
			for (local7 = 0; local7 < Static3.anIntArray26[local4]; local7++) {
				Static3.aClass35ArrayArray1[local4][local7] = null;
			}
			Static3.anIntArray26[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt316; local7++) {
			this.aClass22Array1[local7] = null;
		}
		this.anInt316 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static3.aClass22Array2.length; local76++) {
			Static3.aClass22Array2[local76] = null;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class53 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class53(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub6ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub6ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub6(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass53_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class53(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub6ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub6ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub6(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass53_1 = local12;
		} else {
			@Pc(140) Class13 local140 = new Class13(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub6ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub6ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub6(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass13_1 = local140;
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(III)Lclient!rd;")
	public Class54 method132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass54_1;
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(III)Z")
	private boolean method133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == -Static3.anInt311) {
			return false;
		} else if (local8 == Static3.anInt311) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method135(local23 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg2], local27 + 1) && this.method135(local23 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg2], local27 + 1) && this.method135(local23 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method135(local23 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray1[arg0][arg1][arg2] = Static3.anInt311;
				return true;
			} else {
				this.anIntArrayArrayArray1[arg0][arg1][arg2] = -Static3.anInt311;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIII)Z")
	private boolean method134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method133(arg0, arg1, arg2)) {
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
				if (local11 > Static3.anInt303) {
					if (!this.method135(local11, local26, local15)) {
						return false;
					}
					if (!this.method135(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method135(local11, local30, local15)) {
						return false;
					}
					if (!this.method135(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method135(local11, local34, local15)) {
					return false;
				}
				if (!this.method135(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static3.anInt320) {
					if (!this.method135(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method135(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method135(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method135(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method135(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method135(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static3.anInt303) {
					if (!this.method135(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method135(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method135(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method135(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method135(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method135(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static3.anInt320) {
					if (!this.method135(local11, local26, local15)) {
						return false;
					}
					if (!this.method135(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method135(local11, local30, local15)) {
						return false;
					}
					if (!this.method135(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method135(local11, local34, local15)) {
					return false;
				}
				if (!this.method135(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method135(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method135(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method135(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method135(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method135(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "(III)Z")
	private boolean method135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static3.anInt318; local1++) {
			@Pc(6) Class35 local6 = Static3.aClass35Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt1807 == 1) {
				local15 = local6.anInt1813 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt1809 + (local6.anInt1810 * local15 >> 8);
					local37 = local6.anInt1816 + (local6.anInt1802 * local15 >> 8);
					local47 = local6.anInt1820 + (local6.anInt1808 * local15 >> 8);
					local57 = local6.anInt1817 + (local6.anInt1818 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1807 == 2) {
				local15 = arg0 - local6.anInt1813;
				if (local15 > 0) {
					local27 = local6.anInt1809 + (local6.anInt1810 * local15 >> 8);
					local37 = local6.anInt1816 + (local6.anInt1802 * local15 >> 8);
					local47 = local6.anInt1820 + (local6.anInt1808 * local15 >> 8);
					local57 = local6.anInt1817 + (local6.anInt1818 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1807 == 3) {
				local15 = local6.anInt1809 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt1813 + (local6.anInt1801 * local15 >> 8);
					local37 = local6.anInt1806 + (local6.anInt1821 * local15 >> 8);
					local47 = local6.anInt1820 + (local6.anInt1808 * local15 >> 8);
					local57 = local6.anInt1817 + (local6.anInt1818 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1807 == 4) {
				local15 = arg2 - local6.anInt1809;
				if (local15 > 0) {
					local27 = local6.anInt1813 + (local6.anInt1801 * local15 >> 8);
					local37 = local6.anInt1806 + (local6.anInt1821 * local15 >> 8);
					local47 = local6.anInt1820 + (local6.anInt1808 * local15 >> 8);
					local57 = local6.anInt1817 + (local6.anInt1818 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1807 == 5) {
				local15 = arg1 - local6.anInt1820;
				if (local15 > 0) {
					local27 = local6.anInt1813 + (local6.anInt1801 * local15 >> 8);
					local37 = local6.anInt1806 + (local6.anInt1821 * local15 >> 8);
					local47 = local6.anInt1809 + (local6.anInt1810 * local15 >> 8);
					local57 = local6.anInt1816 + (local6.anInt1802 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "()V")
	public void method136() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt316; local1++) {
			@Pc(7) Class22 local7 = this.aClass22Array1[local1];
			this.method137(local7);
			this.aClass22Array1[local1] = null;
		}
		this.anInt316 = 0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!g;)V")
	private void method137(@OriginalArg(0) Class22 arg0) {
		for (@Pc(2) int local2 = arg0.anInt1229; local2 <= arg0.anInt1236; local2++) {
			for (@Pc(6) int local6 = arg0.anInt1235; local6 <= arg0.anInt1232; local6++) {
				@Pc(17) Class2_Sub6 local17 = this.aClass2_Sub6ArrayArrayArray1[arg0.anInt1225][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt1065; local21++) {
						if (local17.aClass22Array3[local21] == arg0) {
							local17.anInt1065--;
							for (local36 = local21; local36 < local17.anInt1065; local36++) {
								local17.aClass22Array3[local36] = local17.aClass22Array3[local36 + 1];
								local17.anIntArray116[local36] = local17.anIntArray116[local36 + 1];
							}
							local17.aClass22Array3[local17.anInt1065] = null;
							break;
						}
					}
					local17.anInt1062 = 0;
					for (local36 = 0; local36 < local17.anInt1065; local36++) {
						local17.anInt1062 |= local17.anIntArray116[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!fa;Z)V")
	private void method138(@OriginalArg(0) Class2_Sub6 arg0, @OriginalArg(1) boolean arg1) {
		Static3.aClass46_1.method1437(arg0);
		while (true) {
			@Pc(8) Class2_Sub6 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class2_Sub6[][] local31;
			@Pc(49) Class2_Sub6 local49;
			@Pc(251) int local251;
			@Pc(578) int local578;
			@Pc(583) int local583;
			@Pc(588) int local588;
			@Pc(591) int local591;
			@Pc(600) int local600;
			@Pc(942) Class12 local942;
			@Pc(1116) int local1116;
			@Pc(1001) int local1001;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class22 var12;
										@Pc(612) int var19;
										@Pc(335) int var23;
										@Pc(289) boolean var24;
										@Pc(823) Class2_Sub6 var35;
										while (true) {
											do {
												local8 = (Class2_Sub6) Static3.aClass46_1.method1446();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean48);
											local17 = local8.anInt1056;
											local20 = local8.anInt1064;
											local23 = local8.anInt1059;
											local26 = local8.anInt1061;
											local31 = this.aClass2_Sub6ArrayArrayArray1[local23];
											if (!local8.aBoolean47) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass2_Sub6ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean48) {
														continue;
													}
												}
												if (local17 <= Static3.anInt306 && local17 > Static3.anInt317) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean48 && (local49.aBoolean47 || (local8.anInt1062 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static3.anInt306 && local17 < Static3.anInt309 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean48 && (local49.aBoolean47 || (local8.anInt1062 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static3.anInt322 && local20 > Static3.anInt312) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean48 && (local49.aBoolean47 || (local8.anInt1062 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static3.anInt322 && local20 < Static3.anInt327 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean48 && (local49.aBoolean47 || (local8.anInt1062 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean47 = false;
											if (local8.aClass2_Sub6_1 != null) {
												local49 = local8.aClass2_Sub6_1;
												if (local49.aClass53_1 == null) {
													if (local49.aClass13_1 != null && !this.method133(0, local17, local20)) {
														this.method170(local49.aClass13_1, Static3.anInt308, Static3.anInt326, Static3.anInt324, Static3.anInt321, local17, local20);
													}
												} else if (!this.method133(0, local17, local20)) {
													this.method160(local49.aClass53_1, 0, Static3.anInt308, Static3.anInt326, Static3.anInt324, Static3.anInt321, local17, local20);
												}
												@Pc(225) Class12 local225 = local49.aClass12_1;
												if (local225 != null) {
													local225.aClass2_Sub1_Sub1_2.method1777(0, Static3.anInt308, Static3.anInt326, Static3.anInt324, Static3.anInt321, local225.anInt684 - Static3.anInt303, local225.anInt689 - Static3.anInt313, local225.anInt695 - Static3.anInt320, local225.anInt686);
												}
												for (local251 = 0; local251 < local49.anInt1065; local251++) {
													var12 = local49.aClass22Array3[local251];
													if (var12 != null) {
														var12.aClass2_Sub1_Sub1_3.method1777(var12.anInt1234, Static3.anInt308, Static3.anInt326, Static3.anInt324, Static3.anInt321, var12.anInt1231 - Static3.anInt303, var12.anInt1233 - Static3.anInt313, var12.anInt1228 - Static3.anInt320, var12.anInt1226);
													}
												}
											}
											var24 = false;
											if (local8.aClass53_1 == null) {
												if (local8.aClass13_1 != null && !this.method133(local26, local17, local20)) {
													var24 = true;
													this.method170(local8.aClass13_1, Static3.anInt308, Static3.anInt326, Static3.anInt324, Static3.anInt321, local17, local20);
												}
											} else if (!this.method133(local26, local17, local20)) {
												var24 = true;
												this.method160(local8.aClass53_1, local26, Static3.anInt308, Static3.anInt326, Static3.anInt324, Static3.anInt321, local17, local20);
											}
											var23 = 0;
											local251 = 0;
											@Pc(340) Class12 local340 = local8.aClass12_1;
											@Pc(343) Class54 local343 = local8.aClass54_1;
											if (local340 != null || local343 != null) {
												if (Static3.anInt306 == local17) {
													var23++;
												} else if (Static3.anInt306 < local17) {
													var23 += 2;
												}
												if (Static3.anInt322 == local20) {
													var23 += 3;
												} else if (Static3.anInt322 > local20) {
													var23 += 6;
												}
												local251 = Static3.anIntArray31[var23];
												local8.anInt1058 = Static3.anIntArray35[var23];
											}
											if (local340 != null) {
												if ((local340.anInt687 & Static3.anIntArray29[var23]) == 0) {
													local8.anInt1060 = 0;
												} else if (local340.anInt687 == 16) {
													local8.anInt1060 = 3;
													local8.anInt1063 = Static3.anIntArray30[var23];
													local8.anInt1055 = 3 - local8.anInt1063;
												} else if (local340.anInt687 == 32) {
													local8.anInt1060 = 6;
													local8.anInt1063 = Static3.anIntArray33[var23];
													local8.anInt1055 = 6 - local8.anInt1063;
												} else if (local340.anInt687 == 64) {
													local8.anInt1060 = 12;
													local8.anInt1063 = Static3.anIntArray37[var23];
													local8.anInt1055 = 12 - local8.anInt1063;
												} else {
													local8.anInt1060 = 9;
													local8.anInt1063 = Static3.anIntArray36[var23];
													local8.anInt1055 = 9 - local8.anInt1063;
												}
												if ((local340.anInt687 & local251) != 0 && !this.method134(local26, local17, local20, local340.anInt687)) {
													local340.aClass2_Sub1_Sub1_2.method1777(0, Static3.anInt308, Static3.anInt326, Static3.anInt324, Static3.anInt321, local340.anInt684 - Static3.anInt303, local340.anInt689 - Static3.anInt313, local340.anInt695 - Static3.anInt320, local340.anInt686);
												}
												if ((local340.anInt691 & local251) != 0 && !this.method134(local26, local17, local20, local340.anInt691)) {
													local340.aClass2_Sub1_Sub1_1.method1777(0, Static3.anInt308, Static3.anInt326, Static3.anInt324, Static3.anInt321, local340.anInt684 - Static3.anInt303, local340.anInt689 - Static3.anInt313, local340.anInt695 - Static3.anInt320, local340.anInt686);
												}
											}
											if (local343 != null && !this.method143(local26, local17, local20, local343.aClass2_Sub1_Sub1_5.anInt2698)) {
												if ((local343.anInt2305 & local251) != 0) {
													local343.aClass2_Sub1_Sub1_5.method1777(local343.anInt2310, Static3.anInt308, Static3.anInt326, Static3.anInt324, Static3.anInt321, local343.anInt2316 - Static3.anInt303, local343.anInt2306 - Static3.anInt313, local343.anInt2312 - Static3.anInt320, local343.anInt2317);
												} else if ((local343.anInt2305 & 0x300) != 0) {
													local578 = local343.anInt2316 - Static3.anInt303;
													local583 = local343.anInt2306 - Static3.anInt313;
													local588 = local343.anInt2312 - Static3.anInt320;
													local591 = local343.anInt2310;
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
													if ((local343.anInt2305 & 0x100) != 0 && var19 < local600) {
														local629 = local578 + Static3.anIntArray24[local591];
														local635 = local588 + Static3.anIntArray28[local591];
														local343.aClass2_Sub1_Sub1_5.method1777(local591 * 512 + 256, Static3.anInt308, Static3.anInt326, Static3.anInt324, Static3.anInt321, local629, local583, local635, local343.anInt2317);
													}
													if ((local343.anInt2305 & 0x200) != 0 && var19 > local600) {
														local629 = local578 + Static3.anIntArray25[local591];
														local635 = local588 + Static3.anIntArray27[local591];
														local343.aClass2_Sub1_Sub1_5.method1777(local591 * 512 + 1280 & 0x7FF, Static3.anInt308, Static3.anInt326, Static3.anInt324, Static3.anInt321, local629, local583, local635, local343.anInt2317);
													}
												}
											}
											if (var24) {
												@Pc(696) Class27 local696 = local8.aClass27_1;
												if (local696 != null) {
													local696.aClass2_Sub1_Sub1_4.method1777(0, Static3.anInt308, Static3.anInt326, Static3.anInt324, Static3.anInt321, local696.anInt1547 - Static3.anInt303, local696.anInt1553 - Static3.anInt313, local696.anInt1552 - Static3.anInt320, local696.anInt1545);
												}
												@Pc(723) Class59 local723 = local8.aClass59_1;
												if (local723 != null && local723.anInt2374 == 0) {
													if (local723.aClass2_Sub1_Sub1_7 != null) {
														local723.aClass2_Sub1_Sub1_7.method1777(0, Static3.anInt308, Static3.anInt326, Static3.anInt324, Static3.anInt321, local723.anInt2375 - Static3.anInt303, local723.anInt2369 - Static3.anInt313, local723.anInt2365 - Static3.anInt320, local723.anInt2370);
													}
													if (local723.aClass2_Sub1_Sub1_8 != null) {
														local723.aClass2_Sub1_Sub1_8.method1777(0, Static3.anInt308, Static3.anInt326, Static3.anInt324, Static3.anInt321, local723.anInt2375 - Static3.anInt303, local723.anInt2369 - Static3.anInt313, local723.anInt2365 - Static3.anInt320, local723.anInt2370);
													}
													if (local723.aClass2_Sub1_Sub1_6 != null) {
														local723.aClass2_Sub1_Sub1_6.method1777(0, Static3.anInt308, Static3.anInt326, Static3.anInt324, Static3.anInt321, local723.anInt2375 - Static3.anInt303, local723.anInt2369 - Static3.anInt313, local723.anInt2365 - Static3.anInt320, local723.anInt2370);
													}
												}
											}
											local578 = local8.anInt1062;
											if (local578 != 0) {
												if (local17 < Static3.anInt306 && (local578 & 0x4) != 0) {
													var35 = local31[local17 + 1][local20];
													if (var35 != null && var35.aBoolean48) {
														Static3.aClass46_1.method1437(var35);
													}
												}
												if (local20 < Static3.anInt322 && (local578 & 0x2) != 0) {
													var35 = local31[local17][local20 + 1];
													if (var35 != null && var35.aBoolean48) {
														Static3.aClass46_1.method1437(var35);
													}
												}
												if (local17 > Static3.anInt306 && (local578 & 0x1) != 0) {
													var35 = local31[local17 - 1][local20];
													if (var35 != null && var35.aBoolean48) {
														Static3.aClass46_1.method1437(var35);
													}
												}
												if (local20 > Static3.anInt322 && (local578 & 0x8) != 0) {
													var35 = local31[local17][local20 - 1];
													if (var35 != null && var35.aBoolean48) {
														Static3.aClass46_1.method1437(var35);
													}
												}
											}
											break;
										}
										if (local8.anInt1060 != 0) {
											var24 = true;
											for (var23 = 0; var23 < local8.anInt1065; var23++) {
												if (local8.aClass22Array3[var23].anInt1237 != Static3.anInt311 && (local8.anIntArray116[var23] & local8.anInt1060) == local8.anInt1063) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												local942 = local8.aClass12_1;
												if (!this.method134(local26, local17, local20, local942.anInt687)) {
													local942.aClass2_Sub1_Sub1_2.method1777(0, Static3.anInt308, Static3.anInt326, Static3.anInt324, Static3.anInt321, local942.anInt684 - Static3.anInt303, local942.anInt689 - Static3.anInt313, local942.anInt695 - Static3.anInt320, local942.anInt686);
												}
												local8.anInt1060 = 0;
											}
										}
										if (!local8.aBoolean46) {
											break;
										}
										try {
											@Pc(981) int local981 = local8.anInt1065;
											local8.aBoolean46 = false;
											var23 = 0;
											label559: for (local251 = 0; local251 < local981; local251++) {
												var12 = local8.aClass22Array3[local251];
												if (var12.anInt1237 != Static3.anInt311) {
													for (local1001 = var12.anInt1229; local1001 <= var12.anInt1236; local1001++) {
														for (local578 = var12.anInt1235; local578 <= var12.anInt1232; local578++) {
															var35 = local31[local1001][local578];
															if (var35.aBoolean47) {
																local8.aBoolean46 = true;
																continue label559;
															}
															if (var35.anInt1060 != 0) {
																local588 = 0;
																if (local1001 > var12.anInt1229) {
																	local588++;
																}
																if (local1001 < var12.anInt1236) {
																	local588 += 4;
																}
																if (local578 > var12.anInt1235) {
																	local588 += 8;
																}
																if (local578 < var12.anInt1232) {
																	local588 += 2;
																}
																if ((local588 & var35.anInt1060) == local8.anInt1055) {
																	local8.aBoolean46 = true;
																	continue label559;
																}
															}
														}
													}
													Static3.aClass22Array2[var23++] = var12;
													local578 = Static3.anInt306 - var12.anInt1229;
													local583 = var12.anInt1236 - Static3.anInt306;
													if (local583 > local578) {
														local578 = local583;
													}
													local588 = Static3.anInt322 - var12.anInt1235;
													local591 = var12.anInt1232 - Static3.anInt322;
													if (local591 > local588) {
														var12.anInt1239 = local578 + local591;
													} else {
														var12.anInt1239 = local578 + local588;
													}
												}
											}
											while (var23 > 0) {
												local1116 = -50;
												local1001 = -1;
												@Pc(1125) Class22 local1125;
												for (local578 = 0; local578 < var23; local578++) {
													local1125 = Static3.aClass22Array2[local578];
													if (local1125.anInt1237 != Static3.anInt311) {
														if (local1125.anInt1239 > local1116) {
															local1116 = local1125.anInt1239;
															local1001 = local578;
														} else if (local1125.anInt1239 == local1116) {
															local588 = local1125.anInt1231 - Static3.anInt303;
															local591 = local1125.anInt1228 - Static3.anInt320;
															local600 = Static3.aClass22Array2[local1001].anInt1231 - Static3.anInt303;
															var19 = Static3.aClass22Array2[local1001].anInt1228 - Static3.anInt320;
															if (local588 * local588 + local591 * local591 > local600 * local600 + var19 * var19) {
																local1001 = local578;
															}
														}
													}
												}
												if (local1001 == -1) {
													break;
												}
												local1125 = Static3.aClass22Array2[local1001];
												local1125.anInt1237 = Static3.anInt311;
												if (!this.method151(local26, local1125.anInt1229, local1125.anInt1236, local1125.anInt1235, local1125.anInt1232, local1125.aClass2_Sub1_Sub1_3.anInt2698)) {
													local1125.aClass2_Sub1_Sub1_3.method1777(local1125.anInt1234, Static3.anInt308, Static3.anInt326, Static3.anInt324, Static3.anInt321, local1125.anInt1231 - Static3.anInt303, local1125.anInt1233 - Static3.anInt313, local1125.anInt1228 - Static3.anInt320, local1125.anInt1226);
												}
												for (local588 = local1125.anInt1229; local588 <= local1125.anInt1236; local588++) {
													for (local591 = local1125.anInt1235; local591 <= local1125.anInt1232; local591++) {
														@Pc(1250) Class2_Sub6 local1250 = local31[local588][local591];
														if (local1250.anInt1060 != 0) {
															Static3.aClass46_1.method1437(local1250);
														} else if ((local588 != local17 || local591 != local20) && local1250.aBoolean48) {
															Static3.aClass46_1.method1437(local1250);
														}
													}
												}
											}
											if (!local8.aBoolean46) {
												break;
											}
										} catch (@Pc(1288) Exception local1288) {
											local8.aBoolean46 = false;
											break;
										}
									}
								} while (!local8.aBoolean48);
							} while (local8.anInt1060 != 0);
							if (local17 > Static3.anInt306 || local17 <= Static3.anInt317) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean48);
						if (local17 < Static3.anInt306 || local17 >= Static3.anInt309 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean48);
					if (local20 > Static3.anInt322 || local20 <= Static3.anInt312) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean48);
				if (local20 < Static3.anInt322 || local20 >= Static3.anInt327 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean48);
			local8.aBoolean48 = false;
			Static3.anInt325--;
			@Pc(1392) Class59 local1392 = local8.aClass59_1;
			if (local1392 != null && local1392.anInt2374 != 0) {
				if (local1392.aClass2_Sub1_Sub1_7 != null) {
					local1392.aClass2_Sub1_Sub1_7.method1777(0, Static3.anInt308, Static3.anInt326, Static3.anInt324, Static3.anInt321, local1392.anInt2375 - Static3.anInt303, local1392.anInt2369 - Static3.anInt313 - local1392.anInt2374, local1392.anInt2365 - Static3.anInt320, local1392.anInt2370);
				}
				if (local1392.aClass2_Sub1_Sub1_8 != null) {
					local1392.aClass2_Sub1_Sub1_8.method1777(0, Static3.anInt308, Static3.anInt326, Static3.anInt324, Static3.anInt321, local1392.anInt2375 - Static3.anInt303, local1392.anInt2369 - Static3.anInt313 - local1392.anInt2374, local1392.anInt2365 - Static3.anInt320, local1392.anInt2370);
				}
				if (local1392.aClass2_Sub1_Sub1_6 != null) {
					local1392.aClass2_Sub1_Sub1_6.method1777(0, Static3.anInt308, Static3.anInt326, Static3.anInt324, Static3.anInt321, local1392.anInt2375 - Static3.anInt303, local1392.anInt2369 - Static3.anInt313 - local1392.anInt2374, local1392.anInt2365 - Static3.anInt320, local1392.anInt2370);
				}
			}
			if (local8.anInt1058 != 0) {
				@Pc(1487) Class54 local1487 = local8.aClass54_1;
				if (local1487 != null && !this.method143(local26, local17, local20, local1487.aClass2_Sub1_Sub1_5.anInt2698)) {
					if ((local1487.anInt2305 & local8.anInt1058) != 0) {
						local1487.aClass2_Sub1_Sub1_5.method1777(local1487.anInt2310, Static3.anInt308, Static3.anInt326, Static3.anInt324, Static3.anInt321, local1487.anInt2316 - Static3.anInt303, local1487.anInt2306 - Static3.anInt313, local1487.anInt2312 - Static3.anInt320, local1487.anInt2317);
					} else if ((local1487.anInt2305 & 0x300) != 0) {
						local251 = local1487.anInt2316 - Static3.anInt303;
						local1116 = local1487.anInt2306 - Static3.anInt313;
						local1001 = local1487.anInt2312 - Static3.anInt320;
						local578 = local1487.anInt2310;
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
						if ((local1487.anInt2305 & 0x100) != 0 && local588 >= local583) {
							local591 = local251 + Static3.anIntArray24[local578];
							local600 = local1001 + Static3.anIntArray28[local578];
							local1487.aClass2_Sub1_Sub1_5.method1777(local578 * 512 + 256, Static3.anInt308, Static3.anInt326, Static3.anInt324, Static3.anInt321, local591, local1116, local600, local1487.anInt2317);
						}
						if ((local1487.anInt2305 & 0x200) != 0 && local588 <= local583) {
							local591 = local251 + Static3.anIntArray25[local578];
							local600 = local1001 + Static3.anIntArray27[local578];
							local1487.aClass2_Sub1_Sub1_5.method1777(local578 * 512 + 1280 & 0x7FF, Static3.anInt308, Static3.anInt326, Static3.anInt324, Static3.anInt321, local591, local1116, local600, local1487.anInt2317);
						}
					}
				}
				local942 = local8.aClass12_1;
				if (local942 != null) {
					if ((local942.anInt691 & local8.anInt1058) != 0 && !this.method134(local26, local17, local20, local942.anInt691)) {
						local942.aClass2_Sub1_Sub1_1.method1777(0, Static3.anInt308, Static3.anInt326, Static3.anInt324, Static3.anInt321, local942.anInt684 - Static3.anInt303, local942.anInt689 - Static3.anInt313, local942.anInt695 - Static3.anInt320, local942.anInt686);
					}
					if ((local942.anInt687 & local8.anInt1058) != 0 && !this.method134(local26, local17, local20, local942.anInt687)) {
						local942.aClass2_Sub1_Sub1_2.method1777(0, Static3.anInt308, Static3.anInt326, Static3.anInt324, Static3.anInt321, local942.anInt684 - Static3.anInt303, local942.anInt689 - Static3.anInt313, local942.anInt695 - Static3.anInt320, local942.anInt686);
					}
				}
			}
			@Pc(1745) Class2_Sub6 local1745;
			if (local23 < this.anInt328 - 1) {
				local1745 = this.aClass2_Sub6ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1745 != null && local1745.aBoolean48) {
					Static3.aClass46_1.method1437(local1745);
				}
			}
			if (local17 < Static3.anInt306) {
				local1745 = local31[local17 + 1][local20];
				if (local1745 != null && local1745.aBoolean48) {
					Static3.aClass46_1.method1437(local1745);
				}
			}
			if (local20 < Static3.anInt322) {
				local1745 = local31[local17][local20 + 1];
				if (local1745 != null && local1745.aBoolean48) {
					Static3.aClass46_1.method1437(local1745);
				}
			}
			if (local17 > Static3.anInt306) {
				local1745 = local31[local17 - 1][local20];
				if (local1745 != null && local1745.aBoolean48) {
					Static3.aClass46_1.method1437(local1745);
				}
			}
			if (local20 > Static3.anInt322) {
				local1745 = local31[local17][local20 - 1];
				if (local1745 != null && local1745.aBoolean48) {
					Static3.aClass46_1.method1437(local1745);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "(III)Lclient!g;")
	public Class22 method139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt1065; local14++) {
			@Pc(20) Class22 local20 = local8.aClass22Array3[local14];
			if ((local20.anInt1226 >> 29 & 0x3) == 2 && local20.anInt1229 == arg1 && local20.anInt1235 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIILclient!vb;IIIIII)V")
	public void method141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class54 local6 = new Class54();
		local6.anInt2317 = arg9;
		local6.anInt2311 = arg10;
		local6.anInt2316 = arg1 * 128 + arg7 + 64;
		local6.anInt2312 = arg2 * 128 + arg8 + 64;
		local6.anInt2306 = arg3;
		local6.aClass2_Sub1_Sub1_5 = arg4;
		local6.anInt2305 = arg5;
		local6.anInt2310 = arg6;
		for (@Pc(44) int local44 = arg0; local44 >= 0; local44--) {
			if (this.aClass2_Sub6ArrayArrayArray1[local44][arg1][arg2] == null) {
				this.aClass2_Sub6ArrayArrayArray1[local44][arg1][arg2] = new Class2_Sub6(local44, arg1, arg2);
			}
		}
		this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass54_1 = local6;
	}

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "(III)I")
	public int method142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt1065; local14++) {
			@Pc(20) Class22 local20 = local8.aClass22Array3[local14];
			if ((local20.anInt1226 >> 29 & 0x3) == 2 && local20.anInt1229 == arg1 && local20.anInt1235 == arg2) {
				return local20.anInt1226;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(IIII)Z")
	private boolean method143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method133(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method135(local11 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg2] - arg3, local15 + 1) && this.method135(local11 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method135(local11 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method135(local11 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIILclient!vb;IIIIII)Z")
	public boolean method144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class2_Sub1_Sub1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method172(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(IIII)V")
	public void method147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class54 local14 = local8.aClass54_1;
		if (local14 != null) {
			@Pc(23) int local23 = arg1 * 128 + 64;
			@Pc(29) int local29 = arg2 * 128 + 64;
			local14.anInt2316 = local23 + (local14.anInt2316 - local23) * arg3 / 16;
			local14.anInt2312 = local29 + (local14.anInt2312 - local29) * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!pa;III)V")
	private void method149(@OriginalArg(0) Class2_Sub1_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class2_Sub6 local14;
		@Pc(29) Class2_Sub1_Sub1_Sub5 local29;
		if (arg2 < this.anInt319) {
			local14 = this.aClass2_Sub6ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass27_1 != null && local14.aClass27_1.aClass2_Sub1_Sub1_4 instanceof Class2_Sub1_Sub1_Sub5) {
				local29 = (Class2_Sub1_Sub1_Sub5) local14.aClass27_1.aClass2_Sub1_Sub1_4;
				if (local29.aClass47Array2 != null) {
					this.method153(arg0, local29, 128, 0, 0, true);
				}
			}
		}
		if (arg3 < this.anInt319) {
			local14 = this.aClass2_Sub6ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass27_1 != null && local14.aClass27_1.aClass2_Sub1_Sub1_4 instanceof Class2_Sub1_Sub1_Sub5) {
				local29 = (Class2_Sub1_Sub1_Sub5) local14.aClass27_1.aClass2_Sub1_Sub1_4;
				if (local29.aClass47Array2 != null) {
					this.method153(arg0, local29, 0, 0, 128, true);
				}
			}
		}
		if (arg2 < this.anInt319 && arg3 < this.anInt329) {
			local14 = this.aClass2_Sub6ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass27_1 != null && local14.aClass27_1.aClass2_Sub1_Sub1_4 instanceof Class2_Sub1_Sub1_Sub5) {
				local29 = (Class2_Sub1_Sub1_Sub5) local14.aClass27_1.aClass2_Sub1_Sub1_4;
				if (local29.aClass47Array2 != null) {
					this.method153(arg0, local29, 128, 0, 128, true);
				}
			}
		}
		if (arg2 >= this.anInt319 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass2_Sub6ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass27_1 != null && local14.aClass27_1.aClass2_Sub1_Sub1_4 instanceof Class2_Sub1_Sub1_Sub5) {
			local29 = (Class2_Sub1_Sub1_Sub5) local14.aClass27_1.aClass2_Sub1_Sub1_4;
			if (local29.aClass47Array2 != null) {
				this.method153(arg0, local29, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "(III)V")
	public void method150() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt328; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt319; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt329; local7++) {
					@Pc(17) Class2_Sub6 local17 = this.aClass2_Sub6ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class12 local22 = local17.aClass12_1;
						if (local22 != null && local22.aClass2_Sub1_Sub1_2 instanceof Class2_Sub1_Sub1_Sub5) {
							@Pc(32) Class2_Sub1_Sub1_Sub5 local32 = (Class2_Sub1_Sub1_Sub5) local22.aClass2_Sub1_Sub1_2;
							if (local32.aClass47Array2 != null) {
								this.method161(local32, local1, local4, local7, 1, 1);
								if (local22.aClass2_Sub1_Sub1_1 instanceof Class2_Sub1_Sub1_Sub5) {
									@Pc(51) Class2_Sub1_Sub1_Sub5 local51 = (Class2_Sub1_Sub1_Sub5) local22.aClass2_Sub1_Sub1_1;
									if (local51.aClass47Array2 != null) {
										this.method161(local51, local1, local4, local7, 1, 1);
										this.method153(local32, local51, 0, 0, 0, false);
										local51.method1427();
									}
								}
								local32.method1427();
							}
						}
						@Pc(98) Class2_Sub1_Sub1_Sub5 local98;
						for (@Pc(82) int local82 = 0; local82 < local17.anInt1065; local82++) {
							@Pc(88) Class22 local88 = local17.aClass22Array3[local82];
							if (local88 != null && local88.aClass2_Sub1_Sub1_3 instanceof Class2_Sub1_Sub1_Sub5) {
								local98 = (Class2_Sub1_Sub1_Sub5) local88.aClass2_Sub1_Sub1_3;
								if (local98.aClass47Array2 != null) {
									this.method161(local98, local1, local4, local7, local88.anInt1236 + 1 - local88.anInt1229, local88.anInt1232 - local88.anInt1235 + 1);
									local98.method1427();
								}
							}
						}
						@Pc(134) Class27 local134 = local17.aClass27_1;
						if (local134 != null && local134.aClass2_Sub1_Sub1_4 instanceof Class2_Sub1_Sub1_Sub5) {
							local98 = (Class2_Sub1_Sub1_Sub5) local134.aClass2_Sub1_Sub1_4;
							if (local98.aClass47Array2 != null) {
								this.method149(local98, local1, local4, local7);
								local98.method1427();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(IIIIII)Z")
	private boolean method151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray1[arg0][local17][local21] == -Static3.anInt311) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray2[arg0][arg1][arg3] - arg5;
			if (!this.method135(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method135(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method135(local21, local167, local195)) {
				return false;
			} else if (this.method135(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method133(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method135(local17 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg3] - arg5, local21 + 1) && this.method135(local17 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method135(local17 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method135(local17 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(II)V")
	public void method152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static3.aBoolean10 = true;
		Static3.anInt315 = arg0;
		Static3.anInt304 = arg1;
		Static3.anInt305 = -1;
		Static3.anInt307 = -1;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!pa;Lclient!pa;IIIZ)V")
	private void method153(@OriginalArg(0) Class2_Sub1_Sub1_Sub5 arg0, @OriginalArg(1) Class2_Sub1_Sub1_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg1.method1423();
		this.anInt333++;
		@Pc(9) int local9 = 0;
		@Pc(12) int[] local12 = arg1.anIntArray238;
		@Pc(15) int local15 = arg1.anInt2031;
		for (@Pc(17) int local17 = 0; local17 < arg0.anInt2031; local17++) {
			@Pc(23) Class47 local23 = arg0.aClass47Array2[local17];
			@Pc(28) Class47 local28 = arg0.aClass47Array1[local17];
			if (local28.anInt2075 != 0) {
				@Pc(38) int local38 = arg0.anIntArray237[local17] - arg3;
				if (local38 <= arg1.anInt2035) {
					@Pc(49) int local49 = arg0.anIntArray238[local17] - arg2;
					if (local49 >= arg1.anInt2034 && local49 <= arg1.anInt2030) {
						@Pc(65) int local65 = arg0.anIntArray225[local17] - arg4;
						if (local65 >= arg1.anInt2036 && local65 <= arg1.anInt2038) {
							for (@Pc(76) int local76 = 0; local76 < local15; local76++) {
								@Pc(82) Class47 local82 = arg1.aClass47Array2[local76];
								@Pc(87) Class47 local87 = arg1.aClass47Array1[local76];
								if (local49 == local12[local76] && local65 == arg1.anIntArray225[local76] && local38 == arg1.anIntArray237[local76] && local87.anInt2075 != 0) {
									local23.anInt2068 += local87.anInt2068;
									local23.anInt2066 += local87.anInt2066;
									local23.anInt2069 += local87.anInt2069;
									local23.anInt2075 += local87.anInt2075;
									local82.anInt2068 += local28.anInt2068;
									local82.anInt2066 += local28.anInt2066;
									local82.anInt2069 += local28.anInt2069;
									local82.anInt2075 += local28.anInt2075;
									local9++;
									this.anIntArray34[local17] = this.anInt333;
									this.anIntArray32[local76] = this.anInt333;
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
		for (@Pc(193) int local193 = 0; local193 < arg0.anInt2032; local193++) {
			if (this.anIntArray34[arg0.anIntArray232[local193]] == this.anInt333 && this.anIntArray34[arg0.anIntArray243[local193]] == this.anInt333 && this.anIntArray34[arg0.anIntArray226[local193]] == this.anInt333) {
				arg0.anIntArray229[local193] = -1;
			}
		}
		for (@Pc(236) int local236 = 0; local236 < arg1.anInt2032; local236++) {
			if (this.anIntArray32[arg1.anIntArray232[local236]] == this.anInt333 && this.anIntArray32[arg1.anIntArray243[local236]] == this.anInt333 && this.anIntArray32[arg1.anIntArray226[local236]] == this.anInt333) {
				arg1.anIntArray229[local236] = -1;
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "(III)I")
	public int method154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass12_1 == null ? 0 : local8.aClass12_1.anInt686;
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "()V")
	private void method155() {
		@Pc(3) int local3 = Static3.anIntArray26[Static3.anInt310];
		@Pc(7) Class35[] local7 = Static3.aClass35ArrayArray1[Static3.anInt310];
		Static3.anInt318 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class35 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt1814 == 1) {
				local27 = local16.anInt1815 + 25 - Static3.anInt306;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt1804 + 25 - Static3.anInt322;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1805 + 25 - Static3.anInt322;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static3.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static3.anInt303 - local16.anInt1813;
						if (local79 > 32) {
							local16.anInt1807 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt1807 = 2;
							local79 = -local79;
						}
						local16.anInt1810 = (local16.anInt1809 - Static3.anInt320 << 8) / local79;
						local16.anInt1802 = (local16.anInt1816 - Static3.anInt320 << 8) / local79;
						local16.anInt1808 = (local16.anInt1820 - Static3.anInt313 << 8) / local79;
						local16.anInt1818 = (local16.anInt1817 - Static3.anInt313 << 8) / local79;
						Static3.aClass35Array1[Static3.anInt318++] = local16;
					}
				}
			} else if (local16.anInt1814 == 2) {
				local27 = local16.anInt1804 + 25 - Static3.anInt322;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt1815 + 25 - Static3.anInt306;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1819 + 25 - Static3.anInt306;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static3.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static3.anInt320 - local16.anInt1809;
						if (local79 > 32) {
							local16.anInt1807 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt1807 = 4;
							local79 = -local79;
						}
						local16.anInt1801 = (local16.anInt1813 - Static3.anInt303 << 8) / local79;
						local16.anInt1821 = (local16.anInt1806 - Static3.anInt303 << 8) / local79;
						local16.anInt1808 = (local16.anInt1820 - Static3.anInt313 << 8) / local79;
						local16.anInt1818 = (local16.anInt1817 - Static3.anInt313 << 8) / local79;
						Static3.aClass35Array1[Static3.anInt318++] = local16;
					}
				}
			} else if (local16.anInt1814 == 4) {
				local27 = local16.anInt1820 - Static3.anInt313;
				if (local27 > 128) {
					local40 = local16.anInt1804 + 25 - Static3.anInt322;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1805 + 25 - Static3.anInt322;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt1815 + 25 - Static3.anInt306;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt1819 + 25 - Static3.anInt306;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static3.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt1807 = 5;
							local16.anInt1801 = (local16.anInt1813 - Static3.anInt303 << 8) / local27;
							local16.anInt1821 = (local16.anInt1806 - Static3.anInt303 << 8) / local27;
							local16.anInt1810 = (local16.anInt1809 - Static3.anInt320 << 8) / local27;
							local16.anInt1802 = (local16.anInt1816 - Static3.anInt320 << 8) / local27;
							Static3.aClass35Array1[Static3.anInt318++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "(III)V")
	public void method156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass12_1 = null;
		}
	}

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "(III)V")
	public void method157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass59_1 = null;
		}
	}

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "(III)Lclient!cd;")
	public Class12 method158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass12_1;
	}

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "(III)V")
	public void method159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass54_1 = null;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!rc;IIIIIII)V")
	private void method160(@OriginalArg(0) Class53 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static3.anInt303;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static3.anInt320;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray2[arg1][arg6][arg7] - Static3.anInt313;
		@Pc(51) int local51 = this.anIntArrayArrayArray2[arg1][arg6 + 1][arg7] - Static3.anInt313;
		@Pc(66) int local66 = this.anIntArrayArrayArray2[arg1][arg6 + 1][arg7 + 1] - Static3.anInt313;
		@Pc(79) int local79 = this.anIntArrayArrayArray2[arg1][arg6][arg7 + 1] - Static3.anInt313;
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
		@Pc(279) int local279 = Static24.anInt990 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static24.anInt986 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static24.anInt990 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static24.anInt986 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static24.anInt990 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static24.anInt986 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static24.anInt990 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static24.anInt986 + (local89 << 9) / local265;
		Static24.anInt987 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static24.aBoolean43 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static24.anInt993 || local327 > Static24.anInt993 || local295 > Static24.anInt993) {
				Static24.aBoolean43 = true;
			}
			if (Static3.aBoolean10 && this.method174(Static3.anInt315, Static3.anInt304, local319, local335, local303, local311, local327, local295)) {
				Static3.anInt305 = arg6;
				Static3.anInt307 = arg7;
			}
			if (arg0.anInt2291 == -1) {
				if (arg0.anInt2300 != 12345678) {
					Static24.method694(local319, local335, local303, local311, local327, local295, arg0.anInt2300, arg0.anInt2298, arg0.anInt2294);
				}
			} else if (Static3.aBoolean9) {
				local472 = Static24.anInterface4_1.method1308(arg0.anInt2291);
				Static24.method694(local319, local335, local303, local311, local327, local295, Static3.method140(local472, arg0.anInt2300), Static3.method140(local472, arg0.anInt2298), Static3.method140(local472, arg0.anInt2294));
			} else if (arg0.aBoolean138) {
				Static24.method687(local319, local335, local303, local311, local327, local295, arg0.anInt2300, arg0.anInt2298, arg0.anInt2294, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt2291);
			} else {
				Static24.method687(local319, local335, local303, local311, local327, local295, arg0.anInt2300, arg0.anInt2298, arg0.anInt2294, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt2291);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static24.aBoolean43 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static24.anInt993 || local295 > Static24.anInt993 || local327 > Static24.anInt993) {
			Static24.aBoolean43 = true;
		}
		if (Static3.aBoolean10 && this.method174(Static3.anInt315, Static3.anInt304, local287, local303, local335, local279, local295, local327)) {
			Static3.anInt305 = arg6;
			Static3.anInt307 = arg7;
		}
		if (arg0.anInt2291 != -1) {
			if (!Static3.aBoolean9) {
				Static24.method687(local287, local303, local335, local279, local295, local327, arg0.anInt2297, arg0.anInt2294, arg0.anInt2298, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt2291);
				return;
			}
			local472 = Static24.anInterface4_1.method1308(arg0.anInt2291);
			Static24.method694(local287, local303, local335, local279, local295, local327, Static3.method140(local472, arg0.anInt2297), Static3.method140(local472, arg0.anInt2294), Static3.method140(local472, arg0.anInt2298));
		} else if (arg0.anInt2297 != 12345678) {
			Static24.method694(local287, local303, local335, local279, local295, local327, arg0.anInt2297, arg0.anInt2294, arg0.anInt2298);
			return;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!pa;IIIII)V")
	private void method161(@OriginalArg(0) Class2_Sub1_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt328) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt319) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt329 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class2_Sub6 local66 = this.aClass2_Sub6ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray2[local17][local24][local34] + this.anIntArrayArrayArray2[local17][local24 + 1][local34] + this.anIntArrayArrayArray2[local17][local24][local34 + 1] + this.anIntArrayArrayArray2[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray2[arg1][arg2][arg3] + this.anIntArrayArrayArray2[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray2[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray2[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class12 local163 = local66.aClass12_1;
									if (local163 != null) {
										@Pc(173) Class2_Sub1_Sub1_Sub5 local173;
										if (local163.aClass2_Sub1_Sub1_2 instanceof Class2_Sub1_Sub1_Sub5) {
											local173 = (Class2_Sub1_Sub1_Sub5) local163.aClass2_Sub1_Sub1_2;
											if (local173.aClass47Array2 != null) {
												this.method153(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
											}
										}
										if (local163.aClass2_Sub1_Sub1_1 instanceof Class2_Sub1_Sub1_Sub5) {
											local173 = (Class2_Sub1_Sub1_Sub5) local163.aClass2_Sub1_Sub1_1;
											if (local173.aClass47Array2 != null) {
												this.method153(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
											}
										}
									}
									for (@Pc(245) int local245 = 0; local245 < local66.anInt1065; local245++) {
										@Pc(251) Class22 local251 = local66.aClass22Array3[local245];
										if (local251 != null && local251.aClass2_Sub1_Sub1_3 instanceof Class2_Sub1_Sub1_Sub5) {
											@Pc(261) Class2_Sub1_Sub1_Sub5 local261 = (Class2_Sub1_Sub1_Sub5) local251.aClass2_Sub1_Sub1_3;
											if (local261.aClass47Array2 != null) {
												@Pc(272) int local272 = local251.anInt1236 + 1 - local251.anInt1229;
												@Pc(280) int local280 = local251.anInt1232 + 1 - local251.anInt1235;
												this.method153(arg0, local261, (local251.anInt1229 - arg2) * 128 + (local272 - arg4) * 64, local160, (local251.anInt1235 - arg3) * 128 + (local280 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(IIII)V")
	public void method162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2].anInt1057 = arg3;
		}
	}

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "(III)V")
	public void method163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass27_1 = null;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIILclient!vb;II)V")
	public void method164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class27 local6 = new Class27();
		local6.aClass2_Sub1_Sub1_4 = arg4;
		local6.anInt1547 = arg1 * 128 + 64;
		local6.anInt1552 = arg2 * 128 + 64;
		local6.anInt1553 = arg3;
		local6.anInt1545 = arg5;
		local6.anInt1544 = arg6;
		if (this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub6(arg0, arg1, arg2);
		}
		this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass27_1 = local6;
	}

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "(III)Lclient!id;")
	public Class27 method165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass27_1 == null ? null : local8.aClass27_1;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIILclient!vb;IIZ)Z")
	public boolean method166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method172(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "(III)V")
	public void method167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt1065; local13++) {
			@Pc(19) Class22 local19 = local8.aClass22Array3[local13];
			if ((local19.anInt1226 >> 29 & 0x3) == 2 && local19.anInt1229 == arg1 && local19.anInt1235 == arg2) {
				this.method137(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public void method168(@OriginalArg(0) int arg0) {
		this.anInt323 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt319; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt329; local7++) {
				if (this.aClass2_Sub6ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass2_Sub6ArrayArrayArray1[arg0][local4][local7] = new Class2_Sub6(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIILclient!vb;III)Z")
	public boolean method169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub1_Sub1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method172(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!ce;IIIIII)V")
	private void method170(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray70.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray70[local5] - Static3.anInt303;
			local20 = arg0.anIntArray82[local5] - Static3.anInt313;
			local27 = arg0.anIntArray83[local5] - Static3.anInt320;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray72 != null) {
				Static16.anIntArray78[local5] = local37;
				Static16.anIntArray81[local5] = local59;
				Static16.anIntArray71[local5] = local69;
			}
			Static16.anIntArray74[local5] = Static24.anInt990 + (local37 << 9) / local69;
			Static16.anIntArray69[local5] = Static24.anInt986 + (local59 << 9) / local69;
		}
		Static24.anInt987 = 0;
		local3 = arg0.anIntArray80.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray80[local13];
			local27 = arg0.anIntArray73[local13];
			local37 = arg0.anIntArray76[local13];
			@Pc(142) int local142 = Static16.anIntArray74[local20];
			@Pc(146) int local146 = Static16.anIntArray74[local27];
			@Pc(150) int local150 = Static16.anIntArray74[local37];
			@Pc(154) int local154 = Static16.anIntArray69[local20];
			@Pc(158) int local158 = Static16.anIntArray69[local27];
			@Pc(162) int local162 = Static16.anIntArray69[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static24.aBoolean43 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static24.anInt993 || local146 > Static24.anInt993 || local150 > Static24.anInt993) {
					Static24.aBoolean43 = true;
				}
				if (Static3.aBoolean10 && this.method174(Static3.anInt315, Static3.anInt304, local154, local158, local162, local142, local146, local150)) {
					Static3.anInt305 = arg5;
					Static3.anInt307 = arg6;
				}
				if (arg0.anIntArray72 == null || arg0.anIntArray72[local13] == -1) {
					if (arg0.anIntArray75[local13] != 12345678) {
						Static24.method694(local154, local158, local162, local142, local146, local150, arg0.anIntArray75[local13], arg0.anIntArray77[local13], arg0.anIntArray79[local13]);
					}
				} else if (Static3.aBoolean9) {
					@Pc(364) int local364 = Static24.anInterface4_1.method1308(arg0.anIntArray72[local13]);
					Static24.method694(local154, local158, local162, local142, local146, local150, Static3.method140(local364, arg0.anIntArray75[local13]), Static3.method140(local364, arg0.anIntArray77[local13]), Static3.method140(local364, arg0.anIntArray79[local13]));
				} else if (arg0.aBoolean22) {
					Static24.method687(local154, local158, local162, local142, local146, local150, arg0.anIntArray75[local13], arg0.anIntArray77[local13], arg0.anIntArray79[local13], Static16.anIntArray78[0], Static16.anIntArray78[1], Static16.anIntArray78[3], Static16.anIntArray81[0], Static16.anIntArray81[1], Static16.anIntArray81[3], Static16.anIntArray71[0], Static16.anIntArray71[1], Static16.anIntArray71[3], arg0.anIntArray72[local13]);
				} else {
					Static24.method687(local154, local158, local162, local142, local146, local150, arg0.anIntArray75[local13], arg0.anIntArray77[local13], arg0.anIntArray79[local13], Static16.anIntArray78[local20], Static16.anIntArray78[local27], Static16.anIntArray78[local37], Static16.anIntArray81[local20], Static16.anIntArray81[local27], Static16.anIntArray81[local37], Static16.anIntArray71[local20], Static16.anIntArray71[local27], Static16.anIntArray71[local37], arg0.anIntArray72[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIILclient!vb;ILclient!vb;Lclient!vb;)V")
	public void method171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub1_Sub1 arg6, @OriginalArg(7) Class2_Sub1_Sub1 arg7) {
		@Pc(3) Class59 local3 = new Class59();
		local3.aClass2_Sub1_Sub1_6 = arg4;
		local3.anInt2375 = arg1 * 128 + 64;
		local3.anInt2365 = arg2 * 128 + 64;
		local3.anInt2369 = arg3;
		local3.anInt2370 = arg5;
		local3.aClass2_Sub1_Sub1_7 = arg6;
		local3.aClass2_Sub1_Sub1_8 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class2_Sub6 local43 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt1065; local47++) {
				if ((local43.aClass22Array3[local47].anInt1227 & 0x100) == 256 && local43.aClass22Array3[local47].aClass2_Sub1_Sub1_3 instanceof Class2_Sub1_Sub1_Sub5) {
					@Pc(71) Class2_Sub1_Sub1_Sub5 local71 = (Class2_Sub1_Sub1_Sub5) local43.aClass22Array3[local47].aClass2_Sub1_Sub1_3;
					local71.method1400();
					if (local71.anInt2698 > local34) {
						local34 = local71.anInt2698;
					}
				}
			}
		}
		local3.anInt2374 = local34;
		if (this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub6(arg0, arg1, arg2);
		}
		this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass59_1 = local3;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIIILclient!vb;IZII)Z")
	private boolean method172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class2_Sub1_Sub1 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt319 || local4 >= this.anInt329) {
					return false;
				}
				@Pc(28) Class2_Sub6 local28 = this.aClass2_Sub6ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt1065 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class22 local52 = new Class22();
		local52.anInt1226 = arg11;
		local52.anInt1227 = arg12;
		local52.anInt1225 = arg0;
		local52.anInt1231 = arg5;
		local52.anInt1228 = arg6;
		local52.anInt1233 = arg7;
		local52.aClass2_Sub1_Sub1_3 = arg8;
		local52.anInt1234 = arg9;
		local52.anInt1229 = arg1;
		local52.anInt1235 = arg2;
		local52.anInt1236 = arg1 + arg3 - 1;
		local52.anInt1232 = arg2 + arg4 - 1;
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
					if (this.aClass2_Sub6ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass2_Sub6ArrayArrayArray1[local130][local98][local101] = new Class2_Sub6(local130, local98, local101);
					}
				}
				@Pc(166) Class2_Sub6 local166 = this.aClass2_Sub6ArrayArrayArray1[arg0][local98][local101];
				local166.aClass22Array3[local166.anInt1065] = local52;
				local166.anIntArray116[local166.anInt1065] = local104;
				local166.anInt1062 |= local104;
				local166.anInt1065++;
			}
		}
		if (arg10) {
			this.aClass22Array1[this.anInt316++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "(IIII)I")
	public int method173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass12_1 != null && local8.aClass12_1.anInt686 == arg3) {
			return local8.aClass12_1.anInt692 & 0xFF;
		} else if (local8.aClass54_1 != null && local8.aClass54_1.anInt2317 == arg3) {
			return local8.aClass54_1.anInt2311 & 0xFF;
		} else if (local8.aClass27_1 != null && local8.aClass27_1.anInt1545 == arg3) {
			return local8.aClass27_1.anInt1544 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt1065; local56++) {
				if (local8.aClass22Array3[local56].anInt1226 == arg3) {
					return local8.aClass22Array3[local56].anInt1227 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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
}
