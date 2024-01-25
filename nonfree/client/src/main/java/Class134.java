import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public class Class134 {

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "[I")
	private final int[] anIntArray577 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "[I")
	private final int[] anIntArray578 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
	protected final int anInt6620;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
	public final int anInt6621;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
	protected final int anInt6630;

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "Lclient!bl;")
	private final Class23 aClass23_5;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "Lclient!hs;")
	private final Class112 aClass112_6;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "Z")
	public final boolean aBoolean442;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(IIIZLclient!hs;Lclient!bl;)V")
	protected Class134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class112 arg4, @OriginalArg(5) Class23 arg5) {
		this.anInt6620 = arg2;
		this.anInt6621 = arg0;
		this.anInt6630 = arg1;
		this.aClass23_5 = arg5;
		this.aClass112_6 = arg4;
		this.aBoolean442 = arg3;
		this.aByteArrayArrayArray12 = new byte[this.anInt6621][this.anInt6630][this.anInt6620];
		this.aByteArrayArrayArray15 = new byte[this.anInt6621][this.anInt6630][this.anInt6620];
		this.anIntArrayArrayArray15 = new int[this.anInt6621][this.anInt6630 + 1][this.anInt6620 + 1];
		this.aByteArrayArrayArray13 = new byte[this.anInt6621][this.anInt6630][this.anInt6620];
		this.aByteArrayArrayArray17 = new byte[this.anInt6621][this.anInt6630 + 1][this.anInt6620 + 1];
		this.aByteArrayArrayArray14 = new byte[this.anInt6621][this.anInt6630][this.anInt6620];
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([Lclient!wq;IIIILclient!tl;I)V")
	public final void method5142(@OriginalArg(0) Class268[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class4_Sub30 arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(29) int local29;
		if (!this.aBoolean442) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class268 local16 = arg0[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local29 = arg3 + local18;
						@Pc(34) int local34 = arg2 + local22;
						if (local29 >= 0 && local29 < this.anInt6630 && local34 >= 0 && this.anInt6620 > local34) {
							local16.method5813(local29, local34);
						}
					}
				}
			}
		}
		local10 = arg4 + arg3;
		@Pc(84) int local84 = arg1 + arg2;
		for (local18 = 0; local18 < this.anInt6621; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local29 = 0; local29 < 64; local29++) {
					this.method5148(false, local18, arg3 + local22, 0, 0, local10 + local22, local29 + arg2, arg5, local29 + local84, 0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!qa;Lclient!na;ILclient!na;BLclient!na;[[I)V")
	private void method5143(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class146 arg3, @OriginalArg(5) Class146 arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray13[arg2];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray15[arg2];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray14[arg2];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray12[arg2];
		for (@Pc(27) int local27 = 0; local27 < this.anInt6630; local27++) {
			@Pc(45) int local45 = local27 >= this.anInt6630 - 1 ? local27 : local27 + 1;
			for (@Pc(47) int local47 = 0; local47 < this.anInt6620; local47++) {
				@Pc(65) int local65 = local47 >= this.anInt6620 - 1 ? local47 : local47 + 1;
				if (Static317.anInt5682 == -1 || Static123.method5297(arg2, Static317.anInt5682, local27, local47)) {
					@Pc(79) boolean local79 = false;
					@Pc(81) boolean local81 = false;
					@Pc(84) boolean[] local84 = new boolean[4];
					@Pc(90) int local90 = local10[local27][local47];
					@Pc(96) int local96 = local15[local27][local47];
					@Pc(104) int local104 = local25[local27][local47] & 0xFF;
					@Pc(112) int local112 = local20[local27][local47] & 0xFF;
					@Pc(120) int local120 = local20[local27][local65] & 0xFF;
					@Pc(128) int local128 = local20[local45][local65] & 0xFF;
					@Pc(136) int local136 = local20[local45][local47] & 0xFF;
					if (local104 != 0 || local112 != 0) {
						@Pc(158) Class42 local158 = local104 == 0 ? null : this.aClass112_6.method2332(local104 - 1);
						if (local90 == 0 && local158 == null) {
							local90 = 12;
						}
						@Pc(184) Class13 local184 = local112 == 0 ? null : this.aClass23_5.method633(local112 - 1);
						@Pc(186) Class42 local186 = local158;
						if (local158 != null) {
							if (local158.anInt1625 == -1 && local158.anInt1624 == -1) {
								local186 = local158;
								local158 = null;
							} else if (local184 != null && local90 != 0) {
								local81 = local158.aBoolean111;
							}
						}
						@Pc(274) int local274;
						@Pc(325) int local325;
						@Pc(379) int local379;
						@Pc(389) int local389;
						if ((local90 == 0 || local90 == 12) && local27 > 0 && local47 > 0 && this.anInt6630 > local27 && this.anInt6620 > local47) {
							@Pc(251) int local251 = local112 == local20[local45][local47 - 1] ? 1 : -1;
							local274 = local20[local27 - 1][local47 - 1] == local112 ? 1 : -1;
							@Pc(291) int local291 = local112 == local20[local45][local65] ? 1 : -1;
							if (local20[local27][local47 - 1] == local112) {
								local274++;
								local251++;
							} else {
								local274--;
								local251--;
							}
							local325 = local20[local27 - 1][local65] == local112 ? 1 : -1;
							if (local112 == local20[local45][local47]) {
								local251++;
								local291++;
							} else {
								local291--;
								local251--;
							}
							if (local20[local27][local65] == local112) {
								local291++;
								local325++;
							} else {
								local325--;
								local291--;
							}
							if (local20[local27 - 1][local47] == local112) {
								local274++;
								local325++;
							} else {
								local274--;
								local325--;
							}
							local379 = local274 - local291;
							if (local379 < 0) {
								local379 = -local379;
							}
							local389 = local251 - local325;
							if (local389 < 0) {
								local389 = -local389;
							}
							if (local389 == local379) {
								local379 = arg4.I(local27, local47) - arg4.I(local45, local65);
								if (local379 < 0) {
									local379 = -local379;
								}
								local389 = arg4.I(local45, local47) - arg4.I(local27, local65);
								if (local389 < 0) {
									local389 = -local389;
								}
							}
							local96 = local379 < local389 ? 1 : 0;
						}
						for (local274 = 0; local274 < 13; local274++) {
							Static319.anIntArray497[local274] = -1;
							Static241.anIntArray358[local274] = 1;
						}
						@Pc(469) boolean[] local469 = local158 != null && local158.aBoolean111 ? Static170.aBooleanArrayArray7[local90] : Static210.aBooleanArrayArray3[local90];
						this.method5149(arg0, local10, local27, local90, local84, local96, local25, local15, local47, this.anInt6620, local184, this.anInt6630, local158);
						@Pc(502) boolean local502 = local158 != null && local158.anInt1624 != local158.anInt1625;
						if (!local502) {
							for (local325 = 0; local325 < 8; local325++) {
								if (Static319.anIntArray497[local325] >= 0 && Static343.anIntArray539[local325] != Static180.anIntArray277[local325]) {
									local502 = true;
									break;
								}
							}
						}
						if (!local469[local96 + 1 & 0x3]) {
							local84[1] = Static332.method4502(local84[1], (Static241.anIntArray358[2] & Static241.anIntArray358[4]) == 0);
						}
						if (!local469[local96 + 3 & 0x3]) {
							local84[3] = Static332.method4502(local84[3], (Static241.anIntArray358[0] & Static241.anIntArray358[6]) == 0);
						}
						if (!local469[local96 & 0x3]) {
							local84[0] = Static332.method4502(local84[0], (Static241.anIntArray358[0] & Static241.anIntArray358[2]) == 0);
						}
						if (!local469[local96 + 2 & 0x3]) {
							local84[2] = Static332.method4502(local84[2], (Static241.anIntArray358[4] & Static241.anIntArray358[6]) == 0);
						}
						if (!local81 && (local90 == 0 || local90 == 12)) {
							if (local84[0] && !local84[1] && !local84[2] && local84[3]) {
								local96 = 0;
								local90 = local90 == 0 ? 13 : 14;
								local84[0] = local84[3] = false;
							} else if (local84[0] && local84[1] && !local84[2] && !local84[3]) {
								local90 = local90 == 0 ? 13 : 14;
								local84[0] = local84[1] = false;
								local96 = 3;
							} else if (!local84[0] && local84[1] && local84[2] && !local84[3]) {
								local96 = 2;
								local84[1] = local84[2] = false;
								local90 = local90 == 0 ? 13 : 14;
							} else if (!local84[0] && !local84[1] && local84[2] && local84[3]) {
								local96 = 1;
								local84[2] = local84[3] = false;
								local90 = local90 == 0 ? 13 : 14;
							}
						}
						@Pc(805) boolean local805 = !local81 && !local84[0] && !local84[2] && !local84[1] && !local84[3];
						@Pc(807) int[] local807 = null;
						@Pc(815) int[] local815;
						@Pc(823) int[] local823;
						@Pc(835) int[] local835;
						if (local805) {
							local379 = local184 == null ? 0 : Static94.anIntArray127[local90];
							local835 = Static19.anIntArrayArray6[local90];
							local823 = Static146.anIntArrayArray22[local90];
							local389 = local158 == null ? 0 : Static369.anIntArray572[local90];
							local815 = Static163.anIntArrayArray30[local90];
						} else if (local81) {
							local815 = Static62.anIntArrayArray13[local90];
							local807 = Static27.anIntArrayArray7[local90];
							local823 = Static145.anIntArrayArray21[local90];
							local389 = local158 == null ? 0 : Static190.anIntArray305[local90];
							local835 = Static398.anIntArrayArray62[local90];
							local379 = local184 == null ? 0 : Static387.anIntArray581[local90];
						} else {
							local379 = local184 == null ? 0 : Static170.anIntArray478[local90];
							local807 = Static123.anIntArrayArray63[local90];
							local835 = Static229.anIntArrayArray35[local90];
							local389 = local158 == null ? 0 : Static53.anIntArray89[local90];
							local823 = Static142.anIntArrayArray20[local90];
							local815 = Static141.anIntArrayArray19[local90];
						}
						@Pc(909) int local909 = local379 + local389;
						if (local909 <= 0) {
							Static70.method5672(arg2, local27, local47);
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
							@Pc(939) int local939 = 0;
							@Pc(941) int local941 = 0;
							@Pc(945) int local945 = local909 * 3;
							@Pc(952) int[] local952 = local502 ? new int[local945] : null;
							@Pc(955) int[] local955 = new int[local945];
							@Pc(958) int[] local958 = new int[local945];
							@Pc(961) int[] local961 = new int[local945];
							@Pc(964) int[] local964 = new int[local945];
							@Pc(967) int[] local967 = new int[local945];
							@Pc(974) int[] local974 = arg1 == null ? null : new int[local945];
							@Pc(983) int[] local983 = arg1 == null && arg3 == null ? null : new int[local945];
							@Pc(985) int local985 = -1;
							@Pc(987) int local987 = -1;
							@Pc(989) int local989 = 256;
							@Pc(1057) byte local1057;
							@Pc(1011) int local1011;
							@Pc(1013) int local1013;
							@Pc(1244) int local1244;
							@Pc(1250) int local1250;
							@Pc(1258) int local1258;
							@Pc(1263) int local1263;
							@Pc(1280) int local1280;
							@Pc(1268) int local1268;
							@Pc(1278) int local1278;
							@Pc(1339) int local1339;
							@Pc(1345) int local1345;
							if (local158 != null) {
								local985 = local158.anInt1625;
								local987 = arg0.method4682() ? local158.anInt1631 : local158.anInt1632;
								local989 = local158.anInt1626;
								local1011 = Static387.method5233(local158, arg0);
								for (local1013 = 0; local1013 < local389; local1013++) {
									if (local84[-local96 & 0x3] && local807[0] == local939) {
										Static418.anIntArray624[0] = local815[local939];
										Static418.anIntArray624[1] = 1;
										Static418.anIntArray624[2] = local835[local939];
										Static418.anIntArray624[3] = 1;
										Static418.anIntArray624[4] = local823[local939];
										local1057 = 6;
										Static418.anIntArray624[5] = local835[local939];
									} else if (local84[2 - local96 & 0x3] && local939 == local807[2]) {
										Static418.anIntArray624[0] = local815[local939];
										Static418.anIntArray624[1] = 5;
										Static418.anIntArray624[2] = local835[local939];
										Static418.anIntArray624[3] = 5;
										Static418.anIntArray624[4] = local823[local939];
										local1057 = 6;
										Static418.anIntArray624[5] = local835[local939];
									} else if (local84[1 - local96 & 0x3] && local807[1] == local939) {
										Static418.anIntArray624[0] = local815[local939];
										Static418.anIntArray624[1] = 3;
										Static418.anIntArray624[2] = local835[local939];
										Static418.anIntArray624[3] = 3;
										Static418.anIntArray624[4] = local823[local939];
										local1057 = 6;
										Static418.anIntArray624[5] = local835[local939];
									} else if (local84[3 - local96 & 0x3] && local939 == local807[3]) {
										Static418.anIntArray624[0] = local815[local939];
										Static418.anIntArray624[1] = 7;
										Static418.anIntArray624[2] = local835[local939];
										Static418.anIntArray624[3] = 7;
										Static418.anIntArray624[4] = local823[local939];
										local1057 = 6;
										Static418.anIntArray624[5] = local835[local939];
									} else {
										Static418.anIntArray624[0] = local815[local939];
										Static418.anIntArray624[1] = local823[local939];
										Static418.anIntArray624[2] = local835[local939];
										local1057 = 3;
									}
									for (local1244 = 0; local1244 < local1057; local1244++) {
										local1250 = Static418.anIntArray624[local1244];
										local1258 = local1250 - local96 * 2 & 0x7;
										local1263 = this.anIntArray577[local1250];
										local1268 = this.anIntArray578[local1250];
										if (local96 == 1) {
											local1278 = 128 - local1263;
											local1280 = local1268;
										} else if (local96 == 2) {
											local1280 = 128 - local1263;
											local1278 = 128 - local1268;
										} else if (local96 == 3) {
											local1278 = local1263;
											local1280 = 128 - local1268;
										} else {
											local1278 = local1268;
											local1280 = local1263;
										}
										local955[local941] = local1280;
										local958[local941] = local1278;
										if (local974 != null && Static304.aBooleanArrayArray6[local90][local1250]) {
											local1339 = local1280 + (local27 << 7);
											local1345 = (local47 << 7) + local1278;
											local974[local941] = arg1.va(local1339, local1345) - arg4.va(local1339, local1345);
										}
										if (local983 != null) {
											if (arg1 != null && !Static304.aBooleanArrayArray6[local90][local1250]) {
												local1339 = local1280 + (local27 << 7);
												local1345 = (local47 << 7) + local1278;
												local983[local941] = arg4.va(local1339, local1345) - arg1.va(local1339, local1345);
											} else if (arg3 != null && !Static40.aBooleanArrayArray1[local90][local1250]) {
												local1339 = (local27 << 7) + local1280;
												local1345 = local1278 + (local47 << 7);
												local983[local941] = arg3.va(local1339, local1345) - arg4.va(local1339, local1345);
											}
										}
										if (local1250 < 8 && local158.anInt1628 < Static319.anIntArray497[local1258]) {
											if (local952 != null) {
												local952[local941] = Static180.anIntArray277[local1258];
											}
											local967[local941] = Static272.anIntArray438[local1258];
											local964[local941] = Static359.anIntArray560[local1258];
											local961[local941] = Static343.anIntArray539[local1258];
										} else {
											if (local952 != null) {
												local952[local941] = local1011;
											}
											local964[local941] = arg0.method4682() ? local158.anInt1631 : local158.anInt1632;
											local967[local941] = local158.anInt1626;
											local961[local941] = local985;
										}
										local941++;
									}
									local939++;
								}
								if (!this.aBoolean442 && arg2 == 0) {
									Static122.method1873(local27, local47, local158.anInt1623, local158.anInt1634 * 8, local158.anInt1630);
								}
								if (local90 != 12 && local158.anInt1625 != -1 && local158.aBoolean112) {
									local79 = true;
								}
							} else if (local805) {
								local939 = Static369.anIntArray572[local90];
							} else if (local81) {
								local939 = Static190.anIntArray305[local90];
							} else {
								local939 = Static53.anIntArray89[local90];
							}
							if (local184 != null) {
								if (local128 == 0) {
									local128 = local112;
								}
								if (local120 == 0) {
									local120 = local112;
								}
								if (local136 == 0) {
									local136 = local112;
								}
								@Pc(1600) Class13 local1600 = this.aClass23_5.method633(local112 - 1);
								@Pc(1608) Class13 local1608 = this.aClass23_5.method633(local120 - 1);
								@Pc(1616) Class13 local1616 = this.aClass23_5.method633(local128 - 1);
								@Pc(1624) Class13 local1624 = this.aClass23_5.method633(local136 - 1);
								for (local1258 = 0; local1258 < local379; local1258++) {
									if (local84[-local96 & 0x3] && local807[0] == local939) {
										Static418.anIntArray624[0] = local815[local939];
										Static418.anIntArray624[1] = 1;
										Static418.anIntArray624[2] = local835[local939];
										Static418.anIntArray624[3] = 1;
										Static418.anIntArray624[4] = local823[local939];
										Static418.anIntArray624[5] = local835[local939];
										local1057 = 6;
									} else if (local84[2 - local96 & 0x3] && local807[2] == local939) {
										Static418.anIntArray624[0] = local815[local939];
										Static418.anIntArray624[1] = 5;
										Static418.anIntArray624[2] = local835[local939];
										Static418.anIntArray624[3] = 5;
										Static418.anIntArray624[4] = local823[local939];
										local1057 = 6;
										Static418.anIntArray624[5] = local835[local939];
									} else if (local84[1 - local96 & 0x3] && local939 == local807[1]) {
										Static418.anIntArray624[0] = local815[local939];
										Static418.anIntArray624[1] = 3;
										Static418.anIntArray624[2] = local835[local939];
										Static418.anIntArray624[3] = 3;
										Static418.anIntArray624[4] = local823[local939];
										local1057 = 6;
										Static418.anIntArray624[5] = local835[local939];
									} else if (local84[3 - local96 & 0x3] && local807[3] == local939) {
										Static418.anIntArray624[0] = local815[local939];
										Static418.anIntArray624[1] = 7;
										Static418.anIntArray624[2] = local835[local939];
										Static418.anIntArray624[3] = 7;
										Static418.anIntArray624[4] = local823[local939];
										Static418.anIntArray624[5] = local835[local939];
										local1057 = 6;
									} else {
										Static418.anIntArray624[0] = local815[local939];
										Static418.anIntArray624[1] = local823[local939];
										Static418.anIntArray624[2] = local835[local939];
										local1057 = 3;
									}
									for (local1263 = 0; local1263 < local1057; local1263++) {
										local1280 = Static418.anIntArray624[local1263];
										local1268 = local1280 - local96 * 2 & 0x7;
										local1278 = this.anIntArray577[local1280];
										local1345 = this.anIntArray578[local1280];
										@Pc(1889) int local1889;
										if (local96 == 1) {
											local1889 = 128 - local1278;
											local1339 = local1345;
										} else if (local96 == 2) {
											local1889 = 128 - local1345;
											local1339 = 128 - local1278;
										} else if (local96 == 3) {
											local1889 = local1278;
											local1339 = 128 - local1345;
										} else {
											local1889 = local1345;
											local1339 = local1278;
										}
										local955[local941] = local1339;
										local958[local941] = local1889;
										@Pc(1948) int local1948;
										@Pc(1954) int local1954;
										if (local974 != null && Static304.aBooleanArrayArray6[local90][local1280]) {
											local1948 = (local27 << 7) + local1339;
											local1954 = local1889 + (local47 << 7);
											local974[local941] = arg1.va(local1948, local1954) - arg4.va(local1948, local1954);
										}
										if (local983 != null) {
											if (arg1 != null && !Static304.aBooleanArrayArray6[local90][local1280]) {
												local1948 = (local27 << 7) + local1339;
												local1954 = (local47 << 7) + local1889;
												local983[local941] = arg4.va(local1948, local1954) - arg1.va(local1948, local1954);
											} else if (arg3 != null && !Static40.aBooleanArrayArray1[local90][local1280]) {
												local1948 = (local27 << 7) + local1339;
												local1954 = (local47 << 7) + local1889;
												local983[local941] = arg3.va(local1948, local1954) - arg4.va(local1948, local1954);
											}
										}
										if (local1280 < 8 && Static319.anIntArray497[local1268] >= 0) {
											if (local952 != null) {
												local952[local941] = Static180.anIntArray277[local1268];
											}
											local967[local941] = Static272.anIntArray438[local1268];
											local964[local941] = Static359.anIntArray560[local1268];
											local961[local941] = Static343.anIntArray539[local1268];
										} else {
											if (local81 && Static304.aBooleanArrayArray6[local90][local1280]) {
												local964[local941] = local987;
												local967[local941] = local989;
												local961[local941] = local985;
											} else if (local1339 == 0 && local1889 == 0) {
												local961[local941] = arg5[local27][local47];
												local964[local941] = local1600.anInt409;
												local967[local941] = local1600.anInt416;
											} else if (local1339 == 0 && local1889 == 128) {
												local961[local941] = arg5[local27][local65];
												local964[local941] = local1608.anInt409;
												local967[local941] = local1608.anInt416;
											} else if (local1339 == 128 && local1889 == 128) {
												local961[local941] = arg5[local45][local65];
												local964[local941] = local1616.anInt409;
												local967[local941] = local1616.anInt416;
											} else if (local1339 == 128 && local1889 == 0) {
												local961[local941] = arg5[local45][local47];
												local964[local941] = local1624.anInt409;
												local967[local941] = local1624.anInt416;
											} else {
												if (local1339 >= 64) {
													if (local1889 < 64) {
														local964[local941] = local1624.anInt409;
														local967[local941] = local1624.anInt416;
													} else {
														local964[local941] = local1616.anInt409;
														local967[local941] = local1616.anInt416;
													}
												} else if (local1889 >= 64) {
													local964[local941] = local1608.anInt409;
													local967[local941] = local1608.anInt416;
												} else {
													local964[local941] = local1600.anInt409;
													local967[local941] = local1600.anInt416;
												}
												local1948 = Static394.method5278(arg5[local27][local47], arg5[local45][local47], local1339 << 7 >> 7);
												local1954 = Static394.method5278(arg5[local27][local65], arg5[local45][local65], local1339 << 7 >> 7);
												local961[local941] = Static394.method5278(local1948, local1954, local1889 << 7 >> 7);
											}
											if (local952 != null) {
												local952[local941] = local961[local941];
											}
										}
										local941++;
									}
									local939++;
								}
								if (local90 != 0 && local184.aBoolean17) {
									local79 = true;
								}
							}
							local1011 = arg4.I(local27, local47);
							local1013 = arg4.I(local45, local47);
							local1244 = arg4.I(local45, local65);
							local1250 = arg4.I(local27, local65);
							if (arg2 > 0) {
								@Pc(2371) boolean local2371 = true;
								if (local112 == 0 && local90 != 0) {
									local2371 = false;
								}
								if (local104 > 0 && local186 != null && !local186.aBoolean110) {
									local2371 = false;
								}
								if (local2371 && local1013 == local1011 && local1011 == local1244 && local1011 == local1250) {
									this.aByteArrayArrayArray17[arg2][local27][local47] = (byte) (this.aByteArrayArrayArray17[arg2][local27][local47] | 0x4);
								}
							}
							local1258 = 0;
							local1263 = 0;
							local1280 = 0;
							if (this.aBoolean442) {
								local1258 = Static50.method1034(local27, local47);
								local1263 = Static134.method1949(local27, local47);
								local1280 = Static285.method3975(local27, local47);
							}
							arg4.JA(local27, local47, local955, local974, local958, local983, local961, local952, local964, local967, local1258, local1263, local1280, local79);
							Static70.method5672(arg2, local27, local47);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!na;Lclient!qa;BLclient!na;)V")
	public final void method5145(@OriginalArg(0) Class146 arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(3) Class146 arg2) {
		if (Static366.anIntArray569 == null || Static366.anIntArray569.length != this.anInt6620) {
			Static310.anIntArray474 = new int[this.anInt6620];
			Static366.anIntArray569 = new int[this.anInt6620];
			Static365.anIntArray568 = new int[this.anInt6620];
			Static74.anIntArray109 = new int[this.anInt6620];
			Static424.anIntArray629 = new int[this.anInt6620];
		}
		@Pc(38) int[][] local38 = new int[this.anInt6630][this.anInt6620];
		@Pc(52) int local52;
		for (@Pc(48) int local48 = 0; local48 < this.anInt6621; local48++) {
			for (local52 = 0; local52 < this.anInt6620; local52++) {
				Static366.anIntArray569[local52] = 0;
				Static74.anIntArray109[local52] = 0;
				Static310.anIntArray474[local52] = 0;
				Static424.anIntArray629[local52] = 0;
				Static365.anIntArray568[local52] = 0;
			}
			for (@Pc(81) int local81 = -5; local81 < this.anInt6630; local81++) {
				@Pc(91) int local91;
				@Pc(110) int local110;
				@Pc(182) int local182;
				for (@Pc(85) int local85 = 0; local85 < this.anInt6620; local85++) {
					local91 = local81 + 5;
					@Pc(159) int local159;
					if (this.anInt6630 > local91) {
						local110 = this.aByteArrayArrayArray14[local48][local91][local85] & 0xFF;
						if (local110 > 0) {
							@Pc(123) Class13 local123 = this.aClass23_5.method633(local110 - 1);
							Static366.anIntArray569[local85] += local123.anInt415;
							Static74.anIntArray109[local85] += local123.anInt406;
							Static310.anIntArray474[local85] += local123.anInt413;
							Static424.anIntArray629[local85] += local123.anInt405;
							local159 = Static365.anIntArray568[local85]++;
						}
					}
					local110 = local81 - 5;
					if (local110 >= 0) {
						local182 = this.aByteArrayArrayArray14[local48][local110][local85] & 0xFF;
						if (local182 > 0) {
							@Pc(192) Class13 local192 = this.aClass23_5.method633(local182 - 1);
							Static366.anIntArray569[local85] -= local192.anInt415;
							Static74.anIntArray109[local85] -= local192.anInt406;
							Static310.anIntArray474[local85] -= local192.anInt413;
							Static424.anIntArray629[local85] -= local192.anInt405;
							local159 = Static365.anIntArray568[local85]--;
						}
					}
				}
				if (local81 >= 0) {
					local91 = 0;
					local110 = 0;
					local182 = 0;
					@Pc(250) int local250 = 0;
					@Pc(252) int local252 = 0;
					for (@Pc(254) int local254 = -5; local254 < this.anInt6620; local254++) {
						@Pc(260) int local260 = local254 + 5;
						if (local260 < this.anInt6620) {
							local182 += Static310.anIntArray474[local260];
							local250 += Static424.anIntArray629[local260];
							local252 += Static365.anIntArray568[local260];
							local91 += Static366.anIntArray569[local260];
							local110 += Static74.anIntArray109[local260];
						}
						@Pc(298) int local298 = local254 - 5;
						if (local298 >= 0) {
							local110 -= Static74.anIntArray109[local298];
							local91 -= Static366.anIntArray569[local298];
							local182 -= Static310.anIntArray474[local298];
							local252 -= Static365.anIntArray568[local298];
							local250 -= Static424.anIntArray629[local298];
						}
						if (local254 >= 0 && local250 > 0 && local252 > 0) {
							local38[local81][local254] = Static384.method4870(local110 / local252, local91 * 256 / local250, local182 / local252);
						}
					}
				}
			}
			if (Static76.aBoolean121) {
				this.method5143(arg1, local48 == 0 ? arg0 : null, local48, local48 == 0 ? arg2 : null, Static346.aClass146Array2[local48], local38);
			} else {
				this.method5151(arg1, local48 == 0 ? arg0 : null, local48, local48 == 0 ? arg2 : null, local38, Static346.aClass146Array2[local48]);
			}
			this.aByteArrayArrayArray14[local48] = null;
			this.aByteArrayArrayArray12[local48] = null;
			this.aByteArrayArrayArray13[local48] = null;
			this.aByteArrayArrayArray15[local48] = null;
		}
		if (!this.aBoolean442) {
			if (Static343.anInt6178 != 0) {
				Static305.method4206();
			}
			if (Static214.aBoolean303) {
				Static285.method3980();
			}
		}
		for (local52 = 0; local52 < this.anInt6621; local52++) {
			Static346.aClass146Array2[local52].f();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!tl;IIIII[Lclient!wq;III)V")
	public final void method5146(@OriginalArg(0) Class4_Sub30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class268[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(11) int local11 = (arg2 & 0x7) * 8;
		@Pc(17) int local17 = (arg5 & 0x7) * 8;
		@Pc(30) int local30;
		if (!this.aBoolean442) {
			@Pc(24) Class268 local24 = arg6[arg4];
			for (@Pc(26) int local26 = 0; local26 < 8; local26++) {
				for (local30 = 0; local30 < 8; local30++) {
					@Pc(44) int local44 = Static236.method3283(local30 & 0x7, local26 & 0x7, arg7) + arg3;
					@Pc(56) int local56 = Static333.method4505(arg7, local30 & 0x7, local26 & 0x7) + arg1;
					if (local44 > 0 && this.anInt6630 - 1 > local44 && local56 > 0 && this.anInt6620 - 1 > local56) {
						local24.method5813(local44, local56);
					}
				}
			}
		}
		@Pc(106) int local106 = (arg2 & 0xFFFFFFF8) << 3;
		local30 = (arg5 & 0x1FFFFFF8) << 3;
		@Pc(114) byte local114 = 0;
		@Pc(116) byte local116 = 0;
		if (arg7 == 1) {
			local116 = 1;
		} else if (arg7 == 2) {
			local116 = 1;
			local114 = 1;
		} else if (arg7 == 3) {
			local114 = 1;
		}
		for (@Pc(143) int local143 = 0; local143 < this.anInt6621; local143++) {
			for (@Pc(147) int local147 = 0; local147 < 64; local147++) {
				for (@Pc(151) int local151 = 0; local151 < 64; local151++) {
					if (local143 == arg8 && local147 >= local11 && local147 <= local11 + 8 && local17 <= local151 && local151 <= local17 + 8) {
						@Pc(206) int local206;
						@Pc(218) int local218;
						if (local147 == local11 + 8 || local17 + 8 == local151) {
							if (arg7 == 0) {
								local218 = arg1 + local151 - local17;
								local206 = arg3 + local147 - local11;
							} else if (arg7 == 1) {
								local206 = local151 + arg3 - local17;
								local218 = local11 + arg1 + 8 - local147;
							} else if (arg7 == 2) {
								local218 = local17 + arg1 + 8 - local151;
								local206 = arg3 + local11 + 8 - local147;
							} else {
								local206 = arg3 + local17 + 8 - local151;
								local218 = arg1 + local147 - local11;
							}
							this.method5148(true, arg4, local206, 0, 0, local147 + local106, local218, arg0, local151 + local30, 0);
						} else {
							local206 = arg3 + Static236.method3283(local151 & 0x7, local147 & 0x7, arg7);
							local218 = Static333.method4505(arg7, local151 & 0x7, local147 & 0x7) + arg1;
							this.method5148(false, arg4, local206, arg7, local116, local106 + local147, local218, arg0, local151 + local30, local114);
							if (local147 == 63 || local151 == 63) {
								@Pc(253) int local253 = local147 == 63 ? 64 : local147;
								@Pc(262) int local262 = local151 == 63 ? 64 : local151;
								@Pc(281) int local281;
								@Pc(274) int local274;
								if (arg7 == 0) {
									local274 = local262 + arg1 - local17;
									local281 = arg3 + local253 - local11;
								} else if (arg7 == 1) {
									local274 = arg1 + local11 + 8 - local253;
									local281 = arg3 + local262 - local17;
								} else if (arg7 == 2) {
									local274 = local17 + arg1 + 8 - local262;
									local281 = arg3 + local11 + 8 - local253;
								} else {
									local274 = arg1 + local253 - local11;
									local281 = local17 + arg3 + 8 - local262;
								}
								if (local281 >= 0 && this.anInt6630 > local281 && local274 >= 0 && this.anInt6620 > local274) {
									this.anIntArrayArrayArray15[arg4][local281][local274] = this.anIntArrayArrayArray15[arg4][local206 + local114][local116 + local218];
								}
							}
						}
					} else {
						this.method5148(false, 0, -1, 0, 0, 0, -1, arg0, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIII)V")
	public final void method5147(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6621; local3++) {
			this.method5155(arg0, 64, 64, local3, arg1);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZIIIIIIILclient!tl;II)V")
	private void method5148(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class4_Sub30 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg3 == 1) {
			arg4 = 1;
		} else if (arg3 == 2) {
			arg9 = 1;
			arg4 = 1;
		} else if (arg3 == 3) {
			arg9 = 1;
		}
		@Pc(70) int local70;
		if (arg2 < 0 || arg2 >= this.anInt6630 || arg6 < 0 || this.anInt6620 <= arg6) {
			while (true) {
				local70 = arg7.method4864();
				if (local70 == 0) {
					return;
				}
				if (local70 == 1) {
					arg7.method4864();
					return;
				}
				if (local70 <= 49) {
					arg7.method4864();
				}
			}
			return;
		}
		if (!this.aBoolean442 && !arg0) {
			Static327.aByteArrayArrayArray11[arg1][arg2][arg6] = 0;
		}
		while (true) {
			local70 = arg7.method4864();
			if (local70 == 0) {
				if (this.aBoolean442) {
					this.anIntArrayArrayArray15[0][arg9 + arg2][arg4 + arg6] = 0;
					return;
				} else if (arg1 == 0) {
					this.anIntArrayArrayArray15[0][arg9 + arg2][arg4 + arg6] = -Static36.method656(arg8 + 556238, 932731 - -arg5) * 8 << 0;
					return;
				} else {
					this.anIntArrayArrayArray15[arg1][arg9 + arg2][arg4 + arg6] = this.anIntArrayArrayArray15[arg1 - 1][arg9 + arg2][arg4 + arg6] - 240;
					return;
				}
			}
			if (local70 == 1) {
				@Pc(160) int local160 = arg7.method4864();
				if (this.aBoolean442) {
					this.anIntArrayArrayArray15[0][arg2 + arg9][arg6 + arg4] = local160 * 8 << 0;
					return;
				}
				if (local160 == 1) {
					local160 = 0;
				}
				if (arg1 == 0) {
					this.anIntArrayArrayArray15[0][arg2 + arg9][arg6 + arg4] = -local160 * 8 << 0;
					return;
				}
				this.anIntArrayArrayArray15[arg1][arg9 + arg2][arg6 + arg4] = this.anIntArrayArrayArray15[arg1 - 1][arg9 + arg2][arg4 + arg6] - (local160 * 8 << 0);
				return;
			}
			if (local70 <= 49) {
				if (arg0) {
					arg7.method4864();
				} else {
					this.aByteArrayArrayArray12[arg1][arg2][arg6] = arg7.method4865();
					this.aByteArrayArrayArray13[arg1][arg2][arg6] = (byte) ((local70 - 2) / 4);
					this.aByteArrayArrayArray15[arg1][arg2][arg6] = (byte) (arg3 + local70 - 2 & 0x3);
				}
			} else if (local70 <= 81) {
				if (!this.aBoolean442 && !arg0) {
					Static327.aByteArrayArrayArray11[arg1][arg2][arg6] = (byte) (local70 - 49);
				}
			} else if (!arg0) {
				this.aByteArrayArrayArray14[arg1][arg2][arg6] = (byte) (local70 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!qa;[[BII[ZII[[B[[BIILclient!ao;ILclient!cw;)V")
	private void method5149(@OriginalArg(0) Class30 arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class13 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class42 arg12) {
		@Pc(58) int local58;
		if (arg12 != null && arg10 != null || arg10 != null && arg3 == 12 || arg12 != null && arg3 == 0) {
			@Pc(39) boolean[] local39 = arg12 != null && arg12.aBoolean111 ? Static170.aBooleanArrayArray7[arg3] : Static210.aBooleanArrayArray3[arg3];
			@Pc(71) Class42 local71;
			@Pc(88) byte local88;
			@Pc(105) int local105;
			@Pc(112) int local112;
			if (arg8 > 0) {
				if (arg2 > 0) {
					local58 = arg6[arg2 - 1][arg8 - 1] & 0xFF;
					if (local58 > 0) {
						local71 = this.aClass112_6.method2332(local58 - 1);
						if (local71.anInt1625 != -1 && local71.aBoolean111) {
							local88 = arg1[arg2 - 1][arg8 - 1];
							local105 = arg7[arg2 - 1][arg8 - 1] * 2 + 4 & 0x7;
							local112 = Static387.method5233(local71, arg0);
							if (Static304.aBooleanArrayArray6[local88][local105]) {
								Static343.anIntArray539[0] = local71.anInt1625;
								Static180.anIntArray277[0] = local112;
								Static359.anIntArray560[0] = arg0.method4682() ? local71.anInt1631 : local71.anInt1632;
								Static272.anIntArray438[0] = local71.anInt1626;
								Static319.anIntArray497[0] = local71.anInt1628;
								Static241.anIntArray358[0] = 256;
							}
						}
					}
				}
				if (arg11 - 1 > arg2) {
					local58 = arg6[arg2 + 1][arg8 - 1] & 0xFF;
					if (local58 > 0) {
						local71 = this.aClass112_6.method2332(local58 - 1);
						if (local71.anInt1625 != -1 && local71.aBoolean111) {
							local88 = arg1[arg2 + 1][arg8 - 1];
							local105 = arg7[arg2 + 1][arg8 - 1] * 2 + 6 & 0x7;
							local112 = Static387.method5233(local71, arg0);
							if (Static304.aBooleanArrayArray6[local88][local105]) {
								Static343.anIntArray539[2] = local71.anInt1625;
								Static180.anIntArray277[2] = local112;
								Static359.anIntArray560[2] = arg0.method4682() ? local71.anInt1631 : local71.anInt1632;
								Static272.anIntArray438[2] = local71.anInt1626;
								Static319.anIntArray497[2] = local71.anInt1628;
								Static241.anIntArray358[2] = 512;
							}
						}
					}
				}
			}
			if (arg8 < arg9 - 1) {
				if (arg2 > 0) {
					local58 = arg6[arg2 - 1][arg8 + 1] & 0xFF;
					if (local58 > 0) {
						local71 = this.aClass112_6.method2332(local58 - 1);
						if (local71.anInt1625 != -1 && local71.aBoolean111) {
							local88 = arg1[arg2 - 1][arg8 + 1];
							local105 = arg7[arg2 - 1][arg8 + 1] * 2 + 2 & 0x7;
							local112 = Static387.method5233(local71, arg0);
							if (Static304.aBooleanArrayArray6[local88][local105]) {
								Static343.anIntArray539[6] = local71.anInt1625;
								Static180.anIntArray277[6] = local112;
								Static359.anIntArray560[6] = arg0.method4682() ? local71.anInt1631 : local71.anInt1632;
								Static272.anIntArray438[6] = local71.anInt1626;
								Static319.anIntArray497[6] = local71.anInt1628;
								Static241.anIntArray358[6] = 64;
							}
						}
					}
				}
				if (arg2 < arg11 - 1) {
					local58 = arg6[arg2 + 1][arg8 + 1] & 0xFF;
					if (local58 > 0) {
						local71 = this.aClass112_6.method2332(local58 - 1);
						if (local71.anInt1625 != -1 && local71.aBoolean111) {
							local88 = arg1[arg2 + 1][arg8 + 1];
							local105 = arg7[arg2 + 1][arg8 + 1] * 2 & 0x7;
							local112 = Static387.method5233(local71, arg0);
							if (Static304.aBooleanArrayArray6[local88][local105]) {
								Static343.anIntArray539[4] = local71.anInt1625;
								Static180.anIntArray277[4] = local112;
								Static359.anIntArray560[4] = arg0.method4682() ? local71.anInt1631 : local71.anInt1632;
								Static272.anIntArray438[4] = local71.anInt1626;
								Static319.anIntArray497[4] = local71.anInt1628;
								Static241.anIntArray358[4] = 128;
							}
						}
					}
				}
			}
			@Pc(567) int local567;
			@Pc(572) int local572;
			@Pc(574) int local574;
			@Pc(534) byte local534;
			if (arg8 > 0) {
				local58 = arg6[arg2][arg8 - 1] & 0xFF;
				if (local58 > 0) {
					local71 = this.aClass112_6.method2332(local58 - 1);
					if (local71.anInt1625 != -1) {
						local88 = arg1[arg2][arg8 - 1];
						local534 = arg7[arg2][arg8 - 1];
						if (local71.aBoolean111) {
							local112 = 2;
							local567 = local534 * 2 + 4;
							local572 = Static387.method5233(local71, arg0);
							for (local574 = 0; local574 < 3; local574++) {
								local567 &= 0x7;
								local112 &= 0x7;
								if (Static304.aBooleanArrayArray6[local88][local567] && Static319.anIntArray497[local112] <= local71.anInt1628) {
									Static343.anIntArray539[local112] = local71.anInt1625;
									Static180.anIntArray277[local112] = local572;
									Static359.anIntArray560[local112] = arg0.method4682() ? local71.anInt1631 : local71.anInt1632;
									Static272.anIntArray438[local112] = local71.anInt1626;
									if (Static319.anIntArray497[local112] == local71.anInt1628) {
										Static241.anIntArray358[local112] |= 0x20;
									} else {
										Static241.anIntArray358[local112] = 32;
									}
									Static319.anIntArray497[local112] = local71.anInt1628;
								}
								local112--;
								local567++;
							}
							if (!local39[arg5 & 0x3]) {
								arg4[0] = Static170.aBooleanArrayArray7[local88][local534 + 2 & 0x3];
							}
						} else if (!local39[arg5 & 0x3]) {
							arg4[0] = Static210.aBooleanArrayArray3[local88][local534 + 2 & 0x3];
						}
					}
				}
			}
			if (arg9 - 1 > arg8) {
				local58 = arg6[arg2][arg8 + 1] & 0xFF;
				if (local58 > 0) {
					local71 = this.aClass112_6.method2332(local58 - 1);
					if (local71.anInt1625 != -1) {
						local88 = arg1[arg2][arg8 + 1];
						local534 = arg7[arg2][arg8 + 1];
						if (local71.aBoolean111) {
							local112 = 4;
							local567 = local534 * 2 + 2;
							local572 = Static387.method5233(local71, arg0);
							for (local574 = 0; local574 < 3; local574++) {
								local567 &= 0x7;
								local112 &= 0x7;
								if (Static304.aBooleanArrayArray6[local88][local567] && local71.anInt1628 >= Static319.anIntArray497[local112]) {
									Static343.anIntArray539[local112] = local71.anInt1625;
									Static180.anIntArray277[local112] = local572;
									Static359.anIntArray560[local112] = arg0.method4682() ? local71.anInt1631 : local71.anInt1632;
									Static272.anIntArray438[local112] = local71.anInt1626;
									if (Static319.anIntArray497[local112] == local71.anInt1628) {
										Static241.anIntArray358[local112] |= 0x10;
									} else {
										Static241.anIntArray358[local112] = 16;
									}
									Static319.anIntArray497[local112] = local71.anInt1628;
								}
								local567--;
								local112++;
							}
							if (!local39[arg5 + 2 & 0x3]) {
								arg4[2] = Static170.aBooleanArrayArray7[local88][local534 & 0x3];
							}
						} else if (!local39[arg5 + 2 & 0x3]) {
							arg4[2] = Static210.aBooleanArrayArray3[local88][local534 & 0x3];
						}
					}
				}
			}
			if (arg2 > 0) {
				local58 = arg6[arg2 - 1][arg8] & 0xFF;
				if (local58 > 0) {
					local71 = this.aClass112_6.method2332(local58 - 1);
					if (local71.anInt1625 != -1) {
						local88 = arg1[arg2 - 1][arg8];
						local534 = arg7[arg2 - 1][arg8];
						if (local71.aBoolean111) {
							local112 = 6;
							local567 = local534 * 2 + 4;
							local572 = Static387.method5233(local71, arg0);
							for (local574 = 0; local574 < 3; local574++) {
								local567 &= 0x7;
								local112 &= 0x7;
								if (Static304.aBooleanArrayArray6[local88][local567] && Static319.anIntArray497[local112] <= local71.anInt1628) {
									Static343.anIntArray539[local112] = local71.anInt1625;
									Static180.anIntArray277[local112] = local572;
									Static359.anIntArray560[local112] = arg0.method4682() ? local71.anInt1631 : local71.anInt1632;
									Static272.anIntArray438[local112] = local71.anInt1626;
									if (local71.anInt1628 == Static319.anIntArray497[local112]) {
										Static241.anIntArray358[local112] |= 0x8;
									} else {
										Static241.anIntArray358[local112] = 8;
									}
									Static319.anIntArray497[local112] = local71.anInt1628;
								}
								local112++;
								local567--;
							}
							if (!local39[arg5 + 3 & 0x3]) {
								arg4[3] = Static170.aBooleanArrayArray7[local88][local534 + 1 & 0x3];
							}
						} else if (!local39[arg5 + 3 & 0x3]) {
							arg4[3] = Static210.aBooleanArrayArray3[local88][local534 + 1 & 0x3];
						}
					}
				}
			}
			if (arg2 < arg11 - 1) {
				local58 = arg6[arg2 + 1][arg8] & 0xFF;
				if (local58 > 0) {
					local71 = this.aClass112_6.method2332(local58 - 1);
					if (local71.anInt1625 != -1) {
						local88 = arg1[arg2 + 1][arg8];
						local534 = arg7[arg2 + 1][arg8];
						if (local71.aBoolean111) {
							local112 = 4;
							local567 = local534 * 2 + 6;
							local572 = Static387.method5233(local71, arg0);
							for (local574 = 0; local574 < 3; local574++) {
								local567 &= 0x7;
								local112 &= 0x7;
								if (Static304.aBooleanArrayArray6[local88][local567] && Static319.anIntArray497[local112] <= local71.anInt1628) {
									Static343.anIntArray539[local112] = local71.anInt1625;
									Static180.anIntArray277[local112] = local572;
									Static359.anIntArray560[local112] = arg0.method4682() ? local71.anInt1631 : local71.anInt1632;
									Static272.anIntArray438[local112] = local71.anInt1626;
									if (Static319.anIntArray497[local112] == local71.anInt1628) {
										Static241.anIntArray358[local112] |= 0x4;
									} else {
										Static241.anIntArray358[local112] = 4;
									}
									Static319.anIntArray497[local112] = local71.anInt1628;
								}
								local567++;
								local112--;
							}
							if (!local39[arg5 + 1 & 0x3]) {
								arg4[1] = Static170.aBooleanArrayArray7[local88][local534 + 3 & 0x3];
							}
						} else if (!local39[arg5 + 1 & 0x3]) {
							arg4[1] = Static210.aBooleanArrayArray3[local88][local534 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg12 == null) {
			return;
		}
		@Pc(1268) int local1268 = Static387.method5233(arg12, arg0);
		if (!arg12.aBoolean111) {
			return;
		}
		for (local58 = 0; local58 < 8; local58++) {
			@Pc(1284) int local1284 = local58 - arg5 * 2 & 0x7;
			if (Static304.aBooleanArrayArray6[arg3][local58] && Static319.anIntArray497[local1284] <= arg12.anInt1628) {
				Static343.anIntArray539[local1284] = arg12.anInt1625;
				Static180.anIntArray277[local1284] = local1268;
				Static359.anIntArray560[local1284] = arg0.method4682() ? arg12.anInt1631 : arg12.anInt1632;
				Static272.anIntArray438[local1284] = arg12.anInt1626;
				if (Static319.anIntArray497[local1284] == arg12.anInt1628) {
					Static241.anIntArray358[local1284] |= 0x2;
				} else {
					Static241.anIntArray358[local1284] = 2;
				}
				Static319.anIntArray497[local1284] = arg12.anInt1628;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!qa;Z[Lclient!wq;[[[I)V")
	public final void method5150(@OriginalArg(0) Class30 arg0, @OriginalArg(2) Class268[] arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(18) int local18;
		if (!this.aBoolean442) {
			for (local10 = 0; local10 < 4; local10++) {
				for (local14 = 0; local14 < this.anInt6630; local14++) {
					for (local18 = 0; local18 < this.anInt6620; local18++) {
						if ((Static327.aByteArrayArrayArray11[local10][local14][local18] & 0x1) != 0) {
							@Pc(32) int local32 = local10;
							if ((Static327.aByteArrayArrayArray11[1][local14][local18] & 0x2) != 0) {
								local32 = local10 - 1;
							}
							if (local32 >= 0) {
								arg1[local32].method5797(local18, local14);
							}
						}
					}
				}
			}
		}
		for (local10 = 0; local10 < this.anInt6621; local10++) {
			local14 = 0;
			local18 = 0;
			if (!this.aBoolean442) {
				if (Static214.aBoolean303) {
					local14 = 2;
				}
				if (Static233.aBoolean316) {
					local18 = 8;
				}
				if (Static343.anInt6178 != 0) {
					if (Static442.aBoolean490 | local10 == 0) {
						local18 |= 0x10;
					}
					local14 |= 0x1;
				}
			}
			if (Static214.aBoolean303) {
				local18 |= 0x7;
			}
			if (!Static244.aBoolean328) {
				local18 |= 0x20;
			}
			@Pc(155) int[][] local155 = arg2 == null || local10 >= arg2.length ? this.anIntArrayArrayArray15[local10] : arg2[local10];
			Static424.method5491(local10, arg0.method4669(this.anInt6630, this.anInt6620, this.anIntArrayArrayArray15[local10], local155, local14, local18));
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!qa;Lclient!na;ILclient!na;[[ILclient!na;Z)V")
	private void method5151(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class146 arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) Class146 arg5) {
		for (@Pc(9) int local9 = 0; local9 < this.anInt6630; local9++) {
			for (@Pc(13) int local13 = 0; local13 < this.anInt6620; local13++) {
				if (Static317.anInt5682 == -1 || Static123.method5297(arg2, Static317.anInt5682, local9, local13)) {
					@Pc(37) byte local37 = this.aByteArrayArrayArray13[arg2][local9][local13];
					@Pc(46) byte local46 = this.aByteArrayArrayArray15[arg2][local9][local13];
					@Pc(57) int local57 = this.aByteArrayArrayArray12[arg2][local9][local13] & 0xFF;
					@Pc(68) int local68 = this.aByteArrayArrayArray14[arg2][local9][local13] & 0xFF;
					@Pc(80) Class42 local80 = local57 == 0 ? null : this.aClass112_6.method2332(local57 - 1);
					@Pc(95) Class13 local95 = local68 == 0 ? null : this.aClass23_5.method633(local68 - 1);
					@Pc(97) int local97 = 0;
					@Pc(99) int local99 = 0;
					if (local37 != 0) {
						local99 = local80 == null ? 0 : Static369.anIntArray572[local37];
						local97 = local95 == null ? 0 : Static94.anIntArray127[local37];
					} else if (local80 != null) {
						local99 = Static369.anIntArray572[local37];
					} else if (local95 != null) {
						local97 = Static369.anIntArray572[local37];
					}
					@Pc(140) int local140 = local99 + local97;
					@Pc(142) int local142 = 0;
					if (local140 != 0) {
						@Pc(147) int[] local147 = new int[local140];
						@Pc(150) int[] local150 = new int[local140];
						@Pc(153) int[] local153 = new int[local140];
						@Pc(156) int[] local156 = new int[local140];
						@Pc(158) boolean local158 = false;
						@Pc(184) int local184;
						@Pc(190) int local190;
						if (local80 == null || local80.anInt1625 == -1 && local80.anInt1624 == -1 && local80.anInt1631 == -1) {
							for (local184 = 0; local184 < local99; local184++) {
								local147[local142] = -1;
								local142++;
							}
						} else {
							local184 = arg0.method4682() ? local80.anInt1631 : local80.anInt1632;
							if (Static69.aBoolean116) {
								local184 = -1;
							}
							for (local190 = 0; local190 < local99; local190++) {
								local153[local142] = local184;
								local156[local142] = local80.anInt1626;
								if (local80.anInt1625 == -1) {
									local147[local142] = -1;
								} else {
									local147[local142] = local80.anInt1625;
								}
								if (local80.anInt1624 == -1) {
									local150[local142] = -1;
								} else {
									local150[local142] = local80.anInt1624;
									local158 = true;
								}
								local142++;
							}
							if (!this.aBoolean442 && arg2 == 0) {
								Static122.method1873(local9, local13, local80.anInt1623, local80.anInt1634 * 8, local80.anInt1630);
							}
						}
						if (!local158) {
							local150 = null;
						}
						if (local95 == null) {
							for (local184 = 0; local184 < local97; local184++) {
								local147[local142] = -1;
								local142++;
							}
						} else {
							local184 = local95.anInt409;
							if (Static69.aBoolean116) {
								local184 = -1;
							}
							for (local190 = 0; local190 < local97; local190++) {
								local153[local142] = local184;
								local156[local142] = local95.anInt416;
								local147[local142] = arg4[local9][local13];
								if (local150 != null) {
									local150[local142] = -1;
								}
								local142++;
							}
						}
						local184 = this.anIntArray577.length;
						@Pc(344) int[] local344 = new int[local184];
						@Pc(347) int[] local347 = new int[local184];
						@Pc(354) int[] local354 = arg1 == null ? null : new int[local184];
						@Pc(363) int[] local363 = arg1 == null && arg3 == null ? null : new int[local184];
						@Pc(372) int local372;
						@Pc(377) int local377;
						@Pc(463) int local463;
						@Pc(469) int local469;
						for (@Pc(365) int local365 = 0; local365 < local184; local365++) {
							local372 = this.anIntArray577[local365];
							local377 = this.anIntArray578[local365];
							if (local46 == 0) {
								local344[local365] = local372;
								local347[local365] = local377;
							} else if (local46 == 1) {
								local344[local365] = local377;
								local347[local365] = 128 - local372;
							} else if (local46 == 2) {
								local344[local365] = 128 - local372;
								local347[local365] = 128 - local377;
							} else if (local46 == 3) {
								local344[local365] = 128 - local377;
								local347[local365] = local372;
							}
							if (local354 != null && Static304.aBooleanArrayArray6[local37][local365]) {
								local463 = (local9 << 7) + local372;
								local469 = (local13 << 7) + local372;
								local354[local365] = arg1.va(local463, local469) - arg5.va(local463, local469);
							}
							if (local363 != null) {
								if (arg1 != null && !Static304.aBooleanArrayArray6[local37][local365]) {
									local463 = local372 + (local9 << 7);
									local469 = local372 + (local13 << 7);
									local363[local365] = arg5.va(local463, local469) - arg1.va(local463, local469);
								} else if (arg3 != null && !Static40.aBooleanArrayArray1[local37][local365]) {
									local463 = (local9 << 7) + local372;
									local469 = (local13 << 7) + local372;
									local363[local365] = arg3.va(local463, local469) - arg5.va(local463, local469);
								}
							}
						}
						local372 = arg5.I(local9, local13);
						local377 = arg5.I(local9 + 1, local13);
						local463 = arg5.I(local9 + 1, local13 + 1);
						local469 = arg5.I(local9, local13 + 1);
						if (arg2 > 0) {
							@Pc(590) boolean local590 = true;
							if (local68 == 0 && local37 != 0) {
								local590 = false;
							}
							if (local57 > 0 && local80 != null && !local80.aBoolean110) {
								local590 = false;
							}
							if (local590 && local372 == local377 && local463 == local372 && local372 == local469) {
								this.aByteArrayArrayArray17[arg2][local9][local13] = (byte) (this.aByteArrayArrayArray17[arg2][local9][local13] | 0x4);
							}
						}
						@Pc(640) int local640 = 0;
						@Pc(642) int local642 = 0;
						@Pc(644) int local644 = 0;
						if (this.aBoolean442) {
							local640 = Static50.method1034(local9, local13);
							local642 = Static134.method1949(local9, local13);
							local644 = Static285.method3975(local9, local13);
						}
						arg5.method3604(local9, local13, local344, local354, local347, local363, Static163.anIntArrayArray30[local37], Static146.anIntArrayArray22[local37], Static19.anIntArrayArray6[local37], local147, local150, local153, local156, local640, local642, local644);
						Static70.method5672(arg2, local9, local13);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([[III)V")
	public final void method5153(@OriginalArg(0) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray15[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt6630 + 1; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt6620 + 1; local16++) {
				local10[local12][local16] += arg0[local12][local16];
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIB)V")
	public final void method5155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(19) int local19;
		for (@Pc(7) int local7 = arg4; local7 < arg2 + arg4; local7++) {
			for (local19 = arg0; local19 < arg0 + arg1; local19++) {
				if (local19 >= 0 && local19 < this.anInt6630 && local7 >= 0 && this.anInt6620 > local7) {
					this.anIntArrayArrayArray15[arg3][local19][local7] = arg3 > 0 ? this.anIntArrayArrayArray15[arg3 - 1][local19][local7] - 240 : 0;
				}
			}
		}
		if (arg0 > 0 && arg0 < this.anInt6630) {
			for (local19 = arg4 + 1; local19 < arg2 + arg4; local19++) {
				if (local19 >= 0 && local19 < this.anInt6620) {
					this.anIntArrayArrayArray15[arg3][arg0][local19] = this.anIntArrayArrayArray15[arg3][arg0 - 1][local19];
				}
			}
		}
		if (arg4 > 0 && this.anInt6620 > arg4) {
			for (local19 = arg0 + 1; local19 < arg1 + arg0; local19++) {
				if (local19 >= 0 && local19 < this.anInt6630) {
					this.anIntArrayArrayArray15[arg3][local19][arg4] = this.anIntArrayArrayArray15[arg3][local19][arg4 - 1];
				}
			}
		}
		if (arg0 < 0 || arg4 < 0 || arg0 >= this.anInt6630 || arg4 >= this.anInt6620) {
			return;
		}
		if (arg3 != 0) {
			if (arg0 > 0 && this.anIntArrayArrayArray15[arg3 - 1][arg0 - 1][arg4] != this.anIntArrayArrayArray15[arg3][arg0 - 1][arg4]) {
				this.anIntArrayArrayArray15[arg3][arg0][arg4] = this.anIntArrayArrayArray15[arg3][arg0 - 1][arg4];
				return;
			}
			if (arg4 > 0 && this.anIntArrayArrayArray15[arg3 - 1][arg0][arg4 - 1] != this.anIntArrayArrayArray15[arg3][arg0][arg4 - 1]) {
				this.anIntArrayArrayArray15[arg3][arg0][arg4] = this.anIntArrayArrayArray15[arg3][arg0][arg4 - 1];
				return;
			}
			if (arg0 > 0 && arg4 > 0 && this.anIntArrayArrayArray15[arg3 - 1][arg0 - 1][arg4 - 1] != this.anIntArrayArrayArray15[arg3][arg0 - 1][arg4 - 1]) {
				this.anIntArrayArrayArray15[arg3][arg0][arg4] = this.anIntArrayArrayArray15[arg3][arg0 - 1][arg4 - 1];
				return;
			}
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray15[arg3][arg0 - 1][arg4] != 0) {
			this.anIntArrayArrayArray15[arg3][arg0][arg4] = this.anIntArrayArrayArray15[arg3][arg0 - 1][arg4];
			return;
		}
		if (arg4 > 0 && this.anIntArrayArrayArray15[arg3][arg0][arg4 - 1] != 0) {
			this.anIntArrayArrayArray15[arg3][arg0][arg4] = this.anIntArrayArrayArray15[arg3][arg0][arg4 - 1];
			return;
		}
		if (arg0 > 0 && arg4 > 0 && this.anIntArrayArrayArray15[arg3][arg0 - 1][arg4 - 1] != 0) {
			this.anIntArrayArrayArray15[arg3][arg0][arg4] = this.anIntArrayArrayArray15[arg3][arg0 - 1][arg4 - 1];
			return;
		}
	}
}
