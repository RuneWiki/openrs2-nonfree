import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public class Class200 {

	@OriginalMember(owner = "client!nh", name = "t", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray23;

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "[I")
	private final int[] anIntArray674 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "[I")
	private final int[] anIntArray675 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!nh", name = "s", descriptor = "Z")
	public final boolean aBoolean639;

	@OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
	public final int anInt8825;

	@OriginalMember(owner = "client!nh", name = "x", descriptor = "Lclient!ar;")
	private final Class16 aClass16_5;

	@OriginalMember(owner = "client!nh", name = "u", descriptor = "Lclient!ul;")
	private final Class286 aClass286_6;

	@OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
	protected final int anInt8820;

	@OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
	protected final int anInt8828;

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray21;

	@OriginalMember(owner = "client!nh", name = "m", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray22;

	@OriginalMember(owner = "client!nh", name = "v", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray22;

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray20;

	@OriginalMember(owner = "client!nh", name = "A", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray25;

	@OriginalMember(owner = "client!nh", name = "z", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray24;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(IIIZLclient!ul;Lclient!ar;)V")
	protected Class200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class286 arg4, @OriginalArg(5) Class16 arg5) {
		this.aBoolean639 = arg3;
		this.anInt8825 = arg0;
		this.aClass16_5 = arg5;
		this.aClass286_6 = arg4;
		this.anInt8820 = arg2;
		this.anInt8828 = arg1;
		this.aByteArrayArrayArray21 = new byte[this.anInt8825][this.anInt8828 + 1][this.anInt8820 + 1];
		this.aByteArrayArrayArray22 = new byte[this.anInt8825][this.anInt8828][this.anInt8820];
		this.anIntArrayArrayArray22 = new int[this.anInt8825][this.anInt8828 + 1][this.anInt8820 + 1];
		this.aByteArrayArrayArray20 = new byte[this.anInt8825][this.anInt8828][this.anInt8820];
		this.aByteArrayArrayArray25 = new byte[this.anInt8825][this.anInt8828][this.anInt8820];
		this.aByteArrayArrayArray24 = new byte[this.anInt8825][this.anInt8828][this.anInt8820];
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "([[IZI)V")
	public final void method7397(@OriginalArg(0) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray22[0];
		for (@Pc(16) int local16 = 0; local16 < this.anInt8828 + 1; local16++) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt8820 + 1; local20++) {
				local10[local16][local20] += arg0[local16][local20];
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!ps;IIII[Lclient!gea;I)V")
	public final void method7398(@OriginalArg(0) Class2_Sub29 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class99[] arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(29) int local29;
		if (!this.aBoolean639) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class99 local16 = arg4[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local29 = arg1 + local18;
						@Pc(33) int local33 = local22 + arg3;
						if (local29 >= 0 && this.anInt8828 > local29 && local33 >= 0 && local33 < this.anInt8820) {
							local16.method2637(local29, local33);
						}
					}
				}
			}
		}
		local10 = arg5 + arg1;
		@Pc(79) int local79 = arg3 + arg2;
		for (local18 = 0; local18 < this.anInt8825; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local29 = 0; local29 < 64; local29++) {
					this.method7401(arg0, local18, 0, local22 + arg1, 0, local10 + local22, false, 0, arg3 + local29, local79 - -local29);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLclient!qa;[Lclient!gea;[[[I)V")
	public final void method7399(@OriginalArg(1) Class39 arg0, @OriginalArg(2) Class99[] arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(22) int local22;
		if (!this.aBoolean639) {
			for (local14 = 0; local14 < 4; local14++) {
				for (local18 = 0; local18 < this.anInt8828; local18++) {
					for (local22 = 0; local22 < this.anInt8820; local22++) {
						if ((Static267.aByteArrayArrayArray19[local14][local18][local22] & 0x1) != 0) {
							@Pc(39) int local39 = local14;
							if ((Static267.aByteArrayArrayArray19[1][local18][local22] & 0x2) != 0) {
								local39 = local14 - 1;
							}
							if (local39 >= 0) {
								arg1[local39].method2652(local18, local22);
							}
						}
					}
				}
			}
		}
		for (local14 = 0; local14 < this.anInt8825; local14++) {
			local18 = 0;
			local22 = 0;
			if (!this.aBoolean639) {
				if (Static136.aBoolean215) {
					local18 = 2;
				}
				if (Static505.aBoolean640) {
					local22 = 8;
				}
				if (Static438.anInt7981 != 0) {
					local18 |= 0x1;
					if (local14 == 0 | Static426.aBoolean579) {
						local22 |= 0x10;
					}
				}
			}
			if (Static136.aBoolean215) {
				local22 |= 0x7;
			}
			if (!Static118.aBoolean206) {
				local22 |= 0x20;
			}
			@Pc(153) int[][] local153 = arg2 == null || local14 >= arg2.length ? this.anIntArrayArrayArray22[local14] : arg2[local14];
			Static45.method836(local14, arg0.method6081(this.anInt8828, this.anInt8820, this.anIntArrayArrayArray22[local14], local153, local18, local22));
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II[Lclient!gea;IILclient!ps;IIII)V")
	public final void method7400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class99[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub29 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg4 & 0x7) * 8;
		@Pc(17) int local17 = (arg8 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(56) int local56;
		if (!this.aBoolean639) {
			@Pc(24) Class99 local24 = arg2[arg6];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(44) int local44 = arg7 + Static216.method3435(arg3, local26 & 0x7, local30 & 0x7);
					local56 = Static172.method5413(arg3, local30 & 0x7, local26 & 0x7) + arg0;
					if (local44 > 0 && this.anInt8828 - 1 > local44 && local56 > 0 && this.anInt8820 - 1 > local56) {
						local24.method2637(local44, local56);
					}
				}
			}
		}
		@Pc(103) int local103 = (arg4 & 0x1FFFFFF8) << 3;
		local26 = (arg8 & 0x1FFFFFF8) << 3;
		@Pc(117) byte local117 = 0;
		@Pc(119) byte local119 = 0;
		if (arg3 == 1) {
			local119 = 1;
		} else if (arg3 == 2) {
			local119 = 1;
			local117 = 1;
		} else if (arg3 == 3) {
			local117 = 1;
		}
		for (local56 = 0; local56 < this.anInt8825; local56++) {
			for (@Pc(148) int local148 = 0; local148 < 64; local148++) {
				for (@Pc(152) int local152 = 0; local152 < 64; local152++) {
					if (local56 == arg1 && local148 >= local11 && local11 + 8 >= local148 && local152 >= local17 && local17 + 8 >= local152) {
						@Pc(199) int local199;
						@Pc(211) int local211;
						if (local148 == local11 + 8 || local17 + 8 == local152) {
							if (arg3 == 0) {
								local199 = arg7 + local148 - local11;
								local211 = local152 + arg0 - local17;
							} else if (arg3 == 1) {
								local211 = arg0 + local11 + 8 - local148;
								local199 = local152 + arg7 - local17;
							} else if (arg3 == 2) {
								local211 = local17 + arg0 + 8 - local152;
								local199 = local11 + arg7 + 8 - local148;
							} else {
								local199 = arg7 + local17 + 8 - local152;
								local211 = arg0 + local148 - local11;
							}
							this.method7401(arg5, arg6, 0, local199, 0, local148 + local103, true, 0, local211, local152 + local26);
						} else {
							local199 = Static216.method3435(arg3, local148 & 0x7, local152 & 0x7) + arg7;
							local211 = Static172.method5413(arg3, local152 & 0x7, local148 & 0x7) + arg0;
							this.method7401(arg5, arg6, local119, local199, arg3, local103 + local148, false, local117, local211, local152 + local26);
						}
						if (local148 == 63 || local152 == 63) {
							@Pc(338) byte local338 = 1;
							if (local148 == 63 && local152 == 63) {
								local338 = 3;
							}
							for (@Pc(350) int local350 = 0; local350 < local338; local350++) {
								@Pc(354) int local354 = local148;
								@Pc(356) int local356 = local152;
								if (local350 == 0) {
									local354 = local148 == 63 ? 64 : local148;
									local356 = local152 == 63 ? 64 : local152;
								} else if (local350 == 1) {
									local354 = 64;
								} else if (local350 == 2) {
									local356 = 64;
								}
								@Pc(405) int local405;
								@Pc(414) int local414;
								if (arg3 == 0) {
									local414 = local356 + arg0 - local17;
									local405 = arg7 + local354 - local11;
								} else if (arg3 == 1) {
									local405 = arg7 + local356 - local17;
									local414 = local11 + arg0 + 8 - local354;
								} else if (arg3 == 2) {
									local414 = local17 + arg0 + 8 - local356;
									local405 = local11 + arg7 + 8 - local354;
								} else {
									local405 = arg7 + local17 + 8 - local356;
									local414 = arg0 + local354 - local11;
								}
								if (local405 >= 0 && local405 < this.anInt8828 && local414 >= 0 && local414 < this.anInt8820) {
									this.anIntArrayArrayArray22[arg6][local405][local414] = this.anIntArrayArrayArray22[arg6][local117 + local199][local119 + local211];
								}
							}
						}
					} else {
						this.method7401(arg5, 0, 0, -1, 0, 0, false, 0, -1, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!ps;IIIIIZIZII)V")
	private void method7401(@OriginalArg(0) Class2_Sub29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg4 == 1) {
			arg2 = 1;
		} else if (arg4 == 2) {
			arg7 = 1;
			arg2 = 1;
		} else if (arg4 == 3) {
			arg7 = 1;
		}
		@Pc(62) int local62;
		if (arg3 < 0 || arg3 >= this.anInt8828 || arg8 < 0 || arg8 >= this.anInt8820) {
			while (true) {
				local62 = arg0.method5170();
				if (local62 == 0) {
					break;
				}
				if (local62 == 1) {
					arg0.method5170();
					break;
				}
				if (local62 <= 49) {
					arg0.method5170();
				}
			}
			return;
		}
		if (!this.aBoolean639 && !arg6) {
			Static267.aByteArrayArrayArray19[arg1][arg3][arg8] = 0;
		}
		while (true) {
			local62 = arg0.method5170();
			if (local62 == 0) {
				if (this.aBoolean639) {
					this.anIntArrayArrayArray22[0][arg3 + arg7][arg2 + arg8] = 0;
				} else if (arg1 == 0) {
					this.anIntArrayArrayArray22[0][arg3 + arg7][arg8 + arg2] = -Static61.method1136(arg9 + 556238, arg5 + 932731) * 8 << 0;
				} else {
					this.anIntArrayArrayArray22[arg1][arg3 + arg7][arg8 + arg2] = this.anIntArrayArrayArray22[arg1 - 1][arg3 + arg7][arg2 + arg8] - 240;
				}
				break;
			}
			if (local62 == 1) {
				@Pc(153) int local153 = arg0.method5170();
				if (this.aBoolean639) {
					this.anIntArrayArrayArray22[0][arg3 + arg7][arg8 + arg2] = local153 * 8 << 0;
				} else {
					if (local153 == 1) {
						local153 = 0;
					}
					if (arg1 == 0) {
						this.anIntArrayArrayArray22[0][arg3 + arg7][arg2 + arg8] = -local153 * 8 << 0;
					} else {
						this.anIntArrayArrayArray22[arg1][arg7 + arg3][arg2 + arg8] = this.anIntArrayArrayArray22[arg1 - 1][arg3 + arg7][arg2 + arg8] - (local153 * 8 << 0);
					}
				}
				break;
			}
			if (local62 <= 49) {
				if (arg6) {
					arg0.method5170();
				} else {
					this.aByteArrayArrayArray22[arg1][arg3][arg8] = arg0.method5179();
					this.aByteArrayArrayArray25[arg1][arg3][arg8] = (byte) ((local62 - 2) / 4);
					this.aByteArrayArrayArray20[arg1][arg3][arg8] = (byte) (arg4 + local62 - 2 & 0x3);
				}
			} else if (local62 <= 81) {
				if (!this.aBoolean639 && !arg6) {
					Static267.aByteArrayArrayArray19[arg1][arg3][arg8] = (byte) (local62 - 49);
				}
			} else if (!arg6) {
				this.aByteArrayArrayArray24[arg1][arg3][arg8] = (byte) (local62 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "([[ILclient!sa;Lclient!sa;Lclient!sa;IZLclient!qa;)V")
	private void method7402(@OriginalArg(0) int[][] arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) Class75 arg2, @OriginalArg(3) Class75 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class39 arg5) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8828; local7++) {
			for (@Pc(17) int local17 = 0; local17 < this.anInt8820; local17++) {
				if (Static224.anInt4044 == -1 || Static426.method6572(local7, arg4, local17, Static224.anInt4044)) {
					@Pc(40) byte local40 = this.aByteArrayArrayArray25[arg4][local7][local17];
					@Pc(49) byte local49 = this.aByteArrayArrayArray20[arg4][local7][local17];
					@Pc(60) int local60 = this.aByteArrayArrayArray22[arg4][local7][local17] & 0xFF;
					@Pc(71) int local71 = this.aByteArrayArrayArray24[arg4][local7][local17] & 0xFF;
					@Pc(83) Class37 local83 = local60 == 0 ? null : this.aClass286_6.method7234(local60 - 1);
					@Pc(98) Class176 local98 = local71 == 0 ? null : this.aClass16_5.method574(local71 - 1);
					@Pc(100) int local100 = 0;
					@Pc(102) int local102 = 0;
					if (local40 != 0) {
						local102 = local83 == null ? 0 : Static291.anIntArray469[local40];
						local100 = local98 == null ? 0 : Static225.anIntArray409[local40];
					} else if (local83 != null) {
						local102 = Static291.anIntArray469[local40];
					} else if (local98 != null) {
						local100 = Static291.anIntArray469[local40];
					}
					@Pc(143) int local143 = local100 + local102;
					@Pc(145) int local145 = 0;
					if (local143 != 0) {
						@Pc(153) int[] local153 = new int[local143];
						@Pc(156) int[] local156 = new int[local143];
						@Pc(159) int[] local159 = new int[local143];
						@Pc(162) int[] local162 = new int[local143];
						@Pc(164) boolean local164 = false;
						@Pc(180) int local180;
						@Pc(208) int local208;
						if (local83 == null || local83.anInt1208 == -1 && local83.anInt1214 == -1 && local83.anInt1219 == -1) {
							for (local180 = 0; local180 < local102; local180++) {
								local153[local145] = -1;
								local145++;
							}
						} else {
							local180 = arg5.method6036() ? local83.anInt1219 : local83.anInt1212;
							if (Static502.aBoolean637) {
								local180 = -1;
							}
							for (local208 = 0; local208 < local102; local208++) {
								local159[local145] = local180;
								local162[local145] = local83.anInt1207;
								if (local83.anInt1208 == -1) {
									local153[local145] = -1;
								} else {
									local153[local145] = local83.anInt1208;
								}
								if (local83.anInt1214 == -1) {
									local156[local145] = -1;
								} else {
									local164 = true;
									local156[local145] = local83.anInt1214;
								}
								local145++;
							}
							if (!this.aBoolean639 && arg4 == 0) {
								Static531.method7657(local7, local17, local83.anInt1216, local83.anInt1205 * 8, local83.anInt1206);
							}
						}
						if (!local164) {
							local156 = null;
						}
						if (local98 == null) {
							for (local180 = 0; local180 < local100; local180++) {
								local153[local145] = -1;
								local145++;
							}
						} else {
							local180 = local98.anInt4999;
							if (Static502.aBoolean637) {
								local180 = -1;
							}
							for (local208 = 0; local208 < local100; local208++) {
								local159[local145] = local180;
								local162[local145] = local98.anInt5005;
								local153[local145] = arg0[local7][local17];
								if (local156 != null) {
									local156[local145] = -1;
								}
								local145++;
							}
						}
						local180 = this.anIntArray675.length;
						@Pc(352) int[] local352 = new int[local180];
						@Pc(355) int[] local355 = new int[local180];
						@Pc(362) int[] local362 = arg1 == null ? null : new int[local180];
						@Pc(371) int[] local371 = arg1 == null && arg2 == null ? null : new int[local180];
						@Pc(380) int local380;
						@Pc(385) int local385;
						@Pc(469) int local469;
						@Pc(475) int local475;
						for (@Pc(373) int local373 = 0; local373 < local180; local373++) {
							local380 = this.anIntArray675[local373];
							local385 = this.anIntArray674[local373];
							if (local49 == 0) {
								local352[local373] = local380;
								local355[local373] = local385;
							} else if (local49 == 1) {
								local352[local373] = local385;
								local355[local373] = 128 - local380;
							} else if (local49 == 2) {
								local352[local373] = 128 - local380;
								local355[local373] = 128 - local385;
							} else if (local49 == 3) {
								local352[local373] = 128 - local385;
								local355[local373] = local380;
							}
							if (local362 != null && Static469.aBooleanArrayArray5[local40][local373]) {
								local469 = local380 + (local7 << 7);
								local475 = local380 + (local17 << 7);
								local362[local373] = arg1.aa(local469, local475) - arg3.aa(local469, local475);
							}
							if (local371 != null) {
								if (arg1 != null && !Static469.aBooleanArrayArray5[local40][local373]) {
									local469 = local380 + (local7 << 7);
									local475 = local380 + (local17 << 7);
									local371[local373] = arg3.aa(local469, local475) - arg1.aa(local469, local475);
								} else if (arg2 != null && !Static203.aBooleanArrayArray2[local40][local373]) {
									local469 = (local7 << 7) + local380;
									local475 = local380 + (local17 << 7);
									local371[local373] = arg2.aa(local469, local475) - arg3.aa(local469, local475);
								}
							}
						}
						local380 = arg3.ba(local7, local17);
						local385 = arg3.ba(local7 + 1, local17);
						local469 = arg3.ba(local7 + 1, local17 + 1);
						local475 = arg3.ba(local7, local17 + 1);
						if (arg4 > 0) {
							@Pc(597) boolean local597 = true;
							if (local71 == 0 && local40 != 0) {
								local597 = false;
							}
							if (local60 > 0 && local83 != null && !local83.aBoolean73) {
								local597 = false;
							}
							if (local597 && local380 == local385 && local380 == local469 && local475 == local380) {
								this.aByteArrayArrayArray21[arg4][local7][local17] = (byte) (this.aByteArrayArrayArray21[arg4][local7][local17] | 0x4);
							}
						}
						@Pc(659) int local659 = 0;
						@Pc(661) int local661 = 0;
						@Pc(663) int local663 = 0;
						if (this.aBoolean639) {
							local659 = Static80.method1578(local7, local17);
							local661 = Static255.method4000(local7, local17);
							local663 = Static414.method7248(local7, local17);
						}
						arg3.method6704(local7, local17, local352, local362, local355, local371, Static318.anIntArrayArray55[local40], Static96.anIntArrayArray12[local40], Static109.anIntArrayArray26[local40], local153, local156, local159, local162, local659, local661, local663);
						Static11.method3919(arg4, local7, local17);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!sa;Lclient!qa;BLclient!sa;)V")
	public final void method7403(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(3) Class75 arg2) {
		@Pc(23) int[][] local23 = new int[this.anInt8828][this.anInt8820];
		if (Static175.anIntArray365 == null || this.anInt8820 != Static175.anIntArray365.length) {
			Static324.anIntArray494 = new int[this.anInt8820];
			Static453.anIntArray631 = new int[this.anInt8820];
			Static251.anIntArray430 = new int[this.anInt8820];
			Static175.anIntArray365 = new int[this.anInt8820];
			Static187.anIntArray375 = new int[this.anInt8820];
		}
		@Pc(56) int local56;
		for (@Pc(52) int local52 = 0; local52 < this.anInt8825; local52++) {
			for (local56 = 0; local56 < this.anInt8820; local56++) {
				Static175.anIntArray365[local56] = 0;
				Static453.anIntArray631[local56] = 0;
				Static187.anIntArray375[local56] = 0;
				Static251.anIntArray430[local56] = 0;
				Static324.anIntArray494[local56] = 0;
			}
			for (@Pc(89) int local89 = -5; local89 < this.anInt8828; local89++) {
				@Pc(99) int local99;
				@Pc(118) int local118;
				@Pc(187) int local187;
				for (@Pc(93) int local93 = 0; local93 < this.anInt8820; local93++) {
					local99 = local89 + 5;
					@Pc(164) int local164;
					if (this.anInt8828 > local99) {
						local118 = this.aByteArrayArrayArray24[local52][local99][local93] & 0xFF;
						if (local118 > 0) {
							@Pc(128) Class176 local128 = this.aClass16_5.method574(local118 - 1);
							Static175.anIntArray365[local93] += local128.anInt5007;
							Static453.anIntArray631[local93] += local128.anInt5008;
							Static187.anIntArray375[local93] += local128.anInt4998;
							Static251.anIntArray430[local93] += local128.anInt5004;
							local164 = Static324.anIntArray494[local93]++;
						}
					}
					local118 = local89 - 5;
					if (local118 >= 0) {
						local187 = this.aByteArrayArrayArray24[local52][local118][local93] & 0xFF;
						if (local187 > 0) {
							@Pc(202) Class176 local202 = this.aClass16_5.method574(local187 - 1);
							Static175.anIntArray365[local93] -= local202.anInt5007;
							Static453.anIntArray631[local93] -= local202.anInt5008;
							Static187.anIntArray375[local93] -= local202.anInt4998;
							Static251.anIntArray430[local93] -= local202.anInt5004;
							local164 = Static324.anIntArray494[local93]--;
						}
					}
				}
				if (local89 >= 0) {
					local99 = 0;
					local118 = 0;
					local187 = 0;
					@Pc(256) int local256 = 0;
					@Pc(258) int local258 = 0;
					for (@Pc(260) int local260 = -5; local260 < this.anInt8820; local260++) {
						@Pc(266) int local266 = local260 + 5;
						if (this.anInt8820 > local266) {
							local187 += Static187.anIntArray375[local266];
							local256 += Static251.anIntArray430[local266];
							local118 += Static453.anIntArray631[local266];
							local258 += Static324.anIntArray494[local266];
							local99 += Static175.anIntArray365[local266];
						}
						@Pc(308) int local308 = local260 - 5;
						if (local308 >= 0) {
							local118 -= Static453.anIntArray631[local308];
							local258 -= Static324.anIntArray494[local308];
							local99 -= Static175.anIntArray365[local308];
							local256 -= Static251.anIntArray430[local308];
							local187 -= Static187.anIntArray375[local308];
						}
						if (local260 >= 0 && local256 > 0 && local258 > 0) {
							local23[local89][local260] = Static417.method6515(local187 / local258, local99 * 256 / local256, local118 / local258);
						}
					}
				}
			}
			if (Static177.aBoolean261) {
				this.method7406(Static532.aClass75Array3[local52], local52, arg1, local52 == 0 ? arg0 : null, local23, local52 == 0 ? arg2 : null);
			} else {
				this.method7402(local23, local52 == 0 ? arg0 : null, local52 == 0 ? arg2 : null, Static532.aClass75Array3[local52], local52, arg1);
			}
			this.aByteArrayArrayArray24[local52] = null;
			this.aByteArrayArrayArray22[local52] = null;
			this.aByteArrayArrayArray25[local52] = null;
			this.aByteArrayArrayArray20[local52] = null;
		}
		if (!this.aBoolean639) {
			if (Static438.anInt7981 != 0) {
				Static318.method5086();
			}
			if (Static136.aBoolean215) {
				Static432.method6629();
			}
		}
		for (local56 = 0; local56 < this.anInt8825; local56++) {
			Static532.aClass75Array3[local56].N();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIII)V")
	public final void method7404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(9) int local9 = 0; local9 < this.anInt8825; local9++) {
			this.method7408(arg0, arg1, local9);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!li;Lclient!qa;[[B[[BI[ZIIIIILclient!ch;[[B)V")
	private void method7405(@OriginalArg(0) int arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) Class39 arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class37 arg11, @OriginalArg(13) byte[][] arg12) {
		@Pc(18) boolean[] local18 = arg11 != null && arg11.aBoolean72 ? Static333.aBooleanArrayArray4[arg5] : Static232.aBooleanArrayArray3[arg5];
		@Pc(34) int local34;
		@Pc(44) Class37 local44;
		@Pc(62) byte local62;
		@Pc(78) int local78;
		@Pc(83) int local83;
		if (arg8 > 0) {
			if (arg9 > 0) {
				local34 = arg4[arg9 - 1][arg8 - 1] & 0xFF;
				if (local34 > 0) {
					local44 = this.aClass286_6.method7234(local34 - 1);
					if (local44.anInt1208 != -1 && local44.aBoolean72) {
						local62 = arg3[arg9 - 1][arg8 - 1];
						local78 = arg12[arg9 - 1][arg8 - 1] * 2 + 4 & 0x7;
						local83 = Static184.method3038(arg2, local44);
						if (Static469.aBooleanArrayArray5[local62][local78]) {
							Static526.anIntArray715[0] = local44.anInt1208;
							Static99.anIntArray217[0] = local83;
							Static247.anIntArray425[0] = arg2.method6036() ? local44.anInt1219 : local44.anInt1212;
							Static93.anIntArray141[0] = local44.anInt1207;
							Static398.anIntArray588[0] = local44.anInt1213;
							Static460.anIntArray698[0] = 256;
						}
					}
				}
			}
			if (arg9 < arg10 - 1) {
				local34 = arg4[arg9 + 1][arg8 - 1] & 0xFF;
				if (local34 > 0) {
					local44 = this.aClass286_6.method7234(local34 - 1);
					if (local44.anInt1208 != -1 && local44.aBoolean72) {
						local62 = arg3[arg9 + 1][arg8 - 1];
						local78 = arg12[arg9 + 1][arg8 - 1] * 2 + 6 & 0x7;
						local83 = Static184.method3038(arg2, local44);
						if (Static469.aBooleanArrayArray5[local62][local78]) {
							Static526.anIntArray715[2] = local44.anInt1208;
							Static99.anIntArray217[2] = local83;
							Static247.anIntArray425[2] = arg2.method6036() ? local44.anInt1219 : local44.anInt1212;
							Static93.anIntArray141[2] = local44.anInt1207;
							Static398.anIntArray588[2] = local44.anInt1213;
							Static460.anIntArray698[2] = 512;
						}
					}
				}
			}
		}
		if (arg7 - 1 > arg8) {
			if (arg9 > 0) {
				local34 = arg4[arg9 - 1][arg8 + 1] & 0xFF;
				if (local34 > 0) {
					local44 = this.aClass286_6.method7234(local34 - 1);
					if (local44.anInt1208 != -1 && local44.aBoolean72) {
						local62 = arg3[arg9 - 1][arg8 + 1];
						local78 = arg12[arg9 - 1][arg8 + 1] * 2 + 2 & 0x7;
						local83 = Static184.method3038(arg2, local44);
						if (Static469.aBooleanArrayArray5[local62][local78]) {
							Static526.anIntArray715[6] = local44.anInt1208;
							Static99.anIntArray217[6] = local83;
							Static247.anIntArray425[6] = arg2.method6036() ? local44.anInt1219 : local44.anInt1212;
							Static93.anIntArray141[6] = local44.anInt1207;
							Static398.anIntArray588[6] = local44.anInt1213;
							Static460.anIntArray698[6] = 64;
						}
					}
				}
			}
			if (arg10 - 1 > arg9) {
				local34 = arg4[arg9 + 1][arg8 + 1] & 0xFF;
				if (local34 > 0) {
					local44 = this.aClass286_6.method7234(local34 - 1);
					if (local44.anInt1208 != -1 && local44.aBoolean72) {
						local62 = arg3[arg9 + 1][arg8 + 1];
						local78 = arg12[arg9 + 1][arg8 + 1] * 2 & 0x7;
						local83 = Static184.method3038(arg2, local44);
						if (Static469.aBooleanArrayArray5[local62][local78]) {
							Static526.anIntArray715[4] = local44.anInt1208;
							Static99.anIntArray217[4] = local83;
							Static247.anIntArray425[4] = arg2.method6036() ? local44.anInt1219 : local44.anInt1212;
							Static93.anIntArray141[4] = local44.anInt1207;
							Static398.anIntArray588[4] = local44.anInt1213;
							Static460.anIntArray698[4] = 128;
						}
					}
				}
			}
		}
		@Pc(526) int local526;
		@Pc(531) int local531;
		@Pc(533) int local533;
		@Pc(495) byte local495;
		if (arg8 > 0) {
			local34 = arg4[arg9][arg8 - 1] & 0xFF;
			if (local34 > 0) {
				local44 = this.aClass286_6.method7234(local34 - 1);
				if (local44.anInt1208 != -1) {
					local62 = arg3[arg9][arg8 - 1];
					local495 = arg12[arg9][arg8 - 1];
					if (local44.aBoolean72) {
						local83 = 2;
						local526 = local495 * 2 + 4;
						local531 = Static184.method3038(arg2, local44);
						for (local533 = 0; local533 < 3; local533++) {
							local526 &= 0x7;
							local83 &= 0x7;
							if (Static469.aBooleanArrayArray5[local62][local526] && Static398.anIntArray588[local83] <= local44.anInt1213) {
								Static526.anIntArray715[local83] = local44.anInt1208;
								Static99.anIntArray217[local83] = local531;
								Static247.anIntArray425[local83] = arg2.method6036() ? local44.anInt1219 : local44.anInt1212;
								Static93.anIntArray141[local83] = local44.anInt1207;
								if (Static398.anIntArray588[local83] == local44.anInt1213) {
									Static460.anIntArray698[local83] |= 0x20;
								} else {
									Static460.anIntArray698[local83] = 32;
								}
								Static398.anIntArray588[local83] = local44.anInt1213;
							}
							local83--;
							local526++;
						}
						if (!local18[--arg0 & 0x3]) {
							arg6[0] = Static333.aBooleanArrayArray4[local62][local495 + 2 & 0x3];
						}
					} else if (!local18[arg0 & 0x3]) {
						arg6[0] = Static232.aBooleanArrayArray3[local62][local495 + 2 & 0x3];
					}
				}
			}
		}
		if (arg8 < arg7 - 1) {
			local34 = arg4[arg9][arg8 + 1] & 0xFF;
			if (local34 > 0) {
				local44 = this.aClass286_6.method7234(local34 - 1);
				if (local44.anInt1208 != -1) {
					local62 = arg3[arg9][arg8 + 1];
					local495 = arg12[arg9][arg8 + 1];
					if (local44.aBoolean72) {
						local83 = 4;
						local526 = local495 * 2 + 2;
						local531 = Static184.method3038(arg2, local44);
						for (local533 = 0; local533 < 3; local533++) {
							local83 &= 0x7;
							local526 &= 0x7;
							if (Static469.aBooleanArrayArray5[local62][local526] && local44.anInt1213 >= Static398.anIntArray588[local83]) {
								Static526.anIntArray715[local83] = local44.anInt1208;
								Static99.anIntArray217[local83] = local531;
								Static247.anIntArray425[local83] = arg2.method6036() ? local44.anInt1219 : local44.anInt1212;
								Static93.anIntArray141[local83] = local44.anInt1207;
								if (Static398.anIntArray588[local83] == local44.anInt1213) {
									Static460.anIntArray698[local83] |= 0x10;
								} else {
									Static460.anIntArray698[local83] = 16;
								}
								Static398.anIntArray588[local83] = local44.anInt1213;
							}
							local526--;
							local83++;
						}
						if (!local18[arg0 + 2 & 0x3]) {
							arg6[2] = Static333.aBooleanArrayArray4[local62][local495 & 0x3];
						}
					} else if (!local18[arg0 + 2 & 0x3]) {
						arg6[2] = Static232.aBooleanArrayArray3[local62][local495 & 0x3];
					}
				}
			}
		}
		if (arg9 > 0) {
			local34 = arg4[arg9 - 1][arg8] & 0xFF;
			if (local34 > 0) {
				local44 = this.aClass286_6.method7234(local34 - 1);
				if (local44.anInt1208 != -1) {
					local62 = arg3[arg9 - 1][arg8];
					local495 = arg12[arg9 - 1][arg8];
					if (local44.aBoolean72) {
						local83 = 6;
						local526 = local495 * 2 + 4;
						local531 = Static184.method3038(arg2, local44);
						for (local533 = 0; local533 < 3; local533++) {
							local526 &= 0x7;
							local83 &= 0x7;
							if (Static469.aBooleanArrayArray5[local62][local526] && Static398.anIntArray588[local83] <= local44.anInt1213) {
								Static526.anIntArray715[local83] = local44.anInt1208;
								Static99.anIntArray217[local83] = local531;
								Static247.anIntArray425[local83] = arg2.method6036() ? local44.anInt1219 : local44.anInt1212;
								Static93.anIntArray141[local83] = local44.anInt1207;
								if (Static398.anIntArray588[local83] == local44.anInt1213) {
									Static460.anIntArray698[local83] |= 0x8;
								} else {
									Static460.anIntArray698[local83] = 8;
								}
								Static398.anIntArray588[local83] = local44.anInt1213;
							}
							local526--;
							local83++;
						}
						if (!local18[arg0 + 3 & 0x3]) {
							arg6[3] = Static333.aBooleanArrayArray4[local62][local495 + 1 & 0x3];
						}
					} else if (!local18[arg0 + 3 & 0x3]) {
						arg6[3] = Static232.aBooleanArrayArray3[local62][local495 + 1 & 0x3];
					}
				}
			}
		}
		if (arg9 < arg10 - 1) {
			local34 = arg4[arg9 + 1][arg8] & 0xFF;
			if (local34 > 0) {
				local44 = this.aClass286_6.method7234(local34 - 1);
				if (local44.anInt1208 != -1) {
					local62 = arg3[arg9 + 1][arg8];
					local495 = arg12[arg9 + 1][arg8];
					if (local44.aBoolean72) {
						local83 = 4;
						local526 = local495 * 2 + 6;
						local531 = Static184.method3038(arg2, local44);
						for (local533 = 0; local533 < 3; local533++) {
							local83 &= 0x7;
							local526 &= 0x7;
							if (Static469.aBooleanArrayArray5[local62][local526] && Static398.anIntArray588[local83] <= local44.anInt1213) {
								Static526.anIntArray715[local83] = local44.anInt1208;
								Static99.anIntArray217[local83] = local531;
								Static247.anIntArray425[local83] = arg2.method6036() ? local44.anInt1219 : local44.anInt1212;
								Static93.anIntArray141[local83] = local44.anInt1207;
								if (Static398.anIntArray588[local83] == local44.anInt1213) {
									Static460.anIntArray698[local83] |= 0x4;
								} else {
									Static460.anIntArray698[local83] = 4;
								}
								Static398.anIntArray588[local83] = local44.anInt1213;
							}
							local83--;
							local526++;
						}
						if (!local18[arg0 + 1 & 0x3]) {
							arg6[1] = Static333.aBooleanArrayArray4[local62][local495 + 3 & 0x3];
						}
					} else if (!local18[arg0 + 1 & 0x3]) {
						arg6[1] = Static232.aBooleanArrayArray3[local62][local495 + 3 & 0x3];
					}
				}
			}
		}
		if (arg11 == null) {
			return;
		}
		local34 = Static184.method3038(arg2, arg11);
		if (!arg11.aBoolean72) {
			return;
		}
		for (@Pc(1223) int local1223 = 0; local1223 < 8; local1223++) {
			@Pc(1233) int local1233 = local1223 - arg0 * 2 & 0x7;
			if (Static469.aBooleanArrayArray5[arg5][local1223] && arg11.anInt1213 >= Static398.anIntArray588[local1233]) {
				Static526.anIntArray715[local1233] = arg11.anInt1208;
				Static99.anIntArray217[local1233] = local34;
				Static247.anIntArray425[local1233] = arg2.method6036() ? arg11.anInt1219 : arg11.anInt1212;
				Static93.anIntArray141[local1233] = arg11.anInt1207;
				if (arg11.anInt1213 == Static398.anIntArray588[local1233]) {
					Static460.anIntArray698[local1233] |= 0x2;
				} else {
					Static460.anIntArray698[local1233] = 2;
				}
				Static398.anIntArray588[local1233] = arg11.anInt1213;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!sa;ILclient!qa;Lclient!sa;[[ILclient!sa;)V")
	private void method7406(@OriginalArg(1) Class75 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class39 arg2, @OriginalArg(4) Class75 arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) Class75 arg5) {
		@Pc(14) byte[][] local14 = this.aByteArrayArrayArray25[arg1];
		@Pc(19) byte[][] local19 = this.aByteArrayArrayArray20[arg1];
		@Pc(24) byte[][] local24 = this.aByteArrayArrayArray24[arg1];
		@Pc(29) byte[][] local29 = this.aByteArrayArrayArray22[arg1];
		for (@Pc(31) int local31 = 0; local31 < this.anInt8828; local31++) {
			@Pc(45) int local45 = local31 < this.anInt8828 - 1 ? local31 + 1 : local31;
			for (@Pc(47) int local47 = 0; local47 < this.anInt8820; local47++) {
				@Pc(61) int local61 = this.anInt8820 - 1 <= local47 ? local47 : local47 + 1;
				if (Static224.anInt4044 == -1 || Static426.method6572(local31, arg1, local47, Static224.anInt4044)) {
					@Pc(78) boolean local78 = false;
					@Pc(80) boolean local80 = false;
					@Pc(83) boolean[] local83 = new boolean[4];
					@Pc(89) int local89 = local14[local31][local47];
					@Pc(95) int local95 = local19[local31][local47];
					@Pc(103) int local103 = local29[local31][local47] & 0xFF;
					@Pc(111) int local111 = local24[local31][local47] & 0xFF;
					@Pc(119) int local119 = local24[local31][local61] & 0xFF;
					@Pc(127) int local127 = local24[local45][local61] & 0xFF;
					@Pc(135) int local135 = local24[local45][local47] & 0xFF;
					if (local103 != 0 || local111 != 0) {
						@Pc(157) Class37 local157 = local103 == 0 ? null : this.aClass286_6.method7234(local103 - 1);
						@Pc(172) Class176 local172 = local111 == 0 ? null : this.aClass16_5.method574(local111 - 1);
						if (local89 == 0 && local157 == null) {
							local89 = 12;
						}
						@Pc(180) Class37 local180 = local157;
						if (local157 != null) {
							if (local157.anInt1208 == -1 && local157.anInt1214 == -1) {
								local180 = local157;
								local157 = null;
							} else if (local172 != null && local89 != 0) {
								local80 = local157.aBoolean72;
							}
						}
						@Pc(298) int local298;
						@Pc(317) int local317;
						@Pc(382) int local382;
						@Pc(392) int local392;
						if ((local89 == 0 || local89 == 12) && local31 > 0 && local47 > 0 && local31 < this.anInt8828 && local47 < this.anInt8820) {
							@Pc(260) int local260 = local111 == local24[local45][local47 - 1] ? 1 : -1;
							@Pc(277) int local277 = local111 == local24[local45][local61] ? 1 : -1;
							local298 = local24[local31 - 1][local47 - 1] == local111 ? 1 : -1;
							local317 = local111 == local24[local31 - 1][local61] ? 1 : -1;
							if (local111 == local24[local31][local47 - 1]) {
								local298++;
								local260++;
							} else {
								local260--;
								local298--;
							}
							if (local111 == local24[local45][local47]) {
								local260++;
								local277++;
							} else {
								local277--;
								local260--;
							}
							if (local24[local31][local61] == local111) {
								local277++;
								local317++;
							} else {
								local277--;
								local317--;
							}
							if (local24[local31 - 1][local47] == local111) {
								local298++;
								local317++;
							} else {
								local298--;
								local317--;
							}
							local382 = local298 - local277;
							if (local382 < 0) {
								local382 = -local382;
							}
							local392 = local260 - local317;
							if (local392 < 0) {
								local392 = -local392;
							}
							if (local382 == local392) {
								local382 = arg0.ba(local31, local47) - arg0.ba(local45, local61);
								local392 = arg0.ba(local45, local47) - arg0.ba(local31, local61);
								if (local382 < 0) {
									local382 = -local382;
								}
								if (local392 < 0) {
									local392 = -local392;
								}
							}
							local95 = local382 >= local392 ? 0 : 1;
						}
						for (local298 = 0; local298 < 13; local298++) {
							Static398.anIntArray588[local298] = -1;
							Static460.anIntArray698[local298] = 1;
						}
						@Pc(473) boolean[] local473 = local157 != null && local157.aBoolean72 ? Static333.aBooleanArrayArray4[local89] : Static232.aBooleanArrayArray3[local89];
						this.method7405(local95, local172, arg2, local14, local29, local89, local83, this.anInt8820, local47, local31, this.anInt8828, local157, local19);
						@Pc(506) boolean local506 = local157 != null && local157.anInt1208 != local157.anInt1214;
						if (!local506) {
							for (local317 = 0; local317 < 8; local317++) {
								if (Static398.anIntArray588[local317] >= 0 && Static99.anIntArray217[local317] != Static526.anIntArray715[local317]) {
									local506 = true;
									break;
								}
							}
						}
						if (!local473[local95 + 1 & 0x3]) {
							local83[1] = Static322.method5133(local83[1], (Static460.anIntArray698[2] & Static460.anIntArray698[4]) == 0);
						}
						if (!local473[local95 + 3 & 0x3]) {
							local83[3] = Static322.method5133(local83[3], (Static460.anIntArray698[6] & Static460.anIntArray698[0]) == 0);
						}
						if (!local473[local95 & 0x3]) {
							local83[0] = Static322.method5133(local83[0], (Static460.anIntArray698[0] & Static460.anIntArray698[2]) == 0);
						}
						if (!local473[local95 + 2 & 0x3]) {
							local83[2] = Static322.method5133(local83[2], (Static460.anIntArray698[6] & Static460.anIntArray698[4]) == 0);
						}
						if (!local80 && (local89 == 0 || local89 == 12)) {
							if (local83[0] && !local83[1] && !local83[2] && local83[3]) {
								local89 = local89 == 0 ? 13 : 14;
								local83[0] = local83[3] = false;
								local95 = 0;
							} else if (local83[0] && local83[1] && !local83[2] && !local83[3]) {
								local95 = 3;
								local89 = local89 == 0 ? 13 : 14;
								local83[0] = local83[1] = false;
							} else if (!local83[0] && local83[1] && local83[2] && !local83[3]) {
								local95 = 2;
								local83[1] = local83[2] = false;
								local89 = local89 == 0 ? 13 : 14;
							} else if (!local83[0] && !local83[1] && local83[2] && local83[3]) {
								local89 = local89 == 0 ? 13 : 14;
								local95 = 1;
								local83[2] = local83[3] = false;
							}
						}
						@Pc(812) boolean local812 = !local80 && !local83[0] && !local83[2] && !local83[1] && !local83[3];
						@Pc(814) int[] local814 = null;
						@Pc(828) int[] local828;
						@Pc(832) int[] local832;
						@Pc(844) int[] local844;
						if (local812) {
							local382 = local172 == null ? 0 : Static225.anIntArray409[local89];
							local828 = Static318.anIntArrayArray55[local89];
							local832 = Static96.anIntArrayArray12[local89];
							local392 = local157 == null ? 0 : Static291.anIntArray469[local89];
							local844 = Static109.anIntArrayArray26[local89];
						} else if (local80) {
							local832 = Static313.anIntArrayArray59[local89];
							local382 = local172 == null ? 0 : Static61.anIntArray107[local89];
							local392 = local157 == null ? 0 : Static527.anIntArray701[local89];
							local814 = Static272.anIntArrayArray53[local89];
							local844 = Static94.anIntArrayArray11[local89];
							local828 = Static358.anIntArrayArray58[local89];
						} else {
							local844 = Static152.anIntArrayArray73[local89];
							local832 = Static215.anIntArrayArray72[local89];
							local392 = local157 == null ? 0 : Static187.anIntArray374[local89];
							local828 = Static73.anIntArrayArray7[local89];
							local814 = Static331.anIntArrayArray56[local89];
							local382 = local172 == null ? 0 : Static418.anIntArray597[local89];
						}
						@Pc(917) int local917 = local382 + local392;
						if (local917 <= 0) {
							Static11.method3919(arg1, local31, local47);
						} else {
							if (local83[0]) {
								local917++;
							}
							if (local83[2]) {
								local917++;
							}
							if (local83[1]) {
								local917++;
							}
							if (local83[3]) {
								local917++;
							}
							@Pc(950) int local950 = 0;
							@Pc(952) int local952 = 0;
							@Pc(956) int local956 = local917 * 3;
							@Pc(963) int[] local963 = local506 ? new int[local956] : null;
							@Pc(966) int[] local966 = new int[local956];
							@Pc(969) int[] local969 = new int[local956];
							@Pc(972) int[] local972 = new int[local956];
							@Pc(975) int[] local975 = new int[local956];
							@Pc(978) int[] local978 = new int[local956];
							@Pc(985) int[] local985 = arg3 == null ? null : new int[local956];
							@Pc(994) int[] local994 = arg3 == null && arg5 == null ? null : new int[local956];
							@Pc(996) int local996 = -1;
							@Pc(998) int local998 = -1;
							@Pc(1000) int local1000 = 256;
							@Pc(1114) byte local1114;
							@Pc(1050) int local1050;
							@Pc(1052) int local1052;
							@Pc(1284) int local1284;
							@Pc(1290) int local1290;
							@Pc(1298) int local1298;
							@Pc(1303) int local1303;
							@Pc(1321) int local1321;
							@Pc(1308) int local1308;
							@Pc(1319) int local1319;
							@Pc(1374) int local1374;
							@Pc(1380) int local1380;
							if (local157 != null) {
								local996 = local157.anInt1208;
								local998 = arg2.method6036() ? local157.anInt1219 : local157.anInt1212;
								local1000 = local157.anInt1207;
								local1050 = Static184.method3038(arg2, local157);
								for (local1052 = 0; local1052 < local392; local1052++) {
									if (local83[-local95 & 0x3] && local814[0] == local950) {
										Static347.anIntArray511[0] = local828[local950];
										Static347.anIntArray511[1] = 1;
										Static347.anIntArray511[2] = local844[local950];
										Static347.anIntArray511[3] = 1;
										Static347.anIntArray511[4] = local832[local950];
										local1114 = 6;
										Static347.anIntArray511[5] = local844[local950];
									} else if (local83[2 - local95 & 0x3] && local814[2] == local950) {
										Static347.anIntArray511[0] = local828[local950];
										Static347.anIntArray511[1] = 5;
										Static347.anIntArray511[2] = local844[local950];
										Static347.anIntArray511[3] = 5;
										Static347.anIntArray511[4] = local832[local950];
										local1114 = 6;
										Static347.anIntArray511[5] = local844[local950];
									} else if (local83[1 - local95 & 0x3] && local814[1] == local950) {
										Static347.anIntArray511[0] = local828[local950];
										Static347.anIntArray511[1] = 3;
										Static347.anIntArray511[2] = local844[local950];
										Static347.anIntArray511[3] = 3;
										Static347.anIntArray511[4] = local832[local950];
										Static347.anIntArray511[5] = local844[local950];
										local1114 = 6;
									} else if (local83[3 - local95 & 0x3] && local814[3] == local950) {
										Static347.anIntArray511[0] = local828[local950];
										Static347.anIntArray511[1] = 7;
										Static347.anIntArray511[2] = local844[local950];
										Static347.anIntArray511[3] = 7;
										Static347.anIntArray511[4] = local832[local950];
										local1114 = 6;
										Static347.anIntArray511[5] = local844[local950];
									} else {
										Static347.anIntArray511[0] = local828[local950];
										Static347.anIntArray511[1] = local832[local950];
										Static347.anIntArray511[2] = local844[local950];
										local1114 = 3;
									}
									local950++;
									for (local1284 = 0; local1284 < local1114; local1284++) {
										local1290 = Static347.anIntArray511[local1284];
										local1298 = local1290 - local95 * 2 & 0x7;
										local1303 = this.anIntArray675[local1290];
										local1308 = this.anIntArray674[local1290];
										if (local95 == 1) {
											local1319 = 128 - local1303;
											local1321 = local1308;
										} else if (local95 == 2) {
											local1321 = 128 - local1303;
											local1319 = 128 - local1308;
										} else if (local95 == 3) {
											local1321 = 128 - local1308;
											local1319 = local1303;
										} else {
											local1319 = local1308;
											local1321 = local1303;
										}
										local966[local952] = local1321;
										local969[local952] = local1319;
										if (local985 != null && Static469.aBooleanArrayArray5[local89][local1290]) {
											local1374 = (local31 << 7) + local1321;
											local1380 = local1319 + (local47 << 7);
											local985[local952] = arg3.aa(local1374, local1380) - arg0.aa(local1374, local1380);
										}
										if (local994 != null) {
											if (arg3 != null && !Static469.aBooleanArrayArray5[local89][local1290]) {
												local1374 = local1321 + (local31 << 7);
												local1380 = (local47 << 7) + local1319;
												local994[local952] = arg0.aa(local1374, local1380) - arg3.aa(local1374, local1380);
											} else if (arg5 != null && !Static203.aBooleanArrayArray2[local89][local1290]) {
												local1374 = local1321 + (local31 << 7);
												local1380 = (local47 << 7) + local1319;
												local994[local952] = arg5.aa(local1374, local1380) - arg0.aa(local1374, local1380);
											}
										}
										if (local1290 < 8 && Static398.anIntArray588[local1298] > local157.anInt1213) {
											if (local963 != null) {
												local963[local952] = Static99.anIntArray217[local1298];
											}
											local978[local952] = Static93.anIntArray141[local1298];
											local975[local952] = Static247.anIntArray425[local1298];
											local972[local952] = Static526.anIntArray715[local1298];
										} else {
											if (local963 != null) {
												local963[local952] = local1050;
											}
											local975[local952] = arg2.method6036() ? local157.anInt1219 : local157.anInt1212;
											local978[local952] = local157.anInt1207;
											local972[local952] = local996;
										}
										local952++;
									}
								}
								if (!this.aBoolean639 && arg1 == 0) {
									Static531.method7657(local31, local47, local157.anInt1216, local157.anInt1205 * 8, local157.anInt1206);
								}
								if (local89 != 12 && local157.anInt1208 != -1 && local157.aBoolean71) {
									local78 = true;
								}
							} else if (local812) {
								local950 = Static291.anIntArray469[local89];
							} else if (local80) {
								local950 = Static527.anIntArray701[local89];
							} else {
								local950 = Static187.anIntArray374[local89];
							}
							if (local172 != null) {
								if (local135 == 0) {
									local135 = local111;
								}
								if (local119 == 0) {
									local119 = local111;
								}
								if (local127 == 0) {
									local127 = local111;
								}
								@Pc(1606) Class176 local1606 = this.aClass16_5.method574(local111 - 1);
								@Pc(1614) Class176 local1614 = this.aClass16_5.method574(local119 - 1);
								@Pc(1622) Class176 local1622 = this.aClass16_5.method574(local127 - 1);
								@Pc(1632) Class176 local1632 = this.aClass16_5.method574(local135 - 1);
								for (local1298 = 0; local1298 < local382; local1298++) {
									if (local83[-local95 & 0x3] && local814[0] == local950) {
										Static347.anIntArray511[0] = local828[local950];
										Static347.anIntArray511[1] = 1;
										Static347.anIntArray511[2] = local844[local950];
										Static347.anIntArray511[3] = 1;
										Static347.anIntArray511[4] = local832[local950];
										local1114 = 6;
										Static347.anIntArray511[5] = local844[local950];
									} else if (local83[2 - local95 & 0x3] && local814[2] == local950) {
										Static347.anIntArray511[0] = local828[local950];
										Static347.anIntArray511[1] = 5;
										Static347.anIntArray511[2] = local844[local950];
										Static347.anIntArray511[3] = 5;
										Static347.anIntArray511[4] = local832[local950];
										Static347.anIntArray511[5] = local844[local950];
										local1114 = 6;
									} else if (local83[1 - local95 & 0x3] && local950 == local814[1]) {
										Static347.anIntArray511[0] = local828[local950];
										Static347.anIntArray511[1] = 3;
										Static347.anIntArray511[2] = local844[local950];
										Static347.anIntArray511[3] = 3;
										Static347.anIntArray511[4] = local832[local950];
										local1114 = 6;
										Static347.anIntArray511[5] = local844[local950];
									} else if (local83[3 - local95 & 0x3] && local950 == local814[3]) {
										Static347.anIntArray511[0] = local828[local950];
										Static347.anIntArray511[1] = 7;
										Static347.anIntArray511[2] = local844[local950];
										Static347.anIntArray511[3] = 7;
										Static347.anIntArray511[4] = local832[local950];
										Static347.anIntArray511[5] = local844[local950];
										local1114 = 6;
									} else {
										Static347.anIntArray511[0] = local828[local950];
										Static347.anIntArray511[1] = local832[local950];
										local1114 = 3;
										Static347.anIntArray511[2] = local844[local950];
									}
									local950++;
									for (local1303 = 0; local1303 < local1114; local1303++) {
										local1321 = Static347.anIntArray511[local1303];
										local1308 = local1321 - local95 * 2 & 0x7;
										local1319 = this.anIntArray675[local1321];
										local1380 = this.anIntArray674[local1321];
										@Pc(1902) int local1902;
										if (local95 == 1) {
											local1902 = 128 - local1319;
											local1374 = local1380;
										} else if (local95 == 2) {
											local1902 = 128 - local1380;
											local1374 = 128 - local1319;
										} else if (local95 == 3) {
											local1902 = local1319;
											local1374 = 128 - local1380;
										} else {
											local1902 = local1380;
											local1374 = local1319;
										}
										local966[local952] = local1374;
										local969[local952] = local1902;
										@Pc(1956) int local1956;
										@Pc(1962) int local1962;
										if (local985 != null && Static469.aBooleanArrayArray5[local89][local1321]) {
											local1956 = (local31 << 7) + local1374;
											local1962 = local1902 + (local47 << 7);
											local985[local952] = arg3.aa(local1956, local1962) - arg0.aa(local1956, local1962);
										}
										if (local994 != null) {
											if (arg3 != null && !Static469.aBooleanArrayArray5[local89][local1321]) {
												local1956 = local1374 + (local31 << 7);
												local1962 = local1902 + (local47 << 7);
												local994[local952] = arg0.aa(local1956, local1962) - arg3.aa(local1956, local1962);
											} else if (arg5 != null && !Static203.aBooleanArrayArray2[local89][local1321]) {
												local1956 = (local31 << 7) + local1374;
												local1962 = (local47 << 7) + local1902;
												local994[local952] = arg5.aa(local1956, local1962) - arg0.aa(local1956, local1962);
											}
										}
										if (local1321 < 8 && Static398.anIntArray588[local1308] >= 0) {
											if (local963 != null) {
												local963[local952] = Static99.anIntArray217[local1308];
											}
											local978[local952] = Static93.anIntArray141[local1308];
											local975[local952] = Static247.anIntArray425[local1308];
											local972[local952] = Static526.anIntArray715[local1308];
										} else {
											if (local80 && Static469.aBooleanArrayArray5[local89][local1321]) {
												local975[local952] = local998;
												local978[local952] = local1000;
												local972[local952] = local996;
											} else if (local1374 == 0 && local1902 == 0) {
												local972[local952] = arg4[local31][local47];
												local975[local952] = local1606.anInt4999;
												local978[local952] = local1606.anInt5005;
											} else if (local1374 == 0 && local1902 == 128) {
												local972[local952] = arg4[local31][local61];
												local975[local952] = local1614.anInt4999;
												local978[local952] = local1614.anInt5005;
											} else if (local1374 == 128 && local1902 == 128) {
												local972[local952] = arg4[local45][local61];
												local975[local952] = local1622.anInt4999;
												local978[local952] = local1622.anInt5005;
											} else if (local1374 == 128 && local1902 == 0) {
												local972[local952] = arg4[local45][local47];
												local975[local952] = local1632.anInt4999;
												local978[local952] = local1632.anInt5005;
											} else {
												if (local1374 < 64) {
													if (local1902 >= 64) {
														local975[local952] = local1614.anInt4999;
														local978[local952] = local1614.anInt5005;
													} else {
														local975[local952] = local1606.anInt4999;
														local978[local952] = local1606.anInt5005;
													}
												} else if (local1902 < 64) {
													local975[local952] = local1632.anInt4999;
													local978[local952] = local1632.anInt5005;
												} else {
													local975[local952] = local1622.anInt4999;
													local978[local952] = local1622.anInt5005;
												}
												local1956 = Static291.method4611(local1374 << 7 >> 7, arg4[local45][local47], arg4[local31][local47]);
												local1962 = Static291.method4611(local1374 << 7 >> 7, arg4[local45][local61], arg4[local31][local61]);
												local972[local952] = Static291.method4611(local1902 << 7 >> 7, local1962, local1956);
											}
											if (local963 != null) {
												local963[local952] = local972[local952];
											}
										}
										local952++;
									}
								}
								if (local89 != 0 && local172.aBoolean381) {
									local78 = true;
								}
							}
							local1050 = arg0.ba(local31, local47);
							local1052 = arg0.ba(local45, local47);
							local1284 = arg0.ba(local45, local61);
							local1290 = arg0.ba(local31, local61);
							if (arg1 > 0) {
								@Pc(2382) boolean local2382 = true;
								if (local111 == 0 && local89 != 0) {
									local2382 = false;
								}
								if (local103 > 0 && local180 != null && !local180.aBoolean73) {
									local2382 = false;
								}
								if (local2382 && local1050 == local1052 && local1050 == local1284 && local1050 == local1290) {
									this.aByteArrayArrayArray21[arg1][local31][local47] = (byte) (this.aByteArrayArrayArray21[arg1][local31][local47] | 0x4);
								}
							}
							local1298 = 0;
							local1303 = 0;
							local1321 = 0;
							if (this.aBoolean639) {
								local1298 = Static80.method1578(local31, local47);
								local1303 = Static255.method4000(local31, local47);
								local1321 = Static414.method7248(local31, local47);
							}
							arg0.IA(local31, local47, local966, local985, local969, local994, local972, local963, local975, local978, local1298, local1303, local1321, local78);
							Static11.method3919(arg1, local31, local47);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIII)V")
	private void method7408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(5) int arg2) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = arg0; local3 < arg0 + 64; local3++) {
			for (local7 = arg1; local7 < arg1 + 64; local7++) {
				if (local7 >= 0 && this.anInt8828 > local7 && local3 >= 0 && local3 < this.anInt8820) {
					this.anIntArrayArrayArray22[arg2][local7][local3] = arg2 <= 0 ? 0 : this.anIntArrayArrayArray22[arg2 - 1][local7][local3] - 240;
				}
			}
		}
		if (arg1 > 0 && this.anInt8828 > arg1) {
			for (local7 = arg0 + 1; local7 < arg0 + 64; local7++) {
				if (local7 >= 0 && this.anInt8820 > local7) {
					this.anIntArrayArrayArray22[arg2][arg1][local7] = this.anIntArrayArrayArray22[arg2][arg1 - 1][local7];
				}
			}
		}
		if (arg0 > 0 && this.anInt8820 > arg0) {
			for (local7 = arg1 + 1; local7 < arg1 + 64; local7++) {
				if (local7 >= 0 && this.anInt8828 > local7) {
					this.anIntArrayArrayArray22[arg2][local7][arg0] = this.anIntArrayArrayArray22[arg2][local7][arg0 - 1];
				}
			}
		}
		if (arg1 < 0 || arg0 < 0 || arg1 >= this.anInt8828 || this.anInt8820 <= arg0) {
			return;
		}
		if (arg2 == 0) {
			if (arg1 > 0 && this.anIntArrayArrayArray22[arg2][arg1 - 1][arg0] != 0) {
				this.anIntArrayArrayArray22[arg2][arg1][arg0] = this.anIntArrayArrayArray22[arg2][arg1 - 1][arg0];
				return;
			}
			if (arg0 > 0 && this.anIntArrayArrayArray22[arg2][arg1][arg0 - 1] != 0) {
				this.anIntArrayArrayArray22[arg2][arg1][arg0] = this.anIntArrayArrayArray22[arg2][arg1][arg0 - 1];
				return;
			}
			if (arg1 > 0 && arg0 > 0 && this.anIntArrayArrayArray22[arg2][arg1 - 1][arg0 - 1] != 0) {
				this.anIntArrayArrayArray22[arg2][arg1][arg0] = this.anIntArrayArrayArray22[arg2][arg1 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray22[arg2 - 1][arg1 - 1][arg0] != this.anIntArrayArrayArray22[arg2][arg1 - 1][arg0]) {
			this.anIntArrayArrayArray22[arg2][arg1][arg0] = this.anIntArrayArrayArray22[arg2][arg1 - 1][arg0];
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray22[arg2][arg1][arg0 - 1] != this.anIntArrayArrayArray22[arg2 - 1][arg1][arg0 - 1]) {
			this.anIntArrayArrayArray22[arg2][arg1][arg0] = this.anIntArrayArrayArray22[arg2][arg1][arg0 - 1];
			return;
		}
		if (arg1 > 0 && arg0 > 0 && this.anIntArrayArrayArray22[arg2 - 1][arg1 - 1][arg0 - 1] != this.anIntArrayArrayArray22[arg2][arg1 - 1][arg0 - 1]) {
			this.anIntArrayArrayArray22[arg2][arg1][arg0] = this.anIntArrayArrayArray22[arg2][arg1 - 1][arg0 - 1];
			return;
		}
	}
}
