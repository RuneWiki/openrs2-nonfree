import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!ai", name = "t", descriptor = "[B")
	public byte[] aByteArray2;

	@OriginalMember(owner = "client!ai", name = "v", descriptor = "[I")
	public int[] anIntArray22;

	@OriginalMember(owner = "client!ai", name = "w", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!ai", name = "y", descriptor = "[[I")
	public int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!ai", name = "A", descriptor = "[I")
	private int[] anIntArray24;

	@OriginalMember(owner = "client!ai", name = "B", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!ai", name = "C", descriptor = "I")
	public int anInt272;

	@OriginalMember(owner = "client!ai", name = "D", descriptor = "S")
	private short aShort1;

	@OriginalMember(owner = "client!ai", name = "F", descriptor = "[I")
	public int[] anIntArray25;

	@OriginalMember(owner = "client!ai", name = "G", descriptor = "[S")
	public short[] aShortArray2;

	@OriginalMember(owner = "client!ai", name = "H", descriptor = "[Lclient!fd;")
	public Class36[] aClass36Array1;

	@OriginalMember(owner = "client!ai", name = "J", descriptor = "[S")
	public short[] aShortArray3;

	@OriginalMember(owner = "client!ai", name = "K", descriptor = "[I")
	public int[] anIntArray26;

	@OriginalMember(owner = "client!ai", name = "L", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!ai", name = "M", descriptor = "[I")
	public int[] anIntArray27;

	@OriginalMember(owner = "client!ai", name = "N", descriptor = "[B")
	private byte[] aByteArray5;

	@OriginalMember(owner = "client!ai", name = "O", descriptor = "[S")
	public short[] aShortArray4;

	@OriginalMember(owner = "client!ai", name = "P", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!ai", name = "Q", descriptor = "S")
	public short aShort3;

	@OriginalMember(owner = "client!ai", name = "T", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!ai", name = "U", descriptor = "[[I")
	public int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!ai", name = "V", descriptor = "[Lclient!sb;")
	public Class106[] aClass106Array1;

	@OriginalMember(owner = "client!ai", name = "W", descriptor = "[B")
	private byte[] aByteArray7;

	@OriginalMember(owner = "client!ai", name = "X", descriptor = "[I")
	public int[] anIntArray29;

	@OriginalMember(owner = "client!ai", name = "Y", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!ai", name = "Z", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!ai", name = "ab", descriptor = "[S")
	public short[] aShortArray5;

	@OriginalMember(owner = "client!ai", name = "bb", descriptor = "[I")
	private int[] anIntArray30;

	@OriginalMember(owner = "client!ai", name = "cb", descriptor = "S")
	private short aShort4;

	@OriginalMember(owner = "client!ai", name = "db", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!ai", name = "eb", descriptor = "[Lclient!sb;")
	public Class106[] aClass106Array2;

	@OriginalMember(owner = "client!ai", name = "fb", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!ai", name = "gb", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!ai", name = "ib", descriptor = "[I")
	public int[] anIntArray31;

	@OriginalMember(owner = "client!ai", name = "kb", descriptor = "S")
	private short aShort5;

	@OriginalMember(owner = "client!ai", name = "lb", descriptor = "[B")
	private byte[] aByteArray11;

	@OriginalMember(owner = "client!ai", name = "mb", descriptor = "S")
	private short aShort6;

	@OriginalMember(owner = "client!ai", name = "nb", descriptor = "S")
	private short aShort7;

	@OriginalMember(owner = "client!ai", name = "ob", descriptor = "S")
	private short aShort8;

	@OriginalMember(owner = "client!ai", name = "pb", descriptor = "[S")
	public short[] aShortArray8;

	@OriginalMember(owner = "client!ai", name = "x", descriptor = "B")
	public byte aByte1 = 0;

	@OriginalMember(owner = "client!ai", name = "E", descriptor = "I")
	public int anInt273 = 0;

	@OriginalMember(owner = "client!ai", name = "I", descriptor = "I")
	public int anInt274 = 0;

	@OriginalMember(owner = "client!ai", name = "hb", descriptor = "Z")
	private boolean aBoolean26 = false;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
	private Class5_Sub1() {
	}

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "([B)V")
	public Class5_Sub1(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method290(arg0);
		} else {
			this.method282(arg0);
		}
	}

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(III)V")
	public Class5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray26 = new int[arg0];
		this.anIntArray29 = new int[arg0];
		this.anIntArray31 = new int[arg0];
		this.anIntArray30 = new int[arg0];
		this.anIntArray27 = new int[arg1];
		this.anIntArray22 = new int[arg1];
		this.anIntArray25 = new int[arg1];
		this.aByteArray9 = new byte[arg1];
		this.aByteArray4 = new byte[arg1];
		this.aByteArray2 = new byte[arg1];
		this.aShortArray4 = new short[arg1];
		this.aShortArray5 = new short[arg1];
		this.aByteArray10 = new byte[arg1];
		this.anIntArray24 = new int[arg1];
	}

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "([Lclient!ai;I)V")
	public Class5_Sub1(@OriginalArg(0) Class5_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt274 = 0;
		this.anInt273 = 0;
		this.anInt272 = 0;
		this.aByte1 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class5_Sub1 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt274 += local44.anInt274;
				this.anInt273 += local44.anInt273;
				this.anInt272 += local44.anInt272;
				if (local44.aByteArray4 == null) {
					if (this.aByte1 == -1) {
						this.aByte1 = local44.aByte1;
					}
					if (this.aByte1 != local44.aByte1) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray9 != null;
				local19 |= local44.aByteArray2 != null;
				local21 |= local44.anIntArray24 != null;
				local23 |= local44.aShortArray5 != null;
				local25 |= local44.aByteArray10 != null;
			}
		}
		this.anIntArray26 = new int[this.anInt274];
		this.anIntArray29 = new int[this.anInt274];
		this.anIntArray31 = new int[this.anInt274];
		this.anIntArray30 = new int[this.anInt274];
		this.anIntArray27 = new int[this.anInt273];
		this.anIntArray22 = new int[this.anInt273];
		this.anIntArray25 = new int[this.anInt273];
		if (local15) {
			this.aByteArray9 = new byte[this.anInt273];
		}
		if (local17) {
			this.aByteArray4 = new byte[this.anInt273];
		}
		if (local19) {
			this.aByteArray2 = new byte[this.anInt273];
		}
		if (local21) {
			this.anIntArray24 = new int[this.anInt273];
		}
		if (local23) {
			this.aShortArray5 = new short[this.anInt273];
		}
		if (local25) {
			this.aByteArray10 = new byte[this.anInt273];
		}
		this.aShortArray4 = new short[this.anInt273];
		if (this.anInt272 > 0) {
			this.aByteArray6 = new byte[this.anInt272];
			this.aShortArray2 = new short[this.anInt272];
			this.aShortArray8 = new short[this.anInt272];
			this.aShortArray3 = new short[this.anInt272];
			this.aShortArray7 = new short[this.anInt272];
			this.aShortArray1 = new short[this.anInt272];
			this.aShortArray6 = new short[this.anInt272];
			this.aByteArray5 = new byte[this.anInt272];
			this.aByteArray8 = new byte[this.anInt272];
			this.aByteArray11 = new byte[this.anInt272];
			this.aByteArray7 = new byte[this.anInt272];
			this.aByteArray3 = new byte[this.anInt272];
		}
		this.anInt274 = 0;
		this.anInt273 = 0;
		this.anInt272 = 0;
		for (@Pc(293) int local293 = 0; local293 < arg1; local293++) {
			@Pc(298) Class5_Sub1 local298 = arg0[local293];
			if (local298 != null) {
				for (@Pc(302) int local302 = 0; local302 < local298.anInt273; local302++) {
					if (local15 && local298.aByteArray9 != null) {
						this.aByteArray9[this.anInt273] = local298.aByteArray9[local302];
					}
					if (local17) {
						if (local298.aByteArray4 == null) {
							this.aByteArray4[this.anInt273] = local298.aByte1;
						} else {
							this.aByteArray4[this.anInt273] = local298.aByteArray4[local302];
						}
					}
					if (local19 && local298.aByteArray2 != null) {
						this.aByteArray2[this.anInt273] = local298.aByteArray2[local302];
					}
					if (local21 && local298.anIntArray24 != null) {
						this.anIntArray24[this.anInt273] = local298.anIntArray24[local302];
					}
					if (local23) {
						if (local298.aShortArray5 == null) {
							this.aShortArray5[this.anInt273] = -1;
						} else {
							this.aShortArray5[this.anInt273] = local298.aShortArray5[local302];
						}
					}
					if (local25) {
						if (local298.aByteArray10 == null || local298.aByteArray10[local302] == -1) {
							this.aByteArray10[this.anInt273] = -1;
						} else {
							this.aByteArray10[this.anInt273] = (byte) (local298.aByteArray10[local302] + this.anInt272);
						}
					}
					this.aShortArray4[this.anInt273] = local298.aShortArray4[local302];
					this.anIntArray27[this.anInt273] = this.method297(local298, local298.anIntArray27[local302]);
					this.anIntArray22[this.anInt273] = this.method297(local298, local298.anIntArray22[local302]);
					this.anIntArray25[this.anInt273] = this.method297(local298, local298.anIntArray25[local302]);
					this.anInt273++;
				}
				for (@Pc(477) int local477 = 0; local477 < local298.anInt272; local477++) {
					@Pc(489) byte local489 = this.aByteArray6[this.anInt272] = local298.aByteArray6[local477];
					if (local489 == 0) {
						this.aShortArray2[this.anInt272] = (short) this.method297(local298, local298.aShortArray2[local477]);
						this.aShortArray8[this.anInt272] = (short) this.method297(local298, local298.aShortArray8[local477]);
						this.aShortArray3[this.anInt272] = (short) this.method297(local298, local298.aShortArray3[local477]);
					}
					if (local489 >= 1 && local489 <= 3) {
						this.aShortArray2[this.anInt272] = local298.aShortArray2[local477];
						this.aShortArray8[this.anInt272] = local298.aShortArray8[local477];
						this.aShortArray3[this.anInt272] = local298.aShortArray3[local477];
						this.aShortArray7[this.anInt272] = local298.aShortArray7[local477];
						this.aShortArray1[this.anInt272] = local298.aShortArray1[local477];
						this.aShortArray6[this.anInt272] = local298.aShortArray6[local477];
						this.aByteArray5[this.anInt272] = local298.aByteArray5[local477];
						this.aByteArray8[this.anInt272] = local298.aByteArray8[local477];
						this.aByteArray11[this.anInt272] = local298.aByteArray11[local477];
					}
					if (local489 == 2) {
						this.aByteArray7[this.anInt272] = local298.aByteArray7[local477];
						this.aByteArray3[this.anInt272] = local298.aByteArray3[local477];
					}
					this.anInt272++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!ai;ZZZZ)V")
	public Class5_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt274 = arg0.anInt274;
		this.anInt273 = arg0.anInt273;
		this.anInt272 = arg0.anInt272;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray26 = arg0.anIntArray26;
			this.anIntArray29 = arg0.anIntArray29;
			this.anIntArray31 = arg0.anIntArray31;
		} else {
			this.anIntArray26 = new int[this.anInt274];
			this.anIntArray29 = new int[this.anInt274];
			this.anIntArray31 = new int[this.anInt274];
			for (local57 = 0; local57 < this.anInt274; local57++) {
				this.anIntArray26[local57] = arg0.anIntArray26[local57];
				this.anIntArray29[local57] = arg0.anIntArray29[local57];
				this.anIntArray31[local57] = arg0.anIntArray31[local57];
			}
		}
		if (arg2) {
			this.aShortArray4 = arg0.aShortArray4;
		} else {
			this.aShortArray4 = new short[this.anInt273];
			for (local57 = 0; local57 < this.anInt273; local57++) {
				this.aShortArray4[local57] = arg0.aShortArray4[local57];
			}
		}
		if (arg3 || arg0.aShortArray5 == null) {
			this.aShortArray5 = arg0.aShortArray5;
		} else {
			this.aShortArray5 = new short[this.anInt273];
			for (local57 = 0; local57 < this.anInt273; local57++) {
				this.aShortArray5[local57] = arg0.aShortArray5[local57];
			}
		}
		this.aByteArray2 = arg0.aByteArray2;
		this.anIntArray27 = arg0.anIntArray27;
		this.anIntArray22 = arg0.anIntArray22;
		this.anIntArray25 = arg0.anIntArray25;
		this.aByteArray9 = arg0.aByteArray9;
		this.aByteArray4 = arg0.aByteArray4;
		this.aByteArray10 = arg0.aByteArray10;
		this.aByte1 = arg0.aByte1;
		this.aByteArray6 = arg0.aByteArray6;
		this.aShortArray2 = arg0.aShortArray2;
		this.aShortArray8 = arg0.aShortArray8;
		this.aShortArray3 = arg0.aShortArray3;
		this.aShortArray7 = arg0.aShortArray7;
		this.aShortArray1 = arg0.aShortArray1;
		this.aShortArray6 = arg0.aShortArray6;
		this.aByteArray5 = arg0.aByteArray5;
		this.aByteArray8 = arg0.aByteArray8;
		this.aByteArray11 = arg0.aByteArray11;
		this.aByteArray7 = arg0.aByteArray7;
		this.aByteArray3 = arg0.aByteArray3;
		this.anIntArray30 = arg0.anIntArray30;
		this.anIntArray24 = arg0.anIntArray24;
		this.anIntArrayArray2 = arg0.anIntArrayArray2;
		this.anIntArrayArray3 = arg0.anIntArrayArray3;
		this.aClass106Array2 = arg0.aClass106Array2;
		this.aClass36Array1 = arg0.aClass36Array1;
		this.aClass106Array1 = arg0.aClass106Array1;
		this.aShort2 = arg0.aShort2;
		this.aShort3 = arg0.aShort3;
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "()Lclient!ai;")
	public Class5_Sub1 method268() {
		@Pc(3) Class5_Sub1 local3 = new Class5_Sub1();
		if (this.aByteArray9 != null) {
			local3.aByteArray9 = new byte[this.anInt273];
			for (@Pc(13) int local13 = 0; local13 < this.anInt273; local13++) {
				local3.aByteArray9[local13] = this.aByteArray9[local13];
			}
		}
		local3.anInt274 = this.anInt274;
		local3.anInt273 = this.anInt273;
		local3.anInt272 = this.anInt272;
		local3.anIntArray26 = this.anIntArray26;
		local3.anIntArray29 = this.anIntArray29;
		local3.anIntArray31 = this.anIntArray31;
		local3.anIntArray27 = this.anIntArray27;
		local3.anIntArray22 = this.anIntArray22;
		local3.anIntArray25 = this.anIntArray25;
		local3.aByteArray4 = this.aByteArray4;
		local3.aByteArray2 = this.aByteArray2;
		local3.aByteArray10 = this.aByteArray10;
		local3.aShortArray4 = this.aShortArray4;
		local3.aShortArray5 = this.aShortArray5;
		local3.aByte1 = this.aByte1;
		local3.aByteArray6 = this.aByteArray6;
		local3.aShortArray2 = this.aShortArray2;
		local3.aShortArray8 = this.aShortArray8;
		local3.aShortArray3 = this.aShortArray3;
		local3.aShortArray7 = this.aShortArray7;
		local3.aShortArray1 = this.aShortArray1;
		local3.aShortArray6 = this.aShortArray6;
		local3.aByteArray5 = this.aByteArray5;
		local3.aByteArray8 = this.aByteArray8;
		local3.aByteArray11 = this.aByteArray11;
		local3.aByteArray7 = this.aByteArray7;
		local3.aByteArray3 = this.aByteArray3;
		local3.anIntArray30 = this.anIntArray30;
		local3.anIntArray24 = this.anIntArray24;
		local3.anIntArrayArray2 = this.anIntArrayArray2;
		local3.anIntArrayArray3 = this.anIntArrayArray3;
		local3.aClass106Array2 = this.aClass106Array2;
		local3.aClass36Array1 = this.aClass36Array1;
		local3.aShort2 = this.aShort2;
		local3.aShort3 = this.aShort3;
		return local3;
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "()V")
	public void method269() {
		if (this.aClass106Array2 != null) {
			return;
		}
		this.aClass106Array2 = new Class106[this.anInt274];
		for (@Pc(10) int local10 = 0; local10 < this.anInt274; local10++) {
			this.aClass106Array2[local10] = new Class106();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt273; local25++) {
			@Pc(31) int local31 = this.anIntArray27[local25];
			@Pc(36) int local36 = this.anIntArray22[local25];
			@Pc(41) int local41 = this.anIntArray25[local25];
			@Pc(51) int local51 = this.anIntArray26[local36] - this.anIntArray26[local31];
			@Pc(61) int local61 = this.anIntArray29[local36] - this.anIntArray29[local31];
			@Pc(71) int local71 = this.anIntArray31[local36] - this.anIntArray31[local31];
			@Pc(81) int local81 = this.anIntArray26[local41] - this.anIntArray26[local31];
			@Pc(91) int local91 = this.anIntArray29[local41] - this.anIntArray29[local31];
			@Pc(101) int local101 = this.anIntArray31[local41] - this.anIntArray31[local31];
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
			if (this.aByteArray9 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray9[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class106 local211 = this.aClass106Array2[local31];
				local211.anInt4170 += local109;
				local211.anInt4173 += local117;
				local211.anInt4171 += local125;
				local211.anInt4169++;
				@Pc(240) Class106 local240 = this.aClass106Array2[local36];
				local240.anInt4170 += local109;
				local240.anInt4173 += local117;
				local240.anInt4171 += local125;
				local240.anInt4169++;
				@Pc(269) Class106 local269 = this.aClass106Array2[local41];
				local269.anInt4170 += local109;
				local269.anInt4173 += local117;
				local269.anInt4171 += local125;
				local269.anInt4169++;
			} else if (local198 == 1) {
				if (this.aClass36Array1 == null) {
					this.aClass36Array1 = new Class36[this.anInt273];
				}
				@Pc(314) Class36 local314 = this.aClass36Array1[local25] = new Class36();
				local314.anInt1427 = local109;
				local314.anInt1426 = local117;
				local314.anInt1430 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(SS)V")
	public void method271(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt273; local1++) {
			if (this.aShortArray4[local1] == arg0) {
				this.aShortArray4[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "()V")
	public void method272() {
		this.anIntArray30 = null;
		this.anIntArray24 = null;
		this.anIntArrayArray2 = null;
		this.anIntArrayArray3 = null;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(III)V")
	public void method273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt274; local1++) {
			this.anIntArray26[local1] = this.anIntArray26[local1] * arg0 / 128;
			this.anIntArray29[local1] = this.anIntArray29[local1] * arg1 / 128;
			this.anIntArray31[local1] = this.anIntArray31[local1] * arg2 / 128;
		}
		this.method293();
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(IIIII)Lclient!nb;")
	public Class5_Sub3 method274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class5_Sub3_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "()V")
	public void method275() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray30 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt274; local9++) {
				local15 = this.anIntArray30[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray2 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray2[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt274) {
				local65 = this.anIntArray30[local59];
				this.anIntArrayArray2[local65][local5[local65]++] = local59++;
			}
			this.anIntArray30 = null;
		}
		if (this.anIntArray24 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt273; local9++) {
			local15 = this.anIntArray24[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray3 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray3[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt273) {
			local65 = this.anIntArray24[local59];
			this.anIntArrayArray3[local65][local5[local65]++] = local59++;
		}
		this.anIntArray24 = null;
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
	private void method276(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static9.anIntArray28[arg0];
		@Pc(7) int local7 = Static9.anIntArray23[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt274; local9++) {
			@Pc(26) int local26 = this.anIntArray29[local9] * local3 + this.anIntArray26[local9] * local7 >> 16;
			this.anIntArray29[local9] = this.anIntArray29[local9] * local7 - this.anIntArray26[local9] * local3 >> 16;
			this.anIntArray26[local9] = local26;
		}
		this.method293();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!af;IIIZ)V")
	@Override
	public void method2296(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class5_Sub1 local2 = (Class5_Sub1) arg0;
		local2.method283();
		local2.method269();
		Static9.anInt275++;
		@Pc(12) int local12 = 0;
		@Pc(15) int[] local15 = local2.anIntArray26;
		@Pc(18) int local18 = local2.anInt274;
		@Pc(36) int local36;
		for (@Pc(20) int local20 = 0; local20 < this.anInt274; local20++) {
			@Pc(26) Class106 local26 = this.aClass106Array2[local20];
			if (local26.anInt4169 != 0) {
				local36 = this.anIntArray29[local20] - arg2;
				if (local36 >= local2.aShort8 && local36 <= local2.aShort5) {
					@Pc(52) int local52 = this.anIntArray26[local20] - arg1;
					if (local52 >= local2.aShort4 && local52 <= local2.aShort6) {
						@Pc(68) int local68 = this.anIntArray31[local20] - arg3;
						if (local68 >= local2.aShort7 && local68 <= local2.aShort1) {
							for (@Pc(79) int local79 = 0; local79 < local18; local79++) {
								@Pc(85) Class106 local85 = local2.aClass106Array2[local79];
								if (local52 == local15[local79] && local68 == local2.anIntArray31[local79] && local36 == local2.anIntArray29[local79] && local85.anInt4169 != 0) {
									if (this.aClass106Array1 == null) {
										this.aClass106Array1 = new Class106[this.anInt274];
									}
									if (local2.aClass106Array1 == null) {
										local2.aClass106Array1 = new Class106[local18];
									}
									@Pc(125) Class106 local125 = this.aClass106Array1[local20];
									if (local125 == null) {
										local125 = this.aClass106Array1[local20] = new Class106(local26);
									}
									@Pc(142) Class106 local142 = local2.aClass106Array1[local79];
									if (local142 == null) {
										local142 = local2.aClass106Array1[local79] = new Class106(local85);
									}
									local125.anInt4170 += local85.anInt4170;
									local125.anInt4173 += local85.anInt4173;
									local125.anInt4171 += local85.anInt4171;
									local125.anInt4169 += local85.anInt4169;
									local142.anInt4170 += local26.anInt4170;
									local142.anInt4173 += local26.anInt4173;
									local142.anInt4171 += local26.anInt4171;
									local142.anInt4169 += local26.anInt4169;
									local12++;
									Static9.anIntArray21[local20] = Static9.anInt275;
									Static9.anIntArray32[local79] = Static9.anInt275;
								}
							}
						}
					}
				}
			}
		}
		if (local12 < 3 || !arg4) {
			return;
		}
		for (@Pc(236) int local236 = 0; local236 < this.anInt273; local236++) {
			if (Static9.anIntArray21[this.anIntArray27[local236]] == Static9.anInt275 && Static9.anIntArray21[this.anIntArray22[local236]] == Static9.anInt275 && Static9.anIntArray21[this.anIntArray25[local236]] == Static9.anInt275) {
				if (this.aByteArray9 == null) {
					this.aByteArray9 = new byte[this.anInt273];
				}
				this.aByteArray9[local236] = 2;
			}
		}
		for (local36 = 0; local36 < local2.anInt273; local36++) {
			if (Static9.anIntArray32[local2.anIntArray27[local36]] == Static9.anInt275 && Static9.anIntArray32[local2.anIntArray22[local36]] == Static9.anInt275 && Static9.anIntArray32[local2.anIntArray25[local36]] == Static9.anInt275) {
				if (local2.aByteArray9 == null) {
					local2.aByteArray9 = new byte[local2.anInt273];
				}
				local2.aByteArray9[local36] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(SS)V")
	public void method278(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray5 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt273; local5++) {
			if (this.aShortArray5[local5] == arg0) {
				this.aShortArray5[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "([[IIIIII)V")
	private void method279(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static9.method270(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static9.method270(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static9.method270(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static9.method270(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		if (arg5 != 0) {
			@Pc(120) int local120 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
			if (local120 != 0) {
				this.method281(local120);
			}
		}
		if (arg4 != 0) {
			@Pc(140) int local140 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
			if (local140 != 0) {
				this.method276(local140);
			}
		}
		@Pc(149) int local149 = local24 + local77;
		if (local42 + local60 < local149) {
			local149 = local42 + local60;
		}
		local149 = (local149 >> 1) - arg2;
		if (local149 != 0) {
			this.method285(0, local149, 0);
		}
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(III)I")
	public int method280(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt274; local1++) {
			if (this.anIntArray26[local1] == arg0 && this.anIntArray29[local1] == 0 && this.anIntArray31[local1] == arg1) {
				return local1;
			}
		}
		this.anIntArray26[this.anInt274] = arg0;
		this.anIntArray29[this.anInt274] = 0;
		this.anIntArray31[this.anInt274] = arg1;
		return this.anInt274++;
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V")
	private void method281(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static9.anIntArray28[arg0];
		@Pc(7) int local7 = Static9.anIntArray23[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt274; local9++) {
			@Pc(26) int local26 = this.anIntArray29[local9] * local7 - this.anIntArray31[local9] * local3 >> 16;
			this.anIntArray31[local9] = this.anIntArray29[local9] * local3 + this.anIntArray31[local9] * local7 >> 16;
			this.anIntArray29[local9] = local26;
		}
		this.method293();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "([B)V")
	private void method282(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class1_Sub26 local8 = new Class1_Sub26(arg0);
		@Pc(13) Class1_Sub26 local13 = new Class1_Sub26(arg0);
		@Pc(18) Class1_Sub26 local18 = new Class1_Sub26(arg0);
		@Pc(23) Class1_Sub26 local23 = new Class1_Sub26(arg0);
		@Pc(28) Class1_Sub26 local28 = new Class1_Sub26(arg0);
		local8.anInt4021 = arg0.length - 18;
		@Pc(38) int local38 = local8.method2964();
		@Pc(42) int local42 = local8.method2964();
		@Pc(46) int local46 = local8.method2945();
		@Pc(50) int local50 = local8.method2945();
		@Pc(54) int local54 = local8.method2945();
		@Pc(58) int local58 = local8.method2945();
		@Pc(62) int local62 = local8.method2945();
		@Pc(66) int local66 = local8.method2945();
		@Pc(70) int local70 = local8.method2964();
		@Pc(74) int local74 = local8.method2964();
		@Pc(78) int local78 = local8.method2964();
		@Pc(82) int local82 = local8.method2964();
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
		this.anInt274 = local38;
		this.anInt273 = local42;
		this.anInt272 = local46;
		this.anIntArray26 = new int[local38];
		this.anIntArray29 = new int[local38];
		this.anIntArray31 = new int[local38];
		this.anIntArray27 = new int[local42];
		this.anIntArray22 = new int[local42];
		this.anIntArray25 = new int[local42];
		if (local46 > 0) {
			this.aByteArray6 = new byte[local46];
			this.aShortArray2 = new short[local46];
			this.aShortArray8 = new short[local46];
			this.aShortArray3 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray30 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray9 = new byte[local42];
			this.aByteArray10 = new byte[local42];
			this.aShortArray5 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray4 = new byte[local42];
		} else {
			this.aByte1 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray2 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray24 = new int[local42];
		}
		this.aShortArray4 = new short[local42];
		local8.anInt4021 = 0;
		local13.anInt4021 = local165;
		local18.anInt4021 = local171;
		local23.anInt4021 = local90;
		local28.anInt4021 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method2945();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method2965();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method2965();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method2965();
			}
			this.anIntArray26[local307] = local301 + local314;
			this.anIntArray29[local307] = local303 + local324;
			this.anIntArray31[local307] = local305 + local334;
			local301 = this.anIntArray26[local307];
			local303 = this.anIntArray29[local307];
			local305 = this.anIntArray31[local307];
			if (local66 == 1) {
				this.anIntArray30[local307] = local28.method2945();
			}
		}
		local8.anInt4021 = local149;
		local13.anInt4021 = local116;
		local18.anInt4021 = local98;
		local23.anInt4021 = local134;
		local28.anInt4021 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray4[local312] = (short) local8.method2964();
			if (local50 == 1) {
				local314 = local13.method2945();
				if ((local314 & 0x1) == 1) {
					this.aByteArray9[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray9[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray10[local312] = (byte) (local314 >> 2);
					this.aShortArray5[local312] = this.aShortArray4[local312];
					this.aShortArray4[local312] = 127;
					if (this.aShortArray5[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray10[local312] = -1;
					this.aShortArray5[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray4[local312] = local18.method2992();
			}
			if (local58 == 1) {
				this.aByteArray2[local312] = local23.method2992();
			}
			if (local62 == 1) {
				this.anIntArray24[local312] = local28.method2945();
			}
		}
		local8.anInt4021 = local143;
		local13.anInt4021 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method2945();
			if (local543 == 1) {
				local314 = local8.method2965() + local536;
				local324 = local8.method2965() + local314;
				local334 = local8.method2965() + local324;
				local536 = local334;
				this.anIntArray27[local538] = local314;
				this.anIntArray22[local538] = local324;
				this.anIntArray25[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method2965() + local536;
				local536 = local334;
				this.anIntArray27[local538] = local314;
				this.anIntArray22[local538] = local324;
				this.anIntArray25[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method2965() + local536;
				local536 = local334;
				this.anIntArray27[local538] = local314;
				this.anIntArray22[local538] = local324;
				this.anIntArray25[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method2965() + local536;
				local536 = local334;
				this.anIntArray27[local538] = local314;
				this.anIntArray22[local538] = local646;
				this.anIntArray25[local538] = local334;
			}
		}
		local8.anInt4021 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray6[local543] = 0;
			this.aShortArray2[local543] = (short) local8.method2964();
			this.aShortArray8[local543] = (short) local8.method2964();
			this.aShortArray3[local543] = (short) local8.method2964();
		}
		if (this.aByteArray10 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray10[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray2[local731] & 0xFFFF) == this.anIntArray27[local723] && (this.aShortArray8[local731] & 0xFFFF) == this.anIntArray22[local723] && (this.aShortArray3[local731] & 0xFFFF) == this.anIntArray25[local723]) {
						this.aByteArray10[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray10 = null;
			}
		}
		if (!local3) {
			this.aShortArray5 = null;
		}
		if (!local1) {
			this.aByteArray9 = null;
		}
	}

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "()V")
	private void method283() {
		if (this.aBoolean26) {
			return;
		}
		this.aBoolean26 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt274; local20++) {
			@Pc(26) int local26 = this.anIntArray26[local20];
			@Pc(31) int local31 = this.anIntArray29[local20];
			@Pc(36) int local36 = this.anIntArray31[local20];
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
		this.aShort4 = (short) local8;
		this.aShort6 = (short) local14;
		this.aShort8 = (short) local10;
		this.aShort5 = (short) local16;
		this.aShort7 = (short) local12;
		this.aShort1 = (short) local18;
	}

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "()V")
	public void method284() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt274; local1++) {
			this.anIntArray31[local1] = -this.anIntArray31[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt273; local18++) {
			@Pc(24) int local24 = this.anIntArray27[local18];
			this.anIntArray27[local18] = this.anIntArray25[local18];
			this.anIntArray25[local18] = local24;
		}
		this.method293();
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(III)V")
	public void method285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt274; local1++) {
			this.anIntArray26[local1] += arg0;
			this.anIntArray29[local1] += arg1;
			this.anIntArray31[local1] += arg2;
		}
		this.method293();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II[[I[[IIIIZZ)Lclient!ai;")
	public Class5_Sub1 method286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method283();
		@Pc(6) int local6 = arg4 + this.aShort4;
		@Pc(11) int local11 = arg4 + this.aShort6;
		@Pc(16) int local16 = arg6 + this.aShort7;
		@Pc(21) int local21 = arg6 + this.aShort1;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local6 < 0 || local11 + 128 >> 7 >= arg2.length || local16 < 0 || local21 + 128 >> 7 >= arg2[0].length)) {
			return this;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return this;
			}
			if (local6 < 0 || local11 + 128 >> 7 >= arg3.length || local16 < 0 || local21 + 128 >> 7 >= arg3[0].length) {
				return this;
			}
		} else {
			local6 >>= 0x7;
			local11 = local11 + 127 >> 7;
			local16 >>= 0x7;
			local21 = local21 + 127 >> 7;
			if (arg2[local6][local16] == arg5 && arg2[local11][local16] == arg5 && arg2[local6][local21] == arg5 && arg2[local11][local21] == arg5) {
				return this;
			}
		}
		@Pc(147) Class5_Sub1 local147 = new Class5_Sub1();
		local147.anInt274 = this.anInt274;
		local147.anInt273 = this.anInt273;
		local147.anInt272 = this.anInt272;
		local147.anIntArray27 = this.anIntArray27;
		local147.anIntArray22 = this.anIntArray22;
		local147.anIntArray25 = this.anIntArray25;
		local147.aByteArray9 = this.aByteArray9;
		local147.aByteArray4 = this.aByteArray4;
		local147.aByteArray2 = this.aByteArray2;
		local147.aByteArray10 = this.aByteArray10;
		local147.aShortArray4 = this.aShortArray4;
		local147.aShortArray5 = this.aShortArray5;
		local147.aByte1 = this.aByte1;
		local147.aByteArray6 = this.aByteArray6;
		local147.aShortArray2 = this.aShortArray2;
		local147.aShortArray8 = this.aShortArray8;
		local147.aShortArray3 = this.aShortArray3;
		local147.aShortArray7 = this.aShortArray7;
		local147.aShortArray1 = this.aShortArray1;
		local147.aShortArray6 = this.aShortArray6;
		local147.aByteArray5 = this.aByteArray5;
		local147.aByteArray8 = this.aByteArray8;
		local147.aByteArray11 = this.aByteArray11;
		local147.aByteArray7 = this.aByteArray7;
		local147.aByteArray3 = this.aByteArray3;
		local147.anIntArray30 = this.anIntArray30;
		local147.anIntArray24 = this.anIntArray24;
		local147.anIntArrayArray2 = this.anIntArrayArray2;
		local147.anIntArrayArray3 = this.anIntArrayArray3;
		local147.aShort2 = this.aShort2;
		local147.aShort3 = this.aShort3;
		local147.aClass106Array2 = this.aClass106Array2;
		local147.aClass36Array1 = this.aClass36Array1;
		local147.aClass106Array1 = this.aClass106Array1;
		if (arg0 == 3) {
			local147.anIntArray26 = Static70.method1252(this.anIntArray26);
			local147.anIntArray29 = Static70.method1252(this.anIntArray29);
			local147.anIntArray31 = Static70.method1252(this.anIntArray31);
		} else {
			local147.anIntArray26 = this.anIntArray26;
			local147.anIntArray29 = new int[local147.anInt274];
			local147.anIntArray31 = this.anIntArray31;
		}
		@Pc(326) int local326;
		@Pc(334) int local334;
		@Pc(341) int local341;
		@Pc(345) int local345;
		@Pc(349) int local349;
		@Pc(353) int local353;
		@Pc(357) int local357;
		@Pc(379) int local379;
		@Pc(405) int local405;
		@Pc(417) int local417;
		if (arg0 == 1) {
			for (local326 = 0; local326 < local147.anInt274; local326++) {
				local334 = this.anIntArray26[local326] + arg4;
				local341 = this.anIntArray31[local326] + arg6;
				local345 = local334 & 0x7F;
				local349 = local341 & 0x7F;
				local353 = local334 >> 7;
				local357 = local341 >> 7;
				local379 = arg2[local353][local357] * (128 - local345) + arg2[local353 + 1][local357] * local345 >> 7;
				local405 = arg2[local353][local357 + 1] * (128 - local345) + arg2[local353 + 1][local357 + 1] * local345 >> 7;
				local417 = local379 * (128 - local349) + local405 * local349 >> 7;
				local147.anIntArray29[local326] = this.anIntArray29[local326] + local417 - arg5;
			}
		} else {
			@Pc(544) int local544;
			if (arg0 == 2) {
				for (local326 = 0; local326 < local147.anInt274; local326++) {
					local334 = (this.anIntArray29[local326] << 16) / this.aShort8;
					if (local334 < arg1) {
						local341 = this.anIntArray26[local326] + arg4;
						local345 = this.anIntArray31[local326] + arg6;
						local349 = local341 & 0x7F;
						local353 = local345 & 0x7F;
						local357 = local341 >> 7;
						local379 = local345 >> 7;
						local405 = arg2[local357][local379] * (128 - local349) + arg2[local357 + 1][local379] * local349 >> 7;
						local417 = arg2[local357][local379 + 1] * (128 - local349) + arg2[local357 + 1][local379 + 1] * local349 >> 7;
						local544 = local405 * (128 - local353) + local417 * local353 >> 7;
						local147.anIntArray29[local326] = this.anIntArray29[local326] + (local544 - arg5) * (arg1 - local334) / arg1;
					} else {
						local147.anIntArray29[local326] = this.anIntArray29[local326];
					}
				}
			} else if (arg0 == 3) {
				local326 = (arg1 & 0xFF) * 4;
				local334 = (arg1 >> 8 & 0xFF) * 4;
				this.method279(arg2, arg4, arg5, arg6, local326, local334);
			} else if (arg0 == 4) {
				local326 = this.aShort5 - this.aShort8;
				for (local334 = 0; local334 < this.anInt274; local334++) {
					local341 = this.anIntArray26[local334] + arg4;
					local345 = this.anIntArray31[local334] + arg6;
					local349 = local341 & 0x7F;
					local353 = local345 & 0x7F;
					local357 = local341 >> 7;
					local379 = local345 >> 7;
					local405 = arg3[local357][local379] * (128 - local349) + arg3[local357 + 1][local379] * local349 >> 7;
					local417 = arg3[local357][local379 + 1] * (128 - local349) + arg3[local357 + 1][local379 + 1] * local349 >> 7;
					local544 = local405 * (128 - local353) + local417 * local353 >> 7;
					local147.anIntArray29[local334] = this.anIntArray29[local334] + local544 + local326 - arg5;
				}
			} else if (arg0 == 5) {
				local326 = this.aShort5 - this.aShort8;
				for (local334 = 0; local334 < this.anInt274; local334++) {
					local341 = this.anIntArray26[local334] + arg4;
					local345 = this.anIntArray31[local334] + arg6;
					local349 = local341 & 0x7F;
					local353 = local345 & 0x7F;
					local357 = local341 >> 7;
					local379 = local345 >> 7;
					local405 = arg2[local357][local379] * (128 - local349) + arg2[local357 + 1][local379] * local349 >> 7;
					local417 = arg2[local357][local379 + 1] * (128 - local349) + arg2[local357 + 1][local379 + 1] * local349 >> 7;
					local544 = local405 * (128 - local353) + local417 * local353 >> 7;
					local405 = arg3[local357][local379] * (128 - local349) + arg3[local357 + 1][local379] * local349 >> 7;
					local417 = arg3[local357][local379 + 1] * (128 - local349) + arg3[local357 + 1][local379 + 1] * local349 >> 7;
					@Pc(887) int local887 = local405 * (128 - local353) + local417 * local353 >> 7;
					@Pc(891) int local891 = local544 - local887;
					local147.anIntArray29[local334] = ((this.anIntArray29[local334] << 8) / local326 * local891 >> 8) - (arg5 - local544);
				}
			}
		}
		this.aBoolean26 = false;
		return local147;
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "()Z")
	@Override
	public boolean method2302() {
		return true;
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)V")
	public void method287() {
		@Pc(3) int local3 = Static9.anIntArray28[256];
		@Pc(7) int local7 = Static9.anIntArray23[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt274; local9++) {
			@Pc(26) int local26 = this.anIntArray31[local9] * local3 + this.anIntArray26[local9] * local7 >> 16;
			this.anIntArray31[local9] = this.anIntArray31[local9] * local7 - this.anIntArray26[local9] * local3 >> 16;
			this.anIntArray26[local9] = local26;
		}
		this.method293();
	}

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "()V")
	public void method288() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt274; local1++) {
			this.anIntArray26[local1] = -this.anIntArray26[local1];
			this.anIntArray31[local1] = -this.anIntArray31[local1];
		}
		this.method293();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIBSB)I")
	public int method289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) short arg3, @OriginalArg(5) byte arg4) {
		this.anIntArray27[this.anInt273] = arg0;
		this.anIntArray22[this.anInt273] = arg1;
		this.anIntArray25[this.anInt273] = arg2;
		this.aByteArray9[this.anInt273] = 1;
		this.aByteArray10[this.anInt273] = -1;
		this.aShortArray4[this.anInt273] = arg3;
		this.aShortArray5[this.anInt273] = -1;
		this.aByteArray2[this.anInt273] = arg4;
		return this.anInt273++;
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "([B)V")
	private void method290(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class1_Sub26 local4 = new Class1_Sub26(arg0);
		@Pc(9) Class1_Sub26 local9 = new Class1_Sub26(arg0);
		@Pc(14) Class1_Sub26 local14 = new Class1_Sub26(arg0);
		@Pc(19) Class1_Sub26 local19 = new Class1_Sub26(arg0);
		@Pc(24) Class1_Sub26 local24 = new Class1_Sub26(arg0);
		@Pc(29) Class1_Sub26 local29 = new Class1_Sub26(arg0);
		@Pc(34) Class1_Sub26 local34 = new Class1_Sub26(arg0);
		local4.anInt4021 = arg0.length - 23;
		@Pc(44) int local44 = local4.method2964();
		@Pc(48) int local48 = local4.method2964();
		@Pc(52) int local52 = local4.method2945();
		@Pc(56) int local56 = local4.method2945();
		@Pc(60) int local60 = local4.method2945();
		@Pc(64) int local64 = local4.method2945();
		@Pc(68) int local68 = local4.method2945();
		@Pc(72) int local72 = local4.method2945();
		@Pc(76) int local76 = local4.method2945();
		@Pc(80) int local80 = local4.method2964();
		@Pc(84) int local84 = local4.method2964();
		@Pc(88) int local88 = local4.method2964();
		@Pc(92) int local92 = local4.method2964();
		@Pc(96) int local96 = local4.method2964();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray6 = new byte[local52];
			local4.anInt4021 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray6[local113] = local4.method2992();
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
		this.anInt274 = local44;
		this.anInt273 = local48;
		this.anInt272 = local52;
		this.anIntArray26 = new int[local44];
		this.anIntArray29 = new int[local44];
		this.anIntArray31 = new int[local44];
		this.anIntArray27 = new int[local48];
		this.anIntArray22 = new int[local48];
		this.anIntArray25 = new int[local48];
		if (local76 == 1) {
			this.anIntArray30 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray9 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray4 = new byte[local48];
		} else {
			this.aByte1 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray2 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray24 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray5 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray10 = new byte[local48];
		}
		this.aShortArray4 = new short[local48];
		if (local52 > 0) {
			this.aShortArray2 = new short[local52];
			this.aShortArray8 = new short[local52];
			this.aShortArray3 = new short[local52];
			if (local100 > 0) {
				this.aShortArray7 = new short[local100];
				this.aShortArray1 = new short[local100];
				this.aShortArray6 = new short[local100];
				this.aByteArray5 = new byte[local100];
				this.aByteArray8 = new byte[local100];
				this.aByteArray11 = new byte[local100];
			}
			if (local102 > 0) {
				this.aByteArray7 = new byte[local102];
				this.aByteArray3 = new byte[local102];
			}
		}
		local4.anInt4021 = local52;
		local9.anInt4021 = local233;
		local14.anInt4021 = local239;
		local19.anInt4021 = local245;
		local24.anInt4021 = local184;
		@Pc(455) int local455 = 0;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(466) int local466;
		@Pc(468) int local468;
		@Pc(478) int local478;
		@Pc(488) int local488;
		for (@Pc(461) int local461 = 0; local461 < local44; local461++) {
			local466 = local4.method2945();
			local468 = 0;
			if ((local466 & 0x1) != 0) {
				local468 = local9.method2965();
			}
			local478 = 0;
			if ((local466 & 0x2) != 0) {
				local478 = local14.method2965();
			}
			local488 = 0;
			if ((local466 & 0x4) != 0) {
				local488 = local19.method2965();
			}
			this.anIntArray26[local461] = local455 + local468;
			this.anIntArray29[local461] = local457 + local478;
			this.anIntArray31[local461] = local459 + local488;
			local455 = this.anIntArray26[local461];
			local457 = this.anIntArray29[local461];
			local459 = this.anIntArray31[local461];
			if (local76 == 1) {
				this.anIntArray30[local461] = local24.method2945();
			}
		}
		local4.anInt4021 = local225;
		local9.anInt4021 = local151;
		local14.anInt4021 = local166;
		local19.anInt4021 = local193;
		local24.anInt4021 = local175;
		local29.anInt4021 = local208;
		local34.anInt4021 = local219;
		for (local466 = 0; local466 < local48; local466++) {
			this.aShortArray4[local466] = (short) local4.method2964();
			if (local56 == 1) {
				this.aByteArray9[local466] = local9.method2992();
			}
			if (local60 == 255) {
				this.aByteArray4[local466] = local14.method2992();
			}
			if (local64 == 1) {
				this.aByteArray2[local466] = local19.method2992();
			}
			if (local68 == 1) {
				this.anIntArray24[local466] = local24.method2945();
			}
			if (local72 == 1) {
				this.aShortArray5[local466] = (short) (local29.method2964() - 1);
			}
			if (this.aByteArray10 != null) {
				if (this.aShortArray5[local466] == -1) {
					this.aByteArray10[local466] = -1;
				} else {
					this.aByteArray10[local466] = (byte) (local34.method2945() - 1);
				}
			}
		}
		local4.anInt4021 = local202;
		local9.anInt4021 = local160;
		local468 = 0;
		local478 = 0;
		local488 = 0;
		@Pc(674) int local674 = 0;
		@Pc(681) int local681;
		@Pc(784) int local784;
		for (@Pc(676) int local676 = 0; local676 < local48; local676++) {
			local681 = local9.method2945();
			if (local681 == 1) {
				local468 = local4.method2965() + local674;
				local478 = local4.method2965() + local468;
				local488 = local4.method2965() + local478;
				local674 = local488;
				this.anIntArray27[local676] = local468;
				this.anIntArray22[local676] = local478;
				this.anIntArray25[local676] = local488;
			}
			if (local681 == 2) {
				local478 = local488;
				local488 = local4.method2965() + local674;
				local674 = local488;
				this.anIntArray27[local676] = local468;
				this.anIntArray22[local676] = local478;
				this.anIntArray25[local676] = local488;
			}
			if (local681 == 3) {
				local468 = local488;
				local488 = local4.method2965() + local674;
				local674 = local488;
				this.anIntArray27[local676] = local468;
				this.anIntArray22[local676] = local478;
				this.anIntArray25[local676] = local488;
			}
			if (local681 == 4) {
				local784 = local468;
				local468 = local478;
				local478 = local784;
				local488 = local4.method2965() + local674;
				local674 = local488;
				this.anIntArray27[local676] = local468;
				this.anIntArray22[local676] = local784;
				this.anIntArray25[local676] = local488;
			}
		}
		local4.anInt4021 = local251;
		local9.anInt4021 = local259;
		local14.anInt4021 = local267;
		local19.anInt4021 = local275;
		local24.anInt4021 = local281;
		local29.anInt4021 = local113;
		for (local681 = 0; local681 < local52; local681++) {
			local784 = this.aByteArray6[local681] & 0xFF;
			if (local784 == 0) {
				this.aShortArray2[local681] = (short) local4.method2964();
				this.aShortArray8[local681] = (short) local4.method2964();
				this.aShortArray3[local681] = (short) local4.method2964();
			}
			if (local784 == 1) {
				this.aShortArray2[local681] = (short) local9.method2964();
				this.aShortArray8[local681] = (short) local9.method2964();
				this.aShortArray3[local681] = (short) local9.method2964();
				this.aShortArray7[local681] = (short) local14.method2964();
				this.aShortArray1[local681] = (short) local14.method2964();
				this.aShortArray6[local681] = (short) local14.method2964();
				this.aByteArray5[local681] = local19.method2992();
				this.aByteArray8[local681] = local24.method2992();
				this.aByteArray11[local681] = local29.method2992();
			}
			if (local784 == 2) {
				this.aShortArray2[local681] = (short) local9.method2964();
				this.aShortArray8[local681] = (short) local9.method2964();
				this.aShortArray3[local681] = (short) local9.method2964();
				this.aShortArray7[local681] = (short) local14.method2964();
				this.aShortArray1[local681] = (short) local14.method2964();
				this.aShortArray6[local681] = (short) local14.method2964();
				this.aByteArray5[local681] = local19.method2992();
				this.aByteArray8[local681] = local24.method2992();
				this.aByteArray11[local681] = local29.method2992();
				this.aByteArray7[local681] = local29.method2992();
				this.aByteArray3[local681] = local29.method2992();
			}
			if (local784 == 3) {
				this.aShortArray2[local681] = (short) local9.method2964();
				this.aShortArray8[local681] = (short) local9.method2964();
				this.aShortArray3[local681] = (short) local9.method2964();
				this.aShortArray7[local681] = (short) local14.method2964();
				this.aShortArray1[local681] = (short) local14.method2964();
				this.aShortArray6[local681] = (short) local14.method2964();
				this.aByteArray5[local681] = local19.method2992();
				this.aByteArray8[local681] = local24.method2992();
				this.aByteArray11[local681] = local29.method2992();
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(IIIII)Lclient!ce;")
	public Class5_Sub3_Sub1 method291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class5_Sub3_Sub1(this, arg0, arg1, -50, -10, -50);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)Lclient!af;")
	@Override
	public Class5 method2292() {
		return this.method274(this.aShort2, this.aShort3, -50, -10, -50);
	}

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "(III)V")
	public void method292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5;
		@Pc(9) int local9;
		@Pc(11) int local11;
		@Pc(28) int local28;
		if (arg2 != 0) {
			local5 = Static9.anIntArray28[arg2];
			local9 = Static9.anIntArray23[arg2];
			for (local11 = 0; local11 < this.anInt274; local11++) {
				local28 = this.anIntArray29[local11] * local5 + this.anIntArray26[local11] * local9 >> 16;
				this.anIntArray29[local11] = this.anIntArray29[local11] * local9 - this.anIntArray26[local11] * local5 >> 16;
				this.anIntArray26[local11] = local28;
			}
		}
		if (arg0 != 0) {
			local5 = Static9.anIntArray28[arg0];
			local9 = Static9.anIntArray23[arg0];
			for (local11 = 0; local11 < this.anInt274; local11++) {
				local28 = this.anIntArray29[local11] * local9 - this.anIntArray31[local11] * local5 >> 16;
				this.anIntArray31[local11] = this.anIntArray29[local11] * local5 + this.anIntArray31[local11] * local9 >> 16;
				this.anIntArray29[local11] = local28;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local5 = Static9.anIntArray28[arg1];
		local9 = Static9.anIntArray23[arg1];
		for (local11 = 0; local11 < this.anInt274; local11++) {
			local28 = this.anIntArray31[local11] * local5 + this.anIntArray26[local11] * local9 >> 16;
			this.anIntArray31[local11] = this.anIntArray31[local11] * local9 - this.anIntArray26[local11] * local5 >> 16;
			this.anIntArray26[local11] = local28;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "()I")
	@Override
	public int method2297() {
		if (!this.aBoolean26) {
			this.method283();
		}
		return this.aShort8;
	}

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "()V")
	private void method293() {
		this.aClass106Array2 = null;
		this.aClass106Array1 = null;
		this.aClass36Array1 = null;
		this.aBoolean26 = false;
	}

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "()V")
	public void method294() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt274; local1++) {
			@Pc(7) int local7 = this.anIntArray26[local1];
			this.anIntArray26[local1] = this.anIntArray31[local1];
			this.anIntArray31[local1] = -local7;
		}
		this.method293();
	}

	@OriginalMember(owner = "client!ai", name = "m", descriptor = "()V")
	public void method296() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt274; local1++) {
			@Pc(7) int local7 = this.anIntArray31[local1];
			this.anIntArray31[local1] = this.anIntArray26[local1];
			this.anIntArray26[local1] = -local7;
		}
		this.method293();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!ai;I)I")
	private int method297(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray26[arg1];
		@Pc(11) int local11 = arg0.anIntArray29[arg1];
		@Pc(16) int local16 = arg0.anIntArray31[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt274; local18++) {
			if (local6 == this.anIntArray26[local18] && local11 == this.anIntArray29[local18] && local16 == this.anIntArray31[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray26[this.anInt274] = local6;
			this.anIntArray29[this.anInt274] = local11;
			this.anIntArray31[this.anInt274] = local16;
			if (arg0.anIntArray30 != null) {
				this.anIntArray30[this.anInt274] = arg0.anIntArray30[arg1];
			}
			local1 = this.anInt274++;
		}
		return local1;
	}
}
