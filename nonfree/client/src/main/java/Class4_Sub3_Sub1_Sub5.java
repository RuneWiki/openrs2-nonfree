import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class4_Sub3_Sub1_Sub5 extends Class4_Sub3_Sub1 {

	@OriginalMember(owner = "client!pf", name = "T", descriptor = "I")
	public int anInt2081;

	@OriginalMember(owner = "client!pf", name = "U", descriptor = "I")
	public int anInt2082;

	@OriginalMember(owner = "client!pf", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!pf", name = "W", descriptor = "[I")
	public int[] anIntArray237;

	@OriginalMember(owner = "client!pf", name = "X", descriptor = "[B")
	private byte[] aByteArray24;

	@OriginalMember(owner = "client!pf", name = "Y", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!pf", name = "Z", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!pf", name = "bb", descriptor = "[[I")
	private int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!pf", name = "db", descriptor = "[I")
	private int[] anIntArray239;

	@OriginalMember(owner = "client!pf", name = "eb", descriptor = "[B")
	private byte[] aByteArray25;

	@OriginalMember(owner = "client!pf", name = "fb", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!pf", name = "gb", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!pf", name = "jb", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!pf", name = "kb", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!pf", name = "lb", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!pf", name = "mb", descriptor = "I")
	private int anInt2084;

	@OriginalMember(owner = "client!pf", name = "nb", descriptor = "[Lclient!ha;")
	public Class30[] aClass30Array1;

	@OriginalMember(owner = "client!pf", name = "pb", descriptor = "[I")
	public int[] anIntArray241;

	@OriginalMember(owner = "client!pf", name = "qb", descriptor = "[I")
	public int[] anIntArray242;

	@OriginalMember(owner = "client!pf", name = "rb", descriptor = "[I")
	public int[] anIntArray243;

	@OriginalMember(owner = "client!pf", name = "tb", descriptor = "[I")
	public int[] anIntArray244;

	@OriginalMember(owner = "client!pf", name = "ub", descriptor = "I")
	public int anInt2086;

	@OriginalMember(owner = "client!pf", name = "vb", descriptor = "[B")
	private byte[] aByteArray26;

	@OriginalMember(owner = "client!pf", name = "wb", descriptor = "[Lclient!ha;")
	public Class30[] aClass30Array2;

	@OriginalMember(owner = "client!pf", name = "xb", descriptor = "[I")
	private int[] anIntArray245;

	@OriginalMember(owner = "client!pf", name = "zb", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!pf", name = "Ab", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!pf", name = "Cb", descriptor = "[I")
	public int[] anIntArray247;

	@OriginalMember(owner = "client!pf", name = "Db", descriptor = "[B")
	private byte[] aByteArray27;

	@OriginalMember(owner = "client!pf", name = "Eb", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!pf", name = "Gb", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!pf", name = "Hb", descriptor = "S")
	public short aShort1;

	@OriginalMember(owner = "client!pf", name = "Ib", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!pf", name = "Jb", descriptor = "I")
	public int anInt2088;

	@OriginalMember(owner = "client!pf", name = "Kb", descriptor = "I")
	public int anInt2089;

	@OriginalMember(owner = "client!pf", name = "Lb", descriptor = "[B")
	private byte[] aByteArray29;

	@OriginalMember(owner = "client!pf", name = "Mb", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!pf", name = "Nb", descriptor = "[Lclient!ld;")
	private Class47[] aClass47Array1;

	@OriginalMember(owner = "client!pf", name = "ib", descriptor = "I")
	public int anInt2083 = 0;

	@OriginalMember(owner = "client!pf", name = "ab", descriptor = "Z")
	private boolean aBoolean73 = false;

	@OriginalMember(owner = "client!pf", name = "sb", descriptor = "B")
	private byte aByte7 = 0;

	@OriginalMember(owner = "client!pf", name = "yb", descriptor = "I")
	public int anInt2087 = 0;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
	private Class4_Sub3_Sub1_Sub5() {
	}

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "([B)V")
	public Class4_Sub3_Sub1_Sub5(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1450(arg0);
		} else {
			this.method1451(arg0);
		}
	}

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "([Lclient!pf;I)V")
	public Class4_Sub3_Sub1_Sub5(@OriginalArg(0) Class4_Sub3_Sub1_Sub5[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt2083 = 0;
		this.anInt2087 = 0;
		this.anInt2084 = 0;
		this.aByte7 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class4_Sub3_Sub1_Sub5 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt2083 += local44.anInt2083;
				this.anInt2087 += local44.anInt2087;
				this.anInt2084 += local44.anInt2084;
				if (local44.aByteArray27 == null) {
					if (this.aByte7 == -1) {
						this.aByte7 = local44.aByte7;
					}
					if (this.aByte7 != local44.aByte7) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray28 != null;
				local19 |= local44.aByteArray29 != null;
				local21 |= local44.anIntArray245 != null;
				local23 |= local44.aShortArray19 != null;
				local25 |= local44.aByteArray26 != null;
			}
		}
		this.anIntArray243 = new int[this.anInt2083];
		this.anIntArray242 = new int[this.anInt2083];
		this.anIntArray247 = new int[this.anInt2083];
		this.anIntArray239 = new int[this.anInt2083];
		this.anIntArray241 = new int[this.anInt2087];
		this.anIntArray244 = new int[this.anInt2087];
		this.anIntArray237 = new int[this.anInt2087];
		if (local15) {
			this.aByteArray28 = new byte[this.anInt2087];
		}
		if (local17) {
			this.aByteArray27 = new byte[this.anInt2087];
		}
		if (local19) {
			this.aByteArray29 = new byte[this.anInt2087];
		}
		if (local21) {
			this.anIntArray245 = new int[this.anInt2087];
		}
		if (local23) {
			this.aShortArray19 = new short[this.anInt2087];
		}
		if (local25) {
			this.aByteArray26 = new byte[this.anInt2087];
		}
		this.aShortArray27 = new short[this.anInt2087];
		if (this.anInt2084 > 0) {
			this.aByteArray24 = new byte[this.anInt2084];
			this.aShortArray29 = new short[this.anInt2084];
			this.aShortArray26 = new short[this.anInt2084];
			this.aShortArray25 = new short[this.anInt2084];
			this.aShortArray20 = new short[this.anInt2084];
			this.aShortArray28 = new short[this.anInt2084];
			this.aShortArray23 = new short[this.anInt2084];
			this.aShortArray21 = new short[this.anInt2084];
			this.aByteArray25 = new byte[this.anInt2084];
			this.aShortArray24 = new short[this.anInt2084];
			this.aShortArray22 = new short[this.anInt2084];
		}
		this.anInt2083 = 0;
		this.anInt2087 = 0;
		this.anInt2084 = 0;
		for (@Pc(288) int local288 = 0; local288 < arg1; local288++) {
			@Pc(293) Class4_Sub3_Sub1_Sub5 local293 = arg0[local288];
			if (local293 != null) {
				for (@Pc(297) int local297 = 0; local297 < local293.anInt2087; local297++) {
					if (local15 && local293.aByteArray28 != null) {
						this.aByteArray28[this.anInt2087] = local293.aByteArray28[local297];
					}
					if (local17) {
						if (local293.aByteArray27 == null) {
							this.aByteArray27[this.anInt2087] = local293.aByte7;
						} else {
							this.aByteArray27[this.anInt2087] = local293.aByteArray27[local297];
						}
					}
					if (local19 && local293.aByteArray29 != null) {
						this.aByteArray29[this.anInt2087] = local293.aByteArray29[local297];
					}
					if (local21 && local293.anIntArray245 != null) {
						this.anIntArray245[this.anInt2087] = local293.anIntArray245[local297];
					}
					if (local23) {
						if (local293.aShortArray19 == null) {
							this.aShortArray19[this.anInt2087] = -1;
						} else {
							this.aShortArray19[this.anInt2087] = local293.aShortArray19[local297];
						}
					}
					if (local25) {
						if (local293.aByteArray26 == null || local293.aByteArray26[local297] == -1) {
							this.aByteArray26[this.anInt2087] = -1;
						} else {
							this.aByteArray26[this.anInt2087] = (byte) (local293.aByteArray26[local297] + this.anInt2084);
						}
					}
					this.aShortArray27[this.anInt2087] = local293.aShortArray27[local297];
					this.anIntArray241[this.anInt2087] = this.method1432(local293, local293.anIntArray241[local297]);
					this.anIntArray244[this.anInt2087] = this.method1432(local293, local293.anIntArray244[local297]);
					this.anIntArray237[this.anInt2087] = this.method1432(local293, local293.anIntArray237[local297]);
					this.anInt2087++;
				}
				for (@Pc(472) int local472 = 0; local472 < local293.anInt2084; local472++) {
					@Pc(484) byte local484 = this.aByteArray24[this.anInt2084] = local293.aByteArray24[local472];
					if (local484 == 0) {
						this.aShortArray29[this.anInt2084] = (short) this.method1432(local293, local293.aShortArray29[local472]);
						this.aShortArray26[this.anInt2084] = (short) this.method1432(local293, local293.aShortArray26[local472]);
						this.aShortArray25[this.anInt2084] = (short) this.method1432(local293, local293.aShortArray25[local472]);
					}
					if (local484 >= 1 && local484 <= 3) {
						this.aShortArray29[this.anInt2084] = local293.aShortArray29[local472];
						this.aShortArray26[this.anInt2084] = local293.aShortArray26[local472];
						this.aShortArray25[this.anInt2084] = local293.aShortArray25[local472];
						this.aShortArray20[this.anInt2084] = local293.aShortArray20[local472];
						this.aShortArray28[this.anInt2084] = local293.aShortArray28[local472];
						this.aShortArray23[this.anInt2084] = local293.aShortArray23[local472];
						this.aShortArray21[this.anInt2084] = local293.aShortArray21[local472];
						this.aByteArray25[this.anInt2084] = local293.aByteArray25[local472];
						this.aShortArray24[this.anInt2084] = local293.aShortArray24[local472];
					}
					if (local484 == 2) {
						this.aShortArray22[this.anInt2084] = local293.aShortArray22[local472];
					}
					this.anInt2084++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lclient!pf;ZZZZ)V")
	public Class4_Sub3_Sub1_Sub5(@OriginalArg(0) Class4_Sub3_Sub1_Sub5 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2083 = arg0.anInt2083;
		this.anInt2087 = arg0.anInt2087;
		this.anInt2084 = arg0.anInt2084;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray243 = arg0.anIntArray243;
			this.anIntArray242 = arg0.anIntArray242;
			this.anIntArray247 = arg0.anIntArray247;
		} else {
			this.anIntArray243 = new int[this.anInt2083];
			this.anIntArray242 = new int[this.anInt2083];
			this.anIntArray247 = new int[this.anInt2083];
			for (local57 = 0; local57 < this.anInt2083; local57++) {
				this.anIntArray243[local57] = arg0.anIntArray243[local57];
				this.anIntArray242[local57] = arg0.anIntArray242[local57];
				this.anIntArray247[local57] = arg0.anIntArray247[local57];
			}
		}
		if (arg2) {
			this.aShortArray27 = arg0.aShortArray27;
		} else {
			this.aShortArray27 = new short[this.anInt2087];
			for (local57 = 0; local57 < this.anInt2087; local57++) {
				this.aShortArray27[local57] = arg0.aShortArray27[local57];
			}
		}
		if (arg3 || arg0.aShortArray19 == null) {
			this.aShortArray19 = arg0.aShortArray19;
		} else {
			this.aShortArray19 = new short[this.anInt2087];
			for (local57 = 0; local57 < this.anInt2087; local57++) {
				this.aShortArray19[local57] = arg0.aShortArray19[local57];
			}
		}
		this.aByteArray29 = arg0.aByteArray29;
		this.anIntArray241 = arg0.anIntArray241;
		this.anIntArray244 = arg0.anIntArray244;
		this.anIntArray237 = arg0.anIntArray237;
		this.aByteArray28 = arg0.aByteArray28;
		this.aByteArray27 = arg0.aByteArray27;
		this.aByteArray26 = arg0.aByteArray26;
		this.aByte7 = arg0.aByte7;
		this.aByteArray24 = arg0.aByteArray24;
		this.aShortArray29 = arg0.aShortArray29;
		this.aShortArray26 = arg0.aShortArray26;
		this.aShortArray25 = arg0.aShortArray25;
		this.aShortArray20 = arg0.aShortArray20;
		this.aShortArray28 = arg0.aShortArray28;
		this.aShortArray23 = arg0.aShortArray23;
		this.aShortArray21 = arg0.aShortArray21;
		this.aByteArray25 = arg0.aByteArray25;
		this.aShortArray24 = arg0.aShortArray24;
		this.aShortArray22 = arg0.aShortArray22;
		this.anIntArray239 = arg0.anIntArray239;
		this.anIntArray245 = arg0.anIntArray245;
		this.anIntArrayArray57 = arg0.anIntArrayArray57;
		this.anIntArrayArray56 = arg0.anIntArrayArray56;
		this.aClass30Array1 = arg0.aClass30Array1;
		this.aClass47Array1 = arg0.aClass47Array1;
		this.aClass30Array2 = arg0.aClass30Array2;
		this.aShort1 = arg0.aShort1;
		this.aShort2 = arg0.aShort2;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "()V")
	public void method1431() {
		if (this.aBoolean73) {
			return;
		}
		super.anInt2166 = 0;
		this.anInt2086 = 0;
		this.anInt2082 = 999999;
		this.anInt2089 = -999999;
		this.anInt2081 = -99999;
		this.anInt2088 = 99999;
		for (@Pc(23) int local23 = 0; local23 < this.anInt2083; local23++) {
			@Pc(29) int local29 = this.anIntArray243[local23];
			@Pc(34) int local34 = this.anIntArray242[local23];
			@Pc(39) int local39 = this.anIntArray247[local23];
			if (local29 < this.anInt2082) {
				this.anInt2082 = local29;
			}
			if (local29 > this.anInt2089) {
				this.anInt2089 = local29;
			}
			if (local39 < this.anInt2088) {
				this.anInt2088 = local39;
			}
			if (local39 > this.anInt2081) {
				this.anInt2081 = local39;
			}
			if (-local34 > super.anInt2166) {
				super.anInt2166 = -local34;
			}
			if (local34 > this.anInt2086) {
				this.anInt2086 = local34;
			}
		}
		this.aBoolean73 = true;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!pf;I)I")
	private int method1432(@OriginalArg(0) Class4_Sub3_Sub1_Sub5 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray243[arg1];
		@Pc(11) int local11 = arg0.anIntArray242[arg1];
		@Pc(16) int local16 = arg0.anIntArray247[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2083; local18++) {
			if (local6 == this.anIntArray243[local18] && local11 == this.anIntArray242[local18] && local16 == this.anIntArray247[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray243[this.anInt2083] = local6;
			this.anIntArray242[this.anInt2083] = local11;
			this.anIntArray247[this.anInt2083] = local16;
			if (arg0.anIntArray239 != null) {
				this.anIntArray239[this.anInt2083] = arg0.anIntArray239[arg1];
			}
			local1 = this.anInt2083++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(SS)V")
	public void method1433(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2087; local1++) {
			if (this.aShortArray27[local1] == arg0) {
				this.aShortArray27[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "([[IIIIZI)Lclient!pf;")
	public Class4_Sub3_Sub1_Sub5 method1434(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method1431();
		@Pc(6) int local6 = arg1 + this.anInt2082;
		@Pc(11) int local11 = arg1 + this.anInt2089;
		@Pc(16) int local16 = arg3 + this.anInt2088;
		@Pc(21) int local21 = arg3 + this.anInt2081;
		if (local6 < 0 || local11 + 128 >> 7 >= arg0.length || local16 < 0 || local21 + 128 >> 7 >= arg0[0].length) {
			return this;
		}
		local6 >>= 0x7;
		local11 = local11 + 127 >> 7;
		local16 >>= 0x7;
		local21 = local21 + 127 >> 7;
		if (arg0[local6][local16] == arg2 && arg0[local11][local16] == arg2 && arg0[local6][local21] == arg2 && arg0[local11][local21] == arg2) {
			return this;
		}
		@Pc(101) Class4_Sub3_Sub1_Sub5 local101 = new Class4_Sub3_Sub1_Sub5();
		local101.anInt2083 = this.anInt2083;
		local101.anInt2087 = this.anInt2087;
		local101.anInt2084 = this.anInt2084;
		local101.anIntArray243 = this.anIntArray243;
		local101.anIntArray247 = this.anIntArray247;
		local101.anIntArray241 = this.anIntArray241;
		local101.anIntArray244 = this.anIntArray244;
		local101.anIntArray237 = this.anIntArray237;
		local101.aByteArray28 = this.aByteArray28;
		local101.aByteArray27 = this.aByteArray27;
		local101.aByteArray29 = this.aByteArray29;
		local101.aByteArray26 = this.aByteArray26;
		local101.aShortArray27 = this.aShortArray27;
		local101.aShortArray19 = this.aShortArray19;
		local101.aByte7 = this.aByte7;
		local101.aByteArray24 = this.aByteArray24;
		local101.aShortArray29 = this.aShortArray29;
		local101.aShortArray26 = this.aShortArray26;
		local101.aShortArray25 = this.aShortArray25;
		local101.aShortArray20 = this.aShortArray20;
		local101.aShortArray28 = this.aShortArray28;
		local101.aShortArray23 = this.aShortArray23;
		local101.aShortArray21 = this.aShortArray21;
		local101.aByteArray25 = this.aByteArray25;
		local101.aShortArray24 = this.aShortArray24;
		local101.aShortArray22 = this.aShortArray22;
		local101.anIntArray239 = this.anIntArray239;
		local101.anIntArray245 = this.anIntArray245;
		local101.anIntArrayArray57 = this.anIntArrayArray57;
		local101.anIntArrayArray56 = this.anIntArrayArray56;
		local101.aShort1 = this.aShort1;
		local101.aShort2 = this.aShort2;
		local101.anIntArray242 = new int[local101.anInt2083];
		@Pc(241) int local241;
		@Pc(249) int local249;
		@Pc(256) int local256;
		@Pc(260) int local260;
		@Pc(264) int local264;
		@Pc(268) int local268;
		@Pc(272) int local272;
		@Pc(294) int local294;
		@Pc(320) int local320;
		@Pc(332) int local332;
		if (arg4 == 0) {
			for (local241 = 0; local241 < local101.anInt2083; local241++) {
				local249 = this.anIntArray243[local241] + arg1;
				local256 = this.anIntArray247[local241] + arg3;
				local260 = local249 & 0x7F;
				local264 = local256 & 0x7F;
				local268 = local249 >> 7;
				local272 = local256 >> 7;
				local294 = arg0[local268][local272] * (128 - local260) + arg0[local268 + 1][local272] * local260 >> 7;
				local320 = arg0[local268][local272 + 1] * (128 - local260) + arg0[local268 + 1][local272 + 1] * local260 >> 7;
				local332 = local294 * (128 - local264) + local320 * local264 >> 7;
				local101.anIntArray242[local241] = this.anIntArray242[local241] + local332 - arg2;
			}
		} else {
			for (local241 = 0; local241 < local101.anInt2083; local241++) {
				local249 = (-this.anIntArray242[local241] << 16) / super.anInt2166;
				if (local249 < arg4) {
					local256 = this.anIntArray243[local241] + arg1;
					local260 = this.anIntArray247[local241] + arg3;
					local264 = local256 & 0x7F;
					local268 = local260 & 0x7F;
					local272 = local256 >> 7;
					local294 = local260 >> 7;
					local320 = arg0[local272][local294] * (128 - local264) + arg0[local272 + 1][local294] * local264 >> 7;
					local332 = arg0[local272][local294 + 1] * (128 - local264) + arg0[local272 + 1][local294 + 1] * local264 >> 7;
					@Pc(457) int local457 = local320 * (128 - local268) + local332 * local268 >> 7;
					local101.anIntArray242[local241] = this.anIntArray242[local241] + (local457 - arg2) * (arg4 - local249) / arg4;
				}
			}
		}
		local101.method1447();
		return local101;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "()V")
	public void method1436() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2083; local1++) {
			@Pc(7) int local7 = this.anIntArray243[local1];
			this.anIntArray243[local1] = this.anIntArray247[local1];
			this.anIntArray247[local1] = -local7;
		}
		this.method1447();
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "()V")
	public void method1437() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2083; local1++) {
			this.anIntArray247[local1] = -this.anIntArray247[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt2087; local18++) {
			@Pc(24) int local24 = this.anIntArray241[local18];
			this.anIntArray241[local18] = this.anIntArray237[local18];
			this.anIntArray237[local18] = local24;
		}
		this.method1447();
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V")
	public void method1438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2083; local1++) {
			this.anIntArray243[local1] += arg0;
			this.anIntArray242[local1] += arg1;
			this.anIntArray247[local1] += arg2;
		}
		this.method1447();
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(SS)V")
	public void method1439(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray19 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt2087; local5++) {
			if (this.aShortArray19[local5] == arg0) {
				this.aShortArray19[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "()Lclient!pf;")
	public Class4_Sub3_Sub1_Sub5 method1441() {
		@Pc(3) Class4_Sub3_Sub1_Sub5 local3 = new Class4_Sub3_Sub1_Sub5();
		if (this.aByteArray28 != null) {
			local3.aByteArray28 = new byte[this.anInt2087];
			for (@Pc(13) int local13 = 0; local13 < this.anInt2087; local13++) {
				local3.aByteArray28[local13] = this.aByteArray28[local13];
			}
		}
		local3.anInt2083 = this.anInt2083;
		local3.anInt2087 = this.anInt2087;
		local3.anInt2084 = this.anInt2084;
		local3.anIntArray243 = this.anIntArray243;
		local3.anIntArray242 = this.anIntArray242;
		local3.anIntArray247 = this.anIntArray247;
		local3.anIntArray241 = this.anIntArray241;
		local3.anIntArray244 = this.anIntArray244;
		local3.anIntArray237 = this.anIntArray237;
		local3.aByteArray27 = this.aByteArray27;
		local3.aByteArray29 = this.aByteArray29;
		local3.aByteArray26 = this.aByteArray26;
		local3.aShortArray27 = this.aShortArray27;
		local3.aShortArray19 = this.aShortArray19;
		local3.aByte7 = this.aByte7;
		local3.aByteArray24 = this.aByteArray24;
		local3.aShortArray29 = this.aShortArray29;
		local3.aShortArray26 = this.aShortArray26;
		local3.aShortArray25 = this.aShortArray25;
		local3.aShortArray20 = this.aShortArray20;
		local3.aShortArray28 = this.aShortArray28;
		local3.aShortArray23 = this.aShortArray23;
		local3.aShortArray21 = this.aShortArray21;
		local3.aByteArray25 = this.aByteArray25;
		local3.aShortArray24 = this.aShortArray24;
		local3.aShortArray22 = this.aShortArray22;
		local3.anIntArray239 = this.anIntArray239;
		local3.anIntArray245 = this.anIntArray245;
		local3.anIntArrayArray57 = this.anIntArrayArray57;
		local3.anIntArrayArray56 = this.anIntArrayArray56;
		local3.aClass30Array1 = this.aClass30Array1;
		local3.aClass47Array1 = this.aClass47Array1;
		local3.aShort1 = this.aShort1;
		local3.aShort2 = this.aShort2;
		return local3;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(III)V")
	public void method1442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2083; local1++) {
			this.anIntArray243[local1] = this.anIntArray243[local1] * arg0 / 128;
			this.anIntArray242[local1] = this.anIntArray242[local1] * arg1 / 128;
			this.anIntArray247[local1] = this.anIntArray247[local1] * arg2 / 128;
		}
		this.method1447();
	}

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "()V")
	public void method1443() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2083; local1++) {
			this.anIntArray243[local1] = -this.anIntArray243[local1];
			this.anIntArray247[local1] = -this.anIntArray247[local1];
		}
		this.method1447();
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIII)Lclient!qb;")
	public Class4_Sub3_Sub1_Sub7 method1444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1453();
		@Pc(16) int local16 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(22) int local22 = arg1 * local16 >> 8;
		@Pc(26) Class4_Sub3_Sub1_Sub7 local26 = new Class4_Sub3_Sub1_Sub7();
		local26.anIntArray249 = new int[this.anInt2087];
		local26.anIntArray251 = new int[this.anInt2087];
		local26.anIntArray258 = new int[this.anInt2087];
		@Pc(184) int local184;
		if (this.anInt2084 > 0 && this.aByteArray26 != null) {
			@Pc(51) int[] local51 = new int[this.anInt2084];
			for (@Pc(53) int local53 = 0; local53 < this.anInt2087; local53++) {
				if (this.aByteArray26[local53] != -1) {
					local51[this.aByteArray26[local53] & 0xFF]++;
				}
			}
			local26.anInt2175 = 0;
			for (@Pc(82) int local82 = 0; local82 < this.anInt2084; local82++) {
				if (local51[local82] > 0 && this.aByteArray24[local82] == 0) {
					local26.anInt2175++;
				}
			}
			local26.anIntArray256 = new int[local26.anInt2175];
			local26.anIntArray255 = new int[local26.anInt2175];
			local26.anIntArray260 = new int[local26.anInt2175];
			@Pc(120) int local120 = 0;
			for (@Pc(122) int local122 = 0; local122 < this.anInt2084; local122++) {
				if (local51[local122] > 0 && this.aByteArray24[local122] == 0) {
					local26.anIntArray256[local120] = this.aShortArray29[local122] & 0xFFFF;
					local26.anIntArray255[local120] = this.aShortArray26[local122] & 0xFFFF;
					local26.anIntArray260[local120] = this.aShortArray25[local122] & 0xFFFF;
					local51[local122] = local120++;
				} else {
					local51[local122] = -1;
				}
			}
			local26.aByteArray31 = new byte[this.anInt2087];
			for (local184 = 0; local184 < this.anInt2087; local184++) {
				if (this.aByteArray26[local184] == -1) {
					local26.aByteArray31[local184] = -1;
				} else {
					local26.aByteArray31[local184] = (byte) local51[this.aByteArray26[local184] & 0xFF];
				}
			}
		}
		for (@Pc(217) int local217 = 0; local217 < this.anInt2087; local217++) {
			@Pc(223) byte local223;
			if (this.aByteArray28 == null) {
				local223 = 0;
			} else {
				local223 = this.aByteArray28[local217];
			}
			@Pc(234) byte local234;
			if (this.aByteArray29 == null) {
				local234 = 0;
			} else {
				local234 = this.aByteArray29[local217];
			}
			@Pc(245) short local245;
			if (this.aShortArray19 == null) {
				local245 = -1;
			} else {
				local245 = this.aShortArray19[local217];
			}
			if (local234 == -2) {
				local223 = 3;
			}
			if (local234 == -1) {
				local223 = 2;
			}
			@Pc(292) Class30 local292;
			@Pc(453) Class47 local453;
			if (local245 == -1) {
				if (local223 == 0) {
					@Pc(273) int local273 = this.aShortArray27[local217] & 0xFFFF;
					if (this.aClass30Array2 == null || this.aClass30Array2[this.anIntArray241[local217]] == null) {
						local292 = this.aClass30Array1[this.anIntArray241[local217]];
					} else {
						local292 = this.aClass30Array2[this.anIntArray241[local217]];
					}
					local184 = arg0 + (arg2 * local292.anInt1123 + arg3 * local292.anInt1125 + arg4 * local292.anInt1124) / (local22 * local292.anInt1129);
					local26.anIntArray249[local217] = Static89.method1449(local273, local184);
					if (this.aClass30Array2 == null || this.aClass30Array2[this.anIntArray244[local217]] == null) {
						local292 = this.aClass30Array1[this.anIntArray244[local217]];
					} else {
						local292 = this.aClass30Array2[this.anIntArray244[local217]];
					}
					local184 = arg0 + (arg2 * local292.anInt1123 + arg3 * local292.anInt1125 + arg4 * local292.anInt1124) / (local22 * local292.anInt1129);
					local26.anIntArray251[local217] = Static89.method1449(local273, local184);
					if (this.aClass30Array2 == null || this.aClass30Array2[this.anIntArray237[local217]] == null) {
						local292 = this.aClass30Array1[this.anIntArray237[local217]];
					} else {
						local292 = this.aClass30Array2[this.anIntArray237[local217]];
					}
					local184 = arg0 + (arg2 * local292.anInt1123 + arg3 * local292.anInt1125 + arg4 * local292.anInt1124) / (local22 * local292.anInt1129);
					local26.anIntArray258[local217] = Static89.method1449(local273, local184);
				} else if (local223 == 1) {
					local453 = this.aClass47Array1[local217];
					local184 = arg0 + (arg2 * local453.anInt1592 + arg3 * local453.anInt1595 + arg4 * local453.anInt1594) / (local22 + local22 / 2);
					local26.anIntArray249[local217] = Static89.method1449(this.aShortArray27[local217] & 0xFFFF, local184);
					local26.anIntArray258[local217] = -1;
				} else if (local223 == 3) {
					local26.anIntArray249[local217] = 128;
					local26.anIntArray258[local217] = -1;
				} else {
					local26.anIntArray258[local217] = -2;
				}
			} else if (local223 == 0) {
				if (this.aClass30Array2 == null || this.aClass30Array2[this.anIntArray241[local217]] == null) {
					local292 = this.aClass30Array1[this.anIntArray241[local217]];
				} else {
					local292 = this.aClass30Array2[this.anIntArray241[local217]];
				}
				local184 = arg0 + (arg2 * local292.anInt1123 + arg3 * local292.anInt1125 + arg4 * local292.anInt1124) / (local22 * local292.anInt1129);
				local26.anIntArray249[local217] = Static89.method1440(local184);
				if (this.aClass30Array2 == null || this.aClass30Array2[this.anIntArray244[local217]] == null) {
					local292 = this.aClass30Array1[this.anIntArray244[local217]];
				} else {
					local292 = this.aClass30Array2[this.anIntArray244[local217]];
				}
				local184 = arg0 + (arg2 * local292.anInt1123 + arg3 * local292.anInt1125 + arg4 * local292.anInt1124) / (local22 * local292.anInt1129);
				local26.anIntArray251[local217] = Static89.method1440(local184);
				if (this.aClass30Array2 == null || this.aClass30Array2[this.anIntArray237[local217]] == null) {
					local292 = this.aClass30Array1[this.anIntArray237[local217]];
				} else {
					local292 = this.aClass30Array2[this.anIntArray237[local217]];
				}
				local184 = arg0 + (arg2 * local292.anInt1123 + arg3 * local292.anInt1125 + arg4 * local292.anInt1124) / (local22 * local292.anInt1129);
				local26.anIntArray258[local217] = Static89.method1440(local184);
			} else if (local223 == 1) {
				local453 = this.aClass47Array1[local217];
				local184 = arg0 + (arg2 * local453.anInt1592 + arg3 * local453.anInt1595 + arg4 * local453.anInt1594) / (local22 + local22 / 2);
				local26.anIntArray249[local217] = Static89.method1440(local184);
				local26.anIntArray258[local217] = -1;
			} else {
				local26.anIntArray258[local217] = -2;
			}
		}
		this.method1454();
		local26.anInt2172 = this.anInt2083;
		local26.anIntArray254 = this.anIntArray243;
		local26.anIntArray259 = this.anIntArray242;
		local26.anIntArray252 = this.anIntArray247;
		local26.anInt2171 = this.anInt2087;
		local26.anIntArray253 = this.anIntArray241;
		local26.anIntArray250 = this.anIntArray244;
		local26.anIntArray257 = this.anIntArray237;
		local26.aByteArray32 = this.aByteArray27;
		local26.aByteArray30 = this.aByteArray29;
		local26.aByte8 = this.aByte7;
		local26.anIntArrayArray61 = this.anIntArrayArray57;
		local26.anIntArrayArray60 = this.anIntArrayArray56;
		local26.aShortArray30 = this.aShortArray19;
		return local26;
	}

	@OriginalMember(owner = "client!pf", name = "k", descriptor = "(I)V")
	public void method1446() {
		@Pc(3) int local3 = Static89.anIntArray248[256];
		@Pc(7) int local7 = Static89.anIntArray246[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2083; local9++) {
			@Pc(26) int local26 = this.anIntArray247[local9] * local3 + this.anIntArray243[local9] * local7 >> 16;
			this.anIntArray247[local9] = this.anIntArray247[local9] * local7 - this.anIntArray243[local9] * local3 >> 16;
			this.anIntArray243[local9] = local26;
		}
		this.method1447();
	}

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "()V")
	private void method1447() {
		this.aClass30Array1 = null;
		this.aClass30Array2 = null;
		this.aClass47Array1 = null;
		this.aBoolean73 = false;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "([B)V")
	private void method1450(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class4_Sub9 local4 = new Class4_Sub9(arg0);
		@Pc(9) Class4_Sub9 local9 = new Class4_Sub9(arg0);
		@Pc(14) Class4_Sub9 local14 = new Class4_Sub9(arg0);
		@Pc(19) Class4_Sub9 local19 = new Class4_Sub9(arg0);
		@Pc(24) Class4_Sub9 local24 = new Class4_Sub9(arg0);
		@Pc(29) Class4_Sub9 local29 = new Class4_Sub9(arg0);
		@Pc(34) Class4_Sub9 local34 = new Class4_Sub9(arg0);
		local4.anInt1312 = arg0.length - 23;
		@Pc(44) int local44 = local4.method816();
		@Pc(48) int local48 = local4.method816();
		@Pc(52) int local52 = local4.method773();
		@Pc(56) int local56 = local4.method773();
		@Pc(60) int local60 = local4.method773();
		@Pc(64) int local64 = local4.method773();
		@Pc(68) int local68 = local4.method773();
		@Pc(72) int local72 = local4.method773();
		@Pc(76) int local76 = local4.method773();
		@Pc(80) int local80 = local4.method816();
		@Pc(84) int local84 = local4.method816();
		@Pc(88) int local88 = local4.method816();
		@Pc(92) int local92 = local4.method816();
		@Pc(96) int local96 = local4.method816();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray24 = new byte[local52];
			local4.anInt1312 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray24[local113] = local4.method797();
				if (local123 == 0) {
					local98++;
				}
				if (local123 >= 1 && local123 <= 3) {
					local100++;
				}
				if (local123 == 2) {
					local102++;
				}
			}
		}
		local113 = local52 + local44;
		@Pc(151) int local151 = local113;
		if (local56 == 1) {
			local113 += local48;
		}
		@Pc(160) int local160 = local113;
		local113 += local48;
		@Pc(166) int local166 = local113;
		if (local60 == 255) {
			local113 += local48;
		}
		@Pc(175) int local175 = local113;
		if (local68 == 1) {
			local113 += local48;
		}
		@Pc(184) int local184 = local113;
		if (local76 == 1) {
			local113 += local44;
		}
		@Pc(193) int local193 = local113;
		if (local64 == 1) {
			local113 += local48;
		}
		@Pc(202) int local202 = local113;
		local113 += local92;
		@Pc(208) int local208 = local113;
		if (local72 == 1) {
			local113 += local48 * 2;
		}
		@Pc(219) int local219 = local113;
		local113 += local96;
		@Pc(225) int local225 = local113;
		local113 += local48 * 2;
		@Pc(233) int local233 = local113;
		local113 += local80;
		@Pc(239) int local239 = local113;
		local113 += local84;
		@Pc(245) int local245 = local113;
		local113 += local88;
		@Pc(251) int local251 = local113;
		local113 += local98 * 6;
		@Pc(259) int local259 = local113;
		local113 += local100 * 6;
		@Pc(267) int local267 = local113;
		local113 += local100 * 6;
		@Pc(275) int local275 = local113;
		local113 += local100 * 2;
		@Pc(283) int local283 = local113;
		local113 += local100;
		@Pc(289) int local289 = local113;
		local113 += local100 * 2 + local102 * 2;
		this.anInt2083 = local44;
		this.anInt2087 = local48;
		this.anInt2084 = local52;
		this.anIntArray243 = new int[local44];
		this.anIntArray242 = new int[local44];
		this.anIntArray247 = new int[local44];
		this.anIntArray241 = new int[local48];
		this.anIntArray244 = new int[local48];
		this.anIntArray237 = new int[local48];
		if (local76 == 1) {
			this.anIntArray239 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray28 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray27 = new byte[local48];
		} else {
			this.aByte7 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray29 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray245 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray19 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray26 = new byte[local48];
		}
		this.aShortArray27 = new short[local48];
		if (local52 > 0) {
			this.aShortArray29 = new short[local52];
			this.aShortArray26 = new short[local52];
			this.aShortArray25 = new short[local52];
			if (local100 > 0) {
				this.aShortArray20 = new short[local100];
				this.aShortArray28 = new short[local100];
				this.aShortArray23 = new short[local100];
				this.aShortArray21 = new short[local100];
				this.aByteArray25 = new byte[local100];
				this.aShortArray24 = new short[local100];
			}
			if (local102 > 0) {
				this.aShortArray22 = new short[local102];
			}
		}
		local4.anInt1312 = local52;
		local9.anInt1312 = local233;
		local14.anInt1312 = local239;
		local19.anInt1312 = local245;
		local24.anInt1312 = local184;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(461) int local461 = 0;
		@Pc(468) int local468;
		@Pc(470) int local470;
		@Pc(480) int local480;
		@Pc(490) int local490;
		for (@Pc(463) int local463 = 0; local463 < local44; local463++) {
			local468 = local4.method773();
			local470 = 0;
			if ((local468 & 0x1) != 0) {
				local470 = local9.method815();
			}
			local480 = 0;
			if ((local468 & 0x2) != 0) {
				local480 = local14.method815();
			}
			local490 = 0;
			if ((local468 & 0x4) != 0) {
				local490 = local19.method815();
			}
			this.anIntArray243[local463] = local457 + local470;
			this.anIntArray242[local463] = local459 + local480;
			this.anIntArray247[local463] = local461 + local490;
			local457 = this.anIntArray243[local463];
			local459 = this.anIntArray242[local463];
			local461 = this.anIntArray247[local463];
			if (local76 == 1) {
				this.anIntArray239[local463] = local24.method773();
			}
		}
		local4.anInt1312 = local225;
		local9.anInt1312 = local151;
		local14.anInt1312 = local166;
		local19.anInt1312 = local193;
		local24.anInt1312 = local175;
		local29.anInt1312 = local208;
		local34.anInt1312 = local219;
		for (local468 = 0; local468 < local48; local468++) {
			this.aShortArray27[local468] = (short) local4.method816();
			if (local56 == 1) {
				this.aByteArray28[local468] = local9.method797();
			}
			if (local60 == 255) {
				this.aByteArray27[local468] = local14.method797();
			}
			if (local64 == 1) {
				this.aByteArray29[local468] = local19.method797();
			}
			if (local68 == 1) {
				this.anIntArray245[local468] = local24.method773();
			}
			if (local72 == 1) {
				this.aShortArray19[local468] = (short) (local29.method816() - 1);
			}
			if (this.aByteArray26 != null && this.aShortArray19[local468] != -1) {
				this.aByteArray26[local468] = (byte) (local34.method773() - 1);
			}
		}
		local4.anInt1312 = local202;
		local9.anInt1312 = local160;
		local470 = 0;
		local480 = 0;
		local490 = 0;
		@Pc(670) int local670 = 0;
		@Pc(677) int local677;
		@Pc(780) int local780;
		for (@Pc(672) int local672 = 0; local672 < local48; local672++) {
			local677 = local9.method773();
			if (local677 == 1) {
				local470 = local4.method815() + local670;
				local480 = local4.method815() + local470;
				local490 = local4.method815() + local480;
				local670 = local490;
				this.anIntArray241[local672] = local470;
				this.anIntArray244[local672] = local480;
				this.anIntArray237[local672] = local490;
			}
			if (local677 == 2) {
				local480 = local490;
				local490 = local4.method815() + local670;
				local670 = local490;
				this.anIntArray241[local672] = local470;
				this.anIntArray244[local672] = local480;
				this.anIntArray237[local672] = local490;
			}
			if (local677 == 3) {
				local470 = local490;
				local490 = local4.method815() + local670;
				local670 = local490;
				this.anIntArray241[local672] = local470;
				this.anIntArray244[local672] = local480;
				this.anIntArray237[local672] = local490;
			}
			if (local677 == 4) {
				local780 = local470;
				local470 = local480;
				local480 = local780;
				local490 = local4.method815() + local670;
				local670 = local490;
				this.anIntArray241[local672] = local470;
				this.anIntArray244[local672] = local780;
				this.anIntArray237[local672] = local490;
			}
		}
		local4.anInt1312 = local251;
		local9.anInt1312 = local259;
		local14.anInt1312 = local267;
		local19.anInt1312 = local275;
		local24.anInt1312 = local283;
		local29.anInt1312 = local289;
		for (local677 = 0; local677 < local52; local677++) {
			local780 = this.aByteArray24[local677] & 0xFF;
			if (local780 == 0) {
				this.aShortArray29[local677] = (short) local4.method816();
				this.aShortArray26[local677] = (short) local4.method816();
				this.aShortArray25[local677] = (short) local4.method816();
			}
			if (local780 == 1) {
				this.aShortArray29[local677] = (short) local9.method816();
				this.aShortArray26[local677] = (short) local9.method816();
				this.aShortArray25[local677] = (short) local9.method816();
				this.aShortArray20[local677] = (short) local14.method816();
				this.aShortArray28[local677] = (short) local14.method816();
				this.aShortArray23[local677] = (short) local14.method816();
				this.aShortArray21[local677] = (short) local19.method816();
				this.aByteArray25[local677] = local24.method797();
				this.aShortArray24[local677] = (short) local29.method816();
			}
			if (local780 == 2) {
				this.aShortArray29[local677] = (short) local9.method816();
				this.aShortArray26[local677] = (short) local9.method816();
				this.aShortArray25[local677] = (short) local9.method816();
				this.aShortArray20[local677] = (short) local14.method816();
				this.aShortArray28[local677] = (short) local14.method816();
				this.aShortArray23[local677] = (short) local14.method816();
				this.aShortArray21[local677] = (short) local19.method816();
				this.aByteArray25[local677] = local24.method797();
				this.aShortArray24[local677] = (short) local29.method816();
				this.aShortArray22[local677] = (short) local29.method816();
			}
			if (local780 == 3) {
				this.aShortArray29[local677] = (short) local9.method816();
				this.aShortArray26[local677] = (short) local9.method816();
				this.aShortArray25[local677] = (short) local9.method816();
				this.aShortArray20[local677] = (short) local14.method816();
				this.aShortArray28[local677] = (short) local14.method816();
				this.aShortArray23[local677] = (short) local14.method816();
				this.aShortArray21[local677] = (short) local19.method816();
				this.aByteArray25[local677] = local24.method797();
				this.aShortArray24[local677] = (short) local29.method816();
			}
		}
		local4.anInt1312 = local113;
		local780 = local4.method773();
		if (local780 == 0) {
			return;
		}
		new Class78();
		local4.method816();
		local4.method816();
		local4.method816();
		local4.method780();
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "([B)V")
	private void method1451(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class4_Sub9 local8 = new Class4_Sub9(arg0);
		@Pc(13) Class4_Sub9 local13 = new Class4_Sub9(arg0);
		@Pc(18) Class4_Sub9 local18 = new Class4_Sub9(arg0);
		@Pc(23) Class4_Sub9 local23 = new Class4_Sub9(arg0);
		@Pc(28) Class4_Sub9 local28 = new Class4_Sub9(arg0);
		local8.anInt1312 = arg0.length - 18;
		@Pc(38) int local38 = local8.method816();
		@Pc(42) int local42 = local8.method816();
		@Pc(46) int local46 = local8.method773();
		@Pc(50) int local50 = local8.method773();
		@Pc(54) int local54 = local8.method773();
		@Pc(58) int local58 = local8.method773();
		@Pc(62) int local62 = local8.method773();
		@Pc(66) int local66 = local8.method773();
		@Pc(70) int local70 = local8.method816();
		@Pc(74) int local74 = local8.method816();
		@Pc(78) int local78 = local8.method816();
		@Pc(82) int local82 = local8.method816();
		@Pc(90) int local90 = local38;
		@Pc(92) int local92 = local90;
		local90 += local42;
		@Pc(98) int local98 = local90;
		if (local54 == 255) {
			local90 += local42;
		}
		@Pc(107) int local107 = local90;
		if (local62 == 1) {
			local90 += local42;
		}
		@Pc(116) int local116 = local90;
		if (local50 == 1) {
			local90 += local42;
		}
		@Pc(125) int local125 = local90;
		if (local66 == 1) {
			local90 += local38;
		}
		@Pc(134) int local134 = local90;
		if (local58 == 1) {
			local90 += local42;
		}
		@Pc(143) int local143 = local90;
		local90 += local82;
		@Pc(149) int local149 = local90;
		local90 += local42 * 2;
		@Pc(157) int local157 = local90;
		local90 += local46 * 6;
		@Pc(165) int local165 = local90;
		local90 += local70;
		@Pc(171) int local171 = local90;
		local90 += local74;
		this.anInt2083 = local38;
		this.anInt2087 = local42;
		this.anInt2084 = local46;
		this.anIntArray243 = new int[local38];
		this.anIntArray242 = new int[local38];
		this.anIntArray247 = new int[local38];
		this.anIntArray241 = new int[local42];
		this.anIntArray244 = new int[local42];
		this.anIntArray237 = new int[local42];
		if (local46 > 0) {
			this.aByteArray24 = new byte[local46];
			this.aShortArray29 = new short[local46];
			this.aShortArray26 = new short[local46];
			this.aShortArray25 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray239 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray28 = new byte[local42];
			this.aByteArray26 = new byte[local42];
			this.aShortArray19 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray27 = new byte[local42];
		} else {
			this.aByte7 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray29 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray245 = new int[local42];
		}
		this.aShortArray27 = new short[local42];
		local8.anInt1312 = 0;
		local13.anInt1312 = local165;
		local18.anInt1312 = local171;
		local23.anInt1312 = local90;
		local28.anInt1312 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method773();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method815();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method815();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method815();
			}
			this.anIntArray243[local307] = local301 + local314;
			this.anIntArray242[local307] = local303 + local324;
			this.anIntArray247[local307] = local305 + local334;
			local301 = this.anIntArray243[local307];
			local303 = this.anIntArray242[local307];
			local305 = this.anIntArray247[local307];
			if (local66 == 1) {
				this.anIntArray239[local307] = local28.method773();
			}
		}
		local8.anInt1312 = local149;
		local13.anInt1312 = local116;
		local18.anInt1312 = local98;
		local23.anInt1312 = local134;
		local28.anInt1312 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray27[local312] = (short) local8.method816();
			if (local50 == 1) {
				local314 = local13.method773();
				if ((local314 & 0x1) == 1) {
					this.aByteArray28[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray28[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray26[local312] = (byte) (local314 >> 2);
					this.aShortArray19[local312] = this.aShortArray27[local312];
					this.aShortArray27[local312] = 127;
					if (this.aShortArray19[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray26[local312] = -1;
					this.aShortArray19[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray27[local312] = local18.method797();
			}
			if (local58 == 1) {
				this.aByteArray29[local312] = local23.method797();
			}
			if (local62 == 1) {
				this.anIntArray245[local312] = local28.method773();
			}
		}
		local8.anInt1312 = local143;
		local13.anInt1312 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method773();
			if (local543 == 1) {
				local314 = local8.method815() + local536;
				local324 = local8.method815() + local314;
				local334 = local8.method815() + local324;
				local536 = local334;
				this.anIntArray241[local538] = local314;
				this.anIntArray244[local538] = local324;
				this.anIntArray237[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method815() + local536;
				local536 = local334;
				this.anIntArray241[local538] = local314;
				this.anIntArray244[local538] = local324;
				this.anIntArray237[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method815() + local536;
				local536 = local334;
				this.anIntArray241[local538] = local314;
				this.anIntArray244[local538] = local324;
				this.anIntArray237[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method815() + local536;
				local536 = local334;
				this.anIntArray241[local538] = local314;
				this.anIntArray244[local538] = local646;
				this.anIntArray237[local538] = local334;
			}
		}
		local8.anInt1312 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray24[local543] = 0;
			this.aShortArray29[local543] = (short) local8.method816();
			this.aShortArray26[local543] = (short) local8.method816();
			this.aShortArray25[local543] = (short) local8.method816();
		}
		if (this.aByteArray26 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray26[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray29[local731] & 0xFFFF) == this.anIntArray241[local723] && (this.aShortArray26[local731] & 0xFFFF) == this.anIntArray244[local723] && (this.aShortArray25[local731] & 0xFFFF) == this.anIntArray237[local723]) {
						this.aByteArray26[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray26 = null;
			}
		}
		if (!local3) {
			this.aShortArray19 = null;
		}
		if (!local1) {
			this.aByteArray28 = null;
		}
	}

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "()V")
	public void method1452() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2083; local1++) {
			@Pc(7) int local7 = this.anIntArray247[local1];
			this.anIntArray247[local1] = this.anIntArray243[local1];
			this.anIntArray243[local1] = -local7;
		}
		this.method1447();
	}

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "()V")
	public void method1453() {
		if (this.aClass30Array1 != null) {
			return;
		}
		this.aClass30Array1 = new Class30[this.anInt2083];
		for (@Pc(10) int local10 = 0; local10 < this.anInt2083; local10++) {
			this.aClass30Array1[local10] = new Class30();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt2087; local25++) {
			@Pc(31) int local31 = this.anIntArray241[local25];
			@Pc(36) int local36 = this.anIntArray244[local25];
			@Pc(41) int local41 = this.anIntArray237[local25];
			@Pc(51) int local51 = this.anIntArray243[local36] - this.anIntArray243[local31];
			@Pc(61) int local61 = this.anIntArray242[local36] - this.anIntArray242[local31];
			@Pc(71) int local71 = this.anIntArray247[local36] - this.anIntArray247[local31];
			@Pc(81) int local81 = this.anIntArray243[local41] - this.anIntArray243[local31];
			@Pc(91) int local91 = this.anIntArray242[local41] - this.anIntArray242[local31];
			@Pc(101) int local101 = this.anIntArray247[local41] - this.anIntArray247[local31];
			@Pc(109) int local109 = local61 * local101 - local91 * local71;
			@Pc(117) int local117 = local71 * local81 - local101 * local51;
			@Pc(125) int local125;
			for (local125 = local51 * local91 - local81 * local61; local109 > 8192 || local117 > 8192 || local125 > 8192 || local109 < -8192 || local117 < -8192 || local125 < -8192; local125 >>= 0x1) {
				local109 >>= 0x1;
				local117 >>= 0x1;
			}
			@Pc(171) int local171 = (int) Math.sqrt((double) (local109 * local109 + local117 * local117 + local125 * local125));
			if (local171 <= 0) {
				local171 = 1;
			}
			local109 = local109 * 256 / local171;
			local117 = local117 * 256 / local171;
			local125 = local125 * 256 / local171;
			@Pc(198) byte local198;
			if (this.aByteArray28 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray28[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class30 local211 = this.aClass30Array1[local31];
				local211.anInt1123 += local109;
				local211.anInt1125 += local117;
				local211.anInt1124 += local125;
				local211.anInt1129++;
				@Pc(240) Class30 local240 = this.aClass30Array1[local36];
				local240.anInt1123 += local109;
				local240.anInt1125 += local117;
				local240.anInt1124 += local125;
				local240.anInt1129++;
				@Pc(269) Class30 local269 = this.aClass30Array1[local41];
				local269.anInt1123 += local109;
				local269.anInt1125 += local117;
				local269.anInt1124 += local125;
				local269.anInt1129++;
			} else if (local198 == 1) {
				if (this.aClass47Array1 == null) {
					this.aClass47Array1 = new Class47[this.anInt2087];
				}
				@Pc(314) Class47 local314 = this.aClass47Array1[local25] = new Class47();
				local314.anInt1592 = local109;
				local314.anInt1595 = local117;
				local314.anInt1594 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "()V")
	private void method1454() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray239 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt2083; local9++) {
				local15 = this.anIntArray239[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray57 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray57[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt2083) {
				local65 = this.anIntArray239[local59];
				this.anIntArrayArray57[local65][local5[local65]++] = local59++;
			}
			this.anIntArray239 = null;
		}
		if (this.anIntArray245 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt2087; local9++) {
			local15 = this.anIntArray245[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray56 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray56[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt2087) {
			local65 = this.anIntArray245[local59];
			this.anIntArrayArray56[local65][local5[local65]++] = local59++;
		}
		this.anIntArray245 = null;
	}
}
