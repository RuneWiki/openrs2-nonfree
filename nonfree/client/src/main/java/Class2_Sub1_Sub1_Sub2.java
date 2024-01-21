import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class2_Sub1_Sub1_Sub2 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!ed", name = "bb", descriptor = "I")
	private int anInt654;

	@OriginalMember(owner = "client!ed", name = "cb", descriptor = "[I")
	private int[] anIntArray60;

	@OriginalMember(owner = "client!ed", name = "db", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!ed", name = "fb", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!ed", name = "gb", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!ed", name = "hb", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!ed", name = "ib", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!ed", name = "jb", descriptor = "I")
	public int anInt655;

	@OriginalMember(owner = "client!ed", name = "kb", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!ed", name = "lb", descriptor = "[I")
	public int[] anIntArray62;

	@OriginalMember(owner = "client!ed", name = "mb", descriptor = "[I")
	public int[] anIntArray63;

	@OriginalMember(owner = "client!ed", name = "nb", descriptor = "[B")
	private byte[] aByteArray11;

	@OriginalMember(owner = "client!ed", name = "ob", descriptor = "S")
	public short aShort1;

	@OriginalMember(owner = "client!ed", name = "pb", descriptor = "[I")
	public int[] anIntArray64;

	@OriginalMember(owner = "client!ed", name = "sb", descriptor = "[B")
	private byte[] aByteArray12;

	@OriginalMember(owner = "client!ed", name = "tb", descriptor = "I")
	public int anInt657;

	@OriginalMember(owner = "client!ed", name = "vb", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!ed", name = "wb", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!ed", name = "xb", descriptor = "I")
	public int anInt659;

	@OriginalMember(owner = "client!ed", name = "yb", descriptor = "[I")
	public int[] anIntArray65;

	@OriginalMember(owner = "client!ed", name = "zb", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!ed", name = "Ab", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!ed", name = "Bb", descriptor = "[Lclient!ke;")
	private Class45[] aClass45Array1;

	@OriginalMember(owner = "client!ed", name = "Cb", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!ed", name = "Eb", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!ed", name = "Fb", descriptor = "[I")
	public int[] anIntArray67;

	@OriginalMember(owner = "client!ed", name = "Gb", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!ed", name = "Hb", descriptor = "[Lclient!mf;")
	public Class54[] aClass54Array1;

	@OriginalMember(owner = "client!ed", name = "Ib", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!ed", name = "Jb", descriptor = "[B")
	private byte[] aByteArray13;

	@OriginalMember(owner = "client!ed", name = "Lb", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!ed", name = "Mb", descriptor = "[I")
	public int[] anIntArray69;

	@OriginalMember(owner = "client!ed", name = "Ob", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!ed", name = "Pb", descriptor = "[Lclient!mf;")
	public Class54[] aClass54Array2;

	@OriginalMember(owner = "client!ed", name = "Qb", descriptor = "[I")
	private int[] anIntArray71;

	@OriginalMember(owner = "client!ed", name = "Rb", descriptor = "I")
	public int anInt660;

	@OriginalMember(owner = "client!ed", name = "Tb", descriptor = "I")
	public int anInt661;

	@OriginalMember(owner = "client!ed", name = "Ub", descriptor = "[B")
	public byte[] aByteArray15;

	@OriginalMember(owner = "client!ed", name = "qb", descriptor = "I")
	public int anInt656 = 0;

	@OriginalMember(owner = "client!ed", name = "rb", descriptor = "Z")
	private boolean aBoolean26 = false;

	@OriginalMember(owner = "client!ed", name = "Sb", descriptor = "B")
	private byte aByte3 = 0;

	@OriginalMember(owner = "client!ed", name = "Vb", descriptor = "I")
	public int anInt662 = 0;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
	private Class2_Sub1_Sub1_Sub2() {
	}

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "([B)V")
	public Class2_Sub1_Sub1_Sub2(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method554(arg0);
		} else {
			this.method561(arg0);
		}
	}

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "([Lclient!ed;I)V")
	public Class2_Sub1_Sub1_Sub2(@OriginalArg(0) Class2_Sub1_Sub1_Sub2[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt656 = 0;
		this.anInt662 = 0;
		this.anInt654 = 0;
		this.aByte3 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class2_Sub1_Sub1_Sub2 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt656 += local44.anInt656;
				this.anInt662 += local44.anInt662;
				this.anInt654 += local44.anInt654;
				if (local44.aByteArray12 == null) {
					if (this.aByte3 == -1) {
						this.aByte3 = local44.aByte3;
					}
					if (this.aByte3 != local44.aByte3) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray15 != null;
				local19 |= local44.aByteArray13 != null;
				local21 |= local44.anIntArray60 != null;
				local23 |= local44.aShortArray10 != null;
				local25 |= local44.aByteArray11 != null;
			}
		}
		this.anIntArray62 = new int[this.anInt656];
		this.anIntArray65 = new int[this.anInt656];
		this.anIntArray63 = new int[this.anInt656];
		this.anIntArray71 = new int[this.anInt656];
		this.anIntArray67 = new int[this.anInt662];
		this.anIntArray64 = new int[this.anInt662];
		this.anIntArray69 = new int[this.anInt662];
		if (local15) {
			this.aByteArray15 = new byte[this.anInt662];
		}
		if (local17) {
			this.aByteArray12 = new byte[this.anInt662];
		}
		if (local19) {
			this.aByteArray13 = new byte[this.anInt662];
		}
		if (local21) {
			this.anIntArray60 = new int[this.anInt662];
		}
		if (local23) {
			this.aShortArray10 = new short[this.anInt662];
		}
		if (local25) {
			this.aByteArray11 = new byte[this.anInt662];
		}
		this.aShortArray11 = new short[this.anInt662];
		if (this.anInt654 > 0) {
			this.aByteArray14 = new byte[this.anInt654];
			this.aShortArray9 = new short[this.anInt654];
			this.aShortArray12 = new short[this.anInt654];
			this.aShortArray4 = new short[this.anInt654];
			this.aShortArray8 = new short[this.anInt654];
			this.aShortArray3 = new short[this.anInt654];
			this.aShortArray2 = new short[this.anInt654];
			this.aShortArray5 = new short[this.anInt654];
			this.aByteArray10 = new byte[this.anInt654];
			this.aShortArray7 = new short[this.anInt654];
			this.aShortArray6 = new short[this.anInt654];
		}
		this.anInt656 = 0;
		this.anInt662 = 0;
		this.anInt654 = 0;
		for (@Pc(288) int local288 = 0; local288 < arg1; local288++) {
			@Pc(293) Class2_Sub1_Sub1_Sub2 local293 = arg0[local288];
			if (local293 != null) {
				for (@Pc(297) int local297 = 0; local297 < local293.anInt662; local297++) {
					if (local15 && local293.aByteArray15 != null) {
						this.aByteArray15[this.anInt662] = local293.aByteArray15[local297];
					}
					if (local17) {
						if (local293.aByteArray12 == null) {
							this.aByteArray12[this.anInt662] = local293.aByte3;
						} else {
							this.aByteArray12[this.anInt662] = local293.aByteArray12[local297];
						}
					}
					if (local19 && local293.aByteArray13 != null) {
						this.aByteArray13[this.anInt662] = local293.aByteArray13[local297];
					}
					if (local21 && local293.anIntArray60 != null) {
						this.anIntArray60[this.anInt662] = local293.anIntArray60[local297];
					}
					if (local23) {
						if (local293.aShortArray10 == null) {
							this.aShortArray10[this.anInt662] = -1;
						} else {
							this.aShortArray10[this.anInt662] = local293.aShortArray10[local297];
						}
					}
					if (local25) {
						if (local293.aByteArray11 == null || local293.aByteArray11[local297] == -1) {
							this.aByteArray11[this.anInt662] = -1;
						} else {
							this.aByteArray11[this.anInt662] = (byte) (local293.aByteArray11[local297] + this.anInt654);
						}
					}
					this.aShortArray11[this.anInt662] = local293.aShortArray11[local297];
					this.anIntArray67[this.anInt662] = this.method550(local293, local293.anIntArray67[local297]);
					this.anIntArray64[this.anInt662] = this.method550(local293, local293.anIntArray64[local297]);
					this.anIntArray69[this.anInt662] = this.method550(local293, local293.anIntArray69[local297]);
					this.anInt662++;
				}
				for (@Pc(472) int local472 = 0; local472 < local293.anInt654; local472++) {
					@Pc(484) byte local484 = this.aByteArray14[this.anInt654] = local293.aByteArray14[local472];
					if (local484 == 0) {
						this.aShortArray9[this.anInt654] = (short) this.method550(local293, local293.aShortArray9[local472]);
						this.aShortArray12[this.anInt654] = (short) this.method550(local293, local293.aShortArray12[local472]);
						this.aShortArray4[this.anInt654] = (short) this.method550(local293, local293.aShortArray4[local472]);
					}
					if (local484 >= 1 && local484 <= 3) {
						this.aShortArray9[this.anInt654] = local293.aShortArray9[local472];
						this.aShortArray12[this.anInt654] = local293.aShortArray12[local472];
						this.aShortArray4[this.anInt654] = local293.aShortArray4[local472];
						this.aShortArray8[this.anInt654] = local293.aShortArray8[local472];
						this.aShortArray3[this.anInt654] = local293.aShortArray3[local472];
						this.aShortArray2[this.anInt654] = local293.aShortArray2[local472];
						this.aShortArray5[this.anInt654] = local293.aShortArray5[local472];
						this.aByteArray10[this.anInt654] = local293.aByteArray10[local472];
						this.aShortArray7[this.anInt654] = local293.aShortArray7[local472];
					}
					if (local484 == 2) {
						this.aShortArray6[this.anInt654] = local293.aShortArray6[local472];
					}
					this.anInt654++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!ed;ZZZZ)V")
	public Class2_Sub1_Sub1_Sub2(@OriginalArg(0) Class2_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt656 = arg0.anInt656;
		this.anInt662 = arg0.anInt662;
		this.anInt654 = arg0.anInt654;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray62 = arg0.anIntArray62;
			this.anIntArray65 = arg0.anIntArray65;
			this.anIntArray63 = arg0.anIntArray63;
		} else {
			this.anIntArray62 = new int[this.anInt656];
			this.anIntArray65 = new int[this.anInt656];
			this.anIntArray63 = new int[this.anInt656];
			for (local57 = 0; local57 < this.anInt656; local57++) {
				this.anIntArray62[local57] = arg0.anIntArray62[local57];
				this.anIntArray65[local57] = arg0.anIntArray65[local57];
				this.anIntArray63[local57] = arg0.anIntArray63[local57];
			}
		}
		if (arg2) {
			this.aShortArray11 = arg0.aShortArray11;
		} else {
			this.aShortArray11 = new short[this.anInt662];
			for (local57 = 0; local57 < this.anInt662; local57++) {
				this.aShortArray11[local57] = arg0.aShortArray11[local57];
			}
		}
		if (arg3 || arg0.aShortArray10 == null) {
			this.aShortArray10 = arg0.aShortArray10;
		} else {
			this.aShortArray10 = new short[this.anInt662];
			for (local57 = 0; local57 < this.anInt662; local57++) {
				this.aShortArray10[local57] = arg0.aShortArray10[local57];
			}
		}
		this.aByteArray13 = arg0.aByteArray13;
		this.anIntArray67 = arg0.anIntArray67;
		this.anIntArray64 = arg0.anIntArray64;
		this.anIntArray69 = arg0.anIntArray69;
		this.aByteArray15 = arg0.aByteArray15;
		this.aByteArray12 = arg0.aByteArray12;
		this.aByteArray11 = arg0.aByteArray11;
		this.aByte3 = arg0.aByte3;
		this.aByteArray14 = arg0.aByteArray14;
		this.aShortArray9 = arg0.aShortArray9;
		this.aShortArray12 = arg0.aShortArray12;
		this.aShortArray4 = arg0.aShortArray4;
		this.aShortArray8 = arg0.aShortArray8;
		this.aShortArray3 = arg0.aShortArray3;
		this.aShortArray2 = arg0.aShortArray2;
		this.aShortArray5 = arg0.aShortArray5;
		this.aByteArray10 = arg0.aByteArray10;
		this.aShortArray7 = arg0.aShortArray7;
		this.aShortArray6 = arg0.aShortArray6;
		this.anIntArray71 = arg0.anIntArray71;
		this.anIntArray60 = arg0.anIntArray60;
		this.anIntArrayArray7 = arg0.anIntArrayArray7;
		this.anIntArrayArray6 = arg0.anIntArrayArray6;
		this.aClass54Array2 = arg0.aClass54Array2;
		this.aClass45Array1 = arg0.aClass45Array1;
		this.aClass54Array1 = arg0.aClass54Array1;
		this.aShort2 = arg0.aShort2;
		this.aShort1 = arg0.aShort1;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(III)V")
	public void method538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt656; local1++) {
			this.anIntArray62[local1] += arg0;
			this.anIntArray65[local1] += arg1;
			this.anIntArray63[local1] += arg2;
		}
		this.method552();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "()V")
	public void method539() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt656; local1++) {
			this.anIntArray63[local1] = -this.anIntArray63[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt662; local18++) {
			@Pc(24) int local24 = this.anIntArray67[local18];
			this.anIntArray67[local18] = this.anIntArray69[local18];
			this.anIntArray69[local18] = local24;
		}
		this.method552();
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "()Lclient!ed;")
	public Class2_Sub1_Sub1_Sub2 method540() {
		@Pc(3) Class2_Sub1_Sub1_Sub2 local3 = new Class2_Sub1_Sub1_Sub2();
		if (this.aByteArray15 != null) {
			local3.aByteArray15 = new byte[this.anInt662];
			for (@Pc(13) int local13 = 0; local13 < this.anInt662; local13++) {
				local3.aByteArray15[local13] = this.aByteArray15[local13];
			}
		}
		local3.anInt656 = this.anInt656;
		local3.anInt662 = this.anInt662;
		local3.anInt654 = this.anInt654;
		local3.anIntArray62 = this.anIntArray62;
		local3.anIntArray65 = this.anIntArray65;
		local3.anIntArray63 = this.anIntArray63;
		local3.anIntArray67 = this.anIntArray67;
		local3.anIntArray64 = this.anIntArray64;
		local3.anIntArray69 = this.anIntArray69;
		local3.aByteArray12 = this.aByteArray12;
		local3.aByteArray13 = this.aByteArray13;
		local3.aByteArray11 = this.aByteArray11;
		local3.aShortArray11 = this.aShortArray11;
		local3.aShortArray10 = this.aShortArray10;
		local3.aByte3 = this.aByte3;
		local3.aByteArray14 = this.aByteArray14;
		local3.aShortArray9 = this.aShortArray9;
		local3.aShortArray12 = this.aShortArray12;
		local3.aShortArray4 = this.aShortArray4;
		local3.aShortArray8 = this.aShortArray8;
		local3.aShortArray3 = this.aShortArray3;
		local3.aShortArray2 = this.aShortArray2;
		local3.aShortArray5 = this.aShortArray5;
		local3.aByteArray10 = this.aByteArray10;
		local3.aShortArray7 = this.aShortArray7;
		local3.aShortArray6 = this.aShortArray6;
		local3.anIntArray71 = this.anIntArray71;
		local3.anIntArray60 = this.anIntArray60;
		local3.anIntArrayArray7 = this.anIntArrayArray7;
		local3.anIntArrayArray6 = this.anIntArrayArray6;
		local3.aClass54Array2 = this.aClass54Array2;
		local3.aClass45Array1 = this.aClass45Array1;
		local3.aShort2 = this.aShort2;
		local3.aShort1 = this.aShort1;
		return local3;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([[IIIIZI)Lclient!ed;")
	public Class2_Sub1_Sub1_Sub2 method541(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method543();
		@Pc(6) int local6 = arg1 + this.anInt659;
		@Pc(11) int local11 = arg1 + this.anInt655;
		@Pc(16) int local16 = arg3 + this.anInt657;
		@Pc(21) int local21 = arg3 + this.anInt660;
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
		@Pc(101) Class2_Sub1_Sub1_Sub2 local101 = new Class2_Sub1_Sub1_Sub2();
		local101.anInt656 = this.anInt656;
		local101.anInt662 = this.anInt662;
		local101.anInt654 = this.anInt654;
		local101.anIntArray62 = this.anIntArray62;
		local101.anIntArray63 = this.anIntArray63;
		local101.anIntArray67 = this.anIntArray67;
		local101.anIntArray64 = this.anIntArray64;
		local101.anIntArray69 = this.anIntArray69;
		local101.aByteArray15 = this.aByteArray15;
		local101.aByteArray12 = this.aByteArray12;
		local101.aByteArray13 = this.aByteArray13;
		local101.aByteArray11 = this.aByteArray11;
		local101.aShortArray11 = this.aShortArray11;
		local101.aShortArray10 = this.aShortArray10;
		local101.aByte3 = this.aByte3;
		local101.aByteArray14 = this.aByteArray14;
		local101.aShortArray9 = this.aShortArray9;
		local101.aShortArray12 = this.aShortArray12;
		local101.aShortArray4 = this.aShortArray4;
		local101.aShortArray8 = this.aShortArray8;
		local101.aShortArray3 = this.aShortArray3;
		local101.aShortArray2 = this.aShortArray2;
		local101.aShortArray5 = this.aShortArray5;
		local101.aByteArray10 = this.aByteArray10;
		local101.aShortArray7 = this.aShortArray7;
		local101.aShortArray6 = this.aShortArray6;
		local101.anIntArray71 = this.anIntArray71;
		local101.anIntArray60 = this.anIntArray60;
		local101.anIntArrayArray7 = this.anIntArrayArray7;
		local101.anIntArrayArray6 = this.anIntArrayArray6;
		local101.aShort2 = this.aShort2;
		local101.aShort1 = this.aShort1;
		local101.anIntArray65 = new int[local101.anInt656];
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
			for (local241 = 0; local241 < local101.anInt656; local241++) {
				local249 = this.anIntArray62[local241] + arg1;
				local256 = this.anIntArray63[local241] + arg3;
				local260 = local249 & 0x7F;
				local264 = local256 & 0x7F;
				local268 = local249 >> 7;
				local272 = local256 >> 7;
				local294 = arg0[local268][local272] * (128 - local260) + arg0[local268 + 1][local272] * local260 >> 7;
				local320 = arg0[local268][local272 + 1] * (128 - local260) + arg0[local268 + 1][local272 + 1] * local260 >> 7;
				local332 = local294 * (128 - local264) + local320 * local264 >> 7;
				local101.anIntArray65[local241] = this.anIntArray65[local241] + local332 - arg2;
			}
		} else {
			for (local241 = 0; local241 < local101.anInt656; local241++) {
				local249 = (-this.anIntArray65[local241] << 16) / super.anInt2855;
				if (local249 < arg4) {
					local256 = this.anIntArray62[local241] + arg1;
					local260 = this.anIntArray63[local241] + arg3;
					local264 = local256 & 0x7F;
					local268 = local260 & 0x7F;
					local272 = local256 >> 7;
					local294 = local260 >> 7;
					local320 = arg0[local272][local294] * (128 - local264) + arg0[local272 + 1][local294] * local264 >> 7;
					local332 = arg0[local272][local294 + 1] * (128 - local264) + arg0[local272 + 1][local294 + 1] * local264 >> 7;
					@Pc(457) int local457 = local320 * (128 - local268) + local332 * local268 >> 7;
					local101.anIntArray65[local241] = this.anIntArray65[local241] + (local457 - arg2) * (arg4 - local249) / arg4;
				}
			}
		}
		local101.method552();
		return local101;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIII)Lclient!wb;")
	public Class2_Sub1_Sub1_Sub7 method542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method551();
		@Pc(16) int local16 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(22) int local22 = arg1 * local16 >> 8;
		@Pc(26) Class2_Sub1_Sub1_Sub7 local26 = new Class2_Sub1_Sub1_Sub7();
		local26.anIntArray384 = new int[this.anInt662];
		local26.anIntArray380 = new int[this.anInt662];
		local26.anIntArray382 = new int[this.anInt662];
		@Pc(184) int local184;
		if (this.anInt654 > 0 && this.aByteArray11 != null) {
			@Pc(51) int[] local51 = new int[this.anInt654];
			for (@Pc(53) int local53 = 0; local53 < this.anInt662; local53++) {
				if (this.aByteArray11[local53] != -1) {
					local51[this.aByteArray11[local53] & 0xFF]++;
				}
			}
			local26.anInt2867 = 0;
			for (@Pc(82) int local82 = 0; local82 < this.anInt654; local82++) {
				if (local51[local82] > 0 && this.aByteArray14[local82] == 0) {
					local26.anInt2867++;
				}
			}
			local26.anIntArray387 = new int[local26.anInt2867];
			local26.anIntArray378 = new int[local26.anInt2867];
			local26.anIntArray377 = new int[local26.anInt2867];
			@Pc(120) int local120 = 0;
			for (@Pc(122) int local122 = 0; local122 < this.anInt654; local122++) {
				if (local51[local122] > 0 && this.aByteArray14[local122] == 0) {
					local26.anIntArray387[local120] = this.aShortArray9[local122] & 0xFFFF;
					local26.anIntArray378[local120] = this.aShortArray12[local122] & 0xFFFF;
					local26.anIntArray377[local120] = this.aShortArray4[local122] & 0xFFFF;
					local51[local122] = local120++;
				} else {
					local51[local122] = -1;
				}
			}
			local26.aByteArray40 = new byte[this.anInt662];
			for (local184 = 0; local184 < this.anInt662; local184++) {
				if (this.aByteArray11[local184] == -1) {
					local26.aByteArray40[local184] = -1;
				} else {
					local26.aByteArray40[local184] = (byte) local51[this.aByteArray11[local184] & 0xFF];
				}
			}
		}
		for (@Pc(217) int local217 = 0; local217 < this.anInt662; local217++) {
			@Pc(223) byte local223;
			if (this.aByteArray15 == null) {
				local223 = 0;
			} else {
				local223 = this.aByteArray15[local217];
			}
			@Pc(234) byte local234;
			if (this.aByteArray13 == null) {
				local234 = 0;
			} else {
				local234 = this.aByteArray13[local217];
			}
			@Pc(245) short local245;
			if (this.aShortArray10 == null) {
				local245 = -1;
			} else {
				local245 = this.aShortArray10[local217];
			}
			if (local234 == -2) {
				local223 = 3;
			}
			if (local234 == -1) {
				local223 = 2;
			}
			@Pc(292) Class54 local292;
			@Pc(453) Class45 local453;
			if (local245 == -1) {
				if (local223 == 0) {
					@Pc(273) int local273 = this.aShortArray11[local217] & 0xFFFF;
					if (this.aClass54Array1 == null || this.aClass54Array1[this.anIntArray67[local217]] == null) {
						local292 = this.aClass54Array2[this.anIntArray67[local217]];
					} else {
						local292 = this.aClass54Array1[this.anIntArray67[local217]];
					}
					local184 = arg0 + (arg2 * local292.anInt1660 + arg3 * local292.anInt1652 + arg4 * local292.anInt1654) / (local22 * local292.anInt1656);
					local26.anIntArray384[local217] = Static27.method553(local273, local184);
					if (this.aClass54Array1 == null || this.aClass54Array1[this.anIntArray64[local217]] == null) {
						local292 = this.aClass54Array2[this.anIntArray64[local217]];
					} else {
						local292 = this.aClass54Array1[this.anIntArray64[local217]];
					}
					local184 = arg0 + (arg2 * local292.anInt1660 + arg3 * local292.anInt1652 + arg4 * local292.anInt1654) / (local22 * local292.anInt1656);
					local26.anIntArray380[local217] = Static27.method553(local273, local184);
					if (this.aClass54Array1 == null || this.aClass54Array1[this.anIntArray69[local217]] == null) {
						local292 = this.aClass54Array2[this.anIntArray69[local217]];
					} else {
						local292 = this.aClass54Array1[this.anIntArray69[local217]];
					}
					local184 = arg0 + (arg2 * local292.anInt1660 + arg3 * local292.anInt1652 + arg4 * local292.anInt1654) / (local22 * local292.anInt1656);
					local26.anIntArray382[local217] = Static27.method553(local273, local184);
				} else if (local223 == 1) {
					local453 = this.aClass45Array1[local217];
					local184 = arg0 + (arg2 * local453.anInt1455 + arg3 * local453.anInt1459 + arg4 * local453.anInt1456) / (local22 + local22 / 2);
					local26.anIntArray384[local217] = Static27.method553(this.aShortArray11[local217] & 0xFFFF, local184);
					local26.anIntArray382[local217] = -1;
				} else if (local223 == 3) {
					local26.anIntArray384[local217] = 128;
					local26.anIntArray382[local217] = -1;
				} else {
					local26.anIntArray382[local217] = -2;
				}
			} else if (local223 == 0) {
				if (this.aClass54Array1 == null || this.aClass54Array1[this.anIntArray67[local217]] == null) {
					local292 = this.aClass54Array2[this.anIntArray67[local217]];
				} else {
					local292 = this.aClass54Array1[this.anIntArray67[local217]];
				}
				local184 = arg0 + (arg2 * local292.anInt1660 + arg3 * local292.anInt1652 + arg4 * local292.anInt1654) / (local22 * local292.anInt1656);
				local26.anIntArray384[local217] = Static27.method546(local184);
				if (this.aClass54Array1 == null || this.aClass54Array1[this.anIntArray64[local217]] == null) {
					local292 = this.aClass54Array2[this.anIntArray64[local217]];
				} else {
					local292 = this.aClass54Array1[this.anIntArray64[local217]];
				}
				local184 = arg0 + (arg2 * local292.anInt1660 + arg3 * local292.anInt1652 + arg4 * local292.anInt1654) / (local22 * local292.anInt1656);
				local26.anIntArray380[local217] = Static27.method546(local184);
				if (this.aClass54Array1 == null || this.aClass54Array1[this.anIntArray69[local217]] == null) {
					local292 = this.aClass54Array2[this.anIntArray69[local217]];
				} else {
					local292 = this.aClass54Array1[this.anIntArray69[local217]];
				}
				local184 = arg0 + (arg2 * local292.anInt1660 + arg3 * local292.anInt1652 + arg4 * local292.anInt1654) / (local22 * local292.anInt1656);
				local26.anIntArray382[local217] = Static27.method546(local184);
			} else if (local223 == 1) {
				local453 = this.aClass45Array1[local217];
				local184 = arg0 + (arg2 * local453.anInt1455 + arg3 * local453.anInt1459 + arg4 * local453.anInt1456) / (local22 + local22 / 2);
				local26.anIntArray384[local217] = Static27.method546(local184);
				local26.anIntArray382[local217] = -1;
			} else {
				local26.anIntArray382[local217] = -2;
			}
		}
		this.method547();
		local26.anInt2866 = this.anInt656;
		local26.anIntArray385 = this.anIntArray62;
		local26.anIntArray386 = this.anIntArray65;
		local26.anIntArray388 = this.anIntArray63;
		local26.anInt2865 = this.anInt662;
		local26.anIntArray379 = this.anIntArray67;
		local26.anIntArray383 = this.anIntArray64;
		local26.anIntArray381 = this.anIntArray69;
		local26.aByteArray41 = this.aByteArray12;
		local26.aByteArray39 = this.aByteArray13;
		local26.aByte7 = this.aByte3;
		local26.anIntArrayArray27 = this.anIntArrayArray7;
		local26.anIntArrayArray26 = this.anIntArrayArray6;
		local26.aShortArray39 = this.aShortArray10;
		return local26;
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "()V")
	public void method543() {
		if (this.aBoolean26) {
			return;
		}
		super.anInt2855 = 0;
		this.anInt661 = 0;
		this.anInt659 = 999999;
		this.anInt655 = -999999;
		this.anInt660 = -99999;
		this.anInt657 = 99999;
		for (@Pc(23) int local23 = 0; local23 < this.anInt656; local23++) {
			@Pc(29) int local29 = this.anIntArray62[local23];
			@Pc(34) int local34 = this.anIntArray65[local23];
			@Pc(39) int local39 = this.anIntArray63[local23];
			if (local29 < this.anInt659) {
				this.anInt659 = local29;
			}
			if (local29 > this.anInt655) {
				this.anInt655 = local29;
			}
			if (local39 < this.anInt657) {
				this.anInt657 = local39;
			}
			if (local39 > this.anInt660) {
				this.anInt660 = local39;
			}
			if (-local34 > super.anInt2855) {
				super.anInt2855 = -local34;
			}
			if (local34 > this.anInt661) {
				this.anInt661 = local34;
			}
		}
		this.aBoolean26 = true;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(SS)V")
	public void method544(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt662; local1++) {
			if (this.aShortArray11[local1] == arg0) {
				this.aShortArray11[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(III)V")
	public void method545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt656; local1++) {
			this.anIntArray62[local1] = this.anIntArray62[local1] * arg0 / 128;
			this.anIntArray65[local1] = this.anIntArray65[local1] * arg1 / 128;
			this.anIntArray63[local1] = this.anIntArray63[local1] * arg2 / 128;
		}
		this.method552();
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "()V")
	private void method547() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray71 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt656; local9++) {
				local15 = this.anIntArray71[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray7 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray7[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt656) {
				local65 = this.anIntArray71[local59];
				this.anIntArrayArray7[local65][local5[local65]++] = local59++;
			}
			this.anIntArray71 = null;
		}
		if (this.anIntArray60 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt662; local9++) {
			local15 = this.anIntArray60[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray6 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray6[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt662) {
			local65 = this.anIntArray60[local59];
			this.anIntArrayArray6[local65][local5[local65]++] = local59++;
		}
		this.anIntArray60 = null;
	}

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "()V")
	public void method548() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt656; local1++) {
			@Pc(7) int local7 = this.anIntArray62[local1];
			this.anIntArray62[local1] = this.anIntArray63[local1];
			this.anIntArray63[local1] = -local7;
		}
		this.method552();
	}

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "(I)V")
	public void method549() {
		@Pc(3) int local3 = Static27.anIntArray68[256];
		@Pc(7) int local7 = Static27.anIntArray66[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt656; local9++) {
			@Pc(26) int local26 = this.anIntArray63[local9] * local3 + this.anIntArray62[local9] * local7 >> 16;
			this.anIntArray63[local9] = this.anIntArray63[local9] * local7 - this.anIntArray62[local9] * local3 >> 16;
			this.anIntArray62[local9] = local26;
		}
		this.method552();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!ed;I)I")
	private int method550(@OriginalArg(0) Class2_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray62[arg1];
		@Pc(11) int local11 = arg0.anIntArray65[arg1];
		@Pc(16) int local16 = arg0.anIntArray63[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt656; local18++) {
			if (local6 == this.anIntArray62[local18] && local11 == this.anIntArray65[local18] && local16 == this.anIntArray63[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray62[this.anInt656] = local6;
			this.anIntArray65[this.anInt656] = local11;
			this.anIntArray63[this.anInt656] = local16;
			if (arg0.anIntArray71 != null) {
				this.anIntArray71[this.anInt656] = arg0.anIntArray71[arg1];
			}
			local1 = this.anInt656++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "()V")
	public void method551() {
		if (this.aClass54Array2 != null) {
			return;
		}
		this.aClass54Array2 = new Class54[this.anInt656];
		for (@Pc(10) int local10 = 0; local10 < this.anInt656; local10++) {
			this.aClass54Array2[local10] = new Class54();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt662; local25++) {
			@Pc(31) int local31 = this.anIntArray67[local25];
			@Pc(36) int local36 = this.anIntArray64[local25];
			@Pc(41) int local41 = this.anIntArray69[local25];
			@Pc(51) int local51 = this.anIntArray62[local36] - this.anIntArray62[local31];
			@Pc(61) int local61 = this.anIntArray65[local36] - this.anIntArray65[local31];
			@Pc(71) int local71 = this.anIntArray63[local36] - this.anIntArray63[local31];
			@Pc(81) int local81 = this.anIntArray62[local41] - this.anIntArray62[local31];
			@Pc(91) int local91 = this.anIntArray65[local41] - this.anIntArray65[local31];
			@Pc(101) int local101 = this.anIntArray63[local41] - this.anIntArray63[local31];
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
			if (this.aByteArray15 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray15[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class54 local211 = this.aClass54Array2[local31];
				local211.anInt1660 += local109;
				local211.anInt1652 += local117;
				local211.anInt1654 += local125;
				local211.anInt1656++;
				@Pc(240) Class54 local240 = this.aClass54Array2[local36];
				local240.anInt1660 += local109;
				local240.anInt1652 += local117;
				local240.anInt1654 += local125;
				local240.anInt1656++;
				@Pc(269) Class54 local269 = this.aClass54Array2[local41];
				local269.anInt1660 += local109;
				local269.anInt1652 += local117;
				local269.anInt1654 += local125;
				local269.anInt1656++;
			} else if (local198 == 1) {
				if (this.aClass45Array1 == null) {
					this.aClass45Array1 = new Class45[this.anInt662];
				}
				@Pc(314) Class45 local314 = this.aClass45Array1[local25] = new Class45();
				local314.anInt1455 = local109;
				local314.anInt1459 = local117;
				local314.anInt1456 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "()V")
	private void method552() {
		this.aClass54Array2 = null;
		this.aClass54Array1 = null;
		this.aClass45Array1 = null;
		this.aBoolean26 = false;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([B)V")
	private void method554(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class2_Sub4 local4 = new Class2_Sub4(arg0);
		@Pc(9) Class2_Sub4 local9 = new Class2_Sub4(arg0);
		@Pc(14) Class2_Sub4 local14 = new Class2_Sub4(arg0);
		@Pc(19) Class2_Sub4 local19 = new Class2_Sub4(arg0);
		@Pc(24) Class2_Sub4 local24 = new Class2_Sub4(arg0);
		@Pc(29) Class2_Sub4 local29 = new Class2_Sub4(arg0);
		@Pc(34) Class2_Sub4 local34 = new Class2_Sub4(arg0);
		local4.anInt1298 = arg0.length - 23;
		@Pc(44) int local44 = local4.method896();
		@Pc(48) int local48 = local4.method896();
		@Pc(52) int local52 = local4.method933();
		@Pc(56) int local56 = local4.method933();
		@Pc(60) int local60 = local4.method933();
		@Pc(64) int local64 = local4.method933();
		@Pc(68) int local68 = local4.method933();
		@Pc(72) int local72 = local4.method933();
		@Pc(76) int local76 = local4.method933();
		@Pc(80) int local80 = local4.method896();
		@Pc(84) int local84 = local4.method896();
		@Pc(88) int local88 = local4.method896();
		@Pc(92) int local92 = local4.method896();
		@Pc(96) int local96 = local4.method896();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray14 = new byte[local52];
			local4.anInt1298 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray14[local113] = local4.method922();
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
		this.anInt656 = local44;
		this.anInt662 = local48;
		this.anInt654 = local52;
		this.anIntArray62 = new int[local44];
		this.anIntArray65 = new int[local44];
		this.anIntArray63 = new int[local44];
		this.anIntArray67 = new int[local48];
		this.anIntArray64 = new int[local48];
		this.anIntArray69 = new int[local48];
		if (local76 == 1) {
			this.anIntArray71 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray15 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray12 = new byte[local48];
		} else {
			this.aByte3 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray13 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray60 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray10 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray11 = new byte[local48];
		}
		this.aShortArray11 = new short[local48];
		if (local52 > 0) {
			this.aShortArray9 = new short[local52];
			this.aShortArray12 = new short[local52];
			this.aShortArray4 = new short[local52];
			if (local100 > 0) {
				this.aShortArray8 = new short[local100];
				this.aShortArray3 = new short[local100];
				this.aShortArray2 = new short[local100];
				this.aShortArray5 = new short[local100];
				this.aByteArray10 = new byte[local100];
				this.aShortArray7 = new short[local100];
			}
			if (local102 > 0) {
				this.aShortArray6 = new short[local102];
			}
		}
		local4.anInt1298 = local52;
		local9.anInt1298 = local233;
		local14.anInt1298 = local239;
		local19.anInt1298 = local245;
		local24.anInt1298 = local184;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(461) int local461 = 0;
		@Pc(468) int local468;
		@Pc(470) int local470;
		@Pc(480) int local480;
		@Pc(490) int local490;
		for (@Pc(463) int local463 = 0; local463 < local44; local463++) {
			local468 = local4.method933();
			local470 = 0;
			if ((local468 & 0x1) != 0) {
				local470 = local9.method946();
			}
			local480 = 0;
			if ((local468 & 0x2) != 0) {
				local480 = local14.method946();
			}
			local490 = 0;
			if ((local468 & 0x4) != 0) {
				local490 = local19.method946();
			}
			this.anIntArray62[local463] = local457 + local470;
			this.anIntArray65[local463] = local459 + local480;
			this.anIntArray63[local463] = local461 + local490;
			local457 = this.anIntArray62[local463];
			local459 = this.anIntArray65[local463];
			local461 = this.anIntArray63[local463];
			if (local76 == 1) {
				this.anIntArray71[local463] = local24.method933();
			}
		}
		local4.anInt1298 = local225;
		local9.anInt1298 = local151;
		local14.anInt1298 = local166;
		local19.anInt1298 = local193;
		local24.anInt1298 = local175;
		local29.anInt1298 = local208;
		local34.anInt1298 = local219;
		for (local468 = 0; local468 < local48; local468++) {
			this.aShortArray11[local468] = (short) local4.method896();
			if (local56 == 1) {
				this.aByteArray15[local468] = local9.method922();
			}
			if (local60 == 255) {
				this.aByteArray12[local468] = local14.method922();
			}
			if (local64 == 1) {
				this.aByteArray13[local468] = local19.method922();
			}
			if (local68 == 1) {
				this.anIntArray60[local468] = local24.method933();
			}
			if (local72 == 1) {
				this.aShortArray10[local468] = (short) (local29.method896() - 1);
			}
			if (this.aByteArray11 != null && this.aShortArray10[local468] != -1) {
				this.aByteArray11[local468] = (byte) (local34.method933() - 1);
			}
		}
		local4.anInt1298 = local202;
		local9.anInt1298 = local160;
		local470 = 0;
		local480 = 0;
		local490 = 0;
		@Pc(670) int local670 = 0;
		@Pc(677) int local677;
		@Pc(780) int local780;
		for (@Pc(672) int local672 = 0; local672 < local48; local672++) {
			local677 = local9.method933();
			if (local677 == 1) {
				local470 = local4.method946() + local670;
				local480 = local4.method946() + local470;
				local490 = local4.method946() + local480;
				local670 = local490;
				this.anIntArray67[local672] = local470;
				this.anIntArray64[local672] = local480;
				this.anIntArray69[local672] = local490;
			}
			if (local677 == 2) {
				local480 = local490;
				local490 = local4.method946() + local670;
				local670 = local490;
				this.anIntArray67[local672] = local470;
				this.anIntArray64[local672] = local480;
				this.anIntArray69[local672] = local490;
			}
			if (local677 == 3) {
				local470 = local490;
				local490 = local4.method946() + local670;
				local670 = local490;
				this.anIntArray67[local672] = local470;
				this.anIntArray64[local672] = local480;
				this.anIntArray69[local672] = local490;
			}
			if (local677 == 4) {
				local780 = local470;
				local470 = local480;
				local480 = local780;
				local490 = local4.method946() + local670;
				local670 = local490;
				this.anIntArray67[local672] = local470;
				this.anIntArray64[local672] = local780;
				this.anIntArray69[local672] = local490;
			}
		}
		local4.anInt1298 = local251;
		local9.anInt1298 = local259;
		local14.anInt1298 = local267;
		local19.anInt1298 = local275;
		local24.anInt1298 = local283;
		local29.anInt1298 = local289;
		for (local677 = 0; local677 < local52; local677++) {
			local780 = this.aByteArray14[local677] & 0xFF;
			if (local780 == 0) {
				this.aShortArray9[local677] = (short) local4.method896();
				this.aShortArray12[local677] = (short) local4.method896();
				this.aShortArray4[local677] = (short) local4.method896();
			}
			if (local780 == 1) {
				this.aShortArray9[local677] = (short) local9.method896();
				this.aShortArray12[local677] = (short) local9.method896();
				this.aShortArray4[local677] = (short) local9.method896();
				this.aShortArray8[local677] = (short) local14.method896();
				this.aShortArray3[local677] = (short) local14.method896();
				this.aShortArray2[local677] = (short) local14.method896();
				this.aShortArray5[local677] = (short) local19.method896();
				this.aByteArray10[local677] = local24.method922();
				this.aShortArray7[local677] = (short) local29.method896();
			}
			if (local780 == 2) {
				this.aShortArray9[local677] = (short) local9.method896();
				this.aShortArray12[local677] = (short) local9.method896();
				this.aShortArray4[local677] = (short) local9.method896();
				this.aShortArray8[local677] = (short) local14.method896();
				this.aShortArray3[local677] = (short) local14.method896();
				this.aShortArray2[local677] = (short) local14.method896();
				this.aShortArray5[local677] = (short) local19.method896();
				this.aByteArray10[local677] = local24.method922();
				this.aShortArray7[local677] = (short) local29.method896();
				this.aShortArray6[local677] = (short) local29.method896();
			}
			if (local780 == 3) {
				this.aShortArray9[local677] = (short) local9.method896();
				this.aShortArray12[local677] = (short) local9.method896();
				this.aShortArray4[local677] = (short) local9.method896();
				this.aShortArray8[local677] = (short) local14.method896();
				this.aShortArray3[local677] = (short) local14.method896();
				this.aShortArray2[local677] = (short) local14.method896();
				this.aShortArray5[local677] = (short) local19.method896();
				this.aByteArray10[local677] = local24.method922();
				this.aShortArray7[local677] = (short) local29.method896();
			}
		}
		local4.anInt1298 = local113;
		local780 = local4.method933();
		if (local780 == 0) {
			return;
		}
		new Class22();
		local4.method896();
		local4.method896();
		local4.method896();
		local4.method903();
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(SS)V")
	public void method555(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray10 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt662; local5++) {
			if (this.aShortArray10[local5] == arg0) {
				this.aShortArray10[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "()V")
	public void method556() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt656; local1++) {
			this.anIntArray62[local1] = -this.anIntArray62[local1];
			this.anIntArray63[local1] = -this.anIntArray63[local1];
		}
		this.method552();
	}

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "()V")
	public void method558() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt656; local1++) {
			@Pc(7) int local7 = this.anIntArray63[local1];
			this.anIntArray63[local1] = this.anIntArray62[local1];
			this.anIntArray62[local1] = -local7;
		}
		this.method552();
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "([B)V")
	private void method561(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class2_Sub4 local8 = new Class2_Sub4(arg0);
		@Pc(13) Class2_Sub4 local13 = new Class2_Sub4(arg0);
		@Pc(18) Class2_Sub4 local18 = new Class2_Sub4(arg0);
		@Pc(23) Class2_Sub4 local23 = new Class2_Sub4(arg0);
		@Pc(28) Class2_Sub4 local28 = new Class2_Sub4(arg0);
		local8.anInt1298 = arg0.length - 18;
		@Pc(38) int local38 = local8.method896();
		@Pc(42) int local42 = local8.method896();
		@Pc(46) int local46 = local8.method933();
		@Pc(50) int local50 = local8.method933();
		@Pc(54) int local54 = local8.method933();
		@Pc(58) int local58 = local8.method933();
		@Pc(62) int local62 = local8.method933();
		@Pc(66) int local66 = local8.method933();
		@Pc(70) int local70 = local8.method896();
		@Pc(74) int local74 = local8.method896();
		@Pc(78) int local78 = local8.method896();
		@Pc(82) int local82 = local8.method896();
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
		this.anInt656 = local38;
		this.anInt662 = local42;
		this.anInt654 = local46;
		this.anIntArray62 = new int[local38];
		this.anIntArray65 = new int[local38];
		this.anIntArray63 = new int[local38];
		this.anIntArray67 = new int[local42];
		this.anIntArray64 = new int[local42];
		this.anIntArray69 = new int[local42];
		if (local46 > 0) {
			this.aByteArray14 = new byte[local46];
			this.aShortArray9 = new short[local46];
			this.aShortArray12 = new short[local46];
			this.aShortArray4 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray71 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray15 = new byte[local42];
			this.aByteArray11 = new byte[local42];
			this.aShortArray10 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray12 = new byte[local42];
		} else {
			this.aByte3 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray13 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray60 = new int[local42];
		}
		this.aShortArray11 = new short[local42];
		local8.anInt1298 = 0;
		local13.anInt1298 = local165;
		local18.anInt1298 = local171;
		local23.anInt1298 = local90;
		local28.anInt1298 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method933();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method946();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method946();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method946();
			}
			this.anIntArray62[local307] = local301 + local314;
			this.anIntArray65[local307] = local303 + local324;
			this.anIntArray63[local307] = local305 + local334;
			local301 = this.anIntArray62[local307];
			local303 = this.anIntArray65[local307];
			local305 = this.anIntArray63[local307];
			if (local66 == 1) {
				this.anIntArray71[local307] = local28.method933();
			}
		}
		local8.anInt1298 = local149;
		local13.anInt1298 = local116;
		local18.anInt1298 = local98;
		local23.anInt1298 = local134;
		local28.anInt1298 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray11[local312] = (short) local8.method896();
			if (local50 == 1) {
				local314 = local13.method933();
				if ((local314 & 0x1) == 1) {
					this.aByteArray15[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray15[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray11[local312] = (byte) (local314 >> 2);
					this.aShortArray10[local312] = this.aShortArray11[local312];
					this.aShortArray11[local312] = 127;
					if (this.aShortArray10[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray11[local312] = -1;
					this.aShortArray10[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray12[local312] = local18.method922();
			}
			if (local58 == 1) {
				this.aByteArray13[local312] = local23.method922();
			}
			if (local62 == 1) {
				this.anIntArray60[local312] = local28.method933();
			}
		}
		local8.anInt1298 = local143;
		local13.anInt1298 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method933();
			if (local543 == 1) {
				local314 = local8.method946() + local536;
				local324 = local8.method946() + local314;
				local334 = local8.method946() + local324;
				local536 = local334;
				this.anIntArray67[local538] = local314;
				this.anIntArray64[local538] = local324;
				this.anIntArray69[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method946() + local536;
				local536 = local334;
				this.anIntArray67[local538] = local314;
				this.anIntArray64[local538] = local324;
				this.anIntArray69[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method946() + local536;
				local536 = local334;
				this.anIntArray67[local538] = local314;
				this.anIntArray64[local538] = local324;
				this.anIntArray69[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method946() + local536;
				local536 = local334;
				this.anIntArray67[local538] = local314;
				this.anIntArray64[local538] = local646;
				this.anIntArray69[local538] = local334;
			}
		}
		local8.anInt1298 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray14[local543] = 0;
			this.aShortArray9[local543] = (short) local8.method896();
			this.aShortArray12[local543] = (short) local8.method896();
			this.aShortArray4[local543] = (short) local8.method896();
		}
		if (this.aByteArray11 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray11[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray9[local731] & 0xFFFF) == this.anIntArray67[local723] && (this.aShortArray12[local731] & 0xFFFF) == this.anIntArray64[local723] && (this.aShortArray4[local731] & 0xFFFF) == this.anIntArray69[local723]) {
						this.aByteArray11[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray11 = null;
			}
		}
		if (!local3) {
			this.aShortArray10 = null;
		}
		if (!local1) {
			this.aByteArray15 = null;
		}
	}
}
