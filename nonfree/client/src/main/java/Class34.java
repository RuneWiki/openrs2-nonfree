import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kda")
public class Class34 {

	@OriginalMember(owner = "client!kda", name = "p", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!kda", name = "l", descriptor = "[I")
	private final int[] anIntArray48 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!kda", name = "y", descriptor = "[I")
	private final int[] anIntArray51 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!kda", name = "g", descriptor = "Lclient!ab;")
	private final Class3 aClass3_2;

	@OriginalMember(owner = "client!kda", name = "z", descriptor = "Z")
	public final boolean aBoolean26;

	@OriginalMember(owner = "client!kda", name = "q", descriptor = "I")
	protected final int anInt563;

	@OriginalMember(owner = "client!kda", name = "x", descriptor = "Lclient!pca;")
	private final Class269 aClass269_2;

	@OriginalMember(owner = "client!kda", name = "u", descriptor = "I")
	public final int anInt566;

	@OriginalMember(owner = "client!kda", name = "A", descriptor = "I")
	protected final int anInt567;

	@OriginalMember(owner = "client!kda", name = "r", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!kda", name = "i", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!kda", name = "n", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!kda", name = "o", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!kda", name = "e", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(IIIZLclient!ab;Lclient!pca;)V")
	protected Class34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class3 arg4, @OriginalArg(5) Class269 arg5) {
		this.aClass3_2 = arg4;
		this.aBoolean26 = arg3;
		this.anInt563 = arg1;
		this.aClass269_2 = arg5;
		this.anInt566 = arg0;
		this.anInt567 = arg2;
		this.aByteArrayArrayArray12 = new byte[this.anInt566][this.anInt563][this.anInt567];
		this.aByteArrayArrayArray8 = new byte[this.anInt566][this.anInt563 + 1][this.anInt567 + 1];
		this.aByteArrayArrayArray9 = new byte[this.anInt566][this.anInt563][this.anInt567];
		this.anIntArrayArrayArray2 = new int[this.anInt566][this.anInt563 + 1][this.anInt567 + 1];
		this.aByteArrayArrayArray10 = new byte[this.anInt566][this.anInt563][this.anInt567];
		this.aByteArrayArrayArray7 = new byte[this.anInt566][this.anInt563][this.anInt567];
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(ZIIII)V")
	public final void method522(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt566; local7++) {
			this.method532(local7, arg0, 64, arg1, 64);
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(ZILclient!rv;III[Lclient!mja;)V")
	public final void method524(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub15 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class234[] arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (!this.aBoolean26) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class234 local16 = arg5[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local28 = arg2 + local18;
						@Pc(32) int local32 = local22 + arg4;
						if (local28 >= 0 && local28 < this.anInt563 && local32 >= 0 && this.anInt567 > local32) {
							local16.method5458(local32, local28);
						}
					}
				}
			}
		}
		local10 = arg2 + arg3;
		@Pc(88) int local88 = arg0 + arg4;
		for (local18 = 0; local18 < this.anInt566; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method531(false, arg4 + local28, 0, 0, local22 + arg2, 0, local18, arg1, local28 + local88, local22 + local10);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(Lclient!s;Lclient!ha;Lclient!s;Lclient!s;II[[I)V")
	private void method525(@OriginalArg(0) Class88 arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(2) Class88 arg2, @OriginalArg(3) Class88 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray12[arg4];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray10[arg4];
		@Pc(32) byte[][] local32 = this.aByteArrayArrayArray7[arg4];
		@Pc(37) byte[][] local37 = this.aByteArrayArrayArray9[arg4];
		for (@Pc(39) int local39 = 0; local39 < this.anInt563; local39++) {
			@Pc(57) int local57 = this.anInt563 - 1 <= local39 ? local39 : local39 + 1;
			for (@Pc(59) int local59 = 0; local59 < this.anInt567; local59++) {
				@Pc(77) int local77 = this.anInt567 - 1 <= local59 ? local59 : local59 + 1;
				if (Static595.anInt9703 == -1 || Static71.method1044(arg4, local39, local59, Static595.anInt9703)) {
					@Pc(92) boolean local92 = false;
					@Pc(94) boolean local94 = false;
					@Pc(97) boolean[] local97 = new boolean[4];
					@Pc(103) int local103 = local10[local39][local59];
					@Pc(109) int local109 = local15[local39][local59];
					@Pc(117) int local117 = local37[local39][local59] & 0xFF;
					@Pc(125) int local125 = local32[local39][local59] & 0xFF;
					@Pc(133) int local133 = local32[local39][local77] & 0xFF;
					@Pc(141) int local141 = local32[local57][local77] & 0xFF;
					@Pc(149) int local149 = local32[local57][local59] & 0xFF;
					if (local117 != 0 || local125 != 0) {
						@Pc(168) Class123 local168 = local117 == 0 ? null : this.aClass3_2.method40(local117 - 1);
						@Pc(182) Class327 local182 = local125 == 0 ? null : this.aClass269_2.method6615(local125 - 1);
						if (local103 == 0 && local168 == null) {
							local103 = 12;
						}
						@Pc(193) Class123 local193 = local168;
						if (local168 != null) {
							if (local168.anInt2869 == -1 && local168.anInt2862 == -1) {
								local193 = local168;
								local168 = null;
							} else if (local182 != null && local103 != 0) {
								local94 = local168.aBoolean204;
							}
						}
						@Pc(307) int local307;
						@Pc(341) int local341;
						@Pc(395) int local395;
						@Pc(405) int local405;
						if ((local103 == 0 || local103 == 12) && local39 > 0 && local59 > 0 && local39 < this.anInt563 && this.anInt567 > local59) {
							@Pc(265) int local265 = local125 == local32[local57][local77] ? 1 : -1;
							@Pc(284) int local284 = local125 == local32[local57][local59 - 1] ? 1 : -1;
							local307 = local32[local39 - 1][local59 - 1] == local125 ? 1 : -1;
							if (local125 == local32[local39][local59 - 1]) {
								local307++;
								local284++;
							} else {
								local307--;
								local284--;
							}
							local341 = local125 == local32[local39 - 1][local77] ? 1 : -1;
							if (local125 == local32[local57][local59]) {
								local265++;
								local284++;
							} else {
								local284--;
								local265--;
							}
							if (local125 == local32[local39][local77]) {
								local341++;
								local265++;
							} else {
								local265--;
								local341--;
							}
							if (local125 == local32[local39 - 1][local59]) {
								local307++;
								local341++;
							} else {
								local341--;
								local307--;
							}
							local395 = local307 - local265;
							if (local395 < 0) {
								local395 = -local395;
							}
							local405 = local284 - local341;
							if (local405 < 0) {
								local405 = -local405;
							}
							if (local405 == local395) {
								local395 = arg3.method8749(local39, local59) - arg3.method8749(local57, local77);
								if (local395 < 0) {
									local395 = -local395;
								}
								local405 = arg3.method8749(local57, local59) - arg3.method8749(local39, local77);
								if (local405 < 0) {
									local405 = -local405;
								}
							}
							local109 = local405 > local395 ? 1 : 0;
						}
						for (local307 = 0; local307 < 13; local307++) {
							Static476.anIntArray456[local307] = -1;
							Static190.anIntArray174[local307] = 1;
						}
						@Pc(502) boolean[] local502 = local168 != null && local168.aBoolean204 ? Static599.aBooleanArrayArray7[local103] : Static177.aBooleanArrayArray4[local103];
						this.method530(this.anInt567, local15, local10, this.anInt563, local37, local168, local97, local103, local59, arg1, local182, local39, local109);
						@Pc(535) boolean local535 = local168 != null && local168.anInt2862 != local168.anInt2869;
						if (!local535) {
							for (local341 = 0; local341 < 8; local341++) {
								if (Static476.anIntArray456[local341] >= 0 && Static127.anIntArray114[local341] != Static275.anIntArray260[local341]) {
									local535 = true;
									break;
								}
							}
						}
						if (!local502[local109 + 1 & 0x3]) {
							local97[1] = Static12.method8635(local97[1], (Static190.anIntArray174[4] & Static190.anIntArray174[2]) == 0);
						}
						if (!local502[local109 + 3 & 0x3]) {
							local97[3] = Static12.method8635(local97[3], (Static190.anIntArray174[6] & Static190.anIntArray174[0]) == 0);
						}
						if (!local502[--local109 & 0x3]) {
							local97[0] = Static12.method8635(local97[0], (Static190.anIntArray174[2] & Static190.anIntArray174[0]) == 0);
						}
						if (!local502[local109 + 2 & 0x3]) {
							local97[2] = Static12.method8635(local97[2], (Static190.anIntArray174[6] & Static190.anIntArray174[4]) == 0);
						}
						if (!local94 && (local103 == 0 || local103 == 12)) {
							if (local97[0] && !local97[1] && !local97[2] && local97[3]) {
								local109 = 0;
								local103 = local103 == 0 ? 13 : 14;
								local97[0] = local97[3] = false;
							} else if (local97[0] && local97[1] && !local97[2] && !local97[3]) {
								local109 = 3;
								local97[0] = local97[1] = false;
								local103 = local103 == 0 ? 13 : 14;
							} else if (!local97[0] && local97[1] && local97[2] && !local97[3]) {
								local97[1] = local97[2] = false;
								local103 = local103 == 0 ? 13 : 14;
								local109 = 2;
							} else if (!local97[0] && !local97[1] && local97[2] && local97[3]) {
								local97[2] = local97[3] = false;
								local103 = local103 == 0 ? 13 : 14;
								local109 = 1;
							}
						}
						@Pc(855) boolean local855 = !local94 && !local97[0] && !local97[2] && !local97[1] && !local97[3];
						@Pc(857) int[] local857 = null;
						@Pc(867) int[] local867;
						@Pc(863) int[] local863;
						@Pc(879) int[] local879;
						if (local855) {
							local863 = Static427.anIntArrayArray93[local103];
							local867 = Static11.anIntArrayArray3[local103];
							local405 = local168 == null ? 0 : Static600.anIntArray555[local103];
							local879 = Static144.anIntArrayArray90[local103];
							local395 = local182 == null ? 0 : Static425.anIntArray418[local103];
						} else if (local94) {
							local863 = Static461.anIntArrayArray58[local103];
							local395 = local182 == null ? 0 : Static287.anIntArray265[local103];
							local857 = Static479.anIntArrayArray62[local103];
							local879 = Static140.anIntArrayArray17[local103];
							local867 = Static163.anIntArrayArray25[local103];
							local405 = local168 == null ? 0 : Static450.anIntArray435[local103];
						} else {
							local867 = Static430.anIntArrayArray72[local103];
							local879 = Static174.anIntArrayArray29[local103];
							local395 = local182 == null ? 0 : Static420.anIntArray414[local103];
							local863 = Static329.anIntArrayArray47[local103];
							local405 = local168 == null ? 0 : Static550.anIntArray493[local103];
							local857 = Static387.anIntArrayArray52[local103];
						}
						@Pc(960) int local960 = local405 + local395;
						if (local960 <= 0) {
							Static116.method1852(arg4, local39, local59);
						} else {
							if (local97[0]) {
								local960++;
							}
							if (local97[2]) {
								local960++;
							}
							if (local97[1]) {
								local960++;
							}
							if (local97[3]) {
								local960++;
							}
							@Pc(993) int local993 = 0;
							@Pc(995) int local995 = 0;
							@Pc(999) int local999 = local960 * 3;
							@Pc(1006) int[] local1006 = local535 ? new int[local999] : null;
							@Pc(1009) int[] local1009 = new int[local999];
							@Pc(1012) int[] local1012 = new int[local999];
							@Pc(1015) int[] local1015 = new int[local999];
							@Pc(1018) int[] local1018 = new int[local999];
							@Pc(1021) int[] local1021 = new int[local999];
							@Pc(1028) int[] local1028 = arg0 == null ? null : new int[local999];
							@Pc(1037) int[] local1037 = arg0 == null && arg2 == null ? null : new int[local999];
							@Pc(1039) int local1039 = -1;
							@Pc(1041) int local1041 = -1;
							@Pc(1043) int local1043 = 256;
							@Pc(1153) byte local1153;
							@Pc(1087) int local1087;
							@Pc(1089) int local1089;
							@Pc(1317) int local1317;
							@Pc(1323) int local1323;
							@Pc(1331) int local1331;
							@Pc(1336) int local1336;
							@Pc(1351) int local1351;
							@Pc(1341) int local1341;
							@Pc(1349) int local1349;
							@Pc(1406) int local1406;
							@Pc(1412) int local1412;
							if (local168 != null) {
								local1039 = local168.anInt2869;
								local1041 = local168.anInt2868;
								local1043 = local168.anInt2863;
								local1087 = Static180.method2649(local168, arg1);
								for (local1089 = 0; local1089 < local405; local1089++) {
									if (local97[-local109 & 0x3] && local857[0] == local993) {
										Static643.anIntArray590[0] = local867[local993];
										Static643.anIntArray590[1] = 1;
										Static643.anIntArray590[2] = local879[local993];
										Static643.anIntArray590[3] = 1;
										Static643.anIntArray590[4] = local863[local993];
										local1153 = 6;
										Static643.anIntArray590[5] = local879[local993];
									} else if (local97[2 - local109 & 0x3] && local993 == local857[2]) {
										Static643.anIntArray590[0] = local867[local993];
										Static643.anIntArray590[1] = 5;
										Static643.anIntArray590[2] = local879[local993];
										Static643.anIntArray590[3] = 5;
										Static643.anIntArray590[4] = local863[local993];
										Static643.anIntArray590[5] = local879[local993];
										local1153 = 6;
									} else if (local97[1 - local109 & 0x3] && local993 == local857[1]) {
										Static643.anIntArray590[0] = local867[local993];
										Static643.anIntArray590[1] = 3;
										Static643.anIntArray590[2] = local879[local993];
										Static643.anIntArray590[3] = 3;
										Static643.anIntArray590[4] = local863[local993];
										local1153 = 6;
										Static643.anIntArray590[5] = local879[local993];
									} else if (local97[3 - local109 & 0x3] && local857[3] == local993) {
										Static643.anIntArray590[0] = local867[local993];
										Static643.anIntArray590[1] = 7;
										Static643.anIntArray590[2] = local879[local993];
										Static643.anIntArray590[3] = 7;
										Static643.anIntArray590[4] = local863[local993];
										local1153 = 6;
										Static643.anIntArray590[5] = local879[local993];
									} else {
										Static643.anIntArray590[0] = local867[local993];
										Static643.anIntArray590[1] = local863[local993];
										local1153 = 3;
										Static643.anIntArray590[2] = local879[local993];
									}
									local993++;
									for (local1317 = 0; local1317 < local1153; local1317++) {
										local1323 = Static643.anIntArray590[local1317];
										local1331 = local1323 - local109 * 2 & 0x7;
										local1336 = this.anIntArray51[local1323];
										local1341 = this.anIntArray48[local1323];
										if (local109 == 1) {
											local1349 = 512 - local1336;
											local1351 = local1341;
										} else if (local109 == 2) {
											local1351 = 512 - local1336;
											local1349 = 512 - local1341;
										} else if (local109 == 3) {
											local1351 = 512 - local1341;
											local1349 = local1336;
										} else {
											local1351 = local1336;
											local1349 = local1341;
										}
										local1009[local995] = local1351;
										local1012[local995] = local1349;
										if (local1028 != null && Static264.aBooleanArrayArray5[local103][local1323]) {
											local1406 = (local39 << 9) + local1351;
											local1412 = local1349 + (local59 << 9);
											local1028[local995] = arg0.method8753(local1406, local1412) - arg3.method8753(local1406, local1412);
										}
										if (local1037 != null) {
											if (arg0 != null && !Static264.aBooleanArrayArray5[local103][local1323]) {
												local1406 = local1351 + (local39 << 9);
												local1412 = (local59 << 9) + local1349;
												local1037[local995] = arg3.method8753(local1406, local1412) - arg0.method8753(local1406, local1412);
											} else if (arg2 != null && !Static49.aBooleanArrayArray2[local103][local1323]) {
												local1406 = local1351 + (local39 << 9);
												local1412 = local1349 + (local59 << 9);
												local1037[local995] = arg2.method8753(local1406, local1412) - arg3.method8753(local1406, local1412);
											}
										}
										if (local1323 < 8 && Static476.anIntArray456[local1331] > local168.anInt2859) {
											if (local1006 != null) {
												local1006[local995] = Static275.anIntArray260[local1331];
											}
											local1021[local995] = Static599.anIntArray553[local1331];
											local1018[local995] = Static268.anIntArray269[local1331];
											local1015[local995] = Static127.anIntArray114[local1331];
										} else {
											if (local1006 != null) {
												local1006[local995] = local1087;
											}
											local1018[local995] = local168.anInt2868;
											local1021[local995] = local168.anInt2863;
											local1015[local995] = local1039;
										}
										local995++;
									}
								}
								if (!this.aBoolean26 && arg4 == 0) {
									Static549.method7581(local39, local59, local168.anInt2873, local168.anInt2867 * 8, local168.anInt2865);
								}
								if (local103 != 12 && local168.anInt2869 != -1 && local168.aBoolean203) {
									local92 = true;
								}
							} else if (local855) {
								local993 = Static600.anIntArray555[local103];
							} else if (local94) {
								local993 = Static450.anIntArray435[local103];
							} else {
								local993 = Static550.anIntArray493[local103];
							}
							if (local182 != null) {
								if (local149 == 0) {
									local149 = local125;
								}
								if (local141 == 0) {
									local141 = local125;
								}
								if (local133 == 0) {
									local133 = local125;
								}
								@Pc(1634) Class327 local1634 = this.aClass269_2.method6615(local125 - 1);
								@Pc(1644) Class327 local1644 = this.aClass269_2.method6615(local133 - 1);
								@Pc(1652) Class327 local1652 = this.aClass269_2.method6615(local141 - 1);
								@Pc(1660) Class327 local1660 = this.aClass269_2.method6615(local149 - 1);
								for (local1331 = 0; local1331 < local395; local1331++) {
									if (local97[-local109 & 0x3] && local857[0] == local993) {
										Static643.anIntArray590[0] = local867[local993];
										Static643.anIntArray590[1] = 1;
										Static643.anIntArray590[2] = local879[local993];
										Static643.anIntArray590[3] = 1;
										Static643.anIntArray590[4] = local863[local993];
										local1153 = 6;
										Static643.anIntArray590[5] = local879[local993];
									} else if (local97[2 - local109 & 0x3] && local993 == local857[2]) {
										Static643.anIntArray590[0] = local867[local993];
										Static643.anIntArray590[1] = 5;
										Static643.anIntArray590[2] = local879[local993];
										Static643.anIntArray590[3] = 5;
										Static643.anIntArray590[4] = local863[local993];
										local1153 = 6;
										Static643.anIntArray590[5] = local879[local993];
									} else if (local97[1 - local109 & 0x3] && local857[1] == local993) {
										Static643.anIntArray590[0] = local867[local993];
										Static643.anIntArray590[1] = 3;
										Static643.anIntArray590[2] = local879[local993];
										Static643.anIntArray590[3] = 3;
										Static643.anIntArray590[4] = local863[local993];
										local1153 = 6;
										Static643.anIntArray590[5] = local879[local993];
									} else if (local97[3 - local109 & 0x3] && local993 == local857[3]) {
										Static643.anIntArray590[0] = local867[local993];
										Static643.anIntArray590[1] = 7;
										Static643.anIntArray590[2] = local879[local993];
										Static643.anIntArray590[3] = 7;
										Static643.anIntArray590[4] = local863[local993];
										local1153 = 6;
										Static643.anIntArray590[5] = local879[local993];
									} else {
										Static643.anIntArray590[0] = local867[local993];
										Static643.anIntArray590[1] = local863[local993];
										local1153 = 3;
										Static643.anIntArray590[2] = local879[local993];
									}
									local993++;
									for (local1336 = 0; local1336 < local1153; local1336++) {
										local1351 = Static643.anIntArray590[local1336];
										local1341 = local1351 - local109 * 2 & 0x7;
										local1349 = this.anIntArray51[local1351];
										local1412 = this.anIntArray48[local1351];
										@Pc(1930) int local1930;
										if (local109 == 1) {
											local1406 = local1412;
											local1930 = 512 - local1349;
										} else if (local109 == 2) {
											local1406 = 512 - local1349;
											local1930 = 512 - local1412;
										} else if (local109 == 3) {
											local1930 = local1349;
											local1406 = 512 - local1412;
										} else {
											local1930 = local1412;
											local1406 = local1349;
										}
										local1009[local995] = local1406;
										local1012[local995] = local1930;
										@Pc(1983) int local1983;
										@Pc(1989) int local1989;
										if (local1028 != null && Static264.aBooleanArrayArray5[local103][local1351]) {
											local1983 = local1406 + (local39 << 9);
											local1989 = local1930 + (local59 << 9);
											local1028[local995] = arg0.method8753(local1983, local1989) - arg3.method8753(local1983, local1989);
										}
										if (local1037 != null) {
											if (arg0 != null && !Static264.aBooleanArrayArray5[local103][local1351]) {
												local1983 = (local39 << 9) + local1406;
												local1989 = (local59 << 9) + local1930;
												local1037[local995] = arg3.method8753(local1983, local1989) - arg0.method8753(local1983, local1989);
											} else if (arg2 != null && !Static49.aBooleanArrayArray2[local103][local1351]) {
												local1983 = (local39 << 9) + local1406;
												local1989 = (local59 << 9) + local1930;
												local1037[local995] = arg2.method8753(local1983, local1989) - arg3.method8753(local1983, local1989);
											}
										}
										if (local1351 < 8 && Static476.anIntArray456[local1341] >= 0) {
											if (local1006 != null) {
												local1006[local995] = Static275.anIntArray260[local1341];
											}
											local1021[local995] = Static599.anIntArray553[local1341];
											local1018[local995] = Static268.anIntArray269[local1341];
											local1015[local995] = Static127.anIntArray114[local1341];
										} else {
											if (local94 && Static264.aBooleanArrayArray5[local103][local1351]) {
												local1018[local995] = local1041;
												local1021[local995] = local1043;
												local1015[local995] = local1039;
											} else if (local1406 == 0 && local1930 == 0) {
												local1015[local995] = arg5[local39][local59];
												local1018[local995] = local1634.anInt8948;
												local1021[local995] = local1634.anInt8951;
											} else if (local1406 == 0 && local1930 == 512) {
												local1015[local995] = arg5[local39][local77];
												local1018[local995] = local1644.anInt8948;
												local1021[local995] = local1644.anInt8951;
											} else if (local1406 == 512 && local1930 == 512) {
												local1015[local995] = arg5[local57][local77];
												local1018[local995] = local1652.anInt8948;
												local1021[local995] = local1652.anInt8951;
											} else if (local1406 == 512 && local1930 == 0) {
												local1015[local995] = arg5[local57][local59];
												local1018[local995] = local1660.anInt8948;
												local1021[local995] = local1660.anInt8951;
											} else {
												if (local1406 < 256) {
													if (local1930 < 256) {
														local1018[local995] = local1634.anInt8948;
														local1021[local995] = local1634.anInt8951;
													} else {
														local1018[local995] = local1644.anInt8948;
														local1021[local995] = local1644.anInt8951;
													}
												} else if (local1930 < 256) {
													local1018[local995] = local1660.anInt8948;
													local1021[local995] = local1660.anInt8951;
												} else {
													local1018[local995] = local1652.anInt8948;
													local1021[local995] = local1652.anInt8951;
												}
												local1983 = Static568.method7798(arg5[local39][local59], arg5[local57][local59], local1406 << 7 >> 9);
												local1989 = Static568.method7798(arg5[local39][local77], arg5[local57][local77], local1406 << 7 >> 9);
												local1015[local995] = Static568.method7798(local1983, local1989, local1930 << 7 >> 9);
											}
											if (local1006 != null) {
												local1006[local995] = local1015[local995];
											}
										}
										local995++;
									}
								}
								if (local103 != 0 && local182.aBoolean646) {
									local92 = true;
								}
							}
							local1087 = arg3.method8749(local39, local59);
							local1089 = arg3.method8749(local57, local59);
							local1317 = arg3.method8749(local57, local77);
							local1323 = arg3.method8749(local39, local77);
							@Pc(2425) boolean local2425 = Static488.method7149(local39, local59);
							if (local2425 && arg4 > 1 || !local2425 && arg4 > 0) {
								@Pc(2436) boolean local2436 = true;
								if (local182 != null && !local182.aBoolean647) {
									local2436 = false;
								} else if (local125 == 0 && local103 != 0) {
									local2436 = false;
								} else if (local117 > 0 && local193 != null && !local193.aBoolean202) {
									local2436 = false;
								}
								if (local2436 && local1089 == local1087 && local1317 == local1087 && local1323 == local1087) {
									this.aByteArrayArrayArray8[arg4][local39][local59] = (byte) (this.aByteArrayArrayArray8[arg4][local39][local59] | 0x4);
								}
							}
							local1336 = 0;
							local1351 = 0;
							local1341 = 0;
							if (this.aBoolean26) {
								local1336 = Static462.method6848(local39, local59);
								local1351 = Static166.method2459(local39, local59);
								local1341 = Static484.method7068(local39, local59);
							}
							arg3.U(local39, local59, local1009, local1028, local1012, local1037, local1015, local1006, local1018, local1021, local1336, local1351, local1341, local92);
							Static116.method1852(arg4, local39, local59);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIILclient!rv;I[Lclient!mja;IIII)V")
	public final void method526(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub15 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class234[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg8 & 0x7) * 8;
		@Pc(17) int local17 = (arg7 & 0x7) * 8;
		@Pc(38) int local38;
		@Pc(69) int local69;
		if (!this.aBoolean26) {
			@Pc(36) Class234 local36 = arg4[arg3];
			for (local38 = 0; local38 < 8; local38++) {
				for (@Pc(42) int local42 = 0; local42 < 8; local42++) {
					@Pc(56) int local56 = Static330.method5111(local38 & 0x7, local42 & 0x7, arg0) + arg1;
					local69 = arg6 + Static541.method7491(local42 & 0x7, arg0, local38 & 0x7);
					if (local56 > 0 && local56 < this.anInt563 - 1 && local69 > 0 && this.anInt567 - 1 > local69) {
						local36.method5458(local69, local56);
					}
				}
			}
		}
		@Pc(108) int local108 = (arg8 & 0x1FFFFFF8) << 3;
		local38 = (arg7 & 0x1FFFFFF8) << 3;
		@Pc(116) byte local116 = 0;
		@Pc(118) byte local118 = 0;
		if (arg0 == 1) {
			local118 = 1;
		} else if (arg0 == 2) {
			local116 = 1;
			local118 = 1;
		} else if (arg0 == 3) {
			local116 = 1;
		}
		for (local69 = 0; local69 < this.anInt566; local69++) {
			for (@Pc(151) int local151 = 0; local151 < 64; local151++) {
				for (@Pc(155) int local155 = 0; local155 < 64; local155++) {
					if (local69 == arg5 && local11 <= local151 && local151 <= local11 + 8 && local17 <= local155 && local155 <= local17 + 8) {
						@Pc(210) int local210;
						@Pc(223) int local223;
						if (local11 + 8 == local151 || local155 == local17 + 8) {
							if (arg0 == 0) {
								local210 = local151 + arg1 - local11;
								local223 = local155 + arg6 - local17;
							} else if (arg0 == 1) {
								local210 = arg1 + local155 - local17;
								local223 = local11 + arg6 + 8 - local151;
							} else if (arg0 == 2) {
								local210 = local11 + arg1 + 8 - local151;
								local223 = local17 + arg6 + 8 - local155;
							} else {
								local223 = local151 + arg6 - local11;
								local210 = local17 + arg1 + 8 - local155;
							}
							this.method531(true, local223, 0, 0, local210, 0, arg3, arg2, local155 + local38, local108 + local151);
						} else {
							local210 = Static330.method5111(local151 & 0x7, local155 & 0x7, arg0) + arg1;
							local223 = arg6 + Static541.method7491(local155 & 0x7, arg0, local151 & 0x7);
							this.method531(false, local223, arg0, local118, local210, local116, arg3, arg2, local38 + local155, local108 - -local151);
						}
						if (local151 == 63 || local155 == 63) {
							@Pc(351) byte local351 = 1;
							if (local151 == 63 && local155 == 63) {
								local351 = 3;
							}
							for (@Pc(365) int local365 = 0; local365 < local351; local365++) {
								@Pc(369) int local369 = local151;
								@Pc(371) int local371 = local155;
								if (local365 == 0) {
									local371 = local155 == 63 ? 64 : local155;
									local369 = local151 == 63 ? 64 : local151;
								} else if (local365 == 1) {
									local369 = 64;
								} else if (local365 == 2) {
									local371 = 64;
								}
								@Pc(435) int local435;
								@Pc(425) int local425;
								if (arg0 == 0) {
									local435 = arg1 + local369 - local11;
									local425 = local371 + arg6 - local17;
								} else if (arg0 == 1) {
									local425 = local11 + arg6 + 8 - local369;
									local435 = arg1 + local371 - local17;
								} else if (arg0 == 2) {
									local425 = local17 + arg6 + 8 - local371;
									local435 = arg1 + local11 + 8 - local369;
								} else {
									local435 = arg1 + local17 + 8 - local371;
									local425 = local369 + arg6 - local11;
								}
								if (local435 >= 0 && this.anInt563 > local435 && local425 >= 0 && local425 < this.anInt567) {
									this.anIntArrayArrayArray2[arg3][local435][local425] = this.anIntArrayArrayArray2[arg3][local116 + local210][local223 + local118];
								}
							}
						}
					} else {
						this.method531(false, -1, 0, 0, -1, 0, 0, arg2, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "([Lclient!mja;Lclient!ha;[[[IB)V")
	public final void method527(@OriginalArg(0) Class234[] arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(2) int[][][] arg2) {
		@Pc(29) int local29;
		@Pc(33) int local33;
		@Pc(37) int local37;
		if (!this.aBoolean26) {
			for (local29 = 0; local29 < 4; local29++) {
				for (local33 = 0; local33 < this.anInt563; local33++) {
					for (local37 = 0; local37 < this.anInt567; local37++) {
						if ((Static317.aByteArrayArrayArray13[local29][local33][local37] & 0x1) != 0) {
							@Pc(51) int local51 = local29;
							if ((Static317.aByteArrayArrayArray13[1][local33][local37] & 0x2) != 0) {
								local51 = local29 - 1;
							}
							if (local51 >= 0) {
								arg0[local51].method5452(local37, local33);
							}
						}
					}
				}
			}
		}
		for (local29 = 0; local29 < this.anInt566; local29++) {
			local33 = 0;
			local37 = 0;
			if (!this.aBoolean26) {
				if (Static489.aBoolean608) {
					local33 = 2;
				}
				if (Static574.aBoolean682) {
					local37 = 8;
				}
				if (Static661.anInt10337 != 0) {
					local33 |= 0x1;
					if (local29 == 0 | Static599.aBoolean717) {
						local37 |= 0x10;
					}
				}
			}
			if (Static489.aBoolean608) {
				local37 |= 0x7;
			}
			if (!Static34.aBoolean19) {
				local37 |= 0x20;
			}
			@Pc(165) int[][] local165 = arg2 == null || arg2.length <= local29 ? this.anIntArrayArrayArray2[local29] : arg2[local29];
			Static74.method1093(local29, arg1.method6242(this.anInt563, this.anInt567, this.anIntArrayArrayArray2[local29], local165, local33, local37));
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IB[[I)V")
	public final void method528(@OriginalArg(2) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray2[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt563 + 1; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt567 + 1; local16++) {
				local10[local12][local16] += arg0[local12][local16];
			}
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(I[[B[[BI[[BLclient!g;[ZIILclient!ha;ZLclient!so;II)V")
	private void method530(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) Class123 arg5, @OriginalArg(6) boolean[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class143 arg9, @OriginalArg(11) Class327 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(28) boolean[] local28 = arg5 != null && arg5.aBoolean204 ? Static599.aBooleanArrayArray7[arg7] : Static177.aBooleanArrayArray4[arg7];
		@Pc(47) int local47;
		@Pc(60) Class123 local60;
		@Pc(78) byte local78;
		@Pc(94) int local94;
		@Pc(99) int local99;
		if (arg8 > 0) {
			if (arg11 > 0) {
				local47 = arg4[arg11 - 1][arg8 - 1] & 0xFF;
				if (local47 > 0) {
					local60 = this.aClass3_2.method40(local47 - 1);
					if (local60.anInt2869 != -1 && local60.aBoolean204) {
						local78 = arg2[arg11 - 1][arg8 - 1];
						local94 = arg1[arg11 - 1][arg8 - 1] * 2 + 4 & 0x7;
						local99 = Static180.method2649(local60, arg9);
						if (Static264.aBooleanArrayArray5[local78][local94]) {
							Static127.anIntArray114[0] = local60.anInt2869;
							Static275.anIntArray260[0] = local99;
							Static268.anIntArray269[0] = local60.anInt2868;
							Static599.anIntArray553[0] = local60.anInt2863;
							Static476.anIntArray456[0] = local60.anInt2859;
							Static190.anIntArray174[0] = 256;
						}
					}
				}
			}
			if (arg3 - 1 > arg11) {
				local47 = arg4[arg11 + 1][arg8 - 1] & 0xFF;
				if (local47 > 0) {
					local60 = this.aClass3_2.method40(local47 - 1);
					if (local60.anInt2869 != -1 && local60.aBoolean204) {
						local78 = arg2[arg11 + 1][arg8 - 1];
						local94 = arg1[arg11 + 1][arg8 - 1] * 2 + 6 & 0x7;
						local99 = Static180.method2649(local60, arg9);
						if (Static264.aBooleanArrayArray5[local78][local94]) {
							Static127.anIntArray114[2] = local60.anInt2869;
							Static275.anIntArray260[2] = local99;
							Static268.anIntArray269[2] = local60.anInt2868;
							Static599.anIntArray553[2] = local60.anInt2863;
							Static476.anIntArray456[2] = local60.anInt2859;
							Static190.anIntArray174[2] = 512;
						}
					}
				}
			}
		}
		if (arg0 - 1 > arg8) {
			if (arg11 > 0) {
				local47 = arg4[arg11 - 1][arg8 + 1] & 0xFF;
				if (local47 > 0) {
					local60 = this.aClass3_2.method40(local47 - 1);
					if (local60.anInt2869 != -1 && local60.aBoolean204) {
						local78 = arg2[arg11 - 1][arg8 + 1];
						local94 = arg1[arg11 - 1][arg8 + 1] * 2 + 2 & 0x7;
						local99 = Static180.method2649(local60, arg9);
						if (Static264.aBooleanArrayArray5[local78][local94]) {
							Static127.anIntArray114[6] = local60.anInt2869;
							Static275.anIntArray260[6] = local99;
							Static268.anIntArray269[6] = local60.anInt2868;
							Static599.anIntArray553[6] = local60.anInt2863;
							Static476.anIntArray456[6] = local60.anInt2859;
							Static190.anIntArray174[6] = 64;
						}
					}
				}
			}
			if (arg11 < arg3 - 1) {
				local47 = arg4[arg11 + 1][arg8 + 1] & 0xFF;
				if (local47 > 0) {
					local60 = this.aClass3_2.method40(local47 - 1);
					if (local60.anInt2869 != -1 && local60.aBoolean204) {
						local78 = arg2[arg11 + 1][arg8 + 1];
						local94 = --(arg1[arg11 + 1][arg8 + 1] * 2) & 0x7;
						local99 = Static180.method2649(local60, arg9);
						if (Static264.aBooleanArrayArray5[local78][local94]) {
							Static127.anIntArray114[4] = local60.anInt2869;
							Static275.anIntArray260[4] = local99;
							Static268.anIntArray269[4] = local60.anInt2868;
							Static599.anIntArray553[4] = local60.anInt2863;
							Static476.anIntArray456[4] = local60.anInt2859;
							Static190.anIntArray174[4] = 128;
						}
					}
				}
			}
		}
		@Pc(519) int local519;
		@Pc(524) int local524;
		@Pc(526) int local526;
		@Pc(486) byte local486;
		if (arg8 > 0) {
			local47 = arg4[arg11][arg8 - 1] & 0xFF;
			if (local47 > 0) {
				local60 = this.aClass3_2.method40(local47 - 1);
				if (local60.anInt2869 != -1) {
					local78 = arg2[arg11][arg8 - 1];
					local486 = arg1[arg11][arg8 - 1];
					if (local60.aBoolean204) {
						local99 = 2;
						local519 = local486 * 2 + 4;
						local524 = Static180.method2649(local60, arg9);
						for (local526 = 0; local526 < 3; local526++) {
							local99 &= 0x7;
							local519 &= 0x7;
							if (Static264.aBooleanArrayArray5[local78][local519] && Static476.anIntArray456[local99] <= local60.anInt2859) {
								Static127.anIntArray114[local99] = local60.anInt2869;
								Static275.anIntArray260[local99] = local524;
								Static268.anIntArray269[local99] = local60.anInt2868;
								Static599.anIntArray553[local99] = local60.anInt2863;
								if (local60.anInt2859 == Static476.anIntArray456[local99]) {
									Static190.anIntArray174[local99] |= 0x20;
								} else {
									Static190.anIntArray174[local99] = 32;
								}
								Static476.anIntArray456[local99] = local60.anInt2859;
							}
							local99--;
							local519++;
						}
						if (!local28[arg12 & 0x3]) {
							arg6[0] = Static599.aBooleanArrayArray7[local78][local486 + 2 & 0x3];
						}
					} else if (!local28[arg12 & 0x3]) {
						arg6[0] = Static177.aBooleanArrayArray4[local78][local486 + 2 & 0x3];
					}
				}
			}
		}
		if (arg8 < arg0 - 1) {
			local47 = arg4[arg11][arg8 + 1] & 0xFF;
			if (local47 > 0) {
				local60 = this.aClass3_2.method40(local47 - 1);
				if (local60.anInt2869 != -1) {
					local78 = arg2[arg11][arg8 + 1];
					local486 = arg1[arg11][arg8 + 1];
					if (local60.aBoolean204) {
						local99 = 4;
						local519 = local486 * 2 + 2;
						local524 = Static180.method2649(local60, arg9);
						for (local526 = 0; local526 < 3; local526++) {
							local99 &= 0x7;
							local519 &= 0x7;
							if (Static264.aBooleanArrayArray5[local78][local519] && Static476.anIntArray456[local99] <= local60.anInt2859) {
								Static127.anIntArray114[local99] = local60.anInt2869;
								Static275.anIntArray260[local99] = local524;
								Static268.anIntArray269[local99] = local60.anInt2868;
								Static599.anIntArray553[local99] = local60.anInt2863;
								if (local60.anInt2859 == Static476.anIntArray456[local99]) {
									Static190.anIntArray174[local99] |= 0x10;
								} else {
									Static190.anIntArray174[local99] = 16;
								}
								Static476.anIntArray456[local99] = local60.anInt2859;
							}
							local99++;
							local519--;
						}
						if (!local28[arg12 + 2 & 0x3]) {
							arg6[2] = Static599.aBooleanArrayArray7[local78][local486 & 0x3];
						}
					} else if (!local28[arg12 + 2 & 0x3]) {
						arg6[2] = Static177.aBooleanArrayArray4[local78][local486 & 0x3];
					}
				}
			}
		}
		if (arg11 > 0) {
			local47 = arg4[arg11 - 1][arg8] & 0xFF;
			if (local47 > 0) {
				local60 = this.aClass3_2.method40(local47 - 1);
				if (local60.anInt2869 != -1) {
					local78 = arg2[arg11 - 1][arg8];
					local486 = arg1[arg11 - 1][arg8];
					if (local60.aBoolean204) {
						local99 = 6;
						local519 = local486 * 2 + 4;
						local524 = Static180.method2649(local60, arg9);
						for (local526 = 0; local526 < 3; local526++) {
							local99 &= 0x7;
							local519 &= 0x7;
							if (Static264.aBooleanArrayArray5[local78][local519] && Static476.anIntArray456[local99] <= local60.anInt2859) {
								Static127.anIntArray114[local99] = local60.anInt2869;
								Static275.anIntArray260[local99] = local524;
								Static268.anIntArray269[local99] = local60.anInt2868;
								Static599.anIntArray553[local99] = local60.anInt2863;
								if (local60.anInt2859 == Static476.anIntArray456[local99]) {
									Static190.anIntArray174[local99] |= 0x8;
								} else {
									Static190.anIntArray174[local99] = 8;
								}
								Static476.anIntArray456[local99] = local60.anInt2859;
							}
							local519--;
							local99++;
						}
						if (!local28[arg12 + 3 & 0x3]) {
							arg6[3] = Static599.aBooleanArrayArray7[local78][local486 + 1 & 0x3];
						}
					} else if (!local28[arg12 + 3 & 0x3]) {
						arg6[3] = Static177.aBooleanArrayArray4[local78][local486 + 1 & 0x3];
					}
				}
			}
		}
		if (arg11 < arg3 - 1) {
			local47 = arg4[arg11 + 1][arg8] & 0xFF;
			if (local47 > 0) {
				local60 = this.aClass3_2.method40(local47 - 1);
				if (local60.anInt2869 != -1) {
					local78 = arg2[arg11 + 1][arg8];
					local486 = arg1[arg11 + 1][arg8];
					if (local60.aBoolean204) {
						local99 = 4;
						local519 = local486 * 2 + 6;
						local524 = Static180.method2649(local60, arg9);
						for (local526 = 0; local526 < 3; local526++) {
							local519 &= 0x7;
							local99 &= 0x7;
							if (Static264.aBooleanArrayArray5[local78][local519] && Static476.anIntArray456[local99] <= local60.anInt2859) {
								Static127.anIntArray114[local99] = local60.anInt2869;
								Static275.anIntArray260[local99] = local524;
								Static268.anIntArray269[local99] = local60.anInt2868;
								Static599.anIntArray553[local99] = local60.anInt2863;
								if (local60.anInt2859 == Static476.anIntArray456[local99]) {
									Static190.anIntArray174[local99] |= 0x4;
								} else {
									Static190.anIntArray174[local99] = 4;
								}
								Static476.anIntArray456[local99] = local60.anInt2859;
							}
							local519++;
							local99--;
						}
						if (!local28[arg12 + 1 & 0x3]) {
							arg6[1] = Static599.aBooleanArrayArray7[local78][local486 + 3 & 0x3];
						}
					} else if (!local28[arg12 + 1 & 0x3]) {
						arg6[1] = Static177.aBooleanArrayArray4[local78][local486 + 3 & 0x3];
					}
				}
			}
		}
		if (arg5 == null) {
			return;
		}
		local47 = Static180.method2649(arg5, arg9);
		if (!arg5.aBoolean204) {
			return;
		}
		for (@Pc(1193) int local1193 = 0; local1193 < 8; local1193++) {
			@Pc(1203) int local1203 = local1193 - arg12 * 2 & 0x7;
			if (Static264.aBooleanArrayArray5[arg7][local1193] && arg5.anInt2859 >= Static476.anIntArray456[local1203]) {
				Static127.anIntArray114[local1203] = arg5.anInt2869;
				Static275.anIntArray260[local1203] = local47;
				Static268.anIntArray269[local1203] = arg5.anInt2868;
				Static599.anIntArray553[local1203] = arg5.anInt2863;
				if (arg5.anInt2859 == Static476.anIntArray456[local1203]) {
					Static190.anIntArray174[local1203] |= 0x2;
				} else {
					Static190.anIntArray174[local1203] = 2;
				}
				Static476.anIntArray456[local1203] = arg5.anInt2859;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(ZIIIIIIILclient!rv;II)V")
	private void method531(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class5_Sub15 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg2 == 1) {
			arg3 = 1;
		} else if (arg2 == 2) {
			arg3 = 1;
			arg5 = 1;
		} else if (arg2 == 3) {
			arg5 = 1;
		}
		@Pc(78) int local78;
		if (arg4 < 0 || this.anInt563 <= arg4 || arg1 < 0 || arg1 >= this.anInt567) {
			while (true) {
				local78 = arg7.method3642();
				if (local78 == 0) {
					return;
				}
				if (local78 == 1) {
					arg7.method3642();
					return;
				}
				if (local78 <= 49) {
					arg7.method3642();
				}
			}
			return;
		}
		if (!this.aBoolean26 && !arg0) {
			Static317.aByteArrayArrayArray13[arg6][arg4][arg1] = 0;
		}
		while (true) {
			local78 = arg7.method3642();
			if (local78 == 0) {
				if (this.aBoolean26) {
					this.anIntArrayArrayArray2[0][arg5 + arg4][arg3 + arg1] = 0;
					return;
				} else if (arg6 == 0) {
					this.anIntArrayArrayArray2[0][arg4 + arg5][arg1 + arg3] = -Static237.method3383(arg8 + 556238, arg9 + 932731) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray2[arg6][arg5 + arg4][arg1 + arg3] = this.anIntArrayArrayArray2[arg6 - 1][arg4 + arg5][arg3 + arg1] - 960;
					return;
				}
			}
			if (local78 == 1) {
				@Pc(170) int local170 = arg7.method3642();
				if (!this.aBoolean26) {
					if (local170 == 1) {
						local170 = 0;
					}
					if (arg6 == 0) {
						this.anIntArrayArrayArray2[0][arg5 + arg4][arg3 + arg1] = -local170 * 8 << 2;
						return;
					}
					this.anIntArrayArrayArray2[arg6][arg5 + arg4][arg3 + arg1] = this.anIntArrayArrayArray2[arg6 - 1][arg5 + arg4][arg3 + arg1] - (local170 * 8 << 2);
					return;
				}
				this.anIntArrayArrayArray2[0][arg4 + arg5][arg1 + arg3] = local170 * 8 << 2;
				return;
			}
			if (local78 <= 49) {
				if (arg0) {
					arg7.method3642();
				} else {
					this.aByteArrayArrayArray9[arg6][arg4][arg1] = arg7.method3677();
					this.aByteArrayArrayArray12[arg6][arg4][arg1] = (byte) ((local78 - 2) / 4);
					this.aByteArrayArrayArray10[arg6][arg4][arg1] = (byte) (arg2 + local78 - 2 & 0x3);
				}
			} else if (local78 <= 81) {
				if (!this.aBoolean26 && !arg0) {
					Static317.aByteArrayArrayArray13[arg6][arg4][arg1] = (byte) (local78 - 49);
				}
			} else if (!arg0) {
				this.aByteArrayArrayArray7[arg6][arg4][arg1] = (byte) (local78 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(ZIIIII)V")
	public final void method532(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9;
		for (@Pc(3) int local3 = arg1; local3 < arg1 + arg2; local3++) {
			for (local9 = arg3; local9 < arg3 + arg4; local9++) {
				if (local9 >= 0 && local9 < this.anInt563 && local3 >= 0 && local3 < this.anInt567) {
					this.anIntArrayArrayArray2[arg0][local9][local3] = arg0 <= 0 ? 0 : this.anIntArrayArrayArray2[arg0 - 1][local9][local3] - 960;
				}
			}
		}
		if (arg3 > 0 && this.anInt563 > arg3) {
			for (local9 = arg1 + 1; local9 < arg1 + arg2; local9++) {
				if (local9 >= 0 && this.anInt567 > local9) {
					this.anIntArrayArrayArray2[arg0][arg3][local9] = this.anIntArrayArrayArray2[arg0][arg3 - 1][local9];
				}
			}
		}
		if (arg1 > 0 && arg1 < this.anInt567) {
			for (local9 = arg3 + 1; local9 < arg3 + arg4; local9++) {
				if (local9 >= 0 && local9 < this.anInt563) {
					this.anIntArrayArrayArray2[arg0][local9][arg1] = this.anIntArrayArrayArray2[arg0][local9][arg1 - 1];
				}
			}
		}
		if (arg3 < 0 || arg1 < 0 || this.anInt563 <= arg3 || arg1 >= this.anInt567) {
			return;
		}
		if (arg0 == 0) {
			if (arg3 > 0 && this.anIntArrayArrayArray2[arg0][arg3 - 1][arg1] != 0) {
				this.anIntArrayArrayArray2[arg0][arg3][arg1] = this.anIntArrayArrayArray2[arg0][arg3 - 1][arg1];
				return;
			}
			if (arg1 > 0 && this.anIntArrayArrayArray2[arg0][arg3][arg1 - 1] != 0) {
				this.anIntArrayArrayArray2[arg0][arg3][arg1] = this.anIntArrayArrayArray2[arg0][arg3][arg1 - 1];
				return;
			}
			if (arg3 > 0 && arg1 > 0 && this.anIntArrayArrayArray2[arg0][arg3 - 1][arg1 - 1] != 0) {
				this.anIntArrayArrayArray2[arg0][arg3][arg1] = this.anIntArrayArrayArray2[arg0][arg3 - 1][arg1 - 1];
				return;
			}
			return;
		}
		if (arg3 > 0 && this.anIntArrayArrayArray2[arg0 - 1][arg3 - 1][arg1] != this.anIntArrayArrayArray2[arg0][arg3 - 1][arg1]) {
			this.anIntArrayArrayArray2[arg0][arg3][arg1] = this.anIntArrayArrayArray2[arg0][arg3 - 1][arg1];
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray2[arg0][arg3][arg1 - 1] != this.anIntArrayArrayArray2[arg0 - 1][arg3][arg1 - 1]) {
			this.anIntArrayArrayArray2[arg0][arg3][arg1] = this.anIntArrayArrayArray2[arg0][arg3][arg1 - 1];
			return;
		}
		if (arg3 > 0 && arg1 > 0 && this.anIntArrayArrayArray2[arg0 - 1][arg3 - 1][arg1 - 1] != this.anIntArrayArrayArray2[arg0][arg3 - 1][arg1 - 1]) {
			this.anIntArrayArrayArray2[arg0][arg3][arg1] = this.anIntArrayArrayArray2[arg0][arg3 - 1][arg1 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(Lclient!s;Lclient!s;Lclient!ha;I)V")
	public final void method534(@OriginalArg(0) Class88 arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) Class143 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt563][this.anInt567];
		if (Static159.anIntArray138 == null || this.anInt567 != Static159.anIntArray138.length) {
			Static159.anIntArray138 = new int[this.anInt567];
			Static458.anIntArray446 = new int[this.anInt567];
			Static347.anIntArray355 = new int[this.anInt567];
			Static55.anIntArray54 = new int[this.anInt567];
			Static624.anIntArray572 = new int[this.anInt567];
		}
		@Pc(53) int local53;
		for (@Pc(49) int local49 = 0; local49 < this.anInt566; local49++) {
			for (local53 = 0; local53 < this.anInt567; local53++) {
				Static159.anIntArray138[local53] = 0;
				Static347.anIntArray355[local53] = 0;
				Static624.anIntArray572[local53] = 0;
				Static458.anIntArray446[local53] = 0;
				Static55.anIntArray54[local53] = 0;
			}
			for (@Pc(86) int local86 = -5; local86 < this.anInt563; local86++) {
				@Pc(96) int local96;
				@Pc(115) int local115;
				@Pc(187) int local187;
				for (@Pc(90) int local90 = 0; local90 < this.anInt567; local90++) {
					local96 = local86 + 5;
					@Pc(164) int local164;
					if (local96 < this.anInt563) {
						local115 = this.aByteArrayArrayArray7[local49][local96][local90] & 0xFF;
						if (local115 > 0) {
							@Pc(128) Class327 local128 = this.aClass269_2.method6615(local115 - 1);
							Static159.anIntArray138[local90] += local128.anInt8939;
							Static347.anIntArray355[local90] += local128.anInt8954;
							Static624.anIntArray572[local90] += local128.anInt8945;
							Static458.anIntArray446[local90] += local128.anInt8950;
							local164 = Static55.anIntArray54[local90]++;
						}
					}
					local115 = local86 - 5;
					if (local115 >= 0) {
						local187 = this.aByteArrayArrayArray7[local49][local115][local90] & 0xFF;
						if (local187 > 0) {
							@Pc(197) Class327 local197 = this.aClass269_2.method6615(local187 - 1);
							Static159.anIntArray138[local90] -= local197.anInt8939;
							Static347.anIntArray355[local90] -= local197.anInt8954;
							Static624.anIntArray572[local90] -= local197.anInt8945;
							Static458.anIntArray446[local90] -= local197.anInt8950;
							local164 = Static55.anIntArray54[local90]--;
						}
					}
				}
				if (local86 >= 0) {
					local96 = 0;
					local115 = 0;
					local187 = 0;
					@Pc(251) int local251 = 0;
					@Pc(253) int local253 = 0;
					for (@Pc(255) int local255 = -5; local255 < this.anInt567; local255++) {
						@Pc(261) int local261 = local255 + 5;
						if (local261 < this.anInt567) {
							local115 += Static347.anIntArray355[local261];
							local253 += Static55.anIntArray54[local261];
							local187 += Static624.anIntArray572[local261];
							local251 += Static458.anIntArray446[local261];
							local96 += Static159.anIntArray138[local261];
						}
						@Pc(303) int local303 = local255 - 5;
						if (local303 >= 0) {
							local251 -= Static458.anIntArray446[local303];
							local96 -= Static159.anIntArray138[local303];
							local115 -= Static347.anIntArray355[local303];
							local253 -= Static55.anIntArray54[local303];
							local187 -= Static624.anIntArray572[local303];
						}
						if (local255 >= 0 && local251 > 0 && local253 > 0) {
							local11[local86][local255] = Static244.method3490(local96 * 256 / local251, local187 / local253, local115 / local253);
						}
					}
				}
			}
			if (Static162.aBoolean577) {
				this.method525(local49 == 0 ? arg0 : null, arg2, local49 == 0 ? arg1 : null, Static298.aClass88Array3[local49], local49, local11);
			} else {
				this.method535(local49 == 0 ? arg0 : null, arg2, Static298.aClass88Array3[local49], local49 == 0 ? arg1 : null, local11, local49);
			}
			this.aByteArrayArrayArray7[local49] = null;
			this.aByteArrayArrayArray9[local49] = null;
			this.aByteArrayArrayArray12[local49] = null;
			this.aByteArrayArrayArray10[local49] = null;
		}
		if (!this.aBoolean26) {
			if (Static661.anInt10337 != 0) {
				Static655.method8586();
			}
			if (Static489.aBoolean608) {
				Static342.method5193();
			}
		}
		for (local53 = 0; local53 < this.anInt566; local53++) {
			Static298.aClass88Array3[local53].YA();
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(Lclient!s;Lclient!ha;Lclient!s;Lclient!s;[[IIB)V")
	private void method535(@OriginalArg(0) Class88 arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(2) Class88 arg2, @OriginalArg(3) Class88 arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int arg5) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt563; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt567; local7++) {
				if (Static595.anInt9703 == -1 || Static71.method1044(arg5, local3, local7, Static595.anInt9703)) {
					@Pc(30) byte local30 = this.aByteArrayArrayArray12[arg5][local3][local7];
					@Pc(39) byte local39 = this.aByteArrayArrayArray10[arg5][local3][local7];
					@Pc(50) int local50 = this.aByteArrayArrayArray9[arg5][local3][local7] & 0xFF;
					@Pc(61) int local61 = this.aByteArrayArrayArray7[arg5][local3][local7] & 0xFF;
					@Pc(76) Class123 local76 = local50 == 0 ? null : this.aClass3_2.method40(local50 - 1);
					@Pc(91) Class327 local91 = local61 == 0 ? null : this.aClass269_2.method6615(local61 - 1);
					if (local30 == 0 && local76 == null) {
						local30 = 12;
					}
					@Pc(99) Class123 local99 = local76;
					if (local76 != null && local76.anInt2869 == -1 && local76.anInt2862 == -1) {
						local99 = local76;
						local76 = null;
					}
					if (local76 != null || local91 != null) {
						@Pc(122) int local122 = Static425.anIntArray418[local30];
						@Pc(126) int local126 = Static600.anIntArray555[local30];
						@Pc(139) int local139 = (local76 == null ? 0 : local126) + (local91 == null ? 0 : local122);
						@Pc(141) int local141 = 0;
						@Pc(143) int local143 = 0;
						@Pc(150) int local150 = local76 == null ? -1 : local76.anInt2868;
						@Pc(157) int local157 = local91 == null ? -1 : local91.anInt8948;
						@Pc(160) int[] local160 = new int[local139];
						@Pc(163) int[] local163 = new int[local139];
						@Pc(166) int[] local166 = new int[local139];
						@Pc(169) int[] local169 = new int[local139];
						@Pc(172) int[] local172 = new int[local139];
						@Pc(175) int[] local175 = new int[local139];
						@Pc(186) int[] local186 = local76 == null || local76.anInt2862 == -1 ? null : new int[local139];
						@Pc(196) int local196;
						if (local76 == null) {
							local143 = local126;
						} else {
							for (local196 = 0; local196 < local126; local196++) {
								local160[local141] = Static11.anIntArrayArray3[local30][local143];
								local163[local141] = Static427.anIntArrayArray93[local30][local143];
								local166[local141] = Static144.anIntArrayArray90[local30][local143];
								local172[local141] = local150;
								local175[local141] = local76.anInt2863;
								local169[local141] = local76.anInt2869;
								if (local186 != null) {
									local186[local141] = local76.anInt2862;
								}
								local143++;
								local141++;
							}
							if (!this.aBoolean26 && arg5 == 0) {
								Static549.method7581(local3, local7, local76.anInt2873, local76.anInt2867 * 8, local76.anInt2865);
							}
						}
						if (local91 != null) {
							for (local196 = 0; local196 < local122; local196++) {
								local160[local141] = Static11.anIntArrayArray3[local30][local143];
								local163[local141] = Static427.anIntArrayArray93[local30][local143];
								local166[local141] = Static144.anIntArrayArray90[local30][local143];
								local172[local141] = local157;
								local175[local141] = local91.anInt8951;
								local169[local141] = arg4[local3][local7];
								if (local186 != null) {
									local186[local141] = local169[local141];
								}
								local143++;
								local141++;
							}
						}
						local196 = this.anIntArray51.length;
						@Pc(341) int[] local341 = new int[local196];
						@Pc(344) int[] local344 = new int[local196];
						@Pc(351) int[] local351 = arg0 == null ? null : new int[local196];
						@Pc(360) int[] local360 = arg0 == null && arg3 == null ? null : new int[local196];
						@Pc(369) int local369;
						@Pc(374) int local374;
						@Pc(457) int local457;
						@Pc(466) int local466;
						for (@Pc(362) int local362 = 0; local362 < local196; local362++) {
							local369 = this.anIntArray51[local362];
							local374 = this.anIntArray48[local362];
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
							if (local351 != null && Static264.aBooleanArrayArray5[local30][local362]) {
								local457 = local341[local362] + (local3 << 9);
								local466 = (local7 << 9) + local344[local362];
								local351[local362] = arg0.method8753(local457, local466) - arg2.method8753(local457, local466);
							}
							if (local360 != null) {
								if (arg0 != null && !Static264.aBooleanArrayArray5[local30][local362]) {
									local457 = local341[local362] + (local3 << 9);
									local466 = local344[local362] + (local7 << 9);
									local360[local362] = arg2.method8753(local457, local466) - arg0.method8753(local457, local466);
								} else if (arg3 != null && !Static49.aBooleanArrayArray2[local30][local362]) {
									local457 = local341[local362] + (local3 << 9);
									local466 = (local7 << 9) + local344[local362];
									local360[local362] = arg3.method8753(local457, local466) - arg2.method8753(local457, local466);
								}
							}
						}
						local369 = arg2.method8749(local3, local7);
						local374 = arg2.method8749(local3 + 1, local7);
						local457 = arg2.method8749(local3 + 1, local7 + 1);
						local466 = arg2.method8749(local3, local7 + 1);
						@Pc(608) boolean local608 = Static488.method7149(local3, local7);
						if (local608 && arg5 > 1 || !local608 && arg5 > 0) {
							@Pc(624) boolean local624 = true;
							if (local91 != null && !local91.aBoolean647) {
								local624 = false;
							} else if (local61 == 0 && local30 != 0) {
								local624 = false;
							} else if (local50 > 0 && local99 != null && !local99.aBoolean202) {
								local624 = false;
							}
							if (local624 && local374 == local369 && local369 == local457 && local466 == local369) {
								this.aByteArrayArrayArray8[arg5][local3][local7] = (byte) (this.aByteArrayArrayArray8[arg5][local3][local7] | 0x4);
							}
						}
						@Pc(696) int local696 = 0;
						@Pc(698) int local698 = 0;
						@Pc(700) int local700 = 0;
						if (this.aBoolean26) {
							local696 = Static462.method6848(local3, local7);
							local698 = Static166.method2459(local3, local7);
							local700 = Static484.method7068(local3, local7);
						}
						arg2.method8756(local3, local7, local341, local351, local344, local360, local160, local163, local166, local169, local186, local172, local175, local696, local698, local700);
						Static116.method1852(arg5, local3, local7);
					}
				}
			}
		}
	}
}
