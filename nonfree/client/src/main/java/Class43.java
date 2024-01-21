import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class43 {

	@OriginalMember(owner = "client!le", name = "b", descriptor = "I")
	private int anInt1681 = 0;

	@OriginalMember(owner = "client!le", name = "G", descriptor = "I")
	private int anInt1701 = 0;

	@OriginalMember(owner = "client!le", name = "L", descriptor = "[Lclient!de;")
	private final Class16[] aClass16Array2 = new Class16[5000];

	@OriginalMember(owner = "client!le", name = "R", descriptor = "I")
	private int anInt1707 = 0;

	@OriginalMember(owner = "client!le", name = "S", descriptor = "[I")
	private final int[] anIntArray224 = new int[10000];

	@OriginalMember(owner = "client!le", name = "Q", descriptor = "[I")
	private final int[] anIntArray223 = new int[10000];

	@OriginalMember(owner = "client!le", name = "T", descriptor = "[[I")
	private final int[][] anIntArrayArray16 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!le", name = "X", descriptor = "[[I")
	private final int[][] anIntArrayArray17 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!le", name = "c", descriptor = "I")
	private final int anInt1682;

	@OriginalMember(owner = "client!le", name = "j", descriptor = "I")
	private final int anInt1687;

	@OriginalMember(owner = "client!le", name = "M", descriptor = "I")
	private final int anInt1705;

	@OriginalMember(owner = "client!le", name = "O", descriptor = "[[[Lclient!w;")
	private final Class2_Sub13[][][] aClass2_Sub13ArrayArrayArray1;

	@OriginalMember(owner = "client!le", name = "u", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!le", name = "i", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(III[[[I)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt1682 = arg0;
		this.anInt1687 = arg1;
		this.anInt1705 = arg2;
		this.aClass2_Sub13ArrayArrayArray1 = new Class2_Sub13[arg0][arg1][arg2];
		this.anIntArrayArrayArray6 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray5 = arg3;
		this.method1208();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(III)V")
	public void method1165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub13 local8 = this.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass22_1 = null;
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(III)I")
	public int method1166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub13 local8 = this.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass20_1 == null ? 0 : local8.aClass20_1.anInt808;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIII)V")
	public void method1167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub13 local8 = this.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2].anInt2803 = arg3;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!ga;Lclient!ga;IIIZ)V")
	private void method1168(@OriginalArg(0) Class2_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) Class2_Sub1_Sub2_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg1.method718();
		this.anInt1707++;
		@Pc(9) int local9 = 0;
		@Pc(12) int[] local12 = arg1.anIntArray114;
		@Pc(15) int local15 = arg1.anInt988;
		for (@Pc(17) int local17 = 0; local17 < arg0.anInt988; local17++) {
			@Pc(23) Class14 local23 = arg0.aClass14Array2[local17];
			@Pc(28) Class14 local28 = arg0.aClass14Array1[local17];
			if (local28.anInt573 != 0) {
				@Pc(38) int local38 = arg0.anIntArray118[local17] - arg3;
				if (local38 <= arg1.anInt993) {
					@Pc(49) int local49 = arg0.anIntArray114[local17] - arg2;
					if (local49 >= arg1.anInt989 && local49 <= arg1.anInt984) {
						@Pc(65) int local65 = arg0.anIntArray112[local17] - arg4;
						if (local65 >= arg1.anInt983 && local65 <= arg1.anInt990) {
							for (@Pc(76) int local76 = 0; local76 < local15; local76++) {
								@Pc(82) Class14 local82 = arg1.aClass14Array2[local76];
								@Pc(87) Class14 local87 = arg1.aClass14Array1[local76];
								if (local49 == local12[local76] && local65 == arg1.anIntArray112[local76] && local38 == arg1.anIntArray118[local76] && local87.anInt573 != 0) {
									local23.anInt569 += local87.anInt569;
									local23.anInt565 += local87.anInt565;
									local23.anInt567 += local87.anInt567;
									local23.anInt573 += local87.anInt573;
									local82.anInt569 += local28.anInt569;
									local82.anInt565 += local28.anInt565;
									local82.anInt567 += local28.anInt567;
									local82.anInt573 += local28.anInt573;
									local9++;
									this.anIntArray224[local17] = this.anInt1707;
									this.anIntArray223[local76] = this.anInt1707;
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
		for (@Pc(193) int local193 = 0; local193 < arg0.anInt985; local193++) {
			if (this.anIntArray224[arg0.anIntArray113[local193]] == this.anInt1707 && this.anIntArray224[arg0.anIntArray119[local193]] == this.anInt1707 && this.anIntArray224[arg0.anIntArray116[local193]] == this.anInt1707) {
				arg0.anIntArray106[local193] = -1;
			}
		}
		for (@Pc(236) int local236 = 0; local236 < arg1.anInt985; local236++) {
			if (this.anIntArray223[arg1.anIntArray113[local236]] == this.anInt1707 && this.anIntArray223[arg1.anIntArray119[local236]] == this.anInt1707 && this.anIntArray223[arg1.anIntArray116[local236]] == this.anInt1707) {
				arg1.anIntArray106[local236] = -1;
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIILclient!ae;IIIIII)Z")
	public boolean method1169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class2_Sub1_Sub2 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method1196(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(III)V")
	public void method1170() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1682; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt1687; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt1705; local7++) {
					@Pc(17) Class2_Sub13 local17 = this.aClass2_Sub13ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class18 local22 = local17.aClass18_1;
						if (local22 != null && local22.aClass2_Sub1_Sub2_2 instanceof Class2_Sub1_Sub2_Sub2) {
							@Pc(32) Class2_Sub1_Sub2_Sub2 local32 = (Class2_Sub1_Sub2_Sub2) local22.aClass2_Sub1_Sub2_2;
							if (local32.aClass14Array2 != null) {
								this.method1182(local32, local1, local4, local7, 1, 1);
								if (local22.aClass2_Sub1_Sub2_3 instanceof Class2_Sub1_Sub2_Sub2) {
									@Pc(51) Class2_Sub1_Sub2_Sub2 local51 = (Class2_Sub1_Sub2_Sub2) local22.aClass2_Sub1_Sub2_3;
									if (local51.aClass14Array2 != null) {
										this.method1182(local51, local1, local4, local7, 1, 1);
										this.method1168(local32, local51, 0, 0, 0, false);
										local51.method706();
									}
								}
								local32.method706();
							}
						}
						@Pc(98) Class2_Sub1_Sub2_Sub2 local98;
						for (@Pc(82) int local82 = 0; local82 < local17.anInt2809; local82++) {
							@Pc(88) Class16 local88 = local17.aClass16Array3[local82];
							if (local88 != null && local88.aClass2_Sub1_Sub2_1 instanceof Class2_Sub1_Sub2_Sub2) {
								local98 = (Class2_Sub1_Sub2_Sub2) local88.aClass2_Sub1_Sub2_1;
								if (local98.aClass14Array2 != null) {
									this.method1182(local98, local1, local4, local7, local88.anInt608 + 1 - local88.anInt611, local88.anInt590 - local88.anInt593 + 1);
									local98.method706();
								}
							}
						}
						@Pc(134) Class20 local134 = local17.aClass20_1;
						if (local134 != null && local134.aClass2_Sub1_Sub2_4 instanceof Class2_Sub1_Sub2_Sub2) {
							local98 = (Class2_Sub1_Sub2_Sub2) local134.aClass2_Sub1_Sub2_4;
							if (local98.aClass14Array2 != null) {
								this.method1173(local98, local1, local4, local7);
								local98.method706();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II)V")
	public void method1171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub13 local8 = this.aClass2_Sub13ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class2_Sub13 local31 = this.aClass2_Sub13ArrayArrayArray1[local10][arg0][arg1] = this.aClass2_Sub13ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt2797--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt2809; local41++) {
					@Pc(47) Class16 local47 = local31.aClass16Array3[local41];
					if ((local47.anInt613 >> 29 & 0x3) == 2 && local47.anInt611 == arg0 && local47.anInt593 == arg1) {
						local47.anInt601--;
					}
				}
			}
		}
		if (this.aClass2_Sub13ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass2_Sub13ArrayArrayArray1[0][arg0][arg1] = new Class2_Sub13(0, arg0, arg1);
		}
		this.aClass2_Sub13ArrayArrayArray1[0][arg0][arg1].aClass2_Sub13_1 = local8;
		this.aClass2_Sub13ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "()V")
	public void method1172() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1701; local1++) {
			@Pc(7) Class16 local7 = this.aClass16Array2[local1];
			this.method1205(local7);
			this.aClass16Array2[local1] = null;
		}
		this.anInt1701 = 0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!ga;III)V")
	private void method1173(@OriginalArg(0) Class2_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class2_Sub13 local14;
		@Pc(29) Class2_Sub1_Sub2_Sub2 local29;
		if (arg2 < this.anInt1687) {
			local14 = this.aClass2_Sub13ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass20_1 != null && local14.aClass20_1.aClass2_Sub1_Sub2_4 instanceof Class2_Sub1_Sub2_Sub2) {
				local29 = (Class2_Sub1_Sub2_Sub2) local14.aClass20_1.aClass2_Sub1_Sub2_4;
				if (local29.aClass14Array2 != null) {
					this.method1168(arg0, local29, 128, 0, 0, true);
				}
			}
		}
		if (arg3 < this.anInt1687) {
			local14 = this.aClass2_Sub13ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass20_1 != null && local14.aClass20_1.aClass2_Sub1_Sub2_4 instanceof Class2_Sub1_Sub2_Sub2) {
				local29 = (Class2_Sub1_Sub2_Sub2) local14.aClass20_1.aClass2_Sub1_Sub2_4;
				if (local29.aClass14Array2 != null) {
					this.method1168(arg0, local29, 0, 0, 128, true);
				}
			}
		}
		if (arg2 < this.anInt1687 && arg3 < this.anInt1705) {
			local14 = this.aClass2_Sub13ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass20_1 != null && local14.aClass20_1.aClass2_Sub1_Sub2_4 instanceof Class2_Sub1_Sub2_Sub2) {
				local29 = (Class2_Sub1_Sub2_Sub2) local14.aClass20_1.aClass2_Sub1_Sub2_4;
				if (local29.aClass14Array2 != null) {
					this.method1168(arg0, local29, 128, 0, 128, true);
				}
			}
		}
		if (arg2 >= this.anInt1687 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass2_Sub13ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass20_1 != null && local14.aClass20_1.aClass2_Sub1_Sub2_4 instanceof Class2_Sub1_Sub2_Sub2) {
			local29 = (Class2_Sub1_Sub2_Sub2) local14.aClass20_1.aClass2_Sub1_Sub2_4;
			if (local29.aClass14Array2 != null) {
				this.method1168(arg0, local29, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(IIII)V")
	public void method1174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub13 local8 = this.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class22 local14 = local8.aClass22_1;
		if (local14 != null) {
			@Pc(23) int local23 = arg1 * 128 + 64;
			@Pc(29) int local29 = arg2 * 128 + 64;
			local14.anInt835 = local23 + (local14.anInt835 - local23) * arg3 / 16;
			local14.anInt828 = local29 + (local14.anInt828 - local29) * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIILclient!ae;IIIIII)V")
	public void method1176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub2 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class22 local6 = new Class22();
		local6.anInt839 = arg9;
		local6.anInt830 = arg10;
		local6.anInt835 = arg1 * 128 + arg7 + 64;
		local6.anInt828 = arg2 * 128 + arg8 + 64;
		local6.anInt829 = arg3;
		local6.aClass2_Sub1_Sub2_5 = arg4;
		local6.anInt831 = arg5;
		local6.anInt827 = arg6;
		for (@Pc(44) int local44 = arg0; local44 >= 0; local44--) {
			if (this.aClass2_Sub13ArrayArrayArray1[local44][arg1][arg2] == null) {
				this.aClass2_Sub13ArrayArrayArray1[local44][arg1][arg2] = new Class2_Sub13(local44, arg1, arg2);
			}
		}
		this.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2].aClass22_1 = local6;
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(III)Lclient!fa;")
	public Class20 method1177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub13 local8 = this.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass20_1 == null ? null : local8.aClass20_1;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIII)V")
	public void method1178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt1687 * 128) {
			arg0 = this.anInt1687 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt1705 * 128) {
			arg2 = this.anInt1705 * 128 - 1;
		}
		Static59.anInt1703++;
		Static59.anInt1692 = Static32.anIntArray122[arg3];
		Static59.anInt1704 = Static32.anIntArray129[arg3];
		Static59.anInt1686 = Static32.anIntArray122[arg4];
		Static59.anInt1691 = Static32.anIntArray129[arg4];
		Static59.aBooleanArrayArray1 = Static59.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static59.anInt1694 = arg0;
		Static59.anInt1696 = arg1;
		Static59.anInt1699 = arg2;
		Static59.anInt1685 = arg0 / 128;
		Static59.anInt1697 = arg2 / 128;
		Static59.anInt1689 = arg5;
		Static59.anInt1702 = Static59.anInt1685 - 25;
		if (Static59.anInt1702 < 0) {
			Static59.anInt1702 = 0;
		}
		Static59.anInt1695 = Static59.anInt1697 - 25;
		if (Static59.anInt1695 < 0) {
			Static59.anInt1695 = 0;
		}
		Static59.anInt1684 = Static59.anInt1685 + 25;
		if (Static59.anInt1684 > this.anInt1687) {
			Static59.anInt1684 = this.anInt1687;
		}
		Static59.anInt1683 = Static59.anInt1697 + 25;
		if (Static59.anInt1683 > this.anInt1705) {
			Static59.anInt1683 = this.anInt1705;
		}
		this.method1191();
		Static59.anInt1700 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt1681; local128 < this.anInt1682; local128++) {
			@Pc(134) Class2_Sub13[][] local134 = this.aClass2_Sub13ArrayArrayArray1[local128];
			for (local136 = Static59.anInt1702; local136 < Static59.anInt1684; local136++) {
				for (local139 = Static59.anInt1695; local139 < Static59.anInt1683; local139++) {
					@Pc(146) Class2_Sub13 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt2803 <= arg5 && (Static59.aBooleanArrayArray1[local136 + 25 - Static59.anInt1685][local139 + 25 - Static59.anInt1697] || this.anIntArrayArrayArray5[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean128 = true;
							local146.aBoolean127 = true;
							if (local146.anInt2809 > 0) {
								local146.aBoolean129 = true;
							} else {
								local146.aBoolean129 = false;
							}
							Static59.anInt1700++;
						} else {
							local146.aBoolean128 = false;
							local146.aBoolean127 = false;
							local146.anInt2798 = 0;
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
		for (@Pc(224) int local224 = this.anInt1681; local224 < this.anInt1682; local224++) {
			@Pc(230) Class2_Sub13[][] local230 = this.aClass2_Sub13ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static59.anInt1685 + local139;
				local241 = Static59.anInt1685 - local139;
				if (local237 >= Static59.anInt1702 || local241 < Static59.anInt1684) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static59.anInt1697 + local249;
						local258 = Static59.anInt1697 - local249;
						@Pc(270) Class2_Sub13 local270;
						if (local237 >= Static59.anInt1702) {
							if (local254 >= Static59.anInt1695) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean128) {
									this.method1192(local270, true);
								}
							}
							if (local258 < Static59.anInt1683) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean128) {
									this.method1192(local270, true);
								}
							}
						}
						if (local241 < Static59.anInt1684) {
							if (local254 >= Static59.anInt1695) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean128) {
									this.method1192(local270, true);
								}
							}
							if (local258 < Static59.anInt1683) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean128) {
									this.method1192(local270, true);
								}
							}
						}
						if (Static59.anInt1700 == 0) {
							Static59.aBoolean90 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt1681; local136 < this.anInt1682; local136++) {
			@Pc(361) Class2_Sub13[][] local361 = this.aClass2_Sub13ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static59.anInt1685 + local237;
				local249 = Static59.anInt1685 - local237;
				if (local241 >= Static59.anInt1702 || local249 < Static59.anInt1684) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static59.anInt1697 + local254;
						@Pc(389) int local389 = Static59.anInt1697 - local254;
						@Pc(401) Class2_Sub13 local401;
						if (local241 >= Static59.anInt1702) {
							if (local258 >= Static59.anInt1695) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean128) {
									this.method1192(local401, false);
								}
							}
							if (local389 < Static59.anInt1683) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean128) {
									this.method1192(local401, false);
								}
							}
						}
						if (local249 < Static59.anInt1684) {
							if (local258 >= Static59.anInt1695) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean128) {
									this.method1192(local401, false);
								}
							}
							if (local389 < Static59.anInt1683) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean128) {
									this.method1192(local401, false);
								}
							}
						}
						if (Static59.anInt1700 == 0) {
							Static59.aBoolean90 = false;
							return;
						}
					}
				}
			}
		}
		Static59.aBoolean90 = false;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!ob;IIIIII)V")
	private void method1179(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray266.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray266[local5] - Static59.anInt1694;
			local20 = arg0.anIntArray260[local5] - Static59.anInt1696;
			local27 = arg0.anIntArray267[local5] - Static59.anInt1699;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray262 != null) {
				Static74.anIntArray269[local5] = local37;
				Static74.anIntArray264[local5] = local59;
				Static74.anIntArray272[local5] = local69;
			}
			Static74.anIntArray271[local5] = Static106.anInt2840 + (local37 << 9) / local69;
			Static74.anIntArray270[local5] = Static106.anInt2846 + (local59 << 9) / local69;
		}
		Static106.anInt2842 = 0;
		local3 = arg0.anIntArray268.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray268[local13];
			local27 = arg0.anIntArray261[local13];
			local37 = arg0.anIntArray263[local13];
			@Pc(142) int local142 = Static74.anIntArray271[local20];
			@Pc(146) int local146 = Static74.anIntArray271[local27];
			@Pc(150) int local150 = Static74.anIntArray271[local37];
			@Pc(154) int local154 = Static74.anIntArray270[local20];
			@Pc(158) int local158 = Static74.anIntArray270[local27];
			@Pc(162) int local162 = Static74.anIntArray270[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static106.aBoolean131 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static106.anInt2839 || local146 > Static106.anInt2839 || local150 > Static106.anInt2839) {
					Static106.aBoolean131 = true;
				}
				if (Static59.aBoolean90 && this.method1209(Static59.anInt1690, Static59.anInt1698, local154, local158, local162, local142, local146, local150)) {
					Static59.anInt1706 = arg5;
					Static59.anInt1693 = arg6;
				}
				if (arg0.anIntArray262 == null || arg0.anIntArray262[local13] == -1) {
					if (arg0.anIntArray274[local13] != 12345678) {
						Static106.method2036(local154, local158, local162, local142, local146, local150, arg0.anIntArray274[local13], arg0.anIntArray265[local13], arg0.anIntArray273[local13]);
					}
				} else if (Static59.aBoolean89) {
					@Pc(364) int local364 = Static106.anInterface1_1.method1722(arg0.anIntArray262[local13]);
					Static106.method2036(local154, local158, local162, local142, local146, local150, Static59.method1213(local364, arg0.anIntArray274[local13]), Static59.method1213(local364, arg0.anIntArray265[local13]), Static59.method1213(local364, arg0.anIntArray273[local13]));
				} else if (arg0.aBoolean98) {
					Static106.method2028(local154, local158, local162, local142, local146, local150, arg0.anIntArray274[local13], arg0.anIntArray265[local13], arg0.anIntArray273[local13], Static74.anIntArray269[0], Static74.anIntArray269[1], Static74.anIntArray269[3], Static74.anIntArray264[0], Static74.anIntArray264[1], Static74.anIntArray264[3], Static74.anIntArray272[0], Static74.anIntArray272[1], Static74.anIntArray272[3], arg0.anIntArray262[local13]);
				} else {
					Static106.method2028(local154, local158, local162, local142, local146, local150, arg0.anIntArray274[local13], arg0.anIntArray265[local13], arg0.anIntArray273[local13], Static74.anIntArray269[local20], Static74.anIntArray269[local27], Static74.anIntArray269[local37], Static74.anIntArray264[local20], Static74.anIntArray264[local27], Static74.anIntArray264[local37], Static74.anIntArray272[local20], Static74.anIntArray272[local27], Static74.anIntArray272[local37], arg0.anIntArray262[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIILclient!ae;IIZ)Z")
	public boolean method1180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub1_Sub2 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method1196(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(IIII)Z")
	private boolean method1181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method1198(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method1204(local11 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2] - arg3, local15 + 1) && this.method1204(local11 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method1204(local11 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method1204(local11 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!ga;IIIII)V")
	private void method1182(@OriginalArg(0) Class2_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt1682) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt1687) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt1705 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class2_Sub13 local66 = this.aClass2_Sub13ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray5[local17][local24][local34] + this.anIntArrayArrayArray5[local17][local24 + 1][local34] + this.anIntArrayArrayArray5[local17][local24][local34 + 1] + this.anIntArrayArrayArray5[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray5[arg1][arg2][arg3] + this.anIntArrayArrayArray5[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray5[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray5[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class18 local163 = local66.aClass18_1;
									if (local163 != null) {
										@Pc(173) Class2_Sub1_Sub2_Sub2 local173;
										if (local163.aClass2_Sub1_Sub2_2 instanceof Class2_Sub1_Sub2_Sub2) {
											local173 = (Class2_Sub1_Sub2_Sub2) local163.aClass2_Sub1_Sub2_2;
											if (local173.aClass14Array2 != null) {
												this.method1168(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
											}
										}
										if (local163.aClass2_Sub1_Sub2_3 instanceof Class2_Sub1_Sub2_Sub2) {
											local173 = (Class2_Sub1_Sub2_Sub2) local163.aClass2_Sub1_Sub2_3;
											if (local173.aClass14Array2 != null) {
												this.method1168(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
											}
										}
									}
									for (@Pc(245) int local245 = 0; local245 < local66.anInt2809; local245++) {
										@Pc(251) Class16 local251 = local66.aClass16Array3[local245];
										if (local251 != null && local251.aClass2_Sub1_Sub2_1 instanceof Class2_Sub1_Sub2_Sub2) {
											@Pc(261) Class2_Sub1_Sub2_Sub2 local261 = (Class2_Sub1_Sub2_Sub2) local251.aClass2_Sub1_Sub2_1;
											if (local261.aClass14Array2 != null) {
												@Pc(272) int local272 = local251.anInt608 + 1 - local251.anInt611;
												@Pc(280) int local280 = local251.anInt590 + 1 - local251.anInt593;
												this.method1168(arg0, local261, (local251.anInt611 - arg2) * 128 + (local272 - arg4) * 64, local160, (local251.anInt593 - arg3) * 128 + (local280 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!le", name = "e", descriptor = "(III)Lclient!fc;")
	public Class22 method1183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub13 local8 = this.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass22_1;
	}

	@OriginalMember(owner = "client!le", name = "f", descriptor = "(III)V")
	public void method1184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub13 local8 = this.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass18_1 = null;
		}
	}

	@OriginalMember(owner = "client!le", name = "g", descriptor = "(III)Lclient!eb;")
	public Class18 method1185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub13 local8 = this.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass18_1;
	}

	@OriginalMember(owner = "client!le", name = "h", descriptor = "(III)V")
	public void method1186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub13 local8 = this.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass38_1 = null;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIILclient!ae;ILclient!ae;Lclient!ae;)V")
	public void method1187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub2 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub1_Sub2 arg6, @OriginalArg(7) Class2_Sub1_Sub2 arg7) {
		@Pc(3) Class38 local3 = new Class38();
		local3.aClass2_Sub1_Sub2_6 = arg4;
		local3.anInt1509 = arg1 * 128 + 64;
		local3.anInt1504 = arg2 * 128 + 64;
		local3.anInt1506 = arg3;
		local3.anInt1511 = arg5;
		local3.aClass2_Sub1_Sub2_8 = arg6;
		local3.aClass2_Sub1_Sub2_7 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class2_Sub13 local43 = this.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt2809; local47++) {
				if ((local43.aClass16Array3[local47].anInt603 & 0x100) == 256 && local43.aClass16Array3[local47].aClass2_Sub1_Sub2_1 instanceof Class2_Sub1_Sub2_Sub2) {
					@Pc(71) Class2_Sub1_Sub2_Sub2 local71 = (Class2_Sub1_Sub2_Sub2) local43.aClass16Array3[local47].aClass2_Sub1_Sub2_1;
					local71.method697();
					if (local71.anInt2876 > local34) {
						local34 = local71.anInt2876;
					}
				}
			}
		}
		local3.anInt1508 = local34;
		if (this.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub13(arg0, arg1, arg2);
		}
		this.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2].aClass38_1 = local3;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "([IIIIII)V")
	public void method1188(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class2_Sub13 local8 = this.aClass2_Sub13ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class8 local14 = local8.aClass8_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt186;
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
		@Pc(59) Class49 local59 = local8.aClass49_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt2088;
		@Pc(68) int local68 = local59.anInt2089;
		@Pc(71) int local71 = local59.anInt2087;
		@Pc(74) int local74 = local59.anInt2090;
		@Pc(79) int[] local79 = this.anIntArrayArray16[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray17[local68];
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

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(IIII)I")
	public int method1189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub13 local8 = this.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass18_1 != null && local8.aClass18_1.anInt665 == arg3) {
			return local8.aClass18_1.anInt662 & 0xFF;
		} else if (local8.aClass22_1 != null && local8.aClass22_1.anInt839 == arg3) {
			return local8.aClass22_1.anInt830 & 0xFF;
		} else if (local8.aClass20_1 != null && local8.aClass20_1.anInt808 == arg3) {
			return local8.aClass20_1.anInt807 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt2809; local56++) {
				if (local8.aClass16Array3[local56].anInt613 == arg3) {
					return local8.aClass16Array3[local56].anInt603 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(II)V")
	public void method1190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static59.aBoolean90 = true;
		Static59.anInt1690 = arg0;
		Static59.anInt1698 = arg1;
		Static59.anInt1706 = -1;
		Static59.anInt1693 = -1;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "()V")
	private void method1191() {
		@Pc(3) int local3 = Static59.anIntArray219[Static59.anInt1689];
		@Pc(7) Class40[] local7 = Static59.aClass40ArrayArray1[Static59.anInt1689];
		Static59.anInt1688 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class40 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt1661 == 1) {
				local27 = local16.anInt1636 + 25 - Static59.anInt1685;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt1659 + 25 - Static59.anInt1697;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1641 + 25 - Static59.anInt1697;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static59.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static59.anInt1694 - local16.anInt1658;
						if (local79 > 32) {
							local16.anInt1640 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt1640 = 2;
							local79 = -local79;
						}
						local16.anInt1662 = (local16.anInt1638 - Static59.anInt1699 << 8) / local79;
						local16.anInt1644 = (local16.anInt1651 - Static59.anInt1699 << 8) / local79;
						local16.anInt1660 = (local16.anInt1645 - Static59.anInt1696 << 8) / local79;
						local16.anInt1646 = (local16.anInt1648 - Static59.anInt1696 << 8) / local79;
						Static59.aClass40Array1[Static59.anInt1688++] = local16;
					}
				}
			} else if (local16.anInt1661 == 2) {
				local27 = local16.anInt1659 + 25 - Static59.anInt1697;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt1636 + 25 - Static59.anInt1685;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1656 + 25 - Static59.anInt1685;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static59.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static59.anInt1699 - local16.anInt1638;
						if (local79 > 32) {
							local16.anInt1640 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt1640 = 4;
							local79 = -local79;
						}
						local16.anInt1655 = (local16.anInt1658 - Static59.anInt1694 << 8) / local79;
						local16.anInt1643 = (local16.anInt1637 - Static59.anInt1694 << 8) / local79;
						local16.anInt1660 = (local16.anInt1645 - Static59.anInt1696 << 8) / local79;
						local16.anInt1646 = (local16.anInt1648 - Static59.anInt1696 << 8) / local79;
						Static59.aClass40Array1[Static59.anInt1688++] = local16;
					}
				}
			} else if (local16.anInt1661 == 4) {
				local27 = local16.anInt1645 - Static59.anInt1696;
				if (local27 > 128) {
					local40 = local16.anInt1659 + 25 - Static59.anInt1697;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1641 + 25 - Static59.anInt1697;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt1636 + 25 - Static59.anInt1685;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt1656 + 25 - Static59.anInt1685;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static59.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt1640 = 5;
							local16.anInt1655 = (local16.anInt1658 - Static59.anInt1694 << 8) / local27;
							local16.anInt1643 = (local16.anInt1637 - Static59.anInt1694 << 8) / local27;
							local16.anInt1662 = (local16.anInt1638 - Static59.anInt1699 << 8) / local27;
							local16.anInt1644 = (local16.anInt1651 - Static59.anInt1699 << 8) / local27;
							Static59.aClass40Array1[Static59.anInt1688++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!w;Z)V")
	private void method1192(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) boolean arg1) {
		Static59.aClass34_28.method876(arg0);
		while (true) {
			@Pc(8) Class2_Sub13 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class2_Sub13[][] local31;
			@Pc(49) Class2_Sub13 local49;
			@Pc(251) int local251;
			@Pc(578) int local578;
			@Pc(583) int local583;
			@Pc(588) int local588;
			@Pc(591) int local591;
			@Pc(600) int local600;
			@Pc(942) Class18 local942;
			@Pc(1116) int local1116;
			@Pc(1001) int local1001;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class16 var12;
										@Pc(612) int var19;
										@Pc(335) int var23;
										@Pc(289) boolean var24;
										@Pc(823) Class2_Sub13 var35;
										while (true) {
											do {
												local8 = (Class2_Sub13) Static59.aClass34_28.method873();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean127);
											local17 = local8.anInt2806;
											local20 = local8.anInt2804;
											local23 = local8.anInt2797;
											local26 = local8.anInt2808;
											local31 = this.aClass2_Sub13ArrayArrayArray1[local23];
											if (!local8.aBoolean128) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass2_Sub13ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean127) {
														continue;
													}
												}
												if (local17 <= Static59.anInt1685 && local17 > Static59.anInt1702) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean127 && (local49.aBoolean128 || (local8.anInt2802 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static59.anInt1685 && local17 < Static59.anInt1684 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean127 && (local49.aBoolean128 || (local8.anInt2802 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static59.anInt1697 && local20 > Static59.anInt1695) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean127 && (local49.aBoolean128 || (local8.anInt2802 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static59.anInt1697 && local20 < Static59.anInt1683 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean127 && (local49.aBoolean128 || (local8.anInt2802 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean128 = false;
											if (local8.aClass2_Sub13_1 != null) {
												local49 = local8.aClass2_Sub13_1;
												if (local49.aClass8_1 == null) {
													if (local49.aClass49_1 != null && !this.method1198(0, local17, local20)) {
														this.method1179(local49.aClass49_1, Static59.anInt1692, Static59.anInt1704, Static59.anInt1686, Static59.anInt1691, local17, local20);
													}
												} else if (!this.method1198(0, local17, local20)) {
													this.method1194(local49.aClass8_1, 0, Static59.anInt1692, Static59.anInt1704, Static59.anInt1686, Static59.anInt1691, local17, local20);
												}
												@Pc(225) Class18 local225 = local49.aClass18_1;
												if (local225 != null) {
													local225.aClass2_Sub1_Sub2_2.method2064(0, Static59.anInt1692, Static59.anInt1704, Static59.anInt1686, Static59.anInt1691, local225.anInt656 - Static59.anInt1694, local225.anInt667 - Static59.anInt1696, local225.anInt660 - Static59.anInt1699, local225.anInt665);
												}
												for (local251 = 0; local251 < local49.anInt2809; local251++) {
													var12 = local49.aClass16Array3[local251];
													if (var12 != null) {
														var12.aClass2_Sub1_Sub2_1.method2064(var12.anInt599, Static59.anInt1692, Static59.anInt1704, Static59.anInt1686, Static59.anInt1691, var12.anInt602 - Static59.anInt1694, var12.anInt609 - Static59.anInt1696, var12.anInt612 - Static59.anInt1699, var12.anInt613);
													}
												}
											}
											var24 = false;
											if (local8.aClass8_1 == null) {
												if (local8.aClass49_1 != null && !this.method1198(local26, local17, local20)) {
													var24 = true;
													this.method1179(local8.aClass49_1, Static59.anInt1692, Static59.anInt1704, Static59.anInt1686, Static59.anInt1691, local17, local20);
												}
											} else if (!this.method1198(local26, local17, local20)) {
												var24 = true;
												this.method1194(local8.aClass8_1, local26, Static59.anInt1692, Static59.anInt1704, Static59.anInt1686, Static59.anInt1691, local17, local20);
											}
											var23 = 0;
											local251 = 0;
											@Pc(340) Class18 local340 = local8.aClass18_1;
											@Pc(343) Class22 local343 = local8.aClass22_1;
											if (local340 != null || local343 != null) {
												if (Static59.anInt1685 == local17) {
													var23++;
												} else if (Static59.anInt1685 < local17) {
													var23 += 2;
												}
												if (Static59.anInt1697 == local20) {
													var23 += 3;
												} else if (Static59.anInt1697 > local20) {
													var23 += 6;
												}
												local251 = Static59.anIntArray227[var23];
												local8.anInt2807 = Static59.anIntArray226[var23];
											}
											if (local340 != null) {
												if ((local340.anInt654 & Static59.anIntArray229[var23]) == 0) {
													local8.anInt2798 = 0;
												} else if (local340.anInt654 == 16) {
													local8.anInt2798 = 3;
													local8.anInt2799 = Static59.anIntArray230[var23];
													local8.anInt2805 = 3 - local8.anInt2799;
												} else if (local340.anInt654 == 32) {
													local8.anInt2798 = 6;
													local8.anInt2799 = Static59.anIntArray225[var23];
													local8.anInt2805 = 6 - local8.anInt2799;
												} else if (local340.anInt654 == 64) {
													local8.anInt2798 = 12;
													local8.anInt2799 = Static59.anIntArray231[var23];
													local8.anInt2805 = 12 - local8.anInt2799;
												} else {
													local8.anInt2798 = 9;
													local8.anInt2799 = Static59.anIntArray228[var23];
													local8.anInt2805 = 9 - local8.anInt2799;
												}
												if ((local340.anInt654 & local251) != 0 && !this.method1203(local26, local17, local20, local340.anInt654)) {
													local340.aClass2_Sub1_Sub2_2.method2064(0, Static59.anInt1692, Static59.anInt1704, Static59.anInt1686, Static59.anInt1691, local340.anInt656 - Static59.anInt1694, local340.anInt667 - Static59.anInt1696, local340.anInt660 - Static59.anInt1699, local340.anInt665);
												}
												if ((local340.anInt653 & local251) != 0 && !this.method1203(local26, local17, local20, local340.anInt653)) {
													local340.aClass2_Sub1_Sub2_3.method2064(0, Static59.anInt1692, Static59.anInt1704, Static59.anInt1686, Static59.anInt1691, local340.anInt656 - Static59.anInt1694, local340.anInt667 - Static59.anInt1696, local340.anInt660 - Static59.anInt1699, local340.anInt665);
												}
											}
											if (local343 != null && !this.method1181(local26, local17, local20, local343.aClass2_Sub1_Sub2_5.anInt2876)) {
												if ((local343.anInt831 & local251) != 0) {
													local343.aClass2_Sub1_Sub2_5.method2064(local343.anInt827, Static59.anInt1692, Static59.anInt1704, Static59.anInt1686, Static59.anInt1691, local343.anInt835 - Static59.anInt1694, local343.anInt829 - Static59.anInt1696, local343.anInt828 - Static59.anInt1699, local343.anInt839);
												} else if ((local343.anInt831 & 0x300) != 0) {
													local578 = local343.anInt835 - Static59.anInt1694;
													local583 = local343.anInt829 - Static59.anInt1696;
													local588 = local343.anInt828 - Static59.anInt1699;
													local591 = local343.anInt827;
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
													if ((local343.anInt831 & 0x100) != 0 && var19 < local600) {
														local629 = local578 + Static59.anIntArray220[local591];
														local635 = local588 + Static59.anIntArray221[local591];
														local343.aClass2_Sub1_Sub2_5.method2064(local591 * 512 + 256, Static59.anInt1692, Static59.anInt1704, Static59.anInt1686, Static59.anInt1691, local629, local583, local635, local343.anInt839);
													}
													if ((local343.anInt831 & 0x200) != 0 && var19 > local600) {
														local629 = local578 + Static59.anIntArray218[local591];
														local635 = local588 + Static59.anIntArray222[local591];
														local343.aClass2_Sub1_Sub2_5.method2064(local591 * 512 + 1280 & 0x7FF, Static59.anInt1692, Static59.anInt1704, Static59.anInt1686, Static59.anInt1691, local629, local583, local635, local343.anInt839);
													}
												}
											}
											if (var24) {
												@Pc(696) Class20 local696 = local8.aClass20_1;
												if (local696 != null) {
													local696.aClass2_Sub1_Sub2_4.method2064(0, Static59.anInt1692, Static59.anInt1704, Static59.anInt1686, Static59.anInt1691, local696.anInt810 - Static59.anInt1694, local696.anInt805 - Static59.anInt1696, local696.anInt809 - Static59.anInt1699, local696.anInt808);
												}
												@Pc(723) Class38 local723 = local8.aClass38_1;
												if (local723 != null && local723.anInt1508 == 0) {
													if (local723.aClass2_Sub1_Sub2_8 != null) {
														local723.aClass2_Sub1_Sub2_8.method2064(0, Static59.anInt1692, Static59.anInt1704, Static59.anInt1686, Static59.anInt1691, local723.anInt1509 - Static59.anInt1694, local723.anInt1506 - Static59.anInt1696, local723.anInt1504 - Static59.anInt1699, local723.anInt1511);
													}
													if (local723.aClass2_Sub1_Sub2_7 != null) {
														local723.aClass2_Sub1_Sub2_7.method2064(0, Static59.anInt1692, Static59.anInt1704, Static59.anInt1686, Static59.anInt1691, local723.anInt1509 - Static59.anInt1694, local723.anInt1506 - Static59.anInt1696, local723.anInt1504 - Static59.anInt1699, local723.anInt1511);
													}
													if (local723.aClass2_Sub1_Sub2_6 != null) {
														local723.aClass2_Sub1_Sub2_6.method2064(0, Static59.anInt1692, Static59.anInt1704, Static59.anInt1686, Static59.anInt1691, local723.anInt1509 - Static59.anInt1694, local723.anInt1506 - Static59.anInt1696, local723.anInt1504 - Static59.anInt1699, local723.anInt1511);
													}
												}
											}
											local578 = local8.anInt2802;
											if (local578 != 0) {
												if (local17 < Static59.anInt1685 && (local578 & 0x4) != 0) {
													var35 = local31[local17 + 1][local20];
													if (var35 != null && var35.aBoolean127) {
														Static59.aClass34_28.method876(var35);
													}
												}
												if (local20 < Static59.anInt1697 && (local578 & 0x2) != 0) {
													var35 = local31[local17][local20 + 1];
													if (var35 != null && var35.aBoolean127) {
														Static59.aClass34_28.method876(var35);
													}
												}
												if (local17 > Static59.anInt1685 && (local578 & 0x1) != 0) {
													var35 = local31[local17 - 1][local20];
													if (var35 != null && var35.aBoolean127) {
														Static59.aClass34_28.method876(var35);
													}
												}
												if (local20 > Static59.anInt1697 && (local578 & 0x8) != 0) {
													var35 = local31[local17][local20 - 1];
													if (var35 != null && var35.aBoolean127) {
														Static59.aClass34_28.method876(var35);
													}
												}
											}
											break;
										}
										if (local8.anInt2798 != 0) {
											var24 = true;
											for (var23 = 0; var23 < local8.anInt2809; var23++) {
												if (local8.aClass16Array3[var23].anInt594 != Static59.anInt1703 && (local8.anIntArray348[var23] & local8.anInt2798) == local8.anInt2799) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												local942 = local8.aClass18_1;
												if (!this.method1203(local26, local17, local20, local942.anInt654)) {
													local942.aClass2_Sub1_Sub2_2.method2064(0, Static59.anInt1692, Static59.anInt1704, Static59.anInt1686, Static59.anInt1691, local942.anInt656 - Static59.anInt1694, local942.anInt667 - Static59.anInt1696, local942.anInt660 - Static59.anInt1699, local942.anInt665);
												}
												local8.anInt2798 = 0;
											}
										}
										if (!local8.aBoolean129) {
											break;
										}
										try {
											@Pc(981) int local981 = local8.anInt2809;
											local8.aBoolean129 = false;
											var23 = 0;
											label559: for (local251 = 0; local251 < local981; local251++) {
												var12 = local8.aClass16Array3[local251];
												if (var12.anInt594 != Static59.anInt1703) {
													for (local1001 = var12.anInt611; local1001 <= var12.anInt608; local1001++) {
														for (local578 = var12.anInt593; local578 <= var12.anInt590; local578++) {
															var35 = local31[local1001][local578];
															if (var35.aBoolean128) {
																local8.aBoolean129 = true;
																continue label559;
															}
															if (var35.anInt2798 != 0) {
																local588 = 0;
																if (local1001 > var12.anInt611) {
																	local588++;
																}
																if (local1001 < var12.anInt608) {
																	local588 += 4;
																}
																if (local578 > var12.anInt593) {
																	local588 += 8;
																}
																if (local578 < var12.anInt590) {
																	local588 += 2;
																}
																if ((local588 & var35.anInt2798) == local8.anInt2805) {
																	local8.aBoolean129 = true;
																	continue label559;
																}
															}
														}
													}
													Static59.aClass16Array1[var23++] = var12;
													local578 = Static59.anInt1685 - var12.anInt611;
													local583 = var12.anInt608 - Static59.anInt1685;
													if (local583 > local578) {
														local578 = local583;
													}
													local588 = Static59.anInt1697 - var12.anInt593;
													local591 = var12.anInt590 - Static59.anInt1697;
													if (local591 > local588) {
														var12.anInt596 = local578 + local591;
													} else {
														var12.anInt596 = local578 + local588;
													}
												}
											}
											while (var23 > 0) {
												local1116 = -50;
												local1001 = -1;
												@Pc(1125) Class16 local1125;
												for (local578 = 0; local578 < var23; local578++) {
													local1125 = Static59.aClass16Array1[local578];
													if (local1125.anInt594 != Static59.anInt1703) {
														if (local1125.anInt596 > local1116) {
															local1116 = local1125.anInt596;
															local1001 = local578;
														} else if (local1125.anInt596 == local1116) {
															local588 = local1125.anInt602 - Static59.anInt1694;
															local591 = local1125.anInt612 - Static59.anInt1699;
															local600 = Static59.aClass16Array1[local1001].anInt602 - Static59.anInt1694;
															var19 = Static59.aClass16Array1[local1001].anInt612 - Static59.anInt1699;
															if (local588 * local588 + local591 * local591 > local600 * local600 + var19 * var19) {
																local1001 = local578;
															}
														}
													}
												}
												if (local1001 == -1) {
													break;
												}
												local1125 = Static59.aClass16Array1[local1001];
												local1125.anInt594 = Static59.anInt1703;
												if (!this.method1210(local26, local1125.anInt611, local1125.anInt608, local1125.anInt593, local1125.anInt590, local1125.aClass2_Sub1_Sub2_1.anInt2876)) {
													local1125.aClass2_Sub1_Sub2_1.method2064(local1125.anInt599, Static59.anInt1692, Static59.anInt1704, Static59.anInt1686, Static59.anInt1691, local1125.anInt602 - Static59.anInt1694, local1125.anInt609 - Static59.anInt1696, local1125.anInt612 - Static59.anInt1699, local1125.anInt613);
												}
												for (local588 = local1125.anInt611; local588 <= local1125.anInt608; local588++) {
													for (local591 = local1125.anInt593; local591 <= local1125.anInt590; local591++) {
														@Pc(1250) Class2_Sub13 local1250 = local31[local588][local591];
														if (local1250.anInt2798 != 0) {
															Static59.aClass34_28.method876(local1250);
														} else if ((local588 != local17 || local591 != local20) && local1250.aBoolean127) {
															Static59.aClass34_28.method876(local1250);
														}
													}
												}
											}
											if (!local8.aBoolean129) {
												break;
											}
										} catch (@Pc(1288) Exception local1288) {
											local8.aBoolean129 = false;
											break;
										}
									}
								} while (!local8.aBoolean127);
							} while (local8.anInt2798 != 0);
							if (local17 > Static59.anInt1685 || local17 <= Static59.anInt1702) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean127);
						if (local17 < Static59.anInt1685 || local17 >= Static59.anInt1684 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean127);
					if (local20 > Static59.anInt1697 || local20 <= Static59.anInt1695) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean127);
				if (local20 < Static59.anInt1697 || local20 >= Static59.anInt1683 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean127);
			local8.aBoolean127 = false;
			Static59.anInt1700--;
			@Pc(1392) Class38 local1392 = local8.aClass38_1;
			if (local1392 != null && local1392.anInt1508 != 0) {
				if (local1392.aClass2_Sub1_Sub2_8 != null) {
					local1392.aClass2_Sub1_Sub2_8.method2064(0, Static59.anInt1692, Static59.anInt1704, Static59.anInt1686, Static59.anInt1691, local1392.anInt1509 - Static59.anInt1694, local1392.anInt1506 - Static59.anInt1696 - local1392.anInt1508, local1392.anInt1504 - Static59.anInt1699, local1392.anInt1511);
				}
				if (local1392.aClass2_Sub1_Sub2_7 != null) {
					local1392.aClass2_Sub1_Sub2_7.method2064(0, Static59.anInt1692, Static59.anInt1704, Static59.anInt1686, Static59.anInt1691, local1392.anInt1509 - Static59.anInt1694, local1392.anInt1506 - Static59.anInt1696 - local1392.anInt1508, local1392.anInt1504 - Static59.anInt1699, local1392.anInt1511);
				}
				if (local1392.aClass2_Sub1_Sub2_6 != null) {
					local1392.aClass2_Sub1_Sub2_6.method2064(0, Static59.anInt1692, Static59.anInt1704, Static59.anInt1686, Static59.anInt1691, local1392.anInt1509 - Static59.anInt1694, local1392.anInt1506 - Static59.anInt1696 - local1392.anInt1508, local1392.anInt1504 - Static59.anInt1699, local1392.anInt1511);
				}
			}
			if (local8.anInt2807 != 0) {
				@Pc(1487) Class22 local1487 = local8.aClass22_1;
				if (local1487 != null && !this.method1181(local26, local17, local20, local1487.aClass2_Sub1_Sub2_5.anInt2876)) {
					if ((local1487.anInt831 & local8.anInt2807) != 0) {
						local1487.aClass2_Sub1_Sub2_5.method2064(local1487.anInt827, Static59.anInt1692, Static59.anInt1704, Static59.anInt1686, Static59.anInt1691, local1487.anInt835 - Static59.anInt1694, local1487.anInt829 - Static59.anInt1696, local1487.anInt828 - Static59.anInt1699, local1487.anInt839);
					} else if ((local1487.anInt831 & 0x300) != 0) {
						local251 = local1487.anInt835 - Static59.anInt1694;
						local1116 = local1487.anInt829 - Static59.anInt1696;
						local1001 = local1487.anInt828 - Static59.anInt1699;
						local578 = local1487.anInt827;
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
						if ((local1487.anInt831 & 0x100) != 0 && local588 >= local583) {
							local591 = local251 + Static59.anIntArray220[local578];
							local600 = local1001 + Static59.anIntArray221[local578];
							local1487.aClass2_Sub1_Sub2_5.method2064(local578 * 512 + 256, Static59.anInt1692, Static59.anInt1704, Static59.anInt1686, Static59.anInt1691, local591, local1116, local600, local1487.anInt839);
						}
						if ((local1487.anInt831 & 0x200) != 0 && local588 <= local583) {
							local591 = local251 + Static59.anIntArray218[local578];
							local600 = local1001 + Static59.anIntArray222[local578];
							local1487.aClass2_Sub1_Sub2_5.method2064(local578 * 512 + 1280 & 0x7FF, Static59.anInt1692, Static59.anInt1704, Static59.anInt1686, Static59.anInt1691, local591, local1116, local600, local1487.anInt839);
						}
					}
				}
				local942 = local8.aClass18_1;
				if (local942 != null) {
					if ((local942.anInt653 & local8.anInt2807) != 0 && !this.method1203(local26, local17, local20, local942.anInt653)) {
						local942.aClass2_Sub1_Sub2_3.method2064(0, Static59.anInt1692, Static59.anInt1704, Static59.anInt1686, Static59.anInt1691, local942.anInt656 - Static59.anInt1694, local942.anInt667 - Static59.anInt1696, local942.anInt660 - Static59.anInt1699, local942.anInt665);
					}
					if ((local942.anInt654 & local8.anInt2807) != 0 && !this.method1203(local26, local17, local20, local942.anInt654)) {
						local942.aClass2_Sub1_Sub2_2.method2064(0, Static59.anInt1692, Static59.anInt1704, Static59.anInt1686, Static59.anInt1691, local942.anInt656 - Static59.anInt1694, local942.anInt667 - Static59.anInt1696, local942.anInt660 - Static59.anInt1699, local942.anInt665);
					}
				}
			}
			@Pc(1745) Class2_Sub13 local1745;
			if (local23 < this.anInt1682 - 1) {
				local1745 = this.aClass2_Sub13ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1745 != null && local1745.aBoolean127) {
					Static59.aClass34_28.method876(local1745);
				}
			}
			if (local17 < Static59.anInt1685) {
				local1745 = local31[local17 + 1][local20];
				if (local1745 != null && local1745.aBoolean127) {
					Static59.aClass34_28.method876(local1745);
				}
			}
			if (local20 < Static59.anInt1697) {
				local1745 = local31[local17][local20 + 1];
				if (local1745 != null && local1745.aBoolean127) {
					Static59.aClass34_28.method876(local1745);
				}
			}
			if (local17 > Static59.anInt1685) {
				local1745 = local31[local17 - 1][local20];
				if (local1745 != null && local1745.aBoolean127) {
					Static59.aClass34_28.method876(local1745);
				}
			}
			if (local20 > Static59.anInt1697) {
				local1745 = local31[local17][local20 - 1];
				if (local1745 != null && local1745.aBoolean127) {
					Static59.aClass34_28.method876(local1745);
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!bc;IIIIIII)V")
	private void method1194(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static59.anInt1694;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static59.anInt1699;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray5[arg1][arg6][arg7] - Static59.anInt1696;
		@Pc(51) int local51 = this.anIntArrayArrayArray5[arg1][arg6 + 1][arg7] - Static59.anInt1696;
		@Pc(66) int local66 = this.anIntArrayArrayArray5[arg1][arg6 + 1][arg7 + 1] - Static59.anInt1696;
		@Pc(79) int local79 = this.anIntArrayArrayArray5[arg1][arg6][arg7 + 1] - Static59.anInt1696;
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
		@Pc(279) int local279 = Static106.anInt2840 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static106.anInt2846 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static106.anInt2840 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static106.anInt2846 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static106.anInt2840 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static106.anInt2846 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static106.anInt2840 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static106.anInt2846 + (local89 << 9) / local265;
		Static106.anInt2842 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static106.aBoolean131 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static106.anInt2839 || local327 > Static106.anInt2839 || local295 > Static106.anInt2839) {
				Static106.aBoolean131 = true;
			}
			if (Static59.aBoolean90 && this.method1209(Static59.anInt1690, Static59.anInt1698, local319, local335, local303, local311, local327, local295)) {
				Static59.anInt1706 = arg6;
				Static59.anInt1693 = arg7;
			}
			if (arg0.anInt190 == -1) {
				if (arg0.anInt194 != 12345678) {
					Static106.method2036(local319, local335, local303, local311, local327, local295, arg0.anInt194, arg0.anInt188, arg0.anInt191);
				}
			} else if (Static59.aBoolean89) {
				local472 = Static106.anInterface1_1.method1722(arg0.anInt190);
				Static106.method2036(local319, local335, local303, local311, local327, local295, Static59.method1213(local472, arg0.anInt194), Static59.method1213(local472, arg0.anInt188), Static59.method1213(local472, arg0.anInt191));
			} else if (arg0.aBoolean6) {
				Static106.method2028(local319, local335, local303, local311, local327, local295, arg0.anInt194, arg0.anInt188, arg0.anInt191, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt190);
			} else {
				Static106.method2028(local319, local335, local303, local311, local327, local295, arg0.anInt194, arg0.anInt188, arg0.anInt191, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt190);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static106.aBoolean131 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static106.anInt2839 || local295 > Static106.anInt2839 || local327 > Static106.anInt2839) {
			Static106.aBoolean131 = true;
		}
		if (Static59.aBoolean90 && this.method1209(Static59.anInt1690, Static59.anInt1698, local287, local303, local335, local279, local295, local327)) {
			Static59.anInt1706 = arg6;
			Static59.anInt1693 = arg7;
		}
		if (arg0.anInt190 != -1) {
			if (!Static59.aBoolean89) {
				Static106.method2028(local287, local303, local335, local279, local295, local327, arg0.anInt189, arg0.anInt191, arg0.anInt188, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt190);
				return;
			}
			local472 = Static106.anInterface1_1.method1722(arg0.anInt190);
			Static106.method2036(local287, local303, local335, local279, local295, local327, Static59.method1213(local472, arg0.anInt189), Static59.method1213(local472, arg0.anInt191), Static59.method1213(local472, arg0.anInt188));
		} else if (arg0.anInt189 != 12345678) {
			Static106.method2036(local287, local303, local335, local279, local295, local327, arg0.anInt189, arg0.anInt191, arg0.anInt188);
			return;
		}
	}

	@OriginalMember(owner = "client!le", name = "i", descriptor = "(III)I")
	public int method1195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub13 local8 = this.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass18_1 == null ? 0 : local8.aClass18_1.anInt665;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIIILclient!ae;IZII)Z")
	private boolean method1196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class2_Sub1_Sub2 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt1687 || local4 >= this.anInt1705) {
					return false;
				}
				@Pc(28) Class2_Sub13 local28 = this.aClass2_Sub13ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt2809 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class16 local52 = new Class16();
		local52.anInt613 = arg11;
		local52.anInt603 = arg12;
		local52.anInt601 = arg0;
		local52.anInt602 = arg5;
		local52.anInt612 = arg6;
		local52.anInt609 = arg7;
		local52.aClass2_Sub1_Sub2_1 = arg8;
		local52.anInt599 = arg9;
		local52.anInt611 = arg1;
		local52.anInt593 = arg2;
		local52.anInt608 = arg1 + arg3 - 1;
		local52.anInt590 = arg2 + arg4 - 1;
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
					if (this.aClass2_Sub13ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass2_Sub13ArrayArrayArray1[local130][local98][local101] = new Class2_Sub13(local130, local98, local101);
					}
				}
				@Pc(166) Class2_Sub13 local166 = this.aClass2_Sub13ArrayArrayArray1[arg0][local98][local101];
				local166.aClass16Array3[local166.anInt2809] = local52;
				local166.anIntArray348[local166.anInt2809] = local104;
				local166.anInt2802 |= local104;
				local166.anInt2809++;
			}
		}
		if (arg10) {
			this.aClass16Array2[this.anInt1701++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIILclient!ae;II)V")
	public void method1197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub2 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class20 local6 = new Class20();
		local6.aClass2_Sub1_Sub2_4 = arg4;
		local6.anInt810 = arg1 * 128 + 64;
		local6.anInt809 = arg2 * 128 + 64;
		local6.anInt805 = arg3;
		local6.anInt808 = arg5;
		local6.anInt807 = arg6;
		if (this.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub13(arg0, arg1, arg2);
		}
		this.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2].aClass20_1 = local6;
	}

	@OriginalMember(owner = "client!le", name = "j", descriptor = "(III)Z")
	private boolean method1198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray6[arg0][arg1][arg2];
		if (local8 == -Static59.anInt1703) {
			return false;
		} else if (local8 == Static59.anInt1703) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method1204(local23 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2], local27 + 1) && this.method1204(local23 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2], local27 + 1) && this.method1204(local23 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method1204(local23 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray6[arg0][arg1][arg2] = Static59.anInt1703;
				return true;
			} else {
				this.anIntArrayArrayArray6[arg0][arg1][arg2] = -Static59.anInt1703;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "l", descriptor = "(III)I")
	public int method1200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub13 local8 = this.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt2809; local14++) {
			@Pc(20) Class16 local20 = local8.aClass16Array3[local14];
			if ((local20.anInt613 >> 29 & 0x3) == 2 && local20.anInt611 == arg1 && local20.anInt593 == arg2) {
				return local20.anInt613;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIILclient!ae;III)Z")
	public boolean method1201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub1_Sub2 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method1196(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!le", name = "m", descriptor = "(III)I")
	public int method1202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub13 local8 = this.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass22_1 == null ? 0 : local8.aClass22_1.anInt839;
	}

	@OriginalMember(owner = "client!le", name = "e", descriptor = "(IIII)Z")
	private boolean method1203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method1198(arg0, arg1, arg2)) {
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
				if (local11 > Static59.anInt1694) {
					if (!this.method1204(local11, local26, local15)) {
						return false;
					}
					if (!this.method1204(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1204(local11, local30, local15)) {
						return false;
					}
					if (!this.method1204(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1204(local11, local34, local15)) {
					return false;
				}
				if (!this.method1204(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static59.anInt1699) {
					if (!this.method1204(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method1204(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1204(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method1204(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1204(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method1204(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static59.anInt1694) {
					if (!this.method1204(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method1204(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1204(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method1204(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1204(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method1204(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static59.anInt1699) {
					if (!this.method1204(local11, local26, local15)) {
						return false;
					}
					if (!this.method1204(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1204(local11, local30, local15)) {
						return false;
					}
					if (!this.method1204(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method1204(local11, local34, local15)) {
					return false;
				}
				if (!this.method1204(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method1204(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method1204(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method1204(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method1204(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method1204(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!le", name = "n", descriptor = "(III)Z")
	private boolean method1204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static59.anInt1688; local1++) {
			@Pc(6) Class40 local6 = Static59.aClass40Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt1640 == 1) {
				local15 = local6.anInt1658 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt1638 + (local6.anInt1662 * local15 >> 8);
					local37 = local6.anInt1651 + (local6.anInt1644 * local15 >> 8);
					local47 = local6.anInt1645 + (local6.anInt1660 * local15 >> 8);
					local57 = local6.anInt1648 + (local6.anInt1646 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1640 == 2) {
				local15 = arg0 - local6.anInt1658;
				if (local15 > 0) {
					local27 = local6.anInt1638 + (local6.anInt1662 * local15 >> 8);
					local37 = local6.anInt1651 + (local6.anInt1644 * local15 >> 8);
					local47 = local6.anInt1645 + (local6.anInt1660 * local15 >> 8);
					local57 = local6.anInt1648 + (local6.anInt1646 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1640 == 3) {
				local15 = local6.anInt1638 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt1658 + (local6.anInt1655 * local15 >> 8);
					local37 = local6.anInt1637 + (local6.anInt1643 * local15 >> 8);
					local47 = local6.anInt1645 + (local6.anInt1660 * local15 >> 8);
					local57 = local6.anInt1648 + (local6.anInt1646 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1640 == 4) {
				local15 = arg2 - local6.anInt1638;
				if (local15 > 0) {
					local27 = local6.anInt1658 + (local6.anInt1655 * local15 >> 8);
					local37 = local6.anInt1637 + (local6.anInt1643 * local15 >> 8);
					local47 = local6.anInt1645 + (local6.anInt1660 * local15 >> 8);
					local57 = local6.anInt1648 + (local6.anInt1646 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1640 == 5) {
				local15 = arg1 - local6.anInt1645;
				if (local15 > 0) {
					local27 = local6.anInt1658 + (local6.anInt1655 * local15 >> 8);
					local37 = local6.anInt1637 + (local6.anInt1643 * local15 >> 8);
					local47 = local6.anInt1638 + (local6.anInt1662 * local15 >> 8);
					local57 = local6.anInt1651 + (local6.anInt1644 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!de;)V")
	private void method1205(@OriginalArg(0) Class16 arg0) {
		for (@Pc(2) int local2 = arg0.anInt611; local2 <= arg0.anInt608; local2++) {
			for (@Pc(6) int local6 = arg0.anInt593; local6 <= arg0.anInt590; local6++) {
				@Pc(17) Class2_Sub13 local17 = this.aClass2_Sub13ArrayArrayArray1[arg0.anInt601][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt2809; local21++) {
						if (local17.aClass16Array3[local21] == arg0) {
							local17.anInt2809--;
							for (local36 = local21; local36 < local17.anInt2809; local36++) {
								local17.aClass16Array3[local36] = local17.aClass16Array3[local36 + 1];
								local17.anIntArray348[local36] = local17.anIntArray348[local36 + 1];
							}
							local17.aClass16Array3[local17.anInt2809] = null;
							break;
						}
					}
					local17.anInt2802 = 0;
					for (local36 = 0; local36 < local17.anInt2809; local36++) {
						local17.anInt2802 |= local17.anIntArray348[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIILclient!ae;Lclient!ae;IIII)V")
	public void method1206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub2 arg4, @OriginalArg(5) Class2_Sub1_Sub2 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class18 local8 = new Class18();
		local8.anInt665 = arg8;
		local8.anInt662 = arg9;
		local8.anInt656 = arg1 * 128 + 64;
		local8.anInt660 = arg2 * 128 + 64;
		local8.anInt667 = arg3;
		local8.aClass2_Sub1_Sub2_2 = arg4;
		local8.aClass2_Sub1_Sub2_3 = arg5;
		local8.anInt654 = arg6;
		local8.anInt653 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass2_Sub13ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass2_Sub13ArrayArrayArray1[local45][arg1][arg2] = new Class2_Sub13(local45, arg1, arg2);
			}
		}
		this.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2].aClass18_1 = local8;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public void method1207(@OriginalArg(0) int arg0) {
		this.anInt1681 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt1687; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt1705; local7++) {
				if (this.aClass2_Sub13ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass2_Sub13ArrayArrayArray1[arg0][local4][local7] = new Class2_Sub13(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "()V")
	public void method1208() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt1682; local1++) {
			for (local4 = 0; local4 < this.anInt1687; local4++) {
				for (local7 = 0; local7 < this.anInt1705; local7++) {
					this.aClass2_Sub13ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static59.anInt1680; local4++) {
			for (local7 = 0; local7 < Static59.anIntArray219[local4]; local7++) {
				Static59.aClass40ArrayArray1[local4][local7] = null;
			}
			Static59.anIntArray219[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt1701; local7++) {
			this.aClass16Array2[local7] = null;
		}
		this.anInt1701 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static59.aClass16Array1.length; local76++) {
			Static59.aClass16Array1[local76] = null;
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(IIIIII)Z")
	private boolean method1210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray6[arg0][local17][local21] == -Static59.anInt1703) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray5[arg0][arg1][arg3] - arg5;
			if (!this.method1204(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method1204(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method1204(local21, local167, local195)) {
				return false;
			} else if (this.method1204(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method1198(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method1204(local17 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg3] - arg5, local21 + 1) && this.method1204(local17 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method1204(local17 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method1204(local17 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!le", name = "o", descriptor = "(III)V")
	public void method1211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub13 local8 = this.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt2809; local13++) {
			@Pc(19) Class16 local19 = local8.aClass16Array3[local13];
			if ((local19.anInt613 >> 29 & 0x3) == 2 && local19.anInt611 == arg1 && local19.anInt593 == arg2) {
				this.method1205(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method1212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class8 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class8(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub13ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub13ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub13(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2].aClass8_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class8(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub13ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub13ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub13(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2].aClass8_1 = local12;
		} else {
			@Pc(140) Class49 local140 = new Class49(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub13ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub13ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub13(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2].aClass49_1 = local140;
		}
	}

	@OriginalMember(owner = "client!le", name = "p", descriptor = "(III)V")
	public void method1214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub13 local8 = this.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass20_1 = null;
		}
	}

	@OriginalMember(owner = "client!le", name = "q", descriptor = "(III)Lclient!de;")
	public Class16 method1215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub13 local8 = this.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt2809; local14++) {
			@Pc(20) Class16 local20 = local8.aClass16Array3[local14];
			if ((local20.anInt613 >> 29 & 0x3) == 2 && local20.anInt611 == arg1 && local20.anInt593 == arg2) {
				return local20;
			}
		}
		return null;
	}
}
