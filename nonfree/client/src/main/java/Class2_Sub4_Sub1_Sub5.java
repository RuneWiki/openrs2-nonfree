import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class2_Sub4_Sub1_Sub5 extends Class2_Sub4_Sub1 {

	@OriginalMember(owner = "client!ka", name = "Fb", descriptor = "I")
	public int anInt2180;

	@OriginalMember(owner = "client!ka", name = "Hb", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!ka", name = "Ib", descriptor = "[I")
	public int[] anIntArray205;

	@OriginalMember(owner = "client!ka", name = "Kb", descriptor = "[I")
	public int[] anIntArray207;

	@OriginalMember(owner = "client!ka", name = "Lb", descriptor = "[S")
	public short[] aShortArray20;

	@OriginalMember(owner = "client!ka", name = "Mb", descriptor = "[S")
	public short[] aShortArray21;

	@OriginalMember(owner = "client!ka", name = "Nb", descriptor = "[B")
	public byte[] aByteArray22;

	@OriginalMember(owner = "client!ka", name = "Ob", descriptor = "[I")
	public int[] anIntArray208;

	@OriginalMember(owner = "client!ka", name = "Pb", descriptor = "[I")
	private int[] anIntArray209;

	@OriginalMember(owner = "client!ka", name = "Qb", descriptor = "S")
	public short aShort28;

	@OriginalMember(owner = "client!ka", name = "Rb", descriptor = "[S")
	public short[] aShortArray22;

	@OriginalMember(owner = "client!ka", name = "Sb", descriptor = "[B")
	public byte[] aByteArray23;

	@OriginalMember(owner = "client!ka", name = "Tb", descriptor = "S")
	public short aShort29;

	@OriginalMember(owner = "client!ka", name = "Ub", descriptor = "S")
	public short aShort30;

	@OriginalMember(owner = "client!ka", name = "Vb", descriptor = "[B")
	private byte[] aByteArray24;

	@OriginalMember(owner = "client!ka", name = "Wb", descriptor = "[B")
	public byte[] aByteArray25;

	@OriginalMember(owner = "client!ka", name = "Xb", descriptor = "[Lclient!ed;")
	public Class20[] aClass20Array1;

	@OriginalMember(owner = "client!ka", name = "Yb", descriptor = "[B")
	private byte[] aByteArray26;

	@OriginalMember(owner = "client!ka", name = "ac", descriptor = "[Lclient!ed;")
	public Class20[] aClass20Array2;

	@OriginalMember(owner = "client!ka", name = "bc", descriptor = "[B")
	private byte[] aByteArray27;

	@OriginalMember(owner = "client!ka", name = "cc", descriptor = "S")
	public short aShort31;

	@OriginalMember(owner = "client!ka", name = "dc", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!ka", name = "ec", descriptor = "[S")
	public short[] aShortArray24;

	@OriginalMember(owner = "client!ka", name = "fc", descriptor = "[[I")
	public int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!ka", name = "ic", descriptor = "S")
	public short aShort32;

	@OriginalMember(owner = "client!ka", name = "jc", descriptor = "[B")
	private byte[] aByteArray28;

	@OriginalMember(owner = "client!ka", name = "kc", descriptor = "[I")
	public int[] anIntArray213;

	@OriginalMember(owner = "client!ka", name = "mc", descriptor = "S")
	public short aShort33;

	@OriginalMember(owner = "client!ka", name = "nc", descriptor = "[I")
	public int[] anIntArray214;

	@OriginalMember(owner = "client!ka", name = "oc", descriptor = "[I")
	public int[] anIntArray215;

	@OriginalMember(owner = "client!ka", name = "pc", descriptor = "[B")
	public byte[] aByteArray29;

	@OriginalMember(owner = "client!ka", name = "rc", descriptor = "[B")
	private byte[] aByteArray30;

	@OriginalMember(owner = "client!ka", name = "sc", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!ka", name = "tc", descriptor = "[I")
	private int[] anIntArray216;

	@OriginalMember(owner = "client!ka", name = "uc", descriptor = "[Lclient!hc;")
	public Class30[] aClass30Array1;

	@OriginalMember(owner = "client!ka", name = "vc", descriptor = "[[I")
	public int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!ka", name = "wc", descriptor = "S")
	public short aShort34;

	@OriginalMember(owner = "client!ka", name = "xc", descriptor = "[S")
	public short[] aShortArray26;

	@OriginalMember(owner = "client!ka", name = "yc", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!ka", name = "Eb", descriptor = "I")
	public int anInt2179 = 0;

	@OriginalMember(owner = "client!ka", name = "qc", descriptor = "I")
	public int anInt2182 = 0;

	@OriginalMember(owner = "client!ka", name = "lc", descriptor = "B")
	public byte aByte4 = 0;

	@OriginalMember(owner = "client!ka", name = "zc", descriptor = "Z")
	private boolean aBoolean108 = false;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	private Class2_Sub4_Sub1_Sub5() {
	}

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "([B)V")
	public Class2_Sub4_Sub1_Sub5(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1533(arg0);
		} else {
			this.method1532(arg0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "([Lclient!ka;I)V")
	public Class2_Sub4_Sub1_Sub5(@OriginalArg(0) Class2_Sub4_Sub1_Sub5[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt2179 = 0;
		this.anInt2182 = 0;
		this.anInt2180 = 0;
		this.aByte4 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class2_Sub4_Sub1_Sub5 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt2179 += local44.anInt2179;
				this.anInt2182 += local44.anInt2182;
				this.anInt2180 += local44.anInt2180;
				if (local44.aByteArray25 == null) {
					if (this.aByte4 == -1) {
						this.aByte4 = local44.aByte4;
					}
					if (this.aByte4 != local44.aByte4) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray22 != null;
				local19 |= local44.aByteArray23 != null;
				local21 |= local44.anIntArray209 != null;
				local23 |= local44.aShortArray21 != null;
				local25 |= local44.aByteArray31 != null;
			}
		}
		this.anIntArray215 = new int[this.anInt2179];
		this.anIntArray213 = new int[this.anInt2179];
		this.anIntArray214 = new int[this.anInt2179];
		this.anIntArray216 = new int[this.anInt2179];
		this.anIntArray208 = new int[this.anInt2182];
		this.anIntArray207 = new int[this.anInt2182];
		this.anIntArray205 = new int[this.anInt2182];
		if (local15) {
			this.aByteArray22 = new byte[this.anInt2182];
		}
		if (local17) {
			this.aByteArray25 = new byte[this.anInt2182];
		}
		if (local19) {
			this.aByteArray23 = new byte[this.anInt2182];
		}
		if (local21) {
			this.anIntArray209 = new int[this.anInt2182];
		}
		if (local23) {
			this.aShortArray21 = new short[this.anInt2182];
		}
		if (local25) {
			this.aByteArray31 = new byte[this.anInt2182];
		}
		this.aShortArray20 = new short[this.anInt2182];
		if (this.anInt2180 > 0) {
			this.aByteArray29 = new byte[this.anInt2180];
			this.aShortArray22 = new short[this.anInt2180];
			this.aShortArray24 = new short[this.anInt2180];
			this.aShortArray26 = new short[this.anInt2180];
			this.aShortArray19 = new short[this.anInt2180];
			this.aShortArray23 = new short[this.anInt2180];
			this.aShortArray25 = new short[this.anInt2180];
			this.aByteArray28 = new byte[this.anInt2180];
			this.aByteArray24 = new byte[this.anInt2180];
			this.aByteArray27 = new byte[this.anInt2180];
			this.aByteArray30 = new byte[this.anInt2180];
			this.aByteArray26 = new byte[this.anInt2180];
		}
		this.anInt2179 = 0;
		this.anInt2182 = 0;
		this.anInt2180 = 0;
		for (@Pc(293) int local293 = 0; local293 < arg1; local293++) {
			@Pc(298) Class2_Sub4_Sub1_Sub5 local298 = arg0[local293];
			if (local298 != null) {
				for (@Pc(302) int local302 = 0; local302 < local298.anInt2182; local302++) {
					if (local15 && local298.aByteArray22 != null) {
						this.aByteArray22[this.anInt2182] = local298.aByteArray22[local302];
					}
					if (local17) {
						if (local298.aByteArray25 == null) {
							this.aByteArray25[this.anInt2182] = local298.aByte4;
						} else {
							this.aByteArray25[this.anInt2182] = local298.aByteArray25[local302];
						}
					}
					if (local19 && local298.aByteArray23 != null) {
						this.aByteArray23[this.anInt2182] = local298.aByteArray23[local302];
					}
					if (local21 && local298.anIntArray209 != null) {
						this.anIntArray209[this.anInt2182] = local298.anIntArray209[local302];
					}
					if (local23) {
						if (local298.aShortArray21 == null) {
							this.aShortArray21[this.anInt2182] = -1;
						} else {
							this.aShortArray21[this.anInt2182] = local298.aShortArray21[local302];
						}
					}
					if (local25) {
						if (local298.aByteArray31 == null || local298.aByteArray31[local302] == -1) {
							this.aByteArray31[this.anInt2182] = -1;
						} else {
							this.aByteArray31[this.anInt2182] = (byte) (local298.aByteArray31[local302] + this.anInt2180);
						}
					}
					this.aShortArray20[this.anInt2182] = local298.aShortArray20[local302];
					this.anIntArray208[this.anInt2182] = this.method1541(local298, local298.anIntArray208[local302]);
					this.anIntArray207[this.anInt2182] = this.method1541(local298, local298.anIntArray207[local302]);
					this.anIntArray205[this.anInt2182] = this.method1541(local298, local298.anIntArray205[local302]);
					this.anInt2182++;
				}
				for (@Pc(477) int local477 = 0; local477 < local298.anInt2180; local477++) {
					@Pc(489) byte local489 = this.aByteArray29[this.anInt2180] = local298.aByteArray29[local477];
					if (local489 == 0) {
						this.aShortArray22[this.anInt2180] = (short) this.method1541(local298, local298.aShortArray22[local477]);
						this.aShortArray24[this.anInt2180] = (short) this.method1541(local298, local298.aShortArray24[local477]);
						this.aShortArray26[this.anInt2180] = (short) this.method1541(local298, local298.aShortArray26[local477]);
					}
					if (local489 >= 1 && local489 <= 3) {
						this.aShortArray22[this.anInt2180] = local298.aShortArray22[local477];
						this.aShortArray24[this.anInt2180] = local298.aShortArray24[local477];
						this.aShortArray26[this.anInt2180] = local298.aShortArray26[local477];
						this.aShortArray19[this.anInt2180] = local298.aShortArray19[local477];
						this.aShortArray23[this.anInt2180] = local298.aShortArray23[local477];
						this.aShortArray25[this.anInt2180] = local298.aShortArray25[local477];
						this.aByteArray28[this.anInt2180] = local298.aByteArray28[local477];
						this.aByteArray24[this.anInt2180] = local298.aByteArray24[local477];
						this.aByteArray27[this.anInt2180] = local298.aByteArray27[local477];
					}
					if (local489 == 2) {
						this.aByteArray30[this.anInt2180] = local298.aByteArray30[local477];
						this.aByteArray26[this.anInt2180] = local298.aByteArray26[local477];
					}
					this.anInt2180++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lclient!ka;ZZZZ)V")
	public Class2_Sub4_Sub1_Sub5(@OriginalArg(0) Class2_Sub4_Sub1_Sub5 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2179 = arg0.anInt2179;
		this.anInt2182 = arg0.anInt2182;
		this.anInt2180 = arg0.anInt2180;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray215 = arg0.anIntArray215;
			this.anIntArray213 = arg0.anIntArray213;
			this.anIntArray214 = arg0.anIntArray214;
		} else {
			this.anIntArray215 = new int[this.anInt2179];
			this.anIntArray213 = new int[this.anInt2179];
			this.anIntArray214 = new int[this.anInt2179];
			for (local57 = 0; local57 < this.anInt2179; local57++) {
				this.anIntArray215[local57] = arg0.anIntArray215[local57];
				this.anIntArray213[local57] = arg0.anIntArray213[local57];
				this.anIntArray214[local57] = arg0.anIntArray214[local57];
			}
		}
		if (arg2) {
			this.aShortArray20 = arg0.aShortArray20;
		} else {
			this.aShortArray20 = new short[this.anInt2182];
			for (local57 = 0; local57 < this.anInt2182; local57++) {
				this.aShortArray20[local57] = arg0.aShortArray20[local57];
			}
		}
		if (arg3 || arg0.aShortArray21 == null) {
			this.aShortArray21 = arg0.aShortArray21;
		} else {
			this.aShortArray21 = new short[this.anInt2182];
			for (local57 = 0; local57 < this.anInt2182; local57++) {
				this.aShortArray21[local57] = arg0.aShortArray21[local57];
			}
		}
		this.aByteArray23 = arg0.aByteArray23;
		this.anIntArray208 = arg0.anIntArray208;
		this.anIntArray207 = arg0.anIntArray207;
		this.anIntArray205 = arg0.anIntArray205;
		this.aByteArray22 = arg0.aByteArray22;
		this.aByteArray25 = arg0.aByteArray25;
		this.aByteArray31 = arg0.aByteArray31;
		this.aByte4 = arg0.aByte4;
		this.aByteArray29 = arg0.aByteArray29;
		this.aShortArray22 = arg0.aShortArray22;
		this.aShortArray24 = arg0.aShortArray24;
		this.aShortArray26 = arg0.aShortArray26;
		this.aShortArray19 = arg0.aShortArray19;
		this.aShortArray23 = arg0.aShortArray23;
		this.aShortArray25 = arg0.aShortArray25;
		this.aByteArray28 = arg0.aByteArray28;
		this.aByteArray24 = arg0.aByteArray24;
		this.aByteArray27 = arg0.aByteArray27;
		this.aByteArray30 = arg0.aByteArray30;
		this.aByteArray26 = arg0.aByteArray26;
		this.anIntArray216 = arg0.anIntArray216;
		this.anIntArray209 = arg0.anIntArray209;
		this.anIntArrayArray21 = arg0.anIntArrayArray21;
		this.anIntArrayArray20 = arg0.anIntArrayArray20;
		this.aClass20Array2 = arg0.aClass20Array2;
		this.aClass30Array1 = arg0.aClass30Array1;
		this.aClass20Array1 = arg0.aClass20Array1;
		this.aShort34 = arg0.aShort34;
		this.aShort32 = arg0.aShort32;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([[IIIIZI)Lclient!ka;")
	public Class2_Sub4_Sub1_Sub5 method1526(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method1538();
		@Pc(6) int local6 = arg1 + this.aShort30;
		@Pc(11) int local11 = arg1 + this.aShort29;
		@Pc(16) int local16 = arg3 + this.aShort31;
		@Pc(21) int local21 = arg3 + this.aShort28;
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
		@Pc(101) Class2_Sub4_Sub1_Sub5 local101 = new Class2_Sub4_Sub1_Sub5();
		local101.anInt2179 = this.anInt2179;
		local101.anInt2182 = this.anInt2182;
		local101.anInt2180 = this.anInt2180;
		local101.anIntArray215 = this.anIntArray215;
		local101.anIntArray214 = this.anIntArray214;
		local101.anIntArray208 = this.anIntArray208;
		local101.anIntArray207 = this.anIntArray207;
		local101.anIntArray205 = this.anIntArray205;
		local101.aByteArray22 = this.aByteArray22;
		local101.aByteArray25 = this.aByteArray25;
		local101.aByteArray23 = this.aByteArray23;
		local101.aByteArray31 = this.aByteArray31;
		local101.aShortArray20 = this.aShortArray20;
		local101.aShortArray21 = this.aShortArray21;
		local101.aByte4 = this.aByte4;
		local101.aByteArray29 = this.aByteArray29;
		local101.aShortArray22 = this.aShortArray22;
		local101.aShortArray24 = this.aShortArray24;
		local101.aShortArray26 = this.aShortArray26;
		local101.aShortArray19 = this.aShortArray19;
		local101.aShortArray23 = this.aShortArray23;
		local101.aShortArray25 = this.aShortArray25;
		local101.aByteArray28 = this.aByteArray28;
		local101.aByteArray24 = this.aByteArray24;
		local101.aByteArray27 = this.aByteArray27;
		local101.aByteArray30 = this.aByteArray30;
		local101.aByteArray26 = this.aByteArray26;
		local101.anIntArray216 = this.anIntArray216;
		local101.anIntArray209 = this.anIntArray209;
		local101.anIntArrayArray21 = this.anIntArrayArray21;
		local101.anIntArrayArray20 = this.anIntArrayArray20;
		local101.aShort34 = this.aShort34;
		local101.aShort32 = this.aShort32;
		local101.anIntArray213 = new int[local101.anInt2179];
		@Pc(245) int local245;
		@Pc(253) int local253;
		@Pc(260) int local260;
		@Pc(264) int local264;
		@Pc(268) int local268;
		@Pc(272) int local272;
		@Pc(276) int local276;
		@Pc(298) int local298;
		@Pc(324) int local324;
		@Pc(336) int local336;
		if (arg4 == 0) {
			for (local245 = 0; local245 < local101.anInt2179; local245++) {
				local253 = this.anIntArray215[local245] + arg1;
				local260 = this.anIntArray214[local245] + arg3;
				local264 = local253 & 0x7F;
				local268 = local260 & 0x7F;
				local272 = local253 >> 7;
				local276 = local260 >> 7;
				local298 = arg0[local272][local276] * (128 - local264) + arg0[local272 + 1][local276] * local264 >> 7;
				local324 = arg0[local272][local276 + 1] * (128 - local264) + arg0[local272 + 1][local276 + 1] * local264 >> 7;
				local336 = local298 * (128 - local268) + local324 * local268 >> 7;
				local101.anIntArray213[local245] = this.anIntArray213[local245] + local336 - arg2;
			}
		} else {
			for (local245 = 0; local245 < local101.anInt2179; local245++) {
				local253 = (this.anIntArray213[local245] << 16) / super.aShort36;
				if (local253 < arg4) {
					local260 = this.anIntArray215[local245] + arg1;
					local264 = this.anIntArray214[local245] + arg3;
					local268 = local260 & 0x7F;
					local272 = local264 & 0x7F;
					local276 = local260 >> 7;
					local298 = local264 >> 7;
					local324 = arg0[local276][local298] * (128 - local268) + arg0[local276 + 1][local298] * local268 >> 7;
					local336 = arg0[local276][local298 + 1] * (128 - local268) + arg0[local276 + 1][local298 + 1] * local268 >> 7;
					@Pc(460) int local460 = local324 * (128 - local272) + local336 * local272 >> 7;
					local101.anIntArray213[local245] = this.anIntArray213[local245] + (local460 - arg2) * (arg4 - local253) / arg4;
				} else {
					local101.anIntArray213[local245] = this.anIntArray213[local245];
				}
			}
		}
		local101.method1529();
		return local101;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
	public void method1527() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2179; local1++) {
			this.anIntArray214[local1] = -this.anIntArray214[local1];
		}
		this.method1529();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)V")
	public void method1528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2179; local1++) {
			this.anIntArray215[local1] = this.anIntArray215[local1] * arg0 / 128;
			this.anIntArray213[local1] = this.anIntArray213[local1] * arg1 / 128;
			this.anIntArray214[local1] = this.anIntArray214[local1] * arg2 / 128;
		}
		this.method1529();
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
	private void method1529() {
		this.aClass20Array2 = null;
		this.aClass20Array1 = null;
		this.aClass30Array1 = null;
		this.aBoolean108 = false;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(SS)V")
	public void method1531(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2182; local1++) {
			if (this.aShortArray20[local1] == arg0) {
				this.aShortArray20[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([B)V")
	private void method1532(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class2_Sub2 local8 = new Class2_Sub2(arg0);
		@Pc(13) Class2_Sub2 local13 = new Class2_Sub2(arg0);
		@Pc(18) Class2_Sub2 local18 = new Class2_Sub2(arg0);
		@Pc(23) Class2_Sub2 local23 = new Class2_Sub2(arg0);
		@Pc(28) Class2_Sub2 local28 = new Class2_Sub2(arg0);
		local8.anInt2385 = arg0.length - 18;
		@Pc(38) int local38 = local8.method1680();
		@Pc(42) int local42 = local8.method1680();
		@Pc(46) int local46 = local8.method1698();
		@Pc(50) int local50 = local8.method1698();
		@Pc(54) int local54 = local8.method1698();
		@Pc(58) int local58 = local8.method1698();
		@Pc(62) int local62 = local8.method1698();
		@Pc(66) int local66 = local8.method1698();
		@Pc(70) int local70 = local8.method1680();
		@Pc(74) int local74 = local8.method1680();
		@Pc(78) int local78 = local8.method1680();
		@Pc(82) int local82 = local8.method1680();
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
		this.anInt2179 = local38;
		this.anInt2182 = local42;
		this.anInt2180 = local46;
		this.anIntArray215 = new int[local38];
		this.anIntArray213 = new int[local38];
		this.anIntArray214 = new int[local38];
		this.anIntArray208 = new int[local42];
		this.anIntArray207 = new int[local42];
		this.anIntArray205 = new int[local42];
		if (local46 > 0) {
			this.aByteArray29 = new byte[local46];
			this.aShortArray22 = new short[local46];
			this.aShortArray24 = new short[local46];
			this.aShortArray26 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray216 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray22 = new byte[local42];
			this.aByteArray31 = new byte[local42];
			this.aShortArray21 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray25 = new byte[local42];
		} else {
			this.aByte4 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray23 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray209 = new int[local42];
		}
		this.aShortArray20 = new short[local42];
		local8.anInt2385 = 0;
		local13.anInt2385 = local165;
		local18.anInt2385 = local171;
		local23.anInt2385 = local90;
		local28.anInt2385 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method1698();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method1669();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method1669();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method1669();
			}
			this.anIntArray215[local307] = local301 + local314;
			this.anIntArray213[local307] = local303 + local324;
			this.anIntArray214[local307] = local305 + local334;
			local301 = this.anIntArray215[local307];
			local303 = this.anIntArray213[local307];
			local305 = this.anIntArray214[local307];
			if (local66 == 1) {
				this.anIntArray216[local307] = local28.method1698();
			}
		}
		local8.anInt2385 = local149;
		local13.anInt2385 = local116;
		local18.anInt2385 = local98;
		local23.anInt2385 = local134;
		local28.anInt2385 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray20[local312] = (short) local8.method1680();
			if (local50 == 1) {
				local314 = local13.method1698();
				if ((local314 & 0x1) == 1) {
					this.aByteArray22[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray22[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray31[local312] = (byte) (local314 >> 2);
					this.aShortArray21[local312] = this.aShortArray20[local312];
					this.aShortArray20[local312] = 127;
					if (this.aShortArray21[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray31[local312] = -1;
					this.aShortArray21[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray25[local312] = local18.method1707();
			}
			if (local58 == 1) {
				this.aByteArray23[local312] = local23.method1707();
			}
			if (local62 == 1) {
				this.anIntArray209[local312] = local28.method1698();
			}
		}
		local8.anInt2385 = local143;
		local13.anInt2385 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method1698();
			if (local543 == 1) {
				local314 = local8.method1669() + local536;
				local324 = local8.method1669() + local314;
				local334 = local8.method1669() + local324;
				local536 = local334;
				this.anIntArray208[local538] = local314;
				this.anIntArray207[local538] = local324;
				this.anIntArray205[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method1669() + local536;
				local536 = local334;
				this.anIntArray208[local538] = local314;
				this.anIntArray207[local538] = local324;
				this.anIntArray205[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method1669() + local536;
				local536 = local334;
				this.anIntArray208[local538] = local314;
				this.anIntArray207[local538] = local324;
				this.anIntArray205[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method1669() + local536;
				local536 = local334;
				this.anIntArray208[local538] = local314;
				this.anIntArray207[local538] = local646;
				this.anIntArray205[local538] = local334;
			}
		}
		local8.anInt2385 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray29[local543] = 0;
			this.aShortArray22[local543] = (short) local8.method1680();
			this.aShortArray24[local543] = (short) local8.method1680();
			this.aShortArray26[local543] = (short) local8.method1680();
		}
		if (this.aByteArray31 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray31[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray22[local731] & 0xFFFF) == this.anIntArray208[local723] && (this.aShortArray24[local731] & 0xFFFF) == this.anIntArray207[local723] && (this.aShortArray26[local731] & 0xFFFF) == this.anIntArray205[local723]) {
						this.aByteArray31[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray31 = null;
			}
		}
		if (!local3) {
			this.aShortArray21 = null;
		}
		if (!local1) {
			this.aByteArray22 = null;
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "([B)V")
	private void method1533(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class2_Sub2 local4 = new Class2_Sub2(arg0);
		@Pc(9) Class2_Sub2 local9 = new Class2_Sub2(arg0);
		@Pc(14) Class2_Sub2 local14 = new Class2_Sub2(arg0);
		@Pc(19) Class2_Sub2 local19 = new Class2_Sub2(arg0);
		@Pc(24) Class2_Sub2 local24 = new Class2_Sub2(arg0);
		@Pc(29) Class2_Sub2 local29 = new Class2_Sub2(arg0);
		@Pc(34) Class2_Sub2 local34 = new Class2_Sub2(arg0);
		local4.anInt2385 = arg0.length - 23;
		@Pc(44) int local44 = local4.method1680();
		@Pc(48) int local48 = local4.method1680();
		@Pc(52) int local52 = local4.method1698();
		@Pc(56) int local56 = local4.method1698();
		@Pc(60) int local60 = local4.method1698();
		@Pc(64) int local64 = local4.method1698();
		@Pc(68) int local68 = local4.method1698();
		@Pc(72) int local72 = local4.method1698();
		@Pc(76) int local76 = local4.method1698();
		@Pc(80) int local80 = local4.method1680();
		@Pc(84) int local84 = local4.method1680();
		@Pc(88) int local88 = local4.method1680();
		@Pc(92) int local92 = local4.method1680();
		@Pc(96) int local96 = local4.method1680();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray29 = new byte[local52];
			local4.anInt2385 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray29[local113] = local4.method1707();
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
		local113 += local100;
		@Pc(281) int local281 = local113;
		local113 += local100;
		@Pc(287) int local287 = local113;
		local113 += local100 + local102 * 2;
		this.anInt2179 = local44;
		this.anInt2182 = local48;
		this.anInt2180 = local52;
		this.anIntArray215 = new int[local44];
		this.anIntArray213 = new int[local44];
		this.anIntArray214 = new int[local44];
		this.anIntArray208 = new int[local48];
		this.anIntArray207 = new int[local48];
		this.anIntArray205 = new int[local48];
		if (local76 == 1) {
			this.anIntArray216 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray22 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray25 = new byte[local48];
		} else {
			this.aByte4 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray23 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray209 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray21 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray31 = new byte[local48];
		}
		this.aShortArray20 = new short[local48];
		if (local52 > 0) {
			this.aShortArray22 = new short[local52];
			this.aShortArray24 = new short[local52];
			this.aShortArray26 = new short[local52];
			if (local100 > 0) {
				this.aShortArray19 = new short[local100];
				this.aShortArray23 = new short[local100];
				this.aShortArray25 = new short[local100];
				this.aByteArray28 = new byte[local100];
				this.aByteArray24 = new byte[local100];
				this.aByteArray27 = new byte[local100];
			}
			if (local102 > 0) {
				this.aByteArray30 = new byte[local102];
				this.aByteArray26 = new byte[local102];
			}
		}
		local4.anInt2385 = local52;
		local9.anInt2385 = local233;
		local14.anInt2385 = local239;
		local19.anInt2385 = local245;
		local24.anInt2385 = local184;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(461) int local461 = 0;
		@Pc(468) int local468;
		@Pc(470) int local470;
		@Pc(480) int local480;
		@Pc(490) int local490;
		for (@Pc(463) int local463 = 0; local463 < local44; local463++) {
			local468 = local4.method1698();
			local470 = 0;
			if ((local468 & 0x1) != 0) {
				local470 = local9.method1669();
			}
			local480 = 0;
			if ((local468 & 0x2) != 0) {
				local480 = local14.method1669();
			}
			local490 = 0;
			if ((local468 & 0x4) != 0) {
				local490 = local19.method1669();
			}
			this.anIntArray215[local463] = local457 + local470;
			this.anIntArray213[local463] = local459 + local480;
			this.anIntArray214[local463] = local461 + local490;
			local457 = this.anIntArray215[local463];
			local459 = this.anIntArray213[local463];
			local461 = this.anIntArray214[local463];
			if (local76 == 1) {
				this.anIntArray216[local463] = local24.method1698();
			}
		}
		local4.anInt2385 = local225;
		local9.anInt2385 = local151;
		local14.anInt2385 = local166;
		local19.anInt2385 = local193;
		local24.anInt2385 = local175;
		local29.anInt2385 = local208;
		local34.anInt2385 = local219;
		for (local468 = 0; local468 < local48; local468++) {
			this.aShortArray20[local468] = (short) local4.method1680();
			if (local56 == 1) {
				this.aByteArray22[local468] = local9.method1707();
			}
			if (local60 == 255) {
				this.aByteArray25[local468] = local14.method1707();
			}
			if (local64 == 1) {
				this.aByteArray23[local468] = local19.method1707();
			}
			if (local68 == 1) {
				this.anIntArray209[local468] = local24.method1698();
			}
			if (local72 == 1) {
				this.aShortArray21[local468] = (short) (local29.method1680() - 1);
			}
			if (this.aByteArray31 != null) {
				if (this.aShortArray21[local468] == -1) {
					this.aByteArray31[local468] = -1;
				} else {
					this.aByteArray31[local468] = (byte) (local34.method1698() - 1);
				}
			}
		}
		local4.anInt2385 = local202;
		local9.anInt2385 = local160;
		local470 = 0;
		local480 = 0;
		local490 = 0;
		@Pc(676) int local676 = 0;
		@Pc(683) int local683;
		@Pc(786) int local786;
		for (@Pc(678) int local678 = 0; local678 < local48; local678++) {
			local683 = local9.method1698();
			if (local683 == 1) {
				local470 = local4.method1669() + local676;
				local480 = local4.method1669() + local470;
				local490 = local4.method1669() + local480;
				local676 = local490;
				this.anIntArray208[local678] = local470;
				this.anIntArray207[local678] = local480;
				this.anIntArray205[local678] = local490;
			}
			if (local683 == 2) {
				local480 = local490;
				local490 = local4.method1669() + local676;
				local676 = local490;
				this.anIntArray208[local678] = local470;
				this.anIntArray207[local678] = local480;
				this.anIntArray205[local678] = local490;
			}
			if (local683 == 3) {
				local470 = local490;
				local490 = local4.method1669() + local676;
				local676 = local490;
				this.anIntArray208[local678] = local470;
				this.anIntArray207[local678] = local480;
				this.anIntArray205[local678] = local490;
			}
			if (local683 == 4) {
				local786 = local470;
				local470 = local480;
				local480 = local786;
				local490 = local4.method1669() + local676;
				local676 = local490;
				this.anIntArray208[local678] = local470;
				this.anIntArray207[local678] = local786;
				this.anIntArray205[local678] = local490;
			}
		}
		local4.anInt2385 = local251;
		local9.anInt2385 = local259;
		local14.anInt2385 = local267;
		local19.anInt2385 = local275;
		local24.anInt2385 = local281;
		local29.anInt2385 = local287;
		for (local683 = 0; local683 < local52; local683++) {
			local786 = this.aByteArray29[local683] & 0xFF;
			if (local786 == 0) {
				this.aShortArray22[local683] = (short) local4.method1680();
				this.aShortArray24[local683] = (short) local4.method1680();
				this.aShortArray26[local683] = (short) local4.method1680();
			}
			if (local786 == 1) {
				this.aShortArray22[local683] = (short) local9.method1680();
				this.aShortArray24[local683] = (short) local9.method1680();
				this.aShortArray26[local683] = (short) local9.method1680();
				this.aShortArray19[local683] = (short) local14.method1680();
				this.aShortArray23[local683] = (short) local14.method1680();
				this.aShortArray25[local683] = (short) local14.method1680();
				this.aByteArray28[local683] = local19.method1707();
				this.aByteArray24[local683] = local24.method1707();
				this.aByteArray27[local683] = local29.method1707();
			}
			if (local786 == 2) {
				this.aShortArray22[local683] = (short) local9.method1680();
				this.aShortArray24[local683] = (short) local9.method1680();
				this.aShortArray26[local683] = (short) local9.method1680();
				this.aShortArray19[local683] = (short) local14.method1680();
				this.aShortArray23[local683] = (short) local14.method1680();
				this.aShortArray25[local683] = (short) local14.method1680();
				this.aByteArray28[local683] = local19.method1707();
				this.aByteArray24[local683] = local24.method1707();
				this.aByteArray27[local683] = local29.method1707();
				this.aByteArray30[local683] = local29.method1707();
				this.aByteArray26[local683] = local29.method1707();
			}
			if (local786 == 3) {
				this.aShortArray22[local683] = (short) local9.method1680();
				this.aShortArray24[local683] = (short) local9.method1680();
				this.aShortArray26[local683] = (short) local9.method1680();
				this.aShortArray19[local683] = (short) local14.method1680();
				this.aShortArray23[local683] = (short) local14.method1680();
				this.aShortArray25[local683] = (short) local14.method1680();
				this.aByteArray28[local683] = local19.method1707();
				this.aByteArray24[local683] = local24.method1707();
				this.aByteArray27[local683] = local29.method1707();
			}
		}
		local4.anInt2385 = local113;
		local786 = local4.method1698();
		if (local786 == 0) {
			return;
		}
		new Class11();
		local4.method1680();
		local4.method1680();
		local4.method1680();
		local4.method1690();
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
	public void method1534() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2182; local1++) {
			@Pc(7) int local7 = this.anIntArray208[local1];
			this.anIntArray208[local1] = this.anIntArray205[local1];
			this.anIntArray205[local1] = local7;
		}
		this.method1529();
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
	public void method1535() {
		if (this.aClass20Array2 != null) {
			return;
		}
		this.aClass20Array2 = new Class20[this.anInt2179];
		for (@Pc(10) int local10 = 0; local10 < this.anInt2179; local10++) {
			this.aClass20Array2[local10] = new Class20();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt2182; local25++) {
			@Pc(31) int local31 = this.anIntArray208[local25];
			@Pc(36) int local36 = this.anIntArray207[local25];
			@Pc(41) int local41 = this.anIntArray205[local25];
			@Pc(51) int local51 = this.anIntArray215[local36] - this.anIntArray215[local31];
			@Pc(61) int local61 = this.anIntArray213[local36] - this.anIntArray213[local31];
			@Pc(71) int local71 = this.anIntArray214[local36] - this.anIntArray214[local31];
			@Pc(81) int local81 = this.anIntArray215[local41] - this.anIntArray215[local31];
			@Pc(91) int local91 = this.anIntArray213[local41] - this.anIntArray213[local31];
			@Pc(101) int local101 = this.anIntArray214[local41] - this.anIntArray214[local31];
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
			if (this.aByteArray22 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray22[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class20 local211 = this.aClass20Array2[local31];
				local211.anInt1157 += local109;
				local211.anInt1152 += local117;
				local211.anInt1153 += local125;
				local211.anInt1156++;
				@Pc(240) Class20 local240 = this.aClass20Array2[local36];
				local240.anInt1157 += local109;
				local240.anInt1152 += local117;
				local240.anInt1153 += local125;
				local240.anInt1156++;
				@Pc(269) Class20 local269 = this.aClass20Array2[local41];
				local269.anInt1157 += local109;
				local269.anInt1152 += local117;
				local269.anInt1153 += local125;
				local269.anInt1156++;
			} else if (local198 == 1) {
				if (this.aClass30Array1 == null) {
					this.aClass30Array1 = new Class30[this.anInt2182];
				}
				@Pc(314) Class30 local314 = this.aClass30Array1[local25] = new Class30();
				local314.anInt1788 = local109;
				local314.anInt1791 = local117;
				local314.anInt1790 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
	public void method1536() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray216 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt2179; local9++) {
				local15 = this.anIntArray216[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray21 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray21[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt2179) {
				local65 = this.anIntArray216[local59];
				this.anIntArrayArray21[local65][local5[local65]++] = local59++;
			}
			this.anIntArray216 = null;
		}
		if (this.anIntArray209 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt2182; local9++) {
			local15 = this.anIntArray209[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray20 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray20[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt2182) {
			local65 = this.anIntArray209[local59];
			this.anIntArrayArray20[local65][local5[local65]++] = local59++;
		}
		this.anIntArray209 = null;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(SS)V")
	public void method1537(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray21 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt2182; local5++) {
			if (this.aShortArray21[local5] == arg0) {
				this.aShortArray21[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
	public void method1538() {
		if (this.aBoolean108) {
			return;
		}
		this.aBoolean108 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt2179; local20++) {
			@Pc(26) int local26 = this.anIntArray215[local20];
			@Pc(31) int local31 = this.anIntArray213[local20];
			@Pc(36) int local36 = this.anIntArray214[local20];
			if (local26 < local8) {
				local8 = local26;
			}
			if (local26 > local14) {
				local14 = local26;
			}
			if (local31 < local10) {
				local10 = local31;
			}
			if (local31 > local16) {
				local16 = local31;
			}
			if (local36 < local12) {
				local12 = local36;
			}
			if (local36 > local18) {
				local18 = local36;
			}
		}
		this.aShort30 = (short) local8;
		this.aShort29 = (short) local14;
		super.aShort36 = (short) local10;
		this.aShort33 = (short) local16;
		this.aShort31 = (short) local12;
		this.aShort28 = (short) local18;
	}

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "()V")
	public void method1539() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2179; local1++) {
			this.anIntArray215[local1] = -this.anIntArray215[local1];
			this.anIntArray214[local1] = -this.anIntArray214[local1];
		}
		this.method1529();
	}

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "()Lclient!ka;")
	public Class2_Sub4_Sub1_Sub5 method1540() {
		@Pc(3) Class2_Sub4_Sub1_Sub5 local3 = new Class2_Sub4_Sub1_Sub5();
		if (this.aByteArray22 != null) {
			local3.aByteArray22 = new byte[this.anInt2182];
			for (@Pc(13) int local13 = 0; local13 < this.anInt2182; local13++) {
				local3.aByteArray22[local13] = this.aByteArray22[local13];
			}
		}
		local3.anInt2179 = this.anInt2179;
		local3.anInt2182 = this.anInt2182;
		local3.anInt2180 = this.anInt2180;
		local3.anIntArray215 = this.anIntArray215;
		local3.anIntArray213 = this.anIntArray213;
		local3.anIntArray214 = this.anIntArray214;
		local3.anIntArray208 = this.anIntArray208;
		local3.anIntArray207 = this.anIntArray207;
		local3.anIntArray205 = this.anIntArray205;
		local3.aByteArray25 = this.aByteArray25;
		local3.aByteArray23 = this.aByteArray23;
		local3.aByteArray31 = this.aByteArray31;
		local3.aShortArray20 = this.aShortArray20;
		local3.aShortArray21 = this.aShortArray21;
		local3.aByte4 = this.aByte4;
		local3.aByteArray29 = this.aByteArray29;
		local3.aShortArray22 = this.aShortArray22;
		local3.aShortArray24 = this.aShortArray24;
		local3.aShortArray26 = this.aShortArray26;
		local3.aShortArray19 = this.aShortArray19;
		local3.aShortArray23 = this.aShortArray23;
		local3.aShortArray25 = this.aShortArray25;
		local3.aByteArray28 = this.aByteArray28;
		local3.aByteArray24 = this.aByteArray24;
		local3.aByteArray27 = this.aByteArray27;
		local3.aByteArray30 = this.aByteArray30;
		local3.aByteArray26 = this.aByteArray26;
		local3.anIntArray216 = this.anIntArray216;
		local3.anIntArray209 = this.anIntArray209;
		local3.anIntArrayArray21 = this.anIntArrayArray21;
		local3.anIntArrayArray20 = this.anIntArrayArray20;
		local3.aClass20Array2 = this.aClass20Array2;
		local3.aClass30Array1 = this.aClass30Array1;
		local3.aShort34 = this.aShort34;
		local3.aShort32 = this.aShort32;
		return local3;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;I)I")
	private int method1541(@OriginalArg(0) Class2_Sub4_Sub1_Sub5 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray215[arg1];
		@Pc(11) int local11 = arg0.anIntArray213[arg1];
		@Pc(16) int local16 = arg0.anIntArray214[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2179; local18++) {
			if (local6 == this.anIntArray215[local18] && local11 == this.anIntArray213[local18] && local16 == this.anIntArray214[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray215[this.anInt2179] = local6;
			this.anIntArray213[this.anInt2179] = local11;
			this.anIntArray214[this.anInt2179] = local16;
			if (arg0.anIntArray216 != null) {
				this.anIntArray216[this.anInt2179] = arg0.anIntArray216[arg1];
			}
			local1 = this.anInt2179++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "()V")
	public void method1542() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2179; local1++) {
			@Pc(7) int local7 = this.anIntArray214[local1];
			this.anIntArray214[local1] = this.anIntArray215[local1];
			this.anIntArray215[local1] = -local7;
		}
		this.method1529();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIZZ)Lclient!df;")
	public Class2_Sub4_Sub1_Sub3 method1544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class2_Sub4_Sub1_Sub3_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(IIIII)Lclient!ha;")
	public Class2_Sub4_Sub1_Sub3_Sub1 method1546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class2_Sub4_Sub1_Sub3_Sub1(this, arg0, arg1, -50, -10, -50);
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)V")
	public void method1547() {
		@Pc(3) int local3 = Static86.anIntArray211[256];
		@Pc(7) int local7 = Static86.anIntArray210[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2179; local9++) {
			@Pc(26) int local26 = this.anIntArray214[local9] * local3 + this.anIntArray215[local9] * local7 >> 16;
			this.anIntArray214[local9] = this.anIntArray214[local9] * local7 - this.anIntArray215[local9] * local3 >> 16;
			this.anIntArray215[local9] = local26;
		}
		this.method1529();
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(III)V")
	public void method1548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2179; local1++) {
			this.anIntArray215[local1] += arg0;
			this.anIntArray213[local1] += arg1;
			this.anIntArray214[local1] += arg2;
		}
		this.method1529();
	}

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "()V")
	public void method1549() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2179; local1++) {
			@Pc(7) int local7 = this.anIntArray215[local1];
			this.anIntArray215[local1] = this.anIntArray214[local1];
			this.anIntArray214[local1] = -local7;
		}
		this.method1529();
	}
}
