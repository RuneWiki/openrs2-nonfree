import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
	private int anInt469;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "[[Lclient!jf;")
	private Class131[][] aClass131ArrayArray1;

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
	private int anInt471;

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
	private int anInt472;

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
	private int anInt473;

	@OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
	private int anInt474;

	@OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
	private int anInt475;

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
	private int anInt476;

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
	private int anInt477;

	@OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
	private int anInt479;

	@OriginalMember(owner = "client!bf", name = "v", descriptor = "[[Lclient!ti;")
	private Class237[][] aClass237ArrayArray1;

	@OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
	private int anInt480;

	@OriginalMember(owner = "client!bf", name = "x", descriptor = "[[Lclient!ka;")
	private Class143[][] aClass143ArrayArray1;

	@OriginalMember(owner = "client!bf", name = "y", descriptor = "[[Lclient!he;")
	private Class108[][] aClass108ArrayArray1;

	@OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
	private int anInt481;

	@OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
	private int anInt482;

	@OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
	private int anInt478 = -1;

	@OriginalMember(owner = "client!bf", name = "z", descriptor = "Lclient!f;")
	private final Class75_Sub1 aClass75_Sub1_2;

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
	private final int anInt470;

	@OriginalMember(owner = "client!bf", name = "p", descriptor = "[[I")
	public final int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!bf", name = "A", descriptor = "[[B")
	private byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "[[B")
	private byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!f;IIII[[I[[II)V")
	public Class22_Sub1(@OriginalArg(0) Class75_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass75_Sub1_2 = arg0;
		this.anInt470 = arg2;
		this.anIntArrayArray14 = arg5;
		this.aByteArrayArray4 = new byte[arg3 + 1][arg4 + 1];
		@Pc(31) int local31 = this.aClass75_Sub1_2.anInt1755 >> 9;
		for (@Pc(33) int local33 = 1; local33 < arg4; local33++) {
			for (@Pc(36) int local36 = 1; local36 < arg3; local36++) {
				@Pc(55) int local55 = arg6[local36 + 1][local33] - arg6[local36 - 1][local33];
				@Pc(71) int local71 = arg6[local36][local33 + 1] - arg6[local36][local33 - 1];
				@Pc(86) int local86 = (int) Math.sqrt((double) (local55 * local55 + arg7 * 512 + local71 * local71));
				@Pc(92) int local92 = (local55 << 8) / local86;
				@Pc(98) int local98 = arg7 * -512 / local86;
				@Pc(104) int local104 = (local71 << 8) / local86;
				@Pc(126) int local126 = local31 + (this.aClass75_Sub1_2.anInt1761 * local92 + this.aClass75_Sub1_2.anInt1763 * local98 + this.aClass75_Sub1_2.anInt1739 * local104 >> 17);
				local126 >>= 0x1;
				if (local126 < 2) {
					local126 = 2;
				} else if (local126 > 126) {
					local126 = 126;
				}
				this.aByteArrayArray4[local36][local33] = (byte) local126;
			}
		}
		this.aByteArrayArray3 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIII[[ZLclient!uq;[I[I)V")
	private void method455(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class250 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean476 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass143ArrayArray1[local22][local25] != null) {
						@Pc(50) Class143 local50 = this.aClass143ArrayArray1[local22][local25];
						if (local50.aShort48 != -1 && (local50.aByte59 & 0x2) == 0 && local50.anInt3557 == -1) {
							local69 = this.aClass75_Sub1_2.method1728(local50.aShort48);
							arg5.method5733(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static316.method4495(local50.aShort46 & 0xFFFF, local69), Static316.method4495(local50.aShort45 & 0xFFFF, local69), Static316.method4495(local50.aShort49 & 0xFFFF, local69));
							arg5.method5733(local20, local20, local20 - 4, local16, local16 + 4, local16, Static316.method4495(local50.aShort47 & 0xFFFF, local69), Static316.method4495(local50.aShort49 & 0xFFFF, local69), Static316.method4495(local50.aShort45 & 0xFFFF, local69));
						} else if (local50.anInt3557 == -1) {
							arg5.method5733(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort46 & 0xFFFF, local50.aShort45 & 0xFFFF, local50.aShort49 & 0xFFFF);
							arg5.method5733(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort47 & 0xFFFF, local50.aShort49 & 0xFFFF, local50.aShort45 & 0xFFFF);
						} else {
							local69 = local50.anInt3557;
							arg5.method5733(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method5733(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass108ArrayArray1[local22][local25] != null) {
						@Pc(249) Class108 local249 = this.aClass108ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort31; local69++) {
							arg6[local69] = local16 + local249.aShortArray40[local69] * 4 / super.anInt2818;
							arg7[local69] = local20 - local249.aShortArray34[local69] * 4 / super.anInt2818;
						}
						for (@Pc(287) int local287 = 0; local287 < local249.aShort32; local287++) {
							@Pc(293) short local293 = local249.aShortArray41[local287];
							@Pc(298) short local298 = local249.aShortArray36[local287];
							@Pc(303) short local303 = local249.aShortArray39[local287];
							@Pc(307) int local307 = arg6[local293];
							@Pc(311) int local311 = arg6[local298];
							@Pc(315) int local315 = arg6[local303];
							@Pc(319) int local319 = arg7[local293];
							@Pc(323) int local323 = arg7[local298];
							@Pc(327) int local327 = arg7[local303];
							@Pc(341) int local341;
							if (local249.anIntArray236 != null && local249.anIntArray236[local287] != -1) {
								local341 = local249.anIntArray236[local287];
								arg5.method5733(local319, local323, local327, local307, local311, local315, Static316.method4495(local249.aShortArray37[local293], local341), Static316.method4495(local249.aShortArray37[local298], local341), Static316.method4495(local249.aShortArray37[local303], local341));
							} else if (local249.aShortArray42 == null || local249.aShortArray42[local287] == -1) {
								local341 = local249.anIntArray235[local287];
								arg5.method5733(local319, local323, local327, local307, local311, local315, Static316.method4495(local249.aShortArray37[local293], local341), Static316.method4495(local249.aShortArray37[local298], local341), Static316.method4495(local249.aShortArray37[local303], local341));
							} else {
								local341 = this.aClass75_Sub1_2.method1728(local249.aShortArray42[local287]);
								arg5.method5733(local319, local323, local327, local307, local311, local315, Static316.method4495(local249.aShortArray37[local293], local341), Static316.method4495(local249.aShortArray37[local298], local341), Static316.method4495(local249.aShortArray37[local303], local341));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean476 = true;
	}

	@OriginalMember(owner = "client!bf", name = "ca", descriptor = "(II)I")
	@Override
	public int ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> super.anInt2817;
		@Pc(9) int local9 = arg1 >> super.anInt2817;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt2819 - 1 || local9 > super.anInt2816 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & super.anInt2818 - 1;
		@Pc(41) int local41 = arg1 & super.anInt2818 - 1;
		@Pc(67) int local67 = this.anIntArrayArray14[local4][local9] * (super.anInt2818 - local34) + this.anIntArrayArray14[local4 + 1][local9] * local34 >> super.anInt2817;
		@Pc(97) int local97 = this.anIntArrayArray14[local4][local9 + 1] * (super.anInt2818 - local34) + this.anIntArrayArray14[local4 + 1][local9 + 1] * local34 >> super.anInt2817;
		return local67 * (super.anInt2818 - local41) + local97 * local41 >> super.anInt2817;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method2326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass143ArrayArray1 == null) {
			this.aClass143ArrayArray1 = new Class143[super.anInt2819][super.anInt2816];
			this.aClass108ArrayArray1 = new Class108[super.anInt2819][super.anInt2816];
		} else if (this.aClass237ArrayArray1 != null) {
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
				if (local64 != 0 && local64 != super.anInt2818 || local70 != 0 && local70 != super.anInt2818) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class108 local95 = new Class108();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort31 = local99;
			local95.aShortArray37 = new short[local99];
			local95.aShortArray40 = new short[local99];
			local95.aShortArray38 = new short[local99];
			local95.aShortArray34 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray37[local124] = (short) (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray3[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt2818) {
					local95.aShortArray37[local124] = (short) (this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray3[arg0][arg1 + 1]);
				} else if (local129 == super.anInt2818 && local133 == super.anInt2818) {
					local95.aShortArray37[local124] = (short) (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray3[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt2818 && local133 == 0) {
					local95.aShortArray37[local124] = (short) (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray3[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray3[arg0][arg1]) * (super.anInt2818 - local129) + (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray3[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray3[arg0][arg1 + 1]) * (super.anInt2818 - local129) + (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray3[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray37[local124] = (short) (local288 * (super.anInt2818 - local133) + local335 * local133 >> super.anInt2817 * 2);
				}
				local288 = (arg0 << super.anInt2817) + local129;
				local335 = (arg1 << super.anInt2817) + local133;
				local95.aShortArray40[local124] = (short) local129;
				local95.aShortArray34[local124] = (short) local133;
				local95.aShortArray38[local124] = (short) (this.ca(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray37[local124] < 2) {
					local95.aShortArray37[local124] = 2;
				}
			}
			@Pc(415) boolean local415 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass75_Sub1_2.anInterface7_8.method1170(arg11[local288]).aBoolean485) {
					local415 = true;
				}
			}
			local95.anIntArray235 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray236 = new int[local133];
			}
			local95.aShortArray41 = new short[local133];
			local95.aShortArray36 = new short[local133];
			local95.aShortArray39 = new short[local133];
			if (local415) {
				local95.aShortArray42 = new short[local133];
				local95.aShortArray35 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray235[local95.aShort32] = Static36.method578(arg9[local335]);
					} else {
						local95.anIntArray235[local95.aShort32] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray236[local95.aShort32] = -1;
						} else {
							local95.anIntArray236[local95.aShort32] = Static36.method578(arg10[local335]);
						}
					}
					local95.aShortArray41[local95.aShort32] = (short) arg6[local335];
					local95.aShortArray36[local95.aShort32] = (short) arg7[local335];
					local95.aShortArray39[local95.aShort32] = (short) arg8[local335];
					if (local415) {
						if (arg11[local335] == -1 || this.aClass75_Sub1_2.anInterface7_8.method1170(arg11[local335]).aBoolean485) {
							local95.aShortArray42[local95.aShort32] = -1;
						} else {
							local95.aShortArray42[local95.aShort32] = (short) arg11[local335];
							local95.aShortArray35[local95.aShort32] = (short) arg12[local335];
						}
					}
					local95.aShort32++;
				}
			}
			this.aClass108ArrayArray1[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(644) Class143 local644 = new Class143();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local644.anInt3557 = Static316.method4495(this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray3[arg0][arg1], Static36.method578(arg10[0]));
				if (local64 == -1) {
					local644.aByte59 = (byte) (local644.aByte59 | 0x2);
				}
			}
			if (this.anIntArrayArray14[arg0][arg1] == this.anIntArrayArray14[arg0 + 1][arg1] && this.anIntArrayArray14[arg0][arg1] == this.anIntArrayArray14[arg0 + 1][arg1 + 1] && this.anIntArrayArray14[arg0][arg1] == this.anIntArrayArray14[arg0][arg1 + 1]) {
				local644.aByte59 = (byte) (local644.aByte59 | 0x1);
			}
			if (local70 == -1 || (local644.aByte59 & 0x2) != 0 || this.aClass75_Sub1_2.anInterface7_8.method1170(local70).aBoolean485) {
				@Pc(845) short local845 = Static36.method578(local64);
				local644.aShort47 = (short) Static316.method4495(this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray3[arg0][arg1], local845);
				local644.aShort49 = (short) Static316.method4495(this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray3[arg0 + 1][arg1], local845);
				local644.aShort46 = (short) Static316.method4495(this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray3[arg0 + 1][arg1 + 1], local845);
				local644.aShort45 = (short) Static316.method4495(this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray3[arg0][arg1 + 1], local845);
				local644.aShort48 = -1;
			} else {
				local644.aShort47 = (short) (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray3[arg0][arg1]);
				local644.aShort49 = (short) (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray3[arg0 + 1][arg1]);
				local644.aShort46 = (short) (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray3[arg0 + 1][arg1 + 1]);
				local644.aShort45 = (short) (this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray3[arg0][arg1 + 1]);
				local644.aShort48 = (short) local70;
			}
			this.aClass143ArrayArray1[arg0][arg1] = local644;
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(IIIIIII[[ZLclient!uq;[I[I)V")
	private void method456(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class250 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean476 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass237ArrayArray1[local22][local25] != null) {
						@Pc(50) Class237 local50 = this.aClass237ArrayArray1[local22][local25];
						if (local50.aShort85 != -1 && (local50.aByte82 & 0x2) == 0 && local50.anInt6747 == 0) {
							local68 = this.aClass75_Sub1_2.method1728(local50.aShort85);
							arg5.method5733(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static316.method4495(local50.anInt6749, local68), Static316.method4495(local50.anInt6750, local68), Static316.method4495(local50.anInt6751, local68));
							arg5.method5733(local20, local20, local20 - 4, local16, local16 + 4, local16, Static316.method4495(local50.anInt6748, local68), Static316.method4495(local50.anInt6751, local68), Static316.method4495(local50.anInt6750, local68));
						} else if (local50.anInt6747 == 0) {
							arg5.method5732(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt6749, local50.anInt6750, local50.anInt6751);
							arg5.method5732(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt6748, local50.anInt6751, local50.anInt6750);
						} else {
							local68 = local50.anInt6747;
							arg5.method5732(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static181.method2420(local50.anInt6749 & 0xFF000000, local68), Static181.method2420(local50.anInt6750 & 0xFF000000, local68), Static181.method2420(local50.anInt6751 & 0xFF000000, local68));
							arg5.method5732(local20, local20, local20 - 4, local16, local16 + 4, local16, Static181.method2420(local50.anInt6748 & 0xFF000000, local68), Static181.method2420(local50.anInt6751 & 0xFF000000, local68), Static181.method2420(local50.anInt6750 & 0xFF000000, local68));
						}
					} else if (this.aClass131ArrayArray1[local22][local25] != null) {
						@Pc(259) Class131 local259 = this.aClass131ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort41; local68++) {
							arg6[local68] = local16 + local259.aShortArray47[local68] * 4 / super.anInt2818;
							arg7[local68] = local20 - local259.aShortArray51[local68] * 4 / super.anInt2818;
						}
						for (@Pc(297) int local297 = 0; local297 < local259.aShort40; local297++) {
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
							if (local259.anIntArray278 != null && local259.anIntArray278[local297] != 0 && (local259.aShortArray49 == null || local259.aShortArray49 != null && local259.aShortArray49[local297] == -1)) {
								local359 = local259.anIntArray278[local297];
								arg5.method5732(local326, local330, local334, local314, local318, local322, Static181.method2420(-(local259.anIntArray277[local302] & -16777216) - 16777216, local359), Static181.method2420(-(local259.anIntArray277[local306] & -16777216) - 16777216, local359), Static181.method2420(-(local259.anIntArray277[local310] & -16777216) - 16777216, local359));
							} else if (local259.aShortArray49 == null || local259.aShortArray49[local297] == -1) {
								arg5.method5732(local326, local330, local334, local314, local318, local322, local259.anIntArray277[local302], local259.anIntArray277[local306], local259.anIntArray277[local310]);
							} else {
								local359 = this.aClass75_Sub1_2.method1728(local259.aShortArray49[local297]);
								arg5.method5733(local326, local330, local334, local314, local318, local322, local359, local359, local359);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean476 = true;
	}

	@OriginalMember(owner = "client!bf", name = "qa", descriptor = "(III)V")
	@Override
	public void qa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray3[arg0][arg1] < arg2) {
			this.aByteArrayArray3[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIZLclient!uq;[I[I[I)V")
	private void method457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class250 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class237 local6 = this.aClass237ArrayArray1[arg0][arg1];
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
			@Pc(1452) Class131 local1452 = this.aClass131ArrayArray1[arg0][arg1];
			if (local1452 != null) {
				if (this.anInt478 == -1) {
					for (local436 = 0; local436 < local1452.aShort41; local436++) {
						local24 = local1452.aShortArray47[local436] + (arg0 << super.anInt2817);
						local29 = local1452.aShortArray48[local436];
						local34 = local1452.aShortArray51[local436] + (arg1 << super.anInt2817);
						local380 = this.anInt471 + (this.anInt469 * local24 + this.anInt479 * local29 + this.anInt476 * local34 >> 15);
						if (local380 <= this.aClass75_Sub1_2.anInt1750) {
							return;
						}
						arg6[local436] = 0;
						if (arg2) {
							local296 = local380 - this.aClass75_Sub1_2.anInt1756;
							if (local296 > 255) {
								local296 = 255;
							}
							if (local296 > 0) {
								arg6[local436] = local296;
								local352 = local1452.aShortArray50[local436] * local296 / 255;
								if (local352 > 0) {
									local29 -= local352;
								}
							}
						} else if (this.aClass75_Sub1_2.aBoolean105) {
							local296 = local380 - this.aClass75_Sub1_2.anInt1756;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt475 + (this.anInt480 * local24 + this.anInt481 * local29 + this.anInt472 * local34 >> 15);
						local324 = this.anInt482 + (this.anInt473 * local24 + this.anInt477 * local29 + this.anInt474 * local34 >> 15);
						arg4[local436] = arg3.anInt7164 + local268 * this.aClass75_Sub1_2.anInt1745 / local380;
						arg5[local436] = arg3.anInt7165 + local324 * this.aClass75_Sub1_2.anInt1746 / local380;
					}
				} else {
					for (local436 = 0; local436 < local1452.aShort41; local436++) {
						local24 = local1452.aShortArray47[local436] + (arg0 << super.anInt2817);
						local29 = local1452.aShortArray48[local436];
						local34 = local1452.aShortArray51[local436] + (arg1 << super.anInt2817);
						arg6[local436] = 0;
						if (arg2) {
							local296 = this.anInt478 - this.aClass75_Sub1_2.anInt1756;
							if (local296 > 255) {
								local296 = 255;
							}
							if (local296 > 0) {
								arg6[local436] = local296;
								local352 = local1452.aShortArray50[local436] * local296 / 255;
								if (local352 > 0) {
									local29 -= local352;
								}
							}
						} else if (this.aClass75_Sub1_2.aBoolean105) {
							local296 = this.anInt478 - this.aClass75_Sub1_2.anInt1756;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt475 + (this.anInt480 * local24 + this.anInt481 * local29 + this.anInt472 * local34 >> 15);
						local324 = this.anInt482 + (this.anInt473 * local24 + this.anInt477 * local29 + this.anInt474 * local34 >> 15);
						arg4[local436] = arg3.anInt7164 + local268 * this.aClass75_Sub1_2.anInt1745 / this.anInt478;
						arg5[local436] = arg3.anInt7165 + local324 * this.aClass75_Sub1_2.anInt1746 / this.anInt478;
					}
				}
				if (local1452.aShortArray49 != null) {
					local436 = this.anIntArrayArray14[arg0][arg1];
					local296 = this.anIntArrayArray14[arg0 + 1][arg1];
					local352 = this.anIntArrayArray14[arg0][arg1 + 1];
					local408 = arg0 * super.anInt2818;
					local464 = local408 + super.anInt2818;
					local257 = arg1 * super.anInt2818;
					local313 = local257 + super.anInt2818;
					local369 = this.anInt475 + (this.anInt480 * local408 + this.anInt481 * local436 + this.anInt472 * local257 >> 15);
					local425 = this.anInt482 + (this.anInt473 * local408 + this.anInt477 * local436 + this.anInt474 * local257 >> 15);
					local285 = this.anInt471 + (this.anInt469 * local408 + this.anInt479 * local436 + this.anInt476 * local257 >> 15);
					local341 = this.anInt475 + (this.anInt480 * local464 + this.anInt481 * local296 + this.anInt472 * local257 >> 15);
					local397 = this.anInt482 + (this.anInt473 * local464 + this.anInt477 * local296 + this.anInt474 * local257 >> 15);
					local453 = this.anInt471 + (this.anInt469 * local464 + this.anInt479 * local296 + this.anInt476 * local257 >> 15);
					local82 = this.anInt475 + (this.anInt480 * local408 + this.anInt481 * local352 + this.anInt472 * local313 >> 15);
					local105 = this.anInt482 + (this.anInt473 * local408 + this.anInt477 * local352 + this.anInt474 * local313 >> 15);
					local128 = this.anInt471 + (this.anInt469 * local408 + this.anInt479 * local352 + this.anInt476 * local313 >> 15);
					for (local151 = 0; local151 < local1452.aShort40; local151++) {
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
							arg3.aBoolean479 = local42 < 0 || local176 < 0 || local56 < 0 || local42 > arg3.anInt7163 || local176 > arg3.anInt7163 || local56 > arg3.anInt7163;
							@Pc(2138) short local2138 = local1452.aShortArray49[local151];
							if (local642 < 765) {
								if (local2138 != -1 && this.method459(this.aClass75_Sub1_2.anInterface7_8.method1170(local2138).aByte96)) {
									arg3.anInt7161 = 100;
								}
								if (local642 > 0) {
									if (local2138 != -1) {
										arg3.method5734(local65, local240, local501, local42, local176, local56, this.aClass75_Sub1_2.anInt1741, arg6[local36], arg6[local38], arg6[local40], local1452.anIntArray277[local36], local1452.anIntArray277[local38], local1452.anIntArray277[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
									} else if ((local1452.anIntArray277[local36] & 0xFFFFFF) != 0) {
										arg3.method5732(local65, local240, local501, local42, local176, local56, Static181.method2420(arg6[local36] << 24 | this.aClass75_Sub1_2.anInt1741, local1452.anIntArray277[local36]), Static181.method2420(arg6[local38] << 24 | this.aClass75_Sub1_2.anInt1741, local1452.anIntArray277[local38]), Static181.method2420(arg6[local40] << 24 | this.aClass75_Sub1_2.anInt1741, local1452.anIntArray277[local40]));
									}
								} else if (local2138 != -1) {
									arg3.method5736(local65, local240, local501, local42, local176, local56, local1452.anIntArray277[local36], local1452.anIntArray277[local38], local1452.anIntArray277[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
								} else if ((local1452.anIntArray277[local36] & 0xFFFFFF) != 0) {
									arg3.method5732(local65, local240, local501, local42, local176, local56, local1452.anIntArray277[local36], local1452.anIntArray277[local38], local1452.anIntArray277[local40]);
								}
								arg3.anInt7161 = 0;
							} else {
								arg3.method5735(local65, local240, local501, local42, local176, local56, this.aClass75_Sub1_2.anInt1741);
							}
						}
					}
					return;
				}
				for (local436 = 0; local436 < local1452.aShort40; local436++) {
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
						arg3.aBoolean479 = local464 < 0 || local257 < 0 || local313 < 0 || local464 > arg3.anInt7163 || local257 > arg3.anInt7163 || local313 > arg3.anInt7163;
						if (local341 >= 765) {
							arg3.method5735(local369, local425, local285, local464, local257, local313, this.aClass75_Sub1_2.anInt1741);
						} else if (local341 > 0) {
							if ((local1452.anIntArray277[local296] & 0xFFFFFF) != 0) {
								arg3.method5732(local369, local425, local285, local464, local257, local313, Static224.method3092(arg6[local296], local1452.anIntArray277[local296], this.aClass75_Sub1_2.anInt1741), Static224.method3092(arg6[local352], local1452.anIntArray277[local352], this.aClass75_Sub1_2.anInt1741), Static224.method3092(arg6[local408], local1452.anIntArray277[local408], this.aClass75_Sub1_2.anInt1741));
							}
						} else if ((local1452.anIntArray277[local296] & 0xFFFFFF) != 0) {
							arg3.method5732(local369, local425, local285, local464, local257, local313, local1452.anIntArray277[local296], local1452.anIntArray277[local352], local1452.anIntArray277[local408]);
						}
					}
				}
			}
		} else if ((local6.aByte82 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt2818;
			local24 = local19 + super.anInt2818;
			local29 = arg1 * super.anInt2818;
			local34 = local29 + super.anInt2818;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte82 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray14[arg0][arg1];
				local65 = this.anIntArrayArray14[arg0 + 1][arg1];
				local240 = this.anIntArrayArray14[arg0 + 1][arg1 + 1];
				local501 = this.anIntArrayArray14[arg0][arg1 + 1];
				if (this.anInt478 == -1) {
					local82 = this.anInt471 + (this.anInt469 * local19 + this.anInt479 * local56 + this.anInt476 * local29 >> 15);
					if (local82 <= this.aClass75_Sub1_2.anInt1750) {
						return;
					}
					local105 = this.anInt471 + (this.anInt469 * local24 + this.anInt479 * local65 + this.anInt476 * local29 >> 15);
					if (local105 <= this.aClass75_Sub1_2.anInt1750) {
						return;
					}
					local128 = this.anInt471 + (this.anInt469 * local24 + this.anInt479 * local240 + this.anInt476 * local34 >> 15);
					if (local128 <= this.aClass75_Sub1_2.anInt1750) {
						return;
					}
					local151 = this.anInt471 + (this.anInt469 * local19 + this.anInt479 * local501 + this.anInt476 * local34 >> 15);
					if (local151 <= this.aClass75_Sub1_2.anInt1750) {
						return;
					}
				} else {
					local151 = this.anInt478;
					local128 = this.anInt478;
					local105 = this.anInt478;
					local82 = this.anInt478;
				}
				if (arg2) {
					local176 = local82 - this.aClass75_Sub1_2.anInt1756;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local36 = local176;
						local642 = local6.aShort81 * local176 / 255;
						if (local642 > 0) {
							local56 -= local642;
						}
					}
					local176 = local105 - this.aClass75_Sub1_2.anInt1756;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local38 = local176;
						local642 = local6.aShort82 * local176 / 255;
						if (local642 > 0) {
							local65 -= local642;
						}
					}
					local176 = local128 - this.aClass75_Sub1_2.anInt1756;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local40 = local176;
						local642 = local6.aShort84 * local176 / 255;
						if (local642 > 0) {
							local240 -= local642;
						}
					}
					local176 = local151 - this.aClass75_Sub1_2.anInt1756;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local42 = local176;
						local642 = local6.aShort83 * local176 / 255;
						if (local642 > 0) {
							local501 -= local642;
						}
					}
				} else if (this.aClass75_Sub1_2.aBoolean105) {
					local176 = local82 - this.aClass75_Sub1_2.anInt1756;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass75_Sub1_2.anInt1756;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass75_Sub1_2.anInt1756;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass75_Sub1_2.anInt1756;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local257 = this.anInt475 + (this.anInt480 * local19 + this.anInt481 * local56 + this.anInt472 * local29 >> 15);
				local268 = arg3.anInt7164 + local257 * this.aClass75_Sub1_2.anInt1745 / local82;
				local285 = this.anInt482 + (this.anInt473 * local19 + this.anInt477 * local56 + this.anInt474 * local29 >> 15);
				local296 = arg3.anInt7165 + local285 * this.aClass75_Sub1_2.anInt1746 / local82;
				local313 = this.anInt475 + (this.anInt480 * local24 + this.anInt481 * local65 + this.anInt472 * local29 >> 15);
				local324 = arg3.anInt7164 + local313 * this.aClass75_Sub1_2.anInt1745 / local105;
				local341 = this.anInt482 + (this.anInt473 * local24 + this.anInt477 * local65 + this.anInt474 * local29 >> 15);
				local352 = arg3.anInt7165 + local341 * this.aClass75_Sub1_2.anInt1746 / local105;
				local369 = this.anInt475 + (this.anInt480 * local24 + this.anInt481 * local240 + this.anInt472 * local34 >> 15);
				local380 = arg3.anInt7164 + local369 * this.aClass75_Sub1_2.anInt1745 / local128;
				local397 = this.anInt482 + (this.anInt473 * local24 + this.anInt477 * local240 + this.anInt474 * local34 >> 15);
				local408 = arg3.anInt7165 + local397 * this.aClass75_Sub1_2.anInt1746 / local128;
				local425 = this.anInt475 + (this.anInt480 * local19 + this.anInt481 * local501 + this.anInt472 * local34 >> 15);
				local436 = arg3.anInt7164 + local425 * this.aClass75_Sub1_2.anInt1745 / local151;
				local453 = this.anInt482 + (this.anInt473 * local19 + this.anInt477 * local501 + this.anInt474 * local34 >> 15);
				local464 = arg3.anInt7165 + local453 * this.aClass75_Sub1_2.anInt1746 / local151;
			} else {
				local56 = this.anIntArrayArray14[arg0][arg1];
				if (this.anInt478 == -1) {
					local65 = this.anInt479 * local56;
					local82 = this.anInt471 + (this.anInt469 * local19 + local65 + this.anInt476 * local29 >> 15);
					if (local82 <= this.aClass75_Sub1_2.anInt1750) {
						return;
					}
					local105 = this.anInt471 + (this.anInt469 * local24 + local65 + this.anInt476 * local29 >> 15);
					if (local105 <= this.aClass75_Sub1_2.anInt1750) {
						return;
					}
					local128 = this.anInt471 + (this.anInt469 * local24 + local65 + this.anInt476 * local34 >> 15);
					if (local128 <= this.aClass75_Sub1_2.anInt1750) {
						return;
					}
					local151 = this.anInt471 + (this.anInt469 * local19 + local65 + this.anInt476 * local34 >> 15);
					if (local151 <= this.aClass75_Sub1_2.anInt1750) {
						return;
					}
				} else {
					local151 = this.anInt478;
					local128 = this.anInt478;
					local105 = this.anInt478;
					local82 = this.anInt478;
				}
				if (this.aClass75_Sub1_2.aBoolean105) {
					local176 = local82 - this.aClass75_Sub1_2.anInt1756;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass75_Sub1_2.anInt1756;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass75_Sub1_2.anInt1756;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass75_Sub1_2.anInt1756;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local65 = this.anInt481 * local56;
				local240 = this.anInt477 * local56;
				local257 = this.anInt475 + (this.anInt480 * local19 + local65 + this.anInt472 * local29 >> 15);
				local268 = arg3.anInt7164 + local257 * this.aClass75_Sub1_2.anInt1745 / local82;
				local285 = this.anInt482 + (this.anInt473 * local19 + local240 + this.anInt474 * local29 >> 15);
				local296 = arg3.anInt7165 + local285 * this.aClass75_Sub1_2.anInt1746 / local82;
				local313 = this.anInt475 + (this.anInt480 * local24 + local65 + this.anInt472 * local29 >> 15);
				local324 = arg3.anInt7164 + local313 * this.aClass75_Sub1_2.anInt1745 / local105;
				local341 = this.anInt482 + (this.anInt473 * local24 + local240 + this.anInt474 * local29 >> 15);
				local352 = arg3.anInt7165 + local341 * this.aClass75_Sub1_2.anInt1746 / local105;
				local369 = this.anInt475 + (this.anInt480 * local24 + local65 + this.anInt472 * local34 >> 15);
				local380 = arg3.anInt7164 + local369 * this.aClass75_Sub1_2.anInt1745 / local128;
				local397 = this.anInt482 + (this.anInt473 * local24 + local240 + this.anInt474 * local34 >> 15);
				local408 = arg3.anInt7165 + local397 * this.aClass75_Sub1_2.anInt1746 / local128;
				local425 = this.anInt475 + (this.anInt480 * local19 + local65 + this.anInt472 * local34 >> 15);
				local436 = arg3.anInt7164 + local425 * this.aClass75_Sub1_2.anInt1745 / local151;
				local453 = this.anInt482 + (this.anInt473 * local19 + local240 + this.anInt474 * local34 >> 15);
				local464 = arg3.anInt7165 + local453 * this.aClass75_Sub1_2.anInt1746 / local151;
			}
			@Pc(1064) boolean local1064 = local6.aShort85 != -1 && this.method459(this.aClass75_Sub1_2.anInterface7_8.method1170(local6.aShort85).aByte96);
			local65 = local38 + local40 + local42;
			if ((local380 - local436) * (local352 - local464) - (local408 - local464) * (local324 - local436) > 0) {
				arg3.aBoolean479 = local380 < 0 || local436 < 0 || local324 < 0 || local380 > arg3.anInt7163 || local436 > arg3.anInt7163 || local324 > arg3.anInt7163;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt7161 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort85 >= 0) {
							arg3.method5734(local408, local464, local352, local380, local436, local324, this.aClass75_Sub1_2.anInt1741, local40, local42, local38, local6.anInt6749, local6.anInt6750, local6.anInt6751, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort85);
						} else {
							arg3.method5732(local408, local464, local352, local380, local436, local324, Static181.method2420(local40 << 24 | this.aClass75_Sub1_2.anInt1741, local6.anInt6749), Static181.method2420(local42 << 24 | this.aClass75_Sub1_2.anInt1741, local6.anInt6750), Static181.method2420(local38 << 24 | this.aClass75_Sub1_2.anInt1741, local6.anInt6751));
						}
					} else if (local6.aShort85 >= 0) {
						arg3.method5736(local408, local464, local352, local380, local436, local324, local6.anInt6749, local6.anInt6750, local6.anInt6751, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort85);
					} else {
						arg3.method5732(local408, local464, local352, local380, local436, local324, local6.anInt6749, local6.anInt6750, local6.anInt6751);
					}
					arg3.anInt7161 = 0;
				} else {
					arg3.method5735(local408, local464, local352, local380, local436, local324, this.aClass75_Sub1_2.anInt1741);
				}
			}
			local65 = local36 + local38 + local42;
			if ((local268 - local324) * (local464 - local352) - (local296 - local352) * (local436 - local324) > 0) {
				arg3.aBoolean479 = local268 < 0 || local324 < 0 || local436 < 0 || local268 > arg3.anInt7163 || local324 > arg3.anInt7163 || local436 > arg3.anInt7163;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt7161 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort85 >= 0) {
							arg3.method5734(local296, local352, local464, local268, local324, local436, this.aClass75_Sub1_2.anInt1741, local36, local38, local42, local6.anInt6748, local6.anInt6751, local6.anInt6750, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort85);
						} else {
							arg3.method5732(local296, local352, local464, local268, local324, local436, Static181.method2420(local36 << 24 | this.aClass75_Sub1_2.anInt1741, local6.anInt6748), Static181.method2420(local38 << 24 | this.aClass75_Sub1_2.anInt1741, local6.anInt6751), Static181.method2420(local42 << 24 | this.aClass75_Sub1_2.anInt1741, local6.anInt6750));
						}
					} else if (local6.aShort85 >= 0) {
						arg3.method5736(local296, local352, local464, local268, local324, local436, local6.anInt6748, local6.anInt6751, local6.anInt6750, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort85);
					} else {
						arg3.method5732(local296, local352, local464, local268, local324, local436, local6.anInt6748, local6.anInt6751, local6.anInt6750);
					}
					arg3.anInt7161 = 0;
					return;
				}
				arg3.method5735(local296, local352, local464, local268, local324, local436, this.aClass75_Sub1_2.anInt1741);
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "ba", descriptor = "(Lclient!i;IIIIZ)V")
	@Override
	public void ba(@OriginalArg(0) Class2_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!bf", name = "ua", descriptor = "(II)I")
	@Override
	public int ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray14[arg0][arg1];
	}

	@OriginalMember(owner = "client!bf", name = "aa", descriptor = "()V")
	@Override
	public void aa() {
		this.aByteArrayArray4 = null;
		this.aByteArrayArray3 = null;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
	@Override
	public void method2327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class88 local4 = this.aClass75_Sub1_2.method1730(Thread.currentThread());
		local4.aClass250_1.anInt7161 = 0;
		if (this.aClass237ArrayArray1 != null) {
			this.method457(arg0, arg1, this.aClass75_Sub1_2.aBoolean103, local4.aClass250_1, local4.anIntArray172, local4.anIntArray173, local4.anIntArray156);
		} else if (this.aClass143ArrayArray1 != null) {
			this.method460(arg0, arg1, local4.aClass250_1, local4.anIntArray172, local4.anIntArray173, local4.anIntArray156);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method2325(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class88 local4 = this.aClass75_Sub1_2.method1730(Thread.currentThread());
		@Pc(7) Class250 local7 = local4.aClass250_1;
		local7.anInt7161 = 0;
		local7.aBoolean479 = false;
		if (this.aClass237ArrayArray1 != null) {
			this.method456(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray172, local4.anIntArray173);
		} else if (this.aClass143ArrayArray1 != null) {
			this.method455(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray172, local4.anIntArray173);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method2328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class6_Sub1 local3 = this.aClass75_Sub1_2.aClass6_Sub1_1;
		this.anInt478 = -1;
		this.anInt480 = local3.anInt95;
		this.anInt481 = local3.anInt102;
		this.anInt472 = local3.anInt93;
		this.anInt475 = local3.anInt94;
		this.anInt473 = local3.anInt97;
		this.anInt477 = local3.anInt101;
		this.anInt474 = local3.anInt98;
		this.anInt482 = local3.anInt104;
		this.anInt469 = local3.anInt96;
		this.anInt479 = local3.anInt99;
		this.anInt476 = local3.anInt103;
		this.anInt471 = local3.anInt100;
	}

	@OriginalMember(owner = "client!bf", name = "OA", descriptor = "(IILclient!i;)Lclient!i;")
	@Override
	public Class2_Sub1_Sub5 OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub5 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!i;IIIIZ)Z")
	@Override
	public boolean method2323(@OriginalArg(0) Class2_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)Z")
	private boolean method459(@OriginalArg(0) int arg0) {
		if ((this.anInt470 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!bf", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass237ArrayArray1 == null) {
			this.aClass237ArrayArray1 = new Class237[super.anInt2819][super.anInt2816];
			this.aClass131ArrayArray1 = new Class131[super.anInt2819][super.anInt2816];
		} else if (this.aClass143ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static268.anIntArray402[Static36.method578(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static268.anIntArray402[Static36.method578(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == super.anInt2818 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt2818 && arg4[local116] == super.anInt2818) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt2818) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt2818 && arg2[local244] != arg2[0] - super.anInt2818) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt2818 && arg4[local244] != arg4[0] - super.anInt2818) {
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
			@Pc(334) Class237 local334 = new Class237();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt6747 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte82 = (byte) (local334.aByte82 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray14[arg0][arg1] == this.anIntArrayArray14[arg0 + 1][arg1] && this.anIntArrayArray14[arg0][arg1] == this.anIntArrayArray14[arg0 + 1][arg1 + 1] && this.anIntArrayArray14[arg0][arg1] == this.anIntArrayArray14[arg0][arg1 + 1]) {
				local334.aByte82 = (byte) (local334.aByte82 | 0x1);
			}
			if (local342 == -1 || (local334.aByte82 & 0x2) != 0 || this.aClass75_Sub1_2.anInterface7_8.method1170(local342).aBoolean485) {
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
				local334.anInt6748 = Static224.method3092(local527, Static467.method458(arg6[local104] >> 8, this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray3[arg0][arg1]), arg10);
				if (local334.anInt6747 != 0) {
					local334.anInt6748 |= this.aByteArrayArray3[arg0][arg1] + 255 - this.aByteArrayArray4[arg0][arg1] << 25;
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
				local334.anInt6751 = Static224.method3092(local527, Static467.method458(arg6[local106] >> 8, this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray3[arg0 + 1][arg1]), arg10);
				if (local334.anInt6747 != 0) {
					local334.anInt6751 |= this.aByteArrayArray3[arg0 + 1][arg1] + 255 - this.aByteArrayArray4[arg0 + 1][arg1] << 25;
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
				local334.anInt6749 = Static224.method3092(local527, Static467.method458(arg6[local108] >> 8, this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray3[arg0 + 1][arg1 + 1]), arg10);
				if (local334.anInt6747 != 0) {
					local334.anInt6749 |= this.aByteArrayArray3[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray4[arg0 + 1][arg1 + 1] << 25;
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
				local334.anInt6750 = Static224.method3092(local527, Static467.method458(arg6[local110] >> 8, this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray3[arg0][arg1 + 1]), arg10);
				if (local334.anInt6747 != 0) {
					local334.anInt6750 |= this.aByteArrayArray3[arg0][arg1 + 1] + 255 - this.aByteArrayArray4[arg0][arg1 + 1] << 25;
				}
				local334.aShort85 = -1;
			} else {
				local334.anInt6748 = this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray3[arg0][arg1];
				local334.anInt6751 = this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray3[arg0 + 1][arg1];
				local334.anInt6749 = this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray3[arg0 + 1][arg1 + 1];
				local334.anInt6750 = this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray3[arg0][arg1 + 1];
				local334.aShort85 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort84 = (short) arg5[local108];
				local334.aShort83 = (short) arg5[local110];
				local334.aShort82 = (short) arg5[local106];
				local334.aShort81 = (short) arg5[local104];
			}
			this.aClass237ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class131 local888 = new Class131();
		local888.aShort41 = (short) arg2.length;
		local888.aShort40 = (short) (arg2.length / 3);
		local888.aShortArray47 = new short[local888.aShort41];
		local888.aShortArray48 = new short[local888.aShort41];
		local888.aShortArray51 = new short[local888.aShort41];
		local888.anIntArray277 = new int[local888.aShort41];
		if (arg5 != null) {
			local888.aShortArray50 = new short[local888.aShort41];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort41; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray3[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt2818) {
				local958 = this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray3[arg0][arg1 + 1];
			} else if (local342 == super.anInt2818 && local527 == super.anInt2818) {
				local958 = this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray3[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt2818 && local527 == 0) {
				local958 = this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray3[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray3[arg0][arg1]) * (super.anInt2818 - local342) + (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray3[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray3[arg0][arg1 + 1]) * (super.anInt2818 - local342) + (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray3[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt2818 - local527) + local1126 * local527 >> super.anInt2817 * 2;
			}
			local1079 = (arg0 << super.anInt2817) + local342;
			local1126 = (arg1 << super.anInt2817) + local527;
			local888.aShortArray47[local244] = (short) local342;
			local888.aShortArray51[local244] = (short) local527;
			local888.aShortArray48[local244] = (short) (this.ca(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass75_Sub1_2.anInterface7_8.method1170(arg8[local244]).aBoolean485) {
				local888.anIntArray277[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray50[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray277[local244] = Static224.method3092(local1226, Static467.method458(arg6[local244] >> 8, local958), arg10);
				if (arg7 != null) {
					local888.anIntArray277[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray277[local244] = 0;
			} else {
				local888.anIntArray277[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort40; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass75_Sub1_2.anInterface7_8.method1170(arg8[local527 * 3]).aBoolean485) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray278 = new int[local888.aShort40];
		}
		if (local1296) {
			local888.aShortArray49 = new short[local888.aShort40];
			local888.aShortArray52 = new short[local888.aShort40];
		}
		for (local958 = 0; local958 < local888.aShort40; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray278[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass75_Sub1_2.anInterface7_8.method1170(local1384).aBoolean485) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass75_Sub1_2.anInterface7_8.method1170(local1384).aBoolean485) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass75_Sub1_2.anInterface7_8.method1170(local1384).aBoolean485) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray49[local958] = (short) local1384;
					local888.aShortArray52[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass75_Sub1_2.anInterface7_8.method1170(local1384).aBoolean485) {
							local888.anIntArray277[local1079] = Static268.anIntArray402[Static36.method578(this.aClass75_Sub1_2.anInterface7_8.method1170(local1384).aShort101 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass75_Sub1_2.anInterface7_8.method1170(local1384).aBoolean485) {
							local888.anIntArray277[local1126] = Static268.anIntArray402[Static36.method578(this.aClass75_Sub1_2.anInterface7_8.method1170(local1384).aShort101 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass75_Sub1_2.anInterface7_8.method1170(local1384).aBoolean485) {
							local888.anIntArray277[local1226] = Static268.anIntArray402[Static36.method578(this.aClass75_Sub1_2.anInterface7_8.method1170(local1384).aShort101 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray49[local958] = -1;
				}
			}
		}
		this.aClass131ArrayArray1[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!as;[I)V")
	@Override
	public void method2321(@OriginalArg(0) Class2_Sub4 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IILclient!uq;[I[I[I)V")
	private void method460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class143 local6 = this.aClass143ArrayArray1[arg0][arg1];
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
			@Pc(1022) Class108 local1022 = this.aClass108ArrayArray1[arg0][arg1];
			if (local1022 != null) {
				@Pc(1046) short local1046;
				if (this.anInt478 == -1) {
					for (local362 = 0; local362 < local1022.aShort31; local362++) {
						local24 = local1022.aShortArray40[local362] + (arg0 << super.anInt2817);
						local1046 = local1022.aShortArray38[local362];
						local34 = local1022.aShortArray34[local362] + (arg1 << super.anInt2817);
						local306 = this.anInt471 + (this.anInt469 * local24 + this.anInt479 * local1046 + this.anInt476 * local34 >> 15);
						if (local306 <= this.aClass75_Sub1_2.anInt1750) {
							return;
						}
						local194 = this.anInt475 + (this.anInt480 * local24 + this.anInt481 * local1046 + this.anInt472 * local34 >> 15);
						local250 = this.anInt482 + (this.anInt473 * local24 + this.anInt477 * local1046 + this.anInt474 * local34 >> 15);
						arg3[local362] = arg2.anInt7164 + local194 * this.aClass75_Sub1_2.anInt1745 / local306;
						arg4[local362] = arg2.anInt7165 + local250 * this.aClass75_Sub1_2.anInt1746 / local306;
					}
				} else {
					for (local362 = 0; local362 < local1022.aShort31; local362++) {
						local24 = local1022.aShortArray40[local362] + (arg0 << super.anInt2817);
						local1046 = local1022.aShortArray38[local362];
						local34 = local1022.aShortArray34[local362] + (arg1 << super.anInt2817);
						local194 = this.anInt475 + (this.anInt480 * local24 + this.anInt481 * local1046 + this.anInt472 * local34 >> 15);
						local250 = this.anInt482 + (this.anInt473 * local24 + this.anInt477 * local1046 + this.anInt474 * local34 >> 15);
						arg3[local362] = arg2.anInt7164 + local194 * this.aClass75_Sub1_2.anInt1745 / this.anInt478;
						arg4[local362] = arg2.anInt7165 + local250 * this.aClass75_Sub1_2.anInt1746 / this.anInt478;
					}
				}
				if (local1022.aShortArray42 != null) {
					local362 = this.anIntArrayArray14[arg0][arg1];
					local222 = this.anIntArrayArray14[arg0 + 1][arg1];
					local278 = this.anIntArrayArray14[arg0][arg1 + 1];
					local334 = arg0 * super.anInt2818;
					local390 = local334 + super.anInt2818;
					local183 = arg1 * super.anInt2818;
					local239 = local183 + super.anInt2818;
					local295 = this.anInt475 + (this.anInt480 * local334 + this.anInt481 * local362 + this.anInt472 * local183 >> 15);
					local351 = this.anInt482 + (this.anInt473 * local334 + this.anInt477 * local362 + this.anInt474 * local183 >> 15);
					local211 = this.anInt471 + (this.anInt469 * local334 + this.anInt479 * local362 + this.anInt476 * local183 >> 15);
					local267 = this.anInt475 + (this.anInt480 * local390 + this.anInt481 * local222 + this.anInt472 * local183 >> 15);
					local323 = this.anInt482 + (this.anInt473 * local390 + this.anInt477 * local222 + this.anInt474 * local183 >> 15);
					local379 = this.anInt471 + (this.anInt469 * local390 + this.anInt479 * local222 + this.anInt476 * local183 >> 15);
					local72 = this.anInt475 + (this.anInt480 * local334 + this.anInt481 * local278 + this.anInt472 * local239 >> 15);
					local95 = this.anInt482 + (this.anInt473 * local334 + this.anInt477 * local278 + this.anInt474 * local239 >> 15);
					local118 = this.anInt471 + (this.anInt469 * local334 + this.anInt479 * local278 + this.anInt476 * local239 >> 15);
					for (local141 = 0; local141 < local1022.aShort32; local141++) {
						@Pc(1491) short local1491 = local1022.aShortArray41[local141];
						@Pc(1496) short local1496 = local1022.aShortArray36[local141];
						@Pc(1501) short local1501 = local1022.aShortArray39[local141];
						local427 = arg3[local1491];
						@Pc(1509) int local1509 = arg3[local1496];
						@Pc(1513) int local1513 = arg3[local1501];
						@Pc(1517) int local1517 = arg4[local1491];
						@Pc(1521) int local1521 = arg4[local1496];
						@Pc(1525) int local1525 = arg4[local1501];
						if ((local427 - local1509) * (local1525 - local1521) - (local1517 - local1521) * (local1513 - local1509) > 0) {
							arg2.aBoolean479 = local427 < 0 || local1509 < 0 || local1513 < 0 || local427 > arg2.anInt7163 || local1509 > arg2.anInt7163 || local1513 > arg2.anInt7163;
							@Pc(1569) short local1569 = local1022.aShortArray42[local141];
							if (local1569 == -1) {
								@Pc(1624) int local1624 = local1022.anIntArray235[local141];
								if (local1624 != -1) {
									arg2.method5733(local1517, local1521, local1525, local427, local1509, local1513, Static316.method4495(local1022.aShortArray37[local1491], local1624), Static316.method4495(local1022.aShortArray37[local1496], local1624), Static316.method4495(local1022.aShortArray37[local1501], local1624));
								}
							} else {
								if (this.method459(this.aClass75_Sub1_2.anInterface7_8.method1170(local1569).aByte96)) {
									arg2.anInt7161 = 100;
								}
								arg2.method5736(local1517, local1521, local1525, local427, local1509, local1513, local1022.aShortArray37[local1491], local1022.aShortArray37[local1496], local1022.aShortArray37[local1501], local295, local267, local72, local351, local323, local95, local211, local379, local118, local1569);
								arg2.anInt7161 = 0;
							}
						}
					}
					return;
				}
				for (local362 = 0; local362 < local1022.aShort32; local362++) {
					@Pc(1670) short local1670 = local1022.aShortArray41[local362];
					@Pc(1675) short local1675 = local1022.aShortArray36[local362];
					@Pc(1680) short local1680 = local1022.aShortArray39[local362];
					local390 = arg3[local1670];
					local183 = arg3[local1675];
					local239 = arg3[local1680];
					local295 = arg4[local1670];
					local351 = arg4[local1675];
					local211 = arg4[local1680];
					if ((local390 - local183) * (local211 - local351) - (local295 - local351) * (local239 - local183) > 0) {
						local267 = local1022.anIntArray235[local362];
						if (local267 != -1) {
							arg2.aBoolean479 = local390 < 0 || local183 < 0 || local239 < 0 || local390 > arg2.anInt7163 || local183 > arg2.anInt7163 || local239 > arg2.anInt7163;
							arg2.method5733(local295, local351, local211, local390, local183, local239, Static316.method4495(local1022.aShortArray37[local1670], local267), Static316.method4495(local1022.aShortArray37[local1675], local267), Static316.method4495(local1022.aShortArray37[local1680], local267));
						}
					}
				}
			}
		} else if ((local6.aByte59 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt2818;
			local24 = local19 + super.anInt2818;
			@Pc(29) int local29 = arg1 * super.anInt2818;
			local34 = local29 + super.anInt2818;
			@Pc(46) int local46;
			@Pc(55) int local55;
			@Pc(166) int local166;
			if ((local6.aByte59 & 0x1) == 0) {
				local46 = this.anIntArrayArray14[arg0][arg1];
				local55 = this.anIntArrayArray14[arg0 + 1][arg1];
				local166 = this.anIntArrayArray14[arg0 + 1][arg1 + 1];
				local427 = this.anIntArrayArray14[arg0][arg1 + 1];
				if (this.anInt478 == -1) {
					local72 = this.anInt471 + (this.anInt469 * local19 + this.anInt479 * local46 + this.anInt476 * local29 >> 15);
					if (local72 <= this.aClass75_Sub1_2.anInt1750) {
						return;
					}
					local95 = this.anInt471 + (this.anInt469 * local24 + this.anInt479 * local55 + this.anInt476 * local29 >> 15);
					if (local95 <= this.aClass75_Sub1_2.anInt1750) {
						return;
					}
					local118 = this.anInt471 + (this.anInt469 * local24 + this.anInt479 * local166 + this.anInt476 * local34 >> 15);
					if (local118 <= this.aClass75_Sub1_2.anInt1750) {
						return;
					}
					local141 = this.anInt471 + (this.anInt469 * local19 + this.anInt479 * local427 + this.anInt476 * local34 >> 15);
					if (local141 <= this.aClass75_Sub1_2.anInt1750) {
						return;
					}
				} else {
					local141 = this.anInt478;
					local118 = this.anInt478;
					local95 = this.anInt478;
					local72 = this.anInt478;
				}
				local183 = this.anInt475 + (this.anInt480 * local19 + this.anInt481 * local46 + this.anInt472 * local29 >> 15);
				local194 = arg2.anInt7164 + local183 * this.aClass75_Sub1_2.anInt1745 / local72;
				local211 = this.anInt482 + (this.anInt473 * local19 + this.anInt477 * local46 + this.anInt474 * local29 >> 15);
				local222 = arg2.anInt7165 + local211 * this.aClass75_Sub1_2.anInt1746 / local72;
				local239 = this.anInt475 + (this.anInt480 * local24 + this.anInt481 * local55 + this.anInt472 * local29 >> 15);
				local250 = arg2.anInt7164 + local239 * this.aClass75_Sub1_2.anInt1745 / local95;
				local267 = this.anInt482 + (this.anInt473 * local24 + this.anInt477 * local55 + this.anInt474 * local29 >> 15);
				local278 = arg2.anInt7165 + local267 * this.aClass75_Sub1_2.anInt1746 / local95;
				local295 = this.anInt475 + (this.anInt480 * local24 + this.anInt481 * local166 + this.anInt472 * local34 >> 15);
				local306 = arg2.anInt7164 + local295 * this.aClass75_Sub1_2.anInt1745 / local118;
				local323 = this.anInt482 + (this.anInt473 * local24 + this.anInt477 * local166 + this.anInt474 * local34 >> 15);
				local334 = arg2.anInt7165 + local323 * this.aClass75_Sub1_2.anInt1746 / local118;
				local351 = this.anInt475 + (this.anInt480 * local19 + this.anInt481 * local427 + this.anInt472 * local34 >> 15);
				local362 = arg2.anInt7164 + local351 * this.aClass75_Sub1_2.anInt1745 / local141;
				local379 = this.anInt482 + (this.anInt473 * local19 + this.anInt477 * local427 + this.anInt474 * local34 >> 15);
				local390 = arg2.anInt7165 + local379 * this.aClass75_Sub1_2.anInt1746 / local141;
			} else {
				local46 = this.anIntArrayArray14[arg0][arg1];
				if (this.anInt478 == -1) {
					local55 = this.anInt479 * local46;
					local72 = this.anInt471 + (this.anInt469 * local19 + local55 + this.anInt476 * local29 >> 15);
					if (local72 <= this.aClass75_Sub1_2.anInt1750) {
						return;
					}
					local95 = this.anInt471 + (this.anInt469 * local24 + local55 + this.anInt476 * local29 >> 15);
					if (local95 <= this.aClass75_Sub1_2.anInt1750) {
						return;
					}
					local118 = this.anInt471 + (this.anInt469 * local24 + local55 + this.anInt476 * local34 >> 15);
					if (local118 <= this.aClass75_Sub1_2.anInt1750) {
						return;
					}
					local141 = this.anInt471 + (this.anInt469 * local19 + local55 + this.anInt476 * local34 >> 15);
					if (local141 <= this.aClass75_Sub1_2.anInt1750) {
						return;
					}
				} else {
					local141 = this.anInt478;
					local118 = this.anInt478;
					local95 = this.anInt478;
					local72 = this.anInt478;
				}
				local55 = this.anInt481 * local46;
				local166 = this.anInt477 * local46;
				local183 = this.anInt475 + (this.anInt480 * local19 + local55 + this.anInt472 * local29 >> 15);
				local194 = arg2.anInt7164 + local183 * this.aClass75_Sub1_2.anInt1745 / local72;
				local211 = this.anInt482 + (this.anInt473 * local19 + local166 + this.anInt474 * local29 >> 15);
				local222 = arg2.anInt7165 + local211 * this.aClass75_Sub1_2.anInt1746 / local72;
				local239 = this.anInt475 + (this.anInt480 * local24 + local55 + this.anInt472 * local29 >> 15);
				local250 = arg2.anInt7164 + local239 * this.aClass75_Sub1_2.anInt1745 / local95;
				local267 = this.anInt482 + (this.anInt473 * local24 + local166 + this.anInt474 * local29 >> 15);
				local278 = arg2.anInt7165 + local267 * this.aClass75_Sub1_2.anInt1746 / local95;
				local295 = this.anInt475 + (this.anInt480 * local24 + local55 + this.anInt472 * local34 >> 15);
				local306 = arg2.anInt7164 + local295 * this.aClass75_Sub1_2.anInt1745 / local118;
				local323 = this.anInt482 + (this.anInt473 * local24 + local166 + this.anInt474 * local34 >> 15);
				local334 = arg2.anInt7165 + local323 * this.aClass75_Sub1_2.anInt1746 / local118;
				local351 = this.anInt475 + (this.anInt480 * local19 + local55 + this.anInt472 * local34 >> 15);
				local362 = arg2.anInt7164 + local351 * this.aClass75_Sub1_2.anInt1745 / local141;
				local379 = this.anInt482 + (this.anInt473 * local19 + local166 + this.anInt474 * local34 >> 15);
				local390 = arg2.anInt7165 + local379 * this.aClass75_Sub1_2.anInt1746 / local141;
			}
			if ((local306 - local362) * (local278 - local390) - (local334 - local390) * (local250 - local362) > 0) {
				arg2.aBoolean479 = local306 < 0 || local362 < 0 || local250 < 0 || local306 > arg2.anInt7163 || local362 > arg2.anInt7163 || local250 > arg2.anInt7163;
				if (local6.aShort48 >= 0) {
					if (this.method459(this.aClass75_Sub1_2.anInterface7_8.method1170(local6.aShort48).aByte96)) {
						arg2.anInt7161 = 100;
					}
					arg2.method5736(local334, local390, local278, local306, local362, local250, local6.aShort46 & 0xFFFF, local6.aShort45 & 0xFFFF, local6.aShort49 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort48);
					arg2.anInt7161 = 0;
				} else {
					arg2.method5733(local334, local390, local278, local306, local362, local250, local6.aShort46 & 0xFFFF, local6.aShort45 & 0xFFFF, local6.aShort49 & 0xFFFF);
				}
			}
			if ((local194 - local250) * (local390 - local278) - (local222 - local278) * (local362 - local250) > 0) {
				arg2.aBoolean479 = local194 < 0 || local250 < 0 || local362 < 0 || local194 > arg2.anInt7163 || local250 > arg2.anInt7163 || local362 > arg2.anInt7163;
				if (local6.aShort48 >= 0) {
					if (this.method459(this.aClass75_Sub1_2.anInterface7_8.method1170(local6.aShort48).aByte96)) {
						arg2.anInt7161 = 100;
					}
					arg2.method5736(local222, local278, local390, local194, local250, local362, local6.aShort47 & 0xFFFF, local6.aShort49 & 0xFFFF, local6.aShort45 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort48);
					arg2.anInt7161 = 0;
					return;
				}
				arg2.method5733(local222, local278, local390, local194, local250, local362, local6.aShort47 & 0xFFFF, local6.aShort49 & 0xFFFF, local6.aShort45 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "H", descriptor = "(Lclient!i;IIIIZ)V")
	@Override
	public void H(@OriginalArg(0) Class2_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}
}
