import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public abstract class Class205_Sub2 extends Class205 {

	@OriginalMember(owner = "client!wp", name = "k", descriptor = "[[Lclient!cw;")
	protected Class57[][] aClass57ArrayArray3;

	@OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
	protected int anInt7544;

	@OriginalMember(owner = "client!wp", name = "m", descriptor = "I")
	protected int anInt7545;

	@OriginalMember(owner = "client!wp", name = "n", descriptor = "I")
	protected int anInt7546;

	@OriginalMember(owner = "client!wp", name = "p", descriptor = "I")
	protected int anInt7547;

	@OriginalMember(owner = "client!wp", name = "r", descriptor = "I")
	protected int anInt7549;

	@OriginalMember(owner = "client!wp", name = "s", descriptor = "I")
	protected int anInt7550;

	@OriginalMember(owner = "client!wp", name = "t", descriptor = "I")
	protected int anInt7551;

	@OriginalMember(owner = "client!wp", name = "u", descriptor = "[[Lclient!gs;")
	protected Class112[][] aClass112ArrayArray3;

	@OriginalMember(owner = "client!wp", name = "v", descriptor = "I")
	protected int anInt7552;

	@OriginalMember(owner = "client!wp", name = "w", descriptor = "I")
	protected int anInt7553;

	@OriginalMember(owner = "client!wp", name = "x", descriptor = "[[Lclient!hf;")
	protected Class121[][] aClass121ArrayArray3;

	@OriginalMember(owner = "client!wp", name = "y", descriptor = "I")
	protected int anInt7554;

	@OriginalMember(owner = "client!wp", name = "z", descriptor = "[[Lclient!vca;")
	protected Class298[][] aClass298ArrayArray3;

	@OriginalMember(owner = "client!wp", name = "B", descriptor = "I")
	protected int anInt7555;

	@OriginalMember(owner = "client!wp", name = "D", descriptor = "I")
	protected int anInt7556;

	@OriginalMember(owner = "client!wp", name = "j", descriptor = "I")
	protected int anInt7543 = -1;

	@OriginalMember(owner = "client!wp", name = "i", descriptor = "Lclient!jba;")
	protected final Class122_Sub1 aClass122_Sub1_16;

	@OriginalMember(owner = "client!wp", name = "q", descriptor = "I")
	private final int anInt7548;

	@OriginalMember(owner = "client!wp", name = "E", descriptor = "[[I")
	public final int[][] anIntArrayArray98;

	@OriginalMember(owner = "client!wp", name = "C", descriptor = "[[B")
	private byte[][] aByteArrayArray26;

	@OriginalMember(owner = "client!wp", name = "o", descriptor = "[[B")
	private byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lclient!jba;IIII[[I[[II)V")
	public Class205_Sub2(@OriginalArg(0) Class122_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass122_Sub1_16 = arg0;
		this.anInt7548 = arg2;
		this.anIntArrayArray98 = arg5;
		this.aByteArrayArray26 = new byte[arg3 + 1][arg4 + 1];
		@Pc(31) int local31 = this.aClass122_Sub1_16.anInt8848 >> 9;
		for (@Pc(33) int local33 = 1; local33 < arg4; local33++) {
			for (@Pc(36) int local36 = 1; local36 < arg3; local36++) {
				@Pc(55) int local55 = arg6[local36 + 1][local33] - arg6[local36 - 1][local33];
				@Pc(71) int local71 = arg6[local36][local33 + 1] - arg6[local36][local33 - 1];
				@Pc(86) int local86 = (int) Math.sqrt((double) (local55 * local55 + arg7 * 512 + local71 * local71));
				@Pc(92) int local92 = (local55 << 8) / local86;
				@Pc(98) int local98 = arg7 * -512 / local86;
				@Pc(104) int local104 = (local71 << 8) / local86;
				@Pc(126) int local126 = local31 + (this.aClass122_Sub1_16.anInt8831 * local92 + this.aClass122_Sub1_16.anInt8835 * local98 + this.aClass122_Sub1_16.anInt8849 * local104 >> 17);
				local126 >>= 0x1;
				if (local126 < 2) {
					local126 = 2;
				} else if (local126 > 126) {
					local126 = 126;
				}
				this.aByteArrayArray26[local36][local33] = (byte) local126;
			}
		}
		this.aByteArrayArray25 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!wp", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public final void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass121ArrayArray3 == null) {
			this.aClass121ArrayArray3 = new Class121[super.anInt8174][super.anInt8177];
			this.aClass57ArrayArray3 = new Class57[super.anInt8174][super.anInt8177];
		} else if (this.aClass112ArrayArray3 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static488.anIntArray759[Static518.method7138(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static488.anIntArray759[Static518.method7138(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == super.anInt8175 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt8175 && arg4[local116] == super.anInt8175) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt8175) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt8175 && arg2[local244] != arg2[0] - super.anInt8175) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt8175 && arg4[local244] != arg4[0] - super.anInt8175) {
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
			@Pc(334) Class121 local334 = new Class121();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt3184 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte49 = (byte) (local334.aByte49 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray98[arg0][arg1] == this.anIntArrayArray98[arg0 + 1][arg1] && this.anIntArrayArray98[arg0][arg1] == this.anIntArrayArray98[arg0 + 1][arg1 + 1] && this.anIntArrayArray98[arg0][arg1] == this.anIntArrayArray98[arg0][arg1 + 1]) {
				local334.aByte49 = (byte) (local334.aByte49 | 0x1);
			}
			if (local342 == -1 || (local334.aByte49 & 0x2) != 0 || this.aClass122_Sub1_16.anInterface8_14.method878(local342).aBoolean446) {
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
				local334.anInt3187 = Static133.method2241(local527, Static559.method6305(arg6[local104] >> 8, this.aByteArrayArray26[arg0][arg1] - this.aByteArrayArray25[arg0][arg1]), arg10);
				if (local334.anInt3184 != 0) {
					local334.anInt3187 |= this.aByteArrayArray25[arg0][arg1] + 255 - this.aByteArrayArray26[arg0][arg1] << 25;
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
				local334.anInt3185 = Static133.method2241(local527, Static559.method6305(arg6[local106] >> 8, this.aByteArrayArray26[arg0 + 1][arg1] - this.aByteArrayArray25[arg0 + 1][arg1]), arg10);
				if (local334.anInt3184 != 0) {
					local334.anInt3185 |= this.aByteArrayArray25[arg0 + 1][arg1] + 255 - this.aByteArrayArray26[arg0 + 1][arg1] << 25;
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
				local334.anInt3188 = Static133.method2241(local527, Static559.method6305(arg6[local108] >> 8, this.aByteArrayArray26[arg0 + 1][arg1 + 1] - this.aByteArrayArray25[arg0 + 1][arg1 + 1]), arg10);
				if (local334.anInt3184 != 0) {
					local334.anInt3188 |= this.aByteArrayArray25[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray26[arg0 + 1][arg1 + 1] << 25;
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
				local334.anInt3186 = Static133.method2241(local527, Static559.method6305(arg6[local110] >> 8, this.aByteArrayArray26[arg0][arg1 + 1] - this.aByteArrayArray25[arg0][arg1 + 1]), arg10);
				if (local334.anInt3184 != 0) {
					local334.anInt3186 |= this.aByteArrayArray25[arg0][arg1 + 1] + 255 - this.aByteArrayArray26[arg0][arg1 + 1] << 25;
				}
				local334.aShort52 = -1;
			} else {
				local334.anInt3187 = this.aByteArrayArray26[arg0][arg1] - this.aByteArrayArray25[arg0][arg1];
				local334.anInt3185 = this.aByteArrayArray26[arg0 + 1][arg1] - this.aByteArrayArray25[arg0 + 1][arg1];
				local334.anInt3188 = this.aByteArrayArray26[arg0 + 1][arg1 + 1] - this.aByteArrayArray25[arg0 + 1][arg1 + 1];
				local334.anInt3186 = this.aByteArrayArray26[arg0][arg1 + 1] - this.aByteArrayArray25[arg0][arg1 + 1];
				local334.aShort52 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort55 = (short) arg5[local108];
				local334.aShort54 = (short) arg5[local110];
				local334.aShort51 = (short) arg5[local106];
				local334.aShort53 = (short) arg5[local104];
			}
			this.aClass121ArrayArray3[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class57 local888 = new Class57();
		local888.aShort6 = (short) arg2.length;
		local888.aShort5 = (short) (arg2.length / 3);
		local888.aShortArray30 = new short[local888.aShort6];
		local888.aShortArray26 = new short[local888.aShort6];
		local888.aShortArray27 = new short[local888.aShort6];
		local888.anIntArray160 = new int[local888.aShort6];
		if (arg5 != null) {
			local888.aShortArray28 = new short[local888.aShort6];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort6; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray26[arg0][arg1] - this.aByteArrayArray25[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt8175) {
				local958 = this.aByteArrayArray26[arg0][arg1 + 1] - this.aByteArrayArray25[arg0][arg1 + 1];
			} else if (local342 == super.anInt8175 && local527 == super.anInt8175) {
				local958 = this.aByteArrayArray26[arg0 + 1][arg1 + 1] - this.aByteArrayArray25[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt8175 && local527 == 0) {
				local958 = this.aByteArrayArray26[arg0 + 1][arg1] - this.aByteArrayArray25[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray26[arg0][arg1] - this.aByteArrayArray25[arg0][arg1]) * (super.anInt8175 - local342) + (this.aByteArrayArray26[arg0 + 1][arg1] - this.aByteArrayArray25[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray26[arg0][arg1 + 1] - this.aByteArrayArray25[arg0][arg1 + 1]) * (super.anInt8175 - local342) + (this.aByteArrayArray26[arg0 + 1][arg1 + 1] - this.aByteArrayArray25[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt8175 - local527) + local1126 * local527 >> super.anInt8176 * 2;
			}
			local1079 = (arg0 << super.anInt8176) + local342;
			local1126 = (arg1 << super.anInt8176) + local527;
			local888.aShortArray30[local244] = (short) local342;
			local888.aShortArray27[local244] = (short) local527;
			local888.aShortArray26[local244] = (short) (this.aa(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass122_Sub1_16.anInterface8_14.method878(arg8[local244]).aBoolean446) {
				local888.anIntArray160[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray28[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray160[local244] = Static133.method2241(local1226, Static559.method6305(arg6[local244] >> 8, local958), arg10);
				if (arg7 != null) {
					local888.anIntArray160[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray160[local244] = 0;
			} else {
				local888.anIntArray160[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort5; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass122_Sub1_16.anInterface8_14.method878(arg8[local527 * 3]).aBoolean446) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray159 = new int[local888.aShort5];
		}
		if (local1296) {
			local888.aShortArray29 = new short[local888.aShort5];
			local888.aShortArray31 = new short[local888.aShort5];
		}
		for (local958 = 0; local958 < local888.aShort5; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray159[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass122_Sub1_16.anInterface8_14.method878(local1384).aBoolean446) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass122_Sub1_16.anInterface8_14.method878(local1384).aBoolean446) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass122_Sub1_16.anInterface8_14.method878(local1384).aBoolean446) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray29[local958] = (short) local1384;
					local888.aShortArray31[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass122_Sub1_16.anInterface8_14.method878(local1384).aBoolean446) {
							local888.anIntArray160[local1079] = Static488.anIntArray759[Static518.method7138(this.aClass122_Sub1_16.anInterface8_14.method878(local1384).aShort100 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass122_Sub1_16.anInterface8_14.method878(local1384).aBoolean446) {
							local888.anIntArray160[local1126] = Static488.anIntArray759[Static518.method7138(this.aClass122_Sub1_16.anInterface8_14.method878(local1384).aShort100 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass122_Sub1_16.anInterface8_14.method878(local1384).aBoolean446) {
							local888.anIntArray160[local1226] = Static488.anIntArray759[Static518.method7138(this.aClass122_Sub1_16.anInterface8_14.method878(local1384).aShort100 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray29[local958] = -1;
				}
			}
		}
		this.aClass57ArrayArray3[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!wp", name = "X", descriptor = "(IILclient!k;)Lclient!k;")
	@Override
	public final Class1_Sub1_Sub9 X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub9 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!wp", name = "Q", descriptor = "(III)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray25[arg0][arg1] < arg2) {
			this.aByteArrayArray25[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!wp", name = "aa", descriptor = "(II)I")
	@Override
	public final int aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> super.anInt8176;
		@Pc(9) int local9 = arg1 >> super.anInt8176;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt8174 - 1 || local9 > super.anInt8177 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & super.anInt8175 - 1;
		@Pc(41) int local41 = arg1 & super.anInt8175 - 1;
		@Pc(67) int local67 = this.anIntArrayArray98[local4][local9] * (super.anInt8175 - local34) + this.anIntArrayArray98[local4 + 1][local9] * local34 >> super.anInt8176;
		@Pc(97) int local97 = this.anIntArrayArray98[local4][local9 + 1] * (super.anInt8175 - local34) + this.anIntArrayArray98[local4 + 1][local9 + 1] * local34 >> super.anInt8176;
		return local67 * (super.anInt8175 - local41) + local97 * local41 >> super.anInt8176;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method6751(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!wp", name = "N", descriptor = "()V")
	@Override
	public final void N() {
		this.aByteArrayArray26 = null;
		this.aByteArrayArray25 = null;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)V")
	public abstract void method6748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!ww;[I)V")
	@Override
	public final void method6747(@OriginalArg(0) Class1_Sub2 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!k;IIIIZ)Z")
	@Override
	public final boolean method6746(@OriginalArg(0) Class1_Sub1_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "F", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public final void F(@OriginalArg(0) Class1_Sub1_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)Z")
	protected final boolean method6306(@OriginalArg(0) int arg0) {
		if ((this.anInt7548 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!wp", name = "ba", descriptor = "(II)I")
	@Override
	public final int ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray98[arg0][arg1];
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public final void method6750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class118_Sub2 local3 = this.aClass122_Sub1_16.aClass118_Sub2_9;
		this.anInt7543 = -1;
		this.anInt7552 = local3.anInt4240;
		this.anInt7551 = local3.anInt4239;
		this.anInt7550 = local3.anInt4235;
		this.anInt7549 = local3.anInt4233;
		this.anInt7556 = local3.anInt4237;
		this.anInt7553 = local3.anInt4236;
		this.anInt7544 = local3.anInt4241;
		this.anInt7555 = local3.anInt4242;
		this.anInt7545 = local3.anInt4238;
		this.anInt7547 = local3.anInt4243;
		this.anInt7554 = local3.anInt4232;
		this.anInt7546 = local3.anInt4234;
	}

	@OriginalMember(owner = "client!wp", name = "ya", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public final void ya(@OriginalArg(0) Class1_Sub1_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public final void method6745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass112ArrayArray3 == null) {
			this.aClass112ArrayArray3 = new Class112[super.anInt8174][super.anInt8177];
			this.aClass298ArrayArray3 = new Class298[super.anInt8174][super.anInt8177];
		} else if (this.aClass121ArrayArray3 != null) {
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
				if (local64 != 0 && local64 != super.anInt8175 || local70 != 0 && local70 != super.anInt8175) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class298 local95 = new Class298();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort133 = local99;
			local95.aShortArray148 = new short[local99];
			local95.aShortArray149 = new short[local99];
			local95.aShortArray146 = new short[local99];
			local95.aShortArray151 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray148[local124] = (short) (this.aByteArrayArray26[arg0][arg1] - this.aByteArrayArray25[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt8175) {
					local95.aShortArray148[local124] = (short) (this.aByteArrayArray26[arg0][arg1 + 1] - this.aByteArrayArray25[arg0][arg1 + 1]);
				} else if (local129 == super.anInt8175 && local133 == super.anInt8175) {
					local95.aShortArray148[local124] = (short) (this.aByteArrayArray26[arg0 + 1][arg1 + 1] - this.aByteArrayArray25[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt8175 && local133 == 0) {
					local95.aShortArray148[local124] = (short) (this.aByteArrayArray26[arg0 + 1][arg1] - this.aByteArrayArray25[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray26[arg0][arg1] - this.aByteArrayArray25[arg0][arg1]) * (super.anInt8175 - local129) + (this.aByteArrayArray26[arg0 + 1][arg1] - this.aByteArrayArray25[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray26[arg0][arg1 + 1] - this.aByteArrayArray25[arg0][arg1 + 1]) * (super.anInt8175 - local129) + (this.aByteArrayArray26[arg0 + 1][arg1 + 1] - this.aByteArrayArray25[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray148[local124] = (short) (local288 * (super.anInt8175 - local133) + local335 * local133 >> super.anInt8176 * 2);
				}
				local288 = (arg0 << super.anInt8176) + local129;
				local335 = (arg1 << super.anInt8176) + local133;
				local95.aShortArray149[local124] = (short) local129;
				local95.aShortArray151[local124] = (short) local133;
				local95.aShortArray146[local124] = (short) (this.aa(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray148[local124] < 2) {
					local95.aShortArray148[local124] = 2;
				}
			}
			@Pc(415) boolean local415 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass122_Sub1_16.anInterface8_14.method878(arg11[local288]).aBoolean446) {
					local415 = true;
				}
			}
			local95.anIntArray774 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray773 = new int[local133];
			}
			local95.aShortArray152 = new short[local133];
			local95.aShortArray153 = new short[local133];
			local95.aShortArray147 = new short[local133];
			if (local415) {
				local95.aShortArray150 = new short[local133];
				local95.aShortArray145 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray774[local95.aShort132] = Static518.method7138(arg9[local335]);
					} else {
						local95.anIntArray774[local95.aShort132] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray773[local95.aShort132] = -1;
						} else {
							local95.anIntArray773[local95.aShort132] = Static518.method7138(arg10[local335]);
						}
					}
					local95.aShortArray152[local95.aShort132] = (short) arg6[local335];
					local95.aShortArray153[local95.aShort132] = (short) arg7[local335];
					local95.aShortArray147[local95.aShort132] = (short) arg8[local335];
					if (local415) {
						if (arg11[local335] == -1 || this.aClass122_Sub1_16.anInterface8_14.method878(arg11[local335]).aBoolean446) {
							local95.aShortArray150[local95.aShort132] = -1;
						} else {
							local95.aShortArray150[local95.aShort132] = (short) arg11[local335];
							local95.aShortArray145[local95.aShort132] = (short) arg12[local335];
						}
					}
					local95.aShort132++;
				}
			}
			this.aClass298ArrayArray3[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(644) Class112 local644 = new Class112();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local644.anInt3029 = Static244.method4186(Static518.method7138(arg10[0]), this.aByteArrayArray26[arg0][arg1] - this.aByteArrayArray25[arg0][arg1]);
				if (local64 == -1) {
					local644.aByte47 = (byte) (local644.aByte47 | 0x2);
				}
			}
			if (this.anIntArrayArray98[arg0][arg1] == this.anIntArrayArray98[arg0 + 1][arg1] && this.anIntArrayArray98[arg0][arg1] == this.anIntArrayArray98[arg0 + 1][arg1 + 1] && this.anIntArrayArray98[arg0][arg1] == this.anIntArrayArray98[arg0][arg1 + 1]) {
				local644.aByte47 = (byte) (local644.aByte47 | 0x1);
			}
			if (local70 == -1 || (local644.aByte47 & 0x2) != 0 || this.aClass122_Sub1_16.anInterface8_14.method878(local70).aBoolean446) {
				@Pc(845) short local845 = Static518.method7138(local64);
				local644.aShort47 = (short) Static244.method4186(local845, this.aByteArrayArray26[arg0][arg1] - this.aByteArrayArray25[arg0][arg1]);
				local644.aShort49 = (short) Static244.method4186(local845, this.aByteArrayArray26[arg0 + 1][arg1] - this.aByteArrayArray25[arg0 + 1][arg1]);
				local644.aShort50 = (short) Static244.method4186(local845, this.aByteArrayArray26[arg0 + 1][arg1 + 1] - this.aByteArrayArray25[arg0 + 1][arg1 + 1]);
				local644.aShort48 = (short) Static244.method4186(local845, this.aByteArrayArray26[arg0][arg1 + 1] - this.aByteArrayArray25[arg0][arg1 + 1]);
				local644.aShort46 = -1;
			} else {
				local644.aShort47 = (short) (this.aByteArrayArray26[arg0][arg1] - this.aByteArrayArray25[arg0][arg1]);
				local644.aShort49 = (short) (this.aByteArrayArray26[arg0 + 1][arg1] - this.aByteArrayArray25[arg0 + 1][arg1]);
				local644.aShort50 = (short) (this.aByteArrayArray26[arg0 + 1][arg1 + 1] - this.aByteArrayArray25[arg0 + 1][arg1 + 1]);
				local644.aShort48 = (short) (this.aByteArrayArray26[arg0][arg1 + 1] - this.aByteArrayArray25[arg0][arg1 + 1]);
				local644.aShort46 = (short) local70;
			}
			this.aClass112ArrayArray3[arg0][arg1] = local644;
		}
	}
}
