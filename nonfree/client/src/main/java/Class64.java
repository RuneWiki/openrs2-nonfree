import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class64 {

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
	private int anInt2633 = 0;

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
	private int anInt2631 = 0;

	@OriginalMember(owner = "client!sa", name = "z", descriptor = "[Lclient!ea;")
	private final Class16[] aClass16Array2 = new Class16[5000];

	@OriginalMember(owner = "client!sa", name = "O", descriptor = "[[I")
	private final int[][] anIntArrayArray28 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!sa", name = "Q", descriptor = "[[I")
	private final int[][] anIntArrayArray29 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!sa", name = "I", descriptor = "I")
	private final int anInt2650;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
	private final int anInt2627;

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
	private final int anInt2635;

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "[[[Lclient!vd;")
	private final Class2_Sub19[][][] aClass2_Sub19ArrayArrayArray1;

	@OriginalMember(owner = "client!sa", name = "F", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!sa", name = "w", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(III[[[I)V")
	public Class64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt2650 = arg0;
		this.anInt2627 = arg1;
		this.anInt2635 = arg2;
		this.aClass2_Sub19ArrayArrayArray1 = new Class2_Sub19[arg0][arg1][arg2];
		this.anIntArrayArrayArray7 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray6 = arg3;
		this.method1647();
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)V")
	public void method1606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub19 local8 = this.aClass2_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass14_1 = null;
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(III)Lclient!nd;")
	public Class52 method1607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub19 local8 = this.aClass2_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass52_1;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "()V")
	public void method1608() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2631; local1++) {
			@Pc(7) Class16 local7 = this.aClass16Array2[local1];
			this.method1619(local7);
			this.aClass16Array2[local1] = null;
		}
		this.anInt2631 = 0;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "()V")
	private void method1609() {
		@Pc(3) int local3 = Static101.anIntArray341[Static101.anInt2630];
		@Pc(7) Class78[] local7 = Static101.aClass78ArrayArray1[Static101.anInt2630];
		Static101.anInt2629 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class78 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt3131 == 1) {
				local27 = local16.anInt3122 + 25 - Static101.anInt2640;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt3141 + 25 - Static101.anInt2645;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt3135 + 25 - Static101.anInt2645;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static101.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static101.anInt2653 - local16.anInt3127;
						if (local79 > 32) {
							local16.anInt3129 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt3129 = 2;
							local79 = -local79;
						}
						local16.anInt3126 = (local16.anInt3125 - Static101.anInt2648 << 8) / local79;
						local16.anInt3128 = (local16.anInt3142 - Static101.anInt2648 << 8) / local79;
						local16.anInt3121 = (local16.anInt3132 - Static101.anInt2643 << 8) / local79;
						local16.anInt3143 = (local16.anInt3140 - Static101.anInt2643 << 8) / local79;
						Static101.aClass78Array1[Static101.anInt2629++] = local16;
					}
				}
			} else if (local16.anInt3131 == 2) {
				local27 = local16.anInt3141 + 25 - Static101.anInt2645;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt3122 + 25 - Static101.anInt2640;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt3136 + 25 - Static101.anInt2640;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static101.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static101.anInt2648 - local16.anInt3125;
						if (local79 > 32) {
							local16.anInt3129 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt3129 = 4;
							local79 = -local79;
						}
						local16.anInt3123 = (local16.anInt3127 - Static101.anInt2653 << 8) / local79;
						local16.anInt3138 = (local16.anInt3133 - Static101.anInt2653 << 8) / local79;
						local16.anInt3121 = (local16.anInt3132 - Static101.anInt2643 << 8) / local79;
						local16.anInt3143 = (local16.anInt3140 - Static101.anInt2643 << 8) / local79;
						Static101.aClass78Array1[Static101.anInt2629++] = local16;
					}
				}
			} else if (local16.anInt3131 == 4) {
				local27 = local16.anInt3132 - Static101.anInt2643;
				if (local27 > 128) {
					local40 = local16.anInt3141 + 25 - Static101.anInt2645;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt3135 + 25 - Static101.anInt2645;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt3122 + 25 - Static101.anInt2640;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt3136 + 25 - Static101.anInt2640;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static101.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt3129 = 5;
							local16.anInt3123 = (local16.anInt3127 - Static101.anInt2653 << 8) / local27;
							local16.anInt3138 = (local16.anInt3133 - Static101.anInt2653 << 8) / local27;
							local16.anInt3126 = (local16.anInt3125 - Static101.anInt2648 << 8) / local27;
							local16.anInt3128 = (local16.anInt3142 - Static101.anInt2648 << 8) / local27;
							Static101.aClass78Array1[Static101.anInt2629++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(III)I")
	public int method1610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub19 local8 = this.aClass2_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass7_1 == null ? 0 : local8.aClass7_1.anInt301;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIII)V")
	public void method1611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt2627 * 128) {
			arg0 = this.anInt2627 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt2635 * 128) {
			arg2 = this.anInt2635 * 128 - 1;
		}
		Static101.anInt2637++;
		Static101.anInt2652 = Class2_Sub1_Sub9_Sub2.anIntArray202[arg3];
		Static101.anInt2647 = Class2_Sub1_Sub9_Sub2.anIntArray198[arg3];
		Static101.anInt2641 = Class2_Sub1_Sub9_Sub2.anIntArray202[arg4];
		Static101.anInt2644 = Class2_Sub1_Sub9_Sub2.anIntArray198[arg4];
		Static101.aBooleanArrayArray1 = Static101.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static101.anInt2653 = arg0;
		Static101.anInt2643 = arg1;
		Static101.anInt2648 = arg2;
		Static101.anInt2640 = arg0 / 128;
		Static101.anInt2645 = arg2 / 128;
		Static101.anInt2630 = arg5;
		Static101.anInt2649 = Static101.anInt2640 - 25;
		if (Static101.anInt2649 < 0) {
			Static101.anInt2649 = 0;
		}
		Static101.anInt2634 = Static101.anInt2645 - 25;
		if (Static101.anInt2634 < 0) {
			Static101.anInt2634 = 0;
		}
		Static101.anInt2628 = Static101.anInt2640 + 25;
		if (Static101.anInt2628 > this.anInt2627) {
			Static101.anInt2628 = this.anInt2627;
		}
		Static101.anInt2636 = Static101.anInt2645 + 25;
		if (Static101.anInt2636 > this.anInt2635) {
			Static101.anInt2636 = this.anInt2635;
		}
		this.method1609();
		Static101.anInt2646 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt2633; local128 < this.anInt2650; local128++) {
			@Pc(134) Class2_Sub19[][] local134 = this.aClass2_Sub19ArrayArrayArray1[local128];
			for (local136 = Static101.anInt2649; local136 < Static101.anInt2628; local136++) {
				for (local139 = Static101.anInt2634; local139 < Static101.anInt2636; local139++) {
					@Pc(146) Class2_Sub19 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt3099 <= arg5 && (Static101.aBooleanArrayArray1[local136 + 25 - Static101.anInt2640][local139 + 25 - Static101.anInt2645] || this.anIntArrayArrayArray6[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean239 = true;
							local146.aBoolean238 = true;
							if (local146.anInt3104 > 0) {
								local146.aBoolean240 = true;
							} else {
								local146.aBoolean240 = false;
							}
							Static101.anInt2646++;
						} else {
							local146.aBoolean239 = false;
							local146.aBoolean238 = false;
							local146.anInt3098 = 0;
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
		for (@Pc(224) int local224 = this.anInt2633; local224 < this.anInt2650; local224++) {
			@Pc(230) Class2_Sub19[][] local230 = this.aClass2_Sub19ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static101.anInt2640 + local139;
				local241 = Static101.anInt2640 - local139;
				if (local237 >= Static101.anInt2649 || local241 < Static101.anInt2628) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static101.anInt2645 + local249;
						local258 = Static101.anInt2645 - local249;
						@Pc(270) Class2_Sub19 local270;
						if (local237 >= Static101.anInt2649) {
							if (local254 >= Static101.anInt2634) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean239) {
									this.method1652(local270, true);
								}
							}
							if (local258 < Static101.anInt2636) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean239) {
									this.method1652(local270, true);
								}
							}
						}
						if (local241 < Static101.anInt2628) {
							if (local254 >= Static101.anInt2634) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean239) {
									this.method1652(local270, true);
								}
							}
							if (local258 < Static101.anInt2636) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean239) {
									this.method1652(local270, true);
								}
							}
						}
						if (Static101.anInt2646 == 0) {
							Static101.aBoolean197 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt2633; local136 < this.anInt2650; local136++) {
			@Pc(361) Class2_Sub19[][] local361 = this.aClass2_Sub19ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static101.anInt2640 + local237;
				local249 = Static101.anInt2640 - local237;
				if (local241 >= Static101.anInt2649 || local249 < Static101.anInt2628) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static101.anInt2645 + local254;
						@Pc(389) int local389 = Static101.anInt2645 - local254;
						@Pc(401) Class2_Sub19 local401;
						if (local241 >= Static101.anInt2649) {
							if (local258 >= Static101.anInt2634) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean239) {
									this.method1652(local401, false);
								}
							}
							if (local389 < Static101.anInt2636) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean239) {
									this.method1652(local401, false);
								}
							}
						}
						if (local249 < Static101.anInt2628) {
							if (local258 >= Static101.anInt2634) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean239) {
									this.method1652(local401, false);
								}
							}
							if (local389 < Static101.anInt2636) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean239) {
									this.method1652(local401, false);
								}
							}
						}
						if (Static101.anInt2646 == 0) {
							Static101.aBoolean197 = false;
							return;
						}
					}
				}
			}
		}
		Static101.aBoolean197 = false;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIILclient!e;IIIIII)Z")
	public boolean method1612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class2_Sub1_Sub1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method1629(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
	public void method1613(@OriginalArg(0) int arg0) {
		this.anInt2633 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt2627; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt2635; local7++) {
				if (this.aClass2_Sub19ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass2_Sub19ArrayArrayArray1[arg0][local4][local7] = new Class2_Sub19(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(III)Lclient!ea;")
	public Class16 method1614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub19 local8 = this.aClass2_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt3104; local14++) {
			@Pc(20) Class16 local20 = local8.aClass16Array3[local14];
			if ((local20.anInt1058 >> 29 & 0x3) == 2 && local20.anInt1061 == arg1 && local20.anInt1059 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "(III)V")
	public void method1615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub19 local8 = this.aClass2_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass34_1 = null;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIILclient!e;III)Z")
	public boolean method1616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub1_Sub1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method1629(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "(III)Z")
	private boolean method1617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static101.anInt2629; local1++) {
			@Pc(6) Class78 local6 = Static101.aClass78Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt3129 == 1) {
				local15 = local6.anInt3127 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt3125 + (local6.anInt3126 * local15 >> 8);
					local37 = local6.anInt3142 + (local6.anInt3128 * local15 >> 8);
					local47 = local6.anInt3132 + (local6.anInt3121 * local15 >> 8);
					local57 = local6.anInt3140 + (local6.anInt3143 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3129 == 2) {
				local15 = arg0 - local6.anInt3127;
				if (local15 > 0) {
					local27 = local6.anInt3125 + (local6.anInt3126 * local15 >> 8);
					local37 = local6.anInt3142 + (local6.anInt3128 * local15 >> 8);
					local47 = local6.anInt3132 + (local6.anInt3121 * local15 >> 8);
					local57 = local6.anInt3140 + (local6.anInt3143 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3129 == 3) {
				local15 = local6.anInt3125 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt3127 + (local6.anInt3123 * local15 >> 8);
					local37 = local6.anInt3133 + (local6.anInt3138 * local15 >> 8);
					local47 = local6.anInt3132 + (local6.anInt3121 * local15 >> 8);
					local57 = local6.anInt3140 + (local6.anInt3143 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3129 == 4) {
				local15 = arg2 - local6.anInt3125;
				if (local15 > 0) {
					local27 = local6.anInt3127 + (local6.anInt3123 * local15 >> 8);
					local37 = local6.anInt3133 + (local6.anInt3138 * local15 >> 8);
					local47 = local6.anInt3132 + (local6.anInt3121 * local15 >> 8);
					local57 = local6.anInt3140 + (local6.anInt3143 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3129 == 5) {
				local15 = arg1 - local6.anInt3132;
				if (local15 > 0) {
					local27 = local6.anInt3127 + (local6.anInt3123 * local15 >> 8);
					local37 = local6.anInt3133 + (local6.anInt3138 * local15 >> 8);
					local47 = local6.anInt3125 + (local6.anInt3126 * local15 >> 8);
					local57 = local6.anInt3142 + (local6.anInt3128 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "(III)V")
	public void method1618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub19 local8 = this.aClass2_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass7_1 = null;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!ea;)V")
	private void method1619(@OriginalArg(0) Class16 arg0) {
		for (@Pc(2) int local2 = arg0.anInt1061; local2 <= arg0.anInt1068; local2++) {
			for (@Pc(6) int local6 = arg0.anInt1059; local6 <= arg0.anInt1071; local6++) {
				@Pc(17) Class2_Sub19 local17 = this.aClass2_Sub19ArrayArrayArray1[arg0.anInt1064][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt3104; local21++) {
						if (local17.aClass16Array3[local21] == arg0) {
							local17.anInt3104--;
							for (local36 = local21; local36 < local17.anInt3104; local36++) {
								local17.aClass16Array3[local36] = local17.aClass16Array3[local36 + 1];
								local17.anIntArray404[local36] = local17.anIntArray404[local36 + 1];
							}
							local17.aClass16Array3[local17.anInt3104] = null;
							break;
						}
					}
					local17.anInt3102 = 0;
					for (local36 = 0; local36 < local17.anInt3104; local36++) {
						local17.anInt3102 |= local17.anIntArray404[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "(III)I")
	public int method1620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub19 local8 = this.aClass2_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass34_1 == null ? 0 : local8.aClass34_1.anInt1547;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)I")
	public int method1622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub19 local8 = this.aClass2_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass52_1 != null && local8.aClass52_1.anInt2024 == arg3) {
			return local8.aClass52_1.anInt2019 & 0xFF;
		} else if (local8.aClass7_1 != null && local8.aClass7_1.anInt301 == arg3) {
			return local8.aClass7_1.anInt307 & 0xFF;
		} else if (local8.aClass34_1 != null && local8.aClass34_1.anInt1547 == arg3) {
			return local8.aClass34_1.anInt1548 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt3104; local56++) {
				if (local8.aClass16Array3[local56].anInt1058 == arg3) {
					return local8.aClass16Array3[local56].anInt1066 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIILclient!e;ILclient!e;Lclient!e;)V")
	public void method1623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub1_Sub1 arg6, @OriginalArg(7) Class2_Sub1_Sub1 arg7) {
		@Pc(3) Class14 local3 = new Class14();
		local3.aClass2_Sub1_Sub1_3 = arg4;
		local3.anInt999 = arg1 * 128 + 64;
		local3.anInt1001 = arg2 * 128 + 64;
		local3.anInt996 = arg3;
		local3.anInt988 = arg5;
		local3.aClass2_Sub1_Sub1_2 = arg6;
		local3.aClass2_Sub1_Sub1_4 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class2_Sub19 local43 = this.aClass2_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt3104; local47++) {
				if ((local43.aClass16Array3[local47].anInt1066 & 0x100) == 256 && local43.aClass16Array3[local47].aClass2_Sub1_Sub1_5 instanceof Class2_Sub1_Sub1_Sub2) {
					@Pc(71) Class2_Sub1_Sub1_Sub2 local71 = (Class2_Sub1_Sub1_Sub2) local43.aClass16Array3[local47].aClass2_Sub1_Sub1_5;
					local71.method221();
					if (local71.anInt2306 > local34) {
						local34 = local71.anInt2306;
					}
				}
			}
		}
		local3.anInt998 = local34;
		if (this.aClass2_Sub19ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass2_Sub19ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub19(arg0, arg1, arg2);
		}
		this.aClass2_Sub19ArrayArrayArray1[arg0][arg1][arg2].aClass14_1 = local3;
	}

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "(III)V")
	public void method1624() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2650; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt2627; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt2635; local7++) {
					@Pc(17) Class2_Sub19 local17 = this.aClass2_Sub19ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class52 local22 = local17.aClass52_1;
						if (local22 != null && local22.aClass2_Sub1_Sub1_7 instanceof Class2_Sub1_Sub1_Sub6) {
							@Pc(32) Class2_Sub1_Sub1_Sub6 local32 = (Class2_Sub1_Sub1_Sub6) local22.aClass2_Sub1_Sub1_7;
							this.method1635(local32, local1, local4, local7, 1, 1);
							if (local22.aClass2_Sub1_Sub1_8 instanceof Class2_Sub1_Sub1_Sub6) {
								@Pc(48) Class2_Sub1_Sub1_Sub6 local48 = (Class2_Sub1_Sub1_Sub6) local22.aClass2_Sub1_Sub1_8;
								this.method1635(local48, local1, local4, local7, 1, 1);
								Static26.method547(local32, local48, 0, 0, 0, false);
								local22.aClass2_Sub1_Sub1_8 = local48.method548(local48.aShort2, local48.aShort1, -50, -10, -50);
							}
							local22.aClass2_Sub1_Sub1_7 = local32.method548(local32.aShort2, local32.aShort1, -50, -10, -50);
						}
						@Pc(103) Class2_Sub1_Sub1_Sub6 local103;
						for (@Pc(87) int local87 = 0; local87 < local17.anInt3104; local87++) {
							@Pc(93) Class16 local93 = local17.aClass16Array3[local87];
							if (local93 != null && local93.aClass2_Sub1_Sub1_5 instanceof Class2_Sub1_Sub1_Sub6) {
								local103 = (Class2_Sub1_Sub1_Sub6) local93.aClass2_Sub1_Sub1_5;
								this.method1635(local103, local1, local4, local7, local93.anInt1068 + 1 - local93.anInt1061, local93.anInt1071 - local93.anInt1059 + 1);
								local93.aClass2_Sub1_Sub1_5 = local103.method548(local103.aShort2, local103.aShort1, -50, -10, -50);
							}
						}
						@Pc(142) Class34 local142 = local17.aClass34_1;
						if (local142 != null && local142.aClass2_Sub1_Sub1_6 instanceof Class2_Sub1_Sub1_Sub6) {
							local103 = (Class2_Sub1_Sub1_Sub6) local142.aClass2_Sub1_Sub1_6;
							this.method1643(local103, local1, local4, local7);
							local142.aClass2_Sub1_Sub1_6 = local103.method548(local103.aShort2, local103.aShort1, -50, -10, -50);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(IIII)Z")
	private boolean method1625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method1640(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method1617(local11 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2] - arg3, local15 + 1) && this.method1617(local11 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method1617(local11 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method1617(local11 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!m;IIIIIII)V")
	private void method1626(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static101.anInt2653;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static101.anInt2648;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray6[arg1][arg6][arg7] - Static101.anInt2643;
		@Pc(51) int local51 = this.anIntArrayArrayArray6[arg1][arg6 + 1][arg7] - Static101.anInt2643;
		@Pc(66) int local66 = this.anIntArrayArrayArray6[arg1][arg6 + 1][arg7 + 1] - Static101.anInt2643;
		@Pc(79) int local79 = this.anIntArrayArrayArray6[arg1][arg6][arg7 + 1] - Static101.anInt2643;
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
		@Pc(279) int local279 = Static52.anInt1583 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static52.anInt1589 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static52.anInt1583 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static52.anInt1589 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static52.anInt1583 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static52.anInt1589 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static52.anInt1583 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static52.anInt1589 + (local89 << 9) / local265;
		Static52.anInt1582 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static52.aBoolean104 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static52.anInt1590 || local327 > Static52.anInt1590 || local295 > Static52.anInt1590) {
				Static52.aBoolean104 = true;
			}
			if (Static101.aBoolean197 && this.method1645(Static101.anInt2639, Static101.anInt2642, local319, local335, local303, local311, local327, local295)) {
				Static101.anInt2638 = arg6;
				Static101.anInt2632 = arg7;
			}
			if (arg0.anInt1897 == -1) {
				if (arg0.anInt1899 != 12345678) {
					Static52.method940(local319, local335, local303, local311, local327, local295, arg0.anInt1899, arg0.anInt1898, arg0.anInt1909);
				}
			} else if (Static101.aBoolean198) {
				local472 = Static52.anInterface1_1.method664(arg0.anInt1897);
				Static52.method940(local319, local335, local303, local311, local327, local295, Static101.method1621(local472, arg0.anInt1899), Static101.method1621(local472, arg0.anInt1898), Static101.method1621(local472, arg0.anInt1909));
			} else if (arg0.aBoolean133) {
				Static52.method926(local319, local335, local303, local311, local327, local295, arg0.anInt1899, arg0.anInt1898, arg0.anInt1909, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1897);
			} else {
				Static52.method926(local319, local335, local303, local311, local327, local295, arg0.anInt1899, arg0.anInt1898, arg0.anInt1909, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt1897);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static52.aBoolean104 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static52.anInt1590 || local295 > Static52.anInt1590 || local327 > Static52.anInt1590) {
			Static52.aBoolean104 = true;
		}
		if (Static101.aBoolean197 && this.method1645(Static101.anInt2639, Static101.anInt2642, local287, local303, local335, local279, local295, local327)) {
			Static101.anInt2638 = arg6;
			Static101.anInt2632 = arg7;
		}
		if (arg0.anInt1897 != -1) {
			if (!Static101.aBoolean198) {
				Static52.method926(local287, local303, local335, local279, local295, local327, arg0.anInt1910, arg0.anInt1909, arg0.anInt1898, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1897);
				return;
			}
			local472 = Static52.anInterface1_1.method664(arg0.anInt1897);
			Static52.method940(local287, local303, local335, local279, local295, local327, Static101.method1621(local472, arg0.anInt1910), Static101.method1621(local472, arg0.anInt1909), Static101.method1621(local472, arg0.anInt1898));
		} else if (arg0.anInt1910 != 12345678) {
			Static52.method940(local287, local303, local335, local279, local295, local327, arg0.anInt1910, arg0.anInt1909, arg0.anInt1898);
			return;
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)V")
	public void method1627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub19 local8 = this.aClass2_Sub19ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class2_Sub19 local31 = this.aClass2_Sub19ArrayArrayArray1[local10][arg0][arg1] = this.aClass2_Sub19ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt3101--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt3104; local41++) {
					@Pc(47) Class16 local47 = local31.aClass16Array3[local41];
					if ((local47.anInt1058 >> 29 & 0x3) == 2 && local47.anInt1061 == arg0 && local47.anInt1059 == arg1) {
						local47.anInt1064--;
					}
				}
			}
		}
		if (this.aClass2_Sub19ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass2_Sub19ArrayArrayArray1[0][arg0][arg1] = new Class2_Sub19(0, arg0, arg1);
		}
		this.aClass2_Sub19ArrayArrayArray1[0][arg0][arg1].aClass2_Sub19_1 = local8;
		this.aClass2_Sub19ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "(III)V")
	public void method1628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub19 local8 = this.aClass2_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt3104; local13++) {
			@Pc(19) Class16 local19 = local8.aClass16Array3[local13];
			if ((local19.anInt1058 >> 29 & 0x3) == 2 && local19.anInt1061 == arg1 && local19.anInt1059 == arg2) {
				this.method1619(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIIILclient!e;IZII)Z")
	private boolean method1629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class2_Sub1_Sub1 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt2627 || local4 >= this.anInt2635) {
					return false;
				}
				@Pc(28) Class2_Sub19 local28 = this.aClass2_Sub19ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt3104 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class16 local52 = new Class16();
		local52.anInt1058 = arg11;
		local52.anInt1066 = arg12;
		local52.anInt1064 = arg0;
		local52.anInt1056 = arg5;
		local52.anInt1063 = arg6;
		local52.anInt1067 = arg7;
		local52.aClass2_Sub1_Sub1_5 = arg8;
		local52.anInt1060 = arg9;
		local52.anInt1061 = arg1;
		local52.anInt1059 = arg2;
		local52.anInt1068 = arg1 + arg3 - 1;
		local52.anInt1071 = arg2 + arg4 - 1;
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
					if (this.aClass2_Sub19ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass2_Sub19ArrayArrayArray1[local130][local98][local101] = new Class2_Sub19(local130, local98, local101);
					}
				}
				@Pc(166) Class2_Sub19 local166 = this.aClass2_Sub19ArrayArrayArray1[arg0][local98][local101];
				local166.aClass16Array3[local166.anInt3104] = local52;
				local166.anIntArray404[local166.anInt3104] = local104;
				local166.anInt3102 |= local104;
				local166.anInt3104++;
			}
		}
		if (arg10) {
			this.aClass16Array2[this.anInt2631++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "([IIIIII)V")
	public void method1630(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class2_Sub19 local8 = this.aClass2_Sub19ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class48 local14 = local8.aClass48_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt1906;
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
		local24 = local59.anInt1245;
		@Pc(68) int local68 = local59.anInt1246;
		@Pc(71) int local71 = local59.anInt1247;
		@Pc(74) int local74 = local59.anInt1244;
		@Pc(79) int[] local79 = this.anIntArrayArray29[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray28[local68];
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

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(IIII)V")
	public void method1631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub19 local8 = this.aClass2_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass2_Sub19ArrayArrayArray1[arg0][arg1][arg2].anInt3099 = arg3;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIILclient!e;IIZ)Z")
	public boolean method1633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method1629(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "(III)Lclient!bd;")
	public Class7 method1634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub19 local8 = this.aClass2_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass7_1;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!de;IIIII)V")
	private void method1635(@OriginalArg(0) Class2_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt2650) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt2627) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt2635 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class2_Sub19 local66 = this.aClass2_Sub19ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray6[local17][local24][local34] + this.anIntArrayArrayArray6[local17][local24 + 1][local34] + this.anIntArrayArrayArray6[local17][local24][local34 + 1] + this.anIntArrayArrayArray6[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray6[arg1][arg2][arg3] + this.anIntArrayArrayArray6[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray6[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray6[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class52 local163 = local66.aClass52_1;
									if (local163 != null) {
										@Pc(173) Class2_Sub1_Sub1_Sub6 local173;
										if (local163.aClass2_Sub1_Sub1_7 instanceof Class2_Sub1_Sub1_Sub6) {
											local173 = (Class2_Sub1_Sub1_Sub6) local163.aClass2_Sub1_Sub1_7;
											Static26.method547(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local163.aClass2_Sub1_Sub1_8 instanceof Class2_Sub1_Sub1_Sub6) {
											local173 = (Class2_Sub1_Sub1_Sub6) local163.aClass2_Sub1_Sub1_8;
											Static26.method547(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(237) int local237 = 0; local237 < local66.anInt3104; local237++) {
										@Pc(243) Class16 local243 = local66.aClass16Array3[local237];
										if (local243 != null && local243.aClass2_Sub1_Sub1_5 instanceof Class2_Sub1_Sub1_Sub6) {
											@Pc(253) Class2_Sub1_Sub1_Sub6 local253 = (Class2_Sub1_Sub1_Sub6) local243.aClass2_Sub1_Sub1_5;
											@Pc(261) int local261 = local243.anInt1068 + 1 - local243.anInt1061;
											@Pc(269) int local269 = local243.anInt1071 + 1 - local243.anInt1059;
											Static26.method547(arg0, local253, (local243.anInt1061 - arg2) * 128 + (local261 - arg4) * 64, local160, (local243.anInt1059 - arg3) * 128 + (local269 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(IIII)V")
	public void method1636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub19 local8 = this.aClass2_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class7 local14 = local8.aClass7_1;
		if (local14 != null) {
			@Pc(23) int local23 = arg1 * 128 + 64;
			@Pc(29) int local29 = arg2 * 128 + 64;
			local14.anInt313 = local23 + (local14.anInt313 - local23) * arg3 / 16;
			local14.anInt306 = local29 + (local14.anInt306 - local29) * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIILclient!e;IIIIII)V")
	public void method1637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class7 local6 = new Class7();
		local6.anInt301 = arg9;
		local6.anInt307 = arg10;
		local6.anInt313 = arg1 * 128 + arg7 + 64;
		local6.anInt306 = arg2 * 128 + arg8 + 64;
		local6.anInt310 = arg3;
		local6.aClass2_Sub1_Sub1_1 = arg4;
		local6.anInt308 = arg5;
		local6.anInt312 = arg6;
		for (@Pc(44) int local44 = arg0; local44 >= 0; local44--) {
			if (this.aClass2_Sub19ArrayArrayArray1[local44][arg1][arg2] == null) {
				this.aClass2_Sub19ArrayArrayArray1[local44][arg1][arg2] = new Class2_Sub19(local44, arg1, arg2);
			}
		}
		this.aClass2_Sub19ArrayArrayArray1[arg0][arg1][arg2].aClass7_1 = local6;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(IIIIII)Z")
	private boolean method1638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray7[arg0][local17][local21] == -Static101.anInt2637) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray6[arg0][arg1][arg3] - arg5;
			if (!this.method1617(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method1617(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method1617(local21, local167, local195)) {
				return false;
			} else if (this.method1617(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method1640(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method1617(local17 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg3] - arg5, local21 + 1) && this.method1617(local17 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method1617(local17 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method1617(local17 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIILclient!e;Lclient!e;IIII)V")
	public void method1639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub1 arg4, @OriginalArg(5) Class2_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class52 local8 = new Class52();
		local8.anInt2024 = arg8;
		local8.anInt2019 = arg9;
		local8.anInt2018 = arg1 * 128 + 64;
		local8.anInt2014 = arg2 * 128 + 64;
		local8.anInt2021 = arg3;
		local8.aClass2_Sub1_Sub1_7 = arg4;
		local8.aClass2_Sub1_Sub1_8 = arg5;
		local8.anInt2022 = arg6;
		local8.anInt2012 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass2_Sub19ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass2_Sub19ArrayArrayArray1[local45][arg1][arg2] = new Class2_Sub19(local45, arg1, arg2);
			}
		}
		this.aClass2_Sub19ArrayArrayArray1[arg0][arg1][arg2].aClass52_1 = local8;
	}

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "(III)Z")
	private boolean method1640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray7[arg0][arg1][arg2];
		if (local8 == -Static101.anInt2637) {
			return false;
		} else if (local8 == Static101.anInt2637) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method1617(local23 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2], local27 + 1) && this.method1617(local23 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2], local27 + 1) && this.method1617(local23 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method1617(local23 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray7[arg0][arg1][arg2] = Static101.anInt2637;
				return true;
			} else {
				this.anIntArrayArrayArray7[arg0][arg1][arg2] = -Static101.anInt2637;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "(IIII)Z")
	private boolean method1641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method1640(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(11) int local11 = arg1 << 7;
		@Pc(15) int local15 = arg2 << 7;
		@Pc(26) int local26 = this.anIntArrayArrayArray6[arg0][arg1][arg2] - 1;
		@Pc(30) int local30 = local26 - 120;
		@Pc(34) int local34 = local26 - 230;
		@Pc(38) int local38 = local26 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local11 > Static101.anInt2653) {
					if (!this.method1617(local11, local26, local15)) {
						return false;
					}
					if (!this.method1617(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1617(local11, local30, local15)) {
						return false;
					}
					if (!this.method1617(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1617(local11, local34, local15)) {
					return false;
				}
				if (!this.method1617(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static101.anInt2648) {
					if (!this.method1617(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method1617(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1617(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method1617(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1617(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method1617(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static101.anInt2653) {
					if (!this.method1617(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method1617(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1617(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method1617(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1617(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method1617(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static101.anInt2648) {
					if (!this.method1617(local11, local26, local15)) {
						return false;
					}
					if (!this.method1617(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1617(local11, local30, local15)) {
						return false;
					}
					if (!this.method1617(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method1617(local11, local34, local15)) {
					return false;
				}
				if (!this.method1617(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method1617(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method1617(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method1617(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method1617(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method1617(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!de;III)V")
	private void method1643(@OriginalArg(0) Class2_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class2_Sub19 local14;
		@Pc(29) Class2_Sub1_Sub1_Sub6 local29;
		if (arg2 < this.anInt2627) {
			local14 = this.aClass2_Sub19ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass34_1 != null && local14.aClass34_1.aClass2_Sub1_Sub1_6 instanceof Class2_Sub1_Sub1_Sub6) {
				local29 = (Class2_Sub1_Sub1_Sub6) local14.aClass34_1.aClass2_Sub1_Sub1_6;
				Static26.method547(arg0, local29, 128, 0, 0, true);
			}
		}
		if (arg3 < this.anInt2627) {
			local14 = this.aClass2_Sub19ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass34_1 != null && local14.aClass34_1.aClass2_Sub1_Sub1_6 instanceof Class2_Sub1_Sub1_Sub6) {
				local29 = (Class2_Sub1_Sub1_Sub6) local14.aClass34_1.aClass2_Sub1_Sub1_6;
				Static26.method547(arg0, local29, 0, 0, 128, true);
			}
		}
		if (arg2 < this.anInt2627 && arg3 < this.anInt2635) {
			local14 = this.aClass2_Sub19ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass34_1 != null && local14.aClass34_1.aClass2_Sub1_Sub1_6 instanceof Class2_Sub1_Sub1_Sub6) {
				local29 = (Class2_Sub1_Sub1_Sub6) local14.aClass34_1.aClass2_Sub1_Sub1_6;
				Static26.method547(arg0, local29, 128, 0, 128, true);
			}
		}
		if (arg2 >= this.anInt2627 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass2_Sub19ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass34_1 != null && local14.aClass34_1.aClass2_Sub1_Sub1_6 instanceof Class2_Sub1_Sub1_Sub6) {
			local29 = (Class2_Sub1_Sub1_Sub6) local14.aClass34_1.aClass2_Sub1_Sub1_6;
			Static26.method547(arg0, local29, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "(III)V")
	public void method1644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub19 local8 = this.aClass2_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass52_1 = null;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method1645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!gb;IIIIII)V")
	private void method1646(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray160.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray160[local5] - Static101.anInt2653;
			local20 = arg0.anIntArray168[local5] - Static101.anInt2643;
			local27 = arg0.anIntArray155[local5] - Static101.anInt2648;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray167 != null) {
				Static41.anIntArray157[local5] = local37;
				Static41.anIntArray161[local5] = local59;
				Static41.anIntArray158[local5] = local69;
			}
			Static41.anIntArray162[local5] = Static52.anInt1583 + (local37 << 9) / local69;
			Static41.anIntArray164[local5] = Static52.anInt1589 + (local59 << 9) / local69;
		}
		Static52.anInt1582 = 0;
		local3 = arg0.anIntArray169.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray169[local13];
			local27 = arg0.anIntArray166[local13];
			local37 = arg0.anIntArray159[local13];
			@Pc(142) int local142 = Static41.anIntArray162[local20];
			@Pc(146) int local146 = Static41.anIntArray162[local27];
			@Pc(150) int local150 = Static41.anIntArray162[local37];
			@Pc(154) int local154 = Static41.anIntArray164[local20];
			@Pc(158) int local158 = Static41.anIntArray164[local27];
			@Pc(162) int local162 = Static41.anIntArray164[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static52.aBoolean104 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static52.anInt1590 || local146 > Static52.anInt1590 || local150 > Static52.anInt1590) {
					Static52.aBoolean104 = true;
				}
				if (Static101.aBoolean197 && this.method1645(Static101.anInt2639, Static101.anInt2642, local154, local158, local162, local142, local146, local150)) {
					Static101.anInt2638 = arg5;
					Static101.anInt2632 = arg6;
				}
				if (arg0.anIntArray167 == null || arg0.anIntArray167[local13] == -1) {
					if (arg0.anIntArray156[local13] != 12345678) {
						Static52.method940(local154, local158, local162, local142, local146, local150, arg0.anIntArray156[local13], arg0.anIntArray165[local13], arg0.anIntArray163[local13]);
					}
				} else if (Static101.aBoolean198) {
					@Pc(364) int local364 = Static52.anInterface1_1.method664(arg0.anIntArray167[local13]);
					Static52.method940(local154, local158, local162, local142, local146, local150, Static101.method1621(local364, arg0.anIntArray156[local13]), Static101.method1621(local364, arg0.anIntArray165[local13]), Static101.method1621(local364, arg0.anIntArray163[local13]));
				} else if (arg0.aBoolean79) {
					Static52.method926(local154, local158, local162, local142, local146, local150, arg0.anIntArray156[local13], arg0.anIntArray165[local13], arg0.anIntArray163[local13], Static41.anIntArray157[0], Static41.anIntArray157[1], Static41.anIntArray157[3], Static41.anIntArray161[0], Static41.anIntArray161[1], Static41.anIntArray161[3], Static41.anIntArray158[0], Static41.anIntArray158[1], Static41.anIntArray158[3], arg0.anIntArray167[local13]);
				} else {
					Static52.method926(local154, local158, local162, local142, local146, local150, arg0.anIntArray156[local13], arg0.anIntArray165[local13], arg0.anIntArray163[local13], Static41.anIntArray157[local20], Static41.anIntArray157[local27], Static41.anIntArray157[local37], Static41.anIntArray161[local20], Static41.anIntArray161[local27], Static41.anIntArray161[local37], Static41.anIntArray158[local20], Static41.anIntArray158[local27], Static41.anIntArray158[local37], arg0.anIntArray167[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "()V")
	public void method1647() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt2650; local1++) {
			for (local4 = 0; local4 < this.anInt2627; local4++) {
				for (local7 = 0; local7 < this.anInt2635; local7++) {
					this.aClass2_Sub19ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static101.anInt2654; local4++) {
			for (local7 = 0; local7 < Static101.anIntArray341[local4]; local7++) {
				Static101.aClass78ArrayArray1[local4][local7] = null;
			}
			Static101.anIntArray341[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt2631; local7++) {
			this.aClass16Array2[local7] = null;
		}
		this.anInt2631 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static101.aClass16Array1.length; local76++) {
			Static101.aClass16Array1[local76] = null;
		}
	}

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "(III)V")
	public void method1648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static101.aBoolean197 = true;
		Static101.anInt2651 = arg0;
		Static101.anInt2639 = arg1;
		Static101.anInt2642 = arg2;
		Static101.anInt2638 = -1;
		Static101.anInt2632 = -1;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method1651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class48 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class48(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub19ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub19ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub19(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub19ArrayArrayArray1[arg0][arg1][arg2].aClass48_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class48(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub19ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub19ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub19(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub19ArrayArrayArray1[arg0][arg1][arg2].aClass48_1 = local12;
		} else {
			@Pc(140) Class26 local140 = new Class26(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub19ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub19ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub19(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub19ArrayArrayArray1[arg0][arg1][arg2].aClass26_1 = local140;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!vd;Z)V")
	private void method1652(@OriginalArg(0) Class2_Sub19 arg0, @OriginalArg(1) boolean arg1) {
		Static101.aClass58_13.method1294(arg0);
		while (true) {
			@Pc(8) Class2_Sub19 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class2_Sub19[][] local31;
			@Pc(49) Class2_Sub19 local49;
			@Pc(251) int local251;
			@Pc(588) int local588;
			@Pc(593) int local593;
			@Pc(598) int local598;
			@Pc(601) int local601;
			@Pc(610) int local610;
			@Pc(952) Class52 local952;
			@Pc(1126) int local1126;
			@Pc(1011) int local1011;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class16 var12;
										@Pc(622) int var19;
										@Pc(345) int var23;
										@Pc(289) boolean var24;
										@Pc(833) Class2_Sub19 var35;
										while (true) {
											do {
												local8 = (Class2_Sub19) Static101.aClass58_13.method1291();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean238);
											local17 = local8.anInt3097;
											local20 = local8.anInt3105;
											local23 = local8.anInt3101;
											local26 = local8.anInt3106;
											local31 = this.aClass2_Sub19ArrayArrayArray1[local23];
											if (!local8.aBoolean239) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass2_Sub19ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean238) {
														continue;
													}
												}
												if (local17 <= Static101.anInt2640 && local17 > Static101.anInt2649) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean238 && (local49.aBoolean239 || (local8.anInt3102 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static101.anInt2640 && local17 < Static101.anInt2628 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean238 && (local49.aBoolean239 || (local8.anInt3102 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static101.anInt2645 && local20 > Static101.anInt2634) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean238 && (local49.aBoolean239 || (local8.anInt3102 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static101.anInt2645 && local20 < Static101.anInt2636 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean238 && (local49.aBoolean239 || (local8.anInt3102 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean239 = false;
											if (local8.aClass2_Sub19_1 != null) {
												local49 = local8.aClass2_Sub19_1;
												if (local49.aClass48_1 == null) {
													if (local49.aClass26_1 != null && !this.method1640(0, local17, local20)) {
														this.method1646(local49.aClass26_1, Static101.anInt2652, Static101.anInt2647, Static101.anInt2641, Static101.anInt2644, local17, local20);
													}
												} else if (!this.method1640(0, local17, local20)) {
													this.method1626(local49.aClass48_1, 0, Static101.anInt2652, Static101.anInt2647, Static101.anInt2641, Static101.anInt2644, local17, local20);
												}
												@Pc(225) Class52 local225 = local49.aClass52_1;
												if (local225 != null) {
													local225.aClass2_Sub1_Sub1_7.method1425(0, Static101.anInt2652, Static101.anInt2647, Static101.anInt2641, Static101.anInt2644, local225.anInt2018 - Static101.anInt2653, local225.anInt2021 - Static101.anInt2643, local225.anInt2014 - Static101.anInt2648, local225.anInt2024);
												}
												for (local251 = 0; local251 < local49.anInt3104; local251++) {
													var12 = local49.aClass16Array3[local251];
													if (var12 != null) {
														var12.aClass2_Sub1_Sub1_5.method1425(var12.anInt1060, Static101.anInt2652, Static101.anInt2647, Static101.anInt2641, Static101.anInt2644, var12.anInt1056 - Static101.anInt2653, var12.anInt1067 - Static101.anInt2643, var12.anInt1063 - Static101.anInt2648, var12.anInt1058);
													}
												}
											}
											var24 = false;
											if (local8.aClass48_1 == null) {
												if (local8.aClass26_1 != null && !this.method1640(local26, local17, local20)) {
													var24 = true;
													this.method1646(local8.aClass26_1, Static101.anInt2652, Static101.anInt2647, Static101.anInt2641, Static101.anInt2644, local17, local20);
												}
											} else if (!this.method1640(local26, local17, local20)) {
												var24 = true;
												if (local8.aClass48_1.anInt1899 != 12345678 || Static101.aBoolean197 && local23 <= Static101.anInt2651) {
													this.method1626(local8.aClass48_1, local26, Static101.anInt2652, Static101.anInt2647, Static101.anInt2641, Static101.anInt2644, local17, local20);
												}
											}
											var23 = 0;
											local251 = 0;
											@Pc(350) Class52 local350 = local8.aClass52_1;
											@Pc(353) Class7 local353 = local8.aClass7_1;
											if (local350 != null || local353 != null) {
												if (Static101.anInt2640 == local17) {
													var23++;
												} else if (Static101.anInt2640 < local17) {
													var23 += 2;
												}
												if (Static101.anInt2645 == local20) {
													var23 += 3;
												} else if (Static101.anInt2645 > local20) {
													var23 += 6;
												}
												local251 = Static101.anIntArray347[var23];
												local8.anInt3096 = Static101.anIntArray346[var23];
											}
											if (local350 != null) {
												if ((local350.anInt2022 & Static101.anIntArray343[var23]) == 0) {
													local8.anInt3098 = 0;
												} else if (local350.anInt2022 == 16) {
													local8.anInt3098 = 3;
													local8.anInt3100 = Static101.anIntArray348[var23];
													local8.anInt3103 = 3 - local8.anInt3100;
												} else if (local350.anInt2022 == 32) {
													local8.anInt3098 = 6;
													local8.anInt3100 = Static101.anIntArray349[var23];
													local8.anInt3103 = 6 - local8.anInt3100;
												} else if (local350.anInt2022 == 64) {
													local8.anInt3098 = 12;
													local8.anInt3100 = Static101.anIntArray344[var23];
													local8.anInt3103 = 12 - local8.anInt3100;
												} else {
													local8.anInt3098 = 9;
													local8.anInt3100 = Static101.anIntArray345[var23];
													local8.anInt3103 = 9 - local8.anInt3100;
												}
												if ((local350.anInt2022 & local251) != 0 && !this.method1641(local26, local17, local20, local350.anInt2022)) {
													local350.aClass2_Sub1_Sub1_7.method1425(0, Static101.anInt2652, Static101.anInt2647, Static101.anInt2641, Static101.anInt2644, local350.anInt2018 - Static101.anInt2653, local350.anInt2021 - Static101.anInt2643, local350.anInt2014 - Static101.anInt2648, local350.anInt2024);
												}
												if ((local350.anInt2012 & local251) != 0 && !this.method1641(local26, local17, local20, local350.anInt2012)) {
													local350.aClass2_Sub1_Sub1_8.method1425(0, Static101.anInt2652, Static101.anInt2647, Static101.anInt2641, Static101.anInt2644, local350.anInt2018 - Static101.anInt2653, local350.anInt2021 - Static101.anInt2643, local350.anInt2014 - Static101.anInt2648, local350.anInt2024);
												}
											}
											if (local353 != null && !this.method1625(local26, local17, local20, local353.aClass2_Sub1_Sub1_1.anInt2306)) {
												if ((local353.anInt308 & local251) != 0) {
													local353.aClass2_Sub1_Sub1_1.method1425(local353.anInt312, Static101.anInt2652, Static101.anInt2647, Static101.anInt2641, Static101.anInt2644, local353.anInt313 - Static101.anInt2653, local353.anInt310 - Static101.anInt2643, local353.anInt306 - Static101.anInt2648, local353.anInt301);
												} else if ((local353.anInt308 & 0x300) != 0) {
													local588 = local353.anInt313 - Static101.anInt2653;
													local593 = local353.anInt310 - Static101.anInt2643;
													local598 = local353.anInt306 - Static101.anInt2648;
													local601 = local353.anInt312;
													if (local601 == 1 || local601 == 2) {
														local610 = -local588;
													} else {
														local610 = local588;
													}
													if (local601 == 2 || local601 == 3) {
														var19 = -local598;
													} else {
														var19 = local598;
													}
													@Pc(639) int local639;
													@Pc(645) int local645;
													if ((local353.anInt308 & 0x100) != 0 && var19 < local610) {
														local639 = local588 + Static101.anIntArray342[local601];
														local645 = local598 + Static101.anIntArray340[local601];
														local353.aClass2_Sub1_Sub1_1.method1425(local601 * 512 + 256, Static101.anInt2652, Static101.anInt2647, Static101.anInt2641, Static101.anInt2644, local639, local593, local645, local353.anInt301);
													}
													if ((local353.anInt308 & 0x200) != 0 && var19 > local610) {
														local639 = local588 + Static101.anIntArray339[local601];
														local645 = local598 + Static101.anIntArray338[local601];
														local353.aClass2_Sub1_Sub1_1.method1425(local601 * 512 + 1280 & 0x7FF, Static101.anInt2652, Static101.anInt2647, Static101.anInt2641, Static101.anInt2644, local639, local593, local645, local353.anInt301);
													}
												}
											}
											if (var24) {
												@Pc(706) Class34 local706 = local8.aClass34_1;
												if (local706 != null) {
													local706.aClass2_Sub1_Sub1_6.method1425(0, Static101.anInt2652, Static101.anInt2647, Static101.anInt2641, Static101.anInt2644, local706.anInt1542 - Static101.anInt2653, local706.anInt1543 - Static101.anInt2643, local706.anInt1546 - Static101.anInt2648, local706.anInt1547);
												}
												@Pc(733) Class14 local733 = local8.aClass14_1;
												if (local733 != null && local733.anInt998 == 0) {
													if (local733.aClass2_Sub1_Sub1_2 != null) {
														local733.aClass2_Sub1_Sub1_2.method1425(0, Static101.anInt2652, Static101.anInt2647, Static101.anInt2641, Static101.anInt2644, local733.anInt999 - Static101.anInt2653, local733.anInt996 - Static101.anInt2643, local733.anInt1001 - Static101.anInt2648, local733.anInt988);
													}
													if (local733.aClass2_Sub1_Sub1_4 != null) {
														local733.aClass2_Sub1_Sub1_4.method1425(0, Static101.anInt2652, Static101.anInt2647, Static101.anInt2641, Static101.anInt2644, local733.anInt999 - Static101.anInt2653, local733.anInt996 - Static101.anInt2643, local733.anInt1001 - Static101.anInt2648, local733.anInt988);
													}
													if (local733.aClass2_Sub1_Sub1_3 != null) {
														local733.aClass2_Sub1_Sub1_3.method1425(0, Static101.anInt2652, Static101.anInt2647, Static101.anInt2641, Static101.anInt2644, local733.anInt999 - Static101.anInt2653, local733.anInt996 - Static101.anInt2643, local733.anInt1001 - Static101.anInt2648, local733.anInt988);
													}
												}
											}
											local588 = local8.anInt3102;
											if (local588 != 0) {
												if (local17 < Static101.anInt2640 && (local588 & 0x4) != 0) {
													var35 = local31[local17 + 1][local20];
													if (var35 != null && var35.aBoolean238) {
														Static101.aClass58_13.method1294(var35);
													}
												}
												if (local20 < Static101.anInt2645 && (local588 & 0x2) != 0) {
													var35 = local31[local17][local20 + 1];
													if (var35 != null && var35.aBoolean238) {
														Static101.aClass58_13.method1294(var35);
													}
												}
												if (local17 > Static101.anInt2640 && (local588 & 0x1) != 0) {
													var35 = local31[local17 - 1][local20];
													if (var35 != null && var35.aBoolean238) {
														Static101.aClass58_13.method1294(var35);
													}
												}
												if (local20 > Static101.anInt2645 && (local588 & 0x8) != 0) {
													var35 = local31[local17][local20 - 1];
													if (var35 != null && var35.aBoolean238) {
														Static101.aClass58_13.method1294(var35);
													}
												}
											}
											break;
										}
										if (local8.anInt3098 != 0) {
											var24 = true;
											for (var23 = 0; var23 < local8.anInt3104; var23++) {
												if (local8.aClass16Array3[var23].anInt1072 != Static101.anInt2637 && (local8.anIntArray404[var23] & local8.anInt3098) == local8.anInt3100) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												local952 = local8.aClass52_1;
												if (!this.method1641(local26, local17, local20, local952.anInt2022)) {
													local952.aClass2_Sub1_Sub1_7.method1425(0, Static101.anInt2652, Static101.anInt2647, Static101.anInt2641, Static101.anInt2644, local952.anInt2018 - Static101.anInt2653, local952.anInt2021 - Static101.anInt2643, local952.anInt2014 - Static101.anInt2648, local952.anInt2024);
												}
												local8.anInt3098 = 0;
											}
										}
										if (!local8.aBoolean240) {
											break;
										}
										try {
											@Pc(991) int local991 = local8.anInt3104;
											local8.aBoolean240 = false;
											var23 = 0;
											label568: for (local251 = 0; local251 < local991; local251++) {
												var12 = local8.aClass16Array3[local251];
												if (var12.anInt1072 != Static101.anInt2637) {
													for (local1011 = var12.anInt1061; local1011 <= var12.anInt1068; local1011++) {
														for (local588 = var12.anInt1059; local588 <= var12.anInt1071; local588++) {
															var35 = local31[local1011][local588];
															if (var35.aBoolean239) {
																local8.aBoolean240 = true;
																continue label568;
															}
															if (var35.anInt3098 != 0) {
																local598 = 0;
																if (local1011 > var12.anInt1061) {
																	local598++;
																}
																if (local1011 < var12.anInt1068) {
																	local598 += 4;
																}
																if (local588 > var12.anInt1059) {
																	local598 += 8;
																}
																if (local588 < var12.anInt1071) {
																	local598 += 2;
																}
																if ((local598 & var35.anInt3098) == local8.anInt3103) {
																	local8.aBoolean240 = true;
																	continue label568;
																}
															}
														}
													}
													Static101.aClass16Array1[var23++] = var12;
													local588 = Static101.anInt2640 - var12.anInt1061;
													local593 = var12.anInt1068 - Static101.anInt2640;
													if (local593 > local588) {
														local588 = local593;
													}
													local598 = Static101.anInt2645 - var12.anInt1059;
													local601 = var12.anInt1071 - Static101.anInt2645;
													if (local601 > local598) {
														var12.anInt1057 = local588 + local601;
													} else {
														var12.anInt1057 = local588 + local598;
													}
												}
											}
											while (var23 > 0) {
												local1126 = -50;
												local1011 = -1;
												@Pc(1135) Class16 local1135;
												for (local588 = 0; local588 < var23; local588++) {
													local1135 = Static101.aClass16Array1[local588];
													if (local1135.anInt1072 != Static101.anInt2637) {
														if (local1135.anInt1057 > local1126) {
															local1126 = local1135.anInt1057;
															local1011 = local588;
														} else if (local1135.anInt1057 == local1126) {
															local598 = local1135.anInt1056 - Static101.anInt2653;
															local601 = local1135.anInt1063 - Static101.anInt2648;
															local610 = Static101.aClass16Array1[local1011].anInt1056 - Static101.anInt2653;
															var19 = Static101.aClass16Array1[local1011].anInt1063 - Static101.anInt2648;
															if (local598 * local598 + local601 * local601 > local610 * local610 + var19 * var19) {
																local1011 = local588;
															}
														}
													}
												}
												if (local1011 == -1) {
													break;
												}
												local1135 = Static101.aClass16Array1[local1011];
												local1135.anInt1072 = Static101.anInt2637;
												if (!this.method1638(local26, local1135.anInt1061, local1135.anInt1068, local1135.anInt1059, local1135.anInt1071, local1135.aClass2_Sub1_Sub1_5.anInt2306)) {
													local1135.aClass2_Sub1_Sub1_5.method1425(local1135.anInt1060, Static101.anInt2652, Static101.anInt2647, Static101.anInt2641, Static101.anInt2644, local1135.anInt1056 - Static101.anInt2653, local1135.anInt1067 - Static101.anInt2643, local1135.anInt1063 - Static101.anInt2648, local1135.anInt1058);
												}
												for (local598 = local1135.anInt1061; local598 <= local1135.anInt1068; local598++) {
													for (local601 = local1135.anInt1059; local601 <= local1135.anInt1071; local601++) {
														@Pc(1260) Class2_Sub19 local1260 = local31[local598][local601];
														if (local1260.anInt3098 != 0) {
															Static101.aClass58_13.method1294(local1260);
														} else if ((local598 != local17 || local601 != local20) && local1260.aBoolean238) {
															Static101.aClass58_13.method1294(local1260);
														}
													}
												}
											}
											if (!local8.aBoolean240) {
												break;
											}
										} catch (@Pc(1298) Exception local1298) {
											local8.aBoolean240 = false;
											break;
										}
									}
								} while (!local8.aBoolean238);
							} while (local8.anInt3098 != 0);
							if (local17 > Static101.anInt2640 || local17 <= Static101.anInt2649) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean238);
						if (local17 < Static101.anInt2640 || local17 >= Static101.anInt2628 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean238);
					if (local20 > Static101.anInt2645 || local20 <= Static101.anInt2634) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean238);
				if (local20 < Static101.anInt2645 || local20 >= Static101.anInt2636 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean238);
			local8.aBoolean238 = false;
			Static101.anInt2646--;
			@Pc(1402) Class14 local1402 = local8.aClass14_1;
			if (local1402 != null && local1402.anInt998 != 0) {
				if (local1402.aClass2_Sub1_Sub1_2 != null) {
					local1402.aClass2_Sub1_Sub1_2.method1425(0, Static101.anInt2652, Static101.anInt2647, Static101.anInt2641, Static101.anInt2644, local1402.anInt999 - Static101.anInt2653, local1402.anInt996 - Static101.anInt2643 - local1402.anInt998, local1402.anInt1001 - Static101.anInt2648, local1402.anInt988);
				}
				if (local1402.aClass2_Sub1_Sub1_4 != null) {
					local1402.aClass2_Sub1_Sub1_4.method1425(0, Static101.anInt2652, Static101.anInt2647, Static101.anInt2641, Static101.anInt2644, local1402.anInt999 - Static101.anInt2653, local1402.anInt996 - Static101.anInt2643 - local1402.anInt998, local1402.anInt1001 - Static101.anInt2648, local1402.anInt988);
				}
				if (local1402.aClass2_Sub1_Sub1_3 != null) {
					local1402.aClass2_Sub1_Sub1_3.method1425(0, Static101.anInt2652, Static101.anInt2647, Static101.anInt2641, Static101.anInt2644, local1402.anInt999 - Static101.anInt2653, local1402.anInt996 - Static101.anInt2643 - local1402.anInt998, local1402.anInt1001 - Static101.anInt2648, local1402.anInt988);
				}
			}
			if (local8.anInt3096 != 0) {
				@Pc(1497) Class7 local1497 = local8.aClass7_1;
				if (local1497 != null && !this.method1625(local26, local17, local20, local1497.aClass2_Sub1_Sub1_1.anInt2306)) {
					if ((local1497.anInt308 & local8.anInt3096) != 0) {
						local1497.aClass2_Sub1_Sub1_1.method1425(local1497.anInt312, Static101.anInt2652, Static101.anInt2647, Static101.anInt2641, Static101.anInt2644, local1497.anInt313 - Static101.anInt2653, local1497.anInt310 - Static101.anInt2643, local1497.anInt306 - Static101.anInt2648, local1497.anInt301);
					} else if ((local1497.anInt308 & 0x300) != 0) {
						local251 = local1497.anInt313 - Static101.anInt2653;
						local1126 = local1497.anInt310 - Static101.anInt2643;
						local1011 = local1497.anInt306 - Static101.anInt2648;
						local588 = local1497.anInt312;
						if (local588 == 1 || local588 == 2) {
							local593 = -local251;
						} else {
							local593 = local251;
						}
						if (local588 == 2 || local588 == 3) {
							local598 = -local1011;
						} else {
							local598 = local1011;
						}
						if ((local1497.anInt308 & 0x100) != 0 && local598 >= local593) {
							local601 = local251 + Static101.anIntArray342[local588];
							local610 = local1011 + Static101.anIntArray340[local588];
							local1497.aClass2_Sub1_Sub1_1.method1425(local588 * 512 + 256, Static101.anInt2652, Static101.anInt2647, Static101.anInt2641, Static101.anInt2644, local601, local1126, local610, local1497.anInt301);
						}
						if ((local1497.anInt308 & 0x200) != 0 && local598 <= local593) {
							local601 = local251 + Static101.anIntArray339[local588];
							local610 = local1011 + Static101.anIntArray338[local588];
							local1497.aClass2_Sub1_Sub1_1.method1425(local588 * 512 + 1280 & 0x7FF, Static101.anInt2652, Static101.anInt2647, Static101.anInt2641, Static101.anInt2644, local601, local1126, local610, local1497.anInt301);
						}
					}
				}
				local952 = local8.aClass52_1;
				if (local952 != null) {
					if ((local952.anInt2012 & local8.anInt3096) != 0 && !this.method1641(local26, local17, local20, local952.anInt2012)) {
						local952.aClass2_Sub1_Sub1_8.method1425(0, Static101.anInt2652, Static101.anInt2647, Static101.anInt2641, Static101.anInt2644, local952.anInt2018 - Static101.anInt2653, local952.anInt2021 - Static101.anInt2643, local952.anInt2014 - Static101.anInt2648, local952.anInt2024);
					}
					if ((local952.anInt2022 & local8.anInt3096) != 0 && !this.method1641(local26, local17, local20, local952.anInt2022)) {
						local952.aClass2_Sub1_Sub1_7.method1425(0, Static101.anInt2652, Static101.anInt2647, Static101.anInt2641, Static101.anInt2644, local952.anInt2018 - Static101.anInt2653, local952.anInt2021 - Static101.anInt2643, local952.anInt2014 - Static101.anInt2648, local952.anInt2024);
					}
				}
			}
			@Pc(1755) Class2_Sub19 local1755;
			if (local23 < this.anInt2650 - 1) {
				local1755 = this.aClass2_Sub19ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1755 != null && local1755.aBoolean238) {
					Static101.aClass58_13.method1294(local1755);
				}
			}
			if (local17 < Static101.anInt2640) {
				local1755 = local31[local17 + 1][local20];
				if (local1755 != null && local1755.aBoolean238) {
					Static101.aClass58_13.method1294(local1755);
				}
			}
			if (local20 < Static101.anInt2645) {
				local1755 = local31[local17][local20 + 1];
				if (local1755 != null && local1755.aBoolean238) {
					Static101.aClass58_13.method1294(local1755);
				}
			}
			if (local17 > Static101.anInt2640) {
				local1755 = local31[local17 - 1][local20];
				if (local1755 != null && local1755.aBoolean238) {
					Static101.aClass58_13.method1294(local1755);
				}
			}
			if (local20 > Static101.anInt2645) {
				local1755 = local31[local17][local20 - 1];
				if (local1755 != null && local1755.aBoolean238) {
					Static101.aClass58_13.method1294(local1755);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "(III)I")
	public int method1653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub19 local8 = this.aClass2_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt3104; local14++) {
			@Pc(20) Class16 local20 = local8.aClass16Array3[local14];
			if ((local20.anInt1058 >> 29 & 0x3) == 2 && local20.anInt1061 == arg1 && local20.anInt1059 == arg2) {
				return local20.anInt1058;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIILclient!e;II)V")
	public void method1654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class34 local6 = new Class34();
		local6.aClass2_Sub1_Sub1_6 = arg4;
		local6.anInt1542 = arg1 * 128 + 64;
		local6.anInt1546 = arg2 * 128 + 64;
		local6.anInt1543 = arg3;
		local6.anInt1547 = arg5;
		local6.anInt1548 = arg6;
		if (this.aClass2_Sub19ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass2_Sub19ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub19(arg0, arg1, arg2);
		}
		this.aClass2_Sub19ArrayArrayArray1[arg0][arg1][arg2].aClass34_1 = local6;
	}

	@OriginalMember(owner = "client!sa", name = "q", descriptor = "(III)Lclient!ib;")
	public Class34 method1655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub19 local8 = this.aClass2_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass34_1 == null ? null : local8.aClass34_1;
	}

	@OriginalMember(owner = "client!sa", name = "r", descriptor = "(III)I")
	public int method1656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub19 local8 = this.aClass2_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass52_1 == null ? 0 : local8.aClass52_1.anInt2024;
	}
}
