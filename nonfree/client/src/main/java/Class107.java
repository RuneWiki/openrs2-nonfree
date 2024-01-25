import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public class Class107 {

	@OriginalMember(owner = "client!ua", name = "u", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "[I")
	private final int[] anIntArray233 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "[I")
	private final int[] anIntArray234 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "Lclient!rb;")
	private final Class210 aClass210_5;

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Lclient!sm;")
	private final Class227 aClass227_3;

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "Z")
	public final boolean aBoolean171;

	@OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
	protected final int anInt2746;

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
	protected final int anInt2744;

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
	public final int anInt2740;

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!ua", name = "z", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!ua", name = "y", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	static {
		new Class231("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(IIIZLclient!sm;Lclient!rb;)V")
	protected Class107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class227 arg4, @OriginalArg(5) Class210 arg5) {
		this.aClass210_5 = arg5;
		this.aClass227_3 = arg4;
		this.aBoolean171 = arg3;
		this.anInt2746 = arg2;
		this.anInt2744 = arg1;
		this.anInt2740 = arg0;
		this.aByteArrayArrayArray8 = new byte[this.anInt2740][this.anInt2744 + 1][this.anInt2746 + 1];
		this.aByteArrayArrayArray13 = new byte[this.anInt2740][this.anInt2744][this.anInt2746];
		this.aByteArrayArrayArray10 = new byte[this.anInt2740][this.anInt2744][this.anInt2746];
		this.aByteArrayArrayArray9 = new byte[this.anInt2740][this.anInt2744][this.anInt2746];
		this.anIntArrayArrayArray6 = new int[this.anInt2740][this.anInt2744 + 1][this.anInt2746 + 1];
		this.aByteArrayArrayArray12 = new byte[this.anInt2740][this.anInt2744][this.anInt2746];
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!za;[[ILclient!ya;IILclient!ya;Lclient!ya;)V")
	private void method2267(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class22 arg4, @OriginalArg(6) Class22 arg5) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2744; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt2746; local11++) {
				if (Static122.anInt2063 == -1 || Static246.method3418(arg3, Static122.anInt2063, local11, local7)) {
					@Pc(35) byte local35 = this.aByteArrayArrayArray10[arg3][local7][local11];
					@Pc(44) byte local44 = this.aByteArrayArrayArray9[arg3][local7][local11];
					@Pc(55) int local55 = this.aByteArrayArrayArray12[arg3][local7][local11] & 0xFF;
					@Pc(66) int local66 = this.aByteArrayArrayArray13[arg3][local7][local11] & 0xFF;
					@Pc(78) Class168 local78 = local55 == 0 ? null : this.aClass227_3.method5234(local55 - 1);
					@Pc(93) Class161 local93 = local66 == 0 ? null : this.aClass210_5.method4903(local66 - 1);
					@Pc(95) int local95 = 0;
					@Pc(97) int local97 = 0;
					if (local35 != 0) {
						local97 = local78 == null ? 0 : Static306.anIntArray469[local35];
						local95 = local93 == null ? 0 : Static361.anIntArray526[local35];
					} else if (local78 != null) {
						local97 = Static306.anIntArray469[local35];
					} else if (local93 != null) {
						local95 = Static306.anIntArray469[local35];
					}
					@Pc(135) int local135 = local95 + local97;
					@Pc(137) int local137 = 0;
					if (local135 != 0) {
						@Pc(142) int[] local142 = new int[local135];
						@Pc(145) int[] local145 = new int[local135];
						@Pc(148) int[] local148 = new int[local135];
						@Pc(151) int[] local151 = new int[local135];
						@Pc(153) boolean local153 = false;
						@Pc(178) int local178;
						@Pc(184) int local184;
						if (local78 == null || local78.anInt4338 == -1 && local78.anInt4344 == -1 && local78.anInt4349 == -1) {
							for (local178 = 0; local178 < local97; local178++) {
								local142[local137] = -1;
								local137++;
							}
						} else {
							local178 = arg0.method6002() ? local78.anInt4349 : local78.anInt4353;
							if (Static87.aBoolean88) {
								local178 = -1;
							}
							for (local184 = 0; local184 < local97; local184++) {
								local148[local137] = local178;
								local151[local137] = local78.anInt4337;
								if (local78.anInt4338 == -1) {
									local142[local137] = -1;
								} else {
									local142[local137] = local78.anInt4338;
								}
								if (local78.anInt4344 == -1) {
									local145[local137] = -1;
								} else {
									local145[local137] = local78.anInt4344;
									local153 = true;
								}
								local137++;
							}
							if (!this.aBoolean171 && arg3 == 0) {
								Static204.method2868(local7, local11, local78.anInt4347, local78.anInt4340 * 8, local78.anInt4354);
							}
						}
						if (!local153) {
							local145 = null;
						}
						if (local93 == null) {
							for (local178 = 0; local178 < local95; local178++) {
								local142[local137] = -1;
								local137++;
							}
						} else {
							local178 = local93.anInt3991;
							if (Static87.aBoolean88) {
								local178 = -1;
							}
							for (local184 = 0; local184 < local95; local184++) {
								local148[local137] = local178;
								local151[local137] = local93.anInt3993;
								local142[local137] = arg1[local7][local11];
								if (local145 != null) {
									local145[local137] = -1;
								}
								local137++;
							}
						}
						local178 = this.anIntArray233.length;
						@Pc(334) int[] local334 = new int[local178];
						@Pc(337) int[] local337 = new int[local178];
						@Pc(344) int[] local344 = arg5 == null ? null : new int[local178];
						@Pc(353) int[] local353 = arg5 == null && arg4 == null ? null : new int[local178];
						@Pc(362) int local362;
						@Pc(367) int local367;
						@Pc(447) int local447;
						@Pc(453) int local453;
						for (@Pc(355) int local355 = 0; local355 < local178; local355++) {
							local362 = this.anIntArray233[local355];
							local367 = this.anIntArray234[local355];
							if (local44 == 0) {
								local334[local355] = local362;
								local337[local355] = local367;
							} else if (local44 == 1) {
								local334[local355] = local367;
								local337[local355] = 128 - local362;
							} else if (local44 == 2) {
								local334[local355] = 128 - local362;
								local337[local355] = 128 - local367;
							} else if (local44 == 3) {
								local334[local355] = 128 - local367;
								local337[local355] = local362;
							}
							if (local344 != null && Static161.aBooleanArrayArray10[local35][local355]) {
								local447 = (local7 << 7) + local362;
								local453 = local362 + (local11 << 7);
								local344[local355] = arg5.ca(local447, local453) - arg2.ca(local447, local453);
							}
							if (local353 != null) {
								if (arg5 != null && !Static161.aBooleanArrayArray10[local35][local355]) {
									local447 = local362 + (local7 << 7);
									local453 = (local11 << 7) + local362;
									local353[local355] = arg2.ca(local447, local453) - arg5.ca(local447, local453);
								} else if (arg4 != null && !Static34.aBooleanArrayArray3[local35][local355]) {
									local447 = local362 + (local7 << 7);
									local453 = local362 + (local11 << 7);
									local353[local355] = arg4.ca(local447, local453) - arg2.ca(local447, local453);
								}
							}
						}
						local362 = arg2.ua(local7, local11);
						local367 = arg2.ua(local7 + 1, local11);
						local447 = arg2.ua(local7 + 1, local11 + 1);
						local453 = arg2.ua(local7, local11 + 1);
						if (arg3 > 0) {
							@Pc(573) boolean local573 = true;
							if (local66 == 0 && local35 != 0) {
								local573 = false;
							}
							if (local55 > 0 && local78 != null && !local78.aBoolean317) {
								local573 = false;
							}
							if (local573 && local362 == local367 && local362 == local447 && local453 == local362) {
								this.aByteArrayArrayArray8[arg3][local7][local11] = (byte) (this.aByteArrayArrayArray8[arg3][local7][local11] | 0x4);
							}
						}
						@Pc(634) int local634 = 0;
						@Pc(636) int local636 = 0;
						@Pc(638) int local638 = 0;
						if (this.aBoolean171) {
							local634 = Static183.method2649(local7, local11);
							local636 = Static25.method5839(local7, local11);
							local638 = Static92.method1396(local7, local11);
						}
						arg2.method2326(local7, local11, local334, local344, local337, local353, Static450.anIntArrayArray189[local35], Static57.anIntArrayArray30[local35], Static454.anIntArrayArray186[local35], local142, local145, local148, local151, local634, local636, local638);
						Static83.method1221(arg3, local7, local11);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIILclient!hw;IIZI)V")
	private void method2268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class2_Sub17 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		if (arg1 == 1) {
			arg2 = 1;
		} else if (arg1 == 2) {
			arg9 = 1;
			arg2 = 1;
		} else if (arg1 == 3) {
			arg9 = 1;
		}
		@Pc(66) int local66;
		if (arg6 < 0 || this.anInt2744 <= arg6 || arg4 < 0 || arg4 >= this.anInt2746) {
			while (true) {
				local66 = arg5.method6138();
				if (local66 == 0) {
					return;
				}
				if (local66 == 1) {
					arg5.method6138();
					return;
				}
				if (local66 <= 49) {
					arg5.method6138();
				}
			}
			return;
		}
		if (!this.aBoolean171 && !arg8) {
			Static326.aByteArrayArrayArray15[arg0][arg6][arg4] = 0;
		}
		while (true) {
			local66 = arg5.method6138();
			if (local66 == 0) {
				if (this.aBoolean171) {
					this.anIntArrayArrayArray6[0][arg6 + arg9][arg2 + arg4] = 0;
					return;
				} else if (arg0 == 0) {
					this.anIntArrayArrayArray6[0][arg6 + arg9][arg4 + arg2] = -Static460.method6244(arg3 + 932731, 556238 - -arg7) * 8 << 0;
					return;
				} else {
					this.anIntArrayArrayArray6[arg0][arg6 + arg9][arg4 + arg2] = this.anIntArrayArrayArray6[arg0 - 1][arg6 + arg9][arg2 + arg4] - 240;
					return;
				}
			}
			if (local66 == 1) {
				@Pc(199) int local199 = arg5.method6138();
				if (!this.aBoolean171) {
					if (local199 == 1) {
						local199 = 0;
					}
					if (arg0 != 0) {
						this.anIntArrayArrayArray6[arg0][arg9 + arg6][arg4 + arg2] = this.anIntArrayArrayArray6[arg0 - 1][arg9 + arg6][arg2 + arg4] - (local199 * 8 << 0);
						return;
					}
					this.anIntArrayArrayArray6[0][arg6 + arg9][arg2 + arg4] = -local199 * 8 << 0;
					return;
				}
				this.anIntArrayArrayArray6[0][arg9 + arg6][arg2 + arg4] = local199 * 8 << 0;
				return;
			}
			if (local66 <= 49) {
				if (arg8) {
					arg5.method6138();
				} else {
					this.aByteArrayArrayArray12[arg0][arg6][arg4] = arg5.method6120();
					this.aByteArrayArrayArray10[arg0][arg6][arg4] = (byte) ((local66 - 2) / 4);
					this.aByteArrayArrayArray9[arg0][arg6][arg4] = (byte) (arg1 + local66 - 2 & 0x3);
				}
			} else if (local66 <= 81) {
				if (!this.aBoolean171 && !arg8) {
					Static326.aByteArrayArrayArray15[arg0][arg6][arg4] = (byte) (local66 - 49);
				}
			} else if (!arg8) {
				this.aByteArrayArrayArray13[arg0][arg6][arg4] = (byte) (local66 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIII)V")
	public final void method2269(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2740; local7++) {
			this.method2271(arg0, local7, arg1);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "([[III)V")
	public final void method2270(@OriginalArg(0) int[][] arg0) {
		@Pc(14) int[][] local14 = this.anIntArrayArrayArray6[0];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2744 + 1; local16++) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt2746 + 1; local20++) {
				local14[local16][local20] += arg0[local16][local20];
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIII)V")
	private void method2271(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2) {
		@Pc(16) int local16;
		for (@Pc(12) int local12 = arg0; local12 < arg0 + 64; local12++) {
			for (local16 = arg2; local16 < arg2 + 64; local16++) {
				if (local16 >= 0 && local16 < this.anInt2744 && local12 >= 0 && this.anInt2746 > local12) {
					this.anIntArrayArrayArray6[arg1][local16][local12] = arg1 <= 0 ? 0 : this.anIntArrayArrayArray6[arg1 - 1][local16][local12] - 240;
				}
			}
		}
		if (arg2 > 0 && arg2 < this.anInt2744) {
			for (local16 = arg0 + 1; local16 < arg0 + 64; local16++) {
				if (local16 >= 0 && this.anInt2746 > local16) {
					this.anIntArrayArrayArray6[arg1][arg2][local16] = this.anIntArrayArrayArray6[arg1][arg2 - 1][local16];
				}
			}
		}
		if (arg0 > 0 && arg0 < this.anInt2746) {
			for (local16 = arg2 + 1; local16 < arg2 + 64; local16++) {
				if (local16 >= 0 && this.anInt2744 > local16) {
					this.anIntArrayArrayArray6[arg1][local16][arg0] = this.anIntArrayArrayArray6[arg1][local16][arg0 - 1];
				}
			}
		}
		if (arg2 < 0 || arg0 < 0 || this.anInt2744 <= arg2 || this.anInt2746 <= arg0) {
			return;
		}
		if (arg1 != 0) {
			if (arg2 > 0 && this.anIntArrayArrayArray6[arg1][arg2 - 1][arg0] != this.anIntArrayArrayArray6[arg1 - 1][arg2 - 1][arg0]) {
				this.anIntArrayArrayArray6[arg1][arg2][arg0] = this.anIntArrayArrayArray6[arg1][arg2 - 1][arg0];
				return;
			}
			if (arg0 > 0 && this.anIntArrayArrayArray6[arg1 - 1][arg2][arg0 - 1] != this.anIntArrayArrayArray6[arg1][arg2][arg0 - 1]) {
				this.anIntArrayArrayArray6[arg1][arg2][arg0] = this.anIntArrayArrayArray6[arg1][arg2][arg0 - 1];
				return;
			}
			if (arg2 > 0 && arg0 > 0 && this.anIntArrayArrayArray6[arg1][arg2 - 1][arg0 - 1] != this.anIntArrayArrayArray6[arg1 - 1][arg2 - 1][arg0 - 1]) {
				this.anIntArrayArrayArray6[arg1][arg2][arg0] = this.anIntArrayArrayArray6[arg1][arg2 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray6[arg1][arg2 - 1][arg0] != 0) {
			this.anIntArrayArrayArray6[arg1][arg2][arg0] = this.anIntArrayArrayArray6[arg1][arg2 - 1][arg0];
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray6[arg1][arg2][arg0 - 1] != 0) {
			this.anIntArrayArrayArray6[arg1][arg2][arg0] = this.anIntArrayArrayArray6[arg1][arg2][arg0 - 1];
			return;
		}
		if (arg2 > 0 && arg0 > 0 && this.anIntArrayArrayArray6[arg1][arg2 - 1][arg0 - 1] != 0) {
			this.anIntArrayArrayArray6[arg1][arg2][arg0] = this.anIntArrayArrayArray6[arg1][arg2 - 1][arg0 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIII[Lclient!sj;ILclient!hw;III)V")
	public final void method2272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class225[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub17 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg8 & 0x7) * 8;
		@Pc(24) int local24;
		if (!this.aBoolean171) {
			@Pc(18) Class225 local18 = arg4[arg5];
			for (@Pc(20) int local20 = 0; local20 < 8; local20++) {
				for (local24 = 0; local24 < 8; local24++) {
					@Pc(38) int local38 = arg7 + Static378.method5926(arg2, local20 & 0x7, local24 & 0x7);
					@Pc(50) int local50 = Static317.method4504(arg2, local20 & 0x7, local24 & 0x7) + arg0;
					if (local38 > 0 && this.anInt2744 - 1 > local38 && local50 > 0 && local50 < this.anInt2746 - 1) {
						local18.method5194(local38, local50);
					}
				}
			}
		}
		@Pc(96) int local96 = (arg1 & 0x7) * 8;
		@Pc(110) int local110 = (arg8 & 0xFFFFFFF8) << 3;
		local24 = (arg1 & 0xFFFFFFF8) << 3;
		@Pc(118) byte local118 = 0;
		@Pc(120) byte local120 = 0;
		if (arg2 == 1) {
			local120 = 1;
		} else if (arg2 == 2) {
			local120 = 1;
			local118 = 1;
		} else if (arg2 == 3) {
			local118 = 1;
		}
		for (@Pc(147) int local147 = 0; local147 < this.anInt2740; local147++) {
			for (@Pc(151) int local151 = 0; local151 < 64; local151++) {
				for (@Pc(155) int local155 = 0; local155 < 64; local155++) {
					if (local147 == arg3 && local151 >= local11 && local11 + 8 >= local151 && local155 >= local96 && local96 + 8 >= local155) {
						@Pc(206) int local206;
						@Pc(218) int local218;
						if (local151 == local11 + 8 || local96 + 8 == local155) {
							if (arg2 == 0) {
								local206 = local151 + arg7 - local11;
								local218 = local155 + arg0 - local96;
							} else if (arg2 == 1) {
								local206 = arg7 + local155 - local96;
								local218 = arg0 + local11 + 8 - local151;
							} else if (arg2 == 2) {
								local206 = local11 + arg7 + 8 - local151;
								local218 = arg0 + local96 + 8 - local155;
							} else {
								local218 = arg0 + local151 - local11;
								local206 = local96 + arg7 + 8 - local155;
							}
							this.method2268(arg5, 0, 0, local151 + local110, local218, arg6, local206, local155 + local24, true, 0);
						} else {
							local206 = arg7 + Static378.method5926(arg2, local151 & 0x7, local155 & 0x7);
							local218 = Static317.method4504(arg2, local151 & 0x7, local155 & 0x7) + arg0;
							this.method2268(arg5, arg2, local120, local151 + local110, local218, arg6, local206, local24 + local155, false, local118);
						}
						if (local151 == 63 || local155 == 63) {
							@Pc(349) byte local349 = 1;
							if (local151 == 63 && local155 == 63) {
								local349 = 3;
							}
							for (@Pc(363) int local363 = 0; local363 < local349; local363++) {
								@Pc(367) int local367 = local151;
								@Pc(369) int local369 = local155;
								if (local363 == 0) {
									local369 = local155 == 63 ? 64 : local155;
									local367 = local151 == 63 ? 64 : local151;
								} else if (local363 == 1) {
									local367 = 64;
								} else if (local363 == 2) {
									local369 = 64;
								}
								@Pc(422) int local422;
								@Pc(430) int local430;
								if (arg2 == 0) {
									local430 = local369 + arg0 - local96;
									local422 = arg7 + local367 - local11;
								} else if (arg2 == 1) {
									local422 = arg7 + local369 - local96;
									local430 = local11 + arg0 + 8 - local367;
								} else if (arg2 == 2) {
									local422 = arg7 + local11 + 8 - local367;
									local430 = local96 + arg0 + 8 - local369;
								} else {
									local422 = local96 + arg7 + 8 - local369;
									local430 = local367 + arg0 - local11;
								}
								if (local422 >= 0 && this.anInt2744 > local422 && local430 >= 0 && this.anInt2746 > local430) {
									this.anIntArrayArrayArray6[arg5][local422][local430] = this.anIntArrayArrayArray6[arg5][local206 + local118][local218 + local120];
								}
							}
						}
					} else {
						this.method2268(0, 0, 0, 0, -1, arg6, -1, 0, false, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!ya;Lclient!ya;ZLclient!za;)V")
	public final void method2273(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(3) Class75 arg2) {
		if (Static458.anIntArray634 == null || this.anInt2746 != Static458.anIntArray634.length) {
			Static463.anIntArray637 = new int[this.anInt2746];
			Static389.anIntArray544 = new int[this.anInt2746];
			Static63.anIntArray547 = new int[this.anInt2746];
			Static138.anIntArray215 = new int[this.anInt2746];
			Static458.anIntArray634 = new int[this.anInt2746];
		}
		@Pc(38) int[][] local38 = new int[this.anInt2744][this.anInt2746];
		@Pc(44) int local44;
		for (@Pc(40) int local40 = 0; local40 < this.anInt2740; local40++) {
			for (local44 = 0; local44 < this.anInt2746; local44++) {
				Static458.anIntArray634[local44] = 0;
				Static138.anIntArray215[local44] = 0;
				Static63.anIntArray547[local44] = 0;
				Static389.anIntArray544[local44] = 0;
				Static463.anIntArray637[local44] = 0;
			}
			for (@Pc(73) int local73 = -5; local73 < this.anInt2744; local73++) {
				@Pc(83) int local83;
				@Pc(102) int local102;
				@Pc(174) int local174;
				for (@Pc(77) int local77 = 0; local77 < this.anInt2746; local77++) {
					local83 = local73 + 5;
					@Pc(151) int local151;
					if (this.anInt2744 > local83) {
						local102 = this.aByteArrayArrayArray13[local40][local83][local77] & 0xFF;
						if (local102 > 0) {
							@Pc(115) Class161 local115 = this.aClass210_5.method4903(local102 - 1);
							Static458.anIntArray634[local77] += local115.anInt3989;
							Static138.anIntArray215[local77] += local115.anInt3987;
							Static63.anIntArray547[local77] += local115.anInt3983;
							Static389.anIntArray544[local77] += local115.anInt3986;
							local151 = Static463.anIntArray637[local77]++;
						}
					}
					local102 = local73 - 5;
					if (local102 >= 0) {
						local174 = this.aByteArrayArrayArray13[local40][local102][local77] & 0xFF;
						if (local174 > 0) {
							@Pc(187) Class161 local187 = this.aClass210_5.method4903(local174 - 1);
							Static458.anIntArray634[local77] -= local187.anInt3989;
							Static138.anIntArray215[local77] -= local187.anInt3987;
							Static63.anIntArray547[local77] -= local187.anInt3983;
							Static389.anIntArray544[local77] -= local187.anInt3986;
							local151 = Static463.anIntArray637[local77]--;
						}
					}
				}
				if (local73 >= 0) {
					local83 = 0;
					local102 = 0;
					local174 = 0;
					@Pc(248) int local248 = 0;
					@Pc(250) int local250 = 0;
					for (@Pc(252) int local252 = -5; local252 < this.anInt2746; local252++) {
						@Pc(258) int local258 = local252 + 5;
						if (this.anInt2746 > local258) {
							local250 += Static463.anIntArray637[local258];
							local248 += Static389.anIntArray544[local258];
							local102 += Static138.anIntArray215[local258];
							local174 += Static63.anIntArray547[local258];
							local83 += Static458.anIntArray634[local258];
						}
						@Pc(296) int local296 = local252 - 5;
						if (local296 >= 0) {
							local102 -= Static138.anIntArray215[local296];
							local250 -= Static463.anIntArray637[local296];
							local174 -= Static63.anIntArray547[local296];
							local83 -= Static458.anIntArray634[local296];
							local248 -= Static389.anIntArray544[local296];
						}
						if (local252 >= 0 && local248 > 0 && local250 > 0) {
							local38[local73][local252] = Static317.method4501(local102 / local250, local83 * 256 / local248, local174 / local250);
						}
					}
				}
			}
			if (Static297.aBoolean372) {
				this.method2278(local38, local40 == 0 ? arg1 : null, Static241.aClass22Array3[local40], local40, local40 == 0 ? arg0 : null, arg2);
			} else {
				this.method2267(arg2, local38, Static241.aClass22Array3[local40], local40, local40 == 0 ? arg0 : null, local40 == 0 ? arg1 : null);
			}
			this.aByteArrayArrayArray13[local40] = null;
			this.aByteArrayArrayArray12[local40] = null;
			this.aByteArrayArrayArray10[local40] = null;
			this.aByteArrayArrayArray9[local40] = null;
		}
		if (!this.aBoolean171) {
			if (Static135.anInt1508 != 0) {
				Static325.method4607();
			}
			if (Static343.aBoolean190) {
				Static380.method5245();
			}
		}
		for (local44 = 0; local44 < this.anInt2740; local44++) {
			Static241.aClass22Array3[local44].aa();
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!za;B[Lclient!sj;[[[I)V")
	public final void method2275(@OriginalArg(0) Class75 arg0, @OriginalArg(2) Class225[] arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(18) int local18;
		if (!this.aBoolean171) {
			for (local10 = 0; local10 < 4; local10++) {
				for (local14 = 0; local14 < this.anInt2744; local14++) {
					for (local18 = 0; local18 < this.anInt2746; local18++) {
						if ((Static326.aByteArrayArrayArray15[local10][local14][local18] & 0x1) != 0) {
							@Pc(32) int local32 = local10;
							if ((Static326.aByteArrayArrayArray15[1][local14][local18] & 0x2) != 0) {
								local32 = local10 - 1;
							}
							if (local32 >= 0) {
								arg1[local32].method5201(local14, local18);
							}
						}
					}
				}
			}
		}
		for (local10 = 0; local10 < this.anInt2740; local10++) {
			local14 = 0;
			local18 = 0;
			if (!this.aBoolean171) {
				if (Static435.aBoolean499) {
					local18 = 8;
				}
				if (Static343.aBoolean190) {
					local14 = 2;
				}
				if (Static135.anInt1508 != 0) {
					local14 |= 0x1;
					if (Static426.aBoolean483 | local10 == 0) {
						local18 |= 0x10;
					}
				}
			}
			if (Static343.aBoolean190) {
				local18 |= 0x7;
			}
			if (!Static346.aBoolean425) {
				local18 |= 0x20;
			}
			@Pc(155) int[][] local155 = arg2 == null || local10 >= arg2.length ? this.anIntArrayArrayArray6[local10] : arg2[local10];
			Static450.method6257(local10, arg0.method6010(this.anInt2744, this.anInt2746, this.anIntArrayArrayArray6[local10], local155, local14, local18));
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "([Lclient!sj;Lclient!hw;IIIII)V")
	public final void method2277(@OriginalArg(0) Class225[] arg0, @OriginalArg(1) Class2_Sub17 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (!this.aBoolean171) {
			for (local6 = 0; local6 < 4; local6++) {
				@Pc(12) Class225 local12 = arg0[local6];
				for (local14 = 0; local14 < 64; local14++) {
					for (local18 = 0; local18 < 64; local18++) {
						local24 = arg4 + local14;
						@Pc(28) int local28 = local18 + arg5;
						if (local24 >= 0 && local24 < this.anInt2744 && local28 >= 0 && this.anInt2746 > local28) {
							local12.method5194(local24, local28);
						}
					}
				}
			}
		}
		local6 = arg2 + arg4;
		@Pc(73) int local73 = arg5 + arg3;
		for (local14 = 0; local14 < this.anInt2740; local14++) {
			for (local18 = 0; local18 < 64; local18++) {
				for (local24 = 0; local24 < 64; local24++) {
					this.method2268(local14, 0, 0, local18 + local6, local24 + arg5, arg1, arg4 + local18, local24 + local73, false, 0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "([[ILclient!ya;Lclient!ya;ILclient!ya;Lclient!za;I)V")
	private void method2278(@OriginalArg(0) int[][] arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class22 arg4, @OriginalArg(5) Class75 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray10[arg3];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray9[arg3];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray13[arg3];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray12[arg3];
		for (@Pc(36) int local36 = 0; local36 < this.anInt2744; local36++) {
			@Pc(50) int local50 = local36 < this.anInt2744 - 1 ? local36 + 1 : local36;
			for (@Pc(52) int local52 = 0; local52 < this.anInt2746; local52++) {
				@Pc(66) int local66 = this.anInt2746 - 1 > local52 ? local52 + 1 : local52;
				if (Static122.anInt2063 == -1 || Static246.method3418(arg3, Static122.anInt2063, local52, local36)) {
					@Pc(80) boolean local80 = false;
					@Pc(82) boolean local82 = false;
					@Pc(85) boolean[] local85 = new boolean[4];
					@Pc(91) int local91 = local10[local36][local52];
					@Pc(97) int local97 = local15[local36][local52];
					@Pc(105) int local105 = local25[local36][local52] & 0xFF;
					@Pc(113) int local113 = local20[local36][local52] & 0xFF;
					@Pc(121) int local121 = local20[local36][local66] & 0xFF;
					@Pc(129) int local129 = local20[local50][local66] & 0xFF;
					@Pc(137) int local137 = local20[local50][local52] & 0xFF;
					if (local105 != 0 || local113 != 0) {
						@Pc(156) Class168 local156 = local105 == 0 ? null : this.aClass227_3.method5234(local105 - 1);
						@Pc(168) Class161 local168 = local113 == 0 ? null : this.aClass210_5.method4903(local113 - 1);
						if (local91 == 0 && local156 == null) {
							local91 = 12;
						}
						@Pc(176) Class168 local176 = local156;
						if (local156 != null) {
							if (local156.anInt4338 == -1 && local156.anInt4344 == -1) {
								local176 = local156;
								local156 = null;
							} else if (local168 != null && local91 != 0) {
								local82 = local156.aBoolean315;
							}
						}
						@Pc(253) int local253;
						@Pc(313) int local313;
						@Pc(359) int local359;
						@Pc(369) int local369;
						if ((local91 == 0 || local91 == 12) && local36 > 0 && local52 > 0 && this.anInt2744 > local36 && this.anInt2746 > local52) {
							local253 = local113 == local20[local36 - 1][local52 - 1] ? 1 : -1;
							@Pc(268) int local268 = local20[local50][local66] == local113 ? 1 : -1;
							@Pc(283) int local283 = local20[local50][local52 - 1] == local113 ? 1 : -1;
							if (local20[local36][local52 - 1] == local113) {
								local283++;
								local253++;
							} else {
								local283--;
								local253--;
							}
							local313 = local20[local36 - 1][local66] == local113 ? 1 : -1;
							if (local113 == local20[local50][local52]) {
								local283++;
								local268++;
							} else {
								local268--;
								local283--;
							}
							if (local113 == local20[local36][local66]) {
								local313++;
								local268++;
							} else {
								local268--;
								local313--;
							}
							if (local20[local36 - 1][local52] == local113) {
								local313++;
								local253++;
							} else {
								local313--;
								local253--;
							}
							local359 = local253 - local268;
							if (local359 < 0) {
								local359 = -local359;
							}
							local369 = local283 - local313;
							if (local369 < 0) {
								local369 = -local369;
							}
							if (local359 == local369) {
								local359 = arg2.ua(local36, local52) - arg2.ua(local50, local66);
								local369 = arg2.ua(local50, local52) - arg2.ua(local36, local66);
								if (local359 < 0) {
									local359 = -local359;
								}
								if (local369 < 0) {
									local369 = -local369;
								}
							}
							local97 = local369 <= local359 ? 0 : 1;
						}
						for (local253 = 0; local253 < 13; local253++) {
							Static144.anIntArray229[local253] = -1;
							Static77.anIntArray96[local253] = 1;
						}
						@Pc(450) boolean[] local450 = local156 != null && local156.aBoolean315 ? Static351.aBooleanArrayArray19[local91] : Static181.aBooleanArrayArray11[local91];
						this.method2279(local25, local52, local15, this.anInt2744, local91, local10, local97, local156, local36, arg5, local85, local168, this.anInt2746);
						@Pc(479) boolean local479 = local156 != null && local156.anInt4338 != local156.anInt4344;
						if (!local479) {
							for (local313 = 0; local313 < 8; local313++) {
								if (Static144.anIntArray229[local313] >= 0 && Static84.anIntArray638[local313] != Static72.anIntArray89[local313]) {
									local479 = true;
									break;
								}
							}
						}
						if (!local450[local97 + 1 & 0x3]) {
							local85[1] = Static196.method2794(local85[1], (Static77.anIntArray96[2] & Static77.anIntArray96[4]) == 0);
						}
						if (!local450[local97 + 3 & 0x3]) {
							local85[3] = Static196.method2794(local85[3], (Static77.anIntArray96[6] & Static77.anIntArray96[0]) == 0);
						}
						if (!local450[local97 & 0x3]) {
							local85[0] = Static196.method2794(local85[0], (Static77.anIntArray96[2] & Static77.anIntArray96[0]) == 0);
						}
						if (!local450[local97 + 2 & 0x3]) {
							local85[2] = Static196.method2794(local85[2], (Static77.anIntArray96[4] & Static77.anIntArray96[6]) == 0);
						}
						if (!local82 && (local91 == 0 || local91 == 12)) {
							if (local85[0] && !local85[1] && !local85[2] && local85[3]) {
								local91 = local91 == 0 ? 13 : 14;
								local85[0] = local85[3] = false;
								local97 = 0;
							} else if (local85[0] && local85[1] && !local85[2] && !local85[3]) {
								local85[0] = local85[1] = false;
								local97 = 3;
								local91 = local91 == 0 ? 13 : 14;
							} else if (!local85[0] && local85[1] && local85[2] && !local85[3]) {
								local91 = local91 == 0 ? 13 : 14;
								local97 = 2;
								local85[1] = local85[2] = false;
							} else if (!local85[0] && !local85[1] && local85[2] && local85[3]) {
								local91 = local91 == 0 ? 13 : 14;
								local97 = 1;
								local85[2] = local85[3] = false;
							}
						}
						@Pc(793) boolean local793 = !local82 && !local85[0] && !local85[2] && !local85[1] && !local85[3];
						@Pc(795) int[] local795 = null;
						@Pc(809) int[] local809;
						@Pc(825) int[] local825;
						@Pc(821) int[] local821;
						if (local793) {
							local359 = local168 == null ? 0 : Static361.anIntArray526[local91];
							local809 = Static450.anIntArrayArray189[local91];
							local369 = local156 == null ? 0 : Static306.anIntArray469[local91];
							local821 = Static454.anIntArrayArray186[local91];
							local825 = Static57.anIntArrayArray30[local91];
						} else if (local82) {
							local359 = local168 == null ? 0 : Static448.anIntArray612[local91];
							local369 = local156 == null ? 0 : Static24.anIntArray42[local91];
							local809 = Static257.anIntArrayArray112[local91];
							local821 = Static164.anIntArrayArray70[local91];
							local795 = Static333.anIntArrayArray145[local91];
							local825 = Static299.anIntArrayArray128[local91];
						} else {
							local359 = local168 == null ? 0 : Static198.anIntArray285[local91];
							local825 = Static3.anIntArrayArray6[local91];
							local795 = Static177.anIntArrayArray75[local91];
							local821 = Static83.anIntArrayArray39[local91];
							local809 = Static235.anIntArrayArray101[local91];
							local369 = local156 == null ? 0 : Static213.anIntArray336[local91];
						}
						@Pc(899) int local899 = local369 + local359;
						if (local899 <= 0) {
							Static83.method1221(arg3, local36, local52);
						} else {
							if (local85[0]) {
								local899++;
							}
							if (local85[2]) {
								local899++;
							}
							if (local85[1]) {
								local899++;
							}
							if (local85[3]) {
								local899++;
							}
							@Pc(929) int local929 = 0;
							@Pc(931) int local931 = 0;
							@Pc(935) int local935 = local899 * 3;
							@Pc(942) int[] local942 = local479 ? new int[local935] : null;
							@Pc(945) int[] local945 = new int[local935];
							@Pc(948) int[] local948 = new int[local935];
							@Pc(951) int[] local951 = new int[local935];
							@Pc(954) int[] local954 = new int[local935];
							@Pc(957) int[] local957 = new int[local935];
							@Pc(964) int[] local964 = arg1 == null ? null : new int[local935];
							@Pc(973) int[] local973 = arg1 == null && arg4 == null ? null : new int[local935];
							@Pc(975) int local975 = -1;
							@Pc(977) int local977 = -1;
							@Pc(979) int local979 = 256;
							@Pc(1053) byte local1053;
							@Pc(1001) int local1001;
							@Pc(1003) int local1003;
							@Pc(1232) int local1232;
							@Pc(1238) int local1238;
							@Pc(1247) int local1247;
							@Pc(1252) int local1252;
							@Pc(1272) int local1272;
							@Pc(1257) int local1257;
							@Pc(1277) int local1277;
							@Pc(1327) int local1327;
							@Pc(1334) int local1334;
							if (local156 != null) {
								local975 = local156.anInt4338;
								local977 = arg5.method6002() ? local156.anInt4349 : local156.anInt4353;
								local979 = local156.anInt4337;
								local1001 = Static69.method1086(arg5, local156);
								for (local1003 = 0; local1003 < local369; local1003++) {
									if (local85[-local97 & 0x3] && local929 == local795[0]) {
										Static53.anIntArray67[0] = local809[local929];
										Static53.anIntArray67[1] = 1;
										Static53.anIntArray67[2] = local821[local929];
										Static53.anIntArray67[3] = 1;
										Static53.anIntArray67[4] = local825[local929];
										Static53.anIntArray67[5] = local821[local929];
										local1053 = 6;
									} else if (local85[2 - local97 & 0x3] && local929 == local795[2]) {
										Static53.anIntArray67[0] = local809[local929];
										Static53.anIntArray67[1] = 5;
										Static53.anIntArray67[2] = local821[local929];
										Static53.anIntArray67[3] = 5;
										Static53.anIntArray67[4] = local825[local929];
										local1053 = 6;
										Static53.anIntArray67[5] = local821[local929];
									} else if (local85[1 - local97 & 0x3] && local929 == local795[1]) {
										Static53.anIntArray67[0] = local809[local929];
										Static53.anIntArray67[1] = 3;
										Static53.anIntArray67[2] = local821[local929];
										Static53.anIntArray67[3] = 3;
										Static53.anIntArray67[4] = local825[local929];
										Static53.anIntArray67[5] = local821[local929];
										local1053 = 6;
									} else if (local85[3 - local97 & 0x3] && local929 == local795[3]) {
										Static53.anIntArray67[0] = local809[local929];
										Static53.anIntArray67[1] = 7;
										Static53.anIntArray67[2] = local821[local929];
										Static53.anIntArray67[3] = 7;
										Static53.anIntArray67[4] = local825[local929];
										local1053 = 6;
										Static53.anIntArray67[5] = local821[local929];
									} else {
										Static53.anIntArray67[0] = local809[local929];
										Static53.anIntArray67[1] = local825[local929];
										Static53.anIntArray67[2] = local821[local929];
										local1053 = 3;
									}
									local929++;
									for (local1232 = 0; local1232 < local1053; local1232++) {
										local1238 = Static53.anIntArray67[local1232];
										local1247 = local1238 - local97 * 2 & 0x7;
										local1252 = this.anIntArray233[local1238];
										local1257 = this.anIntArray234[local1238];
										if (local97 == 1) {
											local1272 = local1257;
											local1277 = 128 - local1252;
										} else if (local97 == 2) {
											local1272 = 128 - local1252;
											local1277 = 128 - local1257;
										} else if (local97 == 3) {
											local1277 = local1252;
											local1272 = 128 - local1257;
										} else {
											local1272 = local1252;
											local1277 = local1257;
										}
										local945[local931] = local1272;
										local948[local931] = local1277;
										if (local964 != null && Static161.aBooleanArrayArray10[local91][local1238]) {
											local1327 = local1272 + (local36 << 7);
											local1334 = (local52 << 7) + local1277;
											local964[local931] = arg1.ca(local1327, local1334) - arg2.ca(local1327, local1334);
										}
										if (local973 != null) {
											if (arg1 != null && !Static161.aBooleanArrayArray10[local91][local1238]) {
												local1327 = local1272 + (local36 << 7);
												local1334 = local1277 + (local52 << 7);
												local973[local931] = arg2.ca(local1327, local1334) - arg1.ca(local1327, local1334);
											} else if (arg4 != null && !Static34.aBooleanArrayArray3[local91][local1238]) {
												local1327 = local1272 + (local36 << 7);
												local1334 = local1277 + (local52 << 7);
												local973[local931] = arg4.ca(local1327, local1334) - arg2.ca(local1327, local1334);
											}
										}
										if (local1238 < 8 && Static144.anIntArray229[local1247] > local156.anInt4341) {
											if (local942 != null) {
												local942[local931] = Static72.anIntArray89[local1247];
											}
											local957[local931] = Static131.anIntArray198[local1247];
											local954[local931] = Static232.anIntArray352[local1247];
											local951[local931] = Static84.anIntArray638[local1247];
										} else {
											if (local942 != null) {
												local942[local931] = local1001;
											}
											local954[local931] = arg5.method6002() ? local156.anInt4349 : local156.anInt4353;
											local957[local931] = local156.anInt4337;
											local951[local931] = local975;
										}
										local931++;
									}
								}
								if (!this.aBoolean171 && arg3 == 0) {
									Static204.method2868(local36, local52, local156.anInt4347, local156.anInt4340 * 8, local156.anInt4354);
								}
								if (local91 != 12 && local156.anInt4338 != -1 && local156.aBoolean316) {
									local80 = true;
								}
							} else if (local793) {
								local929 = Static306.anIntArray469[local91];
							} else if (local82) {
								local929 = Static24.anIntArray42[local91];
							} else {
								local929 = Static213.anIntArray336[local91];
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
								@Pc(1576) Class161 local1576 = this.aClass210_5.method4903(local113 - 1);
								@Pc(1584) Class161 local1584 = this.aClass210_5.method4903(local121 - 1);
								@Pc(1594) Class161 local1594 = this.aClass210_5.method4903(local129 - 1);
								@Pc(1602) Class161 local1602 = this.aClass210_5.method4903(local137 - 1);
								for (local1247 = 0; local1247 < local359; local1247++) {
									if (local85[-local97 & 0x3] && local795[0] == local929) {
										Static53.anIntArray67[0] = local809[local929];
										Static53.anIntArray67[1] = 1;
										Static53.anIntArray67[2] = local821[local929];
										Static53.anIntArray67[3] = 1;
										Static53.anIntArray67[4] = local825[local929];
										Static53.anIntArray67[5] = local821[local929];
										local1053 = 6;
									} else if (local85[2 - local97 & 0x3] && local795[2] == local929) {
										Static53.anIntArray67[0] = local809[local929];
										Static53.anIntArray67[1] = 5;
										Static53.anIntArray67[2] = local821[local929];
										Static53.anIntArray67[3] = 5;
										Static53.anIntArray67[4] = local825[local929];
										local1053 = 6;
										Static53.anIntArray67[5] = local821[local929];
									} else if (local85[1 - local97 & 0x3] && local929 == local795[1]) {
										Static53.anIntArray67[0] = local809[local929];
										Static53.anIntArray67[1] = 3;
										Static53.anIntArray67[2] = local821[local929];
										Static53.anIntArray67[3] = 3;
										Static53.anIntArray67[4] = local825[local929];
										Static53.anIntArray67[5] = local821[local929];
										local1053 = 6;
									} else if (local85[3 - local97 & 0x3] && local795[3] == local929) {
										Static53.anIntArray67[0] = local809[local929];
										Static53.anIntArray67[1] = 7;
										Static53.anIntArray67[2] = local821[local929];
										Static53.anIntArray67[3] = 7;
										Static53.anIntArray67[4] = local825[local929];
										Static53.anIntArray67[5] = local821[local929];
										local1053 = 6;
									} else {
										Static53.anIntArray67[0] = local809[local929];
										Static53.anIntArray67[1] = local825[local929];
										local1053 = 3;
										Static53.anIntArray67[2] = local821[local929];
									}
									for (local1252 = 0; local1252 < local1053; local1252++) {
										local1272 = Static53.anIntArray67[local1252];
										local1257 = local1272 - local97 * 2 & 0x7;
										local1277 = this.anIntArray233[local1272];
										local1334 = this.anIntArray234[local1272];
										@Pc(1879) int local1879;
										if (local97 == 1) {
											local1327 = local1334;
											local1879 = 128 - local1277;
										} else if (local97 == 2) {
											local1327 = 128 - local1277;
											local1879 = 128 - local1334;
										} else if (local97 == 3) {
											local1327 = 128 - local1334;
											local1879 = local1277;
										} else {
											local1327 = local1277;
											local1879 = local1334;
										}
										local945[local931] = local1327;
										local948[local931] = local1879;
										@Pc(1931) int local1931;
										@Pc(1938) int local1938;
										if (local964 != null && Static161.aBooleanArrayArray10[local91][local1272]) {
											local1931 = local1327 + (local36 << 7);
											local1938 = (local52 << 7) + local1879;
											local964[local931] = arg1.ca(local1931, local1938) - arg2.ca(local1931, local1938);
										}
										if (local973 != null) {
											if (arg1 != null && !Static161.aBooleanArrayArray10[local91][local1272]) {
												local1931 = local1327 + (local36 << 7);
												local1938 = local1879 + (local52 << 7);
												local973[local931] = arg2.ca(local1931, local1938) - arg1.ca(local1931, local1938);
											} else if (arg4 != null && !Static34.aBooleanArrayArray3[local91][local1272]) {
												local1931 = (local36 << 7) + local1327;
												local1938 = local1879 + (local52 << 7);
												local973[local931] = arg4.ca(local1931, local1938) - arg2.ca(local1931, local1938);
											}
										}
										if (local1272 < 8 && Static144.anIntArray229[local1257] >= 0) {
											if (local942 != null) {
												local942[local931] = Static72.anIntArray89[local1257];
											}
											local957[local931] = Static131.anIntArray198[local1257];
											local954[local931] = Static232.anIntArray352[local1257];
											local951[local931] = Static84.anIntArray638[local1257];
										} else {
											if (local82 && Static161.aBooleanArrayArray10[local91][local1272]) {
												local954[local931] = local977;
												local957[local931] = local979;
												local951[local931] = local975;
											} else if (local1327 == 0 && local1879 == 0) {
												local951[local931] = arg0[local36][local52];
												local954[local931] = local1576.anInt3991;
												local957[local931] = local1576.anInt3993;
											} else if (local1327 == 0 && local1879 == 128) {
												local951[local931] = arg0[local36][local66];
												local954[local931] = local1584.anInt3991;
												local957[local931] = local1584.anInt3993;
											} else if (local1327 == 128 && local1879 == 128) {
												local951[local931] = arg0[local50][local66];
												local954[local931] = local1594.anInt3991;
												local957[local931] = local1594.anInt3993;
											} else if (local1327 == 128 && local1879 == 0) {
												local951[local931] = arg0[local50][local52];
												local954[local931] = local1602.anInt3991;
												local957[local931] = local1602.anInt3993;
											} else {
												if (local1327 >= 64) {
													if (local1879 < 64) {
														local954[local931] = local1602.anInt3991;
														local957[local931] = local1602.anInt3993;
													} else {
														local954[local931] = local1594.anInt3991;
														local957[local931] = local1594.anInt3993;
													}
												} else if (local1879 < 64) {
													local954[local931] = local1576.anInt3991;
													local957[local931] = local1576.anInt3993;
												} else {
													local954[local931] = local1584.anInt3991;
													local957[local931] = local1584.anInt3993;
												}
												local1931 = Static94.method4449(local1327 << 7 >> 7, arg0[local50][local52], arg0[local36][local52]);
												local1938 = Static94.method4449(local1327 << 7 >> 7, arg0[local50][local66], arg0[local36][local66]);
												local951[local931] = Static94.method4449(local1879 << 7 >> 7, local1938, local1931);
											}
											if (local942 != null) {
												local942[local931] = local951[local931];
											}
										}
										local931++;
									}
									local929++;
								}
								if (local91 != 0 && local168.aBoolean263) {
									local80 = true;
								}
							}
							local1001 = arg2.ua(local36, local52);
							local1003 = arg2.ua(local50, local52);
							local1232 = arg2.ua(local50, local66);
							local1238 = arg2.ua(local36, local66);
							if (arg3 > 0) {
								@Pc(2356) boolean local2356 = true;
								if (local113 == 0 && local91 != 0) {
									local2356 = false;
								}
								if (local105 > 0 && local176 != null && !local176.aBoolean317) {
									local2356 = false;
								}
								if (local2356 && local1003 == local1001 && local1232 == local1001 && local1001 == local1238) {
									this.aByteArrayArrayArray8[arg3][local36][local52] = (byte) (this.aByteArrayArrayArray8[arg3][local36][local52] | 0x4);
								}
							}
							local1247 = 0;
							local1252 = 0;
							local1272 = 0;
							if (this.aBoolean171) {
								local1247 = Static183.method2649(local36, local52);
								local1252 = Static25.method5839(local36, local52);
								local1272 = Static92.method1396(local36, local52);
							}
							arg2.pa(local36, local52, local945, local964, local948, local973, local951, local942, local954, local957, local1247, local1252, local1272, local80);
							Static83.method1221(arg3, local36, local52);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "([[BI[[BII[[BILclient!md;ILclient!za;[ZLclient!lk;BI)V")
	private void method2279(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class168 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class75 arg9, @OriginalArg(10) boolean[] arg10, @OriginalArg(11) Class161 arg11, @OriginalArg(13) int arg12) {
		@Pc(18) boolean[] local18 = arg7 != null && arg7.aBoolean315 ? Static351.aBooleanArrayArray19[arg4] : Static181.aBooleanArrayArray11[arg4];
		@Pc(37) int local37;
		@Pc(50) Class168 local50;
		@Pc(67) byte local67;
		@Pc(83) int local83;
		@Pc(88) int local88;
		if (arg1 > 0) {
			if (arg8 > 0) {
				local37 = arg0[arg8 - 1][arg1 - 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass227_3.method5234(local37 - 1);
					if (local50.anInt4338 != -1 && local50.aBoolean315) {
						local67 = arg5[arg8 - 1][arg1 - 1];
						local83 = arg2[arg8 - 1][arg1 - 1] * 2 + 4 & 0x7;
						local88 = Static69.method1086(arg9, local50);
						if (Static161.aBooleanArrayArray10[local67][local83]) {
							Static84.anIntArray638[0] = local50.anInt4338;
							Static72.anIntArray89[0] = local88;
							Static232.anIntArray352[0] = arg9.method6002() ? local50.anInt4349 : local50.anInt4353;
							Static131.anIntArray198[0] = local50.anInt4337;
							Static144.anIntArray229[0] = local50.anInt4341;
							Static77.anIntArray96[0] = 256;
						}
					}
				}
			}
			if (arg3 - 1 > arg8) {
				local37 = arg0[arg8 + 1][arg1 - 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass227_3.method5234(local37 - 1);
					if (local50.anInt4338 != -1 && local50.aBoolean315) {
						local67 = arg5[arg8 + 1][arg1 - 1];
						local83 = arg2[arg8 + 1][arg1 - 1] * 2 + 6 & 0x7;
						local88 = Static69.method1086(arg9, local50);
						if (Static161.aBooleanArrayArray10[local67][local83]) {
							Static84.anIntArray638[2] = local50.anInt4338;
							Static72.anIntArray89[2] = local88;
							Static232.anIntArray352[2] = arg9.method6002() ? local50.anInt4349 : local50.anInt4353;
							Static131.anIntArray198[2] = local50.anInt4337;
							Static144.anIntArray229[2] = local50.anInt4341;
							Static77.anIntArray96[2] = 512;
						}
					}
				}
			}
		}
		if (arg12 - 1 > arg1) {
			if (arg8 > 0) {
				local37 = arg0[arg8 - 1][arg1 + 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass227_3.method5234(local37 - 1);
					if (local50.anInt4338 != -1 && local50.aBoolean315) {
						local67 = arg5[arg8 - 1][arg1 + 1];
						local83 = arg2[arg8 - 1][arg1 + 1] * 2 + 2 & 0x7;
						local88 = Static69.method1086(arg9, local50);
						if (Static161.aBooleanArrayArray10[local67][local83]) {
							Static84.anIntArray638[6] = local50.anInt4338;
							Static72.anIntArray89[6] = local88;
							Static232.anIntArray352[6] = arg9.method6002() ? local50.anInt4349 : local50.anInt4353;
							Static131.anIntArray198[6] = local50.anInt4337;
							Static144.anIntArray229[6] = local50.anInt4341;
							Static77.anIntArray96[6] = 64;
						}
					}
				}
			}
			if (arg8 < arg3 - 1) {
				local37 = arg0[arg8 + 1][arg1 + 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass227_3.method5234(local37 - 1);
					if (local50.anInt4338 != -1 && local50.aBoolean315) {
						local67 = arg5[arg8 + 1][arg1 + 1];
						local83 = --(arg2[arg8 + 1][arg1 + 1] * 2) & 0x7;
						local88 = Static69.method1086(arg9, local50);
						if (Static161.aBooleanArrayArray10[local67][local83]) {
							Static84.anIntArray638[4] = local50.anInt4338;
							Static72.anIntArray89[4] = local88;
							Static232.anIntArray352[4] = arg9.method6002() ? local50.anInt4349 : local50.anInt4353;
							Static131.anIntArray198[4] = local50.anInt4337;
							Static144.anIntArray229[4] = local50.anInt4341;
							Static77.anIntArray96[4] = 128;
						}
					}
				}
			}
		}
		@Pc(535) int local535;
		@Pc(540) int local540;
		@Pc(542) int local542;
		@Pc(523) byte local523;
		if (arg1 > 0) {
			local37 = arg0[arg8][arg1 - 1] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass227_3.method5234(local37 - 1);
				if (local50.anInt4338 != -1) {
					local67 = arg5[arg8][arg1 - 1];
					local523 = arg2[arg8][arg1 - 1];
					if (local50.aBoolean315) {
						local88 = 2;
						local535 = local523 * 2 + 4;
						local540 = Static69.method1086(arg9, local50);
						for (local542 = 0; local542 < 3; local542++) {
							local535 &= 0x7;
							local88 &= 0x7;
							if (Static161.aBooleanArrayArray10[local67][local535] && Static144.anIntArray229[local88] <= local50.anInt4341) {
								Static84.anIntArray638[local88] = local50.anInt4338;
								Static72.anIntArray89[local88] = local540;
								Static232.anIntArray352[local88] = arg9.method6002() ? local50.anInt4349 : local50.anInt4353;
								Static131.anIntArray198[local88] = local50.anInt4337;
								if (local50.anInt4341 == Static144.anIntArray229[local88]) {
									Static77.anIntArray96[local88] |= 0x20;
								} else {
									Static77.anIntArray96[local88] = 32;
								}
								Static144.anIntArray229[local88] = local50.anInt4341;
							}
							local88--;
							local535++;
						}
						if (!local18[arg6 & 0x3]) {
							arg10[0] = Static351.aBooleanArrayArray19[local67][local523 + 2 & 0x3];
						}
					} else if (!local18[arg6 & 0x3]) {
						arg10[0] = Static181.aBooleanArrayArray11[local67][local523 + 2 & 0x3];
					}
				}
			}
		}
		if (arg12 - 1 > arg1) {
			local37 = arg0[arg8][arg1 + 1] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass227_3.method5234(local37 - 1);
				if (local50.anInt4338 != -1) {
					local67 = arg5[arg8][arg1 + 1];
					local523 = arg2[arg8][arg1 + 1];
					if (local50.aBoolean315) {
						local88 = 4;
						local535 = local523 * 2 + 2;
						local540 = Static69.method1086(arg9, local50);
						for (local542 = 0; local542 < 3; local542++) {
							local535 &= 0x7;
							local88 &= 0x7;
							if (Static161.aBooleanArrayArray10[local67][local535] && Static144.anIntArray229[local88] <= local50.anInt4341) {
								Static84.anIntArray638[local88] = local50.anInt4338;
								Static72.anIntArray89[local88] = local540;
								Static232.anIntArray352[local88] = arg9.method6002() ? local50.anInt4349 : local50.anInt4353;
								Static131.anIntArray198[local88] = local50.anInt4337;
								if (Static144.anIntArray229[local88] == local50.anInt4341) {
									Static77.anIntArray96[local88] |= 0x10;
								} else {
									Static77.anIntArray96[local88] = 16;
								}
								Static144.anIntArray229[local88] = local50.anInt4341;
							}
							local535--;
							local88++;
						}
						if (!local18[arg6 + 2 & 0x3]) {
							arg10[2] = Static351.aBooleanArrayArray19[local67][--local523 & 0x3];
						}
					} else if (!local18[arg6 + 2 & 0x3]) {
						arg10[2] = Static181.aBooleanArrayArray11[local67][--local523 & 0x3];
					}
				}
			}
		}
		if (arg8 > 0) {
			local37 = arg0[arg8 - 1][arg1] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass227_3.method5234(local37 - 1);
				if (local50.anInt4338 != -1) {
					local67 = arg5[arg8 - 1][arg1];
					local523 = arg2[arg8 - 1][arg1];
					if (local50.aBoolean315) {
						local88 = 6;
						local535 = local523 * 2 + 4;
						local540 = Static69.method1086(arg9, local50);
						for (local542 = 0; local542 < 3; local542++) {
							local88 &= 0x7;
							local535 &= 0x7;
							if (Static161.aBooleanArrayArray10[local67][local535] && Static144.anIntArray229[local88] <= local50.anInt4341) {
								Static84.anIntArray638[local88] = local50.anInt4338;
								Static72.anIntArray89[local88] = local540;
								Static232.anIntArray352[local88] = arg9.method6002() ? local50.anInt4349 : local50.anInt4353;
								Static131.anIntArray198[local88] = local50.anInt4337;
								if (local50.anInt4341 == Static144.anIntArray229[local88]) {
									Static77.anIntArray96[local88] |= 0x8;
								} else {
									Static77.anIntArray96[local88] = 8;
								}
								Static144.anIntArray229[local88] = local50.anInt4341;
							}
							local535--;
							local88++;
						}
						if (!local18[arg6 + 3 & 0x3]) {
							arg10[3] = Static351.aBooleanArrayArray19[local67][local523 + 1 & 0x3];
						}
					} else if (!local18[arg6 + 3 & 0x3]) {
						arg10[3] = Static181.aBooleanArrayArray11[local67][local523 + 1 & 0x3];
					}
				}
			}
		}
		if (arg8 < arg3 - 1) {
			local37 = arg0[arg8 + 1][arg1] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass227_3.method5234(local37 - 1);
				if (local50.anInt4338 != -1) {
					local67 = arg5[arg8 + 1][arg1];
					local523 = arg2[arg8 + 1][arg1];
					if (local50.aBoolean315) {
						local88 = 4;
						local535 = local523 * 2 + 6;
						local540 = Static69.method1086(arg9, local50);
						for (local542 = 0; local542 < 3; local542++) {
							local535 &= 0x7;
							local88 &= 0x7;
							if (Static161.aBooleanArrayArray10[local67][local535] && local50.anInt4341 >= Static144.anIntArray229[local88]) {
								Static84.anIntArray638[local88] = local50.anInt4338;
								Static72.anIntArray89[local88] = local540;
								Static232.anIntArray352[local88] = arg9.method6002() ? local50.anInt4349 : local50.anInt4353;
								Static131.anIntArray198[local88] = local50.anInt4337;
								if (Static144.anIntArray229[local88] == local50.anInt4341) {
									Static77.anIntArray96[local88] |= 0x4;
								} else {
									Static77.anIntArray96[local88] = 4;
								}
								Static144.anIntArray229[local88] = local50.anInt4341;
							}
							local88--;
							local535++;
						}
						if (!local18[arg6 + 1 & 0x3]) {
							arg10[1] = Static351.aBooleanArrayArray19[local67][local523 + 3 & 0x3];
						}
					} else if (!local18[arg6 + 1 & 0x3]) {
						arg10[1] = Static181.aBooleanArrayArray11[local67][local523 + 3 & 0x3];
					}
				}
			}
		}
		if (arg7 == null) {
			return;
		}
		local37 = Static69.method1086(arg9, arg7);
		if (!arg7.aBoolean315) {
			return;
		}
		for (@Pc(1257) int local1257 = 0; local1257 < 8; local1257++) {
			@Pc(1267) int local1267 = local1257 - arg6 * 2 & 0x7;
			if (Static161.aBooleanArrayArray10[arg4][local1257] && arg7.anInt4341 >= Static144.anIntArray229[local1267]) {
				Static84.anIntArray638[local1267] = arg7.anInt4338;
				Static72.anIntArray89[local1267] = local37;
				Static232.anIntArray352[local1267] = arg9.method6002() ? arg7.anInt4349 : arg7.anInt4353;
				Static131.anIntArray198[local1267] = arg7.anInt4337;
				if (arg7.anInt4341 == Static144.anIntArray229[local1267]) {
					Static77.anIntArray96[local1267] |= 0x2;
				} else {
					Static77.anIntArray96[local1267] = 2;
				}
				Static144.anIntArray229[local1267] = arg7.anInt4341;
			}
		}
		return;
	}
}
