import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public class Class322 {

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!sr", name = "A", descriptor = "[I")
	private final int[] anIntArray670 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!sr", name = "w", descriptor = "[I")
	private final int[] anIntArray669 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!sr", name = "h", descriptor = "Z")
	public final boolean aBoolean715;

	@OriginalMember(owner = "client!sr", name = "r", descriptor = "Lclient!cb;")
	private final Class49 aClass49_5;

	@OriginalMember(owner = "client!sr", name = "s", descriptor = "Lclient!qe;")
	private final Class275 aClass275_5;

	@OriginalMember(owner = "client!sr", name = "p", descriptor = "I")
	protected final int anInt10420;

	@OriginalMember(owner = "client!sr", name = "C", descriptor = "I")
	public final int anInt10425;

	@OriginalMember(owner = "client!sr", name = "m", descriptor = "I")
	protected final int anInt10417;

	@OriginalMember(owner = "client!sr", name = "u", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!sr", name = "l", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!sr", name = "B", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!sr", name = "y", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!sr", name = "v", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(IIIZLclient!cb;Lclient!qe;)V")
	protected Class322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class49 arg4, @OriginalArg(5) Class275 arg5) {
		this.aBoolean715 = arg3;
		this.aClass49_5 = arg4;
		this.aClass275_5 = arg5;
		this.anInt10420 = arg1;
		this.anInt10425 = arg0;
		this.anInt10417 = arg2;
		this.anIntArrayArrayArray19 = new int[this.anInt10425][this.anInt10420 + 1][this.anInt10417 + 1];
		this.aByteArrayArrayArray13 = new byte[this.anInt10425][this.anInt10420 + 1][this.anInt10417 + 1];
		this.aByteArrayArrayArray14 = new byte[this.anInt10425][this.anInt10420][this.anInt10417];
		this.aByteArrayArrayArray17 = new byte[this.anInt10425][this.anInt10420][this.anInt10417];
		this.aByteArrayArrayArray16 = new byte[this.anInt10425][this.anInt10420][this.anInt10417];
		this.aByteArrayArrayArray15 = new byte[this.anInt10425][this.anInt10420][this.anInt10417];
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(II[[BI[[BILclient!vd;Lclient!hk;[ZI[[BIILclient!ha;)V")
	private void method8692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(6) Class354 arg5, @OriginalArg(7) Class135 arg6, @OriginalArg(8) boolean[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class20 arg12) {
		@Pc(18) boolean[] local18 = arg5 != null && arg5.aBoolean716 ? Static172.aBooleanArrayArray4[arg11] : Static576.aBooleanArrayArray8[arg11];
		@Pc(37) int local37;
		@Pc(47) Class354 local47;
		@Pc(65) byte local65;
		@Pc(81) int local81;
		@Pc(86) int local86;
		if (arg3 > 0) {
			if (arg0 > 0) {
				local37 = arg9[arg0 - 1][arg3 - 1] & 0xFF;
				if (local37 > 0) {
					local47 = this.aClass49_5.method1919(local37 - 1);
					if (local47.anInt10459 != -1 && local47.aBoolean716) {
						local65 = arg2[arg0 - 1][arg3 - 1];
						local81 = arg4[arg0 - 1][arg3 - 1] * 2 + 4 & 0x7;
						local86 = Static198.method3986(arg12, local47);
						if (Static414.aBooleanArrayArray7[local65][local81]) {
							Static245.anIntArray279[0] = local47.anInt10459;
							Static155.anIntArray207[0] = local86;
							Static5.anIntArray7[0] = local47.anInt10468;
							Static173.anIntArray213[0] = local47.anInt10464;
							Static640.anIntArray714[0] = local47.anInt10460;
							Static445.anIntArray541[0] = 256;
						}
					}
				}
			}
			if (arg10 - 1 > arg0) {
				local37 = arg9[arg0 + 1][arg3 - 1] & 0xFF;
				if (local37 > 0) {
					local47 = this.aClass49_5.method1919(local37 - 1);
					if (local47.anInt10459 != -1 && local47.aBoolean716) {
						local65 = arg2[arg0 + 1][arg3 - 1];
						local81 = arg4[arg0 + 1][arg3 - 1] * 2 + 6 & 0x7;
						local86 = Static198.method3986(arg12, local47);
						if (Static414.aBooleanArrayArray7[local65][local81]) {
							Static245.anIntArray279[2] = local47.anInt10459;
							Static155.anIntArray207[2] = local86;
							Static5.anIntArray7[2] = local47.anInt10468;
							Static173.anIntArray213[2] = local47.anInt10464;
							Static640.anIntArray714[2] = local47.anInt10460;
							Static445.anIntArray541[2] = 512;
						}
					}
				}
			}
		}
		if (arg3 < arg1 - 1) {
			if (arg0 > 0) {
				local37 = arg9[arg0 - 1][arg3 + 1] & 0xFF;
				if (local37 > 0) {
					local47 = this.aClass49_5.method1919(local37 - 1);
					if (local47.anInt10459 != -1 && local47.aBoolean716) {
						local65 = arg2[arg0 - 1][arg3 + 1];
						local81 = arg4[arg0 - 1][arg3 + 1] * 2 + 2 & 0x7;
						local86 = Static198.method3986(arg12, local47);
						if (Static414.aBooleanArrayArray7[local65][local81]) {
							Static245.anIntArray279[6] = local47.anInt10459;
							Static155.anIntArray207[6] = local86;
							Static5.anIntArray7[6] = local47.anInt10468;
							Static173.anIntArray213[6] = local47.anInt10464;
							Static640.anIntArray714[6] = local47.anInt10460;
							Static445.anIntArray541[6] = 64;
						}
					}
				}
			}
			if (arg0 < arg10 - 1) {
				local37 = arg9[arg0 + 1][arg3 + 1] & 0xFF;
				if (local37 > 0) {
					local47 = this.aClass49_5.method1919(local37 - 1);
					if (local47.anInt10459 != -1 && local47.aBoolean716) {
						local65 = arg2[arg0 + 1][arg3 + 1];
						local81 = --(arg4[arg0 + 1][arg3 + 1] * 2) & 0x7;
						local86 = Static198.method3986(arg12, local47);
						if (Static414.aBooleanArrayArray7[local65][local81]) {
							Static245.anIntArray279[4] = local47.anInt10459;
							Static155.anIntArray207[4] = local86;
							Static5.anIntArray7[4] = local47.anInt10468;
							Static173.anIntArray213[4] = local47.anInt10464;
							Static640.anIntArray714[4] = local47.anInt10460;
							Static445.anIntArray541[4] = 128;
						}
					}
				}
			}
		}
		@Pc(492) int local492;
		@Pc(497) int local497;
		@Pc(499) int local499;
		@Pc(481) byte local481;
		if (arg3 > 0) {
			local37 = arg9[arg0][arg3 - 1] & 0xFF;
			if (local37 > 0) {
				local47 = this.aClass49_5.method1919(local37 - 1);
				if (local47.anInt10459 != -1) {
					local65 = arg2[arg0][arg3 - 1];
					local481 = arg4[arg0][arg3 - 1];
					if (local47.aBoolean716) {
						local86 = 2;
						local492 = local481 * 2 + 4;
						local497 = Static198.method3986(arg12, local47);
						for (local499 = 0; local499 < 3; local499++) {
							local86 &= 0x7;
							local492 &= 0x7;
							if (Static414.aBooleanArrayArray7[local65][local492] && local47.anInt10460 >= Static640.anIntArray714[local86]) {
								Static245.anIntArray279[local86] = local47.anInt10459;
								Static155.anIntArray207[local86] = local497;
								Static5.anIntArray7[local86] = local47.anInt10468;
								Static173.anIntArray213[local86] = local47.anInt10464;
								if (local47.anInt10460 == Static640.anIntArray714[local86]) {
									Static445.anIntArray541[local86] |= 0x20;
								} else {
									Static445.anIntArray541[local86] = 32;
								}
								Static640.anIntArray714[local86] = local47.anInt10460;
							}
							local492++;
							local86--;
						}
						if (!local18[arg8 & 0x3]) {
							arg7[0] = Static172.aBooleanArrayArray4[local65][local481 + 2 & 0x3];
						}
					} else if (!local18[arg8 & 0x3]) {
						arg7[0] = Static576.aBooleanArrayArray8[local65][local481 + 2 & 0x3];
					}
				}
			}
		}
		if (arg1 - 1 > arg3) {
			local37 = arg9[arg0][arg3 + 1] & 0xFF;
			if (local37 > 0) {
				local47 = this.aClass49_5.method1919(local37 - 1);
				if (local47.anInt10459 != -1) {
					local65 = arg2[arg0][arg3 + 1];
					local481 = arg4[arg0][arg3 + 1];
					if (local47.aBoolean716) {
						local86 = 4;
						local492 = local481 * 2 + 2;
						local497 = Static198.method3986(arg12, local47);
						for (local499 = 0; local499 < 3; local499++) {
							local86 &= 0x7;
							local492 &= 0x7;
							if (Static414.aBooleanArrayArray7[local65][local492] && Static640.anIntArray714[local86] <= local47.anInt10460) {
								Static245.anIntArray279[local86] = local47.anInt10459;
								Static155.anIntArray207[local86] = local497;
								Static5.anIntArray7[local86] = local47.anInt10468;
								Static173.anIntArray213[local86] = local47.anInt10464;
								if (local47.anInt10460 == Static640.anIntArray714[local86]) {
									Static445.anIntArray541[local86] |= 0x10;
								} else {
									Static445.anIntArray541[local86] = 16;
								}
								Static640.anIntArray714[local86] = local47.anInt10460;
							}
							local492--;
							local86++;
						}
						if (!local18[arg8 + 2 & 0x3]) {
							arg7[2] = Static172.aBooleanArrayArray4[local65][--local481 & 0x3];
						}
					} else if (!local18[arg8 + 2 & 0x3]) {
						arg7[2] = Static576.aBooleanArrayArray8[local65][local481 & 0x3];
					}
				}
			}
		}
		if (arg0 > 0) {
			local37 = arg9[arg0 - 1][arg3] & 0xFF;
			if (local37 > 0) {
				local47 = this.aClass49_5.method1919(local37 - 1);
				if (local47.anInt10459 != -1) {
					local65 = arg2[arg0 - 1][arg3];
					local481 = arg4[arg0 - 1][arg3];
					if (local47.aBoolean716) {
						local86 = 6;
						local492 = local481 * 2 + 4;
						local497 = Static198.method3986(arg12, local47);
						for (local499 = 0; local499 < 3; local499++) {
							local492 &= 0x7;
							local86 &= 0x7;
							if (Static414.aBooleanArrayArray7[local65][local492] && Static640.anIntArray714[local86] <= local47.anInt10460) {
								Static245.anIntArray279[local86] = local47.anInt10459;
								Static155.anIntArray207[local86] = local497;
								Static5.anIntArray7[local86] = local47.anInt10468;
								Static173.anIntArray213[local86] = local47.anInt10464;
								if (local47.anInt10460 == Static640.anIntArray714[local86]) {
									Static445.anIntArray541[local86] |= 0x8;
								} else {
									Static445.anIntArray541[local86] = 8;
								}
								Static640.anIntArray714[local86] = local47.anInt10460;
							}
							local86++;
							local492--;
						}
						if (!local18[arg8 + 3 & 0x3]) {
							arg7[3] = Static172.aBooleanArrayArray4[local65][local481 + 1 & 0x3];
						}
					} else if (!local18[arg8 + 3 & 0x3]) {
						arg7[3] = Static576.aBooleanArrayArray8[local65][local481 + 1 & 0x3];
					}
				}
			}
		}
		if (arg0 < arg10 - 1) {
			local37 = arg9[arg0 + 1][arg3] & 0xFF;
			if (local37 > 0) {
				local47 = this.aClass49_5.method1919(local37 - 1);
				if (local47.anInt10459 != -1) {
					local65 = arg2[arg0 + 1][arg3];
					local481 = arg4[arg0 + 1][arg3];
					if (local47.aBoolean716) {
						local86 = 4;
						local492 = local481 * 2 + 6;
						local497 = Static198.method3986(arg12, local47);
						for (local499 = 0; local499 < 3; local499++) {
							local86 &= 0x7;
							local492 &= 0x7;
							if (Static414.aBooleanArrayArray7[local65][local492] && local47.anInt10460 >= Static640.anIntArray714[local86]) {
								Static245.anIntArray279[local86] = local47.anInt10459;
								Static155.anIntArray207[local86] = local497;
								Static5.anIntArray7[local86] = local47.anInt10468;
								Static173.anIntArray213[local86] = local47.anInt10464;
								if (local47.anInt10460 == Static640.anIntArray714[local86]) {
									Static445.anIntArray541[local86] |= 0x4;
								} else {
									Static445.anIntArray541[local86] = 4;
								}
								Static640.anIntArray714[local86] = local47.anInt10460;
							}
							local492++;
							local86--;
						}
						if (!local18[arg8 + 1 & 0x3]) {
							arg7[1] = Static172.aBooleanArrayArray4[local65][local481 + 3 & 0x3];
						}
					} else if (!local18[arg8 + 1 & 0x3]) {
						arg7[1] = Static576.aBooleanArrayArray8[local65][local481 + 3 & 0x3];
					}
				}
			}
		}
		if (arg5 == null) {
			return;
		}
		local37 = Static198.method3986(arg12, arg5);
		if (!arg5.aBoolean716) {
			return;
		}
		for (@Pc(1198) int local1198 = 0; local1198 < 8; local1198++) {
			@Pc(1209) int local1209 = local1198 - arg8 * 2 & 0x7;
			if (Static414.aBooleanArrayArray7[arg11][local1198] && arg5.anInt10460 >= Static640.anIntArray714[local1209]) {
				Static245.anIntArray279[local1209] = arg5.anInt10459;
				Static155.anIntArray207[local1209] = local37;
				Static5.anIntArray7[local1209] = arg5.anInt10468;
				Static173.anIntArray213[local1209] = arg5.anInt10464;
				if (Static640.anIntArray714[local1209] == arg5.anInt10460) {
					Static445.anIntArray541[local1209] |= 0x2;
				} else {
					Static445.anIntArray541[local1209] = 2;
				}
				Static640.anIntArray714[local1209] = arg5.anInt10460;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!s;Lclient!s;ILclient!s;[[ILclient!ha;I)V")
	private void method8693(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(3) Class65 arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) Class20 arg4, @OriginalArg(6) int arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray16[arg5];
		@Pc(21) byte[][] local21 = this.aByteArrayArrayArray17[arg5];
		@Pc(26) byte[][] local26 = this.aByteArrayArrayArray14[arg5];
		@Pc(31) byte[][] local31 = this.aByteArrayArrayArray15[arg5];
		for (@Pc(33) int local33 = 0; local33 < this.anInt10420; local33++) {
			@Pc(47) int local47 = local33 >= this.anInt10420 - 1 ? local33 : local33 + 1;
			for (@Pc(49) int local49 = 0; local49 < this.anInt10417; local49++) {
				@Pc(67) int local67 = this.anInt10417 - 1 > local49 ? local49 + 1 : local49;
				if (Static546.anInt9790 == -1 || Static267.method4913(local49, local33, Static546.anInt9790, arg5)) {
					@Pc(82) boolean local82 = false;
					@Pc(84) boolean local84 = false;
					@Pc(87) boolean[] local87 = new boolean[4];
					@Pc(93) int local93 = local10[local33][local49];
					@Pc(99) int local99 = local21[local33][local49];
					@Pc(107) int local107 = local31[local33][local49] & 0xFF;
					@Pc(115) int local115 = local26[local33][local49] & 0xFF;
					@Pc(123) int local123 = local26[local33][local67] & 0xFF;
					@Pc(131) int local131 = local26[local47][local67] & 0xFF;
					@Pc(139) int local139 = local26[local47][local49] & 0xFF;
					if (local107 != 0 || local115 != 0) {
						@Pc(161) Class354 local161 = local107 == 0 ? null : this.aClass49_5.method1919(local107 - 1);
						@Pc(176) Class135 local176 = local115 == 0 ? null : this.aClass275_5.method7104(local115 - 1);
						if (local93 == 0 && local161 == null) {
							local93 = 12;
						}
						@Pc(184) Class354 local184 = local161;
						if (local161 != null) {
							if (local161.anInt10459 == -1 && local161.anInt10463 == -1) {
								local184 = local161;
								local161 = null;
							} else if (local176 != null && local93 != 0) {
								local84 = local161.aBoolean716;
							}
						}
						@Pc(292) int local292;
						@Pc(322) int local322;
						@Pc(372) int local372;
						@Pc(385) int local385;
						if ((local93 == 0 || local93 == 12) && local33 > 0 && local49 > 0 && local33 < this.anInt10420 && local49 < this.anInt10417) {
							@Pc(258) int local258 = local26[local47][local67] == local115 ? 1 : -1;
							@Pc(273) int local273 = local26[local47][local49 - 1] == local115 ? 1 : -1;
							local292 = local115 == local26[local33 - 1][local49 - 1] ? 1 : -1;
							if (local26[local33][local49 - 1] == local115) {
								local292++;
								local273++;
							} else {
								local273--;
								local292--;
							}
							local322 = local26[local33 - 1][local67] == local115 ? 1 : -1;
							if (local115 == local26[local47][local49]) {
								local273++;
								local258++;
							} else {
								local273--;
								local258--;
							}
							if (local26[local33][local67] == local115) {
								local258++;
								local322++;
							} else {
								local322--;
								local258--;
							}
							if (local115 == local26[local33 - 1][local49]) {
								local322++;
								local292++;
							} else {
								local322--;
								local292--;
							}
							local372 = local292 - local258;
							if (local372 < 0) {
								local372 = -local372;
							}
							local385 = local273 - local322;
							if (local385 < 0) {
								local385 = -local385;
							}
							if (local372 == local385) {
								local372 = arg1.method7995(local49, local33) - arg1.method7995(local67, local47);
								if (local372 < 0) {
									local372 = -local372;
								}
								local385 = arg1.method7995(local49, local47) - arg1.method7995(local67, local33);
								if (local385 < 0) {
									local385 = -local385;
								}
							}
							local99 = local372 >= local385 ? 0 : 1;
						}
						for (local292 = 0; local292 < 13; local292++) {
							Static640.anIntArray714[local292] = -1;
							Static445.anIntArray541[local292] = 1;
						}
						@Pc(475) boolean[] local475 = local161 != null && local161.aBoolean716 ? Static172.aBooleanArrayArray4[local93] : Static576.aBooleanArrayArray8[local93];
						this.method8692(local33, this.anInt10417, local10, local49, local21, local161, local176, local87, local99, local31, this.anInt10420, local93, arg4);
						@Pc(508) boolean local508 = local161 != null && local161.anInt10463 != local161.anInt10459;
						if (!local508) {
							for (local322 = 0; local322 < 8; local322++) {
								if (Static640.anIntArray714[local322] >= 0 && Static155.anIntArray207[local322] != Static245.anIntArray279[local322]) {
									local508 = true;
									break;
								}
							}
						}
						if (!local475[local99 + 1 & 0x3]) {
							local87[1] = Static166.method3584(local87[1], (Static445.anIntArray541[2] & Static445.anIntArray541[4]) == 0);
						}
						if (!local475[local99 + 3 & 0x3]) {
							local87[3] = Static166.method3584(local87[3], (Static445.anIntArray541[0] & Static445.anIntArray541[6]) == 0);
						}
						if (!local475[local99 & 0x3]) {
							local87[0] = Static166.method3584(local87[0], (Static445.anIntArray541[0] & Static445.anIntArray541[2]) == 0);
						}
						if (!local475[local99 + 2 & 0x3]) {
							local87[2] = Static166.method3584(local87[2], (Static445.anIntArray541[4] & Static445.anIntArray541[6]) == 0);
						}
						if (!local84 && (local93 == 0 || local93 == 12)) {
							if (local87[0] && !local87[1] && !local87[2] && local87[3]) {
								local87[0] = local87[3] = false;
								local99 = 0;
								local93 = local93 == 0 ? 13 : 14;
							} else if (local87[0] && local87[1] && !local87[2] && !local87[3]) {
								local93 = local93 == 0 ? 13 : 14;
								local87[0] = local87[1] = false;
								local99 = 3;
							} else if (!local87[0] && local87[1] && local87[2] && !local87[3]) {
								local99 = 2;
								local93 = local93 == 0 ? 13 : 14;
								local87[1] = local87[2] = false;
							} else if (!local87[0] && !local87[1] && local87[2] && local87[3]) {
								local93 = local93 == 0 ? 13 : 14;
								local87[2] = local87[3] = false;
								local99 = 1;
							}
						}
						@Pc(819) boolean local819 = !local84 && !local87[0] && !local87[2] && !local87[1] && !local87[3];
						@Pc(821) int[] local821 = null;
						@Pc(837) int[] local837;
						@Pc(845) int[] local845;
						@Pc(849) int[] local849;
						if (local819) {
							local837 = Static195.anIntArrayArray18[local93];
							local845 = Static29.anIntArrayArray6[local93];
							local372 = local176 == null ? 0 : Static242.anIntArray275[local93];
							local849 = Static22.anIntArrayArray2[local93];
							local385 = local161 == null ? 0 : Static459.anIntArray555[local93];
						} else if (local84) {
							local385 = local161 == null ? 0 : Static248.anIntArray283[local93];
							local837 = Static341.anIntArrayArray33[local93];
							local821 = Static349.anIntArrayArray35[local93];
							local845 = Static421.anIntArrayArray45[local93];
							local849 = Static245.anIntArrayArray25[local93];
							local372 = local176 == null ? 0 : Static601.anIntArray681[local93];
						} else {
							local372 = local176 == null ? 0 : Static58.anIntArray688[local93];
							local385 = local161 == null ? 0 : Static104.anIntArray142[local93];
							local845 = Static602.anIntArrayArray59[local93];
							local849 = Static592.anIntArrayArray58[local93];
							local837 = Static635.anIntArrayArray62[local93];
							local821 = Static336.anIntArrayArray32[local93];
						}
						@Pc(923) int local923 = local385 + local372;
						if (local923 <= 0) {
							Static454.method7117(arg5, local33, local49);
						} else {
							if (local87[0]) {
								local923++;
							}
							if (local87[2]) {
								local923++;
							}
							if (local87[1]) {
								local923++;
							}
							if (local87[3]) {
								local923++;
							}
							@Pc(953) int local953 = 0;
							@Pc(955) int local955 = 0;
							@Pc(959) int local959 = local923 * 3;
							@Pc(966) int[] local966 = local508 ? new int[local959] : null;
							@Pc(969) int[] local969 = new int[local959];
							@Pc(972) int[] local972 = new int[local959];
							@Pc(975) int[] local975 = new int[local959];
							@Pc(978) int[] local978 = new int[local959];
							@Pc(981) int[] local981 = new int[local959];
							@Pc(988) int[] local988 = arg0 == null ? null : new int[local959];
							@Pc(997) int[] local997 = arg0 == null && arg2 == null ? null : new int[local959];
							@Pc(999) int local999 = -1;
							@Pc(1001) int local1001 = -1;
							@Pc(1003) int local1003 = 256;
							@Pc(1109) byte local1109;
							@Pc(1021) int local1021;
							@Pc(1023) int local1023;
							@Pc(1255) int local1255;
							@Pc(1261) int local1261;
							@Pc(1270) int local1270;
							@Pc(1275) int local1275;
							@Pc(1292) int local1292;
							@Pc(1280) int local1280;
							@Pc(1297) int local1297;
							@Pc(1348) int local1348;
							@Pc(1354) int local1354;
							if (local161 != null) {
								local1001 = local161.anInt10468;
								local1003 = local161.anInt10464;
								local999 = local161.anInt10459;
								local1021 = Static198.method3986(arg4, local161);
								for (local1023 = 0; local1023 < local385; local1023++) {
									if (local87[-local99 & 0x3] && local821[0] == local953) {
										Static124.anIntArray717[0] = local837[local953];
										Static124.anIntArray717[1] = 1;
										Static124.anIntArray717[2] = local849[local953];
										Static124.anIntArray717[3] = 1;
										Static124.anIntArray717[4] = local845[local953];
										Static124.anIntArray717[5] = local849[local953];
										local1109 = 6;
									} else if (local87[2 - local99 & 0x3] && local821[2] == local953) {
										Static124.anIntArray717[0] = local837[local953];
										Static124.anIntArray717[1] = 5;
										Static124.anIntArray717[2] = local849[local953];
										Static124.anIntArray717[3] = 5;
										Static124.anIntArray717[4] = local845[local953];
										local1109 = 6;
										Static124.anIntArray717[5] = local849[local953];
									} else if (local87[1 - local99 & 0x3] && local953 == local821[1]) {
										Static124.anIntArray717[0] = local837[local953];
										Static124.anIntArray717[1] = 3;
										Static124.anIntArray717[2] = local849[local953];
										Static124.anIntArray717[3] = 3;
										Static124.anIntArray717[4] = local845[local953];
										local1109 = 6;
										Static124.anIntArray717[5] = local849[local953];
									} else if (local87[3 - local99 & 0x3] && local821[3] == local953) {
										Static124.anIntArray717[0] = local837[local953];
										Static124.anIntArray717[1] = 7;
										Static124.anIntArray717[2] = local849[local953];
										Static124.anIntArray717[3] = 7;
										Static124.anIntArray717[4] = local845[local953];
										local1109 = 6;
										Static124.anIntArray717[5] = local849[local953];
									} else {
										Static124.anIntArray717[0] = local837[local953];
										Static124.anIntArray717[1] = local845[local953];
										Static124.anIntArray717[2] = local849[local953];
										local1109 = 3;
									}
									for (local1255 = 0; local1255 < local1109; local1255++) {
										local1261 = Static124.anIntArray717[local1255];
										local1270 = local1261 - local99 * 2 & 0x7;
										local1275 = this.anIntArray669[local1261];
										local1280 = this.anIntArray670[local1261];
										if (local99 == 1) {
											local1297 = 512 - local1275;
											local1292 = local1280;
										} else if (local99 == 2) {
											local1292 = 512 - local1275;
											local1297 = 512 - local1280;
										} else if (local99 == 3) {
											local1297 = local1275;
											local1292 = 512 - local1280;
										} else {
											local1297 = local1280;
											local1292 = local1275;
										}
										local969[local955] = local1292;
										local972[local955] = local1297;
										if (local988 != null && Static414.aBooleanArrayArray7[local93][local1261]) {
											local1348 = local1292 + (local33 << 9);
											local1354 = local1297 + (local49 << 9);
											local988[local955] = arg0.method7999(local1348, local1354) - arg1.method7999(local1348, local1354);
										}
										if (local997 != null) {
											if (arg0 != null && !Static414.aBooleanArrayArray7[local93][local1261]) {
												local1348 = (local33 << 9) + local1292;
												local1354 = local1297 + (local49 << 9);
												local997[local955] = arg1.method7999(local1348, local1354) - arg0.method7999(local1348, local1354);
											} else if (arg2 != null && !Static35.aBooleanArrayArray1[local93][local1261]) {
												local1348 = (local33 << 9) + local1292;
												local1354 = (local49 << 9) + local1297;
												local997[local955] = arg2.method7999(local1348, local1354) - arg1.method7999(local1348, local1354);
											}
										}
										if (local1261 < 8 && Static640.anIntArray714[local1270] > local161.anInt10460) {
											if (local966 != null) {
												local966[local955] = Static155.anIntArray207[local1270];
											}
											local981[local955] = Static173.anIntArray213[local1270];
											local978[local955] = Static5.anIntArray7[local1270];
											local975[local955] = Static245.anIntArray279[local1270];
										} else {
											if (local966 != null) {
												local966[local955] = local1021;
											}
											local978[local955] = local161.anInt10468;
											local981[local955] = local161.anInt10464;
											local975[local955] = local999;
										}
										local955++;
									}
									local953++;
								}
								if (!this.aBoolean715 && arg5 == 0) {
									Static10.method217(local33, local49, local161.anInt10458, local161.anInt10457 * 8, local161.anInt10467);
								}
								if (local93 != 12 && local161.anInt10459 != -1 && local161.aBoolean718) {
									local82 = true;
								}
							} else if (local819) {
								local953 = Static459.anIntArray555[local93];
							} else if (local84) {
								local953 = Static248.anIntArray283[local93];
							} else {
								local953 = Static104.anIntArray142[local93];
							}
							if (local176 != null) {
								if (local139 == 0) {
									local139 = local115;
								}
								if (local131 == 0) {
									local131 = local115;
								}
								if (local123 == 0) {
									local123 = local115;
								}
								@Pc(1600) Class135 local1600 = this.aClass275_5.method7104(local115 - 1);
								@Pc(1608) Class135 local1608 = this.aClass275_5.method7104(local123 - 1);
								@Pc(1616) Class135 local1616 = this.aClass275_5.method7104(local131 - 1);
								@Pc(1624) Class135 local1624 = this.aClass275_5.method7104(local139 - 1);
								for (local1270 = 0; local1270 < local372; local1270++) {
									if (local87[-local99 & 0x3] && local953 == local821[0]) {
										Static124.anIntArray717[0] = local837[local953];
										Static124.anIntArray717[1] = 1;
										Static124.anIntArray717[2] = local849[local953];
										Static124.anIntArray717[3] = 1;
										Static124.anIntArray717[4] = local845[local953];
										local1109 = 6;
										Static124.anIntArray717[5] = local849[local953];
									} else if (local87[2 - local99 & 0x3] && local953 == local821[2]) {
										Static124.anIntArray717[0] = local837[local953];
										Static124.anIntArray717[1] = 5;
										Static124.anIntArray717[2] = local849[local953];
										Static124.anIntArray717[3] = 5;
										Static124.anIntArray717[4] = local845[local953];
										local1109 = 6;
										Static124.anIntArray717[5] = local849[local953];
									} else if (local87[1 - local99 & 0x3] && local953 == local821[1]) {
										Static124.anIntArray717[0] = local837[local953];
										Static124.anIntArray717[1] = 3;
										Static124.anIntArray717[2] = local849[local953];
										Static124.anIntArray717[3] = 3;
										Static124.anIntArray717[4] = local845[local953];
										Static124.anIntArray717[5] = local849[local953];
										local1109 = 6;
									} else if (local87[3 - local99 & 0x3] && local953 == local821[3]) {
										Static124.anIntArray717[0] = local837[local953];
										Static124.anIntArray717[1] = 7;
										Static124.anIntArray717[2] = local849[local953];
										Static124.anIntArray717[3] = 7;
										Static124.anIntArray717[4] = local845[local953];
										Static124.anIntArray717[5] = local849[local953];
										local1109 = 6;
									} else {
										Static124.anIntArray717[0] = local837[local953];
										Static124.anIntArray717[1] = local845[local953];
										local1109 = 3;
										Static124.anIntArray717[2] = local849[local953];
									}
									local953++;
									for (local1275 = 0; local1275 < local1109; local1275++) {
										local1292 = Static124.anIntArray717[local1275];
										local1280 = local1292 - local99 * 2 & 0x7;
										local1297 = this.anIntArray669[local1292];
										local1354 = this.anIntArray670[local1292];
										@Pc(1892) int local1892;
										if (local99 == 1) {
											local1348 = local1354;
											local1892 = 512 - local1297;
										} else if (local99 == 2) {
											local1892 = 512 - local1354;
											local1348 = 512 - local1297;
										} else if (local99 == 3) {
											local1892 = local1297;
											local1348 = 512 - local1354;
										} else {
											local1892 = local1354;
											local1348 = local1297;
										}
										local969[local955] = local1348;
										local972[local955] = local1892;
										@Pc(1947) int local1947;
										@Pc(1954) int local1954;
										if (local988 != null && Static414.aBooleanArrayArray7[local93][local1292]) {
											local1947 = local1348 + (local33 << 9);
											local1954 = (local49 << 9) + local1892;
											local988[local955] = arg0.method7999(local1947, local1954) - arg1.method7999(local1947, local1954);
										}
										if (local997 != null) {
											if (arg0 != null && !Static414.aBooleanArrayArray7[local93][local1292]) {
												local1947 = (local33 << 9) + local1348;
												local1954 = local1892 + (local49 << 9);
												local997[local955] = arg1.method7999(local1947, local1954) - arg0.method7999(local1947, local1954);
											} else if (arg2 != null && !Static35.aBooleanArrayArray1[local93][local1292]) {
												local1947 = (local33 << 9) + local1348;
												local1954 = local1892 + (local49 << 9);
												local997[local955] = arg2.method7999(local1947, local1954) - arg1.method7999(local1947, local1954);
											}
										}
										if (local1292 < 8 && Static640.anIntArray714[local1280] >= 0) {
											if (local966 != null) {
												local966[local955] = Static155.anIntArray207[local1280];
											}
											local981[local955] = Static173.anIntArray213[local1280];
											local978[local955] = Static5.anIntArray7[local1280];
											local975[local955] = Static245.anIntArray279[local1280];
										} else {
											if (local84 && Static414.aBooleanArrayArray7[local93][local1292]) {
												local978[local955] = local1001;
												local981[local955] = local1003;
												local975[local955] = local999;
											} else if (local1348 == 0 && local1892 == 0) {
												local975[local955] = arg3[local33][local49];
												local978[local955] = local1600.anInt4841;
												local981[local955] = local1600.anInt4845;
											} else if (local1348 == 0 && local1892 == 512) {
												local975[local955] = arg3[local33][local67];
												local978[local955] = local1608.anInt4841;
												local981[local955] = local1608.anInt4845;
											} else if (local1348 == 512 && local1892 == 512) {
												local975[local955] = arg3[local47][local67];
												local978[local955] = local1616.anInt4841;
												local981[local955] = local1616.anInt4845;
											} else if (local1348 == 512 && local1892 == 0) {
												local975[local955] = arg3[local47][local49];
												local978[local955] = local1624.anInt4841;
												local981[local955] = local1624.anInt4845;
											} else {
												if (local1348 >= 256) {
													if (local1892 >= 256) {
														local978[local955] = local1616.anInt4841;
														local981[local955] = local1616.anInt4845;
													} else {
														local978[local955] = local1624.anInt4841;
														local981[local955] = local1624.anInt4845;
													}
												} else if (local1892 < 256) {
													local978[local955] = local1600.anInt4841;
													local981[local955] = local1600.anInt4845;
												} else {
													local978[local955] = local1608.anInt4841;
													local981[local955] = local1608.anInt4845;
												}
												local1947 = Static104.method2675(arg3[local33][local49], arg3[local47][local49], local1348 << 7 >> 9);
												local1954 = Static104.method2675(arg3[local33][local67], arg3[local47][local67], local1348 << 7 >> 9);
												local975[local955] = Static104.method2675(local1947, local1954, local1892 << 7 >> 9);
											}
											if (local966 != null) {
												local966[local955] = local975[local955];
											}
										}
										local955++;
									}
								}
								if (local93 != 0 && local176.aBoolean362) {
									local82 = true;
								}
							}
							local1021 = arg1.method7995(local49, local33);
							local1023 = arg1.method7995(local49, local47);
							local1255 = arg1.method7995(local67, local47);
							local1261 = arg1.method7995(local67, local33);
							@Pc(2381) boolean local2381 = Static30.method735(local49, local33);
							if (local2381 && arg5 > 1 || !local2381 && arg5 > 0) {
								@Pc(2397) boolean local2397 = true;
								if (local176 != null && !local176.aBoolean361) {
									local2397 = false;
								} else if (local115 == 0 && local93 != 0) {
									local2397 = false;
								} else if (local107 > 0 && local184 != null && !local184.aBoolean717) {
									local2397 = false;
								}
								if (local2397 && local1021 == local1023 && local1255 == local1021 && local1021 == local1261) {
									this.aByteArrayArrayArray13[arg5][local33][local49] = (byte) (this.aByteArrayArrayArray13[arg5][local33][local49] | 0x4);
								}
							}
							local1275 = 0;
							local1292 = 0;
							local1280 = 0;
							if (this.aBoolean715) {
								local1275 = Static299.method5336(local33, local49);
								local1292 = Static578.method6998(local33, local49);
								local1280 = Static478.method7485(local33, local49);
							}
							arg1.U(local33, local49, local969, local988, local972, local997, local975, local966, local978, local981, local1275, local1292, local1280, local82);
							Static454.method7117(arg5, local33, local49);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIII)V")
	public final void method8695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) int local13;
		for (@Pc(9) int local9 = arg2; local9 < arg1 + arg2; local9++) {
			for (local13 = arg0; local13 < arg3 + arg0; local13++) {
				if (local13 >= 0 && local13 < this.anInt10420 && local9 >= 0 && this.anInt10417 > local9) {
					this.anIntArrayArrayArray19[arg4][local13][local9] = arg4 <= 0 ? 0 : this.anIntArrayArrayArray19[arg4 - 1][local13][local9] - 960;
				}
			}
		}
		if (arg0 > 0 && arg0 < this.anInt10420) {
			for (local13 = arg2 + 1; local13 < arg2 + arg1; local13++) {
				if (local13 >= 0 && local13 < this.anInt10417) {
					this.anIntArrayArrayArray19[arg4][arg0][local13] = this.anIntArrayArrayArray19[arg4][arg0 - 1][local13];
				}
			}
		}
		if (arg2 > 0 && arg2 < this.anInt10417) {
			for (local13 = arg0 + 1; local13 < arg3 + arg0; local13++) {
				if (local13 >= 0 && local13 < this.anInt10420) {
					this.anIntArrayArrayArray19[arg4][local13][arg2] = this.anIntArrayArrayArray19[arg4][local13][arg2 - 1];
				}
			}
		}
		if (arg0 < 0 || arg2 < 0 || this.anInt10420 <= arg0 || arg2 >= this.anInt10417) {
			return;
		}
		if (arg4 != 0) {
			if (arg0 > 0 && this.anIntArrayArrayArray19[arg4 - 1][arg0 - 1][arg2] != this.anIntArrayArrayArray19[arg4][arg0 - 1][arg2]) {
				this.anIntArrayArrayArray19[arg4][arg0][arg2] = this.anIntArrayArrayArray19[arg4][arg0 - 1][arg2];
				return;
			}
			if (arg2 > 0 && this.anIntArrayArrayArray19[arg4][arg0][arg2 - 1] != this.anIntArrayArrayArray19[arg4 - 1][arg0][arg2 - 1]) {
				this.anIntArrayArrayArray19[arg4][arg0][arg2] = this.anIntArrayArrayArray19[arg4][arg0][arg2 - 1];
				return;
			}
			if (arg0 > 0 && arg2 > 0 && this.anIntArrayArrayArray19[arg4][arg0 - 1][arg2 - 1] != this.anIntArrayArrayArray19[arg4 - 1][arg0 - 1][arg2 - 1]) {
				this.anIntArrayArrayArray19[arg4][arg0][arg2] = this.anIntArrayArrayArray19[arg4][arg0 - 1][arg2 - 1];
				return;
			}
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray19[arg4][arg0 - 1][arg2] != 0) {
			this.anIntArrayArrayArray19[arg4][arg0][arg2] = this.anIntArrayArrayArray19[arg4][arg0 - 1][arg2];
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray19[arg4][arg0][arg2 - 1] != 0) {
			this.anIntArrayArrayArray19[arg4][arg0][arg2] = this.anIntArrayArrayArray19[arg4][arg0][arg2 - 1];
			return;
		}
		if (arg0 > 0 && arg2 > 0 && this.anIntArrayArrayArray19[arg4][arg0 - 1][arg2 - 1] != 0) {
			this.anIntArrayArrayArray19[arg4][arg0][arg2] = this.anIntArrayArrayArray19[arg4][arg0 - 1][arg2 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(II[[I)V")
	public final void method8696(@OriginalArg(2) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray19[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt10420 + 1; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt10417 + 1; local16++) {
				local10[local12][local16] += arg0[local12][local16];
			}
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!s;BLclient!s;Lclient!ha;)V")
	public final void method8697(@OriginalArg(0) Class65 arg0, @OriginalArg(2) Class65 arg1, @OriginalArg(3) Class20 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt10420][this.anInt10417];
		if (Static333.anIntArray406 == null || this.anInt10417 != Static333.anIntArray406.length) {
			Static139.anIntArray167 = new int[this.anInt10417];
			Static222.anIntArray253 = new int[this.anInt10417];
			Static576.anIntArray663 = new int[this.anInt10417];
			Static333.anIntArray406 = new int[this.anInt10417];
			Static186.anIntArray220 = new int[this.anInt10417];
		}
		@Pc(48) int local48;
		for (@Pc(44) int local44 = 0; local44 < this.anInt10425; local44++) {
			for (local48 = 0; local48 < this.anInt10417; local48++) {
				Static333.anIntArray406[local48] = 0;
				Static222.anIntArray253[local48] = 0;
				Static186.anIntArray220[local48] = 0;
				Static576.anIntArray663[local48] = 0;
				Static139.anIntArray167[local48] = 0;
			}
			for (@Pc(77) int local77 = -5; local77 < this.anInt10420; local77++) {
				@Pc(87) int local87;
				@Pc(106) int local106;
				@Pc(175) int local175;
				for (@Pc(81) int local81 = 0; local81 < this.anInt10417; local81++) {
					local87 = local77 + 5;
					@Pc(155) int local155;
					if (local87 < this.anInt10420) {
						local106 = this.aByteArrayArrayArray14[local44][local87][local81] & 0xFF;
						if (local106 > 0) {
							@Pc(119) Class135 local119 = this.aClass275_5.method7104(local106 - 1);
							Static333.anIntArray406[local81] += local119.anInt4850;
							Static222.anIntArray253[local81] += local119.anInt4842;
							Static186.anIntArray220[local81] += local119.anInt4844;
							Static576.anIntArray663[local81] += local119.anInt4851;
							local155 = Static139.anIntArray167[local81]++;
						}
					}
					local106 = local77 - 5;
					if (local106 >= 0) {
						local175 = this.aByteArrayArrayArray14[local44][local106][local81] & 0xFF;
						if (local175 > 0) {
							@Pc(185) Class135 local185 = this.aClass275_5.method7104(local175 - 1);
							Static333.anIntArray406[local81] -= local185.anInt4850;
							Static222.anIntArray253[local81] -= local185.anInt4842;
							Static186.anIntArray220[local81] -= local185.anInt4844;
							Static576.anIntArray663[local81] -= local185.anInt4851;
							local155 = Static139.anIntArray167[local81]--;
						}
					}
				}
				if (local77 >= 0) {
					local87 = 0;
					local106 = 0;
					local175 = 0;
					@Pc(243) int local243 = 0;
					@Pc(245) int local245 = 0;
					for (@Pc(247) int local247 = -5; local247 < this.anInt10417; local247++) {
						@Pc(253) int local253 = local247 + 5;
						if (this.anInt10417 > local253) {
							local175 += Static186.anIntArray220[local253];
							local106 += Static222.anIntArray253[local253];
							local87 += Static333.anIntArray406[local253];
							local245 += Static139.anIntArray167[local253];
							local243 += Static576.anIntArray663[local253];
						}
						@Pc(295) int local295 = local247 - 5;
						if (local295 >= 0) {
							local243 -= Static576.anIntArray663[local295];
							local87 -= Static333.anIntArray406[local295];
							local175 -= Static186.anIntArray220[local295];
							local245 -= Static139.anIntArray167[local295];
							local106 -= Static222.anIntArray253[local295];
						}
						if (local247 >= 0 && local243 > 0 && local245 > 0) {
							local11[local77][local247] = Static539.method8073(local175 / local245, local106 / local245, local87 * 256 / local243);
						}
					}
				}
			}
			if (Static197.aBoolean334) {
				this.method8693(local44 == 0 ? arg0 : null, Static9.aClass65Array1[local44], local44 == 0 ? arg1 : null, local11, arg2, local44);
			} else {
				this.method8700(arg2, local44 == 0 ? arg0 : null, local44, local11, Static9.aClass65Array1[local44], local44 == 0 ? arg1 : null);
			}
			this.aByteArrayArrayArray14[local44] = null;
			this.aByteArrayArrayArray15[local44] = null;
			this.aByteArrayArrayArray16[local44] = null;
			this.aByteArrayArrayArray17[local44] = null;
		}
		if (!this.aBoolean715) {
			if (Static615.anInt10769 != 0) {
				Static551.method2896();
			}
			if (Static456.aBoolean482) {
				Static432.method6885();
			}
		}
		for (local48 = 0; local48 < this.anInt10425; local48++) {
			Static9.aClass65Array1[local48].YA();
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!cea;I[Lclient!fe;IIIB)V")
	public final void method8698(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class104[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10;
		@Pc(22) int local22;
		@Pc(28) int local28;
		@Pc(32) int local32;
		if (!this.aBoolean715) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class104 local16 = arg2[local10];
				for (@Pc(18) int local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local28 = local18 + arg1;
						local32 = arg5 + local22;
						if (local28 >= 0 && this.anInt10420 > local28 && local32 >= 0 && local32 < this.anInt10417) {
							local16.method3256(local32, local28);
						}
					}
				}
			}
		}
		local10 = arg1 + arg4;
		@Pc(91) int local91 = arg3 + arg5;
		for (local22 = 0; local22 < this.anInt10425; local22++) {
			for (local28 = 0; local28 < 64; local28++) {
				for (local32 = 0; local32 < 64; local32++) {
					this.method8699(false, 0, local32 + arg5, 0, arg0, 0, arg1 + local28, local10 + local28, local91 + local32, local22);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZIIILclient!cea;IIIIII)V")
	private void method8699(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub11 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg3 == 1) {
			arg1 = 1;
		} else if (arg3 == 2) {
			arg1 = 1;
			arg5 = 1;
		} else if (arg3 == 3) {
			arg5 = 1;
		}
		@Pc(53) int local53;
		if (arg6 < 0 || this.anInt10420 <= arg6 || arg2 < 0 || arg2 >= this.anInt10417) {
			while (true) {
				local53 = arg4.method8383();
				if (local53 == 0) {
					break;
				}
				if (local53 == 1) {
					arg4.method8383();
					break;
				}
				if (local53 <= 49) {
					arg4.method8383();
				}
			}
			return;
		}
		if (!this.aBoolean715 && !arg0) {
			Static476.aByteArrayArrayArray5[arg9][arg6][arg2] = 0;
		}
		while (true) {
			local53 = arg4.method8383();
			if (local53 == 0) {
				if (this.aBoolean715) {
					this.anIntArrayArrayArray19[0][arg5 + arg6][arg1 + arg2] = 0;
				} else if (arg9 == 0) {
					this.anIntArrayArrayArray19[0][arg5 + arg6][arg2 + arg1] = -Static320.method5563(arg7 + 932731, arg8 + 556238) * 8 << 2;
				} else {
					this.anIntArrayArrayArray19[arg9][arg5 + arg6][arg1 + arg2] = this.anIntArrayArrayArray19[arg9 - 1][arg5 + arg6][arg1 + arg2] - 960;
				}
				break;
			}
			if (local53 == 1) {
				@Pc(196) int local196 = arg4.method8383();
				if (this.aBoolean715) {
					this.anIntArrayArrayArray19[0][arg6 + arg5][arg2 + arg1] = local196 * 8 << 2;
				} else {
					if (local196 == 1) {
						local196 = 0;
					}
					if (arg9 == 0) {
						this.anIntArrayArrayArray19[0][arg6 + arg5][arg2 + arg1] = -local196 * 8 << 2;
					} else {
						this.anIntArrayArrayArray19[arg9][arg5 + arg6][arg1 + arg2] = this.anIntArrayArrayArray19[arg9 - 1][arg5 + arg6][arg2 + arg1] - (local196 * 8 << 2);
					}
				}
				break;
			}
			if (local53 <= 49) {
				if (arg0) {
					arg4.method8383();
				} else {
					this.aByteArrayArrayArray15[arg9][arg6][arg2] = arg4.method8384();
					this.aByteArrayArrayArray16[arg9][arg6][arg2] = (byte) ((local53 - 2) / 4);
					this.aByteArrayArrayArray17[arg9][arg6][arg2] = (byte) (local53 + arg3 - 2 & 0x3);
				}
			} else if (local53 <= 81) {
				if (!this.aBoolean715 && !arg0) {
					Static476.aByteArrayArrayArray5[arg9][arg6][arg2] = (byte) (local53 - 49);
				}
			} else if (!arg0) {
				this.aByteArrayArrayArray14[arg9][arg6][arg2] = (byte) (local53 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!ha;Lclient!s;IB[[ILclient!s;Lclient!s;)V")
	private void method8700(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) Class65 arg4, @OriginalArg(6) Class65 arg5) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt10420; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt10417; local11++) {
				if (Static546.anInt9790 == -1 || Static267.method4913(local11, local7, Static546.anInt9790, arg2)) {
					@Pc(35) byte local35 = this.aByteArrayArrayArray16[arg2][local7][local11];
					@Pc(44) byte local44 = this.aByteArrayArrayArray17[arg2][local7][local11];
					@Pc(55) int local55 = this.aByteArrayArrayArray15[arg2][local7][local11] & 0xFF;
					@Pc(66) int local66 = this.aByteArrayArrayArray14[arg2][local7][local11] & 0xFF;
					@Pc(81) Class354 local81 = local55 == 0 ? null : this.aClass49_5.method1919(local55 - 1);
					if (local35 == 0 && local81 == null) {
						local35 = 12;
					}
					@Pc(105) Class135 local105 = local66 == 0 ? null : this.aClass275_5.method7104(local66 - 1);
					@Pc(107) int local107 = 0;
					@Pc(109) int local109 = 0;
					if (local35 != 0) {
						local109 = local81 == null ? 0 : Static459.anIntArray555[local35];
						local107 = local105 == null ? 0 : Static242.anIntArray275[local35];
					} else if (local81 != null) {
						local109 = Static459.anIntArray555[local35];
					} else if (local105 != null) {
						local107 = Static459.anIntArray555[local35];
					}
					@Pc(147) int local147 = local109 + local107;
					@Pc(149) int local149 = 0;
					if (local147 != 0) {
						@Pc(161) int local161 = local81 == null ? -1 : local81.anInt10468;
						@Pc(168) int local168 = local105 == null ? -1 : local105.anInt4841;
						@Pc(171) int[] local171 = new int[local147];
						@Pc(174) int[] local174 = new int[local147];
						@Pc(177) int[] local177 = new int[local147];
						@Pc(180) int[] local180 = new int[local147];
						@Pc(182) boolean local182 = false;
						@Pc(184) boolean local184 = false;
						@Pc(202) int local202;
						if (local81 == null || local81.anInt10459 == -1 && local81.anInt10463 == -1 && local161 == -1) {
							local184 = true;
							for (local202 = 0; local202 < local109; local202++) {
								local171[local149] = -1;
								local149++;
							}
						} else {
							for (local202 = 0; local202 < local109; local202++) {
								local177[local149] = local161;
								local180[local149] = local81.anInt10464;
								if (local81.anInt10459 == -1) {
									local171[local149] = -1;
								} else {
									local171[local149] = local81.anInt10459;
								}
								if (local81.anInt10463 == -1) {
									local174[local149] = -1;
								} else {
									local182 = true;
									local174[local149] = local81.anInt10463;
								}
								local149++;
							}
							if (!this.aBoolean715 && arg2 == 0) {
								Static10.method217(local7, local11, local81.anInt10458, local81.anInt10457 * 8, local81.anInt10467);
							}
						}
						if (!local182) {
							local174 = null;
						}
						if (local105 == null) {
							if (local184) {
								continue;
							}
							for (local202 = 0; local202 < local107; local202++) {
								local171[local149] = -1;
								local149++;
							}
						} else {
							for (local202 = 0; local202 < local107; local202++) {
								local177[local149] = local168;
								local180[local149] = local105.anInt4845;
								local171[local149] = arg3[local7][local11];
								if (local174 != null) {
									local174[local149] = -1;
								}
								local149++;
							}
						}
						local202 = this.anIntArray669.length;
						@Pc(356) int[] local356 = new int[local202];
						@Pc(359) int[] local359 = new int[local202];
						@Pc(366) int[] local366 = arg1 == null ? null : new int[local202];
						@Pc(375) int[] local375 = arg1 == null && arg5 == null ? null : new int[local202];
						@Pc(384) int local384;
						@Pc(389) int local389;
						@Pc(474) int local474;
						@Pc(483) int local483;
						for (@Pc(377) int local377 = 0; local377 < local202; local377++) {
							local384 = this.anIntArray669[local377];
							local389 = this.anIntArray670[local377];
							if (local44 == 0) {
								local356[local377] = local384;
								local359[local377] = local389;
							} else if (local44 == 1) {
								local356[local377] = local389;
								local359[local377] = 512 - local384;
							} else if (local44 == 2) {
								local356[local377] = 512 - local384;
								local359[local377] = 512 - local389;
							} else if (local44 == 3) {
								local356[local377] = 512 - local389;
								local359[local377] = local384;
							}
							if (local366 != null && Static414.aBooleanArrayArray7[local35][local377]) {
								local474 = local356[local377] + (local7 << 9);
								local483 = (local11 << 9) + local359[local377];
								local366[local377] = arg1.method7999(local474, local483) - arg4.method7999(local474, local483);
							}
							if (local375 != null) {
								if (arg1 != null && !Static414.aBooleanArrayArray7[local35][local377]) {
									local474 = local356[local377] + (local7 << 9);
									local483 = (local11 << 9) + local359[local377];
									local375[local377] = arg4.method7999(local474, local483) - arg1.method7999(local474, local483);
								} else if (arg5 != null && !Static35.aBooleanArrayArray1[local35][local377]) {
									local474 = local356[local377] + (local7 << 9);
									local483 = local359[local377] + (local11 << 9);
									local375[local377] = arg5.method7999(local474, local483) - arg4.method7999(local474, local483);
								}
							}
						}
						local384 = arg4.method7995(local11, local7);
						local389 = arg4.method7995(local11, local7 + 1);
						local474 = arg4.method7995(local11 + 1, local7 - -1);
						local483 = arg4.method7995(local11 + 1, local7);
						@Pc(620) boolean local620 = Static30.method735(local11, local7);
						if (local620 && arg2 > 1 || !local620 && arg2 > 0) {
							@Pc(631) boolean local631 = true;
							if (local105 != null && !local105.aBoolean361) {
								local631 = false;
							} else if (local66 == 0 && local35 != 0) {
								local631 = false;
							} else if (local55 > 0 && local81 != null && !local81.aBoolean717) {
								local631 = false;
							}
							if (local631 && local384 == local389 && local474 == local384 && local483 == local384) {
								this.aByteArrayArrayArray13[arg2][local7][local11] = (byte) (this.aByteArrayArrayArray13[arg2][local7][local11] | 0x4);
							}
						}
						@Pc(704) int local704 = 0;
						@Pc(706) int local706 = 0;
						@Pc(708) int local708 = 0;
						if (this.aBoolean715) {
							local704 = Static299.method5336(local7, local11);
							local706 = Static578.method6998(local7, local11);
							local708 = Static478.method7485(local7, local11);
						}
						arg4.method7991(local7, local11, local356, local366, local359, local375, Static195.anIntArrayArray18[local35], Static29.anIntArrayArray6[local35], Static22.anIntArrayArray2[local35], local171, local174, local177, local180, local704, local706, local708);
						Static454.method7117(arg2, local7, local11);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIILclient!cea;III[Lclient!fe;II)V")
	public final void method8701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub11 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class104[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(15) int local15 = (arg5 & 0x7) * 8;
		@Pc(21) int local21 = (arg3 & 0x7) * 8;
		@Pc(30) int local30;
		@Pc(60) int local60;
		if (!this.aBoolean715) {
			@Pc(28) Class104 local28 = arg6[arg1];
			for (local30 = 0; local30 < 8; local30++) {
				for (@Pc(34) int local34 = 0; local34 < 8; local34++) {
					@Pc(48) int local48 = arg0 + Static619.method9024(local34 & 0x7, arg7, local30 & 0x7);
					local60 = Static321.method5575(local30 & 0x7, local34 & 0x7, arg7) + arg4;
					if (local48 > 0 && local48 < this.anInt10420 - 1 && local60 > 0 && this.anInt10417 - 1 > local60) {
						local28.method3256(local60, local48);
					}
				}
			}
		}
		@Pc(98) int local98 = (arg5 & 0xFFFFFFF8) << 3;
		local30 = (arg3 & 0xFFFFFFF8) << 3;
		@Pc(106) byte local106 = 0;
		@Pc(108) byte local108 = 0;
		if (arg7 == 1) {
			local108 = 1;
		} else if (arg7 == 2) {
			local108 = 1;
			local106 = 1;
		} else if (arg7 == 3) {
			local106 = 1;
		}
		for (local60 = 0; local60 < this.anInt10425; local60++) {
			for (@Pc(139) int local139 = 0; local139 < 64; local139++) {
				for (@Pc(143) int local143 = 0; local143 < 64; local143++) {
					if (arg8 == local60 && local139 >= local15 && local15 + 8 >= local139 && local143 >= local21 && local143 <= local21 + 8) {
						@Pc(217) int local217;
						@Pc(229) int local229;
						if (local139 == local15 + 8 || local21 + 8 == local143) {
							if (arg7 == 0) {
								local229 = local143 + arg4 - local21;
								local217 = local139 + arg0 - local15;
							} else if (arg7 == 1) {
								local229 = arg4 + local15 + 8 - local139;
								local217 = local143 + arg0 - local21;
							} else if (arg7 == 2) {
								local229 = arg4 + local21 + 8 - local143;
								local217 = local15 + arg0 + 8 - local139;
							} else {
								local217 = local21 + arg0 + 8 - local143;
								local229 = arg4 + local139 - local15;
							}
							this.method8699(true, 0, local229, 0, arg2, 0, local217, local139 + local98, local143 + local30, arg1);
						} else {
							local217 = Static619.method9024(local143 & 0x7, arg7, local139 & 0x7) + arg0;
							local229 = arg4 + Static321.method5575(local139 & 0x7, local143 & 0x7, arg7);
							this.method8699(false, local108, local229, arg7, arg2, local106, local217, local98 + local139, local143 + local30, arg1);
						}
						if (local139 == 63 || local143 == 63) {
							@Pc(355) byte local355 = 1;
							if (local139 == 63 && local143 == 63) {
								local355 = 3;
							}
							for (@Pc(369) int local369 = 0; local369 < local355; local369++) {
								@Pc(373) int local373 = local139;
								@Pc(375) int local375 = local143;
								if (local369 == 0) {
									local375 = local143 == 63 ? 64 : local143;
									local373 = local139 == 63 ? 64 : local139;
								} else if (local369 == 1) {
									local373 = 64;
								} else if (local369 == 2) {
									local375 = 64;
								}
								@Pc(426) int local426;
								@Pc(419) int local419;
								if (arg7 == 0) {
									local419 = local375 + arg4 - local21;
									local426 = local373 + arg0 - local15;
								} else if (arg7 == 1) {
									local419 = local15 + arg4 + 8 - local373;
									local426 = arg0 + local375 - local21;
								} else if (arg7 == 2) {
									local419 = arg4 + local21 + 8 - local375;
									local426 = local15 + arg0 + 8 - local373;
								} else {
									local426 = local21 + arg0 + 8 - local375;
									local419 = local373 + arg4 - local15;
								}
								if (local426 >= 0 && this.anInt10420 > local426 && local419 >= 0 && local419 < this.anInt10417) {
									this.anIntArrayArrayArray19[arg1][local426][local419] = this.anIntArrayArrayArray19[arg1][local106 + local217][local108 + local229];
								}
							}
						}
					} else {
						this.method8699(false, 0, -1, 0, arg2, 0, -1, 0, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!ha;[[[II[Lclient!fe;)V")
	public final void method8702(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(3) Class104[] arg2) {
		@Pc(19) int local19;
		@Pc(23) int local23;
		@Pc(27) int local27;
		if (!this.aBoolean715) {
			for (local19 = 0; local19 < 4; local19++) {
				for (local23 = 0; local23 < this.anInt10420; local23++) {
					for (local27 = 0; local27 < this.anInt10417; local27++) {
						if ((Static476.aByteArrayArrayArray5[local19][local23][local27] & 0x1) != 0) {
							@Pc(44) int local44 = local19;
							if ((Static476.aByteArrayArrayArray5[1][local23][local27] & 0x2) != 0) {
								local44 = local19 - 1;
							}
							if (local44 >= 0) {
								arg2[local44].method3262(local27, local23);
							}
						}
					}
				}
			}
		}
		for (local19 = 0; local19 < this.anInt10425; local19++) {
			local23 = 0;
			local27 = 0;
			if (!this.aBoolean715) {
				if (Static456.aBoolean482) {
					local23 = 2;
				}
				if (Static161.aBoolean556) {
					local27 = 8;
				}
				if (Static615.anInt10769 != 0) {
					if (local19 == 0 | Static622.aBoolean738) {
						local27 |= 0x10;
					}
					local23 |= 0x1;
				}
			}
			if (Static456.aBoolean482) {
				local27 |= 0x7;
			}
			if (!Static247.aBoolean534) {
				local27 |= 0x20;
			}
			@Pc(163) int[][] local163 = arg1 == null || local19 >= arg1.length ? this.anIntArrayArrayArray19[local19] : arg1[local19];
			Static55.method7084(local19, arg0.method7251(this.anInt10420, this.anInt10417, this.anIntArrayArrayArray19[local19], local163, local23, local27));
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIII)V")
	public final void method8705(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt10425; local7++) {
			this.method8695(arg1, 64, arg0, 64, local7);
		}
	}
}
