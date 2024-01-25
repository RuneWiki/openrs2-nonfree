import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public class Class49 {

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!bv", name = "m", descriptor = "[I")
	private final int[] anIntArray403 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "[I")
	private final int[] anIntArray402 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!bv", name = "h", descriptor = "Z")
	public final boolean aBoolean534;

	@OriginalMember(owner = "client!bv", name = "j", descriptor = "Lclient!bw;")
	private Class50 aClass50_5;

	@OriginalMember(owner = "client!bv", name = "l", descriptor = "I")
	public final int anInt7594;

	@OriginalMember(owner = "client!bv", name = "s", descriptor = "I")
	protected final int anInt7585;

	@OriginalMember(owner = "client!bv", name = "x", descriptor = "Lclient!we;")
	private final Class389 aClass389_6;

	@OriginalMember(owner = "client!bv", name = "o", descriptor = "I")
	protected final int anInt7592;

	@OriginalMember(owner = "client!bv", name = "z", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!bv", name = "w", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!bv", name = "k", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!bv", name = "n", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!bv", name = "q", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!bv", name = "g", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(IIIZLclient!we;Lclient!bw;)V")
	protected Class49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class389 arg4, @OriginalArg(5) Class50 arg5) {
		this.aBoolean534 = arg3;
		this.aClass50_5 = arg5;
		this.anInt7594 = arg0;
		this.anInt7585 = arg2;
		this.aClass389_6 = arg4;
		this.anInt7592 = arg1;
		this.aByteArrayArrayArray18 = new byte[this.anInt7594][this.anInt7592][this.anInt7585];
		this.aByteArrayArrayArray13 = new byte[this.anInt7594][this.anInt7592][this.anInt7585];
		this.aByteArrayArrayArray14 = new byte[this.anInt7594][this.anInt7592][this.anInt7585];
		this.anIntArrayArrayArray17 = new int[this.anInt7594][this.anInt7592 + 1][this.anInt7585 + 1];
		this.aByteArrayArrayArray17 = new byte[this.anInt7594][this.anInt7592][this.anInt7585];
		this.aByteArrayArrayArray16 = new byte[this.anInt7594][this.anInt7592 + 1][this.anInt7585 + 1];
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIB)V")
	public final void method6713(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		for (@Pc(18) int local18 = 0; local18 < this.anInt7594; local18++) {
			this.method6714(64, arg1, arg0, local18, 64);
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIBIII)V")
	public final void method6714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12;
		for (@Pc(5) int local5 = arg2; local5 < arg2 + arg4; local5++) {
			for (local12 = arg1; local12 < arg1 + arg0; local12++) {
				if (local12 >= 0 && this.anInt7592 > local12 && local5 >= 0 && local5 < this.anInt7585) {
					this.anIntArrayArrayArray17[arg3][local12][local5] = arg3 <= 0 ? 0 : this.anIntArrayArrayArray17[arg3 - 1][local12][local5] - 960;
				}
			}
		}
		if (arg1 > 0 && arg1 < this.anInt7592) {
			for (local12 = arg2 + 1; local12 < arg4 + arg2; local12++) {
				if (local12 >= 0 && this.anInt7585 > local12) {
					this.anIntArrayArrayArray17[arg3][arg1][local12] = this.anIntArrayArrayArray17[arg3][arg1 - 1][local12];
				}
			}
		}
		if (arg2 > 0 && this.anInt7585 > arg2) {
			for (local12 = arg1 + 1; local12 < arg1 + arg0; local12++) {
				if (local12 >= 0 && local12 < this.anInt7592) {
					this.anIntArrayArrayArray17[arg3][local12][arg2] = this.anIntArrayArrayArray17[arg3][local12][arg2 - 1];
				}
			}
		}
		if (arg1 < 0 || arg2 < 0 || arg1 >= this.anInt7592 || this.anInt7585 <= arg2) {
			return;
		}
		if (arg3 != 0) {
			if (arg1 > 0 && this.anIntArrayArrayArray17[arg3 - 1][arg1 - 1][arg2] != this.anIntArrayArrayArray17[arg3][arg1 - 1][arg2]) {
				this.anIntArrayArrayArray17[arg3][arg1][arg2] = this.anIntArrayArrayArray17[arg3][arg1 - 1][arg2];
				return;
			}
			if (arg2 > 0 && this.anIntArrayArrayArray17[arg3][arg1][arg2 - 1] != this.anIntArrayArrayArray17[arg3 - 1][arg1][arg2 - 1]) {
				this.anIntArrayArrayArray17[arg3][arg1][arg2] = this.anIntArrayArrayArray17[arg3][arg1][arg2 - 1];
				return;
			}
			if (arg1 > 0 && arg2 > 0 && this.anIntArrayArrayArray17[arg3 - 1][arg1 - 1][arg2 - 1] != this.anIntArrayArrayArray17[arg3][arg1 - 1][arg2 - 1]) {
				this.anIntArrayArrayArray17[arg3][arg1][arg2] = this.anIntArrayArrayArray17[arg3][arg1 - 1][arg2 - 1];
				return;
			}
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray17[arg3][arg1 - 1][arg2] != 0) {
			this.anIntArrayArrayArray17[arg3][arg1][arg2] = this.anIntArrayArrayArray17[arg3][arg1 - 1][arg2];
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray17[arg3][arg1][arg2 - 1] != 0) {
			this.anIntArrayArrayArray17[arg3][arg1][arg2] = this.anIntArrayArrayArray17[arg3][arg1][arg2 - 1];
			return;
		}
		if (arg1 > 0 && arg2 > 0 && this.anIntArrayArrayArray17[arg3][arg1 - 1][arg2 - 1] != 0) {
			this.anIntArrayArrayArray17[arg3][arg1][arg2] = this.anIntArrayArrayArray17[arg3][arg1 - 1][arg2 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!s;Lclient!ha;BLclient!s;)V")
	public final void method6715(@OriginalArg(0) Class159 arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(3) Class159 arg2) {
		if (Static601.anIntArray534 == null || Static601.anIntArray534.length != this.anInt7585) {
			Static601.anIntArray534 = new int[this.anInt7585];
			Static283.anIntArray290 = new int[this.anInt7585];
			Static226.anIntArray312 = new int[this.anInt7585];
			Static666.anIntArray584 = new int[this.anInt7585];
			Static130.anIntArray134 = new int[this.anInt7585];
		}
		@Pc(42) int[][] local42 = new int[this.anInt7592][this.anInt7585];
		@Pc(50) int local50;
		for (@Pc(44) int local44 = 0; local44 < this.anInt7594; local44++) {
			for (local50 = 0; local50 < this.anInt7585; local50++) {
				Static601.anIntArray534[local50] = 0;
				Static130.anIntArray134[local50] = 0;
				Static283.anIntArray290[local50] = 0;
				Static226.anIntArray312[local50] = 0;
				Static666.anIntArray584[local50] = 0;
			}
			for (@Pc(81) int local81 = -5; local81 < this.anInt7592; local81++) {
				@Pc(97) int local97;
				@Pc(116) int local116;
				@Pc(185) int local185;
				for (@Pc(89) int local89 = 0; local89 < this.anInt7585; local89++) {
					local97 = local81 + 5;
					@Pc(165) int local165;
					if (local97 < this.anInt7592) {
						local116 = this.aByteArrayArrayArray13[local44][local97][local89] & 0xFF;
						if (local116 > 0) {
							@Pc(129) Class148 local129 = this.aClass50_5.method1019(local116 - 1);
							Static601.anIntArray534[local89] += local129.anInt3750;
							Static130.anIntArray134[local89] += local129.anInt3755;
							Static283.anIntArray290[local89] += local129.anInt3753;
							Static226.anIntArray312[local89] += local129.anInt3752;
							local165 = Static666.anIntArray584[local89]++;
						}
					}
					local116 = local81 - 5;
					if (local116 >= 0) {
						local185 = this.aByteArrayArrayArray13[local44][local116][local89] & 0xFF;
						if (local185 > 0) {
							@Pc(198) Class148 local198 = this.aClass50_5.method1019(local185 - 1);
							Static601.anIntArray534[local89] -= local198.anInt3750;
							Static130.anIntArray134[local89] -= local198.anInt3755;
							Static283.anIntArray290[local89] -= local198.anInt3753;
							Static226.anIntArray312[local89] -= local198.anInt3752;
							local165 = Static666.anIntArray584[local89]--;
						}
					}
				}
				if (local81 >= 0) {
					local97 = 0;
					local116 = 0;
					local185 = 0;
					@Pc(259) int local259 = 0;
					@Pc(261) int local261 = 0;
					for (@Pc(263) int local263 = -5; local263 < this.anInt7585; local263++) {
						@Pc(269) int local269 = local263 + 5;
						if (this.anInt7585 > local269) {
							local261 += Static666.anIntArray584[local269];
							local259 += Static226.anIntArray312[local269];
							local185 += Static283.anIntArray290[local269];
							local97 += Static601.anIntArray534[local269];
							local116 += Static130.anIntArray134[local269];
						}
						@Pc(311) int local311 = local263 - 5;
						if (local311 >= 0) {
							local185 -= Static283.anIntArray290[local311];
							local261 -= Static666.anIntArray584[local311];
							local259 -= Static226.anIntArray312[local311];
							local97 -= Static601.anIntArray534[local311];
							local116 -= Static130.anIntArray134[local311];
						}
						if (local263 >= 0 && local259 > 0 && local261 > 0) {
							local42[local81][local263] = Static461.method6801(local97 * 256 / local259, local116 / local261, local185 / local261);
						}
					}
				}
			}
			if (Static428.aBoolean510) {
				this.method6717(arg1, local42, Static258.aClass159Array1[local44], local44 == 0 ? arg2 : null, local44, local44 == 0 ? arg0 : null);
			} else {
				this.method6716(arg1, local44 == 0 ? arg0 : null, local44 == 0 ? arg2 : null, local44, Static258.aClass159Array1[local44], local42);
			}
			this.aByteArrayArrayArray13[local44] = null;
			this.aByteArrayArrayArray18[local44] = null;
			this.aByteArrayArrayArray17[local44] = null;
			this.aByteArrayArrayArray14[local44] = null;
		}
		if (!this.aBoolean534) {
			if (Static296.anInt5322 != 0) {
				Static541.method7943();
			}
			if (Static619.aBoolean710) {
				Static56.method1004();
			}
		}
		for (local50 = 0; local50 < this.anInt7594; local50++) {
			Static258.aClass159Array1[local50].YA();
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!ha;Lclient!s;Lclient!s;ILclient!s;[[II)V")
	private void method6716(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class159 arg1, @OriginalArg(2) Class159 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class159 arg4, @OriginalArg(5) int[][] arg5) {
		for (@Pc(21) int local21 = 0; local21 < this.anInt7592; local21++) {
			for (@Pc(25) int local25 = 0; local25 < this.anInt7585; local25++) {
				if (Static230.anInt4432 == -1 || Static348.method5316(arg3, local25, Static230.anInt4432, local21)) {
					@Pc(56) byte local56 = this.aByteArrayArrayArray17[arg3][local21][local25];
					@Pc(65) byte local65 = this.aByteArrayArrayArray14[arg3][local21][local25];
					@Pc(76) int local76 = this.aByteArrayArrayArray18[arg3][local21][local25] & 0xFF;
					@Pc(87) int local87 = this.aByteArrayArrayArray13[arg3][local21][local25] & 0xFF;
					@Pc(103) Class8 local103 = local76 == 0 ? null : this.aClass389_6.method9284(local76 - 1);
					@Pc(116) Class148 local116 = local87 == 0 ? null : this.aClass50_5.method1019(local87 - 1);
					if (local56 == 0 && local103 == null) {
						local56 = 12;
					}
					@Pc(126) Class8 local126 = local103;
					if (local103 != null && local103.anInt68 == -1 && local103.anInt66 == -1) {
						local126 = local103;
						local103 = null;
					}
					if (local103 != null || local116 != null) {
						@Pc(155) int local155 = Static140.anIntArray142[local56];
						@Pc(159) int local159 = Static156.anIntArray148[local56];
						@Pc(174) int local174 = (local103 == null ? 0 : local159) + (local116 == null ? 0 : local155);
						@Pc(176) int local176 = 0;
						@Pc(178) int local178 = 0;
						@Pc(186) int local186 = local103 == null ? -1 : local103.anInt59;
						@Pc(194) int local194 = local116 == null ? -1 : local116.anInt3757;
						@Pc(197) int[] local197 = new int[local174];
						@Pc(200) int[] local200 = new int[local174];
						@Pc(203) int[] local203 = new int[local174];
						@Pc(206) int[] local206 = new int[local174];
						@Pc(209) int[] local209 = new int[local174];
						@Pc(212) int[] local212 = new int[local174];
						@Pc(227) int[] local227 = local103 == null || local103.anInt66 == -1 ? null : new int[local174];
						@Pc(237) int local237;
						if (local103 == null) {
							local178 = local159;
						} else {
							for (local237 = 0; local237 < local159; local237++) {
								local197[local176] = Static157.anIntArrayArray15[local56][local178];
								local200[local176] = Static335.anIntArrayArray37[local56][local178];
								local203[local176] = Static294.anIntArrayArray36[local56][local178];
								local209[local176] = local186;
								local212[local176] = local103.anInt61;
								local206[local176] = local103.anInt68;
								if (local227 != null) {
									local227[local176] = local103.anInt66;
								}
								local178++;
								local176++;
							}
							if (!this.aBoolean534 && arg3 == 0) {
								Static216.method5709(local21, local25, local103.anInt71, local103.anInt62 * 8, local103.anInt64);
							}
						}
						if (local116 != null) {
							for (local237 = 0; local237 < local155; local237++) {
								local197[local176] = Static157.anIntArrayArray15[local56][local178];
								local200[local176] = Static335.anIntArrayArray37[local56][local178];
								local203[local176] = Static294.anIntArrayArray36[local56][local178];
								local209[local176] = local194;
								local212[local176] = local116.anInt3759;
								local206[local176] = arg5[local21][local25];
								if (local227 != null) {
									local227[local176] = local206[local176];
								}
								local178++;
								local176++;
							}
						}
						local237 = this.anIntArray403.length;
						@Pc(398) int[] local398 = new int[local237];
						@Pc(401) int[] local401 = new int[local237];
						@Pc(413) int[] local413 = arg1 == null ? null : new int[local237];
						@Pc(425) int[] local425 = arg1 == null && arg2 == null ? null : new int[local237];
						@Pc(434) int local434;
						@Pc(439) int local439;
						@Pc(536) int local536;
						@Pc(544) int local544;
						for (@Pc(427) int local427 = 0; local427 < local237; local427++) {
							local434 = this.anIntArray403[local427];
							local439 = this.anIntArray402[local427];
							if (local65 == 0) {
								local398[local427] = local434;
								local401[local427] = local439;
							} else if (local65 == 1) {
								local398[local427] = local439;
								local401[local427] = 512 - local434;
							} else if (local65 == 2) {
								local398[local427] = 512 - local434;
								local401[local427] = 512 - local439;
							} else if (local65 == 3) {
								local398[local427] = 512 - local439;
								local401[local427] = local434;
							}
							if (local413 != null && Static589.aBooleanArrayArray13[local56][local427]) {
								local536 = (local21 << 9) + local398[local427];
								local544 = local401[local427] + (local25 << 9);
								local413[local427] = arg1.method8209(local536, local544) - arg4.method8209(local536, local544);
							}
							if (local425 != null) {
								if (arg1 != null && !Static589.aBooleanArrayArray13[local56][local427]) {
									local536 = (local21 << 9) + local398[local427];
									local544 = (local25 << 9) + local401[local427];
									local425[local427] = arg4.method8209(local536, local544) - arg1.method8209(local536, local544);
								} else if (arg2 != null && !Static60.aBooleanArrayArray2[local56][local427]) {
									local536 = local398[local427] + (local21 << 9);
									local544 = local401[local427] + (local25 << 9);
									local425[local427] = arg2.method8209(local536, local544) - arg4.method8209(local536, local544);
								}
							}
						}
						local434 = arg4.method8207(local25, local21);
						local439 = arg4.method8207(local25, local21 + 1);
						local536 = arg4.method8207(local25 + 1, local21 + 1);
						local544 = arg4.method8207(local25 + 1, local21);
						@Pc(699) boolean local699 = Static551.method7974(local21, local25);
						if (local699 && arg3 > 1 || !local699 && arg3 > 0) {
							@Pc(723) boolean local723 = true;
							if (local116 != null && !local116.aBoolean277) {
								local723 = false;
							} else if (local87 == 0 && local56 != 0) {
								local723 = false;
							} else if (local76 > 0 && local126 != null && !local126.aBoolean6) {
								local723 = false;
							}
							if (local723 && local439 == local434 && local434 == local536 && local544 == local434) {
								this.aByteArrayArrayArray16[arg3][local21][local25] = (byte) (this.aByteArrayArrayArray16[arg3][local21][local25] | 0x4);
							}
						}
						@Pc(812) int local812 = 0;
						@Pc(814) int local814 = 0;
						@Pc(816) int local816 = 0;
						if (this.aBoolean534) {
							local812 = Static602.method8510(local21, local25);
							local814 = Static684.method9447(local21, local25);
							local816 = Static510.method7641(local21, local25);
						}
						arg4.method8200(local21, local25, local398, local413, local401, local425, local197, local200, local203, local206, local227, local209, local212, local812, local814, local816);
						Static154.method2232(arg3, local21, local25);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILclient!ha;[[ILclient!s;Lclient!s;ILclient!s;)V")
	private void method6717(@OriginalArg(1) Class144 arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) Class159 arg2, @OriginalArg(4) Class159 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class159 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray17[arg4];
		@Pc(23) byte[][] local23 = this.aByteArrayArrayArray14[arg4];
		@Pc(28) byte[][] local28 = this.aByteArrayArrayArray13[arg4];
		@Pc(33) byte[][] local33 = this.aByteArrayArrayArray18[arg4];
		for (@Pc(35) int local35 = 0; local35 < this.anInt7592; local35++) {
			@Pc(52) int local52 = local35 >= this.anInt7592 - 1 ? local35 : local35 + 1;
			for (@Pc(54) int local54 = 0; local54 < this.anInt7585; local54++) {
				@Pc(71) int local71 = this.anInt7585 - 1 <= local54 ? local54 : local54 + 1;
				if (Static230.anInt4432 == -1 || Static348.method5316(arg4, local54, Static230.anInt4432, local35)) {
					@Pc(89) boolean local89 = false;
					@Pc(91) boolean local91 = false;
					@Pc(94) boolean[] local94 = new boolean[4];
					@Pc(100) int local100 = local10[local35][local54];
					@Pc(106) int local106 = local23[local35][local54];
					@Pc(114) int local114 = local33[local35][local54] & 0xFF;
					@Pc(122) int local122 = local28[local35][local54] & 0xFF;
					@Pc(130) int local130 = local28[local35][local71] & 0xFF;
					@Pc(138) int local138 = local28[local52][local71] & 0xFF;
					@Pc(146) int local146 = local28[local52][local54] & 0xFF;
					if (local114 != 0 || local122 != 0) {
						@Pc(172) Class8 local172 = local114 == 0 ? null : this.aClass389_6.method9284(local114 - 1);
						@Pc(188) Class148 local188 = local122 == 0 ? null : this.aClass50_5.method1019(local122 - 1);
						if (local100 == 0 && local172 == null) {
							local100 = 12;
						}
						@Pc(198) Class8 local198 = local172;
						if (local172 != null) {
							if (local172.anInt68 == -1 && local172.anInt66 == -1) {
								local198 = local172;
								local172 = null;
							} else if (local188 != null && local100 != 0) {
								local91 = local172.aBoolean8;
							}
						}
						@Pc(316) int local316;
						@Pc(350) int local350;
						@Pc(430) int local430;
						@Pc(443) int local443;
						if ((local100 == 0 || local100 == 12) && local35 > 0 && local54 > 0 && local35 < this.anInt7592 && this.anInt7585 > local54) {
							@Pc(292) int local292 = local28[local52][local54 - 1] == local122 ? 1 : -1;
							local316 = local122 == local28[local35 - 1][local54 - 1] ? 1 : -1;
							@Pc(334) int local334 = local122 == local28[local52][local71] ? 1 : -1;
							local350 = local122 == local28[local35 - 1][local71] ? 1 : -1;
							if (local122 == local28[local35][local54 - 1]) {
								local316++;
								local292++;
							} else {
								local316--;
								local292--;
							}
							if (local122 == local28[local52][local54]) {
								local334++;
								local292++;
							} else {
								local334--;
								local292--;
							}
							if (local122 == local28[local35][local71]) {
								local334++;
								local350++;
							} else {
								local334--;
								local350--;
							}
							if (local28[local35 - 1][local54] == local122) {
								local350++;
								local316++;
							} else {
								local350--;
								local316--;
							}
							local430 = local316 - local334;
							if (local430 < 0) {
								local430 = -local430;
							}
							local443 = local292 - local350;
							if (local443 < 0) {
								local443 = -local443;
							}
							if (local443 == local430) {
								local430 = arg2.method8207(local54, local35) - arg2.method8207(local71, local52);
								local443 = arg2.method8207(local54, local52) - arg2.method8207(local71, local35);
								if (local430 < 0) {
									local430 = -local430;
								}
								if (local443 < 0) {
									local443 = -local443;
								}
							}
							local106 = local443 > local430 ? 1 : 0;
						}
						for (local316 = 0; local316 < 13; local316++) {
							Static368.anIntArray341[local316] = -1;
							Static271.anIntArray254[local316] = 1;
						}
						@Pc(547) boolean[] local547 = local172 != null && local172.aBoolean8 ? Static63.aBooleanArrayArray3[local100] : Static652.aBooleanArrayArray14[local100];
						this.method6719(arg0, local10, local100, local23, this.anInt7592, local94, local172, local35, local106, this.anInt7585, local54, (byte) 123, local188, local33);
						@Pc(579) boolean local579 = local172 != null && local172.anInt68 != local172.anInt66;
						if (!local579) {
							for (local350 = 0; local350 < 8; local350++) {
								if (Static368.anIntArray341[local350] >= 0 && Static193.anIntArray507[local350] != Static441.anIntArray395[local350]) {
									local579 = true;
									break;
								}
							}
						}
						if (!local547[local106 + 1 & 0x3]) {
							local94[1] = Static523.method7770(local94[1], (Static271.anIntArray254[2] & Static271.anIntArray254[4]) == 0);
						}
						if (!local547[local106 + 3 & 0x3]) {
							local94[3] = Static523.method7770(local94[3], (Static271.anIntArray254[0] & Static271.anIntArray254[6]) == 0);
						}
						if (!local547[local106 & 0x3]) {
							local94[0] = Static523.method7770(local94[0], (Static271.anIntArray254[2] & Static271.anIntArray254[0]) == 0);
						}
						if (!local547[local106 + 2 & 0x3]) {
							local94[2] = Static523.method7770(local94[2], (Static271.anIntArray254[6] & Static271.anIntArray254[4]) == 0);
						}
						if (!local91 && (local100 == 0 || local100 == 12)) {
							if (local94[0] && !local94[1] && !local94[2] && local94[3]) {
								local94[0] = local94[3] = false;
								local106 = 0;
								local100 = local100 == 0 ? 13 : 14;
							} else if (local94[0] && local94[1] && !local94[2] && !local94[3]) {
								local94[0] = local94[1] = false;
								local106 = 3;
								local100 = local100 == 0 ? 13 : 14;
							} else if (!local94[0] && local94[1] && local94[2] && !local94[3]) {
								local106 = 2;
								local100 = local100 == 0 ? 13 : 14;
								local94[1] = local94[2] = false;
							} else if (!local94[0] && !local94[1] && local94[2] && local94[3]) {
								local100 = local100 == 0 ? 13 : 14;
								local106 = 1;
								local94[2] = local94[3] = false;
							}
						}
						@Pc(953) boolean local953 = !local91 && !local94[0] && !local94[2] && !local94[1] && !local94[3];
						@Pc(955) int[] local955 = null;
						@Pc(965) int[] local965;
						@Pc(991) int[] local991;
						@Pc(969) int[] local969;
						if (local953) {
							local443 = local172 == null ? 0 : Static156.anIntArray148[local100];
							local965 = Static157.anIntArrayArray15[local100];
							local969 = Static294.anIntArrayArray36[local100];
							local991 = Static335.anIntArrayArray37[local100];
							local430 = local188 == null ? 0 : Static140.anIntArray142[local100];
						} else if (local91) {
							local965 = Static219.anIntArrayArray25[local100];
							local969 = Static338.anIntArrayArray38[local100];
							local443 = local172 == null ? 0 : Static573.anIntArray495[local100];
							local430 = local188 == null ? 0 : Static656.anIntArray575[local100];
							local991 = Static400.anIntArrayArray10[local100];
							local955 = Static655.anIntArrayArray66[local100];
						} else {
							local965 = Static415.anIntArrayArray50[local100];
							local955 = Static635.anIntArrayArray63[local100];
							local969 = Static634.anIntArrayArray62[local100];
							local443 = local172 == null ? 0 : Static325.anIntArray317[local100];
							local991 = Static619.anIntArrayArray61[local100];
							local430 = local188 == null ? 0 : Static518.anIntArray462[local100];
						}
						@Pc(1065) int local1065 = local430 + local443;
						if (local1065 <= 0) {
							Static154.method2232(arg4, local35, local54);
						} else {
							if (local94[0]) {
								local1065++;
							}
							if (local94[2]) {
								local1065++;
							}
							if (local94[1]) {
								local1065++;
							}
							if (local94[3]) {
								local1065++;
							}
							@Pc(1107) int local1107 = 0;
							@Pc(1109) int local1109 = 0;
							@Pc(1113) int local1113 = local1065 * 3;
							@Pc(1121) int[] local1121 = local579 ? new int[local1113] : null;
							@Pc(1124) int[] local1124 = new int[local1113];
							@Pc(1127) int[] local1127 = new int[local1113];
							@Pc(1130) int[] local1130 = new int[local1113];
							@Pc(1133) int[] local1133 = new int[local1113];
							@Pc(1136) int[] local1136 = new int[local1113];
							@Pc(1144) int[] local1144 = arg5 == null ? null : new int[local1113];
							@Pc(1156) int[] local1156 = arg5 == null && arg3 == null ? null : new int[local1113];
							@Pc(1158) int local1158 = -1;
							@Pc(1160) int local1160 = -1;
							@Pc(1162) int local1162 = 256;
							@Pc(1220) boolean local1220;
							@Pc(1212) int local1212;
							@Pc(1214) int local1214;
							@Pc(1459) int local1459;
							@Pc(1465) int local1465;
							@Pc(1474) int local1474;
							@Pc(1479) int local1479;
							@Pc(1496) int local1496;
							@Pc(1484) int local1484;
							@Pc(1494) int local1494;
							@Pc(1560) int local1560;
							@Pc(1566) int local1566;
							@Pc(1262) byte local1262;
							if (local172 != null) {
								local1162 = local172.anInt61;
								local1160 = local172.anInt59;
								local1158 = local172.anInt68;
								local1212 = Static193.method8386(local172, arg0);
								for (local1214 = 0; local1214 < local443; local1214++) {
									local1220 = false;
									if (local94[-local106 & 0x3] && local955[0] == local1107) {
										Static517.anIntArray461[0] = local965[local1107];
										Static517.anIntArray461[1] = 1;
										Static517.anIntArray461[2] = local969[local1107];
										Static517.anIntArray461[3] = 1;
										Static517.anIntArray461[4] = local991[local1107];
										local1262 = 6;
										Static517.anIntArray461[5] = local969[local1107];
									} else if (local94[2 - local106 & 0x3] && local955[2] == local1107) {
										Static517.anIntArray461[0] = local965[local1107];
										Static517.anIntArray461[1] = 5;
										Static517.anIntArray461[2] = local969[local1107];
										Static517.anIntArray461[3] = 5;
										Static517.anIntArray461[4] = local991[local1107];
										local1262 = 6;
										Static517.anIntArray461[5] = local969[local1107];
									} else if (local94[1 - local106 & 0x3] && local955[1] == local1107) {
										Static517.anIntArray461[0] = local965[local1107];
										Static517.anIntArray461[1] = 3;
										Static517.anIntArray461[2] = local969[local1107];
										Static517.anIntArray461[3] = 3;
										Static517.anIntArray461[4] = local991[local1107];
										local1262 = 6;
										Static517.anIntArray461[5] = local969[local1107];
									} else if (local94[3 - local106 & 0x3] && local955[3] == local1107) {
										Static517.anIntArray461[0] = local965[local1107];
										Static517.anIntArray461[1] = 7;
										Static517.anIntArray461[2] = local969[local1107];
										Static517.anIntArray461[3] = 7;
										Static517.anIntArray461[4] = local991[local1107];
										Static517.anIntArray461[5] = local969[local1107];
										local1262 = 6;
									} else {
										Static517.anIntArray461[0] = local965[local1107];
										Static517.anIntArray461[1] = local991[local1107];
										local1262 = 3;
										Static517.anIntArray461[2] = local969[local1107];
									}
									local1107++;
									for (local1459 = 0; local1459 < local1262; local1459++) {
										local1465 = Static517.anIntArray461[local1459];
										local1474 = local1465 - local106 * 2 & 0x7;
										local1479 = this.anIntArray403[local1465];
										local1484 = this.anIntArray402[local1465];
										if (local106 == 1) {
											local1494 = 512 - local1479;
											local1496 = local1484;
										} else if (local106 == 2) {
											local1496 = 512 - local1479;
											local1494 = 512 - local1484;
										} else if (local106 == 3) {
											local1494 = local1479;
											local1496 = 512 - local1484;
										} else {
											local1496 = local1479;
											local1494 = local1484;
										}
										local1124[local1109] = local1496;
										local1127[local1109] = local1494;
										if (local1144 != null && Static589.aBooleanArrayArray13[local100][local1465]) {
											local1560 = local1496 + (local35 << 9);
											local1566 = local1494 + (local54 << 9);
											local1144[local1109] = arg5.method8209(local1560, local1566) - arg2.method8209(local1560, local1566);
										}
										if (local1156 != null) {
											if (arg5 != null && !Static589.aBooleanArrayArray13[local100][local1465]) {
												local1560 = (local35 << 9) + local1496;
												local1566 = local1494 + (local54 << 9);
												local1156[local1109] = arg2.method8209(local1560, local1566) - arg5.method8209(local1560, local1566);
											} else if (arg3 != null && !Static60.aBooleanArrayArray2[local100][local1465]) {
												local1560 = local1496 + (local35 << 9);
												local1566 = local1494 + (local54 << 9);
												local1156[local1109] = arg3.method8209(local1560, local1566) - arg2.method8209(local1560, local1566);
											}
										}
										if (local1465 < 8 && Static368.anIntArray341[local1474] > local172.anInt69) {
											if (local1121 != null) {
												local1121[local1109] = Static193.anIntArray507[local1474];
											}
											local1136[local1109] = Static438.anIntArray393[local1474];
											local1133[local1109] = Static604.anIntArray535[local1474];
											local1130[local1109] = Static441.anIntArray395[local1474];
										} else {
											if (local1121 != null) {
												local1121[local1109] = local1212;
											}
											local1133[local1109] = local172.anInt59;
											local1136[local1109] = local172.anInt61;
											local1130[local1109] = local1158;
										}
										local1109++;
									}
								}
								if (!this.aBoolean534 && arg4 == 0) {
									Static216.method5709(local35, local54, local172.anInt71, local172.anInt62 * 8, local172.anInt64);
								}
								if (local100 != 12 && local172.anInt68 != -1 && local172.aBoolean7) {
									local89 = true;
								}
							} else if (local953) {
								local1107 = Static156.anIntArray148[local100];
							} else if (local91) {
								local1107 = Static573.anIntArray495[local100];
							} else {
								local1107 = Static325.anIntArray317[local100];
							}
							if (local188 != null) {
								if (local130 == 0) {
									local130 = local122;
								}
								if (local138 == 0) {
									local138 = local122;
								}
								if (local146 == 0) {
									local146 = local122;
								}
								@Pc(1826) Class148 local1826 = this.aClass50_5.method1019(local122 - 1);
								@Pc(1834) Class148 local1834 = this.aClass50_5.method1019(local130 - 1);
								@Pc(1844) Class148 local1844 = this.aClass50_5.method1019(local138 - 1);
								@Pc(1852) Class148 local1852 = this.aClass50_5.method1019(local146 - 1);
								for (local1474 = 0; local1474 < local430; local1474++) {
									local1220 = false;
									if (local94[-local106 & 0x3] && local1107 == local955[0]) {
										Static517.anIntArray461[0] = local965[local1107];
										Static517.anIntArray461[1] = 1;
										Static517.anIntArray461[2] = local969[local1107];
										Static517.anIntArray461[3] = 1;
										Static517.anIntArray461[4] = local991[local1107];
										local1262 = 6;
										Static517.anIntArray461[5] = local969[local1107];
									} else if (local94[2 - local106 & 0x3] && local1107 == local955[2]) {
										Static517.anIntArray461[0] = local965[local1107];
										Static517.anIntArray461[1] = 5;
										Static517.anIntArray461[2] = local969[local1107];
										Static517.anIntArray461[3] = 5;
										Static517.anIntArray461[4] = local991[local1107];
										Static517.anIntArray461[5] = local969[local1107];
										local1262 = 6;
									} else if (local94[1 - local106 & 0x3] && local955[1] == local1107) {
										Static517.anIntArray461[0] = local965[local1107];
										Static517.anIntArray461[1] = 3;
										Static517.anIntArray461[2] = local969[local1107];
										Static517.anIntArray461[3] = 3;
										Static517.anIntArray461[4] = local991[local1107];
										local1262 = 6;
										Static517.anIntArray461[5] = local969[local1107];
									} else if (local94[3 - local106 & 0x3] && local955[3] == local1107) {
										Static517.anIntArray461[0] = local965[local1107];
										Static517.anIntArray461[1] = 7;
										Static517.anIntArray461[2] = local969[local1107];
										Static517.anIntArray461[3] = 7;
										Static517.anIntArray461[4] = local991[local1107];
										Static517.anIntArray461[5] = local969[local1107];
										local1262 = 6;
									} else {
										Static517.anIntArray461[0] = local965[local1107];
										Static517.anIntArray461[1] = local991[local1107];
										Static517.anIntArray461[2] = local969[local1107];
										local1262 = 3;
									}
									for (local1479 = 0; local1479 < local1262; local1479++) {
										local1496 = Static517.anIntArray461[local1479];
										local1484 = local1496 - local106 * 2 & 0x7;
										local1494 = this.anIntArray403[local1496];
										local1566 = this.anIntArray402[local1496];
										@Pc(2138) int local2138;
										if (local106 == 1) {
											local2138 = 512 - local1494;
											local1560 = local1566;
										} else if (local106 == 2) {
											local1560 = 512 - local1494;
											local2138 = 512 - local1566;
										} else if (local106 == 3) {
											local2138 = local1494;
											local1560 = 512 - local1566;
										} else {
											local2138 = local1566;
											local1560 = local1494;
										}
										local1124[local1109] = local1560;
										local1127[local1109] = local2138;
										@Pc(2194) int local2194;
										@Pc(2200) int local2200;
										if (local1144 != null && Static589.aBooleanArrayArray13[local100][local1496]) {
											local2194 = (local35 << 9) + local1560;
											local2200 = (local54 << 9) + local2138;
											local1144[local1109] = arg5.method8209(local2194, local2200) - arg2.method8209(local2194, local2200);
										}
										if (local1156 != null) {
											if (arg5 != null && !Static589.aBooleanArrayArray13[local100][local1496]) {
												local2194 = local1560 + (local35 << 9);
												local2200 = local2138 + (local54 << 9);
												local1156[local1109] = arg2.method8209(local2194, local2200) - arg5.method8209(local2194, local2200);
											} else if (arg3 != null && !Static60.aBooleanArrayArray2[local100][local1496]) {
												local2194 = local1560 + (local35 << 9);
												local2200 = (local54 << 9) + local2138;
												local1156[local1109] = arg3.method8209(local2194, local2200) - arg2.method8209(local2194, local2200);
											}
										}
										if (local1496 < 8 && Static368.anIntArray341[local1484] >= 0) {
											if (local1121 != null) {
												local1121[local1109] = Static193.anIntArray507[local1484];
											}
											local1136[local1109] = Static438.anIntArray393[local1484];
											local1133[local1109] = Static604.anIntArray535[local1484];
											local1130[local1109] = Static441.anIntArray395[local1484];
										} else {
											if (local91 && Static589.aBooleanArrayArray13[local100][local1496]) {
												local1133[local1109] = local1160;
												local1136[local1109] = local1162;
												local1130[local1109] = local1158;
											} else if (local1560 == 0 && local2138 == 0) {
												local1130[local1109] = arg1[local35][local54];
												local1133[local1109] = local1826.anInt3757;
												local1136[local1109] = local1826.anInt3759;
											} else if (local1560 == 0 && local2138 == 512) {
												local1130[local1109] = arg1[local35][local71];
												local1133[local1109] = local1834.anInt3757;
												local1136[local1109] = local1834.anInt3759;
											} else if (local1560 == 512 && local2138 == 512) {
												local1130[local1109] = arg1[local52][local71];
												local1133[local1109] = local1844.anInt3757;
												local1136[local1109] = local1844.anInt3759;
											} else if (local1560 == 512 && local2138 == 0) {
												local1130[local1109] = arg1[local52][local54];
												local1133[local1109] = local1852.anInt3757;
												local1136[local1109] = local1852.anInt3759;
											} else {
												if (local1560 < 256) {
													if (local2138 >= 256) {
														local1133[local1109] = local1834.anInt3757;
														local1136[local1109] = local1834.anInt3759;
													} else {
														local1133[local1109] = local1826.anInt3757;
														local1136[local1109] = local1826.anInt3759;
													}
												} else if (local2138 < 256) {
													local1133[local1109] = local1852.anInt3757;
													local1136[local1109] = local1852.anInt3759;
												} else {
													local1133[local1109] = local1844.anInt3757;
													local1136[local1109] = local1844.anInt3759;
												}
												local2194 = Static310.method4974(arg1[local35][local54], arg1[local52][local54], local1560 << 7 >> 9);
												local2200 = Static310.method4974(arg1[local35][local71], arg1[local52][local71], local1560 << 7 >> 9);
												local1130[local1109] = Static310.method4974(local2194, local2200, local2138 << 7 >> 9);
											}
											if (local1121 != null) {
												local1121[local1109] = local1130[local1109];
											}
										}
										local1109++;
									}
									local1107++;
								}
								if (local100 != 0 && local188.aBoolean276) {
									local89 = true;
								}
							}
							local1212 = arg2.method8207(local54, local35);
							local1214 = arg2.method8207(local54, local52);
							local1459 = arg2.method8207(local71, local52);
							local1465 = arg2.method8207(local71, local35);
							@Pc(2692) boolean local2692 = Static551.method7974(local35, local54);
							if (local2692 && arg4 > 1 || !local2692 && arg4 > 0) {
								@Pc(2714) boolean local2714 = true;
								if (local188 != null && !local188.aBoolean277) {
									local2714 = false;
								} else if (local122 == 0 && local100 != 0) {
									local2714 = false;
								} else if (local114 > 0 && local198 != null && !local198.aBoolean6) {
									local2714 = false;
								}
								if (local2714 && local1212 == local1214 && local1212 == local1459 && local1465 == local1212) {
									this.aByteArrayArrayArray16[arg4][local35][local54] = (byte) (this.aByteArrayArrayArray16[arg4][local35][local54] | 0x4);
								}
							}
							local1479 = 0;
							local1496 = 0;
							local1484 = 0;
							if (this.aBoolean534) {
								local1479 = Static602.method8510(local35, local54);
								local1496 = Static684.method9447(local35, local54);
								local1484 = Static510.method7641(local35, local54);
							}
							arg2.U(local35, local54, local1124, local1144, local1127, local1156, local1130, local1121, local1133, local1136, local1479, local1496, local1484, local89);
							Static154.method2232(arg4, local35, local54);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIIILclient!jc;IZII)V")
	private void method6718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class14_Sub21 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 1) {
			arg2 = 1;
		} else if (arg3 == 2) {
			arg0 = 1;
			arg2 = 1;
		} else if (arg3 == 3) {
			arg0 = 1;
		}
		@Pc(57) int local57;
		if (arg7 < 0 || arg7 >= this.anInt7592 || arg9 < 0 || this.anInt7585 <= arg9) {
			while (true) {
				local57 = arg6.method7695(121);
				if (local57 == 0) {
					return;
				}
				if (local57 == 1) {
					arg6.method7695(120);
					return;
				}
				if (local57 <= 49) {
					arg6.method7695(112);
				}
			}
			return;
		}
		if (!this.aBoolean534 && !arg8) {
			Static446.aByteArrayArrayArray12[arg5][arg7][arg9] = 0;
		}
		while (true) {
			local57 = arg6.method7695(100);
			if (local57 == 0) {
				if (this.aBoolean534) {
					this.anIntArrayArrayArray17[0][arg0 + arg7][arg2 + arg9] = 0;
					return;
				} else if (arg5 == 0) {
					this.anIntArrayArrayArray17[0][arg0 + arg7][arg2 + arg9] = -Static247.method4200(arg1 + 556238, 932731 - -arg4) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray17[arg5][arg7 + arg0][arg2 + arg9] = this.anIntArrayArrayArray17[arg5 - 1][arg7 + arg0][arg9 + arg2] - 960;
					return;
				}
			}
			if (local57 == 1) {
				@Pc(195) int local195 = arg6.method7695(97);
				if (this.aBoolean534) {
					this.anIntArrayArrayArray17[0][arg0 + arg7][arg2 + arg9] = local195 * 8 << 2;
					return;
				}
				if (local195 == 1) {
					local195 = 0;
				}
				if (arg5 == 0) {
					this.anIntArrayArrayArray17[0][arg7 + arg0][arg9 + arg2] = -local195 * 8 << 2;
					return;
				}
				this.anIntArrayArrayArray17[arg5][arg0 + arg7][arg9 + arg2] = this.anIntArrayArrayArray17[arg5 - 1][arg0 + arg7][arg2 + arg9] - (local195 * 8 << 2);
				return;
			}
			if (local57 <= 49) {
				if (arg8) {
					arg6.method7695(118);
				} else {
					this.aByteArrayArrayArray18[arg5][arg7][arg9] = arg6.method7720();
					this.aByteArrayArrayArray17[arg5][arg7][arg9] = (byte) ((local57 - 2) / 4);
					this.aByteArrayArrayArray14[arg5][arg7][arg9] = (byte) (arg3 + local57 - 2 & 0x3);
				}
			} else if (local57 <= 81) {
				if (!this.aBoolean534 && !arg8) {
					Static446.aByteArrayArrayArray12[arg5][arg7][arg9] = (byte) (local57 - 49);
				}
			} else if (!arg8) {
				this.aByteArrayArrayArray13[arg5][arg7][arg9] = (byte) (local57 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!ha;[[BI[[BI[ZLclient!ada;IIIIBLclient!hd;[[B)V")
	private void method6719(@OriginalArg(0) Class144 arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean[] arg5, @OriginalArg(6) Class8 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) Class148 arg12, @OriginalArg(13) byte[][] arg13) {
		@Pc(21) boolean[] local21 = arg6 != null && arg6.aBoolean8 ? Static63.aBooleanArrayArray3[arg2] : Static652.aBooleanArrayArray14[arg2];
		@Pc(39) int local39;
		@Pc(49) Class8 local49;
		@Pc(69) byte local69;
		@Pc(85) int local85;
		@Pc(90) int local90;
		if (arg10 > 0) {
			if (arg7 > 0) {
				local39 = arg13[arg7 - 1][arg10 - 1] & 0xFF;
				if (local39 > 0) {
					local49 = this.aClass389_6.method9284(local39 - 1);
					if (local49.anInt68 != -1 && local49.aBoolean8) {
						local69 = arg1[arg7 - 1][arg10 - 1];
						local85 = arg3[arg7 - 1][arg10 - 1] * 2 + 4 & 0x7;
						local90 = Static193.method8386(local49, arg0);
						if (Static589.aBooleanArrayArray13[local69][local85]) {
							Static441.anIntArray395[0] = local49.anInt68;
							Static193.anIntArray507[0] = local90;
							Static604.anIntArray535[0] = local49.anInt59;
							Static438.anIntArray393[0] = local49.anInt61;
							Static368.anIntArray341[0] = local49.anInt69;
							Static271.anIntArray254[0] = 256;
						}
					}
				}
			}
			if (arg4 - 1 > arg7) {
				local39 = arg13[arg7 + 1][arg10 - 1] & 0xFF;
				if (local39 > 0) {
					local49 = this.aClass389_6.method9284(local39 - 1);
					if (local49.anInt68 != -1 && local49.aBoolean8) {
						local69 = arg1[arg7 + 1][arg10 - 1];
						local85 = arg3[arg7 + 1][arg10 - 1] * 2 + 6 & 0x7;
						local90 = Static193.method8386(local49, arg0);
						if (Static589.aBooleanArrayArray13[local69][local85]) {
							Static441.anIntArray395[2] = local49.anInt68;
							Static193.anIntArray507[2] = local90;
							Static604.anIntArray535[2] = local49.anInt59;
							Static438.anIntArray393[2] = local49.anInt61;
							Static368.anIntArray341[2] = local49.anInt69;
							Static271.anIntArray254[2] = 512;
						}
					}
				}
			}
		}
		if (arg10 < arg9 - 1) {
			if (arg7 > 0) {
				local39 = arg13[arg7 - 1][arg10 + 1] & 0xFF;
				if (local39 > 0) {
					local49 = this.aClass389_6.method9284(local39 - 1);
					if (local49.anInt68 != -1 && local49.aBoolean8) {
						local69 = arg1[arg7 - 1][arg10 + 1];
						local85 = arg3[arg7 - 1][arg10 + 1] * 2 + 2 & 0x7;
						local90 = Static193.method8386(local49, arg0);
						if (Static589.aBooleanArrayArray13[local69][local85]) {
							Static441.anIntArray395[6] = local49.anInt68;
							Static193.anIntArray507[6] = local90;
							Static604.anIntArray535[6] = local49.anInt59;
							Static438.anIntArray393[6] = local49.anInt61;
							Static368.anIntArray341[6] = local49.anInt69;
							Static271.anIntArray254[6] = 64;
						}
					}
				}
			}
			if (arg4 - 1 > arg7) {
				local39 = arg13[arg7 + 1][arg10 + 1] & 0xFF;
				if (local39 > 0) {
					local49 = this.aClass389_6.method9284(local39 - 1);
					if (local49.anInt68 != -1 && local49.aBoolean8) {
						local69 = arg1[arg7 + 1][arg10 + 1];
						local85 = arg3[arg7 + 1][arg10 + 1] * 2 & 0x7;
						local90 = Static193.method8386(local49, arg0);
						if (Static589.aBooleanArrayArray13[local69][local85]) {
							Static441.anIntArray395[4] = local49.anInt68;
							Static193.anIntArray507[4] = local90;
							Static604.anIntArray535[4] = local49.anInt59;
							Static438.anIntArray393[4] = local49.anInt61;
							Static368.anIntArray341[4] = local49.anInt69;
							Static271.anIntArray254[4] = 128;
						}
					}
				}
			}
		}
		if (arg11 < 47) {
			this.aClass50_5 = null;
		}
		@Pc(549) int local549;
		@Pc(554) int local554;
		@Pc(556) int local556;
		@Pc(513) byte local513;
		if (arg10 > 0) {
			local39 = arg13[arg7][arg10 - 1] & 0xFF;
			if (local39 > 0) {
				local49 = this.aClass389_6.method9284(local39 - 1);
				if (local49.anInt68 != -1) {
					local69 = arg1[arg7][arg10 - 1];
					local513 = arg3[arg7][arg10 - 1];
					if (local49.aBoolean8) {
						local90 = 2;
						local549 = local513 * 2 + 4;
						local554 = Static193.method8386(local49, arg0);
						for (local556 = 0; local556 < 3; local556++) {
							local549 &= 0x7;
							local90 &= 0x7;
							if (Static589.aBooleanArrayArray13[local69][local549] && Static368.anIntArray341[local90] <= local49.anInt69) {
								Static441.anIntArray395[local90] = local49.anInt68;
								Static193.anIntArray507[local90] = local554;
								Static604.anIntArray535[local90] = local49.anInt59;
								Static438.anIntArray393[local90] = local49.anInt61;
								if (local49.anInt69 == Static368.anIntArray341[local90]) {
									Static271.anIntArray254[local90] |= 0x20;
								} else {
									Static271.anIntArray254[local90] = 32;
								}
								Static368.anIntArray341[local90] = local49.anInt69;
							}
							local90--;
							local549++;
						}
						if (!local21[arg8 & 0x3]) {
							arg5[0] = Static63.aBooleanArrayArray3[local69][local513 + 2 & 0x3];
						}
					} else if (!local21[arg8 & 0x3]) {
						arg5[0] = Static652.aBooleanArrayArray14[local69][local513 + 2 & 0x3];
					}
				}
			}
		}
		if (arg9 - 1 > arg10) {
			local39 = arg13[arg7][arg10 + 1] & 0xFF;
			if (local39 > 0) {
				local49 = this.aClass389_6.method9284(local39 - 1);
				if (local49.anInt68 != -1) {
					local69 = arg1[arg7][arg10 + 1];
					local513 = arg3[arg7][arg10 + 1];
					if (local49.aBoolean8) {
						local90 = 4;
						local549 = local513 * 2 + 2;
						local554 = Static193.method8386(local49, arg0);
						for (local556 = 0; local556 < 3; local556++) {
							local90 &= 0x7;
							local549 &= 0x7;
							if (Static589.aBooleanArrayArray13[local69][local549] && Static368.anIntArray341[local90] <= local49.anInt69) {
								Static441.anIntArray395[local90] = local49.anInt68;
								Static193.anIntArray507[local90] = local554;
								Static604.anIntArray535[local90] = local49.anInt59;
								Static438.anIntArray393[local90] = local49.anInt61;
								if (Static368.anIntArray341[local90] == local49.anInt69) {
									Static271.anIntArray254[local90] |= 0x10;
								} else {
									Static271.anIntArray254[local90] = 16;
								}
								Static368.anIntArray341[local90] = local49.anInt69;
							}
							local549--;
							local90++;
						}
						if (!local21[arg8 + 2 & 0x3]) {
							arg5[2] = Static63.aBooleanArrayArray3[local69][local513 & 0x3];
						}
					} else if (!local21[arg8 + 2 & 0x3]) {
						arg5[2] = Static652.aBooleanArrayArray14[local69][local513 & 0x3];
					}
				}
			}
		}
		if (arg7 > 0) {
			local39 = arg13[arg7 - 1][arg10] & 0xFF;
			if (local39 > 0) {
				local49 = this.aClass389_6.method9284(local39 - 1);
				if (local49.anInt68 != -1) {
					local69 = arg1[arg7 - 1][arg10];
					local513 = arg3[arg7 - 1][arg10];
					if (local49.aBoolean8) {
						local90 = 6;
						local549 = local513 * 2 + 4;
						local554 = Static193.method8386(local49, arg0);
						for (local556 = 0; local556 < 3; local556++) {
							local549 &= 0x7;
							local90 &= 0x7;
							if (Static589.aBooleanArrayArray13[local69][local549] && Static368.anIntArray341[local90] <= local49.anInt69) {
								Static441.anIntArray395[local90] = local49.anInt68;
								Static193.anIntArray507[local90] = local554;
								Static604.anIntArray535[local90] = local49.anInt59;
								Static438.anIntArray393[local90] = local49.anInt61;
								if (Static368.anIntArray341[local90] == local49.anInt69) {
									Static271.anIntArray254[local90] |= 0x8;
								} else {
									Static271.anIntArray254[local90] = 8;
								}
								Static368.anIntArray341[local90] = local49.anInt69;
							}
							local90++;
							local549--;
						}
						if (!local21[arg8 + 3 & 0x3]) {
							arg5[3] = Static63.aBooleanArrayArray3[local69][local513 + 1 & 0x3];
						}
					} else if (!local21[arg8 + 3 & 0x3]) {
						arg5[3] = Static652.aBooleanArrayArray14[local69][local513 + 1 & 0x3];
					}
				}
			}
		}
		if (arg7 < arg4 - 1) {
			local39 = arg13[arg7 + 1][arg10] & 0xFF;
			if (local39 > 0) {
				local49 = this.aClass389_6.method9284(local39 - 1);
				if (local49.anInt68 != -1) {
					local69 = arg1[arg7 + 1][arg10];
					local513 = arg3[arg7 + 1][arg10];
					if (local49.aBoolean8) {
						local90 = 4;
						local549 = local513 * 2 + 6;
						local554 = Static193.method8386(local49, arg0);
						for (local556 = 0; local556 < 3; local556++) {
							local90 &= 0x7;
							local549 &= 0x7;
							if (Static589.aBooleanArrayArray13[local69][local549] && Static368.anIntArray341[local90] <= local49.anInt69) {
								Static441.anIntArray395[local90] = local49.anInt68;
								Static193.anIntArray507[local90] = local554;
								Static604.anIntArray535[local90] = local49.anInt59;
								Static438.anIntArray393[local90] = local49.anInt61;
								if (local49.anInt69 == Static368.anIntArray341[local90]) {
									Static271.anIntArray254[local90] |= 0x4;
								} else {
									Static271.anIntArray254[local90] = 4;
								}
								Static368.anIntArray341[local90] = local49.anInt69;
							}
							local90--;
							local549++;
						}
						if (!local21[arg8 + 1 & 0x3]) {
							arg5[1] = Static63.aBooleanArrayArray3[local69][local513 + 3 & 0x3];
						}
					} else if (!local21[arg8 + 1 & 0x3]) {
						arg5[1] = Static652.aBooleanArrayArray14[local69][local513 + 3 & 0x3];
					}
				}
			}
		}
		if (arg6 == null) {
			return;
		}
		local39 = Static193.method8386(arg6, arg0);
		if (!arg6.aBoolean8) {
			return;
		}
		for (@Pc(1289) int local1289 = 0; local1289 < 8; local1289++) {
			@Pc(1299) int local1299 = local1289 - arg8 * 2 & 0x7;
			if (Static589.aBooleanArrayArray13[arg2][local1289] && Static368.anIntArray341[local1299] <= arg6.anInt69) {
				Static441.anIntArray395[local1299] = arg6.anInt68;
				Static193.anIntArray507[local1299] = local39;
				Static604.anIntArray535[local1299] = arg6.anInt59;
				Static438.anIntArray393[local1299] = arg6.anInt61;
				if (Static368.anIntArray341[local1299] == arg6.anInt69) {
					Static271.anIntArray254[local1299] |= 0x2;
				} else {
					Static271.anIntArray254[local1299] = 2;
				}
				Static368.anIntArray341[local1299] = arg6.anInt69;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "([[[II[Lclient!pka;Lclient!ha;)V")
	public final void method6720(@OriginalArg(0) int[][][] arg0, @OriginalArg(2) Class289[] arg1, @OriginalArg(3) Class144 arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(18) int local18;
		if (!this.aBoolean534) {
			for (local10 = 0; local10 < 4; local10++) {
				for (local14 = 0; local14 < this.anInt7592; local14++) {
					for (local18 = 0; local18 < this.anInt7585; local18++) {
						if ((Static446.aByteArrayArrayArray12[local10][local14][local18] & 0x1) != 0) {
							@Pc(37) int local37 = local10;
							if ((Static446.aByteArrayArrayArray12[1][local14][local18] & 0x2) != 0) {
								local37 = local10 - 1;
							}
							if (local37 >= 0) {
								arg1[local37].method7073(local18, local14);
							}
						}
					}
				}
			}
		}
		for (local10 = 0; local10 < this.anInt7594; local10++) {
			local14 = 0;
			local18 = 0;
			if (!this.aBoolean534) {
				if (Static688.aBoolean777) {
					local18 = 8;
				}
				if (Static619.aBoolean710) {
					local14 = 2;
				}
				if (Static296.anInt5322 != 0) {
					local14 |= 0x1;
					if (Static183.aBoolean221 | local10 == 0) {
						local18 |= 0x10;
					}
				}
			}
			if (Static619.aBoolean710) {
				local18 |= 0x7;
			}
			if (!Static308.aBoolean400) {
				local18 |= 0x20;
			}
			@Pc(176) int[][] local176 = arg0 == null || arg0.length <= local10 ? this.anIntArrayArrayArray17[local10] : arg0[local10];
			Static94.method1601(local10, arg2.method6959(this.anInt7592, this.anInt7585, this.anIntArrayArrayArray17[local10], local176, local14, local18));
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "([[IIZ)V")
	public final void method6721(@OriginalArg(0) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray17[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt7592 + 1; local12++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt7585 + 1; local18++) {
				local10[local12][local18] += arg0[local12][local18];
			}
		}
		if (false) {
			this.method6719((Class144) null, (byte[][]) null, 9, (byte[][]) null, -34, (boolean[]) null, (Class8) null, -76, 14, 70, 23, (byte) -99, (Class148) null, (byte[][]) null);
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IILclient!jc;III[Lclient!pka;)V")
	public final void method6722(@OriginalArg(0) int arg0, @OriginalArg(2) Class14_Sub21 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class289[] arg5) {
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (!this.aBoolean534) {
			for (local6 = 0; local6 < 4; local6++) {
				@Pc(12) Class289 local12 = arg5[local6];
				for (local14 = 0; local14 < 64; local14++) {
					for (local18 = 0; local18 < 64; local18++) {
						local24 = local14 + arg4;
						@Pc(29) int local29 = arg3 + local18;
						if (local24 >= 0 && local24 < this.anInt7592 && local29 >= 0 && local29 < this.anInt7585) {
							local12.method7084(local24, local29);
						}
					}
				}
			}
		}
		local6 = arg2 + arg4;
		@Pc(95) int local95 = arg3 + arg0;
		for (local14 = 0; local14 < this.anInt7594; local14++) {
			for (local18 = 0; local18 < 64; local18++) {
				for (local24 = 0; local24 < 64; local24++) {
					this.method6718(0, local95 + local24, 0, 0, local18 + local6, local14, arg1, local18 + arg4, false, arg3 + local24);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIILclient!jc;I[Lclient!pka;IIBI)V")
	public final void method6723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class14_Sub21 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class289[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = (arg2 & 0x7) * 8;
		@Pc(23) int local23;
		@Pc(51) int local51;
		if (!this.aBoolean534) {
			@Pc(21) Class289 local21 = arg5[arg4];
			for (local23 = 0; local23 < 8; local23++) {
				for (@Pc(26) int local26 = 0; local26 < 8; local26++) {
					@Pc(39) int local39 = arg0 + Static204.method3038(local23 & 0x7, arg7, local26 & 0x7);
					local51 = Static277.method4687(arg7, local23 & 0x7, local26 & 0x7) + arg6;
					if (local39 > 0 && local39 < this.anInt7592 - 1 && local51 > 0 && local51 < this.anInt7585 - 1) {
						local21.method7084(local39, local51);
					}
				}
			}
		}
		@Pc(101) int local101 = (arg8 & 0x7) * 8;
		@Pc(107) int local107 = (arg2 & 0x1FFFFFF8) << 3;
		local23 = (arg8 & 0xFFFFFFF8) << 3;
		@Pc(115) byte local115 = 0;
		@Pc(117) byte local117 = 0;
		if (arg7 == 1) {
			local117 = 1;
		} else if (arg7 == 2) {
			local117 = 1;
			local115 = 1;
		} else if (arg7 == 3) {
			local115 = 1;
		}
		for (local51 = 0; local51 < this.anInt7594; local51++) {
			for (@Pc(145) int local145 = 0; local145 < 64; local145++) {
				for (@Pc(148) int local148 = 0; local148 < 64; local148++) {
					if (arg1 == local51 && local145 >= local9 && local145 <= local9 + 8 && local101 <= local148 && local148 <= local101 + 8) {
						@Pc(230) int local230;
						@Pc(222) int local222;
						if (local145 == local9 + 8 || local148 == local101 + 8) {
							if (arg7 == 0) {
								local222 = arg6 + local148 - local101;
								local230 = local145 + arg0 - local9;
							} else if (arg7 == 1) {
								local230 = local148 + arg0 - local101;
								local222 = arg6 + local9 + 8 - local145;
							} else if (arg7 == 2) {
								local230 = local9 + arg0 + 8 - local145;
								local222 = local101 + arg6 + 8 - local148;
							} else {
								local222 = local145 + arg6 - local9;
								local230 = local101 + arg0 + 8 - local148;
							}
							this.method6718(0, local148 + local23, 0, 0, local107 + local145, arg4, arg3, local230, true, local222);
						} else {
							local230 = Static204.method3038(local145 & 0x7, arg7, local148 & 0x7) + arg0;
							local222 = arg6 + Static277.method4687(arg7, local145 & 0x7, local148 & 0x7);
							this.method6718(local115, local148 + local23, local117, arg7, local145 + local107, arg4, arg3, local230, false, local222);
						}
						if (local145 == 63 || local148 == 63) {
							@Pc(365) byte local365 = 1;
							if (local145 == 63 && local148 == 63) {
								local365 = 3;
							}
							for (@Pc(379) int local379 = 0; local379 < local365; local379++) {
								@Pc(382) int local382 = local145;
								@Pc(384) int local384 = local148;
								if (local379 == 0) {
									local382 = local145 == 63 ? 64 : local145;
									local384 = local148 == 63 ? 64 : local148;
								} else if (local379 == 1) {
									local382 = 64;
								} else if (local379 == 2) {
									local384 = 64;
								}
								@Pc(444) int local444;
								@Pc(436) int local436;
								if (arg7 == 0) {
									local436 = local384 + arg6 - local101;
									local444 = local382 + arg0 - local9;
								} else if (arg7 == 1) {
									local436 = local9 + arg6 + 8 - local382;
									local444 = arg0 + local384 - local101;
								} else if (arg7 == 2) {
									local436 = arg6 + local101 + 8 - local384;
									local444 = local9 + arg0 + 8 - local382;
								} else {
									local444 = local101 + arg0 + 8 - local384;
									local436 = local382 + arg6 - local9;
								}
								if (local444 >= 0 && this.anInt7592 > local444 && local436 >= 0 && this.anInt7585 > local436) {
									this.anIntArrayArrayArray17[arg4][local444][local436] = this.anIntArrayArrayArray17[arg4][local230 + local115][local222 + local117];
								}
							}
						}
					} else {
						this.method6718(0, 0, 0, 0, 0, 0, arg3, -1, false, -1);
					}
				}
			}
		}
	}
}
