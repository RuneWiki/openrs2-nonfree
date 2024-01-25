import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class77_Sub2 extends Class77 {

	@OriginalMember(owner = "client!op", name = "j", descriptor = "I")
	private int anInt4679;

	@OriginalMember(owner = "client!op", name = "l", descriptor = "I")
	private int anInt4680;

	@OriginalMember(owner = "client!op", name = "m", descriptor = "I")
	private int anInt4681;

	@OriginalMember(owner = "client!op", name = "n", descriptor = "[[Lclient!eh;")
	private Class60[][] aClass60ArrayArray1;

	@OriginalMember(owner = "client!op", name = "o", descriptor = "I")
	private int anInt4682;

	@OriginalMember(owner = "client!op", name = "p", descriptor = "I")
	private int anInt4683;

	@OriginalMember(owner = "client!op", name = "q", descriptor = "I")
	private int anInt4684;

	@OriginalMember(owner = "client!op", name = "s", descriptor = "I")
	private int anInt4685;

	@OriginalMember(owner = "client!op", name = "t", descriptor = "I")
	private int anInt4686;

	@OriginalMember(owner = "client!op", name = "u", descriptor = "I")
	private int anInt4687;

	@OriginalMember(owner = "client!op", name = "w", descriptor = "I")
	private int anInt4689;

	@OriginalMember(owner = "client!op", name = "z", descriptor = "I")
	private int anInt4690;

	@OriginalMember(owner = "client!op", name = "A", descriptor = "[[Lclient!ur;")
	private Class202[][] aClass202ArrayArray1;

	@OriginalMember(owner = "client!op", name = "C", descriptor = "I")
	private int anInt4692;

	@OriginalMember(owner = "client!op", name = "D", descriptor = "[[Lclient!qc;")
	private Class161[][] aClass161ArrayArray1;

	@OriginalMember(owner = "client!op", name = "F", descriptor = "[[Lclient!or;")
	private Class152[][] aClass152ArrayArray1;

	@OriginalMember(owner = "client!op", name = "k", descriptor = "Lclient!ma;")
	private final Class129_Sub1 aClass129_Sub1_9;

	@OriginalMember(owner = "client!op", name = "i", descriptor = "I")
	private final int anInt4678;

	@OriginalMember(owner = "client!op", name = "y", descriptor = "[[I")
	public final int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!op", name = "x", descriptor = "[[I")
	private final int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!op", name = "v", descriptor = "I")
	private final int anInt4688;

	@OriginalMember(owner = "client!op", name = "B", descriptor = "I")
	private int anInt4691;

	@OriginalMember(owner = "client!op", name = "E", descriptor = "[[B")
	private byte[][] aByteArrayArray34;

	@OriginalMember(owner = "client!op", name = "r", descriptor = "[[B")
	private byte[][] aByteArrayArray33;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lclient!ma;IIII[[I[[II)V")
	public Class77_Sub2(@OriginalArg(0) Class129_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4);
		this.aClass129_Sub1_9 = arg0;
		this.anInt4678 = arg2;
		this.anIntArrayArray53 = arg5;
		this.anIntArrayArray52 = arg6;
		this.anInt4688 = arg7;
		this.anInt4691 = 0;
		while (arg7 > 1) {
			this.anInt4691++;
			arg7 >>= 0x1;
		}
		this.aByteArrayArray34 = new byte[arg3 + 1][arg4 + 1];
		@Pc(50) int local50 = this.aClass129_Sub1_9.anInt3826 >> 9;
		for (@Pc(52) int local52 = 1; local52 < arg4; local52++) {
			for (@Pc(55) int local55 = 1; local55 < arg3; local55++) {
				@Pc(76) int local76 = this.anIntArrayArray53[local55 + 1][local52] - this.anIntArrayArray53[local55 - 1][local52];
				@Pc(94) int local94 = this.anIntArrayArray53[local55][local52 + 1] - this.anIntArrayArray53[local55][local52 - 1];
				@Pc(107) int local107 = (int) Math.sqrt((double) (local76 * local76 + local94 * local94 + 65536));
				@Pc(113) int local113 = (local76 << 8) / local107;
				@Pc(117) int local117 = -65536 / local107;
				@Pc(123) int local123 = (local94 << 8) / local107;
				@Pc(145) int local145 = local50 + (this.aClass129_Sub1_9.anInt3815 * local113 + this.aClass129_Sub1_9.anInt3809 * local117 + this.aClass129_Sub1_9.anInt3817 * local123 >> 17);
				local145 >>= 0x1;
				if (local145 < 2) {
					local145 = 2;
				} else if (local145 > 126) {
					local145 = 126;
				}
				this.aByteArrayArray34[local55][local52] = (byte) local145;
			}
		}
		this.aByteArrayArray33 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method4131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		if (this.aClass161ArrayArray1 == null) {
			this.aClass161ArrayArray1 = new Class161[super.anInt4673][super.anInt4672];
			this.aClass152ArrayArray1 = new Class152[super.anInt4673][super.anInt4672];
		} else if (this.aClass60ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg5.length; local32++) {
			if (arg5[local32] == -1) {
				arg5[local32] = 0;
			} else {
				arg5[local32] = Static315.anIntArray506[Static8.method81(arg5[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg6 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg6.length; local68++) {
				if (arg6[local68] == -1) {
					arg6[local68] = 0;
				} else {
					arg6[local68] = Static315.anIntArray506[Static8.method81(arg6[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == this.anInt4688 && arg4[local116] == 0) {
					if (local106 != -1 && arg5[local106] != arg5[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == this.anInt4688 && arg4[local116] == this.anInt4688) {
					if (local108 != -1 && arg5[local108] != arg5[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == this.anInt4688) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + this.anInt4688 && arg2[local244] != arg2[0] - this.anInt4688) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + this.anInt4688 && arg4[local244] != arg4[0] - this.anInt4688) {
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
			@Pc(334) Class161 local334 = new Class161();
			local244 = arg5[0];
			local342 = arg7[0];
			if (arg6 != null) {
				local334.anInt5111 = arg6[0] >> 8;
				if (local244 == 0) {
					local334.aByte64 = (byte) (local334.aByte64 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray53[arg0][arg1] == this.anIntArrayArray53[arg0 + 1][arg1] && this.anIntArrayArray53[arg0][arg1] == this.anIntArrayArray53[arg0 + 1][arg1 + 1] && this.anIntArrayArray53[arg0][arg1] == this.anIntArrayArray53[arg0][arg1 + 1]) {
				local334.aByte64 = (byte) (local334.aByte64 | 0x1);
			}
			if (local342 == -1 || (local334.aByte64 & 0x2) != 0 || this.aClass129_Sub1_9.anInterface2_4.method2244(local342).aBoolean256) {
				if (this.anIntArrayArray52 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray52[arg0][arg1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt5110 = Static150.method2274(Static370.method4142(arg5[local104] >> 8, this.aByteArrayArray34[arg0][arg1] - this.aByteArrayArray33[arg0][arg1]), local531, arg9);
				if (local334.anInt5111 != 0) {
					local334.anInt5110 |= this.aByteArrayArray33[arg0][arg1] + 255 - this.aByteArrayArray34[arg0][arg1] << 25;
				}
				if (this.anIntArrayArray52 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray52[arg0 + 1][arg1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt5113 = Static150.method2274(Static370.method4142(arg5[local106] >> 8, this.aByteArrayArray34[arg0 + 1][arg1] - this.aByteArrayArray33[arg0 + 1][arg1]), local531, arg9);
				if (local334.anInt5111 != 0) {
					local334.anInt5113 |= this.aByteArrayArray33[arg0 + 1][arg1] + 255 - this.aByteArrayArray34[arg0 + 1][arg1] << 25;
				}
				if (this.anIntArrayArray52 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray52[arg0 + 1][arg1 + 1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt5112 = Static150.method2274(Static370.method4142(arg5[local108] >> 8, this.aByteArrayArray34[arg0 + 1][arg1 + 1] - this.aByteArrayArray33[arg0 + 1][arg1 + 1]), local531, arg9);
				if (local334.anInt5111 != 0) {
					local334.anInt5112 |= this.aByteArrayArray33[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray34[arg0 + 1][arg1 + 1] << 25;
				}
				if (this.anIntArrayArray52 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray52[arg0][arg1 + 1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt5114 = Static150.method2274(Static370.method4142(arg5[local110] >> 8, this.aByteArrayArray34[arg0][arg1 + 1] - this.aByteArrayArray33[arg0][arg1 + 1]), local531, arg9);
				if (local334.anInt5111 != 0) {
					local334.anInt5114 |= this.aByteArrayArray33[arg0][arg1 + 1] + 255 - this.aByteArrayArray34[arg0][arg1 + 1] << 25;
				}
				local334.aShort75 = -1;
			} else {
				local334.anInt5110 = this.aByteArrayArray34[arg0][arg1] - this.aByteArrayArray33[arg0][arg1];
				local334.anInt5113 = this.aByteArrayArray34[arg0 + 1][arg1] - this.aByteArrayArray33[arg0 + 1][arg1];
				local334.anInt5112 = this.aByteArrayArray34[arg0 + 1][arg1 + 1] - this.aByteArrayArray33[arg0 + 1][arg1 + 1];
				local334.anInt5114 = this.aByteArrayArray34[arg0][arg1 + 1] - this.aByteArrayArray33[arg0][arg1 + 1];
				local334.aShort75 = (short) local342;
			}
			this.aClass161ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(886) Class152 local886 = new Class152();
		local886.aShort69 = (short) arg2.length;
		local886.aShort68 = (short) (arg2.length / 3);
		local886.aShortArray85 = new short[local886.aShort69];
		local886.aShortArray88 = new short[local886.aShort69];
		local886.aShortArray84 = new short[local886.aShort69];
		local886.anIntArray368 = new int[local886.aShort69];
		if (this.anIntArrayArray52 != null) {
			local886.aShortArray87 = new short[local886.aShort69];
		}
		@Pc(957) int local957;
		@Pc(1078) int local1078;
		@Pc(1125) int local1125;
		@Pc(1225) int local1225;
		@Pc(1344) int local1344;
		for (local244 = 0; local244 < local886.aShort69; local244++) {
			local342 = arg2[local244];
			local531 = arg4[local244];
			if (local342 == 0 && local531 == 0) {
				local957 = this.aByteArrayArray34[arg0][arg1] - this.aByteArrayArray33[arg0][arg1];
			} else if (local342 == 0 && local531 == this.anInt4688) {
				local957 = this.aByteArrayArray34[arg0][arg1 + 1] - this.aByteArrayArray33[arg0][arg1 + 1];
			} else if (local342 == this.anInt4688 && local531 == this.anInt4688) {
				local957 = this.aByteArrayArray34[arg0 + 1][arg1 + 1] - this.aByteArrayArray33[arg0 + 1][arg1 + 1];
			} else if (local342 == this.anInt4688 && local531 == 0) {
				local957 = this.aByteArrayArray34[arg0 + 1][arg1] - this.aByteArrayArray33[arg0 + 1][arg1];
			} else {
				local1078 = (this.aByteArrayArray34[arg0][arg1] - this.aByteArrayArray33[arg0][arg1]) * (this.anInt4688 - local342) + (this.aByteArrayArray34[arg0 + 1][arg1] - this.aByteArrayArray33[arg0 + 1][arg1]) * local342;
				local1125 = (this.aByteArrayArray34[arg0][arg1 + 1] - this.aByteArrayArray33[arg0][arg1 + 1]) * (this.anInt4688 - local342) + (this.aByteArrayArray34[arg0 + 1][arg1 + 1] - this.aByteArrayArray33[arg0 + 1][arg1 + 1]) * local342;
				local957 = local1078 * (this.anInt4688 - local531) + local1125 * local531 >> this.anInt4691 * 2;
			}
			@Pc(1149) short local1149 = (short) ((arg0 << this.anInt4691) + local342);
			@Pc(1157) short local1157 = (short) ((arg1 << this.anInt4691) + local531);
			local886.aShortArray85[local244] = local1149;
			local886.aShortArray84[local244] = local1157;
			local886.aShortArray88[local244] = (short) (this.method4133(local1149, local1157) + (arg3 == null ? 0 : arg3[local244]));
			if (local957 < 0) {
				local957 = 0;
			}
			if (arg7[local244] != -1 && !this.aClass129_Sub1_9.anInterface2_4.method2244(arg7[local244]).aBoolean256) {
				local886.anIntArray368[local244] = local957;
			} else if (arg5[local244] != 0) {
				local1225 = 0;
				if (this.anIntArrayArray52 != null) {
					@Pc(1241) int local1241;
					if (local342 == 0 && local531 == 0) {
						local1241 = this.anIntArrayArray52[arg0][arg1];
					} else if (local342 == 0 && local531 == this.anInt4688) {
						local1241 = this.anIntArrayArray52[arg0][arg1 + 1];
					} else if (local342 == this.anInt4688 && local531 == this.anInt4688) {
						local1241 = this.anIntArrayArray52[arg0 + 1][arg1 + 1];
					} else if (local342 == this.anInt4688 && local531 == 0) {
						local1241 = this.anIntArrayArray52[arg0 + 1][arg1];
					} else {
						@Pc(1317) int local1317 = this.anIntArrayArray52[arg0][arg1] * (this.anInt4688 - local342) + this.anIntArrayArray52[arg0 + 1][arg1] * local342;
						local1344 = this.anIntArrayArray52[arg0][arg1 + 1] * (this.anInt4688 - local342) + this.anIntArrayArray52[arg0 + 1][arg1 + 1] * local342;
						local1241 = local1317 * (this.anInt4688 - local531) + local1344 * local531 >> this.anInt4691 * 2;
					}
					local886.aShortArray87[local244] = (short) local1241;
					if (arg10 != 0) {
						local1225 = local1241 * 255 / arg10;
						if (local1225 < 0) {
							local1225 = 0;
						} else if (local1225 > 255) {
							local1225 = 255;
						}
					}
				}
				local886.anIntArray368[local244] = Static150.method2274(Static370.method4142(arg5[local244] >> 8, local957), local1225, arg9);
				if (arg6 != null) {
					local886.anIntArray368[local244] |= local957 << 25;
				}
			} else if (arg6 == null) {
				local886.anIntArray368[local244] = 0;
			} else {
				local886.anIntArray368[local244] = local957 << 25;
			}
		}
		@Pc(1424) boolean local1424 = false;
		for (local531 = 0; local531 < local886.aShort68; local531++) {
			if (arg7[local531 * 3] != -1 && !this.aClass129_Sub1_9.anInterface2_4.method2244(arg7[local531 * 3]).aBoolean256) {
				local1424 = true;
			}
		}
		if (arg6 != null) {
			local886.anIntArray369 = new int[local886.aShort68];
		}
		if (local1424) {
			local886.aShortArray86 = new short[local886.aShort68];
			local886.aShortArray83 = new short[local886.aShort68];
		}
		for (local957 = 0; local957 < local886.aShort68; local957++) {
			local1078 = local957 * 3;
			if (arg6 != null && arg6[local1078] != 0) {
				local886.anIntArray369[local957] = arg6[local1078] >> 8;
			}
			if (local1424) {
				local1125 = local1078 + 1;
				local1225 = local1125 + 1;
				@Pc(1506) boolean local1506 = false;
				@Pc(1508) boolean local1508 = true;
				local1344 = arg7[local1078];
				if (local1344 == -1 || this.aClass129_Sub1_9.anInterface2_4.method2244(local1344).aBoolean256) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				local1344 = arg7[local1125];
				if (local1344 == -1 || this.aClass129_Sub1_9.anInterface2_4.method2244(local1344).aBoolean256) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				local1344 = arg7[local1225];
				if (local1344 == -1 || this.aClass129_Sub1_9.anInterface2_4.method2244(local1344).aBoolean256) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				if (local1508) {
					local886.aShortArray86[local957] = (short) local1344;
					local886.aShortArray83[local957] = (short) arg8[local1078];
				} else {
					if (local1506) {
						local1344 = arg7[local1078];
						if (local1344 != -1 && !this.aClass129_Sub1_9.anInterface2_4.method2244(local1344).aBoolean256) {
							local886.anIntArray368[local1078] = Static315.anIntArray506[Static8.method81(this.aClass129_Sub1_9.anInterface2_4.method2244(local1344).aShort63 & 0xFFFF) & 0xFFFF];
						}
						local1344 = arg7[local1125];
						if (local1344 != -1 && !this.aClass129_Sub1_9.anInterface2_4.method2244(local1344).aBoolean256) {
							local886.anIntArray368[local1125] = Static315.anIntArray506[Static8.method81(this.aClass129_Sub1_9.anInterface2_4.method2244(local1344).aShort63 & 0xFFFF) & 0xFFFF];
						}
						local1344 = arg7[local1225];
						if (local1344 != -1 && !this.aClass129_Sub1_9.anInterface2_4.method2244(local1344).aBoolean256) {
							local886.anIntArray368[local1225] = Static315.anIntArray506[Static8.method81(this.aClass129_Sub1_9.anInterface2_4.method2244(local1344).aShort63 & 0xFFFF) & 0xFFFF];
						}
					}
					local886.aShortArray86[local957] = -1;
				}
			}
		}
		this.aClass152ArrayArray1[arg0][arg1] = local886;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIIIII[[ZLclient!oe;[I[I)V")
	private void method4138(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class148 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean303 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass60ArrayArray1[local22][local25] != null) {
						@Pc(50) Class60 local50 = this.aClass60ArrayArray1[local22][local25];
						if (local50.aShort4 != -1 && (local50.aByte6 & 0x2) == 0 && local50.anInt1349 == -1) {
							local69 = this.aClass129_Sub1_9.method3440(local50.aShort4);
							arg5.method4010(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static72.method1115(local69, local50.aShort2 & 0xFFFF), Static72.method1115(local69, local50.aShort5 & 0xFFFF), Static72.method1115(local69, local50.aShort3 & 0xFFFF));
							arg5.method4010(local20, local20, local20 - 4, local16, local16 + 4, local16, Static72.method1115(local69, local50.aShort1 & 0xFFFF), Static72.method1115(local69, local50.aShort3 & 0xFFFF), Static72.method1115(local69, local50.aShort5 & 0xFFFF));
						} else if (local50.anInt1349 == -1) {
							arg5.method4010(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort2 & 0xFFFF, local50.aShort5 & 0xFFFF, local50.aShort3 & 0xFFFF);
							arg5.method4010(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort1 & 0xFFFF, local50.aShort3 & 0xFFFF, local50.aShort5 & 0xFFFF);
						} else {
							local69 = local50.anInt1349;
							arg5.method4010(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method4010(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass202ArrayArray1[local22][local25] != null) {
						@Pc(249) Class202 local249 = this.aClass202ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort88; local69++) {
							arg6[local69] = local16 + (local249.anIntArray519[local69] - local22 * this.anInt4688) * 4 / this.anInt4688;
							arg7[local69] = local20 - (local249.anIntArray521[local69] - local25 * this.anInt4688) * 4 / this.anInt4688;
						}
						for (@Pc(297) int local297 = 0; local297 < local249.aShort89; local297++) {
							@Pc(303) short local303 = local249.aShortArray106[local297];
							@Pc(308) short local308 = local249.aShortArray109[local297];
							@Pc(313) short local313 = local249.aShortArray111[local297];
							@Pc(317) int local317 = arg6[local303];
							@Pc(321) int local321 = arg6[local308];
							@Pc(325) int local325 = arg6[local313];
							@Pc(329) int local329 = arg7[local303];
							@Pc(333) int local333 = arg7[local308];
							@Pc(337) int local337 = arg7[local313];
							@Pc(351) int local351;
							if (local249.anIntArray520 != null && local249.anIntArray520[local297] != -1) {
								local351 = local249.anIntArray520[local297];
								arg5.method4010(local329, local333, local337, local317, local321, local325, Static72.method1115(local351, local249.aShortArray107[local303]), Static72.method1115(local351, local249.aShortArray107[local308]), Static72.method1115(local351, local249.aShortArray107[local313]));
							} else if (local249.aShortArray108 == null || local249.aShortArray108[local297] == -1) {
								local351 = local249.anIntArray522[local297];
								arg5.method4010(local329, local333, local337, local317, local321, local325, Static72.method1115(local351, local249.aShortArray107[local303]), Static72.method1115(local351, local249.aShortArray107[local308]), Static72.method1115(local351, local249.aShortArray107[local313]));
							} else {
								local351 = this.aClass129_Sub1_9.method3440(local249.aShortArray108[local297]);
								arg5.method4010(local329, local333, local337, local317, local321, local325, Static72.method1115(local351, local249.aShortArray107[local303]), Static72.method1115(local351, local249.aShortArray107[local308]), Static72.method1115(local351, local249.aShortArray107[local313]));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean303 = true;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "()V")
	@Override
	public void method4124() {
		this.aByteArrayArray34 = null;
		this.aByteArrayArray33 = null;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method4125(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class184 local4 = this.aClass129_Sub1_9.method3446(Thread.currentThread());
		@Pc(7) Class148 local7 = local4.aClass148_2;
		local7.anInt4560 = 0;
		local7.aBoolean301 = false;
		if (this.aClass161ArrayArray1 != null) {
			this.method4140(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray459, local4.anIntArray479);
		} else if (this.aClass60ArrayArray1 != null) {
			this.method4138(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray459, local4.anIntArray479);
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIZLclient!oe;[I[I[I)V")
	private void method4139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class148 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class161 local6 = this.aClass161ArrayArray1[arg0][arg1];
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
			@Pc(1450) Class152 local1450 = this.aClass152ArrayArray1[arg0][arg1];
			if (local1450 != null) {
				for (local423 = 0; local423 < local1450.aShort69; local423++) {
					@Pc(1460) short local1460 = local1450.aShortArray85[local423];
					local29 = local1450.aShortArray88[local423];
					@Pc(1470) short local1470 = local1450.aShortArray84[local423];
					local367 = this.anInt4687 + (this.anInt4682 * local1460 + this.anInt4685 * local29 + this.anInt4686 * local1470 >> 15);
					if (local367 <= this.aClass129_Sub1_9.anInt3804) {
						return;
					}
					arg6[local423] = 0;
					if (arg2) {
						local283 = local367 - this.aClass129_Sub1_9.anInt3816;
						if (local283 > 255) {
							local283 = 255;
						}
						if (local283 > 0) {
							arg6[local423] = local283;
							local339 = local1450.aShortArray87[local423] * local283 / 255;
							if (local339 > 0) {
								local29 -= local339;
							}
						}
					} else if (this.aClass129_Sub1_9.aBoolean241) {
						local283 = local367 - this.aClass129_Sub1_9.anInt3816;
						if (local283 > 0) {
							arg6[local423] = local283;
							if (arg6[local423] > 255) {
								arg6[local423] = 255;
							}
						}
					}
					local255 = this.anInt4690 + (this.anInt4684 * local1460 + this.anInt4689 * local29 + this.anInt4692 * local1470 >> 15);
					local311 = this.anInt4683 + (this.anInt4681 * local1460 + this.anInt4680 * local29 + this.anInt4679 * local1470 >> 15);
					arg4[local423] = arg3.anInt4559 + local255 * this.aClass129_Sub1_9.anInt3811 / local367;
					arg5[local423] = arg3.anInt4558 + local311 * this.aClass129_Sub1_9.anInt3812 / local367;
				}
				if (local1450.aShortArray86 != null) {
					local283 = this.anIntArrayArray53[arg0][arg1];
					local339 = this.anIntArrayArray53[arg0 + 1][arg1];
					local395 = this.anIntArrayArray53[arg0][arg1 + 1];
					local451 = arg0 * this.anInt4688;
					local244 = local451 + this.anInt4688;
					local300 = arg1 * this.anInt4688;
					local356 = local300 + this.anInt4688;
					local412 = this.anInt4690 + (this.anInt4684 * local451 + this.anInt4689 * local283 + this.anInt4692 * local300 >> 15);
					local272 = this.anInt4683 + (this.anInt4681 * local451 + this.anInt4680 * local283 + this.anInt4679 * local300 >> 15);
					local328 = this.anInt4687 + (this.anInt4682 * local451 + this.anInt4685 * local283 + this.anInt4686 * local300 >> 15);
					local384 = this.anInt4690 + (this.anInt4684 * local244 + this.anInt4689 * local339 + this.anInt4692 * local300 >> 15);
					local440 = this.anInt4683 + (this.anInt4681 * local244 + this.anInt4680 * local339 + this.anInt4679 * local300 >> 15);
					local78 = this.anInt4687 + (this.anInt4682 * local244 + this.anInt4685 * local339 + this.anInt4686 * local300 >> 15);
					local101 = this.anInt4690 + (this.anInt4684 * local451 + this.anInt4689 * local395 + this.anInt4692 * local356 >> 15);
					local124 = this.anInt4683 + (this.anInt4681 * local451 + this.anInt4680 * local395 + this.anInt4679 * local356 >> 15);
					local147 = this.anInt4687 + (this.anInt4682 * local451 + this.anInt4685 * local395 + this.anInt4686 * local356 >> 15);
					for (local36 = 0; local36 < local1450.aShort68; local36++) {
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
							arg3.aBoolean301 = local163 < 0 || local56 < 0 || local61 < 0 || local163 > arg3.anInt4556 || local56 > arg3.anInt4556 || local61 > arg3.anInt4556;
							@Pc(1954) short local1954 = local1450.aShortArray86[local36];
							if (local1910 < 765) {
								if (local1954 != -1 && this.method4141(this.aClass129_Sub1_9.anInterface2_4.method2244(local1954).aByte42)) {
									arg3.anInt4560 = 100;
								}
								if (local1910 > 0) {
									if (local1954 != -1) {
										arg3.method4009(local222, local227, local620, local163, local56, local61, this.aClass129_Sub1_9.anInt3797, arg6[local38], arg6[local40], arg6[local42], local1450.anIntArray368[local38], local1450.anIntArray368[local40], local1450.anIntArray368[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1954);
									} else if ((local1450.anIntArray368[local38] & 0xFFFFFF) != 0) {
										arg3.method4006(local222, local227, local620, local163, local56, local61, Static75.method1149(arg6[local38] << 24 | this.aClass129_Sub1_9.anInt3797, local1450.anIntArray368[local38]), Static75.method1149(arg6[local40] << 24 | this.aClass129_Sub1_9.anInt3797, local1450.anIntArray368[local40]), Static75.method1149(arg6[local42] << 24 | this.aClass129_Sub1_9.anInt3797, local1450.anIntArray368[local42]));
									}
								} else if (local1954 != -1) {
									arg3.method4003(local222, local227, local620, local163, local56, local61, local1450.anIntArray368[local38], local1450.anIntArray368[local40], local1450.anIntArray368[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1954);
								} else if ((local1450.anIntArray368[local38] & 0xFFFFFF) != 0) {
									arg3.method4006(local222, local227, local620, local163, local56, local61, local1450.anIntArray368[local38], local1450.anIntArray368[local40], local1450.anIntArray368[local42]);
								}
								arg3.anInt4560 = 0;
							} else {
								arg3.method4008(local222, local227, local620, local163, local56, local61, this.aClass129_Sub1_9.anInt3797);
							}
						}
					}
					return;
				}
				for (local283 = 0; local283 < local1450.aShort68; local283++) {
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
						arg3.aBoolean301 = local244 < 0 || local300 < 0 || local356 < 0 || local244 > arg3.anInt4556 || local300 > arg3.anInt4556 || local356 > arg3.anInt4556;
						if (local384 >= 765) {
							arg3.method4008(local412, local272, local328, local244, local300, local356, this.aClass129_Sub1_9.anInt3797);
						} else if (local384 > 0) {
							if ((local1450.anIntArray368[local339] & 0xFFFFFF) != 0) {
								arg3.method4006(local412, local272, local328, local244, local300, local356, Static150.method2274(local1450.anIntArray368[local339], arg6[local339], this.aClass129_Sub1_9.anInt3797), Static150.method2274(local1450.anIntArray368[local395], arg6[local395], this.aClass129_Sub1_9.anInt3797), Static150.method2274(local1450.anIntArray368[local451], arg6[local451], this.aClass129_Sub1_9.anInt3797));
							}
						} else if ((local1450.anIntArray368[local339] & 0xFFFFFF) != 0) {
							arg3.method4006(local412, local272, local328, local244, local300, local356, local1450.anIntArray368[local339], local1450.anIntArray368[local395], local1450.anIntArray368[local451]);
						}
					}
				}
			}
		} else if ((local6.aByte64 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt4688;
			@Pc(24) int local24 = local19 + this.anInt4688;
			local29 = arg1 * this.anInt4688;
			@Pc(34) int local34 = local29 + this.anInt4688;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte64 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray53[arg0][arg1];
				local61 = this.anIntArrayArray53[arg0 + 1][arg1];
				local222 = this.anIntArrayArray53[arg0 + 1][arg1 + 1];
				local227 = this.anIntArrayArray53[arg0][arg1 + 1];
				local78 = this.anInt4687 + (this.anInt4682 * local19 + this.anInt4685 * local56 + this.anInt4686 * local29 >> 15);
				if (local78 <= this.aClass129_Sub1_9.anInt3804) {
					return;
				}
				local101 = this.anInt4687 + (this.anInt4682 * local24 + this.anInt4685 * local61 + this.anInt4686 * local29 >> 15);
				if (local101 <= this.aClass129_Sub1_9.anInt3804) {
					return;
				}
				local124 = this.anInt4687 + (this.anInt4682 * local24 + this.anInt4685 * local222 + this.anInt4686 * local34 >> 15);
				if (local124 <= this.aClass129_Sub1_9.anInt3804) {
					return;
				}
				local147 = this.anInt4687 + (this.anInt4682 * local19 + this.anInt4685 * local227 + this.anInt4686 * local34 >> 15);
				if (local147 <= this.aClass129_Sub1_9.anInt3804) {
					return;
				}
				if (arg2) {
					local163 = local78 - this.aClass129_Sub1_9.anInt3816;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local36 = local163;
						local620 = this.anIntArrayArray52[arg0][arg1] * local163 / 255;
						if (local620 > 0) {
							local56 -= local620;
						}
					}
					local163 = local101 - this.aClass129_Sub1_9.anInt3816;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local38 = local163;
						local620 = this.anIntArrayArray52[arg0 + 1][arg1] * local163 / 255;
						if (local620 > 0) {
							local61 -= local620;
						}
					}
					local163 = local124 - this.aClass129_Sub1_9.anInt3816;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local40 = local163;
						local620 = this.anIntArrayArray52[arg0 + 1][arg1 + 1] * local163 / 255;
						if (local620 > 0) {
							local222 -= local620;
						}
					}
					local163 = local147 - this.aClass129_Sub1_9.anInt3816;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local42 = local163;
						local620 = this.anIntArrayArray52[arg0][arg1 + 1] * local163 / 255;
						if (local620 > 0) {
							local227 -= local620;
						}
					}
				} else if (this.aClass129_Sub1_9.aBoolean241) {
					local163 = local78 - this.aClass129_Sub1_9.anInt3816;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass129_Sub1_9.anInt3816;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass129_Sub1_9.anInt3816;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass129_Sub1_9.anInt3816;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local244 = this.anInt4690 + (this.anInt4684 * local19 + this.anInt4689 * local56 + this.anInt4692 * local29 >> 15);
				local255 = arg3.anInt4559 + local244 * this.aClass129_Sub1_9.anInt3811 / local78;
				local272 = this.anInt4683 + (this.anInt4681 * local19 + this.anInt4680 * local56 + this.anInt4679 * local29 >> 15);
				local283 = arg3.anInt4558 + local272 * this.aClass129_Sub1_9.anInt3812 / local78;
				local300 = this.anInt4690 + (this.anInt4684 * local24 + this.anInt4689 * local61 + this.anInt4692 * local29 >> 15);
				local311 = arg3.anInt4559 + local300 * this.aClass129_Sub1_9.anInt3811 / local101;
				local328 = this.anInt4683 + (this.anInt4681 * local24 + this.anInt4680 * local61 + this.anInt4679 * local29 >> 15);
				local339 = arg3.anInt4558 + local328 * this.aClass129_Sub1_9.anInt3812 / local101;
				local356 = this.anInt4690 + (this.anInt4684 * local24 + this.anInt4689 * local222 + this.anInt4692 * local34 >> 15);
				local367 = arg3.anInt4559 + local356 * this.aClass129_Sub1_9.anInt3811 / local124;
				local384 = this.anInt4683 + (this.anInt4681 * local24 + this.anInt4680 * local222 + this.anInt4679 * local34 >> 15);
				local395 = arg3.anInt4558 + local384 * this.aClass129_Sub1_9.anInt3812 / local124;
				local412 = this.anInt4690 + (this.anInt4684 * local19 + this.anInt4689 * local227 + this.anInt4692 * local34 >> 15);
				local423 = arg3.anInt4559 + local412 * this.aClass129_Sub1_9.anInt3811 / local147;
				local440 = this.anInt4683 + (this.anInt4681 * local19 + this.anInt4680 * local227 + this.anInt4679 * local34 >> 15);
				local451 = arg3.anInt4558 + local440 * this.aClass129_Sub1_9.anInt3812 / local147;
			} else {
				local56 = this.anIntArrayArray53[arg0][arg1];
				local61 = this.anInt4685 * local56;
				local78 = this.anInt4687 + (this.anInt4682 * local19 + local61 + this.anInt4686 * local29 >> 15);
				if (local78 <= this.aClass129_Sub1_9.anInt3804) {
					return;
				}
				local101 = this.anInt4687 + (this.anInt4682 * local24 + local61 + this.anInt4686 * local29 >> 15);
				if (local101 <= this.aClass129_Sub1_9.anInt3804) {
					return;
				}
				local124 = this.anInt4687 + (this.anInt4682 * local24 + local61 + this.anInt4686 * local34 >> 15);
				if (local124 <= this.aClass129_Sub1_9.anInt3804) {
					return;
				}
				local147 = this.anInt4687 + (this.anInt4682 * local19 + local61 + this.anInt4686 * local34 >> 15);
				if (local147 <= this.aClass129_Sub1_9.anInt3804) {
					return;
				}
				if (this.aClass129_Sub1_9.aBoolean241) {
					local163 = local78 - this.aClass129_Sub1_9.anInt3816;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass129_Sub1_9.anInt3816;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass129_Sub1_9.anInt3816;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass129_Sub1_9.anInt3816;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local222 = this.anInt4689 * local56;
				local227 = this.anInt4680 * local56;
				local244 = this.anInt4690 + (this.anInt4684 * local19 + local222 + this.anInt4692 * local29 >> 15);
				local255 = arg3.anInt4559 + local244 * this.aClass129_Sub1_9.anInt3811 / local78;
				local272 = this.anInt4683 + (this.anInt4681 * local19 + local227 + this.anInt4679 * local29 >> 15);
				local283 = arg3.anInt4558 + local272 * this.aClass129_Sub1_9.anInt3812 / local78;
				local300 = this.anInt4690 + (this.anInt4684 * local24 + local222 + this.anInt4692 * local29 >> 15);
				local311 = arg3.anInt4559 + local300 * this.aClass129_Sub1_9.anInt3811 / local101;
				local328 = this.anInt4683 + (this.anInt4681 * local24 + local227 + this.anInt4679 * local29 >> 15);
				local339 = arg3.anInt4558 + local328 * this.aClass129_Sub1_9.anInt3812 / local101;
				local356 = this.anInt4690 + (this.anInt4684 * local24 + local222 + this.anInt4692 * local34 >> 15);
				local367 = arg3.anInt4559 + local356 * this.aClass129_Sub1_9.anInt3811 / local124;
				local384 = this.anInt4683 + (this.anInt4681 * local24 + local227 + this.anInt4679 * local34 >> 15);
				local395 = arg3.anInt4558 + local384 * this.aClass129_Sub1_9.anInt3812 / local124;
				local412 = this.anInt4690 + (this.anInt4684 * local19 + local222 + this.anInt4692 * local34 >> 15);
				local423 = arg3.anInt4559 + local412 * this.aClass129_Sub1_9.anInt3811 / local147;
				local440 = this.anInt4683 + (this.anInt4681 * local19 + local227 + this.anInt4679 * local34 >> 15);
				local451 = arg3.anInt4558 + local440 * this.aClass129_Sub1_9.anInt3812 / local147;
			}
			@Pc(1062) boolean local1062 = local6.aShort75 != -1 && this.method4141(this.aClass129_Sub1_9.anInterface2_4.method2244(local6.aShort75).aByte42);
			local61 = local38 + local40 + local42;
			if ((local367 - local423) * (local339 - local451) - (local395 - local451) * (local311 - local423) > 0) {
				arg3.aBoolean301 = local367 < 0 || local423 < 0 || local311 < 0 || local367 > arg3.anInt4556 || local423 > arg3.anInt4556 || local311 > arg3.anInt4556;
				if (local61 < 765) {
					if (local1062) {
						arg3.anInt4560 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort75 >= 0) {
							arg3.method4009(local395, local451, local339, local367, local423, local311, this.aClass129_Sub1_9.anInt3797, local40, local42, local38, local6.anInt5112, local6.anInt5114, local6.anInt5113, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort75);
						} else {
							arg3.method4006(local395, local451, local339, local367, local423, local311, Static75.method1149(local40 << 24 | this.aClass129_Sub1_9.anInt3797, local6.anInt5112), Static75.method1149(local42 << 24 | this.aClass129_Sub1_9.anInt3797, local6.anInt5114), Static75.method1149(local38 << 24 | this.aClass129_Sub1_9.anInt3797, local6.anInt5113));
						}
					} else if (local6.aShort75 >= 0) {
						arg3.method4003(local395, local451, local339, local367, local423, local311, local6.anInt5112, local6.anInt5114, local6.anInt5113, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort75);
					} else {
						arg3.method4006(local395, local451, local339, local367, local423, local311, local6.anInt5112, local6.anInt5114, local6.anInt5113);
					}
					arg3.anInt4560 = 0;
				} else {
					arg3.method4008(local395, local451, local339, local367, local423, local311, this.aClass129_Sub1_9.anInt3797);
				}
			}
			local61 = local36 + local38 + local42;
			if ((local255 - local311) * (local451 - local339) - (local283 - local339) * (local423 - local311) > 0) {
				arg3.aBoolean301 = local255 < 0 || local311 < 0 || local423 < 0 || local255 > arg3.anInt4556 || local311 > arg3.anInt4556 || local423 > arg3.anInt4556;
				if (local61 < 765) {
					if (local1062) {
						arg3.anInt4560 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort75 >= 0) {
							arg3.method4009(local283, local339, local451, local255, local311, local423, this.aClass129_Sub1_9.anInt3797, local36, local38, local42, local6.anInt5110, local6.anInt5113, local6.anInt5114, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort75);
						} else {
							arg3.method4006(local283, local339, local451, local255, local311, local423, Static75.method1149(local36 << 24 | this.aClass129_Sub1_9.anInt3797, local6.anInt5110), Static75.method1149(local38 << 24 | this.aClass129_Sub1_9.anInt3797, local6.anInt5113), Static75.method1149(local42 << 24 | this.aClass129_Sub1_9.anInt3797, local6.anInt5114));
						}
					} else if (local6.aShort75 >= 0) {
						arg3.method4003(local283, local339, local451, local255, local311, local423, local6.anInt5110, local6.anInt5113, local6.anInt5114, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort75);
					} else {
						arg3.method4006(local283, local339, local451, local255, local311, local423, local6.anInt5110, local6.anInt5113, local6.anInt5114);
					}
					arg3.anInt4560 = 0;
					return;
				}
				arg3.method4008(local283, local339, local451, local255, local311, local423, this.aClass129_Sub1_9.anInt3797);
			}
		}
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(II)I")
	@Override
	public int method4133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> this.anInt4691;
		@Pc(9) int local9 = arg1 >> this.anInt4691;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt4673 - 1 || local9 > super.anInt4672 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & this.anInt4688 - 1;
		@Pc(41) int local41 = arg1 & this.anInt4688 - 1;
		@Pc(67) int local67 = this.anIntArrayArray53[local4][local9] * (this.anInt4688 - local34) + this.anIntArrayArray53[local4 + 1][local9] * local34 >> this.anInt4691;
		@Pc(97) int local97 = this.anIntArrayArray53[local4][local9 + 1] * (this.anInt4688 - local34) + this.anIntArrayArray53[local4 + 1][local9 + 1] * local34 >> this.anInt4691;
		return local67 * (this.anInt4688 - local41) + local97 * local41 >> this.anInt4691;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!mc;IIIIZ)Z")
	@Override
	public boolean method4126(@OriginalArg(0) Class11_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!bh;[I)V")
	@Override
	public void method4137(@OriginalArg(0) Class11_Sub5 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(IIIIIII[[ZLclient!oe;[I[I)V")
	private void method4140(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class148 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean303 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass161ArrayArray1[local22][local25] != null) {
						@Pc(50) Class161 local50 = this.aClass161ArrayArray1[local22][local25];
						if (local50.aShort75 != -1 && (local50.aByte64 & 0x2) == 0 && local50.anInt5111 == 0) {
							local68 = this.aClass129_Sub1_9.method3440(local50.aShort75);
							arg5.method4010(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static72.method1115(local68, local50.anInt5112), Static72.method1115(local68, local50.anInt5114), Static72.method1115(local68, local50.anInt5113));
							arg5.method4010(local20, local20, local20 - 4, local16, local16 + 4, local16, Static72.method1115(local68, local50.anInt5110), Static72.method1115(local68, local50.anInt5113), Static72.method1115(local68, local50.anInt5114));
						} else if (local50.anInt5111 == 0) {
							arg5.method4006(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt5112, local50.anInt5114, local50.anInt5113);
							arg5.method4006(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt5110, local50.anInt5113, local50.anInt5114);
						} else {
							local68 = local50.anInt5111;
							arg5.method4006(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static75.method1149(local50.anInt5112 & 0xFF000000, local68), Static75.method1149(local50.anInt5114 & 0xFF000000, local68), Static75.method1149(local50.anInt5113 & 0xFF000000, local68));
							arg5.method4006(local20, local20, local20 - 4, local16, local16 + 4, local16, Static75.method1149(local50.anInt5110 & 0xFF000000, local68), Static75.method1149(local50.anInt5113 & 0xFF000000, local68), Static75.method1149(local50.anInt5114 & 0xFF000000, local68));
						}
					} else if (this.aClass152ArrayArray1[local22][local25] != null) {
						@Pc(259) Class152 local259 = this.aClass152ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort69; local68++) {
							arg6[local68] = local16 + (local259.aShortArray85[local68] - local22 * this.anInt4688) * 4 / this.anInt4688;
							arg7[local68] = local20 - (local259.aShortArray84[local68] - local25 * this.anInt4688) * 4 / this.anInt4688;
						}
						for (@Pc(307) int local307 = 0; local307 < local259.aShort68; local307++) {
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
							if (local259.anIntArray369 != null && local259.anIntArray369[local307] != 0 && (local259.aShortArray86 == null || local259.aShortArray86 != null && local259.aShortArray86[local307] == -1)) {
								local369 = local259.anIntArray369[local307];
								arg5.method4006(local336, local340, local344, local324, local328, local332, Static75.method1149(-(local259.anIntArray368[local312] & -16777216) - 16777216, local369), Static75.method1149(-(local259.anIntArray368[local316] & -16777216) - 16777216, local369), Static75.method1149(-(local259.anIntArray368[local320] & -16777216) - 16777216, local369));
							} else if (local259.aShortArray86 == null || local259.aShortArray86[local307] == -1) {
								arg5.method4006(local336, local340, local344, local324, local328, local332, local259.anIntArray368[local312], local259.anIntArray368[local316], local259.anIntArray368[local320]);
							} else {
								local369 = this.aClass129_Sub1_9.method3440(local259.aShortArray86[local307]);
								arg5.method4010(local336, local340, local344, local324, local328, local332, local369, local369, local369);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean303 = true;
	}

	@OriginalMember(owner = "client!op", name = "c", descriptor = "(I)Z")
	private boolean method4141(@OriginalArg(0) int arg0) {
		if ((this.anInt4678 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else {
			return arg0 == 8;
		}
	}

	@OriginalMember(owner = "client!op", name = "c", descriptor = "(II)V")
	@Override
	public void method4136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class184 local4 = this.aClass129_Sub1_9.method3446(Thread.currentThread());
		local4.aClass148_2.anInt4560 = 0;
		if (this.aClass161ArrayArray1 != null) {
			this.method4139(arg0, arg1, this.aClass129_Sub1_9.aBoolean244, local4.aClass148_2, local4.anIntArray459, local4.anIntArray479, local4.anIntArray472);
		} else if (this.aClass60ArrayArray1 != null) {
			this.method4143(arg0, arg1, local4.aClass148_2, local4.anIntArray459, local4.anIntArray479, local4.anIntArray472);
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method4134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class61_Sub1 local3 = this.aClass129_Sub1_9.aClass61_Sub1_2;
		this.anInt4684 = local3.anInt1369;
		this.anInt4689 = local3.anInt1365;
		this.anInt4692 = local3.anInt1371;
		this.anInt4690 = local3.anInt1370;
		this.anInt4681 = local3.anInt1360;
		this.anInt4680 = local3.anInt1367;
		this.anInt4679 = local3.anInt1364;
		this.anInt4683 = local3.anInt1366;
		this.anInt4682 = local3.anInt1368;
		this.anInt4685 = local3.anInt1363;
		this.anInt4686 = local3.anInt1362;
		this.anInt4687 = local3.anInt1361;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method4119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		if (this.aClass60ArrayArray1 == null) {
			this.aClass60ArrayArray1 = new Class60[super.anInt4673][super.anInt4672];
			this.aClass202ArrayArray1 = new Class202[super.anInt4673][super.anInt4672];
		} else if (this.aClass161ArrayArray1 != null) {
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
				if (local64 != 0 && local64 != this.anInt4688 || local70 != 0 && local70 != this.anInt4688) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class202 local95 = new Class202();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg8.length;
			local95.aShort88 = local99;
			local95.aShortArray107 = new short[local99];
			local95.anIntArray519 = new int[local99];
			local95.anIntArray523 = new int[local99];
			local95.anIntArray521 = new int[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray107[local124] = (short) (this.aByteArrayArray34[arg0][arg1] - this.aByteArrayArray33[arg0][arg1]);
				} else if (local129 == 0 && local133 == this.anInt4688) {
					local95.aShortArray107[local124] = (short) (this.aByteArrayArray34[arg0][arg1 + 1] - this.aByteArrayArray33[arg0][arg1 + 1]);
				} else if (local129 == this.anInt4688 && local133 == this.anInt4688) {
					local95.aShortArray107[local124] = (short) (this.aByteArrayArray34[arg0 + 1][arg1 + 1] - this.aByteArrayArray33[arg0 + 1][arg1 + 1]);
				} else if (local129 == this.anInt4688 && local133 == 0) {
					local95.aShortArray107[local124] = (short) (this.aByteArrayArray34[arg0 + 1][arg1] - this.aByteArrayArray33[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray34[arg0][arg1] - this.aByteArrayArray33[arg0][arg1]) * (this.anInt4688 - local129) + (this.aByteArrayArray34[arg0 + 1][arg1] - this.aByteArrayArray33[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray34[arg0][arg1 + 1] - this.aByteArrayArray33[arg0][arg1 + 1]) * (this.anInt4688 - local129) + (this.aByteArrayArray34[arg0 + 1][arg1 + 1] - this.aByteArrayArray33[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray107[local124] = (short) (local288 * (this.anInt4688 - local133) + local335 * local133 >> this.anInt4691 * 2);
				}
				local288 = (arg0 << this.anInt4691) + local129;
				local335 = (arg1 << this.anInt4691) + local133;
				local95.anIntArray519[local124] = local288;
				local95.anIntArray521[local124] = local335;
				local95.anIntArray523[local124] = this.method4133(local288, local335) + (arg3 == null ? 0 : arg3[local124]);
				if (local95.aShortArray107[local124] < 2) {
					local95.aShortArray107[local124] = 2;
				}
			}
			@Pc(412) boolean local412 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg8[local288] >= 0 || arg9 != null && arg9[local288] >= 0) {
					local133++;
				}
				if (arg10[local288] != -1 && !this.aClass129_Sub1_9.anInterface2_4.method2244(arg10[local288]).aBoolean256) {
					local412 = true;
				}
			}
			local95.anIntArray522 = new int[local133];
			if (arg9 != null) {
				local95.anIntArray520 = new int[local133];
			}
			local95.aShortArray106 = new short[local133];
			local95.aShortArray109 = new short[local133];
			local95.aShortArray111 = new short[local133];
			if (local412) {
				local95.aShortArray108 = new short[local133];
				local95.aShortArray110 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg8[local335] >= 0 || arg9 != null && arg9[local335] >= 0) {
					if (arg8[local335] >= 0) {
						local95.anIntArray522[local95.aShort89] = Static8.method81(arg8[local335]);
					} else {
						local95.anIntArray522[local95.aShort89] = -1;
					}
					if (arg9 != null) {
						if (arg9[local335] == -1) {
							local95.anIntArray520[local95.aShort89] = -1;
						} else {
							local95.anIntArray520[local95.aShort89] = Static8.method81(arg9[local335]);
						}
					}
					local95.aShortArray106[local95.aShort89] = (short) arg5[local335];
					local95.aShortArray109[local95.aShort89] = (short) arg6[local335];
					local95.aShortArray111[local95.aShort89] = (short) arg7[local335];
					if (local412) {
						if (arg10[local335] == -1 || this.aClass129_Sub1_9.anInterface2_4.method2244(arg10[local335]).aBoolean256) {
							local95.aShortArray108[local95.aShort89] = -1;
						} else {
							local95.aShortArray108[local95.aShort89] = (short) arg10[local335];
							local95.aShortArray110[local95.aShort89] = (short) arg11[local335];
						}
					}
					local95.aShort89++;
				}
			}
			this.aClass202ArrayArray1[arg0][arg1] = local95;
		} else if (arg8[0] >= 0 || arg9 != null && arg9[0] >= 0) {
			@Pc(641) Class60 local641 = new Class60();
			local64 = arg8[0];
			local70 = arg10[0];
			if (arg9 != null) {
				local641.anInt1349 = Static72.method1115(Static8.method81(arg9[0]), this.aByteArrayArray34[arg0][arg1] - this.aByteArrayArray33[arg0][arg1]);
				if (local64 == -1) {
					local641.aByte6 = (byte) (local641.aByte6 | 0x2);
				}
			}
			if (this.anIntArrayArray53[arg0][arg1] == this.anIntArrayArray53[arg0 + 1][arg1] && this.anIntArrayArray53[arg0][arg1] == this.anIntArrayArray53[arg0 + 1][arg1 + 1] && this.anIntArrayArray53[arg0][arg1] == this.anIntArrayArray53[arg0][arg1 + 1]) {
				local641.aByte6 = (byte) (local641.aByte6 | 0x1);
			}
			if (local70 == -1 || (local641.aByte6 & 0x2) != 0 || this.aClass129_Sub1_9.anInterface2_4.method2244(local70).aBoolean256) {
				@Pc(842) short local842 = Static8.method81(local64);
				local641.aShort1 = (short) Static72.method1115(local842, this.aByteArrayArray34[arg0][arg1] - this.aByteArrayArray33[arg0][arg1]);
				local641.aShort3 = (short) Static72.method1115(local842, this.aByteArrayArray34[arg0 + 1][arg1] - this.aByteArrayArray33[arg0 + 1][arg1]);
				local641.aShort2 = (short) Static72.method1115(local842, this.aByteArrayArray34[arg0 + 1][arg1 + 1] - this.aByteArrayArray33[arg0 + 1][arg1 + 1]);
				local641.aShort5 = (short) Static72.method1115(local842, this.aByteArrayArray34[arg0][arg1 + 1] - this.aByteArrayArray33[arg0][arg1 + 1]);
				local641.aShort4 = -1;
			} else {
				local641.aShort1 = (short) (this.aByteArrayArray34[arg0][arg1] - this.aByteArrayArray33[arg0][arg1]);
				local641.aShort3 = (short) (this.aByteArrayArray34[arg0 + 1][arg1] - this.aByteArrayArray33[arg0 + 1][arg1]);
				local641.aShort2 = (short) (this.aByteArrayArray34[arg0 + 1][arg1 + 1] - this.aByteArrayArray33[arg0 + 1][arg1 + 1]);
				local641.aShort5 = (short) (this.aByteArrayArray34[arg0][arg1 + 1] - this.aByteArrayArray33[arg0][arg1 + 1]);
				local641.aShort4 = (short) local70;
			}
			this.aClass60ArrayArray1[arg0][arg1] = local641;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IILclient!mc;)Lclient!mc;")
	@Override
	public Class11_Sub4_Sub4 method4128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class11_Sub4_Sub4 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IILclient!oe;[I[I[I)V")
	private void method4143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class148 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class60 local6 = this.aClass60ArrayArray1[arg0][arg1];
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
			@Pc(996) Class202 local996 = this.aClass202ArrayArray1[arg0][arg1];
			if (local996 != null) {
				for (local349 = 0; local349 < local996.aShort88; local349++) {
					local24 = local996.anIntArray519[local349];
					local29 = local996.anIntArray523[local349];
					local34 = local996.anIntArray521[local349];
					local293 = this.anInt4687 + (this.anInt4682 * local24 + this.anInt4685 * local29 + this.anInt4686 * local34 >> 15);
					if (local293 <= this.aClass129_Sub1_9.anInt3804) {
						return;
					}
					local181 = this.anInt4690 + (this.anInt4684 * local24 + this.anInt4689 * local29 + this.anInt4692 * local34 >> 15);
					local237 = this.anInt4683 + (this.anInt4681 * local24 + this.anInt4680 * local29 + this.anInt4679 * local34 >> 15);
					arg3[local349] = arg2.anInt4559 + local181 * this.aClass129_Sub1_9.anInt3811 / local293;
					arg4[local349] = arg2.anInt4558 + local237 * this.aClass129_Sub1_9.anInt3812 / local293;
				}
				if (local996.aShortArray108 != null) {
					local209 = this.anIntArrayArray53[arg0][arg1];
					local265 = this.anIntArrayArray53[arg0 + 1][arg1];
					local321 = this.anIntArrayArray53[arg0][arg1 + 1];
					local377 = arg0 * this.anInt4688;
					local170 = local377 + this.anInt4688;
					local226 = arg1 * this.anInt4688;
					local282 = local226 + this.anInt4688;
					local338 = this.anInt4690 + (this.anInt4684 * local377 + this.anInt4689 * local209 + this.anInt4692 * local226 >> 15);
					local198 = this.anInt4683 + (this.anInt4681 * local377 + this.anInt4680 * local209 + this.anInt4679 * local226 >> 15);
					local254 = this.anInt4687 + (this.anInt4682 * local377 + this.anInt4685 * local209 + this.anInt4686 * local226 >> 15);
					local310 = this.anInt4690 + (this.anInt4684 * local170 + this.anInt4689 * local265 + this.anInt4692 * local226 >> 15);
					local366 = this.anInt4683 + (this.anInt4681 * local170 + this.anInt4680 * local265 + this.anInt4679 * local226 >> 15);
					local68 = this.anInt4687 + (this.anInt4682 * local170 + this.anInt4685 * local265 + this.anInt4686 * local226 >> 15);
					local91 = this.anInt4690 + (this.anInt4684 * local377 + this.anInt4689 * local321 + this.anInt4692 * local282 >> 15);
					local114 = this.anInt4683 + (this.anInt4681 * local377 + this.anInt4680 * local321 + this.anInt4679 * local282 >> 15);
					local137 = this.anInt4687 + (this.anInt4682 * local377 + this.anInt4685 * local321 + this.anInt4686 * local282 >> 15);
					for (local46 = 0; local46 < local996.aShort89; local46++) {
						@Pc(1349) short local1349 = local996.aShortArray106[local46];
						@Pc(1354) short local1354 = local996.aShortArray109[local46];
						@Pc(1359) short local1359 = local996.aShortArray111[local46];
						@Pc(1363) int local1363 = arg3[local1349];
						@Pc(1367) int local1367 = arg3[local1354];
						@Pc(1371) int local1371 = arg3[local1359];
						@Pc(1375) int local1375 = arg4[local1349];
						@Pc(1379) int local1379 = arg4[local1354];
						@Pc(1383) int local1383 = arg4[local1359];
						if ((local1363 - local1367) * (local1383 - local1379) - (local1375 - local1379) * (local1371 - local1367) > 0) {
							arg2.aBoolean301 = local1363 < 0 || local1367 < 0 || local1371 < 0 || local1363 > arg2.anInt4556 || local1367 > arg2.anInt4556 || local1371 > arg2.anInt4556;
							@Pc(1427) short local1427 = local996.aShortArray108[local46];
							if (local1427 == -1) {
								@Pc(1482) int local1482 = local996.anIntArray522[local46];
								if (local1482 != -1) {
									arg2.method4010(local1375, local1379, local1383, local1363, local1367, local1371, Static72.method1115(local1482, local996.aShortArray107[local1349]), Static72.method1115(local1482, local996.aShortArray107[local1354]), Static72.method1115(local1482, local996.aShortArray107[local1359]));
								}
							} else {
								if (this.method4141(this.aClass129_Sub1_9.anInterface2_4.method2244(local1427).aByte42)) {
									arg2.anInt4560 = 100;
								}
								arg2.method4003(local1375, local1379, local1383, local1363, local1367, local1371, local996.aShortArray107[local1349], local996.aShortArray107[local1354], local996.aShortArray107[local1359], local338, local310, local91, local198, local366, local114, local254, local68, local137, local1427);
								arg2.anInt4560 = 0;
							}
						}
					}
					return;
				}
				for (local209 = 0; local209 < local996.aShort89; local209++) {
					@Pc(1528) short local1528 = local996.aShortArray106[local209];
					@Pc(1533) short local1533 = local996.aShortArray109[local209];
					@Pc(1538) short local1538 = local996.aShortArray111[local209];
					local170 = arg3[local1528];
					local226 = arg3[local1533];
					local282 = arg3[local1538];
					local338 = arg4[local1528];
					local198 = arg4[local1533];
					local254 = arg4[local1538];
					if ((local170 - local226) * (local254 - local198) - (local338 - local198) * (local282 - local226) > 0) {
						local310 = local996.anIntArray522[local209];
						if (local310 != -1) {
							arg2.aBoolean301 = local170 < 0 || local226 < 0 || local282 < 0 || local170 > arg2.anInt4556 || local226 > arg2.anInt4556 || local282 > arg2.anInt4556;
							arg2.method4010(local338, local198, local254, local170, local226, local282, Static72.method1115(local310, local996.aShortArray107[local1528]), Static72.method1115(local310, local996.aShortArray107[local1533]), Static72.method1115(local310, local996.aShortArray107[local1538]));
						}
					}
				}
			}
		} else if ((local6.aByte6 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt4688;
			local24 = local19 + this.anInt4688;
			local29 = arg1 * this.anInt4688;
			local34 = local29 + this.anInt4688;
			@Pc(51) int local51;
			@Pc(148) int local148;
			@Pc(153) int local153;
			if ((local6.aByte6 & 0x1) == 0) {
				local46 = this.anIntArrayArray53[arg0][arg1];
				local51 = this.anIntArrayArray53[arg0 + 1][arg1];
				local148 = this.anIntArrayArray53[arg0 + 1][arg1 + 1];
				local153 = this.anIntArrayArray53[arg0][arg1 + 1];
				local68 = this.anInt4687 + (this.anInt4682 * local19 + this.anInt4685 * local46 + this.anInt4686 * local29 >> 15);
				if (local68 <= this.aClass129_Sub1_9.anInt3804) {
					return;
				}
				local91 = this.anInt4687 + (this.anInt4682 * local24 + this.anInt4685 * local51 + this.anInt4686 * local29 >> 15);
				if (local91 <= this.aClass129_Sub1_9.anInt3804) {
					return;
				}
				local114 = this.anInt4687 + (this.anInt4682 * local24 + this.anInt4685 * local148 + this.anInt4686 * local34 >> 15);
				if (local114 <= this.aClass129_Sub1_9.anInt3804) {
					return;
				}
				local137 = this.anInt4687 + (this.anInt4682 * local19 + this.anInt4685 * local153 + this.anInt4686 * local34 >> 15);
				if (local137 <= this.aClass129_Sub1_9.anInt3804) {
					return;
				}
				local170 = this.anInt4690 + (this.anInt4684 * local19 + this.anInt4689 * local46 + this.anInt4692 * local29 >> 15);
				local181 = arg2.anInt4559 + local170 * this.aClass129_Sub1_9.anInt3811 / local68;
				local198 = this.anInt4683 + (this.anInt4681 * local19 + this.anInt4680 * local46 + this.anInt4679 * local29 >> 15);
				local209 = arg2.anInt4558 + local198 * this.aClass129_Sub1_9.anInt3812 / local68;
				local226 = this.anInt4690 + (this.anInt4684 * local24 + this.anInt4689 * local51 + this.anInt4692 * local29 >> 15);
				local237 = arg2.anInt4559 + local226 * this.aClass129_Sub1_9.anInt3811 / local91;
				local254 = this.anInt4683 + (this.anInt4681 * local24 + this.anInt4680 * local51 + this.anInt4679 * local29 >> 15);
				local265 = arg2.anInt4558 + local254 * this.aClass129_Sub1_9.anInt3812 / local91;
				local282 = this.anInt4690 + (this.anInt4684 * local24 + this.anInt4689 * local148 + this.anInt4692 * local34 >> 15);
				local293 = arg2.anInt4559 + local282 * this.aClass129_Sub1_9.anInt3811 / local114;
				local310 = this.anInt4683 + (this.anInt4681 * local24 + this.anInt4680 * local148 + this.anInt4679 * local34 >> 15);
				local321 = arg2.anInt4558 + local310 * this.aClass129_Sub1_9.anInt3812 / local114;
				local338 = this.anInt4690 + (this.anInt4684 * local19 + this.anInt4689 * local153 + this.anInt4692 * local34 >> 15);
				local349 = arg2.anInt4559 + local338 * this.aClass129_Sub1_9.anInt3811 / local137;
				local366 = this.anInt4683 + (this.anInt4681 * local19 + this.anInt4680 * local153 + this.anInt4679 * local34 >> 15);
				local377 = arg2.anInt4558 + local366 * this.aClass129_Sub1_9.anInt3812 / local137;
			} else {
				local46 = this.anIntArrayArray53[arg0][arg1];
				local51 = this.anInt4685 * local46;
				local68 = this.anInt4687 + (this.anInt4682 * local19 + local51 + this.anInt4686 * local29 >> 15);
				if (local68 <= this.aClass129_Sub1_9.anInt3804) {
					return;
				}
				local91 = this.anInt4687 + (this.anInt4682 * local24 + local51 + this.anInt4686 * local29 >> 15);
				if (local91 <= this.aClass129_Sub1_9.anInt3804) {
					return;
				}
				local114 = this.anInt4687 + (this.anInt4682 * local24 + local51 + this.anInt4686 * local34 >> 15);
				if (local114 <= this.aClass129_Sub1_9.anInt3804) {
					return;
				}
				local137 = this.anInt4687 + (this.anInt4682 * local19 + local51 + this.anInt4686 * local34 >> 15);
				if (local137 <= this.aClass129_Sub1_9.anInt3804) {
					return;
				}
				local148 = this.anInt4689 * local46;
				local153 = this.anInt4680 * local46;
				local170 = this.anInt4690 + (this.anInt4684 * local19 + local148 + this.anInt4692 * local29 >> 15);
				local181 = arg2.anInt4559 + local170 * this.aClass129_Sub1_9.anInt3811 / local68;
				local198 = this.anInt4683 + (this.anInt4681 * local19 + local153 + this.anInt4679 * local29 >> 15);
				local209 = arg2.anInt4558 + local198 * this.aClass129_Sub1_9.anInt3812 / local68;
				local226 = this.anInt4690 + (this.anInt4684 * local24 + local148 + this.anInt4692 * local29 >> 15);
				local237 = arg2.anInt4559 + local226 * this.aClass129_Sub1_9.anInt3811 / local91;
				local254 = this.anInt4683 + (this.anInt4681 * local24 + local153 + this.anInt4679 * local29 >> 15);
				local265 = arg2.anInt4558 + local254 * this.aClass129_Sub1_9.anInt3812 / local91;
				local282 = this.anInt4690 + (this.anInt4684 * local24 + local148 + this.anInt4692 * local34 >> 15);
				local293 = arg2.anInt4559 + local282 * this.aClass129_Sub1_9.anInt3811 / local114;
				local310 = this.anInt4683 + (this.anInt4681 * local24 + local153 + this.anInt4679 * local34 >> 15);
				local321 = arg2.anInt4558 + local310 * this.aClass129_Sub1_9.anInt3812 / local114;
				local338 = this.anInt4690 + (this.anInt4684 * local19 + local148 + this.anInt4692 * local34 >> 15);
				local349 = arg2.anInt4559 + local338 * this.aClass129_Sub1_9.anInt3811 / local137;
				local366 = this.anInt4683 + (this.anInt4681 * local19 + local153 + this.anInt4679 * local34 >> 15);
				local377 = arg2.anInt4558 + local366 * this.aClass129_Sub1_9.anInt3812 / local137;
			}
			if ((local293 - local349) * (local265 - local377) - (local321 - local377) * (local237 - local349) > 0) {
				arg2.aBoolean301 = local293 < 0 || local349 < 0 || local237 < 0 || local293 > arg2.anInt4556 || local349 > arg2.anInt4556 || local237 > arg2.anInt4556;
				if (local6.aShort4 >= 0) {
					if (this.method4141(this.aClass129_Sub1_9.anInterface2_4.method2244(local6.aShort4).aByte42)) {
						arg2.anInt4560 = 100;
					}
					arg2.method4003(local321, local377, local265, local293, local349, local237, local6.aShort2 & 0xFFFF, local6.aShort5 & 0xFFFF, local6.aShort3 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort4);
					arg2.anInt4560 = 0;
				} else {
					arg2.method4010(local321, local377, local265, local293, local349, local237, local6.aShort2 & 0xFFFF, local6.aShort5 & 0xFFFF, local6.aShort3 & 0xFFFF);
				}
			}
			if ((local181 - local237) * (local377 - local265) - (local209 - local265) * (local349 - local237) > 0) {
				arg2.aBoolean301 = local181 < 0 || local237 < 0 || local349 < 0 || local181 > arg2.anInt4556 || local237 > arg2.anInt4556 || local349 > arg2.anInt4556;
				if (local6.aShort4 >= 0) {
					if (this.method4141(this.aClass129_Sub1_9.anInterface2_4.method2244(local6.aShort4).aByte42)) {
						arg2.anInt4560 = 100;
					}
					arg2.method4003(local209, local265, local377, local181, local237, local349, local6.aShort1 & 0xFFFF, local6.aShort3 & 0xFFFF, local6.aShort5 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort4);
					arg2.anInt4560 = 0;
					return;
				}
				arg2.method4010(local209, local265, local377, local181, local237, local349, local6.aShort1 & 0xFFFF, local6.aShort3 & 0xFFFF, local6.aShort5 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!op", name = "c", descriptor = "(Lclient!mc;IIIIZ)V")
	@Override
	public void method4135(@OriginalArg(0) Class11_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(II)I")
	@Override
	public int method4122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray53[arg0][arg1];
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(III)V")
	@Override
	public void method4132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray33[arg0][arg1] < arg2) {
			this.aByteArrayArray33[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(Lclient!mc;IIIIZ)V")
	@Override
	public void method4127(@OriginalArg(0) Class11_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}
}
