import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class165_Sub1 extends Class165 {

	@OriginalMember(owner = "client!mu", name = "j", descriptor = "I")
	private int anInt4417;

	@OriginalMember(owner = "client!mu", name = "k", descriptor = "[[Lclient!oq;")
	private Class183[][] aClass183ArrayArray1;

	@OriginalMember(owner = "client!mu", name = "m", descriptor = "[[Lclient!nf;")
	private Class166[][] aClass166ArrayArray1;

	@OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
	private int anInt4418;

	@OriginalMember(owner = "client!mu", name = "o", descriptor = "I")
	private int anInt4419;

	@OriginalMember(owner = "client!mu", name = "p", descriptor = "I")
	private int anInt4420;

	@OriginalMember(owner = "client!mu", name = "q", descriptor = "I")
	private int anInt4421;

	@OriginalMember(owner = "client!mu", name = "r", descriptor = "I")
	private int anInt4422;

	@OriginalMember(owner = "client!mu", name = "t", descriptor = "I")
	private int anInt4424;

	@OriginalMember(owner = "client!mu", name = "v", descriptor = "I")
	private int anInt4426;

	@OriginalMember(owner = "client!mu", name = "w", descriptor = "[[Lclient!ci;")
	private Class41[][] aClass41ArrayArray1;

	@OriginalMember(owner = "client!mu", name = "z", descriptor = "I")
	private int anInt4427;

	@OriginalMember(owner = "client!mu", name = "A", descriptor = "I")
	private int anInt4428;

	@OriginalMember(owner = "client!mu", name = "B", descriptor = "I")
	private int anInt4429;

	@OriginalMember(owner = "client!mu", name = "C", descriptor = "I")
	private int anInt4430;

	@OriginalMember(owner = "client!mu", name = "E", descriptor = "[[Lclient!vu;")
	private Class262[][] aClass262ArrayArray1;

	@OriginalMember(owner = "client!mu", name = "s", descriptor = "I")
	private int anInt4423 = -1;

	@OriginalMember(owner = "client!mu", name = "y", descriptor = "Lclient!dg;")
	private final Class51_Sub1 aClass51_Sub1_10;

	@OriginalMember(owner = "client!mu", name = "u", descriptor = "I")
	private final int anInt4425;

	@OriginalMember(owner = "client!mu", name = "l", descriptor = "[[I")
	public final int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!mu", name = "D", descriptor = "[[B")
	private byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!mu", name = "x", descriptor = "[[B")
	private byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!dg;IIII[[I[[II)V")
	public Class165_Sub1(@OriginalArg(0) Class51_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass51_Sub1_10 = arg0;
		this.anInt4425 = arg2;
		this.anIntArrayArray37 = arg5;
		this.aByteArrayArray18 = new byte[arg3 + 1][arg4 + 1];
		@Pc(31) int local31 = this.aClass51_Sub1_10.anInt1289 >> 9;
		for (@Pc(33) int local33 = 1; local33 < arg4; local33++) {
			for (@Pc(36) int local36 = 1; local36 < arg3; local36++) {
				@Pc(55) int local55 = arg6[local36 + 1][local33] - arg6[local36 - 1][local33];
				@Pc(71) int local71 = arg6[local36][local33 + 1] - arg6[local36][local33 - 1];
				@Pc(86) int local86 = (int) Math.sqrt((double) (local55 * local55 + arg7 * 512 + local71 * local71));
				@Pc(92) int local92 = (local55 << 8) / local86;
				@Pc(98) int local98 = arg7 * -512 / local86;
				@Pc(104) int local104 = (local71 << 8) / local86;
				@Pc(126) int local126 = local31 + (this.aClass51_Sub1_10.anInt1277 * local92 + this.aClass51_Sub1_10.anInt1272 * local98 + this.aClass51_Sub1_10.anInt1292 * local104 >> 17);
				local126 >>= 0x1;
				if (local126 < 2) {
					local126 = 2;
				} else if (local126 > 126) {
					local126 = 126;
				}
				this.aByteArrayArray18[local36][local33] = (byte) local126;
			}
		}
		this.aByteArrayArray17 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!mu", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass262ArrayArray1 == null) {
			this.aClass262ArrayArray1 = new Class262[super.anInt4489][super.anInt4490];
			this.aClass41ArrayArray1 = new Class41[super.anInt4489][super.anInt4490];
		} else if (this.aClass183ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static434.anIntArray609[Static86.method1478(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static434.anIntArray609[Static86.method1478(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == super.anInt4485 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt4485 && arg4[local116] == super.anInt4485) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt4485) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt4485 && arg2[local244] != arg2[0] - super.anInt4485) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt4485 && arg4[local244] != arg4[0] - super.anInt4485) {
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
			@Pc(334) Class262 local334 = new Class262();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt7301 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte100 = (byte) (local334.aByte100 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray37[arg0][arg1] == this.anIntArrayArray37[arg0 + 1][arg1] && this.anIntArrayArray37[arg0][arg1] == this.anIntArrayArray37[arg0 + 1][arg1 + 1] && this.anIntArrayArray37[arg0][arg1] == this.anIntArrayArray37[arg0][arg1 + 1]) {
				local334.aByte100 = (byte) (local334.aByte100 | 0x1);
			}
			if (local342 == -1 || (local334.aByte100 & 0x2) != 0 || this.aClass51_Sub1_10.anInterface4_8.method3138(local342).aBoolean360) {
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
				local334.anInt7303 = Static264.method3568(Static463.method3529(arg6[local104] >> 8, this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray17[arg0][arg1]), local527, arg10);
				if (local334.anInt7301 != 0) {
					local334.anInt7303 |= this.aByteArrayArray17[arg0][arg1] + 255 - this.aByteArrayArray18[arg0][arg1] << 25;
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
				local334.anInt7302 = Static264.method3568(Static463.method3529(arg6[local106] >> 8, this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray17[arg0 + 1][arg1]), local527, arg10);
				if (local334.anInt7301 != 0) {
					local334.anInt7302 |= this.aByteArrayArray17[arg0 + 1][arg1] + 255 - this.aByteArrayArray18[arg0 + 1][arg1] << 25;
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
				local334.anInt7304 = Static264.method3568(Static463.method3529(arg6[local108] >> 8, this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray17[arg0 + 1][arg1 + 1]), local527, arg10);
				if (local334.anInt7301 != 0) {
					local334.anInt7304 |= this.aByteArrayArray17[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray18[arg0 + 1][arg1 + 1] << 25;
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
				local334.anInt7300 = Static264.method3568(Static463.method3529(arg6[local110] >> 8, this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray17[arg0][arg1 + 1]), local527, arg10);
				if (local334.anInt7301 != 0) {
					local334.anInt7300 |= this.aByteArrayArray17[arg0][arg1 + 1] + 255 - this.aByteArrayArray18[arg0][arg1 + 1] << 25;
				}
				local334.aShort97 = -1;
			} else {
				local334.anInt7303 = this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray17[arg0][arg1];
				local334.anInt7302 = this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray17[arg0 + 1][arg1];
				local334.anInt7304 = this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray17[arg0 + 1][arg1 + 1];
				local334.anInt7300 = this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray17[arg0][arg1 + 1];
				local334.aShort97 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort98 = (short) arg5[local108];
				local334.aShort100 = (short) arg5[local110];
				local334.aShort99 = (short) arg5[local106];
				local334.aShort96 = (short) arg5[local104];
			}
			this.aClass262ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class41 local888 = new Class41();
		local888.aShort13 = (short) arg2.length;
		local888.aShort14 = (short) (arg2.length / 3);
		local888.aShortArray13 = new short[local888.aShort13];
		local888.aShortArray14 = new short[local888.aShort13];
		local888.aShortArray11 = new short[local888.aShort13];
		local888.anIntArray71 = new int[local888.aShort13];
		if (arg5 != null) {
			local888.aShortArray10 = new short[local888.aShort13];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort13; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray17[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt4485) {
				local958 = this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray17[arg0][arg1 + 1];
			} else if (local342 == super.anInt4485 && local527 == super.anInt4485) {
				local958 = this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray17[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt4485 && local527 == 0) {
				local958 = this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray17[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray17[arg0][arg1]) * (super.anInt4485 - local342) + (this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray17[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray17[arg0][arg1 + 1]) * (super.anInt4485 - local342) + (this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray17[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt4485 - local527) + local1126 * local527 >> super.anInt4488 * 2;
			}
			local1079 = (arg0 << super.anInt4488) + local342;
			local1126 = (arg1 << super.anInt4488) + local527;
			local888.aShortArray13[local244] = (short) local342;
			local888.aShortArray11[local244] = (short) local527;
			local888.aShortArray14[local244] = (short) (this.a(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass51_Sub1_10.anInterface4_8.method3138(arg8[local244]).aBoolean360) {
				local888.anIntArray71[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray10[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray71[local244] = Static264.method3568(Static463.method3529(arg6[local244] >> 8, local958), local1226, arg10);
				if (arg7 != null) {
					local888.anIntArray71[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray71[local244] = 0;
			} else {
				local888.anIntArray71[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort14; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass51_Sub1_10.anInterface4_8.method3138(arg8[local527 * 3]).aBoolean360) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray72 = new int[local888.aShort14];
		}
		if (local1296) {
			local888.aShortArray12 = new short[local888.aShort14];
			local888.aShortArray15 = new short[local888.aShort14];
		}
		for (local958 = 0; local958 < local888.aShort14; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray72[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass51_Sub1_10.anInterface4_8.method3138(local1384).aBoolean360) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass51_Sub1_10.anInterface4_8.method3138(local1384).aBoolean360) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass51_Sub1_10.anInterface4_8.method3138(local1384).aBoolean360) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray12[local958] = (short) local1384;
					local888.aShortArray15[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass51_Sub1_10.anInterface4_8.method3138(local1384).aBoolean360) {
							local888.anIntArray71[local1079] = Static434.anIntArray609[Static86.method1478(this.aClass51_Sub1_10.anInterface4_8.method3138(local1384).aShort67 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass51_Sub1_10.anInterface4_8.method3138(local1384).aBoolean360) {
							local888.anIntArray71[local1126] = Static434.anIntArray609[Static86.method1478(this.aClass51_Sub1_10.anInterface4_8.method3138(local1384).aShort67 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass51_Sub1_10.anInterface4_8.method3138(local1384).aBoolean360) {
							local888.anIntArray71[local1226] = Static434.anIntArray609[Static86.method1478(this.aClass51_Sub1_10.anInterface4_8.method3138(local1384).aShort67 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray12[local958] = -1;
				}
			}
		}
		this.aClass41ArrayArray1[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!mu", name = "p", descriptor = "(Lclient!ba;IIIIZ)V")
	@Override
	public void p(@OriginalArg(0) Class7_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(Lclient!ba;IIIIZ)V")
	@Override
	public void b(@OriginalArg(0) Class7_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)I")
	@Override
	public int a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> super.anInt4488;
		@Pc(9) int local9 = arg1 >> super.anInt4488;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt4489 - 1 || local9 > super.anInt4490 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & super.anInt4485 - 1;
		@Pc(41) int local41 = arg1 & super.anInt4485 - 1;
		@Pc(67) int local67 = this.anIntArrayArray37[local4][local9] * (super.anInt4485 - local34) + this.anIntArrayArray37[local4 + 1][local9] * local34 >> super.anInt4488;
		@Pc(97) int local97 = this.anIntArrayArray37[local4][local9 + 1] * (super.anInt4485 - local34) + this.anIntArrayArray37[local4 + 1][local9 + 1] * local34 >> super.anInt4488;
		return local67 * (super.anInt4485 - local41) + local97 * local41 >> super.anInt4488;
	}

	@OriginalMember(owner = "client!mu", name = "ca", descriptor = "()V")
	@Override
	public void ca() {
		this.aByteArrayArray18 = null;
		this.aByteArrayArray17 = null;
	}

	@OriginalMember(owner = "client!mu", name = "i", descriptor = "(III)V")
	@Override
	public void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray17[arg0][arg1] < arg2) {
			this.aByteArrayArray17[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method3582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass183ArrayArray1 == null) {
			this.aClass183ArrayArray1 = new Class183[super.anInt4489][super.anInt4490];
			this.aClass166ArrayArray1 = new Class166[super.anInt4489][super.anInt4490];
		} else if (this.aClass262ArrayArray1 != null) {
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
				if (local64 != 0 && local64 != super.anInt4485 || local70 != 0 && local70 != super.anInt4485) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class166 local95 = new Class166();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort55 = local99;
			local95.aShortArray78 = new short[local99];
			local95.aShortArray79 = new short[local99];
			local95.aShortArray82 = new short[local99];
			local95.aShortArray77 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray78[local124] = (short) (this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray17[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt4485) {
					local95.aShortArray78[local124] = (short) (this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray17[arg0][arg1 + 1]);
				} else if (local129 == super.anInt4485 && local133 == super.anInt4485) {
					local95.aShortArray78[local124] = (short) (this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray17[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt4485 && local133 == 0) {
					local95.aShortArray78[local124] = (short) (this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray17[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray17[arg0][arg1]) * (super.anInt4485 - local129) + (this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray17[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray17[arg0][arg1 + 1]) * (super.anInt4485 - local129) + (this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray17[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray78[local124] = (short) (local288 * (super.anInt4485 - local133) + local335 * local133 >> super.anInt4488 * 2);
				}
				local288 = (arg0 << super.anInt4488) + local129;
				local335 = (arg1 << super.anInt4488) + local133;
				local95.aShortArray79[local124] = (short) local129;
				local95.aShortArray77[local124] = (short) local133;
				local95.aShortArray82[local124] = (short) (this.a(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray78[local124] < 2) {
					local95.aShortArray78[local124] = 2;
				}
			}
			@Pc(415) boolean local415 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass51_Sub1_10.anInterface4_8.method3138(arg11[local288]).aBoolean360) {
					local415 = true;
				}
			}
			local95.anIntArray412 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray413 = new int[local133];
			}
			local95.aShortArray84 = new short[local133];
			local95.aShortArray83 = new short[local133];
			local95.aShortArray81 = new short[local133];
			if (local415) {
				local95.aShortArray80 = new short[local133];
				local95.aShortArray85 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray412[local95.aShort54] = Static86.method1478(arg9[local335]);
					} else {
						local95.anIntArray412[local95.aShort54] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray413[local95.aShort54] = -1;
						} else {
							local95.anIntArray413[local95.aShort54] = Static86.method1478(arg10[local335]);
						}
					}
					local95.aShortArray84[local95.aShort54] = (short) arg6[local335];
					local95.aShortArray83[local95.aShort54] = (short) arg7[local335];
					local95.aShortArray81[local95.aShort54] = (short) arg8[local335];
					if (local415) {
						if (arg11[local335] == -1 || this.aClass51_Sub1_10.anInterface4_8.method3138(arg11[local335]).aBoolean360) {
							local95.aShortArray80[local95.aShort54] = -1;
						} else {
							local95.aShortArray80[local95.aShort54] = (short) arg11[local335];
							local95.aShortArray85[local95.aShort54] = (short) arg12[local335];
						}
					}
					local95.aShort54++;
				}
			}
			this.aClass166ArrayArray1[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(644) Class183 local644 = new Class183();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local644.anInt4890 = Static457.method5793(Static86.method1478(arg10[0]), this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray17[arg0][arg1]);
				if (local64 == -1) {
					local644.aByte50 = (byte) (local644.aByte50 | 0x2);
				}
			}
			if (this.anIntArrayArray37[arg0][arg1] == this.anIntArrayArray37[arg0 + 1][arg1] && this.anIntArrayArray37[arg0][arg1] == this.anIntArrayArray37[arg0 + 1][arg1 + 1] && this.anIntArrayArray37[arg0][arg1] == this.anIntArrayArray37[arg0][arg1 + 1]) {
				local644.aByte50 = (byte) (local644.aByte50 | 0x1);
			}
			if (local70 == -1 || (local644.aByte50 & 0x2) != 0 || this.aClass51_Sub1_10.anInterface4_8.method3138(local70).aBoolean360) {
				@Pc(845) short local845 = Static86.method1478(local64);
				local644.aShort65 = (short) Static457.method5793(local845, this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray17[arg0][arg1]);
				local644.aShort62 = (short) Static457.method5793(local845, this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray17[arg0 + 1][arg1]);
				local644.aShort64 = (short) Static457.method5793(local845, this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray17[arg0 + 1][arg1 + 1]);
				local644.aShort66 = (short) Static457.method5793(local845, this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray17[arg0][arg1 + 1]);
				local644.aShort63 = -1;
			} else {
				local644.aShort65 = (short) (this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray17[arg0][arg1]);
				local644.aShort62 = (short) (this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray17[arg0 + 1][arg1]);
				local644.aShort64 = (short) (this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray17[arg0 + 1][arg1 + 1]);
				local644.aShort66 = (short) (this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray17[arg0][arg1 + 1]);
				local644.aShort63 = (short) local70;
			}
			this.aClass183ArrayArray1[arg0][arg1] = local644;
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIIIII[[ZLclient!bu;[I[I)V")
	private void method3530(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class31 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean31 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass262ArrayArray1[local22][local25] != null) {
						@Pc(50) Class262 local50 = this.aClass262ArrayArray1[local22][local25];
						if (local50.aShort97 != -1 && (local50.aByte100 & 0x2) == 0 && local50.anInt7301 == 0) {
							local68 = this.aClass51_Sub1_10.method1129(local50.aShort97);
							arg5.method542(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static457.method5793(local68, local50.anInt7304), Static457.method5793(local68, local50.anInt7300), Static457.method5793(local68, local50.anInt7302));
							arg5.method542(local20, local20, local20 - 4, local16, local16 + 4, local16, Static457.method5793(local68, local50.anInt7303), Static457.method5793(local68, local50.anInt7302), Static457.method5793(local68, local50.anInt7300));
						} else if (local50.anInt7301 == 0) {
							arg5.method543(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt7304, local50.anInt7300, local50.anInt7302);
							arg5.method543(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt7303, local50.anInt7302, local50.anInt7300);
						} else {
							local68 = local50.anInt7301;
							arg5.method543(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static161.method2358(local68, local50.anInt7304 & 0xFF000000), Static161.method2358(local68, local50.anInt7300 & 0xFF000000), Static161.method2358(local68, local50.anInt7302 & 0xFF000000));
							arg5.method543(local20, local20, local20 - 4, local16, local16 + 4, local16, Static161.method2358(local68, local50.anInt7303 & 0xFF000000), Static161.method2358(local68, local50.anInt7302 & 0xFF000000), Static161.method2358(local68, local50.anInt7300 & 0xFF000000));
						}
					} else if (this.aClass41ArrayArray1[local22][local25] != null) {
						@Pc(259) Class41 local259 = this.aClass41ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort13; local68++) {
							arg6[local68] = local16 + local259.aShortArray13[local68] * 4 / super.anInt4485;
							arg7[local68] = local20 - local259.aShortArray11[local68] * 4 / super.anInt4485;
						}
						for (@Pc(297) int local297 = 0; local297 < local259.aShort14; local297++) {
							@Pc(302) int local302 = local297 * 3;
							@Pc(306) int local306 = local302 + 1;
							@Pc(310) int local310 = local306 + 1;
							@Pc(314) int local314 = arg6[local302];
							@Pc(318) int local318 = arg6[local306];
							@Pc(322) int local322 = arg6[local310];
							@Pc(326) int local326 = arg7[local302];
							@Pc(330) int local330 = arg7[local306];
							@Pc(334) int local334 = arg7[local310];
							@Pc(359) int local359;
							if (local259.anIntArray72 != null && local259.anIntArray72[local297] != 0 && (local259.aShortArray12 == null || local259.aShortArray12 != null && local259.aShortArray12[local297] == -1)) {
								local359 = local259.anIntArray72[local297];
								arg5.method543(local326, local330, local334, local314, local318, local322, Static161.method2358(local359, -(local259.anIntArray71[local302] & -16777216) - 16777216), Static161.method2358(local359, -(local259.anIntArray71[local306] & -16777216) - 16777216), Static161.method2358(local359, -(local259.anIntArray71[local310] & -16777216) - 16777216));
							} else if (local259.aShortArray12 == null || local259.aShortArray12[local297] == -1) {
								arg5.method543(local326, local330, local334, local314, local318, local322, local259.anIntArray71[local302], local259.anIntArray71[local306], local259.anIntArray71[local310]);
							} else {
								local359 = this.aClass51_Sub1_10.method1129(local259.aShortArray12[local297]);
								arg5.method542(local326, local330, local334, local314, local318, local322, local359, local359, local359);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean31 = true;
	}

	@OriginalMember(owner = "client!mu", name = "k", descriptor = "(IILclient!ba;)Lclient!ba;")
	@Override
	public Class7_Sub4_Sub2 k(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7_Sub4_Sub2 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!ba;IIIIZ)Z")
	@Override
	public boolean method3580(@OriginalArg(0) Class7_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!mu", name = "l", descriptor = "(II)I")
	@Override
	public int l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray37[arg0][arg1];
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(IIIIIII[[ZLclient!bu;[I[I)V")
	private void method3531(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class31 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean31 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass183ArrayArray1[local22][local25] != null) {
						@Pc(50) Class183 local50 = this.aClass183ArrayArray1[local22][local25];
						if (local50.aShort63 != -1 && (local50.aByte50 & 0x2) == 0 && local50.anInt4890 == -1) {
							local69 = this.aClass51_Sub1_10.method1129(local50.aShort63);
							arg5.method542(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static457.method5793(local69, local50.aShort64 & 0xFFFF), Static457.method5793(local69, local50.aShort66 & 0xFFFF), Static457.method5793(local69, local50.aShort62 & 0xFFFF));
							arg5.method542(local20, local20, local20 - 4, local16, local16 + 4, local16, Static457.method5793(local69, local50.aShort65 & 0xFFFF), Static457.method5793(local69, local50.aShort62 & 0xFFFF), Static457.method5793(local69, local50.aShort66 & 0xFFFF));
						} else if (local50.anInt4890 == -1) {
							arg5.method542(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort64 & 0xFFFF, local50.aShort66 & 0xFFFF, local50.aShort62 & 0xFFFF);
							arg5.method542(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort65 & 0xFFFF, local50.aShort62 & 0xFFFF, local50.aShort66 & 0xFFFF);
						} else {
							local69 = local50.anInt4890;
							arg5.method542(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method542(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass166ArrayArray1[local22][local25] != null) {
						@Pc(249) Class166 local249 = this.aClass166ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort55; local69++) {
							arg6[local69] = local16 + local249.aShortArray79[local69] * 4 / super.anInt4485;
							arg7[local69] = local20 - local249.aShortArray77[local69] * 4 / super.anInt4485;
						}
						for (@Pc(287) int local287 = 0; local287 < local249.aShort54; local287++) {
							@Pc(293) short local293 = local249.aShortArray84[local287];
							@Pc(298) short local298 = local249.aShortArray83[local287];
							@Pc(303) short local303 = local249.aShortArray81[local287];
							@Pc(307) int local307 = arg6[local293];
							@Pc(311) int local311 = arg6[local298];
							@Pc(315) int local315 = arg6[local303];
							@Pc(319) int local319 = arg7[local293];
							@Pc(323) int local323 = arg7[local298];
							@Pc(327) int local327 = arg7[local303];
							@Pc(341) int local341;
							if (local249.anIntArray413 != null && local249.anIntArray413[local287] != -1) {
								local341 = local249.anIntArray413[local287];
								arg5.method542(local319, local323, local327, local307, local311, local315, Static457.method5793(local341, local249.aShortArray78[local293]), Static457.method5793(local341, local249.aShortArray78[local298]), Static457.method5793(local341, local249.aShortArray78[local303]));
							} else if (local249.aShortArray80 == null || local249.aShortArray80[local287] == -1) {
								local341 = local249.anIntArray412[local287];
								arg5.method542(local319, local323, local327, local307, local311, local315, Static457.method5793(local341, local249.aShortArray78[local293]), Static457.method5793(local341, local249.aShortArray78[local298]), Static457.method5793(local341, local249.aShortArray78[local303]));
							} else {
								local341 = this.aClass51_Sub1_10.method1129(local249.aShortArray80[local287]);
								arg5.method542(local319, local323, local327, local307, local311, local315, Static457.method5793(local341, local249.aShortArray78[local293]), Static457.method5793(local341, local249.aShortArray78[local298]), Static457.method5793(local341, local249.aShortArray78[local303]));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean31 = true;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIZLclient!bu;[I[I[I)V")
	private void method3532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class31 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class262 local6 = this.aClass262ArrayArray1[arg0][arg1];
		@Pc(24) int local24;
		@Pc(29) int local29;
		@Pc(34) int local34;
		@Pc(268) int local268;
		@Pc(324) int local324;
		@Pc(380) int local380;
		@Pc(436) int local436;
		@Pc(296) int local296;
		@Pc(352) int local352;
		@Pc(408) int local408;
		@Pc(464) int local464;
		@Pc(257) int local257;
		@Pc(313) int local313;
		@Pc(369) int local369;
		@Pc(425) int local425;
		@Pc(285) int local285;
		@Pc(341) int local341;
		@Pc(397) int local397;
		@Pc(453) int local453;
		@Pc(82) int local82;
		@Pc(105) int local105;
		@Pc(128) int local128;
		@Pc(151) int local151;
		@Pc(36) int local36;
		@Pc(38) int local38;
		@Pc(40) int local40;
		@Pc(42) int local42;
		@Pc(176) int local176;
		@Pc(56) int local56;
		@Pc(65) int local65;
		@Pc(240) int local240;
		@Pc(501) int local501;
		@Pc(642) int local642;
		if (local6 == null) {
			@Pc(1452) Class41 local1452 = this.aClass41ArrayArray1[arg0][arg1];
			if (local1452 != null) {
				if (this.anInt4423 == -1) {
					for (local436 = 0; local436 < local1452.aShort13; local436++) {
						local24 = local1452.aShortArray13[local436] + (arg0 << super.anInt4488);
						local29 = local1452.aShortArray14[local436];
						local34 = local1452.aShortArray11[local436] + (arg1 << super.anInt4488);
						local380 = this.anInt4421 + (this.anInt4419 * local24 + this.anInt4420 * local29 + this.anInt4427 * local34 >> 15);
						if (local380 <= this.aClass51_Sub1_10.anInt1300) {
							return;
						}
						arg6[local436] = 0;
						if (arg2) {
							local296 = local380 - this.aClass51_Sub1_10.anInt1287;
							if (local296 > 255) {
								local296 = 255;
							}
							if (local296 > 0) {
								arg6[local436] = local296;
								local352 = local1452.aShortArray10[local436] * local296 / 255;
								if (local352 > 0) {
									local29 -= local352;
								}
							}
						} else if (this.aClass51_Sub1_10.aBoolean78) {
							local296 = local380 - this.aClass51_Sub1_10.anInt1287;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt4426 + (this.anInt4422 * local24 + this.anInt4418 * local29 + this.anInt4417 * local34 >> 15);
						local324 = this.anInt4424 + (this.anInt4430 * local24 + this.anInt4428 * local29 + this.anInt4429 * local34 >> 15);
						arg4[local436] = arg3.anInt655 + local268 * this.aClass51_Sub1_10.anInt1278 / local380;
						arg5[local436] = arg3.anInt660 + local324 * this.aClass51_Sub1_10.anInt1276 / local380;
					}
				} else {
					for (local436 = 0; local436 < local1452.aShort13; local436++) {
						local24 = local1452.aShortArray13[local436] + (arg0 << super.anInt4488);
						local29 = local1452.aShortArray14[local436];
						local34 = local1452.aShortArray11[local436] + (arg1 << super.anInt4488);
						arg6[local436] = 0;
						if (arg2) {
							local296 = this.anInt4423 - this.aClass51_Sub1_10.anInt1287;
							if (local296 > 255) {
								local296 = 255;
							}
							if (local296 > 0) {
								arg6[local436] = local296;
								local352 = local1452.aShortArray10[local436] * local296 / 255;
								if (local352 > 0) {
									local29 -= local352;
								}
							}
						} else if (this.aClass51_Sub1_10.aBoolean78) {
							local296 = this.anInt4423 - this.aClass51_Sub1_10.anInt1287;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt4426 + (this.anInt4422 * local24 + this.anInt4418 * local29 + this.anInt4417 * local34 >> 15);
						local324 = this.anInt4424 + (this.anInt4430 * local24 + this.anInt4428 * local29 + this.anInt4429 * local34 >> 15);
						arg4[local436] = arg3.anInt655 + local268 * this.aClass51_Sub1_10.anInt1278 / this.anInt4423;
						arg5[local436] = arg3.anInt660 + local324 * this.aClass51_Sub1_10.anInt1276 / this.anInt4423;
					}
				}
				if (local1452.aShortArray12 != null) {
					local436 = this.anIntArrayArray37[arg0][arg1];
					local296 = this.anIntArrayArray37[arg0 + 1][arg1];
					local352 = this.anIntArrayArray37[arg0][arg1 + 1];
					local408 = arg0 * super.anInt4485;
					local464 = local408 + super.anInt4485;
					local257 = arg1 * super.anInt4485;
					local313 = local257 + super.anInt4485;
					local369 = this.anInt4426 + (this.anInt4422 * local408 + this.anInt4418 * local436 + this.anInt4417 * local257 >> 15);
					local425 = this.anInt4424 + (this.anInt4430 * local408 + this.anInt4428 * local436 + this.anInt4429 * local257 >> 15);
					local285 = this.anInt4421 + (this.anInt4419 * local408 + this.anInt4420 * local436 + this.anInt4427 * local257 >> 15);
					local341 = this.anInt4426 + (this.anInt4422 * local464 + this.anInt4418 * local296 + this.anInt4417 * local257 >> 15);
					local397 = this.anInt4424 + (this.anInt4430 * local464 + this.anInt4428 * local296 + this.anInt4429 * local257 >> 15);
					local453 = this.anInt4421 + (this.anInt4419 * local464 + this.anInt4420 * local296 + this.anInt4427 * local257 >> 15);
					local82 = this.anInt4426 + (this.anInt4422 * local408 + this.anInt4418 * local352 + this.anInt4417 * local313 >> 15);
					local105 = this.anInt4424 + (this.anInt4430 * local408 + this.anInt4428 * local352 + this.anInt4429 * local313 >> 15);
					local128 = this.anInt4421 + (this.anInt4419 * local408 + this.anInt4420 * local352 + this.anInt4427 * local313 >> 15);
					for (local151 = 0; local151 < local1452.aShort14; local151++) {
						local36 = local151 * 3;
						local38 = local36 + 1;
						local40 = local38 + 1;
						local42 = arg4[local36];
						local176 = arg4[local38];
						local56 = arg4[local40];
						local65 = arg5[local36];
						local240 = arg5[local38];
						local501 = arg5[local40];
						local642 = arg6[local36] + arg6[local38] + arg6[local40];
						if ((local42 - local176) * (local501 - local240) - (local65 - local240) * (local56 - local176) > 0) {
							arg3.aBoolean34 = local42 < 0 || local176 < 0 || local56 < 0 || local42 > arg3.anInt657 || local176 > arg3.anInt657 || local56 > arg3.anInt657;
							@Pc(2138) short local2138 = local1452.aShortArray12[local151];
							if (local642 < 765) {
								if (local2138 != -1 && this.method3533(this.aClass51_Sub1_10.anInterface4_8.method3138(local2138).aByte59)) {
									arg3.anInt658 = 100;
								}
								if (local642 > 0) {
									if (local2138 != -1) {
										arg3.method537(local65, local240, local501, local42, local176, local56, this.aClass51_Sub1_10.anInt1294, arg6[local36], arg6[local38], arg6[local40], local1452.anIntArray71[local36], local1452.anIntArray71[local38], local1452.anIntArray71[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
									} else if ((local1452.anIntArray71[local36] & 0xFFFFFF) != 0) {
										arg3.method543(local65, local240, local501, local42, local176, local56, Static161.method2358(local1452.anIntArray71[local36], arg6[local36] << 24 | this.aClass51_Sub1_10.anInt1294), Static161.method2358(local1452.anIntArray71[local38], arg6[local38] << 24 | this.aClass51_Sub1_10.anInt1294), Static161.method2358(local1452.anIntArray71[local40], arg6[local40] << 24 | this.aClass51_Sub1_10.anInt1294));
									}
								} else if (local2138 != -1) {
									arg3.method539(local65, local240, local501, local42, local176, local56, local1452.anIntArray71[local36], local1452.anIntArray71[local38], local1452.anIntArray71[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
								} else if ((local1452.anIntArray71[local36] & 0xFFFFFF) != 0) {
									arg3.method543(local65, local240, local501, local42, local176, local56, local1452.anIntArray71[local36], local1452.anIntArray71[local38], local1452.anIntArray71[local40]);
								}
								arg3.anInt658 = 0;
							} else {
								arg3.method533(local65, local240, local501, local42, local176, local56, this.aClass51_Sub1_10.anInt1294);
							}
						}
					}
					return;
				}
				for (local436 = 0; local436 < local1452.aShort14; local436++) {
					local296 = local436 * 3;
					local352 = local296 + 1;
					local408 = local352 + 1;
					local464 = arg4[local296];
					local257 = arg4[local352];
					local313 = arg4[local408];
					local369 = arg5[local296];
					local425 = arg5[local352];
					local285 = arg5[local408];
					local341 = arg6[local296] + arg6[local352] + arg6[local408];
					if ((local464 - local257) * (local285 - local425) - (local369 - local425) * (local313 - local257) > 0) {
						arg3.aBoolean34 = local464 < 0 || local257 < 0 || local313 < 0 || local464 > arg3.anInt657 || local257 > arg3.anInt657 || local313 > arg3.anInt657;
						if (local341 >= 765) {
							arg3.method533(local369, local425, local285, local464, local257, local313, this.aClass51_Sub1_10.anInt1294);
						} else if (local341 > 0) {
							if ((local1452.anIntArray71[local296] & 0xFFFFFF) != 0) {
								arg3.method543(local369, local425, local285, local464, local257, local313, Static264.method3568(local1452.anIntArray71[local296], arg6[local296], this.aClass51_Sub1_10.anInt1294), Static264.method3568(local1452.anIntArray71[local352], arg6[local352], this.aClass51_Sub1_10.anInt1294), Static264.method3568(local1452.anIntArray71[local408], arg6[local408], this.aClass51_Sub1_10.anInt1294));
							}
						} else if ((local1452.anIntArray71[local296] & 0xFFFFFF) != 0) {
							arg3.method543(local369, local425, local285, local464, local257, local313, local1452.anIntArray71[local296], local1452.anIntArray71[local352], local1452.anIntArray71[local408]);
						}
					}
				}
			}
		} else if ((local6.aByte100 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt4485;
			local24 = local19 + super.anInt4485;
			local29 = arg1 * super.anInt4485;
			local34 = local29 + super.anInt4485;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte100 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray37[arg0][arg1];
				local65 = this.anIntArrayArray37[arg0 + 1][arg1];
				local240 = this.anIntArrayArray37[arg0 + 1][arg1 + 1];
				local501 = this.anIntArrayArray37[arg0][arg1 + 1];
				if (this.anInt4423 == -1) {
					local82 = this.anInt4421 + (this.anInt4419 * local19 + this.anInt4420 * local56 + this.anInt4427 * local29 >> 15);
					if (local82 <= this.aClass51_Sub1_10.anInt1300) {
						return;
					}
					local105 = this.anInt4421 + (this.anInt4419 * local24 + this.anInt4420 * local65 + this.anInt4427 * local29 >> 15);
					if (local105 <= this.aClass51_Sub1_10.anInt1300) {
						return;
					}
					local128 = this.anInt4421 + (this.anInt4419 * local24 + this.anInt4420 * local240 + this.anInt4427 * local34 >> 15);
					if (local128 <= this.aClass51_Sub1_10.anInt1300) {
						return;
					}
					local151 = this.anInt4421 + (this.anInt4419 * local19 + this.anInt4420 * local501 + this.anInt4427 * local34 >> 15);
					if (local151 <= this.aClass51_Sub1_10.anInt1300) {
						return;
					}
				} else {
					local151 = this.anInt4423;
					local128 = this.anInt4423;
					local105 = this.anInt4423;
					local82 = this.anInt4423;
				}
				if (arg2) {
					local176 = local82 - this.aClass51_Sub1_10.anInt1287;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local36 = local176;
						local642 = local6.aShort96 * local176 / 255;
						if (local642 > 0) {
							local56 -= local642;
						}
					}
					local176 = local105 - this.aClass51_Sub1_10.anInt1287;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local38 = local176;
						local642 = local6.aShort99 * local176 / 255;
						if (local642 > 0) {
							local65 -= local642;
						}
					}
					local176 = local128 - this.aClass51_Sub1_10.anInt1287;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local40 = local176;
						local642 = local6.aShort98 * local176 / 255;
						if (local642 > 0) {
							local240 -= local642;
						}
					}
					local176 = local151 - this.aClass51_Sub1_10.anInt1287;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local42 = local176;
						local642 = local6.aShort100 * local176 / 255;
						if (local642 > 0) {
							local501 -= local642;
						}
					}
				} else if (this.aClass51_Sub1_10.aBoolean78) {
					local176 = local82 - this.aClass51_Sub1_10.anInt1287;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass51_Sub1_10.anInt1287;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass51_Sub1_10.anInt1287;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass51_Sub1_10.anInt1287;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local257 = this.anInt4426 + (this.anInt4422 * local19 + this.anInt4418 * local56 + this.anInt4417 * local29 >> 15);
				local268 = arg3.anInt655 + local257 * this.aClass51_Sub1_10.anInt1278 / local82;
				local285 = this.anInt4424 + (this.anInt4430 * local19 + this.anInt4428 * local56 + this.anInt4429 * local29 >> 15);
				local296 = arg3.anInt660 + local285 * this.aClass51_Sub1_10.anInt1276 / local82;
				local313 = this.anInt4426 + (this.anInt4422 * local24 + this.anInt4418 * local65 + this.anInt4417 * local29 >> 15);
				local324 = arg3.anInt655 + local313 * this.aClass51_Sub1_10.anInt1278 / local105;
				local341 = this.anInt4424 + (this.anInt4430 * local24 + this.anInt4428 * local65 + this.anInt4429 * local29 >> 15);
				local352 = arg3.anInt660 + local341 * this.aClass51_Sub1_10.anInt1276 / local105;
				local369 = this.anInt4426 + (this.anInt4422 * local24 + this.anInt4418 * local240 + this.anInt4417 * local34 >> 15);
				local380 = arg3.anInt655 + local369 * this.aClass51_Sub1_10.anInt1278 / local128;
				local397 = this.anInt4424 + (this.anInt4430 * local24 + this.anInt4428 * local240 + this.anInt4429 * local34 >> 15);
				local408 = arg3.anInt660 + local397 * this.aClass51_Sub1_10.anInt1276 / local128;
				local425 = this.anInt4426 + (this.anInt4422 * local19 + this.anInt4418 * local501 + this.anInt4417 * local34 >> 15);
				local436 = arg3.anInt655 + local425 * this.aClass51_Sub1_10.anInt1278 / local151;
				local453 = this.anInt4424 + (this.anInt4430 * local19 + this.anInt4428 * local501 + this.anInt4429 * local34 >> 15);
				local464 = arg3.anInt660 + local453 * this.aClass51_Sub1_10.anInt1276 / local151;
			} else {
				local56 = this.anIntArrayArray37[arg0][arg1];
				if (this.anInt4423 == -1) {
					local65 = this.anInt4420 * local56;
					local82 = this.anInt4421 + (this.anInt4419 * local19 + local65 + this.anInt4427 * local29 >> 15);
					if (local82 <= this.aClass51_Sub1_10.anInt1300) {
						return;
					}
					local105 = this.anInt4421 + (this.anInt4419 * local24 + local65 + this.anInt4427 * local29 >> 15);
					if (local105 <= this.aClass51_Sub1_10.anInt1300) {
						return;
					}
					local128 = this.anInt4421 + (this.anInt4419 * local24 + local65 + this.anInt4427 * local34 >> 15);
					if (local128 <= this.aClass51_Sub1_10.anInt1300) {
						return;
					}
					local151 = this.anInt4421 + (this.anInt4419 * local19 + local65 + this.anInt4427 * local34 >> 15);
					if (local151 <= this.aClass51_Sub1_10.anInt1300) {
						return;
					}
				} else {
					local151 = this.anInt4423;
					local128 = this.anInt4423;
					local105 = this.anInt4423;
					local82 = this.anInt4423;
				}
				if (this.aClass51_Sub1_10.aBoolean78) {
					local176 = local82 - this.aClass51_Sub1_10.anInt1287;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass51_Sub1_10.anInt1287;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass51_Sub1_10.anInt1287;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass51_Sub1_10.anInt1287;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local65 = this.anInt4418 * local56;
				local240 = this.anInt4428 * local56;
				local257 = this.anInt4426 + (this.anInt4422 * local19 + local65 + this.anInt4417 * local29 >> 15);
				local268 = arg3.anInt655 + local257 * this.aClass51_Sub1_10.anInt1278 / local82;
				local285 = this.anInt4424 + (this.anInt4430 * local19 + local240 + this.anInt4429 * local29 >> 15);
				local296 = arg3.anInt660 + local285 * this.aClass51_Sub1_10.anInt1276 / local82;
				local313 = this.anInt4426 + (this.anInt4422 * local24 + local65 + this.anInt4417 * local29 >> 15);
				local324 = arg3.anInt655 + local313 * this.aClass51_Sub1_10.anInt1278 / local105;
				local341 = this.anInt4424 + (this.anInt4430 * local24 + local240 + this.anInt4429 * local29 >> 15);
				local352 = arg3.anInt660 + local341 * this.aClass51_Sub1_10.anInt1276 / local105;
				local369 = this.anInt4426 + (this.anInt4422 * local24 + local65 + this.anInt4417 * local34 >> 15);
				local380 = arg3.anInt655 + local369 * this.aClass51_Sub1_10.anInt1278 / local128;
				local397 = this.anInt4424 + (this.anInt4430 * local24 + local240 + this.anInt4429 * local34 >> 15);
				local408 = arg3.anInt660 + local397 * this.aClass51_Sub1_10.anInt1276 / local128;
				local425 = this.anInt4426 + (this.anInt4422 * local19 + local65 + this.anInt4417 * local34 >> 15);
				local436 = arg3.anInt655 + local425 * this.aClass51_Sub1_10.anInt1278 / local151;
				local453 = this.anInt4424 + (this.anInt4430 * local19 + local240 + this.anInt4429 * local34 >> 15);
				local464 = arg3.anInt660 + local453 * this.aClass51_Sub1_10.anInt1276 / local151;
			}
			@Pc(1064) boolean local1064 = local6.aShort97 != -1 && this.method3533(this.aClass51_Sub1_10.anInterface4_8.method3138(local6.aShort97).aByte59);
			local65 = local38 + local40 + local42;
			if ((local380 - local436) * (local352 - local464) - (local408 - local464) * (local324 - local436) > 0) {
				arg3.aBoolean34 = local380 < 0 || local436 < 0 || local324 < 0 || local380 > arg3.anInt657 || local436 > arg3.anInt657 || local324 > arg3.anInt657;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt658 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort97 >= 0) {
							arg3.method537(local408, local464, local352, local380, local436, local324, this.aClass51_Sub1_10.anInt1294, local40, local42, local38, local6.anInt7304, local6.anInt7300, local6.anInt7302, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort97);
						} else {
							arg3.method543(local408, local464, local352, local380, local436, local324, Static161.method2358(local6.anInt7304, local40 << 24 | this.aClass51_Sub1_10.anInt1294), Static161.method2358(local6.anInt7300, local42 << 24 | this.aClass51_Sub1_10.anInt1294), Static161.method2358(local6.anInt7302, local38 << 24 | this.aClass51_Sub1_10.anInt1294));
						}
					} else if (local6.aShort97 >= 0) {
						arg3.method539(local408, local464, local352, local380, local436, local324, local6.anInt7304, local6.anInt7300, local6.anInt7302, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort97);
					} else {
						arg3.method543(local408, local464, local352, local380, local436, local324, local6.anInt7304, local6.anInt7300, local6.anInt7302);
					}
					arg3.anInt658 = 0;
				} else {
					arg3.method533(local408, local464, local352, local380, local436, local324, this.aClass51_Sub1_10.anInt1294);
				}
			}
			local65 = local36 + local38 + local42;
			if ((local268 - local324) * (local464 - local352) - (local296 - local352) * (local436 - local324) > 0) {
				arg3.aBoolean34 = local268 < 0 || local324 < 0 || local436 < 0 || local268 > arg3.anInt657 || local324 > arg3.anInt657 || local436 > arg3.anInt657;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt658 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort97 >= 0) {
							arg3.method537(local296, local352, local464, local268, local324, local436, this.aClass51_Sub1_10.anInt1294, local36, local38, local42, local6.anInt7303, local6.anInt7302, local6.anInt7300, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort97);
						} else {
							arg3.method543(local296, local352, local464, local268, local324, local436, Static161.method2358(local6.anInt7303, local36 << 24 | this.aClass51_Sub1_10.anInt1294), Static161.method2358(local6.anInt7302, local38 << 24 | this.aClass51_Sub1_10.anInt1294), Static161.method2358(local6.anInt7300, local42 << 24 | this.aClass51_Sub1_10.anInt1294));
						}
					} else if (local6.aShort97 >= 0) {
						arg3.method539(local296, local352, local464, local268, local324, local436, local6.anInt7303, local6.anInt7302, local6.anInt7300, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort97);
					} else {
						arg3.method543(local296, local352, local464, local268, local324, local436, local6.anInt7303, local6.anInt7302, local6.anInt7300);
					}
					arg3.anInt658 = 0;
					return;
				}
				arg3.method533(local296, local352, local464, local268, local324, local436, this.aClass51_Sub1_10.anInt1294);
			}
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)Z")
	private boolean method3533(@OriginalArg(0) int arg0) {
		if ((this.anInt4425 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(II)V")
	@Override
	public void method3581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class90 local4 = this.aClass51_Sub1_10.method1132(Thread.currentThread());
		local4.aClass31_1.anInt658 = 0;
		if (this.aClass262ArrayArray1 != null) {
			this.method3532(arg0, arg1, this.aClass51_Sub1_10.aBoolean80, local4.aClass31_1, local4.anIntArray202, local4.anIntArray186, local4.anIntArray183);
		} else if (this.aClass183ArrayArray1 != null) {
			this.method3534(arg0, arg1, local4.aClass31_1, local4.anIntArray202, local4.anIntArray186, local4.anIntArray183);
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method3579(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class90 local4 = this.aClass51_Sub1_10.method1132(Thread.currentThread());
		@Pc(7) Class31 local7 = local4.aClass31_1;
		local7.anInt658 = 0;
		local7.aBoolean34 = false;
		if (this.aClass262ArrayArray1 != null) {
			this.method3530(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray202, local4.anIntArray186);
		} else if (this.aClass183ArrayArray1 != null) {
			this.method3531(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray202, local4.anIntArray186);
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IILclient!bu;[I[I[I)V")
	private void method3534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class183 local6 = this.aClass183ArrayArray1[arg0][arg1];
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(194) int local194;
		@Pc(250) int local250;
		@Pc(306) int local306;
		@Pc(362) int local362;
		@Pc(390) int local390;
		@Pc(183) int local183;
		@Pc(239) int local239;
		@Pc(295) int local295;
		@Pc(351) int local351;
		@Pc(211) int local211;
		@Pc(267) int local267;
		@Pc(323) int local323;
		@Pc(379) int local379;
		@Pc(72) int local72;
		@Pc(95) int local95;
		@Pc(118) int local118;
		@Pc(141) int local141;
		@Pc(427) int local427;
		@Pc(222) int local222;
		@Pc(278) int local278;
		@Pc(334) int local334;
		if (local6 == null) {
			@Pc(1022) Class166 local1022 = this.aClass166ArrayArray1[arg0][arg1];
			if (local1022 != null) {
				@Pc(1046) short local1046;
				if (this.anInt4423 == -1) {
					for (local362 = 0; local362 < local1022.aShort55; local362++) {
						local24 = local1022.aShortArray79[local362] + (arg0 << super.anInt4488);
						local1046 = local1022.aShortArray82[local362];
						local34 = local1022.aShortArray77[local362] + (arg1 << super.anInt4488);
						local306 = this.anInt4421 + (this.anInt4419 * local24 + this.anInt4420 * local1046 + this.anInt4427 * local34 >> 15);
						if (local306 <= this.aClass51_Sub1_10.anInt1300) {
							return;
						}
						local194 = this.anInt4426 + (this.anInt4422 * local24 + this.anInt4418 * local1046 + this.anInt4417 * local34 >> 15);
						local250 = this.anInt4424 + (this.anInt4430 * local24 + this.anInt4428 * local1046 + this.anInt4429 * local34 >> 15);
						arg3[local362] = arg2.anInt655 + local194 * this.aClass51_Sub1_10.anInt1278 / local306;
						arg4[local362] = arg2.anInt660 + local250 * this.aClass51_Sub1_10.anInt1276 / local306;
					}
				} else {
					for (local362 = 0; local362 < local1022.aShort55; local362++) {
						local24 = local1022.aShortArray79[local362] + (arg0 << super.anInt4488);
						local1046 = local1022.aShortArray82[local362];
						local34 = local1022.aShortArray77[local362] + (arg1 << super.anInt4488);
						local194 = this.anInt4426 + (this.anInt4422 * local24 + this.anInt4418 * local1046 + this.anInt4417 * local34 >> 15);
						local250 = this.anInt4424 + (this.anInt4430 * local24 + this.anInt4428 * local1046 + this.anInt4429 * local34 >> 15);
						arg3[local362] = arg2.anInt655 + local194 * this.aClass51_Sub1_10.anInt1278 / this.anInt4423;
						arg4[local362] = arg2.anInt660 + local250 * this.aClass51_Sub1_10.anInt1276 / this.anInt4423;
					}
				}
				if (local1022.aShortArray80 != null) {
					local362 = this.anIntArrayArray37[arg0][arg1];
					local222 = this.anIntArrayArray37[arg0 + 1][arg1];
					local278 = this.anIntArrayArray37[arg0][arg1 + 1];
					local334 = arg0 * super.anInt4485;
					local390 = local334 + super.anInt4485;
					local183 = arg1 * super.anInt4485;
					local239 = local183 + super.anInt4485;
					local295 = this.anInt4426 + (this.anInt4422 * local334 + this.anInt4418 * local362 + this.anInt4417 * local183 >> 15);
					local351 = this.anInt4424 + (this.anInt4430 * local334 + this.anInt4428 * local362 + this.anInt4429 * local183 >> 15);
					local211 = this.anInt4421 + (this.anInt4419 * local334 + this.anInt4420 * local362 + this.anInt4427 * local183 >> 15);
					local267 = this.anInt4426 + (this.anInt4422 * local390 + this.anInt4418 * local222 + this.anInt4417 * local183 >> 15);
					local323 = this.anInt4424 + (this.anInt4430 * local390 + this.anInt4428 * local222 + this.anInt4429 * local183 >> 15);
					local379 = this.anInt4421 + (this.anInt4419 * local390 + this.anInt4420 * local222 + this.anInt4427 * local183 >> 15);
					local72 = this.anInt4426 + (this.anInt4422 * local334 + this.anInt4418 * local278 + this.anInt4417 * local239 >> 15);
					local95 = this.anInt4424 + (this.anInt4430 * local334 + this.anInt4428 * local278 + this.anInt4429 * local239 >> 15);
					local118 = this.anInt4421 + (this.anInt4419 * local334 + this.anInt4420 * local278 + this.anInt4427 * local239 >> 15);
					for (local141 = 0; local141 < local1022.aShort54; local141++) {
						@Pc(1491) short local1491 = local1022.aShortArray84[local141];
						@Pc(1496) short local1496 = local1022.aShortArray83[local141];
						@Pc(1501) short local1501 = local1022.aShortArray81[local141];
						local427 = arg3[local1491];
						@Pc(1509) int local1509 = arg3[local1496];
						@Pc(1513) int local1513 = arg3[local1501];
						@Pc(1517) int local1517 = arg4[local1491];
						@Pc(1521) int local1521 = arg4[local1496];
						@Pc(1525) int local1525 = arg4[local1501];
						if ((local427 - local1509) * (local1525 - local1521) - (local1517 - local1521) * (local1513 - local1509) > 0) {
							arg2.aBoolean34 = local427 < 0 || local1509 < 0 || local1513 < 0 || local427 > arg2.anInt657 || local1509 > arg2.anInt657 || local1513 > arg2.anInt657;
							@Pc(1569) short local1569 = local1022.aShortArray80[local141];
							if (local1569 == -1) {
								@Pc(1624) int local1624 = local1022.anIntArray412[local141];
								if (local1624 != -1) {
									arg2.method542(local1517, local1521, local1525, local427, local1509, local1513, Static457.method5793(local1624, local1022.aShortArray78[local1491]), Static457.method5793(local1624, local1022.aShortArray78[local1496]), Static457.method5793(local1624, local1022.aShortArray78[local1501]));
								}
							} else {
								if (this.method3533(this.aClass51_Sub1_10.anInterface4_8.method3138(local1569).aByte59)) {
									arg2.anInt658 = 100;
								}
								arg2.method539(local1517, local1521, local1525, local427, local1509, local1513, local1022.aShortArray78[local1491], local1022.aShortArray78[local1496], local1022.aShortArray78[local1501], local295, local267, local72, local351, local323, local95, local211, local379, local118, local1569);
								arg2.anInt658 = 0;
							}
						}
					}
					return;
				}
				for (local362 = 0; local362 < local1022.aShort54; local362++) {
					@Pc(1670) short local1670 = local1022.aShortArray84[local362];
					@Pc(1675) short local1675 = local1022.aShortArray83[local362];
					@Pc(1680) short local1680 = local1022.aShortArray81[local362];
					local390 = arg3[local1670];
					local183 = arg3[local1675];
					local239 = arg3[local1680];
					local295 = arg4[local1670];
					local351 = arg4[local1675];
					local211 = arg4[local1680];
					if ((local390 - local183) * (local211 - local351) - (local295 - local351) * (local239 - local183) > 0) {
						local267 = local1022.anIntArray412[local362];
						if (local267 != -1) {
							arg2.aBoolean34 = local390 < 0 || local183 < 0 || local239 < 0 || local390 > arg2.anInt657 || local183 > arg2.anInt657 || local239 > arg2.anInt657;
							arg2.method542(local295, local351, local211, local390, local183, local239, Static457.method5793(local267, local1022.aShortArray78[local1670]), Static457.method5793(local267, local1022.aShortArray78[local1675]), Static457.method5793(local267, local1022.aShortArray78[local1680]));
						}
					}
				}
			}
		} else if ((local6.aByte50 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt4485;
			local24 = local19 + super.anInt4485;
			@Pc(29) int local29 = arg1 * super.anInt4485;
			local34 = local29 + super.anInt4485;
			@Pc(46) int local46;
			@Pc(55) int local55;
			@Pc(166) int local166;
			if ((local6.aByte50 & 0x1) == 0) {
				local46 = this.anIntArrayArray37[arg0][arg1];
				local55 = this.anIntArrayArray37[arg0 + 1][arg1];
				local166 = this.anIntArrayArray37[arg0 + 1][arg1 + 1];
				local427 = this.anIntArrayArray37[arg0][arg1 + 1];
				if (this.anInt4423 == -1) {
					local72 = this.anInt4421 + (this.anInt4419 * local19 + this.anInt4420 * local46 + this.anInt4427 * local29 >> 15);
					if (local72 <= this.aClass51_Sub1_10.anInt1300) {
						return;
					}
					local95 = this.anInt4421 + (this.anInt4419 * local24 + this.anInt4420 * local55 + this.anInt4427 * local29 >> 15);
					if (local95 <= this.aClass51_Sub1_10.anInt1300) {
						return;
					}
					local118 = this.anInt4421 + (this.anInt4419 * local24 + this.anInt4420 * local166 + this.anInt4427 * local34 >> 15);
					if (local118 <= this.aClass51_Sub1_10.anInt1300) {
						return;
					}
					local141 = this.anInt4421 + (this.anInt4419 * local19 + this.anInt4420 * local427 + this.anInt4427 * local34 >> 15);
					if (local141 <= this.aClass51_Sub1_10.anInt1300) {
						return;
					}
				} else {
					local141 = this.anInt4423;
					local118 = this.anInt4423;
					local95 = this.anInt4423;
					local72 = this.anInt4423;
				}
				local183 = this.anInt4426 + (this.anInt4422 * local19 + this.anInt4418 * local46 + this.anInt4417 * local29 >> 15);
				local194 = arg2.anInt655 + local183 * this.aClass51_Sub1_10.anInt1278 / local72;
				local211 = this.anInt4424 + (this.anInt4430 * local19 + this.anInt4428 * local46 + this.anInt4429 * local29 >> 15);
				local222 = arg2.anInt660 + local211 * this.aClass51_Sub1_10.anInt1276 / local72;
				local239 = this.anInt4426 + (this.anInt4422 * local24 + this.anInt4418 * local55 + this.anInt4417 * local29 >> 15);
				local250 = arg2.anInt655 + local239 * this.aClass51_Sub1_10.anInt1278 / local95;
				local267 = this.anInt4424 + (this.anInt4430 * local24 + this.anInt4428 * local55 + this.anInt4429 * local29 >> 15);
				local278 = arg2.anInt660 + local267 * this.aClass51_Sub1_10.anInt1276 / local95;
				local295 = this.anInt4426 + (this.anInt4422 * local24 + this.anInt4418 * local166 + this.anInt4417 * local34 >> 15);
				local306 = arg2.anInt655 + local295 * this.aClass51_Sub1_10.anInt1278 / local118;
				local323 = this.anInt4424 + (this.anInt4430 * local24 + this.anInt4428 * local166 + this.anInt4429 * local34 >> 15);
				local334 = arg2.anInt660 + local323 * this.aClass51_Sub1_10.anInt1276 / local118;
				local351 = this.anInt4426 + (this.anInt4422 * local19 + this.anInt4418 * local427 + this.anInt4417 * local34 >> 15);
				local362 = arg2.anInt655 + local351 * this.aClass51_Sub1_10.anInt1278 / local141;
				local379 = this.anInt4424 + (this.anInt4430 * local19 + this.anInt4428 * local427 + this.anInt4429 * local34 >> 15);
				local390 = arg2.anInt660 + local379 * this.aClass51_Sub1_10.anInt1276 / local141;
			} else {
				local46 = this.anIntArrayArray37[arg0][arg1];
				if (this.anInt4423 == -1) {
					local55 = this.anInt4420 * local46;
					local72 = this.anInt4421 + (this.anInt4419 * local19 + local55 + this.anInt4427 * local29 >> 15);
					if (local72 <= this.aClass51_Sub1_10.anInt1300) {
						return;
					}
					local95 = this.anInt4421 + (this.anInt4419 * local24 + local55 + this.anInt4427 * local29 >> 15);
					if (local95 <= this.aClass51_Sub1_10.anInt1300) {
						return;
					}
					local118 = this.anInt4421 + (this.anInt4419 * local24 + local55 + this.anInt4427 * local34 >> 15);
					if (local118 <= this.aClass51_Sub1_10.anInt1300) {
						return;
					}
					local141 = this.anInt4421 + (this.anInt4419 * local19 + local55 + this.anInt4427 * local34 >> 15);
					if (local141 <= this.aClass51_Sub1_10.anInt1300) {
						return;
					}
				} else {
					local141 = this.anInt4423;
					local118 = this.anInt4423;
					local95 = this.anInt4423;
					local72 = this.anInt4423;
				}
				local55 = this.anInt4418 * local46;
				local166 = this.anInt4428 * local46;
				local183 = this.anInt4426 + (this.anInt4422 * local19 + local55 + this.anInt4417 * local29 >> 15);
				local194 = arg2.anInt655 + local183 * this.aClass51_Sub1_10.anInt1278 / local72;
				local211 = this.anInt4424 + (this.anInt4430 * local19 + local166 + this.anInt4429 * local29 >> 15);
				local222 = arg2.anInt660 + local211 * this.aClass51_Sub1_10.anInt1276 / local72;
				local239 = this.anInt4426 + (this.anInt4422 * local24 + local55 + this.anInt4417 * local29 >> 15);
				local250 = arg2.anInt655 + local239 * this.aClass51_Sub1_10.anInt1278 / local95;
				local267 = this.anInt4424 + (this.anInt4430 * local24 + local166 + this.anInt4429 * local29 >> 15);
				local278 = arg2.anInt660 + local267 * this.aClass51_Sub1_10.anInt1276 / local95;
				local295 = this.anInt4426 + (this.anInt4422 * local24 + local55 + this.anInt4417 * local34 >> 15);
				local306 = arg2.anInt655 + local295 * this.aClass51_Sub1_10.anInt1278 / local118;
				local323 = this.anInt4424 + (this.anInt4430 * local24 + local166 + this.anInt4429 * local34 >> 15);
				local334 = arg2.anInt660 + local323 * this.aClass51_Sub1_10.anInt1276 / local118;
				local351 = this.anInt4426 + (this.anInt4422 * local19 + local55 + this.anInt4417 * local34 >> 15);
				local362 = arg2.anInt655 + local351 * this.aClass51_Sub1_10.anInt1278 / local141;
				local379 = this.anInt4424 + (this.anInt4430 * local19 + local166 + this.anInt4429 * local34 >> 15);
				local390 = arg2.anInt660 + local379 * this.aClass51_Sub1_10.anInt1276 / local141;
			}
			if ((local306 - local362) * (local278 - local390) - (local334 - local390) * (local250 - local362) > 0) {
				arg2.aBoolean34 = local306 < 0 || local362 < 0 || local250 < 0 || local306 > arg2.anInt657 || local362 > arg2.anInt657 || local250 > arg2.anInt657;
				if (local6.aShort63 >= 0) {
					if (this.method3533(this.aClass51_Sub1_10.anInterface4_8.method3138(local6.aShort63).aByte59)) {
						arg2.anInt658 = 100;
					}
					arg2.method539(local334, local390, local278, local306, local362, local250, local6.aShort64 & 0xFFFF, local6.aShort66 & 0xFFFF, local6.aShort62 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort63);
					arg2.anInt658 = 0;
				} else {
					arg2.method542(local334, local390, local278, local306, local362, local250, local6.aShort64 & 0xFFFF, local6.aShort66 & 0xFFFF, local6.aShort62 & 0xFFFF);
				}
			}
			if ((local194 - local250) * (local390 - local278) - (local222 - local278) * (local362 - local250) > 0) {
				arg2.aBoolean34 = local194 < 0 || local250 < 0 || local362 < 0 || local194 > arg2.anInt657 || local250 > arg2.anInt657 || local362 > arg2.anInt657;
				if (local6.aShort63 >= 0) {
					if (this.method3533(this.aClass51_Sub1_10.anInterface4_8.method3138(local6.aShort63).aByte59)) {
						arg2.anInt658 = 100;
					}
					arg2.method539(local222, local278, local390, local194, local250, local362, local6.aShort65 & 0xFFFF, local6.aShort62 & 0xFFFF, local6.aShort66 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort63);
					arg2.anInt658 = 0;
					return;
				}
				arg2.method542(local222, local278, local390, local194, local250, local362, local6.aShort65 & 0xFFFF, local6.aShort62 & 0xFFFF, local6.aShort66 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!wr;[I)V")
	@Override
	public void method3577(@OriginalArg(0) Class7_Sub30 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method3575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class33_Sub1 local3 = this.aClass51_Sub1_10.aClass33_Sub1_1;
		this.anInt4423 = -1;
		this.anInt4422 = local3.anInt1077;
		this.anInt4418 = local3.anInt1082;
		this.anInt4417 = local3.anInt1079;
		this.anInt4426 = local3.anInt1080;
		this.anInt4430 = local3.anInt1072;
		this.anInt4428 = local3.anInt1074;
		this.anInt4429 = local3.anInt1083;
		this.anInt4424 = local3.anInt1081;
		this.anInt4419 = local3.anInt1075;
		this.anInt4420 = local3.anInt1073;
		this.anInt4427 = local3.anInt1078;
		this.anInt4421 = local3.anInt1076;
	}
}
