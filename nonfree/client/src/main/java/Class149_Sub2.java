import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lv")
public final class Class149_Sub2 extends Class149 {

	@OriginalMember(owner = "client!lv", name = "l", descriptor = "I")
	private int anInt4320;

	@OriginalMember(owner = "client!lv", name = "m", descriptor = "I")
	private int anInt4321;

	@OriginalMember(owner = "client!lv", name = "n", descriptor = "[[Lclient!ef;")
	private Class62[][] aClass62ArrayArray1;

	@OriginalMember(owner = "client!lv", name = "o", descriptor = "[[Lclient!ld;")
	private Class146[][] aClass146ArrayArray1;

	@OriginalMember(owner = "client!lv", name = "p", descriptor = "I")
	private int anInt4322;

	@OriginalMember(owner = "client!lv", name = "q", descriptor = "I")
	private int anInt4323;

	@OriginalMember(owner = "client!lv", name = "s", descriptor = "I")
	private int anInt4325;

	@OriginalMember(owner = "client!lv", name = "v", descriptor = "I")
	private int anInt4326;

	@OriginalMember(owner = "client!lv", name = "w", descriptor = "I")
	private int anInt4327;

	@OriginalMember(owner = "client!lv", name = "x", descriptor = "[[Lclient!ew;")
	private Class70[][] aClass70ArrayArray1;

	@OriginalMember(owner = "client!lv", name = "y", descriptor = "I")
	private int anInt4328;

	@OriginalMember(owner = "client!lv", name = "z", descriptor = "I")
	private int anInt4329;

	@OriginalMember(owner = "client!lv", name = "B", descriptor = "I")
	private int anInt4330;

	@OriginalMember(owner = "client!lv", name = "D", descriptor = "I")
	private int anInt4332;

	@OriginalMember(owner = "client!lv", name = "E", descriptor = "[[Lclient!nc;")
	private Class168[][] aClass168ArrayArray1;

	@OriginalMember(owner = "client!lv", name = "G", descriptor = "I")
	private int anInt4333;

	@OriginalMember(owner = "client!lv", name = "C", descriptor = "I")
	private int anInt4331 = -1;

	@OriginalMember(owner = "client!lv", name = "k", descriptor = "Lclient!cj;")
	private final Class39_Sub1 aClass39_Sub1_3;

	@OriginalMember(owner = "client!lv", name = "r", descriptor = "I")
	private final int anInt4324;

