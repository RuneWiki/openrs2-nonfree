import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public abstract class Class46_Sub1 extends Class46 {

	@OriginalMember(owner = "client!gw", name = "m", descriptor = "[[Lclient!vca;")
	protected Class326[][] aClass326ArrayArray3;

	@OriginalMember(owner = "client!gw", name = "n", descriptor = "I")
	protected int anInt7660;

	@OriginalMember(owner = "client!gw", name = "o", descriptor = "I")
	protected int anInt7661;

	@OriginalMember(owner = "client!gw", name = "p", descriptor = "I")
	protected int anInt7662;

	@OriginalMember(owner = "client!gw", name = "q", descriptor = "[[Lclient!tl;")
	protected Class308[][] aClass308ArrayArray3;

	@OriginalMember(owner = "client!gw", name = "r", descriptor = "[[Lclient!og;")
	protected Class232[][] aClass232ArrayArray3;

	@OriginalMember(owner = "client!gw", name = "s", descriptor = "[[Lclient!fh;")
	protected Class105[][] aClass105ArrayArray3;

	@OriginalMember(owner = "client!gw", name = "t", descriptor = "I")
	protected int anInt7663;

	@OriginalMember(owner = "client!gw", name = "u", descriptor = "I")
	protected int anInt7664;

	@OriginalMember(owner = "client!gw", name = "v", descriptor = "I")
	protected int anInt7665;

	@OriginalMember(owner = "client!gw", name = "x", descriptor = "I")
	protected int anInt7666;

	@OriginalMember(owner = "client!gw", name = "y", descriptor = "I")
	protected int anInt7667;

	@OriginalMember(owner = "client!gw", name = "A", descriptor = "I")
	protected int anInt7669;

	@OriginalMember(owner = "client!gw", name = "B", descriptor = "I")
	protected int anInt7670;

	@OriginalMember(owner = "client!gw", name = "C", descriptor = "I")
	protected int anInt7671;

	@OriginalMember(owner = "client!gw", name = "D", descriptor = "I")
	protected int anInt7672;

	@OriginalMember(owner = "client!gw", name = "H", descriptor = "I")
	protected int anInt7673 = -1;

	@OriginalMember(owner = "client!gw", name = "E", descriptor = "Lclient!fv;")
	protected final Class90_Sub2 aClass90_Sub2_15;

	@OriginalMember(owner = "client!gw", name = "z", descriptor = "I")
	private final int anInt7668;

	@OriginalMember(owner = "client!gw", name = "G", descriptor = "[[I")
	public final int[][] anIntArrayArray66;

	@OriginalMember(owner = "client!gw", name = "w", descriptor = "[[B")
	private byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!gw", name = "F", descriptor = "[[B")
	private byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lclient!fv;IIII[[I[[II)V")
	public Class46_Sub1(@OriginalArg(0) Class90_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass90_Sub2_15 = arg0;
		this.anInt7668 = arg2;
		this.anIntArrayArray66 = arg5;
		this.aByteArrayArray22 = new byte[arg3 + 1][arg4 + 1];
		@Pc(31) int local31 = this.aClass90_Sub2_15.anInt8502 >> 9;
		for (@Pc(33) int local33 = 1; local33 < arg4; local33++) {
			for (@Pc(36) int local36 = 1; local36 < arg3; local36++) {
				@Pc(55) int local55 = arg6[local36 + 1][local33] - arg6[local36 - 1][local33];
				@Pc(71) int local71 = arg6[local36][local33 + 1] - arg6[local36][local33 - 1];
				@Pc(86) int local86 = (int) Math.sqrt((double) (local55 * local55 + arg7 * 512 + local71 * local71));
				@Pc(92) int local92 = (local55 << 8) / local86;
				@Pc(98) int local98 = arg7 * -512 / local86;
				@Pc(104) int local104 = (local71 << 8) / local86;
				@Pc(126) int local126 = local31 + (this.aClass90_Sub2_15.anInt8493 * local92 + this.aClass90_Sub2_15.anInt8501 * local98 + this.aClass90_Sub2_15.anInt8487 * local104 >> 17);
				local126 >>= 0x1;
				if (local126 < 2) {
					local126 = 2;
				} else if (local126 > 126) {
					local126 = 126;
				}
				this.aByteArrayArray22[local36][local33] = (byte) local126;
			}
		}
		this.aByteArrayArray23 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!w;IIIIZ)Z")
	@Override
	public final boolean method7968(@OriginalArg(0) Class6_Sub5_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(IILclient!w;)Lclient!w;")
	@Override
	public final Class6_Sub5_Sub10 c(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub5_Sub10 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method7967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class93_Sub1 local3 = this.aClass90_Sub2_15.aClass93_Sub1_8;
		this.anInt7673 = -1;
		this.anInt7669 = local3.anInt2522;
		this.anInt7667 = local3.anInt2524;
		this.anInt7670 = local3.anInt2525;
		this.anInt7663 = local3.anInt2518;
		this.anInt7672 = local3.anInt2516;
		this.anInt7660 = local3.anInt2519;
		this.anInt7661 = local3.anInt2521;
		this.anInt7662 = local3.anInt2517;
		this.anInt7671 = local3.anInt2527;
		this.anInt7665 = local3.anInt2523;
		this.anInt7666 = local3.anInt2520;
		this.anInt7664 = local3.anInt2526;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!ld;[I)V")
	@Override
	public final void method7965(@OriginalArg(0) Class6_Sub25 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!gw", name = "FA", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public final void FA(@OriginalArg(0) Class6_Sub5_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!gw", name = "ba", descriptor = "()V")
	@Override
	public final void ba() {
		this.aByteArrayArray22 = null;
		this.aByteArrayArray23 = null;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)V")
	public abstract void method7970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method7964(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!gw", name = "aa", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public final void aa(@OriginalArg(0) Class6_Sub5_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)Z")
	protected final boolean method6115(@OriginalArg(0) int arg0) {
		if ((this.anInt7668 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!gw", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public final void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass308ArrayArray3 == null) {
			this.aClass308ArrayArray3 = new Class308[super.anInt9997][super.anInt9995];
			this.aClass232ArrayArray3 = new Class232[super.anInt9997][super.anInt9995];
		} else if (this.aClass105ArrayArray3 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static246.anIntArray653[Static32.method511(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static246.anIntArray653[Static32.method511(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == super.anInt9998 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt9998 && arg4[local116] == super.anInt9998) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt9998) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt9998 && arg2[local244] != arg2[0] - super.anInt9998) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt9998 && arg4[local244] != arg4[0] - super.anInt9998) {
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
			@Pc(334) Class308 local334 = new Class308();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt8713 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte91 = (byte) (local334.aByte91 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray66[arg0][arg1] == this.anIntArrayArray66[arg0 + 1][arg1] && this.anIntArrayArray66[arg0][arg1] == this.anIntArrayArray66[arg0 + 1][arg1 + 1] && this.anIntArrayArray66[arg0][arg1] == this.anIntArrayArray66[arg0][arg1 + 1]) {
				local334.aByte91 = (byte) (local334.aByte91 | 0x1);
			}
			if (local342 == -1 || (local334.aByte91 & 0x2) != 0 || this.aClass90_Sub2_15.anInterface2_15.method3085(local342).aBoolean231) {
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
				local334.anInt8715 = Static125.method1935(Static588.method6114(arg6[local104] >> 8, this.aByteArrayArray22[arg0][arg1] - this.aByteArrayArray23[arg0][arg1]), arg10, local527);
				if (local334.anInt8713 != 0) {
					local334.anInt8715 |= this.aByteArrayArray23[arg0][arg1] + 255 - this.aByteArrayArray22[arg0][arg1] << 25;
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
				local334.anInt8717 = Static125.method1935(Static588.method6114(arg6[local106] >> 8, this.aByteArrayArray22[arg0 + 1][arg1] - this.aByteArrayArray23[arg0 + 1][arg1]), arg10, local527);
				if (local334.anInt8713 != 0) {
					local334.anInt8717 |= this.aByteArrayArray23[arg0 + 1][arg1] + 255 - this.aByteArrayArray22[arg0 + 1][arg1] << 25;
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
				local334.anInt8716 = Static125.method1935(Static588.method6114(arg6[local108] >> 8, this.aByteArrayArray22[arg0 + 1][arg1 + 1] - this.aByteArrayArray23[arg0 + 1][arg1 + 1]), arg10, local527);
				if (local334.anInt8713 != 0) {
					local334.anInt8716 |= this.aByteArrayArray23[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray22[arg0 + 1][arg1 + 1] << 25;
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
				local334.anInt8714 = Static125.method1935(Static588.method6114(arg6[local110] >> 8, this.aByteArrayArray22[arg0][arg1 + 1] - this.aByteArrayArray23[arg0][arg1 + 1]), arg10, local527);
				if (local334.anInt8713 != 0) {
					local334.anInt8714 |= this.aByteArrayArray23[arg0][arg1 + 1] + 255 - this.aByteArrayArray22[arg0][arg1 + 1] << 25;
				}
				local334.aShort106 = -1;
			} else {
				local334.anInt8715 = this.aByteArrayArray22[arg0][arg1] - this.aByteArrayArray23[arg0][arg1];
				local334.anInt8717 = this.aByteArrayArray22[arg0 + 1][arg1] - this.aByteArrayArray23[arg0 + 1][arg1];
				local334.anInt8716 = this.aByteArrayArray22[arg0 + 1][arg1 + 1] - this.aByteArrayArray23[arg0 + 1][arg1 + 1];
				local334.anInt8714 = this.aByteArrayArray22[arg0][arg1 + 1] - this.aByteArrayArray23[arg0][arg1 + 1];
				local334.aShort106 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort109 = (short) arg5[local108];
				local334.aShort108 = (short) arg5[local110];
				local334.aShort107 = (short) arg5[local106];
				local334.aShort110 = (short) arg5[local104];
			}
			this.aClass308ArrayArray3[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class232 local888 = new Class232();
		local888.aShort87 = (short) arg2.length;
		local888.aShort88 = (short) (arg2.length / 3);
		local888.aShortArray101 = new short[local888.aShort87];
		local888.aShortArray105 = new short[local888.aShort87];
		local888.aShortArray104 = new short[local888.aShort87];
		local888.anIntArray480 = new int[local888.aShort87];
		if (arg5 != null) {
			local888.aShortArray106 = new short[local888.aShort87];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort87; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray22[arg0][arg1] - this.aByteArrayArray23[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt9998) {
				local958 = this.aByteArrayArray22[arg0][arg1 + 1] - this.aByteArrayArray23[arg0][arg1 + 1];
			} else if (local342 == super.anInt9998 && local527 == super.anInt9998) {
				local958 = this.aByteArrayArray22[arg0 + 1][arg1 + 1] - this.aByteArrayArray23[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt9998 && local527 == 0) {
				local958 = this.aByteArrayArray22[arg0 + 1][arg1] - this.aByteArrayArray23[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray22[arg0][arg1] - this.aByteArrayArray23[arg0][arg1]) * (super.anInt9998 - local342) + (this.aByteArrayArray22[arg0 + 1][arg1] - this.aByteArrayArray23[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray22[arg0][arg1 + 1] - this.aByteArrayArray23[arg0][arg1 + 1]) * (super.anInt9998 - local342) + (this.aByteArrayArray22[arg0 + 1][arg1 + 1] - this.aByteArrayArray23[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt9998 - local527) + local1126 * local527 >> super.anInt10000 * 2;
			}
			local1079 = (arg0 << super.anInt10000) + local342;
			local1126 = (arg1 << super.anInt10000) + local527;
			local888.aShortArray101[local244] = (short) local342;
			local888.aShortArray104[local244] = (short) local527;
			local888.aShortArray105[local244] = (short) (this.sa(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass90_Sub2_15.anInterface2_15.method3085(arg8[local244]).aBoolean231) {
				local888.anIntArray480[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray106[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray480[local244] = Static125.method1935(Static588.method6114(arg6[local244] >> 8, local958), arg10, local1226);
				if (arg7 != null) {
					local888.anIntArray480[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray480[local244] = 0;
			} else {
				local888.anIntArray480[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort88; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass90_Sub2_15.anInterface2_15.method3085(arg8[local527 * 3]).aBoolean231) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray479 = new int[local888.aShort88];
		}
		if (local1296) {
			local888.aShortArray103 = new short[local888.aShort88];
			local888.aShortArray102 = new short[local888.aShort88];
		}
		for (local958 = 0; local958 < local888.aShort88; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray479[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass90_Sub2_15.anInterface2_15.method3085(local1384).aBoolean231) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass90_Sub2_15.anInterface2_15.method3085(local1384).aBoolean231) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass90_Sub2_15.anInterface2_15.method3085(local1384).aBoolean231) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray103[local958] = (short) local1384;
					local888.aShortArray102[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass90_Sub2_15.anInterface2_15.method3085(local1384).aBoolean231) {
							local888.anIntArray480[local1079] = Static246.anIntArray653[Static32.method511(this.aClass90_Sub2_15.anInterface2_15.method3085(local1384).aShort55 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass90_Sub2_15.anInterface2_15.method3085(local1384).aBoolean231) {
							local888.anIntArray480[local1126] = Static246.anIntArray653[Static32.method511(this.aClass90_Sub2_15.anInterface2_15.method3085(local1384).aShort55 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass90_Sub2_15.anInterface2_15.method3085(local1384).aBoolean231) {
							local888.anIntArray480[local1226] = Static246.anIntArray653[Static32.method511(this.aClass90_Sub2_15.anInterface2_15.method3085(local1384).aShort55 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray103[local958] = -1;
				}
			}
		}
		this.aClass232ArrayArray3[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!gw", name = "EA", descriptor = "(III)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray23[arg0][arg1] < arg2) {
			this.aByteArrayArray23[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!gw", name = "JA", descriptor = "(II)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray66[arg0][arg1];
	}

	@OriginalMember(owner = "client!gw", name = "sa", descriptor = "(II)I")
	@Override
	public final int sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> super.anInt10000;
		@Pc(9) int local9 = arg1 >> super.anInt10000;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt9997 - 1 || local9 > super.anInt9995 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & super.anInt9998 - 1;
		@Pc(41) int local41 = arg1 & super.anInt9998 - 1;
		@Pc(67) int local67 = this.anIntArrayArray66[local4][local9] * (super.anInt9998 - local34) + this.anIntArrayArray66[local4 + 1][local9] * local34 >> super.anInt10000;
		@Pc(97) int local97 = this.anIntArrayArray66[local4][local9 + 1] * (super.anInt9998 - local34) + this.anIntArrayArray66[local4 + 1][local9 + 1] * local34 >> super.anInt10000;
		return local67 * (super.anInt9998 - local41) + local97 * local41 >> super.anInt10000;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public final void method7971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass105ArrayArray3 == null) {
			this.aClass105ArrayArray3 = new Class105[super.anInt9997][super.anInt9995];
			this.aClass326ArrayArray3 = new Class326[super.anInt9997][super.anInt9995];
		} else if (this.aClass308ArrayArray3 != null) {
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
				if (local64 != 0 && local64 != super.anInt9998 || local70 != 0 && local70 != super.anInt9998) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class326 local95 = new Class326();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort118 = local99;
			local95.aShortArray149 = new short[local99];
			local95.aShortArray147 = new short[local99];
			local95.aShortArray154 = new short[local99];
			local95.aShortArray153 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray149[local124] = (short) (this.aByteArrayArray22[arg0][arg1] - this.aByteArrayArray23[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt9998) {
					local95.aShortArray149[local124] = (short) (this.aByteArrayArray22[arg0][arg1 + 1] - this.aByteArrayArray23[arg0][arg1 + 1]);
				} else if (local129 == super.anInt9998 && local133 == super.anInt9998) {
					local95.aShortArray149[local124] = (short) (this.aByteArrayArray22[arg0 + 1][arg1 + 1] - this.aByteArrayArray23[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt9998 && local133 == 0) {
					local95.aShortArray149[local124] = (short) (this.aByteArrayArray22[arg0 + 1][arg1] - this.aByteArrayArray23[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray22[arg0][arg1] - this.aByteArrayArray23[arg0][arg1]) * (super.anInt9998 - local129) + (this.aByteArrayArray22[arg0 + 1][arg1] - this.aByteArrayArray23[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray22[arg0][arg1 + 1] - this.aByteArrayArray23[arg0][arg1 + 1]) * (super.anInt9998 - local129) + (this.aByteArrayArray22[arg0 + 1][arg1 + 1] - this.aByteArrayArray23[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray149[local124] = (short) (local288 * (super.anInt9998 - local133) + local335 * local133 >> super.anInt10000 * 2);
				}
				local288 = (arg0 << super.anInt10000) + local129;
				local335 = (arg1 << super.anInt10000) + local133;
				local95.aShortArray147[local124] = (short) local129;
				local95.aShortArray153[local124] = (short) local133;
				local95.aShortArray154[local124] = (short) (this.sa(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray149[local124] < 2) {
					local95.aShortArray149[local124] = 2;
				}
			}
			@Pc(415) boolean local415 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass90_Sub2_15.anInterface2_15.method3085(arg11[local288]).aBoolean231) {
					local415 = true;
				}
			}
			local95.anIntArray654 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray655 = new int[local133];
			}
			local95.aShortArray151 = new short[local133];
			local95.aShortArray152 = new short[local133];
			local95.aShortArray148 = new short[local133];
			if (local415) {
				local95.aShortArray150 = new short[local133];
				local95.aShortArray146 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray654[local95.aShort119] = Static32.method511(arg9[local335]);
					} else {
						local95.anIntArray654[local95.aShort119] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray655[local95.aShort119] = -1;
						} else {
							local95.anIntArray655[local95.aShort119] = Static32.method511(arg10[local335]);
						}
					}
					local95.aShortArray151[local95.aShort119] = (short) arg6[local335];
					local95.aShortArray152[local95.aShort119] = (short) arg7[local335];
					local95.aShortArray148[local95.aShort119] = (short) arg8[local335];
					if (local415) {
						if (arg11[local335] == -1 || this.aClass90_Sub2_15.anInterface2_15.method3085(arg11[local335]).aBoolean231) {
							local95.aShortArray150[local95.aShort119] = -1;
						} else {
							local95.aShortArray150[local95.aShort119] = (short) arg11[local335];
							local95.aShortArray146[local95.aShort119] = (short) arg12[local335];
						}
					}
					local95.aShort119++;
				}
			}
			this.aClass326ArrayArray3[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(644) Class105 local644 = new Class105();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local644.anInt2791 = Static222.method3512(this.aByteArrayArray22[arg0][arg1] - this.aByteArrayArray23[arg0][arg1], Static32.method511(arg10[0]));
				if (local64 == -1) {
					local644.aByte33 = (byte) (local644.aByte33 | 0x2);
				}
			}
			if (this.anIntArrayArray66[arg0][arg1] == this.anIntArrayArray66[arg0 + 1][arg1] && this.anIntArrayArray66[arg0][arg1] == this.anIntArrayArray66[arg0 + 1][arg1 + 1] && this.anIntArrayArray66[arg0][arg1] == this.anIntArrayArray66[arg0][arg1 + 1]) {
				local644.aByte33 = (byte) (local644.aByte33 | 0x1);
			}
			if (local70 == -1 || (local644.aByte33 & 0x2) != 0 || this.aClass90_Sub2_15.anInterface2_15.method3085(local70).aBoolean231) {
				@Pc(845) short local845 = Static32.method511(local64);
				local644.aShort54 = (short) Static222.method3512(this.aByteArrayArray22[arg0][arg1] - this.aByteArrayArray23[arg0][arg1], local845);
				local644.aShort50 = (short) Static222.method3512(this.aByteArrayArray22[arg0 + 1][arg1] - this.aByteArrayArray23[arg0 + 1][arg1], local845);
				local644.aShort51 = (short) Static222.method3512(this.aByteArrayArray22[arg0 + 1][arg1 + 1] - this.aByteArrayArray23[arg0 + 1][arg1 + 1], local845);
				local644.aShort52 = (short) Static222.method3512(this.aByteArrayArray22[arg0][arg1 + 1] - this.aByteArrayArray23[arg0][arg1 + 1], local845);
				local644.aShort53 = -1;
			} else {
				local644.aShort54 = (short) (this.aByteArrayArray22[arg0][arg1] - this.aByteArrayArray23[arg0][arg1]);
				local644.aShort50 = (short) (this.aByteArrayArray22[arg0 + 1][arg1] - this.aByteArrayArray23[arg0 + 1][arg1]);
				local644.aShort51 = (short) (this.aByteArrayArray22[arg0 + 1][arg1 + 1] - this.aByteArrayArray23[arg0 + 1][arg1 + 1]);
				local644.aShort52 = (short) (this.aByteArrayArray22[arg0][arg1 + 1] - this.aByteArrayArray23[arg0][arg1 + 1]);
				local644.aShort53 = (short) local70;
			}
			this.aClass105ArrayArray3[arg0][arg1] = local644;
		}
	}
}
