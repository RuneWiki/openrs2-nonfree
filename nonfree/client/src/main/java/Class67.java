import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public class Class67 {

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "[I")
	private final int[] anIntArray126 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!mi", name = "o", descriptor = "[I")
	private final int[] anIntArray127 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!mi", name = "r", descriptor = "I")
	protected final int anInt1965;

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
	public final int anInt1959;

	@OriginalMember(owner = "client!mi", name = "v", descriptor = "I")
	protected final int anInt1967;

	@OriginalMember(owner = "client!mi", name = "C", descriptor = "Lclient!ud;")
	private final Class352 aClass352_4;

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "Z")
	public final boolean aBoolean179;

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "Lclient!be;")
	private final Class32 aClass32_2;

	@OriginalMember(owner = "client!mi", name = "t", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!mi", name = "p", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!mi", name = "x", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!mi", name = "u", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(IIIZLclient!ud;Lclient!be;)V")
	protected Class67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class352 arg4, @OriginalArg(5) Class32 arg5) {
		this.anInt1965 = arg1;
		this.anInt1959 = arg0;
		this.anInt1967 = arg2;
		this.aClass352_4 = arg4;
		this.aBoolean179 = arg3;
		this.aClass32_2 = arg5;
		this.anIntArrayArrayArray2 = new int[this.anInt1959][this.anInt1965 + 1][this.anInt1967 + 1];
		this.aByteArrayArrayArray9 = new byte[this.anInt1959][this.anInt1965][this.anInt1967];
		this.aByteArrayArrayArray10 = new byte[this.anInt1959][this.anInt1965 + 1][this.anInt1967 + 1];
		this.aByteArrayArrayArray8 = new byte[this.anInt1959][this.anInt1965][this.anInt1967];
		this.aByteArrayArrayArray12 = new byte[this.anInt1959][this.anInt1965][this.anInt1967];
		this.aByteArrayArrayArray11 = new byte[this.anInt1959][this.anInt1965][this.anInt1967];
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!s;Lclient!ha;ILclient!s;)V")
	public final void method1815(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(3) Class104 arg2) {
		if (Static341.anIntArray395 == null || Static341.anIntArray395.length != this.anInt1967) {
			Static567.anIntArray589 = new int[this.anInt1967];
			Static432.anIntArray456 = new int[this.anInt1967];
			Static357.anIntArray597 = new int[this.anInt1967];
			Static341.anIntArray395 = new int[this.anInt1967];
			Static50.anIntArray55 = new int[this.anInt1967];
		}
		@Pc(38) int[][] local38 = new int[this.anInt1965][this.anInt1967];
		@Pc(44) int local44;
		for (@Pc(40) int local40 = 0; local40 < this.anInt1959; local40++) {
			for (local44 = 0; local44 < this.anInt1967; local44++) {
				Static341.anIntArray395[local44] = 0;
				Static357.anIntArray597[local44] = 0;
				Static50.anIntArray55[local44] = 0;
				Static432.anIntArray456[local44] = 0;
				Static567.anIntArray589[local44] = 0;
			}
			for (@Pc(77) int local77 = -5; local77 < this.anInt1965; local77++) {
				@Pc(87) int local87;
				@Pc(102) int local102;
				@Pc(174) int local174;
				for (@Pc(81) int local81 = 0; local81 < this.anInt1967; local81++) {
					local87 = local77 + 5;
					@Pc(151) int local151;
					if (this.anInt1965 > local87) {
						local102 = this.aByteArrayArrayArray9[local40][local87][local81] & 0xFF;
						if (local102 > 0) {
							@Pc(115) Class117 local115 = this.aClass32_2.method1172(local102 - 1);
							Static341.anIntArray395[local81] += local115.anInt2977;
							Static357.anIntArray597[local81] += local115.anInt2983;
							Static50.anIntArray55[local81] += local115.anInt2979;
							Static432.anIntArray456[local81] += local115.anInt2976;
							local151 = Static567.anIntArray589[local81]++;
						}
					}
					local102 = local77 - 5;
					if (local102 >= 0) {
						local174 = this.aByteArrayArrayArray9[local40][local102][local81] & 0xFF;
						if (local174 > 0) {
							@Pc(186) Class117 local186 = this.aClass32_2.method1172(local174 - 1);
							Static341.anIntArray395[local81] -= local186.anInt2977;
							Static357.anIntArray597[local81] -= local186.anInt2983;
							Static50.anIntArray55[local81] -= local186.anInt2979;
							Static432.anIntArray456[local81] -= local186.anInt2976;
							local151 = Static567.anIntArray589[local81]--;
						}
					}
				}
				if (local77 >= 0) {
					local87 = 0;
					local102 = 0;
					local174 = 0;
					@Pc(240) int local240 = 0;
					@Pc(242) int local242 = 0;
					for (@Pc(244) int local244 = -5; local244 < this.anInt1967; local244++) {
						@Pc(250) int local250 = local244 + 5;
						if (this.anInt1967 > local250) {
							local87 += Static341.anIntArray395[local250];
							local102 += Static357.anIntArray597[local250];
							local240 += Static432.anIntArray456[local250];
							local242 += Static567.anIntArray589[local250];
							local174 += Static50.anIntArray55[local250];
						}
						@Pc(288) int local288 = local244 - 5;
						if (local288 >= 0) {
							local242 -= Static567.anIntArray589[local288];
							local87 -= Static341.anIntArray395[local288];
							local174 -= Static50.anIntArray55[local288];
							local240 -= Static432.anIntArray456[local288];
							local102 -= Static357.anIntArray597[local288];
						}
						if (local244 >= 0 && local240 > 0 && local242 > 0) {
							local38[local77][local244] = Static416.method5965(local102 / local242, local174 / local242, local87 * 256 / local240);
						}
					}
				}
			}
			if (Static549.aBoolean404) {
				this.method1816(local38, local40 == 0 ? arg2 : null, arg1, local40, Static343.aClass104Array2[local40], local40 == 0 ? arg0 : null);
			} else {
				this.method1825(local40 == 0 ? arg0 : null, local40 == 0 ? arg2 : null, arg1, local38, Static343.aClass104Array2[local40], local40);
			}
			this.aByteArrayArrayArray9[local40] = null;
			this.aByteArrayArrayArray8[local40] = null;
			this.aByteArrayArrayArray12[local40] = null;
			this.aByteArrayArrayArray11[local40] = null;
		}
		if (!this.aBoolean179) {
			if (Static649.anInt9990 != 0) {
				Static390.method5660();
			}
			if (Static285.aBoolean412) {
				Static204.method3249();
			}
		}
		for (local44 = 0; local44 < this.anInt1959; local44++) {
			Static343.aClass104Array2[local44].YA();
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "([[ILclient!s;Lclient!ha;BILclient!s;Lclient!s;)V")
	private void method1816(@OriginalArg(0) int[][] arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class104 arg4, @OriginalArg(6) Class104 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray12[arg3];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray11[arg3];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray9[arg3];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray8[arg3];
		for (@Pc(27) int local27 = 0; local27 < this.anInt1965; local27++) {
			@Pc(41) int local41 = local27 >= this.anInt1965 - 1 ? local27 : local27 + 1;
			for (@Pc(43) int local43 = 0; local43 < this.anInt1967; local43++) {
				@Pc(57) int local57 = local43 >= this.anInt1967 - 1 ? local43 : local43 + 1;
				if (Static533.anInt8771 == -1 || Static339.method5151(local27, local43, arg3, Static533.anInt8771)) {
					@Pc(72) boolean local72 = false;
					@Pc(74) boolean local74 = false;
					@Pc(77) boolean[] local77 = new boolean[4];
					@Pc(83) int local83 = local10[local27][local43];
					@Pc(89) int local89 = local15[local27][local43];
					@Pc(97) int local97 = local25[local27][local43] & 0xFF;
					@Pc(105) int local105 = local20[local27][local43] & 0xFF;
					@Pc(113) int local113 = local20[local27][local57] & 0xFF;
					@Pc(121) int local121 = local20[local41][local57] & 0xFF;
					@Pc(129) int local129 = local20[local41][local43] & 0xFF;
					if (local97 != 0 || local105 != 0) {
						@Pc(154) Class55 local154 = local97 == 0 ? null : this.aClass352_4.method7969(local97 - 1);
						@Pc(171) Class117 local171 = local105 == 0 ? null : this.aClass32_2.method1172(local105 - 1);
						if (local83 == 0 && local154 == null) {
							local83 = 12;
						}
						@Pc(182) Class55 local182 = local154;
						if (local154 != null) {
							if (local154.anInt1618 == -1 && local154.anInt1613 == -1) {
								local182 = local154;
								local154 = null;
							} else if (local171 != null && local83 != 0) {
								local74 = local154.aBoolean147;
							}
						}
						@Pc(288) int local288;
						@Pc(303) int local303;
						@Pc(372) int local372;
						@Pc(382) int local382;
						if ((local83 == 0 || local83 == 12) && local27 > 0 && local43 > 0 && this.anInt1965 > local27 && local43 < this.anInt1967) {
							@Pc(258) int local258 = local105 == local20[local41][local43 - 1] ? 1 : -1;
							@Pc(271) int local271 = local105 == local20[local41][local57] ? 1 : -1;
							local288 = local105 == local20[local27 - 1][local43 - 1] ? 1 : -1;
							local303 = local105 == local20[local27 - 1][local57] ? 1 : -1;
							if (local20[local27][local43 - 1] == local105) {
								local288++;
								local258++;
							} else {
								local258--;
								local288--;
							}
							if (local105 == local20[local41][local43]) {
								local258++;
								local271++;
							} else {
								local258--;
								local271--;
							}
							if (local20[local27][local57] == local105) {
								local271++;
								local303++;
							} else {
								local303--;
								local271--;
							}
							if (local20[local27 - 1][local43] == local105) {
								local303++;
								local288++;
							} else {
								local303--;
								local288--;
							}
							local372 = local288 - local271;
							if (local372 < 0) {
								local372 = -local372;
							}
							local382 = local258 - local303;
							if (local382 < 0) {
								local382 = -local382;
							}
							if (local382 == local372) {
								local372 = arg4.method8279(local43, local27) - arg4.method8279(local57, local41);
								if (local372 < 0) {
									local372 = -local372;
								}
								local382 = arg4.method8279(local43, local41) - arg4.method8279(local57, local27);
								if (local382 < 0) {
									local382 = -local382;
								}
							}
							local89 = local382 <= local372 ? 0 : 1;
						}
						for (local288 = 0; local288 < 13; local288++) {
							Static468.anIntArray586[local288] = -1;
							Static214.anIntArray271[local288] = 1;
						}
						@Pc(473) boolean[] local473 = local154 != null && local154.aBoolean147 ? Static97.aBooleanArrayArray1[local83] : Static201.aBooleanArrayArray2[local83];
						this.method1826(arg2, local10, local171, local15, local43, local77, local25, local27, this.anInt1967, local89, this.anInt1965, local154, local83);
						@Pc(502) boolean local502 = local154 != null && local154.anInt1613 != local154.anInt1618;
						if (!local502) {
							for (local303 = 0; local303 < 8; local303++) {
								if (Static468.anIntArray586[local303] >= 0 && Static181.anIntArray235[local303] != Static653.anIntArray645[local303]) {
									local502 = true;
									break;
								}
							}
						}
						if (!local473[local89 + 1 & 0x3]) {
							local77[1] = Static368.method5460(local77[1], (Static214.anIntArray271[4] & Static214.anIntArray271[2]) == 0);
						}
						if (!local473[local89 + 3 & 0x3]) {
							local77[3] = Static368.method5460(local77[3], (Static214.anIntArray271[6] & Static214.anIntArray271[0]) == 0);
						}
						if (!local473[--local89 & 0x3]) {
							local77[0] = Static368.method5460(local77[0], (Static214.anIntArray271[2] & Static214.anIntArray271[0]) == 0);
						}
						if (!local473[local89 + 2 & 0x3]) {
							local77[2] = Static368.method5460(local77[2], (Static214.anIntArray271[6] & Static214.anIntArray271[4]) == 0);
						}
						if (!local74 && (local83 == 0 || local83 == 12)) {
							if (local77[0] && !local77[1] && !local77[2] && local77[3]) {
								local77[0] = local77[3] = false;
								local89 = 0;
								local83 = local83 == 0 ? 13 : 14;
							} else if (local77[0] && local77[1] && !local77[2] && !local77[3]) {
								local83 = local83 == 0 ? 13 : 14;
								local89 = 3;
								local77[0] = local77[1] = false;
							} else if (!local77[0] && local77[1] && local77[2] && !local77[3]) {
								local77[1] = local77[2] = false;
								local89 = 2;
								local83 = local83 == 0 ? 13 : 14;
							} else if (!local77[0] && !local77[1] && local77[2] && local77[3]) {
								local77[2] = local77[3] = false;
								local83 = local83 == 0 ? 13 : 14;
								local89 = 1;
							}
						}
						@Pc(815) boolean local815 = !local74 && !local77[0] && !local77[2] && !local77[1] && !local77[3];
						@Pc(817) int[] local817 = null;
						@Pc(841) int[] local841;
						@Pc(845) int[] local845;
						@Pc(849) int[] local849;
						if (local815) {
							local849 = Static91.anIntArrayArray89[local83];
							local841 = Static69.anIntArrayArray17[local83];
							local382 = local154 == null ? 0 : Static64.anIntArray78[local83];
							local845 = Static94.anIntArrayArray29[local83];
							local372 = local171 == null ? 0 : Static377.anIntArray413[local83];
						} else if (local74) {
							local382 = local154 == null ? 0 : Static63.anIntArray538[local83];
							local372 = local171 == null ? 0 : Static381.anIntArray418[local83];
							local841 = Static83.anIntArrayArray27[local83];
							local845 = Static534.anIntArrayArray87[local83];
							local849 = Static431.anIntArrayArray75[local83];
							local817 = Static471.anIntArrayArray108[local83];
						} else {
							local372 = local171 == null ? 0 : Static197.anIntArray247[local83];
							local817 = Static248.anIntArrayArray46[local83];
							local841 = Static74.anIntArrayArray21[local83];
							local849 = Static431.anIntArrayArray76[local83];
							local382 = local154 == null ? 0 : Static408.anIntArray433[local83];
							local845 = Static102.anIntArrayArray31[local83];
						}
						@Pc(919) int local919 = local372 + local382;
						if (local919 <= 0) {
							Static371.method5493(arg3, local27, local43);
						} else {
							if (local77[0]) {
								local919++;
							}
							if (local77[2]) {
								local919++;
							}
							if (local77[1]) {
								local919++;
							}
							if (local77[3]) {
								local919++;
							}
							@Pc(949) int local949 = 0;
							@Pc(951) int local951 = 0;
							@Pc(955) int local955 = local919 * 3;
							@Pc(962) int[] local962 = local502 ? new int[local955] : null;
							@Pc(965) int[] local965 = new int[local955];
							@Pc(968) int[] local968 = new int[local955];
							@Pc(971) int[] local971 = new int[local955];
							@Pc(974) int[] local974 = new int[local955];
							@Pc(977) int[] local977 = new int[local955];
							@Pc(984) int[] local984 = arg5 == null ? null : new int[local955];
							@Pc(993) int[] local993 = arg5 == null && arg1 == null ? null : new int[local955];
							@Pc(995) int local995 = -1;
							@Pc(997) int local997 = -1;
							@Pc(999) int local999 = 256;
							@Pc(1111) byte local1111;
							@Pc(1043) int local1043;
							@Pc(1045) int local1045;
							@Pc(1277) int local1277;
							@Pc(1283) int local1283;
							@Pc(1292) int local1292;
							@Pc(1297) int local1297;
							@Pc(1314) int local1314;
							@Pc(1302) int local1302;
							@Pc(1312) int local1312;
							@Pc(1372) int local1372;
							@Pc(1378) int local1378;
							if (local154 != null) {
								local995 = local154.anInt1618;
								local997 = local154.anInt1621;
								local999 = local154.anInt1622;
								local1043 = Static440.method6411(local154, arg2);
								for (local1045 = 0; local1045 < local382; local1045++) {
									if (local77[-local89 & 0x3] && local949 == local817[0]) {
										Static500.anIntArray543[0] = local841[local949];
										Static500.anIntArray543[1] = 1;
										Static500.anIntArray543[2] = local849[local949];
										Static500.anIntArray543[3] = 1;
										Static500.anIntArray543[4] = local845[local949];
										local1111 = 6;
										Static500.anIntArray543[5] = local849[local949];
									} else if (local77[2 - local89 & 0x3] && local817[2] == local949) {
										Static500.anIntArray543[0] = local841[local949];
										Static500.anIntArray543[1] = 5;
										Static500.anIntArray543[2] = local849[local949];
										Static500.anIntArray543[3] = 5;
										Static500.anIntArray543[4] = local845[local949];
										local1111 = 6;
										Static500.anIntArray543[5] = local849[local949];
									} else if (local77[1 - local89 & 0x3] && local949 == local817[1]) {
										Static500.anIntArray543[0] = local841[local949];
										Static500.anIntArray543[1] = 3;
										Static500.anIntArray543[2] = local849[local949];
										Static500.anIntArray543[3] = 3;
										Static500.anIntArray543[4] = local845[local949];
										local1111 = 6;
										Static500.anIntArray543[5] = local849[local949];
									} else if (local77[3 - local89 & 0x3] && local817[3] == local949) {
										Static500.anIntArray543[0] = local841[local949];
										Static500.anIntArray543[1] = 7;
										Static500.anIntArray543[2] = local849[local949];
										Static500.anIntArray543[3] = 7;
										Static500.anIntArray543[4] = local845[local949];
										Static500.anIntArray543[5] = local849[local949];
										local1111 = 6;
									} else {
										Static500.anIntArray543[0] = local841[local949];
										Static500.anIntArray543[1] = local845[local949];
										local1111 = 3;
										Static500.anIntArray543[2] = local849[local949];
									}
									for (local1277 = 0; local1277 < local1111; local1277++) {
										local1283 = Static500.anIntArray543[local1277];
										local1292 = local1283 - local89 * 2 & 0x7;
										local1297 = this.anIntArray126[local1283];
										local1302 = this.anIntArray127[local1283];
										if (local89 == 1) {
											local1312 = 512 - local1297;
											local1314 = local1302;
										} else if (local89 == 2) {
											local1312 = 512 - local1302;
											local1314 = 512 - local1297;
										} else if (local89 == 3) {
											local1314 = 512 - local1302;
											local1312 = local1297;
										} else {
											local1314 = local1297;
											local1312 = local1302;
										}
										local965[local951] = local1314;
										local968[local951] = local1312;
										if (local984 != null && Static501.aBooleanArrayArray5[local83][local1283]) {
											local1372 = (local27 << 9) + local1314;
											local1378 = local1312 + (local43 << 9);
											local984[local951] = arg5.method8286(local1372, local1378) - arg4.method8286(local1372, local1378);
										}
										if (local993 != null) {
											if (arg5 != null && !Static501.aBooleanArrayArray5[local83][local1283]) {
												local1372 = (local27 << 9) + local1314;
												local1378 = local1312 + (local43 << 9);
												local993[local951] = arg4.method8286(local1372, local1378) - arg5.method8286(local1372, local1378);
											} else if (arg1 != null && !Static249.aBooleanArrayArray3[local83][local1283]) {
												local1372 = (local27 << 9) + local1314;
												local1378 = local1312 + (local43 << 9);
												local993[local951] = arg1.method8286(local1372, local1378) - arg4.method8286(local1372, local1378);
											}
										}
										if (local1283 < 8 && Static468.anIntArray586[local1292] > local154.anInt1623) {
											if (local962 != null) {
												local962[local951] = Static653.anIntArray645[local1292];
											}
											local977[local951] = Static155.anIntArray193[local1292];
											local974[local951] = Static313.anIntArray381[local1292];
											local971[local951] = Static181.anIntArray235[local1292];
										} else {
											if (local962 != null) {
												local962[local951] = local1043;
											}
											local974[local951] = local154.anInt1621;
											local977[local951] = local154.anInt1622;
											local971[local951] = local995;
										}
										local951++;
									}
									local949++;
								}
								if (!this.aBoolean179 && arg3 == 0) {
									Static15.method140(local27, local43, local154.anInt1617, local154.anInt1619 * 8, local154.anInt1620);
								}
								if (local83 != 12 && local154.anInt1618 != -1 && local154.aBoolean145) {
									local72 = true;
								}
							} else if (local815) {
								local949 = Static64.anIntArray78[local83];
							} else if (local74) {
								local949 = Static63.anIntArray538[local83];
							} else {
								local949 = Static408.anIntArray433[local83];
							}
							if (local171 != null) {
								if (local121 == 0) {
									local121 = local105;
								}
								if (local129 == 0) {
									local129 = local105;
								}
								if (local113 == 0) {
									local113 = local105;
								}
								@Pc(1601) Class117 local1601 = this.aClass32_2.method1172(local105 - 1);
								@Pc(1611) Class117 local1611 = this.aClass32_2.method1172(local113 - 1);
								@Pc(1619) Class117 local1619 = this.aClass32_2.method1172(local121 - 1);
								@Pc(1627) Class117 local1627 = this.aClass32_2.method1172(local129 - 1);
								for (local1292 = 0; local1292 < local372; local1292++) {
									if (local77[-local89 & 0x3] && local949 == local817[0]) {
										Static500.anIntArray543[0] = local841[local949];
										Static500.anIntArray543[1] = 1;
										Static500.anIntArray543[2] = local849[local949];
										Static500.anIntArray543[3] = 1;
										Static500.anIntArray543[4] = local845[local949];
										local1111 = 6;
										Static500.anIntArray543[5] = local849[local949];
									} else if (local77[2 - local89 & 0x3] && local817[2] == local949) {
										Static500.anIntArray543[0] = local841[local949];
										Static500.anIntArray543[1] = 5;
										Static500.anIntArray543[2] = local849[local949];
										Static500.anIntArray543[3] = 5;
										Static500.anIntArray543[4] = local845[local949];
										local1111 = 6;
										Static500.anIntArray543[5] = local849[local949];
									} else if (local77[1 - local89 & 0x3] && local949 == local817[1]) {
										Static500.anIntArray543[0] = local841[local949];
										Static500.anIntArray543[1] = 3;
										Static500.anIntArray543[2] = local849[local949];
										Static500.anIntArray543[3] = 3;
										Static500.anIntArray543[4] = local845[local949];
										local1111 = 6;
										Static500.anIntArray543[5] = local849[local949];
									} else if (local77[3 - local89 & 0x3] && local817[3] == local949) {
										Static500.anIntArray543[0] = local841[local949];
										Static500.anIntArray543[1] = 7;
										Static500.anIntArray543[2] = local849[local949];
										Static500.anIntArray543[3] = 7;
										Static500.anIntArray543[4] = local845[local949];
										local1111 = 6;
										Static500.anIntArray543[5] = local849[local949];
									} else {
										Static500.anIntArray543[0] = local841[local949];
										Static500.anIntArray543[1] = local845[local949];
										local1111 = 3;
										Static500.anIntArray543[2] = local849[local949];
									}
									for (local1297 = 0; local1297 < local1111; local1297++) {
										local1314 = Static500.anIntArray543[local1297];
										local1302 = local1314 - local89 * 2 & 0x7;
										local1312 = this.anIntArray126[local1314];
										local1378 = this.anIntArray127[local1314];
										@Pc(1903) int local1903;
										if (local89 == 1) {
											local1903 = 512 - local1312;
											local1372 = local1378;
										} else if (local89 == 2) {
											local1372 = 512 - local1312;
											local1903 = 512 - local1378;
										} else if (local89 == 3) {
											local1372 = 512 - local1378;
											local1903 = local1312;
										} else {
											local1372 = local1312;
											local1903 = local1378;
										}
										local965[local951] = local1372;
										local968[local951] = local1903;
										@Pc(1952) int local1952;
										@Pc(1959) int local1959;
										if (local984 != null && Static501.aBooleanArrayArray5[local83][local1314]) {
											local1952 = local1372 + (local27 << 9);
											local1959 = (local43 << 9) + local1903;
											local984[local951] = arg5.method8286(local1952, local1959) - arg4.method8286(local1952, local1959);
										}
										if (local993 != null) {
											if (arg5 != null && !Static501.aBooleanArrayArray5[local83][local1314]) {
												local1952 = local1372 + (local27 << 9);
												local1959 = local1903 + (local43 << 9);
												local993[local951] = arg4.method8286(local1952, local1959) - arg5.method8286(local1952, local1959);
											} else if (arg1 != null && !Static249.aBooleanArrayArray3[local83][local1314]) {
												local1952 = (local27 << 9) + local1372;
												local1959 = local1903 + (local43 << 9);
												local993[local951] = arg1.method8286(local1952, local1959) - arg4.method8286(local1952, local1959);
											}
										}
										if (local1314 < 8 && Static468.anIntArray586[local1302] >= 0) {
											if (local962 != null) {
												local962[local951] = Static653.anIntArray645[local1302];
											}
											local977[local951] = Static155.anIntArray193[local1302];
											local974[local951] = Static313.anIntArray381[local1302];
											local971[local951] = Static181.anIntArray235[local1302];
										} else {
											if (local74 && Static501.aBooleanArrayArray5[local83][local1314]) {
												local974[local951] = local997;
												local977[local951] = local999;
												local971[local951] = local995;
											} else if (local1372 == 0 && local1903 == 0) {
												local971[local951] = arg0[local27][local43];
												local974[local951] = local1601.anInt2982;
												local977[local951] = local1601.anInt2973;
											} else if (local1372 == 0 && local1903 == 512) {
												local971[local951] = arg0[local27][local57];
												local974[local951] = local1611.anInt2982;
												local977[local951] = local1611.anInt2973;
											} else if (local1372 == 512 && local1903 == 512) {
												local971[local951] = arg0[local41][local57];
												local974[local951] = local1619.anInt2982;
												local977[local951] = local1619.anInt2973;
											} else if (local1372 == 512 && local1903 == 0) {
												local971[local951] = arg0[local41][local43];
												local974[local951] = local1627.anInt2982;
												local977[local951] = local1627.anInt2973;
											} else {
												if (local1372 >= 256) {
													if (local1903 < 256) {
														local974[local951] = local1627.anInt2982;
														local977[local951] = local1627.anInt2973;
													} else {
														local974[local951] = local1619.anInt2982;
														local977[local951] = local1619.anInt2973;
													}
												} else if (local1903 >= 256) {
													local974[local951] = local1611.anInt2982;
													local977[local951] = local1611.anInt2973;
												} else {
													local974[local951] = local1601.anInt2982;
													local977[local951] = local1601.anInt2973;
												}
												local1952 = Static349.method5248(arg0[local41][local43], local1372 << 7 >> 9, arg0[local27][local43]);
												local1959 = Static349.method5248(arg0[local41][local57], local1372 << 7 >> 9, arg0[local27][local57]);
												local971[local951] = Static349.method5248(local1959, local1903 << 7 >> 9, local1952);
											}
											if (local962 != null) {
												local962[local951] = local971[local951];
											}
										}
										local951++;
									}
									local949++;
								}
								if (local83 != 0 && local171.aBoolean235) {
									local72 = true;
								}
							}
							local1043 = arg4.method8279(local43, local27);
							local1045 = arg4.method8279(local43, local41);
							local1277 = arg4.method8279(local57, local41);
							local1283 = arg4.method8279(local57, local27);
							@Pc(2385) boolean local2385 = Static190.method3051(local43, local27);
							if (local2385 && arg3 > 1 || !local2385 && arg3 > 0) {
								@Pc(2399) boolean local2399 = true;
								if (local171 != null && !local171.aBoolean234) {
									local2399 = false;
								} else if (local105 == 0 && local83 != 0) {
									local2399 = false;
								} else if (local97 > 0 && local182 != null && !local182.aBoolean146) {
									local2399 = false;
								}
								if (local2399 && local1043 == local1045 && local1043 == local1277 && local1043 == local1283) {
									this.aByteArrayArrayArray10[arg3][local27][local43] = (byte) (this.aByteArrayArrayArray10[arg3][local27][local43] | 0x4);
								}
							}
							local1297 = 0;
							local1314 = 0;
							local1302 = 0;
							if (this.aBoolean179) {
								local1297 = Static85.method1783(local27, local43);
								local1314 = Static328.method5087(local27, local43);
								local1302 = Static154.method2639(local27, local43);
							}
							arg4.U(local27, local43, local965, local984, local968, local993, local971, local962, local974, local977, local1297, local1314, local1302, local72);
							Static371.method5493(arg3, local27, local43);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIZ)V")
	public final void method1817(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1959; local3++) {
			this.method1819(local3, 64, arg1, 64, arg0);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "([Lclient!jo;IIIBILclient!fca;)V")
	public final void method1818(@OriginalArg(0) Class198[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class3_Sub17 arg5) {
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(26) int local26;
		@Pc(33) int local33;
		if (!this.aBoolean179) {
			for (local14 = 0; local14 < 4; local14++) {
				@Pc(20) Class198 local20 = arg0[local14];
				for (local22 = 0; local22 < 64; local22++) {
					for (local26 = 0; local26 < 64; local26++) {
						local33 = arg4 + local22;
						@Pc(37) int local37 = local26 + arg1;
						if (local33 >= 0 && local33 < this.anInt1965 && local37 >= 0 && local37 < this.anInt1967) {
							local20.method4525(local37, local33);
						}
					}
				}
			}
		}
		local14 = arg3 + arg4;
		@Pc(95) int local95 = arg2 + arg1;
		for (local22 = 0; local22 < this.anInt1959; local22++) {
			for (local26 = 0; local26 < 64; local26++) {
				for (local33 = 0; local33 < 64; local33++) {
					this.method1822(arg1 + local33, 0, false, local26 + local14, local33 + local95, 0, local22, arg5, 0, arg4 + local26);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIII)V")
	public final void method1819(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = arg2; local3 < arg2 + arg3; local3++) {
			for (local7 = arg4; local7 < arg4 + arg1; local7++) {
				if (local7 >= 0 && local7 < this.anInt1965 && local3 >= 0 && this.anInt1967 > local3) {
					this.anIntArrayArrayArray2[arg0][local7][local3] = arg0 <= 0 ? 0 : this.anIntArrayArrayArray2[arg0 - 1][local7][local3] - 960;
				}
			}
		}
		if (arg4 > 0 && arg4 < this.anInt1965) {
			for (local7 = arg2 + 1; local7 < arg2 + arg3; local7++) {
				if (local7 >= 0 && this.anInt1967 > local7) {
					this.anIntArrayArrayArray2[arg0][arg4][local7] = this.anIntArrayArrayArray2[arg0][arg4 - 1][local7];
				}
			}
		}
		if (arg2 > 0 && arg2 < this.anInt1967) {
			for (local7 = arg4 + 1; local7 < arg4 + arg1; local7++) {
				if (local7 >= 0 && this.anInt1965 > local7) {
					this.anIntArrayArrayArray2[arg0][local7][arg2] = this.anIntArrayArrayArray2[arg0][local7][arg2 - 1];
				}
			}
		}
		if (arg4 < 0 || arg2 < 0 || arg4 >= this.anInt1965 || arg2 >= this.anInt1967) {
			return;
		}
		if (arg0 != 0) {
			if (arg4 > 0 && this.anIntArrayArrayArray2[arg0 - 1][arg4 - 1][arg2] != this.anIntArrayArrayArray2[arg0][arg4 - 1][arg2]) {
				this.anIntArrayArrayArray2[arg0][arg4][arg2] = this.anIntArrayArrayArray2[arg0][arg4 - 1][arg2];
				return;
			}
			if (arg2 > 0 && this.anIntArrayArrayArray2[arg0 - 1][arg4][arg2 - 1] != this.anIntArrayArrayArray2[arg0][arg4][arg2 - 1]) {
				this.anIntArrayArrayArray2[arg0][arg4][arg2] = this.anIntArrayArrayArray2[arg0][arg4][arg2 - 1];
				return;
			}
			if (arg4 > 0 && arg2 > 0 && this.anIntArrayArrayArray2[arg0 - 1][arg4 - 1][arg2 - 1] != this.anIntArrayArrayArray2[arg0][arg4 - 1][arg2 - 1]) {
				this.anIntArrayArrayArray2[arg0][arg4][arg2] = this.anIntArrayArrayArray2[arg0][arg4 - 1][arg2 - 1];
				return;
			}
			return;
		}
		if (arg4 > 0 && this.anIntArrayArrayArray2[arg0][arg4 - 1][arg2] != 0) {
			this.anIntArrayArrayArray2[arg0][arg4][arg2] = this.anIntArrayArrayArray2[arg0][arg4 - 1][arg2];
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray2[arg0][arg4][arg2 - 1] != 0) {
			this.anIntArrayArrayArray2[arg0][arg4][arg2] = this.anIntArrayArrayArray2[arg0][arg4][arg2 - 1];
			return;
		}
		if (arg4 > 0 && arg2 > 0 && this.anIntArrayArrayArray2[arg0][arg4 - 1][arg2 - 1] != 0) {
			this.anIntArrayArrayArray2[arg0][arg4][arg2] = this.anIntArrayArrayArray2[arg0][arg4 - 1][arg2 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIZIIIIILclient!fca;II)V")
	private void method1822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class3_Sub17 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg1 == 1) {
			arg5 = 1;
		} else if (arg1 == 2) {
			arg8 = 1;
			arg5 = 1;
		} else if (arg1 == 3) {
			arg8 = 1;
		}
		@Pc(47) int local47;
		if (arg9 < 0 || this.anInt1965 <= arg9 || arg0 < 0 || arg0 >= this.anInt1967) {
			while (true) {
				local47 = arg7.method4888();
				if (local47 == 0) {
					break;
				}
				if (local47 == 1) {
					arg7.method4888();
					break;
				}
				if (local47 <= 49) {
					arg7.method4888();
				}
			}
			return;
		}
		if (!this.aBoolean179 && !arg2) {
			Static338.aByteArrayArrayArray13[arg6][arg9][arg0] = 0;
		}
		while (true) {
			local47 = arg7.method4888();
			if (local47 == 0) {
				if (this.aBoolean179) {
					this.anIntArrayArrayArray2[0][arg9 + arg8][arg0 + arg5] = 0;
				} else if (arg6 == 0) {
					this.anIntArrayArrayArray2[0][arg8 + arg9][arg5 + arg0] = -Static617.method8096(arg3 + 932731, arg4 + 556238) * 8 << 2;
				} else {
					this.anIntArrayArrayArray2[arg6][arg9 + arg8][arg5 + arg0] = this.anIntArrayArrayArray2[arg6 - 1][arg8 + arg9][arg0 + arg5] - 960;
				}
				break;
			}
			if (local47 == 1) {
				@Pc(182) int local182 = arg7.method4888();
				if (this.aBoolean179) {
					this.anIntArrayArrayArray2[0][arg9 + arg8][arg5 + arg0] = local182 * 8 << 2;
				} else {
					if (local182 == 1) {
						local182 = 0;
					}
					if (arg6 == 0) {
						this.anIntArrayArrayArray2[0][arg8 + arg9][arg5 + arg0] = -local182 * 8 << 2;
					} else {
						this.anIntArrayArrayArray2[arg6][arg8 + arg9][arg0 + arg5] = this.anIntArrayArrayArray2[arg6 - 1][arg8 + arg9][arg0 + arg5] - (local182 * 8 << 2);
					}
				}
				break;
			}
			if (local47 <= 49) {
				if (arg2) {
					arg7.method4888();
				} else {
					this.aByteArrayArrayArray8[arg6][arg9][arg0] = arg7.method4861();
					this.aByteArrayArrayArray12[arg6][arg9][arg0] = (byte) ((local47 - 2) / 4);
					this.aByteArrayArrayArray11[arg6][arg9][arg0] = (byte) (arg1 + local47 - 2 & 0x3);
				}
			} else if (local47 <= 81) {
				if (!this.aBoolean179 && !arg2) {
					Static338.aByteArrayArrayArray13[arg6][arg9][arg0] = (byte) (local47 - 49);
				}
			} else if (!arg2) {
				this.aByteArrayArrayArray9[arg6][arg9][arg0] = (byte) (local47 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB[[I)V")
	public final void method1824(@OriginalArg(2) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray2[0];
		for (@Pc(18) int local18 = 0; local18 < this.anInt1965 + 1; local18++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt1967 + 1; local22++) {
				local10[local18][local22] += arg0[local18][local22];
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLclient!s;Lclient!s;Lclient!ha;[[ILclient!s;I)V")
	private void method1825(@OriginalArg(1) Class104 arg0, @OriginalArg(2) Class104 arg1, @OriginalArg(3) Class16 arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) Class104 arg4, @OriginalArg(6) int arg5) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1965; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt1967; local11++) {
				if (Static533.anInt8771 == -1 || Static339.method5151(local7, local11, arg5, Static533.anInt8771)) {
					@Pc(36) byte local36 = this.aByteArrayArrayArray12[arg5][local7][local11];
					@Pc(45) byte local45 = this.aByteArrayArrayArray11[arg5][local7][local11];
					@Pc(56) int local56 = this.aByteArrayArrayArray8[arg5][local7][local11] & 0xFF;
					@Pc(67) int local67 = this.aByteArrayArrayArray9[arg5][local7][local11] & 0xFF;
					@Pc(79) Class55 local79 = local56 == 0 ? null : this.aClass352_4.method7969(local56 - 1);
					@Pc(93) Class117 local93 = local67 == 0 ? null : this.aClass32_2.method1172(local67 - 1);
					if (local36 == 0 && local79 == null) {
						local36 = 12;
					}
					@Pc(101) Class55 local101 = local79;
					if (local79 != null && local79.anInt1618 == -1 && local79.anInt1613 == -1) {
						local101 = local79;
						local79 = null;
					}
					if (local79 != null || local93 != null) {
						@Pc(124) int local124 = Static377.anIntArray413[local36];
						@Pc(128) int local128 = Static64.anIntArray78[local36];
						@Pc(140) int local140 = (local79 == null ? 0 : local128) + (local93 == null ? 0 : local124);
						@Pc(142) int local142 = 0;
						@Pc(144) int local144 = 0;
						@Pc(151) int local151 = local79 == null ? -1 : local79.anInt1621;
						@Pc(158) int local158 = local93 == null ? -1 : local93.anInt2982;
						@Pc(161) int[] local161 = new int[local140];
						@Pc(164) int[] local164 = new int[local140];
						@Pc(167) int[] local167 = new int[local140];
						@Pc(170) int[] local170 = new int[local140];
						@Pc(173) int[] local173 = new int[local140];
						@Pc(176) int[] local176 = new int[local140];
						@Pc(187) int[] local187 = local79 == null || local79.anInt1613 == -1 ? null : new int[local140];
						@Pc(197) int local197;
						if (local79 == null) {
							local144 = local128;
						} else {
							for (local197 = 0; local197 < local128; local197++) {
								local161[local142] = Static69.anIntArrayArray17[local36][local144];
								local164[local142] = Static94.anIntArrayArray29[local36][local144];
								local167[local142] = Static91.anIntArrayArray89[local36][local144];
								local173[local142] = local151;
								local176[local142] = local79.anInt1622;
								local170[local142] = local79.anInt1618;
								if (local187 != null) {
									local187[local142] = local79.anInt1613;
								}
								local144++;
								local142++;
							}
							if (!this.aBoolean179 && arg5 == 0) {
								Static15.method140(local7, local11, local79.anInt1617, local79.anInt1619 * 8, local79.anInt1620);
							}
						}
						if (local93 != null) {
							for (local197 = 0; local197 < local124; local197++) {
								local161[local142] = Static69.anIntArrayArray17[local36][local144];
								local164[local142] = Static94.anIntArrayArray29[local36][local144];
								local167[local142] = Static91.anIntArrayArray89[local36][local144];
								local173[local142] = local158;
								local176[local142] = local93.anInt2973;
								local170[local142] = arg3[local7][local11];
								if (local187 != null) {
									local187[local142] = local170[local142];
								}
								local142++;
								local144++;
							}
						}
						local197 = this.anIntArray126.length;
						@Pc(345) int[] local345 = new int[local197];
						@Pc(348) int[] local348 = new int[local197];
						@Pc(355) int[] local355 = arg0 == null ? null : new int[local197];
						@Pc(364) int[] local364 = arg0 == null && arg1 == null ? null : new int[local197];
						@Pc(373) int local373;
						@Pc(378) int local378;
						@Pc(465) int local465;
						@Pc(474) int local474;
						for (@Pc(366) int local366 = 0; local366 < local197; local366++) {
							local373 = this.anIntArray126[local366];
							local378 = this.anIntArray127[local366];
							if (local45 == 0) {
								local345[local366] = local373;
								local348[local366] = local378;
							} else if (local45 == 1) {
								local345[local366] = local378;
								local348[local366] = 512 - local373;
							} else if (local45 == 2) {
								local345[local366] = 512 - local373;
								local348[local366] = 512 - local378;
							} else if (local45 == 3) {
								local345[local366] = 512 - local378;
								local348[local366] = local373;
							}
							if (local355 != null && Static501.aBooleanArrayArray5[local36][local366]) {
								local465 = (local7 << 9) + local345[local366];
								local474 = (local11 << 9) + local348[local366];
								local355[local366] = arg0.method8286(local465, local474) - arg4.method8286(local465, local474);
							}
							if (local364 != null) {
								if (arg0 != null && !Static501.aBooleanArrayArray5[local36][local366]) {
									local465 = (local7 << 9) + local345[local366];
									local474 = (local11 << 9) + local348[local366];
									local364[local366] = arg4.method8286(local465, local474) - arg0.method8286(local465, local474);
								} else if (arg1 != null && !Static249.aBooleanArrayArray3[local36][local366]) {
									local465 = (local7 << 9) + local345[local366];
									local474 = (local11 << 9) + local348[local366];
									local364[local366] = arg1.method8286(local465, local474) - arg4.method8286(local465, local474);
								}
							}
						}
						local373 = arg4.method8279(local11, local7);
						local378 = arg4.method8279(local11, local7 + 1);
						local465 = arg4.method8279(local11 + 1, local7 + 1);
						local474 = arg4.method8279(local11 + 1, local7);
						@Pc(614) boolean local614 = Static190.method3051(local11, local7);
						if (local614 && arg5 > 1 || !local614 && arg5 > 0) {
							@Pc(625) boolean local625 = true;
							if (local93 != null && !local93.aBoolean234) {
								local625 = false;
							} else if (local67 == 0 && local36 != 0) {
								local625 = false;
							} else if (local56 > 0 && local101 != null && !local101.aBoolean146) {
								local625 = false;
							}
							if (local625 && local378 == local373 && local373 == local465 && local474 == local373) {
								this.aByteArrayArrayArray10[arg5][local7][local11] = (byte) (this.aByteArrayArrayArray10[arg5][local7][local11] | 0x4);
							}
						}
						@Pc(694) int local694 = 0;
						@Pc(696) int local696 = 0;
						@Pc(698) int local698 = 0;
						if (this.aBoolean179) {
							local694 = Static85.method1783(local7, local11);
							local696 = Static328.method5087(local7, local11);
							local698 = Static154.method2639(local7, local11);
						}
						arg4.method8280(local7, local11, local345, local355, local348, local364, local161, local164, local167, local170, local187, local173, local176, local694, local696, local698);
						Static371.method5493(arg5, local7, local11);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!ha;[[BLclient!fea;[[BBI[Z[[BIIIILclient!cda;I)V")
	private void method1826(@OriginalArg(0) Class16 arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) Class117 arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean[] arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class55 arg11, @OriginalArg(13) int arg12) {
		@Pc(18) boolean[] local18 = arg11 != null && arg11.aBoolean147 ? Static97.aBooleanArrayArray1[arg12] : Static201.aBooleanArrayArray2[arg12];
		@Pc(34) int local34;
		@Pc(44) Class55 local44;
		@Pc(62) byte local62;
		@Pc(79) int local79;
		@Pc(84) int local84;
		if (arg4 > 0) {
			if (arg7 > 0) {
				local34 = arg6[arg7 - 1][arg4 - 1] & 0xFF;
				if (local34 > 0) {
					local44 = this.aClass352_4.method7969(local34 - 1);
					if (local44.anInt1618 != -1 && local44.aBoolean147) {
						local62 = arg1[arg7 - 1][arg4 - 1];
						local79 = arg3[arg7 - 1][arg4 - 1] * 2 + 4 & 0x7;
						local84 = Static440.method6411(local44, arg0);
						if (Static501.aBooleanArrayArray5[local62][local79]) {
							Static181.anIntArray235[0] = local44.anInt1618;
							Static653.anIntArray645[0] = local84;
							Static313.anIntArray381[0] = local44.anInt1621;
							Static155.anIntArray193[0] = local44.anInt1622;
							Static468.anIntArray586[0] = local44.anInt1623;
							Static214.anIntArray271[0] = 256;
						}
					}
				}
			}
			if (arg7 < arg10 - 1) {
				local34 = arg6[arg7 + 1][arg4 - 1] & 0xFF;
				if (local34 > 0) {
					local44 = this.aClass352_4.method7969(local34 - 1);
					if (local44.anInt1618 != -1 && local44.aBoolean147) {
						local62 = arg1[arg7 + 1][arg4 - 1];
						local79 = arg3[arg7 + 1][arg4 - 1] * 2 + 6 & 0x7;
						local84 = Static440.method6411(local44, arg0);
						if (Static501.aBooleanArrayArray5[local62][local79]) {
							Static181.anIntArray235[2] = local44.anInt1618;
							Static653.anIntArray645[2] = local84;
							Static313.anIntArray381[2] = local44.anInt1621;
							Static155.anIntArray193[2] = local44.anInt1622;
							Static468.anIntArray586[2] = local44.anInt1623;
							Static214.anIntArray271[2] = 512;
						}
					}
				}
			}
		}
		if (arg4 < arg8 - 1) {
			if (arg7 > 0) {
				local34 = arg6[arg7 - 1][arg4 + 1] & 0xFF;
				if (local34 > 0) {
					local44 = this.aClass352_4.method7969(local34 - 1);
					if (local44.anInt1618 != -1 && local44.aBoolean147) {
						local62 = arg1[arg7 - 1][arg4 + 1];
						local79 = arg3[arg7 - 1][arg4 + 1] * 2 + 2 & 0x7;
						local84 = Static440.method6411(local44, arg0);
						if (Static501.aBooleanArrayArray5[local62][local79]) {
							Static181.anIntArray235[6] = local44.anInt1618;
							Static653.anIntArray645[6] = local84;
							Static313.anIntArray381[6] = local44.anInt1621;
							Static155.anIntArray193[6] = local44.anInt1622;
							Static468.anIntArray586[6] = local44.anInt1623;
							Static214.anIntArray271[6] = 64;
						}
					}
				}
			}
			if (arg7 < arg10 - 1) {
				local34 = arg6[arg7 + 1][arg4 + 1] & 0xFF;
				if (local34 > 0) {
					local44 = this.aClass352_4.method7969(local34 - 1);
					if (local44.anInt1618 != -1 && local44.aBoolean147) {
						local62 = arg1[arg7 + 1][arg4 + 1];
						local79 = arg3[arg7 + 1][arg4 + 1] * 2 & 0x7;
						local84 = Static440.method6411(local44, arg0);
						if (Static501.aBooleanArrayArray5[local62][local79]) {
							Static181.anIntArray235[4] = local44.anInt1618;
							Static653.anIntArray645[4] = local84;
							Static313.anIntArray381[4] = local44.anInt1621;
							Static155.anIntArray193[4] = local44.anInt1622;
							Static468.anIntArray586[4] = local44.anInt1623;
							Static214.anIntArray271[4] = 128;
						}
					}
				}
			}
		}
		@Pc(484) int local484;
		@Pc(489) int local489;
		@Pc(491) int local491;
		@Pc(473) byte local473;
		if (arg4 > 0) {
			local34 = arg6[arg7][arg4 - 1] & 0xFF;
			if (local34 > 0) {
				local44 = this.aClass352_4.method7969(local34 - 1);
				if (local44.anInt1618 != -1) {
					local62 = arg1[arg7][arg4 - 1];
					local473 = arg3[arg7][arg4 - 1];
					if (local44.aBoolean147) {
						local84 = 2;
						local484 = local473 * 2 + 4;
						local489 = Static440.method6411(local44, arg0);
						for (local491 = 0; local491 < 3; local491++) {
							local484 &= 0x7;
							local84 &= 0x7;
							if (Static501.aBooleanArrayArray5[local62][local484] && local44.anInt1623 >= Static468.anIntArray586[local84]) {
								Static181.anIntArray235[local84] = local44.anInt1618;
								Static653.anIntArray645[local84] = local489;
								Static313.anIntArray381[local84] = local44.anInt1621;
								Static155.anIntArray193[local84] = local44.anInt1622;
								if (Static468.anIntArray586[local84] == local44.anInt1623) {
									Static214.anIntArray271[local84] |= 0x20;
								} else {
									Static214.anIntArray271[local84] = 32;
								}
								Static468.anIntArray586[local84] = local44.anInt1623;
							}
							local84--;
							local484++;
						}
						if (!local18[arg9 & 0x3]) {
							arg5[0] = Static97.aBooleanArrayArray1[local62][local473 + 2 & 0x3];
						}
					} else if (!local18[arg9 & 0x3]) {
						arg5[0] = Static201.aBooleanArrayArray2[local62][local473 + 2 & 0x3];
					}
				}
			}
		}
		if (arg4 < arg8 - 1) {
			local34 = arg6[arg7][arg4 + 1] & 0xFF;
			if (local34 > 0) {
				local44 = this.aClass352_4.method7969(local34 - 1);
				if (local44.anInt1618 != -1) {
					local62 = arg1[arg7][arg4 + 1];
					local473 = arg3[arg7][arg4 + 1];
					if (local44.aBoolean147) {
						local84 = 4;
						local484 = local473 * 2 + 2;
						local489 = Static440.method6411(local44, arg0);
						for (local491 = 0; local491 < 3; local491++) {
							local84 &= 0x7;
							local484 &= 0x7;
							if (Static501.aBooleanArrayArray5[local62][local484] && local44.anInt1623 >= Static468.anIntArray586[local84]) {
								Static181.anIntArray235[local84] = local44.anInt1618;
								Static653.anIntArray645[local84] = local489;
								Static313.anIntArray381[local84] = local44.anInt1621;
								Static155.anIntArray193[local84] = local44.anInt1622;
								if (local44.anInt1623 == Static468.anIntArray586[local84]) {
									Static214.anIntArray271[local84] |= 0x10;
								} else {
									Static214.anIntArray271[local84] = 16;
								}
								Static468.anIntArray586[local84] = local44.anInt1623;
							}
							local484--;
							local84++;
						}
						if (!local18[arg9 + 2 & 0x3]) {
							arg5[2] = Static97.aBooleanArrayArray1[local62][local473 & 0x3];
						}
					} else if (!local18[arg9 + 2 & 0x3]) {
						arg5[2] = Static201.aBooleanArrayArray2[local62][local473 & 0x3];
					}
				}
			}
		}
		if (arg7 > 0) {
			local34 = arg6[arg7 - 1][arg4] & 0xFF;
			if (local34 > 0) {
				local44 = this.aClass352_4.method7969(local34 - 1);
				if (local44.anInt1618 != -1) {
					local62 = arg1[arg7 - 1][arg4];
					local473 = arg3[arg7 - 1][arg4];
					if (local44.aBoolean147) {
						local84 = 6;
						local484 = local473 * 2 + 4;
						local489 = Static440.method6411(local44, arg0);
						for (local491 = 0; local491 < 3; local491++) {
							local484 &= 0x7;
							local84 &= 0x7;
							if (Static501.aBooleanArrayArray5[local62][local484] && local44.anInt1623 >= Static468.anIntArray586[local84]) {
								Static181.anIntArray235[local84] = local44.anInt1618;
								Static653.anIntArray645[local84] = local489;
								Static313.anIntArray381[local84] = local44.anInt1621;
								Static155.anIntArray193[local84] = local44.anInt1622;
								if (Static468.anIntArray586[local84] == local44.anInt1623) {
									Static214.anIntArray271[local84] |= 0x8;
								} else {
									Static214.anIntArray271[local84] = 8;
								}
								Static468.anIntArray586[local84] = local44.anInt1623;
							}
							local484--;
							local84++;
						}
						if (!local18[arg9 + 3 & 0x3]) {
							arg5[3] = Static97.aBooleanArrayArray1[local62][local473 + 1 & 0x3];
						}
					} else if (!local18[arg9 + 3 & 0x3]) {
						arg5[3] = Static201.aBooleanArrayArray2[local62][local473 + 1 & 0x3];
					}
				}
			}
		}
		if (arg7 < arg10 - 1) {
			local34 = arg6[arg7 + 1][arg4] & 0xFF;
			if (local34 > 0) {
				local44 = this.aClass352_4.method7969(local34 - 1);
				if (local44.anInt1618 != -1) {
					local62 = arg1[arg7 + 1][arg4];
					local473 = arg3[arg7 + 1][arg4];
					if (local44.aBoolean147) {
						local84 = 4;
						local484 = local473 * 2 + 6;
						local489 = Static440.method6411(local44, arg0);
						for (local491 = 0; local491 < 3; local491++) {
							local484 &= 0x7;
							local84 &= 0x7;
							if (Static501.aBooleanArrayArray5[local62][local484] && Static468.anIntArray586[local84] <= local44.anInt1623) {
								Static181.anIntArray235[local84] = local44.anInt1618;
								Static653.anIntArray645[local84] = local489;
								Static313.anIntArray381[local84] = local44.anInt1621;
								Static155.anIntArray193[local84] = local44.anInt1622;
								if (Static468.anIntArray586[local84] == local44.anInt1623) {
									Static214.anIntArray271[local84] |= 0x4;
								} else {
									Static214.anIntArray271[local84] = 4;
								}
								Static468.anIntArray586[local84] = local44.anInt1623;
							}
							local84--;
							local484++;
						}
						if (!local18[arg9 + 1 & 0x3]) {
							arg5[1] = Static97.aBooleanArrayArray1[local62][local473 + 3 & 0x3];
						}
					} else if (!local18[arg9 + 1 & 0x3]) {
						arg5[1] = Static201.aBooleanArrayArray2[local62][local473 + 3 & 0x3];
					}
				}
			}
		}
		if (arg11 == null) {
			return;
		}
		local34 = Static440.method6411(arg11, arg0);
		if (!arg11.aBoolean147) {
			return;
		}
		for (@Pc(1180) int local1180 = 0; local1180 < 8; local1180++) {
			@Pc(1191) int local1191 = local1180 - arg9 * 2 & 0x7;
			if (Static501.aBooleanArrayArray5[arg12][local1180] && Static468.anIntArray586[local1191] <= arg11.anInt1623) {
				Static181.anIntArray235[local1191] = arg11.anInt1618;
				Static653.anIntArray645[local1191] = local34;
				Static313.anIntArray381[local1191] = arg11.anInt1621;
				Static155.anIntArray193[local1191] = arg11.anInt1622;
				if (arg11.anInt1623 == Static468.anIntArray586[local1191]) {
					Static214.anIntArray271[local1191] |= 0x2;
				} else {
					Static214.anIntArray271[local1191] = 2;
				}
				Static468.anIntArray586[local1191] = arg11.anInt1623;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "([Lclient!jo;IIIIIILclient!fca;II)V")
	public final void method1827(@OriginalArg(0) Class198[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class3_Sub17 arg7, @OriginalArg(8) int arg8) {
		@Pc(11) int local11 = (arg6 & 0x7) * 8;
		@Pc(20) int local20;
		@Pc(50) int local50;
		if (!this.aBoolean179) {
			@Pc(18) Class198 local18 = arg0[arg4];
			for (local20 = 0; local20 < 8; local20++) {
				for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
					@Pc(38) int local38 = Static674.method8719(arg8, local20 & 0x7, local24 & 0x7) + arg1;
					local50 = Static141.method2439(arg8, local20 & 0x7, local24 & 0x7) + arg2;
					if (local38 > 0 && local38 < this.anInt1965 - 1 && local50 > 0 && local50 < this.anInt1967 - 1) {
						local18.method4525(local50, local38);
					}
				}
			}
		}
		@Pc(94) int local94 = (arg3 & 0x7) * 8;
		@Pc(100) int local100 = (arg6 & 0xFFFFFFF8) << 3;
		local20 = (arg3 & 0xFFFFFFF8) << 3;
		@Pc(108) byte local108 = 0;
		@Pc(129) byte local129 = 0;
		if (arg8 == 1) {
			local129 = 1;
		} else if (arg8 == 2) {
			local108 = 1;
			local129 = 1;
		} else if (arg8 == 3) {
			local108 = 1;
		}
		for (local50 = 0; local50 < this.anInt1959; local50++) {
			for (@Pc(160) int local160 = 0; local160 < 64; local160++) {
				for (@Pc(164) int local164 = 0; local164 < 64; local164++) {
					if (arg5 == local50 && local160 >= local11 && local160 <= local11 + 8 && local94 <= local164 && local94 + 8 >= local164) {
						@Pc(243) int local243;
						@Pc(256) int local256;
						if (local11 + 8 == local160 || local94 + 8 == local164) {
							if (arg8 == 0) {
								local243 = arg1 + local160 - local11;
								local256 = local164 + arg2 - local94;
							} else if (arg8 == 1) {
								local256 = arg2 + local11 + 8 - local160;
								local243 = arg1 + local164 - local94;
							} else if (arg8 == 2) {
								local256 = local94 + arg2 + 8 - local164;
								local243 = local11 + arg1 + 8 - local160;
							} else {
								local243 = local94 + arg1 + 8 - local164;
								local256 = local160 + arg2 - local11;
							}
							this.method1822(local256, 0, true, local160 + local100, local20 - -local164, 0, arg4, arg7, 0, local243);
						} else {
							local243 = arg1 + Static674.method8719(arg8, local160 & 0x7, local164 & 0x7);
							local256 = arg2 + Static141.method2439(arg8, local160 & 0x7, local164 & 0x7);
							this.method1822(local256, arg8, false, local160 + local100, local164 + local20, local129, arg4, arg7, local108, local243);
						}
						if (local160 == 63 || local164 == 63) {
							@Pc(388) byte local388 = 1;
							if (local160 == 63 && local164 == 63) {
								local388 = 3;
							}
							for (@Pc(398) int local398 = 0; local398 < local388; local398++) {
								@Pc(402) int local402 = local160;
								@Pc(404) int local404 = local164;
								if (local398 == 0) {
									local402 = local160 == 63 ? 64 : local160;
									local404 = local164 == 63 ? 64 : local164;
								} else if (local398 == 1) {
									local402 = 64;
								} else if (local398 == 2) {
									local404 = 64;
								}
								@Pc(462) int local462;
								@Pc(471) int local471;
								if (arg8 == 0) {
									local462 = arg1 + local402 - local11;
									local471 = local404 + arg2 - local94;
								} else if (arg8 == 1) {
									local471 = local11 + arg2 + 8 - local402;
									local462 = arg1 + local404 - local94;
								} else if (arg8 == 2) {
									local462 = arg1 + local11 + 8 - local402;
									local471 = local94 + arg2 + 8 - local404;
								} else {
									local471 = arg2 + local402 - local11;
									local462 = arg1 + local94 + 8 - local404;
								}
								if (local462 >= 0 && local462 < this.anInt1965 && local471 >= 0 && local471 < this.anInt1967) {
									this.anIntArrayArrayArray2[arg4][local462][local471] = this.anIntArrayArrayArray2[arg4][local108 + local243][local129 + local256];
								}
							}
						}
					} else {
						this.method1822(-1, 0, false, 0, 0, 0, 0, arg7, 0, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "([[[ILclient!ha;I[Lclient!jo;)V")
	public final void method1828(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(3) Class198[] arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(18) int local18;
		if (!this.aBoolean179) {
			for (local10 = 0; local10 < 4; local10++) {
				for (local14 = 0; local14 < this.anInt1965; local14++) {
					for (local18 = 0; local18 < this.anInt1967; local18++) {
						if ((Static338.aByteArrayArrayArray13[local10][local14][local18] & 0x1) != 0) {
							@Pc(35) int local35 = local10;
							if ((Static338.aByteArrayArrayArray13[1][local14][local18] & 0x2) != 0) {
								local35 = local10 - 1;
							}
							if (local35 >= 0) {
								arg2[local35].method4531(local18, local14);
							}
						}
					}
				}
			}
		}
		for (local10 = 0; local10 < this.anInt1959; local10++) {
			local14 = 0;
			local18 = 0;
			if (!this.aBoolean179) {
				if (Static7.aBoolean12) {
					local18 = 8;
				}
				if (Static285.aBoolean412) {
					local14 = 2;
				}
				if (Static649.anInt9990 != 0) {
					local14 |= 0x1;
					if (Static471.aBoolean734 | local10 == 0) {
						local18 |= 0x10;
					}
				}
			}
			if (Static285.aBoolean412) {
				local18 |= 0x7;
			}
			if (!Static172.aBoolean260) {
				local18 |= 0x20;
			}
			@Pc(152) int[][] local152 = arg0 == null || arg0.length <= local10 ? this.anIntArrayArrayArray2[local10] : arg0[local10];
			Static598.method7972(local10, arg1.method8196(this.anInt1965, this.anInt1967, this.anIntArrayArrayArray2[local10], local152, local14, local18));
		}
	}
}
