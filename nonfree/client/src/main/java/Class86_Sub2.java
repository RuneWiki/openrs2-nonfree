import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class86_Sub2 extends Class86 {

	@OriginalMember(owner = "client!wu", name = "i", descriptor = "I")
	private int anInt8052;

	@OriginalMember(owner = "client!wu", name = "l", descriptor = "I")
	private int anInt8055;

	@OriginalMember(owner = "client!wu", name = "m", descriptor = "I")
	private int anInt8056;

	@OriginalMember(owner = "client!wu", name = "n", descriptor = "[[Lclient!ls;")
	private Class157[][] aClass157ArrayArray1;

	@OriginalMember(owner = "client!wu", name = "o", descriptor = "I")
	private int anInt8057;

	@OriginalMember(owner = "client!wu", name = "p", descriptor = "I")
	private int anInt8058;

	@OriginalMember(owner = "client!wu", name = "q", descriptor = "[[Lclient!mp;")
	private Class167[][] aClass167ArrayArray1;

	@OriginalMember(owner = "client!wu", name = "r", descriptor = "I")
	private int anInt8059;

	@OriginalMember(owner = "client!wu", name = "s", descriptor = "I")
	private int anInt8060;

	@OriginalMember(owner = "client!wu", name = "v", descriptor = "[[Lclient!bi;")
	private Class24[][] aClass24ArrayArray1;

	@OriginalMember(owner = "client!wu", name = "w", descriptor = "I")
	private int anInt8061;

	@OriginalMember(owner = "client!wu", name = "x", descriptor = "[[Lclient!ku;")
	private Class148[][] aClass148ArrayArray1;

	@OriginalMember(owner = "client!wu", name = "z", descriptor = "I")
	private int anInt8062;

	@OriginalMember(owner = "client!wu", name = "A", descriptor = "I")
	private int anInt8063;

	@OriginalMember(owner = "client!wu", name = "B", descriptor = "I")
	private int anInt8064;

	@OriginalMember(owner = "client!wu", name = "D", descriptor = "I")
	private int anInt8065;

	@OriginalMember(owner = "client!wu", name = "j", descriptor = "I")
	private int anInt8053 = -1;

	@OriginalMember(owner = "client!wu", name = "C", descriptor = "Lclient!lg;")
	private final Class66_Sub1 aClass66_Sub1_11;

	@OriginalMember(owner = "client!wu", name = "k", descriptor = "I")
	private final int anInt8054;

	@OriginalMember(owner = "client!wu", name = "u", descriptor = "[[I")
	public final int[][] anIntArrayArray64;

	@OriginalMember(owner = "client!wu", name = "y", descriptor = "[[B")
	private byte[][] aByteArrayArray27;

	@OriginalMember(owner = "client!wu", name = "t", descriptor = "[[B")
	private byte[][] aByteArrayArray26;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lclient!lg;IIII[[I[[II)V")
	public Class86_Sub2(@OriginalArg(0) Class66_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass66_Sub1_11 = arg0;
		this.anInt8054 = arg2;
		this.anIntArrayArray64 = arg5;
		this.aByteArrayArray27 = new byte[arg3 + 1][arg4 + 1];
		@Pc(31) int local31 = this.aClass66_Sub1_11.anInt4141 >> 9;
		for (@Pc(33) int local33 = 1; local33 < arg4; local33++) {
			for (@Pc(36) int local36 = 1; local36 < arg3; local36++) {
				@Pc(55) int local55 = arg6[local36 + 1][local33] - arg6[local36 - 1][local33];
				@Pc(71) int local71 = arg6[local36][local33 + 1] - arg6[local36][local33 - 1];
				@Pc(86) int local86 = (int) Math.sqrt((double) (local55 * local55 + arg7 * 512 + local71 * local71));
				@Pc(92) int local92 = (local55 << 8) / local86;
				@Pc(98) int local98 = arg7 * -512 / local86;
				@Pc(104) int local104 = (local71 << 8) / local86;
				@Pc(126) int local126 = local31 + (this.aClass66_Sub1_11.anInt4143 * local92 + this.aClass66_Sub1_11.anInt4153 * local98 + this.aClass66_Sub1_11.anInt4134 * local104 >> 17);
				local126 >>= 0x1;
				if (local126 < 2) {
					local126 = 2;
				} else if (local126 > 126) {
					local126 = 126;
				}
				this.aByteArrayArray27[local36][local33] = (byte) local126;
			}
		}
		this.aByteArrayArray26 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "()V")
	@Override
	public void method6582() {
		this.aByteArrayArray27 = null;
		this.aByteArrayArray26 = null;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method6592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass167ArrayArray1 == null) {
			this.aClass167ArrayArray1 = new Class167[super.anInt8047][super.anInt8049];
			this.aClass157ArrayArray1 = new Class157[super.anInt8047][super.anInt8049];
		} else if (this.aClass24ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static97.anIntArray130[Static231.method6534(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static97.anIntArray130[Static231.method6534(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == super.anInt8050 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt8050 && arg4[local116] == super.anInt8050) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt8050) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt8050 && arg2[local244] != arg2[0] - super.anInt8050) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt8050 && arg4[local244] != arg4[0] - super.anInt8050) {
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
			@Pc(334) Class167 local334 = new Class167();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt4612 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte65 = (byte) (local334.aByte65 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray64[arg0][arg1] == this.anIntArrayArray64[arg0 + 1][arg1] && this.anIntArrayArray64[arg0][arg1] == this.anIntArrayArray64[arg0 + 1][arg1 + 1] && this.anIntArrayArray64[arg0][arg1] == this.anIntArrayArray64[arg0][arg1 + 1]) {
				local334.aByte65 = (byte) (local334.aByte65 | 0x1);
			}
			if (local342 == -1 || (local334.aByte65 & 0x2) != 0 || this.aClass66_Sub1_11.anInterface8_5.method5566(local342).aBoolean330) {
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
				local334.anInt4611 = Static29.method719(local527, Static460.method6601(arg6[local104] >> 8, this.aByteArrayArray27[arg0][arg1] - this.aByteArrayArray26[arg0][arg1]), arg10);
				if (local334.anInt4612 != 0) {
					local334.anInt4611 |= this.aByteArrayArray26[arg0][arg1] + 255 - this.aByteArrayArray27[arg0][arg1] << 25;
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
				local334.anInt4609 = Static29.method719(local527, Static460.method6601(arg6[local106] >> 8, this.aByteArrayArray27[arg0 + 1][arg1] - this.aByteArrayArray26[arg0 + 1][arg1]), arg10);
				if (local334.anInt4612 != 0) {
					local334.anInt4609 |= this.aByteArrayArray26[arg0 + 1][arg1] + 255 - this.aByteArrayArray27[arg0 + 1][arg1] << 25;
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
				local334.anInt4610 = Static29.method719(local527, Static460.method6601(arg6[local108] >> 8, this.aByteArrayArray27[arg0 + 1][arg1 + 1] - this.aByteArrayArray26[arg0 + 1][arg1 + 1]), arg10);
				if (local334.anInt4612 != 0) {
					local334.anInt4610 |= this.aByteArrayArray26[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray27[arg0 + 1][arg1 + 1] << 25;
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
				local334.anInt4608 = Static29.method719(local527, Static460.method6601(arg6[local110] >> 8, this.aByteArrayArray27[arg0][arg1 + 1] - this.aByteArrayArray26[arg0][arg1 + 1]), arg10);
				if (local334.anInt4612 != 0) {
					local334.anInt4608 |= this.aByteArrayArray26[arg0][arg1 + 1] + 255 - this.aByteArrayArray27[arg0][arg1 + 1] << 25;
				}
				local334.aShort61 = -1;
			} else {
				local334.anInt4611 = this.aByteArrayArray27[arg0][arg1] - this.aByteArrayArray26[arg0][arg1];
				local334.anInt4609 = this.aByteArrayArray27[arg0 + 1][arg1] - this.aByteArrayArray26[arg0 + 1][arg1];
				local334.anInt4610 = this.aByteArrayArray27[arg0 + 1][arg1 + 1] - this.aByteArrayArray26[arg0 + 1][arg1 + 1];
				local334.anInt4608 = this.aByteArrayArray27[arg0][arg1 + 1] - this.aByteArrayArray26[arg0][arg1 + 1];
				local334.aShort61 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort63 = (short) arg5[local108];
				local334.aShort60 = (short) arg5[local110];
				local334.aShort59 = (short) arg5[local106];
				local334.aShort62 = (short) arg5[local104];
			}
			this.aClass167ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class157 local888 = new Class157();
		local888.aShort50 = (short) arg2.length;
		local888.aShort51 = (short) (arg2.length / 3);
		local888.aShortArray58 = new short[local888.aShort50];
		local888.aShortArray57 = new short[local888.aShort50];
		local888.aShortArray61 = new short[local888.aShort50];
		local888.anIntArray308 = new int[local888.aShort50];
		if (arg5 != null) {
			local888.aShortArray56 = new short[local888.aShort50];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort50; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray27[arg0][arg1] - this.aByteArrayArray26[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt8050) {
				local958 = this.aByteArrayArray27[arg0][arg1 + 1] - this.aByteArrayArray26[arg0][arg1 + 1];
			} else if (local342 == super.anInt8050 && local527 == super.anInt8050) {
				local958 = this.aByteArrayArray27[arg0 + 1][arg1 + 1] - this.aByteArrayArray26[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt8050 && local527 == 0) {
				local958 = this.aByteArrayArray27[arg0 + 1][arg1] - this.aByteArrayArray26[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray27[arg0][arg1] - this.aByteArrayArray26[arg0][arg1]) * (super.anInt8050 - local342) + (this.aByteArrayArray27[arg0 + 1][arg1] - this.aByteArrayArray26[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray27[arg0][arg1 + 1] - this.aByteArrayArray26[arg0][arg1 + 1]) * (super.anInt8050 - local342) + (this.aByteArrayArray27[arg0 + 1][arg1 + 1] - this.aByteArrayArray26[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt8050 - local527) + local1126 * local527 >> super.anInt8051 * 2;
			}
			local1079 = (arg0 << super.anInt8051) + local342;
			local1126 = (arg1 << super.anInt8051) + local527;
			local888.aShortArray58[local244] = (short) local342;
			local888.aShortArray61[local244] = (short) local527;
			local888.aShortArray57[local244] = (short) (this.method6590(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass66_Sub1_11.anInterface8_5.method5566(arg8[local244]).aBoolean330) {
				local888.anIntArray308[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray56[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray308[local244] = Static29.method719(local1226, Static460.method6601(arg6[local244] >> 8, local958), arg10);
				if (arg7 != null) {
					local888.anIntArray308[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray308[local244] = 0;
			} else {
				local888.anIntArray308[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort51; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass66_Sub1_11.anInterface8_5.method5566(arg8[local527 * 3]).aBoolean330) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray307 = new int[local888.aShort51];
		}
		if (local1296) {
			local888.aShortArray60 = new short[local888.aShort51];
			local888.aShortArray59 = new short[local888.aShort51];
		}
		for (local958 = 0; local958 < local888.aShort51; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray307[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass66_Sub1_11.anInterface8_5.method5566(local1384).aBoolean330) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass66_Sub1_11.anInterface8_5.method5566(local1384).aBoolean330) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass66_Sub1_11.anInterface8_5.method5566(local1384).aBoolean330) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray60[local958] = (short) local1384;
					local888.aShortArray59[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass66_Sub1_11.anInterface8_5.method5566(local1384).aBoolean330) {
							local888.anIntArray308[local1079] = Static97.anIntArray130[Static231.method6534(this.aClass66_Sub1_11.anInterface8_5.method5566(local1384).aShort72 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass66_Sub1_11.anInterface8_5.method5566(local1384).aBoolean330) {
							local888.anIntArray308[local1126] = Static97.anIntArray130[Static231.method6534(this.aClass66_Sub1_11.anInterface8_5.method5566(local1384).aShort72 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass66_Sub1_11.anInterface8_5.method5566(local1384).aBoolean330) {
							local888.anIntArray308[local1226] = Static97.anIntArray130[Static231.method6534(this.aClass66_Sub1_11.anInterface8_5.method5566(local1384).aShort72 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray60[local958] = -1;
				}
			}
		}
		this.aClass157ArrayArray1[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIZLclient!of;[I[I[I)V")
	private void method6598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class179 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class167 local6 = this.aClass167ArrayArray1[arg0][arg1];
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
			@Pc(1452) Class157 local1452 = this.aClass157ArrayArray1[arg0][arg1];
			if (local1452 != null) {
				if (this.anInt8053 == -1) {
					for (local436 = 0; local436 < local1452.aShort50; local436++) {
						local24 = local1452.aShortArray58[local436] + (arg0 << super.anInt8051);
						local29 = local1452.aShortArray57[local436];
						local34 = local1452.aShortArray61[local436] + (arg1 << super.anInt8051);
						local380 = this.anInt8056 + (this.anInt8059 * local24 + this.anInt8064 * local29 + this.anInt8052 * local34 >> 15);
						if (local380 <= this.aClass66_Sub1_11.anInt4159) {
							return;
						}
						arg6[local436] = 0;
						if (arg2) {
							local296 = local380 - this.aClass66_Sub1_11.anInt4158;
							if (local296 > 255) {
								local296 = 255;
							}
							if (local296 > 0) {
								arg6[local436] = local296;
								local352 = local1452.aShortArray56[local436] * local296 / 255;
								if (local352 > 0) {
									local29 -= local352;
								}
							}
						} else if (this.aClass66_Sub1_11.aBoolean275) {
							local296 = local380 - this.aClass66_Sub1_11.anInt4158;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt8058 + (this.anInt8055 * local24 + this.anInt8062 * local29 + this.anInt8060 * local34 >> 15);
						local324 = this.anInt8063 + (this.anInt8061 * local24 + this.anInt8057 * local29 + this.anInt8065 * local34 >> 15);
						arg4[local436] = arg3.anInt5104 + local268 * this.aClass66_Sub1_11.anInt4136 / local380;
						arg5[local436] = arg3.anInt5103 + local324 * this.aClass66_Sub1_11.anInt4160 / local380;
					}
				} else {
					for (local436 = 0; local436 < local1452.aShort50; local436++) {
						local24 = local1452.aShortArray58[local436] + (arg0 << super.anInt8051);
						local29 = local1452.aShortArray57[local436];
						local34 = local1452.aShortArray61[local436] + (arg1 << super.anInt8051);
						arg6[local436] = 0;
						if (arg2) {
							local296 = this.anInt8053 - this.aClass66_Sub1_11.anInt4158;
							if (local296 > 255) {
								local296 = 255;
							}
							if (local296 > 0) {
								arg6[local436] = local296;
								local352 = local1452.aShortArray56[local436] * local296 / 255;
								if (local352 > 0) {
									local29 -= local352;
								}
							}
						} else if (this.aClass66_Sub1_11.aBoolean275) {
							local296 = this.anInt8053 - this.aClass66_Sub1_11.anInt4158;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt8058 + (this.anInt8055 * local24 + this.anInt8062 * local29 + this.anInt8060 * local34 >> 15);
						local324 = this.anInt8063 + (this.anInt8061 * local24 + this.anInt8057 * local29 + this.anInt8065 * local34 >> 15);
						arg4[local436] = arg3.anInt5104 + local268 * this.aClass66_Sub1_11.anInt4136 / this.anInt8053;
						arg5[local436] = arg3.anInt5103 + local324 * this.aClass66_Sub1_11.anInt4160 / this.anInt8053;
					}
				}
				if (local1452.aShortArray60 != null) {
					local436 = this.anIntArrayArray64[arg0][arg1];
					local296 = this.anIntArrayArray64[arg0 + 1][arg1];
					local352 = this.anIntArrayArray64[arg0][arg1 + 1];
					local408 = arg0 * super.anInt8050;
					local464 = local408 + super.anInt8050;
					local257 = arg1 * super.anInt8050;
					local313 = local257 + super.anInt8050;
					local369 = this.anInt8058 + (this.anInt8055 * local408 + this.anInt8062 * local436 + this.anInt8060 * local257 >> 15);
					local425 = this.anInt8063 + (this.anInt8061 * local408 + this.anInt8057 * local436 + this.anInt8065 * local257 >> 15);
					local285 = this.anInt8056 + (this.anInt8059 * local408 + this.anInt8064 * local436 + this.anInt8052 * local257 >> 15);
					local341 = this.anInt8058 + (this.anInt8055 * local464 + this.anInt8062 * local296 + this.anInt8060 * local257 >> 15);
					local397 = this.anInt8063 + (this.anInt8061 * local464 + this.anInt8057 * local296 + this.anInt8065 * local257 >> 15);
					local453 = this.anInt8056 + (this.anInt8059 * local464 + this.anInt8064 * local296 + this.anInt8052 * local257 >> 15);
					local82 = this.anInt8058 + (this.anInt8055 * local408 + this.anInt8062 * local352 + this.anInt8060 * local313 >> 15);
					local105 = this.anInt8063 + (this.anInt8061 * local408 + this.anInt8057 * local352 + this.anInt8065 * local313 >> 15);
					local128 = this.anInt8056 + (this.anInt8059 * local408 + this.anInt8064 * local352 + this.anInt8052 * local313 >> 15);
					for (local151 = 0; local151 < local1452.aShort51; local151++) {
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
							arg3.aBoolean314 = local42 < 0 || local176 < 0 || local56 < 0 || local42 > arg3.anInt5105 || local176 > arg3.anInt5105 || local56 > arg3.anInt5105;
							@Pc(2138) short local2138 = local1452.aShortArray60[local151];
							if (local642 < 765) {
								if (local2138 != -1 && this.method6603(this.aClass66_Sub1_11.anInterface8_5.method5566(local2138).aByte72)) {
									arg3.anInt5107 = 100;
								}
								if (local642 > 0) {
									if (local2138 != -1) {
										arg3.method4282(local65, local240, local501, local42, local176, local56, this.aClass66_Sub1_11.anInt4149, arg6[local36], arg6[local38], arg6[local40], local1452.anIntArray308[local36], local1452.anIntArray308[local38], local1452.anIntArray308[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
									} else if ((local1452.anIntArray308[local36] & 0xFFFFFF) != 0) {
										arg3.method4283(local65, local240, local501, local42, local176, local56, Static269.method4094(local1452.anIntArray308[local36], arg6[local36] << 24 | this.aClass66_Sub1_11.anInt4149), Static269.method4094(local1452.anIntArray308[local38], arg6[local38] << 24 | this.aClass66_Sub1_11.anInt4149), Static269.method4094(local1452.anIntArray308[local40], arg6[local40] << 24 | this.aClass66_Sub1_11.anInt4149));
									}
								} else if (local2138 != -1) {
									arg3.method4286(local65, local240, local501, local42, local176, local56, local1452.anIntArray308[local36], local1452.anIntArray308[local38], local1452.anIntArray308[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
								} else if ((local1452.anIntArray308[local36] & 0xFFFFFF) != 0) {
									arg3.method4283(local65, local240, local501, local42, local176, local56, local1452.anIntArray308[local36], local1452.anIntArray308[local38], local1452.anIntArray308[local40]);
								}
								arg3.anInt5107 = 0;
							} else {
								arg3.method4277(local65, local240, local501, local42, local176, local56, this.aClass66_Sub1_11.anInt4149);
							}
						}
					}
					return;
				}
				for (local436 = 0; local436 < local1452.aShort51; local436++) {
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
						arg3.aBoolean314 = local464 < 0 || local257 < 0 || local313 < 0 || local464 > arg3.anInt5105 || local257 > arg3.anInt5105 || local313 > arg3.anInt5105;
						if (local341 >= 765) {
							arg3.method4277(local369, local425, local285, local464, local257, local313, this.aClass66_Sub1_11.anInt4149);
						} else if (local341 > 0) {
							if ((local1452.anIntArray308[local296] & 0xFFFFFF) != 0) {
								arg3.method4283(local369, local425, local285, local464, local257, local313, Static29.method719(arg6[local296], local1452.anIntArray308[local296], this.aClass66_Sub1_11.anInt4149), Static29.method719(arg6[local352], local1452.anIntArray308[local352], this.aClass66_Sub1_11.anInt4149), Static29.method719(arg6[local408], local1452.anIntArray308[local408], this.aClass66_Sub1_11.anInt4149));
							}
						} else if ((local1452.anIntArray308[local296] & 0xFFFFFF) != 0) {
							arg3.method4283(local369, local425, local285, local464, local257, local313, local1452.anIntArray308[local296], local1452.anIntArray308[local352], local1452.anIntArray308[local408]);
						}
					}
				}
			}
		} else if ((local6.aByte65 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt8050;
			local24 = local19 + super.anInt8050;
			local29 = arg1 * super.anInt8050;
			local34 = local29 + super.anInt8050;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte65 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray64[arg0][arg1];
				local65 = this.anIntArrayArray64[arg0 + 1][arg1];
				local240 = this.anIntArrayArray64[arg0 + 1][arg1 + 1];
				local501 = this.anIntArrayArray64[arg0][arg1 + 1];
				if (this.anInt8053 == -1) {
					local82 = this.anInt8056 + (this.anInt8059 * local19 + this.anInt8064 * local56 + this.anInt8052 * local29 >> 15);
					if (local82 <= this.aClass66_Sub1_11.anInt4159) {
						return;
					}
					local105 = this.anInt8056 + (this.anInt8059 * local24 + this.anInt8064 * local65 + this.anInt8052 * local29 >> 15);
					if (local105 <= this.aClass66_Sub1_11.anInt4159) {
						return;
					}
					local128 = this.anInt8056 + (this.anInt8059 * local24 + this.anInt8064 * local240 + this.anInt8052 * local34 >> 15);
					if (local128 <= this.aClass66_Sub1_11.anInt4159) {
						return;
					}
					local151 = this.anInt8056 + (this.anInt8059 * local19 + this.anInt8064 * local501 + this.anInt8052 * local34 >> 15);
					if (local151 <= this.aClass66_Sub1_11.anInt4159) {
						return;
					}
				} else {
					local151 = this.anInt8053;
					local128 = this.anInt8053;
					local105 = this.anInt8053;
					local82 = this.anInt8053;
				}
				if (arg2) {
					local176 = local82 - this.aClass66_Sub1_11.anInt4158;
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
					local176 = local105 - this.aClass66_Sub1_11.anInt4158;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local38 = local176;
						local642 = local6.aShort59 * local176 / 255;
						if (local642 > 0) {
							local65 -= local642;
						}
					}
					local176 = local128 - this.aClass66_Sub1_11.anInt4158;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local40 = local176;
						local642 = local6.aShort63 * local176 / 255;
						if (local642 > 0) {
							local240 -= local642;
						}
					}
					local176 = local151 - this.aClass66_Sub1_11.anInt4158;
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
				} else if (this.aClass66_Sub1_11.aBoolean275) {
					local176 = local82 - this.aClass66_Sub1_11.anInt4158;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass66_Sub1_11.anInt4158;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass66_Sub1_11.anInt4158;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass66_Sub1_11.anInt4158;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local257 = this.anInt8058 + (this.anInt8055 * local19 + this.anInt8062 * local56 + this.anInt8060 * local29 >> 15);
				local268 = arg3.anInt5104 + local257 * this.aClass66_Sub1_11.anInt4136 / local82;
				local285 = this.anInt8063 + (this.anInt8061 * local19 + this.anInt8057 * local56 + this.anInt8065 * local29 >> 15);
				local296 = arg3.anInt5103 + local285 * this.aClass66_Sub1_11.anInt4160 / local82;
				local313 = this.anInt8058 + (this.anInt8055 * local24 + this.anInt8062 * local65 + this.anInt8060 * local29 >> 15);
				local324 = arg3.anInt5104 + local313 * this.aClass66_Sub1_11.anInt4136 / local105;
				local341 = this.anInt8063 + (this.anInt8061 * local24 + this.anInt8057 * local65 + this.anInt8065 * local29 >> 15);
				local352 = arg3.anInt5103 + local341 * this.aClass66_Sub1_11.anInt4160 / local105;
				local369 = this.anInt8058 + (this.anInt8055 * local24 + this.anInt8062 * local240 + this.anInt8060 * local34 >> 15);
				local380 = arg3.anInt5104 + local369 * this.aClass66_Sub1_11.anInt4136 / local128;
				local397 = this.anInt8063 + (this.anInt8061 * local24 + this.anInt8057 * local240 + this.anInt8065 * local34 >> 15);
				local408 = arg3.anInt5103 + local397 * this.aClass66_Sub1_11.anInt4160 / local128;
				local425 = this.anInt8058 + (this.anInt8055 * local19 + this.anInt8062 * local501 + this.anInt8060 * local34 >> 15);
				local436 = arg3.anInt5104 + local425 * this.aClass66_Sub1_11.anInt4136 / local151;
				local453 = this.anInt8063 + (this.anInt8061 * local19 + this.anInt8057 * local501 + this.anInt8065 * local34 >> 15);
				local464 = arg3.anInt5103 + local453 * this.aClass66_Sub1_11.anInt4160 / local151;
			} else {
				local56 = this.anIntArrayArray64[arg0][arg1];
				if (this.anInt8053 == -1) {
					local65 = this.anInt8064 * local56;
					local82 = this.anInt8056 + (this.anInt8059 * local19 + local65 + this.anInt8052 * local29 >> 15);
					if (local82 <= this.aClass66_Sub1_11.anInt4159) {
						return;
					}
					local105 = this.anInt8056 + (this.anInt8059 * local24 + local65 + this.anInt8052 * local29 >> 15);
					if (local105 <= this.aClass66_Sub1_11.anInt4159) {
						return;
					}
					local128 = this.anInt8056 + (this.anInt8059 * local24 + local65 + this.anInt8052 * local34 >> 15);
					if (local128 <= this.aClass66_Sub1_11.anInt4159) {
						return;
					}
					local151 = this.anInt8056 + (this.anInt8059 * local19 + local65 + this.anInt8052 * local34 >> 15);
					if (local151 <= this.aClass66_Sub1_11.anInt4159) {
						return;
					}
				} else {
					local151 = this.anInt8053;
					local128 = this.anInt8053;
					local105 = this.anInt8053;
					local82 = this.anInt8053;
				}
				if (this.aClass66_Sub1_11.aBoolean275) {
					local176 = local82 - this.aClass66_Sub1_11.anInt4158;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass66_Sub1_11.anInt4158;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass66_Sub1_11.anInt4158;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass66_Sub1_11.anInt4158;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local65 = this.anInt8062 * local56;
				local240 = this.anInt8057 * local56;
				local257 = this.anInt8058 + (this.anInt8055 * local19 + local65 + this.anInt8060 * local29 >> 15);
				local268 = arg3.anInt5104 + local257 * this.aClass66_Sub1_11.anInt4136 / local82;
				local285 = this.anInt8063 + (this.anInt8061 * local19 + local240 + this.anInt8065 * local29 >> 15);
				local296 = arg3.anInt5103 + local285 * this.aClass66_Sub1_11.anInt4160 / local82;
				local313 = this.anInt8058 + (this.anInt8055 * local24 + local65 + this.anInt8060 * local29 >> 15);
				local324 = arg3.anInt5104 + local313 * this.aClass66_Sub1_11.anInt4136 / local105;
				local341 = this.anInt8063 + (this.anInt8061 * local24 + local240 + this.anInt8065 * local29 >> 15);
				local352 = arg3.anInt5103 + local341 * this.aClass66_Sub1_11.anInt4160 / local105;
				local369 = this.anInt8058 + (this.anInt8055 * local24 + local65 + this.anInt8060 * local34 >> 15);
				local380 = arg3.anInt5104 + local369 * this.aClass66_Sub1_11.anInt4136 / local128;
				local397 = this.anInt8063 + (this.anInt8061 * local24 + local240 + this.anInt8065 * local34 >> 15);
				local408 = arg3.anInt5103 + local397 * this.aClass66_Sub1_11.anInt4160 / local128;
				local425 = this.anInt8058 + (this.anInt8055 * local19 + local65 + this.anInt8060 * local34 >> 15);
				local436 = arg3.anInt5104 + local425 * this.aClass66_Sub1_11.anInt4136 / local151;
				local453 = this.anInt8063 + (this.anInt8061 * local19 + local240 + this.anInt8065 * local34 >> 15);
				local464 = arg3.anInt5103 + local453 * this.aClass66_Sub1_11.anInt4160 / local151;
			}
			@Pc(1064) boolean local1064 = local6.aShort61 != -1 && this.method6603(this.aClass66_Sub1_11.anInterface8_5.method5566(local6.aShort61).aByte72);
			local65 = local38 + local40 + local42;
			if ((local380 - local436) * (local352 - local464) - (local408 - local464) * (local324 - local436) > 0) {
				arg3.aBoolean314 = local380 < 0 || local436 < 0 || local324 < 0 || local380 > arg3.anInt5105 || local436 > arg3.anInt5105 || local324 > arg3.anInt5105;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt5107 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort61 >= 0) {
							arg3.method4282(local408, local464, local352, local380, local436, local324, this.aClass66_Sub1_11.anInt4149, local40, local42, local38, local6.anInt4610, local6.anInt4608, local6.anInt4609, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort61);
						} else {
							arg3.method4283(local408, local464, local352, local380, local436, local324, Static269.method4094(local6.anInt4610, local40 << 24 | this.aClass66_Sub1_11.anInt4149), Static269.method4094(local6.anInt4608, local42 << 24 | this.aClass66_Sub1_11.anInt4149), Static269.method4094(local6.anInt4609, local38 << 24 | this.aClass66_Sub1_11.anInt4149));
						}
					} else if (local6.aShort61 >= 0) {
						arg3.method4286(local408, local464, local352, local380, local436, local324, local6.anInt4610, local6.anInt4608, local6.anInt4609, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort61);
					} else {
						arg3.method4283(local408, local464, local352, local380, local436, local324, local6.anInt4610, local6.anInt4608, local6.anInt4609);
					}
					arg3.anInt5107 = 0;
				} else {
					arg3.method4277(local408, local464, local352, local380, local436, local324, this.aClass66_Sub1_11.anInt4149);
				}
			}
			local65 = local36 + local38 + local42;
			if ((local268 - local324) * (local464 - local352) - (local296 - local352) * (local436 - local324) > 0) {
				arg3.aBoolean314 = local268 < 0 || local324 < 0 || local436 < 0 || local268 > arg3.anInt5105 || local324 > arg3.anInt5105 || local436 > arg3.anInt5105;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt5107 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort61 >= 0) {
							arg3.method4282(local296, local352, local464, local268, local324, local436, this.aClass66_Sub1_11.anInt4149, local36, local38, local42, local6.anInt4611, local6.anInt4609, local6.anInt4608, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort61);
						} else {
							arg3.method4283(local296, local352, local464, local268, local324, local436, Static269.method4094(local6.anInt4611, local36 << 24 | this.aClass66_Sub1_11.anInt4149), Static269.method4094(local6.anInt4609, local38 << 24 | this.aClass66_Sub1_11.anInt4149), Static269.method4094(local6.anInt4608, local42 << 24 | this.aClass66_Sub1_11.anInt4149));
						}
					} else if (local6.aShort61 >= 0) {
						arg3.method4286(local296, local352, local464, local268, local324, local436, local6.anInt4611, local6.anInt4609, local6.anInt4608, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort61);
					} else {
						arg3.method4283(local296, local352, local464, local268, local324, local436, local6.anInt4611, local6.anInt4609, local6.anInt4608);
					}
					arg3.anInt5107 = 0;
					return;
				}
				arg3.method4277(local296, local352, local464, local268, local324, local436, this.aClass66_Sub1_11.anInt4149);
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method6597(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class135 local4 = this.aClass66_Sub1_11.method3518(Thread.currentThread());
		@Pc(7) Class179 local7 = local4.aClass179_1;
		local7.anInt5107 = 0;
		local7.aBoolean314 = false;
		if (this.aClass167ArrayArray1 != null) {
			this.method6599(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray263, local4.anIntArray267);
		} else if (this.aClass24ArrayArray1 != null) {
			this.method6602(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray263, local4.anIntArray267);
		}
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(Lclient!ss;IIIIZ)Z")
	@Override
	public boolean method6586(@OriginalArg(0) Class6_Sub2_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIIII[[ZLclient!of;[I[I)V")
	private void method6599(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class179 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean317 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass167ArrayArray1[local22][local25] != null) {
						@Pc(50) Class167 local50 = this.aClass167ArrayArray1[local22][local25];
						if (local50.aShort61 != -1 && (local50.aByte65 & 0x2) == 0 && local50.anInt4612 == 0) {
							local68 = this.aClass66_Sub1_11.method3514(local50.aShort61);
							arg5.method4276(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static208.method3210(local68, local50.anInt4610), Static208.method3210(local68, local50.anInt4608), Static208.method3210(local68, local50.anInt4609));
							arg5.method4276(local20, local20, local20 - 4, local16, local16 + 4, local16, Static208.method3210(local68, local50.anInt4611), Static208.method3210(local68, local50.anInt4609), Static208.method3210(local68, local50.anInt4608));
						} else if (local50.anInt4612 == 0) {
							arg5.method4283(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt4610, local50.anInt4608, local50.anInt4609);
							arg5.method4283(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt4611, local50.anInt4609, local50.anInt4608);
						} else {
							local68 = local50.anInt4612;
							arg5.method4283(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static269.method4094(local68, local50.anInt4610 & 0xFF000000), Static269.method4094(local68, local50.anInt4608 & 0xFF000000), Static269.method4094(local68, local50.anInt4609 & 0xFF000000));
							arg5.method4283(local20, local20, local20 - 4, local16, local16 + 4, local16, Static269.method4094(local68, local50.anInt4611 & 0xFF000000), Static269.method4094(local68, local50.anInt4609 & 0xFF000000), Static269.method4094(local68, local50.anInt4608 & 0xFF000000));
						}
					} else if (this.aClass157ArrayArray1[local22][local25] != null) {
						@Pc(259) Class157 local259 = this.aClass157ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort50; local68++) {
							arg6[local68] = local16 + local259.aShortArray58[local68] * 4 / super.anInt8050;
							arg7[local68] = local20 - local259.aShortArray61[local68] * 4 / super.anInt8050;
						}
						for (@Pc(297) int local297 = 0; local297 < local259.aShort51; local297++) {
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
							if (local259.anIntArray307 != null && local259.anIntArray307[local297] != 0 && (local259.aShortArray60 == null || local259.aShortArray60 != null && local259.aShortArray60[local297] == -1)) {
								local359 = local259.anIntArray307[local297];
								arg5.method4283(local326, local330, local334, local314, local318, local322, Static269.method4094(local359, -(local259.anIntArray308[local302] & -16777216) - 16777216), Static269.method4094(local359, -(local259.anIntArray308[local306] & -16777216) - 16777216), Static269.method4094(local359, -(local259.anIntArray308[local310] & -16777216) - 16777216));
							} else if (local259.aShortArray60 == null || local259.aShortArray60[local297] == -1) {
								arg5.method4283(local326, local330, local334, local314, local318, local322, local259.anIntArray308[local302], local259.anIntArray308[local306], local259.anIntArray308[local310]);
							} else {
								local359 = this.aClass66_Sub1_11.method3514(local259.aShortArray60[local297]);
								arg5.method4276(local326, local330, local334, local314, local318, local322, local359, local359, local359);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean317 = true;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IILclient!of;[I[I[I)V")
	private void method6600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class179 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class24 local6 = this.aClass24ArrayArray1[arg0][arg1];
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
			@Pc(1022) Class148 local1022 = this.aClass148ArrayArray1[arg0][arg1];
			if (local1022 != null) {
				@Pc(1046) short local1046;
				if (this.anInt8053 == -1) {
					for (local362 = 0; local362 < local1022.aShort49; local362++) {
						local24 = local1022.aShortArray50[local362] + (arg0 << super.anInt8051);
						local1046 = local1022.aShortArray44[local362];
						local34 = local1022.aShortArray46[local362] + (arg1 << super.anInt8051);
						local306 = this.anInt8056 + (this.anInt8059 * local24 + this.anInt8064 * local1046 + this.anInt8052 * local34 >> 15);
						if (local306 <= this.aClass66_Sub1_11.anInt4159) {
							return;
						}
						local194 = this.anInt8058 + (this.anInt8055 * local24 + this.anInt8062 * local1046 + this.anInt8060 * local34 >> 15);
						local250 = this.anInt8063 + (this.anInt8061 * local24 + this.anInt8057 * local1046 + this.anInt8065 * local34 >> 15);
						arg3[local362] = arg2.anInt5104 + local194 * this.aClass66_Sub1_11.anInt4136 / local306;
						arg4[local362] = arg2.anInt5103 + local250 * this.aClass66_Sub1_11.anInt4160 / local306;
					}
				} else {
					for (local362 = 0; local362 < local1022.aShort49; local362++) {
						local24 = local1022.aShortArray50[local362] + (arg0 << super.anInt8051);
						local1046 = local1022.aShortArray44[local362];
						local34 = local1022.aShortArray46[local362] + (arg1 << super.anInt8051);
						local194 = this.anInt8058 + (this.anInt8055 * local24 + this.anInt8062 * local1046 + this.anInt8060 * local34 >> 15);
						local250 = this.anInt8063 + (this.anInt8061 * local24 + this.anInt8057 * local1046 + this.anInt8065 * local34 >> 15);
						arg3[local362] = arg2.anInt5104 + local194 * this.aClass66_Sub1_11.anInt4136 / this.anInt8053;
						arg4[local362] = arg2.anInt5103 + local250 * this.aClass66_Sub1_11.anInt4160 / this.anInt8053;
					}
				}
				if (local1022.aShortArray45 != null) {
					local362 = this.anIntArrayArray64[arg0][arg1];
					local222 = this.anIntArrayArray64[arg0 + 1][arg1];
					local278 = this.anIntArrayArray64[arg0][arg1 + 1];
					local334 = arg0 * super.anInt8050;
					local390 = local334 + super.anInt8050;
					local183 = arg1 * super.anInt8050;
					local239 = local183 + super.anInt8050;
					local295 = this.anInt8058 + (this.anInt8055 * local334 + this.anInt8062 * local362 + this.anInt8060 * local183 >> 15);
					local351 = this.anInt8063 + (this.anInt8061 * local334 + this.anInt8057 * local362 + this.anInt8065 * local183 >> 15);
					local211 = this.anInt8056 + (this.anInt8059 * local334 + this.anInt8064 * local362 + this.anInt8052 * local183 >> 15);
					local267 = this.anInt8058 + (this.anInt8055 * local390 + this.anInt8062 * local222 + this.anInt8060 * local183 >> 15);
					local323 = this.anInt8063 + (this.anInt8061 * local390 + this.anInt8057 * local222 + this.anInt8065 * local183 >> 15);
					local379 = this.anInt8056 + (this.anInt8059 * local390 + this.anInt8064 * local222 + this.anInt8052 * local183 >> 15);
					local72 = this.anInt8058 + (this.anInt8055 * local334 + this.anInt8062 * local278 + this.anInt8060 * local239 >> 15);
					local95 = this.anInt8063 + (this.anInt8061 * local334 + this.anInt8057 * local278 + this.anInt8065 * local239 >> 15);
					local118 = this.anInt8056 + (this.anInt8059 * local334 + this.anInt8064 * local278 + this.anInt8052 * local239 >> 15);
					for (local141 = 0; local141 < local1022.aShort48; local141++) {
						@Pc(1491) short local1491 = local1022.aShortArray43[local141];
						@Pc(1496) short local1496 = local1022.aShortArray49[local141];
						@Pc(1501) short local1501 = local1022.aShortArray48[local141];
						local427 = arg3[local1491];
						@Pc(1509) int local1509 = arg3[local1496];
						@Pc(1513) int local1513 = arg3[local1501];
						@Pc(1517) int local1517 = arg4[local1491];
						@Pc(1521) int local1521 = arg4[local1496];
						@Pc(1525) int local1525 = arg4[local1501];
						if ((local427 - local1509) * (local1525 - local1521) - (local1517 - local1521) * (local1513 - local1509) > 0) {
							arg2.aBoolean314 = local427 < 0 || local1509 < 0 || local1513 < 0 || local427 > arg2.anInt5105 || local1509 > arg2.anInt5105 || local1513 > arg2.anInt5105;
							@Pc(1569) short local1569 = local1022.aShortArray45[local141];
							if (local1569 == -1) {
								@Pc(1624) int local1624 = local1022.anIntArray290[local141];
								if (local1624 != -1) {
									arg2.method4276(local1517, local1521, local1525, local427, local1509, local1513, Static208.method3210(local1624, local1022.aShortArray47[local1491]), Static208.method3210(local1624, local1022.aShortArray47[local1496]), Static208.method3210(local1624, local1022.aShortArray47[local1501]));
								}
							} else {
								if (this.method6603(this.aClass66_Sub1_11.anInterface8_5.method5566(local1569).aByte72)) {
									arg2.anInt5107 = 100;
								}
								arg2.method4286(local1517, local1521, local1525, local427, local1509, local1513, local1022.aShortArray47[local1491], local1022.aShortArray47[local1496], local1022.aShortArray47[local1501], local295, local267, local72, local351, local323, local95, local211, local379, local118, local1569);
								arg2.anInt5107 = 0;
							}
						}
					}
					return;
				}
				for (local362 = 0; local362 < local1022.aShort48; local362++) {
					@Pc(1670) short local1670 = local1022.aShortArray43[local362];
					@Pc(1675) short local1675 = local1022.aShortArray49[local362];
					@Pc(1680) short local1680 = local1022.aShortArray48[local362];
					local390 = arg3[local1670];
					local183 = arg3[local1675];
					local239 = arg3[local1680];
					local295 = arg4[local1670];
					local351 = arg4[local1675];
					local211 = arg4[local1680];
					if ((local390 - local183) * (local211 - local351) - (local295 - local351) * (local239 - local183) > 0) {
						local267 = local1022.anIntArray290[local362];
						if (local267 != -1) {
							arg2.aBoolean314 = local390 < 0 || local183 < 0 || local239 < 0 || local390 > arg2.anInt5105 || local183 > arg2.anInt5105 || local239 > arg2.anInt5105;
							arg2.method4276(local295, local351, local211, local390, local183, local239, Static208.method3210(local267, local1022.aShortArray47[local1670]), Static208.method3210(local267, local1022.aShortArray47[local1675]), Static208.method3210(local267, local1022.aShortArray47[local1680]));
						}
					}
				}
			}
		} else if ((local6.aByte5 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt8050;
			local24 = local19 + super.anInt8050;
			@Pc(29) int local29 = arg1 * super.anInt8050;
			local34 = local29 + super.anInt8050;
			@Pc(46) int local46;
			@Pc(55) int local55;
			@Pc(166) int local166;
			if ((local6.aByte5 & 0x1) == 0) {
				local46 = this.anIntArrayArray64[arg0][arg1];
				local55 = this.anIntArrayArray64[arg0 + 1][arg1];
				local166 = this.anIntArrayArray64[arg0 + 1][arg1 + 1];
				local427 = this.anIntArrayArray64[arg0][arg1 + 1];
				if (this.anInt8053 == -1) {
					local72 = this.anInt8056 + (this.anInt8059 * local19 + this.anInt8064 * local46 + this.anInt8052 * local29 >> 15);
					if (local72 <= this.aClass66_Sub1_11.anInt4159) {
						return;
					}
					local95 = this.anInt8056 + (this.anInt8059 * local24 + this.anInt8064 * local55 + this.anInt8052 * local29 >> 15);
					if (local95 <= this.aClass66_Sub1_11.anInt4159) {
						return;
					}
					local118 = this.anInt8056 + (this.anInt8059 * local24 + this.anInt8064 * local166 + this.anInt8052 * local34 >> 15);
					if (local118 <= this.aClass66_Sub1_11.anInt4159) {
						return;
					}
					local141 = this.anInt8056 + (this.anInt8059 * local19 + this.anInt8064 * local427 + this.anInt8052 * local34 >> 15);
					if (local141 <= this.aClass66_Sub1_11.anInt4159) {
						return;
					}
				} else {
					local141 = this.anInt8053;
					local118 = this.anInt8053;
					local95 = this.anInt8053;
					local72 = this.anInt8053;
				}
				local183 = this.anInt8058 + (this.anInt8055 * local19 + this.anInt8062 * local46 + this.anInt8060 * local29 >> 15);
				local194 = arg2.anInt5104 + local183 * this.aClass66_Sub1_11.anInt4136 / local72;
				local211 = this.anInt8063 + (this.anInt8061 * local19 + this.anInt8057 * local46 + this.anInt8065 * local29 >> 15);
				local222 = arg2.anInt5103 + local211 * this.aClass66_Sub1_11.anInt4160 / local72;
				local239 = this.anInt8058 + (this.anInt8055 * local24 + this.anInt8062 * local55 + this.anInt8060 * local29 >> 15);
				local250 = arg2.anInt5104 + local239 * this.aClass66_Sub1_11.anInt4136 / local95;
				local267 = this.anInt8063 + (this.anInt8061 * local24 + this.anInt8057 * local55 + this.anInt8065 * local29 >> 15);
				local278 = arg2.anInt5103 + local267 * this.aClass66_Sub1_11.anInt4160 / local95;
				local295 = this.anInt8058 + (this.anInt8055 * local24 + this.anInt8062 * local166 + this.anInt8060 * local34 >> 15);
				local306 = arg2.anInt5104 + local295 * this.aClass66_Sub1_11.anInt4136 / local118;
				local323 = this.anInt8063 + (this.anInt8061 * local24 + this.anInt8057 * local166 + this.anInt8065 * local34 >> 15);
				local334 = arg2.anInt5103 + local323 * this.aClass66_Sub1_11.anInt4160 / local118;
				local351 = this.anInt8058 + (this.anInt8055 * local19 + this.anInt8062 * local427 + this.anInt8060 * local34 >> 15);
				local362 = arg2.anInt5104 + local351 * this.aClass66_Sub1_11.anInt4136 / local141;
				local379 = this.anInt8063 + (this.anInt8061 * local19 + this.anInt8057 * local427 + this.anInt8065 * local34 >> 15);
				local390 = arg2.anInt5103 + local379 * this.aClass66_Sub1_11.anInt4160 / local141;
			} else {
				local46 = this.anIntArrayArray64[arg0][arg1];
				if (this.anInt8053 == -1) {
					local55 = this.anInt8064 * local46;
					local72 = this.anInt8056 + (this.anInt8059 * local19 + local55 + this.anInt8052 * local29 >> 15);
					if (local72 <= this.aClass66_Sub1_11.anInt4159) {
						return;
					}
					local95 = this.anInt8056 + (this.anInt8059 * local24 + local55 + this.anInt8052 * local29 >> 15);
					if (local95 <= this.aClass66_Sub1_11.anInt4159) {
						return;
					}
					local118 = this.anInt8056 + (this.anInt8059 * local24 + local55 + this.anInt8052 * local34 >> 15);
					if (local118 <= this.aClass66_Sub1_11.anInt4159) {
						return;
					}
					local141 = this.anInt8056 + (this.anInt8059 * local19 + local55 + this.anInt8052 * local34 >> 15);
					if (local141 <= this.aClass66_Sub1_11.anInt4159) {
						return;
					}
				} else {
					local141 = this.anInt8053;
					local118 = this.anInt8053;
					local95 = this.anInt8053;
					local72 = this.anInt8053;
				}
				local55 = this.anInt8062 * local46;
				local166 = this.anInt8057 * local46;
				local183 = this.anInt8058 + (this.anInt8055 * local19 + local55 + this.anInt8060 * local29 >> 15);
				local194 = arg2.anInt5104 + local183 * this.aClass66_Sub1_11.anInt4136 / local72;
				local211 = this.anInt8063 + (this.anInt8061 * local19 + local166 + this.anInt8065 * local29 >> 15);
				local222 = arg2.anInt5103 + local211 * this.aClass66_Sub1_11.anInt4160 / local72;
				local239 = this.anInt8058 + (this.anInt8055 * local24 + local55 + this.anInt8060 * local29 >> 15);
				local250 = arg2.anInt5104 + local239 * this.aClass66_Sub1_11.anInt4136 / local95;
				local267 = this.anInt8063 + (this.anInt8061 * local24 + local166 + this.anInt8065 * local29 >> 15);
				local278 = arg2.anInt5103 + local267 * this.aClass66_Sub1_11.anInt4160 / local95;
				local295 = this.anInt8058 + (this.anInt8055 * local24 + local55 + this.anInt8060 * local34 >> 15);
				local306 = arg2.anInt5104 + local295 * this.aClass66_Sub1_11.anInt4136 / local118;
				local323 = this.anInt8063 + (this.anInt8061 * local24 + local166 + this.anInt8065 * local34 >> 15);
				local334 = arg2.anInt5103 + local323 * this.aClass66_Sub1_11.anInt4160 / local118;
				local351 = this.anInt8058 + (this.anInt8055 * local19 + local55 + this.anInt8060 * local34 >> 15);
				local362 = arg2.anInt5104 + local351 * this.aClass66_Sub1_11.anInt4136 / local141;
				local379 = this.anInt8063 + (this.anInt8061 * local19 + local166 + this.anInt8065 * local34 >> 15);
				local390 = arg2.anInt5103 + local379 * this.aClass66_Sub1_11.anInt4160 / local141;
			}
			if ((local306 - local362) * (local278 - local390) - (local334 - local390) * (local250 - local362) > 0) {
				arg2.aBoolean314 = local306 < 0 || local362 < 0 || local250 < 0 || local306 > arg2.anInt5105 || local362 > arg2.anInt5105 || local250 > arg2.anInt5105;
				if (local6.aShort9 >= 0) {
					if (this.method6603(this.aClass66_Sub1_11.anInterface8_5.method5566(local6.aShort9).aByte72)) {
						arg2.anInt5107 = 100;
					}
					arg2.method4286(local334, local390, local278, local306, local362, local250, local6.aShort6 & 0xFFFF, local6.aShort5 & 0xFFFF, local6.aShort7 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort9);
					arg2.anInt5107 = 0;
				} else {
					arg2.method4276(local334, local390, local278, local306, local362, local250, local6.aShort6 & 0xFFFF, local6.aShort5 & 0xFFFF, local6.aShort7 & 0xFFFF);
				}
			}
			if ((local194 - local250) * (local390 - local278) - (local222 - local278) * (local362 - local250) > 0) {
				arg2.aBoolean314 = local194 < 0 || local250 < 0 || local362 < 0 || local194 > arg2.anInt5105 || local250 > arg2.anInt5105 || local362 > arg2.anInt5105;
				if (local6.aShort9 >= 0) {
					if (this.method6603(this.aClass66_Sub1_11.anInterface8_5.method5566(local6.aShort9).aByte72)) {
						arg2.anInt5107 = 100;
					}
					arg2.method4286(local222, local278, local390, local194, local250, local362, local6.aShort8 & 0xFFFF, local6.aShort7 & 0xFFFF, local6.aShort5 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort9);
					arg2.anInt5107 = 0;
					return;
				}
				arg2.method4276(local222, local278, local390, local194, local250, local362, local6.aShort8 & 0xFFFF, local6.aShort7 & 0xFFFF, local6.aShort5 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)V")
	@Override
	public void method6584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class135 local4 = this.aClass66_Sub1_11.method3518(Thread.currentThread());
		local4.aClass179_1.anInt5107 = 0;
		if (this.aClass167ArrayArray1 != null) {
			this.method6598(arg0, arg1, this.aClass66_Sub1_11.aBoolean277, local4.aClass179_1, local4.anIntArray263, local4.anIntArray267, local4.anIntArray266);
		} else if (this.aClass24ArrayArray1 != null) {
			this.method6600(arg0, arg1, local4.aClass179_1, local4.anIntArray263, local4.anIntArray267, local4.anIntArray266);
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!ss;IIIIZ)V")
	@Override
	public void method6583(@OriginalArg(0) Class6_Sub2_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(III)V")
	@Override
	public void method6593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray26[arg0][arg1] < arg2) {
			this.aByteArrayArray26[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(II)I")
	@Override
	public int method6590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> super.anInt8051;
		@Pc(9) int local9 = arg1 >> super.anInt8051;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt8047 - 1 || local9 > super.anInt8049 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & super.anInt8050 - 1;
		@Pc(41) int local41 = arg1 & super.anInt8050 - 1;
		@Pc(67) int local67 = this.anIntArrayArray64[local4][local9] * (super.anInt8050 - local34) + this.anIntArrayArray64[local4 + 1][local9] * local34 >> super.anInt8051;
		@Pc(97) int local97 = this.anIntArrayArray64[local4][local9 + 1] * (super.anInt8050 - local34) + this.anIntArrayArray64[local4 + 1][local9 + 1] * local34 >> super.anInt8051;
		return local67 * (super.anInt8050 - local41) + local97 * local41 >> super.anInt8051;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method6595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class5_Sub1 local3 = this.aClass66_Sub1_11.aClass5_Sub1_2;
		this.anInt8053 = -1;
		this.anInt8055 = local3.anInt142;
		this.anInt8062 = local3.anInt149;
		this.anInt8060 = local3.anInt148;
		this.anInt8058 = local3.anInt143;
		this.anInt8061 = local3.anInt147;
		this.anInt8057 = local3.anInt141;
		this.anInt8065 = local3.anInt139;
		this.anInt8063 = local3.anInt140;
		this.anInt8059 = local3.anInt146;
		this.anInt8064 = local3.anInt138;
		this.anInt8052 = local3.anInt144;
		this.anInt8056 = local3.anInt145;
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(Lclient!ss;IIIIZ)V")
	@Override
	public void method6588(@OriginalArg(0) Class6_Sub2_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!dq;[I)V")
	@Override
	public void method6585(@OriginalArg(0) Class6_Sub11 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(II)I")
	@Override
	public int method6594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray64[arg0][arg1];
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method6596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass24ArrayArray1 == null) {
			this.aClass24ArrayArray1 = new Class24[super.anInt8047][super.anInt8049];
			this.aClass148ArrayArray1 = new Class148[super.anInt8047][super.anInt8049];
		} else if (this.aClass167ArrayArray1 != null) {
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
				if (local64 != 0 && local64 != super.anInt8050 || local70 != 0 && local70 != super.anInt8050) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class148 local95 = new Class148();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort49 = local99;
			local95.aShortArray47 = new short[local99];
			local95.aShortArray50 = new short[local99];
			local95.aShortArray44 = new short[local99];
			local95.aShortArray46 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray47[local124] = (short) (this.aByteArrayArray27[arg0][arg1] - this.aByteArrayArray26[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt8050) {
					local95.aShortArray47[local124] = (short) (this.aByteArrayArray27[arg0][arg1 + 1] - this.aByteArrayArray26[arg0][arg1 + 1]);
				} else if (local129 == super.anInt8050 && local133 == super.anInt8050) {
					local95.aShortArray47[local124] = (short) (this.aByteArrayArray27[arg0 + 1][arg1 + 1] - this.aByteArrayArray26[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt8050 && local133 == 0) {
					local95.aShortArray47[local124] = (short) (this.aByteArrayArray27[arg0 + 1][arg1] - this.aByteArrayArray26[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray27[arg0][arg1] - this.aByteArrayArray26[arg0][arg1]) * (super.anInt8050 - local129) + (this.aByteArrayArray27[arg0 + 1][arg1] - this.aByteArrayArray26[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray27[arg0][arg1 + 1] - this.aByteArrayArray26[arg0][arg1 + 1]) * (super.anInt8050 - local129) + (this.aByteArrayArray27[arg0 + 1][arg1 + 1] - this.aByteArrayArray26[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray47[local124] = (short) (local288 * (super.anInt8050 - local133) + local335 * local133 >> super.anInt8051 * 2);
				}
				local288 = (arg0 << super.anInt8051) + local129;
				local335 = (arg1 << super.anInt8051) + local133;
				local95.aShortArray50[local124] = (short) local129;
				local95.aShortArray46[local124] = (short) local133;
				local95.aShortArray44[local124] = (short) (this.method6590(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray47[local124] < 2) {
					local95.aShortArray47[local124] = 2;
				}
			}
			@Pc(415) boolean local415 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass66_Sub1_11.anInterface8_5.method5566(arg11[local288]).aBoolean330) {
					local415 = true;
				}
			}
			local95.anIntArray290 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray291 = new int[local133];
			}
			local95.aShortArray43 = new short[local133];
			local95.aShortArray49 = new short[local133];
			local95.aShortArray48 = new short[local133];
			if (local415) {
				local95.aShortArray45 = new short[local133];
				local95.aShortArray51 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray290[local95.aShort48] = Static231.method6534(arg9[local335]);
					} else {
						local95.anIntArray290[local95.aShort48] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray291[local95.aShort48] = -1;
						} else {
							local95.anIntArray291[local95.aShort48] = Static231.method6534(arg10[local335]);
						}
					}
					local95.aShortArray43[local95.aShort48] = (short) arg6[local335];
					local95.aShortArray49[local95.aShort48] = (short) arg7[local335];
					local95.aShortArray48[local95.aShort48] = (short) arg8[local335];
					if (local415) {
						if (arg11[local335] == -1 || this.aClass66_Sub1_11.anInterface8_5.method5566(arg11[local335]).aBoolean330) {
							local95.aShortArray45[local95.aShort48] = -1;
						} else {
							local95.aShortArray45[local95.aShort48] = (short) arg11[local335];
							local95.aShortArray51[local95.aShort48] = (short) arg12[local335];
						}
					}
					local95.aShort48++;
				}
			}
			this.aClass148ArrayArray1[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(644) Class24 local644 = new Class24();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local644.anInt814 = Static208.method3210(Static231.method6534(arg10[0]), this.aByteArrayArray27[arg0][arg1] - this.aByteArrayArray26[arg0][arg1]);
				if (local64 == -1) {
					local644.aByte5 = (byte) (local644.aByte5 | 0x2);
				}
			}
			if (this.anIntArrayArray64[arg0][arg1] == this.anIntArrayArray64[arg0 + 1][arg1] && this.anIntArrayArray64[arg0][arg1] == this.anIntArrayArray64[arg0 + 1][arg1 + 1] && this.anIntArrayArray64[arg0][arg1] == this.anIntArrayArray64[arg0][arg1 + 1]) {
				local644.aByte5 = (byte) (local644.aByte5 | 0x1);
			}
			if (local70 == -1 || (local644.aByte5 & 0x2) != 0 || this.aClass66_Sub1_11.anInterface8_5.method5566(local70).aBoolean330) {
				@Pc(845) short local845 = Static231.method6534(local64);
				local644.aShort8 = (short) Static208.method3210(local845, this.aByteArrayArray27[arg0][arg1] - this.aByteArrayArray26[arg0][arg1]);
				local644.aShort7 = (short) Static208.method3210(local845, this.aByteArrayArray27[arg0 + 1][arg1] - this.aByteArrayArray26[arg0 + 1][arg1]);
				local644.aShort6 = (short) Static208.method3210(local845, this.aByteArrayArray27[arg0 + 1][arg1 + 1] - this.aByteArrayArray26[arg0 + 1][arg1 + 1]);
				local644.aShort5 = (short) Static208.method3210(local845, this.aByteArrayArray27[arg0][arg1 + 1] - this.aByteArrayArray26[arg0][arg1 + 1]);
				local644.aShort9 = -1;
			} else {
				local644.aShort8 = (short) (this.aByteArrayArray27[arg0][arg1] - this.aByteArrayArray26[arg0][arg1]);
				local644.aShort7 = (short) (this.aByteArrayArray27[arg0 + 1][arg1] - this.aByteArrayArray26[arg0 + 1][arg1]);
				local644.aShort6 = (short) (this.aByteArrayArray27[arg0 + 1][arg1 + 1] - this.aByteArrayArray26[arg0 + 1][arg1 + 1]);
				local644.aShort5 = (short) (this.aByteArrayArray27[arg0][arg1 + 1] - this.aByteArrayArray26[arg0][arg1 + 1]);
				local644.aShort9 = (short) local70;
			}
			this.aClass24ArrayArray1[arg0][arg1] = local644;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IILclient!ss;)Lclient!ss;")
	@Override
	public Class6_Sub2_Sub10 method6591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub10 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(IIIIIII[[ZLclient!of;[I[I)V")
	private void method6602(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class179 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean317 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass24ArrayArray1[local22][local25] != null) {
						@Pc(50) Class24 local50 = this.aClass24ArrayArray1[local22][local25];
						if (local50.aShort9 != -1 && (local50.aByte5 & 0x2) == 0 && local50.anInt814 == -1) {
							local69 = this.aClass66_Sub1_11.method3514(local50.aShort9);
							arg5.method4276(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static208.method3210(local69, local50.aShort6 & 0xFFFF), Static208.method3210(local69, local50.aShort5 & 0xFFFF), Static208.method3210(local69, local50.aShort7 & 0xFFFF));
							arg5.method4276(local20, local20, local20 - 4, local16, local16 + 4, local16, Static208.method3210(local69, local50.aShort8 & 0xFFFF), Static208.method3210(local69, local50.aShort7 & 0xFFFF), Static208.method3210(local69, local50.aShort5 & 0xFFFF));
						} else if (local50.anInt814 == -1) {
							arg5.method4276(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort6 & 0xFFFF, local50.aShort5 & 0xFFFF, local50.aShort7 & 0xFFFF);
							arg5.method4276(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort8 & 0xFFFF, local50.aShort7 & 0xFFFF, local50.aShort5 & 0xFFFF);
						} else {
							local69 = local50.anInt814;
							arg5.method4276(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method4276(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass148ArrayArray1[local22][local25] != null) {
						@Pc(249) Class148 local249 = this.aClass148ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort49; local69++) {
							arg6[local69] = local16 + local249.aShortArray50[local69] * 4 / super.anInt8050;
							arg7[local69] = local20 - local249.aShortArray46[local69] * 4 / super.anInt8050;
						}
						for (@Pc(287) int local287 = 0; local287 < local249.aShort48; local287++) {
							@Pc(293) short local293 = local249.aShortArray43[local287];
							@Pc(298) short local298 = local249.aShortArray49[local287];
							@Pc(303) short local303 = local249.aShortArray48[local287];
							@Pc(307) int local307 = arg6[local293];
							@Pc(311) int local311 = arg6[local298];
							@Pc(315) int local315 = arg6[local303];
							@Pc(319) int local319 = arg7[local293];
							@Pc(323) int local323 = arg7[local298];
							@Pc(327) int local327 = arg7[local303];
							@Pc(341) int local341;
							if (local249.anIntArray291 != null && local249.anIntArray291[local287] != -1) {
								local341 = local249.anIntArray291[local287];
								arg5.method4276(local319, local323, local327, local307, local311, local315, Static208.method3210(local341, local249.aShortArray47[local293]), Static208.method3210(local341, local249.aShortArray47[local298]), Static208.method3210(local341, local249.aShortArray47[local303]));
							} else if (local249.aShortArray45 == null || local249.aShortArray45[local287] == -1) {
								local341 = local249.anIntArray290[local287];
								arg5.method4276(local319, local323, local327, local307, local311, local315, Static208.method3210(local341, local249.aShortArray47[local293]), Static208.method3210(local341, local249.aShortArray47[local298]), Static208.method3210(local341, local249.aShortArray47[local303]));
							} else {
								local341 = this.aClass66_Sub1_11.method3514(local249.aShortArray45[local287]);
								arg5.method4276(local319, local323, local327, local307, local311, local315, Static208.method3210(local341, local249.aShortArray47[local293]), Static208.method3210(local341, local249.aShortArray47[local298]), Static208.method3210(local341, local249.aShortArray47[local303]));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean317 = true;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)Z")
	private boolean method6603(@OriginalArg(0) int arg0) {
		if ((this.anInt8054 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}
}
