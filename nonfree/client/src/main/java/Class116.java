import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public class Class116 {

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!qi", name = "q", descriptor = "[I")
	private final int[] anIntArray185 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!qi", name = "C", descriptor = "[I")
	private final int[] anIntArray186 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "Lclient!nba;")
	private final Class245 aClass245_3;

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "Z")
	public final boolean aBoolean278;

	@OriginalMember(owner = "client!qi", name = "u", descriptor = "I")
	protected final int anInt3494;

	@OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
	protected final int anInt3492;

	@OriginalMember(owner = "client!qi", name = "o", descriptor = "Lclient!nn;")
	private final Class255 aClass255_2;

	@OriginalMember(owner = "client!qi", name = "D", descriptor = "I")
	public final int anInt3486;

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!qi", name = "G", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!qi", name = "E", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!qi", name = "t", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!qi", name = "w", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(IIIZLclient!nba;Lclient!nn;)V")
	protected Class116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class245 arg4, @OriginalArg(5) Class255 arg5) {
		this.aClass245_3 = arg4;
		this.aBoolean278 = arg3;
		this.anInt3494 = arg2;
		this.anInt3492 = arg1;
		this.aClass255_2 = arg5;
		this.anInt3486 = arg0;
		this.aByteArrayArrayArray12 = new byte[this.anInt3486][this.anInt3492 + 1][this.anInt3494 + 1];
		this.aByteArrayArrayArray11 = new byte[this.anInt3486][this.anInt3492][this.anInt3494];
		this.aByteArrayArrayArray14 = new byte[this.anInt3486][this.anInt3492][this.anInt3494];
		this.aByteArrayArrayArray9 = new byte[this.anInt3486][this.anInt3492][this.anInt3494];
		this.aByteArrayArrayArray10 = new byte[this.anInt3486][this.anInt3492][this.anInt3494];
		this.anIntArrayArrayArray10 = new int[this.anInt3486][this.anInt3492 + 1][this.anInt3494 + 1];
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIBI)V")
	public final void method3277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3486; local7++) {
			this.method3284(64, local7, arg0, arg1, 64);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "([Z[[BILclient!fn;[[BLclient!ha;IIILclient!nga;[[BIII)V")
	private void method3278(@OriginalArg(0) boolean[] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class117 arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) Class75 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class249 arg9, @OriginalArg(10) byte[][] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		@Pc(26) boolean[] local26 = arg9 != null && arg9.aBoolean514 ? Static620.aBooleanArrayArray7[arg12] : Static266.aBooleanArrayArray2[arg12];
		@Pc(47) int local47;
		@Pc(60) Class249 local60;
		@Pc(79) byte local79;
		@Pc(95) int local95;
		@Pc(100) int local100;
		if (arg7 > 0) {
			if (arg6 > 0) {
				local47 = arg10[arg6 - 1][arg7 - 1] & 0xFF;
				if (local47 > 0) {
					local60 = this.aClass245_3.method5974(local47 - 1);
					if (local60.anInt6869 != -1 && local60.aBoolean514) {
						local79 = arg1[arg6 - 1][arg7 - 1];
						local95 = arg4[arg6 - 1][arg7 - 1] * 2 + 4 & 0x7;
						local100 = Static18.method228(arg5, local60);
						if (Static270.aBooleanArrayArray3[local79][local95]) {
							Static683.anIntArray696[0] = local60.anInt6869;
							Static646.anIntArray508[0] = local100;
							Static487.anIntArray691[0] = local60.anInt6871;
							Static463.anIntArray609[0] = local60.anInt6870;
							Static590.anIntArray610[0] = local60.anInt6868;
							Static42.anIntArray40[0] = 256;
						}
					}
				}
			}
			if (arg8 - 1 > arg6) {
				local47 = arg10[arg6 + 1][arg7 - 1] & 0xFF;
				if (local47 > 0) {
					local60 = this.aClass245_3.method5974(local47 - 1);
					if (local60.anInt6869 != -1 && local60.aBoolean514) {
						local79 = arg1[arg6 + 1][arg7 - 1];
						local95 = arg4[arg6 + 1][arg7 - 1] * 2 + 6 & 0x7;
						local100 = Static18.method228(arg5, local60);
						if (Static270.aBooleanArrayArray3[local79][local95]) {
							Static683.anIntArray696[2] = local60.anInt6869;
							Static646.anIntArray508[2] = local100;
							Static487.anIntArray691[2] = local60.anInt6871;
							Static463.anIntArray609[2] = local60.anInt6870;
							Static590.anIntArray610[2] = local60.anInt6868;
							Static42.anIntArray40[2] = 512;
						}
					}
				}
			}
		}
		if (arg7 < arg2 - 1) {
			if (arg6 > 0) {
				local47 = arg10[arg6 - 1][arg7 + 1] & 0xFF;
				if (local47 > 0) {
					local60 = this.aClass245_3.method5974(local47 - 1);
					if (local60.anInt6869 != -1 && local60.aBoolean514) {
						local79 = arg1[arg6 - 1][arg7 + 1];
						local95 = arg4[arg6 - 1][arg7 + 1] * 2 + 2 & 0x7;
						local100 = Static18.method228(arg5, local60);
						if (Static270.aBooleanArrayArray3[local79][local95]) {
							Static683.anIntArray696[6] = local60.anInt6869;
							Static646.anIntArray508[6] = local100;
							Static487.anIntArray691[6] = local60.anInt6871;
							Static463.anIntArray609[6] = local60.anInt6870;
							Static590.anIntArray610[6] = local60.anInt6868;
							Static42.anIntArray40[6] = 64;
						}
					}
				}
			}
			if (arg8 - 1 > arg6) {
				local47 = arg10[arg6 + 1][arg7 + 1] & 0xFF;
				if (local47 > 0) {
					local60 = this.aClass245_3.method5974(local47 - 1);
					if (local60.anInt6869 != -1 && local60.aBoolean514) {
						local79 = arg1[arg6 + 1][arg7 + 1];
						local95 = arg4[arg6 + 1][arg7 + 1] * 2 & 0x7;
						local100 = Static18.method228(arg5, local60);
						if (Static270.aBooleanArrayArray3[local79][local95]) {
							Static683.anIntArray696[4] = local60.anInt6869;
							Static646.anIntArray508[4] = local100;
							Static487.anIntArray691[4] = local60.anInt6871;
							Static463.anIntArray609[4] = local60.anInt6870;
							Static590.anIntArray610[4] = local60.anInt6868;
							Static42.anIntArray40[4] = 128;
						}
					}
				}
			}
		}
		@Pc(512) int local512;
		@Pc(517) int local517;
		@Pc(519) int local519;
		@Pc(500) byte local500;
		if (arg7 > 0) {
			local47 = arg10[arg6][arg7 - 1] & 0xFF;
			if (local47 > 0) {
				local60 = this.aClass245_3.method5974(local47 - 1);
				if (local60.anInt6869 != -1) {
					local79 = arg1[arg6][arg7 - 1];
					local500 = arg4[arg6][arg7 - 1];
					if (local60.aBoolean514) {
						local100 = 2;
						local512 = local500 * 2 + 4;
						local517 = Static18.method228(arg5, local60);
						for (local519 = 0; local519 < 3; local519++) {
							local100 &= 0x7;
							local512 &= 0x7;
							if (Static270.aBooleanArrayArray3[local79][local512] && Static590.anIntArray610[local100] <= local60.anInt6868) {
								Static683.anIntArray696[local100] = local60.anInt6869;
								Static646.anIntArray508[local100] = local517;
								Static487.anIntArray691[local100] = local60.anInt6871;
								Static463.anIntArray609[local100] = local60.anInt6870;
								if (Static590.anIntArray610[local100] == local60.anInt6868) {
									Static42.anIntArray40[local100] |= 0x20;
								} else {
									Static42.anIntArray40[local100] = 32;
								}
								Static590.anIntArray610[local100] = local60.anInt6868;
							}
							local512++;
							local100--;
						}
						if (!local26[arg11 & 0x3]) {
							arg0[0] = Static620.aBooleanArrayArray7[local79][local500 + 2 & 0x3];
						}
					} else if (!local26[arg11 & 0x3]) {
						arg0[0] = Static266.aBooleanArrayArray2[local79][local500 + 2 & 0x3];
					}
				}
			}
		}
		if (arg2 - 1 > arg7) {
			local47 = arg10[arg6][arg7 + 1] & 0xFF;
			if (local47 > 0) {
				local60 = this.aClass245_3.method5974(local47 - 1);
				if (local60.anInt6869 != -1) {
					local79 = arg1[arg6][arg7 + 1];
					local500 = arg4[arg6][arg7 + 1];
					if (local60.aBoolean514) {
						local100 = 4;
						local512 = local500 * 2 + 2;
						local517 = Static18.method228(arg5, local60);
						for (local519 = 0; local519 < 3; local519++) {
							local512 &= 0x7;
							local100 &= 0x7;
							if (Static270.aBooleanArrayArray3[local79][local512] && local60.anInt6868 >= Static590.anIntArray610[local100]) {
								Static683.anIntArray696[local100] = local60.anInt6869;
								Static646.anIntArray508[local100] = local517;
								Static487.anIntArray691[local100] = local60.anInt6871;
								Static463.anIntArray609[local100] = local60.anInt6870;
								if (local60.anInt6868 == Static590.anIntArray610[local100]) {
									Static42.anIntArray40[local100] |= 0x10;
								} else {
									Static42.anIntArray40[local100] = 16;
								}
								Static590.anIntArray610[local100] = local60.anInt6868;
							}
							local100++;
							local512--;
						}
						if (!local26[arg11 + 2 & 0x3]) {
							arg0[2] = Static620.aBooleanArrayArray7[local79][--local500 & 0x3];
						}
					} else if (!local26[arg11 + 2 & 0x3]) {
						arg0[2] = Static266.aBooleanArrayArray2[local79][local500 & 0x3];
					}
				}
			}
		}
		if (arg6 > 0) {
			local47 = arg10[arg6 - 1][arg7] & 0xFF;
			if (local47 > 0) {
				local60 = this.aClass245_3.method5974(local47 - 1);
				if (local60.anInt6869 != -1) {
					local79 = arg1[arg6 - 1][arg7];
					local500 = arg4[arg6 - 1][arg7];
					if (local60.aBoolean514) {
						local100 = 6;
						local512 = local500 * 2 + 4;
						local517 = Static18.method228(arg5, local60);
						for (local519 = 0; local519 < 3; local519++) {
							local100 &= 0x7;
							local512 &= 0x7;
							if (Static270.aBooleanArrayArray3[local79][local512] && local60.anInt6868 >= Static590.anIntArray610[local100]) {
								Static683.anIntArray696[local100] = local60.anInt6869;
								Static646.anIntArray508[local100] = local517;
								Static487.anIntArray691[local100] = local60.anInt6871;
								Static463.anIntArray609[local100] = local60.anInt6870;
								if (local60.anInt6868 == Static590.anIntArray610[local100]) {
									Static42.anIntArray40[local100] |= 0x8;
								} else {
									Static42.anIntArray40[local100] = 8;
								}
								Static590.anIntArray610[local100] = local60.anInt6868;
							}
							local100++;
							local512--;
						}
						if (!local26[arg11 + 3 & 0x3]) {
							arg0[3] = Static620.aBooleanArrayArray7[local79][local500 + 1 & 0x3];
						}
					} else if (!local26[arg11 + 3 & 0x3]) {
						arg0[3] = Static266.aBooleanArrayArray2[local79][local500 + 1 & 0x3];
					}
				}
			}
		}
		if (arg6 < arg8 - 1) {
			local47 = arg10[arg6 + 1][arg7] & 0xFF;
			if (local47 > 0) {
				local60 = this.aClass245_3.method5974(local47 - 1);
				if (local60.anInt6869 != -1) {
					local79 = arg1[arg6 + 1][arg7];
					local500 = arg4[arg6 + 1][arg7];
					if (local60.aBoolean514) {
						local100 = 4;
						local512 = local500 * 2 + 6;
						local517 = Static18.method228(arg5, local60);
						for (local519 = 0; local519 < 3; local519++) {
							local512 &= 0x7;
							local100 &= 0x7;
							if (Static270.aBooleanArrayArray3[local79][local512] && local60.anInt6868 >= Static590.anIntArray610[local100]) {
								Static683.anIntArray696[local100] = local60.anInt6869;
								Static646.anIntArray508[local100] = local517;
								Static487.anIntArray691[local100] = local60.anInt6871;
								Static463.anIntArray609[local100] = local60.anInt6870;
								if (Static590.anIntArray610[local100] == local60.anInt6868) {
									Static42.anIntArray40[local100] |= 0x4;
								} else {
									Static42.anIntArray40[local100] = 4;
								}
								Static590.anIntArray610[local100] = local60.anInt6868;
							}
							local100--;
							local512++;
						}
						if (!local26[arg11 + 1 & 0x3]) {
							arg0[1] = Static620.aBooleanArrayArray7[local79][local500 + 3 & 0x3];
						}
					} else if (!local26[arg11 + 1 & 0x3]) {
						arg0[1] = Static266.aBooleanArrayArray2[local79][local500 + 3 & 0x3];
					}
				}
			}
		}
		if (arg9 == null) {
			return;
		}
		local47 = Static18.method228(arg5, arg9);
		if (!arg9.aBoolean514) {
			return;
		}
		for (@Pc(1278) int local1278 = 0; local1278 < 8; local1278++) {
			@Pc(1288) int local1288 = local1278 - arg11 * 2 & 0x7;
			if (Static270.aBooleanArrayArray3[arg12][local1278] && Static590.anIntArray610[local1288] <= arg9.anInt6868) {
				Static683.anIntArray696[local1288] = arg9.anInt6869;
				Static646.anIntArray508[local1288] = local47;
				Static487.anIntArray691[local1288] = arg9.anInt6871;
				Static463.anIntArray609[local1288] = arg9.anInt6870;
				if (Static590.anIntArray610[local1288] == arg9.anInt6868) {
					Static42.anIntArray40[local1288] |= 0x2;
				} else {
					Static42.anIntArray40[local1288] = 2;
				}
				Static590.anIntArray610[local1288] = arg9.anInt6868;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!s;ILclient!s;Lclient!ha;)V")
	public final void method3279(@OriginalArg(0) Class96 arg0, @OriginalArg(2) Class96 arg1, @OriginalArg(3) Class75 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt3492][this.anInt3494];
		if (Static4.anIntArray3 == null || this.anInt3494 != Static4.anIntArray3.length) {
			Static173.anIntArray192 = new int[this.anInt3494];
			Static329.anIntArray330 = new int[this.anInt3494];
			Static491.anIntArray524 = new int[this.anInt3494];
			Static425.anIntArray469 = new int[this.anInt3494];
			Static4.anIntArray3 = new int[this.anInt3494];
		}
		@Pc(50) int local50;
		for (@Pc(44) int local44 = 0; local44 < this.anInt3486; local44++) {
			for (local50 = 0; local50 < this.anInt3494; local50++) {
				Static4.anIntArray3[local50] = 0;
				Static173.anIntArray192[local50] = 0;
				Static329.anIntArray330[local50] = 0;
				Static491.anIntArray524[local50] = 0;
				Static425.anIntArray469[local50] = 0;
			}
			for (@Pc(81) int local81 = -5; local81 < this.anInt3492; local81++) {
				@Pc(97) int local97;
				@Pc(116) int local116;
				@Pc(185) int local185;
				for (@Pc(89) int local89 = 0; local89 < this.anInt3494; local89++) {
					local97 = local81 + 5;
					@Pc(165) int local165;
					if (local97 < this.anInt3492) {
						local116 = this.aByteArrayArrayArray9[local44][local97][local89] & 0xFF;
						if (local116 > 0) {
							@Pc(129) Class117 local129 = this.aClass255_2.method6216(local116 - 1);
							Static4.anIntArray3[local89] += local129.anInt3526;
							Static173.anIntArray192[local89] += local129.anInt3521;
							Static329.anIntArray330[local89] += local129.anInt3522;
							Static491.anIntArray524[local89] += local129.anInt3520;
							local165 = Static425.anIntArray469[local89]++;
						}
					}
					local116 = local81 - 5;
					if (local116 >= 0) {
						local185 = this.aByteArrayArrayArray9[local44][local116][local89] & 0xFF;
						if (local185 > 0) {
							@Pc(195) Class117 local195 = this.aClass255_2.method6216(local185 - 1);
							Static4.anIntArray3[local89] -= local195.anInt3526;
							Static173.anIntArray192[local89] -= local195.anInt3521;
							Static329.anIntArray330[local89] -= local195.anInt3522;
							Static491.anIntArray524[local89] -= local195.anInt3520;
							local165 = Static425.anIntArray469[local89]--;
						}
					}
				}
				if (local81 >= 0) {
					local97 = 0;
					local116 = 0;
					local185 = 0;
					@Pc(257) int local257 = 0;
					@Pc(259) int local259 = 0;
					for (@Pc(261) int local261 = -5; local261 < this.anInt3494; local261++) {
						@Pc(267) int local267 = local261 + 5;
						if (local267 < this.anInt3494) {
							local97 += Static4.anIntArray3[local267];
							local185 += Static329.anIntArray330[local267];
							local259 += Static425.anIntArray469[local267];
							local257 += Static491.anIntArray524[local267];
							local116 += Static173.anIntArray192[local267];
						}
						@Pc(305) int local305 = local261 - 5;
						if (local305 >= 0) {
							local116 -= Static173.anIntArray192[local305];
							local97 -= Static4.anIntArray3[local305];
							local257 -= Static491.anIntArray524[local305];
							local259 -= Static425.anIntArray469[local305];
							local185 -= Static329.anIntArray330[local305];
						}
						if (local261 >= 0 && local257 > 0 && local259 > 0) {
							local11[local81][local261] = Static563.method7954(local185 / local259, local116 / local259, local97 * 256 / local257);
						}
					}
				}
			}
			if (Static14.aBoolean20) {
				this.method3287(local11, local44 == 0 ? arg0 : null, local44, arg2, Static555.aClass96Array3[local44], 0, local44 == 0 ? arg1 : null);
			} else {
				this.method3281(local11, arg2, Static555.aClass96Array3[local44], local44 == 0 ? arg1 : null, local44, local44 == 0 ? arg0 : null);
			}
			this.aByteArrayArrayArray9[local44] = null;
			this.aByteArrayArrayArray10[local44] = null;
			this.aByteArrayArrayArray14[local44] = null;
			this.aByteArrayArrayArray11[local44] = null;
		}
		if (!this.aBoolean278) {
			if (Static102.anInt2052 != 0) {
				Static519.method7508();
			}
			if (Static58.aBoolean47) {
				Static255.method4442();
			}
		}
		for (local50 = 0; local50 < this.anInt3486; local50++) {
			Static555.aClass96Array3[local50].YA();
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZIILclient!jc;II[Lclient!uda;II)V")
	public final void method3280(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6_Sub15 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class356[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg4 & 0x7) * 8;
		@Pc(17) int local17 = (arg1 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(57) int local57;
		if (!this.aBoolean278) {
			@Pc(24) Class356 local24 = arg6[arg7];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(44) int local44 = Static438.method6630(local30 & 0x7, local26 & 0x7, arg8) + arg5;
					local57 = arg0 + Static658.method8769(local26 & 0x7, local30 & 0x7, arg8);
					if (local44 > 0 && this.anInt3492 - 1 > local44 && local57 > 0 && this.anInt3494 - 1 > local57) {
						local24.method8393(local44, local57);
					}
				}
			}
		}
		@Pc(109) int local109 = (arg4 & 0xFFFFFFF8) << 3;
		local26 = (arg1 & 0xFFFFFFF8) << 3;
		@Pc(117) byte local117 = 0;
		@Pc(119) byte local119 = 0;
		if (arg8 == 1) {
			local119 = 1;
		} else if (arg8 == 2) {
			local119 = 1;
			local117 = 1;
		} else if (arg8 == 3) {
			local117 = 1;
		}
		for (local57 = 0; local57 < this.anInt3486; local57++) {
			for (@Pc(157) int local157 = 0; local157 < 64; local157++) {
				for (@Pc(161) int local161 = 0; local161 < 64; local161++) {
					if (local57 == arg2 && local157 >= local11 && local157 <= local11 + 8 && local17 <= local161 && local17 + 8 >= local161) {
						@Pc(255) int local255;
						@Pc(267) int local267;
						if (local11 + 8 == local157 || local17 + 8 == local161) {
							if (arg8 == 0) {
								local255 = local157 + arg5 - local11;
								local267 = arg0 + local161 - local17;
							} else if (arg8 == 1) {
								local267 = local11 + arg0 + 8 - local157;
								local255 = local161 + arg5 - local17;
							} else if (arg8 == 2) {
								local255 = local11 + arg5 + 8 - local157;
								local267 = local17 + arg0 + 8 - local161;
							} else {
								local255 = local17 + arg5 + 8 - local161;
								local267 = arg0 + local157 - local11;
							}
							this.method3286(local255, true, 0, 0, arg7, 0, arg3, local161 + local26, local109 - -local157, local267);
						} else {
							local255 = Static438.method6630(local161 & 0x7, local157 & 0x7, arg8) + arg5;
							local267 = Static658.method8769(local157 & 0x7, local161 & 0x7, arg8) + arg0;
							this.method3286(local255, false, local119, local117, arg7, arg8, arg3, local26 + local161, local157 + local109, local267);
						}
						if (local157 == 63 || local161 == 63) {
							@Pc(404) byte local404 = 1;
							if (local157 == 63 && local161 == 63) {
								local404 = 3;
							}
							for (@Pc(418) int local418 = 0; local418 < local404; local418++) {
								@Pc(422) int local422 = local157;
								@Pc(424) int local424 = local161;
								if (local418 == 0) {
									local422 = local157 == 63 ? 64 : local157;
									local424 = local161 == 63 ? 64 : local161;
								} else if (local418 == 1) {
									local422 = 64;
								} else if (local418 == 2) {
									local424 = 64;
								}
								@Pc(477) int local477;
								@Pc(484) int local484;
								if (arg8 == 0) {
									local477 = arg5 + local422 - local11;
									local484 = arg0 + local424 - local17;
								} else if (arg8 == 1) {
									local484 = local11 + arg0 + 8 - local422;
									local477 = arg5 + local424 - local17;
								} else if (arg8 == 2) {
									local484 = arg0 + local17 + 8 - local424;
									local477 = arg5 + local11 + 8 - local422;
								} else {
									local484 = arg0 + local422 - local11;
									local477 = local17 + arg5 + 8 - local424;
								}
								if (local477 >= 0 && local477 < this.anInt3492 && local484 >= 0 && this.anInt3494 > local484) {
									this.anIntArrayArrayArray10[arg7][local477][local484] = this.anIntArrayArrayArray10[arg7][local255 + local117][local119 + local267];
								}
							}
						}
					} else {
						this.method3286(-1, false, 0, 0, 0, 0, arg3, 0, 0, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "([[IZLclient!ha;Lclient!s;Lclient!s;ILclient!s;)V")
	private void method3281(@OriginalArg(0) int[][] arg0, @OriginalArg(2) Class75 arg1, @OriginalArg(3) Class96 arg2, @OriginalArg(4) Class96 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class96 arg5) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3492; local3++) {
			for (@Pc(9) int local9 = 0; local9 < this.anInt3494; local9++) {
				if (Static591.anInt9403 == -1 || Static596.method8244(local9, local3, Static591.anInt9403, arg4)) {
					@Pc(44) byte local44 = this.aByteArrayArrayArray14[arg4][local3][local9];
					@Pc(53) byte local53 = this.aByteArrayArrayArray11[arg4][local3][local9];
					@Pc(64) int local64 = this.aByteArrayArrayArray10[arg4][local3][local9] & 0xFF;
					@Pc(75) int local75 = this.aByteArrayArrayArray9[arg4][local3][local9] & 0xFF;
					@Pc(88) Class249 local88 = local64 == 0 ? null : this.aClass245_3.method5974(local64 - 1);
					if (local44 == 0 && local88 == null) {
						local44 = 12;
					}
					@Pc(115) Class117 local115 = local75 == 0 ? null : this.aClass255_2.method6216(local75 - 1);
					@Pc(117) Class249 local117 = local88;
					if (local88 != null && local88.anInt6869 == -1 && local88.anInt6864 == -1) {
						local117 = local88;
						local88 = null;
					}
					if (local88 != null || local115 != null) {
						@Pc(145) int local145 = Static170.anIntArray189[local44];
						@Pc(149) int local149 = Static234.anIntArray232[local44];
						@Pc(163) int local163 = (local115 == null ? 0 : local145) + (local88 == null ? 0 : local149);
						@Pc(165) int local165 = 0;
						@Pc(167) int local167 = 0;
						@Pc(175) int local175 = local88 == null ? -1 : local88.anInt6871;
						@Pc(183) int local183 = local115 == null ? -1 : local115.anInt3523;
						@Pc(186) int[] local186 = new int[local163];
						@Pc(189) int[] local189 = new int[local163];
						@Pc(192) int[] local192 = new int[local163];
						@Pc(195) int[] local195 = new int[local163];
						@Pc(198) int[] local198 = new int[local163];
						@Pc(201) int[] local201 = new int[local163];
						@Pc(216) int[] local216 = local88 == null || local88.anInt6864 == -1 ? null : new int[local163];
						@Pc(220) int local220;
						if (local88 == null) {
							local167 = local149;
						} else {
							for (local220 = 0; local220 < local149; local220++) {
								local186[local165] = Static186.anIntArrayArray17[local44][local167];
								local189[local165] = Static551.anIntArrayArray49[local44][local167];
								local192[local165] = Static182.anIntArrayArray15[local44][local167];
								local198[local165] = local175;
								local201[local165] = local88.anInt6870;
								local195[local165] = local88.anInt6869;
								if (local216 != null) {
									local216[local165] = local88.anInt6864;
								}
								local165++;
								local167++;
							}
							if (!this.aBoolean278 && arg4 == 0) {
								Static374.method5640(local3, local9, local88.anInt6862, local88.anInt6865 * 8, local88.anInt6873);
							}
						}
						if (local115 != null) {
							for (local220 = 0; local220 < local145; local220++) {
								local186[local165] = Static186.anIntArrayArray17[local44][local167];
								local189[local165] = Static551.anIntArrayArray49[local44][local167];
								local192[local165] = Static182.anIntArrayArray15[local44][local167];
								local198[local165] = local183;
								local201[local165] = local115.anInt3517;
								local195[local165] = arg0[local3][local9];
								if (local216 != null) {
									local216[local165] = local195[local165];
								}
								local167++;
								local165++;
							}
						}
						local220 = this.anIntArray186.length;
						@Pc(382) int[] local382 = new int[local220];
						@Pc(385) int[] local385 = new int[local220];
						@Pc(397) int[] local397 = arg5 == null ? null : new int[local220];
						@Pc(409) int[] local409 = arg5 == null && arg3 == null ? null : new int[local220];
						@Pc(418) int local418;
						@Pc(423) int local423;
						@Pc(521) int local521;
						@Pc(530) int local530;
						for (@Pc(411) int local411 = 0; local411 < local220; local411++) {
							local418 = this.anIntArray186[local411];
							local423 = this.anIntArray185[local411];
							if (local53 == 0) {
								local382[local411] = local418;
								local385[local411] = local423;
							} else if (local53 == 1) {
								local382[local411] = local423;
								local385[local411] = 512 - local418;
							} else if (local53 == 2) {
								local382[local411] = 512 - local418;
								local385[local411] = 512 - local423;
							} else if (local53 == 3) {
								local382[local411] = 512 - local423;
								local385[local411] = local418;
							}
							if (local397 != null && Static270.aBooleanArrayArray3[local44][local411]) {
								local521 = local382[local411] + (local3 << 9);
								local530 = (local9 << 9) + local385[local411];
								local397[local411] = arg5.method8077(local521, local530) - arg2.method8077(local521, local530);
							}
							if (local409 != null) {
								if (arg5 != null && !Static270.aBooleanArrayArray3[local44][local411]) {
									local521 = (local3 << 9) + local382[local411];
									local530 = local385[local411] + (local9 << 9);
									local409[local411] = arg2.method8077(local521, local530) - arg5.method8077(local521, local530);
								} else if (arg3 != null && !Static514.aBooleanArrayArray5[local44][local411]) {
									local521 = local382[local411] + (local3 << 9);
									local530 = local385[local411] + (local9 << 9);
									local409[local411] = arg3.method8077(local521, local530) - arg2.method8077(local521, local530);
								}
							}
						}
						local418 = arg2.method8080(local3, local9);
						local423 = arg2.method8080(local3 + 1, local9);
						local521 = arg2.method8080(local3 + 1, local9 + 1);
						local530 = arg2.method8080(local3, local9 + 1);
						@Pc(674) boolean local674 = Static180.method3417(1, local3, local9);
						if (local674 && arg4 > 1 || !local674 && arg4 > 0) {
							@Pc(695) boolean local695 = true;
							if (local115 != null && !local115.aBoolean280) {
								local695 = false;
							} else if (local75 == 0 && local44 != 0) {
								local695 = false;
							} else if (local64 > 0 && local117 != null && !local117.aBoolean513) {
								local695 = false;
							}
							if (local695 && local418 == local423 && local418 == local521 && local530 == local418) {
								this.aByteArrayArrayArray12[arg4][local3][local9] = (byte) (this.aByteArrayArrayArray12[arg4][local3][local9] | 0x4);
							}
						}
						@Pc(783) int local783 = 0;
						@Pc(785) int local785 = 0;
						@Pc(787) int local787 = 0;
						if (this.aBoolean278) {
							local783 = Static547.method7749(local3, local9);
							local785 = Static435.method6607(local3, local9);
							local787 = Static395.method6084(local3, local9);
						}
						arg2.method8081(local3, local9, local382, local397, local385, local409, local186, local189, local192, local195, local216, local198, local201, local783, local785, local787);
						Static334.method5176(arg4, local3, local9);
					}
				}
			}
		}
		if (false) {
			this.aByteArrayArrayArray9 = null;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(B[[II)V")
	public final void method3282(@OriginalArg(1) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray10[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt3492 + 1; local12++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt3494 + 1; local18++) {
				local10[local12][local18] += arg0[local12][local18];
			}
		}
		if (-48 != -48) {
			this.method3287((int[][]) null, (Class96) null, 34, (Class75) null, (Class96) null, -72, (Class96) null);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!jc;III[Lclient!uda;II)V")
	public final void method3283(@OriginalArg(0) Class6_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class356[] arg4, @OriginalArg(5) int arg5) {
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(25) int local25;
		if (!this.aBoolean278) {
			for (local6 = 0; local6 < 4; local6++) {
				@Pc(12) Class356 local12 = arg4[local6];
				for (local14 = 0; local14 < 64; local14++) {
					for (local18 = 0; local18 < 64; local18++) {
						local25 = arg2 + local14;
						@Pc(29) int local29 = arg5 + local18;
						if (local25 >= 0 && local25 < this.anInt3492 && local29 >= 0 && this.anInt3494 > local29) {
							local12.method8393(local25, local29);
						}
					}
				}
			}
		}
		local6 = arg2 + arg3;
		@Pc(88) int local88 = arg5 + arg1;
		for (local14 = 0; local14 < this.anInt3486; local14++) {
			for (local18 = 0; local18 < 64; local18++) {
				for (local25 = 0; local25 < 64; local25++) {
					this.method3286(arg2 + local18, false, 0, 0, local14, 0, arg0, local25 + local88, local6 + local18, arg5 + local25);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIII)V")
	public final void method3284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9;
		for (@Pc(3) int local3 = arg2; local3 < arg2 + arg0; local3++) {
			for (local9 = arg3; local9 < arg4 + arg3; local9++) {
				if (local9 >= 0 && local9 < this.anInt3492 && local3 >= 0 && local3 < this.anInt3494) {
					this.anIntArrayArrayArray10[arg1][local9][local3] = arg1 <= 0 ? 0 : this.anIntArrayArrayArray10[arg1 - 1][local9][local3] - 960;
				}
			}
		}
		if (arg3 > 0 && this.anInt3492 > arg3) {
			for (local9 = arg2 + 1; local9 < arg2 + arg0; local9++) {
				if (local9 >= 0 && this.anInt3494 > local9) {
					this.anIntArrayArrayArray10[arg1][arg3][local9] = this.anIntArrayArrayArray10[arg1][arg3 - 1][local9];
				}
			}
		}
		if (arg2 > 0 && this.anInt3494 > arg2) {
			for (local9 = arg3 + 1; local9 < arg4 + arg3; local9++) {
				if (local9 >= 0 && local9 < this.anInt3492) {
					this.anIntArrayArrayArray10[arg1][local9][arg2] = this.anIntArrayArrayArray10[arg1][local9][arg2 - 1];
				}
			}
		}
		if (arg3 < 0 || arg2 < 0 || arg3 >= this.anInt3492 || arg2 >= this.anInt3494) {
			return;
		}
		if (arg1 == 0) {
			if (arg3 > 0 && this.anIntArrayArrayArray10[arg1][arg3 - 1][arg2] != 0) {
				this.anIntArrayArrayArray10[arg1][arg3][arg2] = this.anIntArrayArrayArray10[arg1][arg3 - 1][arg2];
				return;
			}
			if (arg2 > 0 && this.anIntArrayArrayArray10[arg1][arg3][arg2 - 1] != 0) {
				this.anIntArrayArrayArray10[arg1][arg3][arg2] = this.anIntArrayArrayArray10[arg1][arg3][arg2 - 1];
				return;
			}
			if (arg3 > 0 && arg2 > 0 && this.anIntArrayArrayArray10[arg1][arg3 - 1][arg2 - 1] != 0) {
				this.anIntArrayArrayArray10[arg1][arg3][arg2] = this.anIntArrayArrayArray10[arg1][arg3 - 1][arg2 - 1];
				return;
			}
			return;
		}
		if (arg3 > 0 && this.anIntArrayArrayArray10[arg1 - 1][arg3 - 1][arg2] != this.anIntArrayArrayArray10[arg1][arg3 - 1][arg2]) {
			this.anIntArrayArrayArray10[arg1][arg3][arg2] = this.anIntArrayArrayArray10[arg1][arg3 - 1][arg2];
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray10[arg1 - 1][arg3][arg2 - 1] != this.anIntArrayArrayArray10[arg1][arg3][arg2 - 1]) {
			this.anIntArrayArrayArray10[arg1][arg3][arg2] = this.anIntArrayArrayArray10[arg1][arg3][arg2 - 1];
			return;
		}
		if (arg3 > 0 && arg2 > 0 && this.anIntArrayArrayArray10[arg1][arg3 - 1][arg2 - 1] != this.anIntArrayArrayArray10[arg1 - 1][arg3 - 1][arg2 - 1]) {
			this.anIntArrayArrayArray10[arg1][arg3][arg2] = this.anIntArrayArrayArray10[arg1][arg3 - 1][arg2 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "([Lclient!uda;Lclient!ha;B[[[I)V")
	public final void method3285(@OriginalArg(0) Class356[] arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (!this.aBoolean278) {
			for (local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt3492; local10++) {
					for (local14 = 0; local14 < this.anInt3494; local14++) {
						if ((Static272.aByteArrayArrayArray2[local6][local10][local14] & 0x1) != 0) {
							@Pc(33) int local33 = local6;
							if ((Static272.aByteArrayArrayArray2[1][local10][local14] & 0x2) != 0) {
								local33 = local6 - 1;
							}
							if (local33 >= 0) {
								arg0[local33].method8387(local10, local14);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt3486; local6++) {
			local10 = 0;
			local14 = 0;
			if (!this.aBoolean278) {
				if (Static58.aBoolean47) {
					local10 = 2;
				}
				if (Static30.aBoolean33) {
					local14 = 8;
				}
				if (Static102.anInt2052 != 0) {
					if (local6 == 0 | Static28.aBoolean29) {
						local14 |= 0x10;
					}
					local10 |= 0x1;
				}
			}
			if (Static58.aBoolean47) {
				local14 |= 0x7;
			}
			if (!Static537.aBoolean669) {
				local14 |= 0x20;
			}
			@Pc(186) int[][] local186 = arg2 == null || local6 >= arg2.length ? this.anIntArrayArrayArray10[local6] : arg2[local6];
			Static15.method203(local6, arg1.method6697(this.anInt3492, this.anInt3494, this.anIntArrayArrayArray10[local6], local186, local10, local14));
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZIIIILclient!jc;IIII)V")
	private void method3286(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class6_Sub15 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg5 == 1) {
			arg2 = 1;
		} else if (arg5 == 2) {
			arg2 = 1;
			arg3 = 1;
		} else if (arg5 == 3) {
			arg3 = 1;
		}
		@Pc(89) int local89;
		if (arg0 < 0 || this.anInt3492 <= arg0 || arg9 < 0 || arg9 >= this.anInt3494) {
			while (true) {
				local89 = arg6.method3030();
				if (local89 == 0) {
					return;
				}
				if (local89 == 1) {
					arg6.method3030();
					return;
				}
				if (local89 <= 49) {
					arg6.method3030();
				}
			}
			return;
		}
		if (!this.aBoolean278 && !arg1) {
			Static272.aByteArrayArrayArray2[arg4][arg0][arg9] = 0;
		}
		while (true) {
			local89 = arg6.method3030();
			if (local89 == 0) {
				if (this.aBoolean278) {
					this.anIntArrayArrayArray10[0][arg0 + arg3][arg9 + arg2] = 0;
					return;
				} else if (arg4 == 0) {
					this.anIntArrayArrayArray10[0][arg3 + arg0][arg2 + arg9] = -Static171.method3329(arg7 + 556238, arg8 + 932731) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray10[arg4][arg0 + arg3][arg9 + arg2] = this.anIntArrayArrayArray10[arg4 - 1][arg3 + arg0][arg9 + arg2] - 960;
					return;
				}
			}
			if (local89 == 1) {
				@Pc(187) int local187 = arg6.method3030();
				if (!this.aBoolean278) {
					if (local187 == 1) {
						local187 = 0;
					}
					if (arg4 != 0) {
						this.anIntArrayArrayArray10[arg4][arg3 + arg0][arg2 + arg9] = this.anIntArrayArrayArray10[arg4 - 1][arg0 + arg3][arg9 + arg2] - (local187 * 8 << 2);
						return;
					}
					this.anIntArrayArrayArray10[0][arg0 + arg3][arg9 + arg2] = -local187 * 8 << 2;
					return;
				}
				this.anIntArrayArrayArray10[0][arg0 + arg3][arg9 + arg2] = local187 * 8 << 2;
				return;
			}
			if (local89 <= 49) {
				if (arg1) {
					arg6.method3030();
				} else {
					this.aByteArrayArrayArray10[arg4][arg0][arg9] = arg6.method3027();
					this.aByteArrayArrayArray14[arg4][arg0][arg9] = (byte) ((local89 - 2) / 4);
					this.aByteArrayArrayArray11[arg4][arg0][arg9] = (byte) (arg5 + local89 - 2 & 0x3);
				}
			} else if (local89 <= 81) {
				if (!this.aBoolean278 && !arg1) {
					Static272.aByteArrayArrayArray2[arg4][arg0][arg9] = (byte) (local89 - 49);
				}
			} else if (!arg1) {
				this.aByteArrayArrayArray9[arg4][arg0][arg9] = (byte) (local89 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "([[ILclient!s;ILclient!ha;Lclient!s;ILclient!s;)V")
	private void method3287(@OriginalArg(0) int[][] arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class75 arg3, @OriginalArg(4) Class96 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray14[arg2];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray11[arg2];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray9[arg2];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray10[arg2];
		for (@Pc(27) int local27 = arg5; local27 < this.anInt3492; local27++) {
			@Pc(44) int local44 = this.anInt3492 - 1 > local27 ? local27 + 1 : local27;
			for (@Pc(46) int local46 = 0; local46 < this.anInt3494; local46++) {
				@Pc(63) int local63 = local46 < this.anInt3494 - 1 ? local46 + 1 : local46;
				if (Static591.anInt9403 == -1 || Static596.method8244(local46, local27, Static591.anInt9403, arg2)) {
					@Pc(82) boolean local82 = false;
					@Pc(84) boolean local84 = false;
					@Pc(87) boolean[] local87 = new boolean[4];
					@Pc(93) int local93 = local10[local27][local46];
					@Pc(99) int local99 = local15[local27][local46];
					@Pc(107) int local107 = local25[local27][local46] & 0xFF;
					@Pc(115) int local115 = local20[local27][local46] & 0xFF;
					@Pc(123) int local123 = local20[local27][local63] & 0xFF;
					@Pc(131) int local131 = local20[local44][local63] & 0xFF;
					@Pc(139) int local139 = local20[local44][local46] & 0xFF;
					if (local107 != 0 || local115 != 0) {
						@Pc(166) Class249 local166 = local107 == 0 ? null : this.aClass245_3.method5974(local107 - 1);
						if (local93 == 0 && local166 == null) {
							local93 = 12;
						}
						@Pc(190) Class117 local190 = local115 == 0 ? null : this.aClass255_2.method6216(local115 - 1);
						@Pc(192) Class249 local192 = local166;
						if (local166 != null) {
							if (local166.anInt6869 == -1 && local166.anInt6864 == -1) {
								local192 = local166;
								local166 = null;
							} else if (local190 != null && local93 != 0) {
								local84 = local166.aBoolean514;
							}
						}
						@Pc(332) int local332;
						@Pc(348) int local348;
						@Pc(432) int local432;
						@Pc(445) int local445;
						if ((local93 == 0 || local93 == 12) && local27 > 0 && local46 > 0 && this.anInt3492 > local27 && local46 < this.anInt3494) {
							@Pc(292) int local292 = local20[local44][local46 - 1] == local115 ? 1 : -1;
							@Pc(310) int local310 = local115 == local20[local44][local63] ? 1 : -1;
							local332 = local115 == local20[local27 - 1][local46 - 1] ? 1 : -1;
							local348 = local115 == local20[local27 - 1][local63] ? 1 : -1;
							if (local20[local27][local46 - 1] == local115) {
								local292++;
								local332++;
							} else {
								local292--;
								local332--;
							}
							if (local20[local44][local46] == local115) {
								local292++;
								local310++;
							} else {
								local310--;
								local292--;
							}
							if (local115 == local20[local27][local63]) {
								local348++;
								local310++;
							} else {
								local310--;
								local348--;
							}
							if (local115 == local20[local27 - 1][local46]) {
								local332++;
								local348++;
							} else {
								local348--;
								local332--;
							}
							local432 = local332 - local310;
							if (local432 < 0) {
								local432 = -local432;
							}
							local445 = local292 - local348;
							if (local445 < 0) {
								local445 = -local445;
							}
							if (local432 == local445) {
								local432 = arg4.method8080(local27, local46) - arg4.method8080(local44, local63);
								if (local432 < 0) {
									local432 = -local432;
								}
								local445 = arg4.method8080(local44, local46) - arg4.method8080(local27, local63);
								if (local445 < 0) {
									local445 = -local445;
								}
							}
							local99 = local432 >= local445 ? 0 : 1;
						}
						for (local332 = 0; local332 < 13; local332++) {
							Static590.anIntArray610[local332] = -1;
							Static42.anIntArray40[local332] = 1;
						}
						@Pc(542) boolean[] local542 = local166 != null && local166.aBoolean514 ? Static620.aBooleanArrayArray7[local93] : Static266.aBooleanArrayArray2[local93];
						this.method3278(local87, local10, this.anInt3494, local190, local15, arg3, local27, local46, this.anInt3492, local166, local25, local99, local93);
						@Pc(578) boolean local578 = local166 != null && local166.anInt6864 != local166.anInt6869;
						if (!local578) {
							for (local348 = 0; local348 < 8; local348++) {
								if (Static590.anIntArray610[local348] >= 0 && Static683.anIntArray696[local348] != Static646.anIntArray508[local348]) {
									local578 = true;
									break;
								}
							}
						}
						if (!local542[local99 + 1 & 0x3]) {
							local87[1] = Static385.method5930(local87[1], (Static42.anIntArray40[2] & Static42.anIntArray40[4]) == 0);
						}
						if (!local542[local99 + 3 & 0x3]) {
							local87[3] = Static385.method5930(local87[3], (Static42.anIntArray40[6] & Static42.anIntArray40[0]) == 0);
						}
						if (!local542[local99 & 0x3]) {
							local87[0] = Static385.method5930(local87[0], (Static42.anIntArray40[2] & Static42.anIntArray40[0]) == 0);
						}
						if (!local542[local99 + 2 & 0x3]) {
							local87[2] = Static385.method5930(local87[2], (Static42.anIntArray40[6] & Static42.anIntArray40[4]) == 0);
						}
						if (!local84 && (local93 == 0 || local93 == 12)) {
							if (local87[0] && !local87[1] && !local87[2] && local87[3]) {
								local93 = local93 == 0 ? 13 : 14;
								local87[0] = local87[3] = false;
								local99 = 0;
							} else if (local87[0] && local87[1] && !local87[2] && !local87[3]) {
								local99 = 3;
								local93 = local93 == 0 ? 13 : 14;
								local87[0] = local87[1] = false;
							} else if (!local87[0] && local87[1] && local87[2] && !local87[3]) {
								local93 = local93 == 0 ? 13 : 14;
								local99 = 2;
								local87[1] = local87[2] = false;
							} else if (!local87[0] && !local87[1] && local87[2] && local87[3]) {
								local93 = local93 == 0 ? 13 : 14;
								local87[2] = local87[3] = false;
								local99 = 1;
							}
						}
						@Pc(967) boolean local967 = !local84 && !local87[0] && !local87[2] && !local87[1] && !local87[3];
						@Pc(969) int[] local969 = null;
						@Pc(1007) int[] local1007;
						@Pc(1011) int[] local1011;
						@Pc(990) int[] local990;
						if (local967) {
							local445 = local166 == null ? 0 : Static234.anIntArray232[local93];
							local1011 = Static551.anIntArrayArray49[local93];
							local1007 = Static186.anIntArrayArray17[local93];
							local990 = Static182.anIntArrayArray15[local93];
							local432 = local190 == null ? 0 : Static170.anIntArray189[local93];
						} else if (local84) {
							local445 = local166 == null ? 0 : Static455.anIntArray497[local93];
							local990 = Static653.anIntArrayArray55[local93];
							local432 = local190 == null ? 0 : Static118.anIntArray123[local93];
							local969 = Static200.anIntArrayArray20[local93];
							local1007 = Static186.anIntArrayArray16[local93];
							local1011 = Static545.anIntArrayArray47[local93];
						} else {
							local969 = Static148.anIntArrayArray13[local93];
							local445 = local166 == null ? 0 : Static287.anIntArray282[local93];
							local990 = Static407.anIntArrayArray40[local93];
							local1007 = Static643.anIntArrayArray18[local93];
							local432 = local190 == null ? 0 : Static427.anIntArray470[local93];
							local1011 = Static619.anIntArrayArray54[local93];
						}
						@Pc(1081) int local1081 = local432 + local445;
						if (local1081 <= 0) {
							Static334.method5176(arg2, local27, local46);
						} else {
							if (local87[0]) {
								local1081++;
							}
							if (local87[2]) {
								local1081++;
							}
							if (local87[1]) {
								local1081++;
							}
							if (local87[3]) {
								local1081++;
							}
							@Pc(1123) int local1123 = 0;
							@Pc(1125) int local1125 = 0;
							@Pc(1129) int local1129 = local1081 * 3;
							@Pc(1137) int[] local1137 = local578 ? new int[local1129] : null;
							@Pc(1140) int[] local1140 = new int[local1129];
							@Pc(1143) int[] local1143 = new int[local1129];
							@Pc(1146) int[] local1146 = new int[local1129];
							@Pc(1149) int[] local1149 = new int[local1129];
							@Pc(1152) int[] local1152 = new int[local1129];
							@Pc(1160) int[] local1160 = arg1 == null ? null : new int[local1129];
							@Pc(1172) int[] local1172 = arg1 == null && arg6 == null ? null : new int[local1129];
							@Pc(1174) int local1174 = -1;
							@Pc(1176) int local1176 = -1;
							@Pc(1178) int local1178 = 256;
							@Pc(1234) boolean local1234;
							@Pc(1226) int local1226;
							@Pc(1228) int local1228;
							@Pc(1478) int local1478;
							@Pc(1484) int local1484;
							@Pc(1492) int local1492;
							@Pc(1497) int local1497;
							@Pc(1514) int local1514;
							@Pc(1502) int local1502;
							@Pc(1512) int local1512;
							@Pc(1577) int local1577;
							@Pc(1583) int local1583;
							@Pc(1324) byte local1324;
							if (local166 != null) {
								local1178 = local166.anInt6870;
								local1176 = local166.anInt6871;
								local1174 = local166.anInt6869;
								local1226 = Static18.method228(arg3, local166);
								for (local1228 = 0; local1228 < local445; local1228++) {
									local1234 = false;
									if (local87[-local99 & 0x3] && local969[0] == local1123) {
										Static488.anIntArray519[0] = local1007[local1123];
										Static488.anIntArray519[1] = 1;
										Static488.anIntArray519[2] = local990[local1123];
										Static488.anIntArray519[3] = 1;
										Static488.anIntArray519[4] = local1011[local1123];
										local1324 = 6;
										Static488.anIntArray519[5] = local990[local1123];
									} else if (local87[2 - local99 & 0x3] && local969[2] == local1123) {
										Static488.anIntArray519[0] = local1007[local1123];
										Static488.anIntArray519[1] = 5;
										Static488.anIntArray519[2] = local990[local1123];
										Static488.anIntArray519[3] = 5;
										Static488.anIntArray519[4] = local1011[local1123];
										local1324 = 6;
										Static488.anIntArray519[5] = local990[local1123];
									} else if (local87[1 - local99 & 0x3] && local969[1] == local1123) {
										Static488.anIntArray519[0] = local1007[local1123];
										Static488.anIntArray519[1] = 3;
										Static488.anIntArray519[2] = local990[local1123];
										Static488.anIntArray519[3] = 3;
										Static488.anIntArray519[4] = local1011[local1123];
										Static488.anIntArray519[5] = local990[local1123];
										local1324 = 6;
									} else if (local87[3 - local99 & 0x3] && local1123 == local969[3]) {
										Static488.anIntArray519[0] = local1007[local1123];
										Static488.anIntArray519[1] = 7;
										Static488.anIntArray519[2] = local990[local1123];
										Static488.anIntArray519[3] = 7;
										Static488.anIntArray519[4] = local1011[local1123];
										Static488.anIntArray519[5] = local990[local1123];
										local1324 = 6;
									} else {
										Static488.anIntArray519[0] = local1007[local1123];
										Static488.anIntArray519[1] = local1011[local1123];
										local1324 = 3;
										Static488.anIntArray519[2] = local990[local1123];
									}
									for (local1478 = 0; local1478 < local1324; local1478++) {
										local1484 = Static488.anIntArray519[local1478];
										local1492 = local1484 - local99 * 2 & 0x7;
										local1497 = this.anIntArray186[local1484];
										local1502 = this.anIntArray185[local1484];
										if (local99 == 1) {
											local1512 = 512 - local1497;
											local1514 = local1502;
										} else if (local99 == 2) {
											local1514 = 512 - local1497;
											local1512 = 512 - local1502;
										} else if (local99 == 3) {
											local1514 = 512 - local1502;
											local1512 = local1497;
										} else {
											local1512 = local1502;
											local1514 = local1497;
										}
										local1140[local1125] = local1514;
										local1143[local1125] = local1512;
										if (local1160 != null && Static270.aBooleanArrayArray3[local93][local1484]) {
											local1577 = local1514 + (local27 << 9);
											local1583 = (local46 << 9) + local1512;
											local1160[local1125] = arg1.method8077(local1577, local1583) - arg4.method8077(local1577, local1583);
										}
										if (local1172 != null) {
											if (arg1 != null && !Static270.aBooleanArrayArray3[local93][local1484]) {
												local1577 = (local27 << 9) + local1514;
												local1583 = local1512 + (local46 << 9);
												local1172[local1125] = arg4.method8077(local1577, local1583) - arg1.method8077(local1577, local1583);
											} else if (arg6 != null && !Static514.aBooleanArrayArray5[local93][local1484]) {
												local1577 = local1514 + (local27 << 9);
												local1583 = (local46 << 9) + local1512;
												local1172[local1125] = arg6.method8077(local1577, local1583) - arg4.method8077(local1577, local1583);
											}
										}
										if (local1484 < 8 && Static590.anIntArray610[local1492] > local166.anInt6868) {
											if (local1137 != null) {
												local1137[local1125] = Static646.anIntArray508[local1492];
											}
											local1152[local1125] = Static463.anIntArray609[local1492];
											local1149[local1125] = Static487.anIntArray691[local1492];
											local1146[local1125] = Static683.anIntArray696[local1492];
										} else {
											if (local1137 != null) {
												local1137[local1125] = local1226;
											}
											local1149[local1125] = local166.anInt6871;
											local1152[local1125] = local166.anInt6870;
											local1146[local1125] = local1174;
										}
										local1125++;
									}
									local1123++;
								}
								if (!this.aBoolean278 && arg2 == 0) {
									Static374.method5640(local27, local46, local166.anInt6862, local166.anInt6865 * 8, local166.anInt6873);
								}
								if (local93 != 12 && local166.anInt6869 != -1 && local166.aBoolean512) {
									local82 = true;
								}
							} else if (local967) {
								local1123 = Static234.anIntArray232[local93];
							} else if (local84) {
								local1123 = Static455.anIntArray497[local93];
							} else {
								local1123 = Static287.anIntArray282[local93];
							}
							if (local190 != null) {
								if (local123 == 0) {
									local123 = local115;
								}
								if (local131 == 0) {
									local131 = local115;
								}
								if (local139 == 0) {
									local139 = local115;
								}
								@Pc(1836) Class117 local1836 = this.aClass255_2.method6216(local115 - 1);
								@Pc(1844) Class117 local1844 = this.aClass255_2.method6216(local123 - 1);
								@Pc(1852) Class117 local1852 = this.aClass255_2.method6216(local131 - 1);
								@Pc(1860) Class117 local1860 = this.aClass255_2.method6216(local139 - 1);
								for (local1492 = 0; local1492 < local432; local1492++) {
									local1234 = false;
									if (local87[-local99 & 0x3] && local1123 == local969[0]) {
										Static488.anIntArray519[0] = local1007[local1123];
										Static488.anIntArray519[1] = 1;
										Static488.anIntArray519[2] = local990[local1123];
										Static488.anIntArray519[3] = 1;
										Static488.anIntArray519[4] = local1011[local1123];
										Static488.anIntArray519[5] = local990[local1123];
										local1324 = 6;
									} else if (local87[2 - local99 & 0x3] && local969[2] == local1123) {
										Static488.anIntArray519[0] = local1007[local1123];
										Static488.anIntArray519[1] = 5;
										Static488.anIntArray519[2] = local990[local1123];
										Static488.anIntArray519[3] = 5;
										Static488.anIntArray519[4] = local1011[local1123];
										local1324 = 6;
										Static488.anIntArray519[5] = local990[local1123];
									} else if (local87[1 - local99 & 0x3] && local969[1] == local1123) {
										Static488.anIntArray519[0] = local1007[local1123];
										Static488.anIntArray519[1] = 3;
										Static488.anIntArray519[2] = local990[local1123];
										Static488.anIntArray519[3] = 3;
										Static488.anIntArray519[4] = local1011[local1123];
										local1324 = 6;
										Static488.anIntArray519[5] = local990[local1123];
									} else if (local87[3 - local99 & 0x3] && local1123 == local969[3]) {
										Static488.anIntArray519[0] = local1007[local1123];
										Static488.anIntArray519[1] = 7;
										Static488.anIntArray519[2] = local990[local1123];
										Static488.anIntArray519[3] = 7;
										Static488.anIntArray519[4] = local1011[local1123];
										local1324 = 6;
										Static488.anIntArray519[5] = local990[local1123];
									} else {
										Static488.anIntArray519[0] = local1007[local1123];
										Static488.anIntArray519[1] = local1011[local1123];
										local1324 = 3;
										Static488.anIntArray519[2] = local990[local1123];
									}
									local1123++;
									for (local1497 = 0; local1497 < local1324; local1497++) {
										local1514 = Static488.anIntArray519[local1497];
										local1502 = local1514 - local99 * 2 & 0x7;
										local1512 = this.anIntArray186[local1514];
										local1583 = this.anIntArray185[local1514];
										@Pc(2153) int local2153;
										if (local99 == 1) {
											local1577 = local1583;
											local2153 = 512 - local1512;
										} else if (local99 == 2) {
											local2153 = 512 - local1583;
											local1577 = 512 - local1512;
										} else if (local99 == 3) {
											local1577 = 512 - local1583;
											local2153 = local1512;
										} else {
											local1577 = local1512;
											local2153 = local1583;
										}
										local1140[local1125] = local1577;
										local1143[local1125] = local2153;
										@Pc(2207) int local2207;
										@Pc(2213) int local2213;
										if (local1160 != null && Static270.aBooleanArrayArray3[local93][local1514]) {
											local2207 = (local27 << 9) + local1577;
											local2213 = local2153 + (local46 << 9);
											local1160[local1125] = arg1.method8077(local2207, local2213) - arg4.method8077(local2207, local2213);
										}
										if (local1172 != null) {
											if (arg1 != null && !Static270.aBooleanArrayArray3[local93][local1514]) {
												local2207 = local1577 + (local27 << 9);
												local2213 = (local46 << 9) + local2153;
												local1172[local1125] = arg4.method8077(local2207, local2213) - arg1.method8077(local2207, local2213);
											} else if (arg6 != null && !Static514.aBooleanArrayArray5[local93][local1514]) {
												local2207 = (local27 << 9) + local1577;
												local2213 = (local46 << 9) + local2153;
												local1172[local1125] = arg6.method8077(local2207, local2213) - arg4.method8077(local2207, local2213);
											}
										}
										if (local1514 < 8 && Static590.anIntArray610[local1502] >= 0) {
											if (local1137 != null) {
												local1137[local1125] = Static646.anIntArray508[local1502];
											}
											local1152[local1125] = Static463.anIntArray609[local1502];
											local1149[local1125] = Static487.anIntArray691[local1502];
											local1146[local1125] = Static683.anIntArray696[local1502];
										} else {
											if (local84 && Static270.aBooleanArrayArray3[local93][local1514]) {
												local1149[local1125] = local1176;
												local1152[local1125] = local1178;
												local1146[local1125] = local1174;
											} else if (local1577 == 0 && local2153 == 0) {
												local1146[local1125] = arg0[local27][local46];
												local1149[local1125] = local1836.anInt3523;
												local1152[local1125] = local1836.anInt3517;
											} else if (local1577 == 0 && local2153 == 512) {
												local1146[local1125] = arg0[local27][local63];
												local1149[local1125] = local1844.anInt3523;
												local1152[local1125] = local1844.anInt3517;
											} else if (local1577 == 512 && local2153 == 512) {
												local1146[local1125] = arg0[local44][local63];
												local1149[local1125] = local1852.anInt3523;
												local1152[local1125] = local1852.anInt3517;
											} else if (local1577 == 512 && local2153 == 0) {
												local1146[local1125] = arg0[local44][local46];
												local1149[local1125] = local1860.anInt3523;
												local1152[local1125] = local1860.anInt3517;
											} else {
												if (local1577 < 256) {
													if (local2153 < 256) {
														local1149[local1125] = local1836.anInt3523;
														local1152[local1125] = local1836.anInt3517;
													} else {
														local1149[local1125] = local1844.anInt3523;
														local1152[local1125] = local1844.anInt3517;
													}
												} else if (local2153 < 256) {
													local1149[local1125] = local1860.anInt3523;
													local1152[local1125] = local1860.anInt3517;
												} else {
													local1149[local1125] = local1852.anInt3523;
													local1152[local1125] = local1852.anInt3517;
												}
												local2207 = Static88.method1283(arg0[local44][local46], local1577 << 7 >> 9, arg0[local27][local46]);
												local2213 = Static88.method1283(arg0[local44][local63], local1577 << 7 >> 9, arg0[local27][local63]);
												local1146[local1125] = Static88.method1283(local2213, local2153 << 7 >> 9, local2207);
											}
											if (local1137 != null) {
												local1137[local1125] = local1146[local1125];
											}
										}
										local1125++;
									}
								}
								if (local93 != 0 && local190.aBoolean279) {
									local82 = true;
								}
							}
							local1226 = arg4.method8080(local27, local46);
							local1228 = arg4.method8080(local44, local46);
							local1478 = arg4.method8080(local44, local63);
							local1484 = arg4.method8080(local27, local63);
							@Pc(2704) boolean local2704 = Static180.method3417(1, local27, local46);
							if (local2704 && arg2 > 1 || !local2704 && arg2 > 0) {
								@Pc(2726) boolean local2726 = true;
								if (local190 != null && !local190.aBoolean280) {
									local2726 = false;
								} else if (local115 == 0 && local93 != 0) {
									local2726 = false;
								} else if (local107 > 0 && local192 != null && !local192.aBoolean513) {
									local2726 = false;
								}
								if (local2726 && local1228 == local1226 && local1226 == local1478 && local1226 == local1484) {
									this.aByteArrayArrayArray12[arg2][local27][local46] = (byte) (this.aByteArrayArrayArray12[arg2][local27][local46] | 0x4);
								}
							}
							local1497 = 0;
							local1514 = 0;
							local1502 = 0;
							if (this.aBoolean278) {
								local1497 = Static547.method7749(local27, local46);
								local1514 = Static435.method6607(local27, local46);
								local1502 = Static395.method6084(local27, local46);
							}
							arg4.U(local27, local46, local1140, local1160, local1143, local1172, local1146, local1137, local1149, local1152, local1497, local1514, local1502, local82);
							Static334.method5176(arg2, local27, local46);
						}
					}
				}
			}
		}
	}
}
