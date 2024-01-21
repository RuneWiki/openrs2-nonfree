import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class3_Sub1_Sub5_Sub5 extends Class3_Sub1_Sub5 {

	@OriginalMember(owner = "client!ob", name = "Z", descriptor = "[[I")
	public int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!ob", name = "bb", descriptor = "[B")
	private byte[] aByteArray27;

	@OriginalMember(owner = "client!ob", name = "cb", descriptor = "[S")
	public short[] aShortArray38;

	@OriginalMember(owner = "client!ob", name = "db", descriptor = "S")
	public short aShort25;

	@OriginalMember(owner = "client!ob", name = "eb", descriptor = "I")
	public int anInt2730;

	@OriginalMember(owner = "client!ob", name = "fb", descriptor = "S")
	public short aShort26;

	@OriginalMember(owner = "client!ob", name = "gb", descriptor = "[Lclient!cc;")
	public Class14[] aClass14Array1;

	@OriginalMember(owner = "client!ob", name = "hb", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!ob", name = "ib", descriptor = "[S")
	public short[] aShortArray39;

	@OriginalMember(owner = "client!ob", name = "kb", descriptor = "S")
	public short aShort27;

	@OriginalMember(owner = "client!ob", name = "lb", descriptor = "[Lclient!cc;")
	public Class14[] aClass14Array2;

	@OriginalMember(owner = "client!ob", name = "mb", descriptor = "[S")
	private short[] aShortArray40;

	@OriginalMember(owner = "client!ob", name = "ob", descriptor = "[B")
	private byte[] aByteArray29;

	@OriginalMember(owner = "client!ob", name = "pb", descriptor = "S")
	public short aShort28;

	@OriginalMember(owner = "client!ob", name = "qb", descriptor = "[[I")
	public int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!ob", name = "sb", descriptor = "S")
	public short aShort29;

	@OriginalMember(owner = "client!ob", name = "tb", descriptor = "S")
	public short aShort30;

	@OriginalMember(owner = "client!ob", name = "ub", descriptor = "[B")
	public byte[] aByteArray30;

	@OriginalMember(owner = "client!ob", name = "vb", descriptor = "[B")
	private byte[] aByteArray31;

	@OriginalMember(owner = "client!ob", name = "wb", descriptor = "[Lclient!u;")
	public Class87[] aClass87Array1;

	@OriginalMember(owner = "client!ob", name = "yb", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!ob", name = "zb", descriptor = "[B")
	private byte[] aByteArray33;

	@OriginalMember(owner = "client!ob", name = "Ab", descriptor = "[S")
	private short[] aShortArray41;

	@OriginalMember(owner = "client!ob", name = "Bb", descriptor = "[B")
	private byte[] aByteArray34;

	@OriginalMember(owner = "client!ob", name = "Db", descriptor = "[I")
	private int[] anIntArray365;

	@OriginalMember(owner = "client!ob", name = "Eb", descriptor = "[B")
	public byte[] aByteArray35;

	@OriginalMember(owner = "client!ob", name = "Gb", descriptor = "[S")
	public short[] aShortArray42;

	@OriginalMember(owner = "client!ob", name = "Hb", descriptor = "[I")
	public int[] anIntArray367;

	@OriginalMember(owner = "client!ob", name = "Ib", descriptor = "[S")
	public short[] aShortArray43;

	@OriginalMember(owner = "client!ob", name = "Jb", descriptor = "S")
	public short aShort31;

	@OriginalMember(owner = "client!ob", name = "Kb", descriptor = "[S")
	private short[] aShortArray44;

	@OriginalMember(owner = "client!ob", name = "Lb", descriptor = "[I")
	public int[] anIntArray368;

	@OriginalMember(owner = "client!ob", name = "Mb", descriptor = "[I")
	public int[] anIntArray369;

	@OriginalMember(owner = "client!ob", name = "Ob", descriptor = "[I")
	public int[] anIntArray371;

	@OriginalMember(owner = "client!ob", name = "Pb", descriptor = "[S")
	public short[] aShortArray45;

	@OriginalMember(owner = "client!ob", name = "Qb", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!ob", name = "Rb", descriptor = "[I")
	public int[] anIntArray372;

	@OriginalMember(owner = "client!ob", name = "Sb", descriptor = "[I")
	private int[] anIntArray373;

	@OriginalMember(owner = "client!ob", name = "Tb", descriptor = "[I")
	public int[] anIntArray374;

	@OriginalMember(owner = "client!ob", name = "ab", descriptor = "I")
	public int anInt2729 = 0;

	@OriginalMember(owner = "client!ob", name = "nb", descriptor = "I")
	public int anInt2731 = 0;

	@OriginalMember(owner = "client!ob", name = "jb", descriptor = "Z")
	private boolean aBoolean109 = false;

	@OriginalMember(owner = "client!ob", name = "xb", descriptor = "B")
	public byte aByte6 = 0;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
	private Class3_Sub1_Sub5_Sub5() {
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "([B)V")
	public Class3_Sub1_Sub5_Sub5(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1906(arg0);
		} else {
			this.method1902(arg0);
		}
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "([Lclient!ob;I)V")
	public Class3_Sub1_Sub5_Sub5(@OriginalArg(0) Class3_Sub1_Sub5_Sub5[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt2729 = 0;
		this.anInt2731 = 0;
		this.anInt2730 = 0;
		this.aByte6 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class3_Sub1_Sub5_Sub5 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt2729 += local44.anInt2729;
				this.anInt2731 += local44.anInt2731;
				this.anInt2730 += local44.anInt2730;
				if (local44.aByteArray35 == null) {
					if (this.aByte6 == -1) {
						this.aByte6 = local44.aByte6;
					}
					if (this.aByte6 != local44.aByte6) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray30 != null;
				local19 |= local44.aByteArray28 != null;
				local21 |= local44.anIntArray373 != null;
				local23 |= local44.aShortArray38 != null;
				local25 |= local44.aByteArray36 != null;
			}
		}
		this.anIntArray371 = new int[this.anInt2729];
		this.anIntArray369 = new int[this.anInt2729];
		this.anIntArray374 = new int[this.anInt2729];
		this.anIntArray365 = new int[this.anInt2729];
		this.anIntArray367 = new int[this.anInt2731];
		this.anIntArray368 = new int[this.anInt2731];
		this.anIntArray372 = new int[this.anInt2731];
		if (local15) {
			this.aByteArray30 = new byte[this.anInt2731];
		}
		if (local17) {
			this.aByteArray35 = new byte[this.anInt2731];
		}
		if (local19) {
			this.aByteArray28 = new byte[this.anInt2731];
		}
		if (local21) {
			this.anIntArray373 = new int[this.anInt2731];
		}
		if (local23) {
			this.aShortArray38 = new short[this.anInt2731];
		}
		if (local25) {
			this.aByteArray36 = new byte[this.anInt2731];
		}
		this.aShortArray43 = new short[this.anInt2731];
		if (this.anInt2730 > 0) {
			this.aByteArray32 = new byte[this.anInt2730];
			this.aShortArray42 = new short[this.anInt2730];
			this.aShortArray39 = new short[this.anInt2730];
			this.aShortArray45 = new short[this.anInt2730];
			this.aShortArray44 = new short[this.anInt2730];
			this.aShortArray41 = new short[this.anInt2730];
			this.aShortArray40 = new short[this.anInt2730];
			this.aByteArray31 = new byte[this.anInt2730];
			this.aByteArray34 = new byte[this.anInt2730];
			this.aByteArray27 = new byte[this.anInt2730];
			this.aByteArray29 = new byte[this.anInt2730];
			this.aByteArray33 = new byte[this.anInt2730];
		}
		this.anInt2729 = 0;
		this.anInt2731 = 0;
		this.anInt2730 = 0;
		for (@Pc(293) int local293 = 0; local293 < arg1; local293++) {
			@Pc(298) Class3_Sub1_Sub5_Sub5 local298 = arg0[local293];
			if (local298 != null) {
				for (@Pc(302) int local302 = 0; local302 < local298.anInt2731; local302++) {
					if (local15 && local298.aByteArray30 != null) {
						this.aByteArray30[this.anInt2731] = local298.aByteArray30[local302];
					}
					if (local17) {
						if (local298.aByteArray35 == null) {
							this.aByteArray35[this.anInt2731] = local298.aByte6;
						} else {
							this.aByteArray35[this.anInt2731] = local298.aByteArray35[local302];
						}
					}
					if (local19 && local298.aByteArray28 != null) {
						this.aByteArray28[this.anInt2731] = local298.aByteArray28[local302];
					}
					if (local21 && local298.anIntArray373 != null) {
						this.anIntArray373[this.anInt2731] = local298.anIntArray373[local302];
					}
					if (local23) {
						if (local298.aShortArray38 == null) {
							this.aShortArray38[this.anInt2731] = -1;
						} else {
							this.aShortArray38[this.anInt2731] = local298.aShortArray38[local302];
						}
					}
					if (local25) {
						if (local298.aByteArray36 == null || local298.aByteArray36[local302] == -1) {
							this.aByteArray36[this.anInt2731] = -1;
						} else {
							this.aByteArray36[this.anInt2731] = (byte) (local298.aByteArray36[local302] + this.anInt2730);
						}
					}
					this.aShortArray43[this.anInt2731] = local298.aShortArray43[local302];
					this.anIntArray367[this.anInt2731] = this.method1903(local298, local298.anIntArray367[local302]);
					this.anIntArray368[this.anInt2731] = this.method1903(local298, local298.anIntArray368[local302]);
					this.anIntArray372[this.anInt2731] = this.method1903(local298, local298.anIntArray372[local302]);
					this.anInt2731++;
				}
				for (@Pc(477) int local477 = 0; local477 < local298.anInt2730; local477++) {
					@Pc(489) byte local489 = this.aByteArray32[this.anInt2730] = local298.aByteArray32[local477];
					if (local489 == 0) {
						this.aShortArray42[this.anInt2730] = (short) this.method1903(local298, local298.aShortArray42[local477]);
						this.aShortArray39[this.anInt2730] = (short) this.method1903(local298, local298.aShortArray39[local477]);
						this.aShortArray45[this.anInt2730] = (short) this.method1903(local298, local298.aShortArray45[local477]);
					}
					if (local489 >= 1 && local489 <= 3) {
						this.aShortArray42[this.anInt2730] = local298.aShortArray42[local477];
						this.aShortArray39[this.anInt2730] = local298.aShortArray39[local477];
						this.aShortArray45[this.anInt2730] = local298.aShortArray45[local477];
						this.aShortArray44[this.anInt2730] = local298.aShortArray44[local477];
						this.aShortArray41[this.anInt2730] = local298.aShortArray41[local477];
						this.aShortArray40[this.anInt2730] = local298.aShortArray40[local477];
						this.aByteArray31[this.anInt2730] = local298.aByteArray31[local477];
						this.aByteArray34[this.anInt2730] = local298.aByteArray34[local477];
						this.aByteArray27[this.anInt2730] = local298.aByteArray27[local477];
					}
					if (local489 == 2) {
						this.aByteArray29[this.anInt2730] = local298.aByteArray29[local477];
						this.aByteArray33[this.anInt2730] = local298.aByteArray33[local477];
					}
					this.anInt2730++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!ob;ZZZZ)V")
	public Class3_Sub1_Sub5_Sub5(@OriginalArg(0) Class3_Sub1_Sub5_Sub5 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2729 = arg0.anInt2729;
		this.anInt2731 = arg0.anInt2731;
		this.anInt2730 = arg0.anInt2730;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray371 = arg0.anIntArray371;
			this.anIntArray369 = arg0.anIntArray369;
			this.anIntArray374 = arg0.anIntArray374;
		} else {
			this.anIntArray371 = new int[this.anInt2729];
			this.anIntArray369 = new int[this.anInt2729];
			this.anIntArray374 = new int[this.anInt2729];
			for (local57 = 0; local57 < this.anInt2729; local57++) {
				this.anIntArray371[local57] = arg0.anIntArray371[local57];
				this.anIntArray369[local57] = arg0.anIntArray369[local57];
				this.anIntArray374[local57] = arg0.anIntArray374[local57];
			}
		}
		if (arg2) {
			this.aShortArray43 = arg0.aShortArray43;
		} else {
			this.aShortArray43 = new short[this.anInt2731];
			for (local57 = 0; local57 < this.anInt2731; local57++) {
				this.aShortArray43[local57] = arg0.aShortArray43[local57];
			}
		}
		if (arg3 || arg0.aShortArray38 == null) {
			this.aShortArray38 = arg0.aShortArray38;
		} else {
			this.aShortArray38 = new short[this.anInt2731];
			for (local57 = 0; local57 < this.anInt2731; local57++) {
				this.aShortArray38[local57] = arg0.aShortArray38[local57];
			}
		}
		this.aByteArray28 = arg0.aByteArray28;
		this.anIntArray367 = arg0.anIntArray367;
		this.anIntArray368 = arg0.anIntArray368;
		this.anIntArray372 = arg0.anIntArray372;
		this.aByteArray30 = arg0.aByteArray30;
		this.aByteArray35 = arg0.aByteArray35;
		this.aByteArray36 = arg0.aByteArray36;
		this.aByte6 = arg0.aByte6;
		this.aByteArray32 = arg0.aByteArray32;
		this.aShortArray42 = arg0.aShortArray42;
		this.aShortArray39 = arg0.aShortArray39;
		this.aShortArray45 = arg0.aShortArray45;
		this.aShortArray44 = arg0.aShortArray44;
		this.aShortArray41 = arg0.aShortArray41;
		this.aShortArray40 = arg0.aShortArray40;
		this.aByteArray31 = arg0.aByteArray31;
		this.aByteArray34 = arg0.aByteArray34;
		this.aByteArray27 = arg0.aByteArray27;
		this.aByteArray29 = arg0.aByteArray29;
		this.aByteArray33 = arg0.aByteArray33;
		this.anIntArray365 = arg0.anIntArray365;
		this.anIntArray373 = arg0.anIntArray373;
		this.anIntArrayArray31 = arg0.anIntArrayArray31;
		this.anIntArrayArray32 = arg0.anIntArrayArray32;
		this.aClass14Array2 = arg0.aClass14Array2;
		this.aClass87Array1 = arg0.aClass87Array1;
		this.aClass14Array1 = arg0.aClass14Array1;
		this.aShort28 = arg0.aShort28;
		this.aShort31 = arg0.aShort31;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "()V")
	private void method1889() {
		this.aClass14Array2 = null;
		this.aClass14Array1 = null;
		this.aClass87Array1 = null;
		this.aBoolean109 = false;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "()V")
	public void method1890() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2729; local1++) {
			@Pc(7) int local7 = this.anIntArray374[local1];
			this.anIntArray374[local1] = this.anIntArray371[local1];
			this.anIntArray371[local1] = -local7;
		}
		this.method1889();
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "()V")
	public void method1891() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray365 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt2729; local9++) {
				local15 = this.anIntArray365[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray31 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray31[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt2729) {
				local65 = this.anIntArray365[local59];
				this.anIntArrayArray31[local65][local5[local65]++] = local59++;
			}
			this.anIntArray365 = null;
		}
		if (this.anIntArray373 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt2731; local9++) {
			local15 = this.anIntArray373[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray32 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray32[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt2731) {
			local65 = this.anIntArray373[local59];
			this.anIntArrayArray32[local65][local5[local65]++] = local59++;
		}
		this.anIntArray373 = null;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([[IIIIZI)Lclient!ob;")
	public Class3_Sub1_Sub5_Sub5 method1892(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method1900();
		@Pc(6) int local6 = arg1 + this.aShort29;
		@Pc(11) int local11 = arg1 + this.aShort27;
		@Pc(16) int local16 = arg3 + this.aShort30;
		@Pc(21) int local21 = arg3 + this.aShort26;
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
		@Pc(101) Class3_Sub1_Sub5_Sub5 local101 = new Class3_Sub1_Sub5_Sub5();
		local101.anInt2729 = this.anInt2729;
		local101.anInt2731 = this.anInt2731;
		local101.anInt2730 = this.anInt2730;
		local101.anIntArray371 = this.anIntArray371;
		local101.anIntArray374 = this.anIntArray374;
		local101.anIntArray367 = this.anIntArray367;
		local101.anIntArray368 = this.anIntArray368;
		local101.anIntArray372 = this.anIntArray372;
		local101.aByteArray30 = this.aByteArray30;
		local101.aByteArray35 = this.aByteArray35;
		local101.aByteArray28 = this.aByteArray28;
		local101.aByteArray36 = this.aByteArray36;
		local101.aShortArray43 = this.aShortArray43;
		local101.aShortArray38 = this.aShortArray38;
		local101.aByte6 = this.aByte6;
		local101.aByteArray32 = this.aByteArray32;
		local101.aShortArray42 = this.aShortArray42;
		local101.aShortArray39 = this.aShortArray39;
		local101.aShortArray45 = this.aShortArray45;
		local101.aShortArray44 = this.aShortArray44;
		local101.aShortArray41 = this.aShortArray41;
		local101.aShortArray40 = this.aShortArray40;
		local101.aByteArray31 = this.aByteArray31;
		local101.aByteArray34 = this.aByteArray34;
		local101.aByteArray27 = this.aByteArray27;
		local101.aByteArray29 = this.aByteArray29;
		local101.aByteArray33 = this.aByteArray33;
		local101.anIntArray365 = this.anIntArray365;
		local101.anIntArray373 = this.anIntArray373;
		local101.anIntArrayArray31 = this.anIntArrayArray31;
		local101.anIntArrayArray32 = this.anIntArrayArray32;
		local101.aShort28 = this.aShort28;
		local101.aShort31 = this.aShort31;
		local101.anIntArray369 = new int[local101.anInt2729];
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
			for (local245 = 0; local245 < local101.anInt2729; local245++) {
				local253 = this.anIntArray371[local245] + arg1;
				local260 = this.anIntArray374[local245] + arg3;
				local264 = local253 & 0x7F;
				local268 = local260 & 0x7F;
				local272 = local253 >> 7;
				local276 = local260 >> 7;
				local298 = arg0[local272][local276] * (128 - local264) + arg0[local272 + 1][local276] * local264 >> 7;
				local324 = arg0[local272][local276 + 1] * (128 - local264) + arg0[local272 + 1][local276 + 1] * local264 >> 7;
				local336 = local298 * (128 - local268) + local324 * local268 >> 7;
				local101.anIntArray369[local245] = this.anIntArray369[local245] + local336 - arg2;
			}
		} else {
			for (local245 = 0; local245 < local101.anInt2729; local245++) {
				local253 = (this.anIntArray369[local245] << 16) / super.aShort34;
				if (local253 < arg4) {
					local260 = this.anIntArray371[local245] + arg1;
					local264 = this.anIntArray374[local245] + arg3;
					local268 = local260 & 0x7F;
					local272 = local264 & 0x7F;
					local276 = local260 >> 7;
					local298 = local264 >> 7;
					local324 = arg0[local276][local298] * (128 - local268) + arg0[local276 + 1][local298] * local268 >> 7;
					local336 = arg0[local276][local298 + 1] * (128 - local268) + arg0[local276 + 1][local298 + 1] * local268 >> 7;
					@Pc(460) int local460 = local324 * (128 - local272) + local336 * local272 >> 7;
					local101.anIntArray369[local245] = this.anIntArray369[local245] + (local460 - arg2) * (arg4 - local253) / arg4;
				} else {
					local101.anIntArray369[local245] = this.anIntArray369[local245];
				}
			}
		}
		local101.method1889();
		return local101;
	}

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "(I)V")
	public void method1893() {
		@Pc(3) int local3 = Static127.anIntArray375[256];
		@Pc(7) int local7 = Static127.anIntArray364[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2729; local9++) {
			@Pc(26) int local26 = this.anIntArray374[local9] * local3 + this.anIntArray371[local9] * local7 >> 16;
			this.anIntArray374[local9] = this.anIntArray374[local9] * local7 - this.anIntArray371[local9] * local3 >> 16;
			this.anIntArray371[local9] = local26;
		}
		this.method1889();
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(III)V")
	public void method1894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2729; local1++) {
			this.anIntArray371[local1] = this.anIntArray371[local1] * arg0 / 128;
			this.anIntArray369[local1] = this.anIntArray369[local1] * arg1 / 128;
			this.anIntArray374[local1] = this.anIntArray374[local1] * arg2 / 128;
		}
		this.method1889();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIII)Lclient!kc;")
	public Class3_Sub1_Sub5_Sub3_Sub1 method1895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class3_Sub1_Sub5_Sub3_Sub1(this, arg0, arg1, -50, -10, -50);
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "()V")
	public void method1896() {
		if (this.aClass14Array2 != null) {
			return;
		}
		this.aClass14Array2 = new Class14[this.anInt2729];
		for (@Pc(10) int local10 = 0; local10 < this.anInt2729; local10++) {
			this.aClass14Array2[local10] = new Class14();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt2731; local25++) {
			@Pc(31) int local31 = this.anIntArray367[local25];
			@Pc(36) int local36 = this.anIntArray368[local25];
			@Pc(41) int local41 = this.anIntArray372[local25];
			@Pc(51) int local51 = this.anIntArray371[local36] - this.anIntArray371[local31];
			@Pc(61) int local61 = this.anIntArray369[local36] - this.anIntArray369[local31];
			@Pc(71) int local71 = this.anIntArray374[local36] - this.anIntArray374[local31];
			@Pc(81) int local81 = this.anIntArray371[local41] - this.anIntArray371[local31];
			@Pc(91) int local91 = this.anIntArray369[local41] - this.anIntArray369[local31];
			@Pc(101) int local101 = this.anIntArray374[local41] - this.anIntArray374[local31];
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
			if (this.aByteArray30 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray30[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class14 local211 = this.aClass14Array2[local31];
				local211.anInt511 += local109;
				local211.anInt515 += local117;
				local211.anInt508 += local125;
				local211.anInt514++;
				@Pc(240) Class14 local240 = this.aClass14Array2[local36];
				local240.anInt511 += local109;
				local240.anInt515 += local117;
				local240.anInt508 += local125;
				local240.anInt514++;
				@Pc(269) Class14 local269 = this.aClass14Array2[local41];
				local269.anInt511 += local109;
				local269.anInt515 += local117;
				local269.anInt508 += local125;
				local269.anInt514++;
			} else if (local198 == 1) {
				if (this.aClass87Array1 == null) {
					this.aClass87Array1 = new Class87[this.anInt2731];
				}
				@Pc(314) Class87 local314 = this.aClass87Array1[local25] = new Class87();
				local314.anInt3958 = local109;
				local314.anInt3957 = local117;
				local314.anInt3960 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "()V")
	public void method1897() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2729; local1++) {
			this.anIntArray374[local1] = -this.anIntArray374[local1];
		}
		this.method1889();
	}

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "()V")
	public void method1898() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2729; local1++) {
			this.anIntArray371[local1] = -this.anIntArray371[local1];
			this.anIntArray374[local1] = -this.anIntArray374[local1];
		}
		this.method1889();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(SS)V")
	public void method1899(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray38 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt2731; local5++) {
			if (this.aShortArray38[local5] == arg0) {
				this.aShortArray38[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "()V")
	public void method1900() {
		if (this.aBoolean109) {
			return;
		}
		this.aBoolean109 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt2729; local20++) {
			@Pc(26) int local26 = this.anIntArray371[local20];
			@Pc(31) int local31 = this.anIntArray369[local20];
			@Pc(36) int local36 = this.anIntArray374[local20];
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
		this.aShort29 = (short) local8;
		this.aShort27 = (short) local14;
		super.aShort34 = (short) local10;
		this.aShort25 = (short) local16;
		this.aShort30 = (short) local12;
		this.aShort26 = (short) local18;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(SS)V")
	public void method1901(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2731; local1++) {
			if (this.aShortArray43[local1] == arg0) {
				this.aShortArray43[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([B)V")
	private void method1902(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class3_Sub17 local8 = new Class3_Sub17(arg0);
		@Pc(13) Class3_Sub17 local13 = new Class3_Sub17(arg0);
		@Pc(18) Class3_Sub17 local18 = new Class3_Sub17(arg0);
		@Pc(23) Class3_Sub17 local23 = new Class3_Sub17(arg0);
		@Pc(28) Class3_Sub17 local28 = new Class3_Sub17(arg0);
		local8.anInt2923 = arg0.length - 18;
		@Pc(38) int local38 = local8.method2111();
		@Pc(42) int local42 = local8.method2111();
		@Pc(46) int local46 = local8.method2107();
		@Pc(50) int local50 = local8.method2107();
		@Pc(54) int local54 = local8.method2107();
		@Pc(58) int local58 = local8.method2107();
		@Pc(62) int local62 = local8.method2107();
		@Pc(66) int local66 = local8.method2107();
		@Pc(70) int local70 = local8.method2111();
		@Pc(74) int local74 = local8.method2111();
		@Pc(78) int local78 = local8.method2111();
		@Pc(82) int local82 = local8.method2111();
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
		this.anInt2729 = local38;
		this.anInt2731 = local42;
		this.anInt2730 = local46;
		this.anIntArray371 = new int[local38];
		this.anIntArray369 = new int[local38];
		this.anIntArray374 = new int[local38];
		this.anIntArray367 = new int[local42];
		this.anIntArray368 = new int[local42];
		this.anIntArray372 = new int[local42];
		if (local46 > 0) {
			this.aByteArray32 = new byte[local46];
			this.aShortArray42 = new short[local46];
			this.aShortArray39 = new short[local46];
			this.aShortArray45 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray365 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray30 = new byte[local42];
			this.aByteArray36 = new byte[local42];
			this.aShortArray38 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray35 = new byte[local42];
		} else {
			this.aByte6 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray28 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray373 = new int[local42];
		}
		this.aShortArray43 = new short[local42];
		local8.anInt2923 = 0;
		local13.anInt2923 = local165;
		local18.anInt2923 = local171;
		local23.anInt2923 = local90;
		local28.anInt2923 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method2107();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method2127();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method2127();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method2127();
			}
			this.anIntArray371[local307] = local301 + local314;
			this.anIntArray369[local307] = local303 + local324;
			this.anIntArray374[local307] = local305 + local334;
			local301 = this.anIntArray371[local307];
			local303 = this.anIntArray369[local307];
			local305 = this.anIntArray374[local307];
			if (local66 == 1) {
				this.anIntArray365[local307] = local28.method2107();
			}
		}
		local8.anInt2923 = local149;
		local13.anInt2923 = local116;
		local18.anInt2923 = local98;
		local23.anInt2923 = local134;
		local28.anInt2923 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray43[local312] = (short) local8.method2111();
			if (local50 == 1) {
				local314 = local13.method2107();
				if ((local314 & 0x1) == 1) {
					this.aByteArray30[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray30[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray36[local312] = (byte) (local314 >> 2);
					this.aShortArray38[local312] = this.aShortArray43[local312];
					this.aShortArray43[local312] = 127;
					if (this.aShortArray38[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray36[local312] = -1;
					this.aShortArray38[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray35[local312] = local18.method2123();
			}
			if (local58 == 1) {
				this.aByteArray28[local312] = local23.method2123();
			}
			if (local62 == 1) {
				this.anIntArray373[local312] = local28.method2107();
			}
		}
		local8.anInt2923 = local143;
		local13.anInt2923 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method2107();
			if (local543 == 1) {
				local314 = local8.method2127() + local536;
				local324 = local8.method2127() + local314;
				local334 = local8.method2127() + local324;
				local536 = local334;
				this.anIntArray367[local538] = local314;
				this.anIntArray368[local538] = local324;
				this.anIntArray372[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method2127() + local536;
				local536 = local334;
				this.anIntArray367[local538] = local314;
				this.anIntArray368[local538] = local324;
				this.anIntArray372[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method2127() + local536;
				local536 = local334;
				this.anIntArray367[local538] = local314;
				this.anIntArray368[local538] = local324;
				this.anIntArray372[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method2127() + local536;
				local536 = local334;
				this.anIntArray367[local538] = local314;
				this.anIntArray368[local538] = local646;
				this.anIntArray372[local538] = local334;
			}
		}
		local8.anInt2923 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray32[local543] = 0;
			this.aShortArray42[local543] = (short) local8.method2111();
			this.aShortArray39[local543] = (short) local8.method2111();
			this.aShortArray45[local543] = (short) local8.method2111();
		}
		if (this.aByteArray36 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray36[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray42[local731] & 0xFFFF) == this.anIntArray367[local723] && (this.aShortArray39[local731] & 0xFFFF) == this.anIntArray368[local723] && (this.aShortArray45[local731] & 0xFFFF) == this.anIntArray372[local723]) {
						this.aByteArray36[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray36 = null;
			}
		}
		if (!local3) {
			this.aShortArray38 = null;
		}
		if (!local1) {
			this.aByteArray30 = null;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ob;I)I")
	private int method1903(@OriginalArg(0) Class3_Sub1_Sub5_Sub5 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray371[arg1];
		@Pc(11) int local11 = arg0.anIntArray369[arg1];
		@Pc(16) int local16 = arg0.anIntArray374[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2729; local18++) {
			if (local6 == this.anIntArray371[local18] && local11 == this.anIntArray369[local18] && local16 == this.anIntArray374[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray371[this.anInt2729] = local6;
			this.anIntArray369[this.anInt2729] = local11;
			this.anIntArray374[this.anInt2729] = local16;
			if (arg0.anIntArray365 != null) {
				this.anIntArray365[this.anInt2729] = arg0.anIntArray365[arg1];
			}
			local1 = this.anInt2729++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "()V")
	public void method1904() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2731; local1++) {
			@Pc(7) int local7 = this.anIntArray367[local1];
			this.anIntArray367[local1] = this.anIntArray372[local1];
			this.anIntArray372[local1] = local7;
		}
		this.method1889();
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(III)V")
	public void method1905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2729; local1++) {
			this.anIntArray371[local1] += arg0;
			this.anIntArray369[local1] += arg1;
			this.anIntArray374[local1] += arg2;
		}
		this.method1889();
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "([B)V")
	private void method1906(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class3_Sub17 local4 = new Class3_Sub17(arg0);
		@Pc(9) Class3_Sub17 local9 = new Class3_Sub17(arg0);
		@Pc(14) Class3_Sub17 local14 = new Class3_Sub17(arg0);
		@Pc(19) Class3_Sub17 local19 = new Class3_Sub17(arg0);
		@Pc(24) Class3_Sub17 local24 = new Class3_Sub17(arg0);
		@Pc(29) Class3_Sub17 local29 = new Class3_Sub17(arg0);
		@Pc(34) Class3_Sub17 local34 = new Class3_Sub17(arg0);
		local4.anInt2923 = arg0.length - 23;
		@Pc(44) int local44 = local4.method2111();
		@Pc(48) int local48 = local4.method2111();
		@Pc(52) int local52 = local4.method2107();
		@Pc(56) int local56 = local4.method2107();
		@Pc(60) int local60 = local4.method2107();
		@Pc(64) int local64 = local4.method2107();
		@Pc(68) int local68 = local4.method2107();
		@Pc(72) int local72 = local4.method2107();
		@Pc(76) int local76 = local4.method2107();
		@Pc(80) int local80 = local4.method2111();
		@Pc(84) int local84 = local4.method2111();
		@Pc(88) int local88 = local4.method2111();
		@Pc(92) int local92 = local4.method2111();
		@Pc(96) int local96 = local4.method2111();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray32 = new byte[local52];
			local4.anInt2923 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray32[local113] = local4.method2123();
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
		this.anInt2729 = local44;
		this.anInt2731 = local48;
		this.anInt2730 = local52;
		this.anIntArray371 = new int[local44];
		this.anIntArray369 = new int[local44];
		this.anIntArray374 = new int[local44];
		this.anIntArray367 = new int[local48];
		this.anIntArray368 = new int[local48];
		this.anIntArray372 = new int[local48];
		if (local76 == 1) {
			this.anIntArray365 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray30 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray35 = new byte[local48];
		} else {
			this.aByte6 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray28 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray373 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray38 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray36 = new byte[local48];
		}
		this.aShortArray43 = new short[local48];
		if (local52 > 0) {
			this.aShortArray42 = new short[local52];
			this.aShortArray39 = new short[local52];
			this.aShortArray45 = new short[local52];
			if (local100 > 0) {
				this.aShortArray44 = new short[local100];
				this.aShortArray41 = new short[local100];
				this.aShortArray40 = new short[local100];
				this.aByteArray31 = new byte[local100];
				this.aByteArray34 = new byte[local100];
				this.aByteArray27 = new byte[local100];
			}
			if (local102 > 0) {
				this.aByteArray29 = new byte[local102];
				this.aByteArray33 = new byte[local102];
			}
		}
		local4.anInt2923 = local52;
		local9.anInt2923 = local233;
		local14.anInt2923 = local239;
		local19.anInt2923 = local245;
		local24.anInt2923 = local184;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(461) int local461 = 0;
		@Pc(468) int local468;
		@Pc(470) int local470;
		@Pc(480) int local480;
		@Pc(490) int local490;
		for (@Pc(463) int local463 = 0; local463 < local44; local463++) {
			local468 = local4.method2107();
			local470 = 0;
			if ((local468 & 0x1) != 0) {
				local470 = local9.method2127();
			}
			local480 = 0;
			if ((local468 & 0x2) != 0) {
				local480 = local14.method2127();
			}
			local490 = 0;
			if ((local468 & 0x4) != 0) {
				local490 = local19.method2127();
			}
			this.anIntArray371[local463] = local457 + local470;
			this.anIntArray369[local463] = local459 + local480;
			this.anIntArray374[local463] = local461 + local490;
			local457 = this.anIntArray371[local463];
			local459 = this.anIntArray369[local463];
			local461 = this.anIntArray374[local463];
			if (local76 == 1) {
				this.anIntArray365[local463] = local24.method2107();
			}
		}
		local4.anInt2923 = local225;
		local9.anInt2923 = local151;
		local14.anInt2923 = local166;
		local19.anInt2923 = local193;
		local24.anInt2923 = local175;
		local29.anInt2923 = local208;
		local34.anInt2923 = local219;
		for (local468 = 0; local468 < local48; local468++) {
			this.aShortArray43[local468] = (short) local4.method2111();
			if (local56 == 1) {
				this.aByteArray30[local468] = local9.method2123();
			}
			if (local60 == 255) {
				this.aByteArray35[local468] = local14.method2123();
			}
			if (local64 == 1) {
				this.aByteArray28[local468] = local19.method2123();
			}
			if (local68 == 1) {
				this.anIntArray373[local468] = local24.method2107();
			}
			if (local72 == 1) {
				this.aShortArray38[local468] = (short) (local29.method2111() - 1);
			}
			if (this.aByteArray36 != null) {
				if (this.aShortArray38[local468] == -1) {
					this.aByteArray36[local468] = -1;
				} else {
					this.aByteArray36[local468] = (byte) (local34.method2107() - 1);
				}
			}
		}
		local4.anInt2923 = local202;
		local9.anInt2923 = local160;
		local470 = 0;
		local480 = 0;
		local490 = 0;
		@Pc(676) int local676 = 0;
		@Pc(683) int local683;
		@Pc(786) int local786;
		for (@Pc(678) int local678 = 0; local678 < local48; local678++) {
			local683 = local9.method2107();
			if (local683 == 1) {
				local470 = local4.method2127() + local676;
				local480 = local4.method2127() + local470;
				local490 = local4.method2127() + local480;
				local676 = local490;
				this.anIntArray367[local678] = local470;
				this.anIntArray368[local678] = local480;
				this.anIntArray372[local678] = local490;
			}
			if (local683 == 2) {
				local480 = local490;
				local490 = local4.method2127() + local676;
				local676 = local490;
				this.anIntArray367[local678] = local470;
				this.anIntArray368[local678] = local480;
				this.anIntArray372[local678] = local490;
			}
			if (local683 == 3) {
				local470 = local490;
				local490 = local4.method2127() + local676;
				local676 = local490;
				this.anIntArray367[local678] = local470;
				this.anIntArray368[local678] = local480;
				this.anIntArray372[local678] = local490;
			}
			if (local683 == 4) {
				local786 = local470;
				local470 = local480;
				local480 = local786;
				local490 = local4.method2127() + local676;
				local676 = local490;
				this.anIntArray367[local678] = local470;
				this.anIntArray368[local678] = local786;
				this.anIntArray372[local678] = local490;
			}
		}
		local4.anInt2923 = local251;
		local9.anInt2923 = local259;
		local14.anInt2923 = local267;
		local19.anInt2923 = local275;
		local24.anInt2923 = local281;
		local29.anInt2923 = local287;
		for (local683 = 0; local683 < local52; local683++) {
			local786 = this.aByteArray32[local683] & 0xFF;
			if (local786 == 0) {
				this.aShortArray42[local683] = (short) local4.method2111();
				this.aShortArray39[local683] = (short) local4.method2111();
				this.aShortArray45[local683] = (short) local4.method2111();
			}
			if (local786 == 1) {
				this.aShortArray42[local683] = (short) local9.method2111();
				this.aShortArray39[local683] = (short) local9.method2111();
				this.aShortArray45[local683] = (short) local9.method2111();
				this.aShortArray44[local683] = (short) local14.method2111();
				this.aShortArray41[local683] = (short) local14.method2111();
				this.aShortArray40[local683] = (short) local14.method2111();
				this.aByteArray31[local683] = local19.method2123();
				this.aByteArray34[local683] = local24.method2123();
				this.aByteArray27[local683] = local29.method2123();
			}
			if (local786 == 2) {
				this.aShortArray42[local683] = (short) local9.method2111();
				this.aShortArray39[local683] = (short) local9.method2111();
				this.aShortArray45[local683] = (short) local9.method2111();
				this.aShortArray44[local683] = (short) local14.method2111();
				this.aShortArray41[local683] = (short) local14.method2111();
				this.aShortArray40[local683] = (short) local14.method2111();
				this.aByteArray31[local683] = local19.method2123();
				this.aByteArray34[local683] = local24.method2123();
				this.aByteArray27[local683] = local29.method2123();
				this.aByteArray29[local683] = local29.method2123();
				this.aByteArray33[local683] = local29.method2123();
			}
			if (local786 == 3) {
				this.aShortArray42[local683] = (short) local9.method2111();
				this.aShortArray39[local683] = (short) local9.method2111();
				this.aShortArray45[local683] = (short) local9.method2111();
				this.aShortArray44[local683] = (short) local14.method2111();
				this.aShortArray41[local683] = (short) local14.method2111();
				this.aShortArray40[local683] = (short) local14.method2111();
				this.aByteArray31[local683] = local19.method2123();
				this.aByteArray34[local683] = local24.method2123();
				this.aByteArray27[local683] = local29.method2123();
			}
		}
		local4.anInt2923 = local113;
		local786 = local4.method2107();
		if (local786 == 0) {
			return;
		}
		new Class18();
		local4.method2111();
		local4.method2111();
		local4.method2111();
		local4.method2132();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIZZ)Lclient!vf;")
	public Class3_Sub1_Sub5_Sub3 method1908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class3_Sub1_Sub5_Sub3_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "()V")
	public void method1909() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2729; local1++) {
			@Pc(7) int local7 = this.anIntArray371[local1];
			this.anIntArray371[local1] = this.anIntArray374[local1];
			this.anIntArray374[local1] = -local7;
		}
		this.method1889();
	}

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "()Lclient!ob;")
	public Class3_Sub1_Sub5_Sub5 method1910() {
		@Pc(3) Class3_Sub1_Sub5_Sub5 local3 = new Class3_Sub1_Sub5_Sub5();
		if (this.aByteArray30 != null) {
			local3.aByteArray30 = new byte[this.anInt2731];
			for (@Pc(13) int local13 = 0; local13 < this.anInt2731; local13++) {
				local3.aByteArray30[local13] = this.aByteArray30[local13];
			}
		}
		local3.anInt2729 = this.anInt2729;
		local3.anInt2731 = this.anInt2731;
		local3.anInt2730 = this.anInt2730;
		local3.anIntArray371 = this.anIntArray371;
		local3.anIntArray369 = this.anIntArray369;
		local3.anIntArray374 = this.anIntArray374;
		local3.anIntArray367 = this.anIntArray367;
		local3.anIntArray368 = this.anIntArray368;
		local3.anIntArray372 = this.anIntArray372;
		local3.aByteArray35 = this.aByteArray35;
		local3.aByteArray28 = this.aByteArray28;
		local3.aByteArray36 = this.aByteArray36;
		local3.aShortArray43 = this.aShortArray43;
		local3.aShortArray38 = this.aShortArray38;
		local3.aByte6 = this.aByte6;
		local3.aByteArray32 = this.aByteArray32;
		local3.aShortArray42 = this.aShortArray42;
		local3.aShortArray39 = this.aShortArray39;
		local3.aShortArray45 = this.aShortArray45;
		local3.aShortArray44 = this.aShortArray44;
		local3.aShortArray41 = this.aShortArray41;
		local3.aShortArray40 = this.aShortArray40;
		local3.aByteArray31 = this.aByteArray31;
		local3.aByteArray34 = this.aByteArray34;
		local3.aByteArray27 = this.aByteArray27;
		local3.aByteArray29 = this.aByteArray29;
		local3.aByteArray33 = this.aByteArray33;
		local3.anIntArray365 = this.anIntArray365;
		local3.anIntArray373 = this.anIntArray373;
		local3.anIntArrayArray31 = this.anIntArrayArray31;
		local3.anIntArrayArray32 = this.anIntArrayArray32;
		local3.aClass14Array2 = this.aClass14Array2;
		local3.aClass87Array1 = this.aClass87Array1;
		local3.aShort28 = this.aShort28;
		local3.aShort31 = this.aShort31;
		return local3;
	}
}
