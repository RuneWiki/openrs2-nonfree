import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public abstract class Class16_Sub2 extends Class16 {

	@OriginalMember(owner = "client!bs", name = "l", descriptor = "I")
	protected int anInt3734;

	@OriginalMember(owner = "client!bs", name = "n", descriptor = "I")
	protected int anInt3735;

	@OriginalMember(owner = "client!bs", name = "o", descriptor = "I")
	protected int anInt3736;

	@OriginalMember(owner = "client!bs", name = "q", descriptor = "I")
	protected int anInt3738;

	@OriginalMember(owner = "client!bs", name = "r", descriptor = "I")
	protected int anInt3739;

	@OriginalMember(owner = "client!bs", name = "s", descriptor = "I")
	protected int anInt3740;

	@OriginalMember(owner = "client!bs", name = "t", descriptor = "[[Lclient!gp;")
	protected Class126[][] aClass126ArrayArray3;

	@OriginalMember(owner = "client!bs", name = "u", descriptor = "[[Lclient!tu;")
	protected Class323[][] aClass323ArrayArray3;

	@OriginalMember(owner = "client!bs", name = "w", descriptor = "[[Lclient!bt;")
	protected Class38[][] aClass38ArrayArray3;

	@OriginalMember(owner = "client!bs", name = "z", descriptor = "I")
	protected int anInt3741;

	@OriginalMember(owner = "client!bs", name = "A", descriptor = "I")
	protected int anInt3742;

	@OriginalMember(owner = "client!bs", name = "B", descriptor = "[[Lclient!rs;")
	protected Class296[][] aClass296ArrayArray3;

	@OriginalMember(owner = "client!bs", name = "C", descriptor = "I")
	protected int anInt3743;

	@OriginalMember(owner = "client!bs", name = "D", descriptor = "I")
	protected int anInt3744;

	@OriginalMember(owner = "client!bs", name = "E", descriptor = "I")
	protected int anInt3745;

	@OriginalMember(owner = "client!bs", name = "G", descriptor = "I")
	protected int anInt3746;

	@OriginalMember(owner = "client!bs", name = "k", descriptor = "I")
	protected int anInt3733 = -1;

	@OriginalMember(owner = "client!bs", name = "y", descriptor = "Lclient!qe;")
	protected final Class66_Sub2 aClass66_Sub2_11;

	@OriginalMember(owner = "client!bs", name = "p", descriptor = "I")
	private final int anInt3737;

	@OriginalMember(owner = "client!bs", name = "x", descriptor = "[[I")
	public final int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!bs", name = "v", descriptor = "[[B")
	private byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!bs", name = "m", descriptor = "[[B")
	private byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lclient!qe;IIII[[I[[II)V")
	public Class16_Sub2(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass66_Sub2_11 = arg0;
		this.anInt3737 = arg2;
		this.anIntArrayArray46 = arg5;
		this.aByteArrayArray15 = new byte[arg3 + 1][arg4 + 1];
		@Pc(31) int local31 = this.aClass66_Sub2_11.anInt3228 >> 9;
		for (@Pc(33) int local33 = 1; local33 < arg4; local33++) {
			for (@Pc(36) int local36 = 1; local36 < arg3; local36++) {
				@Pc(55) int local55 = arg6[local36 + 1][local33] - arg6[local36 - 1][local33];
				@Pc(71) int local71 = arg6[local36][local33 + 1] - arg6[local36][local33 - 1];
				@Pc(86) int local86 = (int) Math.sqrt((double) (local55 * local55 + arg7 * 512 + local71 * local71));
				@Pc(92) int local92 = (local55 << 8) / local86;
				@Pc(98) int local98 = arg7 * -512 / local86;
				@Pc(104) int local104 = (local71 << 8) / local86;
				@Pc(126) int local126 = local31 + (this.aClass66_Sub2_11.anInt3220 * local92 + this.aClass66_Sub2_11.anInt3211 * local98 + this.aClass66_Sub2_11.anInt3221 * local104 >> 17);
				local126 >>= 0x1;
				if (local126 < 2) {
					local126 = 2;
				} else if (local126 > 126) {
					local126 = 126;
				}
				this.aByteArrayArray15[local36][local33] = (byte) local126;
			}
		}
		this.aByteArrayArray14 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)Z")
	protected final boolean method3320(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!w;IIIIZ)Z")
	@Override
	public final boolean method8043(@OriginalArg(0) Class4_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!bs", name = "aa", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public final void aa(@OriginalArg(0) Class4_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!bs", name = "EA", descriptor = "(III)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray14[arg0][arg1] < arg2) {
			this.aByteArrayArray14[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)V")
	public abstract void method8044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bs", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public final void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass296ArrayArray3 == null) {
			this.aClass296ArrayArray3 = new Class296[super.anInt9838][super.anInt9839];
			this.aClass323ArrayArray3 = new Class323[super.anInt9838][super.anInt9839];
		} else if (this.aClass38ArrayArray3 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static18.anIntArray203[Static206.method3645(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static18.anIntArray203[Static206.method3645(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == super.anInt9841 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt9841 && arg4[local116] == super.anInt9841) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt9841) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt9841 && arg2[local244] != arg2[0] - super.anInt9841) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt9841 && arg4[local244] != arg4[0] - super.anInt9841) {
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
			@Pc(334) Class296 local334 = new Class296();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt7912 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte88 = (byte) (local334.aByte88 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray46[arg0][arg1] == this.anIntArrayArray46[arg0 + 1][arg1] && this.anIntArrayArray46[arg0][arg1] == this.anIntArrayArray46[arg0 + 1][arg1 + 1] && this.anIntArrayArray46[arg0][arg1] == this.anIntArrayArray46[arg0][arg1 + 1]) {
				local334.aByte88 = (byte) (local334.aByte88 | 0x1);
			}
			if (local342 == -1 || (local334.aByte88 & 0x2) != 0 || this.aClass66_Sub2_11.anInterface3_15.method7249(local342).aBoolean514) {
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
				local334.anInt7913 = Static219.method3784(Static600.method3321(arg6[local104] >> 8, this.aByteArrayArray15[arg0][arg1] - this.aByteArrayArray14[arg0][arg1]), local527, arg10);
				if (local334.anInt7912 != 0) {
					local334.anInt7913 |= this.aByteArrayArray14[arg0][arg1] + 255 - this.aByteArrayArray15[arg0][arg1] << 25;
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
				local334.anInt7916 = Static219.method3784(Static600.method3321(arg6[local106] >> 8, this.aByteArrayArray15[arg0 + 1][arg1] - this.aByteArrayArray14[arg0 + 1][arg1]), local527, arg10);
				if (local334.anInt7912 != 0) {
					local334.anInt7916 |= this.aByteArrayArray14[arg0 + 1][arg1] + 255 - this.aByteArrayArray15[arg0 + 1][arg1] << 25;
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
				local334.anInt7914 = Static219.method3784(Static600.method3321(arg6[local108] >> 8, this.aByteArrayArray15[arg0 + 1][arg1 + 1] - this.aByteArrayArray14[arg0 + 1][arg1 + 1]), local527, arg10);
				if (local334.anInt7912 != 0) {
					local334.anInt7914 |= this.aByteArrayArray14[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray15[arg0 + 1][arg1 + 1] << 25;
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
				local334.anInt7915 = Static219.method3784(Static600.method3321(arg6[local110] >> 8, this.aByteArrayArray15[arg0][arg1 + 1] - this.aByteArrayArray14[arg0][arg1 + 1]), local527, arg10);
				if (local334.anInt7912 != 0) {
					local334.anInt7915 |= this.aByteArrayArray14[arg0][arg1 + 1] + 255 - this.aByteArrayArray15[arg0][arg1 + 1] << 25;
				}
				local334.aShort103 = -1;
			} else {
				local334.anInt7913 = this.aByteArrayArray15[arg0][arg1] - this.aByteArrayArray14[arg0][arg1];
				local334.anInt7916 = this.aByteArrayArray15[arg0 + 1][arg1] - this.aByteArrayArray14[arg0 + 1][arg1];
				local334.anInt7914 = this.aByteArrayArray15[arg0 + 1][arg1 + 1] - this.aByteArrayArray14[arg0 + 1][arg1 + 1];
				local334.anInt7915 = this.aByteArrayArray15[arg0][arg1 + 1] - this.aByteArrayArray14[arg0][arg1 + 1];
				local334.aShort103 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort101 = (short) arg5[local108];
				local334.aShort99 = (short) arg5[local110];
				local334.aShort100 = (short) arg5[local106];
				local334.aShort102 = (short) arg5[local104];
			}
			this.aClass296ArrayArray3[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class323 local888 = new Class323();
		local888.aShort113 = (short) arg2.length;
		local888.aShort112 = (short) (arg2.length / 3);
		local888.aShortArray152 = new short[local888.aShort113];
		local888.aShortArray154 = new short[local888.aShort113];
		local888.aShortArray149 = new short[local888.aShort113];
		local888.anIntArray675 = new int[local888.aShort113];
		if (arg5 != null) {
			local888.aShortArray151 = new short[local888.aShort113];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort113; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray15[arg0][arg1] - this.aByteArrayArray14[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt9841) {
				local958 = this.aByteArrayArray15[arg0][arg1 + 1] - this.aByteArrayArray14[arg0][arg1 + 1];
			} else if (local342 == super.anInt9841 && local527 == super.anInt9841) {
				local958 = this.aByteArrayArray15[arg0 + 1][arg1 + 1] - this.aByteArrayArray14[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt9841 && local527 == 0) {
				local958 = this.aByteArrayArray15[arg0 + 1][arg1] - this.aByteArrayArray14[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray15[arg0][arg1] - this.aByteArrayArray14[arg0][arg1]) * (super.anInt9841 - local342) + (this.aByteArrayArray15[arg0 + 1][arg1] - this.aByteArrayArray14[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray15[arg0][arg1 + 1] - this.aByteArrayArray14[arg0][arg1 + 1]) * (super.anInt9841 - local342) + (this.aByteArrayArray15[arg0 + 1][arg1 + 1] - this.aByteArrayArray14[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt9841 - local527) + local1126 * local527 >> super.anInt9837 * 2;
			}
			local1079 = (arg0 << super.anInt9837) + local342;
			local1126 = (arg1 << super.anInt9837) + local527;
			local888.aShortArray152[local244] = (short) local342;
			local888.aShortArray149[local244] = (short) local527;
			local888.aShortArray154[local244] = (short) (this.sa(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass66_Sub2_11.anInterface3_15.method7249(arg8[local244]).aBoolean514) {
				local888.anIntArray675[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray151[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray675[local244] = Static219.method3784(Static600.method3321(arg6[local244] >> 8, local958), local1226, arg10);
				if (arg7 != null) {
					local888.anIntArray675[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray675[local244] = 0;
			} else {
				local888.anIntArray675[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort112; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass66_Sub2_11.anInterface3_15.method7249(arg8[local527 * 3]).aBoolean514) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray674 = new int[local888.aShort112];
		}
		if (local1296) {
			local888.aShortArray150 = new short[local888.aShort112];
			local888.aShortArray153 = new short[local888.aShort112];
		}
		for (local958 = 0; local958 < local888.aShort112; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray674[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass66_Sub2_11.anInterface3_15.method7249(local1384).aBoolean514) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass66_Sub2_11.anInterface3_15.method7249(local1384).aBoolean514) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass66_Sub2_11.anInterface3_15.method7249(local1384).aBoolean514) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray150[local958] = (short) local1384;
					local888.aShortArray153[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass66_Sub2_11.anInterface3_15.method7249(local1384).aBoolean514) {
							local888.anIntArray675[local1079] = Static18.anIntArray203[Static206.method3645(this.aClass66_Sub2_11.anInterface3_15.method7249(local1384).aShort94 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass66_Sub2_11.anInterface3_15.method7249(local1384).aBoolean514) {
							local888.anIntArray675[local1126] = Static18.anIntArray203[Static206.method3645(this.aClass66_Sub2_11.anInterface3_15.method7249(local1384).aShort94 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass66_Sub2_11.anInterface3_15.method7249(local1384).aBoolean514) {
							local888.anIntArray675[local1226] = Static18.anIntArray203[Static206.method3645(this.aClass66_Sub2_11.anInterface3_15.method7249(local1384).aShort94 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray150[local958] = -1;
				}
			}
		}
		this.aClass323ArrayArray3[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!bs", name = "sa", descriptor = "(II)I")
	@Override
	public final int sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> super.anInt9837;
		@Pc(9) int local9 = arg1 >> super.anInt9837;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt9838 - 1 || local9 > super.anInt9839 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & super.anInt9841 - 1;
		@Pc(41) int local41 = arg1 & super.anInt9841 - 1;
		@Pc(67) int local67 = this.anIntArrayArray46[local4][local9] * (super.anInt9841 - local34) + this.anIntArrayArray46[local4 + 1][local9] * local34 >> super.anInt9837;
		@Pc(97) int local97 = this.anIntArrayArray46[local4][local9 + 1] * (super.anInt9841 - local34) + this.anIntArrayArray46[local4 + 1][local9 + 1] * local34 >> super.anInt9837;
		return local67 * (super.anInt9841 - local41) + local97 * local41 >> super.anInt9837;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public final void method8040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass38ArrayArray3 == null) {
			this.aClass38ArrayArray3 = new Class38[super.anInt9838][super.anInt9839];
			this.aClass126ArrayArray3 = new Class126[super.anInt9838][super.anInt9839];
		} else if (this.aClass296ArrayArray3 != null) {
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
				if (local64 != 0 && local64 != super.anInt9841 || local70 != 0 && local70 != super.anInt9841) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class126 local95 = new Class126();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort55 = local99;
			local95.aShortArray74 = new short[local99];
			local95.aShortArray77 = new short[local99];
			local95.aShortArray73 = new short[local99];
			local95.aShortArray81 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray74[local124] = (short) (this.aByteArrayArray15[arg0][arg1] - this.aByteArrayArray14[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt9841) {
					local95.aShortArray74[local124] = (short) (this.aByteArrayArray15[arg0][arg1 + 1] - this.aByteArrayArray14[arg0][arg1 + 1]);
				} else if (local129 == super.anInt9841 && local133 == super.anInt9841) {
					local95.aShortArray74[local124] = (short) (this.aByteArrayArray15[arg0 + 1][arg1 + 1] - this.aByteArrayArray14[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt9841 && local133 == 0) {
					local95.aShortArray74[local124] = (short) (this.aByteArrayArray15[arg0 + 1][arg1] - this.aByteArrayArray14[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray15[arg0][arg1] - this.aByteArrayArray14[arg0][arg1]) * (super.anInt9841 - local129) + (this.aByteArrayArray15[arg0 + 1][arg1] - this.aByteArrayArray14[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray15[arg0][arg1 + 1] - this.aByteArrayArray14[arg0][arg1 + 1]) * (super.anInt9841 - local129) + (this.aByteArrayArray15[arg0 + 1][arg1 + 1] - this.aByteArrayArray14[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray74[local124] = (short) (local288 * (super.anInt9841 - local133) + local335 * local133 >> super.anInt9837 * 2);
				}
				local288 = (arg0 << super.anInt9837) + local129;
				local335 = (arg1 << super.anInt9837) + local133;
				local95.aShortArray77[local124] = (short) local129;
				local95.aShortArray81[local124] = (short) local133;
				local95.aShortArray73[local124] = (short) (this.sa(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray74[local124] < 2) {
					local95.aShortArray74[local124] = 2;
				}
			}
			@Pc(415) boolean local415 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass66_Sub2_11.anInterface3_15.method7249(arg11[local288]).aBoolean514) {
					local415 = true;
				}
			}
			local95.anIntArray363 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray364 = new int[local133];
			}
			local95.aShortArray78 = new short[local133];
			local95.aShortArray80 = new short[local133];
			local95.aShortArray76 = new short[local133];
			if (local415) {
				local95.aShortArray79 = new short[local133];
				local95.aShortArray75 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray363[local95.aShort56] = Static206.method3645(arg9[local335]);
					} else {
						local95.anIntArray363[local95.aShort56] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray364[local95.aShort56] = -1;
						} else {
							local95.anIntArray364[local95.aShort56] = Static206.method3645(arg10[local335]);
						}
					}
					local95.aShortArray78[local95.aShort56] = (short) arg6[local335];
					local95.aShortArray80[local95.aShort56] = (short) arg7[local335];
					local95.aShortArray76[local95.aShort56] = (short) arg8[local335];
					if (local415) {
						if (arg11[local335] == -1 || this.aClass66_Sub2_11.anInterface3_15.method7249(arg11[local335]).aBoolean514) {
							local95.aShortArray79[local95.aShort56] = -1;
						} else {
							local95.aShortArray79[local95.aShort56] = (short) arg11[local335];
							local95.aShortArray75[local95.aShort56] = (short) arg12[local335];
						}
					}
					local95.aShort56++;
				}
			}
			this.aClass126ArrayArray3[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(644) Class38 local644 = new Class38();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local644.anInt896 = Static253.method4246(this.aByteArrayArray15[arg0][arg1] - this.aByteArrayArray14[arg0][arg1], Static206.method3645(arg10[0]));
				if (local64 == -1) {
					local644.aByte16 = (byte) (local644.aByte16 | 0x2);
				}
			}
			if (this.anIntArrayArray46[arg0][arg1] == this.anIntArrayArray46[arg0 + 1][arg1] && this.anIntArrayArray46[arg0][arg1] == this.anIntArrayArray46[arg0 + 1][arg1 + 1] && this.anIntArrayArray46[arg0][arg1] == this.anIntArrayArray46[arg0][arg1 + 1]) {
				local644.aByte16 = (byte) (local644.aByte16 | 0x1);
			}
			if (local70 == -1 || (local644.aByte16 & 0x2) != 0 || this.aClass66_Sub2_11.anInterface3_15.method7249(local70).aBoolean514) {
				@Pc(845) short local845 = Static206.method3645(local64);
				local644.aShort27 = (short) Static253.method4246(this.aByteArrayArray15[arg0][arg1] - this.aByteArrayArray14[arg0][arg1], local845);
				local644.aShort25 = (short) Static253.method4246(this.aByteArrayArray15[arg0 + 1][arg1] - this.aByteArrayArray14[arg0 + 1][arg1], local845);
				local644.aShort28 = (short) Static253.method4246(this.aByteArrayArray15[arg0 + 1][arg1 + 1] - this.aByteArrayArray14[arg0 + 1][arg1 + 1], local845);
				local644.aShort24 = (short) Static253.method4246(this.aByteArrayArray15[arg0][arg1 + 1] - this.aByteArrayArray14[arg0][arg1 + 1], local845);
				local644.aShort26 = -1;
			} else {
				local644.aShort27 = (short) (this.aByteArrayArray15[arg0][arg1] - this.aByteArrayArray14[arg0][arg1]);
				local644.aShort25 = (short) (this.aByteArrayArray15[arg0 + 1][arg1] - this.aByteArrayArray14[arg0 + 1][arg1]);
				local644.aShort28 = (short) (this.aByteArrayArray15[arg0 + 1][arg1 + 1] - this.aByteArrayArray14[arg0 + 1][arg1 + 1]);
				local644.aShort24 = (short) (this.aByteArrayArray15[arg0][arg1 + 1] - this.aByteArrayArray14[arg0][arg1 + 1]);
				local644.aShort26 = (short) local70;
			}
			this.aClass38ArrayArray3[arg0][arg1] = local644;
		}
	}

	@OriginalMember(owner = "client!bs", name = "FA", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public final void FA(@OriginalArg(0) Class4_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!pv;[I)V")
	@Override
	public final void method8042(@OriginalArg(0) Class4_Sub32 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!bs", name = "JA", descriptor = "(II)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray46[arg0][arg1];
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method8039(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method8041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class134_Sub3 local3 = this.aClass66_Sub2_11.aClass134_Sub3_7;
		this.anInt3733 = -1;
		this.anInt3741 = local3.anInt7278;
		this.anInt3734 = local3.anInt7274;
		this.anInt3742 = local3.anInt7285;
		this.anInt3745 = local3.anInt7281;
		this.anInt3746 = local3.anInt7280;
		this.anInt3743 = local3.anInt7276;
		this.anInt3740 = local3.anInt7275;
		this.anInt3739 = local3.anInt7277;
		this.anInt3738 = local3.anInt7284;
		this.anInt3735 = local3.anInt7283;
		this.anInt3736 = local3.anInt7282;
		this.anInt3744 = local3.anInt7279;
	}

	@OriginalMember(owner = "client!bs", name = "ba", descriptor = "()V")
	@Override
	public final void ba() {
		this.aByteArrayArray15 = null;
		this.aByteArrayArray14 = null;
	}

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "(IILclient!w;)Lclient!w;")
	@Override
	public final Class4_Sub7_Sub3 c(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub7_Sub3 arg2) {
		return null;
	}
}
