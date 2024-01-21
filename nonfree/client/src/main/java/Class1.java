import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1 {

	@OriginalMember(owner = "client!a", name = "e", descriptor = "[Lclient!g;")
	private final Class25[] aClass25Array1 = new Class25[5000];

	@OriginalMember(owner = "client!a", name = "o", descriptor = "I")
	private int anInt9 = 0;

	@OriginalMember(owner = "client!a", name = "K", descriptor = "I")
	private int anInt22 = 0;

	@OriginalMember(owner = "client!a", name = "R", descriptor = "[[I")
	private final int[][] anIntArrayArray1 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!a", name = "S", descriptor = "[I")
	private final int[] anIntArray6 = new int[10000];

	@OriginalMember(owner = "client!a", name = "P", descriptor = "I")
	private int anInt27 = 0;

	@OriginalMember(owner = "client!a", name = "T", descriptor = "[I")
	private final int[] anIntArray7 = new int[10000];

	@OriginalMember(owner = "client!a", name = "fb", descriptor = "[[I")
	private final int[][] anIntArrayArray2 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!a", name = "M", descriptor = "I")
	private final int anInt24;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "I")
	private final int anInt2;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "I")
	private final int anInt1;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "[[[Lclient!ma;")
	private final Class3_Sub10[][][] aClass3_Sub10ArrayArrayArray1;

	@OriginalMember(owner = "client!a", name = "l", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(III[[[I)V")
	public Class1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt24 = arg0;
		this.anInt2 = arg1;
		this.anInt1 = arg2;
		this.aClass3_Sub10ArrayArrayArray1 = new Class3_Sub10[arg0][arg1][arg2];
		this.anIntArrayArrayArray2 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray1 = arg3;
		this.method37();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIII)Z")
	private boolean method1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method9(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(11) int local11 = arg1 << 7;
		@Pc(15) int local15 = arg2 << 7;
		@Pc(26) int local26 = this.anIntArrayArrayArray1[arg0][arg1][arg2] - 1;
		@Pc(30) int local30 = local26 - 120;
		@Pc(34) int local34 = local26 - 230;
		@Pc(38) int local38 = local26 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local11 > Static1.anInt5) {
					if (!this.method4(local11, local26, local15)) {
						return false;
					}
					if (!this.method4(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method4(local11, local30, local15)) {
						return false;
					}
					if (!this.method4(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method4(local11, local34, local15)) {
					return false;
				}
				if (!this.method4(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static1.anInt3) {
					if (!this.method4(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method4(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method4(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method4(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method4(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method4(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static1.anInt5) {
					if (!this.method4(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method4(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method4(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method4(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method4(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method4(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static1.anInt3) {
					if (!this.method4(local11, local26, local15)) {
						return false;
					}
					if (!this.method4(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method4(local11, local30, local15)) {
						return false;
					}
					if (!this.method4(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method4(local11, local34, local15)) {
					return false;
				}
				if (!this.method4(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method4(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method4(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method4(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method4(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method4(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(IIII)V")
	public void method2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub10 local8 = this.aClass3_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass3_Sub10ArrayArrayArray1[arg0][arg1][arg2].anInt1709 = arg3;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(III)I")
	public int method3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub10 local8 = this.aClass3_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass22_1 == null ? 0 : local8.aClass22_1.anInt770;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(III)Z")
	private boolean method4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static1.anInt23; local1++) {
			@Pc(6) Class23 local6 = Static1.aClass23Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt792 == 1) {
				local15 = local6.anInt803 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt789 + (local6.anInt786 * local15 >> 8);
					local37 = local6.anInt799 + (local6.anInt779 * local15 >> 8);
					local47 = local6.anInt784 + (local6.anInt785 * local15 >> 8);
					local57 = local6.anInt782 + (local6.anInt778 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt792 == 2) {
				local15 = arg0 - local6.anInt803;
				if (local15 > 0) {
					local27 = local6.anInt789 + (local6.anInt786 * local15 >> 8);
					local37 = local6.anInt799 + (local6.anInt779 * local15 >> 8);
					local47 = local6.anInt784 + (local6.anInt785 * local15 >> 8);
					local57 = local6.anInt782 + (local6.anInt778 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt792 == 3) {
				local15 = local6.anInt789 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt803 + (local6.anInt800 * local15 >> 8);
					local37 = local6.anInt794 + (local6.anInt781 * local15 >> 8);
					local47 = local6.anInt784 + (local6.anInt785 * local15 >> 8);
					local57 = local6.anInt782 + (local6.anInt778 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt792 == 4) {
				local15 = arg2 - local6.anInt789;
				if (local15 > 0) {
					local27 = local6.anInt803 + (local6.anInt800 * local15 >> 8);
					local37 = local6.anInt794 + (local6.anInt781 * local15 >> 8);
					local47 = local6.anInt784 + (local6.anInt785 * local15 >> 8);
					local57 = local6.anInt782 + (local6.anInt778 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt792 == 5) {
				local15 = arg1 - local6.anInt784;
				if (local15 > 0) {
					local27 = local6.anInt803 + (local6.anInt800 * local15 >> 8);
					local37 = local6.anInt794 + (local6.anInt781 * local15 >> 8);
					local47 = local6.anInt789 + (local6.anInt786 * local15 >> 8);
					local57 = local6.anInt799 + (local6.anInt779 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIILclient!k;III)Z")
	public boolean method6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub1_Sub3 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method32(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(III)V")
	public void method7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub10 local8 = this.aClass3_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt1710; local13++) {
			@Pc(19) Class25 local19 = local8.aClass25Array3[local13];
			if ((local19.anInt952 >> 29 & 0x3) == 2 && local19.anInt947 == arg1 && local19.anInt950 == arg2) {
				this.method14(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(III)V")
	public void method8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub10 local8 = this.aClass3_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass22_1 = null;
		}
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(III)Z")
	private boolean method9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray2[arg0][arg1][arg2];
		if (local8 == -Static1.anInt21) {
			return false;
		} else if (local8 == Static1.anInt21) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method4(local23 + 1, this.anIntArrayArrayArray1[arg0][arg1][arg2], local27 + 1) && this.method4(local23 + 128 - 1, this.anIntArrayArrayArray1[arg0][arg1 + 1][arg2], local27 + 1) && this.method4(local23 + 128 - 1, this.anIntArrayArrayArray1[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method4(local23 + 1, this.anIntArrayArrayArray1[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray2[arg0][arg1][arg2] = Static1.anInt21;
				return true;
			} else {
				this.anIntArrayArrayArray2[arg0][arg1][arg2] = -Static1.anInt21;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(IIII)Z")
	private boolean method10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method9(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method4(local11 + 1, this.anIntArrayArrayArray1[arg0][arg1][arg2] - arg3, local15 + 1) && this.method4(local11 + 128 - 1, this.anIntArrayArrayArray1[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method4(local11 + 128 - 1, this.anIntArrayArrayArray1[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method4(local11 + 1, this.anIntArrayArrayArray1[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!a", name = "f", descriptor = "(III)Lclient!nc;")
	public Class45 method11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub10 local8 = this.aClass3_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass45_1;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "()V")
	private void method12() {
		@Pc(3) int local3 = Static1.anIntArray2[Static1.anInt11];
		@Pc(7) Class23[] local7 = Static1.aClass23ArrayArray1[Static1.anInt11];
		Static1.anInt23 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class23 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt801 == 1) {
				local27 = local16.anInt796 + 25 - Static1.anInt26;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt806 + 25 - Static1.anInt6;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt780 + 25 - Static1.anInt6;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static1.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static1.anInt5 - local16.anInt803;
						if (local79 > 32) {
							local16.anInt792 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt792 = 2;
							local79 = -local79;
						}
						local16.anInt786 = (local16.anInt789 - Static1.anInt3 << 8) / local79;
						local16.anInt779 = (local16.anInt799 - Static1.anInt3 << 8) / local79;
						local16.anInt785 = (local16.anInt784 - Static1.anInt18 << 8) / local79;
						local16.anInt778 = (local16.anInt782 - Static1.anInt18 << 8) / local79;
						Static1.aClass23Array1[Static1.anInt23++] = local16;
					}
				}
			} else if (local16.anInt801 == 2) {
				local27 = local16.anInt806 + 25 - Static1.anInt6;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt796 + 25 - Static1.anInt26;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt793 + 25 - Static1.anInt26;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static1.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static1.anInt3 - local16.anInt789;
						if (local79 > 32) {
							local16.anInt792 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt792 = 4;
							local79 = -local79;
						}
						local16.anInt800 = (local16.anInt803 - Static1.anInt5 << 8) / local79;
						local16.anInt781 = (local16.anInt794 - Static1.anInt5 << 8) / local79;
						local16.anInt785 = (local16.anInt784 - Static1.anInt18 << 8) / local79;
						local16.anInt778 = (local16.anInt782 - Static1.anInt18 << 8) / local79;
						Static1.aClass23Array1[Static1.anInt23++] = local16;
					}
				}
			} else if (local16.anInt801 == 4) {
				local27 = local16.anInt784 - Static1.anInt18;
				if (local27 > 128) {
					local40 = local16.anInt806 + 25 - Static1.anInt6;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt780 + 25 - Static1.anInt6;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt796 + 25 - Static1.anInt26;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt793 + 25 - Static1.anInt26;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static1.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt792 = 5;
							local16.anInt800 = (local16.anInt803 - Static1.anInt5 << 8) / local27;
							local16.anInt781 = (local16.anInt794 - Static1.anInt5 << 8) / local27;
							local16.anInt786 = (local16.anInt789 - Static1.anInt3 << 8) / local27;
							local16.anInt779 = (local16.anInt799 - Static1.anInt3 << 8) / local27;
							Static1.aClass23Array1[Static1.anInt23++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "g", descriptor = "(III)V")
	public void method13() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt24; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt2; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt1; local7++) {
					@Pc(17) Class3_Sub10 local17 = this.aClass3_Sub10ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class7 local22 = local17.aClass7_1;
						if (local22 != null && local22.aClass3_Sub1_Sub3_2 instanceof Class3_Sub1_Sub3_Sub3) {
							@Pc(32) Class3_Sub1_Sub3_Sub3 local32 = (Class3_Sub1_Sub3_Sub3) local22.aClass3_Sub1_Sub3_2;
							if (local32.aClass51Array2 != null) {
								this.method29(local32, local1, local4, local7, 1, 1);
								if (local22.aClass3_Sub1_Sub3_1 instanceof Class3_Sub1_Sub3_Sub3) {
									@Pc(51) Class3_Sub1_Sub3_Sub3 local51 = (Class3_Sub1_Sub3_Sub3) local22.aClass3_Sub1_Sub3_1;
									if (local51.aClass51Array2 != null) {
										this.method29(local51, local1, local4, local7, 1, 1);
										this.method44(local32, local51, 0, 0, 0, false);
										local51.method969();
									}
								}
								local32.method969();
							}
						}
						@Pc(98) Class3_Sub1_Sub3_Sub3 local98;
						for (@Pc(82) int local82 = 0; local82 < local17.anInt1710; local82++) {
							@Pc(88) Class25 local88 = local17.aClass25Array3[local82];
							if (local88 != null && local88.aClass3_Sub1_Sub3_4 instanceof Class3_Sub1_Sub3_Sub3) {
								local98 = (Class3_Sub1_Sub3_Sub3) local88.aClass3_Sub1_Sub3_4;
								if (local98.aClass51Array2 != null) {
									this.method29(local98, local1, local4, local7, local88.anInt944 + 1 - local88.anInt947, local88.anInt948 - local88.anInt950 + 1);
									local98.method969();
								}
							}
						}
						@Pc(134) Class22 local134 = local17.aClass22_1;
						if (local134 != null && local134.aClass3_Sub1_Sub3_3 instanceof Class3_Sub1_Sub3_Sub3) {
							local98 = (Class3_Sub1_Sub3_Sub3) local134.aClass3_Sub1_Sub3_3;
							if (local98.aClass51Array2 != null) {
								this.method51(local98, local1, local4, local7);
								local98.method969();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!g;)V")
	private void method14(@OriginalArg(0) Class25 arg0) {
		for (@Pc(2) int local2 = arg0.anInt947; local2 <= arg0.anInt944; local2++) {
			for (@Pc(6) int local6 = arg0.anInt950; local6 <= arg0.anInt948; local6++) {
				@Pc(17) Class3_Sub10 local17 = this.aClass3_Sub10ArrayArrayArray1[arg0.anInt953][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt1710; local21++) {
						if (local17.aClass25Array3[local21] == arg0) {
							local17.anInt1710--;
							for (local36 = local21; local36 < local17.anInt1710; local36++) {
								local17.aClass25Array3[local36] = local17.aClass25Array3[local36 + 1];
								local17.anIntArray175[local36] = local17.anIntArray175[local36 + 1];
							}
							local17.aClass25Array3[local17.anInt1710] = null;
							break;
						}
					}
					local17.anInt1707 = 0;
					for (local36 = 0; local36 < local17.anInt1710; local36++) {
						local17.anInt1707 |= local17.anIntArray175[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class26 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class26(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass3_Sub10ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass3_Sub10ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub10(local14, arg1, arg2);
				}
			}
			this.aClass3_Sub10ArrayArrayArray1[arg0][arg1][arg2].aClass26_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class26(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass3_Sub10ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass3_Sub10ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub10(local14, arg1, arg2);
				}
			}
			this.aClass3_Sub10ArrayArrayArray1[arg0][arg1][arg2].aClass26_1 = local12;
		} else {
			@Pc(140) Class50 local140 = new Class50(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass3_Sub10ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass3_Sub10ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub10(local14, arg1, arg2);
				}
			}
			this.aClass3_Sub10ArrayArrayArray1[arg0][arg1][arg2].aClass50_1 = local140;
		}
	}

	@OriginalMember(owner = "client!a", name = "h", descriptor = "(III)Lclient!ba;")
	public Class7 method16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub10 local8 = this.aClass3_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass7_1;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
	public void method17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub10 local8 = this.aClass3_Sub10ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class3_Sub10 local31 = this.aClass3_Sub10ArrayArrayArray1[local10][arg0][arg1] = this.aClass3_Sub10ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt1719--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt1710; local41++) {
					@Pc(47) Class25 local47 = local31.aClass25Array3[local41];
					if ((local47.anInt952 >> 29 & 0x3) == 2 && local47.anInt947 == arg0 && local47.anInt950 == arg1) {
						local47.anInt953--;
					}
				}
			}
		}
		if (this.aClass3_Sub10ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass3_Sub10ArrayArrayArray1[0][arg0][arg1] = new Class3_Sub10(0, arg0, arg1);
		}
		this.aClass3_Sub10ArrayArrayArray1[0][arg0][arg1].aClass3_Sub10_1 = local8;
		this.aClass3_Sub10ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "()V")
	public void method18() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt9; local1++) {
			@Pc(7) Class25 local7 = this.aClass25Array1[local1];
			this.method14(local7);
			this.aClass25Array1[local1] = null;
		}
		this.anInt9 = 0;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIILclient!k;Lclient!k;IIII)V")
	public void method19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub3 arg4, @OriginalArg(5) Class3_Sub1_Sub3 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class7 local8 = new Class7();
		local8.anInt212 = arg8;
		local8.anInt218 = arg9;
		local8.anInt225 = arg1 * 128 + 64;
		local8.anInt215 = arg2 * 128 + 64;
		local8.anInt221 = arg3;
		local8.aClass3_Sub1_Sub3_2 = arg4;
		local8.aClass3_Sub1_Sub3_1 = arg5;
		local8.anInt217 = arg6;
		local8.anInt222 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass3_Sub10ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass3_Sub10ArrayArrayArray1[local45][arg1][arg2] = new Class3_Sub10(local45, arg1, arg2);
			}
		}
		this.aClass3_Sub10ArrayArrayArray1[arg0][arg1][arg2].aClass7_1 = local8;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIILclient!k;ILclient!k;Lclient!k;)V")
	public void method20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub3 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub1_Sub3 arg6, @OriginalArg(7) Class3_Sub1_Sub3 arg7) {
		@Pc(3) Class31 local3 = new Class31();
		local3.aClass3_Sub1_Sub3_7 = arg4;
		local3.anInt1171 = arg1 * 128 + 64;
		local3.anInt1169 = arg2 * 128 + 64;
		local3.anInt1172 = arg3;
		local3.anInt1170 = arg5;
		local3.aClass3_Sub1_Sub3_6 = arg6;
		local3.aClass3_Sub1_Sub3_5 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class3_Sub10 local43 = this.aClass3_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt1710; local47++) {
				if ((local43.aClass25Array3[local47].anInt946 & 0x100) == 256 && local43.aClass25Array3[local47].aClass3_Sub1_Sub3_4 instanceof Class3_Sub1_Sub3_Sub3) {
					@Pc(71) Class3_Sub1_Sub3_Sub3 local71 = (Class3_Sub1_Sub3_Sub3) local43.aClass25Array3[local47].aClass3_Sub1_Sub3_4;
					local71.method970();
					if (local71.anInt2799 > local34) {
						local34 = local71.anInt2799;
					}
				}
			}
		}
		local3.anInt1173 = local34;
		if (this.aClass3_Sub10ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass3_Sub10ArrayArrayArray1[arg0][arg1][arg2] = new Class3_Sub10(arg0, arg1, arg2);
		}
		this.aClass3_Sub10ArrayArrayArray1[arg0][arg1][arg2].aClass31_1 = local3;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!ha;IIIIIII)V")
	private void method21(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static1.anInt5;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static1.anInt3;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray1[arg1][arg6][arg7] - Static1.anInt18;
		@Pc(51) int local51 = this.anIntArrayArrayArray1[arg1][arg6 + 1][arg7] - Static1.anInt18;
		@Pc(66) int local66 = this.anIntArrayArrayArray1[arg1][arg6 + 1][arg7 + 1] - Static1.anInt18;
		@Pc(79) int local79 = this.anIntArrayArrayArray1[arg1][arg6][arg7 + 1] - Static1.anInt18;
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
		@Pc(279) int local279 = Static66.anInt1795 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static66.anInt1799 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static66.anInt1795 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static66.anInt1799 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static66.anInt1795 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static66.anInt1799 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static66.anInt1795 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static66.anInt1799 + (local89 << 9) / local265;
		Static66.anInt1802 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static66.aBoolean106 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static66.anInt1797 || local327 > Static66.anInt1797 || local295 > Static66.anInt1797) {
				Static66.aBoolean106 = true;
			}
			if (Static1.aBoolean2 && this.method5(Static1.anInt15, Static1.anInt17, local319, local335, local303, local311, local327, local295)) {
				Static1.anInt10 = arg6;
				Static1.anInt14 = arg7;
			}
			if (arg0.anInt1094 == -1) {
				if (arg0.anInt1095 != 12345678) {
					Static66.method1118(local319, local335, local303, local311, local327, local295, arg0.anInt1095, arg0.anInt1091, arg0.anInt1089);
				}
			} else if (Static1.aBoolean1) {
				local472 = Static66.anInterface4_1.method461(arg0.anInt1094);
				Static66.method1118(local319, local335, local303, local311, local327, local295, Static1.method28(local472, arg0.anInt1095), Static1.method28(local472, arg0.anInt1091), Static1.method28(local472, arg0.anInt1089));
			} else if (arg0.aBoolean62) {
				Static66.method1116(local319, local335, local303, local311, local327, local295, arg0.anInt1095, arg0.anInt1091, arg0.anInt1089, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1094);
			} else {
				Static66.method1116(local319, local335, local303, local311, local327, local295, arg0.anInt1095, arg0.anInt1091, arg0.anInt1089, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt1094);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static66.aBoolean106 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static66.anInt1797 || local295 > Static66.anInt1797 || local327 > Static66.anInt1797) {
			Static66.aBoolean106 = true;
		}
		if (Static1.aBoolean2 && this.method5(Static1.anInt15, Static1.anInt17, local287, local303, local335, local279, local295, local327)) {
			Static1.anInt10 = arg6;
			Static1.anInt14 = arg7;
		}
		if (arg0.anInt1094 != -1) {
			if (!Static1.aBoolean1) {
				Static66.method1116(local287, local303, local335, local279, local295, local327, arg0.anInt1090, arg0.anInt1089, arg0.anInt1091, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1094);
				return;
			}
			local472 = Static66.anInterface4_1.method461(arg0.anInt1094);
			Static66.method1118(local287, local303, local335, local279, local295, local327, Static1.method28(local472, arg0.anInt1090), Static1.method28(local472, arg0.anInt1089), Static1.method28(local472, arg0.anInt1091));
		} else if (arg0.anInt1090 != 12345678) {
			Static66.method1118(local287, local303, local335, local279, local295, local327, arg0.anInt1090, arg0.anInt1089, arg0.anInt1091);
			return;
		}
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(IIII)I")
	public int method22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub10 local8 = this.aClass3_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass7_1 != null && local8.aClass7_1.anInt212 == arg3) {
			return local8.aClass7_1.anInt218 & 0xFF;
		} else if (local8.aClass45_1 != null && local8.aClass45_1.anInt1899 == arg3) {
			return local8.aClass45_1.anInt1902 & 0xFF;
		} else if (local8.aClass22_1 != null && local8.aClass22_1.anInt770 == arg3) {
			return local8.aClass22_1.anInt774 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt1710; local56++) {
				if (local8.aClass25Array3[local56].anInt952 == arg3) {
					return local8.aClass25Array3[local56].anInt946 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(II)V")
	public void method23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static1.aBoolean2 = true;
		Static1.anInt15 = arg0;
		Static1.anInt17 = arg1;
		Static1.anInt10 = -1;
		Static1.anInt14 = -1;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!ma;Z)V")
	private void method24(@OriginalArg(0) Class3_Sub10 arg0, @OriginalArg(1) boolean arg1) {
		Static1.aClass24_1.method535(arg0);
		while (true) {
			@Pc(8) Class3_Sub10 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class3_Sub10[][] local31;
			@Pc(49) Class3_Sub10 local49;
			@Pc(251) int local251;
			@Pc(578) int local578;
			@Pc(583) int local583;
			@Pc(588) int local588;
			@Pc(591) int local591;
			@Pc(600) int local600;
			@Pc(942) Class7 local942;
			@Pc(1116) int local1116;
			@Pc(1001) int local1001;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class25 var12;
										@Pc(612) int var19;
										@Pc(335) int var23;
										@Pc(289) boolean var24;
										@Pc(823) Class3_Sub10 var35;
										while (true) {
											do {
												local8 = (Class3_Sub10) Static1.aClass24_1.method527();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean97);
											local17 = local8.anInt1712;
											local20 = local8.anInt1718;
											local23 = local8.anInt1719;
											local26 = local8.anInt1711;
											local31 = this.aClass3_Sub10ArrayArrayArray1[local23];
											if (!local8.aBoolean98) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass3_Sub10ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean97) {
														continue;
													}
												}
												if (local17 <= Static1.anInt26 && local17 > Static1.anInt25) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean97 && (local49.aBoolean98 || (local8.anInt1707 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static1.anInt26 && local17 < Static1.anInt7 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean97 && (local49.aBoolean98 || (local8.anInt1707 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static1.anInt6 && local20 > Static1.anInt19) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean97 && (local49.aBoolean98 || (local8.anInt1707 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static1.anInt6 && local20 < Static1.anInt16 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean97 && (local49.aBoolean98 || (local8.anInt1707 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean98 = false;
											if (local8.aClass3_Sub10_1 != null) {
												local49 = local8.aClass3_Sub10_1;
												if (local49.aClass26_1 == null) {
													if (local49.aClass50_1 != null && !this.method9(0, local17, local20)) {
														this.method35(local49.aClass50_1, Static1.anInt28, Static1.anInt4, Static1.anInt20, Static1.anInt12, local17, local20);
													}
												} else if (!this.method9(0, local17, local20)) {
													this.method21(local49.aClass26_1, 0, Static1.anInt28, Static1.anInt4, Static1.anInt20, Static1.anInt12, local17, local20);
												}
												@Pc(225) Class7 local225 = local49.aClass7_1;
												if (local225 != null) {
													local225.aClass3_Sub1_Sub3_2.method1842(0, Static1.anInt28, Static1.anInt4, Static1.anInt20, Static1.anInt12, local225.anInt225 - Static1.anInt5, local225.anInt221 - Static1.anInt18, local225.anInt215 - Static1.anInt3, local225.anInt212);
												}
												for (local251 = 0; local251 < local49.anInt1710; local251++) {
													var12 = local49.aClass25Array3[local251];
													if (var12 != null) {
														var12.aClass3_Sub1_Sub3_4.method1842(var12.anInt951, Static1.anInt28, Static1.anInt4, Static1.anInt20, Static1.anInt12, var12.anInt945 - Static1.anInt5, var12.anInt943 - Static1.anInt18, var12.anInt937 - Static1.anInt3, var12.anInt952);
													}
												}
											}
											var24 = false;
											if (local8.aClass26_1 == null) {
												if (local8.aClass50_1 != null && !this.method9(local26, local17, local20)) {
													var24 = true;
													this.method35(local8.aClass50_1, Static1.anInt28, Static1.anInt4, Static1.anInt20, Static1.anInt12, local17, local20);
												}
											} else if (!this.method9(local26, local17, local20)) {
												var24 = true;
												this.method21(local8.aClass26_1, local26, Static1.anInt28, Static1.anInt4, Static1.anInt20, Static1.anInt12, local17, local20);
											}
											var23 = 0;
											local251 = 0;
											@Pc(340) Class7 local340 = local8.aClass7_1;
											@Pc(343) Class45 local343 = local8.aClass45_1;
											if (local340 != null || local343 != null) {
												if (Static1.anInt26 == local17) {
													var23++;
												} else if (Static1.anInt26 < local17) {
													var23 += 2;
												}
												if (Static1.anInt6 == local20) {
													var23 += 3;
												} else if (Static1.anInt6 > local20) {
													var23 += 6;
												}
												local251 = Static1.anIntArray10[var23];
												local8.anInt1717 = Static1.anIntArray11[var23];
											}
											if (local340 != null) {
												if ((local340.anInt217 & Static1.anIntArray14[var23]) == 0) {
													local8.anInt1708 = 0;
												} else if (local340.anInt217 == 16) {
													local8.anInt1708 = 3;
													local8.anInt1721 = Static1.anIntArray9[var23];
													local8.anInt1714 = 3 - local8.anInt1721;
												} else if (local340.anInt217 == 32) {
													local8.anInt1708 = 6;
													local8.anInt1721 = Static1.anIntArray8[var23];
													local8.anInt1714 = 6 - local8.anInt1721;
												} else if (local340.anInt217 == 64) {
													local8.anInt1708 = 12;
													local8.anInt1721 = Static1.anIntArray12[var23];
													local8.anInt1714 = 12 - local8.anInt1721;
												} else {
													local8.anInt1708 = 9;
													local8.anInt1721 = Static1.anIntArray13[var23];
													local8.anInt1714 = 9 - local8.anInt1721;
												}
												if ((local340.anInt217 & local251) != 0 && !this.method1(local26, local17, local20, local340.anInt217)) {
													local340.aClass3_Sub1_Sub3_2.method1842(0, Static1.anInt28, Static1.anInt4, Static1.anInt20, Static1.anInt12, local340.anInt225 - Static1.anInt5, local340.anInt221 - Static1.anInt18, local340.anInt215 - Static1.anInt3, local340.anInt212);
												}
												if ((local340.anInt222 & local251) != 0 && !this.method1(local26, local17, local20, local340.anInt222)) {
													local340.aClass3_Sub1_Sub3_1.method1842(0, Static1.anInt28, Static1.anInt4, Static1.anInt20, Static1.anInt12, local340.anInt225 - Static1.anInt5, local340.anInt221 - Static1.anInt18, local340.anInt215 - Static1.anInt3, local340.anInt212);
												}
											}
											if (local343 != null && !this.method10(local26, local17, local20, local343.aClass3_Sub1_Sub3_8.anInt2799)) {
												if ((local343.anInt1903 & local251) != 0) {
													local343.aClass3_Sub1_Sub3_8.method1842(local343.anInt1908, Static1.anInt28, Static1.anInt4, Static1.anInt20, Static1.anInt12, local343.anInt1910 - Static1.anInt5, local343.anInt1907 - Static1.anInt18, local343.anInt1901 - Static1.anInt3, local343.anInt1899);
												} else if ((local343.anInt1903 & 0x300) != 0) {
													local578 = local343.anInt1910 - Static1.anInt5;
													local583 = local343.anInt1907 - Static1.anInt18;
													local588 = local343.anInt1901 - Static1.anInt3;
													local591 = local343.anInt1908;
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
													if ((local343.anInt1903 & 0x100) != 0 && var19 < local600) {
														local629 = local578 + Static1.anIntArray3[local591];
														local635 = local588 + Static1.anIntArray1[local591];
														local343.aClass3_Sub1_Sub3_8.method1842(local591 * 512 + 256, Static1.anInt28, Static1.anInt4, Static1.anInt20, Static1.anInt12, local629, local583, local635, local343.anInt1899);
													}
													if ((local343.anInt1903 & 0x200) != 0 && var19 > local600) {
														local629 = local578 + Static1.anIntArray4[local591];
														local635 = local588 + Static1.anIntArray5[local591];
														local343.aClass3_Sub1_Sub3_8.method1842(local591 * 512 + 1280 & 0x7FF, Static1.anInt28, Static1.anInt4, Static1.anInt20, Static1.anInt12, local629, local583, local635, local343.anInt1899);
													}
												}
											}
											if (var24) {
												@Pc(696) Class22 local696 = local8.aClass22_1;
												if (local696 != null) {
													local696.aClass3_Sub1_Sub3_3.method1842(0, Static1.anInt28, Static1.anInt4, Static1.anInt20, Static1.anInt12, local696.anInt767 - Static1.anInt5, local696.anInt772 - Static1.anInt18, local696.anInt777 - Static1.anInt3, local696.anInt770);
												}
												@Pc(723) Class31 local723 = local8.aClass31_1;
												if (local723 != null && local723.anInt1173 == 0) {
													if (local723.aClass3_Sub1_Sub3_6 != null) {
														local723.aClass3_Sub1_Sub3_6.method1842(0, Static1.anInt28, Static1.anInt4, Static1.anInt20, Static1.anInt12, local723.anInt1171 - Static1.anInt5, local723.anInt1172 - Static1.anInt18, local723.anInt1169 - Static1.anInt3, local723.anInt1170);
													}
													if (local723.aClass3_Sub1_Sub3_5 != null) {
														local723.aClass3_Sub1_Sub3_5.method1842(0, Static1.anInt28, Static1.anInt4, Static1.anInt20, Static1.anInt12, local723.anInt1171 - Static1.anInt5, local723.anInt1172 - Static1.anInt18, local723.anInt1169 - Static1.anInt3, local723.anInt1170);
													}
													if (local723.aClass3_Sub1_Sub3_7 != null) {
														local723.aClass3_Sub1_Sub3_7.method1842(0, Static1.anInt28, Static1.anInt4, Static1.anInt20, Static1.anInt12, local723.anInt1171 - Static1.anInt5, local723.anInt1172 - Static1.anInt18, local723.anInt1169 - Static1.anInt3, local723.anInt1170);
													}
												}
											}
											local578 = local8.anInt1707;
											if (local578 != 0) {
												if (local17 < Static1.anInt26 && (local578 & 0x4) != 0) {
													var35 = local31[local17 + 1][local20];
													if (var35 != null && var35.aBoolean97) {
														Static1.aClass24_1.method535(var35);
													}
												}
												if (local20 < Static1.anInt6 && (local578 & 0x2) != 0) {
													var35 = local31[local17][local20 + 1];
													if (var35 != null && var35.aBoolean97) {
														Static1.aClass24_1.method535(var35);
													}
												}
												if (local17 > Static1.anInt26 && (local578 & 0x1) != 0) {
													var35 = local31[local17 - 1][local20];
													if (var35 != null && var35.aBoolean97) {
														Static1.aClass24_1.method535(var35);
													}
												}
												if (local20 > Static1.anInt6 && (local578 & 0x8) != 0) {
													var35 = local31[local17][local20 - 1];
													if (var35 != null && var35.aBoolean97) {
														Static1.aClass24_1.method535(var35);
													}
												}
											}
											break;
										}
										if (local8.anInt1708 != 0) {
											var24 = true;
											for (var23 = 0; var23 < local8.anInt1710; var23++) {
												if (local8.aClass25Array3[var23].anInt942 != Static1.anInt21 && (local8.anIntArray175[var23] & local8.anInt1708) == local8.anInt1721) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												local942 = local8.aClass7_1;
												if (!this.method1(local26, local17, local20, local942.anInt217)) {
													local942.aClass3_Sub1_Sub3_2.method1842(0, Static1.anInt28, Static1.anInt4, Static1.anInt20, Static1.anInt12, local942.anInt225 - Static1.anInt5, local942.anInt221 - Static1.anInt18, local942.anInt215 - Static1.anInt3, local942.anInt212);
												}
												local8.anInt1708 = 0;
											}
										}
										if (!local8.aBoolean99) {
											break;
										}
										try {
											@Pc(981) int local981 = local8.anInt1710;
											local8.aBoolean99 = false;
											var23 = 0;
											label559: for (local251 = 0; local251 < local981; local251++) {
												var12 = local8.aClass25Array3[local251];
												if (var12.anInt942 != Static1.anInt21) {
													for (local1001 = var12.anInt947; local1001 <= var12.anInt944; local1001++) {
														for (local578 = var12.anInt950; local578 <= var12.anInt948; local578++) {
															var35 = local31[local1001][local578];
															if (var35.aBoolean98) {
																local8.aBoolean99 = true;
																continue label559;
															}
															if (var35.anInt1708 != 0) {
																local588 = 0;
																if (local1001 > var12.anInt947) {
																	local588++;
																}
																if (local1001 < var12.anInt944) {
																	local588 += 4;
																}
																if (local578 > var12.anInt950) {
																	local588 += 8;
																}
																if (local578 < var12.anInt948) {
																	local588 += 2;
																}
																if ((local588 & var35.anInt1708) == local8.anInt1714) {
																	local8.aBoolean99 = true;
																	continue label559;
																}
															}
														}
													}
													Static1.aClass25Array2[var23++] = var12;
													local578 = Static1.anInt26 - var12.anInt947;
													local583 = var12.anInt944 - Static1.anInt26;
													if (local583 > local578) {
														local578 = local583;
													}
													local588 = Static1.anInt6 - var12.anInt950;
													local591 = var12.anInt948 - Static1.anInt6;
													if (local591 > local588) {
														var12.anInt954 = local578 + local591;
													} else {
														var12.anInt954 = local578 + local588;
													}
												}
											}
											while (var23 > 0) {
												local1116 = -50;
												local1001 = -1;
												@Pc(1125) Class25 local1125;
												for (local578 = 0; local578 < var23; local578++) {
													local1125 = Static1.aClass25Array2[local578];
													if (local1125.anInt942 != Static1.anInt21) {
														if (local1125.anInt954 > local1116) {
															local1116 = local1125.anInt954;
															local1001 = local578;
														} else if (local1125.anInt954 == local1116) {
															local588 = local1125.anInt945 - Static1.anInt5;
															local591 = local1125.anInt937 - Static1.anInt3;
															local600 = Static1.aClass25Array2[local1001].anInt945 - Static1.anInt5;
															var19 = Static1.aClass25Array2[local1001].anInt937 - Static1.anInt3;
															if (local588 * local588 + local591 * local591 > local600 * local600 + var19 * var19) {
																local1001 = local578;
															}
														}
													}
												}
												if (local1001 == -1) {
													break;
												}
												local1125 = Static1.aClass25Array2[local1001];
												local1125.anInt942 = Static1.anInt21;
												if (!this.method34(local26, local1125.anInt947, local1125.anInt944, local1125.anInt950, local1125.anInt948, local1125.aClass3_Sub1_Sub3_4.anInt2799)) {
													local1125.aClass3_Sub1_Sub3_4.method1842(local1125.anInt951, Static1.anInt28, Static1.anInt4, Static1.anInt20, Static1.anInt12, local1125.anInt945 - Static1.anInt5, local1125.anInt943 - Static1.anInt18, local1125.anInt937 - Static1.anInt3, local1125.anInt952);
												}
												for (local588 = local1125.anInt947; local588 <= local1125.anInt944; local588++) {
													for (local591 = local1125.anInt950; local591 <= local1125.anInt948; local591++) {
														@Pc(1250) Class3_Sub10 local1250 = local31[local588][local591];
														if (local1250.anInt1708 != 0) {
															Static1.aClass24_1.method535(local1250);
														} else if ((local588 != local17 || local591 != local20) && local1250.aBoolean97) {
															Static1.aClass24_1.method535(local1250);
														}
													}
												}
											}
											if (!local8.aBoolean99) {
												break;
											}
										} catch (@Pc(1288) Exception local1288) {
											local8.aBoolean99 = false;
											break;
										}
									}
								} while (!local8.aBoolean97);
							} while (local8.anInt1708 != 0);
							if (local17 > Static1.anInt26 || local17 <= Static1.anInt25) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean97);
						if (local17 < Static1.anInt26 || local17 >= Static1.anInt7 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean97);
					if (local20 > Static1.anInt6 || local20 <= Static1.anInt19) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean97);
				if (local20 < Static1.anInt6 || local20 >= Static1.anInt16 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean97);
			local8.aBoolean97 = false;
			Static1.anInt8--;
			@Pc(1392) Class31 local1392 = local8.aClass31_1;
			if (local1392 != null && local1392.anInt1173 != 0) {
				if (local1392.aClass3_Sub1_Sub3_6 != null) {
					local1392.aClass3_Sub1_Sub3_6.method1842(0, Static1.anInt28, Static1.anInt4, Static1.anInt20, Static1.anInt12, local1392.anInt1171 - Static1.anInt5, local1392.anInt1172 - Static1.anInt18 - local1392.anInt1173, local1392.anInt1169 - Static1.anInt3, local1392.anInt1170);
				}
				if (local1392.aClass3_Sub1_Sub3_5 != null) {
					local1392.aClass3_Sub1_Sub3_5.method1842(0, Static1.anInt28, Static1.anInt4, Static1.anInt20, Static1.anInt12, local1392.anInt1171 - Static1.anInt5, local1392.anInt1172 - Static1.anInt18 - local1392.anInt1173, local1392.anInt1169 - Static1.anInt3, local1392.anInt1170);
				}
				if (local1392.aClass3_Sub1_Sub3_7 != null) {
					local1392.aClass3_Sub1_Sub3_7.method1842(0, Static1.anInt28, Static1.anInt4, Static1.anInt20, Static1.anInt12, local1392.anInt1171 - Static1.anInt5, local1392.anInt1172 - Static1.anInt18 - local1392.anInt1173, local1392.anInt1169 - Static1.anInt3, local1392.anInt1170);
				}
			}
			if (local8.anInt1717 != 0) {
				@Pc(1487) Class45 local1487 = local8.aClass45_1;
				if (local1487 != null && !this.method10(local26, local17, local20, local1487.aClass3_Sub1_Sub3_8.anInt2799)) {
					if ((local1487.anInt1903 & local8.anInt1717) != 0) {
						local1487.aClass3_Sub1_Sub3_8.method1842(local1487.anInt1908, Static1.anInt28, Static1.anInt4, Static1.anInt20, Static1.anInt12, local1487.anInt1910 - Static1.anInt5, local1487.anInt1907 - Static1.anInt18, local1487.anInt1901 - Static1.anInt3, local1487.anInt1899);
					} else if ((local1487.anInt1903 & 0x300) != 0) {
						local251 = local1487.anInt1910 - Static1.anInt5;
						local1116 = local1487.anInt1907 - Static1.anInt18;
						local1001 = local1487.anInt1901 - Static1.anInt3;
						local578 = local1487.anInt1908;
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
						if ((local1487.anInt1903 & 0x100) != 0 && local588 >= local583) {
							local591 = local251 + Static1.anIntArray3[local578];
							local600 = local1001 + Static1.anIntArray1[local578];
							local1487.aClass3_Sub1_Sub3_8.method1842(local578 * 512 + 256, Static1.anInt28, Static1.anInt4, Static1.anInt20, Static1.anInt12, local591, local1116, local600, local1487.anInt1899);
						}
						if ((local1487.anInt1903 & 0x200) != 0 && local588 <= local583) {
							local591 = local251 + Static1.anIntArray4[local578];
							local600 = local1001 + Static1.anIntArray5[local578];
							local1487.aClass3_Sub1_Sub3_8.method1842(local578 * 512 + 1280 & 0x7FF, Static1.anInt28, Static1.anInt4, Static1.anInt20, Static1.anInt12, local591, local1116, local600, local1487.anInt1899);
						}
					}
				}
				local942 = local8.aClass7_1;
				if (local942 != null) {
					if ((local942.anInt222 & local8.anInt1717) != 0 && !this.method1(local26, local17, local20, local942.anInt222)) {
						local942.aClass3_Sub1_Sub3_1.method1842(0, Static1.anInt28, Static1.anInt4, Static1.anInt20, Static1.anInt12, local942.anInt225 - Static1.anInt5, local942.anInt221 - Static1.anInt18, local942.anInt215 - Static1.anInt3, local942.anInt212);
					}
					if ((local942.anInt217 & local8.anInt1717) != 0 && !this.method1(local26, local17, local20, local942.anInt217)) {
						local942.aClass3_Sub1_Sub3_2.method1842(0, Static1.anInt28, Static1.anInt4, Static1.anInt20, Static1.anInt12, local942.anInt225 - Static1.anInt5, local942.anInt221 - Static1.anInt18, local942.anInt215 - Static1.anInt3, local942.anInt212);
					}
				}
			}
			@Pc(1745) Class3_Sub10 local1745;
			if (local23 < this.anInt24 - 1) {
				local1745 = this.aClass3_Sub10ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1745 != null && local1745.aBoolean97) {
					Static1.aClass24_1.method535(local1745);
				}
			}
			if (local17 < Static1.anInt26) {
				local1745 = local31[local17 + 1][local20];
				if (local1745 != null && local1745.aBoolean97) {
					Static1.aClass24_1.method535(local1745);
				}
			}
			if (local20 < Static1.anInt6) {
				local1745 = local31[local17][local20 + 1];
				if (local1745 != null && local1745.aBoolean97) {
					Static1.aClass24_1.method535(local1745);
				}
			}
			if (local17 > Static1.anInt26) {
				local1745 = local31[local17 - 1][local20];
				if (local1745 != null && local1745.aBoolean97) {
					Static1.aClass24_1.method535(local1745);
				}
			}
			if (local20 > Static1.anInt6) {
				local1745 = local31[local17][local20 - 1];
				if (local1745 != null && local1745.aBoolean97) {
					Static1.aClass24_1.method535(local1745);
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "i", descriptor = "(III)V")
	public void method25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub10 local8 = this.aClass3_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass31_1 = null;
		}
	}

	@OriginalMember(owner = "client!a", name = "j", descriptor = "(III)I")
	public int method26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub10 local8 = this.aClass3_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt1710; local14++) {
			@Pc(20) Class25 local20 = local8.aClass25Array3[local14];
			if ((local20.anInt952 >> 29 & 0x3) == 2 && local20.anInt947 == arg1 && local20.anInt950 == arg2) {
				return local20.anInt952;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	public void method27(@OriginalArg(0) int arg0) {
		this.anInt22 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt2; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt1; local7++) {
				if (this.aClass3_Sub10ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass3_Sub10ArrayArrayArray1[arg0][local4][local7] = new Class3_Sub10(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!lb;IIIII)V")
	private void method29(@OriginalArg(0) Class3_Sub1_Sub3_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt24) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt2) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt1 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class3_Sub10 local66 = this.aClass3_Sub10ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray1[local17][local24][local34] + this.anIntArrayArrayArray1[local17][local24 + 1][local34] + this.anIntArrayArrayArray1[local17][local24][local34 + 1] + this.anIntArrayArrayArray1[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray1[arg1][arg2][arg3] + this.anIntArrayArrayArray1[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray1[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray1[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class7 local163 = local66.aClass7_1;
									if (local163 != null) {
										@Pc(173) Class3_Sub1_Sub3_Sub3 local173;
										if (local163.aClass3_Sub1_Sub3_2 instanceof Class3_Sub1_Sub3_Sub3) {
											local173 = (Class3_Sub1_Sub3_Sub3) local163.aClass3_Sub1_Sub3_2;
											if (local173.aClass51Array2 != null) {
												this.method44(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
											}
										}
										if (local163.aClass3_Sub1_Sub3_1 instanceof Class3_Sub1_Sub3_Sub3) {
											local173 = (Class3_Sub1_Sub3_Sub3) local163.aClass3_Sub1_Sub3_1;
											if (local173.aClass51Array2 != null) {
												this.method44(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
											}
										}
									}
									for (@Pc(245) int local245 = 0; local245 < local66.anInt1710; local245++) {
										@Pc(251) Class25 local251 = local66.aClass25Array3[local245];
										if (local251 != null && local251.aClass3_Sub1_Sub3_4 instanceof Class3_Sub1_Sub3_Sub3) {
											@Pc(261) Class3_Sub1_Sub3_Sub3 local261 = (Class3_Sub1_Sub3_Sub3) local251.aClass3_Sub1_Sub3_4;
											if (local261.aClass51Array2 != null) {
												@Pc(272) int local272 = local251.anInt944 + 1 - local251.anInt947;
												@Pc(280) int local280 = local251.anInt948 + 1 - local251.anInt950;
												this.method44(arg0, local261, (local251.anInt947 - arg2) * 128 + (local272 - arg4) * 64, local160, (local251.anInt950 - arg3) * 128 + (local280 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([IIIIII)V")
	public void method30(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class3_Sub10 local8 = this.aClass3_Sub10ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class26 local14 = local8.aClass26_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt1093;
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
		@Pc(59) Class50 local59 = local8.aClass50_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt1967;
		@Pc(68) int local68 = local59.anInt1966;
		@Pc(71) int local71 = local59.anInt1968;
		@Pc(74) int local74 = local59.anInt1969;
		@Pc(79) int[] local79 = this.anIntArrayArray1[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray2[local68];
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

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIILclient!k;IIIIII)V")
	public void method31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub3 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class45 local6 = new Class45();
		local6.anInt1899 = arg9;
		local6.anInt1902 = arg10;
		local6.anInt1910 = arg1 * 128 + arg7 + 64;
		local6.anInt1901 = arg2 * 128 + arg8 + 64;
		local6.anInt1907 = arg3;
		local6.aClass3_Sub1_Sub3_8 = arg4;
		local6.anInt1903 = arg5;
		local6.anInt1908 = arg6;
		for (@Pc(44) int local44 = arg0; local44 >= 0; local44--) {
			if (this.aClass3_Sub10ArrayArrayArray1[local44][arg1][arg2] == null) {
				this.aClass3_Sub10ArrayArrayArray1[local44][arg1][arg2] = new Class3_Sub10(local44, arg1, arg2);
			}
		}
		this.aClass3_Sub10ArrayArrayArray1[arg0][arg1][arg2].aClass45_1 = local6;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIILclient!k;IZII)Z")
	private boolean method32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class3_Sub1_Sub3 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt2 || local4 >= this.anInt1) {
					return false;
				}
				@Pc(28) Class3_Sub10 local28 = this.aClass3_Sub10ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt1710 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class25 local52 = new Class25();
		local52.anInt952 = arg11;
		local52.anInt946 = arg12;
		local52.anInt953 = arg0;
		local52.anInt945 = arg5;
		local52.anInt937 = arg6;
		local52.anInt943 = arg7;
		local52.aClass3_Sub1_Sub3_4 = arg8;
		local52.anInt951 = arg9;
		local52.anInt947 = arg1;
		local52.anInt950 = arg2;
		local52.anInt944 = arg1 + arg3 - 1;
		local52.anInt948 = arg2 + arg4 - 1;
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
					if (this.aClass3_Sub10ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass3_Sub10ArrayArrayArray1[local130][local98][local101] = new Class3_Sub10(local130, local98, local101);
					}
				}
				@Pc(166) Class3_Sub10 local166 = this.aClass3_Sub10ArrayArrayArray1[arg0][local98][local101];
				local166.aClass25Array3[local166.anInt1710] = local52;
				local166.anIntArray175[local166.anInt1710] = local104;
				local166.anInt1707 |= local104;
				local166.anInt1710++;
			}
		}
		if (arg10) {
			this.aClass25Array1[this.anInt9++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(IIII)V")
	public void method33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub10 local8 = this.aClass3_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class45 local14 = local8.aClass45_1;
		if (local14 != null) {
			@Pc(23) int local23 = arg1 * 128 + 64;
			@Pc(29) int local29 = arg2 * 128 + 64;
			local14.anInt1910 = local23 + (local14.anInt1910 - local23) * arg3 / 16;
			local14.anInt1901 = local29 + (local14.anInt1901 - local29) * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIII)Z")
	private boolean method34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray2[arg0][local17][local21] == -Static1.anInt21) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray1[arg0][arg1][arg3] - arg5;
			if (!this.method4(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method4(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method4(local21, local167, local195)) {
				return false;
			} else if (this.method4(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method9(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method4(local17 + 1, this.anIntArrayArrayArray1[arg0][arg1][arg3] - arg5, local21 + 1) && this.method4(local17 + 128 - 1, this.anIntArrayArrayArray1[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method4(local17 + 128 - 1, this.anIntArrayArrayArray1[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method4(local17 + 1, this.anIntArrayArrayArray1[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!oc;IIIIII)V")
	private void method35(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray219.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray219[local5] - Static1.anInt5;
			local20 = arg0.anIntArray213[local5] - Static1.anInt18;
			local27 = arg0.anIntArray220[local5] - Static1.anInt3;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray222 != null) {
				Static73.anIntArray218[local5] = local37;
				Static73.anIntArray215[local5] = local59;
				Static73.anIntArray221[local5] = local69;
			}
			Static73.anIntArray211[local5] = Static66.anInt1795 + (local37 << 9) / local69;
			Static73.anIntArray214[local5] = Static66.anInt1799 + (local59 << 9) / local69;
		}
		Static66.anInt1802 = 0;
		local3 = arg0.anIntArray212.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray212[local13];
			local27 = arg0.anIntArray217[local13];
			local37 = arg0.anIntArray223[local13];
			@Pc(142) int local142 = Static73.anIntArray211[local20];
			@Pc(146) int local146 = Static73.anIntArray211[local27];
			@Pc(150) int local150 = Static73.anIntArray211[local37];
			@Pc(154) int local154 = Static73.anIntArray214[local20];
			@Pc(158) int local158 = Static73.anIntArray214[local27];
			@Pc(162) int local162 = Static73.anIntArray214[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static66.aBoolean106 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static66.anInt1797 || local146 > Static66.anInt1797 || local150 > Static66.anInt1797) {
					Static66.aBoolean106 = true;
				}
				if (Static1.aBoolean2 && this.method5(Static1.anInt15, Static1.anInt17, local154, local158, local162, local142, local146, local150)) {
					Static1.anInt10 = arg5;
					Static1.anInt14 = arg6;
				}
				if (arg0.anIntArray222 == null || arg0.anIntArray222[local13] == -1) {
					if (arg0.anIntArray209[local13] != 12345678) {
						Static66.method1118(local154, local158, local162, local142, local146, local150, arg0.anIntArray209[local13], arg0.anIntArray210[local13], arg0.anIntArray216[local13]);
					}
				} else if (Static1.aBoolean1) {
					@Pc(364) int local364 = Static66.anInterface4_1.method461(arg0.anIntArray222[local13]);
					Static66.method1118(local154, local158, local162, local142, local146, local150, Static1.method28(local364, arg0.anIntArray209[local13]), Static1.method28(local364, arg0.anIntArray210[local13]), Static1.method28(local364, arg0.anIntArray216[local13]));
				} else if (arg0.aBoolean115) {
					Static66.method1116(local154, local158, local162, local142, local146, local150, arg0.anIntArray209[local13], arg0.anIntArray210[local13], arg0.anIntArray216[local13], Static73.anIntArray218[0], Static73.anIntArray218[1], Static73.anIntArray218[3], Static73.anIntArray215[0], Static73.anIntArray215[1], Static73.anIntArray215[3], Static73.anIntArray221[0], Static73.anIntArray221[1], Static73.anIntArray221[3], arg0.anIntArray222[local13]);
				} else {
					Static66.method1116(local154, local158, local162, local142, local146, local150, arg0.anIntArray209[local13], arg0.anIntArray210[local13], arg0.anIntArray216[local13], Static73.anIntArray218[local20], Static73.anIntArray218[local27], Static73.anIntArray218[local37], Static73.anIntArray215[local20], Static73.anIntArray215[local27], Static73.anIntArray215[local37], Static73.anIntArray221[local20], Static73.anIntArray221[local27], Static73.anIntArray221[local37], arg0.anIntArray222[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "()V")
	public void method37() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt24; local1++) {
			for (local4 = 0; local4 < this.anInt2; local4++) {
				for (local7 = 0; local7 < this.anInt1; local7++) {
					this.aClass3_Sub10ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static1.anInt13; local4++) {
			for (local7 = 0; local7 < Static1.anIntArray2[local4]; local7++) {
				Static1.aClass23ArrayArray1[local4][local7] = null;
			}
			Static1.anIntArray2[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt9; local7++) {
			this.aClass25Array1[local7] = null;
		}
		this.anInt9 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static1.aClass25Array2.length; local76++) {
			Static1.aClass25Array2[local76] = null;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIILclient!k;IIIIII)Z")
	public boolean method38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class3_Sub1_Sub3 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method32(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIILclient!k;IIZ)Z")
	public boolean method39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class3_Sub1_Sub3 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method32(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!a", name = "l", descriptor = "(III)V")
	public void method41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub10 local8 = this.aClass3_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass45_1 = null;
		}
	}

	@OriginalMember(owner = "client!a", name = "m", descriptor = "(III)I")
	public int method42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub10 local8 = this.aClass3_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass45_1 == null ? 0 : local8.aClass45_1.anInt1899;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!lb;Lclient!lb;IIIZ)V")
	private void method44(@OriginalArg(0) Class3_Sub1_Sub3_Sub3 arg0, @OriginalArg(1) Class3_Sub1_Sub3_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg1.method947();
		this.anInt27++;
		@Pc(9) int local9 = 0;
		@Pc(12) int[] local12 = arg1.anIntArray126;
		@Pc(15) int local15 = arg1.anInt1599;
		for (@Pc(17) int local17 = 0; local17 < arg0.anInt1599; local17++) {
			@Pc(23) Class51 local23 = arg0.aClass51Array2[local17];
			@Pc(28) Class51 local28 = arg0.aClass51Array1[local17];
			if (local28.anInt1971 != 0) {
				@Pc(38) int local38 = arg0.anIntArray137[local17] - arg3;
				if (local38 <= arg1.anInt1603) {
					@Pc(49) int local49 = arg0.anIntArray126[local17] - arg2;
					if (local49 >= arg1.anInt1602 && local49 <= arg1.anInt1598) {
						@Pc(65) int local65 = arg0.anIntArray139[local17] - arg4;
						if (local65 >= arg1.anInt1604 && local65 <= arg1.anInt1601) {
							for (@Pc(76) int local76 = 0; local76 < local15; local76++) {
								@Pc(82) Class51 local82 = arg1.aClass51Array2[local76];
								@Pc(87) Class51 local87 = arg1.aClass51Array1[local76];
								if (local49 == local12[local76] && local65 == arg1.anIntArray139[local76] && local38 == arg1.anIntArray137[local76] && local87.anInt1971 != 0) {
									local23.anInt1970 += local87.anInt1970;
									local23.anInt1978 += local87.anInt1978;
									local23.anInt1979 += local87.anInt1979;
									local23.anInt1971 += local87.anInt1971;
									local82.anInt1970 += local28.anInt1970;
									local82.anInt1978 += local28.anInt1978;
									local82.anInt1979 += local28.anInt1979;
									local82.anInt1971 += local28.anInt1971;
									local9++;
									this.anIntArray7[local17] = this.anInt27;
									this.anIntArray6[local76] = this.anInt27;
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
		for (@Pc(193) int local193 = 0; local193 < arg0.anInt1606; local193++) {
			if (this.anIntArray7[arg0.anIntArray138[local193]] == this.anInt27 && this.anIntArray7[arg0.anIntArray135[local193]] == this.anInt27 && this.anIntArray7[arg0.anIntArray130[local193]] == this.anInt27) {
				arg0.anIntArray132[local193] = -1;
			}
		}
		for (@Pc(236) int local236 = 0; local236 < arg1.anInt1606; local236++) {
			if (this.anIntArray6[arg1.anIntArray138[local236]] == this.anInt27 && this.anIntArray6[arg1.anIntArray135[local236]] == this.anInt27 && this.anIntArray6[arg1.anIntArray130[local236]] == this.anInt27) {
				arg1.anIntArray132[local236] = -1;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "n", descriptor = "(III)V")
	public void method45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub10 local8 = this.aClass3_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass7_1 = null;
		}
	}

	@OriginalMember(owner = "client!a", name = "o", descriptor = "(III)Lclient!g;")
	public Class25 method46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub10 local8 = this.aClass3_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt1710; local14++) {
			@Pc(20) Class25 local20 = local8.aClass25Array3[local14];
			if ((local20.anInt952 >> 29 & 0x3) == 2 && local20.anInt947 == arg1 && local20.anInt950 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!a", name = "p", descriptor = "(III)I")
	public int method47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub10 local8 = this.aClass3_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass7_1 == null ? 0 : local8.aClass7_1.anInt212;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(IIIIII)V")
	public void method48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt2 * 128) {
			arg0 = this.anInt2 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt1 * 128) {
			arg2 = this.anInt1 * 128 - 1;
		}
		Static1.anInt21++;
		Static1.anInt28 = Static57.anIntArray156[arg3];
		Static1.anInt4 = Static57.anIntArray161[arg3];
		Static1.anInt20 = Static57.anIntArray156[arg4];
		Static1.anInt12 = Static57.anIntArray161[arg4];
		Static1.aBooleanArrayArray1 = Static1.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static1.anInt5 = arg0;
		Static1.anInt18 = arg1;
		Static1.anInt3 = arg2;
		Static1.anInt26 = arg0 / 128;
		Static1.anInt6 = arg2 / 128;
		Static1.anInt11 = arg5;
		Static1.anInt25 = Static1.anInt26 - 25;
		if (Static1.anInt25 < 0) {
			Static1.anInt25 = 0;
		}
		Static1.anInt19 = Static1.anInt6 - 25;
		if (Static1.anInt19 < 0) {
			Static1.anInt19 = 0;
		}
		Static1.anInt7 = Static1.anInt26 + 25;
		if (Static1.anInt7 > this.anInt2) {
			Static1.anInt7 = this.anInt2;
		}
		Static1.anInt16 = Static1.anInt6 + 25;
		if (Static1.anInt16 > this.anInt1) {
			Static1.anInt16 = this.anInt1;
		}
		this.method12();
		Static1.anInt8 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt22; local128 < this.anInt24; local128++) {
			@Pc(134) Class3_Sub10[][] local134 = this.aClass3_Sub10ArrayArrayArray1[local128];
			for (local136 = Static1.anInt25; local136 < Static1.anInt7; local136++) {
				for (local139 = Static1.anInt19; local139 < Static1.anInt16; local139++) {
					@Pc(146) Class3_Sub10 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt1709 <= arg5 && (Static1.aBooleanArrayArray1[local136 + 25 - Static1.anInt26][local139 + 25 - Static1.anInt6] || this.anIntArrayArrayArray1[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean98 = true;
							local146.aBoolean97 = true;
							if (local146.anInt1710 > 0) {
								local146.aBoolean99 = true;
							} else {
								local146.aBoolean99 = false;
							}
							Static1.anInt8++;
						} else {
							local146.aBoolean98 = false;
							local146.aBoolean97 = false;
							local146.anInt1708 = 0;
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
		for (@Pc(224) int local224 = this.anInt22; local224 < this.anInt24; local224++) {
			@Pc(230) Class3_Sub10[][] local230 = this.aClass3_Sub10ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static1.anInt26 + local139;
				local241 = Static1.anInt26 - local139;
				if (local237 >= Static1.anInt25 || local241 < Static1.anInt7) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static1.anInt6 + local249;
						local258 = Static1.anInt6 - local249;
						@Pc(270) Class3_Sub10 local270;
						if (local237 >= Static1.anInt25) {
							if (local254 >= Static1.anInt19) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean98) {
									this.method24(local270, true);
								}
							}
							if (local258 < Static1.anInt16) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean98) {
									this.method24(local270, true);
								}
							}
						}
						if (local241 < Static1.anInt7) {
							if (local254 >= Static1.anInt19) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean98) {
									this.method24(local270, true);
								}
							}
							if (local258 < Static1.anInt16) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean98) {
									this.method24(local270, true);
								}
							}
						}
						if (Static1.anInt8 == 0) {
							Static1.aBoolean2 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt22; local136 < this.anInt24; local136++) {
			@Pc(361) Class3_Sub10[][] local361 = this.aClass3_Sub10ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static1.anInt26 + local237;
				local249 = Static1.anInt26 - local237;
				if (local241 >= Static1.anInt25 || local249 < Static1.anInt7) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static1.anInt6 + local254;
						@Pc(389) int local389 = Static1.anInt6 - local254;
						@Pc(401) Class3_Sub10 local401;
						if (local241 >= Static1.anInt25) {
							if (local258 >= Static1.anInt19) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean98) {
									this.method24(local401, false);
								}
							}
							if (local389 < Static1.anInt16) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean98) {
									this.method24(local401, false);
								}
							}
						}
						if (local249 < Static1.anInt7) {
							if (local258 >= Static1.anInt19) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean98) {
									this.method24(local401, false);
								}
							}
							if (local389 < Static1.anInt16) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean98) {
									this.method24(local401, false);
								}
							}
						}
						if (Static1.anInt8 == 0) {
							Static1.aBoolean2 = false;
							return;
						}
					}
				}
			}
		}
		Static1.aBoolean2 = false;
	}

	@OriginalMember(owner = "client!a", name = "q", descriptor = "(III)Lclient!fa;")
	public Class22 method49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub10 local8 = this.aClass3_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass22_1 == null ? null : local8.aClass22_1;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!lb;III)V")
	private void method51(@OriginalArg(0) Class3_Sub1_Sub3_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class3_Sub10 local14;
		@Pc(29) Class3_Sub1_Sub3_Sub3 local29;
		if (arg2 < this.anInt2) {
			local14 = this.aClass3_Sub10ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass22_1 != null && local14.aClass22_1.aClass3_Sub1_Sub3_3 instanceof Class3_Sub1_Sub3_Sub3) {
				local29 = (Class3_Sub1_Sub3_Sub3) local14.aClass22_1.aClass3_Sub1_Sub3_3;
				if (local29.aClass51Array2 != null) {
					this.method44(arg0, local29, 128, 0, 0, true);
				}
			}
		}
		if (arg3 < this.anInt2) {
			local14 = this.aClass3_Sub10ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass22_1 != null && local14.aClass22_1.aClass3_Sub1_Sub3_3 instanceof Class3_Sub1_Sub3_Sub3) {
				local29 = (Class3_Sub1_Sub3_Sub3) local14.aClass22_1.aClass3_Sub1_Sub3_3;
				if (local29.aClass51Array2 != null) {
					this.method44(arg0, local29, 0, 0, 128, true);
				}
			}
		}
		if (arg2 < this.anInt2 && arg3 < this.anInt1) {
			local14 = this.aClass3_Sub10ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass22_1 != null && local14.aClass22_1.aClass3_Sub1_Sub3_3 instanceof Class3_Sub1_Sub3_Sub3) {
				local29 = (Class3_Sub1_Sub3_Sub3) local14.aClass22_1.aClass3_Sub1_Sub3_3;
				if (local29.aClass51Array2 != null) {
					this.method44(arg0, local29, 128, 0, 128, true);
				}
			}
		}
		if (arg2 >= this.anInt2 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass3_Sub10ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass22_1 != null && local14.aClass22_1.aClass3_Sub1_Sub3_3 instanceof Class3_Sub1_Sub3_Sub3) {
			local29 = (Class3_Sub1_Sub3_Sub3) local14.aClass22_1.aClass3_Sub1_Sub3_3;
			if (local29.aClass51Array2 != null) {
				this.method44(arg0, local29, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIILclient!k;II)V")
	public void method52(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub3 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class22 local6 = new Class22();
		local6.aClass3_Sub1_Sub3_3 = arg4;
		local6.anInt767 = arg1 * 128 + 64;
		local6.anInt777 = arg2 * 128 + 64;
		local6.anInt772 = arg3;
		local6.anInt770 = arg5;
		local6.anInt774 = arg6;
		if (this.aClass3_Sub10ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass3_Sub10ArrayArrayArray1[arg0][arg1][arg2] = new Class3_Sub10(arg0, arg1, arg2);
		}
		this.aClass3_Sub10ArrayArrayArray1[arg0][arg1][arg2].aClass22_1 = local6;
	}
}
