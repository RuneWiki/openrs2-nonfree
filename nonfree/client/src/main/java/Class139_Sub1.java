import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class139_Sub1 extends Class139 {

	@OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
	private int anInt3933;

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
	private int anInt3934;

	@OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
	private int anInt3935;

	@OriginalMember(owner = "client!kh", name = "o", descriptor = "[[Lclient!h;")
	private Class102[][] aClass102ArrayArray1;

	@OriginalMember(owner = "client!kh", name = "q", descriptor = "[[Lclient!mu;")
	private Class166[][] aClass166ArrayArray1;

	@OriginalMember(owner = "client!kh", name = "r", descriptor = "I")
	private int anInt3937;

	@OriginalMember(owner = "client!kh", name = "t", descriptor = "[[Lclient!qq;")
	private Class211[][] aClass211ArrayArray1;

	@OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
	private int anInt3938;

	@OriginalMember(owner = "client!kh", name = "x", descriptor = "I")
	private int anInt3939;

	@OriginalMember(owner = "client!kh", name = "y", descriptor = "I")
	private int anInt3940;

	@OriginalMember(owner = "client!kh", name = "z", descriptor = "I")
	private int anInt3941;

	@OriginalMember(owner = "client!kh", name = "A", descriptor = "I")
	private int anInt3942;

	@OriginalMember(owner = "client!kh", name = "D", descriptor = "I")
	private int anInt3944;

	@OriginalMember(owner = "client!kh", name = "E", descriptor = "I")
	private int anInt3945;

	@OriginalMember(owner = "client!kh", name = "F", descriptor = "I")
	private int anInt3946;

	@OriginalMember(owner = "client!kh", name = "G", descriptor = "[[Lclient!cg;")
	private Class38[][] aClass38ArrayArray1;

	@OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
	private int anInt3936 = -1;

	@OriginalMember(owner = "client!kh", name = "w", descriptor = "Lclient!wc;")
	private final Class117_Sub2 aClass117_Sub2_8;

	@OriginalMember(owner = "client!kh", name = "B", descriptor = "I")
	private final int anInt3943;

	@OriginalMember(owner = "client!kh", name = "C", descriptor = "[[I")
	public final int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!kh", name = "s", descriptor = "[[B")
	private byte[][] aByteArrayArray69;

	@OriginalMember(owner = "client!kh", name = "u", descriptor = "[[B")
	private byte[][] aByteArrayArray70;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!wc;IIII[[I[[II)V")
	public Class139_Sub1(@OriginalArg(0) Class117_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass117_Sub2_8 = arg0;
		this.anInt3943 = arg2;
		this.anIntArrayArray31 = arg5;
		this.aByteArrayArray69 = new byte[arg3 + 1][arg4 + 1];
		@Pc(31) int local31 = this.aClass117_Sub2_8.anInt7081 >> 9;
		for (@Pc(33) int local33 = 1; local33 < arg4; local33++) {
			for (@Pc(36) int local36 = 1; local36 < arg3; local36++) {
				@Pc(55) int local55 = arg6[local36 + 1][local33] - arg6[local36 - 1][local33];
				@Pc(71) int local71 = arg6[local36][local33 + 1] - arg6[local36][local33 - 1];
				@Pc(86) int local86 = (int) Math.sqrt((double) (local55 * local55 + arg7 * 512 + local71 * local71));
				@Pc(92) int local92 = (local55 << 8) / local86;
				@Pc(98) int local98 = arg7 * -512 / local86;
				@Pc(104) int local104 = (local71 << 8) / local86;
				@Pc(126) int local126 = local31 + (this.aClass117_Sub2_8.anInt7084 * local92 + this.aClass117_Sub2_8.anInt7068 * local98 + this.aClass117_Sub2_8.anInt7059 * local104 >> 17);
				local126 >>= 0x1;
				if (local126 < 2) {
					local126 = 2;
				} else if (local126 > 126) {
					local126 = 126;
				}
				this.aByteArrayArray69[local36][local33] = (byte) local126;
			}
		}
		this.aByteArrayArray70 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!kh", name = "ba", descriptor = "(Lclient!i;IIIIZ)V")
	@Override
	public void ba(@OriginalArg(0) Class1_Sub3_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method5368(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class33 local4 = this.aClass117_Sub2_8.method5733(Thread.currentThread());
		@Pc(7) Class92 local7 = local4.aClass92_2;
		local7.anInt2055 = 0;
		local7.aBoolean217 = false;
		if (this.aClass102ArrayArray1 != null) {
			this.method3081(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray84, local4.anIntArray75);
		} else if (this.aClass166ArrayArray1 != null) {
			this.method3080(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray84, local4.anIntArray75);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!i;IIIIZ)Z")
	@Override
	public boolean method5367(@OriginalArg(0) Class1_Sub3_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!kh", name = "ca", descriptor = "(II)I")
	@Override
	public int ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> super.anInt6759;
		@Pc(9) int local9 = arg1 >> super.anInt6759;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt6757 - 1 || local9 > super.anInt6758 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & super.anInt6760 - 1;
		@Pc(41) int local41 = arg1 & super.anInt6760 - 1;
		@Pc(67) int local67 = this.anIntArrayArray31[local4][local9] * (super.anInt6760 - local34) + this.anIntArrayArray31[local4 + 1][local9] * local34 >> super.anInt6759;
		@Pc(97) int local97 = this.anIntArrayArray31[local4][local9 + 1] * (super.anInt6760 - local34) + this.anIntArrayArray31[local4 + 1][local9 + 1] * local34 >> super.anInt6759;
		return local67 * (super.anInt6760 - local41) + local97 * local41 >> super.anInt6759;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIII[[ZLclient!gf;[I[I)V")
	private void method3080(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class92 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean220 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass166ArrayArray1[local22][local25] != null) {
						@Pc(50) Class166 local50 = this.aClass166ArrayArray1[local22][local25];
						if (local50.aShort63 != -1 && (local50.aByte66 & 0x2) == 0 && local50.anInt4669 == -1) {
							local69 = this.aClass117_Sub2_8.method5742(local50.aShort63);
							arg5.method1678(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static3.method37(local50.aShort64 & 0xFFFF, local69), Static3.method37(local50.aShort66 & 0xFFFF, local69), Static3.method37(local50.aShort65 & 0xFFFF, local69));
							arg5.method1678(local20, local20, local20 - 4, local16, local16 + 4, local16, Static3.method37(local50.aShort67 & 0xFFFF, local69), Static3.method37(local50.aShort65 & 0xFFFF, local69), Static3.method37(local50.aShort66 & 0xFFFF, local69));
						} else if (local50.anInt4669 == -1) {
							arg5.method1678(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort64 & 0xFFFF, local50.aShort66 & 0xFFFF, local50.aShort65 & 0xFFFF);
							arg5.method1678(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort67 & 0xFFFF, local50.aShort65 & 0xFFFF, local50.aShort66 & 0xFFFF);
						} else {
							local69 = local50.anInt4669;
							arg5.method1678(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method1678(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass38ArrayArray1[local22][local25] != null) {
						@Pc(249) Class38 local249 = this.aClass38ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort26; local69++) {
							arg6[local69] = local16 + local249.aShortArray13[local69] * 4 / super.anInt6760;
							arg7[local69] = local20 - local249.aShortArray18[local69] * 4 / super.anInt6760;
						}
						for (@Pc(287) int local287 = 0; local287 < local249.aShort25; local287++) {
							@Pc(293) short local293 = local249.aShortArray17[local287];
							@Pc(298) short local298 = local249.aShortArray20[local287];
							@Pc(303) short local303 = local249.aShortArray19[local287];
							@Pc(307) int local307 = arg6[local293];
							@Pc(311) int local311 = arg6[local298];
							@Pc(315) int local315 = arg6[local303];
							@Pc(319) int local319 = arg7[local293];
							@Pc(323) int local323 = arg7[local298];
							@Pc(327) int local327 = arg7[local303];
							@Pc(341) int local341;
							if (local249.anIntArray107 != null && local249.anIntArray107[local287] != -1) {
								local341 = local249.anIntArray107[local287];
								arg5.method1678(local319, local323, local327, local307, local311, local315, Static3.method37(local249.aShortArray16[local293], local341), Static3.method37(local249.aShortArray16[local298], local341), Static3.method37(local249.aShortArray16[local303], local341));
							} else if (local249.aShortArray14 == null || local249.aShortArray14[local287] == -1) {
								local341 = local249.anIntArray108[local287];
								arg5.method1678(local319, local323, local327, local307, local311, local315, Static3.method37(local249.aShortArray16[local293], local341), Static3.method37(local249.aShortArray16[local298], local341), Static3.method37(local249.aShortArray16[local303], local341));
							} else {
								local341 = this.aClass117_Sub2_8.method5742(local249.aShortArray14[local287]);
								arg5.method1678(local319, local323, local327, local307, local311, local315, Static3.method37(local249.aShortArray16[local293], local341), Static3.method37(local249.aShortArray16[local298], local341), Static3.method37(local249.aShortArray16[local303], local341));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean220 = true;
	}

	@OriginalMember(owner = "client!kh", name = "H", descriptor = "(Lclient!i;IIIIZ)V")
	@Override
	public void H(@OriginalArg(0) Class1_Sub3_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!kh", name = "aa", descriptor = "()V")
	@Override
	public void aa() {
		this.aByteArrayArray69 = null;
		this.aByteArrayArray70 = null;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(IIIIIII[[ZLclient!gf;[I[I)V")
	private void method3081(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class92 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean220 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass102ArrayArray1[local22][local25] != null) {
						@Pc(50) Class102 local50 = this.aClass102ArrayArray1[local22][local25];
						if (local50.aShort43 != -1 && (local50.aByte44 & 0x2) == 0 && local50.anInt2289 == 0) {
							local68 = this.aClass117_Sub2_8.method5742(local50.aShort43);
							arg5.method1678(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static3.method37(local50.anInt2290, local68), Static3.method37(local50.anInt2291, local68), Static3.method37(local50.anInt2292, local68));
							arg5.method1678(local20, local20, local20 - 4, local16, local16 + 4, local16, Static3.method37(local50.anInt2293, local68), Static3.method37(local50.anInt2292, local68), Static3.method37(local50.anInt2291, local68));
						} else if (local50.anInt2289 == 0) {
							arg5.method1682(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt2290, local50.anInt2291, local50.anInt2292);
							arg5.method1682(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt2293, local50.anInt2292, local50.anInt2291);
						} else {
							local68 = local50.anInt2289;
							arg5.method1682(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static460.method5932(local68, local50.anInt2290 & 0xFF000000), Static460.method5932(local68, local50.anInt2291 & 0xFF000000), Static460.method5932(local68, local50.anInt2292 & 0xFF000000));
							arg5.method1682(local20, local20, local20 - 4, local16, local16 + 4, local16, Static460.method5932(local68, local50.anInt2293 & 0xFF000000), Static460.method5932(local68, local50.anInt2292 & 0xFF000000), Static460.method5932(local68, local50.anInt2291 & 0xFF000000));
						}
					} else if (this.aClass211ArrayArray1[local22][local25] != null) {
						@Pc(259) Class211 local259 = this.aClass211ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort80; local68++) {
							arg6[local68] = local16 + local259.aShortArray87[local68] * 4 / super.anInt6760;
							arg7[local68] = local20 - local259.aShortArray86[local68] * 4 / super.anInt6760;
						}
						for (@Pc(297) int local297 = 0; local297 < local259.aShort79; local297++) {
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
							if (local259.anIntArray405 != null && local259.anIntArray405[local297] != 0 && (local259.aShortArray88 == null || local259.aShortArray88 != null && local259.aShortArray88[local297] == -1)) {
								local359 = local259.anIntArray405[local297];
								arg5.method1682(local326, local330, local334, local314, local318, local322, Static460.method5932(local359, -(local259.anIntArray406[local302] & -16777216) - 16777216), Static460.method5932(local359, -(local259.anIntArray406[local306] & -16777216) - 16777216), Static460.method5932(local359, -(local259.anIntArray406[local310] & -16777216) - 16777216));
							} else if (local259.aShortArray88 == null || local259.aShortArray88[local297] == -1) {
								arg5.method1682(local326, local330, local334, local314, local318, local322, local259.anIntArray406[local302], local259.anIntArray406[local306], local259.anIntArray406[local310]);
							} else {
								local359 = this.aClass117_Sub2_8.method5742(local259.aShortArray88[local297]);
								arg5.method1678(local326, local330, local334, local314, local318, local322, local359, local359, local359);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean220 = true;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method5369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass166ArrayArray1 == null) {
			this.aClass166ArrayArray1 = new Class166[super.anInt6757][super.anInt6758];
			this.aClass38ArrayArray1 = new Class38[super.anInt6757][super.anInt6758];
		} else if (this.aClass102ArrayArray1 != null) {
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
				if (local64 != 0 && local64 != super.anInt6760 || local70 != 0 && local70 != super.anInt6760) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class38 local95 = new Class38();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort26 = local99;
			local95.aShortArray16 = new short[local99];
			local95.aShortArray13 = new short[local99];
			local95.aShortArray21 = new short[local99];
			local95.aShortArray18 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray16[local124] = (short) (this.aByteArrayArray69[arg0][arg1] - this.aByteArrayArray70[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt6760) {
					local95.aShortArray16[local124] = (short) (this.aByteArrayArray69[arg0][arg1 + 1] - this.aByteArrayArray70[arg0][arg1 + 1]);
				} else if (local129 == super.anInt6760 && local133 == super.anInt6760) {
					local95.aShortArray16[local124] = (short) (this.aByteArrayArray69[arg0 + 1][arg1 + 1] - this.aByteArrayArray70[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt6760 && local133 == 0) {
					local95.aShortArray16[local124] = (short) (this.aByteArrayArray69[arg0 + 1][arg1] - this.aByteArrayArray70[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray69[arg0][arg1] - this.aByteArrayArray70[arg0][arg1]) * (super.anInt6760 - local129) + (this.aByteArrayArray69[arg0 + 1][arg1] - this.aByteArrayArray70[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray69[arg0][arg1 + 1] - this.aByteArrayArray70[arg0][arg1 + 1]) * (super.anInt6760 - local129) + (this.aByteArrayArray69[arg0 + 1][arg1 + 1] - this.aByteArrayArray70[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray16[local124] = (short) (local288 * (super.anInt6760 - local133) + local335 * local133 >> super.anInt6759 * 2);
				}
				local288 = (arg0 << super.anInt6759) + local129;
				local335 = (arg1 << super.anInt6759) + local133;
				local95.aShortArray13[local124] = (short) local129;
				local95.aShortArray18[local124] = (short) local133;
				local95.aShortArray21[local124] = (short) (this.ca(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray16[local124] < 2) {
					local95.aShortArray16[local124] = 2;
				}
			}
			@Pc(415) boolean local415 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass117_Sub2_8.anInterface4_10.method5090(arg11[local288]).aBoolean60) {
					local415 = true;
				}
			}
			local95.anIntArray108 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray107 = new int[local133];
			}
			local95.aShortArray17 = new short[local133];
			local95.aShortArray20 = new short[local133];
			local95.aShortArray19 = new short[local133];
			if (local415) {
				local95.aShortArray14 = new short[local133];
				local95.aShortArray15 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray108[local95.aShort25] = Static358.method5263(arg9[local335]);
					} else {
						local95.anIntArray108[local95.aShort25] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray107[local95.aShort25] = -1;
						} else {
							local95.anIntArray107[local95.aShort25] = Static358.method5263(arg10[local335]);
						}
					}
					local95.aShortArray17[local95.aShort25] = (short) arg6[local335];
					local95.aShortArray20[local95.aShort25] = (short) arg7[local335];
					local95.aShortArray19[local95.aShort25] = (short) arg8[local335];
					if (local415) {
						if (arg11[local335] == -1 || this.aClass117_Sub2_8.anInterface4_10.method5090(arg11[local335]).aBoolean60) {
							local95.aShortArray14[local95.aShort25] = -1;
						} else {
							local95.aShortArray14[local95.aShort25] = (short) arg11[local335];
							local95.aShortArray15[local95.aShort25] = (short) arg12[local335];
						}
					}
					local95.aShort25++;
				}
			}
			this.aClass38ArrayArray1[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(644) Class166 local644 = new Class166();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local644.anInt4669 = Static3.method37(this.aByteArrayArray69[arg0][arg1] - this.aByteArrayArray70[arg0][arg1], Static358.method5263(arg10[0]));
				if (local64 == -1) {
					local644.aByte66 = (byte) (local644.aByte66 | 0x2);
				}
			}
			if (this.anIntArrayArray31[arg0][arg1] == this.anIntArrayArray31[arg0 + 1][arg1] && this.anIntArrayArray31[arg0][arg1] == this.anIntArrayArray31[arg0 + 1][arg1 + 1] && this.anIntArrayArray31[arg0][arg1] == this.anIntArrayArray31[arg0][arg1 + 1]) {
				local644.aByte66 = (byte) (local644.aByte66 | 0x1);
			}
			if (local70 == -1 || (local644.aByte66 & 0x2) != 0 || this.aClass117_Sub2_8.anInterface4_10.method5090(local70).aBoolean60) {
				@Pc(845) short local845 = Static358.method5263(local64);
				local644.aShort67 = (short) Static3.method37(this.aByteArrayArray69[arg0][arg1] - this.aByteArrayArray70[arg0][arg1], local845);
				local644.aShort65 = (short) Static3.method37(this.aByteArrayArray69[arg0 + 1][arg1] - this.aByteArrayArray70[arg0 + 1][arg1], local845);
				local644.aShort64 = (short) Static3.method37(this.aByteArrayArray69[arg0 + 1][arg1 + 1] - this.aByteArrayArray70[arg0 + 1][arg1 + 1], local845);
				local644.aShort66 = (short) Static3.method37(this.aByteArrayArray69[arg0][arg1 + 1] - this.aByteArrayArray70[arg0][arg1 + 1], local845);
				local644.aShort63 = -1;
			} else {
				local644.aShort67 = (short) (this.aByteArrayArray69[arg0][arg1] - this.aByteArrayArray70[arg0][arg1]);
				local644.aShort65 = (short) (this.aByteArrayArray69[arg0 + 1][arg1] - this.aByteArrayArray70[arg0 + 1][arg1]);
				local644.aShort64 = (short) (this.aByteArrayArray69[arg0 + 1][arg1 + 1] - this.aByteArrayArray70[arg0 + 1][arg1 + 1]);
				local644.aShort66 = (short) (this.aByteArrayArray69[arg0][arg1 + 1] - this.aByteArrayArray70[arg0][arg1 + 1]);
				local644.aShort63 = (short) local70;
			}
			this.aClass166ArrayArray1[arg0][arg1] = local644;
		}
	}

	@OriginalMember(owner = "client!kh", name = "OA", descriptor = "(IILclient!i;)Lclient!i;")
	@Override
	public Class1_Sub3_Sub11 OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub3_Sub11 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)V")
	@Override
	public void method5364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class33 local4 = this.aClass117_Sub2_8.method5733(Thread.currentThread());
		local4.aClass92_2.anInt2055 = 0;
		if (this.aClass102ArrayArray1 != null) {
			this.method3084(arg0, arg1, this.aClass117_Sub2_8.aBoolean616, local4.aClass92_2, local4.anIntArray84, local4.anIntArray75, local4.anIntArray99);
		} else if (this.aClass166ArrayArray1 != null) {
			this.method3083(arg0, arg1, local4.aClass92_2, local4.anIntArray84, local4.anIntArray75, local4.anIntArray99);
		}
	}

	@OriginalMember(owner = "client!kh", name = "qa", descriptor = "(III)V")
	@Override
	public void qa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray70[arg0][arg1] < arg2) {
			this.aByteArrayArray70[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)Z")
	private boolean method3082(@OriginalArg(0) int arg0) {
		if ((this.anInt3943 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IILclient!gf;[I[I[I)V")
	private void method3083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class92 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class166 local6 = this.aClass166ArrayArray1[arg0][arg1];
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
			@Pc(1022) Class38 local1022 = this.aClass38ArrayArray1[arg0][arg1];
			if (local1022 != null) {
				@Pc(1046) short local1046;
				if (this.anInt3936 == -1) {
					for (local362 = 0; local362 < local1022.aShort26; local362++) {
						local24 = local1022.aShortArray13[local362] + (arg0 << super.anInt6759);
						local1046 = local1022.aShortArray21[local362];
						local34 = local1022.aShortArray18[local362] + (arg1 << super.anInt6759);
						local306 = this.anInt3937 + (this.anInt3934 * local24 + this.anInt3941 * local1046 + this.anInt3944 * local34 >> 15);
						if (local306 <= this.aClass117_Sub2_8.anInt7072) {
							return;
						}
						local194 = this.anInt3938 + (this.anInt3933 * local24 + this.anInt3940 * local1046 + this.anInt3935 * local34 >> 15);
						local250 = this.anInt3939 + (this.anInt3942 * local24 + this.anInt3946 * local1046 + this.anInt3945 * local34 >> 15);
						arg3[local362] = arg2.anInt2058 + local194 * this.aClass117_Sub2_8.anInt7080 / local306;
						arg4[local362] = arg2.anInt2054 + local250 * this.aClass117_Sub2_8.anInt7069 / local306;
					}
				} else {
					for (local362 = 0; local362 < local1022.aShort26; local362++) {
						local24 = local1022.aShortArray13[local362] + (arg0 << super.anInt6759);
						local1046 = local1022.aShortArray21[local362];
						local34 = local1022.aShortArray18[local362] + (arg1 << super.anInt6759);
						local194 = this.anInt3938 + (this.anInt3933 * local24 + this.anInt3940 * local1046 + this.anInt3935 * local34 >> 15);
						local250 = this.anInt3939 + (this.anInt3942 * local24 + this.anInt3946 * local1046 + this.anInt3945 * local34 >> 15);
						arg3[local362] = arg2.anInt2058 + local194 * this.aClass117_Sub2_8.anInt7080 / this.anInt3936;
						arg4[local362] = arg2.anInt2054 + local250 * this.aClass117_Sub2_8.anInt7069 / this.anInt3936;
					}
				}
				if (local1022.aShortArray14 != null) {
					local362 = this.anIntArrayArray31[arg0][arg1];
					local222 = this.anIntArrayArray31[arg0 + 1][arg1];
					local278 = this.anIntArrayArray31[arg0][arg1 + 1];
					local334 = arg0 * super.anInt6760;
					local390 = local334 + super.anInt6760;
					local183 = arg1 * super.anInt6760;
					local239 = local183 + super.anInt6760;
					local295 = this.anInt3938 + (this.anInt3933 * local334 + this.anInt3940 * local362 + this.anInt3935 * local183 >> 15);
					local351 = this.anInt3939 + (this.anInt3942 * local334 + this.anInt3946 * local362 + this.anInt3945 * local183 >> 15);
					local211 = this.anInt3937 + (this.anInt3934 * local334 + this.anInt3941 * local362 + this.anInt3944 * local183 >> 15);
					local267 = this.anInt3938 + (this.anInt3933 * local390 + this.anInt3940 * local222 + this.anInt3935 * local183 >> 15);
					local323 = this.anInt3939 + (this.anInt3942 * local390 + this.anInt3946 * local222 + this.anInt3945 * local183 >> 15);
					local379 = this.anInt3937 + (this.anInt3934 * local390 + this.anInt3941 * local222 + this.anInt3944 * local183 >> 15);
					local72 = this.anInt3938 + (this.anInt3933 * local334 + this.anInt3940 * local278 + this.anInt3935 * local239 >> 15);
					local95 = this.anInt3939 + (this.anInt3942 * local334 + this.anInt3946 * local278 + this.anInt3945 * local239 >> 15);
					local118 = this.anInt3937 + (this.anInt3934 * local334 + this.anInt3941 * local278 + this.anInt3944 * local239 >> 15);
					for (local141 = 0; local141 < local1022.aShort25; local141++) {
						@Pc(1491) short local1491 = local1022.aShortArray17[local141];
						@Pc(1496) short local1496 = local1022.aShortArray20[local141];
						@Pc(1501) short local1501 = local1022.aShortArray19[local141];
						local427 = arg3[local1491];
						@Pc(1509) int local1509 = arg3[local1496];
						@Pc(1513) int local1513 = arg3[local1501];
						@Pc(1517) int local1517 = arg4[local1491];
						@Pc(1521) int local1521 = arg4[local1496];
						@Pc(1525) int local1525 = arg4[local1501];
						if ((local427 - local1509) * (local1525 - local1521) - (local1517 - local1521) * (local1513 - local1509) > 0) {
							arg2.aBoolean217 = local427 < 0 || local1509 < 0 || local1513 < 0 || local427 > arg2.anInt2053 || local1509 > arg2.anInt2053 || local1513 > arg2.anInt2053;
							@Pc(1569) short local1569 = local1022.aShortArray14[local141];
							if (local1569 == -1) {
								@Pc(1624) int local1624 = local1022.anIntArray108[local141];
								if (local1624 != -1) {
									arg2.method1678(local1517, local1521, local1525, local427, local1509, local1513, Static3.method37(local1022.aShortArray16[local1491], local1624), Static3.method37(local1022.aShortArray16[local1496], local1624), Static3.method37(local1022.aShortArray16[local1501], local1624));
								}
							} else {
								if (this.method3082(this.aClass117_Sub2_8.anInterface4_10.method5090(local1569).aByte11)) {
									arg2.anInt2055 = 100;
								}
								arg2.method1688(local1517, local1521, local1525, local427, local1509, local1513, local1022.aShortArray16[local1491], local1022.aShortArray16[local1496], local1022.aShortArray16[local1501], local295, local267, local72, local351, local323, local95, local211, local379, local118, local1569);
								arg2.anInt2055 = 0;
							}
						}
					}
					return;
				}
				for (local362 = 0; local362 < local1022.aShort25; local362++) {
					@Pc(1670) short local1670 = local1022.aShortArray17[local362];
					@Pc(1675) short local1675 = local1022.aShortArray20[local362];
					@Pc(1680) short local1680 = local1022.aShortArray19[local362];
					local390 = arg3[local1670];
					local183 = arg3[local1675];
					local239 = arg3[local1680];
					local295 = arg4[local1670];
					local351 = arg4[local1675];
					local211 = arg4[local1680];
					if ((local390 - local183) * (local211 - local351) - (local295 - local351) * (local239 - local183) > 0) {
						local267 = local1022.anIntArray108[local362];
						if (local267 != -1) {
							arg2.aBoolean217 = local390 < 0 || local183 < 0 || local239 < 0 || local390 > arg2.anInt2053 || local183 > arg2.anInt2053 || local239 > arg2.anInt2053;
							arg2.method1678(local295, local351, local211, local390, local183, local239, Static3.method37(local1022.aShortArray16[local1670], local267), Static3.method37(local1022.aShortArray16[local1675], local267), Static3.method37(local1022.aShortArray16[local1680], local267));
						}
					}
				}
			}
		} else if ((local6.aByte66 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt6760;
			local24 = local19 + super.anInt6760;
			@Pc(29) int local29 = arg1 * super.anInt6760;
			local34 = local29 + super.anInt6760;
			@Pc(46) int local46;
			@Pc(55) int local55;
			@Pc(166) int local166;
			if ((local6.aByte66 & 0x1) == 0) {
				local46 = this.anIntArrayArray31[arg0][arg1];
				local55 = this.anIntArrayArray31[arg0 + 1][arg1];
				local166 = this.anIntArrayArray31[arg0 + 1][arg1 + 1];
				local427 = this.anIntArrayArray31[arg0][arg1 + 1];
				if (this.anInt3936 == -1) {
					local72 = this.anInt3937 + (this.anInt3934 * local19 + this.anInt3941 * local46 + this.anInt3944 * local29 >> 15);
					if (local72 <= this.aClass117_Sub2_8.anInt7072) {
						return;
					}
					local95 = this.anInt3937 + (this.anInt3934 * local24 + this.anInt3941 * local55 + this.anInt3944 * local29 >> 15);
					if (local95 <= this.aClass117_Sub2_8.anInt7072) {
						return;
					}
					local118 = this.anInt3937 + (this.anInt3934 * local24 + this.anInt3941 * local166 + this.anInt3944 * local34 >> 15);
					if (local118 <= this.aClass117_Sub2_8.anInt7072) {
						return;
					}
					local141 = this.anInt3937 + (this.anInt3934 * local19 + this.anInt3941 * local427 + this.anInt3944 * local34 >> 15);
					if (local141 <= this.aClass117_Sub2_8.anInt7072) {
						return;
					}
				} else {
					local141 = this.anInt3936;
					local118 = this.anInt3936;
					local95 = this.anInt3936;
					local72 = this.anInt3936;
				}
				local183 = this.anInt3938 + (this.anInt3933 * local19 + this.anInt3940 * local46 + this.anInt3935 * local29 >> 15);
				local194 = arg2.anInt2058 + local183 * this.aClass117_Sub2_8.anInt7080 / local72;
				local211 = this.anInt3939 + (this.anInt3942 * local19 + this.anInt3946 * local46 + this.anInt3945 * local29 >> 15);
				local222 = arg2.anInt2054 + local211 * this.aClass117_Sub2_8.anInt7069 / local72;
				local239 = this.anInt3938 + (this.anInt3933 * local24 + this.anInt3940 * local55 + this.anInt3935 * local29 >> 15);
				local250 = arg2.anInt2058 + local239 * this.aClass117_Sub2_8.anInt7080 / local95;
				local267 = this.anInt3939 + (this.anInt3942 * local24 + this.anInt3946 * local55 + this.anInt3945 * local29 >> 15);
				local278 = arg2.anInt2054 + local267 * this.aClass117_Sub2_8.anInt7069 / local95;
				local295 = this.anInt3938 + (this.anInt3933 * local24 + this.anInt3940 * local166 + this.anInt3935 * local34 >> 15);
				local306 = arg2.anInt2058 + local295 * this.aClass117_Sub2_8.anInt7080 / local118;
				local323 = this.anInt3939 + (this.anInt3942 * local24 + this.anInt3946 * local166 + this.anInt3945 * local34 >> 15);
				local334 = arg2.anInt2054 + local323 * this.aClass117_Sub2_8.anInt7069 / local118;
				local351 = this.anInt3938 + (this.anInt3933 * local19 + this.anInt3940 * local427 + this.anInt3935 * local34 >> 15);
				local362 = arg2.anInt2058 + local351 * this.aClass117_Sub2_8.anInt7080 / local141;
				local379 = this.anInt3939 + (this.anInt3942 * local19 + this.anInt3946 * local427 + this.anInt3945 * local34 >> 15);
				local390 = arg2.anInt2054 + local379 * this.aClass117_Sub2_8.anInt7069 / local141;
			} else {
				local46 = this.anIntArrayArray31[arg0][arg1];
				if (this.anInt3936 == -1) {
					local55 = this.anInt3941 * local46;
					local72 = this.anInt3937 + (this.anInt3934 * local19 + local55 + this.anInt3944 * local29 >> 15);
					if (local72 <= this.aClass117_Sub2_8.anInt7072) {
						return;
					}
					local95 = this.anInt3937 + (this.anInt3934 * local24 + local55 + this.anInt3944 * local29 >> 15);
					if (local95 <= this.aClass117_Sub2_8.anInt7072) {
						return;
					}
					local118 = this.anInt3937 + (this.anInt3934 * local24 + local55 + this.anInt3944 * local34 >> 15);
					if (local118 <= this.aClass117_Sub2_8.anInt7072) {
						return;
					}
					local141 = this.anInt3937 + (this.anInt3934 * local19 + local55 + this.anInt3944 * local34 >> 15);
					if (local141 <= this.aClass117_Sub2_8.anInt7072) {
						return;
					}
				} else {
					local141 = this.anInt3936;
					local118 = this.anInt3936;
					local95 = this.anInt3936;
					local72 = this.anInt3936;
				}
				local55 = this.anInt3940 * local46;
				local166 = this.anInt3946 * local46;
				local183 = this.anInt3938 + (this.anInt3933 * local19 + local55 + this.anInt3935 * local29 >> 15);
				local194 = arg2.anInt2058 + local183 * this.aClass117_Sub2_8.anInt7080 / local72;
				local211 = this.anInt3939 + (this.anInt3942 * local19 + local166 + this.anInt3945 * local29 >> 15);
				local222 = arg2.anInt2054 + local211 * this.aClass117_Sub2_8.anInt7069 / local72;
				local239 = this.anInt3938 + (this.anInt3933 * local24 + local55 + this.anInt3935 * local29 >> 15);
				local250 = arg2.anInt2058 + local239 * this.aClass117_Sub2_8.anInt7080 / local95;
				local267 = this.anInt3939 + (this.anInt3942 * local24 + local166 + this.anInt3945 * local29 >> 15);
				local278 = arg2.anInt2054 + local267 * this.aClass117_Sub2_8.anInt7069 / local95;
				local295 = this.anInt3938 + (this.anInt3933 * local24 + local55 + this.anInt3935 * local34 >> 15);
				local306 = arg2.anInt2058 + local295 * this.aClass117_Sub2_8.anInt7080 / local118;
				local323 = this.anInt3939 + (this.anInt3942 * local24 + local166 + this.anInt3945 * local34 >> 15);
				local334 = arg2.anInt2054 + local323 * this.aClass117_Sub2_8.anInt7069 / local118;
				local351 = this.anInt3938 + (this.anInt3933 * local19 + local55 + this.anInt3935 * local34 >> 15);
				local362 = arg2.anInt2058 + local351 * this.aClass117_Sub2_8.anInt7080 / local141;
				local379 = this.anInt3939 + (this.anInt3942 * local19 + local166 + this.anInt3945 * local34 >> 15);
				local390 = arg2.anInt2054 + local379 * this.aClass117_Sub2_8.anInt7069 / local141;
			}
			if ((local306 - local362) * (local278 - local390) - (local334 - local390) * (local250 - local362) > 0) {
				arg2.aBoolean217 = local306 < 0 || local362 < 0 || local250 < 0 || local306 > arg2.anInt2053 || local362 > arg2.anInt2053 || local250 > arg2.anInt2053;
				if (local6.aShort63 >= 0) {
					if (this.method3082(this.aClass117_Sub2_8.anInterface4_10.method5090(local6.aShort63).aByte11)) {
						arg2.anInt2055 = 100;
					}
					arg2.method1688(local334, local390, local278, local306, local362, local250, local6.aShort64 & 0xFFFF, local6.aShort66 & 0xFFFF, local6.aShort65 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort63);
					arg2.anInt2055 = 0;
				} else {
					arg2.method1678(local334, local390, local278, local306, local362, local250, local6.aShort64 & 0xFFFF, local6.aShort66 & 0xFFFF, local6.aShort65 & 0xFFFF);
				}
			}
			if ((local194 - local250) * (local390 - local278) - (local222 - local278) * (local362 - local250) > 0) {
				arg2.aBoolean217 = local194 < 0 || local250 < 0 || local362 < 0 || local194 > arg2.anInt2053 || local250 > arg2.anInt2053 || local362 > arg2.anInt2053;
				if (local6.aShort63 >= 0) {
					if (this.method3082(this.aClass117_Sub2_8.anInterface4_10.method5090(local6.aShort63).aByte11)) {
						arg2.anInt2055 = 100;
					}
					arg2.method1688(local222, local278, local390, local194, local250, local362, local6.aShort67 & 0xFFFF, local6.aShort65 & 0xFFFF, local6.aShort66 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort63);
					arg2.anInt2055 = 0;
					return;
				}
				arg2.method1678(local222, local278, local390, local194, local250, local362, local6.aShort67 & 0xFFFF, local6.aShort65 & 0xFFFF, local6.aShort66 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIZLclient!gf;[I[I[I)V")
	private void method3084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class92 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class102 local6 = this.aClass102ArrayArray1[arg0][arg1];
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
			@Pc(1452) Class211 local1452 = this.aClass211ArrayArray1[arg0][arg1];
			if (local1452 != null) {
				if (this.anInt3936 == -1) {
					for (local436 = 0; local436 < local1452.aShort80; local436++) {
						local24 = local1452.aShortArray87[local436] + (arg0 << super.anInt6759);
						local29 = local1452.aShortArray90[local436];
						local34 = local1452.aShortArray86[local436] + (arg1 << super.anInt6759);
						local380 = this.anInt3937 + (this.anInt3934 * local24 + this.anInt3941 * local29 + this.anInt3944 * local34 >> 15);
						if (local380 <= this.aClass117_Sub2_8.anInt7072) {
							return;
						}
						arg6[local436] = 0;
						if (arg2) {
							local296 = local380 - this.aClass117_Sub2_8.anInt7074;
							if (local296 > 255) {
								local296 = 255;
							}
							if (local296 > 0) {
								arg6[local436] = local296;
								local352 = local1452.aShortArray85[local436] * local296 / 255;
								if (local352 > 0) {
									local29 -= local352;
								}
							}
						} else if (this.aClass117_Sub2_8.aBoolean618) {
							local296 = local380 - this.aClass117_Sub2_8.anInt7074;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt3938 + (this.anInt3933 * local24 + this.anInt3940 * local29 + this.anInt3935 * local34 >> 15);
						local324 = this.anInt3939 + (this.anInt3942 * local24 + this.anInt3946 * local29 + this.anInt3945 * local34 >> 15);
						arg4[local436] = arg3.anInt2058 + local268 * this.aClass117_Sub2_8.anInt7080 / local380;
						arg5[local436] = arg3.anInt2054 + local324 * this.aClass117_Sub2_8.anInt7069 / local380;
					}
				} else {
					for (local436 = 0; local436 < local1452.aShort80; local436++) {
						local24 = local1452.aShortArray87[local436] + (arg0 << super.anInt6759);
						local29 = local1452.aShortArray90[local436];
						local34 = local1452.aShortArray86[local436] + (arg1 << super.anInt6759);
						arg6[local436] = 0;
						if (arg2) {
							local296 = this.anInt3936 - this.aClass117_Sub2_8.anInt7074;
							if (local296 > 255) {
								local296 = 255;
							}
							if (local296 > 0) {
								arg6[local436] = local296;
								local352 = local1452.aShortArray85[local436] * local296 / 255;
								if (local352 > 0) {
									local29 -= local352;
								}
							}
						} else if (this.aClass117_Sub2_8.aBoolean618) {
							local296 = this.anInt3936 - this.aClass117_Sub2_8.anInt7074;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt3938 + (this.anInt3933 * local24 + this.anInt3940 * local29 + this.anInt3935 * local34 >> 15);
						local324 = this.anInt3939 + (this.anInt3942 * local24 + this.anInt3946 * local29 + this.anInt3945 * local34 >> 15);
						arg4[local436] = arg3.anInt2058 + local268 * this.aClass117_Sub2_8.anInt7080 / this.anInt3936;
						arg5[local436] = arg3.anInt2054 + local324 * this.aClass117_Sub2_8.anInt7069 / this.anInt3936;
					}
				}
				if (local1452.aShortArray88 != null) {
					local436 = this.anIntArrayArray31[arg0][arg1];
					local296 = this.anIntArrayArray31[arg0 + 1][arg1];
					local352 = this.anIntArrayArray31[arg0][arg1 + 1];
					local408 = arg0 * super.anInt6760;
					local464 = local408 + super.anInt6760;
					local257 = arg1 * super.anInt6760;
					local313 = local257 + super.anInt6760;
					local369 = this.anInt3938 + (this.anInt3933 * local408 + this.anInt3940 * local436 + this.anInt3935 * local257 >> 15);
					local425 = this.anInt3939 + (this.anInt3942 * local408 + this.anInt3946 * local436 + this.anInt3945 * local257 >> 15);
					local285 = this.anInt3937 + (this.anInt3934 * local408 + this.anInt3941 * local436 + this.anInt3944 * local257 >> 15);
					local341 = this.anInt3938 + (this.anInt3933 * local464 + this.anInt3940 * local296 + this.anInt3935 * local257 >> 15);
					local397 = this.anInt3939 + (this.anInt3942 * local464 + this.anInt3946 * local296 + this.anInt3945 * local257 >> 15);
					local453 = this.anInt3937 + (this.anInt3934 * local464 + this.anInt3941 * local296 + this.anInt3944 * local257 >> 15);
					local82 = this.anInt3938 + (this.anInt3933 * local408 + this.anInt3940 * local352 + this.anInt3935 * local313 >> 15);
					local105 = this.anInt3939 + (this.anInt3942 * local408 + this.anInt3946 * local352 + this.anInt3945 * local313 >> 15);
					local128 = this.anInt3937 + (this.anInt3934 * local408 + this.anInt3941 * local352 + this.anInt3944 * local313 >> 15);
					for (local151 = 0; local151 < local1452.aShort79; local151++) {
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
							arg3.aBoolean217 = local42 < 0 || local176 < 0 || local56 < 0 || local42 > arg3.anInt2053 || local176 > arg3.anInt2053 || local56 > arg3.anInt2053;
							@Pc(2138) short local2138 = local1452.aShortArray88[local151];
							if (local642 < 765) {
								if (local2138 != -1 && this.method3082(this.aClass117_Sub2_8.anInterface4_10.method5090(local2138).aByte11)) {
									arg3.anInt2055 = 100;
								}
								if (local642 > 0) {
									if (local2138 != -1) {
										arg3.method1681(local65, local240, local501, local42, local176, local56, this.aClass117_Sub2_8.anInt7076, arg6[local36], arg6[local38], arg6[local40], local1452.anIntArray406[local36], local1452.anIntArray406[local38], local1452.anIntArray406[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
									} else if ((local1452.anIntArray406[local36] & 0xFFFFFF) != 0) {
										arg3.method1682(local65, local240, local501, local42, local176, local56, Static460.method5932(local1452.anIntArray406[local36], arg6[local36] << 24 | this.aClass117_Sub2_8.anInt7076), Static460.method5932(local1452.anIntArray406[local38], arg6[local38] << 24 | this.aClass117_Sub2_8.anInt7076), Static460.method5932(local1452.anIntArray406[local40], arg6[local40] << 24 | this.aClass117_Sub2_8.anInt7076));
									}
								} else if (local2138 != -1) {
									arg3.method1688(local65, local240, local501, local42, local176, local56, local1452.anIntArray406[local36], local1452.anIntArray406[local38], local1452.anIntArray406[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
								} else if ((local1452.anIntArray406[local36] & 0xFFFFFF) != 0) {
									arg3.method1682(local65, local240, local501, local42, local176, local56, local1452.anIntArray406[local36], local1452.anIntArray406[local38], local1452.anIntArray406[local40]);
								}
								arg3.anInt2055 = 0;
							} else {
								arg3.method1685(local65, local240, local501, local42, local176, local56, this.aClass117_Sub2_8.anInt7076);
							}
						}
					}
					return;
				}
				for (local436 = 0; local436 < local1452.aShort79; local436++) {
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
						arg3.aBoolean217 = local464 < 0 || local257 < 0 || local313 < 0 || local464 > arg3.anInt2053 || local257 > arg3.anInt2053 || local313 > arg3.anInt2053;
						if (local341 >= 765) {
							arg3.method1685(local369, local425, local285, local464, local257, local313, this.aClass117_Sub2_8.anInt7076);
						} else if (local341 > 0) {
							if ((local1452.anIntArray406[local296] & 0xFFFFFF) != 0) {
								arg3.method1682(local369, local425, local285, local464, local257, local313, Static75.method933(local1452.anIntArray406[local296], this.aClass117_Sub2_8.anInt7076, arg6[local296]), Static75.method933(local1452.anIntArray406[local352], this.aClass117_Sub2_8.anInt7076, arg6[local352]), Static75.method933(local1452.anIntArray406[local408], this.aClass117_Sub2_8.anInt7076, arg6[local408]));
							}
						} else if ((local1452.anIntArray406[local296] & 0xFFFFFF) != 0) {
							arg3.method1682(local369, local425, local285, local464, local257, local313, local1452.anIntArray406[local296], local1452.anIntArray406[local352], local1452.anIntArray406[local408]);
						}
					}
				}
			}
		} else if ((local6.aByte44 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt6760;
			local24 = local19 + super.anInt6760;
			local29 = arg1 * super.anInt6760;
			local34 = local29 + super.anInt6760;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte44 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray31[arg0][arg1];
				local65 = this.anIntArrayArray31[arg0 + 1][arg1];
				local240 = this.anIntArrayArray31[arg0 + 1][arg1 + 1];
				local501 = this.anIntArrayArray31[arg0][arg1 + 1];
				if (this.anInt3936 == -1) {
					local82 = this.anInt3937 + (this.anInt3934 * local19 + this.anInt3941 * local56 + this.anInt3944 * local29 >> 15);
					if (local82 <= this.aClass117_Sub2_8.anInt7072) {
						return;
					}
					local105 = this.anInt3937 + (this.anInt3934 * local24 + this.anInt3941 * local65 + this.anInt3944 * local29 >> 15);
					if (local105 <= this.aClass117_Sub2_8.anInt7072) {
						return;
					}
					local128 = this.anInt3937 + (this.anInt3934 * local24 + this.anInt3941 * local240 + this.anInt3944 * local34 >> 15);
					if (local128 <= this.aClass117_Sub2_8.anInt7072) {
						return;
					}
					local151 = this.anInt3937 + (this.anInt3934 * local19 + this.anInt3941 * local501 + this.anInt3944 * local34 >> 15);
					if (local151 <= this.aClass117_Sub2_8.anInt7072) {
						return;
					}
				} else {
					local151 = this.anInt3936;
					local128 = this.anInt3936;
					local105 = this.anInt3936;
					local82 = this.anInt3936;
				}
				if (arg2) {
					local176 = local82 - this.aClass117_Sub2_8.anInt7074;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local36 = local176;
						local642 = local6.aShort46 * local176 / 255;
						if (local642 > 0) {
							local56 -= local642;
						}
					}
					local176 = local105 - this.aClass117_Sub2_8.anInt7074;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local38 = local176;
						local642 = local6.aShort47 * local176 / 255;
						if (local642 > 0) {
							local65 -= local642;
						}
					}
					local176 = local128 - this.aClass117_Sub2_8.anInt7074;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local40 = local176;
						local642 = local6.aShort45 * local176 / 255;
						if (local642 > 0) {
							local240 -= local642;
						}
					}
					local176 = local151 - this.aClass117_Sub2_8.anInt7074;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local42 = local176;
						local642 = local6.aShort44 * local176 / 255;
						if (local642 > 0) {
							local501 -= local642;
						}
					}
				} else if (this.aClass117_Sub2_8.aBoolean618) {
					local176 = local82 - this.aClass117_Sub2_8.anInt7074;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass117_Sub2_8.anInt7074;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass117_Sub2_8.anInt7074;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass117_Sub2_8.anInt7074;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local257 = this.anInt3938 + (this.anInt3933 * local19 + this.anInt3940 * local56 + this.anInt3935 * local29 >> 15);
				local268 = arg3.anInt2058 + local257 * this.aClass117_Sub2_8.anInt7080 / local82;
				local285 = this.anInt3939 + (this.anInt3942 * local19 + this.anInt3946 * local56 + this.anInt3945 * local29 >> 15);
				local296 = arg3.anInt2054 + local285 * this.aClass117_Sub2_8.anInt7069 / local82;
				local313 = this.anInt3938 + (this.anInt3933 * local24 + this.anInt3940 * local65 + this.anInt3935 * local29 >> 15);
				local324 = arg3.anInt2058 + local313 * this.aClass117_Sub2_8.anInt7080 / local105;
				local341 = this.anInt3939 + (this.anInt3942 * local24 + this.anInt3946 * local65 + this.anInt3945 * local29 >> 15);
				local352 = arg3.anInt2054 + local341 * this.aClass117_Sub2_8.anInt7069 / local105;
				local369 = this.anInt3938 + (this.anInt3933 * local24 + this.anInt3940 * local240 + this.anInt3935 * local34 >> 15);
				local380 = arg3.anInt2058 + local369 * this.aClass117_Sub2_8.anInt7080 / local128;
				local397 = this.anInt3939 + (this.anInt3942 * local24 + this.anInt3946 * local240 + this.anInt3945 * local34 >> 15);
				local408 = arg3.anInt2054 + local397 * this.aClass117_Sub2_8.anInt7069 / local128;
				local425 = this.anInt3938 + (this.anInt3933 * local19 + this.anInt3940 * local501 + this.anInt3935 * local34 >> 15);
				local436 = arg3.anInt2058 + local425 * this.aClass117_Sub2_8.anInt7080 / local151;
				local453 = this.anInt3939 + (this.anInt3942 * local19 + this.anInt3946 * local501 + this.anInt3945 * local34 >> 15);
				local464 = arg3.anInt2054 + local453 * this.aClass117_Sub2_8.anInt7069 / local151;
			} else {
				local56 = this.anIntArrayArray31[arg0][arg1];
				if (this.anInt3936 == -1) {
					local65 = this.anInt3941 * local56;
					local82 = this.anInt3937 + (this.anInt3934 * local19 + local65 + this.anInt3944 * local29 >> 15);
					if (local82 <= this.aClass117_Sub2_8.anInt7072) {
						return;
					}
					local105 = this.anInt3937 + (this.anInt3934 * local24 + local65 + this.anInt3944 * local29 >> 15);
					if (local105 <= this.aClass117_Sub2_8.anInt7072) {
						return;
					}
					local128 = this.anInt3937 + (this.anInt3934 * local24 + local65 + this.anInt3944 * local34 >> 15);
					if (local128 <= this.aClass117_Sub2_8.anInt7072) {
						return;
					}
					local151 = this.anInt3937 + (this.anInt3934 * local19 + local65 + this.anInt3944 * local34 >> 15);
					if (local151 <= this.aClass117_Sub2_8.anInt7072) {
						return;
					}
				} else {
					local151 = this.anInt3936;
					local128 = this.anInt3936;
					local105 = this.anInt3936;
					local82 = this.anInt3936;
				}
				if (this.aClass117_Sub2_8.aBoolean618) {
					local176 = local82 - this.aClass117_Sub2_8.anInt7074;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass117_Sub2_8.anInt7074;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass117_Sub2_8.anInt7074;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass117_Sub2_8.anInt7074;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local65 = this.anInt3940 * local56;
				local240 = this.anInt3946 * local56;
				local257 = this.anInt3938 + (this.anInt3933 * local19 + local65 + this.anInt3935 * local29 >> 15);
				local268 = arg3.anInt2058 + local257 * this.aClass117_Sub2_8.anInt7080 / local82;
				local285 = this.anInt3939 + (this.anInt3942 * local19 + local240 + this.anInt3945 * local29 >> 15);
				local296 = arg3.anInt2054 + local285 * this.aClass117_Sub2_8.anInt7069 / local82;
				local313 = this.anInt3938 + (this.anInt3933 * local24 + local65 + this.anInt3935 * local29 >> 15);
				local324 = arg3.anInt2058 + local313 * this.aClass117_Sub2_8.anInt7080 / local105;
				local341 = this.anInt3939 + (this.anInt3942 * local24 + local240 + this.anInt3945 * local29 >> 15);
				local352 = arg3.anInt2054 + local341 * this.aClass117_Sub2_8.anInt7069 / local105;
				local369 = this.anInt3938 + (this.anInt3933 * local24 + local65 + this.anInt3935 * local34 >> 15);
				local380 = arg3.anInt2058 + local369 * this.aClass117_Sub2_8.anInt7080 / local128;
				local397 = this.anInt3939 + (this.anInt3942 * local24 + local240 + this.anInt3945 * local34 >> 15);
				local408 = arg3.anInt2054 + local397 * this.aClass117_Sub2_8.anInt7069 / local128;
				local425 = this.anInt3938 + (this.anInt3933 * local19 + local65 + this.anInt3935 * local34 >> 15);
				local436 = arg3.anInt2058 + local425 * this.aClass117_Sub2_8.anInt7080 / local151;
				local453 = this.anInt3939 + (this.anInt3942 * local19 + local240 + this.anInt3945 * local34 >> 15);
				local464 = arg3.anInt2054 + local453 * this.aClass117_Sub2_8.anInt7069 / local151;
			}
			@Pc(1064) boolean local1064 = local6.aShort43 != -1 && this.method3082(this.aClass117_Sub2_8.anInterface4_10.method5090(local6.aShort43).aByte11);
			local65 = local38 + local40 + local42;
			if ((local380 - local436) * (local352 - local464) - (local408 - local464) * (local324 - local436) > 0) {
				arg3.aBoolean217 = local380 < 0 || local436 < 0 || local324 < 0 || local380 > arg3.anInt2053 || local436 > arg3.anInt2053 || local324 > arg3.anInt2053;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt2055 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort43 >= 0) {
							arg3.method1681(local408, local464, local352, local380, local436, local324, this.aClass117_Sub2_8.anInt7076, local40, local42, local38, local6.anInt2290, local6.anInt2291, local6.anInt2292, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort43);
						} else {
							arg3.method1682(local408, local464, local352, local380, local436, local324, Static460.method5932(local6.anInt2290, local40 << 24 | this.aClass117_Sub2_8.anInt7076), Static460.method5932(local6.anInt2291, local42 << 24 | this.aClass117_Sub2_8.anInt7076), Static460.method5932(local6.anInt2292, local38 << 24 | this.aClass117_Sub2_8.anInt7076));
						}
					} else if (local6.aShort43 >= 0) {
						arg3.method1688(local408, local464, local352, local380, local436, local324, local6.anInt2290, local6.anInt2291, local6.anInt2292, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort43);
					} else {
						arg3.method1682(local408, local464, local352, local380, local436, local324, local6.anInt2290, local6.anInt2291, local6.anInt2292);
					}
					arg3.anInt2055 = 0;
				} else {
					arg3.method1685(local408, local464, local352, local380, local436, local324, this.aClass117_Sub2_8.anInt7076);
				}
			}
			local65 = local36 + local38 + local42;
			if ((local268 - local324) * (local464 - local352) - (local296 - local352) * (local436 - local324) > 0) {
				arg3.aBoolean217 = local268 < 0 || local324 < 0 || local436 < 0 || local268 > arg3.anInt2053 || local324 > arg3.anInt2053 || local436 > arg3.anInt2053;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt2055 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort43 >= 0) {
							arg3.method1681(local296, local352, local464, local268, local324, local436, this.aClass117_Sub2_8.anInt7076, local36, local38, local42, local6.anInt2293, local6.anInt2292, local6.anInt2291, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort43);
						} else {
							arg3.method1682(local296, local352, local464, local268, local324, local436, Static460.method5932(local6.anInt2293, local36 << 24 | this.aClass117_Sub2_8.anInt7076), Static460.method5932(local6.anInt2292, local38 << 24 | this.aClass117_Sub2_8.anInt7076), Static460.method5932(local6.anInt2291, local42 << 24 | this.aClass117_Sub2_8.anInt7076));
						}
					} else if (local6.aShort43 >= 0) {
						arg3.method1688(local296, local352, local464, local268, local324, local436, local6.anInt2293, local6.anInt2292, local6.anInt2291, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort43);
					} else {
						arg3.method1682(local296, local352, local464, local268, local324, local436, local6.anInt2293, local6.anInt2292, local6.anInt2291);
					}
					arg3.anInt2055 = 0;
					return;
				}
				arg3.method1685(local296, local352, local464, local268, local324, local436, this.aClass117_Sub2_8.anInt7076);
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!ls;[I)V")
	@Override
	public void method5365(@OriginalArg(0) Class1_Sub29 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!kh", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass102ArrayArray1 == null) {
			this.aClass102ArrayArray1 = new Class102[super.anInt6757][super.anInt6758];
			this.aClass211ArrayArray1 = new Class211[super.anInt6757][super.anInt6758];
		} else if (this.aClass166ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static244.anIntArray44[Static358.method5263(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static244.anIntArray44[Static358.method5263(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == super.anInt6760 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt6760 && arg4[local116] == super.anInt6760) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt6760) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt6760 && arg2[local244] != arg2[0] - super.anInt6760) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt6760 && arg4[local244] != arg4[0] - super.anInt6760) {
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
			@Pc(334) Class102 local334 = new Class102();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt2289 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte44 = (byte) (local334.aByte44 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray31[arg0][arg1] == this.anIntArrayArray31[arg0 + 1][arg1] && this.anIntArrayArray31[arg0][arg1] == this.anIntArrayArray31[arg0 + 1][arg1 + 1] && this.anIntArrayArray31[arg0][arg1] == this.anIntArrayArray31[arg0][arg1 + 1]) {
				local334.aByte44 = (byte) (local334.aByte44 | 0x1);
			}
			if (local342 == -1 || (local334.aByte44 & 0x2) != 0 || this.aClass117_Sub2_8.anInterface4_10.method5090(local342).aBoolean60) {
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
				local334.anInt2293 = Static75.method933(Static472.method3079(arg6[local104] >> 8, this.aByteArrayArray69[arg0][arg1] - this.aByteArrayArray70[arg0][arg1]), arg10, local527);
				if (local334.anInt2289 != 0) {
					local334.anInt2293 |= this.aByteArrayArray70[arg0][arg1] + 255 - this.aByteArrayArray69[arg0][arg1] << 25;
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
				local334.anInt2292 = Static75.method933(Static472.method3079(arg6[local106] >> 8, this.aByteArrayArray69[arg0 + 1][arg1] - this.aByteArrayArray70[arg0 + 1][arg1]), arg10, local527);
				if (local334.anInt2289 != 0) {
					local334.anInt2292 |= this.aByteArrayArray70[arg0 + 1][arg1] + 255 - this.aByteArrayArray69[arg0 + 1][arg1] << 25;
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
				local334.anInt2290 = Static75.method933(Static472.method3079(arg6[local108] >> 8, this.aByteArrayArray69[arg0 + 1][arg1 + 1] - this.aByteArrayArray70[arg0 + 1][arg1 + 1]), arg10, local527);
				if (local334.anInt2289 != 0) {
					local334.anInt2290 |= this.aByteArrayArray70[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray69[arg0 + 1][arg1 + 1] << 25;
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
				local334.anInt2291 = Static75.method933(Static472.method3079(arg6[local110] >> 8, this.aByteArrayArray69[arg0][arg1 + 1] - this.aByteArrayArray70[arg0][arg1 + 1]), arg10, local527);
				if (local334.anInt2289 != 0) {
					local334.anInt2291 |= this.aByteArrayArray70[arg0][arg1 + 1] + 255 - this.aByteArrayArray69[arg0][arg1 + 1] << 25;
				}
				local334.aShort43 = -1;
			} else {
				local334.anInt2293 = this.aByteArrayArray69[arg0][arg1] - this.aByteArrayArray70[arg0][arg1];
				local334.anInt2292 = this.aByteArrayArray69[arg0 + 1][arg1] - this.aByteArrayArray70[arg0 + 1][arg1];
				local334.anInt2290 = this.aByteArrayArray69[arg0 + 1][arg1 + 1] - this.aByteArrayArray70[arg0 + 1][arg1 + 1];
				local334.anInt2291 = this.aByteArrayArray69[arg0][arg1 + 1] - this.aByteArrayArray70[arg0][arg1 + 1];
				local334.aShort43 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort45 = (short) arg5[local108];
				local334.aShort44 = (short) arg5[local110];
				local334.aShort47 = (short) arg5[local106];
				local334.aShort46 = (short) arg5[local104];
			}
			this.aClass102ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class211 local888 = new Class211();
		local888.aShort80 = (short) arg2.length;
		local888.aShort79 = (short) (arg2.length / 3);
		local888.aShortArray87 = new short[local888.aShort80];
		local888.aShortArray90 = new short[local888.aShort80];
		local888.aShortArray86 = new short[local888.aShort80];
		local888.anIntArray406 = new int[local888.aShort80];
		if (arg5 != null) {
			local888.aShortArray85 = new short[local888.aShort80];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort80; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray69[arg0][arg1] - this.aByteArrayArray70[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt6760) {
				local958 = this.aByteArrayArray69[arg0][arg1 + 1] - this.aByteArrayArray70[arg0][arg1 + 1];
			} else if (local342 == super.anInt6760 && local527 == super.anInt6760) {
				local958 = this.aByteArrayArray69[arg0 + 1][arg1 + 1] - this.aByteArrayArray70[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt6760 && local527 == 0) {
				local958 = this.aByteArrayArray69[arg0 + 1][arg1] - this.aByteArrayArray70[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray69[arg0][arg1] - this.aByteArrayArray70[arg0][arg1]) * (super.anInt6760 - local342) + (this.aByteArrayArray69[arg0 + 1][arg1] - this.aByteArrayArray70[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray69[arg0][arg1 + 1] - this.aByteArrayArray70[arg0][arg1 + 1]) * (super.anInt6760 - local342) + (this.aByteArrayArray69[arg0 + 1][arg1 + 1] - this.aByteArrayArray70[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt6760 - local527) + local1126 * local527 >> super.anInt6759 * 2;
			}
			local1079 = (arg0 << super.anInt6759) + local342;
			local1126 = (arg1 << super.anInt6759) + local527;
			local888.aShortArray87[local244] = (short) local342;
			local888.aShortArray86[local244] = (short) local527;
			local888.aShortArray90[local244] = (short) (this.ca(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass117_Sub2_8.anInterface4_10.method5090(arg8[local244]).aBoolean60) {
				local888.anIntArray406[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray85[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray406[local244] = Static75.method933(Static472.method3079(arg6[local244] >> 8, local958), arg10, local1226);
				if (arg7 != null) {
					local888.anIntArray406[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray406[local244] = 0;
			} else {
				local888.anIntArray406[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort79; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass117_Sub2_8.anInterface4_10.method5090(arg8[local527 * 3]).aBoolean60) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray405 = new int[local888.aShort79];
		}
		if (local1296) {
			local888.aShortArray88 = new short[local888.aShort79];
			local888.aShortArray89 = new short[local888.aShort79];
		}
		for (local958 = 0; local958 < local888.aShort79; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray405[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass117_Sub2_8.anInterface4_10.method5090(local1384).aBoolean60) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass117_Sub2_8.anInterface4_10.method5090(local1384).aBoolean60) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass117_Sub2_8.anInterface4_10.method5090(local1384).aBoolean60) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray88[local958] = (short) local1384;
					local888.aShortArray89[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass117_Sub2_8.anInterface4_10.method5090(local1384).aBoolean60) {
							local888.anIntArray406[local1079] = Static244.anIntArray44[Static358.method5263(this.aClass117_Sub2_8.anInterface4_10.method5090(local1384).aShort16 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass117_Sub2_8.anInterface4_10.method5090(local1384).aBoolean60) {
							local888.anIntArray406[local1126] = Static244.anIntArray44[Static358.method5263(this.aClass117_Sub2_8.anInterface4_10.method5090(local1384).aShort16 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass117_Sub2_8.anInterface4_10.method5090(local1384).aBoolean60) {
							local888.anIntArray406[local1226] = Static244.anIntArray44[Static358.method5263(this.aClass117_Sub2_8.anInterface4_10.method5090(local1384).aShort16 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray88[local958] = -1;
				}
			}
		}
		this.aClass211ArrayArray1[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!kh", name = "ua", descriptor = "(II)I")
	@Override
	public int ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray31[arg0][arg1];
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method5362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class34_Sub1 local3 = this.aClass117_Sub2_8.aClass34_Sub1_3;
		this.anInt3936 = -1;
		this.anInt3933 = local3.anInt2118;
		this.anInt3940 = local3.anInt2123;
		this.anInt3935 = local3.anInt2122;
		this.anInt3938 = local3.anInt2126;
		this.anInt3942 = local3.anInt2124;
		this.anInt3946 = local3.anInt2127;
		this.anInt3945 = local3.anInt2125;
		this.anInt3939 = local3.anInt2117;
		this.anInt3934 = local3.anInt2116;
		this.anInt3941 = local3.anInt2121;
		this.anInt3944 = local3.anInt2119;
		this.anInt3937 = local3.anInt2120;
	}
}
