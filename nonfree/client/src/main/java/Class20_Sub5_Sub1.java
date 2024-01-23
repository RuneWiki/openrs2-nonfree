import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class20_Sub5_Sub1 extends Class20_Sub5 {

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "[I")
	private int[] anIntArray206;

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "[B")
	private byte[] aByteArray28;

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "S")
	private short aShort18;

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "[I")
	private int[] anIntArray207;

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "S")
	private short aShort19;

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "[I")
	private int[] anIntArray208;

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "[I")
	private int[] anIntArray209;

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "[I")
	private int[] anIntArray210;

	@OriginalMember(owner = "client!kd", name = "y", descriptor = "[I")
	private int[] anIntArray211;

	@OriginalMember(owner = "client!kd", name = "z", descriptor = "S")
	private short aShort20;

	@OriginalMember(owner = "client!kd", name = "A", descriptor = "[I")
	public int[] anIntArray212;

	@OriginalMember(owner = "client!kd", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!kd", name = "D", descriptor = "[B")
	private byte[] aByteArray29;

	@OriginalMember(owner = "client!kd", name = "E", descriptor = "S")
	private short aShort21;

	@OriginalMember(owner = "client!kd", name = "H", descriptor = "[I")
	private int[] anIntArray213;

	@OriginalMember(owner = "client!kd", name = "I", descriptor = "[I")
	private int[] anIntArray214;

	@OriginalMember(owner = "client!kd", name = "J", descriptor = "S")
	private short aShort22;

	@OriginalMember(owner = "client!kd", name = "K", descriptor = "[I")
	public int[] anIntArray215;

	@OriginalMember(owner = "client!kd", name = "L", descriptor = "S")
	private short aShort23;

	@OriginalMember(owner = "client!kd", name = "M", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!kd", name = "N", descriptor = "[B")
	private byte[] aByteArray30;

	@OriginalMember(owner = "client!kd", name = "O", descriptor = "S")
	private short aShort24;

	@OriginalMember(owner = "client!kd", name = "Q", descriptor = "S")
	private short aShort25;

	@OriginalMember(owner = "client!kd", name = "S", descriptor = "[I")
	private int[] anIntArray216;

	@OriginalMember(owner = "client!kd", name = "T", descriptor = "[I")
	public int[] anIntArray217;

	@OriginalMember(owner = "client!kd", name = "F", descriptor = "B")
	private byte aByte5 = 0;

	@OriginalMember(owner = "client!kd", name = "G", descriptor = "Z")
	public boolean aBoolean96 = false;

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
	private int anInt2162 = 0;

	@OriginalMember(owner = "client!kd", name = "R", descriptor = "I")
	public int anInt2164 = 0;

	@OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
	private int anInt2163 = 0;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
	public Class20_Sub5_Sub1() {
	}

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!ib;IIIII)V")
	public Class20_Sub5_Sub1(@OriginalArg(0) Class20_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method1408();
		arg0.method1420();
		this.anInt2164 = arg0.anInt1862;
		this.anIntArray217 = arg0.anIntArray164;
		this.anIntArray215 = arg0.anIntArray161;
		this.anIntArray212 = arg0.anIntArray157;
		this.anInt2162 = arg0.anInt1860;
		this.anIntArray216 = arg0.anIntArray155;
		this.anIntArray207 = arg0.anIntArray162;
		this.anIntArray214 = arg0.anIntArray163;
		this.aByteArray29 = arg0.aByteArray21;
		this.aByteArray30 = arg0.aByteArray18;
		this.aByte5 = arg0.aByte4;
		this.anIntArrayArray13 = arg0.anIntArrayArray8;
		this.anIntArrayArray14 = arg0.anIntArrayArray9;
		@Pc(87) int local87 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(93) int local93 = arg2 * local87 >> 8;
		this.anIntArray206 = new int[this.anInt2162];
		this.anIntArray209 = new int[this.anInt2162];
		this.anIntArray213 = new int[this.anInt2162];
		@Pc(118) int local118;
		if (arg0.aShortArray18 == null) {
			this.aShortArray33 = null;
		} else {
			this.aShortArray33 = new short[this.anInt2162];
			for (local118 = 0; local118 < this.anInt2162; local118++) {
				@Pc(124) short local124 = arg0.aShortArray18[local118];
				if (local124 != -1 && Static215.anInterface4_3.method2511(local124)) {
					this.aShortArray33[local118] = local124;
				} else {
					this.aShortArray33[local118] = -1;
				}
			}
		}
		@Pc(295) int local295;
		if (arg0.anInt1861 > 0 && arg0.aByteArray22 != null) {
			@Pc(162) int[] local162 = new int[arg0.anInt1861];
			for (@Pc(164) int local164 = 0; local164 < this.anInt2162; local164++) {
				if (arg0.aByteArray22[local164] != -1) {
					local162[arg0.aByteArray22[local164] & 0xFF]++;
				}
			}
			this.anInt2163 = 0;
			for (@Pc(193) int local193 = 0; local193 < arg0.anInt1861; local193++) {
				if (local162[local193] > 0 && arg0.aByteArray14[local193] == 0) {
					this.anInt2163++;
				}
			}
			this.anIntArray208 = new int[this.anInt2163];
			this.anIntArray210 = new int[this.anInt2163];
			this.anIntArray211 = new int[this.anInt2163];
			@Pc(231) int local231 = 0;
			for (@Pc(233) int local233 = 0; local233 < arg0.anInt1861; local233++) {
				if (local162[local233] > 0 && arg0.aByteArray14[local233] == 0) {
					this.anIntArray208[local231] = arg0.aShortArray24[local233] & 0xFFFF;
					this.anIntArray210[local231] = arg0.aShortArray22[local233] & 0xFFFF;
					this.anIntArray211[local231] = arg0.aShortArray25[local233] & 0xFFFF;
					local162[local233] = local231++;
				} else {
					local162[local233] = -1;
				}
			}
			this.aByteArray28 = new byte[this.anInt2162];
			for (local295 = 0; local295 < this.anInt2162; local295++) {
				if (arg0.aByteArray22[local295] == -1) {
					this.aByteArray28[local295] = -1;
				} else {
					this.aByteArray28[local295] = (byte) local162[arg0.aByteArray22[local295] & 0xFF];
					if (this.aByteArray28[local295] == -1 && this.aShortArray33 != null) {
						this.aShortArray33[local295] = -1;
					}
				}
			}
		}
		for (local118 = 0; local118 < this.anInt2162; local118++) {
			@Pc(348) byte local348;
			if (arg0.aByteArray19 == null) {
				local348 = 0;
			} else {
				local348 = arg0.aByteArray19[local118];
			}
			@Pc(359) byte local359;
			if (arg0.aByteArray18 == null) {
				local359 = 0;
			} else {
				local359 = arg0.aByteArray18[local118];
			}
			@Pc(370) short local370;
			if (this.aShortArray33 == null) {
				local370 = -1;
			} else {
				local370 = this.aShortArray33[local118];
			}
			if (local359 == -2) {
				local348 = 3;
			}
			if (local359 == -1) {
				local348 = 2;
			}
			@Pc(417) Class85 local417;
			@Pc(578) Class114 local578;
			if (local370 == -1) {
				if (local348 == 0) {
					@Pc(398) int local398 = arg0.aShortArray23[local118] & 0xFFFF;
					if (arg0.aClass85Array1 == null || arg0.aClass85Array1[this.anIntArray216[local118]] == null) {
						local417 = arg0.aClass85Array2[this.anIntArray216[local118]];
					} else {
						local417 = arg0.aClass85Array1[this.anIntArray216[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt3272 + arg4 * local417.anInt3276 + arg5 * local417.anInt3270) / (local93 * local417.anInt3277);
					this.anIntArray206[local118] = Static108.method1718(local398, local295);
					if (arg0.aClass85Array1 == null || arg0.aClass85Array1[this.anIntArray207[local118]] == null) {
						local417 = arg0.aClass85Array2[this.anIntArray207[local118]];
					} else {
						local417 = arg0.aClass85Array1[this.anIntArray207[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt3272 + arg4 * local417.anInt3276 + arg5 * local417.anInt3270) / (local93 * local417.anInt3277);
					this.anIntArray209[local118] = Static108.method1718(local398, local295);
					if (arg0.aClass85Array1 == null || arg0.aClass85Array1[this.anIntArray214[local118]] == null) {
						local417 = arg0.aClass85Array2[this.anIntArray214[local118]];
					} else {
						local417 = arg0.aClass85Array1[this.anIntArray214[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt3272 + arg4 * local417.anInt3276 + arg5 * local417.anInt3270) / (local93 * local417.anInt3277);
					this.anIntArray213[local118] = Static108.method1718(local398, local295);
				} else if (local348 == 1) {
					local578 = arg0.aClass114Array1[local118];
					local295 = arg1 + (arg3 * local578.anInt4117 + arg4 * local578.anInt4119 + arg5 * local578.anInt4116) / (local93 + local93 / 2);
					this.anIntArray206[local118] = Static108.method1718(arg0.aShortArray23[local118] & 0xFFFF, local295);
					this.anIntArray213[local118] = -1;
				} else if (local348 == 3) {
					this.anIntArray206[local118] = 128;
					this.anIntArray213[local118] = -1;
				} else {
					this.anIntArray213[local118] = -2;
				}
			} else if (local348 == 0) {
				if (arg0.aClass85Array1 == null || arg0.aClass85Array1[this.anIntArray216[local118]] == null) {
					local417 = arg0.aClass85Array2[this.anIntArray216[local118]];
				} else {
					local417 = arg0.aClass85Array1[this.anIntArray216[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt3272 + arg4 * local417.anInt3276 + arg5 * local417.anInt3270) / (local93 * local417.anInt3277);
				this.anIntArray206[local118] = Static108.method1722(local295);
				if (arg0.aClass85Array1 == null || arg0.aClass85Array1[this.anIntArray207[local118]] == null) {
					local417 = arg0.aClass85Array2[this.anIntArray207[local118]];
				} else {
					local417 = arg0.aClass85Array1[this.anIntArray207[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt3272 + arg4 * local417.anInt3276 + arg5 * local417.anInt3270) / (local93 * local417.anInt3277);
				this.anIntArray209[local118] = Static108.method1722(local295);
				if (arg0.aClass85Array1 == null || arg0.aClass85Array1[this.anIntArray214[local118]] == null) {
					local417 = arg0.aClass85Array2[this.anIntArray214[local118]];
				} else {
					local417 = arg0.aClass85Array1[this.anIntArray214[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt3272 + arg4 * local417.anInt3276 + arg5 * local417.anInt3270) / (local93 * local417.anInt3277);
				this.anIntArray213[local118] = Static108.method1722(local295);
			} else if (local348 == 1) {
				local578 = arg0.aClass114Array1[local118];
				local295 = arg1 + (arg3 * local578.anInt4117 + arg4 * local578.anInt4119 + arg5 * local578.anInt4116) / (local93 + local93 / 2);
				this.anIntArray206[local118] = Static108.method1722(local295);
				this.anIntArray213[local118] = -1;
			} else {
				this.anIntArray213[local118] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "([Lclient!kd;I)V")
	private Class20_Sub5_Sub1(@OriginalArg(0) Class20_Sub5_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt2164 = 0;
		this.anInt2162 = 0;
		this.anInt2163 = 0;
		this.aByte5 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class20_Sub5_Sub1 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt2164 += local43.anInt2164;
				this.anInt2162 += local43.anInt2162;
				this.anInt2163 += local43.anInt2163;
				if (local43.aByteArray29 == null) {
					if (this.aByte5 == -1) {
						this.aByte5 = local43.aByte5;
					}
					if (this.aByte5 != local43.aByte5) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local43.aByteArray30 != null;
				local22 |= local43.aShortArray33 != null;
				local24 |= local43.aByteArray28 != null;
			}
		}
		this.anIntArray217 = new int[this.anInt2164];
		this.anIntArray215 = new int[this.anInt2164];
		this.anIntArray212 = new int[this.anInt2164];
		this.anIntArray216 = new int[this.anInt2162];
		this.anIntArray207 = new int[this.anInt2162];
		this.anIntArray214 = new int[this.anInt2162];
		this.anIntArray206 = new int[this.anInt2162];
		this.anIntArray209 = new int[this.anInt2162];
		this.anIntArray213 = new int[this.anInt2162];
		if (local18) {
			this.aByteArray29 = new byte[this.anInt2162];
		}
		if (local20) {
			this.aByteArray30 = new byte[this.anInt2162];
		}
		if (local22) {
			this.aShortArray33 = new short[this.anInt2162];
		}
		if (local24) {
			this.aByteArray28 = new byte[this.anInt2162];
		}
		if (this.anInt2163 > 0) {
			this.anIntArray208 = new int[this.anInt2163];
			this.anIntArray210 = new int[this.anInt2163];
			this.anIntArray211 = new int[this.anInt2163];
		}
		this.anInt2164 = 0;
		this.anInt2162 = 0;
		this.anInt2163 = 0;
		for (@Pc(220) int local220 = 0; local220 < arg1; local220++) {
			@Pc(225) Class20_Sub5_Sub1 local225 = arg0[local220];
			if (local225 != null) {
				for (@Pc(229) int local229 = 0; local229 < local225.anInt2162; local229++) {
					this.anIntArray216[this.anInt2162] = local225.anIntArray216[local229] + this.anInt2164;
					this.anIntArray207[this.anInt2162] = local225.anIntArray207[local229] + this.anInt2164;
					this.anIntArray214[this.anInt2162] = local225.anIntArray214[local229] + this.anInt2164;
					this.anIntArray206[this.anInt2162] = local225.anIntArray206[local229];
					this.anIntArray209[this.anInt2162] = local225.anIntArray209[local229];
					this.anIntArray213[this.anInt2162] = local225.anIntArray213[local229];
					if (local18) {
						if (local225.aByteArray29 == null) {
							this.aByteArray29[this.anInt2162] = local225.aByte5;
						} else {
							this.aByteArray29[this.anInt2162] = local225.aByteArray29[local229];
						}
					}
					if (local20 && local225.aByteArray30 != null) {
						this.aByteArray30[this.anInt2162] = local225.aByteArray30[local229];
					}
					if (local22) {
						if (local225.aShortArray33 == null) {
							this.aShortArray33[this.anInt2162] = -1;
						} else {
							this.aShortArray33[this.anInt2162] = local225.aShortArray33[local229];
						}
					}
					if (local24) {
						if (local225.aByteArray28 == null || local225.aByteArray28[local229] == -1) {
							this.aByteArray28[this.anInt2162] = -1;
						} else {
							this.aByteArray28[this.anInt2162] = (byte) (local225.aByteArray28[local229] + this.anInt2163);
						}
					}
					this.anInt2162++;
				}
				for (@Pc(394) int local394 = 0; local394 < local225.anInt2163; local394++) {
					this.anIntArray208[this.anInt2163] = local225.anIntArray208[local394] + this.anInt2164;
					this.anIntArray210[this.anInt2163] = local225.anIntArray210[local394] + this.anInt2164;
					this.anIntArray211[this.anInt2163] = local225.anIntArray211[local394] + this.anInt2164;
					this.anInt2163++;
				}
				for (@Pc(444) int local444 = 0; local444 < local225.anInt2164; local444++) {
					this.anIntArray217[this.anInt2164] = local225.anIntArray217[local444];
					this.anIntArray215[this.anInt2164] = local225.anIntArray215[local444];
					this.anIntArray212[this.anInt2164] = local225.anIntArray212[local444];
					this.anInt2164++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II[[I[[IIIIZ)Lclient!kd;")
	public Class20_Sub5_Sub1 method1710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (!this.aBoolean96) {
			this.method1715();
		}
		@Pc(9) int local9 = arg4 + this.aShort24;
		@Pc(14) int local14 = arg4 + this.aShort21;
		@Pc(19) int local19 = arg6 + this.aShort20;
		@Pc(24) int local24 = arg6 + this.aShort25;
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
		@Pc(150) Class20_Sub5_Sub1 local150;
		if (arg7) {
			local150 = new Class20_Sub5_Sub1();
			local150.anInt2164 = this.anInt2164;
			local150.anInt2162 = this.anInt2162;
			local150.anInt2163 = this.anInt2163;
			local150.anIntArray216 = this.anIntArray216;
			local150.anIntArray207 = this.anIntArray207;
			local150.anIntArray214 = this.anIntArray214;
			local150.anIntArray206 = this.anIntArray206;
			local150.anIntArray209 = this.anIntArray209;
			local150.anIntArray213 = this.anIntArray213;
			local150.aByteArray29 = this.aByteArray29;
			local150.aByteArray30 = this.aByteArray30;
			local150.aByteArray28 = this.aByteArray28;
			local150.aShortArray33 = this.aShortArray33;
			local150.aByte5 = this.aByte5;
			local150.anIntArray208 = this.anIntArray208;
			local150.anIntArray210 = this.anIntArray210;
			local150.anIntArray211 = this.anIntArray211;
			local150.anIntArrayArray13 = this.anIntArrayArray13;
			local150.anIntArrayArray14 = this.anIntArrayArray14;
			local150.aBoolean95 = super.aBoolean95;
			if (arg0 == 3) {
				local150.anIntArray217 = Static183.method3007(this.anIntArray217);
				local150.anIntArray215 = Static183.method3007(this.anIntArray215);
				local150.anIntArray212 = Static183.method3007(this.anIntArray212);
			} else {
				local150.anIntArray217 = this.anIntArray217;
				local150.anIntArray215 = new int[local150.anInt2164];
				local150.anIntArray212 = this.anIntArray212;
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
			for (local273 = 0; local273 < local150.anInt2164; local273++) {
				local281 = this.anIntArray217[local273] + arg4;
				local288 = this.anIntArray212[local273] + arg6;
				local292 = local281 & 0x7F;
				local296 = local288 & 0x7F;
				local300 = local281 >> 7;
				local304 = local288 >> 7;
				local326 = arg2[local300][local304] * (128 - local292) + arg2[local300 + 1][local304] * local292 >> 7;
				local352 = arg2[local300][local304 + 1] * (128 - local292) + arg2[local300 + 1][local304 + 1] * local292 >> 7;
				local364 = local326 * (128 - local296) + local352 * local296 >> 7;
				local150.anIntArray215[local273] = this.anIntArray215[local273] + local364 - arg5;
			}
		} else {
			@Pc(491) int local491;
			if (arg0 == 2) {
				for (local273 = 0; local273 < local150.anInt2164; local273++) {
					local281 = (this.anIntArray215[local273] << 16) / this.aShort19;
					if (local281 < arg1) {
						local288 = this.anIntArray217[local273] + arg4;
						local292 = this.anIntArray212[local273] + arg6;
						local296 = local288 & 0x7F;
						local300 = local292 & 0x7F;
						local304 = local288 >> 7;
						local326 = local292 >> 7;
						local352 = arg2[local304][local326] * (128 - local296) + arg2[local304 + 1][local326] * local296 >> 7;
						local364 = arg2[local304][local326 + 1] * (128 - local296) + arg2[local304 + 1][local326 + 1] * local296 >> 7;
						local491 = local352 * (128 - local300) + local364 * local300 >> 7;
						local150.anIntArray215[local273] = this.anIntArray215[local273] + (local491 - arg5) * (arg1 - local281) / arg1;
					} else {
						local150.anIntArray215[local273] = this.anIntArray215[local273];
					}
				}
			} else if (arg0 == 3) {
				local273 = (arg1 & 0xFF) * 4;
				local281 = (arg1 >> 8 & 0xFF) * 4;
				local150.method1691(arg2, arg4, arg5, arg6, local273, local281);
			} else if (arg0 == 4) {
				local273 = this.aShort22 - this.aShort19;
				for (local281 = 0; local281 < this.anInt2164; local281++) {
					local288 = this.anIntArray217[local281] + arg4;
					local292 = this.anIntArray212[local281] + arg6;
					local296 = local288 & 0x7F;
					local300 = local292 & 0x7F;
					local304 = local288 >> 7;
					local326 = local292 >> 7;
					local352 = arg3[local304][local326] * (128 - local296) + arg3[local304 + 1][local326] * local296 >> 7;
					local364 = arg3[local304][local326 + 1] * (128 - local296) + arg3[local304 + 1][local326 + 1] * local296 >> 7;
					local491 = local352 * (128 - local300) + local364 * local300 >> 7;
					local150.anIntArray215[local281] = this.anIntArray215[local281] + local491 + local273 - arg5;
				}
			} else if (arg0 == 5) {
				local273 = this.aShort22 - this.aShort19;
				for (local281 = 0; local281 < this.anInt2164; local281++) {
					local288 = this.anIntArray217[local281] + arg4;
					local292 = this.anIntArray212[local281] + arg6;
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
					local150.anIntArray215[local281] = ((this.anIntArray215[local281] << 8) / local273 * local838 >> 8) - (arg5 - local491);
				}
			}
		}
		local150.aBoolean96 = false;
		return local150;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(IIIIIIII)V")
	public void method1711(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (!this.aBoolean96) {
				this.method1715();
			}
			@Pc(6) int local6 = Static215.anInt4264;
			@Pc(8) int local8 = Static215.anInt4266;
			@Pc(12) int local12 = Class120.anIntArray491[0];
			@Pc(16) int local16 = Class120.anIntArray492[0];
			@Pc(20) int local20 = Class120.anIntArray491[arg0];
			@Pc(24) int local24 = Class120.anIntArray492[arg0];
			@Pc(28) int local28 = Class120.anIntArray491[arg1];
			@Pc(32) int local32 = Class120.anIntArray492[arg1];
			@Pc(36) int local36 = Class120.anIntArray491[arg2];
			@Pc(40) int local40 = Class120.anIntArray492[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt2164; local52++) {
				@Pc(58) int local58 = this.anIntArray217[local52];
				@Pc(63) int local63 = this.anIntArray215[local52];
				@Pc(68) int local68 = this.anIntArray212[local52];
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
				Static108.anIntArray221[local52] = local68 - local50;
				Static108.anIntArray218[local52] = local6 + (local58 << 9) / arg6;
				Static108.anIntArray219[local52] = local8 + (local80 << 9) / arg6;
				if (this.anInt2163 > 0) {
					Static108.anIntArray227[local52] = local58;
					Static108.anIntArray226[local52] = local80;
					Static108.anIntArray224[local52] = local68;
				}
			}
			this.method1712(false, false, 0L, this.aShort23, this.aShort23 << 1);
		} catch (@Pc(233) RuntimeException local233) {
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZZJII)V")
	private void method1712(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= 1600) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			Static108.anIntArray223[local5] = 0;
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
		for (@Pc(16) int local16 = 0; local16 < this.anInt2162; local16++) {
			if (this.anIntArray213[local16] != -2) {
				local28 = this.anIntArray216[local16];
				local33 = this.anIntArray207[local16];
				local38 = this.anIntArray214[local16];
				local42 = Static108.anIntArray218[local28];
				local46 = Static108.anIntArray218[local33];
				local50 = Static108.anIntArray218[local38];
				if (arg0 && (local42 == -5000 || local46 == -5000 || local50 == -5000)) {
					local65 = Static108.anIntArray227[local28];
					local69 = Static108.anIntArray227[local33];
					@Pc(73) int local73 = Static108.anIntArray227[local38];
					@Pc(77) int local77 = Static108.anIntArray226[local28];
					local81 = Static108.anIntArray226[local33];
					local85 = Static108.anIntArray226[local38];
					@Pc(89) int local89 = Static108.anIntArray224[local28];
					local93 = Static108.anIntArray224[local33];
					@Pc(97) int local97 = Static108.anIntArray224[local38];
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
						Static108.aBooleanArray6[local16] = true;
						@Pc(177) int local177 = (Static108.anIntArray221[local28] + Static108.anIntArray221[local33] + Static108.anIntArray221[local38]) / 3 + arg3;
						Static108.anIntArrayArray15[local177][Static108.anIntArray223[local177]++] = local16;
					}
				} else {
					if (arg1 && this.method1719(Static230.anInt3194 + Static215.anInt4264, Static194.anInt3947 + Static215.anInt4266, Static108.anIntArray219[local28], Static108.anIntArray219[local33], Static108.anIntArray219[local38], local42, local46, local50)) {
						Static75.aLongArray4[Static76.anInt1533++] = arg2;
						arg1 = false;
					}
					if ((local42 - local46) * (Static108.anIntArray219[local38] - Static108.anIntArray219[local33]) - (Static108.anIntArray219[local28] - Static108.anIntArray219[local33]) * (local50 - local46) > 0) {
						Static108.aBooleanArray6[local16] = false;
						if (local42 >= 0 && local46 >= 0 && local50 >= 0 && local42 <= Static215.anInt4267 && local46 <= Static215.anInt4267 && local50 <= Static215.anInt4267) {
							Static108.aBooleanArray7[local16] = false;
						} else {
							Static108.aBooleanArray7[local16] = true;
						}
						local65 = (Static108.anIntArray221[local28] + Static108.anIntArray221[local33] + Static108.anIntArray221[local38]) / 3 + arg3;
						Static108.anIntArrayArray15[local65][Static108.anIntArray223[local65]++] = local16;
					}
				}
			}
		}
		if (this.aByteArray29 == null) {
			for (local28 = arg4 - 1; local28 >= 0; local28--) {
				local33 = Static108.anIntArray223[local28];
				if (local33 > 0) {
					@Pc(328) int[] local328 = Static108.anIntArrayArray15[local28];
					for (local42 = 0; local42 < local33; local42++) {
						this.method1721(local328[local42]);
					}
				}
			}
			return;
		}
		for (local28 = 0; local28 < 12; local28++) {
			Static108.anIntArray228[local28] = 0;
			Static108.anIntArray230[local28] = 0;
		}
		for (local33 = arg4 - 1; local33 >= 0; local33--) {
			local38 = Static108.anIntArray223[local33];
			if (local38 > 0) {
				@Pc(374) int[] local374 = Static108.anIntArrayArray15[local33];
				for (local46 = 0; local46 < local38; local46++) {
					local50 = local374[local46];
					@Pc(386) byte local386 = this.aByteArray29[local50];
					local69 = Static108.anIntArray228[local386]++;
					Static108.anIntArrayArray16[local386][local69] = local50;
					if (local386 < 10) {
						Static108.anIntArray230[local386] += local33;
					} else if (local386 == 10) {
						Static108.anIntArray225[local69] = local33;
					} else {
						Static108.anIntArray231[local69] = local33;
					}
				}
			}
		}
		local38 = 0;
		if (Static108.anIntArray228[1] > 0 || Static108.anIntArray228[2] > 0) {
			local38 = (Static108.anIntArray230[1] + Static108.anIntArray230[2]) / (Static108.anIntArray228[1] + Static108.anIntArray228[2]);
		}
		local42 = 0;
		if (Static108.anIntArray228[3] > 0 || Static108.anIntArray228[4] > 0) {
			local42 = (Static108.anIntArray230[3] + Static108.anIntArray230[4]) / (Static108.anIntArray228[3] + Static108.anIntArray228[4]);
		}
		local46 = 0;
		if (Static108.anIntArray228[6] > 0 || Static108.anIntArray228[8] > 0) {
			local46 = (Static108.anIntArray230[6] + Static108.anIntArray230[8]) / (Static108.anIntArray228[6] + Static108.anIntArray228[8]);
		}
		local65 = 0;
		local69 = Static108.anIntArray228[10];
		@Pc(519) int[] local519 = Static108.anIntArrayArray16[10];
		@Pc(521) int[] local521 = Static108.anIntArray225;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static108.anIntArray228[11];
			local519 = Static108.anIntArrayArray16[11];
			local521 = Static108.anIntArray231;
		}
		if (local69 > 0) {
			local50 = local521[0];
		} else {
			local50 = -1000;
		}
		for (local81 = 0; local81 < 10; local81++) {
			while (local81 == 0 && local50 > local38) {
				this.method1721(local519[local65++]);
				if (local65 == local69 && local519 != Static108.anIntArrayArray16[11]) {
					local65 = 0;
					local69 = Static108.anIntArray228[11];
					local519 = Static108.anIntArrayArray16[11];
					local521 = Static108.anIntArray231;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 3 && local50 > local42) {
				this.method1721(local519[local65++]);
				if (local65 == local69 && local519 != Static108.anIntArrayArray16[11]) {
					local65 = 0;
					local69 = Static108.anIntArray228[11];
					local519 = Static108.anIntArrayArray16[11];
					local521 = Static108.anIntArray231;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 5 && local50 > local46) {
				this.method1721(local519[local65++]);
				if (local65 == local69 && local519 != Static108.anIntArrayArray16[11]) {
					local65 = 0;
					local69 = Static108.anIntArray228[11];
					local519 = Static108.anIntArrayArray16[11];
					local521 = Static108.anIntArray231;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			local85 = Static108.anIntArray228[local81];
			@Pc(684) int[] local684 = Static108.anIntArrayArray16[local81];
			for (local93 = 0; local93 < local85; local93++) {
				this.method1721(local684[local93]);
			}
		}
		while (local50 != -1000) {
			this.method1721(local519[local65++]);
			if (local65 == local69 && local519 != Static108.anIntArrayArray16[11]) {
				local65 = 0;
				local519 = Static108.anIntArrayArray16[11];
				local69 = Static108.anIntArray228[11];
				local521 = Static108.anIntArray231;
			}
			if (local65 < local69) {
				local50 = local521[local65];
			} else {
				local50 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZZ)Lclient!ra;")
	@Override
	public Class20_Sub5 method1705(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (!arg0 && Static108.aByteArray31.length < this.anInt2162) {
			Static108.aByteArray31 = new byte[this.anInt2162 + 100];
		}
		return this.method1716(arg0, Static108.aClass20_Sub5_Sub1_1, Static108.aByteArray31);
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "()I")
	@Override
	public int method1701() {
		if (!this.aBoolean96) {
			this.method1715();
		}
		return this.aShort18;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[IIII)V")
	private void method1713(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static108.anInt2167 = 0;
			Static108.anInt2166 = 0;
			Static108.anInt2165 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray13.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray13[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static108.anInt2167 += this.anIntArray217[local36];
						Static108.anInt2166 += this.anIntArray215[local36];
						Static108.anInt2165 += this.anIntArray212[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static108.anInt2167 = Static108.anInt2167 / local6 + arg2;
				Static108.anInt2166 = Static108.anInt2166 / local6 + arg3;
				Static108.anInt2165 = Static108.anInt2165 / local6 + arg4;
			} else {
				Static108.anInt2167 = arg2;
				Static108.anInt2166 = arg3;
				Static108.anInt2165 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray13.length) {
					local115 = this.anIntArrayArray13[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray217[local31] += arg2;
						this.anIntArray215[local31] += arg3;
						this.anIntArray212[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray13.length) {
					local115 = this.anIntArrayArray13[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray217[local31] -= Static108.anInt2167;
						this.anIntArray215[local31] -= Static108.anInt2166;
						this.anIntArray212[local31] -= Static108.anInt2165;
						@Pc(217) int local217;
						@Pc(235) int local235;
						if (arg4 != 0) {
							local36 = Class120.anIntArray491[arg4];
							local217 = Class120.anIntArray492[arg4];
							local235 = this.anIntArray215[local31] * local36 + this.anIntArray217[local31] * local217 + 32767 >> 16;
							this.anIntArray215[local31] = this.anIntArray215[local31] * local217 + 32767 - this.anIntArray217[local31] * local36 >> 16;
							this.anIntArray217[local31] = local235;
						}
						if (arg2 != 0) {
							local36 = Class120.anIntArray491[arg2];
							local217 = Class120.anIntArray492[arg2];
							local235 = this.anIntArray215[local31] * local217 + 32767 - this.anIntArray212[local31] * local36 >> 16;
							this.anIntArray212[local31] = this.anIntArray215[local31] * local36 + this.anIntArray212[local31] * local217 + 32767 >> 16;
							this.anIntArray215[local31] = local235;
						}
						if (arg3 != 0) {
							local36 = Class120.anIntArray491[arg3];
							local217 = Class120.anIntArray492[arg3];
							local235 = this.anIntArray212[local31] * local36 + this.anIntArray217[local31] * local217 + 32767 >> 16;
							this.anIntArray212[local31] = this.anIntArray212[local31] * local217 + 32767 - this.anIntArray217[local31] * local36 >> 16;
							this.anIntArray217[local31] = local235;
						}
						this.anIntArray217[local31] += Static108.anInt2167;
						this.anIntArray215[local31] += Static108.anInt2166;
						this.anIntArray212[local31] += Static108.anInt2165;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray13.length) {
					local115 = this.anIntArrayArray13[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray217[local31] -= Static108.anInt2167;
						this.anIntArray215[local31] -= Static108.anInt2166;
						this.anIntArray212[local31] -= Static108.anInt2165;
						this.anIntArray217[local31] = this.anIntArray217[local31] * arg2 / 128;
						this.anIntArray215[local31] = this.anIntArray215[local31] * arg3 / 128;
						this.anIntArray212[local31] = this.anIntArray212[local31] * arg4 / 128;
						this.anIntArray217[local31] += Static108.anInt2167;
						this.anIntArray215[local31] += Static108.anInt2166;
						this.anIntArray212[local31] += Static108.anInt2165;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray14 != null && this.aByteArray30 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray14.length) {
					local115 = this.anIntArrayArray14[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray30[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray30[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIII)V")
	private void method1714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			Static108.anInt2167 = 0;
			Static108.anInt2166 = 0;
			Static108.anInt2165 = 0;
			for (local11 = 0; local11 < this.anInt2164; local11++) {
				Static108.anInt2167 += this.anIntArray217[local11];
				Static108.anInt2166 += this.anIntArray215[local11];
				Static108.anInt2165 += this.anIntArray212[local11];
				local3++;
			}
			if (local3 > 0) {
				Static108.anInt2167 = Static108.anInt2167 / local3 + arg1;
				Static108.anInt2166 = Static108.anInt2166 / local3 + arg2;
				Static108.anInt2165 = Static108.anInt2165 / local3 + arg3;
			} else {
				Static108.anInt2167 = arg1;
				Static108.anInt2166 = arg2;
				Static108.anInt2165 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt2164; local3++) {
				this.anIntArray217[local3] += arg1;
				this.anIntArray215[local3] += arg2;
				this.anIntArray212[local3] += arg3;
			}
		} else if (arg0 == 2) {
			for (local3 = 0; local3 < this.anInt2164; local3++) {
				this.anIntArray217[local3] -= Static108.anInt2167;
				this.anIntArray215[local3] -= Static108.anInt2166;
				this.anIntArray212[local3] -= Static108.anInt2165;
				@Pc(143) int local143;
				@Pc(161) int local161;
				if (arg3 != 0) {
					local11 = Class120.anIntArray491[arg3];
					local143 = Class120.anIntArray492[arg3];
					local161 = this.anIntArray215[local3] * local11 + this.anIntArray217[local3] * local143 + 32767 >> 16;
					this.anIntArray215[local3] = this.anIntArray215[local3] * local143 + 32767 - this.anIntArray217[local3] * local11 >> 16;
					this.anIntArray217[local3] = local161;
				}
				if (arg1 != 0) {
					local11 = Class120.anIntArray491[arg1];
					local143 = Class120.anIntArray492[arg1];
					local161 = this.anIntArray215[local3] * local143 + 32767 - this.anIntArray212[local3] * local11 >> 16;
					this.anIntArray212[local3] = this.anIntArray215[local3] * local11 + this.anIntArray212[local3] * local143 + 32767 >> 16;
					this.anIntArray215[local3] = local161;
				}
				if (arg2 != 0) {
					local11 = Class120.anIntArray491[arg2];
					local143 = Class120.anIntArray492[arg2];
					local161 = this.anIntArray212[local3] * local11 + this.anIntArray217[local3] * local143 + 32767 >> 16;
					this.anIntArray212[local3] = this.anIntArray212[local3] * local143 + 32767 - this.anIntArray217[local3] * local11 >> 16;
					this.anIntArray217[local3] = local161;
				}
				this.anIntArray217[local3] += Static108.anInt2167;
				this.anIntArray215[local3] += Static108.anInt2166;
				this.anIntArray212[local3] += Static108.anInt2165;
			}
		} else if (arg0 == 3) {
			for (local3 = 0; local3 < this.anInt2164; local3++) {
				this.anIntArray217[local3] -= Static108.anInt2167;
				this.anIntArray215[local3] -= Static108.anInt2166;
				this.anIntArray212[local3] -= Static108.anInt2165;
				this.anIntArray217[local3] = this.anIntArray217[local3] * arg1 / 128;
				this.anIntArray215[local3] = this.anIntArray215[local3] * arg2 / 128;
				this.anIntArray212[local3] = this.anIntArray212[local3] * arg3 / 128;
				this.anIntArray217[local3] += Static108.anInt2167;
				this.anIntArray215[local3] += Static108.anInt2166;
				this.anIntArray212[local3] += Static108.anInt2165;
			}
		} else if (arg0 == 5) {
			for (local3 = 0; local3 < this.anInt2162; local3++) {
				local11 = (this.aByteArray30[local3] & 0xFF) + arg1 * 8;
				if (local11 < 0) {
					local11 = 0;
				} else if (local11 > 255) {
					local11 = 255;
				}
				this.aByteArray30[local3] = (byte) local11;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method1694(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (!this.aBoolean96) {
				this.method1715();
			}
			@Pc(6) int local6 = Static215.anInt4264;
			@Pc(8) int local8 = Static215.anInt4266;
			@Pc(12) int local12 = Class120.anIntArray491[0];
			@Pc(16) int local16 = Class120.anIntArray492[0];
			@Pc(20) int local20 = Class120.anIntArray491[arg0];
			@Pc(24) int local24 = Class120.anIntArray492[arg0];
			@Pc(28) int local28 = Class120.anIntArray491[arg1];
			@Pc(32) int local32 = Class120.anIntArray492[arg1];
			@Pc(36) int local36 = Class120.anIntArray491[arg2];
			@Pc(40) int local40 = Class120.anIntArray492[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt2164; local52++) {
				@Pc(58) int local58 = this.anIntArray217[local52];
				@Pc(63) int local63 = this.anIntArray215[local52];
				@Pc(68) int local68 = this.anIntArray212[local52];
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
				Static108.anIntArray221[local52] = local68 - local50;
				Static108.anIntArray218[local52] = local6 + (local58 << 9) / local68;
				Static108.anIntArray219[local52] = local8 + (local80 << 9) / local68;
				if (this.anInt2163 > 0) {
					Static108.anIntArray227[local52] = local58;
					Static108.anIntArray226[local52] = local80;
					Static108.anIntArray224[local52] = local68;
				}
			}
			this.method1712(false, false, 0L, this.aShort23, this.aShort23 << 1);
		} catch (@Pc(233) RuntimeException local233) {
		}
	}

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "()V")
	private void method1715() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt2164; local17++) {
			@Pc(23) int local23 = this.anIntArray217[local17];
			@Pc(28) int local28 = this.anIntArray215[local17];
			@Pc(33) int local33 = this.anIntArray212[local17];
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
			local71 += local28 * local28;
			if (local71 > local15) {
				local15 = local71;
			}
		}
		this.aShort24 = (short) local1;
		this.aShort21 = (short) local7;
		this.aShort19 = (short) local3;
		this.aShort22 = (short) local9;
		this.aShort20 = (short) local5;
		this.aShort25 = (short) local11;
		this.aShort18 = (short) (Math.sqrt((double) local13) + 0.99D);
		this.aShort23 = (short) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean96 = true;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "()I")
	@Override
	public int method3494() {
		if (!this.aBoolean96) {
			this.method1715();
		}
		return this.aShort19;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (!this.aBoolean96) {
			this.method1715();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (this.aShort18 * arg2 + this.aShort22 * arg1 >> 16);
		if (local38 <= 50) {
			return;
		}
		@Pc(57) int local57 = local24 + (-this.aShort18 * arg2 + this.aShort19 * arg1 >> 16);
		if (local57 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + this.aShort18 << 9;
		if (local78 / local38 <= Static16.anInt304) {
			return;
		}
		@Pc(91) int local91 = local71 - this.aShort18 << 9;
		if (local91 / local38 >= Static73.anInt3193) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (this.aShort18 * arg1 + this.aShort22 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static62.anInt1230) {
			return;
		}
		@Pc(146) int local146 = local107 + (-this.aShort18 * arg1 + this.aShort19 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static138.anInt2807) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local57 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt2163 > 0;
		@Pc(172) int local172 = Static215.anInt4264;
		@Pc(174) int local174 = Static215.anInt4266;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Class120.anIntArray491[arg0];
			local178 = Class120.anIntArray492[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(204) int local204;
		@Pc(223) int local223;
		@Pc(208) int local208;
		@Pc(227) int local227;
		if (arg8 > 0L && Static63.aBoolean64 && local57 > 0) {
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
			if (Static230.anInt3194 >= local204 && Static230.anInt3194 <= local208 && Static194.anInt3947 >= local223 && Static194.anInt3947 <= local227) {
				local204 = 999999;
				local208 = -999999;
				local223 = 999999;
				local227 = -999999;
				@Pc(299) int[] local299 = new int[] { this.aShort24, this.aShort21, this.aShort24, this.aShort21, this.aShort24, this.aShort21, this.aShort24, this.aShort21 };
				@Pc(342) int[] local342 = new int[] { this.aShort20, this.aShort20, this.aShort25, this.aShort25, this.aShort20, this.aShort20, this.aShort25, this.aShort25 };
				@Pc(385) int[] local385 = new int[] { this.aShort19, this.aShort19, this.aShort19, this.aShort19, this.aShort22, this.aShort22, this.aShort22, this.aShort22 };
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
				if (Static230.anInt3194 >= local204 && Static230.anInt3194 <= local208 && Static194.anInt3947 >= local223 && Static194.anInt3947 <= local227) {
					if (super.aBoolean95) {
						Static75.aLongArray4[Static76.anInt1533++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local204 = 0; local204 < this.anInt2164; local204++) {
			local223 = this.anIntArray217[local204];
			local208 = this.anIntArray215[local204];
			local227 = this.anIntArray212[local204];
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
			Static108.anIntArray221[local204] = local227 - local24;
			if (local227 >= 50) {
				Static108.anIntArray218[local204] = local172 + (local223 << 9) / local227;
				Static108.anIntArray219[local204] = local174 + (local574 << 9) / local227;
			} else {
				Static108.anIntArray218[local204] = -5000;
				local154 = true;
			}
			if (local170) {
				Static108.anIntArray227[local204] = local223;
				Static108.anIntArray226[local204] = local574;
				Static108.anIntArray224[local204] = local227;
			}
		}
		try {
			this.method1712(local154, local190, arg8, local24 - local57, local38 - local57 + 2);
		} catch (@Pc(712) Exception local712) {
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZLclient!kd;[B)Lclient!ra;")
	private Class20_Sub5 method1716(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class20_Sub5_Sub1 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt2164 = this.anInt2164;
		arg1.anInt2162 = this.anInt2162;
		arg1.anInt2163 = this.anInt2163;
		if (arg1.anIntArray217 == null || arg1.anIntArray217.length < this.anInt2164) {
			arg1.anIntArray217 = new int[this.anInt2164 + 100];
			arg1.anIntArray215 = new int[this.anInt2164 + 100];
			arg1.anIntArray212 = new int[this.anInt2164 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt2164; local43++) {
			arg1.anIntArray217[local43] = this.anIntArray217[local43];
			arg1.anIntArray215[local43] = this.anIntArray215[local43];
			arg1.anIntArray212[local43] = this.anIntArray212[local43];
		}
		if (arg0) {
			arg1.aByteArray30 = this.aByteArray30;
		} else {
			arg1.aByteArray30 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray30 == null) {
				for (local88 = 0; local88 < this.anInt2162; local88++) {
					arg1.aByteArray30[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt2162; local88++) {
					arg1.aByteArray30[local88] = this.aByteArray30[local88];
				}
			}
		}
		arg1.anIntArray216 = this.anIntArray216;
		arg1.anIntArray207 = this.anIntArray207;
		arg1.anIntArray214 = this.anIntArray214;
		arg1.anIntArray206 = this.anIntArray206;
		arg1.anIntArray209 = this.anIntArray209;
		arg1.anIntArray213 = this.anIntArray213;
		arg1.aByteArray29 = this.aByteArray29;
		arg1.aByteArray28 = this.aByteArray28;
		arg1.aShortArray33 = this.aShortArray33;
		arg1.aByte5 = this.aByte5;
		arg1.anIntArray208 = this.anIntArray208;
		arg1.anIntArray210 = this.anIntArray210;
		arg1.anIntArray211 = this.anIntArray211;
		arg1.anIntArrayArray13 = this.anIntArrayArray13;
		arg1.anIntArrayArray14 = this.anIntArrayArray14;
		arg1.aBoolean95 = super.aBoolean95;
		arg1.aBoolean96 = false;
		return arg1;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!ra;)Lclient!ra;")
	public Class20_Sub5 method1717(@OriginalArg(0) Class20_Sub5 arg0) {
		return new Class20_Sub5_Sub1(new Class20_Sub5_Sub1[] { this, (Class20_Sub5_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "()V")
	@Override
	public void method1709() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2164; local1++) {
			@Pc(7) int local7 = this.anIntArray217[local1];
			this.anIntArray217[local1] = this.anIntArray212[local1];
			this.anIntArray212[local1] = -local7;
		}
		this.aBoolean96 = false;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(IIIIIIII)Z")
	private boolean method1719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!ph;IZ)V")
	@Override
	public void method1699(@OriginalArg(0) Class1_Sub1_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.anIntArrayArray13 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class89 local12 = arg0.aClass89Array1[arg1];
		@Pc(15) Class1_Sub28 local15 = local12.aClass1_Sub28_1;
		Static108.anInt2167 = 0;
		Static108.anInt2166 = 0;
		Static108.anInt2165 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt3424; local23++) {
			@Pc(29) short local29 = local12.aShortArray48[local23];
			if (local12.aShortArray53[local23] != -1) {
				this.method1713(0, local15.anIntArrayArray34[local12.aShortArray53[local23]], 0, 0, 0);
			}
			this.method1713(local15.anIntArray483[local29], local15.anIntArrayArray34[local29], local12.aShortArray49[local23], local12.aShortArray50[local23], local12.aShortArray52[local23]);
		}
		this.aBoolean96 = false;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "()V")
	@Override
	public void method1692() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2164; local1++) {
			this.anIntArray217[local1] = -this.anIntArray217[local1];
			this.anIntArray212[local1] = -this.anIntArray212[local1];
		}
		this.aBoolean96 = false;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(ZZ)Lclient!ra;")
	@Override
	public Class20_Sub5 method1708(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (!arg0 && Static108.aByteArray32.length < this.anInt2162) {
			Static108.aByteArray32 = new byte[this.anInt2162 + 100];
		}
		return this.method1716(arg0, Static108.aClass20_Sub5_Sub1_2, Static108.aByteArray32);
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V")
	@Override
	public void method1696(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class120.anIntArray491[arg0];
		@Pc(7) int local7 = Class120.anIntArray492[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2164; local9++) {
			@Pc(26) int local26 = this.anIntArray215[local9] * local7 - this.anIntArray212[local9] * local3 >> 16;
			this.anIntArray212[local9] = this.anIntArray215[local9] * local3 + this.anIntArray212[local9] * local7 >> 16;
			this.anIntArray215[local9] = local26;
		}
		this.aBoolean96 = false;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
	@Override
	public void method1693(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class120.anIntArray491[arg0];
		@Pc(7) int local7 = Class120.anIntArray492[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2164; local9++) {
			@Pc(26) int local26 = this.anIntArray215[local9] * local3 + this.anIntArray217[local9] * local7 >> 16;
			this.anIntArray215[local9] = this.anIntArray215[local9] * local7 - this.anIntArray217[local9] * local3 >> 16;
			this.anIntArray217[local9] = local26;
		}
		this.aBoolean96 = false;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!ph;I)V")
	@Override
	public void method1690(@OriginalArg(0) Class1_Sub1_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray13 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class89 local12 = arg0.aClass89Array1[arg1];
		@Pc(15) Class1_Sub28 local15 = local12.aClass1_Sub28_1;
		Static108.anInt2167 = 0;
		Static108.anInt2166 = 0;
		Static108.anInt2165 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt3424; local23++) {
			@Pc(29) short local29 = local12.aShortArray48[local23];
			if (local15.aBooleanArray25[local29]) {
				if (local12.aShortArray53[local23] != -1) {
					this.method1714(0, 0, 0, 0);
				}
				this.method1714(local15.anIntArray483[local29], local12.aShortArray49[local23], local12.aShortArray50[local23], local12.aShortArray52[local23]);
			}
		}
		this.aBoolean96 = false;
	}

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "()I")
	@Override
	public int method1707() {
		if (!this.aBoolean96) {
			this.method1715();
		}
		return this.aShort25;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!ph;ILclient!ph;I[IZ)V")
	@Override
	public void method1695(@OriginalArg(0) Class1_Sub1_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1699(arg0, arg1, arg5);
			return;
		}
		@Pc(19) Class89 local19 = arg0.aClass89Array1[arg1];
		@Pc(24) Class89 local24 = arg2.aClass89Array1[arg3];
		@Pc(27) Class1_Sub28 local27 = local19.aClass1_Sub28_1;
		Static108.anInt2167 = 0;
		Static108.anInt2166 = 0;
		Static108.anInt2165 = 0;
		@Pc(35) byte local35 = 0;
		@Pc(38) int local38 = local35 + 1;
		@Pc(40) int local40 = arg4[0];
		for (@Pc(42) int local42 = 0; local42 < local19.anInt3424; local42++) {
			@Pc(48) short local48 = local19.aShortArray48[local42];
			while (local48 > local40) {
				local40 = arg4[local38++];
			}
			if (local48 != local40 || local27.anIntArray483[local48] == 0) {
				if (local19.aShortArray53[local42] != -1) {
					this.method1713(0, local27.anIntArrayArray34[local19.aShortArray53[local42]], 0, 0, 0);
				}
				this.method1713(local27.anIntArray483[local48], local27.anIntArrayArray34[local48], local19.aShortArray49[local42], local19.aShortArray50[local42], local19.aShortArray52[local42]);
			}
		}
		Static108.anInt2167 = 0;
		Static108.anInt2166 = 0;
		Static108.anInt2165 = 0;
		local35 = 0;
		local38 = local35 + 1;
		local40 = arg4[0];
		for (@Pc(126) int local126 = 0; local126 < local24.anInt3424; local126++) {
			@Pc(132) short local132 = local24.aShortArray48[local126];
			while (local132 > local40) {
				local40 = arg4[local38++];
			}
			if (local132 == local40 || local27.anIntArray483[local132] == 0) {
				if (local24.aShortArray53[local126] != -1) {
					this.method1713(0, local27.anIntArrayArray34[local24.aShortArray53[local126]], 0, 0, 0);
				}
				this.method1713(local27.anIntArray483[local132], local27.anIntArrayArray34[local132], local24.aShortArray49[local126], local24.aShortArray50[local126], local24.aShortArray52[local126]);
			}
		}
		this.aBoolean96 = false;
	}

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "()I")
	@Override
	public int method1704() {
		if (!this.aBoolean96) {
			this.method1715();
		}
		return this.aShort24;
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)V")
	private void method1721(@OriginalArg(0) int arg0) {
		if (Static108.aBooleanArray6[arg0]) {
			this.method1723(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray216[arg0];
		@Pc(17) int local17 = this.anIntArray207[arg0];
		@Pc(22) int local22 = this.anIntArray214[arg0];
		Static215.aBoolean203 = Static108.aBooleanArray7[arg0];
		if (this.aByteArray30 == null) {
			Static215.anInt4265 = 0;
		} else {
			Static215.anInt4265 = this.aByteArray30[arg0] & 0xFF;
		}
		if (this.aShortArray33 != null && this.aShortArray33[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray28 == null || this.aByteArray28[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray28[arg0] & 0xFF;
				local133 = this.anIntArray208[local128];
				local138 = this.anIntArray210[local128];
				local143 = this.anIntArray211[local128];
			}
			if (this.anIntArray213[arg0] == -1) {
				Static215.method3366(Static108.anIntArray219[local12], Static108.anIntArray219[local17], Static108.anIntArray219[local22], Static108.anIntArray218[local12], Static108.anIntArray218[local17], Static108.anIntArray218[local22], this.anIntArray206[arg0], this.anIntArray206[arg0], this.anIntArray206[arg0], Static108.anIntArray227[local133], Static108.anIntArray227[local138], Static108.anIntArray227[local143], Static108.anIntArray226[local133], Static108.anIntArray226[local138], Static108.anIntArray226[local143], Static108.anIntArray224[local133], Static108.anIntArray224[local138], Static108.anIntArray224[local143], this.aShortArray33[arg0]);
			} else {
				Static215.method3366(Static108.anIntArray219[local12], Static108.anIntArray219[local17], Static108.anIntArray219[local22], Static108.anIntArray218[local12], Static108.anIntArray218[local17], Static108.anIntArray218[local22], this.anIntArray206[arg0], this.anIntArray209[arg0], this.anIntArray213[arg0], Static108.anIntArray227[local133], Static108.anIntArray227[local138], Static108.anIntArray227[local143], Static108.anIntArray226[local133], Static108.anIntArray226[local138], Static108.anIntArray226[local143], Static108.anIntArray224[local133], Static108.anIntArray224[local138], Static108.anIntArray224[local143], this.aShortArray33[arg0]);
			}
		} else if (this.anIntArray213[arg0] == -1) {
			Static215.method3357(Static108.anIntArray219[local12], Static108.anIntArray219[local17], Static108.anIntArray219[local22], Static108.anIntArray218[local12], Static108.anIntArray218[local17], Static108.anIntArray218[local22], Static215.anIntArray494[this.anIntArray206[arg0]]);
		} else {
			Static215.method3358(Static108.anIntArray219[local12], Static108.anIntArray219[local17], Static108.anIntArray219[local22], Static108.anIntArray218[local12], Static108.anIntArray218[local17], Static108.anIntArray218[local22], this.anIntArray206[arg0], this.anIntArray209[arg0], this.anIntArray213[arg0]);
		}
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)V")
	@Override
	public void method1700(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class120.anIntArray491[arg0];
		@Pc(7) int local7 = Class120.anIntArray492[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2164; local9++) {
			@Pc(26) int local26 = this.anIntArray212[local9] * local3 + this.anIntArray217[local9] * local7 >> 16;
			this.anIntArray212[local9] = this.anIntArray212[local9] * local7 - this.anIntArray217[local9] * local3 >> 16;
			this.anIntArray217[local9] = local26;
		}
		this.aBoolean96 = false;
	}

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "()V")
	@Override
	public void method1706() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2164; local1++) {
			@Pc(7) int local7 = this.anIntArray212[local1];
			this.anIntArray212[local1] = this.anIntArray217[local1];
			this.anIntArray217[local1] = -local7;
		}
		this.aBoolean96 = false;
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "()I")
	@Override
	public int method1702() {
		if (!this.aBoolean96) {
			this.method1715();
		}
		return this.aShort20;
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "()I")
	@Override
	public int method1703() {
		if (!this.aBoolean96) {
			this.method1715();
		}
		return this.aShort21;
	}

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "(I)V")
	private void method1723(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static215.anInt4264;
		@Pc(3) int local3 = Static215.anInt4266;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray216[arg0];
		@Pc(15) int local15 = this.anIntArray207[arg0];
		@Pc(20) int local20 = this.anIntArray214[arg0];
		@Pc(24) int local24 = Static108.anIntArray224[local10];
		@Pc(28) int local28 = Static108.anIntArray224[local15];
		@Pc(32) int local32 = Static108.anIntArray224[local20];
		if (this.aByteArray30 == null) {
			Static215.anInt4265 = 0;
		} else {
			Static215.anInt4265 = this.aByteArray30[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static108.anIntArray220[0] = Static108.anIntArray218[local10];
			Static108.anIntArray222[0] = Static108.anIntArray219[local10];
			local5++;
			Static108.anIntArray229[0] = this.anIntArray206[arg0];
		} else {
			local73 = Static108.anIntArray227[local10];
			local77 = Static108.anIntArray226[local10];
			local82 = this.anIntArray206[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Class120.anIntArray493[local32 - local24];
				Static108.anIntArray220[0] = local1 + (local73 + ((Static108.anIntArray227[local20] - local73) * local95 >> 16) << 9) / 50;
				Static108.anIntArray222[0] = local3 + (local77 + ((Static108.anIntArray226[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static108.anIntArray229[0] = local82 + ((this.anIntArray213[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Class120.anIntArray493[local28 - local24];
				Static108.anIntArray220[local5] = local1 + (local73 + ((Static108.anIntArray227[local15] - local73) * local95 >> 16) << 9) / 50;
				Static108.anIntArray222[local5] = local3 + (local77 + ((Static108.anIntArray226[local15] - local77) * local95 >> 16) << 9) / 50;
				Static108.anIntArray229[local5++] = local82 + ((this.anIntArray209[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static108.anIntArray220[local5] = Static108.anIntArray218[local15];
			Static108.anIntArray222[local5] = Static108.anIntArray219[local15];
			Static108.anIntArray229[local5++] = this.anIntArray209[arg0];
		} else {
			local73 = Static108.anIntArray227[local15];
			local77 = Static108.anIntArray226[local15];
			local82 = this.anIntArray209[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Class120.anIntArray493[local24 - local28];
				Static108.anIntArray220[local5] = local1 + (local73 + ((Static108.anIntArray227[local10] - local73) * local95 >> 16) << 9) / 50;
				Static108.anIntArray222[local5] = local3 + (local77 + ((Static108.anIntArray226[local10] - local77) * local95 >> 16) << 9) / 50;
				Static108.anIntArray229[local5++] = local82 + ((this.anIntArray206[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Class120.anIntArray493[local32 - local28];
				Static108.anIntArray220[local5] = local1 + (local73 + ((Static108.anIntArray227[local20] - local73) * local95 >> 16) << 9) / 50;
				Static108.anIntArray222[local5] = local3 + (local77 + ((Static108.anIntArray226[local20] - local77) * local95 >> 16) << 9) / 50;
				Static108.anIntArray229[local5++] = local82 + ((this.anIntArray213[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static108.anIntArray220[local5] = Static108.anIntArray218[local20];
			Static108.anIntArray222[local5] = Static108.anIntArray219[local20];
			Static108.anIntArray229[local5++] = this.anIntArray213[arg0];
		} else {
			local73 = Static108.anIntArray227[local20];
			local77 = Static108.anIntArray226[local20];
			local82 = this.anIntArray213[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Class120.anIntArray493[local28 - local32];
				Static108.anIntArray220[local5] = local1 + (local73 + ((Static108.anIntArray227[local15] - local73) * local95 >> 16) << 9) / 50;
				Static108.anIntArray222[local5] = local3 + (local77 + ((Static108.anIntArray226[local15] - local77) * local95 >> 16) << 9) / 50;
				Static108.anIntArray229[local5++] = local82 + ((this.anIntArray209[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Class120.anIntArray493[local24 - local32];
				Static108.anIntArray220[local5] = local1 + (local73 + ((Static108.anIntArray227[local10] - local73) * local95 >> 16) << 9) / 50;
				Static108.anIntArray222[local5] = local3 + (local77 + ((Static108.anIntArray226[local10] - local77) * local95 >> 16) << 9) / 50;
				Static108.anIntArray229[local5++] = local82 + ((this.anIntArray206[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static108.anIntArray220[0];
		local77 = Static108.anIntArray220[1];
		local82 = Static108.anIntArray220[2];
		local95 = Static108.anIntArray222[0];
		@Pc(590) int local590 = Static108.anIntArray222[1];
		@Pc(594) int local594 = Static108.anIntArray222[2];
		Static215.aBoolean203 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static215.anInt4267 || local77 > Static215.anInt4267 || local82 > Static215.anInt4267) {
				Static215.aBoolean203 = true;
			}
			if (this.aShortArray33 != null && this.aShortArray33[arg0] != -1) {
				if (this.aByteArray28 == null || this.aByteArray28[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray28[arg0] & 0xFF;
					local683 = this.anIntArray208[local678];
					local688 = this.anIntArray210[local678];
					local693 = this.anIntArray211[local678];
				}
				if (this.anIntArray213[arg0] == -1) {
					Static215.method3366(local95, local590, local594, local73, local77, local82, this.anIntArray206[arg0], this.anIntArray206[arg0], this.anIntArray206[arg0], Static108.anIntArray227[local683], Static108.anIntArray227[local688], Static108.anIntArray227[local693], Static108.anIntArray226[local683], Static108.anIntArray226[local688], Static108.anIntArray226[local693], Static108.anIntArray224[local683], Static108.anIntArray224[local688], Static108.anIntArray224[local693], this.aShortArray33[arg0]);
				} else {
					Static215.method3366(local95, local590, local594, local73, local77, local82, Static108.anIntArray229[0], Static108.anIntArray229[1], Static108.anIntArray229[2], Static108.anIntArray227[local683], Static108.anIntArray227[local688], Static108.anIntArray227[local693], Static108.anIntArray226[local683], Static108.anIntArray226[local688], Static108.anIntArray226[local693], Static108.anIntArray224[local683], Static108.anIntArray224[local688], Static108.anIntArray224[local693], this.aShortArray33[arg0]);
				}
			} else if (this.anIntArray213[arg0] == -1) {
				Static215.method3357(local95, local590, local594, local73, local77, local82, Static215.anIntArray494[this.anIntArray206[arg0]]);
			} else {
				Static215.method3358(local95, local590, local594, local73, local77, local82, Static108.anIntArray229[0], Static108.anIntArray229[1], Static108.anIntArray229[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static215.anInt4267 || local77 > Static215.anInt4267 || local82 > Static215.anInt4267 || Static108.anIntArray220[3] < 0 || Static108.anIntArray220[3] > Static215.anInt4267) {
			Static215.aBoolean203 = true;
		}
		if (this.aShortArray33 == null || this.aShortArray33[arg0] == -1) {
			if (this.anIntArray213[arg0] == -1) {
				local683 = Static215.anIntArray494[this.anIntArray206[arg0]];
				Static215.method3357(local95, local590, local594, local73, local77, local82, local683);
				Static215.method3357(local95, local594, Static108.anIntArray222[3], local73, local82, Static108.anIntArray220[3], local683);
				return;
			}
			Static215.method3358(local95, local590, local594, local73, local77, local82, Static108.anIntArray229[0], Static108.anIntArray229[1], Static108.anIntArray229[2]);
			Static215.method3358(local95, local594, Static108.anIntArray222[3], local73, local82, Static108.anIntArray220[3], Static108.anIntArray229[0], Static108.anIntArray229[2], Static108.anIntArray229[3]);
			return;
		}
		if (this.aByteArray28 == null || this.aByteArray28[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray28[arg0] & 0xFF;
			local683 = this.anIntArray208[local678];
			local688 = this.anIntArray210[local678];
			local693 = this.anIntArray211[local678];
		}
		@Pc(956) short local956 = this.aShortArray33[arg0];
		if (this.anIntArray213[arg0] == -1) {
			Static215.method3366(local95, local590, local594, local73, local77, local82, this.anIntArray206[arg0], this.anIntArray206[arg0], this.anIntArray206[arg0], Static108.anIntArray227[local683], Static108.anIntArray227[local688], Static108.anIntArray227[local693], Static108.anIntArray226[local683], Static108.anIntArray226[local688], Static108.anIntArray226[local693], Static108.anIntArray224[local683], Static108.anIntArray224[local688], Static108.anIntArray224[local693], local956);
			Static215.method3366(local95, local594, Static108.anIntArray222[3], local73, local82, Static108.anIntArray220[3], this.anIntArray206[arg0], this.anIntArray206[arg0], this.anIntArray206[arg0], Static108.anIntArray227[local683], Static108.anIntArray227[local688], Static108.anIntArray227[local693], Static108.anIntArray226[local683], Static108.anIntArray226[local688], Static108.anIntArray226[local693], Static108.anIntArray224[local683], Static108.anIntArray224[local688], Static108.anIntArray224[local693], local956);
			return;
		}
		Static215.method3366(local95, local590, local594, local73, local77, local82, Static108.anIntArray229[0], Static108.anIntArray229[1], Static108.anIntArray229[2], Static108.anIntArray227[local683], Static108.anIntArray227[local688], Static108.anIntArray227[local693], Static108.anIntArray226[local683], Static108.anIntArray226[local688], Static108.anIntArray226[local693], Static108.anIntArray224[local683], Static108.anIntArray224[local688], Static108.anIntArray224[local693], local956);
		Static215.method3366(local95, local594, Static108.anIntArray222[3], local73, local82, Static108.anIntArray220[3], Static108.anIntArray229[0], Static108.anIntArray229[2], Static108.anIntArray229[3], Static108.anIntArray227[local683], Static108.anIntArray227[local688], Static108.anIntArray227[local693], Static108.anIntArray226[local683], Static108.anIntArray226[local688], Static108.anIntArray226[local693], Static108.anIntArray224[local683], Static108.anIntArray224[local688], Static108.anIntArray224[local693], local956);
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(III)V")
	@Override
	public void method1698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2164; local1++) {
			this.anIntArray217[local1] += arg0;
			this.anIntArray215[local1] += arg1;
			this.anIntArray212[local1] += arg2;
		}
		this.aBoolean96 = false;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(III)V")
	@Override
	public void method1697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2164; local1++) {
			this.anIntArray217[local1] = this.anIntArray217[local1] * arg0 / 128;
			this.anIntArray215[local1] = this.anIntArray215[local1] * arg1 / 128;
			this.anIntArray212[local1] = this.anIntArray212[local1] * arg2 / 128;
		}
		this.aBoolean96 = false;
	}
}
