import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class69 {

	@OriginalMember(owner = "client!td", name = "b", descriptor = "I")
	private int anInt2968 = 0;

	@OriginalMember(owner = "client!td", name = "t", descriptor = "[Lclient!tb;")
	private final Class67[] aClass67Array2 = new Class67[5000];

	@OriginalMember(owner = "client!td", name = "p", descriptor = "I")
	private int anInt2977 = 0;

	@OriginalMember(owner = "client!td", name = "S", descriptor = "[[I")
	private final int[][] anIntArrayArray26 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!td", name = "T", descriptor = "[[I")
	private final int[][] anIntArrayArray27 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!td", name = "G", descriptor = "I")
	private final int anInt2988;

	@OriginalMember(owner = "client!td", name = "E", descriptor = "I")
	private final int anInt2987;

	@OriginalMember(owner = "client!td", name = "o", descriptor = "I")
	private final int anInt2976;

	@OriginalMember(owner = "client!td", name = "O", descriptor = "[[[Lclient!db;")
	private final Class3_Sub4[][][] aClass3_Sub4ArrayArrayArray1;

	@OriginalMember(owner = "client!td", name = "u", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!td", name = "F", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(III[[[I)V")
	public Class69(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt2988 = arg0;
		this.anInt2987 = arg1;
		this.anInt2976 = arg2;
		this.aClass3_Sub4ArrayArrayArray1 = new Class3_Sub4[arg0][arg1][arg2];
		this.anIntArrayArrayArray4 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray5 = arg3;
		this.method2052();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)V")
	public void method2014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub4 local8 = this.aClass3_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass74_1 = null;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method2015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIILclient!hd;IIIIII)Z")
	public boolean method2016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class3_Sub1_Sub5 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method2061(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(III)I")
	public int method2017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub4 local8 = this.aClass3_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass74_1 == null ? 0 : local8.aClass74_1.anInt3174;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!fe;IIIII)V")
	private void method2018(@OriginalArg(0) Class3_Sub1_Sub5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt2988) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt2987) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt2976 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class3_Sub4 local66 = this.aClass3_Sub4ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray5[local17][local24][local34] + this.anIntArrayArrayArray5[local17][local24 + 1][local34] + this.anIntArrayArrayArray5[local17][local24][local34 + 1] + this.anIntArrayArrayArray5[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray5[arg1][arg2][arg3] + this.anIntArrayArrayArray5[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray5[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray5[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class68 local163 = local66.aClass68_1;
									if (local163 != null) {
										@Pc(173) Class3_Sub1_Sub5_Sub2 local173;
										if (local163.aClass3_Sub1_Sub5_6 instanceof Class3_Sub1_Sub5_Sub2) {
											local173 = (Class3_Sub1_Sub5_Sub2) local163.aClass3_Sub1_Sub5_6;
											Static34.method692(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local163.aClass3_Sub1_Sub5_7 instanceof Class3_Sub1_Sub5_Sub2) {
											local173 = (Class3_Sub1_Sub5_Sub2) local163.aClass3_Sub1_Sub5_7;
											Static34.method692(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(237) int local237 = 0; local237 < local66.anInt862; local237++) {
										@Pc(243) Class67 local243 = local66.aClass67Array1[local237];
										if (local243 != null && local243.aClass3_Sub1_Sub5_5 instanceof Class3_Sub1_Sub5_Sub2) {
											@Pc(253) Class3_Sub1_Sub5_Sub2 local253 = (Class3_Sub1_Sub5_Sub2) local243.aClass3_Sub1_Sub5_5;
											@Pc(261) int local261 = local243.anInt2949 + 1 - local243.anInt2951;
											@Pc(269) int local269 = local243.anInt2941 + 1 - local243.anInt2933;
											Static34.method692(arg0, local253, (local243.anInt2951 - arg2) * 128 + (local261 - arg4) * 64, local160, (local243.anInt2933 - arg3) * 128 + (local269 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(III)I")
	public int method2019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub4 local8 = this.aClass3_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt862; local14++) {
			@Pc(20) Class67 local20 = local8.aClass67Array1[local14];
			if ((local20.anInt2952 >> 29 & 0x3) == 2 && local20.anInt2951 == arg1 && local20.anInt2933 == arg2) {
				return local20.anInt2952;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIII)V")
	public void method2020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub4 local8 = this.aClass3_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass3_Sub4ArrayArrayArray1[arg0][arg1][arg2].anInt859 = arg3;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!tb;)V")
	private void method2021(@OriginalArg(0) Class67 arg0) {
		for (@Pc(2) int local2 = arg0.anInt2951; local2 <= arg0.anInt2949; local2++) {
			for (@Pc(6) int local6 = arg0.anInt2933; local6 <= arg0.anInt2941; local6++) {
				@Pc(17) Class3_Sub4 local17 = this.aClass3_Sub4ArrayArrayArray1[arg0.anInt2944][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt862; local21++) {
						if (local17.aClass67Array1[local21] == arg0) {
							local17.anInt862--;
							for (local36 = local21; local36 < local17.anInt862; local36++) {
								local17.aClass67Array1[local36] = local17.aClass67Array1[local36 + 1];
								local17.anIntArray77[local36] = local17.anIntArray77[local36 + 1];
							}
							local17.aClass67Array1[local17.anInt862] = null;
							break;
						}
					}
					local17.anInt856 = 0;
					for (local36 = 0; local36 < local17.anInt862; local36++) {
						local17.anInt856 |= local17.anIntArray77[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(III)V")
	public void method2023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub4 local8 = this.aClass3_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass25_1 = null;
		}
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "(III)Lclient!va;")
	public Class74 method2024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub4 local8 = this.aClass3_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass74_1 == null ? null : local8.aClass74_1;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V")
	public void method2025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub4 local8 = this.aClass3_Sub4ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class3_Sub4 local31 = this.aClass3_Sub4ArrayArrayArray1[local10][arg0][arg1] = this.aClass3_Sub4ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt861--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt862; local41++) {
					@Pc(47) Class67 local47 = local31.aClass67Array1[local41];
					if ((local47.anInt2952 >> 29 & 0x3) == 2 && local47.anInt2951 == arg0 && local47.anInt2933 == arg1) {
						local47.anInt2944--;
					}
				}
			}
		}
		if (this.aClass3_Sub4ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass3_Sub4ArrayArrayArray1[0][arg0][arg1] = new Class3_Sub4(0, arg0, arg1);
		}
		this.aClass3_Sub4ArrayArrayArray1[0][arg0][arg1].aClass3_Sub4_1 = local8;
		this.aClass3_Sub4ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!fe;III)V")
	private void method2026(@OriginalArg(0) Class3_Sub1_Sub5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class3_Sub4 local14;
		@Pc(29) Class3_Sub1_Sub5_Sub2 local29;
		if (arg2 < this.anInt2987) {
			local14 = this.aClass3_Sub4ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass74_1 != null && local14.aClass74_1.aClass3_Sub1_Sub5_8 instanceof Class3_Sub1_Sub5_Sub2) {
				local29 = (Class3_Sub1_Sub5_Sub2) local14.aClass74_1.aClass3_Sub1_Sub5_8;
				Static34.method692(arg0, local29, 128, 0, 0, true);
			}
		}
		if (arg3 < this.anInt2987) {
			local14 = this.aClass3_Sub4ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass74_1 != null && local14.aClass74_1.aClass3_Sub1_Sub5_8 instanceof Class3_Sub1_Sub5_Sub2) {
				local29 = (Class3_Sub1_Sub5_Sub2) local14.aClass74_1.aClass3_Sub1_Sub5_8;
				Static34.method692(arg0, local29, 0, 0, 128, true);
			}
		}
		if (arg2 < this.anInt2987 && arg3 < this.anInt2976) {
			local14 = this.aClass3_Sub4ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass74_1 != null && local14.aClass74_1.aClass3_Sub1_Sub5_8 instanceof Class3_Sub1_Sub5_Sub2) {
				local29 = (Class3_Sub1_Sub5_Sub2) local14.aClass74_1.aClass3_Sub1_Sub5_8;
				Static34.method692(arg0, local29, 128, 0, 128, true);
			}
		}
		if (arg2 >= this.anInt2987 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass3_Sub4ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass74_1 != null && local14.aClass74_1.aClass3_Sub1_Sub5_8 instanceof Class3_Sub1_Sub5_Sub2) {
			local29 = (Class3_Sub1_Sub5_Sub2) local14.aClass74_1.aClass3_Sub1_Sub5_8;
			Static34.method692(arg0, local29, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!td", name = "f", descriptor = "(III)Lclient!ha;")
	public Class25 method2027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub4 local8 = this.aClass3_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass25_1;
	}

	@OriginalMember(owner = "client!td", name = "g", descriptor = "(III)V")
	public void method2028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub4 local8 = this.aClass3_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt862; local13++) {
			@Pc(19) Class67 local19 = local8.aClass67Array1[local13];
			if ((local19.anInt2952 >> 29 & 0x3) == 2 && local19.anInt2951 == arg1 && local19.anInt2933 == arg2) {
				this.method2021(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIILclient!hd;Lclient!hd;IIII)V")
	public void method2029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub5 arg4, @OriginalArg(5) Class3_Sub1_Sub5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class68 local8 = new Class68();
		local8.anInt2957 = arg8;
		local8.anInt2955 = arg9;
		local8.anInt2956 = arg1 * 128 + 64;
		local8.anInt2962 = arg2 * 128 + 64;
		local8.anInt2958 = arg3;
		local8.aClass3_Sub1_Sub5_6 = arg4;
		local8.aClass3_Sub1_Sub5_7 = arg5;
		local8.anInt2966 = arg6;
		local8.anInt2963 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass3_Sub4ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass3_Sub4ArrayArrayArray1[local45][arg1][arg2] = new Class3_Sub4(local45, arg1, arg2);
			}
		}
		this.aClass3_Sub4ArrayArrayArray1[arg0][arg1][arg2].aClass68_1 = local8;
	}

	@OriginalMember(owner = "client!td", name = "h", descriptor = "(III)Lclient!tb;")
	public Class67 method2031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub4 local8 = this.aClass3_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt862; local14++) {
			@Pc(20) Class67 local20 = local8.aClass67Array1[local14];
			if ((local20.anInt2952 >> 29 & 0x3) == 2 && local20.anInt2951 == arg1 && local20.anInt2933 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!nf;IIIIII)V")
	private void method2032(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray237.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray237[local5] - Static112.anInt2972;
			local20 = arg0.anIntArray238[local5] - Static112.anInt2994;
			local27 = arg0.anIntArray230[local5] - Static112.anInt2979;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray240 != null) {
				Static82.anIntArray239[local5] = local37;
				Static82.anIntArray242[local5] = local59;
				Static82.anIntArray232[local5] = local69;
			}
			Static82.anIntArray229[local5] = Static127.anInt3251 + (local37 << 9) / local69;
			Static82.anIntArray233[local5] = Static127.anInt3248 + (local59 << 9) / local69;
		}
		Static127.anInt3247 = 0;
		local3 = arg0.anIntArray228.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray228[local13];
			local27 = arg0.anIntArray231[local13];
			local37 = arg0.anIntArray241[local13];
			@Pc(142) int local142 = Static82.anIntArray229[local20];
			@Pc(146) int local146 = Static82.anIntArray229[local27];
			@Pc(150) int local150 = Static82.anIntArray229[local37];
			@Pc(154) int local154 = Static82.anIntArray233[local20];
			@Pc(158) int local158 = Static82.anIntArray233[local27];
			@Pc(162) int local162 = Static82.anIntArray233[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static127.aBoolean181 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static127.anInt3244 || local146 > Static127.anInt3244 || local150 > Static127.anInt3244) {
					Static127.aBoolean181 = true;
				}
				if (Static112.aBoolean163 && this.method2015(Static112.anInt2967, Static112.anInt2980, local154, local158, local162, local142, local146, local150)) {
					Static112.anInt2989 = arg5;
					Static112.anInt2984 = arg6;
				}
				if (arg0.anIntArray240 == null || arg0.anIntArray240[local13] == -1) {
					if (arg0.anIntArray234[local13] != 12345678) {
						Static127.method2244(local154, local158, local162, local142, local146, local150, arg0.anIntArray234[local13], arg0.anIntArray236[local13], arg0.anIntArray235[local13]);
					}
				} else if (Static112.aBoolean164) {
					@Pc(364) int local364 = Static127.anInterface2_1.method1098(arg0.anIntArray240[local13]);
					Static127.method2244(local154, local158, local162, local142, local146, local150, Static112.method2030(local364, arg0.anIntArray234[local13]), Static112.method2030(local364, arg0.anIntArray236[local13]), Static112.method2030(local364, arg0.anIntArray235[local13]));
				} else if (arg0.aBoolean127) {
					Static127.method2236(local154, local158, local162, local142, local146, local150, arg0.anIntArray234[local13], arg0.anIntArray236[local13], arg0.anIntArray235[local13], Static82.anIntArray239[0], Static82.anIntArray239[1], Static82.anIntArray239[3], Static82.anIntArray242[0], Static82.anIntArray242[1], Static82.anIntArray242[3], Static82.anIntArray232[0], Static82.anIntArray232[1], Static82.anIntArray232[3], arg0.anIntArray240[local13]);
				} else {
					Static127.method2236(local154, local158, local162, local142, local146, local150, arg0.anIntArray234[local13], arg0.anIntArray236[local13], arg0.anIntArray235[local13], Static82.anIntArray239[local20], Static82.anIntArray239[local27], Static82.anIntArray239[local37], Static82.anIntArray242[local20], Static82.anIntArray242[local27], Static82.anIntArray242[local37], Static82.anIntArray232[local20], Static82.anIntArray232[local27], Static82.anIntArray232[local37], arg0.anIntArray240[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "()V")
	private void method2033() {
		@Pc(3) int local3 = Static112.anIntArray354[Static112.anInt2973];
		@Pc(7) Class14[] local7 = Static112.aClass14ArrayArray1[Static112.anInt2973];
		Static112.anInt2986 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class14 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt451 == 1) {
				local27 = local16.anInt436 + 25 - Static112.anInt2974;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt446 + 25 - Static112.anInt2983;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt429 + 25 - Static112.anInt2983;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static112.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static112.anInt2972 - local16.anInt448;
						if (local79 > 32) {
							local16.anInt444 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt444 = 2;
							local79 = -local79;
						}
						local16.anInt431 = (local16.anInt441 - Static112.anInt2979 << 8) / local79;
						local16.anInt438 = (local16.anInt433 - Static112.anInt2979 << 8) / local79;
						local16.anInt453 = (local16.anInt432 - Static112.anInt2994 << 8) / local79;
						local16.anInt445 = (local16.anInt430 - Static112.anInt2994 << 8) / local79;
						Static112.aClass14Array1[Static112.anInt2986++] = local16;
					}
				}
			} else if (local16.anInt451 == 2) {
				local27 = local16.anInt446 + 25 - Static112.anInt2983;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt436 + 25 - Static112.anInt2974;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt443 + 25 - Static112.anInt2974;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static112.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static112.anInt2979 - local16.anInt441;
						if (local79 > 32) {
							local16.anInt444 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt444 = 4;
							local79 = -local79;
						}
						local16.anInt452 = (local16.anInt448 - Static112.anInt2972 << 8) / local79;
						local16.anInt435 = (local16.anInt447 - Static112.anInt2972 << 8) / local79;
						local16.anInt453 = (local16.anInt432 - Static112.anInt2994 << 8) / local79;
						local16.anInt445 = (local16.anInt430 - Static112.anInt2994 << 8) / local79;
						Static112.aClass14Array1[Static112.anInt2986++] = local16;
					}
				}
			} else if (local16.anInt451 == 4) {
				local27 = local16.anInt432 - Static112.anInt2994;
				if (local27 > 128) {
					local40 = local16.anInt446 + 25 - Static112.anInt2983;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt429 + 25 - Static112.anInt2983;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt436 + 25 - Static112.anInt2974;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt443 + 25 - Static112.anInt2974;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static112.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt444 = 5;
							local16.anInt452 = (local16.anInt448 - Static112.anInt2972 << 8) / local27;
							local16.anInt435 = (local16.anInt447 - Static112.anInt2972 << 8) / local27;
							local16.anInt431 = (local16.anInt441 - Static112.anInt2979 << 8) / local27;
							local16.anInt438 = (local16.anInt433 - Static112.anInt2979 << 8) / local27;
							Static112.aClass14Array1[Static112.anInt2986++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIILclient!hd;ILclient!hd;Lclient!hd;)V")
	public void method2035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub5 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub1_Sub5 arg6, @OriginalArg(7) Class3_Sub1_Sub5 arg7) {
		@Pc(3) Class61 local3 = new Class61();
		local3.aClass3_Sub1_Sub5_4 = arg4;
		local3.anInt2767 = arg1 * 128 + 64;
		local3.anInt2758 = arg2 * 128 + 64;
		local3.anInt2760 = arg3;
		local3.anInt2768 = arg5;
		local3.aClass3_Sub1_Sub5_3 = arg6;
		local3.aClass3_Sub1_Sub5_2 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class3_Sub4 local43 = this.aClass3_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt862; local47++) {
				if ((local43.aClass67Array1[local47].anInt2953 & 0x100) == 256 && local43.aClass67Array1[local47].aClass3_Sub1_Sub5_5 instanceof Class3_Sub1_Sub5_Sub7) {
					@Pc(71) Class3_Sub1_Sub5_Sub7 local71 = (Class3_Sub1_Sub5_Sub7) local43.aClass67Array1[local47].aClass3_Sub1_Sub5_5;
					local71.method1475();
					if (local71.anInt2680 > local34) {
						local34 = local71.anInt2680;
					}
				}
			}
		}
		local3.anInt2765 = local34;
		if (this.aClass3_Sub4ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass3_Sub4ArrayArrayArray1[arg0][arg1][arg2] = new Class3_Sub4(arg0, arg1, arg2);
		}
		this.aClass3_Sub4ArrayArrayArray1[arg0][arg1][arg2].aClass61_1 = local3;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIII)V")
	public void method2037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt2987 * 128) {
			arg0 = this.anInt2987 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt2976 * 128) {
			arg2 = this.anInt2976 * 128 - 1;
		}
		Static112.anInt2985++;
		Static112.anInt2975 = Class3_Sub1_Sub4_Sub4.anIntArray391[arg3];
		Static112.anInt2992 = Class3_Sub1_Sub4_Sub4.anIntArray392[arg3];
		Static112.anInt2969 = Class3_Sub1_Sub4_Sub4.anIntArray391[arg4];
		Static112.anInt2981 = Class3_Sub1_Sub4_Sub4.anIntArray392[arg4];
		Static112.aBooleanArrayArray1 = Static112.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static112.anInt2972 = arg0;
		Static112.anInt2994 = arg1;
		Static112.anInt2979 = arg2;
		Static112.anInt2974 = arg0 / 128;
		Static112.anInt2983 = arg2 / 128;
		Static112.anInt2973 = arg5;
		Static112.anInt2990 = Static112.anInt2974 - 25;
		if (Static112.anInt2990 < 0) {
			Static112.anInt2990 = 0;
		}
		Static112.anInt2978 = Static112.anInt2983 - 25;
		if (Static112.anInt2978 < 0) {
			Static112.anInt2978 = 0;
		}
		Static112.anInt2991 = Static112.anInt2974 + 25;
		if (Static112.anInt2991 > this.anInt2987) {
			Static112.anInt2991 = this.anInt2987;
		}
		Static112.anInt2993 = Static112.anInt2983 + 25;
		if (Static112.anInt2993 > this.anInt2976) {
			Static112.anInt2993 = this.anInt2976;
		}
		this.method2033();
		Static112.anInt2970 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt2977; local128 < this.anInt2988; local128++) {
			@Pc(134) Class3_Sub4[][] local134 = this.aClass3_Sub4ArrayArrayArray1[local128];
			for (local136 = Static112.anInt2990; local136 < Static112.anInt2991; local136++) {
				for (local139 = Static112.anInt2978; local139 < Static112.anInt2993; local139++) {
					@Pc(146) Class3_Sub4 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt859 <= arg5 && (Static112.aBooleanArrayArray1[local136 + 25 - Static112.anInt2974][local139 + 25 - Static112.anInt2983] || this.anIntArrayArrayArray5[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean45 = true;
							local146.aBoolean44 = true;
							if (local146.anInt862 > 0) {
								local146.aBoolean43 = true;
							} else {
								local146.aBoolean43 = false;
							}
							Static112.anInt2970++;
						} else {
							local146.aBoolean45 = false;
							local146.aBoolean44 = false;
							local146.anInt865 = 0;
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
		for (@Pc(224) int local224 = this.anInt2977; local224 < this.anInt2988; local224++) {
			@Pc(230) Class3_Sub4[][] local230 = this.aClass3_Sub4ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static112.anInt2974 + local139;
				local241 = Static112.anInt2974 - local139;
				if (local237 >= Static112.anInt2990 || local241 < Static112.anInt2991) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static112.anInt2983 + local249;
						local258 = Static112.anInt2983 - local249;
						@Pc(270) Class3_Sub4 local270;
						if (local237 >= Static112.anInt2990) {
							if (local254 >= Static112.anInt2978) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean45) {
									this.method2060(local270, true);
								}
							}
							if (local258 < Static112.anInt2993) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean45) {
									this.method2060(local270, true);
								}
							}
						}
						if (local241 < Static112.anInt2991) {
							if (local254 >= Static112.anInt2978) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean45) {
									this.method2060(local270, true);
								}
							}
							if (local258 < Static112.anInt2993) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean45) {
									this.method2060(local270, true);
								}
							}
						}
						if (Static112.anInt2970 == 0) {
							Static112.aBoolean163 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt2977; local136 < this.anInt2988; local136++) {
			@Pc(361) Class3_Sub4[][] local361 = this.aClass3_Sub4ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static112.anInt2974 + local237;
				local249 = Static112.anInt2974 - local237;
				if (local241 >= Static112.anInt2990 || local249 < Static112.anInt2991) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static112.anInt2983 + local254;
						@Pc(389) int local389 = Static112.anInt2983 - local254;
						@Pc(401) Class3_Sub4 local401;
						if (local241 >= Static112.anInt2990) {
							if (local258 >= Static112.anInt2978) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean45) {
									this.method2060(local401, false);
								}
							}
							if (local389 < Static112.anInt2993) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean45) {
									this.method2060(local401, false);
								}
							}
						}
						if (local249 < Static112.anInt2991) {
							if (local258 >= Static112.anInt2978) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean45) {
									this.method2060(local401, false);
								}
							}
							if (local389 < Static112.anInt2993) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean45) {
									this.method2060(local401, false);
								}
							}
						}
						if (Static112.anInt2970 == 0) {
							Static112.aBoolean163 = false;
							return;
						}
					}
				}
			}
		}
		Static112.aBoolean163 = false;
	}

	@OriginalMember(owner = "client!td", name = "j", descriptor = "(III)V")
	public void method2038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub4 local8 = this.aClass3_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass61_1 = null;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIILclient!hd;IIIIII)V")
	public void method2039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub5 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class25 local6 = new Class25();
		local6.anInt1257 = arg9;
		local6.anInt1266 = arg10;
		local6.anInt1258 = arg1 * 128 + arg7 + 64;
		local6.anInt1255 = arg2 * 128 + arg8 + 64;
		local6.anInt1260 = arg3;
		local6.aClass3_Sub1_Sub5_1 = arg4;
		local6.anInt1256 = arg5;
		local6.anInt1268 = arg6;
		for (@Pc(44) int local44 = arg0; local44 >= 0; local44--) {
			if (this.aClass3_Sub4ArrayArrayArray1[local44][arg1][arg2] == null) {
				this.aClass3_Sub4ArrayArrayArray1[local44][arg1][arg2] = new Class3_Sub4(local44, arg1, arg2);
			}
		}
		this.aClass3_Sub4ArrayArrayArray1[arg0][arg1][arg2].aClass25_1 = local6;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(IIII)Z")
	private boolean method2040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method2054(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method2051(local11 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2] - arg3, local15 + 1) && this.method2051(local11 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method2051(local11 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method2051(local11 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!td", name = "k", descriptor = "(III)V")
	public void method2041() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2988; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt2987; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt2976; local7++) {
					@Pc(17) Class3_Sub4 local17 = this.aClass3_Sub4ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class68 local22 = local17.aClass68_1;
						if (local22 != null && local22.aClass3_Sub1_Sub5_6 instanceof Class3_Sub1_Sub5_Sub2) {
							@Pc(32) Class3_Sub1_Sub5_Sub2 local32 = (Class3_Sub1_Sub5_Sub2) local22.aClass3_Sub1_Sub5_6;
							this.method2018(local32, local1, local4, local7, 1, 1);
							if (local22.aClass3_Sub1_Sub5_7 instanceof Class3_Sub1_Sub5_Sub2) {
								@Pc(48) Class3_Sub1_Sub5_Sub2 local48 = (Class3_Sub1_Sub5_Sub2) local22.aClass3_Sub1_Sub5_7;
								this.method2018(local48, local1, local4, local7, 1, 1);
								Static34.method692(local32, local48, 0, 0, 0, false);
								local22.aClass3_Sub1_Sub5_7 = local48.method688(local48.aShort2, local48.aShort1, -50, -10, -50);
							}
							local22.aClass3_Sub1_Sub5_6 = local32.method688(local32.aShort2, local32.aShort1, -50, -10, -50);
						}
						@Pc(103) Class3_Sub1_Sub5_Sub2 local103;
						for (@Pc(87) int local87 = 0; local87 < local17.anInt862; local87++) {
							@Pc(93) Class67 local93 = local17.aClass67Array1[local87];
							if (local93 != null && local93.aClass3_Sub1_Sub5_5 instanceof Class3_Sub1_Sub5_Sub2) {
								local103 = (Class3_Sub1_Sub5_Sub2) local93.aClass3_Sub1_Sub5_5;
								this.method2018(local103, local1, local4, local7, local93.anInt2949 + 1 - local93.anInt2951, local93.anInt2941 - local93.anInt2933 + 1);
								local93.aClass3_Sub1_Sub5_5 = local103.method688(local103.aShort2, local103.aShort1, -50, -10, -50);
							}
						}
						@Pc(142) Class74 local142 = local17.aClass74_1;
						if (local142 != null && local142.aClass3_Sub1_Sub5_8 instanceof Class3_Sub1_Sub5_Sub2) {
							local103 = (Class3_Sub1_Sub5_Sub2) local142.aClass3_Sub1_Sub5_8;
							this.method2026(local103, local1, local4, local7);
							local142.aClass3_Sub1_Sub5_8 = local103.method688(local103.aShort2, local103.aShort1, -50, -10, -50);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "l", descriptor = "(III)I")
	public int method2042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub4 local8 = this.aClass3_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass68_1 == null ? 0 : local8.aClass68_1.anInt2957;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(IIII)V")
	public void method2043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub4 local8 = this.aClass3_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class25 local14 = local8.aClass25_1;
		if (local14 != null) {
			@Pc(23) int local23 = arg1 * 128 + 64;
			@Pc(29) int local29 = arg2 * 128 + 64;
			local14.anInt1258 = local23 + (local14.anInt1258 - local23) * arg3 / 16;
			local14.anInt1255 = local29 + (local14.anInt1255 - local29) * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!td", name = "m", descriptor = "(III)V")
	public void method2044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub4 local8 = this.aClass3_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass68_1 = null;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIILclient!hd;III)Z")
	public boolean method2045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub1_Sub5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method2061(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(IIIIII)Z")
	private boolean method2046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray4[arg0][local17][local21] == -Static112.anInt2985) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray5[arg0][arg1][arg3] - arg5;
			if (!this.method2051(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method2051(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method2051(local21, local167, local195)) {
				return false;
			} else if (this.method2051(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method2054(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method2051(local17 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg3] - arg5, local21 + 1) && this.method2051(local17 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method2051(local17 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method2051(local17 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!td", name = "n", descriptor = "(III)I")
	public int method2047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub4 local8 = this.aClass3_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass25_1 == null ? 0 : local8.aClass25_1.anInt1257;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIILclient!hd;IIZ)Z")
	public boolean method2048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class3_Sub1_Sub5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method2061(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIILclient!hd;II)V")
	public void method2050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub5 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class74 local6 = new Class74();
		local6.aClass3_Sub1_Sub5_8 = arg4;
		local6.anInt3180 = arg1 * 128 + 64;
		local6.anInt3182 = arg2 * 128 + 64;
		local6.anInt3176 = arg3;
		local6.anInt3174 = arg5;
		local6.anInt3175 = arg6;
		if (this.aClass3_Sub4ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass3_Sub4ArrayArrayArray1[arg0][arg1][arg2] = new Class3_Sub4(arg0, arg1, arg2);
		}
		this.aClass3_Sub4ArrayArrayArray1[arg0][arg1][arg2].aClass74_1 = local6;
	}

	@OriginalMember(owner = "client!td", name = "o", descriptor = "(III)Z")
	private boolean method2051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static112.anInt2986; local1++) {
			@Pc(6) Class14 local6 = Static112.aClass14Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt444 == 1) {
				local15 = local6.anInt448 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt441 + (local6.anInt431 * local15 >> 8);
					local37 = local6.anInt433 + (local6.anInt438 * local15 >> 8);
					local47 = local6.anInt432 + (local6.anInt453 * local15 >> 8);
					local57 = local6.anInt430 + (local6.anInt445 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt444 == 2) {
				local15 = arg0 - local6.anInt448;
				if (local15 > 0) {
					local27 = local6.anInt441 + (local6.anInt431 * local15 >> 8);
					local37 = local6.anInt433 + (local6.anInt438 * local15 >> 8);
					local47 = local6.anInt432 + (local6.anInt453 * local15 >> 8);
					local57 = local6.anInt430 + (local6.anInt445 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt444 == 3) {
				local15 = local6.anInt441 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt448 + (local6.anInt452 * local15 >> 8);
					local37 = local6.anInt447 + (local6.anInt435 * local15 >> 8);
					local47 = local6.anInt432 + (local6.anInt453 * local15 >> 8);
					local57 = local6.anInt430 + (local6.anInt445 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt444 == 4) {
				local15 = arg2 - local6.anInt441;
				if (local15 > 0) {
					local27 = local6.anInt448 + (local6.anInt452 * local15 >> 8);
					local37 = local6.anInt447 + (local6.anInt435 * local15 >> 8);
					local47 = local6.anInt432 + (local6.anInt453 * local15 >> 8);
					local57 = local6.anInt430 + (local6.anInt445 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt444 == 5) {
				local15 = arg1 - local6.anInt432;
				if (local15 > 0) {
					local27 = local6.anInt448 + (local6.anInt452 * local15 >> 8);
					local37 = local6.anInt447 + (local6.anInt435 * local15 >> 8);
					local47 = local6.anInt441 + (local6.anInt431 * local15 >> 8);
					local57 = local6.anInt433 + (local6.anInt438 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "()V")
	public void method2052() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt2988; local1++) {
			for (local4 = 0; local4 < this.anInt2987; local4++) {
				for (local7 = 0; local7 < this.anInt2976; local7++) {
					this.aClass3_Sub4ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static112.anInt2971; local4++) {
			for (local7 = 0; local7 < Static112.anIntArray354[local4]; local7++) {
				Static112.aClass14ArrayArray1[local4][local7] = null;
			}
			Static112.anIntArray354[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt2968; local7++) {
			this.aClass67Array2[local7] = null;
		}
		this.anInt2968 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static112.aClass67Array3.length; local76++) {
			Static112.aClass67Array3[local76] = null;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([IIIIII)V")
	public void method2053(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class3_Sub4 local8 = this.aClass3_Sub4ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class5 local14 = local8.aClass5_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt203;
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
		@Pc(59) Class51 local59 = local8.aClass51_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt2250;
		@Pc(68) int local68 = local59.anInt2253;
		@Pc(71) int local71 = local59.anInt2252;
		@Pc(74) int local74 = local59.anInt2251;
		@Pc(79) int[] local79 = this.anIntArrayArray27[local24];
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

	@OriginalMember(owner = "client!td", name = "p", descriptor = "(III)Z")
	private boolean method2054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray4[arg0][arg1][arg2];
		if (local8 == -Static112.anInt2985) {
			return false;
		} else if (local8 == Static112.anInt2985) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method2051(local23 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2], local27 + 1) && this.method2051(local23 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2], local27 + 1) && this.method2051(local23 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method2051(local23 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray4[arg0][arg1][arg2] = Static112.anInt2985;
				return true;
			} else {
				this.anIntArrayArrayArray4[arg0][arg1][arg2] = -Static112.anInt2985;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "q", descriptor = "(III)V")
	public void method2055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static112.aBoolean163 = true;
		Static112.anInt2982 = arg0;
		Static112.anInt2967 = arg1;
		Static112.anInt2980 = arg2;
		Static112.anInt2989 = -1;
		Static112.anInt2984 = -1;
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "()V")
	public void method2056() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2968; local1++) {
			@Pc(7) Class67 local7 = this.aClass67Array2[local1];
			this.method2021(local7);
			this.aClass67Array2[local1] = null;
		}
		this.anInt2968 = 0;
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(IIII)Z")
	private boolean method2057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method2054(arg0, arg1, arg2)) {
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
				if (local11 > Static112.anInt2972) {
					if (!this.method2051(local11, local26, local15)) {
						return false;
					}
					if (!this.method2051(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method2051(local11, local30, local15)) {
						return false;
					}
					if (!this.method2051(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method2051(local11, local34, local15)) {
					return false;
				}
				if (!this.method2051(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static112.anInt2979) {
					if (!this.method2051(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method2051(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method2051(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method2051(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method2051(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method2051(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static112.anInt2972) {
					if (!this.method2051(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method2051(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method2051(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method2051(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method2051(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method2051(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static112.anInt2979) {
					if (!this.method2051(local11, local26, local15)) {
						return false;
					}
					if (!this.method2051(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method2051(local11, local30, local15)) {
						return false;
					}
					if (!this.method2051(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method2051(local11, local34, local15)) {
					return false;
				}
				if (!this.method2051(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method2051(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method2051(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method2051(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method2051(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method2051(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!td", name = "r", descriptor = "(III)Lclient!tc;")
	public Class68 method2058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub4 local8 = this.aClass3_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass68_1;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!b;IIIIIII)V")
	private void method2059(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static112.anInt2972;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static112.anInt2979;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray5[arg1][arg6][arg7] - Static112.anInt2994;
		@Pc(51) int local51 = this.anIntArrayArrayArray5[arg1][arg6 + 1][arg7] - Static112.anInt2994;
		@Pc(66) int local66 = this.anIntArrayArrayArray5[arg1][arg6 + 1][arg7 + 1] - Static112.anInt2994;
		@Pc(79) int local79 = this.anIntArrayArrayArray5[arg1][arg6][arg7 + 1] - Static112.anInt2994;
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
		@Pc(279) int local279 = Static127.anInt3251 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static127.anInt3248 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static127.anInt3251 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static127.anInt3248 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static127.anInt3251 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static127.anInt3248 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static127.anInt3251 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static127.anInt3248 + (local89 << 9) / local265;
		Static127.anInt3247 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static127.aBoolean181 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static127.anInt3244 || local327 > Static127.anInt3244 || local295 > Static127.anInt3244) {
				Static127.aBoolean181 = true;
			}
			if (Static112.aBoolean163 && this.method2015(Static112.anInt2967, Static112.anInt2980, local319, local335, local303, local311, local327, local295)) {
				Static112.anInt2989 = arg6;
				Static112.anInt2984 = arg7;
			}
			if (arg0.anInt193 == -1) {
				if (arg0.anInt196 != 12345678) {
					Static127.method2244(local319, local335, local303, local311, local327, local295, arg0.anInt196, arg0.anInt206, arg0.anInt198);
				}
			} else if (Static112.aBoolean164) {
				local472 = Static127.anInterface2_1.method1098(arg0.anInt193);
				Static127.method2244(local319, local335, local303, local311, local327, local295, Static112.method2030(local472, arg0.anInt196), Static112.method2030(local472, arg0.anInt206), Static112.method2030(local472, arg0.anInt198));
			} else if (arg0.aBoolean16) {
				Static127.method2236(local319, local335, local303, local311, local327, local295, arg0.anInt196, arg0.anInt206, arg0.anInt198, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt193);
			} else {
				Static127.method2236(local319, local335, local303, local311, local327, local295, arg0.anInt196, arg0.anInt206, arg0.anInt198, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt193);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static127.aBoolean181 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static127.anInt3244 || local295 > Static127.anInt3244 || local327 > Static127.anInt3244) {
			Static127.aBoolean181 = true;
		}
		if (Static112.aBoolean163 && this.method2015(Static112.anInt2967, Static112.anInt2980, local287, local303, local335, local279, local295, local327)) {
			Static112.anInt2989 = arg6;
			Static112.anInt2984 = arg7;
		}
		if (arg0.anInt193 != -1) {
			if (!Static112.aBoolean164) {
				Static127.method2236(local287, local303, local335, local279, local295, local327, arg0.anInt194, arg0.anInt198, arg0.anInt206, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt193);
				return;
			}
			local472 = Static127.anInterface2_1.method1098(arg0.anInt193);
			Static127.method2244(local287, local303, local335, local279, local295, local327, Static112.method2030(local472, arg0.anInt194), Static112.method2030(local472, arg0.anInt198), Static112.method2030(local472, arg0.anInt206));
		} else if (arg0.anInt194 != 12345678) {
			Static127.method2244(local287, local303, local335, local279, local295, local327, arg0.anInt194, arg0.anInt198, arg0.anInt206);
			return;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!db;Z)V")
	private void method2060(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) boolean arg1) {
		Static112.aClass65_74.method1955(arg0);
		while (true) {
			@Pc(8) Class3_Sub4 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class3_Sub4[][] local31;
			@Pc(49) Class3_Sub4 local49;
			@Pc(251) int local251;
			@Pc(588) int local588;
			@Pc(593) int local593;
			@Pc(598) int local598;
			@Pc(601) int local601;
			@Pc(610) int local610;
			@Pc(952) Class68 local952;
			@Pc(1126) int local1126;
			@Pc(1011) int local1011;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class67 var12;
										@Pc(622) int var19;
										@Pc(345) int var23;
										@Pc(289) boolean var24;
										@Pc(833) Class3_Sub4 var35;
										while (true) {
											do {
												local8 = (Class3_Sub4) Static112.aClass65_74.method1959();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean44);
											local17 = local8.anInt858;
											local20 = local8.anInt855;
											local23 = local8.anInt861;
											local26 = local8.anInt863;
											local31 = this.aClass3_Sub4ArrayArrayArray1[local23];
											if (!local8.aBoolean45) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass3_Sub4ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean44) {
														continue;
													}
												}
												if (local17 <= Static112.anInt2974 && local17 > Static112.anInt2990) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean44 && (local49.aBoolean45 || (local8.anInt856 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static112.anInt2974 && local17 < Static112.anInt2991 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean44 && (local49.aBoolean45 || (local8.anInt856 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static112.anInt2983 && local20 > Static112.anInt2978) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean44 && (local49.aBoolean45 || (local8.anInt856 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static112.anInt2983 && local20 < Static112.anInt2993 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean44 && (local49.aBoolean45 || (local8.anInt856 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean45 = false;
											if (local8.aClass3_Sub4_1 != null) {
												local49 = local8.aClass3_Sub4_1;
												if (local49.aClass5_1 == null) {
													if (local49.aClass51_1 != null && !this.method2054(0, local17, local20)) {
														this.method2032(local49.aClass51_1, Static112.anInt2975, Static112.anInt2992, Static112.anInt2969, Static112.anInt2981, local17, local20);
													}
												} else if (!this.method2054(0, local17, local20)) {
													this.method2059(local49.aClass5_1, 0, Static112.anInt2975, Static112.anInt2992, Static112.anInt2969, Static112.anInt2981, local17, local20);
												}
												@Pc(225) Class68 local225 = local49.aClass68_1;
												if (local225 != null) {
													local225.aClass3_Sub1_Sub5_6.method1869(0, Static112.anInt2975, Static112.anInt2992, Static112.anInt2969, Static112.anInt2981, local225.anInt2956 - Static112.anInt2972, local225.anInt2958 - Static112.anInt2994, local225.anInt2962 - Static112.anInt2979, local225.anInt2957);
												}
												for (local251 = 0; local251 < local49.anInt862; local251++) {
													var12 = local49.aClass67Array1[local251];
													if (var12 != null) {
														var12.aClass3_Sub1_Sub5_5.method1869(var12.anInt2939, Static112.anInt2975, Static112.anInt2992, Static112.anInt2969, Static112.anInt2981, var12.anInt2947 - Static112.anInt2972, var12.anInt2937 - Static112.anInt2994, var12.anInt2950 - Static112.anInt2979, var12.anInt2952);
													}
												}
											}
											var24 = false;
											if (local8.aClass5_1 == null) {
												if (local8.aClass51_1 != null && !this.method2054(local26, local17, local20)) {
													var24 = true;
													this.method2032(local8.aClass51_1, Static112.anInt2975, Static112.anInt2992, Static112.anInt2969, Static112.anInt2981, local17, local20);
												}
											} else if (!this.method2054(local26, local17, local20)) {
												var24 = true;
												if (local8.aClass5_1.anInt196 != 12345678 || Static112.aBoolean163 && local23 <= Static112.anInt2982) {
													this.method2059(local8.aClass5_1, local26, Static112.anInt2975, Static112.anInt2992, Static112.anInt2969, Static112.anInt2981, local17, local20);
												}
											}
											var23 = 0;
											local251 = 0;
											@Pc(350) Class68 local350 = local8.aClass68_1;
											@Pc(353) Class25 local353 = local8.aClass25_1;
											if (local350 != null || local353 != null) {
												if (Static112.anInt2974 == local17) {
													var23++;
												} else if (Static112.anInt2974 < local17) {
													var23 += 2;
												}
												if (Static112.anInt2983 == local20) {
													var23 += 3;
												} else if (Static112.anInt2983 > local20) {
													var23 += 6;
												}
												local251 = Static112.anIntArray361[var23];
												local8.anInt864 = Static112.anIntArray357[var23];
											}
											if (local350 != null) {
												if ((local350.anInt2966 & Static112.anIntArray363[var23]) == 0) {
													local8.anInt865 = 0;
												} else if (local350.anInt2966 == 16) {
													local8.anInt865 = 3;
													local8.anInt857 = Static112.anIntArray362[var23];
													local8.anInt854 = 3 - local8.anInt857;
												} else if (local350.anInt2966 == 32) {
													local8.anInt865 = 6;
													local8.anInt857 = Static112.anIntArray359[var23];
													local8.anInt854 = 6 - local8.anInt857;
												} else if (local350.anInt2966 == 64) {
													local8.anInt865 = 12;
													local8.anInt857 = Static112.anIntArray360[var23];
													local8.anInt854 = 12 - local8.anInt857;
												} else {
													local8.anInt865 = 9;
													local8.anInt857 = Static112.anIntArray358[var23];
													local8.anInt854 = 9 - local8.anInt857;
												}
												if ((local350.anInt2966 & local251) != 0 && !this.method2057(local26, local17, local20, local350.anInt2966)) {
													local350.aClass3_Sub1_Sub5_6.method1869(0, Static112.anInt2975, Static112.anInt2992, Static112.anInt2969, Static112.anInt2981, local350.anInt2956 - Static112.anInt2972, local350.anInt2958 - Static112.anInt2994, local350.anInt2962 - Static112.anInt2979, local350.anInt2957);
												}
												if ((local350.anInt2963 & local251) != 0 && !this.method2057(local26, local17, local20, local350.anInt2963)) {
													local350.aClass3_Sub1_Sub5_7.method1869(0, Static112.anInt2975, Static112.anInt2992, Static112.anInt2969, Static112.anInt2981, local350.anInt2956 - Static112.anInt2972, local350.anInt2958 - Static112.anInt2994, local350.anInt2962 - Static112.anInt2979, local350.anInt2957);
												}
											}
											if (local353 != null && !this.method2040(local26, local17, local20, local353.aClass3_Sub1_Sub5_1.anInt2680)) {
												if ((local353.anInt1256 & local251) != 0) {
													local353.aClass3_Sub1_Sub5_1.method1869(local353.anInt1268, Static112.anInt2975, Static112.anInt2992, Static112.anInt2969, Static112.anInt2981, local353.anInt1258 - Static112.anInt2972, local353.anInt1260 - Static112.anInt2994, local353.anInt1255 - Static112.anInt2979, local353.anInt1257);
												} else if ((local353.anInt1256 & 0x300) != 0) {
													local588 = local353.anInt1258 - Static112.anInt2972;
													local593 = local353.anInt1260 - Static112.anInt2994;
													local598 = local353.anInt1255 - Static112.anInt2979;
													local601 = local353.anInt1268;
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
													if ((local353.anInt1256 & 0x100) != 0 && var19 < local610) {
														local639 = local588 + Static112.anIntArray352[local601];
														local645 = local598 + Static112.anIntArray356[local601];
														local353.aClass3_Sub1_Sub5_1.method1869(local601 * 512 + 256, Static112.anInt2975, Static112.anInt2992, Static112.anInt2969, Static112.anInt2981, local639, local593, local645, local353.anInt1257);
													}
													if ((local353.anInt1256 & 0x200) != 0 && var19 > local610) {
														local639 = local588 + Static112.anIntArray355[local601];
														local645 = local598 + Static112.anIntArray353[local601];
														local353.aClass3_Sub1_Sub5_1.method1869(local601 * 512 + 1280 & 0x7FF, Static112.anInt2975, Static112.anInt2992, Static112.anInt2969, Static112.anInt2981, local639, local593, local645, local353.anInt1257);
													}
												}
											}
											if (var24) {
												@Pc(706) Class74 local706 = local8.aClass74_1;
												if (local706 != null) {
													local706.aClass3_Sub1_Sub5_8.method1869(0, Static112.anInt2975, Static112.anInt2992, Static112.anInt2969, Static112.anInt2981, local706.anInt3180 - Static112.anInt2972, local706.anInt3176 - Static112.anInt2994, local706.anInt3182 - Static112.anInt2979, local706.anInt3174);
												}
												@Pc(733) Class61 local733 = local8.aClass61_1;
												if (local733 != null && local733.anInt2765 == 0) {
													if (local733.aClass3_Sub1_Sub5_3 != null) {
														local733.aClass3_Sub1_Sub5_3.method1869(0, Static112.anInt2975, Static112.anInt2992, Static112.anInt2969, Static112.anInt2981, local733.anInt2767 - Static112.anInt2972, local733.anInt2760 - Static112.anInt2994, local733.anInt2758 - Static112.anInt2979, local733.anInt2768);
													}
													if (local733.aClass3_Sub1_Sub5_2 != null) {
														local733.aClass3_Sub1_Sub5_2.method1869(0, Static112.anInt2975, Static112.anInt2992, Static112.anInt2969, Static112.anInt2981, local733.anInt2767 - Static112.anInt2972, local733.anInt2760 - Static112.anInt2994, local733.anInt2758 - Static112.anInt2979, local733.anInt2768);
													}
													if (local733.aClass3_Sub1_Sub5_4 != null) {
														local733.aClass3_Sub1_Sub5_4.method1869(0, Static112.anInt2975, Static112.anInt2992, Static112.anInt2969, Static112.anInt2981, local733.anInt2767 - Static112.anInt2972, local733.anInt2760 - Static112.anInt2994, local733.anInt2758 - Static112.anInt2979, local733.anInt2768);
													}
												}
											}
											local588 = local8.anInt856;
											if (local588 != 0) {
												if (local17 < Static112.anInt2974 && (local588 & 0x4) != 0) {
													var35 = local31[local17 + 1][local20];
													if (var35 != null && var35.aBoolean44) {
														Static112.aClass65_74.method1955(var35);
													}
												}
												if (local20 < Static112.anInt2983 && (local588 & 0x2) != 0) {
													var35 = local31[local17][local20 + 1];
													if (var35 != null && var35.aBoolean44) {
														Static112.aClass65_74.method1955(var35);
													}
												}
												if (local17 > Static112.anInt2974 && (local588 & 0x1) != 0) {
													var35 = local31[local17 - 1][local20];
													if (var35 != null && var35.aBoolean44) {
														Static112.aClass65_74.method1955(var35);
													}
												}
												if (local20 > Static112.anInt2983 && (local588 & 0x8) != 0) {
													var35 = local31[local17][local20 - 1];
													if (var35 != null && var35.aBoolean44) {
														Static112.aClass65_74.method1955(var35);
													}
												}
											}
											break;
										}
										if (local8.anInt865 != 0) {
											var24 = true;
											for (var23 = 0; var23 < local8.anInt862; var23++) {
												if (local8.aClass67Array1[var23].anInt2945 != Static112.anInt2985 && (local8.anIntArray77[var23] & local8.anInt865) == local8.anInt857) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												local952 = local8.aClass68_1;
												if (!this.method2057(local26, local17, local20, local952.anInt2966)) {
													local952.aClass3_Sub1_Sub5_6.method1869(0, Static112.anInt2975, Static112.anInt2992, Static112.anInt2969, Static112.anInt2981, local952.anInt2956 - Static112.anInt2972, local952.anInt2958 - Static112.anInt2994, local952.anInt2962 - Static112.anInt2979, local952.anInt2957);
												}
												local8.anInt865 = 0;
											}
										}
										if (!local8.aBoolean43) {
											break;
										}
										try {
											@Pc(991) int local991 = local8.anInt862;
											local8.aBoolean43 = false;
											var23 = 0;
											label568: for (local251 = 0; local251 < local991; local251++) {
												var12 = local8.aClass67Array1[local251];
												if (var12.anInt2945 != Static112.anInt2985) {
													for (local1011 = var12.anInt2951; local1011 <= var12.anInt2949; local1011++) {
														for (local588 = var12.anInt2933; local588 <= var12.anInt2941; local588++) {
															var35 = local31[local1011][local588];
															if (var35.aBoolean45) {
																local8.aBoolean43 = true;
																continue label568;
															}
															if (var35.anInt865 != 0) {
																local598 = 0;
																if (local1011 > var12.anInt2951) {
																	local598++;
																}
																if (local1011 < var12.anInt2949) {
																	local598 += 4;
																}
																if (local588 > var12.anInt2933) {
																	local598 += 8;
																}
																if (local588 < var12.anInt2941) {
																	local598 += 2;
																}
																if ((local598 & var35.anInt865) == local8.anInt854) {
																	local8.aBoolean43 = true;
																	continue label568;
																}
															}
														}
													}
													Static112.aClass67Array3[var23++] = var12;
													local588 = Static112.anInt2974 - var12.anInt2951;
													local593 = var12.anInt2949 - Static112.anInt2974;
													if (local593 > local588) {
														local588 = local593;
													}
													local598 = Static112.anInt2983 - var12.anInt2933;
													local601 = var12.anInt2941 - Static112.anInt2983;
													if (local601 > local598) {
														var12.anInt2936 = local588 + local601;
													} else {
														var12.anInt2936 = local588 + local598;
													}
												}
											}
											while (var23 > 0) {
												local1126 = -50;
												local1011 = -1;
												@Pc(1135) Class67 local1135;
												for (local588 = 0; local588 < var23; local588++) {
													local1135 = Static112.aClass67Array3[local588];
													if (local1135.anInt2945 != Static112.anInt2985) {
														if (local1135.anInt2936 > local1126) {
															local1126 = local1135.anInt2936;
															local1011 = local588;
														} else if (local1135.anInt2936 == local1126) {
															local598 = local1135.anInt2947 - Static112.anInt2972;
															local601 = local1135.anInt2950 - Static112.anInt2979;
															local610 = Static112.aClass67Array3[local1011].anInt2947 - Static112.anInt2972;
															var19 = Static112.aClass67Array3[local1011].anInt2950 - Static112.anInt2979;
															if (local598 * local598 + local601 * local601 > local610 * local610 + var19 * var19) {
																local1011 = local588;
															}
														}
													}
												}
												if (local1011 == -1) {
													break;
												}
												local1135 = Static112.aClass67Array3[local1011];
												local1135.anInt2945 = Static112.anInt2985;
												if (!this.method2046(local26, local1135.anInt2951, local1135.anInt2949, local1135.anInt2933, local1135.anInt2941, local1135.aClass3_Sub1_Sub5_5.anInt2680)) {
													local1135.aClass3_Sub1_Sub5_5.method1869(local1135.anInt2939, Static112.anInt2975, Static112.anInt2992, Static112.anInt2969, Static112.anInt2981, local1135.anInt2947 - Static112.anInt2972, local1135.anInt2937 - Static112.anInt2994, local1135.anInt2950 - Static112.anInt2979, local1135.anInt2952);
												}
												for (local598 = local1135.anInt2951; local598 <= local1135.anInt2949; local598++) {
													for (local601 = local1135.anInt2933; local601 <= local1135.anInt2941; local601++) {
														@Pc(1260) Class3_Sub4 local1260 = local31[local598][local601];
														if (local1260.anInt865 != 0) {
															Static112.aClass65_74.method1955(local1260);
														} else if ((local598 != local17 || local601 != local20) && local1260.aBoolean44) {
															Static112.aClass65_74.method1955(local1260);
														}
													}
												}
											}
											if (!local8.aBoolean43) {
												break;
											}
										} catch (@Pc(1298) Exception local1298) {
											local8.aBoolean43 = false;
											break;
										}
									}
								} while (!local8.aBoolean44);
							} while (local8.anInt865 != 0);
							if (local17 > Static112.anInt2974 || local17 <= Static112.anInt2990) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean44);
						if (local17 < Static112.anInt2974 || local17 >= Static112.anInt2991 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean44);
					if (local20 > Static112.anInt2983 || local20 <= Static112.anInt2978) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean44);
				if (local20 < Static112.anInt2983 || local20 >= Static112.anInt2993 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean44);
			local8.aBoolean44 = false;
			Static112.anInt2970--;
			@Pc(1402) Class61 local1402 = local8.aClass61_1;
			if (local1402 != null && local1402.anInt2765 != 0) {
				if (local1402.aClass3_Sub1_Sub5_3 != null) {
					local1402.aClass3_Sub1_Sub5_3.method1869(0, Static112.anInt2975, Static112.anInt2992, Static112.anInt2969, Static112.anInt2981, local1402.anInt2767 - Static112.anInt2972, local1402.anInt2760 - Static112.anInt2994 - local1402.anInt2765, local1402.anInt2758 - Static112.anInt2979, local1402.anInt2768);
				}
				if (local1402.aClass3_Sub1_Sub5_2 != null) {
					local1402.aClass3_Sub1_Sub5_2.method1869(0, Static112.anInt2975, Static112.anInt2992, Static112.anInt2969, Static112.anInt2981, local1402.anInt2767 - Static112.anInt2972, local1402.anInt2760 - Static112.anInt2994 - local1402.anInt2765, local1402.anInt2758 - Static112.anInt2979, local1402.anInt2768);
				}
				if (local1402.aClass3_Sub1_Sub5_4 != null) {
					local1402.aClass3_Sub1_Sub5_4.method1869(0, Static112.anInt2975, Static112.anInt2992, Static112.anInt2969, Static112.anInt2981, local1402.anInt2767 - Static112.anInt2972, local1402.anInt2760 - Static112.anInt2994 - local1402.anInt2765, local1402.anInt2758 - Static112.anInt2979, local1402.anInt2768);
				}
			}
			if (local8.anInt864 != 0) {
				@Pc(1497) Class25 local1497 = local8.aClass25_1;
				if (local1497 != null && !this.method2040(local26, local17, local20, local1497.aClass3_Sub1_Sub5_1.anInt2680)) {
					if ((local1497.anInt1256 & local8.anInt864) != 0) {
						local1497.aClass3_Sub1_Sub5_1.method1869(local1497.anInt1268, Static112.anInt2975, Static112.anInt2992, Static112.anInt2969, Static112.anInt2981, local1497.anInt1258 - Static112.anInt2972, local1497.anInt1260 - Static112.anInt2994, local1497.anInt1255 - Static112.anInt2979, local1497.anInt1257);
					} else if ((local1497.anInt1256 & 0x300) != 0) {
						local251 = local1497.anInt1258 - Static112.anInt2972;
						local1126 = local1497.anInt1260 - Static112.anInt2994;
						local1011 = local1497.anInt1255 - Static112.anInt2979;
						local588 = local1497.anInt1268;
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
						if ((local1497.anInt1256 & 0x100) != 0 && local598 >= local593) {
							local601 = local251 + Static112.anIntArray352[local588];
							local610 = local1011 + Static112.anIntArray356[local588];
							local1497.aClass3_Sub1_Sub5_1.method1869(local588 * 512 + 256, Static112.anInt2975, Static112.anInt2992, Static112.anInt2969, Static112.anInt2981, local601, local1126, local610, local1497.anInt1257);
						}
						if ((local1497.anInt1256 & 0x200) != 0 && local598 <= local593) {
							local601 = local251 + Static112.anIntArray355[local588];
							local610 = local1011 + Static112.anIntArray353[local588];
							local1497.aClass3_Sub1_Sub5_1.method1869(local588 * 512 + 1280 & 0x7FF, Static112.anInt2975, Static112.anInt2992, Static112.anInt2969, Static112.anInt2981, local601, local1126, local610, local1497.anInt1257);
						}
					}
				}
				local952 = local8.aClass68_1;
				if (local952 != null) {
					if ((local952.anInt2963 & local8.anInt864) != 0 && !this.method2057(local26, local17, local20, local952.anInt2963)) {
						local952.aClass3_Sub1_Sub5_7.method1869(0, Static112.anInt2975, Static112.anInt2992, Static112.anInt2969, Static112.anInt2981, local952.anInt2956 - Static112.anInt2972, local952.anInt2958 - Static112.anInt2994, local952.anInt2962 - Static112.anInt2979, local952.anInt2957);
					}
					if ((local952.anInt2966 & local8.anInt864) != 0 && !this.method2057(local26, local17, local20, local952.anInt2966)) {
						local952.aClass3_Sub1_Sub5_6.method1869(0, Static112.anInt2975, Static112.anInt2992, Static112.anInt2969, Static112.anInt2981, local952.anInt2956 - Static112.anInt2972, local952.anInt2958 - Static112.anInt2994, local952.anInt2962 - Static112.anInt2979, local952.anInt2957);
					}
				}
			}
			@Pc(1755) Class3_Sub4 local1755;
			if (local23 < this.anInt2988 - 1) {
				local1755 = this.aClass3_Sub4ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1755 != null && local1755.aBoolean44) {
					Static112.aClass65_74.method1955(local1755);
				}
			}
			if (local17 < Static112.anInt2974) {
				local1755 = local31[local17 + 1][local20];
				if (local1755 != null && local1755.aBoolean44) {
					Static112.aClass65_74.method1955(local1755);
				}
			}
			if (local20 < Static112.anInt2983) {
				local1755 = local31[local17][local20 + 1];
				if (local1755 != null && local1755.aBoolean44) {
					Static112.aClass65_74.method1955(local1755);
				}
			}
			if (local17 > Static112.anInt2974) {
				local1755 = local31[local17 - 1][local20];
				if (local1755 != null && local1755.aBoolean44) {
					Static112.aClass65_74.method1955(local1755);
				}
			}
			if (local20 > Static112.anInt2983) {
				local1755 = local31[local17][local20 - 1];
				if (local1755 != null && local1755.aBoolean44) {
					Static112.aClass65_74.method1955(local1755);
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIIILclient!hd;IZII)Z")
	private boolean method2061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class3_Sub1_Sub5 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt2987 || local4 >= this.anInt2976) {
					return false;
				}
				@Pc(28) Class3_Sub4 local28 = this.aClass3_Sub4ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt862 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class67 local52 = new Class67();
		local52.anInt2952 = arg11;
		local52.anInt2953 = arg12;
		local52.anInt2944 = arg0;
		local52.anInt2947 = arg5;
		local52.anInt2950 = arg6;
		local52.anInt2937 = arg7;
		local52.aClass3_Sub1_Sub5_5 = arg8;
		local52.anInt2939 = arg9;
		local52.anInt2951 = arg1;
		local52.anInt2933 = arg2;
		local52.anInt2949 = arg1 + arg3 - 1;
		local52.anInt2941 = arg2 + arg4 - 1;
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
					if (this.aClass3_Sub4ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass3_Sub4ArrayArrayArray1[local130][local98][local101] = new Class3_Sub4(local130, local98, local101);
					}
				}
				@Pc(166) Class3_Sub4 local166 = this.aClass3_Sub4ArrayArrayArray1[arg0][local98][local101];
				local166.aClass67Array1[local166.anInt862] = local52;
				local166.anIntArray77[local166.anInt862] = local104;
				local166.anInt856 |= local104;
				local166.anInt862++;
			}
		}
		if (arg10) {
			this.aClass67Array2[this.anInt2968++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "(IIII)I")
	public int method2062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub4 local8 = this.aClass3_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass68_1 != null && local8.aClass68_1.anInt2957 == arg3) {
			return local8.aClass68_1.anInt2955 & 0xFF;
		} else if (local8.aClass25_1 != null && local8.aClass25_1.anInt1257 == arg3) {
			return local8.aClass25_1.anInt1266 & 0xFF;
		} else if (local8.aClass74_1 != null && local8.aClass74_1.anInt3174 == arg3) {
			return local8.aClass74_1.anInt3175 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt862; local56++) {
				if (local8.aClass67Array1[local56].anInt2952 == arg3) {
					return local8.aClass67Array1[local56].anInt2953 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method2063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class5 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class5(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass3_Sub4ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass3_Sub4ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub4(local14, arg1, arg2);
				}
			}
			this.aClass3_Sub4ArrayArrayArray1[arg0][arg1][arg2].aClass5_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class5(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass3_Sub4ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass3_Sub4ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub4(local14, arg1, arg2);
				}
			}
			this.aClass3_Sub4ArrayArrayArray1[arg0][arg1][arg2].aClass5_1 = local12;
		} else {
			@Pc(140) Class51 local140 = new Class51(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass3_Sub4ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass3_Sub4ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub4(local14, arg1, arg2);
				}
			}
			this.aClass3_Sub4ArrayArrayArray1[arg0][arg1][arg2].aClass51_1 = local140;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	public void method2064(@OriginalArg(0) int arg0) {
		this.anInt2977 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt2987; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt2976; local7++) {
				if (this.aClass3_Sub4ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass3_Sub4ArrayArrayArray1[arg0][local4][local7] = new Class3_Sub4(arg0, local4, local7);
				}
			}
		}
	}
}
