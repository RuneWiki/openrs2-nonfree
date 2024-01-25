import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public class Class102 {

	@OriginalMember(owner = "client!fi", name = "C", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray19;

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "[I")
	private final int[] anIntArray786 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!fi", name = "n", descriptor = "[I")
	private final int[] anIntArray787 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!fi", name = "x", descriptor = "Z")
	public final boolean aBoolean681;

	@OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
	protected final int anInt9076;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "Lclient!iv;")
	private final Class143 aClass143_5;

	@OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
	protected final int anInt9080;

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "Lclient!sca;")
	private final Class264 aClass264_4;

	@OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
	public final int anInt9074;

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!fi", name = "r", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!fi", name = "v", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!fi", name = "B", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(IIIZLclient!iv;Lclient!sca;)V")
	protected Class102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class143 arg4, @OriginalArg(5) Class264 arg5) {
		this.aBoolean681 = arg3;
		this.anInt9076 = arg2;
		this.aClass143_5 = arg4;
		this.anInt9080 = arg1;
		this.aClass264_4 = arg5;
		this.anInt9074 = arg0;
		this.aByteArrayArrayArray14 = new byte[this.anInt9074][this.anInt9080][this.anInt9076];
		this.aByteArrayArrayArray17 = new byte[this.anInt9074][this.anInt9080][this.anInt9076];
		this.aByteArrayArrayArray15 = new byte[this.anInt9074][this.anInt9080][this.anInt9076];
		this.aByteArrayArrayArray18 = new byte[this.anInt9074][this.anInt9080][this.anInt9076];
		this.aByteArrayArrayArray16 = new byte[this.anInt9074][this.anInt9080 + 1][this.anInt9076 + 1];
		this.anIntArrayArrayArray20 = new int[this.anInt9074][this.anInt9080 + 1][this.anInt9076 + 1];
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IILclient!qa;Lclient!sa;[[ILclient!sa;Lclient!sa;)V")
	private void method7836(@OriginalArg(0) int arg0, @OriginalArg(2) Class4 arg1, @OriginalArg(3) Class7 arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) Class7 arg4, @OriginalArg(6) Class7 arg5) {
		for (@Pc(15) int local15 = 0; local15 < this.anInt9080; local15++) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt9076; local19++) {
				if (Static398.anInt7022 == -1 || Static29.method801(local15, arg0, Static398.anInt7022, local19)) {
					@Pc(42) byte local42 = this.aByteArrayArrayArray17[arg0][local15][local19];
					@Pc(51) byte local51 = this.aByteArrayArrayArray14[arg0][local15][local19];
					@Pc(62) int local62 = this.aByteArrayArrayArray15[arg0][local15][local19] & 0xFF;
					@Pc(73) int local73 = this.aByteArrayArrayArray18[arg0][local15][local19] & 0xFF;
					@Pc(88) Class307 local88 = local62 == 0 ? null : this.aClass143_5.method3941(local62 - 1);
					@Pc(100) Class123 local100 = local73 == 0 ? null : this.aClass264_4.method6825(local73 - 1);
					@Pc(102) int local102 = 0;
					@Pc(104) int local104 = 0;
					if (local42 != 0) {
						local104 = local88 == null ? 0 : Static45.anIntArray82[local42];
						local102 = local100 == null ? 0 : Static197.anIntArray314[local42];
					} else if (local88 != null) {
						local104 = Static45.anIntArray82[local42];
					} else if (local100 != null) {
						local102 = Static45.anIntArray82[local42];
					}
					@Pc(142) int local142 = local102 + local104;
					@Pc(144) int local144 = 0;
					if (local142 != 0) {
						@Pc(149) int[] local149 = new int[local142];
						@Pc(152) int[] local152 = new int[local142];
						@Pc(155) int[] local155 = new int[local142];
						@Pc(158) int[] local158 = new int[local142];
						@Pc(160) boolean local160 = false;
						@Pc(184) int local184;
						@Pc(190) int local190;
						if (local88 == null || local88.anInt9138 == -1 && local88.anInt9145 == -1 && local88.anInt9141 == -1) {
							for (local184 = 0; local184 < local104; local184++) {
								local149[local144] = -1;
								local144++;
							}
						} else {
							local184 = arg1.method7166() ? local88.anInt9141 : local88.anInt9143;
							if (Static524.aBoolean694) {
								local184 = -1;
							}
							for (local190 = 0; local190 < local104; local190++) {
								local155[local144] = local184;
								local158[local144] = local88.anInt9140;
								if (local88.anInt9138 == -1) {
									local149[local144] = -1;
								} else {
									local149[local144] = local88.anInt9138;
								}
								if (local88.anInt9145 == -1) {
									local152[local144] = -1;
								} else {
									local152[local144] = local88.anInt9145;
									local160 = true;
								}
								local144++;
							}
							if (!this.aBoolean681 && arg0 == 0) {
								Static167.method3161(local15, local19, local88.anInt9146, local88.anInt9139 * 8, local88.anInt9137);
							}
						}
						if (!local160) {
							local152 = null;
						}
						if (local100 == null) {
							for (local184 = 0; local184 < local102; local184++) {
								local149[local144] = -1;
								local144++;
							}
						} else {
							local184 = local100.anInt3431;
							if (Static524.aBoolean694) {
								local184 = -1;
							}
							for (local190 = 0; local190 < local102; local190++) {
								local155[local144] = local184;
								local158[local144] = local100.anInt3435;
								local149[local144] = arg3[local15][local19];
								if (local152 != null) {
									local152[local144] = -1;
								}
								local144++;
							}
						}
						local184 = this.anIntArray787.length;
						@Pc(348) int[] local348 = new int[local184];
						@Pc(351) int[] local351 = new int[local184];
						@Pc(358) int[] local358 = arg5 == null ? null : new int[local184];
						@Pc(367) int[] local367 = arg5 == null && arg4 == null ? null : new int[local184];
						@Pc(376) int local376;
						@Pc(381) int local381;
						@Pc(463) int local463;
						@Pc(469) int local469;
						for (@Pc(369) int local369 = 0; local369 < local184; local369++) {
							local376 = this.anIntArray787[local369];
							local381 = this.anIntArray786[local369];
							if (local51 == 0) {
								local348[local369] = local376;
								local351[local369] = local381;
							} else if (local51 == 1) {
								local348[local369] = local381;
								local351[local369] = 128 - local376;
							} else if (local51 == 2) {
								local348[local369] = 128 - local376;
								local351[local369] = 128 - local381;
							} else if (local51 == 3) {
								local348[local369] = 128 - local381;
								local351[local369] = local376;
							}
							if (local358 != null && Static289.aBooleanArrayArray8[local42][local369]) {
								local463 = local376 + (local15 << 7);
								local469 = (local19 << 7) + local376;
								local358[local369] = arg5.aa(local463, local469) - arg2.aa(local463, local469);
							}
							if (local367 != null) {
								if (arg5 != null && !Static289.aBooleanArrayArray8[local42][local369]) {
									local463 = (local15 << 7) + local376;
									local469 = local376 + (local19 << 7);
									local367[local369] = arg2.aa(local463, local469) - arg5.aa(local463, local469);
								} else if (arg4 != null && !Static388.aBooleanArrayArray9[local42][local369]) {
									local463 = local376 + (local15 << 7);
									local469 = local376 + (local19 << 7);
									local367[local369] = arg4.aa(local463, local469) - arg2.aa(local463, local469);
								}
							}
						}
						local376 = arg2.ba(local15, local19);
						local381 = arg2.ba(local15 + 1, local19);
						local463 = arg2.ba(local15 + 1, local19 + 1);
						local469 = arg2.ba(local15, local19 + 1);
						if (arg0 > 0) {
							@Pc(593) boolean local593 = true;
							if (local73 == 0 && local42 != 0) {
								local593 = false;
							}
							if (local62 > 0 && local88 != null && !local88.aBoolean684) {
								local593 = false;
							}
							if (local593 && local376 == local381 && local376 == local463 && local376 == local469) {
								this.aByteArrayArrayArray16[arg0][local15][local19] = (byte) (this.aByteArrayArrayArray16[arg0][local15][local19] | 0x4);
							}
						}
						@Pc(651) int local651 = 0;
						@Pc(653) int local653 = 0;
						@Pc(655) int local655 = 0;
						if (this.aBoolean681) {
							local651 = Static100.method2039(local15, local19);
							local653 = Static431.method6703(local15, local19);
							local655 = Static407.method6490(local15, local19);
						}
						arg2.method8248(local15, local19, local348, local358, local351, local367, Static171.anIntArrayArray37[local42], Static88.anIntArrayArray20[local42], Static106.anIntArrayArray24[local42], local149, local152, local155, local158, local651, local653, local655);
						Static340.method5718(arg0, local15, local19);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZIIIIIIIILclient!os;)V")
	private void method7837(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class1_Sub17 arg9) {
		if (arg5 == 1) {
			arg0 = 1;
		} else if (arg5 == 2) {
			arg6 = 1;
			arg0 = 1;
		} else if (arg5 == 3) {
			arg6 = 1;
		}
		@Pc(52) int local52;
		if (arg2 < 0 || this.anInt9080 <= arg2 || arg8 < 0 || arg8 >= this.anInt9076) {
			while (true) {
				local52 = arg9.method4487();
				if (local52 == 0) {
					break;
				}
				if (local52 == 1) {
					arg9.method4487();
					break;
				}
				if (local52 <= 49) {
					arg9.method4487();
				}
			}
			return;
		}
		if (!this.aBoolean681 && !arg1) {
			Static379.aByteArrayArrayArray13[arg4][arg2][arg8] = 0;
		}
		while (true) {
			local52 = arg9.method4487();
			if (local52 == 0) {
				if (this.aBoolean681) {
					this.anIntArrayArrayArray20[0][arg6 + arg2][arg8 + arg0] = 0;
				} else if (arg4 == 0) {
					this.anIntArrayArrayArray20[0][arg2 + arg6][arg0 + arg8] = -Static179.method3508(arg7 + 932731, arg3 + 556238) * 8 << 0;
				} else {
					this.anIntArrayArrayArray20[arg4][arg2 + arg6][arg0 + arg8] = this.anIntArrayArrayArray20[arg4 - 1][arg2 + arg6][arg8 + arg0] - 240;
				}
				break;
			}
			if (local52 == 1) {
				@Pc(188) int local188 = arg9.method4487();
				if (this.aBoolean681) {
					this.anIntArrayArrayArray20[0][arg6 + arg2][arg0 + arg8] = local188 * 8 << 0;
				} else {
					if (local188 == 1) {
						local188 = 0;
					}
					if (arg4 == 0) {
						this.anIntArrayArrayArray20[0][arg2 + arg6][arg0 + arg8] = -local188 * 8 << 0;
					} else {
						this.anIntArrayArrayArray20[arg4][arg2 + arg6][arg0 + arg8] = this.anIntArrayArrayArray20[arg4 - 1][arg6 + arg2][arg0 + arg8] - (local188 * 8 << 0);
					}
				}
				break;
			}
			if (local52 <= 49) {
				if (arg1) {
					arg9.method4487();
				} else {
					this.aByteArrayArrayArray15[arg4][arg2][arg8] = arg9.method4482();
					this.aByteArrayArrayArray17[arg4][arg2][arg8] = (byte) ((local52 - 2) / 4);
					this.aByteArrayArrayArray14[arg4][arg2][arg8] = (byte) (local52 + arg5 - 2 & 0x3);
				}
			} else if (local52 <= 81) {
				if (!this.aBoolean681 && !arg1) {
					Static379.aByteArrayArrayArray13[arg4][arg2][arg8] = (byte) (local52 - 49);
				}
			} else if (!arg1) {
				this.aByteArrayArrayArray18[arg4][arg2][arg8] = (byte) (local52 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIB)V")
	public final void method7838(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9074; local7++) {
			this.method7849(arg0, local7, arg1);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!qa;Lclient!sa;Lclient!sa;I)V")
	public final void method7839(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) Class7 arg2) {
		if (Static10.anIntArray25 == null || Static10.anIntArray25.length != this.anInt9076) {
			Static10.anIntArray25 = new int[this.anInt9076];
			Static422.anIntArray705 = new int[this.anInt9076];
			Static13.anIntArray27 = new int[this.anInt9076];
			Static512.anIntArray784 = new int[this.anInt9076];
			Static40.anIntArray74 = new int[this.anInt9076];
		}
		@Pc(42) int[][] local42 = new int[this.anInt9080][this.anInt9076];
		@Pc(53) int local53;
		for (@Pc(49) int local49 = 0; local49 < this.anInt9074; local49++) {
			for (local53 = 0; local53 < this.anInt9076; local53++) {
				Static10.anIntArray25[local53] = 0;
				Static422.anIntArray705[local53] = 0;
				Static512.anIntArray784[local53] = 0;
				Static40.anIntArray74[local53] = 0;
				Static13.anIntArray27[local53] = 0;
			}
			for (@Pc(82) int local82 = -5; local82 < this.anInt9080; local82++) {
				@Pc(92) int local92;
				@Pc(107) int local107;
				@Pc(173) int local173;
				for (@Pc(86) int local86 = 0; local86 < this.anInt9076; local86++) {
					local92 = local82 + 5;
					@Pc(153) int local153;
					if (local92 < this.anInt9080) {
						local107 = this.aByteArrayArrayArray18[local49][local92][local86] & 0xFF;
						if (local107 > 0) {
							@Pc(117) Class123 local117 = this.aClass264_4.method6825(local107 - 1);
							Static10.anIntArray25[local86] += local117.anInt3427;
							Static422.anIntArray705[local86] += local117.anInt3426;
							Static512.anIntArray784[local86] += local117.anInt3425;
							Static40.anIntArray74[local86] += local117.anInt3430;
							local153 = Static13.anIntArray27[local86]++;
						}
					}
					local107 = local82 - 5;
					if (local107 >= 0) {
						local173 = this.aByteArrayArrayArray18[local49][local107][local86] & 0xFF;
						if (local173 > 0) {
							@Pc(183) Class123 local183 = this.aClass264_4.method6825(local173 - 1);
							Static10.anIntArray25[local86] -= local183.anInt3427;
							Static422.anIntArray705[local86] -= local183.anInt3426;
							Static512.anIntArray784[local86] -= local183.anInt3425;
							Static40.anIntArray74[local86] -= local183.anInt3430;
							local153 = Static13.anIntArray27[local86]--;
						}
					}
				}
				if (local82 >= 0) {
					local92 = 0;
					local107 = 0;
					local173 = 0;
					@Pc(240) int local240 = 0;
					@Pc(242) int local242 = 0;
					for (@Pc(244) int local244 = -5; local244 < this.anInt9076; local244++) {
						@Pc(250) int local250 = local244 + 5;
						if (local250 < this.anInt9076) {
							local107 += Static422.anIntArray705[local250];
							local92 += Static10.anIntArray25[local250];
							local173 += Static512.anIntArray784[local250];
							local240 += Static40.anIntArray74[local250];
							local242 += Static13.anIntArray27[local250];
						}
						@Pc(288) int local288 = local244 - 5;
						if (local288 >= 0) {
							local107 -= Static422.anIntArray705[local288];
							local240 -= Static40.anIntArray74[local288];
							local92 -= Static10.anIntArray25[local288];
							local242 -= Static13.anIntArray27[local288];
							local173 -= Static512.anIntArray784[local288];
						}
						if (local244 >= 0 && local240 > 0 && local242 > 0) {
							local42[local82][local244] = Static252.method4529(local92 * 256 / local240, local107 / local242, local173 / local242);
						}
					}
				}
			}
			if (Static44.aBoolean697) {
				this.method7845(arg0, local49, Static296.aClass7Array11[local49], local49 == 0 ? arg1 : null, local49 == 0 ? arg2 : null, local42);
			} else {
				this.method7836(local49, arg0, Static296.aClass7Array11[local49], local42, local49 == 0 ? arg1 : null, local49 == 0 ? arg2 : null);
			}
			this.aByteArrayArrayArray18[local49] = null;
			this.aByteArrayArrayArray15[local49] = null;
			this.aByteArrayArrayArray17[local49] = null;
			this.aByteArrayArrayArray14[local49] = null;
		}
		if (!this.aBoolean681) {
			if (Static275.anInt5266 != 0) {
				Static470.method6219();
			}
			if (Static18.aBoolean20) {
				Static394.method6254();
			}
		}
		for (local53 = 0; local53 < this.anInt9074; local53++) {
			Static296.aClass7Array11[local53].N();
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I[Lclient!qt;Lclient!qa;[[[I)V")
	public final void method7841(@OriginalArg(1) Class243[] arg0, @OriginalArg(2) Class4 arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (!this.aBoolean681) {
			for (local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt9080; local10++) {
					for (local14 = 0; local14 < this.anInt9076; local14++) {
						if ((Static379.aByteArrayArrayArray13[local6][local10][local14] & 0x1) != 0) {
							@Pc(31) int local31 = local6;
							if ((Static379.aByteArrayArrayArray13[1][local10][local14] & 0x2) != 0) {
								local31 = local6 - 1;
							}
							if (local31 >= 0) {
								arg0[local31].method6468(local10, local14);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt9074; local6++) {
			local10 = 0;
			local14 = 0;
			if (!this.aBoolean681) {
				if (Static33.aBoolean495) {
					local14 = 8;
				}
				if (Static18.aBoolean20) {
					local10 = 2;
				}
				if (Static275.anInt5266 != 0) {
					local10 |= 0x1;
					if (Static138.aBoolean688 | local6 == 0) {
						local14 |= 0x10;
					}
				}
			}
			if (Static18.aBoolean20) {
				local14 |= 0x7;
			}
			if (!Static145.aBoolean248) {
				local14 |= 0x20;
			}
			@Pc(153) int[][] local153 = arg2 == null || arg2.length <= local6 ? this.anIntArrayArrayArray20[local6] : arg2[local6];
			Static29.method800(local6, arg1.method7187(this.anInt9080, this.anInt9076, this.anIntArrayArrayArray20[local6], local153, local10, local14));
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II[Lclient!qt;ILclient!os;II)V")
	public final void method7842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class243[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub17 arg4, @OriginalArg(5) int arg5) {
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (!this.aBoolean681) {
			for (local6 = 0; local6 < 4; local6++) {
				@Pc(12) Class243 local12 = arg2[local6];
				for (local14 = 0; local14 < 64; local14++) {
					for (local18 = 0; local18 < 64; local18++) {
						local24 = arg0 + local14;
						@Pc(28) int local28 = arg3 + local18;
						if (local24 >= 0 && this.anInt9080 > local24 && local28 >= 0 && this.anInt9076 > local28) {
							local12.method6466(local24, local28);
						}
					}
				}
			}
		}
		local6 = arg1 + arg0;
		@Pc(80) int local80 = arg3 + arg5;
		for (local14 = 0; local14 < this.anInt9074; local14++) {
			for (local18 = 0; local18 < 64; local18++) {
				for (local24 = 0; local24 < 64; local24++) {
					this.method7837(0, false, local18 + arg0, local24 + local80, local14, 0, 0, local6 + local18, local24 - -arg3, arg4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!vn;[Z[[B[[BLclient!hca;IILclient!qa;I[[BIIII)V")
	private void method7843(@OriginalArg(0) Class307 arg0, @OriginalArg(1) boolean[] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) Class123 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class4 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte[][] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		@Pc(24) boolean[] local24 = arg0 != null && arg0.aBoolean683 ? Static91.aBooleanArrayArray11[arg10] : Static267.aBooleanArrayArray7[arg10];
		@Pc(43) int local43;
		@Pc(56) Class307 local56;
		@Pc(73) byte local73;
		@Pc(89) int local89;
		@Pc(94) int local94;
		if (arg6 > 0) {
			if (arg5 > 0) {
				local43 = arg3[arg5 - 1][arg6 - 1] & 0xFF;
				if (local43 > 0) {
					local56 = this.aClass143_5.method3941(local43 - 1);
					if (local56.anInt9138 != -1 && local56.aBoolean683) {
						local73 = arg9[arg5 - 1][arg6 - 1];
						local89 = arg2[arg5 - 1][arg6 - 1] * 2 + 4 & 0x7;
						local94 = Static487.method7512(local56, arg7);
						if (Static289.aBooleanArrayArray8[local73][local89]) {
							Static529.anIntArray839[0] = local56.anInt9138;
							Static298.anIntArray455[0] = local94;
							Static239.anIntArray668[0] = arg7.method7166() ? local56.anInt9141 : local56.anInt9143;
							Static272.anIntArray430[0] = local56.anInt9140;
							Static490.anIntArray756[0] = local56.anInt9144;
							Static530.anIntArray817[0] = 256;
						}
					}
				}
			}
			if (arg12 - 1 > arg5) {
				local43 = arg3[arg5 + 1][arg6 - 1] & 0xFF;
				if (local43 > 0) {
					local56 = this.aClass143_5.method3941(local43 - 1);
					if (local56.anInt9138 != -1 && local56.aBoolean683) {
						local73 = arg9[arg5 + 1][arg6 - 1];
						local89 = arg2[arg5 + 1][arg6 - 1] * 2 + 6 & 0x7;
						local94 = Static487.method7512(local56, arg7);
						if (Static289.aBooleanArrayArray8[local73][local89]) {
							Static529.anIntArray839[2] = local56.anInt9138;
							Static298.anIntArray455[2] = local94;
							Static239.anIntArray668[2] = arg7.method7166() ? local56.anInt9141 : local56.anInt9143;
							Static272.anIntArray430[2] = local56.anInt9140;
							Static490.anIntArray756[2] = local56.anInt9144;
							Static530.anIntArray817[2] = 512;
						}
					}
				}
			}
		}
		if (arg6 < arg11 - 1) {
			if (arg5 > 0) {
				local43 = arg3[arg5 - 1][arg6 + 1] & 0xFF;
				if (local43 > 0) {
					local56 = this.aClass143_5.method3941(local43 - 1);
					if (local56.anInt9138 != -1 && local56.aBoolean683) {
						local73 = arg9[arg5 - 1][arg6 + 1];
						local89 = arg2[arg5 - 1][arg6 + 1] * 2 + 2 & 0x7;
						local94 = Static487.method7512(local56, arg7);
						if (Static289.aBooleanArrayArray8[local73][local89]) {
							Static529.anIntArray839[6] = local56.anInt9138;
							Static298.anIntArray455[6] = local94;
							Static239.anIntArray668[6] = arg7.method7166() ? local56.anInt9141 : local56.anInt9143;
							Static272.anIntArray430[6] = local56.anInt9140;
							Static490.anIntArray756[6] = local56.anInt9144;
							Static530.anIntArray817[6] = 64;
						}
					}
				}
			}
			if (arg12 - 1 > arg5) {
				local43 = arg3[arg5 + 1][arg6 + 1] & 0xFF;
				if (local43 > 0) {
					local56 = this.aClass143_5.method3941(local43 - 1);
					if (local56.anInt9138 != -1 && local56.aBoolean683) {
						local73 = arg9[arg5 + 1][arg6 + 1];
						local89 = arg2[arg5 + 1][arg6 + 1] * 2 & 0x7;
						local94 = Static487.method7512(local56, arg7);
						if (Static289.aBooleanArrayArray8[local73][local89]) {
							Static529.anIntArray839[4] = local56.anInt9138;
							Static298.anIntArray455[4] = local94;
							Static239.anIntArray668[4] = arg7.method7166() ? local56.anInt9141 : local56.anInt9143;
							Static272.anIntArray430[4] = local56.anInt9140;
							Static490.anIntArray756[4] = local56.anInt9144;
							Static530.anIntArray817[4] = 128;
						}
					}
				}
			}
		}
		@Pc(527) int local527;
		@Pc(532) int local532;
		@Pc(534) int local534;
		@Pc(496) byte local496;
		if (arg6 > 0) {
			local43 = arg3[arg5][arg6 - 1] & 0xFF;
			if (local43 > 0) {
				local56 = this.aClass143_5.method3941(local43 - 1);
				if (local56.anInt9138 != -1) {
					local73 = arg9[arg5][arg6 - 1];
					local496 = arg2[arg5][arg6 - 1];
					if (local56.aBoolean683) {
						local94 = 2;
						local527 = local496 * 2 + 4;
						local532 = Static487.method7512(local56, arg7);
						for (local534 = 0; local534 < 3; local534++) {
							local527 &= 0x7;
							local94 &= 0x7;
							if (Static289.aBooleanArrayArray8[local73][local527] && local56.anInt9144 >= Static490.anIntArray756[local94]) {
								Static529.anIntArray839[local94] = local56.anInt9138;
								Static298.anIntArray455[local94] = local532;
								Static239.anIntArray668[local94] = arg7.method7166() ? local56.anInt9141 : local56.anInt9143;
								Static272.anIntArray430[local94] = local56.anInt9140;
								if (local56.anInt9144 == Static490.anIntArray756[local94]) {
									Static530.anIntArray817[local94] |= 0x20;
								} else {
									Static530.anIntArray817[local94] = 32;
								}
								Static490.anIntArray756[local94] = local56.anInt9144;
							}
							local527++;
							local94--;
						}
						if (!local24[--arg8 & 0x3]) {
							arg1[0] = Static91.aBooleanArrayArray11[local73][local496 + 2 & 0x3];
						}
					} else if (!local24[arg8 & 0x3]) {
						arg1[0] = Static267.aBooleanArrayArray7[local73][local496 + 2 & 0x3];
					}
				}
			}
		}
		if (arg11 - 1 > arg6) {
			local43 = arg3[arg5][arg6 + 1] & 0xFF;
			if (local43 > 0) {
				local56 = this.aClass143_5.method3941(local43 - 1);
				if (local56.anInt9138 != -1) {
					local73 = arg9[arg5][arg6 + 1];
					local496 = arg2[arg5][arg6 + 1];
					if (local56.aBoolean683) {
						local94 = 4;
						local527 = local496 * 2 + 2;
						local532 = Static487.method7512(local56, arg7);
						for (local534 = 0; local534 < 3; local534++) {
							local94 &= 0x7;
							local527 &= 0x7;
							if (Static289.aBooleanArrayArray8[local73][local527] && Static490.anIntArray756[local94] <= local56.anInt9144) {
								Static529.anIntArray839[local94] = local56.anInt9138;
								Static298.anIntArray455[local94] = local532;
								Static239.anIntArray668[local94] = arg7.method7166() ? local56.anInt9141 : local56.anInt9143;
								Static272.anIntArray430[local94] = local56.anInt9140;
								if (Static490.anIntArray756[local94] == local56.anInt9144) {
									Static530.anIntArray817[local94] |= 0x10;
								} else {
									Static530.anIntArray817[local94] = 16;
								}
								Static490.anIntArray756[local94] = local56.anInt9144;
							}
							local527--;
							local94++;
						}
						if (!local24[arg8 + 2 & 0x3]) {
							arg1[2] = Static91.aBooleanArrayArray11[local73][local496 & 0x3];
						}
					} else if (!local24[arg8 + 2 & 0x3]) {
						arg1[2] = Static267.aBooleanArrayArray7[local73][local496 & 0x3];
					}
				}
			}
		}
		if (arg5 > 0) {
			local43 = arg3[arg5 - 1][arg6] & 0xFF;
			if (local43 > 0) {
				local56 = this.aClass143_5.method3941(local43 - 1);
				if (local56.anInt9138 != -1) {
					local73 = arg9[arg5 - 1][arg6];
					local496 = arg2[arg5 - 1][arg6];
					if (local56.aBoolean683) {
						local94 = 6;
						local527 = local496 * 2 + 4;
						local532 = Static487.method7512(local56, arg7);
						for (local534 = 0; local534 < 3; local534++) {
							local94 &= 0x7;
							local527 &= 0x7;
							if (Static289.aBooleanArrayArray8[local73][local527] && local56.anInt9144 >= Static490.anIntArray756[local94]) {
								Static529.anIntArray839[local94] = local56.anInt9138;
								Static298.anIntArray455[local94] = local532;
								Static239.anIntArray668[local94] = arg7.method7166() ? local56.anInt9141 : local56.anInt9143;
								Static272.anIntArray430[local94] = local56.anInt9140;
								if (local56.anInt9144 == Static490.anIntArray756[local94]) {
									Static530.anIntArray817[local94] |= 0x8;
								} else {
									Static530.anIntArray817[local94] = 8;
								}
								Static490.anIntArray756[local94] = local56.anInt9144;
							}
							local94++;
							local527--;
						}
						if (!local24[arg8 + 3 & 0x3]) {
							arg1[3] = Static91.aBooleanArrayArray11[local73][local496 + 1 & 0x3];
						}
					} else if (!local24[arg8 + 3 & 0x3]) {
						arg1[3] = Static267.aBooleanArrayArray7[local73][local496 + 1 & 0x3];
					}
				}
			}
		}
		if (arg5 < arg12 - 1) {
			local43 = arg3[arg5 + 1][arg6] & 0xFF;
			if (local43 > 0) {
				local56 = this.aClass143_5.method3941(local43 - 1);
				if (local56.anInt9138 != -1) {
					local73 = arg9[arg5 + 1][arg6];
					local496 = arg2[arg5 + 1][arg6];
					if (local56.aBoolean683) {
						local94 = 4;
						local527 = local496 * 2 + 6;
						local532 = Static487.method7512(local56, arg7);
						for (local534 = 0; local534 < 3; local534++) {
							local527 &= 0x7;
							local94 &= 0x7;
							if (Static289.aBooleanArrayArray8[local73][local527] && local56.anInt9144 >= Static490.anIntArray756[local94]) {
								Static529.anIntArray839[local94] = local56.anInt9138;
								Static298.anIntArray455[local94] = local532;
								Static239.anIntArray668[local94] = arg7.method7166() ? local56.anInt9141 : local56.anInt9143;
								Static272.anIntArray430[local94] = local56.anInt9140;
								if (Static490.anIntArray756[local94] == local56.anInt9144) {
									Static530.anIntArray817[local94] |= 0x4;
								} else {
									Static530.anIntArray817[local94] = 4;
								}
								Static490.anIntArray756[local94] = local56.anInt9144;
							}
							local94--;
							local527++;
						}
						if (!local24[arg8 + 1 & 0x3]) {
							arg1[1] = Static91.aBooleanArrayArray11[local73][local496 + 3 & 0x3];
						}
					} else if (!local24[arg8 + 1 & 0x3]) {
						arg1[1] = Static267.aBooleanArrayArray7[local73][local496 + 3 & 0x3];
					}
				}
			}
		}
		if (arg0 == null) {
			return;
		}
		local43 = Static487.method7512(arg0, arg7);
		if (!arg0.aBoolean683) {
			return;
		}
		for (@Pc(1212) int local1212 = 0; local1212 < 8; local1212++) {
			@Pc(1223) int local1223 = local1212 - arg8 * 2 & 0x7;
			if (Static289.aBooleanArrayArray8[arg10][local1212] && arg0.anInt9144 >= Static490.anIntArray756[local1223]) {
				Static529.anIntArray839[local1223] = arg0.anInt9138;
				Static298.anIntArray455[local1223] = local43;
				Static239.anIntArray668[local1223] = arg7.method7166() ? arg0.anInt9141 : arg0.anInt9143;
				Static272.anIntArray430[local1223] = arg0.anInt9140;
				if (Static490.anIntArray756[local1223] == arg0.anInt9144) {
					Static530.anIntArray817[local1223] |= 0x2;
				} else {
					Static530.anIntArray817[local1223] = 2;
				}
				Static490.anIntArray756[local1223] = arg0.anInt9144;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI[Lclient!qt;IIILclient!os;III)V")
	public final void method7844(@OriginalArg(1) int arg0, @OriginalArg(2) Class243[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class1_Sub17 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg4 & 0x7) * 8;
		@Pc(17) int local17 = (arg7 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(56) int local56;
		if (!this.aBoolean681) {
			@Pc(24) Class243 local24 = arg1[arg6];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(44) int local44 = Static8.method394(arg8, local26 & 0x7, local30 & 0x7) + arg3;
					local56 = Static222.method4032(local30 & 0x7, local26 & 0x7, arg8) + arg0;
					if (local44 > 0 && local44 < this.anInt9080 - 1 && local56 > 0 && local56 < this.anInt9076 - 1) {
						local24.method6466(local44, local56);
					}
				}
			}
		}
		@Pc(103) int local103 = (arg4 & 0xFFFFFFF8) << 3;
		local26 = (arg7 & 0x1FFFFFF8) << 3;
		@Pc(111) byte local111 = 0;
		@Pc(113) byte local113 = 0;
		if (arg8 == 1) {
			local113 = 1;
		} else if (arg8 == 2) {
			local113 = 1;
			local111 = 1;
		} else if (arg8 == 3) {
			local111 = 1;
		}
		for (local56 = 0; local56 < this.anInt9074; local56++) {
			for (@Pc(142) int local142 = 0; local142 < 64; local142++) {
				for (@Pc(146) int local146 = 0; local146 < 64; local146++) {
					if (arg2 == local56 && local11 <= local142 && local11 + 8 >= local142 && local146 >= local17 && local17 + 8 >= local146) {
						@Pc(206) int local206;
						@Pc(216) int local216;
						if (local142 == local11 + 8 || local17 + 8 == local146) {
							if (arg8 == 0) {
								local216 = local146 + arg0 - local17;
								local206 = arg3 + local142 - local11;
							} else if (arg8 == 1) {
								local206 = arg3 + local146 - local17;
								local216 = local11 + arg0 + 8 - local142;
							} else if (arg8 == 2) {
								local216 = arg0 + local17 + 8 - local146;
								local206 = arg3 + local11 + 8 - local142;
							} else {
								local216 = local142 + arg0 - local11;
								local206 = local17 + arg3 + 8 - local146;
							}
							this.method7837(0, true, local206, local26 + local146, arg6, 0, 0, local142 + local103, local216, arg5);
						} else {
							local206 = Static8.method394(arg8, local142 & 0x7, local146 & 0x7) + arg3;
							local216 = Static222.method4032(local146 & 0x7, local142 & 0x7, arg8) + arg0;
							this.method7837(local113, false, local206, local26 + local146, arg6, arg8, local111, local103 + local142, local216, arg5);
						}
						if (local142 == 63 || local146 == 63) {
							@Pc(340) byte local340 = 1;
							if (local142 == 63 && local146 == 63) {
								local340 = 3;
							}
							for (@Pc(354) int local354 = 0; local354 < local340; local354++) {
								@Pc(358) int local358 = local142;
								@Pc(360) int local360 = local146;
								if (local354 == 0) {
									local358 = local142 == 63 ? 64 : local142;
									local360 = local146 == 63 ? 64 : local146;
								} else if (local354 == 1) {
									local358 = 64;
								} else if (local354 == 2) {
									local360 = 64;
								}
								@Pc(414) int local414;
								@Pc(423) int local423;
								if (arg8 == 0) {
									local423 = local360 + arg0 - local17;
									local414 = arg3 + local358 - local11;
								} else if (arg8 == 1) {
									local423 = arg0 + local11 + 8 - local358;
									local414 = local360 + arg3 - local17;
								} else if (arg8 == 2) {
									local414 = local11 + arg3 + 8 - local358;
									local423 = arg0 + local17 + 8 - local360;
								} else {
									local423 = local358 + arg0 - local11;
									local414 = local17 + arg3 + 8 - local360;
								}
								if (local414 >= 0 && local414 < this.anInt9080 && local423 >= 0 && local423 < this.anInt9076) {
									this.anIntArrayArrayArray20[arg6][local414][local423] = this.anIntArrayArrayArray20[arg6][local111 + local206][local113 + local216];
								}
							}
						}
					} else {
						this.method7837(0, false, -1, 0, 0, 0, 0, 0, -1, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!qa;IILclient!sa;Lclient!sa;Lclient!sa;[[I)V")
	private void method7845(@OriginalArg(0) Class4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class7 arg2, @OriginalArg(4) Class7 arg3, @OriginalArg(5) Class7 arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray17[arg1];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray14[arg1];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray18[arg1];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray15[arg1];
		for (@Pc(27) int local27 = 0; local27 < this.anInt9080; local27++) {
			@Pc(45) int local45 = local27 < this.anInt9080 - 1 ? local27 + 1 : local27;
			for (@Pc(47) int local47 = 0; local47 < this.anInt9076; local47++) {
				@Pc(61) int local61 = this.anInt9076 - 1 > local47 ? local47 + 1 : local47;
				if (Static398.anInt7022 == -1 || Static29.method801(local27, arg1, Static398.anInt7022, local47)) {
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
						@Pc(151) Class307 local151 = local100 == 0 ? null : this.aClass143_5.method3941(local100 - 1);
						@Pc(166) Class123 local166 = local108 == 0 ? null : this.aClass264_4.method6825(local108 - 1);
						if (local86 == 0 && local151 == null) {
							local86 = 12;
						}
						@Pc(174) Class307 local174 = local151;
						if (local151 != null) {
							if (local151.anInt9138 == -1 && local151.anInt9145 == -1) {
								local174 = local151;
								local151 = null;
							} else if (local166 != null && local86 != 0) {
								local77 = local151.aBoolean683;
							}
						}
						@Pc(255) int local255;
						@Pc(300) int local300;
						@Pc(361) int local361;
						@Pc(371) int local371;
						if ((local86 == 0 || local86 == 12) && local27 > 0 && local47 > 0 && this.anInt9080 > local27 && this.anInt9076 > local47) {
							local255 = local20[local27 - 1][local47 - 1] == local108 ? 1 : -1;
							@Pc(268) int local268 = local108 == local20[local45][local61] ? 1 : -1;
							@Pc(285) int local285 = local108 == local20[local45][local47 - 1] ? 1 : -1;
							local300 = local108 == local20[local27 - 1][local61] ? 1 : -1;
							if (local20[local27][local47 - 1] == local108) {
								local285++;
								local255++;
							} else {
								local255--;
								local285--;
							}
							if (local20[local45][local47] == local108) {
								local268++;
								local285++;
							} else {
								local268--;
								local285--;
							}
							if (local108 == local20[local27][local61]) {
								local300++;
								local268++;
							} else {
								local268--;
								local300--;
							}
							if (local20[local27 - 1][local47] == local108) {
								local300++;
								local255++;
							} else {
								local300--;
								local255--;
							}
							local361 = local255 - local268;
							if (local361 < 0) {
								local361 = -local361;
							}
							local371 = local285 - local300;
							if (local371 < 0) {
								local371 = -local371;
							}
							if (local371 == local361) {
								local361 = arg2.ba(local27, local47) - arg2.ba(local45, local61);
								local371 = arg2.ba(local45, local47) - arg2.ba(local27, local61);
								if (local361 < 0) {
									local361 = -local361;
								}
								if (local371 < 0) {
									local371 = -local371;
								}
							}
							local92 = local371 > local361 ? 1 : 0;
						}
						for (local255 = 0; local255 < 13; local255++) {
							Static490.anIntArray756[local255] = -1;
							Static530.anIntArray817[local255] = 1;
						}
						@Pc(456) boolean[] local456 = local151 != null && local151.aBoolean683 ? Static91.aBooleanArrayArray11[local86] : Static267.aBooleanArrayArray7[local86];
						this.method7843(local151, local80, local15, local25, local166, local27, local47, arg0, local92, local10, local86, this.anInt9076, this.anInt9080);
						@Pc(485) boolean local485 = local151 != null && local151.anInt9138 != local151.anInt9145;
						if (!local485) {
							for (local300 = 0; local300 < 8; local300++) {
								if (Static490.anIntArray756[local300] >= 0 && Static529.anIntArray839[local300] != Static298.anIntArray455[local300]) {
									local485 = true;
									break;
								}
							}
						}
						if (!local456[local92 + 1 & 0x3]) {
							local80[1] = Static64.method1612(local80[1], (Static530.anIntArray817[2] & Static530.anIntArray817[4]) == 0);
						}
						if (!local456[local92 + 3 & 0x3]) {
							local80[3] = Static64.method1612(local80[3], (Static530.anIntArray817[0] & Static530.anIntArray817[6]) == 0);
						}
						if (!local456[local92 & 0x3]) {
							local80[0] = Static64.method1612(local80[0], (Static530.anIntArray817[0] & Static530.anIntArray817[2]) == 0);
						}
						if (!local456[local92 + 2 & 0x3]) {
							local80[2] = Static64.method1612(local80[2], (Static530.anIntArray817[6] & Static530.anIntArray817[4]) == 0);
						}
						if (!local77 && (local86 == 0 || local86 == 12)) {
							if (local80[0] && !local80[1] && !local80[2] && local80[3]) {
								local92 = 0;
								local80[0] = local80[3] = false;
								local86 = local86 == 0 ? 13 : 14;
							} else if (local80[0] && local80[1] && !local80[2] && !local80[3]) {
								local80[0] = local80[1] = false;
								local86 = local86 == 0 ? 13 : 14;
								local92 = 3;
							} else if (!local80[0] && local80[1] && local80[2] && !local80[3]) {
								local80[1] = local80[2] = false;
								local92 = 2;
								local86 = local86 == 0 ? 13 : 14;
							} else if (!local80[0] && !local80[1] && local80[2] && local80[3]) {
								local92 = 1;
								local86 = local86 == 0 ? 13 : 14;
								local80[2] = local80[3] = false;
							}
						}
						@Pc(794) boolean local794 = !local77 && !local80[0] && !local80[2] && !local80[1] && !local80[3];
						@Pc(796) int[] local796 = null;
						@Pc(826) int[] local826;
						@Pc(810) int[] local810;
						@Pc(814) int[] local814;
						if (local794) {
							local371 = local151 == null ? 0 : Static45.anIntArray82[local86];
							local810 = Static88.anIntArrayArray20[local86];
							local814 = Static106.anIntArrayArray24[local86];
							local361 = local166 == null ? 0 : Static197.anIntArray314[local86];
							local826 = Static171.anIntArrayArray37[local86];
						} else if (local77) {
							local814 = Static87.anIntArrayArray19[local86];
							local361 = local166 == null ? 0 : Static540.anIntArray838[local86];
							local371 = local151 == null ? 0 : Static61.anIntArray99[local86];
							local826 = Static2.anIntArrayArray1[local86];
							local796 = Static448.anIntArrayArray106[local86];
							local810 = Static151.anIntArrayArray62[local86];
						} else {
							local814 = Static250.anIntArrayArray58[local86];
							local361 = local166 == null ? 0 : Static251.anIntArray403[local86];
							local810 = Static334.anIntArrayArray84[local86];
							local796 = Static491.anIntArrayArray112[local86];
							local371 = local151 == null ? 0 : Static144.anIntArray246[local86];
							local826 = Static429.anIntArrayArray98[local86];
						}
						@Pc(899) int local899 = local361 + local371;
						if (local899 <= 0) {
							Static340.method5718(arg1, local27, local47);
						} else {
							if (local80[0]) {
								local899++;
							}
							if (local80[2]) {
								local899++;
							}
							if (local80[1]) {
								local899++;
							}
							if (local80[3]) {
								local899++;
							}
							@Pc(932) int local932 = 0;
							@Pc(934) int local934 = 0;
							@Pc(938) int local938 = local899 * 3;
							@Pc(945) int[] local945 = local485 ? new int[local938] : null;
							@Pc(948) int[] local948 = new int[local938];
							@Pc(951) int[] local951 = new int[local938];
							@Pc(954) int[] local954 = new int[local938];
							@Pc(957) int[] local957 = new int[local938];
							@Pc(960) int[] local960 = new int[local938];
							@Pc(967) int[] local967 = arg4 == null ? null : new int[local938];
							@Pc(976) int[] local976 = arg4 == null && arg3 == null ? null : new int[local938];
							@Pc(978) int local978 = -1;
							@Pc(980) int local980 = -1;
							@Pc(982) int local982 = 256;
							@Pc(1088) byte local1088;
							@Pc(1032) int local1032;
							@Pc(1034) int local1034;
							@Pc(1261) int local1261;
							@Pc(1267) int local1267;
							@Pc(1276) int local1276;
							@Pc(1281) int local1281;
							@Pc(1293) int local1293;
							@Pc(1286) int local1286;
							@Pc(1298) int local1298;
							@Pc(1355) int local1355;
							@Pc(1361) int local1361;
							if (local151 != null) {
								local978 = local151.anInt9138;
								local980 = arg0.method7166() ? local151.anInt9141 : local151.anInt9143;
								local982 = local151.anInt9140;
								local1032 = Static487.method7512(local151, arg0);
								for (local1034 = 0; local1034 < local371; local1034++) {
									if (local80[-local92 & 0x3] && local932 == local796[0]) {
										Static145.anIntArray249[0] = local826[local932];
										Static145.anIntArray249[1] = 1;
										Static145.anIntArray249[2] = local814[local932];
										Static145.anIntArray249[3] = 1;
										Static145.anIntArray249[4] = local810[local932];
										Static145.anIntArray249[5] = local814[local932];
										local1088 = 6;
									} else if (local80[2 - local92 & 0x3] && local932 == local796[2]) {
										Static145.anIntArray249[0] = local826[local932];
										Static145.anIntArray249[1] = 5;
										Static145.anIntArray249[2] = local814[local932];
										Static145.anIntArray249[3] = 5;
										Static145.anIntArray249[4] = local810[local932];
										Static145.anIntArray249[5] = local814[local932];
										local1088 = 6;
									} else if (local80[1 - local92 & 0x3] && local932 == local796[1]) {
										Static145.anIntArray249[0] = local826[local932];
										Static145.anIntArray249[1] = 3;
										Static145.anIntArray249[2] = local814[local932];
										Static145.anIntArray249[3] = 3;
										Static145.anIntArray249[4] = local810[local932];
										Static145.anIntArray249[5] = local814[local932];
										local1088 = 6;
									} else if (local80[3 - local92 & 0x3] && local796[3] == local932) {
										Static145.anIntArray249[0] = local826[local932];
										Static145.anIntArray249[1] = 7;
										Static145.anIntArray249[2] = local814[local932];
										Static145.anIntArray249[3] = 7;
										Static145.anIntArray249[4] = local810[local932];
										local1088 = 6;
										Static145.anIntArray249[5] = local814[local932];
									} else {
										Static145.anIntArray249[0] = local826[local932];
										Static145.anIntArray249[1] = local810[local932];
										Static145.anIntArray249[2] = local814[local932];
										local1088 = 3;
									}
									for (local1261 = 0; local1261 < local1088; local1261++) {
										local1267 = Static145.anIntArray249[local1261];
										local1276 = local1267 - local92 * 2 & 0x7;
										local1281 = this.anIntArray787[local1267];
										local1286 = this.anIntArray786[local1267];
										if (local92 == 1) {
											local1293 = local1286;
											local1298 = 128 - local1281;
										} else if (local92 == 2) {
											local1298 = 128 - local1286;
											local1293 = 128 - local1281;
										} else if (local92 == 3) {
											local1298 = local1281;
											local1293 = 128 - local1286;
										} else {
											local1298 = local1286;
											local1293 = local1281;
										}
										local948[local934] = local1293;
										local951[local934] = local1298;
										if (local967 != null && Static289.aBooleanArrayArray8[local86][local1267]) {
											local1355 = local1293 + (local27 << 7);
											local1361 = (local47 << 7) + local1298;
											local967[local934] = arg4.aa(local1355, local1361) - arg2.aa(local1355, local1361);
										}
										if (local976 != null) {
											if (arg4 != null && !Static289.aBooleanArrayArray8[local86][local1267]) {
												local1355 = local1293 + (local27 << 7);
												local1361 = (local47 << 7) + local1298;
												local976[local934] = arg2.aa(local1355, local1361) - arg4.aa(local1355, local1361);
											} else if (arg3 != null && !Static388.aBooleanArrayArray9[local86][local1267]) {
												local1355 = (local27 << 7) + local1293;
												local1361 = local1298 + (local47 << 7);
												local976[local934] = arg3.aa(local1355, local1361) - arg2.aa(local1355, local1361);
											}
										}
										if (local1267 < 8 && local151.anInt9144 < Static490.anIntArray756[local1276]) {
											if (local945 != null) {
												local945[local934] = Static298.anIntArray455[local1276];
											}
											local960[local934] = Static272.anIntArray430[local1276];
											local957[local934] = Static239.anIntArray668[local1276];
											local954[local934] = Static529.anIntArray839[local1276];
										} else {
											if (local945 != null) {
												local945[local934] = local1032;
											}
											local957[local934] = arg0.method7166() ? local151.anInt9141 : local151.anInt9143;
											local960[local934] = local151.anInt9140;
											local954[local934] = local978;
										}
										local934++;
									}
									local932++;
								}
								if (!this.aBoolean681 && arg1 == 0) {
									Static167.method3161(local27, local47, local151.anInt9146, local151.anInt9139 * 8, local151.anInt9137);
								}
								if (local86 != 12 && local151.anInt9138 != -1 && local151.aBoolean685) {
									local75 = true;
								}
							} else if (local794) {
								local932 = Static45.anIntArray82[local86];
							} else if (local77) {
								local932 = Static61.anIntArray99[local86];
							} else {
								local932 = Static144.anIntArray246[local86];
							}
							if (local166 != null) {
								if (local124 == 0) {
									local124 = local108;
								}
								if (local116 == 0) {
									local116 = local108;
								}
								if (local132 == 0) {
									local132 = local108;
								}
								@Pc(1586) Class123 local1586 = this.aClass264_4.method6825(local108 - 1);
								@Pc(1594) Class123 local1594 = this.aClass264_4.method6825(local116 - 1);
								@Pc(1602) Class123 local1602 = this.aClass264_4.method6825(local124 - 1);
								@Pc(1610) Class123 local1610 = this.aClass264_4.method6825(local132 - 1);
								for (local1276 = 0; local1276 < local361; local1276++) {
									if (local80[-local92 & 0x3] && local932 == local796[0]) {
										Static145.anIntArray249[0] = local826[local932];
										Static145.anIntArray249[1] = 1;
										Static145.anIntArray249[2] = local814[local932];
										Static145.anIntArray249[3] = 1;
										Static145.anIntArray249[4] = local810[local932];
										local1088 = 6;
										Static145.anIntArray249[5] = local814[local932];
									} else if (local80[2 - local92 & 0x3] && local796[2] == local932) {
										Static145.anIntArray249[0] = local826[local932];
										Static145.anIntArray249[1] = 5;
										Static145.anIntArray249[2] = local814[local932];
										Static145.anIntArray249[3] = 5;
										Static145.anIntArray249[4] = local810[local932];
										Static145.anIntArray249[5] = local814[local932];
										local1088 = 6;
									} else if (local80[1 - local92 & 0x3] && local796[1] == local932) {
										Static145.anIntArray249[0] = local826[local932];
										Static145.anIntArray249[1] = 3;
										Static145.anIntArray249[2] = local814[local932];
										Static145.anIntArray249[3] = 3;
										Static145.anIntArray249[4] = local810[local932];
										local1088 = 6;
										Static145.anIntArray249[5] = local814[local932];
									} else if (local80[3 - local92 & 0x3] && local796[3] == local932) {
										Static145.anIntArray249[0] = local826[local932];
										Static145.anIntArray249[1] = 7;
										Static145.anIntArray249[2] = local814[local932];
										Static145.anIntArray249[3] = 7;
										Static145.anIntArray249[4] = local810[local932];
										local1088 = 6;
										Static145.anIntArray249[5] = local814[local932];
									} else {
										Static145.anIntArray249[0] = local826[local932];
										Static145.anIntArray249[1] = local810[local932];
										Static145.anIntArray249[2] = local814[local932];
										local1088 = 3;
									}
									local932++;
									for (local1281 = 0; local1281 < local1088; local1281++) {
										local1293 = Static145.anIntArray249[local1281];
										local1286 = local1293 - local92 * 2 & 0x7;
										local1298 = this.anIntArray787[local1293];
										local1361 = this.anIntArray786[local1293];
										@Pc(1881) int local1881;
										if (local92 == 1) {
											local1881 = 128 - local1298;
											local1355 = local1361;
										} else if (local92 == 2) {
											local1881 = 128 - local1361;
											local1355 = 128 - local1298;
										} else if (local92 == 3) {
											local1355 = 128 - local1361;
											local1881 = local1298;
										} else {
											local1355 = local1298;
											local1881 = local1361;
										}
										local948[local934] = local1355;
										local951[local934] = local1881;
										@Pc(1933) int local1933;
										@Pc(1939) int local1939;
										if (local967 != null && Static289.aBooleanArrayArray8[local86][local1293]) {
											local1933 = local1355 + (local27 << 7);
											local1939 = local1881 + (local47 << 7);
											local967[local934] = arg4.aa(local1933, local1939) - arg2.aa(local1933, local1939);
										}
										if (local976 != null) {
											if (arg4 != null && !Static289.aBooleanArrayArray8[local86][local1293]) {
												local1933 = local1355 + (local27 << 7);
												local1939 = (local47 << 7) + local1881;
												local976[local934] = arg2.aa(local1933, local1939) - arg4.aa(local1933, local1939);
											} else if (arg3 != null && !Static388.aBooleanArrayArray9[local86][local1293]) {
												local1933 = (local27 << 7) + local1355;
												local1939 = (local47 << 7) + local1881;
												local976[local934] = arg3.aa(local1933, local1939) - arg2.aa(local1933, local1939);
											}
										}
										if (local1293 < 8 && Static490.anIntArray756[local1286] >= 0) {
											if (local945 != null) {
												local945[local934] = Static298.anIntArray455[local1286];
											}
											local960[local934] = Static272.anIntArray430[local1286];
											local957[local934] = Static239.anIntArray668[local1286];
											local954[local934] = Static529.anIntArray839[local1286];
										} else {
											if (local77 && Static289.aBooleanArrayArray8[local86][local1293]) {
												local957[local934] = local980;
												local960[local934] = local982;
												local954[local934] = local978;
											} else if (local1355 == 0 && local1881 == 0) {
												local954[local934] = arg5[local27][local47];
												local957[local934] = local1586.anInt3431;
												local960[local934] = local1586.anInt3435;
											} else if (local1355 == 0 && local1881 == 128) {
												local954[local934] = arg5[local27][local61];
												local957[local934] = local1594.anInt3431;
												local960[local934] = local1594.anInt3435;
											} else if (local1355 == 128 && local1881 == 128) {
												local954[local934] = arg5[local45][local61];
												local957[local934] = local1602.anInt3431;
												local960[local934] = local1602.anInt3435;
											} else if (local1355 == 128 && local1881 == 0) {
												local954[local934] = arg5[local45][local47];
												local957[local934] = local1610.anInt3431;
												local960[local934] = local1610.anInt3435;
											} else {
												if (local1355 >= 64) {
													if (local1881 < 64) {
														local957[local934] = local1610.anInt3431;
														local960[local934] = local1610.anInt3435;
													} else {
														local957[local934] = local1602.anInt3431;
														local960[local934] = local1602.anInt3435;
													}
												} else if (local1881 < 64) {
													local957[local934] = local1586.anInt3431;
													local960[local934] = local1586.anInt3435;
												} else {
													local957[local934] = local1594.anInt3431;
													local960[local934] = local1594.anInt3435;
												}
												local1933 = Static108.method2196(arg5[local45][local47], arg5[local27][local47], local1355 << 7 >> 7);
												local1939 = Static108.method2196(arg5[local45][local61], arg5[local27][local61], local1355 << 7 >> 7);
												local954[local934] = Static108.method2196(local1939, local1933, local1881 << 7 >> 7);
											}
											if (local945 != null) {
												local945[local934] = local954[local934];
											}
										}
										local934++;
									}
								}
								if (local86 != 0 && local166.aBoolean277) {
									local75 = true;
								}
							}
							local1032 = arg2.ba(local27, local47);
							local1034 = arg2.ba(local45, local47);
							local1261 = arg2.ba(local45, local61);
							local1267 = arg2.ba(local27, local61);
							if (arg1 > 0) {
								@Pc(2360) boolean local2360 = true;
								if (local108 == 0 && local86 != 0) {
									local2360 = false;
								}
								if (local100 > 0 && local174 != null && !local174.aBoolean684) {
									local2360 = false;
								}
								if (local2360 && local1032 == local1034 && local1261 == local1032 && local1267 == local1032) {
									this.aByteArrayArrayArray16[arg1][local27][local47] = (byte) (this.aByteArrayArrayArray16[arg1][local27][local47] | 0x4);
								}
							}
							local1276 = 0;
							local1281 = 0;
							local1293 = 0;
							if (this.aBoolean681) {
								local1276 = Static100.method2039(local27, local47);
								local1281 = Static431.method6703(local27, local47);
								local1293 = Static407.method6490(local27, local47);
							}
							arg2.IA(local27, local47, local948, local967, local951, local976, local954, local945, local957, local960, local1276, local1281, local1293, local75);
							Static340.method5718(arg1, local27, local47);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "([[III)V")
	public final void method7846(@OriginalArg(0) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray20[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt9080 + 1; local12++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt9076 + 1; local18++) {
				local10[local12][local18] += arg0[local12][local18];
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIII)V")
	private void method7849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = arg0; local7 < arg0 + 64; local7++) {
			for (local11 = arg2; local11 < arg2 + 64; local11++) {
				if (local11 >= 0 && this.anInt9080 > local11 && local7 >= 0 && this.anInt9076 > local7) {
					this.anIntArrayArrayArray20[arg1][local11][local7] = arg1 <= 0 ? 0 : this.anIntArrayArrayArray20[arg1 - 1][local11][local7] - 240;
				}
			}
		}
		if (arg2 > 0 && this.anInt9080 > arg2) {
			for (local11 = arg0 + 1; local11 < arg0 + 64; local11++) {
				if (local11 >= 0 && local11 < this.anInt9076) {
					this.anIntArrayArrayArray20[arg1][arg2][local11] = this.anIntArrayArrayArray20[arg1][arg2 - 1][local11];
				}
			}
		}
		if (arg0 > 0 && arg0 < this.anInt9076) {
			for (local11 = arg2 + 1; local11 < arg2 + 64; local11++) {
				if (local11 >= 0 && local11 < this.anInt9080) {
					this.anIntArrayArrayArray20[arg1][local11][arg0] = this.anIntArrayArrayArray20[arg1][local11][arg0 - 1];
				}
			}
		}
		if (arg2 < 0 || arg0 < 0 || this.anInt9080 <= arg2 || this.anInt9076 <= arg0) {
			return;
		}
		if (arg1 == 0) {
			if (arg2 > 0 && this.anIntArrayArrayArray20[arg1][arg2 - 1][arg0] != 0) {
				this.anIntArrayArrayArray20[arg1][arg2][arg0] = this.anIntArrayArrayArray20[arg1][arg2 - 1][arg0];
				return;
			}
			if (arg0 > 0 && this.anIntArrayArrayArray20[arg1][arg2][arg0 - 1] != 0) {
				this.anIntArrayArrayArray20[arg1][arg2][arg0] = this.anIntArrayArrayArray20[arg1][arg2][arg0 - 1];
				return;
			}
			if (arg2 > 0 && arg0 > 0 && this.anIntArrayArrayArray20[arg1][arg2 - 1][arg0 - 1] != 0) {
				this.anIntArrayArrayArray20[arg1][arg2][arg0] = this.anIntArrayArrayArray20[arg1][arg2 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray20[arg1 - 1][arg2 - 1][arg0] != this.anIntArrayArrayArray20[arg1][arg2 - 1][arg0]) {
			this.anIntArrayArrayArray20[arg1][arg2][arg0] = this.anIntArrayArrayArray20[arg1][arg2 - 1][arg0];
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray20[arg1 - 1][arg2][arg0 - 1] != this.anIntArrayArrayArray20[arg1][arg2][arg0 - 1]) {
			this.anIntArrayArrayArray20[arg1][arg2][arg0] = this.anIntArrayArrayArray20[arg1][arg2][arg0 - 1];
			return;
		}
		if (arg2 > 0 && arg0 > 0 && this.anIntArrayArrayArray20[arg1][arg2 - 1][arg0 - 1] != this.anIntArrayArrayArray20[arg1 - 1][arg2 - 1][arg0 - 1]) {
			this.anIntArrayArrayArray20[arg1][arg2][arg0] = this.anIntArrayArrayArray20[arg1][arg2 - 1][arg0 - 1];
			return;
		}
	}
}
