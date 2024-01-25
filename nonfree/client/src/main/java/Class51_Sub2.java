import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class51_Sub2 extends Class51 {

	@OriginalMember(owner = "client!gh", name = "p", descriptor = "[[Lclient!or;")
	private Class155[][] aClass155ArrayArray1;

	@OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
	private int anInt1966;

	@OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
	private int anInt1967;

	@OriginalMember(owner = "client!gh", name = "t", descriptor = "[[Lclient!jj;")
	private Class102[][] aClass102ArrayArray1;

	@OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
	private int anInt1968;

	@OriginalMember(owner = "client!gh", name = "v", descriptor = "[[Lclient!ki;")
	private Class114[][] aClass114ArrayArray1;

	@OriginalMember(owner = "client!gh", name = "w", descriptor = "I")
	private int anInt1969;

	@OriginalMember(owner = "client!gh", name = "x", descriptor = "I")
	private int anInt1970;

	@OriginalMember(owner = "client!gh", name = "y", descriptor = "I")
	private int anInt1971;

	@OriginalMember(owner = "client!gh", name = "A", descriptor = "I")
	private int anInt1972;

	@OriginalMember(owner = "client!gh", name = "B", descriptor = "[[Lclient!vm;")
	private Class204[][] aClass204ArrayArray1;

	@OriginalMember(owner = "client!gh", name = "C", descriptor = "I")
	private int anInt1973;

	@OriginalMember(owner = "client!gh", name = "D", descriptor = "I")
	private int anInt1974;

	@OriginalMember(owner = "client!gh", name = "E", descriptor = "I")
	private int anInt1975;

	@OriginalMember(owner = "client!gh", name = "K", descriptor = "I")
	private int anInt1979;

	@OriginalMember(owner = "client!gh", name = "L", descriptor = "I")
	private int anInt1980;

	@OriginalMember(owner = "client!gh", name = "G", descriptor = "Lclient!sq;")
	private final Class55_Sub2 aClass55_Sub2_3;

	@OriginalMember(owner = "client!gh", name = "H", descriptor = "I")
	private final int anInt1977;

	@OriginalMember(owner = "client!gh", name = "M", descriptor = "[[I")
	public final int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!gh", name = "J", descriptor = "[[I")
	private final int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!gh", name = "F", descriptor = "I")
	private final int anInt1976;

	@OriginalMember(owner = "client!gh", name = "I", descriptor = "I")
	private int anInt1978;

	@OriginalMember(owner = "client!gh", name = "r", descriptor = "[[B")
	private byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!gh", name = "z", descriptor = "[[B")
	private byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lclient!sq;IIII[[I[[II)V")
	public Class51_Sub2(@OriginalArg(0) Class55_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4);
		this.aClass55_Sub2_3 = arg0;
		this.anInt1977 = arg2;
		this.anIntArrayArray33 = arg5;
		this.anIntArrayArray32 = arg6;
		this.anInt1976 = arg7;
		this.anInt1978 = 0;
		while (arg7 > 1) {
			this.anInt1978++;
			arg7 >>= 0x1;
		}
		this.aByteArrayArray8 = new byte[arg3 + 1][arg4 + 1];
		@Pc(50) int local50 = this.aClass55_Sub2_3.anInt5840 >> 9;
		for (@Pc(52) int local52 = 1; local52 < arg4; local52++) {
			for (@Pc(55) int local55 = 1; local55 < arg3; local55++) {
				@Pc(76) int local76 = this.anIntArrayArray33[local55 + 1][local52] - this.anIntArrayArray33[local55 - 1][local52];
				@Pc(94) int local94 = this.anIntArrayArray33[local55][local52 + 1] - this.anIntArrayArray33[local55][local52 - 1];
				@Pc(107) int local107 = (int) Math.sqrt((double) (local76 * local76 + local94 * local94 + 65536));
				@Pc(113) int local113 = (local76 << 8) / local107;
				@Pc(117) int local117 = -65536 / local107;
				@Pc(123) int local123 = (local94 << 8) / local107;
				@Pc(145) int local145 = local50 + (this.aClass55_Sub2_3.lb * local113 + this.aClass55_Sub2_3.anInt5855 * local117 + this.aClass55_Sub2_3.anInt5849 * local123 >> 17);
				local145 >>= 0x1;
				if (local145 < 2) {
					local145 = 2;
				} else if (local145 > 126) {
					local145 = 126;
				}
				this.aByteArrayArray8[local55][local52] = (byte) local145;
			}
		}
		this.aByteArrayArray9 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIII[[ZLclient!gm;[I[I)V")
	private void method1862(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class80 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean149 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass114ArrayArray1[local22][local25] != null) {
						@Pc(50) Class114 local50 = this.aClass114ArrayArray1[local22][local25];
						if (local50.aShort36 != -1 && (local50.aByte19 & 0x2) == 0 && local50.anInt3333 == 0) {
							local68 = this.aClass55_Sub2_3.method5262(local50.aShort36);
							arg5.method1890(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static291.method5029(local50.anInt3334, local68), Static291.method5029(local50.anInt3336, local68), Static291.method5029(local50.anInt3332, local68));
							arg5.method1890(local20, local20, local20 - 4, local16, local16 + 4, local16, Static291.method5029(local50.anInt3335, local68), Static291.method5029(local50.anInt3332, local68), Static291.method5029(local50.anInt3336, local68));
						} else if (local50.anInt3333 == 0) {
							arg5.method1895(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt3334, local50.anInt3336, local50.anInt3332);
							arg5.method1895(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt3335, local50.anInt3332, local50.anInt3336);
						} else {
							local68 = local50.anInt3333;
							arg5.method1895(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static119.method3395(local68, local50.anInt3334 & 0xFF000000), Static119.method3395(local68, local50.anInt3336 & 0xFF000000), Static119.method3395(local68, local50.anInt3332 & 0xFF000000));
							arg5.method1895(local20, local20, local20 - 4, local16, local16 + 4, local16, Static119.method3395(local68, local50.anInt3335 & 0xFF000000), Static119.method3395(local68, local50.anInt3332 & 0xFF000000), Static119.method3395(local68, local50.anInt3336 & 0xFF000000));
						}
					} else if (this.aClass204ArrayArray1[local22][local25] != null) {
						@Pc(259) Class204 local259 = this.aClass204ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort89; local68++) {
							arg6[local68] = local16 + (local259.aShortArray113[local68] - local22 * this.anInt1976) * 4 / this.anInt1976;
							arg7[local68] = local20 - (local259.aShortArray112[local68] - local25 * this.anInt1976) * 4 / this.anInt1976;
						}
						for (@Pc(307) int local307 = 0; local307 < local259.aShort88; local307++) {
							@Pc(312) int local312 = local307 * 3;
							@Pc(316) int local316 = local312 + 1;
							@Pc(320) int local320 = local316 + 1;
							@Pc(324) int local324 = arg6[local312];
							@Pc(328) int local328 = arg6[local316];
							@Pc(332) int local332 = arg6[local320];
							@Pc(336) int local336 = arg7[local312];
							@Pc(340) int local340 = arg7[local316];
							@Pc(344) int local344 = arg7[local320];
							@Pc(369) int local369;
							if (local259.anIntArray615 != null && local259.anIntArray615[local307] != 0 && (local259.aShortArray116 == null || local259.aShortArray116 != null && local259.aShortArray116[local307] == -1)) {
								local369 = local259.anIntArray615[local307];
								arg5.method1895(local336, local340, local344, local324, local328, local332, Static119.method3395(local369, -(local259.anIntArray616[local312] & -16777216) - 16777216), Static119.method3395(local369, -(local259.anIntArray616[local316] & -16777216) - 16777216), Static119.method3395(local369, -(local259.anIntArray616[local320] & -16777216) - 16777216));
							} else if (local259.aShortArray116 == null || local259.aShortArray116[local307] == -1) {
								arg5.method1895(local336, local340, local344, local324, local328, local332, local259.anIntArray616[local312], local259.anIntArray616[local316], local259.anIntArray616[local320]);
							} else {
								local369 = this.aClass55_Sub2_3.method5262(local259.aShortArray116[local307]);
								arg5.method1890(local336, local340, local344, local324, local328, local332, local369, local369, local369);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean149 = true;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!lb;IIIIZ)V")
	@Override
	public void method1851(@OriginalArg(0) Class5_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "()V")
	@Override
	public void method1860() {
		this.aByteArrayArray8 = null;
		this.aByteArrayArray9 = null;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method1847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		if (this.aClass114ArrayArray1 == null) {
			this.aClass114ArrayArray1 = new Class114[super.anInt1963][super.anInt1961];
			this.aClass204ArrayArray1 = new Class204[super.anInt1963][super.anInt1961];
		} else if (this.aClass155ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg5.length; local32++) {
			if (arg5[local32] == -1) {
				arg5[local32] = 0;
			} else {
				arg5[local32] = Static230.anIntArray424[Static162.method2852(arg5[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg6 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg6.length; local68++) {
				if (arg6[local68] == -1) {
					arg6[local68] = 0;
				} else {
					arg6[local68] = Static230.anIntArray424[Static162.method2852(arg6[local68]) & 0xFFFF] << 8 | 0xFF;
				}
			}
		}
		@Pc(102) boolean local102 = true;
		@Pc(104) int local104 = -1;
		@Pc(106) int local106 = -1;
		@Pc(108) int local108 = -1;
		@Pc(110) int local110 = -1;
		@Pc(244) int local244;
		if (arg2.length == 6) {
			for (@Pc(116) int local116 = 0; local116 < 6; local116++) {
				if (arg2[local116] == 0 && arg4[local116] == 0) {
					if (local104 != -1 && arg5[local104] != arg5[local116]) {
						local102 = false;
						break;
					}
					local104 = local116;
				} else if (arg2[local116] == this.anInt1976 && arg4[local116] == 0) {
					if (local106 != -1 && arg5[local106] != arg5[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == this.anInt1976 && arg4[local116] == this.anInt1976) {
					if (local108 != -1 && arg5[local108] != arg5[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == this.anInt1976) {
					if (local110 != -1 && arg5[local110] != arg5[local116]) {
						local102 = false;
						break;
					}
					local110 = local116;
				}
			}
			if (local104 == -1 || local106 == -1 || local108 == -1 || local110 == -1) {
				local102 = false;
			}
			if (local102) {
				if (arg3 != null) {
					for (local244 = 0; local244 < 4; local244++) {
						if (arg3[local244] != 0) {
							local102 = false;
							break;
						}
					}
				}
				if (local102) {
					for (local244 = 1; local244 < 4; local244++) {
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + this.anInt1976 && arg2[local244] != arg2[0] - this.anInt1976) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + this.anInt1976 && arg4[local244] != arg4[0] - this.anInt1976) {
							local102 = false;
							break;
						}
					}
				}
			}
		} else {
			local102 = false;
		}
		@Pc(342) int local342;
		@Pc(531) int local531;
		if (local102) {
			@Pc(334) Class114 local334 = new Class114();
			local244 = arg5[0];
			local342 = arg7[0];
			if (arg6 != null) {
				local334.anInt3333 = arg6[0] >> 8;
				if (local244 == 0) {
					local334.aByte19 = (byte) (local334.aByte19 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray33[arg0][arg1] == this.anIntArrayArray33[arg0 + 1][arg1] && this.anIntArrayArray33[arg0][arg1] == this.anIntArrayArray33[arg0 + 1][arg1 + 1] && this.anIntArrayArray33[arg0][arg1] == this.anIntArrayArray33[arg0][arg1 + 1]) {
				local334.aByte19 = (byte) (local334.aByte19 | 0x1);
			}
			if (local342 == -1 || (local334.aByte19 & 0x2) != 0 || this.aClass55_Sub2_3.anInterface3_6.method1511(local342).aBoolean540) {
				if (this.anIntArrayArray32 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray32[arg0][arg1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt3335 = Static27.method483(local531, Static360.method1864(arg5[local104] >> 8, this.aByteArrayArray8[arg0][arg1] - this.aByteArrayArray9[arg0][arg1]), arg9);
				if (local334.anInt3333 != 0) {
					local334.anInt3335 |= this.aByteArrayArray9[arg0][arg1] + 255 - this.aByteArrayArray8[arg0][arg1] << 25;
				}
				if (this.anIntArrayArray32 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray32[arg0 + 1][arg1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt3332 = Static27.method483(local531, Static360.method1864(arg5[local106] >> 8, this.aByteArrayArray8[arg0 + 1][arg1] - this.aByteArrayArray9[arg0 + 1][arg1]), arg9);
				if (local334.anInt3333 != 0) {
					local334.anInt3332 |= this.aByteArrayArray9[arg0 + 1][arg1] + 255 - this.aByteArrayArray8[arg0 + 1][arg1] << 25;
				}
				if (this.anIntArrayArray32 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray32[arg0 + 1][arg1 + 1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt3334 = Static27.method483(local531, Static360.method1864(arg5[local108] >> 8, this.aByteArrayArray8[arg0 + 1][arg1 + 1] - this.aByteArrayArray9[arg0 + 1][arg1 + 1]), arg9);
				if (local334.anInt3333 != 0) {
					local334.anInt3334 |= this.aByteArrayArray9[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray8[arg0 + 1][arg1 + 1] << 25;
				}
				if (this.anIntArrayArray32 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray32[arg0][arg1 + 1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt3336 = Static27.method483(local531, Static360.method1864(arg5[local110] >> 8, this.aByteArrayArray8[arg0][arg1 + 1] - this.aByteArrayArray9[arg0][arg1 + 1]), arg9);
				if (local334.anInt3333 != 0) {
					local334.anInt3336 |= this.aByteArrayArray9[arg0][arg1 + 1] + 255 - this.aByteArrayArray8[arg0][arg1 + 1] << 25;
				}
				local334.aShort36 = -1;
			} else {
				local334.anInt3335 = this.aByteArrayArray8[arg0][arg1] - this.aByteArrayArray9[arg0][arg1];
				local334.anInt3332 = this.aByteArrayArray8[arg0 + 1][arg1] - this.aByteArrayArray9[arg0 + 1][arg1];
				local334.anInt3334 = this.aByteArrayArray8[arg0 + 1][arg1 + 1] - this.aByteArrayArray9[arg0 + 1][arg1 + 1];
				local334.anInt3336 = this.aByteArrayArray8[arg0][arg1 + 1] - this.aByteArrayArray9[arg0][arg1 + 1];
				local334.aShort36 = (short) local342;
			}
			this.aClass114ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(886) Class204 local886 = new Class204();
		local886.aShort89 = (short) arg2.length;
		local886.aShort88 = (short) (arg2.length / 3);
		local886.aShortArray113 = new short[local886.aShort89];
		local886.aShortArray114 = new short[local886.aShort89];
		local886.aShortArray112 = new short[local886.aShort89];
		local886.anIntArray616 = new int[local886.aShort89];
		if (this.anIntArrayArray32 != null) {
			local886.aShortArray117 = new short[local886.aShort89];
		}
		@Pc(957) int local957;
		@Pc(1078) int local1078;
		@Pc(1125) int local1125;
		@Pc(1225) int local1225;
		@Pc(1344) int local1344;
		for (local244 = 0; local244 < local886.aShort89; local244++) {
			local342 = arg2[local244];
			local531 = arg4[local244];
			if (local342 == 0 && local531 == 0) {
				local957 = this.aByteArrayArray8[arg0][arg1] - this.aByteArrayArray9[arg0][arg1];
			} else if (local342 == 0 && local531 == this.anInt1976) {
				local957 = this.aByteArrayArray8[arg0][arg1 + 1] - this.aByteArrayArray9[arg0][arg1 + 1];
			} else if (local342 == this.anInt1976 && local531 == this.anInt1976) {
				local957 = this.aByteArrayArray8[arg0 + 1][arg1 + 1] - this.aByteArrayArray9[arg0 + 1][arg1 + 1];
			} else if (local342 == this.anInt1976 && local531 == 0) {
				local957 = this.aByteArrayArray8[arg0 + 1][arg1] - this.aByteArrayArray9[arg0 + 1][arg1];
			} else {
				local1078 = (this.aByteArrayArray8[arg0][arg1] - this.aByteArrayArray9[arg0][arg1]) * (this.anInt1976 - local342) + (this.aByteArrayArray8[arg0 + 1][arg1] - this.aByteArrayArray9[arg0 + 1][arg1]) * local342;
				local1125 = (this.aByteArrayArray8[arg0][arg1 + 1] - this.aByteArrayArray9[arg0][arg1 + 1]) * (this.anInt1976 - local342) + (this.aByteArrayArray8[arg0 + 1][arg1 + 1] - this.aByteArrayArray9[arg0 + 1][arg1 + 1]) * local342;
				local957 = local1078 * (this.anInt1976 - local531) + local1125 * local531 >> this.anInt1978 * 2;
			}
			@Pc(1149) short local1149 = (short) ((arg0 << this.anInt1978) + local342);
			@Pc(1157) short local1157 = (short) ((arg1 << this.anInt1978) + local531);
			local886.aShortArray113[local244] = local1149;
			local886.aShortArray112[local244] = local1157;
			local886.aShortArray114[local244] = (short) (this.method1844(local1149, local1157) + (arg3 == null ? 0 : arg3[local244]));
			if (local957 < 0) {
				local957 = 0;
			}
			if (arg7[local244] != -1 && !this.aClass55_Sub2_3.anInterface3_6.method1511(arg7[local244]).aBoolean540) {
				local886.anIntArray616[local244] = local957;
			} else if (arg5[local244] != 0) {
				local1225 = 0;
				if (this.anIntArrayArray32 != null) {
					@Pc(1241) int local1241;
					if (local342 == 0 && local531 == 0) {
						local1241 = this.anIntArrayArray32[arg0][arg1];
					} else if (local342 == 0 && local531 == this.anInt1976) {
						local1241 = this.anIntArrayArray32[arg0][arg1 + 1];
					} else if (local342 == this.anInt1976 && local531 == this.anInt1976) {
						local1241 = this.anIntArrayArray32[arg0 + 1][arg1 + 1];
					} else if (local342 == this.anInt1976 && local531 == 0) {
						local1241 = this.anIntArrayArray32[arg0 + 1][arg1];
					} else {
						@Pc(1317) int local1317 = this.anIntArrayArray32[arg0][arg1] * (this.anInt1976 - local342) + this.anIntArrayArray32[arg0 + 1][arg1] * local342;
						local1344 = this.anIntArrayArray32[arg0][arg1 + 1] * (this.anInt1976 - local342) + this.anIntArrayArray32[arg0 + 1][arg1 + 1] * local342;
						local1241 = local1317 * (this.anInt1976 - local531) + local1344 * local531 >> this.anInt1978 * 2;
					}
					local886.aShortArray117[local244] = (short) local1241;
					if (arg10 != 0) {
						local1225 = local1241 * 255 / arg10;
						if (local1225 < 0) {
							local1225 = 0;
						} else if (local1225 > 255) {
							local1225 = 255;
						}
					}
				}
				local886.anIntArray616[local244] = Static27.method483(local1225, Static360.method1864(arg5[local244] >> 8, local957), arg9);
				if (arg6 != null) {
					local886.anIntArray616[local244] |= local957 << 25;
				}
			} else if (arg6 == null) {
				local886.anIntArray616[local244] = 0;
			} else {
				local886.anIntArray616[local244] = local957 << 25;
			}
		}
		@Pc(1424) boolean local1424 = false;
		for (local531 = 0; local531 < local886.aShort88; local531++) {
			if (arg7[local531 * 3] != -1 && !this.aClass55_Sub2_3.anInterface3_6.method1511(arg7[local531 * 3]).aBoolean540) {
				local1424 = true;
			}
		}
		if (arg6 != null) {
			local886.anIntArray615 = new int[local886.aShort88];
		}
		if (local1424) {
			local886.aShortArray116 = new short[local886.aShort88];
			local886.aShortArray115 = new short[local886.aShort88];
		}
		for (local957 = 0; local957 < local886.aShort88; local957++) {
			local1078 = local957 * 3;
			if (arg6 != null && arg6[local1078] != 0) {
				local886.anIntArray615[local957] = arg6[local1078] >> 8;
			}
			if (local1424) {
				local1125 = local1078 + 1;
				local1225 = local1125 + 1;
				@Pc(1506) boolean local1506 = false;
				@Pc(1508) boolean local1508 = true;
				local1344 = arg7[local1078];
				if (local1344 == -1 || this.aClass55_Sub2_3.anInterface3_6.method1511(local1344).aBoolean540) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				local1344 = arg7[local1125];
				if (local1344 == -1 || this.aClass55_Sub2_3.anInterface3_6.method1511(local1344).aBoolean540) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				local1344 = arg7[local1225];
				if (local1344 == -1 || this.aClass55_Sub2_3.anInterface3_6.method1511(local1344).aBoolean540) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				if (local1508) {
					local886.aShortArray116[local957] = (short) local1344;
					local886.aShortArray115[local957] = (short) arg8[local1078];
				} else {
					if (local1506) {
						local1344 = arg7[local1078];
						if (local1344 != -1 && !this.aClass55_Sub2_3.anInterface3_6.method1511(local1344).aBoolean540) {
							local886.anIntArray616[local1078] = Static230.anIntArray424[Static162.method2852(this.aClass55_Sub2_3.anInterface3_6.method1511(local1344).aShort84 & 0xFFFF) & 0xFFFF];
						}
						local1344 = arg7[local1125];
						if (local1344 != -1 && !this.aClass55_Sub2_3.anInterface3_6.method1511(local1344).aBoolean540) {
							local886.anIntArray616[local1125] = Static230.anIntArray424[Static162.method2852(this.aClass55_Sub2_3.anInterface3_6.method1511(local1344).aShort84 & 0xFFFF) & 0xFFFF];
						}
						local1344 = arg7[local1225];
						if (local1344 != -1 && !this.aClass55_Sub2_3.anInterface3_6.method1511(local1344).aBoolean540) {
							local886.anIntArray616[local1225] = Static230.anIntArray424[Static162.method2852(this.aClass55_Sub2_3.anInterface3_6.method1511(local1344).aShort84 & 0xFFFF) & 0xFFFF];
						}
					}
					local886.aShortArray116[local957] = -1;
				}
			}
		}
		this.aClass204ArrayArray1[arg0][arg1] = local886;
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)Z")
	private boolean method1863(@OriginalArg(0) int arg0) {
		if ((this.anInt1977 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else {
			return arg0 == 8;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!bn;[I)V")
	@Override
	public void method1857(@OriginalArg(0) Class5_Sub9 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(II)I")
	@Override
	public int method1856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray33[arg0][arg1];
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method1845(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class1 local4 = this.aClass55_Sub2_3.method5266(Thread.currentThread());
		@Pc(7) Class80 local7 = local4.aClass80_1;
		local7.anInt2018 = 0;
		local7.aBoolean146 = false;
		if (this.aClass114ArrayArray1 != null) {
			this.method1862(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray15, local4.anIntArray21);
		} else if (this.aClass155ArrayArray1 != null) {
			this.method1867(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray15, local4.anIntArray21);
		}
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)I")
	@Override
	public int method1844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> this.anInt1978;
		@Pc(9) int local9 = arg1 >> this.anInt1978;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt1963 - 1 || local9 > super.anInt1961 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & this.anInt1976 - 1;
		@Pc(41) int local41 = arg1 & this.anInt1976 - 1;
		@Pc(67) int local67 = this.anIntArrayArray33[local4][local9] * (this.anInt1976 - local34) + this.anIntArrayArray33[local4 + 1][local9] * local34 >> this.anInt1978;
		@Pc(97) int local97 = this.anIntArrayArray33[local4][local9 + 1] * (this.anInt1976 - local34) + this.anIntArrayArray33[local4 + 1][local9 + 1] * local34 >> this.anInt1978;
		return local67 * (this.anInt1976 - local41) + local97 * local41 >> this.anInt1978;
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(Lclient!lb;IIIIZ)V")
	@Override
	public void method1861(@OriginalArg(0) Class5_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method1850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		if (this.aClass155ArrayArray1 == null) {
			this.aClass155ArrayArray1 = new Class155[super.anInt1963][super.anInt1961];
			this.aClass102ArrayArray1 = new Class102[super.anInt1963][super.anInt1961];
		} else if (this.aClass114ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		@Pc(26) boolean local26 = false;
		@Pc(64) int local64;
		@Pc(70) int local70;
		if (arg8.length == 2 && arg5.length == 2 && (arg8[0] == arg8[1] || arg10[0] != -1 && arg10[0] == arg10[1])) {
			local26 = true;
			for (@Pc(57) int local57 = 1; local57 < 2; local57++) {
				local64 = arg2[arg5[local57]];
				local70 = arg4[arg5[local57]];
				if (local64 != 0 && local64 != this.anInt1976 || local70 != 0 && local70 != this.anInt1976) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class102 local95 = new Class102();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg8.length;
			local95.aShort18 = local99;
			local95.aShortArray28 = new short[local99];
			local95.anIntArray300 = new int[local99];
			local95.anIntArray296 = new int[local99];
			local95.anIntArray299 = new int[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray28[local124] = (short) (this.aByteArrayArray8[arg0][arg1] - this.aByteArrayArray9[arg0][arg1]);
				} else if (local129 == 0 && local133 == this.anInt1976) {
					local95.aShortArray28[local124] = (short) (this.aByteArrayArray8[arg0][arg1 + 1] - this.aByteArrayArray9[arg0][arg1 + 1]);
				} else if (local129 == this.anInt1976 && local133 == this.anInt1976) {
					local95.aShortArray28[local124] = (short) (this.aByteArrayArray8[arg0 + 1][arg1 + 1] - this.aByteArrayArray9[arg0 + 1][arg1 + 1]);
				} else if (local129 == this.anInt1976 && local133 == 0) {
					local95.aShortArray28[local124] = (short) (this.aByteArrayArray8[arg0 + 1][arg1] - this.aByteArrayArray9[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray8[arg0][arg1] - this.aByteArrayArray9[arg0][arg1]) * (this.anInt1976 - local129) + (this.aByteArrayArray8[arg0 + 1][arg1] - this.aByteArrayArray9[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray8[arg0][arg1 + 1] - this.aByteArrayArray9[arg0][arg1 + 1]) * (this.anInt1976 - local129) + (this.aByteArrayArray8[arg0 + 1][arg1 + 1] - this.aByteArrayArray9[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray28[local124] = (short) (local288 * (this.anInt1976 - local133) + local335 * local133 >> this.anInt1978 * 2);
				}
				local288 = (arg0 << this.anInt1978) + local129;
				local335 = (arg1 << this.anInt1978) + local133;
				local95.anIntArray300[local124] = local288;
				local95.anIntArray299[local124] = local335;
				local95.anIntArray296[local124] = this.method1844(local288, local335) + (arg3 == null ? 0 : arg3[local124]);
				if (local95.aShortArray28[local124] < 2) {
					local95.aShortArray28[local124] = 2;
				}
			}
			@Pc(412) boolean local412 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg8[local288] >= 0 || arg9 != null && arg9[local288] >= 0) {
					local133++;
				}
				if (arg10[local288] != -1 && !this.aClass55_Sub2_3.anInterface3_6.method1511(arg10[local288]).aBoolean540) {
					local412 = true;
				}
			}
			local95.anIntArray297 = new int[local133];
			if (arg9 != null) {
				local95.anIntArray298 = new int[local133];
			}
			local95.aShortArray33 = new short[local133];
			local95.aShortArray32 = new short[local133];
			local95.aShortArray31 = new short[local133];
			if (local412) {
				local95.aShortArray30 = new short[local133];
				local95.aShortArray29 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg8[local335] >= 0 || arg9 != null && arg9[local335] >= 0) {
					if (arg8[local335] >= 0) {
						local95.anIntArray297[local95.aShort19] = Static162.method2852(arg8[local335]);
					} else {
						local95.anIntArray297[local95.aShort19] = -1;
					}
					if (arg9 != null) {
						if (arg9[local335] == -1) {
							local95.anIntArray298[local95.aShort19] = -1;
						} else {
							local95.anIntArray298[local95.aShort19] = Static162.method2852(arg9[local335]);
						}
					}
					local95.aShortArray33[local95.aShort19] = (short) arg5[local335];
					local95.aShortArray32[local95.aShort19] = (short) arg6[local335];
					local95.aShortArray31[local95.aShort19] = (short) arg7[local335];
					if (local412) {
						if (arg10[local335] == -1 || this.aClass55_Sub2_3.anInterface3_6.method1511(arg10[local335]).aBoolean540) {
							local95.aShortArray30[local95.aShort19] = -1;
						} else {
							local95.aShortArray30[local95.aShort19] = (short) arg10[local335];
							local95.aShortArray29[local95.aShort19] = (short) arg11[local335];
						}
					}
					local95.aShort19++;
				}
			}
			this.aClass102ArrayArray1[arg0][arg1] = local95;
		} else if (arg8[0] >= 0 || arg9 != null && arg9[0] >= 0) {
			@Pc(641) Class155 local641 = new Class155();
			local64 = arg8[0];
			local70 = arg10[0];
			if (arg9 != null) {
				local641.anInt4699 = Static291.method5029(this.aByteArrayArray8[arg0][arg1] - this.aByteArrayArray9[arg0][arg1], Static162.method2852(arg9[0]));
				if (local64 == -1) {
					local641.aByte37 = (byte) (local641.aByte37 | 0x2);
				}
			}
			if (this.anIntArrayArray33[arg0][arg1] == this.anIntArrayArray33[arg0 + 1][arg1] && this.anIntArrayArray33[arg0][arg1] == this.anIntArrayArray33[arg0 + 1][arg1 + 1] && this.anIntArrayArray33[arg0][arg1] == this.anIntArrayArray33[arg0][arg1 + 1]) {
				local641.aByte37 = (byte) (local641.aByte37 | 0x1);
			}
			if (local70 == -1 || (local641.aByte37 & 0x2) != 0 || this.aClass55_Sub2_3.anInterface3_6.method1511(local70).aBoolean540) {
				@Pc(842) short local842 = Static162.method2852(local64);
				local641.aShort55 = (short) Static291.method5029(this.aByteArrayArray8[arg0][arg1] - this.aByteArrayArray9[arg0][arg1], local842);
				local641.aShort58 = (short) Static291.method5029(this.aByteArrayArray8[arg0 + 1][arg1] - this.aByteArrayArray9[arg0 + 1][arg1], local842);
				local641.aShort57 = (short) Static291.method5029(this.aByteArrayArray8[arg0 + 1][arg1 + 1] - this.aByteArrayArray9[arg0 + 1][arg1 + 1], local842);
				local641.aShort56 = (short) Static291.method5029(this.aByteArrayArray8[arg0][arg1 + 1] - this.aByteArrayArray9[arg0][arg1 + 1], local842);
				local641.aShort54 = -1;
			} else {
				local641.aShort55 = (short) (this.aByteArrayArray8[arg0][arg1] - this.aByteArrayArray9[arg0][arg1]);
				local641.aShort58 = (short) (this.aByteArrayArray8[arg0 + 1][arg1] - this.aByteArrayArray9[arg0 + 1][arg1]);
				local641.aShort57 = (short) (this.aByteArrayArray8[arg0 + 1][arg1 + 1] - this.aByteArrayArray9[arg0 + 1][arg1 + 1]);
				local641.aShort56 = (short) (this.aByteArrayArray8[arg0][arg1 + 1] - this.aByteArrayArray9[arg0][arg1 + 1]);
				local641.aShort54 = (short) local70;
			}
			this.aClass155ArrayArray1[arg0][arg1] = local641;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)V")
	@Override
	public void method1841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray9[arg0][arg1] < arg2) {
			this.aByteArrayArray9[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(Lclient!lb;IIIIZ)Z")
	@Override
	public boolean method1852(@OriginalArg(0) Class5_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)V")
	@Override
	public void method1843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class1 local4 = this.aClass55_Sub2_3.method5266(Thread.currentThread());
		local4.aClass80_1.anInt2018 = 0;
		if (this.aClass114ArrayArray1 != null) {
			this.method1865(arg0, arg1, this.aClass55_Sub2_3.aBoolean485, local4.aClass80_1, local4.anIntArray15, local4.anIntArray21, local4.anIntArray19);
		} else if (this.aClass155ArrayArray1 != null) {
			this.method1866(arg0, arg1, local4.aClass80_1, local4.anIntArray15, local4.anIntArray21, local4.anIntArray19);
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method1842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class66_Sub1 local3 = this.aClass55_Sub2_3.aClass66_Sub1_3;
		this.anInt1972 = local3.anInt1549;
		this.anInt1979 = local3.anInt1546;
		this.anInt1966 = local3.anInt1551;
		this.anInt1968 = local3.anInt1544;
		this.anInt1967 = local3.anInt1554;
		this.anInt1973 = local3.anInt1547;
		this.anInt1980 = local3.anInt1550;
		this.anInt1975 = local3.anInt1555;
		this.anInt1970 = local3.anInt1553;
		this.anInt1974 = local3.anInt1545;
		this.anInt1969 = local3.anInt1548;
		this.anInt1971 = local3.anInt1552;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIZLclient!gm;[I[I[I)V")
	private void method1865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class80 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class114 local6 = this.aClass114ArrayArray1[arg0][arg1];
		@Pc(29) int local29;
		@Pc(255) int local255;
		@Pc(311) int local311;
		@Pc(367) int local367;
		@Pc(423) int local423;
		@Pc(283) int local283;
		@Pc(339) int local339;
		@Pc(395) int local395;
		@Pc(451) int local451;
		@Pc(244) int local244;
		@Pc(300) int local300;
		@Pc(356) int local356;
		@Pc(412) int local412;
		@Pc(272) int local272;
		@Pc(328) int local328;
		@Pc(384) int local384;
		@Pc(440) int local440;
		@Pc(78) int local78;
		@Pc(101) int local101;
		@Pc(124) int local124;
		@Pc(147) int local147;
		@Pc(36) int local36;
		@Pc(38) int local38;
		@Pc(40) int local40;
		@Pc(42) int local42;
		@Pc(163) int local163;
		@Pc(56) int local56;
		@Pc(61) int local61;
		@Pc(222) int local222;
		@Pc(227) int local227;
		@Pc(620) int local620;
		if (local6 == null) {
			@Pc(1450) Class204 local1450 = this.aClass204ArrayArray1[arg0][arg1];
			if (local1450 != null) {
				for (local423 = 0; local423 < local1450.aShort89; local423++) {
					@Pc(1460) short local1460 = local1450.aShortArray113[local423];
					local29 = local1450.aShortArray114[local423];
					@Pc(1470) short local1470 = local1450.aShortArray112[local423];
					local367 = this.anInt1971 + (this.anInt1970 * local1460 + this.anInt1974 * local29 + this.anInt1969 * local1470 >> 15);
					if (local367 <= this.aClass55_Sub2_3.anInt5853) {
						return;
					}
					arg6[local423] = 0;
					if (arg2) {
						local283 = local367 - this.aClass55_Sub2_3.anInt5836;
						if (local283 > 255) {
							local283 = 255;
						}
						if (local283 > 0) {
							arg6[local423] = local283;
							local339 = local1450.aShortArray117[local423] * local283 / 255;
							if (local339 > 0) {
								local29 -= local339;
							}
						}
					} else if (this.aClass55_Sub2_3.aBoolean481) {
						local283 = local367 - this.aClass55_Sub2_3.anInt5836;
						if (local283 > 0) {
							arg6[local423] = local283;
							if (arg6[local423] > 255) {
								arg6[local423] = 255;
							}
						}
					}
					local255 = this.anInt1968 + (this.anInt1972 * local1460 + this.anInt1979 * local29 + this.anInt1966 * local1470 >> 15);
					local311 = this.anInt1975 + (this.anInt1967 * local1460 + this.anInt1973 * local29 + this.anInt1980 * local1470 >> 15);
					arg4[local423] = arg3.anInt2017 + local255 * this.aClass55_Sub2_3.anInt5844 / local367;
					arg5[local423] = arg3.anInt2014 + local311 * this.aClass55_Sub2_3.anInt5837 / local367;
				}
				if (local1450.aShortArray116 != null) {
					local283 = this.anIntArrayArray33[arg0][arg1];
					local339 = this.anIntArrayArray33[arg0 + 1][arg1];
					local395 = this.anIntArrayArray33[arg0][arg1 + 1];
					local451 = arg0 * this.anInt1976;
					local244 = local451 + this.anInt1976;
					local300 = arg1 * this.anInt1976;
					local356 = local300 + this.anInt1976;
					local412 = this.anInt1968 + (this.anInt1972 * local451 + this.anInt1979 * local283 + this.anInt1966 * local300 >> 15);
					local272 = this.anInt1975 + (this.anInt1967 * local451 + this.anInt1973 * local283 + this.anInt1980 * local300 >> 15);
					local328 = this.anInt1971 + (this.anInt1970 * local451 + this.anInt1974 * local283 + this.anInt1969 * local300 >> 15);
					local384 = this.anInt1968 + (this.anInt1972 * local244 + this.anInt1979 * local339 + this.anInt1966 * local300 >> 15);
					local440 = this.anInt1975 + (this.anInt1967 * local244 + this.anInt1973 * local339 + this.anInt1980 * local300 >> 15);
					local78 = this.anInt1971 + (this.anInt1970 * local244 + this.anInt1974 * local339 + this.anInt1969 * local300 >> 15);
					local101 = this.anInt1968 + (this.anInt1972 * local451 + this.anInt1979 * local395 + this.anInt1966 * local356 >> 15);
					local124 = this.anInt1975 + (this.anInt1967 * local451 + this.anInt1973 * local395 + this.anInt1980 * local356 >> 15);
					local147 = this.anInt1971 + (this.anInt1970 * local451 + this.anInt1974 * local395 + this.anInt1969 * local356 >> 15);
					for (local36 = 0; local36 < local1450.aShort88; local36++) {
						local38 = local36 * 3;
						local40 = local38 + 1;
						local42 = local40 + 1;
						local163 = arg4[local38];
						local56 = arg4[local40];
						local61 = arg4[local42];
						local222 = arg5[local38];
						local227 = arg5[local40];
						local620 = arg5[local42];
						@Pc(1910) int local1910 = arg6[local38] + arg6[local40] + arg6[local42];
						if ((local163 - local56) * (local620 - local227) - (local222 - local227) * (local61 - local56) > 0) {
							arg3.aBoolean146 = local163 < 0 || local56 < 0 || local61 < 0 || local163 > arg3.anInt2015 || local56 > arg3.anInt2015 || local61 > arg3.anInt2015;
							@Pc(1954) short local1954 = local1450.aShortArray116[local36];
							if (local1910 < 765) {
								if (local1954 != -1 && this.method1863(this.aClass55_Sub2_3.anInterface3_6.method1511(local1954).aByte63)) {
									arg3.anInt2018 = 100;
								}
								if (local1910 > 0) {
									if (local1954 != -1) {
										arg3.method1897(local222, local227, local620, local163, local56, local61, this.aClass55_Sub2_3.anInt5852, arg6[local38], arg6[local40], arg6[local42], local1450.anIntArray616[local38], local1450.anIntArray616[local40], local1450.anIntArray616[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1954);
									} else if ((local1450.anIntArray616[local38] & 0xFFFFFF) != 0) {
										arg3.method1895(local222, local227, local620, local163, local56, local61, Static119.method3395(local1450.anIntArray616[local38], arg6[local38] << 24 | this.aClass55_Sub2_3.anInt5852), Static119.method3395(local1450.anIntArray616[local40], arg6[local40] << 24 | this.aClass55_Sub2_3.anInt5852), Static119.method3395(local1450.anIntArray616[local42], arg6[local42] << 24 | this.aClass55_Sub2_3.anInt5852));
									}
								} else if (local1954 != -1) {
									arg3.method1891(local222, local227, local620, local163, local56, local61, local1450.anIntArray616[local38], local1450.anIntArray616[local40], local1450.anIntArray616[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1954);
								} else if ((local1450.anIntArray616[local38] & 0xFFFFFF) != 0) {
									arg3.method1895(local222, local227, local620, local163, local56, local61, local1450.anIntArray616[local38], local1450.anIntArray616[local40], local1450.anIntArray616[local42]);
								}
								arg3.anInt2018 = 0;
							} else {
								arg3.method1892(local222, local227, local620, local163, local56, local61, this.aClass55_Sub2_3.anInt5852);
							}
						}
					}
					return;
				}
				for (local283 = 0; local283 < local1450.aShort88; local283++) {
					local339 = local283 * 3;
					local395 = local339 + 1;
					local451 = local395 + 1;
					local244 = arg4[local339];
					local300 = arg4[local395];
					local356 = arg4[local451];
					local412 = arg5[local339];
					local272 = arg5[local395];
					local328 = arg5[local451];
					local384 = arg6[local339] + arg6[local395] + arg6[local451];
					if ((local244 - local300) * (local328 - local272) - (local412 - local272) * (local356 - local300) > 0) {
						arg3.aBoolean146 = local244 < 0 || local300 < 0 || local356 < 0 || local244 > arg3.anInt2015 || local300 > arg3.anInt2015 || local356 > arg3.anInt2015;
						if (local384 >= 765) {
							arg3.method1892(local412, local272, local328, local244, local300, local356, this.aClass55_Sub2_3.anInt5852);
						} else if (local384 > 0) {
							if ((local1450.anIntArray616[local339] & 0xFFFFFF) != 0) {
								arg3.method1895(local412, local272, local328, local244, local300, local356, Static27.method483(arg6[local339], local1450.anIntArray616[local339], this.aClass55_Sub2_3.anInt5852), Static27.method483(arg6[local395], local1450.anIntArray616[local395], this.aClass55_Sub2_3.anInt5852), Static27.method483(arg6[local451], local1450.anIntArray616[local451], this.aClass55_Sub2_3.anInt5852));
							}
						} else if ((local1450.anIntArray616[local339] & 0xFFFFFF) != 0) {
							arg3.method1895(local412, local272, local328, local244, local300, local356, local1450.anIntArray616[local339], local1450.anIntArray616[local395], local1450.anIntArray616[local451]);
						}
					}
				}
			}
		} else if ((local6.aByte19 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt1976;
			@Pc(24) int local24 = local19 + this.anInt1976;
			local29 = arg1 * this.anInt1976;
			@Pc(34) int local34 = local29 + this.anInt1976;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte19 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray33[arg0][arg1];
				local61 = this.anIntArrayArray33[arg0 + 1][arg1];
				local222 = this.anIntArrayArray33[arg0 + 1][arg1 + 1];
				local227 = this.anIntArrayArray33[arg0][arg1 + 1];
				local78 = this.anInt1971 + (this.anInt1970 * local19 + this.anInt1974 * local56 + this.anInt1969 * local29 >> 15);
				if (local78 <= this.aClass55_Sub2_3.anInt5853) {
					return;
				}
				local101 = this.anInt1971 + (this.anInt1970 * local24 + this.anInt1974 * local61 + this.anInt1969 * local29 >> 15);
				if (local101 <= this.aClass55_Sub2_3.anInt5853) {
					return;
				}
				local124 = this.anInt1971 + (this.anInt1970 * local24 + this.anInt1974 * local222 + this.anInt1969 * local34 >> 15);
				if (local124 <= this.aClass55_Sub2_3.anInt5853) {
					return;
				}
				local147 = this.anInt1971 + (this.anInt1970 * local19 + this.anInt1974 * local227 + this.anInt1969 * local34 >> 15);
				if (local147 <= this.aClass55_Sub2_3.anInt5853) {
					return;
				}
				if (arg2) {
					local163 = local78 - this.aClass55_Sub2_3.anInt5836;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local36 = local163;
						local620 = this.anIntArrayArray32[arg0][arg1] * local163 / 255;
						if (local620 > 0) {
							local56 -= local620;
						}
					}
					local163 = local101 - this.aClass55_Sub2_3.anInt5836;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local38 = local163;
						local620 = this.anIntArrayArray32[arg0 + 1][arg1] * local163 / 255;
						if (local620 > 0) {
							local61 -= local620;
						}
					}
					local163 = local124 - this.aClass55_Sub2_3.anInt5836;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local40 = local163;
						local620 = this.anIntArrayArray32[arg0 + 1][arg1 + 1] * local163 / 255;
						if (local620 > 0) {
							local222 -= local620;
						}
					}
					local163 = local147 - this.aClass55_Sub2_3.anInt5836;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local42 = local163;
						local620 = this.anIntArrayArray32[arg0][arg1 + 1] * local163 / 255;
						if (local620 > 0) {
							local227 -= local620;
						}
					}
				} else if (this.aClass55_Sub2_3.aBoolean481) {
					local163 = local78 - this.aClass55_Sub2_3.anInt5836;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass55_Sub2_3.anInt5836;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass55_Sub2_3.anInt5836;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass55_Sub2_3.anInt5836;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local244 = this.anInt1968 + (this.anInt1972 * local19 + this.anInt1979 * local56 + this.anInt1966 * local29 >> 15);
				local255 = arg3.anInt2017 + local244 * this.aClass55_Sub2_3.anInt5844 / local78;
				local272 = this.anInt1975 + (this.anInt1967 * local19 + this.anInt1973 * local56 + this.anInt1980 * local29 >> 15);
				local283 = arg3.anInt2014 + local272 * this.aClass55_Sub2_3.anInt5837 / local78;
				local300 = this.anInt1968 + (this.anInt1972 * local24 + this.anInt1979 * local61 + this.anInt1966 * local29 >> 15);
				local311 = arg3.anInt2017 + local300 * this.aClass55_Sub2_3.anInt5844 / local101;
				local328 = this.anInt1975 + (this.anInt1967 * local24 + this.anInt1973 * local61 + this.anInt1980 * local29 >> 15);
				local339 = arg3.anInt2014 + local328 * this.aClass55_Sub2_3.anInt5837 / local101;
				local356 = this.anInt1968 + (this.anInt1972 * local24 + this.anInt1979 * local222 + this.anInt1966 * local34 >> 15);
				local367 = arg3.anInt2017 + local356 * this.aClass55_Sub2_3.anInt5844 / local124;
				local384 = this.anInt1975 + (this.anInt1967 * local24 + this.anInt1973 * local222 + this.anInt1980 * local34 >> 15);
				local395 = arg3.anInt2014 + local384 * this.aClass55_Sub2_3.anInt5837 / local124;
				local412 = this.anInt1968 + (this.anInt1972 * local19 + this.anInt1979 * local227 + this.anInt1966 * local34 >> 15);
				local423 = arg3.anInt2017 + local412 * this.aClass55_Sub2_3.anInt5844 / local147;
				local440 = this.anInt1975 + (this.anInt1967 * local19 + this.anInt1973 * local227 + this.anInt1980 * local34 >> 15);
				local451 = arg3.anInt2014 + local440 * this.aClass55_Sub2_3.anInt5837 / local147;
			} else {
				local56 = this.anIntArrayArray33[arg0][arg1];
				local61 = this.anInt1974 * local56;
				local78 = this.anInt1971 + (this.anInt1970 * local19 + local61 + this.anInt1969 * local29 >> 15);
				if (local78 <= this.aClass55_Sub2_3.anInt5853) {
					return;
				}
				local101 = this.anInt1971 + (this.anInt1970 * local24 + local61 + this.anInt1969 * local29 >> 15);
				if (local101 <= this.aClass55_Sub2_3.anInt5853) {
					return;
				}
				local124 = this.anInt1971 + (this.anInt1970 * local24 + local61 + this.anInt1969 * local34 >> 15);
				if (local124 <= this.aClass55_Sub2_3.anInt5853) {
					return;
				}
				local147 = this.anInt1971 + (this.anInt1970 * local19 + local61 + this.anInt1969 * local34 >> 15);
				if (local147 <= this.aClass55_Sub2_3.anInt5853) {
					return;
				}
				if (this.aClass55_Sub2_3.aBoolean481) {
					local163 = local78 - this.aClass55_Sub2_3.anInt5836;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass55_Sub2_3.anInt5836;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass55_Sub2_3.anInt5836;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass55_Sub2_3.anInt5836;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local222 = this.anInt1979 * local56;
				local227 = this.anInt1973 * local56;
				local244 = this.anInt1968 + (this.anInt1972 * local19 + local222 + this.anInt1966 * local29 >> 15);
				local255 = arg3.anInt2017 + local244 * this.aClass55_Sub2_3.anInt5844 / local78;
				local272 = this.anInt1975 + (this.anInt1967 * local19 + local227 + this.anInt1980 * local29 >> 15);
				local283 = arg3.anInt2014 + local272 * this.aClass55_Sub2_3.anInt5837 / local78;
				local300 = this.anInt1968 + (this.anInt1972 * local24 + local222 + this.anInt1966 * local29 >> 15);
				local311 = arg3.anInt2017 + local300 * this.aClass55_Sub2_3.anInt5844 / local101;
				local328 = this.anInt1975 + (this.anInt1967 * local24 + local227 + this.anInt1980 * local29 >> 15);
				local339 = arg3.anInt2014 + local328 * this.aClass55_Sub2_3.anInt5837 / local101;
				local356 = this.anInt1968 + (this.anInt1972 * local24 + local222 + this.anInt1966 * local34 >> 15);
				local367 = arg3.anInt2017 + local356 * this.aClass55_Sub2_3.anInt5844 / local124;
				local384 = this.anInt1975 + (this.anInt1967 * local24 + local227 + this.anInt1980 * local34 >> 15);
				local395 = arg3.anInt2014 + local384 * this.aClass55_Sub2_3.anInt5837 / local124;
				local412 = this.anInt1968 + (this.anInt1972 * local19 + local222 + this.anInt1966 * local34 >> 15);
				local423 = arg3.anInt2017 + local412 * this.aClass55_Sub2_3.anInt5844 / local147;
				local440 = this.anInt1975 + (this.anInt1967 * local19 + local227 + this.anInt1980 * local34 >> 15);
				local451 = arg3.anInt2014 + local440 * this.aClass55_Sub2_3.anInt5837 / local147;
			}
			@Pc(1062) boolean local1062 = local6.aShort36 != -1 && this.method1863(this.aClass55_Sub2_3.anInterface3_6.method1511(local6.aShort36).aByte63);
			local61 = local38 + local40 + local42;
			if ((local367 - local423) * (local339 - local451) - (local395 - local451) * (local311 - local423) > 0) {
				arg3.aBoolean146 = local367 < 0 || local423 < 0 || local311 < 0 || local367 > arg3.anInt2015 || local423 > arg3.anInt2015 || local311 > arg3.anInt2015;
				if (local61 < 765) {
					if (local1062) {
						arg3.anInt2018 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort36 >= 0) {
							arg3.method1897(local395, local451, local339, local367, local423, local311, this.aClass55_Sub2_3.anInt5852, local40, local42, local38, local6.anInt3334, local6.anInt3336, local6.anInt3332, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort36);
						} else {
							arg3.method1895(local395, local451, local339, local367, local423, local311, Static119.method3395(local6.anInt3334, local40 << 24 | this.aClass55_Sub2_3.anInt5852), Static119.method3395(local6.anInt3336, local42 << 24 | this.aClass55_Sub2_3.anInt5852), Static119.method3395(local6.anInt3332, local38 << 24 | this.aClass55_Sub2_3.anInt5852));
						}
					} else if (local6.aShort36 >= 0) {
						arg3.method1891(local395, local451, local339, local367, local423, local311, local6.anInt3334, local6.anInt3336, local6.anInt3332, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort36);
					} else {
						arg3.method1895(local395, local451, local339, local367, local423, local311, local6.anInt3334, local6.anInt3336, local6.anInt3332);
					}
					arg3.anInt2018 = 0;
				} else {
					arg3.method1892(local395, local451, local339, local367, local423, local311, this.aClass55_Sub2_3.anInt5852);
				}
			}
			local61 = local36 + local38 + local42;
			if ((local255 - local311) * (local451 - local339) - (local283 - local339) * (local423 - local311) > 0) {
				arg3.aBoolean146 = local255 < 0 || local311 < 0 || local423 < 0 || local255 > arg3.anInt2015 || local311 > arg3.anInt2015 || local423 > arg3.anInt2015;
				if (local61 < 765) {
					if (local1062) {
						arg3.anInt2018 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort36 >= 0) {
							arg3.method1897(local283, local339, local451, local255, local311, local423, this.aClass55_Sub2_3.anInt5852, local36, local38, local42, local6.anInt3335, local6.anInt3332, local6.anInt3336, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort36);
						} else {
							arg3.method1895(local283, local339, local451, local255, local311, local423, Static119.method3395(local6.anInt3335, local36 << 24 | this.aClass55_Sub2_3.anInt5852), Static119.method3395(local6.anInt3332, local38 << 24 | this.aClass55_Sub2_3.anInt5852), Static119.method3395(local6.anInt3336, local42 << 24 | this.aClass55_Sub2_3.anInt5852));
						}
					} else if (local6.aShort36 >= 0) {
						arg3.method1891(local283, local339, local451, local255, local311, local423, local6.anInt3335, local6.anInt3332, local6.anInt3336, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort36);
					} else {
						arg3.method1895(local283, local339, local451, local255, local311, local423, local6.anInt3335, local6.anInt3332, local6.anInt3336);
					}
					arg3.anInt2018 = 0;
					return;
				}
				arg3.method1892(local283, local339, local451, local255, local311, local423, this.aClass55_Sub2_3.anInt5852);
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILclient!gm;[I[I[I)V")
	private void method1866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class155 local6 = this.aClass155ArrayArray1[arg0][arg1];
		@Pc(24) int local24;
		@Pc(29) int local29;
		@Pc(34) int local34;
		@Pc(181) int local181;
		@Pc(237) int local237;
		@Pc(293) int local293;
		@Pc(349) int local349;
		@Pc(209) int local209;
		@Pc(170) int local170;
		@Pc(226) int local226;
		@Pc(282) int local282;
		@Pc(338) int local338;
		@Pc(198) int local198;
		@Pc(254) int local254;
		@Pc(310) int local310;
		@Pc(366) int local366;
		@Pc(68) int local68;
		@Pc(91) int local91;
		@Pc(114) int local114;
		@Pc(137) int local137;
		@Pc(46) int local46;
		@Pc(265) int local265;
		@Pc(321) int local321;
		@Pc(377) int local377;
		if (local6 == null) {
			@Pc(996) Class102 local996 = this.aClass102ArrayArray1[arg0][arg1];
			if (local996 != null) {
				for (local349 = 0; local349 < local996.aShort18; local349++) {
					local24 = local996.anIntArray300[local349];
					local29 = local996.anIntArray296[local349];
					local34 = local996.anIntArray299[local349];
					local293 = this.anInt1971 + (this.anInt1970 * local24 + this.anInt1974 * local29 + this.anInt1969 * local34 >> 15);
					if (local293 <= this.aClass55_Sub2_3.anInt5853) {
						return;
					}
					local181 = this.anInt1968 + (this.anInt1972 * local24 + this.anInt1979 * local29 + this.anInt1966 * local34 >> 15);
					local237 = this.anInt1975 + (this.anInt1967 * local24 + this.anInt1973 * local29 + this.anInt1980 * local34 >> 15);
					arg3[local349] = arg2.anInt2017 + local181 * this.aClass55_Sub2_3.anInt5844 / local293;
					arg4[local349] = arg2.anInt2014 + local237 * this.aClass55_Sub2_3.anInt5837 / local293;
				}
				if (local996.aShortArray30 != null) {
					local209 = this.anIntArrayArray33[arg0][arg1];
					local265 = this.anIntArrayArray33[arg0 + 1][arg1];
					local321 = this.anIntArrayArray33[arg0][arg1 + 1];
					local377 = arg0 * this.anInt1976;
					local170 = local377 + this.anInt1976;
					local226 = arg1 * this.anInt1976;
					local282 = local226 + this.anInt1976;
					local338 = this.anInt1968 + (this.anInt1972 * local377 + this.anInt1979 * local209 + this.anInt1966 * local226 >> 15);
					local198 = this.anInt1975 + (this.anInt1967 * local377 + this.anInt1973 * local209 + this.anInt1980 * local226 >> 15);
					local254 = this.anInt1971 + (this.anInt1970 * local377 + this.anInt1974 * local209 + this.anInt1969 * local226 >> 15);
					local310 = this.anInt1968 + (this.anInt1972 * local170 + this.anInt1979 * local265 + this.anInt1966 * local226 >> 15);
					local366 = this.anInt1975 + (this.anInt1967 * local170 + this.anInt1973 * local265 + this.anInt1980 * local226 >> 15);
					local68 = this.anInt1971 + (this.anInt1970 * local170 + this.anInt1974 * local265 + this.anInt1969 * local226 >> 15);
					local91 = this.anInt1968 + (this.anInt1972 * local377 + this.anInt1979 * local321 + this.anInt1966 * local282 >> 15);
					local114 = this.anInt1975 + (this.anInt1967 * local377 + this.anInt1973 * local321 + this.anInt1980 * local282 >> 15);
					local137 = this.anInt1971 + (this.anInt1970 * local377 + this.anInt1974 * local321 + this.anInt1969 * local282 >> 15);
					for (local46 = 0; local46 < local996.aShort19; local46++) {
						@Pc(1349) short local1349 = local996.aShortArray33[local46];
						@Pc(1354) short local1354 = local996.aShortArray32[local46];
						@Pc(1359) short local1359 = local996.aShortArray31[local46];
						@Pc(1363) int local1363 = arg3[local1349];
						@Pc(1367) int local1367 = arg3[local1354];
						@Pc(1371) int local1371 = arg3[local1359];
						@Pc(1375) int local1375 = arg4[local1349];
						@Pc(1379) int local1379 = arg4[local1354];
						@Pc(1383) int local1383 = arg4[local1359];
						if ((local1363 - local1367) * (local1383 - local1379) - (local1375 - local1379) * (local1371 - local1367) > 0) {
							arg2.aBoolean146 = local1363 < 0 || local1367 < 0 || local1371 < 0 || local1363 > arg2.anInt2015 || local1367 > arg2.anInt2015 || local1371 > arg2.anInt2015;
							@Pc(1427) short local1427 = local996.aShortArray30[local46];
							if (local1427 == -1) {
								@Pc(1482) int local1482 = local996.anIntArray297[local46];
								if (local1482 != -1) {
									arg2.method1890(local1375, local1379, local1383, local1363, local1367, local1371, Static291.method5029(local996.aShortArray28[local1349], local1482), Static291.method5029(local996.aShortArray28[local1354], local1482), Static291.method5029(local996.aShortArray28[local1359], local1482));
								}
							} else {
								if (this.method1863(this.aClass55_Sub2_3.anInterface3_6.method1511(local1427).aByte63)) {
									arg2.anInt2018 = 100;
								}
								arg2.method1891(local1375, local1379, local1383, local1363, local1367, local1371, local996.aShortArray28[local1349], local996.aShortArray28[local1354], local996.aShortArray28[local1359], local338, local310, local91, local198, local366, local114, local254, local68, local137, local1427);
								arg2.anInt2018 = 0;
							}
						}
					}
					return;
				}
				for (local209 = 0; local209 < local996.aShort19; local209++) {
					@Pc(1528) short local1528 = local996.aShortArray33[local209];
					@Pc(1533) short local1533 = local996.aShortArray32[local209];
					@Pc(1538) short local1538 = local996.aShortArray31[local209];
					local170 = arg3[local1528];
					local226 = arg3[local1533];
					local282 = arg3[local1538];
					local338 = arg4[local1528];
					local198 = arg4[local1533];
					local254 = arg4[local1538];
					if ((local170 - local226) * (local254 - local198) - (local338 - local198) * (local282 - local226) > 0) {
						local310 = local996.anIntArray297[local209];
						if (local310 != -1) {
							arg2.aBoolean146 = local170 < 0 || local226 < 0 || local282 < 0 || local170 > arg2.anInt2015 || local226 > arg2.anInt2015 || local282 > arg2.anInt2015;
							arg2.method1890(local338, local198, local254, local170, local226, local282, Static291.method5029(local996.aShortArray28[local1528], local310), Static291.method5029(local996.aShortArray28[local1533], local310), Static291.method5029(local996.aShortArray28[local1538], local310));
						}
					}
				}
			}
		} else if ((local6.aByte37 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt1976;
			local24 = local19 + this.anInt1976;
			local29 = arg1 * this.anInt1976;
			local34 = local29 + this.anInt1976;
			@Pc(51) int local51;
			@Pc(148) int local148;
			@Pc(153) int local153;
			if ((local6.aByte37 & 0x1) == 0) {
				local46 = this.anIntArrayArray33[arg0][arg1];
				local51 = this.anIntArrayArray33[arg0 + 1][arg1];
				local148 = this.anIntArrayArray33[arg0 + 1][arg1 + 1];
				local153 = this.anIntArrayArray33[arg0][arg1 + 1];
				local68 = this.anInt1971 + (this.anInt1970 * local19 + this.anInt1974 * local46 + this.anInt1969 * local29 >> 15);
				if (local68 <= this.aClass55_Sub2_3.anInt5853) {
					return;
				}
				local91 = this.anInt1971 + (this.anInt1970 * local24 + this.anInt1974 * local51 + this.anInt1969 * local29 >> 15);
				if (local91 <= this.aClass55_Sub2_3.anInt5853) {
					return;
				}
				local114 = this.anInt1971 + (this.anInt1970 * local24 + this.anInt1974 * local148 + this.anInt1969 * local34 >> 15);
				if (local114 <= this.aClass55_Sub2_3.anInt5853) {
					return;
				}
				local137 = this.anInt1971 + (this.anInt1970 * local19 + this.anInt1974 * local153 + this.anInt1969 * local34 >> 15);
				if (local137 <= this.aClass55_Sub2_3.anInt5853) {
					return;
				}
				local170 = this.anInt1968 + (this.anInt1972 * local19 + this.anInt1979 * local46 + this.anInt1966 * local29 >> 15);
				local181 = arg2.anInt2017 + local170 * this.aClass55_Sub2_3.anInt5844 / local68;
				local198 = this.anInt1975 + (this.anInt1967 * local19 + this.anInt1973 * local46 + this.anInt1980 * local29 >> 15);
				local209 = arg2.anInt2014 + local198 * this.aClass55_Sub2_3.anInt5837 / local68;
				local226 = this.anInt1968 + (this.anInt1972 * local24 + this.anInt1979 * local51 + this.anInt1966 * local29 >> 15);
				local237 = arg2.anInt2017 + local226 * this.aClass55_Sub2_3.anInt5844 / local91;
				local254 = this.anInt1975 + (this.anInt1967 * local24 + this.anInt1973 * local51 + this.anInt1980 * local29 >> 15);
				local265 = arg2.anInt2014 + local254 * this.aClass55_Sub2_3.anInt5837 / local91;
				local282 = this.anInt1968 + (this.anInt1972 * local24 + this.anInt1979 * local148 + this.anInt1966 * local34 >> 15);
				local293 = arg2.anInt2017 + local282 * this.aClass55_Sub2_3.anInt5844 / local114;
				local310 = this.anInt1975 + (this.anInt1967 * local24 + this.anInt1973 * local148 + this.anInt1980 * local34 >> 15);
				local321 = arg2.anInt2014 + local310 * this.aClass55_Sub2_3.anInt5837 / local114;
				local338 = this.anInt1968 + (this.anInt1972 * local19 + this.anInt1979 * local153 + this.anInt1966 * local34 >> 15);
				local349 = arg2.anInt2017 + local338 * this.aClass55_Sub2_3.anInt5844 / local137;
				local366 = this.anInt1975 + (this.anInt1967 * local19 + this.anInt1973 * local153 + this.anInt1980 * local34 >> 15);
				local377 = arg2.anInt2014 + local366 * this.aClass55_Sub2_3.anInt5837 / local137;
			} else {
				local46 = this.anIntArrayArray33[arg0][arg1];
				local51 = this.anInt1974 * local46;
				local68 = this.anInt1971 + (this.anInt1970 * local19 + local51 + this.anInt1969 * local29 >> 15);
				if (local68 <= this.aClass55_Sub2_3.anInt5853) {
					return;
				}
				local91 = this.anInt1971 + (this.anInt1970 * local24 + local51 + this.anInt1969 * local29 >> 15);
				if (local91 <= this.aClass55_Sub2_3.anInt5853) {
					return;
				}
				local114 = this.anInt1971 + (this.anInt1970 * local24 + local51 + this.anInt1969 * local34 >> 15);
				if (local114 <= this.aClass55_Sub2_3.anInt5853) {
					return;
				}
				local137 = this.anInt1971 + (this.anInt1970 * local19 + local51 + this.anInt1969 * local34 >> 15);
				if (local137 <= this.aClass55_Sub2_3.anInt5853) {
					return;
				}
				local148 = this.anInt1979 * local46;
				local153 = this.anInt1973 * local46;
				local170 = this.anInt1968 + (this.anInt1972 * local19 + local148 + this.anInt1966 * local29 >> 15);
				local181 = arg2.anInt2017 + local170 * this.aClass55_Sub2_3.anInt5844 / local68;
				local198 = this.anInt1975 + (this.anInt1967 * local19 + local153 + this.anInt1980 * local29 >> 15);
				local209 = arg2.anInt2014 + local198 * this.aClass55_Sub2_3.anInt5837 / local68;
				local226 = this.anInt1968 + (this.anInt1972 * local24 + local148 + this.anInt1966 * local29 >> 15);
				local237 = arg2.anInt2017 + local226 * this.aClass55_Sub2_3.anInt5844 / local91;
				local254 = this.anInt1975 + (this.anInt1967 * local24 + local153 + this.anInt1980 * local29 >> 15);
				local265 = arg2.anInt2014 + local254 * this.aClass55_Sub2_3.anInt5837 / local91;
				local282 = this.anInt1968 + (this.anInt1972 * local24 + local148 + this.anInt1966 * local34 >> 15);
				local293 = arg2.anInt2017 + local282 * this.aClass55_Sub2_3.anInt5844 / local114;
				local310 = this.anInt1975 + (this.anInt1967 * local24 + local153 + this.anInt1980 * local34 >> 15);
				local321 = arg2.anInt2014 + local310 * this.aClass55_Sub2_3.anInt5837 / local114;
				local338 = this.anInt1968 + (this.anInt1972 * local19 + local148 + this.anInt1966 * local34 >> 15);
				local349 = arg2.anInt2017 + local338 * this.aClass55_Sub2_3.anInt5844 / local137;
				local366 = this.anInt1975 + (this.anInt1967 * local19 + local153 + this.anInt1980 * local34 >> 15);
				local377 = arg2.anInt2014 + local366 * this.aClass55_Sub2_3.anInt5837 / local137;
			}
			if ((local293 - local349) * (local265 - local377) - (local321 - local377) * (local237 - local349) > 0) {
				arg2.aBoolean146 = local293 < 0 || local349 < 0 || local237 < 0 || local293 > arg2.anInt2015 || local349 > arg2.anInt2015 || local237 > arg2.anInt2015;
				if (local6.aShort54 >= 0) {
					if (this.method1863(this.aClass55_Sub2_3.anInterface3_6.method1511(local6.aShort54).aByte63)) {
						arg2.anInt2018 = 100;
					}
					arg2.method1891(local321, local377, local265, local293, local349, local237, local6.aShort57 & 0xFFFF, local6.aShort56 & 0xFFFF, local6.aShort58 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort54);
					arg2.anInt2018 = 0;
				} else {
					arg2.method1890(local321, local377, local265, local293, local349, local237, local6.aShort57 & 0xFFFF, local6.aShort56 & 0xFFFF, local6.aShort58 & 0xFFFF);
				}
			}
			if ((local181 - local237) * (local377 - local265) - (local209 - local265) * (local349 - local237) > 0) {
				arg2.aBoolean146 = local181 < 0 || local237 < 0 || local349 < 0 || local181 > arg2.anInt2015 || local237 > arg2.anInt2015 || local349 > arg2.anInt2015;
				if (local6.aShort54 >= 0) {
					if (this.method1863(this.aClass55_Sub2_3.anInterface3_6.method1511(local6.aShort54).aByte63)) {
						arg2.anInt2018 = 100;
					}
					arg2.method1891(local209, local265, local377, local181, local237, local349, local6.aShort55 & 0xFFFF, local6.aShort58 & 0xFFFF, local6.aShort56 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort54);
					arg2.anInt2018 = 0;
					return;
				}
				arg2.method1890(local209, local265, local377, local181, local237, local349, local6.aShort55 & 0xFFFF, local6.aShort58 & 0xFFFF, local6.aShort56 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILclient!lb;)Lclient!lb;")
	@Override
	public Class5_Sub1_Sub10 method1858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub1_Sub10 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(IIIIIII[[ZLclient!gm;[I[I)V")
	private void method1867(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class80 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean149 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass155ArrayArray1[local22][local25] != null) {
						@Pc(50) Class155 local50 = this.aClass155ArrayArray1[local22][local25];
						if (local50.aShort54 != -1 && (local50.aByte37 & 0x2) == 0 && local50.anInt4699 == -1) {
							local69 = this.aClass55_Sub2_3.method5262(local50.aShort54);
							arg5.method1890(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static291.method5029(local50.aShort57 & 0xFFFF, local69), Static291.method5029(local50.aShort56 & 0xFFFF, local69), Static291.method5029(local50.aShort58 & 0xFFFF, local69));
							arg5.method1890(local20, local20, local20 - 4, local16, local16 + 4, local16, Static291.method5029(local50.aShort55 & 0xFFFF, local69), Static291.method5029(local50.aShort58 & 0xFFFF, local69), Static291.method5029(local50.aShort56 & 0xFFFF, local69));
						} else if (local50.anInt4699 == -1) {
							arg5.method1890(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort57 & 0xFFFF, local50.aShort56 & 0xFFFF, local50.aShort58 & 0xFFFF);
							arg5.method1890(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort55 & 0xFFFF, local50.aShort58 & 0xFFFF, local50.aShort56 & 0xFFFF);
						} else {
							local69 = local50.anInt4699;
							arg5.method1890(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method1890(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass102ArrayArray1[local22][local25] != null) {
						@Pc(249) Class102 local249 = this.aClass102ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort18; local69++) {
							arg6[local69] = local16 + (local249.anIntArray300[local69] - local22 * this.anInt1976) * 4 / this.anInt1976;
							arg7[local69] = local20 - (local249.anIntArray299[local69] - local25 * this.anInt1976) * 4 / this.anInt1976;
						}
						for (@Pc(297) int local297 = 0; local297 < local249.aShort19; local297++) {
							@Pc(303) short local303 = local249.aShortArray33[local297];
							@Pc(308) short local308 = local249.aShortArray32[local297];
							@Pc(313) short local313 = local249.aShortArray31[local297];
							@Pc(317) int local317 = arg6[local303];
							@Pc(321) int local321 = arg6[local308];
							@Pc(325) int local325 = arg6[local313];
							@Pc(329) int local329 = arg7[local303];
							@Pc(333) int local333 = arg7[local308];
							@Pc(337) int local337 = arg7[local313];
							@Pc(351) int local351;
							if (local249.anIntArray298 != null && local249.anIntArray298[local297] != -1) {
								local351 = local249.anIntArray298[local297];
								arg5.method1890(local329, local333, local337, local317, local321, local325, Static291.method5029(local249.aShortArray28[local303], local351), Static291.method5029(local249.aShortArray28[local308], local351), Static291.method5029(local249.aShortArray28[local313], local351));
							} else if (local249.aShortArray30 == null || local249.aShortArray30[local297] == -1) {
								local351 = local249.anIntArray297[local297];
								arg5.method1890(local329, local333, local337, local317, local321, local325, Static291.method5029(local249.aShortArray28[local303], local351), Static291.method5029(local249.aShortArray28[local308], local351), Static291.method5029(local249.aShortArray28[local313], local351));
							} else {
								local351 = this.aClass55_Sub2_3.method5262(local249.aShortArray30[local297]);
								arg5.method1890(local329, local333, local337, local317, local321, local325, Static291.method5029(local249.aShortArray28[local303], local351), Static291.method5029(local249.aShortArray28[local308], local351), Static291.method5029(local249.aShortArray28[local313], local351));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean149 = true;
	}
}
