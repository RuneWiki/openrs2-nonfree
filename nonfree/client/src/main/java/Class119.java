import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qw")
public class Class119 {

	@OriginalMember(owner = "client!qw", name = "D", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "[I")
	private final int[] anIntArray300 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!qw", name = "k", descriptor = "[I")
	private final int[] anIntArray301 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!qw", name = "l", descriptor = "Lclient!ns;")
	private final Class220 aClass220_3;

	@OriginalMember(owner = "client!qw", name = "i", descriptor = "Lclient!cca;")
	private final Class47 aClass47_4;

	@OriginalMember(owner = "client!qw", name = "j", descriptor = "Z")
	public final boolean aBoolean312;

	@OriginalMember(owner = "client!qw", name = "B", descriptor = "I")
	public final int anInt3799;

	@OriginalMember(owner = "client!qw", name = "e", descriptor = "I")
	protected final int anInt3786;

	@OriginalMember(owner = "client!qw", name = "c", descriptor = "I")
	protected final int anInt3784;

	@OriginalMember(owner = "client!qw", name = "h", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!qw", name = "t", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!qw", name = "n", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!qw", name = "w", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!qw", name = "g", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!qw", name = "q", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(IIIZLclient!ns;Lclient!cca;)V")
	protected Class119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class220 arg4, @OriginalArg(5) Class47 arg5) {
		this.aClass220_3 = arg4;
		this.aClass47_4 = arg5;
		this.aBoolean312 = arg3;
		this.anInt3799 = arg0;
		this.anInt3786 = arg2;
		this.anInt3784 = arg1;
		this.aByteArrayArrayArray11 = new byte[this.anInt3799][this.anInt3784][this.anInt3786];
		this.aByteArrayArrayArray13 = new byte[this.anInt3799][this.anInt3784][this.anInt3786];
		this.anIntArrayArrayArray4 = new int[this.anInt3799][this.anInt3784 + 1][this.anInt3786 + 1];
		this.aByteArrayArrayArray14 = new byte[this.anInt3799][this.anInt3784][this.anInt3786];
		this.aByteArrayArrayArray10 = new byte[this.anInt3799][this.anInt3784][this.anInt3786];
		this.aByteArrayArrayArray12 = new byte[this.anInt3799][this.anInt3784 + 1][this.anInt3786 + 1];
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IZIILclient!daa;BIIIII)V")
	private void method3325(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12_Sub8 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg5 == 1) {
			arg3 = 1;
		} else if (arg5 == 2) {
			arg3 = 1;
			arg6 = 1;
		} else if (arg5 == 3) {
			arg6 = 1;
		}
		@Pc(73) int local73;
		if (arg0 < 0 || this.anInt3784 <= arg0 || arg9 < 0 || this.anInt3786 <= arg9) {
			while (true) {
				local73 = arg4.method5216();
				if (local73 == 0) {
					return;
				}
				if (local73 == 1) {
					arg4.method5216();
					return;
				}
				if (local73 <= 49) {
					arg4.method5216();
				}
			}
			return;
		}
		if (!this.aBoolean312 && !arg1) {
			Static387.aByteArrayArrayArray18[arg8][arg0][arg9] = 0;
		}
		while (true) {
			local73 = arg4.method5216();
			if (local73 == 0) {
				if (this.aBoolean312) {
					this.anIntArrayArrayArray4[0][arg6 + arg0][arg9 + arg3] = 0;
					return;
				} else if (arg8 == 0) {
					this.anIntArrayArrayArray4[0][arg0 + arg6][arg3 + arg9] = -Static435.method6625(arg7 + 556238, arg2 + 932731) * 8 << 0;
					return;
				} else {
					this.anIntArrayArrayArray4[arg8][arg6 + arg0][arg3 + arg9] = this.anIntArrayArrayArray4[arg8 - 1][arg0 + arg6][arg3 + arg9] - 240;
					return;
				}
			}
			if (local73 == 1) {
				@Pc(162) int local162 = arg4.method5216();
				if (!this.aBoolean312) {
					if (local162 == 1) {
						local162 = 0;
					}
					if (arg8 != 0) {
						this.anIntArrayArrayArray4[arg8][arg0 + arg6][arg3 + arg9] = this.anIntArrayArrayArray4[arg8 - 1][arg0 + arg6][arg3 + arg9] - (local162 * 8 << 0);
						return;
					}
					this.anIntArrayArrayArray4[0][arg0 + arg6][arg9 + arg3] = -local162 * 8 << 0;
					return;
				}
				this.anIntArrayArrayArray4[0][arg0 + arg6][arg9 + arg3] = local162 * 8 << 0;
				return;
			}
			if (local73 <= 49) {
				if (arg1) {
					arg4.method5216();
				} else {
					this.aByteArrayArrayArray13[arg8][arg0][arg9] = arg4.method5173();
					this.aByteArrayArrayArray11[arg8][arg0][arg9] = (byte) ((local73 - 2) / 4);
					this.aByteArrayArrayArray14[arg8][arg0][arg9] = (byte) (arg5 + local73 - 2 & 0x3);
				}
			} else if (local73 <= 81) {
				if (!this.aBoolean312 && !arg1) {
					Static387.aByteArrayArrayArray18[arg8][arg0][arg9] = (byte) (local73 - 49);
				}
			} else if (!arg1) {
				this.aByteArrayArrayArray10[arg8][arg0][arg9] = (byte) (local73 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IILclient!daa;I[Lclient!ld;IZ)V")
	public final void method3326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class12_Sub8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class184[] arg4, @OriginalArg(5) int arg5) {
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(25) int local25;
		if (!this.aBoolean312) {
			for (local6 = 0; local6 < 4; local6++) {
				@Pc(12) Class184 local12 = arg4[local6];
				for (local14 = 0; local14 < 64; local14++) {
					for (local18 = 0; local18 < 64; local18++) {
						local25 = arg1 + local14;
						@Pc(29) int local29 = local18 + arg3;
						if (local25 >= 0 && local25 < this.anInt3784 && local29 >= 0 && this.anInt3786 > local29) {
							local12.method4599(local25, local29);
						}
					}
				}
			}
		}
		local6 = arg5 + arg1;
		@Pc(78) int local78 = arg0 + arg3;
		for (local14 = 0; local14 < this.anInt3799; local14++) {
			for (local18 = 0; local18 < 64; local18++) {
				for (local25 = 0; local25 < 64; local25++) {
					this.method3325(arg1 + local18, false, local6 + local18, 0, arg2, 0, 0, local25 + local78, local14, arg3 + local25);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IILclient!qa;Lclient!om;ZI[[BII[[BLclient!go;[Z[[BI)V")
	private void method3327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(3) Class231 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) Class120 arg9, @OriginalArg(11) boolean[] arg10, @OriginalArg(12) byte[][] arg11, @OriginalArg(13) int arg12) {
		@Pc(18) boolean[] local18 = arg3 != null && arg3.aBoolean486 ? Static115.aBooleanArrayArray2[arg12] : Static154.aBooleanArrayArray4[arg12];
		@Pc(40) int local40;
		@Pc(50) Class231 local50;
		@Pc(67) byte local67;
		@Pc(83) int local83;
		@Pc(88) int local88;
		if (arg0 > 0) {
			if (arg4 > 0) {
				local40 = arg8[arg4 - 1][arg0 - 1] & 0xFF;
				if (local40 > 0) {
					local50 = this.aClass220_3.method5376(local40 - 1);
					if (local50.anInt6664 != -1 && local50.aBoolean486) {
						local67 = arg5[arg4 - 1][arg0 - 1];
						local83 = arg11[arg4 - 1][arg0 - 1] * 2 + 4 & 0x7;
						local88 = Static390.method6182(local50, arg2);
						if (Static214.aBooleanArrayArray5[local67][local83]) {
							Static66.anIntArray172[0] = local50.anInt6664;
							Static389.anIntArray490[0] = local88;
							Static167.anIntArray302[0] = arg2.method5843() ? local50.anInt6668 : local50.anInt6675;
							Static429.anIntArray598[0] = local50.anInt6659;
							Static425.anIntArray596[0] = local50.anInt6657;
							Static339.anIntArray450[0] = 256;
						}
					}
				}
			}
			if (arg6 - 1 > arg4) {
				local40 = arg8[arg4 + 1][arg0 - 1] & 0xFF;
				if (local40 > 0) {
					local50 = this.aClass220_3.method5376(local40 - 1);
					if (local50.anInt6664 != -1 && local50.aBoolean486) {
						local67 = arg5[arg4 + 1][arg0 - 1];
						local83 = arg11[arg4 + 1][arg0 - 1] * 2 + 6 & 0x7;
						local88 = Static390.method6182(local50, arg2);
						if (Static214.aBooleanArrayArray5[local67][local83]) {
							Static66.anIntArray172[2] = local50.anInt6664;
							Static389.anIntArray490[2] = local88;
							Static167.anIntArray302[2] = arg2.method5843() ? local50.anInt6668 : local50.anInt6675;
							Static429.anIntArray598[2] = local50.anInt6659;
							Static425.anIntArray596[2] = local50.anInt6657;
							Static339.anIntArray450[2] = 512;
						}
					}
				}
			}
		}
		if (arg1 - 1 > arg0) {
			if (arg4 > 0) {
				local40 = arg8[arg4 - 1][arg0 + 1] & 0xFF;
				if (local40 > 0) {
					local50 = this.aClass220_3.method5376(local40 - 1);
					if (local50.anInt6664 != -1 && local50.aBoolean486) {
						local67 = arg5[arg4 - 1][arg0 + 1];
						local83 = arg11[arg4 - 1][arg0 + 1] * 2 + 2 & 0x7;
						local88 = Static390.method6182(local50, arg2);
						if (Static214.aBooleanArrayArray5[local67][local83]) {
							Static66.anIntArray172[6] = local50.anInt6664;
							Static389.anIntArray490[6] = local88;
							Static167.anIntArray302[6] = arg2.method5843() ? local50.anInt6668 : local50.anInt6675;
							Static429.anIntArray598[6] = local50.anInt6659;
							Static425.anIntArray596[6] = local50.anInt6657;
							Static339.anIntArray450[6] = 64;
						}
					}
				}
			}
			if (arg6 - 1 > arg4) {
				local40 = arg8[arg4 + 1][arg0 + 1] & 0xFF;
				if (local40 > 0) {
					local50 = this.aClass220_3.method5376(local40 - 1);
					if (local50.anInt6664 != -1 && local50.aBoolean486) {
						local67 = arg5[arg4 + 1][arg0 + 1];
						local83 = arg11[arg4 + 1][arg0 + 1] * 2 & 0x7;
						local88 = Static390.method6182(local50, arg2);
						if (Static214.aBooleanArrayArray5[local67][local83]) {
							Static66.anIntArray172[4] = local50.anInt6664;
							Static389.anIntArray490[4] = local88;
							Static167.anIntArray302[4] = arg2.method5843() ? local50.anInt6668 : local50.anInt6675;
							Static429.anIntArray598[4] = local50.anInt6659;
							Static425.anIntArray596[4] = local50.anInt6657;
							Static339.anIntArray450[4] = 128;
						}
					}
				}
			}
		}
		@Pc(541) int local541;
		@Pc(546) int local546;
		@Pc(548) int local548;
		@Pc(510) byte local510;
		if (arg0 > 0) {
			local40 = arg8[arg4][arg0 - 1] & 0xFF;
			if (local40 > 0) {
				local50 = this.aClass220_3.method5376(local40 - 1);
				if (local50.anInt6664 != -1) {
					local67 = arg5[arg4][arg0 - 1];
					local510 = arg11[arg4][arg0 - 1];
					if (local50.aBoolean486) {
						local88 = 2;
						local541 = local510 * 2 + 4;
						local546 = Static390.method6182(local50, arg2);
						for (local548 = 0; local548 < 3; local548++) {
							local541 &= 0x7;
							local88 &= 0x7;
							if (Static214.aBooleanArrayArray5[local67][local541] && Static425.anIntArray596[local88] <= local50.anInt6657) {
								Static66.anIntArray172[local88] = local50.anInt6664;
								Static389.anIntArray490[local88] = local546;
								Static167.anIntArray302[local88] = arg2.method5843() ? local50.anInt6668 : local50.anInt6675;
								Static429.anIntArray598[local88] = local50.anInt6659;
								if (Static425.anIntArray596[local88] == local50.anInt6657) {
									Static339.anIntArray450[local88] |= 0x20;
								} else {
									Static339.anIntArray450[local88] = 32;
								}
								Static425.anIntArray596[local88] = local50.anInt6657;
							}
							local541++;
							local88--;
						}
						if (!local18[arg7 & 0x3]) {
							arg10[0] = Static115.aBooleanArrayArray2[local67][local510 + 2 & 0x3];
						}
					} else if (!local18[arg7 & 0x3]) {
						arg10[0] = Static154.aBooleanArrayArray4[local67][local510 + 2 & 0x3];
					}
				}
			}
		}
		if (arg0 < arg1 - 1) {
			local40 = arg8[arg4][arg0 + 1] & 0xFF;
			if (local40 > 0) {
				local50 = this.aClass220_3.method5376(local40 - 1);
				if (local50.anInt6664 != -1) {
					local67 = arg5[arg4][arg0 + 1];
					local510 = arg11[arg4][arg0 + 1];
					if (local50.aBoolean486) {
						local88 = 4;
						local541 = local510 * 2 + 2;
						local546 = Static390.method6182(local50, arg2);
						for (local548 = 0; local548 < 3; local548++) {
							local541 &= 0x7;
							local88 &= 0x7;
							if (Static214.aBooleanArrayArray5[local67][local541] && Static425.anIntArray596[local88] <= local50.anInt6657) {
								Static66.anIntArray172[local88] = local50.anInt6664;
								Static389.anIntArray490[local88] = local546;
								Static167.anIntArray302[local88] = arg2.method5843() ? local50.anInt6668 : local50.anInt6675;
								Static429.anIntArray598[local88] = local50.anInt6659;
								if (Static425.anIntArray596[local88] == local50.anInt6657) {
									Static339.anIntArray450[local88] |= 0x10;
								} else {
									Static339.anIntArray450[local88] = 16;
								}
								Static425.anIntArray596[local88] = local50.anInt6657;
							}
							local541--;
							local88++;
						}
						if (!local18[arg7 + 2 & 0x3]) {
							arg10[2] = Static115.aBooleanArrayArray2[local67][local510 & 0x3];
						}
					} else if (!local18[arg7 + 2 & 0x3]) {
						arg10[2] = Static154.aBooleanArrayArray4[local67][local510 & 0x3];
					}
				}
			}
		}
		if (arg4 > 0) {
			local40 = arg8[arg4 - 1][arg0] & 0xFF;
			if (local40 > 0) {
				local50 = this.aClass220_3.method5376(local40 - 1);
				if (local50.anInt6664 != -1) {
					local67 = arg5[arg4 - 1][arg0];
					local510 = arg11[arg4 - 1][arg0];
					if (local50.aBoolean486) {
						local88 = 6;
						local541 = local510 * 2 + 4;
						local546 = Static390.method6182(local50, arg2);
						for (local548 = 0; local548 < 3; local548++) {
							local88 &= 0x7;
							local541 &= 0x7;
							if (Static214.aBooleanArrayArray5[local67][local541] && Static425.anIntArray596[local88] <= local50.anInt6657) {
								Static66.anIntArray172[local88] = local50.anInt6664;
								Static389.anIntArray490[local88] = local546;
								Static167.anIntArray302[local88] = arg2.method5843() ? local50.anInt6668 : local50.anInt6675;
								Static429.anIntArray598[local88] = local50.anInt6659;
								if (local50.anInt6657 == Static425.anIntArray596[local88]) {
									Static339.anIntArray450[local88] |= 0x8;
								} else {
									Static339.anIntArray450[local88] = 8;
								}
								Static425.anIntArray596[local88] = local50.anInt6657;
							}
							local88++;
							local541--;
						}
						if (!local18[arg7 + 3 & 0x3]) {
							arg10[3] = Static115.aBooleanArrayArray2[local67][local510 + 1 & 0x3];
						}
					} else if (!local18[arg7 + 3 & 0x3]) {
						arg10[3] = Static154.aBooleanArrayArray4[local67][local510 + 1 & 0x3];
					}
				}
			}
		}
		if (arg6 - 1 > arg4) {
			local40 = arg8[arg4 + 1][arg0] & 0xFF;
			if (local40 > 0) {
				local50 = this.aClass220_3.method5376(local40 - 1);
				if (local50.anInt6664 != -1) {
					local67 = arg5[arg4 + 1][arg0];
					local510 = arg11[arg4 + 1][arg0];
					if (local50.aBoolean486) {
						local88 = 4;
						local541 = local510 * 2 + 6;
						local546 = Static390.method6182(local50, arg2);
						for (local548 = 0; local548 < 3; local548++) {
							local88 &= 0x7;
							local541 &= 0x7;
							if (Static214.aBooleanArrayArray5[local67][local541] && Static425.anIntArray596[local88] <= local50.anInt6657) {
								Static66.anIntArray172[local88] = local50.anInt6664;
								Static389.anIntArray490[local88] = local546;
								Static167.anIntArray302[local88] = arg2.method5843() ? local50.anInt6668 : local50.anInt6675;
								Static429.anIntArray598[local88] = local50.anInt6659;
								if (local50.anInt6657 == Static425.anIntArray596[local88]) {
									Static339.anIntArray450[local88] |= 0x4;
								} else {
									Static339.anIntArray450[local88] = 4;
								}
								Static425.anIntArray596[local88] = local50.anInt6657;
							}
							local88--;
							local541++;
						}
						if (!local18[arg7 + 1 & 0x3]) {
							arg10[1] = Static115.aBooleanArrayArray2[local67][local510 + 3 & 0x3];
						}
					} else if (!local18[arg7 + 1 & 0x3]) {
						arg10[1] = Static154.aBooleanArrayArray4[local67][local510 + 3 & 0x3];
					}
				}
			}
		}
		if (arg3 == null) {
			return;
		}
		local40 = Static390.method6182(arg3, arg2);
		if (!arg3.aBoolean486) {
			return;
		}
		for (@Pc(1229) int local1229 = 0; local1229 < 8; local1229++) {
			@Pc(1240) int local1240 = local1229 - arg7 * 2 & 0x7;
			if (Static214.aBooleanArrayArray5[arg12][local1229] && arg3.anInt6657 >= Static425.anIntArray596[local1240]) {
				Static66.anIntArray172[local1240] = arg3.anInt6664;
				Static389.anIntArray490[local1240] = local40;
				Static167.anIntArray302[local1240] = arg2.method5843() ? arg3.anInt6668 : arg3.anInt6675;
				Static429.anIntArray598[local1240] = arg3.anInt6659;
				if (arg3.anInt6657 == Static425.anIntArray596[local1240]) {
					Static339.anIntArray450[local1240] |= 0x2;
				} else {
					Static339.anIntArray450[local1240] = 2;
				}
				Static425.anIntArray596[local1240] = arg3.anInt6657;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!sa;Lclient!qa;ILclient!sa;)V")
	public final void method3329(@OriginalArg(0) Class215 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(3) Class215 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt3784][this.anInt3786];
		if (Static479.anIntArray645 == null || Static479.anIntArray645.length != this.anInt3786) {
			Static300.anIntArray411 = new int[this.anInt3786];
			Static372.anIntArray480 = new int[this.anInt3786];
			Static479.anIntArray645 = new int[this.anInt3786];
			Static493.anIntArray661 = new int[this.anInt3786];
			Static346.anIntArray453 = new int[this.anInt3786];
		}
		@Pc(44) int local44;
		for (@Pc(40) int local40 = 0; local40 < this.anInt3799; local40++) {
			for (local44 = 0; local44 < this.anInt3786; local44++) {
				Static479.anIntArray645[local44] = 0;
				Static493.anIntArray661[local44] = 0;
				Static372.anIntArray480[local44] = 0;
				Static300.anIntArray411[local44] = 0;
				Static346.anIntArray453[local44] = 0;
			}
			for (@Pc(77) int local77 = -5; local77 < this.anInt3784; local77++) {
				@Pc(87) int local87;
				@Pc(102) int local102;
				@Pc(168) int local168;
				for (@Pc(81) int local81 = 0; local81 < this.anInt3786; local81++) {
					local87 = local77 + 5;
					@Pc(148) int local148;
					if (local87 < this.anInt3784) {
						local102 = this.aByteArrayArrayArray10[local40][local87][local81] & 0xFF;
						if (local102 > 0) {
							@Pc(112) Class120 local112 = this.aClass47_4.method1418(local102 - 1);
							Static479.anIntArray645[local81] += local112.anInt3817;
							Static493.anIntArray661[local81] += local112.anInt3815;
							Static372.anIntArray480[local81] += local112.anInt3821;
							Static300.anIntArray411[local81] += local112.anInt3822;
							local148 = Static346.anIntArray453[local81]++;
						}
					}
					local102 = local77 - 5;
					if (local102 >= 0) {
						local168 = this.aByteArrayArrayArray10[local40][local102][local81] & 0xFF;
						if (local168 > 0) {
							@Pc(178) Class120 local178 = this.aClass47_4.method1418(local168 - 1);
							Static479.anIntArray645[local81] -= local178.anInt3817;
							Static493.anIntArray661[local81] -= local178.anInt3815;
							Static372.anIntArray480[local81] -= local178.anInt3821;
							Static300.anIntArray411[local81] -= local178.anInt3822;
							local148 = Static346.anIntArray453[local81]--;
						}
					}
				}
				if (local77 >= 0) {
					local87 = 0;
					local102 = 0;
					local168 = 0;
					@Pc(239) int local239 = 0;
					@Pc(241) int local241 = 0;
					for (@Pc(243) int local243 = -5; local243 < this.anInt3786; local243++) {
						@Pc(249) int local249 = local243 + 5;
						if (this.anInt3786 > local249) {
							local239 += Static300.anIntArray411[local249];
							local102 += Static493.anIntArray661[local249];
							local87 += Static479.anIntArray645[local249];
							local168 += Static372.anIntArray480[local249];
							local241 += Static346.anIntArray453[local249];
						}
						@Pc(291) int local291 = local243 - 5;
						if (local291 >= 0) {
							local241 -= Static346.anIntArray453[local291];
							local239 -= Static300.anIntArray411[local291];
							local168 -= Static372.anIntArray480[local291];
							local87 -= Static479.anIntArray645[local291];
							local102 -= Static493.anIntArray661[local291];
						}
						if (local243 >= 0 && local239 > 0 && local241 > 0) {
							local11[local77][local243] = Static288.method4702(local168 / local241, local87 * 256 / local239, local102 / local241);
						}
					}
				}
			}
			if (Static141.aBoolean253) {
				this.method3336(arg1, local40, local40 == 0 ? arg2 : null, local11, local40 == 0 ? arg0 : null, Static51.aClass215Array6[local40]);
			} else {
				this.method3334(local40 == 0 ? arg2 : null, Static51.aClass215Array6[local40], arg1, local40, local11, local40 == 0 ? arg0 : null);
			}
			this.aByteArrayArrayArray10[local40] = null;
			this.aByteArrayArrayArray13[local40] = null;
			this.aByteArrayArrayArray11[local40] = null;
			this.aByteArrayArrayArray14[local40] = null;
		}
		if (!this.aBoolean312) {
			if (Static337.anInt6452 != 0) {
				Static256.method4387();
			}
			if (Static394.aBoolean538) {
				Static435.method6627();
			}
		}
		for (local44 = 0; local44 < this.anInt3799; local44++) {
			Static51.aClass215Array6[local44].N();
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "([[IBI)V")
	public final void method3331(@OriginalArg(0) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray4[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt3784 + 1; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt3786 + 1; local16++) {
				local10[local12][local16] += arg0[local12][local16];
			}
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIBIILclient!daa;I[Lclient!ld;II)V")
	public final void method3332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class12_Sub8 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class184[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(17) int local17 = (arg8 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(56) int local56;
		if (!this.aBoolean312) {
			@Pc(24) Class184 local24 = arg6[arg0];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(44) int local44 = Static317.method5060(local26 & 0x7, arg5, local30 & 0x7) + arg1;
					local56 = Static429.method6588(arg5, local30 & 0x7, local26 & 0x7) + arg7;
					if (local44 > 0 && local44 < this.anInt3784 - 1 && local56 > 0 && local56 < this.anInt3786 - 1) {
						local24.method4599(local44, local56);
					}
				}
			}
		}
		@Pc(100) int local100 = (arg2 & 0x7) * 8;
		@Pc(106) int local106 = (arg8 & 0x1FFFFFF8) << 3;
		local26 = (arg2 & 0x1FFFFFF8) << 3;
		@Pc(114) byte local114 = 0;
		@Pc(116) byte local116 = 0;
		if (arg5 == 1) {
			local116 = 1;
		} else if (arg5 == 2) {
			local114 = 1;
			local116 = 1;
		} else if (arg5 == 3) {
			local114 = 1;
		}
		for (local56 = 0; local56 < this.anInt3799; local56++) {
			for (@Pc(145) int local145 = 0; local145 < 64; local145++) {
				for (@Pc(149) int local149 = 0; local149 < 64; local149++) {
					if (local56 == arg3 && local145 >= local17 && local17 + 8 >= local145 && local100 <= local149 && local149 <= local100 + 8) {
						@Pc(230) int local230;
						@Pc(221) int local221;
						if (local17 + 8 == local145 || local149 == local100 + 8) {
							if (arg5 == 0) {
								local221 = arg7 + local149 - local100;
								local230 = local145 + arg1 - local17;
							} else if (arg5 == 1) {
								local221 = arg7 + local17 + 8 - local145;
								local230 = local149 + arg1 - local100;
							} else if (arg5 == 2) {
								local221 = arg7 + local100 + 8 - local149;
								local230 = local17 + arg1 + 8 - local145;
							} else {
								local221 = arg7 + local145 - local17;
								local230 = local100 + arg1 + 8 - local149;
							}
							this.method3325(local230, true, local106 + local145, 0, arg4, 0, 0, local149 + local26, arg0, local221);
						} else {
							local230 = arg1 + Static317.method5060(local145 & 0x7, arg5, local149 & 0x7);
							local221 = arg7 + Static429.method6588(arg5, local149 & 0x7, local145 & 0x7);
							this.method3325(local230, false, local106 + local145, local116, arg4, arg5, local114, local149 + local26, arg0, local221);
						}
						if (local145 == 63 || local149 == 63) {
							@Pc(355) byte local355 = 1;
							if (local145 == 63 && local149 == 63) {
								local355 = 3;
							}
							for (@Pc(365) int local365 = 0; local365 < local355; local365++) {
								@Pc(369) int local369 = local145;
								@Pc(371) int local371 = local149;
								if (local365 == 0) {
									local371 = local149 == 63 ? 64 : local149;
									local369 = local145 == 63 ? 64 : local145;
								} else if (local365 == 1) {
									local369 = 64;
								} else if (local365 == 2) {
									local371 = 64;
								}
								@Pc(425) int local425;
								@Pc(418) int local418;
								if (arg5 == 0) {
									local418 = local371 + arg7 - local100;
									local425 = arg1 + local369 - local17;
								} else if (arg5 == 1) {
									local418 = local17 + arg7 + 8 - local369;
									local425 = local371 + arg1 - local100;
								} else if (arg5 == 2) {
									local425 = arg1 + local17 + 8 - local369;
									local418 = local100 + arg7 + 8 - local371;
								} else {
									local418 = arg7 + local369 - local17;
									local425 = arg1 + local100 + 8 - local371;
								}
								if (local425 >= 0 && this.anInt3784 > local425 && local418 >= 0 && this.anInt3786 > local418) {
									this.anIntArrayArrayArray4[arg0][local425][local418] = this.anIntArrayArrayArray4[arg0][local230 + local114][local221 + local116];
								}
							}
						}
					} else {
						this.method3325(-1, false, 0, 0, arg4, 0, 0, 0, 0, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIIII)V")
	public final void method3333(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3799; local7++) {
			this.method3335(arg0, local7, arg1);
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!sa;Lclient!sa;Lclient!qa;I[[ILclient!sa;I)V")
	private void method3334(@OriginalArg(0) Class215 arg0, @OriginalArg(1) Class215 arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) Class215 arg5) {
		for (@Pc(26) int local26 = 0; local26 < this.anInt3784; local26++) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt3786; local30++) {
				if (Static416.anInt9651 == -1 || Static87.method1914(local26, Static416.anInt9651, local30, arg3)) {
					@Pc(54) byte local54 = this.aByteArrayArrayArray11[arg3][local26][local30];
					@Pc(63) byte local63 = this.aByteArrayArrayArray14[arg3][local26][local30];
					@Pc(74) int local74 = this.aByteArrayArrayArray13[arg3][local26][local30] & 0xFF;
					@Pc(85) int local85 = this.aByteArrayArrayArray10[arg3][local26][local30] & 0xFF;
					@Pc(97) Class231 local97 = local74 == 0 ? null : this.aClass220_3.method5376(local74 - 1);
					@Pc(109) Class120 local109 = local85 == 0 ? null : this.aClass47_4.method1418(local85 - 1);
					@Pc(111) int local111 = 0;
					@Pc(113) int local113 = 0;
					if (local54 != 0) {
						local111 = local109 == null ? 0 : Static443.anIntArray609[local54];
						local113 = local97 == null ? 0 : Static155.anIntArray290[local54];
					} else if (local97 != null) {
						local113 = Static155.anIntArray290[local54];
					} else if (local109 != null) {
						local111 = Static155.anIntArray290[local54];
					}
					@Pc(155) int local155 = local113 + local111;
					@Pc(157) int local157 = 0;
					if (local155 != 0) {
						@Pc(162) int[] local162 = new int[local155];
						@Pc(165) int[] local165 = new int[local155];
						@Pc(168) int[] local168 = new int[local155];
						@Pc(171) int[] local171 = new int[local155];
						@Pc(173) boolean local173 = false;
						@Pc(189) int local189;
						@Pc(221) int local221;
						if (local97 == null || local97.anInt6664 == -1 && local97.anInt6669 == -1 && local97.anInt6668 == -1) {
							for (local189 = 0; local189 < local113; local189++) {
								local162[local157] = -1;
								local157++;
							}
						} else {
							local189 = arg2.method5843() ? local97.anInt6668 : local97.anInt6675;
							if (Static321.aBoolean462) {
								local189 = -1;
							}
							for (local221 = 0; local221 < local113; local221++) {
								local168[local157] = local189;
								local171[local157] = local97.anInt6659;
								if (local97.anInt6664 == -1) {
									local162[local157] = -1;
								} else {
									local162[local157] = local97.anInt6664;
								}
								if (local97.anInt6669 == -1) {
									local165[local157] = -1;
								} else {
									local173 = true;
									local165[local157] = local97.anInt6669;
								}
								local157++;
							}
							if (!this.aBoolean312 && arg3 == 0) {
								Static99.method2090(local26, local30, local97.anInt6666, local97.anInt6671 * 8, local97.anInt6665);
							}
						}
						if (!local173) {
							local165 = null;
						}
						if (local109 == null) {
							for (local189 = 0; local189 < local111; local189++) {
								local162[local157] = -1;
								local157++;
							}
						} else {
							local189 = local109.anInt3819;
							if (Static321.aBoolean462) {
								local189 = -1;
							}
							for (local221 = 0; local221 < local111; local221++) {
								local168[local157] = local189;
								local171[local157] = local109.anInt3818;
								local162[local157] = arg4[local26][local30];
								if (local165 != null) {
									local165[local157] = -1;
								}
								local157++;
							}
						}
						local189 = this.anIntArray300.length;
						@Pc(356) int[] local356 = new int[local189];
						@Pc(359) int[] local359 = new int[local189];
						@Pc(366) int[] local366 = arg0 == null ? null : new int[local189];
						@Pc(375) int[] local375 = arg0 == null && arg5 == null ? null : new int[local189];
						@Pc(384) int local384;
						@Pc(389) int local389;
						@Pc(473) int local473;
						@Pc(479) int local479;
						for (@Pc(377) int local377 = 0; local377 < local189; local377++) {
							local384 = this.anIntArray300[local377];
							local389 = this.anIntArray301[local377];
							if (local63 == 0) {
								local356[local377] = local384;
								local359[local377] = local389;
							} else if (local63 == 1) {
								local356[local377] = local389;
								local359[local377] = 128 - local384;
							} else if (local63 == 2) {
								local356[local377] = 128 - local384;
								local359[local377] = 128 - local389;
							} else if (local63 == 3) {
								local356[local377] = 128 - local389;
								local359[local377] = local384;
							}
							if (local366 != null && Static214.aBooleanArrayArray5[local54][local377]) {
								local473 = (local26 << 7) + local384;
								local479 = (local30 << 7) + local384;
								local366[local377] = arg0.aa(local473, local479) - arg1.aa(local473, local479);
							}
							if (local375 != null) {
								if (arg0 != null && !Static214.aBooleanArrayArray5[local54][local377]) {
									local473 = local384 + (local26 << 7);
									local479 = (local30 << 7) + local384;
									local375[local377] = arg1.aa(local473, local479) - arg0.aa(local473, local479);
								} else if (arg5 != null && !Static12.aBooleanArrayArray1[local54][local377]) {
									local473 = local384 + (local26 << 7);
									local479 = local384 + (local30 << 7);
									local375[local377] = arg5.aa(local473, local479) - arg1.aa(local473, local479);
								}
							}
						}
						local384 = arg1.ba(local26, local30);
						local389 = arg1.ba(local26 + 1, local30);
						local473 = arg1.ba(local26 + 1, local30 - -1);
						local479 = arg1.ba(local26, local30 + 1);
						if (arg3 > 0) {
							@Pc(598) boolean local598 = true;
							if (local85 == 0 && local54 != 0) {
								local598 = false;
							}
							if (local74 > 0 && local97 != null && !local97.aBoolean485) {
								local598 = false;
							}
							if (local598 && local384 == local389 && local473 == local384 && local384 == local479) {
								this.aByteArrayArrayArray12[arg3][local26][local30] = (byte) (this.aByteArrayArrayArray12[arg3][local26][local30] | 0x4);
							}
						}
						@Pc(659) int local659 = 0;
						@Pc(661) int local661 = 0;
						@Pc(663) int local663 = 0;
						if (this.aBoolean312) {
							local659 = Static340.method5414(local26, local30);
							local661 = Static51.method7361(local26, local30);
							local663 = Static143.method2853(local26, local30);
						}
						arg1.method7840(local26, local30, local356, local366, local359, local375, Static400.anIntArrayArray66[local54], Static483.anIntArrayArray82[local54], Static196.anIntArrayArray41[local54], local162, local165, local168, local171, local659, local661, local663);
						Static375.method5783(arg3, local26, local30);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(BIIIII)V")
	private void method3335(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2) {
		@Pc(17) int local17;
		for (@Pc(13) int local13 = arg2; local13 < arg2 + 64; local13++) {
			for (local17 = arg0; local17 < arg0 + 64; local17++) {
				if (local17 >= 0 && local17 < this.anInt3784 && local13 >= 0 && local13 < this.anInt3786) {
					this.anIntArrayArrayArray4[arg1][local17][local13] = arg1 > 0 ? this.anIntArrayArrayArray4[arg1 - 1][local17][local13] - 240 : 0;
				}
			}
		}
		if (arg0 > 0 && this.anInt3784 > arg0) {
			for (local17 = arg2 + 1; local17 < arg2 + 64; local17++) {
				if (local17 >= 0 && local17 < this.anInt3786) {
					this.anIntArrayArrayArray4[arg1][arg0][local17] = this.anIntArrayArrayArray4[arg1][arg0 - 1][local17];
				}
			}
		}
		if (arg2 > 0 && this.anInt3786 > arg2) {
			for (local17 = arg0 + 1; local17 < arg0 + 64; local17++) {
				if (local17 >= 0 && local17 < this.anInt3784) {
					this.anIntArrayArrayArray4[arg1][local17][arg2] = this.anIntArrayArrayArray4[arg1][local17][arg2 - 1];
				}
			}
		}
		if (arg0 < 0 || arg2 < 0 || arg0 >= this.anInt3784 || this.anInt3786 <= arg2) {
			return;
		}
		if (arg1 == 0) {
			if (arg0 > 0 && this.anIntArrayArrayArray4[arg1][arg0 - 1][arg2] != 0) {
				this.anIntArrayArrayArray4[arg1][arg0][arg2] = this.anIntArrayArrayArray4[arg1][arg0 - 1][arg2];
				return;
			}
			if (arg2 > 0 && this.anIntArrayArrayArray4[arg1][arg0][arg2 - 1] != 0) {
				this.anIntArrayArrayArray4[arg1][arg0][arg2] = this.anIntArrayArrayArray4[arg1][arg0][arg2 - 1];
				return;
			}
			if (arg0 > 0 && arg2 > 0 && this.anIntArrayArrayArray4[arg1][arg0 - 1][arg2 - 1] != 0) {
				this.anIntArrayArrayArray4[arg1][arg0][arg2] = this.anIntArrayArrayArray4[arg1][arg0 - 1][arg2 - 1];
				return;
			}
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray4[arg1 - 1][arg0 - 1][arg2] != this.anIntArrayArrayArray4[arg1][arg0 - 1][arg2]) {
			this.anIntArrayArrayArray4[arg1][arg0][arg2] = this.anIntArrayArrayArray4[arg1][arg0 - 1][arg2];
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray4[arg1][arg0][arg2 - 1] != this.anIntArrayArrayArray4[arg1 - 1][arg0][arg2 - 1]) {
			this.anIntArrayArrayArray4[arg1][arg0][arg2] = this.anIntArrayArrayArray4[arg1][arg0][arg2 - 1];
			return;
		}
		if (arg0 > 0 && arg2 > 0 && this.anIntArrayArrayArray4[arg1][arg0 - 1][arg2 - 1] != this.anIntArrayArrayArray4[arg1 - 1][arg0 - 1][arg2 - 1]) {
			this.anIntArrayArrayArray4[arg1][arg0][arg2] = this.anIntArrayArrayArray4[arg1][arg0 - 1][arg2 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!qa;ILclient!sa;[[ILclient!sa;ILclient!sa;)V")
	private void method3336(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class215 arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) Class215 arg4, @OriginalArg(6) Class215 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray11[arg1];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray14[arg1];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray10[arg1];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray13[arg1];
		for (@Pc(27) int local27 = 0; local27 < this.anInt3784; local27++) {
			@Pc(41) int local41 = local27 < this.anInt3784 - 1 ? local27 + 1 : local27;
			for (@Pc(43) int local43 = 0; local43 < this.anInt3786; local43++) {
				@Pc(61) int local61 = local43 >= this.anInt3786 - 1 ? local43 : local43 + 1;
				if (Static416.anInt9651 == -1 || Static87.method1914(local27, Static416.anInt9651, local43, arg1)) {
					@Pc(75) boolean local75 = false;
					@Pc(77) boolean local77 = false;
					@Pc(80) boolean[] local80 = new boolean[4];
					@Pc(86) int local86 = local10[local27][local43];
					@Pc(92) int local92 = local15[local27][local43];
					@Pc(100) int local100 = local25[local27][local43] & 0xFF;
					@Pc(108) int local108 = local20[local27][local43] & 0xFF;
					@Pc(116) int local116 = local20[local27][local61] & 0xFF;
					@Pc(124) int local124 = local20[local41][local61] & 0xFF;
					@Pc(132) int local132 = local20[local41][local43] & 0xFF;
					if (local100 != 0 || local108 != 0) {
						@Pc(154) Class231 local154 = local100 == 0 ? null : this.aClass220_3.method5376(local100 - 1);
						@Pc(169) Class120 local169 = local108 == 0 ? null : this.aClass47_4.method1418(local108 - 1);
						if (local86 == 0 && local154 == null) {
							local86 = 12;
						}
						@Pc(177) Class231 local177 = local154;
						if (local154 != null) {
							if (local154.anInt6664 == -1 && local154.anInt6669 == -1) {
								local177 = local154;
								local154 = null;
							} else if (local169 != null && local86 != 0) {
								local77 = local154.aBoolean486;
							}
						}
						@Pc(252) int local252;
						@Pc(299) int local299;
						@Pc(364) int local364;
						@Pc(377) int local377;
						if ((local86 == 0 || local86 == 12) && local27 > 0 && local43 > 0 && local27 < this.anInt3784 && this.anInt3786 > local43) {
							local252 = local20[local27 - 1][local43 - 1] == local108 ? 1 : -1;
							@Pc(269) int local269 = local20[local41][local61] == local108 ? 1 : -1;
							@Pc(284) int local284 = local20[local41][local43 - 1] == local108 ? 1 : -1;
							local299 = local108 == local20[local27 - 1][local61] ? 1 : -1;
							if (local20[local27][local43 - 1] == local108) {
								local252++;
								local284++;
							} else {
								local284--;
								local252--;
							}
							if (local20[local41][local43] == local108) {
								local284++;
								local269++;
							} else {
								local269--;
								local284--;
							}
							if (local20[local27][local61] == local108) {
								local269++;
								local299++;
							} else {
								local299--;
								local269--;
							}
							if (local20[local27 - 1][local43] == local108) {
								local299++;
								local252++;
							} else {
								local299--;
								local252--;
							}
							local364 = local252 - local269;
							if (local364 < 0) {
								local364 = -local364;
							}
							local377 = local284 - local299;
							if (local377 < 0) {
								local377 = -local377;
							}
							if (local364 == local377) {
								local364 = arg5.ba(local27, local43) - arg5.ba(local41, local61);
								if (local364 < 0) {
									local364 = -local364;
								}
								local377 = arg5.ba(local41, local43) - arg5.ba(local27, local61);
								if (local377 < 0) {
									local377 = -local377;
								}
							}
							local92 = local377 <= local364 ? 0 : 1;
						}
						for (local252 = 0; local252 < 13; local252++) {
							Static425.anIntArray596[local252] = -1;
							Static339.anIntArray450[local252] = 1;
						}
						@Pc(460) boolean[] local460 = local154 != null && local154.aBoolean486 ? Static115.aBooleanArrayArray2[local86] : Static154.aBooleanArrayArray4[local86];
						this.method3327(local43, this.anInt3786, arg0, local154, local27, local10, this.anInt3784, local92, local25, local169, local80, local15, local86);
						@Pc(493) boolean local493 = local154 != null && local154.anInt6664 != local154.anInt6669;
						if (!local493) {
							for (local299 = 0; local299 < 8; local299++) {
								if (Static425.anIntArray596[local299] >= 0 && Static66.anIntArray172[local299] != Static389.anIntArray490[local299]) {
									local493 = true;
									break;
								}
							}
						}
						if (!local460[local92 + 1 & 0x3]) {
							local80[1] = Static401.method6303(local80[1], (Static339.anIntArray450[4] & Static339.anIntArray450[2]) == 0);
						}
						if (!local460[local92 + 3 & 0x3]) {
							local80[3] = Static401.method6303(local80[3], (Static339.anIntArray450[0] & Static339.anIntArray450[6]) == 0);
						}
						if (!local460[local92 & 0x3]) {
							local80[0] = Static401.method6303(local80[0], (Static339.anIntArray450[2] & Static339.anIntArray450[0]) == 0);
						}
						if (!local460[local92 + 2 & 0x3]) {
							local80[2] = Static401.method6303(local80[2], (Static339.anIntArray450[4] & Static339.anIntArray450[6]) == 0);
						}
						if (!local77 && (local86 == 0 || local86 == 12)) {
							if (local80[0] && !local80[1] && !local80[2] && local80[3]) {
								local92 = 0;
								local86 = local86 == 0 ? 13 : 14;
								local80[0] = local80[3] = false;
							} else if (local80[0] && local80[1] && !local80[2] && !local80[3]) {
								local92 = 3;
								local86 = local86 == 0 ? 13 : 14;
								local80[0] = local80[1] = false;
							} else if (!local80[0] && local80[1] && local80[2] && !local80[3]) {
								local80[1] = local80[2] = false;
								local92 = 2;
								local86 = local86 == 0 ? 13 : 14;
							} else if (!local80[0] && !local80[1] && local80[2] && local80[3]) {
								local86 = local86 == 0 ? 13 : 14;
								local92 = 1;
								local80[2] = local80[3] = false;
							}
						}
						@Pc(808) boolean local808 = !local77 && !local80[0] && !local80[2] && !local80[1] && !local80[3];
						@Pc(810) int[] local810 = null;
						@Pc(836) int[] local836;
						@Pc(840) int[] local840;
						@Pc(824) int[] local824;
						if (local808) {
							local377 = local154 == null ? 0 : Static155.anIntArray290[local86];
							local824 = Static196.anIntArrayArray41[local86];
							local364 = local169 == null ? 0 : Static443.anIntArray609[local86];
							local836 = Static400.anIntArrayArray66[local86];
							local840 = Static483.anIntArrayArray82[local86];
						} else if (local77) {
							local364 = local169 == null ? 0 : Static201.anIntArray336[local86];
							local836 = Static452.anIntArrayArray79[local86];
							local840 = Static141.anIntArrayArray28[local86];
							local810 = Static470.anIntArrayArray81[local86];
							local377 = local154 == null ? 0 : Static317.anIntArray425[local86];
							local824 = Static25.anIntArrayArray2[local86];
						} else {
							local836 = Static259.anIntArrayArray50[local86];
							local840 = Static48.anIntArrayArray15[local86];
							local824 = Static523.anIntArrayArray85[local86];
							local364 = local169 == null ? 0 : Static252.anIntArray371[local86];
							local377 = local154 == null ? 0 : Static53.anIntArray128[local86];
							local810 = Static389.anIntArrayArray65[local86];
						}
						@Pc(914) int local914 = local377 + local364;
						if (local914 <= 0) {
							Static375.method5783(arg1, local27, local43);
						} else {
							if (local80[0]) {
								local914++;
							}
							if (local80[2]) {
								local914++;
							}
							if (local80[1]) {
								local914++;
							}
							if (local80[3]) {
								local914++;
							}
							@Pc(947) int local947 = 0;
							@Pc(949) int local949 = 0;
							@Pc(953) int local953 = local914 * 3;
							@Pc(960) int[] local960 = local493 ? new int[local953] : null;
							@Pc(963) int[] local963 = new int[local953];
							@Pc(966) int[] local966 = new int[local953];
							@Pc(969) int[] local969 = new int[local953];
							@Pc(972) int[] local972 = new int[local953];
							@Pc(975) int[] local975 = new int[local953];
							@Pc(982) int[] local982 = arg2 == null ? null : new int[local953];
							@Pc(991) int[] local991 = arg2 == null && arg4 == null ? null : new int[local953];
							@Pc(993) int local993 = -1;
							@Pc(995) int local995 = -1;
							@Pc(997) int local997 = 256;
							@Pc(1069) byte local1069;
							@Pc(1019) int local1019;
							@Pc(1021) int local1021;
							@Pc(1260) int local1260;
							@Pc(1266) int local1266;
							@Pc(1274) int local1274;
							@Pc(1279) int local1279;
							@Pc(1295) int local1295;
							@Pc(1284) int local1284;
							@Pc(1300) int local1300;
							@Pc(1349) int local1349;
							@Pc(1355) int local1355;
							if (local154 != null) {
								local993 = local154.anInt6664;
								local995 = arg0.method5843() ? local154.anInt6668 : local154.anInt6675;
								local997 = local154.anInt6659;
								local1019 = Static390.method6182(local154, arg0);
								for (local1021 = 0; local1021 < local377; local1021++) {
									if (local80[-local92 & 0x3] && local947 == local810[0]) {
										Static156.anIntArray291[0] = local836[local947];
										Static156.anIntArray291[1] = 1;
										Static156.anIntArray291[2] = local824[local947];
										Static156.anIntArray291[3] = 1;
										Static156.anIntArray291[4] = local840[local947];
										local1069 = 6;
										Static156.anIntArray291[5] = local824[local947];
									} else if (local80[2 - local92 & 0x3] && local947 == local810[2]) {
										Static156.anIntArray291[0] = local836[local947];
										Static156.anIntArray291[1] = 5;
										Static156.anIntArray291[2] = local824[local947];
										Static156.anIntArray291[3] = 5;
										Static156.anIntArray291[4] = local840[local947];
										Static156.anIntArray291[5] = local824[local947];
										local1069 = 6;
									} else if (local80[1 - local92 & 0x3] && local947 == local810[1]) {
										Static156.anIntArray291[0] = local836[local947];
										Static156.anIntArray291[1] = 3;
										Static156.anIntArray291[2] = local824[local947];
										Static156.anIntArray291[3] = 3;
										Static156.anIntArray291[4] = local840[local947];
										local1069 = 6;
										Static156.anIntArray291[5] = local824[local947];
									} else if (local80[3 - local92 & 0x3] && local947 == local810[3]) {
										Static156.anIntArray291[0] = local836[local947];
										Static156.anIntArray291[1] = 7;
										Static156.anIntArray291[2] = local824[local947];
										Static156.anIntArray291[3] = 7;
										Static156.anIntArray291[4] = local840[local947];
										Static156.anIntArray291[5] = local824[local947];
										local1069 = 6;
									} else {
										Static156.anIntArray291[0] = local836[local947];
										Static156.anIntArray291[1] = local840[local947];
										local1069 = 3;
										Static156.anIntArray291[2] = local824[local947];
									}
									for (local1260 = 0; local1260 < local1069; local1260++) {
										local1266 = Static156.anIntArray291[local1260];
										local1274 = local1266 - local92 * 2 & 0x7;
										local1279 = this.anIntArray300[local1266];
										local1284 = this.anIntArray301[local1266];
										if (local92 == 1) {
											local1300 = 128 - local1279;
											local1295 = local1284;
										} else if (local92 == 2) {
											local1295 = 128 - local1279;
											local1300 = 128 - local1284;
										} else if (local92 == 3) {
											local1300 = local1279;
											local1295 = 128 - local1284;
										} else {
											local1300 = local1284;
											local1295 = local1279;
										}
										local963[local949] = local1295;
										local966[local949] = local1300;
										if (local982 != null && Static214.aBooleanArrayArray5[local86][local1266]) {
											local1349 = (local27 << 7) + local1295;
											local1355 = local1300 + (local43 << 7);
											local982[local949] = arg2.aa(local1349, local1355) - arg5.aa(local1349, local1355);
										}
										if (local991 != null) {
											if (arg2 != null && !Static214.aBooleanArrayArray5[local86][local1266]) {
												local1349 = (local27 << 7) + local1295;
												local1355 = local1300 + (local43 << 7);
												local991[local949] = arg5.aa(local1349, local1355) - arg2.aa(local1349, local1355);
											} else if (arg4 != null && !Static12.aBooleanArrayArray1[local86][local1266]) {
												local1349 = local1295 + (local27 << 7);
												local1355 = local1300 + (local43 << 7);
												local991[local949] = arg4.aa(local1349, local1355) - arg5.aa(local1349, local1355);
											}
										}
										if (local1266 < 8 && Static425.anIntArray596[local1274] > local154.anInt6657) {
											if (local960 != null) {
												local960[local949] = Static389.anIntArray490[local1274];
											}
											local975[local949] = Static429.anIntArray598[local1274];
											local972[local949] = Static167.anIntArray302[local1274];
											local969[local949] = Static66.anIntArray172[local1274];
										} else {
											if (local960 != null) {
												local960[local949] = local1019;
											}
											local972[local949] = arg0.method5843() ? local154.anInt6668 : local154.anInt6675;
											local975[local949] = local154.anInt6659;
											local969[local949] = local993;
										}
										local949++;
									}
									local947++;
								}
								if (!this.aBoolean312 && arg1 == 0) {
									Static99.method2090(local27, local43, local154.anInt6666, local154.anInt6671 * 8, local154.anInt6665);
								}
								if (local86 != 12 && local154.anInt6664 != -1 && local154.aBoolean484) {
									local75 = true;
								}
							} else if (local808) {
								local947 = Static155.anIntArray290[local86];
							} else if (local77) {
								local947 = Static317.anIntArray425[local86];
							} else {
								local947 = Static53.anIntArray128[local86];
							}
							if (local169 != null) {
								if (local124 == 0) {
									local124 = local108;
								}
								if (local116 == 0) {
									local116 = local108;
								}
								if (local132 == 0) {
									local132 = local108;
								}
								@Pc(1601) Class120 local1601 = this.aClass47_4.method1418(local108 - 1);
								@Pc(1609) Class120 local1609 = this.aClass47_4.method1418(local116 - 1);
								@Pc(1617) Class120 local1617 = this.aClass47_4.method1418(local124 - 1);
								@Pc(1625) Class120 local1625 = this.aClass47_4.method1418(local132 - 1);
								for (local1274 = 0; local1274 < local364; local1274++) {
									if (local80[-local92 & 0x3] && local810[0] == local947) {
										Static156.anIntArray291[0] = local836[local947];
										Static156.anIntArray291[1] = 1;
										Static156.anIntArray291[2] = local824[local947];
										Static156.anIntArray291[3] = 1;
										Static156.anIntArray291[4] = local840[local947];
										Static156.anIntArray291[5] = local824[local947];
										local1069 = 6;
									} else if (local80[2 - local92 & 0x3] && local810[2] == local947) {
										Static156.anIntArray291[0] = local836[local947];
										Static156.anIntArray291[1] = 5;
										Static156.anIntArray291[2] = local824[local947];
										Static156.anIntArray291[3] = 5;
										Static156.anIntArray291[4] = local840[local947];
										local1069 = 6;
										Static156.anIntArray291[5] = local824[local947];
									} else if (local80[1 - local92 & 0x3] && local947 == local810[1]) {
										Static156.anIntArray291[0] = local836[local947];
										Static156.anIntArray291[1] = 3;
										Static156.anIntArray291[2] = local824[local947];
										Static156.anIntArray291[3] = 3;
										Static156.anIntArray291[4] = local840[local947];
										local1069 = 6;
										Static156.anIntArray291[5] = local824[local947];
									} else if (local80[3 - local92 & 0x3] && local810[3] == local947) {
										Static156.anIntArray291[0] = local836[local947];
										Static156.anIntArray291[1] = 7;
										Static156.anIntArray291[2] = local824[local947];
										Static156.anIntArray291[3] = 7;
										Static156.anIntArray291[4] = local840[local947];
										Static156.anIntArray291[5] = local824[local947];
										local1069 = 6;
									} else {
										Static156.anIntArray291[0] = local836[local947];
										Static156.anIntArray291[1] = local840[local947];
										Static156.anIntArray291[2] = local824[local947];
										local1069 = 3;
									}
									local947++;
									for (local1279 = 0; local1279 < local1069; local1279++) {
										local1295 = Static156.anIntArray291[local1279];
										local1284 = local1295 - local92 * 2 & 0x7;
										local1300 = this.anIntArray300[local1295];
										local1355 = this.anIntArray301[local1295];
										@Pc(1901) int local1901;
										if (local92 == 1) {
											local1901 = 128 - local1300;
											local1349 = local1355;
										} else if (local92 == 2) {
											local1349 = 128 - local1300;
											local1901 = 128 - local1355;
										} else if (local92 == 3) {
											local1901 = local1300;
											local1349 = 128 - local1355;
										} else {
											local1349 = local1300;
											local1901 = local1355;
										}
										local963[local949] = local1349;
										local966[local949] = local1901;
										@Pc(1953) int local1953;
										@Pc(1959) int local1959;
										if (local982 != null && Static214.aBooleanArrayArray5[local86][local1295]) {
											local1953 = local1349 + (local27 << 7);
											local1959 = local1901 + (local43 << 7);
											local982[local949] = arg2.aa(local1953, local1959) - arg5.aa(local1953, local1959);
										}
										if (local991 != null) {
											if (arg2 != null && !Static214.aBooleanArrayArray5[local86][local1295]) {
												local1953 = (local27 << 7) + local1349;
												local1959 = local1901 + (local43 << 7);
												local991[local949] = arg5.aa(local1953, local1959) - arg2.aa(local1953, local1959);
											} else if (arg4 != null && !Static12.aBooleanArrayArray1[local86][local1295]) {
												local1953 = local1349 + (local27 << 7);
												local1959 = (local43 << 7) + local1901;
												local991[local949] = arg4.aa(local1953, local1959) - arg5.aa(local1953, local1959);
											}
										}
										if (local1295 < 8 && Static425.anIntArray596[local1284] >= 0) {
											if (local960 != null) {
												local960[local949] = Static389.anIntArray490[local1284];
											}
											local975[local949] = Static429.anIntArray598[local1284];
											local972[local949] = Static167.anIntArray302[local1284];
											local969[local949] = Static66.anIntArray172[local1284];
										} else {
											if (local77 && Static214.aBooleanArrayArray5[local86][local1295]) {
												local972[local949] = local995;
												local975[local949] = local997;
												local969[local949] = local993;
											} else if (local1349 == 0 && local1901 == 0) {
												local969[local949] = arg3[local27][local43];
												local972[local949] = local1601.anInt3819;
												local975[local949] = local1601.anInt3818;
											} else if (local1349 == 0 && local1901 == 128) {
												local969[local949] = arg3[local27][local61];
												local972[local949] = local1609.anInt3819;
												local975[local949] = local1609.anInt3818;
											} else if (local1349 == 128 && local1901 == 128) {
												local969[local949] = arg3[local41][local61];
												local972[local949] = local1617.anInt3819;
												local975[local949] = local1617.anInt3818;
											} else if (local1349 == 128 && local1901 == 0) {
												local969[local949] = arg3[local41][local43];
												local972[local949] = local1625.anInt3819;
												local975[local949] = local1625.anInt3818;
											} else {
												if (local1349 < 64) {
													if (local1901 >= 64) {
														local972[local949] = local1609.anInt3819;
														local975[local949] = local1609.anInt3818;
													} else {
														local972[local949] = local1601.anInt3819;
														local975[local949] = local1601.anInt3818;
													}
												} else if (local1901 >= 64) {
													local972[local949] = local1617.anInt3819;
													local975[local949] = local1617.anInt3818;
												} else {
													local972[local949] = local1625.anInt3819;
													local975[local949] = local1625.anInt3818;
												}
												local1953 = Static58.method1432(local1349 << 7 >> 7, arg3[local41][local43], arg3[local27][local43]);
												local1959 = Static58.method1432(local1349 << 7 >> 7, arg3[local41][local61], arg3[local27][local61]);
												local969[local949] = Static58.method1432(local1901 << 7 >> 7, local1959, local1953);
											}
											if (local960 != null) {
												local960[local949] = local969[local949];
											}
										}
										local949++;
									}
								}
								if (local86 != 0 && local169.aBoolean314) {
									local75 = true;
								}
							}
							local1019 = arg5.ba(local27, local43);
							local1021 = arg5.ba(local41, local43);
							local1260 = arg5.ba(local41, local61);
							local1266 = arg5.ba(local27, local61);
							if (arg1 > 0) {
								@Pc(2370) boolean local2370 = true;
								if (local108 == 0 && local86 != 0) {
									local2370 = false;
								}
								if (local100 > 0 && local177 != null && !local177.aBoolean485) {
									local2370 = false;
								}
								if (local2370 && local1019 == local1021 && local1019 == local1260 && local1019 == local1266) {
									this.aByteArrayArrayArray12[arg1][local27][local43] = (byte) (this.aByteArrayArrayArray12[arg1][local27][local43] | 0x4);
								}
							}
							local1274 = 0;
							local1279 = 0;
							local1295 = 0;
							if (this.aBoolean312) {
								local1274 = Static340.method5414(local27, local43);
								local1279 = Static51.method7361(local27, local43);
								local1295 = Static143.method2853(local27, local43);
							}
							arg5.IA(local27, local43, local963, local982, local966, local991, local969, local960, local972, local975, local1274, local1279, local1295, local75);
							Static375.method5783(arg1, local27, local43);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!qa;Z[Lclient!ld;[[[I)V")
	public final void method3338(@OriginalArg(0) Class42 arg0, @OriginalArg(2) Class184[] arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(19) int local19;
		@Pc(23) int local23;
		@Pc(27) int local27;
		if (!this.aBoolean312) {
			for (local19 = 0; local19 < 4; local19++) {
				for (local23 = 0; local23 < this.anInt3784; local23++) {
					for (local27 = 0; local27 < this.anInt3786; local27++) {
						if ((Static387.aByteArrayArrayArray18[local19][local23][local27] & 0x1) != 0) {
							@Pc(41) int local41 = local19;
							if ((Static387.aByteArrayArrayArray18[1][local23][local27] & 0x2) != 0) {
								local41 = local19 - 1;
							}
							if (local41 >= 0) {
								arg1[local41].method4588(local23, local27);
							}
						}
					}
				}
			}
		}
		for (local19 = 0; local19 < this.anInt3799; local19++) {
			local23 = 0;
			local27 = 0;
			if (!this.aBoolean312) {
				if (Static506.aBoolean645) {
					local27 = 8;
				}
				if (Static394.aBoolean538) {
					local23 = 2;
				}
				if (Static337.anInt6452 != 0) {
					local23 |= 0x1;
					if (Static22.aBoolean684 | local19 == 0) {
						local27 |= 0x10;
					}
				}
			}
			if (Static394.aBoolean538) {
				local27 |= 0x7;
			}
			if (!Static151.aBoolean274) {
				local27 |= 0x20;
			}
			@Pc(157) int[][] local157 = arg2 == null || local19 >= arg2.length ? this.anIntArrayArrayArray4[local19] : arg2[local19];
			Static348.method5476(local19, arg0.method5796(this.anInt3784, this.anInt3786, this.anIntArrayArrayArray4[local19], local157, local23, local27));
		}
	}
}
