import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public class Class33 {

	@OriginalMember(owner = "client!tb", name = "x", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "[I")
	private final int[] anIntArray54 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!tb", name = "G", descriptor = "[I")
	private final int[] anIntArray56 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
	protected final int anInt1245;

	@OriginalMember(owner = "client!tb", name = "y", descriptor = "Lclient!uk;")
	private final Class245 aClass245_3;

	@OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
	public final int anInt1247;

	@OriginalMember(owner = "client!tb", name = "w", descriptor = "Z")
	public final boolean aBoolean106;

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
	protected final int anInt1244;

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "Lclient!u;")
	private final Class239 aClass239_2;

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!tb", name = "E", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!tb", name = "D", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!tb", name = "z", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(IIIZLclient!uk;Lclient!u;)V")
	protected Class33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class245 arg4, @OriginalArg(5) Class239 arg5) {
		this.anInt1245 = arg2;
		this.aClass245_3 = arg4;
		this.anInt1247 = arg0;
		this.aBoolean106 = arg3;
		this.anInt1244 = arg1;
		this.aClass239_2 = arg5;
		this.anIntArrayArrayArray2 = new int[this.anInt1247][this.anInt1244 + 1][this.anInt1245 + 1];
		this.aByteArrayArrayArray12 = new byte[this.anInt1247][this.anInt1244][this.anInt1245];
		this.aByteArrayArrayArray8 = new byte[this.anInt1247][this.anInt1244][this.anInt1245];
		this.aByteArrayArrayArray7 = new byte[this.anInt1247][this.anInt1244][this.anInt1245];
		this.aByteArrayArrayArray11 = new byte[this.anInt1247][this.anInt1244 + 1][this.anInt1245 + 1];
		this.aByteArrayArrayArray10 = new byte[this.anInt1247][this.anInt1244][this.anInt1245];
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII[Lclient!cl;IIIILclient!md;)V")
	public final void method906(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class37[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class2_Sub20 arg8) {
		@Pc(11) int local11 = (arg5 & 0x7) * 8;
		@Pc(20) int local20;
		@Pc(51) int local51;
		if (!this.aBoolean106) {
			@Pc(18) Class37 local18 = arg3[arg2];
			for (local20 = 0; local20 < 8; local20++) {
				for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
					@Pc(38) int local38 = arg6 + Static91.method1528(local20 & 0x7, arg4, local24 & 0x7);
					local51 = arg1 + Static268.method4009(local24 & 0x7, arg4, local20 & 0x7);
					if (local38 > 0 && this.anInt1244 - 1 > local38 && local51 > 0 && local51 < this.anInt1245 - 1) {
						local18.method1062(local51, local38);
					}
				}
			}
		}
		@Pc(93) int local93 = (arg0 & 0x7) * 8;
		@Pc(99) int local99 = (arg5 & 0xFFFFFFF8) << 3;
		local20 = (arg0 & 0x1FFFFFF8) << 3;
		@Pc(107) byte local107 = 0;
		@Pc(109) byte local109 = 0;
		if (arg4 == 1) {
			local109 = 1;
		} else if (arg4 == 2) {
			local107 = 1;
			local109 = 1;
		} else if (arg4 == 3) {
			local107 = 1;
		}
		for (local51 = 0; local51 < this.anInt1247; local51++) {
			for (@Pc(140) int local140 = 0; local140 < 64; local140++) {
				for (@Pc(144) int local144 = 0; local144 < 64; local144++) {
					if (local51 == arg7 && local140 >= local11 && local11 + 8 >= local140 && local93 <= local144 && local144 <= local93 + 8) {
						@Pc(200) int local200;
						@Pc(207) int local207;
						if (local11 + 8 == local140 || local93 + 8 == local144) {
							if (arg4 == 0) {
								local200 = local140 + arg6 - local11;
								local207 = local144 + arg1 - local93;
							} else if (arg4 == 1) {
								local200 = local144 + arg6 - local93;
								local207 = local11 + arg1 + 8 - local140;
							} else if (arg4 == 2) {
								local200 = arg6 + local11 + 8 - local140;
								local207 = local93 + arg1 + 8 - local144;
							} else {
								local207 = arg1 + local140 - local11;
								local200 = arg6 + local93 + 8 - local144;
							}
							this.method915(arg8, 0, local144 + local20, local200, true, 0, local140 + local99, arg2, local207, 0);
						} else {
							local200 = arg6 + Static91.method1528(local140 & 0x7, arg4, local144 & 0x7);
							local207 = arg1 + Static268.method4009(local144 & 0x7, arg4, local140 & 0x7);
							this.method915(arg8, local109, local144 + local20, local200, false, local107, local99 + local140, arg2, local207, arg4);
							if (local140 == 63 || local144 == 63) {
								@Pc(350) int local350 = local140 == 63 ? 64 : local140;
								@Pc(359) int local359 = local144 == 63 ? 64 : local144;
								@Pc(374) int local374;
								@Pc(368) int local368;
								if (arg4 == 0) {
									local368 = local359 + arg1 - local93;
									local374 = local350 + arg6 - local11;
								} else if (arg4 == 1) {
									local368 = arg1 + local11 + 8 - local350;
									local374 = arg6 + local359 - local93;
								} else if (arg4 == 2) {
									local374 = local11 + arg6 + 8 - local350;
									local368 = local93 + arg1 + 8 - local359;
								} else {
									local374 = arg6 + local93 + 8 - local359;
									local368 = arg1 + local350 - local11;
								}
								if (local374 >= 0 && this.anInt1244 > local374 && local368 >= 0 && local368 < this.anInt1245) {
									this.anIntArrayArrayArray2[arg2][local374][local368] = this.anIntArrayArrayArray2[arg2][local200 + local107][local207 + local109];
								}
							}
						}
					} else {
						this.method915(arg8, 0, 0, -1, false, 0, 0, 0, -1, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[[II)V")
	public final void method908(@OriginalArg(1) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray2[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt1244 + 1; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt1245 + 1; local16++) {
				local10[local12][local16] += arg0[local12][local16];
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!na;BLclient!na;[[ILclient!qa;Lclient!na;)V")
	private void method909(@OriginalArg(0) int arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(3) Class106 arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) Class26 arg4, @OriginalArg(6) Class106 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray10[arg0];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray12[arg0];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray8[arg0];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray7[arg0];
		for (@Pc(27) int local27 = 0; local27 < this.anInt1244; local27++) {
			@Pc(45) int local45 = this.anInt1244 - 1 <= local27 ? local27 : local27 + 1;
			for (@Pc(47) int local47 = 0; local47 < this.anInt1245; local47++) {
				@Pc(61) int local61 = this.anInt1245 - 1 > local47 ? local47 + 1 : local47;
				if (Static331.anInt5893 == -1 || Static330.method4706(arg0, local47, local27, Static331.anInt5893)) {
					@Pc(75) boolean local75 = false;
					@Pc(77) boolean local77 = false;
					@Pc(80) boolean[] local80 = new boolean[4];
					@Pc(86) int local86 = local10[local27][local47];
					@Pc(92) int local92 = local15[local27][local47];
					@Pc(100) int local100 = local25[local27][local47] & 0xFF;
					@Pc(108) int local108 = local20[local27][local47] & 0xFF;
					@Pc(116) int local116 = local20[local27][local61] & 0xFF;
					@Pc(124) int local124 = local20[local45][local61] & 0xFF;
					@Pc(132) int local132 = local20[local45][local47] & 0xFF;
					if (local100 != 0 || local108 != 0) {
						@Pc(151) Class54 local151 = local100 == 0 ? null : this.aClass245_3.method5500(local100 - 1);
						if (local86 == 0 && local151 == null) {
							local86 = 12;
						}
						@Pc(172) Class111 local172 = local108 == 0 ? null : this.aClass239_2.method5402(local108 - 1);
						@Pc(174) Class54 local174 = local151;
						if (local151 != null) {
							if (local151.anInt1919 == -1 && local151.anInt1918 == -1) {
								local174 = local151;
								local151 = null;
							} else if (local172 != null && local86 != 0) {
								local77 = local151.aBoolean173;
							}
						}
						@Pc(244) int local244;
						@Pc(297) int local297;
						@Pc(370) int local370;
						@Pc(382) int local382;
						if ((local86 == 0 || local86 == 12) && local27 > 0 && local47 > 0 && this.anInt1244 > local27 && local47 < this.anInt1245) {
							local244 = local20[local27 - 1][local47 - 1] == local108 ? 1 : -1;
							@Pc(261) int local261 = local20[local45][local47 - 1] == local108 ? 1 : -1;
							@Pc(278) int local278 = local20[local45][local61] == local108 ? 1 : -1;
							local297 = local108 == local20[local27 - 1][local61] ? 1 : -1;
							if (local108 == local20[local27][local47 - 1]) {
								local244++;
								local261++;
							} else {
								local244--;
								local261--;
							}
							if (local108 == local20[local45][local47]) {
								local278++;
								local261++;
							} else {
								local278--;
								local261--;
							}
							if (local20[local27][local61] == local108) {
								local297++;
								local278++;
							} else {
								local297--;
								local278--;
							}
							if (local20[local27 - 1][local47] == local108) {
								local244++;
								local297++;
							} else {
								local244--;
								local297--;
							}
							local370 = local244 - local278;
							if (local370 < 0) {
								local370 = -local370;
							}
							local382 = local261 - local297;
							if (local382 < 0) {
								local382 = -local382;
							}
							if (local382 == local370) {
								local370 = arg2.I(local27, local47) - arg2.I(local45, local61);
								if (local370 < 0) {
									local370 = -local370;
								}
								local382 = arg2.I(local45, local47) - arg2.I(local27, local61);
								if (local382 < 0) {
									local382 = -local382;
								}
							}
							local92 = local370 >= local382 ? 0 : 1;
						}
						for (local244 = 0; local244 < 13; local244++) {
							Static423.anIntArray495[local244] = -1;
							Static399.anIntArray463[local244] = 1;
						}
						@Pc(467) boolean[] local467 = local151 != null && local151.aBoolean173 ? Static282.aBooleanArrayArray6[local86] : Static42.aBooleanArrayArray2[local86];
						this.method919(local27, local10, local172, local86, local25, local151, arg4, local80, local92, this.anInt1244, local47, this.anInt1245, local15);
						@Pc(500) boolean local500 = local151 != null && local151.anInt1919 != local151.anInt1918;
						if (!local500) {
							for (local297 = 0; local297 < 8; local297++) {
								if (Static423.anIntArray495[local297] >= 0 && Static179.anIntArray435[local297] != Static273.anIntArray337[local297]) {
									local500 = true;
									break;
								}
							}
						}
						if (!local467[local92 + 1 & 0x3]) {
							local80[1] = Static172.method2653(local80[1], (Static399.anIntArray463[2] & Static399.anIntArray463[4]) == 0);
						}
						if (!local467[local92 + 3 & 0x3]) {
							local80[3] = Static172.method2653(local80[3], (Static399.anIntArray463[6] & Static399.anIntArray463[0]) == 0);
						}
						if (!local467[local92 & 0x3]) {
							local80[0] = Static172.method2653(local80[0], (Static399.anIntArray463[0] & Static399.anIntArray463[2]) == 0);
						}
						if (!local467[local92 + 2 & 0x3]) {
							local80[2] = Static172.method2653(local80[2], (Static399.anIntArray463[6] & Static399.anIntArray463[4]) == 0);
						}
						if (!local77 && (local86 == 0 || local86 == 12)) {
							if (local80[0] && !local80[1] && !local80[2] && local80[3]) {
								local80[0] = local80[3] = false;
								local92 = 0;
								local86 = local86 == 0 ? 13 : 14;
							} else if (local80[0] && local80[1] && !local80[2] && !local80[3]) {
								local86 = local86 == 0 ? 13 : 14;
								local80[0] = local80[1] = false;
								local92 = 3;
							} else if (!local80[0] && local80[1] && local80[2] && !local80[3]) {
								local86 = local86 == 0 ? 13 : 14;
								local80[1] = local80[2] = false;
								local92 = 2;
							} else if (!local80[0] && !local80[1] && local80[2] && local80[3]) {
								local80[2] = local80[3] = false;
								local86 = local86 == 0 ? 13 : 14;
								local92 = 1;
							}
						}
						@Pc(820) boolean local820 = !local77 && !local80[0] && !local80[2] && !local80[1] && !local80[3];
						@Pc(822) int[] local822 = null;
						@Pc(830) int[] local830;
						@Pc(846) int[] local846;
						@Pc(842) int[] local842;
						if (local820) {
							local846 = Static409.anIntArrayArray54[local86];
							local370 = local172 == null ? 0 : Static351.anIntArray417[local86];
							local382 = local151 == null ? 0 : Static217.anIntArray30[local86];
							local842 = Static61.anIntArrayArray7[local86];
							local830 = Static213.anIntArrayArray31[local86];
						} else if (local77) {
							local382 = local151 == null ? 0 : Static194.anIntArray253[local86];
							local842 = Static378.anIntArrayArray49[local86];
							local830 = Static170.anIntArrayArray27[local86];
							local846 = Static227.anIntArrayArray36[local86];
							local822 = Static438.anIntArrayArray61[local86];
							local370 = local172 == null ? 0 : Static301.anIntArray359[local86];
						} else {
							local830 = Static162.anIntArrayArray26[local86];
							local382 = local151 == null ? 0 : Static399.anIntArray462[local86];
							local842 = Static424.anIntArrayArray59[local86];
							local846 = Static299.anIntArrayArray43[local86];
							local370 = local172 == null ? 0 : Static54.anIntArray65[local86];
							local822 = Static82.anIntArrayArray10[local86];
						}
						@Pc(924) int local924 = local370 + local382;
						if (local924 <= 0) {
							Static389.method5365(arg0, local27, local47);
						} else {
							if (local80[0]) {
								local924++;
							}
							if (local80[2]) {
								local924++;
							}
							if (local80[1]) {
								local924++;
							}
							if (local80[3]) {
								local924++;
							}
							@Pc(954) int local954 = 0;
							@Pc(956) int local956 = 0;
							@Pc(960) int local960 = local924 * 3;
							@Pc(967) int[] local967 = local500 ? new int[local960] : null;
							@Pc(970) int[] local970 = new int[local960];
							@Pc(973) int[] local973 = new int[local960];
							@Pc(976) int[] local976 = new int[local960];
							@Pc(979) int[] local979 = new int[local960];
							@Pc(982) int[] local982 = new int[local960];
							@Pc(989) int[] local989 = arg5 == null ? null : new int[local960];
							@Pc(998) int[] local998 = arg5 == null && arg1 == null ? null : new int[local960];
							@Pc(1000) int local1000 = -1;
							@Pc(1002) int local1002 = -1;
							@Pc(1004) int local1004 = 256;
							@Pc(1110) byte local1110;
							@Pc(1054) int local1054;
							@Pc(1056) int local1056;
							@Pc(1297) int local1297;
							@Pc(1303) int local1303;
							@Pc(1312) int local1312;
							@Pc(1317) int local1317;
							@Pc(1338) int local1338;
							@Pc(1322) int local1322;
							@Pc(1340) int local1340;
							@Pc(1388) int local1388;
							@Pc(1394) int local1394;
							if (local151 != null) {
								local1000 = local151.anInt1919;
								local1002 = arg4.method2261() ? local151.anInt1910 : local151.anInt1926;
								local1004 = local151.anInt1912;
								local1054 = Static34.method445(arg4, local151);
								for (local1056 = 0; local1056 < local382; local1056++) {
									if (local80[-local92 & 0x3] && local954 == local822[0]) {
										Static325.anIntArray377[0] = local830[local954];
										Static325.anIntArray377[1] = 1;
										Static325.anIntArray377[2] = local842[local954];
										Static325.anIntArray377[3] = 1;
										Static325.anIntArray377[4] = local846[local954];
										Static325.anIntArray377[5] = local842[local954];
										local1110 = 6;
									} else if (local80[2 - local92 & 0x3] && local822[2] == local954) {
										Static325.anIntArray377[0] = local830[local954];
										Static325.anIntArray377[1] = 5;
										Static325.anIntArray377[2] = local842[local954];
										Static325.anIntArray377[3] = 5;
										Static325.anIntArray377[4] = local846[local954];
										local1110 = 6;
										Static325.anIntArray377[5] = local842[local954];
									} else if (local80[1 - local92 & 0x3] && local822[1] == local954) {
										Static325.anIntArray377[0] = local830[local954];
										Static325.anIntArray377[1] = 3;
										Static325.anIntArray377[2] = local842[local954];
										Static325.anIntArray377[3] = 3;
										Static325.anIntArray377[4] = local846[local954];
										Static325.anIntArray377[5] = local842[local954];
										local1110 = 6;
									} else if (local80[3 - local92 & 0x3] && local822[3] == local954) {
										Static325.anIntArray377[0] = local830[local954];
										Static325.anIntArray377[1] = 7;
										Static325.anIntArray377[2] = local842[local954];
										Static325.anIntArray377[3] = 7;
										Static325.anIntArray377[4] = local846[local954];
										Static325.anIntArray377[5] = local842[local954];
										local1110 = 6;
									} else {
										Static325.anIntArray377[0] = local830[local954];
										Static325.anIntArray377[1] = local846[local954];
										Static325.anIntArray377[2] = local842[local954];
										local1110 = 3;
									}
									local954++;
									for (local1297 = 0; local1297 < local1110; local1297++) {
										local1303 = Static325.anIntArray377[local1297];
										local1312 = local1303 - local92 * 2 & 0x7;
										local1317 = this.anIntArray56[local1303];
										local1322 = this.anIntArray54[local1303];
										if (local92 == 1) {
											local1340 = 128 - local1317;
											local1338 = local1322;
										} else if (local92 == 2) {
											local1338 = 128 - local1317;
											local1340 = 128 - local1322;
										} else if (local92 == 3) {
											local1338 = 128 - local1322;
											local1340 = local1317;
										} else {
											local1338 = local1317;
											local1340 = local1322;
										}
										local970[local956] = local1338;
										local973[local956] = local1340;
										if (local989 != null && Static87.aBooleanArrayArray3[local86][local1303]) {
											local1388 = local1338 + (local27 << 7);
											local1394 = local1340 + (local47 << 7);
											local989[local956] = arg5.va(local1388, local1394) - arg2.va(local1388, local1394);
										}
										if (local998 != null) {
											if (arg5 != null && !Static87.aBooleanArrayArray3[local86][local1303]) {
												local1388 = (local27 << 7) + local1338;
												local1394 = local1340 + (local47 << 7);
												local998[local956] = arg2.va(local1388, local1394) - arg5.va(local1388, local1394);
											} else if (arg1 != null && !Static449.aBooleanArrayArray5[local86][local1303]) {
												local1388 = local1338 + (local27 << 7);
												local1394 = (local47 << 7) + local1340;
												local998[local956] = arg1.va(local1388, local1394) - arg2.va(local1388, local1394);
											}
										}
										if (local1303 < 8 && local151.anInt1920 < Static423.anIntArray495[local1312]) {
											if (local967 != null) {
												local967[local956] = Static179.anIntArray435[local1312];
											}
											local982[local956] = Static385.anIntArray455[local1312];
											local979[local956] = Static379.anIntArray448[local1312];
											local976[local956] = Static273.anIntArray337[local1312];
										} else {
											if (local967 != null) {
												local967[local956] = local1054;
											}
											local979[local956] = arg4.method2261() ? local151.anInt1910 : local151.anInt1926;
											local982[local956] = local151.anInt1912;
											local976[local956] = local1000;
										}
										local956++;
									}
								}
								if (!this.aBoolean106 && arg0 == 0) {
									Static210.method3243(local27, local47, local151.anInt1923, local151.anInt1909 * 8, local151.anInt1925);
								}
								if (local86 != 12 && local151.anInt1919 != -1 && local151.aBoolean171) {
									local75 = true;
								}
							} else if (local820) {
								local954 = Static217.anIntArray30[local86];
							} else if (local77) {
								local954 = Static194.anIntArray253[local86];
							} else {
								local954 = Static399.anIntArray462[local86];
							}
							if (local172 != null) {
								if (local124 == 0) {
									local124 = local108;
								}
								if (local116 == 0) {
									local116 = local108;
								}
								if (local132 == 0) {
									local132 = local108;
								}
								@Pc(1617) Class111 local1617 = this.aClass239_2.method5402(local108 - 1);
								@Pc(1625) Class111 local1625 = this.aClass239_2.method5402(local116 - 1);
								@Pc(1633) Class111 local1633 = this.aClass239_2.method5402(local124 - 1);
								@Pc(1641) Class111 local1641 = this.aClass239_2.method5402(local132 - 1);
								for (local1312 = 0; local1312 < local370; local1312++) {
									if (local80[-local92 & 0x3] && local822[0] == local954) {
										Static325.anIntArray377[0] = local830[local954];
										Static325.anIntArray377[1] = 1;
										Static325.anIntArray377[2] = local842[local954];
										Static325.anIntArray377[3] = 1;
										Static325.anIntArray377[4] = local846[local954];
										local1110 = 6;
										Static325.anIntArray377[5] = local842[local954];
									} else if (local80[2 - local92 & 0x3] && local822[2] == local954) {
										Static325.anIntArray377[0] = local830[local954];
										Static325.anIntArray377[1] = 5;
										Static325.anIntArray377[2] = local842[local954];
										Static325.anIntArray377[3] = 5;
										Static325.anIntArray377[4] = local846[local954];
										Static325.anIntArray377[5] = local842[local954];
										local1110 = 6;
									} else if (local80[1 - local92 & 0x3] && local954 == local822[1]) {
										Static325.anIntArray377[0] = local830[local954];
										Static325.anIntArray377[1] = 3;
										Static325.anIntArray377[2] = local842[local954];
										Static325.anIntArray377[3] = 3;
										Static325.anIntArray377[4] = local846[local954];
										Static325.anIntArray377[5] = local842[local954];
										local1110 = 6;
									} else if (local80[3 - local92 & 0x3] && local954 == local822[3]) {
										Static325.anIntArray377[0] = local830[local954];
										Static325.anIntArray377[1] = 7;
										Static325.anIntArray377[2] = local842[local954];
										Static325.anIntArray377[3] = 7;
										Static325.anIntArray377[4] = local846[local954];
										local1110 = 6;
										Static325.anIntArray377[5] = local842[local954];
									} else {
										Static325.anIntArray377[0] = local830[local954];
										Static325.anIntArray377[1] = local846[local954];
										local1110 = 3;
										Static325.anIntArray377[2] = local842[local954];
									}
									local954++;
									for (local1317 = 0; local1317 < local1110; local1317++) {
										local1338 = Static325.anIntArray377[local1317];
										local1322 = local1338 - local92 * 2 & 0x7;
										local1340 = this.anIntArray56[local1338];
										local1394 = this.anIntArray54[local1338];
										@Pc(1919) int local1919;
										if (local92 == 1) {
											local1919 = 128 - local1340;
											local1388 = local1394;
										} else if (local92 == 2) {
											local1388 = 128 - local1340;
											local1919 = 128 - local1394;
										} else if (local92 == 3) {
											local1388 = 128 - local1394;
											local1919 = local1340;
										} else {
											local1388 = local1340;
											local1919 = local1394;
										}
										local970[local956] = local1388;
										local973[local956] = local1919;
										@Pc(1968) int local1968;
										@Pc(1974) int local1974;
										if (local989 != null && Static87.aBooleanArrayArray3[local86][local1338]) {
											local1968 = local1388 + (local27 << 7);
											local1974 = (local47 << 7) + local1919;
											local989[local956] = arg5.va(local1968, local1974) - arg2.va(local1968, local1974);
										}
										if (local998 != null) {
											if (arg5 != null && !Static87.aBooleanArrayArray3[local86][local1338]) {
												local1968 = (local27 << 7) + local1388;
												local1974 = (local47 << 7) + local1919;
												local998[local956] = arg2.va(local1968, local1974) - arg5.va(local1968, local1974);
											} else if (arg1 != null && !Static449.aBooleanArrayArray5[local86][local1338]) {
												local1968 = (local27 << 7) + local1388;
												local1974 = local1919 + (local47 << 7);
												local998[local956] = arg1.va(local1968, local1974) - arg2.va(local1968, local1974);
											}
										}
										if (local1338 < 8 && Static423.anIntArray495[local1322] >= 0) {
											if (local967 != null) {
												local967[local956] = Static179.anIntArray435[local1322];
											}
											local982[local956] = Static385.anIntArray455[local1322];
											local979[local956] = Static379.anIntArray448[local1322];
											local976[local956] = Static273.anIntArray337[local1322];
										} else {
											if (local77 && Static87.aBooleanArrayArray3[local86][local1338]) {
												local979[local956] = local1002;
												local982[local956] = local1004;
												local976[local956] = local1000;
											} else if (local1388 == 0 && local1919 == 0) {
												local976[local956] = arg3[local27][local47];
												local979[local956] = local1617.anInt3128;
												local982[local956] = local1617.anInt3139;
											} else if (local1388 == 0 && local1919 == 128) {
												local976[local956] = arg3[local27][local61];
												local979[local956] = local1625.anInt3128;
												local982[local956] = local1625.anInt3139;
											} else if (local1388 == 128 && local1919 == 128) {
												local976[local956] = arg3[local45][local61];
												local979[local956] = local1633.anInt3128;
												local982[local956] = local1633.anInt3139;
											} else if (local1388 == 128 && local1919 == 0) {
												local976[local956] = arg3[local45][local47];
												local979[local956] = local1641.anInt3128;
												local982[local956] = local1641.anInt3139;
											} else {
												if (local1388 < 64) {
													if (local1919 >= 64) {
														local979[local956] = local1625.anInt3128;
														local982[local956] = local1625.anInt3139;
													} else {
														local979[local956] = local1617.anInt3128;
														local982[local956] = local1617.anInt3139;
													}
												} else if (local1919 >= 64) {
													local979[local956] = local1633.anInt3128;
													local982[local956] = local1633.anInt3139;
												} else {
													local979[local956] = local1641.anInt3128;
													local982[local956] = local1641.anInt3139;
												}
												local1968 = Static52.method5824(local1388 << 7 >> 7, arg3[local27][local47], arg3[local45][local47]);
												local1974 = Static52.method5824(local1388 << 7 >> 7, arg3[local27][local61], arg3[local45][local61]);
												local976[local956] = Static52.method5824(local1919 << 7 >> 7, local1968, local1974);
											}
											if (local967 != null) {
												local967[local956] = local976[local956];
											}
										}
										local956++;
									}
								}
								if (local86 != 0 && local172.aBoolean269) {
									local75 = true;
								}
							}
							local1054 = arg2.I(local27, local47);
							local1056 = arg2.I(local45, local47);
							local1297 = arg2.I(local45, local61);
							local1303 = arg2.I(local27, local61);
							if (arg0 > 0) {
								@Pc(2383) boolean local2383 = true;
								if (local108 == 0 && local86 != 0) {
									local2383 = false;
								}
								if (local100 > 0 && local174 != null && !local174.aBoolean172) {
									local2383 = false;
								}
								if (local2383 && local1056 == local1054 && local1054 == local1297 && local1303 == local1054) {
									this.aByteArrayArrayArray11[arg0][local27][local47] = (byte) (this.aByteArrayArrayArray11[arg0][local27][local47] | 0x4);
								}
							}
							local1312 = 0;
							local1317 = 0;
							local1338 = 0;
							if (this.aBoolean106) {
								local1312 = Static348.method4895(local27, local47);
								local1317 = Static222.method3420(local27, local47);
								local1338 = Static310.method4420(local27, local47);
							}
							arg2.JA(local27, local47, local970, local989, local973, local998, local976, local967, local979, local982, local1312, local1317, local1338, local75);
							Static389.method5365(arg0, local27, local47);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!na;IILclient!qa;Lclient!na;[[ILclient!na;)V")
	private void method912(@OriginalArg(0) Class106 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class26 arg2, @OriginalArg(4) Class106 arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) Class106 arg5) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1244; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt1245; local7++) {
				if (Static331.anInt5893 == -1 || Static330.method4706(arg1, local7, local3, Static331.anInt5893)) {
					@Pc(31) byte local31 = this.aByteArrayArrayArray10[arg1][local3][local7];
					@Pc(40) byte local40 = this.aByteArrayArrayArray12[arg1][local3][local7];
					@Pc(51) int local51 = this.aByteArrayArrayArray7[arg1][local3][local7] & 0xFF;
					@Pc(62) int local62 = this.aByteArrayArrayArray8[arg1][local3][local7] & 0xFF;
					@Pc(74) Class54 local74 = local51 == 0 ? null : this.aClass245_3.method5500(local51 - 1);
					@Pc(89) Class111 local89 = local62 == 0 ? null : this.aClass239_2.method5402(local62 - 1);
					@Pc(91) int local91 = 0;
					@Pc(93) int local93 = 0;
					if (local31 != 0) {
						local91 = local89 == null ? 0 : Static351.anIntArray417[local31];
						local93 = local74 == null ? 0 : Static217.anIntArray30[local31];
					} else if (local74 != null) {
						local93 = Static217.anIntArray30[local31];
					} else if (local89 != null) {
						local91 = Static217.anIntArray30[local31];
					}
					@Pc(131) int local131 = local91 + local93;
					@Pc(133) int local133 = 0;
					if (local131 != 0) {
						@Pc(141) int[] local141 = new int[local131];
						@Pc(144) int[] local144 = new int[local131];
						@Pc(147) int[] local147 = new int[local131];
						@Pc(150) int[] local150 = new int[local131];
						@Pc(152) boolean local152 = false;
						@Pc(170) int local170;
						@Pc(198) int local198;
						if (local74 == null || local74.anInt1919 == -1 && local74.anInt1918 == -1 && local74.anInt1910 == -1) {
							for (local170 = 0; local170 < local93; local170++) {
								local141[local133] = -1;
								local133++;
							}
						} else {
							local170 = arg2.method2261() ? local74.anInt1910 : local74.anInt1926;
							if (Static137.aBoolean236) {
								local170 = -1;
							}
							for (local198 = 0; local198 < local93; local198++) {
								local147[local133] = local170;
								local150[local133] = local74.anInt1912;
								if (local74.anInt1919 == -1) {
									local141[local133] = -1;
								} else {
									local141[local133] = local74.anInt1919;
								}
								if (local74.anInt1918 == -1) {
									local144[local133] = -1;
								} else {
									local144[local133] = local74.anInt1918;
									local152 = true;
								}
								local133++;
							}
							if (!this.aBoolean106 && arg1 == 0) {
								Static210.method3243(local3, local7, local74.anInt1923, local74.anInt1909 * 8, local74.anInt1925);
							}
						}
						if (!local152) {
							local144 = null;
						}
						if (local89 == null) {
							for (local170 = 0; local170 < local91; local170++) {
								local141[local133] = -1;
								local133++;
							}
						} else {
							local170 = local89.anInt3128;
							if (Static137.aBoolean236) {
								local170 = -1;
							}
							for (local198 = 0; local198 < local91; local198++) {
								local147[local133] = local170;
								local150[local133] = local89.anInt3139;
								local141[local133] = arg4[local3][local7];
								if (local144 != null) {
									local144[local133] = -1;
								}
								local133++;
							}
						}
						local170 = this.anIntArray56.length;
						@Pc(336) int[] local336 = new int[local170];
						@Pc(339) int[] local339 = new int[local170];
						@Pc(346) int[] local346 = arg0 == null ? null : new int[local170];
						@Pc(355) int[] local355 = arg0 == null && arg3 == null ? null : new int[local170];
						@Pc(364) int local364;
						@Pc(369) int local369;
						@Pc(450) int local450;
						@Pc(456) int local456;
						for (@Pc(357) int local357 = 0; local357 < local170; local357++) {
							local364 = this.anIntArray56[local357];
							local369 = this.anIntArray54[local357];
							if (local40 == 0) {
								local336[local357] = local364;
								local339[local357] = local369;
							} else if (local40 == 1) {
								local336[local357] = local369;
								local339[local357] = 128 - local364;
							} else if (local40 == 2) {
								local336[local357] = 128 - local364;
								local339[local357] = 128 - local369;
							} else if (local40 == 3) {
								local336[local357] = 128 - local369;
								local339[local357] = local364;
							}
							if (local346 != null && Static87.aBooleanArrayArray3[local31][local357]) {
								local450 = local364 + (local3 << 7);
								local456 = local364 + (local7 << 7);
								local346[local357] = arg0.va(local450, local456) - arg5.va(local450, local456);
							}
							if (local355 != null) {
								if (arg0 != null && !Static87.aBooleanArrayArray3[local31][local357]) {
									local450 = local364 + (local3 << 7);
									local456 = local364 + (local7 << 7);
									local355[local357] = arg5.va(local450, local456) - arg0.va(local450, local456);
								} else if (arg3 != null && !Static449.aBooleanArrayArray5[local31][local357]) {
									local450 = (local3 << 7) + local364;
									local456 = (local7 << 7) + local364;
									local355[local357] = arg3.va(local450, local456) - arg5.va(local450, local456);
								}
							}
						}
						local364 = arg5.I(local3, local7);
						local369 = arg5.I(local3 + 1, local7);
						local450 = arg5.I(local3 + 1, local7 + 1);
						local456 = arg5.I(local3, local7 + 1);
						if (arg1 > 0) {
							@Pc(581) boolean local581 = true;
							if (local62 == 0 && local31 != 0) {
								local581 = false;
							}
							if (local51 > 0 && local74 != null && !local74.aBoolean172) {
								local581 = false;
							}
							if (local581 && local369 == local364 && local364 == local450 && local456 == local364) {
								this.aByteArrayArrayArray11[arg1][local3][local7] = (byte) (this.aByteArrayArrayArray11[arg1][local3][local7] | 0x4);
							}
						}
						@Pc(639) int local639 = 0;
						@Pc(641) int local641 = 0;
						@Pc(643) int local643 = 0;
						if (this.aBoolean106) {
							local639 = Static348.method4895(local3, local7);
							local641 = Static222.method3420(local3, local7);
							local643 = Static310.method4420(local3, local7);
						}
						arg5.method5483(local3, local7, local336, local346, local339, local355, Static213.anIntArrayArray31[local31], Static409.anIntArrayArray54[local31], Static61.anIntArrayArray7[local31], local141, local144, local147, local150, local639, local641, local643);
						Static389.method5365(arg1, local3, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!qa;[Lclient!cl;[[[I)V")
	public final void method913(@OriginalArg(1) Class26 arg0, @OriginalArg(2) Class37[] arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (!this.aBoolean106) {
			for (local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt1244; local10++) {
					for (local14 = 0; local14 < this.anInt1245; local14++) {
						if ((Static367.aByteArrayArrayArray16[local6][local10][local14] & 0x1) != 0) {
							@Pc(31) int local31 = local6;
							if ((Static367.aByteArrayArrayArray16[1][local10][local14] & 0x2) != 0) {
								local31 = local6 - 1;
							}
							if (local31 >= 0) {
								arg1[local31].method1065(local10, local14);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt1247; local6++) {
			local10 = 0;
			local14 = 0;
			if (!this.aBoolean106) {
				if (Static143.aBoolean652) {
					local10 = 2;
				}
				if (Static312.aBoolean256) {
					local14 = 8;
				}
				if (Static190.anInt3752 != 0) {
					local10 |= 0x1;
					if (local6 == 0 | Static106.aBoolean190) {
						local14 |= 0x10;
					}
				}
			}
			if (Static143.aBoolean652) {
				local14 |= 0x7;
			}
			if (!Static22.aBoolean37) {
				local14 |= 0x20;
			}
			@Pc(151) int[][] local151 = arg2 == null || arg2.length <= local6 ? this.anIntArrayArrayArray2[local6] : arg2[local6];
			Static23.method320(local6, arg0.method2280(this.anInt1244, this.anInt1245, this.anIntArrayArrayArray2[local6], local151, local10, local14));
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!na;Lclient!na;BLclient!qa;)V")
	public final void method914(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(3) Class26 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt1244][this.anInt1245];
		if (Static438.anIntArray504 == null || Static438.anIntArray504.length != this.anInt1245) {
			Static438.anIntArray504 = new int[this.anInt1245];
			Static261.anIntArray366 = new int[this.anInt1245];
			Static365.anIntArray430 = new int[this.anInt1245];
			Static228.anIntArray99 = new int[this.anInt1245];
			Static261.anIntArray367 = new int[this.anInt1245];
		}
		@Pc(54) int local54;
		for (@Pc(50) int local50 = 0; local50 < this.anInt1247; local50++) {
			for (local54 = 0; local54 < this.anInt1245; local54++) {
				Static438.anIntArray504[local54] = 0;
				Static261.anIntArray367[local54] = 0;
				Static261.anIntArray366[local54] = 0;
				Static365.anIntArray430[local54] = 0;
				Static228.anIntArray99[local54] = 0;
			}
			for (@Pc(87) int local87 = -5; local87 < this.anInt1244; local87++) {
				@Pc(97) int local97;
				@Pc(116) int local116;
				@Pc(182) int local182;
				for (@Pc(91) int local91 = 0; local91 < this.anInt1245; local91++) {
					local97 = local87 + 5;
					@Pc(162) int local162;
					if (local97 < this.anInt1244) {
						local116 = this.aByteArrayArrayArray8[local50][local97][local91] & 0xFF;
						if (local116 > 0) {
							@Pc(126) Class111 local126 = this.aClass239_2.method5402(local116 - 1);
							Static438.anIntArray504[local91] += local126.anInt3126;
							Static261.anIntArray367[local91] += local126.anInt3132;
							Static261.anIntArray366[local91] += local126.anInt3127;
							Static365.anIntArray430[local91] += local126.anInt3129;
							local162 = Static228.anIntArray99[local91]++;
						}
					}
					local116 = local87 - 5;
					if (local116 >= 0) {
						local182 = this.aByteArrayArrayArray8[local50][local116][local91] & 0xFF;
						if (local182 > 0) {
							@Pc(195) Class111 local195 = this.aClass239_2.method5402(local182 - 1);
							Static438.anIntArray504[local91] -= local195.anInt3126;
							Static261.anIntArray367[local91] -= local195.anInt3132;
							Static261.anIntArray366[local91] -= local195.anInt3127;
							Static365.anIntArray430[local91] -= local195.anInt3129;
							local162 = Static228.anIntArray99[local91]--;
						}
					}
				}
				if (local87 >= 0) {
					local97 = 0;
					local116 = 0;
					local182 = 0;
					@Pc(249) int local249 = 0;
					@Pc(251) int local251 = 0;
					for (@Pc(253) int local253 = -5; local253 < this.anInt1245; local253++) {
						@Pc(259) int local259 = local253 + 5;
						if (local259 < this.anInt1245) {
							local116 += Static261.anIntArray367[local259];
							local251 += Static228.anIntArray99[local259];
							local182 += Static261.anIntArray366[local259];
							local249 += Static365.anIntArray430[local259];
							local97 += Static438.anIntArray504[local259];
						}
						@Pc(301) int local301 = local253 - 5;
						if (local301 >= 0) {
							local116 -= Static261.anIntArray367[local301];
							local251 -= Static228.anIntArray99[local301];
							local182 -= Static261.anIntArray366[local301];
							local249 -= Static365.anIntArray430[local301];
							local97 -= Static438.anIntArray504[local301];
						}
						if (local253 >= 0 && local249 > 0 && local251 > 0) {
							local11[local87][local253] = Static26.method370(local97 * 256 / local249, local182 / local251, local116 / local251);
						}
					}
				}
			}
			if (Static449.aBoolean229) {
				this.method909(local50, local50 == 0 ? arg1 : null, Static372.aClass106Array11[local50], local11, arg2, local50 == 0 ? arg0 : null);
			} else {
				this.method912(local50 == 0 ? arg0 : null, local50, arg2, local50 == 0 ? arg1 : null, local11, Static372.aClass106Array11[local50]);
			}
			this.aByteArrayArrayArray8[local50] = null;
			this.aByteArrayArrayArray7[local50] = null;
			this.aByteArrayArrayArray10[local50] = null;
			this.aByteArrayArrayArray12[local50] = null;
		}
		if (!this.aBoolean106) {
			if (Static190.anInt3752 != 0) {
				Static429.method5789();
			}
			if (Static143.aBoolean652) {
				Static387.method5353();
			}
		}
		for (local54 = 0; local54 < this.anInt1247; local54++) {
			Static372.aClass106Array11[local54].f();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!md;IIIZIIIIII)V")
	private void method915(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg9 == 1) {
			arg1 = 1;
		} else if (arg9 == 2) {
			arg5 = 1;
			arg1 = 1;
		} else if (arg9 == 3) {
			arg5 = 1;
		}
		@Pc(71) int local71;
		if (arg3 < 0 || this.anInt1244 <= arg3 || arg8 < 0 || arg8 >= this.anInt1245) {
			while (true) {
				local71 = arg0.method3737();
				if (local71 == 0) {
					return;
				}
				if (local71 == 1) {
					arg0.method3737();
					return;
				}
				if (local71 <= 49) {
					arg0.method3737();
				}
			}
			return;
		}
		if (!this.aBoolean106 && !arg4) {
			Static367.aByteArrayArrayArray16[arg7][arg3][arg8] = 0;
		}
		while (true) {
			local71 = arg0.method3737();
			if (local71 == 0) {
				if (this.aBoolean106) {
					this.anIntArrayArrayArray2[0][arg5 + arg3][arg8 + arg1] = 0;
					return;
				} else if (arg7 == 0) {
					this.anIntArrayArrayArray2[0][arg3 + arg5][arg8 + arg1] = -Static96.method1603(arg2 + 556238, arg6 + 932731) * 8 << 0;
					return;
				} else {
					this.anIntArrayArrayArray2[arg7][arg5 + arg3][arg8 + arg1] = this.anIntArrayArrayArray2[arg7 - 1][arg3 + arg5][arg1 + arg8] - 240;
					return;
				}
			}
			if (local71 == 1) {
				@Pc(166) int local166 = arg0.method3737();
				if (!this.aBoolean106) {
					if (local166 == 1) {
						local166 = 0;
					}
					if (arg7 != 0) {
						this.anIntArrayArrayArray2[arg7][arg5 + arg3][arg8 + arg1] = this.anIntArrayArrayArray2[arg7 - 1][arg5 + arg3][arg1 + arg8] - (local166 * 8 << 0);
						return;
					}
					this.anIntArrayArrayArray2[0][arg5 + arg3][arg8 + arg1] = -local166 * 8 << 0;
					return;
				}
				this.anIntArrayArrayArray2[0][arg5 + arg3][arg8 + arg1] = local166 * 8 << 0;
				return;
			}
			if (local71 <= 49) {
				if (arg4) {
					arg0.method3737();
				} else {
					this.aByteArrayArrayArray7[arg7][arg3][arg8] = arg0.method3693();
					this.aByteArrayArrayArray10[arg7][arg3][arg8] = (byte) ((local71 - 2) / 4);
					this.aByteArrayArrayArray12[arg7][arg3][arg8] = (byte) (local71 + arg9 - 2 & 0x3);
				}
			} else if (local71 <= 81) {
				if (!this.aBoolean106 && !arg4) {
					Static367.aByteArrayArrayArray16[arg7][arg3][arg8] = (byte) (local71 - 49);
				}
			} else if (!arg4) {
				this.aByteArrayArrayArray8[arg7][arg3][arg8] = (byte) (local71 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIB[Lclient!cl;Lclient!md;)V")
	public final void method916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class37[] arg4, @OriginalArg(6) Class2_Sub20 arg5) {
		@Pc(10) int local10;
		@Pc(22) int local22;
		@Pc(29) int local29;
		@Pc(33) int local33;
		if (!this.aBoolean106) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class37 local16 = arg4[local10];
				for (@Pc(18) int local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local29 = arg3 + local18;
						local33 = local22 + arg2;
						if (local29 >= 0 && this.anInt1244 > local29 && local33 >= 0 && this.anInt1245 > local33) {
							local16.method1062(local33, local29);
						}
					}
				}
			}
		}
		local10 = arg3 + arg1;
		@Pc(91) int local91 = arg0 + arg2;
		for (local22 = 0; local22 < this.anInt1247; local22++) {
			for (local29 = 0; local29 < 64; local29++) {
				for (local33 = 0; local33 < 64; local33++) {
					this.method915(arg5, 0, local33 + local91, arg3 + local29, false, 0, local10 + local29, local22, local33 + arg2, 0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BIIIII)V")
	public final void method917(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = arg2; local3 < arg2 + arg3; local3++) {
			for (local7 = arg0; local7 < arg0 + arg4; local7++) {
				if (local7 >= 0 && this.anInt1244 > local7 && local3 >= 0 && this.anInt1245 > local3) {
					this.anIntArrayArrayArray2[arg1][local7][local3] = arg1 > 0 ? this.anIntArrayArrayArray2[arg1 - 1][local7][local3] - 240 : 0;
				}
			}
		}
		if (arg0 > 0 && this.anInt1244 > arg0) {
			for (local7 = arg2 + 1; local7 < arg2 + arg3; local7++) {
				if (local7 >= 0 && this.anInt1245 > local7) {
					this.anIntArrayArrayArray2[arg1][arg0][local7] = this.anIntArrayArrayArray2[arg1][arg0 - 1][local7];
				}
			}
		}
		if (arg2 > 0 && this.anInt1245 > arg2) {
			for (local7 = arg0 + 1; local7 < arg0 + arg4; local7++) {
				if (local7 >= 0 && this.anInt1244 > local7) {
					this.anIntArrayArrayArray2[arg1][local7][arg2] = this.anIntArrayArrayArray2[arg1][local7][arg2 - 1];
				}
			}
		}
		if (arg0 < 0 || arg2 < 0 || arg0 >= this.anInt1244 || this.anInt1245 <= arg2) {
			return;
		}
		if (arg1 != 0) {
			if (arg0 > 0 && this.anIntArrayArrayArray2[arg1][arg0 - 1][arg2] != this.anIntArrayArrayArray2[arg1 - 1][arg0 - 1][arg2]) {
				this.anIntArrayArrayArray2[arg1][arg0][arg2] = this.anIntArrayArrayArray2[arg1][arg0 - 1][arg2];
				return;
			}
			if (arg2 > 0 && this.anIntArrayArrayArray2[arg1][arg0][arg2 - 1] != this.anIntArrayArrayArray2[arg1 - 1][arg0][arg2 - 1]) {
				this.anIntArrayArrayArray2[arg1][arg0][arg2] = this.anIntArrayArrayArray2[arg1][arg0][arg2 - 1];
				return;
			}
			if (arg0 > 0 && arg2 > 0 && this.anIntArrayArrayArray2[arg1][arg0 - 1][arg2 - 1] != this.anIntArrayArrayArray2[arg1 - 1][arg0 - 1][arg2 - 1]) {
				this.anIntArrayArrayArray2[arg1][arg0][arg2] = this.anIntArrayArrayArray2[arg1][arg0 - 1][arg2 - 1];
				return;
			}
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray2[arg1][arg0 - 1][arg2] != 0) {
			this.anIntArrayArrayArray2[arg1][arg0][arg2] = this.anIntArrayArrayArray2[arg1][arg0 - 1][arg2];
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray2[arg1][arg0][arg2 - 1] != 0) {
			this.anIntArrayArrayArray2[arg1][arg0][arg2] = this.anIntArrayArrayArray2[arg1][arg0][arg2 - 1];
			return;
		}
		if (arg0 > 0 && arg2 > 0 && this.anIntArrayArrayArray2[arg1][arg0 - 1][arg2 - 1] != 0) {
			this.anIntArrayArrayArray2[arg1][arg0][arg2] = this.anIntArrayArrayArray2[arg1][arg0 - 1][arg2 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZIIII)V")
	public final void method918(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt1247; local11++) {
			this.method917(arg0, local11, arg1, 64, 64);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[[BLclient!hr;I[[BLclient!dq;Lclient!qa;[ZIIIII[[B)V")
	private void method919(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) Class111 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) Class54 arg5, @OriginalArg(6) Class26 arg6, @OriginalArg(7) boolean[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) byte[][] arg12) {
		@Pc(56) int local56;
		if (arg5 != null && arg2 != null || arg2 != null && arg3 == 12 || arg5 != null && arg3 == 0) {
			@Pc(40) boolean[] local40 = arg5 != null && arg5.aBoolean173 ? Static282.aBooleanArrayArray6[arg3] : Static42.aBooleanArrayArray2[arg3];
			@Pc(66) Class54 local66;
			@Pc(84) byte local84;
			@Pc(101) int local101;
			@Pc(108) int local108;
			if (arg10 > 0) {
				if (arg0 > 0) {
					local56 = arg4[arg0 - 1][arg10 - 1] & 0xFF;
					if (local56 > 0) {
						local66 = this.aClass245_3.method5500(local56 - 1);
						if (local66.anInt1919 != -1 && local66.aBoolean173) {
							local84 = arg1[arg0 - 1][arg10 - 1];
							local101 = arg12[arg0 - 1][arg10 - 1] * 2 + 4 & 0x7;
							local108 = Static34.method445(arg6, local66);
							if (Static87.aBooleanArrayArray3[local84][local101]) {
								Static273.anIntArray337[0] = local66.anInt1919;
								Static179.anIntArray435[0] = local108;
								Static379.anIntArray448[0] = arg6.method2261() ? local66.anInt1910 : local66.anInt1926;
								Static385.anIntArray455[0] = local66.anInt1912;
								Static423.anIntArray495[0] = local66.anInt1920;
								Static399.anIntArray463[0] = 256;
							}
						}
					}
				}
				if (arg9 - 1 > arg0) {
					local56 = arg4[arg0 + 1][arg10 - 1] & 0xFF;
					if (local56 > 0) {
						local66 = this.aClass245_3.method5500(local56 - 1);
						if (local66.anInt1919 != -1 && local66.aBoolean173) {
							local84 = arg1[arg0 + 1][arg10 - 1];
							local101 = arg12[arg0 + 1][arg10 - 1] * 2 + 6 & 0x7;
							local108 = Static34.method445(arg6, local66);
							if (Static87.aBooleanArrayArray3[local84][local101]) {
								Static273.anIntArray337[2] = local66.anInt1919;
								Static179.anIntArray435[2] = local108;
								Static379.anIntArray448[2] = arg6.method2261() ? local66.anInt1910 : local66.anInt1926;
								Static385.anIntArray455[2] = local66.anInt1912;
								Static423.anIntArray495[2] = local66.anInt1920;
								Static399.anIntArray463[2] = 512;
							}
						}
					}
				}
			}
			if (arg11 - 1 > arg10) {
				if (arg0 > 0) {
					local56 = arg4[arg0 - 1][arg10 + 1] & 0xFF;
					if (local56 > 0) {
						local66 = this.aClass245_3.method5500(local56 - 1);
						if (local66.anInt1919 != -1 && local66.aBoolean173) {
							local84 = arg1[arg0 - 1][arg10 + 1];
							local101 = arg12[arg0 - 1][arg10 + 1] * 2 + 2 & 0x7;
							local108 = Static34.method445(arg6, local66);
							if (Static87.aBooleanArrayArray3[local84][local101]) {
								Static273.anIntArray337[6] = local66.anInt1919;
								Static179.anIntArray435[6] = local108;
								Static379.anIntArray448[6] = arg6.method2261() ? local66.anInt1910 : local66.anInt1926;
								Static385.anIntArray455[6] = local66.anInt1912;
								Static423.anIntArray495[6] = local66.anInt1920;
								Static399.anIntArray463[6] = 64;
							}
						}
					}
				}
				if (arg9 - 1 > arg0) {
					local56 = arg4[arg0 + 1][arg10 + 1] & 0xFF;
					if (local56 > 0) {
						local66 = this.aClass245_3.method5500(local56 - 1);
						if (local66.anInt1919 != -1 && local66.aBoolean173) {
							local84 = arg1[arg0 + 1][arg10 + 1];
							local101 = --(arg12[arg0 + 1][arg10 + 1] * 2) & 0x7;
							local108 = Static34.method445(arg6, local66);
							if (Static87.aBooleanArrayArray3[local84][local101]) {
								Static273.anIntArray337[4] = local66.anInt1919;
								Static179.anIntArray435[4] = local108;
								Static379.anIntArray448[4] = arg6.method2261() ? local66.anInt1910 : local66.anInt1926;
								Static385.anIntArray455[4] = local66.anInt1912;
								Static423.anIntArray495[4] = local66.anInt1920;
								Static399.anIntArray463[4] = 128;
							}
						}
					}
				}
			}
			@Pc(570) int local570;
			@Pc(575) int local575;
			@Pc(577) int local577;
			@Pc(539) byte local539;
			if (arg10 > 0) {
				local56 = arg4[arg0][arg10 - 1] & 0xFF;
				if (local56 > 0) {
					local66 = this.aClass245_3.method5500(local56 - 1);
					if (local66.anInt1919 != -1) {
						local84 = arg1[arg0][arg10 - 1];
						local539 = arg12[arg0][arg10 - 1];
						if (local66.aBoolean173) {
							local108 = 2;
							local570 = local539 * 2 + 4;
							local575 = Static34.method445(arg6, local66);
							for (local577 = 0; local577 < 3; local577++) {
								local108 &= 0x7;
								local570 &= 0x7;
								if (Static87.aBooleanArrayArray3[local84][local570] && Static423.anIntArray495[local108] <= local66.anInt1920) {
									Static273.anIntArray337[local108] = local66.anInt1919;
									Static179.anIntArray435[local108] = local575;
									Static379.anIntArray448[local108] = arg6.method2261() ? local66.anInt1910 : local66.anInt1926;
									Static385.anIntArray455[local108] = local66.anInt1912;
									if (local66.anInt1920 == Static423.anIntArray495[local108]) {
										Static399.anIntArray463[local108] |= 0x20;
									} else {
										Static399.anIntArray463[local108] = 32;
									}
									Static423.anIntArray495[local108] = local66.anInt1920;
								}
								local570++;
								local108--;
							}
							if (!local40[arg8 & 0x3]) {
								arg7[0] = Static282.aBooleanArrayArray6[local84][local539 + 2 & 0x3];
							}
						} else if (!local40[arg8 & 0x3]) {
							arg7[0] = Static42.aBooleanArrayArray2[local84][local539 + 2 & 0x3];
						}
					}
				}
			}
			if (arg11 - 1 > arg10) {
				local56 = arg4[arg0][arg10 + 1] & 0xFF;
				if (local56 > 0) {
					local66 = this.aClass245_3.method5500(local56 - 1);
					if (local66.anInt1919 != -1) {
						local84 = arg1[arg0][arg10 + 1];
						local539 = arg12[arg0][arg10 + 1];
						if (local66.aBoolean173) {
							local108 = 4;
							local570 = local539 * 2 + 2;
							local575 = Static34.method445(arg6, local66);
							for (local577 = 0; local577 < 3; local577++) {
								local108 &= 0x7;
								local570 &= 0x7;
								if (Static87.aBooleanArrayArray3[local84][local570] && Static423.anIntArray495[local108] <= local66.anInt1920) {
									Static273.anIntArray337[local108] = local66.anInt1919;
									Static179.anIntArray435[local108] = local575;
									Static379.anIntArray448[local108] = arg6.method2261() ? local66.anInt1910 : local66.anInt1926;
									Static385.anIntArray455[local108] = local66.anInt1912;
									if (Static423.anIntArray495[local108] == local66.anInt1920) {
										Static399.anIntArray463[local108] |= 0x10;
									} else {
										Static399.anIntArray463[local108] = 16;
									}
									Static423.anIntArray495[local108] = local66.anInt1920;
								}
								local108++;
								local570--;
							}
							if (!local40[arg8 + 2 & 0x3]) {
								arg7[2] = Static282.aBooleanArrayArray6[local84][local539 & 0x3];
							}
						} else if (!local40[arg8 + 2 & 0x3]) {
							arg7[2] = Static42.aBooleanArrayArray2[local84][local539 & 0x3];
						}
					}
				}
			}
			if (arg0 > 0) {
				local56 = arg4[arg0 - 1][arg10] & 0xFF;
				if (local56 > 0) {
					local66 = this.aClass245_3.method5500(local56 - 1);
					if (local66.anInt1919 != -1) {
						local84 = arg1[arg0 - 1][arg10];
						local539 = arg12[arg0 - 1][arg10];
						if (local66.aBoolean173) {
							local108 = 6;
							local570 = local539 * 2 + 4;
							local575 = Static34.method445(arg6, local66);
							for (local577 = 0; local577 < 3; local577++) {
								local570 &= 0x7;
								local108 &= 0x7;
								if (Static87.aBooleanArrayArray3[local84][local570] && Static423.anIntArray495[local108] <= local66.anInt1920) {
									Static273.anIntArray337[local108] = local66.anInt1919;
									Static179.anIntArray435[local108] = local575;
									Static379.anIntArray448[local108] = arg6.method2261() ? local66.anInt1910 : local66.anInt1926;
									Static385.anIntArray455[local108] = local66.anInt1912;
									if (Static423.anIntArray495[local108] == local66.anInt1920) {
										Static399.anIntArray463[local108] |= 0x8;
									} else {
										Static399.anIntArray463[local108] = 8;
									}
									Static423.anIntArray495[local108] = local66.anInt1920;
								}
								local570--;
								local108++;
							}
							if (!local40[arg8 + 3 & 0x3]) {
								arg7[3] = Static282.aBooleanArrayArray6[local84][local539 + 1 & 0x3];
							}
						} else if (!local40[arg8 + 3 & 0x3]) {
							arg7[3] = Static42.aBooleanArrayArray2[local84][local539 + 1 & 0x3];
						}
					}
				}
			}
			if (arg0 < arg9 - 1) {
				local56 = arg4[arg0 + 1][arg10] & 0xFF;
				if (local56 > 0) {
					local66 = this.aClass245_3.method5500(local56 - 1);
					if (local66.anInt1919 != -1) {
						local84 = arg1[arg0 + 1][arg10];
						local539 = arg12[arg0 + 1][arg10];
						if (local66.aBoolean173) {
							local108 = 4;
							local570 = local539 * 2 + 6;
							local575 = Static34.method445(arg6, local66);
							for (local577 = 0; local577 < 3; local577++) {
								local108 &= 0x7;
								local570 &= 0x7;
								if (Static87.aBooleanArrayArray3[local84][local570] && Static423.anIntArray495[local108] <= local66.anInt1920) {
									Static273.anIntArray337[local108] = local66.anInt1919;
									Static179.anIntArray435[local108] = local575;
									Static379.anIntArray448[local108] = arg6.method2261() ? local66.anInt1910 : local66.anInt1926;
									Static385.anIntArray455[local108] = local66.anInt1912;
									if (Static423.anIntArray495[local108] == local66.anInt1920) {
										Static399.anIntArray463[local108] |= 0x4;
									} else {
										Static399.anIntArray463[local108] = 4;
									}
									Static423.anIntArray495[local108] = local66.anInt1920;
								}
								local570++;
								local108--;
							}
							if (!local40[arg8 + 1 & 0x3]) {
								arg7[1] = Static282.aBooleanArrayArray6[local84][local539 + 3 & 0x3];
							}
						} else if (!local40[arg8 + 1 & 0x3]) {
							arg7[1] = Static42.aBooleanArrayArray2[local84][local539 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg5 == null) {
			return;
		}
		@Pc(1250) int local1250 = Static34.method445(arg6, arg5);
		if (!arg5.aBoolean173) {
			return;
		}
		for (local56 = 0; local56 < 8; local56++) {
			@Pc(1266) int local1266 = local56 - arg8 * 2 & 0x7;
			if (Static87.aBooleanArrayArray3[arg3][local56] && arg5.anInt1920 >= Static423.anIntArray495[local1266]) {
				Static273.anIntArray337[local1266] = arg5.anInt1919;
				Static179.anIntArray435[local1266] = local1250;
				Static379.anIntArray448[local1266] = arg6.method2261() ? arg5.anInt1910 : arg5.anInt1926;
				Static385.anIntArray455[local1266] = arg5.anInt1912;
				if (Static423.anIntArray495[local1266] == arg5.anInt1920) {
					Static399.anIntArray463[local1266] |= 0x2;
				} else {
					Static399.anIntArray463[local1266] = 2;
				}
				Static423.anIntArray495[local1266] = arg5.anInt1920;
			}
		}
		return;
	}
}
