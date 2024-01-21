import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class1_Sub2_Sub2_Sub1 extends Class1_Sub2_Sub2 {

	@OriginalMember(owner = "client!be", name = "Y", descriptor = "[S")
	public short[] aShortArray2;

	@OriginalMember(owner = "client!be", name = "Z", descriptor = "[Lclient!va;")
	public Class89[] aClass89Array1;

	@OriginalMember(owner = "client!be", name = "bb", descriptor = "[I")
	public int[] anIntArray61;

	@OriginalMember(owner = "client!be", name = "cb", descriptor = "[B")
	private byte[] aByteArray7;

	@OriginalMember(owner = "client!be", name = "db", descriptor = "S")
	public short aShort3;

	@OriginalMember(owner = "client!be", name = "eb", descriptor = "[B")
	public byte[] aByteArray8;

	@OriginalMember(owner = "client!be", name = "fb", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!be", name = "ib", descriptor = "[I")
	private int[] anIntArray63;

	@OriginalMember(owner = "client!be", name = "jb", descriptor = "[I")
	public int[] anIntArray64;

	@OriginalMember(owner = "client!be", name = "kb", descriptor = "S")
	public short aShort4;

	@OriginalMember(owner = "client!be", name = "mb", descriptor = "S")
	public short aShort5;

	@OriginalMember(owner = "client!be", name = "nb", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!be", name = "pb", descriptor = "S")
	public short aShort6;

	@OriginalMember(owner = "client!be", name = "qb", descriptor = "[Lclient!va;")
	public Class89[] aClass89Array2;

	@OriginalMember(owner = "client!be", name = "rb", descriptor = "[[I")
	public int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!be", name = "tb", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!be", name = "ub", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!be", name = "vb", descriptor = "[B")
	private byte[] aByteArray11;

	@OriginalMember(owner = "client!be", name = "wb", descriptor = "S")
	public short aShort7;

	@OriginalMember(owner = "client!be", name = "xb", descriptor = "[S")
	public short[] aShortArray5;

	@OriginalMember(owner = "client!be", name = "yb", descriptor = "[B")
	private byte[] aByteArray12;

	@OriginalMember(owner = "client!be", name = "zb", descriptor = "[[I")
	public int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!be", name = "Cb", descriptor = "[S")
	public short[] aShortArray6;

	@OriginalMember(owner = "client!be", name = "Db", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!be", name = "Eb", descriptor = "S")
	public short aShort8;

	@OriginalMember(owner = "client!be", name = "Fb", descriptor = "[B")
	public byte[] aByteArray14;

	@OriginalMember(owner = "client!be", name = "Gb", descriptor = "[I")
	private int[] anIntArray68;

	@OriginalMember(owner = "client!be", name = "Hb", descriptor = "[S")
	public short[] aShortArray7;

	@OriginalMember(owner = "client!be", name = "Ib", descriptor = "[B")
	public byte[] aByteArray15;

	@OriginalMember(owner = "client!be", name = "Jb", descriptor = "[S")
	public short[] aShortArray8;

	@OriginalMember(owner = "client!be", name = "Kb", descriptor = "[I")
	public int[] anIntArray69;

	@OriginalMember(owner = "client!be", name = "Lb", descriptor = "[I")
	public int[] anIntArray70;

	@OriginalMember(owner = "client!be", name = "Mb", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!be", name = "Nb", descriptor = "I")
	public int anInt466;

	@OriginalMember(owner = "client!be", name = "Ob", descriptor = "[I")
	public int[] anIntArray71;

	@OriginalMember(owner = "client!be", name = "Pb", descriptor = "[B")
	private byte[] aByteArray16;

	@OriginalMember(owner = "client!be", name = "Rb", descriptor = "S")
	public short aShort9;

	@OriginalMember(owner = "client!be", name = "Sb", descriptor = "[Lclient!hc;")
	public Class29[] aClass29Array1;

	@OriginalMember(owner = "client!be", name = "Tb", descriptor = "[I")
	public int[] anIntArray72;

	@OriginalMember(owner = "client!be", name = "gb", descriptor = "Z")
	private boolean aBoolean42 = false;

	@OriginalMember(owner = "client!be", name = "Qb", descriptor = "I")
	public int anInt467 = 0;

	@OriginalMember(owner = "client!be", name = "sb", descriptor = "I")
	public int anInt465 = 0;

	@OriginalMember(owner = "client!be", name = "ab", descriptor = "B")
	public byte aByte1 = 0;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
	private Class1_Sub2_Sub2_Sub1() {
	}

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub2_Sub1(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method512(arg0);
		} else {
			this.method498(arg0);
		}
	}

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "([Lclient!be;I)V")
	public Class1_Sub2_Sub2_Sub1(@OriginalArg(0) Class1_Sub2_Sub2_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt465 = 0;
		this.anInt467 = 0;
		this.anInt466 = 0;
		this.aByte1 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class1_Sub2_Sub2_Sub1 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt465 += local44.anInt465;
				this.anInt467 += local44.anInt467;
				this.anInt466 += local44.anInt466;
				if (local44.aByteArray13 == null) {
					if (this.aByte1 == -1) {
						this.aByte1 = local44.aByte1;
					}
					if (this.aByte1 != local44.aByte1) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray14 != null;
				local19 |= local44.aByteArray15 != null;
				local21 |= local44.anIntArray63 != null;
				local23 |= local44.aShortArray6 != null;
				local25 |= local44.aByteArray9 != null;
			}
		}
		this.anIntArray61 = new int[this.anInt465];
		this.anIntArray69 = new int[this.anInt465];
		this.anIntArray70 = new int[this.anInt465];
		this.anIntArray68 = new int[this.anInt465];
		this.anIntArray72 = new int[this.anInt467];
		this.anIntArray64 = new int[this.anInt467];
		this.anIntArray71 = new int[this.anInt467];
		if (local15) {
			this.aByteArray14 = new byte[this.anInt467];
		}
		if (local17) {
			this.aByteArray13 = new byte[this.anInt467];
		}
		if (local19) {
			this.aByteArray15 = new byte[this.anInt467];
		}
		if (local21) {
			this.anIntArray63 = new int[this.anInt467];
		}
		if (local23) {
			this.aShortArray6 = new short[this.anInt467];
		}
		if (local25) {
			this.aByteArray9 = new byte[this.anInt467];
		}
		this.aShortArray7 = new short[this.anInt467];
		if (this.anInt466 > 0) {
			this.aByteArray8 = new byte[this.anInt466];
			this.aShortArray2 = new short[this.anInt466];
			this.aShortArray5 = new short[this.anInt466];
			this.aShortArray8 = new short[this.anInt466];
			this.aShortArray9 = new short[this.anInt466];
			this.aShortArray4 = new short[this.anInt466];
			this.aShortArray3 = new short[this.anInt466];
			this.aByteArray10 = new byte[this.anInt466];
			this.aByteArray7 = new byte[this.anInt466];
			this.aByteArray16 = new byte[this.anInt466];
			this.aByteArray11 = new byte[this.anInt466];
			this.aByteArray12 = new byte[this.anInt466];
		}
		this.anInt465 = 0;
		this.anInt467 = 0;
		this.anInt466 = 0;
		for (@Pc(293) int local293 = 0; local293 < arg1; local293++) {
			@Pc(298) Class1_Sub2_Sub2_Sub1 local298 = arg0[local293];
			if (local298 != null) {
				for (@Pc(302) int local302 = 0; local302 < local298.anInt467; local302++) {
					if (local15 && local298.aByteArray14 != null) {
						this.aByteArray14[this.anInt467] = local298.aByteArray14[local302];
					}
					if (local17) {
						if (local298.aByteArray13 == null) {
							this.aByteArray13[this.anInt467] = local298.aByte1;
						} else {
							this.aByteArray13[this.anInt467] = local298.aByteArray13[local302];
						}
					}
					if (local19 && local298.aByteArray15 != null) {
						this.aByteArray15[this.anInt467] = local298.aByteArray15[local302];
					}
					if (local21 && local298.anIntArray63 != null) {
						this.anIntArray63[this.anInt467] = local298.anIntArray63[local302];
					}
					if (local23) {
						if (local298.aShortArray6 == null) {
							this.aShortArray6[this.anInt467] = -1;
						} else {
							this.aShortArray6[this.anInt467] = local298.aShortArray6[local302];
						}
					}
					if (local25) {
						if (local298.aByteArray9 == null || local298.aByteArray9[local302] == -1) {
							this.aByteArray9[this.anInt467] = -1;
						} else {
							this.aByteArray9[this.anInt467] = (byte) (local298.aByteArray9[local302] + this.anInt466);
						}
					}
					this.aShortArray7[this.anInt467] = local298.aShortArray7[local302];
					this.anIntArray72[this.anInt467] = this.method516(local298, local298.anIntArray72[local302]);
					this.anIntArray64[this.anInt467] = this.method516(local298, local298.anIntArray64[local302]);
					this.anIntArray71[this.anInt467] = this.method516(local298, local298.anIntArray71[local302]);
					this.anInt467++;
				}
				for (@Pc(477) int local477 = 0; local477 < local298.anInt466; local477++) {
					@Pc(489) byte local489 = this.aByteArray8[this.anInt466] = local298.aByteArray8[local477];
					if (local489 == 0) {
						this.aShortArray2[this.anInt466] = (short) this.method516(local298, local298.aShortArray2[local477]);
						this.aShortArray5[this.anInt466] = (short) this.method516(local298, local298.aShortArray5[local477]);
						this.aShortArray8[this.anInt466] = (short) this.method516(local298, local298.aShortArray8[local477]);
					}
					if (local489 >= 1 && local489 <= 3) {
						this.aShortArray2[this.anInt466] = local298.aShortArray2[local477];
						this.aShortArray5[this.anInt466] = local298.aShortArray5[local477];
						this.aShortArray8[this.anInt466] = local298.aShortArray8[local477];
						this.aShortArray9[this.anInt466] = local298.aShortArray9[local477];
						this.aShortArray4[this.anInt466] = local298.aShortArray4[local477];
						this.aShortArray3[this.anInt466] = local298.aShortArray3[local477];
						this.aByteArray10[this.anInt466] = local298.aByteArray10[local477];
						this.aByteArray7[this.anInt466] = local298.aByteArray7[local477];
						this.aByteArray16[this.anInt466] = local298.aByteArray16[local477];
					}
					if (local489 == 2) {
						this.aByteArray11[this.anInt466] = local298.aByteArray11[local477];
						this.aByteArray12[this.anInt466] = local298.aByteArray12[local477];
					}
					this.anInt466++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!be;ZZZZ)V")
	public Class1_Sub2_Sub2_Sub1(@OriginalArg(0) Class1_Sub2_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt465 = arg0.anInt465;
		this.anInt467 = arg0.anInt467;
		this.anInt466 = arg0.anInt466;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray61 = arg0.anIntArray61;
			this.anIntArray69 = arg0.anIntArray69;
			this.anIntArray70 = arg0.anIntArray70;
		} else {
			this.anIntArray61 = new int[this.anInt465];
			this.anIntArray69 = new int[this.anInt465];
			this.anIntArray70 = new int[this.anInt465];
			for (local57 = 0; local57 < this.anInt465; local57++) {
				this.anIntArray61[local57] = arg0.anIntArray61[local57];
				this.anIntArray69[local57] = arg0.anIntArray69[local57];
				this.anIntArray70[local57] = arg0.anIntArray70[local57];
			}
		}
		if (arg2) {
			this.aShortArray7 = arg0.aShortArray7;
		} else {
			this.aShortArray7 = new short[this.anInt467];
			for (local57 = 0; local57 < this.anInt467; local57++) {
				this.aShortArray7[local57] = arg0.aShortArray7[local57];
			}
		}
		if (arg3 || arg0.aShortArray6 == null) {
			this.aShortArray6 = arg0.aShortArray6;
		} else {
			this.aShortArray6 = new short[this.anInt467];
			for (local57 = 0; local57 < this.anInt467; local57++) {
				this.aShortArray6[local57] = arg0.aShortArray6[local57];
			}
		}
		this.aByteArray15 = arg0.aByteArray15;
		this.anIntArray72 = arg0.anIntArray72;
		this.anIntArray64 = arg0.anIntArray64;
		this.anIntArray71 = arg0.anIntArray71;
		this.aByteArray14 = arg0.aByteArray14;
		this.aByteArray13 = arg0.aByteArray13;
		this.aByteArray9 = arg0.aByteArray9;
		this.aByte1 = arg0.aByte1;
		this.aByteArray8 = arg0.aByteArray8;
		this.aShortArray2 = arg0.aShortArray2;
		this.aShortArray5 = arg0.aShortArray5;
		this.aShortArray8 = arg0.aShortArray8;
		this.aShortArray9 = arg0.aShortArray9;
		this.aShortArray4 = arg0.aShortArray4;
		this.aShortArray3 = arg0.aShortArray3;
		this.aByteArray10 = arg0.aByteArray10;
		this.aByteArray7 = arg0.aByteArray7;
		this.aByteArray16 = arg0.aByteArray16;
		this.aByteArray11 = arg0.aByteArray11;
		this.aByteArray12 = arg0.aByteArray12;
		this.anIntArray68 = arg0.anIntArray68;
		this.anIntArray63 = arg0.anIntArray63;
		this.anIntArrayArray5 = arg0.anIntArrayArray5;
		this.anIntArrayArray6 = arg0.anIntArrayArray6;
		this.aClass89Array1 = arg0.aClass89Array1;
		this.aClass29Array1 = arg0.aClass29Array1;
		this.aClass89Array2 = arg0.aClass89Array2;
		this.aShort4 = arg0.aShort4;
		this.aShort7 = arg0.aShort7;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "()V")
	public void method496() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt467; local1++) {
			@Pc(7) int local7 = this.anIntArray72[local1];
			this.anIntArray72[local1] = this.anIntArray71[local1];
			this.anIntArray71[local1] = local7;
		}
		this.method518();
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "()V")
	public void method497() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt465; local1++) {
			@Pc(7) int local7 = this.anIntArray61[local1];
			this.anIntArray61[local1] = this.anIntArray70[local1];
			this.anIntArray70[local1] = -local7;
		}
		this.method518();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "([B)V")
	private void method498(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class1_Sub8 local8 = new Class1_Sub8(arg0);
		@Pc(13) Class1_Sub8 local13 = new Class1_Sub8(arg0);
		@Pc(18) Class1_Sub8 local18 = new Class1_Sub8(arg0);
		@Pc(23) Class1_Sub8 local23 = new Class1_Sub8(arg0);
		@Pc(28) Class1_Sub8 local28 = new Class1_Sub8(arg0);
		local8.anInt2195 = arg0.length - 18;
		@Pc(38) int local38 = local8.method1642();
		@Pc(42) int local42 = local8.method1642();
		@Pc(46) int local46 = local8.method1607();
		@Pc(50) int local50 = local8.method1607();
		@Pc(54) int local54 = local8.method1607();
		@Pc(58) int local58 = local8.method1607();
		@Pc(62) int local62 = local8.method1607();
		@Pc(66) int local66 = local8.method1607();
		@Pc(70) int local70 = local8.method1642();
		@Pc(74) int local74 = local8.method1642();
		@Pc(78) int local78 = local8.method1642();
		@Pc(82) int local82 = local8.method1642();
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
		this.anInt465 = local38;
		this.anInt467 = local42;
		this.anInt466 = local46;
		this.anIntArray61 = new int[local38];
		this.anIntArray69 = new int[local38];
		this.anIntArray70 = new int[local38];
		this.anIntArray72 = new int[local42];
		this.anIntArray64 = new int[local42];
		this.anIntArray71 = new int[local42];
		if (local46 > 0) {
			this.aByteArray8 = new byte[local46];
			this.aShortArray2 = new short[local46];
			this.aShortArray5 = new short[local46];
			this.aShortArray8 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray68 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray14 = new byte[local42];
			this.aByteArray9 = new byte[local42];
			this.aShortArray6 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray13 = new byte[local42];
		} else {
			this.aByte1 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray15 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray63 = new int[local42];
		}
		this.aShortArray7 = new short[local42];
		local8.anInt2195 = 0;
		local13.anInt2195 = local165;
		local18.anInt2195 = local171;
		local23.anInt2195 = local90;
		local28.anInt2195 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method1607();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method1608();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method1608();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method1608();
			}
			this.anIntArray61[local307] = local301 + local314;
			this.anIntArray69[local307] = local303 + local324;
			this.anIntArray70[local307] = local305 + local334;
			local301 = this.anIntArray61[local307];
			local303 = this.anIntArray69[local307];
			local305 = this.anIntArray70[local307];
			if (local66 == 1) {
				this.anIntArray68[local307] = local28.method1607();
			}
		}
		local8.anInt2195 = local149;
		local13.anInt2195 = local116;
		local18.anInt2195 = local98;
		local23.anInt2195 = local134;
		local28.anInt2195 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray7[local312] = (short) local8.method1642();
			if (local50 == 1) {
				local314 = local13.method1607();
				if ((local314 & 0x1) == 1) {
					this.aByteArray14[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray14[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray9[local312] = (byte) (local314 >> 2);
					this.aShortArray6[local312] = this.aShortArray7[local312];
					this.aShortArray7[local312] = 127;
					if (this.aShortArray6[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray9[local312] = -1;
					this.aShortArray6[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray13[local312] = local18.method1611();
			}
			if (local58 == 1) {
				this.aByteArray15[local312] = local23.method1611();
			}
			if (local62 == 1) {
				this.anIntArray63[local312] = local28.method1607();
			}
		}
		local8.anInt2195 = local143;
		local13.anInt2195 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method1607();
			if (local543 == 1) {
				local314 = local8.method1608() + local536;
				local324 = local8.method1608() + local314;
				local334 = local8.method1608() + local324;
				local536 = local334;
				this.anIntArray72[local538] = local314;
				this.anIntArray64[local538] = local324;
				this.anIntArray71[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method1608() + local536;
				local536 = local334;
				this.anIntArray72[local538] = local314;
				this.anIntArray64[local538] = local324;
				this.anIntArray71[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method1608() + local536;
				local536 = local334;
				this.anIntArray72[local538] = local314;
				this.anIntArray64[local538] = local324;
				this.anIntArray71[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method1608() + local536;
				local536 = local334;
				this.anIntArray72[local538] = local314;
				this.anIntArray64[local538] = local646;
				this.anIntArray71[local538] = local334;
			}
		}
		local8.anInt2195 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray8[local543] = 0;
			this.aShortArray2[local543] = (short) local8.method1642();
			this.aShortArray5[local543] = (short) local8.method1642();
			this.aShortArray8[local543] = (short) local8.method1642();
		}
		if (this.aByteArray9 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray9[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray2[local731] & 0xFFFF) == this.anIntArray72[local723] && (this.aShortArray5[local731] & 0xFFFF) == this.anIntArray64[local723] && (this.aShortArray8[local731] & 0xFFFF) == this.anIntArray71[local723]) {
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
			this.aShortArray6 = null;
		}
		if (!local1) {
			this.aByteArray14 = null;
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "()Lclient!be;")
	public Class1_Sub2_Sub2_Sub1 method499() {
		@Pc(3) Class1_Sub2_Sub2_Sub1 local3 = new Class1_Sub2_Sub2_Sub1();
		if (this.aByteArray14 != null) {
			local3.aByteArray14 = new byte[this.anInt467];
			for (@Pc(13) int local13 = 0; local13 < this.anInt467; local13++) {
				local3.aByteArray14[local13] = this.aByteArray14[local13];
			}
		}
		local3.anInt465 = this.anInt465;
		local3.anInt467 = this.anInt467;
		local3.anInt466 = this.anInt466;
		local3.anIntArray61 = this.anIntArray61;
		local3.anIntArray69 = this.anIntArray69;
		local3.anIntArray70 = this.anIntArray70;
		local3.anIntArray72 = this.anIntArray72;
		local3.anIntArray64 = this.anIntArray64;
		local3.anIntArray71 = this.anIntArray71;
		local3.aByteArray13 = this.aByteArray13;
		local3.aByteArray15 = this.aByteArray15;
		local3.aByteArray9 = this.aByteArray9;
		local3.aShortArray7 = this.aShortArray7;
		local3.aShortArray6 = this.aShortArray6;
		local3.aByte1 = this.aByte1;
		local3.aByteArray8 = this.aByteArray8;
		local3.aShortArray2 = this.aShortArray2;
		local3.aShortArray5 = this.aShortArray5;
		local3.aShortArray8 = this.aShortArray8;
		local3.aShortArray9 = this.aShortArray9;
		local3.aShortArray4 = this.aShortArray4;
		local3.aShortArray3 = this.aShortArray3;
		local3.aByteArray10 = this.aByteArray10;
		local3.aByteArray7 = this.aByteArray7;
		local3.aByteArray16 = this.aByteArray16;
		local3.aByteArray11 = this.aByteArray11;
		local3.aByteArray12 = this.aByteArray12;
		local3.anIntArray68 = this.anIntArray68;
		local3.anIntArray63 = this.anIntArray63;
		local3.anIntArrayArray5 = this.anIntArrayArray5;
		local3.anIntArrayArray6 = this.anIntArrayArray6;
		local3.aClass89Array1 = this.aClass89Array1;
		local3.aClass29Array1 = this.aClass29Array1;
		local3.aShort4 = this.aShort4;
		local3.aShort7 = this.aShort7;
		return local3;
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "()V")
	public void method500() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt465; local1++) {
			this.anIntArray70[local1] = -this.anIntArray70[local1];
		}
		this.method518();
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "()V")
	public void method501() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt465; local1++) {
			this.anIntArray61[local1] = -this.anIntArray61[local1];
			this.anIntArray70[local1] = -this.anIntArray70[local1];
		}
		this.method518();
	}

	@OriginalMember(owner = "client!be", name = "f", descriptor = "()V")
	public void method502() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray68 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt465; local9++) {
				local15 = this.anIntArray68[local9];
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
			while (local59 < this.anInt465) {
				local65 = this.anIntArray68[local59];
				this.anIntArrayArray5[local65][local5[local65]++] = local59++;
			}
			this.anIntArray68 = null;
		}
		if (this.anIntArray63 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt467; local9++) {
			local15 = this.anIntArray63[local9];
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
		while (local59 < this.anInt467) {
			local65 = this.anIntArray63[local59];
			this.anIntArrayArray6[local65][local5[local65]++] = local59++;
		}
		this.anIntArray63 = null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(SS)V")
	public void method503(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray6 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt467; local5++) {
			if (this.aShortArray6[local5] == arg0) {
				this.aShortArray6[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "g", descriptor = "()V")
	public void method504() {
		if (this.aBoolean42) {
			return;
		}
		this.aBoolean42 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt465; local20++) {
			@Pc(26) int local26 = this.anIntArray61[local20];
			@Pc(31) int local31 = this.anIntArray69[local20];
			@Pc(36) int local36 = this.anIntArray70[local20];
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
		this.aShort9 = (short) local8;
		this.aShort6 = (short) local14;
		super.aShort27 = (short) local10;
		this.aShort5 = (short) local16;
		this.aShort8 = (short) local12;
		this.aShort3 = (short) local18;
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V")
	public void method506() {
		@Pc(3) int local3 = Static13.anIntArray65[256];
		@Pc(7) int local7 = Static13.anIntArray67[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt465; local9++) {
			@Pc(26) int local26 = this.anIntArray70[local9] * local3 + this.anIntArray61[local9] * local7 >> 16;
			this.anIntArray70[local9] = this.anIntArray70[local9] * local7 - this.anIntArray61[local9] * local3 >> 16;
			this.anIntArray61[local9] = local26;
		}
		this.method518();
	}

	@OriginalMember(owner = "client!be", name = "h", descriptor = "()V")
	public void method507() {
		if (this.aClass89Array1 != null) {
			return;
		}
		this.aClass89Array1 = new Class89[this.anInt465];
		for (@Pc(10) int local10 = 0; local10 < this.anInt465; local10++) {
			this.aClass89Array1[local10] = new Class89();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt467; local25++) {
			@Pc(31) int local31 = this.anIntArray72[local25];
			@Pc(36) int local36 = this.anIntArray64[local25];
			@Pc(41) int local41 = this.anIntArray71[local25];
			@Pc(51) int local51 = this.anIntArray61[local36] - this.anIntArray61[local31];
			@Pc(61) int local61 = this.anIntArray69[local36] - this.anIntArray69[local31];
			@Pc(71) int local71 = this.anIntArray70[local36] - this.anIntArray70[local31];
			@Pc(81) int local81 = this.anIntArray61[local41] - this.anIntArray61[local31];
			@Pc(91) int local91 = this.anIntArray69[local41] - this.anIntArray69[local31];
			@Pc(101) int local101 = this.anIntArray70[local41] - this.anIntArray70[local31];
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
			if (this.aByteArray14 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray14[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class89 local211 = this.aClass89Array1[local31];
				local211.anInt3999 += local109;
				local211.anInt4002 += local117;
				local211.anInt4000 += local125;
				local211.anInt4001++;
				@Pc(240) Class89 local240 = this.aClass89Array1[local36];
				local240.anInt3999 += local109;
				local240.anInt4002 += local117;
				local240.anInt4000 += local125;
				local240.anInt4001++;
				@Pc(269) Class89 local269 = this.aClass89Array1[local41];
				local269.anInt3999 += local109;
				local269.anInt4002 += local117;
				local269.anInt4000 += local125;
				local269.anInt4001++;
			} else if (local198 == 1) {
				if (this.aClass29Array1 == null) {
					this.aClass29Array1 = new Class29[this.anInt467];
				}
				@Pc(314) Class29 local314 = this.aClass29Array1[local25] = new Class29();
				local314.anInt1945 = local109;
				local314.anInt1947 = local117;
				local314.anInt1946 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIII)Lclient!sg;")
	public Class1_Sub2_Sub2_Sub5_Sub1 method508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class1_Sub2_Sub2_Sub5_Sub1(this, arg0, arg1, -50, -10, -50);
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(III)V")
	public void method509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt465; local1++) {
			this.anIntArray61[local1] += arg0;
			this.anIntArray69[local1] += arg1;
			this.anIntArray70[local1] += arg2;
		}
		this.method518();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIZZ)Lclient!ia;")
	public Class1_Sub2_Sub2_Sub5 method511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class1_Sub2_Sub2_Sub5_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "([B)V")
	private void method512(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class1_Sub8 local4 = new Class1_Sub8(arg0);
		@Pc(9) Class1_Sub8 local9 = new Class1_Sub8(arg0);
		@Pc(14) Class1_Sub8 local14 = new Class1_Sub8(arg0);
		@Pc(19) Class1_Sub8 local19 = new Class1_Sub8(arg0);
		@Pc(24) Class1_Sub8 local24 = new Class1_Sub8(arg0);
		@Pc(29) Class1_Sub8 local29 = new Class1_Sub8(arg0);
		@Pc(34) Class1_Sub8 local34 = new Class1_Sub8(arg0);
		local4.anInt2195 = arg0.length - 23;
		@Pc(44) int local44 = local4.method1642();
		@Pc(48) int local48 = local4.method1642();
		@Pc(52) int local52 = local4.method1607();
		@Pc(56) int local56 = local4.method1607();
		@Pc(60) int local60 = local4.method1607();
		@Pc(64) int local64 = local4.method1607();
		@Pc(68) int local68 = local4.method1607();
		@Pc(72) int local72 = local4.method1607();
		@Pc(76) int local76 = local4.method1607();
		@Pc(80) int local80 = local4.method1642();
		@Pc(84) int local84 = local4.method1642();
		@Pc(88) int local88 = local4.method1642();
		@Pc(92) int local92 = local4.method1642();
		@Pc(96) int local96 = local4.method1642();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray8 = new byte[local52];
			local4.anInt2195 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray8[local113] = local4.method1611();
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
		this.anInt465 = local44;
		this.anInt467 = local48;
		this.anInt466 = local52;
		this.anIntArray61 = new int[local44];
		this.anIntArray69 = new int[local44];
		this.anIntArray70 = new int[local44];
		this.anIntArray72 = new int[local48];
		this.anIntArray64 = new int[local48];
		this.anIntArray71 = new int[local48];
		if (local76 == 1) {
			this.anIntArray68 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray14 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray13 = new byte[local48];
		} else {
			this.aByte1 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray15 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray63 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray6 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray9 = new byte[local48];
		}
		this.aShortArray7 = new short[local48];
		if (local52 > 0) {
			this.aShortArray2 = new short[local52];
			this.aShortArray5 = new short[local52];
			this.aShortArray8 = new short[local52];
			if (local100 > 0) {
				this.aShortArray9 = new short[local100];
				this.aShortArray4 = new short[local100];
				this.aShortArray3 = new short[local100];
				this.aByteArray10 = new byte[local100];
				this.aByteArray7 = new byte[local100];
				this.aByteArray16 = new byte[local100];
			}
			if (local102 > 0) {
				this.aByteArray11 = new byte[local102];
				this.aByteArray12 = new byte[local102];
			}
		}
		local4.anInt2195 = local52;
		local9.anInt2195 = local233;
		local14.anInt2195 = local239;
		local19.anInt2195 = local245;
		local24.anInt2195 = local184;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(461) int local461 = 0;
		@Pc(468) int local468;
		@Pc(470) int local470;
		@Pc(480) int local480;
		@Pc(490) int local490;
		for (@Pc(463) int local463 = 0; local463 < local44; local463++) {
			local468 = local4.method1607();
			local470 = 0;
			if ((local468 & 0x1) != 0) {
				local470 = local9.method1608();
			}
			local480 = 0;
			if ((local468 & 0x2) != 0) {
				local480 = local14.method1608();
			}
			local490 = 0;
			if ((local468 & 0x4) != 0) {
				local490 = local19.method1608();
			}
			this.anIntArray61[local463] = local457 + local470;
			this.anIntArray69[local463] = local459 + local480;
			this.anIntArray70[local463] = local461 + local490;
			local457 = this.anIntArray61[local463];
			local459 = this.anIntArray69[local463];
			local461 = this.anIntArray70[local463];
			if (local76 == 1) {
				this.anIntArray68[local463] = local24.method1607();
			}
		}
		local4.anInt2195 = local225;
		local9.anInt2195 = local151;
		local14.anInt2195 = local166;
		local19.anInt2195 = local193;
		local24.anInt2195 = local175;
		local29.anInt2195 = local208;
		local34.anInt2195 = local219;
		for (local468 = 0; local468 < local48; local468++) {
			this.aShortArray7[local468] = (short) local4.method1642();
			if (local56 == 1) {
				this.aByteArray14[local468] = local9.method1611();
			}
			if (local60 == 255) {
				this.aByteArray13[local468] = local14.method1611();
			}
			if (local64 == 1) {
				this.aByteArray15[local468] = local19.method1611();
			}
			if (local68 == 1) {
				this.anIntArray63[local468] = local24.method1607();
			}
			if (local72 == 1) {
				this.aShortArray6[local468] = (short) (local29.method1642() - 1);
			}
			if (this.aByteArray9 != null) {
				if (this.aShortArray6[local468] == -1) {
					this.aByteArray9[local468] = -1;
				} else {
					this.aByteArray9[local468] = (byte) (local34.method1607() - 1);
				}
			}
		}
		local4.anInt2195 = local202;
		local9.anInt2195 = local160;
		local470 = 0;
		local480 = 0;
		local490 = 0;
		@Pc(676) int local676 = 0;
		@Pc(683) int local683;
		@Pc(786) int local786;
		for (@Pc(678) int local678 = 0; local678 < local48; local678++) {
			local683 = local9.method1607();
			if (local683 == 1) {
				local470 = local4.method1608() + local676;
				local480 = local4.method1608() + local470;
				local490 = local4.method1608() + local480;
				local676 = local490;
				this.anIntArray72[local678] = local470;
				this.anIntArray64[local678] = local480;
				this.anIntArray71[local678] = local490;
			}
			if (local683 == 2) {
				local480 = local490;
				local490 = local4.method1608() + local676;
				local676 = local490;
				this.anIntArray72[local678] = local470;
				this.anIntArray64[local678] = local480;
				this.anIntArray71[local678] = local490;
			}
			if (local683 == 3) {
				local470 = local490;
				local490 = local4.method1608() + local676;
				local676 = local490;
				this.anIntArray72[local678] = local470;
				this.anIntArray64[local678] = local480;
				this.anIntArray71[local678] = local490;
			}
			if (local683 == 4) {
				local786 = local470;
				local470 = local480;
				local480 = local786;
				local490 = local4.method1608() + local676;
				local676 = local490;
				this.anIntArray72[local678] = local470;
				this.anIntArray64[local678] = local786;
				this.anIntArray71[local678] = local490;
			}
		}
		local4.anInt2195 = local251;
		local9.anInt2195 = local259;
		local14.anInt2195 = local267;
		local19.anInt2195 = local275;
		local24.anInt2195 = local281;
		local29.anInt2195 = local287;
		for (local683 = 0; local683 < local52; local683++) {
			local786 = this.aByteArray8[local683] & 0xFF;
			if (local786 == 0) {
				this.aShortArray2[local683] = (short) local4.method1642();
				this.aShortArray5[local683] = (short) local4.method1642();
				this.aShortArray8[local683] = (short) local4.method1642();
			}
			if (local786 == 1) {
				this.aShortArray2[local683] = (short) local9.method1642();
				this.aShortArray5[local683] = (short) local9.method1642();
				this.aShortArray8[local683] = (short) local9.method1642();
				this.aShortArray9[local683] = (short) local14.method1642();
				this.aShortArray4[local683] = (short) local14.method1642();
				this.aShortArray3[local683] = (short) local14.method1642();
				this.aByteArray10[local683] = local19.method1611();
				this.aByteArray7[local683] = local24.method1611();
				this.aByteArray16[local683] = local29.method1611();
			}
			if (local786 == 2) {
				this.aShortArray2[local683] = (short) local9.method1642();
				this.aShortArray5[local683] = (short) local9.method1642();
				this.aShortArray8[local683] = (short) local9.method1642();
				this.aShortArray9[local683] = (short) local14.method1642();
				this.aShortArray4[local683] = (short) local14.method1642();
				this.aShortArray3[local683] = (short) local14.method1642();
				this.aByteArray10[local683] = local19.method1611();
				this.aByteArray7[local683] = local24.method1611();
				this.aByteArray16[local683] = local29.method1611();
				this.aByteArray11[local683] = local29.method1611();
				this.aByteArray12[local683] = local29.method1611();
			}
			if (local786 == 3) {
				this.aShortArray2[local683] = (short) local9.method1642();
				this.aShortArray5[local683] = (short) local9.method1642();
				this.aShortArray8[local683] = (short) local9.method1642();
				this.aShortArray9[local683] = (short) local14.method1642();
				this.aShortArray4[local683] = (short) local14.method1642();
				this.aShortArray3[local683] = (short) local14.method1642();
				this.aByteArray10[local683] = local19.method1611();
				this.aByteArray7[local683] = local24.method1611();
				this.aByteArray16[local683] = local29.method1611();
			}
		}
		local4.anInt2195 = local113;
		local786 = local4.method1607();
		if (local786 == 0) {
			return;
		}
		new Class90();
		local4.method1642();
		local4.method1642();
		local4.method1642();
		local4.method1626();
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(SS)V")
	public void method513(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt467; local1++) {
			if (this.aShortArray7[local1] == arg0) {
				this.aShortArray7[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(III)V")
	public void method514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt465; local1++) {
			this.anIntArray61[local1] = this.anIntArray61[local1] * arg0 / 128;
			this.anIntArray69[local1] = this.anIntArray69[local1] * arg1 / 128;
			this.anIntArray70[local1] = this.anIntArray70[local1] * arg2 / 128;
		}
		this.method518();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "([[IIIIZI)Lclient!be;")
	public Class1_Sub2_Sub2_Sub1 method515(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method504();
		@Pc(6) int local6 = arg1 + this.aShort9;
		@Pc(11) int local11 = arg1 + this.aShort6;
		@Pc(16) int local16 = arg3 + this.aShort8;
		@Pc(21) int local21 = arg3 + this.aShort3;
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
		@Pc(101) Class1_Sub2_Sub2_Sub1 local101 = new Class1_Sub2_Sub2_Sub1();
		local101.anInt465 = this.anInt465;
		local101.anInt467 = this.anInt467;
		local101.anInt466 = this.anInt466;
		local101.anIntArray61 = this.anIntArray61;
		local101.anIntArray70 = this.anIntArray70;
		local101.anIntArray72 = this.anIntArray72;
		local101.anIntArray64 = this.anIntArray64;
		local101.anIntArray71 = this.anIntArray71;
		local101.aByteArray14 = this.aByteArray14;
		local101.aByteArray13 = this.aByteArray13;
		local101.aByteArray15 = this.aByteArray15;
		local101.aByteArray9 = this.aByteArray9;
		local101.aShortArray7 = this.aShortArray7;
		local101.aShortArray6 = this.aShortArray6;
		local101.aByte1 = this.aByte1;
		local101.aByteArray8 = this.aByteArray8;
		local101.aShortArray2 = this.aShortArray2;
		local101.aShortArray5 = this.aShortArray5;
		local101.aShortArray8 = this.aShortArray8;
		local101.aShortArray9 = this.aShortArray9;
		local101.aShortArray4 = this.aShortArray4;
		local101.aShortArray3 = this.aShortArray3;
		local101.aByteArray10 = this.aByteArray10;
		local101.aByteArray7 = this.aByteArray7;
		local101.aByteArray16 = this.aByteArray16;
		local101.aByteArray11 = this.aByteArray11;
		local101.aByteArray12 = this.aByteArray12;
		local101.anIntArray68 = this.anIntArray68;
		local101.anIntArray63 = this.anIntArray63;
		local101.anIntArrayArray5 = this.anIntArrayArray5;
		local101.anIntArrayArray6 = this.anIntArrayArray6;
		local101.aShort4 = this.aShort4;
		local101.aShort7 = this.aShort7;
		local101.anIntArray69 = new int[local101.anInt465];
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
			for (local245 = 0; local245 < local101.anInt465; local245++) {
				local253 = this.anIntArray61[local245] + arg1;
				local260 = this.anIntArray70[local245] + arg3;
				local264 = local253 & 0x7F;
				local268 = local260 & 0x7F;
				local272 = local253 >> 7;
				local276 = local260 >> 7;
				local298 = arg0[local272][local276] * (128 - local264) + arg0[local272 + 1][local276] * local264 >> 7;
				local324 = arg0[local272][local276 + 1] * (128 - local264) + arg0[local272 + 1][local276 + 1] * local264 >> 7;
				local336 = local298 * (128 - local268) + local324 * local268 >> 7;
				local101.anIntArray69[local245] = this.anIntArray69[local245] + local336 - arg2;
			}
		} else {
			for (local245 = 0; local245 < local101.anInt465; local245++) {
				local253 = (this.anIntArray69[local245] << 16) / super.aShort27;
				if (local253 < arg4) {
					local260 = this.anIntArray61[local245] + arg1;
					local264 = this.anIntArray70[local245] + arg3;
					local268 = local260 & 0x7F;
					local272 = local264 & 0x7F;
					local276 = local260 >> 7;
					local298 = local264 >> 7;
					local324 = arg0[local276][local298] * (128 - local268) + arg0[local276 + 1][local298] * local268 >> 7;
					local336 = arg0[local276][local298 + 1] * (128 - local268) + arg0[local276 + 1][local298 + 1] * local268 >> 7;
					@Pc(460) int local460 = local324 * (128 - local272) + local336 * local272 >> 7;
					local101.anIntArray69[local245] = this.anIntArray69[local245] + (local460 - arg2) * (arg4 - local253) / arg4;
				} else {
					local101.anIntArray69[local245] = this.anIntArray69[local245];
				}
			}
		}
		local101.method518();
		return local101;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!be;I)I")
	private int method516(@OriginalArg(0) Class1_Sub2_Sub2_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray61[arg1];
		@Pc(11) int local11 = arg0.anIntArray69[arg1];
		@Pc(16) int local16 = arg0.anIntArray70[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt465; local18++) {
			if (local6 == this.anIntArray61[local18] && local11 == this.anIntArray69[local18] && local16 == this.anIntArray70[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray61[this.anInt465] = local6;
			this.anIntArray69[this.anInt465] = local11;
			this.anIntArray70[this.anInt465] = local16;
			if (arg0.anIntArray68 != null) {
				this.anIntArray68[this.anInt465] = arg0.anIntArray68[arg1];
			}
			local1 = this.anInt465++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!be", name = "j", descriptor = "()V")
	public void method517() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt465; local1++) {
			@Pc(7) int local7 = this.anIntArray70[local1];
			this.anIntArray70[local1] = this.anIntArray61[local1];
			this.anIntArray61[local1] = -local7;
		}
		this.method518();
	}

	@OriginalMember(owner = "client!be", name = "k", descriptor = "()V")
	private void method518() {
		this.aClass89Array1 = null;
		this.aClass89Array2 = null;
		this.aClass29Array1 = null;
		this.aBoolean42 = false;
	}
}
