import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public class Class195 {

	@OriginalMember(owner = "client!pv", name = "o", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray19;

	@OriginalMember(owner = "client!pv", name = "i", descriptor = "[I")
	private final int[] anIntArray424 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!pv", name = "u", descriptor = "[I")
	private final int[] anIntArray425 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "Lclient!um;")
	private final Class245 aClass245_7;

	@OriginalMember(owner = "client!pv", name = "z", descriptor = "I")
	protected final int anInt6370;

	@OriginalMember(owner = "client!pv", name = "t", descriptor = "I")
	public final int anInt6368;

	@OriginalMember(owner = "client!pv", name = "B", descriptor = "I")
	protected final int anInt6371;

	@OriginalMember(owner = "client!pv", name = "q", descriptor = "Z")
	public final boolean aBoolean703;

	@OriginalMember(owner = "client!pv", name = "k", descriptor = "Lclient!ua;")
	private final Class241 aClass241_13;

	@OriginalMember(owner = "client!pv", name = "v", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray20;

	@OriginalMember(owner = "client!pv", name = "j", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!pv", name = "x", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray21;

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!pv", name = "A", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!pv", name = "m", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(IIIZLclient!ua;Lclient!um;)V")
	protected Class195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class241 arg4, @OriginalArg(5) Class245 arg5) {
		this.aClass245_7 = arg5;
		this.anInt6370 = arg1;
		this.anInt6368 = arg0;
		this.anInt6371 = arg2;
		this.aBoolean703 = arg3;
		this.aClass241_13 = arg4;
		this.aByteArrayArrayArray20 = new byte[this.anInt6368][this.anInt6370][this.anInt6371];
		this.aByteArrayArrayArray17 = new byte[this.anInt6368][this.anInt6370 + 1][this.anInt6371 + 1];
		this.aByteArrayArrayArray21 = new byte[this.anInt6368][this.anInt6370][this.anInt6371];
		this.aByteArrayArrayArray16 = new byte[this.anInt6368][this.anInt6370][this.anInt6371];
		this.anIntArrayArrayArray12 = new int[this.anInt6368][this.anInt6370 + 1][this.anInt6371 + 1];
		this.aByteArrayArrayArray18 = new byte[this.anInt6368][this.anInt6370][this.anInt6371];
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIIII)V")
	private void method4991(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = arg1; local3 < arg1 + 64; local3++) {
			for (local7 = arg0; local7 < arg0 + 64; local7++) {
				if (local7 >= 0 && local7 < this.anInt6370 && local3 >= 0 && local3 < this.anInt6371) {
					this.anIntArrayArrayArray12[arg2][local7][local3] = arg2 <= 0 ? 0 : this.anIntArrayArrayArray12[arg2 - 1][local7][local3] - 240;
				}
			}
		}
		if (arg0 > 0 && arg0 < this.anInt6370) {
			for (local7 = arg1 + 1; local7 < arg1 + 64; local7++) {
				if (local7 >= 0 && this.anInt6371 > local7) {
					this.anIntArrayArrayArray12[arg2][arg0][local7] = this.anIntArrayArrayArray12[arg2][arg0 - 1][local7];
				}
			}
		}
		if (arg1 > 0 && this.anInt6371 > arg1) {
			for (local7 = arg0 + 1; local7 < arg0 + 64; local7++) {
				if (local7 >= 0 && local7 < this.anInt6370) {
					this.anIntArrayArrayArray12[arg2][local7][arg1] = this.anIntArrayArrayArray12[arg2][local7][arg1 - 1];
				}
			}
		}
		if (arg0 < 0 || arg1 < 0 || this.anInt6370 <= arg0 || arg1 >= this.anInt6371) {
			return;
		}
		if (arg2 == 0) {
			if (arg0 > 0 && this.anIntArrayArrayArray12[arg2][arg0 - 1][arg1] != 0) {
				this.anIntArrayArrayArray12[arg2][arg0][arg1] = this.anIntArrayArrayArray12[arg2][arg0 - 1][arg1];
				return;
			}
			if (arg1 > 0 && this.anIntArrayArrayArray12[arg2][arg0][arg1 - 1] != 0) {
				this.anIntArrayArrayArray12[arg2][arg0][arg1] = this.anIntArrayArrayArray12[arg2][arg0][arg1 - 1];
				return;
			}
			if (arg0 > 0 && arg1 > 0 && this.anIntArrayArrayArray12[arg2][arg0 - 1][arg1 - 1] != 0) {
				this.anIntArrayArrayArray12[arg2][arg0][arg1] = this.anIntArrayArrayArray12[arg2][arg0 - 1][arg1 - 1];
				return;
			}
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray12[arg2 - 1][arg0 - 1][arg1] != this.anIntArrayArrayArray12[arg2][arg0 - 1][arg1]) {
			this.anIntArrayArrayArray12[arg2][arg0][arg1] = this.anIntArrayArrayArray12[arg2][arg0 - 1][arg1];
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray12[arg2][arg0][arg1 - 1] != this.anIntArrayArrayArray12[arg2 - 1][arg0][arg1 - 1]) {
			this.anIntArrayArrayArray12[arg2][arg0][arg1] = this.anIntArrayArrayArray12[arg2][arg0][arg1 - 1];
			return;
		}
		if (arg0 > 0 && arg1 > 0 && this.anIntArrayArrayArray12[arg2 - 1][arg0 - 1][arg1 - 1] != this.anIntArrayArrayArray12[arg2][arg0 - 1][arg1 - 1]) {
			this.anIntArrayArrayArray12[arg2][arg0][arg1] = this.anIntArrayArrayArray12[arg2][arg0 - 1][arg1 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(II[[I)V")
	public final void method4992(@OriginalArg(2) int[][] arg0) {
		@Pc(16) int[][] local16 = this.anIntArrayArrayArray12[0];
		for (@Pc(18) int local18 = 0; local18 < this.anInt6370 + 1; local18++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt6371 + 1; local22++) {
				local16[local18][local22] += arg0[local18][local22];
			}
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIIIIIZLclient!ug;II)V")
	private void method4993(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Class1_Sub28 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg5 == 1) {
			arg3 = 1;
		} else if (arg5 == 2) {
			arg2 = 1;
			arg3 = 1;
		} else if (arg5 == 3) {
			arg2 = 1;
		}
		@Pc(74) int local74;
		if (arg8 < 0 || this.anInt6370 <= arg8 || arg9 < 0 || arg9 >= this.anInt6371) {
			while (true) {
				local74 = arg7.method5337();
				if (local74 == 0) {
					return;
				}
				if (local74 == 1) {
					arg7.method5337();
					return;
				}
				if (local74 <= 49) {
					arg7.method5337();
				}
			}
			return;
		}
		if (!this.aBoolean703 && !arg6) {
			Static147.aByteArrayArrayArray22[arg4][arg8][arg9] = 0;
		}
		while (true) {
			local74 = arg7.method5337();
			if (local74 == 0) {
				if (this.aBoolean703) {
					this.anIntArrayArrayArray12[0][arg2 + arg8][arg3 + arg9] = 0;
					return;
				} else if (arg4 == 0) {
					this.anIntArrayArrayArray12[0][arg8 + arg2][arg9 + arg3] = -Static131.method2047(arg0 + 932731, arg1 + 556238) * 8 << 0;
					return;
				} else {
					this.anIntArrayArrayArray12[arg4][arg8 + arg2][arg3 + arg9] = this.anIntArrayArrayArray12[arg4 - 1][arg2 + arg8][arg9 + arg3] - 240;
					return;
				}
			}
			if (local74 == 1) {
				@Pc(168) int local168 = arg7.method5337();
				if (!this.aBoolean703) {
					if (local168 == 1) {
						local168 = 0;
					}
					if (arg4 == 0) {
						this.anIntArrayArrayArray12[0][arg8 + arg2][arg9 + arg3] = -local168 * 8 << 0;
						return;
					}
					this.anIntArrayArrayArray12[arg4][arg8 + arg2][arg9 + arg3] = this.anIntArrayArrayArray12[arg4 - 1][arg8 + arg2][arg9 + arg3] - (local168 * 8 << 0);
					return;
				}
				this.anIntArrayArrayArray12[0][arg8 + arg2][arg3 + arg9] = local168 * 8 << 0;
				return;
			}
			if (local74 <= 49) {
				if (arg6) {
					arg7.method5337();
				} else {
					this.aByteArrayArrayArray16[arg4][arg8][arg9] = arg7.method5367();
					this.aByteArrayArrayArray20[arg4][arg8][arg9] = (byte) ((local74 - 2) / 4);
					this.aByteArrayArrayArray18[arg4][arg8][arg9] = (byte) (arg5 + local74 - 2 & 0x3);
				}
			} else if (local74 <= 81) {
				if (!this.aBoolean703 && !arg6) {
					Static147.aByteArrayArrayArray22[arg4][arg8][arg9] = (byte) (local74 - 49);
				}
			} else if (!arg6) {
				this.aByteArrayArrayArray21[arg4][arg8][arg9] = (byte) (local74 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILclient!ug;I[Lclient!as;IIB)V")
	public final void method4994(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class14[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (!this.aBoolean703) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class14 local16 = arg3[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local28 = local18 + arg0;
						@Pc(32) int local32 = arg2 + local22;
						if (local28 >= 0 && this.anInt6370 > local28 && local32 >= 0 && local32 < this.anInt6371) {
							local16.method268(local28, local32);
						}
					}
				}
			}
		}
		local10 = arg4 + arg0;
		@Pc(97) int local97 = arg5 + arg2;
		for (local18 = 0; local18 < this.anInt6368; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method4993(local22 + local10, local28 + local97, 0, 0, local18, 0, false, arg1, arg0 + local22, local28 - -arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!za;BLclient!ya;I[[ILclient!ya;Lclient!ya;)V")
	private void method4996(@OriginalArg(0) Class34 arg0, @OriginalArg(2) Class157 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) Class157 arg4, @OriginalArg(6) Class157 arg5) {
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray20[arg2];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray18[arg2];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray21[arg2];
		@Pc(30) byte[][] local30 = this.aByteArrayArrayArray16[arg2];
		for (@Pc(32) int local32 = 0; local32 < this.anInt6370; local32++) {
			@Pc(50) int local50 = local32 >= this.anInt6370 - 1 ? local32 : local32 + 1;
			for (@Pc(52) int local52 = 0; local52 < this.anInt6371; local52++) {
				@Pc(66) int local66 = this.anInt6371 - 1 <= local52 ? local52 : local52 + 1;
				if (Static84.anInt959 == -1 || Static444.method5830(local32, local52, arg2, Static84.anInt959)) {
					@Pc(81) boolean local81 = false;
					@Pc(83) boolean local83 = false;
					@Pc(86) boolean[] local86 = new boolean[4];
					@Pc(92) int local92 = local15[local32][local52];
					@Pc(98) int local98 = local20[local32][local52];
					@Pc(106) int local106 = local30[local32][local52] & 0xFF;
					@Pc(114) int local114 = local25[local32][local52] & 0xFF;
					@Pc(122) int local122 = local25[local32][local66] & 0xFF;
					@Pc(130) int local130 = local25[local50][local66] & 0xFF;
					@Pc(138) int local138 = local25[local50][local52] & 0xFF;
					if (local106 != 0 || local114 != 0) {
						@Pc(160) Class258 local160 = local106 == 0 ? null : this.aClass241_13.method5222(local106 - 1);
						@Pc(175) Class91 local175 = local114 == 0 ? null : this.aClass245_7.method5325(local114 - 1);
						if (local92 == 0 && local160 == null) {
							local92 = 12;
						}
						@Pc(183) Class258 local183 = local160;
						if (local160 != null) {
							if (local160.anInt7321 == -1 && local160.anInt7326 == -1) {
								local183 = local160;
								local160 = null;
							} else if (local175 != null && local92 != 0) {
								local83 = local160.aBoolean800;
							}
						}
						@Pc(270) int local270;
						@Pc(298) int local298;
						@Pc(363) int local363;
						@Pc(375) int local375;
						if ((local92 == 0 || local92 == 12) && local32 > 0 && local52 > 0 && local32 < this.anInt6370 && this.anInt6371 > local52) {
							@Pc(253) int local253 = local114 == local25[local50][local52 - 1] ? 1 : -1;
							local270 = local25[local32 - 1][local52 - 1] == local114 ? 1 : -1;
							@Pc(283) int local283 = local114 == local25[local50][local66] ? 1 : -1;
							local298 = local25[local32 - 1][local66] == local114 ? 1 : -1;
							if (local114 == local25[local32][local52 - 1]) {
								local253++;
								local270++;
							} else {
								local270--;
								local253--;
							}
							if (local114 == local25[local50][local52]) {
								local283++;
								local253++;
							} else {
								local253--;
								local283--;
							}
							if (local25[local32][local66] == local114) {
								local283++;
								local298++;
							} else {
								local283--;
								local298--;
							}
							if (local25[local32 - 1][local52] == local114) {
								local298++;
								local270++;
							} else {
								local298--;
								local270--;
							}
							local363 = local270 - local283;
							if (local363 < 0) {
								local363 = -local363;
							}
							local375 = local253 - local298;
							if (local375 < 0) {
								local375 = -local375;
							}
							if (local375 == local363) {
								local363 = arg4.ua(local32, local52) - arg4.ua(local50, local66);
								if (local363 < 0) {
									local363 = -local363;
								}
								local375 = arg4.ua(local50, local52) - arg4.ua(local32, local66);
								if (local375 < 0) {
									local375 = -local375;
								}
							}
							local98 = local363 >= local375 ? 0 : 1;
						}
						for (local270 = 0; local270 < 13; local270++) {
							Static431.anIntArray490[local270] = -1;
							Static195.anIntArray221[local270] = 1;
						}
						@Pc(454) boolean[] local454 = local160 != null && local160.aBoolean800 ? Static221.aBooleanArrayArray4[local92] : Static290.aBooleanArrayArray5[local92];
						this.method4999(arg0, this.anInt6370, local92, local175, local52, local15, local20, this.anInt6371, local98, local86, local30, local160, local32);
						@Pc(487) boolean local487 = local160 != null && local160.anInt7326 != local160.anInt7321;
						if (!local487) {
							for (local298 = 0; local298 < 8; local298++) {
								if (Static431.anIntArray490[local298] >= 0 && Static381.anIntArray426[local298] != Static179.anIntArray204[local298]) {
									local487 = true;
									break;
								}
							}
						}
						if (!local454[local98 + 1 & 0x3]) {
							local86[1] = Static244.method3509(local86[1], (Static195.anIntArray221[4] & Static195.anIntArray221[2]) == 0);
						}
						if (!local454[local98 + 3 & 0x3]) {
							local86[3] = Static244.method3509(local86[3], (Static195.anIntArray221[6] & Static195.anIntArray221[0]) == 0);
						}
						if (!local454[local98 & 0x3]) {
							local86[0] = Static244.method3509(local86[0], (Static195.anIntArray221[2] & Static195.anIntArray221[0]) == 0);
						}
						if (!local454[local98 + 2 & 0x3]) {
							local86[2] = Static244.method3509(local86[2], (Static195.anIntArray221[6] & Static195.anIntArray221[4]) == 0);
						}
						if (!local83 && (local92 == 0 || local92 == 12)) {
							if (local86[0] && !local86[1] && !local86[2] && local86[3]) {
								local98 = 0;
								local92 = local92 == 0 ? 13 : 14;
								local86[0] = local86[3] = false;
							} else if (local86[0] && local86[1] && !local86[2] && !local86[3]) {
								local92 = local92 == 0 ? 13 : 14;
								local86[0] = local86[1] = false;
								local98 = 3;
							} else if (!local86[0] && local86[1] && local86[2] && !local86[3]) {
								local98 = 2;
								local92 = local92 == 0 ? 13 : 14;
								local86[1] = local86[2] = false;
							} else if (!local86[0] && !local86[1] && local86[2] && local86[3]) {
								local98 = 1;
								local86[2] = local86[3] = false;
								local92 = local92 == 0 ? 13 : 14;
							}
						}
						@Pc(800) boolean local800 = !local83 && !local86[0] && !local86[2] && !local86[1] && !local86[3];
						@Pc(802) int[] local802 = null;
						@Pc(808) int[] local808;
						@Pc(820) int[] local820;
						@Pc(832) int[] local832;
						if (local800) {
							local808 = Static170.anIntArrayArray31[local92];
							local375 = local160 == null ? 0 : Static82.anIntArray521[local92];
							local820 = Static253.anIntArrayArray37[local92];
							local363 = local175 == null ? 0 : Static66.anIntArray59[local92];
							local832 = Static169.anIntArrayArray30[local92];
						} else if (local83) {
							local820 = Static335.anIntArrayArray49[local92];
							local375 = local160 == null ? 0 : Static432.anIntArray491[local92];
							local802 = Static118.anIntArrayArray27[local92];
							local808 = Static12.anIntArrayArray2[local92];
							local363 = local175 == null ? 0 : Static149.anIntArray174[local92];
							local832 = Static287.anIntArrayArray41[local92];
						} else {
							local820 = Static438.anIntArrayArray39[local92];
							local363 = local175 == null ? 0 : Static284.anIntArray321[local92];
							local808 = Static432.anIntArrayArray62[local92];
							local832 = Static207.anIntArrayArray55[local92];
							local802 = Static385.anIntArrayArray58[local92];
							local375 = local160 == null ? 0 : Static44.anIntArray38[local92];
						}
						@Pc(906) int local906 = local375 + local363;
						if (local906 <= 0) {
							Static110.method1728(arg2, local32, local52);
						} else {
							if (local86[0]) {
								local906++;
							}
							if (local86[2]) {
								local906++;
							}
							if (local86[1]) {
								local906++;
							}
							if (local86[3]) {
								local906++;
							}
							@Pc(936) int local936 = 0;
							@Pc(938) int local938 = 0;
							@Pc(942) int local942 = local906 * 3;
							@Pc(949) int[] local949 = local487 ? new int[local942] : null;
							@Pc(952) int[] local952 = new int[local942];
							@Pc(955) int[] local955 = new int[local942];
							@Pc(958) int[] local958 = new int[local942];
							@Pc(961) int[] local961 = new int[local942];
							@Pc(964) int[] local964 = new int[local942];
							@Pc(971) int[] local971 = arg5 == null ? null : new int[local942];
							@Pc(980) int[] local980 = arg5 == null && arg1 == null ? null : new int[local942];
							@Pc(982) int local982 = -1;
							@Pc(984) int local984 = -1;
							@Pc(986) int local986 = 256;
							@Pc(1104) byte local1104;
							@Pc(1036) int local1036;
							@Pc(1038) int local1038;
							@Pc(1278) int local1278;
							@Pc(1284) int local1284;
							@Pc(1293) int local1293;
							@Pc(1298) int local1298;
							@Pc(1308) int local1308;
							@Pc(1303) int local1303;
							@Pc(1312) int local1312;
							@Pc(1370) int local1370;
							@Pc(1376) int local1376;
							if (local160 != null) {
								local982 = local160.anInt7321;
								local984 = arg0.method5772() ? local160.anInt7322 : local160.anInt7328;
								local986 = local160.anInt7324;
								local1036 = Static389.method5096(arg0, local160);
								for (local1038 = 0; local1038 < local375; local1038++) {
									if (local86[-local98 & 0x3] && local802[0] == local936) {
										Static62.anIntArray55[0] = local808[local936];
										Static62.anIntArray55[1] = 1;
										Static62.anIntArray55[2] = local832[local936];
										Static62.anIntArray55[3] = 1;
										Static62.anIntArray55[4] = local820[local936];
										local1104 = 6;
										Static62.anIntArray55[5] = local832[local936];
									} else if (local86[2 - local98 & 0x3] && local802[2] == local936) {
										Static62.anIntArray55[0] = local808[local936];
										Static62.anIntArray55[1] = 5;
										Static62.anIntArray55[2] = local832[local936];
										Static62.anIntArray55[3] = 5;
										Static62.anIntArray55[4] = local820[local936];
										local1104 = 6;
										Static62.anIntArray55[5] = local832[local936];
									} else if (local86[1 - local98 & 0x3] && local802[1] == local936) {
										Static62.anIntArray55[0] = local808[local936];
										Static62.anIntArray55[1] = 3;
										Static62.anIntArray55[2] = local832[local936];
										Static62.anIntArray55[3] = 3;
										Static62.anIntArray55[4] = local820[local936];
										local1104 = 6;
										Static62.anIntArray55[5] = local832[local936];
									} else if (local86[3 - local98 & 0x3] && local936 == local802[3]) {
										Static62.anIntArray55[0] = local808[local936];
										Static62.anIntArray55[1] = 7;
										Static62.anIntArray55[2] = local832[local936];
										Static62.anIntArray55[3] = 7;
										Static62.anIntArray55[4] = local820[local936];
										local1104 = 6;
										Static62.anIntArray55[5] = local832[local936];
									} else {
										Static62.anIntArray55[0] = local808[local936];
										Static62.anIntArray55[1] = local820[local936];
										Static62.anIntArray55[2] = local832[local936];
										local1104 = 3;
									}
									local936++;
									for (local1278 = 0; local1278 < local1104; local1278++) {
										local1284 = Static62.anIntArray55[local1278];
										local1293 = local1284 - local98 * 2 & 0x7;
										local1298 = this.anIntArray424[local1284];
										local1303 = this.anIntArray425[local1284];
										if (local98 == 1) {
											local1308 = local1303;
											local1312 = 128 - local1298;
										} else if (local98 == 2) {
											local1308 = 128 - local1298;
											local1312 = 128 - local1303;
										} else if (local98 == 3) {
											local1312 = local1298;
											local1308 = 128 - local1303;
										} else {
											local1312 = local1303;
											local1308 = local1298;
										}
										local952[local938] = local1308;
										local955[local938] = local1312;
										if (local971 != null && Static73.aBooleanArrayArray2[local92][local1284]) {
											local1370 = (local32 << 7) + local1308;
											local1376 = local1312 + (local52 << 7);
											local971[local938] = arg5.ca(local1370, local1376) - arg4.ca(local1370, local1376);
										}
										if (local980 != null) {
											if (arg5 != null && !Static73.aBooleanArrayArray2[local92][local1284]) {
												local1370 = local1308 + (local32 << 7);
												local1376 = local1312 + (local52 << 7);
												local980[local938] = arg4.ca(local1370, local1376) - arg5.ca(local1370, local1376);
											} else if (arg1 != null && !Static175.aBooleanArrayArray3[local92][local1284]) {
												local1370 = (local32 << 7) + local1308;
												local1376 = local1312 + (local52 << 7);
												local980[local938] = arg1.ca(local1370, local1376) - arg4.ca(local1370, local1376);
											}
										}
										if (local1284 < 8 && local160.anInt7327 < Static431.anIntArray490[local1293]) {
											if (local949 != null) {
												local949[local938] = Static179.anIntArray204[local1293];
											}
											local964[local938] = Static271.anIntArray468[local1293];
											local961[local938] = Static251.anIntArray299[local1293];
											local958[local938] = Static381.anIntArray426[local1293];
										} else {
											if (local949 != null) {
												local949[local938] = local1036;
											}
											local961[local938] = arg0.method5772() ? local160.anInt7322 : local160.anInt7328;
											local964[local938] = local160.anInt7324;
											local958[local938] = local982;
										}
										local938++;
									}
								}
								if (!this.aBoolean703 && arg2 == 0) {
									Static49.method821(local32, local52, local160.anInt7315, local160.anInt7325 * 8, local160.anInt7323);
								}
								if (local92 != 12 && local160.anInt7321 != -1 && local160.aBoolean802) {
									local81 = true;
								}
							} else if (local800) {
								local936 = Static82.anIntArray521[local92];
							} else if (local83) {
								local936 = Static432.anIntArray491[local92];
							} else {
								local936 = Static44.anIntArray38[local92];
							}
							if (local175 != null) {
								if (local130 == 0) {
									local130 = local114;
								}
								if (local138 == 0) {
									local138 = local114;
								}
								if (local122 == 0) {
									local122 = local114;
								}
								@Pc(1592) Class91 local1592 = this.aClass245_7.method5325(local114 - 1);
								@Pc(1600) Class91 local1600 = this.aClass245_7.method5325(local122 - 1);
								@Pc(1608) Class91 local1608 = this.aClass245_7.method5325(local130 - 1);
								@Pc(1616) Class91 local1616 = this.aClass245_7.method5325(local138 - 1);
								for (local1293 = 0; local1293 < local363; local1293++) {
									if (local86[-local98 & 0x3] && local802[0] == local936) {
										Static62.anIntArray55[0] = local808[local936];
										Static62.anIntArray55[1] = 1;
										Static62.anIntArray55[2] = local832[local936];
										Static62.anIntArray55[3] = 1;
										Static62.anIntArray55[4] = local820[local936];
										Static62.anIntArray55[5] = local832[local936];
										local1104 = 6;
									} else if (local86[2 - local98 & 0x3] && local802[2] == local936) {
										Static62.anIntArray55[0] = local808[local936];
										Static62.anIntArray55[1] = 5;
										Static62.anIntArray55[2] = local832[local936];
										Static62.anIntArray55[3] = 5;
										Static62.anIntArray55[4] = local820[local936];
										local1104 = 6;
										Static62.anIntArray55[5] = local832[local936];
									} else if (local86[1 - local98 & 0x3] && local802[1] == local936) {
										Static62.anIntArray55[0] = local808[local936];
										Static62.anIntArray55[1] = 3;
										Static62.anIntArray55[2] = local832[local936];
										Static62.anIntArray55[3] = 3;
										Static62.anIntArray55[4] = local820[local936];
										local1104 = 6;
										Static62.anIntArray55[5] = local832[local936];
									} else if (local86[3 - local98 & 0x3] && local936 == local802[3]) {
										Static62.anIntArray55[0] = local808[local936];
										Static62.anIntArray55[1] = 7;
										Static62.anIntArray55[2] = local832[local936];
										Static62.anIntArray55[3] = 7;
										Static62.anIntArray55[4] = local820[local936];
										Static62.anIntArray55[5] = local832[local936];
										local1104 = 6;
									} else {
										Static62.anIntArray55[0] = local808[local936];
										Static62.anIntArray55[1] = local820[local936];
										Static62.anIntArray55[2] = local832[local936];
										local1104 = 3;
									}
									local936++;
									for (local1298 = 0; local1298 < local1104; local1298++) {
										local1308 = Static62.anIntArray55[local1298];
										local1303 = local1308 - local98 * 2 & 0x7;
										local1312 = this.anIntArray424[local1308];
										local1376 = this.anIntArray425[local1308];
										@Pc(1877) int local1877;
										if (local98 == 1) {
											local1370 = local1376;
											local1877 = 128 - local1312;
										} else if (local98 == 2) {
											local1877 = 128 - local1376;
											local1370 = 128 - local1312;
										} else if (local98 == 3) {
											local1877 = local1312;
											local1370 = 128 - local1376;
										} else {
											local1877 = local1376;
											local1370 = local1312;
										}
										local952[local938] = local1370;
										local955[local938] = local1877;
										@Pc(1934) int local1934;
										@Pc(1941) int local1941;
										if (local971 != null && Static73.aBooleanArrayArray2[local92][local1308]) {
											local1934 = (local32 << 7) + local1370;
											local1941 = (local52 << 7) + local1877;
											local971[local938] = arg5.ca(local1934, local1941) - arg4.ca(local1934, local1941);
										}
										if (local980 != null) {
											if (arg5 != null && !Static73.aBooleanArrayArray2[local92][local1308]) {
												local1934 = local1370 + (local32 << 7);
												local1941 = (local52 << 7) + local1877;
												local980[local938] = arg4.ca(local1934, local1941) - arg5.ca(local1934, local1941);
											} else if (arg1 != null && !Static175.aBooleanArrayArray3[local92][local1308]) {
												local1934 = (local32 << 7) + local1370;
												local1941 = local1877 + (local52 << 7);
												local980[local938] = arg1.ca(local1934, local1941) - arg4.ca(local1934, local1941);
											}
										}
										if (local1308 < 8 && Static431.anIntArray490[local1303] >= 0) {
											if (local949 != null) {
												local949[local938] = Static179.anIntArray204[local1303];
											}
											local964[local938] = Static271.anIntArray468[local1303];
											local961[local938] = Static251.anIntArray299[local1303];
											local958[local938] = Static381.anIntArray426[local1303];
										} else {
											if (local83 && Static73.aBooleanArrayArray2[local92][local1308]) {
												local961[local938] = local984;
												local964[local938] = local986;
												local958[local938] = local982;
											} else if (local1370 == 0 && local1877 == 0) {
												local958[local938] = arg3[local32][local52];
												local961[local938] = local1592.anInt2363;
												local964[local938] = local1592.anInt2361;
											} else if (local1370 == 0 && local1877 == 128) {
												local958[local938] = arg3[local32][local66];
												local961[local938] = local1600.anInt2363;
												local964[local938] = local1600.anInt2361;
											} else if (local1370 == 128 && local1877 == 128) {
												local958[local938] = arg3[local50][local66];
												local961[local938] = local1608.anInt2363;
												local964[local938] = local1608.anInt2361;
											} else if (local1370 == 128 && local1877 == 0) {
												local958[local938] = arg3[local50][local52];
												local961[local938] = local1616.anInt2363;
												local964[local938] = local1616.anInt2361;
											} else {
												if (local1370 >= 64) {
													if (local1877 < 64) {
														local961[local938] = local1616.anInt2363;
														local964[local938] = local1616.anInt2361;
													} else {
														local961[local938] = local1608.anInt2363;
														local964[local938] = local1608.anInt2361;
													}
												} else if (local1877 >= 64) {
													local961[local938] = local1600.anInt2363;
													local964[local938] = local1600.anInt2361;
												} else {
													local961[local938] = local1592.anInt2363;
													local964[local938] = local1592.anInt2361;
												}
												local1934 = Static358.method1351(local1370 << 7 >> 7, arg3[local32][local52], arg3[local50][local52]);
												local1941 = Static358.method1351(local1370 << 7 >> 7, arg3[local32][local66], arg3[local50][local66]);
												local958[local938] = Static358.method1351(local1877 << 7 >> 7, local1934, local1941);
											}
											if (local949 != null) {
												local949[local938] = local958[local938];
											}
										}
										local938++;
									}
								}
								if (local92 != 0 && local175.aBoolean264) {
									local81 = true;
								}
							}
							local1036 = arg4.ua(local32, local52);
							local1038 = arg4.ua(local50, local52);
							local1278 = arg4.ua(local50, local66);
							local1284 = arg4.ua(local32, local66);
							if (arg2 > 0) {
								@Pc(2354) boolean local2354 = true;
								if (local114 == 0 && local92 != 0) {
									local2354 = false;
								}
								if (local106 > 0 && local183 != null && !local183.aBoolean801) {
									local2354 = false;
								}
								if (local2354 && local1036 == local1038 && local1278 == local1036 && local1284 == local1036) {
									this.aByteArrayArrayArray17[arg2][local32][local52] = (byte) (this.aByteArrayArrayArray17[arg2][local32][local52] | 0x4);
								}
							}
							local1293 = 0;
							local1298 = 0;
							local1308 = 0;
							if (this.aBoolean703) {
								local1293 = Static420.method5575(local32, local52);
								local1298 = Static115.method1818(local32, local52);
								local1308 = Static238.method3445(local32, local52);
							}
							arg4.pa(local32, local52, local952, local971, local955, local980, local958, local949, local961, local964, local1293, local1298, local1308, local81);
							Static110.method1728(arg2, local32, local52);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(I[[ILclient!za;Lclient!ya;Lclient!ya;ILclient!ya;)V")
	private void method4997(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class157 arg3, @OriginalArg(4) Class157 arg4, @OriginalArg(6) Class157 arg5) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6370; local7++) {
			for (@Pc(17) int local17 = 0; local17 < this.anInt6371; local17++) {
				if (Static84.anInt959 == -1 || Static444.method5830(local7, local17, arg0, Static84.anInt959)) {
					@Pc(40) byte local40 = this.aByteArrayArrayArray20[arg0][local7][local17];
					@Pc(49) byte local49 = this.aByteArrayArrayArray18[arg0][local7][local17];
					@Pc(60) int local60 = this.aByteArrayArrayArray16[arg0][local7][local17] & 0xFF;
					@Pc(71) int local71 = this.aByteArrayArrayArray21[arg0][local7][local17] & 0xFF;
					@Pc(86) Class258 local86 = local60 == 0 ? null : this.aClass241_13.method5222(local60 - 1);
					@Pc(98) Class91 local98 = local71 == 0 ? null : this.aClass245_7.method5325(local71 - 1);
					@Pc(100) int local100 = 0;
					@Pc(102) int local102 = 0;
					if (local40 != 0) {
						local100 = local98 == null ? 0 : Static66.anIntArray59[local40];
						local102 = local86 == null ? 0 : Static82.anIntArray521[local40];
					} else if (local86 != null) {
						local102 = Static82.anIntArray521[local40];
					} else if (local98 != null) {
						local100 = Static82.anIntArray521[local40];
					}
					@Pc(144) int local144 = local102 + local100;
					@Pc(146) int local146 = 0;
					if (local144 != 0) {
						@Pc(151) int[] local151 = new int[local144];
						@Pc(154) int[] local154 = new int[local144];
						@Pc(157) int[] local157 = new int[local144];
						@Pc(160) int[] local160 = new int[local144];
						@Pc(162) boolean local162 = false;
						@Pc(179) int local179;
						@Pc(211) int local211;
						if (local86 == null || local86.anInt7321 == -1 && local86.anInt7326 == -1 && local86.anInt7322 == -1) {
							for (local179 = 0; local179 < local102; local179++) {
								local151[local146] = -1;
								local146++;
							}
						} else {
							local179 = arg2.method5772() ? local86.anInt7322 : local86.anInt7328;
							if (Static261.aBoolean534) {
								local179 = -1;
							}
							for (local211 = 0; local211 < local102; local211++) {
								local157[local146] = local179;
								local160[local146] = local86.anInt7324;
								if (local86.anInt7321 == -1) {
									local151[local146] = -1;
								} else {
									local151[local146] = local86.anInt7321;
								}
								if (local86.anInt7326 == -1) {
									local154[local146] = -1;
								} else {
									local162 = true;
									local154[local146] = local86.anInt7326;
								}
								local146++;
							}
							if (!this.aBoolean703 && arg0 == 0) {
								Static49.method821(local7, local17, local86.anInt7315, local86.anInt7325 * 8, local86.anInt7323);
							}
						}
						if (!local162) {
							local154 = null;
						}
						if (local98 == null) {
							for (local179 = 0; local179 < local100; local179++) {
								local151[local146] = -1;
								local146++;
							}
						} else {
							local179 = local98.anInt2363;
							if (Static261.aBoolean534) {
								local179 = -1;
							}
							for (local211 = 0; local211 < local100; local211++) {
								local157[local146] = local179;
								local160[local146] = local98.anInt2361;
								local151[local146] = arg1[local7][local17];
								if (local154 != null) {
									local154[local146] = -1;
								}
								local146++;
							}
						}
						local179 = this.anIntArray424.length;
						@Pc(359) int[] local359 = new int[local179];
						@Pc(362) int[] local362 = new int[local179];
						@Pc(369) int[] local369 = arg3 == null ? null : new int[local179];
						@Pc(378) int[] local378 = arg3 == null && arg4 == null ? null : new int[local179];
						@Pc(387) int local387;
						@Pc(392) int local392;
						@Pc(473) int local473;
						@Pc(479) int local479;
						for (@Pc(380) int local380 = 0; local380 < local179; local380++) {
							local387 = this.anIntArray424[local380];
							local392 = this.anIntArray425[local380];
							if (local49 == 0) {
								local359[local380] = local387;
								local362[local380] = local392;
							} else if (local49 == 1) {
								local359[local380] = local392;
								local362[local380] = 128 - local387;
							} else if (local49 == 2) {
								local359[local380] = 128 - local387;
								local362[local380] = 128 - local392;
							} else if (local49 == 3) {
								local359[local380] = 128 - local392;
								local362[local380] = local387;
							}
							if (local369 != null && Static73.aBooleanArrayArray2[local40][local380]) {
								local473 = (local7 << 7) + local387;
								local479 = local387 + (local17 << 7);
								local369[local380] = arg3.ca(local473, local479) - arg5.ca(local473, local479);
							}
							if (local378 != null) {
								if (arg3 != null && !Static73.aBooleanArrayArray2[local40][local380]) {
									local473 = local387 + (local7 << 7);
									local479 = (local17 << 7) + local387;
									local378[local380] = arg5.ca(local473, local479) - arg3.ca(local473, local479);
								} else if (arg4 != null && !Static175.aBooleanArrayArray3[local40][local380]) {
									local473 = (local7 << 7) + local387;
									local479 = local387 + (local17 << 7);
									local378[local380] = arg4.ca(local473, local479) - arg5.ca(local473, local479);
								}
							}
						}
						local387 = arg5.ua(local7, local17);
						local392 = arg5.ua(local7 + 1, local17);
						local473 = arg5.ua(local7 + 1, local17 + 1);
						local479 = arg5.ua(local7, local17 + 1);
						if (arg0 > 0) {
							@Pc(599) boolean local599 = true;
							if (local71 == 0 && local40 != 0) {
								local599 = false;
							}
							if (local60 > 0 && local86 != null && !local86.aBoolean801) {
								local599 = false;
							}
							if (local599 && local392 == local387 && local473 == local387 && local387 == local479) {
								this.aByteArrayArrayArray17[arg0][local7][local17] = (byte) (this.aByteArrayArrayArray17[arg0][local7][local17] | 0x4);
							}
						}
						@Pc(657) int local657 = 0;
						@Pc(659) int local659 = 0;
						@Pc(661) int local661 = 0;
						if (this.aBoolean703) {
							local657 = Static420.method5575(local7, local17);
							local659 = Static115.method1818(local7, local17);
							local661 = Static238.method3445(local7, local17);
						}
						arg5.method4952(local7, local17, local359, local369, local362, local378, Static170.anIntArrayArray31[local40], Static253.anIntArrayArray37[local40], Static169.anIntArrayArray30[local40], local151, local154, local157, local160, local657, local659, local661);
						Static110.method1728(arg0, local7, local17);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!za;[[[I[Lclient!as;Z)V")
	public final void method4998(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class14[] arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(18) int local18;
		if (!this.aBoolean703) {
			for (local10 = 0; local10 < 4; local10++) {
				for (local14 = 0; local14 < this.anInt6370; local14++) {
					for (local18 = 0; local18 < this.anInt6371; local18++) {
						if ((Static147.aByteArrayArrayArray22[local10][local14][local18] & 0x1) != 0) {
							@Pc(35) int local35 = local10;
							if ((Static147.aByteArrayArrayArray22[1][local14][local18] & 0x2) != 0) {
								local35 = local10 - 1;
							}
							if (local35 >= 0) {
								arg2[local35].method269(local18, local14);
							}
						}
					}
				}
			}
		}
		for (local10 = 0; local10 < this.anInt6368; local10++) {
			local14 = 0;
			local18 = 0;
			if (!this.aBoolean703) {
				if (Static194.aBoolean809) {
					local14 = 2;
				}
				if (Static51.aBoolean99) {
					local18 = 8;
				}
				if (Static321.anInt5491 != 0) {
					local14 |= 0x1;
					if (local10 == 0 | Static53.aBoolean106) {
						local18 |= 0x10;
					}
				}
			}
			if (Static194.aBoolean809) {
				local18 |= 0x7;
			}
			if (!Static350.aBoolean683) {
				local18 |= 0x20;
			}
			@Pc(152) int[][] local152 = arg1 == null || local10 >= arg1.length ? this.anIntArrayArrayArray12[local10] : arg1[local10];
			Static179.method2601(local10, arg0.method5744(this.anInt6370, this.anInt6371, this.anIntArrayArrayArray12[local10], local152, local14, local18));
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!za;IILclient!gj;I[[B[[BII[ZB[[BLclient!vt;I)V")
	private void method4999(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class91 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) byte[][] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean[] arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) Class258 arg11, @OriginalArg(13) int arg12) {
		@Pc(18) boolean[] local18 = arg11 != null && arg11.aBoolean800 ? Static221.aBooleanArrayArray4[arg2] : Static290.aBooleanArrayArray5[arg2];
		@Pc(42) int local42;
		@Pc(52) Class258 local52;
		@Pc(69) byte local69;
		@Pc(86) int local86;
		@Pc(91) int local91;
		if (arg4 > 0) {
			if (arg12 > 0) {
				local42 = arg10[arg12 - 1][arg4 - 1] & 0xFF;
				if (local42 > 0) {
					local52 = this.aClass241_13.method5222(local42 - 1);
					if (local52.anInt7321 != -1 && local52.aBoolean800) {
						local69 = arg5[arg12 - 1][arg4 - 1];
						local86 = arg6[arg12 - 1][arg4 - 1] * 2 + 4 & 0x7;
						local91 = Static389.method5096(arg0, local52);
						if (Static73.aBooleanArrayArray2[local69][local86]) {
							Static381.anIntArray426[0] = local52.anInt7321;
							Static179.anIntArray204[0] = local91;
							Static251.anIntArray299[0] = arg0.method5772() ? local52.anInt7322 : local52.anInt7328;
							Static271.anIntArray468[0] = local52.anInt7324;
							Static431.anIntArray490[0] = local52.anInt7327;
							Static195.anIntArray221[0] = 256;
						}
					}
				}
			}
			if (arg12 < arg1 - 1) {
				local42 = arg10[arg12 + 1][arg4 - 1] & 0xFF;
				if (local42 > 0) {
					local52 = this.aClass241_13.method5222(local42 - 1);
					if (local52.anInt7321 != -1 && local52.aBoolean800) {
						local69 = arg5[arg12 + 1][arg4 - 1];
						local86 = arg6[arg12 + 1][arg4 - 1] * 2 + 6 & 0x7;
						local91 = Static389.method5096(arg0, local52);
						if (Static73.aBooleanArrayArray2[local69][local86]) {
							Static381.anIntArray426[2] = local52.anInt7321;
							Static179.anIntArray204[2] = local91;
							Static251.anIntArray299[2] = arg0.method5772() ? local52.anInt7322 : local52.anInt7328;
							Static271.anIntArray468[2] = local52.anInt7324;
							Static431.anIntArray490[2] = local52.anInt7327;
							Static195.anIntArray221[2] = 512;
						}
					}
				}
			}
		}
		if (arg4 < arg7 - 1) {
			if (arg12 > 0) {
				local42 = arg10[arg12 - 1][arg4 + 1] & 0xFF;
				if (local42 > 0) {
					local52 = this.aClass241_13.method5222(local42 - 1);
					if (local52.anInt7321 != -1 && local52.aBoolean800) {
						local69 = arg5[arg12 - 1][arg4 + 1];
						local86 = arg6[arg12 - 1][arg4 + 1] * 2 + 2 & 0x7;
						local91 = Static389.method5096(arg0, local52);
						if (Static73.aBooleanArrayArray2[local69][local86]) {
							Static381.anIntArray426[6] = local52.anInt7321;
							Static179.anIntArray204[6] = local91;
							Static251.anIntArray299[6] = arg0.method5772() ? local52.anInt7322 : local52.anInt7328;
							Static271.anIntArray468[6] = local52.anInt7324;
							Static431.anIntArray490[6] = local52.anInt7327;
							Static195.anIntArray221[6] = 64;
						}
					}
				}
			}
			if (arg1 - 1 > arg12) {
				local42 = arg10[arg12 + 1][arg4 + 1] & 0xFF;
				if (local42 > 0) {
					local52 = this.aClass241_13.method5222(local42 - 1);
					if (local52.anInt7321 != -1 && local52.aBoolean800) {
						local69 = arg5[arg12 + 1][arg4 + 1];
						local86 = arg6[arg12 + 1][arg4 + 1] * 2 & 0x7;
						local91 = Static389.method5096(arg0, local52);
						if (Static73.aBooleanArrayArray2[local69][local86]) {
							Static381.anIntArray426[4] = local52.anInt7321;
							Static179.anIntArray204[4] = local91;
							Static251.anIntArray299[4] = arg0.method5772() ? local52.anInt7322 : local52.anInt7328;
							Static271.anIntArray468[4] = local52.anInt7324;
							Static431.anIntArray490[4] = local52.anInt7327;
							Static195.anIntArray221[4] = 128;
						}
					}
				}
			}
		}
		@Pc(531) int local531;
		@Pc(536) int local536;
		@Pc(538) int local538;
		@Pc(500) byte local500;
		if (arg4 > 0) {
			local42 = arg10[arg12][arg4 - 1] & 0xFF;
			if (local42 > 0) {
				local52 = this.aClass241_13.method5222(local42 - 1);
				if (local52.anInt7321 != -1) {
					local69 = arg5[arg12][arg4 - 1];
					local500 = arg6[arg12][arg4 - 1];
					if (local52.aBoolean800) {
						local91 = 2;
						local531 = local500 * 2 + 4;
						local536 = Static389.method5096(arg0, local52);
						for (local538 = 0; local538 < 3; local538++) {
							local91 &= 0x7;
							local531 &= 0x7;
							if (Static73.aBooleanArrayArray2[local69][local531] && local52.anInt7327 >= Static431.anIntArray490[local91]) {
								Static381.anIntArray426[local91] = local52.anInt7321;
								Static179.anIntArray204[local91] = local536;
								Static251.anIntArray299[local91] = arg0.method5772() ? local52.anInt7322 : local52.anInt7328;
								Static271.anIntArray468[local91] = local52.anInt7324;
								if (local52.anInt7327 == Static431.anIntArray490[local91]) {
									Static195.anIntArray221[local91] |= 0x20;
								} else {
									Static195.anIntArray221[local91] = 32;
								}
								Static431.anIntArray490[local91] = local52.anInt7327;
							}
							local531++;
							local91--;
						}
						if (!local18[arg8 & 0x3]) {
							arg9[0] = Static221.aBooleanArrayArray4[local69][local500 + 2 & 0x3];
						}
					} else if (!local18[arg8 & 0x3]) {
						arg9[0] = Static290.aBooleanArrayArray5[local69][local500 + 2 & 0x3];
					}
				}
			}
		}
		if (arg4 < arg7 - 1) {
			local42 = arg10[arg12][arg4 + 1] & 0xFF;
			if (local42 > 0) {
				local52 = this.aClass241_13.method5222(local42 - 1);
				if (local52.anInt7321 != -1) {
					local69 = arg5[arg12][arg4 + 1];
					local500 = arg6[arg12][arg4 + 1];
					if (local52.aBoolean800) {
						local91 = 4;
						local531 = local500 * 2 + 2;
						local536 = Static389.method5096(arg0, local52);
						for (local538 = 0; local538 < 3; local538++) {
							local531 &= 0x7;
							local91 &= 0x7;
							if (Static73.aBooleanArrayArray2[local69][local531] && Static431.anIntArray490[local91] <= local52.anInt7327) {
								Static381.anIntArray426[local91] = local52.anInt7321;
								Static179.anIntArray204[local91] = local536;
								Static251.anIntArray299[local91] = arg0.method5772() ? local52.anInt7322 : local52.anInt7328;
								Static271.anIntArray468[local91] = local52.anInt7324;
								if (Static431.anIntArray490[local91] == local52.anInt7327) {
									Static195.anIntArray221[local91] |= 0x10;
								} else {
									Static195.anIntArray221[local91] = 16;
								}
								Static431.anIntArray490[local91] = local52.anInt7327;
							}
							local531--;
							local91++;
						}
						if (!local18[arg8 + 2 & 0x3]) {
							arg9[2] = Static221.aBooleanArrayArray4[local69][local500 & 0x3];
						}
					} else if (!local18[arg8 + 2 & 0x3]) {
						arg9[2] = Static290.aBooleanArrayArray5[local69][local500 & 0x3];
					}
				}
			}
		}
		if (arg12 > 0) {
			local42 = arg10[arg12 - 1][arg4] & 0xFF;
			if (local42 > 0) {
				local52 = this.aClass241_13.method5222(local42 - 1);
				if (local52.anInt7321 != -1) {
					local69 = arg5[arg12 - 1][arg4];
					local500 = arg6[arg12 - 1][arg4];
					if (local52.aBoolean800) {
						local91 = 6;
						local531 = local500 * 2 + 4;
						local536 = Static389.method5096(arg0, local52);
						for (local538 = 0; local538 < 3; local538++) {
							local91 &= 0x7;
							local531 &= 0x7;
							if (Static73.aBooleanArrayArray2[local69][local531] && Static431.anIntArray490[local91] <= local52.anInt7327) {
								Static381.anIntArray426[local91] = local52.anInt7321;
								Static179.anIntArray204[local91] = local536;
								Static251.anIntArray299[local91] = arg0.method5772() ? local52.anInt7322 : local52.anInt7328;
								Static271.anIntArray468[local91] = local52.anInt7324;
								if (Static431.anIntArray490[local91] == local52.anInt7327) {
									Static195.anIntArray221[local91] |= 0x8;
								} else {
									Static195.anIntArray221[local91] = 8;
								}
								Static431.anIntArray490[local91] = local52.anInt7327;
							}
							local531--;
							local91++;
						}
						if (!local18[arg8 + 3 & 0x3]) {
							arg9[3] = Static221.aBooleanArrayArray4[local69][local500 + 1 & 0x3];
						}
					} else if (!local18[arg8 + 3 & 0x3]) {
						arg9[3] = Static290.aBooleanArrayArray5[local69][local500 + 1 & 0x3];
					}
				}
			}
		}
		if (arg12 < arg1 - 1) {
			local42 = arg10[arg12 + 1][arg4] & 0xFF;
			if (local42 > 0) {
				local52 = this.aClass241_13.method5222(local42 - 1);
				if (local52.anInt7321 != -1) {
					local69 = arg5[arg12 + 1][arg4];
					local500 = arg6[arg12 + 1][arg4];
					if (local52.aBoolean800) {
						local91 = 4;
						local531 = local500 * 2 + 6;
						local536 = Static389.method5096(arg0, local52);
						for (local538 = 0; local538 < 3; local538++) {
							local531 &= 0x7;
							local91 &= 0x7;
							if (Static73.aBooleanArrayArray2[local69][local531] && Static431.anIntArray490[local91] <= local52.anInt7327) {
								Static381.anIntArray426[local91] = local52.anInt7321;
								Static179.anIntArray204[local91] = local536;
								Static251.anIntArray299[local91] = arg0.method5772() ? local52.anInt7322 : local52.anInt7328;
								Static271.anIntArray468[local91] = local52.anInt7324;
								if (local52.anInt7327 == Static431.anIntArray490[local91]) {
									Static195.anIntArray221[local91] |= 0x4;
								} else {
									Static195.anIntArray221[local91] = 4;
								}
								Static431.anIntArray490[local91] = local52.anInt7327;
							}
							local91--;
							local531++;
						}
						if (!local18[arg8 + 1 & 0x3]) {
							arg9[1] = Static221.aBooleanArrayArray4[local69][local500 + 3 & 0x3];
						}
					} else if (!local18[arg8 + 1 & 0x3]) {
						arg9[1] = Static290.aBooleanArrayArray5[local69][local500 + 3 & 0x3];
					}
				}
			}
		}
		if (arg11 == null) {
			return;
		}
		local42 = Static389.method5096(arg0, arg11);
		if (!arg11.aBoolean800) {
			return;
		}
		for (@Pc(1219) int local1219 = 0; local1219 < 8; local1219++) {
			@Pc(1230) int local1230 = local1219 - arg8 * 2 & 0x7;
			if (Static73.aBooleanArrayArray2[arg2][local1219] && arg11.anInt7327 >= Static431.anIntArray490[local1230]) {
				Static381.anIntArray426[local1230] = arg11.anInt7321;
				Static179.anIntArray204[local1230] = local42;
				Static251.anIntArray299[local1230] = arg0.method5772() ? arg11.anInt7322 : arg11.anInt7328;
				Static271.anIntArray468[local1230] = arg11.anInt7324;
				if (arg11.anInt7327 == Static431.anIntArray490[local1230]) {
					Static195.anIntArray221[local1230] |= 0x2;
				} else {
					Static195.anIntArray221[local1230] = 2;
				}
				Static431.anIntArray490[local1230] = arg11.anInt7327;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIBIILclient!ug;II[Lclient!as;I)V")
	public final void method5000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1_Sub28 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class14[] arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg1 & 0x7) * 8;
		@Pc(20) int local20;
		@Pc(50) int local50;
		if (!this.aBoolean703) {
			@Pc(18) Class14 local18 = arg7[arg5];
			for (local20 = 0; local20 < 8; local20++) {
				for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
					@Pc(38) int local38 = Static226.method3260(local24 & 0x7, arg2, local20 & 0x7) + arg8;
					local50 = Static294.method4029(arg2, local24 & 0x7, local20 & 0x7) + arg6;
					if (local38 > 0 && this.anInt6370 - 1 > local38 && local50 > 0 && this.anInt6371 - 1 > local50) {
						local18.method268(local38, local50);
					}
				}
			}
		}
		@Pc(101) int local101 = (arg3 & 0x7) * 8;
		@Pc(107) int local107 = (arg1 & 0x1FFFFFF8) << 3;
		local20 = (arg3 & 0xFFFFFFF8) << 3;
		@Pc(127) byte local127 = 0;
		@Pc(129) byte local129 = 0;
		if (arg2 == 1) {
			local129 = 1;
		} else if (arg2 == 2) {
			local127 = 1;
			local129 = 1;
		} else if (arg2 == 3) {
			local127 = 1;
		}
		for (local50 = 0; local50 < this.anInt6368; local50++) {
			for (@Pc(160) int local160 = 0; local160 < 64; local160++) {
				for (@Pc(164) int local164 = 0; local164 < 64; local164++) {
					if (arg0 == local50 && local11 <= local160 && local160 <= local11 + 8 && local164 >= local101 && local101 + 8 >= local164) {
						@Pc(233) int local233;
						@Pc(225) int local225;
						if (local11 + 8 == local160 || local101 + 8 == local164) {
							if (arg2 == 0) {
								local225 = arg6 + local164 - local101;
								local233 = local160 + arg8 - local11;
							} else if (arg2 == 1) {
								local225 = local11 + arg6 + 8 - local160;
								local233 = local164 + arg8 - local101;
							} else if (arg2 == 2) {
								local233 = local11 + arg8 + 8 - local160;
								local225 = local101 + arg6 + 8 - local164;
							} else {
								local225 = local160 + arg6 - local11;
								local233 = arg8 + local101 + 8 - local164;
							}
							this.method4993(local160 + local107, local164 + local20, 0, 0, arg5, 0, true, arg4, local233, local225);
						} else {
							local233 = Static226.method3260(local164 & 0x7, arg2, local160 & 0x7) + arg8;
							local225 = arg6 + Static294.method4029(arg2, local164 & 0x7, local160 & 0x7);
							this.method4993(local160 + local107, local164 + local20, local127, local129, arg5, arg2, false, arg4, local233, local225);
							if (local160 == 63 || local164 == 63) {
								@Pc(370) int local370 = local160 == 63 ? 64 : local160;
								@Pc(379) int local379 = local164 == 63 ? 64 : local164;
								@Pc(401) int local401;
								@Pc(409) int local409;
								if (arg2 == 0) {
									local409 = local379 + arg6 - local101;
									local401 = local370 + arg8 - local11;
								} else if (arg2 == 1) {
									local409 = arg6 + local11 + 8 - local370;
									local401 = local379 + arg8 - local101;
								} else if (arg2 == 2) {
									local401 = local11 + arg8 + 8 - local370;
									local409 = arg6 + local101 + 8 - local379;
								} else {
									local401 = local101 + arg8 + 8 - local379;
									local409 = arg6 + local370 - local11;
								}
								if (local401 >= 0 && local401 < this.anInt6370 && local409 >= 0 && local409 < this.anInt6371) {
									this.anIntArrayArrayArray12[arg5][local401][local409] = this.anIntArrayArrayArray12[arg5][local233 + local127][local225 + local129];
								}
							}
						}
					} else {
						this.method4993(0, 0, 0, 0, 0, 0, false, arg4, -1, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIII)V")
	public final void method5001(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6368; local3++) {
			this.method4991(arg0, arg1, local3);
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(BLclient!ya;Lclient!ya;Lclient!za;)V")
	public final void method5003(@OriginalArg(1) Class157 arg0, @OriginalArg(2) Class157 arg1, @OriginalArg(3) Class34 arg2) {
		if (Static153.anIntArray178 == null || this.anInt6371 != Static153.anIntArray178.length) {
			Static72.anIntArray65 = new int[this.anInt6371];
			Static153.anIntArray178 = new int[this.anInt6371];
			Static245.anIntArray293 = new int[this.anInt6371];
			Static97.anIntArray122 = new int[this.anInt6371];
			Static245.anIntArray294 = new int[this.anInt6371];
		}
		@Pc(42) int[][] local42 = new int[this.anInt6370][this.anInt6371];
		@Pc(48) int local48;
		for (@Pc(44) int local44 = 0; local44 < this.anInt6368; local44++) {
			for (local48 = 0; local48 < this.anInt6371; local48++) {
				Static153.anIntArray178[local48] = 0;
				Static245.anIntArray294[local48] = 0;
				Static97.anIntArray122[local48] = 0;
				Static72.anIntArray65[local48] = 0;
				Static245.anIntArray293[local48] = 0;
			}
			for (@Pc(81) int local81 = -5; local81 < this.anInt6370; local81++) {
				@Pc(91) int local91;
				@Pc(110) int local110;
				@Pc(179) int local179;
				for (@Pc(85) int local85 = 0; local85 < this.anInt6371; local85++) {
					local91 = local81 + 5;
					@Pc(159) int local159;
					if (this.anInt6370 > local91) {
						local110 = this.aByteArrayArrayArray21[local44][local91][local85] & 0xFF;
						if (local110 > 0) {
							@Pc(123) Class91 local123 = this.aClass245_7.method5325(local110 - 1);
							Static153.anIntArray178[local85] += local123.anInt2356;
							Static245.anIntArray294[local85] += local123.anInt2358;
							Static97.anIntArray122[local85] += local123.anInt2362;
							Static72.anIntArray65[local85] += local123.anInt2357;
							local159 = Static245.anIntArray293[local85]++;
						}
					}
					local110 = local81 - 5;
					if (local110 >= 0) {
						local179 = this.aByteArrayArrayArray21[local44][local110][local85] & 0xFF;
						if (local179 > 0) {
							@Pc(189) Class91 local189 = this.aClass245_7.method5325(local179 - 1);
							Static153.anIntArray178[local85] -= local189.anInt2356;
							Static245.anIntArray294[local85] -= local189.anInt2358;
							Static97.anIntArray122[local85] -= local189.anInt2362;
							Static72.anIntArray65[local85] -= local189.anInt2357;
							local159 = Static245.anIntArray293[local85]--;
						}
					}
				}
				if (local81 >= 0) {
					local91 = 0;
					local110 = 0;
					local179 = 0;
					@Pc(246) int local246 = 0;
					@Pc(248) int local248 = 0;
					for (@Pc(250) int local250 = -5; local250 < this.anInt6371; local250++) {
						@Pc(256) int local256 = local250 + 5;
						if (this.anInt6371 > local256) {
							local110 += Static245.anIntArray294[local256];
							local91 += Static153.anIntArray178[local256];
							local248 += Static245.anIntArray293[local256];
							local179 += Static97.anIntArray122[local256];
							local246 += Static72.anIntArray65[local256];
						}
						@Pc(294) int local294 = local250 - 5;
						if (local294 >= 0) {
							local246 -= Static72.anIntArray65[local294];
							local179 -= Static97.anIntArray122[local294];
							local91 -= Static153.anIntArray178[local294];
							local110 -= Static245.anIntArray294[local294];
							local248 -= Static245.anIntArray293[local294];
						}
						if (local250 >= 0 && local246 > 0 && local248 > 0) {
							local42[local81][local250] = Static417.method5541(local110 / local248, local179 / local248, local91 * 256 / local246);
						}
					}
				}
			}
			if (Static256.aBoolean530) {
				this.method4996(arg2, local44 == 0 ? arg0 : null, local44, local42, Static94.aClass157Array1[local44], local44 == 0 ? arg1 : null);
			} else {
				this.method4997(local44, local42, arg2, local44 == 0 ? arg1 : null, local44 == 0 ? arg0 : null, Static94.aClass157Array1[local44]);
			}
			this.aByteArrayArrayArray21[local44] = null;
			this.aByteArrayArrayArray16[local44] = null;
			this.aByteArrayArrayArray20[local44] = null;
			this.aByteArrayArrayArray18[local44] = null;
		}
		if (!this.aBoolean703) {
			if (Static321.anInt5491 != 0) {
				Static177.method2497();
			}
			if (Static194.aBoolean809) {
				Static288.method3952();
			}
		}
		for (local48 = 0; local48 < this.anInt6368; local48++) {
			Static94.aClass157Array1[local48].aa();
		}
	}
}
