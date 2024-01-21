import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class60 {

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
	private int anInt2550 = 0;

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
	private int anInt2547 = 0;

	@OriginalMember(owner = "client!ob", name = "C", descriptor = "[Lclient!kf;")
	private final Class48[] aClass48Array1 = new Class48[5000];

	@OriginalMember(owner = "client!ob", name = "O", descriptor = "[[I")
	private final int[][] anIntArrayArray30 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!ob", name = "N", descriptor = "[[I")
	private final int[][] anIntArrayArray29 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!ob", name = "K", descriptor = "I")
	private final int anInt2567;

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
	private final int anInt2545;

	@OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
	private final int anInt2566;

	@OriginalMember(owner = "client!ob", name = "M", descriptor = "[[[Lclient!td;")
	private final Class2_Sub22[][][] aClass2_Sub22ArrayArrayArray1;

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(III[[[I)V")
	public Class60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt2567 = arg0;
		this.anInt2545 = arg1;
		this.anInt2566 = arg2;
		this.aClass2_Sub22ArrayArrayArray1 = new Class2_Sub22[arg0][arg1][arg2];
		this.anIntArrayArrayArray6 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray5 = arg3;
		this.method1821();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V")
	public void method1779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub22 local8 = this.aClass2_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass80_1 = null;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([IIIIII)V")
	public void method1780(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class2_Sub22 local8 = this.aClass2_Sub22ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class17 local14 = local8.aClass17_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt851;
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
		@Pc(59) Class64 local59 = local8.aClass64_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt2872;
		@Pc(68) int local68 = local59.anInt2873;
		@Pc(71) int local71 = local59.anInt2871;
		@Pc(74) int local74 = local59.anInt2870;
		@Pc(79) int[] local79 = this.anIntArrayArray29[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray30[local68];
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

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(III)I")
	public int method1782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub22 local8 = this.aClass2_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass80_1 == null ? 0 : local8.aClass80_1.anInt3387;
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(III)I")
	public int method1784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub22 local8 = this.aClass2_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass49_1 == null ? 0 : local8.aClass49_1.anInt2094;
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(III)I")
	public int method1785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub22 local8 = this.aClass2_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass71_1 == null ? 0 : local8.aClass71_1.anInt3170;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method1786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class17 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class17(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub22ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub22ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub22(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub22ArrayArrayArray1[arg0][arg1][arg2].aClass17_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class17(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub22ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub22ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub22(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub22ArrayArrayArray1[arg0][arg1][arg2].aClass17_1 = local12;
		} else {
			@Pc(140) Class64 local140 = new Class64(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub22ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub22ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub22(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub22ArrayArrayArray1[arg0][arg1][arg2].aClass64_1 = local140;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIII)Z")
	private boolean method1787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method1802(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method1792(local11 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2] - arg3, local15 + 1) && this.method1792(local11 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method1792(local11 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method1792(local11 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIILclient!sh;ILclient!sh;Lclient!sh;)V")
	public void method1788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub3 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub1_Sub3 arg6, @OriginalArg(7) Class2_Sub1_Sub3 arg7) {
		@Pc(3) Class79 local3 = new Class79();
		local3.aClass2_Sub1_Sub3_7 = arg4;
		local3.anInt3353 = arg1 * 128 + 64;
		local3.anInt3348 = arg2 * 128 + 64;
		local3.anInt3351 = arg3;
		local3.anInt3352 = arg5;
		local3.aClass2_Sub1_Sub3_5 = arg6;
		local3.aClass2_Sub1_Sub3_6 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class2_Sub22 local43 = this.aClass2_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt3323; local47++) {
				if ((local43.aClass48Array3[local47].anInt1939 & 0x100) == 256 && local43.aClass48Array3[local47].aClass2_Sub1_Sub3_1 instanceof Class2_Sub1_Sub3_Sub3) {
					@Pc(71) Class2_Sub1_Sub3_Sub3 local71 = (Class2_Sub1_Sub3_Sub3) local43.aClass48Array3[local47].aClass2_Sub1_Sub3_1;
					local71.method825();
					if (local71.anInt3614 > local34) {
						local34 = local71.anInt3614;
					}
				}
			}
		}
		local3.anInt3349 = local34;
		if (this.aClass2_Sub22ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass2_Sub22ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub22(arg0, arg1, arg2);
		}
		this.aClass2_Sub22ArrayArrayArray1[arg0][arg1][arg2].aClass79_1 = local3;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIII)V")
	public void method1789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt2545 * 128) {
			arg0 = this.anInt2545 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt2566 * 128) {
			arg2 = this.anInt2566 * 128 - 1;
		}
		Static113.anInt2557++;
		Static113.anInt2540 = Class2_Sub1_Sub4_Sub4.anIntArray299[arg3];
		Static113.anInt2564 = Class2_Sub1_Sub4_Sub4.anIntArray304[arg3];
		Static113.anInt2561 = Class2_Sub1_Sub4_Sub4.anIntArray299[arg4];
		Static113.anInt2562 = Class2_Sub1_Sub4_Sub4.anIntArray304[arg4];
		Static113.aBooleanArrayArray1 = Static113.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static113.anInt2541 = arg0;
		Static113.anInt2554 = arg1;
		Static113.anInt2555 = arg2;
		Static113.anInt2559 = arg0 / 128;
		Static113.anInt2548 = arg2 / 128;
		Static113.anInt2558 = arg5;
		Static113.anInt2543 = Static113.anInt2559 - 25;
		if (Static113.anInt2543 < 0) {
			Static113.anInt2543 = 0;
		}
		Static113.anInt2552 = Static113.anInt2548 - 25;
		if (Static113.anInt2552 < 0) {
			Static113.anInt2552 = 0;
		}
		Static113.anInt2560 = Static113.anInt2559 + 25;
		if (Static113.anInt2560 > this.anInt2545) {
			Static113.anInt2560 = this.anInt2545;
		}
		Static113.anInt2565 = Static113.anInt2548 + 25;
		if (Static113.anInt2565 > this.anInt2566) {
			Static113.anInt2565 = this.anInt2566;
		}
		this.method1797();
		Static113.anInt2553 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt2550; local128 < this.anInt2567; local128++) {
			@Pc(134) Class2_Sub22[][] local134 = this.aClass2_Sub22ArrayArrayArray1[local128];
			for (local136 = Static113.anInt2543; local136 < Static113.anInt2560; local136++) {
				for (local139 = Static113.anInt2552; local139 < Static113.anInt2565; local139++) {
					@Pc(146) Class2_Sub22 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt3318 <= arg5 && (Static113.aBooleanArrayArray1[local136 + 25 - Static113.anInt2559][local139 + 25 - Static113.anInt2548] || this.anIntArrayArrayArray5[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean148 = true;
							local146.aBoolean146 = true;
							if (local146.anInt3323 > 0) {
								local146.aBoolean147 = true;
							} else {
								local146.aBoolean147 = false;
							}
							Static113.anInt2553++;
						} else {
							local146.aBoolean148 = false;
							local146.aBoolean146 = false;
							local146.anInt3313 = 0;
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
		for (@Pc(224) int local224 = this.anInt2550; local224 < this.anInt2567; local224++) {
			@Pc(230) Class2_Sub22[][] local230 = this.aClass2_Sub22ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static113.anInt2559 + local139;
				local241 = Static113.anInt2559 - local139;
				if (local237 >= Static113.anInt2543 || local241 < Static113.anInt2560) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static113.anInt2548 + local249;
						local258 = Static113.anInt2548 - local249;
						@Pc(270) Class2_Sub22 local270;
						if (local237 >= Static113.anInt2543) {
							if (local254 >= Static113.anInt2552) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean148) {
									this.method1793(local270, true);
								}
							}
							if (local258 < Static113.anInt2565) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean148) {
									this.method1793(local270, true);
								}
							}
						}
						if (local241 < Static113.anInt2560) {
							if (local254 >= Static113.anInt2552) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean148) {
									this.method1793(local270, true);
								}
							}
							if (local258 < Static113.anInt2565) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean148) {
									this.method1793(local270, true);
								}
							}
						}
						if (Static113.anInt2553 == 0) {
							Static113.aBoolean114 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt2550; local136 < this.anInt2567; local136++) {
			@Pc(361) Class2_Sub22[][] local361 = this.aClass2_Sub22ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static113.anInt2559 + local237;
				local249 = Static113.anInt2559 - local237;
				if (local241 >= Static113.anInt2543 || local249 < Static113.anInt2560) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static113.anInt2548 + local254;
						@Pc(389) int local389 = Static113.anInt2548 - local254;
						@Pc(401) Class2_Sub22 local401;
						if (local241 >= Static113.anInt2543) {
							if (local258 >= Static113.anInt2552) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean148) {
									this.method1793(local401, false);
								}
							}
							if (local389 < Static113.anInt2565) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean148) {
									this.method1793(local401, false);
								}
							}
						}
						if (local249 < Static113.anInt2560) {
							if (local258 >= Static113.anInt2552) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean148) {
									this.method1793(local401, false);
								}
							}
							if (local389 < Static113.anInt2565) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean148) {
									this.method1793(local401, false);
								}
							}
						}
						if (Static113.anInt2553 == 0) {
							Static113.aBoolean114 = false;
							return;
						}
					}
				}
			}
		}
		Static113.aBoolean114 = false;
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "(III)Lclient!s;")
	public Class71 method1790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub22 local8 = this.aClass2_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass71_1;
	}

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "(III)Z")
	private boolean method1792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static113.anInt2546; local1++) {
			@Pc(6) Class61 local6 = Static113.aClass61Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt2581 == 1) {
				local15 = local6.anInt2575 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt2588 + (local6.anInt2578 * local15 >> 8);
					local37 = local6.anInt2584 + (local6.anInt2589 * local15 >> 8);
					local47 = local6.anInt2582 + (local6.anInt2576 * local15 >> 8);
					local57 = local6.anInt2585 + (local6.anInt2580 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2581 == 2) {
				local15 = arg0 - local6.anInt2575;
				if (local15 > 0) {
					local27 = local6.anInt2588 + (local6.anInt2578 * local15 >> 8);
					local37 = local6.anInt2584 + (local6.anInt2589 * local15 >> 8);
					local47 = local6.anInt2582 + (local6.anInt2576 * local15 >> 8);
					local57 = local6.anInt2585 + (local6.anInt2580 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2581 == 3) {
				local15 = local6.anInt2588 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt2575 + (local6.anInt2592 * local15 >> 8);
					local37 = local6.anInt2590 + (local6.anInt2593 * local15 >> 8);
					local47 = local6.anInt2582 + (local6.anInt2576 * local15 >> 8);
					local57 = local6.anInt2585 + (local6.anInt2580 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2581 == 4) {
				local15 = arg2 - local6.anInt2588;
				if (local15 > 0) {
					local27 = local6.anInt2575 + (local6.anInt2592 * local15 >> 8);
					local37 = local6.anInt2590 + (local6.anInt2593 * local15 >> 8);
					local47 = local6.anInt2582 + (local6.anInt2576 * local15 >> 8);
					local57 = local6.anInt2585 + (local6.anInt2580 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2581 == 5) {
				local15 = arg1 - local6.anInt2582;
				if (local15 > 0) {
					local27 = local6.anInt2575 + (local6.anInt2592 * local15 >> 8);
					local37 = local6.anInt2590 + (local6.anInt2593 * local15 >> 8);
					local47 = local6.anInt2588 + (local6.anInt2578 * local15 >> 8);
					local57 = local6.anInt2584 + (local6.anInt2589 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!td;Z)V")
	private void method1793(@OriginalArg(0) Class2_Sub22 arg0, @OriginalArg(1) boolean arg1) {
		Static113.aClass12_8.method382(arg0);
		while (true) {
			@Pc(8) Class2_Sub22 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class2_Sub22[][] local31;
			@Pc(49) Class2_Sub22 local49;
			@Pc(251) int local251;
			@Pc(592) int local592;
			@Pc(597) int local597;
			@Pc(602) int local602;
			@Pc(919) Class71 local919;
			@Pc(1093) int local1093;
			@Pc(978) int local978;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class48 var12;
										@Pc(605) int var17;
										@Pc(614) int var18;
										@Pc(626) int var19;
										@Pc(345) int var21;
										@Pc(289) boolean var22;
										@Pc(800) Class2_Sub22 var33;
										while (true) {
											do {
												local8 = (Class2_Sub22) Static113.aClass12_8.method385();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean146);
											local17 = local8.anInt3319;
											local20 = local8.anInt3312;
											local23 = local8.anInt3324;
											local26 = local8.anInt3322;
											local31 = this.aClass2_Sub22ArrayArrayArray1[local23];
											if (!local8.aBoolean148) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass2_Sub22ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean146) {
														continue;
													}
												}
												if (local17 <= Static113.anInt2559 && local17 > Static113.anInt2543) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean146 && (local49.aBoolean148 || (local8.anInt3311 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static113.anInt2559 && local17 < Static113.anInt2560 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean146 && (local49.aBoolean148 || (local8.anInt3311 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static113.anInt2548 && local20 > Static113.anInt2552) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean146 && (local49.aBoolean148 || (local8.anInt3311 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static113.anInt2548 && local20 < Static113.anInt2565 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean146 && (local49.aBoolean148 || (local8.anInt3311 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean148 = false;
											if (local8.aClass2_Sub22_1 != null) {
												local49 = local8.aClass2_Sub22_1;
												if (local49.aClass17_1 == null) {
													if (local49.aClass64_1 != null && !this.method1802(0, local17, local20)) {
														this.method1827(local49.aClass64_1, Static113.anInt2540, Static113.anInt2564, Static113.anInt2561, Static113.anInt2562, local17, local20);
													}
												} else if (!this.method1802(0, local17, local20)) {
													this.method1799(local49.aClass17_1, 0, Static113.anInt2540, Static113.anInt2564, Static113.anInt2561, Static113.anInt2562, local17, local20);
												}
												@Pc(225) Class71 local225 = local49.aClass71_1;
												if (local225 != null) {
													local225.aClass2_Sub1_Sub3_3.method2546(0, Static113.anInt2540, Static113.anInt2564, Static113.anInt2561, Static113.anInt2562, local225.anInt3161 - Static113.anInt2541, local225.anInt3165 - Static113.anInt2554, local225.anInt3168 - Static113.anInt2555, local225.anInt3170);
												}
												for (local251 = 0; local251 < local49.anInt3323; local251++) {
													var12 = local49.aClass48Array3[local251];
													if (var12 != null) {
														var12.aClass2_Sub1_Sub3_1.method2546(var12.anInt1949, Static113.anInt2540, Static113.anInt2564, Static113.anInt2561, Static113.anInt2562, var12.anInt1950 - Static113.anInt2541, var12.anInt1940 - Static113.anInt2554, var12.anInt1948 - Static113.anInt2555, var12.anInt1938);
													}
												}
											}
											var22 = false;
											if (local8.aClass17_1 == null) {
												if (local8.aClass64_1 != null && !this.method1802(local26, local17, local20)) {
													var22 = true;
													this.method1827(local8.aClass64_1, Static113.anInt2540, Static113.anInt2564, Static113.anInt2561, Static113.anInt2562, local17, local20);
												}
											} else if (!this.method1802(local26, local17, local20)) {
												var22 = true;
												if (local8.aClass17_1.anInt850 != 12345678 || Static113.aBoolean114 && local23 <= Static113.anInt2542) {
													this.method1799(local8.aClass17_1, local26, Static113.anInt2540, Static113.anInt2564, Static113.anInt2561, Static113.anInt2562, local17, local20);
												}
											}
											var21 = 0;
											local251 = 0;
											@Pc(350) Class71 local350 = local8.aClass71_1;
											@Pc(353) Class80 local353 = local8.aClass80_1;
											if (local350 != null || local353 != null) {
												if (Static113.anInt2559 == local17) {
													var21++;
												} else if (Static113.anInt2559 < local17) {
													var21 += 2;
												}
												if (Static113.anInt2548 == local20) {
													var21 += 3;
												} else if (Static113.anInt2548 > local20) {
													var21 += 6;
												}
												local251 = Static113.anIntArray268[var21];
												local8.anInt3316 = Static113.anIntArray267[var21];
											}
											if (local350 != null) {
												if ((local350.anInt3163 & Static113.anIntArray266[var21]) == 0) {
													local8.anInt3313 = 0;
												} else if (local350.anInt3163 == 16) {
													local8.anInt3313 = 3;
													local8.anInt3320 = Static113.anIntArray272[var21];
													local8.anInt3310 = 3 - local8.anInt3320;
												} else if (local350.anInt3163 == 32) {
													local8.anInt3313 = 6;
													local8.anInt3320 = Static113.anIntArray270[var21];
													local8.anInt3310 = 6 - local8.anInt3320;
												} else if (local350.anInt3163 == 64) {
													local8.anInt3313 = 12;
													local8.anInt3320 = Static113.anIntArray271[var21];
													local8.anInt3310 = 12 - local8.anInt3320;
												} else {
													local8.anInt3313 = 9;
													local8.anInt3320 = Static113.anIntArray269[var21];
													local8.anInt3310 = 9 - local8.anInt3320;
												}
												if ((local350.anInt3163 & local251) != 0 && !this.method1798(local26, local17, local20, local350.anInt3163)) {
													local350.aClass2_Sub1_Sub3_3.method2546(0, Static113.anInt2540, Static113.anInt2564, Static113.anInt2561, Static113.anInt2562, local350.anInt3161 - Static113.anInt2541, local350.anInt3165 - Static113.anInt2554, local350.anInt3168 - Static113.anInt2555, local350.anInt3170);
												}
												if ((local350.anInt3166 & local251) != 0 && !this.method1798(local26, local17, local20, local350.anInt3166)) {
													local350.aClass2_Sub1_Sub3_4.method2546(0, Static113.anInt2540, Static113.anInt2564, Static113.anInt2561, Static113.anInt2562, local350.anInt3161 - Static113.anInt2541, local350.anInt3165 - Static113.anInt2554, local350.anInt3168 - Static113.anInt2555, local350.anInt3170);
												}
											}
											if (local353 != null && !this.method1787(local26, local17, local20, local353.aClass2_Sub1_Sub3_8.anInt3614)) {
												if ((local353.anInt3385 & local251) != 0) {
													local353.aClass2_Sub1_Sub3_8.method2546(0, Static113.anInt2540, Static113.anInt2564, Static113.anInt2561, Static113.anInt2562, local353.anInt3382 + local353.anInt3390 - Static113.anInt2541, local353.anInt3392 - Static113.anInt2554, local353.anInt3389 + local353.anInt3396 - Static113.anInt2555, local353.anInt3387);
												} else if (local353.anInt3385 == 256) {
													local592 = local353.anInt3382 - Static113.anInt2541;
													local597 = local353.anInt3392 - Static113.anInt2554;
													local602 = local353.anInt3389 - Static113.anInt2555;
													var17 = local353.anInt3386;
													if (var17 == 1 || var17 == 2) {
														var18 = -local592;
													} else {
														var18 = local592;
													}
													if (var17 == 2 || var17 == 3) {
														var19 = -local602;
													} else {
														var19 = local602;
													}
													if (var19 < var18) {
														local353.aClass2_Sub1_Sub3_8.method2546(0, Static113.anInt2540, Static113.anInt2564, Static113.anInt2561, Static113.anInt2562, local592 + local353.anInt3390, local597, local602 + local353.anInt3396, local353.anInt3387);
													} else if (local353.aClass2_Sub1_Sub3_9 != null) {
														local353.aClass2_Sub1_Sub3_9.method2546(0, Static113.anInt2540, Static113.anInt2564, Static113.anInt2561, Static113.anInt2562, local592, local597, local602, local353.anInt3387);
													}
												}
											}
											if (var22) {
												@Pc(673) Class49 local673 = local8.aClass49_1;
												if (local673 != null) {
													local673.aClass2_Sub1_Sub3_2.method2546(0, Static113.anInt2540, Static113.anInt2564, Static113.anInt2561, Static113.anInt2562, local673.anInt2097 - Static113.anInt2541, local673.anInt2100 - Static113.anInt2554, local673.anInt2098 - Static113.anInt2555, local673.anInt2094);
												}
												@Pc(700) Class79 local700 = local8.aClass79_1;
												if (local700 != null && local700.anInt3349 == 0) {
													if (local700.aClass2_Sub1_Sub3_5 != null) {
														local700.aClass2_Sub1_Sub3_5.method2546(0, Static113.anInt2540, Static113.anInt2564, Static113.anInt2561, Static113.anInt2562, local700.anInt3353 - Static113.anInt2541, local700.anInt3351 - Static113.anInt2554, local700.anInt3348 - Static113.anInt2555, local700.anInt3352);
													}
													if (local700.aClass2_Sub1_Sub3_6 != null) {
														local700.aClass2_Sub1_Sub3_6.method2546(0, Static113.anInt2540, Static113.anInt2564, Static113.anInt2561, Static113.anInt2562, local700.anInt3353 - Static113.anInt2541, local700.anInt3351 - Static113.anInt2554, local700.anInt3348 - Static113.anInt2555, local700.anInt3352);
													}
													if (local700.aClass2_Sub1_Sub3_7 != null) {
														local700.aClass2_Sub1_Sub3_7.method2546(0, Static113.anInt2540, Static113.anInt2564, Static113.anInt2561, Static113.anInt2562, local700.anInt3353 - Static113.anInt2541, local700.anInt3351 - Static113.anInt2554, local700.anInt3348 - Static113.anInt2555, local700.anInt3352);
													}
												}
											}
											local592 = local8.anInt3311;
											if (local592 != 0) {
												if (local17 < Static113.anInt2559 && (local592 & 0x4) != 0) {
													var33 = local31[local17 + 1][local20];
													if (var33 != null && var33.aBoolean146) {
														Static113.aClass12_8.method382(var33);
													}
												}
												if (local20 < Static113.anInt2548 && (local592 & 0x2) != 0) {
													var33 = local31[local17][local20 + 1];
													if (var33 != null && var33.aBoolean146) {
														Static113.aClass12_8.method382(var33);
													}
												}
												if (local17 > Static113.anInt2559 && (local592 & 0x1) != 0) {
													var33 = local31[local17 - 1][local20];
													if (var33 != null && var33.aBoolean146) {
														Static113.aClass12_8.method382(var33);
													}
												}
												if (local20 > Static113.anInt2548 && (local592 & 0x8) != 0) {
													var33 = local31[local17][local20 - 1];
													if (var33 != null && var33.aBoolean146) {
														Static113.aClass12_8.method382(var33);
													}
												}
											}
											break;
										}
										if (local8.anInt3313 != 0) {
											var22 = true;
											for (var21 = 0; var21 < local8.anInt3323; var21++) {
												if (local8.aClass48Array3[var21].anInt1953 != Static113.anInt2557 && (local8.anIntArray352[var21] & local8.anInt3313) == local8.anInt3320) {
													var22 = false;
													break;
												}
											}
											if (var22) {
												local919 = local8.aClass71_1;
												if (!this.method1798(local26, local17, local20, local919.anInt3163)) {
													local919.aClass2_Sub1_Sub3_3.method2546(0, Static113.anInt2540, Static113.anInt2564, Static113.anInt2561, Static113.anInt2562, local919.anInt3161 - Static113.anInt2541, local919.anInt3165 - Static113.anInt2554, local919.anInt3168 - Static113.anInt2555, local919.anInt3170);
												}
												local8.anInt3313 = 0;
											}
										}
										if (!local8.aBoolean147) {
											break;
										}
										try {
											@Pc(958) int local958 = local8.anInt3323;
											local8.aBoolean147 = false;
											var21 = 0;
											label558: for (local251 = 0; local251 < local958; local251++) {
												var12 = local8.aClass48Array3[local251];
												if (var12.anInt1953 != Static113.anInt2557) {
													for (local978 = var12.anInt1941; local978 <= var12.anInt1951; local978++) {
														for (local592 = var12.anInt1942; local592 <= var12.anInt1947; local592++) {
															var33 = local31[local978][local592];
															if (var33.aBoolean148) {
																local8.aBoolean147 = true;
																continue label558;
															}
															if (var33.anInt3313 != 0) {
																local602 = 0;
																if (local978 > var12.anInt1941) {
																	local602++;
																}
																if (local978 < var12.anInt1951) {
																	local602 += 4;
																}
																if (local592 > var12.anInt1942) {
																	local602 += 8;
																}
																if (local592 < var12.anInt1947) {
																	local602 += 2;
																}
																if ((local602 & var33.anInt3313) == local8.anInt3310) {
																	local8.aBoolean147 = true;
																	continue label558;
																}
															}
														}
													}
													Static113.aClass48Array2[var21++] = var12;
													local592 = Static113.anInt2559 - var12.anInt1941;
													local597 = var12.anInt1951 - Static113.anInt2559;
													if (local597 > local592) {
														local592 = local597;
													}
													local602 = Static113.anInt2548 - var12.anInt1942;
													var17 = var12.anInt1947 - Static113.anInt2548;
													if (var17 > local602) {
														var12.anInt1952 = local592 + var17;
													} else {
														var12.anInt1952 = local592 + local602;
													}
												}
											}
											while (var21 > 0) {
												local1093 = -50;
												local978 = -1;
												@Pc(1102) Class48 local1102;
												for (local592 = 0; local592 < var21; local592++) {
													local1102 = Static113.aClass48Array2[local592];
													if (local1102.anInt1953 != Static113.anInt2557) {
														if (local1102.anInt1952 > local1093) {
															local1093 = local1102.anInt1952;
															local978 = local592;
														} else if (local1102.anInt1952 == local1093) {
															local602 = local1102.anInt1950 - Static113.anInt2541;
															var17 = local1102.anInt1948 - Static113.anInt2555;
															var18 = Static113.aClass48Array2[local978].anInt1950 - Static113.anInt2541;
															var19 = Static113.aClass48Array2[local978].anInt1948 - Static113.anInt2555;
															if (local602 * local602 + var17 * var17 > var18 * var18 + var19 * var19) {
																local978 = local592;
															}
														}
													}
												}
												if (local978 == -1) {
													break;
												}
												local1102 = Static113.aClass48Array2[local978];
												local1102.anInt1953 = Static113.anInt2557;
												if (!this.method1807(local26, local1102.anInt1941, local1102.anInt1951, local1102.anInt1942, local1102.anInt1947, local1102.aClass2_Sub1_Sub3_1.anInt3614)) {
													local1102.aClass2_Sub1_Sub3_1.method2546(local1102.anInt1949, Static113.anInt2540, Static113.anInt2564, Static113.anInt2561, Static113.anInt2562, local1102.anInt1950 - Static113.anInt2541, local1102.anInt1940 - Static113.anInt2554, local1102.anInt1948 - Static113.anInt2555, local1102.anInt1938);
												}
												for (local602 = local1102.anInt1941; local602 <= local1102.anInt1951; local602++) {
													for (var17 = local1102.anInt1942; var17 <= local1102.anInt1947; var17++) {
														@Pc(1227) Class2_Sub22 local1227 = local31[local602][var17];
														if (local1227.anInt3313 != 0) {
															Static113.aClass12_8.method382(local1227);
														} else if ((local602 != local17 || var17 != local20) && local1227.aBoolean146) {
															Static113.aClass12_8.method382(local1227);
														}
													}
												}
											}
											if (!local8.aBoolean147) {
												break;
											}
										} catch (@Pc(1265) Exception local1265) {
											local8.aBoolean147 = false;
											break;
										}
									}
								} while (!local8.aBoolean146);
							} while (local8.anInt3313 != 0);
							if (local17 > Static113.anInt2559 || local17 <= Static113.anInt2543) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean146);
						if (local17 < Static113.anInt2559 || local17 >= Static113.anInt2560 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean146);
					if (local20 > Static113.anInt2548 || local20 <= Static113.anInt2552) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean146);
				if (local20 < Static113.anInt2548 || local20 >= Static113.anInt2565 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean146);
			local8.aBoolean146 = false;
			Static113.anInt2553--;
			@Pc(1369) Class79 local1369 = local8.aClass79_1;
			if (local1369 != null && local1369.anInt3349 != 0) {
				if (local1369.aClass2_Sub1_Sub3_5 != null) {
					local1369.aClass2_Sub1_Sub3_5.method2546(0, Static113.anInt2540, Static113.anInt2564, Static113.anInt2561, Static113.anInt2562, local1369.anInt3353 - Static113.anInt2541, local1369.anInt3351 - Static113.anInt2554 - local1369.anInt3349, local1369.anInt3348 - Static113.anInt2555, local1369.anInt3352);
				}
				if (local1369.aClass2_Sub1_Sub3_6 != null) {
					local1369.aClass2_Sub1_Sub3_6.method2546(0, Static113.anInt2540, Static113.anInt2564, Static113.anInt2561, Static113.anInt2562, local1369.anInt3353 - Static113.anInt2541, local1369.anInt3351 - Static113.anInt2554 - local1369.anInt3349, local1369.anInt3348 - Static113.anInt2555, local1369.anInt3352);
				}
				if (local1369.aClass2_Sub1_Sub3_7 != null) {
					local1369.aClass2_Sub1_Sub3_7.method2546(0, Static113.anInt2540, Static113.anInt2564, Static113.anInt2561, Static113.anInt2562, local1369.anInt3353 - Static113.anInt2541, local1369.anInt3351 - Static113.anInt2554 - local1369.anInt3349, local1369.anInt3348 - Static113.anInt2555, local1369.anInt3352);
				}
			}
			if (local8.anInt3316 != 0) {
				@Pc(1464) Class80 local1464 = local8.aClass80_1;
				if (local1464 != null && !this.method1787(local26, local17, local20, local1464.aClass2_Sub1_Sub3_8.anInt3614)) {
					if ((local1464.anInt3385 & local8.anInt3316) != 0) {
						local1464.aClass2_Sub1_Sub3_8.method2546(0, Static113.anInt2540, Static113.anInt2564, Static113.anInt2561, Static113.anInt2562, local1464.anInt3382 + local1464.anInt3390 - Static113.anInt2541, local1464.anInt3392 - Static113.anInt2554, local1464.anInt3389 + local1464.anInt3396 - Static113.anInt2555, local1464.anInt3387);
					} else if (local1464.anInt3385 == 256) {
						local251 = local1464.anInt3382 - Static113.anInt2541;
						local1093 = local1464.anInt3392 - Static113.anInt2554;
						local978 = local1464.anInt3389 - Static113.anInt2555;
						local592 = local1464.anInt3386;
						if (local592 == 1 || local592 == 2) {
							local597 = -local251;
						} else {
							local597 = local251;
						}
						if (local592 == 2 || local592 == 3) {
							local602 = -local978;
						} else {
							local602 = local978;
						}
						if (local602 >= local597) {
							local1464.aClass2_Sub1_Sub3_8.method2546(0, Static113.anInt2540, Static113.anInt2564, Static113.anInt2561, Static113.anInt2562, local251 + local1464.anInt3390, local1093, local978 + local1464.anInt3396, local1464.anInt3387);
						} else if (local1464.aClass2_Sub1_Sub3_9 != null) {
							local1464.aClass2_Sub1_Sub3_9.method2546(0, Static113.anInt2540, Static113.anInt2564, Static113.anInt2561, Static113.anInt2562, local251, local1093, local978, local1464.anInt3387);
						}
					}
				}
				local919 = local8.aClass71_1;
				if (local919 != null) {
					if ((local919.anInt3166 & local8.anInt3316) != 0 && !this.method1798(local26, local17, local20, local919.anInt3166)) {
						local919.aClass2_Sub1_Sub3_4.method2546(0, Static113.anInt2540, Static113.anInt2564, Static113.anInt2561, Static113.anInt2562, local919.anInt3161 - Static113.anInt2541, local919.anInt3165 - Static113.anInt2554, local919.anInt3168 - Static113.anInt2555, local919.anInt3170);
					}
					if ((local919.anInt3163 & local8.anInt3316) != 0 && !this.method1798(local26, local17, local20, local919.anInt3163)) {
						local919.aClass2_Sub1_Sub3_3.method2546(0, Static113.anInt2540, Static113.anInt2564, Static113.anInt2561, Static113.anInt2562, local919.anInt3161 - Static113.anInt2541, local919.anInt3165 - Static113.anInt2554, local919.anInt3168 - Static113.anInt2555, local919.anInt3170);
					}
				}
			}
			@Pc(1689) Class2_Sub22 local1689;
			if (local23 < this.anInt2567 - 1) {
				local1689 = this.aClass2_Sub22ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1689 != null && local1689.aBoolean146) {
					Static113.aClass12_8.method382(local1689);
				}
			}
			if (local17 < Static113.anInt2559) {
				local1689 = local31[local17 + 1][local20];
				if (local1689 != null && local1689.aBoolean146) {
					Static113.aClass12_8.method382(local1689);
				}
			}
			if (local20 < Static113.anInt2548) {
				local1689 = local31[local17][local20 + 1];
				if (local1689 != null && local1689.aBoolean146) {
					Static113.aClass12_8.method382(local1689);
				}
			}
			if (local17 > Static113.anInt2559) {
				local1689 = local31[local17 - 1][local20];
				if (local1689 != null && local1689.aBoolean146) {
					Static113.aClass12_8.method382(local1689);
				}
			}
			if (local20 > Static113.anInt2548) {
				local1689 = local31[local17][local20 - 1];
				if (local1689 != null && local1689.aBoolean146) {
					Static113.aClass12_8.method382(local1689);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIILclient!sh;Lclient!sh;IIIIII)V")
	public void method1794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub3 arg4, @OriginalArg(5) Class2_Sub1_Sub3 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class80 local6 = new Class80();
		local6.anInt3387 = arg10;
		local6.anInt3391 = arg11;
		local6.anInt3382 = arg1 * 128 + 64;
		local6.anInt3389 = arg2 * 128 + 64;
		local6.anInt3392 = arg3;
		local6.aClass2_Sub1_Sub3_8 = arg4;
		local6.aClass2_Sub1_Sub3_9 = arg5;
		local6.anInt3385 = arg6;
		local6.anInt3386 = arg7;
		local6.anInt3390 = arg8;
		local6.anInt3396 = arg9;
		for (@Pc(49) int local49 = arg0; local49 >= 0; local49--) {
			if (this.aClass2_Sub22ArrayArrayArray1[local49][arg1][arg2] == null) {
				this.aClass2_Sub22ArrayArrayArray1[local49][arg1][arg2] = new Class2_Sub22(local49, arg1, arg2);
			}
		}
		this.aClass2_Sub22ArrayArrayArray1[arg0][arg1][arg2].aClass80_1 = local6;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(IIII)V")
	public void method1795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub22 local8 = this.aClass2_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class80 local14 = local8.aClass80_1;
		if (local14 != null) {
			local14.anInt3390 = local14.anInt3390 * arg3 / 16;
			local14.anInt3396 = local14.anInt3396 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIIIILclient!sh;IZII)Z")
	private boolean method1796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class2_Sub1_Sub3 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt2545 || local4 >= this.anInt2566) {
					return false;
				}
				@Pc(28) Class2_Sub22 local28 = this.aClass2_Sub22ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt3323 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class48 local52 = new Class48();
		local52.anInt1938 = arg11;
		local52.anInt1939 = arg12;
		local52.anInt1954 = arg0;
		local52.anInt1950 = arg5;
		local52.anInt1948 = arg6;
		local52.anInt1940 = arg7;
		local52.aClass2_Sub1_Sub3_1 = arg8;
		local52.anInt1949 = arg9;
		local52.anInt1941 = arg1;
		local52.anInt1942 = arg2;
		local52.anInt1951 = arg1 + arg3 - 1;
		local52.anInt1947 = arg2 + arg4 - 1;
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
					if (this.aClass2_Sub22ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass2_Sub22ArrayArrayArray1[local130][local98][local101] = new Class2_Sub22(local130, local98, local101);
					}
				}
				@Pc(166) Class2_Sub22 local166 = this.aClass2_Sub22ArrayArrayArray1[arg0][local98][local101];
				local166.aClass48Array3[local166.anInt3323] = local52;
				local166.anIntArray352[local166.anInt3323] = local104;
				local166.anInt3311 |= local104;
				local166.anInt3323++;
			}
		}
		if (arg10) {
			this.aClass48Array1[this.anInt2547++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "()V")
	private void method1797() {
		@Pc(3) int local3 = Static113.anIntArray265[Static113.anInt2558];
		@Pc(7) Class61[] local7 = Static113.aClass61ArrayArray1[Static113.anInt2558];
		Static113.anInt2546 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class61 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt2574 == 1) {
				local27 = local16.anInt2586 + 25 - Static113.anInt2559;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2587 + 25 - Static113.anInt2548;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2579 + 25 - Static113.anInt2548;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static113.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static113.anInt2541 - local16.anInt2575;
						if (local79 > 32) {
							local16.anInt2581 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2581 = 2;
							local79 = -local79;
						}
						local16.anInt2578 = (local16.anInt2588 - Static113.anInt2555 << 8) / local79;
						local16.anInt2589 = (local16.anInt2584 - Static113.anInt2555 << 8) / local79;
						local16.anInt2576 = (local16.anInt2582 - Static113.anInt2554 << 8) / local79;
						local16.anInt2580 = (local16.anInt2585 - Static113.anInt2554 << 8) / local79;
						Static113.aClass61Array1[Static113.anInt2546++] = local16;
					}
				}
			} else if (local16.anInt2574 == 2) {
				local27 = local16.anInt2587 + 25 - Static113.anInt2548;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2586 + 25 - Static113.anInt2559;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2577 + 25 - Static113.anInt2559;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static113.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static113.anInt2555 - local16.anInt2588;
						if (local79 > 32) {
							local16.anInt2581 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2581 = 4;
							local79 = -local79;
						}
						local16.anInt2592 = (local16.anInt2575 - Static113.anInt2541 << 8) / local79;
						local16.anInt2593 = (local16.anInt2590 - Static113.anInt2541 << 8) / local79;
						local16.anInt2576 = (local16.anInt2582 - Static113.anInt2554 << 8) / local79;
						local16.anInt2580 = (local16.anInt2585 - Static113.anInt2554 << 8) / local79;
						Static113.aClass61Array1[Static113.anInt2546++] = local16;
					}
				}
			} else if (local16.anInt2574 == 4) {
				local27 = local16.anInt2582 - Static113.anInt2554;
				if (local27 > 128) {
					local40 = local16.anInt2587 + 25 - Static113.anInt2548;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2579 + 25 - Static113.anInt2548;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt2586 + 25 - Static113.anInt2559;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt2577 + 25 - Static113.anInt2559;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static113.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt2581 = 5;
							local16.anInt2592 = (local16.anInt2575 - Static113.anInt2541 << 8) / local27;
							local16.anInt2593 = (local16.anInt2590 - Static113.anInt2541 << 8) / local27;
							local16.anInt2578 = (local16.anInt2588 - Static113.anInt2555 << 8) / local27;
							local16.anInt2589 = (local16.anInt2584 - Static113.anInt2555 << 8) / local27;
							Static113.aClass61Array1[Static113.anInt2546++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(IIII)Z")
	private boolean method1798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method1802(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(11) int local11 = arg1 << 7;
		@Pc(15) int local15 = arg2 << 7;
		@Pc(26) int local26 = this.anIntArrayArrayArray5[arg0][arg1][arg2] - 1;
		@Pc(30) int local30 = local26 - 120;
		@Pc(34) int local34 = local26 - 230;
		@Pc(38) int local38 = local26 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local11 > Static113.anInt2541) {
					if (!this.method1792(local11, local26, local15)) {
						return false;
					}
					if (!this.method1792(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1792(local11, local30, local15)) {
						return false;
					}
					if (!this.method1792(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1792(local11, local34, local15)) {
					return false;
				}
				if (!this.method1792(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static113.anInt2555) {
					if (!this.method1792(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method1792(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1792(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method1792(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1792(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method1792(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static113.anInt2541) {
					if (!this.method1792(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method1792(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1792(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method1792(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1792(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method1792(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static113.anInt2555) {
					if (!this.method1792(local11, local26, local15)) {
						return false;
					}
					if (!this.method1792(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1792(local11, local30, local15)) {
						return false;
					}
					if (!this.method1792(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method1792(local11, local34, local15)) {
					return false;
				}
				if (!this.method1792(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method1792(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method1792(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method1792(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method1792(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method1792(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!dg;IIIIIII)V")
	private void method1799(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static113.anInt2541;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static113.anInt2555;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray5[arg1][arg6][arg7] - Static113.anInt2554;
		@Pc(51) int local51 = this.anIntArrayArrayArray5[arg1][arg6 + 1][arg7] - Static113.anInt2554;
		@Pc(66) int local66 = this.anIntArrayArrayArray5[arg1][arg6 + 1][arg7 + 1] - Static113.anInt2554;
		@Pc(79) int local79 = this.anIntArrayArrayArray5[arg1][arg6][arg7 + 1] - Static113.anInt2554;
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
		@Pc(279) int local279 = Static125.anInt2838 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static125.anInt2841 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static125.anInt2838 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static125.anInt2841 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static125.anInt2838 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static125.anInt2841 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static125.anInt2838 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static125.anInt2841 + (local89 << 9) / local265;
		Static125.anInt2840 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static125.aBoolean126 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static125.anInt2834 || local327 > Static125.anInt2834 || local295 > Static125.anInt2834) {
				Static125.aBoolean126 = true;
			}
			if (Static113.aBoolean114 && this.method1809(Static113.anInt2563, Static113.anInt2556, local319, local335, local303, local311, local327, local295)) {
				Static113.anInt2544 = arg6;
				Static113.anInt2551 = arg7;
			}
			if (arg0.anInt852 == -1) {
				if (arg0.anInt850 != 12345678) {
					Static125.method2039(local319, local335, local303, local311, local327, local295, arg0.anInt850, arg0.anInt855, arg0.anInt854);
				}
			} else if (Static113.aBoolean113) {
				local472 = Static125.anInterface2_1.method257(arg0.anInt852);
				Static125.method2039(local319, local335, local303, local311, local327, local295, Static113.method1810(local472, arg0.anInt850), Static113.method1810(local472, arg0.anInt855), Static113.method1810(local472, arg0.anInt854));
			} else if (arg0.aBoolean32) {
				Static125.method2042(local319, local335, local303, local311, local327, local295, arg0.anInt850, arg0.anInt855, arg0.anInt854, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt852);
			} else {
				Static125.method2042(local319, local335, local303, local311, local327, local295, arg0.anInt850, arg0.anInt855, arg0.anInt854, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt852);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static125.aBoolean126 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static125.anInt2834 || local295 > Static125.anInt2834 || local327 > Static125.anInt2834) {
			Static125.aBoolean126 = true;
		}
		if (Static113.aBoolean114 && this.method1809(Static113.anInt2563, Static113.anInt2556, local287, local303, local335, local279, local295, local327)) {
			Static113.anInt2544 = arg6;
			Static113.anInt2551 = arg7;
		}
		if (arg0.anInt852 != -1) {
			if (!Static113.aBoolean113) {
				Static125.method2042(local287, local303, local335, local279, local295, local327, arg0.anInt857, arg0.anInt854, arg0.anInt855, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt852);
				return;
			}
			local472 = Static125.anInterface2_1.method257(arg0.anInt852);
			Static125.method2039(local287, local303, local335, local279, local295, local327, Static113.method1810(local472, arg0.anInt857), Static113.method1810(local472, arg0.anInt854), Static113.method1810(local472, arg0.anInt855));
		} else if (arg0.anInt857 != 12345678) {
			Static125.method2039(local287, local303, local335, local279, local295, local327, arg0.anInt857, arg0.anInt854, arg0.anInt855);
			return;
		}
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(IIII)V")
	public void method1800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub22 local8 = this.aClass2_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass2_Sub22ArrayArrayArray1[arg0][arg1][arg2].anInt3318 = arg3;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIILclient!sh;III)Z")
	public boolean method1801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub1_Sub3 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method1796(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "(III)Z")
	private boolean method1802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray6[arg0][arg1][arg2];
		if (local8 == -Static113.anInt2557) {
			return false;
		} else if (local8 == Static113.anInt2557) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method1792(local23 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2], local27 + 1) && this.method1792(local23 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2], local27 + 1) && this.method1792(local23 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method1792(local23 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray6[arg0][arg1][arg2] = Static113.anInt2557;
				return true;
			} else {
				this.anIntArrayArrayArray6[arg0][arg1][arg2] = -Static113.anInt2557;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "(IIII)I")
	public int method1803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub22 local8 = this.aClass2_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass71_1 != null && local8.aClass71_1.anInt3170 == arg3) {
			return local8.aClass71_1.anInt3169 & 0xFF;
		} else if (local8.aClass80_1 != null && local8.aClass80_1.anInt3387 == arg3) {
			return local8.aClass80_1.anInt3391 & 0xFF;
		} else if (local8.aClass49_1 != null && local8.aClass49_1.anInt2094 == arg3) {
			return local8.aClass49_1.anInt2096 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt3323; local56++) {
				if (local8.aClass48Array3[local56].anInt1938 == arg3) {
					return local8.aClass48Array3[local56].anInt1939 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "(III)Lclient!kf;")
	public Class48 method1804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub22 local8 = this.aClass2_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt3323; local14++) {
			@Pc(20) Class48 local20 = local8.aClass48Array3[local14];
			if ((local20.anInt1938 >> 29 & 0x3) == 2 && local20.anInt1941 == arg1 && local20.anInt1942 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "()V")
	public void method1805() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2547; local1++) {
			@Pc(7) Class48 local7 = this.aClass48Array1[local1];
			this.method1829(local7);
			this.aClass48Array1[local1] = null;
		}
		this.anInt2547 = 0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V")
	public void method1806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub22 local8 = this.aClass2_Sub22ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class2_Sub22 local31 = this.aClass2_Sub22ArrayArrayArray1[local10][arg0][arg1] = this.aClass2_Sub22ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt3324--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt3323; local41++) {
					@Pc(47) Class48 local47 = local31.aClass48Array3[local41];
					if ((local47.anInt1938 >> 29 & 0x3) == 2 && local47.anInt1941 == arg0 && local47.anInt1942 == arg1) {
						local47.anInt1954--;
					}
				}
			}
		}
		if (this.aClass2_Sub22ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass2_Sub22ArrayArrayArray1[0][arg0][arg1] = new Class2_Sub22(0, arg0, arg1);
		}
		this.aClass2_Sub22ArrayArrayArray1[0][arg0][arg1].aClass2_Sub22_1 = local8;
		this.aClass2_Sub22ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(IIIIII)Z")
	private boolean method1807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray6[arg0][local17][local21] == -Static113.anInt2557) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray5[arg0][arg1][arg3] - arg5;
			if (!this.method1792(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method1792(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method1792(local21, local167, local195)) {
				return false;
			} else if (this.method1792(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method1802(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method1792(local17 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg3] - arg5, local21 + 1) && this.method1792(local17 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method1792(local17 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method1792(local17 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "(III)V")
	public void method1808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub22 local8 = this.aClass2_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass79_1 = null;
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "(III)V")
	public void method1811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub22 local8 = this.aClass2_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass71_1 = null;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIILclient!sh;IIZ)Z")
	public boolean method1812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub1_Sub3 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method1796(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "(III)V")
	public void method1813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub22 local8 = this.aClass2_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass49_1 = null;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!v;III)V")
	private void method1814(@OriginalArg(0) Class2_Sub1_Sub3_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class2_Sub22 local14;
		@Pc(29) Class2_Sub1_Sub3_Sub7 local29;
		if (arg2 < this.anInt2545) {
			local14 = this.aClass2_Sub22ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass49_1 != null && local14.aClass49_1.aClass2_Sub1_Sub3_2 instanceof Class2_Sub1_Sub3_Sub7) {
				local29 = (Class2_Sub1_Sub3_Sub7) local14.aClass49_1.aClass2_Sub1_Sub3_2;
				Static166.method2558(arg0, local29, 128, 0, 0, true);
			}
		}
		if (arg3 < this.anInt2545) {
			local14 = this.aClass2_Sub22ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass49_1 != null && local14.aClass49_1.aClass2_Sub1_Sub3_2 instanceof Class2_Sub1_Sub3_Sub7) {
				local29 = (Class2_Sub1_Sub3_Sub7) local14.aClass49_1.aClass2_Sub1_Sub3_2;
				Static166.method2558(arg0, local29, 0, 0, 128, true);
			}
		}
		if (arg2 < this.anInt2545 && arg3 < this.anInt2566) {
			local14 = this.aClass2_Sub22ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass49_1 != null && local14.aClass49_1.aClass2_Sub1_Sub3_2 instanceof Class2_Sub1_Sub3_Sub7) {
				local29 = (Class2_Sub1_Sub3_Sub7) local14.aClass49_1.aClass2_Sub1_Sub3_2;
				Static166.method2558(arg0, local29, 128, 0, 128, true);
			}
		}
		if (arg2 >= this.anInt2545 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass2_Sub22ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass49_1 != null && local14.aClass49_1.aClass2_Sub1_Sub3_2 instanceof Class2_Sub1_Sub3_Sub7) {
			local29 = (Class2_Sub1_Sub3_Sub7) local14.aClass49_1.aClass2_Sub1_Sub3_2;
			Static166.method2558(arg0, local29, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "(III)V")
	public void method1815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub22 local8 = this.aClass2_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt3323; local13++) {
			@Pc(19) Class48 local19 = local8.aClass48Array3[local13];
			if ((local19.anInt1938 >> 29 & 0x3) == 2 && local19.anInt1941 == arg1 && local19.anInt1942 == arg2) {
				this.method1829(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "(III)Lclient!l;")
	public Class49 method1816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub22 local8 = this.aClass2_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass49_1 == null ? null : local8.aClass49_1;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIILclient!sh;IIIIII)Z")
	public boolean method1817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class2_Sub1_Sub3 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method1796(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!v;IIIII)V")
	private void method1818(@OriginalArg(0) Class2_Sub1_Sub3_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt2567) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt2545) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt2566 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class2_Sub22 local66 = this.aClass2_Sub22ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray5[local17][local24][local34] + this.anIntArrayArrayArray5[local17][local24 + 1][local34] + this.anIntArrayArrayArray5[local17][local24][local34 + 1] + this.anIntArrayArrayArray5[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray5[arg1][arg2][arg3] + this.anIntArrayArrayArray5[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray5[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray5[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class71 local163 = local66.aClass71_1;
									if (local163 != null) {
										@Pc(173) Class2_Sub1_Sub3_Sub7 local173;
										if (local163.aClass2_Sub1_Sub3_3 instanceof Class2_Sub1_Sub3_Sub7) {
											local173 = (Class2_Sub1_Sub3_Sub7) local163.aClass2_Sub1_Sub3_3;
											Static166.method2558(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local163.aClass2_Sub1_Sub3_4 instanceof Class2_Sub1_Sub3_Sub7) {
											local173 = (Class2_Sub1_Sub3_Sub7) local163.aClass2_Sub1_Sub3_4;
											Static166.method2558(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(237) int local237 = 0; local237 < local66.anInt3323; local237++) {
										@Pc(243) Class48 local243 = local66.aClass48Array3[local237];
										if (local243 != null && local243.aClass2_Sub1_Sub3_1 instanceof Class2_Sub1_Sub3_Sub7) {
											@Pc(253) Class2_Sub1_Sub3_Sub7 local253 = (Class2_Sub1_Sub3_Sub7) local243.aClass2_Sub1_Sub3_1;
											@Pc(261) int local261 = local243.anInt1951 + 1 - local243.anInt1941;
											@Pc(269) int local269 = local243.anInt1947 + 1 - local243.anInt1942;
											Static166.method2558(arg0, local253, (local243.anInt1941 - arg2) * 128 + (local261 - arg4) * 64, local160, (local243.anInt1942 - arg3) * 128 + (local269 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "(III)I")
	public int method1819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub22 local8 = this.aClass2_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt3323; local14++) {
			@Pc(20) Class48 local20 = local8.aClass48Array3[local14];
			if ((local20.anInt1938 >> 29 & 0x3) == 2 && local20.anInt1941 == arg1 && local20.anInt1942 == arg2) {
				return local20.anInt1938;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "(III)Lclient!u;")
	public Class80 method1820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub22 local8 = this.aClass2_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass80_1;
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "()V")
	public void method1821() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt2567; local1++) {
			for (local4 = 0; local4 < this.anInt2545; local4++) {
				for (local7 = 0; local7 < this.anInt2566; local7++) {
					this.aClass2_Sub22ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static113.anInt2549; local4++) {
			for (local7 = 0; local7 < Static113.anIntArray265[local4]; local7++) {
				Static113.aClass61ArrayArray1[local4][local7] = null;
			}
			Static113.anIntArray265[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt2547; local7++) {
			this.aClass48Array1[local7] = null;
		}
		this.anInt2547 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static113.aClass48Array2.length; local76++) {
			Static113.aClass48Array2[local76] = null;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	public void method1822(@OriginalArg(0) int arg0) {
		this.anInt2550 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt2545; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt2566; local7++) {
				if (this.aClass2_Sub22ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass2_Sub22ArrayArrayArray1[arg0][local4][local7] = new Class2_Sub22(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIILclient!sh;II)V")
	public void method1823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub3 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class49 local6 = new Class49();
		local6.aClass2_Sub1_Sub3_2 = arg4;
		local6.anInt2097 = arg1 * 128 + 64;
		local6.anInt2098 = arg2 * 128 + 64;
		local6.anInt2100 = arg3;
		local6.anInt2094 = arg5;
		local6.anInt2096 = arg6;
		if (this.aClass2_Sub22ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass2_Sub22ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub22(arg0, arg1, arg2);
		}
		this.aClass2_Sub22ArrayArrayArray1[arg0][arg1][arg2].aClass49_1 = local6;
	}

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "(III)V")
	public void method1824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static113.aBoolean114 = true;
		Static113.anInt2542 = arg0;
		Static113.anInt2563 = arg1;
		Static113.anInt2556 = arg2;
		Static113.anInt2544 = -1;
		Static113.anInt2551 = -1;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIILclient!sh;Lclient!sh;IIII)V")
	public void method1825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub3 arg4, @OriginalArg(5) Class2_Sub1_Sub3 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class71 local8 = new Class71();
		local8.anInt3170 = arg8;
		local8.anInt3169 = arg9;
		local8.anInt3161 = arg1 * 128 + 64;
		local8.anInt3168 = arg2 * 128 + 64;
		local8.anInt3165 = arg3;
		local8.aClass2_Sub1_Sub3_3 = arg4;
		local8.aClass2_Sub1_Sub3_4 = arg5;
		local8.anInt3163 = arg6;
		local8.anInt3166 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass2_Sub22ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass2_Sub22ArrayArrayArray1[local45][arg1][arg2] = new Class2_Sub22(local45, arg1, arg2);
			}
		}
		this.aClass2_Sub22ArrayArrayArray1[arg0][arg1][arg2].aClass71_1 = local8;
	}

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "(III)V")
	public void method1826() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2567; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt2545; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt2566; local7++) {
					@Pc(17) Class2_Sub22 local17 = this.aClass2_Sub22ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class71 local22 = local17.aClass71_1;
						if (local22 != null && local22.aClass2_Sub1_Sub3_3 instanceof Class2_Sub1_Sub3_Sub7) {
							@Pc(32) Class2_Sub1_Sub3_Sub7 local32 = (Class2_Sub1_Sub3_Sub7) local22.aClass2_Sub1_Sub3_3;
							this.method1818(local32, local1, local4, local7, 1, 1);
							if (local22.aClass2_Sub1_Sub3_4 instanceof Class2_Sub1_Sub3_Sub7) {
								@Pc(48) Class2_Sub1_Sub3_Sub7 local48 = (Class2_Sub1_Sub3_Sub7) local22.aClass2_Sub1_Sub3_4;
								this.method1818(local48, local1, local4, local7, 1, 1);
								Static166.method2558(local32, local48, 0, 0, 0, false);
								local22.aClass2_Sub1_Sub3_4 = local48.method2565(local48.aShort2, local48.aShort1, -50, -10, -50, false);
							}
							local22.aClass2_Sub1_Sub3_3 = local32.method2565(local32.aShort2, local32.aShort1, -50, -10, -50, false);
						}
						@Pc(107) Class2_Sub1_Sub3_Sub7 local107;
						for (@Pc(91) int local91 = 0; local91 < local17.anInt3323; local91++) {
							@Pc(97) Class48 local97 = local17.aClass48Array3[local91];
							if (local97 != null && local97.aClass2_Sub1_Sub3_1 instanceof Class2_Sub1_Sub3_Sub7) {
								local107 = (Class2_Sub1_Sub3_Sub7) local97.aClass2_Sub1_Sub3_1;
								this.method1818(local107, local1, local4, local7, local97.anInt1951 + 1 - local97.anInt1941, local97.anInt1947 - local97.anInt1942 + 1);
								local97.aClass2_Sub1_Sub3_1 = local107.method2565(local107.aShort2, local107.aShort1, -50, -10, -50, false);
							}
						}
						@Pc(148) Class49 local148 = local17.aClass49_1;
						if (local148 != null && local148.aClass2_Sub1_Sub3_2 instanceof Class2_Sub1_Sub3_Sub7) {
							local107 = (Class2_Sub1_Sub3_Sub7) local148.aClass2_Sub1_Sub3_2;
							this.method1814(local107, local1, local4, local7);
							local148.aClass2_Sub1_Sub3_2 = local107.method2565(local107.aShort2, local107.aShort1, -50, -10, -50, false);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ph;IIIIII)V")
	private void method1827(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray316.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray316[local5] - Static113.anInt2541;
			local20 = arg0.anIntArray309[local5] - Static113.anInt2554;
			local27 = arg0.anIntArray307[local5] - Static113.anInt2555;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray305 != null) {
				Static127.anIntArray313[local5] = local37;
				Static127.anIntArray310[local5] = local59;
				Static127.anIntArray308[local5] = local69;
			}
			Static127.anIntArray306[local5] = Static125.anInt2838 + (local37 << 9) / local69;
			Static127.anIntArray317[local5] = Static125.anInt2841 + (local59 << 9) / local69;
		}
		Static125.anInt2840 = 0;
		local3 = arg0.anIntArray315.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray315[local13];
			local27 = arg0.anIntArray311[local13];
			local37 = arg0.anIntArray318[local13];
			@Pc(142) int local142 = Static127.anIntArray306[local20];
			@Pc(146) int local146 = Static127.anIntArray306[local27];
			@Pc(150) int local150 = Static127.anIntArray306[local37];
			@Pc(154) int local154 = Static127.anIntArray317[local20];
			@Pc(158) int local158 = Static127.anIntArray317[local27];
			@Pc(162) int local162 = Static127.anIntArray317[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static125.aBoolean126 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static125.anInt2834 || local146 > Static125.anInt2834 || local150 > Static125.anInt2834) {
					Static125.aBoolean126 = true;
				}
				if (Static113.aBoolean114 && this.method1809(Static113.anInt2563, Static113.anInt2556, local154, local158, local162, local142, local146, local150)) {
					Static113.anInt2544 = arg5;
					Static113.anInt2551 = arg6;
				}
				if (arg0.anIntArray305 == null || arg0.anIntArray305[local13] == -1) {
					if (arg0.anIntArray314[local13] != 12345678) {
						Static125.method2039(local154, local158, local162, local142, local146, local150, arg0.anIntArray314[local13], arg0.anIntArray319[local13], arg0.anIntArray312[local13]);
					}
				} else if (Static113.aBoolean113) {
					@Pc(364) int local364 = Static125.anInterface2_1.method257(arg0.anIntArray305[local13]);
					Static125.method2039(local154, local158, local162, local142, local146, local150, Static113.method1810(local364, arg0.anIntArray314[local13]), Static113.method1810(local364, arg0.anIntArray319[local13]), Static113.method1810(local364, arg0.anIntArray312[local13]));
				} else if (arg0.aBoolean129) {
					Static125.method2042(local154, local158, local162, local142, local146, local150, arg0.anIntArray314[local13], arg0.anIntArray319[local13], arg0.anIntArray312[local13], Static127.anIntArray313[0], Static127.anIntArray313[1], Static127.anIntArray313[3], Static127.anIntArray310[0], Static127.anIntArray310[1], Static127.anIntArray310[3], Static127.anIntArray308[0], Static127.anIntArray308[1], Static127.anIntArray308[3], arg0.anIntArray305[local13]);
				} else {
					Static125.method2042(local154, local158, local162, local142, local146, local150, arg0.anIntArray314[local13], arg0.anIntArray319[local13], arg0.anIntArray312[local13], Static127.anIntArray313[local20], Static127.anIntArray313[local27], Static127.anIntArray313[local37], Static127.anIntArray310[local20], Static127.anIntArray310[local27], Static127.anIntArray310[local37], Static127.anIntArray308[local20], Static127.anIntArray308[local27], Static127.anIntArray308[local37], arg0.anIntArray305[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!kf;)V")
	private void method1829(@OriginalArg(0) Class48 arg0) {
		for (@Pc(2) int local2 = arg0.anInt1941; local2 <= arg0.anInt1951; local2++) {
			for (@Pc(6) int local6 = arg0.anInt1942; local6 <= arg0.anInt1947; local6++) {
				@Pc(17) Class2_Sub22 local17 = this.aClass2_Sub22ArrayArrayArray1[arg0.anInt1954][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt3323; local21++) {
						if (local17.aClass48Array3[local21] == arg0) {
							local17.anInt3323--;
							for (local36 = local21; local36 < local17.anInt3323; local36++) {
								local17.aClass48Array3[local36] = local17.aClass48Array3[local36 + 1];
								local17.anIntArray352[local36] = local17.anIntArray352[local36 + 1];
							}
							local17.aClass48Array3[local17.anInt3323] = null;
							break;
						}
					}
					local17.anInt3311 = 0;
					for (local36 = 0; local36 < local17.anInt3323; local36++) {
						local17.anInt3311 |= local17.anIntArray352[local36];
					}
				}
			}
		}
	}
}
