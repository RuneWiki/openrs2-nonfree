import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class65_Sub1 extends Class65 {

	@OriginalMember(owner = "client!es", name = "j", descriptor = "I")
	private int anInt1973;

	@OriginalMember(owner = "client!es", name = "k", descriptor = "I")
	private int anInt1974;

	@OriginalMember(owner = "client!es", name = "l", descriptor = "I")
	private int anInt1975;

	@OriginalMember(owner = "client!es", name = "m", descriptor = "I")
	private int anInt1976;

	@OriginalMember(owner = "client!es", name = "n", descriptor = "[[Lclient!ui;")
	private Class238[][] aClass238ArrayArray1;

	@OriginalMember(owner = "client!es", name = "o", descriptor = "I")
	private int anInt1977;

	@OriginalMember(owner = "client!es", name = "p", descriptor = "[[Lclient!tc;")
	private Class224[][] aClass224ArrayArray1;

	@OriginalMember(owner = "client!es", name = "q", descriptor = "[[Lclient!cl;")
	private Class39[][] aClass39ArrayArray1;

	@OriginalMember(owner = "client!es", name = "r", descriptor = "I")
	private int anInt1978;

	@OriginalMember(owner = "client!es", name = "s", descriptor = "I")
	private int anInt1979;

	@OriginalMember(owner = "client!es", name = "u", descriptor = "[[Lclient!pi;")
	private Class181[][] aClass181ArrayArray1;

	@OriginalMember(owner = "client!es", name = "v", descriptor = "I")
	private int anInt1981;

	@OriginalMember(owner = "client!es", name = "y", descriptor = "I")
	private int anInt1982;

	@OriginalMember(owner = "client!es", name = "z", descriptor = "I")
	private int anInt1983;

	@OriginalMember(owner = "client!es", name = "B", descriptor = "I")
	private int anInt1984;

	@OriginalMember(owner = "client!es", name = "D", descriptor = "I")
	private int anInt1986;

	@OriginalMember(owner = "client!es", name = "C", descriptor = "I")
	private int anInt1985 = -1;

	@OriginalMember(owner = "client!es", name = "i", descriptor = "Lclient!bc;")
	private final Class19_Sub1 aClass19_Sub1_5;

	@OriginalMember(owner = "client!es", name = "t", descriptor = "I")
	private final int anInt1980;

	@OriginalMember(owner = "client!es", name = "x", descriptor = "[[I")
	public final int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!es", name = "E", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!es", name = "w", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!bc;IIII[[I[[II)V")
	public Class65_Sub1(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass19_Sub1_5 = arg0;
		this.anInt1980 = arg2;
		this.anIntArrayArray22 = arg5;
		this.aByteArrayArray6 = new byte[arg3 + 1][arg4 + 1];
		@Pc(31) int local31 = this.aClass19_Sub1_5.anInt404 >> 9;
		for (@Pc(33) int local33 = 1; local33 < arg4; local33++) {
			for (@Pc(36) int local36 = 1; local36 < arg3; local36++) {
				@Pc(55) int local55 = arg6[local36 + 1][local33] - arg6[local36 - 1][local33];
				@Pc(71) int local71 = arg6[local36][local33 + 1] - arg6[local36][local33 - 1];
				@Pc(86) int local86 = (int) Math.sqrt((double) (local55 * local55 + arg7 * 512 + local71 * local71));
				@Pc(92) int local92 = (local55 << 8) / local86;
				@Pc(98) int local98 = arg7 * -512 / local86;
				@Pc(104) int local104 = (local71 << 8) / local86;
				@Pc(126) int local126 = local31 + (this.aClass19_Sub1_5.anInt401 * local92 + this.aClass19_Sub1_5.anInt412 * local98 + this.aClass19_Sub1_5.anInt419 * local104 >> 17);
				local126 >>= 0x1;
				if (local126 < 2) {
					local126 = 2;
				} else if (local126 > 126) {
					local126 = 126;
				}
				this.aByteArrayArray6[local36][local33] = (byte) local126;
			}
		}
		this.aByteArrayArray5 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(Lclient!ba;IIIIZ)V")
	@Override
	public void b(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!es", name = "p", descriptor = "(Lclient!ba;IIIIZ)V")
	@Override
	public void p(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!es", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass181ArrayArray1 == null) {
			this.aClass181ArrayArray1 = new Class181[super.anInt5262][super.anInt5258];
			this.aClass224ArrayArray1 = new Class224[super.anInt5262][super.anInt5258];
		} else if (this.aClass238ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static335.anIntArray423[Static82.method1470(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static335.anIntArray423[Static82.method1470(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == super.anInt5261 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt5261 && arg4[local116] == super.anInt5261) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt5261) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt5261 && arg2[local244] != arg2[0] - super.anInt5261) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt5261 && arg4[local244] != arg4[0] - super.anInt5261) {
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
			@Pc(334) Class181 local334 = new Class181();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt5377 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte57 = (byte) (local334.aByte57 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray22[arg0][arg1] == this.anIntArrayArray22[arg0 + 1][arg1] && this.anIntArrayArray22[arg0][arg1] == this.anIntArrayArray22[arg0 + 1][arg1 + 1] && this.anIntArrayArray22[arg0][arg1] == this.anIntArrayArray22[arg0][arg1 + 1]) {
				local334.aByte57 = (byte) (local334.aByte57 | 0x1);
			}
			if (local342 == -1 || (local334.aByte57 & 0x2) != 0 || this.aClass19_Sub1_5.anInterface7_6.method2396(local342).aBoolean639) {
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
				local334.anInt5375 = Static342.method4632(arg10, local527, Static457.method1721(arg6[local104] >> 8, this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]));
				if (local334.anInt5377 != 0) {
					local334.anInt5375 |= this.aByteArrayArray5[arg0][arg1] + 255 - this.aByteArrayArray6[arg0][arg1] << 25;
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
				local334.anInt5376 = Static342.method4632(arg10, local527, Static457.method1721(arg6[local106] >> 8, this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1]));
				if (local334.anInt5377 != 0) {
					local334.anInt5376 |= this.aByteArrayArray5[arg0 + 1][arg1] + 255 - this.aByteArrayArray6[arg0 + 1][arg1] << 25;
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
				local334.anInt5374 = Static342.method4632(arg10, local527, Static457.method1721(arg6[local108] >> 8, this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1]));
				if (local334.anInt5377 != 0) {
					local334.anInt5374 |= this.aByteArrayArray5[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray6[arg0 + 1][arg1 + 1] << 25;
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
				local334.anInt5378 = Static342.method4632(arg10, local527, Static457.method1721(arg6[local110] >> 8, this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1]));
				if (local334.anInt5377 != 0) {
					local334.anInt5378 |= this.aByteArrayArray5[arg0][arg1 + 1] + 255 - this.aByteArrayArray6[arg0][arg1 + 1] << 25;
				}
				local334.aShort69 = -1;
			} else {
				local334.anInt5375 = this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray5[arg0][arg1];
				local334.anInt5376 = this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1];
				local334.anInt5374 = this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1];
				local334.anInt5378 = this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1];
				local334.aShort69 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort71 = (short) arg5[local108];
				local334.aShort72 = (short) arg5[local110];
				local334.aShort73 = (short) arg5[local106];
				local334.aShort70 = (short) arg5[local104];
			}
			this.aClass181ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class224 local888 = new Class224();
		local888.aShort87 = (short) arg2.length;
		local888.aShort86 = (short) (arg2.length / 3);
		local888.aShortArray230 = new short[local888.aShort87];
		local888.aShortArray229 = new short[local888.aShort87];
		local888.aShortArray225 = new short[local888.aShort87];
		local888.anIntArray488 = new int[local888.aShort87];
		if (arg5 != null) {
			local888.aShortArray226 = new short[local888.aShort87];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort87; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray5[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt5261) {
				local958 = this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1];
			} else if (local342 == super.anInt5261 && local527 == super.anInt5261) {
				local958 = this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt5261 && local527 == 0) {
				local958 = this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]) * (super.anInt5261 - local342) + (this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1]) * (super.anInt5261 - local342) + (this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt5261 - local527) + local1126 * local527 >> super.anInt5256 * 2;
			}
			local1079 = (arg0 << super.anInt5256) + local342;
			local1126 = (arg1 << super.anInt5256) + local527;
			local888.aShortArray230[local244] = (short) local342;
			local888.aShortArray225[local244] = (short) local527;
			local888.aShortArray229[local244] = (short) (this.a(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass19_Sub1_5.anInterface7_6.method2396(arg8[local244]).aBoolean639) {
				local888.anIntArray488[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray226[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray488[local244] = Static342.method4632(arg10, local1226, Static457.method1721(arg6[local244] >> 8, local958));
				if (arg7 != null) {
					local888.anIntArray488[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray488[local244] = 0;
			} else {
				local888.anIntArray488[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort86; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass19_Sub1_5.anInterface7_6.method2396(arg8[local527 * 3]).aBoolean639) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray487 = new int[local888.aShort86];
		}
		if (local1296) {
			local888.aShortArray227 = new short[local888.aShort86];
			local888.aShortArray228 = new short[local888.aShort86];
		}
		for (local958 = 0; local958 < local888.aShort86; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray487[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass19_Sub1_5.anInterface7_6.method2396(local1384).aBoolean639) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass19_Sub1_5.anInterface7_6.method2396(local1384).aBoolean639) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass19_Sub1_5.anInterface7_6.method2396(local1384).aBoolean639) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray227[local958] = (short) local1384;
					local888.aShortArray228[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass19_Sub1_5.anInterface7_6.method2396(local1384).aBoolean639) {
							local888.anIntArray488[local1079] = Static335.anIntArray423[Static82.method1470(this.aClass19_Sub1_5.anInterface7_6.method2396(local1384).aShort99 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass19_Sub1_5.anInterface7_6.method2396(local1384).aBoolean639) {
							local888.anIntArray488[local1126] = Static335.anIntArray423[Static82.method1470(this.aClass19_Sub1_5.anInterface7_6.method2396(local1384).aShort99 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass19_Sub1_5.anInterface7_6.method2396(local1384).aBoolean639) {
							local888.anIntArray488[local1226] = Static335.anIntArray423[Static82.method1470(this.aClass19_Sub1_5.anInterface7_6.method2396(local1384).aShort99 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray227[local958] = -1;
				}
			}
		}
		this.aClass224ArrayArray1[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IIIIIII[[ZLclient!qv;[I[I)V")
	private void method1720(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class201 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean518 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass181ArrayArray1[local22][local25] != null) {
						@Pc(50) Class181 local50 = this.aClass181ArrayArray1[local22][local25];
						if (local50.aShort69 != -1 && (local50.aByte57 & 0x2) == 0 && local50.anInt5377 == 0) {
							local68 = this.aClass19_Sub1_5.method484(local50.aShort69);
							arg5.method4547(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static48.method791(local68, local50.anInt5374), Static48.method791(local68, local50.anInt5378), Static48.method791(local68, local50.anInt5376));
							arg5.method4547(local20, local20, local20 - 4, local16, local16 + 4, local16, Static48.method791(local68, local50.anInt5375), Static48.method791(local68, local50.anInt5376), Static48.method791(local68, local50.anInt5378));
						} else if (local50.anInt5377 == 0) {
							arg5.method4548(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt5374, local50.anInt5378, local50.anInt5376);
							arg5.method4548(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt5375, local50.anInt5376, local50.anInt5378);
						} else {
							local68 = local50.anInt5377;
							arg5.method4548(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static177.method2539(local68, local50.anInt5374 & 0xFF000000), Static177.method2539(local68, local50.anInt5378 & 0xFF000000), Static177.method2539(local68, local50.anInt5376 & 0xFF000000));
							arg5.method4548(local20, local20, local20 - 4, local16, local16 + 4, local16, Static177.method2539(local68, local50.anInt5375 & 0xFF000000), Static177.method2539(local68, local50.anInt5376 & 0xFF000000), Static177.method2539(local68, local50.anInt5378 & 0xFF000000));
						}
					} else if (this.aClass224ArrayArray1[local22][local25] != null) {
						@Pc(259) Class224 local259 = this.aClass224ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort87; local68++) {
							arg6[local68] = local16 + local259.aShortArray230[local68] * 4 / super.anInt5261;
							arg7[local68] = local20 - local259.aShortArray225[local68] * 4 / super.anInt5261;
						}
						for (@Pc(297) int local297 = 0; local297 < local259.aShort86; local297++) {
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
							if (local259.anIntArray487 != null && local259.anIntArray487[local297] != 0 && (local259.aShortArray227 == null || local259.aShortArray227 != null && local259.aShortArray227[local297] == -1)) {
								local359 = local259.anIntArray487[local297];
								arg5.method4548(local326, local330, local334, local314, local318, local322, Static177.method2539(local359, -(local259.anIntArray488[local302] & -16777216) - 16777216), Static177.method2539(local359, -(local259.anIntArray488[local306] & -16777216) - 16777216), Static177.method2539(local359, -(local259.anIntArray488[local310] & -16777216) - 16777216));
							} else if (local259.aShortArray227 == null || local259.aShortArray227[local297] == -1) {
								arg5.method4548(local326, local330, local334, local314, local318, local322, local259.anIntArray488[local302], local259.anIntArray488[local306], local259.anIntArray488[local310]);
							} else {
								local359 = this.aClass19_Sub1_5.method484(local259.aShortArray227[local297]);
								arg5.method4547(local326, local330, local334, local314, local318, local322, local359, local359, local359);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean518 = true;
	}

	@OriginalMember(owner = "client!es", name = "l", descriptor = "(II)I")
	@Override
	public int l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray22[arg0][arg1];
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method4023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass238ArrayArray1 == null) {
			this.aClass238ArrayArray1 = new Class238[super.anInt5262][super.anInt5258];
			this.aClass39ArrayArray1 = new Class39[super.anInt5262][super.anInt5258];
		} else if (this.aClass181ArrayArray1 != null) {
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
				if (local64 != 0 && local64 != super.anInt5261 || local70 != 0 && local70 != super.anInt5261) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class39 local95 = new Class39();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort11 = local99;
			local95.aShortArray26 = new short[local99];
			local95.aShortArray30 = new short[local99];
			local95.aShortArray31 = new short[local99];
			local95.aShortArray29 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray26[local124] = (short) (this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt5261) {
					local95.aShortArray26[local124] = (short) (this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1]);
				} else if (local129 == super.anInt5261 && local133 == super.anInt5261) {
					local95.aShortArray26[local124] = (short) (this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt5261 && local133 == 0) {
					local95.aShortArray26[local124] = (short) (this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]) * (super.anInt5261 - local129) + (this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1]) * (super.anInt5261 - local129) + (this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray26[local124] = (short) (local288 * (super.anInt5261 - local133) + local335 * local133 >> super.anInt5256 * 2);
				}
				local288 = (arg0 << super.anInt5256) + local129;
				local335 = (arg1 << super.anInt5256) + local133;
				local95.aShortArray30[local124] = (short) local129;
				local95.aShortArray29[local124] = (short) local133;
				local95.aShortArray31[local124] = (short) (this.a(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray26[local124] < 2) {
					local95.aShortArray26[local124] = 2;
				}
			}
			@Pc(415) boolean local415 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass19_Sub1_5.anInterface7_6.method2396(arg11[local288]).aBoolean639) {
					local415 = true;
				}
			}
			local95.anIntArray55 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray54 = new int[local133];
			}
			local95.aShortArray27 = new short[local133];
			local95.aShortArray25 = new short[local133];
			local95.aShortArray28 = new short[local133];
			if (local415) {
				local95.aShortArray32 = new short[local133];
				local95.aShortArray24 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray55[local95.aShort12] = Static82.method1470(arg9[local335]);
					} else {
						local95.anIntArray55[local95.aShort12] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray54[local95.aShort12] = -1;
						} else {
							local95.anIntArray54[local95.aShort12] = Static82.method1470(arg10[local335]);
						}
					}
					local95.aShortArray27[local95.aShort12] = (short) arg6[local335];
					local95.aShortArray25[local95.aShort12] = (short) arg7[local335];
					local95.aShortArray28[local95.aShort12] = (short) arg8[local335];
					if (local415) {
						if (arg11[local335] == -1 || this.aClass19_Sub1_5.anInterface7_6.method2396(arg11[local335]).aBoolean639) {
							local95.aShortArray32[local95.aShort12] = -1;
						} else {
							local95.aShortArray32[local95.aShort12] = (short) arg11[local335];
							local95.aShortArray24[local95.aShort12] = (short) arg12[local335];
						}
					}
					local95.aShort12++;
				}
			}
			this.aClass39ArrayArray1[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(644) Class238 local644 = new Class238();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local644.anInt6672 = Static48.method791(Static82.method1470(arg10[0]), this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]);
				if (local64 == -1) {
					local644.aByte77 = (byte) (local644.aByte77 | 0x2);
				}
			}
			if (this.anIntArrayArray22[arg0][arg1] == this.anIntArrayArray22[arg0 + 1][arg1] && this.anIntArrayArray22[arg0][arg1] == this.anIntArrayArray22[arg0 + 1][arg1 + 1] && this.anIntArrayArray22[arg0][arg1] == this.anIntArrayArray22[arg0][arg1 + 1]) {
				local644.aByte77 = (byte) (local644.aByte77 | 0x1);
			}
			if (local70 == -1 || (local644.aByte77 & 0x2) != 0 || this.aClass19_Sub1_5.anInterface7_6.method2396(local70).aBoolean639) {
				@Pc(845) short local845 = Static82.method1470(local64);
				local644.aShort91 = (short) Static48.method791(local845, this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]);
				local644.aShort92 = (short) Static48.method791(local845, this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1]);
				local644.aShort88 = (short) Static48.method791(local845, this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1]);
				local644.aShort89 = (short) Static48.method791(local845, this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1]);
				local644.aShort90 = -1;
			} else {
				local644.aShort91 = (short) (this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]);
				local644.aShort92 = (short) (this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1]);
				local644.aShort88 = (short) (this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1]);
				local644.aShort89 = (short) (this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1]);
				local644.aShort90 = (short) local70;
			}
			this.aClass238ArrayArray1[arg0][arg1] = local644;
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I)Z")
	private boolean method1722(@OriginalArg(0) int arg0) {
		if ((this.anInt1980 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!es", name = "ca", descriptor = "()V")
	@Override
	public void ca() {
		this.aByteArrayArray6 = null;
		this.aByteArrayArray5 = null;
	}

	@OriginalMember(owner = "client!es", name = "k", descriptor = "(IILclient!ba;)Lclient!ba;")
	@Override
	public Class4_Sub1_Sub4 k(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub1_Sub4 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!vp;[I)V")
	@Override
	public void method4024(@OriginalArg(0) Class4_Sub21 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(IIIIIII[[ZLclient!qv;[I[I)V")
	private void method1723(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class201 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean518 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass238ArrayArray1[local22][local25] != null) {
						@Pc(50) Class238 local50 = this.aClass238ArrayArray1[local22][local25];
						if (local50.aShort90 != -1 && (local50.aByte77 & 0x2) == 0 && local50.anInt6672 == -1) {
							local69 = this.aClass19_Sub1_5.method484(local50.aShort90);
							arg5.method4547(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static48.method791(local69, local50.aShort88 & 0xFFFF), Static48.method791(local69, local50.aShort89 & 0xFFFF), Static48.method791(local69, local50.aShort92 & 0xFFFF));
							arg5.method4547(local20, local20, local20 - 4, local16, local16 + 4, local16, Static48.method791(local69, local50.aShort91 & 0xFFFF), Static48.method791(local69, local50.aShort92 & 0xFFFF), Static48.method791(local69, local50.aShort89 & 0xFFFF));
						} else if (local50.anInt6672 == -1) {
							arg5.method4547(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort88 & 0xFFFF, local50.aShort89 & 0xFFFF, local50.aShort92 & 0xFFFF);
							arg5.method4547(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort91 & 0xFFFF, local50.aShort92 & 0xFFFF, local50.aShort89 & 0xFFFF);
						} else {
							local69 = local50.anInt6672;
							arg5.method4547(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method4547(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass39ArrayArray1[local22][local25] != null) {
						@Pc(249) Class39 local249 = this.aClass39ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort11; local69++) {
							arg6[local69] = local16 + local249.aShortArray30[local69] * 4 / super.anInt5261;
							arg7[local69] = local20 - local249.aShortArray29[local69] * 4 / super.anInt5261;
						}
						for (@Pc(287) int local287 = 0; local287 < local249.aShort12; local287++) {
							@Pc(293) short local293 = local249.aShortArray27[local287];
							@Pc(298) short local298 = local249.aShortArray25[local287];
							@Pc(303) short local303 = local249.aShortArray28[local287];
							@Pc(307) int local307 = arg6[local293];
							@Pc(311) int local311 = arg6[local298];
							@Pc(315) int local315 = arg6[local303];
							@Pc(319) int local319 = arg7[local293];
							@Pc(323) int local323 = arg7[local298];
							@Pc(327) int local327 = arg7[local303];
							@Pc(341) int local341;
							if (local249.anIntArray54 != null && local249.anIntArray54[local287] != -1) {
								local341 = local249.anIntArray54[local287];
								arg5.method4547(local319, local323, local327, local307, local311, local315, Static48.method791(local341, local249.aShortArray26[local293]), Static48.method791(local341, local249.aShortArray26[local298]), Static48.method791(local341, local249.aShortArray26[local303]));
							} else if (local249.aShortArray32 == null || local249.aShortArray32[local287] == -1) {
								local341 = local249.anIntArray55[local287];
								arg5.method4547(local319, local323, local327, local307, local311, local315, Static48.method791(local341, local249.aShortArray26[local293]), Static48.method791(local341, local249.aShortArray26[local298]), Static48.method791(local341, local249.aShortArray26[local303]));
							} else {
								local341 = this.aClass19_Sub1_5.method484(local249.aShortArray32[local287]);
								arg5.method4547(local319, local323, local327, local307, local311, local315, Static48.method791(local341, local249.aShortArray26[local293]), Static48.method791(local341, local249.aShortArray26[local298]), Static48.method791(local341, local249.aShortArray26[local303]));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean518 = true;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IILclient!qv;[I[I[I)V")
	private void method1724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class201 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class238 local6 = this.aClass238ArrayArray1[arg0][arg1];
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
			@Pc(1022) Class39 local1022 = this.aClass39ArrayArray1[arg0][arg1];
			if (local1022 != null) {
				@Pc(1046) short local1046;
				if (this.anInt1985 == -1) {
					for (local362 = 0; local362 < local1022.aShort11; local362++) {
						local24 = local1022.aShortArray30[local362] + (arg0 << super.anInt5256);
						local1046 = local1022.aShortArray31[local362];
						local34 = local1022.aShortArray29[local362] + (arg1 << super.anInt5256);
						local306 = this.anInt1984 + (this.anInt1973 * local24 + this.anInt1983 * local1046 + this.anInt1977 * local34 >> 15);
						if (local306 <= this.aClass19_Sub1_5.anInt406) {
							return;
						}
						local194 = this.anInt1975 + (this.anInt1979 * local24 + this.anInt1981 * local1046 + this.anInt1976 * local34 >> 15);
						local250 = this.anInt1978 + (this.anInt1986 * local24 + this.anInt1974 * local1046 + this.anInt1982 * local34 >> 15);
						arg3[local362] = arg2.anInt5773 + local194 * this.aClass19_Sub1_5.anInt416 / local306;
						arg4[local362] = arg2.anInt5777 + local250 * this.aClass19_Sub1_5.anInt417 / local306;
					}
				} else {
					for (local362 = 0; local362 < local1022.aShort11; local362++) {
						local24 = local1022.aShortArray30[local362] + (arg0 << super.anInt5256);
						local1046 = local1022.aShortArray31[local362];
						local34 = local1022.aShortArray29[local362] + (arg1 << super.anInt5256);
						local194 = this.anInt1975 + (this.anInt1979 * local24 + this.anInt1981 * local1046 + this.anInt1976 * local34 >> 15);
						local250 = this.anInt1978 + (this.anInt1986 * local24 + this.anInt1974 * local1046 + this.anInt1982 * local34 >> 15);
						arg3[local362] = arg2.anInt5773 + local194 * this.aClass19_Sub1_5.anInt416 / this.anInt1985;
						arg4[local362] = arg2.anInt5777 + local250 * this.aClass19_Sub1_5.anInt417 / this.anInt1985;
					}
				}
				if (local1022.aShortArray32 != null) {
					local362 = this.anIntArrayArray22[arg0][arg1];
					local222 = this.anIntArrayArray22[arg0 + 1][arg1];
					local278 = this.anIntArrayArray22[arg0][arg1 + 1];
					local334 = arg0 * super.anInt5261;
					local390 = local334 + super.anInt5261;
					local183 = arg1 * super.anInt5261;
					local239 = local183 + super.anInt5261;
					local295 = this.anInt1975 + (this.anInt1979 * local334 + this.anInt1981 * local362 + this.anInt1976 * local183 >> 15);
					local351 = this.anInt1978 + (this.anInt1986 * local334 + this.anInt1974 * local362 + this.anInt1982 * local183 >> 15);
					local211 = this.anInt1984 + (this.anInt1973 * local334 + this.anInt1983 * local362 + this.anInt1977 * local183 >> 15);
					local267 = this.anInt1975 + (this.anInt1979 * local390 + this.anInt1981 * local222 + this.anInt1976 * local183 >> 15);
					local323 = this.anInt1978 + (this.anInt1986 * local390 + this.anInt1974 * local222 + this.anInt1982 * local183 >> 15);
					local379 = this.anInt1984 + (this.anInt1973 * local390 + this.anInt1983 * local222 + this.anInt1977 * local183 >> 15);
					local72 = this.anInt1975 + (this.anInt1979 * local334 + this.anInt1981 * local278 + this.anInt1976 * local239 >> 15);
					local95 = this.anInt1978 + (this.anInt1986 * local334 + this.anInt1974 * local278 + this.anInt1982 * local239 >> 15);
					local118 = this.anInt1984 + (this.anInt1973 * local334 + this.anInt1983 * local278 + this.anInt1977 * local239 >> 15);
					for (local141 = 0; local141 < local1022.aShort12; local141++) {
						@Pc(1491) short local1491 = local1022.aShortArray27[local141];
						@Pc(1496) short local1496 = local1022.aShortArray25[local141];
						@Pc(1501) short local1501 = local1022.aShortArray28[local141];
						local427 = arg3[local1491];
						@Pc(1509) int local1509 = arg3[local1496];
						@Pc(1513) int local1513 = arg3[local1501];
						@Pc(1517) int local1517 = arg4[local1491];
						@Pc(1521) int local1521 = arg4[local1496];
						@Pc(1525) int local1525 = arg4[local1501];
						if ((local427 - local1509) * (local1525 - local1521) - (local1517 - local1521) * (local1513 - local1509) > 0) {
							arg2.aBoolean519 = local427 < 0 || local1509 < 0 || local1513 < 0 || local427 > arg2.anInt5772 || local1509 > arg2.anInt5772 || local1513 > arg2.anInt5772;
							@Pc(1569) short local1569 = local1022.aShortArray32[local141];
							if (local1569 == -1) {
								@Pc(1624) int local1624 = local1022.anIntArray55[local141];
								if (local1624 != -1) {
									arg2.method4547(local1517, local1521, local1525, local427, local1509, local1513, Static48.method791(local1624, local1022.aShortArray26[local1491]), Static48.method791(local1624, local1022.aShortArray26[local1496]), Static48.method791(local1624, local1022.aShortArray26[local1501]));
								}
							} else {
								if (this.method1722(this.aClass19_Sub1_5.anInterface7_6.method2396(local1569).aByte89)) {
									arg2.anInt5774 = 100;
								}
								arg2.method4545(local1517, local1521, local1525, local427, local1509, local1513, local1022.aShortArray26[local1491], local1022.aShortArray26[local1496], local1022.aShortArray26[local1501], local295, local267, local72, local351, local323, local95, local211, local379, local118, local1569);
								arg2.anInt5774 = 0;
							}
						}
					}
					return;
				}
				for (local362 = 0; local362 < local1022.aShort12; local362++) {
					@Pc(1670) short local1670 = local1022.aShortArray27[local362];
					@Pc(1675) short local1675 = local1022.aShortArray25[local362];
					@Pc(1680) short local1680 = local1022.aShortArray28[local362];
					local390 = arg3[local1670];
					local183 = arg3[local1675];
					local239 = arg3[local1680];
					local295 = arg4[local1670];
					local351 = arg4[local1675];
					local211 = arg4[local1680];
					if ((local390 - local183) * (local211 - local351) - (local295 - local351) * (local239 - local183) > 0) {
						local267 = local1022.anIntArray55[local362];
						if (local267 != -1) {
							arg2.aBoolean519 = local390 < 0 || local183 < 0 || local239 < 0 || local390 > arg2.anInt5772 || local183 > arg2.anInt5772 || local239 > arg2.anInt5772;
							arg2.method4547(local295, local351, local211, local390, local183, local239, Static48.method791(local267, local1022.aShortArray26[local1670]), Static48.method791(local267, local1022.aShortArray26[local1675]), Static48.method791(local267, local1022.aShortArray26[local1680]));
						}
					}
				}
			}
		} else if ((local6.aByte77 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt5261;
			local24 = local19 + super.anInt5261;
			@Pc(29) int local29 = arg1 * super.anInt5261;
			local34 = local29 + super.anInt5261;
			@Pc(46) int local46;
			@Pc(55) int local55;
			@Pc(166) int local166;
			if ((local6.aByte77 & 0x1) == 0) {
				local46 = this.anIntArrayArray22[arg0][arg1];
				local55 = this.anIntArrayArray22[arg0 + 1][arg1];
				local166 = this.anIntArrayArray22[arg0 + 1][arg1 + 1];
				local427 = this.anIntArrayArray22[arg0][arg1 + 1];
				if (this.anInt1985 == -1) {
					local72 = this.anInt1984 + (this.anInt1973 * local19 + this.anInt1983 * local46 + this.anInt1977 * local29 >> 15);
					if (local72 <= this.aClass19_Sub1_5.anInt406) {
						return;
					}
					local95 = this.anInt1984 + (this.anInt1973 * local24 + this.anInt1983 * local55 + this.anInt1977 * local29 >> 15);
					if (local95 <= this.aClass19_Sub1_5.anInt406) {
						return;
					}
					local118 = this.anInt1984 + (this.anInt1973 * local24 + this.anInt1983 * local166 + this.anInt1977 * local34 >> 15);
					if (local118 <= this.aClass19_Sub1_5.anInt406) {
						return;
					}
					local141 = this.anInt1984 + (this.anInt1973 * local19 + this.anInt1983 * local427 + this.anInt1977 * local34 >> 15);
					if (local141 <= this.aClass19_Sub1_5.anInt406) {
						return;
					}
				} else {
					local141 = this.anInt1985;
					local118 = this.anInt1985;
					local95 = this.anInt1985;
					local72 = this.anInt1985;
				}
				local183 = this.anInt1975 + (this.anInt1979 * local19 + this.anInt1981 * local46 + this.anInt1976 * local29 >> 15);
				local194 = arg2.anInt5773 + local183 * this.aClass19_Sub1_5.anInt416 / local72;
				local211 = this.anInt1978 + (this.anInt1986 * local19 + this.anInt1974 * local46 + this.anInt1982 * local29 >> 15);
				local222 = arg2.anInt5777 + local211 * this.aClass19_Sub1_5.anInt417 / local72;
				local239 = this.anInt1975 + (this.anInt1979 * local24 + this.anInt1981 * local55 + this.anInt1976 * local29 >> 15);
				local250 = arg2.anInt5773 + local239 * this.aClass19_Sub1_5.anInt416 / local95;
				local267 = this.anInt1978 + (this.anInt1986 * local24 + this.anInt1974 * local55 + this.anInt1982 * local29 >> 15);
				local278 = arg2.anInt5777 + local267 * this.aClass19_Sub1_5.anInt417 / local95;
				local295 = this.anInt1975 + (this.anInt1979 * local24 + this.anInt1981 * local166 + this.anInt1976 * local34 >> 15);
				local306 = arg2.anInt5773 + local295 * this.aClass19_Sub1_5.anInt416 / local118;
				local323 = this.anInt1978 + (this.anInt1986 * local24 + this.anInt1974 * local166 + this.anInt1982 * local34 >> 15);
				local334 = arg2.anInt5777 + local323 * this.aClass19_Sub1_5.anInt417 / local118;
				local351 = this.anInt1975 + (this.anInt1979 * local19 + this.anInt1981 * local427 + this.anInt1976 * local34 >> 15);
				local362 = arg2.anInt5773 + local351 * this.aClass19_Sub1_5.anInt416 / local141;
				local379 = this.anInt1978 + (this.anInt1986 * local19 + this.anInt1974 * local427 + this.anInt1982 * local34 >> 15);
				local390 = arg2.anInt5777 + local379 * this.aClass19_Sub1_5.anInt417 / local141;
			} else {
				local46 = this.anIntArrayArray22[arg0][arg1];
				if (this.anInt1985 == -1) {
					local55 = this.anInt1983 * local46;
					local72 = this.anInt1984 + (this.anInt1973 * local19 + local55 + this.anInt1977 * local29 >> 15);
					if (local72 <= this.aClass19_Sub1_5.anInt406) {
						return;
					}
					local95 = this.anInt1984 + (this.anInt1973 * local24 + local55 + this.anInt1977 * local29 >> 15);
					if (local95 <= this.aClass19_Sub1_5.anInt406) {
						return;
					}
					local118 = this.anInt1984 + (this.anInt1973 * local24 + local55 + this.anInt1977 * local34 >> 15);
					if (local118 <= this.aClass19_Sub1_5.anInt406) {
						return;
					}
					local141 = this.anInt1984 + (this.anInt1973 * local19 + local55 + this.anInt1977 * local34 >> 15);
					if (local141 <= this.aClass19_Sub1_5.anInt406) {
						return;
					}
				} else {
					local141 = this.anInt1985;
					local118 = this.anInt1985;
					local95 = this.anInt1985;
					local72 = this.anInt1985;
				}
				local55 = this.anInt1981 * local46;
				local166 = this.anInt1974 * local46;
				local183 = this.anInt1975 + (this.anInt1979 * local19 + local55 + this.anInt1976 * local29 >> 15);
				local194 = arg2.anInt5773 + local183 * this.aClass19_Sub1_5.anInt416 / local72;
				local211 = this.anInt1978 + (this.anInt1986 * local19 + local166 + this.anInt1982 * local29 >> 15);
				local222 = arg2.anInt5777 + local211 * this.aClass19_Sub1_5.anInt417 / local72;
				local239 = this.anInt1975 + (this.anInt1979 * local24 + local55 + this.anInt1976 * local29 >> 15);
				local250 = arg2.anInt5773 + local239 * this.aClass19_Sub1_5.anInt416 / local95;
				local267 = this.anInt1978 + (this.anInt1986 * local24 + local166 + this.anInt1982 * local29 >> 15);
				local278 = arg2.anInt5777 + local267 * this.aClass19_Sub1_5.anInt417 / local95;
				local295 = this.anInt1975 + (this.anInt1979 * local24 + local55 + this.anInt1976 * local34 >> 15);
				local306 = arg2.anInt5773 + local295 * this.aClass19_Sub1_5.anInt416 / local118;
				local323 = this.anInt1978 + (this.anInt1986 * local24 + local166 + this.anInt1982 * local34 >> 15);
				local334 = arg2.anInt5777 + local323 * this.aClass19_Sub1_5.anInt417 / local118;
				local351 = this.anInt1975 + (this.anInt1979 * local19 + local55 + this.anInt1976 * local34 >> 15);
				local362 = arg2.anInt5773 + local351 * this.aClass19_Sub1_5.anInt416 / local141;
				local379 = this.anInt1978 + (this.anInt1986 * local19 + local166 + this.anInt1982 * local34 >> 15);
				local390 = arg2.anInt5777 + local379 * this.aClass19_Sub1_5.anInt417 / local141;
			}
			if ((local306 - local362) * (local278 - local390) - (local334 - local390) * (local250 - local362) > 0) {
				arg2.aBoolean519 = local306 < 0 || local362 < 0 || local250 < 0 || local306 > arg2.anInt5772 || local362 > arg2.anInt5772 || local250 > arg2.anInt5772;
				if (local6.aShort90 >= 0) {
					if (this.method1722(this.aClass19_Sub1_5.anInterface7_6.method2396(local6.aShort90).aByte89)) {
						arg2.anInt5774 = 100;
					}
					arg2.method4545(local334, local390, local278, local306, local362, local250, local6.aShort88 & 0xFFFF, local6.aShort89 & 0xFFFF, local6.aShort92 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort90);
					arg2.anInt5774 = 0;
				} else {
					arg2.method4547(local334, local390, local278, local306, local362, local250, local6.aShort88 & 0xFFFF, local6.aShort89 & 0xFFFF, local6.aShort92 & 0xFFFF);
				}
			}
			if ((local194 - local250) * (local390 - local278) - (local222 - local278) * (local362 - local250) > 0) {
				arg2.aBoolean519 = local194 < 0 || local250 < 0 || local362 < 0 || local194 > arg2.anInt5772 || local250 > arg2.anInt5772 || local362 > arg2.anInt5772;
				if (local6.aShort90 >= 0) {
					if (this.method1722(this.aClass19_Sub1_5.anInterface7_6.method2396(local6.aShort90).aByte89)) {
						arg2.anInt5774 = 100;
					}
					arg2.method4545(local222, local278, local390, local194, local250, local362, local6.aShort91 & 0xFFFF, local6.aShort92 & 0xFFFF, local6.aShort89 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort90);
					arg2.anInt5774 = 0;
					return;
				}
				arg2.method4547(local222, local278, local390, local194, local250, local362, local6.aShort91 & 0xFFFF, local6.aShort92 & 0xFFFF, local6.aShort89 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method4029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class31_Sub2 local3 = this.aClass19_Sub1_5.aClass31_Sub2_1;
		this.anInt1985 = -1;
		this.anInt1979 = local3.anInt7334;
		this.anInt1981 = local3.anInt7328;
		this.anInt1976 = local3.anInt7332;
		this.anInt1975 = local3.anInt7329;
		this.anInt1986 = local3.anInt7331;
		this.anInt1974 = local3.anInt7326;
		this.anInt1982 = local3.anInt7327;
		this.anInt1978 = local3.anInt7324;
		this.anInt1973 = local3.anInt7323;
		this.anInt1983 = local3.anInt7330;
		this.anInt1977 = local3.anInt7325;
		this.anInt1984 = local3.anInt7333;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IIZLclient!qv;[I[I[I)V")
	private void method1725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class201 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class181 local6 = this.aClass181ArrayArray1[arg0][arg1];
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
			@Pc(1452) Class224 local1452 = this.aClass224ArrayArray1[arg0][arg1];
			if (local1452 != null) {
				if (this.anInt1985 == -1) {
					for (local436 = 0; local436 < local1452.aShort87; local436++) {
						local24 = local1452.aShortArray230[local436] + (arg0 << super.anInt5256);
						local29 = local1452.aShortArray229[local436];
						local34 = local1452.aShortArray225[local436] + (arg1 << super.anInt5256);
						local380 = this.anInt1984 + (this.anInt1973 * local24 + this.anInt1983 * local29 + this.anInt1977 * local34 >> 15);
						if (local380 <= this.aClass19_Sub1_5.anInt406) {
							return;
						}
						arg6[local436] = 0;
						if (arg2) {
							local296 = local380 - this.aClass19_Sub1_5.anInt411;
							if (local296 > 255) {
								local296 = 255;
							}
							if (local296 > 0) {
								arg6[local436] = local296;
								local352 = local1452.aShortArray226[local436] * local296 / 255;
								if (local352 > 0) {
									local29 -= local352;
								}
							}
						} else if (this.aClass19_Sub1_5.aBoolean44) {
							local296 = local380 - this.aClass19_Sub1_5.anInt411;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt1975 + (this.anInt1979 * local24 + this.anInt1981 * local29 + this.anInt1976 * local34 >> 15);
						local324 = this.anInt1978 + (this.anInt1986 * local24 + this.anInt1974 * local29 + this.anInt1982 * local34 >> 15);
						arg4[local436] = arg3.anInt5773 + local268 * this.aClass19_Sub1_5.anInt416 / local380;
						arg5[local436] = arg3.anInt5777 + local324 * this.aClass19_Sub1_5.anInt417 / local380;
					}
				} else {
					for (local436 = 0; local436 < local1452.aShort87; local436++) {
						local24 = local1452.aShortArray230[local436] + (arg0 << super.anInt5256);
						local29 = local1452.aShortArray229[local436];
						local34 = local1452.aShortArray225[local436] + (arg1 << super.anInt5256);
						arg6[local436] = 0;
						if (arg2) {
							local296 = this.anInt1985 - this.aClass19_Sub1_5.anInt411;
							if (local296 > 255) {
								local296 = 255;
							}
							if (local296 > 0) {
								arg6[local436] = local296;
								local352 = local1452.aShortArray226[local436] * local296 / 255;
								if (local352 > 0) {
									local29 -= local352;
								}
							}
						} else if (this.aClass19_Sub1_5.aBoolean44) {
							local296 = this.anInt1985 - this.aClass19_Sub1_5.anInt411;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt1975 + (this.anInt1979 * local24 + this.anInt1981 * local29 + this.anInt1976 * local34 >> 15);
						local324 = this.anInt1978 + (this.anInt1986 * local24 + this.anInt1974 * local29 + this.anInt1982 * local34 >> 15);
						arg4[local436] = arg3.anInt5773 + local268 * this.aClass19_Sub1_5.anInt416 / this.anInt1985;
						arg5[local436] = arg3.anInt5777 + local324 * this.aClass19_Sub1_5.anInt417 / this.anInt1985;
					}
				}
				if (local1452.aShortArray227 != null) {
					local436 = this.anIntArrayArray22[arg0][arg1];
					local296 = this.anIntArrayArray22[arg0 + 1][arg1];
					local352 = this.anIntArrayArray22[arg0][arg1 + 1];
					local408 = arg0 * super.anInt5261;
					local464 = local408 + super.anInt5261;
					local257 = arg1 * super.anInt5261;
					local313 = local257 + super.anInt5261;
					local369 = this.anInt1975 + (this.anInt1979 * local408 + this.anInt1981 * local436 + this.anInt1976 * local257 >> 15);
					local425 = this.anInt1978 + (this.anInt1986 * local408 + this.anInt1974 * local436 + this.anInt1982 * local257 >> 15);
					local285 = this.anInt1984 + (this.anInt1973 * local408 + this.anInt1983 * local436 + this.anInt1977 * local257 >> 15);
					local341 = this.anInt1975 + (this.anInt1979 * local464 + this.anInt1981 * local296 + this.anInt1976 * local257 >> 15);
					local397 = this.anInt1978 + (this.anInt1986 * local464 + this.anInt1974 * local296 + this.anInt1982 * local257 >> 15);
					local453 = this.anInt1984 + (this.anInt1973 * local464 + this.anInt1983 * local296 + this.anInt1977 * local257 >> 15);
					local82 = this.anInt1975 + (this.anInt1979 * local408 + this.anInt1981 * local352 + this.anInt1976 * local313 >> 15);
					local105 = this.anInt1978 + (this.anInt1986 * local408 + this.anInt1974 * local352 + this.anInt1982 * local313 >> 15);
					local128 = this.anInt1984 + (this.anInt1973 * local408 + this.anInt1983 * local352 + this.anInt1977 * local313 >> 15);
					for (local151 = 0; local151 < local1452.aShort86; local151++) {
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
							arg3.aBoolean519 = local42 < 0 || local176 < 0 || local56 < 0 || local42 > arg3.anInt5772 || local176 > arg3.anInt5772 || local56 > arg3.anInt5772;
							@Pc(2138) short local2138 = local1452.aShortArray227[local151];
							if (local642 < 765) {
								if (local2138 != -1 && this.method1722(this.aClass19_Sub1_5.anInterface7_6.method2396(local2138).aByte89)) {
									arg3.anInt5774 = 100;
								}
								if (local642 > 0) {
									if (local2138 != -1) {
										arg3.method4542(local65, local240, local501, local42, local176, local56, this.aClass19_Sub1_5.anInt409, arg6[local36], arg6[local38], arg6[local40], local1452.anIntArray488[local36], local1452.anIntArray488[local38], local1452.anIntArray488[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
									} else if ((local1452.anIntArray488[local36] & 0xFFFFFF) != 0) {
										arg3.method4548(local65, local240, local501, local42, local176, local56, Static177.method2539(local1452.anIntArray488[local36], arg6[local36] << 24 | this.aClass19_Sub1_5.anInt409), Static177.method2539(local1452.anIntArray488[local38], arg6[local38] << 24 | this.aClass19_Sub1_5.anInt409), Static177.method2539(local1452.anIntArray488[local40], arg6[local40] << 24 | this.aClass19_Sub1_5.anInt409));
									}
								} else if (local2138 != -1) {
									arg3.method4545(local65, local240, local501, local42, local176, local56, local1452.anIntArray488[local36], local1452.anIntArray488[local38], local1452.anIntArray488[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
								} else if ((local1452.anIntArray488[local36] & 0xFFFFFF) != 0) {
									arg3.method4548(local65, local240, local501, local42, local176, local56, local1452.anIntArray488[local36], local1452.anIntArray488[local38], local1452.anIntArray488[local40]);
								}
								arg3.anInt5774 = 0;
							} else {
								arg3.method4552(local65, local240, local501, local42, local176, local56, this.aClass19_Sub1_5.anInt409);
							}
						}
					}
					return;
				}
				for (local436 = 0; local436 < local1452.aShort86; local436++) {
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
						arg3.aBoolean519 = local464 < 0 || local257 < 0 || local313 < 0 || local464 > arg3.anInt5772 || local257 > arg3.anInt5772 || local313 > arg3.anInt5772;
						if (local341 >= 765) {
							arg3.method4552(local369, local425, local285, local464, local257, local313, this.aClass19_Sub1_5.anInt409);
						} else if (local341 > 0) {
							if ((local1452.anIntArray488[local296] & 0xFFFFFF) != 0) {
								arg3.method4548(local369, local425, local285, local464, local257, local313, Static342.method4632(this.aClass19_Sub1_5.anInt409, arg6[local296], local1452.anIntArray488[local296]), Static342.method4632(this.aClass19_Sub1_5.anInt409, arg6[local352], local1452.anIntArray488[local352]), Static342.method4632(this.aClass19_Sub1_5.anInt409, arg6[local408], local1452.anIntArray488[local408]));
							}
						} else if ((local1452.anIntArray488[local296] & 0xFFFFFF) != 0) {
							arg3.method4548(local369, local425, local285, local464, local257, local313, local1452.anIntArray488[local296], local1452.anIntArray488[local352], local1452.anIntArray488[local408]);
						}
					}
				}
			}
		} else if ((local6.aByte57 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt5261;
			local24 = local19 + super.anInt5261;
			local29 = arg1 * super.anInt5261;
			local34 = local29 + super.anInt5261;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte57 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray22[arg0][arg1];
				local65 = this.anIntArrayArray22[arg0 + 1][arg1];
				local240 = this.anIntArrayArray22[arg0 + 1][arg1 + 1];
				local501 = this.anIntArrayArray22[arg0][arg1 + 1];
				if (this.anInt1985 == -1) {
					local82 = this.anInt1984 + (this.anInt1973 * local19 + this.anInt1983 * local56 + this.anInt1977 * local29 >> 15);
					if (local82 <= this.aClass19_Sub1_5.anInt406) {
						return;
					}
					local105 = this.anInt1984 + (this.anInt1973 * local24 + this.anInt1983 * local65 + this.anInt1977 * local29 >> 15);
					if (local105 <= this.aClass19_Sub1_5.anInt406) {
						return;
					}
					local128 = this.anInt1984 + (this.anInt1973 * local24 + this.anInt1983 * local240 + this.anInt1977 * local34 >> 15);
					if (local128 <= this.aClass19_Sub1_5.anInt406) {
						return;
					}
					local151 = this.anInt1984 + (this.anInt1973 * local19 + this.anInt1983 * local501 + this.anInt1977 * local34 >> 15);
					if (local151 <= this.aClass19_Sub1_5.anInt406) {
						return;
					}
				} else {
					local151 = this.anInt1985;
					local128 = this.anInt1985;
					local105 = this.anInt1985;
					local82 = this.anInt1985;
				}
				if (arg2) {
					local176 = local82 - this.aClass19_Sub1_5.anInt411;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local36 = local176;
						local642 = local6.aShort70 * local176 / 255;
						if (local642 > 0) {
							local56 -= local642;
						}
					}
					local176 = local105 - this.aClass19_Sub1_5.anInt411;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local38 = local176;
						local642 = local6.aShort73 * local176 / 255;
						if (local642 > 0) {
							local65 -= local642;
						}
					}
					local176 = local128 - this.aClass19_Sub1_5.anInt411;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local40 = local176;
						local642 = local6.aShort71 * local176 / 255;
						if (local642 > 0) {
							local240 -= local642;
						}
					}
					local176 = local151 - this.aClass19_Sub1_5.anInt411;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local42 = local176;
						local642 = local6.aShort72 * local176 / 255;
						if (local642 > 0) {
							local501 -= local642;
						}
					}
				} else if (this.aClass19_Sub1_5.aBoolean44) {
					local176 = local82 - this.aClass19_Sub1_5.anInt411;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass19_Sub1_5.anInt411;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass19_Sub1_5.anInt411;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass19_Sub1_5.anInt411;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local257 = this.anInt1975 + (this.anInt1979 * local19 + this.anInt1981 * local56 + this.anInt1976 * local29 >> 15);
				local268 = arg3.anInt5773 + local257 * this.aClass19_Sub1_5.anInt416 / local82;
				local285 = this.anInt1978 + (this.anInt1986 * local19 + this.anInt1974 * local56 + this.anInt1982 * local29 >> 15);
				local296 = arg3.anInt5777 + local285 * this.aClass19_Sub1_5.anInt417 / local82;
				local313 = this.anInt1975 + (this.anInt1979 * local24 + this.anInt1981 * local65 + this.anInt1976 * local29 >> 15);
				local324 = arg3.anInt5773 + local313 * this.aClass19_Sub1_5.anInt416 / local105;
				local341 = this.anInt1978 + (this.anInt1986 * local24 + this.anInt1974 * local65 + this.anInt1982 * local29 >> 15);
				local352 = arg3.anInt5777 + local341 * this.aClass19_Sub1_5.anInt417 / local105;
				local369 = this.anInt1975 + (this.anInt1979 * local24 + this.anInt1981 * local240 + this.anInt1976 * local34 >> 15);
				local380 = arg3.anInt5773 + local369 * this.aClass19_Sub1_5.anInt416 / local128;
				local397 = this.anInt1978 + (this.anInt1986 * local24 + this.anInt1974 * local240 + this.anInt1982 * local34 >> 15);
				local408 = arg3.anInt5777 + local397 * this.aClass19_Sub1_5.anInt417 / local128;
				local425 = this.anInt1975 + (this.anInt1979 * local19 + this.anInt1981 * local501 + this.anInt1976 * local34 >> 15);
				local436 = arg3.anInt5773 + local425 * this.aClass19_Sub1_5.anInt416 / local151;
				local453 = this.anInt1978 + (this.anInt1986 * local19 + this.anInt1974 * local501 + this.anInt1982 * local34 >> 15);
				local464 = arg3.anInt5777 + local453 * this.aClass19_Sub1_5.anInt417 / local151;
			} else {
				local56 = this.anIntArrayArray22[arg0][arg1];
				if (this.anInt1985 == -1) {
					local65 = this.anInt1983 * local56;
					local82 = this.anInt1984 + (this.anInt1973 * local19 + local65 + this.anInt1977 * local29 >> 15);
					if (local82 <= this.aClass19_Sub1_5.anInt406) {
						return;
					}
					local105 = this.anInt1984 + (this.anInt1973 * local24 + local65 + this.anInt1977 * local29 >> 15);
					if (local105 <= this.aClass19_Sub1_5.anInt406) {
						return;
					}
					local128 = this.anInt1984 + (this.anInt1973 * local24 + local65 + this.anInt1977 * local34 >> 15);
					if (local128 <= this.aClass19_Sub1_5.anInt406) {
						return;
					}
					local151 = this.anInt1984 + (this.anInt1973 * local19 + local65 + this.anInt1977 * local34 >> 15);
					if (local151 <= this.aClass19_Sub1_5.anInt406) {
						return;
					}
				} else {
					local151 = this.anInt1985;
					local128 = this.anInt1985;
					local105 = this.anInt1985;
					local82 = this.anInt1985;
				}
				if (this.aClass19_Sub1_5.aBoolean44) {
					local176 = local82 - this.aClass19_Sub1_5.anInt411;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass19_Sub1_5.anInt411;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass19_Sub1_5.anInt411;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass19_Sub1_5.anInt411;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local65 = this.anInt1981 * local56;
				local240 = this.anInt1974 * local56;
				local257 = this.anInt1975 + (this.anInt1979 * local19 + local65 + this.anInt1976 * local29 >> 15);
				local268 = arg3.anInt5773 + local257 * this.aClass19_Sub1_5.anInt416 / local82;
				local285 = this.anInt1978 + (this.anInt1986 * local19 + local240 + this.anInt1982 * local29 >> 15);
				local296 = arg3.anInt5777 + local285 * this.aClass19_Sub1_5.anInt417 / local82;
				local313 = this.anInt1975 + (this.anInt1979 * local24 + local65 + this.anInt1976 * local29 >> 15);
				local324 = arg3.anInt5773 + local313 * this.aClass19_Sub1_5.anInt416 / local105;
				local341 = this.anInt1978 + (this.anInt1986 * local24 + local240 + this.anInt1982 * local29 >> 15);
				local352 = arg3.anInt5777 + local341 * this.aClass19_Sub1_5.anInt417 / local105;
				local369 = this.anInt1975 + (this.anInt1979 * local24 + local65 + this.anInt1976 * local34 >> 15);
				local380 = arg3.anInt5773 + local369 * this.aClass19_Sub1_5.anInt416 / local128;
				local397 = this.anInt1978 + (this.anInt1986 * local24 + local240 + this.anInt1982 * local34 >> 15);
				local408 = arg3.anInt5777 + local397 * this.aClass19_Sub1_5.anInt417 / local128;
				local425 = this.anInt1975 + (this.anInt1979 * local19 + local65 + this.anInt1976 * local34 >> 15);
				local436 = arg3.anInt5773 + local425 * this.aClass19_Sub1_5.anInt416 / local151;
				local453 = this.anInt1978 + (this.anInt1986 * local19 + local240 + this.anInt1982 * local34 >> 15);
				local464 = arg3.anInt5777 + local453 * this.aClass19_Sub1_5.anInt417 / local151;
			}
			@Pc(1064) boolean local1064 = local6.aShort69 != -1 && this.method1722(this.aClass19_Sub1_5.anInterface7_6.method2396(local6.aShort69).aByte89);
			local65 = local38 + local40 + local42;
			if ((local380 - local436) * (local352 - local464) - (local408 - local464) * (local324 - local436) > 0) {
				arg3.aBoolean519 = local380 < 0 || local436 < 0 || local324 < 0 || local380 > arg3.anInt5772 || local436 > arg3.anInt5772 || local324 > arg3.anInt5772;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt5774 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort69 >= 0) {
							arg3.method4542(local408, local464, local352, local380, local436, local324, this.aClass19_Sub1_5.anInt409, local40, local42, local38, local6.anInt5374, local6.anInt5378, local6.anInt5376, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort69);
						} else {
							arg3.method4548(local408, local464, local352, local380, local436, local324, Static177.method2539(local6.anInt5374, local40 << 24 | this.aClass19_Sub1_5.anInt409), Static177.method2539(local6.anInt5378, local42 << 24 | this.aClass19_Sub1_5.anInt409), Static177.method2539(local6.anInt5376, local38 << 24 | this.aClass19_Sub1_5.anInt409));
						}
					} else if (local6.aShort69 >= 0) {
						arg3.method4545(local408, local464, local352, local380, local436, local324, local6.anInt5374, local6.anInt5378, local6.anInt5376, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort69);
					} else {
						arg3.method4548(local408, local464, local352, local380, local436, local324, local6.anInt5374, local6.anInt5378, local6.anInt5376);
					}
					arg3.anInt5774 = 0;
				} else {
					arg3.method4552(local408, local464, local352, local380, local436, local324, this.aClass19_Sub1_5.anInt409);
				}
			}
			local65 = local36 + local38 + local42;
			if ((local268 - local324) * (local464 - local352) - (local296 - local352) * (local436 - local324) > 0) {
				arg3.aBoolean519 = local268 < 0 || local324 < 0 || local436 < 0 || local268 > arg3.anInt5772 || local324 > arg3.anInt5772 || local436 > arg3.anInt5772;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt5774 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort69 >= 0) {
							arg3.method4542(local296, local352, local464, local268, local324, local436, this.aClass19_Sub1_5.anInt409, local36, local38, local42, local6.anInt5375, local6.anInt5376, local6.anInt5378, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort69);
						} else {
							arg3.method4548(local296, local352, local464, local268, local324, local436, Static177.method2539(local6.anInt5375, local36 << 24 | this.aClass19_Sub1_5.anInt409), Static177.method2539(local6.anInt5376, local38 << 24 | this.aClass19_Sub1_5.anInt409), Static177.method2539(local6.anInt5378, local42 << 24 | this.aClass19_Sub1_5.anInt409));
						}
					} else if (local6.aShort69 >= 0) {
						arg3.method4545(local296, local352, local464, local268, local324, local436, local6.anInt5375, local6.anInt5376, local6.anInt5378, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort69);
					} else {
						arg3.method4548(local296, local352, local464, local268, local324, local436, local6.anInt5375, local6.anInt5376, local6.anInt5378);
					}
					arg3.anInt5774 = 0;
					return;
				}
				arg3.method4552(local296, local352, local464, local268, local324, local436, this.aClass19_Sub1_5.anInt409);
			}
		}
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(II)V")
	@Override
	public void method4028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class45 local4 = this.aClass19_Sub1_5.method488(Thread.currentThread());
		local4.aClass201_1.anInt5774 = 0;
		if (this.aClass181ArrayArray1 != null) {
			this.method1725(arg0, arg1, this.aClass19_Sub1_5.aBoolean43, local4.aClass201_1, local4.anIntArray75, local4.anIntArray93, local4.anIntArray71);
		} else if (this.aClass238ArrayArray1 != null) {
			this.method1724(arg0, arg1, local4.aClass201_1, local4.anIntArray75, local4.anIntArray93, local4.anIntArray71);
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!ba;IIIIZ)Z")
	@Override
	public boolean method4022(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II)I")
	@Override
	public int a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> super.anInt5256;
		@Pc(9) int local9 = arg1 >> super.anInt5256;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt5262 - 1 || local9 > super.anInt5258 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & super.anInt5261 - 1;
		@Pc(41) int local41 = arg1 & super.anInt5261 - 1;
		@Pc(67) int local67 = this.anIntArrayArray22[local4][local9] * (super.anInt5261 - local34) + this.anIntArrayArray22[local4 + 1][local9] * local34 >> super.anInt5256;
		@Pc(97) int local97 = this.anIntArrayArray22[local4][local9 + 1] * (super.anInt5261 - local34) + this.anIntArrayArray22[local4 + 1][local9 + 1] * local34 >> super.anInt5256;
		return local67 * (super.anInt5261 - local41) + local97 * local41 >> super.anInt5256;
	}

	@OriginalMember(owner = "client!es", name = "i", descriptor = "(III)V")
	@Override
	public void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray5[arg0][arg1] < arg2) {
			this.aByteArrayArray5[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method4025(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class45 local4 = this.aClass19_Sub1_5.method488(Thread.currentThread());
		@Pc(7) Class201 local7 = local4.aClass201_1;
		local7.anInt5774 = 0;
		local7.aBoolean519 = false;
		if (this.aClass181ArrayArray1 != null) {
			this.method1720(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray75, local4.anIntArray93);
		} else if (this.aClass238ArrayArray1 != null) {
			this.method1723(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray75, local4.anIntArray93);
		}
	}
}
