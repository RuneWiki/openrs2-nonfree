import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class5_Sub3_Sub1 extends Class5_Sub3 {

	@OriginalMember(owner = "client!hf", name = "s", descriptor = "S")
	private short aShort7;

	@OriginalMember(owner = "client!hf", name = "t", descriptor = "[B")
	private byte[] aByteArray25;

	@OriginalMember(owner = "client!hf", name = "u", descriptor = "[I")
	private int[] anIntArray299;

	@OriginalMember(owner = "client!hf", name = "y", descriptor = "[I")
	private int[] anIntArray300;

	@OriginalMember(owner = "client!hf", name = "z", descriptor = "[I")
	private int[] anIntArray301;

	@OriginalMember(owner = "client!hf", name = "A", descriptor = "[S")
	private short[] aShortArray54;

	@OriginalMember(owner = "client!hf", name = "B", descriptor = "[I")
	private int[] anIntArray302;

	@OriginalMember(owner = "client!hf", name = "E", descriptor = "S")
	private short aShort8;

	@OriginalMember(owner = "client!hf", name = "F", descriptor = "[B")
	private byte[] aByteArray26;

	@OriginalMember(owner = "client!hf", name = "G", descriptor = "S")
	private short aShort9;

	@OriginalMember(owner = "client!hf", name = "H", descriptor = "S")
	private short aShort10;

	@OriginalMember(owner = "client!hf", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!hf", name = "J", descriptor = "[I")
	private int[] anIntArray303;

	@OriginalMember(owner = "client!hf", name = "K", descriptor = "[I")
	private int[] anIntArray304;

	@OriginalMember(owner = "client!hf", name = "L", descriptor = "S")
	private short aShort11;

	@OriginalMember(owner = "client!hf", name = "M", descriptor = "[I")
	public int[] anIntArray305;

	@OriginalMember(owner = "client!hf", name = "N", descriptor = "[B")
	private byte[] aByteArray27;

	@OriginalMember(owner = "client!hf", name = "Q", descriptor = "S")
	private short aShort12;

	@OriginalMember(owner = "client!hf", name = "R", descriptor = "S")
	private short aShort13;

	@OriginalMember(owner = "client!hf", name = "S", descriptor = "S")
	private short aShort14;

	@OriginalMember(owner = "client!hf", name = "T", descriptor = "[I")
	private int[] anIntArray306;

	@OriginalMember(owner = "client!hf", name = "U", descriptor = "[I")
	private int[] anIntArray307;

	@OriginalMember(owner = "client!hf", name = "V", descriptor = "[I")
	public int[] anIntArray308;

	@OriginalMember(owner = "client!hf", name = "W", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!hf", name = "Y", descriptor = "[I")
	public int[] anIntArray309;

	@OriginalMember(owner = "client!hf", name = "Z", descriptor = "[I")
	private int[] anIntArray310;

	@OriginalMember(owner = "client!hf", name = "D", descriptor = "I")
	public int anInt1782 = 0;

	@OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
	private int anInt1780 = 0;

	@OriginalMember(owner = "client!hf", name = "v", descriptor = "B")
	private byte aByte9 = 0;

	@OriginalMember(owner = "client!hf", name = "C", descriptor = "Z")
	public boolean aBoolean66 = false;

	@OriginalMember(owner = "client!hf", name = "x", descriptor = "I")
	private int anInt1781 = 0;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub1() {
	}

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!vj;IIIII)V")
	public Class5_Sub3_Sub1(@OriginalArg(0) Class5_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method3805();
		arg0.method3804();
		this.anInt1782 = arg0.anInt4748;
		this.anIntArray309 = arg0.anIntArray760;
		this.anIntArray305 = arg0.anIntArray763;
		this.anIntArray308 = arg0.anIntArray756;
		this.anInt1780 = arg0.anInt4747;
		this.anIntArray299 = arg0.anIntArray762;
		this.anIntArray307 = arg0.anIntArray761;
		this.anIntArray304 = arg0.anIntArray764;
		this.aByteArray25 = arg0.aByteArray58;
		this.aByteArray26 = arg0.aByteArray64;
		this.aByte9 = arg0.aByte17;
		this.anIntArrayArray22 = arg0.anIntArrayArray44;
		this.anIntArrayArray21 = arg0.anIntArrayArray45;
		@Pc(87) int local87 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(93) int local93 = arg2 * local87 >> 8;
		this.anIntArray303 = new int[this.anInt1780];
		this.anIntArray310 = new int[this.anInt1780];
		this.anIntArray306 = new int[this.anInt1780];
		@Pc(118) int local118;
		if (arg0.aShortArray151 == null) {
			this.aShortArray54 = null;
		} else {
			this.aShortArray54 = new short[this.anInt1780];
			for (local118 = 0; local118 < this.anInt1780; local118++) {
				@Pc(124) short local124 = arg0.aShortArray151[local118];
				if (local124 != -1 && Static163.anInterface4_1.method762(local124)) {
					this.aShortArray54[local118] = local124;
				} else {
					this.aShortArray54[local118] = -1;
				}
			}
		}
		@Pc(295) int local295;
		if (arg0.anInt4746 > 0 && arg0.aByteArray57 != null) {
			@Pc(162) int[] local162 = new int[arg0.anInt4746];
			for (@Pc(164) int local164 = 0; local164 < this.anInt1780; local164++) {
				if (arg0.aByteArray57[local164] != -1) {
					local162[arg0.aByteArray57[local164] & 0xFF]++;
				}
			}
			this.anInt1781 = 0;
			for (@Pc(193) int local193 = 0; local193 < arg0.anInt4746; local193++) {
				if (local162[local193] > 0 && arg0.aByteArray61[local193] == 0) {
					this.anInt1781++;
				}
			}
			this.anIntArray300 = new int[this.anInt1781];
			this.anIntArray302 = new int[this.anInt1781];
			this.anIntArray301 = new int[this.anInt1781];
			@Pc(231) int local231 = 0;
			for (@Pc(233) int local233 = 0; local233 < arg0.anInt4746; local233++) {
				if (local162[local233] > 0 && arg0.aByteArray61[local233] == 0) {
					this.anIntArray300[local231] = arg0.aShortArray150[local233] & 0xFFFF;
					this.anIntArray302[local231] = arg0.aShortArray149[local233] & 0xFFFF;
					this.anIntArray301[local231] = arg0.aShortArray152[local233] & 0xFFFF;
					local162[local233] = local231++;
				} else {
					local162[local233] = -1;
				}
			}
			this.aByteArray27 = new byte[this.anInt1780];
			for (local295 = 0; local295 < this.anInt1780; local295++) {
				if (arg0.aByteArray57[local295] == -1) {
					this.aByteArray27[local295] = -1;
				} else {
					this.aByteArray27[local295] = (byte) local162[arg0.aByteArray57[local295] & 0xFF];
					if (this.aByteArray27[local295] == -1 && this.aShortArray54 != null) {
						this.aShortArray54[local295] = -1;
					}
				}
			}
		}
		for (local118 = 0; local118 < this.anInt1780; local118++) {
			@Pc(348) byte local348;
			if (arg0.aByteArray63 == null) {
				local348 = 0;
			} else {
				local348 = arg0.aByteArray63[local118];
			}
			@Pc(359) byte local359;
			if (arg0.aByteArray64 == null) {
				local359 = 0;
			} else {
				local359 = arg0.aByteArray64[local118];
			}
			@Pc(370) short local370;
			if (this.aShortArray54 == null) {
				local370 = -1;
			} else {
				local370 = this.aShortArray54[local118];
			}
			if (local359 == -2) {
				local348 = 3;
			}
			if (local359 == -1) {
				local348 = 2;
			}
			@Pc(417) Class85 local417;
			@Pc(578) Class94 local578;
			if (local370 == -1) {
				if (local348 == 0) {
					@Pc(398) int local398 = arg0.aShortArray153[local118] & 0xFFFF;
					if (arg0.aClass85Array2 == null || arg0.aClass85Array2[this.anIntArray299[local118]] == null) {
						local417 = arg0.aClass85Array1[this.anIntArray299[local118]];
					} else {
						local417 = arg0.aClass85Array2[this.anIntArray299[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt4286 + arg4 * local417.anInt4289 + arg5 * local417.anInt4287) / (local93 * local417.anInt4290);
					this.anIntArray303[local118] = Static83.method1445(local398, local295);
					if (arg0.aClass85Array2 == null || arg0.aClass85Array2[this.anIntArray307[local118]] == null) {
						local417 = arg0.aClass85Array1[this.anIntArray307[local118]];
					} else {
						local417 = arg0.aClass85Array2[this.anIntArray307[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt4286 + arg4 * local417.anInt4289 + arg5 * local417.anInt4287) / (local93 * local417.anInt4290);
					this.anIntArray310[local118] = Static83.method1445(local398, local295);
					if (arg0.aClass85Array2 == null || arg0.aClass85Array2[this.anIntArray304[local118]] == null) {
						local417 = arg0.aClass85Array1[this.anIntArray304[local118]];
					} else {
						local417 = arg0.aClass85Array2[this.anIntArray304[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt4286 + arg4 * local417.anInt4289 + arg5 * local417.anInt4287) / (local93 * local417.anInt4290);
					this.anIntArray306[local118] = Static83.method1445(local398, local295);
				} else if (local348 == 1) {
					local578 = arg0.aClass94Array1[local118];
					local295 = arg1 + (arg3 * local578.anInt4465 + arg4 * local578.anInt4468 + arg5 * local578.anInt4470) / (local93 + local93 / 2);
					this.anIntArray303[local118] = Static83.method1445(arg0.aShortArray153[local118] & 0xFFFF, local295);
					this.anIntArray306[local118] = -1;
				} else if (local348 == 3) {
					this.anIntArray303[local118] = 128;
					this.anIntArray306[local118] = -1;
				} else {
					this.anIntArray306[local118] = -2;
				}
			} else if (local348 == 0) {
				if (arg0.aClass85Array2 == null || arg0.aClass85Array2[this.anIntArray299[local118]] == null) {
					local417 = arg0.aClass85Array1[this.anIntArray299[local118]];
				} else {
					local417 = arg0.aClass85Array2[this.anIntArray299[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt4286 + arg4 * local417.anInt4289 + arg5 * local417.anInt4287) / (local93 * local417.anInt4290);
				this.anIntArray303[local118] = Static83.method1435(local295);
				if (arg0.aClass85Array2 == null || arg0.aClass85Array2[this.anIntArray307[local118]] == null) {
					local417 = arg0.aClass85Array1[this.anIntArray307[local118]];
				} else {
					local417 = arg0.aClass85Array2[this.anIntArray307[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt4286 + arg4 * local417.anInt4289 + arg5 * local417.anInt4287) / (local93 * local417.anInt4290);
				this.anIntArray310[local118] = Static83.method1435(local295);
				if (arg0.aClass85Array2 == null || arg0.aClass85Array2[this.anIntArray304[local118]] == null) {
					local417 = arg0.aClass85Array1[this.anIntArray304[local118]];
				} else {
					local417 = arg0.aClass85Array2[this.anIntArray304[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt4286 + arg4 * local417.anInt4289 + arg5 * local417.anInt4287) / (local93 * local417.anInt4290);
				this.anIntArray306[local118] = Static83.method1435(local295);
			} else if (local348 == 1) {
				local578 = arg0.aClass94Array1[local118];
				local295 = arg1 + (arg3 * local578.anInt4465 + arg4 * local578.anInt4468 + arg5 * local578.anInt4470) / (local93 + local93 / 2);
				this.anIntArray303[local118] = Static83.method1435(local295);
				this.anIntArray306[local118] = -1;
			} else {
				this.anIntArray306[local118] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "([Lclient!hf;I)V")
	private Class5_Sub3_Sub1(@OriginalArg(0) Class5_Sub3_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt1782 = 0;
		this.anInt1780 = 0;
		this.anInt1781 = 0;
		this.aByte9 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class5_Sub3_Sub1 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt1782 += local43.anInt1782;
				this.anInt1780 += local43.anInt1780;
				this.anInt1781 += local43.anInt1781;
				if (local43.aByteArray25 == null) {
					if (this.aByte9 == -1) {
						this.aByte9 = local43.aByte9;
					}
					if (this.aByte9 != local43.aByte9) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local43.aByteArray26 != null;
				local22 |= local43.aShortArray54 != null;
				local24 |= local43.aByteArray27 != null;
			}
		}
		this.anIntArray309 = new int[this.anInt1782];
		this.anIntArray305 = new int[this.anInt1782];
		this.anIntArray308 = new int[this.anInt1782];
		this.anIntArray299 = new int[this.anInt1780];
		this.anIntArray307 = new int[this.anInt1780];
		this.anIntArray304 = new int[this.anInt1780];
		this.anIntArray303 = new int[this.anInt1780];
		this.anIntArray310 = new int[this.anInt1780];
		this.anIntArray306 = new int[this.anInt1780];
		if (local18) {
			this.aByteArray25 = new byte[this.anInt1780];
		}
		if (local20) {
			this.aByteArray26 = new byte[this.anInt1780];
		}
		if (local22) {
			this.aShortArray54 = new short[this.anInt1780];
		}
		if (local24) {
			this.aByteArray27 = new byte[this.anInt1780];
		}
		if (this.anInt1781 > 0) {
			this.anIntArray300 = new int[this.anInt1781];
			this.anIntArray302 = new int[this.anInt1781];
			this.anIntArray301 = new int[this.anInt1781];
		}
		this.anInt1782 = 0;
		this.anInt1780 = 0;
		this.anInt1781 = 0;
		for (@Pc(220) int local220 = 0; local220 < arg1; local220++) {
			@Pc(225) Class5_Sub3_Sub1 local225 = arg0[local220];
			if (local225 != null) {
				for (@Pc(229) int local229 = 0; local229 < local225.anInt1780; local229++) {
					this.anIntArray299[this.anInt1780] = local225.anIntArray299[local229] + this.anInt1782;
					this.anIntArray307[this.anInt1780] = local225.anIntArray307[local229] + this.anInt1782;
					this.anIntArray304[this.anInt1780] = local225.anIntArray304[local229] + this.anInt1782;
					this.anIntArray303[this.anInt1780] = local225.anIntArray303[local229];
					this.anIntArray310[this.anInt1780] = local225.anIntArray310[local229];
					this.anIntArray306[this.anInt1780] = local225.anIntArray306[local229];
					if (local18) {
						if (local225.aByteArray25 == null) {
							this.aByteArray25[this.anInt1780] = local225.aByte9;
						} else {
							this.aByteArray25[this.anInt1780] = local225.aByteArray25[local229];
						}
					}
					if (local20 && local225.aByteArray26 != null) {
						this.aByteArray26[this.anInt1780] = local225.aByteArray26[local229];
					}
					if (local22) {
						if (local225.aShortArray54 == null) {
							this.aShortArray54[this.anInt1780] = -1;
						} else {
							this.aShortArray54[this.anInt1780] = local225.aShortArray54[local229];
						}
					}
					if (local24) {
						if (local225.aByteArray27 == null || local225.aByteArray27[local229] == -1) {
							this.aByteArray27[this.anInt1780] = -1;
						} else {
							this.aByteArray27[this.anInt1780] = (byte) (local225.aByteArray27[local229] + this.anInt1781);
						}
					}
					this.anInt1780++;
				}
				for (@Pc(394) int local394 = 0; local394 < local225.anInt1781; local394++) {
					this.anIntArray300[this.anInt1781] = local225.anIntArray300[local394] + this.anInt1782;
					this.anIntArray302[this.anInt1781] = local225.anIntArray302[local394] + this.anInt1782;
					this.anIntArray301[this.anInt1781] = local225.anIntArray301[local394] + this.anInt1782;
					this.anInt1781++;
				}
				for (@Pc(444) int local444 = 0; local444 < local225.anInt1782; local444++) {
					this.anIntArray309[this.anInt1782] = local225.anIntArray309[local444];
					this.anIntArray305[this.anInt1782] = local225.anIntArray305[local444];
					this.anIntArray308[this.anInt1782] = local225.anIntArray308[local444];
					this.anInt1782++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "()I")
	@Override
	public int method3773() {
		if (!this.aBoolean66) {
			this.method1438();
		}
		return this.aShort14;
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V")
	@Override
	public void method1418(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class77.anIntArray631[arg0];
		@Pc(7) int local7 = Class77.anIntArray632[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1782; local9++) {
			@Pc(26) int local26 = this.anIntArray305[local9] * local7 - this.anIntArray308[local9] * local3 >> 16;
			this.anIntArray308[local9] = this.anIntArray305[local9] * local3 + this.anIntArray308[local9] * local7 >> 16;
			this.anIntArray305[local9] = local26;
		}
		this.aBoolean66 = false;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[IIII)V")
	private void method1433(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static83.anInt1784 = 0;
			Static83.anInt1783 = 0;
			Static83.anInt1785 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray22.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray22[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static83.anInt1784 += this.anIntArray309[local36];
						Static83.anInt1783 += this.anIntArray305[local36];
						Static83.anInt1785 += this.anIntArray308[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static83.anInt1784 = Static83.anInt1784 / local6 + arg2;
				Static83.anInt1783 = Static83.anInt1783 / local6 + arg3;
				Static83.anInt1785 = Static83.anInt1785 / local6 + arg4;
			} else {
				Static83.anInt1784 = arg2;
				Static83.anInt1783 = arg3;
				Static83.anInt1785 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray22.length) {
					local115 = this.anIntArrayArray22[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray309[local31] += arg2;
						this.anIntArray305[local31] += arg3;
						this.anIntArray308[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray22.length) {
					local115 = this.anIntArrayArray22[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray309[local31] -= Static83.anInt1784;
						this.anIntArray305[local31] -= Static83.anInt1783;
						this.anIntArray308[local31] -= Static83.anInt1785;
						@Pc(217) int local217;
						@Pc(235) int local235;
						if (arg4 != 0) {
							local36 = Class77.anIntArray631[arg4];
							local217 = Class77.anIntArray632[arg4];
							local235 = this.anIntArray305[local31] * local36 + this.anIntArray309[local31] * local217 + 32767 >> 16;
							this.anIntArray305[local31] = this.anIntArray305[local31] * local217 + 32767 - this.anIntArray309[local31] * local36 >> 16;
							this.anIntArray309[local31] = local235;
						}
						if (arg2 != 0) {
							local36 = Class77.anIntArray631[arg2];
							local217 = Class77.anIntArray632[arg2];
							local235 = this.anIntArray305[local31] * local217 + 32767 - this.anIntArray308[local31] * local36 >> 16;
							this.anIntArray308[local31] = this.anIntArray305[local31] * local36 + this.anIntArray308[local31] * local217 + 32767 >> 16;
							this.anIntArray305[local31] = local235;
						}
						if (arg3 != 0) {
							local36 = Class77.anIntArray631[arg3];
							local217 = Class77.anIntArray632[arg3];
							local235 = this.anIntArray308[local31] * local36 + this.anIntArray309[local31] * local217 + 32767 >> 16;
							this.anIntArray308[local31] = this.anIntArray308[local31] * local217 + 32767 - this.anIntArray309[local31] * local36 >> 16;
							this.anIntArray309[local31] = local235;
						}
						this.anIntArray309[local31] += Static83.anInt1784;
						this.anIntArray305[local31] += Static83.anInt1783;
						this.anIntArray308[local31] += Static83.anInt1785;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray22.length) {
					local115 = this.anIntArrayArray22[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray309[local31] -= Static83.anInt1784;
						this.anIntArray305[local31] -= Static83.anInt1783;
						this.anIntArray308[local31] -= Static83.anInt1785;
						this.anIntArray309[local31] = this.anIntArray309[local31] * arg2 / 128;
						this.anIntArray305[local31] = this.anIntArray305[local31] * arg3 / 128;
						this.anIntArray308[local31] = this.anIntArray308[local31] * arg4 / 128;
						this.anIntArray309[local31] += Static83.anInt1784;
						this.anIntArray305[local31] += Static83.anInt1783;
						this.anIntArray308[local31] += Static83.anInt1785;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray21 != null && this.aByteArray26 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray21.length) {
					local115 = this.anIntArrayArray21[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray26[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray26[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "()I")
	@Override
	public int method1422() {
		if (!this.aBoolean66) {
			this.method1438();
		}
		return this.aShort7;
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(IIIIIIII)V")
	public void method1434(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (!this.aBoolean66) {
				this.method1438();
			}
			@Pc(6) int local6 = Static163.anInt3760;
			@Pc(8) int local8 = Static163.anInt3759;
			@Pc(12) int local12 = Class77.anIntArray631[0];
			@Pc(16) int local16 = Class77.anIntArray632[0];
			@Pc(20) int local20 = Class77.anIntArray631[arg0];
			@Pc(24) int local24 = Class77.anIntArray632[arg0];
			@Pc(28) int local28 = Class77.anIntArray631[arg1];
			@Pc(32) int local32 = Class77.anIntArray632[arg1];
			@Pc(36) int local36 = Class77.anIntArray631[arg2];
			@Pc(40) int local40 = Class77.anIntArray632[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt1782; local52++) {
				@Pc(58) int local58 = this.anIntArray309[local52];
				@Pc(63) int local63 = this.anIntArray305[local52];
				@Pc(68) int local68 = this.anIntArray308[local52];
				@Pc(80) int local80;
				if (arg1 != 0) {
					local80 = local63 * local28 + local58 * local32 >> 16;
					local63 = local63 * local32 - local58 * local28 >> 16;
					local58 = local80;
				}
				if (arg0 != 0) {
					local80 = local68 * local20 + local58 * local24 >> 16;
					local68 = local68 * local24 - local58 * local20 >> 16;
					local58 = local80;
				}
				local58 += arg3;
				local63 += arg4;
				local68 += arg5;
				local80 = local63 * local40 - local68 * local36 >> 16;
				local68 = local63 * local36 + local68 * local40 >> 16;
				Static83.anIntArray311[local52] = local68 - local50;
				Static83.anIntArray322[local52] = local6 + (local58 << 9) / arg6;
				Static83.anIntArray312[local52] = local8 + (local80 << 9) / arg6;
				if (this.anInt1781 > 0) {
					Static83.anIntArray316[local52] = local58;
					Static83.anIntArray320[local52] = local80;
					Static83.anIntArray313[local52] = local68;
				}
			}
			this.method1440(false, false, 0L, this.aShort9, this.aShort9 << 1);
		} catch (@Pc(233) RuntimeException local233) {
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!oj;I)V")
	@Override
	public void method1420(@OriginalArg(0) Class2_Sub3_Sub22 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray22 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class70 local12 = arg0.aClass70Array1[arg1];
		@Pc(15) Class2_Sub24 local15 = local12.aClass2_Sub24_1;
		Static83.anInt1784 = 0;
		Static83.anInt1783 = 0;
		Static83.anInt1785 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt3200; local23++) {
			@Pc(29) short local29 = local12.aShortArray103[local23];
			if (local15.aBooleanArray86[local29]) {
				if (local12.aShortArray100[local23] != -1) {
					this.method1441(0, 0, 0, 0);
				}
				this.method1441(local15.anIntArray475[local29], local12.aShortArray94[local23], local12.aShortArray99[local23], local12.aShortArray97[local23]);
			}
		}
		this.aBoolean66 = false;
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
	@Override
	public void method1414(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class77.anIntArray631[arg0];
		@Pc(7) int local7 = Class77.anIntArray632[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1782; local9++) {
			@Pc(26) int local26 = this.anIntArray308[local9] * local3 + this.anIntArray309[local9] * local7 >> 16;
			this.anIntArray308[local9] = this.anIntArray308[local9] * local7 - this.anIntArray309[local9] * local3 >> 16;
			this.anIntArray309[local9] = local26;
		}
		this.aBoolean66 = false;
	}

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "()V")
	@Override
	public void method1424() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1782; local1++) {
			@Pc(7) int local7 = this.anIntArray308[local1];
			this.anIntArray308[local1] = this.anIntArray309[local1];
			this.anIntArray309[local1] = -local7;
		}
		this.aBoolean66 = false;
	}

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "()I")
	@Override
	public int method1431() {
		if (!this.aBoolean66) {
			this.method1438();
		}
		return this.aShort8;
	}

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)V")
	private void method1436(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static163.anInt3760;
		@Pc(3) int local3 = Static163.anInt3759;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray299[arg0];
		@Pc(15) int local15 = this.anIntArray307[arg0];
		@Pc(20) int local20 = this.anIntArray304[arg0];
		@Pc(24) int local24 = Static83.anIntArray313[local10];
		@Pc(28) int local28 = Static83.anIntArray313[local15];
		@Pc(32) int local32 = Static83.anIntArray313[local20];
		if (this.aByteArray26 == null) {
			Static163.anInt3758 = 0;
		} else {
			Static163.anInt3758 = this.aByteArray26[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static83.anIntArray324[0] = Static83.anIntArray322[local10];
			Static83.anIntArray315[0] = Static83.anIntArray312[local10];
			local5++;
			Static83.anIntArray321[0] = this.anIntArray303[arg0];
		} else {
			local73 = Static83.anIntArray316[local10];
			local77 = Static83.anIntArray320[local10];
			local82 = this.anIntArray303[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Class77.anIntArray629[local32 - local24];
				Static83.anIntArray324[0] = local1 + (local73 + ((Static83.anIntArray316[local20] - local73) * local95 >> 16) << 9) / 50;
				Static83.anIntArray315[0] = local3 + (local77 + ((Static83.anIntArray320[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static83.anIntArray321[0] = local82 + ((this.anIntArray306[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Class77.anIntArray629[local28 - local24];
				Static83.anIntArray324[local5] = local1 + (local73 + ((Static83.anIntArray316[local15] - local73) * local95 >> 16) << 9) / 50;
				Static83.anIntArray315[local5] = local3 + (local77 + ((Static83.anIntArray320[local15] - local77) * local95 >> 16) << 9) / 50;
				Static83.anIntArray321[local5++] = local82 + ((this.anIntArray310[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static83.anIntArray324[local5] = Static83.anIntArray322[local15];
			Static83.anIntArray315[local5] = Static83.anIntArray312[local15];
			Static83.anIntArray321[local5++] = this.anIntArray310[arg0];
		} else {
			local73 = Static83.anIntArray316[local15];
			local77 = Static83.anIntArray320[local15];
			local82 = this.anIntArray310[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Class77.anIntArray629[local24 - local28];
				Static83.anIntArray324[local5] = local1 + (local73 + ((Static83.anIntArray316[local10] - local73) * local95 >> 16) << 9) / 50;
				Static83.anIntArray315[local5] = local3 + (local77 + ((Static83.anIntArray320[local10] - local77) * local95 >> 16) << 9) / 50;
				Static83.anIntArray321[local5++] = local82 + ((this.anIntArray303[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Class77.anIntArray629[local32 - local28];
				Static83.anIntArray324[local5] = local1 + (local73 + ((Static83.anIntArray316[local20] - local73) * local95 >> 16) << 9) / 50;
				Static83.anIntArray315[local5] = local3 + (local77 + ((Static83.anIntArray320[local20] - local77) * local95 >> 16) << 9) / 50;
				Static83.anIntArray321[local5++] = local82 + ((this.anIntArray306[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static83.anIntArray324[local5] = Static83.anIntArray322[local20];
			Static83.anIntArray315[local5] = Static83.anIntArray312[local20];
			Static83.anIntArray321[local5++] = this.anIntArray306[arg0];
		} else {
			local73 = Static83.anIntArray316[local20];
			local77 = Static83.anIntArray320[local20];
			local82 = this.anIntArray306[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Class77.anIntArray629[local28 - local32];
				Static83.anIntArray324[local5] = local1 + (local73 + ((Static83.anIntArray316[local15] - local73) * local95 >> 16) << 9) / 50;
				Static83.anIntArray315[local5] = local3 + (local77 + ((Static83.anIntArray320[local15] - local77) * local95 >> 16) << 9) / 50;
				Static83.anIntArray321[local5++] = local82 + ((this.anIntArray310[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Class77.anIntArray629[local24 - local32];
				Static83.anIntArray324[local5] = local1 + (local73 + ((Static83.anIntArray316[local10] - local73) * local95 >> 16) << 9) / 50;
				Static83.anIntArray315[local5] = local3 + (local77 + ((Static83.anIntArray320[local10] - local77) * local95 >> 16) << 9) / 50;
				Static83.anIntArray321[local5++] = local82 + ((this.anIntArray303[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static83.anIntArray324[0];
		local77 = Static83.anIntArray324[1];
		local82 = Static83.anIntArray324[2];
		local95 = Static83.anIntArray315[0];
		@Pc(590) int local590 = Static83.anIntArray315[1];
		@Pc(594) int local594 = Static83.anIntArray315[2];
		Static163.aBoolean165 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static163.anInt3756 || local77 > Static163.anInt3756 || local82 > Static163.anInt3756) {
				Static163.aBoolean165 = true;
			}
			if (this.aShortArray54 != null && this.aShortArray54[arg0] != -1) {
				if (this.aByteArray27 == null || this.aByteArray27[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray27[arg0] & 0xFF;
					local683 = this.anIntArray300[local678];
					local688 = this.anIntArray302[local678];
					local693 = this.anIntArray301[local678];
				}
				if (this.anIntArray306[arg0] == -1) {
					Static163.method2933(local95, local590, local594, local73, local77, local82, this.anIntArray303[arg0], this.anIntArray303[arg0], this.anIntArray303[arg0], Static83.anIntArray316[local683], Static83.anIntArray316[local688], Static83.anIntArray316[local693], Static83.anIntArray320[local683], Static83.anIntArray320[local688], Static83.anIntArray320[local693], Static83.anIntArray313[local683], Static83.anIntArray313[local688], Static83.anIntArray313[local693], this.aShortArray54[arg0]);
				} else {
					Static163.method2933(local95, local590, local594, local73, local77, local82, Static83.anIntArray321[0], Static83.anIntArray321[1], Static83.anIntArray321[2], Static83.anIntArray316[local683], Static83.anIntArray316[local688], Static83.anIntArray316[local693], Static83.anIntArray320[local683], Static83.anIntArray320[local688], Static83.anIntArray320[local693], Static83.anIntArray313[local683], Static83.anIntArray313[local688], Static83.anIntArray313[local693], this.aShortArray54[arg0]);
				}
			} else if (this.anIntArray306[arg0] == -1) {
				Static163.method2950(local95, local590, local594, local73, local77, local82, Static163.anIntArray630[this.anIntArray303[arg0]]);
			} else {
				Static163.method2943(local95, local590, local594, local73, local77, local82, Static83.anIntArray321[0], Static83.anIntArray321[1], Static83.anIntArray321[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static163.anInt3756 || local77 > Static163.anInt3756 || local82 > Static163.anInt3756 || Static83.anIntArray324[3] < 0 || Static83.anIntArray324[3] > Static163.anInt3756) {
			Static163.aBoolean165 = true;
		}
		if (this.aShortArray54 == null || this.aShortArray54[arg0] == -1) {
			if (this.anIntArray306[arg0] == -1) {
				local683 = Static163.anIntArray630[this.anIntArray303[arg0]];
				Static163.method2950(local95, local590, local594, local73, local77, local82, local683);
				Static163.method2950(local95, local594, Static83.anIntArray315[3], local73, local82, Static83.anIntArray324[3], local683);
				return;
			}
			Static163.method2943(local95, local590, local594, local73, local77, local82, Static83.anIntArray321[0], Static83.anIntArray321[1], Static83.anIntArray321[2]);
			Static163.method2943(local95, local594, Static83.anIntArray315[3], local73, local82, Static83.anIntArray324[3], Static83.anIntArray321[0], Static83.anIntArray321[2], Static83.anIntArray321[3]);
			return;
		}
		if (this.aByteArray27 == null || this.aByteArray27[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray27[arg0] & 0xFF;
			local683 = this.anIntArray300[local678];
			local688 = this.anIntArray302[local678];
			local693 = this.anIntArray301[local678];
		}
		@Pc(956) short local956 = this.aShortArray54[arg0];
		if (this.anIntArray306[arg0] == -1) {
			Static163.method2933(local95, local590, local594, local73, local77, local82, this.anIntArray303[arg0], this.anIntArray303[arg0], this.anIntArray303[arg0], Static83.anIntArray316[local683], Static83.anIntArray316[local688], Static83.anIntArray316[local693], Static83.anIntArray320[local683], Static83.anIntArray320[local688], Static83.anIntArray320[local693], Static83.anIntArray313[local683], Static83.anIntArray313[local688], Static83.anIntArray313[local693], local956);
			Static163.method2933(local95, local594, Static83.anIntArray315[3], local73, local82, Static83.anIntArray324[3], this.anIntArray303[arg0], this.anIntArray303[arg0], this.anIntArray303[arg0], Static83.anIntArray316[local683], Static83.anIntArray316[local688], Static83.anIntArray316[local693], Static83.anIntArray320[local683], Static83.anIntArray320[local688], Static83.anIntArray320[local693], Static83.anIntArray313[local683], Static83.anIntArray313[local688], Static83.anIntArray313[local693], local956);
			return;
		}
		Static163.method2933(local95, local590, local594, local73, local77, local82, Static83.anIntArray321[0], Static83.anIntArray321[1], Static83.anIntArray321[2], Static83.anIntArray316[local683], Static83.anIntArray316[local688], Static83.anIntArray316[local693], Static83.anIntArray320[local683], Static83.anIntArray320[local688], Static83.anIntArray320[local693], Static83.anIntArray313[local683], Static83.anIntArray313[local688], Static83.anIntArray313[local693], local956);
		Static163.method2933(local95, local594, Static83.anIntArray315[3], local73, local82, Static83.anIntArray324[3], Static83.anIntArray321[0], Static83.anIntArray321[2], Static83.anIntArray321[3], Static83.anIntArray316[local683], Static83.anIntArray316[local688], Static83.anIntArray316[local693], Static83.anIntArray320[local683], Static83.anIntArray320[local688], Static83.anIntArray320[local693], Static83.anIntArray313[local683], Static83.anIntArray313[local688], Static83.anIntArray313[local693], local956);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZLclient!hf;[B)Lclient!qc;")
	private Class5_Sub3 method1437(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class5_Sub3_Sub1 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt1782 = this.anInt1782;
		arg1.anInt1780 = this.anInt1780;
		arg1.anInt1781 = this.anInt1781;
		if (arg1.anIntArray309 == null || arg1.anIntArray309.length < this.anInt1782) {
			arg1.anIntArray309 = new int[this.anInt1782 + 100];
			arg1.anIntArray305 = new int[this.anInt1782 + 100];
			arg1.anIntArray308 = new int[this.anInt1782 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt1782; local43++) {
			arg1.anIntArray309[local43] = this.anIntArray309[local43];
			arg1.anIntArray305[local43] = this.anIntArray305[local43];
			arg1.anIntArray308[local43] = this.anIntArray308[local43];
		}
		if (arg0) {
			arg1.aByteArray26 = this.aByteArray26;
		} else {
			arg1.aByteArray26 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray26 == null) {
				for (local88 = 0; local88 < this.anInt1780; local88++) {
					arg1.aByteArray26[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt1780; local88++) {
					arg1.aByteArray26[local88] = this.aByteArray26[local88];
				}
			}
		}
		arg1.anIntArray299 = this.anIntArray299;
		arg1.anIntArray307 = this.anIntArray307;
		arg1.anIntArray304 = this.anIntArray304;
		arg1.anIntArray303 = this.anIntArray303;
		arg1.anIntArray310 = this.anIntArray310;
		arg1.anIntArray306 = this.anIntArray306;
		arg1.aByteArray25 = this.aByteArray25;
		arg1.aByteArray27 = this.aByteArray27;
		arg1.aShortArray54 = this.aShortArray54;
		arg1.aByte9 = this.aByte9;
		arg1.anIntArray300 = this.anIntArray300;
		arg1.anIntArray302 = this.anIntArray302;
		arg1.anIntArray301 = this.anIntArray301;
		arg1.anIntArrayArray22 = this.anIntArrayArray22;
		arg1.anIntArrayArray21 = this.anIntArrayArray21;
		arg1.aBoolean65 = super.aBoolean65;
		arg1.aBoolean66 = false;
		return arg1;
	}

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "()V")
	private void method1438() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt1782; local17++) {
			@Pc(23) int local23 = this.anIntArray309[local17];
			@Pc(28) int local28 = this.anIntArray305[local17];
			@Pc(33) int local33 = this.anIntArray308[local17];
			if (local23 < local1) {
				local1 = local23;
			}
			if (local23 > local7) {
				local7 = local23;
			}
			if (local28 < local3) {
				local3 = local28;
			}
			if (local28 > local9) {
				local9 = local28;
			}
			if (local33 < local5) {
				local5 = local33;
			}
			if (local33 > local11) {
				local11 = local33;
			}
			@Pc(71) int local71 = local23 * local23 + local33 * local33;
			if (local71 > local13) {
				local13 = local71;
			}
			local71 = local23 * local23 + local33 * local33 + local28 * local28;
			if (local71 > local15) {
				local15 = local71;
			}
		}
		this.aShort8 = (short) local1;
		this.aShort13 = (short) local7;
		this.aShort14 = (short) local3;
		this.aShort10 = (short) local9;
		this.aShort11 = (short) local5;
		this.aShort7 = (short) local11;
		this.aShort12 = (short) (Math.sqrt((double) local13) + 0.99D);
		this.aShort9 = (short) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean66 = true;
	}

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "()V")
	@Override
	public void method1429() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1782; local1++) {
			@Pc(7) int local7 = this.anIntArray309[local1];
			this.anIntArray309[local1] = this.anIntArray308[local1];
			this.anIntArray308[local1] = -local7;
		}
		this.aBoolean66 = false;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method1415(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (!this.aBoolean66) {
				this.method1438();
			}
			@Pc(6) int local6 = Static163.anInt3760;
			@Pc(8) int local8 = Static163.anInt3759;
			@Pc(12) int local12 = Class77.anIntArray631[0];
			@Pc(16) int local16 = Class77.anIntArray632[0];
			@Pc(20) int local20 = Class77.anIntArray631[arg0];
			@Pc(24) int local24 = Class77.anIntArray632[arg0];
			@Pc(28) int local28 = Class77.anIntArray631[arg1];
			@Pc(32) int local32 = Class77.anIntArray632[arg1];
			@Pc(36) int local36 = Class77.anIntArray631[arg2];
			@Pc(40) int local40 = Class77.anIntArray632[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt1782; local52++) {
				@Pc(58) int local58 = this.anIntArray309[local52];
				@Pc(63) int local63 = this.anIntArray305[local52];
				@Pc(68) int local68 = this.anIntArray308[local52];
				@Pc(80) int local80;
				if (arg1 != 0) {
					local80 = local63 * local28 + local58 * local32 >> 16;
					local63 = local63 * local32 - local58 * local28 >> 16;
					local58 = local80;
				}
				if (arg0 != 0) {
					local80 = local68 * local20 + local58 * local24 >> 16;
					local68 = local68 * local24 - local58 * local20 >> 16;
					local58 = local80;
				}
				local58 += arg3;
				local63 += arg4;
				local68 += arg5;
				local80 = local63 * local40 - local68 * local36 >> 16;
				local68 = local63 * local36 + local68 * local40 >> 16;
				Static83.anIntArray311[local52] = local68 - local50;
				Static83.anIntArray322[local52] = local6 + (local58 << 9) / local68;
				Static83.anIntArray312[local52] = local8 + (local80 << 9) / local68;
				if (this.anInt1781 > 0) {
					Static83.anIntArray316[local52] = local58;
					Static83.anIntArray320[local52] = local80;
					Static83.anIntArray313[local52] = local68;
				}
			}
			this.method1440(false, false, 0L, this.aShort9, this.aShort9 << 1);
		} catch (@Pc(233) RuntimeException local233) {
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!oj;ILclient!oj;I[IZ)V")
	@Override
	public void method1428(@OriginalArg(0) Class2_Sub3_Sub22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub3_Sub22 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1423(arg0, arg1, arg5);
			return;
		}
		@Pc(19) Class70 local19 = arg0.aClass70Array1[arg1];
		@Pc(24) Class70 local24 = arg2.aClass70Array1[arg3];
		@Pc(27) Class2_Sub24 local27 = local19.aClass2_Sub24_1;
		Static83.anInt1784 = 0;
		Static83.anInt1783 = 0;
		Static83.anInt1785 = 0;
		@Pc(35) byte local35 = 0;
		@Pc(38) int local38 = local35 + 1;
		@Pc(40) int local40 = arg4[0];
		for (@Pc(42) int local42 = 0; local42 < local19.anInt3200; local42++) {
			@Pc(48) short local48 = local19.aShortArray103[local42];
			while (local48 > local40) {
				local40 = arg4[local38++];
			}
			if (local48 != local40 || local27.anIntArray475[local48] == 0) {
				if (local19.aShortArray100[local42] != -1) {
					this.method1433(0, local27.anIntArrayArray26[local19.aShortArray100[local42]], 0, 0, 0);
				}
				this.method1433(local27.anIntArray475[local48], local27.anIntArrayArray26[local48], local19.aShortArray94[local42], local19.aShortArray99[local42], local19.aShortArray97[local42]);
			}
		}
		Static83.anInt1784 = 0;
		Static83.anInt1783 = 0;
		Static83.anInt1785 = 0;
		local35 = 0;
		local38 = local35 + 1;
		local40 = arg4[0];
		for (@Pc(126) int local126 = 0; local126 < local24.anInt3200; local126++) {
			@Pc(132) short local132 = local24.aShortArray103[local126];
			while (local132 > local40) {
				local40 = arg4[local38++];
			}
			if (local132 == local40 || local27.anIntArray475[local132] == 0) {
				if (local24.aShortArray100[local126] != -1) {
					this.method1433(0, local27.anIntArrayArray26[local24.aShortArray100[local126]], 0, 0, 0);
				}
				this.method1433(local27.anIntArray475[local132], local27.anIntArrayArray26[local132], local24.aShortArray94[local126], local24.aShortArray99[local126], local24.aShortArray97[local126]);
			}
		}
		this.aBoolean66 = false;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZZJII)V")
	private void method1440(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= 1600) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			Static83.anIntArray319[local5] = 0;
		}
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(65) int local65;
		@Pc(69) int local69;
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(93) int local93;
		for (@Pc(16) int local16 = 0; local16 < this.anInt1780; local16++) {
			if (this.anIntArray306[local16] != -2) {
				local28 = this.anIntArray299[local16];
				local33 = this.anIntArray307[local16];
				local38 = this.anIntArray304[local16];
				local42 = Static83.anIntArray322[local28];
				local46 = Static83.anIntArray322[local33];
				local50 = Static83.anIntArray322[local38];
				if (arg0 && (local42 == -5000 || local46 == -5000 || local50 == -5000)) {
					local65 = Static83.anIntArray316[local28];
					local69 = Static83.anIntArray316[local33];
					@Pc(73) int local73 = Static83.anIntArray316[local38];
					@Pc(77) int local77 = Static83.anIntArray320[local28];
					local81 = Static83.anIntArray320[local33];
					local85 = Static83.anIntArray320[local38];
					@Pc(89) int local89 = Static83.anIntArray313[local28];
					local93 = Static83.anIntArray313[local33];
					@Pc(97) int local97 = Static83.anIntArray313[local38];
					local65 -= local69;
					@Pc(105) int local105 = local73 - local69;
					@Pc(109) int local109 = local77 - local81;
					@Pc(113) int local113 = local85 - local81;
					@Pc(117) int local117 = local89 - local93;
					@Pc(121) int local121 = local97 - local93;
					@Pc(129) int local129 = local109 * local121 - local117 * local113;
					@Pc(137) int local137 = local117 * local105 - local65 * local121;
					@Pc(145) int local145 = local65 * local113 - local109 * local105;
					if (local69 * local129 + local81 * local137 + local93 * local145 > 0) {
						Static83.aBooleanArray55[local16] = true;
						@Pc(177) int local177 = (Static83.anIntArray311[local28] + Static83.anIntArray311[local33] + Static83.anIntArray311[local38]) / 3 + arg3;
						Static83.anIntArrayArray24[local177][Static83.anIntArray319[local177]++] = local16;
					}
				} else {
					if (arg1 && this.method1443(Static117.anInt2739 + Static163.anInt3760, Static62.anInt1227 + Static163.anInt3759, Static83.anIntArray312[local28], Static83.anIntArray312[local33], Static83.anIntArray312[local38], local42, local46, local50)) {
						Static170.aLongArray10[Static110.anInt2438++] = arg2;
						arg1 = false;
					}
					if ((local42 - local46) * (Static83.anIntArray312[local38] - Static83.anIntArray312[local33]) - (Static83.anIntArray312[local28] - Static83.anIntArray312[local33]) * (local50 - local46) > 0) {
						Static83.aBooleanArray55[local16] = false;
						if (local42 >= 0 && local46 >= 0 && local50 >= 0 && local42 <= Static163.anInt3756 && local46 <= Static163.anInt3756 && local50 <= Static163.anInt3756) {
							Static83.aBooleanArray54[local16] = false;
						} else {
							Static83.aBooleanArray54[local16] = true;
						}
						local65 = (Static83.anIntArray311[local28] + Static83.anIntArray311[local33] + Static83.anIntArray311[local38]) / 3 + arg3;
						Static83.anIntArrayArray24[local65][Static83.anIntArray319[local65]++] = local16;
					}
				}
			}
		}
		if (this.aByteArray25 == null) {
			for (local28 = arg4 - 1; local28 >= 0; local28--) {
				local33 = Static83.anIntArray319[local28];
				if (local33 > 0) {
					@Pc(328) int[] local328 = Static83.anIntArrayArray24[local28];
					for (local42 = 0; local42 < local33; local42++) {
						this.method1442(local328[local42]);
					}
				}
			}
			return;
		}
		for (local28 = 0; local28 < 12; local28++) {
			Static83.anIntArray323[local28] = 0;
			Static83.anIntArray317[local28] = 0;
		}
		for (local33 = arg4 - 1; local33 >= 0; local33--) {
			local38 = Static83.anIntArray319[local33];
			if (local38 > 0) {
				@Pc(374) int[] local374 = Static83.anIntArrayArray24[local33];
				for (local46 = 0; local46 < local38; local46++) {
					local50 = local374[local46];
					@Pc(386) byte local386 = this.aByteArray25[local50];
					local69 = Static83.anIntArray323[local386]++;
					Static83.anIntArrayArray23[local386][local69] = local50;
					if (local386 < 10) {
						Static83.anIntArray317[local386] += local33;
					} else if (local386 == 10) {
						Static83.anIntArray314[local69] = local33;
					} else {
						Static83.anIntArray318[local69] = local33;
					}
				}
			}
		}
		local38 = 0;
		if (Static83.anIntArray323[1] > 0 || Static83.anIntArray323[2] > 0) {
			local38 = (Static83.anIntArray317[1] + Static83.anIntArray317[2]) / (Static83.anIntArray323[1] + Static83.anIntArray323[2]);
		}
		local42 = 0;
		if (Static83.anIntArray323[3] > 0 || Static83.anIntArray323[4] > 0) {
			local42 = (Static83.anIntArray317[3] + Static83.anIntArray317[4]) / (Static83.anIntArray323[3] + Static83.anIntArray323[4]);
		}
		local46 = 0;
		if (Static83.anIntArray323[6] > 0 || Static83.anIntArray323[8] > 0) {
			local46 = (Static83.anIntArray317[6] + Static83.anIntArray317[8]) / (Static83.anIntArray323[6] + Static83.anIntArray323[8]);
		}
		local65 = 0;
		local69 = Static83.anIntArray323[10];
		@Pc(519) int[] local519 = Static83.anIntArrayArray23[10];
		@Pc(521) int[] local521 = Static83.anIntArray314;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static83.anIntArray323[11];
			local519 = Static83.anIntArrayArray23[11];
			local521 = Static83.anIntArray318;
		}
		if (local69 > 0) {
			local50 = local521[0];
		} else {
			local50 = -1000;
		}
		for (local81 = 0; local81 < 10; local81++) {
			while (local81 == 0 && local50 > local38) {
				this.method1442(local519[local65++]);
				if (local65 == local69 && local519 != Static83.anIntArrayArray23[11]) {
					local65 = 0;
					local69 = Static83.anIntArray323[11];
					local519 = Static83.anIntArrayArray23[11];
					local521 = Static83.anIntArray318;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 3 && local50 > local42) {
				this.method1442(local519[local65++]);
				if (local65 == local69 && local519 != Static83.anIntArrayArray23[11]) {
					local65 = 0;
					local69 = Static83.anIntArray323[11];
					local519 = Static83.anIntArrayArray23[11];
					local521 = Static83.anIntArray318;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 5 && local50 > local46) {
				this.method1442(local519[local65++]);
				if (local65 == local69 && local519 != Static83.anIntArrayArray23[11]) {
					local65 = 0;
					local69 = Static83.anIntArray323[11];
					local519 = Static83.anIntArrayArray23[11];
					local521 = Static83.anIntArray318;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			local85 = Static83.anIntArray323[local81];
			@Pc(684) int[] local684 = Static83.anIntArrayArray23[local81];
			for (local93 = 0; local93 < local85; local93++) {
				this.method1442(local684[local93]);
			}
		}
		while (local50 != -1000) {
			this.method1442(local519[local65++]);
			if (local65 == local69 && local519 != Static83.anIntArrayArray23[11]) {
				local65 = 0;
				local519 = Static83.anIntArrayArray23[11];
				local69 = Static83.anIntArray323[11];
				local521 = Static83.anIntArray318;
			}
			if (local65 < local69) {
				local50 = local521[local65];
			} else {
				local50 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIII)V")
	private void method1441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			Static83.anInt1784 = 0;
			Static83.anInt1783 = 0;
			Static83.anInt1785 = 0;
			for (local11 = 0; local11 < this.anInt1782; local11++) {
				Static83.anInt1784 += this.anIntArray309[local11];
				Static83.anInt1783 += this.anIntArray305[local11];
				Static83.anInt1785 += this.anIntArray308[local11];
				local3++;
			}
			if (local3 > 0) {
				Static83.anInt1784 = Static83.anInt1784 / local3 + arg1;
				Static83.anInt1783 = Static83.anInt1783 / local3 + arg2;
				Static83.anInt1785 = Static83.anInt1785 / local3 + arg3;
			} else {
				Static83.anInt1784 = arg1;
				Static83.anInt1783 = arg2;
				Static83.anInt1785 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt1782; local3++) {
				this.anIntArray309[local3] += arg1;
				this.anIntArray305[local3] += arg2;
				this.anIntArray308[local3] += arg3;
			}
		} else if (arg0 == 2) {
			for (local3 = 0; local3 < this.anInt1782; local3++) {
				this.anIntArray309[local3] -= Static83.anInt1784;
				this.anIntArray305[local3] -= Static83.anInt1783;
				this.anIntArray308[local3] -= Static83.anInt1785;
				@Pc(143) int local143;
				@Pc(161) int local161;
				if (arg3 != 0) {
					local11 = Class77.anIntArray631[arg3];
					local143 = Class77.anIntArray632[arg3];
					local161 = this.anIntArray305[local3] * local11 + this.anIntArray309[local3] * local143 + 32767 >> 16;
					this.anIntArray305[local3] = this.anIntArray305[local3] * local143 + 32767 - this.anIntArray309[local3] * local11 >> 16;
					this.anIntArray309[local3] = local161;
				}
				if (arg1 != 0) {
					local11 = Class77.anIntArray631[arg1];
					local143 = Class77.anIntArray632[arg1];
					local161 = this.anIntArray305[local3] * local143 + 32767 - this.anIntArray308[local3] * local11 >> 16;
					this.anIntArray308[local3] = this.anIntArray305[local3] * local11 + this.anIntArray308[local3] * local143 + 32767 >> 16;
					this.anIntArray305[local3] = local161;
				}
				if (arg2 != 0) {
					local11 = Class77.anIntArray631[arg2];
					local143 = Class77.anIntArray632[arg2];
					local161 = this.anIntArray308[local3] * local11 + this.anIntArray309[local3] * local143 + 32767 >> 16;
					this.anIntArray308[local3] = this.anIntArray308[local3] * local143 + 32767 - this.anIntArray309[local3] * local11 >> 16;
					this.anIntArray309[local3] = local161;
				}
				this.anIntArray309[local3] += Static83.anInt1784;
				this.anIntArray305[local3] += Static83.anInt1783;
				this.anIntArray308[local3] += Static83.anInt1785;
			}
		} else if (arg0 == 3) {
			for (local3 = 0; local3 < this.anInt1782; local3++) {
				this.anIntArray309[local3] -= Static83.anInt1784;
				this.anIntArray305[local3] -= Static83.anInt1783;
				this.anIntArray308[local3] -= Static83.anInt1785;
				this.anIntArray309[local3] = this.anIntArray309[local3] * arg1 / 128;
				this.anIntArray305[local3] = this.anIntArray305[local3] * arg2 / 128;
				this.anIntArray308[local3] = this.anIntArray308[local3] * arg3 / 128;
				this.anIntArray309[local3] += Static83.anInt1784;
				this.anIntArray305[local3] += Static83.anInt1783;
				this.anIntArray308[local3] += Static83.anInt1785;
			}
		} else if (arg0 == 5) {
			for (local3 = 0; local3 < this.anInt1780; local3++) {
				local11 = (this.aByteArray26[local3] & 0xFF) + arg1 * 8;
				if (local11 < 0) {
					local11 = 0;
				} else if (local11 > 255) {
					local11 = 255;
				}
				this.aByteArray26[local3] = (byte) local11;
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "()V")
	@Override
	public void method1427() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1782; local1++) {
			this.anIntArray309[local1] = -this.anIntArray309[local1];
			this.anIntArray308[local1] = -this.anIntArray308[local1];
		}
		this.aBoolean66 = false;
	}

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V")
	@Override
	public void method1419(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class77.anIntArray631[arg0];
		@Pc(7) int local7 = Class77.anIntArray632[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1782; local9++) {
			@Pc(26) int local26 = this.anIntArray305[local9] * local3 + this.anIntArray309[local9] * local7 >> 16;
			this.anIntArray305[local9] = this.anIntArray305[local9] * local7 - this.anIntArray309[local9] * local3 >> 16;
			this.anIntArray309[local9] = local26;
		}
		this.aBoolean66 = false;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (!this.aBoolean66) {
			this.method1438();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (this.aShort12 * arg2 + this.aShort10 * arg1 >> 16);
		if (local38 <= 50) {
			return;
		}
		@Pc(57) int local57 = local24 + (-this.aShort12 * arg2 + this.aShort14 * arg1 >> 16);
		if (local57 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + this.aShort12 << 9;
		if (local78 / local38 <= Static226.anInt4902) {
			return;
		}
		@Pc(91) int local91 = local71 - this.aShort12 << 9;
		if (local91 / local38 >= Static210.anInt4638) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (this.aShort12 * arg1 + this.aShort10 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static14.anInt3440) {
			return;
		}
		@Pc(146) int local146 = local107 + (-this.aShort12 * arg1 + this.aShort14 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static149.anInt1846) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local57 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt1781 > 0;
		@Pc(172) int local172 = Static163.anInt3760;
		@Pc(174) int local174 = Static163.anInt3759;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Class77.anIntArray631[arg0];
			local178 = Class77.anIntArray632[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(204) int local204;
		@Pc(223) int local223;
		@Pc(208) int local208;
		@Pc(227) int local227;
		if (arg8 > 0L && Static153.aBoolean155 && local57 > 0) {
			if (local71 > 0) {
				local204 = local91 / local38;
				local208 = local78 / local57;
			} else {
				local204 = local91 / local57;
				local208 = local78 / local38;
			}
			if (local107 > 0) {
				local223 = local146 / local38;
				local227 = local123 / local57;
			} else {
				local223 = local146 / local57;
				local227 = local123 / local38;
			}
			if (Static117.anInt2739 >= local204 && Static117.anInt2739 <= local208 && Static62.anInt1227 >= local223 && Static62.anInt1227 <= local227) {
				local204 = 999999;
				local208 = -999999;
				local223 = 999999;
				local227 = -999999;
				@Pc(299) int[] local299 = new int[] { this.aShort8, this.aShort13, this.aShort8, this.aShort13, this.aShort8, this.aShort13, this.aShort8, this.aShort13 };
				@Pc(342) int[] local342 = new int[] { this.aShort11, this.aShort11, this.aShort7, this.aShort7, this.aShort11, this.aShort11, this.aShort7, this.aShort7 };
				@Pc(385) int[] local385 = new int[] { this.aShort14, this.aShort14, this.aShort14, this.aShort14, this.aShort10, this.aShort10, this.aShort10, this.aShort10 };
				for (@Pc(387) int local387 = 0; local387 < 8; local387++) {
					@Pc(392) int local392 = local299[local387];
					@Pc(396) int local396 = local385[local387];
					@Pc(400) int local400 = local342[local387];
					@Pc(412) int local412;
					if (arg0 != 0) {
						local412 = local400 * local176 + local392 * local178 >> 16;
						local400 = local400 * local178 - local392 * local176 >> 16;
						local392 = local412;
					}
					local392 += arg5;
					local396 += arg6;
					local400 += arg7;
					local412 = local400 * arg3 + local392 * arg4 >> 16;
					local400 = local400 * arg4 - local392 * arg3 >> 16;
					local392 = local412;
					local412 = local396 * arg2 - local400 * arg1 >> 16;
					local400 = local396 * arg1 + local400 * arg2 >> 16;
					if (local400 > 0) {
						@Pc(488) int local488 = (local392 << 9) / local400;
						@Pc(494) int local494 = (local412 << 9) / local400;
						if (local488 < local204) {
							local204 = local488;
						}
						if (local488 > local208) {
							local208 = local488;
						}
						if (local494 < local223) {
							local223 = local494;
						}
						if (local494 > local227) {
							local227 = local494;
						}
					}
				}
				if (Static117.anInt2739 >= local204 && Static117.anInt2739 <= local208 && Static62.anInt1227 >= local223 && Static62.anInt1227 <= local227) {
					if (super.aBoolean65) {
						Static170.aLongArray10[Static110.anInt2438++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local204 = 0; local204 < this.anInt1782; local204++) {
			local223 = this.anIntArray309[local204];
			local208 = this.anIntArray305[local204];
			local227 = this.anIntArray308[local204];
			@Pc(574) int local574;
			if (arg0 != 0) {
				local574 = local227 * local176 + local223 * local178 >> 16;
				local227 = local227 * local178 - local223 * local176 >> 16;
				local223 = local574;
			}
			local223 += arg5;
			local208 += arg6;
			local227 += arg7;
			local574 = local227 * arg3 + local223 * arg4 >> 16;
			local227 = local227 * arg4 - local223 * arg3 >> 16;
			local223 = local574;
			local574 = local208 * arg2 - local227 * arg1 >> 16;
			local227 = local208 * arg1 + local227 * arg2 >> 16;
			Static83.anIntArray311[local204] = local227 - local24;
			if (local227 >= 50) {
				Static83.anIntArray322[local204] = local172 + (local223 << 9) / local227;
				Static83.anIntArray312[local204] = local174 + (local574 << 9) / local227;
			} else {
				Static83.anIntArray322[local204] = -5000;
				local154 = true;
			}
			if (local170) {
				Static83.anIntArray316[local204] = local223;
				Static83.anIntArray320[local204] = local574;
				Static83.anIntArray313[local204] = local227;
			}
		}
		try {
			this.method1440(local154, local190, arg8, local24 - local57, local38 - local57 + 2);
		} catch (@Pc(712) Exception local712) {
		}
	}

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "(I)V")
	private void method1442(@OriginalArg(0) int arg0) {
		if (Static83.aBooleanArray55[arg0]) {
			this.method1436(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray299[arg0];
		@Pc(17) int local17 = this.anIntArray307[arg0];
		@Pc(22) int local22 = this.anIntArray304[arg0];
		Static163.aBoolean165 = Static83.aBooleanArray54[arg0];
		if (this.aByteArray26 == null) {
			Static163.anInt3758 = 0;
		} else {
			Static163.anInt3758 = this.aByteArray26[arg0] & 0xFF;
		}
		if (this.aShortArray54 != null && this.aShortArray54[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray27 == null || this.aByteArray27[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray27[arg0] & 0xFF;
				local133 = this.anIntArray300[local128];
				local138 = this.anIntArray302[local128];
				local143 = this.anIntArray301[local128];
			}
			if (this.anIntArray306[arg0] == -1) {
				Static163.method2933(Static83.anIntArray312[local12], Static83.anIntArray312[local17], Static83.anIntArray312[local22], Static83.anIntArray322[local12], Static83.anIntArray322[local17], Static83.anIntArray322[local22], this.anIntArray303[arg0], this.anIntArray303[arg0], this.anIntArray303[arg0], Static83.anIntArray316[local133], Static83.anIntArray316[local138], Static83.anIntArray316[local143], Static83.anIntArray320[local133], Static83.anIntArray320[local138], Static83.anIntArray320[local143], Static83.anIntArray313[local133], Static83.anIntArray313[local138], Static83.anIntArray313[local143], this.aShortArray54[arg0]);
			} else {
				Static163.method2933(Static83.anIntArray312[local12], Static83.anIntArray312[local17], Static83.anIntArray312[local22], Static83.anIntArray322[local12], Static83.anIntArray322[local17], Static83.anIntArray322[local22], this.anIntArray303[arg0], this.anIntArray310[arg0], this.anIntArray306[arg0], Static83.anIntArray316[local133], Static83.anIntArray316[local138], Static83.anIntArray316[local143], Static83.anIntArray320[local133], Static83.anIntArray320[local138], Static83.anIntArray320[local143], Static83.anIntArray313[local133], Static83.anIntArray313[local138], Static83.anIntArray313[local143], this.aShortArray54[arg0]);
			}
		} else if (this.anIntArray306[arg0] == -1) {
			Static163.method2950(Static83.anIntArray312[local12], Static83.anIntArray312[local17], Static83.anIntArray312[local22], Static83.anIntArray322[local12], Static83.anIntArray322[local17], Static83.anIntArray322[local22], Static163.anIntArray630[this.anIntArray303[arg0]]);
		} else {
			Static163.method2943(Static83.anIntArray312[local12], Static83.anIntArray312[local17], Static83.anIntArray312[local22], Static83.anIntArray322[local12], Static83.anIntArray322[local17], Static83.anIntArray322[local22], this.anIntArray303[arg0], this.anIntArray310[arg0], this.anIntArray306[arg0]);
		}
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "()I")
	@Override
	public int method1416() {
		if (!this.aBoolean66) {
			this.method1438();
		}
		return this.aShort13;
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(III)V")
	@Override
	public void method1432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1782; local1++) {
			this.anIntArray309[local1] += arg0;
			this.anIntArray305[local1] += arg1;
			this.anIntArray308[local1] += arg2;
		}
		this.aBoolean66 = false;
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(IIIIIIII)Z")
	private boolean method1443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!qc;)Lclient!qc;")
	public Class5_Sub3 method1444(@OriginalArg(0) Class5_Sub3 arg0) {
		return new Class5_Sub3_Sub1(new Class5_Sub3_Sub1[] { this, (Class5_Sub3_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "()I")
	@Override
	public int method1430() {
		if (!this.aBoolean66) {
			this.method1438();
		}
		return this.aShort12;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II[[I[[IIIIZ)Lclient!hf;")
	public Class5_Sub3_Sub1 method1446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (!this.aBoolean66) {
			this.method1438();
		}
		@Pc(9) int local9 = arg4 + this.aShort8;
		@Pc(14) int local14 = arg4 + this.aShort13;
		@Pc(19) int local19 = arg6 + this.aShort11;
		@Pc(24) int local24 = arg6 + this.aShort7;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local9 < 0 || local14 + 128 >> 7 >= arg2.length || local19 < 0 || local24 + 128 >> 7 >= arg2[0].length)) {
			return this;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return this;
			}
			if (local9 < 0 || local14 + 128 >> 7 >= arg3.length || local19 < 0 || local24 + 128 >> 7 >= arg3[0].length) {
				return this;
			}
		} else {
			local9 >>= 0x7;
			local14 = local14 + 127 >> 7;
			local19 >>= 0x7;
			local24 = local24 + 127 >> 7;
			if (arg2[local9][local19] == arg5 && arg2[local14][local19] == arg5 && arg2[local9][local24] == arg5 && arg2[local14][local24] == arg5) {
				return this;
			}
		}
		@Pc(150) Class5_Sub3_Sub1 local150;
		if (arg7) {
			local150 = new Class5_Sub3_Sub1();
			local150.anInt1782 = this.anInt1782;
			local150.anInt1780 = this.anInt1780;
			local150.anInt1781 = this.anInt1781;
			local150.anIntArray299 = this.anIntArray299;
			local150.anIntArray307 = this.anIntArray307;
			local150.anIntArray304 = this.anIntArray304;
			local150.anIntArray303 = this.anIntArray303;
			local150.anIntArray310 = this.anIntArray310;
			local150.anIntArray306 = this.anIntArray306;
			local150.aByteArray25 = this.aByteArray25;
			local150.aByteArray26 = this.aByteArray26;
			local150.aByteArray27 = this.aByteArray27;
			local150.aShortArray54 = this.aShortArray54;
			local150.aByte9 = this.aByte9;
			local150.anIntArray300 = this.anIntArray300;
			local150.anIntArray302 = this.anIntArray302;
			local150.anIntArray301 = this.anIntArray301;
			local150.anIntArrayArray22 = this.anIntArrayArray22;
			local150.anIntArrayArray21 = this.anIntArrayArray21;
			local150.aBoolean65 = super.aBoolean65;
			if (arg0 == 3) {
				local150.anIntArray309 = Static174.method3166(this.anIntArray309);
				local150.anIntArray305 = Static174.method3166(this.anIntArray305);
				local150.anIntArray308 = Static174.method3166(this.anIntArray308);
			} else {
				local150.anIntArray309 = this.anIntArray309;
				local150.anIntArray305 = new int[local150.anInt1782];
				local150.anIntArray308 = this.anIntArray308;
			}
		} else {
			local150 = this;
		}
		@Pc(273) int local273;
		@Pc(281) int local281;
		@Pc(288) int local288;
		@Pc(292) int local292;
		@Pc(296) int local296;
		@Pc(300) int local300;
		@Pc(304) int local304;
		@Pc(326) int local326;
		@Pc(352) int local352;
		@Pc(364) int local364;
		if (arg0 == 1) {
			for (local273 = 0; local273 < local150.anInt1782; local273++) {
				local281 = this.anIntArray309[local273] + arg4;
				local288 = this.anIntArray308[local273] + arg6;
				local292 = local281 & 0x7F;
				local296 = local288 & 0x7F;
				local300 = local281 >> 7;
				local304 = local288 >> 7;
				local326 = arg2[local300][local304] * (128 - local292) + arg2[local300 + 1][local304] * local292 >> 7;
				local352 = arg2[local300][local304 + 1] * (128 - local292) + arg2[local300 + 1][local304 + 1] * local292 >> 7;
				local364 = local326 * (128 - local296) + local352 * local296 >> 7;
				local150.anIntArray305[local273] = this.anIntArray305[local273] + local364 - arg5;
			}
		} else {
			@Pc(491) int local491;
			if (arg0 == 2) {
				for (local273 = 0; local273 < local150.anInt1782; local273++) {
					local281 = (this.anIntArray305[local273] << 16) / this.aShort14;
					if (local281 < arg1) {
						local288 = this.anIntArray309[local273] + arg4;
						local292 = this.anIntArray308[local273] + arg6;
						local296 = local288 & 0x7F;
						local300 = local292 & 0x7F;
						local304 = local288 >> 7;
						local326 = local292 >> 7;
						local352 = arg2[local304][local326] * (128 - local296) + arg2[local304 + 1][local326] * local296 >> 7;
						local364 = arg2[local304][local326 + 1] * (128 - local296) + arg2[local304 + 1][local326 + 1] * local296 >> 7;
						local491 = local352 * (128 - local300) + local364 * local300 >> 7;
						local150.anIntArray305[local273] = this.anIntArray305[local273] + (local491 - arg5) * (arg1 - local281) / arg1;
					} else {
						local150.anIntArray305[local273] = this.anIntArray305[local273];
					}
				}
			} else if (arg0 == 3) {
				local273 = (arg1 & 0xFF) * 4;
				local281 = (arg1 >> 8 & 0xFF) * 4;
				local150.method1425(arg2, arg4, arg5, arg6, local273, local281);
			} else if (arg0 == 4) {
				local273 = this.aShort10 - this.aShort14;
				for (local281 = 0; local281 < this.anInt1782; local281++) {
					local288 = this.anIntArray309[local281] + arg4;
					local292 = this.anIntArray308[local281] + arg6;
					local296 = local288 & 0x7F;
					local300 = local292 & 0x7F;
					local304 = local288 >> 7;
					local326 = local292 >> 7;
					local352 = arg3[local304][local326] * (128 - local296) + arg3[local304 + 1][local326] * local296 >> 7;
					local364 = arg3[local304][local326 + 1] * (128 - local296) + arg3[local304 + 1][local326 + 1] * local296 >> 7;
					local491 = local352 * (128 - local300) + local364 * local300 >> 7;
					local150.anIntArray305[local281] = this.anIntArray305[local281] + local491 + local273 - arg5;
				}
			} else if (arg0 == 5) {
				local273 = this.aShort10 - this.aShort14;
				for (local281 = 0; local281 < this.anInt1782; local281++) {
					local288 = this.anIntArray309[local281] + arg4;
					local292 = this.anIntArray308[local281] + arg6;
					local296 = local288 & 0x7F;
					local300 = local292 & 0x7F;
					local304 = local288 >> 7;
					local326 = local292 >> 7;
					local352 = arg2[local304][local326] * (128 - local296) + arg2[local304 + 1][local326] * local296 >> 7;
					local364 = arg2[local304][local326 + 1] * (128 - local296) + arg2[local304 + 1][local326 + 1] * local296 >> 7;
					local491 = local352 * (128 - local300) + local364 * local300 >> 7;
					local352 = arg3[local304][local326] * (128 - local296) + arg3[local304 + 1][local326] * local296 >> 7;
					local364 = arg3[local304][local326 + 1] * (128 - local296) + arg3[local304 + 1][local326 + 1] * local296 >> 7;
					@Pc(834) int local834 = local352 * (128 - local300) + local364 * local300 >> 7;
					@Pc(838) int local838 = local491 - local834;
					local150.anIntArray305[local281] = ((this.anIntArray305[local281] << 8) / local273 * local838 >> 8) - (arg5 - local491);
				}
			}
		}
		local150.aBoolean66 = false;
		return local150;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZZ)Lclient!qc;")
	@Override
	public Class5_Sub3 method1417(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (!arg0 && Static83.aByteArray29.length < this.anInt1780) {
			Static83.aByteArray29 = new byte[this.anInt1780 + 100];
		}
		return this.method1437(arg0, Static83.aClass5_Sub3_Sub1_2, Static83.aByteArray29);
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(III)V")
	@Override
	public void method1412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1782; local1++) {
			this.anIntArray309[local1] = this.anIntArray309[local1] * arg0 / 128;
			this.anIntArray305[local1] = this.anIntArray305[local1] * arg1 / 128;
			this.anIntArray308[local1] = this.anIntArray308[local1] * arg2 / 128;
		}
		this.aBoolean66 = false;
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(ZZ)Lclient!qc;")
	@Override
	public Class5_Sub3 method1421(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (!arg0 && Static83.aByteArray28.length < this.anInt1780) {
			Static83.aByteArray28 = new byte[this.anInt1780 + 100];
		}
		return this.method1437(arg0, Static83.aClass5_Sub3_Sub1_1, Static83.aByteArray28);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!oj;IZ)V")
	@Override
	public void method1423(@OriginalArg(0) Class2_Sub3_Sub22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.anIntArrayArray22 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class70 local12 = arg0.aClass70Array1[arg1];
		@Pc(15) Class2_Sub24 local15 = local12.aClass2_Sub24_1;
		Static83.anInt1784 = 0;
		Static83.anInt1783 = 0;
		Static83.anInt1785 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt3200; local23++) {
			@Pc(29) short local29 = local12.aShortArray103[local23];
			if (local12.aShortArray100[local23] != -1) {
				this.method1433(0, local15.anIntArrayArray26[local12.aShortArray100[local23]], 0, 0, 0);
			}
			this.method1433(local15.anIntArray475[local29], local15.anIntArrayArray26[local29], local12.aShortArray94[local23], local12.aShortArray99[local23], local12.aShortArray97[local23]);
		}
		this.aBoolean66 = false;
	}

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "()I")
	@Override
	public int method1426() {
		if (!this.aBoolean66) {
			this.method1438();
		}
		return this.aShort11;
	}
}
