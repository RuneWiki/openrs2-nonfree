import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public class Class73 {

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "[I")
	private final int[] anIntArray160 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "[I")
	private final int[] anIntArray159 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
	public final int anInt1875;

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "Lclient!rq;")
	private final Class306 aClass306_2;

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
	protected final int anInt1878;

	@OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
	protected final int anInt1882;

	@OriginalMember(owner = "client!sa", name = "A", descriptor = "Lclient!cka;")
	private final Class63 aClass63_3;

	@OriginalMember(owner = "client!sa", name = "r", descriptor = "Z")
	public final boolean aBoolean147;

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!sa", name = "v", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!sa", name = "t", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!sa", name = "y", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(IIIZLclient!cka;Lclient!rq;)V")
	protected Class73(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class63 arg4, @OriginalArg(5) Class306 arg5) {
		this.anInt1875 = arg0;
		this.aClass306_2 = arg5;
		this.anInt1878 = arg1;
		this.anInt1882 = arg2;
		this.aClass63_3 = arg4;
		this.aBoolean147 = arg3;
		this.aByteArrayArrayArray10 = new byte[this.anInt1875][this.anInt1878][this.anInt1882];
		this.aByteArrayArrayArray12 = new byte[this.anInt1875][this.anInt1878][this.anInt1882];
		this.aByteArrayArrayArray9 = new byte[this.anInt1875][this.anInt1878][this.anInt1882];
		this.aByteArrayArrayArray11 = new byte[this.anInt1875][this.anInt1878 + 1][this.anInt1882 + 1];
		this.anIntArrayArrayArray8 = new int[this.anInt1875][this.anInt1878 + 1][this.anInt1882 + 1];
		this.aByteArrayArrayArray13 = new byte[this.anInt1875][this.anInt1878][this.anInt1882];
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIZ)V")
	public final void method1795(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt1875; local11++) {
			this.method1802(arg1, 64, local11, arg0, 64);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "([[ILclient!s;ILclient!ha;ILclient!s;Lclient!s;)V")
	private void method1796(@OriginalArg(0) int[][] arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class13 arg3, @OriginalArg(5) Class21 arg4, @OriginalArg(6) Class21 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray9[arg2];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray12[arg2];
		@Pc(28) byte[][] local28 = this.aByteArrayArrayArray13[arg2];
		@Pc(33) byte[][] local33 = this.aByteArrayArrayArray10[arg2];
		for (@Pc(35) int local35 = 0; local35 < this.anInt1878; local35++) {
			@Pc(53) int local53 = local35 < this.anInt1878 - 1 ? local35 + 1 : local35;
			for (@Pc(55) int local55 = 0; local55 < this.anInt1882; local55++) {
				@Pc(73) int local73 = local55 >= this.anInt1882 - 1 ? local55 : local55 + 1;
				if (Static10.anInt114 == -1 || Static426.method6149(local55, local35, Static10.anInt114, arg2)) {
					@Pc(88) boolean local88 = false;
					@Pc(90) boolean local90 = false;
					@Pc(93) boolean[] local93 = new boolean[4];
					@Pc(99) int local99 = local10[local35][local55];
					@Pc(105) int local105 = local15[local35][local55];
					@Pc(113) int local113 = local33[local35][local55] & 0xFF;
					@Pc(121) int local121 = local28[local35][local55] & 0xFF;
					@Pc(129) int local129 = local28[local35][local73] & 0xFF;
					@Pc(137) int local137 = local28[local53][local73] & 0xFF;
					@Pc(145) int local145 = local28[local53][local55] & 0xFF;
					if (local113 != 0 || local121 != 0) {
						@Pc(167) Class62 local167 = local113 == 0 ? null : this.aClass63_3.method1441(local113 - 1);
						@Pc(179) Class271 local179 = local121 == 0 ? null : this.aClass306_2.method7676(local121 - 1);
						if (local99 == 0 && local167 == null) {
							local99 = 12;
						}
						@Pc(190) Class62 local190 = local167;
						if (local167 != null) {
							if (local167.anInt1415 == -1 && local167.anInt1417 == -1) {
								local190 = local167;
								local167 = null;
							} else if (local179 != null && local99 != 0) {
								local90 = local167.aBoolean103;
							}
						}
						@Pc(280) int local280;
						@Pc(323) int local323;
						@Pc(380) int local380;
						@Pc(393) int local393;
						if ((local99 == 0 || local99 == 12) && local35 > 0 && local55 > 0 && this.anInt1878 > local35 && this.anInt1882 > local55) {
							@Pc(263) int local263 = local121 == local28[local53][local55 - 1] ? 1 : -1;
							local280 = local28[local35 - 1][local55 - 1] == local121 ? 1 : -1;
							@Pc(293) int local293 = local28[local53][local73] == local121 ? 1 : -1;
							if (local28[local35][local55 - 1] == local121) {
								local280++;
								local263++;
							} else {
								local280--;
								local263--;
							}
							local323 = local121 == local28[local35 - 1][local73] ? 1 : -1;
							if (local121 == local28[local53][local55]) {
								local293++;
								local263++;
							} else {
								local263--;
								local293--;
							}
							if (local121 == local28[local35][local73]) {
								local323++;
								local293++;
							} else {
								local323--;
								local293--;
							}
							if (local121 == local28[local35 - 1][local55]) {
								local280++;
								local323++;
							} else {
								local323--;
								local280--;
							}
							local380 = local280 - local293;
							if (local380 < 0) {
								local380 = -local380;
							}
							local393 = local263 - local323;
							if (local393 < 0) {
								local393 = -local393;
							}
							if (local393 == local380) {
								local380 = arg1.method7973(local35, local55) - arg1.method7973(local53, local73);
								local393 = arg1.method7973(local53, local55) - arg1.method7973(local35, local73);
								if (local380 < 0) {
									local380 = -local380;
								}
								if (local393 < 0) {
									local393 = -local393;
								}
							}
							local105 = local393 > local380 ? 1 : 0;
						}
						for (local280 = 0; local280 < 13; local280++) {
							Static226.anIntArray379[local280] = -1;
							Static11.anIntArray18[local280] = 1;
						}
						@Pc(485) boolean[] local485 = local167 != null && local167.aBoolean103 ? Static408.aBooleanArrayArray6[local99] : Static354.aBooleanArrayArray5[local99];
						this.method1800(local105, this.anInt1882, this.anInt1878, local35, local99, local179, local10, arg3, local93, local167, local33, local55, local15);
						@Pc(518) boolean local518 = local167 != null && local167.anInt1415 != local167.anInt1417;
						if (!local518) {
							for (local323 = 0; local323 < 8; local323++) {
								if (Static226.anIntArray379[local323] >= 0 && Static552.anIntArray763[local323] != Static343.anIntArray504[local323]) {
									local518 = true;
									break;
								}
							}
						}
						if (!local485[local105 + 1 & 0x3]) {
							local93[1] = Static624.method7811(local93[1], (Static11.anIntArray18[4] & Static11.anIntArray18[2]) == 0);
						}
						if (!local485[local105 + 3 & 0x3]) {
							local93[3] = Static624.method7811(local93[3], (Static11.anIntArray18[6] & Static11.anIntArray18[0]) == 0);
						}
						if (!local485[local105 & 0x3]) {
							local93[0] = Static624.method7811(local93[0], (Static11.anIntArray18[2] & Static11.anIntArray18[0]) == 0);
						}
						if (!local485[local105 + 2 & 0x3]) {
							local93[2] = Static624.method7811(local93[2], (Static11.anIntArray18[6] & Static11.anIntArray18[4]) == 0);
						}
						if (!local90 && (local99 == 0 || local99 == 12)) {
							if (local93[0] && !local93[1] && !local93[2] && local93[3]) {
								local99 = local99 == 0 ? 13 : 14;
								local105 = 0;
								local93[0] = local93[3] = false;
							} else if (local93[0] && local93[1] && !local93[2] && !local93[3]) {
								local99 = local99 == 0 ? 13 : 14;
								local93[0] = local93[1] = false;
								local105 = 3;
							} else if (!local93[0] && local93[1] && local93[2] && !local93[3]) {
								local105 = 2;
								local93[1] = local93[2] = false;
								local99 = local99 == 0 ? 13 : 14;
							} else if (!local93[0] && !local93[1] && local93[2] && local93[3]) {
								local105 = 1;
								local99 = local99 == 0 ? 13 : 14;
								local93[2] = local93[3] = false;
							}
						}
						@Pc(833) boolean local833 = !local90 && !local93[0] && !local93[2] && !local93[1] && !local93[3];
						@Pc(835) int[] local835 = null;
						@Pc(843) int[] local843;
						@Pc(863) int[] local863;
						@Pc(859) int[] local859;
						if (local833) {
							local863 = Static288.anIntArrayArray28[local99];
							local393 = local167 == null ? 0 : Static670.anIntArray814[local99];
							local843 = Static208.anIntArrayArray21[local99];
							local859 = Static34.anIntArrayArray3[local99];
							local380 = local179 == null ? 0 : Static631.anIntArray875[local99];
						} else if (local90) {
							local843 = Static238.anIntArrayArray25[local99];
							local835 = Static47.anIntArrayArray7[local99];
							local393 = local167 == null ? 0 : Static362.anIntArray517[local99];
							local859 = Static374.anIntArrayArray36[local99];
							local863 = Static339.anIntArrayArray34[local99];
							local380 = local179 == null ? 0 : Static638.anIntArray837[local99];
						} else {
							local393 = local167 == null ? 0 : Static531.anIntArray746[local99];
							local835 = Static570.anIntArrayArray53[local99];
							local863 = Static35.anIntArrayArray4[local99];
							local843 = Static59.anIntArrayArray9[local99];
							local859 = Static211.anIntArrayArray50[local99];
							local380 = local179 == null ? 0 : Static651.anIntArray913[local99];
						}
						@Pc(937) int local937 = local393 + local380;
						if (local937 <= 0) {
							Static24.method659(arg2, local35, local55);
						} else {
							if (local93[0]) {
								local937++;
							}
							if (local93[2]) {
								local937++;
							}
							if (local93[1]) {
								local937++;
							}
							if (local93[3]) {
								local937++;
							}
							@Pc(967) int local967 = 0;
							@Pc(969) int local969 = 0;
							@Pc(973) int local973 = local937 * 3;
							@Pc(980) int[] local980 = local518 ? new int[local973] : null;
							@Pc(983) int[] local983 = new int[local973];
							@Pc(986) int[] local986 = new int[local973];
							@Pc(989) int[] local989 = new int[local973];
							@Pc(992) int[] local992 = new int[local973];
							@Pc(995) int[] local995 = new int[local973];
							@Pc(1002) int[] local1002 = arg4 == null ? null : new int[local973];
							@Pc(1011) int[] local1011 = arg4 == null && arg5 == null ? null : new int[local973];
							@Pc(1013) int local1013 = -1;
							@Pc(1015) int local1015 = -1;
							@Pc(1017) int local1017 = 256;
							@Pc(1089) byte local1089;
							@Pc(1033) int local1033;
							@Pc(1035) int local1035;
							@Pc(1267) int local1267;
							@Pc(1273) int local1273;
							@Pc(1282) int local1282;
							@Pc(1287) int local1287;
							@Pc(1302) int local1302;
							@Pc(1292) int local1292;
							@Pc(1300) int local1300;
							@Pc(1359) int local1359;
							@Pc(1365) int local1365;
							if (local167 != null) {
								local1015 = local167.anInt1409;
								local1013 = local167.anInt1415;
								local1017 = local167.anInt1406;
								local1033 = Static423.method6089(arg3, local167);
								for (local1035 = 0; local1035 < local393; local1035++) {
									if (local93[-local105 & 0x3] && local835[0] == local967) {
										Static343.anIntArray503[0] = local843[local967];
										Static343.anIntArray503[1] = 1;
										Static343.anIntArray503[2] = local859[local967];
										Static343.anIntArray503[3] = 1;
										Static343.anIntArray503[4] = local863[local967];
										Static343.anIntArray503[5] = local859[local967];
										local1089 = 6;
									} else if (local93[2 - local105 & 0x3] && local835[2] == local967) {
										Static343.anIntArray503[0] = local843[local967];
										Static343.anIntArray503[1] = 5;
										Static343.anIntArray503[2] = local859[local967];
										Static343.anIntArray503[3] = 5;
										Static343.anIntArray503[4] = local863[local967];
										Static343.anIntArray503[5] = local859[local967];
										local1089 = 6;
									} else if (local93[1 - local105 & 0x3] && local967 == local835[1]) {
										Static343.anIntArray503[0] = local843[local967];
										Static343.anIntArray503[1] = 3;
										Static343.anIntArray503[2] = local859[local967];
										Static343.anIntArray503[3] = 3;
										Static343.anIntArray503[4] = local863[local967];
										Static343.anIntArray503[5] = local859[local967];
										local1089 = 6;
									} else if (local93[3 - local105 & 0x3] && local967 == local835[3]) {
										Static343.anIntArray503[0] = local843[local967];
										Static343.anIntArray503[1] = 7;
										Static343.anIntArray503[2] = local859[local967];
										Static343.anIntArray503[3] = 7;
										Static343.anIntArray503[4] = local863[local967];
										Static343.anIntArray503[5] = local859[local967];
										local1089 = 6;
									} else {
										Static343.anIntArray503[0] = local843[local967];
										Static343.anIntArray503[1] = local863[local967];
										local1089 = 3;
										Static343.anIntArray503[2] = local859[local967];
									}
									for (local1267 = 0; local1267 < local1089; local1267++) {
										local1273 = Static343.anIntArray503[local1267];
										local1282 = local1273 - local105 * 2 & 0x7;
										local1287 = this.anIntArray159[local1273];
										local1292 = this.anIntArray160[local1273];
										if (local105 == 1) {
											local1300 = 512 - local1287;
											local1302 = local1292;
										} else if (local105 == 2) {
											local1302 = 512 - local1287;
											local1300 = 512 - local1292;
										} else if (local105 == 3) {
											local1300 = local1287;
											local1302 = 512 - local1292;
										} else {
											local1302 = local1287;
											local1300 = local1292;
										}
										local983[local969] = local1302;
										local986[local969] = local1300;
										if (local1002 != null && Static648.aBooleanArrayArray9[local99][local1273]) {
											local1359 = (local35 << 9) + local1302;
											local1365 = local1300 + (local55 << 9);
											local1002[local969] = arg4.method7980(local1365, local1359) - arg1.method7980(local1365, local1359);
										}
										if (local1011 != null) {
											if (arg4 != null && !Static648.aBooleanArrayArray9[local99][local1273]) {
												local1359 = local1302 + (local35 << 9);
												local1365 = local1300 + (local55 << 9);
												local1011[local969] = arg1.method7980(local1365, local1359) - arg4.method7980(local1365, local1359);
											} else if (arg5 != null && !Static510.aBooleanArrayArray3[local99][local1273]) {
												local1359 = (local35 << 9) + local1302;
												local1365 = local1300 + (local55 << 9);
												local1011[local969] = arg5.method7980(local1365, local1359) - arg1.method7980(local1365, local1359);
											}
										}
										if (local1273 < 8 && Static226.anIntArray379[local1282] > local167.anInt1418) {
											if (local980 != null) {
												local980[local969] = Static552.anIntArray763[local1282];
											}
											local995[local969] = Static102.anIntArray161[local1282];
											local992[local969] = Static391.anIntArray905[local1282];
											local989[local969] = Static343.anIntArray504[local1282];
										} else {
											if (local980 != null) {
												local980[local969] = local1033;
											}
											local992[local969] = local167.anInt1409;
											local995[local969] = local167.anInt1406;
											local989[local969] = local1013;
										}
										local969++;
									}
									local967++;
								}
								if (!this.aBoolean147 && arg2 == 0) {
									Static171.method3120(local35, local55, local167.anInt1416, local167.anInt1413 * 8, local167.anInt1405);
								}
								if (local99 != 12 && local167.anInt1415 != -1 && local167.aBoolean101) {
									local88 = true;
								}
							} else if (local833) {
								local967 = Static670.anIntArray814[local99];
							} else if (local90) {
								local967 = Static362.anIntArray517[local99];
							} else {
								local967 = Static531.anIntArray746[local99];
							}
							if (local179 != null) {
								if (local129 == 0) {
									local129 = local121;
								}
								if (local145 == 0) {
									local145 = local121;
								}
								if (local137 == 0) {
									local137 = local121;
								}
								@Pc(1619) Class271 local1619 = this.aClass306_2.method7676(local121 - 1);
								@Pc(1627) Class271 local1627 = this.aClass306_2.method7676(local129 - 1);
								@Pc(1635) Class271 local1635 = this.aClass306_2.method7676(local137 - 1);
								@Pc(1643) Class271 local1643 = this.aClass306_2.method7676(local145 - 1);
								for (local1282 = 0; local1282 < local380; local1282++) {
									if (local93[-local105 & 0x3] && local967 == local835[0]) {
										Static343.anIntArray503[0] = local843[local967];
										Static343.anIntArray503[1] = 1;
										Static343.anIntArray503[2] = local859[local967];
										Static343.anIntArray503[3] = 1;
										Static343.anIntArray503[4] = local863[local967];
										Static343.anIntArray503[5] = local859[local967];
										local1089 = 6;
									} else if (local93[2 - local105 & 0x3] && local835[2] == local967) {
										Static343.anIntArray503[0] = local843[local967];
										Static343.anIntArray503[1] = 5;
										Static343.anIntArray503[2] = local859[local967];
										Static343.anIntArray503[3] = 5;
										Static343.anIntArray503[4] = local863[local967];
										Static343.anIntArray503[5] = local859[local967];
										local1089 = 6;
									} else if (local93[1 - local105 & 0x3] && local967 == local835[1]) {
										Static343.anIntArray503[0] = local843[local967];
										Static343.anIntArray503[1] = 3;
										Static343.anIntArray503[2] = local859[local967];
										Static343.anIntArray503[3] = 3;
										Static343.anIntArray503[4] = local863[local967];
										Static343.anIntArray503[5] = local859[local967];
										local1089 = 6;
									} else if (local93[3 - local105 & 0x3] && local967 == local835[3]) {
										Static343.anIntArray503[0] = local843[local967];
										Static343.anIntArray503[1] = 7;
										Static343.anIntArray503[2] = local859[local967];
										Static343.anIntArray503[3] = 7;
										Static343.anIntArray503[4] = local863[local967];
										local1089 = 6;
										Static343.anIntArray503[5] = local859[local967];
									} else {
										Static343.anIntArray503[0] = local843[local967];
										Static343.anIntArray503[1] = local863[local967];
										local1089 = 3;
										Static343.anIntArray503[2] = local859[local967];
									}
									for (local1287 = 0; local1287 < local1089; local1287++) {
										local1302 = Static343.anIntArray503[local1287];
										local1292 = local1302 - local105 * 2 & 0x7;
										local1300 = this.anIntArray159[local1302];
										local1365 = this.anIntArray160[local1302];
										@Pc(1916) int local1916;
										if (local105 == 1) {
											local1916 = 512 - local1300;
											local1359 = local1365;
										} else if (local105 == 2) {
											local1916 = 512 - local1365;
											local1359 = 512 - local1300;
										} else if (local105 == 3) {
											local1359 = 512 - local1365;
											local1916 = local1300;
										} else {
											local1359 = local1300;
											local1916 = local1365;
										}
										local983[local969] = local1359;
										local986[local969] = local1916;
										@Pc(1964) int local1964;
										@Pc(1970) int local1970;
										if (local1002 != null && Static648.aBooleanArrayArray9[local99][local1302]) {
											local1964 = (local35 << 9) + local1359;
											local1970 = local1916 + (local55 << 9);
											local1002[local969] = arg4.method7980(local1970, local1964) - arg1.method7980(local1970, local1964);
										}
										if (local1011 != null) {
											if (arg4 != null && !Static648.aBooleanArrayArray9[local99][local1302]) {
												local1964 = local1359 + (local35 << 9);
												local1970 = local1916 + (local55 << 9);
												local1011[local969] = arg1.method7980(local1970, local1964) - arg4.method7980(local1970, local1964);
											} else if (arg5 != null && !Static510.aBooleanArrayArray3[local99][local1302]) {
												local1964 = (local35 << 9) + local1359;
												local1970 = (local55 << 9) + local1916;
												local1011[local969] = arg5.method7980(local1970, local1964) - arg1.method7980(local1970, local1964);
											}
										}
										if (local1302 < 8 && Static226.anIntArray379[local1292] >= 0) {
											if (local980 != null) {
												local980[local969] = Static552.anIntArray763[local1292];
											}
											local995[local969] = Static102.anIntArray161[local1292];
											local992[local969] = Static391.anIntArray905[local1292];
											local989[local969] = Static343.anIntArray504[local1292];
										} else {
											if (local90 && Static648.aBooleanArrayArray9[local99][local1302]) {
												local992[local969] = local1015;
												local995[local969] = local1017;
												local989[local969] = local1013;
											} else if (local1359 == 0 && local1916 == 0) {
												local989[local969] = arg0[local35][local55];
												local992[local969] = local1619.anInt7605;
												local995[local969] = local1619.anInt7615;
											} else if (local1359 == 0 && local1916 == 512) {
												local989[local969] = arg0[local35][local73];
												local992[local969] = local1627.anInt7605;
												local995[local969] = local1627.anInt7615;
											} else if (local1359 == 512 && local1916 == 512) {
												local989[local969] = arg0[local53][local73];
												local992[local969] = local1635.anInt7605;
												local995[local969] = local1635.anInt7615;
											} else if (local1359 == 512 && local1916 == 0) {
												local989[local969] = arg0[local53][local55];
												local992[local969] = local1643.anInt7605;
												local995[local969] = local1643.anInt7615;
											} else {
												if (local1359 < 256) {
													if (local1916 >= 256) {
														local992[local969] = local1627.anInt7605;
														local995[local969] = local1627.anInt7615;
													} else {
														local992[local969] = local1619.anInt7605;
														local995[local969] = local1619.anInt7615;
													}
												} else if (local1916 < 256) {
													local992[local969] = local1643.anInt7605;
													local995[local969] = local1643.anInt7615;
												} else {
													local992[local969] = local1635.anInt7605;
													local995[local969] = local1635.anInt7615;
												}
												local1964 = Static112.method5089(arg0[local35][local55], local1359 << 7 >> 9, arg0[local53][local55]);
												local1970 = Static112.method5089(arg0[local35][local73], local1359 << 7 >> 9, arg0[local53][local73]);
												local989[local969] = Static112.method5089(local1964, local1916 << 7 >> 9, local1970);
											}
											if (local980 != null) {
												local980[local969] = local989[local969];
											}
										}
										local969++;
									}
									local967++;
								}
								if (local99 != 0 && local179.aBoolean565) {
									local88 = true;
								}
							}
							local1033 = arg1.method7973(local35, local55);
							local1035 = arg1.method7973(local53, local55);
							local1267 = arg1.method7973(local53, local73);
							local1273 = arg1.method7973(local35, local73);
							@Pc(2396) boolean local2396 = Static488.method7052(local35, local55);
							if (local2396 && arg2 > 1 || !local2396 && arg2 > 0) {
								@Pc(2410) boolean local2410 = true;
								if (local179 != null && !local179.aBoolean566) {
									local2410 = false;
								} else if (local121 == 0 && local99 != 0) {
									local2410 = false;
								} else if (local113 > 0 && local190 != null && !local190.aBoolean100) {
									local2410 = false;
								}
								if (local2410 && local1035 == local1033 && local1033 == local1267 && local1033 == local1273) {
									this.aByteArrayArrayArray11[arg2][local35][local55] = (byte) (this.aByteArrayArrayArray11[arg2][local35][local55] | 0x4);
								}
							}
							local1287 = 0;
							local1302 = 0;
							local1292 = 0;
							if (this.aBoolean147) {
								local1287 = Static436.method6232(local35, local55);
								local1302 = Static179.method3209(local35, local55);
								local1292 = Static260.method4008(local35, local55);
							}
							arg1.U(local35, local55, local983, local1002, local986, local1011, local989, local980, local992, local995, local1287, local1302, local1292, local88);
							Static24.method659(arg2, local35, local55);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!s;Lclient!s;ILclient!ha;)V")
	public final void method1798(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(3) Class13 arg2) {
		if (Static190.anIntArray337 == null || Static190.anIntArray337.length != this.anInt1882) {
			Static511.anIntArray690 = new int[this.anInt1882];
			Static555.anIntArray766 = new int[this.anInt1882];
			Static664.anIntArray938 = new int[this.anInt1882];
			Static190.anIntArray337 = new int[this.anInt1882];
			Static654.anIntArray928 = new int[this.anInt1882];
		}
		@Pc(38) int[][] local38 = new int[this.anInt1878][this.anInt1882];
		@Pc(50) int local50;
		for (@Pc(46) int local46 = 0; local46 < this.anInt1875; local46++) {
			for (local50 = 0; local50 < this.anInt1882; local50++) {
				Static190.anIntArray337[local50] = 0;
				Static664.anIntArray938[local50] = 0;
				Static511.anIntArray690[local50] = 0;
				Static555.anIntArray766[local50] = 0;
				Static654.anIntArray928[local50] = 0;
			}
			for (@Pc(79) int local79 = -5; local79 < this.anInt1878; local79++) {
				@Pc(89) int local89;
				@Pc(108) int local108;
				@Pc(177) int local177;
				for (@Pc(83) int local83 = 0; local83 < this.anInt1882; local83++) {
					local89 = local79 + 5;
					@Pc(157) int local157;
					if (local89 < this.anInt1878) {
						local108 = this.aByteArrayArrayArray13[local46][local89][local83] & 0xFF;
						if (local108 > 0) {
							@Pc(121) Class271 local121 = this.aClass306_2.method7676(local108 - 1);
							Static190.anIntArray337[local83] += local121.anInt7606;
							Static664.anIntArray938[local83] += local121.anInt7613;
							Static511.anIntArray690[local83] += local121.anInt7603;
							Static555.anIntArray766[local83] += local121.anInt7610;
							local157 = Static654.anIntArray928[local83]++;
						}
					}
					local108 = local79 - 5;
					if (local108 >= 0) {
						local177 = this.aByteArrayArrayArray13[local46][local108][local83] & 0xFF;
						if (local177 > 0) {
							@Pc(187) Class271 local187 = this.aClass306_2.method7676(local177 - 1);
							Static190.anIntArray337[local83] -= local187.anInt7606;
							Static664.anIntArray938[local83] -= local187.anInt7613;
							Static511.anIntArray690[local83] -= local187.anInt7603;
							Static555.anIntArray766[local83] -= local187.anInt7610;
							local157 = Static654.anIntArray928[local83]--;
						}
					}
				}
				if (local79 >= 0) {
					local89 = 0;
					local108 = 0;
					local177 = 0;
					@Pc(248) int local248 = 0;
					@Pc(250) int local250 = 0;
					for (@Pc(252) int local252 = -5; local252 < this.anInt1882; local252++) {
						@Pc(258) int local258 = local252 + 5;
						if (local258 < this.anInt1882) {
							local89 += Static190.anIntArray337[local258];
							local177 += Static511.anIntArray690[local258];
							local108 += Static664.anIntArray938[local258];
							local250 += Static654.anIntArray928[local258];
							local248 += Static555.anIntArray766[local258];
						}
						@Pc(300) int local300 = local252 - 5;
						if (local300 >= 0) {
							local108 -= Static664.anIntArray938[local300];
							local250 -= Static654.anIntArray928[local300];
							local177 -= Static511.anIntArray690[local300];
							local89 -= Static190.anIntArray337[local300];
							local248 -= Static555.anIntArray766[local300];
						}
						if (local252 >= 0 && local248 > 0 && local250 > 0) {
							local38[local79][local252] = Static405.method5733(local177 / local250, local89 * 256 / local248, local108 / local250);
						}
					}
				}
			}
			if (Static653.aBoolean781) {
				this.method1796(local38, Static121.aClass21Array2[local46], local46, arg2, local46 == 0 ? arg1 : null, local46 == 0 ? arg0 : null);
			} else {
				this.method1803(local46 == 0 ? arg1 : null, local38, local46 == 0 ? arg0 : null, arg2, Static121.aClass21Array2[local46], local46);
			}
			this.aByteArrayArrayArray13[local46] = null;
			this.aByteArrayArrayArray10[local46] = null;
			this.aByteArrayArrayArray9[local46] = null;
			this.aByteArrayArrayArray12[local46] = null;
		}
		if (!this.aBoolean147) {
			if (Static45.anInt1064 != 0) {
				Static130.method2441();
			}
			if (Static540.aBoolean695) {
				Static595.method8369();
			}
		}
		for (local50 = 0; local50 < this.anInt1875; local50++) {
			Static121.aClass21Array2[local50].YA();
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "([Lclient!oga;[[[IILclient!ha;)V")
	public final void method1799(@OriginalArg(0) Class252[] arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(3) Class13 arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(18) int local18;
		if (!this.aBoolean147) {
			for (local10 = 0; local10 < 4; local10++) {
				for (local14 = 0; local14 < this.anInt1878; local14++) {
					for (local18 = 0; local18 < this.anInt1882; local18++) {
						if ((Static90.aByteArrayArrayArray25[local10][local14][local18] & 0x1) != 0) {
							@Pc(35) int local35 = local10;
							if ((Static90.aByteArrayArrayArray25[1][local14][local18] & 0x2) != 0) {
								local35 = local10 - 1;
							}
							if (local35 >= 0) {
								arg0[local35].method6161(local18, local14);
							}
						}
					}
				}
			}
		}
		for (local10 = 0; local10 < this.anInt1875; local10++) {
			local14 = 0;
			local18 = 0;
			if (!this.aBoolean147) {
				if (Static76.aBoolean102) {
					local18 = 8;
				}
				if (Static540.aBoolean695) {
					local14 = 2;
				}
				if (Static45.anInt1064 != 0) {
					if (Static425.aBoolean485 | local10 == 0) {
						local18 |= 0x10;
					}
					local14 |= 0x1;
				}
			}
			if (Static540.aBoolean695) {
				local18 |= 0x7;
			}
			if (!Static507.aBoolean593) {
				local18 |= 0x20;
			}
			@Pc(167) int[][] local167 = arg1 == null || arg1.length <= local10 ? this.anIntArrayArrayArray8[local10] : arg1[local10];
			Static395.method5578(local10, arg2.method8517(this.anInt1878, this.anInt1882, this.anIntArrayArrayArray8[local10], local167, local14, local18));
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIILclient!pja;[[BLclient!ha;I[ZLclient!ck;[[BI[[B)V")
	private void method1800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class271 arg5, @OriginalArg(6) byte[][] arg6, @OriginalArg(7) Class13 arg7, @OriginalArg(9) boolean[] arg8, @OriginalArg(10) Class62 arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) byte[][] arg12) {
		@Pc(18) boolean[] local18 = arg9 != null && arg9.aBoolean103 ? Static408.aBooleanArrayArray6[arg4] : Static354.aBooleanArrayArray5[arg4];
		@Pc(40) int local40;
		@Pc(50) Class62 local50;
		@Pc(67) byte local67;
		@Pc(84) int local84;
		@Pc(89) int local89;
		if (arg11 > 0) {
			if (arg3 > 0) {
				local40 = arg10[arg3 - 1][arg11 - 1] & 0xFF;
				if (local40 > 0) {
					local50 = this.aClass63_3.method1441(local40 - 1);
					if (local50.anInt1415 != -1 && local50.aBoolean103) {
						local67 = arg6[arg3 - 1][arg11 - 1];
						local84 = arg12[arg3 - 1][arg11 - 1] * 2 + 4 & 0x7;
						local89 = Static423.method6089(arg7, local50);
						if (Static648.aBooleanArrayArray9[local67][local84]) {
							Static343.anIntArray504[0] = local50.anInt1415;
							Static552.anIntArray763[0] = local89;
							Static391.anIntArray905[0] = local50.anInt1409;
							Static102.anIntArray161[0] = local50.anInt1406;
							Static226.anIntArray379[0] = local50.anInt1418;
							Static11.anIntArray18[0] = 256;
						}
					}
				}
			}
			if (arg3 < arg2 - 1) {
				local40 = arg10[arg3 + 1][arg11 - 1] & 0xFF;
				if (local40 > 0) {
					local50 = this.aClass63_3.method1441(local40 - 1);
					if (local50.anInt1415 != -1 && local50.aBoolean103) {
						local67 = arg6[arg3 + 1][arg11 - 1];
						local84 = arg12[arg3 + 1][arg11 - 1] * 2 + 6 & 0x7;
						local89 = Static423.method6089(arg7, local50);
						if (Static648.aBooleanArrayArray9[local67][local84]) {
							Static343.anIntArray504[2] = local50.anInt1415;
							Static552.anIntArray763[2] = local89;
							Static391.anIntArray905[2] = local50.anInt1409;
							Static102.anIntArray161[2] = local50.anInt1406;
							Static226.anIntArray379[2] = local50.anInt1418;
							Static11.anIntArray18[2] = 512;
						}
					}
				}
			}
		}
		if (arg1 - 1 > arg11) {
			if (arg3 > 0) {
				local40 = arg10[arg3 - 1][arg11 + 1] & 0xFF;
				if (local40 > 0) {
					local50 = this.aClass63_3.method1441(local40 - 1);
					if (local50.anInt1415 != -1 && local50.aBoolean103) {
						local67 = arg6[arg3 - 1][arg11 + 1];
						local84 = arg12[arg3 - 1][arg11 + 1] * 2 + 2 & 0x7;
						local89 = Static423.method6089(arg7, local50);
						if (Static648.aBooleanArrayArray9[local67][local84]) {
							Static343.anIntArray504[6] = local50.anInt1415;
							Static552.anIntArray763[6] = local89;
							Static391.anIntArray905[6] = local50.anInt1409;
							Static102.anIntArray161[6] = local50.anInt1406;
							Static226.anIntArray379[6] = local50.anInt1418;
							Static11.anIntArray18[6] = 64;
						}
					}
				}
			}
			if (arg2 - 1 > arg3) {
				local40 = arg10[arg3 + 1][arg11 + 1] & 0xFF;
				if (local40 > 0) {
					local50 = this.aClass63_3.method1441(local40 - 1);
					if (local50.anInt1415 != -1 && local50.aBoolean103) {
						local67 = arg6[arg3 + 1][arg11 + 1];
						local84 = arg12[arg3 + 1][arg11 + 1] * 2 & 0x7;
						local89 = Static423.method6089(arg7, local50);
						if (Static648.aBooleanArrayArray9[local67][local84]) {
							Static343.anIntArray504[4] = local50.anInt1415;
							Static552.anIntArray763[4] = local89;
							Static391.anIntArray905[4] = local50.anInt1409;
							Static102.anIntArray161[4] = local50.anInt1406;
							Static226.anIntArray379[4] = local50.anInt1418;
							Static11.anIntArray18[4] = 128;
						}
					}
				}
			}
		}
		@Pc(491) int local491;
		@Pc(497) int local497;
		@Pc(502) int local502;
		@Pc(504) int local504;
		@Pc(456) int local456;
		@Pc(466) Class62 local466;
		@Pc(478) byte local478;
		@Pc(486) byte local486;
		if (arg11 > 0) {
			local456 = arg10[arg3][arg11 - 1] & 0xFF;
			if (local456 > 0) {
				local466 = this.aClass63_3.method1441(local456 - 1);
				if (local466.anInt1415 != -1) {
					local478 = arg6[arg3][arg11 - 1];
					local486 = arg12[arg3][arg11 - 1];
					if (local466.aBoolean103) {
						local491 = 2;
						local497 = local486 * 2 + 4;
						local502 = Static423.method6089(arg7, local466);
						for (local504 = 0; local504 < 3; local504++) {
							local491 &= 0x7;
							local497 &= 0x7;
							if (Static648.aBooleanArrayArray9[local478][local497] && local466.anInt1418 >= Static226.anIntArray379[local491]) {
								Static343.anIntArray504[local491] = local466.anInt1415;
								Static552.anIntArray763[local491] = local502;
								Static391.anIntArray905[local491] = local466.anInt1409;
								Static102.anIntArray161[local491] = local466.anInt1406;
								if (Static226.anIntArray379[local491] == local466.anInt1418) {
									Static11.anIntArray18[local491] |= 0x20;
								} else {
									Static11.anIntArray18[local491] = 32;
								}
								Static226.anIntArray379[local491] = local466.anInt1418;
							}
							local491--;
							local497++;
						}
						if (!local18[--arg0 & 0x3]) {
							arg8[0] = Static408.aBooleanArrayArray6[local478][local486 + 2 & 0x3];
						}
					} else if (!local18[arg0 & 0x3]) {
						arg8[0] = Static354.aBooleanArrayArray5[local478][local486 + 2 & 0x3];
					}
				}
			}
		}
		if (arg1 - 1 > arg11) {
			local456 = arg10[arg3][arg11 + 1] & 0xFF;
			if (local456 > 0) {
				local466 = this.aClass63_3.method1441(local456 - 1);
				if (local466.anInt1415 != -1) {
					local478 = arg6[arg3][arg11 + 1];
					local486 = arg12[arg3][arg11 + 1];
					if (local466.aBoolean103) {
						local491 = 4;
						local497 = local486 * 2 + 2;
						local502 = Static423.method6089(arg7, local466);
						for (local504 = 0; local504 < 3; local504++) {
							local497 &= 0x7;
							local491 &= 0x7;
							if (Static648.aBooleanArrayArray9[local478][local497] && local466.anInt1418 >= Static226.anIntArray379[local491]) {
								Static343.anIntArray504[local491] = local466.anInt1415;
								Static552.anIntArray763[local491] = local502;
								Static391.anIntArray905[local491] = local466.anInt1409;
								Static102.anIntArray161[local491] = local466.anInt1406;
								if (local466.anInt1418 == Static226.anIntArray379[local491]) {
									Static11.anIntArray18[local491] |= 0x10;
								} else {
									Static11.anIntArray18[local491] = 16;
								}
								Static226.anIntArray379[local491] = local466.anInt1418;
							}
							local491++;
							local497--;
						}
						if (!local18[arg0 + 2 & 0x3]) {
							arg8[2] = Static408.aBooleanArrayArray6[local478][local486 & 0x3];
						}
					} else if (!local18[arg0 + 2 & 0x3]) {
						arg8[2] = Static354.aBooleanArrayArray5[local478][local486 & 0x3];
					}
				}
			}
		}
		if (arg3 > 0) {
			local456 = arg10[arg3 - 1][arg11] & 0xFF;
			if (local456 > 0) {
				local466 = this.aClass63_3.method1441(local456 - 1);
				if (local466.anInt1415 != -1) {
					local478 = arg6[arg3 - 1][arg11];
					local486 = arg12[arg3 - 1][arg11];
					if (local466.aBoolean103) {
						local491 = 6;
						local497 = local486 * 2 + 4;
						local502 = Static423.method6089(arg7, local466);
						for (local504 = 0; local504 < 3; local504++) {
							local491 &= 0x7;
							local497 &= 0x7;
							if (Static648.aBooleanArrayArray9[local478][local497] && Static226.anIntArray379[local491] <= local466.anInt1418) {
								Static343.anIntArray504[local491] = local466.anInt1415;
								Static552.anIntArray763[local491] = local502;
								Static391.anIntArray905[local491] = local466.anInt1409;
								Static102.anIntArray161[local491] = local466.anInt1406;
								if (Static226.anIntArray379[local491] == local466.anInt1418) {
									Static11.anIntArray18[local491] |= 0x8;
								} else {
									Static11.anIntArray18[local491] = 8;
								}
								Static226.anIntArray379[local491] = local466.anInt1418;
							}
							local491++;
							local497--;
						}
						if (!local18[arg0 + 3 & 0x3]) {
							arg8[3] = Static408.aBooleanArrayArray6[local478][local486 + 1 & 0x3];
						}
					} else if (!local18[arg0 + 3 & 0x3]) {
						arg8[3] = Static354.aBooleanArrayArray5[local478][local486 + 1 & 0x3];
					}
				}
			}
		}
		if (arg3 < arg2 - 1) {
			local456 = arg10[arg3 + 1][arg11] & 0xFF;
			if (local456 > 0) {
				local466 = this.aClass63_3.method1441(local456 - 1);
				if (local466.anInt1415 != -1) {
					local478 = arg6[arg3 + 1][arg11];
					local486 = arg12[arg3 + 1][arg11];
					if (local466.aBoolean103) {
						local491 = 4;
						local497 = local486 * 2 + 6;
						local502 = Static423.method6089(arg7, local466);
						for (local504 = 0; local504 < 3; local504++) {
							local491 &= 0x7;
							local497 &= 0x7;
							if (Static648.aBooleanArrayArray9[local478][local497] && local466.anInt1418 >= Static226.anIntArray379[local491]) {
								Static343.anIntArray504[local491] = local466.anInt1415;
								Static552.anIntArray763[local491] = local502;
								Static391.anIntArray905[local491] = local466.anInt1409;
								Static102.anIntArray161[local491] = local466.anInt1406;
								if (local466.anInt1418 == Static226.anIntArray379[local491]) {
									Static11.anIntArray18[local491] |= 0x4;
								} else {
									Static11.anIntArray18[local491] = 4;
								}
								Static226.anIntArray379[local491] = local466.anInt1418;
							}
							local491--;
							local497++;
						}
						if (!local18[arg0 + 1 & 0x3]) {
							arg8[1] = Static408.aBooleanArrayArray6[local478][local486 + 3 & 0x3];
						}
					} else if (!local18[arg0 + 1 & 0x3]) {
						arg8[1] = Static354.aBooleanArrayArray5[local478][local486 + 3 & 0x3];
					}
				}
			}
		}
		if (arg9 == null) {
			return;
		}
		local456 = Static423.method6089(arg7, arg9);
		if (!arg9.aBoolean103) {
			return;
		}
		for (@Pc(1202) int local1202 = 0; local1202 < 8; local1202++) {
			local84 = local1202 - arg0 * 2 & 0x7;
			if (Static648.aBooleanArrayArray9[arg4][local1202] && Static226.anIntArray379[local84] <= arg9.anInt1418) {
				Static343.anIntArray504[local84] = arg9.anInt1415;
				Static552.anIntArray763[local84] = local456;
				Static391.anIntArray905[local84] = arg9.anInt1409;
				Static102.anIntArray161[local84] = arg9.anInt1406;
				if (arg9.anInt1418 == Static226.anIntArray379[local84]) {
					Static11.anIntArray18[local84] |= 0x2;
				} else {
					Static11.anIntArray18[local84] = 2;
				}
				Static226.anIntArray379[local84] = arg9.anInt1418;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!jp;[Lclient!oga;IIZII)V")
	public final void method1801(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) Class252[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(25) int local25;
		if (!this.aBoolean147) {
			for (local6 = 0; local6 < 4; local6++) {
				@Pc(12) Class252 local12 = arg1[local6];
				for (local14 = 0; local14 < 64; local14++) {
					for (local18 = 0; local18 < 64; local18++) {
						local25 = arg2 + local14;
						@Pc(29) int local29 = arg5 + local18;
						if (local25 >= 0 && local25 < this.anInt1878 && local29 >= 0 && local29 < this.anInt1882) {
							local12.method6173(local29, local25);
						}
					}
				}
			}
		}
		local6 = arg3 + arg2;
		@Pc(76) int local76 = arg4 + arg5;
		for (local14 = 0; local14 < this.anInt1875; local14++) {
			for (local18 = 0; local18 < 64; local18++) {
				for (local25 = 0; local25 < 64; local25++) {
					this.method1807(local14, 0, 0, 0, false, local18 + local6, arg5 + local25, local76 + local25, arg2 + local18, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIB)V")
	public final void method1802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(22) int local22;
		for (@Pc(7) int local7 = arg0; local7 < arg0 + arg1; local7++) {
			for (local22 = arg3; local22 < arg3 + arg4; local22++) {
				if (local22 >= 0 && local22 < this.anInt1878 && local7 >= 0 && local7 < this.anInt1882) {
					this.anIntArrayArrayArray8[arg2][local22][local7] = arg2 <= 0 ? 0 : this.anIntArrayArrayArray8[arg2 - 1][local22][local7] - 960;
				}
			}
		}
		if (arg3 > 0 && this.anInt1878 > arg3) {
			for (local22 = arg0 + 1; local22 < arg1 + arg0; local22++) {
				if (local22 >= 0 && this.anInt1882 > local22) {
					this.anIntArrayArrayArray8[arg2][arg3][local22] = this.anIntArrayArrayArray8[arg2][arg3 - 1][local22];
				}
			}
		}
		if (arg0 > 0 && arg0 < this.anInt1882) {
			for (local22 = arg3 + 1; local22 < arg3 + arg4; local22++) {
				if (local22 >= 0 && local22 < this.anInt1878) {
					this.anIntArrayArrayArray8[arg2][local22][arg0] = this.anIntArrayArrayArray8[arg2][local22][arg0 - 1];
				}
			}
		}
		if (arg3 < 0 || arg0 < 0 || this.anInt1878 <= arg3 || this.anInt1882 <= arg0) {
			return;
		}
		if (arg2 == 0) {
			if (arg3 > 0 && this.anIntArrayArrayArray8[arg2][arg3 - 1][arg0] != 0) {
				this.anIntArrayArrayArray8[arg2][arg3][arg0] = this.anIntArrayArrayArray8[arg2][arg3 - 1][arg0];
				return;
			}
			if (arg0 > 0 && this.anIntArrayArrayArray8[arg2][arg3][arg0 - 1] != 0) {
				this.anIntArrayArrayArray8[arg2][arg3][arg0] = this.anIntArrayArrayArray8[arg2][arg3][arg0 - 1];
				return;
			}
			if (arg3 > 0 && arg0 > 0 && this.anIntArrayArrayArray8[arg2][arg3 - 1][arg0 - 1] != 0) {
				this.anIntArrayArrayArray8[arg2][arg3][arg0] = this.anIntArrayArrayArray8[arg2][arg3 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg3 > 0 && this.anIntArrayArrayArray8[arg2][arg3 - 1][arg0] != this.anIntArrayArrayArray8[arg2 - 1][arg3 - 1][arg0]) {
			this.anIntArrayArrayArray8[arg2][arg3][arg0] = this.anIntArrayArrayArray8[arg2][arg3 - 1][arg0];
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray8[arg2 - 1][arg3][arg0 - 1] != this.anIntArrayArrayArray8[arg2][arg3][arg0 - 1]) {
			this.anIntArrayArrayArray8[arg2][arg3][arg0] = this.anIntArrayArrayArray8[arg2][arg3][arg0 - 1];
			return;
		}
		if (arg3 > 0 && arg0 > 0 && this.anIntArrayArrayArray8[arg2 - 1][arg3 - 1][arg0 - 1] != this.anIntArrayArrayArray8[arg2][arg3 - 1][arg0 - 1]) {
			this.anIntArrayArrayArray8[arg2][arg3][arg0] = this.anIntArrayArrayArray8[arg2][arg3 - 1][arg0 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!s;[[ILclient!s;Lclient!ha;ILclient!s;I)V")
	private void method1803(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) Class21 arg2, @OriginalArg(3) Class13 arg3, @OriginalArg(5) Class21 arg4, @OriginalArg(6) int arg5) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1878; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt1882; local7++) {
				if (Static10.anInt114 == -1 || Static426.method6149(local7, local3, Static10.anInt114, arg5)) {
					@Pc(30) byte local30 = this.aByteArrayArrayArray9[arg5][local3][local7];
					@Pc(39) byte local39 = this.aByteArrayArrayArray12[arg5][local3][local7];
					@Pc(50) int local50 = this.aByteArrayArrayArray10[arg5][local3][local7] & 0xFF;
					@Pc(61) int local61 = this.aByteArrayArrayArray13[arg5][local3][local7] & 0xFF;
					@Pc(76) Class62 local76 = local50 == 0 ? null : this.aClass63_3.method1441(local50 - 1);
					@Pc(91) Class271 local91 = local61 == 0 ? null : this.aClass306_2.method7676(local61 - 1);
					if (local30 == 0 && local76 == null) {
						local30 = 12;
					}
					@Pc(99) Class62 local99 = local76;
					if (local76 != null && local76.anInt1415 == -1 && local76.anInt1417 == -1) {
						local99 = local76;
						local76 = null;
					}
					if (local76 != null || local91 != null) {
						@Pc(121) int local121 = Static631.anIntArray875[local30];
						@Pc(125) int local125 = Static670.anIntArray814[local30];
						@Pc(137) int local137 = (local91 == null ? 0 : local121) + (local76 == null ? 0 : local125);
						@Pc(139) int local139 = 0;
						@Pc(141) int local141 = 0;
						@Pc(148) int local148 = local76 == null ? -1 : local76.anInt1409;
						@Pc(155) int local155 = local91 == null ? -1 : local91.anInt7605;
						@Pc(158) int[] local158 = new int[local137];
						@Pc(161) int[] local161 = new int[local137];
						@Pc(164) int[] local164 = new int[local137];
						@Pc(167) int[] local167 = new int[local137];
						@Pc(170) int[] local170 = new int[local137];
						@Pc(173) int[] local173 = new int[local137];
						@Pc(184) int[] local184 = local76 == null || local76.anInt1417 == -1 ? null : new int[local137];
						@Pc(188) int local188;
						if (local76 == null) {
							local141 = local125;
						} else {
							for (local188 = 0; local188 < local125; local188++) {
								local158[local139] = Static208.anIntArrayArray21[local30][local141];
								local161[local139] = Static288.anIntArrayArray28[local30][local141];
								local164[local139] = Static34.anIntArrayArray3[local30][local141];
								local170[local139] = local148;
								local173[local139] = local76.anInt1406;
								local167[local139] = local76.anInt1415;
								if (local184 != null) {
									local184[local139] = local76.anInt1417;
								}
								local141++;
								local139++;
							}
							if (!this.aBoolean147 && arg5 == 0) {
								Static171.method3120(local3, local7, local76.anInt1416, local76.anInt1413 * 8, local76.anInt1405);
							}
						}
						if (local91 != null) {
							for (local188 = 0; local188 < local121; local188++) {
								local158[local139] = Static208.anIntArrayArray21[local30][local141];
								local161[local139] = Static288.anIntArrayArray28[local30][local141];
								local164[local139] = Static34.anIntArrayArray3[local30][local141];
								local170[local139] = local155;
								local173[local139] = local91.anInt7615;
								local167[local139] = arg1[local3][local7];
								if (local184 != null) {
									local184[local139] = local167[local139];
								}
								local139++;
								local141++;
							}
						}
						local188 = this.anIntArray159.length;
						@Pc(339) int[] local339 = new int[local188];
						@Pc(342) int[] local342 = new int[local188];
						@Pc(349) int[] local349 = arg0 == null ? null : new int[local188];
						@Pc(358) int[] local358 = arg0 == null && arg2 == null ? null : new int[local188];
						@Pc(367) int local367;
						@Pc(372) int local372;
						@Pc(458) int local458;
						@Pc(466) int local466;
						for (@Pc(360) int local360 = 0; local360 < local188; local360++) {
							local367 = this.anIntArray159[local360];
							local372 = this.anIntArray160[local360];
							if (local39 == 0) {
								local339[local360] = local367;
								local342[local360] = local372;
							} else if (local39 == 1) {
								local339[local360] = local372;
								local342[local360] = 512 - local367;
							} else if (local39 == 2) {
								local339[local360] = 512 - local367;
								local342[local360] = 512 - local372;
							} else if (local39 == 3) {
								local339[local360] = 512 - local372;
								local342[local360] = local367;
							}
							if (local349 != null && Static648.aBooleanArrayArray9[local30][local360]) {
								local458 = (local3 << 9) + local339[local360];
								local466 = (local7 << 9) + local342[local360];
								local349[local360] = arg0.method7980(local466, local458) - arg4.method7980(local466, local458);
							}
							if (local358 != null) {
								if (arg0 != null && !Static648.aBooleanArrayArray9[local30][local360]) {
									local458 = local339[local360] + (local3 << 9);
									local466 = local342[local360] + (local7 << 9);
									local358[local360] = arg4.method7980(local466, local458) - arg0.method7980(local466, local458);
								} else if (arg2 != null && !Static510.aBooleanArrayArray3[local30][local360]) {
									local458 = (local3 << 9) + local339[local360];
									local466 = local342[local360] + (local7 << 9);
									local358[local360] = arg2.method7980(local466, local458) - arg4.method7980(local466, local458);
								}
							}
						}
						local367 = arg4.method7973(local3, local7);
						local372 = arg4.method7973(local3 + 1, local7);
						local458 = arg4.method7973(local3 + 1, local7 + 1);
						local466 = arg4.method7973(local3, local7 + 1);
						@Pc(607) boolean local607 = Static488.method7052(local3, local7);
						if (local607 && arg5 > 1 || !local607 && arg5 > 0) {
							@Pc(618) boolean local618 = true;
							if (local91 != null && !local91.aBoolean566) {
								local618 = false;
							} else if (local61 == 0 && local30 != 0) {
								local618 = false;
							} else if (local50 > 0 && local99 != null && !local99.aBoolean100) {
								local618 = false;
							}
							if (local618 && local367 == local372 && local367 == local458 && local367 == local466) {
								this.aByteArrayArrayArray11[arg5][local3][local7] = (byte) (this.aByteArrayArrayArray11[arg5][local3][local7] | 0x4);
							}
						}
						@Pc(683) int local683 = 0;
						@Pc(685) int local685 = 0;
						@Pc(687) int local687 = 0;
						if (this.aBoolean147) {
							local683 = Static436.method6232(local3, local7);
							local685 = Static179.method3209(local3, local7);
							local687 = Static260.method4008(local3, local7);
						}
						arg4.method7977(local3, local7, local339, local349, local342, local358, local158, local161, local164, local167, local184, local170, local173, local683, local685, local687);
						Static24.method659(arg5, local3, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I[[II)V")
	public final void method1804(@OriginalArg(1) int[][] arg0) {
		@Pc(18) int[][] local18 = this.anIntArrayArrayArray8[0];
		for (@Pc(20) int local20 = 0; local20 < this.anInt1878 + 1; local20++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt1882 + 1; local24++) {
				local18[local20][local24] += arg0[local20][local24];
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III[Lclient!oga;IIILclient!jp;II)V")
	public final void method1806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class252[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class3_Sub25 arg7, @OriginalArg(8) int arg8) {
		@Pc(11) int local11 = (arg6 & 0x7) * 8;
		@Pc(17) int local17 = (arg8 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(59) int local59;
		if (!this.aBoolean147) {
			@Pc(24) Class252 local24 = arg3[arg5];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(46) int local46 = Static5.method132(local30 & 0x7, local26 & 0x7, arg0) + arg1;
					local59 = arg2 + Static595.method8368(arg0, local30 & 0x7, local26 & 0x7);
					if (local46 > 0 && this.anInt1878 - 1 > local46 && local59 > 0 && local59 < this.anInt1882 - 1) {
						local24.method6173(local59, local46);
					}
				}
			}
		}
		@Pc(101) int local101 = (arg6 & 0x1FFFFFF8) << 3;
		local26 = (arg8 & 0xFFFFFFF8) << 3;
		@Pc(109) byte local109 = 0;
		@Pc(111) byte local111 = 0;
		if (arg0 == 1) {
			local111 = 1;
		} else if (arg0 == 2) {
			local111 = 1;
			local109 = 1;
		} else if (arg0 == 3) {
			local109 = 1;
		}
		for (local59 = 0; local59 < this.anInt1875; local59++) {
			for (@Pc(144) int local144 = 0; local144 < 64; local144++) {
				for (@Pc(148) int local148 = 0; local148 < 64; local148++) {
					if (local59 == arg4 && local144 >= local11 && local144 <= local11 + 8 && local17 <= local148 && local17 + 8 >= local148) {
						@Pc(230) int local230;
						@Pc(242) int local242;
						if (local11 + 8 == local144 || local148 == local17 + 8) {
							if (arg0 == 0) {
								local242 = local148 + arg2 - local17;
								local230 = local144 + arg1 - local11;
							} else if (arg0 == 1) {
								local242 = arg2 + local11 + 8 - local144;
								local230 = arg1 + local148 - local17;
							} else if (arg0 == 2) {
								local242 = arg2 + local17 + 8 - local148;
								local230 = arg1 + local11 + 8 - local144;
							} else {
								local242 = local144 + arg2 - local11;
								local230 = local17 + arg1 + 8 - local148;
							}
							this.method1807(arg5, 0, 0, 0, true, local144 + local101, local242, local148 + local26, local230, arg7);
						} else {
							local230 = Static5.method132(local148 & 0x7, local144 & 0x7, arg0) + arg1;
							local242 = arg2 + Static595.method8368(arg0, local148 & 0x7, local144 & 0x7);
							this.method1807(arg5, local111, arg0, local109, false, local144 + local101, local242, local26 + local148, local230, arg7);
						}
						if (local144 == 63 || local148 == 63) {
							@Pc(370) byte local370 = 1;
							if (local144 == 63 && local148 == 63) {
								local370 = 3;
							}
							for (@Pc(380) int local380 = 0; local380 < local370; local380++) {
								@Pc(384) int local384 = local144;
								@Pc(386) int local386 = local148;
								if (local380 == 0) {
									local386 = local148 == 63 ? 64 : local148;
									local384 = local144 == 63 ? 64 : local144;
								} else if (local380 == 1) {
									local384 = 64;
								} else if (local380 == 2) {
									local386 = 64;
								}
								@Pc(437) int local437;
								@Pc(444) int local444;
								if (arg0 == 0) {
									local437 = local384 + arg1 - local11;
									local444 = local386 + arg2 - local17;
								} else if (arg0 == 1) {
									local437 = local386 + arg1 - local17;
									local444 = local11 + arg2 + 8 - local384;
								} else if (arg0 == 2) {
									local444 = local17 + arg2 + 8 - local386;
									local437 = local11 + arg1 + 8 - local384;
								} else {
									local437 = arg1 + local17 + 8 - local386;
									local444 = local384 + arg2 - local11;
								}
								if (local437 >= 0 && this.anInt1878 > local437 && local444 >= 0 && this.anInt1882 > local444) {
									this.anIntArrayArrayArray8[arg5][local437][local444] = this.anIntArrayArrayArray8[arg5][local109 + local230][local242 + local111];
								}
							}
						}
					} else {
						this.method1807(0, 0, 0, 0, false, 0, -1, 0, -1, arg7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIBIIZIIIILclient!jp;)V")
	private void method1807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class3_Sub25 arg9) {
		if (arg2 == 1) {
			arg1 = 1;
		} else if (arg2 == 2) {
			arg3 = 1;
			arg1 = 1;
		} else if (arg2 == 3) {
			arg3 = 1;
		}
		@Pc(64) int local64;
		if (arg8 < 0 || this.anInt1878 <= arg8 || arg6 < 0 || arg6 >= this.anInt1882) {
			while (true) {
				local64 = arg9.method8632();
				if (local64 == 0) {
					return;
				}
				if (local64 == 1) {
					arg9.method8632();
					return;
				}
				if (local64 <= 49) {
					arg9.method8632();
				}
			}
			return;
		}
		if (!this.aBoolean147 && !arg4) {
			Static90.aByteArrayArrayArray25[arg0][arg8][arg6] = 0;
		}
		while (true) {
			local64 = arg9.method8632();
			if (local64 == 0) {
				if (this.aBoolean147) {
					this.anIntArrayArrayArray8[0][arg8 + arg3][arg1 + arg6] = 0;
					return;
				} else if (arg0 == 0) {
					this.anIntArrayArrayArray8[0][arg3 + arg8][arg6 + arg1] = -Static471.method6824(arg5 + 932731, 556238 - -arg7) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray8[arg0][arg8 + arg3][arg1 + arg6] = this.anIntArrayArrayArray8[arg0 - 1][arg3 + arg8][arg1 + arg6] - 960;
					return;
				}
			}
			if (local64 == 1) {
				@Pc(189) int local189 = arg9.method8632();
				if (this.aBoolean147) {
					this.anIntArrayArrayArray8[0][arg8 + arg3][arg6 + arg1] = local189 * 8 << 2;
					return;
				}
				if (local189 == 1) {
					local189 = 0;
				}
				if (arg0 == 0) {
					this.anIntArrayArrayArray8[0][arg8 + arg3][arg1 + arg6] = -local189 * 8 << 2;
					return;
				}
				this.anIntArrayArrayArray8[arg0][arg8 + arg3][arg1 + arg6] = this.anIntArrayArrayArray8[arg0 - 1][arg3 + arg8][arg6 + arg1] - (local189 * 8 << 2);
				return;
			}
			if (local64 <= 49) {
				if (arg4) {
					arg9.method8632();
				} else {
					this.aByteArrayArrayArray10[arg0][arg8][arg6] = arg9.method8621();
					this.aByteArrayArrayArray9[arg0][arg8][arg6] = (byte) ((local64 - 2) / 4);
					this.aByteArrayArrayArray12[arg0][arg8][arg6] = (byte) (arg2 + local64 - 2 & 0x3);
				}
			} else if (local64 <= 81) {
				if (!this.aBoolean147 && !arg4) {
					Static90.aByteArrayArrayArray25[arg0][arg8][arg6] = (byte) (local64 - 49);
				}
			} else if (!arg4) {
				this.aByteArrayArrayArray13[arg0][arg8][arg6] = (byte) (local64 - 81);
			}
		}
	}
}
