import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class114_Sub2 extends Class114 {

	@OriginalMember(owner = "client!m", name = "i", descriptor = "[[Lclient!ji;")
	private Class105[][] aClass105ArrayArray1;

	@OriginalMember(owner = "client!m", name = "j", descriptor = "I")
	private int anInt3877;

	@OriginalMember(owner = "client!m", name = "l", descriptor = "I")
	private int anInt3879;

	@OriginalMember(owner = "client!m", name = "m", descriptor = "[[Lclient!cs;")
	private Class36[][] aClass36ArrayArray1;

	@OriginalMember(owner = "client!m", name = "n", descriptor = "I")
	private int anInt3880;

	@OriginalMember(owner = "client!m", name = "o", descriptor = "I")
	private int anInt3881;

	@OriginalMember(owner = "client!m", name = "p", descriptor = "I")
	private int anInt3882;

	@OriginalMember(owner = "client!m", name = "r", descriptor = "[[Lclient!mk;")
	private Class140[][] aClass140ArrayArray1;

	@OriginalMember(owner = "client!m", name = "s", descriptor = "[[Lclient!hr;")
	private Class87[][] aClass87ArrayArray1;

	@OriginalMember(owner = "client!m", name = "t", descriptor = "I")
	private int anInt3883;

	@OriginalMember(owner = "client!m", name = "u", descriptor = "I")
	private int anInt3884;

	@OriginalMember(owner = "client!m", name = "v", descriptor = "I")
	private int anInt3885;

	@OriginalMember(owner = "client!m", name = "w", descriptor = "I")
	private int anInt3886;

	@OriginalMember(owner = "client!m", name = "A", descriptor = "I")
	private int anInt3888;

	@OriginalMember(owner = "client!m", name = "C", descriptor = "I")
	private int anInt3889;

	@OriginalMember(owner = "client!m", name = "D", descriptor = "I")
	private int anInt3890;

	@OriginalMember(owner = "client!m", name = "x", descriptor = "Lclient!kd;")
	private final Class46_Sub1 aClass46_Sub1_8;

	@OriginalMember(owner = "client!m", name = "y", descriptor = "I")
	private final int anInt3887;

	@OriginalMember(owner = "client!m", name = "B", descriptor = "[[I")
	public final int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!m", name = "E", descriptor = "[[I")
	private final int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!m", name = "F", descriptor = "I")
	private final int anInt3891;

	@OriginalMember(owner = "client!m", name = "k", descriptor = "I")
	private int anInt3878;

	@OriginalMember(owner = "client!m", name = "z", descriptor = "[[B")
	private byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!m", name = "q", descriptor = "[[B")
	private byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!kd;IIII[[I[[II)V")
	public Class114_Sub2(@OriginalArg(0) Class46_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4);
		this.aClass46_Sub1_8 = arg0;
		this.anInt3887 = arg2;
		this.anIntArrayArray59 = arg5;
		this.anIntArrayArray60 = arg6;
		this.anInt3891 = arg7;
		this.anInt3878 = 0;
		while (arg7 > 1) {
			this.anInt3878++;
			arg7 >>= 0x1;
		}
		this.aByteArrayArray11 = new byte[arg3 + 1][arg4 + 1];
		@Pc(50) int local50 = this.aClass46_Sub1_8.anInt3386 >> 9;
		for (@Pc(52) int local52 = 1; local52 < arg4; local52++) {
			for (@Pc(55) int local55 = 1; local55 < arg3; local55++) {
				@Pc(76) int local76 = this.anIntArrayArray59[local55 + 1][local52] - this.anIntArrayArray59[local55 - 1][local52];
				@Pc(94) int local94 = this.anIntArrayArray59[local55][local52 + 1] - this.anIntArrayArray59[local55][local52 - 1];
				@Pc(107) int local107 = (int) Math.sqrt((double) (local76 * local76 + local94 * local94 + 65536));
				@Pc(113) int local113 = (local76 << 8) / local107;
				@Pc(117) int local117 = -65536 / local107;
				@Pc(123) int local123 = (local94 << 8) / local107;
				@Pc(145) int local145 = local50 + (this.aClass46_Sub1_8.anInt3367 * local113 + this.aClass46_Sub1_8.anInt3379 * local117 + this.aClass46_Sub1_8.anInt3393 * local123 >> 17);
				local145 >>= 0x1;
				if (local145 < 2) {
					local145 = 2;
				} else if (local145 > 126) {
					local145 = 126;
				}
				this.aByteArrayArray11[local55][local52] = (byte) local145;
			}
		}
		this.aByteArrayArray10 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method3603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		if (this.aClass140ArrayArray1 == null) {
			this.aClass140ArrayArray1 = new Class140[super.anInt3871][super.anInt3873];
			this.aClass36ArrayArray1 = new Class36[super.anInt3871][super.anInt3873];
		} else if (this.aClass105ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg5.length; local32++) {
			if (arg5[local32] == -1) {
				arg5[local32] = 0;
			} else {
				arg5[local32] = Static71.anIntArray514[Static32.method786(arg5[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg6 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg6.length; local68++) {
				if (arg6[local68] == -1) {
					arg6[local68] = 0;
				} else {
					arg6[local68] = Static71.anIntArray514[Static32.method786(arg6[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == this.anInt3891 && arg4[local116] == 0) {
					if (local106 != -1 && arg5[local106] != arg5[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == this.anInt3891 && arg4[local116] == this.anInt3891) {
					if (local108 != -1 && arg5[local108] != arg5[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == this.anInt3891) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + this.anInt3891 && arg2[local244] != arg2[0] - this.anInt3891) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + this.anInt3891 && arg4[local244] != arg4[0] - this.anInt3891) {
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
			@Pc(334) Class140 local334 = new Class140();
			local244 = arg5[0];
			local342 = arg7[0];
			if (arg6 != null) {
				local334.anInt4014 = arg6[0] >> 8;
				if (local244 == 0) {
					local334.aByte37 = (byte) (local334.aByte37 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray59[arg0][arg1] == this.anIntArrayArray59[arg0 + 1][arg1] && this.anIntArrayArray59[arg0][arg1] == this.anIntArrayArray59[arg0 + 1][arg1 + 1] && this.anIntArrayArray59[arg0][arg1] == this.anIntArrayArray59[arg0][arg1 + 1]) {
				local334.aByte37 = (byte) (local334.aByte37 | 0x1);
			}
			if (local342 == -1 || (local334.aByte37 & 0x2) != 0 || this.aClass46_Sub1_8.anInterface2_2.method116(local342).aBoolean285) {
				if (this.anIntArrayArray60 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray60[arg0][arg1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt4017 = Static228.method4029(Static363.method3615(arg5[local104] >> 8, this.aByteArrayArray11[arg0][arg1] - this.aByteArrayArray10[arg0][arg1]), local531, arg9);
				if (local334.anInt4014 != 0) {
					local334.anInt4017 |= this.aByteArrayArray10[arg0][arg1] + 255 - this.aByteArrayArray11[arg0][arg1] << 25;
				}
				if (this.anIntArrayArray60 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray60[arg0 + 1][arg1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt4018 = Static228.method4029(Static363.method3615(arg5[local106] >> 8, this.aByteArrayArray11[arg0 + 1][arg1] - this.aByteArrayArray10[arg0 + 1][arg1]), local531, arg9);
				if (local334.anInt4014 != 0) {
					local334.anInt4018 |= this.aByteArrayArray10[arg0 + 1][arg1] + 255 - this.aByteArrayArray11[arg0 + 1][arg1] << 25;
				}
				if (this.anIntArrayArray60 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray60[arg0 + 1][arg1 + 1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt4016 = Static228.method4029(Static363.method3615(arg5[local108] >> 8, this.aByteArrayArray11[arg0 + 1][arg1 + 1] - this.aByteArrayArray10[arg0 + 1][arg1 + 1]), local531, arg9);
				if (local334.anInt4014 != 0) {
					local334.anInt4016 |= this.aByteArrayArray10[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray11[arg0 + 1][arg1 + 1] << 25;
				}
				if (this.anIntArrayArray60 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray60[arg0][arg1 + 1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt4015 = Static228.method4029(Static363.method3615(arg5[local110] >> 8, this.aByteArrayArray11[arg0][arg1 + 1] - this.aByteArrayArray10[arg0][arg1 + 1]), local531, arg9);
				if (local334.anInt4014 != 0) {
					local334.anInt4015 |= this.aByteArrayArray10[arg0][arg1 + 1] + 255 - this.aByteArrayArray11[arg0][arg1 + 1] << 25;
				}
				local334.aShort61 = -1;
			} else {
				local334.anInt4017 = this.aByteArrayArray11[arg0][arg1] - this.aByteArrayArray10[arg0][arg1];
				local334.anInt4018 = this.aByteArrayArray11[arg0 + 1][arg1] - this.aByteArrayArray10[arg0 + 1][arg1];
				local334.anInt4016 = this.aByteArrayArray11[arg0 + 1][arg1 + 1] - this.aByteArrayArray10[arg0 + 1][arg1 + 1];
				local334.anInt4015 = this.aByteArrayArray11[arg0][arg1 + 1] - this.aByteArrayArray10[arg0][arg1 + 1];
				local334.aShort61 = (short) local342;
			}
			this.aClass140ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(886) Class36 local886 = new Class36();
		local886.aShort11 = (short) arg2.length;
		local886.aShort12 = (short) (arg2.length / 3);
		local886.aShortArray7 = new short[local886.aShort11];
		local886.aShortArray10 = new short[local886.aShort11];
		local886.aShortArray11 = new short[local886.aShort11];
		local886.anIntArray73 = new int[local886.aShort11];
		if (this.anIntArrayArray60 != null) {
			local886.aShortArray6 = new short[local886.aShort11];
		}
		@Pc(957) int local957;
		@Pc(1078) int local1078;
		@Pc(1125) int local1125;
		@Pc(1225) int local1225;
		@Pc(1344) int local1344;
		for (local244 = 0; local244 < local886.aShort11; local244++) {
			local342 = arg2[local244];
			local531 = arg4[local244];
			if (local342 == 0 && local531 == 0) {
				local957 = this.aByteArrayArray11[arg0][arg1] - this.aByteArrayArray10[arg0][arg1];
			} else if (local342 == 0 && local531 == this.anInt3891) {
				local957 = this.aByteArrayArray11[arg0][arg1 + 1] - this.aByteArrayArray10[arg0][arg1 + 1];
			} else if (local342 == this.anInt3891 && local531 == this.anInt3891) {
				local957 = this.aByteArrayArray11[arg0 + 1][arg1 + 1] - this.aByteArrayArray10[arg0 + 1][arg1 + 1];
			} else if (local342 == this.anInt3891 && local531 == 0) {
				local957 = this.aByteArrayArray11[arg0 + 1][arg1] - this.aByteArrayArray10[arg0 + 1][arg1];
			} else {
				local1078 = (this.aByteArrayArray11[arg0][arg1] - this.aByteArrayArray10[arg0][arg1]) * (this.anInt3891 - local342) + (this.aByteArrayArray11[arg0 + 1][arg1] - this.aByteArrayArray10[arg0 + 1][arg1]) * local342;
				local1125 = (this.aByteArrayArray11[arg0][arg1 + 1] - this.aByteArrayArray10[arg0][arg1 + 1]) * (this.anInt3891 - local342) + (this.aByteArrayArray11[arg0 + 1][arg1 + 1] - this.aByteArrayArray10[arg0 + 1][arg1 + 1]) * local342;
				local957 = local1078 * (this.anInt3891 - local531) + local1125 * local531 >> this.anInt3878 * 2;
			}
			@Pc(1149) short local1149 = (short) ((arg0 << this.anInt3878) + local342);
			@Pc(1157) short local1157 = (short) ((arg1 << this.anInt3878) + local531);
			local886.aShortArray7[local244] = local1149;
			local886.aShortArray11[local244] = local1157;
			local886.aShortArray10[local244] = (short) (this.method3607(local1149, local1157) + (arg3 == null ? 0 : arg3[local244]));
			if (local957 < 0) {
				local957 = 0;
			}
			if (arg7[local244] != -1 && !this.aClass46_Sub1_8.anInterface2_2.method116(arg7[local244]).aBoolean285) {
				local886.anIntArray73[local244] = local957;
			} else if (arg5[local244] != 0) {
				local1225 = 0;
				if (this.anIntArrayArray60 != null) {
					@Pc(1241) int local1241;
					if (local342 == 0 && local531 == 0) {
						local1241 = this.anIntArrayArray60[arg0][arg1];
					} else if (local342 == 0 && local531 == this.anInt3891) {
						local1241 = this.anIntArrayArray60[arg0][arg1 + 1];
					} else if (local342 == this.anInt3891 && local531 == this.anInt3891) {
						local1241 = this.anIntArrayArray60[arg0 + 1][arg1 + 1];
					} else if (local342 == this.anInt3891 && local531 == 0) {
						local1241 = this.anIntArrayArray60[arg0 + 1][arg1];
					} else {
						@Pc(1317) int local1317 = this.anIntArrayArray60[arg0][arg1] * (this.anInt3891 - local342) + this.anIntArrayArray60[arg0 + 1][arg1] * local342;
						local1344 = this.anIntArrayArray60[arg0][arg1 + 1] * (this.anInt3891 - local342) + this.anIntArrayArray60[arg0 + 1][arg1 + 1] * local342;
						local1241 = local1317 * (this.anInt3891 - local531) + local1344 * local531 >> this.anInt3878 * 2;
					}
					local886.aShortArray6[local244] = (short) local1241;
					if (arg10 != 0) {
						local1225 = local1241 * 255 / arg10;
						if (local1225 < 0) {
							local1225 = 0;
						} else if (local1225 > 255) {
							local1225 = 255;
						}
					}
				}
				local886.anIntArray73[local244] = Static228.method4029(Static363.method3615(arg5[local244] >> 8, local957), local1225, arg9);
				if (arg6 != null) {
					local886.anIntArray73[local244] |= local957 << 25;
				}
			} else if (arg6 == null) {
				local886.anIntArray73[local244] = 0;
			} else {
				local886.anIntArray73[local244] = local957 << 25;
			}
		}
		@Pc(1424) boolean local1424 = false;
		for (local531 = 0; local531 < local886.aShort12; local531++) {
			if (arg7[local531 * 3] != -1 && !this.aClass46_Sub1_8.anInterface2_2.method116(arg7[local531 * 3]).aBoolean285) {
				local1424 = true;
			}
		}
		if (arg6 != null) {
			local886.anIntArray72 = new int[local886.aShort12];
		}
		if (local1424) {
			local886.aShortArray9 = new short[local886.aShort12];
			local886.aShortArray8 = new short[local886.aShort12];
		}
		for (local957 = 0; local957 < local886.aShort12; local957++) {
			local1078 = local957 * 3;
			if (arg6 != null && arg6[local1078] != 0) {
				local886.anIntArray72[local957] = arg6[local1078] >> 8;
			}
			if (local1424) {
				local1125 = local1078 + 1;
				local1225 = local1125 + 1;
				@Pc(1506) boolean local1506 = false;
				@Pc(1508) boolean local1508 = true;
				local1344 = arg7[local1078];
				if (local1344 == -1 || this.aClass46_Sub1_8.anInterface2_2.method116(local1344).aBoolean285) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				local1344 = arg7[local1125];
				if (local1344 == -1 || this.aClass46_Sub1_8.anInterface2_2.method116(local1344).aBoolean285) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				local1344 = arg7[local1225];
				if (local1344 == -1 || this.aClass46_Sub1_8.anInterface2_2.method116(local1344).aBoolean285) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				if (local1508) {
					local886.aShortArray9[local957] = (short) local1344;
					local886.aShortArray8[local957] = (short) arg8[local1078];
				} else {
					if (local1506) {
						local1344 = arg7[local1078];
						if (local1344 != -1 && !this.aClass46_Sub1_8.anInterface2_2.method116(local1344).aBoolean285) {
							local886.anIntArray73[local1078] = Static71.anIntArray514[Static32.method786(this.aClass46_Sub1_8.anInterface2_2.method116(local1344).aShort64 & 0xFFFF) & 0xFFFF];
						}
						local1344 = arg7[local1125];
						if (local1344 != -1 && !this.aClass46_Sub1_8.anInterface2_2.method116(local1344).aBoolean285) {
							local886.anIntArray73[local1125] = Static71.anIntArray514[Static32.method786(this.aClass46_Sub1_8.anInterface2_2.method116(local1344).aShort64 & 0xFFFF) & 0xFFFF];
						}
						local1344 = arg7[local1225];
						if (local1344 != -1 && !this.aClass46_Sub1_8.anInterface2_2.method116(local1344).aBoolean285) {
							local886.anIntArray73[local1225] = Static71.anIntArray514[Static32.method786(this.aClass46_Sub1_8.anInterface2_2.method116(local1344).aShort64 & 0xFFFF) & 0xFFFF];
						}
					}
					local886.aShortArray9[local957] = -1;
				}
			}
		}
		this.aClass36ArrayArray1[arg0][arg1] = local886;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method3597(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class201 local4 = this.aClass46_Sub1_8.method3216(Thread.currentThread());
		@Pc(7) Class19 local7 = local4.aClass19_2;
		local7.anInt403 = 0;
		local7.aBoolean19 = false;
		if (this.aClass140ArrayArray1 != null) {
			this.method3617(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray584, local4.anIntArray594);
		} else if (this.aClass105ArrayArray1 != null) {
			this.method3618(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray584, local4.anIntArray594);
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
	@Override
	public void method3606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class201 local4 = this.aClass46_Sub1_8.method3216(Thread.currentThread());
		local4.aClass19_2.anInt403 = 0;
		if (this.aClass140ArrayArray1 != null) {
			this.method3619(arg0, arg1, this.aClass46_Sub1_8.aBoolean222, local4.aClass19_2, local4.anIntArray584, local4.anIntArray594, local4.anIntArray583);
		} else if (this.aClass105ArrayArray1 != null) {
			this.method3614(arg0, arg1, local4.aClass19_2, local4.anIntArray584, local4.anIntArray594, local4.anIntArray583);
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(II)I")
	@Override
	public int method3607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> this.anInt3878;
		@Pc(9) int local9 = arg1 >> this.anInt3878;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt3871 - 1 || local9 > super.anInt3873 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & this.anInt3891 - 1;
		@Pc(41) int local41 = arg1 & this.anInt3891 - 1;
		@Pc(67) int local67 = this.anIntArrayArray59[local4][local9] * (this.anInt3891 - local34) + this.anIntArrayArray59[local4 + 1][local9] * local34 >> this.anInt3878;
		@Pc(97) int local97 = this.anIntArrayArray59[local4][local9 + 1] * (this.anInt3891 - local34) + this.anIntArrayArray59[local4 + 1][local9 + 1] * local34 >> this.anInt3878;
		return local67 * (this.anInt3891 - local41) + local97 * local41 >> this.anInt3878;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!ej;[I)V")
	@Override
	public void method3604(@OriginalArg(0) Class14_Sub13 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IILclient!be;[I[I[I)V")
	private void method3614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class105 local6 = this.aClass105ArrayArray1[arg0][arg1];
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
			@Pc(996) Class87 local996 = this.aClass87ArrayArray1[arg0][arg1];
			if (local996 != null) {
				for (local349 = 0; local349 < local996.aShort33; local349++) {
					local24 = local996.anIntArray241[local349];
					local29 = local996.anIntArray243[local349];
					local34 = local996.anIntArray244[local349];
					local293 = this.anInt3881 + (this.anInt3888 * local24 + this.anInt3886 * local29 + this.anInt3877 * local34 >> 15);
					if (local293 <= this.aClass46_Sub1_8.anInt3397) {
						return;
					}
					local181 = this.anInt3884 + (this.anInt3890 * local24 + this.anInt3879 * local29 + this.anInt3885 * local34 >> 15);
					local237 = this.anInt3889 + (this.anInt3883 * local24 + this.anInt3880 * local29 + this.anInt3882 * local34 >> 15);
					arg3[local349] = arg2.anInt406 + local181 * this.aClass46_Sub1_8.anInt3391 / local293;
					arg4[local349] = arg2.anInt404 + local237 * this.aClass46_Sub1_8.anInt3387 / local293;
				}
				if (local996.aShortArray74 != null) {
					local209 = this.anIntArrayArray59[arg0][arg1];
					local265 = this.anIntArrayArray59[arg0 + 1][arg1];
					local321 = this.anIntArrayArray59[arg0][arg1 + 1];
					local377 = arg0 * this.anInt3891;
					local170 = local377 + this.anInt3891;
					local226 = arg1 * this.anInt3891;
					local282 = local226 + this.anInt3891;
					local338 = this.anInt3884 + (this.anInt3890 * local377 + this.anInt3879 * local209 + this.anInt3885 * local226 >> 15);
					local198 = this.anInt3889 + (this.anInt3883 * local377 + this.anInt3880 * local209 + this.anInt3882 * local226 >> 15);
					local254 = this.anInt3881 + (this.anInt3888 * local377 + this.anInt3886 * local209 + this.anInt3877 * local226 >> 15);
					local310 = this.anInt3884 + (this.anInt3890 * local170 + this.anInt3879 * local265 + this.anInt3885 * local226 >> 15);
					local366 = this.anInt3889 + (this.anInt3883 * local170 + this.anInt3880 * local265 + this.anInt3882 * local226 >> 15);
					local68 = this.anInt3881 + (this.anInt3888 * local170 + this.anInt3886 * local265 + this.anInt3877 * local226 >> 15);
					local91 = this.anInt3884 + (this.anInt3890 * local377 + this.anInt3879 * local321 + this.anInt3885 * local282 >> 15);
					local114 = this.anInt3889 + (this.anInt3883 * local377 + this.anInt3880 * local321 + this.anInt3882 * local282 >> 15);
					local137 = this.anInt3881 + (this.anInt3888 * local377 + this.anInt3886 * local321 + this.anInt3877 * local282 >> 15);
					for (local46 = 0; local46 < local996.aShort32; local46++) {
						@Pc(1349) short local1349 = local996.aShortArray79[local46];
						@Pc(1354) short local1354 = local996.aShortArray77[local46];
						@Pc(1359) short local1359 = local996.aShortArray78[local46];
						@Pc(1363) int local1363 = arg3[local1349];
						@Pc(1367) int local1367 = arg3[local1354];
						@Pc(1371) int local1371 = arg3[local1359];
						@Pc(1375) int local1375 = arg4[local1349];
						@Pc(1379) int local1379 = arg4[local1354];
						@Pc(1383) int local1383 = arg4[local1359];
						if ((local1363 - local1367) * (local1383 - local1379) - (local1375 - local1379) * (local1371 - local1367) > 0) {
							arg2.aBoolean19 = local1363 < 0 || local1367 < 0 || local1371 < 0 || local1363 > arg2.anInt402 || local1367 > arg2.anInt402 || local1371 > arg2.anInt402;
							@Pc(1427) short local1427 = local996.aShortArray74[local46];
							if (local1427 == -1) {
								@Pc(1482) int local1482 = local996.anIntArray245[local46];
								if (local1482 != -1) {
									arg2.method466(local1375, local1379, local1383, local1363, local1367, local1371, Static135.method2733(local996.aShortArray76[local1349], local1482), Static135.method2733(local996.aShortArray76[local1354], local1482), Static135.method2733(local996.aShortArray76[local1359], local1482));
								}
							} else {
								if (this.method3616(this.aClass46_Sub1_8.anInterface2_2.method116(local1427).aByte48)) {
									arg2.anInt403 = 100;
								}
								arg2.method467(local1375, local1379, local1383, local1363, local1367, local1371, local996.aShortArray76[local1349], local996.aShortArray76[local1354], local996.aShortArray76[local1359], local338, local310, local91, local198, local366, local114, local254, local68, local137, local1427);
								arg2.anInt403 = 0;
							}
						}
					}
					return;
				}
				for (local209 = 0; local209 < local996.aShort32; local209++) {
					@Pc(1528) short local1528 = local996.aShortArray79[local209];
					@Pc(1533) short local1533 = local996.aShortArray77[local209];
					@Pc(1538) short local1538 = local996.aShortArray78[local209];
					local170 = arg3[local1528];
					local226 = arg3[local1533];
					local282 = arg3[local1538];
					local338 = arg4[local1528];
					local198 = arg4[local1533];
					local254 = arg4[local1538];
					if ((local170 - local226) * (local254 - local198) - (local338 - local198) * (local282 - local226) > 0) {
						local310 = local996.anIntArray245[local209];
						if (local310 != -1) {
							arg2.aBoolean19 = local170 < 0 || local226 < 0 || local282 < 0 || local170 > arg2.anInt402 || local226 > arg2.anInt402 || local282 > arg2.anInt402;
							arg2.method466(local338, local198, local254, local170, local226, local282, Static135.method2733(local996.aShortArray76[local1528], local310), Static135.method2733(local996.aShortArray76[local1533], local310), Static135.method2733(local996.aShortArray76[local1538], local310));
						}
					}
				}
			}
		} else if ((local6.aByte27 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt3891;
			local24 = local19 + this.anInt3891;
			local29 = arg1 * this.anInt3891;
			local34 = local29 + this.anInt3891;
			@Pc(51) int local51;
			@Pc(148) int local148;
			@Pc(153) int local153;
			if ((local6.aByte27 & 0x1) == 0) {
				local46 = this.anIntArrayArray59[arg0][arg1];
				local51 = this.anIntArrayArray59[arg0 + 1][arg1];
				local148 = this.anIntArrayArray59[arg0 + 1][arg1 + 1];
				local153 = this.anIntArrayArray59[arg0][arg1 + 1];
				local68 = this.anInt3881 + (this.anInt3888 * local19 + this.anInt3886 * local46 + this.anInt3877 * local29 >> 15);
				if (local68 <= this.aClass46_Sub1_8.anInt3397) {
					return;
				}
				local91 = this.anInt3881 + (this.anInt3888 * local24 + this.anInt3886 * local51 + this.anInt3877 * local29 >> 15);
				if (local91 <= this.aClass46_Sub1_8.anInt3397) {
					return;
				}
				local114 = this.anInt3881 + (this.anInt3888 * local24 + this.anInt3886 * local148 + this.anInt3877 * local34 >> 15);
				if (local114 <= this.aClass46_Sub1_8.anInt3397) {
					return;
				}
				local137 = this.anInt3881 + (this.anInt3888 * local19 + this.anInt3886 * local153 + this.anInt3877 * local34 >> 15);
				if (local137 <= this.aClass46_Sub1_8.anInt3397) {
					return;
				}
				local170 = this.anInt3884 + (this.anInt3890 * local19 + this.anInt3879 * local46 + this.anInt3885 * local29 >> 15);
				local181 = arg2.anInt406 + local170 * this.aClass46_Sub1_8.anInt3391 / local68;
				local198 = this.anInt3889 + (this.anInt3883 * local19 + this.anInt3880 * local46 + this.anInt3882 * local29 >> 15);
				local209 = arg2.anInt404 + local198 * this.aClass46_Sub1_8.anInt3387 / local68;
				local226 = this.anInt3884 + (this.anInt3890 * local24 + this.anInt3879 * local51 + this.anInt3885 * local29 >> 15);
				local237 = arg2.anInt406 + local226 * this.aClass46_Sub1_8.anInt3391 / local91;
				local254 = this.anInt3889 + (this.anInt3883 * local24 + this.anInt3880 * local51 + this.anInt3882 * local29 >> 15);
				local265 = arg2.anInt404 + local254 * this.aClass46_Sub1_8.anInt3387 / local91;
				local282 = this.anInt3884 + (this.anInt3890 * local24 + this.anInt3879 * local148 + this.anInt3885 * local34 >> 15);
				local293 = arg2.anInt406 + local282 * this.aClass46_Sub1_8.anInt3391 / local114;
				local310 = this.anInt3889 + (this.anInt3883 * local24 + this.anInt3880 * local148 + this.anInt3882 * local34 >> 15);
				local321 = arg2.anInt404 + local310 * this.aClass46_Sub1_8.anInt3387 / local114;
				local338 = this.anInt3884 + (this.anInt3890 * local19 + this.anInt3879 * local153 + this.anInt3885 * local34 >> 15);
				local349 = arg2.anInt406 + local338 * this.aClass46_Sub1_8.anInt3391 / local137;
				local366 = this.anInt3889 + (this.anInt3883 * local19 + this.anInt3880 * local153 + this.anInt3882 * local34 >> 15);
				local377 = arg2.anInt404 + local366 * this.aClass46_Sub1_8.anInt3387 / local137;
			} else {
				local46 = this.anIntArrayArray59[arg0][arg1];
				local51 = this.anInt3886 * local46;
				local68 = this.anInt3881 + (this.anInt3888 * local19 + local51 + this.anInt3877 * local29 >> 15);
				if (local68 <= this.aClass46_Sub1_8.anInt3397) {
					return;
				}
				local91 = this.anInt3881 + (this.anInt3888 * local24 + local51 + this.anInt3877 * local29 >> 15);
				if (local91 <= this.aClass46_Sub1_8.anInt3397) {
					return;
				}
				local114 = this.anInt3881 + (this.anInt3888 * local24 + local51 + this.anInt3877 * local34 >> 15);
				if (local114 <= this.aClass46_Sub1_8.anInt3397) {
					return;
				}
				local137 = this.anInt3881 + (this.anInt3888 * local19 + local51 + this.anInt3877 * local34 >> 15);
				if (local137 <= this.aClass46_Sub1_8.anInt3397) {
					return;
				}
				local148 = this.anInt3879 * local46;
				local153 = this.anInt3880 * local46;
				local170 = this.anInt3884 + (this.anInt3890 * local19 + local148 + this.anInt3885 * local29 >> 15);
				local181 = arg2.anInt406 + local170 * this.aClass46_Sub1_8.anInt3391 / local68;
				local198 = this.anInt3889 + (this.anInt3883 * local19 + local153 + this.anInt3882 * local29 >> 15);
				local209 = arg2.anInt404 + local198 * this.aClass46_Sub1_8.anInt3387 / local68;
				local226 = this.anInt3884 + (this.anInt3890 * local24 + local148 + this.anInt3885 * local29 >> 15);
				local237 = arg2.anInt406 + local226 * this.aClass46_Sub1_8.anInt3391 / local91;
				local254 = this.anInt3889 + (this.anInt3883 * local24 + local153 + this.anInt3882 * local29 >> 15);
				local265 = arg2.anInt404 + local254 * this.aClass46_Sub1_8.anInt3387 / local91;
				local282 = this.anInt3884 + (this.anInt3890 * local24 + local148 + this.anInt3885 * local34 >> 15);
				local293 = arg2.anInt406 + local282 * this.aClass46_Sub1_8.anInt3391 / local114;
				local310 = this.anInt3889 + (this.anInt3883 * local24 + local153 + this.anInt3882 * local34 >> 15);
				local321 = arg2.anInt404 + local310 * this.aClass46_Sub1_8.anInt3387 / local114;
				local338 = this.anInt3884 + (this.anInt3890 * local19 + local148 + this.anInt3885 * local34 >> 15);
				local349 = arg2.anInt406 + local338 * this.aClass46_Sub1_8.anInt3391 / local137;
				local366 = this.anInt3889 + (this.anInt3883 * local19 + local153 + this.anInt3882 * local34 >> 15);
				local377 = arg2.anInt404 + local366 * this.aClass46_Sub1_8.anInt3387 / local137;
			}
			if ((local293 - local349) * (local265 - local377) - (local321 - local377) * (local237 - local349) > 0) {
				arg2.aBoolean19 = local293 < 0 || local349 < 0 || local237 < 0 || local293 > arg2.anInt402 || local349 > arg2.anInt402 || local237 > arg2.anInt402;
				if (local6.aShort43 >= 0) {
					if (this.method3616(this.aClass46_Sub1_8.anInterface2_2.method116(local6.aShort43).aByte48)) {
						arg2.anInt403 = 100;
					}
					arg2.method467(local321, local377, local265, local293, local349, local237, local6.aShort45 & 0xFFFF, local6.aShort46 & 0xFFFF, local6.aShort42 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort43);
					arg2.anInt403 = 0;
				} else {
					arg2.method466(local321, local377, local265, local293, local349, local237, local6.aShort45 & 0xFFFF, local6.aShort46 & 0xFFFF, local6.aShort42 & 0xFFFF);
				}
			}
			if ((local181 - local237) * (local377 - local265) - (local209 - local265) * (local349 - local237) > 0) {
				arg2.aBoolean19 = local181 < 0 || local237 < 0 || local349 < 0 || local181 > arg2.anInt402 || local237 > arg2.anInt402 || local349 > arg2.anInt402;
				if (local6.aShort43 >= 0) {
					if (this.method3616(this.aClass46_Sub1_8.anInterface2_2.method116(local6.aShort43).aByte48)) {
						arg2.anInt403 = 100;
					}
					arg2.method467(local209, local265, local377, local181, local237, local349, local6.aShort44 & 0xFFFF, local6.aShort42 & 0xFFFF, local6.aShort46 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort43);
					arg2.anInt403 = 0;
					return;
				}
				arg2.method466(local209, local265, local377, local181, local237, local349, local6.aShort44 & 0xFFFF, local6.aShort42 & 0xFFFF, local6.aShort46 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)Z")
	private boolean method3616(@OriginalArg(0) int arg0) {
		if ((this.anInt3887 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else {
			return arg0 == 8;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method3612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		if (this.aClass105ArrayArray1 == null) {
			this.aClass105ArrayArray1 = new Class105[super.anInt3871][super.anInt3873];
			this.aClass87ArrayArray1 = new Class87[super.anInt3871][super.anInt3873];
		} else if (this.aClass140ArrayArray1 != null) {
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
				if (local64 != 0 && local64 != this.anInt3891 || local70 != 0 && local70 != this.anInt3891) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class87 local95 = new Class87();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg8.length;
			local95.aShort33 = local99;
			local95.aShortArray76 = new short[local99];
			local95.anIntArray241 = new int[local99];
			local95.anIntArray243 = new int[local99];
			local95.anIntArray244 = new int[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray76[local124] = (short) (this.aByteArrayArray11[arg0][arg1] - this.aByteArrayArray10[arg0][arg1]);
				} else if (local129 == 0 && local133 == this.anInt3891) {
					local95.aShortArray76[local124] = (short) (this.aByteArrayArray11[arg0][arg1 + 1] - this.aByteArrayArray10[arg0][arg1 + 1]);
				} else if (local129 == this.anInt3891 && local133 == this.anInt3891) {
					local95.aShortArray76[local124] = (short) (this.aByteArrayArray11[arg0 + 1][arg1 + 1] - this.aByteArrayArray10[arg0 + 1][arg1 + 1]);
				} else if (local129 == this.anInt3891 && local133 == 0) {
					local95.aShortArray76[local124] = (short) (this.aByteArrayArray11[arg0 + 1][arg1] - this.aByteArrayArray10[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray11[arg0][arg1] - this.aByteArrayArray10[arg0][arg1]) * (this.anInt3891 - local129) + (this.aByteArrayArray11[arg0 + 1][arg1] - this.aByteArrayArray10[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray11[arg0][arg1 + 1] - this.aByteArrayArray10[arg0][arg1 + 1]) * (this.anInt3891 - local129) + (this.aByteArrayArray11[arg0 + 1][arg1 + 1] - this.aByteArrayArray10[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray76[local124] = (short) (local288 * (this.anInt3891 - local133) + local335 * local133 >> this.anInt3878 * 2);
				}
				local288 = (arg0 << this.anInt3878) + local129;
				local335 = (arg1 << this.anInt3878) + local133;
				local95.anIntArray241[local124] = local288;
				local95.anIntArray244[local124] = local335;
				local95.anIntArray243[local124] = this.method3607(local288, local335) + (arg3 == null ? 0 : arg3[local124]);
				if (local95.aShortArray76[local124] < 2) {
					local95.aShortArray76[local124] = 2;
				}
			}
			@Pc(412) boolean local412 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg8[local288] >= 0 || arg9 != null && arg9[local288] >= 0) {
					local133++;
				}
				if (arg10[local288] != -1 && !this.aClass46_Sub1_8.anInterface2_2.method116(arg10[local288]).aBoolean285) {
					local412 = true;
				}
			}
			local95.anIntArray245 = new int[local133];
			if (arg9 != null) {
				local95.anIntArray242 = new int[local133];
			}
			local95.aShortArray79 = new short[local133];
			local95.aShortArray77 = new short[local133];
			local95.aShortArray78 = new short[local133];
			if (local412) {
				local95.aShortArray74 = new short[local133];
				local95.aShortArray75 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg8[local335] >= 0 || arg9 != null && arg9[local335] >= 0) {
					if (arg8[local335] >= 0) {
						local95.anIntArray245[local95.aShort32] = Static32.method786(arg8[local335]);
					} else {
						local95.anIntArray245[local95.aShort32] = -1;
					}
					if (arg9 != null) {
						if (arg9[local335] == -1) {
							local95.anIntArray242[local95.aShort32] = -1;
						} else {
							local95.anIntArray242[local95.aShort32] = Static32.method786(arg9[local335]);
						}
					}
					local95.aShortArray79[local95.aShort32] = (short) arg5[local335];
					local95.aShortArray77[local95.aShort32] = (short) arg6[local335];
					local95.aShortArray78[local95.aShort32] = (short) arg7[local335];
					if (local412) {
						if (arg10[local335] == -1 || this.aClass46_Sub1_8.anInterface2_2.method116(arg10[local335]).aBoolean285) {
							local95.aShortArray74[local95.aShort32] = -1;
						} else {
							local95.aShortArray74[local95.aShort32] = (short) arg10[local335];
							local95.aShortArray75[local95.aShort32] = (short) arg11[local335];
						}
					}
					local95.aShort32++;
				}
			}
			this.aClass87ArrayArray1[arg0][arg1] = local95;
		} else if (arg8[0] >= 0 || arg9 != null && arg9[0] >= 0) {
			@Pc(641) Class105 local641 = new Class105();
			local64 = arg8[0];
			local70 = arg10[0];
			if (arg9 != null) {
				local641.anInt3174 = Static135.method2733(this.aByteArrayArray11[arg0][arg1] - this.aByteArrayArray10[arg0][arg1], Static32.method786(arg9[0]));
				if (local64 == -1) {
					local641.aByte27 = (byte) (local641.aByte27 | 0x2);
				}
			}
			if (this.anIntArrayArray59[arg0][arg1] == this.anIntArrayArray59[arg0 + 1][arg1] && this.anIntArrayArray59[arg0][arg1] == this.anIntArrayArray59[arg0 + 1][arg1 + 1] && this.anIntArrayArray59[arg0][arg1] == this.anIntArrayArray59[arg0][arg1 + 1]) {
				local641.aByte27 = (byte) (local641.aByte27 | 0x1);
			}
			if (local70 == -1 || (local641.aByte27 & 0x2) != 0 || this.aClass46_Sub1_8.anInterface2_2.method116(local70).aBoolean285) {
				@Pc(842) short local842 = Static32.method786(local64);
				local641.aShort44 = (short) Static135.method2733(this.aByteArrayArray11[arg0][arg1] - this.aByteArrayArray10[arg0][arg1], local842);
				local641.aShort42 = (short) Static135.method2733(this.aByteArrayArray11[arg0 + 1][arg1] - this.aByteArrayArray10[arg0 + 1][arg1], local842);
				local641.aShort45 = (short) Static135.method2733(this.aByteArrayArray11[arg0 + 1][arg1 + 1] - this.aByteArrayArray10[arg0 + 1][arg1 + 1], local842);
				local641.aShort46 = (short) Static135.method2733(this.aByteArrayArray11[arg0][arg1 + 1] - this.aByteArrayArray10[arg0][arg1 + 1], local842);
				local641.aShort43 = -1;
			} else {
				local641.aShort44 = (short) (this.aByteArrayArray11[arg0][arg1] - this.aByteArrayArray10[arg0][arg1]);
				local641.aShort42 = (short) (this.aByteArrayArray11[arg0 + 1][arg1] - this.aByteArrayArray10[arg0 + 1][arg1]);
				local641.aShort45 = (short) (this.aByteArrayArray11[arg0 + 1][arg1 + 1] - this.aByteArrayArray10[arg0 + 1][arg1 + 1]);
				local641.aShort46 = (short) (this.aByteArrayArray11[arg0][arg1 + 1] - this.aByteArrayArray10[arg0][arg1 + 1]);
				local641.aShort43 = (short) local70;
			}
			this.aClass105ArrayArray1[arg0][arg1] = local641;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IILclient!as;)Lclient!as;")
	@Override
	public Class14_Sub2_Sub2 method3613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14_Sub2_Sub2 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(Lclient!as;IIIIZ)V")
	@Override
	public void method3602(@OriginalArg(0) Class14_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(II)I")
	@Override
	public int method3610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray59[arg0][arg1];
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "()V")
	@Override
	public void method3599() {
		this.aByteArrayArray11 = null;
		this.aByteArrayArray10 = null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIII[[ZLclient!be;[I[I)V")
	private void method3617(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class19 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean21 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass140ArrayArray1[local22][local25] != null) {
						@Pc(50) Class140 local50 = this.aClass140ArrayArray1[local22][local25];
						if (local50.aShort61 != -1 && (local50.aByte37 & 0x2) == 0 && local50.anInt4014 == 0) {
							local68 = this.aClass46_Sub1_8.method3213(local50.aShort61);
							arg5.method466(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static135.method2733(local50.anInt4016, local68), Static135.method2733(local50.anInt4015, local68), Static135.method2733(local50.anInt4018, local68));
							arg5.method466(local20, local20, local20 - 4, local16, local16 + 4, local16, Static135.method2733(local50.anInt4017, local68), Static135.method2733(local50.anInt4018, local68), Static135.method2733(local50.anInt4015, local68));
						} else if (local50.anInt4014 == 0) {
							arg5.method473(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt4016, local50.anInt4015, local50.anInt4018);
							arg5.method473(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt4017, local50.anInt4018, local50.anInt4015);
						} else {
							local68 = local50.anInt4014;
							arg5.method473(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static64.method1508(local68, local50.anInt4016 & 0xFF000000), Static64.method1508(local68, local50.anInt4015 & 0xFF000000), Static64.method1508(local68, local50.anInt4018 & 0xFF000000));
							arg5.method473(local20, local20, local20 - 4, local16, local16 + 4, local16, Static64.method1508(local68, local50.anInt4017 & 0xFF000000), Static64.method1508(local68, local50.anInt4018 & 0xFF000000), Static64.method1508(local68, local50.anInt4015 & 0xFF000000));
						}
					} else if (this.aClass36ArrayArray1[local22][local25] != null) {
						@Pc(259) Class36 local259 = this.aClass36ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort11; local68++) {
							arg6[local68] = local16 + (local259.aShortArray7[local68] - local22 * this.anInt3891) * 4 / this.anInt3891;
							arg7[local68] = local20 - (local259.aShortArray11[local68] - local25 * this.anInt3891) * 4 / this.anInt3891;
						}
						for (@Pc(307) int local307 = 0; local307 < local259.aShort12; local307++) {
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
							if (local259.anIntArray72 != null && local259.anIntArray72[local307] != 0 && (local259.aShortArray9 == null || local259.aShortArray9 != null && local259.aShortArray9[local307] == -1)) {
								local369 = local259.anIntArray72[local307];
								arg5.method473(local336, local340, local344, local324, local328, local332, Static64.method1508(local369, -(local259.anIntArray73[local312] & -16777216) - 16777216), Static64.method1508(local369, -(local259.anIntArray73[local316] & -16777216) - 16777216), Static64.method1508(local369, -(local259.anIntArray73[local320] & -16777216) - 16777216));
							} else if (local259.aShortArray9 == null || local259.aShortArray9[local307] == -1) {
								arg5.method473(local336, local340, local344, local324, local328, local332, local259.anIntArray73[local312], local259.anIntArray73[local316], local259.anIntArray73[local320]);
							} else {
								local369 = this.aClass46_Sub1_8.method3213(local259.aShortArray9[local307]);
								arg5.method466(local336, local340, local344, local324, local328, local332, local369, local369, local369);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean21 = true;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!as;IIIIZ)Z")
	@Override
	public boolean method3601(@OriginalArg(0) Class14_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(IIIIIII[[ZLclient!be;[I[I)V")
	private void method3618(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class19 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean21 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass105ArrayArray1[local22][local25] != null) {
						@Pc(50) Class105 local50 = this.aClass105ArrayArray1[local22][local25];
						if (local50.aShort43 != -1 && (local50.aByte27 & 0x2) == 0 && local50.anInt3174 == -1) {
							local69 = this.aClass46_Sub1_8.method3213(local50.aShort43);
							arg5.method466(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static135.method2733(local50.aShort45 & 0xFFFF, local69), Static135.method2733(local50.aShort46 & 0xFFFF, local69), Static135.method2733(local50.aShort42 & 0xFFFF, local69));
							arg5.method466(local20, local20, local20 - 4, local16, local16 + 4, local16, Static135.method2733(local50.aShort44 & 0xFFFF, local69), Static135.method2733(local50.aShort42 & 0xFFFF, local69), Static135.method2733(local50.aShort46 & 0xFFFF, local69));
						} else if (local50.anInt3174 == -1) {
							arg5.method466(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort45 & 0xFFFF, local50.aShort46 & 0xFFFF, local50.aShort42 & 0xFFFF);
							arg5.method466(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort44 & 0xFFFF, local50.aShort42 & 0xFFFF, local50.aShort46 & 0xFFFF);
						} else {
							local69 = local50.anInt3174;
							arg5.method466(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method466(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass87ArrayArray1[local22][local25] != null) {
						@Pc(249) Class87 local249 = this.aClass87ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort33; local69++) {
							arg6[local69] = local16 + (local249.anIntArray241[local69] - local22 * this.anInt3891) * 4 / this.anInt3891;
							arg7[local69] = local20 - (local249.anIntArray244[local69] - local25 * this.anInt3891) * 4 / this.anInt3891;
						}
						for (@Pc(297) int local297 = 0; local297 < local249.aShort32; local297++) {
							@Pc(303) short local303 = local249.aShortArray79[local297];
							@Pc(308) short local308 = local249.aShortArray77[local297];
							@Pc(313) short local313 = local249.aShortArray78[local297];
							@Pc(317) int local317 = arg6[local303];
							@Pc(321) int local321 = arg6[local308];
							@Pc(325) int local325 = arg6[local313];
							@Pc(329) int local329 = arg7[local303];
							@Pc(333) int local333 = arg7[local308];
							@Pc(337) int local337 = arg7[local313];
							@Pc(351) int local351;
							if (local249.anIntArray242 != null && local249.anIntArray242[local297] != -1) {
								local351 = local249.anIntArray242[local297];
								arg5.method466(local329, local333, local337, local317, local321, local325, Static135.method2733(local249.aShortArray76[local303], local351), Static135.method2733(local249.aShortArray76[local308], local351), Static135.method2733(local249.aShortArray76[local313], local351));
							} else if (local249.aShortArray74 == null || local249.aShortArray74[local297] == -1) {
								local351 = local249.anIntArray245[local297];
								arg5.method466(local329, local333, local337, local317, local321, local325, Static135.method2733(local249.aShortArray76[local303], local351), Static135.method2733(local249.aShortArray76[local308], local351), Static135.method2733(local249.aShortArray76[local313], local351));
							} else {
								local351 = this.aClass46_Sub1_8.method3213(local249.aShortArray74[local297]);
								arg5.method466(local329, local333, local337, local317, local321, local325, Static135.method2733(local249.aShortArray76[local303], local351), Static135.method2733(local249.aShortArray76[local308], local351), Static135.method2733(local249.aShortArray76[local313], local351));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean21 = true;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method3608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class51_Sub1 local3 = this.aClass46_Sub1_8.aClass51_Sub1_2;
		this.anInt3890 = local3.anInt1722;
		this.anInt3879 = local3.anInt1726;
		this.anInt3885 = local3.anInt1716;
		this.anInt3884 = local3.anInt1720;
		this.anInt3883 = local3.anInt1723;
		this.anInt3880 = local3.anInt1715;
		this.anInt3882 = local3.anInt1719;
		this.anInt3889 = local3.anInt1725;
		this.anInt3888 = local3.anInt1724;
		this.anInt3886 = local3.anInt1721;
		this.anInt3877 = local3.anInt1718;
		this.anInt3881 = local3.anInt1717;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIZLclient!be;[I[I[I)V")
	private void method3619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class140 local6 = this.aClass140ArrayArray1[arg0][arg1];
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
			@Pc(1450) Class36 local1450 = this.aClass36ArrayArray1[arg0][arg1];
			if (local1450 != null) {
				for (local423 = 0; local423 < local1450.aShort11; local423++) {
					@Pc(1460) short local1460 = local1450.aShortArray7[local423];
					local29 = local1450.aShortArray10[local423];
					@Pc(1470) short local1470 = local1450.aShortArray11[local423];
					local367 = this.anInt3881 + (this.anInt3888 * local1460 + this.anInt3886 * local29 + this.anInt3877 * local1470 >> 15);
					if (local367 <= this.aClass46_Sub1_8.anInt3397) {
						return;
					}
					arg6[local423] = 0;
					if (arg2) {
						local283 = local367 - this.aClass46_Sub1_8.anInt3376;
						if (local283 > 255) {
							local283 = 255;
						}
						if (local283 > 0) {
							arg6[local423] = local283;
							local339 = local1450.aShortArray6[local423] * local283 / 255;
							if (local339 > 0) {
								local29 -= local339;
							}
						}
					} else if (this.aClass46_Sub1_8.aBoolean221) {
						local283 = local367 - this.aClass46_Sub1_8.anInt3376;
						if (local283 > 0) {
							arg6[local423] = local283;
							if (arg6[local423] > 255) {
								arg6[local423] = 255;
							}
						}
					}
					local255 = this.anInt3884 + (this.anInt3890 * local1460 + this.anInt3879 * local29 + this.anInt3885 * local1470 >> 15);
					local311 = this.anInt3889 + (this.anInt3883 * local1460 + this.anInt3880 * local29 + this.anInt3882 * local1470 >> 15);
					arg4[local423] = arg3.anInt406 + local255 * this.aClass46_Sub1_8.anInt3391 / local367;
					arg5[local423] = arg3.anInt404 + local311 * this.aClass46_Sub1_8.anInt3387 / local367;
				}
				if (local1450.aShortArray9 != null) {
					local283 = this.anIntArrayArray59[arg0][arg1];
					local339 = this.anIntArrayArray59[arg0 + 1][arg1];
					local395 = this.anIntArrayArray59[arg0][arg1 + 1];
					local451 = arg0 * this.anInt3891;
					local244 = local451 + this.anInt3891;
					local300 = arg1 * this.anInt3891;
					local356 = local300 + this.anInt3891;
					local412 = this.anInt3884 + (this.anInt3890 * local451 + this.anInt3879 * local283 + this.anInt3885 * local300 >> 15);
					local272 = this.anInt3889 + (this.anInt3883 * local451 + this.anInt3880 * local283 + this.anInt3882 * local300 >> 15);
					local328 = this.anInt3881 + (this.anInt3888 * local451 + this.anInt3886 * local283 + this.anInt3877 * local300 >> 15);
					local384 = this.anInt3884 + (this.anInt3890 * local244 + this.anInt3879 * local339 + this.anInt3885 * local300 >> 15);
					local440 = this.anInt3889 + (this.anInt3883 * local244 + this.anInt3880 * local339 + this.anInt3882 * local300 >> 15);
					local78 = this.anInt3881 + (this.anInt3888 * local244 + this.anInt3886 * local339 + this.anInt3877 * local300 >> 15);
					local101 = this.anInt3884 + (this.anInt3890 * local451 + this.anInt3879 * local395 + this.anInt3885 * local356 >> 15);
					local124 = this.anInt3889 + (this.anInt3883 * local451 + this.anInt3880 * local395 + this.anInt3882 * local356 >> 15);
					local147 = this.anInt3881 + (this.anInt3888 * local451 + this.anInt3886 * local395 + this.anInt3877 * local356 >> 15);
					for (local36 = 0; local36 < local1450.aShort12; local36++) {
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
							arg3.aBoolean19 = local163 < 0 || local56 < 0 || local61 < 0 || local163 > arg3.anInt402 || local56 > arg3.anInt402 || local61 > arg3.anInt402;
							@Pc(1954) short local1954 = local1450.aShortArray9[local36];
							if (local1910 < 765) {
								if (local1954 != -1 && this.method3616(this.aClass46_Sub1_8.anInterface2_2.method116(local1954).aByte48)) {
									arg3.anInt403 = 100;
								}
								if (local1910 > 0) {
									if (local1954 != -1) {
										arg3.method475(local222, local227, local620, local163, local56, local61, this.aClass46_Sub1_8.anInt3370, arg6[local38], arg6[local40], arg6[local42], local1450.anIntArray73[local38], local1450.anIntArray73[local40], local1450.anIntArray73[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1954);
									} else if ((local1450.anIntArray73[local38] & 0xFFFFFF) != 0) {
										arg3.method473(local222, local227, local620, local163, local56, local61, Static64.method1508(local1450.anIntArray73[local38], arg6[local38] << 24 | this.aClass46_Sub1_8.anInt3370), Static64.method1508(local1450.anIntArray73[local40], arg6[local40] << 24 | this.aClass46_Sub1_8.anInt3370), Static64.method1508(local1450.anIntArray73[local42], arg6[local42] << 24 | this.aClass46_Sub1_8.anInt3370));
									}
								} else if (local1954 != -1) {
									arg3.method467(local222, local227, local620, local163, local56, local61, local1450.anIntArray73[local38], local1450.anIntArray73[local40], local1450.anIntArray73[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1954);
								} else if ((local1450.anIntArray73[local38] & 0xFFFFFF) != 0) {
									arg3.method473(local222, local227, local620, local163, local56, local61, local1450.anIntArray73[local38], local1450.anIntArray73[local40], local1450.anIntArray73[local42]);
								}
								arg3.anInt403 = 0;
							} else {
								arg3.method478(local222, local227, local620, local163, local56, local61, this.aClass46_Sub1_8.anInt3370);
							}
						}
					}
					return;
				}
				for (local283 = 0; local283 < local1450.aShort12; local283++) {
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
						arg3.aBoolean19 = local244 < 0 || local300 < 0 || local356 < 0 || local244 > arg3.anInt402 || local300 > arg3.anInt402 || local356 > arg3.anInt402;
						if (local384 >= 765) {
							arg3.method478(local412, local272, local328, local244, local300, local356, this.aClass46_Sub1_8.anInt3370);
						} else if (local384 > 0) {
							if ((local1450.anIntArray73[local339] & 0xFFFFFF) != 0) {
								arg3.method473(local412, local272, local328, local244, local300, local356, Static228.method4029(local1450.anIntArray73[local339], arg6[local339], this.aClass46_Sub1_8.anInt3370), Static228.method4029(local1450.anIntArray73[local395], arg6[local395], this.aClass46_Sub1_8.anInt3370), Static228.method4029(local1450.anIntArray73[local451], arg6[local451], this.aClass46_Sub1_8.anInt3370));
							}
						} else if ((local1450.anIntArray73[local339] & 0xFFFFFF) != 0) {
							arg3.method473(local412, local272, local328, local244, local300, local356, local1450.anIntArray73[local339], local1450.anIntArray73[local395], local1450.anIntArray73[local451]);
						}
					}
				}
			}
		} else if ((local6.aByte37 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt3891;
			@Pc(24) int local24 = local19 + this.anInt3891;
			local29 = arg1 * this.anInt3891;
			@Pc(34) int local34 = local29 + this.anInt3891;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte37 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray59[arg0][arg1];
				local61 = this.anIntArrayArray59[arg0 + 1][arg1];
				local222 = this.anIntArrayArray59[arg0 + 1][arg1 + 1];
				local227 = this.anIntArrayArray59[arg0][arg1 + 1];
				local78 = this.anInt3881 + (this.anInt3888 * local19 + this.anInt3886 * local56 + this.anInt3877 * local29 >> 15);
				if (local78 <= this.aClass46_Sub1_8.anInt3397) {
					return;
				}
				local101 = this.anInt3881 + (this.anInt3888 * local24 + this.anInt3886 * local61 + this.anInt3877 * local29 >> 15);
				if (local101 <= this.aClass46_Sub1_8.anInt3397) {
					return;
				}
				local124 = this.anInt3881 + (this.anInt3888 * local24 + this.anInt3886 * local222 + this.anInt3877 * local34 >> 15);
				if (local124 <= this.aClass46_Sub1_8.anInt3397) {
					return;
				}
				local147 = this.anInt3881 + (this.anInt3888 * local19 + this.anInt3886 * local227 + this.anInt3877 * local34 >> 15);
				if (local147 <= this.aClass46_Sub1_8.anInt3397) {
					return;
				}
				if (arg2) {
					local163 = local78 - this.aClass46_Sub1_8.anInt3376;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local36 = local163;
						local620 = this.anIntArrayArray60[arg0][arg1] * local163 / 255;
						if (local620 > 0) {
							local56 -= local620;
						}
					}
					local163 = local101 - this.aClass46_Sub1_8.anInt3376;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local38 = local163;
						local620 = this.anIntArrayArray60[arg0 + 1][arg1] * local163 / 255;
						if (local620 > 0) {
							local61 -= local620;
						}
					}
					local163 = local124 - this.aClass46_Sub1_8.anInt3376;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local40 = local163;
						local620 = this.anIntArrayArray60[arg0 + 1][arg1 + 1] * local163 / 255;
						if (local620 > 0) {
							local222 -= local620;
						}
					}
					local163 = local147 - this.aClass46_Sub1_8.anInt3376;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local42 = local163;
						local620 = this.anIntArrayArray60[arg0][arg1 + 1] * local163 / 255;
						if (local620 > 0) {
							local227 -= local620;
						}
					}
				} else if (this.aClass46_Sub1_8.aBoolean221) {
					local163 = local78 - this.aClass46_Sub1_8.anInt3376;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass46_Sub1_8.anInt3376;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass46_Sub1_8.anInt3376;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass46_Sub1_8.anInt3376;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local244 = this.anInt3884 + (this.anInt3890 * local19 + this.anInt3879 * local56 + this.anInt3885 * local29 >> 15);
				local255 = arg3.anInt406 + local244 * this.aClass46_Sub1_8.anInt3391 / local78;
				local272 = this.anInt3889 + (this.anInt3883 * local19 + this.anInt3880 * local56 + this.anInt3882 * local29 >> 15);
				local283 = arg3.anInt404 + local272 * this.aClass46_Sub1_8.anInt3387 / local78;
				local300 = this.anInt3884 + (this.anInt3890 * local24 + this.anInt3879 * local61 + this.anInt3885 * local29 >> 15);
				local311 = arg3.anInt406 + local300 * this.aClass46_Sub1_8.anInt3391 / local101;
				local328 = this.anInt3889 + (this.anInt3883 * local24 + this.anInt3880 * local61 + this.anInt3882 * local29 >> 15);
				local339 = arg3.anInt404 + local328 * this.aClass46_Sub1_8.anInt3387 / local101;
				local356 = this.anInt3884 + (this.anInt3890 * local24 + this.anInt3879 * local222 + this.anInt3885 * local34 >> 15);
				local367 = arg3.anInt406 + local356 * this.aClass46_Sub1_8.anInt3391 / local124;
				local384 = this.anInt3889 + (this.anInt3883 * local24 + this.anInt3880 * local222 + this.anInt3882 * local34 >> 15);
				local395 = arg3.anInt404 + local384 * this.aClass46_Sub1_8.anInt3387 / local124;
				local412 = this.anInt3884 + (this.anInt3890 * local19 + this.anInt3879 * local227 + this.anInt3885 * local34 >> 15);
				local423 = arg3.anInt406 + local412 * this.aClass46_Sub1_8.anInt3391 / local147;
				local440 = this.anInt3889 + (this.anInt3883 * local19 + this.anInt3880 * local227 + this.anInt3882 * local34 >> 15);
				local451 = arg3.anInt404 + local440 * this.aClass46_Sub1_8.anInt3387 / local147;
			} else {
				local56 = this.anIntArrayArray59[arg0][arg1];
				local61 = this.anInt3886 * local56;
				local78 = this.anInt3881 + (this.anInt3888 * local19 + local61 + this.anInt3877 * local29 >> 15);
				if (local78 <= this.aClass46_Sub1_8.anInt3397) {
					return;
				}
				local101 = this.anInt3881 + (this.anInt3888 * local24 + local61 + this.anInt3877 * local29 >> 15);
				if (local101 <= this.aClass46_Sub1_8.anInt3397) {
					return;
				}
				local124 = this.anInt3881 + (this.anInt3888 * local24 + local61 + this.anInt3877 * local34 >> 15);
				if (local124 <= this.aClass46_Sub1_8.anInt3397) {
					return;
				}
				local147 = this.anInt3881 + (this.anInt3888 * local19 + local61 + this.anInt3877 * local34 >> 15);
				if (local147 <= this.aClass46_Sub1_8.anInt3397) {
					return;
				}
				if (this.aClass46_Sub1_8.aBoolean221) {
					local163 = local78 - this.aClass46_Sub1_8.anInt3376;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass46_Sub1_8.anInt3376;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass46_Sub1_8.anInt3376;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass46_Sub1_8.anInt3376;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local222 = this.anInt3879 * local56;
				local227 = this.anInt3880 * local56;
				local244 = this.anInt3884 + (this.anInt3890 * local19 + local222 + this.anInt3885 * local29 >> 15);
				local255 = arg3.anInt406 + local244 * this.aClass46_Sub1_8.anInt3391 / local78;
				local272 = this.anInt3889 + (this.anInt3883 * local19 + local227 + this.anInt3882 * local29 >> 15);
				local283 = arg3.anInt404 + local272 * this.aClass46_Sub1_8.anInt3387 / local78;
				local300 = this.anInt3884 + (this.anInt3890 * local24 + local222 + this.anInt3885 * local29 >> 15);
				local311 = arg3.anInt406 + local300 * this.aClass46_Sub1_8.anInt3391 / local101;
				local328 = this.anInt3889 + (this.anInt3883 * local24 + local227 + this.anInt3882 * local29 >> 15);
				local339 = arg3.anInt404 + local328 * this.aClass46_Sub1_8.anInt3387 / local101;
				local356 = this.anInt3884 + (this.anInt3890 * local24 + local222 + this.anInt3885 * local34 >> 15);
				local367 = arg3.anInt406 + local356 * this.aClass46_Sub1_8.anInt3391 / local124;
				local384 = this.anInt3889 + (this.anInt3883 * local24 + local227 + this.anInt3882 * local34 >> 15);
				local395 = arg3.anInt404 + local384 * this.aClass46_Sub1_8.anInt3387 / local124;
				local412 = this.anInt3884 + (this.anInt3890 * local19 + local222 + this.anInt3885 * local34 >> 15);
				local423 = arg3.anInt406 + local412 * this.aClass46_Sub1_8.anInt3391 / local147;
				local440 = this.anInt3889 + (this.anInt3883 * local19 + local227 + this.anInt3882 * local34 >> 15);
				local451 = arg3.anInt404 + local440 * this.aClass46_Sub1_8.anInt3387 / local147;
			}
			@Pc(1062) boolean local1062 = local6.aShort61 != -1 && this.method3616(this.aClass46_Sub1_8.anInterface2_2.method116(local6.aShort61).aByte48);
			local61 = local38 + local40 + local42;
			if ((local367 - local423) * (local339 - local451) - (local395 - local451) * (local311 - local423) > 0) {
				arg3.aBoolean19 = local367 < 0 || local423 < 0 || local311 < 0 || local367 > arg3.anInt402 || local423 > arg3.anInt402 || local311 > arg3.anInt402;
				if (local61 < 765) {
					if (local1062) {
						arg3.anInt403 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort61 >= 0) {
							arg3.method475(local395, local451, local339, local367, local423, local311, this.aClass46_Sub1_8.anInt3370, local40, local42, local38, local6.anInt4016, local6.anInt4015, local6.anInt4018, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort61);
						} else {
							arg3.method473(local395, local451, local339, local367, local423, local311, Static64.method1508(local6.anInt4016, local40 << 24 | this.aClass46_Sub1_8.anInt3370), Static64.method1508(local6.anInt4015, local42 << 24 | this.aClass46_Sub1_8.anInt3370), Static64.method1508(local6.anInt4018, local38 << 24 | this.aClass46_Sub1_8.anInt3370));
						}
					} else if (local6.aShort61 >= 0) {
						arg3.method467(local395, local451, local339, local367, local423, local311, local6.anInt4016, local6.anInt4015, local6.anInt4018, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort61);
					} else {
						arg3.method473(local395, local451, local339, local367, local423, local311, local6.anInt4016, local6.anInt4015, local6.anInt4018);
					}
					arg3.anInt403 = 0;
				} else {
					arg3.method478(local395, local451, local339, local367, local423, local311, this.aClass46_Sub1_8.anInt3370);
				}
			}
			local61 = local36 + local38 + local42;
			if ((local255 - local311) * (local451 - local339) - (local283 - local339) * (local423 - local311) > 0) {
				arg3.aBoolean19 = local255 < 0 || local311 < 0 || local423 < 0 || local255 > arg3.anInt402 || local311 > arg3.anInt402 || local423 > arg3.anInt402;
				if (local61 < 765) {
					if (local1062) {
						arg3.anInt403 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort61 >= 0) {
							arg3.method475(local283, local339, local451, local255, local311, local423, this.aClass46_Sub1_8.anInt3370, local36, local38, local42, local6.anInt4017, local6.anInt4018, local6.anInt4015, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort61);
						} else {
							arg3.method473(local283, local339, local451, local255, local311, local423, Static64.method1508(local6.anInt4017, local36 << 24 | this.aClass46_Sub1_8.anInt3370), Static64.method1508(local6.anInt4018, local38 << 24 | this.aClass46_Sub1_8.anInt3370), Static64.method1508(local6.anInt4015, local42 << 24 | this.aClass46_Sub1_8.anInt3370));
						}
					} else if (local6.aShort61 >= 0) {
						arg3.method467(local283, local339, local451, local255, local311, local423, local6.anInt4017, local6.anInt4018, local6.anInt4015, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort61);
					} else {
						arg3.method473(local283, local339, local451, local255, local311, local423, local6.anInt4017, local6.anInt4018, local6.anInt4015);
					}
					arg3.anInt403 = 0;
					return;
				}
				arg3.method478(local283, local339, local451, local255, local311, local423, this.aClass46_Sub1_8.anInt3370);
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(III)V")
	@Override
	public void method3598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray10[arg0][arg1] < arg2) {
			this.aByteArrayArray10[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(Lclient!as;IIIIZ)V")
	@Override
	public void method3611(@OriginalArg(0) Class14_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}
}
