import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class43 {

	@OriginalMember(owner = "client!l", name = "s", descriptor = "[Lclient!v;")
	private final Class69[] aClass69Array2 = new Class69[5000];

	@OriginalMember(owner = "client!l", name = "o", descriptor = "I")
	private int anInt1597 = 0;

	@OriginalMember(owner = "client!l", name = "O", descriptor = "I")
	private int anInt1613 = 0;

	@OriginalMember(owner = "client!l", name = "ib", descriptor = "[[I")
	private final int[][] anIntArrayArray17 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!l", name = "gb", descriptor = "[[I")
	private final int[][] anIntArrayArray16 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!l", name = "e", descriptor = "I")
	private final int anInt1590;

	@OriginalMember(owner = "client!l", name = "p", descriptor = "I")
	private final int anInt1598;

	@OriginalMember(owner = "client!l", name = "j", descriptor = "I")
	private final int anInt1592;

	@OriginalMember(owner = "client!l", name = "u", descriptor = "[[[Lclient!ka;")
	private final Class5_Sub5[][][] aClass5_Sub5ArrayArrayArray1;

	@OriginalMember(owner = "client!l", name = "A", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!l", name = "q", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(III[[[I)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt1590 = arg0;
		this.anInt1598 = arg1;
		this.anInt1592 = arg2;
		this.aClass5_Sub5ArrayArrayArray1 = new Class5_Sub5[arg0][arg1][arg2];
		this.anIntArrayArrayArray5 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray4 = arg3;
		this.method1083();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIILclient!pe;IIIIII)Z")
	public boolean method1055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class5_Sub1_Sub1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method1062(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIILclient!pe;ILclient!pe;Lclient!pe;)V")
	public void method1056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5_Sub1_Sub1 arg6, @OriginalArg(7) Class5_Sub1_Sub1 arg7) {
		@Pc(3) Class16 local3 = new Class16();
		local3.aClass5_Sub1_Sub1_1 = arg4;
		local3.anInt642 = arg1 * 128 + 64;
		local3.anInt645 = arg2 * 128 + 64;
		local3.anInt646 = arg3;
		local3.anInt634 = arg5;
		local3.aClass5_Sub1_Sub1_3 = arg6;
		local3.aClass5_Sub1_Sub1_2 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class5_Sub5 local43 = this.aClass5_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt1514; local47++) {
				if ((local43.aClass69Array1[local47].anInt2679 & 0x100) == 256 && local43.aClass69Array1[local47].aClass5_Sub1_Sub1_8 instanceof Class5_Sub1_Sub1_Sub2) {
					@Pc(71) Class5_Sub1_Sub1_Sub2 local71 = (Class5_Sub1_Sub1_Sub2) local43.aClass69Array1[local47].aClass5_Sub1_Sub1_8;
					local71.method232();
					if (local71.anInt2987 > local34) {
						local34 = local71.anInt2987;
					}
				}
			}
		}
		local3.anInt636 = local34;
		if (this.aClass5_Sub5ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass5_Sub5ArrayArrayArray1[arg0][arg1][arg2] = new Class5_Sub5(arg0, arg1, arg2);
		}
		this.aClass5_Sub5ArrayArrayArray1[arg0][arg1][arg2].aClass16_1 = local3;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method1057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!l", name = "a", descriptor = "()V")
	private void method1058() {
		@Pc(3) int local3 = Static63.anIntArray182[Static63.anInt1603];
		@Pc(7) Class67[] local7 = Static63.aClass67ArrayArray1[Static63.anInt1603];
		Static63.anInt1614 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class67 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt2646 == 1) {
				local27 = local16.anInt2643 + 25 - Static63.anInt1593;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2636 + 25 - Static63.anInt1606;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2638 + 25 - Static63.anInt1606;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static63.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static63.anInt1595 - local16.anInt2640;
						if (local79 > 32) {
							local16.anInt2659 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2659 = 2;
							local79 = -local79;
						}
						local16.anInt2650 = (local16.anInt2634 - Static63.anInt1608 << 8) / local79;
						local16.anInt2632 = (local16.anInt2657 - Static63.anInt1608 << 8) / local79;
						local16.anInt2652 = (local16.anInt2654 - Static63.anInt1594 << 8) / local79;
						local16.anInt2642 = (local16.anInt2639 - Static63.anInt1594 << 8) / local79;
						Static63.aClass67Array1[Static63.anInt1614++] = local16;
					}
				}
			} else if (local16.anInt2646 == 2) {
				local27 = local16.anInt2636 + 25 - Static63.anInt1606;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2643 + 25 - Static63.anInt1593;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2648 + 25 - Static63.anInt1593;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static63.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static63.anInt1608 - local16.anInt2634;
						if (local79 > 32) {
							local16.anInt2659 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2659 = 4;
							local79 = -local79;
						}
						local16.anInt2651 = (local16.anInt2640 - Static63.anInt1595 << 8) / local79;
						local16.anInt2655 = (local16.anInt2637 - Static63.anInt1595 << 8) / local79;
						local16.anInt2652 = (local16.anInt2654 - Static63.anInt1594 << 8) / local79;
						local16.anInt2642 = (local16.anInt2639 - Static63.anInt1594 << 8) / local79;
						Static63.aClass67Array1[Static63.anInt1614++] = local16;
					}
				}
			} else if (local16.anInt2646 == 4) {
				local27 = local16.anInt2654 - Static63.anInt1594;
				if (local27 > 128) {
					local40 = local16.anInt2636 + 25 - Static63.anInt1606;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2638 + 25 - Static63.anInt1606;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt2643 + 25 - Static63.anInt1593;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt2648 + 25 - Static63.anInt1593;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static63.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt2659 = 5;
							local16.anInt2651 = (local16.anInt2640 - Static63.anInt1595 << 8) / local27;
							local16.anInt2655 = (local16.anInt2637 - Static63.anInt1595 << 8) / local27;
							local16.anInt2650 = (local16.anInt2634 - Static63.anInt1608 << 8) / local27;
							local16.anInt2632 = (local16.anInt2657 - Static63.anInt1608 << 8) / local27;
							Static63.aClass67Array1[Static63.anInt1614++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)I")
	public int method1059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class5_Sub5 local8 = this.aClass5_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass22_1 != null && local8.aClass22_1.anInt783 == arg3) {
			return local8.aClass22_1.anInt777 & 0xFF;
		} else if (local8.aClass28_1 != null && local8.aClass28_1.anInt1078 == arg3) {
			return local8.aClass28_1.anInt1073 & 0xFF;
		} else if (local8.aClass41_1 != null && local8.aClass41_1.anInt1541 == arg3) {
			return local8.aClass41_1.anInt1543 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt1514; local56++) {
				if (local8.aClass69Array1[local56].anInt2665 == arg3) {
					return local8.aClass69Array1[local56].anInt2679 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(IIII)V")
	public void method1060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class5_Sub5 local8 = this.aClass5_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass5_Sub5ArrayArrayArray1[arg0][arg1][arg2].anInt1522 = arg3;
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "()V")
	public void method1061() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1613; local1++) {
			@Pc(7) Class69 local7 = this.aClass69Array2[local1];
			this.method1081(local7);
			this.aClass69Array2[local1] = null;
		}
		this.anInt1613 = 0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIILclient!pe;IZII)Z")
	private boolean method1062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class5_Sub1_Sub1 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt1598 || local4 >= this.anInt1592) {
					return false;
				}
				@Pc(28) Class5_Sub5 local28 = this.aClass5_Sub5ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt1514 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class69 local52 = new Class69();
		local52.anInt2665 = arg11;
		local52.anInt2679 = arg12;
		local52.anInt2681 = arg0;
		local52.anInt2675 = arg5;
		local52.anInt2676 = arg6;
		local52.anInt2672 = arg7;
		local52.aClass5_Sub1_Sub1_8 = arg8;
		local52.anInt2674 = arg9;
		local52.anInt2678 = arg1;
		local52.anInt2670 = arg2;
		local52.anInt2671 = arg1 + arg3 - 1;
		local52.anInt2673 = arg2 + arg4 - 1;
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
					if (this.aClass5_Sub5ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass5_Sub5ArrayArrayArray1[local130][local98][local101] = new Class5_Sub5(local130, local98, local101);
					}
				}
				@Pc(166) Class5_Sub5 local166 = this.aClass5_Sub5ArrayArrayArray1[arg0][local98][local101];
				local166.aClass69Array1[local166.anInt1514] = local52;
				local166.anIntArray173[local166.anInt1514] = local104;
				local166.anInt1517 |= local104;
				local166.anInt1514++;
			}
		}
		if (arg10) {
			this.aClass69Array2[this.anInt1613++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method1063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class20 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class20(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass5_Sub5ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass5_Sub5ArrayArrayArray1[local14][arg1][arg2] = new Class5_Sub5(local14, arg1, arg2);
				}
			}
			this.aClass5_Sub5ArrayArrayArray1[arg0][arg1][arg2].aClass20_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class20(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass5_Sub5ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass5_Sub5ArrayArrayArray1[local14][arg1][arg2] = new Class5_Sub5(local14, arg1, arg2);
				}
			}
			this.aClass5_Sub5ArrayArrayArray1[arg0][arg1][arg2].aClass20_1 = local12;
		} else {
			@Pc(140) Class30 local140 = new Class30(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass5_Sub5ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass5_Sub5ArrayArrayArray1[local14][arg1][arg2] = new Class5_Sub5(local14, arg1, arg2);
				}
			}
			this.aClass5_Sub5ArrayArrayArray1[arg0][arg1][arg2].aClass30_1 = local140;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([IIIIII)V")
	public void method1064(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class5_Sub5 local8 = this.aClass5_Sub5ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class20 local14 = local8.aClass20_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt757;
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
		@Pc(59) Class30 local59 = local8.aClass30_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt1088;
		@Pc(68) int local68 = local59.anInt1086;
		@Pc(71) int local71 = local59.anInt1089;
		@Pc(74) int local74 = local59.anInt1087;
		@Pc(79) int[] local79 = this.anIntArrayArray17[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray16[local68];
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

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(III)Lclient!v;")
	public Class69 method1065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub5 local8 = this.aClass5_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt1514; local14++) {
			@Pc(20) Class69 local20 = local8.aClass69Array1[local14];
			if ((local20.anInt2665 >> 29 & 0x3) == 2 && local20.anInt2678 == arg1 && local20.anInt2670 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIILclient!pe;III)Z")
	public boolean method1066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5_Sub1_Sub1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method1062(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(III)Z")
	private boolean method1067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray5[arg0][arg1][arg2];
		if (local8 == -Static63.anInt1611) {
			return false;
		} else if (local8 == Static63.anInt1611) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method1084(local23 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg2], local27 + 1) && this.method1084(local23 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg2], local27 + 1) && this.method1084(local23 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method1084(local23 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray5[arg0][arg1][arg2] = Static63.anInt1611;
				return true;
			} else {
				this.anIntArrayArrayArray5[arg0][arg1][arg2] = -Static63.anInt1611;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(III)I")
	public int method1068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub5 local8 = this.aClass5_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass28_1 == null ? 0 : local8.aClass28_1.anInt1078;
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(III)V")
	public void method1070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub5 local8 = this.aClass5_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass16_1 = null;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!wd;IIIII)V")
	private void method1071(@OriginalArg(0) Class5_Sub1_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt1590) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt1598) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt1592 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class5_Sub5 local66 = this.aClass5_Sub5ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray4[local17][local24][local34] + this.anIntArrayArrayArray4[local17][local24 + 1][local34] + this.anIntArrayArrayArray4[local17][local24][local34 + 1] + this.anIntArrayArrayArray4[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray4[arg1][arg2][arg3] + this.anIntArrayArrayArray4[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray4[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray4[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class22 local163 = local66.aClass22_1;
									if (local163 != null) {
										@Pc(173) Class5_Sub1_Sub1_Sub7 local173;
										if (local163.aClass5_Sub1_Sub1_5 instanceof Class5_Sub1_Sub1_Sub7) {
											local173 = (Class5_Sub1_Sub1_Sub7) local163.aClass5_Sub1_Sub1_5;
											Static120.method1999(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local163.aClass5_Sub1_Sub1_4 instanceof Class5_Sub1_Sub1_Sub7) {
											local173 = (Class5_Sub1_Sub1_Sub7) local163.aClass5_Sub1_Sub1_4;
											Static120.method1999(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(237) int local237 = 0; local237 < local66.anInt1514; local237++) {
										@Pc(243) Class69 local243 = local66.aClass69Array1[local237];
										if (local243 != null && local243.aClass5_Sub1_Sub1_8 instanceof Class5_Sub1_Sub1_Sub7) {
											@Pc(253) Class5_Sub1_Sub1_Sub7 local253 = (Class5_Sub1_Sub1_Sub7) local243.aClass5_Sub1_Sub1_8;
											@Pc(261) int local261 = local243.anInt2671 + 1 - local243.anInt2678;
											@Pc(269) int local269 = local243.anInt2673 + 1 - local243.anInt2670;
											Static120.method1999(arg0, local253, (local243.anInt2678 - arg2) * 128 + (local261 - arg4) * 64, local160, (local243.anInt2670 - arg3) * 128 + (local269 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!l", name = "f", descriptor = "(III)I")
	public int method1072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub5 local8 = this.aClass5_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass22_1 == null ? 0 : local8.aClass22_1.anInt783;
	}

	@OriginalMember(owner = "client!l", name = "g", descriptor = "(III)V")
	public void method1073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub5 local8 = this.aClass5_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass28_1 = null;
		}
	}

	@OriginalMember(owner = "client!l", name = "h", descriptor = "(III)V")
	public void method1075() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1590; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt1598; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt1592; local7++) {
					@Pc(17) Class5_Sub5 local17 = this.aClass5_Sub5ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class22 local22 = local17.aClass22_1;
						if (local22 != null && local22.aClass5_Sub1_Sub1_5 instanceof Class5_Sub1_Sub1_Sub7) {
							@Pc(32) Class5_Sub1_Sub1_Sub7 local32 = (Class5_Sub1_Sub1_Sub7) local22.aClass5_Sub1_Sub1_5;
							this.method1071(local32, local1, local4, local7, 1, 1);
							if (local22.aClass5_Sub1_Sub1_4 instanceof Class5_Sub1_Sub1_Sub7) {
								@Pc(48) Class5_Sub1_Sub1_Sub7 local48 = (Class5_Sub1_Sub1_Sub7) local22.aClass5_Sub1_Sub1_4;
								this.method1071(local48, local1, local4, local7, 1, 1);
								Static120.method1999(local32, local48, 0, 0, 0, false);
								local22.aClass5_Sub1_Sub1_4 = local48.method1987(local48.aShort2, local48.aShort1, -50, -10, -50);
							}
							local22.aClass5_Sub1_Sub1_5 = local32.method1987(local32.aShort2, local32.aShort1, -50, -10, -50);
						}
						@Pc(103) Class5_Sub1_Sub1_Sub7 local103;
						for (@Pc(87) int local87 = 0; local87 < local17.anInt1514; local87++) {
							@Pc(93) Class69 local93 = local17.aClass69Array1[local87];
							if (local93 != null && local93.aClass5_Sub1_Sub1_8 instanceof Class5_Sub1_Sub1_Sub7) {
								local103 = (Class5_Sub1_Sub1_Sub7) local93.aClass5_Sub1_Sub1_8;
								this.method1071(local103, local1, local4, local7, local93.anInt2671 + 1 - local93.anInt2678, local93.anInt2673 - local93.anInt2670 + 1);
								local93.aClass5_Sub1_Sub1_8 = local103.method1987(local103.aShort2, local103.aShort1, -50, -10, -50);
							}
						}
						@Pc(142) Class41 local142 = local17.aClass41_1;
						if (local142 != null && local142.aClass5_Sub1_Sub1_7 instanceof Class5_Sub1_Sub1_Sub7) {
							local103 = (Class5_Sub1_Sub1_Sub7) local142.aClass5_Sub1_Sub1_7;
							this.method1099(local103, local1, local4, local7);
							local142.aClass5_Sub1_Sub1_7 = local103.method1987(local103.aShort2, local103.aShort1, -50, -10, -50);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "i", descriptor = "(III)V")
	public void method1076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub5 local8 = this.aClass5_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass41_1 = null;
		}
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(IIII)V")
	public void method1078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class5_Sub5 local8 = this.aClass5_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class28 local14 = local8.aClass28_1;
		if (local14 != null) {
			@Pc(23) int local23 = arg1 * 128 + 64;
			@Pc(29) int local29 = arg2 * 128 + 64;
			local14.anInt1072 = local23 + (local14.anInt1072 - local23) * arg3 / 16;
			local14.anInt1081 = local29 + (local14.anInt1081 - local29) * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!l", name = "j", descriptor = "(III)I")
	public int method1079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub5 local8 = this.aClass5_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt1514; local14++) {
			@Pc(20) Class69 local20 = local8.aClass69Array1[local14];
			if ((local20.anInt2665 >> 29 & 0x3) == 2 && local20.anInt2678 == arg1 && local20.anInt2670 == arg2) {
				return local20.anInt2665;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIILclient!pe;II)V")
	public void method1080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class41 local6 = new Class41();
		local6.aClass5_Sub1_Sub1_7 = arg4;
		local6.anInt1548 = arg1 * 128 + 64;
		local6.anInt1549 = arg2 * 128 + 64;
		local6.anInt1542 = arg3;
		local6.anInt1541 = arg5;
		local6.anInt1543 = arg6;
		if (this.aClass5_Sub5ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass5_Sub5ArrayArrayArray1[arg0][arg1][arg2] = new Class5_Sub5(arg0, arg1, arg2);
		}
		this.aClass5_Sub5ArrayArrayArray1[arg0][arg1][arg2].aClass41_1 = local6;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!v;)V")
	private void method1081(@OriginalArg(0) Class69 arg0) {
		for (@Pc(2) int local2 = arg0.anInt2678; local2 <= arg0.anInt2671; local2++) {
			for (@Pc(6) int local6 = arg0.anInt2670; local6 <= arg0.anInt2673; local6++) {
				@Pc(17) Class5_Sub5 local17 = this.aClass5_Sub5ArrayArrayArray1[arg0.anInt2681][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt1514; local21++) {
						if (local17.aClass69Array1[local21] == arg0) {
							local17.anInt1514--;
							for (local36 = local21; local36 < local17.anInt1514; local36++) {
								local17.aClass69Array1[local36] = local17.aClass69Array1[local36 + 1];
								local17.anIntArray173[local36] = local17.anIntArray173[local36 + 1];
							}
							local17.aClass69Array1[local17.anInt1514] = null;
							break;
						}
					}
					local17.anInt1517 = 0;
					for (local36 = 0; local36 < local17.anInt1514; local36++) {
						local17.anInt1517 |= local17.anIntArray173[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(IIII)Z")
	private boolean method1082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method1067(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method1084(local11 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg2] - arg3, local15 + 1) && this.method1084(local11 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method1084(local11 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method1084(local11 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "()V")
	public void method1083() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt1590; local1++) {
			for (local4 = 0; local4 < this.anInt1598; local4++) {
				for (local7 = 0; local7 < this.anInt1592; local7++) {
					this.aClass5_Sub5ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static63.anInt1607; local4++) {
			for (local7 = 0; local7 < Static63.anIntArray182[local4]; local7++) {
				Static63.aClass67ArrayArray1[local4][local7] = null;
			}
			Static63.anIntArray182[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt1613; local7++) {
			this.aClass69Array2[local7] = null;
		}
		this.anInt1613 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static63.aClass69Array3.length; local76++) {
			Static63.aClass69Array3[local76] = null;
		}
	}

	@OriginalMember(owner = "client!l", name = "k", descriptor = "(III)Z")
	private boolean method1084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static63.anInt1614; local1++) {
			@Pc(6) Class67 local6 = Static63.aClass67Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt2659 == 1) {
				local15 = local6.anInt2640 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt2634 + (local6.anInt2650 * local15 >> 8);
					local37 = local6.anInt2657 + (local6.anInt2632 * local15 >> 8);
					local47 = local6.anInt2654 + (local6.anInt2652 * local15 >> 8);
					local57 = local6.anInt2639 + (local6.anInt2642 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2659 == 2) {
				local15 = arg0 - local6.anInt2640;
				if (local15 > 0) {
					local27 = local6.anInt2634 + (local6.anInt2650 * local15 >> 8);
					local37 = local6.anInt2657 + (local6.anInt2632 * local15 >> 8);
					local47 = local6.anInt2654 + (local6.anInt2652 * local15 >> 8);
					local57 = local6.anInt2639 + (local6.anInt2642 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2659 == 3) {
				local15 = local6.anInt2634 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt2640 + (local6.anInt2651 * local15 >> 8);
					local37 = local6.anInt2637 + (local6.anInt2655 * local15 >> 8);
					local47 = local6.anInt2654 + (local6.anInt2652 * local15 >> 8);
					local57 = local6.anInt2639 + (local6.anInt2642 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2659 == 4) {
				local15 = arg2 - local6.anInt2634;
				if (local15 > 0) {
					local27 = local6.anInt2640 + (local6.anInt2651 * local15 >> 8);
					local37 = local6.anInt2637 + (local6.anInt2655 * local15 >> 8);
					local47 = local6.anInt2654 + (local6.anInt2652 * local15 >> 8);
					local57 = local6.anInt2639 + (local6.anInt2642 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2659 == 5) {
				local15 = arg1 - local6.anInt2654;
				if (local15 > 0) {
					local27 = local6.anInt2640 + (local6.anInt2651 * local15 >> 8);
					local37 = local6.anInt2637 + (local6.anInt2655 * local15 >> 8);
					local47 = local6.anInt2634 + (local6.anInt2650 * local15 >> 8);
					local57 = local6.anInt2657 + (local6.anInt2632 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!hc;IIIIII)V")
	private void method1085(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray128.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray128[local5] - Static63.anInt1595;
			local20 = arg0.anIntArray123[local5] - Static63.anInt1594;
			local27 = arg0.anIntArray127[local5] - Static63.anInt1608;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray137 != null) {
				Static45.anIntArray130[local5] = local37;
				Static45.anIntArray125[local5] = local59;
				Static45.anIntArray132[local5] = local69;
			}
			Static45.anIntArray126[local5] = Static80.anInt1969 + (local37 << 9) / local69;
			Static45.anIntArray124[local5] = Static80.anInt1972 + (local59 << 9) / local69;
		}
		Static80.anInt1971 = 0;
		local3 = arg0.anIntArray135.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray135[local13];
			local27 = arg0.anIntArray136[local13];
			local37 = arg0.anIntArray133[local13];
			@Pc(142) int local142 = Static45.anIntArray126[local20];
			@Pc(146) int local146 = Static45.anIntArray126[local27];
			@Pc(150) int local150 = Static45.anIntArray126[local37];
			@Pc(154) int local154 = Static45.anIntArray124[local20];
			@Pc(158) int local158 = Static45.anIntArray124[local27];
			@Pc(162) int local162 = Static45.anIntArray124[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static80.aBoolean94 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static80.anInt1968 || local146 > Static80.anInt1968 || local150 > Static80.anInt1968) {
					Static80.aBoolean94 = true;
				}
				if (Static63.aBoolean68 && this.method1057(Static63.anInt1605, Static63.anInt1600, local154, local158, local162, local142, local146, local150)) {
					Static63.anInt1599 = arg5;
					Static63.anInt1589 = arg6;
				}
				if (arg0.anIntArray137 == null || arg0.anIntArray137[local13] == -1) {
					if (arg0.anIntArray131[local13] != 12345678) {
						Static80.method1326(local154, local158, local162, local142, local146, local150, arg0.anIntArray131[local13], arg0.anIntArray134[local13], arg0.anIntArray129[local13]);
					}
				} else if (Static63.aBoolean69) {
					@Pc(364) int local364 = Static80.anInterface3_1.method7(arg0.anIntArray137[local13]);
					Static80.method1326(local154, local158, local162, local142, local146, local150, Static63.method1097(local364, arg0.anIntArray131[local13]), Static63.method1097(local364, arg0.anIntArray134[local13]), Static63.method1097(local364, arg0.anIntArray129[local13]));
				} else if (arg0.aBoolean48) {
					Static80.method1324(local154, local158, local162, local142, local146, local150, arg0.anIntArray131[local13], arg0.anIntArray134[local13], arg0.anIntArray129[local13], Static45.anIntArray130[0], Static45.anIntArray130[1], Static45.anIntArray130[3], Static45.anIntArray125[0], Static45.anIntArray125[1], Static45.anIntArray125[3], Static45.anIntArray132[0], Static45.anIntArray132[1], Static45.anIntArray132[3], arg0.anIntArray137[local13]);
				} else {
					Static80.method1324(local154, local158, local162, local142, local146, local150, arg0.anIntArray131[local13], arg0.anIntArray134[local13], arg0.anIntArray129[local13], Static45.anIntArray130[local20], Static45.anIntArray130[local27], Static45.anIntArray130[local37], Static45.anIntArray125[local20], Static45.anIntArray125[local27], Static45.anIntArray125[local37], Static45.anIntArray132[local20], Static45.anIntArray132[local27], Static45.anIntArray132[local37], arg0.anIntArray137[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIILclient!pe;Lclient!pe;IIII)V")
	public void method1086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5_Sub1_Sub1 arg4, @OriginalArg(5) Class5_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class22 local8 = new Class22();
		local8.anInt783 = arg8;
		local8.anInt777 = arg9;
		local8.anInt775 = arg1 * 128 + 64;
		local8.anInt782 = arg2 * 128 + 64;
		local8.anInt784 = arg3;
		local8.aClass5_Sub1_Sub1_5 = arg4;
		local8.aClass5_Sub1_Sub1_4 = arg5;
		local8.anInt773 = arg6;
		local8.anInt780 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass5_Sub5ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass5_Sub5ArrayArrayArray1[local45][arg1][arg2] = new Class5_Sub5(local45, arg1, arg2);
			}
		}
		this.aClass5_Sub5ArrayArrayArray1[arg0][arg1][arg2].aClass22_1 = local8;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ka;Z)V")
	private void method1087(@OriginalArg(0) Class5_Sub5 arg0, @OriginalArg(1) boolean arg1) {
		Static63.aClass52_7.method1362(arg0);
		while (true) {
			@Pc(8) Class5_Sub5 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class5_Sub5[][] local31;
			@Pc(49) Class5_Sub5 local49;
			@Pc(251) int local251;
			@Pc(578) int local578;
			@Pc(583) int local583;
			@Pc(588) int local588;
			@Pc(591) int local591;
			@Pc(600) int local600;
			@Pc(942) Class22 local942;
			@Pc(1116) int local1116;
			@Pc(1001) int local1001;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class69 var12;
										@Pc(612) int var19;
										@Pc(335) int var23;
										@Pc(289) boolean var24;
										@Pc(823) Class5_Sub5 var35;
										while (true) {
											do {
												local8 = (Class5_Sub5) Static63.aClass52_7.method1355();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean65);
											local17 = local8.anInt1524;
											local20 = local8.anInt1528;
											local23 = local8.anInt1530;
											local26 = local8.anInt1527;
											local31 = this.aClass5_Sub5ArrayArrayArray1[local23];
											if (!local8.aBoolean63) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass5_Sub5ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean65) {
														continue;
													}
												}
												if (local17 <= Static63.anInt1593 && local17 > Static63.anInt1610) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean65 && (local49.aBoolean63 || (local8.anInt1517 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static63.anInt1593 && local17 < Static63.anInt1609 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean65 && (local49.aBoolean63 || (local8.anInt1517 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static63.anInt1606 && local20 > Static63.anInt1604) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean65 && (local49.aBoolean63 || (local8.anInt1517 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static63.anInt1606 && local20 < Static63.anInt1601 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean65 && (local49.aBoolean63 || (local8.anInt1517 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean63 = false;
											if (local8.aClass5_Sub5_1 != null) {
												local49 = local8.aClass5_Sub5_1;
												if (local49.aClass20_1 == null) {
													if (local49.aClass30_1 != null && !this.method1067(0, local17, local20)) {
														this.method1085(local49.aClass30_1, Static63.anInt1588, Static63.anInt1591, Static63.anInt1596, Static63.anInt1602, local17, local20);
													}
												} else if (!this.method1067(0, local17, local20)) {
													this.method1105(local49.aClass20_1, 0, Static63.anInt1588, Static63.anInt1591, Static63.anInt1596, Static63.anInt1602, local17, local20);
												}
												@Pc(225) Class22 local225 = local49.aClass22_1;
												if (local225 != null) {
													local225.aClass5_Sub1_Sub1_5.method1977(0, Static63.anInt1588, Static63.anInt1591, Static63.anInt1596, Static63.anInt1602, local225.anInt775 - Static63.anInt1595, local225.anInt784 - Static63.anInt1594, local225.anInt782 - Static63.anInt1608, local225.anInt783);
												}
												for (local251 = 0; local251 < local49.anInt1514; local251++) {
													var12 = local49.aClass69Array1[local251];
													if (var12 != null) {
														var12.aClass5_Sub1_Sub1_8.method1977(var12.anInt2674, Static63.anInt1588, Static63.anInt1591, Static63.anInt1596, Static63.anInt1602, var12.anInt2675 - Static63.anInt1595, var12.anInt2672 - Static63.anInt1594, var12.anInt2676 - Static63.anInt1608, var12.anInt2665);
													}
												}
											}
											var24 = false;
											if (local8.aClass20_1 == null) {
												if (local8.aClass30_1 != null && !this.method1067(local26, local17, local20)) {
													var24 = true;
													this.method1085(local8.aClass30_1, Static63.anInt1588, Static63.anInt1591, Static63.anInt1596, Static63.anInt1602, local17, local20);
												}
											} else if (!this.method1067(local26, local17, local20)) {
												var24 = true;
												this.method1105(local8.aClass20_1, local26, Static63.anInt1588, Static63.anInt1591, Static63.anInt1596, Static63.anInt1602, local17, local20);
											}
											var23 = 0;
											local251 = 0;
											@Pc(340) Class22 local340 = local8.aClass22_1;
											@Pc(343) Class28 local343 = local8.aClass28_1;
											if (local340 != null || local343 != null) {
												if (Static63.anInt1593 == local17) {
													var23++;
												} else if (Static63.anInt1593 < local17) {
													var23 += 2;
												}
												if (Static63.anInt1606 == local20) {
													var23 += 3;
												} else if (Static63.anInt1606 > local20) {
													var23 += 6;
												}
												local251 = Static63.anIntArray186[var23];
												local8.anInt1526 = Static63.anIntArray184[var23];
											}
											if (local340 != null) {
												if ((local340.anInt773 & Static63.anIntArray185[var23]) == 0) {
													local8.anInt1519 = 0;
												} else if (local340.anInt773 == 16) {
													local8.anInt1519 = 3;
													local8.anInt1525 = Static63.anIntArray187[var23];
													local8.anInt1518 = 3 - local8.anInt1525;
												} else if (local340.anInt773 == 32) {
													local8.anInt1519 = 6;
													local8.anInt1525 = Static63.anIntArray188[var23];
													local8.anInt1518 = 6 - local8.anInt1525;
												} else if (local340.anInt773 == 64) {
													local8.anInt1519 = 12;
													local8.anInt1525 = Static63.anIntArray189[var23];
													local8.anInt1518 = 12 - local8.anInt1525;
												} else {
													local8.anInt1519 = 9;
													local8.anInt1525 = Static63.anIntArray190[var23];
													local8.anInt1518 = 9 - local8.anInt1525;
												}
												if ((local340.anInt773 & local251) != 0 && !this.method1090(local26, local17, local20, local340.anInt773)) {
													local340.aClass5_Sub1_Sub1_5.method1977(0, Static63.anInt1588, Static63.anInt1591, Static63.anInt1596, Static63.anInt1602, local340.anInt775 - Static63.anInt1595, local340.anInt784 - Static63.anInt1594, local340.anInt782 - Static63.anInt1608, local340.anInt783);
												}
												if ((local340.anInt780 & local251) != 0 && !this.method1090(local26, local17, local20, local340.anInt780)) {
													local340.aClass5_Sub1_Sub1_4.method1977(0, Static63.anInt1588, Static63.anInt1591, Static63.anInt1596, Static63.anInt1602, local340.anInt775 - Static63.anInt1595, local340.anInt784 - Static63.anInt1594, local340.anInt782 - Static63.anInt1608, local340.anInt783);
												}
											}
											if (local343 != null && !this.method1082(local26, local17, local20, local343.aClass5_Sub1_Sub1_6.anInt2987)) {
												if ((local343.anInt1076 & local251) != 0) {
													local343.aClass5_Sub1_Sub1_6.method1977(local343.anInt1077, Static63.anInt1588, Static63.anInt1591, Static63.anInt1596, Static63.anInt1602, local343.anInt1072 - Static63.anInt1595, local343.anInt1071 - Static63.anInt1594, local343.anInt1081 - Static63.anInt1608, local343.anInt1078);
												} else if ((local343.anInt1076 & 0x300) != 0) {
													local578 = local343.anInt1072 - Static63.anInt1595;
													local583 = local343.anInt1071 - Static63.anInt1594;
													local588 = local343.anInt1081 - Static63.anInt1608;
													local591 = local343.anInt1077;
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
													if ((local343.anInt1076 & 0x100) != 0 && var19 < local600) {
														local629 = local578 + Static63.anIntArray181[local591];
														local635 = local588 + Static63.anIntArray180[local591];
														local343.aClass5_Sub1_Sub1_6.method1977(local591 * 512 + 256, Static63.anInt1588, Static63.anInt1591, Static63.anInt1596, Static63.anInt1602, local629, local583, local635, local343.anInt1078);
													}
													if ((local343.anInt1076 & 0x200) != 0 && var19 > local600) {
														local629 = local578 + Static63.anIntArray183[local591];
														local635 = local588 + Static63.anIntArray179[local591];
														local343.aClass5_Sub1_Sub1_6.method1977(local591 * 512 + 1280 & 0x7FF, Static63.anInt1588, Static63.anInt1591, Static63.anInt1596, Static63.anInt1602, local629, local583, local635, local343.anInt1078);
													}
												}
											}
											if (var24) {
												@Pc(696) Class41 local696 = local8.aClass41_1;
												if (local696 != null) {
													local696.aClass5_Sub1_Sub1_7.method1977(0, Static63.anInt1588, Static63.anInt1591, Static63.anInt1596, Static63.anInt1602, local696.anInt1548 - Static63.anInt1595, local696.anInt1542 - Static63.anInt1594, local696.anInt1549 - Static63.anInt1608, local696.anInt1541);
												}
												@Pc(723) Class16 local723 = local8.aClass16_1;
												if (local723 != null && local723.anInt636 == 0) {
													if (local723.aClass5_Sub1_Sub1_3 != null) {
														local723.aClass5_Sub1_Sub1_3.method1977(0, Static63.anInt1588, Static63.anInt1591, Static63.anInt1596, Static63.anInt1602, local723.anInt642 - Static63.anInt1595, local723.anInt646 - Static63.anInt1594, local723.anInt645 - Static63.anInt1608, local723.anInt634);
													}
													if (local723.aClass5_Sub1_Sub1_2 != null) {
														local723.aClass5_Sub1_Sub1_2.method1977(0, Static63.anInt1588, Static63.anInt1591, Static63.anInt1596, Static63.anInt1602, local723.anInt642 - Static63.anInt1595, local723.anInt646 - Static63.anInt1594, local723.anInt645 - Static63.anInt1608, local723.anInt634);
													}
													if (local723.aClass5_Sub1_Sub1_1 != null) {
														local723.aClass5_Sub1_Sub1_1.method1977(0, Static63.anInt1588, Static63.anInt1591, Static63.anInt1596, Static63.anInt1602, local723.anInt642 - Static63.anInt1595, local723.anInt646 - Static63.anInt1594, local723.anInt645 - Static63.anInt1608, local723.anInt634);
													}
												}
											}
											local578 = local8.anInt1517;
											if (local578 != 0) {
												if (local17 < Static63.anInt1593 && (local578 & 0x4) != 0) {
													var35 = local31[local17 + 1][local20];
													if (var35 != null && var35.aBoolean65) {
														Static63.aClass52_7.method1362(var35);
													}
												}
												if (local20 < Static63.anInt1606 && (local578 & 0x2) != 0) {
													var35 = local31[local17][local20 + 1];
													if (var35 != null && var35.aBoolean65) {
														Static63.aClass52_7.method1362(var35);
													}
												}
												if (local17 > Static63.anInt1593 && (local578 & 0x1) != 0) {
													var35 = local31[local17 - 1][local20];
													if (var35 != null && var35.aBoolean65) {
														Static63.aClass52_7.method1362(var35);
													}
												}
												if (local20 > Static63.anInt1606 && (local578 & 0x8) != 0) {
													var35 = local31[local17][local20 - 1];
													if (var35 != null && var35.aBoolean65) {
														Static63.aClass52_7.method1362(var35);
													}
												}
											}
											break;
										}
										if (local8.anInt1519 != 0) {
											var24 = true;
											for (var23 = 0; var23 < local8.anInt1514; var23++) {
												if (local8.aClass69Array1[var23].anInt2664 != Static63.anInt1611 && (local8.anIntArray173[var23] & local8.anInt1519) == local8.anInt1525) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												local942 = local8.aClass22_1;
												if (!this.method1090(local26, local17, local20, local942.anInt773)) {
													local942.aClass5_Sub1_Sub1_5.method1977(0, Static63.anInt1588, Static63.anInt1591, Static63.anInt1596, Static63.anInt1602, local942.anInt775 - Static63.anInt1595, local942.anInt784 - Static63.anInt1594, local942.anInt782 - Static63.anInt1608, local942.anInt783);
												}
												local8.anInt1519 = 0;
											}
										}
										if (!local8.aBoolean64) {
											break;
										}
										try {
											@Pc(981) int local981 = local8.anInt1514;
											local8.aBoolean64 = false;
											var23 = 0;
											label559: for (local251 = 0; local251 < local981; local251++) {
												var12 = local8.aClass69Array1[local251];
												if (var12.anInt2664 != Static63.anInt1611) {
													for (local1001 = var12.anInt2678; local1001 <= var12.anInt2671; local1001++) {
														for (local578 = var12.anInt2670; local578 <= var12.anInt2673; local578++) {
															var35 = local31[local1001][local578];
															if (var35.aBoolean63) {
																local8.aBoolean64 = true;
																continue label559;
															}
															if (var35.anInt1519 != 0) {
																local588 = 0;
																if (local1001 > var12.anInt2678) {
																	local588++;
																}
																if (local1001 < var12.anInt2671) {
																	local588 += 4;
																}
																if (local578 > var12.anInt2670) {
																	local588 += 8;
																}
																if (local578 < var12.anInt2673) {
																	local588 += 2;
																}
																if ((local588 & var35.anInt1519) == local8.anInt1518) {
																	local8.aBoolean64 = true;
																	continue label559;
																}
															}
														}
													}
													Static63.aClass69Array3[var23++] = var12;
													local578 = Static63.anInt1593 - var12.anInt2678;
													local583 = var12.anInt2671 - Static63.anInt1593;
													if (local583 > local578) {
														local578 = local583;
													}
													local588 = Static63.anInt1606 - var12.anInt2670;
													local591 = var12.anInt2673 - Static63.anInt1606;
													if (local591 > local588) {
														var12.anInt2669 = local578 + local591;
													} else {
														var12.anInt2669 = local578 + local588;
													}
												}
											}
											while (var23 > 0) {
												local1116 = -50;
												local1001 = -1;
												@Pc(1125) Class69 local1125;
												for (local578 = 0; local578 < var23; local578++) {
													local1125 = Static63.aClass69Array3[local578];
													if (local1125.anInt2664 != Static63.anInt1611) {
														if (local1125.anInt2669 > local1116) {
															local1116 = local1125.anInt2669;
															local1001 = local578;
														} else if (local1125.anInt2669 == local1116) {
															local588 = local1125.anInt2675 - Static63.anInt1595;
															local591 = local1125.anInt2676 - Static63.anInt1608;
															local600 = Static63.aClass69Array3[local1001].anInt2675 - Static63.anInt1595;
															var19 = Static63.aClass69Array3[local1001].anInt2676 - Static63.anInt1608;
															if (local588 * local588 + local591 * local591 > local600 * local600 + var19 * var19) {
																local1001 = local578;
															}
														}
													}
												}
												if (local1001 == -1) {
													break;
												}
												local1125 = Static63.aClass69Array3[local1001];
												local1125.anInt2664 = Static63.anInt1611;
												if (!this.method1100(local26, local1125.anInt2678, local1125.anInt2671, local1125.anInt2670, local1125.anInt2673, local1125.aClass5_Sub1_Sub1_8.anInt2987)) {
													local1125.aClass5_Sub1_Sub1_8.method1977(local1125.anInt2674, Static63.anInt1588, Static63.anInt1591, Static63.anInt1596, Static63.anInt1602, local1125.anInt2675 - Static63.anInt1595, local1125.anInt2672 - Static63.anInt1594, local1125.anInt2676 - Static63.anInt1608, local1125.anInt2665);
												}
												for (local588 = local1125.anInt2678; local588 <= local1125.anInt2671; local588++) {
													for (local591 = local1125.anInt2670; local591 <= local1125.anInt2673; local591++) {
														@Pc(1250) Class5_Sub5 local1250 = local31[local588][local591];
														if (local1250.anInt1519 != 0) {
															Static63.aClass52_7.method1362(local1250);
														} else if ((local588 != local17 || local591 != local20) && local1250.aBoolean65) {
															Static63.aClass52_7.method1362(local1250);
														}
													}
												}
											}
											if (!local8.aBoolean64) {
												break;
											}
										} catch (@Pc(1288) Exception local1288) {
											local8.aBoolean64 = false;
											break;
										}
									}
								} while (!local8.aBoolean65);
							} while (local8.anInt1519 != 0);
							if (local17 > Static63.anInt1593 || local17 <= Static63.anInt1610) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean65);
						if (local17 < Static63.anInt1593 || local17 >= Static63.anInt1609 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean65);
					if (local20 > Static63.anInt1606 || local20 <= Static63.anInt1604) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean65);
				if (local20 < Static63.anInt1606 || local20 >= Static63.anInt1601 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean65);
			local8.aBoolean65 = false;
			Static63.anInt1612--;
			@Pc(1392) Class16 local1392 = local8.aClass16_1;
			if (local1392 != null && local1392.anInt636 != 0) {
				if (local1392.aClass5_Sub1_Sub1_3 != null) {
					local1392.aClass5_Sub1_Sub1_3.method1977(0, Static63.anInt1588, Static63.anInt1591, Static63.anInt1596, Static63.anInt1602, local1392.anInt642 - Static63.anInt1595, local1392.anInt646 - Static63.anInt1594 - local1392.anInt636, local1392.anInt645 - Static63.anInt1608, local1392.anInt634);
				}
				if (local1392.aClass5_Sub1_Sub1_2 != null) {
					local1392.aClass5_Sub1_Sub1_2.method1977(0, Static63.anInt1588, Static63.anInt1591, Static63.anInt1596, Static63.anInt1602, local1392.anInt642 - Static63.anInt1595, local1392.anInt646 - Static63.anInt1594 - local1392.anInt636, local1392.anInt645 - Static63.anInt1608, local1392.anInt634);
				}
				if (local1392.aClass5_Sub1_Sub1_1 != null) {
					local1392.aClass5_Sub1_Sub1_1.method1977(0, Static63.anInt1588, Static63.anInt1591, Static63.anInt1596, Static63.anInt1602, local1392.anInt642 - Static63.anInt1595, local1392.anInt646 - Static63.anInt1594 - local1392.anInt636, local1392.anInt645 - Static63.anInt1608, local1392.anInt634);
				}
			}
			if (local8.anInt1526 != 0) {
				@Pc(1487) Class28 local1487 = local8.aClass28_1;
				if (local1487 != null && !this.method1082(local26, local17, local20, local1487.aClass5_Sub1_Sub1_6.anInt2987)) {
					if ((local1487.anInt1076 & local8.anInt1526) != 0) {
						local1487.aClass5_Sub1_Sub1_6.method1977(local1487.anInt1077, Static63.anInt1588, Static63.anInt1591, Static63.anInt1596, Static63.anInt1602, local1487.anInt1072 - Static63.anInt1595, local1487.anInt1071 - Static63.anInt1594, local1487.anInt1081 - Static63.anInt1608, local1487.anInt1078);
					} else if ((local1487.anInt1076 & 0x300) != 0) {
						local251 = local1487.anInt1072 - Static63.anInt1595;
						local1116 = local1487.anInt1071 - Static63.anInt1594;
						local1001 = local1487.anInt1081 - Static63.anInt1608;
						local578 = local1487.anInt1077;
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
						if ((local1487.anInt1076 & 0x100) != 0 && local588 >= local583) {
							local591 = local251 + Static63.anIntArray181[local578];
							local600 = local1001 + Static63.anIntArray180[local578];
							local1487.aClass5_Sub1_Sub1_6.method1977(local578 * 512 + 256, Static63.anInt1588, Static63.anInt1591, Static63.anInt1596, Static63.anInt1602, local591, local1116, local600, local1487.anInt1078);
						}
						if ((local1487.anInt1076 & 0x200) != 0 && local588 <= local583) {
							local591 = local251 + Static63.anIntArray183[local578];
							local600 = local1001 + Static63.anIntArray179[local578];
							local1487.aClass5_Sub1_Sub1_6.method1977(local578 * 512 + 1280 & 0x7FF, Static63.anInt1588, Static63.anInt1591, Static63.anInt1596, Static63.anInt1602, local591, local1116, local600, local1487.anInt1078);
						}
					}
				}
				local942 = local8.aClass22_1;
				if (local942 != null) {
					if ((local942.anInt780 & local8.anInt1526) != 0 && !this.method1090(local26, local17, local20, local942.anInt780)) {
						local942.aClass5_Sub1_Sub1_4.method1977(0, Static63.anInt1588, Static63.anInt1591, Static63.anInt1596, Static63.anInt1602, local942.anInt775 - Static63.anInt1595, local942.anInt784 - Static63.anInt1594, local942.anInt782 - Static63.anInt1608, local942.anInt783);
					}
					if ((local942.anInt773 & local8.anInt1526) != 0 && !this.method1090(local26, local17, local20, local942.anInt773)) {
						local942.aClass5_Sub1_Sub1_5.method1977(0, Static63.anInt1588, Static63.anInt1591, Static63.anInt1596, Static63.anInt1602, local942.anInt775 - Static63.anInt1595, local942.anInt784 - Static63.anInt1594, local942.anInt782 - Static63.anInt1608, local942.anInt783);
					}
				}
			}
			@Pc(1745) Class5_Sub5 local1745;
			if (local23 < this.anInt1590 - 1) {
				local1745 = this.aClass5_Sub5ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1745 != null && local1745.aBoolean65) {
					Static63.aClass52_7.method1362(local1745);
				}
			}
			if (local17 < Static63.anInt1593) {
				local1745 = local31[local17 + 1][local20];
				if (local1745 != null && local1745.aBoolean65) {
					Static63.aClass52_7.method1362(local1745);
				}
			}
			if (local20 < Static63.anInt1606) {
				local1745 = local31[local17][local20 + 1];
				if (local1745 != null && local1745.aBoolean65) {
					Static63.aClass52_7.method1362(local1745);
				}
			}
			if (local17 > Static63.anInt1593) {
				local1745 = local31[local17 - 1][local20];
				if (local1745 != null && local1745.aBoolean65) {
					Static63.aClass52_7.method1362(local1745);
				}
			}
			if (local20 > Static63.anInt1606) {
				local1745 = local31[local17][local20 - 1];
				if (local1745 != null && local1745.aBoolean65) {
					Static63.aClass52_7.method1362(local1745);
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V")
	public void method1088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static63.aBoolean68 = true;
		Static63.anInt1605 = arg0;
		Static63.anInt1600 = arg1;
		Static63.anInt1599 = -1;
		Static63.anInt1589 = -1;
	}

	@OriginalMember(owner = "client!l", name = "l", descriptor = "(III)Lclient!h;")
	public Class28 method1089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub5 local8 = this.aClass5_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass28_1;
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(IIII)Z")
	private boolean method1090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method1067(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(11) int local11 = arg1 << 7;
		@Pc(15) int local15 = arg2 << 7;
		@Pc(26) int local26 = this.anIntArrayArrayArray4[arg0][arg1][arg2] - 1;
		@Pc(30) int local30 = local26 - 120;
		@Pc(34) int local34 = local26 - 230;
		@Pc(38) int local38 = local26 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local11 > Static63.anInt1595) {
					if (!this.method1084(local11, local26, local15)) {
						return false;
					}
					if (!this.method1084(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1084(local11, local30, local15)) {
						return false;
					}
					if (!this.method1084(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1084(local11, local34, local15)) {
					return false;
				}
				if (!this.method1084(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static63.anInt1608) {
					if (!this.method1084(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method1084(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1084(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method1084(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1084(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method1084(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static63.anInt1595) {
					if (!this.method1084(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method1084(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1084(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method1084(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1084(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method1084(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static63.anInt1608) {
					if (!this.method1084(local11, local26, local15)) {
						return false;
					}
					if (!this.method1084(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1084(local11, local30, local15)) {
						return false;
					}
					if (!this.method1084(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method1084(local11, local34, local15)) {
					return false;
				}
				if (!this.method1084(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method1084(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method1084(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method1084(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method1084(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method1084(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!l", name = "m", descriptor = "(III)Lclient!ef;")
	public Class22 method1091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub5 local8 = this.aClass5_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass22_1;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(II)V")
	public void method1092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class5_Sub5 local8 = this.aClass5_Sub5ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class5_Sub5 local31 = this.aClass5_Sub5ArrayArrayArray1[local10][arg0][arg1] = this.aClass5_Sub5ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt1530--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt1514; local41++) {
					@Pc(47) Class69 local47 = local31.aClass69Array1[local41];
					if ((local47.anInt2665 >> 29 & 0x3) == 2 && local47.anInt2678 == arg0 && local47.anInt2670 == arg1) {
						local47.anInt2681--;
					}
				}
			}
		}
		if (this.aClass5_Sub5ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass5_Sub5ArrayArrayArray1[0][arg0][arg1] = new Class5_Sub5(0, arg0, arg1);
		}
		this.aClass5_Sub5ArrayArrayArray1[0][arg0][arg1].aClass5_Sub5_1 = local8;
		this.aClass5_Sub5ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!l", name = "n", descriptor = "(III)V")
	public void method1093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub5 local8 = this.aClass5_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass22_1 = null;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIILclient!pe;IIZ)Z")
	public boolean method1094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class5_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method1062(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIILclient!pe;IIIIII)V")
	public void method1095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class28 local6 = new Class28();
		local6.anInt1078 = arg9;
		local6.anInt1073 = arg10;
		local6.anInt1072 = arg1 * 128 + arg7 + 64;
		local6.anInt1081 = arg2 * 128 + arg8 + 64;
		local6.anInt1071 = arg3;
		local6.aClass5_Sub1_Sub1_6 = arg4;
		local6.anInt1076 = arg5;
		local6.anInt1077 = arg6;
		for (@Pc(44) int local44 = arg0; local44 >= 0; local44--) {
			if (this.aClass5_Sub5ArrayArrayArray1[local44][arg1][arg2] == null) {
				this.aClass5_Sub5ArrayArrayArray1[local44][arg1][arg2] = new Class5_Sub5(local44, arg1, arg2);
			}
		}
		this.aClass5_Sub5ArrayArrayArray1[arg0][arg1][arg2].aClass28_1 = local6;
	}

	@OriginalMember(owner = "client!l", name = "o", descriptor = "(III)I")
	public int method1098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub5 local8 = this.aClass5_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass41_1 == null ? 0 : local8.aClass41_1.anInt1541;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!wd;III)V")
	private void method1099(@OriginalArg(0) Class5_Sub1_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class5_Sub5 local14;
		@Pc(29) Class5_Sub1_Sub1_Sub7 local29;
		if (arg2 < this.anInt1598) {
			local14 = this.aClass5_Sub5ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass41_1 != null && local14.aClass41_1.aClass5_Sub1_Sub1_7 instanceof Class5_Sub1_Sub1_Sub7) {
				local29 = (Class5_Sub1_Sub1_Sub7) local14.aClass41_1.aClass5_Sub1_Sub1_7;
				Static120.method1999(arg0, local29, 128, 0, 0, true);
			}
		}
		if (arg3 < this.anInt1598) {
			local14 = this.aClass5_Sub5ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass41_1 != null && local14.aClass41_1.aClass5_Sub1_Sub1_7 instanceof Class5_Sub1_Sub1_Sub7) {
				local29 = (Class5_Sub1_Sub1_Sub7) local14.aClass41_1.aClass5_Sub1_Sub1_7;
				Static120.method1999(arg0, local29, 0, 0, 128, true);
			}
		}
		if (arg2 < this.anInt1598 && arg3 < this.anInt1592) {
			local14 = this.aClass5_Sub5ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass41_1 != null && local14.aClass41_1.aClass5_Sub1_Sub1_7 instanceof Class5_Sub1_Sub1_Sub7) {
				local29 = (Class5_Sub1_Sub1_Sub7) local14.aClass41_1.aClass5_Sub1_Sub1_7;
				Static120.method1999(arg0, local29, 128, 0, 128, true);
			}
		}
		if (arg2 >= this.anInt1598 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass5_Sub5ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass41_1 != null && local14.aClass41_1.aClass5_Sub1_Sub1_7 instanceof Class5_Sub1_Sub1_Sub7) {
			local29 = (Class5_Sub1_Sub1_Sub7) local14.aClass41_1.aClass5_Sub1_Sub1_7;
			Static120.method1999(arg0, local29, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)Z")
	private boolean method1100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray5[arg0][local17][local21] == -Static63.anInt1611) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray4[arg0][arg1][arg3] - arg5;
			if (!this.method1084(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method1084(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method1084(local21, local167, local195)) {
				return false;
			} else if (this.method1084(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method1067(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method1084(local17 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg3] - arg5, local21 + 1) && this.method1084(local17 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method1084(local17 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method1084(local17 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(IIIIII)V")
	public void method1101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt1598 * 128) {
			arg0 = this.anInt1598 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt1592 * 128) {
			arg2 = this.anInt1592 * 128 - 1;
		}
		Static63.anInt1611++;
		Static63.anInt1588 = Class5_Sub1_Sub10_Sub2.anIntArray241[arg3];
		Static63.anInt1591 = Class5_Sub1_Sub10_Sub2.anIntArray240[arg3];
		Static63.anInt1596 = Class5_Sub1_Sub10_Sub2.anIntArray241[arg4];
		Static63.anInt1602 = Class5_Sub1_Sub10_Sub2.anIntArray240[arg4];
		Static63.aBooleanArrayArray1 = Static63.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static63.anInt1595 = arg0;
		Static63.anInt1594 = arg1;
		Static63.anInt1608 = arg2;
		Static63.anInt1593 = arg0 / 128;
		Static63.anInt1606 = arg2 / 128;
		Static63.anInt1603 = arg5;
		Static63.anInt1610 = Static63.anInt1593 - 25;
		if (Static63.anInt1610 < 0) {
			Static63.anInt1610 = 0;
		}
		Static63.anInt1604 = Static63.anInt1606 - 25;
		if (Static63.anInt1604 < 0) {
			Static63.anInt1604 = 0;
		}
		Static63.anInt1609 = Static63.anInt1593 + 25;
		if (Static63.anInt1609 > this.anInt1598) {
			Static63.anInt1609 = this.anInt1598;
		}
		Static63.anInt1601 = Static63.anInt1606 + 25;
		if (Static63.anInt1601 > this.anInt1592) {
			Static63.anInt1601 = this.anInt1592;
		}
		this.method1058();
		Static63.anInt1612 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt1597; local128 < this.anInt1590; local128++) {
			@Pc(134) Class5_Sub5[][] local134 = this.aClass5_Sub5ArrayArrayArray1[local128];
			for (local136 = Static63.anInt1610; local136 < Static63.anInt1609; local136++) {
				for (local139 = Static63.anInt1604; local139 < Static63.anInt1601; local139++) {
					@Pc(146) Class5_Sub5 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt1522 <= arg5 && (Static63.aBooleanArrayArray1[local136 + 25 - Static63.anInt1593][local139 + 25 - Static63.anInt1606] || this.anIntArrayArrayArray4[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean63 = true;
							local146.aBoolean65 = true;
							if (local146.anInt1514 > 0) {
								local146.aBoolean64 = true;
							} else {
								local146.aBoolean64 = false;
							}
							Static63.anInt1612++;
						} else {
							local146.aBoolean63 = false;
							local146.aBoolean65 = false;
							local146.anInt1519 = 0;
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
		for (@Pc(224) int local224 = this.anInt1597; local224 < this.anInt1590; local224++) {
			@Pc(230) Class5_Sub5[][] local230 = this.aClass5_Sub5ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static63.anInt1593 + local139;
				local241 = Static63.anInt1593 - local139;
				if (local237 >= Static63.anInt1610 || local241 < Static63.anInt1609) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static63.anInt1606 + local249;
						local258 = Static63.anInt1606 - local249;
						@Pc(270) Class5_Sub5 local270;
						if (local237 >= Static63.anInt1610) {
							if (local254 >= Static63.anInt1604) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean63) {
									this.method1087(local270, true);
								}
							}
							if (local258 < Static63.anInt1601) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean63) {
									this.method1087(local270, true);
								}
							}
						}
						if (local241 < Static63.anInt1609) {
							if (local254 >= Static63.anInt1604) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean63) {
									this.method1087(local270, true);
								}
							}
							if (local258 < Static63.anInt1601) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean63) {
									this.method1087(local270, true);
								}
							}
						}
						if (Static63.anInt1612 == 0) {
							Static63.aBoolean68 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt1597; local136 < this.anInt1590; local136++) {
			@Pc(361) Class5_Sub5[][] local361 = this.aClass5_Sub5ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static63.anInt1593 + local237;
				local249 = Static63.anInt1593 - local237;
				if (local241 >= Static63.anInt1610 || local249 < Static63.anInt1609) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static63.anInt1606 + local254;
						@Pc(389) int local389 = Static63.anInt1606 - local254;
						@Pc(401) Class5_Sub5 local401;
						if (local241 >= Static63.anInt1610) {
							if (local258 >= Static63.anInt1604) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean63) {
									this.method1087(local401, false);
								}
							}
							if (local389 < Static63.anInt1601) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean63) {
									this.method1087(local401, false);
								}
							}
						}
						if (local249 < Static63.anInt1609) {
							if (local258 >= Static63.anInt1604) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean63) {
									this.method1087(local401, false);
								}
							}
							if (local389 < Static63.anInt1601) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean63) {
									this.method1087(local401, false);
								}
							}
						}
						if (Static63.anInt1612 == 0) {
							Static63.aBoolean68 = false;
							return;
						}
					}
				}
			}
		}
		Static63.aBoolean68 = false;
	}

	@OriginalMember(owner = "client!l", name = "p", descriptor = "(III)V")
	public void method1102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub5 local8 = this.aClass5_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt1514; local13++) {
			@Pc(19) Class69 local19 = local8.aClass69Array1[local13];
			if ((local19.anInt2665 >> 29 & 0x3) == 2 && local19.anInt2678 == arg1 && local19.anInt2670 == arg2) {
				this.method1081(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "q", descriptor = "(III)Lclient!kc;")
	public Class41 method1103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub5 local8 = this.aClass5_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass41_1 == null ? null : local8.aClass41_1;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	public void method1104(@OriginalArg(0) int arg0) {
		this.anInt1597 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt1598; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt1592; local7++) {
				if (this.aClass5_Sub5ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass5_Sub5ArrayArrayArray1[arg0][local4][local7] = new Class5_Sub5(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ed;IIIIIII)V")
	private void method1105(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static63.anInt1595;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static63.anInt1608;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray4[arg1][arg6][arg7] - Static63.anInt1594;
		@Pc(51) int local51 = this.anIntArrayArrayArray4[arg1][arg6 + 1][arg7] - Static63.anInt1594;
		@Pc(66) int local66 = this.anIntArrayArrayArray4[arg1][arg6 + 1][arg7 + 1] - Static63.anInt1594;
		@Pc(79) int local79 = this.anIntArrayArrayArray4[arg1][arg6][arg7 + 1] - Static63.anInt1594;
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
		@Pc(279) int local279 = Static80.anInt1969 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static80.anInt1972 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static80.anInt1969 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static80.anInt1972 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static80.anInt1969 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static80.anInt1972 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static80.anInt1969 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static80.anInt1972 + (local89 << 9) / local265;
		Static80.anInt1971 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static80.aBoolean94 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static80.anInt1968 || local327 > Static80.anInt1968 || local295 > Static80.anInt1968) {
				Static80.aBoolean94 = true;
			}
			if (Static63.aBoolean68 && this.method1057(Static63.anInt1605, Static63.anInt1600, local319, local335, local303, local311, local327, local295)) {
				Static63.anInt1599 = arg6;
				Static63.anInt1589 = arg7;
			}
			if (arg0.anInt764 == -1) {
				if (arg0.anInt765 != 12345678) {
					Static80.method1326(local319, local335, local303, local311, local327, local295, arg0.anInt765, arg0.anInt755, arg0.anInt760);
				}
			} else if (Static63.aBoolean69) {
				local472 = Static80.anInterface3_1.method7(arg0.anInt764);
				Static80.method1326(local319, local335, local303, local311, local327, local295, Static63.method1097(local472, arg0.anInt765), Static63.method1097(local472, arg0.anInt755), Static63.method1097(local472, arg0.anInt760));
			} else if (arg0.aBoolean32) {
				Static80.method1324(local319, local335, local303, local311, local327, local295, arg0.anInt765, arg0.anInt755, arg0.anInt760, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt764);
			} else {
				Static80.method1324(local319, local335, local303, local311, local327, local295, arg0.anInt765, arg0.anInt755, arg0.anInt760, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt764);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static80.aBoolean94 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static80.anInt1968 || local295 > Static80.anInt1968 || local327 > Static80.anInt1968) {
			Static80.aBoolean94 = true;
		}
		if (Static63.aBoolean68 && this.method1057(Static63.anInt1605, Static63.anInt1600, local287, local303, local335, local279, local295, local327)) {
			Static63.anInt1599 = arg6;
			Static63.anInt1589 = arg7;
		}
		if (arg0.anInt764 != -1) {
			if (!Static63.aBoolean69) {
				Static80.method1324(local287, local303, local335, local279, local295, local327, arg0.anInt756, arg0.anInt760, arg0.anInt755, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt764);
				return;
			}
			local472 = Static80.anInterface3_1.method7(arg0.anInt764);
			Static80.method1326(local287, local303, local335, local279, local295, local327, Static63.method1097(local472, arg0.anInt756), Static63.method1097(local472, arg0.anInt760), Static63.method1097(local472, arg0.anInt755));
		} else if (arg0.anInt756 != 12345678) {
			Static80.method1326(local287, local303, local335, local279, local295, local327, arg0.anInt756, arg0.anInt760, arg0.anInt755);
			return;
		}
	}
}
