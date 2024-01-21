import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class3_Sub2_Sub1_Sub4 extends Class3_Sub2_Sub1 {

	@OriginalMember(owner = "client!lc", name = "T", descriptor = "S")
	public short aShort27;

	@OriginalMember(owner = "client!lc", name = "V", descriptor = "[B")
	private byte[] aByteArray22;

	@OriginalMember(owner = "client!lc", name = "X", descriptor = "[S")
	public short[] aShortArray26;

	@OriginalMember(owner = "client!lc", name = "Y", descriptor = "[B")
	public byte[] aByteArray23;

	@OriginalMember(owner = "client!lc", name = "Z", descriptor = "S")
	public short aShort28;

	@OriginalMember(owner = "client!lc", name = "bb", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!lc", name = "db", descriptor = "[I")
	private int[] anIntArray427;

	@OriginalMember(owner = "client!lc", name = "eb", descriptor = "[I")
	public int[] anIntArray428;

	@OriginalMember(owner = "client!lc", name = "gb", descriptor = "S")
	public short aShort29;

	@OriginalMember(owner = "client!lc", name = "hb", descriptor = "[B")
	private byte[] aByteArray24;

	@OriginalMember(owner = "client!lc", name = "ib", descriptor = "[B")
	public byte[] aByteArray25;

	@OriginalMember(owner = "client!lc", name = "jb", descriptor = "[I")
	public int[] anIntArray430;

	@OriginalMember(owner = "client!lc", name = "kb", descriptor = "[Lclient!be;")
	public Class10[] aClass10Array1;

	@OriginalMember(owner = "client!lc", name = "mb", descriptor = "[I")
	public int[] anIntArray431;

	@OriginalMember(owner = "client!lc", name = "nb", descriptor = "[I")
	public int[] anIntArray432;

	@OriginalMember(owner = "client!lc", name = "pb", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!lc", name = "qb", descriptor = "[Lclient!be;")
	public Class10[] aClass10Array2;

	@OriginalMember(owner = "client!lc", name = "rb", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!lc", name = "sb", descriptor = "I")
	public int anInt2562;

	@OriginalMember(owner = "client!lc", name = "tb", descriptor = "[S")
	public short[] aShortArray30;

	@OriginalMember(owner = "client!lc", name = "ub", descriptor = "[I")
	public int[] anIntArray434;

	@OriginalMember(owner = "client!lc", name = "vb", descriptor = "[S")
	public short[] aShortArray31;

	@OriginalMember(owner = "client!lc", name = "wb", descriptor = "[B")
	private byte[] aByteArray26;

	@OriginalMember(owner = "client!lc", name = "xb", descriptor = "S")
	public short aShort30;

	@OriginalMember(owner = "client!lc", name = "yb", descriptor = "[I")
	private int[] anIntArray435;

	@OriginalMember(owner = "client!lc", name = "zb", descriptor = "[I")
	public int[] anIntArray436;

	@OriginalMember(owner = "client!lc", name = "Ab", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!lc", name = "Bb", descriptor = "S")
	public short aShort31;

	@OriginalMember(owner = "client!lc", name = "Cb", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!lc", name = "Eb", descriptor = "[B")
	private byte[] aByteArray29;

	@OriginalMember(owner = "client!lc", name = "Fb", descriptor = "[B")
	private byte[] aByteArray30;

	@OriginalMember(owner = "client!lc", name = "Gb", descriptor = "S")
	public short aShort32;

	@OriginalMember(owner = "client!lc", name = "Hb", descriptor = "S")
	public short aShort33;

	@OriginalMember(owner = "client!lc", name = "Ib", descriptor = "[Lclient!bg;")
	public Class11[] aClass11Array1;

	@OriginalMember(owner = "client!lc", name = "Jb", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!lc", name = "Lb", descriptor = "[[I")
	public int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!lc", name = "Mb", descriptor = "[[I")
	public int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!lc", name = "Nb", descriptor = "[S")
	public short[] aShortArray32;

	@OriginalMember(owner = "client!lc", name = "Ob", descriptor = "[S")
	public short[] aShortArray33;

	@OriginalMember(owner = "client!lc", name = "U", descriptor = "I")
	public int anInt2560 = 0;

	@OriginalMember(owner = "client!lc", name = "ab", descriptor = "Z")
	private boolean aBoolean129 = false;

	@OriginalMember(owner = "client!lc", name = "Kb", descriptor = "I")
	public int anInt2563 = 0;

	@OriginalMember(owner = "client!lc", name = "Db", descriptor = "B")
	public byte aByte6 = 0;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	private Class3_Sub2_Sub1_Sub4() {
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "([B)V")
	public Class3_Sub2_Sub1_Sub4(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method2040(arg0);
		} else {
			this.method2036(arg0);
		}
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "([Lclient!lc;I)V")
	public Class3_Sub2_Sub1_Sub4(@OriginalArg(0) Class3_Sub2_Sub1_Sub4[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt2560 = 0;
		this.anInt2563 = 0;
		this.anInt2562 = 0;
		this.aByte6 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class3_Sub2_Sub1_Sub4 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt2560 += local44.anInt2560;
				this.anInt2563 += local44.anInt2563;
				this.anInt2562 += local44.anInt2562;
				if (local44.aByteArray27 == null) {
					if (this.aByte6 == -1) {
						this.aByte6 = local44.aByte6;
					}
					if (this.aByte6 != local44.aByte6) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray23 != null;
				local19 |= local44.aByteArray31 != null;
				local21 |= local44.anIntArray427 != null;
				local23 |= local44.aShortArray32 != null;
				local25 |= local44.aByteArray25 != null;
			}
		}
		this.anIntArray428 = new int[this.anInt2560];
		this.anIntArray430 = new int[this.anInt2560];
		this.anIntArray434 = new int[this.anInt2560];
		this.anIntArray435 = new int[this.anInt2560];
		this.anIntArray431 = new int[this.anInt2563];
		this.anIntArray432 = new int[this.anInt2563];
		this.anIntArray436 = new int[this.anInt2563];
		if (local15) {
			this.aByteArray23 = new byte[this.anInt2563];
		}
		if (local17) {
			this.aByteArray27 = new byte[this.anInt2563];
		}
		if (local19) {
			this.aByteArray31 = new byte[this.anInt2563];
		}
		if (local21) {
			this.anIntArray427 = new int[this.anInt2563];
		}
		if (local23) {
			this.aShortArray32 = new short[this.anInt2563];
		}
		if (local25) {
			this.aByteArray25 = new byte[this.anInt2563];
		}
		this.aShortArray26 = new short[this.anInt2563];
		if (this.anInt2562 > 0) {
			this.aByteArray28 = new byte[this.anInt2562];
			this.aShortArray31 = new short[this.anInt2562];
			this.aShortArray33 = new short[this.anInt2562];
			this.aShortArray30 = new short[this.anInt2562];
			this.aShortArray27 = new short[this.anInt2562];
			this.aShortArray28 = new short[this.anInt2562];
			this.aShortArray29 = new short[this.anInt2562];
			this.aByteArray24 = new byte[this.anInt2562];
			this.aByteArray30 = new byte[this.anInt2562];
			this.aByteArray26 = new byte[this.anInt2562];
			this.aByteArray22 = new byte[this.anInt2562];
			this.aByteArray29 = new byte[this.anInt2562];
		}
		this.anInt2560 = 0;
		this.anInt2563 = 0;
		this.anInt2562 = 0;
		for (@Pc(293) int local293 = 0; local293 < arg1; local293++) {
			@Pc(298) Class3_Sub2_Sub1_Sub4 local298 = arg0[local293];
			if (local298 != null) {
				for (@Pc(302) int local302 = 0; local302 < local298.anInt2563; local302++) {
					if (local15 && local298.aByteArray23 != null) {
						this.aByteArray23[this.anInt2563] = local298.aByteArray23[local302];
					}
					if (local17) {
						if (local298.aByteArray27 == null) {
							this.aByteArray27[this.anInt2563] = local298.aByte6;
						} else {
							this.aByteArray27[this.anInt2563] = local298.aByteArray27[local302];
						}
					}
					if (local19 && local298.aByteArray31 != null) {
						this.aByteArray31[this.anInt2563] = local298.aByteArray31[local302];
					}
					if (local21 && local298.anIntArray427 != null) {
						this.anIntArray427[this.anInt2563] = local298.anIntArray427[local302];
					}
					if (local23) {
						if (local298.aShortArray32 == null) {
							this.aShortArray32[this.anInt2563] = -1;
						} else {
							this.aShortArray32[this.anInt2563] = local298.aShortArray32[local302];
						}
					}
					if (local25) {
						if (local298.aByteArray25 == null || local298.aByteArray25[local302] == -1) {
							this.aByteArray25[this.anInt2563] = -1;
						} else {
							this.aByteArray25[this.anInt2563] = (byte) (local298.aByteArray25[local302] + this.anInt2562);
						}
					}
					this.aShortArray26[this.anInt2563] = local298.aShortArray26[local302];
					this.anIntArray431[this.anInt2563] = this.method2023(local298, local298.anIntArray431[local302]);
					this.anIntArray432[this.anInt2563] = this.method2023(local298, local298.anIntArray432[local302]);
					this.anIntArray436[this.anInt2563] = this.method2023(local298, local298.anIntArray436[local302]);
					this.anInt2563++;
				}
				for (@Pc(477) int local477 = 0; local477 < local298.anInt2562; local477++) {
					@Pc(489) byte local489 = this.aByteArray28[this.anInt2562] = local298.aByteArray28[local477];
					if (local489 == 0) {
						this.aShortArray31[this.anInt2562] = (short) this.method2023(local298, local298.aShortArray31[local477]);
						this.aShortArray33[this.anInt2562] = (short) this.method2023(local298, local298.aShortArray33[local477]);
						this.aShortArray30[this.anInt2562] = (short) this.method2023(local298, local298.aShortArray30[local477]);
					}
					if (local489 >= 1 && local489 <= 3) {
						this.aShortArray31[this.anInt2562] = local298.aShortArray31[local477];
						this.aShortArray33[this.anInt2562] = local298.aShortArray33[local477];
						this.aShortArray30[this.anInt2562] = local298.aShortArray30[local477];
						this.aShortArray27[this.anInt2562] = local298.aShortArray27[local477];
						this.aShortArray28[this.anInt2562] = local298.aShortArray28[local477];
						this.aShortArray29[this.anInt2562] = local298.aShortArray29[local477];
						this.aByteArray24[this.anInt2562] = local298.aByteArray24[local477];
						this.aByteArray30[this.anInt2562] = local298.aByteArray30[local477];
						this.aByteArray26[this.anInt2562] = local298.aByteArray26[local477];
					}
					if (local489 == 2) {
						this.aByteArray22[this.anInt2562] = local298.aByteArray22[local477];
						this.aByteArray29[this.anInt2562] = local298.aByteArray29[local477];
					}
					this.anInt2562++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lclient!lc;ZZZZ)V")
	public Class3_Sub2_Sub1_Sub4(@OriginalArg(0) Class3_Sub2_Sub1_Sub4 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2560 = arg0.anInt2560;
		this.anInt2563 = arg0.anInt2563;
		this.anInt2562 = arg0.anInt2562;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray428 = arg0.anIntArray428;
			this.anIntArray430 = arg0.anIntArray430;
			this.anIntArray434 = arg0.anIntArray434;
		} else {
			this.anIntArray428 = new int[this.anInt2560];
			this.anIntArray430 = new int[this.anInt2560];
			this.anIntArray434 = new int[this.anInt2560];
			for (local57 = 0; local57 < this.anInt2560; local57++) {
				this.anIntArray428[local57] = arg0.anIntArray428[local57];
				this.anIntArray430[local57] = arg0.anIntArray430[local57];
				this.anIntArray434[local57] = arg0.anIntArray434[local57];
			}
		}
		if (arg2) {
			this.aShortArray26 = arg0.aShortArray26;
		} else {
			this.aShortArray26 = new short[this.anInt2563];
			for (local57 = 0; local57 < this.anInt2563; local57++) {
				this.aShortArray26[local57] = arg0.aShortArray26[local57];
			}
		}
		if (arg3 || arg0.aShortArray32 == null) {
			this.aShortArray32 = arg0.aShortArray32;
		} else {
			this.aShortArray32 = new short[this.anInt2563];
			for (local57 = 0; local57 < this.anInt2563; local57++) {
				this.aShortArray32[local57] = arg0.aShortArray32[local57];
			}
		}
		this.aByteArray31 = arg0.aByteArray31;
		this.anIntArray431 = arg0.anIntArray431;
		this.anIntArray432 = arg0.anIntArray432;
		this.anIntArray436 = arg0.anIntArray436;
		this.aByteArray23 = arg0.aByteArray23;
		this.aByteArray27 = arg0.aByteArray27;
		this.aByteArray25 = arg0.aByteArray25;
		this.aByte6 = arg0.aByte6;
		this.aByteArray28 = arg0.aByteArray28;
		this.aShortArray31 = arg0.aShortArray31;
		this.aShortArray33 = arg0.aShortArray33;
		this.aShortArray30 = arg0.aShortArray30;
		this.aShortArray27 = arg0.aShortArray27;
		this.aShortArray28 = arg0.aShortArray28;
		this.aShortArray29 = arg0.aShortArray29;
		this.aByteArray24 = arg0.aByteArray24;
		this.aByteArray30 = arg0.aByteArray30;
		this.aByteArray26 = arg0.aByteArray26;
		this.aByteArray22 = arg0.aByteArray22;
		this.aByteArray29 = arg0.aByteArray29;
		this.anIntArray435 = arg0.anIntArray435;
		this.anIntArray427 = arg0.anIntArray427;
		this.anIntArrayArray22 = arg0.anIntArrayArray22;
		this.anIntArrayArray21 = arg0.anIntArrayArray21;
		this.aClass10Array2 = arg0.aClass10Array2;
		this.aClass11Array1 = arg0.aClass11Array1;
		this.aClass10Array1 = arg0.aClass10Array1;
		this.aShort33 = arg0.aShort33;
		this.aShort32 = arg0.aShort32;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!lc;I)I")
	private int method2023(@OriginalArg(0) Class3_Sub2_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray428[arg1];
		@Pc(11) int local11 = arg0.anIntArray430[arg1];
		@Pc(16) int local16 = arg0.anIntArray434[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2560; local18++) {
			if (local6 == this.anIntArray428[local18] && local11 == this.anIntArray430[local18] && local16 == this.anIntArray434[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray428[this.anInt2560] = local6;
			this.anIntArray430[this.anInt2560] = local11;
			this.anIntArray434[this.anInt2560] = local16;
			if (arg0.anIntArray435 != null) {
				this.anIntArray435[this.anInt2560] = arg0.anIntArray435[arg1];
			}
			local1 = this.anInt2560++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "()V")
	public void method2025() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2560; local1++) {
			@Pc(7) int local7 = this.anIntArray428[local1];
			this.anIntArray428[local1] = this.anIntArray434[local1];
			this.anIntArray434[local1] = -local7;
		}
		this.method2039();
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "()V")
	public void method2026() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2560; local1++) {
			this.anIntArray434[local1] = -this.anIntArray434[local1];
		}
		this.method2039();
	}

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V")
	public void method2027() {
		@Pc(3) int local3 = Static89.anIntArray425[256];
		@Pc(7) int local7 = Static89.anIntArray433[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2560; local9++) {
			@Pc(26) int local26 = this.anIntArray434[local9] * local3 + this.anIntArray428[local9] * local7 >> 16;
			this.anIntArray434[local9] = this.anIntArray434[local9] * local7 - this.anIntArray428[local9] * local3 >> 16;
			this.anIntArray428[local9] = local26;
		}
		this.method2039();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([[IIIIZI)Lclient!lc;")
	public Class3_Sub2_Sub1_Sub4 method2028(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method2033();
		@Pc(6) int local6 = arg1 + this.aShort30;
		@Pc(11) int local11 = arg1 + this.aShort27;
		@Pc(16) int local16 = arg3 + this.aShort31;
		@Pc(21) int local21 = arg3 + this.aShort29;
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
		@Pc(101) Class3_Sub2_Sub1_Sub4 local101 = new Class3_Sub2_Sub1_Sub4();
		local101.anInt2560 = this.anInt2560;
		local101.anInt2563 = this.anInt2563;
		local101.anInt2562 = this.anInt2562;
		local101.anIntArray428 = this.anIntArray428;
		local101.anIntArray434 = this.anIntArray434;
		local101.anIntArray431 = this.anIntArray431;
		local101.anIntArray432 = this.anIntArray432;
		local101.anIntArray436 = this.anIntArray436;
		local101.aByteArray23 = this.aByteArray23;
		local101.aByteArray27 = this.aByteArray27;
		local101.aByteArray31 = this.aByteArray31;
		local101.aByteArray25 = this.aByteArray25;
		local101.aShortArray26 = this.aShortArray26;
		local101.aShortArray32 = this.aShortArray32;
		local101.aByte6 = this.aByte6;
		local101.aByteArray28 = this.aByteArray28;
		local101.aShortArray31 = this.aShortArray31;
		local101.aShortArray33 = this.aShortArray33;
		local101.aShortArray30 = this.aShortArray30;
		local101.aShortArray27 = this.aShortArray27;
		local101.aShortArray28 = this.aShortArray28;
		local101.aShortArray29 = this.aShortArray29;
		local101.aByteArray24 = this.aByteArray24;
		local101.aByteArray30 = this.aByteArray30;
		local101.aByteArray26 = this.aByteArray26;
		local101.aByteArray22 = this.aByteArray22;
		local101.aByteArray29 = this.aByteArray29;
		local101.anIntArray435 = this.anIntArray435;
		local101.anIntArray427 = this.anIntArray427;
		local101.anIntArrayArray22 = this.anIntArrayArray22;
		local101.anIntArrayArray21 = this.anIntArrayArray21;
		local101.aShort33 = this.aShort33;
		local101.aShort32 = this.aShort32;
		local101.anIntArray430 = new int[local101.anInt2560];
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
			for (local245 = 0; local245 < local101.anInt2560; local245++) {
				local253 = this.anIntArray428[local245] + arg1;
				local260 = this.anIntArray434[local245] + arg3;
				local264 = local253 & 0x7F;
				local268 = local260 & 0x7F;
				local272 = local253 >> 7;
				local276 = local260 >> 7;
				local298 = arg0[local272][local276] * (128 - local264) + arg0[local272 + 1][local276] * local264 >> 7;
				local324 = arg0[local272][local276 + 1] * (128 - local264) + arg0[local272 + 1][local276 + 1] * local264 >> 7;
				local336 = local298 * (128 - local268) + local324 * local268 >> 7;
				local101.anIntArray430[local245] = this.anIntArray430[local245] + local336 - arg2;
			}
		} else {
			for (local245 = 0; local245 < local101.anInt2560; local245++) {
				local253 = (this.anIntArray430[local245] << 16) / super.aShort36;
				if (local253 < arg4) {
					local260 = this.anIntArray428[local245] + arg1;
					local264 = this.anIntArray434[local245] + arg3;
					local268 = local260 & 0x7F;
					local272 = local264 & 0x7F;
					local276 = local260 >> 7;
					local298 = local264 >> 7;
					local324 = arg0[local276][local298] * (128 - local268) + arg0[local276 + 1][local298] * local268 >> 7;
					local336 = arg0[local276][local298 + 1] * (128 - local268) + arg0[local276 + 1][local298 + 1] * local268 >> 7;
					@Pc(460) int local460 = local324 * (128 - local272) + local336 * local272 >> 7;
					local101.anIntArray430[local245] = this.anIntArray430[local245] + (local460 - arg2) * (arg4 - local253) / arg4;
				} else {
					local101.anIntArray430[local245] = this.anIntArray430[local245];
				}
			}
		}
		local101.method2039();
		return local101;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(SS)V")
	public void method2029(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2563; local1++) {
			if (this.aShortArray26[local1] == arg0) {
				this.aShortArray26[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIII)Lclient!af;")
	public Class3_Sub2_Sub1_Sub1_Sub1 method2031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class3_Sub2_Sub1_Sub1_Sub1(this, arg0, arg1, -50, -10, -50);
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(SS)V")
	public void method2032(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray32 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt2563; local5++) {
			if (this.aShortArray32[local5] == arg0) {
				this.aShortArray32[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "()V")
	public void method2033() {
		if (this.aBoolean129) {
			return;
		}
		this.aBoolean129 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt2560; local20++) {
			@Pc(26) int local26 = this.anIntArray428[local20];
			@Pc(31) int local31 = this.anIntArray430[local20];
			@Pc(36) int local36 = this.anIntArray434[local20];
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
		this.aShort27 = (short) local14;
		super.aShort36 = (short) local10;
		this.aShort28 = (short) local16;
		this.aShort31 = (short) local12;
		this.aShort29 = (short) local18;
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(III)V")
	public void method2034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2560; local1++) {
			this.anIntArray428[local1] = this.anIntArray428[local1] * arg0 / 128;
			this.anIntArray430[local1] = this.anIntArray430[local1] * arg1 / 128;
			this.anIntArray434[local1] = this.anIntArray434[local1] * arg2 / 128;
		}
		this.method2039();
	}

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "()V")
	public void method2035() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2560; local1++) {
			@Pc(7) int local7 = this.anIntArray434[local1];
			this.anIntArray434[local1] = this.anIntArray428[local1];
			this.anIntArray428[local1] = -local7;
		}
		this.method2039();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([B)V")
	private void method2036(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class3_Sub8 local8 = new Class3_Sub8(arg0);
		@Pc(13) Class3_Sub8 local13 = new Class3_Sub8(arg0);
		@Pc(18) Class3_Sub8 local18 = new Class3_Sub8(arg0);
		@Pc(23) Class3_Sub8 local23 = new Class3_Sub8(arg0);
		@Pc(28) Class3_Sub8 local28 = new Class3_Sub8(arg0);
		local8.anInt1948 = arg0.length - 18;
		@Pc(38) int local38 = local8.method1510();
		@Pc(42) int local42 = local8.method1510();
		@Pc(46) int local46 = local8.method1545();
		@Pc(50) int local50 = local8.method1545();
		@Pc(54) int local54 = local8.method1545();
		@Pc(58) int local58 = local8.method1545();
		@Pc(62) int local62 = local8.method1545();
		@Pc(66) int local66 = local8.method1545();
		@Pc(70) int local70 = local8.method1510();
		@Pc(74) int local74 = local8.method1510();
		@Pc(78) int local78 = local8.method1510();
		@Pc(82) int local82 = local8.method1510();
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
		this.anInt2560 = local38;
		this.anInt2563 = local42;
		this.anInt2562 = local46;
		this.anIntArray428 = new int[local38];
		this.anIntArray430 = new int[local38];
		this.anIntArray434 = new int[local38];
		this.anIntArray431 = new int[local42];
		this.anIntArray432 = new int[local42];
		this.anIntArray436 = new int[local42];
		if (local46 > 0) {
			this.aByteArray28 = new byte[local46];
			this.aShortArray31 = new short[local46];
			this.aShortArray33 = new short[local46];
			this.aShortArray30 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray435 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray23 = new byte[local42];
			this.aByteArray25 = new byte[local42];
			this.aShortArray32 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray27 = new byte[local42];
		} else {
			this.aByte6 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray31 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray427 = new int[local42];
		}
		this.aShortArray26 = new short[local42];
		local8.anInt1948 = 0;
		local13.anInt1948 = local165;
		local18.anInt1948 = local171;
		local23.anInt1948 = local90;
		local28.anInt1948 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method1545();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method1532();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method1532();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method1532();
			}
			this.anIntArray428[local307] = local301 + local314;
			this.anIntArray430[local307] = local303 + local324;
			this.anIntArray434[local307] = local305 + local334;
			local301 = this.anIntArray428[local307];
			local303 = this.anIntArray430[local307];
			local305 = this.anIntArray434[local307];
			if (local66 == 1) {
				this.anIntArray435[local307] = local28.method1545();
			}
		}
		local8.anInt1948 = local149;
		local13.anInt1948 = local116;
		local18.anInt1948 = local98;
		local23.anInt1948 = local134;
		local28.anInt1948 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray26[local312] = (short) local8.method1510();
			if (local50 == 1) {
				local314 = local13.method1545();
				if ((local314 & 0x1) == 1) {
					this.aByteArray23[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray23[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray25[local312] = (byte) (local314 >> 2);
					this.aShortArray32[local312] = this.aShortArray26[local312];
					this.aShortArray26[local312] = 127;
					if (this.aShortArray32[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray25[local312] = -1;
					this.aShortArray32[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray27[local312] = local18.method1508();
			}
			if (local58 == 1) {
				this.aByteArray31[local312] = local23.method1508();
			}
			if (local62 == 1) {
				this.anIntArray427[local312] = local28.method1545();
			}
		}
		local8.anInt1948 = local143;
		local13.anInt1948 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method1545();
			if (local543 == 1) {
				local314 = local8.method1532() + local536;
				local324 = local8.method1532() + local314;
				local334 = local8.method1532() + local324;
				local536 = local334;
				this.anIntArray431[local538] = local314;
				this.anIntArray432[local538] = local324;
				this.anIntArray436[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method1532() + local536;
				local536 = local334;
				this.anIntArray431[local538] = local314;
				this.anIntArray432[local538] = local324;
				this.anIntArray436[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method1532() + local536;
				local536 = local334;
				this.anIntArray431[local538] = local314;
				this.anIntArray432[local538] = local324;
				this.anIntArray436[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method1532() + local536;
				local536 = local334;
				this.anIntArray431[local538] = local314;
				this.anIntArray432[local538] = local646;
				this.anIntArray436[local538] = local334;
			}
		}
		local8.anInt1948 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray28[local543] = 0;
			this.aShortArray31[local543] = (short) local8.method1510();
			this.aShortArray33[local543] = (short) local8.method1510();
			this.aShortArray30[local543] = (short) local8.method1510();
		}
		if (this.aByteArray25 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray25[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray31[local731] & 0xFFFF) == this.anIntArray431[local723] && (this.aShortArray33[local731] & 0xFFFF) == this.anIntArray432[local723] && (this.aShortArray30[local731] & 0xFFFF) == this.anIntArray436[local723]) {
						this.aByteArray25[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray25 = null;
			}
		}
		if (!local3) {
			this.aShortArray32 = null;
		}
		if (!local1) {
			this.aByteArray23 = null;
		}
	}

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "()V")
	public void method2037() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2560; local1++) {
			this.anIntArray428[local1] = -this.anIntArray428[local1];
			this.anIntArray434[local1] = -this.anIntArray434[local1];
		}
		this.method2039();
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(III)V")
	public void method2038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2560; local1++) {
			this.anIntArray428[local1] += arg0;
			this.anIntArray430[local1] += arg1;
			this.anIntArray434[local1] += arg2;
		}
		this.method2039();
	}

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "()V")
	private void method2039() {
		this.aClass10Array2 = null;
		this.aClass10Array1 = null;
		this.aClass11Array1 = null;
		this.aBoolean129 = false;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "([B)V")
	private void method2040(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class3_Sub8 local4 = new Class3_Sub8(arg0);
		@Pc(9) Class3_Sub8 local9 = new Class3_Sub8(arg0);
		@Pc(14) Class3_Sub8 local14 = new Class3_Sub8(arg0);
		@Pc(19) Class3_Sub8 local19 = new Class3_Sub8(arg0);
		@Pc(24) Class3_Sub8 local24 = new Class3_Sub8(arg0);
		@Pc(29) Class3_Sub8 local29 = new Class3_Sub8(arg0);
		@Pc(34) Class3_Sub8 local34 = new Class3_Sub8(arg0);
		local4.anInt1948 = arg0.length - 23;
		@Pc(44) int local44 = local4.method1510();
		@Pc(48) int local48 = local4.method1510();
		@Pc(52) int local52 = local4.method1545();
		@Pc(56) int local56 = local4.method1545();
		@Pc(60) int local60 = local4.method1545();
		@Pc(64) int local64 = local4.method1545();
		@Pc(68) int local68 = local4.method1545();
		@Pc(72) int local72 = local4.method1545();
		@Pc(76) int local76 = local4.method1545();
		@Pc(80) int local80 = local4.method1510();
		@Pc(84) int local84 = local4.method1510();
		@Pc(88) int local88 = local4.method1510();
		@Pc(92) int local92 = local4.method1510();
		@Pc(96) int local96 = local4.method1510();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray28 = new byte[local52];
			local4.anInt1948 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray28[local113] = local4.method1508();
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
		this.anInt2560 = local44;
		this.anInt2563 = local48;
		this.anInt2562 = local52;
		this.anIntArray428 = new int[local44];
		this.anIntArray430 = new int[local44];
		this.anIntArray434 = new int[local44];
		this.anIntArray431 = new int[local48];
		this.anIntArray432 = new int[local48];
		this.anIntArray436 = new int[local48];
		if (local76 == 1) {
			this.anIntArray435 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray23 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray27 = new byte[local48];
		} else {
			this.aByte6 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray31 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray427 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray32 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray25 = new byte[local48];
		}
		this.aShortArray26 = new short[local48];
		if (local52 > 0) {
			this.aShortArray31 = new short[local52];
			this.aShortArray33 = new short[local52];
			this.aShortArray30 = new short[local52];
			if (local100 > 0) {
				this.aShortArray27 = new short[local100];
				this.aShortArray28 = new short[local100];
				this.aShortArray29 = new short[local100];
				this.aByteArray24 = new byte[local100];
				this.aByteArray30 = new byte[local100];
				this.aByteArray26 = new byte[local100];
			}
			if (local102 > 0) {
				this.aByteArray22 = new byte[local102];
				this.aByteArray29 = new byte[local102];
			}
		}
		local4.anInt1948 = local52;
		local9.anInt1948 = local233;
		local14.anInt1948 = local239;
		local19.anInt1948 = local245;
		local24.anInt1948 = local184;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(461) int local461 = 0;
		@Pc(468) int local468;
		@Pc(470) int local470;
		@Pc(480) int local480;
		@Pc(490) int local490;
		for (@Pc(463) int local463 = 0; local463 < local44; local463++) {
			local468 = local4.method1545();
			local470 = 0;
			if ((local468 & 0x1) != 0) {
				local470 = local9.method1532();
			}
			local480 = 0;
			if ((local468 & 0x2) != 0) {
				local480 = local14.method1532();
			}
			local490 = 0;
			if ((local468 & 0x4) != 0) {
				local490 = local19.method1532();
			}
			this.anIntArray428[local463] = local457 + local470;
			this.anIntArray430[local463] = local459 + local480;
			this.anIntArray434[local463] = local461 + local490;
			local457 = this.anIntArray428[local463];
			local459 = this.anIntArray430[local463];
			local461 = this.anIntArray434[local463];
			if (local76 == 1) {
				this.anIntArray435[local463] = local24.method1545();
			}
		}
		local4.anInt1948 = local225;
		local9.anInt1948 = local151;
		local14.anInt1948 = local166;
		local19.anInt1948 = local193;
		local24.anInt1948 = local175;
		local29.anInt1948 = local208;
		local34.anInt1948 = local219;
		for (local468 = 0; local468 < local48; local468++) {
			this.aShortArray26[local468] = (short) local4.method1510();
			if (local56 == 1) {
				this.aByteArray23[local468] = local9.method1508();
			}
			if (local60 == 255) {
				this.aByteArray27[local468] = local14.method1508();
			}
			if (local64 == 1) {
				this.aByteArray31[local468] = local19.method1508();
			}
			if (local68 == 1) {
				this.anIntArray427[local468] = local24.method1545();
			}
			if (local72 == 1) {
				this.aShortArray32[local468] = (short) (local29.method1510() - 1);
			}
			if (this.aByteArray25 != null) {
				if (this.aShortArray32[local468] == -1) {
					this.aByteArray25[local468] = -1;
				} else {
					this.aByteArray25[local468] = (byte) (local34.method1545() - 1);
				}
			}
		}
		local4.anInt1948 = local202;
		local9.anInt1948 = local160;
		local470 = 0;
		local480 = 0;
		local490 = 0;
		@Pc(676) int local676 = 0;
		@Pc(683) int local683;
		@Pc(786) int local786;
		for (@Pc(678) int local678 = 0; local678 < local48; local678++) {
			local683 = local9.method1545();
			if (local683 == 1) {
				local470 = local4.method1532() + local676;
				local480 = local4.method1532() + local470;
				local490 = local4.method1532() + local480;
				local676 = local490;
				this.anIntArray431[local678] = local470;
				this.anIntArray432[local678] = local480;
				this.anIntArray436[local678] = local490;
			}
			if (local683 == 2) {
				local480 = local490;
				local490 = local4.method1532() + local676;
				local676 = local490;
				this.anIntArray431[local678] = local470;
				this.anIntArray432[local678] = local480;
				this.anIntArray436[local678] = local490;
			}
			if (local683 == 3) {
				local470 = local490;
				local490 = local4.method1532() + local676;
				local676 = local490;
				this.anIntArray431[local678] = local470;
				this.anIntArray432[local678] = local480;
				this.anIntArray436[local678] = local490;
			}
			if (local683 == 4) {
				local786 = local470;
				local470 = local480;
				local480 = local786;
				local490 = local4.method1532() + local676;
				local676 = local490;
				this.anIntArray431[local678] = local470;
				this.anIntArray432[local678] = local786;
				this.anIntArray436[local678] = local490;
			}
		}
		local4.anInt1948 = local251;
		local9.anInt1948 = local259;
		local14.anInt1948 = local267;
		local19.anInt1948 = local275;
		local24.anInt1948 = local281;
		local29.anInt1948 = local287;
		for (local683 = 0; local683 < local52; local683++) {
			local786 = this.aByteArray28[local683] & 0xFF;
			if (local786 == 0) {
				this.aShortArray31[local683] = (short) local4.method1510();
				this.aShortArray33[local683] = (short) local4.method1510();
				this.aShortArray30[local683] = (short) local4.method1510();
			}
			if (local786 == 1) {
				this.aShortArray31[local683] = (short) local9.method1510();
				this.aShortArray33[local683] = (short) local9.method1510();
				this.aShortArray30[local683] = (short) local9.method1510();
				this.aShortArray27[local683] = (short) local14.method1510();
				this.aShortArray28[local683] = (short) local14.method1510();
				this.aShortArray29[local683] = (short) local14.method1510();
				this.aByteArray24[local683] = local19.method1508();
				this.aByteArray30[local683] = local24.method1508();
				this.aByteArray26[local683] = local29.method1508();
			}
			if (local786 == 2) {
				this.aShortArray31[local683] = (short) local9.method1510();
				this.aShortArray33[local683] = (short) local9.method1510();
				this.aShortArray30[local683] = (short) local9.method1510();
				this.aShortArray27[local683] = (short) local14.method1510();
				this.aShortArray28[local683] = (short) local14.method1510();
				this.aShortArray29[local683] = (short) local14.method1510();
				this.aByteArray24[local683] = local19.method1508();
				this.aByteArray30[local683] = local24.method1508();
				this.aByteArray26[local683] = local29.method1508();
				this.aByteArray22[local683] = local29.method1508();
				this.aByteArray29[local683] = local29.method1508();
			}
			if (local786 == 3) {
				this.aShortArray31[local683] = (short) local9.method1510();
				this.aShortArray33[local683] = (short) local9.method1510();
				this.aShortArray30[local683] = (short) local9.method1510();
				this.aShortArray27[local683] = (short) local14.method1510();
				this.aShortArray28[local683] = (short) local14.method1510();
				this.aShortArray29[local683] = (short) local14.method1510();
				this.aByteArray24[local683] = local19.method1508();
				this.aByteArray30[local683] = local24.method1508();
				this.aByteArray26[local683] = local29.method1508();
			}
		}
		local4.anInt1948 = local113;
		local786 = local4.method1545();
		if (local786 == 0) {
			return;
		}
		new Class31();
		local4.method1510();
		local4.method1510();
		local4.method1510();
		local4.method1540();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIZZ)Lclient!d;")
	public Class3_Sub2_Sub1_Sub1 method2041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class3_Sub2_Sub1_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "()Lclient!lc;")
	public Class3_Sub2_Sub1_Sub4 method2042() {
		@Pc(3) Class3_Sub2_Sub1_Sub4 local3 = new Class3_Sub2_Sub1_Sub4();
		if (this.aByteArray23 != null) {
			local3.aByteArray23 = new byte[this.anInt2563];
			for (@Pc(13) int local13 = 0; local13 < this.anInt2563; local13++) {
				local3.aByteArray23[local13] = this.aByteArray23[local13];
			}
		}
		local3.anInt2560 = this.anInt2560;
		local3.anInt2563 = this.anInt2563;
		local3.anInt2562 = this.anInt2562;
		local3.anIntArray428 = this.anIntArray428;
		local3.anIntArray430 = this.anIntArray430;
		local3.anIntArray434 = this.anIntArray434;
		local3.anIntArray431 = this.anIntArray431;
		local3.anIntArray432 = this.anIntArray432;
		local3.anIntArray436 = this.anIntArray436;
		local3.aByteArray27 = this.aByteArray27;
		local3.aByteArray31 = this.aByteArray31;
		local3.aByteArray25 = this.aByteArray25;
		local3.aShortArray26 = this.aShortArray26;
		local3.aShortArray32 = this.aShortArray32;
		local3.aByte6 = this.aByte6;
		local3.aByteArray28 = this.aByteArray28;
		local3.aShortArray31 = this.aShortArray31;
		local3.aShortArray33 = this.aShortArray33;
		local3.aShortArray30 = this.aShortArray30;
		local3.aShortArray27 = this.aShortArray27;
		local3.aShortArray28 = this.aShortArray28;
		local3.aShortArray29 = this.aShortArray29;
		local3.aByteArray24 = this.aByteArray24;
		local3.aByteArray30 = this.aByteArray30;
		local3.aByteArray26 = this.aByteArray26;
		local3.aByteArray22 = this.aByteArray22;
		local3.aByteArray29 = this.aByteArray29;
		local3.anIntArray435 = this.anIntArray435;
		local3.anIntArray427 = this.anIntArray427;
		local3.anIntArrayArray22 = this.anIntArrayArray22;
		local3.anIntArrayArray21 = this.anIntArrayArray21;
		local3.aClass10Array2 = this.aClass10Array2;
		local3.aClass11Array1 = this.aClass11Array1;
		local3.aShort33 = this.aShort33;
		local3.aShort32 = this.aShort32;
		return local3;
	}

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "()V")
	public void method2043() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray435 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt2560; local9++) {
				local15 = this.anIntArray435[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray22 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray22[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt2560) {
				local65 = this.anIntArray435[local59];
				this.anIntArrayArray22[local65][local5[local65]++] = local59++;
			}
			this.anIntArray435 = null;
		}
		if (this.anIntArray427 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt2563; local9++) {
			local15 = this.anIntArray427[local9];
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
		while (local59 < this.anInt2563) {
			local65 = this.anIntArray427[local59];
			this.anIntArrayArray21[local65][local5[local65]++] = local59++;
		}
		this.anIntArray427 = null;
	}

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "()V")
	public void method2045() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2563; local1++) {
			@Pc(7) int local7 = this.anIntArray431[local1];
			this.anIntArray431[local1] = this.anIntArray436[local1];
			this.anIntArray436[local1] = local7;
		}
		this.method2039();
	}

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "()V")
	public void method2046() {
		if (this.aClass10Array2 != null) {
			return;
		}
		this.aClass10Array2 = new Class10[this.anInt2560];
		for (@Pc(10) int local10 = 0; local10 < this.anInt2560; local10++) {
			this.aClass10Array2[local10] = new Class10();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt2563; local25++) {
			@Pc(31) int local31 = this.anIntArray431[local25];
			@Pc(36) int local36 = this.anIntArray432[local25];
			@Pc(41) int local41 = this.anIntArray436[local25];
			@Pc(51) int local51 = this.anIntArray428[local36] - this.anIntArray428[local31];
			@Pc(61) int local61 = this.anIntArray430[local36] - this.anIntArray430[local31];
			@Pc(71) int local71 = this.anIntArray434[local36] - this.anIntArray434[local31];
			@Pc(81) int local81 = this.anIntArray428[local41] - this.anIntArray428[local31];
			@Pc(91) int local91 = this.anIntArray430[local41] - this.anIntArray430[local31];
			@Pc(101) int local101 = this.anIntArray434[local41] - this.anIntArray434[local31];
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
			if (this.aByteArray23 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray23[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class10 local211 = this.aClass10Array2[local31];
				local211.anInt445 += local109;
				local211.anInt446 += local117;
				local211.anInt448 += local125;
				local211.anInt447++;
				@Pc(240) Class10 local240 = this.aClass10Array2[local36];
				local240.anInt445 += local109;
				local240.anInt446 += local117;
				local240.anInt448 += local125;
				local240.anInt447++;
				@Pc(269) Class10 local269 = this.aClass10Array2[local41];
				local269.anInt445 += local109;
				local269.anInt446 += local117;
				local269.anInt448 += local125;
				local269.anInt447++;
			} else if (local198 == 1) {
				if (this.aClass11Array1 == null) {
					this.aClass11Array1 = new Class11[this.anInt2563];
				}
				@Pc(314) Class11 local314 = this.aClass11Array1[local25] = new Class11();
				local314.anInt485 = local109;
				local314.anInt479 = local117;
				local314.anInt478 = local125;
			}
		}
	}
}
