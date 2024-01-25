import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public class Class204 {

	@OriginalMember(owner = "client!ss", name = "i", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!ss", name = "D", descriptor = "[I")
	private final int[] anIntArray465 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!ss", name = "q", descriptor = "[I")
	private final int[] anIntArray464 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!ss", name = "s", descriptor = "Lclient!ku;")
	private final Class146 aClass146_6;

	@OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
	protected final int anInt5176;

	@OriginalMember(owner = "client!ss", name = "r", descriptor = "I")
	public final int anInt5181;

	@OriginalMember(owner = "client!ss", name = "l", descriptor = "I")
	protected final int anInt5178;

	@OriginalMember(owner = "client!ss", name = "C", descriptor = "Lclient!mn;")
	private final Class169 aClass169_4;

	@OriginalMember(owner = "client!ss", name = "t", descriptor = "Z")
	public final boolean aBoolean359;

	@OriginalMember(owner = "client!ss", name = "H", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!ss", name = "h", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!ss", name = "A", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!ss", name = "z", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(IIIZLclient!ku;Lclient!mn;)V")
	protected Class204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class146 arg4, @OriginalArg(5) Class169 arg5) {
		this.aClass146_6 = arg4;
		this.anInt5176 = arg1;
		this.anInt5181 = arg0;
		this.anInt5178 = arg2;
		this.aClass169_4 = arg5;
		this.aBoolean359 = arg3;
		this.aByteArrayArrayArray16 = new byte[this.anInt5181][this.anInt5176][this.anInt5178];
		this.aByteArrayArrayArray12 = new byte[this.anInt5181][this.anInt5176][this.anInt5178];
		this.aByteArrayArrayArray11 = new byte[this.anInt5181][this.anInt5176][this.anInt5178];
		this.aByteArrayArrayArray15 = new byte[this.anInt5181][this.anInt5176 + 1][this.anInt5178 + 1];
		this.aByteArrayArrayArray14 = new byte[this.anInt5181][this.anInt5176][this.anInt5178];
		this.anIntArrayArrayArray6 = new int[this.anInt5181][this.anInt5176 + 1][this.anInt5178 + 1];
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!fo;[[IILclient!fo;Lclient!fo;ILclient!qq;)V")
	private void method4527(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(3) Class84 arg2, @OriginalArg(4) Class84 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class28 arg5) {
		@Pc(14) byte[][] local14 = this.aByteArrayArrayArray16[arg4];
		@Pc(19) byte[][] local19 = this.aByteArrayArrayArray11[arg4];
		@Pc(24) byte[][] local24 = this.aByteArrayArrayArray12[arg4];
		@Pc(29) byte[][] local29 = this.aByteArrayArrayArray14[arg4];
		for (@Pc(31) int local31 = 0; local31 < this.anInt5176; local31++) {
			@Pc(49) int local49 = local31 >= this.anInt5176 - 1 ? local31 : local31 + 1;
			for (@Pc(51) int local51 = 0; local51 < this.anInt5178; local51++) {
				@Pc(65) int local65 = this.anInt5178 - 1 <= local51 ? local51 : local51 + 1;
				if (Static255.anInt4370 == -1 || Static418.method5687(local31, local51, arg4, Static255.anInt4370)) {
					@Pc(80) boolean local80 = false;
					@Pc(82) boolean local82 = false;
					@Pc(85) boolean[] local85 = new boolean[4];
					@Pc(91) int local91 = local14[local31][local51];
					@Pc(97) int local97 = local19[local31][local51];
					@Pc(105) int local105 = local29[local31][local51] & 0xFF;
					@Pc(113) int local113 = local24[local31][local51] & 0xFF;
					@Pc(121) int local121 = local24[local31][local65] & 0xFF;
					@Pc(129) int local129 = local24[local49][local65] & 0xFF;
					@Pc(137) int local137 = local24[local49][local51] & 0xFF;
					if (local105 != 0 || local113 != 0) {
						@Pc(153) Class196 local153 = local105 == 0 ? null : this.aClass146_6.method3337(local105 - 1);
						@Pc(168) Class234 local168 = local113 == 0 ? null : this.aClass169_4.method3857(local113 - 1);
						if (local91 == 0 && local153 == null) {
							local91 = 12;
						}
						@Pc(176) Class196 local176 = local153;
						if (local153 != null) {
							if (local153.anInt4968 == -1 && local153.anInt4978 == -1) {
								local176 = local153;
								local153 = null;
							} else if (local168 != null && local91 != 0) {
								local82 = local153.aBoolean350;
							}
						}
						@Pc(293) int local293;
						@Pc(312) int local312;
						@Pc(385) int local385;
						@Pc(398) int local398;
						if ((local91 == 0 || local91 == 12) && local31 > 0 && local51 > 0 && local31 < this.anInt5176 && this.anInt5178 > local51) {
							@Pc(251) int local251 = local113 == local24[local49][local65] ? 1 : -1;
							@Pc(270) int local270 = local24[local49][local51 - 1] == local113 ? 1 : -1;
							local293 = local24[local31 - 1][local51 - 1] == local113 ? 1 : -1;
							local312 = local113 == local24[local31 - 1][local65] ? 1 : -1;
							if (local113 == local24[local31][local51 - 1]) {
								local270++;
								local293++;
							} else {
								local270--;
								local293--;
							}
							if (local24[local49][local51] == local113) {
								local251++;
								local270++;
							} else {
								local251--;
								local270--;
							}
							if (local113 == local24[local31][local65]) {
								local312++;
								local251++;
							} else {
								local251--;
								local312--;
							}
							if (local24[local31 - 1][local51] == local113) {
								local312++;
								local293++;
							} else {
								local312--;
								local293--;
							}
							local385 = local293 - local251;
							if (local385 < 0) {
								local385 = -local385;
							}
							local398 = local270 - local312;
							if (local398 < 0) {
								local398 = -local398;
							}
							if (local385 == local398) {
								local385 = arg0.method5322(local31, local51) - arg0.method5322(local49, local65);
								if (local385 < 0) {
									local385 = -local385;
								}
								local398 = arg0.method5322(local49, local51) - arg0.method5322(local31, local65);
								if (local398 < 0) {
									local398 = -local398;
								}
							}
							local97 = local385 >= local398 ? 0 : 1;
						}
						for (local293 = 0; local293 < 13; local293++) {
							Static342.anIntArray504[local293] = -1;
							Static274.anIntArray410[local293] = 1;
						}
						@Pc(476) boolean[] local476 = local153 != null && local153.aBoolean350 ? Static362.aBooleanArrayArray6[local91] : Static329.aBooleanArrayArray5[local91];
						this.method4531(local31, local91, local19, local14, local29, local51, local85, local168, local153, local97, this.anInt5176, arg5, this.anInt5178);
						@Pc(509) boolean local509 = local153 != null && local153.anInt4968 != local153.anInt4978;
						if (!local509) {
							for (local312 = 0; local312 < 8; local312++) {
								if (Static342.anIntArray504[local312] >= 0 && Static48.anIntArray574[local312] != Static347.anIntArray513[local312]) {
									local509 = true;
									break;
								}
							}
						}
						if (!local476[local97 + 1 & 0x3]) {
							local85[1] = Static258.method3975(local85[1], (Static274.anIntArray410[4] & Static274.anIntArray410[2]) == 0);
						}
						if (!local476[local97 + 3 & 0x3]) {
							local85[3] = Static258.method3975(local85[3], (Static274.anIntArray410[6] & Static274.anIntArray410[0]) == 0);
						}
						if (!local476[local97 & 0x3]) {
							local85[0] = Static258.method3975(local85[0], (Static274.anIntArray410[0] & Static274.anIntArray410[2]) == 0);
						}
						if (!local476[local97 + 2 & 0x3]) {
							local85[2] = Static258.method3975(local85[2], (Static274.anIntArray410[4] & Static274.anIntArray410[6]) == 0);
						}
						if (!local82 && (local91 == 0 || local91 == 12)) {
							if (local85[0] && !local85[1] && !local85[2] && local85[3]) {
								local91 = local91 == 0 ? 13 : 14;
								local97 = 0;
								local85[0] = local85[3] = false;
							} else if (local85[0] && local85[1] && !local85[2] && !local85[3]) {
								local91 = local91 == 0 ? 13 : 14;
								local97 = 3;
								local85[0] = local85[1] = false;
							} else if (!local85[0] && local85[1] && local85[2] && !local85[3]) {
								local97 = 2;
								local85[1] = local85[2] = false;
								local91 = local91 == 0 ? 13 : 14;
							} else if (!local85[0] && !local85[1] && local85[2] && local85[3]) {
								local97 = 1;
								local85[2] = local85[3] = false;
								local91 = local91 == 0 ? 13 : 14;
							}
						}
						@Pc(815) boolean local815 = !local82 && !local85[0] && !local85[2] && !local85[1] && !local85[3];
						@Pc(817) int[] local817 = null;
						@Pc(833) int[] local833;
						@Pc(829) int[] local829;
						@Pc(837) int[] local837;
						if (local815) {
							local398 = local153 == null ? 0 : Static250.anIntArray385[local91];
							local837 = Static59.anIntArrayArray9[local91];
							local385 = local168 == null ? 0 : Static414.anIntArray597[local91];
							local833 = Static355.anIntArrayArray55[local91];
							local829 = Static295.anIntArrayArray43[local91];
						} else if (local82) {
							local829 = Static446.anIntArrayArray59[local91];
							local833 = Static148.anIntArrayArray24[local91];
							local817 = Static100.anIntArrayArray4[local91];
							local398 = local153 == null ? 0 : Static291.anIntArray639[local91];
							local385 = local168 == null ? 0 : Static329.anIntArray492[local91];
							local837 = Static362.anIntArrayArray56[local91];
						} else {
							local817 = Static230.anIntArrayArray32[local91];
							local829 = Static236.anIntArrayArray37[local91];
							local833 = Static225.anIntArrayArray31[local91];
							local837 = Static81.anIntArrayArray17[local91];
							local385 = local168 == null ? 0 : Static182.anIntArray292[local91];
							local398 = local153 == null ? 0 : Static105.anIntArray202[local91];
						}
						@Pc(919) int local919 = local385 + local398;
						if (local919 <= 0) {
							Static304.method4403(arg4, local31, local51);
						} else {
							if (local85[0]) {
								local919++;
							}
							if (local85[2]) {
								local919++;
							}
							if (local85[1]) {
								local919++;
							}
							if (local85[3]) {
								local919++;
							}
							@Pc(952) int local952 = 0;
							@Pc(954) int local954 = 0;
							@Pc(958) int local958 = local919 * 3;
							@Pc(965) int[] local965 = local509 ? new int[local958] : null;
							@Pc(968) int[] local968 = new int[local958];
							@Pc(971) int[] local971 = new int[local958];
							@Pc(974) int[] local974 = new int[local958];
							@Pc(977) int[] local977 = new int[local958];
							@Pc(980) int[] local980 = new int[local958];
							@Pc(987) int[] local987 = arg3 == null ? null : new int[local958];
							@Pc(996) int[] local996 = arg3 == null && arg2 == null ? null : new int[local958];
							@Pc(998) int local998 = -1;
							@Pc(1000) int local1000 = -1;
							@Pc(1002) int local1002 = 256;
							@Pc(1120) byte local1120;
							@Pc(1052) int local1052;
							@Pc(1054) int local1054;
							@Pc(1295) int local1295;
							@Pc(1301) int local1301;
							@Pc(1310) int local1310;
							@Pc(1315) int local1315;
							@Pc(1332) int local1332;
							@Pc(1320) int local1320;
							@Pc(1330) int local1330;
							@Pc(1390) int local1390;
							@Pc(1396) int local1396;
							if (local153 != null) {
								local998 = local153.anInt4968;
								local1000 = arg5.method3481() ? local153.anInt4971 : local153.anInt4976;
								local1002 = local153.anInt4965;
								local1052 = Static101.method1687(arg5, local153);
								for (local1054 = 0; local1054 < local398; local1054++) {
									if (local85[-local97 & 0x3] && local817[0] == local952) {
										Static77.anIntArray162[0] = local833[local952];
										Static77.anIntArray162[1] = 1;
										Static77.anIntArray162[2] = local837[local952];
										Static77.anIntArray162[3] = 1;
										Static77.anIntArray162[4] = local829[local952];
										local1120 = 6;
										Static77.anIntArray162[5] = local837[local952];
									} else if (local85[2 - local97 & 0x3] && local817[2] == local952) {
										Static77.anIntArray162[0] = local833[local952];
										Static77.anIntArray162[1] = 5;
										Static77.anIntArray162[2] = local837[local952];
										Static77.anIntArray162[3] = 5;
										Static77.anIntArray162[4] = local829[local952];
										local1120 = 6;
										Static77.anIntArray162[5] = local837[local952];
									} else if (local85[1 - local97 & 0x3] && local817[1] == local952) {
										Static77.anIntArray162[0] = local833[local952];
										Static77.anIntArray162[1] = 3;
										Static77.anIntArray162[2] = local837[local952];
										Static77.anIntArray162[3] = 3;
										Static77.anIntArray162[4] = local829[local952];
										local1120 = 6;
										Static77.anIntArray162[5] = local837[local952];
									} else if (local85[3 - local97 & 0x3] && local817[3] == local952) {
										Static77.anIntArray162[0] = local833[local952];
										Static77.anIntArray162[1] = 7;
										Static77.anIntArray162[2] = local837[local952];
										Static77.anIntArray162[3] = 7;
										Static77.anIntArray162[4] = local829[local952];
										Static77.anIntArray162[5] = local837[local952];
										local1120 = 6;
									} else {
										Static77.anIntArray162[0] = local833[local952];
										Static77.anIntArray162[1] = local829[local952];
										Static77.anIntArray162[2] = local837[local952];
										local1120 = 3;
									}
									local952++;
									for (local1295 = 0; local1295 < local1120; local1295++) {
										local1301 = Static77.anIntArray162[local1295];
										local1310 = local1301 - local97 * 2 & 0x7;
										local1315 = this.anIntArray464[local1301];
										local1320 = this.anIntArray465[local1301];
										if (local97 == 1) {
											local1330 = 128 - local1315;
											local1332 = local1320;
										} else if (local97 == 2) {
											local1330 = 128 - local1320;
											local1332 = 128 - local1315;
										} else if (local97 == 3) {
											local1332 = 128 - local1320;
											local1330 = local1315;
										} else {
											local1332 = local1315;
											local1330 = local1320;
										}
										local968[local954] = local1332;
										local971[local954] = local1330;
										if (local987 != null && Static16.aBooleanArrayArray1[local91][local1301]) {
											local1390 = local1332 + (local31 << 7);
											local1396 = (local51 << 7) + local1330;
											local987[local954] = arg3.method5334(local1390, local1396) - arg0.method5334(local1390, local1396);
										}
										if (local996 != null) {
											if (arg3 != null && !Static16.aBooleanArrayArray1[local91][local1301]) {
												local1390 = (local31 << 7) + local1332;
												local1396 = local1330 + (local51 << 7);
												local996[local954] = arg0.method5334(local1390, local1396) - arg3.method5334(local1390, local1396);
											} else if (arg2 != null && !Static128.aBooleanArrayArray4[local91][local1301]) {
												local1390 = (local31 << 7) + local1332;
												local1396 = (local51 << 7) + local1330;
												local996[local954] = arg2.method5334(local1390, local1396) - arg0.method5334(local1390, local1396);
											}
										}
										if (local1301 < 8 && Static342.anIntArray504[local1310] > local153.anInt4973) {
											if (local965 != null) {
												local965[local954] = Static48.anIntArray574[local1310];
											}
											local980[local954] = Static131.anIntArray237[local1310];
											local977[local954] = Static166.anIntArray270[local1310];
											local974[local954] = Static347.anIntArray513[local1310];
										} else {
											if (local965 != null) {
												local965[local954] = local1052;
											}
											local977[local954] = arg5.method3481() ? local153.anInt4971 : local153.anInt4976;
											local980[local954] = local153.anInt4965;
											local974[local954] = local998;
										}
										local954++;
									}
								}
								if (!this.aBoolean359 && arg4 == 0) {
									Static130.method2136(local31, local51, local153.anInt4967, local153.anInt4966 * 8, local153.anInt4979);
								}
								if (local91 != 12 && local153.anInt4968 != -1 && local153.aBoolean351) {
									local80 = true;
								}
							} else if (local815) {
								local952 = Static250.anIntArray385[local91];
							} else if (local82) {
								local952 = Static291.anIntArray639[local91];
							} else {
								local952 = Static105.anIntArray202[local91];
							}
							if (local168 != null) {
								if (local129 == 0) {
									local129 = local113;
								}
								if (local137 == 0) {
									local137 = local113;
								}
								if (local121 == 0) {
									local121 = local113;
								}
								@Pc(1610) Class234 local1610 = this.aClass169_4.method3857(local113 - 1);
								@Pc(1618) Class234 local1618 = this.aClass169_4.method3857(local121 - 1);
								@Pc(1626) Class234 local1626 = this.aClass169_4.method3857(local129 - 1);
								@Pc(1634) Class234 local1634 = this.aClass169_4.method3857(local137 - 1);
								for (local1310 = 0; local1310 < local385; local1310++) {
									if (local85[-local97 & 0x3] && local952 == local817[0]) {
										Static77.anIntArray162[0] = local833[local952];
										Static77.anIntArray162[1] = 1;
										Static77.anIntArray162[2] = local837[local952];
										Static77.anIntArray162[3] = 1;
										Static77.anIntArray162[4] = local829[local952];
										local1120 = 6;
										Static77.anIntArray162[5] = local837[local952];
									} else if (local85[2 - local97 & 0x3] && local817[2] == local952) {
										Static77.anIntArray162[0] = local833[local952];
										Static77.anIntArray162[1] = 5;
										Static77.anIntArray162[2] = local837[local952];
										Static77.anIntArray162[3] = 5;
										Static77.anIntArray162[4] = local829[local952];
										Static77.anIntArray162[5] = local837[local952];
										local1120 = 6;
									} else if (local85[1 - local97 & 0x3] && local952 == local817[1]) {
										Static77.anIntArray162[0] = local833[local952];
										Static77.anIntArray162[1] = 3;
										Static77.anIntArray162[2] = local837[local952];
										Static77.anIntArray162[3] = 3;
										Static77.anIntArray162[4] = local829[local952];
										local1120 = 6;
										Static77.anIntArray162[5] = local837[local952];
									} else if (local85[3 - local97 & 0x3] && local952 == local817[3]) {
										Static77.anIntArray162[0] = local833[local952];
										Static77.anIntArray162[1] = 7;
										Static77.anIntArray162[2] = local837[local952];
										Static77.anIntArray162[3] = 7;
										Static77.anIntArray162[4] = local829[local952];
										local1120 = 6;
										Static77.anIntArray162[5] = local837[local952];
									} else {
										Static77.anIntArray162[0] = local833[local952];
										Static77.anIntArray162[1] = local829[local952];
										local1120 = 3;
										Static77.anIntArray162[2] = local837[local952];
									}
									for (local1315 = 0; local1315 < local1120; local1315++) {
										local1332 = Static77.anIntArray162[local1315];
										local1320 = local1332 - local97 * 2 & 0x7;
										local1330 = this.anIntArray464[local1332];
										local1396 = this.anIntArray465[local1332];
										@Pc(1904) int local1904;
										if (local97 == 1) {
											local1904 = 128 - local1330;
											local1390 = local1396;
										} else if (local97 == 2) {
											local1390 = 128 - local1330;
											local1904 = 128 - local1396;
										} else if (local97 == 3) {
											local1904 = local1330;
											local1390 = 128 - local1396;
										} else {
											local1390 = local1330;
											local1904 = local1396;
										}
										local968[local954] = local1390;
										local971[local954] = local1904;
										@Pc(1959) int local1959;
										@Pc(1965) int local1965;
										if (local987 != null && Static16.aBooleanArrayArray1[local91][local1332]) {
											local1959 = (local31 << 7) + local1390;
											local1965 = local1904 + (local51 << 7);
											local987[local954] = arg3.method5334(local1959, local1965) - arg0.method5334(local1959, local1965);
										}
										if (local996 != null) {
											if (arg3 != null && !Static16.aBooleanArrayArray1[local91][local1332]) {
												local1959 = local1390 + (local31 << 7);
												local1965 = (local51 << 7) + local1904;
												local996[local954] = arg0.method5334(local1959, local1965) - arg3.method5334(local1959, local1965);
											} else if (arg2 != null && !Static128.aBooleanArrayArray4[local91][local1332]) {
												local1959 = (local31 << 7) + local1390;
												local1965 = local1904 + (local51 << 7);
												local996[local954] = arg2.method5334(local1959, local1965) - arg0.method5334(local1959, local1965);
											}
										}
										if (local1332 < 8 && Static342.anIntArray504[local1320] >= 0) {
											if (local965 != null) {
												local965[local954] = Static48.anIntArray574[local1320];
											}
											local980[local954] = Static131.anIntArray237[local1320];
											local977[local954] = Static166.anIntArray270[local1320];
											local974[local954] = Static347.anIntArray513[local1320];
										} else {
											if (local82 && Static16.aBooleanArrayArray1[local91][local1332]) {
												local977[local954] = local1000;
												local980[local954] = local1002;
												local974[local954] = local998;
											} else if (local1390 == 0 && local1904 == 0) {
												local974[local954] = arg1[local31][local51];
												local977[local954] = local1610.anInt6271;
												local980[local954] = local1610.anInt6274;
											} else if (local1390 == 0 && local1904 == 128) {
												local974[local954] = arg1[local31][local65];
												local977[local954] = local1618.anInt6271;
												local980[local954] = local1618.anInt6274;
											} else if (local1390 == 128 && local1904 == 128) {
												local974[local954] = arg1[local49][local65];
												local977[local954] = local1626.anInt6271;
												local980[local954] = local1626.anInt6274;
											} else if (local1390 == 128 && local1904 == 0) {
												local974[local954] = arg1[local49][local51];
												local977[local954] = local1634.anInt6271;
												local980[local954] = local1634.anInt6274;
											} else {
												if (local1390 < 64) {
													if (local1904 >= 64) {
														local977[local954] = local1618.anInt6271;
														local980[local954] = local1618.anInt6274;
													} else {
														local977[local954] = local1610.anInt6271;
														local980[local954] = local1610.anInt6274;
													}
												} else if (local1904 >= 64) {
													local977[local954] = local1626.anInt6271;
													local980[local954] = local1626.anInt6274;
												} else {
													local977[local954] = local1634.anInt6271;
													local980[local954] = local1634.anInt6274;
												}
												local1959 = Static1.method1(arg1[local49][local51], arg1[local31][local51], local1390 << 7 >> 7);
												local1965 = Static1.method1(arg1[local49][local65], arg1[local31][local65], local1390 << 7 >> 7);
												local974[local954] = Static1.method1(local1965, local1959, local1904 << 7 >> 7);
											}
											if (local965 != null) {
												local965[local954] = local974[local954];
											}
										}
										local954++;
									}
									local952++;
								}
								if (local91 != 0 && local168.aBoolean416) {
									local80 = true;
								}
							}
							local1052 = arg0.method5322(local31, local51);
							local1054 = arg0.method5322(local49, local51);
							local1295 = arg0.method5322(local49, local65);
							local1301 = arg0.method5322(local31, local65);
							if (arg4 > 0) {
								@Pc(2375) boolean local2375 = true;
								if (local113 == 0 && local91 != 0) {
									local2375 = false;
								}
								if (local105 > 0 && local176 != null && !local176.aBoolean352) {
									local2375 = false;
								}
								if (local2375 && local1052 == local1054 && local1295 == local1052 && local1301 == local1052) {
									this.aByteArrayArrayArray15[arg4][local31][local51] = (byte) (this.aByteArrayArrayArray15[arg4][local31][local51] | 0x4);
								}
							}
							local1310 = 0;
							local1315 = 0;
							local1332 = 0;
							if (this.aBoolean359) {
								local1310 = Static156.method2608(local31, local51);
								local1315 = Static123.method2002(local31, local51);
								local1332 = Static364.method5133(local31, local51);
							}
							arg0.method5327(local31, local51, local968, local987, local971, local996, local974, local965, local977, local980, local1310, local1315, local1332, local80);
							Static304.method4403(arg4, local31, local51);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ILclient!ha;IIBIIII[Lclient!ea;)V")
	public final void method4528(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class61[] arg8) {
		@Pc(11) int local11 = (arg6 & 0x7) * 8;
		@Pc(20) int local20;
		@Pc(50) int local50;
		if (!this.aBoolean359) {
			@Pc(18) Class61 local18 = arg8[arg4];
			for (local20 = 0; local20 < 8; local20++) {
				for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
					@Pc(38) int local38 = Static256.method3949(local24 & 0x7, arg3, local20 & 0x7) + arg7;
					local50 = Static46.method4880(local20 & 0x7, local24 & 0x7, arg3) + arg0;
					if (local38 > 0 && this.anInt5176 - 1 > local38 && local50 > 0 && local50 < this.anInt5178 - 1) {
						local18.method1490(local38, local50);
					}
				}
			}
		}
		@Pc(95) int local95 = (arg2 & 0x7) * 8;
		@Pc(101) int local101 = (arg6 & 0xFFFFFFF8) << 3;
		local20 = (arg2 & 0xFFFFFFF8) << 3;
		@Pc(109) byte local109 = 0;
		@Pc(111) byte local111 = 0;
		if (arg3 == 1) {
			local111 = 1;
		} else if (arg3 == 2) {
			local111 = 1;
			local109 = 1;
		} else if (arg3 == 3) {
			local109 = 1;
		}
		for (local50 = 0; local50 < this.anInt5181; local50++) {
			for (@Pc(150) int local150 = 0; local150 < 64; local150++) {
				for (@Pc(154) int local154 = 0; local154 < 64; local154++) {
					if (local50 == arg5 && local11 <= local150 && local150 <= local11 + 8 && local95 <= local154 && local95 + 8 >= local154) {
						@Pc(228) int local228;
						@Pc(240) int local240;
						if (local150 == local11 + 8 || local95 + 8 == local154) {
							if (arg3 == 0) {
								local228 = arg7 + local150 - local11;
								local240 = local154 + arg0 - local95;
							} else if (arg3 == 1) {
								local228 = local154 + arg7 - local95;
								local240 = local11 + arg0 + 8 - local150;
							} else if (arg3 == 2) {
								local240 = arg0 + local95 + 8 - local154;
								local228 = arg7 + local11 + 8 - local150;
							} else {
								local240 = local150 + arg0 - local11;
								local228 = arg7 + local95 + 8 - local154;
							}
							this.method4537(0, true, local150 + local101, arg1, arg4, 0, local240, 0, local154 + local20, local228);
						} else {
							local228 = arg7 + Static256.method3949(local154 & 0x7, arg3, local150 & 0x7);
							local240 = Static46.method4880(local150 & 0x7, local154 & 0x7, arg3) + arg0;
							this.method4537(local111, false, local101 + local150, arg1, arg4, local109, local240, arg3, local154 + local20, local228);
							if (local150 == 63 || local154 == 63) {
								@Pc(273) int local273 = local150 == 63 ? 64 : local150;
								@Pc(280) int local280 = local154 == 63 ? 64 : local154;
								@Pc(289) int local289;
								@Pc(296) int local296;
								if (arg3 == 0) {
									local289 = arg7 + local273 - local11;
									local296 = local280 + arg0 - local95;
								} else if (arg3 == 1) {
									local296 = local11 + arg0 + 8 - local273;
									local289 = arg7 + local280 - local95;
								} else if (arg3 == 2) {
									local289 = local11 + arg7 + 8 - local273;
									local296 = arg0 + local95 + 8 - local280;
								} else {
									local296 = local273 + arg0 - local11;
									local289 = local95 + arg7 + 8 - local280;
								}
								if (local289 >= 0 && local289 < this.anInt5176 && local296 >= 0 && local296 < this.anInt5178) {
									this.anIntArrayArrayArray6[arg4][local289][local296] = this.anIntArrayArrayArray6[arg4][local109 + local228][local111 + local240];
								}
							}
						}
					} else {
						this.method4537(0, false, 0, arg1, 0, 0, -1, 0, 0, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!qq;[Lclient!ea;I[[[I)V")
	public final void method4529(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class61[] arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (!this.aBoolean359) {
			for (local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt5176; local10++) {
					for (local14 = 0; local14 < this.anInt5178; local14++) {
						if ((Static179.aByteArrayArrayArray3[local6][local10][local14] & 0x1) != 0) {
							@Pc(28) int local28 = local6;
							if ((Static179.aByteArrayArrayArray3[1][local10][local14] & 0x2) != 0) {
								local28 = local6 - 1;
							}
							if (local28 >= 0) {
								arg1[local28].method1480(local10, local14);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt5181; local6++) {
			local10 = 0;
			local14 = 0;
			if (!this.aBoolean359) {
				if (Static100.aBoolean37) {
					local14 = 8;
				}
				if (Static63.aBoolean112) {
					local10 = 2;
				}
				if (Static314.anInt7070 != 0) {
					local10 |= 0x1;
					if (Static3.aBoolean419 | local6 == 0) {
						local14 |= 0x10;
					}
				}
			}
			if (Static63.aBoolean112) {
				local14 |= 0x7;
			}
			@Pc(143) int[][] local143 = arg2 == null || arg2.length <= local6 ? this.anIntArrayArrayArray6[local6] : arg2[local6];
			Static272.method4139(local6, arg0.method3507(this.anInt5176, this.anInt5178, this.anIntArrayArrayArray6[local6], local143, local10, local14));
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IBIII)V")
	public final void method4530(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1) {
		for (@Pc(19) int local19 = 0; local19 < this.anInt5181; local19++) {
			this.method4540(arg1, 64, local19, 64, arg0);
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II[[B[[B[[BI[ZLclient!tg;Lclient!pb;IIILclient!qq;I)V")
	private void method4531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean[] arg6, @OriginalArg(7) Class234 arg7, @OriginalArg(8) Class196 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class28 arg11, @OriginalArg(13) int arg12) {
		@Pc(43) int local43;
		if (arg8 != null && arg7 != null || arg7 != null && arg1 == 12 || arg8 != null && arg1 == 0) {
			@Pc(27) boolean[] local27 = arg8 != null && arg8.aBoolean350 ? Static362.aBooleanArrayArray6[arg1] : Static329.aBooleanArrayArray5[arg1];
			@Pc(53) Class196 local53;
			@Pc(70) byte local70;
			@Pc(86) int local86;
			@Pc(91) int local91;
			if (arg5 > 0) {
				if (arg0 > 0) {
					local43 = arg4[arg0 - 1][arg5 - 1] & 0xFF;
					if (local43 > 0) {
						local53 = this.aClass146_6.method3337(local43 - 1);
						if (local53.anInt4968 != -1 && local53.aBoolean350) {
							local70 = arg3[arg0 - 1][arg5 - 1];
							local86 = arg2[arg0 - 1][arg5 - 1] * 2 + 4 & 0x7;
							local91 = Static101.method1687(arg11, local53);
							if (Static16.aBooleanArrayArray1[local70][local86]) {
								Static347.anIntArray513[0] = local53.anInt4968;
								Static48.anIntArray574[0] = local91;
								Static166.anIntArray270[0] = arg11.method3481() ? local53.anInt4971 : local53.anInt4976;
								Static131.anIntArray237[0] = local53.anInt4965;
								Static342.anIntArray504[0] = local53.anInt4973;
								Static274.anIntArray410[0] = 256;
							}
						}
					}
				}
				if (arg10 - 1 > arg0) {
					local43 = arg4[arg0 + 1][arg5 - 1] & 0xFF;
					if (local43 > 0) {
						local53 = this.aClass146_6.method3337(local43 - 1);
						if (local53.anInt4968 != -1 && local53.aBoolean350) {
							local70 = arg3[arg0 + 1][arg5 - 1];
							local86 = arg2[arg0 + 1][arg5 - 1] * 2 + 6 & 0x7;
							local91 = Static101.method1687(arg11, local53);
							if (Static16.aBooleanArrayArray1[local70][local86]) {
								Static347.anIntArray513[2] = local53.anInt4968;
								Static48.anIntArray574[2] = local91;
								Static166.anIntArray270[2] = arg11.method3481() ? local53.anInt4971 : local53.anInt4976;
								Static131.anIntArray237[2] = local53.anInt4965;
								Static342.anIntArray504[2] = local53.anInt4973;
								Static274.anIntArray410[2] = 512;
							}
						}
					}
				}
			}
			if (arg12 - 1 > arg5) {
				if (arg0 > 0) {
					local43 = arg4[arg0 - 1][arg5 + 1] & 0xFF;
					if (local43 > 0) {
						local53 = this.aClass146_6.method3337(local43 - 1);
						if (local53.anInt4968 != -1 && local53.aBoolean350) {
							local70 = arg3[arg0 - 1][arg5 + 1];
							local86 = arg2[arg0 - 1][arg5 + 1] * 2 + 2 & 0x7;
							local91 = Static101.method1687(arg11, local53);
							if (Static16.aBooleanArrayArray1[local70][local86]) {
								Static347.anIntArray513[6] = local53.anInt4968;
								Static48.anIntArray574[6] = local91;
								Static166.anIntArray270[6] = arg11.method3481() ? local53.anInt4971 : local53.anInt4976;
								Static131.anIntArray237[6] = local53.anInt4965;
								Static342.anIntArray504[6] = local53.anInt4973;
								Static274.anIntArray410[6] = 64;
							}
						}
					}
				}
				if (arg10 - 1 > arg0) {
					local43 = arg4[arg0 + 1][arg5 + 1] & 0xFF;
					if (local43 > 0) {
						local53 = this.aClass146_6.method3337(local43 - 1);
						if (local53.anInt4968 != -1 && local53.aBoolean350) {
							local70 = arg3[arg0 + 1][arg5 + 1];
							local86 = arg2[arg0 + 1][arg5 + 1] * 2 & 0x7;
							local91 = Static101.method1687(arg11, local53);
							if (Static16.aBooleanArrayArray1[local70][local86]) {
								Static347.anIntArray513[4] = local53.anInt4968;
								Static48.anIntArray574[4] = local91;
								Static166.anIntArray270[4] = arg11.method3481() ? local53.anInt4971 : local53.anInt4976;
								Static131.anIntArray237[4] = local53.anInt4965;
								Static342.anIntArray504[4] = local53.anInt4973;
								Static274.anIntArray410[4] = 128;
							}
						}
					}
				}
			}
			@Pc(531) int local531;
			@Pc(536) int local536;
			@Pc(538) int local538;
			@Pc(499) byte local499;
			if (arg5 > 0) {
				local43 = arg4[arg0][arg5 - 1] & 0xFF;
				if (local43 > 0) {
					local53 = this.aClass146_6.method3337(local43 - 1);
					if (local53.anInt4968 != -1) {
						local70 = arg3[arg0][arg5 - 1];
						local499 = arg2[arg0][arg5 - 1];
						if (local53.aBoolean350) {
							local91 = 2;
							local531 = local499 * 2 + 4;
							local536 = Static101.method1687(arg11, local53);
							for (local538 = 0; local538 < 3; local538++) {
								local91 &= 0x7;
								local531 &= 0x7;
								if (Static16.aBooleanArrayArray1[local70][local531] && local53.anInt4973 >= Static342.anIntArray504[local91]) {
									Static347.anIntArray513[local91] = local53.anInt4968;
									Static48.anIntArray574[local91] = local536;
									Static166.anIntArray270[local91] = arg11.method3481() ? local53.anInt4971 : local53.anInt4976;
									Static131.anIntArray237[local91] = local53.anInt4965;
									if (local53.anInt4973 == Static342.anIntArray504[local91]) {
										Static274.anIntArray410[local91] |= 0x20;
									} else {
										Static274.anIntArray410[local91] = 32;
									}
									Static342.anIntArray504[local91] = local53.anInt4973;
								}
								local531++;
								local91--;
							}
							if (!local27[arg9 & 0x3]) {
								arg6[0] = Static362.aBooleanArrayArray6[local70][local499 + 2 & 0x3];
							}
						} else if (!local27[arg9 & 0x3]) {
							arg6[0] = Static329.aBooleanArrayArray5[local70][local499 + 2 & 0x3];
						}
					}
				}
			}
			if (arg12 - 1 > arg5) {
				local43 = arg4[arg0][arg5 + 1] & 0xFF;
				if (local43 > 0) {
					local53 = this.aClass146_6.method3337(local43 - 1);
					if (local53.anInt4968 != -1) {
						local70 = arg3[arg0][arg5 + 1];
						local499 = arg2[arg0][arg5 + 1];
						if (local53.aBoolean350) {
							local91 = 4;
							local531 = local499 * 2 + 2;
							local536 = Static101.method1687(arg11, local53);
							for (local538 = 0; local538 < 3; local538++) {
								local91 &= 0x7;
								local531 &= 0x7;
								if (Static16.aBooleanArrayArray1[local70][local531] && Static342.anIntArray504[local91] <= local53.anInt4973) {
									Static347.anIntArray513[local91] = local53.anInt4968;
									Static48.anIntArray574[local91] = local536;
									Static166.anIntArray270[local91] = arg11.method3481() ? local53.anInt4971 : local53.anInt4976;
									Static131.anIntArray237[local91] = local53.anInt4965;
									if (local53.anInt4973 == Static342.anIntArray504[local91]) {
										Static274.anIntArray410[local91] |= 0x10;
									} else {
										Static274.anIntArray410[local91] = 16;
									}
									Static342.anIntArray504[local91] = local53.anInt4973;
								}
								local531--;
								local91++;
							}
							if (!local27[arg9 + 2 & 0x3]) {
								arg6[2] = Static362.aBooleanArrayArray6[local70][local499 & 0x3];
							}
						} else if (!local27[arg9 + 2 & 0x3]) {
							arg6[2] = Static329.aBooleanArrayArray5[local70][local499 & 0x3];
						}
					}
				}
			}
			if (arg0 > 0) {
				local43 = arg4[arg0 - 1][arg5] & 0xFF;
				if (local43 > 0) {
					local53 = this.aClass146_6.method3337(local43 - 1);
					if (local53.anInt4968 != -1) {
						local70 = arg3[arg0 - 1][arg5];
						local499 = arg2[arg0 - 1][arg5];
						if (local53.aBoolean350) {
							local91 = 6;
							local531 = local499 * 2 + 4;
							local536 = Static101.method1687(arg11, local53);
							for (local538 = 0; local538 < 3; local538++) {
								local91 &= 0x7;
								local531 &= 0x7;
								if (Static16.aBooleanArrayArray1[local70][local531] && Static342.anIntArray504[local91] <= local53.anInt4973) {
									Static347.anIntArray513[local91] = local53.anInt4968;
									Static48.anIntArray574[local91] = local536;
									Static166.anIntArray270[local91] = arg11.method3481() ? local53.anInt4971 : local53.anInt4976;
									Static131.anIntArray237[local91] = local53.anInt4965;
									if (local53.anInt4973 == Static342.anIntArray504[local91]) {
										Static274.anIntArray410[local91] |= 0x8;
									} else {
										Static274.anIntArray410[local91] = 8;
									}
									Static342.anIntArray504[local91] = local53.anInt4973;
								}
								local91++;
								local531--;
							}
							if (!local27[arg9 + 3 & 0x3]) {
								arg6[3] = Static362.aBooleanArrayArray6[local70][local499 + 1 & 0x3];
							}
						} else if (!local27[arg9 + 3 & 0x3]) {
							arg6[3] = Static329.aBooleanArrayArray5[local70][local499 + 1 & 0x3];
						}
					}
				}
			}
			if (arg10 - 1 > arg0) {
				local43 = arg4[arg0 + 1][arg5] & 0xFF;
				if (local43 > 0) {
					local53 = this.aClass146_6.method3337(local43 - 1);
					if (local53.anInt4968 != -1) {
						local70 = arg3[arg0 + 1][arg5];
						local499 = arg2[arg0 + 1][arg5];
						if (local53.aBoolean350) {
							local91 = 4;
							local531 = local499 * 2 + 6;
							local536 = Static101.method1687(arg11, local53);
							for (local538 = 0; local538 < 3; local538++) {
								local531 &= 0x7;
								local91 &= 0x7;
								if (Static16.aBooleanArrayArray1[local70][local531] && local53.anInt4973 >= Static342.anIntArray504[local91]) {
									Static347.anIntArray513[local91] = local53.anInt4968;
									Static48.anIntArray574[local91] = local536;
									Static166.anIntArray270[local91] = arg11.method3481() ? local53.anInt4971 : local53.anInt4976;
									Static131.anIntArray237[local91] = local53.anInt4965;
									if (Static342.anIntArray504[local91] == local53.anInt4973) {
										Static274.anIntArray410[local91] |= 0x4;
									} else {
										Static274.anIntArray410[local91] = 4;
									}
									Static342.anIntArray504[local91] = local53.anInt4973;
								}
								local531++;
								local91--;
							}
							if (!local27[arg9 + 1 & 0x3]) {
								arg6[1] = Static362.aBooleanArrayArray6[local70][local499 + 3 & 0x3];
							}
						} else if (!local27[arg9 + 1 & 0x3]) {
							arg6[1] = Static329.aBooleanArrayArray5[local70][local499 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg8 == null) {
			return;
		}
		@Pc(1232) int local1232 = Static101.method1687(arg11, arg8);
		if (!arg8.aBoolean350) {
			return;
		}
		for (local43 = 0; local43 < 8; local43++) {
			@Pc(1248) int local1248 = local43 - arg9 * 2 & 0x7;
			if (Static16.aBooleanArrayArray1[arg1][local43] && arg8.anInt4973 >= Static342.anIntArray504[local1248]) {
				Static347.anIntArray513[local1248] = arg8.anInt4968;
				Static48.anIntArray574[local1248] = local1232;
				Static166.anIntArray270[local1248] = arg11.method3481() ? arg8.anInt4971 : arg8.anInt4976;
				Static131.anIntArray237[local1248] = arg8.anInt4965;
				if (arg8.anInt4973 == Static342.anIntArray504[local1248]) {
					Static274.anIntArray410[local1248] |= 0x2;
				} else {
					Static274.anIntArray410[local1248] = 2;
				}
				Static342.anIntArray504[local1248] = arg8.anInt4973;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!ha;II[Lclient!ea;III)V")
	public final void method4532(@OriginalArg(0) Class6_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class61[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (!this.aBoolean359) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class61 local16 = arg3[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local28 = local18 + arg1;
						@Pc(32) int local32 = arg2 + local22;
						if (local28 >= 0 && this.anInt5176 > local28 && local32 >= 0 && this.anInt5178 > local32) {
							local16.method1490(local28, local32);
						}
					}
				}
			}
		}
		local10 = arg4 + arg1;
		@Pc(82) int local82 = arg5 + arg2;
		for (local18 = 0; local18 < this.anInt5181; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method4537(0, false, local22 + local10, arg0, local18, 0, arg2 + local28, 0, local82 + local28, arg1 + local22);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!fo;Lclient!fo;Lclient!qq;B)V")
	public final void method4534(@OriginalArg(0) Class84 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) Class28 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt5176][this.anInt5178];
		if (Static451.anIntArray549 == null || Static451.anIntArray549.length != this.anInt5178) {
			Static246.anIntArray379 = new int[this.anInt5178];
			Static243.anIntArray372 = new int[this.anInt5178];
			Static451.anIntArray549 = new int[this.anInt5178];
			Static244.anIntArray375 = new int[this.anInt5178];
			Static373.anIntArray193 = new int[this.anInt5178];
		}
		@Pc(73) int local73;
		for (@Pc(40) int local40 = 0; local40 < this.anInt5181; local40++) {
			for (@Pc(44) int local44 = 0; local44 < this.anInt5178; local44++) {
				Static451.anIntArray549[local44] = 0;
				Static373.anIntArray193[local44] = 0;
				Static244.anIntArray375[local44] = 0;
				Static243.anIntArray372[local44] = 0;
				Static246.anIntArray379[local44] = 0;
			}
			for (local73 = -5; local73 < this.anInt5176; local73++) {
				@Pc(83) int local83;
				@Pc(98) int local98;
				@Pc(164) int local164;
				for (@Pc(77) int local77 = 0; local77 < this.anInt5178; local77++) {
					local83 = local73 + 5;
					@Pc(144) int local144;
					if (this.anInt5176 > local83) {
						local98 = this.aByteArrayArrayArray12[local40][local83][local77] & 0xFF;
						if (local98 > 0) {
							@Pc(108) Class234 local108 = this.aClass169_4.method3857(local98 - 1);
							Static451.anIntArray549[local77] += local108.anInt6270;
							Static373.anIntArray193[local77] += local108.anInt6281;
							Static244.anIntArray375[local77] += local108.anInt6280;
							Static243.anIntArray372[local77] += local108.anInt6276;
							local144 = Static246.anIntArray379[local77]++;
						}
					}
					local98 = local73 - 5;
					if (local98 >= 0) {
						local164 = this.aByteArrayArrayArray12[local40][local98][local77] & 0xFF;
						if (local164 > 0) {
							@Pc(174) Class234 local174 = this.aClass169_4.method3857(local164 - 1);
							Static451.anIntArray549[local77] -= local174.anInt6270;
							Static373.anIntArray193[local77] -= local174.anInt6281;
							Static244.anIntArray375[local77] -= local174.anInt6280;
							Static243.anIntArray372[local77] -= local174.anInt6276;
							local144 = Static246.anIntArray379[local77]--;
						}
					}
				}
				if (local73 >= 0) {
					local83 = 0;
					local98 = 0;
					local164 = 0;
					@Pc(235) int local235 = 0;
					@Pc(237) int local237 = 0;
					for (@Pc(239) int local239 = -5; local239 < this.anInt5178; local239++) {
						@Pc(245) int local245 = local239 + 5;
						if (local245 < this.anInt5178) {
							local98 += Static373.anIntArray193[local245];
							local164 += Static244.anIntArray375[local245];
							local237 += Static246.anIntArray379[local245];
							local235 += Static243.anIntArray372[local245];
							local83 += Static451.anIntArray549[local245];
						}
						@Pc(287) int local287 = local239 - 5;
						if (local287 >= 0) {
							local83 -= Static451.anIntArray549[local287];
							local164 -= Static244.anIntArray375[local287];
							local237 -= Static246.anIntArray379[local287];
							local235 -= Static243.anIntArray372[local287];
							local98 -= Static373.anIntArray193[local287];
						}
						if (local239 >= 0 && local235 > 0 && local237 > 0) {
							local11[local73][local239] = Static210.method3263(local164 / local237, local83 * 256 / local235, local98 / local237);
						}
					}
				}
			}
			if (Static271.aBoolean334) {
				this.method4527(Static420.aClass84Array4[local40], local11, local40 == 0 ? arg0 : null, local40 == 0 ? arg1 : null, local40, arg2);
			} else {
				this.method4536(local40 == 0 ? arg1 : null, arg2, Static420.aClass84Array4[local40], local11, local40 == 0 ? arg0 : null, local40);
			}
			this.aByteArrayArrayArray12[local40] = null;
			this.aByteArrayArrayArray14[local40] = null;
			this.aByteArrayArrayArray16[local40] = null;
			this.aByteArrayArrayArray11[local40] = null;
		}
		if (!this.aBoolean359) {
			if (Static314.anInt7070 != 0) {
				Static124.method3213();
			}
			if (Static63.aBoolean112) {
				Static4.method29();
			}
		}
		for (local73 = 0; local73 < this.anInt5181; local73++) {
			Static420.aClass84Array4[local73].method5320();
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!fo;ILclient!qq;Lclient!fo;[[ILclient!fo;I)V")
	private void method4536(@OriginalArg(0) Class84 arg0, @OriginalArg(2) Class28 arg1, @OriginalArg(3) Class84 arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) Class84 arg4, @OriginalArg(6) int arg5) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt5176; local13++) {
			for (@Pc(17) int local17 = 0; local17 < this.anInt5178; local17++) {
				if (Static255.anInt4370 == -1 || Static418.method5687(local13, local17, arg5, Static255.anInt4370)) {
					@Pc(40) byte local40 = this.aByteArrayArrayArray16[arg5][local13][local17];
					@Pc(49) byte local49 = this.aByteArrayArrayArray11[arg5][local13][local17];
					@Pc(60) int local60 = this.aByteArrayArrayArray14[arg5][local13][local17] & 0xFF;
					@Pc(71) int local71 = this.aByteArrayArrayArray12[arg5][local13][local17] & 0xFF;
					@Pc(86) Class196 local86 = local60 == 0 ? null : this.aClass146_6.method3337(local60 - 1);
					@Pc(101) Class234 local101 = local71 == 0 ? null : this.aClass169_4.method3857(local71 - 1);
					@Pc(103) int local103 = 0;
					@Pc(105) int local105 = 0;
					if (local40 != 0) {
						local105 = local86 == null ? 0 : Static250.anIntArray385[local40];
						local103 = local101 == null ? 0 : Static414.anIntArray597[local40];
					} else if (local86 != null) {
						local105 = Static250.anIntArray385[local40];
					} else if (local101 != null) {
						local103 = Static250.anIntArray385[local40];
					}
					@Pc(143) int local143 = local103 + local105;
					@Pc(145) int local145 = 0;
					if (local143 != 0) {
						@Pc(150) int[] local150 = new int[local143];
						@Pc(153) int[] local153 = new int[local143];
						@Pc(156) int[] local156 = new int[local143];
						@Pc(159) int[] local159 = new int[local143];
						@Pc(161) boolean local161 = false;
						@Pc(186) int local186;
						@Pc(192) int local192;
						if (local86 == null || local86.anInt4968 == -1 && local86.anInt4978 == -1 && local86.anInt4971 == -1) {
							for (local186 = 0; local186 < local105; local186++) {
								local150[local145] = -1;
								local145++;
							}
						} else {
							local186 = arg1.method3481() ? local86.anInt4971 : local86.anInt4976;
							if (Static29.aBoolean33) {
								local186 = -1;
							}
							for (local192 = 0; local192 < local105; local192++) {
								local156[local145] = local186;
								local159[local145] = local86.anInt4965;
								if (local86.anInt4968 == -1) {
									local150[local145] = -1;
								} else {
									local150[local145] = local86.anInt4968;
								}
								if (local86.anInt4978 == -1) {
									local153[local145] = -1;
								} else {
									local161 = true;
									local153[local145] = local86.anInt4978;
								}
								local145++;
							}
							if (!this.aBoolean359 && arg5 == 0) {
								Static130.method2136(local13, local17, local86.anInt4967, local86.anInt4966 * 8, local86.anInt4979);
							}
						}
						if (!local161) {
							local153 = null;
						}
						if (local101 == null) {
							for (local186 = 0; local186 < local103; local186++) {
								local150[local145] = -1;
								local145++;
							}
						} else {
							local186 = local101.anInt6271;
							if (Static29.aBoolean33) {
								local186 = -1;
							}
							for (local192 = 0; local192 < local103; local192++) {
								local156[local145] = local186;
								local159[local145] = local101.anInt6274;
								local150[local145] = arg3[local13][local17];
								if (local153 != null) {
									local153[local145] = -1;
								}
								local145++;
							}
						}
						local186 = this.anIntArray464.length;
						@Pc(348) int[] local348 = new int[local186];
						@Pc(351) int[] local351 = new int[local186];
						@Pc(358) int[] local358 = arg0 == null ? null : new int[local186];
						@Pc(367) int[] local367 = arg0 == null && arg4 == null ? null : new int[local186];
						@Pc(376) int local376;
						@Pc(381) int local381;
						@Pc(465) int local465;
						@Pc(471) int local471;
						for (@Pc(369) int local369 = 0; local369 < local186; local369++) {
							local376 = this.anIntArray464[local369];
							local381 = this.anIntArray465[local369];
							if (local49 == 0) {
								local348[local369] = local376;
								local351[local369] = local381;
							} else if (local49 == 1) {
								local348[local369] = local381;
								local351[local369] = 128 - local376;
							} else if (local49 == 2) {
								local348[local369] = 128 - local376;
								local351[local369] = 128 - local381;
							} else if (local49 == 3) {
								local348[local369] = 128 - local381;
								local351[local369] = local376;
							}
							if (local358 != null && Static16.aBooleanArrayArray1[local40][local369]) {
								local465 = (local13 << 7) + local376;
								local471 = local376 + (local17 << 7);
								local358[local369] = arg0.method5334(local465, local471) - arg2.method5334(local465, local471);
							}
							if (local367 != null) {
								if (arg0 != null && !Static16.aBooleanArrayArray1[local40][local369]) {
									local465 = local376 + (local13 << 7);
									local471 = local376 + (local17 << 7);
									local367[local369] = arg2.method5334(local465, local471) - arg0.method5334(local465, local471);
								} else if (arg4 != null && !Static128.aBooleanArrayArray4[local40][local369]) {
									local465 = local376 + (local13 << 7);
									local471 = local376 + (local17 << 7);
									local367[local369] = arg4.method5334(local465, local471) - arg2.method5334(local465, local471);
								}
							}
						}
						local376 = arg2.method5322(local13, local17);
						local381 = arg2.method5322(local13 + 1, local17);
						local465 = arg2.method5322(local13 + 1, local17 + 1);
						local471 = arg2.method5322(local13, local17 + 1);
						if (arg5 > 0) {
							@Pc(592) boolean local592 = true;
							if (local71 == 0 && local40 != 0) {
								local592 = false;
							}
							if (local60 > 0 && local86 != null && !local86.aBoolean352) {
								local592 = false;
							}
							if (local592 && local376 == local381 && local376 == local465 && local471 == local376) {
								this.aByteArrayArrayArray15[arg5][local13][local17] = (byte) (this.aByteArrayArrayArray15[arg5][local13][local17] | 0x4);
							}
						}
						@Pc(643) int local643 = 0;
						@Pc(645) int local645 = 0;
						@Pc(647) int local647 = 0;
						if (this.aBoolean359) {
							local643 = Static156.method2608(local13, local17);
							local645 = Static123.method2002(local13, local17);
							local647 = Static364.method5133(local13, local17);
						}
						arg2.method5328(local13, local17, local348, local358, local351, local367, Static355.anIntArrayArray55[local40], Static295.anIntArrayArray43[local40], Static59.anIntArrayArray9[local40], local150, local153, local156, local159, local643, local645, local647);
						Static304.method4403(arg5, local13, local17);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IZILclient!ha;IIIIIII)V")
	private void method4537(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class6_Sub15 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg7 == 1) {
			arg0 = 1;
		} else if (arg7 == 2) {
			arg0 = 1;
			arg5 = 1;
		} else if (arg7 == 3) {
			arg5 = 1;
		}
		@Pc(61) int local61;
		if (arg9 < 0 || this.anInt5176 <= arg9 || arg6 < 0 || arg6 >= this.anInt5178) {
			while (true) {
				local61 = arg3.method3111();
				if (local61 == 0) {
					return;
				}
				if (local61 == 1) {
					arg3.method3111();
					return;
				}
				if (local61 <= 49) {
					arg3.method3111();
				}
			}
			return;
		}
		if (!this.aBoolean359 && !arg1) {
			Static179.aByteArrayArrayArray3[arg4][arg9][arg6] = 0;
		}
		while (true) {
			local61 = arg3.method3111();
			if (local61 == 0) {
				if (this.aBoolean359) {
					this.anIntArrayArrayArray6[0][arg5 + arg9][arg6 + arg0] = 0;
					return;
				} else if (arg4 == 0) {
					this.anIntArrayArrayArray6[0][arg9 + arg5][arg6 + arg0] = -Static334.method4752(arg8 + 556238, arg2 + 932731) * 8 << 0;
					return;
				} else {
					this.anIntArrayArrayArray6[arg4][arg5 + arg9][arg6 + arg0] = this.anIntArrayArrayArray6[arg4 - 1][arg9 + arg5][arg0 + arg6] - 240;
					return;
				}
			}
			if (local61 == 1) {
				@Pc(193) int local193 = arg3.method3111();
				if (this.aBoolean359) {
					this.anIntArrayArrayArray6[0][arg9 + arg5][arg0 + arg6] = local193 * 8 << 0;
					return;
				}
				if (local193 == 1) {
					local193 = 0;
				}
				if (arg4 != 0) {
					this.anIntArrayArrayArray6[arg4][arg5 + arg9][arg6 + arg0] = this.anIntArrayArrayArray6[arg4 - 1][arg9 + arg5][arg6 + arg0] - (local193 * 8 << 0);
					return;
				}
				this.anIntArrayArrayArray6[0][arg9 + arg5][arg0 + arg6] = -local193 * 8 << 0;
				return;
			}
			if (local61 <= 49) {
				if (arg1) {
					arg3.method3111();
				} else {
					this.aByteArrayArrayArray14[arg4][arg9][arg6] = arg3.method3116();
					this.aByteArrayArrayArray16[arg4][arg9][arg6] = (byte) ((local61 - 2) / 4);
					this.aByteArrayArrayArray11[arg4][arg9][arg6] = (byte) (local61 + arg7 - 2 & 0x3);
				}
			} else if (local61 <= 81) {
				if (!this.aBoolean359 && !arg1) {
					Static179.aByteArrayArrayArray3[arg4][arg9][arg6] = (byte) (local61 - 49);
				}
			} else if (!arg1) {
				this.aByteArrayArrayArray12[arg4][arg9][arg6] = (byte) (local61 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I[[IB)V")
	public final void method4538(@OriginalArg(1) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray6[0];
		for (@Pc(18) int local18 = 0; local18 < this.anInt5176 + 1; local18++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt5178 + 1; local22++) {
				local10[local18][local22] += arg0[local18][local22];
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIIII)V")
	public final void method4540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(19) int local19;
		for (@Pc(15) int local15 = arg4; local15 < arg4 + arg1; local15++) {
			for (local19 = arg0; local19 < arg0 + arg3; local19++) {
				if (local19 >= 0 && this.anInt5176 > local19 && local15 >= 0 && local15 < this.anInt5178) {
					this.anIntArrayArrayArray6[arg2][local19][local15] = arg2 <= 0 ? 0 : this.anIntArrayArrayArray6[arg2 - 1][local19][local15] - 240;
				}
			}
		}
		if (arg0 > 0 && arg0 < this.anInt5176) {
			for (local19 = arg4 + 1; local19 < arg1 + arg4; local19++) {
				if (local19 >= 0 && local19 < this.anInt5178) {
					this.anIntArrayArrayArray6[arg2][arg0][local19] = this.anIntArrayArrayArray6[arg2][arg0 - 1][local19];
				}
			}
		}
		if (arg4 > 0 && this.anInt5178 > arg4) {
			for (local19 = arg0 + 1; local19 < arg3 + arg0; local19++) {
				if (local19 >= 0 && local19 < this.anInt5176) {
					this.anIntArrayArrayArray6[arg2][local19][arg4] = this.anIntArrayArrayArray6[arg2][local19][arg4 - 1];
				}
			}
		}
		if (arg0 < 0 || arg4 < 0 || arg0 >= this.anInt5176 || arg4 >= this.anInt5178) {
			return;
		}
		if (arg2 != 0) {
			if (arg0 > 0 && this.anIntArrayArrayArray6[arg2][arg0 - 1][arg4] != this.anIntArrayArrayArray6[arg2 - 1][arg0 - 1][arg4]) {
				this.anIntArrayArrayArray6[arg2][arg0][arg4] = this.anIntArrayArrayArray6[arg2][arg0 - 1][arg4];
				return;
			}
			if (arg4 > 0 && this.anIntArrayArrayArray6[arg2 - 1][arg0][arg4 - 1] != this.anIntArrayArrayArray6[arg2][arg0][arg4 - 1]) {
				this.anIntArrayArrayArray6[arg2][arg0][arg4] = this.anIntArrayArrayArray6[arg2][arg0][arg4 - 1];
				return;
			}
			if (arg0 > 0 && arg4 > 0 && this.anIntArrayArrayArray6[arg2 - 1][arg0 - 1][arg4 - 1] != this.anIntArrayArrayArray6[arg2][arg0 - 1][arg4 - 1]) {
				this.anIntArrayArrayArray6[arg2][arg0][arg4] = this.anIntArrayArrayArray6[arg2][arg0 - 1][arg4 - 1];
				return;
			}
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray6[arg2][arg0 - 1][arg4] != 0) {
			this.anIntArrayArrayArray6[arg2][arg0][arg4] = this.anIntArrayArrayArray6[arg2][arg0 - 1][arg4];
			return;
		}
		if (arg4 > 0 && this.anIntArrayArrayArray6[arg2][arg0][arg4 - 1] != 0) {
			this.anIntArrayArrayArray6[arg2][arg0][arg4] = this.anIntArrayArrayArray6[arg2][arg0][arg4 - 1];
			return;
		}
		if (arg0 > 0 && arg4 > 0 && this.anIntArrayArrayArray6[arg2][arg0 - 1][arg4 - 1] != 0) {
			this.anIntArrayArrayArray6[arg2][arg0][arg4] = this.anIntArrayArrayArray6[arg2][arg0 - 1][arg4 - 1];
			return;
		}
	}
}
