import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public abstract class Class62_Sub1 extends Class62 {

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
	protected int anInt4246;

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
	protected int anInt4247;

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "I")
	protected int anInt4248;

	@OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
	protected int anInt4249;

	@OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
	protected int anInt4250;

	@OriginalMember(owner = "client!jj", name = "r", descriptor = "[[Lclient!sa;")
	protected Class279[][] aClass279ArrayArray3;

	@OriginalMember(owner = "client!jj", name = "s", descriptor = "[[Lclient!om;")
	protected Class239[][] aClass239ArrayArray3;

	@OriginalMember(owner = "client!jj", name = "t", descriptor = "[[Lclient!sca;")
	protected Class282[][] aClass282ArrayArray3;

	@OriginalMember(owner = "client!jj", name = "v", descriptor = "I")
	protected int anInt4251;

	@OriginalMember(owner = "client!jj", name = "w", descriptor = "I")
	protected int anInt4252;

	@OriginalMember(owner = "client!jj", name = "y", descriptor = "I")
	protected int anInt4253;

	@OriginalMember(owner = "client!jj", name = "z", descriptor = "I")
	protected int anInt4254;

	@OriginalMember(owner = "client!jj", name = "A", descriptor = "[[Lclient!cg;")
	protected Class53[][] aClass53ArrayArray3;

	@OriginalMember(owner = "client!jj", name = "D", descriptor = "I")
	protected int anInt4256;

	@OriginalMember(owner = "client!jj", name = "E", descriptor = "I")
	protected int anInt4257;

	@OriginalMember(owner = "client!jj", name = "F", descriptor = "I")
	protected int anInt4258;

	@OriginalMember(owner = "client!jj", name = "B", descriptor = "I")
	protected int anInt4255 = -1;

	@OriginalMember(owner = "client!jj", name = "x", descriptor = "Lclient!uq;")
	protected final Class9_Sub1 aClass9_Sub1_6;

	@OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
	private final int anInt4259;

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "[[I")
	public final int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!jj", name = "C", descriptor = "[[B")
	private byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!jj", name = "u", descriptor = "[[B")
	private byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!uq;IIII[[I[[II)V")
	public Class62_Sub1(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass9_Sub1_6 = arg0;
		this.anInt4259 = arg2;
		this.anIntArrayArray30 = arg5;
		this.aByteArrayArray17 = new byte[arg3 + 1][arg4 + 1];
		@Pc(31) int local31 = this.aClass9_Sub1_6.anInt1835 >> 9;
		for (@Pc(33) int local33 = 1; local33 < arg4; local33++) {
			for (@Pc(36) int local36 = 1; local36 < arg3; local36++) {
				@Pc(55) int local55 = arg6[local36 + 1][local33] - arg6[local36 - 1][local33];
				@Pc(71) int local71 = arg6[local36][local33 + 1] - arg6[local36][local33 - 1];
				@Pc(86) int local86 = (int) Math.sqrt((double) (local55 * local55 + arg7 * 512 + local71 * local71));
				@Pc(92) int local92 = (local55 << 8) / local86;
				@Pc(98) int local98 = arg7 * -512 / local86;
				@Pc(104) int local104 = (local71 << 8) / local86;
				@Pc(126) int local126 = local31 + (this.aClass9_Sub1_6.anInt1825 * local92 + this.aClass9_Sub1_6.anInt1818 * local98 + this.aClass9_Sub1_6.anInt1819 * local104 >> 17);
				local126 >>= 0x1;
				if (local126 < 2) {
					local126 = 2;
				} else if (local126 > 126) {
					local126 = 126;
				}
				this.aByteArrayArray17[local36][local33] = (byte) local126;
			}
		}
		this.aByteArrayArray16 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!od;[I)V")
	@Override
	public final void method8203(@OriginalArg(0) Class6_Sub29 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!jj", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public final void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass53ArrayArray3 == null) {
			this.aClass53ArrayArray3 = new Class53[super.anInt9881][super.anInt9885];
			this.aClass239ArrayArray3 = new Class239[super.anInt9881][super.anInt9885];
		} else if (this.aClass279ArrayArray3 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static29.anIntArray66[Static340.method5371(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static29.anIntArray66[Static340.method5371(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
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
					if (local104 != -1 && arg6[local104] != arg6[local116]) {
						local102 = false;
						break;
					}
					local104 = local116;
				} else if (arg2[local116] == super.anInt9884 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt9884 && arg4[local116] == super.anInt9884) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt9884) {
					if (local110 != -1 && arg6[local110] != arg6[local116]) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt9884 && arg2[local244] != arg2[0] - super.anInt9884) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt9884 && arg4[local244] != arg4[0] - super.anInt9884) {
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
		@Pc(527) int local527;
		if (local102) {
			@Pc(334) Class53 local334 = new Class53();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt1511 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte23 = (byte) (local334.aByte23 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray30[arg0][arg1] == this.anIntArrayArray30[arg0 + 1][arg1] && this.anIntArrayArray30[arg0][arg1] == this.anIntArrayArray30[arg0 + 1][arg1 + 1] && this.anIntArrayArray30[arg0][arg1] == this.anIntArrayArray30[arg0][arg1 + 1]) {
				local334.aByte23 = (byte) (local334.aByte23 | 0x1);
			}
			if (local342 == -1 || (local334.aByte23 & 0x2) != 0 || this.aClass9_Sub1_6.anInterface2_11.method3585(local342).aBoolean656) {
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local104] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt1510 = Static167.method3388(local527, Static588.method3721(arg6[local104] >> 8, this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]), arg10);
				if (local334.anInt1511 != 0) {
					local334.anInt1510 |= this.aByteArrayArray16[arg0][arg1] + 255 - this.aByteArrayArray17[arg0][arg1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local106] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt1507 = Static167.method3388(local527, Static588.method3721(arg6[local106] >> 8, this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]), arg10);
				if (local334.anInt1511 != 0) {
					local334.anInt1507 |= this.aByteArrayArray16[arg0 + 1][arg1] + 255 - this.aByteArrayArray17[arg0 + 1][arg1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local108] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt1509 = Static167.method3388(local527, Static588.method3721(arg6[local108] >> 8, this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]), arg10);
				if (local334.anInt1511 != 0) {
					local334.anInt1509 |= this.aByteArrayArray16[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray17[arg0 + 1][arg1 + 1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local110] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt1508 = Static167.method3388(local527, Static588.method3721(arg6[local110] >> 8, this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]), arg10);
				if (local334.anInt1511 != 0) {
					local334.anInt1508 |= this.aByteArrayArray16[arg0][arg1 + 1] + 255 - this.aByteArrayArray17[arg0][arg1 + 1] << 25;
				}
				local334.aShort15 = -1;
			} else {
				local334.anInt1510 = this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1];
				local334.anInt1507 = this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1];
				local334.anInt1509 = this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1];
				local334.anInt1508 = this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1];
				local334.aShort15 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort17 = (short) arg5[local108];
				local334.aShort16 = (short) arg5[local110];
				local334.aShort13 = (short) arg5[local106];
				local334.aShort14 = (short) arg5[local104];
			}
			this.aClass53ArrayArray3[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class239 local888 = new Class239();
		local888.aShort70 = (short) arg2.length;
		local888.aShort69 = (short) (arg2.length / 3);
		local888.aShortArray82 = new short[local888.aShort70];
		local888.aShortArray77 = new short[local888.aShort70];
		local888.aShortArray81 = new short[local888.aShort70];
		local888.anIntArray500 = new int[local888.aShort70];
		if (arg5 != null) {
			local888.aShortArray80 = new short[local888.aShort70];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort70; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt9884) {
				local958 = this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1];
			} else if (local342 == super.anInt9884 && local527 == super.anInt9884) {
				local958 = this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt9884 && local527 == 0) {
				local958 = this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]) * (super.anInt9884 - local342) + (this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]) * (super.anInt9884 - local342) + (this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt9884 - local527) + local1126 * local527 >> super.anInt9883 * 2;
			}
			local1079 = (arg0 << super.anInt9883) + local342;
			local1126 = (arg1 << super.anInt9883) + local527;
			local888.aShortArray82[local244] = (short) local342;
			local888.aShortArray81[local244] = (short) local527;
			local888.aShortArray77[local244] = (short) (this.sa(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass9_Sub1_6.anInterface2_11.method3585(arg8[local244]).aBoolean656) {
				local888.anIntArray500[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray80[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray500[local244] = Static167.method3388(local1226, Static588.method3721(arg6[local244] >> 8, local958), arg10);
				if (arg7 != null) {
					local888.anIntArray500[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray500[local244] = 0;
			} else {
				local888.anIntArray500[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort69; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass9_Sub1_6.anInterface2_11.method3585(arg8[local527 * 3]).aBoolean656) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray499 = new int[local888.aShort69];
		}
		if (local1296) {
			local888.aShortArray79 = new short[local888.aShort69];
			local888.aShortArray78 = new short[local888.aShort69];
		}
		for (local958 = 0; local958 < local888.aShort69; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray499[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass9_Sub1_6.anInterface2_11.method3585(local1384).aBoolean656) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass9_Sub1_6.anInterface2_11.method3585(local1384).aBoolean656) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass9_Sub1_6.anInterface2_11.method3585(local1384).aBoolean656) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray79[local958] = (short) local1384;
					local888.aShortArray78[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass9_Sub1_6.anInterface2_11.method3585(local1384).aBoolean656) {
							local888.anIntArray500[local1079] = Static29.anIntArray66[Static340.method5371(this.aClass9_Sub1_6.anInterface2_11.method3585(local1384).aShort125 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass9_Sub1_6.anInterface2_11.method3585(local1384).aBoolean656) {
							local888.anIntArray500[local1126] = Static29.anIntArray66[Static340.method5371(this.aClass9_Sub1_6.anInterface2_11.method3585(local1384).aShort125 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass9_Sub1_6.anInterface2_11.method3585(local1384).aBoolean656) {
							local888.anIntArray500[local1226] = Static29.anIntArray66[Static340.method5371(this.aClass9_Sub1_6.anInterface2_11.method3585(local1384).aShort125 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray79[local958] = -1;
				}
			}
		}
		this.aClass239ArrayArray3[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!jj", name = "JA", descriptor = "(II)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray30[arg0][arg1];
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public final void method8201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass279ArrayArray3 == null) {
			this.aClass279ArrayArray3 = new Class279[super.anInt9881][super.anInt9885];
			this.aClass282ArrayArray3 = new Class282[super.anInt9881][super.anInt9885];
		} else if (this.aClass53ArrayArray3 != null) {
			throw new IllegalStateException();
		}
		@Pc(26) boolean local26 = false;
		@Pc(64) int local64;
		@Pc(70) int local70;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			local26 = true;
			for (@Pc(57) int local57 = 1; local57 < 2; local57++) {
				local64 = arg2[arg6[local57]];
				local70 = arg4[arg6[local57]];
				if (local64 != 0 && local64 != super.anInt9884 || local70 != 0 && local70 != super.anInt9884) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class282 local95 = new Class282();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort120 = local99;
			local95.aShortArray142 = new short[local99];
			local95.aShortArray145 = new short[local99];
			local95.aShortArray141 = new short[local99];
			local95.aShortArray148 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray142[local124] = (short) (this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt9884) {
					local95.aShortArray142[local124] = (short) (this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]);
				} else if (local129 == super.anInt9884 && local133 == super.anInt9884) {
					local95.aShortArray142[local124] = (short) (this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt9884 && local133 == 0) {
					local95.aShortArray142[local124] = (short) (this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]) * (super.anInt9884 - local129) + (this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]) * (super.anInt9884 - local129) + (this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray142[local124] = (short) (local288 * (super.anInt9884 - local133) + local335 * local133 >> super.anInt9883 * 2);
				}
				local288 = (arg0 << super.anInt9883) + local129;
				local335 = (arg1 << super.anInt9883) + local133;
				local95.aShortArray145[local124] = (short) local129;
				local95.aShortArray148[local124] = (short) local133;
				local95.aShortArray141[local124] = (short) (this.sa(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray142[local124] < 2) {
					local95.aShortArray142[local124] = 2;
				}
			}
			@Pc(415) boolean local415 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass9_Sub1_6.anInterface2_11.method3585(arg11[local288]).aBoolean656) {
					local415 = true;
				}
			}
			local95.anIntArray703 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray702 = new int[local133];
			}
			local95.aShortArray140 = new short[local133];
			local95.aShortArray143 = new short[local133];
			local95.aShortArray144 = new short[local133];
			if (local415) {
				local95.aShortArray147 = new short[local133];
				local95.aShortArray146 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray703[local95.aShort121] = Static340.method5371(arg9[local335]);
					} else {
						local95.anIntArray703[local95.aShort121] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray702[local95.aShort121] = -1;
						} else {
							local95.anIntArray702[local95.aShort121] = Static340.method5371(arg10[local335]);
						}
					}
					local95.aShortArray140[local95.aShort121] = (short) arg6[local335];
					local95.aShortArray143[local95.aShort121] = (short) arg7[local335];
					local95.aShortArray144[local95.aShort121] = (short) arg8[local335];
					if (local415) {
						if (arg11[local335] == -1 || this.aClass9_Sub1_6.anInterface2_11.method3585(arg11[local335]).aBoolean656) {
							local95.aShortArray147[local95.aShort121] = -1;
						} else {
							local95.aShortArray147[local95.aShort121] = (short) arg11[local335];
							local95.aShortArray146[local95.aShort121] = (short) arg12[local335];
						}
					}
					local95.aShort121++;
				}
			}
			this.aClass282ArrayArray3[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(644) Class279 local644 = new Class279();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local644.anInt8433 = Static499.method7465(Static340.method5371(arg10[0]), this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]);
				if (local64 == -1) {
					local644.aByte99 = (byte) (local644.aByte99 | 0x2);
				}
			}
			if (this.anIntArrayArray30[arg0][arg1] == this.anIntArrayArray30[arg0 + 1][arg1] && this.anIntArrayArray30[arg0][arg1] == this.anIntArrayArray30[arg0 + 1][arg1 + 1] && this.anIntArrayArray30[arg0][arg1] == this.anIntArrayArray30[arg0][arg1 + 1]) {
				local644.aByte99 = (byte) (local644.aByte99 | 0x1);
			}
			if (local70 == -1 || (local644.aByte99 & 0x2) != 0 || this.aClass9_Sub1_6.anInterface2_11.method3585(local70).aBoolean656) {
				@Pc(845) short local845 = Static340.method5371(local64);
				local644.aShort112 = (short) Static499.method7465(local845, this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]);
				local644.aShort108 = (short) Static499.method7465(local845, this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]);
				local644.aShort109 = (short) Static499.method7465(local845, this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]);
				local644.aShort111 = (short) Static499.method7465(local845, this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]);
				local644.aShort110 = -1;
			} else {
				local644.aShort112 = (short) (this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]);
				local644.aShort108 = (short) (this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]);
				local644.aShort109 = (short) (this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]);
				local644.aShort111 = (short) (this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]);
				local644.aShort110 = (short) local70;
			}
			this.aClass279ArrayArray3[arg0][arg1] = local644;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method8205(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!w;IIIIZ)Z")
	@Override
	public final boolean method8207(@OriginalArg(0) Class6_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!jj", name = "aa", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public final void aa(@OriginalArg(0) Class6_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!jj", name = "sa", descriptor = "(II)I")
	@Override
	public final int sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> super.anInt9883;
		@Pc(9) int local9 = arg1 >> super.anInt9883;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt9881 - 1 || local9 > super.anInt9885 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & super.anInt9884 - 1;
		@Pc(41) int local41 = arg1 & super.anInt9884 - 1;
		@Pc(67) int local67 = this.anIntArrayArray30[local4][local9] * (super.anInt9884 - local34) + this.anIntArrayArray30[local4 + 1][local9] * local34 >> super.anInt9883;
		@Pc(97) int local97 = this.anIntArrayArray30[local4][local9 + 1] * (super.anInt9884 - local34) + this.anIntArrayArray30[local4 + 1][local9 + 1] * local34 >> super.anInt9883;
		return local67 * (super.anInt9884 - local41) + local97 * local41 >> super.anInt9883;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)Z")
	protected final boolean method3720(@OriginalArg(0) int arg0) {
		if ((this.anInt4259 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!jj", name = "EA", descriptor = "(III)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray16[arg0][arg1] < arg2) {
			this.aByteArrayArray16[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!jj", name = "ba", descriptor = "()V")
	@Override
	public final void ba() {
		this.aByteArrayArray17 = null;
		this.aByteArrayArray16 = null;
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(IILclient!w;)Lclient!w;")
	@Override
	public final Class6_Sub4_Sub2 c(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub4_Sub2 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!jj", name = "FA", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public final void FA(@OriginalArg(0) Class6_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)V")
	public abstract void method8204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method8208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class8_Sub1 local3 = this.aClass9_Sub1_6.aClass8_Sub1_3;
		this.anInt4255 = -1;
		this.anInt4250 = local3.anInt169;
		this.anInt4248 = local3.anInt163;
		this.anInt4252 = local3.anInt168;
		this.anInt4253 = local3.anInt161;
		this.anInt4247 = local3.anInt160;
		this.anInt4257 = local3.anInt164;
		this.anInt4249 = local3.anInt165;
		this.anInt4258 = local3.anInt170;
		this.anInt4254 = local3.anInt167;
		this.anInt4256 = local3.anInt171;
		this.anInt4251 = local3.anInt166;
		this.anInt4246 = local3.anInt162;
	}
}
