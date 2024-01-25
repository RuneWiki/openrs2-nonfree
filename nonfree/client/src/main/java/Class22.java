import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public class Class22 {

	@OriginalMember(owner = "client!bk", name = "r", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!bk", name = "u", descriptor = "[I")
	private final int[] anIntArray354 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!bk", name = "A", descriptor = "[I")
	private final int[] anIntArray355 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
	protected final int anInt5758;

	@OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
	public final int anInt5763;

	@OriginalMember(owner = "client!bk", name = "w", descriptor = "Lclient!ta;")
	private final Class231 aClass231_5;

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
	protected final int anInt5756;

	@OriginalMember(owner = "client!bk", name = "p", descriptor = "Lclient!tj;")
	private final Class237 aClass237_6;

	@OriginalMember(owner = "client!bk", name = "n", descriptor = "Z")
	public final boolean aBoolean407;

	@OriginalMember(owner = "client!bk", name = "l", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!bk", name = "j", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!bk", name = "q", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!bk", name = "k", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!bk", name = "s", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray15;

	static {
		new Class174("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(IIIZLclient!tj;Lclient!ta;)V")
	protected Class22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class237 arg4, @OriginalArg(5) Class231 arg5) {
		this.anInt5758 = arg2;
		this.anInt5763 = arg0;
		this.aClass231_5 = arg5;
		this.anInt5756 = arg1;
		this.aClass237_6 = arg4;
		this.aBoolean407 = arg3;
		this.anIntArrayArrayArray11 = new int[this.anInt5763][this.anInt5756 + 1][this.anInt5758 + 1];
		this.aByteArrayArrayArray11 = new byte[this.anInt5763][this.anInt5756][this.anInt5758];
		this.aByteArrayArrayArray10 = new byte[this.anInt5763][this.anInt5756][this.anInt5758];
		this.aByteArrayArrayArray13 = new byte[this.anInt5763][this.anInt5756][this.anInt5758];
		this.aByteArrayArrayArray12 = new byte[this.anInt5763][this.anInt5756][this.anInt5758];
		this.aByteArrayArrayArray15 = new byte[this.anInt5763][this.anInt5756 + 1][this.anInt5758 + 1];
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "([[IIB)V")
	public final void method4777(@OriginalArg(0) int[][] arg0) {
		@Pc(14) int[][] local14 = this.anIntArrayArrayArray11[0];
		for (@Pc(16) int local16 = 0; local16 < this.anInt5756 + 1; local16++) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt5758 + 1; local20++) {
				local14[local16][local20] += arg0[local16][local20];
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIII)V")
	private void method4778(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = arg0; local7 < arg0 + 64; local7++) {
			for (local16 = arg1; local16 < arg1 + 64; local16++) {
				if (local16 >= 0 && local16 < this.anInt5756 && local7 >= 0 && this.anInt5758 > local7) {
					this.anIntArrayArrayArray11[arg2][local16][local7] = arg2 <= 0 ? 0 : this.anIntArrayArrayArray11[arg2 - 1][local16][local7] - 240;
				}
			}
		}
		if (arg1 > 0 && this.anInt5756 > arg1) {
			for (local16 = arg0 + 1; local16 < arg0 + 64; local16++) {
				if (local16 >= 0 && this.anInt5758 > local16) {
					this.anIntArrayArrayArray11[arg2][arg1][local16] = this.anIntArrayArrayArray11[arg2][arg1 - 1][local16];
				}
			}
		}
		if (arg0 > 0 && arg0 < this.anInt5758) {
			for (local16 = arg1 + 1; local16 < arg1 + 64; local16++) {
				if (local16 >= 0 && this.anInt5756 > local16) {
					this.anIntArrayArrayArray11[arg2][local16][arg0] = this.anIntArrayArrayArray11[arg2][local16][arg0 - 1];
				}
			}
		}
		if (arg1 < 0 || arg0 < 0 || this.anInt5756 <= arg1 || arg0 >= this.anInt5758) {
			return;
		}
		if (arg2 != 0) {
			if (arg1 > 0 && this.anIntArrayArrayArray11[arg2][arg1 - 1][arg0] != this.anIntArrayArrayArray11[arg2 - 1][arg1 - 1][arg0]) {
				this.anIntArrayArrayArray11[arg2][arg1][arg0] = this.anIntArrayArrayArray11[arg2][arg1 - 1][arg0];
				return;
			}
			if (arg0 > 0 && this.anIntArrayArrayArray11[arg2][arg1][arg0 - 1] != this.anIntArrayArrayArray11[arg2 - 1][arg1][arg0 - 1]) {
				this.anIntArrayArrayArray11[arg2][arg1][arg0] = this.anIntArrayArrayArray11[arg2][arg1][arg0 - 1];
				return;
			}
			if (arg1 > 0 && arg0 > 0 && this.anIntArrayArrayArray11[arg2 - 1][arg1 - 1][arg0 - 1] != this.anIntArrayArrayArray11[arg2][arg1 - 1][arg0 - 1]) {
				this.anIntArrayArrayArray11[arg2][arg1][arg0] = this.anIntArrayArrayArray11[arg2][arg1 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray11[arg2][arg1 - 1][arg0] != 0) {
			this.anIntArrayArrayArray11[arg2][arg1][arg0] = this.anIntArrayArrayArray11[arg2][arg1 - 1][arg0];
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray11[arg2][arg1][arg0 - 1] != 0) {
			this.anIntArrayArrayArray11[arg2][arg1][arg0] = this.anIntArrayArrayArray11[arg2][arg1][arg0 - 1];
			return;
		}
		if (arg1 > 0 && arg0 > 0 && this.anIntArrayArrayArray11[arg2][arg1 - 1][arg0 - 1] != 0) {
			this.anIntArrayArrayArray11[arg2][arg1][arg0] = this.anIntArrayArrayArray11[arg2][arg1 - 1][arg0 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!o;Lclient!o;ILclient!qa;)V")
	public final void method4781(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(3) Class167 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt5756][this.anInt5758];
		if (Static37.anIntArray25 == null || Static37.anIntArray25.length != this.anInt5758) {
			Static137.anIntArray127 = new int[this.anInt5758];
			Static188.anIntArray214 = new int[this.anInt5758];
			Static99.anIntArray85 = new int[this.anInt5758];
			Static351.anIntArray360 = new int[this.anInt5758];
			Static37.anIntArray25 = new int[this.anInt5758];
		}
		@Pc(44) int local44;
		for (@Pc(40) int local40 = 0; local40 < this.anInt5763; local40++) {
			for (local44 = 0; local44 < this.anInt5758; local44++) {
				Static37.anIntArray25[local44] = 0;
				Static99.anIntArray85[local44] = 0;
				Static351.anIntArray360[local44] = 0;
				Static137.anIntArray127[local44] = 0;
				Static188.anIntArray214[local44] = 0;
			}
			for (@Pc(77) int local77 = -5; local77 < this.anInt5756; local77++) {
				@Pc(87) int local87;
				@Pc(102) int local102;
				@Pc(168) int local168;
				for (@Pc(81) int local81 = 0; local81 < this.anInt5758; local81++) {
					local87 = local77 + 5;
					@Pc(148) int local148;
					if (local87 < this.anInt5756) {
						local102 = this.aByteArrayArrayArray11[local40][local87][local81] & 0xFF;
						if (local102 > 0) {
							@Pc(112) Class20 local112 = this.aClass231_5.method5384(local102 - 1);
							Static37.anIntArray25[local81] += local112.anInt456;
							Static99.anIntArray85[local81] += local112.anInt462;
							Static351.anIntArray360[local81] += local112.anInt455;
							Static137.anIntArray127[local81] += local112.anInt450;
							local148 = Static188.anIntArray214[local81]++;
						}
					}
					local102 = local77 - 5;
					if (local102 >= 0) {
						local168 = this.aByteArrayArrayArray11[local40][local102][local81] & 0xFF;
						if (local168 > 0) {
							@Pc(181) Class20 local181 = this.aClass231_5.method5384(local168 - 1);
							Static37.anIntArray25[local81] -= local181.anInt456;
							Static99.anIntArray85[local81] -= local181.anInt462;
							Static351.anIntArray360[local81] -= local181.anInt455;
							Static137.anIntArray127[local81] -= local181.anInt450;
							local148 = Static188.anIntArray214[local81]--;
						}
					}
				}
				if (local77 >= 0) {
					local87 = 0;
					local102 = 0;
					local168 = 0;
					@Pc(235) int local235 = 0;
					@Pc(237) int local237 = 0;
					for (@Pc(239) int local239 = -5; local239 < this.anInt5758; local239++) {
						@Pc(245) int local245 = local239 + 5;
						if (this.anInt5758 > local245) {
							local168 += Static351.anIntArray360[local245];
							local235 += Static137.anIntArray127[local245];
							local87 += Static37.anIntArray25[local245];
							local102 += Static99.anIntArray85[local245];
							local237 += Static188.anIntArray214[local245];
						}
						@Pc(283) int local283 = local239 - 5;
						if (local283 >= 0) {
							local168 -= Static351.anIntArray360[local283];
							local102 -= Static99.anIntArray85[local283];
							local235 -= Static137.anIntArray127[local283];
							local87 -= Static37.anIntArray25[local283];
							local237 -= Static188.anIntArray214[local283];
						}
						if (local239 >= 0 && local235 > 0 && local237 > 0) {
							local11[local77][local239] = Static250.method3550(local168 / local237, local102 / local237, local87 * 256 / local235);
						}
					}
				}
			}
			if (Static376.aBoolean430) {
				this.method4784(arg2, local40 == 0 ? arg0 : null, local40, Static178.aClass55Array1[local40], local11, local40 == 0 ? arg1 : null);
			} else {
				this.method4786(local40, Static178.aClass55Array1[local40], local40 == 0 ? arg1 : null, local11, arg2, local40 == 0 ? arg0 : null);
			}
			this.aByteArrayArrayArray11[local40] = null;
			this.aByteArrayArrayArray10[local40] = null;
			this.aByteArrayArrayArray12[local40] = null;
			this.aByteArrayArrayArray13[local40] = null;
		}
		if (!this.aBoolean407) {
			if (Static84.anInt6074 != 0) {
				Static194.method3015();
			}
			if (Static192.aBoolean268) {
				Static134.method2071();
			}
		}
		for (local44 = 0; local44 < this.anInt5763; local44++) {
			Static178.aClass55Array1[local44].U();
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "([Lclient!kg;IIIILclient!nj;I)V")
	public final void method4782(@OriginalArg(0) Class128[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class3_Sub25 arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (!this.aBoolean407) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class128 local16 = arg0[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local28 = local18 + arg1;
						@Pc(32) int local32 = arg2 + local22;
						if (local28 >= 0 && local28 < this.anInt5756 && local32 >= 0 && this.anInt5758 > local32) {
							local16.method3180(local32, local28);
						}
					}
				}
			}
		}
		local10 = arg1 + arg5;
		@Pc(96) int local96 = arg2 + arg3;
		for (local18 = 0; local18 < this.anInt5763; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method4787(local18, local10 + local22, 0, arg1 + local22, 0, local28 + arg2, 0, arg4, false, local28 + local96);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!qa;[Lclient!kg;B[[[I)V")
	public final void method4783(@OriginalArg(0) Class167 arg0, @OriginalArg(1) Class128[] arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(18) int local18;
		if (!this.aBoolean407) {
			for (local10 = 0; local10 < 4; local10++) {
				for (local14 = 0; local14 < this.anInt5756; local14++) {
					for (local18 = 0; local18 < this.anInt5758; local18++) {
						if ((Static360.aByteArrayArrayArray16[local10][local14][local18] & 0x1) != 0) {
							@Pc(32) int local32 = local10;
							if ((Static360.aByteArrayArrayArray16[1][local14][local18] & 0x2) != 0) {
								local32 = local10 - 1;
							}
							if (local32 >= 0) {
								arg1[local32].method3184(local14, local18);
							}
						}
					}
				}
			}
		}
		for (local10 = 0; local10 < this.anInt5763; local10++) {
			local14 = 0;
			local18 = 0;
			if (!this.aBoolean407) {
				if (Static192.aBoolean268) {
					local14 = 2;
				}
				if (Static122.aBoolean165) {
					local18 = 8;
				}
				if (Static84.anInt6074 != 0) {
					if (local10 == 0 | Static182.aBoolean254) {
						local18 |= 0x10;
					}
					local14 |= 0x1;
				}
			}
			if (Static192.aBoolean268) {
				local18 |= 0x7;
			}
			if (!Static303.aBoolean380) {
				local18 |= 0x20;
			}
			@Pc(148) int[][] local148 = arg2 == null || arg2.length <= local10 ? this.anIntArrayArrayArray11[local10] : arg2[local10];
			Static375.method5227(local10, arg0.method6017(this.anInt5756, this.anInt5758, this.anIntArrayArrayArray11[local10], local148, local14, local18));
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!qa;Lclient!o;ILclient!o;[[IILclient!o;)V")
	private void method4784(@OriginalArg(0) Class167 arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class55 arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(6) Class55 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray12[arg2];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray13[arg2];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray11[arg2];
		@Pc(44) byte[][] local44 = this.aByteArrayArrayArray10[arg2];
		for (@Pc(46) int local46 = 0; local46 < this.anInt5756; local46++) {
			@Pc(64) int local64 = local46 >= this.anInt5756 - 1 ? local46 : local46 + 1;
			for (@Pc(66) int local66 = 0; local66 < this.anInt5758; local66++) {
				@Pc(80) int local80 = local66 >= this.anInt5758 - 1 ? local66 : local66 + 1;
				if (Static417.anInt7005 == -1 || Static58.method1107(local66, Static417.anInt7005, local46, arg2)) {
					@Pc(94) boolean local94 = false;
					@Pc(96) boolean local96 = false;
					@Pc(99) boolean[] local99 = new boolean[4];
					@Pc(105) int local105 = local10[local46][local66];
					@Pc(111) int local111 = local15[local46][local66];
					@Pc(119) int local119 = local44[local46][local66] & 0xFF;
					@Pc(127) int local127 = local20[local46][local66] & 0xFF;
					@Pc(135) int local135 = local20[local46][local80] & 0xFF;
					@Pc(143) int local143 = local20[local64][local80] & 0xFF;
					@Pc(151) int local151 = local20[local64][local66] & 0xFF;
					if (local119 != 0 || local127 != 0) {
						@Pc(170) Class16 local170 = local119 == 0 ? null : this.aClass237_6.method5431(local119 - 1);
						@Pc(187) Class20 local187 = local127 == 0 ? null : this.aClass231_5.method5384(local127 - 1);
						if (local105 == 0 && local170 == null) {
							local105 = 12;
						}
						@Pc(198) Class16 local198 = local170;
						if (local170 != null) {
							if (local170.anInt293 == -1 && local170.anInt304 == -1) {
								local198 = local170;
								local170 = null;
							} else if (local187 != null && local105 != 0) {
								local96 = local170.aBoolean15;
							}
						}
						@Pc(308) int local308;
						@Pc(327) int local327;
						@Pc(400) int local400;
						@Pc(413) int local413;
						if ((local105 == 0 || local105 == 12) && local46 > 0 && local66 > 0 && this.anInt5756 > local46 && this.anInt5758 > local66) {
							@Pc(276) int local276 = local20[local64][local66 - 1] == local127 ? 1 : -1;
							@Pc(289) int local289 = local20[local64][local80] == local127 ? 1 : -1;
							local308 = local127 == local20[local46 - 1][local66 - 1] ? 1 : -1;
							local327 = local127 == local20[local46 - 1][local80] ? 1 : -1;
							if (local127 == local20[local46][local66 - 1]) {
								local276++;
								local308++;
							} else {
								local308--;
								local276--;
							}
							if (local127 == local20[local64][local66]) {
								local276++;
								local289++;
							} else {
								local289--;
								local276--;
							}
							if (local127 == local20[local46][local80]) {
								local327++;
								local289++;
							} else {
								local327--;
								local289--;
							}
							if (local127 == local20[local46 - 1][local66]) {
								local327++;
								local308++;
							} else {
								local327--;
								local308--;
							}
							local400 = local308 - local289;
							if (local400 < 0) {
								local400 = -local400;
							}
							local413 = local276 - local327;
							if (local413 < 0) {
								local413 = -local413;
							}
							if (local413 == local400) {
								local400 = arg3.oa(local46, local66) - arg3.oa(local64, local80);
								if (local400 < 0) {
									local400 = -local400;
								}
								local413 = arg3.oa(local64, local66) - arg3.oa(local46, local80);
								if (local413 < 0) {
									local413 = -local413;
								}
							}
							local111 = local400 < local413 ? 1 : 0;
						}
						for (local308 = 0; local308 < 13; local308++) {
							Static243.anIntArray458[local308] = -1;
							Static320.anIntArray60[local308] = 1;
						}
						@Pc(494) boolean[] local494 = local170 != null && local170.aBoolean15 ? Static96.aBooleanArrayArray3[local105] : Static184.aBooleanArrayArray6[local105];
						this.method4790(local10, local66, local99, arg0, local170, local44, local111, local15, local187, this.anInt5758, local105, local46, this.anInt5756);
						@Pc(523) boolean local523 = local170 != null && local170.anInt293 != local170.anInt304;
						if (!local523) {
							for (local327 = 0; local327 < 8; local327++) {
								if (Static243.anIntArray458[local327] >= 0 && Static84.anIntArray368[local327] != Static221.anIntArray423[local327]) {
									local523 = true;
									break;
								}
							}
						}
						if (!local494[local111 + 1 & 0x3]) {
							local99[1] = Static123.method1957(local99[1], (Static320.anIntArray60[4] & Static320.anIntArray60[2]) == 0);
						}
						if (!local494[local111 + 3 & 0x3]) {
							local99[3] = Static123.method1957(local99[3], (Static320.anIntArray60[6] & Static320.anIntArray60[0]) == 0);
						}
						if (!local494[--local111 & 0x3]) {
							local99[0] = Static123.method1957(local99[0], (Static320.anIntArray60[2] & Static320.anIntArray60[0]) == 0);
						}
						if (!local494[local111 + 2 & 0x3]) {
							local99[2] = Static123.method1957(local99[2], (Static320.anIntArray60[6] & Static320.anIntArray60[4]) == 0);
						}
						if (!local96 && (local105 == 0 || local105 == 12)) {
							if (local99[0] && !local99[1] && !local99[2] && local99[3]) {
								local99[0] = local99[3] = false;
								local111 = 0;
								local105 = local105 == 0 ? 13 : 14;
							} else if (local99[0] && local99[1] && !local99[2] && !local99[3]) {
								local105 = local105 == 0 ? 13 : 14;
								local111 = 3;
								local99[0] = local99[1] = false;
							} else if (!local99[0] && local99[1] && local99[2] && !local99[3]) {
								local111 = 2;
								local105 = local105 == 0 ? 13 : 14;
								local99[1] = local99[2] = false;
							} else if (!local99[0] && !local99[1] && local99[2] && local99[3]) {
								local111 = 1;
								local99[2] = local99[3] = false;
								local105 = local105 == 0 ? 13 : 14;
							}
						}
						@Pc(833) boolean local833 = !local96 && !local99[0] && !local99[2] && !local99[1] && !local99[3];
						@Pc(835) int[] local835 = null;
						@Pc(849) int[] local849;
						@Pc(853) int[] local853;
						@Pc(865) int[] local865;
						if (local833) {
							local400 = local187 == null ? 0 : Static257.anIntArray282[local105];
							local849 = Static458.anIntArrayArray65[local105];
							local853 = Static110.anIntArrayArray13[local105];
							local413 = local170 == null ? 0 : Static288.anIntArray325[local105];
							local865 = Static68.anIntArrayArray9[local105];
						} else if (local96) {
							local853 = Static37.anIntArrayArray4[local105];
							local865 = Static384.anIntArrayArray52[local105];
							local413 = local170 == null ? 0 : Static27.anIntArray19[local105];
							local849 = Static236.anIntArrayArray32[local105];
							local835 = Static324.anIntArrayArray45[local105];
							local400 = local187 == null ? 0 : Static100.anIntArray86[local105];
						} else {
							local865 = Static310.anIntArrayArray44[local105];
							local853 = Static421.anIntArrayArray57[local105];
							local400 = local187 == null ? 0 : Static373.anIntArray393[local105];
							local413 = local170 == null ? 0 : Static294.anIntArray327[local105];
							local849 = Static435.anIntArrayArray58[local105];
							local835 = Static307.anIntArrayArray47[local105];
						}
						@Pc(938) int local938 = local413 + local400;
						if (local938 <= 0) {
							Static15.method314(arg2, local46, local66);
						} else {
							if (local99[0]) {
								local938++;
							}
							if (local99[2]) {
								local938++;
							}
							if (local99[1]) {
								local938++;
							}
							if (local99[3]) {
								local938++;
							}
							@Pc(971) int local971 = 0;
							@Pc(973) int local973 = 0;
							@Pc(977) int local977 = local938 * 3;
							@Pc(984) int[] local984 = local523 ? new int[local977] : null;
							@Pc(987) int[] local987 = new int[local977];
							@Pc(990) int[] local990 = new int[local977];
							@Pc(993) int[] local993 = new int[local977];
							@Pc(996) int[] local996 = new int[local977];
							@Pc(999) int[] local999 = new int[local977];
							@Pc(1006) int[] local1006 = arg5 == null ? null : new int[local977];
							@Pc(1015) int[] local1015 = arg5 == null && arg1 == null ? null : new int[local977];
							@Pc(1017) int local1017 = -1;
							@Pc(1019) int local1019 = -1;
							@Pc(1021) int local1021 = 256;
							@Pc(1121) byte local1121;
							@Pc(1043) int local1043;
							@Pc(1045) int local1045;
							@Pc(1274) int local1274;
							@Pc(1280) int local1280;
							@Pc(1288) int local1288;
							@Pc(1293) int local1293;
							@Pc(1308) int local1308;
							@Pc(1298) int local1298;
							@Pc(1306) int local1306;
							@Pc(1365) int local1365;
							@Pc(1372) int local1372;
							if (local170 != null) {
								local1017 = local170.anInt293;
								local1019 = arg0.method6024() ? local170.anInt299 : local170.anInt297;
								local1021 = local170.anInt296;
								local1043 = Static293.method4195(local170, arg0);
								for (local1045 = 0; local1045 < local413; local1045++) {
									if (local99[-local111 & 0x3] && local835[0] == local971) {
										Static183.anIntArray199[0] = local849[local971];
										Static183.anIntArray199[1] = 1;
										Static183.anIntArray199[2] = local865[local971];
										Static183.anIntArray199[3] = 1;
										Static183.anIntArray199[4] = local853[local971];
										Static183.anIntArray199[5] = local865[local971];
										local1121 = 6;
									} else if (local99[2 - local111 & 0x3] && local971 == local835[2]) {
										Static183.anIntArray199[0] = local849[local971];
										Static183.anIntArray199[1] = 5;
										Static183.anIntArray199[2] = local865[local971];
										Static183.anIntArray199[3] = 5;
										Static183.anIntArray199[4] = local853[local971];
										Static183.anIntArray199[5] = local865[local971];
										local1121 = 6;
									} else if (local99[1 - local111 & 0x3] && local971 == local835[1]) {
										Static183.anIntArray199[0] = local849[local971];
										Static183.anIntArray199[1] = 3;
										Static183.anIntArray199[2] = local865[local971];
										Static183.anIntArray199[3] = 3;
										Static183.anIntArray199[4] = local853[local971];
										Static183.anIntArray199[5] = local865[local971];
										local1121 = 6;
									} else if (local99[3 - local111 & 0x3] && local971 == local835[3]) {
										Static183.anIntArray199[0] = local849[local971];
										Static183.anIntArray199[1] = 7;
										Static183.anIntArray199[2] = local865[local971];
										Static183.anIntArray199[3] = 7;
										Static183.anIntArray199[4] = local853[local971];
										local1121 = 6;
										Static183.anIntArray199[5] = local865[local971];
									} else {
										Static183.anIntArray199[0] = local849[local971];
										Static183.anIntArray199[1] = local853[local971];
										local1121 = 3;
										Static183.anIntArray199[2] = local865[local971];
									}
									local971++;
									for (local1274 = 0; local1274 < local1121; local1274++) {
										local1280 = Static183.anIntArray199[local1274];
										local1288 = local1280 - local111 * 2 & 0x7;
										local1293 = this.anIntArray354[local1280];
										local1298 = this.anIntArray355[local1280];
										if (local111 == 1) {
											local1306 = 128 - local1293;
											local1308 = local1298;
										} else if (local111 == 2) {
											local1308 = 128 - local1293;
											local1306 = 128 - local1298;
										} else if (local111 == 3) {
											local1308 = 128 - local1298;
											local1306 = local1293;
										} else {
											local1308 = local1293;
											local1306 = local1298;
										}
										local987[local973] = local1308;
										local990[local973] = local1306;
										if (local1006 != null && Static70.aBooleanArrayArray2[local105][local1280]) {
											local1365 = local1308 + (local46 << 7);
											local1372 = (local66 << 7) + local1306;
											local1006[local973] = arg5.R(local1365, local1372) - arg3.R(local1365, local1372);
										}
										if (local1015 != null) {
											if (arg5 != null && !Static70.aBooleanArrayArray2[local105][local1280]) {
												local1365 = (local46 << 7) + local1308;
												local1372 = (local66 << 7) + local1306;
												local1015[local973] = arg3.R(local1365, local1372) - arg5.R(local1365, local1372);
											} else if (arg1 != null && !Static127.aBooleanArrayArray5[local105][local1280]) {
												local1365 = (local46 << 7) + local1308;
												local1372 = local1306 + (local66 << 7);
												local1015[local973] = arg1.R(local1365, local1372) - arg3.R(local1365, local1372);
											}
										}
										if (local1280 < 8 && local170.anInt307 < Static243.anIntArray458[local1288]) {
											if (local984 != null) {
												local984[local973] = Static221.anIntArray423[local1288];
											}
											local999[local973] = Static340.anIntArray352[local1288];
											local996[local973] = Static360.anIntArray376[local1288];
											local993[local973] = Static84.anIntArray368[local1288];
										} else {
											if (local984 != null) {
												local984[local973] = local1043;
											}
											local996[local973] = arg0.method6024() ? local170.anInt299 : local170.anInt297;
											local999[local973] = local170.anInt296;
											local993[local973] = local1017;
										}
										local973++;
									}
								}
								if (!this.aBoolean407 && arg2 == 0) {
									Static168.method2586(local46, local66, local170.anInt298, local170.anInt305 * 8, local170.anInt294);
								}
								if (local105 != 12 && local170.anInt293 != -1 && local170.aBoolean16) {
									local94 = true;
								}
							} else if (local833) {
								local971 = Static288.anIntArray325[local105];
							} else if (local96) {
								local971 = Static27.anIntArray19[local105];
							} else {
								local971 = Static294.anIntArray327[local105];
							}
							if (local187 != null) {
								if (local143 == 0) {
									local143 = local127;
								}
								if (local151 == 0) {
									local151 = local127;
								}
								if (local135 == 0) {
									local135 = local127;
								}
								@Pc(1623) Class20 local1623 = this.aClass231_5.method5384(local127 - 1);
								@Pc(1631) Class20 local1631 = this.aClass231_5.method5384(local135 - 1);
								@Pc(1641) Class20 local1641 = this.aClass231_5.method5384(local143 - 1);
								@Pc(1651) Class20 local1651 = this.aClass231_5.method5384(local151 - 1);
								for (local1288 = 0; local1288 < local400; local1288++) {
									if (local99[-local111 & 0x3] && local971 == local835[0]) {
										Static183.anIntArray199[0] = local849[local971];
										Static183.anIntArray199[1] = 1;
										Static183.anIntArray199[2] = local865[local971];
										Static183.anIntArray199[3] = 1;
										Static183.anIntArray199[4] = local853[local971];
										local1121 = 6;
										Static183.anIntArray199[5] = local865[local971];
									} else if (local99[2 - local111 & 0x3] && local835[2] == local971) {
										Static183.anIntArray199[0] = local849[local971];
										Static183.anIntArray199[1] = 5;
										Static183.anIntArray199[2] = local865[local971];
										Static183.anIntArray199[3] = 5;
										Static183.anIntArray199[4] = local853[local971];
										Static183.anIntArray199[5] = local865[local971];
										local1121 = 6;
									} else if (local99[1 - local111 & 0x3] && local835[1] == local971) {
										Static183.anIntArray199[0] = local849[local971];
										Static183.anIntArray199[1] = 3;
										Static183.anIntArray199[2] = local865[local971];
										Static183.anIntArray199[3] = 3;
										Static183.anIntArray199[4] = local853[local971];
										local1121 = 6;
										Static183.anIntArray199[5] = local865[local971];
									} else if (local99[3 - local111 & 0x3] && local971 == local835[3]) {
										Static183.anIntArray199[0] = local849[local971];
										Static183.anIntArray199[1] = 7;
										Static183.anIntArray199[2] = local865[local971];
										Static183.anIntArray199[3] = 7;
										Static183.anIntArray199[4] = local853[local971];
										Static183.anIntArray199[5] = local865[local971];
										local1121 = 6;
									} else {
										Static183.anIntArray199[0] = local849[local971];
										Static183.anIntArray199[1] = local853[local971];
										Static183.anIntArray199[2] = local865[local971];
										local1121 = 3;
									}
									local971++;
									for (local1293 = 0; local1293 < local1121; local1293++) {
										local1308 = Static183.anIntArray199[local1293];
										local1298 = local1308 - local111 * 2 & 0x7;
										local1306 = this.anIntArray354[local1308];
										local1372 = this.anIntArray355[local1308];
										@Pc(1926) int local1926;
										if (local111 == 1) {
											local1365 = local1372;
											local1926 = 128 - local1306;
										} else if (local111 == 2) {
											local1926 = 128 - local1372;
											local1365 = 128 - local1306;
										} else if (local111 == 3) {
											local1926 = local1306;
											local1365 = 128 - local1372;
										} else {
											local1365 = local1306;
											local1926 = local1372;
										}
										local987[local973] = local1365;
										local990[local973] = local1926;
										@Pc(1985) int local1985;
										@Pc(1992) int local1992;
										if (local1006 != null && Static70.aBooleanArrayArray2[local105][local1308]) {
											local1985 = (local46 << 7) + local1365;
											local1992 = (local66 << 7) + local1926;
											local1006[local973] = arg5.R(local1985, local1992) - arg3.R(local1985, local1992);
										}
										if (local1015 != null) {
											if (arg5 != null && !Static70.aBooleanArrayArray2[local105][local1308]) {
												local1985 = (local46 << 7) + local1365;
												local1992 = local1926 + (local66 << 7);
												local1015[local973] = arg3.R(local1985, local1992) - arg5.R(local1985, local1992);
											} else if (arg1 != null && !Static127.aBooleanArrayArray5[local105][local1308]) {
												local1985 = (local46 << 7) + local1365;
												local1992 = local1926 + (local66 << 7);
												local1015[local973] = arg1.R(local1985, local1992) - arg3.R(local1985, local1992);
											}
										}
										if (local1308 < 8 && Static243.anIntArray458[local1298] >= 0) {
											if (local984 != null) {
												local984[local973] = Static221.anIntArray423[local1298];
											}
											local999[local973] = Static340.anIntArray352[local1298];
											local996[local973] = Static360.anIntArray376[local1298];
											local993[local973] = Static84.anIntArray368[local1298];
										} else {
											if (local96 && Static70.aBooleanArrayArray2[local105][local1308]) {
												local996[local973] = local1019;
												local999[local973] = local1021;
												local993[local973] = local1017;
											} else if (local1365 == 0 && local1926 == 0) {
												local993[local973] = arg4[local46][local66];
												local996[local973] = local1623.anInt458;
												local999[local973] = local1623.anInt461;
											} else if (local1365 == 0 && local1926 == 128) {
												local993[local973] = arg4[local46][local80];
												local996[local973] = local1631.anInt458;
												local999[local973] = local1631.anInt461;
											} else if (local1365 == 128 && local1926 == 128) {
												local993[local973] = arg4[local64][local80];
												local996[local973] = local1641.anInt458;
												local999[local973] = local1641.anInt461;
											} else if (local1365 == 128 && local1926 == 0) {
												local993[local973] = arg4[local64][local66];
												local996[local973] = local1651.anInt458;
												local999[local973] = local1651.anInt461;
											} else {
												if (local1365 < 64) {
													if (local1926 >= 64) {
														local996[local973] = local1631.anInt458;
														local999[local973] = local1631.anInt461;
													} else {
														local996[local973] = local1623.anInt458;
														local999[local973] = local1623.anInt461;
													}
												} else if (local1926 >= 64) {
													local996[local973] = local1641.anInt458;
													local999[local973] = local1641.anInt461;
												} else {
													local996[local973] = local1651.anInt458;
													local999[local973] = local1651.anInt461;
												}
												local1985 = Static263.method5519(arg4[local64][local66], arg4[local46][local66], local1365 << 7 >> 7);
												local1992 = Static263.method5519(arg4[local64][local80], arg4[local46][local80], local1365 << 7 >> 7);
												local993[local973] = Static263.method5519(local1992, local1985, local1926 << 7 >> 7);
											}
											if (local984 != null) {
												local984[local973] = local993[local973];
											}
										}
										local973++;
									}
								}
								if (local105 != 0 && local187.aBoolean23) {
									local94 = true;
								}
							}
							local1043 = arg3.oa(local46, local66);
							local1045 = arg3.oa(local64, local66);
							local1274 = arg3.oa(local64, local80);
							local1280 = arg3.oa(local46, local80);
							if (arg2 > 0) {
								@Pc(2413) boolean local2413 = true;
								if (local127 == 0 && local105 != 0) {
									local2413 = false;
								}
								if (local119 > 0 && local198 != null && !local198.aBoolean17) {
									local2413 = false;
								}
								if (local2413 && local1043 == local1045 && local1274 == local1043 && local1280 == local1043) {
									this.aByteArrayArrayArray15[arg2][local46][local66] = (byte) (this.aByteArrayArrayArray15[arg2][local46][local66] | 0x4);
								}
							}
							local1288 = 0;
							local1293 = 0;
							local1308 = 0;
							if (this.aBoolean407) {
								local1288 = Static370.method5157(local46, local66);
								local1293 = Static298.method4263(local46, local66);
								local1308 = Static127.method2003(local46, local66);
							}
							arg3.ta(local46, local66, local987, local1006, local990, local1015, local993, local984, local996, local999, local1288, local1293, local1308, local94);
							Static15.method314(arg2, local46, local66);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IILclient!o;Lclient!o;[[ILclient!qa;Lclient!o;)V")
	private void method4786(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) Class55 arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) Class167 arg4, @OriginalArg(6) Class55 arg5) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5756; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt5758; local11++) {
				if (Static417.anInt7005 == -1 || Static58.method1107(local11, Static417.anInt7005, local7, arg0)) {
					@Pc(35) byte local35 = this.aByteArrayArrayArray12[arg0][local7][local11];
					@Pc(44) byte local44 = this.aByteArrayArrayArray13[arg0][local7][local11];
					@Pc(55) int local55 = this.aByteArrayArrayArray10[arg0][local7][local11] & 0xFF;
					@Pc(66) int local66 = this.aByteArrayArrayArray11[arg0][local7][local11] & 0xFF;
					@Pc(78) Class16 local78 = local55 == 0 ? null : this.aClass237_6.method5431(local55 - 1);
					@Pc(95) Class20 local95 = local66 == 0 ? null : this.aClass231_5.method5384(local66 - 1);
					@Pc(97) int local97 = 0;
					@Pc(99) int local99 = 0;
					if (local35 != 0) {
						local97 = local95 == null ? 0 : Static257.anIntArray282[local35];
						local99 = local78 == null ? 0 : Static288.anIntArray325[local35];
					} else if (local78 != null) {
						local99 = Static288.anIntArray325[local35];
					} else if (local95 != null) {
						local97 = Static288.anIntArray325[local35];
					}
					@Pc(140) int local140 = local97 + local99;
					@Pc(142) int local142 = 0;
					if (local140 != 0) {
						@Pc(147) int[] local147 = new int[local140];
						@Pc(150) int[] local150 = new int[local140];
						@Pc(153) int[] local153 = new int[local140];
						@Pc(156) int[] local156 = new int[local140];
						@Pc(158) boolean local158 = false;
						@Pc(176) int local176;
						@Pc(204) int local204;
						if (local78 == null || local78.anInt293 == -1 && local78.anInt304 == -1 && local78.anInt299 == -1) {
							for (local176 = 0; local176 < local99; local176++) {
								local147[local142] = -1;
								local142++;
							}
						} else {
							local176 = arg4.method6024() ? local78.anInt299 : local78.anInt297;
							if (Static291.aBoolean370) {
								local176 = -1;
							}
							for (local204 = 0; local204 < local99; local204++) {
								local153[local142] = local176;
								local156[local142] = local78.anInt296;
								if (local78.anInt293 == -1) {
									local147[local142] = -1;
								} else {
									local147[local142] = local78.anInt293;
								}
								if (local78.anInt304 == -1) {
									local150[local142] = -1;
								} else {
									local158 = true;
									local150[local142] = local78.anInt304;
								}
								local142++;
							}
							if (!this.aBoolean407 && arg0 == 0) {
								Static168.method2586(local7, local11, local78.anInt298, local78.anInt305 * 8, local78.anInt294);
							}
						}
						if (!local158) {
							local150 = null;
						}
						if (local95 == null) {
							for (local176 = 0; local176 < local97; local176++) {
								local147[local142] = -1;
								local142++;
							}
						} else {
							local176 = local95.anInt458;
							if (Static291.aBoolean370) {
								local176 = -1;
							}
							for (local204 = 0; local204 < local97; local204++) {
								local153[local142] = local176;
								local156[local142] = local95.anInt461;
								local147[local142] = arg3[local7][local11];
								if (local150 != null) {
									local150[local142] = -1;
								}
								local142++;
							}
						}
						local176 = this.anIntArray354.length;
						@Pc(344) int[] local344 = new int[local176];
						@Pc(347) int[] local347 = new int[local176];
						@Pc(354) int[] local354 = arg2 == null ? null : new int[local176];
						@Pc(363) int[] local363 = arg2 == null && arg5 == null ? null : new int[local176];
						@Pc(372) int local372;
						@Pc(377) int local377;
						@Pc(458) int local458;
						@Pc(464) int local464;
						for (@Pc(365) int local365 = 0; local365 < local176; local365++) {
							local372 = this.anIntArray354[local365];
							local377 = this.anIntArray355[local365];
							if (local44 == 0) {
								local344[local365] = local372;
								local347[local365] = local377;
							} else if (local44 == 1) {
								local344[local365] = local377;
								local347[local365] = 128 - local372;
							} else if (local44 == 2) {
								local344[local365] = 128 - local372;
								local347[local365] = 128 - local377;
							} else if (local44 == 3) {
								local344[local365] = 128 - local377;
								local347[local365] = local372;
							}
							if (local354 != null && Static70.aBooleanArrayArray2[local35][local365]) {
								local458 = local372 + (local7 << 7);
								local464 = (local11 << 7) + local372;
								local354[local365] = arg2.R(local458, local464) - arg1.R(local458, local464);
							}
							if (local363 != null) {
								if (arg2 != null && !Static70.aBooleanArrayArray2[local35][local365]) {
									local458 = local372 + (local7 << 7);
									local464 = local372 + (local11 << 7);
									local363[local365] = arg1.R(local458, local464) - arg2.R(local458, local464);
								} else if (arg5 != null && !Static127.aBooleanArrayArray5[local35][local365]) {
									local458 = local372 + (local7 << 7);
									local464 = local372 + (local11 << 7);
									local363[local365] = arg5.R(local458, local464) - arg1.R(local458, local464);
								}
							}
						}
						local372 = arg1.oa(local7, local11);
						local377 = arg1.oa(local7 + 1, local11);
						local458 = arg1.oa(local7 + 1, local11 + 1);
						local464 = arg1.oa(local7, local11 + 1);
						if (arg0 > 0) {
							@Pc(583) boolean local583 = true;
							if (local66 == 0 && local35 != 0) {
								local583 = false;
							}
							if (local55 > 0 && local78 != null && !local78.aBoolean17) {
								local583 = false;
							}
							if (local583 && local372 == local377 && local458 == local372 && local464 == local372) {
								this.aByteArrayArrayArray15[arg0][local7][local11] = (byte) (this.aByteArrayArrayArray15[arg0][local7][local11] | 0x4);
							}
						}
						@Pc(643) int local643 = 0;
						@Pc(645) int local645 = 0;
						@Pc(647) int local647 = 0;
						if (this.aBoolean407) {
							local643 = Static370.method5157(local7, local11);
							local645 = Static298.method4263(local7, local11);
							local647 = Static127.method2003(local7, local11);
						}
						arg1.method3820(local7, local11, local344, local354, local347, local363, Static458.anIntArrayArray65[local35], Static110.anIntArrayArray13[local35], Static68.anIntArrayArray9[local35], local147, local150, local153, local156, local643, local645, local647);
						Static15.method314(arg0, local7, local11);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIIIILclient!nj;ZI)V")
	private void method4787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class3_Sub25 arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		if (arg2 == 1) {
			arg6 = 1;
		} else if (arg2 == 2) {
			arg4 = 1;
			arg6 = 1;
		} else if (arg2 == 3) {
			arg4 = 1;
		}
		@Pc(60) int local60;
		if (arg3 < 0 || this.anInt5756 <= arg3 || arg5 < 0 || arg5 >= this.anInt5758) {
			while (true) {
				local60 = arg7.method4096();
				if (local60 == 0) {
					break;
				}
				if (local60 == 1) {
					arg7.method4096();
					break;
				}
				if (local60 <= 49) {
					arg7.method4096();
				}
			}
			return;
		}
		if (!this.aBoolean407 && !arg8) {
			Static360.aByteArrayArrayArray16[arg0][arg3][arg5] = 0;
		}
		while (true) {
			local60 = arg7.method4096();
			if (local60 == 0) {
				if (this.aBoolean407) {
					this.anIntArrayArrayArray11[0][arg4 + arg3][arg6 + arg5] = 0;
				} else if (arg0 == 0) {
					this.anIntArrayArrayArray11[0][arg3 + arg4][arg5 + arg6] = -Static458.method6235(arg1 + 932731, arg9 + 556238) * 8 << 0;
				} else {
					this.anIntArrayArrayArray11[arg0][arg4 + arg3][arg5 + arg6] = this.anIntArrayArrayArray11[arg0 - 1][arg3 + arg4][arg5 + arg6] - 240;
				}
				break;
			}
			if (local60 == 1) {
				@Pc(153) int local153 = arg7.method4096();
				if (this.aBoolean407) {
					this.anIntArrayArrayArray11[0][arg4 + arg3][arg6 + arg5] = local153 * 8 << 0;
				} else {
					if (local153 == 1) {
						local153 = 0;
					}
					if (arg0 == 0) {
						this.anIntArrayArrayArray11[0][arg3 + arg4][arg6 + arg5] = -local153 * 8 << 0;
					} else {
						this.anIntArrayArrayArray11[arg0][arg3 + arg4][arg6 + arg5] = this.anIntArrayArrayArray11[arg0 - 1][arg3 + arg4][arg5 + arg6] - (local153 * 8 << 0);
					}
				}
				break;
			}
			if (local60 <= 49) {
				if (arg8) {
					arg7.method4096();
				} else {
					this.aByteArrayArrayArray10[arg0][arg3][arg5] = arg7.method4097();
					this.aByteArrayArrayArray12[arg0][arg3][arg5] = (byte) ((local60 - 2) / 4);
					this.aByteArrayArrayArray13[arg0][arg3][arg5] = (byte) (arg2 + local60 - 2 & 0x3);
				}
			} else if (local60 <= 81) {
				if (!this.aBoolean407 && !arg8) {
					Static360.aByteArrayArrayArray16[arg0][arg3][arg5] = (byte) (local60 - 49);
				}
			} else if (!arg8) {
				this.aByteArrayArrayArray11[arg0][arg3][arg5] = (byte) (local60 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIII)V")
	public final void method4788(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1) {
		for (@Pc(10) int local10 = 0; local10 < this.anInt5763; local10++) {
			this.method4778(arg1, arg0, local10);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIILclient!nj;[Lclient!kg;II)V")
	public final void method4789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub25 arg6, @OriginalArg(7) Class128[] arg7, @OriginalArg(8) int arg8) {
		@Pc(11) int local11 = (arg4 & 0x7) * 8;
		@Pc(20) int local20;
		@Pc(50) int local50;
		if (!this.aBoolean407) {
			@Pc(18) Class128 local18 = arg7[arg0];
			for (local20 = 0; local20 < 8; local20++) {
				for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
					@Pc(38) int local38 = arg8 + Static379.method5264(arg2, local20 & 0x7, local24 & 0x7);
					local50 = arg3 + Static451.method6149(arg2, local20 & 0x7, local24 & 0x7);
					if (local38 > 0 && this.anInt5756 - 1 > local38 && local50 > 0 && local50 < this.anInt5758 - 1) {
						local18.method3180(local50, local38);
					}
				}
			}
		}
		@Pc(93) int local93 = (arg5 & 0x7) * 8;
		@Pc(99) int local99 = (arg4 & 0x1FFFFFF8) << 3;
		local20 = (arg5 & 0xFFFFFFF8) << 3;
		@Pc(107) byte local107 = 0;
		@Pc(109) byte local109 = 0;
		if (arg2 == 1) {
			local109 = 1;
		} else if (arg2 == 2) {
			local109 = 1;
			local107 = 1;
		} else if (arg2 == 3) {
			local107 = 1;
		}
		for (local50 = 0; local50 < this.anInt5763; local50++) {
			for (@Pc(140) int local140 = 0; local140 < 64; local140++) {
				for (@Pc(144) int local144 = 0; local144 < 64; local144++) {
					if (local50 == arg1 && local140 >= local11 && local140 <= local11 + 8 && local144 >= local93 && local144 <= local93 + 8) {
						@Pc(191) int local191;
						@Pc(204) int local204;
						if (local140 == local11 + 8 || local144 == local93 + 8) {
							if (arg2 == 0) {
								local191 = local140 + arg8 - local11;
								local204 = local144 + arg3 - local93;
							} else if (arg2 == 1) {
								local204 = local11 + arg3 + 8 - local140;
								local191 = local144 + arg8 - local93;
							} else if (arg2 == 2) {
								local204 = arg3 + local93 + 8 - local144;
								local191 = local11 + arg8 + 8 - local140;
							} else {
								local191 = local93 + arg8 + 8 - local144;
								local204 = arg3 + local140 - local11;
							}
							this.method4787(arg0, local140 + local99, 0, local191, 0, local204, 0, arg6, true, local144 + local20);
						} else {
							local191 = Static379.method5264(arg2, local140 & 0x7, local144 & 0x7) + arg8;
							local204 = arg3 + Static451.method6149(arg2, local140 & 0x7, local144 & 0x7);
							this.method4787(arg0, local140 + local99, arg2, local191, local107, local204, local109, arg6, false, local144 + local20);
						}
						if (local140 == 63 || local144 == 63) {
							@Pc(333) byte local333 = 1;
							if (local140 == 63 && local144 == 63) {
								local333 = 3;
							}
							for (@Pc(343) int local343 = 0; local343 < local333; local343++) {
								@Pc(347) int local347 = local140;
								@Pc(349) int local349 = local144;
								if (local343 == 0) {
									local349 = local144 == 63 ? 64 : local144;
									local347 = local140 == 63 ? 64 : local140;
								} else if (local343 == 1) {
									local347 = 64;
								} else if (local343 == 2) {
									local349 = 64;
								}
								@Pc(406) int local406;
								@Pc(413) int local413;
								if (arg2 == 0) {
									local413 = local349 + arg3 - local93;
									local406 = local347 + arg8 - local11;
								} else if (arg2 == 1) {
									local406 = arg8 + local349 - local93;
									local413 = arg3 + local11 + 8 - local347;
								} else if (arg2 == 2) {
									local406 = local11 + arg8 + 8 - local347;
									local413 = local93 + arg3 + 8 - local349;
								} else {
									local406 = arg8 + local93 + 8 - local349;
									local413 = arg3 + local347 - local11;
								}
								if (local406 >= 0 && local406 < this.anInt5756 && local413 >= 0 && local413 < this.anInt5758) {
									this.anIntArrayArrayArray11[arg0][local406][local413] = this.anIntArrayArrayArray11[arg0][local107 + local191][local204 + local109];
								}
							}
						}
					} else {
						this.method4787(0, 0, 0, -1, 0, -1, 0, arg6, false, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "([[BI[ZLclient!qa;BLclient!av;[[BI[[BLclient!bh;IIII)V")
	private void method4790(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[] arg2, @OriginalArg(3) Class167 arg3, @OriginalArg(5) Class16 arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) Class20 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(18) boolean[] local18 = arg4 != null && arg4.aBoolean15 ? Static96.aBooleanArrayArray3[arg10] : Static184.aBooleanArrayArray6[arg10];
		@Pc(37) int local37;
		@Pc(47) Class16 local47;
		@Pc(65) byte local65;
		@Pc(81) int local81;
		@Pc(86) int local86;
		if (arg1 > 0) {
			if (arg11 > 0) {
				local37 = arg5[arg11 - 1][arg1 - 1] & 0xFF;
				if (local37 > 0) {
					local47 = this.aClass237_6.method5431(local37 - 1);
					if (local47.anInt293 != -1 && local47.aBoolean15) {
						local65 = arg0[arg11 - 1][arg1 - 1];
						local81 = arg7[arg11 - 1][arg1 - 1] * 2 + 4 & 0x7;
						local86 = Static293.method4195(local47, arg3);
						if (Static70.aBooleanArrayArray2[local65][local81]) {
							Static84.anIntArray368[0] = local47.anInt293;
							Static221.anIntArray423[0] = local86;
							Static360.anIntArray376[0] = arg3.method6024() ? local47.anInt299 : local47.anInt297;
							Static340.anIntArray352[0] = local47.anInt296;
							Static243.anIntArray458[0] = local47.anInt307;
							Static320.anIntArray60[0] = 256;
						}
					}
				}
			}
			if (arg11 < arg12 - 1) {
				local37 = arg5[arg11 + 1][arg1 - 1] & 0xFF;
				if (local37 > 0) {
					local47 = this.aClass237_6.method5431(local37 - 1);
					if (local47.anInt293 != -1 && local47.aBoolean15) {
						local65 = arg0[arg11 + 1][arg1 - 1];
						local81 = arg7[arg11 + 1][arg1 - 1] * 2 + 6 & 0x7;
						local86 = Static293.method4195(local47, arg3);
						if (Static70.aBooleanArrayArray2[local65][local81]) {
							Static84.anIntArray368[2] = local47.anInt293;
							Static221.anIntArray423[2] = local86;
							Static360.anIntArray376[2] = arg3.method6024() ? local47.anInt299 : local47.anInt297;
							Static340.anIntArray352[2] = local47.anInt296;
							Static243.anIntArray458[2] = local47.anInt307;
							Static320.anIntArray60[2] = 512;
						}
					}
				}
			}
		}
		if (arg1 < arg9 - 1) {
			if (arg11 > 0) {
				local37 = arg5[arg11 - 1][arg1 + 1] & 0xFF;
				if (local37 > 0) {
					local47 = this.aClass237_6.method5431(local37 - 1);
					if (local47.anInt293 != -1 && local47.aBoolean15) {
						local65 = arg0[arg11 - 1][arg1 + 1];
						local81 = arg7[arg11 - 1][arg1 + 1] * 2 + 2 & 0x7;
						local86 = Static293.method4195(local47, arg3);
						if (Static70.aBooleanArrayArray2[local65][local81]) {
							Static84.anIntArray368[6] = local47.anInt293;
							Static221.anIntArray423[6] = local86;
							Static360.anIntArray376[6] = arg3.method6024() ? local47.anInt299 : local47.anInt297;
							Static340.anIntArray352[6] = local47.anInt296;
							Static243.anIntArray458[6] = local47.anInt307;
							Static320.anIntArray60[6] = 64;
						}
					}
				}
			}
			if (arg11 < arg12 - 1) {
				local37 = arg5[arg11 + 1][arg1 + 1] & 0xFF;
				if (local37 > 0) {
					local47 = this.aClass237_6.method5431(local37 - 1);
					if (local47.anInt293 != -1 && local47.aBoolean15) {
						local65 = arg0[arg11 + 1][arg1 + 1];
						local81 = arg7[arg11 + 1][arg1 + 1] * 2 & 0x7;
						local86 = Static293.method4195(local47, arg3);
						if (Static70.aBooleanArrayArray2[local65][local81]) {
							Static84.anIntArray368[4] = local47.anInt293;
							Static221.anIntArray423[4] = local86;
							Static360.anIntArray376[4] = arg3.method6024() ? local47.anInt299 : local47.anInt297;
							Static340.anIntArray352[4] = local47.anInt296;
							Static243.anIntArray458[4] = local47.anInt307;
							Static320.anIntArray60[4] = 128;
						}
					}
				}
			}
		}
		@Pc(525) int local525;
		@Pc(530) int local530;
		@Pc(532) int local532;
		@Pc(494) byte local494;
		if (arg1 > 0) {
			local37 = arg5[arg11][arg1 - 1] & 0xFF;
			if (local37 > 0) {
				local47 = this.aClass237_6.method5431(local37 - 1);
				if (local47.anInt293 != -1) {
					local65 = arg0[arg11][arg1 - 1];
					local494 = arg7[arg11][arg1 - 1];
					if (local47.aBoolean15) {
						local86 = 2;
						local525 = local494 * 2 + 4;
						local530 = Static293.method4195(local47, arg3);
						for (local532 = 0; local532 < 3; local532++) {
							local525 &= 0x7;
							local86 &= 0x7;
							if (Static70.aBooleanArrayArray2[local65][local525] && Static243.anIntArray458[local86] <= local47.anInt307) {
								Static84.anIntArray368[local86] = local47.anInt293;
								Static221.anIntArray423[local86] = local530;
								Static360.anIntArray376[local86] = arg3.method6024() ? local47.anInt299 : local47.anInt297;
								Static340.anIntArray352[local86] = local47.anInt296;
								if (local47.anInt307 == Static243.anIntArray458[local86]) {
									Static320.anIntArray60[local86] |= 0x20;
								} else {
									Static320.anIntArray60[local86] = 32;
								}
								Static243.anIntArray458[local86] = local47.anInt307;
							}
							local86--;
							local525++;
						}
						if (!local18[arg6 & 0x3]) {
							arg2[0] = Static96.aBooleanArrayArray3[local65][local494 + 2 & 0x3];
						}
					} else if (!local18[arg6 & 0x3]) {
						arg2[0] = Static184.aBooleanArrayArray6[local65][local494 + 2 & 0x3];
					}
				}
			}
		}
		if (arg9 - 1 > arg1) {
			local37 = arg5[arg11][arg1 + 1] & 0xFF;
			if (local37 > 0) {
				local47 = this.aClass237_6.method5431(local37 - 1);
				if (local47.anInt293 != -1) {
					local65 = arg0[arg11][arg1 + 1];
					local494 = arg7[arg11][arg1 + 1];
					if (local47.aBoolean15) {
						local86 = 4;
						local525 = local494 * 2 + 2;
						local530 = Static293.method4195(local47, arg3);
						for (local532 = 0; local532 < 3; local532++) {
							local86 &= 0x7;
							local525 &= 0x7;
							if (Static70.aBooleanArrayArray2[local65][local525] && local47.anInt307 >= Static243.anIntArray458[local86]) {
								Static84.anIntArray368[local86] = local47.anInt293;
								Static221.anIntArray423[local86] = local530;
								Static360.anIntArray376[local86] = arg3.method6024() ? local47.anInt299 : local47.anInt297;
								Static340.anIntArray352[local86] = local47.anInt296;
								if (Static243.anIntArray458[local86] == local47.anInt307) {
									Static320.anIntArray60[local86] |= 0x10;
								} else {
									Static320.anIntArray60[local86] = 16;
								}
								Static243.anIntArray458[local86] = local47.anInt307;
							}
							local525--;
							local86++;
						}
						if (!local18[arg6 + 2 & 0x3]) {
							arg2[2] = Static96.aBooleanArrayArray3[local65][local494 & 0x3];
						}
					} else if (!local18[arg6 + 2 & 0x3]) {
						arg2[2] = Static184.aBooleanArrayArray6[local65][local494 & 0x3];
					}
				}
			}
		}
		if (arg11 > 0) {
			local37 = arg5[arg11 - 1][arg1] & 0xFF;
			if (local37 > 0) {
				local47 = this.aClass237_6.method5431(local37 - 1);
				if (local47.anInt293 != -1) {
					local65 = arg0[arg11 - 1][arg1];
					local494 = arg7[arg11 - 1][arg1];
					if (local47.aBoolean15) {
						local86 = 6;
						local525 = local494 * 2 + 4;
						local530 = Static293.method4195(local47, arg3);
						for (local532 = 0; local532 < 3; local532++) {
							local86 &= 0x7;
							local525 &= 0x7;
							if (Static70.aBooleanArrayArray2[local65][local525] && Static243.anIntArray458[local86] <= local47.anInt307) {
								Static84.anIntArray368[local86] = local47.anInt293;
								Static221.anIntArray423[local86] = local530;
								Static360.anIntArray376[local86] = arg3.method6024() ? local47.anInt299 : local47.anInt297;
								Static340.anIntArray352[local86] = local47.anInt296;
								if (Static243.anIntArray458[local86] == local47.anInt307) {
									Static320.anIntArray60[local86] |= 0x8;
								} else {
									Static320.anIntArray60[local86] = 8;
								}
								Static243.anIntArray458[local86] = local47.anInt307;
							}
							local525--;
							local86++;
						}
						if (!local18[arg6 + 3 & 0x3]) {
							arg2[3] = Static96.aBooleanArrayArray3[local65][local494 + 1 & 0x3];
						}
					} else if (!local18[arg6 + 3 & 0x3]) {
						arg2[3] = Static184.aBooleanArrayArray6[local65][local494 + 1 & 0x3];
					}
				}
			}
		}
		if (arg12 - 1 > arg11) {
			local37 = arg5[arg11 + 1][arg1] & 0xFF;
			if (local37 > 0) {
				local47 = this.aClass237_6.method5431(local37 - 1);
				if (local47.anInt293 != -1) {
					local65 = arg0[arg11 + 1][arg1];
					local494 = arg7[arg11 + 1][arg1];
					if (local47.aBoolean15) {
						local86 = 4;
						local525 = local494 * 2 + 6;
						local530 = Static293.method4195(local47, arg3);
						for (local532 = 0; local532 < 3; local532++) {
							local525 &= 0x7;
							local86 &= 0x7;
							if (Static70.aBooleanArrayArray2[local65][local525] && Static243.anIntArray458[local86] <= local47.anInt307) {
								Static84.anIntArray368[local86] = local47.anInt293;
								Static221.anIntArray423[local86] = local530;
								Static360.anIntArray376[local86] = arg3.method6024() ? local47.anInt299 : local47.anInt297;
								Static340.anIntArray352[local86] = local47.anInt296;
								if (local47.anInt307 == Static243.anIntArray458[local86]) {
									Static320.anIntArray60[local86] |= 0x4;
								} else {
									Static320.anIntArray60[local86] = 4;
								}
								Static243.anIntArray458[local86] = local47.anInt307;
							}
							local86--;
							local525++;
						}
						if (!local18[arg6 + 1 & 0x3]) {
							arg2[1] = Static96.aBooleanArrayArray3[local65][local494 + 3 & 0x3];
						}
					} else if (!local18[arg6 + 1 & 0x3]) {
						arg2[1] = Static184.aBooleanArrayArray6[local65][local494 + 3 & 0x3];
					}
				}
			}
		}
		if (arg4 == null) {
			return;
		}
		local37 = Static293.method4195(arg4, arg3);
		if (!arg4.aBoolean15) {
			return;
		}
		for (@Pc(1225) int local1225 = 0; local1225 < 8; local1225++) {
			@Pc(1235) int local1235 = local1225 - arg6 * 2 & 0x7;
			if (Static70.aBooleanArrayArray2[arg10][local1225] && Static243.anIntArray458[local1235] <= arg4.anInt307) {
				Static84.anIntArray368[local1235] = arg4.anInt293;
				Static221.anIntArray423[local1235] = local37;
				Static360.anIntArray376[local1235] = arg3.method6024() ? arg4.anInt299 : arg4.anInt297;
				Static340.anIntArray352[local1235] = arg4.anInt296;
				if (Static243.anIntArray458[local1235] == arg4.anInt307) {
					Static320.anIntArray60[local1235] |= 0x2;
				} else {
					Static320.anIntArray60[local1235] = 2;
				}
				Static243.anIntArray458[local1235] = arg4.anInt307;
			}
		}
		return;
	}
}
