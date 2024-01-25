import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public class Class113 {

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "[I")
	private final int[] anIntArray237 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "[I")
	private final int[] anIntArray236 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!ig", name = "A", descriptor = "I")
	public final int anInt3751;

	@OriginalMember(owner = "client!ig", name = "n", descriptor = "Lclient!ip;")
	private final Class117 aClass117_6;

	@OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
	protected final int anInt3749;

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
	protected final int anInt3739;

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "Lclient!io;")
	private final Class116 aClass116_5;

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "Z")
	public final boolean aBoolean242;

	@OriginalMember(owner = "client!ig", name = "q", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!ig", name = "v", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!ig", name = "z", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(IIIZLclient!ip;Lclient!io;)V")
	protected Class113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class117 arg4, @OriginalArg(5) Class116 arg5) {
		this.anInt3751 = arg0;
		this.aClass117_6 = arg4;
		this.anInt3749 = arg1;
		this.anInt3739 = arg2;
		this.aClass116_5 = arg5;
		this.aBoolean242 = arg3;
		this.aByteArrayArrayArray12 = new byte[this.anInt3751][this.anInt3749 + 1][this.anInt3739 + 1];
		this.aByteArrayArrayArray10 = new byte[this.anInt3751][this.anInt3749][this.anInt3739];
		this.anIntArrayArrayArray11 = new int[this.anInt3751][this.anInt3749 + 1][this.anInt3739 + 1];
		this.aByteArrayArrayArray11 = new byte[this.anInt3751][this.anInt3749][this.anInt3739];
		this.aByteArrayArrayArray13 = new byte[this.anInt3751][this.anInt3749][this.anInt3739];
		this.aByteArrayArrayArray14 = new byte[this.anInt3751][this.anInt3749][this.anInt3739];
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIII)V")
	private void method2963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = arg2; local7 < arg2 + 64; local7++) {
			for (local11 = arg0; local11 < arg0 + 64; local11++) {
				if (local11 >= 0 && this.anInt3749 > local11 && local7 >= 0 && this.anInt3739 > local7) {
					this.anIntArrayArrayArray11[arg1][local11][local7] = arg1 > 0 ? this.anIntArrayArrayArray11[arg1 - 1][local11][local7] - 240 : 0;
				}
			}
		}
		if (arg0 > 0 && arg0 < this.anInt3749) {
			for (local11 = arg2 + 1; local11 < arg2 + 64; local11++) {
				if (local11 >= 0 && local11 < this.anInt3739) {
					this.anIntArrayArrayArray11[arg1][arg0][local11] = this.anIntArrayArrayArray11[arg1][arg0 - 1][local11];
				}
			}
		}
		if (arg2 > 0 && this.anInt3739 > arg2) {
			for (local11 = arg0 + 1; local11 < arg0 + 64; local11++) {
				if (local11 >= 0 && this.anInt3749 > local11) {
					this.anIntArrayArrayArray11[arg1][local11][arg2] = this.anIntArrayArrayArray11[arg1][local11][arg2 - 1];
				}
			}
		}
		if (arg0 < 0 || arg2 < 0 || this.anInt3749 <= arg0 || arg2 >= this.anInt3739) {
			return;
		}
		if (arg1 == 0) {
			if (arg0 > 0 && this.anIntArrayArrayArray11[arg1][arg0 - 1][arg2] != 0) {
				this.anIntArrayArrayArray11[arg1][arg0][arg2] = this.anIntArrayArrayArray11[arg1][arg0 - 1][arg2];
			} else if (arg2 > 0 && this.anIntArrayArrayArray11[arg1][arg0][arg2 - 1] != 0) {
				this.anIntArrayArrayArray11[arg1][arg0][arg2] = this.anIntArrayArrayArray11[arg1][arg0][arg2 - 1];
			} else if (arg0 > 0 && arg2 > 0 && this.anIntArrayArrayArray11[arg1][arg0 - 1][arg2 - 1] != 0) {
				this.anIntArrayArrayArray11[arg1][arg0][arg2] = this.anIntArrayArrayArray11[arg1][arg0 - 1][arg2 - 1];
			}
		} else if (arg0 > 0 && this.anIntArrayArrayArray11[arg1][arg0 - 1][arg2] != this.anIntArrayArrayArray11[arg1 - 1][arg0 - 1][arg2]) {
			this.anIntArrayArrayArray11[arg1][arg0][arg2] = this.anIntArrayArrayArray11[arg1][arg0 - 1][arg2];
		} else if (arg2 > 0 && this.anIntArrayArrayArray11[arg1][arg0][arg2 - 1] != this.anIntArrayArrayArray11[arg1 - 1][arg0][arg2 - 1]) {
			this.anIntArrayArrayArray11[arg1][arg0][arg2] = this.anIntArrayArrayArray11[arg1][arg0][arg2 - 1];
		} else if (arg0 > 0 && arg2 > 0 && this.anIntArrayArrayArray11[arg1][arg0 - 1][arg2 - 1] != this.anIntArrayArrayArray11[arg1 - 1][arg0 - 1][arg2 - 1]) {
			this.anIntArrayArrayArray11[arg1][arg0][arg2] = this.anIntArrayArrayArray11[arg1][arg0 - 1][arg2 - 1];
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI[[I)V")
	public final void method2964(@OriginalArg(2) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray11[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt3749 + 1; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt3739 + 1; local16++) {
				local10[local12][local16] += arg0[local12][local16];
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIIILclient!fh;ZII)V")
	private void method2966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class5_Sub15 arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg5 == 1) {
			arg4 = 1;
		} else if (arg5 == 2) {
			arg4 = 1;
			arg0 = 1;
		} else if (arg5 == 3) {
			arg0 = 1;
		}
		@Pc(65) int local65;
		if (arg2 < 0 || this.anInt3749 <= arg2 || arg3 < 0 || this.anInt3739 <= arg3) {
			while (true) {
				local65 = arg6.method5539();
				if (local65 == 0) {
					return;
				}
				if (local65 == 1) {
					arg6.method5539();
					return;
				}
				if (local65 <= 49) {
					arg6.method5539();
				}
			}
			return;
		}
		if (!this.aBoolean242 && !arg7) {
			Static452.aByteArrayArrayArray16[arg9][arg2][arg3] = 0;
		}
		while (true) {
			local65 = arg6.method5539();
			if (local65 == 0) {
				if (this.aBoolean242) {
					this.anIntArrayArrayArray11[0][arg0 + arg2][arg3 + arg4] = 0;
					return;
				} else if (arg9 == 0) {
					this.anIntArrayArrayArray11[0][arg2 + arg0][arg4 + arg3] = -Static390.method5093(arg8 + 932731, arg1 + 556238) * 8 << 0;
					return;
				} else {
					this.anIntArrayArrayArray11[arg9][arg0 + arg2][arg3 + arg4] = this.anIntArrayArrayArray11[arg9 - 1][arg0 + arg2][arg3 + arg4] - 240;
					return;
				}
			}
			if (local65 == 1) {
				@Pc(155) int local155 = arg6.method5539();
				if (this.aBoolean242) {
					this.anIntArrayArrayArray11[0][arg0 + arg2][arg3 + arg4] = local155 * 8 << 0;
					return;
				}
				if (local155 == 1) {
					local155 = 0;
				}
				if (arg9 != 0) {
					this.anIntArrayArrayArray11[arg9][arg0 + arg2][arg3 + arg4] = this.anIntArrayArrayArray11[arg9 - 1][arg0 + arg2][arg4 + arg3] - (local155 * 8 << 0);
					return;
				}
				this.anIntArrayArrayArray11[0][arg2 + arg0][arg4 + arg3] = -local155 * 8 << 0;
				return;
			}
			if (local65 <= 49) {
				if (arg7) {
					arg6.method5539();
				} else {
					this.aByteArrayArrayArray13[arg9][arg2][arg3] = arg6.method5600();
					this.aByteArrayArrayArray11[arg9][arg2][arg3] = (byte) ((local65 - 2) / 4);
					this.aByteArrayArrayArray14[arg9][arg2][arg3] = (byte) (local65 + arg5 - 2 & 0x3);
				}
			} else if (local65 <= 81) {
				if (!this.aBoolean242 && !arg7) {
					Static452.aByteArrayArrayArray16[arg9][arg2][arg3] = (byte) (local65 - 49);
				}
			} else if (!arg7) {
				this.aByteArrayArrayArray10[arg9][arg2][arg3] = (byte) (local65 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!ya;BLclient!ya;Lclient!za;)V")
	public final void method2967(@OriginalArg(0) Class125 arg0, @OriginalArg(2) Class125 arg1, @OriginalArg(3) Class200 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt3749][this.anInt3739];
		if (Static273.anIntArray337 == null || Static273.anIntArray337.length != this.anInt3739) {
			Static205.anIntArray207 = new int[this.anInt3739];
			Static410.anIntArray466 = new int[this.anInt3739];
			Static273.anIntArray337 = new int[this.anInt3739];
			Static286.anIntArray346 = new int[this.anInt3739];
			Static236.anIntArray248 = new int[this.anInt3739];
		}
		@Pc(44) int local44;
		for (@Pc(40) int local40 = 0; local40 < this.anInt3751; local40++) {
			for (local44 = 0; local44 < this.anInt3739; local44++) {
				Static273.anIntArray337[local44] = 0;
				Static286.anIntArray346[local44] = 0;
				Static236.anIntArray248[local44] = 0;
				Static410.anIntArray466[local44] = 0;
				Static205.anIntArray207[local44] = 0;
			}
			for (@Pc(77) int local77 = -5; local77 < this.anInt3749; local77++) {
				@Pc(87) int local87;
				@Pc(102) int local102;
				@Pc(168) int local168;
				for (@Pc(81) int local81 = 0; local81 < this.anInt3739; local81++) {
					local87 = local77 + 5;
					@Pc(148) int local148;
					if (this.anInt3749 > local87) {
						local102 = this.aByteArrayArrayArray10[local40][local87][local81] & 0xFF;
						if (local102 > 0) {
							@Pc(112) Class89 local112 = this.aClass116_5.method2452(local102 - 1);
							Static273.anIntArray337[local81] += local112.anInt2404;
							Static286.anIntArray346[local81] += local112.anInt2406;
							Static236.anIntArray248[local81] += local112.anInt2414;
							Static410.anIntArray466[local81] += local112.anInt2417;
							local148 = Static205.anIntArray207[local81]++;
						}
					}
					local102 = local77 - 5;
					if (local102 >= 0) {
						local168 = this.aByteArrayArrayArray10[local40][local102][local81] & 0xFF;
						if (local168 > 0) {
							@Pc(178) Class89 local178 = this.aClass116_5.method2452(local168 - 1);
							Static273.anIntArray337[local81] -= local178.anInt2404;
							Static286.anIntArray346[local81] -= local178.anInt2406;
							Static236.anIntArray248[local81] -= local178.anInt2414;
							Static410.anIntArray466[local81] -= local178.anInt2417;
							local148 = Static205.anIntArray207[local81]--;
						}
					}
				}
				if (local77 >= 0) {
					local87 = 0;
					local102 = 0;
					local168 = 0;
					@Pc(235) int local235 = 0;
					@Pc(237) int local237 = 0;
					for (@Pc(239) int local239 = -5; local239 < this.anInt3739; local239++) {
						@Pc(245) int local245 = local239 + 5;
						if (local245 < this.anInt3739) {
							local168 += Static236.anIntArray248[local245];
							local87 += Static273.anIntArray337[local245];
							local237 += Static205.anIntArray207[local245];
							local235 += Static410.anIntArray466[local245];
							local102 += Static286.anIntArray346[local245];
						}
						@Pc(287) int local287 = local239 - 5;
						if (local287 >= 0) {
							local237 -= Static205.anIntArray207[local287];
							local87 -= Static273.anIntArray337[local287];
							local235 -= Static410.anIntArray466[local287];
							local168 -= Static236.anIntArray248[local287];
							local102 -= Static286.anIntArray346[local287];
						}
						if (local239 >= 0 && local235 > 0 && local237 > 0) {
							local11[local77][local239] = Static14.method261(local168 / local237, local102 / local237, local87 * 256 / local235);
						}
					}
				}
			}
			if (Static233.aBoolean246) {
				this.method2968(local40 == 0 ? arg1 : null, arg2, local40 == 0 ? arg0 : null, Static410.aClass125Array3[local40], local40, local11);
			} else {
				this.method2970(local40 == 0 ? arg0 : null, Static410.aClass125Array3[local40], local40, local40 == 0 ? arg1 : null, arg2, local11);
			}
			this.aByteArrayArrayArray10[local40] = null;
			this.aByteArrayArrayArray13[local40] = null;
			this.aByteArrayArrayArray11[local40] = null;
			this.aByteArrayArrayArray14[local40] = null;
		}
		if (!this.aBoolean242) {
			if (Static49.anInt896 != 0) {
				Static85.method1257();
			}
			if (Static20.aBoolean37) {
				Static14.method260();
			}
		}
		for (local44 = 0; local44 < this.anInt3751; local44++) {
			Static410.aClass125Array3[local44].aa();
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!ya;Lclient!za;Lclient!ya;Lclient!ya;I[[I)V")
	private void method2968(@OriginalArg(1) Class125 arg0, @OriginalArg(2) Class200 arg1, @OriginalArg(3) Class125 arg2, @OriginalArg(4) Class125 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray11[arg4];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray14[arg4];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray10[arg4];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray13[arg4];
		for (@Pc(27) int local27 = 0; local27 < this.anInt3749; local27++) {
			@Pc(45) int local45 = local27 >= this.anInt3749 - 1 ? local27 : local27 + 1;
			for (@Pc(47) int local47 = 0; local47 < this.anInt3739; local47++) {
				@Pc(61) int local61 = local47 >= this.anInt3739 - 1 ? local47 : local47 + 1;
				if (Static304.anInt4779 == -1 || Static364.method4712(arg4, local27, local47, Static304.anInt4779)) {
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
						@Pc(154) Class130 local154 = local100 == 0 ? null : this.aClass117_6.method2462(local100 - 1);
						@Pc(166) Class89 local166 = local108 == 0 ? null : this.aClass116_5.method2452(local108 - 1);
						if (local86 == 0 && local154 == null) {
							local86 = 12;
						}
						@Pc(177) Class130 local177 = local154;
						if (local154 != null) {
							if (local154.anInt3450 == -1 && local154.anInt3452 == -1) {
								local177 = local154;
								local154 = null;
							} else if (local166 != null && local86 != 0) {
								local77 = local154.aBoolean219;
							}
						}
						@Pc(268) int local268;
						@Pc(302) int local302;
						@Pc(378) int local378;
						@Pc(391) int local391;
						if ((local86 == 0 || local86 == 12) && local27 > 0 && local47 > 0 && this.anInt3749 > local27 && this.anInt3739 > local47) {
							@Pc(251) int local251 = local108 == local20[local45][local61] ? 1 : -1;
							local268 = local108 == local20[local27 - 1][local47 - 1] ? 1 : -1;
							@Pc(287) int local287 = local108 == local20[local45][local47 - 1] ? 1 : -1;
							local302 = local108 == local20[local27 - 1][local61] ? 1 : -1;
							if (local108 == local20[local27][local47 - 1]) {
								local268++;
								local287++;
							} else {
								local287--;
								local268--;
							}
							if (local20[local45][local47] == local108) {
								local287++;
								local251++;
							} else {
								local287--;
								local251--;
							}
							if (local20[local27][local61] == local108) {
								local302++;
								local251++;
							} else {
								local302--;
								local251--;
							}
							if (local20[local27 - 1][local47] == local108) {
								local302++;
								local268++;
							} else {
								local302--;
								local268--;
							}
							local378 = local268 - local251;
							if (local378 < 0) {
								local378 = -local378;
							}
							local391 = local287 - local302;
							if (local391 < 0) {
								local391 = -local391;
							}
							if (local391 == local378) {
								local378 = arg3.ua(local27, local47) - arg3.ua(local45, local61);
								local391 = arg3.ua(local45, local47) - arg3.ua(local27, local61);
								if (local378 < 0) {
									local378 = -local378;
								}
								if (local391 < 0) {
									local391 = -local391;
								}
							}
							local92 = local391 > local378 ? 1 : 0;
						}
						for (local268 = 0; local268 < 13; local268++) {
							Static44.anIntArray39[local268] = -1;
							Static366.anIntArray425[local268] = 1;
						}
						@Pc(470) boolean[] local470 = local154 != null && local154.aBoolean219 ? Static199.aBooleanArrayArray5[local86] : Static445.aBooleanArrayArray3[local86];
						this.method2972(this.anInt3739, arg1, local27, this.anInt3749, local10, local154, local92, local15, local25, local166, local80, local86, local47);
						@Pc(499) boolean local499 = local154 != null && local154.anInt3450 != local154.anInt3452;
						if (!local499) {
							for (local302 = 0; local302 < 8; local302++) {
								if (Static44.anIntArray39[local302] >= 0 && Static364.anIntArray424[local302] != Static105.anIntArray84[local302]) {
									local499 = true;
									break;
								}
							}
						}
						if (!local470[local92 + 1 & 0x3]) {
							local80[1] = Static124.method1754(local80[1], (Static366.anIntArray425[2] & Static366.anIntArray425[4]) == 0);
						}
						if (!local470[local92 + 3 & 0x3]) {
							local80[3] = Static124.method1754(local80[3], (Static366.anIntArray425[0] & Static366.anIntArray425[6]) == 0);
						}
						if (!local470[local92 & 0x3]) {
							local80[0] = Static124.method1754(local80[0], (Static366.anIntArray425[2] & Static366.anIntArray425[0]) == 0);
						}
						if (!local470[local92 + 2 & 0x3]) {
							local80[2] = Static124.method1754(local80[2], (Static366.anIntArray425[6] & Static366.anIntArray425[4]) == 0);
						}
						if (!local77 && (local86 == 0 || local86 == 12)) {
							if (local80[0] && !local80[1] && !local80[2] && local80[3]) {
								local80[0] = local80[3] = false;
								local92 = 0;
								local86 = local86 == 0 ? 13 : 14;
							} else if (local80[0] && local80[1] && !local80[2] && !local80[3]) {
								local86 = local86 == 0 ? 13 : 14;
								local92 = 3;
								local80[0] = local80[1] = false;
							} else if (!local80[0] && local80[1] && local80[2] && !local80[3]) {
								local92 = 2;
								local80[1] = local80[2] = false;
								local86 = local86 == 0 ? 13 : 14;
							} else if (!local80[0] && !local80[1] && local80[2] && local80[3]) {
								local92 = 1;
								local80[2] = local80[3] = false;
								local86 = local86 == 0 ? 13 : 14;
							}
						}
						@Pc(809) boolean local809 = !local77 && !local80[0] && !local80[2] && !local80[1] && !local80[3];
						@Pc(811) int[] local811 = null;
						@Pc(839) int[] local839;
						@Pc(827) int[] local827;
						@Pc(843) int[] local843;
						if (local809) {
							local827 = Static41.anIntArrayArray4[local86];
							local839 = Static172.anIntArrayArray29[local86];
							local843 = Static123.anIntArrayArray12[local86];
							local378 = local166 == null ? 0 : Static348.anIntArray402[local86];
							local391 = local154 == null ? 0 : Static428.anIntArray483[local86];
						} else if (local77) {
							local827 = Static410.anIntArrayArray61[local86];
							local391 = local154 == null ? 0 : Static5.anIntArray5[local86];
							local811 = Static314.anIntArrayArray48[local86];
							local839 = Static218.anIntArrayArray46[local86];
							local378 = local166 == null ? 0 : Static55.anIntArray45[local86];
							local843 = Static130.anIntArrayArray14[local86];
						} else {
							local391 = local154 == null ? 0 : Static83.anIntArray73[local86];
							local827 = Static159.anIntArrayArray16[local86];
							local378 = local166 == null ? 0 : Static228.anIntArray242[local86];
							local839 = Static390.anIntArrayArray58[local86];
							local843 = Static308.anIntArrayArray47[local86];
							local811 = Static365.anIntArrayArray54[local86];
						}
						@Pc(914) int local914 = local391 + local378;
						if (local914 <= 0) {
							Static40.method656(arg4, local27, local47);
						} else {
							if (local80[0]) {
								local914++;
							}
							if (local80[2]) {
								local914++;
							}
							if (local80[1]) {
								local914++;
							}
							if (local80[3]) {
								local914++;
							}
							@Pc(944) int local944 = 0;
							@Pc(946) int local946 = 0;
							@Pc(950) int local950 = local914 * 3;
							@Pc(957) int[] local957 = local499 ? new int[local950] : null;
							@Pc(960) int[] local960 = new int[local950];
							@Pc(963) int[] local963 = new int[local950];
							@Pc(966) int[] local966 = new int[local950];
							@Pc(969) int[] local969 = new int[local950];
							@Pc(972) int[] local972 = new int[local950];
							@Pc(979) int[] local979 = arg2 == null ? null : new int[local950];
							@Pc(988) int[] local988 = arg2 == null && arg0 == null ? null : new int[local950];
							@Pc(990) int local990 = -1;
							@Pc(992) int local992 = -1;
							@Pc(994) int local994 = 256;
							@Pc(1124) byte local1124;
							@Pc(1046) int local1046;
							@Pc(1048) int local1048;
							@Pc(1280) int local1280;
							@Pc(1286) int local1286;
							@Pc(1295) int local1295;
							@Pc(1300) int local1300;
							@Pc(1322) int local1322;
							@Pc(1305) int local1305;
							@Pc(1324) int local1324;
							@Pc(1373) int local1373;
							@Pc(1380) int local1380;
							if (local154 != null) {
								local990 = local154.anInt3450;
								local992 = arg1.method5832() ? local154.anInt3445 : local154.anInt3440;
								local994 = local154.anInt3449;
								local1046 = Static259.method3337(arg1, local154);
								for (local1048 = 0; local1048 < local391; local1048++) {
									if (local80[-local92 & 0x3] && local944 == local811[0]) {
										Static118.anIntArray112[0] = local839[local944];
										Static118.anIntArray112[1] = 1;
										Static118.anIntArray112[2] = local843[local944];
										Static118.anIntArray112[3] = 1;
										Static118.anIntArray112[4] = local827[local944];
										Static118.anIntArray112[5] = local843[local944];
										local1124 = 6;
									} else if (local80[2 - local92 & 0x3] && local944 == local811[2]) {
										Static118.anIntArray112[0] = local839[local944];
										Static118.anIntArray112[1] = 5;
										Static118.anIntArray112[2] = local843[local944];
										Static118.anIntArray112[3] = 5;
										Static118.anIntArray112[4] = local827[local944];
										Static118.anIntArray112[5] = local843[local944];
										local1124 = 6;
									} else if (local80[1 - local92 & 0x3] && local944 == local811[1]) {
										Static118.anIntArray112[0] = local839[local944];
										Static118.anIntArray112[1] = 3;
										Static118.anIntArray112[2] = local843[local944];
										Static118.anIntArray112[3] = 3;
										Static118.anIntArray112[4] = local827[local944];
										local1124 = 6;
										Static118.anIntArray112[5] = local843[local944];
									} else if (local80[3 - local92 & 0x3] && local944 == local811[3]) {
										Static118.anIntArray112[0] = local839[local944];
										Static118.anIntArray112[1] = 7;
										Static118.anIntArray112[2] = local843[local944];
										Static118.anIntArray112[3] = 7;
										Static118.anIntArray112[4] = local827[local944];
										local1124 = 6;
										Static118.anIntArray112[5] = local843[local944];
									} else {
										Static118.anIntArray112[0] = local839[local944];
										Static118.anIntArray112[1] = local827[local944];
										Static118.anIntArray112[2] = local843[local944];
										local1124 = 3;
									}
									for (local1280 = 0; local1280 < local1124; local1280++) {
										local1286 = Static118.anIntArray112[local1280];
										local1295 = local1286 - local92 * 2 & 0x7;
										local1300 = this.anIntArray237[local1286];
										local1305 = this.anIntArray236[local1286];
										if (local92 == 1) {
											local1324 = 128 - local1300;
											local1322 = local1305;
										} else if (local92 == 2) {
											local1324 = 128 - local1305;
											local1322 = 128 - local1300;
										} else if (local92 == 3) {
											local1322 = 128 - local1305;
											local1324 = local1300;
										} else {
											local1322 = local1300;
											local1324 = local1305;
										}
										local960[local946] = local1322;
										local963[local946] = local1324;
										if (local979 != null && Static167.aBooleanArrayArray4[local86][local1286]) {
											local1373 = (local27 << 7) + local1322;
											local1380 = (local47 << 7) + local1324;
											local979[local946] = arg2.ca(local1373, local1380) - arg3.ca(local1373, local1380);
										}
										if (local988 != null) {
											if (arg2 != null && !Static167.aBooleanArrayArray4[local86][local1286]) {
												local1373 = local1322 + (local27 << 7);
												local1380 = (local47 << 7) + local1324;
												local988[local946] = arg3.ca(local1373, local1380) - arg2.ca(local1373, local1380);
											} else if (arg0 != null && !Static319.aBooleanArrayArray7[local86][local1286]) {
												local1373 = (local27 << 7) + local1322;
												local1380 = (local47 << 7) + local1324;
												local988[local946] = arg0.ca(local1373, local1380) - arg3.ca(local1373, local1380);
											}
										}
										if (local1286 < 8 && local154.anInt3444 < Static44.anIntArray39[local1295]) {
											if (local957 != null) {
												local957[local946] = Static364.anIntArray424[local1295];
											}
											local972[local946] = Static338.anIntArray392[local1295];
											local969[local946] = Static251.anIntArray260[local1295];
											local966[local946] = Static105.anIntArray84[local1295];
										} else {
											if (local957 != null) {
												local957[local946] = local1046;
											}
											local969[local946] = arg1.method5832() ? local154.anInt3445 : local154.anInt3440;
											local972[local946] = local154.anInt3449;
											local966[local946] = local990;
										}
										local946++;
									}
									local944++;
								}
								if (!this.aBoolean242 && arg4 == 0) {
									Static435.method5737(local27, local47, local154.anInt3446, local154.anInt3442 * 8, local154.anInt3447);
								}
								if (local86 != 12 && local154.anInt3450 != -1 && local154.aBoolean221) {
									local75 = true;
								}
							} else if (local809) {
								local944 = Static428.anIntArray483[local86];
							} else if (local77) {
								local944 = Static5.anIntArray5[local86];
							} else {
								local944 = Static83.anIntArray73[local86];
							}
							if (local166 != null) {
								if (local124 == 0) {
									local124 = local108;
								}
								if (local132 == 0) {
									local132 = local108;
								}
								if (local116 == 0) {
									local116 = local108;
								}
								@Pc(1599) Class89 local1599 = this.aClass116_5.method2452(local108 - 1);
								@Pc(1607) Class89 local1607 = this.aClass116_5.method2452(local116 - 1);
								@Pc(1615) Class89 local1615 = this.aClass116_5.method2452(local124 - 1);
								@Pc(1623) Class89 local1623 = this.aClass116_5.method2452(local132 - 1);
								for (local1295 = 0; local1295 < local378; local1295++) {
									if (local80[-local92 & 0x3] && local944 == local811[0]) {
										Static118.anIntArray112[0] = local839[local944];
										Static118.anIntArray112[1] = 1;
										Static118.anIntArray112[2] = local843[local944];
										Static118.anIntArray112[3] = 1;
										Static118.anIntArray112[4] = local827[local944];
										local1124 = 6;
										Static118.anIntArray112[5] = local843[local944];
									} else if (local80[2 - local92 & 0x3] && local944 == local811[2]) {
										Static118.anIntArray112[0] = local839[local944];
										Static118.anIntArray112[1] = 5;
										Static118.anIntArray112[2] = local843[local944];
										Static118.anIntArray112[3] = 5;
										Static118.anIntArray112[4] = local827[local944];
										local1124 = 6;
										Static118.anIntArray112[5] = local843[local944];
									} else if (local80[1 - local92 & 0x3] && local944 == local811[1]) {
										Static118.anIntArray112[0] = local839[local944];
										Static118.anIntArray112[1] = 3;
										Static118.anIntArray112[2] = local843[local944];
										Static118.anIntArray112[3] = 3;
										Static118.anIntArray112[4] = local827[local944];
										local1124 = 6;
										Static118.anIntArray112[5] = local843[local944];
									} else if (local80[3 - local92 & 0x3] && local811[3] == local944) {
										Static118.anIntArray112[0] = local839[local944];
										Static118.anIntArray112[1] = 7;
										Static118.anIntArray112[2] = local843[local944];
										Static118.anIntArray112[3] = 7;
										Static118.anIntArray112[4] = local827[local944];
										local1124 = 6;
										Static118.anIntArray112[5] = local843[local944];
									} else {
										Static118.anIntArray112[0] = local839[local944];
										Static118.anIntArray112[1] = local827[local944];
										Static118.anIntArray112[2] = local843[local944];
										local1124 = 3;
									}
									local944++;
									for (local1300 = 0; local1300 < local1124; local1300++) {
										local1322 = Static118.anIntArray112[local1300];
										local1305 = local1322 - local92 * 2 & 0x7;
										local1324 = this.anIntArray237[local1322];
										local1380 = this.anIntArray236[local1322];
										@Pc(1888) int local1888;
										if (local92 == 1) {
											local1373 = local1380;
											local1888 = 128 - local1324;
										} else if (local92 == 2) {
											local1373 = 128 - local1324;
											local1888 = 128 - local1380;
										} else if (local92 == 3) {
											local1373 = 128 - local1380;
											local1888 = local1324;
										} else {
											local1888 = local1380;
											local1373 = local1324;
										}
										local960[local946] = local1373;
										local963[local946] = local1888;
										@Pc(1946) int local1946;
										@Pc(1953) int local1953;
										if (local979 != null && Static167.aBooleanArrayArray4[local86][local1322]) {
											local1946 = local1373 + (local27 << 7);
											local1953 = (local47 << 7) + local1888;
											local979[local946] = arg2.ca(local1946, local1953) - arg3.ca(local1946, local1953);
										}
										if (local988 != null) {
											if (arg2 != null && !Static167.aBooleanArrayArray4[local86][local1322]) {
												local1946 = local1373 + (local27 << 7);
												local1953 = local1888 + (local47 << 7);
												local988[local946] = arg3.ca(local1946, local1953) - arg2.ca(local1946, local1953);
											} else if (arg0 != null && !Static319.aBooleanArrayArray7[local86][local1322]) {
												local1946 = (local27 << 7) + local1373;
												local1953 = (local47 << 7) + local1888;
												local988[local946] = arg0.ca(local1946, local1953) - arg3.ca(local1946, local1953);
											}
										}
										if (local1322 < 8 && Static44.anIntArray39[local1305] >= 0) {
											if (local957 != null) {
												local957[local946] = Static364.anIntArray424[local1305];
											}
											local972[local946] = Static338.anIntArray392[local1305];
											local969[local946] = Static251.anIntArray260[local1305];
											local966[local946] = Static105.anIntArray84[local1305];
										} else {
											if (local77 && Static167.aBooleanArrayArray4[local86][local1322]) {
												local969[local946] = local992;
												local972[local946] = local994;
												local966[local946] = local990;
											} else if (local1373 == 0 && local1888 == 0) {
												local966[local946] = arg5[local27][local47];
												local969[local946] = local1599.anInt2408;
												local972[local946] = local1599.anInt2413;
											} else if (local1373 == 0 && local1888 == 128) {
												local966[local946] = arg5[local27][local61];
												local969[local946] = local1607.anInt2408;
												local972[local946] = local1607.anInt2413;
											} else if (local1373 == 128 && local1888 == 128) {
												local966[local946] = arg5[local45][local61];
												local969[local946] = local1615.anInt2408;
												local972[local946] = local1615.anInt2413;
											} else if (local1373 == 128 && local1888 == 0) {
												local966[local946] = arg5[local45][local47];
												local969[local946] = local1623.anInt2408;
												local972[local946] = local1623.anInt2413;
											} else {
												if (local1373 >= 64) {
													if (local1888 < 64) {
														local969[local946] = local1623.anInt2408;
														local972[local946] = local1623.anInt2413;
													} else {
														local969[local946] = local1615.anInt2408;
														local972[local946] = local1615.anInt2413;
													}
												} else if (local1888 >= 64) {
													local969[local946] = local1607.anInt2408;
													local972[local946] = local1607.anInt2413;
												} else {
													local969[local946] = local1599.anInt2408;
													local972[local946] = local1599.anInt2413;
												}
												local1946 = Static23.method403(arg5[local45][local47], arg5[local27][local47], local1373 << 7 >> 7);
												local1953 = Static23.method403(arg5[local45][local61], arg5[local27][local61], local1373 << 7 >> 7);
												local966[local946] = Static23.method403(local1953, local1946, local1888 << 7 >> 7);
											}
											if (local957 != null) {
												local957[local946] = local966[local946];
											}
										}
										local946++;
									}
								}
								if (local86 != 0 && local166.aBoolean164) {
									local75 = true;
								}
							}
							local1046 = arg3.ua(local27, local47);
							local1048 = arg3.ua(local45, local47);
							local1280 = arg3.ua(local45, local61);
							local1286 = arg3.ua(local27, local61);
							if (arg4 > 0) {
								@Pc(2367) boolean local2367 = true;
								if (local108 == 0 && local86 != 0) {
									local2367 = false;
								}
								if (local100 > 0 && local177 != null && !local177.aBoolean220) {
									local2367 = false;
								}
								if (local2367 && local1046 == local1048 && local1280 == local1046 && local1286 == local1046) {
									this.aByteArrayArrayArray12[arg4][local27][local47] = (byte) (this.aByteArrayArrayArray12[arg4][local27][local47] | 0x4);
								}
							}
							local1295 = 0;
							local1300 = 0;
							local1322 = 0;
							if (this.aBoolean242) {
								local1295 = Static193.method2593(local27, local47);
								local1300 = Static154.method5151(local27, local47);
								local1322 = Static30.method474(local27, local47);
							}
							arg3.pa(local27, local47, local960, local979, local963, local988, local966, local957, local969, local972, local1295, local1300, local1322, local75);
							Static40.method656(arg4, local27, local47);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIII)V")
	public final void method2969(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3751; local3++) {
			this.method2963(arg1, local3, arg0);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!ya;Lclient!ya;IILclient!ya;Lclient!za;[[I)V")
	private void method2970(@OriginalArg(0) Class125 arg0, @OriginalArg(1) Class125 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class125 arg3, @OriginalArg(5) Class200 arg4, @OriginalArg(6) int[][] arg5) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt3749; local11++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt3739; local15++) {
				if (Static304.anInt4779 == -1 || Static364.method4712(arg2, local11, local15, Static304.anInt4779)) {
					@Pc(38) byte local38 = this.aByteArrayArrayArray11[arg2][local11][local15];
					@Pc(47) byte local47 = this.aByteArrayArrayArray14[arg2][local11][local15];
					@Pc(58) int local58 = this.aByteArrayArrayArray13[arg2][local11][local15] & 0xFF;
					@Pc(69) int local69 = this.aByteArrayArrayArray10[arg2][local11][local15] & 0xFF;
					@Pc(84) Class130 local84 = local58 == 0 ? null : this.aClass117_6.method2462(local58 - 1);
					@Pc(96) Class89 local96 = local69 == 0 ? null : this.aClass116_5.method2452(local69 - 1);
					@Pc(98) int local98 = 0;
					@Pc(100) int local100 = 0;
					if (local38 != 0) {
						local100 = local84 == null ? 0 : Static428.anIntArray483[local38];
						local98 = local96 == null ? 0 : Static348.anIntArray402[local38];
					} else if (local84 != null) {
						local100 = Static428.anIntArray483[local38];
					} else if (local96 != null) {
						local98 = Static428.anIntArray483[local38];
					}
					@Pc(138) int local138 = local98 + local100;
					@Pc(140) int local140 = 0;
					if (local138 != 0) {
						@Pc(148) int[] local148 = new int[local138];
						@Pc(151) int[] local151 = new int[local138];
						@Pc(154) int[] local154 = new int[local138];
						@Pc(157) int[] local157 = new int[local138];
						@Pc(159) boolean local159 = false;
						@Pc(185) int local185;
						@Pc(191) int local191;
						if (local84 == null || local84.anInt3450 == -1 && local84.anInt3452 == -1 && local84.anInt3445 == -1) {
							for (local185 = 0; local185 < local100; local185++) {
								local148[local140] = -1;
								local140++;
							}
						} else {
							local185 = arg4.method5832() ? local84.anInt3445 : local84.anInt3440;
							if (Static159.aBoolean178) {
								local185 = -1;
							}
							for (local191 = 0; local191 < local100; local191++) {
								local154[local140] = local185;
								local157[local140] = local84.anInt3449;
								if (local84.anInt3450 == -1) {
									local148[local140] = -1;
								} else {
									local148[local140] = local84.anInt3450;
								}
								if (local84.anInt3452 == -1) {
									local151[local140] = -1;
								} else {
									local151[local140] = local84.anInt3452;
									local159 = true;
								}
								local140++;
							}
							if (!this.aBoolean242 && arg2 == 0) {
								Static435.method5737(local11, local15, local84.anInt3446, local84.anInt3442 * 8, local84.anInt3447);
							}
						}
						if (!local159) {
							local151 = null;
						}
						if (local96 == null) {
							for (local185 = 0; local185 < local98; local185++) {
								local148[local140] = -1;
								local140++;
							}
						} else {
							local185 = local96.anInt2408;
							if (Static159.aBoolean178) {
								local185 = -1;
							}
							for (local191 = 0; local191 < local98; local191++) {
								local154[local140] = local185;
								local157[local140] = local96.anInt2413;
								local148[local140] = arg5[local11][local15];
								if (local151 != null) {
									local151[local140] = -1;
								}
								local140++;
							}
						}
						local185 = this.anIntArray237.length;
						@Pc(348) int[] local348 = new int[local185];
						@Pc(351) int[] local351 = new int[local185];
						@Pc(358) int[] local358 = arg0 == null ? null : new int[local185];
						@Pc(367) int[] local367 = arg0 == null && arg3 == null ? null : new int[local185];
						@Pc(376) int local376;
						@Pc(381) int local381;
						@Pc(462) int local462;
						@Pc(468) int local468;
						for (@Pc(369) int local369 = 0; local369 < local185; local369++) {
							local376 = this.anIntArray237[local369];
							local381 = this.anIntArray236[local369];
							if (local47 == 0) {
								local348[local369] = local376;
								local351[local369] = local381;
							} else if (local47 == 1) {
								local348[local369] = local381;
								local351[local369] = 128 - local376;
							} else if (local47 == 2) {
								local348[local369] = 128 - local376;
								local351[local369] = 128 - local381;
							} else if (local47 == 3) {
								local348[local369] = 128 - local381;
								local351[local369] = local376;
							}
							if (local358 != null && Static167.aBooleanArrayArray4[local38][local369]) {
								local462 = local376 + (local11 << 7);
								local468 = (local15 << 7) + local376;
								local358[local369] = arg0.ca(local462, local468) - arg1.ca(local462, local468);
							}
							if (local367 != null) {
								if (arg0 != null && !Static167.aBooleanArrayArray4[local38][local369]) {
									local462 = local376 + (local11 << 7);
									local468 = (local15 << 7) + local376;
									local367[local369] = arg1.ca(local462, local468) - arg0.ca(local462, local468);
								} else if (arg3 != null && !Static319.aBooleanArrayArray7[local38][local369]) {
									local462 = (local11 << 7) + local376;
									local468 = local376 + (local15 << 7);
									local367[local369] = arg3.ca(local462, local468) - arg1.ca(local462, local468);
								}
							}
						}
						local376 = arg1.ua(local11, local15);
						local381 = arg1.ua(local11 + 1, local15);
						local462 = arg1.ua(local11 + 1, local15 + 1);
						local468 = arg1.ua(local11, local15 + 1);
						if (arg2 > 0) {
							@Pc(590) boolean local590 = true;
							if (local69 == 0 && local38 != 0) {
								local590 = false;
							}
							if (local58 > 0 && local84 != null && !local84.aBoolean220) {
								local590 = false;
							}
							if (local590 && local376 == local381 && local376 == local462 && local468 == local376) {
								this.aByteArrayArrayArray12[arg2][local11][local15] = (byte) (this.aByteArrayArrayArray12[arg2][local11][local15] | 0x4);
							}
						}
						@Pc(647) int local647 = 0;
						@Pc(649) int local649 = 0;
						@Pc(651) int local651 = 0;
						if (this.aBoolean242) {
							local647 = Static193.method2593(local11, local15);
							local649 = Static154.method5151(local11, local15);
							local651 = Static30.method474(local11, local15);
						}
						arg1.method4989(local11, local15, local348, local358, local351, local367, Static172.anIntArrayArray29[local38], Static41.anIntArrayArray4[local38], Static123.anIntArrayArray12[local38], local148, local151, local154, local157, local647, local649, local651);
						Static40.method656(arg2, local11, local15);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II[Lclient!uh;IILclient!fh;I)V")
	public final void method2971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class240[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class5_Sub15 arg5) {
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(24) int local24;
		@Pc(28) int local28;
		if (!this.aBoolean242) {
			for (local6 = 0; local6 < 4; local6++) {
				@Pc(12) Class240 local12 = arg2[local6];
				for (local14 = 0; local14 < 64; local14++) {
					for (@Pc(18) int local18 = 0; local18 < 64; local18++) {
						local24 = local14 + arg0;
						local28 = arg4 + local18;
						if (local24 >= 0 && this.anInt3749 > local24 && local28 >= 0 && local28 < this.anInt3739) {
							local12.method5404(local28, local24);
						}
					}
				}
			}
		}
		local6 = arg0 + arg3;
		@Pc(77) int local77 = arg4 + arg1;
		for (local14 = 0; local14 < this.anInt3751; local14++) {
			for (local24 = 0; local24 < 64; local24++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method2966(0, local28 + local77, local24 + arg0, local28 + arg4, 0, 0, arg5, false, local6 + local24, local14);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BILclient!za;II[[BLclient!jt;I[[B[[BLclient!gj;[ZII)V")
	private void method2972(@OriginalArg(1) int arg0, @OriginalArg(2) Class200 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) Class130 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) Class89 arg9, @OriginalArg(11) boolean[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(37) boolean[] local37 = arg5 != null && arg5.aBoolean219 ? Static199.aBooleanArrayArray5[arg11] : Static445.aBooleanArrayArray3[arg11];
		@Pc(56) int local56;
		@Pc(69) Class130 local69;
		@Pc(86) byte local86;
		@Pc(102) int local102;
		@Pc(107) int local107;
		if (arg12 > 0) {
			if (arg2 > 0) {
				local56 = arg8[arg2 - 1][arg12 - 1] & 0xFF;
				if (local56 > 0) {
					local69 = this.aClass117_6.method2462(local56 - 1);
					if (local69.anInt3450 != -1 && local69.aBoolean219) {
						local86 = arg4[arg2 - 1][arg12 - 1];
						local102 = arg7[arg2 - 1][arg12 - 1] * 2 + 4 & 0x7;
						local107 = Static259.method3337(arg1, local69);
						if (Static167.aBooleanArrayArray4[local86][local102]) {
							Static105.anIntArray84[0] = local69.anInt3450;
							Static364.anIntArray424[0] = local107;
							Static251.anIntArray260[0] = arg1.method5832() ? local69.anInt3445 : local69.anInt3440;
							Static338.anIntArray392[0] = local69.anInt3449;
							Static44.anIntArray39[0] = local69.anInt3444;
							Static366.anIntArray425[0] = 256;
						}
					}
				}
			}
			if (arg3 - 1 > arg2) {
				local56 = arg8[arg2 + 1][arg12 - 1] & 0xFF;
				if (local56 > 0) {
					local69 = this.aClass117_6.method2462(local56 - 1);
					if (local69.anInt3450 != -1 && local69.aBoolean219) {
						local86 = arg4[arg2 + 1][arg12 - 1];
						local102 = arg7[arg2 + 1][arg12 - 1] * 2 + 6 & 0x7;
						local107 = Static259.method3337(arg1, local69);
						if (Static167.aBooleanArrayArray4[local86][local102]) {
							Static105.anIntArray84[2] = local69.anInt3450;
							Static364.anIntArray424[2] = local107;
							Static251.anIntArray260[2] = arg1.method5832() ? local69.anInt3445 : local69.anInt3440;
							Static338.anIntArray392[2] = local69.anInt3449;
							Static44.anIntArray39[2] = local69.anInt3444;
							Static366.anIntArray425[2] = 512;
						}
					}
				}
			}
		}
		if (arg12 < arg0 - 1) {
			if (arg2 > 0) {
				local56 = arg8[arg2 - 1][arg12 + 1] & 0xFF;
				if (local56 > 0) {
					local69 = this.aClass117_6.method2462(local56 - 1);
					if (local69.anInt3450 != -1 && local69.aBoolean219) {
						local86 = arg4[arg2 - 1][arg12 + 1];
						local102 = arg7[arg2 - 1][arg12 + 1] * 2 + 2 & 0x7;
						local107 = Static259.method3337(arg1, local69);
						if (Static167.aBooleanArrayArray4[local86][local102]) {
							Static105.anIntArray84[6] = local69.anInt3450;
							Static364.anIntArray424[6] = local107;
							Static251.anIntArray260[6] = arg1.method5832() ? local69.anInt3445 : local69.anInt3440;
							Static338.anIntArray392[6] = local69.anInt3449;
							Static44.anIntArray39[6] = local69.anInt3444;
							Static366.anIntArray425[6] = 64;
						}
					}
				}
			}
			if (arg2 < arg3 - 1) {
				local56 = arg8[arg2 + 1][arg12 + 1] & 0xFF;
				if (local56 > 0) {
					local69 = this.aClass117_6.method2462(local56 - 1);
					if (local69.anInt3450 != -1 && local69.aBoolean219) {
						local86 = arg4[arg2 + 1][arg12 + 1];
						local102 = arg7[arg2 + 1][arg12 + 1] * 2 & 0x7;
						local107 = Static259.method3337(arg1, local69);
						if (Static167.aBooleanArrayArray4[local86][local102]) {
							Static105.anIntArray84[4] = local69.anInt3450;
							Static364.anIntArray424[4] = local107;
							Static251.anIntArray260[4] = arg1.method5832() ? local69.anInt3445 : local69.anInt3440;
							Static338.anIntArray392[4] = local69.anInt3449;
							Static44.anIntArray39[4] = local69.anInt3444;
							Static366.anIntArray425[4] = 128;
						}
					}
				}
			}
		}
		@Pc(548) int local548;
		@Pc(553) int local553;
		@Pc(555) int local555;
		@Pc(516) byte local516;
		if (arg12 > 0) {
			local56 = arg8[arg2][arg12 - 1] & 0xFF;
			if (local56 > 0) {
				local69 = this.aClass117_6.method2462(local56 - 1);
				if (local69.anInt3450 != -1) {
					local86 = arg4[arg2][arg12 - 1];
					local516 = arg7[arg2][arg12 - 1];
					if (local69.aBoolean219) {
						local107 = 2;
						local548 = local516 * 2 + 4;
						local553 = Static259.method3337(arg1, local69);
						for (local555 = 0; local555 < 3; local555++) {
							local548 &= 0x7;
							local107 &= 0x7;
							if (Static167.aBooleanArrayArray4[local86][local548] && local69.anInt3444 >= Static44.anIntArray39[local107]) {
								Static105.anIntArray84[local107] = local69.anInt3450;
								Static364.anIntArray424[local107] = local553;
								Static251.anIntArray260[local107] = arg1.method5832() ? local69.anInt3445 : local69.anInt3440;
								Static338.anIntArray392[local107] = local69.anInt3449;
								if (local69.anInt3444 == Static44.anIntArray39[local107]) {
									Static366.anIntArray425[local107] |= 0x20;
								} else {
									Static366.anIntArray425[local107] = 32;
								}
								Static44.anIntArray39[local107] = local69.anInt3444;
							}
							local548++;
							local107--;
						}
						if (!local37[arg6 & 0x3]) {
							arg10[0] = Static199.aBooleanArrayArray5[local86][local516 + 2 & 0x3];
						}
					} else if (!local37[arg6 & 0x3]) {
						arg10[0] = Static445.aBooleanArrayArray3[local86][local516 + 2 & 0x3];
					}
				}
			}
		}
		if (arg0 - 1 > arg12) {
			local56 = arg8[arg2][arg12 + 1] & 0xFF;
			if (local56 > 0) {
				local69 = this.aClass117_6.method2462(local56 - 1);
				if (local69.anInt3450 != -1) {
					local86 = arg4[arg2][arg12 + 1];
					local516 = arg7[arg2][arg12 + 1];
					if (local69.aBoolean219) {
						local107 = 4;
						local548 = local516 * 2 + 2;
						local553 = Static259.method3337(arg1, local69);
						for (local555 = 0; local555 < 3; local555++) {
							local548 &= 0x7;
							local107 &= 0x7;
							if (Static167.aBooleanArrayArray4[local86][local548] && Static44.anIntArray39[local107] <= local69.anInt3444) {
								Static105.anIntArray84[local107] = local69.anInt3450;
								Static364.anIntArray424[local107] = local553;
								Static251.anIntArray260[local107] = arg1.method5832() ? local69.anInt3445 : local69.anInt3440;
								Static338.anIntArray392[local107] = local69.anInt3449;
								if (local69.anInt3444 == Static44.anIntArray39[local107]) {
									Static366.anIntArray425[local107] |= 0x10;
								} else {
									Static366.anIntArray425[local107] = 16;
								}
								Static44.anIntArray39[local107] = local69.anInt3444;
							}
							local548--;
							local107++;
						}
						if (!local37[arg6 + 2 & 0x3]) {
							arg10[2] = Static199.aBooleanArrayArray5[local86][local516 & 0x3];
						}
					} else if (!local37[arg6 + 2 & 0x3]) {
						arg10[2] = Static445.aBooleanArrayArray3[local86][--local516 & 0x3];
					}
				}
			}
		}
		if (arg2 > 0) {
			local56 = arg8[arg2 - 1][arg12] & 0xFF;
			if (local56 > 0) {
				local69 = this.aClass117_6.method2462(local56 - 1);
				if (local69.anInt3450 != -1) {
					local86 = arg4[arg2 - 1][arg12];
					local516 = arg7[arg2 - 1][arg12];
					if (local69.aBoolean219) {
						local107 = 6;
						local548 = local516 * 2 + 4;
						local553 = Static259.method3337(arg1, local69);
						for (local555 = 0; local555 < 3; local555++) {
							local548 &= 0x7;
							local107 &= 0x7;
							if (Static167.aBooleanArrayArray4[local86][local548] && local69.anInt3444 >= Static44.anIntArray39[local107]) {
								Static105.anIntArray84[local107] = local69.anInt3450;
								Static364.anIntArray424[local107] = local553;
								Static251.anIntArray260[local107] = arg1.method5832() ? local69.anInt3445 : local69.anInt3440;
								Static338.anIntArray392[local107] = local69.anInt3449;
								if (local69.anInt3444 == Static44.anIntArray39[local107]) {
									Static366.anIntArray425[local107] |= 0x8;
								} else {
									Static366.anIntArray425[local107] = 8;
								}
								Static44.anIntArray39[local107] = local69.anInt3444;
							}
							local107++;
							local548--;
						}
						if (!local37[arg6 + 3 & 0x3]) {
							arg10[3] = Static199.aBooleanArrayArray5[local86][local516 + 1 & 0x3];
						}
					} else if (!local37[arg6 + 3 & 0x3]) {
						arg10[3] = Static445.aBooleanArrayArray3[local86][local516 + 1 & 0x3];
					}
				}
			}
		}
		if (arg2 < arg3 - 1) {
			local56 = arg8[arg2 + 1][arg12] & 0xFF;
			if (local56 > 0) {
				local69 = this.aClass117_6.method2462(local56 - 1);
				if (local69.anInt3450 != -1) {
					local86 = arg4[arg2 + 1][arg12];
					local516 = arg7[arg2 + 1][arg12];
					if (local69.aBoolean219) {
						local107 = 4;
						local548 = local516 * 2 + 6;
						local553 = Static259.method3337(arg1, local69);
						for (local555 = 0; local555 < 3; local555++) {
							local548 &= 0x7;
							local107 &= 0x7;
							if (Static167.aBooleanArrayArray4[local86][local548] && Static44.anIntArray39[local107] <= local69.anInt3444) {
								Static105.anIntArray84[local107] = local69.anInt3450;
								Static364.anIntArray424[local107] = local553;
								Static251.anIntArray260[local107] = arg1.method5832() ? local69.anInt3445 : local69.anInt3440;
								Static338.anIntArray392[local107] = local69.anInt3449;
								if (Static44.anIntArray39[local107] == local69.anInt3444) {
									Static366.anIntArray425[local107] |= 0x4;
								} else {
									Static366.anIntArray425[local107] = 4;
								}
								Static44.anIntArray39[local107] = local69.anInt3444;
							}
							local548++;
							local107--;
						}
						if (!local37[arg6 + 1 & 0x3]) {
							arg10[1] = Static199.aBooleanArrayArray5[local86][local516 + 3 & 0x3];
						}
					} else if (!local37[arg6 + 1 & 0x3]) {
						arg10[1] = Static445.aBooleanArrayArray3[local86][local516 + 3 & 0x3];
					}
				}
			}
		}
		if (arg5 == null) {
			return;
		}
		local56 = Static259.method3337(arg1, arg5);
		if (!arg5.aBoolean219) {
			return;
		}
		for (@Pc(1253) int local1253 = 0; local1253 < 8; local1253++) {
			@Pc(1264) int local1264 = local1253 - arg6 * 2 & 0x7;
			if (Static167.aBooleanArrayArray4[arg11][local1253] && Static44.anIntArray39[local1264] <= arg5.anInt3444) {
				Static105.anIntArray84[local1264] = arg5.anInt3450;
				Static364.anIntArray424[local1264] = local56;
				Static251.anIntArray260[local1264] = arg1.method5832() ? arg5.anInt3445 : arg5.anInt3440;
				Static338.anIntArray392[local1264] = arg5.anInt3449;
				if (arg5.anInt3444 == Static44.anIntArray39[local1264]) {
					Static366.anIntArray425[local1264] |= 0x2;
				} else {
					Static366.anIntArray425[local1264] = 2;
				}
				Static44.anIntArray39[local1264] = arg5.anInt3444;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLclient!za;[Lclient!uh;[[[I)V")
	public final void method2973(@OriginalArg(1) Class200 arg0, @OriginalArg(2) Class240[] arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(35) int local35;
		if (!this.aBoolean242) {
			for (local10 = 0; local10 < 4; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt3749; local14++) {
					for (local18 = 0; local18 < this.anInt3739; local18++) {
						if ((Static452.aByteArrayArrayArray16[local10][local14][local18] & 0x1) != 0) {
							local35 = local10;
							if ((Static452.aByteArrayArrayArray16[1][local14][local18] & 0x2) != 0) {
								local35 = local10 - 1;
							}
							if (local35 >= 0) {
								arg1[local35].method5414(local18, local14);
							}
						}
					}
				}
			}
		}
		for (local10 = 0; local10 < this.anInt3751; local10++) {
			local18 = 0;
			local35 = 0;
			if (!this.aBoolean242) {
				if (Static426.aBoolean479) {
					local35 = 8;
				}
				if (Static20.aBoolean37) {
					local18 = 2;
				}
				if (Static49.anInt896 != 0) {
					local18 |= 0x1;
					if (Static50.aBoolean73 | local10 == 0) {
						local35 |= 0x10;
					}
				}
			}
			if (Static20.aBoolean37) {
				local35 |= 0x7;
			}
			if (!Static87.aBoolean107) {
				local35 |= 0x20;
			}
			@Pc(155) int[][] local155 = arg2 == null || local10 >= arg2.length ? this.anIntArrayArrayArray11[local10] : arg2[local10];
			Static193.method2591(local10, arg0.method5841(this.anInt3749, this.anInt3739, this.anIntArrayArrayArray11[local10], local155, local18, local35));
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIII[Lclient!uh;Lclient!fh;III)V")
	public final void method2974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class240[] arg4, @OriginalArg(6) Class5_Sub15 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg6 & 0x7) * 8;
		@Pc(17) int local17 = (arg0 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(57) int local57;
		if (!this.aBoolean242) {
			@Pc(24) Class240 local24 = arg4[arg8];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(45) int local45 = arg3 + Static22.method375(local30 & 0x7, arg7, local26 & 0x7);
					local57 = arg2 + Static456.method5987(arg7, local26 & 0x7, local30 & 0x7);
					if (local45 > 0 && this.anInt3749 - 1 > local45 && local57 > 0 && local57 < this.anInt3739 - 1) {
						local24.method5404(local57, local45);
					}
				}
			}
		}
		@Pc(99) int local99 = (arg6 & 0xFFFFFFF8) << 3;
		local26 = (arg0 & 0x1FFFFFF8) << 3;
		@Pc(107) byte local107 = 0;
		@Pc(109) byte local109 = 0;
		if (arg7 == 1) {
			local109 = 1;
		} else if (arg7 == 2) {
			local109 = 1;
			local107 = 1;
		} else if (arg7 == 3) {
			local107 = 1;
		}
		for (local57 = 0; local57 < this.anInt3751; local57++) {
			for (@Pc(144) int local144 = 0; local144 < 64; local144++) {
				for (@Pc(148) int local148 = 0; local148 < 64; local148++) {
					if (arg1 == local57 && local144 >= local11 && local144 <= local11 + 8 && local148 >= local17 && local17 + 8 >= local148) {
						@Pc(207) int local207;
						@Pc(219) int local219;
						if (local144 == local11 + 8 || local17 + 8 == local148) {
							if (arg7 == 0) {
								local207 = arg3 + local144 - local11;
								local219 = local148 + arg2 - local17;
							} else if (arg7 == 1) {
								local219 = arg2 + local11 + 8 - local144;
								local207 = local148 + arg3 - local17;
							} else if (arg7 == 2) {
								local219 = arg2 + local17 + 8 - local148;
								local207 = local11 + arg3 + 8 - local144;
							} else {
								local219 = arg2 + local144 - local11;
								local207 = local17 + arg3 + 8 - local148;
							}
							this.method2966(0, local148 + local26, local207, local219, 0, 0, arg5, true, local99 + local144, arg8);
						} else {
							local207 = Static22.method375(local148 & 0x7, arg7, local144 & 0x7) + arg3;
							local219 = Static456.method5987(arg7, local144 & 0x7, local148 & 0x7) + arg2;
							this.method2966(local107, local148 + local26, local207, local219, local109, arg7, arg5, false, local99 + local144, arg8);
						}
						if (local144 == 63 || local148 == 63) {
							@Pc(349) byte local349 = 1;
							if (local144 == 63 && local148 == 63) {
								local349 = 3;
							}
							for (@Pc(359) int local359 = 0; local359 < local349; local359++) {
								@Pc(363) int local363 = local144;
								@Pc(365) int local365 = local148;
								if (local359 == 0) {
									local363 = local144 == 63 ? 64 : local144;
									local365 = local148 == 63 ? 64 : local148;
								} else if (local359 == 1) {
									local363 = 64;
								} else if (local359 == 2) {
									local365 = 64;
								}
								@Pc(406) int local406;
								@Pc(413) int local413;
								if (arg7 == 0) {
									local406 = arg3 + local363 - local11;
									local413 = arg2 + local365 - local17;
								} else if (arg7 == 1) {
									local413 = local11 + arg2 + 8 - local363;
									local406 = arg3 + local365 - local17;
								} else if (arg7 == 2) {
									local406 = arg3 + local11 + 8 - local363;
									local413 = arg2 + local17 + 8 - local365;
								} else {
									local413 = local363 + arg2 - local11;
									local406 = local17 + arg3 + 8 - local365;
								}
								if (local406 >= 0 && local406 < this.anInt3749 && local413 >= 0 && this.anInt3739 > local413) {
									this.anIntArrayArrayArray11[arg8][local406][local413] = this.anIntArrayArrayArray11[arg8][local207 + local107][local109 + local219];
								}
							}
						}
					} else {
						this.method2966(0, 0, -1, -1, 0, 0, arg5, false, 0, 0);
					}
				}
			}
		}
	}
}
