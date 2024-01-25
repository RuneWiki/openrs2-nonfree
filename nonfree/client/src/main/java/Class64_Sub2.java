import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class64_Sub2 extends Class64 {

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "[[Lclient!mg;")
	private Class154[][] aClass154ArrayArray1;

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
	private int anInt7010;

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
	private int anInt7011;

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
	private int anInt7012;

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
	private int anInt7013;

	@OriginalMember(owner = "client!uh", name = "o", descriptor = "[[Lclient!mh;")
	private Class155[][] aClass155ArrayArray1;

	@OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
	private int anInt7014;

	@OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
	private int anInt7015;

	@OriginalMember(owner = "client!uh", name = "s", descriptor = "I")
	private int anInt7016;

	@OriginalMember(owner = "client!uh", name = "u", descriptor = "I")
	private int anInt7017;

	@OriginalMember(owner = "client!uh", name = "v", descriptor = "I")
	private int anInt7018;

	@OriginalMember(owner = "client!uh", name = "w", descriptor = "I")
	private int anInt7019;

	@OriginalMember(owner = "client!uh", name = "x", descriptor = "I")
	private int anInt7020;

	@OriginalMember(owner = "client!uh", name = "y", descriptor = "[[Lclient!wb;")
	private Class257[][] aClass257ArrayArray1;

	@OriginalMember(owner = "client!uh", name = "z", descriptor = "I")
	private int anInt7021;

	@OriginalMember(owner = "client!uh", name = "A", descriptor = "[[Lclient!eg;")
	private Class63[][] aClass63ArrayArray1;

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
	private int anInt7009 = -1;

	@OriginalMember(owner = "client!uh", name = "B", descriptor = "Lclient!fe;")
	private final Class75_Sub1 aClass75_Sub1_10;

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
	private final int anInt7008;

	@OriginalMember(owner = "client!uh", name = "t", descriptor = "[[I")
	public final int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!uh", name = "p", descriptor = "[[B")
	private byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!uh", name = "C", descriptor = "[[B")
	private byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lclient!fe;IIII[[I[[II)V")
	public Class64_Sub2(@OriginalArg(0) Class75_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass75_Sub1_10 = arg0;
		this.anInt7008 = arg2;
		this.anIntArrayArray54 = arg5;
		this.aByteArrayArray19 = new byte[arg3 + 1][arg4 + 1];
		@Pc(31) int local31 = this.aClass75_Sub1_10.anInt2471 >> 9;
		for (@Pc(33) int local33 = 1; local33 < arg4; local33++) {
			for (@Pc(36) int local36 = 1; local36 < arg3; local36++) {
				@Pc(55) int local55 = arg6[local36 + 1][local33] - arg6[local36 - 1][local33];
				@Pc(71) int local71 = arg6[local36][local33 + 1] - arg6[local36][local33 - 1];
				@Pc(86) int local86 = (int) Math.sqrt((double) (local55 * local55 + arg7 * 512 + local71 * local71));
				@Pc(92) int local92 = (local55 << 8) / local86;
				@Pc(98) int local98 = arg7 * -512 / local86;
				@Pc(104) int local104 = (local71 << 8) / local86;
				@Pc(126) int local126 = local31 + (this.aClass75_Sub1_10.anInt2477 * local92 + this.aClass75_Sub1_10.anInt2457 * local98 + this.aClass75_Sub1_10.anInt2466 * local104 >> 17);
				local126 >>= 0x1;
				if (local126 < 2) {
					local126 = 2;
				} else if (local126 > 126) {
					local126 = 126;
				}
				this.aByteArrayArray19[local36][local33] = (byte) local126;
			}
		}
		this.aByteArrayArray20 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "()V")
	@Override
	public void f() {
		this.aByteArrayArray19 = null;
		this.aByteArrayArray20 = null;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!ve;[I)V")
	@Override
	public void method5442(@OriginalArg(0) Class3_Sub23 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIII[[ZLclient!ip;[I[I)V")
	private void method5446(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class113 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean280 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass63ArrayArray1[local22][local25] != null) {
						@Pc(50) Class63 local50 = this.aClass63ArrayArray1[local22][local25];
						if (local50.aShort66 != -1 && (local50.aByte34 & 0x2) == 0 && local50.anInt1942 == -1) {
							local69 = this.aClass75_Sub1_10.method2044(local50.aShort66);
							arg5.method3011(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static255.method3878(local69, local50.aShort64 & 0xFFFF), Static255.method3878(local69, local50.aShort65 & 0xFFFF), Static255.method3878(local69, local50.aShort68 & 0xFFFF));
							arg5.method3011(local20, local20, local20 - 4, local16, local16 + 4, local16, Static255.method3878(local69, local50.aShort67 & 0xFFFF), Static255.method3878(local69, local50.aShort68 & 0xFFFF), Static255.method3878(local69, local50.aShort65 & 0xFFFF));
						} else if (local50.anInt1942 == -1) {
							arg5.method3011(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort64 & 0xFFFF, local50.aShort65 & 0xFFFF, local50.aShort68 & 0xFFFF);
							arg5.method3011(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort67 & 0xFFFF, local50.aShort68 & 0xFFFF, local50.aShort65 & 0xFFFF);
						} else {
							local69 = local50.anInt1942;
							arg5.method3011(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method3011(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass154ArrayArray1[local22][local25] != null) {
						@Pc(249) Class154 local249 = this.aClass154ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort132; local69++) {
							arg6[local69] = local16 + local249.aShortArray58[local69] * 4 / super.anInt7007;
							arg7[local69] = local20 - local249.aShortArray59[local69] * 4 / super.anInt7007;
						}
						for (@Pc(287) int local287 = 0; local287 < local249.aShort131; local287++) {
							@Pc(293) short local293 = local249.aShortArray57[local287];
							@Pc(298) short local298 = local249.aShortArray63[local287];
							@Pc(303) short local303 = local249.aShortArray56[local287];
							@Pc(307) int local307 = arg6[local293];
							@Pc(311) int local311 = arg6[local298];
							@Pc(315) int local315 = arg6[local303];
							@Pc(319) int local319 = arg7[local293];
							@Pc(323) int local323 = arg7[local298];
							@Pc(327) int local327 = arg7[local303];
							@Pc(341) int local341;
							if (local249.anIntArray358 != null && local249.anIntArray358[local287] != -1) {
								local341 = local249.anIntArray358[local287];
								arg5.method3011(local319, local323, local327, local307, local311, local315, Static255.method3878(local341, local249.aShortArray60[local293]), Static255.method3878(local341, local249.aShortArray60[local298]), Static255.method3878(local341, local249.aShortArray60[local303]));
							} else if (local249.aShortArray62 == null || local249.aShortArray62[local287] == -1) {
								local341 = local249.anIntArray359[local287];
								arg5.method3011(local319, local323, local327, local307, local311, local315, Static255.method3878(local341, local249.aShortArray60[local293]), Static255.method3878(local341, local249.aShortArray60[local298]), Static255.method3878(local341, local249.aShortArray60[local303]));
							} else {
								local341 = this.aClass75_Sub1_10.method2044(local249.aShortArray62[local287]);
								arg5.method3011(local319, local323, local327, local307, local311, local315, Static255.method3878(local341, local249.aShortArray60[local293]), Static255.method3878(local341, local249.aShortArray60[local298]), Static255.method3878(local341, local249.aShortArray60[local303]));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean280 = true;
	}

	@OriginalMember(owner = "client!uh", name = "U", descriptor = "(Lclient!j;IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) Class3_Sub3_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!uh", name = "O", descriptor = "(IILclient!j;)Lclient!j;")
	@Override
	public Class3_Sub3_Sub4 O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub3_Sub4 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method5443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass63ArrayArray1 == null) {
			this.aClass63ArrayArray1 = new Class63[super.anInt7006][super.anInt7005];
			this.aClass154ArrayArray1 = new Class154[super.anInt7006][super.anInt7005];
		} else if (this.aClass155ArrayArray1 != null) {
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
				if (local64 != 0 && local64 != super.anInt7007 || local70 != 0 && local70 != super.anInt7007) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class154 local95 = new Class154();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort132 = local99;
			local95.aShortArray60 = new short[local99];
			local95.aShortArray58 = new short[local99];
			local95.aShortArray61 = new short[local99];
			local95.aShortArray59 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray60[local124] = (short) (this.aByteArrayArray19[arg0][arg1] - this.aByteArrayArray20[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt7007) {
					local95.aShortArray60[local124] = (short) (this.aByteArrayArray19[arg0][arg1 + 1] - this.aByteArrayArray20[arg0][arg1 + 1]);
				} else if (local129 == super.anInt7007 && local133 == super.anInt7007) {
					local95.aShortArray60[local124] = (short) (this.aByteArrayArray19[arg0 + 1][arg1 + 1] - this.aByteArrayArray20[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt7007 && local133 == 0) {
					local95.aShortArray60[local124] = (short) (this.aByteArrayArray19[arg0 + 1][arg1] - this.aByteArrayArray20[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray19[arg0][arg1] - this.aByteArrayArray20[arg0][arg1]) * (super.anInt7007 - local129) + (this.aByteArrayArray19[arg0 + 1][arg1] - this.aByteArrayArray20[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray19[arg0][arg1 + 1] - this.aByteArrayArray20[arg0][arg1 + 1]) * (super.anInt7007 - local129) + (this.aByteArrayArray19[arg0 + 1][arg1 + 1] - this.aByteArrayArray20[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray60[local124] = (short) (local288 * (super.anInt7007 - local133) + local335 * local133 >> super.anInt7004 * 2);
				}
				local288 = (arg0 << super.anInt7004) + local129;
				local335 = (arg1 << super.anInt7004) + local133;
				local95.aShortArray58[local124] = (short) local129;
				local95.aShortArray59[local124] = (short) local133;
				local95.aShortArray61[local124] = (short) (this.va(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray60[local124] < 2) {
					local95.aShortArray60[local124] = 2;
				}
			}
			@Pc(415) boolean local415 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass75_Sub1_10.anInterface7_6.method2131(arg11[local288]).aBoolean143) {
					local415 = true;
				}
			}
			local95.anIntArray359 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray358 = new int[local133];
			}
			local95.aShortArray57 = new short[local133];
			local95.aShortArray63 = new short[local133];
			local95.aShortArray56 = new short[local133];
			if (local415) {
				local95.aShortArray62 = new short[local133];
				local95.aShortArray55 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray359[local95.aShort131] = Static159.method2740(arg9[local335]);
					} else {
						local95.anIntArray359[local95.aShort131] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray358[local95.aShort131] = -1;
						} else {
							local95.anIntArray358[local95.aShort131] = Static159.method2740(arg10[local335]);
						}
					}
					local95.aShortArray57[local95.aShort131] = (short) arg6[local335];
					local95.aShortArray63[local95.aShort131] = (short) arg7[local335];
					local95.aShortArray56[local95.aShort131] = (short) arg8[local335];
					if (local415) {
						if (arg11[local335] == -1 || this.aClass75_Sub1_10.anInterface7_6.method2131(arg11[local335]).aBoolean143) {
							local95.aShortArray62[local95.aShort131] = -1;
						} else {
							local95.aShortArray62[local95.aShort131] = (short) arg11[local335];
							local95.aShortArray55[local95.aShort131] = (short) arg12[local335];
						}
					}
					local95.aShort131++;
				}
			}
			this.aClass154ArrayArray1[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(644) Class63 local644 = new Class63();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local644.anInt1942 = Static255.method3878(Static159.method2740(arg10[0]), this.aByteArrayArray19[arg0][arg1] - this.aByteArrayArray20[arg0][arg1]);
				if (local64 == -1) {
					local644.aByte34 = (byte) (local644.aByte34 | 0x2);
				}
			}
			if (this.anIntArrayArray54[arg0][arg1] == this.anIntArrayArray54[arg0 + 1][arg1] && this.anIntArrayArray54[arg0][arg1] == this.anIntArrayArray54[arg0 + 1][arg1 + 1] && this.anIntArrayArray54[arg0][arg1] == this.anIntArrayArray54[arg0][arg1 + 1]) {
				local644.aByte34 = (byte) (local644.aByte34 | 0x1);
			}
			if (local70 == -1 || (local644.aByte34 & 0x2) != 0 || this.aClass75_Sub1_10.anInterface7_6.method2131(local70).aBoolean143) {
				@Pc(845) short local845 = Static159.method2740(local64);
				local644.aShort67 = (short) Static255.method3878(local845, this.aByteArrayArray19[arg0][arg1] - this.aByteArrayArray20[arg0][arg1]);
				local644.aShort68 = (short) Static255.method3878(local845, this.aByteArrayArray19[arg0 + 1][arg1] - this.aByteArrayArray20[arg0 + 1][arg1]);
				local644.aShort64 = (short) Static255.method3878(local845, this.aByteArrayArray19[arg0 + 1][arg1 + 1] - this.aByteArrayArray20[arg0 + 1][arg1 + 1]);
				local644.aShort65 = (short) Static255.method3878(local845, this.aByteArrayArray19[arg0][arg1 + 1] - this.aByteArrayArray20[arg0][arg1 + 1]);
				local644.aShort66 = -1;
			} else {
				local644.aShort67 = (short) (this.aByteArrayArray19[arg0][arg1] - this.aByteArrayArray20[arg0][arg1]);
				local644.aShort68 = (short) (this.aByteArrayArray19[arg0 + 1][arg1] - this.aByteArrayArray20[arg0 + 1][arg1]);
				local644.aShort64 = (short) (this.aByteArrayArray19[arg0 + 1][arg1 + 1] - this.aByteArrayArray20[arg0 + 1][arg1 + 1]);
				local644.aShort65 = (short) (this.aByteArrayArray19[arg0][arg1 + 1] - this.aByteArrayArray20[arg0][arg1 + 1]);
				local644.aShort66 = (short) local70;
			}
			this.aClass63ArrayArray1[arg0][arg1] = local644;
		}
	}

	@OriginalMember(owner = "client!uh", name = "I", descriptor = "(II)I")
	@Override
	public int I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray54[arg0][arg1];
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!j;IIIIZ)Z")
	@Override
	public boolean method5438(@OriginalArg(0) Class3_Sub3_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!uh", name = "va", descriptor = "(II)I")
	@Override
	public int va(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> super.anInt7004;
		@Pc(9) int local9 = arg1 >> super.anInt7004;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt7006 - 1 || local9 > super.anInt7005 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & super.anInt7007 - 1;
		@Pc(41) int local41 = arg1 & super.anInt7007 - 1;
		@Pc(67) int local67 = this.anIntArrayArray54[local4][local9] * (super.anInt7007 - local34) + this.anIntArrayArray54[local4 + 1][local9] * local34 >> super.anInt7004;
		@Pc(97) int local97 = this.anIntArrayArray54[local4][local9 + 1] * (super.anInt7007 - local34) + this.anIntArrayArray54[local4 + 1][local9 + 1] * local34 >> super.anInt7004;
		return local67 * (super.anInt7007 - local41) + local97 * local41 >> super.anInt7004;
	}

	@OriginalMember(owner = "client!uh", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass155ArrayArray1 == null) {
			this.aClass155ArrayArray1 = new Class155[super.anInt7006][super.anInt7005];
			this.aClass257ArrayArray1 = new Class257[super.anInt7006][super.anInt7005];
		} else if (this.aClass63ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static351.anIntArray458[Static159.method2740(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static351.anIntArray458[Static159.method2740(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == super.anInt7007 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt7007 && arg4[local116] == super.anInt7007) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt7007) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt7007 && arg2[local244] != arg2[0] - super.anInt7007) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt7007 && arg4[local244] != arg4[0] - super.anInt7007) {
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
			@Pc(334) Class155 local334 = new Class155();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt4661 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte55 = (byte) (local334.aByte55 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray54[arg0][arg1] == this.anIntArrayArray54[arg0 + 1][arg1] && this.anIntArrayArray54[arg0][arg1] == this.anIntArrayArray54[arg0 + 1][arg1 + 1] && this.anIntArrayArray54[arg0][arg1] == this.anIntArrayArray54[arg0][arg1 + 1]) {
				local334.aByte55 = (byte) (local334.aByte55 | 0x1);
			}
			if (local342 == -1 || (local334.aByte55 & 0x2) != 0 || this.aClass75_Sub1_10.anInterface7_6.method2131(local342).aBoolean143) {
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
				local334.anInt4658 = Static347.method4979(local527, Static463.method5447(arg6[local104] >> 8, this.aByteArrayArray19[arg0][arg1] - this.aByteArrayArray20[arg0][arg1]), arg10);
				if (local334.anInt4661 != 0) {
					local334.anInt4658 |= this.aByteArrayArray20[arg0][arg1] + 255 - this.aByteArrayArray19[arg0][arg1] << 25;
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
				local334.anInt4660 = Static347.method4979(local527, Static463.method5447(arg6[local106] >> 8, this.aByteArrayArray19[arg0 + 1][arg1] - this.aByteArrayArray20[arg0 + 1][arg1]), arg10);
				if (local334.anInt4661 != 0) {
					local334.anInt4660 |= this.aByteArrayArray20[arg0 + 1][arg1] + 255 - this.aByteArrayArray19[arg0 + 1][arg1] << 25;
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
				local334.anInt4657 = Static347.method4979(local527, Static463.method5447(arg6[local108] >> 8, this.aByteArrayArray19[arg0 + 1][arg1 + 1] - this.aByteArrayArray20[arg0 + 1][arg1 + 1]), arg10);
				if (local334.anInt4661 != 0) {
					local334.anInt4657 |= this.aByteArrayArray20[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray19[arg0 + 1][arg1 + 1] << 25;
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
				local334.anInt4659 = Static347.method4979(local527, Static463.method5447(arg6[local110] >> 8, this.aByteArrayArray19[arg0][arg1 + 1] - this.aByteArrayArray20[arg0][arg1 + 1]), arg10);
				if (local334.anInt4661 != 0) {
					local334.anInt4659 |= this.aByteArrayArray20[arg0][arg1 + 1] + 255 - this.aByteArrayArray19[arg0][arg1 + 1] << 25;
				}
				local334.aShort133 = -1;
			} else {
				local334.anInt4658 = this.aByteArrayArray19[arg0][arg1] - this.aByteArrayArray20[arg0][arg1];
				local334.anInt4660 = this.aByteArrayArray19[arg0 + 1][arg1] - this.aByteArrayArray20[arg0 + 1][arg1];
				local334.anInt4657 = this.aByteArrayArray19[arg0 + 1][arg1 + 1] - this.aByteArrayArray20[arg0 + 1][arg1 + 1];
				local334.anInt4659 = this.aByteArrayArray19[arg0][arg1 + 1] - this.aByteArrayArray20[arg0][arg1 + 1];
				local334.aShort133 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort135 = (short) arg5[local108];
				local334.aShort134 = (short) arg5[local110];
				local334.aShort137 = (short) arg5[local106];
				local334.aShort136 = (short) arg5[local104];
			}
			this.aClass155ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class257 local888 = new Class257();
		local888.aShort231 = (short) arg2.length;
		local888.aShort232 = (short) (arg2.length / 3);
		local888.aShortArray110 = new short[local888.aShort231];
		local888.aShortArray109 = new short[local888.aShort231];
		local888.aShortArray107 = new short[local888.aShort231];
		local888.anIntArray564 = new int[local888.aShort231];
		if (arg5 != null) {
			local888.aShortArray108 = new short[local888.aShort231];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort231; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray19[arg0][arg1] - this.aByteArrayArray20[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt7007) {
				local958 = this.aByteArrayArray19[arg0][arg1 + 1] - this.aByteArrayArray20[arg0][arg1 + 1];
			} else if (local342 == super.anInt7007 && local527 == super.anInt7007) {
				local958 = this.aByteArrayArray19[arg0 + 1][arg1 + 1] - this.aByteArrayArray20[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt7007 && local527 == 0) {
				local958 = this.aByteArrayArray19[arg0 + 1][arg1] - this.aByteArrayArray20[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray19[arg0][arg1] - this.aByteArrayArray20[arg0][arg1]) * (super.anInt7007 - local342) + (this.aByteArrayArray19[arg0 + 1][arg1] - this.aByteArrayArray20[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray19[arg0][arg1 + 1] - this.aByteArrayArray20[arg0][arg1 + 1]) * (super.anInt7007 - local342) + (this.aByteArrayArray19[arg0 + 1][arg1 + 1] - this.aByteArrayArray20[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt7007 - local527) + local1126 * local527 >> super.anInt7004 * 2;
			}
			local1079 = (arg0 << super.anInt7004) + local342;
			local1126 = (arg1 << super.anInt7004) + local527;
			local888.aShortArray110[local244] = (short) local342;
			local888.aShortArray107[local244] = (short) local527;
			local888.aShortArray109[local244] = (short) (this.va(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass75_Sub1_10.anInterface7_6.method2131(arg8[local244]).aBoolean143) {
				local888.anIntArray564[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray108[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray564[local244] = Static347.method4979(local1226, Static463.method5447(arg6[local244] >> 8, local958), arg10);
				if (arg7 != null) {
					local888.anIntArray564[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray564[local244] = 0;
			} else {
				local888.anIntArray564[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort232; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass75_Sub1_10.anInterface7_6.method2131(arg8[local527 * 3]).aBoolean143) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray565 = new int[local888.aShort232];
		}
		if (local1296) {
			local888.aShortArray112 = new short[local888.aShort232];
			local888.aShortArray111 = new short[local888.aShort232];
		}
		for (local958 = 0; local958 < local888.aShort232; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray565[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass75_Sub1_10.anInterface7_6.method2131(local1384).aBoolean143) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass75_Sub1_10.anInterface7_6.method2131(local1384).aBoolean143) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass75_Sub1_10.anInterface7_6.method2131(local1384).aBoolean143) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray112[local958] = (short) local1384;
					local888.aShortArray111[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass75_Sub1_10.anInterface7_6.method2131(local1384).aBoolean143) {
							local888.anIntArray564[local1079] = Static351.anIntArray458[Static159.method2740(this.aClass75_Sub1_10.anInterface7_6.method2131(local1384).aShort52 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass75_Sub1_10.anInterface7_6.method2131(local1384).aBoolean143) {
							local888.anIntArray564[local1126] = Static351.anIntArray458[Static159.method2740(this.aClass75_Sub1_10.anInterface7_6.method2131(local1384).aShort52 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass75_Sub1_10.anInterface7_6.method2131(local1384).aBoolean143) {
							local888.anIntArray564[local1226] = Static351.anIntArray458[Static159.method2740(this.aClass75_Sub1_10.anInterface7_6.method2131(local1384).aShort52 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray112[local958] = -1;
				}
			}
		}
		this.aClass257ArrayArray1[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!uh", name = "SA", descriptor = "(Lclient!j;IIIIZ)V")
	@Override
	public void SA(@OriginalArg(0) Class3_Sub3_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)Z")
	private boolean method5448(@OriginalArg(0) int arg0) {
		if ((this.anInt7008 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)V")
	@Override
	public void method5445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class45 local4 = this.aClass75_Sub1_10.method2045(Thread.currentThread());
		local4.aClass113_1.anInt3632 = 0;
		if (this.aClass155ArrayArray1 != null) {
			this.method5450(arg0, arg1, this.aClass75_Sub1_10.aBoolean194, local4.aClass113_1, local4.anIntArray128, local4.anIntArray110, local4.anIntArray118);
		} else if (this.aClass63ArrayArray1 != null) {
			this.method5451(arg0, arg1, local4.aClass113_1, local4.anIntArray128, local4.anIntArray110, local4.anIntArray118);
		}
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(IIIIIII[[ZLclient!ip;[I[I)V")
	private void method5449(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class113 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean280 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass155ArrayArray1[local22][local25] != null) {
						@Pc(50) Class155 local50 = this.aClass155ArrayArray1[local22][local25];
						if (local50.aShort133 != -1 && (local50.aByte55 & 0x2) == 0 && local50.anInt4661 == 0) {
							local68 = this.aClass75_Sub1_10.method2044(local50.aShort133);
							arg5.method3011(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static255.method3878(local68, local50.anInt4657), Static255.method3878(local68, local50.anInt4659), Static255.method3878(local68, local50.anInt4660));
							arg5.method3011(local20, local20, local20 - 4, local16, local16 + 4, local16, Static255.method3878(local68, local50.anInt4658), Static255.method3878(local68, local50.anInt4660), Static255.method3878(local68, local50.anInt4659));
						} else if (local50.anInt4661 == 0) {
							arg5.method3024(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt4657, local50.anInt4659, local50.anInt4660);
							arg5.method3024(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt4658, local50.anInt4660, local50.anInt4659);
						} else {
							local68 = local50.anInt4661;
							arg5.method3024(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static403.method5454(local50.anInt4657 & 0xFF000000, local68), Static403.method5454(local50.anInt4659 & 0xFF000000, local68), Static403.method5454(local50.anInt4660 & 0xFF000000, local68));
							arg5.method3024(local20, local20, local20 - 4, local16, local16 + 4, local16, Static403.method5454(local50.anInt4658 & 0xFF000000, local68), Static403.method5454(local50.anInt4660 & 0xFF000000, local68), Static403.method5454(local50.anInt4659 & 0xFF000000, local68));
						}
					} else if (this.aClass257ArrayArray1[local22][local25] != null) {
						@Pc(259) Class257 local259 = this.aClass257ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort231; local68++) {
							arg6[local68] = local16 + local259.aShortArray110[local68] * 4 / super.anInt7007;
							arg7[local68] = local20 - local259.aShortArray107[local68] * 4 / super.anInt7007;
						}
						for (@Pc(297) int local297 = 0; local297 < local259.aShort232; local297++) {
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
							if (local259.anIntArray565 != null && local259.anIntArray565[local297] != 0 && (local259.aShortArray112 == null || local259.aShortArray112 != null && local259.aShortArray112[local297] == -1)) {
								local359 = local259.anIntArray565[local297];
								arg5.method3024(local326, local330, local334, local314, local318, local322, Static403.method5454(-(local259.anIntArray564[local302] & -16777216) - 16777216, local359), Static403.method5454(-(local259.anIntArray564[local306] & -16777216) - 16777216, local359), Static403.method5454(-(local259.anIntArray564[local310] & -16777216) - 16777216, local359));
							} else if (local259.aShortArray112 == null || local259.aShortArray112[local297] == -1) {
								arg5.method3024(local326, local330, local334, local314, local318, local322, local259.anIntArray564[local302], local259.anIntArray564[local306], local259.anIntArray564[local310]);
							} else {
								local359 = this.aClass75_Sub1_10.method2044(local259.aShortArray112[local297]);
								arg5.method3011(local326, local330, local334, local314, local318, local322, local359, local359, local359);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean280 = true;
	}

	@OriginalMember(owner = "client!uh", name = "QA", descriptor = "(III)V")
	@Override
	public void QA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray20[arg0][arg1] < arg2) {
			this.aByteArrayArray20[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method5441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class106_Sub1 local3 = this.aClass75_Sub1_10.aClass106_Sub1_2;
		this.anInt7009 = -1;
		this.anInt7021 = local3.anInt6453;
		this.anInt7011 = local3.anInt6462;
		this.anInt7012 = local3.anInt6456;
		this.anInt7015 = local3.anInt6459;
		this.anInt7018 = local3.anInt6457;
		this.anInt7020 = local3.anInt6454;
		this.anInt7013 = local3.anInt6460;
		this.anInt7014 = local3.anInt6452;
		this.anInt7010 = local3.anInt6461;
		this.anInt7019 = local3.anInt6458;
		this.anInt7017 = local3.anInt6463;
		this.anInt7016 = local3.anInt6455;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method5444(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class45 local4 = this.aClass75_Sub1_10.method2045(Thread.currentThread());
		@Pc(7) Class113 local7 = local4.aClass113_1;
		local7.anInt3632 = 0;
		local7.aBoolean281 = false;
		if (this.aClass155ArrayArray1 != null) {
			this.method5449(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray128, local4.anIntArray110);
		} else if (this.aClass63ArrayArray1 != null) {
			this.method5446(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray128, local4.anIntArray110);
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIZLclient!ip;[I[I[I)V")
	private void method5450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class113 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class155 local6 = this.aClass155ArrayArray1[arg0][arg1];
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
			@Pc(1452) Class257 local1452 = this.aClass257ArrayArray1[arg0][arg1];
			if (local1452 != null) {
				if (this.anInt7009 == -1) {
					for (local436 = 0; local436 < local1452.aShort231; local436++) {
						local24 = local1452.aShortArray110[local436] + (arg0 << super.anInt7004);
						local29 = local1452.aShortArray109[local436];
						local34 = local1452.aShortArray107[local436] + (arg1 << super.anInt7004);
						local380 = this.anInt7016 + (this.anInt7010 * local24 + this.anInt7019 * local29 + this.anInt7017 * local34 >> 15);
						if (local380 <= this.aClass75_Sub1_10.anInt2472) {
							return;
						}
						arg6[local436] = 0;
						if (arg2) {
							local296 = local380 - this.aClass75_Sub1_10.anInt2464;
							if (local296 > 255) {
								local296 = 255;
							}
							if (local296 > 0) {
								arg6[local436] = local296;
								local352 = local1452.aShortArray108[local436] * local296 / 255;
								if (local352 > 0) {
									local29 -= local352;
								}
							}
						} else if (this.aClass75_Sub1_10.aBoolean195) {
							local296 = local380 - this.aClass75_Sub1_10.anInt2464;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt7015 + (this.anInt7021 * local24 + this.anInt7011 * local29 + this.anInt7012 * local34 >> 15);
						local324 = this.anInt7014 + (this.anInt7018 * local24 + this.anInt7020 * local29 + this.anInt7013 * local34 >> 15);
						arg4[local436] = arg3.anInt3629 + local268 * this.aClass75_Sub1_10.anInt2476 / local380;
						arg5[local436] = arg3.anInt3630 + local324 * this.aClass75_Sub1_10.anInt2459 / local380;
					}
				} else {
					for (local436 = 0; local436 < local1452.aShort231; local436++) {
						local24 = local1452.aShortArray110[local436] + (arg0 << super.anInt7004);
						local29 = local1452.aShortArray109[local436];
						local34 = local1452.aShortArray107[local436] + (arg1 << super.anInt7004);
						arg6[local436] = 0;
						if (arg2) {
							local296 = this.anInt7009 - this.aClass75_Sub1_10.anInt2464;
							if (local296 > 255) {
								local296 = 255;
							}
							if (local296 > 0) {
								arg6[local436] = local296;
								local352 = local1452.aShortArray108[local436] * local296 / 255;
								if (local352 > 0) {
									local29 -= local352;
								}
							}
						} else if (this.aClass75_Sub1_10.aBoolean195) {
							local296 = this.anInt7009 - this.aClass75_Sub1_10.anInt2464;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt7015 + (this.anInt7021 * local24 + this.anInt7011 * local29 + this.anInt7012 * local34 >> 15);
						local324 = this.anInt7014 + (this.anInt7018 * local24 + this.anInt7020 * local29 + this.anInt7013 * local34 >> 15);
						arg4[local436] = arg3.anInt3629 + local268 * this.aClass75_Sub1_10.anInt2476 / this.anInt7009;
						arg5[local436] = arg3.anInt3630 + local324 * this.aClass75_Sub1_10.anInt2459 / this.anInt7009;
					}
				}
				if (local1452.aShortArray112 != null) {
					local436 = this.anIntArrayArray54[arg0][arg1];
					local296 = this.anIntArrayArray54[arg0 + 1][arg1];
					local352 = this.anIntArrayArray54[arg0][arg1 + 1];
					local408 = arg0 * super.anInt7007;
					local464 = local408 + super.anInt7007;
					local257 = arg1 * super.anInt7007;
					local313 = local257 + super.anInt7007;
					local369 = this.anInt7015 + (this.anInt7021 * local408 + this.anInt7011 * local436 + this.anInt7012 * local257 >> 15);
					local425 = this.anInt7014 + (this.anInt7018 * local408 + this.anInt7020 * local436 + this.anInt7013 * local257 >> 15);
					local285 = this.anInt7016 + (this.anInt7010 * local408 + this.anInt7019 * local436 + this.anInt7017 * local257 >> 15);
					local341 = this.anInt7015 + (this.anInt7021 * local464 + this.anInt7011 * local296 + this.anInt7012 * local257 >> 15);
					local397 = this.anInt7014 + (this.anInt7018 * local464 + this.anInt7020 * local296 + this.anInt7013 * local257 >> 15);
					local453 = this.anInt7016 + (this.anInt7010 * local464 + this.anInt7019 * local296 + this.anInt7017 * local257 >> 15);
					local82 = this.anInt7015 + (this.anInt7021 * local408 + this.anInt7011 * local352 + this.anInt7012 * local313 >> 15);
					local105 = this.anInt7014 + (this.anInt7018 * local408 + this.anInt7020 * local352 + this.anInt7013 * local313 >> 15);
					local128 = this.anInt7016 + (this.anInt7010 * local408 + this.anInt7019 * local352 + this.anInt7017 * local313 >> 15);
					for (local151 = 0; local151 < local1452.aShort232; local151++) {
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
							arg3.aBoolean281 = local42 < 0 || local176 < 0 || local56 < 0 || local42 > arg3.anInt3633 || local176 > arg3.anInt3633 || local56 > arg3.anInt3633;
							@Pc(2138) short local2138 = local1452.aShortArray112[local151];
							if (local642 < 765) {
								if (local2138 != -1 && this.method5448(this.aClass75_Sub1_10.anInterface7_6.method2131(local2138).aByte28)) {
									arg3.anInt3632 = 100;
								}
								if (local642 > 0) {
									if (local2138 != -1) {
										arg3.method3013(local65, local240, local501, local42, local176, local56, this.aClass75_Sub1_10.anInt2461, arg6[local36], arg6[local38], arg6[local40], local1452.anIntArray564[local36], local1452.anIntArray564[local38], local1452.anIntArray564[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
									} else if ((local1452.anIntArray564[local36] & 0xFFFFFF) != 0) {
										arg3.method3024(local65, local240, local501, local42, local176, local56, Static403.method5454(arg6[local36] << 24 | this.aClass75_Sub1_10.anInt2461, local1452.anIntArray564[local36]), Static403.method5454(arg6[local38] << 24 | this.aClass75_Sub1_10.anInt2461, local1452.anIntArray564[local38]), Static403.method5454(arg6[local40] << 24 | this.aClass75_Sub1_10.anInt2461, local1452.anIntArray564[local40]));
									}
								} else if (local2138 != -1) {
									arg3.method3017(local65, local240, local501, local42, local176, local56, local1452.anIntArray564[local36], local1452.anIntArray564[local38], local1452.anIntArray564[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
								} else if ((local1452.anIntArray564[local36] & 0xFFFFFF) != 0) {
									arg3.method3024(local65, local240, local501, local42, local176, local56, local1452.anIntArray564[local36], local1452.anIntArray564[local38], local1452.anIntArray564[local40]);
								}
								arg3.anInt3632 = 0;
							} else {
								arg3.method3015(local65, local240, local501, local42, local176, local56, this.aClass75_Sub1_10.anInt2461);
							}
						}
					}
					return;
				}
				for (local436 = 0; local436 < local1452.aShort232; local436++) {
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
						arg3.aBoolean281 = local464 < 0 || local257 < 0 || local313 < 0 || local464 > arg3.anInt3633 || local257 > arg3.anInt3633 || local313 > arg3.anInt3633;
						if (local341 >= 765) {
							arg3.method3015(local369, local425, local285, local464, local257, local313, this.aClass75_Sub1_10.anInt2461);
						} else if (local341 > 0) {
							if ((local1452.anIntArray564[local296] & 0xFFFFFF) != 0) {
								arg3.method3024(local369, local425, local285, local464, local257, local313, Static347.method4979(arg6[local296], local1452.anIntArray564[local296], this.aClass75_Sub1_10.anInt2461), Static347.method4979(arg6[local352], local1452.anIntArray564[local352], this.aClass75_Sub1_10.anInt2461), Static347.method4979(arg6[local408], local1452.anIntArray564[local408], this.aClass75_Sub1_10.anInt2461));
							}
						} else if ((local1452.anIntArray564[local296] & 0xFFFFFF) != 0) {
							arg3.method3024(local369, local425, local285, local464, local257, local313, local1452.anIntArray564[local296], local1452.anIntArray564[local352], local1452.anIntArray564[local408]);
						}
					}
				}
			}
		} else if ((local6.aByte55 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt7007;
			local24 = local19 + super.anInt7007;
			local29 = arg1 * super.anInt7007;
			local34 = local29 + super.anInt7007;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte55 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray54[arg0][arg1];
				local65 = this.anIntArrayArray54[arg0 + 1][arg1];
				local240 = this.anIntArrayArray54[arg0 + 1][arg1 + 1];
				local501 = this.anIntArrayArray54[arg0][arg1 + 1];
				if (this.anInt7009 == -1) {
					local82 = this.anInt7016 + (this.anInt7010 * local19 + this.anInt7019 * local56 + this.anInt7017 * local29 >> 15);
					if (local82 <= this.aClass75_Sub1_10.anInt2472) {
						return;
					}
					local105 = this.anInt7016 + (this.anInt7010 * local24 + this.anInt7019 * local65 + this.anInt7017 * local29 >> 15);
					if (local105 <= this.aClass75_Sub1_10.anInt2472) {
						return;
					}
					local128 = this.anInt7016 + (this.anInt7010 * local24 + this.anInt7019 * local240 + this.anInt7017 * local34 >> 15);
					if (local128 <= this.aClass75_Sub1_10.anInt2472) {
						return;
					}
					local151 = this.anInt7016 + (this.anInt7010 * local19 + this.anInt7019 * local501 + this.anInt7017 * local34 >> 15);
					if (local151 <= this.aClass75_Sub1_10.anInt2472) {
						return;
					}
				} else {
					local151 = this.anInt7009;
					local128 = this.anInt7009;
					local105 = this.anInt7009;
					local82 = this.anInt7009;
				}
				if (arg2) {
					local176 = local82 - this.aClass75_Sub1_10.anInt2464;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local36 = local176;
						local642 = local6.aShort136 * local176 / 255;
						if (local642 > 0) {
							local56 -= local642;
						}
					}
					local176 = local105 - this.aClass75_Sub1_10.anInt2464;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local38 = local176;
						local642 = local6.aShort137 * local176 / 255;
						if (local642 > 0) {
							local65 -= local642;
						}
					}
					local176 = local128 - this.aClass75_Sub1_10.anInt2464;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local40 = local176;
						local642 = local6.aShort135 * local176 / 255;
						if (local642 > 0) {
							local240 -= local642;
						}
					}
					local176 = local151 - this.aClass75_Sub1_10.anInt2464;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local42 = local176;
						local642 = local6.aShort134 * local176 / 255;
						if (local642 > 0) {
							local501 -= local642;
						}
					}
				} else if (this.aClass75_Sub1_10.aBoolean195) {
					local176 = local82 - this.aClass75_Sub1_10.anInt2464;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass75_Sub1_10.anInt2464;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass75_Sub1_10.anInt2464;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass75_Sub1_10.anInt2464;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local257 = this.anInt7015 + (this.anInt7021 * local19 + this.anInt7011 * local56 + this.anInt7012 * local29 >> 15);
				local268 = arg3.anInt3629 + local257 * this.aClass75_Sub1_10.anInt2476 / local82;
				local285 = this.anInt7014 + (this.anInt7018 * local19 + this.anInt7020 * local56 + this.anInt7013 * local29 >> 15);
				local296 = arg3.anInt3630 + local285 * this.aClass75_Sub1_10.anInt2459 / local82;
				local313 = this.anInt7015 + (this.anInt7021 * local24 + this.anInt7011 * local65 + this.anInt7012 * local29 >> 15);
				local324 = arg3.anInt3629 + local313 * this.aClass75_Sub1_10.anInt2476 / local105;
				local341 = this.anInt7014 + (this.anInt7018 * local24 + this.anInt7020 * local65 + this.anInt7013 * local29 >> 15);
				local352 = arg3.anInt3630 + local341 * this.aClass75_Sub1_10.anInt2459 / local105;
				local369 = this.anInt7015 + (this.anInt7021 * local24 + this.anInt7011 * local240 + this.anInt7012 * local34 >> 15);
				local380 = arg3.anInt3629 + local369 * this.aClass75_Sub1_10.anInt2476 / local128;
				local397 = this.anInt7014 + (this.anInt7018 * local24 + this.anInt7020 * local240 + this.anInt7013 * local34 >> 15);
				local408 = arg3.anInt3630 + local397 * this.aClass75_Sub1_10.anInt2459 / local128;
				local425 = this.anInt7015 + (this.anInt7021 * local19 + this.anInt7011 * local501 + this.anInt7012 * local34 >> 15);
				local436 = arg3.anInt3629 + local425 * this.aClass75_Sub1_10.anInt2476 / local151;
				local453 = this.anInt7014 + (this.anInt7018 * local19 + this.anInt7020 * local501 + this.anInt7013 * local34 >> 15);
				local464 = arg3.anInt3630 + local453 * this.aClass75_Sub1_10.anInt2459 / local151;
			} else {
				local56 = this.anIntArrayArray54[arg0][arg1];
				if (this.anInt7009 == -1) {
					local65 = this.anInt7019 * local56;
					local82 = this.anInt7016 + (this.anInt7010 * local19 + local65 + this.anInt7017 * local29 >> 15);
					if (local82 <= this.aClass75_Sub1_10.anInt2472) {
						return;
					}
					local105 = this.anInt7016 + (this.anInt7010 * local24 + local65 + this.anInt7017 * local29 >> 15);
					if (local105 <= this.aClass75_Sub1_10.anInt2472) {
						return;
					}
					local128 = this.anInt7016 + (this.anInt7010 * local24 + local65 + this.anInt7017 * local34 >> 15);
					if (local128 <= this.aClass75_Sub1_10.anInt2472) {
						return;
					}
					local151 = this.anInt7016 + (this.anInt7010 * local19 + local65 + this.anInt7017 * local34 >> 15);
					if (local151 <= this.aClass75_Sub1_10.anInt2472) {
						return;
					}
				} else {
					local151 = this.anInt7009;
					local128 = this.anInt7009;
					local105 = this.anInt7009;
					local82 = this.anInt7009;
				}
				if (this.aClass75_Sub1_10.aBoolean195) {
					local176 = local82 - this.aClass75_Sub1_10.anInt2464;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass75_Sub1_10.anInt2464;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass75_Sub1_10.anInt2464;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass75_Sub1_10.anInt2464;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local65 = this.anInt7011 * local56;
				local240 = this.anInt7020 * local56;
				local257 = this.anInt7015 + (this.anInt7021 * local19 + local65 + this.anInt7012 * local29 >> 15);
				local268 = arg3.anInt3629 + local257 * this.aClass75_Sub1_10.anInt2476 / local82;
				local285 = this.anInt7014 + (this.anInt7018 * local19 + local240 + this.anInt7013 * local29 >> 15);
				local296 = arg3.anInt3630 + local285 * this.aClass75_Sub1_10.anInt2459 / local82;
				local313 = this.anInt7015 + (this.anInt7021 * local24 + local65 + this.anInt7012 * local29 >> 15);
				local324 = arg3.anInt3629 + local313 * this.aClass75_Sub1_10.anInt2476 / local105;
				local341 = this.anInt7014 + (this.anInt7018 * local24 + local240 + this.anInt7013 * local29 >> 15);
				local352 = arg3.anInt3630 + local341 * this.aClass75_Sub1_10.anInt2459 / local105;
				local369 = this.anInt7015 + (this.anInt7021 * local24 + local65 + this.anInt7012 * local34 >> 15);
				local380 = arg3.anInt3629 + local369 * this.aClass75_Sub1_10.anInt2476 / local128;
				local397 = this.anInt7014 + (this.anInt7018 * local24 + local240 + this.anInt7013 * local34 >> 15);
				local408 = arg3.anInt3630 + local397 * this.aClass75_Sub1_10.anInt2459 / local128;
				local425 = this.anInt7015 + (this.anInt7021 * local19 + local65 + this.anInt7012 * local34 >> 15);
				local436 = arg3.anInt3629 + local425 * this.aClass75_Sub1_10.anInt2476 / local151;
				local453 = this.anInt7014 + (this.anInt7018 * local19 + local240 + this.anInt7013 * local34 >> 15);
				local464 = arg3.anInt3630 + local453 * this.aClass75_Sub1_10.anInt2459 / local151;
			}
			@Pc(1064) boolean local1064 = local6.aShort133 != -1 && this.method5448(this.aClass75_Sub1_10.anInterface7_6.method2131(local6.aShort133).aByte28);
			local65 = local38 + local40 + local42;
			if ((local380 - local436) * (local352 - local464) - (local408 - local464) * (local324 - local436) > 0) {
				arg3.aBoolean281 = local380 < 0 || local436 < 0 || local324 < 0 || local380 > arg3.anInt3633 || local436 > arg3.anInt3633 || local324 > arg3.anInt3633;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt3632 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort133 >= 0) {
							arg3.method3013(local408, local464, local352, local380, local436, local324, this.aClass75_Sub1_10.anInt2461, local40, local42, local38, local6.anInt4657, local6.anInt4659, local6.anInt4660, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort133);
						} else {
							arg3.method3024(local408, local464, local352, local380, local436, local324, Static403.method5454(local40 << 24 | this.aClass75_Sub1_10.anInt2461, local6.anInt4657), Static403.method5454(local42 << 24 | this.aClass75_Sub1_10.anInt2461, local6.anInt4659), Static403.method5454(local38 << 24 | this.aClass75_Sub1_10.anInt2461, local6.anInt4660));
						}
					} else if (local6.aShort133 >= 0) {
						arg3.method3017(local408, local464, local352, local380, local436, local324, local6.anInt4657, local6.anInt4659, local6.anInt4660, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort133);
					} else {
						arg3.method3024(local408, local464, local352, local380, local436, local324, local6.anInt4657, local6.anInt4659, local6.anInt4660);
					}
					arg3.anInt3632 = 0;
				} else {
					arg3.method3015(local408, local464, local352, local380, local436, local324, this.aClass75_Sub1_10.anInt2461);
				}
			}
			local65 = local36 + local38 + local42;
			if ((local268 - local324) * (local464 - local352) - (local296 - local352) * (local436 - local324) > 0) {
				arg3.aBoolean281 = local268 < 0 || local324 < 0 || local436 < 0 || local268 > arg3.anInt3633 || local324 > arg3.anInt3633 || local436 > arg3.anInt3633;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt3632 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort133 >= 0) {
							arg3.method3013(local296, local352, local464, local268, local324, local436, this.aClass75_Sub1_10.anInt2461, local36, local38, local42, local6.anInt4658, local6.anInt4660, local6.anInt4659, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort133);
						} else {
							arg3.method3024(local296, local352, local464, local268, local324, local436, Static403.method5454(local36 << 24 | this.aClass75_Sub1_10.anInt2461, local6.anInt4658), Static403.method5454(local38 << 24 | this.aClass75_Sub1_10.anInt2461, local6.anInt4660), Static403.method5454(local42 << 24 | this.aClass75_Sub1_10.anInt2461, local6.anInt4659));
						}
					} else if (local6.aShort133 >= 0) {
						arg3.method3017(local296, local352, local464, local268, local324, local436, local6.anInt4658, local6.anInt4660, local6.anInt4659, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort133);
					} else {
						arg3.method3024(local296, local352, local464, local268, local324, local436, local6.anInt4658, local6.anInt4660, local6.anInt4659);
					}
					arg3.anInt3632 = 0;
					return;
				}
				arg3.method3015(local296, local352, local464, local268, local324, local436, this.aClass75_Sub1_10.anInt2461);
			}
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILclient!ip;[I[I[I)V")
	private void method5451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class63 local6 = this.aClass63ArrayArray1[arg0][arg1];
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
			@Pc(1022) Class154 local1022 = this.aClass154ArrayArray1[arg0][arg1];
			if (local1022 != null) {
				@Pc(1046) short local1046;
				if (this.anInt7009 == -1) {
					for (local362 = 0; local362 < local1022.aShort132; local362++) {
						local24 = local1022.aShortArray58[local362] + (arg0 << super.anInt7004);
						local1046 = local1022.aShortArray61[local362];
						local34 = local1022.aShortArray59[local362] + (arg1 << super.anInt7004);
						local306 = this.anInt7016 + (this.anInt7010 * local24 + this.anInt7019 * local1046 + this.anInt7017 * local34 >> 15);
						if (local306 <= this.aClass75_Sub1_10.anInt2472) {
							return;
						}
						local194 = this.anInt7015 + (this.anInt7021 * local24 + this.anInt7011 * local1046 + this.anInt7012 * local34 >> 15);
						local250 = this.anInt7014 + (this.anInt7018 * local24 + this.anInt7020 * local1046 + this.anInt7013 * local34 >> 15);
						arg3[local362] = arg2.anInt3629 + local194 * this.aClass75_Sub1_10.anInt2476 / local306;
						arg4[local362] = arg2.anInt3630 + local250 * this.aClass75_Sub1_10.anInt2459 / local306;
					}
				} else {
					for (local362 = 0; local362 < local1022.aShort132; local362++) {
						local24 = local1022.aShortArray58[local362] + (arg0 << super.anInt7004);
						local1046 = local1022.aShortArray61[local362];
						local34 = local1022.aShortArray59[local362] + (arg1 << super.anInt7004);
						local194 = this.anInt7015 + (this.anInt7021 * local24 + this.anInt7011 * local1046 + this.anInt7012 * local34 >> 15);
						local250 = this.anInt7014 + (this.anInt7018 * local24 + this.anInt7020 * local1046 + this.anInt7013 * local34 >> 15);
						arg3[local362] = arg2.anInt3629 + local194 * this.aClass75_Sub1_10.anInt2476 / this.anInt7009;
						arg4[local362] = arg2.anInt3630 + local250 * this.aClass75_Sub1_10.anInt2459 / this.anInt7009;
					}
				}
				if (local1022.aShortArray62 != null) {
					local362 = this.anIntArrayArray54[arg0][arg1];
					local222 = this.anIntArrayArray54[arg0 + 1][arg1];
					local278 = this.anIntArrayArray54[arg0][arg1 + 1];
					local334 = arg0 * super.anInt7007;
					local390 = local334 + super.anInt7007;
					local183 = arg1 * super.anInt7007;
					local239 = local183 + super.anInt7007;
					local295 = this.anInt7015 + (this.anInt7021 * local334 + this.anInt7011 * local362 + this.anInt7012 * local183 >> 15);
					local351 = this.anInt7014 + (this.anInt7018 * local334 + this.anInt7020 * local362 + this.anInt7013 * local183 >> 15);
					local211 = this.anInt7016 + (this.anInt7010 * local334 + this.anInt7019 * local362 + this.anInt7017 * local183 >> 15);
					local267 = this.anInt7015 + (this.anInt7021 * local390 + this.anInt7011 * local222 + this.anInt7012 * local183 >> 15);
					local323 = this.anInt7014 + (this.anInt7018 * local390 + this.anInt7020 * local222 + this.anInt7013 * local183 >> 15);
					local379 = this.anInt7016 + (this.anInt7010 * local390 + this.anInt7019 * local222 + this.anInt7017 * local183 >> 15);
					local72 = this.anInt7015 + (this.anInt7021 * local334 + this.anInt7011 * local278 + this.anInt7012 * local239 >> 15);
					local95 = this.anInt7014 + (this.anInt7018 * local334 + this.anInt7020 * local278 + this.anInt7013 * local239 >> 15);
					local118 = this.anInt7016 + (this.anInt7010 * local334 + this.anInt7019 * local278 + this.anInt7017 * local239 >> 15);
					for (local141 = 0; local141 < local1022.aShort131; local141++) {
						@Pc(1491) short local1491 = local1022.aShortArray57[local141];
						@Pc(1496) short local1496 = local1022.aShortArray63[local141];
						@Pc(1501) short local1501 = local1022.aShortArray56[local141];
						local427 = arg3[local1491];
						@Pc(1509) int local1509 = arg3[local1496];
						@Pc(1513) int local1513 = arg3[local1501];
						@Pc(1517) int local1517 = arg4[local1491];
						@Pc(1521) int local1521 = arg4[local1496];
						@Pc(1525) int local1525 = arg4[local1501];
						if ((local427 - local1509) * (local1525 - local1521) - (local1517 - local1521) * (local1513 - local1509) > 0) {
							arg2.aBoolean281 = local427 < 0 || local1509 < 0 || local1513 < 0 || local427 > arg2.anInt3633 || local1509 > arg2.anInt3633 || local1513 > arg2.anInt3633;
							@Pc(1569) short local1569 = local1022.aShortArray62[local141];
							if (local1569 == -1) {
								@Pc(1624) int local1624 = local1022.anIntArray359[local141];
								if (local1624 != -1) {
									arg2.method3011(local1517, local1521, local1525, local427, local1509, local1513, Static255.method3878(local1624, local1022.aShortArray60[local1491]), Static255.method3878(local1624, local1022.aShortArray60[local1496]), Static255.method3878(local1624, local1022.aShortArray60[local1501]));
								}
							} else {
								if (this.method5448(this.aClass75_Sub1_10.anInterface7_6.method2131(local1569).aByte28)) {
									arg2.anInt3632 = 100;
								}
								arg2.method3017(local1517, local1521, local1525, local427, local1509, local1513, local1022.aShortArray60[local1491], local1022.aShortArray60[local1496], local1022.aShortArray60[local1501], local295, local267, local72, local351, local323, local95, local211, local379, local118, local1569);
								arg2.anInt3632 = 0;
							}
						}
					}
					return;
				}
				for (local362 = 0; local362 < local1022.aShort131; local362++) {
					@Pc(1670) short local1670 = local1022.aShortArray57[local362];
					@Pc(1675) short local1675 = local1022.aShortArray63[local362];
					@Pc(1680) short local1680 = local1022.aShortArray56[local362];
					local390 = arg3[local1670];
					local183 = arg3[local1675];
					local239 = arg3[local1680];
					local295 = arg4[local1670];
					local351 = arg4[local1675];
					local211 = arg4[local1680];
					if ((local390 - local183) * (local211 - local351) - (local295 - local351) * (local239 - local183) > 0) {
						local267 = local1022.anIntArray359[local362];
						if (local267 != -1) {
							arg2.aBoolean281 = local390 < 0 || local183 < 0 || local239 < 0 || local390 > arg2.anInt3633 || local183 > arg2.anInt3633 || local239 > arg2.anInt3633;
							arg2.method3011(local295, local351, local211, local390, local183, local239, Static255.method3878(local267, local1022.aShortArray60[local1670]), Static255.method3878(local267, local1022.aShortArray60[local1675]), Static255.method3878(local267, local1022.aShortArray60[local1680]));
						}
					}
				}
			}
		} else if ((local6.aByte34 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt7007;
			local24 = local19 + super.anInt7007;
			@Pc(29) int local29 = arg1 * super.anInt7007;
			local34 = local29 + super.anInt7007;
			@Pc(46) int local46;
			@Pc(55) int local55;
			@Pc(166) int local166;
			if ((local6.aByte34 & 0x1) == 0) {
				local46 = this.anIntArrayArray54[arg0][arg1];
				local55 = this.anIntArrayArray54[arg0 + 1][arg1];
				local166 = this.anIntArrayArray54[arg0 + 1][arg1 + 1];
				local427 = this.anIntArrayArray54[arg0][arg1 + 1];
				if (this.anInt7009 == -1) {
					local72 = this.anInt7016 + (this.anInt7010 * local19 + this.anInt7019 * local46 + this.anInt7017 * local29 >> 15);
					if (local72 <= this.aClass75_Sub1_10.anInt2472) {
						return;
					}
					local95 = this.anInt7016 + (this.anInt7010 * local24 + this.anInt7019 * local55 + this.anInt7017 * local29 >> 15);
					if (local95 <= this.aClass75_Sub1_10.anInt2472) {
						return;
					}
					local118 = this.anInt7016 + (this.anInt7010 * local24 + this.anInt7019 * local166 + this.anInt7017 * local34 >> 15);
					if (local118 <= this.aClass75_Sub1_10.anInt2472) {
						return;
					}
					local141 = this.anInt7016 + (this.anInt7010 * local19 + this.anInt7019 * local427 + this.anInt7017 * local34 >> 15);
					if (local141 <= this.aClass75_Sub1_10.anInt2472) {
						return;
					}
				} else {
					local141 = this.anInt7009;
					local118 = this.anInt7009;
					local95 = this.anInt7009;
					local72 = this.anInt7009;
				}
				local183 = this.anInt7015 + (this.anInt7021 * local19 + this.anInt7011 * local46 + this.anInt7012 * local29 >> 15);
				local194 = arg2.anInt3629 + local183 * this.aClass75_Sub1_10.anInt2476 / local72;
				local211 = this.anInt7014 + (this.anInt7018 * local19 + this.anInt7020 * local46 + this.anInt7013 * local29 >> 15);
				local222 = arg2.anInt3630 + local211 * this.aClass75_Sub1_10.anInt2459 / local72;
				local239 = this.anInt7015 + (this.anInt7021 * local24 + this.anInt7011 * local55 + this.anInt7012 * local29 >> 15);
				local250 = arg2.anInt3629 + local239 * this.aClass75_Sub1_10.anInt2476 / local95;
				local267 = this.anInt7014 + (this.anInt7018 * local24 + this.anInt7020 * local55 + this.anInt7013 * local29 >> 15);
				local278 = arg2.anInt3630 + local267 * this.aClass75_Sub1_10.anInt2459 / local95;
				local295 = this.anInt7015 + (this.anInt7021 * local24 + this.anInt7011 * local166 + this.anInt7012 * local34 >> 15);
				local306 = arg2.anInt3629 + local295 * this.aClass75_Sub1_10.anInt2476 / local118;
				local323 = this.anInt7014 + (this.anInt7018 * local24 + this.anInt7020 * local166 + this.anInt7013 * local34 >> 15);
				local334 = arg2.anInt3630 + local323 * this.aClass75_Sub1_10.anInt2459 / local118;
				local351 = this.anInt7015 + (this.anInt7021 * local19 + this.anInt7011 * local427 + this.anInt7012 * local34 >> 15);
				local362 = arg2.anInt3629 + local351 * this.aClass75_Sub1_10.anInt2476 / local141;
				local379 = this.anInt7014 + (this.anInt7018 * local19 + this.anInt7020 * local427 + this.anInt7013 * local34 >> 15);
				local390 = arg2.anInt3630 + local379 * this.aClass75_Sub1_10.anInt2459 / local141;
			} else {
				local46 = this.anIntArrayArray54[arg0][arg1];
				if (this.anInt7009 == -1) {
					local55 = this.anInt7019 * local46;
					local72 = this.anInt7016 + (this.anInt7010 * local19 + local55 + this.anInt7017 * local29 >> 15);
					if (local72 <= this.aClass75_Sub1_10.anInt2472) {
						return;
					}
					local95 = this.anInt7016 + (this.anInt7010 * local24 + local55 + this.anInt7017 * local29 >> 15);
					if (local95 <= this.aClass75_Sub1_10.anInt2472) {
						return;
					}
					local118 = this.anInt7016 + (this.anInt7010 * local24 + local55 + this.anInt7017 * local34 >> 15);
					if (local118 <= this.aClass75_Sub1_10.anInt2472) {
						return;
					}
					local141 = this.anInt7016 + (this.anInt7010 * local19 + local55 + this.anInt7017 * local34 >> 15);
					if (local141 <= this.aClass75_Sub1_10.anInt2472) {
						return;
					}
				} else {
					local141 = this.anInt7009;
					local118 = this.anInt7009;
					local95 = this.anInt7009;
					local72 = this.anInt7009;
				}
				local55 = this.anInt7011 * local46;
				local166 = this.anInt7020 * local46;
				local183 = this.anInt7015 + (this.anInt7021 * local19 + local55 + this.anInt7012 * local29 >> 15);
				local194 = arg2.anInt3629 + local183 * this.aClass75_Sub1_10.anInt2476 / local72;
				local211 = this.anInt7014 + (this.anInt7018 * local19 + local166 + this.anInt7013 * local29 >> 15);
				local222 = arg2.anInt3630 + local211 * this.aClass75_Sub1_10.anInt2459 / local72;
				local239 = this.anInt7015 + (this.anInt7021 * local24 + local55 + this.anInt7012 * local29 >> 15);
				local250 = arg2.anInt3629 + local239 * this.aClass75_Sub1_10.anInt2476 / local95;
				local267 = this.anInt7014 + (this.anInt7018 * local24 + local166 + this.anInt7013 * local29 >> 15);
				local278 = arg2.anInt3630 + local267 * this.aClass75_Sub1_10.anInt2459 / local95;
				local295 = this.anInt7015 + (this.anInt7021 * local24 + local55 + this.anInt7012 * local34 >> 15);
				local306 = arg2.anInt3629 + local295 * this.aClass75_Sub1_10.anInt2476 / local118;
				local323 = this.anInt7014 + (this.anInt7018 * local24 + local166 + this.anInt7013 * local34 >> 15);
				local334 = arg2.anInt3630 + local323 * this.aClass75_Sub1_10.anInt2459 / local118;
				local351 = this.anInt7015 + (this.anInt7021 * local19 + local55 + this.anInt7012 * local34 >> 15);
				local362 = arg2.anInt3629 + local351 * this.aClass75_Sub1_10.anInt2476 / local141;
				local379 = this.anInt7014 + (this.anInt7018 * local19 + local166 + this.anInt7013 * local34 >> 15);
				local390 = arg2.anInt3630 + local379 * this.aClass75_Sub1_10.anInt2459 / local141;
			}
			if ((local306 - local362) * (local278 - local390) - (local334 - local390) * (local250 - local362) > 0) {
				arg2.aBoolean281 = local306 < 0 || local362 < 0 || local250 < 0 || local306 > arg2.anInt3633 || local362 > arg2.anInt3633 || local250 > arg2.anInt3633;
				if (local6.aShort66 >= 0) {
					if (this.method5448(this.aClass75_Sub1_10.anInterface7_6.method2131(local6.aShort66).aByte28)) {
						arg2.anInt3632 = 100;
					}
					arg2.method3017(local334, local390, local278, local306, local362, local250, local6.aShort64 & 0xFFFF, local6.aShort65 & 0xFFFF, local6.aShort68 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort66);
					arg2.anInt3632 = 0;
				} else {
					arg2.method3011(local334, local390, local278, local306, local362, local250, local6.aShort64 & 0xFFFF, local6.aShort65 & 0xFFFF, local6.aShort68 & 0xFFFF);
				}
			}
			if ((local194 - local250) * (local390 - local278) - (local222 - local278) * (local362 - local250) > 0) {
				arg2.aBoolean281 = local194 < 0 || local250 < 0 || local362 < 0 || local194 > arg2.anInt3633 || local250 > arg2.anInt3633 || local362 > arg2.anInt3633;
				if (local6.aShort66 >= 0) {
					if (this.method5448(this.aClass75_Sub1_10.anInterface7_6.method2131(local6.aShort66).aByte28)) {
						arg2.anInt3632 = 100;
					}
					arg2.method3017(local222, local278, local390, local194, local250, local362, local6.aShort67 & 0xFFFF, local6.aShort68 & 0xFFFF, local6.aShort65 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort66);
					arg2.anInt3632 = 0;
					return;
				}
				arg2.method3011(local222, local278, local390, local194, local250, local362, local6.aShort67 & 0xFFFF, local6.aShort68 & 0xFFFF, local6.aShort65 & 0xFFFF);
			}
		}
	}
}
