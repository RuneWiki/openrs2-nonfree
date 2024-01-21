import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class2_Sub1_Sub1_Sub7 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!wc", name = "kb", descriptor = "[I")
	public int[] anIntArray356;

	@OriginalMember(owner = "client!wc", name = "mb", descriptor = "[Lclient!ie;")
	public Class37[] aClass37Array1;

	@OriginalMember(owner = "client!wc", name = "nb", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!wc", name = "pb", descriptor = "[B")
	private byte[] aByteArray40;

	@OriginalMember(owner = "client!wc", name = "qb", descriptor = "I")
	public int anInt3039;

	@OriginalMember(owner = "client!wc", name = "rb", descriptor = "[Lclient!sc;")
	private Class69[] aClass69Array1;

	@OriginalMember(owner = "client!wc", name = "sb", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!wc", name = "tb", descriptor = "[I")
	private int[] anIntArray357;

	@OriginalMember(owner = "client!wc", name = "xb", descriptor = "[Lclient!ie;")
	public Class37[] aClass37Array2;

	@OriginalMember(owner = "client!wc", name = "yb", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!wc", name = "zb", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!wc", name = "Ab", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!wc", name = "Bb", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!wc", name = "Cb", descriptor = "S")
	public short aShort1;

	@OriginalMember(owner = "client!wc", name = "Db", descriptor = "I")
	public int anInt3040;

	@OriginalMember(owner = "client!wc", name = "Eb", descriptor = "[I")
	public int[] anIntArray361;

	@OriginalMember(owner = "client!wc", name = "Fb", descriptor = "[S")
	private short[] aShortArray30;

	@OriginalMember(owner = "client!wc", name = "Gb", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!wc", name = "Hb", descriptor = "[I")
	public int[] anIntArray362;

	@OriginalMember(owner = "client!wc", name = "Ib", descriptor = "[B")
	private byte[] aByteArray41;

	@OriginalMember(owner = "client!wc", name = "Jb", descriptor = "I")
	public int anInt3041;

	@OriginalMember(owner = "client!wc", name = "Kb", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!wc", name = "Lb", descriptor = "[I")
	private int[] anIntArray363;

	@OriginalMember(owner = "client!wc", name = "Nb", descriptor = "[B")
	private byte[] aByteArray42;

	@OriginalMember(owner = "client!wc", name = "Ob", descriptor = "[I")
	public int[] anIntArray364;

	@OriginalMember(owner = "client!wc", name = "Pb", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!wc", name = "Qb", descriptor = "I")
	public int anInt3042;

	@OriginalMember(owner = "client!wc", name = "Sb", descriptor = "[B")
	private byte[] aByteArray43;

	@OriginalMember(owner = "client!wc", name = "Tb", descriptor = "[B")
	private byte[] aByteArray44;

	@OriginalMember(owner = "client!wc", name = "Ub", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!wc", name = "Wb", descriptor = "I")
	private int anInt3044;

	@OriginalMember(owner = "client!wc", name = "Yb", descriptor = "[I")
	public int[] anIntArray366;

	@OriginalMember(owner = "client!wc", name = "Zb", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!wc", name = "ac", descriptor = "I")
	public int anInt3046;

	@OriginalMember(owner = "client!wc", name = "bc", descriptor = "[S")
	private short[] aShortArray35;

	@OriginalMember(owner = "client!wc", name = "cc", descriptor = "[[I")
	private int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!wc", name = "dc", descriptor = "[I")
	public int[] anIntArray367;

	@OriginalMember(owner = "client!wc", name = "ec", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!wc", name = "ob", descriptor = "I")
	public int anInt3038 = 0;

	@OriginalMember(owner = "client!wc", name = "lb", descriptor = "Z")
	private boolean aBoolean248 = false;

	@OriginalMember(owner = "client!wc", name = "Mb", descriptor = "B")
	private byte aByte7 = 0;

	@OriginalMember(owner = "client!wc", name = "Rb", descriptor = "I")
	public int anInt3043 = 0;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
	private Class2_Sub1_Sub1_Sub7() {
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "([B)V")
	public Class2_Sub1_Sub1_Sub7(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method2193(arg0);
		} else {
			this.method2190(arg0);
		}
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "([Lclient!wc;I)V")
	public Class2_Sub1_Sub1_Sub7(@OriginalArg(0) Class2_Sub1_Sub1_Sub7[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt3043 = 0;
		this.anInt3038 = 0;
		this.anInt3044 = 0;
		this.aByte7 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class2_Sub1_Sub1_Sub7 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt3043 += local44.anInt3043;
				this.anInt3038 += local44.anInt3038;
				this.anInt3044 += local44.anInt3044;
				if (local44.aByteArray41 == null) {
					if (this.aByte7 == -1) {
						this.aByte7 = local44.aByte7;
					}
					if (this.aByte7 != local44.aByte7) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray39 != null;
				local19 |= local44.aByteArray40 != null;
				local21 |= local44.anIntArray363 != null;
				local23 |= local44.aShortArray34 != null;
				local25 |= local44.aByteArray43 != null;
			}
		}
		this.anIntArray367 = new int[this.anInt3043];
		this.anIntArray362 = new int[this.anInt3043];
		this.anIntArray364 = new int[this.anInt3043];
		this.anIntArray357 = new int[this.anInt3043];
		this.anIntArray361 = new int[this.anInt3038];
		this.anIntArray366 = new int[this.anInt3038];
		this.anIntArray356 = new int[this.anInt3038];
		if (local15) {
			this.aByteArray39 = new byte[this.anInt3038];
		}
		if (local17) {
			this.aByteArray41 = new byte[this.anInt3038];
		}
		if (local19) {
			this.aByteArray40 = new byte[this.anInt3038];
		}
		if (local21) {
			this.anIntArray363 = new int[this.anInt3038];
		}
		if (local23) {
			this.aShortArray34 = new short[this.anInt3038];
		}
		if (local25) {
			this.aByteArray43 = new byte[this.anInt3038];
		}
		this.aShortArray30 = new short[this.anInt3038];
		if (this.anInt3044 > 0) {
			this.aByteArray44 = new byte[this.anInt3044];
			this.aShortArray26 = new short[this.anInt3044];
			this.aShortArray25 = new short[this.anInt3044];
			this.aShortArray31 = new short[this.anInt3044];
			this.aShortArray33 = new short[this.anInt3044];
			this.aShortArray35 = new short[this.anInt3044];
			this.aShortArray27 = new short[this.anInt3044];
			this.aShortArray28 = new short[this.anInt3044];
			this.aByteArray42 = new byte[this.anInt3044];
			this.aShortArray29 = new short[this.anInt3044];
			this.aShortArray32 = new short[this.anInt3044];
		}
		this.anInt3043 = 0;
		this.anInt3038 = 0;
		this.anInt3044 = 0;
		for (@Pc(288) int local288 = 0; local288 < arg1; local288++) {
			@Pc(293) Class2_Sub1_Sub1_Sub7 local293 = arg0[local288];
			if (local293 != null) {
				for (@Pc(297) int local297 = 0; local297 < local293.anInt3038; local297++) {
					if (local15 && local293.aByteArray39 != null) {
						this.aByteArray39[this.anInt3038] = local293.aByteArray39[local297];
					}
					if (local17) {
						if (local293.aByteArray41 == null) {
							this.aByteArray41[this.anInt3038] = local293.aByte7;
						} else {
							this.aByteArray41[this.anInt3038] = local293.aByteArray41[local297];
						}
					}
					if (local19 && local293.aByteArray40 != null) {
						this.aByteArray40[this.anInt3038] = local293.aByteArray40[local297];
					}
					if (local21 && local293.anIntArray363 != null) {
						this.anIntArray363[this.anInt3038] = local293.anIntArray363[local297];
					}
					if (local23) {
						if (local293.aShortArray34 == null) {
							this.aShortArray34[this.anInt3038] = -1;
						} else {
							this.aShortArray34[this.anInt3038] = local293.aShortArray34[local297];
						}
					}
					if (local25) {
						if (local293.aByteArray43 == null || local293.aByteArray43[local297] == -1) {
							this.aByteArray43[this.anInt3038] = -1;
						} else {
							this.aByteArray43[this.anInt3038] = (byte) (local293.aByteArray43[local297] + this.anInt3044);
						}
					}
					this.aShortArray30[this.anInt3038] = local293.aShortArray30[local297];
					this.anIntArray361[this.anInt3038] = this.method2187(local293, local293.anIntArray361[local297]);
					this.anIntArray366[this.anInt3038] = this.method2187(local293, local293.anIntArray366[local297]);
					this.anIntArray356[this.anInt3038] = this.method2187(local293, local293.anIntArray356[local297]);
					this.anInt3038++;
				}
				for (@Pc(472) int local472 = 0; local472 < local293.anInt3044; local472++) {
					@Pc(484) byte local484 = this.aByteArray44[this.anInt3044] = local293.aByteArray44[local472];
					if (local484 == 0) {
						this.aShortArray26[this.anInt3044] = (short) this.method2187(local293, local293.aShortArray26[local472]);
						this.aShortArray25[this.anInt3044] = (short) this.method2187(local293, local293.aShortArray25[local472]);
						this.aShortArray31[this.anInt3044] = (short) this.method2187(local293, local293.aShortArray31[local472]);
					}
					if (local484 >= 1 && local484 <= 3) {
						this.aShortArray26[this.anInt3044] = local293.aShortArray26[local472];
						this.aShortArray25[this.anInt3044] = local293.aShortArray25[local472];
						this.aShortArray31[this.anInt3044] = local293.aShortArray31[local472];
						this.aShortArray33[this.anInt3044] = local293.aShortArray33[local472];
						this.aShortArray35[this.anInt3044] = local293.aShortArray35[local472];
						this.aShortArray27[this.anInt3044] = local293.aShortArray27[local472];
						this.aShortArray28[this.anInt3044] = local293.aShortArray28[local472];
						this.aByteArray42[this.anInt3044] = local293.aByteArray42[local472];
						this.aShortArray29[this.anInt3044] = local293.aShortArray29[local472];
					}
					if (local484 == 2) {
						this.aShortArray32[this.anInt3044] = local293.aShortArray32[local472];
					}
					this.anInt3044++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!wc;ZZZZ)V")
	public Class2_Sub1_Sub1_Sub7(@OriginalArg(0) Class2_Sub1_Sub1_Sub7 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3043 = arg0.anInt3043;
		this.anInt3038 = arg0.anInt3038;
		this.anInt3044 = arg0.anInt3044;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray367 = arg0.anIntArray367;
			this.anIntArray362 = arg0.anIntArray362;
			this.anIntArray364 = arg0.anIntArray364;
		} else {
			this.anIntArray367 = new int[this.anInt3043];
			this.anIntArray362 = new int[this.anInt3043];
			this.anIntArray364 = new int[this.anInt3043];
			for (local57 = 0; local57 < this.anInt3043; local57++) {
				this.anIntArray367[local57] = arg0.anIntArray367[local57];
				this.anIntArray362[local57] = arg0.anIntArray362[local57];
				this.anIntArray364[local57] = arg0.anIntArray364[local57];
			}
		}
		if (arg2) {
			this.aShortArray30 = arg0.aShortArray30;
		} else {
			this.aShortArray30 = new short[this.anInt3038];
			for (local57 = 0; local57 < this.anInt3038; local57++) {
				this.aShortArray30[local57] = arg0.aShortArray30[local57];
			}
		}
		if (arg3 || arg0.aShortArray34 == null) {
			this.aShortArray34 = arg0.aShortArray34;
		} else {
			this.aShortArray34 = new short[this.anInt3038];
			for (local57 = 0; local57 < this.anInt3038; local57++) {
				this.aShortArray34[local57] = arg0.aShortArray34[local57];
			}
		}
		this.aByteArray40 = arg0.aByteArray40;
		this.anIntArray361 = arg0.anIntArray361;
		this.anIntArray366 = arg0.anIntArray366;
		this.anIntArray356 = arg0.anIntArray356;
		this.aByteArray39 = arg0.aByteArray39;
		this.aByteArray41 = arg0.aByteArray41;
		this.aByteArray43 = arg0.aByteArray43;
		this.aByte7 = arg0.aByte7;
		this.aByteArray44 = arg0.aByteArray44;
		this.aShortArray26 = arg0.aShortArray26;
		this.aShortArray25 = arg0.aShortArray25;
		this.aShortArray31 = arg0.aShortArray31;
		this.aShortArray33 = arg0.aShortArray33;
		this.aShortArray35 = arg0.aShortArray35;
		this.aShortArray27 = arg0.aShortArray27;
		this.aShortArray28 = arg0.aShortArray28;
		this.aByteArray42 = arg0.aByteArray42;
		this.aShortArray29 = arg0.aShortArray29;
		this.aShortArray32 = arg0.aShortArray32;
		this.anIntArray357 = arg0.anIntArray357;
		this.anIntArray363 = arg0.anIntArray363;
		this.anIntArrayArray29 = arg0.anIntArrayArray29;
		this.anIntArrayArray30 = arg0.anIntArrayArray30;
		this.aClass37Array1 = arg0.aClass37Array1;
		this.aClass69Array1 = arg0.aClass69Array1;
		this.aClass37Array2 = arg0.aClass37Array2;
		this.aShort2 = arg0.aShort2;
		this.aShort1 = arg0.aShort1;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([[IIIIZI)Lclient!wc;")
	public Class2_Sub1_Sub1_Sub7 method2173(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method2177();
		@Pc(6) int local6 = arg1 + this.anInt3042;
		@Pc(11) int local11 = arg1 + this.anInt3040;
		@Pc(16) int local16 = arg3 + this.anInt3041;
		@Pc(21) int local21 = arg3 + this.anInt3046;
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
		@Pc(101) Class2_Sub1_Sub1_Sub7 local101 = new Class2_Sub1_Sub1_Sub7();
		local101.anInt3043 = this.anInt3043;
		local101.anInt3038 = this.anInt3038;
		local101.anInt3044 = this.anInt3044;
		local101.anIntArray367 = this.anIntArray367;
		local101.anIntArray364 = this.anIntArray364;
		local101.anIntArray361 = this.anIntArray361;
		local101.anIntArray366 = this.anIntArray366;
		local101.anIntArray356 = this.anIntArray356;
		local101.aByteArray39 = this.aByteArray39;
		local101.aByteArray41 = this.aByteArray41;
		local101.aByteArray40 = this.aByteArray40;
		local101.aByteArray43 = this.aByteArray43;
		local101.aShortArray30 = this.aShortArray30;
		local101.aShortArray34 = this.aShortArray34;
		local101.aByte7 = this.aByte7;
		local101.aByteArray44 = this.aByteArray44;
		local101.aShortArray26 = this.aShortArray26;
		local101.aShortArray25 = this.aShortArray25;
		local101.aShortArray31 = this.aShortArray31;
		local101.aShortArray33 = this.aShortArray33;
		local101.aShortArray35 = this.aShortArray35;
		local101.aShortArray27 = this.aShortArray27;
		local101.aShortArray28 = this.aShortArray28;
		local101.aByteArray42 = this.aByteArray42;
		local101.aShortArray29 = this.aShortArray29;
		local101.aShortArray32 = this.aShortArray32;
		local101.anIntArray357 = this.anIntArray357;
		local101.anIntArray363 = this.anIntArray363;
		local101.anIntArrayArray29 = this.anIntArrayArray29;
		local101.anIntArrayArray30 = this.anIntArrayArray30;
		local101.aShort2 = this.aShort2;
		local101.aShort1 = this.aShort1;
		local101.anIntArray362 = new int[local101.anInt3043];
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
			for (local241 = 0; local241 < local101.anInt3043; local241++) {
				local249 = this.anIntArray367[local241] + arg1;
				local256 = this.anIntArray364[local241] + arg3;
				local260 = local249 & 0x7F;
				local264 = local256 & 0x7F;
				local268 = local249 >> 7;
				local272 = local256 >> 7;
				local294 = arg0[local268][local272] * (128 - local260) + arg0[local268 + 1][local272] * local260 >> 7;
				local320 = arg0[local268][local272 + 1] * (128 - local260) + arg0[local268 + 1][local272 + 1] * local260 >> 7;
				local332 = local294 * (128 - local264) + local320 * local264 >> 7;
				local101.anIntArray362[local241] = this.anIntArray362[local241] + local332 - arg2;
			}
		} else {
			for (local241 = 0; local241 < local101.anInt3043; local241++) {
				local249 = (-this.anIntArray362[local241] << 16) / super.anInt3029;
				if (local249 < arg4) {
					local256 = this.anIntArray367[local241] + arg1;
					local260 = this.anIntArray364[local241] + arg3;
					local264 = local256 & 0x7F;
					local268 = local260 & 0x7F;
					local272 = local256 >> 7;
					local294 = local260 >> 7;
					local320 = arg0[local272][local294] * (128 - local264) + arg0[local272 + 1][local294] * local264 >> 7;
					local332 = arg0[local272][local294 + 1] * (128 - local264) + arg0[local272 + 1][local294 + 1] * local264 >> 7;
					@Pc(457) int local457 = local320 * (128 - local268) + local332 * local268 >> 7;
					local101.anIntArray362[local241] = this.anIntArray362[local241] + (local457 - arg2) * (arg4 - local249) / arg4;
				}
			}
		}
		local101.method2174();
		return local101;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "()V")
	private void method2174() {
		this.aClass37Array1 = null;
		this.aClass37Array2 = null;
		this.aClass69Array1 = null;
		this.aBoolean248 = false;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIII)Lclient!ad;")
	public Class2_Sub1_Sub1_Sub2 method2176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2186();
		@Pc(16) int local16 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(22) int local22 = arg1 * local16 >> 8;
		@Pc(26) Class2_Sub1_Sub1_Sub2 local26 = new Class2_Sub1_Sub1_Sub2();
		local26.anIntArray19 = new int[this.anInt3038];
		local26.anIntArray18 = new int[this.anInt3038];
		local26.anIntArray12 = new int[this.anInt3038];
		@Pc(184) int local184;
		if (this.anInt3044 > 0 && this.aByteArray43 != null) {
			@Pc(51) int[] local51 = new int[this.anInt3044];
			for (@Pc(53) int local53 = 0; local53 < this.anInt3038; local53++) {
				if (this.aByteArray43[local53] != -1) {
					local51[this.aByteArray43[local53] & 0xFF]++;
				}
			}
			local26.anInt143 = 0;
			for (@Pc(82) int local82 = 0; local82 < this.anInt3044; local82++) {
				if (local51[local82] > 0 && this.aByteArray44[local82] == 0) {
					local26.anInt143++;
				}
			}
			local26.anIntArray10 = new int[local26.anInt143];
			local26.anIntArray16 = new int[local26.anInt143];
			local26.anIntArray9 = new int[local26.anInt143];
			@Pc(120) int local120 = 0;
			for (@Pc(122) int local122 = 0; local122 < this.anInt3044; local122++) {
				if (local51[local122] > 0 && this.aByteArray44[local122] == 0) {
					local26.anIntArray10[local120] = this.aShortArray26[local122] & 0xFFFF;
					local26.anIntArray16[local120] = this.aShortArray25[local122] & 0xFFFF;
					local26.anIntArray9[local120] = this.aShortArray31[local122] & 0xFFFF;
					local51[local122] = local120++;
				} else {
					local51[local122] = -1;
				}
			}
			local26.aByteArray4 = new byte[this.anInt3038];
			for (local184 = 0; local184 < this.anInt3038; local184++) {
				if (this.aByteArray43[local184] == -1) {
					local26.aByteArray4[local184] = -1;
				} else {
					local26.aByteArray4[local184] = (byte) local51[this.aByteArray43[local184] & 0xFF];
				}
			}
		}
		for (@Pc(217) int local217 = 0; local217 < this.anInt3038; local217++) {
			@Pc(223) byte local223;
			if (this.aByteArray39 == null) {
				local223 = 0;
			} else {
				local223 = this.aByteArray39[local217];
			}
			@Pc(234) byte local234;
			if (this.aByteArray40 == null) {
				local234 = 0;
			} else {
				local234 = this.aByteArray40[local217];
			}
			@Pc(245) short local245;
			if (this.aShortArray34 == null) {
				local245 = -1;
			} else {
				local245 = this.aShortArray34[local217];
			}
			if (local234 == -2) {
				local223 = 3;
			}
			if (local234 == -1) {
				local223 = 2;
			}
			@Pc(292) Class37 local292;
			@Pc(453) Class69 local453;
			if (local245 == -1) {
				if (local223 == 0) {
					@Pc(273) int local273 = this.aShortArray30[local217] & 0xFFFF;
					if (this.aClass37Array2 == null || this.aClass37Array2[this.anIntArray361[local217]] == null) {
						local292 = this.aClass37Array1[this.anIntArray361[local217]];
					} else {
						local292 = this.aClass37Array2[this.anIntArray361[local217]];
					}
					local184 = arg0 + (arg2 * local292.anInt1321 + arg3 * local292.anInt1320 + arg4 * local292.anInt1318) / (local22 * local292.anInt1325);
					local26.anIntArray19[local217] = Static131.method2189(local273, local184);
					if (this.aClass37Array2 == null || this.aClass37Array2[this.anIntArray366[local217]] == null) {
						local292 = this.aClass37Array1[this.anIntArray366[local217]];
					} else {
						local292 = this.aClass37Array2[this.anIntArray366[local217]];
					}
					local184 = arg0 + (arg2 * local292.anInt1321 + arg3 * local292.anInt1320 + arg4 * local292.anInt1318) / (local22 * local292.anInt1325);
					local26.anIntArray18[local217] = Static131.method2189(local273, local184);
					if (this.aClass37Array2 == null || this.aClass37Array2[this.anIntArray356[local217]] == null) {
						local292 = this.aClass37Array1[this.anIntArray356[local217]];
					} else {
						local292 = this.aClass37Array2[this.anIntArray356[local217]];
					}
					local184 = arg0 + (arg2 * local292.anInt1321 + arg3 * local292.anInt1320 + arg4 * local292.anInt1318) / (local22 * local292.anInt1325);
					local26.anIntArray12[local217] = Static131.method2189(local273, local184);
				} else if (local223 == 1) {
					local453 = this.aClass69Array1[local217];
					local184 = arg0 + (arg2 * local453.anInt2530 + arg3 * local453.anInt2526 + arg4 * local453.anInt2527) / (local22 + local22 / 2);
					local26.anIntArray19[local217] = Static131.method2189(this.aShortArray30[local217] & 0xFFFF, local184);
					local26.anIntArray12[local217] = -1;
				} else if (local223 == 3) {
					local26.anIntArray19[local217] = 128;
					local26.anIntArray12[local217] = -1;
				} else {
					local26.anIntArray12[local217] = -2;
				}
			} else if (local223 == 0) {
				if (this.aClass37Array2 == null || this.aClass37Array2[this.anIntArray361[local217]] == null) {
					local292 = this.aClass37Array1[this.anIntArray361[local217]];
				} else {
					local292 = this.aClass37Array2[this.anIntArray361[local217]];
				}
				local184 = arg0 + (arg2 * local292.anInt1321 + arg3 * local292.anInt1320 + arg4 * local292.anInt1318) / (local22 * local292.anInt1325);
				local26.anIntArray19[local217] = Static131.method2172(local184);
				if (this.aClass37Array2 == null || this.aClass37Array2[this.anIntArray366[local217]] == null) {
					local292 = this.aClass37Array1[this.anIntArray366[local217]];
				} else {
					local292 = this.aClass37Array2[this.anIntArray366[local217]];
				}
				local184 = arg0 + (arg2 * local292.anInt1321 + arg3 * local292.anInt1320 + arg4 * local292.anInt1318) / (local22 * local292.anInt1325);
				local26.anIntArray18[local217] = Static131.method2172(local184);
				if (this.aClass37Array2 == null || this.aClass37Array2[this.anIntArray356[local217]] == null) {
					local292 = this.aClass37Array1[this.anIntArray356[local217]];
				} else {
					local292 = this.aClass37Array2[this.anIntArray356[local217]];
				}
				local184 = arg0 + (arg2 * local292.anInt1321 + arg3 * local292.anInt1320 + arg4 * local292.anInt1318) / (local22 * local292.anInt1325);
				local26.anIntArray12[local217] = Static131.method2172(local184);
			} else if (local223 == 1) {
				local453 = this.aClass69Array1[local217];
				local184 = arg0 + (arg2 * local453.anInt2530 + arg3 * local453.anInt2526 + arg4 * local453.anInt2527) / (local22 + local22 / 2);
				local26.anIntArray19[local217] = Static131.method2172(local184);
				local26.anIntArray12[local217] = -1;
			} else {
				local26.anIntArray12[local217] = -2;
			}
		}
		this.method2194();
		local26.anInt142 = this.anInt3043;
		local26.anIntArray17 = this.anIntArray367;
		local26.anIntArray14 = this.anIntArray362;
		local26.anIntArray13 = this.anIntArray364;
		local26.anInt146 = this.anInt3038;
		local26.anIntArray15 = this.anIntArray361;
		local26.anIntArray11 = this.anIntArray366;
		local26.anIntArray22 = this.anIntArray356;
		local26.aByteArray2 = this.aByteArray41;
		local26.aByteArray1 = this.aByteArray40;
		local26.aByte1 = this.aByte7;
		local26.anIntArrayArray2 = this.anIntArrayArray29;
		local26.anIntArrayArray1 = this.anIntArrayArray30;
		local26.aShortArray1 = this.aShortArray34;
		return local26;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "()V")
	public void method2177() {
		if (this.aBoolean248) {
			return;
		}
		super.anInt3029 = 0;
		this.anInt3039 = 0;
		this.anInt3042 = 999999;
		this.anInt3040 = -999999;
		this.anInt3046 = -99999;
		this.anInt3041 = 99999;
		for (@Pc(23) int local23 = 0; local23 < this.anInt3043; local23++) {
			@Pc(29) int local29 = this.anIntArray367[local23];
			@Pc(34) int local34 = this.anIntArray362[local23];
			@Pc(39) int local39 = this.anIntArray364[local23];
			if (local29 < this.anInt3042) {
				this.anInt3042 = local29;
			}
			if (local29 > this.anInt3040) {
				this.anInt3040 = local29;
			}
			if (local39 < this.anInt3041) {
				this.anInt3041 = local39;
			}
			if (local39 > this.anInt3046) {
				this.anInt3046 = local39;
			}
			if (-local34 > super.anInt3029) {
				super.anInt3029 = -local34;
			}
			if (local34 > this.anInt3039) {
				this.anInt3039 = local34;
			}
		}
		this.aBoolean248 = true;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "()V")
	public void method2178() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3043; local1++) {
			this.anIntArray364[local1] = -this.anIntArray364[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt3038; local18++) {
			@Pc(24) int local24 = this.anIntArray361[local18];
			this.anIntArray361[local18] = this.anIntArray356[local18];
			this.anIntArray356[local18] = local24;
		}
		this.method2174();
	}

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "()V")
	public void method2180() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3043; local1++) {
			@Pc(7) int local7 = this.anIntArray364[local1];
			this.anIntArray364[local1] = this.anIntArray367[local1];
			this.anIntArray367[local1] = -local7;
		}
		this.method2174();
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(III)V")
	public void method2181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3043; local1++) {
			this.anIntArray367[local1] = this.anIntArray367[local1] * arg0 / 128;
			this.anIntArray362[local1] = this.anIntArray362[local1] * arg1 / 128;
			this.anIntArray364[local1] = this.anIntArray364[local1] * arg2 / 128;
		}
		this.method2174();
	}

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "()V")
	public void method2182() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3043; local1++) {
			this.anIntArray367[local1] = -this.anIntArray367[local1];
			this.anIntArray364[local1] = -this.anIntArray364[local1];
		}
		this.method2174();
	}

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "(I)V")
	public void method2183() {
		@Pc(3) int local3 = Static131.anIntArray359[256];
		@Pc(7) int local7 = Static131.anIntArray360[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3043; local9++) {
			@Pc(26) int local26 = this.anIntArray364[local9] * local3 + this.anIntArray367[local9] * local7 >> 16;
			this.anIntArray364[local9] = this.anIntArray364[local9] * local7 - this.anIntArray367[local9] * local3 >> 16;
			this.anIntArray367[local9] = local26;
		}
		this.method2174();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(SS)V")
	public void method2184(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3038; local1++) {
			if (this.aShortArray30[local1] == arg0) {
				this.aShortArray30[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "()V")
	public void method2186() {
		if (this.aClass37Array1 != null) {
			return;
		}
		this.aClass37Array1 = new Class37[this.anInt3043];
		for (@Pc(10) int local10 = 0; local10 < this.anInt3043; local10++) {
			this.aClass37Array1[local10] = new Class37();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt3038; local25++) {
			@Pc(31) int local31 = this.anIntArray361[local25];
			@Pc(36) int local36 = this.anIntArray366[local25];
			@Pc(41) int local41 = this.anIntArray356[local25];
			@Pc(51) int local51 = this.anIntArray367[local36] - this.anIntArray367[local31];
			@Pc(61) int local61 = this.anIntArray362[local36] - this.anIntArray362[local31];
			@Pc(71) int local71 = this.anIntArray364[local36] - this.anIntArray364[local31];
			@Pc(81) int local81 = this.anIntArray367[local41] - this.anIntArray367[local31];
			@Pc(91) int local91 = this.anIntArray362[local41] - this.anIntArray362[local31];
			@Pc(101) int local101 = this.anIntArray364[local41] - this.anIntArray364[local31];
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
			if (this.aByteArray39 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray39[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class37 local211 = this.aClass37Array1[local31];
				local211.anInt1321 += local109;
				local211.anInt1320 += local117;
				local211.anInt1318 += local125;
				local211.anInt1325++;
				@Pc(240) Class37 local240 = this.aClass37Array1[local36];
				local240.anInt1321 += local109;
				local240.anInt1320 += local117;
				local240.anInt1318 += local125;
				local240.anInt1325++;
				@Pc(269) Class37 local269 = this.aClass37Array1[local41];
				local269.anInt1321 += local109;
				local269.anInt1320 += local117;
				local269.anInt1318 += local125;
				local269.anInt1325++;
			} else if (local198 == 1) {
				if (this.aClass69Array1 == null) {
					this.aClass69Array1 = new Class69[this.anInt3038];
				}
				@Pc(314) Class69 local314 = this.aClass69Array1[local25] = new Class69();
				local314.anInt2530 = local109;
				local314.anInt2526 = local117;
				local314.anInt2527 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!wc;I)I")
	private int method2187(@OriginalArg(0) Class2_Sub1_Sub1_Sub7 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray367[arg1];
		@Pc(11) int local11 = arg0.anIntArray362[arg1];
		@Pc(16) int local16 = arg0.anIntArray364[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt3043; local18++) {
			if (local6 == this.anIntArray367[local18] && local11 == this.anIntArray362[local18] && local16 == this.anIntArray364[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray367[this.anInt3043] = local6;
			this.anIntArray362[this.anInt3043] = local11;
			this.anIntArray364[this.anInt3043] = local16;
			if (arg0.anIntArray357 != null) {
				this.anIntArray357[this.anInt3043] = arg0.anIntArray357[arg1];
			}
			local1 = this.anInt3043++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "()V")
	public void method2188() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3043; local1++) {
			@Pc(7) int local7 = this.anIntArray367[local1];
			this.anIntArray367[local1] = this.anIntArray364[local1];
			this.anIntArray364[local1] = -local7;
		}
		this.method2174();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([B)V")
	private void method2190(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class2_Sub9 local8 = new Class2_Sub9(arg0);
		@Pc(13) Class2_Sub9 local13 = new Class2_Sub9(arg0);
		@Pc(18) Class2_Sub9 local18 = new Class2_Sub9(arg0);
		@Pc(23) Class2_Sub9 local23 = new Class2_Sub9(arg0);
		@Pc(28) Class2_Sub9 local28 = new Class2_Sub9(arg0);
		local8.anInt976 = arg0.length - 18;
		@Pc(38) int local38 = local8.method632();
		@Pc(42) int local42 = local8.method632();
		@Pc(46) int local46 = local8.method640();
		@Pc(50) int local50 = local8.method640();
		@Pc(54) int local54 = local8.method640();
		@Pc(58) int local58 = local8.method640();
		@Pc(62) int local62 = local8.method640();
		@Pc(66) int local66 = local8.method640();
		@Pc(70) int local70 = local8.method632();
		@Pc(74) int local74 = local8.method632();
		@Pc(78) int local78 = local8.method632();
		@Pc(82) int local82 = local8.method632();
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
		this.anInt3043 = local38;
		this.anInt3038 = local42;
		this.anInt3044 = local46;
		this.anIntArray367 = new int[local38];
		this.anIntArray362 = new int[local38];
		this.anIntArray364 = new int[local38];
		this.anIntArray361 = new int[local42];
		this.anIntArray366 = new int[local42];
		this.anIntArray356 = new int[local42];
		if (local46 > 0) {
			this.aByteArray44 = new byte[local46];
			this.aShortArray26 = new short[local46];
			this.aShortArray25 = new short[local46];
			this.aShortArray31 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray357 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray39 = new byte[local42];
			this.aByteArray43 = new byte[local42];
			this.aShortArray34 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray41 = new byte[local42];
		} else {
			this.aByte7 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray40 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray363 = new int[local42];
		}
		this.aShortArray30 = new short[local42];
		local8.anInt976 = 0;
		local13.anInt976 = local165;
		local18.anInt976 = local171;
		local23.anInt976 = local90;
		local28.anInt976 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method640();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method641();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method641();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method641();
			}
			this.anIntArray367[local307] = local301 + local314;
			this.anIntArray362[local307] = local303 + local324;
			this.anIntArray364[local307] = local305 + local334;
			local301 = this.anIntArray367[local307];
			local303 = this.anIntArray362[local307];
			local305 = this.anIntArray364[local307];
			if (local66 == 1) {
				this.anIntArray357[local307] = local28.method640();
			}
		}
		local8.anInt976 = local149;
		local13.anInt976 = local116;
		local18.anInt976 = local98;
		local23.anInt976 = local134;
		local28.anInt976 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray30[local312] = (short) local8.method632();
			if (local50 == 1) {
				local314 = local13.method640();
				if ((local314 & 0x1) == 1) {
					this.aByteArray39[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray39[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray43[local312] = (byte) (local314 >> 2);
					this.aShortArray34[local312] = this.aShortArray30[local312];
					this.aShortArray30[local312] = 127;
					if (this.aShortArray34[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray43[local312] = -1;
					this.aShortArray34[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray41[local312] = local18.method658();
			}
			if (local58 == 1) {
				this.aByteArray40[local312] = local23.method658();
			}
			if (local62 == 1) {
				this.anIntArray363[local312] = local28.method640();
			}
		}
		local8.anInt976 = local143;
		local13.anInt976 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method640();
			if (local543 == 1) {
				local314 = local8.method641() + local536;
				local324 = local8.method641() + local314;
				local334 = local8.method641() + local324;
				local536 = local334;
				this.anIntArray361[local538] = local314;
				this.anIntArray366[local538] = local324;
				this.anIntArray356[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method641() + local536;
				local536 = local334;
				this.anIntArray361[local538] = local314;
				this.anIntArray366[local538] = local324;
				this.anIntArray356[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method641() + local536;
				local536 = local334;
				this.anIntArray361[local538] = local314;
				this.anIntArray366[local538] = local324;
				this.anIntArray356[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method641() + local536;
				local536 = local334;
				this.anIntArray361[local538] = local314;
				this.anIntArray366[local538] = local646;
				this.anIntArray356[local538] = local334;
			}
		}
		local8.anInt976 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray44[local543] = 0;
			this.aShortArray26[local543] = (short) local8.method632();
			this.aShortArray25[local543] = (short) local8.method632();
			this.aShortArray31[local543] = (short) local8.method632();
		}
		if (this.aByteArray43 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray43[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray26[local731] & 0xFFFF) == this.anIntArray361[local723] && (this.aShortArray25[local731] & 0xFFFF) == this.anIntArray366[local723] && (this.aShortArray31[local731] & 0xFFFF) == this.anIntArray356[local723]) {
						this.aByteArray43[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray43 = null;
			}
		}
		if (!local3) {
			this.aShortArray34 = null;
		}
		if (!local1) {
			this.aByteArray39 = null;
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(SS)V")
	public void method2191(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray34 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt3038; local5++) {
			if (this.aShortArray34[local5] == arg0) {
				this.aShortArray34[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "()Lclient!wc;")
	public Class2_Sub1_Sub1_Sub7 method2192() {
		@Pc(3) Class2_Sub1_Sub1_Sub7 local3 = new Class2_Sub1_Sub1_Sub7();
		if (this.aByteArray39 != null) {
			local3.aByteArray39 = new byte[this.anInt3038];
			for (@Pc(13) int local13 = 0; local13 < this.anInt3038; local13++) {
				local3.aByteArray39[local13] = this.aByteArray39[local13];
			}
		}
		local3.anInt3043 = this.anInt3043;
		local3.anInt3038 = this.anInt3038;
		local3.anInt3044 = this.anInt3044;
		local3.anIntArray367 = this.anIntArray367;
		local3.anIntArray362 = this.anIntArray362;
		local3.anIntArray364 = this.anIntArray364;
		local3.anIntArray361 = this.anIntArray361;
		local3.anIntArray366 = this.anIntArray366;
		local3.anIntArray356 = this.anIntArray356;
		local3.aByteArray41 = this.aByteArray41;
		local3.aByteArray40 = this.aByteArray40;
		local3.aByteArray43 = this.aByteArray43;
		local3.aShortArray30 = this.aShortArray30;
		local3.aShortArray34 = this.aShortArray34;
		local3.aByte7 = this.aByte7;
		local3.aByteArray44 = this.aByteArray44;
		local3.aShortArray26 = this.aShortArray26;
		local3.aShortArray25 = this.aShortArray25;
		local3.aShortArray31 = this.aShortArray31;
		local3.aShortArray33 = this.aShortArray33;
		local3.aShortArray35 = this.aShortArray35;
		local3.aShortArray27 = this.aShortArray27;
		local3.aShortArray28 = this.aShortArray28;
		local3.aByteArray42 = this.aByteArray42;
		local3.aShortArray29 = this.aShortArray29;
		local3.aShortArray32 = this.aShortArray32;
		local3.anIntArray357 = this.anIntArray357;
		local3.anIntArray363 = this.anIntArray363;
		local3.anIntArrayArray29 = this.anIntArrayArray29;
		local3.anIntArrayArray30 = this.anIntArrayArray30;
		local3.aClass37Array1 = this.aClass37Array1;
		local3.aClass69Array1 = this.aClass69Array1;
		local3.aShort2 = this.aShort2;
		local3.aShort1 = this.aShort1;
		return local3;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "([B)V")
	private void method2193(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class2_Sub9 local4 = new Class2_Sub9(arg0);
		@Pc(9) Class2_Sub9 local9 = new Class2_Sub9(arg0);
		@Pc(14) Class2_Sub9 local14 = new Class2_Sub9(arg0);
		@Pc(19) Class2_Sub9 local19 = new Class2_Sub9(arg0);
		@Pc(24) Class2_Sub9 local24 = new Class2_Sub9(arg0);
		@Pc(29) Class2_Sub9 local29 = new Class2_Sub9(arg0);
		@Pc(34) Class2_Sub9 local34 = new Class2_Sub9(arg0);
		local4.anInt976 = arg0.length - 23;
		@Pc(44) int local44 = local4.method632();
		@Pc(48) int local48 = local4.method632();
		@Pc(52) int local52 = local4.method640();
		@Pc(56) int local56 = local4.method640();
		@Pc(60) int local60 = local4.method640();
		@Pc(64) int local64 = local4.method640();
		@Pc(68) int local68 = local4.method640();
		@Pc(72) int local72 = local4.method640();
		@Pc(76) int local76 = local4.method640();
		@Pc(80) int local80 = local4.method632();
		@Pc(84) int local84 = local4.method632();
		@Pc(88) int local88 = local4.method632();
		@Pc(92) int local92 = local4.method632();
		@Pc(96) int local96 = local4.method632();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray44 = new byte[local52];
			local4.anInt976 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray44[local113] = local4.method658();
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
		this.anInt3043 = local44;
		this.anInt3038 = local48;
		this.anInt3044 = local52;
		this.anIntArray367 = new int[local44];
		this.anIntArray362 = new int[local44];
		this.anIntArray364 = new int[local44];
		this.anIntArray361 = new int[local48];
		this.anIntArray366 = new int[local48];
		this.anIntArray356 = new int[local48];
		if (local76 == 1) {
			this.anIntArray357 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray39 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray41 = new byte[local48];
		} else {
			this.aByte7 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray40 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray363 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray34 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray43 = new byte[local48];
		}
		this.aShortArray30 = new short[local48];
		if (local52 > 0) {
			this.aShortArray26 = new short[local52];
			this.aShortArray25 = new short[local52];
			this.aShortArray31 = new short[local52];
			if (local100 > 0) {
				this.aShortArray33 = new short[local100];
				this.aShortArray35 = new short[local100];
				this.aShortArray27 = new short[local100];
				this.aShortArray28 = new short[local100];
				this.aByteArray42 = new byte[local100];
				this.aShortArray29 = new short[local100];
			}
			if (local102 > 0) {
				this.aShortArray32 = new short[local102];
			}
		}
		local4.anInt976 = local52;
		local9.anInt976 = local233;
		local14.anInt976 = local239;
		local19.anInt976 = local245;
		local24.anInt976 = local184;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(461) int local461 = 0;
		@Pc(468) int local468;
		@Pc(470) int local470;
		@Pc(480) int local480;
		@Pc(490) int local490;
		for (@Pc(463) int local463 = 0; local463 < local44; local463++) {
			local468 = local4.method640();
			local470 = 0;
			if ((local468 & 0x1) != 0) {
				local470 = local9.method641();
			}
			local480 = 0;
			if ((local468 & 0x2) != 0) {
				local480 = local14.method641();
			}
			local490 = 0;
			if ((local468 & 0x4) != 0) {
				local490 = local19.method641();
			}
			this.anIntArray367[local463] = local457 + local470;
			this.anIntArray362[local463] = local459 + local480;
			this.anIntArray364[local463] = local461 + local490;
			local457 = this.anIntArray367[local463];
			local459 = this.anIntArray362[local463];
			local461 = this.anIntArray364[local463];
			if (local76 == 1) {
				this.anIntArray357[local463] = local24.method640();
			}
		}
		local4.anInt976 = local225;
		local9.anInt976 = local151;
		local14.anInt976 = local166;
		local19.anInt976 = local193;
		local24.anInt976 = local175;
		local29.anInt976 = local208;
		local34.anInt976 = local219;
		for (local468 = 0; local468 < local48; local468++) {
			this.aShortArray30[local468] = (short) local4.method632();
			if (local56 == 1) {
				this.aByteArray39[local468] = local9.method658();
			}
			if (local60 == 255) {
				this.aByteArray41[local468] = local14.method658();
			}
			if (local64 == 1) {
				this.aByteArray40[local468] = local19.method658();
			}
			if (local68 == 1) {
				this.anIntArray363[local468] = local24.method640();
			}
			if (local72 == 1) {
				this.aShortArray34[local468] = (short) (local29.method632() - 1);
			}
			if (this.aByteArray43 != null && this.aShortArray34[local468] != -1) {
				this.aByteArray43[local468] = (byte) (local34.method640() - 1);
			}
		}
		local4.anInt976 = local202;
		local9.anInt976 = local160;
		local470 = 0;
		local480 = 0;
		local490 = 0;
		@Pc(670) int local670 = 0;
		@Pc(677) int local677;
		@Pc(780) int local780;
		for (@Pc(672) int local672 = 0; local672 < local48; local672++) {
			local677 = local9.method640();
			if (local677 == 1) {
				local470 = local4.method641() + local670;
				local480 = local4.method641() + local470;
				local490 = local4.method641() + local480;
				local670 = local490;
				this.anIntArray361[local672] = local470;
				this.anIntArray366[local672] = local480;
				this.anIntArray356[local672] = local490;
			}
			if (local677 == 2) {
				local480 = local490;
				local490 = local4.method641() + local670;
				local670 = local490;
				this.anIntArray361[local672] = local470;
				this.anIntArray366[local672] = local480;
				this.anIntArray356[local672] = local490;
			}
			if (local677 == 3) {
				local470 = local490;
				local490 = local4.method641() + local670;
				local670 = local490;
				this.anIntArray361[local672] = local470;
				this.anIntArray366[local672] = local480;
				this.anIntArray356[local672] = local490;
			}
			if (local677 == 4) {
				local780 = local470;
				local470 = local480;
				local480 = local780;
				local490 = local4.method641() + local670;
				local670 = local490;
				this.anIntArray361[local672] = local470;
				this.anIntArray366[local672] = local780;
				this.anIntArray356[local672] = local490;
			}
		}
		local4.anInt976 = local251;
		local9.anInt976 = local259;
		local14.anInt976 = local267;
		local19.anInt976 = local275;
		local24.anInt976 = local283;
		local29.anInt976 = local289;
		for (local677 = 0; local677 < local52; local677++) {
			local780 = this.aByteArray44[local677] & 0xFF;
			if (local780 == 0) {
				this.aShortArray26[local677] = (short) local4.method632();
				this.aShortArray25[local677] = (short) local4.method632();
				this.aShortArray31[local677] = (short) local4.method632();
			}
			if (local780 == 1) {
				this.aShortArray26[local677] = (short) local9.method632();
				this.aShortArray25[local677] = (short) local9.method632();
				this.aShortArray31[local677] = (short) local9.method632();
				this.aShortArray33[local677] = (short) local14.method632();
				this.aShortArray35[local677] = (short) local14.method632();
				this.aShortArray27[local677] = (short) local14.method632();
				this.aShortArray28[local677] = (short) local19.method632();
				this.aByteArray42[local677] = local24.method658();
				this.aShortArray29[local677] = (short) local29.method632();
			}
			if (local780 == 2) {
				this.aShortArray26[local677] = (short) local9.method632();
				this.aShortArray25[local677] = (short) local9.method632();
				this.aShortArray31[local677] = (short) local9.method632();
				this.aShortArray33[local677] = (short) local14.method632();
				this.aShortArray35[local677] = (short) local14.method632();
				this.aShortArray27[local677] = (short) local14.method632();
				this.aShortArray28[local677] = (short) local19.method632();
				this.aByteArray42[local677] = local24.method658();
				this.aShortArray29[local677] = (short) local29.method632();
				this.aShortArray32[local677] = (short) local29.method632();
			}
			if (local780 == 3) {
				this.aShortArray26[local677] = (short) local9.method632();
				this.aShortArray25[local677] = (short) local9.method632();
				this.aShortArray31[local677] = (short) local9.method632();
				this.aShortArray33[local677] = (short) local14.method632();
				this.aShortArray35[local677] = (short) local14.method632();
				this.aShortArray27[local677] = (short) local14.method632();
				this.aShortArray28[local677] = (short) local19.method632();
				this.aByteArray42[local677] = local24.method658();
				this.aShortArray29[local677] = (short) local29.method632();
			}
		}
		local4.anInt976 = local113;
		local780 = local4.method640();
		if (local780 == 0) {
			return;
		}
		new Class45();
		local4.method632();
		local4.method632();
		local4.method632();
		local4.method622();
	}

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "()V")
	private void method2194() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray357 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt3043; local9++) {
				local15 = this.anIntArray357[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray29 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray29[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt3043) {
				local65 = this.anIntArray357[local59];
				this.anIntArrayArray29[local65][local5[local65]++] = local59++;
			}
			this.anIntArray357 = null;
		}
		if (this.anIntArray363 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt3038; local9++) {
			local15 = this.anIntArray363[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray30 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray30[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt3038) {
			local65 = this.anIntArray363[local59];
			this.anIntArrayArray30[local65][local5[local65]++] = local59++;
		}
		this.anIntArray363 = null;
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(III)V")
	public void method2195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3043; local1++) {
			this.anIntArray367[local1] += arg0;
			this.anIntArray362[local1] += arg1;
			this.anIntArray364[local1] += arg2;
		}
		this.method2174();
	}
}