	@OriginalMember(owner = "client!lv", name = "F", descriptor = "[[I")
	public final int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!lv", name = "t", descriptor = "[[B")
	private byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!lv", name = "u", descriptor = "[[B")
	private byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(Lclient!cj;IIII[[I[[II)V")
	public Class149_Sub2(@OriginalArg(0) Class39_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass39_Sub1_3 = arg0;
		this.anInt4324 = arg2;
		this.anIntArrayArray47 = arg5;
		this.aByteArrayArray12 = new byte[arg3 + 1][arg4 + 1];
		@Pc(31) int local31 = this.aClass39_Sub1_3.anInt1052 >> 9;
		for (@Pc(33) int local33 = 1; local33 < arg4; local33++) {
			for (@Pc(36) int local36 = 1; local36 < arg3; local36++) {
				@Pc(55) int local55 = arg6[local36 + 1][local33] - arg6[local36 - 1][local33];
				@Pc(71) int local71 = arg6[local36][local33 + 1] - arg6[local36][local33 - 1];
				@Pc(86) int local86 = (int) Math.sqrt((double) (local55 * local55 + arg7 * 512 + local71 * local71));
				@Pc(92) int local92 = (local55 << 8) / local86;
				@Pc(98) int local98 = arg7 * -512 / local86;
				@Pc(104) int local104 = (local71 << 8) / local86;
				@Pc(126) int local126 = local31 + (this.aClass39_Sub1_3.anInt1065 * local92 + this.aClass39_Sub1_3.anInt1061 * local98 + this.aClass39_Sub1_3.anInt1060 * local104 >> 17);
				local126 >>= 0x1;
				if (local126 < 2) {
					local126 = 2;
				} else if (local126 > 126) {
					local126 = 126;
				}
				this.aByteArrayArray12[local36][local33] = (byte) local126;
			}
		}
		this.aByteArrayArray13 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!ba;IIIIZ)Z")
	@Override
	public boolean method3567(@OriginalArg(0) Class1_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method3564(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class196 local4 = this.aClass39_Sub1_3.method1077(Thread.currentThread());
		@Pc(7) Class182 local7 = local4.aClass182_2;
		local7.anInt4977 = 0;
		local7.aBoolean326 = false;
		if (this.aClass146ArrayArray1 != null) {
			this.method3573(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray480, local4.anIntArray487);
		} else if (this.aClass62ArrayArray1 != null) {
			this.method3577(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray480, local4.anIntArray487);
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(II)I")
	@Override
	public int a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> super.anInt4316;
		@Pc(9) int local9 = arg1 >> super.anInt4316;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt4317 - 1 || local9 > super.anInt4319 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & super.anInt4318 - 1;
		@Pc(41) int local41 = arg1 & super.anInt4318 - 1;
		@Pc(67) int local67 = this.anIntArrayArray47[local4][local9] * (super.anInt4318 - local34) + this.anIntArrayArray47[local4 + 1][local9] * local34 >> super.anInt4316;
		@Pc(97) int local97 = this.anIntArrayArray47[local4][local9 + 1] * (super.anInt4318 - local34) + this.anIntArrayArray47[local4 + 1][local9 + 1] * local34 >> super.anInt4316;
		return local67 * (super.anInt4318 - local41) + local97 * local41 >> super.anInt4316;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method3569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class33_Sub1 local3 = this.aClass39_Sub1_3.aClass33_Sub1_1;
		this.anInt4331 = -1;
		this.anInt4321 = local3.anInt2577;
		this.anInt4329 = local3.anInt2582;
		this.anInt4332 = local3.anInt2576;
		this.anInt4327 = local3.anInt2581;
		this.anInt4326 = local3.anInt2580;
		this.anInt4330 = local3.anInt2573;
		this.anInt4320 = local3.anInt2579;
		this.anInt4328 = local3.anInt2578;
		this.anInt4333 = local3.anInt2575;
		this.anInt4322 = local3.anInt2574;
		this.anInt4323 = local3.anInt2584;
		this.anInt4325 = local3.anInt2583;
	}

	@OriginalMember(owner = "client!lv", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass146ArrayArray1 == null) {
			this.aClass146ArrayArray1 = new Class146[super.anInt4317][super.anInt4319];
			this.aClass168ArrayArray1 = new Class168[super.anInt4317][super.anInt4319];
		} else if (this.aClass62ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static165.anIntArray277[Static249.method3750(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static165.anIntArray277[Static249.method3750(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == super.anInt4318 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt4318 && arg4[local116] == super.anInt4318) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt4318) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt4318 && arg2[local244] != arg2[0] - super.anInt4318) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt4318 && arg4[local244] != arg4[0] - super.anInt4318) {
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
			@Pc(334) Class146 local334 = new Class146();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt4011 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte72 = (byte) (local334.aByte72 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray47[arg0][arg1] == this.anIntArrayArray47[arg0 + 1][arg1] && this.anIntArrayArray47[arg0][arg1] == this.anIntArrayArray47[arg0 + 1][arg1 + 1] && this.anIntArrayArray47[arg0][arg1] == this.anIntArrayArray47[arg0][arg1 + 1]) {
				local334.aByte72 = (byte) (local334.aByte72 | 0x1);
			}
			if (local342 == -1 || (local334.aByte72 & 0x2) != 0 || this.aClass39_Sub1_3.anInterface4_12.method2450(local342).aBoolean332) {
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
				local334.anInt4013 = Static29.method3629(local527, arg10, Static465.method3578(arg6[local104] >> 8, this.aByteArrayArray12[arg0][arg1] - this.aByteArrayArray13[arg0][arg1]));
				if (local334.anInt4011 != 0) {
					local334.anInt4013 |= this.aByteArrayArray13[arg0][arg1] + 255 - this.aByteArrayArray12[arg0][arg1] << 25;
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
				local334.anInt4009 = Static29.method3629(local527, arg10, Static465.method3578(arg6[local106] >> 8, this.aByteArrayArray12[arg0 + 1][arg1] - this.aByteArrayArray13[arg0 + 1][arg1]));
				if (local334.anInt4011 != 0) {
					local334.anInt4009 |= this.aByteArrayArray13[arg0 + 1][arg1] + 255 - this.aByteArrayArray12[arg0 + 1][arg1] << 25;
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
				local334.anInt4010 = Static29.method3629(local527, arg10, Static465.method3578(arg6[local108] >> 8, this.aByteArrayArray12[arg0 + 1][arg1 + 1] - this.aByteArrayArray13[arg0 + 1][arg1 + 1]));
				if (local334.anInt4011 != 0) {
					local334.anInt4010 |= this.aByteArrayArray13[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray12[arg0 + 1][arg1 + 1] << 25;
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
				local334.anInt4012 = Static29.method3629(local527, arg10, Static465.method3578(arg6[local110] >> 8, this.aByteArrayArray12[arg0][arg1 + 1] - this.aByteArrayArray13[arg0][arg1 + 1]));
				if (local334.anInt4011 != 0) {
					local334.anInt4012 |= this.aByteArrayArray13[arg0][arg1 + 1] + 255 - this.aByteArrayArray12[arg0][arg1 + 1] << 25;
				}
				local334.aShort58 = -1;
			} else {
				local334.anInt4013 = this.aByteArrayArray12[arg0][arg1] - this.aByteArrayArray13[arg0][arg1];
				local334.anInt4009 = this.aByteArrayArray12[arg0 + 1][arg1] - this.aByteArrayArray13[arg0 + 1][arg1];
				local334.anInt4010 = this.aByteArrayArray12[arg0 + 1][arg1 + 1] - this.aByteArrayArray13[arg0 + 1][arg1 + 1];
				local334.anInt4012 = this.aByteArrayArray12[arg0][arg1 + 1] - this.aByteArrayArray13[arg0][arg1 + 1];
				local334.aShort58 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort59 = (short) arg5[local108];
				local334.aShort60 = (short) arg5[local110];
				local334.aShort61 = (short) arg5[local106];
				local334.aShort62 = (short) arg5[local104];
			}
			this.aClass146ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class168 local888 = new Class168();
		local888.aShort73 = (short) arg2.length;
		local888.aShort74 = (short) (arg2.length / 3);
		local888.aShortArray75 = new short[local888.aShort73];
		local888.aShortArray74 = new short[local888.aShort73];
		local888.aShortArray72 = new short[local888.aShort73];
		local888.anIntArray400 = new int[local888.aShort73];
		if (arg5 != null) {
			local888.aShortArray73 = new short[local888.aShort73];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort73; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray12[arg0][arg1] - this.aByteArrayArray13[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt4318) {
				local958 = this.aByteArrayArray12[arg0][arg1 + 1] - this.aByteArrayArray13[arg0][arg1 + 1];
			} else if (local342 == super.anInt4318 && local527 == super.anInt4318) {
				local958 = this.aByteArrayArray12[arg0 + 1][arg1 + 1] - this.aByteArrayArray13[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt4318 && local527 == 0) {
				local958 = this.aByteArrayArray12[arg0 + 1][arg1] - this.aByteArrayArray13[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray12[arg0][arg1] - this.aByteArrayArray13[arg0][arg1]) * (super.anInt4318 - local342) + (this.aByteArrayArray12[arg0 + 1][arg1] - this.aByteArrayArray13[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray12[arg0][arg1 + 1] - this.aByteArrayArray13[arg0][arg1 + 1]) * (super.anInt4318 - local342) + (this.aByteArrayArray12[arg0 + 1][arg1 + 1] - this.aByteArrayArray13[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt4318 - local527) + local1126 * local527 >> super.anInt4316 * 2;
			}
			local1079 = (arg0 << super.anInt4316) + local342;
			local1126 = (arg1 << super.anInt4316) + local527;
			local888.aShortArray75[local244] = (short) local342;
			local888.aShortArray72[local244] = (short) local527;
			local888.aShortArray74[local244] = (short) (this.a(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass39_Sub1_3.anInterface4_12.method2450(arg8[local244]).aBoolean332) {
				local888.anIntArray400[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray73[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray400[local244] = Static29.method3629(local1226, arg10, Static465.method3578(arg6[local244] >> 8, local958));
				if (arg7 != null) {
					local888.anIntArray400[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray400[local244] = 0;
			} else {
				local888.anIntArray400[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort74; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass39_Sub1_3.anInterface4_12.method2450(arg8[local527 * 3]).aBoolean332) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray399 = new int[local888.aShort74];
		}
		if (local1296) {
			local888.aShortArray77 = new short[local888.aShort74];
			local888.aShortArray76 = new short[local888.aShort74];
		}
		for (local958 = 0; local958 < local888.aShort74; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray399[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass39_Sub1_3.anInterface4_12.method2450(local1384).aBoolean332) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass39_Sub1_3.anInterface4_12.method2450(local1384).aBoolean332) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass39_Sub1_3.anInterface4_12.method2450(local1384).aBoolean332) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray77[local958] = (short) local1384;
					local888.aShortArray76[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass39_Sub1_3.anInterface4_12.method2450(local1384).aBoolean332) {
							local888.anIntArray400[local1079] = Static165.anIntArray277[Static249.method3750(this.aClass39_Sub1_3.anInterface4_12.method2450(local1384).aShort75 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass39_Sub1_3.anInterface4_12.method2450(local1384).aBoolean332) {
							local888.anIntArray400[local1126] = Static165.anIntArray277[Static249.method3750(this.aClass39_Sub1_3.anInterface4_12.method2450(local1384).aShort75 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass39_Sub1_3.anInterface4_12.method2450(local1384).aBoolean332) {
							local888.anIntArray400[local1226] = Static165.anIntArray277[Static249.method3750(this.aClass39_Sub1_3.anInterface4_12.method2450(local1384).aShort75 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray77[local958] = -1;
				}
			}
		}
		this.aClass168ArrayArray1[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIIIIII[[ZLclient!og;[I[I)V")
	private void method3573(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class182 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean328 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass146ArrayArray1[local22][local25] != null) {
						@Pc(50) Class146 local50 = this.aClass146ArrayArray1[local22][local25];
						if (local50.aShort58 != -1 && (local50.aByte72 & 0x2) == 0 && local50.anInt4011 == 0) {
							local68 = this.aClass39_Sub1_3.method1074(local50.aShort58);
							arg5.method4127(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static376.method5105(local50.anInt4010, local68), Static376.method5105(local50.anInt4012, local68), Static376.method5105(local50.anInt4009, local68));
							arg5.method4127(local20, local20, local20 - 4, local16, local16 + 4, local16, Static376.method5105(local50.anInt4013, local68), Static376.method5105(local50.anInt4009, local68), Static376.method5105(local50.anInt4012, local68));
						} else if (local50.anInt4011 == 0) {
							arg5.method4133(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt4010, local50.anInt4012, local50.anInt4009);
							arg5.method4133(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt4013, local50.anInt4009, local50.anInt4012);
						} else {
							local68 = local50.anInt4011;
							arg5.method4133(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static204.method5991(local50.anInt4010 & 0xFF000000, local68), Static204.method5991(local50.anInt4012 & 0xFF000000, local68), Static204.method5991(local50.anInt4009 & 0xFF000000, local68));
							arg5.method4133(local20, local20, local20 - 4, local16, local16 + 4, local16, Static204.method5991(local50.anInt4013 & 0xFF000000, local68), Static204.method5991(local50.anInt4009 & 0xFF000000, local68), Static204.method5991(local50.anInt4012 & 0xFF000000, local68));
						}
					} else if (this.aClass168ArrayArray1[local22][local25] != null) {
						@Pc(259) Class168 local259 = this.aClass168ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort73; local68++) {
							arg6[local68] = local16 + local259.aShortArray75[local68] * 4 / super.anInt4318;
							arg7[local68] = local20 - local259.aShortArray72[local68] * 4 / super.anInt4318;
						}
						for (@Pc(297) int local297 = 0; local297 < local259.aShort74; local297++) {
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
							if (local259.anIntArray399 != null && local259.anIntArray399[local297] != 0 && (local259.aShortArray77 == null || local259.aShortArray77 != null && local259.aShortArray77[local297] == -1)) {
								local359 = local259.anIntArray399[local297];
								arg5.method4133(local326, local330, local334, local314, local318, local322, Static204.method5991(-(local259.anIntArray400[local302] & -16777216) - 16777216, local359), Static204.method5991(-(local259.anIntArray400[local306] & -16777216) - 16777216, local359), Static204.method5991(-(local259.anIntArray400[local310] & -16777216) - 16777216, local359));
							} else if (local259.aShortArray77 == null || local259.aShortArray77[local297] == -1) {
								arg5.method4133(local326, local330, local334, local314, local318, local322, local259.anIntArray400[local302], local259.anIntArray400[local306], local259.anIntArray400[local310]);
							} else {
								local359 = this.aClass39_Sub1_3.method1074(local259.aShortArray77[local297]);
								arg5.method4127(local326, local330, local334, local314, local318, local322, local359, local359, local359);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean328 = true;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)Z")
	private boolean method3574(@OriginalArg(0) int arg0) {
		if ((this.anInt4324 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!lv", name = "i", descriptor = "(III)V")
	@Override
	public void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray13[arg0][arg1] < arg2) {
			this.aByteArrayArray13[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIZLclient!og;[I[I[I)V")
	private void method3575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class182 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class146 local6 = this.aClass146ArrayArray1[arg0][arg1];
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
			@Pc(1452) Class168 local1452 = this.aClass168ArrayArray1[arg0][arg1];
			if (local1452 != null) {
				if (this.anInt4331 == -1) {
					for (local436 = 0; local436 < local1452.aShort73; local436++) {
						local24 = local1452.aShortArray75[local436] + (arg0 << super.anInt4316);
						local29 = local1452.aShortArray74[local436];
						local34 = local1452.aShortArray72[local436] + (arg1 << super.anInt4316);
						local380 = this.anInt4325 + (this.anInt4333 * local24 + this.anInt4322 * local29 + this.anInt4323 * local34 >> 15);
						if (local380 <= this.aClass39_Sub1_3.anInt1071) {
							return;
						}
						arg6[local436] = 0;
						if (arg2) {
							local296 = local380 - this.aClass39_Sub1_3.anInt1069;
							if (local296 > 255) {
								local296 = 255;
							}
							if (local296 > 0) {
								arg6[local436] = local296;
								local352 = local1452.aShortArray73[local436] * local296 / 255;
								if (local352 > 0) {
									local29 -= local352;
								}
							}
						} else if (this.aClass39_Sub1_3.aBoolean55) {
							local296 = local380 - this.aClass39_Sub1_3.anInt1069;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt4327 + (this.anInt4321 * local24 + this.anInt4329 * local29 + this.anInt4332 * local34 >> 15);
						local324 = this.anInt4328 + (this.anInt4326 * local24 + this.anInt4330 * local29 + this.anInt4320 * local34 >> 15);
						arg4[local436] = arg3.anInt4974 + local268 * this.aClass39_Sub1_3.anInt1047 / local380;
						arg5[local436] = arg3.anInt4979 + local324 * this.aClass39_Sub1_3.anInt1070 / local380;
					}
				} else {
					for (local436 = 0; local436 < local1452.aShort73; local436++) {
						local24 = local1452.aShortArray75[local436] + (arg0 << super.anInt4316);
						local29 = local1452.aShortArray74[local436];
						local34 = local1452.aShortArray72[local436] + (arg1 << super.anInt4316);
						arg6[local436] = 0;
						if (arg2) {
							local296 = this.anInt4331 - this.aClass39_Sub1_3.anInt1069;
							if (local296 > 255) {
								local296 = 255;
							}
							if (local296 > 0) {
								arg6[local436] = local296;
								local352 = local1452.aShortArray73[local436] * local296 / 255;
								if (local352 > 0) {
									local29 -= local352;
								}
							}
						} else if (this.aClass39_Sub1_3.aBoolean55) {
							local296 = this.anInt4331 - this.aClass39_Sub1_3.anInt1069;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt4327 + (this.anInt4321 * local24 + this.anInt4329 * local29 + this.anInt4332 * local34 >> 15);
						local324 = this.anInt4328 + (this.anInt4326 * local24 + this.anInt4330 * local29 + this.anInt4320 * local34 >> 15);
						arg4[local436] = arg3.anInt4974 + local268 * this.aClass39_Sub1_3.anInt1047 / this.anInt4331;
						arg5[local436] = arg3.anInt4979 + local324 * this.aClass39_Sub1_3.anInt1070 / this.anInt4331;
					}
				}
				if (local1452.aShortArray77 != null) {
					local436 = this.anIntArrayArray47[arg0][arg1];
					local296 = this.anIntArrayArray47[arg0 + 1][arg1];
					local352 = this.anIntArrayArray47[arg0][arg1 + 1];
					local408 = arg0 * super.anInt4318;
					local464 = local408 + super.anInt4318;
					local257 = arg1 * super.anInt4318;
					local313 = local257 + super.anInt4318;
					local369 = this.anInt4327 + (this.anInt4321 * local408 + this.anInt4329 * local436 + this.anInt4332 * local257 >> 15);
					local425 = this.anInt4328 + (this.anInt4326 * local408 + this.anInt4330 * local436 + this.anInt4320 * local257 >> 15);
					local285 = this.anInt4325 + (this.anInt4333 * local408 + this.anInt4322 * local436 + this.anInt4323 * local257 >> 15);
					local341 = this.anInt4327 + (this.anInt4321 * local464 + this.anInt4329 * local296 + this.anInt4332 * local257 >> 15);
					local397 = this.anInt4328 + (this.anInt4326 * local464 + this.anInt4330 * local296 + this.anInt4320 * local257 >> 15);
					local453 = this.anInt4325 + (this.anInt4333 * local464 + this.anInt4322 * local296 + this.anInt4323 * local257 >> 15);
					local82 = this.anInt4327 + (this.anInt4321 * local408 + this.anInt4329 * local352 + this.anInt4332 * local313 >> 15);
					local105 = this.anInt4328 + (this.anInt4326 * local408 + this.anInt4330 * local352 + this.anInt4320 * local313 >> 15);
					local128 = this.anInt4325 + (this.anInt4333 * local408 + this.anInt4322 * local352 + this.anInt4323 * local313 >> 15);
					for (local151 = 0; local151 < local1452.aShort74; local151++) {
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
							arg3.aBoolean326 = local42 < 0 || local176 < 0 || local56 < 0 || local42 > arg3.anInt4978 || local176 > arg3.anInt4978 || local56 > arg3.anInt4978;
							@Pc(2138) short local2138 = local1452.aShortArray77[local151];
							if (local642 < 765) {
								if (local2138 != -1 && this.method3574(this.aClass39_Sub1_3.anInterface4_12.method2450(local2138).aByte76)) {
									arg3.anInt4977 = 100;
								}
								if (local642 > 0) {
									if (local2138 != -1) {
										arg3.method4136(local65, local240, local501, local42, local176, local56, this.aClass39_Sub1_3.anInt1057, arg6[local36], arg6[local38], arg6[local40], local1452.anIntArray400[local36], local1452.anIntArray400[local38], local1452.anIntArray400[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
									} else if ((local1452.anIntArray400[local36] & 0xFFFFFF) != 0) {
										arg3.method4133(local65, local240, local501, local42, local176, local56, Static204.method5991(arg6[local36] << 24 | this.aClass39_Sub1_3.anInt1057, local1452.anIntArray400[local36]), Static204.method5991(arg6[local38] << 24 | this.aClass39_Sub1_3.anInt1057, local1452.anIntArray400[local38]), Static204.method5991(arg6[local40] << 24 | this.aClass39_Sub1_3.anInt1057, local1452.anIntArray400[local40]));
									}
								} else if (local2138 != -1) {
									arg3.method4132(local65, local240, local501, local42, local176, local56, local1452.anIntArray400[local36], local1452.anIntArray400[local38], local1452.anIntArray400[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
								} else if ((local1452.anIntArray400[local36] & 0xFFFFFF) != 0) {
									arg3.method4133(local65, local240, local501, local42, local176, local56, local1452.anIntArray400[local36], local1452.anIntArray400[local38], local1452.anIntArray400[local40]);
								}
								arg3.anInt4977 = 0;
							} else {
								arg3.method4129(local65, local240, local501, local42, local176, local56, this.aClass39_Sub1_3.anInt1057);
							}
						}
					}
					return;
				}
				for (local436 = 0; local436 < local1452.aShort74; local436++) {
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
						arg3.aBoolean326 = local464 < 0 || local257 < 0 || local313 < 0 || local464 > arg3.anInt4978 || local257 > arg3.anInt4978 || local313 > arg3.anInt4978;
						if (local341 >= 765) {
							arg3.method4129(local369, local425, local285, local464, local257, local313, this.aClass39_Sub1_3.anInt1057);
						} else if (local341 > 0) {
							if ((local1452.anIntArray400[local296] & 0xFFFFFF) != 0) {
								arg3.method4133(local369, local425, local285, local464, local257, local313, Static29.method3629(arg6[local296], this.aClass39_Sub1_3.anInt1057, local1452.anIntArray400[local296]), Static29.method3629(arg6[local352], this.aClass39_Sub1_3.anInt1057, local1452.anIntArray400[local352]), Static29.method3629(arg6[local408], this.aClass39_Sub1_3.anInt1057, local1452.anIntArray400[local408]));
							}
						} else if ((local1452.anIntArray400[local296] & 0xFFFFFF) != 0) {
							arg3.method4133(local369, local425, local285, local464, local257, local313, local1452.anIntArray400[local296], local1452.anIntArray400[local352], local1452.anIntArray400[local408]);
						}
					}
				}
			}
		} else if ((local6.aByte72 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt4318;
			local24 = local19 + super.anInt4318;
			local29 = arg1 * super.anInt4318;
			local34 = local29 + super.anInt4318;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte72 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray47[arg0][arg1];
				local65 = this.anIntArrayArray47[arg0 + 1][arg1];
				local240 = this.anIntArrayArray47[arg0 + 1][arg1 + 1];
				local501 = this.anIntArrayArray47[arg0][arg1 + 1];
				if (this.anInt4331 == -1) {
					local82 = this.anInt4325 + (this.anInt4333 * local19 + this.anInt4322 * local56 + this.anInt4323 * local29 >> 15);
					if (local82 <= this.aClass39_Sub1_3.anInt1071) {
						return;
					}
					local105 = this.anInt4325 + (this.anInt4333 * local24 + this.anInt4322 * local65 + this.anInt4323 * local29 >> 15);
					if (local105 <= this.aClass39_Sub1_3.anInt1071) {
						return;
					}
					local128 = this.anInt4325 + (this.anInt4333 * local24 + this.anInt4322 * local240 + this.anInt4323 * local34 >> 15);
					if (local128 <= this.aClass39_Sub1_3.anInt1071) {
						return;
					}
					local151 = this.anInt4325 + (this.anInt4333 * local19 + this.anInt4322 * local501 + this.anInt4323 * local34 >> 15);
					if (local151 <= this.aClass39_Sub1_3.anInt1071) {
						return;
					}
				} else {
					local151 = this.anInt4331;
					local128 = this.anInt4331;
					local105 = this.anInt4331;
					local82 = this.anInt4331;
				}
				if (arg2) {
					local176 = local82 - this.aClass39_Sub1_3.anInt1069;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local36 = local176;
						local642 = local6.aShort62 * local176 / 255;
						if (local642 > 0) {
							local56 -= local642;
						}
					}
					local176 = local105 - this.aClass39_Sub1_3.anInt1069;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local38 = local176;
						local642 = local6.aShort61 * local176 / 255;
						if (local642 > 0) {
							local65 -= local642;
						}
					}
					local176 = local128 - this.aClass39_Sub1_3.anInt1069;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local40 = local176;
						local642 = local6.aShort59 * local176 / 255;
						if (local642 > 0) {
							local240 -= local642;
						}
					}
					local176 = local151 - this.aClass39_Sub1_3.anInt1069;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local42 = local176;
						local642 = local6.aShort60 * local176 / 255;
						if (local642 > 0) {
							local501 -= local642;
						}
					}
				} else if (this.aClass39_Sub1_3.aBoolean55) {
					local176 = local82 - this.aClass39_Sub1_3.anInt1069;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass39_Sub1_3.anInt1069;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass39_Sub1_3.anInt1069;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass39_Sub1_3.anInt1069;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local257 = this.anInt4327 + (this.anInt4321 * local19 + this.anInt4329 * local56 + this.anInt4332 * local29 >> 15);
				local268 = arg3.anInt4974 + local257 * this.aClass39_Sub1_3.anInt1047 / local82;
				local285 = this.anInt4328 + (this.anInt4326 * local19 + this.anInt4330 * local56 + this.anInt4320 * local29 >> 15);
				local296 = arg3.anInt4979 + local285 * this.aClass39_Sub1_3.anInt1070 / local82;
				local313 = this.anInt4327 + (this.anInt4321 * local24 + this.anInt4329 * local65 + this.anInt4332 * local29 >> 15);
				local324 = arg3.anInt4974 + local313 * this.aClass39_Sub1_3.anInt1047 / local105;
				local341 = this.anInt4328 + (this.anInt4326 * local24 + this.anInt4330 * local65 + this.anInt4320 * local29 >> 15);
				local352 = arg3.anInt4979 + local341 * this.aClass39_Sub1_3.anInt1070 / local105;
				local369 = this.anInt4327 + (this.anInt4321 * local24 + this.anInt4329 * local240 + this.anInt4332 * local34 >> 15);
				local380 = arg3.anInt4974 + local369 * this.aClass39_Sub1_3.anInt1047 / local128;
				local397 = this.anInt4328 + (this.anInt4326 * local24 + this.anInt4330 * local240 + this.anInt4320 * local34 >> 15);
				local408 = arg3.anInt4979 + local397 * this.aClass39_Sub1_3.anInt1070 / local128;
				local425 = this.anInt4327 + (this.anInt4321 * local19 + this.anInt4329 * local501 + this.anInt4332 * local34 >> 15);
				local436 = arg3.anInt4974 + local425 * this.aClass39_Sub1_3.anInt1047 / local151;
				local453 = this.anInt4328 + (this.anInt4326 * local19 + this.anInt4330 * local501 + this.anInt4320 * local34 >> 15);
				local464 = arg3.anInt4979 + local453 * this.aClass39_Sub1_3.anInt1070 / local151;
			} else {
				local56 = this.anIntArrayArray47[arg0][arg1];
				if (this.anInt4331 == -1) {
					local65 = this.anInt4322 * local56;
					local82 = this.anInt4325 + (this.anInt4333 * local19 + local65 + this.anInt4323 * local29 >> 15);
					if (local82 <= this.aClass39_Sub1_3.anInt1071) {
						return;
					}
					local105 = this.anInt4325 + (this.anInt4333 * local24 + local65 + this.anInt4323 * local29 >> 15);
					if (local105 <= this.aClass39_Sub1_3.anInt1071) {
						return;
					}
					local128 = this.anInt4325 + (this.anInt4333 * local24 + local65 + this.anInt4323 * local34 >> 15);
					if (local128 <= this.aClass39_Sub1_3.anInt1071) {
						return;
					}
					local151 = this.anInt4325 + (this.anInt4333 * local19 + local65 + this.anInt4323 * local34 >> 15);
					if (local151 <= this.aClass39_Sub1_3.anInt1071) {
						return;
					}
				} else {
					local151 = this.anInt4331;
					local128 = this.anInt4331;
					local105 = this.anInt4331;
					local82 = this.anInt4331;
				}
				if (this.aClass39_Sub1_3.aBoolean55) {
					local176 = local82 - this.aClass39_Sub1_3.anInt1069;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass39_Sub1_3.anInt1069;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass39_Sub1_3.anInt1069;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass39_Sub1_3.anInt1069;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local65 = this.anInt4329 * local56;
				local240 = this.anInt4330 * local56;
				local257 = this.anInt4327 + (this.anInt4321 * local19 + local65 + this.anInt4332 * local29 >> 15);
				local268 = arg3.anInt4974 + local257 * this.aClass39_Sub1_3.anInt1047 / local82;
				local285 = this.anInt4328 + (this.anInt4326 * local19 + local240 + this.anInt4320 * local29 >> 15);
				local296 = arg3.anInt4979 + local285 * this.aClass39_Sub1_3.anInt1070 / local82;
				local313 = this.anInt4327 + (this.anInt4321 * local24 + local65 + this.anInt4332 * local29 >> 15);
				local324 = arg3.anInt4974 + local313 * this.aClass39_Sub1_3.anInt1047 / local105;
				local341 = this.anInt4328 + (this.anInt4326 * local24 + local240 + this.anInt4320 * local29 >> 15);
				local352 = arg3.anInt4979 + local341 * this.aClass39_Sub1_3.anInt1070 / local105;
				local369 = this.anInt4327 + (this.anInt4321 * local24 + local65 + this.anInt4332 * local34 >> 15);
				local380 = arg3.anInt4974 + local369 * this.aClass39_Sub1_3.anInt1047 / local128;
				local397 = this.anInt4328 + (this.anInt4326 * local24 + local240 + this.anInt4320 * local34 >> 15);
				local408 = arg3.anInt4979 + local397 * this.aClass39_Sub1_3.anInt1070 / local128;
				local425 = this.anInt4327 + (this.anInt4321 * local19 + local65 + this.anInt4332 * local34 >> 15);
				local436 = arg3.anInt4974 + local425 * this.aClass39_Sub1_3.anInt1047 / local151;
				local453 = this.anInt4328 + (this.anInt4326 * local19 + local240 + this.anInt4320 * local34 >> 15);
				local464 = arg3.anInt4979 + local453 * this.aClass39_Sub1_3.anInt1070 / local151;
			}
			@Pc(1064) boolean local1064 = local6.aShort58 != -1 && this.method3574(this.aClass39_Sub1_3.anInterface4_12.method2450(local6.aShort58).aByte76);
			local65 = local38 + local40 + local42;
			if ((local380 - local436) * (local352 - local464) - (local408 - local464) * (local324 - local436) > 0) {
				arg3.aBoolean326 = local380 < 0 || local436 < 0 || local324 < 0 || local380 > arg3.anInt4978 || local436 > arg3.anInt4978 || local324 > arg3.anInt4978;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt4977 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort58 >= 0) {
							arg3.method4136(local408, local464, local352, local380, local436, local324, this.aClass39_Sub1_3.anInt1057, local40, local42, local38, local6.anInt4010, local6.anInt4012, local6.anInt4009, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort58);
						} else {
							arg3.method4133(local408, local464, local352, local380, local436, local324, Static204.method5991(local40 << 24 | this.aClass39_Sub1_3.anInt1057, local6.anInt4010), Static204.method5991(local42 << 24 | this.aClass39_Sub1_3.anInt1057, local6.anInt4012), Static204.method5991(local38 << 24 | this.aClass39_Sub1_3.anInt1057, local6.anInt4009));
						}
					} else if (local6.aShort58 >= 0) {
						arg3.method4132(local408, local464, local352, local380, local436, local324, local6.anInt4010, local6.anInt4012, local6.anInt4009, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort58);
					} else {
						arg3.method4133(local408, local464, local352, local380, local436, local324, local6.anInt4010, local6.anInt4012, local6.anInt4009);
					}
					arg3.anInt4977 = 0;
				} else {
					arg3.method4129(local408, local464, local352, local380, local436, local324, this.aClass39_Sub1_3.anInt1057);
				}
			}
			local65 = local36 + local38 + local42;
			if ((local268 - local324) * (local464 - local352) - (local296 - local352) * (local436 - local324) > 0) {
				arg3.aBoolean326 = local268 < 0 || local324 < 0 || local436 < 0 || local268 > arg3.anInt4978 || local324 > arg3.anInt4978 || local436 > arg3.anInt4978;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt4977 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort58 >= 0) {
							arg3.method4136(local296, local352, local464, local268, local324, local436, this.aClass39_Sub1_3.anInt1057, local36, local38, local42, local6.anInt4013, local6.anInt4009, local6.anInt4012, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort58);
						} else {
							arg3.method4133(local296, local352, local464, local268, local324, local436, Static204.method5991(local36 << 24 | this.aClass39_Sub1_3.anInt1057, local6.anInt4013), Static204.method5991(local38 << 24 | this.aClass39_Sub1_3.anInt1057, local6.anInt4009), Static204.method5991(local42 << 24 | this.aClass39_Sub1_3.anInt1057, local6.anInt4012));
						}
					} else if (local6.aShort58 >= 0) {
						arg3.method4132(local296, local352, local464, local268, local324, local436, local6.anInt4013, local6.anInt4009, local6.anInt4012, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort58);
					} else {
						arg3.method4133(local296, local352, local464, local268, local324, local436, local6.anInt4013, local6.anInt4009, local6.anInt4012);
					}
					arg3.anInt4977 = 0;
					return;
				}
				arg3.method4129(local296, local352, local464, local268, local324, local436, this.aClass39_Sub1_3.anInt1057);
			}
		}
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(Lclient!ba;IIIIZ)V")
	@Override
	public void b(@OriginalArg(0) Class1_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!lv", name = "ca", descriptor = "()V")
	@Override
	public void ca() {
		this.aByteArrayArray12 = null;
		this.aByteArrayArray13 = null;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!qp;[I)V")
	@Override
	public void method3571(@OriginalArg(0) Class1_Sub31 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!lv", name = "p", descriptor = "(Lclient!ba;IIIIZ)V")
	@Override
	public void p(@OriginalArg(0) Class1_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass62ArrayArray1 == null) {
			this.aClass62ArrayArray1 = new Class62[super.anInt4317][super.anInt4319];
			this.aClass70ArrayArray1 = new Class70[super.anInt4317][super.anInt4319];
		} else if (this.aClass146ArrayArray1 != null) {
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
				if (local64 != 0 && local64 != super.anInt4318 || local70 != 0 && local70 != super.anInt4318) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class70 local95 = new Class70();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort38 = local99;
			local95.aShortArray28 = new short[local99];
			local95.aShortArray34 = new short[local99];
			local95.aShortArray35 = new short[local99];
			local95.aShortArray32 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray28[local124] = (short) (this.aByteArrayArray12[arg0][arg1] - this.aByteArrayArray13[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt4318) {
					local95.aShortArray28[local124] = (short) (this.aByteArrayArray12[arg0][arg1 + 1] - this.aByteArrayArray13[arg0][arg1 + 1]);
				} else if (local129 == super.anInt4318 && local133 == super.anInt4318) {
					local95.aShortArray28[local124] = (short) (this.aByteArrayArray12[arg0 + 1][arg1 + 1] - this.aByteArrayArray13[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt4318 && local133 == 0) {
					local95.aShortArray28[local124] = (short) (this.aByteArrayArray12[arg0 + 1][arg1] - this.aByteArrayArray13[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray12[arg0][arg1] - this.aByteArrayArray13[arg0][arg1]) * (super.anInt4318 - local129) + (this.aByteArrayArray12[arg0 + 1][arg1] - this.aByteArrayArray13[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray12[arg0][arg1 + 1] - this.aByteArrayArray13[arg0][arg1 + 1]) * (super.anInt4318 - local129) + (this.aByteArrayArray12[arg0 + 1][arg1 + 1] - this.aByteArrayArray13[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray28[local124] = (short) (local288 * (super.anInt4318 - local133) + local335 * local133 >> super.anInt4316 * 2);
				}
				local288 = (arg0 << super.anInt4316) + local129;
				local335 = (arg1 << super.anInt4316) + local133;
				local95.aShortArray34[local124] = (short) local129;
				local95.aShortArray32[local124] = (short) local133;
				local95.aShortArray35[local124] = (short) (this.a(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray28[local124] < 2) {
					local95.aShortArray28[local124] = 2;
				}
			}
			@Pc(415) boolean local415 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass39_Sub1_3.anInterface4_12.method2450(arg11[local288]).aBoolean332) {
					local415 = true;
				}
			}
			local95.anIntArray174 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray175 = new int[local133];
			}
			local95.aShortArray33 = new short[local133];
			local95.aShortArray36 = new short[local133];
			local95.aShortArray30 = new short[local133];
			if (local415) {
				local95.aShortArray31 = new short[local133];
				local95.aShortArray29 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray174[local95.aShort37] = Static249.method3750(arg9[local335]);
					} else {
						local95.anIntArray174[local95.aShort37] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray175[local95.aShort37] = -1;
						} else {
							local95.anIntArray175[local95.aShort37] = Static249.method3750(arg10[local335]);
						}
					}
					local95.aShortArray33[local95.aShort37] = (short) arg6[local335];
					local95.aShortArray36[local95.aShort37] = (short) arg7[local335];
					local95.aShortArray30[local95.aShort37] = (short) arg8[local335];
					if (local415) {
						if (arg11[local335] == -1 || this.aClass39_Sub1_3.anInterface4_12.method2450(arg11[local335]).aBoolean332) {
							local95.aShortArray31[local95.aShort37] = -1;
						} else {
							local95.aShortArray31[local95.aShort37] = (short) arg11[local335];
							local95.aShortArray29[local95.aShort37] = (short) arg12[local335];
						}
					}
					local95.aShort37++;
				}
			}
			this.aClass70ArrayArray1[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(644) Class62 local644 = new Class62();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local644.anInt1911 = Static376.method5105(this.aByteArrayArray12[arg0][arg1] - this.aByteArrayArray13[arg0][arg1], Static249.method3750(arg10[0]));
				if (local64 == -1) {
					local644.aByte43 = (byte) (local644.aByte43 | 0x2);
				}
			}
			if (this.anIntArrayArray47[arg0][arg1] == this.anIntArrayArray47[arg0 + 1][arg1] && this.anIntArrayArray47[arg0][arg1] == this.anIntArrayArray47[arg0 + 1][arg1 + 1] && this.anIntArrayArray47[arg0][arg1] == this.anIntArrayArray47[arg0][arg1 + 1]) {
				local644.aByte43 = (byte) (local644.aByte43 | 0x1);
			}
			if (local70 == -1 || (local644.aByte43 & 0x2) != 0 || this.aClass39_Sub1_3.anInterface4_12.method2450(local70).aBoolean332) {
				@Pc(845) short local845 = Static249.method3750(local64);
				local644.aShort32 = (short) Static376.method5105(this.aByteArrayArray12[arg0][arg1] - this.aByteArrayArray13[arg0][arg1], local845);
				local644.aShort34 = (short) Static376.method5105(this.aByteArrayArray12[arg0 + 1][arg1] - this.aByteArrayArray13[arg0 + 1][arg1], local845);
				local644.aShort35 = (short) Static376.method5105(this.aByteArrayArray12[arg0 + 1][arg1 + 1] - this.aByteArrayArray13[arg0 + 1][arg1 + 1], local845);
				local644.aShort31 = (short) Static376.method5105(this.aByteArrayArray12[arg0][arg1 + 1] - this.aByteArrayArray13[arg0][arg1 + 1], local845);
				local644.aShort33 = -1;
			} else {
				local644.aShort32 = (short) (this.aByteArrayArray12[arg0][arg1] - this.aByteArrayArray13[arg0][arg1]);
				local644.aShort34 = (short) (this.aByteArrayArray12[arg0 + 1][arg1] - this.aByteArrayArray13[arg0 + 1][arg1]);
				local644.aShort35 = (short) (this.aByteArrayArray12[arg0 + 1][arg1 + 1] - this.aByteArrayArray13[arg0 + 1][arg1 + 1]);
				local644.aShort31 = (short) (this.aByteArrayArray12[arg0][arg1 + 1] - this.aByteArrayArray13[arg0][arg1 + 1]);
				local644.aShort33 = (short) local70;
			}
			this.aClass62ArrayArray1[arg0][arg1] = local644;
		}
	}

	@OriginalMember(owner = "client!lv", name = "k", descriptor = "(IILclient!ba;)Lclient!ba;")
	@Override
	public Class1_Sub2_Sub1 k(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub1 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IILclient!og;[I[I[I)V")
	private void method3576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class62 local6 = this.aClass62ArrayArray1[arg0][arg1];
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
			@Pc(1022) Class70 local1022 = this.aClass70ArrayArray1[arg0][arg1];
			if (local1022 != null) {
				@Pc(1046) short local1046;
				if (this.anInt4331 == -1) {
					for (local362 = 0; local362 < local1022.aShort38; local362++) {
						local24 = local1022.aShortArray34[local362] + (arg0 << super.anInt4316);
						local1046 = local1022.aShortArray35[local362];
						local34 = local1022.aShortArray32[local362] + (arg1 << super.anInt4316);
						local306 = this.anInt4325 + (this.anInt4333 * local24 + this.anInt4322 * local1046 + this.anInt4323 * local34 >> 15);
						if (local306 <= this.aClass39_Sub1_3.anInt1071) {
							return;
						}
						local194 = this.anInt4327 + (this.anInt4321 * local24 + this.anInt4329 * local1046 + this.anInt4332 * local34 >> 15);
						local250 = this.anInt4328 + (this.anInt4326 * local24 + this.anInt4330 * local1046 + this.anInt4320 * local34 >> 15);
						arg3[local362] = arg2.anInt4974 + local194 * this.aClass39_Sub1_3.anInt1047 / local306;
						arg4[local362] = arg2.anInt4979 + local250 * this.aClass39_Sub1_3.anInt1070 / local306;
					}
				} else {
					for (local362 = 0; local362 < local1022.aShort38; local362++) {
						local24 = local1022.aShortArray34[local362] + (arg0 << super.anInt4316);
						local1046 = local1022.aShortArray35[local362];
						local34 = local1022.aShortArray32[local362] + (arg1 << super.anInt4316);
						local194 = this.anInt4327 + (this.anInt4321 * local24 + this.anInt4329 * local1046 + this.anInt4332 * local34 >> 15);
						local250 = this.anInt4328 + (this.anInt4326 * local24 + this.anInt4330 * local1046 + this.anInt4320 * local34 >> 15);
						arg3[local362] = arg2.anInt4974 + local194 * this.aClass39_Sub1_3.anInt1047 / this.anInt4331;
						arg4[local362] = arg2.anInt4979 + local250 * this.aClass39_Sub1_3.anInt1070 / this.anInt4331;
					}
				}
				if (local1022.aShortArray31 != null) {
					local362 = this.anIntArrayArray47[arg0][arg1];
					local222 = this.anIntArrayArray47[arg0 + 1][arg1];
					local278 = this.anIntArrayArray47[arg0][arg1 + 1];
					local334 = arg0 * super.anInt4318;
					local390 = local334 + super.anInt4318;
					local183 = arg1 * super.anInt4318;
					local239 = local183 + super.anInt4318;
					local295 = this.anInt4327 + (this.anInt4321 * local334 + this.anInt4329 * local362 + this.anInt4332 * local183 >> 15);
					local351 = this.anInt4328 + (this.anInt4326 * local334 + this.anInt4330 * local362 + this.anInt4320 * local183 >> 15);
					local211 = this.anInt4325 + (this.anInt4333 * local334 + this.anInt4322 * local362 + this.anInt4323 * local183 >> 15);
					local267 = this.anInt4327 + (this.anInt4321 * local390 + this.anInt4329 * local222 + this.anInt4332 * local183 >> 15);
					local323 = this.anInt4328 + (this.anInt4326 * local390 + this.anInt4330 * local222 + this.anInt4320 * local183 >> 15);
					local379 = this.anInt4325 + (this.anInt4333 * local390 + this.anInt4322 * local222 + this.anInt4323 * local183 >> 15);
					local72 = this.anInt4327 + (this.anInt4321 * local334 + this.anInt4329 * local278 + this.anInt4332 * local239 >> 15);
					local95 = this.anInt4328 + (this.anInt4326 * local334 + this.anInt4330 * local278 + this.anInt4320 * local239 >> 15);
					local118 = this.anInt4325 + (this.anInt4333 * local334 + this.anInt4322 * local278 + this.anInt4323 * local239 >> 15);
					for (local141 = 0; local141 < local1022.aShort37; local141++) {
						@Pc(1491) short local1491 = local1022.aShortArray33[local141];
						@Pc(1496) short local1496 = local1022.aShortArray36[local141];
						@Pc(1501) short local1501 = local1022.aShortArray30[local141];
						local427 = arg3[local1491];
						@Pc(1509) int local1509 = arg3[local1496];
						@Pc(1513) int local1513 = arg3[local1501];
						@Pc(1517) int local1517 = arg4[local1491];
						@Pc(1521) int local1521 = arg4[local1496];
						@Pc(1525) int local1525 = arg4[local1501];
						if ((local427 - local1509) * (local1525 - local1521) - (local1517 - local1521) * (local1513 - local1509) > 0) {
							arg2.aBoolean326 = local427 < 0 || local1509 < 0 || local1513 < 0 || local427 > arg2.anInt4978 || local1509 > arg2.anInt4978 || local1513 > arg2.anInt4978;
							@Pc(1569) short local1569 = local1022.aShortArray31[local141];
							if (local1569 == -1) {
								@Pc(1624) int local1624 = local1022.anIntArray174[local141];
								if (local1624 != -1) {
									arg2.method4127(local1517, local1521, local1525, local427, local1509, local1513, Static376.method5105(local1022.aShortArray28[local1491], local1624), Static376.method5105(local1022.aShortArray28[local1496], local1624), Static376.method5105(local1022.aShortArray28[local1501], local1624));
								}
							} else {
								if (this.method3574(this.aClass39_Sub1_3.anInterface4_12.method2450(local1569).aByte76)) {
									arg2.anInt4977 = 100;
								}
								arg2.method4132(local1517, local1521, local1525, local427, local1509, local1513, local1022.aShortArray28[local1491], local1022.aShortArray28[local1496], local1022.aShortArray28[local1501], local295, local267, local72, local351, local323, local95, local211, local379, local118, local1569);
								arg2.anInt4977 = 0;
							}
						}
					}
					return;
				}
				for (local362 = 0; local362 < local1022.aShort37; local362++) {
					@Pc(1670) short local1670 = local1022.aShortArray33[local362];
					@Pc(1675) short local1675 = local1022.aShortArray36[local362];
					@Pc(1680) short local1680 = local1022.aShortArray30[local362];
					local390 = arg3[local1670];
					local183 = arg3[local1675];
					local239 = arg3[local1680];
					local295 = arg4[local1670];
					local351 = arg4[local1675];
					local211 = arg4[local1680];
					if ((local390 - local183) * (local211 - local351) - (local295 - local351) * (local239 - local183) > 0) {
						local267 = local1022.anIntArray174[local362];
						if (local267 != -1) {
							arg2.aBoolean326 = local390 < 0 || local183 < 0 || local239 < 0 || local390 > arg2.anInt4978 || local183 > arg2.anInt4978 || local239 > arg2.anInt4978;
							arg2.method4127(local295, local351, local211, local390, local183, local239, Static376.method5105(local1022.aShortArray28[local1670], local267), Static376.method5105(local1022.aShortArray28[local1675], local267), Static376.method5105(local1022.aShortArray28[local1680], local267));
						}
					}
				}
			}
		} else if ((local6.aByte43 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt4318;
			local24 = local19 + super.anInt4318;
			@Pc(29) int local29 = arg1 * super.anInt4318;
			local34 = local29 + super.anInt4318;
			@Pc(46) int local46;
			@Pc(55) int local55;
			@Pc(166) int local166;
			if ((local6.aByte43 & 0x1) == 0) {
				local46 = this.anIntArrayArray47[arg0][arg1];
				local55 = this.anIntArrayArray47[arg0 + 1][arg1];
				local166 = this.anIntArrayArray47[arg0 + 1][arg1 + 1];
				local427 = this.anIntArrayArray47[arg0][arg1 + 1];
				if (this.anInt4331 == -1) {
					local72 = this.anInt4325 + (this.anInt4333 * local19 + this.anInt4322 * local46 + this.anInt4323 * local29 >> 15);
					if (local72 <= this.aClass39_Sub1_3.anInt1071) {
						return;
					}
					local95 = this.anInt4325 + (this.anInt4333 * local24 + this.anInt4322 * local55 + this.anInt4323 * local29 >> 15);
					if (local95 <= this.aClass39_Sub1_3.anInt1071) {
						return;
					}
					local118 = this.anInt4325 + (this.anInt4333 * local24 + this.anInt4322 * local166 + this.anInt4323 * local34 >> 15);
					if (local118 <= this.aClass39_Sub1_3.anInt1071) {
						return;
					}
					local141 = this.anInt4325 + (this.anInt4333 * local19 + this.anInt4322 * local427 + this.anInt4323 * local34 >> 15);
					if (local141 <= this.aClass39_Sub1_3.anInt1071) {
						return;
					}
				} else {
					local141 = this.anInt4331;
					local118 = this.anInt4331;
					local95 = this.anInt4331;
					local72 = this.anInt4331;
				}
				local183 = this.anInt4327 + (this.anInt4321 * local19 + this.anInt4329 * local46 + this.anInt4332 * local29 >> 15);
				local194 = arg2.anInt4974 + local183 * this.aClass39_Sub1_3.anInt1047 / local72;
				local211 = this.anInt4328 + (this.anInt4326 * local19 + this.anInt4330 * local46 + this.anInt4320 * local29 >> 15);
				local222 = arg2.anInt4979 + local211 * this.aClass39_Sub1_3.anInt1070 / local72;
				local239 = this.anInt4327 + (this.anInt4321 * local24 + this.anInt4329 * local55 + this.anInt4332 * local29 >> 15);
				local250 = arg2.anInt4974 + local239 * this.aClass39_Sub1_3.anInt1047 / local95;
				local267 = this.anInt4328 + (this.anInt4326 * local24 + this.anInt4330 * local55 + this.anInt4320 * local29 >> 15);
				local278 = arg2.anInt4979 + local267 * this.aClass39_Sub1_3.anInt1070 / local95;
				local295 = this.anInt4327 + (this.anInt4321 * local24 + this.anInt4329 * local166 + this.anInt4332 * local34 >> 15);
				local306 = arg2.anInt4974 + local295 * this.aClass39_Sub1_3.anInt1047 / local118;
				local323 = this.anInt4328 + (this.anInt4326 * local24 + this.anInt4330 * local166 + this.anInt4320 * local34 >> 15);
				local334 = arg2.anInt4979 + local323 * this.aClass39_Sub1_3.anInt1070 / local118;
				local351 = this.anInt4327 + (this.anInt4321 * local19 + this.anInt4329 * local427 + this.anInt4332 * local34 >> 15);
				local362 = arg2.anInt4974 + local351 * this.aClass39_Sub1_3.anInt1047 / local141;
				local379 = this.anInt4328 + (this.anInt4326 * local19 + this.anInt4330 * local427 + this.anInt4320 * local34 >> 15);
				local390 = arg2.anInt4979 + local379 * this.aClass39_Sub1_3.anInt1070 / local141;
			} else {
				local46 = this.anIntArrayArray47[arg0][arg1];
				if (this.anInt4331 == -1) {
					local55 = this.anInt4322 * local46;
					local72 = this.anInt4325 + (this.anInt4333 * local19 + local55 + this.anInt4323 * local29 >> 15);
					if (local72 <= this.aClass39_Sub1_3.anInt1071) {
						return;
					}
					local95 = this.anInt4325 + (this.anInt4333 * local24 + local55 + this.anInt4323 * local29 >> 15);
					if (local95 <= this.aClass39_Sub1_3.anInt1071) {
						return;
					}
					local118 = this.anInt4325 + (this.anInt4333 * local24 + local55 + this.anInt4323 * local34 >> 15);
					if (local118 <= this.aClass39_Sub1_3.anInt1071) {
						return;
					}
					local141 = this.anInt4325 + (this.anInt4333 * local19 + local55 + this.anInt4323 * local34 >> 15);
					if (local141 <= this.aClass39_Sub1_3.anInt1071) {
						return;
					}
				} else {
					local141 = this.anInt4331;
					local118 = this.anInt4331;
					local95 = this.anInt4331;
					local72 = this.anInt4331;
				}
				local55 = this.anInt4329 * local46;
				local166 = this.anInt4330 * local46;
				local183 = this.anInt4327 + (this.anInt4321 * local19 + local55 + this.anInt4332 * local29 >> 15);
				local194 = arg2.anInt4974 + local183 * this.aClass39_Sub1_3.anInt1047 / local72;
				local211 = this.anInt4328 + (this.anInt4326 * local19 + local166 + this.anInt4320 * local29 >> 15);
				local222 = arg2.anInt4979 + local211 * this.aClass39_Sub1_3.anInt1070 / local72;
				local239 = this.anInt4327 + (this.anInt4321 * local24 + local55 + this.anInt4332 * local29 >> 15);
				local250 = arg2.anInt4974 + local239 * this.aClass39_Sub1_3.anInt1047 / local95;
				local267 = this.anInt4328 + (this.anInt4326 * local24 + local166 + this.anInt4320 * local29 >> 15);
				local278 = arg2.anInt4979 + local267 * this.aClass39_Sub1_3.anInt1070 / local95;
				local295 = this.anInt4327 + (this.anInt4321 * local24 + local55 + this.anInt4332 * local34 >> 15);
				local306 = arg2.anInt4974 + local295 * this.aClass39_Sub1_3.anInt1047 / local118;
				local323 = this.anInt4328 + (this.anInt4326 * local24 + local166 + this.anInt4320 * local34 >> 15);
				local334 = arg2.anInt4979 + local323 * this.aClass39_Sub1_3.anInt1070 / local118;
				local351 = this.anInt4327 + (this.anInt4321 * local19 + local55 + this.anInt4332 * local34 >> 15);
				local362 = arg2.anInt4974 + local351 * this.aClass39_Sub1_3.anInt1047 / local141;
				local379 = this.anInt4328 + (this.anInt4326 * local19 + local166 + this.anInt4320 * local34 >> 15);
				local390 = arg2.anInt4979 + local379 * this.aClass39_Sub1_3.anInt1070 / local141;
			}
			if ((local306 - local362) * (local278 - local390) - (local334 - local390) * (local250 - local362) > 0) {
				arg2.aBoolean326 = local306 < 0 || local362 < 0 || local250 < 0 || local306 > arg2.anInt4978 || local362 > arg2.anInt4978 || local250 > arg2.anInt4978;
				if (local6.aShort33 >= 0) {
					if (this.method3574(this.aClass39_Sub1_3.anInterface4_12.method2450(local6.aShort33).aByte76)) {
						arg2.anInt4977 = 100;
					}
					arg2.method4132(local334, local390, local278, local306, local362, local250, local6.aShort35 & 0xFFFF, local6.aShort31 & 0xFFFF, local6.aShort34 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort33);
					arg2.anInt4977 = 0;
				} else {
					arg2.method4127(local334, local390, local278, local306, local362, local250, local6.aShort35 & 0xFFFF, local6.aShort31 & 0xFFFF, local6.aShort34 & 0xFFFF);
				}
			}
			if ((local194 - local250) * (local390 - local278) - (local222 - local278) * (local362 - local250) > 0) {
				arg2.aBoolean326 = local194 < 0 || local250 < 0 || local362 < 0 || local194 > arg2.anInt4978 || local250 > arg2.anInt4978 || local362 > arg2.anInt4978;
				if (local6.aShort33 >= 0) {
					if (this.method3574(this.aClass39_Sub1_3.anInterface4_12.method2450(local6.aShort33).aByte76)) {
						arg2.anInt4977 = 100;
					}
					arg2.method4132(local222, local278, local390, local194, local250, local362, local6.aShort32 & 0xFFFF, local6.aShort34 & 0xFFFF, local6.aShort31 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort33);
					arg2.anInt4977 = 0;
					return;
				}
				arg2.method4127(local222, local278, local390, local194, local250, local362, local6.aShort32 & 0xFFFF, local6.aShort34 & 0xFFFF, local6.aShort31 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(IIIIIII[[ZLclient!og;[I[I)V")
	private void method3577(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class182 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean328 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass62ArrayArray1[local22][local25] != null) {
						@Pc(50) Class62 local50 = this.aClass62ArrayArray1[local22][local25];
						if (local50.aShort33 != -1 && (local50.aByte43 & 0x2) == 0 && local50.anInt1911 == -1) {
							local69 = this.aClass39_Sub1_3.method1074(local50.aShort33);
							arg5.method4127(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static376.method5105(local50.aShort35 & 0xFFFF, local69), Static376.method5105(local50.aShort31 & 0xFFFF, local69), Static376.method5105(local50.aShort34 & 0xFFFF, local69));
							arg5.method4127(local20, local20, local20 - 4, local16, local16 + 4, local16, Static376.method5105(local50.aShort32 & 0xFFFF, local69), Static376.method5105(local50.aShort34 & 0xFFFF, local69), Static376.method5105(local50.aShort31 & 0xFFFF, local69));
						} else if (local50.anInt1911 == -1) {
							arg5.method4127(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort35 & 0xFFFF, local50.aShort31 & 0xFFFF, local50.aShort34 & 0xFFFF);
							arg5.method4127(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort32 & 0xFFFF, local50.aShort34 & 0xFFFF, local50.aShort31 & 0xFFFF);
						} else {
							local69 = local50.anInt1911;
							arg5.method4127(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method4127(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass70ArrayArray1[local22][local25] != null) {
						@Pc(249) Class70 local249 = this.aClass70ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort38; local69++) {
							arg6[local69] = local16 + local249.aShortArray34[local69] * 4 / super.anInt4318;
							arg7[local69] = local20 - local249.aShortArray32[local69] * 4 / super.anInt4318;
						}
						for (@Pc(287) int local287 = 0; local287 < local249.aShort37; local287++) {
							@Pc(293) short local293 = local249.aShortArray33[local287];
							@Pc(298) short local298 = local249.aShortArray36[local287];
							@Pc(303) short local303 = local249.aShortArray30[local287];
							@Pc(307) int local307 = arg6[local293];
							@Pc(311) int local311 = arg6[local298];
							@Pc(315) int local315 = arg6[local303];
							@Pc(319) int local319 = arg7[local293];
							@Pc(323) int local323 = arg7[local298];
							@Pc(327) int local327 = arg7[local303];
							@Pc(341) int local341;
							if (local249.anIntArray175 != null && local249.anIntArray175[local287] != -1) {
								local341 = local249.anIntArray175[local287];
								arg5.method4127(local319, local323, local327, local307, local311, local315, Static376.method5105(local249.aShortArray28[local293], local341), Static376.method5105(local249.aShortArray28[local298], local341), Static376.method5105(local249.aShortArray28[local303], local341));
							} else if (local249.aShortArray31 == null || local249.aShortArray31[local287] == -1) {
								local341 = local249.anIntArray174[local287];
								arg5.method4127(local319, local323, local327, local307, local311, local315, Static376.method5105(local249.aShortArray28[local293], local341), Static376.method5105(local249.aShortArray28[local298], local341), Static376.method5105(local249.aShortArray28[local303], local341));
							} else {
								local341 = this.aClass39_Sub1_3.method1074(local249.aShortArray31[local287]);
								arg5.method4127(local319, local323, local327, local307, local311, local315, Static376.method5105(local249.aShortArray28[local293], local341), Static376.method5105(local249.aShortArray28[local298], local341), Static376.method5105(local249.aShortArray28[local303], local341));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean328 = true;
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(II)V")
	@Override
	public void method3572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class196 local4 = this.aClass39_Sub1_3.method1077(Thread.currentThread());
		local4.aClass182_2.anInt4977 = 0;
		if (this.aClass146ArrayArray1 != null) {
			this.method3575(arg0, arg1, this.aClass39_Sub1_3.aBoolean54, local4.aClass182_2, local4.anIntArray480, local4.anIntArray487, local4.anIntArray486);
		} else if (this.aClass62ArrayArray1 != null) {
			this.method3576(arg0, arg1, local4.aClass182_2, local4.anIntArray480, local4.anIntArray487, local4.anIntArray486);
		}
	}

	@OriginalMember(owner = "client!lv", name = "l", descriptor = "(II)I")
	@Override
	public int l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray47[arg0][arg1];
	}
}
