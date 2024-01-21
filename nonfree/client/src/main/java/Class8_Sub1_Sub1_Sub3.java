import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class8_Sub1_Sub1_Sub3 extends Class8_Sub1_Sub1 {

	@OriginalMember(owner = "client!df", name = "gb", descriptor = "I")
	public int anInt782;

	@OriginalMember(owner = "client!df", name = "hb", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!df", name = "ib", descriptor = "[I")
	public int[] anIntArray92;

	@OriginalMember(owner = "client!df", name = "jb", descriptor = "[I")
	private int[] anIntArray93;

	@OriginalMember(owner = "client!df", name = "kb", descriptor = "[I")
	public int[] anIntArray94;

	@OriginalMember(owner = "client!df", name = "mb", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!df", name = "nb", descriptor = "[I")
	public int[] anIntArray96;

	@OriginalMember(owner = "client!df", name = "ob", descriptor = "S")
	public short aShort1;

	@OriginalMember(owner = "client!df", name = "pb", descriptor = "[B")
	private byte[] aByteArray6;

	@OriginalMember(owner = "client!df", name = "qb", descriptor = "[B")
	private byte[] aByteArray7;

	@OriginalMember(owner = "client!df", name = "rb", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!df", name = "sb", descriptor = "I")
	public int anInt783;

	@OriginalMember(owner = "client!df", name = "tb", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!df", name = "vb", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!df", name = "wb", descriptor = "[I")
	public int[] anIntArray98;

	@OriginalMember(owner = "client!df", name = "xb", descriptor = "[Lclient!ob;")
	public Class56[] aClass56Array1;

	@OriginalMember(owner = "client!df", name = "yb", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!df", name = "zb", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!df", name = "Bb", descriptor = "I")
	public int anInt784;

	@OriginalMember(owner = "client!df", name = "Db", descriptor = "[B")
	private byte[] aByteArray9;

	@OriginalMember(owner = "client!df", name = "Eb", descriptor = "[Lclient!kf;")
	private Class44[] aClass44Array1;

	@OriginalMember(owner = "client!df", name = "Gb", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!df", name = "Hb", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!df", name = "Jb", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!df", name = "Kb", descriptor = "I")
	private int anInt786;

	@OriginalMember(owner = "client!df", name = "Lb", descriptor = "[I")
	public int[] anIntArray101;

	@OriginalMember(owner = "client!df", name = "Mb", descriptor = "[I")
	private int[] anIntArray102;

	@OriginalMember(owner = "client!df", name = "Nb", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!df", name = "Pb", descriptor = "[Lclient!ob;")
	public Class56[] aClass56Array2;

	@OriginalMember(owner = "client!df", name = "Qb", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!df", name = "Rb", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!df", name = "Sb", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!df", name = "Tb", descriptor = "I")
	public int anInt788;

	@OriginalMember(owner = "client!df", name = "Ub", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!df", name = "Wb", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!df", name = "Xb", descriptor = "I")
	public int anInt789;

	@OriginalMember(owner = "client!df", name = "Zb", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!df", name = "ac", descriptor = "[I")
	public int[] anIntArray103;

	@OriginalMember(owner = "client!df", name = "Ab", descriptor = "Z")
	private boolean aBoolean38 = false;

	@OriginalMember(owner = "client!df", name = "Fb", descriptor = "I")
	public int anInt785 = 0;

	@OriginalMember(owner = "client!df", name = "Vb", descriptor = "B")
	private byte aByte1 = 0;

	@OriginalMember(owner = "client!df", name = "Ob", descriptor = "I")
	public int anInt787 = 0;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
	private Class8_Sub1_Sub1_Sub3() {
	}

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "([B)V")
	public Class8_Sub1_Sub1_Sub3(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method480(arg0);
		} else {
			this.method487(arg0);
		}
	}

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "([Lclient!df;I)V")
	public Class8_Sub1_Sub1_Sub3(@OriginalArg(0) Class8_Sub1_Sub1_Sub3[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt787 = 0;
		this.anInt785 = 0;
		this.anInt786 = 0;
		this.aByte1 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class8_Sub1_Sub1_Sub3 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt787 += local44.anInt787;
				this.anInt785 += local44.anInt785;
				this.anInt786 += local44.anInt786;
				if (local44.aByteArray10 == null) {
					if (this.aByte1 == -1) {
						this.aByte1 = local44.aByte1;
					}
					if (this.aByte1 != local44.aByte1) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray5 != null;
				local19 |= local44.aByteArray8 != null;
				local21 |= local44.anIntArray93 != null;
				local23 |= local44.aShortArray21 != null;
				local25 |= local44.aByteArray9 != null;
			}
		}
		this.anIntArray96 = new int[this.anInt787];
		this.anIntArray103 = new int[this.anInt787];
		this.anIntArray94 = new int[this.anInt787];
		this.anIntArray102 = new int[this.anInt787];
		this.anIntArray98 = new int[this.anInt785];
		this.anIntArray92 = new int[this.anInt785];
		this.anIntArray101 = new int[this.anInt785];
		if (local15) {
			this.aByteArray5 = new byte[this.anInt785];
		}
		if (local17) {
			this.aByteArray10 = new byte[this.anInt785];
		}
		if (local19) {
			this.aByteArray8 = new byte[this.anInt785];
		}
		if (local21) {
			this.anIntArray93 = new int[this.anInt785];
		}
		if (local23) {
			this.aShortArray21 = new short[this.anInt785];
		}
		if (local25) {
			this.aByteArray9 = new byte[this.anInt785];
		}
		this.aShortArray11 = new short[this.anInt785];
		if (this.anInt786 > 0) {
			this.aByteArray6 = new byte[this.anInt786];
			this.aShortArray12 = new short[this.anInt786];
			this.aShortArray16 = new short[this.anInt786];
			this.aShortArray13 = new short[this.anInt786];
			this.aShortArray18 = new short[this.anInt786];
			this.aShortArray19 = new short[this.anInt786];
			this.aShortArray15 = new short[this.anInt786];
			this.aShortArray14 = new short[this.anInt786];
			this.aByteArray7 = new byte[this.anInt786];
			this.aShortArray17 = new short[this.anInt786];
			this.aShortArray20 = new short[this.anInt786];
		}
		this.anInt787 = 0;
		this.anInt785 = 0;
		this.anInt786 = 0;
		for (@Pc(288) int local288 = 0; local288 < arg1; local288++) {
			@Pc(293) Class8_Sub1_Sub1_Sub3 local293 = arg0[local288];
			if (local293 != null) {
				for (@Pc(297) int local297 = 0; local297 < local293.anInt785; local297++) {
					if (local15 && local293.aByteArray5 != null) {
						this.aByteArray5[this.anInt785] = local293.aByteArray5[local297];
					}
					if (local17) {
						if (local293.aByteArray10 == null) {
							this.aByteArray10[this.anInt785] = local293.aByte1;
						} else {
							this.aByteArray10[this.anInt785] = local293.aByteArray10[local297];
						}
					}
					if (local19 && local293.aByteArray8 != null) {
						this.aByteArray8[this.anInt785] = local293.aByteArray8[local297];
					}
					if (local21 && local293.anIntArray93 != null) {
						this.anIntArray93[this.anInt785] = local293.anIntArray93[local297];
					}
					if (local23) {
						if (local293.aShortArray21 == null) {
							this.aShortArray21[this.anInt785] = -1;
						} else {
							this.aShortArray21[this.anInt785] = local293.aShortArray21[local297];
						}
					}
					if (local25) {
						if (local293.aByteArray9 == null || local293.aByteArray9[local297] == -1) {
							this.aByteArray9[this.anInt785] = -1;
						} else {
							this.aByteArray9[this.anInt785] = (byte) (local293.aByteArray9[local297] + this.anInt786);
						}
					}
					this.aShortArray11[this.anInt785] = local293.aShortArray11[local297];
					this.anIntArray98[this.anInt785] = this.method471(local293, local293.anIntArray98[local297]);
					this.anIntArray92[this.anInt785] = this.method471(local293, local293.anIntArray92[local297]);
					this.anIntArray101[this.anInt785] = this.method471(local293, local293.anIntArray101[local297]);
					this.anInt785++;
				}
				for (@Pc(472) int local472 = 0; local472 < local293.anInt786; local472++) {
					@Pc(484) byte local484 = this.aByteArray6[this.anInt786] = local293.aByteArray6[local472];
					if (local484 == 0) {
						this.aShortArray12[this.anInt786] = (short) this.method471(local293, local293.aShortArray12[local472]);
						this.aShortArray16[this.anInt786] = (short) this.method471(local293, local293.aShortArray16[local472]);
						this.aShortArray13[this.anInt786] = (short) this.method471(local293, local293.aShortArray13[local472]);
					}
					if (local484 >= 1 && local484 <= 3) {
						this.aShortArray12[this.anInt786] = local293.aShortArray12[local472];
						this.aShortArray16[this.anInt786] = local293.aShortArray16[local472];
						this.aShortArray13[this.anInt786] = local293.aShortArray13[local472];
						this.aShortArray18[this.anInt786] = local293.aShortArray18[local472];
						this.aShortArray19[this.anInt786] = local293.aShortArray19[local472];
						this.aShortArray15[this.anInt786] = local293.aShortArray15[local472];
						this.aShortArray14[this.anInt786] = local293.aShortArray14[local472];
						this.aByteArray7[this.anInt786] = local293.aByteArray7[local472];
						this.aShortArray17[this.anInt786] = local293.aShortArray17[local472];
					}
					if (local484 == 2) {
						this.aShortArray20[this.anInt786] = local293.aShortArray20[local472];
					}
					this.anInt786++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!df;ZZZZ)V")
	public Class8_Sub1_Sub1_Sub3(@OriginalArg(0) Class8_Sub1_Sub1_Sub3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt787 = arg0.anInt787;
		this.anInt785 = arg0.anInt785;
		this.anInt786 = arg0.anInt786;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray96 = arg0.anIntArray96;
			this.anIntArray103 = arg0.anIntArray103;
			this.anIntArray94 = arg0.anIntArray94;
		} else {
			this.anIntArray96 = new int[this.anInt787];
			this.anIntArray103 = new int[this.anInt787];
			this.anIntArray94 = new int[this.anInt787];
			for (local57 = 0; local57 < this.anInt787; local57++) {
				this.anIntArray96[local57] = arg0.anIntArray96[local57];
				this.anIntArray103[local57] = arg0.anIntArray103[local57];
				this.anIntArray94[local57] = arg0.anIntArray94[local57];
			}
		}
		if (arg2) {
			this.aShortArray11 = arg0.aShortArray11;
		} else {
			this.aShortArray11 = new short[this.anInt785];
			for (local57 = 0; local57 < this.anInt785; local57++) {
				this.aShortArray11[local57] = arg0.aShortArray11[local57];
			}
		}
		if (arg3 || arg0.aShortArray21 == null) {
			this.aShortArray21 = arg0.aShortArray21;
		} else {
			this.aShortArray21 = new short[this.anInt785];
			for (local57 = 0; local57 < this.anInt785; local57++) {
				this.aShortArray21[local57] = arg0.aShortArray21[local57];
			}
		}
		this.aByteArray8 = arg0.aByteArray8;
		this.anIntArray98 = arg0.anIntArray98;
		this.anIntArray92 = arg0.anIntArray92;
		this.anIntArray101 = arg0.anIntArray101;
		this.aByteArray5 = arg0.aByteArray5;
		this.aByteArray10 = arg0.aByteArray10;
		this.aByteArray9 = arg0.aByteArray9;
		this.aByte1 = arg0.aByte1;
		this.aByteArray6 = arg0.aByteArray6;
		this.aShortArray12 = arg0.aShortArray12;
		this.aShortArray16 = arg0.aShortArray16;
		this.aShortArray13 = arg0.aShortArray13;
		this.aShortArray18 = arg0.aShortArray18;
		this.aShortArray19 = arg0.aShortArray19;
		this.aShortArray15 = arg0.aShortArray15;
		this.aShortArray14 = arg0.aShortArray14;
		this.aByteArray7 = arg0.aByteArray7;
		this.aShortArray17 = arg0.aShortArray17;
		this.aShortArray20 = arg0.aShortArray20;
		this.anIntArray102 = arg0.anIntArray102;
		this.anIntArray93 = arg0.anIntArray93;
		this.anIntArrayArray6 = arg0.anIntArrayArray6;
		this.anIntArrayArray5 = arg0.anIntArrayArray5;
		this.aClass56Array1 = arg0.aClass56Array1;
		this.aClass44Array1 = arg0.aClass44Array1;
		this.aClass56Array2 = arg0.aClass56Array2;
		this.aShort1 = arg0.aShort1;
		this.aShort2 = arg0.aShort2;
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
	public void method470() {
		@Pc(3) int local3 = Static26.anIntArray100[256];
		@Pc(7) int local7 = Static26.anIntArray97[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt787; local9++) {
			@Pc(26) int local26 = this.anIntArray94[local9] * local3 + this.anIntArray96[local9] * local7 >> 16;
			this.anIntArray94[local9] = this.anIntArray94[local9] * local7 - this.anIntArray96[local9] * local3 >> 16;
			this.anIntArray96[local9] = local26;
		}
		this.method473();
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!df;I)I")
	private int method471(@OriginalArg(0) Class8_Sub1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray96[arg1];
		@Pc(11) int local11 = arg0.anIntArray103[arg1];
		@Pc(16) int local16 = arg0.anIntArray94[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt787; local18++) {
			if (local6 == this.anIntArray96[local18] && local11 == this.anIntArray103[local18] && local16 == this.anIntArray94[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray96[this.anInt787] = local6;
			this.anIntArray103[this.anInt787] = local11;
			this.anIntArray94[this.anInt787] = local16;
			if (arg0.anIntArray102 != null) {
				this.anIntArray102[this.anInt787] = arg0.anIntArray102[arg1];
			}
			local1 = this.anInt787++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "()V")
	private void method473() {
		this.aClass56Array1 = null;
		this.aClass56Array2 = null;
		this.aClass44Array1 = null;
		this.aBoolean38 = false;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "()V")
	public void method474() {
		if (this.aBoolean38) {
			return;
		}
		super.anInt2957 = 0;
		this.anInt789 = 0;
		this.anInt784 = 999999;
		this.anInt783 = -999999;
		this.anInt788 = -99999;
		this.anInt782 = 99999;
		for (@Pc(23) int local23 = 0; local23 < this.anInt787; local23++) {
			@Pc(29) int local29 = this.anIntArray96[local23];
			@Pc(34) int local34 = this.anIntArray103[local23];
			@Pc(39) int local39 = this.anIntArray94[local23];
			if (local29 < this.anInt784) {
				this.anInt784 = local29;
			}
			if (local29 > this.anInt783) {
				this.anInt783 = local29;
			}
			if (local39 < this.anInt782) {
				this.anInt782 = local39;
			}
			if (local39 > this.anInt788) {
				this.anInt788 = local39;
			}
			if (-local34 > super.anInt2957) {
				super.anInt2957 = -local34;
			}
			if (local34 > this.anInt789) {
				this.anInt789 = local34;
			}
		}
		this.aBoolean38 = true;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "([[IIIIZI)Lclient!df;")
	public Class8_Sub1_Sub1_Sub3 method475(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method474();
		@Pc(6) int local6 = arg1 + this.anInt784;
		@Pc(11) int local11 = arg1 + this.anInt783;
		@Pc(16) int local16 = arg3 + this.anInt782;
		@Pc(21) int local21 = arg3 + this.anInt788;
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
		@Pc(101) Class8_Sub1_Sub1_Sub3 local101 = new Class8_Sub1_Sub1_Sub3();
		local101.anInt787 = this.anInt787;
		local101.anInt785 = this.anInt785;
		local101.anInt786 = this.anInt786;
		local101.anIntArray96 = this.anIntArray96;
		local101.anIntArray94 = this.anIntArray94;
		local101.anIntArray98 = this.anIntArray98;
		local101.anIntArray92 = this.anIntArray92;
		local101.anIntArray101 = this.anIntArray101;
		local101.aByteArray5 = this.aByteArray5;
		local101.aByteArray10 = this.aByteArray10;
		local101.aByteArray8 = this.aByteArray8;
		local101.aByteArray9 = this.aByteArray9;
		local101.aShortArray11 = this.aShortArray11;
		local101.aShortArray21 = this.aShortArray21;
		local101.aByte1 = this.aByte1;
		local101.aByteArray6 = this.aByteArray6;
		local101.aShortArray12 = this.aShortArray12;
		local101.aShortArray16 = this.aShortArray16;
		local101.aShortArray13 = this.aShortArray13;
		local101.aShortArray18 = this.aShortArray18;
		local101.aShortArray19 = this.aShortArray19;
		local101.aShortArray15 = this.aShortArray15;
		local101.aShortArray14 = this.aShortArray14;
		local101.aByteArray7 = this.aByteArray7;
		local101.aShortArray17 = this.aShortArray17;
		local101.aShortArray20 = this.aShortArray20;
		local101.anIntArray102 = this.anIntArray102;
		local101.anIntArray93 = this.anIntArray93;
		local101.anIntArrayArray6 = this.anIntArrayArray6;
		local101.anIntArrayArray5 = this.anIntArrayArray5;
		local101.aShort1 = this.aShort1;
		local101.aShort2 = this.aShort2;
		local101.anIntArray103 = new int[local101.anInt787];
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
			for (local241 = 0; local241 < local101.anInt787; local241++) {
				local249 = this.anIntArray96[local241] + arg1;
				local256 = this.anIntArray94[local241] + arg3;
				local260 = local249 & 0x7F;
				local264 = local256 & 0x7F;
				local268 = local249 >> 7;
				local272 = local256 >> 7;
				local294 = arg0[local268][local272] * (128 - local260) + arg0[local268 + 1][local272] * local260 >> 7;
				local320 = arg0[local268][local272 + 1] * (128 - local260) + arg0[local268 + 1][local272 + 1] * local260 >> 7;
				local332 = local294 * (128 - local264) + local320 * local264 >> 7;
				local101.anIntArray103[local241] = this.anIntArray103[local241] + local332 - arg2;
			}
		} else {
			for (local241 = 0; local241 < local101.anInt787; local241++) {
				local249 = (-this.anIntArray103[local241] << 16) / super.anInt2957;
				if (local249 < arg4) {
					local256 = this.anIntArray96[local241] + arg1;
					local260 = this.anIntArray94[local241] + arg3;
					local264 = local256 & 0x7F;
					local268 = local260 & 0x7F;
					local272 = local256 >> 7;
					local294 = local260 >> 7;
					local320 = arg0[local272][local294] * (128 - local264) + arg0[local272 + 1][local294] * local264 >> 7;
					local332 = arg0[local272][local294 + 1] * (128 - local264) + arg0[local272 + 1][local294 + 1] * local264 >> 7;
					@Pc(457) int local457 = local320 * (128 - local268) + local332 * local268 >> 7;
					local101.anIntArray103[local241] = this.anIntArray103[local241] + (local457 - arg2) * (arg4 - local249) / arg4;
				}
			}
		}
		local101.method473();
		return local101;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V")
	public void method476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt787; local1++) {
			this.anIntArray96[local1] += arg0;
			this.anIntArray103[local1] += arg1;
			this.anIntArray94[local1] += arg2;
		}
		this.method473();
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "()V")
	public void method477() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt787; local1++) {
			this.anIntArray94[local1] = -this.anIntArray94[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt785; local18++) {
			@Pc(24) int local24 = this.anIntArray98[local18];
			this.anIntArray98[local18] = this.anIntArray101[local18];
			this.anIntArray101[local18] = local24;
		}
		this.method473();
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "()V")
	public void method478() {
		if (this.aClass56Array1 != null) {
			return;
		}
		this.aClass56Array1 = new Class56[this.anInt787];
		for (@Pc(10) int local10 = 0; local10 < this.anInt787; local10++) {
			this.aClass56Array1[local10] = new Class56();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt785; local25++) {
			@Pc(31) int local31 = this.anIntArray98[local25];
			@Pc(36) int local36 = this.anIntArray92[local25];
			@Pc(41) int local41 = this.anIntArray101[local25];
			@Pc(51) int local51 = this.anIntArray96[local36] - this.anIntArray96[local31];
			@Pc(61) int local61 = this.anIntArray103[local36] - this.anIntArray103[local31];
			@Pc(71) int local71 = this.anIntArray94[local36] - this.anIntArray94[local31];
			@Pc(81) int local81 = this.anIntArray96[local41] - this.anIntArray96[local31];
			@Pc(91) int local91 = this.anIntArray103[local41] - this.anIntArray103[local31];
			@Pc(101) int local101 = this.anIntArray94[local41] - this.anIntArray94[local31];
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
			if (this.aByteArray5 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray5[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class56 local211 = this.aClass56Array1[local31];
				local211.anInt2202 += local109;
				local211.anInt2199 += local117;
				local211.anInt2197 += local125;
				local211.anInt2201++;
				@Pc(240) Class56 local240 = this.aClass56Array1[local36];
				local240.anInt2202 += local109;
				local240.anInt2199 += local117;
				local240.anInt2197 += local125;
				local240.anInt2201++;
				@Pc(269) Class56 local269 = this.aClass56Array1[local41];
				local269.anInt2202 += local109;
				local269.anInt2199 += local117;
				local269.anInt2197 += local125;
				local269.anInt2201++;
			} else if (local198 == 1) {
				if (this.aClass44Array1 == null) {
					this.aClass44Array1 = new Class44[this.anInt785];
				}
				@Pc(314) Class44 local314 = this.aClass44Array1[local25] = new Class44();
				local314.anInt1672 = local109;
				local314.anInt1673 = local117;
				local314.anInt1677 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIII)Lclient!nb;")
	public Class8_Sub1_Sub1_Sub6 method479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method478();
		@Pc(16) int local16 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(22) int local22 = arg1 * local16 >> 8;
		@Pc(26) Class8_Sub1_Sub1_Sub6 local26 = new Class8_Sub1_Sub1_Sub6();
		local26.anIntArray283 = new int[this.anInt785];
		local26.anIntArray277 = new int[this.anInt785];
		local26.anIntArray279 = new int[this.anInt785];
		@Pc(51) int local51;
		if (this.aShortArray21 == null) {
			local26.aShortArray34 = null;
		} else {
			local26.aShortArray34 = new short[this.anInt785];
			for (local51 = 0; local51 < this.anInt785; local51++) {
				@Pc(57) short local57 = this.aShortArray21[local51];
				if (local57 != -1 && Static11.anInterface3_1.method619(local57)) {
					local26.aShortArray34[local51] = local57;
				} else {
					local26.aShortArray34[local51] = -1;
				}
			}
		}
		@Pc(228) int local228;
		if (this.anInt786 > 0 && this.aByteArray9 != null) {
			@Pc(95) int[] local95 = new int[this.anInt786];
			for (@Pc(97) int local97 = 0; local97 < this.anInt785; local97++) {
				if (this.aByteArray9[local97] != -1) {
					local95[this.aByteArray9[local97] & 0xFF]++;
				}
			}
			local26.anInt2146 = 0;
			for (@Pc(126) int local126 = 0; local126 < this.anInt786; local126++) {
				if (local95[local126] > 0 && this.aByteArray6[local126] == 0) {
					local26.anInt2146++;
				}
			}
			local26.anIntArray284 = new int[local26.anInt2146];
			local26.anIntArray274 = new int[local26.anInt2146];
			local26.anIntArray276 = new int[local26.anInt2146];
			@Pc(164) int local164 = 0;
			for (@Pc(166) int local166 = 0; local166 < this.anInt786; local166++) {
				if (local95[local166] > 0 && this.aByteArray6[local166] == 0) {
					local26.anIntArray284[local164] = this.aShortArray12[local166] & 0xFFFF;
					local26.anIntArray274[local164] = this.aShortArray16[local166] & 0xFFFF;
					local26.anIntArray276[local164] = this.aShortArray13[local166] & 0xFFFF;
					local95[local166] = local164++;
				} else {
					local95[local166] = -1;
				}
			}
			local26.aByteArray34 = new byte[this.anInt785];
			for (local228 = 0; local228 < this.anInt785; local228++) {
				if (this.aByteArray9[local228] == -1) {
					local26.aByteArray34[local228] = -1;
				} else {
					local26.aByteArray34[local228] = (byte) local95[this.aByteArray9[local228] & 0xFF];
					if (local26.aByteArray34[local228] == -1 && local26.aShortArray34 != null) {
						local26.aShortArray34[local228] = -1;
					}
				}
			}
		}
		for (local51 = 0; local51 < this.anInt785; local51++) {
			@Pc(281) byte local281;
			if (this.aByteArray5 == null) {
				local281 = 0;
			} else {
				local281 = this.aByteArray5[local51];
			}
			@Pc(292) byte local292;
			if (this.aByteArray8 == null) {
				local292 = 0;
			} else {
				local292 = this.aByteArray8[local51];
			}
			@Pc(303) short local303;
			if (local26.aShortArray34 == null) {
				local303 = -1;
			} else {
				local303 = local26.aShortArray34[local51];
			}
			if (local292 == -2) {
				local281 = 3;
			}
			if (local292 == -1) {
				local281 = 2;
			}
			@Pc(350) Class56 local350;
			@Pc(511) Class44 local511;
			if (local303 == -1) {
				if (local281 == 0) {
					@Pc(331) int local331 = this.aShortArray11[local51] & 0xFFFF;
					if (this.aClass56Array2 == null || this.aClass56Array2[this.anIntArray98[local51]] == null) {
						local350 = this.aClass56Array1[this.anIntArray98[local51]];
					} else {
						local350 = this.aClass56Array2[this.anIntArray98[local51]];
					}
					local228 = arg0 + (arg2 * local350.anInt2202 + arg3 * local350.anInt2199 + arg4 * local350.anInt2197) / (local22 * local350.anInt2201);
					local26.anIntArray283[local51] = Static26.method486(local331, local228);
					if (this.aClass56Array2 == null || this.aClass56Array2[this.anIntArray92[local51]] == null) {
						local350 = this.aClass56Array1[this.anIntArray92[local51]];
					} else {
						local350 = this.aClass56Array2[this.anIntArray92[local51]];
					}
					local228 = arg0 + (arg2 * local350.anInt2202 + arg3 * local350.anInt2199 + arg4 * local350.anInt2197) / (local22 * local350.anInt2201);
					local26.anIntArray277[local51] = Static26.method486(local331, local228);
					if (this.aClass56Array2 == null || this.aClass56Array2[this.anIntArray101[local51]] == null) {
						local350 = this.aClass56Array1[this.anIntArray101[local51]];
					} else {
						local350 = this.aClass56Array2[this.anIntArray101[local51]];
					}
					local228 = arg0 + (arg2 * local350.anInt2202 + arg3 * local350.anInt2199 + arg4 * local350.anInt2197) / (local22 * local350.anInt2201);
					local26.anIntArray279[local51] = Static26.method486(local331, local228);
				} else if (local281 == 1) {
					local511 = this.aClass44Array1[local51];
					local228 = arg0 + (arg2 * local511.anInt1672 + arg3 * local511.anInt1673 + arg4 * local511.anInt1677) / (local22 + local22 / 2);
					local26.anIntArray283[local51] = Static26.method486(this.aShortArray11[local51] & 0xFFFF, local228);
					local26.anIntArray279[local51] = -1;
				} else if (local281 == 3) {
					local26.anIntArray283[local51] = 128;
					local26.anIntArray279[local51] = -1;
				} else {
					local26.anIntArray279[local51] = -2;
				}
			} else if (local281 == 0) {
				if (this.aClass56Array2 == null || this.aClass56Array2[this.anIntArray98[local51]] == null) {
					local350 = this.aClass56Array1[this.anIntArray98[local51]];
				} else {
					local350 = this.aClass56Array2[this.anIntArray98[local51]];
				}
				local228 = arg0 + (arg2 * local350.anInt2202 + arg3 * local350.anInt2199 + arg4 * local350.anInt2197) / (local22 * local350.anInt2201);
				local26.anIntArray283[local51] = Static26.method481(local228);
				if (this.aClass56Array2 == null || this.aClass56Array2[this.anIntArray92[local51]] == null) {
					local350 = this.aClass56Array1[this.anIntArray92[local51]];
				} else {
					local350 = this.aClass56Array2[this.anIntArray92[local51]];
				}
				local228 = arg0 + (arg2 * local350.anInt2202 + arg3 * local350.anInt2199 + arg4 * local350.anInt2197) / (local22 * local350.anInt2201);
				local26.anIntArray277[local51] = Static26.method481(local228);
				if (this.aClass56Array2 == null || this.aClass56Array2[this.anIntArray101[local51]] == null) {
					local350 = this.aClass56Array1[this.anIntArray101[local51]];
				} else {
					local350 = this.aClass56Array2[this.anIntArray101[local51]];
				}
				local228 = arg0 + (arg2 * local350.anInt2202 + arg3 * local350.anInt2199 + arg4 * local350.anInt2197) / (local22 * local350.anInt2201);
				local26.anIntArray279[local51] = Static26.method481(local228);
			} else if (local281 == 1) {
				local511 = this.aClass44Array1[local51];
				local228 = arg0 + (arg2 * local511.anInt1672 + arg3 * local511.anInt1673 + arg4 * local511.anInt1677) / (local22 + local22 / 2);
				local26.anIntArray283[local51] = Static26.method481(local228);
				local26.anIntArray279[local51] = -1;
			} else {
				local26.anIntArray279[local51] = -2;
			}
		}
		this.method488();
		local26.anInt2147 = this.anInt787;
		local26.anIntArray285 = this.anIntArray96;
		local26.anIntArray281 = this.anIntArray103;
		local26.anIntArray278 = this.anIntArray94;
		local26.anInt2141 = this.anInt785;
		local26.anIntArray275 = this.anIntArray98;
		local26.anIntArray280 = this.anIntArray92;
		local26.anIntArray282 = this.anIntArray101;
		local26.aByteArray33 = this.aByteArray10;
		local26.aByteArray32 = this.aByteArray8;
		local26.aByte4 = this.aByte1;
		local26.anIntArrayArray20 = this.anIntArrayArray6;
		local26.anIntArrayArray19 = this.anIntArrayArray5;
		return local26;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "([B)V")
	private void method480(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class8_Sub20 local4 = new Class8_Sub20(arg0);
		@Pc(9) Class8_Sub20 local9 = new Class8_Sub20(arg0);
		@Pc(14) Class8_Sub20 local14 = new Class8_Sub20(arg0);
		@Pc(19) Class8_Sub20 local19 = new Class8_Sub20(arg0);
		@Pc(24) Class8_Sub20 local24 = new Class8_Sub20(arg0);
		@Pc(29) Class8_Sub20 local29 = new Class8_Sub20(arg0);
		@Pc(34) Class8_Sub20 local34 = new Class8_Sub20(arg0);
		local4.anInt2853 = arg0.length - 23;
		@Pc(44) int local44 = local4.method1839();
		@Pc(48) int local48 = local4.method1839();
		@Pc(52) int local52 = local4.method1872();
		@Pc(56) int local56 = local4.method1872();
		@Pc(60) int local60 = local4.method1872();
		@Pc(64) int local64 = local4.method1872();
		@Pc(68) int local68 = local4.method1872();
		@Pc(72) int local72 = local4.method1872();
		@Pc(76) int local76 = local4.method1872();
		@Pc(80) int local80 = local4.method1839();
		@Pc(84) int local84 = local4.method1839();
		@Pc(88) int local88 = local4.method1839();
		@Pc(92) int local92 = local4.method1839();
		@Pc(96) int local96 = local4.method1839();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray6 = new byte[local52];
			local4.anInt2853 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray6[local113] = local4.method1847();
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
		this.anInt787 = local44;
		this.anInt785 = local48;
		this.anInt786 = local52;
		this.anIntArray96 = new int[local44];
		this.anIntArray103 = new int[local44];
		this.anIntArray94 = new int[local44];
		this.anIntArray98 = new int[local48];
		this.anIntArray92 = new int[local48];
		this.anIntArray101 = new int[local48];
		if (local76 == 1) {
			this.anIntArray102 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray5 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray10 = new byte[local48];
		} else {
			this.aByte1 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray8 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray93 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray21 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray9 = new byte[local48];
		}
		this.aShortArray11 = new short[local48];
		if (local52 > 0) {
			this.aShortArray12 = new short[local52];
			this.aShortArray16 = new short[local52];
			this.aShortArray13 = new short[local52];
			if (local100 > 0) {
				this.aShortArray18 = new short[local100];
				this.aShortArray19 = new short[local100];
				this.aShortArray15 = new short[local100];
				this.aShortArray14 = new short[local100];
				this.aByteArray7 = new byte[local100];
				this.aShortArray17 = new short[local100];
			}
			if (local102 > 0) {
				this.aShortArray20 = new short[local102];
			}
		}
		local4.anInt2853 = local52;
		local9.anInt2853 = local233;
		local14.anInt2853 = local239;
		local19.anInt2853 = local245;
		local24.anInt2853 = local184;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(461) int local461 = 0;
		@Pc(468) int local468;
		@Pc(470) int local470;
		@Pc(480) int local480;
		@Pc(490) int local490;
		for (@Pc(463) int local463 = 0; local463 < local44; local463++) {
			local468 = local4.method1872();
			local470 = 0;
			if ((local468 & 0x1) != 0) {
				local470 = local9.method1888();
			}
			local480 = 0;
			if ((local468 & 0x2) != 0) {
				local480 = local14.method1888();
			}
			local490 = 0;
			if ((local468 & 0x4) != 0) {
				local490 = local19.method1888();
			}
			this.anIntArray96[local463] = local457 + local470;
			this.anIntArray103[local463] = local459 + local480;
			this.anIntArray94[local463] = local461 + local490;
			local457 = this.anIntArray96[local463];
			local459 = this.anIntArray103[local463];
			local461 = this.anIntArray94[local463];
			if (local76 == 1) {
				this.anIntArray102[local463] = local24.method1872();
			}
		}
		local4.anInt2853 = local225;
		local9.anInt2853 = local151;
		local14.anInt2853 = local166;
		local19.anInt2853 = local193;
		local24.anInt2853 = local175;
		local29.anInt2853 = local208;
		local34.anInt2853 = local219;
		for (local468 = 0; local468 < local48; local468++) {
			this.aShortArray11[local468] = (short) local4.method1839();
			if (local56 == 1) {
				this.aByteArray5[local468] = local9.method1847();
			}
			if (local60 == 255) {
				this.aByteArray10[local468] = local14.method1847();
			}
			if (local64 == 1) {
				this.aByteArray8[local468] = local19.method1847();
			}
			if (local68 == 1) {
				this.anIntArray93[local468] = local24.method1872();
			}
			if (local72 == 1) {
				this.aShortArray21[local468] = (short) (local29.method1839() - 1);
			}
			if (this.aByteArray9 != null) {
				if (this.aShortArray21[local468] == -1) {
					this.aByteArray9[local468] = -1;
				} else {
					this.aByteArray9[local468] = (byte) (local34.method1872() - 1);
				}
			}
		}
		local4.anInt2853 = local202;
		local9.anInt2853 = local160;
		local470 = 0;
		local480 = 0;
		local490 = 0;
		@Pc(676) int local676 = 0;
		@Pc(683) int local683;
		@Pc(786) int local786;
		for (@Pc(678) int local678 = 0; local678 < local48; local678++) {
			local683 = local9.method1872();
			if (local683 == 1) {
				local470 = local4.method1888() + local676;
				local480 = local4.method1888() + local470;
				local490 = local4.method1888() + local480;
				local676 = local490;
				this.anIntArray98[local678] = local470;
				this.anIntArray92[local678] = local480;
				this.anIntArray101[local678] = local490;
			}
			if (local683 == 2) {
				local480 = local490;
				local490 = local4.method1888() + local676;
				local676 = local490;
				this.anIntArray98[local678] = local470;
				this.anIntArray92[local678] = local480;
				this.anIntArray101[local678] = local490;
			}
			if (local683 == 3) {
				local470 = local490;
				local490 = local4.method1888() + local676;
				local676 = local490;
				this.anIntArray98[local678] = local470;
				this.anIntArray92[local678] = local480;
				this.anIntArray101[local678] = local490;
			}
			if (local683 == 4) {
				local786 = local470;
				local470 = local480;
				local480 = local786;
				local490 = local4.method1888() + local676;
				local676 = local490;
				this.anIntArray98[local678] = local470;
				this.anIntArray92[local678] = local786;
				this.anIntArray101[local678] = local490;
			}
		}
		local4.anInt2853 = local251;
		local9.anInt2853 = local259;
		local14.anInt2853 = local267;
		local19.anInt2853 = local275;
		local24.anInt2853 = local283;
		local29.anInt2853 = local289;
		for (local683 = 0; local683 < local52; local683++) {
			local786 = this.aByteArray6[local683] & 0xFF;
			if (local786 == 0) {
				this.aShortArray12[local683] = (short) local4.method1839();
				this.aShortArray16[local683] = (short) local4.method1839();
				this.aShortArray13[local683] = (short) local4.method1839();
			}
			if (local786 == 1) {
				this.aShortArray12[local683] = (short) local9.method1839();
				this.aShortArray16[local683] = (short) local9.method1839();
				this.aShortArray13[local683] = (short) local9.method1839();
				this.aShortArray18[local683] = (short) local14.method1839();
				this.aShortArray19[local683] = (short) local14.method1839();
				this.aShortArray15[local683] = (short) local14.method1839();
				this.aShortArray14[local683] = (short) local19.method1839();
				this.aByteArray7[local683] = local24.method1847();
				this.aShortArray17[local683] = (short) local29.method1839();
			}
			if (local786 == 2) {
				this.aShortArray12[local683] = (short) local9.method1839();
				this.aShortArray16[local683] = (short) local9.method1839();
				this.aShortArray13[local683] = (short) local9.method1839();
				this.aShortArray18[local683] = (short) local14.method1839();
				this.aShortArray19[local683] = (short) local14.method1839();
				this.aShortArray15[local683] = (short) local14.method1839();
				this.aShortArray14[local683] = (short) local19.method1839();
				this.aByteArray7[local683] = local24.method1847();
				this.aShortArray17[local683] = (short) local29.method1839();
				this.aShortArray20[local683] = (short) local29.method1839();
			}
			if (local786 == 3) {
				this.aShortArray12[local683] = (short) local9.method1839();
				this.aShortArray16[local683] = (short) local9.method1839();
				this.aShortArray13[local683] = (short) local9.method1839();
				this.aShortArray18[local683] = (short) local14.method1839();
				this.aShortArray19[local683] = (short) local14.method1839();
				this.aShortArray15[local683] = (short) local14.method1839();
				this.aShortArray14[local683] = (short) local19.method1839();
				this.aByteArray7[local683] = local24.method1847();
				this.aShortArray17[local683] = (short) local29.method1839();
			}
		}
		local4.anInt2853 = local113;
		local786 = local4.method1872();
		if (local786 == 0) {
			return;
		}
		new Class81();
		local4.method1839();
		local4.method1839();
		local4.method1839();
		local4.method1853();
	}

	@OriginalMember(owner = "client!df", name = "e", descriptor = "()Lclient!df;")
	public Class8_Sub1_Sub1_Sub3 method482() {
		@Pc(3) Class8_Sub1_Sub1_Sub3 local3 = new Class8_Sub1_Sub1_Sub3();
		if (this.aByteArray5 != null) {
			local3.aByteArray5 = new byte[this.anInt785];
			for (@Pc(13) int local13 = 0; local13 < this.anInt785; local13++) {
				local3.aByteArray5[local13] = this.aByteArray5[local13];
			}
		}
		local3.anInt787 = this.anInt787;
		local3.anInt785 = this.anInt785;
		local3.anInt786 = this.anInt786;
		local3.anIntArray96 = this.anIntArray96;
		local3.anIntArray103 = this.anIntArray103;
		local3.anIntArray94 = this.anIntArray94;
		local3.anIntArray98 = this.anIntArray98;
		local3.anIntArray92 = this.anIntArray92;
		local3.anIntArray101 = this.anIntArray101;
		local3.aByteArray10 = this.aByteArray10;
		local3.aByteArray8 = this.aByteArray8;
		local3.aByteArray9 = this.aByteArray9;
		local3.aShortArray11 = this.aShortArray11;
		local3.aShortArray21 = this.aShortArray21;
		local3.aByte1 = this.aByte1;
		local3.aByteArray6 = this.aByteArray6;
		local3.aShortArray12 = this.aShortArray12;
		local3.aShortArray16 = this.aShortArray16;
		local3.aShortArray13 = this.aShortArray13;
		local3.aShortArray18 = this.aShortArray18;
		local3.aShortArray19 = this.aShortArray19;
		local3.aShortArray15 = this.aShortArray15;
		local3.aShortArray14 = this.aShortArray14;
		local3.aByteArray7 = this.aByteArray7;
		local3.aShortArray17 = this.aShortArray17;
		local3.aShortArray20 = this.aShortArray20;
		local3.anIntArray102 = this.anIntArray102;
		local3.anIntArray93 = this.anIntArray93;
		local3.anIntArrayArray6 = this.anIntArrayArray6;
		local3.anIntArrayArray5 = this.anIntArrayArray5;
		local3.aClass56Array1 = this.aClass56Array1;
		local3.aClass44Array1 = this.aClass44Array1;
		local3.aShort1 = this.aShort1;
		local3.aShort2 = this.aShort2;
		return local3;
	}

	@OriginalMember(owner = "client!df", name = "f", descriptor = "()V")
	public void method483() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt787; local1++) {
			this.anIntArray96[local1] = -this.anIntArray96[local1];
			this.anIntArray94[local1] = -this.anIntArray94[local1];
		}
		this.method473();
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(III)V")
	public void method484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt787; local1++) {
			this.anIntArray96[local1] = this.anIntArray96[local1] * arg0 / 128;
			this.anIntArray103[local1] = this.anIntArray103[local1] * arg1 / 128;
			this.anIntArray94[local1] = this.anIntArray94[local1] * arg2 / 128;
		}
		this.method473();
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(SS)V")
	public void method485(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray21 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt785; local5++) {
			if (this.aShortArray21[local5] == arg0) {
				this.aShortArray21[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "([B)V")
	private void method487(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class8_Sub20 local8 = new Class8_Sub20(arg0);
		@Pc(13) Class8_Sub20 local13 = new Class8_Sub20(arg0);
		@Pc(18) Class8_Sub20 local18 = new Class8_Sub20(arg0);
		@Pc(23) Class8_Sub20 local23 = new Class8_Sub20(arg0);
		@Pc(28) Class8_Sub20 local28 = new Class8_Sub20(arg0);
		local8.anInt2853 = arg0.length - 18;
		@Pc(38) int local38 = local8.method1839();
		@Pc(42) int local42 = local8.method1839();
		@Pc(46) int local46 = local8.method1872();
		@Pc(50) int local50 = local8.method1872();
		@Pc(54) int local54 = local8.method1872();
		@Pc(58) int local58 = local8.method1872();
		@Pc(62) int local62 = local8.method1872();
		@Pc(66) int local66 = local8.method1872();
		@Pc(70) int local70 = local8.method1839();
		@Pc(74) int local74 = local8.method1839();
		@Pc(78) int local78 = local8.method1839();
		@Pc(82) int local82 = local8.method1839();
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
		this.anInt787 = local38;
		this.anInt785 = local42;
		this.anInt786 = local46;
		this.anIntArray96 = new int[local38];
		this.anIntArray103 = new int[local38];
		this.anIntArray94 = new int[local38];
		this.anIntArray98 = new int[local42];
		this.anIntArray92 = new int[local42];
		this.anIntArray101 = new int[local42];
		if (local46 > 0) {
			this.aByteArray6 = new byte[local46];
			this.aShortArray12 = new short[local46];
			this.aShortArray16 = new short[local46];
			this.aShortArray13 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray102 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray5 = new byte[local42];
			this.aByteArray9 = new byte[local42];
			this.aShortArray21 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray10 = new byte[local42];
		} else {
			this.aByte1 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray8 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray93 = new int[local42];
		}
		this.aShortArray11 = new short[local42];
		local8.anInt2853 = 0;
		local13.anInt2853 = local165;
		local18.anInt2853 = local171;
		local23.anInt2853 = local90;
		local28.anInt2853 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method1872();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method1888();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method1888();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method1888();
			}
			this.anIntArray96[local307] = local301 + local314;
			this.anIntArray103[local307] = local303 + local324;
			this.anIntArray94[local307] = local305 + local334;
			local301 = this.anIntArray96[local307];
			local303 = this.anIntArray103[local307];
			local305 = this.anIntArray94[local307];
			if (local66 == 1) {
				this.anIntArray102[local307] = local28.method1872();
			}
		}
		local8.anInt2853 = local149;
		local13.anInt2853 = local116;
		local18.anInt2853 = local98;
		local23.anInt2853 = local134;
		local28.anInt2853 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray11[local312] = (short) local8.method1839();
			if (local50 == 1) {
				local314 = local13.method1872();
				if ((local314 & 0x1) == 1) {
					this.aByteArray5[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray5[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray9[local312] = (byte) (local314 >> 2);
					this.aShortArray21[local312] = this.aShortArray11[local312];
					this.aShortArray11[local312] = 127;
					if (this.aShortArray21[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray9[local312] = -1;
					this.aShortArray21[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray10[local312] = local18.method1847();
			}
			if (local58 == 1) {
				this.aByteArray8[local312] = local23.method1847();
			}
			if (local62 == 1) {
				this.anIntArray93[local312] = local28.method1872();
			}
		}
		local8.anInt2853 = local143;
		local13.anInt2853 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method1872();
			if (local543 == 1) {
				local314 = local8.method1888() + local536;
				local324 = local8.method1888() + local314;
				local334 = local8.method1888() + local324;
				local536 = local334;
				this.anIntArray98[local538] = local314;
				this.anIntArray92[local538] = local324;
				this.anIntArray101[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method1888() + local536;
				local536 = local334;
				this.anIntArray98[local538] = local314;
				this.anIntArray92[local538] = local324;
				this.anIntArray101[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method1888() + local536;
				local536 = local334;
				this.anIntArray98[local538] = local314;
				this.anIntArray92[local538] = local324;
				this.anIntArray101[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method1888() + local536;
				local536 = local334;
				this.anIntArray98[local538] = local314;
				this.anIntArray92[local538] = local646;
				this.anIntArray101[local538] = local334;
			}
		}
		local8.anInt2853 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray6[local543] = 0;
			this.aShortArray12[local543] = (short) local8.method1839();
			this.aShortArray16[local543] = (short) local8.method1839();
			this.aShortArray13[local543] = (short) local8.method1839();
		}
		if (this.aByteArray9 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray9[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray12[local731] & 0xFFFF) == this.anIntArray98[local723] && (this.aShortArray16[local731] & 0xFFFF) == this.anIntArray92[local723] && (this.aShortArray13[local731] & 0xFFFF) == this.anIntArray101[local723]) {
						this.aByteArray9[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray9 = null;
			}
		}
		if (!local3) {
			this.aShortArray21 = null;
		}
		if (!local1) {
			this.aByteArray5 = null;
		}
	}

	@OriginalMember(owner = "client!df", name = "g", descriptor = "()V")
	private void method488() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray102 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt787; local9++) {
				local15 = this.anIntArray102[local9];
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
			while (local59 < this.anInt787) {
				local65 = this.anIntArray102[local59];
				this.anIntArrayArray6[local65][local5[local65]++] = local59++;
			}
			this.anIntArray102 = null;
		}
		if (this.anIntArray93 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt785; local9++) {
			local15 = this.anIntArray93[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray5 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray5[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt785) {
			local65 = this.anIntArray93[local59];
			this.anIntArrayArray5[local65][local5[local65]++] = local59++;
		}
		this.anIntArray93 = null;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(SS)V")
	public void method490(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt785; local1++) {
			if (this.aShortArray11[local1] == arg0) {
				this.aShortArray11[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "h", descriptor = "()V")
	public void method491() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt787; local1++) {
			@Pc(7) int local7 = this.anIntArray94[local1];
			this.anIntArray94[local1] = this.anIntArray96[local1];
			this.anIntArray96[local1] = -local7;
		}
		this.method473();
	}

	@OriginalMember(owner = "client!df", name = "i", descriptor = "()V")
	public void method492() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt787; local1++) {
			@Pc(7) int local7 = this.anIntArray96[local1];
			this.anIntArray96[local1] = this.anIntArray94[local1];
			this.anIntArray94[local1] = -local7;
		}
		this.method473();
	}
}
