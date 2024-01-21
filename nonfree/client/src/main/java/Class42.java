import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class42 {

	@OriginalMember(owner = "client!l", name = "n", descriptor = "I")
	private int anInt1623 = 0;

	@OriginalMember(owner = "client!l", name = "l", descriptor = "I")
	private int anInt1621 = 0;

	@OriginalMember(owner = "client!l", name = "z", descriptor = "[Lclient!c;")
	private final Class12[] aClass12Array1 = new Class12[5000];

	@OriginalMember(owner = "client!l", name = "Q", descriptor = "I")
	private int anInt1641 = 0;

	@OriginalMember(owner = "client!l", name = "R", descriptor = "[[I")
	private final int[][] anIntArrayArray13 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!l", name = "gb", descriptor = "[[I")
	private final int[][] anIntArrayArray14 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!l", name = "Z", descriptor = "[I")
	private final int[] anIntArray192 = new int[10000];

	@OriginalMember(owner = "client!l", name = "eb", descriptor = "[I")
	private final int[] anIntArray196 = new int[10000];

	@OriginalMember(owner = "client!l", name = "y", descriptor = "I")
	private final int anInt1631;

	@OriginalMember(owner = "client!l", name = "P", descriptor = "I")
	private final int anInt1640;

	@OriginalMember(owner = "client!l", name = "F", descriptor = "I")
	private final int anInt1635;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "[[[Lclient!we;")
	private final Class3_Sub14[][][] aClass3_Sub14ArrayArrayArray1;

	@OriginalMember(owner = "client!l", name = "D", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!l", name = "I", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(III[[[I)V")
	public Class42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt1631 = arg0;
		this.anInt1640 = arg1;
		this.anInt1635 = arg2;
		this.aClass3_Sub14ArrayArrayArray1 = new Class3_Sub14[arg0][arg1][arg2];
		this.anIntArrayArrayArray2 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray3 = arg3;
		this.method1034();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V")
	public void method1011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static59.aBoolean76 = true;
		Static59.anInt1620 = arg0;
		Static59.anInt1636 = arg1;
		Static59.anInt1626 = -1;
		Static59.anInt1622 = -1;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(III)Lclient!ka;")
	public Class40 method1012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub14 local8 = this.aClass3_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass40_1;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)Z")
	private boolean method1013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray2[arg0][local17][local21] == -Static59.anInt1634) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray3[arg0][arg1][arg3] - arg5;
			if (!this.method1027(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method1027(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method1027(local21, local167, local195)) {
				return false;
			} else if (this.method1027(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method1032(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method1027(local17 + 1, this.anIntArrayArrayArray3[arg0][arg1][arg3] - arg5, local21 + 1) && this.method1027(local17 + 128 - 1, this.anIntArrayArrayArray3[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method1027(local17 + 128 - 1, this.anIntArrayArrayArray3[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method1027(local17 + 1, this.anIntArrayArrayArray3[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(III)Lclient!nb;")
	public Class47 method1014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub14 local8 = this.aClass3_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass47_1;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)I")
	public int method1015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub14 local8 = this.aClass3_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass40_1 != null && local8.aClass40_1.anInt1416 == arg3) {
			return local8.aClass40_1.anInt1421 & 0xFF;
		} else if (local8.aClass47_1 != null && local8.aClass47_1.anInt1871 == arg3) {
			return local8.aClass47_1.anInt1873 & 0xFF;
		} else if (local8.aClass52_1 != null && local8.aClass52_1.anInt2064 == arg3) {
			return local8.aClass52_1.anInt2059 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt3004; local56++) {
				if (local8.aClass12Array3[local56].anInt466 == arg3) {
					return local8.aClass12Array3[local56].anInt475 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!c;)V")
	private void method1016(@OriginalArg(0) Class12 arg0) {
		for (@Pc(2) int local2 = arg0.anInt461; local2 <= arg0.anInt477; local2++) {
			for (@Pc(6) int local6 = arg0.anInt467; local6 <= arg0.anInt471; local6++) {
				@Pc(17) Class3_Sub14 local17 = this.aClass3_Sub14ArrayArrayArray1[arg0.anInt468][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt3004; local21++) {
						if (local17.aClass12Array3[local21] == arg0) {
							local17.anInt3004--;
							for (local36 = local21; local36 < local17.anInt3004; local36++) {
								local17.aClass12Array3[local36] = local17.aClass12Array3[local36 + 1];
								local17.anIntArray383[local36] = local17.anIntArray383[local36 + 1];
							}
							local17.aClass12Array3[local17.anInt3004] = null;
							break;
						}
					}
					local17.anInt3002 = 0;
					for (local36 = 0; local36 < local17.anInt3004; local36++) {
						local17.anInt3002 |= local17.anIntArray383[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!v;IIIII)V")
	private void method1017(@OriginalArg(0) Class3_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt1631) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt1640) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt1635 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class3_Sub14 local66 = this.aClass3_Sub14ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray3[local17][local24][local34] + this.anIntArrayArrayArray3[local17][local24 + 1][local34] + this.anIntArrayArrayArray3[local17][local24][local34 + 1] + this.anIntArrayArrayArray3[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray3[arg1][arg2][arg3] + this.anIntArrayArrayArray3[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray3[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray3[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class40 local163 = local66.aClass40_1;
									if (local163 != null) {
										@Pc(173) Class3_Sub1_Sub1_Sub6 local173;
										if (local163.aClass3_Sub1_Sub1_3 instanceof Class3_Sub1_Sub1_Sub6) {
											local173 = (Class3_Sub1_Sub1_Sub6) local163.aClass3_Sub1_Sub1_3;
											if (local173.aClass50Array1 != null) {
												this.method1028(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
											}
										}
										if (local163.aClass3_Sub1_Sub1_2 instanceof Class3_Sub1_Sub1_Sub6) {
											local173 = (Class3_Sub1_Sub1_Sub6) local163.aClass3_Sub1_Sub1_2;
											if (local173.aClass50Array1 != null) {
												this.method1028(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
											}
										}
									}
									for (@Pc(245) int local245 = 0; local245 < local66.anInt3004; local245++) {
										@Pc(251) Class12 local251 = local66.aClass12Array3[local245];
										if (local251 != null && local251.aClass3_Sub1_Sub1_1 instanceof Class3_Sub1_Sub1_Sub6) {
											@Pc(261) Class3_Sub1_Sub1_Sub6 local261 = (Class3_Sub1_Sub1_Sub6) local251.aClass3_Sub1_Sub1_1;
											if (local261.aClass50Array1 != null) {
												@Pc(272) int local272 = local251.anInt477 + 1 - local251.anInt461;
												@Pc(280) int local280 = local251.anInt471 + 1 - local251.anInt467;
												this.method1028(arg0, local261, (local251.anInt461 - arg2) * 128 + (local272 - arg4) * 64, local160, (local251.anInt467 - arg3) * 128 + (local280 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(IIII)V")
	public void method1018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub14 local8 = this.aClass3_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass3_Sub14ArrayArrayArray1[arg0][arg1][arg2].anInt3006 = arg3;
		}
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(III)I")
	public int method1019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub14 local8 = this.aClass3_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass47_1 == null ? 0 : local8.aClass47_1.anInt1871;
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(III)V")
	public void method1020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub14 local8 = this.aClass3_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass52_1 = null;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIILclient!gd;IIIIII)V")
	public void method1021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class47 local6 = new Class47();
		local6.anInt1871 = arg9;
		local6.anInt1873 = arg10;
		local6.anInt1868 = arg1 * 128 + arg7 + 64;
		local6.anInt1875 = arg2 * 128 + arg8 + 64;
		local6.anInt1866 = arg3;
		local6.aClass3_Sub1_Sub1_4 = arg4;
		local6.anInt1865 = arg5;
		local6.anInt1870 = arg6;
		for (@Pc(44) int local44 = arg0; local44 >= 0; local44--) {
			if (this.aClass3_Sub14ArrayArrayArray1[local44][arg1][arg2] == null) {
				this.aClass3_Sub14ArrayArrayArray1[local44][arg1][arg2] = new Class3_Sub14(local44, arg1, arg2);
			}
		}
		this.aClass3_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass47_1 = local6;
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(III)V")
	public void method1022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub14 local8 = this.aClass3_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass47_1 = null;
		}
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(IIII)V")
	public void method1023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub14 local8 = this.aClass3_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class47 local14 = local8.aClass47_1;
		if (local14 != null) {
			@Pc(23) int local23 = arg1 * 128 + 64;
			@Pc(29) int local29 = arg2 * 128 + 64;
			local14.anInt1868 = local23 + (local14.anInt1868 - local23) * arg3 / 16;
			local14.anInt1875 = local29 + (local14.anInt1875 - local29) * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method1024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class35 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class35(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass3_Sub14ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass3_Sub14ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub14(local14, arg1, arg2);
				}
			}
			this.aClass3_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass35_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class35(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass3_Sub14ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass3_Sub14ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub14(local14, arg1, arg2);
				}
			}
			this.aClass3_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass35_1 = local12;
		} else {
			@Pc(140) Class19 local140 = new Class19(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass3_Sub14ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass3_Sub14ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub14(local14, arg1, arg2);
				}
			}
			this.aClass3_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass19_1 = local140;
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(II)V")
	public void method1026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub14 local8 = this.aClass3_Sub14ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class3_Sub14 local31 = this.aClass3_Sub14ArrayArrayArray1[local10][arg0][arg1] = this.aClass3_Sub14ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt3007--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt3004; local41++) {
					@Pc(47) Class12 local47 = local31.aClass12Array3[local41];
					if ((local47.anInt466 >> 29 & 0x3) == 2 && local47.anInt461 == arg0 && local47.anInt467 == arg1) {
						local47.anInt468--;
					}
				}
			}
		}
		if (this.aClass3_Sub14ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass3_Sub14ArrayArrayArray1[0][arg0][arg1] = new Class3_Sub14(0, arg0, arg1);
		}
		this.aClass3_Sub14ArrayArrayArray1[0][arg0][arg1].aClass3_Sub14_1 = local8;
		this.aClass3_Sub14ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!l", name = "g", descriptor = "(III)Z")
	private boolean method1027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static59.anInt1618; local1++) {
			@Pc(6) Class29 local6 = Static59.aClass29Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt1014 == 1) {
				local15 = local6.anInt1031 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt1021 + (local6.anInt1026 * local15 >> 8);
					local37 = local6.anInt1036 + (local6.anInt1018 * local15 >> 8);
					local47 = local6.anInt1030 + (local6.anInt1033 * local15 >> 8);
					local57 = local6.anInt1016 + (local6.anInt1015 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1014 == 2) {
				local15 = arg0 - local6.anInt1031;
				if (local15 > 0) {
					local27 = local6.anInt1021 + (local6.anInt1026 * local15 >> 8);
					local37 = local6.anInt1036 + (local6.anInt1018 * local15 >> 8);
					local47 = local6.anInt1030 + (local6.anInt1033 * local15 >> 8);
					local57 = local6.anInt1016 + (local6.anInt1015 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1014 == 3) {
				local15 = local6.anInt1021 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt1031 + (local6.anInt1032 * local15 >> 8);
					local37 = local6.anInt1034 + (local6.anInt1027 * local15 >> 8);
					local47 = local6.anInt1030 + (local6.anInt1033 * local15 >> 8);
					local57 = local6.anInt1016 + (local6.anInt1015 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1014 == 4) {
				local15 = arg2 - local6.anInt1021;
				if (local15 > 0) {
					local27 = local6.anInt1031 + (local6.anInt1032 * local15 >> 8);
					local37 = local6.anInt1034 + (local6.anInt1027 * local15 >> 8);
					local47 = local6.anInt1030 + (local6.anInt1033 * local15 >> 8);
					local57 = local6.anInt1016 + (local6.anInt1015 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1014 == 5) {
				local15 = arg1 - local6.anInt1030;
				if (local15 > 0) {
					local27 = local6.anInt1031 + (local6.anInt1032 * local15 >> 8);
					local37 = local6.anInt1034 + (local6.anInt1027 * local15 >> 8);
					local47 = local6.anInt1021 + (local6.anInt1026 * local15 >> 8);
					local57 = local6.anInt1036 + (local6.anInt1018 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!v;Lclient!v;IIIZ)V")
	private void method1028(@OriginalArg(0) Class3_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) Class3_Sub1_Sub1_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg1.method1822();
		this.anInt1641++;
		@Pc(9) int local9 = 0;
		@Pc(12) int[] local12 = arg1.anIntArray334;
		@Pc(15) int local15 = arg1.anInt2771;
		for (@Pc(17) int local17 = 0; local17 < arg0.anInt2771; local17++) {
			@Pc(23) Class50 local23 = arg0.aClass50Array1[local17];
			@Pc(28) Class50 local28 = arg0.aClass50Array2[local17];
			if (local28.anInt2007 != 0) {
				@Pc(38) int local38 = arg0.anIntArray322[local17] - arg3;
				if (local38 <= arg1.anInt2769) {
					@Pc(49) int local49 = arg0.anIntArray334[local17] - arg2;
					if (local49 >= arg1.anInt2777 && local49 <= arg1.anInt2772) {
						@Pc(65) int local65 = arg0.anIntArray324[local17] - arg4;
						if (local65 >= arg1.anInt2775 && local65 <= arg1.anInt2768) {
							for (@Pc(76) int local76 = 0; local76 < local15; local76++) {
								@Pc(82) Class50 local82 = arg1.aClass50Array1[local76];
								@Pc(87) Class50 local87 = arg1.aClass50Array2[local76];
								if (local49 == local12[local76] && local65 == arg1.anIntArray324[local76] && local38 == arg1.anIntArray322[local76] && local87.anInt2007 != 0) {
									local23.anInt1999 += local87.anInt1999;
									local23.anInt2003 += local87.anInt2003;
									local23.anInt1998 += local87.anInt1998;
									local23.anInt2007 += local87.anInt2007;
									local82.anInt1999 += local28.anInt1999;
									local82.anInt2003 += local28.anInt2003;
									local82.anInt1998 += local28.anInt1998;
									local82.anInt2007 += local28.anInt2007;
									local9++;
									this.anIntArray196[local17] = this.anInt1641;
									this.anIntArray192[local76] = this.anInt1641;
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
		for (@Pc(193) int local193 = 0; local193 < arg0.anInt2770; local193++) {
			if (this.anIntArray196[arg0.anIntArray337[local193]] == this.anInt1641 && this.anIntArray196[arg0.anIntArray325[local193]] == this.anInt1641 && this.anIntArray196[arg0.anIntArray328[local193]] == this.anInt1641) {
				arg0.anIntArray335[local193] = -1;
			}
		}
		for (@Pc(236) int local236 = 0; local236 < arg1.anInt2770; local236++) {
			if (this.anIntArray192[arg1.anIntArray337[local236]] == this.anInt1641 && this.anIntArray192[arg1.anIntArray325[local236]] == this.anInt1641 && this.anIntArray192[arg1.anIntArray328[local236]] == this.anInt1641) {
				arg1.anIntArray335[local236] = -1;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "h", descriptor = "(III)V")
	public void method1029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub14 local8 = this.aClass3_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass67_1 = null;
		}
	}

	@OriginalMember(owner = "client!l", name = "i", descriptor = "(III)Lclient!c;")
	public Class12 method1030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub14 local8 = this.aClass3_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt3004; local14++) {
			@Pc(20) Class12 local20 = local8.aClass12Array3[local14];
			if ((local20.anInt466 >> 29 & 0x3) == 2 && local20.anInt461 == arg1 && local20.anInt467 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIILclient!gd;IIZ)Z")
	public boolean method1031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class3_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method1042(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!l", name = "j", descriptor = "(III)Z")
	private boolean method1032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray2[arg0][arg1][arg2];
		if (local8 == -Static59.anInt1634) {
			return false;
		} else if (local8 == Static59.anInt1634) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method1027(local23 + 1, this.anIntArrayArrayArray3[arg0][arg1][arg2], local27 + 1) && this.method1027(local23 + 128 - 1, this.anIntArrayArrayArray3[arg0][arg1 + 1][arg2], local27 + 1) && this.method1027(local23 + 128 - 1, this.anIntArrayArrayArray3[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method1027(local23 + 1, this.anIntArrayArrayArray3[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray2[arg0][arg1][arg2] = Static59.anInt1634;
				return true;
			} else {
				this.anIntArrayArrayArray2[arg0][arg1][arg2] = -Static59.anInt1634;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(IIII)Z")
	private boolean method1033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method1032(arg0, arg1, arg2)) {
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
				if (local11 > Static59.anInt1629) {
					if (!this.method1027(local11, local26, local15)) {
						return false;
					}
					if (!this.method1027(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1027(local11, local30, local15)) {
						return false;
					}
					if (!this.method1027(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1027(local11, local34, local15)) {
					return false;
				}
				if (!this.method1027(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static59.anInt1638) {
					if (!this.method1027(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method1027(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1027(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method1027(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1027(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method1027(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static59.anInt1629) {
					if (!this.method1027(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method1027(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1027(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method1027(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1027(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method1027(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static59.anInt1638) {
					if (!this.method1027(local11, local26, local15)) {
						return false;
					}
					if (!this.method1027(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1027(local11, local30, local15)) {
						return false;
					}
					if (!this.method1027(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method1027(local11, local34, local15)) {
					return false;
				}
				if (!this.method1027(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method1027(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method1027(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method1027(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method1027(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method1027(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "()V")
	public void method1034() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt1631; local1++) {
			for (local4 = 0; local4 < this.anInt1640; local4++) {
				for (local7 = 0; local7 < this.anInt1635; local7++) {
					this.aClass3_Sub14ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static59.anInt1627; local4++) {
			for (local7 = 0; local7 < Static59.anIntArray187[local4]; local7++) {
				Static59.aClass29ArrayArray1[local4][local7] = null;
			}
			Static59.anIntArray187[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt1621; local7++) {
			this.aClass12Array1[local7] = null;
		}
		this.anInt1621 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static59.aClass12Array2.length; local76++) {
			Static59.aClass12Array2[local76] = null;
		}
	}

	@OriginalMember(owner = "client!l", name = "k", descriptor = "(III)I")
	public int method1035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub14 local8 = this.aClass3_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass40_1 == null ? 0 : local8.aClass40_1.anInt1416;
	}

	@OriginalMember(owner = "client!l", name = "l", descriptor = "(III)V")
	public void method1036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub14 local8 = this.aClass3_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass40_1 = null;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIILclient!gd;II)V")
	public void method1037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class52 local6 = new Class52();
		local6.aClass3_Sub1_Sub1_5 = arg4;
		local6.anInt2065 = arg1 * 128 + 64;
		local6.anInt2057 = arg2 * 128 + 64;
		local6.anInt2056 = arg3;
		local6.anInt2064 = arg5;
		local6.anInt2059 = arg6;
		if (this.aClass3_Sub14ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass3_Sub14ArrayArrayArray1[arg0][arg1][arg2] = new Class3_Sub14(arg0, arg1, arg2);
		}
		this.aClass3_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass52_1 = local6;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(IIIIII)V")
	public void method1038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt1640 * 128) {
			arg0 = this.anInt1640 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt1635 * 128) {
			arg2 = this.anInt1635 * 128 - 1;
		}
		Static59.anInt1634++;
		Static59.anInt1628 = Static107.anIntArray343[arg3];
		Static59.anInt1630 = Static107.anIntArray357[arg3];
		Static59.anInt1616 = Static107.anIntArray343[arg4];
		Static59.anInt1633 = Static107.anIntArray357[arg4];
		Static59.aBooleanArrayArray1 = Static59.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static59.anInt1629 = arg0;
		Static59.anInt1615 = arg1;
		Static59.anInt1638 = arg2;
		Static59.anInt1639 = arg0 / 128;
		Static59.anInt1619 = arg2 / 128;
		Static59.anInt1624 = arg5;
		Static59.anInt1614 = Static59.anInt1639 - 25;
		if (Static59.anInt1614 < 0) {
			Static59.anInt1614 = 0;
		}
		Static59.anInt1632 = Static59.anInt1619 - 25;
		if (Static59.anInt1632 < 0) {
			Static59.anInt1632 = 0;
		}
		Static59.anInt1625 = Static59.anInt1639 + 25;
		if (Static59.anInt1625 > this.anInt1640) {
			Static59.anInt1625 = this.anInt1640;
		}
		Static59.anInt1617 = Static59.anInt1619 + 25;
		if (Static59.anInt1617 > this.anInt1635) {
			Static59.anInt1617 = this.anInt1635;
		}
		this.method1055();
		Static59.anInt1637 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt1623; local128 < this.anInt1631; local128++) {
			@Pc(134) Class3_Sub14[][] local134 = this.aClass3_Sub14ArrayArrayArray1[local128];
			for (local136 = Static59.anInt1614; local136 < Static59.anInt1625; local136++) {
				for (local139 = Static59.anInt1632; local139 < Static59.anInt1617; local139++) {
					@Pc(146) Class3_Sub14 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt3006 <= arg5 && (Static59.aBooleanArrayArray1[local136 + 25 - Static59.anInt1639][local139 + 25 - Static59.anInt1619] || this.anIntArrayArrayArray3[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean158 = true;
							local146.aBoolean160 = true;
							if (local146.anInt3004 > 0) {
								local146.aBoolean159 = true;
							} else {
								local146.aBoolean159 = false;
							}
							Static59.anInt1637++;
						} else {
							local146.aBoolean158 = false;
							local146.aBoolean160 = false;
							local146.anInt3003 = 0;
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
		for (@Pc(224) int local224 = this.anInt1623; local224 < this.anInt1631; local224++) {
			@Pc(230) Class3_Sub14[][] local230 = this.aClass3_Sub14ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static59.anInt1639 + local139;
				local241 = Static59.anInt1639 - local139;
				if (local237 >= Static59.anInt1614 || local241 < Static59.anInt1625) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static59.anInt1619 + local249;
						local258 = Static59.anInt1619 - local249;
						@Pc(270) Class3_Sub14 local270;
						if (local237 >= Static59.anInt1614) {
							if (local254 >= Static59.anInt1632) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean158) {
									this.method1045(local270, true);
								}
							}
							if (local258 < Static59.anInt1617) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean158) {
									this.method1045(local270, true);
								}
							}
						}
						if (local241 < Static59.anInt1625) {
							if (local254 >= Static59.anInt1632) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean158) {
									this.method1045(local270, true);
								}
							}
							if (local258 < Static59.anInt1617) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean158) {
									this.method1045(local270, true);
								}
							}
						}
						if (Static59.anInt1637 == 0) {
							Static59.aBoolean76 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt1623; local136 < this.anInt1631; local136++) {
			@Pc(361) Class3_Sub14[][] local361 = this.aClass3_Sub14ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static59.anInt1639 + local237;
				local249 = Static59.anInt1639 - local237;
				if (local241 >= Static59.anInt1614 || local249 < Static59.anInt1625) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static59.anInt1619 + local254;
						@Pc(389) int local389 = Static59.anInt1619 - local254;
						@Pc(401) Class3_Sub14 local401;
						if (local241 >= Static59.anInt1614) {
							if (local258 >= Static59.anInt1632) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean158) {
									this.method1045(local401, false);
								}
							}
							if (local389 < Static59.anInt1617) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean158) {
									this.method1045(local401, false);
								}
							}
						}
						if (local249 < Static59.anInt1625) {
							if (local258 >= Static59.anInt1632) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean158) {
									this.method1045(local401, false);
								}
							}
							if (local389 < Static59.anInt1617) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean158) {
									this.method1045(local401, false);
								}
							}
						}
						if (Static59.anInt1637 == 0) {
							Static59.aBoolean76 = false;
							return;
						}
					}
				}
			}
		}
		Static59.aBoolean76 = false;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIILclient!gd;III)Z")
	public boolean method1039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub1_Sub1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method1042(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!l", name = "m", descriptor = "(III)I")
	public int method1040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub14 local8 = this.aClass3_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt3004; local14++) {
			@Pc(20) Class12 local20 = local8.aClass12Array3[local14];
			if ((local20.anInt466 >> 29 & 0x3) == 2 && local20.anInt461 == arg1 && local20.anInt467 == arg2) {
				return local20.anInt466;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIILclient!gd;IZII)Z")
	private boolean method1042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class3_Sub1_Sub1 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt1640 || local4 >= this.anInt1635) {
					return false;
				}
				@Pc(28) Class3_Sub14 local28 = this.aClass3_Sub14ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt3004 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class12 local52 = new Class12();
		local52.anInt466 = arg11;
		local52.anInt475 = arg12;
		local52.anInt468 = arg0;
		local52.anInt465 = arg5;
		local52.anInt462 = arg6;
		local52.anInt463 = arg7;
		local52.aClass3_Sub1_Sub1_1 = arg8;
		local52.anInt473 = arg9;
		local52.anInt461 = arg1;
		local52.anInt467 = arg2;
		local52.anInt477 = arg1 + arg3 - 1;
		local52.anInt471 = arg2 + arg4 - 1;
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
					if (this.aClass3_Sub14ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass3_Sub14ArrayArrayArray1[local130][local98][local101] = new Class3_Sub14(local130, local98, local101);
					}
				}
				@Pc(166) Class3_Sub14 local166 = this.aClass3_Sub14ArrayArrayArray1[arg0][local98][local101];
				local166.aClass12Array3[local166.anInt3004] = local52;
				local166.anIntArray383[local166.anInt3004] = local104;
				local166.anInt3002 |= local104;
				local166.anInt3004++;
			}
		}
		if (arg10) {
			this.aClass12Array1[this.anInt1621++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([IIIIII)V")
	public void method1043(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class3_Sub14 local8 = this.aClass3_Sub14ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class35 local14 = local8.aClass35_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt1318;
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
		@Pc(59) Class19 local59 = local8.aClass19_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt697;
		@Pc(68) int local68 = local59.anInt696;
		@Pc(71) int local71 = local59.anInt699;
		@Pc(74) int local74 = local59.anInt698;
		@Pc(79) int[] local79 = this.anIntArrayArray13[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray14[local68];
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

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!we;Z)V")
	private void method1045(@OriginalArg(0) Class3_Sub14 arg0, @OriginalArg(1) boolean arg1) {
		Static59.aClass51_9.method1303(arg0);
		while (true) {
			@Pc(8) Class3_Sub14 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class3_Sub14[][] local31;
			@Pc(49) Class3_Sub14 local49;
			@Pc(251) int local251;
			@Pc(578) int local578;
			@Pc(583) int local583;
			@Pc(588) int local588;
			@Pc(591) int local591;
			@Pc(600) int local600;
			@Pc(942) Class40 local942;
			@Pc(1116) int local1116;
			@Pc(1001) int local1001;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class12 var12;
										@Pc(612) int var19;
										@Pc(335) int var23;
										@Pc(289) boolean var24;
										@Pc(823) Class3_Sub14 var35;
										while (true) {
											do {
												local8 = (Class3_Sub14) Static59.aClass51_9.method1312();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean160);
											local17 = local8.anInt2998;
											local20 = local8.anInt3005;
											local23 = local8.anInt3007;
											local26 = local8.anInt3001;
											local31 = this.aClass3_Sub14ArrayArrayArray1[local23];
											if (!local8.aBoolean158) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass3_Sub14ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean160) {
														continue;
													}
												}
												if (local17 <= Static59.anInt1639 && local17 > Static59.anInt1614) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean160 && (local49.aBoolean158 || (local8.anInt3002 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static59.anInt1639 && local17 < Static59.anInt1625 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean160 && (local49.aBoolean158 || (local8.anInt3002 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static59.anInt1619 && local20 > Static59.anInt1632) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean160 && (local49.aBoolean158 || (local8.anInt3002 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static59.anInt1619 && local20 < Static59.anInt1617 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean160 && (local49.aBoolean158 || (local8.anInt3002 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean158 = false;
											if (local8.aClass3_Sub14_1 != null) {
												local49 = local8.aClass3_Sub14_1;
												if (local49.aClass35_1 == null) {
													if (local49.aClass19_1 != null && !this.method1032(0, local17, local20)) {
														this.method1048(local49.aClass19_1, Static59.anInt1628, Static59.anInt1630, Static59.anInt1616, Static59.anInt1633, local17, local20);
													}
												} else if (!this.method1032(0, local17, local20)) {
													this.method1050(local49.aClass35_1, 0, Static59.anInt1628, Static59.anInt1630, Static59.anInt1616, Static59.anInt1633, local17, local20);
												}
												@Pc(225) Class40 local225 = local49.aClass40_1;
												if (local225 != null) {
													local225.aClass3_Sub1_Sub1_3.method1791(0, Static59.anInt1628, Static59.anInt1630, Static59.anInt1616, Static59.anInt1633, local225.anInt1415 - Static59.anInt1629, local225.anInt1423 - Static59.anInt1615, local225.anInt1417 - Static59.anInt1638, local225.anInt1416);
												}
												for (local251 = 0; local251 < local49.anInt3004; local251++) {
													var12 = local49.aClass12Array3[local251];
													if (var12 != null) {
														var12.aClass3_Sub1_Sub1_1.method1791(var12.anInt473, Static59.anInt1628, Static59.anInt1630, Static59.anInt1616, Static59.anInt1633, var12.anInt465 - Static59.anInt1629, var12.anInt463 - Static59.anInt1615, var12.anInt462 - Static59.anInt1638, var12.anInt466);
													}
												}
											}
											var24 = false;
											if (local8.aClass35_1 == null) {
												if (local8.aClass19_1 != null && !this.method1032(local26, local17, local20)) {
													var24 = true;
													this.method1048(local8.aClass19_1, Static59.anInt1628, Static59.anInt1630, Static59.anInt1616, Static59.anInt1633, local17, local20);
												}
											} else if (!this.method1032(local26, local17, local20)) {
												var24 = true;
												this.method1050(local8.aClass35_1, local26, Static59.anInt1628, Static59.anInt1630, Static59.anInt1616, Static59.anInt1633, local17, local20);
											}
											var23 = 0;
											local251 = 0;
											@Pc(340) Class40 local340 = local8.aClass40_1;
											@Pc(343) Class47 local343 = local8.aClass47_1;
											if (local340 != null || local343 != null) {
												if (Static59.anInt1639 == local17) {
													var23++;
												} else if (Static59.anInt1639 < local17) {
													var23 += 2;
												}
												if (Static59.anInt1619 == local20) {
													var23 += 3;
												} else if (Static59.anInt1619 > local20) {
													var23 += 6;
												}
												local251 = Static59.anIntArray193[var23];
												local8.anInt2996 = Static59.anIntArray189[var23];
											}
											if (local340 != null) {
												if ((local340.anInt1414 & Static59.anIntArray190[var23]) == 0) {
													local8.anInt3003 = 0;
												} else if (local340.anInt1414 == 16) {
													local8.anInt3003 = 3;
													local8.anInt2999 = Static59.anIntArray195[var23];
													local8.anInt3000 = 3 - local8.anInt2999;
												} else if (local340.anInt1414 == 32) {
													local8.anInt3003 = 6;
													local8.anInt2999 = Static59.anIntArray194[var23];
													local8.anInt3000 = 6 - local8.anInt2999;
												} else if (local340.anInt1414 == 64) {
													local8.anInt3003 = 12;
													local8.anInt2999 = Static59.anIntArray191[var23];
													local8.anInt3000 = 12 - local8.anInt2999;
												} else {
													local8.anInt3003 = 9;
													local8.anInt2999 = Static59.anIntArray197[var23];
													local8.anInt3000 = 9 - local8.anInt2999;
												}
												if ((local340.anInt1414 & local251) != 0 && !this.method1033(local26, local17, local20, local340.anInt1414)) {
													local340.aClass3_Sub1_Sub1_3.method1791(0, Static59.anInt1628, Static59.anInt1630, Static59.anInt1616, Static59.anInt1633, local340.anInt1415 - Static59.anInt1629, local340.anInt1423 - Static59.anInt1615, local340.anInt1417 - Static59.anInt1638, local340.anInt1416);
												}
												if ((local340.anInt1422 & local251) != 0 && !this.method1033(local26, local17, local20, local340.anInt1422)) {
													local340.aClass3_Sub1_Sub1_2.method1791(0, Static59.anInt1628, Static59.anInt1630, Static59.anInt1616, Static59.anInt1633, local340.anInt1415 - Static59.anInt1629, local340.anInt1423 - Static59.anInt1615, local340.anInt1417 - Static59.anInt1638, local340.anInt1416);
												}
											}
											if (local343 != null && !this.method1052(local26, local17, local20, local343.aClass3_Sub1_Sub1_4.anInt2758)) {
												if ((local343.anInt1865 & local251) != 0) {
													local343.aClass3_Sub1_Sub1_4.method1791(local343.anInt1870, Static59.anInt1628, Static59.anInt1630, Static59.anInt1616, Static59.anInt1633, local343.anInt1868 - Static59.anInt1629, local343.anInt1866 - Static59.anInt1615, local343.anInt1875 - Static59.anInt1638, local343.anInt1871);
												} else if ((local343.anInt1865 & 0x300) != 0) {
													local578 = local343.anInt1868 - Static59.anInt1629;
													local583 = local343.anInt1866 - Static59.anInt1615;
													local588 = local343.anInt1875 - Static59.anInt1638;
													local591 = local343.anInt1870;
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
													if ((local343.anInt1865 & 0x100) != 0 && var19 < local600) {
														local629 = local578 + Static59.anIntArray184[local591];
														local635 = local588 + Static59.anIntArray188[local591];
														local343.aClass3_Sub1_Sub1_4.method1791(local591 * 512 + 256, Static59.anInt1628, Static59.anInt1630, Static59.anInt1616, Static59.anInt1633, local629, local583, local635, local343.anInt1871);
													}
													if ((local343.anInt1865 & 0x200) != 0 && var19 > local600) {
														local629 = local578 + Static59.anIntArray185[local591];
														local635 = local588 + Static59.anIntArray186[local591];
														local343.aClass3_Sub1_Sub1_4.method1791(local591 * 512 + 1280 & 0x7FF, Static59.anInt1628, Static59.anInt1630, Static59.anInt1616, Static59.anInt1633, local629, local583, local635, local343.anInt1871);
													}
												}
											}
											if (var24) {
												@Pc(696) Class52 local696 = local8.aClass52_1;
												if (local696 != null) {
													local696.aClass3_Sub1_Sub1_5.method1791(0, Static59.anInt1628, Static59.anInt1630, Static59.anInt1616, Static59.anInt1633, local696.anInt2065 - Static59.anInt1629, local696.anInt2056 - Static59.anInt1615, local696.anInt2057 - Static59.anInt1638, local696.anInt2064);
												}
												@Pc(723) Class67 local723 = local8.aClass67_1;
												if (local723 != null && local723.anInt2906 == 0) {
													if (local723.aClass3_Sub1_Sub1_7 != null) {
														local723.aClass3_Sub1_Sub1_7.method1791(0, Static59.anInt1628, Static59.anInt1630, Static59.anInt1616, Static59.anInt1633, local723.anInt2900 - Static59.anInt1629, local723.anInt2903 - Static59.anInt1615, local723.anInt2905 - Static59.anInt1638, local723.anInt2899);
													}
													if (local723.aClass3_Sub1_Sub1_8 != null) {
														local723.aClass3_Sub1_Sub1_8.method1791(0, Static59.anInt1628, Static59.anInt1630, Static59.anInt1616, Static59.anInt1633, local723.anInt2900 - Static59.anInt1629, local723.anInt2903 - Static59.anInt1615, local723.anInt2905 - Static59.anInt1638, local723.anInt2899);
													}
													if (local723.aClass3_Sub1_Sub1_6 != null) {
														local723.aClass3_Sub1_Sub1_6.method1791(0, Static59.anInt1628, Static59.anInt1630, Static59.anInt1616, Static59.anInt1633, local723.anInt2900 - Static59.anInt1629, local723.anInt2903 - Static59.anInt1615, local723.anInt2905 - Static59.anInt1638, local723.anInt2899);
													}
												}
											}
											local578 = local8.anInt3002;
											if (local578 != 0) {
												if (local17 < Static59.anInt1639 && (local578 & 0x4) != 0) {
													var35 = local31[local17 + 1][local20];
													if (var35 != null && var35.aBoolean160) {
														Static59.aClass51_9.method1303(var35);
													}
												}
												if (local20 < Static59.anInt1619 && (local578 & 0x2) != 0) {
													var35 = local31[local17][local20 + 1];
													if (var35 != null && var35.aBoolean160) {
														Static59.aClass51_9.method1303(var35);
													}
												}
												if (local17 > Static59.anInt1639 && (local578 & 0x1) != 0) {
													var35 = local31[local17 - 1][local20];
													if (var35 != null && var35.aBoolean160) {
														Static59.aClass51_9.method1303(var35);
													}
												}
												if (local20 > Static59.anInt1619 && (local578 & 0x8) != 0) {
													var35 = local31[local17][local20 - 1];
													if (var35 != null && var35.aBoolean160) {
														Static59.aClass51_9.method1303(var35);
													}
												}
											}
											break;
										}
										if (local8.anInt3003 != 0) {
											var24 = true;
											for (var23 = 0; var23 < local8.anInt3004; var23++) {
												if (local8.aClass12Array3[var23].anInt478 != Static59.anInt1634 && (local8.anIntArray383[var23] & local8.anInt3003) == local8.anInt2999) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												local942 = local8.aClass40_1;
												if (!this.method1033(local26, local17, local20, local942.anInt1414)) {
													local942.aClass3_Sub1_Sub1_3.method1791(0, Static59.anInt1628, Static59.anInt1630, Static59.anInt1616, Static59.anInt1633, local942.anInt1415 - Static59.anInt1629, local942.anInt1423 - Static59.anInt1615, local942.anInt1417 - Static59.anInt1638, local942.anInt1416);
												}
												local8.anInt3003 = 0;
											}
										}
										if (!local8.aBoolean159) {
											break;
										}
										try {
											@Pc(981) int local981 = local8.anInt3004;
											local8.aBoolean159 = false;
											var23 = 0;
											label559: for (local251 = 0; local251 < local981; local251++) {
												var12 = local8.aClass12Array3[local251];
												if (var12.anInt478 != Static59.anInt1634) {
													for (local1001 = var12.anInt461; local1001 <= var12.anInt477; local1001++) {
														for (local578 = var12.anInt467; local578 <= var12.anInt471; local578++) {
															var35 = local31[local1001][local578];
															if (var35.aBoolean158) {
																local8.aBoolean159 = true;
																continue label559;
															}
															if (var35.anInt3003 != 0) {
																local588 = 0;
																if (local1001 > var12.anInt461) {
																	local588++;
																}
																if (local1001 < var12.anInt477) {
																	local588 += 4;
																}
																if (local578 > var12.anInt467) {
																	local588 += 8;
																}
																if (local578 < var12.anInt471) {
																	local588 += 2;
																}
																if ((local588 & var35.anInt3003) == local8.anInt3000) {
																	local8.aBoolean159 = true;
																	continue label559;
																}
															}
														}
													}
													Static59.aClass12Array2[var23++] = var12;
													local578 = Static59.anInt1639 - var12.anInt461;
													local583 = var12.anInt477 - Static59.anInt1639;
													if (local583 > local578) {
														local578 = local583;
													}
													local588 = Static59.anInt1619 - var12.anInt467;
													local591 = var12.anInt471 - Static59.anInt1619;
													if (local591 > local588) {
														var12.anInt470 = local578 + local591;
													} else {
														var12.anInt470 = local578 + local588;
													}
												}
											}
											while (var23 > 0) {
												local1116 = -50;
												local1001 = -1;
												@Pc(1125) Class12 local1125;
												for (local578 = 0; local578 < var23; local578++) {
													local1125 = Static59.aClass12Array2[local578];
													if (local1125.anInt478 != Static59.anInt1634) {
														if (local1125.anInt470 > local1116) {
															local1116 = local1125.anInt470;
															local1001 = local578;
														} else if (local1125.anInt470 == local1116) {
															local588 = local1125.anInt465 - Static59.anInt1629;
															local591 = local1125.anInt462 - Static59.anInt1638;
															local600 = Static59.aClass12Array2[local1001].anInt465 - Static59.anInt1629;
															var19 = Static59.aClass12Array2[local1001].anInt462 - Static59.anInt1638;
															if (local588 * local588 + local591 * local591 > local600 * local600 + var19 * var19) {
																local1001 = local578;
															}
														}
													}
												}
												if (local1001 == -1) {
													break;
												}
												local1125 = Static59.aClass12Array2[local1001];
												local1125.anInt478 = Static59.anInt1634;
												if (!this.method1013(local26, local1125.anInt461, local1125.anInt477, local1125.anInt467, local1125.anInt471, local1125.aClass3_Sub1_Sub1_1.anInt2758)) {
													local1125.aClass3_Sub1_Sub1_1.method1791(local1125.anInt473, Static59.anInt1628, Static59.anInt1630, Static59.anInt1616, Static59.anInt1633, local1125.anInt465 - Static59.anInt1629, local1125.anInt463 - Static59.anInt1615, local1125.anInt462 - Static59.anInt1638, local1125.anInt466);
												}
												for (local588 = local1125.anInt461; local588 <= local1125.anInt477; local588++) {
													for (local591 = local1125.anInt467; local591 <= local1125.anInt471; local591++) {
														@Pc(1250) Class3_Sub14 local1250 = local31[local588][local591];
														if (local1250.anInt3003 != 0) {
															Static59.aClass51_9.method1303(local1250);
														} else if ((local588 != local17 || local591 != local20) && local1250.aBoolean160) {
															Static59.aClass51_9.method1303(local1250);
														}
													}
												}
											}
											if (!local8.aBoolean159) {
												break;
											}
										} catch (@Pc(1288) Exception local1288) {
											local8.aBoolean159 = false;
											break;
										}
									}
								} while (!local8.aBoolean160);
							} while (local8.anInt3003 != 0);
							if (local17 > Static59.anInt1639 || local17 <= Static59.anInt1614) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean160);
						if (local17 < Static59.anInt1639 || local17 >= Static59.anInt1625 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean160);
					if (local20 > Static59.anInt1619 || local20 <= Static59.anInt1632) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean160);
				if (local20 < Static59.anInt1619 || local20 >= Static59.anInt1617 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean160);
			local8.aBoolean160 = false;
			Static59.anInt1637--;
			@Pc(1392) Class67 local1392 = local8.aClass67_1;
			if (local1392 != null && local1392.anInt2906 != 0) {
				if (local1392.aClass3_Sub1_Sub1_7 != null) {
					local1392.aClass3_Sub1_Sub1_7.method1791(0, Static59.anInt1628, Static59.anInt1630, Static59.anInt1616, Static59.anInt1633, local1392.anInt2900 - Static59.anInt1629, local1392.anInt2903 - Static59.anInt1615 - local1392.anInt2906, local1392.anInt2905 - Static59.anInt1638, local1392.anInt2899);
				}
				if (local1392.aClass3_Sub1_Sub1_8 != null) {
					local1392.aClass3_Sub1_Sub1_8.method1791(0, Static59.anInt1628, Static59.anInt1630, Static59.anInt1616, Static59.anInt1633, local1392.anInt2900 - Static59.anInt1629, local1392.anInt2903 - Static59.anInt1615 - local1392.anInt2906, local1392.anInt2905 - Static59.anInt1638, local1392.anInt2899);
				}
				if (local1392.aClass3_Sub1_Sub1_6 != null) {
					local1392.aClass3_Sub1_Sub1_6.method1791(0, Static59.anInt1628, Static59.anInt1630, Static59.anInt1616, Static59.anInt1633, local1392.anInt2900 - Static59.anInt1629, local1392.anInt2903 - Static59.anInt1615 - local1392.anInt2906, local1392.anInt2905 - Static59.anInt1638, local1392.anInt2899);
				}
			}
			if (local8.anInt2996 != 0) {
				@Pc(1487) Class47 local1487 = local8.aClass47_1;
				if (local1487 != null && !this.method1052(local26, local17, local20, local1487.aClass3_Sub1_Sub1_4.anInt2758)) {
					if ((local1487.anInt1865 & local8.anInt2996) != 0) {
						local1487.aClass3_Sub1_Sub1_4.method1791(local1487.anInt1870, Static59.anInt1628, Static59.anInt1630, Static59.anInt1616, Static59.anInt1633, local1487.anInt1868 - Static59.anInt1629, local1487.anInt1866 - Static59.anInt1615, local1487.anInt1875 - Static59.anInt1638, local1487.anInt1871);
					} else if ((local1487.anInt1865 & 0x300) != 0) {
						local251 = local1487.anInt1868 - Static59.anInt1629;
						local1116 = local1487.anInt1866 - Static59.anInt1615;
						local1001 = local1487.anInt1875 - Static59.anInt1638;
						local578 = local1487.anInt1870;
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
						if ((local1487.anInt1865 & 0x100) != 0 && local588 >= local583) {
							local591 = local251 + Static59.anIntArray184[local578];
							local600 = local1001 + Static59.anIntArray188[local578];
							local1487.aClass3_Sub1_Sub1_4.method1791(local578 * 512 + 256, Static59.anInt1628, Static59.anInt1630, Static59.anInt1616, Static59.anInt1633, local591, local1116, local600, local1487.anInt1871);
						}
						if ((local1487.anInt1865 & 0x200) != 0 && local588 <= local583) {
							local591 = local251 + Static59.anIntArray185[local578];
							local600 = local1001 + Static59.anIntArray186[local578];
							local1487.aClass3_Sub1_Sub1_4.method1791(local578 * 512 + 1280 & 0x7FF, Static59.anInt1628, Static59.anInt1630, Static59.anInt1616, Static59.anInt1633, local591, local1116, local600, local1487.anInt1871);
						}
					}
				}
				local942 = local8.aClass40_1;
				if (local942 != null) {
					if ((local942.anInt1422 & local8.anInt2996) != 0 && !this.method1033(local26, local17, local20, local942.anInt1422)) {
						local942.aClass3_Sub1_Sub1_2.method1791(0, Static59.anInt1628, Static59.anInt1630, Static59.anInt1616, Static59.anInt1633, local942.anInt1415 - Static59.anInt1629, local942.anInt1423 - Static59.anInt1615, local942.anInt1417 - Static59.anInt1638, local942.anInt1416);
					}
					if ((local942.anInt1414 & local8.anInt2996) != 0 && !this.method1033(local26, local17, local20, local942.anInt1414)) {
						local942.aClass3_Sub1_Sub1_3.method1791(0, Static59.anInt1628, Static59.anInt1630, Static59.anInt1616, Static59.anInt1633, local942.anInt1415 - Static59.anInt1629, local942.anInt1423 - Static59.anInt1615, local942.anInt1417 - Static59.anInt1638, local942.anInt1416);
					}
				}
			}
			@Pc(1745) Class3_Sub14 local1745;
			if (local23 < this.anInt1631 - 1) {
				local1745 = this.aClass3_Sub14ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1745 != null && local1745.aBoolean160) {
					Static59.aClass51_9.method1303(local1745);
				}
			}
			if (local17 < Static59.anInt1639) {
				local1745 = local31[local17 + 1][local20];
				if (local1745 != null && local1745.aBoolean160) {
					Static59.aClass51_9.method1303(local1745);
				}
			}
			if (local20 < Static59.anInt1619) {
				local1745 = local31[local17][local20 + 1];
				if (local1745 != null && local1745.aBoolean160) {
					Static59.aClass51_9.method1303(local1745);
				}
			}
			if (local17 > Static59.anInt1639) {
				local1745 = local31[local17 - 1][local20];
				if (local1745 != null && local1745.aBoolean160) {
					Static59.aClass51_9.method1303(local1745);
				}
			}
			if (local20 > Static59.anInt1619) {
				local1745 = local31[local17][local20 - 1];
				if (local1745 != null && local1745.aBoolean160) {
					Static59.aClass51_9.method1303(local1745);
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	public void method1046(@OriginalArg(0) int arg0) {
		this.anInt1623 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt1640; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt1635; local7++) {
				if (this.aClass3_Sub14ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass3_Sub14ArrayArrayArray1[arg0][local4][local7] = new Class3_Sub14(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIILclient!gd;ILclient!gd;Lclient!gd;)V")
	public void method1047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub1_Sub1 arg6, @OriginalArg(7) Class3_Sub1_Sub1 arg7) {
		@Pc(3) Class67 local3 = new Class67();
		local3.aClass3_Sub1_Sub1_6 = arg4;
		local3.anInt2900 = arg1 * 128 + 64;
		local3.anInt2905 = arg2 * 128 + 64;
		local3.anInt2903 = arg3;
		local3.anInt2899 = arg5;
		local3.aClass3_Sub1_Sub1_7 = arg6;
		local3.aClass3_Sub1_Sub1_8 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class3_Sub14 local43 = this.aClass3_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt3004; local47++) {
				if ((local43.aClass12Array3[local47].anInt475 & 0x100) == 256 && local43.aClass12Array3[local47].aClass3_Sub1_Sub1_1 instanceof Class3_Sub1_Sub1_Sub6) {
					@Pc(71) Class3_Sub1_Sub1_Sub6 local71 = (Class3_Sub1_Sub1_Sub6) local43.aClass12Array3[local47].aClass3_Sub1_Sub1_1;
					local71.method1800();
					if (local71.anInt2758 > local34) {
						local34 = local71.anInt2758;
					}
				}
			}
		}
		local3.anInt2906 = local34;
		if (this.aClass3_Sub14ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass3_Sub14ArrayArrayArray1[arg0][arg1][arg2] = new Class3_Sub14(arg0, arg1, arg2);
		}
		this.aClass3_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass67_1 = local3;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!dc;IIIIII)V")
	private void method1048(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray88.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray88[local5] - Static59.anInt1629;
			local20 = arg0.anIntArray81[local5] - Static59.anInt1615;
			local27 = arg0.anIntArray89[local5] - Static59.anInt1638;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray83 != null) {
				Static20.anIntArray78[local5] = local37;
				Static20.anIntArray85[local5] = local59;
				Static20.anIntArray79[local5] = local69;
			}
			Static20.anIntArray82[local5] = Static25.anInt783 + (local37 << 9) / local69;
			Static20.anIntArray87[local5] = Static25.anInt786 + (local59 << 9) / local69;
		}
		Static25.anInt787 = 0;
		local3 = arg0.anIntArray75.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray75[local13];
			local27 = arg0.anIntArray80[local13];
			local37 = arg0.anIntArray84[local13];
			@Pc(142) int local142 = Static20.anIntArray82[local20];
			@Pc(146) int local146 = Static20.anIntArray82[local27];
			@Pc(150) int local150 = Static20.anIntArray82[local37];
			@Pc(154) int local154 = Static20.anIntArray87[local20];
			@Pc(158) int local158 = Static20.anIntArray87[local27];
			@Pc(162) int local162 = Static20.anIntArray87[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static25.aBoolean38 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static25.anInt782 || local146 > Static25.anInt782 || local150 > Static25.anInt782) {
					Static25.aBoolean38 = true;
				}
				if (Static59.aBoolean76 && this.method1053(Static59.anInt1620, Static59.anInt1636, local154, local158, local162, local142, local146, local150)) {
					Static59.anInt1626 = arg5;
					Static59.anInt1622 = arg6;
				}
				if (arg0.anIntArray83 == null || arg0.anIntArray83[local13] == -1) {
					if (arg0.anIntArray86[local13] != 12345678) {
						Static25.method510(local154, local158, local162, local142, local146, local150, arg0.anIntArray86[local13], arg0.anIntArray77[local13], arg0.anIntArray76[local13]);
					}
				} else if (Static59.aBoolean75) {
					@Pc(364) int local364 = Static25.anInterface3_1.method1552(arg0.anIntArray83[local13]);
					Static25.method510(local154, local158, local162, local142, local146, local150, Static59.method1041(local364, arg0.anIntArray86[local13]), Static59.method1041(local364, arg0.anIntArray77[local13]), Static59.method1041(local364, arg0.anIntArray76[local13]));
				} else if (arg0.aBoolean31) {
					Static25.method515(local154, local158, local162, local142, local146, local150, arg0.anIntArray86[local13], arg0.anIntArray77[local13], arg0.anIntArray76[local13], Static20.anIntArray78[0], Static20.anIntArray78[1], Static20.anIntArray78[3], Static20.anIntArray85[0], Static20.anIntArray85[1], Static20.anIntArray85[3], Static20.anIntArray79[0], Static20.anIntArray79[1], Static20.anIntArray79[3], arg0.anIntArray83[local13]);
				} else {
					Static25.method515(local154, local158, local162, local142, local146, local150, arg0.anIntArray86[local13], arg0.anIntArray77[local13], arg0.anIntArray76[local13], Static20.anIntArray78[local20], Static20.anIntArray78[local27], Static20.anIntArray78[local37], Static20.anIntArray85[local20], Static20.anIntArray85[local27], Static20.anIntArray85[local37], Static20.anIntArray79[local20], Static20.anIntArray79[local27], Static20.anIntArray79[local37], arg0.anIntArray83[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "()V")
	public void method1049() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1621; local1++) {
			@Pc(7) Class12 local7 = this.aClass12Array1[local1];
			this.method1016(local7);
			this.aClass12Array1[local1] = null;
		}
		this.anInt1621 = 0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ja;IIIIIII)V")
	private void method1050(@OriginalArg(0) Class35 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static59.anInt1629;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static59.anInt1638;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray3[arg1][arg6][arg7] - Static59.anInt1615;
		@Pc(51) int local51 = this.anIntArrayArrayArray3[arg1][arg6 + 1][arg7] - Static59.anInt1615;
		@Pc(66) int local66 = this.anIntArrayArrayArray3[arg1][arg6 + 1][arg7 + 1] - Static59.anInt1615;
		@Pc(79) int local79 = this.anIntArrayArrayArray3[arg1][arg6][arg7 + 1] - Static59.anInt1615;
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
		@Pc(279) int local279 = Static25.anInt783 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static25.anInt786 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static25.anInt783 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static25.anInt786 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static25.anInt783 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static25.anInt786 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static25.anInt783 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static25.anInt786 + (local89 << 9) / local265;
		Static25.anInt787 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static25.aBoolean38 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static25.anInt782 || local327 > Static25.anInt782 || local295 > Static25.anInt782) {
				Static25.aBoolean38 = true;
			}
			if (Static59.aBoolean76 && this.method1053(Static59.anInt1620, Static59.anInt1636, local319, local335, local303, local311, local327, local295)) {
				Static59.anInt1626 = arg6;
				Static59.anInt1622 = arg7;
			}
			if (arg0.anInt1314 == -1) {
				if (arg0.anInt1315 != 12345678) {
					Static25.method510(local319, local335, local303, local311, local327, local295, arg0.anInt1315, arg0.anInt1316, arg0.anInt1312);
				}
			} else if (Static59.aBoolean75) {
				local472 = Static25.anInterface3_1.method1552(arg0.anInt1314);
				Static25.method510(local319, local335, local303, local311, local327, local295, Static59.method1041(local472, arg0.anInt1315), Static59.method1041(local472, arg0.anInt1316), Static59.method1041(local472, arg0.anInt1312));
			} else if (arg0.aBoolean65) {
				Static25.method515(local319, local335, local303, local311, local327, local295, arg0.anInt1315, arg0.anInt1316, arg0.anInt1312, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1314);
			} else {
				Static25.method515(local319, local335, local303, local311, local327, local295, arg0.anInt1315, arg0.anInt1316, arg0.anInt1312, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt1314);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static25.aBoolean38 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static25.anInt782 || local295 > Static25.anInt782 || local327 > Static25.anInt782) {
			Static25.aBoolean38 = true;
		}
		if (Static59.aBoolean76 && this.method1053(Static59.anInt1620, Static59.anInt1636, local287, local303, local335, local279, local295, local327)) {
			Static59.anInt1626 = arg6;
			Static59.anInt1622 = arg7;
		}
		if (arg0.anInt1314 != -1) {
			if (!Static59.aBoolean75) {
				Static25.method515(local287, local303, local335, local279, local295, local327, arg0.anInt1311, arg0.anInt1312, arg0.anInt1316, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1314);
				return;
			}
			local472 = Static25.anInterface3_1.method1552(arg0.anInt1314);
			Static25.method510(local287, local303, local335, local279, local295, local327, Static59.method1041(local472, arg0.anInt1311), Static59.method1041(local472, arg0.anInt1312), Static59.method1041(local472, arg0.anInt1316));
		} else if (arg0.anInt1311 != 12345678) {
			Static25.method510(local287, local303, local335, local279, local295, local327, arg0.anInt1311, arg0.anInt1312, arg0.anInt1316);
			return;
		}
	}

	@OriginalMember(owner = "client!l", name = "n", descriptor = "(III)V")
	public void method1051() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1631; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt1640; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt1635; local7++) {
					@Pc(17) Class3_Sub14 local17 = this.aClass3_Sub14ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class40 local22 = local17.aClass40_1;
						if (local22 != null && local22.aClass3_Sub1_Sub1_3 instanceof Class3_Sub1_Sub1_Sub6) {
							@Pc(32) Class3_Sub1_Sub1_Sub6 local32 = (Class3_Sub1_Sub1_Sub6) local22.aClass3_Sub1_Sub1_3;
							if (local32.aClass50Array1 != null) {
								this.method1017(local32, local1, local4, local7, 1, 1);
								if (local22.aClass3_Sub1_Sub1_2 instanceof Class3_Sub1_Sub1_Sub6) {
									@Pc(51) Class3_Sub1_Sub1_Sub6 local51 = (Class3_Sub1_Sub1_Sub6) local22.aClass3_Sub1_Sub1_2;
									if (local51.aClass50Array1 != null) {
										this.method1017(local51, local1, local4, local7, 1, 1);
										this.method1028(local32, local51, 0, 0, 0, false);
										local51.method1797();
									}
								}
								local32.method1797();
							}
						}
						@Pc(98) Class3_Sub1_Sub1_Sub6 local98;
						for (@Pc(82) int local82 = 0; local82 < local17.anInt3004; local82++) {
							@Pc(88) Class12 local88 = local17.aClass12Array3[local82];
							if (local88 != null && local88.aClass3_Sub1_Sub1_1 instanceof Class3_Sub1_Sub1_Sub6) {
								local98 = (Class3_Sub1_Sub1_Sub6) local88.aClass3_Sub1_Sub1_1;
								if (local98.aClass50Array1 != null) {
									this.method1017(local98, local1, local4, local7, local88.anInt477 + 1 - local88.anInt461, local88.anInt471 - local88.anInt467 + 1);
									local98.method1797();
								}
							}
						}
						@Pc(134) Class52 local134 = local17.aClass52_1;
						if (local134 != null && local134.aClass3_Sub1_Sub1_5 instanceof Class3_Sub1_Sub1_Sub6) {
							local98 = (Class3_Sub1_Sub1_Sub6) local134.aClass3_Sub1_Sub1_5;
							if (local98.aClass50Array1 != null) {
								this.method1057(local98, local1, local4, local7);
								local98.method1797();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(IIII)Z")
	private boolean method1052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method1032(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method1027(local11 + 1, this.anIntArrayArrayArray3[arg0][arg1][arg2] - arg3, local15 + 1) && this.method1027(local11 + 128 - 1, this.anIntArrayArrayArray3[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method1027(local11 + 128 - 1, this.anIntArrayArrayArray3[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method1027(local11 + 1, this.anIntArrayArrayArray3[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!l", name = "o", descriptor = "(III)V")
	public void method1054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub14 local8 = this.aClass3_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt3004; local13++) {
			@Pc(19) Class12 local19 = local8.aClass12Array3[local13];
			if ((local19.anInt466 >> 29 & 0x3) == 2 && local19.anInt461 == arg1 && local19.anInt467 == arg2) {
				this.method1016(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "()V")
	private void method1055() {
		@Pc(3) int local3 = Static59.anIntArray187[Static59.anInt1624];
		@Pc(7) Class29[] local7 = Static59.aClass29ArrayArray1[Static59.anInt1624];
		Static59.anInt1618 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class29 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt1028 == 1) {
				local27 = local16.anInt1020 + 25 - Static59.anInt1639;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt1025 + 25 - Static59.anInt1619;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1038 + 25 - Static59.anInt1619;
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
						local79 = Static59.anInt1629 - local16.anInt1031;
						if (local79 > 32) {
							local16.anInt1014 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt1014 = 2;
							local79 = -local79;
						}
						local16.anInt1026 = (local16.anInt1021 - Static59.anInt1638 << 8) / local79;
						local16.anInt1018 = (local16.anInt1036 - Static59.anInt1638 << 8) / local79;
						local16.anInt1033 = (local16.anInt1030 - Static59.anInt1615 << 8) / local79;
						local16.anInt1015 = (local16.anInt1016 - Static59.anInt1615 << 8) / local79;
						Static59.aClass29Array1[Static59.anInt1618++] = local16;
					}
				}
			} else if (local16.anInt1028 == 2) {
				local27 = local16.anInt1025 + 25 - Static59.anInt1619;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt1020 + 25 - Static59.anInt1639;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1035 + 25 - Static59.anInt1639;
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
						local79 = Static59.anInt1638 - local16.anInt1021;
						if (local79 > 32) {
							local16.anInt1014 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt1014 = 4;
							local79 = -local79;
						}
						local16.anInt1032 = (local16.anInt1031 - Static59.anInt1629 << 8) / local79;
						local16.anInt1027 = (local16.anInt1034 - Static59.anInt1629 << 8) / local79;
						local16.anInt1033 = (local16.anInt1030 - Static59.anInt1615 << 8) / local79;
						local16.anInt1015 = (local16.anInt1016 - Static59.anInt1615 << 8) / local79;
						Static59.aClass29Array1[Static59.anInt1618++] = local16;
					}
				}
			} else if (local16.anInt1028 == 4) {
				local27 = local16.anInt1030 - Static59.anInt1615;
				if (local27 > 128) {
					local40 = local16.anInt1025 + 25 - Static59.anInt1619;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1038 + 25 - Static59.anInt1619;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt1020 + 25 - Static59.anInt1639;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt1035 + 25 - Static59.anInt1639;
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
							local16.anInt1014 = 5;
							local16.anInt1032 = (local16.anInt1031 - Static59.anInt1629 << 8) / local27;
							local16.anInt1027 = (local16.anInt1034 - Static59.anInt1629 << 8) / local27;
							local16.anInt1026 = (local16.anInt1021 - Static59.anInt1638 << 8) / local27;
							local16.anInt1018 = (local16.anInt1036 - Static59.anInt1638 << 8) / local27;
							Static59.aClass29Array1[Static59.anInt1618++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "p", descriptor = "(III)Lclient!pb;")
	public Class52 method1056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub14 local8 = this.aClass3_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass52_1 == null ? null : local8.aClass52_1;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!v;III)V")
	private void method1057(@OriginalArg(0) Class3_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class3_Sub14 local14;
		@Pc(29) Class3_Sub1_Sub1_Sub6 local29;
		if (arg2 < this.anInt1640) {
			local14 = this.aClass3_Sub14ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass52_1 != null && local14.aClass52_1.aClass3_Sub1_Sub1_5 instanceof Class3_Sub1_Sub1_Sub6) {
				local29 = (Class3_Sub1_Sub1_Sub6) local14.aClass52_1.aClass3_Sub1_Sub1_5;
				if (local29.aClass50Array1 != null) {
					this.method1028(arg0, local29, 128, 0, 0, true);
				}
			}
		}
		if (arg3 < this.anInt1640) {
			local14 = this.aClass3_Sub14ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass52_1 != null && local14.aClass52_1.aClass3_Sub1_Sub1_5 instanceof Class3_Sub1_Sub1_Sub6) {
				local29 = (Class3_Sub1_Sub1_Sub6) local14.aClass52_1.aClass3_Sub1_Sub1_5;
				if (local29.aClass50Array1 != null) {
					this.method1028(arg0, local29, 0, 0, 128, true);
				}
			}
		}
		if (arg2 < this.anInt1640 && arg3 < this.anInt1635) {
			local14 = this.aClass3_Sub14ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass52_1 != null && local14.aClass52_1.aClass3_Sub1_Sub1_5 instanceof Class3_Sub1_Sub1_Sub6) {
				local29 = (Class3_Sub1_Sub1_Sub6) local14.aClass52_1.aClass3_Sub1_Sub1_5;
				if (local29.aClass50Array1 != null) {
					this.method1028(arg0, local29, 128, 0, 128, true);
				}
			}
		}
		if (arg2 >= this.anInt1640 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass3_Sub14ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass52_1 != null && local14.aClass52_1.aClass3_Sub1_Sub1_5 instanceof Class3_Sub1_Sub1_Sub6) {
			local29 = (Class3_Sub1_Sub1_Sub6) local14.aClass52_1.aClass3_Sub1_Sub1_5;
			if (local29.aClass50Array1 != null) {
				this.method1028(arg0, local29, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "q", descriptor = "(III)I")
	public int method1060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub14 local8 = this.aClass3_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass52_1 == null ? 0 : local8.aClass52_1.anInt2064;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIILclient!gd;Lclient!gd;IIII)V")
	public void method1061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub1 arg4, @OriginalArg(5) Class3_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class40 local8 = new Class40();
		local8.anInt1416 = arg8;
		local8.anInt1421 = arg9;
		local8.anInt1415 = arg1 * 128 + 64;
		local8.anInt1417 = arg2 * 128 + 64;
		local8.anInt1423 = arg3;
		local8.aClass3_Sub1_Sub1_3 = arg4;
		local8.aClass3_Sub1_Sub1_2 = arg5;
		local8.anInt1414 = arg6;
		local8.anInt1422 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass3_Sub14ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass3_Sub14ArrayArrayArray1[local45][arg1][arg2] = new Class3_Sub14(local45, arg1, arg2);
			}
		}
		this.aClass3_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass40_1 = local8;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIILclient!gd;IIIIII)Z")
	public boolean method1062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class3_Sub1_Sub1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method1042(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}
}
