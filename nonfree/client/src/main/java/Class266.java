import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public class Class266 {

	@OriginalMember(owner = "client!wj", name = "k", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!wj", name = "s", descriptor = "[I")
	private final int[] anIntArray556 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!wj", name = "l", descriptor = "[I")
	private final int[] anIntArray555 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!wj", name = "t", descriptor = "Z")
	public final boolean aBoolean687;

	@OriginalMember(owner = "client!wj", name = "C", descriptor = "Lclient!kb;")
	private final Class124 aClass124_7;

	@OriginalMember(owner = "client!wj", name = "w", descriptor = "I")
	protected final int anInt7296;

	@OriginalMember(owner = "client!wj", name = "u", descriptor = "Lclient!qd;")
	private final Class192 aClass192_5;

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
	protected final int anInt7290;

	@OriginalMember(owner = "client!wj", name = "G", descriptor = "I")
	public final int anInt7302;

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!wj", name = "r", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!wj", name = "m", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!wj", name = "z", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!wj", name = "q", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(IIIZLclient!kb;Lclient!qd;)V")
	protected Class266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class124 arg4, @OriginalArg(5) Class192 arg5) {
		this.aBoolean687 = arg3;
		this.aClass124_7 = arg4;
		this.anInt7296 = arg1;
		this.aClass192_5 = arg5;
		this.anInt7290 = arg2;
		this.anInt7302 = arg0;
		this.aByteArrayArrayArray13 = new byte[this.anInt7302][this.anInt7296][this.anInt7290];
		this.aByteArrayArrayArray17 = new byte[this.anInt7302][this.anInt7296][this.anInt7290];
		this.aByteArrayArrayArray15 = new byte[this.anInt7302][this.anInt7296][this.anInt7290];
		this.anIntArrayArrayArray15 = new int[this.anInt7302][this.anInt7296 + 1][this.anInt7290 + 1];
		this.aByteArrayArrayArray12 = new byte[this.anInt7302][this.anInt7296 + 1][this.anInt7290 + 1];
		this.aByteArrayArrayArray16 = new byte[this.anInt7302][this.anInt7296][this.anInt7290];
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIII)V")
	public final void method5630(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7302; local3++) {
			this.method5631(64, local3, 64, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZIIIII)V")
	public final void method5631(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = arg3; local3 < arg3 + arg0; local3++) {
			for (local7 = arg4; local7 < arg2 + arg4; local7++) {
				if (local7 >= 0 && local7 < this.anInt7296 && local3 >= 0 && this.anInt7290 > local3) {
					this.anIntArrayArrayArray15[arg1][local7][local3] = arg1 <= 0 ? 0 : this.anIntArrayArrayArray15[arg1 - 1][local7][local3] - 240;
				}
			}
		}
		if (arg4 > 0 && arg4 < this.anInt7296) {
			for (local7 = arg3 + 1; local7 < arg0 + arg3; local7++) {
				if (local7 >= 0 && local7 < this.anInt7290) {
					this.anIntArrayArrayArray15[arg1][arg4][local7] = this.anIntArrayArrayArray15[arg1][arg4 - 1][local7];
				}
			}
		}
		if (arg3 > 0 && arg3 < this.anInt7290) {
			for (local7 = arg4 + 1; local7 < arg4 + arg2; local7++) {
				if (local7 >= 0 && local7 < this.anInt7296) {
					this.anIntArrayArrayArray15[arg1][local7][arg3] = this.anIntArrayArrayArray15[arg1][local7][arg3 - 1];
				}
			}
		}
		if (arg4 < 0 || arg3 < 0 || arg4 >= this.anInt7296 || this.anInt7290 <= arg3) {
			return;
		}
		if (arg1 != 0) {
			if (arg4 > 0 && this.anIntArrayArrayArray15[arg1 - 1][arg4 - 1][arg3] != this.anIntArrayArrayArray15[arg1][arg4 - 1][arg3]) {
				this.anIntArrayArrayArray15[arg1][arg4][arg3] = this.anIntArrayArrayArray15[arg1][arg4 - 1][arg3];
				return;
			}
			if (arg3 > 0 && this.anIntArrayArrayArray15[arg1 - 1][arg4][arg3 - 1] != this.anIntArrayArrayArray15[arg1][arg4][arg3 - 1]) {
				this.anIntArrayArrayArray15[arg1][arg4][arg3] = this.anIntArrayArrayArray15[arg1][arg4][arg3 - 1];
				return;
			}
			if (arg4 > 0 && arg3 > 0 && this.anIntArrayArrayArray15[arg1 - 1][arg4 - 1][arg3 - 1] != this.anIntArrayArrayArray15[arg1][arg4 - 1][arg3 - 1]) {
				this.anIntArrayArrayArray15[arg1][arg4][arg3] = this.anIntArrayArrayArray15[arg1][arg4 - 1][arg3 - 1];
				return;
			}
			return;
		}
		if (arg4 > 0 && this.anIntArrayArrayArray15[arg1][arg4 - 1][arg3] != 0) {
			this.anIntArrayArrayArray15[arg1][arg4][arg3] = this.anIntArrayArrayArray15[arg1][arg4 - 1][arg3];
			return;
		}
		if (arg3 > 0 && this.anIntArrayArrayArray15[arg1][arg4][arg3 - 1] != 0) {
			this.anIntArrayArrayArray15[arg1][arg4][arg3] = this.anIntArrayArrayArray15[arg1][arg4][arg3 - 1];
			return;
		}
		if (arg4 > 0 && arg3 > 0 && this.anIntArrayArrayArray15[arg1][arg4 - 1][arg3 - 1] != 0) {
			this.anIntArrayArrayArray15[arg1][arg4][arg3] = this.anIntArrayArrayArray15[arg1][arg4 - 1][arg3 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I[[II)V")
	public final void method5633(@OriginalArg(1) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray15[0];
		for (@Pc(23) int local23 = 0; local23 < this.anInt7296 + 1; local23++) {
			for (@Pc(27) int local27 = 0; local27 < this.anInt7290 + 1; local27++) {
				local10[local23][local27] += arg0[local23][local27];
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIILclient!iv;I[Lclient!sd;I)V")
	public final void method5634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub12 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class213[] arg4, @OriginalArg(6) int arg5) {
		@Pc(16) int local16;
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(34) int local34;
		if (!this.aBoolean687) {
			for (local16 = 0; local16 < 4; local16++) {
				@Pc(22) Class213 local22 = arg4[local16];
				for (local24 = 0; local24 < 64; local24++) {
					for (local28 = 0; local28 < 64; local28++) {
						local34 = arg3 + local24;
						@Pc(38) int local38 = arg5 + local28;
						if (local34 >= 0 && local34 < this.anInt7296 && local38 >= 0 && this.anInt7290 > local38) {
							local22.method4836(local34, local38);
						}
					}
				}
			}
		}
		local16 = arg3 + arg0;
		@Pc(86) int local86 = arg5 + arg1;
		for (local24 = 0; local24 < this.anInt7302; local24++) {
			for (local28 = 0; local28 < 64; local28++) {
				for (local34 = 0; local34 < 64; local34++) {
					this.method5637(arg5 + local34, local86 - -local34, local28 + arg3, local28 + local16, 0, false, local24, 0, 0, arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "([[[IB[Lclient!sd;Lclient!ya;)V")
	public final void method5635(@OriginalArg(0) int[][][] arg0, @OriginalArg(2) Class213[] arg1, @OriginalArg(3) Class19 arg2) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (!this.aBoolean687) {
			for (local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt7296; local10++) {
					for (local14 = 0; local14 < this.anInt7290; local14++) {
						if ((Static79.aByteArrayArrayArray2[local6][local10][local14] & 0x1) != 0) {
							@Pc(28) int local28 = local6;
							if ((Static79.aByteArrayArrayArray2[1][local10][local14] & 0x2) != 0) {
								local28 = local6 - 1;
							}
							if (local28 >= 0) {
								arg1[local28].method4850(local14, local10);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt7302; local6++) {
			local10 = 0;
			local14 = 0;
			if (!this.aBoolean687) {
				if (Static321.aBoolean498) {
					local14 = 8;
				}
				if (Static242.aBoolean418) {
					local10 = 2;
				}
				if (Static63.anInt1262 != 0) {
					if (local6 == 0 | Static41.aBoolean75) {
						local14 |= 0x10;
					}
					local10 |= 0x1;
				}
			}
			if (Static242.aBoolean418) {
				local14 |= 0x7;
			}
			if (!Static436.aBoolean667) {
				local14 |= 0x20;
			}
			@Pc(149) int[][] local149 = arg0 == null || local6 >= arg0.length ? this.anIntArrayArrayArray15[local6] : arg0[local6];
			Static263.method3808(local6, arg2.method4297(this.anInt7296, this.anInt7290, this.anIntArrayArrayArray15[local6], local149, local10, local14));
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILclient!ta;Lclient!ta;Lclient!ya;)V")
	public final void method5636(@OriginalArg(1) Class65 arg0, @OriginalArg(2) Class65 arg1, @OriginalArg(3) Class19 arg2) {
		if (Static178.anIntArray223 == null || Static178.anIntArray223.length != this.anInt7290) {
			Static252.anIntArray310 = new int[this.anInt7290];
			Static177.anIntArray188 = new int[this.anInt7290];
			Static443.anIntArray548 = new int[this.anInt7290];
			Static255.anIntArray312 = new int[this.anInt7290];
			Static178.anIntArray223 = new int[this.anInt7290];
		}
		@Pc(38) int[][] local38 = new int[this.anInt7296][this.anInt7290];
		@Pc(44) int local44;
		for (@Pc(40) int local40 = 0; local40 < this.anInt7302; local40++) {
			for (local44 = 0; local44 < this.anInt7290; local44++) {
				Static178.anIntArray223[local44] = 0;
				Static252.anIntArray310[local44] = 0;
				Static177.anIntArray188[local44] = 0;
				Static255.anIntArray312[local44] = 0;
				Static443.anIntArray548[local44] = 0;
			}
			for (@Pc(77) int local77 = -5; local77 < this.anInt7296; local77++) {
				@Pc(87) int local87;
				@Pc(102) int local102;
				@Pc(168) int local168;
				for (@Pc(81) int local81 = 0; local81 < this.anInt7290; local81++) {
					local87 = local77 + 5;
					@Pc(148) int local148;
					if (this.anInt7296 > local87) {
						local102 = this.aByteArrayArrayArray16[local40][local87][local81] & 0xFF;
						if (local102 > 0) {
							@Pc(112) Class221 local112 = this.aClass192_5.method4340(local102 - 1);
							Static178.anIntArray223[local81] += local112.anInt6348;
							Static252.anIntArray310[local81] += local112.anInt6341;
							Static177.anIntArray188[local81] += local112.anInt6343;
							Static255.anIntArray312[local81] += local112.anInt6342;
							local148 = Static443.anIntArray548[local81]++;
						}
					}
					local102 = local77 - 5;
					if (local102 >= 0) {
						local168 = this.aByteArrayArrayArray16[local40][local102][local81] & 0xFF;
						if (local168 > 0) {
							@Pc(183) Class221 local183 = this.aClass192_5.method4340(local168 - 1);
							Static178.anIntArray223[local81] -= local183.anInt6348;
							Static252.anIntArray310[local81] -= local183.anInt6341;
							Static177.anIntArray188[local81] -= local183.anInt6343;
							Static255.anIntArray312[local81] -= local183.anInt6342;
							local148 = Static443.anIntArray548[local81]--;
						}
					}
				}
				if (local77 >= 0) {
					local87 = 0;
					local102 = 0;
					local168 = 0;
					@Pc(244) int local244 = 0;
					@Pc(246) int local246 = 0;
					for (@Pc(248) int local248 = -5; local248 < this.anInt7290; local248++) {
						@Pc(254) int local254 = local248 + 5;
						if (local254 < this.anInt7290) {
							local102 += Static252.anIntArray310[local254];
							local246 += Static443.anIntArray548[local254];
							local87 += Static178.anIntArray223[local254];
							local244 += Static255.anIntArray312[local254];
							local168 += Static177.anIntArray188[local254];
						}
						@Pc(296) int local296 = local248 - 5;
						if (local296 >= 0) {
							local244 -= Static255.anIntArray312[local296];
							local87 -= Static178.anIntArray223[local296];
							local246 -= Static443.anIntArray548[local296];
							local102 -= Static252.anIntArray310[local296];
							local168 -= Static177.anIntArray188[local296];
						}
						if (local248 >= 0 && local244 > 0 && local246 > 0) {
							local38[local77][local248] = Static89.method1599(local102 / local246, local87 * 256 / local244, local168 / local246);
						}
					}
				}
			}
			if (Static54.aBoolean93) {
				this.method5639(local40, local40 == 0 ? arg0 : null, local38, arg2, Static417.aClass65Array4[local40], local40 == 0 ? arg1 : null);
			} else {
				this.method5638(arg2, local40 == 0 ? arg1 : null, local40 == 0 ? arg0 : null, local38, local40, Static417.aClass65Array4[local40]);
			}
			this.aByteArrayArrayArray16[local40] = null;
			this.aByteArrayArrayArray15[local40] = null;
			this.aByteArrayArrayArray13[local40] = null;
			this.aByteArrayArrayArray17[local40] = null;
		}
		if (!this.aBoolean687) {
			if (Static63.anInt1262 != 0) {
				Static280.method3958();
			}
			if (Static242.aBoolean418) {
				Static198.method3118();
			}
		}
		for (local44 = 0; local44 < this.anInt7302; local44++) {
			Static417.aClass65Array4[local44].ca();
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIZIIIILclient!iv;)V")
	private void method5637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) Class4_Sub12 arg9) {
		if (arg4 == 1) {
			arg7 = 1;
		} else if (arg4 == 2) {
			arg8 = 1;
			arg7 = 1;
		} else if (arg4 == 3) {
			arg8 = 1;
		}
		@Pc(60) int local60;
		if (arg2 < 0 || arg2 >= this.anInt7296 || arg0 < 0 || arg0 >= this.anInt7290) {
			while (true) {
				local60 = arg9.method2490();
				if (local60 == 0) {
					return;
				}
				if (local60 == 1) {
					arg9.method2490();
					return;
				}
				if (local60 <= 49) {
					arg9.method2490();
				}
			}
			return;
		}
		if (!this.aBoolean687 && !arg5) {
			Static79.aByteArrayArrayArray2[arg6][arg2][arg0] = 0;
		}
		while (true) {
			local60 = arg9.method2490();
			if (local60 == 0) {
				if (this.aBoolean687) {
					this.anIntArrayArrayArray15[0][arg2 + arg8][arg0 + arg7] = 0;
					return;
				} else if (arg6 == 0) {
					this.anIntArrayArrayArray15[0][arg8 + arg2][arg0 + arg7] = -Static194.method3056(arg3 + 932731, arg1 + 556238) * 8 << 0;
					return;
				} else {
					this.anIntArrayArrayArray15[arg6][arg2 + arg8][arg7 + arg0] = this.anIntArrayArrayArray15[arg6 - 1][arg8 + arg2][arg7 + arg0] - 240;
					return;
				}
			}
			if (local60 == 1) {
				@Pc(196) int local196 = arg9.method2490();
				if (!this.aBoolean687) {
					if (local196 == 1) {
						local196 = 0;
					}
					if (arg6 != 0) {
						this.anIntArrayArrayArray15[arg6][arg8 + arg2][arg0 + arg7] = this.anIntArrayArrayArray15[arg6 - 1][arg8 + arg2][arg0 + arg7] - (local196 * 8 << 0);
						return;
					}
					this.anIntArrayArrayArray15[0][arg2 + arg8][arg0 + arg7] = -local196 * 8 << 0;
					return;
				}
				this.anIntArrayArrayArray15[0][arg8 + arg2][arg0 + arg7] = local196 * 8 << 0;
				return;
			}
			if (local60 <= 49) {
				if (arg5) {
					arg9.method2490();
				} else {
					this.aByteArrayArrayArray15[arg6][arg2][arg0] = arg9.method2542();
					this.aByteArrayArrayArray13[arg6][arg2][arg0] = (byte) ((local60 - 2) / 4);
					this.aByteArrayArrayArray17[arg6][arg2][arg0] = (byte) (arg4 + local60 - 2 & 0x3);
				}
			} else if (local60 <= 81) {
				if (!this.aBoolean687 && !arg5) {
					Static79.aByteArrayArrayArray2[arg6][arg2][arg0] = (byte) (local60 - 49);
				}
			} else if (!arg5) {
				this.aByteArrayArrayArray16[arg6][arg2][arg0] = (byte) (local60 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!ya;Lclient!ta;Lclient!ta;[[IIILclient!ta;)V")
	private void method5638(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) Class65 arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class65 arg5) {
		for (@Pc(12) int local12 = 0; local12 < this.anInt7296; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt7290; local16++) {
				if (Static259.anInt4877 == -1 || Static310.method4164(local12, Static259.anInt4877, arg4, local16)) {
					@Pc(40) byte local40 = this.aByteArrayArrayArray13[arg4][local12][local16];
					@Pc(49) byte local49 = this.aByteArrayArrayArray17[arg4][local12][local16];
					@Pc(60) int local60 = this.aByteArrayArrayArray15[arg4][local12][local16] & 0xFF;
					@Pc(71) int local71 = this.aByteArrayArrayArray16[arg4][local12][local16] & 0xFF;
					@Pc(86) Class113 local86 = local60 == 0 ? null : this.aClass124_7.method3150(local60 - 1);
					@Pc(100) Class221 local100 = local71 == 0 ? null : this.aClass192_5.method4340(local71 - 1);
					@Pc(102) int local102 = 0;
					@Pc(104) int local104 = 0;
					if (local40 != 0) {
						local104 = local86 == null ? 0 : Static104.anIntArray160[local40];
						local102 = local100 == null ? 0 : Static224.anIntArray289[local40];
					} else if (local86 != null) {
						local104 = Static104.anIntArray160[local40];
					} else if (local100 != null) {
						local102 = Static104.anIntArray160[local40];
					}
					@Pc(145) int local145 = local102 + local104;
					@Pc(147) int local147 = 0;
					if (local145 != 0) {
						@Pc(152) int[] local152 = new int[local145];
						@Pc(155) int[] local155 = new int[local145];
						@Pc(158) int[] local158 = new int[local145];
						@Pc(161) int[] local161 = new int[local145];
						@Pc(163) boolean local163 = false;
						@Pc(182) int local182;
						@Pc(214) int local214;
						if (local86 == null || local86.anInt3381 == -1 && local86.anInt3372 == -1 && local86.anInt3378 == -1) {
							for (local182 = 0; local182 < local104; local182++) {
								local152[local147] = -1;
								local147++;
							}
						} else {
							local182 = arg0.method4243() ? local86.anInt3378 : local86.anInt3375;
							if (Static147.aBoolean263) {
								local182 = -1;
							}
							for (local214 = 0; local214 < local104; local214++) {
								local158[local147] = local182;
								local161[local147] = local86.anInt3374;
								if (local86.anInt3381 == -1) {
									local152[local147] = -1;
								} else {
									local152[local147] = local86.anInt3381;
								}
								if (local86.anInt3372 == -1) {
									local155[local147] = -1;
								} else {
									local155[local147] = local86.anInt3372;
									local163 = true;
								}
								local147++;
							}
							if (!this.aBoolean687 && arg4 == 0) {
								Static73.method1358(local12, local16, local86.anInt3376, local86.anInt3383 * 8, local86.anInt3384);
							}
						}
						if (!local163) {
							local155 = null;
						}
						if (local100 == null) {
							for (local182 = 0; local182 < local102; local182++) {
								local152[local147] = -1;
								local147++;
							}
						} else {
							local182 = local100.anInt6345;
							if (Static147.aBoolean263) {
								local182 = -1;
							}
							for (local214 = 0; local214 < local102; local214++) {
								local158[local147] = local182;
								local161[local147] = local100.anInt6353;
								local152[local147] = arg3[local12][local16];
								if (local155 != null) {
									local155[local147] = -1;
								}
								local147++;
							}
						}
						local182 = this.anIntArray555.length;
						@Pc(354) int[] local354 = new int[local182];
						@Pc(357) int[] local357 = new int[local182];
						@Pc(364) int[] local364 = arg2 == null ? null : new int[local182];
						@Pc(373) int[] local373 = arg2 == null && arg1 == null ? null : new int[local182];
						@Pc(382) int local382;
						@Pc(387) int local387;
						@Pc(472) int local472;
						@Pc(478) int local478;
						for (@Pc(375) int local375 = 0; local375 < local182; local375++) {
							local382 = this.anIntArray555[local375];
							local387 = this.anIntArray556[local375];
							if (local49 == 0) {
								local354[local375] = local382;
								local357[local375] = local387;
							} else if (local49 == 1) {
								local354[local375] = local387;
								local357[local375] = 128 - local382;
							} else if (local49 == 2) {
								local354[local375] = 128 - local382;
								local357[local375] = 128 - local387;
							} else if (local49 == 3) {
								local354[local375] = 128 - local387;
								local357[local375] = local382;
							}
							if (local364 != null && Static192.aBooleanArrayArray3[local40][local375]) {
								local472 = (local12 << 7) + local382;
								local478 = local382 + (local16 << 7);
								local364[local375] = arg2.a(local472, local478) - arg5.a(local472, local478);
							}
							if (local373 != null) {
								if (arg2 != null && !Static192.aBooleanArrayArray3[local40][local375]) {
									local472 = local382 + (local12 << 7);
									local478 = (local16 << 7) + local382;
									local373[local375] = arg5.a(local472, local478) - arg2.a(local472, local478);
								} else if (arg1 != null && !Static379.aBooleanArrayArray5[local40][local375]) {
									local472 = (local12 << 7) + local382;
									local478 = local382 + (local16 << 7);
									local373[local375] = arg1.a(local472, local478) - arg5.a(local472, local478);
								}
							}
						}
						local382 = arg5.l(local12, local16);
						local387 = arg5.l(local12 + 1, local16);
						local472 = arg5.l(local12 + 1, local16 + 1);
						local478 = arg5.l(local12, local16 + 1);
						if (arg4 > 0) {
							@Pc(600) boolean local600 = true;
							if (local71 == 0 && local40 != 0) {
								local600 = false;
							}
							if (local60 > 0 && local86 != null && !local86.aBoolean285) {
								local600 = false;
							}
							if (local600 && local387 == local382 && local382 == local472 && local478 == local382) {
								this.aByteArrayArrayArray12[arg4][local12][local16] = (byte) (this.aByteArrayArrayArray12[arg4][local12][local16] | 0x4);
							}
						}
						@Pc(654) int local654 = 0;
						@Pc(656) int local656 = 0;
						@Pc(658) int local658 = 0;
						if (this.aBoolean687) {
							local654 = Static335.method4753(local12, local16);
							local656 = Static243.method3563(local12, local16);
							local658 = Static192.method3012(local12, local16);
						}
						arg5.method4023(local12, local16, local354, local364, local357, local373, Static369.anIntArrayArray58[local40], Static108.anIntArrayArray23[local40], Static447.anIntArrayArray65[local40], local152, local155, local158, local161, local654, local656, local658);
						Static172.method2809(arg4, local12, local16);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILclient!ta;[[ILclient!ya;BLclient!ta;Lclient!ta;)V")
	private void method5639(@OriginalArg(0) int arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(5) Class65 arg4, @OriginalArg(6) Class65 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray13[arg0];
		@Pc(24) byte[][] local24 = this.aByteArrayArrayArray17[arg0];
		@Pc(29) byte[][] local29 = this.aByteArrayArrayArray16[arg0];
		@Pc(34) byte[][] local34 = this.aByteArrayArrayArray15[arg0];
		for (@Pc(36) int local36 = 0; local36 < this.anInt7296; local36++) {
			@Pc(54) int local54 = this.anInt7296 - 1 > local36 ? local36 + 1 : local36;
			for (@Pc(56) int local56 = 0; local56 < this.anInt7290; local56++) {
				@Pc(70) int local70 = local56 >= this.anInt7290 - 1 ? local56 : local56 + 1;
				if (Static259.anInt4877 == -1 || Static310.method4164(local36, Static259.anInt4877, arg0, local56)) {
					@Pc(84) boolean local84 = false;
					@Pc(86) boolean local86 = false;
					@Pc(89) boolean[] local89 = new boolean[4];
					@Pc(95) int local95 = local10[local36][local56];
					@Pc(101) int local101 = local24[local36][local56];
					@Pc(109) int local109 = local34[local36][local56] & 0xFF;
					@Pc(117) int local117 = local29[local36][local56] & 0xFF;
					@Pc(125) int local125 = local29[local36][local70] & 0xFF;
					@Pc(133) int local133 = local29[local54][local70] & 0xFF;
					@Pc(141) int local141 = local29[local54][local56] & 0xFF;
					if (local109 != 0 || local117 != 0) {
						@Pc(160) Class113 local160 = local109 == 0 ? null : this.aClass124_7.method3150(local109 - 1);
						@Pc(172) Class221 local172 = local117 == 0 ? null : this.aClass192_5.method4340(local117 - 1);
						if (local95 == 0 && local160 == null) {
							local95 = 12;
						}
						@Pc(180) Class113 local180 = local160;
						if (local160 != null) {
							if (local160.anInt3381 == -1 && local160.anInt3372 == -1) {
								local180 = local160;
								local160 = null;
							} else if (local172 != null && local95 != 0) {
								local86 = local160.aBoolean283;
							}
						}
						@Pc(284) int local284;
						@Pc(301) int local301;
						@Pc(374) int local374;
						@Pc(384) int local384;
						if ((local95 == 0 || local95 == 12) && local36 > 0 && local56 > 0 && this.anInt7296 > local36 && this.anInt7290 > local56) {
							@Pc(248) int local248 = local117 == local29[local54][local70] ? 1 : -1;
							@Pc(263) int local263 = local117 == local29[local54][local56 - 1] ? 1 : -1;
							local284 = local117 == local29[local36 - 1][local56 - 1] ? 1 : -1;
							local301 = local117 == local29[local36 - 1][local70] ? 1 : -1;
							if (local117 == local29[local36][local56 - 1]) {
								local263++;
								local284++;
							} else {
								local284--;
								local263--;
							}
							if (local117 == local29[local54][local56]) {
								local263++;
								local248++;
							} else {
								local263--;
								local248--;
							}
							if (local117 == local29[local36][local70]) {
								local301++;
								local248++;
							} else {
								local301--;
								local248--;
							}
							if (local29[local36 - 1][local56] == local117) {
								local284++;
								local301++;
							} else {
								local301--;
								local284--;
							}
							local374 = local284 - local248;
							if (local374 < 0) {
								local374 = -local374;
							}
							local384 = local263 - local301;
							if (local384 < 0) {
								local384 = -local384;
							}
							if (local374 == local384) {
								local374 = arg4.l(local36, local56) - arg4.l(local54, local70);
								if (local374 < 0) {
									local374 = -local374;
								}
								local384 = arg4.l(local54, local56) - arg4.l(local36, local70);
								if (local384 < 0) {
									local384 = -local384;
								}
							}
							local101 = local384 > local374 ? 1 : 0;
						}
						for (local284 = 0; local284 < 13; local284++) {
							Static154.anIntArray49[local284] = -1;
							Static299.anIntArray354[local284] = 1;
						}
						@Pc(465) boolean[] local465 = local160 != null && local160.aBoolean283 ? Static1.aBooleanArrayArray1[local95] : Static169.aBooleanArrayArray2[local95];
						this.method5642(this.anInt7290, local34, local95, local56, local101, local89, this.anInt7296, local36, local160, local10, local172, local24, arg3);
						@Pc(498) boolean local498 = local160 != null && local160.anInt3381 != local160.anInt3372;
						if (!local498) {
							for (local301 = 0; local301 < 8; local301++) {
								if (Static154.anIntArray49[local301] >= 0 && Static115.anIntArray164[local301] != Static326.anIntArray395[local301]) {
									local498 = true;
									break;
								}
							}
						}
						if (!local465[local101 + 1 & 0x3]) {
							local89[1] = Static211.method3201(local89[1], (Static299.anIntArray354[2] & Static299.anIntArray354[4]) == 0);
						}
						if (!local465[local101 + 3 & 0x3]) {
							local89[3] = Static211.method3201(local89[3], (Static299.anIntArray354[6] & Static299.anIntArray354[0]) == 0);
						}
						if (!local465[local101 & 0x3]) {
							local89[0] = Static211.method3201(local89[0], (Static299.anIntArray354[0] & Static299.anIntArray354[2]) == 0);
						}
						if (!local465[local101 + 2 & 0x3]) {
							local89[2] = Static211.method3201(local89[2], (Static299.anIntArray354[4] & Static299.anIntArray354[6]) == 0);
						}
						if (!local86 && (local95 == 0 || local95 == 12)) {
							if (local89[0] && !local89[1] && !local89[2] && local89[3]) {
								local89[0] = local89[3] = false;
								local95 = local95 == 0 ? 13 : 14;
								local101 = 0;
							} else if (local89[0] && local89[1] && !local89[2] && !local89[3]) {
								local101 = 3;
								local89[0] = local89[1] = false;
								local95 = local95 == 0 ? 13 : 14;
							} else if (!local89[0] && local89[1] && local89[2] && !local89[3]) {
								local101 = 2;
								local95 = local95 == 0 ? 13 : 14;
								local89[1] = local89[2] = false;
							} else if (!local89[0] && !local89[1] && local89[2] && local89[3]) {
								local101 = 1;
								local95 = local95 == 0 ? 13 : 14;
								local89[2] = local89[3] = false;
							}
						}
						@Pc(807) boolean local807 = !local86 && !local89[0] && !local89[2] && !local89[1] && !local89[3];
						@Pc(809) int[] local809 = null;
						@Pc(821) int[] local821;
						@Pc(829) int[] local829;
						@Pc(825) int[] local825;
						if (local807) {
							local374 = local172 == null ? 0 : Static224.anIntArray289[local95];
							local821 = Static369.anIntArrayArray58[local95];
							local829 = Static108.anIntArrayArray23[local95];
							local384 = local160 == null ? 0 : Static104.anIntArray160[local95];
							local825 = Static447.anIntArrayArray65[local95];
						} else if (local86) {
							local384 = local160 == null ? 0 : Static104.anIntArray159[local95];
							local821 = Static76.anIntArrayArray18[local95];
							local829 = Static164.anIntArrayArray37[local95];
							local825 = Static192.anIntArrayArray35[local95];
							local374 = local172 == null ? 0 : Static93.anIntArray152[local95];
							local809 = Static260.anIntArrayArray41[local95];
						} else {
							local809 = Static191.anIntArrayArray25[local95];
							local821 = Static440.anIntArrayArray61[local95];
							local825 = Static452.anIntArrayArray66[local95];
							local829 = Static363.anIntArrayArray49[local95];
							local384 = local160 == null ? 0 : Static4.anIntArray415[local95];
							local374 = local172 == null ? 0 : Static280.anIntArray340[local95];
						}
						@Pc(911) int local911 = local384 + local374;
						if (local911 <= 0) {
							Static172.method2809(arg0, local36, local56);
						} else {
							if (local89[0]) {
								local911++;
							}
							if (local89[2]) {
								local911++;
							}
							if (local89[1]) {
								local911++;
							}
							if (local89[3]) {
								local911++;
							}
							@Pc(941) int local941 = 0;
							@Pc(943) int local943 = 0;
							@Pc(947) int local947 = local911 * 3;
							@Pc(954) int[] local954 = local498 ? new int[local947] : null;
							@Pc(957) int[] local957 = new int[local947];
							@Pc(960) int[] local960 = new int[local947];
							@Pc(963) int[] local963 = new int[local947];
							@Pc(966) int[] local966 = new int[local947];
							@Pc(969) int[] local969 = new int[local947];
							@Pc(976) int[] local976 = arg1 == null ? null : new int[local947];
							@Pc(985) int[] local985 = arg1 == null && arg5 == null ? null : new int[local947];
							@Pc(987) int local987 = -1;
							@Pc(989) int local989 = -1;
							@Pc(991) int local991 = 256;
							@Pc(1059) byte local1059;
							@Pc(1013) int local1013;
							@Pc(1015) int local1015;
							@Pc(1246) int local1246;
							@Pc(1252) int local1252;
							@Pc(1261) int local1261;
							@Pc(1266) int local1266;
							@Pc(1289) int local1289;
							@Pc(1271) int local1271;
							@Pc(1291) int local1291;
							@Pc(1341) int local1341;
							@Pc(1347) int local1347;
							if (local160 != null) {
								local987 = local160.anInt3381;
								local989 = arg3.method4243() ? local160.anInt3378 : local160.anInt3375;
								local991 = local160.anInt3374;
								local1013 = Static200.method3169(local160, arg3);
								for (local1015 = 0; local1015 < local384; local1015++) {
									if (local89[-local101 & 0x3] && local941 == local809[0]) {
										Static350.anIntArray420[0] = local821[local941];
										Static350.anIntArray420[1] = 1;
										Static350.anIntArray420[2] = local825[local941];
										Static350.anIntArray420[3] = 1;
										Static350.anIntArray420[4] = local829[local941];
										local1059 = 6;
										Static350.anIntArray420[5] = local825[local941];
									} else if (local89[2 - local101 & 0x3] && local809[2] == local941) {
										Static350.anIntArray420[0] = local821[local941];
										Static350.anIntArray420[1] = 5;
										Static350.anIntArray420[2] = local825[local941];
										Static350.anIntArray420[3] = 5;
										Static350.anIntArray420[4] = local829[local941];
										Static350.anIntArray420[5] = local825[local941];
										local1059 = 6;
									} else if (local89[1 - local101 & 0x3] && local941 == local809[1]) {
										Static350.anIntArray420[0] = local821[local941];
										Static350.anIntArray420[1] = 3;
										Static350.anIntArray420[2] = local825[local941];
										Static350.anIntArray420[3] = 3;
										Static350.anIntArray420[4] = local829[local941];
										local1059 = 6;
										Static350.anIntArray420[5] = local825[local941];
									} else if (local89[3 - local101 & 0x3] && local809[3] == local941) {
										Static350.anIntArray420[0] = local821[local941];
										Static350.anIntArray420[1] = 7;
										Static350.anIntArray420[2] = local825[local941];
										Static350.anIntArray420[3] = 7;
										Static350.anIntArray420[4] = local829[local941];
										Static350.anIntArray420[5] = local825[local941];
										local1059 = 6;
									} else {
										Static350.anIntArray420[0] = local821[local941];
										Static350.anIntArray420[1] = local829[local941];
										Static350.anIntArray420[2] = local825[local941];
										local1059 = 3;
									}
									for (local1246 = 0; local1246 < local1059; local1246++) {
										local1252 = Static350.anIntArray420[local1246];
										local1261 = local1252 - local101 * 2 & 0x7;
										local1266 = this.anIntArray555[local1252];
										local1271 = this.anIntArray556[local1252];
										if (local101 == 1) {
											local1289 = local1271;
											local1291 = 128 - local1266;
										} else if (local101 == 2) {
											local1291 = 128 - local1271;
											local1289 = 128 - local1266;
										} else if (local101 == 3) {
											local1289 = 128 - local1271;
											local1291 = local1266;
										} else {
											local1289 = local1266;
											local1291 = local1271;
										}
										local957[local943] = local1289;
										local960[local943] = local1291;
										if (local976 != null && Static192.aBooleanArrayArray3[local95][local1252]) {
											local1341 = (local36 << 7) + local1289;
											local1347 = local1291 + (local56 << 7);
											local976[local943] = arg1.a(local1341, local1347) - arg4.a(local1341, local1347);
										}
										if (local985 != null) {
											if (arg1 != null && !Static192.aBooleanArrayArray3[local95][local1252]) {
												local1341 = local1289 + (local36 << 7);
												local1347 = local1291 + (local56 << 7);
												local985[local943] = arg4.a(local1341, local1347) - arg1.a(local1341, local1347);
											} else if (arg5 != null && !Static379.aBooleanArrayArray5[local95][local1252]) {
												local1341 = local1289 + (local36 << 7);
												local1347 = (local56 << 7) + local1291;
												local985[local943] = arg5.a(local1341, local1347) - arg4.a(local1341, local1347);
											}
										}
										if (local1252 < 8 && Static154.anIntArray49[local1261] > local160.anInt3373) {
											if (local954 != null) {
												local954[local943] = Static115.anIntArray164[local1261];
											}
											local969[local943] = Static210.anIntArray261[local1261];
											local966[local943] = Static192.anIntArray240[local1261];
											local963[local943] = Static326.anIntArray395[local1261];
										} else {
											if (local954 != null) {
												local954[local943] = local1013;
											}
											local966[local943] = arg3.method4243() ? local160.anInt3378 : local160.anInt3375;
											local969[local943] = local160.anInt3374;
											local963[local943] = local987;
										}
										local943++;
									}
									local941++;
								}
								if (!this.aBoolean687 && arg0 == 0) {
									Static73.method1358(local36, local56, local160.anInt3376, local160.anInt3383 * 8, local160.anInt3384);
								}
								if (local95 != 12 && local160.anInt3381 != -1 && local160.aBoolean284) {
									local84 = true;
								}
							} else if (local807) {
								local941 = Static104.anIntArray160[local95];
							} else if (local86) {
								local941 = Static104.anIntArray159[local95];
							} else {
								local941 = Static4.anIntArray415[local95];
							}
							if (local172 != null) {
								if (local141 == 0) {
									local141 = local117;
								}
								if (local133 == 0) {
									local133 = local117;
								}
								if (local125 == 0) {
									local125 = local117;
								}
								@Pc(1596) Class221 local1596 = this.aClass192_5.method4340(local117 - 1);
								@Pc(1604) Class221 local1604 = this.aClass192_5.method4340(local125 - 1);
								@Pc(1612) Class221 local1612 = this.aClass192_5.method4340(local133 - 1);
								@Pc(1620) Class221 local1620 = this.aClass192_5.method4340(local141 - 1);
								for (local1261 = 0; local1261 < local374; local1261++) {
									if (local89[-local101 & 0x3] && local941 == local809[0]) {
										Static350.anIntArray420[0] = local821[local941];
										Static350.anIntArray420[1] = 1;
										Static350.anIntArray420[2] = local825[local941];
										Static350.anIntArray420[3] = 1;
										Static350.anIntArray420[4] = local829[local941];
										Static350.anIntArray420[5] = local825[local941];
										local1059 = 6;
									} else if (local89[2 - local101 & 0x3] && local809[2] == local941) {
										Static350.anIntArray420[0] = local821[local941];
										Static350.anIntArray420[1] = 5;
										Static350.anIntArray420[2] = local825[local941];
										Static350.anIntArray420[3] = 5;
										Static350.anIntArray420[4] = local829[local941];
										local1059 = 6;
										Static350.anIntArray420[5] = local825[local941];
									} else if (local89[1 - local101 & 0x3] && local941 == local809[1]) {
										Static350.anIntArray420[0] = local821[local941];
										Static350.anIntArray420[1] = 3;
										Static350.anIntArray420[2] = local825[local941];
										Static350.anIntArray420[3] = 3;
										Static350.anIntArray420[4] = local829[local941];
										Static350.anIntArray420[5] = local825[local941];
										local1059 = 6;
									} else if (local89[3 - local101 & 0x3] && local941 == local809[3]) {
										Static350.anIntArray420[0] = local821[local941];
										Static350.anIntArray420[1] = 7;
										Static350.anIntArray420[2] = local825[local941];
										Static350.anIntArray420[3] = 7;
										Static350.anIntArray420[4] = local829[local941];
										local1059 = 6;
										Static350.anIntArray420[5] = local825[local941];
									} else {
										Static350.anIntArray420[0] = local821[local941];
										Static350.anIntArray420[1] = local829[local941];
										local1059 = 3;
										Static350.anIntArray420[2] = local825[local941];
									}
									for (local1266 = 0; local1266 < local1059; local1266++) {
										local1289 = Static350.anIntArray420[local1266];
										local1271 = local1289 - local101 * 2 & 0x7;
										local1291 = this.anIntArray555[local1289];
										local1347 = this.anIntArray556[local1289];
										@Pc(1889) int local1889;
										if (local101 == 1) {
											local1341 = local1347;
											local1889 = 128 - local1291;
										} else if (local101 == 2) {
											local1889 = 128 - local1347;
											local1341 = 128 - local1291;
										} else if (local101 == 3) {
											local1889 = local1291;
											local1341 = 128 - local1347;
										} else {
											local1341 = local1291;
											local1889 = local1347;
										}
										local957[local943] = local1341;
										local960[local943] = local1889;
										@Pc(1942) int local1942;
										@Pc(1948) int local1948;
										if (local976 != null && Static192.aBooleanArrayArray3[local95][local1289]) {
											local1942 = local1341 + (local36 << 7);
											local1948 = local1889 + (local56 << 7);
											local976[local943] = arg1.a(local1942, local1948) - arg4.a(local1942, local1948);
										}
										if (local985 != null) {
											if (arg1 != null && !Static192.aBooleanArrayArray3[local95][local1289]) {
												local1942 = local1341 + (local36 << 7);
												local1948 = (local56 << 7) + local1889;
												local985[local943] = arg4.a(local1942, local1948) - arg1.a(local1942, local1948);
											} else if (arg5 != null && !Static379.aBooleanArrayArray5[local95][local1289]) {
												local1942 = (local36 << 7) + local1341;
												local1948 = (local56 << 7) + local1889;
												local985[local943] = arg5.a(local1942, local1948) - arg4.a(local1942, local1948);
											}
										}
										if (local1289 < 8 && Static154.anIntArray49[local1271] >= 0) {
											if (local954 != null) {
												local954[local943] = Static115.anIntArray164[local1271];
											}
											local969[local943] = Static210.anIntArray261[local1271];
											local966[local943] = Static192.anIntArray240[local1271];
											local963[local943] = Static326.anIntArray395[local1271];
										} else {
											if (local86 && Static192.aBooleanArrayArray3[local95][local1289]) {
												local966[local943] = local989;
												local969[local943] = local991;
												local963[local943] = local987;
											} else if (local1341 == 0 && local1889 == 0) {
												local963[local943] = arg2[local36][local56];
												local966[local943] = local1596.anInt6345;
												local969[local943] = local1596.anInt6353;
											} else if (local1341 == 0 && local1889 == 128) {
												local963[local943] = arg2[local36][local70];
												local966[local943] = local1604.anInt6345;
												local969[local943] = local1604.anInt6353;
											} else if (local1341 == 128 && local1889 == 128) {
												local963[local943] = arg2[local54][local70];
												local966[local943] = local1612.anInt6345;
												local969[local943] = local1612.anInt6353;
											} else if (local1341 == 128 && local1889 == 0) {
												local963[local943] = arg2[local54][local56];
												local966[local943] = local1620.anInt6345;
												local969[local943] = local1620.anInt6353;
											} else {
												if (local1341 < 64) {
													if (local1889 >= 64) {
														local966[local943] = local1604.anInt6345;
														local969[local943] = local1604.anInt6353;
													} else {
														local966[local943] = local1596.anInt6345;
														local969[local943] = local1596.anInt6353;
													}
												} else if (local1889 < 64) {
													local966[local943] = local1620.anInt6345;
													local969[local943] = local1620.anInt6353;
												} else {
													local966[local943] = local1612.anInt6345;
													local969[local943] = local1612.anInt6353;
												}
												local1942 = Static74.method1361(local1341 << 7 >> 7, arg2[local36][local56], arg2[local54][local56]);
												local1948 = Static74.method1361(local1341 << 7 >> 7, arg2[local36][local70], arg2[local54][local70]);
												local963[local943] = Static74.method1361(local1889 << 7 >> 7, local1942, local1948);
											}
											if (local954 != null) {
												local954[local943] = local963[local943];
											}
										}
										local943++;
									}
									local941++;
								}
								if (local95 != 0 && local172.aBoolean579) {
									local84 = true;
								}
							}
							local1013 = arg4.l(local36, local56);
							local1015 = arg4.l(local54, local56);
							local1246 = arg4.l(local54, local70);
							local1252 = arg4.l(local36, local70);
							if (arg0 > 0) {
								@Pc(2368) boolean local2368 = true;
								if (local117 == 0 && local95 != 0) {
									local2368 = false;
								}
								if (local109 > 0 && local180 != null && !local180.aBoolean285) {
									local2368 = false;
								}
								if (local2368 && local1013 == local1015 && local1246 == local1013 && local1252 == local1013) {
									this.aByteArrayArrayArray12[arg0][local36][local56] = (byte) (this.aByteArrayArrayArray12[arg0][local36][local56] | 0x4);
								}
							}
							local1261 = 0;
							local1266 = 0;
							local1289 = 0;
							if (this.aBoolean687) {
								local1261 = Static335.method4753(local36, local56);
								local1266 = Static243.method3563(local36, local56);
								local1289 = Static192.method3012(local36, local56);
							}
							arg4.B(local36, local56, local957, local976, local960, local985, local963, local954, local966, local969, local1261, local1266, local1289, local84);
							Static172.method2809(arg0, local36, local56);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILclient!iv;I[Lclient!sd;BIIIII)V")
	public final void method5640(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub12 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class213[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg8 & 0x7) * 8;
		@Pc(20) int local20;
		@Pc(51) int local51;
		if (!this.aBoolean687) {
			@Pc(18) Class213 local18 = arg3[arg5];
			for (local20 = 0; local20 < 8; local20++) {
				for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
					@Pc(38) int local38 = arg7 + Static407.method5252(local24 & 0x7, arg0, local20 & 0x7);
					local51 = arg6 + Static251.method3636(arg0, local20 & 0x7, local24 & 0x7);
					if (local38 > 0 && local38 < this.anInt7296 - 1 && local51 > 0 && local51 < this.anInt7290 - 1) {
						local18.method4836(local38, local51);
					}
				}
			}
		}
		@Pc(89) int local89 = (arg4 & 0x7) * 8;
		@Pc(95) int local95 = (arg8 & 0xFFFFFFF8) << 3;
		local20 = (arg4 & 0x1FFFFFF8) << 3;
		@Pc(103) byte local103 = 0;
		@Pc(111) byte local111 = 0;
		if (arg0 == 1) {
			local111 = 1;
		} else if (arg0 == 2) {
			local103 = 1;
			local111 = 1;
		} else if (arg0 == 3) {
			local103 = 1;
		}
		for (local51 = 0; local51 < this.anInt7302; local51++) {
			for (@Pc(138) int local138 = 0; local138 < 64; local138++) {
				for (@Pc(142) int local142 = 0; local142 < 64; local142++) {
					if (local51 == arg2 && local138 >= local11 && local138 <= local11 + 8 && local142 >= local89 && local89 + 8 >= local142) {
						@Pc(223) int local223;
						@Pc(214) int local214;
						if (local11 + 8 == local138 || local142 == local89 + 8) {
							if (arg0 == 0) {
								local214 = local142 + arg6 - local89;
								local223 = arg7 + local138 - local11;
							} else if (arg0 == 1) {
								local223 = arg7 + local142 - local89;
								local214 = local11 + arg6 + 8 - local138;
							} else if (arg0 == 2) {
								local214 = arg6 + local89 + 8 - local142;
								local223 = arg7 + local11 + 8 - local138;
							} else {
								local214 = local138 + arg6 - local11;
								local223 = arg7 + local89 + 8 - local142;
							}
							this.method5637(local214, local20 + local142, local223, local138 + local95, 0, true, arg5, 0, 0, arg1);
						} else {
							local223 = arg7 + Static407.method5252(local142 & 0x7, arg0, local138 & 0x7);
							local214 = Static251.method3636(arg0, local138 & 0x7, local142 & 0x7) + arg6;
							this.method5637(local214, local20 + local142, local223, local138 + local95, arg0, false, arg5, local111, local103, arg1);
							if (local138 == 63 || local142 == 63) {
								@Pc(350) int local350 = local138 == 63 ? 64 : local138;
								@Pc(359) int local359 = local142 == 63 ? 64 : local142;
								@Pc(388) int local388;
								@Pc(379) int local379;
								if (arg0 == 0) {
									local388 = local350 + arg7 - local11;
									local379 = local359 + arg6 - local89;
								} else if (arg0 == 1) {
									local388 = local359 + arg7 - local89;
									local379 = local11 + arg6 + 8 - local350;
								} else if (arg0 == 2) {
									local388 = arg7 + local11 + 8 - local350;
									local379 = arg6 + local89 + 8 - local359;
								} else {
									local379 = local350 + arg6 - local11;
									local388 = arg7 + local89 + 8 - local359;
								}
								if (local388 >= 0 && this.anInt7296 > local388 && local379 >= 0 && local379 < this.anInt7290) {
									this.anIntArrayArrayArray15[arg5][local388][local379] = this.anIntArrayArrayArray15[arg5][local223 + local103][local214 + local111];
								}
							}
						}
					} else {
						this.method5637(-1, 0, -1, 0, 0, false, 0, 0, 0, arg1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(II[[BIII[ZIILclient!is;[[BLclient!sr;[[BLclient!ya;)V")
	private void method5642(@OriginalArg(0) int arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class113 arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) Class221 arg10, @OriginalArg(12) byte[][] arg11, @OriginalArg(13) Class19 arg12) {
		@Pc(53) int local53;
		if (arg8 != null && arg10 != null || arg10 != null && arg2 == 12 || arg8 != null && arg2 == 0) {
			@Pc(34) boolean[] local34 = arg8 != null && arg8.aBoolean283 ? Static1.aBooleanArrayArray1[arg2] : Static169.aBooleanArrayArray2[arg2];
			@Pc(68) Class113 local68;
			@Pc(85) byte local85;
			@Pc(101) int local101;
			@Pc(106) int local106;
			if (arg3 > 0) {
				if (arg7 > 0) {
					local53 = arg1[arg7 - 1][arg3 - 1] & 0xFF;
					if (local53 > 0) {
						local68 = this.aClass124_7.method3150(local53 - 1);
						if (local68.anInt3381 != -1 && local68.aBoolean283) {
							local85 = arg9[arg7 - 1][arg3 - 1];
							local101 = arg11[arg7 - 1][arg3 - 1] * 2 + 4 & 0x7;
							local106 = Static200.method3169(local68, arg12);
							if (Static192.aBooleanArrayArray3[local85][local101]) {
								Static326.anIntArray395[0] = local68.anInt3381;
								Static115.anIntArray164[0] = local106;
								Static192.anIntArray240[0] = arg12.method4243() ? local68.anInt3378 : local68.anInt3375;
								Static210.anIntArray261[0] = local68.anInt3374;
								Static154.anIntArray49[0] = local68.anInt3373;
								Static299.anIntArray354[0] = 256;
							}
						}
					}
				}
				if (arg6 - 1 > arg7) {
					local53 = arg1[arg7 + 1][arg3 - 1] & 0xFF;
					if (local53 > 0) {
						local68 = this.aClass124_7.method3150(local53 - 1);
						if (local68.anInt3381 != -1 && local68.aBoolean283) {
							local85 = arg9[arg7 + 1][arg3 - 1];
							local101 = arg11[arg7 + 1][arg3 - 1] * 2 + 6 & 0x7;
							local106 = Static200.method3169(local68, arg12);
							if (Static192.aBooleanArrayArray3[local85][local101]) {
								Static326.anIntArray395[2] = local68.anInt3381;
								Static115.anIntArray164[2] = local106;
								Static192.anIntArray240[2] = arg12.method4243() ? local68.anInt3378 : local68.anInt3375;
								Static210.anIntArray261[2] = local68.anInt3374;
								Static154.anIntArray49[2] = local68.anInt3373;
								Static299.anIntArray354[2] = 512;
							}
						}
					}
				}
			}
			if (arg3 < arg0 - 1) {
				if (arg7 > 0) {
					local53 = arg1[arg7 - 1][arg3 + 1] & 0xFF;
					if (local53 > 0) {
						local68 = this.aClass124_7.method3150(local53 - 1);
						if (local68.anInt3381 != -1 && local68.aBoolean283) {
							local85 = arg9[arg7 - 1][arg3 + 1];
							local101 = arg11[arg7 - 1][arg3 + 1] * 2 + 2 & 0x7;
							local106 = Static200.method3169(local68, arg12);
							if (Static192.aBooleanArrayArray3[local85][local101]) {
								Static326.anIntArray395[6] = local68.anInt3381;
								Static115.anIntArray164[6] = local106;
								Static192.anIntArray240[6] = arg12.method4243() ? local68.anInt3378 : local68.anInt3375;
								Static210.anIntArray261[6] = local68.anInt3374;
								Static154.anIntArray49[6] = local68.anInt3373;
								Static299.anIntArray354[6] = 64;
							}
						}
					}
				}
				if (arg7 < arg6 - 1) {
					local53 = arg1[arg7 + 1][arg3 + 1] & 0xFF;
					if (local53 > 0) {
						local68 = this.aClass124_7.method3150(local53 - 1);
						if (local68.anInt3381 != -1 && local68.aBoolean283) {
							local85 = arg9[arg7 + 1][arg3 + 1];
							local101 = arg11[arg7 + 1][arg3 + 1] * 2 & 0x7;
							local106 = Static200.method3169(local68, arg12);
							if (Static192.aBooleanArrayArray3[local85][local101]) {
								Static326.anIntArray395[4] = local68.anInt3381;
								Static115.anIntArray164[4] = local106;
								Static192.anIntArray240[4] = arg12.method4243() ? local68.anInt3378 : local68.anInt3375;
								Static210.anIntArray261[4] = local68.anInt3374;
								Static154.anIntArray49[4] = local68.anInt3373;
								Static299.anIntArray354[4] = 128;
							}
						}
					}
				}
			}
			@Pc(543) int local543;
			@Pc(548) int local548;
			@Pc(550) int local550;
			@Pc(531) byte local531;
			if (arg3 > 0) {
				local53 = arg1[arg7][arg3 - 1] & 0xFF;
				if (local53 > 0) {
					local68 = this.aClass124_7.method3150(local53 - 1);
					if (local68.anInt3381 != -1) {
						local85 = arg9[arg7][arg3 - 1];
						local531 = arg11[arg7][arg3 - 1];
						if (local68.aBoolean283) {
							local106 = 2;
							local543 = local531 * 2 + 4;
							local548 = Static200.method3169(local68, arg12);
							for (local550 = 0; local550 < 3; local550++) {
								local106 &= 0x7;
								local543 &= 0x7;
								if (Static192.aBooleanArrayArray3[local85][local543] && Static154.anIntArray49[local106] <= local68.anInt3373) {
									Static326.anIntArray395[local106] = local68.anInt3381;
									Static115.anIntArray164[local106] = local548;
									Static192.anIntArray240[local106] = arg12.method4243() ? local68.anInt3378 : local68.anInt3375;
									Static210.anIntArray261[local106] = local68.anInt3374;
									if (Static154.anIntArray49[local106] == local68.anInt3373) {
										Static299.anIntArray354[local106] |= 0x20;
									} else {
										Static299.anIntArray354[local106] = 32;
									}
									Static154.anIntArray49[local106] = local68.anInt3373;
								}
								local543++;
								local106--;
							}
							if (!local34[arg4 & 0x3]) {
								arg5[0] = Static1.aBooleanArrayArray1[local85][local531 + 2 & 0x3];
							}
						} else if (!local34[--arg4 & 0x3]) {
							arg5[0] = Static169.aBooleanArrayArray2[local85][local531 + 2 & 0x3];
						}
					}
				}
			}
			if (arg3 < arg0 - 1) {
				local53 = arg1[arg7][arg3 + 1] & 0xFF;
				if (local53 > 0) {
					local68 = this.aClass124_7.method3150(local53 - 1);
					if (local68.anInt3381 != -1) {
						local85 = arg9[arg7][arg3 + 1];
						local531 = arg11[arg7][arg3 + 1];
						if (local68.aBoolean283) {
							local106 = 4;
							local543 = local531 * 2 + 2;
							local548 = Static200.method3169(local68, arg12);
							for (local550 = 0; local550 < 3; local550++) {
								local543 &= 0x7;
								local106 &= 0x7;
								if (Static192.aBooleanArrayArray3[local85][local543] && local68.anInt3373 >= Static154.anIntArray49[local106]) {
									Static326.anIntArray395[local106] = local68.anInt3381;
									Static115.anIntArray164[local106] = local548;
									Static192.anIntArray240[local106] = arg12.method4243() ? local68.anInt3378 : local68.anInt3375;
									Static210.anIntArray261[local106] = local68.anInt3374;
									if (Static154.anIntArray49[local106] == local68.anInt3373) {
										Static299.anIntArray354[local106] |= 0x10;
									} else {
										Static299.anIntArray354[local106] = 16;
									}
									Static154.anIntArray49[local106] = local68.anInt3373;
								}
								local106++;
								local543--;
							}
							if (!local34[arg4 + 2 & 0x3]) {
								arg5[2] = Static1.aBooleanArrayArray1[local85][local531 & 0x3];
							}
						} else if (!local34[arg4 + 2 & 0x3]) {
							arg5[2] = Static169.aBooleanArrayArray2[local85][local531 & 0x3];
						}
					}
				}
			}
			if (arg7 > 0) {
				local53 = arg1[arg7 - 1][arg3] & 0xFF;
				if (local53 > 0) {
					local68 = this.aClass124_7.method3150(local53 - 1);
					if (local68.anInt3381 != -1) {
						local85 = arg9[arg7 - 1][arg3];
						local531 = arg11[arg7 - 1][arg3];
						if (local68.aBoolean283) {
							local106 = 6;
							local543 = local531 * 2 + 4;
							local548 = Static200.method3169(local68, arg12);
							for (local550 = 0; local550 < 3; local550++) {
								local106 &= 0x7;
								local543 &= 0x7;
								if (Static192.aBooleanArrayArray3[local85][local543] && local68.anInt3373 >= Static154.anIntArray49[local106]) {
									Static326.anIntArray395[local106] = local68.anInt3381;
									Static115.anIntArray164[local106] = local548;
									Static192.anIntArray240[local106] = arg12.method4243() ? local68.anInt3378 : local68.anInt3375;
									Static210.anIntArray261[local106] = local68.anInt3374;
									if (local68.anInt3373 == Static154.anIntArray49[local106]) {
										Static299.anIntArray354[local106] |= 0x8;
									} else {
										Static299.anIntArray354[local106] = 8;
									}
									Static154.anIntArray49[local106] = local68.anInt3373;
								}
								local543--;
								local106++;
							}
							if (!local34[arg4 + 3 & 0x3]) {
								arg5[3] = Static1.aBooleanArrayArray1[local85][local531 + 1 & 0x3];
							}
						} else if (!local34[arg4 + 3 & 0x3]) {
							arg5[3] = Static169.aBooleanArrayArray2[local85][local531 + 1 & 0x3];
						}
					}
				}
			}
			if (arg7 < arg6 - 1) {
				local53 = arg1[arg7 + 1][arg3] & 0xFF;
				if (local53 > 0) {
					local68 = this.aClass124_7.method3150(local53 - 1);
					if (local68.anInt3381 != -1) {
						local85 = arg9[arg7 + 1][arg3];
						local531 = arg11[arg7 + 1][arg3];
						if (local68.aBoolean283) {
							local106 = 4;
							local543 = local531 * 2 + 6;
							local548 = Static200.method3169(local68, arg12);
							for (local550 = 0; local550 < 3; local550++) {
								local106 &= 0x7;
								local543 &= 0x7;
								if (Static192.aBooleanArrayArray3[local85][local543] && Static154.anIntArray49[local106] <= local68.anInt3373) {
									Static326.anIntArray395[local106] = local68.anInt3381;
									Static115.anIntArray164[local106] = local548;
									Static192.anIntArray240[local106] = arg12.method4243() ? local68.anInt3378 : local68.anInt3375;
									Static210.anIntArray261[local106] = local68.anInt3374;
									if (local68.anInt3373 == Static154.anIntArray49[local106]) {
										Static299.anIntArray354[local106] |= 0x4;
									} else {
										Static299.anIntArray354[local106] = 4;
									}
									Static154.anIntArray49[local106] = local68.anInt3373;
								}
								local106--;
								local543++;
							}
							if (!local34[arg4 + 1 & 0x3]) {
								arg5[1] = Static1.aBooleanArrayArray1[local85][local531 + 3 & 0x3];
							}
						} else if (!local34[arg4 + 1 & 0x3]) {
							arg5[1] = Static169.aBooleanArrayArray2[local85][local531 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg8 == null) {
			return;
		}
		@Pc(1253) int local1253 = Static200.method3169(arg8, arg12);
		if (!arg8.aBoolean283) {
			return;
		}
		for (local53 = 0; local53 < 8; local53++) {
			@Pc(1269) int local1269 = local53 - arg4 * 2 & 0x7;
			if (Static192.aBooleanArrayArray3[arg2][local53] && arg8.anInt3373 >= Static154.anIntArray49[local1269]) {
				Static326.anIntArray395[local1269] = arg8.anInt3381;
				Static115.anIntArray164[local1269] = local1253;
				Static192.anIntArray240[local1269] = arg12.method4243() ? arg8.anInt3378 : arg8.anInt3375;
				Static210.anIntArray261[local1269] = arg8.anInt3374;
				if (Static154.anIntArray49[local1269] == arg8.anInt3373) {
					Static299.anIntArray354[local1269] |= 0x2;
				} else {
					Static299.anIntArray354[local1269] = 2;
				}
				Static154.anIntArray49[local1269] = arg8.anInt3373;
			}
		}
		return;
	}
}
