import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class33_Sub2 extends Class33 {

	@OriginalMember(owner = "client!on", name = "f", descriptor = "I")
	private int anInt4629;

	@OriginalMember(owner = "client!on", name = "g", descriptor = "I")
	private int anInt4630;

	@OriginalMember(owner = "client!on", name = "h", descriptor = "[[Lclient!se;")
	private Class205[][] aClass205ArrayArray1;

	@OriginalMember(owner = "client!on", name = "i", descriptor = "I")
	private int anInt4631;

	@OriginalMember(owner = "client!on", name = "j", descriptor = "I")
	private int anInt4632;

	@OriginalMember(owner = "client!on", name = "k", descriptor = "[[Lclient!ak;")
	private Class9[][] aClass9ArrayArray1;

	@OriginalMember(owner = "client!on", name = "l", descriptor = "I")
	private int anInt4633;

	@OriginalMember(owner = "client!on", name = "n", descriptor = "[[Lclient!re;")
	private Class197[][] aClass197ArrayArray1;

	@OriginalMember(owner = "client!on", name = "o", descriptor = "I")
	private int anInt4635;

	@OriginalMember(owner = "client!on", name = "p", descriptor = "I")
	private int anInt4636;

	@OriginalMember(owner = "client!on", name = "q", descriptor = "I")
	private int anInt4637;

	@OriginalMember(owner = "client!on", name = "r", descriptor = "[[Lclient!kr;")
	private Class140[][] aClass140ArrayArray1;

	@OriginalMember(owner = "client!on", name = "t", descriptor = "I")
	private int anInt4639;

	@OriginalMember(owner = "client!on", name = "u", descriptor = "I")
	private int anInt4640;

	@OriginalMember(owner = "client!on", name = "v", descriptor = "I")
	private int anInt4641;

	@OriginalMember(owner = "client!on", name = "x", descriptor = "I")
	private int anInt4642;

	@OriginalMember(owner = "client!on", name = "y", descriptor = "Lclient!fu;")
	private final Class82_Sub1 aClass82_Sub1_7;

	@OriginalMember(owner = "client!on", name = "e", descriptor = "I")
	private final int anInt4628;

	@OriginalMember(owner = "client!on", name = "w", descriptor = "[[I")
	public final int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!on", name = "s", descriptor = "I")
	private final int anInt4638;

	@OriginalMember(owner = "client!on", name = "m", descriptor = "I")
	private int anInt4634;

	@OriginalMember(owner = "client!on", name = "A", descriptor = "[[B")
	private byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!on", name = "z", descriptor = "[[B")
	private byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!fu;IIII[[I[[II)V")
	public Class33_Sub2(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4);
		this.aClass82_Sub1_7 = arg0;
		this.anInt4628 = arg2;
		this.anIntArrayArray37 = arg5;
		this.anInt4638 = arg7;
		this.anInt4634 = 0;
		while (arg7 > 1) {
			this.anInt4634++;
			arg7 >>= 0x1;
		}
		this.aByteArrayArray16 = new byte[arg3 + 1][arg4 + 1];
		@Pc(47) int local47 = this.aClass82_Sub1_7.anInt2110 >> 9;
		for (@Pc(49) int local49 = 1; local49 < arg4; local49++) {
			for (@Pc(52) int local52 = 1; local52 < arg3; local52++) {
				@Pc(71) int local71 = arg6[local52 + 1][local49] - arg6[local52 - 1][local49];
				@Pc(87) int local87 = arg6[local52][local49 + 1] - arg6[local52][local49 - 1];
				@Pc(100) int local100 = (int) Math.sqrt((double) (local71 * local71 + local87 * local87 + 65536));
				@Pc(106) int local106 = (local71 << 8) / local100;
				@Pc(110) int local110 = -65536 / local100;
				@Pc(116) int local116 = (local87 << 8) / local100;
				@Pc(138) int local138 = local47 + (this.aClass82_Sub1_7.anInt2117 * local106 + this.aClass82_Sub1_7.anInt2113 * local110 + this.aClass82_Sub1_7.anInt2124 * local116 >> 17);
				local138 >>= 0x1;
				if (local138 < 2) {
					local138 = 2;
				} else if (local138 > 126) {
					local138 = 126;
				}
				this.aByteArrayArray16[local52][local49] = (byte) local138;
			}
		}
		this.aByteArrayArray15 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!on", name = "d", descriptor = "(II)V")
	@Override
	public void method4067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class18 local4 = this.aClass82_Sub1_7.method2068(Thread.currentThread());
		local4.aClass44_1.anInt1038 = 0;
		if (this.aClass140ArrayArray1 != null) {
			this.method4074(arg0, arg1, this.aClass82_Sub1_7.aBoolean160, local4.aClass44_1, local4.anIntArray56, local4.anIntArray51, local4.anIntArray61);
		} else if (this.aClass205ArrayArray1 != null) {
			this.method4073(arg0, arg1, local4.aClass44_1, local4.anIntArray56, local4.anIntArray51, local4.anIntArray61);
		}
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(Lclient!mr;IIIIZ)Z")
	@Override
	public boolean method4068(@OriginalArg(0) Class2_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(II)I")
	@Override
	public int method4055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> this.anInt4634;
		@Pc(9) int local9 = arg1 >> this.anInt4634;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt4627 - 1 || local9 > super.anInt4626 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & this.anInt4638 - 1;
		@Pc(41) int local41 = arg1 & this.anInt4638 - 1;
		@Pc(67) int local67 = this.anIntArrayArray37[local4][local9] * (this.anInt4638 - local34) + this.anIntArrayArray37[local4 + 1][local9] * local34 >> this.anInt4634;
		@Pc(97) int local97 = this.anIntArrayArray37[local4][local9 + 1] * (this.anInt4638 - local34) + this.anIntArrayArray37[local4 + 1][local9 + 1] * local34 >> this.anInt4634;
		return local67 * (this.anInt4638 - local41) + local97 * local41 >> this.anInt4634;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IILclient!mr;)Lclient!mr;")
	@Override
	public Class2_Sub1_Sub6 method4069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub6 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method4070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class54_Sub1 local3 = this.aClass82_Sub1_7.aClass54_Sub1_2;
		this.anInt4629 = local3.anInt2898;
		this.anInt4631 = local3.anInt2906;
		this.anInt4636 = local3.anInt2905;
		this.anInt4641 = local3.anInt2896;
		this.anInt4639 = local3.anInt2904;
		this.anInt4642 = local3.anInt2907;
		this.anInt4635 = local3.anInt2899;
		this.anInt4637 = local3.anInt2903;
		this.anInt4632 = local3.anInt2897;
		this.anInt4640 = local3.anInt2902;
		this.anInt4633 = local3.anInt2900;
		this.anInt4630 = local3.anInt2901;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(III)V")
	@Override
	public void method4062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray15[arg0][arg1] < arg2) {
			this.aByteArrayArray15[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!mr;IIIIZ)V")
	@Override
	public void method4056(@OriginalArg(0) Class2_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIIII[[ZLclient!db;[I[I)V")
	private void method4072(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class44 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean96 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass140ArrayArray1[local22][local25] != null) {
						@Pc(50) Class140 local50 = this.aClass140ArrayArray1[local22][local25];
						if (local50.aShort30 != -1 && (local50.aByte28 & 0x2) == 0 && local50.anInt3340 == 0) {
							local68 = this.aClass82_Sub1_7.method2071(local50.aShort30);
							arg5.method993(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static362.method5518(local50.anInt3338, local68), Static362.method5518(local50.anInt3337, local68), Static362.method5518(local50.anInt3341, local68));
							arg5.method993(local20, local20, local20 - 4, local16, local16 + 4, local16, Static362.method5518(local50.anInt3339, local68), Static362.method5518(local50.anInt3341, local68), Static362.method5518(local50.anInt3337, local68));
						} else if (local50.anInt3340 == 0) {
							arg5.method992(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt3338, local50.anInt3337, local50.anInt3341);
							arg5.method992(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt3339, local50.anInt3341, local50.anInt3337);
						} else {
							local68 = local50.anInt3340;
							arg5.method992(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static333.method5091(local68, local50.anInt3338 & 0xFF000000), Static333.method5091(local68, local50.anInt3337 & 0xFF000000), Static333.method5091(local68, local50.anInt3341 & 0xFF000000));
							arg5.method992(local20, local20, local20 - 4, local16, local16 + 4, local16, Static333.method5091(local68, local50.anInt3339 & 0xFF000000), Static333.method5091(local68, local50.anInt3341 & 0xFF000000), Static333.method5091(local68, local50.anInt3337 & 0xFF000000));
						}
					} else if (this.aClass197ArrayArray1[local22][local25] != null) {
						@Pc(259) Class197 local259 = this.aClass197ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort80; local68++) {
							arg6[local68] = local16 + (local259.aShortArray97[local68] - local22 * this.anInt4638) * 4 / this.anInt4638;
							arg7[local68] = local20 - (local259.aShortArray98[local68] - local25 * this.anInt4638) * 4 / this.anInt4638;
						}
						for (@Pc(307) int local307 = 0; local307 < local259.aShort79; local307++) {
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
							if (local259.anIntArray664 != null && local259.anIntArray664[local307] != 0 && (local259.aShortArray99 == null || local259.aShortArray99 != null && local259.aShortArray99[local307] == -1)) {
								local369 = local259.anIntArray664[local307];
								arg5.method992(local336, local340, local344, local324, local328, local332, Static333.method5091(local369, -(local259.anIntArray663[local312] & -16777216) - 16777216), Static333.method5091(local369, -(local259.anIntArray663[local316] & -16777216) - 16777216), Static333.method5091(local369, -(local259.anIntArray663[local320] & -16777216) - 16777216));
							} else if (local259.aShortArray99 == null || local259.aShortArray99[local307] == -1) {
								arg5.method992(local336, local340, local344, local324, local328, local332, local259.anIntArray663[local312], local259.anIntArray663[local316], local259.anIntArray663[local320]);
							} else {
								local369 = this.aClass82_Sub1_7.method2071(local259.aShortArray99[local307]);
								arg5.method993(local336, local340, local344, local324, local328, local332, local369, local369, local369);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean96 = true;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "()V")
	@Override
	public void method4063() {
		this.aByteArrayArray16 = null;
		this.aByteArrayArray15 = null;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method4064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass140ArrayArray1 == null) {
			this.aClass140ArrayArray1 = new Class140[super.anInt4627][super.anInt4626];
			this.aClass197ArrayArray1 = new Class197[super.anInt4627][super.anInt4626];
		} else if (this.aClass205ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static198.anIntArray439[Static272.method4279(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static198.anIntArray439[Static272.method4279(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == this.anInt4638 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == this.anInt4638 && arg4[local116] == this.anInt4638) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == this.anInt4638) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + this.anInt4638 && arg2[local244] != arg2[0] - this.anInt4638) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + this.anInt4638 && arg4[local244] != arg4[0] - this.anInt4638) {
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
			@Pc(334) Class140 local334 = new Class140();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt3340 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte28 = (byte) (local334.aByte28 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray37[arg0][arg1] == this.anIntArrayArray37[arg0 + 1][arg1] && this.anIntArrayArray37[arg0][arg1] == this.anIntArrayArray37[arg0 + 1][arg1 + 1] && this.anIntArrayArray37[arg0][arg1] == this.anIntArrayArray37[arg0][arg1 + 1]) {
				local334.aByte28 = (byte) (local334.aByte28 | 0x1);
			}
			if (local342 == -1 || (local334.aByte28 & 0x2) != 0 || this.aClass82_Sub1_7.anInterface1_4.method2849(local342).aBoolean366) {
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
				local334.anInt3339 = Static14.method436(arg10, Static401.method4071(arg6[local104] >> 8, this.aByteArrayArray16[arg0][arg1] - this.aByteArrayArray15[arg0][arg1]), local527);
				if (local334.anInt3340 != 0) {
					local334.anInt3339 |= this.aByteArrayArray15[arg0][arg1] + 255 - this.aByteArrayArray16[arg0][arg1] << 25;
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
				local334.anInt3341 = Static14.method436(arg10, Static401.method4071(arg6[local106] >> 8, this.aByteArrayArray16[arg0 + 1][arg1] - this.aByteArrayArray15[arg0 + 1][arg1]), local527);
				if (local334.anInt3340 != 0) {
					local334.anInt3341 |= this.aByteArrayArray15[arg0 + 1][arg1] + 255 - this.aByteArrayArray16[arg0 + 1][arg1] << 25;
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
				local334.anInt3338 = Static14.method436(arg10, Static401.method4071(arg6[local108] >> 8, this.aByteArrayArray16[arg0 + 1][arg1 + 1] - this.aByteArrayArray15[arg0 + 1][arg1 + 1]), local527);
				if (local334.anInt3340 != 0) {
					local334.anInt3338 |= this.aByteArrayArray15[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray16[arg0 + 1][arg1 + 1] << 25;
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
				local334.anInt3337 = Static14.method436(arg10, Static401.method4071(arg6[local110] >> 8, this.aByteArrayArray16[arg0][arg1 + 1] - this.aByteArrayArray15[arg0][arg1 + 1]), local527);
				if (local334.anInt3340 != 0) {
					local334.anInt3337 |= this.aByteArrayArray15[arg0][arg1 + 1] + 255 - this.aByteArrayArray16[arg0][arg1 + 1] << 25;
				}
				local334.aShort30 = -1;
			} else {
				local334.anInt3339 = this.aByteArrayArray16[arg0][arg1] - this.aByteArrayArray15[arg0][arg1];
				local334.anInt3341 = this.aByteArrayArray16[arg0 + 1][arg1] - this.aByteArrayArray15[arg0 + 1][arg1];
				local334.anInt3338 = this.aByteArrayArray16[arg0 + 1][arg1 + 1] - this.aByteArrayArray15[arg0 + 1][arg1 + 1];
				local334.anInt3337 = this.aByteArrayArray16[arg0][arg1 + 1] - this.aByteArrayArray15[arg0][arg1 + 1];
				local334.aShort30 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort29 = (short) arg5[local108];
				local334.aShort31 = (short) arg5[local110];
				local334.aShort32 = (short) arg5[local106];
				local334.aShort28 = (short) arg5[local104];
			}
			this.aClass140ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class197 local888 = new Class197();
		local888.aShort80 = (short) arg2.length;
		local888.aShort79 = (short) (arg2.length / 3);
		local888.aShortArray97 = new short[local888.aShort80];
		local888.aShortArray95 = new short[local888.aShort80];
		local888.aShortArray98 = new short[local888.aShort80];
		local888.anIntArray663 = new int[local888.aShort80];
		if (arg5 != null) {
			local888.aShortArray100 = new short[local888.aShort80];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort80; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray16[arg0][arg1] - this.aByteArrayArray15[arg0][arg1];
			} else if (local342 == 0 && local527 == this.anInt4638) {
				local958 = this.aByteArrayArray16[arg0][arg1 + 1] - this.aByteArrayArray15[arg0][arg1 + 1];
			} else if (local342 == this.anInt4638 && local527 == this.anInt4638) {
				local958 = this.aByteArrayArray16[arg0 + 1][arg1 + 1] - this.aByteArrayArray15[arg0 + 1][arg1 + 1];
			} else if (local342 == this.anInt4638 && local527 == 0) {
				local958 = this.aByteArrayArray16[arg0 + 1][arg1] - this.aByteArrayArray15[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray16[arg0][arg1] - this.aByteArrayArray15[arg0][arg1]) * (this.anInt4638 - local342) + (this.aByteArrayArray16[arg0 + 1][arg1] - this.aByteArrayArray15[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray16[arg0][arg1 + 1] - this.aByteArrayArray15[arg0][arg1 + 1]) * (this.anInt4638 - local342) + (this.aByteArrayArray16[arg0 + 1][arg1 + 1] - this.aByteArrayArray15[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (this.anInt4638 - local527) + local1126 * local527 >> this.anInt4634 * 2;
			}
			@Pc(1150) short local1150 = (short) ((arg0 << this.anInt4634) + local342);
			@Pc(1158) short local1158 = (short) ((arg1 << this.anInt4634) + local527);
			local888.aShortArray97[local244] = local1150;
			local888.aShortArray98[local244] = local1158;
			local888.aShortArray95[local244] = (short) (this.method4055(local1150, local1158) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass82_Sub1_7.anInterface1_4.method2849(arg8[local244]).aBoolean366) {
				local888.anIntArray663[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray100[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray663[local244] = Static14.method436(arg10, Static401.method4071(arg6[local244] >> 8, local958), local1226);
				if (arg7 != null) {
					local888.anIntArray663[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray663[local244] = 0;
			} else {
				local888.anIntArray663[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort79; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass82_Sub1_7.anInterface1_4.method2849(arg8[local527 * 3]).aBoolean366) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray664 = new int[local888.aShort79];
		}
		if (local1296) {
			local888.aShortArray99 = new short[local888.aShort79];
			local888.aShortArray96 = new short[local888.aShort79];
		}
		for (local958 = 0; local958 < local888.aShort79; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray664[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass82_Sub1_7.anInterface1_4.method2849(local1384).aBoolean366) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass82_Sub1_7.anInterface1_4.method2849(local1384).aBoolean366) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass82_Sub1_7.anInterface1_4.method2849(local1384).aBoolean366) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray99[local958] = (short) local1384;
					local888.aShortArray96[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass82_Sub1_7.anInterface1_4.method2849(local1384).aBoolean366) {
							local888.anIntArray663[local1079] = Static198.anIntArray439[Static272.method4279(this.aClass82_Sub1_7.anInterface1_4.method2849(local1384).aShort70 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass82_Sub1_7.anInterface1_4.method2849(local1384).aBoolean366) {
							local888.anIntArray663[local1126] = Static198.anIntArray439[Static272.method4279(this.aClass82_Sub1_7.anInterface1_4.method2849(local1384).aShort70 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass82_Sub1_7.anInterface1_4.method2849(local1384).aBoolean366) {
							local888.anIntArray663[local1226] = Static198.anIntArray439[Static272.method4279(this.aClass82_Sub1_7.anInterface1_4.method2849(local1384).aShort70 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray99[local958] = -1;
				}
			}
		}
		this.aClass197ArrayArray1[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IILclient!db;[I[I[I)V")
	private void method4073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class44 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class205 local6 = this.aClass205ArrayArray1[arg0][arg1];
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
			@Pc(996) Class9 local996 = this.aClass9ArrayArray1[arg0][arg1];
			if (local996 != null) {
				for (local349 = 0; local349 < local996.aShort2; local349++) {
					local24 = local996.anIntArray19[local349];
					local29 = local996.anIntArray21[local349];
					local34 = local996.anIntArray22[local349];
					local293 = this.anInt4630 + (this.anInt4632 * local24 + this.anInt4640 * local29 + this.anInt4633 * local34 >> 15);
					if (local293 <= this.aClass82_Sub1_7.anInt2123) {
						return;
					}
					local181 = this.anInt4641 + (this.anInt4629 * local24 + this.anInt4631 * local29 + this.anInt4636 * local34 >> 15);
					local237 = this.anInt4637 + (this.anInt4639 * local24 + this.anInt4642 * local29 + this.anInt4635 * local34 >> 15);
					arg3[local349] = arg2.anInt1035 + local181 * this.aClass82_Sub1_7.anInt2099 / local293;
					arg4[local349] = arg2.anInt1037 + local237 * this.aClass82_Sub1_7.anInt2111 / local293;
				}
				if (local996.aShortArray4 != null) {
					local209 = this.anIntArrayArray37[arg0][arg1];
					local265 = this.anIntArrayArray37[arg0 + 1][arg1];
					local321 = this.anIntArrayArray37[arg0][arg1 + 1];
					local377 = arg0 * this.anInt4638;
					local170 = local377 + this.anInt4638;
					local226 = arg1 * this.anInt4638;
					local282 = local226 + this.anInt4638;
					local338 = this.anInt4641 + (this.anInt4629 * local377 + this.anInt4631 * local209 + this.anInt4636 * local226 >> 15);
					local198 = this.anInt4637 + (this.anInt4639 * local377 + this.anInt4642 * local209 + this.anInt4635 * local226 >> 15);
					local254 = this.anInt4630 + (this.anInt4632 * local377 + this.anInt4640 * local209 + this.anInt4633 * local226 >> 15);
					local310 = this.anInt4641 + (this.anInt4629 * local170 + this.anInt4631 * local265 + this.anInt4636 * local226 >> 15);
					local366 = this.anInt4637 + (this.anInt4639 * local170 + this.anInt4642 * local265 + this.anInt4635 * local226 >> 15);
					local68 = this.anInt4630 + (this.anInt4632 * local170 + this.anInt4640 * local265 + this.anInt4633 * local226 >> 15);
					local91 = this.anInt4641 + (this.anInt4629 * local377 + this.anInt4631 * local321 + this.anInt4636 * local282 >> 15);
					local114 = this.anInt4637 + (this.anInt4639 * local377 + this.anInt4642 * local321 + this.anInt4635 * local282 >> 15);
					local137 = this.anInt4630 + (this.anInt4632 * local377 + this.anInt4640 * local321 + this.anInt4633 * local282 >> 15);
					for (local46 = 0; local46 < local996.aShort1; local46++) {
						@Pc(1349) short local1349 = local996.aShortArray6[local46];
						@Pc(1354) short local1354 = local996.aShortArray3[local46];
						@Pc(1359) short local1359 = local996.aShortArray5[local46];
						@Pc(1363) int local1363 = arg3[local1349];
						@Pc(1367) int local1367 = arg3[local1354];
						@Pc(1371) int local1371 = arg3[local1359];
						@Pc(1375) int local1375 = arg4[local1349];
						@Pc(1379) int local1379 = arg4[local1354];
						@Pc(1383) int local1383 = arg4[local1359];
						if ((local1363 - local1367) * (local1383 - local1379) - (local1375 - local1379) * (local1371 - local1367) > 0) {
							arg2.aBoolean95 = local1363 < 0 || local1367 < 0 || local1371 < 0 || local1363 > arg2.anInt1036 || local1367 > arg2.anInt1036 || local1371 > arg2.anInt1036;
							@Pc(1427) short local1427 = local996.aShortArray4[local46];
							if (local1427 == -1) {
								@Pc(1482) int local1482 = local996.anIntArray23[local46];
								if (local1482 != -1) {
									arg2.method993(local1375, local1379, local1383, local1363, local1367, local1371, Static362.method5518(local996.aShortArray2[local1349], local1482), Static362.method5518(local996.aShortArray2[local1354], local1482), Static362.method5518(local996.aShortArray2[local1359], local1482));
								}
							} else {
								if (this.method4075(this.aClass82_Sub1_7.anInterface1_4.method2849(local1427).aByte47)) {
									arg2.anInt1038 = 100;
								}
								arg2.method987(local1375, local1379, local1383, local1363, local1367, local1371, local996.aShortArray2[local1349], local996.aShortArray2[local1354], local996.aShortArray2[local1359], local338, local310, local91, local198, local366, local114, local254, local68, local137, local1427);
								arg2.anInt1038 = 0;
							}
						}
					}
					return;
				}
				for (local209 = 0; local209 < local996.aShort1; local209++) {
					@Pc(1528) short local1528 = local996.aShortArray6[local209];
					@Pc(1533) short local1533 = local996.aShortArray3[local209];
					@Pc(1538) short local1538 = local996.aShortArray5[local209];
					local170 = arg3[local1528];
					local226 = arg3[local1533];
					local282 = arg3[local1538];
					local338 = arg4[local1528];
					local198 = arg4[local1533];
					local254 = arg4[local1538];
					if ((local170 - local226) * (local254 - local198) - (local338 - local198) * (local282 - local226) > 0) {
						local310 = local996.anIntArray23[local209];
						if (local310 != -1) {
							arg2.aBoolean95 = local170 < 0 || local226 < 0 || local282 < 0 || local170 > arg2.anInt1036 || local226 > arg2.anInt1036 || local282 > arg2.anInt1036;
							arg2.method993(local338, local198, local254, local170, local226, local282, Static362.method5518(local996.aShortArray2[local1528], local310), Static362.method5518(local996.aShortArray2[local1533], local310), Static362.method5518(local996.aShortArray2[local1538], local310));
						}
					}
				}
			}
		} else if ((local6.aByte63 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt4638;
			local24 = local19 + this.anInt4638;
			local29 = arg1 * this.anInt4638;
			local34 = local29 + this.anInt4638;
			@Pc(51) int local51;
			@Pc(148) int local148;
			@Pc(153) int local153;
			if ((local6.aByte63 & 0x1) == 0) {
				local46 = this.anIntArrayArray37[arg0][arg1];
				local51 = this.anIntArrayArray37[arg0 + 1][arg1];
				local148 = this.anIntArrayArray37[arg0 + 1][arg1 + 1];
				local153 = this.anIntArrayArray37[arg0][arg1 + 1];
				local68 = this.anInt4630 + (this.anInt4632 * local19 + this.anInt4640 * local46 + this.anInt4633 * local29 >> 15);
				if (local68 <= this.aClass82_Sub1_7.anInt2123) {
					return;
				}
				local91 = this.anInt4630 + (this.anInt4632 * local24 + this.anInt4640 * local51 + this.anInt4633 * local29 >> 15);
				if (local91 <= this.aClass82_Sub1_7.anInt2123) {
					return;
				}
				local114 = this.anInt4630 + (this.anInt4632 * local24 + this.anInt4640 * local148 + this.anInt4633 * local34 >> 15);
				if (local114 <= this.aClass82_Sub1_7.anInt2123) {
					return;
				}
				local137 = this.anInt4630 + (this.anInt4632 * local19 + this.anInt4640 * local153 + this.anInt4633 * local34 >> 15);
				if (local137 <= this.aClass82_Sub1_7.anInt2123) {
					return;
				}
				local170 = this.anInt4641 + (this.anInt4629 * local19 + this.anInt4631 * local46 + this.anInt4636 * local29 >> 15);
				local181 = arg2.anInt1035 + local170 * this.aClass82_Sub1_7.anInt2099 / local68;
				local198 = this.anInt4637 + (this.anInt4639 * local19 + this.anInt4642 * local46 + this.anInt4635 * local29 >> 15);
				local209 = arg2.anInt1037 + local198 * this.aClass82_Sub1_7.anInt2111 / local68;
				local226 = this.anInt4641 + (this.anInt4629 * local24 + this.anInt4631 * local51 + this.anInt4636 * local29 >> 15);
				local237 = arg2.anInt1035 + local226 * this.aClass82_Sub1_7.anInt2099 / local91;
				local254 = this.anInt4637 + (this.anInt4639 * local24 + this.anInt4642 * local51 + this.anInt4635 * local29 >> 15);
				local265 = arg2.anInt1037 + local254 * this.aClass82_Sub1_7.anInt2111 / local91;
				local282 = this.anInt4641 + (this.anInt4629 * local24 + this.anInt4631 * local148 + this.anInt4636 * local34 >> 15);
				local293 = arg2.anInt1035 + local282 * this.aClass82_Sub1_7.anInt2099 / local114;
				local310 = this.anInt4637 + (this.anInt4639 * local24 + this.anInt4642 * local148 + this.anInt4635 * local34 >> 15);
				local321 = arg2.anInt1037 + local310 * this.aClass82_Sub1_7.anInt2111 / local114;
				local338 = this.anInt4641 + (this.anInt4629 * local19 + this.anInt4631 * local153 + this.anInt4636 * local34 >> 15);
				local349 = arg2.anInt1035 + local338 * this.aClass82_Sub1_7.anInt2099 / local137;
				local366 = this.anInt4637 + (this.anInt4639 * local19 + this.anInt4642 * local153 + this.anInt4635 * local34 >> 15);
				local377 = arg2.anInt1037 + local366 * this.aClass82_Sub1_7.anInt2111 / local137;
			} else {
				local46 = this.anIntArrayArray37[arg0][arg1];
				local51 = this.anInt4640 * local46;
				local68 = this.anInt4630 + (this.anInt4632 * local19 + local51 + this.anInt4633 * local29 >> 15);
				if (local68 <= this.aClass82_Sub1_7.anInt2123) {
					return;
				}
				local91 = this.anInt4630 + (this.anInt4632 * local24 + local51 + this.anInt4633 * local29 >> 15);
				if (local91 <= this.aClass82_Sub1_7.anInt2123) {
					return;
				}
				local114 = this.anInt4630 + (this.anInt4632 * local24 + local51 + this.anInt4633 * local34 >> 15);
				if (local114 <= this.aClass82_Sub1_7.anInt2123) {
					return;
				}
				local137 = this.anInt4630 + (this.anInt4632 * local19 + local51 + this.anInt4633 * local34 >> 15);
				if (local137 <= this.aClass82_Sub1_7.anInt2123) {
					return;
				}
				local148 = this.anInt4631 * local46;
				local153 = this.anInt4642 * local46;
				local170 = this.anInt4641 + (this.anInt4629 * local19 + local148 + this.anInt4636 * local29 >> 15);
				local181 = arg2.anInt1035 + local170 * this.aClass82_Sub1_7.anInt2099 / local68;
				local198 = this.anInt4637 + (this.anInt4639 * local19 + local153 + this.anInt4635 * local29 >> 15);
				local209 = arg2.anInt1037 + local198 * this.aClass82_Sub1_7.anInt2111 / local68;
				local226 = this.anInt4641 + (this.anInt4629 * local24 + local148 + this.anInt4636 * local29 >> 15);
				local237 = arg2.anInt1035 + local226 * this.aClass82_Sub1_7.anInt2099 / local91;
				local254 = this.anInt4637 + (this.anInt4639 * local24 + local153 + this.anInt4635 * local29 >> 15);
				local265 = arg2.anInt1037 + local254 * this.aClass82_Sub1_7.anInt2111 / local91;
				local282 = this.anInt4641 + (this.anInt4629 * local24 + local148 + this.anInt4636 * local34 >> 15);
				local293 = arg2.anInt1035 + local282 * this.aClass82_Sub1_7.anInt2099 / local114;
				local310 = this.anInt4637 + (this.anInt4639 * local24 + local153 + this.anInt4635 * local34 >> 15);
				local321 = arg2.anInt1037 + local310 * this.aClass82_Sub1_7.anInt2111 / local114;
				local338 = this.anInt4641 + (this.anInt4629 * local19 + local148 + this.anInt4636 * local34 >> 15);
				local349 = arg2.anInt1035 + local338 * this.aClass82_Sub1_7.anInt2099 / local137;
				local366 = this.anInt4637 + (this.anInt4639 * local19 + local153 + this.anInt4635 * local34 >> 15);
				local377 = arg2.anInt1037 + local366 * this.aClass82_Sub1_7.anInt2111 / local137;
			}
			if ((local293 - local349) * (local265 - local377) - (local321 - local377) * (local237 - local349) > 0) {
				arg2.aBoolean95 = local293 < 0 || local349 < 0 || local237 < 0 || local293 > arg2.anInt1036 || local349 > arg2.anInt1036 || local237 > arg2.anInt1036;
				if (local6.aShort86 >= 0) {
					if (this.method4075(this.aClass82_Sub1_7.anInterface1_4.method2849(local6.aShort86).aByte47)) {
						arg2.anInt1038 = 100;
					}
					arg2.method987(local321, local377, local265, local293, local349, local237, local6.aShort89 & 0xFFFF, local6.aShort85 & 0xFFFF, local6.aShort88 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort86);
					arg2.anInt1038 = 0;
				} else {
					arg2.method993(local321, local377, local265, local293, local349, local237, local6.aShort89 & 0xFFFF, local6.aShort85 & 0xFFFF, local6.aShort88 & 0xFFFF);
				}
			}
			if ((local181 - local237) * (local377 - local265) - (local209 - local265) * (local349 - local237) > 0) {
				arg2.aBoolean95 = local181 < 0 || local237 < 0 || local349 < 0 || local181 > arg2.anInt1036 || local237 > arg2.anInt1036 || local349 > arg2.anInt1036;
				if (local6.aShort86 >= 0) {
					if (this.method4075(this.aClass82_Sub1_7.anInterface1_4.method2849(local6.aShort86).aByte47)) {
						arg2.anInt1038 = 100;
					}
					arg2.method987(local209, local265, local377, local181, local237, local349, local6.aShort87 & 0xFFFF, local6.aShort88 & 0xFFFF, local6.aShort85 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort86);
					arg2.anInt1038 = 0;
					return;
				}
				arg2.method993(local209, local265, local377, local181, local237, local349, local6.aShort87 & 0xFFFF, local6.aShort88 & 0xFFFF, local6.aShort85 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(II)I")
	@Override
	public int method4057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray37[arg0][arg1];
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIZLclient!db;[I[I[I)V")
	private void method4074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class44 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class140 local6 = this.aClass140ArrayArray1[arg0][arg1];
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
		@Pc(616) int local616;
		if (local6 == null) {
			@Pc(1426) Class197 local1426 = this.aClass197ArrayArray1[arg0][arg1];
			if (local1426 != null) {
				for (local423 = 0; local423 < local1426.aShort80; local423++) {
					@Pc(1436) short local1436 = local1426.aShortArray97[local423];
					local29 = local1426.aShortArray95[local423];
					@Pc(1446) short local1446 = local1426.aShortArray98[local423];
					local367 = this.anInt4630 + (this.anInt4632 * local1436 + this.anInt4640 * local29 + this.anInt4633 * local1446 >> 15);
					if (local367 <= this.aClass82_Sub1_7.anInt2123) {
						return;
					}
					arg6[local423] = 0;
					if (arg2) {
						local283 = local367 - this.aClass82_Sub1_7.anInt2102;
						if (local283 > 255) {
							local283 = 255;
						}
						if (local283 > 0) {
							arg6[local423] = local283;
							local339 = local1426.aShortArray100[local423] * local283 / 255;
							if (local339 > 0) {
								local29 -= local339;
							}
						}
					} else if (this.aClass82_Sub1_7.aBoolean163) {
						local283 = local367 - this.aClass82_Sub1_7.anInt2102;
						if (local283 > 0) {
							arg6[local423] = local283;
							if (arg6[local423] > 255) {
								arg6[local423] = 255;
							}
						}
					}
					local255 = this.anInt4641 + (this.anInt4629 * local1436 + this.anInt4631 * local29 + this.anInt4636 * local1446 >> 15);
					local311 = this.anInt4637 + (this.anInt4639 * local1436 + this.anInt4642 * local29 + this.anInt4635 * local1446 >> 15);
					arg4[local423] = arg3.anInt1035 + local255 * this.aClass82_Sub1_7.anInt2099 / local367;
					arg5[local423] = arg3.anInt1037 + local311 * this.aClass82_Sub1_7.anInt2111 / local367;
				}
				if (local1426.aShortArray99 != null) {
					local283 = this.anIntArrayArray37[arg0][arg1];
					local339 = this.anIntArrayArray37[arg0 + 1][arg1];
					local395 = this.anIntArrayArray37[arg0][arg1 + 1];
					local451 = arg0 * this.anInt4638;
					local244 = local451 + this.anInt4638;
					local300 = arg1 * this.anInt4638;
					local356 = local300 + this.anInt4638;
					local412 = this.anInt4641 + (this.anInt4629 * local451 + this.anInt4631 * local283 + this.anInt4636 * local300 >> 15);
					local272 = this.anInt4637 + (this.anInt4639 * local451 + this.anInt4642 * local283 + this.anInt4635 * local300 >> 15);
					local328 = this.anInt4630 + (this.anInt4632 * local451 + this.anInt4640 * local283 + this.anInt4633 * local300 >> 15);
					local384 = this.anInt4641 + (this.anInt4629 * local244 + this.anInt4631 * local339 + this.anInt4636 * local300 >> 15);
					local440 = this.anInt4637 + (this.anInt4639 * local244 + this.anInt4642 * local339 + this.anInt4635 * local300 >> 15);
					local78 = this.anInt4630 + (this.anInt4632 * local244 + this.anInt4640 * local339 + this.anInt4633 * local300 >> 15);
					local101 = this.anInt4641 + (this.anInt4629 * local451 + this.anInt4631 * local395 + this.anInt4636 * local356 >> 15);
					local124 = this.anInt4637 + (this.anInt4639 * local451 + this.anInt4642 * local395 + this.anInt4635 * local356 >> 15);
					local147 = this.anInt4630 + (this.anInt4632 * local451 + this.anInt4640 * local395 + this.anInt4633 * local356 >> 15);
					for (local36 = 0; local36 < local1426.aShort79; local36++) {
						local38 = local36 * 3;
						local40 = local38 + 1;
						local42 = local40 + 1;
						local163 = arg4[local38];
						local56 = arg4[local40];
						local61 = arg4[local42];
						local222 = arg5[local38];
						local227 = arg5[local40];
						local616 = arg5[local42];
						@Pc(1886) int local1886 = arg6[local38] + arg6[local40] + arg6[local42];
						if ((local163 - local56) * (local616 - local227) - (local222 - local227) * (local61 - local56) > 0) {
							arg3.aBoolean95 = local163 < 0 || local56 < 0 || local61 < 0 || local163 > arg3.anInt1036 || local56 > arg3.anInt1036 || local61 > arg3.anInt1036;
							@Pc(1930) short local1930 = local1426.aShortArray99[local36];
							if (local1886 < 765) {
								if (local1930 != -1 && this.method4075(this.aClass82_Sub1_7.anInterface1_4.method2849(local1930).aByte47)) {
									arg3.anInt1038 = 100;
								}
								if (local1886 > 0) {
									if (local1930 != -1) {
										arg3.method983(local222, local227, local616, local163, local56, local61, this.aClass82_Sub1_7.anInt2106, arg6[local38], arg6[local40], arg6[local42], local1426.anIntArray663[local38], local1426.anIntArray663[local40], local1426.anIntArray663[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1930);
									} else if ((local1426.anIntArray663[local38] & 0xFFFFFF) != 0) {
										arg3.method992(local222, local227, local616, local163, local56, local61, Static333.method5091(local1426.anIntArray663[local38], arg6[local38] << 24 | this.aClass82_Sub1_7.anInt2106), Static333.method5091(local1426.anIntArray663[local40], arg6[local40] << 24 | this.aClass82_Sub1_7.anInt2106), Static333.method5091(local1426.anIntArray663[local42], arg6[local42] << 24 | this.aClass82_Sub1_7.anInt2106));
									}
								} else if (local1930 != -1) {
									arg3.method987(local222, local227, local616, local163, local56, local61, local1426.anIntArray663[local38], local1426.anIntArray663[local40], local1426.anIntArray663[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1930);
								} else if ((local1426.anIntArray663[local38] & 0xFFFFFF) != 0) {
									arg3.method992(local222, local227, local616, local163, local56, local61, local1426.anIntArray663[local38], local1426.anIntArray663[local40], local1426.anIntArray663[local42]);
								}
								arg3.anInt1038 = 0;
							} else {
								arg3.method989(local222, local227, local616, local163, local56, local61, this.aClass82_Sub1_7.anInt2106);
							}
						}
					}
					return;
				}
				for (local283 = 0; local283 < local1426.aShort79; local283++) {
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
						arg3.aBoolean95 = local244 < 0 || local300 < 0 || local356 < 0 || local244 > arg3.anInt1036 || local300 > arg3.anInt1036 || local356 > arg3.anInt1036;
						if (local384 >= 765) {
							arg3.method989(local412, local272, local328, local244, local300, local356, this.aClass82_Sub1_7.anInt2106);
						} else if (local384 > 0) {
							if ((local1426.anIntArray663[local339] & 0xFFFFFF) != 0) {
								arg3.method992(local412, local272, local328, local244, local300, local356, Static14.method436(this.aClass82_Sub1_7.anInt2106, local1426.anIntArray663[local339], arg6[local339]), Static14.method436(this.aClass82_Sub1_7.anInt2106, local1426.anIntArray663[local395], arg6[local395]), Static14.method436(this.aClass82_Sub1_7.anInt2106, local1426.anIntArray663[local451], arg6[local451]));
							}
						} else if ((local1426.anIntArray663[local339] & 0xFFFFFF) != 0) {
							arg3.method992(local412, local272, local328, local244, local300, local356, local1426.anIntArray663[local339], local1426.anIntArray663[local395], local1426.anIntArray663[local451]);
						}
					}
				}
			}
		} else if ((local6.aByte28 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt4638;
			@Pc(24) int local24 = local19 + this.anInt4638;
			local29 = arg1 * this.anInt4638;
			@Pc(34) int local34 = local29 + this.anInt4638;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte28 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray37[arg0][arg1];
				local61 = this.anIntArrayArray37[arg0 + 1][arg1];
				local222 = this.anIntArrayArray37[arg0 + 1][arg1 + 1];
				local227 = this.anIntArrayArray37[arg0][arg1 + 1];
				local78 = this.anInt4630 + (this.anInt4632 * local19 + this.anInt4640 * local56 + this.anInt4633 * local29 >> 15);
				if (local78 <= this.aClass82_Sub1_7.anInt2123) {
					return;
				}
				local101 = this.anInt4630 + (this.anInt4632 * local24 + this.anInt4640 * local61 + this.anInt4633 * local29 >> 15);
				if (local101 <= this.aClass82_Sub1_7.anInt2123) {
					return;
				}
				local124 = this.anInt4630 + (this.anInt4632 * local24 + this.anInt4640 * local222 + this.anInt4633 * local34 >> 15);
				if (local124 <= this.aClass82_Sub1_7.anInt2123) {
					return;
				}
				local147 = this.anInt4630 + (this.anInt4632 * local19 + this.anInt4640 * local227 + this.anInt4633 * local34 >> 15);
				if (local147 <= this.aClass82_Sub1_7.anInt2123) {
					return;
				}
				if (arg2) {
					local163 = local78 - this.aClass82_Sub1_7.anInt2102;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local36 = local163;
						local616 = local6.aShort28 * local163 / 255;
						if (local616 > 0) {
							local56 -= local616;
						}
					}
					local163 = local101 - this.aClass82_Sub1_7.anInt2102;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local38 = local163;
						local616 = local6.aShort32 * local163 / 255;
						if (local616 > 0) {
							local61 -= local616;
						}
					}
					local163 = local124 - this.aClass82_Sub1_7.anInt2102;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local40 = local163;
						local616 = local6.aShort29 * local163 / 255;
						if (local616 > 0) {
							local222 -= local616;
						}
					}
					local163 = local147 - this.aClass82_Sub1_7.anInt2102;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local42 = local163;
						local616 = local6.aShort31 * local163 / 255;
						if (local616 > 0) {
							local227 -= local616;
						}
					}
				} else if (this.aClass82_Sub1_7.aBoolean163) {
					local163 = local78 - this.aClass82_Sub1_7.anInt2102;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass82_Sub1_7.anInt2102;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass82_Sub1_7.anInt2102;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass82_Sub1_7.anInt2102;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local244 = this.anInt4641 + (this.anInt4629 * local19 + this.anInt4631 * local56 + this.anInt4636 * local29 >> 15);
				local255 = arg3.anInt1035 + local244 * this.aClass82_Sub1_7.anInt2099 / local78;
				local272 = this.anInt4637 + (this.anInt4639 * local19 + this.anInt4642 * local56 + this.anInt4635 * local29 >> 15);
				local283 = arg3.anInt1037 + local272 * this.aClass82_Sub1_7.anInt2111 / local78;
				local300 = this.anInt4641 + (this.anInt4629 * local24 + this.anInt4631 * local61 + this.anInt4636 * local29 >> 15);
				local311 = arg3.anInt1035 + local300 * this.aClass82_Sub1_7.anInt2099 / local101;
				local328 = this.anInt4637 + (this.anInt4639 * local24 + this.anInt4642 * local61 + this.anInt4635 * local29 >> 15);
				local339 = arg3.anInt1037 + local328 * this.aClass82_Sub1_7.anInt2111 / local101;
				local356 = this.anInt4641 + (this.anInt4629 * local24 + this.anInt4631 * local222 + this.anInt4636 * local34 >> 15);
				local367 = arg3.anInt1035 + local356 * this.aClass82_Sub1_7.anInt2099 / local124;
				local384 = this.anInt4637 + (this.anInt4639 * local24 + this.anInt4642 * local222 + this.anInt4635 * local34 >> 15);
				local395 = arg3.anInt1037 + local384 * this.aClass82_Sub1_7.anInt2111 / local124;
				local412 = this.anInt4641 + (this.anInt4629 * local19 + this.anInt4631 * local227 + this.anInt4636 * local34 >> 15);
				local423 = arg3.anInt1035 + local412 * this.aClass82_Sub1_7.anInt2099 / local147;
				local440 = this.anInt4637 + (this.anInt4639 * local19 + this.anInt4642 * local227 + this.anInt4635 * local34 >> 15);
				local451 = arg3.anInt1037 + local440 * this.aClass82_Sub1_7.anInt2111 / local147;
			} else {
				local56 = this.anIntArrayArray37[arg0][arg1];
				local61 = this.anInt4640 * local56;
				local78 = this.anInt4630 + (this.anInt4632 * local19 + local61 + this.anInt4633 * local29 >> 15);
				if (local78 <= this.aClass82_Sub1_7.anInt2123) {
					return;
				}
				local101 = this.anInt4630 + (this.anInt4632 * local24 + local61 + this.anInt4633 * local29 >> 15);
				if (local101 <= this.aClass82_Sub1_7.anInt2123) {
					return;
				}
				local124 = this.anInt4630 + (this.anInt4632 * local24 + local61 + this.anInt4633 * local34 >> 15);
				if (local124 <= this.aClass82_Sub1_7.anInt2123) {
					return;
				}
				local147 = this.anInt4630 + (this.anInt4632 * local19 + local61 + this.anInt4633 * local34 >> 15);
				if (local147 <= this.aClass82_Sub1_7.anInt2123) {
					return;
				}
				if (this.aClass82_Sub1_7.aBoolean163) {
					local163 = local78 - this.aClass82_Sub1_7.anInt2102;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass82_Sub1_7.anInt2102;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass82_Sub1_7.anInt2102;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass82_Sub1_7.anInt2102;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local222 = this.anInt4631 * local56;
				local227 = this.anInt4642 * local56;
				local244 = this.anInt4641 + (this.anInt4629 * local19 + local222 + this.anInt4636 * local29 >> 15);
				local255 = arg3.anInt1035 + local244 * this.aClass82_Sub1_7.anInt2099 / local78;
				local272 = this.anInt4637 + (this.anInt4639 * local19 + local227 + this.anInt4635 * local29 >> 15);
				local283 = arg3.anInt1037 + local272 * this.aClass82_Sub1_7.anInt2111 / local78;
				local300 = this.anInt4641 + (this.anInt4629 * local24 + local222 + this.anInt4636 * local29 >> 15);
				local311 = arg3.anInt1035 + local300 * this.aClass82_Sub1_7.anInt2099 / local101;
				local328 = this.anInt4637 + (this.anInt4639 * local24 + local227 + this.anInt4635 * local29 >> 15);
				local339 = arg3.anInt1037 + local328 * this.aClass82_Sub1_7.anInt2111 / local101;
				local356 = this.anInt4641 + (this.anInt4629 * local24 + local222 + this.anInt4636 * local34 >> 15);
				local367 = arg3.anInt1035 + local356 * this.aClass82_Sub1_7.anInt2099 / local124;
				local384 = this.anInt4637 + (this.anInt4639 * local24 + local227 + this.anInt4635 * local34 >> 15);
				local395 = arg3.anInt1037 + local384 * this.aClass82_Sub1_7.anInt2111 / local124;
				local412 = this.anInt4641 + (this.anInt4629 * local19 + local222 + this.anInt4636 * local34 >> 15);
				local423 = arg3.anInt1035 + local412 * this.aClass82_Sub1_7.anInt2099 / local147;
				local440 = this.anInt4637 + (this.anInt4639 * local19 + local227 + this.anInt4635 * local34 >> 15);
				local451 = arg3.anInt1037 + local440 * this.aClass82_Sub1_7.anInt2111 / local147;
			}
			@Pc(1038) boolean local1038 = local6.aShort30 != -1 && this.method4075(this.aClass82_Sub1_7.anInterface1_4.method2849(local6.aShort30).aByte47);
			local61 = local38 + local40 + local42;
			if ((local367 - local423) * (local339 - local451) - (local395 - local451) * (local311 - local423) > 0) {
				arg3.aBoolean95 = local367 < 0 || local423 < 0 || local311 < 0 || local367 > arg3.anInt1036 || local423 > arg3.anInt1036 || local311 > arg3.anInt1036;
				if (local61 < 765) {
					if (local1038) {
						arg3.anInt1038 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort30 >= 0) {
							arg3.method983(local395, local451, local339, local367, local423, local311, this.aClass82_Sub1_7.anInt2106, local40, local42, local38, local6.anInt3338, local6.anInt3337, local6.anInt3341, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort30);
						} else {
							arg3.method992(local395, local451, local339, local367, local423, local311, Static333.method5091(local6.anInt3338, local40 << 24 | this.aClass82_Sub1_7.anInt2106), Static333.method5091(local6.anInt3337, local42 << 24 | this.aClass82_Sub1_7.anInt2106), Static333.method5091(local6.anInt3341, local38 << 24 | this.aClass82_Sub1_7.anInt2106));
						}
					} else if (local6.aShort30 >= 0) {
						arg3.method987(local395, local451, local339, local367, local423, local311, local6.anInt3338, local6.anInt3337, local6.anInt3341, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort30);
					} else {
						arg3.method992(local395, local451, local339, local367, local423, local311, local6.anInt3338, local6.anInt3337, local6.anInt3341);
					}
					arg3.anInt1038 = 0;
				} else {
					arg3.method989(local395, local451, local339, local367, local423, local311, this.aClass82_Sub1_7.anInt2106);
				}
			}
			local61 = local36 + local38 + local42;
			if ((local255 - local311) * (local451 - local339) - (local283 - local339) * (local423 - local311) > 0) {
				arg3.aBoolean95 = local255 < 0 || local311 < 0 || local423 < 0 || local255 > arg3.anInt1036 || local311 > arg3.anInt1036 || local423 > arg3.anInt1036;
				if (local61 < 765) {
					if (local1038) {
						arg3.anInt1038 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort30 >= 0) {
							arg3.method983(local283, local339, local451, local255, local311, local423, this.aClass82_Sub1_7.anInt2106, local36, local38, local42, local6.anInt3339, local6.anInt3341, local6.anInt3337, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort30);
						} else {
							arg3.method992(local283, local339, local451, local255, local311, local423, Static333.method5091(local6.anInt3339, local36 << 24 | this.aClass82_Sub1_7.anInt2106), Static333.method5091(local6.anInt3341, local38 << 24 | this.aClass82_Sub1_7.anInt2106), Static333.method5091(local6.anInt3337, local42 << 24 | this.aClass82_Sub1_7.anInt2106));
						}
					} else if (local6.aShort30 >= 0) {
						arg3.method987(local283, local339, local451, local255, local311, local423, local6.anInt3339, local6.anInt3341, local6.anInt3337, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort30);
					} else {
						arg3.method992(local283, local339, local451, local255, local311, local423, local6.anInt3339, local6.anInt3341, local6.anInt3337);
					}
					arg3.anInt1038 = 0;
					return;
				}
				arg3.method989(local283, local339, local451, local255, local311, local423, this.aClass82_Sub1_7.anInt2106);
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I)Z")
	private boolean method4075(@OriginalArg(0) int arg0) {
		if ((this.anInt4628 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else {
			return arg0 == 8;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!rc;[I)V")
	@Override
	public void method4061(@OriginalArg(0) Class2_Sub14 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method4066(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class18 local4 = this.aClass82_Sub1_7.method2068(Thread.currentThread());
		@Pc(7) Class44 local7 = local4.aClass44_1;
		local7.anInt1038 = 0;
		local7.aBoolean95 = false;
		if (this.aClass140ArrayArray1 != null) {
			this.method4072(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray56, local4.anIntArray51);
		} else if (this.aClass205ArrayArray1 != null) {
			this.method4076(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray56, local4.anIntArray51);
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method4065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass205ArrayArray1 == null) {
			this.aClass205ArrayArray1 = new Class205[super.anInt4627][super.anInt4626];
			this.aClass9ArrayArray1 = new Class9[super.anInt4627][super.anInt4626];
		} else if (this.aClass140ArrayArray1 != null) {
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
				if (local64 != 0 && local64 != this.anInt4638 || local70 != 0 && local70 != this.anInt4638) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class9 local95 = new Class9();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort2 = local99;
			local95.aShortArray2 = new short[local99];
			local95.anIntArray19 = new int[local99];
			local95.anIntArray21 = new int[local99];
			local95.anIntArray22 = new int[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray2[local124] = (short) (this.aByteArrayArray16[arg0][arg1] - this.aByteArrayArray15[arg0][arg1]);
				} else if (local129 == 0 && local133 == this.anInt4638) {
					local95.aShortArray2[local124] = (short) (this.aByteArrayArray16[arg0][arg1 + 1] - this.aByteArrayArray15[arg0][arg1 + 1]);
				} else if (local129 == this.anInt4638 && local133 == this.anInt4638) {
					local95.aShortArray2[local124] = (short) (this.aByteArrayArray16[arg0 + 1][arg1 + 1] - this.aByteArrayArray15[arg0 + 1][arg1 + 1]);
				} else if (local129 == this.anInt4638 && local133 == 0) {
					local95.aShortArray2[local124] = (short) (this.aByteArrayArray16[arg0 + 1][arg1] - this.aByteArrayArray15[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray16[arg0][arg1] - this.aByteArrayArray15[arg0][arg1]) * (this.anInt4638 - local129) + (this.aByteArrayArray16[arg0 + 1][arg1] - this.aByteArrayArray15[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray16[arg0][arg1 + 1] - this.aByteArrayArray15[arg0][arg1 + 1]) * (this.anInt4638 - local129) + (this.aByteArrayArray16[arg0 + 1][arg1 + 1] - this.aByteArrayArray15[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray2[local124] = (short) (local288 * (this.anInt4638 - local133) + local335 * local133 >> this.anInt4634 * 2);
				}
				local288 = (arg0 << this.anInt4634) + local129;
				local335 = (arg1 << this.anInt4634) + local133;
				local95.anIntArray19[local124] = local288;
				local95.anIntArray22[local124] = local335;
				local95.anIntArray21[local124] = this.method4055(local288, local335) + (arg3 == null ? 0 : arg3[local124]);
				if (local95.aShortArray2[local124] < 2) {
					local95.aShortArray2[local124] = 2;
				}
			}
			@Pc(412) boolean local412 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass82_Sub1_7.anInterface1_4.method2849(arg11[local288]).aBoolean366) {
					local412 = true;
				}
			}
			local95.anIntArray23 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray20 = new int[local133];
			}
			local95.aShortArray6 = new short[local133];
			local95.aShortArray3 = new short[local133];
			local95.aShortArray5 = new short[local133];
			if (local412) {
				local95.aShortArray4 = new short[local133];
				local95.aShortArray7 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray23[local95.aShort1] = Static272.method4279(arg9[local335]);
					} else {
						local95.anIntArray23[local95.aShort1] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray20[local95.aShort1] = -1;
						} else {
							local95.anIntArray20[local95.aShort1] = Static272.method4279(arg10[local335]);
						}
					}
					local95.aShortArray6[local95.aShort1] = (short) arg6[local335];
					local95.aShortArray3[local95.aShort1] = (short) arg7[local335];
					local95.aShortArray5[local95.aShort1] = (short) arg8[local335];
					if (local412) {
						if (arg11[local335] == -1 || this.aClass82_Sub1_7.anInterface1_4.method2849(arg11[local335]).aBoolean366) {
							local95.aShortArray4[local95.aShort1] = -1;
						} else {
							local95.aShortArray4[local95.aShort1] = (short) arg11[local335];
							local95.aShortArray7[local95.aShort1] = (short) arg12[local335];
						}
					}
					local95.aShort1++;
				}
			}
			this.aClass9ArrayArray1[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(641) Class205 local641 = new Class205();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local641.anInt5634 = Static362.method5518(this.aByteArrayArray16[arg0][arg1] - this.aByteArrayArray15[arg0][arg1], Static272.method4279(arg10[0]));
				if (local64 == -1) {
					local641.aByte63 = (byte) (local641.aByte63 | 0x2);
				}
			}
			if (this.anIntArrayArray37[arg0][arg1] == this.anIntArrayArray37[arg0 + 1][arg1] && this.anIntArrayArray37[arg0][arg1] == this.anIntArrayArray37[arg0 + 1][arg1 + 1] && this.anIntArrayArray37[arg0][arg1] == this.anIntArrayArray37[arg0][arg1 + 1]) {
				local641.aByte63 = (byte) (local641.aByte63 | 0x1);
			}
			if (local70 == -1 || (local641.aByte63 & 0x2) != 0 || this.aClass82_Sub1_7.anInterface1_4.method2849(local70).aBoolean366) {
				@Pc(842) short local842 = Static272.method4279(local64);
				local641.aShort87 = (short) Static362.method5518(this.aByteArrayArray16[arg0][arg1] - this.aByteArrayArray15[arg0][arg1], local842);
				local641.aShort88 = (short) Static362.method5518(this.aByteArrayArray16[arg0 + 1][arg1] - this.aByteArrayArray15[arg0 + 1][arg1], local842);
				local641.aShort89 = (short) Static362.method5518(this.aByteArrayArray16[arg0 + 1][arg1 + 1] - this.aByteArrayArray15[arg0 + 1][arg1 + 1], local842);
				local641.aShort85 = (short) Static362.method5518(this.aByteArrayArray16[arg0][arg1 + 1] - this.aByteArrayArray15[arg0][arg1 + 1], local842);
				local641.aShort86 = -1;
			} else {
				local641.aShort87 = (short) (this.aByteArrayArray16[arg0][arg1] - this.aByteArrayArray15[arg0][arg1]);
				local641.aShort88 = (short) (this.aByteArrayArray16[arg0 + 1][arg1] - this.aByteArrayArray15[arg0 + 1][arg1]);
				local641.aShort89 = (short) (this.aByteArrayArray16[arg0 + 1][arg1 + 1] - this.aByteArrayArray15[arg0 + 1][arg1 + 1]);
				local641.aShort85 = (short) (this.aByteArrayArray16[arg0][arg1 + 1] - this.aByteArrayArray15[arg0][arg1 + 1]);
				local641.aShort86 = (short) local70;
			}
			this.aClass205ArrayArray1[arg0][arg1] = local641;
		}
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(IIIIIII[[ZLclient!db;[I[I)V")
	private void method4076(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class44 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean96 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass205ArrayArray1[local22][local25] != null) {
						@Pc(50) Class205 local50 = this.aClass205ArrayArray1[local22][local25];
						if (local50.aShort86 != -1 && (local50.aByte63 & 0x2) == 0 && local50.anInt5634 == -1) {
							local69 = this.aClass82_Sub1_7.method2071(local50.aShort86);
							arg5.method993(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static362.method5518(local50.aShort89 & 0xFFFF, local69), Static362.method5518(local50.aShort85 & 0xFFFF, local69), Static362.method5518(local50.aShort88 & 0xFFFF, local69));
							arg5.method993(local20, local20, local20 - 4, local16, local16 + 4, local16, Static362.method5518(local50.aShort87 & 0xFFFF, local69), Static362.method5518(local50.aShort88 & 0xFFFF, local69), Static362.method5518(local50.aShort85 & 0xFFFF, local69));
						} else if (local50.anInt5634 == -1) {
							arg5.method993(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort89 & 0xFFFF, local50.aShort85 & 0xFFFF, local50.aShort88 & 0xFFFF);
							arg5.method993(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort87 & 0xFFFF, local50.aShort88 & 0xFFFF, local50.aShort85 & 0xFFFF);
						} else {
							local69 = local50.anInt5634;
							arg5.method993(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method993(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass9ArrayArray1[local22][local25] != null) {
						@Pc(249) Class9 local249 = this.aClass9ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort2; local69++) {
							arg6[local69] = local16 + (local249.anIntArray19[local69] - local22 * this.anInt4638) * 4 / this.anInt4638;
							arg7[local69] = local20 - (local249.anIntArray22[local69] - local25 * this.anInt4638) * 4 / this.anInt4638;
						}
						for (@Pc(297) int local297 = 0; local297 < local249.aShort1; local297++) {
							@Pc(303) short local303 = local249.aShortArray6[local297];
							@Pc(308) short local308 = local249.aShortArray3[local297];
							@Pc(313) short local313 = local249.aShortArray5[local297];
							@Pc(317) int local317 = arg6[local303];
							@Pc(321) int local321 = arg6[local308];
							@Pc(325) int local325 = arg6[local313];
							@Pc(329) int local329 = arg7[local303];
							@Pc(333) int local333 = arg7[local308];
							@Pc(337) int local337 = arg7[local313];
							@Pc(351) int local351;
							if (local249.anIntArray20 != null && local249.anIntArray20[local297] != -1) {
								local351 = local249.anIntArray20[local297];
								arg5.method993(local329, local333, local337, local317, local321, local325, Static362.method5518(local249.aShortArray2[local303], local351), Static362.method5518(local249.aShortArray2[local308], local351), Static362.method5518(local249.aShortArray2[local313], local351));
							} else if (local249.aShortArray4 == null || local249.aShortArray4[local297] == -1) {
								local351 = local249.anIntArray23[local297];
								arg5.method993(local329, local333, local337, local317, local321, local325, Static362.method5518(local249.aShortArray2[local303], local351), Static362.method5518(local249.aShortArray2[local308], local351), Static362.method5518(local249.aShortArray2[local313], local351));
							} else {
								local351 = this.aClass82_Sub1_7.method2071(local249.aShortArray4[local297]);
								arg5.method993(local329, local333, local337, local317, local321, local325, Static362.method5518(local249.aShortArray2[local303], local351), Static362.method5518(local249.aShortArray2[local308], local351), Static362.method5518(local249.aShortArray2[local313], local351));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean96 = true;
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(Lclient!mr;IIIIZ)V")
	@Override
	public void method4059(@OriginalArg(0) Class2_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}
}
