import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public abstract class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
	protected int anInt3725;

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "[[Lclient!ft;")
	protected Class94[][] aClass94ArrayArray3;

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "[[Lclient!ju;")
	protected Class158[][] aClass158ArrayArray3;

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
	protected int anInt3726;

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
	protected int anInt3727;

	@OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
	protected int anInt3728;

	@OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
	protected int anInt3729;

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "[[Lclient!le;")
	protected Class176[][] aClass176ArrayArray3;

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
	protected int anInt3731;

	@OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
	protected int anInt3732;

	@OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
	protected int anInt3733;

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
	protected int anInt3734;

	@OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
	protected int anInt3735;

	@OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
	protected int anInt3736;

	@OriginalMember(owner = "client!pf", name = "z", descriptor = "[[Lclient!cl;")
	protected Class45[][] aClass45ArrayArray3;

	@OriginalMember(owner = "client!pf", name = "A", descriptor = "I")
	protected int anInt3738;

	@OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
	protected int anInt3730 = -1;

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "Lclient!aw;")
	protected final Class9_Sub2 aClass9_Sub2_10;

	@OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
	private final int anInt3737;

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "[[I")
	public final int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!pf", name = "k", descriptor = "[[B")
	private byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "[[B")
	private byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lclient!aw;IIII[[I[[II)V")
	public Class10_Sub1(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass9_Sub2_10 = arg0;
		this.anInt3737 = arg2;
		this.anIntArrayArray31 = arg5;
		this.aByteArrayArray17 = new byte[arg3 + 1][arg4 + 1];
		@Pc(31) int local31 = this.aClass9_Sub2_10.anInt5324 >> 9;
		for (@Pc(33) int local33 = 1; local33 < arg4; local33++) {
			for (@Pc(36) int local36 = 1; local36 < arg3; local36++) {
				@Pc(55) int local55 = arg6[local36 + 1][local33] - arg6[local36 - 1][local33];
				@Pc(71) int local71 = arg6[local36][local33 + 1] - arg6[local36][local33 - 1];
				@Pc(86) int local86 = (int) Math.sqrt((double) (local55 * local55 + arg7 * 512 + local71 * local71));
				@Pc(92) int local92 = (local55 << 8) / local86;
				@Pc(98) int local98 = arg7 * -512 / local86;
				@Pc(104) int local104 = (local71 << 8) / local86;
				@Pc(126) int local126 = local31 + (this.aClass9_Sub2_10.anInt5329 * local92 + this.aClass9_Sub2_10.anInt5316 * local98 + this.aClass9_Sub2_10.anInt5319 * local104 >> 17);
				local126 >>= 0x1;
				if (local126 < 2) {
					local126 = 2;
				} else if (local126 > 126) {
					local126 = 126;
				}
				this.aByteArrayArray17[local36][local33] = (byte) local126;
			}
		}
		this.aByteArrayArray18 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!pf", name = "ya", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public final void ya(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!pf", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public final void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass45ArrayArray3 == null) {
			this.aClass45ArrayArray3 = new Class45[super.anInt7412][super.anInt7409];
			this.aClass158ArrayArray3 = new Class158[super.anInt7412][super.anInt7409];
		} else if (this.aClass94ArrayArray3 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static180.anIntArray297[Static257.method7982(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static180.anIntArray297[Static257.method7982(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == super.anInt7410 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt7410 && arg4[local116] == super.anInt7410) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt7410) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt7410 && arg2[local244] != arg2[0] - super.anInt7410) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt7410 && arg4[local244] != arg4[0] - super.anInt7410) {
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
			@Pc(334) Class45 local334 = new Class45();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt1728 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte3 = (byte) (local334.aByte3 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray31[arg0][arg1] == this.anIntArrayArray31[arg0 + 1][arg1] && this.anIntArrayArray31[arg0][arg1] == this.anIntArrayArray31[arg0 + 1][arg1 + 1] && this.anIntArrayArray31[arg0][arg1] == this.anIntArrayArray31[arg0][arg1 + 1]) {
				local334.aByte3 = (byte) (local334.aByte3 | 0x1);
			}
			if (local342 == -1 || (local334.aByte3 & 0x2) != 0 || this.aClass9_Sub2_10.anInterface8_13.method7085(local342).aBoolean356) {
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
				local334.anInt1727 = Static99.method2251(Static557.method3321(arg6[local104] >> 8, this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray18[arg0][arg1]), arg10, local527);
				if (local334.anInt1728 != 0) {
					local334.anInt1727 |= this.aByteArrayArray18[arg0][arg1] + 255 - this.aByteArrayArray17[arg0][arg1] << 25;
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
				local334.anInt1726 = Static99.method2251(Static557.method3321(arg6[local106] >> 8, this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray18[arg0 + 1][arg1]), arg10, local527);
				if (local334.anInt1728 != 0) {
					local334.anInt1726 |= this.aByteArrayArray18[arg0 + 1][arg1] + 255 - this.aByteArrayArray17[arg0 + 1][arg1] << 25;
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
				local334.anInt1730 = Static99.method2251(Static557.method3321(arg6[local108] >> 8, this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray18[arg0 + 1][arg1 + 1]), arg10, local527);
				if (local334.anInt1728 != 0) {
					local334.anInt1730 |= this.aByteArrayArray18[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray17[arg0 + 1][arg1 + 1] << 25;
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
				local334.anInt1729 = Static99.method2251(Static557.method3321(arg6[local110] >> 8, this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray18[arg0][arg1 + 1]), arg10, local527);
				if (local334.anInt1728 != 0) {
					local334.anInt1729 |= this.aByteArrayArray18[arg0][arg1 + 1] + 255 - this.aByteArrayArray17[arg0][arg1 + 1] << 25;
				}
				local334.aShort19 = -1;
			} else {
				local334.anInt1727 = this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray18[arg0][arg1];
				local334.anInt1726 = this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray18[arg0 + 1][arg1];
				local334.anInt1730 = this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray18[arg0 + 1][arg1 + 1];
				local334.anInt1729 = this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray18[arg0][arg1 + 1];
				local334.aShort19 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort17 = (short) arg5[local108];
				local334.aShort20 = (short) arg5[local110];
				local334.aShort21 = (short) arg5[local106];
				local334.aShort18 = (short) arg5[local104];
			}
			this.aClass45ArrayArray3[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class158 local888 = new Class158();
		local888.aShort75 = (short) arg2.length;
		local888.aShort74 = (short) (arg2.length / 3);
		local888.aShortArray76 = new short[local888.aShort75];
		local888.aShortArray77 = new short[local888.aShort75];
		local888.aShortArray75 = new short[local888.aShort75];
		local888.anIntArray337 = new int[local888.aShort75];
		if (arg5 != null) {
			local888.aShortArray74 = new short[local888.aShort75];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort75; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray18[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt7410) {
				local958 = this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray18[arg0][arg1 + 1];
			} else if (local342 == super.anInt7410 && local527 == super.anInt7410) {
				local958 = this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray18[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt7410 && local527 == 0) {
				local958 = this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray18[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray18[arg0][arg1]) * (super.anInt7410 - local342) + (this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray18[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray18[arg0][arg1 + 1]) * (super.anInt7410 - local342) + (this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray18[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt7410 - local527) + local1126 * local527 >> super.anInt7411 * 2;
			}
			local1079 = (arg0 << super.anInt7411) + local342;
			local1126 = (arg1 << super.anInt7411) + local527;
			local888.aShortArray76[local244] = (short) local342;
			local888.aShortArray75[local244] = (short) local527;
			local888.aShortArray77[local244] = (short) (this.aa(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass9_Sub2_10.anInterface8_13.method7085(arg8[local244]).aBoolean356) {
				local888.anIntArray337[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray74[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray337[local244] = Static99.method2251(Static557.method3321(arg6[local244] >> 8, local958), arg10, local1226);
				if (arg7 != null) {
					local888.anIntArray337[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray337[local244] = 0;
			} else {
				local888.anIntArray337[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort74; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass9_Sub2_10.anInterface8_13.method7085(arg8[local527 * 3]).aBoolean356) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray336 = new int[local888.aShort74];
		}
		if (local1296) {
			local888.aShortArray79 = new short[local888.aShort74];
			local888.aShortArray78 = new short[local888.aShort74];
		}
		for (local958 = 0; local958 < local888.aShort74; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray336[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass9_Sub2_10.anInterface8_13.method7085(local1384).aBoolean356) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass9_Sub2_10.anInterface8_13.method7085(local1384).aBoolean356) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass9_Sub2_10.anInterface8_13.method7085(local1384).aBoolean356) {
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
						if (local1384 != -1 && !this.aClass9_Sub2_10.anInterface8_13.method7085(local1384).aBoolean356) {
							local888.anIntArray337[local1079] = Static180.anIntArray297[Static257.method7982(this.aClass9_Sub2_10.anInterface8_13.method7085(local1384).aShort81 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass9_Sub2_10.anInterface8_13.method7085(local1384).aBoolean356) {
							local888.anIntArray337[local1126] = Static180.anIntArray297[Static257.method7982(this.aClass9_Sub2_10.anInterface8_13.method7085(local1384).aShort81 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass9_Sub2_10.anInterface8_13.method7085(local1384).aBoolean356) {
							local888.anIntArray337[local1226] = Static180.anIntArray297[Static257.method7982(this.aClass9_Sub2_10.anInterface8_13.method7085(local1384).aShort81 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray79[local958] = -1;
				}
			}
		}
		this.aClass158ArrayArray3[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!pf", name = "F", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public final void F(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public final void method6334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass94ArrayArray3 == null) {
			this.aClass94ArrayArray3 = new Class94[super.anInt7412][super.anInt7409];
			this.aClass176ArrayArray3 = new Class176[super.anInt7412][super.anInt7409];
		} else if (this.aClass45ArrayArray3 != null) {
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
				if (local64 != 0 && local64 != super.anInt7410 || local70 != 0 && local70 != super.anInt7410) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class176 local95 = new Class176();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort83 = local99;
			local95.aShortArray85 = new short[local99];
			local95.aShortArray84 = new short[local99];
			local95.aShortArray91 = new short[local99];
			local95.aShortArray89 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray85[local124] = (short) (this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray18[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt7410) {
					local95.aShortArray85[local124] = (short) (this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray18[arg0][arg1 + 1]);
				} else if (local129 == super.anInt7410 && local133 == super.anInt7410) {
					local95.aShortArray85[local124] = (short) (this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray18[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt7410 && local133 == 0) {
					local95.aShortArray85[local124] = (short) (this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray18[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray18[arg0][arg1]) * (super.anInt7410 - local129) + (this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray18[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray18[arg0][arg1 + 1]) * (super.anInt7410 - local129) + (this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray18[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray85[local124] = (short) (local288 * (super.anInt7410 - local133) + local335 * local133 >> super.anInt7411 * 2);
				}
				local288 = (arg0 << super.anInt7411) + local129;
				local335 = (arg1 << super.anInt7411) + local133;
				local95.aShortArray84[local124] = (short) local129;
				local95.aShortArray89[local124] = (short) local133;
				local95.aShortArray91[local124] = (short) (this.aa(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray85[local124] < 2) {
					local95.aShortArray85[local124] = 2;
				}
			}
			@Pc(415) boolean local415 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass9_Sub2_10.anInterface8_13.method7085(arg11[local288]).aBoolean356) {
					local415 = true;
				}
			}
			local95.anIntArray377 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray378 = new int[local133];
			}
			local95.aShortArray88 = new short[local133];
			local95.aShortArray86 = new short[local133];
			local95.aShortArray90 = new short[local133];
			if (local415) {
				local95.aShortArray83 = new short[local133];
				local95.aShortArray87 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray377[local95.aShort82] = Static257.method7982(arg9[local335]);
					} else {
						local95.anIntArray377[local95.aShort82] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray378[local95.aShort82] = -1;
						} else {
							local95.anIntArray378[local95.aShort82] = Static257.method7982(arg10[local335]);
						}
					}
					local95.aShortArray88[local95.aShort82] = (short) arg6[local335];
					local95.aShortArray86[local95.aShort82] = (short) arg7[local335];
					local95.aShortArray90[local95.aShort82] = (short) arg8[local335];
					if (local415) {
						if (arg11[local335] == -1 || this.aClass9_Sub2_10.anInterface8_13.method7085(arg11[local335]).aBoolean356) {
							local95.aShortArray83[local95.aShort82] = -1;
						} else {
							local95.aShortArray83[local95.aShort82] = (short) arg11[local335];
							local95.aShortArray87[local95.aShort82] = (short) arg12[local335];
						}
					}
					local95.aShort82++;
				}
			}
			this.aClass176ArrayArray3[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(644) Class94 local644 = new Class94();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local644.anInt3319 = Static222.method3938(Static257.method7982(arg10[0]), this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray18[arg0][arg1]);
				if (local64 == -1) {
					local644.aByte24 = (byte) (local644.aByte24 | 0x2);
				}
			}
			if (this.anIntArrayArray31[arg0][arg1] == this.anIntArrayArray31[arg0 + 1][arg1] && this.anIntArrayArray31[arg0][arg1] == this.anIntArrayArray31[arg0 + 1][arg1 + 1] && this.anIntArrayArray31[arg0][arg1] == this.anIntArrayArray31[arg0][arg1 + 1]) {
				local644.aByte24 = (byte) (local644.aByte24 | 0x1);
			}
			if (local70 == -1 || (local644.aByte24 & 0x2) != 0 || this.aClass9_Sub2_10.anInterface8_13.method7085(local70).aBoolean356) {
				@Pc(845) short local845 = Static257.method7982(local64);
				local644.aShort54 = (short) Static222.method3938(local845, this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray18[arg0][arg1]);
				local644.aShort51 = (short) Static222.method3938(local845, this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray18[arg0 + 1][arg1]);
				local644.aShort53 = (short) Static222.method3938(local845, this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray18[arg0 + 1][arg1 + 1]);
				local644.aShort52 = (short) Static222.method3938(local845, this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray18[arg0][arg1 + 1]);
				local644.aShort50 = -1;
			} else {
				local644.aShort54 = (short) (this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray18[arg0][arg1]);
				local644.aShort51 = (short) (this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray18[arg0 + 1][arg1]);
				local644.aShort53 = (short) (this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray18[arg0 + 1][arg1 + 1]);
				local644.aShort52 = (short) (this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray18[arg0][arg1 + 1]);
				local644.aShort50 = (short) local70;
			}
			this.aClass94ArrayArray3[arg0][arg1] = local644;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!nm;[I)V")
	@Override
	public final void method6335(@OriginalArg(0) Class1_Sub27 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method6337(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)V")
	public abstract void method6333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!pf", name = "X", descriptor = "(IILclient!k;)Lclient!k;")
	@Override
	public final Class1_Sub1_Sub4 X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub4 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!pf", name = "aa", descriptor = "(II)I")
	@Override
	public final int aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> super.anInt7411;
		@Pc(9) int local9 = arg1 >> super.anInt7411;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt7412 - 1 || local9 > super.anInt7409 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & super.anInt7410 - 1;
		@Pc(41) int local41 = arg1 & super.anInt7410 - 1;
		@Pc(67) int local67 = this.anIntArrayArray31[local4][local9] * (super.anInt7410 - local34) + this.anIntArrayArray31[local4 + 1][local9] * local34 >> super.anInt7411;
		@Pc(97) int local97 = this.anIntArrayArray31[local4][local9 + 1] * (super.anInt7410 - local34) + this.anIntArrayArray31[local4 + 1][local9 + 1] * local34 >> super.anInt7411;
		return local67 * (super.anInt7410 - local41) + local97 * local41 >> super.anInt7411;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!k;IIIIZ)Z")
	@Override
	public final boolean method6336(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!pf", name = "Q", descriptor = "(III)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray18[arg0][arg1] < arg2) {
			this.aByteArrayArray18[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!pf", name = "ba", descriptor = "(II)I")
	@Override
	public final int ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray31[arg0][arg1];
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)Z")
	protected final boolean method3322(@OriginalArg(0) int arg0) {
		if ((this.anInt3737 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!pf", name = "N", descriptor = "()V")
	@Override
	public final void N() {
		this.aByteArrayArray17 = null;
		this.aByteArrayArray18 = null;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public final void method6332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class22_Sub1 local3 = this.aClass9_Sub2_10.aClass22_Sub1_5;
		this.anInt3730 = -1;
		this.anInt3735 = local3.anInt1076;
		this.anInt3725 = local3.anInt1081;
		this.anInt3727 = local3.anInt1075;
		this.anInt3733 = local3.anInt1073;
		this.anInt3736 = local3.anInt1078;
		this.anInt3726 = local3.anInt1074;
		this.anInt3734 = local3.anInt1077;
		this.anInt3731 = local3.anInt1080;
		this.anInt3732 = local3.anInt1071;
		this.anInt3728 = local3.anInt1070;
		this.anInt3729 = local3.anInt1079;
		this.anInt3738 = local3.anInt1072;
	}
}
