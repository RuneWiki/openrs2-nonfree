import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class19 {

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "[Lclient!fb;")
	private final Class25[] aClass25Array2 = new Class25[5000];

	@OriginalMember(owner = "client!ea", name = "I", descriptor = "I")
	private int anInt916 = 0;

	@OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
	private int anInt912 = 0;

	@OriginalMember(owner = "client!ea", name = "S", descriptor = "[[I")
	private final int[][] anIntArrayArray16 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!ea", name = "R", descriptor = "[[I")
	private final int[][] anIntArrayArray15 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!ea", name = "Q", descriptor = "I")
	private final int anInt923;

	@OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
	private final int anInt910;

	@OriginalMember(owner = "client!ea", name = "E", descriptor = "I")
	private final int anInt914;

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "[[[Lclient!qa;")
	private final Class6_Sub14[][][] aClass6_Sub14ArrayArrayArray1;

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!ea", name = "P", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(III[[[I)V")
	public Class19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt923 = arg0;
		this.anInt910 = arg1;
		this.anInt914 = arg2;
		this.aClass6_Sub14ArrayArrayArray1 = new Class6_Sub14[arg0][arg1][arg2];
		this.anIntArrayArrayArray4 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray5 = arg3;
		this.method683();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)V")
	public void method653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class6_Sub14 local8 = this.aClass6_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class34 local14 = local8.aClass34_1;
		if (local14 != null) {
			@Pc(23) int local23 = arg1 * 128 + 64;
			@Pc(29) int local29 = arg2 * 128 + 64;
			local14.anInt1524 = local23 + (local14.anInt1524 - local23) * arg3 / 16;
			local14.anInt1521 = local29 + (local14.anInt1521 - local29) * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "()V")
	private void method654() {
		@Pc(3) int local3 = Static28.anIntArray109[Static28.anInt911];
		@Pc(7) Class74[] local7 = Static28.aClass74ArrayArray1[Static28.anInt911];
		Static28.anInt918 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class74 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt3172 == 1) {
				local27 = local16.anInt3176 + 25 - Static28.anInt903;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt3173 + 25 - Static28.anInt899;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt3168 + 25 - Static28.anInt899;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static28.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static28.anInt900 - local16.anInt3178;
						if (local79 > 32) {
							local16.anInt3183 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt3183 = 2;
							local79 = -local79;
						}
						local16.anInt3165 = (local16.anInt3166 - Static28.anInt921 << 8) / local79;
						local16.anInt3161 = (local16.anInt3180 - Static28.anInt921 << 8) / local79;
						local16.anInt3170 = (local16.anInt3174 - Static28.anInt902 << 8) / local79;
						local16.anInt3162 = (local16.anInt3164 - Static28.anInt902 << 8) / local79;
						Static28.aClass74Array1[Static28.anInt918++] = local16;
					}
				}
			} else if (local16.anInt3172 == 2) {
				local27 = local16.anInt3173 + 25 - Static28.anInt899;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt3176 + 25 - Static28.anInt903;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt3177 + 25 - Static28.anInt903;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static28.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static28.anInt921 - local16.anInt3166;
						if (local79 > 32) {
							local16.anInt3183 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt3183 = 4;
							local79 = -local79;
						}
						local16.anInt3184 = (local16.anInt3178 - Static28.anInt900 << 8) / local79;
						local16.anInt3169 = (local16.anInt3179 - Static28.anInt900 << 8) / local79;
						local16.anInt3170 = (local16.anInt3174 - Static28.anInt902 << 8) / local79;
						local16.anInt3162 = (local16.anInt3164 - Static28.anInt902 << 8) / local79;
						Static28.aClass74Array1[Static28.anInt918++] = local16;
					}
				}
			} else if (local16.anInt3172 == 4) {
				local27 = local16.anInt3174 - Static28.anInt902;
				if (local27 > 128) {
					local40 = local16.anInt3173 + 25 - Static28.anInt899;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt3168 + 25 - Static28.anInt899;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt3176 + 25 - Static28.anInt903;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt3177 + 25 - Static28.anInt903;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static28.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt3183 = 5;
							local16.anInt3184 = (local16.anInt3178 - Static28.anInt900 << 8) / local27;
							local16.anInt3169 = (local16.anInt3179 - Static28.anInt900 << 8) / local27;
							local16.anInt3165 = (local16.anInt3166 - Static28.anInt921 << 8) / local27;
							local16.anInt3161 = (local16.anInt3180 - Static28.anInt921 << 8) / local27;
							Static28.aClass74Array1[Static28.anInt918++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(IIII)V")
	public void method655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class6_Sub14 local8 = this.aClass6_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass6_Sub14ArrayArrayArray1[arg0][arg1][arg2].anInt2581 = arg3;
		}
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(IIII)Z")
	private boolean method656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method688(arg0, arg1, arg2)) {
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
				if (local11 > Static28.anInt900) {
					if (!this.method692(local11, local26, local15)) {
						return false;
					}
					if (!this.method692(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method692(local11, local30, local15)) {
						return false;
					}
					if (!this.method692(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method692(local11, local34, local15)) {
					return false;
				}
				if (!this.method692(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static28.anInt921) {
					if (!this.method692(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method692(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method692(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method692(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method692(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method692(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static28.anInt900) {
					if (!this.method692(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method692(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method692(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method692(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method692(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method692(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static28.anInt921) {
					if (!this.method692(local11, local26, local15)) {
						return false;
					}
					if (!this.method692(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method692(local11, local30, local15)) {
						return false;
					}
					if (!this.method692(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method692(local11, local34, local15)) {
					return false;
				}
				if (!this.method692(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method692(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method692(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method692(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method692(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method692(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIILclient!id;IIZ)Z")
	public boolean method657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class6_Sub3_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method684(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIILclient!id;II)V")
	public void method658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class6_Sub3_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class24 local6 = new Class24();
		local6.aClass6_Sub3_Sub1_6 = arg4;
		local6.anInt1136 = arg1 * 128 + 64;
		local6.anInt1141 = arg2 * 128 + 64;
		local6.anInt1134 = arg3;
		local6.anInt1144 = arg5;
		local6.anInt1139 = arg6;
		if (this.aClass6_Sub14ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass6_Sub14ArrayArrayArray1[arg0][arg1][arg2] = new Class6_Sub14(arg0, arg1, arg2);
		}
		this.aClass6_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass24_1 = local6;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([IIIIII)V")
	public void method659(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class6_Sub14 local8 = this.aClass6_Sub14ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class37 local14 = local8.aClass37_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt1715;
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
		@Pc(59) Class39 local59 = local8.aClass39_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt1815;
		@Pc(68) int local68 = local59.anInt1816;
		@Pc(71) int local71 = local59.anInt1817;
		@Pc(74) int local74 = local59.anInt1814;
		@Pc(79) int[] local79 = this.anIntArrayArray15[local24];
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

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIII)Z")
	private boolean method660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray4[arg0][local17][local21] == -Static28.anInt904) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray5[arg0][arg1][arg3] - arg5;
			if (!this.method692(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method692(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method692(local21, local167, local195)) {
				return false;
			} else if (this.method692(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method688(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method692(local17 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg3] - arg5, local21 + 1) && this.method692(local17 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method692(local17 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method692(local17 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	public void method661(@OriginalArg(0) int arg0) {
		this.anInt916 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt910; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt914; local7++) {
				if (this.aClass6_Sub14ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass6_Sub14ArrayArrayArray1[arg0][local4][local7] = new Class6_Sub14(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V")
	public void method662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub14 local8 = this.aClass6_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass22_1 = null;
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(III)V")
	public void method663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub14 local8 = this.aClass6_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass34_1 = null;
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "()V")
	public void method664() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt912; local1++) {
			@Pc(7) Class25 local7 = this.aClass25Array2[local1];
			this.method671(local7);
			this.aClass25Array2[local1] = null;
		}
		this.anInt912 = 0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIILclient!id;IIIIII)V")
	public void method666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class6_Sub3_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class34 local6 = new Class34();
		local6.anInt1517 = arg9;
		local6.anInt1516 = arg10;
		local6.anInt1524 = arg1 * 128 + arg7 + 64;
		local6.anInt1521 = arg2 * 128 + arg8 + 64;
		local6.anInt1525 = arg3;
		local6.aClass6_Sub3_Sub1_8 = arg4;
		local6.anInt1520 = arg5;
		local6.anInt1522 = arg6;
		for (@Pc(44) int local44 = arg0; local44 >= 0; local44--) {
			if (this.aClass6_Sub14ArrayArrayArray1[local44][arg1][arg2] == null) {
				this.aClass6_Sub14ArrayArrayArray1[local44][arg1][arg2] = new Class6_Sub14(local44, arg1, arg2);
			}
		}
		this.aClass6_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass34_1 = local6;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!qa;Z)V")
	private void method667(@OriginalArg(0) Class6_Sub14 arg0, @OriginalArg(1) boolean arg1) {
		Static28.aClass1_2.method10(arg0);
		while (true) {
			@Pc(8) Class6_Sub14 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class6_Sub14[][] local31;
			@Pc(49) Class6_Sub14 local49;
			@Pc(251) int local251;
			@Pc(588) int local588;
			@Pc(593) int local593;
			@Pc(598) int local598;
			@Pc(601) int local601;
			@Pc(610) int local610;
			@Pc(952) Class22 local952;
			@Pc(1126) int local1126;
			@Pc(1011) int local1011;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class25 var12;
										@Pc(622) int var19;
										@Pc(345) int var23;
										@Pc(289) boolean var24;
										@Pc(833) Class6_Sub14 var35;
										while (true) {
											do {
												local8 = (Class6_Sub14) Static28.aClass1_2.method9();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean133);
											local17 = local8.anInt2571;
											local20 = local8.anInt2577;
											local23 = local8.anInt2573;
											local26 = local8.anInt2567;
											local31 = this.aClass6_Sub14ArrayArrayArray1[local23];
											if (!local8.aBoolean134) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass6_Sub14ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean133) {
														continue;
													}
												}
												if (local17 <= Static28.anInt903 && local17 > Static28.anInt915) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean133 && (local49.aBoolean134 || (local8.anInt2569 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static28.anInt903 && local17 < Static28.anInt922 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean133 && (local49.aBoolean134 || (local8.anInt2569 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static28.anInt899 && local20 > Static28.anInt896) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean133 && (local49.aBoolean134 || (local8.anInt2569 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static28.anInt899 && local20 < Static28.anInt913 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean133 && (local49.aBoolean134 || (local8.anInt2569 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean134 = false;
											if (local8.aClass6_Sub14_1 != null) {
												local49 = local8.aClass6_Sub14_1;
												if (local49.aClass37_1 == null) {
													if (local49.aClass39_1 != null && !this.method688(0, local17, local20)) {
														this.method687(local49.aClass39_1, Static28.anInt905, Static28.anInt907, Static28.anInt917, Static28.anInt908, local17, local20);
													}
												} else if (!this.method688(0, local17, local20)) {
													this.method693(local49.aClass37_1, 0, Static28.anInt905, Static28.anInt907, Static28.anInt917, Static28.anInt908, local17, local20);
												}
												@Pc(225) Class22 local225 = local49.aClass22_1;
												if (local225 != null) {
													local225.aClass6_Sub3_Sub1_5.method2060(0, Static28.anInt905, Static28.anInt907, Static28.anInt917, Static28.anInt908, local225.anInt960 - Static28.anInt900, local225.anInt965 - Static28.anInt902, local225.anInt952 - Static28.anInt921, local225.anInt961);
												}
												for (local251 = 0; local251 < local49.anInt2564; local251++) {
													var12 = local49.aClass25Array3[local251];
													if (var12 != null) {
														var12.aClass6_Sub3_Sub1_7.method2060(var12.anInt1170, Static28.anInt905, Static28.anInt907, Static28.anInt917, Static28.anInt908, var12.anInt1171 - Static28.anInt900, var12.anInt1165 - Static28.anInt902, var12.anInt1161 - Static28.anInt921, var12.anInt1164);
													}
												}
											}
											var24 = false;
											if (local8.aClass37_1 == null) {
												if (local8.aClass39_1 != null && !this.method688(local26, local17, local20)) {
													var24 = true;
													this.method687(local8.aClass39_1, Static28.anInt905, Static28.anInt907, Static28.anInt917, Static28.anInt908, local17, local20);
												}
											} else if (!this.method688(local26, local17, local20)) {
												var24 = true;
												if (local8.aClass37_1.anInt1723 != 12345678 || Static28.aBoolean46 && local23 <= Static28.anInt919) {
													this.method693(local8.aClass37_1, local26, Static28.anInt905, Static28.anInt907, Static28.anInt917, Static28.anInt908, local17, local20);
												}
											}
											var23 = 0;
											local251 = 0;
											@Pc(350) Class22 local350 = local8.aClass22_1;
											@Pc(353) Class34 local353 = local8.aClass34_1;
											if (local350 != null || local353 != null) {
												if (Static28.anInt903 == local17) {
													var23++;
												} else if (Static28.anInt903 < local17) {
													var23 += 2;
												}
												if (Static28.anInt899 == local20) {
													var23 += 3;
												} else if (Static28.anInt899 > local20) {
													var23 += 6;
												}
												local251 = Static28.anIntArray116[var23];
												local8.anInt2578 = Static28.anIntArray119[var23];
											}
											if (local350 != null) {
												if ((local350.anInt957 & Static28.anIntArray115[var23]) == 0) {
													local8.anInt2576 = 0;
												} else if (local350.anInt957 == 16) {
													local8.anInt2576 = 3;
													local8.anInt2563 = Static28.anIntArray120[var23];
													local8.anInt2566 = 3 - local8.anInt2563;
												} else if (local350.anInt957 == 32) {
													local8.anInt2576 = 6;
													local8.anInt2563 = Static28.anIntArray114[var23];
													local8.anInt2566 = 6 - local8.anInt2563;
												} else if (local350.anInt957 == 64) {
													local8.anInt2576 = 12;
													local8.anInt2563 = Static28.anIntArray118[var23];
													local8.anInt2566 = 12 - local8.anInt2563;
												} else {
													local8.anInt2576 = 9;
													local8.anInt2563 = Static28.anIntArray117[var23];
													local8.anInt2566 = 9 - local8.anInt2563;
												}
												if ((local350.anInt957 & local251) != 0 && !this.method656(local26, local17, local20, local350.anInt957)) {
													local350.aClass6_Sub3_Sub1_5.method2060(0, Static28.anInt905, Static28.anInt907, Static28.anInt917, Static28.anInt908, local350.anInt960 - Static28.anInt900, local350.anInt965 - Static28.anInt902, local350.anInt952 - Static28.anInt921, local350.anInt961);
												}
												if ((local350.anInt966 & local251) != 0 && !this.method656(local26, local17, local20, local350.anInt966)) {
													local350.aClass6_Sub3_Sub1_4.method2060(0, Static28.anInt905, Static28.anInt907, Static28.anInt917, Static28.anInt908, local350.anInt960 - Static28.anInt900, local350.anInt965 - Static28.anInt902, local350.anInt952 - Static28.anInt921, local350.anInt961);
												}
											}
											if (local353 != null && !this.method673(local26, local17, local20, local353.aClass6_Sub3_Sub1_8.anInt3082)) {
												if ((local353.anInt1520 & local251) != 0) {
													local353.aClass6_Sub3_Sub1_8.method2060(local353.anInt1522, Static28.anInt905, Static28.anInt907, Static28.anInt917, Static28.anInt908, local353.anInt1524 - Static28.anInt900, local353.anInt1525 - Static28.anInt902, local353.anInt1521 - Static28.anInt921, local353.anInt1517);
												} else if ((local353.anInt1520 & 0x300) != 0) {
													local588 = local353.anInt1524 - Static28.anInt900;
													local593 = local353.anInt1525 - Static28.anInt902;
													local598 = local353.anInt1521 - Static28.anInt921;
													local601 = local353.anInt1522;
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
													if ((local353.anInt1520 & 0x100) != 0 && var19 < local610) {
														local639 = local588 + Static28.anIntArray111[local601];
														local645 = local598 + Static28.anIntArray113[local601];
														local353.aClass6_Sub3_Sub1_8.method2060(local601 * 512 + 256, Static28.anInt905, Static28.anInt907, Static28.anInt917, Static28.anInt908, local639, local593, local645, local353.anInt1517);
													}
													if ((local353.anInt1520 & 0x200) != 0 && var19 > local610) {
														local639 = local588 + Static28.anIntArray110[local601];
														local645 = local598 + Static28.anIntArray112[local601];
														local353.aClass6_Sub3_Sub1_8.method2060(local601 * 512 + 1280 & 0x7FF, Static28.anInt905, Static28.anInt907, Static28.anInt917, Static28.anInt908, local639, local593, local645, local353.anInt1517);
													}
												}
											}
											if (var24) {
												@Pc(706) Class24 local706 = local8.aClass24_1;
												if (local706 != null) {
													local706.aClass6_Sub3_Sub1_6.method2060(0, Static28.anInt905, Static28.anInt907, Static28.anInt917, Static28.anInt908, local706.anInt1136 - Static28.anInt900, local706.anInt1134 - Static28.anInt902, local706.anInt1141 - Static28.anInt921, local706.anInt1144);
												}
												@Pc(733) Class15 local733 = local8.aClass15_1;
												if (local733 != null && local733.anInt560 == 0) {
													if (local733.aClass6_Sub3_Sub1_1 != null) {
														local733.aClass6_Sub3_Sub1_1.method2060(0, Static28.anInt905, Static28.anInt907, Static28.anInt917, Static28.anInt908, local733.anInt570 - Static28.anInt900, local733.anInt561 - Static28.anInt902, local733.anInt562 - Static28.anInt921, local733.anInt565);
													}
													if (local733.aClass6_Sub3_Sub1_3 != null) {
														local733.aClass6_Sub3_Sub1_3.method2060(0, Static28.anInt905, Static28.anInt907, Static28.anInt917, Static28.anInt908, local733.anInt570 - Static28.anInt900, local733.anInt561 - Static28.anInt902, local733.anInt562 - Static28.anInt921, local733.anInt565);
													}
													if (local733.aClass6_Sub3_Sub1_2 != null) {
														local733.aClass6_Sub3_Sub1_2.method2060(0, Static28.anInt905, Static28.anInt907, Static28.anInt917, Static28.anInt908, local733.anInt570 - Static28.anInt900, local733.anInt561 - Static28.anInt902, local733.anInt562 - Static28.anInt921, local733.anInt565);
													}
												}
											}
											local588 = local8.anInt2569;
											if (local588 != 0) {
												if (local17 < Static28.anInt903 && (local588 & 0x4) != 0) {
													var35 = local31[local17 + 1][local20];
													if (var35 != null && var35.aBoolean133) {
														Static28.aClass1_2.method10(var35);
													}
												}
												if (local20 < Static28.anInt899 && (local588 & 0x2) != 0) {
													var35 = local31[local17][local20 + 1];
													if (var35 != null && var35.aBoolean133) {
														Static28.aClass1_2.method10(var35);
													}
												}
												if (local17 > Static28.anInt903 && (local588 & 0x1) != 0) {
													var35 = local31[local17 - 1][local20];
													if (var35 != null && var35.aBoolean133) {
														Static28.aClass1_2.method10(var35);
													}
												}
												if (local20 > Static28.anInt899 && (local588 & 0x8) != 0) {
													var35 = local31[local17][local20 - 1];
													if (var35 != null && var35.aBoolean133) {
														Static28.aClass1_2.method10(var35);
													}
												}
											}
											break;
										}
										if (local8.anInt2576 != 0) {
											var24 = true;
											for (var23 = 0; var23 < local8.anInt2564; var23++) {
												if (local8.aClass25Array3[var23].anInt1150 != Static28.anInt904 && (local8.anIntArray285[var23] & local8.anInt2576) == local8.anInt2563) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												local952 = local8.aClass22_1;
												if (!this.method656(local26, local17, local20, local952.anInt957)) {
													local952.aClass6_Sub3_Sub1_5.method2060(0, Static28.anInt905, Static28.anInt907, Static28.anInt917, Static28.anInt908, local952.anInt960 - Static28.anInt900, local952.anInt965 - Static28.anInt902, local952.anInt952 - Static28.anInt921, local952.anInt961);
												}
												local8.anInt2576 = 0;
											}
										}
										if (!local8.aBoolean132) {
											break;
										}
										try {
											@Pc(991) int local991 = local8.anInt2564;
											local8.aBoolean132 = false;
											var23 = 0;
											label568: for (local251 = 0; local251 < local991; local251++) {
												var12 = local8.aClass25Array3[local251];
												if (var12.anInt1150 != Static28.anInt904) {
													for (local1011 = var12.anInt1153; local1011 <= var12.anInt1159; local1011++) {
														for (local588 = var12.anInt1152; local588 <= var12.anInt1157; local588++) {
															var35 = local31[local1011][local588];
															if (var35.aBoolean134) {
																local8.aBoolean132 = true;
																continue label568;
															}
															if (var35.anInt2576 != 0) {
																local598 = 0;
																if (local1011 > var12.anInt1153) {
																	local598++;
																}
																if (local1011 < var12.anInt1159) {
																	local598 += 4;
																}
																if (local588 > var12.anInt1152) {
																	local598 += 8;
																}
																if (local588 < var12.anInt1157) {
																	local598 += 2;
																}
																if ((local598 & var35.anInt2576) == local8.anInt2566) {
																	local8.aBoolean132 = true;
																	continue label568;
																}
															}
														}
													}
													Static28.aClass25Array1[var23++] = var12;
													local588 = Static28.anInt903 - var12.anInt1153;
													local593 = var12.anInt1159 - Static28.anInt903;
													if (local593 > local588) {
														local588 = local593;
													}
													local598 = Static28.anInt899 - var12.anInt1152;
													local601 = var12.anInt1157 - Static28.anInt899;
													if (local601 > local598) {
														var12.anInt1158 = local588 + local601;
													} else {
														var12.anInt1158 = local588 + local598;
													}
												}
											}
											while (var23 > 0) {
												local1126 = -50;
												local1011 = -1;
												@Pc(1135) Class25 local1135;
												for (local588 = 0; local588 < var23; local588++) {
													local1135 = Static28.aClass25Array1[local588];
													if (local1135.anInt1150 != Static28.anInt904) {
														if (local1135.anInt1158 > local1126) {
															local1126 = local1135.anInt1158;
															local1011 = local588;
														} else if (local1135.anInt1158 == local1126) {
															local598 = local1135.anInt1171 - Static28.anInt900;
															local601 = local1135.anInt1161 - Static28.anInt921;
															local610 = Static28.aClass25Array1[local1011].anInt1171 - Static28.anInt900;
															var19 = Static28.aClass25Array1[local1011].anInt1161 - Static28.anInt921;
															if (local598 * local598 + local601 * local601 > local610 * local610 + var19 * var19) {
																local1011 = local588;
															}
														}
													}
												}
												if (local1011 == -1) {
													break;
												}
												local1135 = Static28.aClass25Array1[local1011];
												local1135.anInt1150 = Static28.anInt904;
												if (!this.method660(local26, local1135.anInt1153, local1135.anInt1159, local1135.anInt1152, local1135.anInt1157, local1135.aClass6_Sub3_Sub1_7.anInt3082)) {
													local1135.aClass6_Sub3_Sub1_7.method2060(local1135.anInt1170, Static28.anInt905, Static28.anInt907, Static28.anInt917, Static28.anInt908, local1135.anInt1171 - Static28.anInt900, local1135.anInt1165 - Static28.anInt902, local1135.anInt1161 - Static28.anInt921, local1135.anInt1164);
												}
												for (local598 = local1135.anInt1153; local598 <= local1135.anInt1159; local598++) {
													for (local601 = local1135.anInt1152; local601 <= local1135.anInt1157; local601++) {
														@Pc(1260) Class6_Sub14 local1260 = local31[local598][local601];
														if (local1260.anInt2576 != 0) {
															Static28.aClass1_2.method10(local1260);
														} else if ((local598 != local17 || local601 != local20) && local1260.aBoolean133) {
															Static28.aClass1_2.method10(local1260);
														}
													}
												}
											}
											if (!local8.aBoolean132) {
												break;
											}
										} catch (@Pc(1298) Exception local1298) {
											local8.aBoolean132 = false;
											break;
										}
									}
								} while (!local8.aBoolean133);
							} while (local8.anInt2576 != 0);
							if (local17 > Static28.anInt903 || local17 <= Static28.anInt915) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean133);
						if (local17 < Static28.anInt903 || local17 >= Static28.anInt922 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean133);
					if (local20 > Static28.anInt899 || local20 <= Static28.anInt896) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean133);
				if (local20 < Static28.anInt899 || local20 >= Static28.anInt913 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean133);
			local8.aBoolean133 = false;
			Static28.anInt898--;
			@Pc(1402) Class15 local1402 = local8.aClass15_1;
			if (local1402 != null && local1402.anInt560 != 0) {
				if (local1402.aClass6_Sub3_Sub1_1 != null) {
					local1402.aClass6_Sub3_Sub1_1.method2060(0, Static28.anInt905, Static28.anInt907, Static28.anInt917, Static28.anInt908, local1402.anInt570 - Static28.anInt900, local1402.anInt561 - Static28.anInt902 - local1402.anInt560, local1402.anInt562 - Static28.anInt921, local1402.anInt565);
				}
				if (local1402.aClass6_Sub3_Sub1_3 != null) {
					local1402.aClass6_Sub3_Sub1_3.method2060(0, Static28.anInt905, Static28.anInt907, Static28.anInt917, Static28.anInt908, local1402.anInt570 - Static28.anInt900, local1402.anInt561 - Static28.anInt902 - local1402.anInt560, local1402.anInt562 - Static28.anInt921, local1402.anInt565);
				}
				if (local1402.aClass6_Sub3_Sub1_2 != null) {
					local1402.aClass6_Sub3_Sub1_2.method2060(0, Static28.anInt905, Static28.anInt907, Static28.anInt917, Static28.anInt908, local1402.anInt570 - Static28.anInt900, local1402.anInt561 - Static28.anInt902 - local1402.anInt560, local1402.anInt562 - Static28.anInt921, local1402.anInt565);
				}
			}
			if (local8.anInt2578 != 0) {
				@Pc(1497) Class34 local1497 = local8.aClass34_1;
				if (local1497 != null && !this.method673(local26, local17, local20, local1497.aClass6_Sub3_Sub1_8.anInt3082)) {
					if ((local1497.anInt1520 & local8.anInt2578) != 0) {
						local1497.aClass6_Sub3_Sub1_8.method2060(local1497.anInt1522, Static28.anInt905, Static28.anInt907, Static28.anInt917, Static28.anInt908, local1497.anInt1524 - Static28.anInt900, local1497.anInt1525 - Static28.anInt902, local1497.anInt1521 - Static28.anInt921, local1497.anInt1517);
					} else if ((local1497.anInt1520 & 0x300) != 0) {
						local251 = local1497.anInt1524 - Static28.anInt900;
						local1126 = local1497.anInt1525 - Static28.anInt902;
						local1011 = local1497.anInt1521 - Static28.anInt921;
						local588 = local1497.anInt1522;
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
						if ((local1497.anInt1520 & 0x100) != 0 && local598 >= local593) {
							local601 = local251 + Static28.anIntArray111[local588];
							local610 = local1011 + Static28.anIntArray113[local588];
							local1497.aClass6_Sub3_Sub1_8.method2060(local588 * 512 + 256, Static28.anInt905, Static28.anInt907, Static28.anInt917, Static28.anInt908, local601, local1126, local610, local1497.anInt1517);
						}
						if ((local1497.anInt1520 & 0x200) != 0 && local598 <= local593) {
							local601 = local251 + Static28.anIntArray110[local588];
							local610 = local1011 + Static28.anIntArray112[local588];
							local1497.aClass6_Sub3_Sub1_8.method2060(local588 * 512 + 1280 & 0x7FF, Static28.anInt905, Static28.anInt907, Static28.anInt917, Static28.anInt908, local601, local1126, local610, local1497.anInt1517);
						}
					}
				}
				local952 = local8.aClass22_1;
				if (local952 != null) {
					if ((local952.anInt966 & local8.anInt2578) != 0 && !this.method656(local26, local17, local20, local952.anInt966)) {
						local952.aClass6_Sub3_Sub1_4.method2060(0, Static28.anInt905, Static28.anInt907, Static28.anInt917, Static28.anInt908, local952.anInt960 - Static28.anInt900, local952.anInt965 - Static28.anInt902, local952.anInt952 - Static28.anInt921, local952.anInt961);
					}
					if ((local952.anInt957 & local8.anInt2578) != 0 && !this.method656(local26, local17, local20, local952.anInt957)) {
						local952.aClass6_Sub3_Sub1_5.method2060(0, Static28.anInt905, Static28.anInt907, Static28.anInt917, Static28.anInt908, local952.anInt960 - Static28.anInt900, local952.anInt965 - Static28.anInt902, local952.anInt952 - Static28.anInt921, local952.anInt961);
					}
				}
			}
			@Pc(1755) Class6_Sub14 local1755;
			if (local23 < this.anInt923 - 1) {
				local1755 = this.aClass6_Sub14ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1755 != null && local1755.aBoolean133) {
					Static28.aClass1_2.method10(local1755);
				}
			}
			if (local17 < Static28.anInt903) {
				local1755 = local31[local17 + 1][local20];
				if (local1755 != null && local1755.aBoolean133) {
					Static28.aClass1_2.method10(local1755);
				}
			}
			if (local20 < Static28.anInt899) {
				local1755 = local31[local17][local20 + 1];
				if (local1755 != null && local1755.aBoolean133) {
					Static28.aClass1_2.method10(local1755);
				}
			}
			if (local17 > Static28.anInt903) {
				local1755 = local31[local17 - 1][local20];
				if (local1755 != null && local1755.aBoolean133) {
					Static28.aClass1_2.method10(local1755);
				}
			}
			if (local20 > Static28.anInt899) {
				local1755 = local31[local17][local20 - 1];
				if (local1755 != null && local1755.aBoolean133) {
					Static28.aClass1_2.method10(local1755);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIILclient!id;Lclient!id;IIII)V")
	public void method668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class6_Sub3_Sub1 arg4, @OriginalArg(5) Class6_Sub3_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class22 local8 = new Class22();
		local8.anInt961 = arg8;
		local8.anInt963 = arg9;
		local8.anInt960 = arg1 * 128 + 64;
		local8.anInt952 = arg2 * 128 + 64;
		local8.anInt965 = arg3;
		local8.aClass6_Sub3_Sub1_5 = arg4;
		local8.aClass6_Sub3_Sub1_4 = arg5;
		local8.anInt957 = arg6;
		local8.anInt966 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass6_Sub14ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass6_Sub14ArrayArrayArray1[local45][arg1][arg2] = new Class6_Sub14(local45, arg1, arg2);
			}
		}
		this.aClass6_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass22_1 = local8;
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(III)V")
	public void method669() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt923; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt910; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt914; local7++) {
					@Pc(17) Class6_Sub14 local17 = this.aClass6_Sub14ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class22 local22 = local17.aClass22_1;
						if (local22 != null && local22.aClass6_Sub3_Sub1_5 instanceof Class6_Sub3_Sub1_Sub1) {
							@Pc(32) Class6_Sub3_Sub1_Sub1 local32 = (Class6_Sub3_Sub1_Sub1) local22.aClass6_Sub3_Sub1_5;
							this.method675(local32, local1, local4, local7, 1, 1);
							if (local22.aClass6_Sub3_Sub1_4 instanceof Class6_Sub3_Sub1_Sub1) {
								@Pc(48) Class6_Sub3_Sub1_Sub1 local48 = (Class6_Sub3_Sub1_Sub1) local22.aClass6_Sub3_Sub1_4;
								this.method675(local48, local1, local4, local7, 1, 1);
								Static9.method218(local32, local48, 0, 0, 0, false);
								local22.aClass6_Sub3_Sub1_4 = local48.method211(local48.aShort2, local48.aShort1, -50, -10, -50);
							}
							local22.aClass6_Sub3_Sub1_5 = local32.method211(local32.aShort2, local32.aShort1, -50, -10, -50);
						}
						@Pc(103) Class6_Sub3_Sub1_Sub1 local103;
						for (@Pc(87) int local87 = 0; local87 < local17.anInt2564; local87++) {
							@Pc(93) Class25 local93 = local17.aClass25Array3[local87];
							if (local93 != null && local93.aClass6_Sub3_Sub1_7 instanceof Class6_Sub3_Sub1_Sub1) {
								local103 = (Class6_Sub3_Sub1_Sub1) local93.aClass6_Sub3_Sub1_7;
								this.method675(local103, local1, local4, local7, local93.anInt1159 + 1 - local93.anInt1153, local93.anInt1157 - local93.anInt1152 + 1);
								local93.aClass6_Sub3_Sub1_7 = local103.method211(local103.aShort2, local103.aShort1, -50, -10, -50);
							}
						}
						@Pc(142) Class24 local142 = local17.aClass24_1;
						if (local142 != null && local142.aClass6_Sub3_Sub1_6 instanceof Class6_Sub3_Sub1_Sub1) {
							local103 = (Class6_Sub3_Sub1_Sub1) local142.aClass6_Sub3_Sub1_6;
							this.method676(local103, local1, local4, local7);
							local142.aClass6_Sub3_Sub1_6 = local103.method211(local103.aShort2, local103.aShort1, -50, -10, -50);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!fb;)V")
	private void method671(@OriginalArg(0) Class25 arg0) {
		for (@Pc(2) int local2 = arg0.anInt1153; local2 <= arg0.anInt1159; local2++) {
			for (@Pc(6) int local6 = arg0.anInt1152; local6 <= arg0.anInt1157; local6++) {
				@Pc(17) Class6_Sub14 local17 = this.aClass6_Sub14ArrayArrayArray1[arg0.anInt1168][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt2564; local21++) {
						if (local17.aClass25Array3[local21] == arg0) {
							local17.anInt2564--;
							for (local36 = local21; local36 < local17.anInt2564; local36++) {
								local17.aClass25Array3[local36] = local17.aClass25Array3[local36 + 1];
								local17.anIntArray285[local36] = local17.anIntArray285[local36 + 1];
							}
							local17.aClass25Array3[local17.anInt2564] = null;
							break;
						}
					}
					local17.anInt2569 = 0;
					for (local36 = 0; local36 < local17.anInt2564; local36++) {
						local17.anInt2569 |= local17.anIntArray285[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(III)Lclient!fb;")
	public Class25 method672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub14 local8 = this.aClass6_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt2564; local14++) {
			@Pc(20) Class25 local20 = local8.aClass25Array3[local14];
			if ((local20.anInt1164 >> 29 & 0x3) == 2 && local20.anInt1153 == arg1 && local20.anInt1152 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(IIII)Z")
	private boolean method673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method688(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method692(local11 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2] - arg3, local15 + 1) && this.method692(local11 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method692(local11 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method692(local11 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(III)V")
	public void method674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static28.aBoolean46 = true;
		Static28.anInt919 = arg0;
		Static28.anInt909 = arg1;
		Static28.anInt901 = arg2;
		Static28.anInt920 = -1;
		Static28.anInt906 = -1;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!bc;IIIII)V")
	private void method675(@OriginalArg(0) Class6_Sub3_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt923) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt910) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt914 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class6_Sub14 local66 = this.aClass6_Sub14ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray5[local17][local24][local34] + this.anIntArrayArrayArray5[local17][local24 + 1][local34] + this.anIntArrayArrayArray5[local17][local24][local34 + 1] + this.anIntArrayArrayArray5[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray5[arg1][arg2][arg3] + this.anIntArrayArrayArray5[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray5[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray5[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class22 local163 = local66.aClass22_1;
									if (local163 != null) {
										@Pc(173) Class6_Sub3_Sub1_Sub1 local173;
										if (local163.aClass6_Sub3_Sub1_5 instanceof Class6_Sub3_Sub1_Sub1) {
											local173 = (Class6_Sub3_Sub1_Sub1) local163.aClass6_Sub3_Sub1_5;
											Static9.method218(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local163.aClass6_Sub3_Sub1_4 instanceof Class6_Sub3_Sub1_Sub1) {
											local173 = (Class6_Sub3_Sub1_Sub1) local163.aClass6_Sub3_Sub1_4;
											Static9.method218(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(237) int local237 = 0; local237 < local66.anInt2564; local237++) {
										@Pc(243) Class25 local243 = local66.aClass25Array3[local237];
										if (local243 != null && local243.aClass6_Sub3_Sub1_7 instanceof Class6_Sub3_Sub1_Sub1) {
											@Pc(253) Class6_Sub3_Sub1_Sub1 local253 = (Class6_Sub3_Sub1_Sub1) local243.aClass6_Sub3_Sub1_7;
											@Pc(261) int local261 = local243.anInt1159 + 1 - local243.anInt1153;
											@Pc(269) int local269 = local243.anInt1157 + 1 - local243.anInt1152;
											Static9.method218(arg0, local253, (local243.anInt1153 - arg2) * 128 + (local261 - arg4) * 64, local160, (local243.anInt1152 - arg3) * 128 + (local269 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!bc;III)V")
	private void method676(@OriginalArg(0) Class6_Sub3_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class6_Sub14 local14;
		@Pc(29) Class6_Sub3_Sub1_Sub1 local29;
		if (arg2 < this.anInt910) {
			local14 = this.aClass6_Sub14ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass24_1 != null && local14.aClass24_1.aClass6_Sub3_Sub1_6 instanceof Class6_Sub3_Sub1_Sub1) {
				local29 = (Class6_Sub3_Sub1_Sub1) local14.aClass24_1.aClass6_Sub3_Sub1_6;
				Static9.method218(arg0, local29, 128, 0, 0, true);
			}
		}
		if (arg3 < this.anInt910) {
			local14 = this.aClass6_Sub14ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass24_1 != null && local14.aClass24_1.aClass6_Sub3_Sub1_6 instanceof Class6_Sub3_Sub1_Sub1) {
				local29 = (Class6_Sub3_Sub1_Sub1) local14.aClass24_1.aClass6_Sub3_Sub1_6;
				Static9.method218(arg0, local29, 0, 0, 128, true);
			}
		}
		if (arg2 < this.anInt910 && arg3 < this.anInt914) {
			local14 = this.aClass6_Sub14ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass24_1 != null && local14.aClass24_1.aClass6_Sub3_Sub1_6 instanceof Class6_Sub3_Sub1_Sub1) {
				local29 = (Class6_Sub3_Sub1_Sub1) local14.aClass24_1.aClass6_Sub3_Sub1_6;
				Static9.method218(arg0, local29, 128, 0, 128, true);
			}
		}
		if (arg2 >= this.anInt910 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass6_Sub14ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass24_1 != null && local14.aClass24_1.aClass6_Sub3_Sub1_6 instanceof Class6_Sub3_Sub1_Sub1) {
			local29 = (Class6_Sub3_Sub1_Sub1) local14.aClass24_1.aClass6_Sub3_Sub1_6;
			Static9.method218(arg0, local29, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "(III)Lclient!fa;")
	public Class24 method677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub14 local8 = this.aClass6_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass24_1 == null ? null : local8.aClass24_1;
	}

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "(III)V")
	public void method678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub14 local8 = this.aClass6_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass24_1 = null;
		}
	}

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "(III)I")
	public int method679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub14 local8 = this.aClass6_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass34_1 == null ? 0 : local8.aClass34_1.anInt1517;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V")
	public void method681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6_Sub14 local8 = this.aClass6_Sub14ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class6_Sub14 local31 = this.aClass6_Sub14ArrayArrayArray1[local10][arg0][arg1] = this.aClass6_Sub14ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt2573--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt2564; local41++) {
					@Pc(47) Class25 local47 = local31.aClass25Array3[local41];
					if ((local47.anInt1164 >> 29 & 0x3) == 2 && local47.anInt1153 == arg0 && local47.anInt1152 == arg1) {
						local47.anInt1168--;
					}
				}
			}
		}
		if (this.aClass6_Sub14ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass6_Sub14ArrayArrayArray1[0][arg0][arg1] = new Class6_Sub14(0, arg0, arg1);
		}
		this.aClass6_Sub14ArrayArrayArray1[0][arg0][arg1].aClass6_Sub14_1 = local8;
		this.aClass6_Sub14ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "()V")
	public void method683() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt923; local1++) {
			for (local4 = 0; local4 < this.anInt910; local4++) {
				for (local7 = 0; local7 < this.anInt914; local7++) {
					this.aClass6_Sub14ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static28.anInt897; local4++) {
			for (local7 = 0; local7 < Static28.anIntArray109[local4]; local7++) {
				Static28.aClass74ArrayArray1[local4][local7] = null;
			}
			Static28.anIntArray109[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt912; local7++) {
			this.aClass25Array2[local7] = null;
		}
		this.anInt912 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static28.aClass25Array1.length; local76++) {
			Static28.aClass25Array1[local76] = null;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIIILclient!id;IZII)Z")
	private boolean method684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class6_Sub3_Sub1 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt910 || local4 >= this.anInt914) {
					return false;
				}
				@Pc(28) Class6_Sub14 local28 = this.aClass6_Sub14ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt2564 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class25 local52 = new Class25();
		local52.anInt1164 = arg11;
		local52.anInt1147 = arg12;
		local52.anInt1168 = arg0;
		local52.anInt1171 = arg5;
		local52.anInt1161 = arg6;
		local52.anInt1165 = arg7;
		local52.aClass6_Sub3_Sub1_7 = arg8;
		local52.anInt1170 = arg9;
		local52.anInt1153 = arg1;
		local52.anInt1152 = arg2;
		local52.anInt1159 = arg1 + arg3 - 1;
		local52.anInt1157 = arg2 + arg4 - 1;
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
					if (this.aClass6_Sub14ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass6_Sub14ArrayArrayArray1[local130][local98][local101] = new Class6_Sub14(local130, local98, local101);
					}
				}
				@Pc(166) Class6_Sub14 local166 = this.aClass6_Sub14ArrayArrayArray1[arg0][local98][local101];
				local166.aClass25Array3[local166.anInt2564] = local52;
				local166.anIntArray285[local166.anInt2564] = local104;
				local166.anInt2569 |= local104;
				local166.anInt2564++;
			}
		}
		if (arg10) {
			this.aClass25Array2[this.anInt912++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(IIIIII)V")
	public void method685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt910 * 128) {
			arg0 = this.anInt910 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt914 * 128) {
			arg2 = this.anInt914 * 128 - 1;
		}
		Static28.anInt904++;
		Static28.anInt905 = Class6_Sub3_Sub3_Sub4.anIntArray343[arg3];
		Static28.anInt907 = Class6_Sub3_Sub3_Sub4.anIntArray342[arg3];
		Static28.anInt917 = Class6_Sub3_Sub3_Sub4.anIntArray343[arg4];
		Static28.anInt908 = Class6_Sub3_Sub3_Sub4.anIntArray342[arg4];
		Static28.aBooleanArrayArray1 = Static28.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static28.anInt900 = arg0;
		Static28.anInt902 = arg1;
		Static28.anInt921 = arg2;
		Static28.anInt903 = arg0 / 128;
		Static28.anInt899 = arg2 / 128;
		Static28.anInt911 = arg5;
		Static28.anInt915 = Static28.anInt903 - 25;
		if (Static28.anInt915 < 0) {
			Static28.anInt915 = 0;
		}
		Static28.anInt896 = Static28.anInt899 - 25;
		if (Static28.anInt896 < 0) {
			Static28.anInt896 = 0;
		}
		Static28.anInt922 = Static28.anInt903 + 25;
		if (Static28.anInt922 > this.anInt910) {
			Static28.anInt922 = this.anInt910;
		}
		Static28.anInt913 = Static28.anInt899 + 25;
		if (Static28.anInt913 > this.anInt914) {
			Static28.anInt913 = this.anInt914;
		}
		this.method654();
		Static28.anInt898 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt916; local128 < this.anInt923; local128++) {
			@Pc(134) Class6_Sub14[][] local134 = this.aClass6_Sub14ArrayArrayArray1[local128];
			for (local136 = Static28.anInt915; local136 < Static28.anInt922; local136++) {
				for (local139 = Static28.anInt896; local139 < Static28.anInt913; local139++) {
					@Pc(146) Class6_Sub14 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt2581 <= arg5 && (Static28.aBooleanArrayArray1[local136 + 25 - Static28.anInt903][local139 + 25 - Static28.anInt899] || this.anIntArrayArrayArray5[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean134 = true;
							local146.aBoolean133 = true;
							if (local146.anInt2564 > 0) {
								local146.aBoolean132 = true;
							} else {
								local146.aBoolean132 = false;
							}
							Static28.anInt898++;
						} else {
							local146.aBoolean134 = false;
							local146.aBoolean133 = false;
							local146.anInt2576 = 0;
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
		for (@Pc(224) int local224 = this.anInt916; local224 < this.anInt923; local224++) {
			@Pc(230) Class6_Sub14[][] local230 = this.aClass6_Sub14ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static28.anInt903 + local139;
				local241 = Static28.anInt903 - local139;
				if (local237 >= Static28.anInt915 || local241 < Static28.anInt922) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static28.anInt899 + local249;
						local258 = Static28.anInt899 - local249;
						@Pc(270) Class6_Sub14 local270;
						if (local237 >= Static28.anInt915) {
							if (local254 >= Static28.anInt896) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean134) {
									this.method667(local270, true);
								}
							}
							if (local258 < Static28.anInt913) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean134) {
									this.method667(local270, true);
								}
							}
						}
						if (local241 < Static28.anInt922) {
							if (local254 >= Static28.anInt896) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean134) {
									this.method667(local270, true);
								}
							}
							if (local258 < Static28.anInt913) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean134) {
									this.method667(local270, true);
								}
							}
						}
						if (Static28.anInt898 == 0) {
							Static28.aBoolean46 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt916; local136 < this.anInt923; local136++) {
			@Pc(361) Class6_Sub14[][] local361 = this.aClass6_Sub14ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static28.anInt903 + local237;
				local249 = Static28.anInt903 - local237;
				if (local241 >= Static28.anInt915 || local249 < Static28.anInt922) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static28.anInt899 + local254;
						@Pc(389) int local389 = Static28.anInt899 - local254;
						@Pc(401) Class6_Sub14 local401;
						if (local241 >= Static28.anInt915) {
							if (local258 >= Static28.anInt896) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean134) {
									this.method667(local401, false);
								}
							}
							if (local389 < Static28.anInt913) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean134) {
									this.method667(local401, false);
								}
							}
						}
						if (local249 < Static28.anInt922) {
							if (local258 >= Static28.anInt896) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean134) {
									this.method667(local401, false);
								}
							}
							if (local389 < Static28.anInt913) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean134) {
									this.method667(local401, false);
								}
							}
						}
						if (Static28.anInt898 == 0) {
							Static28.aBoolean46 = false;
							return;
						}
					}
				}
			}
		}
		Static28.aBoolean46 = false;
	}

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "(III)Lclient!ia;")
	public Class34 method686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub14 local8 = this.aClass6_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass34_1;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!k;IIIIII)V")
	private void method687(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray202.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray202[local5] - Static28.anInt900;
			local20 = arg0.anIntArray201[local5] - Static28.anInt902;
			local27 = arg0.anIntArray205[local5] - Static28.anInt921;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray196 != null) {
				Static62.anIntArray198[local5] = local37;
				Static62.anIntArray207[local5] = local59;
				Static62.anIntArray197[local5] = local69;
			}
			Static62.anIntArray199[local5] = Static107.anInt2995 + (local37 << 9) / local69;
			Static62.anIntArray195[local5] = Static107.anInt2996 + (local59 << 9) / local69;
		}
		Static107.anInt2990 = 0;
		local3 = arg0.anIntArray194.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray194[local13];
			local27 = arg0.anIntArray208[local13];
			local37 = arg0.anIntArray200[local13];
			@Pc(142) int local142 = Static62.anIntArray199[local20];
			@Pc(146) int local146 = Static62.anIntArray199[local27];
			@Pc(150) int local150 = Static62.anIntArray199[local37];
			@Pc(154) int local154 = Static62.anIntArray195[local20];
			@Pc(158) int local158 = Static62.anIntArray195[local27];
			@Pc(162) int local162 = Static62.anIntArray195[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static107.aBoolean161 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static107.anInt2997 || local146 > Static107.anInt2997 || local150 > Static107.anInt2997) {
					Static107.aBoolean161 = true;
				}
				if (Static28.aBoolean46 && this.method670(Static28.anInt909, Static28.anInt901, local154, local158, local162, local142, local146, local150)) {
					Static28.anInt920 = arg5;
					Static28.anInt906 = arg6;
				}
				if (arg0.anIntArray196 == null || arg0.anIntArray196[local13] == -1) {
					if (arg0.anIntArray204[local13] != 12345678) {
						Static107.method1996(local154, local158, local162, local142, local146, local150, arg0.anIntArray204[local13], arg0.anIntArray206[local13], arg0.anIntArray203[local13]);
					}
				} else if (Static28.aBoolean45) {
					@Pc(364) int local364 = Static107.anInterface1_1.method2072(arg0.anIntArray196[local13]);
					Static107.method1996(local154, local158, local162, local142, local146, local150, Static28.method682(local364, arg0.anIntArray204[local13]), Static28.method682(local364, arg0.anIntArray206[local13]), Static28.method682(local364, arg0.anIntArray203[local13]));
				} else if (arg0.aBoolean99) {
					Static107.method1998(local154, local158, local162, local142, local146, local150, arg0.anIntArray204[local13], arg0.anIntArray206[local13], arg0.anIntArray203[local13], Static62.anIntArray198[0], Static62.anIntArray198[1], Static62.anIntArray198[3], Static62.anIntArray207[0], Static62.anIntArray207[1], Static62.anIntArray207[3], Static62.anIntArray197[0], Static62.anIntArray197[1], Static62.anIntArray197[3], arg0.anIntArray196[local13]);
				} else {
					Static107.method1998(local154, local158, local162, local142, local146, local150, arg0.anIntArray204[local13], arg0.anIntArray206[local13], arg0.anIntArray203[local13], Static62.anIntArray198[local20], Static62.anIntArray198[local27], Static62.anIntArray198[local37], Static62.anIntArray207[local20], Static62.anIntArray207[local27], Static62.anIntArray207[local37], Static62.anIntArray197[local20], Static62.anIntArray197[local27], Static62.anIntArray197[local37], arg0.anIntArray196[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "(III)Z")
	private boolean method688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray4[arg0][arg1][arg2];
		if (local8 == -Static28.anInt904) {
			return false;
		} else if (local8 == Static28.anInt904) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method692(local23 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2], local27 + 1) && this.method692(local23 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2], local27 + 1) && this.method692(local23 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method692(local23 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray4[arg0][arg1][arg2] = Static28.anInt904;
				return true;
			} else {
				this.anIntArrayArrayArray4[arg0][arg1][arg2] = -Static28.anInt904;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "(III)I")
	public int method689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub14 local8 = this.aClass6_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass22_1 == null ? 0 : local8.aClass22_1.anInt961;
	}

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "(III)I")
	public int method690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub14 local8 = this.aClass6_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt2564; local14++) {
			@Pc(20) Class25 local20 = local8.aClass25Array3[local14];
			if ((local20.anInt1164 >> 29 & 0x3) == 2 && local20.anInt1153 == arg1 && local20.anInt1152 == arg2) {
				return local20.anInt1164;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "(III)V")
	public void method691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub14 local8 = this.aClass6_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt2564; local13++) {
			@Pc(19) Class25 local19 = local8.aClass25Array3[local13];
			if ((local19.anInt1164 >> 29 & 0x3) == 2 && local19.anInt1153 == arg1 && local19.anInt1152 == arg2) {
				this.method671(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "(III)Z")
	private boolean method692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static28.anInt918; local1++) {
			@Pc(6) Class74 local6 = Static28.aClass74Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt3183 == 1) {
				local15 = local6.anInt3178 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt3166 + (local6.anInt3165 * local15 >> 8);
					local37 = local6.anInt3180 + (local6.anInt3161 * local15 >> 8);
					local47 = local6.anInt3174 + (local6.anInt3170 * local15 >> 8);
					local57 = local6.anInt3164 + (local6.anInt3162 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3183 == 2) {
				local15 = arg0 - local6.anInt3178;
				if (local15 > 0) {
					local27 = local6.anInt3166 + (local6.anInt3165 * local15 >> 8);
					local37 = local6.anInt3180 + (local6.anInt3161 * local15 >> 8);
					local47 = local6.anInt3174 + (local6.anInt3170 * local15 >> 8);
					local57 = local6.anInt3164 + (local6.anInt3162 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3183 == 3) {
				local15 = local6.anInt3166 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt3178 + (local6.anInt3184 * local15 >> 8);
					local37 = local6.anInt3179 + (local6.anInt3169 * local15 >> 8);
					local47 = local6.anInt3174 + (local6.anInt3170 * local15 >> 8);
					local57 = local6.anInt3164 + (local6.anInt3162 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3183 == 4) {
				local15 = arg2 - local6.anInt3166;
				if (local15 > 0) {
					local27 = local6.anInt3178 + (local6.anInt3184 * local15 >> 8);
					local37 = local6.anInt3179 + (local6.anInt3169 * local15 >> 8);
					local47 = local6.anInt3174 + (local6.anInt3170 * local15 >> 8);
					local57 = local6.anInt3164 + (local6.anInt3162 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3183 == 5) {
				local15 = arg1 - local6.anInt3174;
				if (local15 > 0) {
					local27 = local6.anInt3178 + (local6.anInt3184 * local15 >> 8);
					local37 = local6.anInt3179 + (local6.anInt3169 * local15 >> 8);
					local47 = local6.anInt3166 + (local6.anInt3165 * local15 >> 8);
					local57 = local6.anInt3180 + (local6.anInt3161 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!jb;IIIIIII)V")
	private void method693(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static28.anInt900;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static28.anInt921;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray5[arg1][arg6][arg7] - Static28.anInt902;
		@Pc(51) int local51 = this.anIntArrayArrayArray5[arg1][arg6 + 1][arg7] - Static28.anInt902;
		@Pc(66) int local66 = this.anIntArrayArrayArray5[arg1][arg6 + 1][arg7 + 1] - Static28.anInt902;
		@Pc(79) int local79 = this.anIntArrayArrayArray5[arg1][arg6][arg7 + 1] - Static28.anInt902;
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
		@Pc(279) int local279 = Static107.anInt2995 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static107.anInt2996 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static107.anInt2995 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static107.anInt2996 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static107.anInt2995 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static107.anInt2996 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static107.anInt2995 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static107.anInt2996 + (local89 << 9) / local265;
		Static107.anInt2990 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static107.aBoolean161 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static107.anInt2997 || local327 > Static107.anInt2997 || local295 > Static107.anInt2997) {
				Static107.aBoolean161 = true;
			}
			if (Static28.aBoolean46 && this.method670(Static28.anInt909, Static28.anInt901, local319, local335, local303, local311, local327, local295)) {
				Static28.anInt920 = arg6;
				Static28.anInt906 = arg7;
			}
			if (arg0.anInt1718 == -1) {
				if (arg0.anInt1723 != 12345678) {
					Static107.method1996(local319, local335, local303, local311, local327, local295, arg0.anInt1723, arg0.anInt1720, arg0.anInt1722);
				}
			} else if (Static28.aBoolean45) {
				local472 = Static107.anInterface1_1.method2072(arg0.anInt1718);
				Static107.method1996(local319, local335, local303, local311, local327, local295, Static28.method682(local472, arg0.anInt1723), Static28.method682(local472, arg0.anInt1720), Static28.method682(local472, arg0.anInt1722));
			} else if (arg0.aBoolean92) {
				Static107.method1998(local319, local335, local303, local311, local327, local295, arg0.anInt1723, arg0.anInt1720, arg0.anInt1722, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1718);
			} else {
				Static107.method1998(local319, local335, local303, local311, local327, local295, arg0.anInt1723, arg0.anInt1720, arg0.anInt1722, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt1718);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static107.aBoolean161 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static107.anInt2997 || local295 > Static107.anInt2997 || local327 > Static107.anInt2997) {
			Static107.aBoolean161 = true;
		}
		if (Static28.aBoolean46 && this.method670(Static28.anInt909, Static28.anInt901, local287, local303, local335, local279, local295, local327)) {
			Static28.anInt920 = arg6;
			Static28.anInt906 = arg7;
		}
		if (arg0.anInt1718 != -1) {
			if (!Static28.aBoolean45) {
				Static107.method1998(local287, local303, local335, local279, local295, local327, arg0.anInt1724, arg0.anInt1722, arg0.anInt1720, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1718);
				return;
			}
			local472 = Static107.anInterface1_1.method2072(arg0.anInt1718);
			Static107.method1996(local287, local303, local335, local279, local295, local327, Static28.method682(local472, arg0.anInt1724), Static28.method682(local472, arg0.anInt1722), Static28.method682(local472, arg0.anInt1720));
		} else if (arg0.anInt1724 != 12345678) {
			Static107.method1996(local287, local303, local335, local279, local295, local327, arg0.anInt1724, arg0.anInt1722, arg0.anInt1720);
			return;
		}
	}

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "(III)I")
	public int method694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub14 local8 = this.aClass6_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass24_1 == null ? 0 : local8.aClass24_1.anInt1144;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class37 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class37(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass6_Sub14ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass6_Sub14ArrayArrayArray1[local14][arg1][arg2] = new Class6_Sub14(local14, arg1, arg2);
				}
			}
			this.aClass6_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass37_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class37(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass6_Sub14ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass6_Sub14ArrayArrayArray1[local14][arg1][arg2] = new Class6_Sub14(local14, arg1, arg2);
				}
			}
			this.aClass6_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass37_1 = local12;
		} else {
			@Pc(140) Class39 local140 = new Class39(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass6_Sub14ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass6_Sub14ArrayArrayArray1[local14][arg1][arg2] = new Class6_Sub14(local14, arg1, arg2);
				}
			}
			this.aClass6_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass39_1 = local140;
		}
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(IIII)I")
	public int method697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class6_Sub14 local8 = this.aClass6_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass22_1 != null && local8.aClass22_1.anInt961 == arg3) {
			return local8.aClass22_1.anInt963 & 0xFF;
		} else if (local8.aClass34_1 != null && local8.aClass34_1.anInt1517 == arg3) {
			return local8.aClass34_1.anInt1516 & 0xFF;
		} else if (local8.aClass24_1 != null && local8.aClass24_1.anInt1144 == arg3) {
			return local8.aClass24_1.anInt1139 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt2564; local56++) {
				if (local8.aClass25Array3[local56].anInt1164 == arg3) {
					return local8.aClass25Array3[local56].anInt1147 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIILclient!id;IIIIII)Z")
	public boolean method698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class6_Sub3_Sub1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method684(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "(III)Lclient!ed;")
	public Class22 method699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub14 local8 = this.aClass6_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass22_1;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIILclient!id;ILclient!id;Lclient!id;)V")
	public void method700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class6_Sub3_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class6_Sub3_Sub1 arg6, @OriginalArg(7) Class6_Sub3_Sub1 arg7) {
		@Pc(3) Class15 local3 = new Class15();
		local3.aClass6_Sub3_Sub1_2 = arg4;
		local3.anInt570 = arg1 * 128 + 64;
		local3.anInt562 = arg2 * 128 + 64;
		local3.anInt561 = arg3;
		local3.anInt565 = arg5;
		local3.aClass6_Sub3_Sub1_1 = arg6;
		local3.aClass6_Sub3_Sub1_3 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class6_Sub14 local43 = this.aClass6_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt2564; local47++) {
				if ((local43.aClass25Array3[local47].anInt1147 & 0x100) == 256 && local43.aClass25Array3[local47].aClass6_Sub3_Sub1_7 instanceof Class6_Sub3_Sub1_Sub3) {
					@Pc(71) Class6_Sub3_Sub1_Sub3 local71 = (Class6_Sub3_Sub1_Sub3) local43.aClass25Array3[local47].aClass6_Sub3_Sub1_7;
					local71.method632();
					if (local71.anInt3082 > local34) {
						local34 = local71.anInt3082;
					}
				}
			}
		}
		local3.anInt560 = local34;
		if (this.aClass6_Sub14ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass6_Sub14ArrayArrayArray1[arg0][arg1][arg2] = new Class6_Sub14(arg0, arg1, arg2);
		}
		this.aClass6_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass15_1 = local3;
	}

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "(III)V")
	public void method701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub14 local8 = this.aClass6_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass15_1 = null;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIILclient!id;III)Z")
	public boolean method702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class6_Sub3_Sub1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method684(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}
}
