import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public class Class19 {

	@OriginalMember(owner = "client!am", name = "a", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!am", name = "k", descriptor = "[I")
	private final int[] anIntArray186 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!am", name = "m", descriptor = "[I")
	private final int[] anIntArray187 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!am", name = "i", descriptor = "Lclient!fs;")
	private final Class107 aClass107_3;

	@OriginalMember(owner = "client!am", name = "o", descriptor = "I")
	protected final int anInt3633;

	@OriginalMember(owner = "client!am", name = "s", descriptor = "Z")
	public final boolean aBoolean269;

	@OriginalMember(owner = "client!am", name = "r", descriptor = "I")
	public final int anInt3635;

	@OriginalMember(owner = "client!am", name = "x", descriptor = "Lclient!wea;")
	private final Class369 aClass369_3;

	@OriginalMember(owner = "client!am", name = "A", descriptor = "I")
	protected final int anInt3641;

	@OriginalMember(owner = "client!am", name = "l", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!am", name = "f", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!am", name = "c", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!am", name = "e", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!am", name = "j", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!am", name = "b", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(IIIZLclient!wea;Lclient!fs;)V")
	protected Class19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class369 arg4, @OriginalArg(5) Class107 arg5) {
		this.aClass107_3 = arg5;
		this.anInt3633 = arg1;
		this.aBoolean269 = arg3;
		this.anInt3635 = arg0;
		this.aClass369_3 = arg4;
		this.anInt3641 = arg2;
		this.aByteArrayArrayArray17 = new byte[this.anInt3635][this.anInt3633][this.anInt3641];
		this.aByteArrayArrayArray15 = new byte[this.anInt3635][this.anInt3633][this.anInt3641];
		this.aByteArrayArrayArray14 = new byte[this.anInt3635][this.anInt3633][this.anInt3641];
		this.anIntArrayArrayArray8 = new int[this.anInt3635][this.anInt3633 + 1][this.anInt3641 + 1];
		this.aByteArrayArrayArray16 = new byte[this.anInt3635][this.anInt3633][this.anInt3641];
		this.aByteArrayArrayArray13 = new byte[this.anInt3635][this.anInt3633 + 1][this.anInt3641 + 1];
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!ha;BILclient!s;Lclient!s;[[ILclient!s;)V")
	private void method2990(@OriginalArg(0) Class16 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class86 arg2, @OriginalArg(4) Class86 arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) Class86 arg5) {
		@Pc(14) byte[][] local14 = this.aByteArrayArrayArray14[arg1];
		@Pc(19) byte[][] local19 = this.aByteArrayArrayArray15[arg1];
		@Pc(24) byte[][] local24 = this.aByteArrayArrayArray17[arg1];
		@Pc(29) byte[][] local29 = this.aByteArrayArrayArray16[arg1];
		for (@Pc(31) int local31 = 0; local31 < this.anInt3633; local31++) {
			@Pc(45) int local45 = local31 >= this.anInt3633 - 1 ? local31 : local31 + 1;
			for (@Pc(47) int local47 = 0; local47 < this.anInt3641; local47++) {
				@Pc(65) int local65 = local47 < this.anInt3641 - 1 ? local47 + 1 : local47;
				if (Static145.anInt3683 == -1 || Static116.method2609(Static145.anInt3683, arg1, local31, local47)) {
					@Pc(79) boolean local79 = false;
					@Pc(81) boolean local81 = false;
					@Pc(84) boolean[] local84 = new boolean[4];
					@Pc(90) int local90 = local14[local31][local47];
					@Pc(96) int local96 = local19[local31][local47];
					@Pc(104) int local104 = local29[local31][local47] & 0xFF;
					@Pc(112) int local112 = local24[local31][local47] & 0xFF;
					@Pc(120) int local120 = local24[local31][local65] & 0xFF;
					@Pc(128) int local128 = local24[local45][local65] & 0xFF;
					@Pc(136) int local136 = local24[local45][local47] & 0xFF;
					if (local104 != 0 || local112 != 0) {
						@Pc(152) Class232 local152 = local104 == 0 ? null : this.aClass369_3.method8410(local104 - 1);
						if (local90 == 0 && local152 == null) {
							local90 = 12;
						}
						@Pc(173) Class298 local173 = local112 == 0 ? null : this.aClass107_3.method3246(local112 - 1);
						@Pc(175) Class232 local175 = local152;
						if (local152 != null) {
							if (local152.anInt7442 == -1 && local152.anInt7449 == -1) {
								local175 = local152;
								local152 = null;
							} else if (local173 != null && local90 != 0) {
								local81 = local152.aBoolean540;
							}
						}
						@Pc(292) int local292;
						@Pc(322) int local322;
						@Pc(376) int local376;
						@Pc(386) int local386;
						if ((local90 == 0 || local90 == 12) && local31 > 0 && local47 > 0 && local31 < this.anInt3633 && this.anInt3641 > local47) {
							@Pc(252) int local252 = local112 == local24[local45][local47 - 1] ? 1 : -1;
							@Pc(271) int local271 = local24[local45][local65] == local112 ? 1 : -1;
							local292 = local112 == local24[local31 - 1][local47 - 1] ? 1 : -1;
							if (local112 == local24[local31][local47 - 1]) {
								local252++;
								local292++;
							} else {
								local292--;
								local252--;
							}
							local322 = local24[local31 - 1][local65] == local112 ? 1 : -1;
							if (local112 == local24[local45][local47]) {
								local252++;
								local271++;
							} else {
								local252--;
								local271--;
							}
							if (local24[local31][local65] == local112) {
								local322++;
								local271++;
							} else {
								local271--;
								local322--;
							}
							if (local112 == local24[local31 - 1][local47]) {
								local322++;
								local292++;
							} else {
								local322--;
								local292--;
							}
							local376 = local292 - local271;
							if (local376 < 0) {
								local376 = -local376;
							}
							local386 = local252 - local322;
							if (local386 < 0) {
								local386 = -local386;
							}
							if (local376 == local386) {
								local376 = arg3.method8086(local47, local31) - arg3.method8086(local65, local45);
								if (local376 < 0) {
									local376 = -local376;
								}
								local386 = arg3.method8086(local47, local45) - arg3.method8086(local65, local31);
								if (local386 < 0) {
									local386 = -local386;
								}
							}
							local96 = local376 < local386 ? 1 : 0;
						}
						for (local292 = 0; local292 < 13; local292++) {
							Static360.anIntArray385[local292] = -1;
							Static592.anIntArray592[local292] = 1;
						}
						@Pc(465) boolean[] local465 = local152 != null && local152.aBoolean540 ? Static45.aBooleanArrayArray1[local90] : Static101.aBooleanArrayArray4[local90];
						this.method2991(local173, local14, local31, this.anInt3633, local90, local84, this.anInt3641, local19, local152, local47, local96, local29, arg0);
						@Pc(494) boolean local494 = local152 != null && local152.anInt7442 != local152.anInt7449;
						if (!local494) {
							for (local322 = 0; local322 < 8; local322++) {
								if (Static360.anIntArray385[local322] >= 0 && Static173.anIntArray229[local322] != Static367.anIntArray389[local322]) {
									local494 = true;
									break;
								}
							}
						}
						if (!local465[local96 + 1 & 0x3]) {
							local84[1] = Static485.method7159(local84[1], (Static592.anIntArray592[2] & Static592.anIntArray592[4]) == 0);
						}
						if (!local465[local96 + 3 & 0x3]) {
							local84[3] = Static485.method7159(local84[3], (Static592.anIntArray592[6] & Static592.anIntArray592[0]) == 0);
						}
						if (!local465[--local96 & 0x3]) {
							local84[0] = Static485.method7159(local84[0], (Static592.anIntArray592[0] & Static592.anIntArray592[2]) == 0);
						}
						if (!local465[local96 + 2 & 0x3]) {
							local84[2] = Static485.method7159(local84[2], (Static592.anIntArray592[6] & Static592.anIntArray592[4]) == 0);
						}
						if (!local81 && (local90 == 0 || local90 == 12)) {
							if (local84[0] && !local84[1] && !local84[2] && local84[3]) {
								local96 = 0;
								local90 = local90 == 0 ? 13 : 14;
								local84[0] = local84[3] = false;
							} else if (local84[0] && local84[1] && !local84[2] && !local84[3]) {
								local84[0] = local84[1] = false;
								local90 = local90 == 0 ? 13 : 14;
								local96 = 3;
							} else if (!local84[0] && local84[1] && local84[2] && !local84[3]) {
								local96 = 2;
								local84[1] = local84[2] = false;
								local90 = local90 == 0 ? 13 : 14;
							} else if (!local84[0] && !local84[1] && local84[2] && local84[3]) {
								local96 = 1;
								local90 = local90 == 0 ? 13 : 14;
								local84[2] = local84[3] = false;
							}
						}
						@Pc(804) boolean local804 = !local81 && !local84[0] && !local84[2] && !local84[1] && !local84[3];
						@Pc(806) int[] local806 = null;
						@Pc(812) int[] local812;
						@Pc(836) int[] local836;
						@Pc(816) int[] local816;
						if (local804) {
							local812 = Static434.anIntArrayArray42[local90];
							local816 = Static189.anIntArrayArray24[local90];
							local376 = local173 == null ? 0 : Static527.anIntArray505[local90];
							local386 = local152 == null ? 0 : Static543.anIntArray510[local90];
							local836 = Static484.anIntArrayArray47[local90];
						} else if (local81) {
							local816 = Static595.anIntArrayArray62[local90];
							local836 = Static455.anIntArrayArray44[local90];
							local806 = Static114.anIntArrayArray8[local90];
							local386 = local152 == null ? 0 : Static610.anIntArray603[local90];
							local376 = local173 == null ? 0 : Static121.anIntArray163[local90];
							local812 = Static380.anIntArrayArray40[local90];
						} else {
							local836 = Static206.anIntArrayArray55[local90];
							local812 = Static92.anIntArrayArray7[local90];
							local376 = local173 == null ? 0 : Static205.anIntArray259[local90];
							local816 = Static608.anIntArrayArray64[local90];
							local386 = local152 == null ? 0 : Static433.anIntArray440[local90];
							local806 = Static86.anIntArrayArray6[local90];
						}
						@Pc(909) int local909 = local386 + local376;
						if (local909 <= 0) {
							Static493.method7210(arg1, local31, local47);
						} else {
							if (local84[0]) {
								local909++;
							}
							if (local84[2]) {
								local909++;
							}
							if (local84[1]) {
								local909++;
							}
							if (local84[3]) {
								local909++;
							}
							@Pc(942) int local942 = 0;
							@Pc(944) int local944 = 0;
							@Pc(948) int local948 = local909 * 3;
							@Pc(955) int[] local955 = local494 ? new int[local948] : null;
							@Pc(958) int[] local958 = new int[local948];
							@Pc(961) int[] local961 = new int[local948];
							@Pc(964) int[] local964 = new int[local948];
							@Pc(967) int[] local967 = new int[local948];
							@Pc(970) int[] local970 = new int[local948];
							@Pc(977) int[] local977 = arg5 == null ? null : new int[local948];
							@Pc(986) int[] local986 = arg5 == null && arg2 == null ? null : new int[local948];
							@Pc(988) int local988 = -1;
							@Pc(990) int local990 = -1;
							@Pc(992) int local992 = 256;
							@Pc(1058) byte local1058;
							@Pc(1008) int local1008;
							@Pc(1010) int local1010;
							@Pc(1245) int local1245;
							@Pc(1251) int local1251;
							@Pc(1259) int local1259;
							@Pc(1264) int local1264;
							@Pc(1284) int local1284;
							@Pc(1269) int local1269;
							@Pc(1286) int local1286;
							@Pc(1338) int local1338;
							@Pc(1344) int local1344;
							if (local152 != null) {
								local990 = local152.anInt7443;
								local992 = local152.anInt7448;
								local988 = local152.anInt7442;
								local1008 = Static46.method1366(local152, arg0);
								for (local1010 = 0; local1010 < local386; local1010++) {
									if (local84[-local96 & 0x3] && local942 == local806[0]) {
										Static151.anIntArray191[0] = local812[local942];
										Static151.anIntArray191[1] = 1;
										Static151.anIntArray191[2] = local816[local942];
										Static151.anIntArray191[3] = 1;
										Static151.anIntArray191[4] = local836[local942];
										local1058 = 6;
										Static151.anIntArray191[5] = local816[local942];
									} else if (local84[2 - local96 & 0x3] && local806[2] == local942) {
										Static151.anIntArray191[0] = local812[local942];
										Static151.anIntArray191[1] = 5;
										Static151.anIntArray191[2] = local816[local942];
										Static151.anIntArray191[3] = 5;
										Static151.anIntArray191[4] = local836[local942];
										Static151.anIntArray191[5] = local816[local942];
										local1058 = 6;
									} else if (local84[1 - local96 & 0x3] && local806[1] == local942) {
										Static151.anIntArray191[0] = local812[local942];
										Static151.anIntArray191[1] = 3;
										Static151.anIntArray191[2] = local816[local942];
										Static151.anIntArray191[3] = 3;
										Static151.anIntArray191[4] = local836[local942];
										local1058 = 6;
										Static151.anIntArray191[5] = local816[local942];
									} else if (local84[3 - local96 & 0x3] && local942 == local806[3]) {
										Static151.anIntArray191[0] = local812[local942];
										Static151.anIntArray191[1] = 7;
										Static151.anIntArray191[2] = local816[local942];
										Static151.anIntArray191[3] = 7;
										Static151.anIntArray191[4] = local836[local942];
										Static151.anIntArray191[5] = local816[local942];
										local1058 = 6;
									} else {
										Static151.anIntArray191[0] = local812[local942];
										Static151.anIntArray191[1] = local836[local942];
										Static151.anIntArray191[2] = local816[local942];
										local1058 = 3;
									}
									local942++;
									for (local1245 = 0; local1245 < local1058; local1245++) {
										local1251 = Static151.anIntArray191[local1245];
										local1259 = local1251 - local96 * 2 & 0x7;
										local1264 = this.anIntArray187[local1251];
										local1269 = this.anIntArray186[local1251];
										if (local96 == 1) {
											local1284 = local1269;
											local1286 = 512 - local1264;
										} else if (local96 == 2) {
											local1284 = 512 - local1264;
											local1286 = 512 - local1269;
										} else if (local96 == 3) {
											local1284 = 512 - local1269;
											local1286 = local1264;
										} else {
											local1284 = local1264;
											local1286 = local1269;
										}
										local958[local944] = local1284;
										local961[local944] = local1286;
										if (local977 != null && Static385.aBooleanArrayArray13[local90][local1251]) {
											local1338 = local1284 + (local31 << 9);
											local1344 = (local47 << 9) + local1286;
											local977[local944] = arg5.method8088(local1344, local1338) - arg3.method8088(local1344, local1338);
										}
										if (local986 != null) {
											if (arg5 != null && !Static385.aBooleanArrayArray13[local90][local1251]) {
												local1338 = local1284 + (local31 << 9);
												local1344 = local1286 + (local47 << 9);
												local986[local944] = arg3.method8088(local1344, local1338) - arg5.method8088(local1344, local1338);
											} else if (arg2 != null && !Static281.aBooleanArrayArray12[local90][local1251]) {
												local1338 = (local31 << 9) + local1284;
												local1344 = local1286 + (local47 << 9);
												local986[local944] = arg2.method8088(local1344, local1338) - arg3.method8088(local1344, local1338);
											}
										}
										if (local1251 < 8 && local152.anInt7445 < Static360.anIntArray385[local1259]) {
											if (local955 != null) {
												local955[local944] = Static367.anIntArray389[local1259];
											}
											local970[local944] = Static461.anIntArray451[local1259];
											local967[local944] = Static205.anIntArray260[local1259];
											local964[local944] = Static173.anIntArray229[local1259];
										} else {
											if (local955 != null) {
												local955[local944] = local1008;
											}
											local967[local944] = local152.anInt7443;
											local970[local944] = local152.anInt7448;
											local964[local944] = local988;
										}
										local944++;
									}
								}
								if (!this.aBoolean269 && arg1 == 0) {
									Static554.method7788(local31, local47, local152.anInt7447, local152.anInt7436 * 8, local152.anInt7437);
								}
								if (local90 != 12 && local152.anInt7442 != -1 && local152.aBoolean538) {
									local79 = true;
								}
							} else if (local804) {
								local942 = Static543.anIntArray510[local90];
							} else if (local81) {
								local942 = Static610.anIntArray603[local90];
							} else {
								local942 = Static433.anIntArray440[local90];
							}
							if (local173 != null) {
								if (local120 == 0) {
									local120 = local112;
								}
								if (local128 == 0) {
									local128 = local112;
								}
								if (local136 == 0) {
									local136 = local112;
								}
								@Pc(1590) Class298 local1590 = this.aClass107_3.method3246(local112 - 1);
								@Pc(1598) Class298 local1598 = this.aClass107_3.method3246(local120 - 1);
								@Pc(1606) Class298 local1606 = this.aClass107_3.method3246(local128 - 1);
								@Pc(1614) Class298 local1614 = this.aClass107_3.method3246(local136 - 1);
								for (local1259 = 0; local1259 < local376; local1259++) {
									if (local84[-local96 & 0x3] && local806[0] == local942) {
										Static151.anIntArray191[0] = local812[local942];
										Static151.anIntArray191[1] = 1;
										Static151.anIntArray191[2] = local816[local942];
										Static151.anIntArray191[3] = 1;
										Static151.anIntArray191[4] = local836[local942];
										Static151.anIntArray191[5] = local816[local942];
										local1058 = 6;
									} else if (local84[2 - local96 & 0x3] && local806[2] == local942) {
										Static151.anIntArray191[0] = local812[local942];
										Static151.anIntArray191[1] = 5;
										Static151.anIntArray191[2] = local816[local942];
										Static151.anIntArray191[3] = 5;
										Static151.anIntArray191[4] = local836[local942];
										local1058 = 6;
										Static151.anIntArray191[5] = local816[local942];
									} else if (local84[1 - local96 & 0x3] && local806[1] == local942) {
										Static151.anIntArray191[0] = local812[local942];
										Static151.anIntArray191[1] = 3;
										Static151.anIntArray191[2] = local816[local942];
										Static151.anIntArray191[3] = 3;
										Static151.anIntArray191[4] = local836[local942];
										Static151.anIntArray191[5] = local816[local942];
										local1058 = 6;
									} else if (local84[3 - local96 & 0x3] && local806[3] == local942) {
										Static151.anIntArray191[0] = local812[local942];
										Static151.anIntArray191[1] = 7;
										Static151.anIntArray191[2] = local816[local942];
										Static151.anIntArray191[3] = 7;
										Static151.anIntArray191[4] = local836[local942];
										local1058 = 6;
										Static151.anIntArray191[5] = local816[local942];
									} else {
										Static151.anIntArray191[0] = local812[local942];
										Static151.anIntArray191[1] = local836[local942];
										local1058 = 3;
										Static151.anIntArray191[2] = local816[local942];
									}
									for (local1264 = 0; local1264 < local1058; local1264++) {
										local1284 = Static151.anIntArray191[local1264];
										local1269 = local1284 - local96 * 2 & 0x7;
										local1286 = this.anIntArray187[local1284];
										local1344 = this.anIntArray186[local1284];
										@Pc(1882) int local1882;
										if (local96 == 1) {
											local1338 = local1344;
											local1882 = 512 - local1286;
										} else if (local96 == 2) {
											local1882 = 512 - local1344;
											local1338 = 512 - local1286;
										} else if (local96 == 3) {
											local1338 = 512 - local1344;
											local1882 = local1286;
										} else {
											local1882 = local1344;
											local1338 = local1286;
										}
										local958[local944] = local1338;
										local961[local944] = local1882;
										@Pc(1936) int local1936;
										@Pc(1942) int local1942;
										if (local977 != null && Static385.aBooleanArrayArray13[local90][local1284]) {
											local1936 = local1338 + (local31 << 9);
											local1942 = local1882 + (local47 << 9);
											local977[local944] = arg5.method8088(local1942, local1936) - arg3.method8088(local1942, local1936);
										}
										if (local986 != null) {
											if (arg5 != null && !Static385.aBooleanArrayArray13[local90][local1284]) {
												local1936 = local1338 + (local31 << 9);
												local1942 = local1882 + (local47 << 9);
												local986[local944] = arg3.method8088(local1942, local1936) - arg5.method8088(local1942, local1936);
											} else if (arg2 != null && !Static281.aBooleanArrayArray12[local90][local1284]) {
												local1936 = (local31 << 9) + local1338;
												local1942 = (local47 << 9) + local1882;
												local986[local944] = arg2.method8088(local1942, local1936) - arg3.method8088(local1942, local1936);
											}
										}
										if (local1284 < 8 && Static360.anIntArray385[local1269] >= 0) {
											if (local955 != null) {
												local955[local944] = Static367.anIntArray389[local1269];
											}
											local970[local944] = Static461.anIntArray451[local1269];
											local967[local944] = Static205.anIntArray260[local1269];
											local964[local944] = Static173.anIntArray229[local1269];
										} else {
											if (local81 && Static385.aBooleanArrayArray13[local90][local1284]) {
												local967[local944] = local990;
												local970[local944] = local992;
												local964[local944] = local988;
											} else if (local1338 == 0 && local1882 == 0) {
												local964[local944] = arg4[local31][local47];
												local967[local944] = local1590.anInt8766;
												local970[local944] = local1590.anInt8772;
											} else if (local1338 == 0 && local1882 == 512) {
												local964[local944] = arg4[local31][local65];
												local967[local944] = local1598.anInt8766;
												local970[local944] = local1598.anInt8772;
											} else if (local1338 == 512 && local1882 == 512) {
												local964[local944] = arg4[local45][local65];
												local967[local944] = local1606.anInt8766;
												local970[local944] = local1606.anInt8772;
											} else if (local1338 == 512 && local1882 == 0) {
												local964[local944] = arg4[local45][local47];
												local967[local944] = local1614.anInt8766;
												local970[local944] = local1614.anInt8772;
											} else {
												if (local1338 < 256) {
													if (local1882 < 256) {
														local967[local944] = local1590.anInt8766;
														local970[local944] = local1590.anInt8772;
													} else {
														local967[local944] = local1598.anInt8766;
														local970[local944] = local1598.anInt8772;
													}
												} else if (local1882 >= 256) {
													local967[local944] = local1606.anInt8766;
													local970[local944] = local1606.anInt8772;
												} else {
													local967[local944] = local1614.anInt8766;
													local970[local944] = local1614.anInt8772;
												}
												local1936 = Static74.method1947(arg4[local31][local47], arg4[local45][local47], local1338 << 7 >> 9);
												local1942 = Static74.method1947(arg4[local31][local65], arg4[local45][local65], local1338 << 7 >> 9);
												local964[local944] = Static74.method1947(local1936, local1942, local1882 << 7 >> 9);
											}
											if (local955 != null) {
												local955[local944] = local964[local944];
											}
										}
										local944++;
									}
									local942++;
								}
								if (local90 != 0 && local173.aBoolean620) {
									local79 = true;
								}
							}
							local1008 = arg3.method8086(local47, local31);
							local1010 = arg3.method8086(local47, local45);
							local1245 = arg3.method8086(local65, local45);
							local1251 = arg3.method8086(local65, local31);
							@Pc(2371) boolean local2371 = Static61.method1675(local47, local31);
							if (local2371 && arg1 > 1 || !local2371 && arg1 > 0) {
								@Pc(2384) boolean local2384 = true;
								if (local173 != null && !local173.aBoolean621) {
									local2384 = false;
								} else if (local112 == 0 && local90 != 0) {
									local2384 = false;
								} else if (local104 > 0 && local175 != null && !local175.aBoolean537) {
									local2384 = false;
								}
								if (local2384 && local1008 == local1010 && local1245 == local1008 && local1251 == local1008) {
									this.aByteArrayArrayArray13[arg1][local31][local47] = (byte) (this.aByteArrayArrayArray13[arg1][local31][local47] | 0x4);
								}
							}
							local1264 = 0;
							local1284 = 0;
							local1269 = 0;
							if (this.aBoolean269) {
								local1264 = Static546.method7688(local31, local47);
								local1284 = Static563.method7839(local31, local47);
								local1269 = Static614.method5485(local31, local47);
							}
							arg3.U(local31, local47, local958, local977, local961, local986, local964, local955, local967, local970, local1264, local1284, local1269, local79);
							Static493.method7210(arg1, local31, local47);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!rq;[[BIII[ZI[[BLclient!oaa;III[[BLclient!ha;)V")
	private void method2991(@OriginalArg(0) Class298 arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][] arg7, @OriginalArg(8) Class232 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) byte[][] arg11, @OriginalArg(13) Class16 arg12) {
		@Pc(18) boolean[] local18 = arg8 != null && arg8.aBoolean540 ? Static45.aBooleanArrayArray1[arg4] : Static101.aBooleanArrayArray4[arg4];
		@Pc(45) int local45;
		@Pc(55) Class232 local55;
		@Pc(73) byte local73;
		@Pc(89) int local89;
		@Pc(94) int local94;
		if (arg9 > 0) {
			if (arg2 > 0) {
				local45 = arg11[arg2 - 1][arg9 - 1] & 0xFF;
				if (local45 > 0) {
					local55 = this.aClass369_3.method8410(local45 - 1);
					if (local55.anInt7442 != -1 && local55.aBoolean540) {
						local73 = arg1[arg2 - 1][arg9 - 1];
						local89 = arg7[arg2 - 1][arg9 - 1] * 2 + 4 & 0x7;
						local94 = Static46.method1366(local55, arg12);
						if (Static385.aBooleanArrayArray13[local73][local89]) {
							Static173.anIntArray229[0] = local55.anInt7442;
							Static367.anIntArray389[0] = local94;
							Static205.anIntArray260[0] = local55.anInt7443;
							Static461.anIntArray451[0] = local55.anInt7448;
							Static360.anIntArray385[0] = local55.anInt7445;
							Static592.anIntArray592[0] = 256;
						}
					}
				}
			}
			if (arg3 - 1 > arg2) {
				local45 = arg11[arg2 + 1][arg9 - 1] & 0xFF;
				if (local45 > 0) {
					local55 = this.aClass369_3.method8410(local45 - 1);
					if (local55.anInt7442 != -1 && local55.aBoolean540) {
						local73 = arg1[arg2 + 1][arg9 - 1];
						local89 = arg7[arg2 + 1][arg9 - 1] * 2 + 6 & 0x7;
						local94 = Static46.method1366(local55, arg12);
						if (Static385.aBooleanArrayArray13[local73][local89]) {
							Static173.anIntArray229[2] = local55.anInt7442;
							Static367.anIntArray389[2] = local94;
							Static205.anIntArray260[2] = local55.anInt7443;
							Static461.anIntArray451[2] = local55.anInt7448;
							Static360.anIntArray385[2] = local55.anInt7445;
							Static592.anIntArray592[2] = 512;
						}
					}
				}
			}
		}
		if (arg6 - 1 > arg9) {
			if (arg2 > 0) {
				local45 = arg11[arg2 - 1][arg9 + 1] & 0xFF;
				if (local45 > 0) {
					local55 = this.aClass369_3.method8410(local45 - 1);
					if (local55.anInt7442 != -1 && local55.aBoolean540) {
						local73 = arg1[arg2 - 1][arg9 + 1];
						local89 = arg7[arg2 - 1][arg9 + 1] * 2 + 2 & 0x7;
						local94 = Static46.method1366(local55, arg12);
						if (Static385.aBooleanArrayArray13[local73][local89]) {
							Static173.anIntArray229[6] = local55.anInt7442;
							Static367.anIntArray389[6] = local94;
							Static205.anIntArray260[6] = local55.anInt7443;
							Static461.anIntArray451[6] = local55.anInt7448;
							Static360.anIntArray385[6] = local55.anInt7445;
							Static592.anIntArray592[6] = 64;
						}
					}
				}
			}
			if (arg3 - 1 > arg2) {
				local45 = arg11[arg2 + 1][arg9 + 1] & 0xFF;
				if (local45 > 0) {
					local55 = this.aClass369_3.method8410(local45 - 1);
					if (local55.anInt7442 != -1 && local55.aBoolean540) {
						local73 = arg1[arg2 + 1][arg9 + 1];
						local89 = arg7[arg2 + 1][arg9 + 1] * 2 & 0x7;
						local94 = Static46.method1366(local55, arg12);
						if (Static385.aBooleanArrayArray13[local73][local89]) {
							Static173.anIntArray229[4] = local55.anInt7442;
							Static367.anIntArray389[4] = local94;
							Static205.anIntArray260[4] = local55.anInt7443;
							Static461.anIntArray451[4] = local55.anInt7448;
							Static360.anIntArray385[4] = local55.anInt7445;
							Static592.anIntArray592[4] = 128;
						}
					}
				}
			}
		}
		@Pc(523) int local523;
		@Pc(528) int local528;
		@Pc(530) int local530;
		@Pc(492) byte local492;
		if (arg9 > 0) {
			local45 = arg11[arg2][arg9 - 1] & 0xFF;
			if (local45 > 0) {
				local55 = this.aClass369_3.method8410(local45 - 1);
				if (local55.anInt7442 != -1) {
					local73 = arg1[arg2][arg9 - 1];
					local492 = arg7[arg2][arg9 - 1];
					if (local55.aBoolean540) {
						local94 = 2;
						local523 = local492 * 2 + 4;
						local528 = Static46.method1366(local55, arg12);
						for (local530 = 0; local530 < 3; local530++) {
							local523 &= 0x7;
							local94 &= 0x7;
							if (Static385.aBooleanArrayArray13[local73][local523] && local55.anInt7445 >= Static360.anIntArray385[local94]) {
								Static173.anIntArray229[local94] = local55.anInt7442;
								Static367.anIntArray389[local94] = local528;
								Static205.anIntArray260[local94] = local55.anInt7443;
								Static461.anIntArray451[local94] = local55.anInt7448;
								if (local55.anInt7445 == Static360.anIntArray385[local94]) {
									Static592.anIntArray592[local94] |= 0x20;
								} else {
									Static592.anIntArray592[local94] = 32;
								}
								Static360.anIntArray385[local94] = local55.anInt7445;
							}
							local94--;
							local523++;
						}
						if (!local18[arg10 & 0x3]) {
							arg5[0] = Static45.aBooleanArrayArray1[local73][local492 + 2 & 0x3];
						}
					} else if (!local18[arg10 & 0x3]) {
						arg5[0] = Static101.aBooleanArrayArray4[local73][local492 + 2 & 0x3];
					}
				}
			}
		}
		if (arg9 < arg6 - 1) {
			local45 = arg11[arg2][arg9 + 1] & 0xFF;
			if (local45 > 0) {
				local55 = this.aClass369_3.method8410(local45 - 1);
				if (local55.anInt7442 != -1) {
					local73 = arg1[arg2][arg9 + 1];
					local492 = arg7[arg2][arg9 + 1];
					if (local55.aBoolean540) {
						local94 = 4;
						local523 = local492 * 2 + 2;
						local528 = Static46.method1366(local55, arg12);
						for (local530 = 0; local530 < 3; local530++) {
							local94 &= 0x7;
							local523 &= 0x7;
							if (Static385.aBooleanArrayArray13[local73][local523] && local55.anInt7445 >= Static360.anIntArray385[local94]) {
								Static173.anIntArray229[local94] = local55.anInt7442;
								Static367.anIntArray389[local94] = local528;
								Static205.anIntArray260[local94] = local55.anInt7443;
								Static461.anIntArray451[local94] = local55.anInt7448;
								if (Static360.anIntArray385[local94] == local55.anInt7445) {
									Static592.anIntArray592[local94] |= 0x10;
								} else {
									Static592.anIntArray592[local94] = 16;
								}
								Static360.anIntArray385[local94] = local55.anInt7445;
							}
							local94++;
							local523--;
						}
						if (!local18[arg10 + 2 & 0x3]) {
							arg5[2] = Static45.aBooleanArrayArray1[local73][local492 & 0x3];
						}
					} else if (!local18[arg10 + 2 & 0x3]) {
						arg5[2] = Static101.aBooleanArrayArray4[local73][local492 & 0x3];
					}
				}
			}
		}
		if (arg2 > 0) {
			local45 = arg11[arg2 - 1][arg9] & 0xFF;
			if (local45 > 0) {
				local55 = this.aClass369_3.method8410(local45 - 1);
				if (local55.anInt7442 != -1) {
					local73 = arg1[arg2 - 1][arg9];
					local492 = arg7[arg2 - 1][arg9];
					if (local55.aBoolean540) {
						local94 = 6;
						local523 = local492 * 2 + 4;
						local528 = Static46.method1366(local55, arg12);
						for (local530 = 0; local530 < 3; local530++) {
							local94 &= 0x7;
							local523 &= 0x7;
							if (Static385.aBooleanArrayArray13[local73][local523] && local55.anInt7445 >= Static360.anIntArray385[local94]) {
								Static173.anIntArray229[local94] = local55.anInt7442;
								Static367.anIntArray389[local94] = local528;
								Static205.anIntArray260[local94] = local55.anInt7443;
								Static461.anIntArray451[local94] = local55.anInt7448;
								if (Static360.anIntArray385[local94] == local55.anInt7445) {
									Static592.anIntArray592[local94] |= 0x8;
								} else {
									Static592.anIntArray592[local94] = 8;
								}
								Static360.anIntArray385[local94] = local55.anInt7445;
							}
							local94++;
							local523--;
						}
						if (!local18[arg10 + 3 & 0x3]) {
							arg5[3] = Static45.aBooleanArrayArray1[local73][local492 + 1 & 0x3];
						}
					} else if (!local18[arg10 + 3 & 0x3]) {
						arg5[3] = Static101.aBooleanArrayArray4[local73][local492 + 1 & 0x3];
					}
				}
			}
		}
		if (arg3 - 1 > arg2) {
			local45 = arg11[arg2 + 1][arg9] & 0xFF;
			if (local45 > 0) {
				local55 = this.aClass369_3.method8410(local45 - 1);
				if (local55.anInt7442 != -1) {
					local73 = arg1[arg2 + 1][arg9];
					local492 = arg7[arg2 + 1][arg9];
					if (local55.aBoolean540) {
						local94 = 4;
						local523 = local492 * 2 + 6;
						local528 = Static46.method1366(local55, arg12);
						for (local530 = 0; local530 < 3; local530++) {
							local523 &= 0x7;
							local94 &= 0x7;
							if (Static385.aBooleanArrayArray13[local73][local523] && Static360.anIntArray385[local94] <= local55.anInt7445) {
								Static173.anIntArray229[local94] = local55.anInt7442;
								Static367.anIntArray389[local94] = local528;
								Static205.anIntArray260[local94] = local55.anInt7443;
								Static461.anIntArray451[local94] = local55.anInt7448;
								if (local55.anInt7445 == Static360.anIntArray385[local94]) {
									Static592.anIntArray592[local94] |= 0x4;
								} else {
									Static592.anIntArray592[local94] = 4;
								}
								Static360.anIntArray385[local94] = local55.anInt7445;
							}
							local523++;
							local94--;
						}
						if (!local18[arg10 + 1 & 0x3]) {
							arg5[1] = Static45.aBooleanArrayArray1[local73][local492 + 3 & 0x3];
						}
					} else if (!local18[arg10 + 1 & 0x3]) {
						arg5[1] = Static101.aBooleanArrayArray4[local73][local492 + 3 & 0x3];
					}
				}
			}
		}
		if (arg8 == null) {
			return;
		}
		local45 = Static46.method1366(arg8, arg12);
		if (!arg8.aBoolean540) {
			return;
		}
		for (@Pc(1194) int local1194 = 0; local1194 < 8; local1194++) {
			@Pc(1205) int local1205 = local1194 - arg10 * 2 & 0x7;
			if (Static385.aBooleanArrayArray13[arg4][local1194] && arg8.anInt7445 >= Static360.anIntArray385[local1205]) {
				Static173.anIntArray229[local1205] = arg8.anInt7442;
				Static367.anIntArray389[local1205] = local45;
				Static205.anIntArray260[local1205] = arg8.anInt7443;
				Static461.anIntArray451[local1205] = arg8.anInt7448;
				if (arg8.anInt7445 == Static360.anIntArray385[local1205]) {
					Static592.anIntArray592[local1205] |= 0x2;
				} else {
					Static592.anIntArray592[local1205] = 2;
				}
				Static360.anIntArray385[local1205] = arg8.anInt7445;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILclient!ig;BII[Lclient!caa;I)V")
	public final void method2992(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class48[] arg4, @OriginalArg(6) int arg5) {
		@Pc(16) int local16;
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(35) int local35;
		if (!this.aBoolean269) {
			for (local16 = 0; local16 < 4; local16++) {
				@Pc(22) Class48 local22 = arg4[local16];
				for (local24 = 0; local24 < 64; local24++) {
					for (local28 = 0; local28 < 64; local28++) {
						local35 = arg0 + local24;
						@Pc(40) int local40 = arg5 + local28;
						if (local35 >= 0 && local35 < this.anInt3633 && local40 >= 0 && this.anInt3641 > local40) {
							local22.method1641(local35, local40);
						}
					}
				}
			}
		}
		local16 = arg0 + arg2;
		@Pc(90) int local90 = arg5 + arg3;
		for (local24 = 0; local24 < this.anInt3635; local24++) {
			for (local28 = 0; local28 < 64; local28++) {
				for (local35 = 0; local35 < 64; local35++) {
					this.method2998(0, local16 + local28, false, 0, local24, local35 + local90, local35 - -arg5, 0, local28 + arg0, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IILclient!s;Lclient!ha;[[ILclient!s;Lclient!s;)V")
	private void method2993(@OriginalArg(1) int arg0, @OriginalArg(2) Class86 arg1, @OriginalArg(3) Class16 arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) Class86 arg4, @OriginalArg(6) Class86 arg5) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3633; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt3641; local7++) {
				if (Static145.anInt3683 == -1 || Static116.method2609(Static145.anInt3683, arg0, local3, local7)) {
					@Pc(30) byte local30 = this.aByteArrayArrayArray14[arg0][local3][local7];
					@Pc(39) byte local39 = this.aByteArrayArrayArray15[arg0][local3][local7];
					@Pc(50) int local50 = this.aByteArrayArrayArray16[arg0][local3][local7] & 0xFF;
					@Pc(61) int local61 = this.aByteArrayArrayArray17[arg0][local3][local7] & 0xFF;
					@Pc(76) Class232 local76 = local50 == 0 ? null : this.aClass369_3.method8410(local50 - 1);
					@Pc(88) Class298 local88 = local61 == 0 ? null : this.aClass107_3.method3246(local61 - 1);
					if (local30 == 0 && local76 == null) {
						local30 = 12;
					}
					@Pc(99) int local99 = 0;
					@Pc(101) int local101 = 0;
					if (local30 != 0) {
						local101 = local76 == null ? 0 : Static543.anIntArray510[local30];
						local99 = local88 == null ? 0 : Static527.anIntArray505[local30];
					} else if (local76 != null) {
						local101 = Static543.anIntArray510[local30];
					} else if (local88 != null) {
						local99 = Static543.anIntArray510[local30];
					}
					@Pc(139) int local139 = local101 + local99;
					@Pc(141) int local141 = 0;
					if (local139 != 0) {
						@Pc(153) int local153 = local76 == null ? -1 : local76.anInt7443;
						@Pc(160) int local160 = local88 == null ? -1 : local88.anInt8766;
						@Pc(163) int[] local163 = new int[local139];
						@Pc(166) int[] local166 = new int[local139];
						@Pc(169) int[] local169 = new int[local139];
						@Pc(172) int[] local172 = new int[local139];
						@Pc(174) boolean local174 = false;
						@Pc(176) boolean local176 = false;
						@Pc(193) int local193;
						if (local76 == null || local76.anInt7442 == -1 && local76.anInt7449 == -1 && local153 == -1) {
							for (local193 = 0; local193 < local101; local193++) {
								local163[local141] = -1;
								local141++;
							}
							local176 = true;
						} else {
							for (local193 = 0; local193 < local101; local193++) {
								local169[local141] = local153;
								local172[local141] = local76.anInt7448;
								if (local76.anInt7442 == -1) {
									local163[local141] = -1;
								} else {
									local163[local141] = local76.anInt7442;
								}
								if (local76.anInt7449 == -1) {
									local166[local141] = -1;
								} else {
									local174 = true;
									local166[local141] = local76.anInt7449;
								}
								local141++;
							}
							if (!this.aBoolean269 && arg0 == 0) {
								Static554.method7788(local3, local7, local76.anInt7447, local76.anInt7436 * 8, local76.anInt7437);
							}
						}
						if (!local174) {
							local166 = null;
						}
						if (local88 == null) {
							if (local176) {
								continue;
							}
							for (local193 = 0; local193 < local99; local193++) {
								local163[local141] = -1;
								local141++;
							}
						} else {
							for (local193 = 0; local193 < local99; local193++) {
								local169[local141] = local160;
								local172[local141] = local88.anInt8772;
								local163[local141] = arg3[local3][local7];
								if (local166 != null) {
									local166[local141] = -1;
								}
								local141++;
							}
						}
						local193 = this.anIntArray187.length;
						@Pc(341) int[] local341 = new int[local193];
						@Pc(344) int[] local344 = new int[local193];
						@Pc(351) int[] local351 = arg5 == null ? null : new int[local193];
						@Pc(360) int[] local360 = arg5 == null && arg4 == null ? null : new int[local193];
						@Pc(369) int local369;
						@Pc(374) int local374;
						@Pc(458) int local458;
						@Pc(467) int local467;
						for (@Pc(362) int local362 = 0; local362 < local193; local362++) {
							local369 = this.anIntArray187[local362];
							local374 = this.anIntArray186[local362];
							if (local39 == 0) {
								local341[local362] = local369;
								local344[local362] = local374;
							} else if (local39 == 1) {
								local341[local362] = local374;
								local344[local362] = 512 - local369;
							} else if (local39 == 2) {
								local341[local362] = 512 - local369;
								local344[local362] = 512 - local374;
							} else if (local39 == 3) {
								local341[local362] = 512 - local374;
								local344[local362] = local369;
							}
							if (local351 != null && Static385.aBooleanArrayArray13[local30][local362]) {
								local458 = local341[local362] + (local3 << 9);
								local467 = (local7 << 9) + local344[local362];
								local351[local362] = arg5.method8088(local467, local458) - arg1.method8088(local467, local458);
							}
							if (local360 != null) {
								if (arg5 != null && !Static385.aBooleanArrayArray13[local30][local362]) {
									local458 = local341[local362] + (local3 << 9);
									local467 = (local7 << 9) + local344[local362];
									local360[local362] = arg1.method8088(local467, local458) - arg5.method8088(local467, local458);
								} else if (arg4 != null && !Static281.aBooleanArrayArray12[local30][local362]) {
									local458 = local341[local362] + (local3 << 9);
									local467 = (local7 << 9) + local344[local362];
									local360[local362] = arg4.method8088(local467, local458) - arg1.method8088(local467, local458);
								}
							}
						}
						local369 = arg1.method8086(local7, local3);
						local374 = arg1.method8086(local7, local3 + 1);
						local458 = arg1.method8086(local7 + 1, local3 - -1);
						local467 = arg1.method8086(local7 + 1, local3);
						@Pc(613) boolean local613 = Static61.method1675(local7, local3);
						if (local613 && arg0 > 1 || !local613 && arg0 > 0) {
							@Pc(629) boolean local629 = true;
							if (local88 != null && !local88.aBoolean621) {
								local629 = false;
							} else if (local61 == 0 && local30 != 0) {
								local629 = false;
							} else if (local50 > 0 && local76 != null && !local76.aBoolean537) {
								local629 = false;
							}
							if (local629 && local374 == local369 && local369 == local458 && local369 == local467) {
								this.aByteArrayArrayArray13[arg0][local3][local7] = (byte) (this.aByteArrayArrayArray13[arg0][local3][local7] | 0x4);
							}
						}
						@Pc(694) int local694 = 0;
						@Pc(696) int local696 = 0;
						@Pc(698) int local698 = 0;
						if (this.aBoolean269) {
							local694 = Static546.method7688(local3, local7);
							local696 = Static563.method7839(local3, local7);
							local698 = Static614.method5485(local3, local7);
						}
						arg1.method8081(local3, local7, local341, local351, local344, local360, Static434.anIntArrayArray42[local30], Static484.anIntArrayArray47[local30], Static189.anIntArrayArray24[local30], local163, local166, local169, local172, local694, local696, local698);
						Static493.method7210(arg0, local3, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IB[Lclient!caa;IILclient!ig;IIII)V")
	public final void method2994(@OriginalArg(0) int arg0, @OriginalArg(2) Class48[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class8_Sub8 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(15) int local15 = (arg7 & 0x7) * 8;
		@Pc(24) int local24;
		@Pc(54) int local54;
		if (!this.aBoolean269) {
			@Pc(22) Class48 local22 = arg1[arg0];
			for (local24 = 0; local24 < 8; local24++) {
				for (@Pc(28) int local28 = 0; local28 < 8; local28++) {
					@Pc(42) int local42 = arg3 + Static215.method4065(local28 & 0x7, local24 & 0x7, arg2);
					local54 = Static149.method3041(local24 & 0x7, arg2, local28 & 0x7) + arg5;
					if (local42 > 0 && local42 < this.anInt3633 - 1 && local54 > 0 && local54 < this.anInt3641 - 1) {
						local22.method1641(local42, local54);
					}
				}
			}
		}
		@Pc(99) int local99 = (arg8 & 0x7) * 8;
		@Pc(105) int local105 = (arg7 & 0xFFFFFFF8) << 3;
		local24 = (arg8 & 0x1FFFFFF8) << 3;
		@Pc(113) byte local113 = 0;
		@Pc(115) byte local115 = 0;
		if (arg2 == 1) {
			local115 = 1;
		} else if (arg2 == 2) {
			local115 = 1;
			local113 = 1;
		} else if (arg2 == 3) {
			local113 = 1;
		}
		for (local54 = 0; local54 < this.anInt3635; local54++) {
			for (@Pc(144) int local144 = 0; local144 < 64; local144++) {
				for (@Pc(148) int local148 = 0; local148 < 64; local148++) {
					if (local54 == arg6 && local15 <= local144 && local15 + 8 >= local144 && local99 <= local148 && local148 <= local99 + 8) {
						@Pc(218) int local218;
						@Pc(211) int local211;
						if (local15 + 8 == local144 || local148 == local99 + 8) {
							if (arg2 == 0) {
								local211 = local148 + arg5 - local99;
								local218 = arg3 + local144 - local15;
							} else if (arg2 == 1) {
								local211 = arg5 + local15 + 8 - local144;
								local218 = local148 + arg3 - local99;
							} else if (arg2 == 2) {
								local211 = arg5 + local99 + 8 - local148;
								local218 = arg3 + local15 + 8 - local144;
							} else {
								local218 = arg3 + local99 + 8 - local148;
								local211 = arg5 + local144 - local15;
							}
							this.method2998(0, local105 + local144, true, 0, arg0, local148 + local24, local211, 0, local218, arg4);
						} else {
							local218 = Static215.method4065(local148 & 0x7, local144 & 0x7, arg2) + arg3;
							local211 = arg5 + Static149.method3041(local144 & 0x7, arg2, local148 & 0x7);
							this.method2998(arg2, local105 + local144, false, local113, arg0, local148 + local24, local211, local115, local218, arg4);
						}
						if (local144 == 63 || local148 == 63) {
							@Pc(354) byte local354 = 1;
							if (local144 == 63 && local148 == 63) {
								local354 = 3;
							}
							for (@Pc(368) int local368 = 0; local368 < local354; local368++) {
								@Pc(372) int local372 = local144;
								@Pc(374) int local374 = local148;
								if (local368 == 0) {
									local374 = local148 == 63 ? 64 : local148;
									local372 = local144 == 63 ? 64 : local144;
								} else if (local368 == 1) {
									local372 = 64;
								} else if (local368 == 2) {
									local374 = 64;
								}
								@Pc(440) int local440;
								@Pc(431) int local431;
								if (arg2 == 0) {
									local431 = local374 + arg5 - local99;
									local440 = arg3 + local372 - local15;
								} else if (arg2 == 1) {
									local440 = local374 + arg3 - local99;
									local431 = local15 + arg5 + 8 - local372;
								} else if (arg2 == 2) {
									local431 = local99 + arg5 + 8 - local374;
									local440 = local15 + arg3 + 8 - local372;
								} else {
									local431 = arg5 + local372 - local15;
									local440 = arg3 + local99 + 8 - local374;
								}
								if (local440 >= 0 && local440 < this.anInt3633 && local431 >= 0 && local431 < this.anInt3641) {
									this.anIntArrayArrayArray8[arg0][local440][local431] = this.anIntArrayArrayArray8[arg0][local113 + local218][local115 + local211];
								}
							}
						}
					} else {
						this.method2998(0, 0, false, 0, 0, 0, -1, 0, -1, arg4);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!s;Lclient!ha;Lclient!s;Z)V")
	public final void method2995(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) Class86 arg2) {
		if (Static135.anIntArray177 == null || Static135.anIntArray177.length != this.anInt3641) {
			Static601.anIntArray602 = new int[this.anInt3641];
			Static29.anIntArray37 = new int[this.anInt3641];
			Static581.anIntArray583 = new int[this.anInt3641];
			Static609.anIntArray543 = new int[this.anInt3641];
			Static135.anIntArray177 = new int[this.anInt3641];
		}
		@Pc(38) int[][] local38 = new int[this.anInt3633][this.anInt3641];
		@Pc(46) int local46;
		for (@Pc(40) int local40 = 0; local40 < this.anInt3635; local40++) {
			for (local46 = 0; local46 < this.anInt3641; local46++) {
				Static135.anIntArray177[local46] = 0;
				Static601.anIntArray602[local46] = 0;
				Static609.anIntArray543[local46] = 0;
				Static29.anIntArray37[local46] = 0;
				Static581.anIntArray583[local46] = 0;
			}
			for (@Pc(75) int local75 = -5; local75 < this.anInt3633; local75++) {
				@Pc(85) int local85;
				@Pc(104) int local104;
				@Pc(170) int local170;
				for (@Pc(79) int local79 = 0; local79 < this.anInt3641; local79++) {
					local85 = local75 + 5;
					@Pc(150) int local150;
					if (local85 < this.anInt3633) {
						local104 = this.aByteArrayArrayArray17[local40][local85][local79] & 0xFF;
						if (local104 > 0) {
							@Pc(114) Class298 local114 = this.aClass107_3.method3246(local104 - 1);
							Static135.anIntArray177[local79] += local114.anInt8771;
							Static601.anIntArray602[local79] += local114.anInt8760;
							Static609.anIntArray543[local79] += local114.anInt8769;
							Static29.anIntArray37[local79] += local114.anInt8765;
							local150 = Static581.anIntArray583[local79]++;
						}
					}
					local104 = local75 - 5;
					if (local104 >= 0) {
						local170 = this.aByteArrayArrayArray17[local40][local104][local79] & 0xFF;
						if (local170 > 0) {
							@Pc(183) Class298 local183 = this.aClass107_3.method3246(local170 - 1);
							Static135.anIntArray177[local79] -= local183.anInt8771;
							Static601.anIntArray602[local79] -= local183.anInt8760;
							Static609.anIntArray543[local79] -= local183.anInt8769;
							Static29.anIntArray37[local79] -= local183.anInt8765;
							local150 = Static581.anIntArray583[local79]--;
						}
					}
				}
				if (local75 >= 0) {
					local85 = 0;
					local104 = 0;
					local170 = 0;
					@Pc(237) int local237 = 0;
					@Pc(239) int local239 = 0;
					for (@Pc(241) int local241 = -5; local241 < this.anInt3641; local241++) {
						@Pc(247) int local247 = local241 + 5;
						if (this.anInt3641 > local247) {
							local237 += Static29.anIntArray37[local247];
							local104 += Static601.anIntArray602[local247];
							local239 += Static581.anIntArray583[local247];
							local85 += Static135.anIntArray177[local247];
							local170 += Static609.anIntArray543[local247];
						}
						@Pc(285) int local285 = local241 - 5;
						if (local285 >= 0) {
							local104 -= Static601.anIntArray602[local285];
							local170 -= Static609.anIntArray543[local285];
							local85 -= Static135.anIntArray177[local285];
							local237 -= Static29.anIntArray37[local285];
							local239 -= Static581.anIntArray583[local285];
						}
						if (local241 >= 0 && local237 > 0 && local239 > 0) {
							local38[local75][local241] = Static630.method8491(local104 / local239, local170 / local239, local85 * 256 / local237);
						}
					}
				}
			}
			if (Static505.aBoolean635) {
				this.method2990(arg1, local40, local40 == 0 ? arg0 : null, Static34.aClass86Array5[local40], local38, local40 == 0 ? arg2 : null);
			} else {
				this.method2993(local40, Static34.aClass86Array5[local40], arg1, local38, local40 == 0 ? arg0 : null, local40 == 0 ? arg2 : null);
			}
			this.aByteArrayArrayArray17[local40] = null;
			this.aByteArrayArrayArray16[local40] = null;
			this.aByteArrayArrayArray14[local40] = null;
			this.aByteArrayArrayArray15[local40] = null;
		}
		if (!this.aBoolean269) {
			if (Static250.anInt5522 != 0) {
				Static67.method1755();
			}
			if (Static537.aBoolean657) {
				Static37.method1268();
			}
		}
		for (local46 = 0; local46 < this.anInt3635; local46++) {
			Static34.aClass86Array5[local46].YA();
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIBIII)V")
	public final void method2996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = arg2; local3 < arg2 + arg1; local3++) {
			for (local7 = arg3; local7 < arg3 + arg4; local7++) {
				if (local7 >= 0 && this.anInt3633 > local7 && local3 >= 0 && local3 < this.anInt3641) {
					this.anIntArrayArrayArray8[arg0][local7][local3] = arg0 <= 0 ? 0 : this.anIntArrayArrayArray8[arg0 - 1][local7][local3] - 960;
				}
			}
		}
		if (arg3 > 0 && arg3 < this.anInt3633) {
			for (local7 = arg2 + 1; local7 < arg1 + arg2; local7++) {
				if (local7 >= 0 && local7 < this.anInt3641) {
					this.anIntArrayArrayArray8[arg0][arg3][local7] = this.anIntArrayArrayArray8[arg0][arg3 - 1][local7];
				}
			}
		}
		if (arg2 > 0 && arg2 < this.anInt3641) {
			for (local7 = arg3 + 1; local7 < arg4 + arg3; local7++) {
				if (local7 >= 0 && this.anInt3633 > local7) {
					this.anIntArrayArrayArray8[arg0][local7][arg2] = this.anIntArrayArrayArray8[arg0][local7][arg2 - 1];
				}
			}
		}
		if (arg3 < 0 || arg2 < 0 || arg3 >= this.anInt3633 || this.anInt3641 <= arg2) {
			return;
		}
		if (arg0 == 0) {
			if (arg3 > 0 && this.anIntArrayArrayArray8[arg0][arg3 - 1][arg2] != 0) {
				this.anIntArrayArrayArray8[arg0][arg3][arg2] = this.anIntArrayArrayArray8[arg0][arg3 - 1][arg2];
				return;
			}
			if (arg2 > 0 && this.anIntArrayArrayArray8[arg0][arg3][arg2 - 1] != 0) {
				this.anIntArrayArrayArray8[arg0][arg3][arg2] = this.anIntArrayArrayArray8[arg0][arg3][arg2 - 1];
				return;
			}
			if (arg3 > 0 && arg2 > 0 && this.anIntArrayArrayArray8[arg0][arg3 - 1][arg2 - 1] != 0) {
				this.anIntArrayArrayArray8[arg0][arg3][arg2] = this.anIntArrayArrayArray8[arg0][arg3 - 1][arg2 - 1];
				return;
			}
			return;
		}
		if (arg3 > 0 && this.anIntArrayArrayArray8[arg0][arg3 - 1][arg2] != this.anIntArrayArrayArray8[arg0 - 1][arg3 - 1][arg2]) {
			this.anIntArrayArrayArray8[arg0][arg3][arg2] = this.anIntArrayArrayArray8[arg0][arg3 - 1][arg2];
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray8[arg0 - 1][arg3][arg2 - 1] != this.anIntArrayArrayArray8[arg0][arg3][arg2 - 1]) {
			this.anIntArrayArrayArray8[arg0][arg3][arg2] = this.anIntArrayArrayArray8[arg0][arg3][arg2 - 1];
			return;
		}
		if (arg3 > 0 && arg2 > 0 && this.anIntArrayArrayArray8[arg0 - 1][arg3 - 1][arg2 - 1] != this.anIntArrayArrayArray8[arg0][arg3 - 1][arg2 - 1]) {
			this.anIntArrayArrayArray8[arg0][arg3][arg2] = this.anIntArrayArrayArray8[arg0][arg3 - 1][arg2 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(B[Lclient!caa;Lclient!ha;[[[I)V")
	public final void method2997(@OriginalArg(1) Class48[] arg0, @OriginalArg(2) Class16 arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (!this.aBoolean269) {
			for (local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt3633; local10++) {
					for (local14 = 0; local14 < this.anInt3641; local14++) {
						if ((Static118.aByteArrayArrayArray20[local6][local10][local14] & 0x1) != 0) {
							@Pc(31) int local31 = local6;
							if ((Static118.aByteArrayArrayArray20[1][local10][local14] & 0x2) != 0) {
								local31 = local6 - 1;
							}
							if (local31 >= 0) {
								arg0[local31].method1643(local10, local14);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt3635; local6++) {
			local10 = 0;
			local14 = 0;
			if (!this.aBoolean269) {
				if (Static209.aBoolean369) {
					local14 = 8;
				}
				if (Static537.aBoolean657) {
					local10 = 2;
				}
				if (Static250.anInt5522 != 0) {
					if (Static524.aBoolean645 | local6 == 0) {
						local14 |= 0x10;
					}
					local10 |= 0x1;
				}
			}
			if (Static537.aBoolean657) {
				local14 |= 0x7;
			}
			if (!Static415.aBoolean567) {
				local14 |= 0x20;
			}
			@Pc(150) int[][] local150 = arg2 == null || local6 >= arg2.length ? this.anIntArrayArrayArray8[local6] : arg2[local6];
			Static269.method4650(local6, arg1.method6126(this.anInt3633, this.anInt3641, this.anIntArrayArrayArray8[local6], local150, local10, local14));
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIZIIIIIIILclient!ig;)V")
	private void method2998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class8_Sub8 arg9) {
		if (arg0 == 1) {
			arg7 = 1;
		} else if (arg0 == 2) {
			arg3 = 1;
			arg7 = 1;
		} else if (arg0 == 3) {
			arg3 = 1;
		}
		@Pc(81) int local81;
		if (arg8 < 0 || this.anInt3633 <= arg8 || arg6 < 0 || this.anInt3641 <= arg6) {
			while (true) {
				local81 = arg9.method8525();
				if (local81 == 0) {
					return;
				}
				if (local81 == 1) {
					arg9.method8525();
					return;
				}
				if (local81 <= 49) {
					arg9.method8525();
				}
			}
			return;
		}
		if (!this.aBoolean269 && !arg2) {
			Static118.aByteArrayArrayArray20[arg4][arg8][arg6] = 0;
		}
		while (true) {
			local81 = arg9.method8525();
			if (local81 == 0) {
				if (this.aBoolean269) {
					this.anIntArrayArrayArray8[0][arg3 + arg8][arg7 + arg6] = 0;
					return;
				} else if (arg4 == 0) {
					this.anIntArrayArrayArray8[0][arg3 + arg8][arg6 + arg7] = -Static626.method8433(arg1 + 932731, arg5 + 556238) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray8[arg4][arg8 + arg3][arg7 + arg6] = this.anIntArrayArrayArray8[arg4 - 1][arg3 + arg8][arg6 + arg7] - 960;
					return;
				}
			}
			if (local81 == 1) {
				@Pc(169) int local169 = arg9.method8525();
				if (!this.aBoolean269) {
					if (local169 == 1) {
						local169 = 0;
					}
					if (arg4 == 0) {
						this.anIntArrayArrayArray8[0][arg3 + arg8][arg7 + arg6] = -local169 * 8 << 2;
						return;
					}
					this.anIntArrayArrayArray8[arg4][arg8 + arg3][arg6 + arg7] = this.anIntArrayArrayArray8[arg4 - 1][arg3 + arg8][arg6 + arg7] - (local169 * 8 << 2);
					return;
				}
				this.anIntArrayArrayArray8[0][arg8 + arg3][arg7 + arg6] = local169 * 8 << 2;
				return;
			}
			if (local81 <= 49) {
				if (arg2) {
					arg9.method8525();
				} else {
					this.aByteArrayArrayArray16[arg4][arg8][arg6] = arg9.method8550();
					this.aByteArrayArrayArray14[arg4][arg8][arg6] = (byte) ((local81 - 2) / 4);
					this.aByteArrayArrayArray15[arg4][arg8][arg6] = (byte) (arg0 + local81 - 2 & 0x3);
				}
			} else if (local81 <= 81) {
				if (!this.aBoolean269 && !arg2) {
					Static118.aByteArrayArrayArray20[arg4][arg8][arg6] = (byte) (local81 - 49);
				}
			} else if (!arg2) {
				this.aByteArrayArrayArray17[arg4][arg8][arg6] = (byte) (local81 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIII)V")
	public final void method2999(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3635; local7++) {
			this.method2996(local7, 64, arg1, arg0, 64);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(II[[I)V")
	public final void method3000(@OriginalArg(2) int[][] arg0) {
		@Pc(14) int[][] local14 = this.anIntArrayArrayArray8[0];
		for (@Pc(16) int local16 = 0; local16 < this.anInt3633 + 1; local16++) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt3641 + 1; local20++) {
				local14[local16][local20] += arg0[local16][local20];
			}
		}
	}
}
