import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public abstract class Class52_Sub1 extends Class52 {

	@OriginalMember(owner = "client!gw", name = "k", descriptor = "I")
	protected int anInt8939;

	@OriginalMember(owner = "client!gw", name = "l", descriptor = "I")
	protected int anInt8940;

	@OriginalMember(owner = "client!gw", name = "m", descriptor = "I")
	protected int anInt8941;

	@OriginalMember(owner = "client!gw", name = "p", descriptor = "I")
	protected int anInt8942;

	@OriginalMember(owner = "client!gw", name = "s", descriptor = "[[Lclient!np;")
	protected Class210[][] aClass210ArrayArray3;

	@OriginalMember(owner = "client!gw", name = "t", descriptor = "[[Lclient!ge;")
	protected Class104[][] aClass104ArrayArray3;

	@OriginalMember(owner = "client!gw", name = "w", descriptor = "I")
	protected int anInt8945;

	@OriginalMember(owner = "client!gw", name = "x", descriptor = "I")
	protected int anInt8946;

	@OriginalMember(owner = "client!gw", name = "y", descriptor = "I")
	protected int anInt8947;

	@OriginalMember(owner = "client!gw", name = "z", descriptor = "I")
	protected int anInt8948;

	@OriginalMember(owner = "client!gw", name = "A", descriptor = "I")
	protected int anInt8949;

	@OriginalMember(owner = "client!gw", name = "B", descriptor = "[[Lclient!ej;")
	protected Class74[][] aClass74ArrayArray3;

	@OriginalMember(owner = "client!gw", name = "C", descriptor = "I")
	protected int anInt8950;

	@OriginalMember(owner = "client!gw", name = "D", descriptor = "[[Lclient!jw;")
	protected Class156[][] aClass156ArrayArray3;

	@OriginalMember(owner = "client!gw", name = "E", descriptor = "I")
	protected int anInt8951;

	@OriginalMember(owner = "client!gw", name = "F", descriptor = "I")
	protected int anInt8952;

	@OriginalMember(owner = "client!gw", name = "u", descriptor = "I")
	protected int anInt8944 = -1;

	@OriginalMember(owner = "client!gw", name = "v", descriptor = "Lclient!fk;")
	protected final Class5_Sub2 aClass5_Sub2_18;

	@OriginalMember(owner = "client!gw", name = "r", descriptor = "I")
	private final int anInt8943;

	@OriginalMember(owner = "client!gw", name = "n", descriptor = "[[I")
	public final int[][] anIntArrayArray84;

	@OriginalMember(owner = "client!gw", name = "o", descriptor = "[[B")
	private byte[][] aByteArrayArray27;

	@OriginalMember(owner = "client!gw", name = "q", descriptor = "[[B")
	private byte[][] aByteArrayArray28;

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lclient!fk;IIII[[I[[II)V")
	public Class52_Sub1(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass5_Sub2_18 = arg0;
		this.anInt8943 = arg2;
		this.anIntArrayArray84 = arg5;
		this.aByteArrayArray27 = new byte[arg3 + 1][arg4 + 1];
		@Pc(31) int local31 = this.aClass5_Sub2_18.anInt9065 >> 9;
		for (@Pc(33) int local33 = 1; local33 < arg4; local33++) {
			for (@Pc(36) int local36 = 1; local36 < arg3; local36++) {
				@Pc(55) int local55 = arg6[local36 + 1][local33] - arg6[local36 - 1][local33];
				@Pc(71) int local71 = arg6[local36][local33 + 1] - arg6[local36][local33 - 1];
				@Pc(86) int local86 = (int) Math.sqrt((double) (local55 * local55 + arg7 * 512 + local71 * local71));
				@Pc(92) int local92 = (local55 << 8) / local86;
				@Pc(98) int local98 = arg7 * -512 / local86;
				@Pc(104) int local104 = (local71 << 8) / local86;
				@Pc(126) int local126 = local31 + (this.aClass5_Sub2_18.anInt9071 * local92 + this.aClass5_Sub2_18.anInt9055 * local98 + this.aClass5_Sub2_18.anInt9051 * local104 >> 17);
				local126 >>= 0x1;
				if (local126 < 2) {
					local126 = 2;
				} else if (local126 > 126) {
					local126 = 126;
				}
				this.aByteArrayArray27[local36][local33] = (byte) local126;
			}
		}
		this.aByteArrayArray28 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!oj;[I)V")
	@Override
	public final void method7832(@OriginalArg(0) Class3_Sub30 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)Z")
	protected final boolean method7344(@OriginalArg(0) int arg0) {
		if ((this.anInt8943 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!gw", name = "aa", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public final void aa(@OriginalArg(0) Class3_Sub10_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!gw", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public final void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass156ArrayArray3 == null) {
			this.aClass156ArrayArray3 = new Class156[super.anInt9491][super.anInt9492];
			this.aClass210ArrayArray3 = new Class210[super.anInt9491][super.anInt9492];
		} else if (this.aClass104ArrayArray3 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static457.anIntArray710[Static484.method7144(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static457.anIntArray710[Static484.method7144(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == super.anInt9493 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt9493 && arg4[local116] == super.anInt9493) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt9493) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt9493 && arg2[local244] != arg2[0] - super.anInt9493) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt9493 && arg4[local244] != arg4[0] - super.anInt9493) {
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
			@Pc(334) Class156 local334 = new Class156();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt4968 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte44 = (byte) (local334.aByte44 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray84[arg0][arg1] == this.anIntArrayArray84[arg0 + 1][arg1] && this.anIntArrayArray84[arg0][arg1] == this.anIntArrayArray84[arg0 + 1][arg1 + 1] && this.anIntArrayArray84[arg0][arg1] == this.anIntArrayArray84[arg0][arg1 + 1]) {
				local334.aByte44 = (byte) (local334.aByte44 | 0x1);
			}
			if (local342 == -1 || (local334.aByte44 & 0x2) != 0 || this.aClass5_Sub2_18.anInterface4_14.method6712(local342).aBoolean461) {
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
				local334.anInt4970 = Static132.method2302(Static554.method7343(arg6[local104] >> 8, this.aByteArrayArray27[arg0][arg1] - this.aByteArrayArray28[arg0][arg1]), local527, arg10);
				if (local334.anInt4968 != 0) {
					local334.anInt4970 |= this.aByteArrayArray28[arg0][arg1] + 255 - this.aByteArrayArray27[arg0][arg1] << 25;
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
				local334.anInt4967 = Static132.method2302(Static554.method7343(arg6[local106] >> 8, this.aByteArrayArray27[arg0 + 1][arg1] - this.aByteArrayArray28[arg0 + 1][arg1]), local527, arg10);
				if (local334.anInt4968 != 0) {
					local334.anInt4967 |= this.aByteArrayArray28[arg0 + 1][arg1] + 255 - this.aByteArrayArray27[arg0 + 1][arg1] << 25;
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
				local334.anInt4969 = Static132.method2302(Static554.method7343(arg6[local108] >> 8, this.aByteArrayArray27[arg0 + 1][arg1 + 1] - this.aByteArrayArray28[arg0 + 1][arg1 + 1]), local527, arg10);
				if (local334.anInt4968 != 0) {
					local334.anInt4969 |= this.aByteArrayArray28[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray27[arg0 + 1][arg1 + 1] << 25;
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
				local334.anInt4971 = Static132.method2302(Static554.method7343(arg6[local110] >> 8, this.aByteArrayArray27[arg0][arg1 + 1] - this.aByteArrayArray28[arg0][arg1 + 1]), local527, arg10);
				if (local334.anInt4968 != 0) {
					local334.anInt4971 |= this.aByteArrayArray28[arg0][arg1 + 1] + 255 - this.aByteArrayArray27[arg0][arg1 + 1] << 25;
				}
				local334.aShort76 = -1;
			} else {
				local334.anInt4970 = this.aByteArrayArray27[arg0][arg1] - this.aByteArrayArray28[arg0][arg1];
				local334.anInt4967 = this.aByteArrayArray27[arg0 + 1][arg1] - this.aByteArrayArray28[arg0 + 1][arg1];
				local334.anInt4969 = this.aByteArrayArray27[arg0 + 1][arg1 + 1] - this.aByteArrayArray28[arg0 + 1][arg1 + 1];
				local334.anInt4971 = this.aByteArrayArray27[arg0][arg1 + 1] - this.aByteArrayArray28[arg0][arg1 + 1];
				local334.aShort76 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort79 = (short) arg5[local108];
				local334.aShort77 = (short) arg5[local110];
				local334.aShort75 = (short) arg5[local106];
				local334.aShort78 = (short) arg5[local104];
			}
			this.aClass156ArrayArray3[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class210 local888 = new Class210();
		local888.aShort90 = (short) arg2.length;
		local888.aShort91 = (short) (arg2.length / 3);
		local888.aShortArray128 = new short[local888.aShort90];
		local888.aShortArray130 = new short[local888.aShort90];
		local888.aShortArray127 = new short[local888.aShort90];
		local888.anIntArray550 = new int[local888.aShort90];
		if (arg5 != null) {
			local888.aShortArray129 = new short[local888.aShort90];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort90; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray27[arg0][arg1] - this.aByteArrayArray28[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt9493) {
				local958 = this.aByteArrayArray27[arg0][arg1 + 1] - this.aByteArrayArray28[arg0][arg1 + 1];
			} else if (local342 == super.anInt9493 && local527 == super.anInt9493) {
				local958 = this.aByteArrayArray27[arg0 + 1][arg1 + 1] - this.aByteArrayArray28[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt9493 && local527 == 0) {
				local958 = this.aByteArrayArray27[arg0 + 1][arg1] - this.aByteArrayArray28[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray27[arg0][arg1] - this.aByteArrayArray28[arg0][arg1]) * (super.anInt9493 - local342) + (this.aByteArrayArray27[arg0 + 1][arg1] - this.aByteArrayArray28[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray27[arg0][arg1 + 1] - this.aByteArrayArray28[arg0][arg1 + 1]) * (super.anInt9493 - local342) + (this.aByteArrayArray27[arg0 + 1][arg1 + 1] - this.aByteArrayArray28[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt9493 - local527) + local1126 * local527 >> super.anInt9494 * 2;
			}
			local1079 = (arg0 << super.anInt9494) + local342;
			local1126 = (arg1 << super.anInt9494) + local527;
			local888.aShortArray128[local244] = (short) local342;
			local888.aShortArray127[local244] = (short) local527;
			local888.aShortArray130[local244] = (short) (this.sa(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass5_Sub2_18.anInterface4_14.method6712(arg8[local244]).aBoolean461) {
				local888.anIntArray550[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray129[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray550[local244] = Static132.method2302(Static554.method7343(arg6[local244] >> 8, local958), local1226, arg10);
				if (arg7 != null) {
					local888.anIntArray550[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray550[local244] = 0;
			} else {
				local888.anIntArray550[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort91; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass5_Sub2_18.anInterface4_14.method6712(arg8[local527 * 3]).aBoolean461) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray551 = new int[local888.aShort91];
		}
		if (local1296) {
			local888.aShortArray131 = new short[local888.aShort91];
			local888.aShortArray126 = new short[local888.aShort91];
		}
		for (local958 = 0; local958 < local888.aShort91; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray551[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass5_Sub2_18.anInterface4_14.method6712(local1384).aBoolean461) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass5_Sub2_18.anInterface4_14.method6712(local1384).aBoolean461) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass5_Sub2_18.anInterface4_14.method6712(local1384).aBoolean461) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray131[local958] = (short) local1384;
					local888.aShortArray126[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass5_Sub2_18.anInterface4_14.method6712(local1384).aBoolean461) {
							local888.anIntArray550[local1079] = Static457.anIntArray710[Static484.method7144(this.aClass5_Sub2_18.anInterface4_14.method6712(local1384).aShort111 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass5_Sub2_18.anInterface4_14.method6712(local1384).aBoolean461) {
							local888.anIntArray550[local1126] = Static457.anIntArray710[Static484.method7144(this.aClass5_Sub2_18.anInterface4_14.method6712(local1384).aShort111 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass5_Sub2_18.anInterface4_14.method6712(local1384).aBoolean461) {
							local888.anIntArray550[local1226] = Static457.anIntArray710[Static484.method7144(this.aClass5_Sub2_18.anInterface4_14.method6712(local1384).aShort111 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray131[local958] = -1;
				}
			}
		}
		this.aClass210ArrayArray3[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)V")
	public abstract void method7830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(IILclient!w;)Lclient!w;")
	@Override
	public final Class3_Sub10_Sub18 c(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub10_Sub18 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method7826(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public final void method7828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class205_Sub2 local3 = this.aClass5_Sub2_18.aClass205_Sub2_9;
		this.anInt8944 = -1;
		this.anInt8950 = local3.anInt8998;
		this.anInt8939 = local3.anInt9009;
		this.anInt8942 = local3.anInt9006;
		this.anInt8945 = local3.anInt9000;
		this.anInt8941 = local3.anInt9001;
		this.anInt8952 = local3.anInt9007;
		this.anInt8949 = local3.anInt9002;
		this.anInt8940 = local3.anInt8999;
		this.anInt8947 = local3.anInt9004;
		this.anInt8946 = local3.anInt9003;
		this.anInt8951 = local3.anInt9008;
		this.anInt8948 = local3.anInt9005;
	}

	@OriginalMember(owner = "client!gw", name = "ba", descriptor = "()V")
	@Override
	public final void ba() {
		this.aByteArrayArray27 = null;
		this.aByteArrayArray28 = null;
	}

	@OriginalMember(owner = "client!gw", name = "FA", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public final void FA(@OriginalArg(0) Class3_Sub10_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!gw", name = "JA", descriptor = "(II)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray84[arg0][arg1];
	}

	@OriginalMember(owner = "client!gw", name = "EA", descriptor = "(III)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray28[arg0][arg1] < arg2) {
			this.aByteArrayArray28[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!w;IIIIZ)Z")
	@Override
	public final boolean method7831(@OriginalArg(0) Class3_Sub10_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!gw", name = "sa", descriptor = "(II)I")
	@Override
	public final int sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> super.anInt9494;
		@Pc(9) int local9 = arg1 >> super.anInt9494;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt9491 - 1 || local9 > super.anInt9492 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & super.anInt9493 - 1;
		@Pc(41) int local41 = arg1 & super.anInt9493 - 1;
		@Pc(67) int local67 = this.anIntArrayArray84[local4][local9] * (super.anInt9493 - local34) + this.anIntArrayArray84[local4 + 1][local9] * local34 >> super.anInt9494;
		@Pc(97) int local97 = this.anIntArrayArray84[local4][local9 + 1] * (super.anInt9493 - local34) + this.anIntArrayArray84[local4 + 1][local9 + 1] * local34 >> super.anInt9494;
		return local67 * (super.anInt9493 - local41) + local97 * local41 >> super.anInt9494;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public final void method7833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass104ArrayArray3 == null) {
			this.aClass104ArrayArray3 = new Class104[super.anInt9491][super.anInt9492];
			this.aClass74ArrayArray3 = new Class74[super.anInt9491][super.anInt9492];
		} else if (this.aClass156ArrayArray3 != null) {
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
				if (local64 != 0 && local64 != super.anInt9493 || local70 != 0 && local70 != super.anInt9493) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class74 local95 = new Class74();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort37 = local99;
			local95.aShortArray54 = new short[local99];
			local95.aShortArray61 = new short[local99];
			local95.aShortArray55 = new short[local99];
			local95.aShortArray59 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray54[local124] = (short) (this.aByteArrayArray27[arg0][arg1] - this.aByteArrayArray28[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt9493) {
					local95.aShortArray54[local124] = (short) (this.aByteArrayArray27[arg0][arg1 + 1] - this.aByteArrayArray28[arg0][arg1 + 1]);
				} else if (local129 == super.anInt9493 && local133 == super.anInt9493) {
					local95.aShortArray54[local124] = (short) (this.aByteArrayArray27[arg0 + 1][arg1 + 1] - this.aByteArrayArray28[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt9493 && local133 == 0) {
					local95.aShortArray54[local124] = (short) (this.aByteArrayArray27[arg0 + 1][arg1] - this.aByteArrayArray28[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray27[arg0][arg1] - this.aByteArrayArray28[arg0][arg1]) * (super.anInt9493 - local129) + (this.aByteArrayArray27[arg0 + 1][arg1] - this.aByteArrayArray28[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray27[arg0][arg1 + 1] - this.aByteArrayArray28[arg0][arg1 + 1]) * (super.anInt9493 - local129) + (this.aByteArrayArray27[arg0 + 1][arg1 + 1] - this.aByteArrayArray28[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray54[local124] = (short) (local288 * (super.anInt9493 - local133) + local335 * local133 >> super.anInt9494 * 2);
				}
				local288 = (arg0 << super.anInt9494) + local129;
				local335 = (arg1 << super.anInt9494) + local133;
				local95.aShortArray61[local124] = (short) local129;
				local95.aShortArray59[local124] = (short) local133;
				local95.aShortArray55[local124] = (short) (this.sa(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray54[local124] < 2) {
					local95.aShortArray54[local124] = 2;
				}
			}
			@Pc(415) boolean local415 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass5_Sub2_18.anInterface4_14.method6712(arg11[local288]).aBoolean461) {
					local415 = true;
				}
			}
			local95.anIntArray252 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray253 = new int[local133];
			}
			local95.aShortArray57 = new short[local133];
			local95.aShortArray62 = new short[local133];
			local95.aShortArray60 = new short[local133];
			if (local415) {
				local95.aShortArray56 = new short[local133];
				local95.aShortArray58 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray252[local95.aShort38] = Static484.method7144(arg9[local335]);
					} else {
						local95.anIntArray252[local95.aShort38] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray253[local95.aShort38] = -1;
						} else {
							local95.anIntArray253[local95.aShort38] = Static484.method7144(arg10[local335]);
						}
					}
					local95.aShortArray57[local95.aShort38] = (short) arg6[local335];
					local95.aShortArray62[local95.aShort38] = (short) arg7[local335];
					local95.aShortArray60[local95.aShort38] = (short) arg8[local335];
					if (local415) {
						if (arg11[local335] == -1 || this.aClass5_Sub2_18.anInterface4_14.method6712(arg11[local335]).aBoolean461) {
							local95.aShortArray56[local95.aShort38] = -1;
						} else {
							local95.aShortArray56[local95.aShort38] = (short) arg11[local335];
							local95.aShortArray58[local95.aShort38] = (short) arg12[local335];
						}
					}
					local95.aShort38++;
				}
			}
			this.aClass74ArrayArray3[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(644) Class104 local644 = new Class104();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local644.anInt3150 = Static40.method947(this.aByteArrayArray27[arg0][arg1] - this.aByteArrayArray28[arg0][arg1], Static484.method7144(arg10[0]));
				if (local64 == -1) {
					local644.aByte34 = (byte) (local644.aByte34 | 0x2);
				}
			}
			if (this.anIntArrayArray84[arg0][arg1] == this.anIntArrayArray84[arg0 + 1][arg1] && this.anIntArrayArray84[arg0][arg1] == this.anIntArrayArray84[arg0 + 1][arg1 + 1] && this.anIntArrayArray84[arg0][arg1] == this.anIntArrayArray84[arg0][arg1 + 1]) {
				local644.aByte34 = (byte) (local644.aByte34 | 0x1);
			}
			if (local70 == -1 || (local644.aByte34 & 0x2) != 0 || this.aClass5_Sub2_18.anInterface4_14.method6712(local70).aBoolean461) {
				@Pc(845) short local845 = Static484.method7144(local64);
				local644.aShort63 = (short) Static40.method947(this.aByteArrayArray27[arg0][arg1] - this.aByteArrayArray28[arg0][arg1], local845);
				local644.aShort62 = (short) Static40.method947(this.aByteArrayArray27[arg0 + 1][arg1] - this.aByteArrayArray28[arg0 + 1][arg1], local845);
				local644.aShort59 = (short) Static40.method947(this.aByteArrayArray27[arg0 + 1][arg1 + 1] - this.aByteArrayArray28[arg0 + 1][arg1 + 1], local845);
				local644.aShort60 = (short) Static40.method947(this.aByteArrayArray27[arg0][arg1 + 1] - this.aByteArrayArray28[arg0][arg1 + 1], local845);
				local644.aShort61 = -1;
			} else {
				local644.aShort63 = (short) (this.aByteArrayArray27[arg0][arg1] - this.aByteArrayArray28[arg0][arg1]);
				local644.aShort62 = (short) (this.aByteArrayArray27[arg0 + 1][arg1] - this.aByteArrayArray28[arg0 + 1][arg1]);
				local644.aShort59 = (short) (this.aByteArrayArray27[arg0 + 1][arg1 + 1] - this.aByteArrayArray28[arg0 + 1][arg1 + 1]);
				local644.aShort60 = (short) (this.aByteArrayArray27[arg0][arg1 + 1] - this.aByteArrayArray28[arg0][arg1 + 1]);
				local644.aShort61 = (short) local70;
			}
			this.aClass104ArrayArray3[arg0][arg1] = local644;
		}
	}
}
