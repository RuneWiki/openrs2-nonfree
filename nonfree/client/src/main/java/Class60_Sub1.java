import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public abstract class Class60_Sub1 extends Class60 {

	@OriginalMember(owner = "client!ev", name = "g", descriptor = "I")
	protected int anInt7479;

	@OriginalMember(owner = "client!ev", name = "i", descriptor = "I")
	protected int anInt7481;

	@OriginalMember(owner = "client!ev", name = "j", descriptor = "I")
	protected int anInt7482;

	@OriginalMember(owner = "client!ev", name = "k", descriptor = "[[Lclient!fm;")
	protected Class106[][] aClass106ArrayArray3;

	@OriginalMember(owner = "client!ev", name = "m", descriptor = "I")
	protected int anInt7483;

	@OriginalMember(owner = "client!ev", name = "n", descriptor = "[[Lclient!caa;")
	protected Class39[][] aClass39ArrayArray3;

	@OriginalMember(owner = "client!ev", name = "o", descriptor = "I")
	protected int anInt7484;

	@OriginalMember(owner = "client!ev", name = "p", descriptor = "[[Lclient!oj;")
	protected Class229[][] aClass229ArrayArray3;

	@OriginalMember(owner = "client!ev", name = "q", descriptor = "I")
	protected int anInt7485;

	@OriginalMember(owner = "client!ev", name = "s", descriptor = "I")
	protected int anInt7486;

	@OriginalMember(owner = "client!ev", name = "t", descriptor = "I")
	protected int anInt7487;

	@OriginalMember(owner = "client!ev", name = "u", descriptor = "[[Lclient!wd;")
	protected Class341[][] aClass341ArrayArray3;

	@OriginalMember(owner = "client!ev", name = "v", descriptor = "I")
	protected int anInt7488;

	@OriginalMember(owner = "client!ev", name = "x", descriptor = "I")
	protected int anInt7489;

	@OriginalMember(owner = "client!ev", name = "z", descriptor = "I")
	protected int anInt7490;

	@OriginalMember(owner = "client!ev", name = "B", descriptor = "I")
	protected int anInt7492;

	@OriginalMember(owner = "client!ev", name = "A", descriptor = "I")
	protected int anInt7491 = -1;

	@OriginalMember(owner = "client!ev", name = "r", descriptor = "Lclient!kb;")
	protected final Class121_Sub1 aClass121_Sub1_15;

	@OriginalMember(owner = "client!ev", name = "h", descriptor = "I")
	private final int anInt7480;

	@OriginalMember(owner = "client!ev", name = "y", descriptor = "[[I")
	public final int[][] anIntArrayArray76;

	@OriginalMember(owner = "client!ev", name = "w", descriptor = "[[B")
	private byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!ev", name = "l", descriptor = "[[B")
	private byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lclient!kb;IIII[[I[[II)V")
	public Class60_Sub1(@OriginalArg(0) Class121_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass121_Sub1_15 = arg0;
		this.anInt7480 = arg2;
		this.anIntArrayArray76 = arg5;
		this.aByteArrayArray23 = new byte[arg3 + 1][arg4 + 1];
		@Pc(31) int local31 = this.aClass121_Sub1_15.anInt4516 >> 9;
		for (@Pc(33) int local33 = 1; local33 < arg4; local33++) {
			for (@Pc(36) int local36 = 1; local36 < arg3; local36++) {
				@Pc(55) int local55 = arg6[local36 + 1][local33] - arg6[local36 - 1][local33];
				@Pc(71) int local71 = arg6[local36][local33 + 1] - arg6[local36][local33 - 1];
				@Pc(86) int local86 = (int) Math.sqrt((double) (local55 * local55 + arg7 * 512 + local71 * local71));
				@Pc(92) int local92 = (local55 << 8) / local86;
				@Pc(98) int local98 = arg7 * -512 / local86;
				@Pc(104) int local104 = (local71 << 8) / local86;
				@Pc(126) int local126 = local31 + (this.aClass121_Sub1_15.anInt4505 * local92 + this.aClass121_Sub1_15.anInt4520 * local98 + this.aClass121_Sub1_15.anInt4507 * local104 >> 17);
				local126 >>= 0x1;
				if (local126 < 2) {
					local126 = 2;
				} else if (local126 > 126) {
					local126 = 126;
				}
				this.aByteArrayArray23[local36][local33] = (byte) local126;
			}
		}
		this.aByteArrayArray22 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "(IILclient!w;)Lclient!w;")
	@Override
	public final Class6_Sub1_Sub12 c(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub1_Sub12 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!ev", name = "ba", descriptor = "()V")
	@Override
	public final void ba() {
		this.aByteArrayArray23 = null;
		this.aByteArrayArray22 = null;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method7896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class34_Sub1 local3 = this.aClass121_Sub1_15.aClass34_Sub1_8;
		this.anInt7491 = -1;
		this.anInt7488 = local3.anInt756;
		this.anInt7484 = local3.anInt764;
		this.anInt7486 = local3.anInt757;
		this.anInt7483 = local3.anInt766;
		this.anInt7479 = local3.anInt760;
		this.anInt7489 = local3.anInt767;
		this.anInt7490 = local3.anInt759;
		this.anInt7492 = local3.anInt762;
		this.anInt7482 = local3.anInt765;
		this.anInt7485 = local3.anInt758;
		this.anInt7481 = local3.anInt761;
		this.anInt7487 = local3.anInt763;
	}

	@OriginalMember(owner = "client!ev", name = "JA", descriptor = "(II)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray76[arg0][arg1];
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)Z")
	protected final boolean method6208(@OriginalArg(0) int arg0) {
		if ((this.anInt7480 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!ev", name = "aa", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public final void aa(@OriginalArg(0) Class6_Sub1_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!ev", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public final void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass39ArrayArray3 == null) {
			this.aClass39ArrayArray3 = new Class39[super.anInt9656][super.anInt9657];
			this.aClass229ArrayArray3 = new Class229[super.anInt9656][super.anInt9657];
		} else if (this.aClass341ArrayArray3 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static6.anIntArray272[Static516.method7312(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static6.anIntArray272[Static516.method7312(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == super.anInt9652 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt9652 && arg4[local116] == super.anInt9652) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt9652) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt9652 && arg2[local244] != arg2[0] - super.anInt9652) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt9652 && arg4[local244] != arg4[0] - super.anInt9652) {
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
			@Pc(334) Class39 local334 = new Class39();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt854 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte12 = (byte) (local334.aByte12 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray76[arg0][arg1] == this.anIntArrayArray76[arg0 + 1][arg1] && this.anIntArrayArray76[arg0][arg1] == this.anIntArrayArray76[arg0 + 1][arg1 + 1] && this.anIntArrayArray76[arg0][arg1] == this.anIntArrayArray76[arg0][arg1 + 1]) {
				local334.aByte12 = (byte) (local334.aByte12 | 0x1);
			}
			if (local342 == -1 || (local334.aByte12 & 0x2) != 0 || this.aClass121_Sub1_15.anInterface7_14.method5209(local342).aBoolean107) {
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
				local334.anInt853 = Static355.method5297(Static581.method6209(arg6[local104] >> 8, this.aByteArrayArray23[arg0][arg1] - this.aByteArrayArray22[arg0][arg1]), arg10, local527);
				if (local334.anInt854 != 0) {
					local334.anInt853 |= this.aByteArrayArray22[arg0][arg1] + 255 - this.aByteArrayArray23[arg0][arg1] << 25;
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
				local334.anInt856 = Static355.method5297(Static581.method6209(arg6[local106] >> 8, this.aByteArrayArray23[arg0 + 1][arg1] - this.aByteArrayArray22[arg0 + 1][arg1]), arg10, local527);
				if (local334.anInt854 != 0) {
					local334.anInt856 |= this.aByteArrayArray22[arg0 + 1][arg1] + 255 - this.aByteArrayArray23[arg0 + 1][arg1] << 25;
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
				local334.anInt852 = Static355.method5297(Static581.method6209(arg6[local108] >> 8, this.aByteArrayArray23[arg0 + 1][arg1 + 1] - this.aByteArrayArray22[arg0 + 1][arg1 + 1]), arg10, local527);
				if (local334.anInt854 != 0) {
					local334.anInt852 |= this.aByteArrayArray22[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray23[arg0 + 1][arg1 + 1] << 25;
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
				local334.anInt855 = Static355.method5297(Static581.method6209(arg6[local110] >> 8, this.aByteArrayArray23[arg0][arg1 + 1] - this.aByteArrayArray22[arg0][arg1 + 1]), arg10, local527);
				if (local334.anInt854 != 0) {
					local334.anInt855 |= this.aByteArrayArray22[arg0][arg1 + 1] + 255 - this.aByteArrayArray23[arg0][arg1 + 1] << 25;
				}
				local334.aShort8 = -1;
			} else {
				local334.anInt853 = this.aByteArrayArray23[arg0][arg1] - this.aByteArrayArray22[arg0][arg1];
				local334.anInt856 = this.aByteArrayArray23[arg0 + 1][arg1] - this.aByteArrayArray22[arg0 + 1][arg1];
				local334.anInt852 = this.aByteArrayArray23[arg0 + 1][arg1 + 1] - this.aByteArrayArray22[arg0 + 1][arg1 + 1];
				local334.anInt855 = this.aByteArrayArray23[arg0][arg1 + 1] - this.aByteArrayArray22[arg0][arg1 + 1];
				local334.aShort8 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort11 = (short) arg5[local108];
				local334.aShort9 = (short) arg5[local110];
				local334.aShort12 = (short) arg5[local106];
				local334.aShort10 = (short) arg5[local104];
			}
			this.aClass39ArrayArray3[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class229 local888 = new Class229();
		local888.aShort89 = (short) arg2.length;
		local888.aShort88 = (short) (arg2.length / 3);
		local888.aShortArray105 = new short[local888.aShort89];
		local888.aShortArray101 = new short[local888.aShort89];
		local888.aShortArray100 = new short[local888.aShort89];
		local888.anIntArray540 = new int[local888.aShort89];
		if (arg5 != null) {
			local888.aShortArray103 = new short[local888.aShort89];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort89; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray23[arg0][arg1] - this.aByteArrayArray22[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt9652) {
				local958 = this.aByteArrayArray23[arg0][arg1 + 1] - this.aByteArrayArray22[arg0][arg1 + 1];
			} else if (local342 == super.anInt9652 && local527 == super.anInt9652) {
				local958 = this.aByteArrayArray23[arg0 + 1][arg1 + 1] - this.aByteArrayArray22[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt9652 && local527 == 0) {
				local958 = this.aByteArrayArray23[arg0 + 1][arg1] - this.aByteArrayArray22[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray23[arg0][arg1] - this.aByteArrayArray22[arg0][arg1]) * (super.anInt9652 - local342) + (this.aByteArrayArray23[arg0 + 1][arg1] - this.aByteArrayArray22[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray23[arg0][arg1 + 1] - this.aByteArrayArray22[arg0][arg1 + 1]) * (super.anInt9652 - local342) + (this.aByteArrayArray23[arg0 + 1][arg1 + 1] - this.aByteArrayArray22[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt9652 - local527) + local1126 * local527 >> super.anInt9654 * 2;
			}
			local1079 = (arg0 << super.anInt9654) + local342;
			local1126 = (arg1 << super.anInt9654) + local527;
			local888.aShortArray105[local244] = (short) local342;
			local888.aShortArray100[local244] = (short) local527;
			local888.aShortArray101[local244] = (short) (this.sa(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass121_Sub1_15.anInterface7_14.method5209(arg8[local244]).aBoolean107) {
				local888.anIntArray540[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray103[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray540[local244] = Static355.method5297(Static581.method6209(arg6[local244] >> 8, local958), arg10, local1226);
				if (arg7 != null) {
					local888.anIntArray540[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray540[local244] = 0;
			} else {
				local888.anIntArray540[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort88; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass121_Sub1_15.anInterface7_14.method5209(arg8[local527 * 3]).aBoolean107) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray539 = new int[local888.aShort88];
		}
		if (local1296) {
			local888.aShortArray104 = new short[local888.aShort88];
			local888.aShortArray102 = new short[local888.aShort88];
		}
		for (local958 = 0; local958 < local888.aShort88; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray539[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass121_Sub1_15.anInterface7_14.method5209(local1384).aBoolean107) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass121_Sub1_15.anInterface7_14.method5209(local1384).aBoolean107) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass121_Sub1_15.anInterface7_14.method5209(local1384).aBoolean107) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray104[local958] = (short) local1384;
					local888.aShortArray102[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass121_Sub1_15.anInterface7_14.method5209(local1384).aBoolean107) {
							local888.anIntArray540[local1079] = Static6.anIntArray272[Static516.method7312(this.aClass121_Sub1_15.anInterface7_14.method5209(local1384).aShort30 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass121_Sub1_15.anInterface7_14.method5209(local1384).aBoolean107) {
							local888.anIntArray540[local1126] = Static6.anIntArray272[Static516.method7312(this.aClass121_Sub1_15.anInterface7_14.method5209(local1384).aShort30 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass121_Sub1_15.anInterface7_14.method5209(local1384).aBoolean107) {
							local888.anIntArray540[local1226] = Static6.anIntArray272[Static516.method7312(this.aClass121_Sub1_15.anInterface7_14.method5209(local1384).aShort30 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray104[local958] = -1;
				}
			}
		}
		this.aClass229ArrayArray3[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!ev", name = "EA", descriptor = "(III)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray22[arg0][arg1] < arg2) {
			this.aByteArrayArray22[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(II)V")
	public abstract void method7892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!w;IIIIZ)Z")
	@Override
	public final boolean method7890(@OriginalArg(0) Class6_Sub1_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method7894(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!ev", name = "FA", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public final void FA(@OriginalArg(0) Class6_Sub1_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!ev", name = "sa", descriptor = "(II)I")
	@Override
	public final int sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> super.anInt9654;
		@Pc(9) int local9 = arg1 >> super.anInt9654;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt9656 - 1 || local9 > super.anInt9657 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & super.anInt9652 - 1;
		@Pc(41) int local41 = arg1 & super.anInt9652 - 1;
		@Pc(67) int local67 = this.anIntArrayArray76[local4][local9] * (super.anInt9652 - local34) + this.anIntArrayArray76[local4 + 1][local9] * local34 >> super.anInt9654;
		@Pc(97) int local97 = this.anIntArrayArray76[local4][local9 + 1] * (super.anInt9652 - local34) + this.anIntArrayArray76[local4 + 1][local9 + 1] * local34 >> super.anInt9654;
		return local67 * (super.anInt9652 - local41) + local97 * local41 >> super.anInt9654;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!hj;[I)V")
	@Override
	public final void method7893(@OriginalArg(0) Class6_Sub7 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public final void method7889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass341ArrayArray3 == null) {
			this.aClass341ArrayArray3 = new Class341[super.anInt9656][super.anInt9657];
			this.aClass106ArrayArray3 = new Class106[super.anInt9656][super.anInt9657];
		} else if (this.aClass39ArrayArray3 != null) {
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
				if (local64 != 0 && local64 != super.anInt9652 || local70 != 0 && local70 != super.anInt9652) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class106 local95 = new Class106();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort65 = local99;
			local95.aShortArray49 = new short[local99];
			local95.aShortArray51 = new short[local99];
			local95.aShortArray43 = new short[local99];
			local95.aShortArray46 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray49[local124] = (short) (this.aByteArrayArray23[arg0][arg1] - this.aByteArrayArray22[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt9652) {
					local95.aShortArray49[local124] = (short) (this.aByteArrayArray23[arg0][arg1 + 1] - this.aByteArrayArray22[arg0][arg1 + 1]);
				} else if (local129 == super.anInt9652 && local133 == super.anInt9652) {
					local95.aShortArray49[local124] = (short) (this.aByteArrayArray23[arg0 + 1][arg1 + 1] - this.aByteArrayArray22[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt9652 && local133 == 0) {
					local95.aShortArray49[local124] = (short) (this.aByteArrayArray23[arg0 + 1][arg1] - this.aByteArrayArray22[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray23[arg0][arg1] - this.aByteArrayArray22[arg0][arg1]) * (super.anInt9652 - local129) + (this.aByteArrayArray23[arg0 + 1][arg1] - this.aByteArrayArray22[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray23[arg0][arg1 + 1] - this.aByteArrayArray22[arg0][arg1 + 1]) * (super.anInt9652 - local129) + (this.aByteArrayArray23[arg0 + 1][arg1 + 1] - this.aByteArrayArray22[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray49[local124] = (short) (local288 * (super.anInt9652 - local133) + local335 * local133 >> super.anInt9654 * 2);
				}
				local288 = (arg0 << super.anInt9654) + local129;
				local335 = (arg1 << super.anInt9654) + local133;
				local95.aShortArray51[local124] = (short) local129;
				local95.aShortArray46[local124] = (short) local133;
				local95.aShortArray43[local124] = (short) (this.sa(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray49[local124] < 2) {
					local95.aShortArray49[local124] = 2;
				}
			}
			@Pc(415) boolean local415 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass121_Sub1_15.anInterface7_14.method5209(arg11[local288]).aBoolean107) {
					local415 = true;
				}
			}
			local95.anIntArray309 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray310 = new int[local133];
			}
			local95.aShortArray50 = new short[local133];
			local95.aShortArray45 = new short[local133];
			local95.aShortArray44 = new short[local133];
			if (local415) {
				local95.aShortArray47 = new short[local133];
				local95.aShortArray48 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray309[local95.aShort64] = Static516.method7312(arg9[local335]);
					} else {
						local95.anIntArray309[local95.aShort64] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray310[local95.aShort64] = -1;
						} else {
							local95.anIntArray310[local95.aShort64] = Static516.method7312(arg10[local335]);
						}
					}
					local95.aShortArray50[local95.aShort64] = (short) arg6[local335];
					local95.aShortArray45[local95.aShort64] = (short) arg7[local335];
					local95.aShortArray44[local95.aShort64] = (short) arg8[local335];
					if (local415) {
						if (arg11[local335] == -1 || this.aClass121_Sub1_15.anInterface7_14.method5209(arg11[local335]).aBoolean107) {
							local95.aShortArray47[local95.aShort64] = -1;
						} else {
							local95.aShortArray47[local95.aShort64] = (short) arg11[local335];
							local95.aShortArray48[local95.aShort64] = (short) arg12[local335];
						}
					}
					local95.aShort64++;
				}
			}
			this.aClass106ArrayArray3[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(644) Class341 local644 = new Class341();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local644.anInt9371 = Static564.method7701(Static516.method7312(arg10[0]), this.aByteArrayArray23[arg0][arg1] - this.aByteArrayArray22[arg0][arg1]);
				if (local64 == -1) {
					local644.aByte105 = (byte) (local644.aByte105 | 0x2);
				}
			}
			if (this.anIntArrayArray76[arg0][arg1] == this.anIntArrayArray76[arg0 + 1][arg1] && this.anIntArrayArray76[arg0][arg1] == this.anIntArrayArray76[arg0 + 1][arg1 + 1] && this.anIntArrayArray76[arg0][arg1] == this.anIntArrayArray76[arg0][arg1 + 1]) {
				local644.aByte105 = (byte) (local644.aByte105 | 0x1);
			}
			if (local70 == -1 || (local644.aByte105 & 0x2) != 0 || this.aClass121_Sub1_15.anInterface7_14.method5209(local70).aBoolean107) {
				@Pc(845) short local845 = Static516.method7312(local64);
				local644.aShort126 = (short) Static564.method7701(local845, this.aByteArrayArray23[arg0][arg1] - this.aByteArrayArray22[arg0][arg1]);
				local644.aShort129 = (short) Static564.method7701(local845, this.aByteArrayArray23[arg0 + 1][arg1] - this.aByteArrayArray22[arg0 + 1][arg1]);
				local644.aShort128 = (short) Static564.method7701(local845, this.aByteArrayArray23[arg0 + 1][arg1 + 1] - this.aByteArrayArray22[arg0 + 1][arg1 + 1]);
				local644.aShort125 = (short) Static564.method7701(local845, this.aByteArrayArray23[arg0][arg1 + 1] - this.aByteArrayArray22[arg0][arg1 + 1]);
				local644.aShort127 = -1;
			} else {
				local644.aShort126 = (short) (this.aByteArrayArray23[arg0][arg1] - this.aByteArrayArray22[arg0][arg1]);
				local644.aShort129 = (short) (this.aByteArrayArray23[arg0 + 1][arg1] - this.aByteArrayArray22[arg0 + 1][arg1]);
				local644.aShort128 = (short) (this.aByteArrayArray23[arg0 + 1][arg1 + 1] - this.aByteArrayArray22[arg0 + 1][arg1 + 1]);
				local644.aShort125 = (short) (this.aByteArrayArray23[arg0][arg1 + 1] - this.aByteArrayArray22[arg0][arg1 + 1]);
				local644.aShort127 = (short) local70;
			}
			this.aClass341ArrayArray3[arg0][arg1] = local644;
		}
	}
}
