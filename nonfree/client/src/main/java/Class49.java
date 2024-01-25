import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public class Class49 {

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!ch", name = "s", descriptor = "[I")
	private final int[] anIntArray73 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!ch", name = "w", descriptor = "[I")
	private final int[] anIntArray74 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
	public final int anInt1366;

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "Lclient!bm;")
	private final Class37 aClass37_2;

	@OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
	protected final int anInt1379;

	@OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
	protected final int anInt1373;

	@OriginalMember(owner = "client!ch", name = "m", descriptor = "Z")
	public final boolean aBoolean98;

	@OriginalMember(owner = "client!ch", name = "t", descriptor = "Lclient!ck;")
	private final Class59 aClass59_2;

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!ch", name = "j", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!ch", name = "o", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(IIIZLclient!bm;Lclient!ck;)V")
	protected Class49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class37 arg4, @OriginalArg(5) Class59 arg5) {
		this.anInt1366 = arg0;
		this.aClass37_2 = arg4;
		this.anInt1379 = arg2;
		this.anInt1373 = arg1;
		this.aBoolean98 = arg3;
		this.aClass59_2 = arg5;
		this.aByteArrayArrayArray9 = new byte[this.anInt1366][this.anInt1373 + 1][this.anInt1379 + 1];
		this.aByteArrayArrayArray10 = new byte[this.anInt1366][this.anInt1373][this.anInt1379];
		this.aByteArrayArrayArray12 = new byte[this.anInt1366][this.anInt1373][this.anInt1379];
		this.aByteArrayArrayArray8 = new byte[this.anInt1366][this.anInt1373][this.anInt1379];
		this.aByteArrayArrayArray11 = new byte[this.anInt1366][this.anInt1373][this.anInt1379];
		this.anIntArrayArrayArray9 = new int[this.anInt1366][this.anInt1373 + 1][this.anInt1379 + 1];
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILclient!ha;Lclient!s;Lclient!s;)V")
	public final void method1206(@OriginalArg(1) Class95 arg0, @OriginalArg(2) Class35 arg1, @OriginalArg(3) Class35 arg2) {
		if (Static206.anIntArray200 == null || this.anInt1379 != Static206.anIntArray200.length) {
			Static559.anIntArray478 = new int[this.anInt1379];
			Static97.anIntArray115 = new int[this.anInt1379];
			Static206.anIntArray200 = new int[this.anInt1379];
			Static655.anIntArray583 = new int[this.anInt1379];
			Static311.anIntArray294 = new int[this.anInt1379];
		}
		@Pc(42) int[][] local42 = new int[this.anInt1373][this.anInt1379];
		@Pc(48) int local48;
		for (@Pc(44) int local44 = 0; local44 < this.anInt1366; local44++) {
			for (local48 = 0; local48 < this.anInt1379; local48++) {
				Static206.anIntArray200[local48] = 0;
				Static559.anIntArray478[local48] = 0;
				Static97.anIntArray115[local48] = 0;
				Static311.anIntArray294[local48] = 0;
				Static655.anIntArray583[local48] = 0;
			}
			for (@Pc(77) int local77 = -5; local77 < this.anInt1373; local77++) {
				@Pc(87) int local87;
				@Pc(106) int local106;
				@Pc(175) int local175;
				for (@Pc(81) int local81 = 0; local81 < this.anInt1379; local81++) {
					local87 = local77 + 5;
					@Pc(155) int local155;
					if (this.anInt1373 > local87) {
						local106 = this.aByteArrayArrayArray12[local44][local87][local81] & 0xFF;
						if (local106 > 0) {
							@Pc(119) Class63 local119 = this.aClass59_2.method1328(local106 - 1);
							Static206.anIntArray200[local81] += local119.anInt1827;
							Static559.anIntArray478[local81] += local119.anInt1824;
							Static97.anIntArray115[local81] += local119.anInt1825;
							Static311.anIntArray294[local81] += local119.anInt1831;
							local155 = Static655.anIntArray583[local81]++;
						}
					}
					local106 = local77 - 5;
					if (local106 >= 0) {
						local175 = this.aByteArrayArrayArray12[local44][local106][local81] & 0xFF;
						if (local175 > 0) {
							@Pc(188) Class63 local188 = this.aClass59_2.method1328(local175 - 1);
							Static206.anIntArray200[local81] -= local188.anInt1827;
							Static559.anIntArray478[local81] -= local188.anInt1824;
							Static97.anIntArray115[local81] -= local188.anInt1825;
							Static311.anIntArray294[local81] -= local188.anInt1831;
							local155 = Static655.anIntArray583[local81]--;
						}
					}
				}
				if (local77 >= 0) {
					local87 = 0;
					local106 = 0;
					local175 = 0;
					@Pc(245) int local245 = 0;
					@Pc(247) int local247 = 0;
					for (@Pc(249) int local249 = -5; local249 < this.anInt1379; local249++) {
						@Pc(255) int local255 = local249 + 5;
						if (this.anInt1379 > local255) {
							local87 += Static206.anIntArray200[local255];
							local106 += Static559.anIntArray478[local255];
							local245 += Static311.anIntArray294[local255];
							local175 += Static97.anIntArray115[local255];
							local247 += Static655.anIntArray583[local255];
						}
						@Pc(293) int local293 = local249 - 5;
						if (local293 >= 0) {
							local247 -= Static655.anIntArray583[local293];
							local106 -= Static559.anIntArray478[local293];
							local175 -= Static97.anIntArray115[local293];
							local245 -= Static311.anIntArray294[local293];
							local87 -= Static206.anIntArray200[local293];
						}
						if (local249 >= 0 && local245 > 0 && local247 > 0) {
							local42[local77][local249] = Static553.method7312(local87 * 256 / local245, local175 / local247, local106 / local247);
						}
					}
				}
			}
			if (Static59.aBoolean88) {
				this.method1216(Static582.aClass35Array3[local44], local44, local44 == 0 ? arg1 : null, arg0, local44 == 0 ? arg2 : null, local42);
			} else {
				this.method1209(local42, local44, Static582.aClass35Array3[local44], arg0, local44 == 0 ? arg1 : null, local44 == 0 ? arg2 : null);
			}
			this.aByteArrayArrayArray12[local44] = null;
			this.aByteArrayArrayArray11[local44] = null;
			this.aByteArrayArrayArray10[local44] = null;
			this.aByteArrayArrayArray8[local44] = null;
		}
		if (!this.aBoolean98) {
			if (Static65.anInt1330 != 0) {
				Static308.method4437();
			}
			if (Static296.aBoolean336) {
				Static427.method5893();
			}
		}
		for (local48 = 0; local48 < this.anInt1366; local48++) {
			Static582.aClass35Array3[local48].YA();
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIII[[BII[[BLclient!co;Lclient!ha;Lclient!mea;I[[B[Z)V")
	private void method1207(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) Class63 arg7, @OriginalArg(9) Class95 arg8, @OriginalArg(10) Class225 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) byte[][] arg11, @OriginalArg(13) boolean[] arg12) {
		@Pc(18) boolean[] local18 = arg9 != null && arg9.aBoolean435 ? Static246.aBooleanArrayArray2[arg2] : Static92.aBooleanArrayArray1[arg2];
		@Pc(40) int local40;
		@Pc(50) Class225 local50;
		@Pc(67) byte local67;
		@Pc(83) int local83;
		@Pc(88) int local88;
		if (arg5 > 0) {
			if (arg1 > 0) {
				local40 = arg6[arg1 - 1][arg5 - 1] & 0xFF;
				if (local40 > 0) {
					local50 = this.aClass37_2.method1029(local40 - 1);
					if (local50.anInt6218 != -1 && local50.aBoolean435) {
						local67 = arg3[arg1 - 1][arg5 - 1];
						local83 = arg11[arg1 - 1][arg5 - 1] * 2 + 4 & 0x7;
						local88 = Static207.method7393(arg8, local50);
						if (Static522.aBooleanArrayArray7[local67][local83]) {
							Static660.anIntArray589[0] = local50.anInt6218;
							Static23.anIntArray26[0] = local88;
							Static373.anIntArray333[0] = local50.anInt6226;
							Static470.anIntArray404[0] = local50.anInt6222;
							Static309.anIntArray293[0] = local50.anInt6216;
							Static463.anIntArray401[0] = 256;
						}
					}
				}
			}
			if (arg1 < arg4 - 1) {
				local40 = arg6[arg1 + 1][arg5 - 1] & 0xFF;
				if (local40 > 0) {
					local50 = this.aClass37_2.method1029(local40 - 1);
					if (local50.anInt6218 != -1 && local50.aBoolean435) {
						local67 = arg3[arg1 + 1][arg5 - 1];
						local83 = arg11[arg1 + 1][arg5 - 1] * 2 + 6 & 0x7;
						local88 = Static207.method7393(arg8, local50);
						if (Static522.aBooleanArrayArray7[local67][local83]) {
							Static660.anIntArray589[2] = local50.anInt6218;
							Static23.anIntArray26[2] = local88;
							Static373.anIntArray333[2] = local50.anInt6226;
							Static470.anIntArray404[2] = local50.anInt6222;
							Static309.anIntArray293[2] = local50.anInt6216;
							Static463.anIntArray401[2] = 512;
						}
					}
				}
			}
		}
		if (arg5 < arg0 - 1) {
			if (arg1 > 0) {
				local40 = arg6[arg1 - 1][arg5 + 1] & 0xFF;
				if (local40 > 0) {
					local50 = this.aClass37_2.method1029(local40 - 1);
					if (local50.anInt6218 != -1 && local50.aBoolean435) {
						local67 = arg3[arg1 - 1][arg5 + 1];
						local83 = arg11[arg1 - 1][arg5 + 1] * 2 + 2 & 0x7;
						local88 = Static207.method7393(arg8, local50);
						if (Static522.aBooleanArrayArray7[local67][local83]) {
							Static660.anIntArray589[6] = local50.anInt6218;
							Static23.anIntArray26[6] = local88;
							Static373.anIntArray333[6] = local50.anInt6226;
							Static470.anIntArray404[6] = local50.anInt6222;
							Static309.anIntArray293[6] = local50.anInt6216;
							Static463.anIntArray401[6] = 64;
						}
					}
				}
			}
			if (arg1 < arg4 - 1) {
				local40 = arg6[arg1 + 1][arg5 + 1] & 0xFF;
				if (local40 > 0) {
					local50 = this.aClass37_2.method1029(local40 - 1);
					if (local50.anInt6218 != -1 && local50.aBoolean435) {
						local67 = arg3[arg1 + 1][arg5 + 1];
						local83 = arg11[arg1 + 1][arg5 + 1] * 2 & 0x7;
						local88 = Static207.method7393(arg8, local50);
						if (Static522.aBooleanArrayArray7[local67][local83]) {
							Static660.anIntArray589[4] = local50.anInt6218;
							Static23.anIntArray26[4] = local88;
							Static373.anIntArray333[4] = local50.anInt6226;
							Static470.anIntArray404[4] = local50.anInt6222;
							Static309.anIntArray293[4] = local50.anInt6216;
							Static463.anIntArray401[4] = 128;
						}
					}
				}
			}
		}
		@Pc(503) int local503;
		@Pc(510) int local510;
		@Pc(515) int local515;
		@Pc(517) int local517;
		@Pc(448) int local448;
		@Pc(458) Class225 local458;
		@Pc(470) byte local470;
		@Pc(478) byte local478;
		if (arg5 > 0) {
			local448 = arg6[arg1][arg5 - 1] & 0xFF;
			if (local448 > 0) {
				local458 = this.aClass37_2.method1029(local448 - 1);
				if (local458.anInt6218 != -1) {
					local470 = arg3[arg1][arg5 - 1];
					local478 = arg11[arg1][arg5 - 1];
					if (local458.aBoolean435) {
						local503 = 2;
						local510 = local478 * 2 + 4;
						local515 = Static207.method7393(arg8, local458);
						for (local517 = 0; local517 < 3; local517++) {
							local503 &= 0x7;
							local510 &= 0x7;
							if (Static522.aBooleanArrayArray7[local470][local510] && local458.anInt6216 >= Static309.anIntArray293[local503]) {
								Static660.anIntArray589[local503] = local458.anInt6218;
								Static23.anIntArray26[local503] = local515;
								Static373.anIntArray333[local503] = local458.anInt6226;
								Static470.anIntArray404[local503] = local458.anInt6222;
								if (local458.anInt6216 == Static309.anIntArray293[local503]) {
									Static463.anIntArray401[local503] |= 0x20;
								} else {
									Static463.anIntArray401[local503] = 32;
								}
								Static309.anIntArray293[local503] = local458.anInt6216;
							}
							local503--;
							local510++;
						}
						if (!local18[arg10 & 0x3]) {
							arg12[0] = Static246.aBooleanArrayArray2[local470][local478 + 2 & 0x3];
						}
					} else if (!local18[arg10 & 0x3]) {
						arg12[0] = Static92.aBooleanArrayArray1[local470][local478 + 2 & 0x3];
					}
				}
			}
		}
		if (arg5 < arg0 - 1) {
			local448 = arg6[arg1][arg5 + 1] & 0xFF;
			if (local448 > 0) {
				local458 = this.aClass37_2.method1029(local448 - 1);
				if (local458.anInt6218 != -1) {
					local470 = arg3[arg1][arg5 + 1];
					local478 = arg11[arg1][arg5 + 1];
					if (local458.aBoolean435) {
						local503 = 4;
						local510 = local478 * 2 + 2;
						local515 = Static207.method7393(arg8, local458);
						for (local517 = 0; local517 < 3; local517++) {
							local510 &= 0x7;
							local503 &= 0x7;
							if (Static522.aBooleanArrayArray7[local470][local510] && local458.anInt6216 >= Static309.anIntArray293[local503]) {
								Static660.anIntArray589[local503] = local458.anInt6218;
								Static23.anIntArray26[local503] = local515;
								Static373.anIntArray333[local503] = local458.anInt6226;
								Static470.anIntArray404[local503] = local458.anInt6222;
								if (Static309.anIntArray293[local503] == local458.anInt6216) {
									Static463.anIntArray401[local503] |= 0x10;
								} else {
									Static463.anIntArray401[local503] = 16;
								}
								Static309.anIntArray293[local503] = local458.anInt6216;
							}
							local503++;
							local510--;
						}
						if (!local18[arg10 + 2 & 0x3]) {
							arg12[2] = Static246.aBooleanArrayArray2[local470][local478 & 0x3];
						}
					} else if (!local18[arg10 + 2 & 0x3]) {
						arg12[2] = Static92.aBooleanArrayArray1[local470][local478 & 0x3];
					}
				}
			}
		}
		if (arg1 > 0) {
			local448 = arg6[arg1 - 1][arg5] & 0xFF;
			if (local448 > 0) {
				local458 = this.aClass37_2.method1029(local448 - 1);
				if (local458.anInt6218 != -1) {
					local470 = arg3[arg1 - 1][arg5];
					local478 = arg11[arg1 - 1][arg5];
					if (local458.aBoolean435) {
						local503 = 6;
						local510 = local478 * 2 + 4;
						local515 = Static207.method7393(arg8, local458);
						for (local517 = 0; local517 < 3; local517++) {
							local510 &= 0x7;
							local503 &= 0x7;
							if (Static522.aBooleanArrayArray7[local470][local510] && local458.anInt6216 >= Static309.anIntArray293[local503]) {
								Static660.anIntArray589[local503] = local458.anInt6218;
								Static23.anIntArray26[local503] = local515;
								Static373.anIntArray333[local503] = local458.anInt6226;
								Static470.anIntArray404[local503] = local458.anInt6222;
								if (local458.anInt6216 == Static309.anIntArray293[local503]) {
									Static463.anIntArray401[local503] |= 0x8;
								} else {
									Static463.anIntArray401[local503] = 8;
								}
								Static309.anIntArray293[local503] = local458.anInt6216;
							}
							local503++;
							local510--;
						}
						if (!local18[arg10 + 3 & 0x3]) {
							arg12[3] = Static246.aBooleanArrayArray2[local470][local478 + 1 & 0x3];
						}
					} else if (!local18[arg10 + 3 & 0x3]) {
						arg12[3] = Static92.aBooleanArrayArray1[local470][local478 + 1 & 0x3];
					}
				}
			}
		}
		if (arg4 - 1 > arg1) {
			local448 = arg6[arg1 + 1][arg5] & 0xFF;
			if (local448 > 0) {
				local458 = this.aClass37_2.method1029(local448 - 1);
				if (local458.anInt6218 != -1) {
					local470 = arg3[arg1 + 1][arg5];
					local478 = arg11[arg1 + 1][arg5];
					if (local458.aBoolean435) {
						local503 = 4;
						local510 = local478 * 2 + 6;
						local515 = Static207.method7393(arg8, local458);
						for (local517 = 0; local517 < 3; local517++) {
							local510 &= 0x7;
							local503 &= 0x7;
							if (Static522.aBooleanArrayArray7[local470][local510] && Static309.anIntArray293[local503] <= local458.anInt6216) {
								Static660.anIntArray589[local503] = local458.anInt6218;
								Static23.anIntArray26[local503] = local515;
								Static373.anIntArray333[local503] = local458.anInt6226;
								Static470.anIntArray404[local503] = local458.anInt6222;
								if (Static309.anIntArray293[local503] == local458.anInt6216) {
									Static463.anIntArray401[local503] |= 0x4;
								} else {
									Static463.anIntArray401[local503] = 4;
								}
								Static309.anIntArray293[local503] = local458.anInt6216;
							}
							local503--;
							local510++;
						}
						if (!local18[arg10 + 1 & 0x3]) {
							arg12[1] = Static246.aBooleanArrayArray2[local470][local478 + 3 & 0x3];
						}
					} else if (!local18[arg10 + 1 & 0x3]) {
						arg12[1] = Static92.aBooleanArrayArray1[local470][local478 + 3 & 0x3];
					}
				}
			}
		}
		if (arg9 == null) {
			return;
		}
		local448 = Static207.method7393(arg8, arg9);
		if (!arg9.aBoolean435) {
			return;
		}
		for (@Pc(1192) int local1192 = 0; local1192 < 8; local1192++) {
			local83 = local1192 - arg10 * 2 & 0x7;
			if (Static522.aBooleanArrayArray7[arg2][local1192] && Static309.anIntArray293[local83] <= arg9.anInt6216) {
				Static660.anIntArray589[local83] = arg9.anInt6218;
				Static23.anIntArray26[local83] = local448;
				Static373.anIntArray333[local83] = arg9.anInt6226;
				Static470.anIntArray404[local83] = arg9.anInt6222;
				if (arg9.anInt6216 == Static309.anIntArray293[local83]) {
					Static463.anIntArray401[local83] |= 0x2;
				} else {
					Static463.anIntArray401[local83] = 2;
				}
				Static309.anIntArray293[local83] = arg9.anInt6216;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "([[[I[Lclient!eq;ZLclient!ha;)V")
	public final void method1208(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class110[] arg1, @OriginalArg(3) Class95 arg2) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (!this.aBoolean98) {
			for (local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt1373; local10++) {
					for (local14 = 0; local14 < this.anInt1379; local14++) {
						if ((Static315.aByteArrayArrayArray13[local6][local10][local14] & 0x1) != 0) {
							@Pc(28) int local28 = local6;
							if ((Static315.aByteArrayArrayArray13[1][local10][local14] & 0x2) != 0) {
								local28 = local6 - 1;
							}
							if (local28 >= 0) {
								arg1[local28].method2364(local14, local10);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt1366; local6++) {
			local10 = 0;
			local14 = 0;
			if (!this.aBoolean98) {
				if (Static379.aBoolean444) {
					local14 = 8;
				}
				if (Static296.aBoolean336) {
					local10 = 2;
				}
				if (Static65.anInt1330 != 0) {
					local10 |= 0x1;
					if (Static499.aBoolean550 | local6 == 0) {
						local14 |= 0x10;
					}
				}
			}
			if (Static296.aBoolean336) {
				local14 |= 0x7;
			}
			if (!Class3_Sub5_Sub21.aBoolean755) {
				local14 |= 0x20;
			}
			@Pc(150) int[][] local150 = arg0 == null || local6 >= arg0.length ? this.anIntArrayArrayArray9[local6] : arg0[local6];
			Static648.method8705(local6, arg2.method8044(this.anInt1373, this.anInt1379, this.anIntArrayArrayArray9[local6], local150, local10, local14));
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "([[IIILclient!s;Lclient!ha;Lclient!s;Lclient!s;)V")
	private void method1209(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class35 arg2, @OriginalArg(4) Class95 arg3, @OriginalArg(5) Class35 arg4, @OriginalArg(6) Class35 arg5) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1373; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt1379; local7++) {
				if (Static470.anInt7453 == -1 || Static647.method8700(local7, Static470.anInt7453, arg1, local3)) {
					@Pc(31) byte local31 = this.aByteArrayArrayArray10[arg1][local3][local7];
					@Pc(40) byte local40 = this.aByteArrayArrayArray8[arg1][local3][local7];
					@Pc(51) int local51 = this.aByteArrayArrayArray11[arg1][local3][local7] & 0xFF;
					@Pc(62) int local62 = this.aByteArrayArrayArray12[arg1][local3][local7] & 0xFF;
					@Pc(77) Class225 local77 = local51 == 0 ? null : this.aClass37_2.method1029(local51 - 1);
					if (local31 == 0 && local77 == null) {
						local31 = 12;
					}
					@Pc(98) Class63 local98 = local62 == 0 ? null : this.aClass59_2.method1328(local62 - 1);
					@Pc(100) Class225 local100 = local77;
					if (local77 != null && local77.anInt6218 == -1 && local77.anInt6223 == -1) {
						local100 = local77;
						local77 = null;
					}
					if (local77 != null || local98 != null) {
						@Pc(123) int local123 = Static288.anIntArray278[local31];
						@Pc(127) int local127 = Static223.anIntArray209[local31];
						@Pc(139) int local139 = (local77 == null ? 0 : local127) + (local98 == null ? 0 : local123);
						@Pc(141) int local141 = 0;
						@Pc(143) int local143 = 0;
						@Pc(150) int local150 = local77 == null ? -1 : local77.anInt6226;
						@Pc(157) int local157 = local98 == null ? -1 : local98.anInt1833;
						@Pc(160) int[] local160 = new int[local139];
						@Pc(163) int[] local163 = new int[local139];
						@Pc(166) int[] local166 = new int[local139];
						@Pc(169) int[] local169 = new int[local139];
						@Pc(172) int[] local172 = new int[local139];
						@Pc(175) int[] local175 = new int[local139];
						@Pc(187) int[] local187 = local77 == null || local77.anInt6223 == -1 ? null : new int[local139];
						@Pc(197) int local197;
						if (local77 == null) {
							local143 = local127;
						} else {
							for (local197 = 0; local197 < local127; local197++) {
								local160[local141] = Static355.anIntArrayArray39[local31][local143];
								local163[local141] = Static490.anIntArrayArray55[local31][local143];
								local166[local141] = Static92.anIntArrayArray8[local31][local143];
								local172[local141] = local150;
								local175[local141] = local77.anInt6222;
								local169[local141] = local77.anInt6218;
								if (local187 != null) {
									local187[local141] = local77.anInt6223;
								}
								local143++;
								local141++;
							}
							if (!this.aBoolean98 && arg1 == 0) {
								Static437.method5971(local3, local7, local77.anInt6212, local77.anInt6213 * 8, local77.anInt6219);
							}
						}
						if (local98 != null) {
							for (local197 = 0; local197 < local123; local197++) {
								local160[local141] = Static355.anIntArrayArray39[local31][local143];
								local163[local141] = Static490.anIntArrayArray55[local31][local143];
								local166[local141] = Static92.anIntArrayArray8[local31][local143];
								local172[local141] = local157;
								local175[local141] = local98.anInt1823;
								local169[local141] = arg0[local3][local7];
								if (local187 != null) {
									local187[local141] = local169[local141];
								}
								local141++;
								local143++;
							}
						}
						local197 = this.anIntArray73.length;
						@Pc(338) int[] local338 = new int[local197];
						@Pc(341) int[] local341 = new int[local197];
						@Pc(348) int[] local348 = arg5 == null ? null : new int[local197];
						@Pc(357) int[] local357 = arg5 == null && arg4 == null ? null : new int[local197];
						@Pc(366) int local366;
						@Pc(371) int local371;
						@Pc(461) int local461;
						@Pc(470) int local470;
						for (@Pc(359) int local359 = 0; local359 < local197; local359++) {
							local366 = this.anIntArray73[local359];
							local371 = this.anIntArray74[local359];
							if (local40 == 0) {
								local338[local359] = local366;
								local341[local359] = local371;
							} else if (local40 == 1) {
								local338[local359] = local371;
								local341[local359] = 512 - local366;
							} else if (local40 == 2) {
								local338[local359] = 512 - local366;
								local341[local359] = 512 - local371;
							} else if (local40 == 3) {
								local338[local359] = 512 - local371;
								local341[local359] = local366;
							}
							if (local348 != null && Static522.aBooleanArrayArray7[local31][local359]) {
								local461 = (local3 << 9) + local338[local359];
								local470 = (local7 << 9) + local341[local359];
								local348[local359] = arg5.method7452(local461, local470) - arg2.method7452(local461, local470);
							}
							if (local357 != null) {
								if (arg5 != null && !Static522.aBooleanArrayArray7[local31][local359]) {
									local461 = (local3 << 9) + local338[local359];
									local470 = local341[local359] + (local7 << 9);
									local357[local359] = arg2.method7452(local461, local470) - arg5.method7452(local461, local470);
								} else if (arg4 != null && !Static316.aBooleanArrayArray3[local31][local359]) {
									local461 = local338[local359] + (local3 << 9);
									local470 = (local7 << 9) + local341[local359];
									local357[local359] = arg4.method7452(local461, local470) - arg2.method7452(local461, local470);
								}
							}
						}
						local366 = arg2.method7461(local7, local3);
						local371 = arg2.method7461(local7, local3 + 1);
						local461 = arg2.method7461(local7 + 1, local3 + 1);
						local470 = arg2.method7461(local7 + 1, local3);
						@Pc(608) boolean local608 = Static209.method3118(local3, local7);
						if (local608 && arg1 > 1 || !local608 && arg1 > 0) {
							@Pc(622) boolean local622 = true;
							if (local98 != null && !local98.aBoolean148) {
								local622 = false;
							} else if (local62 == 0 && local31 != 0) {
								local622 = false;
							} else if (local51 > 0 && local100 != null && !local100.aBoolean434) {
								local622 = false;
							}
							if (local622 && local366 == local371 && local366 == local461 && local366 == local470) {
								this.aByteArrayArrayArray9[arg1][local3][local7] = (byte) (this.aByteArrayArrayArray9[arg1][local3][local7] | 0x4);
							}
						}
						@Pc(687) int local687 = 0;
						@Pc(689) int local689 = 0;
						@Pc(691) int local691 = 0;
						if (this.aBoolean98) {
							local687 = Static660.method8810(local3, local7);
							local689 = Static153.method2450(local3, local7);
							local691 = Static226.method3388(local3, local7);
						}
						arg2.method7455(local3, local7, local338, local348, local341, local357, local160, local163, local166, local169, local187, local172, local175, local687, local689, local691);
						Static142.method2337(arg1, local3, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BIIIII)V")
	public final void method1210(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = arg0; local7 < arg3 + arg0; local7++) {
			for (local11 = arg1; local11 < arg2 + arg1; local11++) {
				if (local11 >= 0 && this.anInt1373 > local11 && local7 >= 0 && this.anInt1379 > local7) {
					this.anIntArrayArrayArray9[arg4][local11][local7] = arg4 > 0 ? this.anIntArrayArrayArray9[arg4 - 1][local11][local7] - 960 : 0;
				}
			}
		}
		if (arg1 > 0 && arg1 < this.anInt1373) {
			for (local11 = arg0 + 1; local11 < arg3 + arg0; local11++) {
				if (local11 >= 0 && this.anInt1379 > local11) {
					this.anIntArrayArrayArray9[arg4][arg1][local11] = this.anIntArrayArrayArray9[arg4][arg1 - 1][local11];
				}
			}
		}
		if (arg0 > 0 && this.anInt1379 > arg0) {
			for (@Pc(149) int local149 = arg1 + 1; local149 < arg1 + arg2; local149++) {
				if (local149 >= 0 && local149 < this.anInt1373) {
					this.anIntArrayArrayArray9[arg4][local149][arg0] = this.anIntArrayArrayArray9[arg4][local149][arg0 - 1];
				}
			}
		}
		if (arg1 < 0 || arg0 < 0 || this.anInt1373 <= arg1 || arg0 >= this.anInt1379) {
			return;
		}
		if (arg4 != 0) {
			if (arg1 > 0 && this.anIntArrayArrayArray9[arg4][arg1 - 1][arg0] != this.anIntArrayArrayArray9[arg4 - 1][arg1 - 1][arg0]) {
				this.anIntArrayArrayArray9[arg4][arg1][arg0] = this.anIntArrayArrayArray9[arg4][arg1 - 1][arg0];
				return;
			}
			if (arg0 > 0 && this.anIntArrayArrayArray9[arg4][arg1][arg0 - 1] != this.anIntArrayArrayArray9[arg4 - 1][arg1][arg0 - 1]) {
				this.anIntArrayArrayArray9[arg4][arg1][arg0] = this.anIntArrayArrayArray9[arg4][arg1][arg0 - 1];
				return;
			}
			if (arg1 > 0 && arg0 > 0 && this.anIntArrayArrayArray9[arg4][arg1 - 1][arg0 - 1] != this.anIntArrayArrayArray9[arg4 - 1][arg1 - 1][arg0 - 1]) {
				this.anIntArrayArrayArray9[arg4][arg1][arg0] = this.anIntArrayArrayArray9[arg4][arg1 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray9[arg4][arg1 - 1][arg0] != 0) {
			this.anIntArrayArrayArray9[arg4][arg1][arg0] = this.anIntArrayArrayArray9[arg4][arg1 - 1][arg0];
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray9[arg4][arg1][arg0 - 1] != 0) {
			this.anIntArrayArrayArray9[arg4][arg1][arg0] = this.anIntArrayArrayArray9[arg4][arg1][arg0 - 1];
			return;
		}
		if (arg1 > 0 && arg0 > 0 && this.anIntArrayArrayArray9[arg4][arg1 - 1][arg0 - 1] != 0) {
			this.anIntArrayArrayArray9[arg4][arg1][arg0] = this.anIntArrayArrayArray9[arg4][arg1 - 1][arg0 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIB)V")
	public final void method1211(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1366; local7++) {
			this.method1210(arg1, arg0, 64, 64, local7);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(III[Lclient!eq;IBLclient!dt;III)V")
	public final void method1212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class110[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class3_Sub4 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg2 & 0x7) * 8;
		@Pc(31) int local31;
		@Pc(62) int local62;
		if (!this.aBoolean98) {
			@Pc(29) Class110 local29 = arg3[arg7];
			for (local31 = 0; local31 < 8; local31++) {
				for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
					@Pc(49) int local49 = Static265.method3917(local31 & 0x7, arg6, local35 & 0x7) + arg0;
					local62 = arg8 + Static351.method5104(local35 & 0x7, local31 & 0x7, arg6);
					if (local49 > 0 && local49 < this.anInt1373 - 1 && local62 > 0 && this.anInt1379 - 1 > local62) {
						local29.method2369(local49, local62);
					}
				}
			}
		}
		@Pc(107) int local107 = (arg4 & 0x7) * 8;
		@Pc(113) int local113 = (arg2 & 0x1FFFFFF8) << 3;
		local31 = (arg4 & 0x1FFFFFF8) << 3;
		@Pc(121) byte local121 = 0;
		@Pc(123) byte local123 = 0;
		if (arg6 == 1) {
			local123 = 1;
		} else if (arg6 == 2) {
			local123 = 1;
			local121 = 1;
		} else if (arg6 == 3) {
			local121 = 1;
		}
		for (local62 = 0; local62 < this.anInt1366; local62++) {
			for (@Pc(154) int local154 = 0; local154 < 64; local154++) {
				for (@Pc(158) int local158 = 0; local158 < 64; local158++) {
					if (arg1 == local62 && local154 >= local11 && local154 <= local11 + 8 && local107 <= local158 && local158 <= local107 + 8) {
						@Pc(220) int local220;
						@Pc(232) int local232;
						if (local11 + 8 == local154 || local107 + 8 == local158) {
							if (arg6 == 0) {
								local232 = arg8 + local158 - local107;
								local220 = local154 + arg0 - local11;
							} else if (arg6 == 1) {
								local220 = arg0 + local158 - local107;
								local232 = local11 + arg8 + 8 - local154;
							} else if (arg6 == 2) {
								local232 = arg8 + local107 + 8 - local158;
								local220 = arg0 + local11 + 8 - local154;
							} else {
								local220 = arg0 + local107 + 8 - local158;
								local232 = arg8 + local154 - local11;
							}
							this.method1213(0, local113 + local154, true, arg7, local220, 0, local232, 0, local31 + local158, arg5);
						} else {
							local220 = arg0 + Static265.method3917(local154 & 0x7, arg6, local158 & 0x7);
							local232 = Static351.method5104(local158 & 0x7, local154 & 0x7, arg6) + arg8;
							this.method1213(arg6, local154 + local113, false, arg7, local220, local123, local232, local121, local31 + local158, arg5);
						}
						if (local154 == 63 || local158 == 63) {
							@Pc(359) byte local359 = 1;
							if (local154 == 63 && local158 == 63) {
								local359 = 3;
							}
							for (@Pc(371) int local371 = 0; local371 < local359; local371++) {
								@Pc(375) int local375 = local154;
								@Pc(377) int local377 = local158;
								if (local371 == 0) {
									local375 = local154 == 63 ? 64 : local154;
									local377 = local158 == 63 ? 64 : local158;
								} else if (local371 == 1) {
									local375 = 64;
								} else if (local371 == 2) {
									local377 = 64;
								}
								@Pc(431) int local431;
								@Pc(440) int local440;
								if (arg6 == 0) {
									local440 = arg8 + local377 - local107;
									local431 = arg0 + local375 - local11;
								} else if (arg6 == 1) {
									local431 = local377 + arg0 - local107;
									local440 = arg8 + local11 + 8 - local375;
								} else if (arg6 == 2) {
									local440 = local107 + arg8 + 8 - local377;
									local431 = local11 + arg0 + 8 - local375;
								} else {
									local431 = arg0 + local107 + 8 - local377;
									local440 = local375 + arg8 - local11;
								}
								if (local431 >= 0 && this.anInt1373 > local431 && local440 >= 0 && this.anInt1379 > local440) {
									this.anIntArrayArrayArray9[arg7][local431][local440] = this.anIntArrayArrayArray9[arg7][local220 + local121][local123 + local232];
								}
							}
						}
					} else {
						this.method1213(0, 0, false, 0, -1, 0, -1, 0, 0, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIZIIIBIIILclient!dt;)V")
	private void method1213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class3_Sub4 arg9) {
		if (arg0 == 1) {
			arg5 = 1;
		} else if (arg0 == 2) {
			arg7 = 1;
			arg5 = 1;
		} else if (arg0 == 3) {
			arg7 = 1;
		}
		@Pc(64) int local64;
		if (arg4 < 0 || this.anInt1373 <= arg4 || arg6 < 0 || this.anInt1379 <= arg6) {
			while (true) {
				local64 = arg9.method7954();
				if (local64 == 0) {
					return;
				}
				if (local64 == 1) {
					arg9.method7954();
					return;
				}
				if (local64 <= 49) {
					arg9.method7954();
				}
			}
			return;
		}
		if (!this.aBoolean98 && !arg2) {
			Static315.aByteArrayArrayArray13[arg3][arg4][arg6] = 0;
		}
		while (true) {
			local64 = arg9.method7954();
			if (local64 == 0) {
				if (this.aBoolean98) {
					this.anIntArrayArrayArray9[0][arg4 + arg7][arg5 + arg6] = 0;
					return;
				} else if (arg3 == 0) {
					this.anIntArrayArrayArray9[0][arg7 + arg4][arg6 + arg5] = -Static326.method4643(arg8 + 556238, arg1 + 932731) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray9[arg3][arg4 + arg7][arg5 + arg6] = this.anIntArrayArrayArray9[arg3 - 1][arg4 + arg7][arg5 + arg6] - 960;
					return;
				}
			}
			if (local64 == 1) {
				@Pc(192) int local192 = arg9.method7954();
				if (this.aBoolean98) {
					this.anIntArrayArrayArray9[0][arg4 + arg7][arg5 + arg6] = local192 * 8 << 2;
					return;
				}
				if (local192 == 1) {
					local192 = 0;
				}
				if (arg3 != 0) {
					this.anIntArrayArrayArray9[arg3][arg4 + arg7][arg6 + arg5] = this.anIntArrayArrayArray9[arg3 - 1][arg7 + arg4][arg6 + arg5] - (local192 * 8 << 2);
					return;
				}
				this.anIntArrayArrayArray9[0][arg7 + arg4][arg5 + arg6] = -local192 * 8 << 2;
				return;
			}
			if (local64 <= 49) {
				if (arg2) {
					arg9.method7954();
				} else {
					this.aByteArrayArrayArray11[arg3][arg4][arg6] = arg9.method7960();
					this.aByteArrayArrayArray10[arg3][arg4][arg6] = (byte) ((local64 - 2) / 4);
					this.aByteArrayArrayArray8[arg3][arg4][arg6] = (byte) (arg0 + local64 - 2 & 0x3);
				}
			} else if (local64 <= 81) {
				if (!this.aBoolean98 && !arg2) {
					Static315.aByteArrayArrayArray13[arg3][arg4][arg6] = (byte) (local64 - 49);
				}
			} else if (!arg2) {
				this.aByteArrayArrayArray12[arg3][arg4][arg6] = (byte) (local64 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[Lclient!eq;IIIBLclient!dt;)V")
	public final void method1214(@OriginalArg(0) int arg0, @OriginalArg(1) Class110[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class3_Sub4 arg5) {
		@Pc(16) int local16;
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(34) int local34;
		if (!this.aBoolean98) {
			for (local16 = 0; local16 < 4; local16++) {
				@Pc(22) Class110 local22 = arg1[local16];
				for (local24 = 0; local24 < 64; local24++) {
					for (local28 = 0; local28 < 64; local28++) {
						local34 = arg3 + local24;
						@Pc(38) int local38 = local28 + arg2;
						if (local34 >= 0 && this.anInt1373 > local34 && local38 >= 0 && this.anInt1379 > local38) {
							local22.method2369(local34, local38);
						}
					}
				}
			}
		}
		local16 = arg4 + arg3;
		@Pc(87) int local87 = arg0 + arg2;
		for (local24 = 0; local24 < this.anInt1366; local24++) {
			for (local28 = 0; local28 < 64; local28++) {
				for (local34 = 0; local34 < 64; local34++) {
					this.method1213(0, local28 + local16, false, local24, local28 + arg3, 0, local34 + arg2, 0, local34 + local87, arg5);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "([[IBI)V")
	public final void method1215(@OriginalArg(0) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray9[0];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1373 + 1; local16++) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt1379 + 1; local20++) {
				local10[local16][local20] += arg0[local16][local20];
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!s;IILclient!s;Lclient!ha;Lclient!s;[[I)V")
	private void method1216(@OriginalArg(0) Class35 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class35 arg2, @OriginalArg(4) Class95 arg3, @OriginalArg(5) Class35 arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray10[arg1];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray8[arg1];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray12[arg1];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray11[arg1];
		for (@Pc(27) int local27 = 0; local27 < this.anInt1373; local27++) {
			@Pc(43) int local43 = this.anInt1373 - 1 > local27 ? local27 + 1 : local27;
			for (@Pc(45) int local45 = 0; local45 < this.anInt1379; local45++) {
				@Pc(59) int local59 = this.anInt1379 - 1 <= local45 ? local45 : local45 + 1;
				if (Static470.anInt7453 == -1 || Static647.method8700(local45, Static470.anInt7453, arg1, local27)) {
					@Pc(73) boolean local73 = false;
					@Pc(75) boolean local75 = false;
					@Pc(78) boolean[] local78 = new boolean[4];
					@Pc(84) int local84 = local10[local27][local45];
					@Pc(90) int local90 = local15[local27][local45];
					@Pc(98) int local98 = local25[local27][local45] & 0xFF;
					@Pc(106) int local106 = local20[local27][local45] & 0xFF;
					@Pc(114) int local114 = local20[local27][local59] & 0xFF;
					@Pc(122) int local122 = local20[local43][local59] & 0xFF;
					@Pc(130) int local130 = local20[local43][local45] & 0xFF;
					if (local98 != 0 || local106 != 0) {
						@Pc(149) Class225 local149 = local98 == 0 ? null : this.aClass37_2.method1029(local98 - 1);
						if (local84 == 0 && local149 == null) {
							local84 = 12;
						}
						@Pc(170) Class63 local170 = local106 == 0 ? null : this.aClass59_2.method1328(local106 - 1);
						@Pc(172) Class225 local172 = local149;
						if (local149 != null) {
							if (local149.anInt6218 == -1 && local149.anInt6223 == -1) {
								local172 = local149;
								local149 = null;
							} else if (local170 != null && local84 != 0) {
								local75 = local149.aBoolean435;
							}
						}
						@Pc(281) int local281;
						@Pc(317) int local317;
						@Pc(375) int local375;
						@Pc(384) int local384;
						if ((local84 == 0 || local84 == 12) && local27 > 0 && local45 > 0 && local27 < this.anInt1373 && this.anInt1379 > local45) {
							@Pc(241) int local241 = local106 == local20[local43][local59] ? 1 : -1;
							@Pc(260) int local260 = local20[local43][local45 - 1] == local106 ? 1 : -1;
							local281 = local20[local27 - 1][local45 - 1] == local106 ? 1 : -1;
							if (local106 == local20[local27][local45 - 1]) {
								local260++;
								local281++;
							} else {
								local281--;
								local260--;
							}
							local317 = local106 == local20[local27 - 1][local59] ? 1 : -1;
							if (local106 == local20[local43][local45]) {
								local241++;
								local260++;
							} else {
								local241--;
								local260--;
							}
							if (local106 == local20[local27][local59]) {
								local241++;
								local317++;
							} else {
								local241--;
								local317--;
							}
							if (local20[local27 - 1][local45] == local106) {
								local317++;
								local281++;
							} else {
								local317--;
								local281--;
							}
							local375 = local281 - local241;
							if (local375 < 0) {
								local375 = -local375;
							}
							local384 = local260 - local317;
							if (local384 < 0) {
								local384 = -local384;
							}
							if (local384 == local375) {
								local375 = arg0.method7461(local45, local27) - arg0.method7461(local59, local43);
								if (local375 < 0) {
									local375 = -local375;
								}
								local384 = arg0.method7461(local45, local43) - arg0.method7461(local59, local27);
								if (local384 < 0) {
									local384 = -local384;
								}
							}
							local90 = local384 > local375 ? 1 : 0;
						}
						for (local281 = 0; local281 < 13; local281++) {
							Static309.anIntArray293[local281] = -1;
							Static463.anIntArray401[local281] = 1;
						}
						@Pc(475) boolean[] local475 = local149 != null && local149.aBoolean435 ? Static246.aBooleanArrayArray2[local84] : Static92.aBooleanArrayArray1[local84];
						this.method1207(this.anInt1379, local27, local84, local10, this.anInt1373, local45, local25, local170, arg3, local149, local90, local15, local78);
						@Pc(504) boolean local504 = local149 != null && local149.anInt6223 != local149.anInt6218;
						if (!local504) {
							for (local317 = 0; local317 < 8; local317++) {
								if (Static309.anIntArray293[local317] >= 0 && Static23.anIntArray26[local317] != Static660.anIntArray589[local317]) {
									local504 = true;
									break;
								}
							}
						}
						if (!local475[local90 + 1 & 0x3]) {
							local78[1] = Static387.method5436(local78[1], (Static463.anIntArray401[4] & Static463.anIntArray401[2]) == 0);
						}
						if (!local475[local90 + 3 & 0x3]) {
							local78[3] = Static387.method5436(local78[3], (Static463.anIntArray401[0] & Static463.anIntArray401[6]) == 0);
						}
						if (!local475[local90 & 0x3]) {
							local78[0] = Static387.method5436(local78[0], (Static463.anIntArray401[2] & Static463.anIntArray401[0]) == 0);
						}
						if (!local475[local90 + 2 & 0x3]) {
							local78[2] = Static387.method5436(local78[2], (Static463.anIntArray401[6] & Static463.anIntArray401[4]) == 0);
						}
						if (!local75 && (local84 == 0 || local84 == 12)) {
							if (local78[0] && !local78[1] && !local78[2] && local78[3]) {
								local78[0] = local78[3] = false;
								local84 = local84 == 0 ? 13 : 14;
								local90 = 0;
							} else if (local78[0] && local78[1] && !local78[2] && !local78[3]) {
								local78[0] = local78[1] = false;
								local90 = 3;
								local84 = local84 == 0 ? 13 : 14;
							} else if (!local78[0] && local78[1] && local78[2] && !local78[3]) {
								local78[1] = local78[2] = false;
								local84 = local84 == 0 ? 13 : 14;
								local90 = 2;
							} else if (!local78[0] && !local78[1] && local78[2] && local78[3]) {
								local84 = local84 == 0 ? 13 : 14;
								local78[2] = local78[3] = false;
								local90 = 1;
							}
						}
						@Pc(809) boolean local809 = !local75 && !local78[0] && !local78[2] && !local78[1] && !local78[3];
						@Pc(811) int[] local811 = null;
						@Pc(831) int[] local831;
						@Pc(827) int[] local827;
						@Pc(839) int[] local839;
						if (local809) {
							local827 = Static490.anIntArrayArray55[local84];
							local839 = Static92.anIntArrayArray8[local84];
							local384 = local149 == null ? 0 : Static223.anIntArray209[local84];
							local831 = Static355.anIntArrayArray39[local84];
							local375 = local170 == null ? 0 : Static288.anIntArray278[local84];
						} else if (local75) {
							local375 = local170 == null ? 0 : Static172.anIntArray159[local84];
							local827 = Static310.anIntArrayArray35[local84];
							local831 = Static260.anIntArrayArray31[local84];
							local811 = Static167.anIntArrayArray15[local84];
							local839 = Static296.anIntArrayArray34[local84];
							local384 = local149 == null ? 0 : Static398.anIntArray345[local84];
						} else {
							local839 = Static483.anIntArrayArray45[local84];
							local827 = Static657.anIntArrayArray62[local84];
							local831 = Static639.anIntArrayArray58[local84];
							local384 = local149 == null ? 0 : Static480.anIntArray414[local84];
							local375 = local170 == null ? 0 : Static343.anIntArray317[local84];
							local811 = Static83.anIntArrayArray7[local84];
						}
						@Pc(913) int local913 = local375 + local384;
						if (local913 <= 0) {
							Static142.method2337(arg1, local27, local45);
						} else {
							if (local78[0]) {
								local913++;
							}
							if (local78[2]) {
								local913++;
							}
							if (local78[1]) {
								local913++;
							}
							if (local78[3]) {
								local913++;
							}
							@Pc(946) int local946 = 0;
							@Pc(948) int local948 = 0;
							@Pc(952) int local952 = local913 * 3;
							@Pc(959) int[] local959 = local504 ? new int[local952] : null;
							@Pc(962) int[] local962 = new int[local952];
							@Pc(965) int[] local965 = new int[local952];
							@Pc(968) int[] local968 = new int[local952];
							@Pc(971) int[] local971 = new int[local952];
							@Pc(974) int[] local974 = new int[local952];
							@Pc(981) int[] local981 = arg4 == null ? null : new int[local952];
							@Pc(990) int[] local990 = arg4 == null && arg2 == null ? null : new int[local952];
							@Pc(992) int local992 = -1;
							@Pc(994) int local994 = -1;
							@Pc(996) int local996 = 256;
							@Pc(1112) byte local1112;
							@Pc(1012) int local1012;
							@Pc(1014) int local1014;
							@Pc(1250) int local1250;
							@Pc(1256) int local1256;
							@Pc(1265) int local1265;
							@Pc(1270) int local1270;
							@Pc(1282) int local1282;
							@Pc(1275) int local1275;
							@Pc(1287) int local1287;
							@Pc(1345) int local1345;
							@Pc(1351) int local1351;
							if (local149 != null) {
								local994 = local149.anInt6226;
								local992 = local149.anInt6218;
								local996 = local149.anInt6222;
								local1012 = Static207.method7393(arg3, local149);
								for (local1014 = 0; local1014 < local384; local1014++) {
									if (local78[-local90 & 0x3] && local946 == local811[0]) {
										Static429.anIntArray384[0] = local831[local946];
										Static429.anIntArray384[1] = 1;
										Static429.anIntArray384[2] = local839[local946];
										Static429.anIntArray384[3] = 1;
										Static429.anIntArray384[4] = local827[local946];
										Static429.anIntArray384[5] = local839[local946];
										local1112 = 6;
									} else if (local78[2 - local90 & 0x3] && local811[2] == local946) {
										Static429.anIntArray384[0] = local831[local946];
										Static429.anIntArray384[1] = 5;
										Static429.anIntArray384[2] = local839[local946];
										Static429.anIntArray384[3] = 5;
										Static429.anIntArray384[4] = local827[local946];
										local1112 = 6;
										Static429.anIntArray384[5] = local839[local946];
									} else if (local78[1 - local90 & 0x3] && local811[1] == local946) {
										Static429.anIntArray384[0] = local831[local946];
										Static429.anIntArray384[1] = 3;
										Static429.anIntArray384[2] = local839[local946];
										Static429.anIntArray384[3] = 3;
										Static429.anIntArray384[4] = local827[local946];
										Static429.anIntArray384[5] = local839[local946];
										local1112 = 6;
									} else if (local78[3 - local90 & 0x3] && local946 == local811[3]) {
										Static429.anIntArray384[0] = local831[local946];
										Static429.anIntArray384[1] = 7;
										Static429.anIntArray384[2] = local839[local946];
										Static429.anIntArray384[3] = 7;
										Static429.anIntArray384[4] = local827[local946];
										local1112 = 6;
										Static429.anIntArray384[5] = local839[local946];
									} else {
										Static429.anIntArray384[0] = local831[local946];
										Static429.anIntArray384[1] = local827[local946];
										Static429.anIntArray384[2] = local839[local946];
										local1112 = 3;
									}
									for (local1250 = 0; local1250 < local1112; local1250++) {
										local1256 = Static429.anIntArray384[local1250];
										local1265 = local1256 - local90 * 2 & 0x7;
										local1270 = this.anIntArray73[local1256];
										local1275 = this.anIntArray74[local1256];
										if (local90 == 1) {
											local1282 = local1275;
											local1287 = 512 - local1270;
										} else if (local90 == 2) {
											local1282 = 512 - local1270;
											local1287 = 512 - local1275;
										} else if (local90 == 3) {
											local1282 = 512 - local1275;
											local1287 = local1270;
										} else {
											local1282 = local1270;
											local1287 = local1275;
										}
										local962[local948] = local1282;
										local965[local948] = local1287;
										if (local981 != null && Static522.aBooleanArrayArray7[local84][local1256]) {
											local1345 = (local27 << 9) + local1282;
											local1351 = local1287 + (local45 << 9);
											local981[local948] = arg4.method7452(local1345, local1351) - arg0.method7452(local1345, local1351);
										}
										if (local990 != null) {
											if (arg4 != null && !Static522.aBooleanArrayArray7[local84][local1256]) {
												local1345 = (local27 << 9) + local1282;
												local1351 = (local45 << 9) + local1287;
												local990[local948] = arg0.method7452(local1345, local1351) - arg4.method7452(local1345, local1351);
											} else if (arg2 != null && !Static316.aBooleanArrayArray3[local84][local1256]) {
												local1345 = local1282 + (local27 << 9);
												local1351 = (local45 << 9) + local1287;
												local990[local948] = arg2.method7452(local1345, local1351) - arg0.method7452(local1345, local1351);
											}
										}
										if (local1256 < 8 && local149.anInt6216 < Static309.anIntArray293[local1265]) {
											if (local959 != null) {
												local959[local948] = Static23.anIntArray26[local1265];
											}
											local974[local948] = Static470.anIntArray404[local1265];
											local971[local948] = Static373.anIntArray333[local1265];
											local968[local948] = Static660.anIntArray589[local1265];
										} else {
											if (local959 != null) {
												local959[local948] = local1012;
											}
											local971[local948] = local149.anInt6226;
											local974[local948] = local149.anInt6222;
											local968[local948] = local992;
										}
										local948++;
									}
									local946++;
								}
								if (!this.aBoolean98 && arg1 == 0) {
									Static437.method5971(local27, local45, local149.anInt6212, local149.anInt6213 * 8, local149.anInt6219);
								}
								if (local84 != 12 && local149.anInt6218 != -1 && local149.aBoolean433) {
									local73 = true;
								}
							} else if (local809) {
								local946 = Static223.anIntArray209[local84];
							} else if (local75) {
								local946 = Static398.anIntArray345[local84];
							} else {
								local946 = Static480.anIntArray414[local84];
							}
							if (local170 != null) {
								if (local122 == 0) {
									local122 = local106;
								}
								if (local114 == 0) {
									local114 = local106;
								}
								if (local130 == 0) {
									local130 = local106;
								}
								@Pc(1599) Class63 local1599 = this.aClass59_2.method1328(local106 - 1);
								@Pc(1607) Class63 local1607 = this.aClass59_2.method1328(local114 - 1);
								@Pc(1615) Class63 local1615 = this.aClass59_2.method1328(local122 - 1);
								@Pc(1623) Class63 local1623 = this.aClass59_2.method1328(local130 - 1);
								for (local1265 = 0; local1265 < local375; local1265++) {
									if (local78[-local90 & 0x3] && local811[0] == local946) {
										Static429.anIntArray384[0] = local831[local946];
										Static429.anIntArray384[1] = 1;
										Static429.anIntArray384[2] = local839[local946];
										Static429.anIntArray384[3] = 1;
										Static429.anIntArray384[4] = local827[local946];
										local1112 = 6;
										Static429.anIntArray384[5] = local839[local946];
									} else if (local78[2 - local90 & 0x3] && local811[2] == local946) {
										Static429.anIntArray384[0] = local831[local946];
										Static429.anIntArray384[1] = 5;
										Static429.anIntArray384[2] = local839[local946];
										Static429.anIntArray384[3] = 5;
										Static429.anIntArray384[4] = local827[local946];
										Static429.anIntArray384[5] = local839[local946];
										local1112 = 6;
									} else if (local78[1 - local90 & 0x3] && local946 == local811[1]) {
										Static429.anIntArray384[0] = local831[local946];
										Static429.anIntArray384[1] = 3;
										Static429.anIntArray384[2] = local839[local946];
										Static429.anIntArray384[3] = 3;
										Static429.anIntArray384[4] = local827[local946];
										local1112 = 6;
										Static429.anIntArray384[5] = local839[local946];
									} else if (local78[3 - local90 & 0x3] && local946 == local811[3]) {
										Static429.anIntArray384[0] = local831[local946];
										Static429.anIntArray384[1] = 7;
										Static429.anIntArray384[2] = local839[local946];
										Static429.anIntArray384[3] = 7;
										Static429.anIntArray384[4] = local827[local946];
										local1112 = 6;
										Static429.anIntArray384[5] = local839[local946];
									} else {
										Static429.anIntArray384[0] = local831[local946];
										Static429.anIntArray384[1] = local827[local946];
										local1112 = 3;
										Static429.anIntArray384[2] = local839[local946];
									}
									local946++;
									for (local1270 = 0; local1270 < local1112; local1270++) {
										local1282 = Static429.anIntArray384[local1270];
										local1275 = local1282 - local90 * 2 & 0x7;
										local1287 = this.anIntArray73[local1282];
										local1351 = this.anIntArray74[local1282];
										@Pc(1901) int local1901;
										if (local90 == 1) {
											local1345 = local1351;
											local1901 = 512 - local1287;
										} else if (local90 == 2) {
											local1345 = 512 - local1287;
											local1901 = 512 - local1351;
										} else if (local90 == 3) {
											local1901 = local1287;
											local1345 = 512 - local1351;
										} else {
											local1901 = local1351;
											local1345 = local1287;
										}
										local962[local948] = local1345;
										local965[local948] = local1901;
										@Pc(1951) int local1951;
										@Pc(1958) int local1958;
										if (local981 != null && Static522.aBooleanArrayArray7[local84][local1282]) {
											local1951 = (local27 << 9) + local1345;
											local1958 = (local45 << 9) + local1901;
											local981[local948] = arg4.method7452(local1951, local1958) - arg0.method7452(local1951, local1958);
										}
										if (local990 != null) {
											if (arg4 != null && !Static522.aBooleanArrayArray7[local84][local1282]) {
												local1951 = local1345 + (local27 << 9);
												local1958 = (local45 << 9) + local1901;
												local990[local948] = arg0.method7452(local1951, local1958) - arg4.method7452(local1951, local1958);
											} else if (arg2 != null && !Static316.aBooleanArrayArray3[local84][local1282]) {
												local1951 = local1345 + (local27 << 9);
												local1958 = local1901 + (local45 << 9);
												local990[local948] = arg2.method7452(local1951, local1958) - arg0.method7452(local1951, local1958);
											}
										}
										if (local1282 < 8 && Static309.anIntArray293[local1275] >= 0) {
											if (local959 != null) {
												local959[local948] = Static23.anIntArray26[local1275];
											}
											local974[local948] = Static470.anIntArray404[local1275];
											local971[local948] = Static373.anIntArray333[local1275];
											local968[local948] = Static660.anIntArray589[local1275];
										} else {
											if (local75 && Static522.aBooleanArrayArray7[local84][local1282]) {
												local971[local948] = local994;
												local974[local948] = local996;
												local968[local948] = local992;
											} else if (local1345 == 0 && local1901 == 0) {
												local968[local948] = arg5[local27][local45];
												local971[local948] = local1599.anInt1833;
												local974[local948] = local1599.anInt1823;
											} else if (local1345 == 0 && local1901 == 512) {
												local968[local948] = arg5[local27][local59];
												local971[local948] = local1607.anInt1833;
												local974[local948] = local1607.anInt1823;
											} else if (local1345 == 512 && local1901 == 512) {
												local968[local948] = arg5[local43][local59];
												local971[local948] = local1615.anInt1833;
												local974[local948] = local1615.anInt1823;
											} else if (local1345 == 512 && local1901 == 0) {
												local968[local948] = arg5[local43][local45];
												local971[local948] = local1623.anInt1833;
												local974[local948] = local1623.anInt1823;
											} else {
												if (local1345 >= 256) {
													if (local1901 < 256) {
														local971[local948] = local1623.anInt1833;
														local974[local948] = local1623.anInt1823;
													} else {
														local971[local948] = local1615.anInt1833;
														local974[local948] = local1615.anInt1823;
													}
												} else if (local1901 < 256) {
													local971[local948] = local1599.anInt1833;
													local974[local948] = local1599.anInt1823;
												} else {
													local971[local948] = local1607.anInt1833;
													local974[local948] = local1607.anInt1823;
												}
												local1951 = Static523.method6795(arg5[local43][local45], arg5[local27][local45], local1345 << 7 >> 9);
												local1958 = Static523.method6795(arg5[local43][local59], arg5[local27][local59], local1345 << 7 >> 9);
												local968[local948] = Static523.method6795(local1958, local1951, local1901 << 7 >> 9);
											}
											if (local959 != null) {
												local959[local948] = local968[local948];
											}
										}
										local948++;
									}
								}
								if (local84 != 0 && local170.aBoolean147) {
									local73 = true;
								}
							}
							local1012 = arg0.method7461(local45, local27);
							local1014 = arg0.method7461(local45, local43);
							local1250 = arg0.method7461(local59, local43);
							local1256 = arg0.method7461(local59, local27);
							@Pc(2381) boolean local2381 = Static209.method3118(local27, local45);
							if (local2381 && arg1 > 1 || !local2381 && arg1 > 0) {
								@Pc(2397) boolean local2397 = true;
								if (local170 != null && !local170.aBoolean148) {
									local2397 = false;
								} else if (local106 == 0 && local84 != 0) {
									local2397 = false;
								} else if (local98 > 0 && local172 != null && !local172.aBoolean434) {
									local2397 = false;
								}
								if (local2397 && local1012 == local1014 && local1250 == local1012 && local1256 == local1012) {
									this.aByteArrayArrayArray9[arg1][local27][local45] = (byte) (this.aByteArrayArrayArray9[arg1][local27][local45] | 0x4);
								}
							}
							local1270 = 0;
							local1282 = 0;
							local1275 = 0;
							if (this.aBoolean98) {
								local1270 = Static660.method8810(local27, local45);
								local1282 = Static153.method2450(local27, local45);
								local1275 = Static226.method3388(local27, local45);
							}
							arg0.U(local27, local45, local962, local981, local965, local990, local968, local959, local971, local974, local1270, local1282, local1275, local73);
							Static142.method2337(arg1, local27, local45);
						}
					}
				}
			}
		}
	}
}
