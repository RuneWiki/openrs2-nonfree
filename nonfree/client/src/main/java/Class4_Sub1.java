import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fea")
public abstract class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!fea", name = "h", descriptor = "[[Lclient!uo;")
	protected Class330[][] aClass330ArrayArray3;

	@OriginalMember(owner = "client!fea", name = "i", descriptor = "I")
	protected int anInt2332;

	@OriginalMember(owner = "client!fea", name = "j", descriptor = "I")
	protected int anInt2333;

	@OriginalMember(owner = "client!fea", name = "k", descriptor = "I")
	protected int anInt2334;

	@OriginalMember(owner = "client!fea", name = "l", descriptor = "I")
	protected int anInt2335;

	@OriginalMember(owner = "client!fea", name = "o", descriptor = "I")
	protected int anInt2337;

	@OriginalMember(owner = "client!fea", name = "p", descriptor = "I")
	protected int anInt2338;

	@OriginalMember(owner = "client!fea", name = "q", descriptor = "[[Lclient!sea;")
	protected Class295[][] aClass295ArrayArray3;

	@OriginalMember(owner = "client!fea", name = "s", descriptor = "I")
	protected int anInt2339;

	@OriginalMember(owner = "client!fea", name = "u", descriptor = "[[Lclient!fda;")
	protected Class97[][] aClass97ArrayArray3;

	@OriginalMember(owner = "client!fea", name = "w", descriptor = "I")
	protected int anInt2340;

	@OriginalMember(owner = "client!fea", name = "x", descriptor = "I")
	protected int anInt2341;

	@OriginalMember(owner = "client!fea", name = "y", descriptor = "I")
	protected int anInt2342;

	@OriginalMember(owner = "client!fea", name = "z", descriptor = "I")
	protected int anInt2343;

	@OriginalMember(owner = "client!fea", name = "A", descriptor = "[[Lclient!rga;")
	protected Class281[][] aClass281ArrayArray3;

	@OriginalMember(owner = "client!fea", name = "B", descriptor = "I")
	protected int anInt2344;

	@OriginalMember(owner = "client!fea", name = "m", descriptor = "I")
	protected int anInt2336 = -1;

	@OriginalMember(owner = "client!fea", name = "r", descriptor = "Lclient!ql;")
	protected final Class15_Sub1 aClass15_Sub1_4;

	@OriginalMember(owner = "client!fea", name = "C", descriptor = "I")
	private final int anInt2345;

	@OriginalMember(owner = "client!fea", name = "v", descriptor = "[[I")
	public final int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!fea", name = "t", descriptor = "[[B")
	private byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!fea", name = "n", descriptor = "[[B")
	private byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(Lclient!ql;IIII[[I[[II)V")
	public Class4_Sub1(@OriginalArg(0) Class15_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass15_Sub1_4 = arg0;
		this.anInt2345 = arg2;
		this.anIntArrayArray20 = arg5;
		this.aByteArrayArray10 = new byte[arg3 + 1][arg4 + 1];
		@Pc(31) int local31 = this.aClass15_Sub1_4.anInt5031 >> 9;
		for (@Pc(33) int local33 = 1; local33 < arg4; local33++) {
			for (@Pc(36) int local36 = 1; local36 < arg3; local36++) {
				@Pc(55) int local55 = arg6[local36 + 1][local33] - arg6[local36 - 1][local33];
				@Pc(71) int local71 = arg6[local36][local33 + 1] - arg6[local36][local33 - 1];
				@Pc(86) int local86 = (int) Math.sqrt((double) (local55 * local55 + arg7 * 512 + local71 * local71));
				@Pc(92) int local92 = (local55 << 8) / local86;
				@Pc(98) int local98 = arg7 * -512 / local86;
				@Pc(104) int local104 = (local71 << 8) / local86;
				@Pc(126) int local126 = local31 + (this.aClass15_Sub1_4.anInt5038 * local92 + this.aClass15_Sub1_4.anInt5045 * local98 + this.aClass15_Sub1_4.anInt5028 * local104 >> 17);
				local126 >>= 0x1;
				if (local126 < 2) {
					local126 = 2;
				} else if (local126 > 126) {
					local126 = 126;
				}
				this.aByteArrayArray10[local36][local33] = (byte) local126;
			}
		}
		this.aByteArrayArray9 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!fea", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public final void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass295ArrayArray3 == null) {
			this.aClass295ArrayArray3 = new Class295[super.anInt10461][super.anInt10459];
			this.aClass330ArrayArray3 = new Class330[super.anInt10461][super.anInt10459];
		} else if (this.aClass97ArrayArray3 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static373.anIntArray469[Static504.method7607(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static373.anIntArray469[Static504.method7607(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == super.anInt10458 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt10458 && arg4[local116] == super.anInt10458) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt10458) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt10458 && arg2[local244] != arg2[0] - super.anInt10458) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt10458 && arg4[local244] != arg4[0] - super.anInt10458) {
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
			@Pc(334) Class295 local334 = new Class295();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt8879 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte95 = (byte) (local334.aByte95 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray20[arg0][arg1] == this.anIntArrayArray20[arg0 + 1][arg1] && this.anIntArrayArray20[arg0][arg1] == this.anIntArrayArray20[arg0 + 1][arg1 + 1] && this.anIntArrayArray20[arg0][arg1] == this.anIntArrayArray20[arg0][arg1 + 1]) {
				local334.aByte95 = (byte) (local334.aByte95 | 0x1);
			}
			if (local342 == -1 || (local334.aByte95 & 0x2) != 0 || this.aClass15_Sub1_4.anInterface4_11.method3088(local342).aBoolean488) {
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
				local334.anInt8877 = Static98.method4085(arg10, local527, Static600.method2115(arg6[local104] >> 8, this.aByteArrayArray10[arg0][arg1] - this.aByteArrayArray9[arg0][arg1]));
				if (local334.anInt8879 != 0) {
					local334.anInt8877 |= this.aByteArrayArray9[arg0][arg1] + 255 - this.aByteArrayArray10[arg0][arg1] << 25;
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
				local334.anInt8876 = Static98.method4085(arg10, local527, Static600.method2115(arg6[local106] >> 8, this.aByteArrayArray10[arg0 + 1][arg1] - this.aByteArrayArray9[arg0 + 1][arg1]));
				if (local334.anInt8879 != 0) {
					local334.anInt8876 |= this.aByteArrayArray9[arg0 + 1][arg1] + 255 - this.aByteArrayArray10[arg0 + 1][arg1] << 25;
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
				local334.anInt8875 = Static98.method4085(arg10, local527, Static600.method2115(arg6[local108] >> 8, this.aByteArrayArray10[arg0 + 1][arg1 + 1] - this.aByteArrayArray9[arg0 + 1][arg1 + 1]));
				if (local334.anInt8879 != 0) {
					local334.anInt8875 |= this.aByteArrayArray9[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray10[arg0 + 1][arg1 + 1] << 25;
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
				local334.anInt8878 = Static98.method4085(arg10, local527, Static600.method2115(arg6[local110] >> 8, this.aByteArrayArray10[arg0][arg1 + 1] - this.aByteArrayArray9[arg0][arg1 + 1]));
				if (local334.anInt8879 != 0) {
					local334.anInt8878 |= this.aByteArrayArray9[arg0][arg1 + 1] + 255 - this.aByteArrayArray10[arg0][arg1 + 1] << 25;
				}
				local334.aShort115 = -1;
			} else {
				local334.anInt8877 = this.aByteArrayArray10[arg0][arg1] - this.aByteArrayArray9[arg0][arg1];
				local334.anInt8876 = this.aByteArrayArray10[arg0 + 1][arg1] - this.aByteArrayArray9[arg0 + 1][arg1];
				local334.anInt8875 = this.aByteArrayArray10[arg0 + 1][arg1 + 1] - this.aByteArrayArray9[arg0 + 1][arg1 + 1];
				local334.anInt8878 = this.aByteArrayArray10[arg0][arg1 + 1] - this.aByteArrayArray9[arg0][arg1 + 1];
				local334.aShort115 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort113 = (short) arg5[local108];
				local334.aShort116 = (short) arg5[local110];
				local334.aShort112 = (short) arg5[local106];
				local334.aShort114 = (short) arg5[local104];
			}
			this.aClass295ArrayArray3[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class330 local888 = new Class330();
		local888.aShort124 = (short) arg2.length;
		local888.aShort125 = (short) (arg2.length / 3);
		local888.aShortArray150 = new short[local888.aShort124];
		local888.aShortArray148 = new short[local888.aShort124];
		local888.aShortArray149 = new short[local888.aShort124];
		local888.anIntArray647 = new int[local888.aShort124];
		if (arg5 != null) {
			local888.aShortArray151 = new short[local888.aShort124];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort124; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray10[arg0][arg1] - this.aByteArrayArray9[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt10458) {
				local958 = this.aByteArrayArray10[arg0][arg1 + 1] - this.aByteArrayArray9[arg0][arg1 + 1];
			} else if (local342 == super.anInt10458 && local527 == super.anInt10458) {
				local958 = this.aByteArrayArray10[arg0 + 1][arg1 + 1] - this.aByteArrayArray9[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt10458 && local527 == 0) {
				local958 = this.aByteArrayArray10[arg0 + 1][arg1] - this.aByteArrayArray9[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray10[arg0][arg1] - this.aByteArrayArray9[arg0][arg1]) * (super.anInt10458 - local342) + (this.aByteArrayArray10[arg0 + 1][arg1] - this.aByteArrayArray9[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray10[arg0][arg1 + 1] - this.aByteArrayArray9[arg0][arg1 + 1]) * (super.anInt10458 - local342) + (this.aByteArrayArray10[arg0 + 1][arg1 + 1] - this.aByteArrayArray9[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt10458 - local527) + local1126 * local527 >> super.anInt10463 * 2;
			}
			local1079 = (arg0 << super.anInt10463) + local342;
			local1126 = (arg1 << super.anInt10463) + local527;
			local888.aShortArray150[local244] = (short) local342;
			local888.aShortArray149[local244] = (short) local527;
			local888.aShortArray148[local244] = (short) (this.sa(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass15_Sub1_4.anInterface4_11.method3088(arg8[local244]).aBoolean488) {
				local888.anIntArray647[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray151[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray647[local244] = Static98.method4085(arg10, local1226, Static600.method2115(arg6[local244] >> 8, local958));
				if (arg7 != null) {
					local888.anIntArray647[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray647[local244] = 0;
			} else {
				local888.anIntArray647[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort125; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass15_Sub1_4.anInterface4_11.method3088(arg8[local527 * 3]).aBoolean488) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray646 = new int[local888.aShort125];
		}
		if (local1296) {
			local888.aShortArray152 = new short[local888.aShort125];
			local888.aShortArray147 = new short[local888.aShort125];
		}
		for (local958 = 0; local958 < local888.aShort125; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray646[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass15_Sub1_4.anInterface4_11.method3088(local1384).aBoolean488) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass15_Sub1_4.anInterface4_11.method3088(local1384).aBoolean488) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass15_Sub1_4.anInterface4_11.method3088(local1384).aBoolean488) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray152[local958] = (short) local1384;
					local888.aShortArray147[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass15_Sub1_4.anInterface4_11.method3088(local1384).aBoolean488) {
							local888.anIntArray647[local1079] = Static373.anIntArray469[Static504.method7607(this.aClass15_Sub1_4.anInterface4_11.method3088(local1384).aShort56 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass15_Sub1_4.anInterface4_11.method3088(local1384).aBoolean488) {
							local888.anIntArray647[local1126] = Static373.anIntArray469[Static504.method7607(this.aClass15_Sub1_4.anInterface4_11.method3088(local1384).aShort56 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass15_Sub1_4.anInterface4_11.method3088(local1384).aBoolean488) {
							local888.anIntArray647[local1226] = Static373.anIntArray469[Static504.method7607(this.aClass15_Sub1_4.anInterface4_11.method3088(local1384).aShort56 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray152[local958] = -1;
				}
			}
		}
		this.aClass330ArrayArray3[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public final void method8444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass97ArrayArray3 == null) {
			this.aClass97ArrayArray3 = new Class97[super.anInt10461][super.anInt10459];
			this.aClass281ArrayArray3 = new Class281[super.anInt10461][super.anInt10459];
		} else if (this.aClass295ArrayArray3 != null) {
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
				if (local64 != 0 && local64 != super.anInt10458 || local70 != 0 && local70 != super.anInt10458) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class281 local95 = new Class281();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort103 = local99;
			local95.aShortArray128 = new short[local99];
			local95.aShortArray123 = new short[local99];
			local95.aShortArray129 = new short[local99];
			local95.aShortArray124 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray128[local124] = (short) (this.aByteArrayArray10[arg0][arg1] - this.aByteArrayArray9[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt10458) {
					local95.aShortArray128[local124] = (short) (this.aByteArrayArray10[arg0][arg1 + 1] - this.aByteArrayArray9[arg0][arg1 + 1]);
				} else if (local129 == super.anInt10458 && local133 == super.anInt10458) {
					local95.aShortArray128[local124] = (short) (this.aByteArrayArray10[arg0 + 1][arg1 + 1] - this.aByteArrayArray9[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt10458 && local133 == 0) {
					local95.aShortArray128[local124] = (short) (this.aByteArrayArray10[arg0 + 1][arg1] - this.aByteArrayArray9[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray10[arg0][arg1] - this.aByteArrayArray9[arg0][arg1]) * (super.anInt10458 - local129) + (this.aByteArrayArray10[arg0 + 1][arg1] - this.aByteArrayArray9[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray10[arg0][arg1 + 1] - this.aByteArrayArray9[arg0][arg1 + 1]) * (super.anInt10458 - local129) + (this.aByteArrayArray10[arg0 + 1][arg1 + 1] - this.aByteArrayArray9[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray128[local124] = (short) (local288 * (super.anInt10458 - local133) + local335 * local133 >> super.anInt10463 * 2);
				}
				local288 = (arg0 << super.anInt10463) + local129;
				local335 = (arg1 << super.anInt10463) + local133;
				local95.aShortArray123[local124] = (short) local129;
				local95.aShortArray124[local124] = (short) local133;
				local95.aShortArray129[local124] = (short) (this.sa(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray128[local124] < 2) {
					local95.aShortArray128[local124] = 2;
				}
			}
			@Pc(415) boolean local415 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass15_Sub1_4.anInterface4_11.method3088(arg11[local288]).aBoolean488) {
					local415 = true;
				}
			}
			local95.anIntArray523 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray524 = new int[local133];
			}
			local95.aShortArray125 = new short[local133];
			local95.aShortArray126 = new short[local133];
			local95.aShortArray122 = new short[local133];
			if (local415) {
				local95.aShortArray127 = new short[local133];
				local95.aShortArray130 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray523[local95.aShort102] = Static504.method7607(arg9[local335]);
					} else {
						local95.anIntArray523[local95.aShort102] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray524[local95.aShort102] = -1;
						} else {
							local95.anIntArray524[local95.aShort102] = Static504.method7607(arg10[local335]);
						}
					}
					local95.aShortArray125[local95.aShort102] = (short) arg6[local335];
					local95.aShortArray126[local95.aShort102] = (short) arg7[local335];
					local95.aShortArray122[local95.aShort102] = (short) arg8[local335];
					if (local415) {
						if (arg11[local335] == -1 || this.aClass15_Sub1_4.anInterface4_11.method3088(arg11[local335]).aBoolean488) {
							local95.aShortArray127[local95.aShort102] = -1;
						} else {
							local95.aShortArray127[local95.aShort102] = (short) arg11[local335];
							local95.aShortArray130[local95.aShort102] = (short) arg12[local335];
						}
					}
					local95.aShort102++;
				}
			}
			this.aClass281ArrayArray3[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(644) Class97 local644 = new Class97();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local644.anInt3194 = Static593.method8378(Static504.method7607(arg10[0]), this.aByteArrayArray10[arg0][arg1] - this.aByteArrayArray9[arg0][arg1]);
				if (local64 == -1) {
					local644.aByte29 = (byte) (local644.aByte29 | 0x2);
				}
			}
			if (this.anIntArrayArray20[arg0][arg1] == this.anIntArrayArray20[arg0 + 1][arg1] && this.anIntArrayArray20[arg0][arg1] == this.anIntArrayArray20[arg0 + 1][arg1 + 1] && this.anIntArrayArray20[arg0][arg1] == this.anIntArrayArray20[arg0][arg1 + 1]) {
				local644.aByte29 = (byte) (local644.aByte29 | 0x1);
			}
			if (local70 == -1 || (local644.aByte29 & 0x2) != 0 || this.aClass15_Sub1_4.anInterface4_11.method3088(local70).aBoolean488) {
				@Pc(845) short local845 = Static504.method7607(local64);
				local644.aShort42 = (short) Static593.method8378(local845, this.aByteArrayArray10[arg0][arg1] - this.aByteArrayArray9[arg0][arg1]);
				local644.aShort40 = (short) Static593.method8378(local845, this.aByteArrayArray10[arg0 + 1][arg1] - this.aByteArrayArray9[arg0 + 1][arg1]);
				local644.aShort38 = (short) Static593.method8378(local845, this.aByteArrayArray10[arg0 + 1][arg1 + 1] - this.aByteArrayArray9[arg0 + 1][arg1 + 1]);
				local644.aShort41 = (short) Static593.method8378(local845, this.aByteArrayArray10[arg0][arg1 + 1] - this.aByteArrayArray9[arg0][arg1 + 1]);
				local644.aShort39 = -1;
			} else {
				local644.aShort42 = (short) (this.aByteArrayArray10[arg0][arg1] - this.aByteArrayArray9[arg0][arg1]);
				local644.aShort40 = (short) (this.aByteArrayArray10[arg0 + 1][arg1] - this.aByteArrayArray9[arg0 + 1][arg1]);
				local644.aShort38 = (short) (this.aByteArrayArray10[arg0 + 1][arg1 + 1] - this.aByteArrayArray9[arg0 + 1][arg1 + 1]);
				local644.aShort41 = (short) (this.aByteArrayArray10[arg0][arg1 + 1] - this.aByteArrayArray9[arg0][arg1 + 1]);
				local644.aShort39 = (short) local70;
			}
			this.aClass97ArrayArray3[arg0][arg1] = local644;
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(II)V")
	public abstract void method8442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method8443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class255_Sub2 local3 = this.aClass15_Sub1_4.aClass255_Sub2_7;
		this.anInt2336 = -1;
		this.anInt2338 = local3.anInt9117;
		this.anInt2337 = local3.anInt9121;
		this.anInt2335 = local3.anInt9123;
		this.anInt2343 = local3.anInt9124;
		this.anInt2341 = local3.anInt9125;
		this.anInt2334 = local3.anInt9127;
		this.anInt2342 = local3.anInt9119;
		this.anInt2340 = local3.anInt9122;
		this.anInt2344 = local3.anInt9116;
		this.anInt2333 = local3.anInt9118;
		this.anInt2339 = local3.anInt9120;
		this.anInt2332 = local3.anInt9126;
	}

	@OriginalMember(owner = "client!fea", name = "EA", descriptor = "(III)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray9[arg0][arg1] < arg2) {
			this.aByteArrayArray9[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!w;IIIIZ)Z")
	@Override
	public final boolean method8445(@OriginalArg(0) Class3_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!fea", name = "JA", descriptor = "(II)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray20[arg0][arg1];
	}

	@OriginalMember(owner = "client!fea", name = "sa", descriptor = "(II)I")
	@Override
	public final int sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> super.anInt10463;
		@Pc(9) int local9 = arg1 >> super.anInt10463;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt10461 - 1 || local9 > super.anInt10459 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & super.anInt10458 - 1;
		@Pc(41) int local41 = arg1 & super.anInt10458 - 1;
		@Pc(67) int local67 = this.anIntArrayArray20[local4][local9] * (super.anInt10458 - local34) + this.anIntArrayArray20[local4 + 1][local9] * local34 >> super.anInt10463;
		@Pc(97) int local97 = this.anIntArrayArray20[local4][local9 + 1] * (super.anInt10458 - local34) + this.anIntArrayArray20[local4 + 1][local9 + 1] * local34 >> super.anInt10463;
		return local67 * (super.anInt10458 - local41) + local97 * local41 >> super.anInt10463;
	}

	@OriginalMember(owner = "client!fea", name = "ba", descriptor = "()V")
	@Override
	public final void ba() {
		this.aByteArrayArray10 = null;
		this.aByteArrayArray9 = null;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)Z")
	protected final boolean method2116(@OriginalArg(0) int arg0) {
		if ((this.anInt2345 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method8446(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!fea", name = "FA", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public final void FA(@OriginalArg(0) Class3_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!pn;[I)V")
	@Override
	public final void method8448(@OriginalArg(0) Class3_Sub28 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!fea", name = "c", descriptor = "(IILclient!w;)Lclient!w;")
	@Override
	public final Class3_Sub4_Sub2 c(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub4_Sub2 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!fea", name = "aa", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public final void aa(@OriginalArg(0) Class3_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}
}
