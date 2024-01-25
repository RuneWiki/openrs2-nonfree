import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
	private int anInt597;

	@OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
	private int anInt598;

	@OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
	private int anInt599;

	@OriginalMember(owner = "client!bh", name = "m", descriptor = "[[Lclient!an;")
	private Class12[][] aClass12ArrayArray1;

	@OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
	private int anInt600;

	@OriginalMember(owner = "client!bh", name = "p", descriptor = "[[Lclient!ds;")
	private Class50[][] aClass50ArrayArray1;

	@OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
	private int anInt602;

	@OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
	private int anInt605;

	@OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
	private int anInt606;

	@OriginalMember(owner = "client!bh", name = "w", descriptor = "[[Lclient!mh;")
	private Class134[][] aClass134ArrayArray1;

	@OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
	private int anInt607;

	@OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
	private int anInt608;

	@OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
	private int anInt609;

	@OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
	private int anInt610;

	@OriginalMember(owner = "client!bh", name = "E", descriptor = "[[Lclient!n;")
	private Class139[][] aClass139ArrayArray1;

	@OriginalMember(owner = "client!bh", name = "G", descriptor = "I")
	private int anInt611;

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "Lclient!lh;")
	private final Class122_Sub1 aClass122_Sub1_1;

	@OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
	private final int anInt601;

	@OriginalMember(owner = "client!bh", name = "F", descriptor = "[[I")
	public final int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!bh", name = "y", descriptor = "[[I")
	private final int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
	private final int anInt603;

	@OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
	private int anInt604;

	@OriginalMember(owner = "client!bh", name = "C", descriptor = "[[B")
	private byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!bh", name = "D", descriptor = "[[B")
	private byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!lh;IIII[[I[[II)V")
	public Class22_Sub1(@OriginalArg(0) Class122_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4);
		this.aClass122_Sub1_1 = arg0;
		this.anInt601 = arg2;
		this.anIntArrayArray3 = arg5;
		this.anIntArrayArray2 = arg6;
		this.anInt603 = arg7;
		this.anInt604 = 0;
		while (arg7 > 1) {
			this.anInt604++;
			arg7 >>= 0x1;
		}
		this.aByteArrayArray3 = new byte[arg3 + 1][arg4 + 1];
		@Pc(50) int local50 = this.aClass122_Sub1_1.lb >> 9;
		for (@Pc(52) int local52 = 1; local52 < arg4; local52++) {
			for (@Pc(55) int local55 = 1; local55 < arg3; local55++) {
				@Pc(76) int local76 = this.anIntArrayArray3[local55 + 1][local52] - this.anIntArrayArray3[local55 - 1][local52];
				@Pc(94) int local94 = this.anIntArrayArray3[local55][local52 + 1] - this.anIntArrayArray3[local55][local52 - 1];
				@Pc(107) int local107 = (int) Math.sqrt((double) (local76 * local76 + local94 * local94 + 65536));
				@Pc(113) int local113 = (local76 << 8) / local107;
				@Pc(117) int local117 = -65536 / local107;
				@Pc(123) int local123 = (local94 << 8) / local107;
				@Pc(145) int local145 = local50 + (this.aClass122_Sub1_1.anInt3841 * local113 + this.aClass122_Sub1_1.anInt3859 * local117 + this.aClass122_Sub1_1.anInt3831 * local123 >> 17);
				local145 >>= 0x1;
				if (local145 < 2) {
					local145 = 2;
				} else if (local145 > 126) {
					local145 = 126;
				}
				this.aByteArrayArray3[local55][local52] = (byte) local145;
			}
		}
		this.aByteArrayArray4 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)Z")
	private boolean method474(@OriginalArg(0) int arg0) {
		if ((this.anInt601 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else {
			return arg0 == 8;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)I")
	@Override
	public int method4672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray3[arg0][arg1];
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIII[[ZLclient!ho;[I[I)V")
	private void method475(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class85 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean146 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass139ArrayArray1[local22][local25] != null) {
						@Pc(50) Class139 local50 = this.aClass139ArrayArray1[local22][local25];
						if (local50.aShort63 != -1 && (local50.aByte42 & 0x2) == 0 && local50.anInt4175 == -1) {
							local69 = this.aClass122_Sub1_1.method3220(local50.aShort63);
							arg5.method2109(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static152.method2448(local50.aShort59 & 0xFFFF, local69), Static152.method2448(local50.aShort60 & 0xFFFF, local69), Static152.method2448(local50.aShort62 & 0xFFFF, local69));
							arg5.method2109(local20, local20, local20 - 4, local16, local16 + 4, local16, Static152.method2448(local50.aShort61 & 0xFFFF, local69), Static152.method2448(local50.aShort62 & 0xFFFF, local69), Static152.method2448(local50.aShort60 & 0xFFFF, local69));
						} else if (local50.anInt4175 == -1) {
							arg5.method2109(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort59 & 0xFFFF, local50.aShort60 & 0xFFFF, local50.aShort62 & 0xFFFF);
							arg5.method2109(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort61 & 0xFFFF, local50.aShort62 & 0xFFFF, local50.aShort60 & 0xFFFF);
						} else {
							local69 = local50.anInt4175;
							arg5.method2109(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method2109(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass12ArrayArray1[local22][local25] != null) {
						@Pc(249) Class12 local249 = this.aClass12ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort2; local69++) {
							arg6[local69] = local16 + (local249.anIntArray11[local69] - local22 * this.anInt603) * 4 / this.anInt603;
							arg7[local69] = local20 - (local249.anIntArray15[local69] - local25 * this.anInt603) * 4 / this.anInt603;
						}
						for (@Pc(297) int local297 = 0; local297 < local249.aShort3; local297++) {
							@Pc(303) short local303 = local249.aShortArray10[local297];
							@Pc(308) short local308 = local249.aShortArray11[local297];
							@Pc(313) short local313 = local249.aShortArray12[local297];
							@Pc(317) int local317 = arg6[local303];
							@Pc(321) int local321 = arg6[local308];
							@Pc(325) int local325 = arg6[local313];
							@Pc(329) int local329 = arg7[local303];
							@Pc(333) int local333 = arg7[local308];
							@Pc(337) int local337 = arg7[local313];
							@Pc(351) int local351;
							if (local249.anIntArray13 != null && local249.anIntArray13[local297] != -1) {
								local351 = local249.anIntArray13[local297];
								arg5.method2109(local329, local333, local337, local317, local321, local325, Static152.method2448(local249.aShortArray13[local303], local351), Static152.method2448(local249.aShortArray13[local308], local351), Static152.method2448(local249.aShortArray13[local313], local351));
							} else if (local249.aShortArray9 == null || local249.aShortArray9[local297] == -1) {
								local351 = local249.anIntArray14[local297];
								arg5.method2109(local329, local333, local337, local317, local321, local325, Static152.method2448(local249.aShortArray13[local303], local351), Static152.method2448(local249.aShortArray13[local308], local351), Static152.method2448(local249.aShortArray13[local313], local351));
							} else {
								local351 = this.aClass122_Sub1_1.method3220(local249.aShortArray9[local297]);
								arg5.method2109(local329, local333, local337, local317, local321, local325, Static152.method2448(local249.aShortArray13[local303], local351), Static152.method2448(local249.aShortArray13[local308], local351), Static152.method2448(local249.aShortArray13[local313], local351));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean146 = true;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)V")
	@Override
	public void method4675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class129 local4 = this.aClass122_Sub1_1.method3217(Thread.currentThread());
		local4.aClass85_2.anInt2580 = 0;
		if (this.aClass134ArrayArray1 != null) {
			this.method477(arg0, arg1, this.aClass122_Sub1_1.aBoolean212, local4.aClass85_2, local4.anIntArray325, local4.anIntArray330, local4.anIntArray332);
		} else if (this.aClass139ArrayArray1 != null) {
			this.method478(arg0, arg1, local4.aClass85_2, local4.anIntArray325, local4.anIntArray330, local4.anIntArray332);
		}
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(II)I")
	@Override
	public int method4678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> this.anInt604;
		@Pc(9) int local9 = arg1 >> this.anInt604;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt5574 - 1 || local9 > super.anInt5577 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & this.anInt603 - 1;
		@Pc(41) int local41 = arg1 & this.anInt603 - 1;
		@Pc(67) int local67 = this.anIntArrayArray3[local4][local9] * (this.anInt603 - local34) + this.anIntArrayArray3[local4 + 1][local9] * local34 >> this.anInt604;
		@Pc(97) int local97 = this.anIntArrayArray3[local4][local9 + 1] * (this.anInt603 - local34) + this.anIntArrayArray3[local4 + 1][local9 + 1] * local34 >> this.anInt604;
		return local67 * (this.anInt603 - local41) + local97 * local41 >> this.anInt604;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method4674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		if (this.aClass134ArrayArray1 == null) {
			this.aClass134ArrayArray1 = new Class134[super.anInt5574][super.anInt5577];
			this.aClass50ArrayArray1 = new Class50[super.anInt5574][super.anInt5577];
		} else if (this.aClass139ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg5.length; local32++) {
			if (arg5[local32] == -1) {
				arg5[local32] = 0;
			} else {
				arg5[local32] = Static113.anIntArray533[Static298.method5060(arg5[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg6 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg6.length; local68++) {
				if (arg6[local68] == -1) {
					arg6[local68] = 0;
				} else {
					arg6[local68] = Static113.anIntArray533[Static298.method5060(arg6[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == this.anInt603 && arg4[local116] == 0) {
					if (local106 != -1 && arg5[local106] != arg5[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == this.anInt603 && arg4[local116] == this.anInt603) {
					if (local108 != -1 && arg5[local108] != arg5[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == this.anInt603) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + this.anInt603 && arg2[local244] != arg2[0] - this.anInt603) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + this.anInt603 && arg4[local244] != arg4[0] - this.anInt603) {
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
			@Pc(334) Class134 local334 = new Class134();
			local244 = arg5[0];
			local342 = arg7[0];
			if (arg6 != null) {
				local334.anInt4010 = arg6[0] >> 8;
				if (local244 == 0) {
					local334.aByte41 = (byte) (local334.aByte41 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray3[arg0][arg1] == this.anIntArrayArray3[arg0 + 1][arg1] && this.anIntArrayArray3[arg0][arg1] == this.anIntArrayArray3[arg0 + 1][arg1 + 1] && this.anIntArrayArray3[arg0][arg1] == this.anIntArrayArray3[arg0][arg1 + 1]) {
				local334.aByte41 = (byte) (local334.aByte41 | 0x1);
			}
			if (local342 == -1 || (local334.aByte41 & 0x2) != 0 || this.aClass122_Sub1_1.anInterface9_4.method2396(local342).aBoolean318) {
				if (this.anIntArrayArray2 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray2[arg0][arg1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt4013 = Static308.method5181(local531, arg9, Static357.method476(arg5[local104] >> 8, this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1]));
				if (local334.anInt4010 != 0) {
					local334.anInt4013 |= this.aByteArrayArray4[arg0][arg1] + 255 - this.aByteArrayArray3[arg0][arg1] << 25;
				}
				if (this.anIntArrayArray2 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray2[arg0 + 1][arg1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt4011 = Static308.method5181(local531, arg9, Static357.method476(arg5[local106] >> 8, this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1]));
				if (local334.anInt4010 != 0) {
					local334.anInt4011 |= this.aByteArrayArray4[arg0 + 1][arg1] + 255 - this.aByteArrayArray3[arg0 + 1][arg1] << 25;
				}
				if (this.anIntArrayArray2 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray2[arg0 + 1][arg1 + 1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt4012 = Static308.method5181(local531, arg9, Static357.method476(arg5[local108] >> 8, this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1]));
				if (local334.anInt4010 != 0) {
					local334.anInt4012 |= this.aByteArrayArray4[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray3[arg0 + 1][arg1 + 1] << 25;
				}
				if (this.anIntArrayArray2 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray2[arg0][arg1 + 1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt4009 = Static308.method5181(local531, arg9, Static357.method476(arg5[local110] >> 8, this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1]));
				if (local334.anInt4010 != 0) {
					local334.anInt4009 |= this.aByteArrayArray4[arg0][arg1 + 1] + 255 - this.aByteArrayArray3[arg0][arg1 + 1] << 25;
				}
				local334.aShort57 = -1;
			} else {
				local334.anInt4013 = this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1];
				local334.anInt4011 = this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1];
				local334.anInt4012 = this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1];
				local334.anInt4009 = this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1];
				local334.aShort57 = (short) local342;
			}
			this.aClass134ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(886) Class50 local886 = new Class50();
		local886.aShort11 = (short) arg2.length;
		local886.aShort10 = (short) (arg2.length / 3);
		local886.aShortArray53 = new short[local886.aShort11];
		local886.aShortArray51 = new short[local886.aShort11];
		local886.aShortArray52 = new short[local886.aShort11];
		local886.anIntArray87 = new int[local886.aShort11];
		if (this.anIntArrayArray2 != null) {
			local886.aShortArray50 = new short[local886.aShort11];
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
				local957 = this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1];
			} else if (local342 == 0 && local531 == this.anInt603) {
				local957 = this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1];
			} else if (local342 == this.anInt603 && local531 == this.anInt603) {
				local957 = this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1];
			} else if (local342 == this.anInt603 && local531 == 0) {
				local957 = this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1];
			} else {
				local1078 = (this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1]) * (this.anInt603 - local342) + (this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1]) * local342;
				local1125 = (this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1]) * (this.anInt603 - local342) + (this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1]) * local342;
				local957 = local1078 * (this.anInt603 - local531) + local1125 * local531 >> this.anInt604 * 2;
			}
			@Pc(1149) short local1149 = (short) ((arg0 << this.anInt604) + local342);
			@Pc(1157) short local1157 = (short) ((arg1 << this.anInt604) + local531);
			local886.aShortArray53[local244] = local1149;
			local886.aShortArray52[local244] = local1157;
			local886.aShortArray51[local244] = (short) (this.method4678(local1149, local1157) + (arg3 == null ? 0 : arg3[local244]));
			if (local957 < 0) {
				local957 = 0;
			}
			if (arg7[local244] != -1 && !this.aClass122_Sub1_1.anInterface9_4.method2396(arg7[local244]).aBoolean318) {
				local886.anIntArray87[local244] = local957;
			} else if (arg5[local244] != 0) {
				local1225 = 0;
				if (this.anIntArrayArray2 != null) {
					@Pc(1241) int local1241;
					if (local342 == 0 && local531 == 0) {
						local1241 = this.anIntArrayArray2[arg0][arg1];
					} else if (local342 == 0 && local531 == this.anInt603) {
						local1241 = this.anIntArrayArray2[arg0][arg1 + 1];
					} else if (local342 == this.anInt603 && local531 == this.anInt603) {
						local1241 = this.anIntArrayArray2[arg0 + 1][arg1 + 1];
					} else if (local342 == this.anInt603 && local531 == 0) {
						local1241 = this.anIntArrayArray2[arg0 + 1][arg1];
					} else {
						@Pc(1317) int local1317 = this.anIntArrayArray2[arg0][arg1] * (this.anInt603 - local342) + this.anIntArrayArray2[arg0 + 1][arg1] * local342;
						local1344 = this.anIntArrayArray2[arg0][arg1 + 1] * (this.anInt603 - local342) + this.anIntArrayArray2[arg0 + 1][arg1 + 1] * local342;
						local1241 = local1317 * (this.anInt603 - local531) + local1344 * local531 >> this.anInt604 * 2;
					}
					local886.aShortArray50[local244] = (short) local1241;
					if (arg10 != 0) {
						local1225 = local1241 * 255 / arg10;
						if (local1225 < 0) {
							local1225 = 0;
						} else if (local1225 > 255) {
							local1225 = 255;
						}
					}
				}
				local886.anIntArray87[local244] = Static308.method5181(local1225, arg9, Static357.method476(arg5[local244] >> 8, local957));
				if (arg6 != null) {
					local886.anIntArray87[local244] |= local957 << 25;
				}
			} else if (arg6 == null) {
				local886.anIntArray87[local244] = 0;
			} else {
				local886.anIntArray87[local244] = local957 << 25;
			}
		}
		@Pc(1424) boolean local1424 = false;
		for (local531 = 0; local531 < local886.aShort10; local531++) {
			if (arg7[local531 * 3] != -1 && !this.aClass122_Sub1_1.anInterface9_4.method2396(arg7[local531 * 3]).aBoolean318) {
				local1424 = true;
			}
		}
		if (arg6 != null) {
			local886.anIntArray88 = new int[local886.aShort10];
		}
		if (local1424) {
			local886.aShortArray48 = new short[local886.aShort10];
			local886.aShortArray49 = new short[local886.aShort10];
		}
		for (local957 = 0; local957 < local886.aShort10; local957++) {
			local1078 = local957 * 3;
			if (arg6 != null && arg6[local1078] != 0) {
				local886.anIntArray88[local957] = arg6[local1078] >> 8;
			}
			if (local1424) {
				local1125 = local1078 + 1;
				local1225 = local1125 + 1;
				@Pc(1506) boolean local1506 = false;
				@Pc(1508) boolean local1508 = true;
				local1344 = arg7[local1078];
				if (local1344 == -1 || this.aClass122_Sub1_1.anInterface9_4.method2396(local1344).aBoolean318) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				local1344 = arg7[local1125];
				if (local1344 == -1 || this.aClass122_Sub1_1.anInterface9_4.method2396(local1344).aBoolean318) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				local1344 = arg7[local1225];
				if (local1344 == -1 || this.aClass122_Sub1_1.anInterface9_4.method2396(local1344).aBoolean318) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				if (local1508) {
					local886.aShortArray48[local957] = (short) local1344;
					local886.aShortArray49[local957] = (short) arg8[local1078];
				} else {
					if (local1506) {
						local1344 = arg7[local1078];
						if (local1344 != -1 && !this.aClass122_Sub1_1.anInterface9_4.method2396(local1344).aBoolean318) {
							local886.anIntArray87[local1078] = Static113.anIntArray533[Static298.method5060(this.aClass122_Sub1_1.anInterface9_4.method2396(local1344).aShort83 & 0xFFFF) & 0xFFFF];
						}
						local1344 = arg7[local1125];
						if (local1344 != -1 && !this.aClass122_Sub1_1.anInterface9_4.method2396(local1344).aBoolean318) {
							local886.anIntArray87[local1125] = Static113.anIntArray533[Static298.method5060(this.aClass122_Sub1_1.anInterface9_4.method2396(local1344).aShort83 & 0xFFFF) & 0xFFFF];
						}
						local1344 = arg7[local1225];
						if (local1344 != -1 && !this.aClass122_Sub1_1.anInterface9_4.method2396(local1344).aBoolean318) {
							local886.anIntArray87[local1225] = Static113.anIntArray533[Static298.method5060(this.aClass122_Sub1_1.anInterface9_4.method2396(local1344).aShort83 & 0xFFFF) & 0xFFFF];
						}
					}
					local886.aShortArray48[local957] = -1;
				}
			}
		}
		this.aClass50ArrayArray1[arg0][arg1] = local886;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!c;IIIIZ)V")
	@Override
	public void method4673(@OriginalArg(0) Class3_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(III)V")
	@Override
	public void method4671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray4[arg0][arg1] < arg2) {
			this.aByteArrayArray4[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method4667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		if (this.aClass139ArrayArray1 == null) {
			this.aClass139ArrayArray1 = new Class139[super.anInt5574][super.anInt5577];
			this.aClass12ArrayArray1 = new Class12[super.anInt5574][super.anInt5577];
		} else if (this.aClass134ArrayArray1 != null) {
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
				if (local64 != 0 && local64 != this.anInt603 || local70 != 0 && local70 != this.anInt603) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class12 local95 = new Class12();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg8.length;
			local95.aShort2 = local99;
			local95.aShortArray13 = new short[local99];
			local95.anIntArray11 = new int[local99];
			local95.anIntArray12 = new int[local99];
			local95.anIntArray15 = new int[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray13[local124] = (short) (this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1]);
				} else if (local129 == 0 && local133 == this.anInt603) {
					local95.aShortArray13[local124] = (short) (this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1]);
				} else if (local129 == this.anInt603 && local133 == this.anInt603) {
					local95.aShortArray13[local124] = (short) (this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1]);
				} else if (local129 == this.anInt603 && local133 == 0) {
					local95.aShortArray13[local124] = (short) (this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1]) * (this.anInt603 - local129) + (this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1]) * (this.anInt603 - local129) + (this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray13[local124] = (short) (local288 * (this.anInt603 - local133) + local335 * local133 >> this.anInt604 * 2);
				}
				local288 = (arg0 << this.anInt604) + local129;
				local335 = (arg1 << this.anInt604) + local133;
				local95.anIntArray11[local124] = local288;
				local95.anIntArray15[local124] = local335;
				local95.anIntArray12[local124] = this.method4678(local288, local335) + (arg3 == null ? 0 : arg3[local124]);
				if (local95.aShortArray13[local124] < 2) {
					local95.aShortArray13[local124] = 2;
				}
			}
			@Pc(412) boolean local412 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg8[local288] >= 0 || arg9 != null && arg9[local288] >= 0) {
					local133++;
				}
				if (arg10[local288] != -1 && !this.aClass122_Sub1_1.anInterface9_4.method2396(arg10[local288]).aBoolean318) {
					local412 = true;
				}
			}
			local95.anIntArray14 = new int[local133];
			if (arg9 != null) {
				local95.anIntArray13 = new int[local133];
			}
			local95.aShortArray10 = new short[local133];
			local95.aShortArray11 = new short[local133];
			local95.aShortArray12 = new short[local133];
			if (local412) {
				local95.aShortArray9 = new short[local133];
				local95.aShortArray14 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg8[local335] >= 0 || arg9 != null && arg9[local335] >= 0) {
					if (arg8[local335] >= 0) {
						local95.anIntArray14[local95.aShort3] = Static298.method5060(arg8[local335]);
					} else {
						local95.anIntArray14[local95.aShort3] = -1;
					}
					if (arg9 != null) {
						if (arg9[local335] == -1) {
							local95.anIntArray13[local95.aShort3] = -1;
						} else {
							local95.anIntArray13[local95.aShort3] = Static298.method5060(arg9[local335]);
						}
					}
					local95.aShortArray10[local95.aShort3] = (short) arg5[local335];
					local95.aShortArray11[local95.aShort3] = (short) arg6[local335];
					local95.aShortArray12[local95.aShort3] = (short) arg7[local335];
					if (local412) {
						if (arg10[local335] == -1 || this.aClass122_Sub1_1.anInterface9_4.method2396(arg10[local335]).aBoolean318) {
							local95.aShortArray9[local95.aShort3] = -1;
						} else {
							local95.aShortArray9[local95.aShort3] = (short) arg10[local335];
							local95.aShortArray14[local95.aShort3] = (short) arg11[local335];
						}
					}
					local95.aShort3++;
				}
			}
			this.aClass12ArrayArray1[arg0][arg1] = local95;
		} else if (arg8[0] >= 0 || arg9 != null && arg9[0] >= 0) {
			@Pc(641) Class139 local641 = new Class139();
			local64 = arg8[0];
			local70 = arg10[0];
			if (arg9 != null) {
				local641.anInt4175 = Static152.method2448(this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1], Static298.method5060(arg9[0]));
				if (local64 == -1) {
					local641.aByte42 = (byte) (local641.aByte42 | 0x2);
				}
			}
			if (this.anIntArrayArray3[arg0][arg1] == this.anIntArrayArray3[arg0 + 1][arg1] && this.anIntArrayArray3[arg0][arg1] == this.anIntArrayArray3[arg0 + 1][arg1 + 1] && this.anIntArrayArray3[arg0][arg1] == this.anIntArrayArray3[arg0][arg1 + 1]) {
				local641.aByte42 = (byte) (local641.aByte42 | 0x1);
			}
			if (local70 == -1 || (local641.aByte42 & 0x2) != 0 || this.aClass122_Sub1_1.anInterface9_4.method2396(local70).aBoolean318) {
				@Pc(842) short local842 = Static298.method5060(local64);
				local641.aShort61 = (short) Static152.method2448(this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1], local842);
				local641.aShort62 = (short) Static152.method2448(this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1], local842);
				local641.aShort59 = (short) Static152.method2448(this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1], local842);
				local641.aShort60 = (short) Static152.method2448(this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1], local842);
				local641.aShort63 = -1;
			} else {
				local641.aShort61 = (short) (this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1]);
				local641.aShort62 = (short) (this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1]);
				local641.aShort59 = (short) (this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1]);
				local641.aShort60 = (short) (this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1]);
				local641.aShort63 = (short) local70;
			}
			this.aClass139ArrayArray1[arg0][arg1] = local641;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "()V")
	@Override
	public void method4679() {
		this.aByteArrayArray3 = null;
		this.aByteArrayArray4 = null;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIZLclient!ho;[I[I[I)V")
	private void method477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class85 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class134 local6 = this.aClass134ArrayArray1[arg0][arg1];
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
			@Pc(1450) Class50 local1450 = this.aClass50ArrayArray1[arg0][arg1];
			if (local1450 != null) {
				for (local423 = 0; local423 < local1450.aShort11; local423++) {
					@Pc(1460) short local1460 = local1450.aShortArray53[local423];
					local29 = local1450.aShortArray51[local423];
					@Pc(1470) short local1470 = local1450.aShortArray52[local423];
					local367 = this.anInt610 + (this.anInt602 * local1460 + this.anInt605 * local29 + this.anInt607 * local1470 >> 15);
					if (local367 <= this.aClass122_Sub1_1.anInt3847) {
						return;
					}
					arg6[local423] = 0;
					if (arg2) {
						local283 = local367 - this.aClass122_Sub1_1.anInt3857;
						if (local283 > 255) {
							local283 = 255;
						}
						if (local283 > 0) {
							arg6[local423] = local283;
							local339 = local1450.aShortArray50[local423] * local283 / 255;
							if (local339 > 0) {
								local29 -= local339;
							}
						}
					} else if (this.aClass122_Sub1_1.aBoolean213) {
						local283 = local367 - this.aClass122_Sub1_1.anInt3857;
						if (local283 > 0) {
							arg6[local423] = local283;
							if (arg6[local423] > 255) {
								arg6[local423] = 255;
							}
						}
					}
					local255 = this.anInt599 + (this.anInt597 * local1460 + this.anInt600 * local29 + this.anInt608 * local1470 >> 15);
					local311 = this.anInt611 + (this.anInt606 * local1460 + this.anInt609 * local29 + this.anInt598 * local1470 >> 15);
					arg4[local423] = arg3.anInt2579 + local255 * this.aClass122_Sub1_1.anInt3833 / local367;
					arg5[local423] = arg3.anInt2578 + local311 * this.aClass122_Sub1_1.anInt3846 / local367;
				}
				if (local1450.aShortArray48 != null) {
					local283 = this.anIntArrayArray3[arg0][arg1];
					local339 = this.anIntArrayArray3[arg0 + 1][arg1];
					local395 = this.anIntArrayArray3[arg0][arg1 + 1];
					local451 = arg0 * this.anInt603;
					local244 = local451 + this.anInt603;
					local300 = arg1 * this.anInt603;
					local356 = local300 + this.anInt603;
					local412 = this.anInt599 + (this.anInt597 * local451 + this.anInt600 * local283 + this.anInt608 * local300 >> 15);
					local272 = this.anInt611 + (this.anInt606 * local451 + this.anInt609 * local283 + this.anInt598 * local300 >> 15);
					local328 = this.anInt610 + (this.anInt602 * local451 + this.anInt605 * local283 + this.anInt607 * local300 >> 15);
					local384 = this.anInt599 + (this.anInt597 * local244 + this.anInt600 * local339 + this.anInt608 * local300 >> 15);
					local440 = this.anInt611 + (this.anInt606 * local244 + this.anInt609 * local339 + this.anInt598 * local300 >> 15);
					local78 = this.anInt610 + (this.anInt602 * local244 + this.anInt605 * local339 + this.anInt607 * local300 >> 15);
					local101 = this.anInt599 + (this.anInt597 * local451 + this.anInt600 * local395 + this.anInt608 * local356 >> 15);
					local124 = this.anInt611 + (this.anInt606 * local451 + this.anInt609 * local395 + this.anInt598 * local356 >> 15);
					local147 = this.anInt610 + (this.anInt602 * local451 + this.anInt605 * local395 + this.anInt607 * local356 >> 15);
					for (local36 = 0; local36 < local1450.aShort10; local36++) {
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
							arg3.aBoolean145 = local163 < 0 || local56 < 0 || local61 < 0 || local163 > arg3.anInt2577 || local56 > arg3.anInt2577 || local61 > arg3.anInt2577;
							@Pc(1954) short local1954 = local1450.aShortArray48[local36];
							if (local1910 < 765) {
								if (local1954 != -1 && this.method474(this.aClass122_Sub1_1.anInterface9_4.method2396(local1954).aByte57)) {
									arg3.anInt2580 = 100;
								}
								if (local1910 > 0) {
									if (local1954 != -1) {
										arg3.method2102(local222, local227, local620, local163, local56, local61, this.aClass122_Sub1_1.anInt3850, arg6[local38], arg6[local40], arg6[local42], local1450.anIntArray87[local38], local1450.anIntArray87[local40], local1450.anIntArray87[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1954);
									} else if ((local1450.anIntArray87[local38] & 0xFFFFFF) != 0) {
										arg3.method2097(local222, local227, local620, local163, local56, local61, Static255.method5157(local1450.anIntArray87[local38], arg6[local38] << 24 | this.aClass122_Sub1_1.anInt3850), Static255.method5157(local1450.anIntArray87[local40], arg6[local40] << 24 | this.aClass122_Sub1_1.anInt3850), Static255.method5157(local1450.anIntArray87[local42], arg6[local42] << 24 | this.aClass122_Sub1_1.anInt3850));
									}
								} else if (local1954 != -1) {
									arg3.method2105(local222, local227, local620, local163, local56, local61, local1450.anIntArray87[local38], local1450.anIntArray87[local40], local1450.anIntArray87[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1954);
								} else if ((local1450.anIntArray87[local38] & 0xFFFFFF) != 0) {
									arg3.method2097(local222, local227, local620, local163, local56, local61, local1450.anIntArray87[local38], local1450.anIntArray87[local40], local1450.anIntArray87[local42]);
								}
								arg3.anInt2580 = 0;
							} else {
								arg3.method2106(local222, local227, local620, local163, local56, local61, this.aClass122_Sub1_1.anInt3850);
							}
						}
					}
					return;
				}
				for (local283 = 0; local283 < local1450.aShort10; local283++) {
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
						arg3.aBoolean145 = local244 < 0 || local300 < 0 || local356 < 0 || local244 > arg3.anInt2577 || local300 > arg3.anInt2577 || local356 > arg3.anInt2577;
						if (local384 >= 765) {
							arg3.method2106(local412, local272, local328, local244, local300, local356, this.aClass122_Sub1_1.anInt3850);
						} else if (local384 > 0) {
							if ((local1450.anIntArray87[local339] & 0xFFFFFF) != 0) {
								arg3.method2097(local412, local272, local328, local244, local300, local356, Static308.method5181(arg6[local339], this.aClass122_Sub1_1.anInt3850, local1450.anIntArray87[local339]), Static308.method5181(arg6[local395], this.aClass122_Sub1_1.anInt3850, local1450.anIntArray87[local395]), Static308.method5181(arg6[local451], this.aClass122_Sub1_1.anInt3850, local1450.anIntArray87[local451]));
							}
						} else if ((local1450.anIntArray87[local339] & 0xFFFFFF) != 0) {
							arg3.method2097(local412, local272, local328, local244, local300, local356, local1450.anIntArray87[local339], local1450.anIntArray87[local395], local1450.anIntArray87[local451]);
						}
					}
				}
			}
		} else if ((local6.aByte41 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt603;
			@Pc(24) int local24 = local19 + this.anInt603;
			local29 = arg1 * this.anInt603;
			@Pc(34) int local34 = local29 + this.anInt603;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte41 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray3[arg0][arg1];
				local61 = this.anIntArrayArray3[arg0 + 1][arg1];
				local222 = this.anIntArrayArray3[arg0 + 1][arg1 + 1];
				local227 = this.anIntArrayArray3[arg0][arg1 + 1];
				local78 = this.anInt610 + (this.anInt602 * local19 + this.anInt605 * local56 + this.anInt607 * local29 >> 15);
				if (local78 <= this.aClass122_Sub1_1.anInt3847) {
					return;
				}
				local101 = this.anInt610 + (this.anInt602 * local24 + this.anInt605 * local61 + this.anInt607 * local29 >> 15);
				if (local101 <= this.aClass122_Sub1_1.anInt3847) {
					return;
				}
				local124 = this.anInt610 + (this.anInt602 * local24 + this.anInt605 * local222 + this.anInt607 * local34 >> 15);
				if (local124 <= this.aClass122_Sub1_1.anInt3847) {
					return;
				}
				local147 = this.anInt610 + (this.anInt602 * local19 + this.anInt605 * local227 + this.anInt607 * local34 >> 15);
				if (local147 <= this.aClass122_Sub1_1.anInt3847) {
					return;
				}
				if (arg2) {
					local163 = local78 - this.aClass122_Sub1_1.anInt3857;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local36 = local163;
						local620 = this.anIntArrayArray2[arg0][arg1] * local163 / 255;
						if (local620 > 0) {
							local56 -= local620;
						}
					}
					local163 = local101 - this.aClass122_Sub1_1.anInt3857;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local38 = local163;
						local620 = this.anIntArrayArray2[arg0 + 1][arg1] * local163 / 255;
						if (local620 > 0) {
							local61 -= local620;
						}
					}
					local163 = local124 - this.aClass122_Sub1_1.anInt3857;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local40 = local163;
						local620 = this.anIntArrayArray2[arg0 + 1][arg1 + 1] * local163 / 255;
						if (local620 > 0) {
							local222 -= local620;
						}
					}
					local163 = local147 - this.aClass122_Sub1_1.anInt3857;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local42 = local163;
						local620 = this.anIntArrayArray2[arg0][arg1 + 1] * local163 / 255;
						if (local620 > 0) {
							local227 -= local620;
						}
					}
				} else if (this.aClass122_Sub1_1.aBoolean213) {
					local163 = local78 - this.aClass122_Sub1_1.anInt3857;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass122_Sub1_1.anInt3857;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass122_Sub1_1.anInt3857;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass122_Sub1_1.anInt3857;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local244 = this.anInt599 + (this.anInt597 * local19 + this.anInt600 * local56 + this.anInt608 * local29 >> 15);
				local255 = arg3.anInt2579 + local244 * this.aClass122_Sub1_1.anInt3833 / local78;
				local272 = this.anInt611 + (this.anInt606 * local19 + this.anInt609 * local56 + this.anInt598 * local29 >> 15);
				local283 = arg3.anInt2578 + local272 * this.aClass122_Sub1_1.anInt3846 / local78;
				local300 = this.anInt599 + (this.anInt597 * local24 + this.anInt600 * local61 + this.anInt608 * local29 >> 15);
				local311 = arg3.anInt2579 + local300 * this.aClass122_Sub1_1.anInt3833 / local101;
				local328 = this.anInt611 + (this.anInt606 * local24 + this.anInt609 * local61 + this.anInt598 * local29 >> 15);
				local339 = arg3.anInt2578 + local328 * this.aClass122_Sub1_1.anInt3846 / local101;
				local356 = this.anInt599 + (this.anInt597 * local24 + this.anInt600 * local222 + this.anInt608 * local34 >> 15);
				local367 = arg3.anInt2579 + local356 * this.aClass122_Sub1_1.anInt3833 / local124;
				local384 = this.anInt611 + (this.anInt606 * local24 + this.anInt609 * local222 + this.anInt598 * local34 >> 15);
				local395 = arg3.anInt2578 + local384 * this.aClass122_Sub1_1.anInt3846 / local124;
				local412 = this.anInt599 + (this.anInt597 * local19 + this.anInt600 * local227 + this.anInt608 * local34 >> 15);
				local423 = arg3.anInt2579 + local412 * this.aClass122_Sub1_1.anInt3833 / local147;
				local440 = this.anInt611 + (this.anInt606 * local19 + this.anInt609 * local227 + this.anInt598 * local34 >> 15);
				local451 = arg3.anInt2578 + local440 * this.aClass122_Sub1_1.anInt3846 / local147;
			} else {
				local56 = this.anIntArrayArray3[arg0][arg1];
				local61 = this.anInt605 * local56;
				local78 = this.anInt610 + (this.anInt602 * local19 + local61 + this.anInt607 * local29 >> 15);
				if (local78 <= this.aClass122_Sub1_1.anInt3847) {
					return;
				}
				local101 = this.anInt610 + (this.anInt602 * local24 + local61 + this.anInt607 * local29 >> 15);
				if (local101 <= this.aClass122_Sub1_1.anInt3847) {
					return;
				}
				local124 = this.anInt610 + (this.anInt602 * local24 + local61 + this.anInt607 * local34 >> 15);
				if (local124 <= this.aClass122_Sub1_1.anInt3847) {
					return;
				}
				local147 = this.anInt610 + (this.anInt602 * local19 + local61 + this.anInt607 * local34 >> 15);
				if (local147 <= this.aClass122_Sub1_1.anInt3847) {
					return;
				}
				if (this.aClass122_Sub1_1.aBoolean213) {
					local163 = local78 - this.aClass122_Sub1_1.anInt3857;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass122_Sub1_1.anInt3857;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass122_Sub1_1.anInt3857;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass122_Sub1_1.anInt3857;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local222 = this.anInt600 * local56;
				local227 = this.anInt609 * local56;
				local244 = this.anInt599 + (this.anInt597 * local19 + local222 + this.anInt608 * local29 >> 15);
				local255 = arg3.anInt2579 + local244 * this.aClass122_Sub1_1.anInt3833 / local78;
				local272 = this.anInt611 + (this.anInt606 * local19 + local227 + this.anInt598 * local29 >> 15);
				local283 = arg3.anInt2578 + local272 * this.aClass122_Sub1_1.anInt3846 / local78;
				local300 = this.anInt599 + (this.anInt597 * local24 + local222 + this.anInt608 * local29 >> 15);
				local311 = arg3.anInt2579 + local300 * this.aClass122_Sub1_1.anInt3833 / local101;
				local328 = this.anInt611 + (this.anInt606 * local24 + local227 + this.anInt598 * local29 >> 15);
				local339 = arg3.anInt2578 + local328 * this.aClass122_Sub1_1.anInt3846 / local101;
				local356 = this.anInt599 + (this.anInt597 * local24 + local222 + this.anInt608 * local34 >> 15);
				local367 = arg3.anInt2579 + local356 * this.aClass122_Sub1_1.anInt3833 / local124;
				local384 = this.anInt611 + (this.anInt606 * local24 + local227 + this.anInt598 * local34 >> 15);
				local395 = arg3.anInt2578 + local384 * this.aClass122_Sub1_1.anInt3846 / local124;
				local412 = this.anInt599 + (this.anInt597 * local19 + local222 + this.anInt608 * local34 >> 15);
				local423 = arg3.anInt2579 + local412 * this.aClass122_Sub1_1.anInt3833 / local147;
				local440 = this.anInt611 + (this.anInt606 * local19 + local227 + this.anInt598 * local34 >> 15);
				local451 = arg3.anInt2578 + local440 * this.aClass122_Sub1_1.anInt3846 / local147;
			}
			@Pc(1062) boolean local1062 = local6.aShort57 != -1 && this.method474(this.aClass122_Sub1_1.anInterface9_4.method2396(local6.aShort57).aByte57);
			local61 = local38 + local40 + local42;
			if ((local367 - local423) * (local339 - local451) - (local395 - local451) * (local311 - local423) > 0) {
				arg3.aBoolean145 = local367 < 0 || local423 < 0 || local311 < 0 || local367 > arg3.anInt2577 || local423 > arg3.anInt2577 || local311 > arg3.anInt2577;
				if (local61 < 765) {
					if (local1062) {
						arg3.anInt2580 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort57 >= 0) {
							arg3.method2102(local395, local451, local339, local367, local423, local311, this.aClass122_Sub1_1.anInt3850, local40, local42, local38, local6.anInt4012, local6.anInt4009, local6.anInt4011, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort57);
						} else {
							arg3.method2097(local395, local451, local339, local367, local423, local311, Static255.method5157(local6.anInt4012, local40 << 24 | this.aClass122_Sub1_1.anInt3850), Static255.method5157(local6.anInt4009, local42 << 24 | this.aClass122_Sub1_1.anInt3850), Static255.method5157(local6.anInt4011, local38 << 24 | this.aClass122_Sub1_1.anInt3850));
						}
					} else if (local6.aShort57 >= 0) {
						arg3.method2105(local395, local451, local339, local367, local423, local311, local6.anInt4012, local6.anInt4009, local6.anInt4011, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort57);
					} else {
						arg3.method2097(local395, local451, local339, local367, local423, local311, local6.anInt4012, local6.anInt4009, local6.anInt4011);
					}
					arg3.anInt2580 = 0;
				} else {
					arg3.method2106(local395, local451, local339, local367, local423, local311, this.aClass122_Sub1_1.anInt3850);
				}
			}
			local61 = local36 + local38 + local42;
			if ((local255 - local311) * (local451 - local339) - (local283 - local339) * (local423 - local311) > 0) {
				arg3.aBoolean145 = local255 < 0 || local311 < 0 || local423 < 0 || local255 > arg3.anInt2577 || local311 > arg3.anInt2577 || local423 > arg3.anInt2577;
				if (local61 < 765) {
					if (local1062) {
						arg3.anInt2580 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort57 >= 0) {
							arg3.method2102(local283, local339, local451, local255, local311, local423, this.aClass122_Sub1_1.anInt3850, local36, local38, local42, local6.anInt4013, local6.anInt4011, local6.anInt4009, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort57);
						} else {
							arg3.method2097(local283, local339, local451, local255, local311, local423, Static255.method5157(local6.anInt4013, local36 << 24 | this.aClass122_Sub1_1.anInt3850), Static255.method5157(local6.anInt4011, local38 << 24 | this.aClass122_Sub1_1.anInt3850), Static255.method5157(local6.anInt4009, local42 << 24 | this.aClass122_Sub1_1.anInt3850));
						}
					} else if (local6.aShort57 >= 0) {
						arg3.method2105(local283, local339, local451, local255, local311, local423, local6.anInt4013, local6.anInt4011, local6.anInt4009, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort57);
					} else {
						arg3.method2097(local283, local339, local451, local255, local311, local423, local6.anInt4013, local6.anInt4011, local6.anInt4009);
					}
					arg3.anInt2580 = 0;
					return;
				}
				arg3.method2106(local283, local339, local451, local255, local311, local423, this.aClass122_Sub1_1.anInt3850);
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(Lclient!c;IIIIZ)V")
	@Override
	public void method4676(@OriginalArg(0) Class3_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!dn;[I)V")
	@Override
	public void method4680(@OriginalArg(0) Class3_Sub13 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILclient!c;)Lclient!c;")
	@Override
	public Class3_Sub7_Sub3 method4665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub7_Sub3 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILclient!ho;[I[I[I)V")
	private void method478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class85 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class139 local6 = this.aClass139ArrayArray1[arg0][arg1];
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
			@Pc(996) Class12 local996 = this.aClass12ArrayArray1[arg0][arg1];
			if (local996 != null) {
				for (local349 = 0; local349 < local996.aShort2; local349++) {
					local24 = local996.anIntArray11[local349];
					local29 = local996.anIntArray12[local349];
					local34 = local996.anIntArray15[local349];
					local293 = this.anInt610 + (this.anInt602 * local24 + this.anInt605 * local29 + this.anInt607 * local34 >> 15);
					if (local293 <= this.aClass122_Sub1_1.anInt3847) {
						return;
					}
					local181 = this.anInt599 + (this.anInt597 * local24 + this.anInt600 * local29 + this.anInt608 * local34 >> 15);
					local237 = this.anInt611 + (this.anInt606 * local24 + this.anInt609 * local29 + this.anInt598 * local34 >> 15);
					arg3[local349] = arg2.anInt2579 + local181 * this.aClass122_Sub1_1.anInt3833 / local293;
					arg4[local349] = arg2.anInt2578 + local237 * this.aClass122_Sub1_1.anInt3846 / local293;
				}
				if (local996.aShortArray9 != null) {
					local209 = this.anIntArrayArray3[arg0][arg1];
					local265 = this.anIntArrayArray3[arg0 + 1][arg1];
					local321 = this.anIntArrayArray3[arg0][arg1 + 1];
					local377 = arg0 * this.anInt603;
					local170 = local377 + this.anInt603;
					local226 = arg1 * this.anInt603;
					local282 = local226 + this.anInt603;
					local338 = this.anInt599 + (this.anInt597 * local377 + this.anInt600 * local209 + this.anInt608 * local226 >> 15);
					local198 = this.anInt611 + (this.anInt606 * local377 + this.anInt609 * local209 + this.anInt598 * local226 >> 15);
					local254 = this.anInt610 + (this.anInt602 * local377 + this.anInt605 * local209 + this.anInt607 * local226 >> 15);
					local310 = this.anInt599 + (this.anInt597 * local170 + this.anInt600 * local265 + this.anInt608 * local226 >> 15);
					local366 = this.anInt611 + (this.anInt606 * local170 + this.anInt609 * local265 + this.anInt598 * local226 >> 15);
					local68 = this.anInt610 + (this.anInt602 * local170 + this.anInt605 * local265 + this.anInt607 * local226 >> 15);
					local91 = this.anInt599 + (this.anInt597 * local377 + this.anInt600 * local321 + this.anInt608 * local282 >> 15);
					local114 = this.anInt611 + (this.anInt606 * local377 + this.anInt609 * local321 + this.anInt598 * local282 >> 15);
					local137 = this.anInt610 + (this.anInt602 * local377 + this.anInt605 * local321 + this.anInt607 * local282 >> 15);
					for (local46 = 0; local46 < local996.aShort3; local46++) {
						@Pc(1349) short local1349 = local996.aShortArray10[local46];
						@Pc(1354) short local1354 = local996.aShortArray11[local46];
						@Pc(1359) short local1359 = local996.aShortArray12[local46];
						@Pc(1363) int local1363 = arg3[local1349];
						@Pc(1367) int local1367 = arg3[local1354];
						@Pc(1371) int local1371 = arg3[local1359];
						@Pc(1375) int local1375 = arg4[local1349];
						@Pc(1379) int local1379 = arg4[local1354];
						@Pc(1383) int local1383 = arg4[local1359];
						if ((local1363 - local1367) * (local1383 - local1379) - (local1375 - local1379) * (local1371 - local1367) > 0) {
							arg2.aBoolean145 = local1363 < 0 || local1367 < 0 || local1371 < 0 || local1363 > arg2.anInt2577 || local1367 > arg2.anInt2577 || local1371 > arg2.anInt2577;
							@Pc(1427) short local1427 = local996.aShortArray9[local46];
							if (local1427 == -1) {
								@Pc(1482) int local1482 = local996.anIntArray14[local46];
								if (local1482 != -1) {
									arg2.method2109(local1375, local1379, local1383, local1363, local1367, local1371, Static152.method2448(local996.aShortArray13[local1349], local1482), Static152.method2448(local996.aShortArray13[local1354], local1482), Static152.method2448(local996.aShortArray13[local1359], local1482));
								}
							} else {
								if (this.method474(this.aClass122_Sub1_1.anInterface9_4.method2396(local1427).aByte57)) {
									arg2.anInt2580 = 100;
								}
								arg2.method2105(local1375, local1379, local1383, local1363, local1367, local1371, local996.aShortArray13[local1349], local996.aShortArray13[local1354], local996.aShortArray13[local1359], local338, local310, local91, local198, local366, local114, local254, local68, local137, local1427);
								arg2.anInt2580 = 0;
							}
						}
					}
					return;
				}
				for (local209 = 0; local209 < local996.aShort3; local209++) {
					@Pc(1528) short local1528 = local996.aShortArray10[local209];
					@Pc(1533) short local1533 = local996.aShortArray11[local209];
					@Pc(1538) short local1538 = local996.aShortArray12[local209];
					local170 = arg3[local1528];
					local226 = arg3[local1533];
					local282 = arg3[local1538];
					local338 = arg4[local1528];
					local198 = arg4[local1533];
					local254 = arg4[local1538];
					if ((local170 - local226) * (local254 - local198) - (local338 - local198) * (local282 - local226) > 0) {
						local310 = local996.anIntArray14[local209];
						if (local310 != -1) {
							arg2.aBoolean145 = local170 < 0 || local226 < 0 || local282 < 0 || local170 > arg2.anInt2577 || local226 > arg2.anInt2577 || local282 > arg2.anInt2577;
							arg2.method2109(local338, local198, local254, local170, local226, local282, Static152.method2448(local996.aShortArray13[local1528], local310), Static152.method2448(local996.aShortArray13[local1533], local310), Static152.method2448(local996.aShortArray13[local1538], local310));
						}
					}
				}
			}
		} else if ((local6.aByte42 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt603;
			local24 = local19 + this.anInt603;
			local29 = arg1 * this.anInt603;
			local34 = local29 + this.anInt603;
			@Pc(51) int local51;
			@Pc(148) int local148;
			@Pc(153) int local153;
			if ((local6.aByte42 & 0x1) == 0) {
				local46 = this.anIntArrayArray3[arg0][arg1];
				local51 = this.anIntArrayArray3[arg0 + 1][arg1];
				local148 = this.anIntArrayArray3[arg0 + 1][arg1 + 1];
				local153 = this.anIntArrayArray3[arg0][arg1 + 1];
				local68 = this.anInt610 + (this.anInt602 * local19 + this.anInt605 * local46 + this.anInt607 * local29 >> 15);
				if (local68 <= this.aClass122_Sub1_1.anInt3847) {
					return;
				}
				local91 = this.anInt610 + (this.anInt602 * local24 + this.anInt605 * local51 + this.anInt607 * local29 >> 15);
				if (local91 <= this.aClass122_Sub1_1.anInt3847) {
					return;
				}
				local114 = this.anInt610 + (this.anInt602 * local24 + this.anInt605 * local148 + this.anInt607 * local34 >> 15);
				if (local114 <= this.aClass122_Sub1_1.anInt3847) {
					return;
				}
				local137 = this.anInt610 + (this.anInt602 * local19 + this.anInt605 * local153 + this.anInt607 * local34 >> 15);
				if (local137 <= this.aClass122_Sub1_1.anInt3847) {
					return;
				}
				local170 = this.anInt599 + (this.anInt597 * local19 + this.anInt600 * local46 + this.anInt608 * local29 >> 15);
				local181 = arg2.anInt2579 + local170 * this.aClass122_Sub1_1.anInt3833 / local68;
				local198 = this.anInt611 + (this.anInt606 * local19 + this.anInt609 * local46 + this.anInt598 * local29 >> 15);
				local209 = arg2.anInt2578 + local198 * this.aClass122_Sub1_1.anInt3846 / local68;
				local226 = this.anInt599 + (this.anInt597 * local24 + this.anInt600 * local51 + this.anInt608 * local29 >> 15);
				local237 = arg2.anInt2579 + local226 * this.aClass122_Sub1_1.anInt3833 / local91;
				local254 = this.anInt611 + (this.anInt606 * local24 + this.anInt609 * local51 + this.anInt598 * local29 >> 15);
				local265 = arg2.anInt2578 + local254 * this.aClass122_Sub1_1.anInt3846 / local91;
				local282 = this.anInt599 + (this.anInt597 * local24 + this.anInt600 * local148 + this.anInt608 * local34 >> 15);
				local293 = arg2.anInt2579 + local282 * this.aClass122_Sub1_1.anInt3833 / local114;
				local310 = this.anInt611 + (this.anInt606 * local24 + this.anInt609 * local148 + this.anInt598 * local34 >> 15);
				local321 = arg2.anInt2578 + local310 * this.aClass122_Sub1_1.anInt3846 / local114;
				local338 = this.anInt599 + (this.anInt597 * local19 + this.anInt600 * local153 + this.anInt608 * local34 >> 15);
				local349 = arg2.anInt2579 + local338 * this.aClass122_Sub1_1.anInt3833 / local137;
				local366 = this.anInt611 + (this.anInt606 * local19 + this.anInt609 * local153 + this.anInt598 * local34 >> 15);
				local377 = arg2.anInt2578 + local366 * this.aClass122_Sub1_1.anInt3846 / local137;
			} else {
				local46 = this.anIntArrayArray3[arg0][arg1];
				local51 = this.anInt605 * local46;
				local68 = this.anInt610 + (this.anInt602 * local19 + local51 + this.anInt607 * local29 >> 15);
				if (local68 <= this.aClass122_Sub1_1.anInt3847) {
					return;
				}
				local91 = this.anInt610 + (this.anInt602 * local24 + local51 + this.anInt607 * local29 >> 15);
				if (local91 <= this.aClass122_Sub1_1.anInt3847) {
					return;
				}
				local114 = this.anInt610 + (this.anInt602 * local24 + local51 + this.anInt607 * local34 >> 15);
				if (local114 <= this.aClass122_Sub1_1.anInt3847) {
					return;
				}
				local137 = this.anInt610 + (this.anInt602 * local19 + local51 + this.anInt607 * local34 >> 15);
				if (local137 <= this.aClass122_Sub1_1.anInt3847) {
					return;
				}
				local148 = this.anInt600 * local46;
				local153 = this.anInt609 * local46;
				local170 = this.anInt599 + (this.anInt597 * local19 + local148 + this.anInt608 * local29 >> 15);
				local181 = arg2.anInt2579 + local170 * this.aClass122_Sub1_1.anInt3833 / local68;
				local198 = this.anInt611 + (this.anInt606 * local19 + local153 + this.anInt598 * local29 >> 15);
				local209 = arg2.anInt2578 + local198 * this.aClass122_Sub1_1.anInt3846 / local68;
				local226 = this.anInt599 + (this.anInt597 * local24 + local148 + this.anInt608 * local29 >> 15);
				local237 = arg2.anInt2579 + local226 * this.aClass122_Sub1_1.anInt3833 / local91;
				local254 = this.anInt611 + (this.anInt606 * local24 + local153 + this.anInt598 * local29 >> 15);
				local265 = arg2.anInt2578 + local254 * this.aClass122_Sub1_1.anInt3846 / local91;
				local282 = this.anInt599 + (this.anInt597 * local24 + local148 + this.anInt608 * local34 >> 15);
				local293 = arg2.anInt2579 + local282 * this.aClass122_Sub1_1.anInt3833 / local114;
				local310 = this.anInt611 + (this.anInt606 * local24 + local153 + this.anInt598 * local34 >> 15);
				local321 = arg2.anInt2578 + local310 * this.aClass122_Sub1_1.anInt3846 / local114;
				local338 = this.anInt599 + (this.anInt597 * local19 + local148 + this.anInt608 * local34 >> 15);
				local349 = arg2.anInt2579 + local338 * this.aClass122_Sub1_1.anInt3833 / local137;
				local366 = this.anInt611 + (this.anInt606 * local19 + local153 + this.anInt598 * local34 >> 15);
				local377 = arg2.anInt2578 + local366 * this.aClass122_Sub1_1.anInt3846 / local137;
			}
			if ((local293 - local349) * (local265 - local377) - (local321 - local377) * (local237 - local349) > 0) {
				arg2.aBoolean145 = local293 < 0 || local349 < 0 || local237 < 0 || local293 > arg2.anInt2577 || local349 > arg2.anInt2577 || local237 > arg2.anInt2577;
				if (local6.aShort63 >= 0) {
					if (this.method474(this.aClass122_Sub1_1.anInterface9_4.method2396(local6.aShort63).aByte57)) {
						arg2.anInt2580 = 100;
					}
					arg2.method2105(local321, local377, local265, local293, local349, local237, local6.aShort59 & 0xFFFF, local6.aShort60 & 0xFFFF, local6.aShort62 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort63);
					arg2.anInt2580 = 0;
				} else {
					arg2.method2109(local321, local377, local265, local293, local349, local237, local6.aShort59 & 0xFFFF, local6.aShort60 & 0xFFFF, local6.aShort62 & 0xFFFF);
				}
			}
			if ((local181 - local237) * (local377 - local265) - (local209 - local265) * (local349 - local237) > 0) {
				arg2.aBoolean145 = local181 < 0 || local237 < 0 || local349 < 0 || local181 > arg2.anInt2577 || local237 > arg2.anInt2577 || local349 > arg2.anInt2577;
				if (local6.aShort63 >= 0) {
					if (this.method474(this.aClass122_Sub1_1.anInterface9_4.method2396(local6.aShort63).aByte57)) {
						arg2.anInt2580 = 100;
					}
					arg2.method2105(local209, local265, local377, local181, local237, local349, local6.aShort61 & 0xFFFF, local6.aShort62 & 0xFFFF, local6.aShort60 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort63);
					arg2.anInt2580 = 0;
					return;
				}
				arg2.method2109(local209, local265, local377, local181, local237, local349, local6.aShort61 & 0xFFFF, local6.aShort62 & 0xFFFF, local6.aShort60 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(IIIIIII[[ZLclient!ho;[I[I)V")
	private void method479(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class85 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean146 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass134ArrayArray1[local22][local25] != null) {
						@Pc(50) Class134 local50 = this.aClass134ArrayArray1[local22][local25];
						if (local50.aShort57 != -1 && (local50.aByte41 & 0x2) == 0 && local50.anInt4010 == 0) {
							local68 = this.aClass122_Sub1_1.method3220(local50.aShort57);
							arg5.method2109(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static152.method2448(local50.anInt4012, local68), Static152.method2448(local50.anInt4009, local68), Static152.method2448(local50.anInt4011, local68));
							arg5.method2109(local20, local20, local20 - 4, local16, local16 + 4, local16, Static152.method2448(local50.anInt4013, local68), Static152.method2448(local50.anInt4011, local68), Static152.method2448(local50.anInt4009, local68));
						} else if (local50.anInt4010 == 0) {
							arg5.method2097(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt4012, local50.anInt4009, local50.anInt4011);
							arg5.method2097(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt4013, local50.anInt4011, local50.anInt4009);
						} else {
							local68 = local50.anInt4010;
							arg5.method2097(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static255.method5157(local68, local50.anInt4012 & 0xFF000000), Static255.method5157(local68, local50.anInt4009 & 0xFF000000), Static255.method5157(local68, local50.anInt4011 & 0xFF000000));
							arg5.method2097(local20, local20, local20 - 4, local16, local16 + 4, local16, Static255.method5157(local68, local50.anInt4013 & 0xFF000000), Static255.method5157(local68, local50.anInt4011 & 0xFF000000), Static255.method5157(local68, local50.anInt4009 & 0xFF000000));
						}
					} else if (this.aClass50ArrayArray1[local22][local25] != null) {
						@Pc(259) Class50 local259 = this.aClass50ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort11; local68++) {
							arg6[local68] = local16 + (local259.aShortArray53[local68] - local22 * this.anInt603) * 4 / this.anInt603;
							arg7[local68] = local20 - (local259.aShortArray52[local68] - local25 * this.anInt603) * 4 / this.anInt603;
						}
						for (@Pc(307) int local307 = 0; local307 < local259.aShort10; local307++) {
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
							if (local259.anIntArray88 != null && local259.anIntArray88[local307] != 0 && (local259.aShortArray48 == null || local259.aShortArray48 != null && local259.aShortArray48[local307] == -1)) {
								local369 = local259.anIntArray88[local307];
								arg5.method2097(local336, local340, local344, local324, local328, local332, Static255.method5157(local369, -(local259.anIntArray87[local312] & -16777216) - 16777216), Static255.method5157(local369, -(local259.anIntArray87[local316] & -16777216) - 16777216), Static255.method5157(local369, -(local259.anIntArray87[local320] & -16777216) - 16777216));
							} else if (local259.aShortArray48 == null || local259.aShortArray48[local307] == -1) {
								arg5.method2097(local336, local340, local344, local324, local328, local332, local259.anIntArray87[local312], local259.anIntArray87[local316], local259.anIntArray87[local320]);
							} else {
								local369 = this.aClass122_Sub1_1.method3220(local259.aShortArray48[local307]);
								arg5.method2109(local336, local340, local344, local324, local328, local332, local369, local369, local369);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean146 = true;
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(Lclient!c;IIIIZ)Z")
	@Override
	public boolean method4677(@OriginalArg(0) Class3_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method4669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class56_Sub1 local3 = this.aClass122_Sub1_1.aClass56_Sub1_1;
		this.anInt597 = local3.anInt1593;
		this.anInt600 = local3.anInt1590;
		this.anInt608 = local3.anInt1588;
		this.anInt599 = local3.anInt1584;
		this.anInt606 = local3.anInt1586;
		this.anInt609 = local3.anInt1591;
		this.anInt598 = local3.anInt1589;
		this.anInt611 = local3.anInt1587;
		this.anInt602 = local3.anInt1592;
		this.anInt605 = local3.anInt1585;
		this.anInt607 = local3.anInt1594;
		this.anInt610 = local3.anInt1595;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method4666(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class129 local4 = this.aClass122_Sub1_1.method3217(Thread.currentThread());
		@Pc(7) Class85 local7 = local4.aClass85_2;
		local7.anInt2580 = 0;
		local7.aBoolean145 = false;
		if (this.aClass134ArrayArray1 != null) {
			this.method479(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray325, local4.anIntArray330);
		} else if (this.aClass139ArrayArray1 != null) {
			this.method475(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray325, local4.anIntArray330);
		}
	}
}
