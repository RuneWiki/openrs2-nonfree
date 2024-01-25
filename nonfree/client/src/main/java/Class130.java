import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public class Class130 {

	@OriginalMember(owner = "client!hi", name = "z", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!hi", name = "x", descriptor = "[I")
	private final int[] anIntArray485 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!hi", name = "y", descriptor = "[I")
	private final int[] anIntArray486 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
	public final int anInt6544;

	@OriginalMember(owner = "client!hi", name = "j", descriptor = "Z")
	public final boolean aBoolean453;

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "Lclient!vu;")
	private final Class307 aClass307_4;

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "Lclient!bt;")
	private final Class38 aClass38_4;

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
	protected final int anInt6536;

	@OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
	protected final int anInt6543;

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!hi", name = "B", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!hi", name = "A", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!hi", name = "q", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!hi", name = "u", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(IIIZLclient!vu;Lclient!bt;)V")
	protected Class130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class307 arg4, @OriginalArg(5) Class38 arg5) {
		this.anInt6544 = arg0;
		this.aBoolean453 = arg3;
		this.aClass307_4 = arg4;
		this.aClass38_4 = arg5;
		this.anInt6536 = arg1;
		this.anInt6543 = arg2;
		this.aByteArrayArrayArray10 = new byte[this.anInt6544][this.anInt6536 + 1][this.anInt6543 + 1];
		this.aByteArrayArrayArray14 = new byte[this.anInt6544][this.anInt6536][this.anInt6543];
		this.aByteArrayArrayArray9 = new byte[this.anInt6544][this.anInt6536][this.anInt6543];
		this.aByteArrayArrayArray13 = new byte[this.anInt6544][this.anInt6536][this.anInt6543];
		this.aByteArrayArrayArray11 = new byte[this.anInt6544][this.anInt6536][this.anInt6543];
		this.anIntArrayArrayArray9 = new int[this.anInt6544][this.anInt6536 + 1][this.anInt6543 + 1];
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!qa;BLclient!sa;Lclient!sa;)V")
	public final void method5414(@OriginalArg(0) Class62 arg0, @OriginalArg(2) Class131 arg1, @OriginalArg(3) Class131 arg2) {
		if (Static97.anIntArray194 == null || this.anInt6543 != Static97.anIntArray194.length) {
			Static458.anIntArray600 = new int[this.anInt6543];
			Static117.anIntArray218 = new int[this.anInt6543];
			Static44.anIntArray72 = new int[this.anInt6543];
			Static97.anIntArray194 = new int[this.anInt6543];
			Static117.anIntArray219 = new int[this.anInt6543];
		}
		@Pc(38) int[][] local38 = new int[this.anInt6536][this.anInt6543];
		@Pc(44) int local44;
		for (@Pc(40) int local40 = 0; local40 < this.anInt6544; local40++) {
			for (local44 = 0; local44 < this.anInt6543; local44++) {
				Static97.anIntArray194[local44] = 0;
				Static117.anIntArray219[local44] = 0;
				Static458.anIntArray600[local44] = 0;
				Static44.anIntArray72[local44] = 0;
				Static117.anIntArray218[local44] = 0;
			}
			for (@Pc(73) int local73 = -5; local73 < this.anInt6536; local73++) {
				@Pc(83) int local83;
				@Pc(98) int local98;
				@Pc(164) int local164;
				for (@Pc(77) int local77 = 0; local77 < this.anInt6543; local77++) {
					local83 = local73 + 5;
					@Pc(144) int local144;
					if (this.anInt6536 > local83) {
						local98 = this.aByteArrayArrayArray14[local40][local83][local77] & 0xFF;
						if (local98 > 0) {
							@Pc(108) Class11 local108 = this.aClass38_4.method1059(local98 - 1);
							Static97.anIntArray194[local77] += local108.anInt184;
							Static117.anIntArray219[local77] += local108.anInt178;
							Static458.anIntArray600[local77] += local108.anInt180;
							Static44.anIntArray72[local77] += local108.anInt177;
							local144 = Static117.anIntArray218[local77]++;
						}
					}
					local98 = local73 - 5;
					if (local98 >= 0) {
						local164 = this.aByteArrayArrayArray14[local40][local98][local77] & 0xFF;
						if (local164 > 0) {
							@Pc(174) Class11 local174 = this.aClass38_4.method1059(local164 - 1);
							Static97.anIntArray194[local77] -= local174.anInt184;
							Static117.anIntArray219[local77] -= local174.anInt178;
							Static458.anIntArray600[local77] -= local174.anInt180;
							Static44.anIntArray72[local77] -= local174.anInt177;
							local144 = Static117.anIntArray218[local77]--;
						}
					}
				}
				if (local73 >= 0) {
					local83 = 0;
					local98 = 0;
					local164 = 0;
					@Pc(228) int local228 = 0;
					@Pc(230) int local230 = 0;
					for (@Pc(232) int local232 = -5; local232 < this.anInt6543; local232++) {
						@Pc(238) int local238 = local232 + 5;
						if (local238 < this.anInt6543) {
							local164 += Static458.anIntArray600[local238];
							local228 += Static44.anIntArray72[local238];
							local98 += Static117.anIntArray219[local238];
							local83 += Static97.anIntArray194[local238];
							local230 += Static117.anIntArray218[local238];
						}
						@Pc(280) int local280 = local232 - 5;
						if (local280 >= 0) {
							local98 -= Static117.anIntArray219[local280];
							local164 -= Static458.anIntArray600[local280];
							local228 -= Static44.anIntArray72[local280];
							local230 -= Static117.anIntArray218[local280];
							local83 -= Static97.anIntArray194[local280];
						}
						if (local232 >= 0 && local228 > 0 && local230 > 0) {
							local38[local73][local232] = Static249.method4242(local164 / local230, local98 / local230, local83 * 256 / local228);
						}
					}
				}
			}
			if (Static395.aBoolean499) {
				this.method5417(local38, Static248.aClass131Array4[local40], local40 == 0 ? arg2 : null, arg0, local40 == 0 ? arg1 : null, local40);
			} else {
				this.method5422(local38, Static248.aClass131Array4[local40], local40 == 0 ? arg1 : null, local40 == 0 ? arg2 : null, arg0, local40);
			}
			this.aByteArrayArrayArray14[local40] = null;
			this.aByteArrayArrayArray9[local40] = null;
			this.aByteArrayArrayArray11[local40] = null;
			this.aByteArrayArrayArray13[local40] = null;
		}
		if (!this.aBoolean453) {
			if (Static364.anInt6809 != 0) {
				Static292.method4886();
			}
			if (Static438.aBoolean546) {
				Static16.method590();
			}
		}
		for (local44 = 0; local44 < this.anInt6544; local44++) {
			Static248.aClass131Array4[local44].N();
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIII)V")
	private void method5415(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2) {
		@Pc(17) int local17;
		for (@Pc(3) int local3 = arg2; local3 < arg2 + 64; local3++) {
			for (local17 = arg1; local17 < arg1 + 64; local17++) {
				if (local17 >= 0 && local17 < this.anInt6536 && local3 >= 0 && local3 < this.anInt6543) {
					this.anIntArrayArrayArray9[arg0][local17][local3] = arg0 > 0 ? this.anIntArrayArrayArray9[arg0 - 1][local17][local3] - 240 : 0;
				}
			}
		}
		if (arg1 > 0 && arg1 < this.anInt6536) {
			for (local17 = arg2 + 1; local17 < arg2 + 64; local17++) {
				if (local17 >= 0 && local17 < this.anInt6543) {
					this.anIntArrayArrayArray9[arg0][arg1][local17] = this.anIntArrayArrayArray9[arg0][arg1 - 1][local17];
				}
			}
		}
		if (arg2 > 0 && this.anInt6543 > arg2) {
			for (local17 = arg1 + 1; local17 < arg1 + 64; local17++) {
				if (local17 >= 0 && this.anInt6536 > local17) {
					this.anIntArrayArrayArray9[arg0][local17][arg2] = this.anIntArrayArrayArray9[arg0][local17][arg2 - 1];
				}
			}
		}
		if (arg1 < 0 || arg2 < 0 || arg1 >= this.anInt6536 || arg2 >= this.anInt6543) {
			return;
		}
		if (arg0 != 0) {
			if (arg1 > 0 && this.anIntArrayArrayArray9[arg0 - 1][arg1 - 1][arg2] != this.anIntArrayArrayArray9[arg0][arg1 - 1][arg2]) {
				this.anIntArrayArrayArray9[arg0][arg1][arg2] = this.anIntArrayArrayArray9[arg0][arg1 - 1][arg2];
				return;
			}
			if (arg2 > 0 && this.anIntArrayArrayArray9[arg0 - 1][arg1][arg2 - 1] != this.anIntArrayArrayArray9[arg0][arg1][arg2 - 1]) {
				this.anIntArrayArrayArray9[arg0][arg1][arg2] = this.anIntArrayArrayArray9[arg0][arg1][arg2 - 1];
				return;
			}
			if (arg1 > 0 && arg2 > 0 && this.anIntArrayArrayArray9[arg0 - 1][arg1 - 1][arg2 - 1] != this.anIntArrayArrayArray9[arg0][arg1 - 1][arg2 - 1]) {
				this.anIntArrayArrayArray9[arg0][arg1][arg2] = this.anIntArrayArrayArray9[arg0][arg1 - 1][arg2 - 1];
				return;
			}
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray9[arg0][arg1 - 1][arg2] != 0) {
			this.anIntArrayArrayArray9[arg0][arg1][arg2] = this.anIntArrayArrayArray9[arg0][arg1 - 1][arg2];
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray9[arg0][arg1][arg2 - 1] != 0) {
			this.anIntArrayArrayArray9[arg0][arg1][arg2] = this.anIntArrayArrayArray9[arg0][arg1][arg2 - 1];
			return;
		}
		if (arg1 > 0 && arg2 > 0 && this.anIntArrayArrayArray9[arg0][arg1 - 1][arg2 - 1] != 0) {
			this.anIntArrayArrayArray9[arg0][arg1][arg2] = this.anIntArrayArrayArray9[arg0][arg1 - 1][arg2 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!co;IBIIIZIIII)V")
	private void method5416(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg7 == 1) {
			arg4 = 1;
		} else if (arg7 == 2) {
			arg9 = 1;
			arg4 = 1;
		} else if (arg7 == 3) {
			arg9 = 1;
		}
		@Pc(81) int local81;
		if (arg6 < 0 || this.anInt6536 <= arg6 || arg3 < 0 || arg3 >= this.anInt6543) {
			while (true) {
				local81 = arg0.method4220();
				if (local81 == 0) {
					return;
				}
				if (local81 == 1) {
					arg0.method4220();
					return;
				}
				if (local81 <= 49) {
					arg0.method4220();
				}
			}
			return;
		}
		if (!this.aBoolean453 && !arg5) {
			Static429.aByteArrayArrayArray17[arg8][arg6][arg3] = 0;
		}
		while (true) {
			local81 = arg0.method4220();
			if (local81 == 0) {
				if (this.aBoolean453) {
					this.anIntArrayArrayArray9[0][arg9 + arg6][arg3 + arg4] = 0;
					return;
				} else if (arg8 == 0) {
					this.anIntArrayArrayArray9[0][arg9 + arg6][arg3 + arg4] = -Static123.method2326(arg2 + 932731, 556238 - -arg1) * 8 << 0;
					return;
				} else {
					this.anIntArrayArrayArray9[arg8][arg9 + arg6][arg3 + arg4] = this.anIntArrayArrayArray9[arg8 - 1][arg9 + arg6][arg3 + arg4] - 240;
					return;
				}
			}
			if (local81 == 1) {
				@Pc(169) int local169 = arg0.method4220();
				if (this.aBoolean453) {
					this.anIntArrayArrayArray9[0][arg6 + arg9][arg4 + arg3] = local169 * 8 << 0;
					return;
				}
				if (local169 == 1) {
					local169 = 0;
				}
				if (arg8 != 0) {
					this.anIntArrayArrayArray9[arg8][arg6 + arg9][arg4 + arg3] = this.anIntArrayArrayArray9[arg8 - 1][arg6 + arg9][arg3 + arg4] - (local169 * 8 << 0);
					return;
				}
				this.anIntArrayArrayArray9[0][arg6 + arg9][arg3 + arg4] = -local169 * 8 << 0;
				return;
			}
			if (local81 <= 49) {
				if (arg5) {
					arg0.method4220();
				} else {
					this.aByteArrayArrayArray9[arg8][arg6][arg3] = arg0.method4196();
					this.aByteArrayArrayArray11[arg8][arg6][arg3] = (byte) ((local81 - 2) / 4);
					this.aByteArrayArrayArray13[arg8][arg6][arg3] = (byte) (arg7 + local81 - 2 & 0x3);
				}
			} else if (local81 <= 81) {
				if (!this.aBoolean453 && !arg5) {
					Static429.aByteArrayArrayArray17[arg8][arg6][arg3] = (byte) (local81 - 49);
				}
			} else if (!arg5) {
				this.aByteArrayArrayArray14[arg8][arg6][arg3] = (byte) (local81 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "([[ILclient!sa;Lclient!sa;Lclient!qa;Lclient!sa;II)V")
	private void method5417(@OriginalArg(0) int[][] arg0, @OriginalArg(1) Class131 arg1, @OriginalArg(2) Class131 arg2, @OriginalArg(3) Class62 arg3, @OriginalArg(4) Class131 arg4, @OriginalArg(5) int arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray11[arg5];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray13[arg5];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray14[arg5];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray9[arg5];
		for (@Pc(27) int local27 = 0; local27 < this.anInt6536; local27++) {
			@Pc(41) int local41 = this.anInt6536 - 1 <= local27 ? local27 : local27 + 1;
			for (@Pc(43) int local43 = 0; local43 < this.anInt6543; local43++) {
				@Pc(57) int local57 = local43 < this.anInt6543 - 1 ? local43 + 1 : local43;
				if (Static421.anInt7440 == -1 || Static189.method4028(local43, local27, Static421.anInt7440, arg5)) {
					@Pc(71) boolean local71 = false;
					@Pc(73) boolean local73 = false;
					@Pc(76) boolean[] local76 = new boolean[4];
					@Pc(82) int local82 = local10[local27][local43];
					@Pc(88) int local88 = local15[local27][local43];
					@Pc(96) int local96 = local25[local27][local43] & 0xFF;
					@Pc(104) int local104 = local20[local27][local43] & 0xFF;
					@Pc(112) int local112 = local20[local27][local57] & 0xFF;
					@Pc(120) int local120 = local20[local41][local57] & 0xFF;
					@Pc(128) int local128 = local20[local41][local43] & 0xFF;
					if (local96 != 0 || local104 != 0) {
						@Pc(147) Class264 local147 = local96 == 0 ? null : this.aClass307_4.method7176(local96 - 1);
						@Pc(159) Class11 local159 = local104 == 0 ? null : this.aClass38_4.method1059(local104 - 1);
						if (local82 == 0 && local147 == null) {
							local82 = 12;
						}
						@Pc(170) Class264 local170 = local147;
						if (local147 != null) {
							if (local147.anInt7714 == -1 && local147.anInt7712 == -1) {
								local170 = local147;
								local147 = null;
							} else if (local159 != null && local82 != 0) {
								local73 = local147.aBoolean549;
							}
						}
						@Pc(282) int local282;
						@Pc(312) int local312;
						@Pc(366) int local366;
						@Pc(375) int local375;
						if ((local82 == 0 || local82 == 12) && local27 > 0 && local43 > 0 && this.anInt6536 > local27 && local43 < this.anInt6543) {
							@Pc(242) int local242 = local104 == local20[local41][local57] ? 1 : -1;
							@Pc(261) int local261 = local20[local41][local43 - 1] == local104 ? 1 : -1;
							local282 = local20[local27 - 1][local43 - 1] == local104 ? 1 : -1;
							if (local104 == local20[local27][local43 - 1]) {
								local282++;
								local261++;
							} else {
								local261--;
								local282--;
							}
							local312 = local104 == local20[local27 - 1][local57] ? 1 : -1;
							if (local20[local41][local43] == local104) {
								local242++;
								local261++;
							} else {
								local242--;
								local261--;
							}
							if (local104 == local20[local27][local57]) {
								local242++;
								local312++;
							} else {
								local312--;
								local242--;
							}
							if (local20[local27 - 1][local43] == local104) {
								local282++;
								local312++;
							} else {
								local282--;
								local312--;
							}
							local366 = local282 - local242;
							if (local366 < 0) {
								local366 = -local366;
							}
							local375 = local261 - local312;
							if (local375 < 0) {
								local375 = -local375;
							}
							if (local366 == local375) {
								local366 = arg1.ba(local27, local43) - arg1.ba(local41, local57);
								if (local366 < 0) {
									local366 = -local366;
								}
								local375 = arg1.ba(local41, local43) - arg1.ba(local27, local57);
								if (local375 < 0) {
									local375 = -local375;
								}
							}
							local88 = local366 >= local375 ? 0 : 1;
						}
						for (local282 = 0; local282 < 13; local282++) {
							Static63.anIntArray158[local282] = -1;
							Static302.anIntArray412[local282] = 1;
						}
						@Pc(458) boolean[] local458 = local147 != null && local147.aBoolean549 ? Static304.aBooleanArrayArray2[local82] : Static275.aBooleanArrayArray1[local82];
						this.method5418(this.anInt6536, local76, local27, this.anInt6543, local88, local147, local10, local159, local25, local43, local82, arg3, local15);
						@Pc(487) boolean local487 = local147 != null && local147.anInt7712 != local147.anInt7714;
						if (!local487) {
							for (local312 = 0; local312 < 8; local312++) {
								if (Static63.anIntArray158[local312] >= 0 && Static514.anIntArray673[local312] != Static309.anIntArray416[local312]) {
									local487 = true;
									break;
								}
							}
						}
						if (!local458[local88 + 1 & 0x3]) {
							local76[1] = Static186.method3140(local76[1], (Static302.anIntArray412[4] & Static302.anIntArray412[2]) == 0);
						}
						if (!local458[local88 + 3 & 0x3]) {
							local76[3] = Static186.method3140(local76[3], (Static302.anIntArray412[6] & Static302.anIntArray412[0]) == 0);
						}
						if (!local458[local88 & 0x3]) {
							local76[0] = Static186.method3140(local76[0], (Static302.anIntArray412[2] & Static302.anIntArray412[0]) == 0);
						}
						if (!local458[local88 + 2 & 0x3]) {
							local76[2] = Static186.method3140(local76[2], (Static302.anIntArray412[6] & Static302.anIntArray412[4]) == 0);
						}
						if (!local73 && (local82 == 0 || local82 == 12)) {
							if (local76[0] && !local76[1] && !local76[2] && local76[3]) {
								local88 = 0;
								local82 = local82 == 0 ? 13 : 14;
								local76[0] = local76[3] = false;
							} else if (local76[0] && local76[1] && !local76[2] && !local76[3]) {
								local82 = local82 == 0 ? 13 : 14;
								local76[0] = local76[1] = false;
								local88 = 3;
							} else if (!local76[0] && local76[1] && local76[2] && !local76[3]) {
								local88 = 2;
								local76[1] = local76[2] = false;
								local82 = local82 == 0 ? 13 : 14;
							} else if (!local76[0] && !local76[1] && local76[2] && local76[3]) {
								local88 = 1;
								local76[2] = local76[3] = false;
								local82 = local82 == 0 ? 13 : 14;
							}
						}
						@Pc(797) boolean local797 = !local73 && !local76[0] && !local76[2] && !local76[1] && !local76[3];
						@Pc(799) int[] local799 = null;
						@Pc(815) int[] local815;
						@Pc(831) int[] local831;
						@Pc(835) int[] local835;
						if (local797) {
							local366 = local159 == null ? 0 : Static307.anIntArray415[local82];
							local375 = local147 == null ? 0 : Static338.anIntArray473[local82];
							local835 = Static502.anIntArrayArray72[local82];
							local815 = Static330.anIntArrayArray47[local82];
							local831 = Static273.anIntArrayArray37[local82];
						} else if (local73) {
							local375 = local147 == null ? 0 : Static85.anIntArray174[local82];
							local815 = Static509.anIntArrayArray73[local82];
							local799 = Static378.anIntArrayArray58[local82];
							local366 = local159 == null ? 0 : Static275.anIntArray377[local82];
							local831 = Static529.anIntArrayArray79[local82];
							local835 = Static100.anIntArrayArray18[local82];
						} else {
							local366 = local159 == null ? 0 : Static133.anIntArray231[local82];
							local835 = Static394.anIntArrayArray59[local82];
							local815 = Static328.anIntArrayArray46[local82];
							local799 = Static160.anIntArrayArray22[local82];
							local831 = Static191.anIntArrayArray52[local82];
							local375 = local147 == null ? 0 : Static476.anIntArray643[local82];
						}
						@Pc(901) int local901 = local366 + local375;
						if (local901 <= 0) {
							Static125.method2376(arg5, local27, local43);
						} else {
							if (local76[0]) {
								local901++;
							}
							if (local76[2]) {
								local901++;
							}
							if (local76[1]) {
								local901++;
							}
							if (local76[3]) {
								local901++;
							}
							@Pc(934) int local934 = 0;
							@Pc(936) int local936 = 0;
							@Pc(940) int local940 = local901 * 3;
							@Pc(947) int[] local947 = local487 ? new int[local940] : null;
							@Pc(950) int[] local950 = new int[local940];
							@Pc(953) int[] local953 = new int[local940];
							@Pc(956) int[] local956 = new int[local940];
							@Pc(959) int[] local959 = new int[local940];
							@Pc(962) int[] local962 = new int[local940];
							@Pc(969) int[] local969 = arg4 == null ? null : new int[local940];
							@Pc(978) int[] local978 = arg4 == null && arg2 == null ? null : new int[local940];
							@Pc(980) int local980 = -1;
							@Pc(982) int local982 = -1;
							@Pc(984) int local984 = 256;
							@Pc(1090) byte local1090;
							@Pc(1034) int local1034;
							@Pc(1036) int local1036;
							@Pc(1269) int local1269;
							@Pc(1275) int local1275;
							@Pc(1284) int local1284;
							@Pc(1289) int local1289;
							@Pc(1309) int local1309;
							@Pc(1294) int local1294;
							@Pc(1307) int local1307;
							@Pc(1360) int local1360;
							@Pc(1366) int local1366;
							if (local147 != null) {
								local980 = local147.anInt7714;
								local982 = arg3.method7062() ? local147.anInt7717 : local147.anInt7716;
								local984 = local147.anInt7715;
								local1034 = Static227.method3582(arg3, local147);
								for (local1036 = 0; local1036 < local375; local1036++) {
									if (local76[-local88 & 0x3] && local934 == local799[0]) {
										Static149.anIntArray244[0] = local815[local934];
										Static149.anIntArray244[1] = 1;
										Static149.anIntArray244[2] = local835[local934];
										Static149.anIntArray244[3] = 1;
										Static149.anIntArray244[4] = local831[local934];
										Static149.anIntArray244[5] = local835[local934];
										local1090 = 6;
									} else if (local76[2 - local88 & 0x3] && local934 == local799[2]) {
										Static149.anIntArray244[0] = local815[local934];
										Static149.anIntArray244[1] = 5;
										Static149.anIntArray244[2] = local835[local934];
										Static149.anIntArray244[3] = 5;
										Static149.anIntArray244[4] = local831[local934];
										local1090 = 6;
										Static149.anIntArray244[5] = local835[local934];
									} else if (local76[1 - local88 & 0x3] && local799[1] == local934) {
										Static149.anIntArray244[0] = local815[local934];
										Static149.anIntArray244[1] = 3;
										Static149.anIntArray244[2] = local835[local934];
										Static149.anIntArray244[3] = 3;
										Static149.anIntArray244[4] = local831[local934];
										Static149.anIntArray244[5] = local835[local934];
										local1090 = 6;
									} else if (local76[3 - local88 & 0x3] && local799[3] == local934) {
										Static149.anIntArray244[0] = local815[local934];
										Static149.anIntArray244[1] = 7;
										Static149.anIntArray244[2] = local835[local934];
										Static149.anIntArray244[3] = 7;
										Static149.anIntArray244[4] = local831[local934];
										Static149.anIntArray244[5] = local835[local934];
										local1090 = 6;
									} else {
										Static149.anIntArray244[0] = local815[local934];
										Static149.anIntArray244[1] = local831[local934];
										Static149.anIntArray244[2] = local835[local934];
										local1090 = 3;
									}
									local934++;
									for (local1269 = 0; local1269 < local1090; local1269++) {
										local1275 = Static149.anIntArray244[local1269];
										local1284 = local1275 - local88 * 2 & 0x7;
										local1289 = this.anIntArray485[local1275];
										local1294 = this.anIntArray486[local1275];
										if (local88 == 1) {
											local1307 = 128 - local1289;
											local1309 = local1294;
										} else if (local88 == 2) {
											local1309 = 128 - local1289;
											local1307 = 128 - local1294;
										} else if (local88 == 3) {
											local1307 = local1289;
											local1309 = 128 - local1294;
										} else {
											local1307 = local1294;
											local1309 = local1289;
										}
										local950[local936] = local1309;
										local953[local936] = local1307;
										if (local969 != null && Static399.aBooleanArrayArray5[local82][local1275]) {
											local1360 = (local27 << 7) + local1309;
											local1366 = local1307 + (local43 << 7);
											local969[local936] = arg4.aa(local1360, local1366) - arg1.aa(local1360, local1366);
										}
										if (local978 != null) {
											if (arg4 != null && !Static399.aBooleanArrayArray5[local82][local1275]) {
												local1360 = (local27 << 7) + local1309;
												local1366 = local1307 + (local43 << 7);
												local978[local936] = arg1.aa(local1360, local1366) - arg4.aa(local1360, local1366);
											} else if (arg2 != null && !Static325.aBooleanArrayArray3[local82][local1275]) {
												local1360 = local1309 + (local27 << 7);
												local1366 = local1307 + (local43 << 7);
												local978[local936] = arg2.aa(local1360, local1366) - arg1.aa(local1360, local1366);
											}
										}
										if (local1275 < 8 && Static63.anIntArray158[local1284] > local147.anInt7710) {
											if (local947 != null) {
												local947[local936] = Static309.anIntArray416[local1284];
											}
											local962[local936] = Static114.anIntArray216[local1284];
											local959[local936] = Static290.anIntArray400[local1284];
											local956[local936] = Static514.anIntArray673[local1284];
										} else {
											if (local947 != null) {
												local947[local936] = local1034;
											}
											local959[local936] = arg3.method7062() ? local147.anInt7717 : local147.anInt7716;
											local962[local936] = local147.anInt7715;
											local956[local936] = local980;
										}
										local936++;
									}
								}
								if (!this.aBoolean453 && arg5 == 0) {
									Static312.method5066(local27, local43, local147.anInt7722, local147.anInt7709 * 8, local147.anInt7713);
								}
								if (local82 != 12 && local147.anInt7714 != -1 && local147.aBoolean548) {
									local71 = true;
								}
							} else if (local797) {
								local934 = Static338.anIntArray473[local82];
							} else if (local73) {
								local934 = Static85.anIntArray174[local82];
							} else {
								local934 = Static476.anIntArray643[local82];
							}
							if (local159 != null) {
								if (local112 == 0) {
									local112 = local104;
								}
								if (local120 == 0) {
									local120 = local104;
								}
								if (local128 == 0) {
									local128 = local104;
								}
								@Pc(1580) Class11 local1580 = this.aClass38_4.method1059(local104 - 1);
								@Pc(1588) Class11 local1588 = this.aClass38_4.method1059(local112 - 1);
								@Pc(1596) Class11 local1596 = this.aClass38_4.method1059(local120 - 1);
								@Pc(1604) Class11 local1604 = this.aClass38_4.method1059(local128 - 1);
								for (local1284 = 0; local1284 < local366; local1284++) {
									if (local76[-local88 & 0x3] && local799[0] == local934) {
										Static149.anIntArray244[0] = local815[local934];
										Static149.anIntArray244[1] = 1;
										Static149.anIntArray244[2] = local835[local934];
										Static149.anIntArray244[3] = 1;
										Static149.anIntArray244[4] = local831[local934];
										Static149.anIntArray244[5] = local835[local934];
										local1090 = 6;
									} else if (local76[2 - local88 & 0x3] && local934 == local799[2]) {
										Static149.anIntArray244[0] = local815[local934];
										Static149.anIntArray244[1] = 5;
										Static149.anIntArray244[2] = local835[local934];
										Static149.anIntArray244[3] = 5;
										Static149.anIntArray244[4] = local831[local934];
										local1090 = 6;
										Static149.anIntArray244[5] = local835[local934];
									} else if (local76[1 - local88 & 0x3] && local799[1] == local934) {
										Static149.anIntArray244[0] = local815[local934];
										Static149.anIntArray244[1] = 3;
										Static149.anIntArray244[2] = local835[local934];
										Static149.anIntArray244[3] = 3;
										Static149.anIntArray244[4] = local831[local934];
										Static149.anIntArray244[5] = local835[local934];
										local1090 = 6;
									} else if (local76[3 - local88 & 0x3] && local799[3] == local934) {
										Static149.anIntArray244[0] = local815[local934];
										Static149.anIntArray244[1] = 7;
										Static149.anIntArray244[2] = local835[local934];
										Static149.anIntArray244[3] = 7;
										Static149.anIntArray244[4] = local831[local934];
										Static149.anIntArray244[5] = local835[local934];
										local1090 = 6;
									} else {
										Static149.anIntArray244[0] = local815[local934];
										Static149.anIntArray244[1] = local831[local934];
										Static149.anIntArray244[2] = local835[local934];
										local1090 = 3;
									}
									local934++;
									for (local1289 = 0; local1289 < local1090; local1289++) {
										local1309 = Static149.anIntArray244[local1289];
										local1294 = local1309 - local88 * 2 & 0x7;
										local1307 = this.anIntArray485[local1309];
										local1366 = this.anIntArray486[local1309];
										@Pc(1878) int local1878;
										if (local88 == 1) {
											local1360 = local1366;
											local1878 = 128 - local1307;
										} else if (local88 == 2) {
											local1360 = 128 - local1307;
											local1878 = 128 - local1366;
										} else if (local88 == 3) {
											local1878 = local1307;
											local1360 = 128 - local1366;
										} else {
											local1878 = local1366;
											local1360 = local1307;
										}
										local950[local936] = local1360;
										local953[local936] = local1878;
										@Pc(1932) int local1932;
										@Pc(1938) int local1938;
										if (local969 != null && Static399.aBooleanArrayArray5[local82][local1309]) {
											local1932 = local1360 + (local27 << 7);
											local1938 = local1878 + (local43 << 7);
											local969[local936] = arg4.aa(local1932, local1938) - arg1.aa(local1932, local1938);
										}
										if (local978 != null) {
											if (arg4 != null && !Static399.aBooleanArrayArray5[local82][local1309]) {
												local1932 = local1360 + (local27 << 7);
												local1938 = (local43 << 7) + local1878;
												local978[local936] = arg1.aa(local1932, local1938) - arg4.aa(local1932, local1938);
											} else if (arg2 != null && !Static325.aBooleanArrayArray3[local82][local1309]) {
												local1932 = local1360 + (local27 << 7);
												local1938 = (local43 << 7) + local1878;
												local978[local936] = arg2.aa(local1932, local1938) - arg1.aa(local1932, local1938);
											}
										}
										if (local1309 < 8 && Static63.anIntArray158[local1294] >= 0) {
											if (local947 != null) {
												local947[local936] = Static309.anIntArray416[local1294];
											}
											local962[local936] = Static114.anIntArray216[local1294];
											local959[local936] = Static290.anIntArray400[local1294];
											local956[local936] = Static514.anIntArray673[local1294];
										} else {
											if (local73 && Static399.aBooleanArrayArray5[local82][local1309]) {
												local959[local936] = local982;
												local962[local936] = local984;
												local956[local936] = local980;
											} else if (local1360 == 0 && local1878 == 0) {
												local956[local936] = arg0[local27][local43];
												local959[local936] = local1580.anInt173;
												local962[local936] = local1580.anInt181;
											} else if (local1360 == 0 && local1878 == 128) {
												local956[local936] = arg0[local27][local57];
												local959[local936] = local1588.anInt173;
												local962[local936] = local1588.anInt181;
											} else if (local1360 == 128 && local1878 == 128) {
												local956[local936] = arg0[local41][local57];
												local959[local936] = local1596.anInt173;
												local962[local936] = local1596.anInt181;
											} else if (local1360 == 128 && local1878 == 0) {
												local956[local936] = arg0[local41][local43];
												local959[local936] = local1604.anInt173;
												local962[local936] = local1604.anInt181;
											} else {
												if (local1360 < 64) {
													if (local1878 < 64) {
														local959[local936] = local1580.anInt173;
														local962[local936] = local1580.anInt181;
													} else {
														local959[local936] = local1588.anInt173;
														local962[local936] = local1588.anInt181;
													}
												} else if (local1878 >= 64) {
													local959[local936] = local1596.anInt173;
													local962[local936] = local1596.anInt181;
												} else {
													local959[local936] = local1604.anInt173;
													local962[local936] = local1604.anInt181;
												}
												local1932 = Static418.method6024(local1360 << 7 >> 7, arg0[local27][local43], arg0[local41][local43]);
												local1938 = Static418.method6024(local1360 << 7 >> 7, arg0[local27][local57], arg0[local41][local57]);
												local956[local936] = Static418.method6024(local1878 << 7 >> 7, local1932, local1938);
											}
											if (local947 != null) {
												local947[local936] = local956[local936];
											}
										}
										local936++;
									}
								}
								if (local82 != 0 && local159.aBoolean10) {
									local71 = true;
								}
							}
							local1034 = arg1.ba(local27, local43);
							local1036 = arg1.ba(local41, local43);
							local1269 = arg1.ba(local41, local57);
							local1275 = arg1.ba(local27, local57);
							if (arg5 > 0) {
								@Pc(2338) boolean local2338 = true;
								if (local104 == 0 && local82 != 0) {
									local2338 = false;
								}
								if (local96 > 0 && local170 != null && !local170.aBoolean550) {
									local2338 = false;
								}
								if (local2338 && local1034 == local1036 && local1269 == local1034 && local1275 == local1034) {
									this.aByteArrayArrayArray10[arg5][local27][local43] = (byte) (this.aByteArrayArrayArray10[arg5][local27][local43] | 0x4);
								}
							}
							local1284 = 0;
							local1289 = 0;
							local1309 = 0;
							if (this.aBoolean453) {
								local1284 = Static112.method2226(local27, local43);
								local1289 = Static180.method3076(local27, local43);
								local1309 = Static19.method6151(local27, local43);
							}
							arg1.IA(local27, local43, local950, local969, local953, local978, local956, local947, local959, local962, local1284, local1289, local1309, local71);
							Static125.method2376(arg5, local27, local43);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I[ZIIIILclient!sb;[[BLclient!af;[[BIILclient!qa;[[B)V")
	private void method5418(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class264 arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) Class11 arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class62 arg11, @OriginalArg(13) byte[][] arg12) {
		@Pc(18) boolean[] local18 = arg5 != null && arg5.aBoolean549 ? Static304.aBooleanArrayArray2[arg10] : Static275.aBooleanArrayArray1[arg10];
		@Pc(37) int local37;
		@Pc(47) Class264 local47;
		@Pc(65) byte local65;
		@Pc(81) int local81;
		@Pc(86) int local86;
		if (arg9 > 0) {
			if (arg2 > 0) {
				local37 = arg8[arg2 - 1][arg9 - 1] & 0xFF;
				if (local37 > 0) {
					local47 = this.aClass307_4.method7176(local37 - 1);
					if (local47.anInt7714 != -1 && local47.aBoolean549) {
						local65 = arg6[arg2 - 1][arg9 - 1];
						local81 = arg12[arg2 - 1][arg9 - 1] * 2 + 4 & 0x7;
						local86 = Static227.method3582(arg11, local47);
						if (Static399.aBooleanArrayArray5[local65][local81]) {
							Static514.anIntArray673[0] = local47.anInt7714;
							Static309.anIntArray416[0] = local86;
							Static290.anIntArray400[0] = arg11.method7062() ? local47.anInt7717 : local47.anInt7716;
							Static114.anIntArray216[0] = local47.anInt7715;
							Static63.anIntArray158[0] = local47.anInt7710;
							Static302.anIntArray412[0] = 256;
						}
					}
				}
			}
			if (arg0 - 1 > arg2) {
				local37 = arg8[arg2 + 1][arg9 - 1] & 0xFF;
				if (local37 > 0) {
					local47 = this.aClass307_4.method7176(local37 - 1);
					if (local47.anInt7714 != -1 && local47.aBoolean549) {
						local65 = arg6[arg2 + 1][arg9 - 1];
						local81 = arg12[arg2 + 1][arg9 - 1] * 2 + 6 & 0x7;
						local86 = Static227.method3582(arg11, local47);
						if (Static399.aBooleanArrayArray5[local65][local81]) {
							Static514.anIntArray673[2] = local47.anInt7714;
							Static309.anIntArray416[2] = local86;
							Static290.anIntArray400[2] = arg11.method7062() ? local47.anInt7717 : local47.anInt7716;
							Static114.anIntArray216[2] = local47.anInt7715;
							Static63.anIntArray158[2] = local47.anInt7710;
							Static302.anIntArray412[2] = 512;
						}
					}
				}
			}
		}
		if (arg9 < arg3 - 1) {
			if (arg2 > 0) {
				local37 = arg8[arg2 - 1][arg9 + 1] & 0xFF;
				if (local37 > 0) {
					local47 = this.aClass307_4.method7176(local37 - 1);
					if (local47.anInt7714 != -1 && local47.aBoolean549) {
						local65 = arg6[arg2 - 1][arg9 + 1];
						local81 = arg12[arg2 - 1][arg9 + 1] * 2 + 2 & 0x7;
						local86 = Static227.method3582(arg11, local47);
						if (Static399.aBooleanArrayArray5[local65][local81]) {
							Static514.anIntArray673[6] = local47.anInt7714;
							Static309.anIntArray416[6] = local86;
							Static290.anIntArray400[6] = arg11.method7062() ? local47.anInt7717 : local47.anInt7716;
							Static114.anIntArray216[6] = local47.anInt7715;
							Static63.anIntArray158[6] = local47.anInt7710;
							Static302.anIntArray412[6] = 64;
						}
					}
				}
			}
			if (arg2 < arg0 - 1) {
				local37 = arg8[arg2 + 1][arg9 + 1] & 0xFF;
				if (local37 > 0) {
					local47 = this.aClass307_4.method7176(local37 - 1);
					if (local47.anInt7714 != -1 && local47.aBoolean549) {
						local65 = arg6[arg2 + 1][arg9 + 1];
						local81 = --(arg12[arg2 + 1][arg9 + 1] * 2) & 0x7;
						local86 = Static227.method3582(arg11, local47);
						if (Static399.aBooleanArrayArray5[local65][local81]) {
							Static514.anIntArray673[4] = local47.anInt7714;
							Static309.anIntArray416[4] = local86;
							Static290.anIntArray400[4] = arg11.method7062() ? local47.anInt7717 : local47.anInt7716;
							Static114.anIntArray216[4] = local47.anInt7715;
							Static63.anIntArray158[4] = local47.anInt7710;
							Static302.anIntArray412[4] = 128;
						}
					}
				}
			}
		}
		@Pc(534) int local534;
		@Pc(539) int local539;
		@Pc(541) int local541;
		@Pc(502) byte local502;
		if (arg9 > 0) {
			local37 = arg8[arg2][arg9 - 1] & 0xFF;
			if (local37 > 0) {
				local47 = this.aClass307_4.method7176(local37 - 1);
				if (local47.anInt7714 != -1) {
					local65 = arg6[arg2][arg9 - 1];
					local502 = arg12[arg2][arg9 - 1];
					if (local47.aBoolean549) {
						local86 = 2;
						local534 = local502 * 2 + 4;
						local539 = Static227.method3582(arg11, local47);
						for (local541 = 0; local541 < 3; local541++) {
							local86 &= 0x7;
							local534 &= 0x7;
							if (Static399.aBooleanArrayArray5[local65][local534] && local47.anInt7710 >= Static63.anIntArray158[local86]) {
								Static514.anIntArray673[local86] = local47.anInt7714;
								Static309.anIntArray416[local86] = local539;
								Static290.anIntArray400[local86] = arg11.method7062() ? local47.anInt7717 : local47.anInt7716;
								Static114.anIntArray216[local86] = local47.anInt7715;
								if (Static63.anIntArray158[local86] == local47.anInt7710) {
									Static302.anIntArray412[local86] |= 0x20;
								} else {
									Static302.anIntArray412[local86] = 32;
								}
								Static63.anIntArray158[local86] = local47.anInt7710;
							}
							local86--;
							local534++;
						}
						if (!local18[arg4 & 0x3]) {
							arg1[0] = Static304.aBooleanArrayArray2[local65][local502 + 2 & 0x3];
						}
					} else if (!local18[arg4 & 0x3]) {
						arg1[0] = Static275.aBooleanArrayArray1[local65][local502 + 2 & 0x3];
					}
				}
			}
		}
		if (arg3 - 1 > arg9) {
			local37 = arg8[arg2][arg9 + 1] & 0xFF;
			if (local37 > 0) {
				local47 = this.aClass307_4.method7176(local37 - 1);
				if (local47.anInt7714 != -1) {
					local65 = arg6[arg2][arg9 + 1];
					local502 = arg12[arg2][arg9 + 1];
					if (local47.aBoolean549) {
						local86 = 4;
						local534 = local502 * 2 + 2;
						local539 = Static227.method3582(arg11, local47);
						for (local541 = 0; local541 < 3; local541++) {
							local534 &= 0x7;
							local86 &= 0x7;
							if (Static399.aBooleanArrayArray5[local65][local534] && local47.anInt7710 >= Static63.anIntArray158[local86]) {
								Static514.anIntArray673[local86] = local47.anInt7714;
								Static309.anIntArray416[local86] = local539;
								Static290.anIntArray400[local86] = arg11.method7062() ? local47.anInt7717 : local47.anInt7716;
								Static114.anIntArray216[local86] = local47.anInt7715;
								if (Static63.anIntArray158[local86] == local47.anInt7710) {
									Static302.anIntArray412[local86] |= 0x10;
								} else {
									Static302.anIntArray412[local86] = 16;
								}
								Static63.anIntArray158[local86] = local47.anInt7710;
							}
							local534--;
							local86++;
						}
						if (!local18[arg4 + 2 & 0x3]) {
							arg1[2] = Static304.aBooleanArrayArray2[local65][--local502 & 0x3];
						}
					} else if (!local18[arg4 + 2 & 0x3]) {
						arg1[2] = Static275.aBooleanArrayArray1[local65][local502 & 0x3];
					}
				}
			}
		}
		if (arg2 > 0) {
			local37 = arg8[arg2 - 1][arg9] & 0xFF;
			if (local37 > 0) {
				local47 = this.aClass307_4.method7176(local37 - 1);
				if (local47.anInt7714 != -1) {
					local65 = arg6[arg2 - 1][arg9];
					local502 = arg12[arg2 - 1][arg9];
					if (local47.aBoolean549) {
						local86 = 6;
						local534 = local502 * 2 + 4;
						local539 = Static227.method3582(arg11, local47);
						for (local541 = 0; local541 < 3; local541++) {
							local534 &= 0x7;
							local86 &= 0x7;
							if (Static399.aBooleanArrayArray5[local65][local534] && Static63.anIntArray158[local86] <= local47.anInt7710) {
								Static514.anIntArray673[local86] = local47.anInt7714;
								Static309.anIntArray416[local86] = local539;
								Static290.anIntArray400[local86] = arg11.method7062() ? local47.anInt7717 : local47.anInt7716;
								Static114.anIntArray216[local86] = local47.anInt7715;
								if (Static63.anIntArray158[local86] == local47.anInt7710) {
									Static302.anIntArray412[local86] |= 0x8;
								} else {
									Static302.anIntArray412[local86] = 8;
								}
								Static63.anIntArray158[local86] = local47.anInt7710;
							}
							local86++;
							local534--;
						}
						if (!local18[arg4 + 3 & 0x3]) {
							arg1[3] = Static304.aBooleanArrayArray2[local65][local502 + 1 & 0x3];
						}
					} else if (!local18[arg4 + 3 & 0x3]) {
						arg1[3] = Static275.aBooleanArrayArray1[local65][local502 + 1 & 0x3];
					}
				}
			}
		}
		if (arg0 - 1 > arg2) {
			local37 = arg8[arg2 + 1][arg9] & 0xFF;
			if (local37 > 0) {
				local47 = this.aClass307_4.method7176(local37 - 1);
				if (local47.anInt7714 != -1) {
					local65 = arg6[arg2 + 1][arg9];
					local502 = arg12[arg2 + 1][arg9];
					if (local47.aBoolean549) {
						local86 = 4;
						local534 = local502 * 2 + 6;
						local539 = Static227.method3582(arg11, local47);
						for (local541 = 0; local541 < 3; local541++) {
							local86 &= 0x7;
							local534 &= 0x7;
							if (Static399.aBooleanArrayArray5[local65][local534] && local47.anInt7710 >= Static63.anIntArray158[local86]) {
								Static514.anIntArray673[local86] = local47.anInt7714;
								Static309.anIntArray416[local86] = local539;
								Static290.anIntArray400[local86] = arg11.method7062() ? local47.anInt7717 : local47.anInt7716;
								Static114.anIntArray216[local86] = local47.anInt7715;
								if (Static63.anIntArray158[local86] == local47.anInt7710) {
									Static302.anIntArray412[local86] |= 0x4;
								} else {
									Static302.anIntArray412[local86] = 4;
								}
								Static63.anIntArray158[local86] = local47.anInt7710;
							}
							local534++;
							local86--;
						}
						if (!local18[arg4 + 1 & 0x3]) {
							arg1[1] = Static304.aBooleanArrayArray2[local65][local502 + 3 & 0x3];
						}
					} else if (!local18[arg4 + 1 & 0x3]) {
						arg1[1] = Static275.aBooleanArrayArray1[local65][local502 + 3 & 0x3];
					}
				}
			}
		}
		if (arg5 == null) {
			return;
		}
		local37 = Static227.method3582(arg11, arg5);
		if (!arg5.aBoolean549) {
			return;
		}
		for (@Pc(1231) int local1231 = 0; local1231 < 8; local1231++) {
			@Pc(1242) int local1242 = local1231 - arg4 * 2 & 0x7;
			if (Static399.aBooleanArrayArray5[arg10][local1231] && Static63.anIntArray158[local1242] <= arg5.anInt7710) {
				Static514.anIntArray673[local1242] = arg5.anInt7714;
				Static309.anIntArray416[local1242] = local37;
				Static290.anIntArray400[local1242] = arg11.method7062() ? arg5.anInt7717 : arg5.anInt7716;
				Static114.anIntArray216[local1242] = arg5.anInt7715;
				if (arg5.anInt7710 == Static63.anIntArray158[local1242]) {
					Static302.anIntArray412[local1242] |= 0x2;
				} else {
					Static302.anIntArray412[local1242] = 2;
				}
				Static63.anIntArray158[local1242] = arg5.anInt7710;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIB)V")
	public final void method5419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6544; local3++) {
			this.method5415(local3, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!qa;I[Lclient!aea;[[[I)V")
	public final void method5421(@OriginalArg(0) Class62 arg0, @OriginalArg(2) Class10[] arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(18) int local18;
		if (!this.aBoolean453) {
			for (local10 = 0; local10 < 4; local10++) {
				for (local14 = 0; local14 < this.anInt6536; local14++) {
					for (local18 = 0; local18 < this.anInt6543; local18++) {
						if ((Static429.aByteArrayArrayArray17[local10][local14][local18] & 0x1) != 0) {
							@Pc(32) int local32 = local10;
							if ((Static429.aByteArrayArrayArray17[1][local14][local18] & 0x2) != 0) {
								local32 = local10 - 1;
							}
							if (local32 >= 0) {
								arg1[local32].method314(local18, local14);
							}
						}
					}
				}
			}
		}
		for (local10 = 0; local10 < this.anInt6544; local10++) {
			local14 = 0;
			local18 = 0;
			if (!this.aBoolean453) {
				if (Static438.aBoolean546) {
					local14 = 2;
				}
				if (Static532.aBoolean648) {
					local18 = 8;
				}
				if (Static364.anInt6809 != 0) {
					local14 |= 0x1;
					if (Static236.aBoolean303 | local10 == 0) {
						local18 |= 0x10;
					}
				}
			}
			if (Static438.aBoolean546) {
				local18 |= 0x7;
			}
			if (!Static103.aBoolean43) {
				local18 |= 0x20;
			}
			@Pc(143) int[][] local143 = arg2 == null || local10 >= arg2.length ? this.anIntArrayArrayArray9[local10] : arg2[local10];
			Static165.method2925(local10, arg0.method7051(this.anInt6536, this.anInt6543, this.anIntArrayArrayArray9[local10], local143, local14, local18));
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "([[IILclient!sa;Lclient!sa;Lclient!sa;Lclient!qa;I)V")
	private void method5422(@OriginalArg(0) int[][] arg0, @OriginalArg(2) Class131 arg1, @OriginalArg(3) Class131 arg2, @OriginalArg(4) Class131 arg3, @OriginalArg(5) Class62 arg4, @OriginalArg(6) int arg5) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6536; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt6543; local7++) {
				if (Static421.anInt7440 == -1 || Static189.method4028(local7, local3, Static421.anInt7440, arg5)) {
					@Pc(31) byte local31 = this.aByteArrayArrayArray11[arg5][local3][local7];
					@Pc(40) byte local40 = this.aByteArrayArrayArray13[arg5][local3][local7];
					@Pc(51) int local51 = this.aByteArrayArrayArray9[arg5][local3][local7] & 0xFF;
					@Pc(62) int local62 = this.aByteArrayArrayArray14[arg5][local3][local7] & 0xFF;
					@Pc(77) Class264 local77 = local51 == 0 ? null : this.aClass307_4.method7176(local51 - 1);
					@Pc(89) Class11 local89 = local62 == 0 ? null : this.aClass38_4.method1059(local62 - 1);
					@Pc(91) int local91 = 0;
					@Pc(93) int local93 = 0;
					if (local31 != 0) {
						local93 = local77 == null ? 0 : Static338.anIntArray473[local31];
						local91 = local89 == null ? 0 : Static307.anIntArray415[local31];
					} else if (local77 != null) {
						local93 = Static338.anIntArray473[local31];
					} else if (local89 != null) {
						local91 = Static338.anIntArray473[local31];
					}
					@Pc(135) int local135 = local93 + local91;
					@Pc(137) int local137 = 0;
					if (local135 != 0) {
						@Pc(145) int[] local145 = new int[local135];
						@Pc(148) int[] local148 = new int[local135];
						@Pc(151) int[] local151 = new int[local135];
						@Pc(154) int[] local154 = new int[local135];
						@Pc(156) boolean local156 = false;
						@Pc(174) int local174;
						@Pc(206) int local206;
						if (local77 == null || local77.anInt7714 == -1 && local77.anInt7712 == -1 && local77.anInt7717 == -1) {
							for (local174 = 0; local174 < local93; local174++) {
								local145[local137] = -1;
								local137++;
							}
						} else {
							local174 = arg4.method7062() ? local77.anInt7717 : local77.anInt7716;
							if (Static196.aBoolean225) {
								local174 = -1;
							}
							for (local206 = 0; local206 < local93; local206++) {
								local151[local137] = local174;
								local154[local137] = local77.anInt7715;
								if (local77.anInt7714 == -1) {
									local145[local137] = -1;
								} else {
									local145[local137] = local77.anInt7714;
								}
								if (local77.anInt7712 == -1) {
									local148[local137] = -1;
								} else {
									local156 = true;
									local148[local137] = local77.anInt7712;
								}
								local137++;
							}
							if (!this.aBoolean453 && arg5 == 0) {
								Static312.method5066(local3, local7, local77.anInt7722, local77.anInt7709 * 8, local77.anInt7713);
							}
						}
						if (!local156) {
							local148 = null;
						}
						if (local89 == null) {
							for (local174 = 0; local174 < local91; local174++) {
								local145[local137] = -1;
								local137++;
							}
						} else {
							local174 = local89.anInt173;
							if (Static196.aBoolean225) {
								local174 = -1;
							}
							for (local206 = 0; local206 < local91; local206++) {
								local151[local137] = local174;
								local154[local137] = local89.anInt181;
								local145[local137] = arg0[local3][local7];
								if (local148 != null) {
									local148[local137] = -1;
								}
								local137++;
							}
						}
						local174 = this.anIntArray485.length;
						@Pc(343) int[] local343 = new int[local174];
						@Pc(346) int[] local346 = new int[local174];
						@Pc(353) int[] local353 = arg2 == null ? null : new int[local174];
						@Pc(362) int[] local362 = arg2 == null && arg3 == null ? null : new int[local174];
						@Pc(371) int local371;
						@Pc(376) int local376;
						@Pc(463) int local463;
						@Pc(469) int local469;
						for (@Pc(364) int local364 = 0; local364 < local174; local364++) {
							local371 = this.anIntArray485[local364];
							local376 = this.anIntArray486[local364];
							if (local40 == 0) {
								local343[local364] = local371;
								local346[local364] = local376;
							} else if (local40 == 1) {
								local343[local364] = local376;
								local346[local364] = 128 - local371;
							} else if (local40 == 2) {
								local343[local364] = 128 - local371;
								local346[local364] = 128 - local376;
							} else if (local40 == 3) {
								local343[local364] = 128 - local376;
								local346[local364] = local371;
							}
							if (local353 != null && Static399.aBooleanArrayArray5[local31][local364]) {
								local463 = (local3 << 7) + local371;
								local469 = local371 + (local7 << 7);
								local353[local364] = arg2.aa(local463, local469) - arg1.aa(local463, local469);
							}
							if (local362 != null) {
								if (arg2 != null && !Static399.aBooleanArrayArray5[local31][local364]) {
									local463 = local371 + (local3 << 7);
									local469 = local371 + (local7 << 7);
									local362[local364] = arg1.aa(local463, local469) - arg2.aa(local463, local469);
								} else if (arg3 != null && !Static325.aBooleanArrayArray3[local31][local364]) {
									local463 = (local3 << 7) + local371;
									local469 = (local7 << 7) + local371;
									local362[local364] = arg3.aa(local463, local469) - arg1.aa(local463, local469);
								}
							}
						}
						local371 = arg1.ba(local3, local7);
						local376 = arg1.ba(local3 + 1, local7);
						local463 = arg1.ba(local3 + 1, local7 + 1);
						local469 = arg1.ba(local3, local7 + 1);
						if (arg5 > 0) {
							@Pc(585) boolean local585 = true;
							if (local62 == 0 && local31 != 0) {
								local585 = false;
							}
							if (local51 > 0 && local77 != null && !local77.aBoolean550) {
								local585 = false;
							}
							if (local585 && local376 == local371 && local371 == local463 && local371 == local469) {
								this.aByteArrayArrayArray10[arg5][local3][local7] = (byte) (this.aByteArrayArrayArray10[arg5][local3][local7] | 0x4);
							}
						}
						@Pc(642) int local642 = 0;
						@Pc(644) int local644 = 0;
						@Pc(646) int local646 = 0;
						if (this.aBoolean453) {
							local642 = Static112.method2226(local3, local7);
							local644 = Static180.method3076(local3, local7);
							local646 = Static19.method6151(local3, local7);
						}
						arg1.method7186(local3, local7, local343, local353, local346, local362, Static330.anIntArrayArray47[local31], Static273.anIntArrayArray37[local31], Static502.anIntArrayArray72[local31], local145, local148, local151, local154, local642, local644, local646);
						Static125.method2376(arg5, local3, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(II[Lclient!aea;IIILclient!co;)V")
	public final void method5424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5_Sub3 arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (!this.aBoolean453) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class10 local16 = arg2[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local28 = local18 + arg0;
						@Pc(32) int local32 = local22 + arg3;
						if (local28 >= 0 && this.anInt6536 > local28 && local32 >= 0 && this.anInt6543 > local32) {
							local16.method309(local28, local32);
						}
					}
				}
			}
		}
		local10 = arg4 + arg0;
		@Pc(77) int local77 = arg1 + arg3;
		for (local18 = 0; local18 < this.anInt6544; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method5416(arg5, local77 + local28, local10 - -local22, local28 + arg3, 0, false, local22 + arg0, 0, local18, 0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IBIIIILclient!co;[Lclient!aea;II)V")
	public final void method5425(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5_Sub3 arg5, @OriginalArg(7) Class10[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg8 & 0x7) * 8;
		@Pc(17) int local17 = (arg4 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(57) int local57;
		if (!this.aBoolean453) {
			@Pc(24) Class10 local24 = arg6[arg7];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(45) int local45 = arg1 + Static283.method4801(local26 & 0x7, local30 & 0x7, arg2);
					local57 = Static186.method3141(local26 & 0x7, local30 & 0x7, arg2) + arg3;
					if (local45 > 0 && local45 < this.anInt6536 - 1 && local57 > 0 && this.anInt6543 - 1 > local57) {
						local24.method309(local45, local57);
					}
				}
			}
		}
		@Pc(96) int local96 = (arg8 & 0xFFFFFFF8) << 3;
		local26 = (arg4 & 0xFFFFFFF8) << 3;
		@Pc(110) byte local110 = 0;
		@Pc(112) byte local112 = 0;
		if (arg2 == 1) {
			local112 = 1;
		} else if (arg2 == 2) {
			local110 = 1;
			local112 = 1;
		} else if (arg2 == 3) {
			local110 = 1;
		}
		for (local57 = 0; local57 < this.anInt6544; local57++) {
			for (@Pc(143) int local143 = 0; local143 < 64; local143++) {
				for (@Pc(147) int local147 = 0; local147 < 64; local147++) {
					if (local57 == arg0 && local11 <= local143 && local143 <= local11 + 8 && local147 >= local17 && local147 <= local17 + 8) {
						@Pc(212) int local212;
						@Pc(224) int local224;
						if (local11 + 8 == local143 || local17 + 8 == local147) {
							if (arg2 == 0) {
								local224 = arg3 + local147 - local17;
								local212 = local143 + arg1 - local11;
							} else if (arg2 == 1) {
								local212 = arg1 + local147 - local17;
								local224 = arg3 + local11 + 8 - local143;
							} else if (arg2 == 2) {
								local224 = arg3 + local17 + 8 - local147;
								local212 = local11 + arg1 + 8 - local143;
							} else {
								local212 = local17 + arg1 + 8 - local147;
								local224 = arg3 + local143 - local11;
							}
							this.method5416(arg5, local147 + local26, local96 + local143, local224, 0, true, local212, 0, arg7, 0);
						} else {
							local212 = Static283.method4801(local143 & 0x7, local147 & 0x7, arg2) + arg1;
							local224 = arg3 + Static186.method3141(local143 & 0x7, local147 & 0x7, arg2);
							this.method5416(arg5, local26 + local147, local143 + local96, local224, local112, false, local212, arg2, arg7, local110);
						}
						if (local143 == 63 || local147 == 63) {
							@Pc(349) byte local349 = 1;
							if (local143 == 63 && local147 == 63) {
								local349 = 3;
							}
							for (@Pc(363) int local363 = 0; local363 < local349; local363++) {
								@Pc(367) int local367 = local143;
								@Pc(369) int local369 = local147;
								if (local363 == 0) {
									local367 = local143 == 63 ? 64 : local143;
									local369 = local147 == 63 ? 64 : local147;
								} else if (local363 == 1) {
									local367 = 64;
								} else if (local363 == 2) {
									local369 = 64;
								}
								@Pc(429) int local429;
								@Pc(423) int local423;
								if (arg2 == 0) {
									local423 = arg3 + local369 - local17;
									local429 = local367 + arg1 - local11;
								} else if (arg2 == 1) {
									local423 = arg3 + local11 + 8 - local367;
									local429 = local369 + arg1 - local17;
								} else if (arg2 == 2) {
									local423 = arg3 + local17 + 8 - local369;
									local429 = local11 + arg1 + 8 - local367;
								} else {
									local423 = arg3 + local367 - local11;
									local429 = arg1 + local17 + 8 - local369;
								}
								if (local429 >= 0 && local429 < this.anInt6536 && local423 >= 0 && local423 < this.anInt6543) {
									this.anIntArrayArrayArray9[arg7][local429][local423] = this.anIntArrayArrayArray9[arg7][local212 + local110][local112 + local224];
								}
							}
						}
					} else {
						this.method5416(arg5, 0, 0, -1, 0, false, -1, 0, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "([[IZI)V")
	public final void method5426(@OriginalArg(0) int[][] arg0) {
		@Pc(22) int[][] local22 = this.anIntArrayArrayArray9[0];
		for (@Pc(24) int local24 = 0; local24 < this.anInt6536 + 1; local24++) {
			for (@Pc(28) int local28 = 0; local28 < this.anInt6543 + 1; local28++) {
				local22[local24][local28] += arg0[local24][local28];
			}
		}
	}
}
