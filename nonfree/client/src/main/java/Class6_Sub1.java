import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!ai", name = "bb", descriptor = "[I")
	private int[] anIntArray19;

	@OriginalMember(owner = "client!ai", name = "cb", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!ai", name = "db", descriptor = "[S")
	public short[] aShortArray6;

	@OriginalMember(owner = "client!ai", name = "eb", descriptor = "S")
	private short aShort1;

	@OriginalMember(owner = "client!ai", name = "fb", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!ai", name = "gb", descriptor = "S")
	private short aShort3;

	@OriginalMember(owner = "client!ai", name = "hb", descriptor = "S")
	private short aShort4;

	@OriginalMember(owner = "client!ai", name = "ib", descriptor = "[I")
	public int[] anIntArray20;

	@OriginalMember(owner = "client!ai", name = "jb", descriptor = "[I")
	public int[] anIntArray21;

	@OriginalMember(owner = "client!ai", name = "kb", descriptor = "[S")
	public short[] aShortArray7;

	@OriginalMember(owner = "client!ai", name = "lb", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!ai", name = "mb", descriptor = "[B")
	public byte[] aByteArray1;

	@OriginalMember(owner = "client!ai", name = "nb", descriptor = "[I")
	public int[] anIntArray22;

	@OriginalMember(owner = "client!ai", name = "ob", descriptor = "[Lclient!je;")
	public Class46[] aClass46Array1;

	@OriginalMember(owner = "client!ai", name = "pb", descriptor = "[B")
	private byte[] aByteArray2;

	@OriginalMember(owner = "client!ai", name = "qb", descriptor = "[[I")
	public int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!ai", name = "sb", descriptor = "[I")
	public int[] anIntArray23;

	@OriginalMember(owner = "client!ai", name = "tb", descriptor = "S")
	private short aShort5;

	@OriginalMember(owner = "client!ai", name = "ub", descriptor = "S")
	public short aShort6;

	@OriginalMember(owner = "client!ai", name = "xb", descriptor = "[B")
	public byte[] aByteArray3;

	@OriginalMember(owner = "client!ai", name = "yb", descriptor = "[Lclient!cd;")
	public Class11[] aClass11Array1;

	@OriginalMember(owner = "client!ai", name = "zb", descriptor = "[I")
	public int[] anIntArray25;

	@OriginalMember(owner = "client!ai", name = "Ab", descriptor = "[[I")
	public int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!ai", name = "Bb", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!ai", name = "Cb", descriptor = "[S")
	public short[] aShortArray9;

	@OriginalMember(owner = "client!ai", name = "Db", descriptor = "[S")
	public short[] aShortArray10;

	@OriginalMember(owner = "client!ai", name = "Eb", descriptor = "[Lclient!cd;")
	public Class11[] aClass11Array2;

	@OriginalMember(owner = "client!ai", name = "Gb", descriptor = "[I")
	public int[] anIntArray26;

	@OriginalMember(owner = "client!ai", name = "Ib", descriptor = "[B")
	private byte[] aByteArray5;

	@OriginalMember(owner = "client!ai", name = "Jb", descriptor = "[S")
	public short[] aShortArray11;

	@OriginalMember(owner = "client!ai", name = "Kb", descriptor = "[B")
	private byte[] aByteArray6;

	@OriginalMember(owner = "client!ai", name = "Mb", descriptor = "[I")
	private int[] anIntArray28;

	@OriginalMember(owner = "client!ai", name = "Nb", descriptor = "[B")
	private byte[] aByteArray7;

	@OriginalMember(owner = "client!ai", name = "Ob", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!ai", name = "Pb", descriptor = "S")
	private short aShort7;

	@OriginalMember(owner = "client!ai", name = "Qb", descriptor = "S")
	private short aShort8;

	@OriginalMember(owner = "client!ai", name = "Sb", descriptor = "I")
	public int anInt253;

	@OriginalMember(owner = "client!ai", name = "Tb", descriptor = "[B")
	public byte[] aByteArray8;

	@OriginalMember(owner = "client!ai", name = "Wb", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!ai", name = "Xb", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!ai", name = "rb", descriptor = "I")
	public int anInt250 = 0;

	@OriginalMember(owner = "client!ai", name = "wb", descriptor = "I")
	public int anInt251 = 0;

	@OriginalMember(owner = "client!ai", name = "Fb", descriptor = "Z")
	private boolean aBoolean11 = false;

	@OriginalMember(owner = "client!ai", name = "Rb", descriptor = "B")
	public byte aByte1 = 0;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
	private Class6_Sub1() {
	}

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "([B)V")
	public Class6_Sub1(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method202(arg0);
		} else {
			this.method188(arg0);
		}
	}

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "([Lclient!ai;I)V")
	public Class6_Sub1(@OriginalArg(0) Class6_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt250 = 0;
		this.anInt251 = 0;
		this.anInt253 = 0;
		this.aByte1 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class6_Sub1 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt250 += local44.anInt250;
				this.anInt251 += local44.anInt251;
				this.anInt253 += local44.anInt253;
				if (local44.aByteArray3 == null) {
					if (this.aByte1 == -1) {
						this.aByte1 = local44.aByte1;
					}
					if (this.aByte1 != local44.aByte1) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray8 != null;
				local19 |= local44.aByteArray1 != null;
				local21 |= local44.anIntArray28 != null;
				local23 |= local44.aShortArray7 != null;
				local25 |= local44.aByteArray4 != null;
			}
		}
		this.anIntArray23 = new int[this.anInt250];
		this.anIntArray22 = new int[this.anInt250];
		this.anIntArray26 = new int[this.anInt250];
		this.anIntArray19 = new int[this.anInt250];
		this.anIntArray20 = new int[this.anInt251];
		this.anIntArray21 = new int[this.anInt251];
		this.anIntArray25 = new int[this.anInt251];
		if (local15) {
			this.aByteArray8 = new byte[this.anInt251];
		}
		if (local17) {
			this.aByteArray3 = new byte[this.anInt251];
		}
		if (local19) {
			this.aByteArray1 = new byte[this.anInt251];
		}
		if (local21) {
			this.anIntArray28 = new int[this.anInt251];
		}
		if (local23) {
			this.aShortArray7 = new short[this.anInt251];
		}
		if (local25) {
			this.aByteArray4 = new byte[this.anInt251];
		}
		this.aShortArray6 = new short[this.anInt251];
		if (this.anInt253 > 0) {
			this.aByteArray9 = new byte[this.anInt253];
			this.aShortArray11 = new short[this.anInt253];
			this.aShortArray9 = new short[this.anInt253];
			this.aShortArray10 = new short[this.anInt253];
			this.aShortArray5 = new short[this.anInt253];
			this.aShortArray8 = new short[this.anInt253];
			this.aShortArray12 = new short[this.anInt253];
			this.aByteArray5 = new byte[this.anInt253];
			this.aByteArray2 = new byte[this.anInt253];
			this.aByteArray10 = new byte[this.anInt253];
			this.aByteArray7 = new byte[this.anInt253];
			this.aByteArray6 = new byte[this.anInt253];
		}
		this.anInt250 = 0;
		this.anInt251 = 0;
		this.anInt253 = 0;
		for (@Pc(293) int local293 = 0; local293 < arg1; local293++) {
			@Pc(298) Class6_Sub1 local298 = arg0[local293];
			if (local298 != null) {
				for (@Pc(302) int local302 = 0; local302 < local298.anInt251; local302++) {
					if (local15 && local298.aByteArray8 != null) {
						this.aByteArray8[this.anInt251] = local298.aByteArray8[local302];
					}
					if (local17) {
						if (local298.aByteArray3 == null) {
							this.aByteArray3[this.anInt251] = local298.aByte1;
						} else {
							this.aByteArray3[this.anInt251] = local298.aByteArray3[local302];
						}
					}
					if (local19 && local298.aByteArray1 != null) {
						this.aByteArray1[this.anInt251] = local298.aByteArray1[local302];
					}
					if (local21 && local298.anIntArray28 != null) {
						this.anIntArray28[this.anInt251] = local298.anIntArray28[local302];
					}
					if (local23) {
						if (local298.aShortArray7 == null) {
							this.aShortArray7[this.anInt251] = -1;
						} else {
							this.aShortArray7[this.anInt251] = local298.aShortArray7[local302];
						}
					}
					if (local25) {
						if (local298.aByteArray4 == null || local298.aByteArray4[local302] == -1) {
							this.aByteArray4[this.anInt251] = -1;
						} else {
							this.aByteArray4[this.anInt251] = (byte) (local298.aByteArray4[local302] + this.anInt253);
						}
					}
					this.aShortArray6[this.anInt251] = local298.aShortArray6[local302];
					this.anIntArray20[this.anInt251] = this.method201(local298, local298.anIntArray20[local302]);
					this.anIntArray21[this.anInt251] = this.method201(local298, local298.anIntArray21[local302]);
					this.anIntArray25[this.anInt251] = this.method201(local298, local298.anIntArray25[local302]);
					this.anInt251++;
				}
				for (@Pc(477) int local477 = 0; local477 < local298.anInt253; local477++) {
					@Pc(489) byte local489 = this.aByteArray9[this.anInt253] = local298.aByteArray9[local477];
					if (local489 == 0) {
						this.aShortArray11[this.anInt253] = (short) this.method201(local298, local298.aShortArray11[local477]);
						this.aShortArray9[this.anInt253] = (short) this.method201(local298, local298.aShortArray9[local477]);
						this.aShortArray10[this.anInt253] = (short) this.method201(local298, local298.aShortArray10[local477]);
					}
					if (local489 >= 1 && local489 <= 3) {
						this.aShortArray11[this.anInt253] = local298.aShortArray11[local477];
						this.aShortArray9[this.anInt253] = local298.aShortArray9[local477];
						this.aShortArray10[this.anInt253] = local298.aShortArray10[local477];
						this.aShortArray5[this.anInt253] = local298.aShortArray5[local477];
						this.aShortArray8[this.anInt253] = local298.aShortArray8[local477];
						this.aShortArray12[this.anInt253] = local298.aShortArray12[local477];
						this.aByteArray5[this.anInt253] = local298.aByteArray5[local477];
						this.aByteArray2[this.anInt253] = local298.aByteArray2[local477];
						this.aByteArray10[this.anInt253] = local298.aByteArray10[local477];
					}
					if (local489 == 2) {
						this.aByteArray7[this.anInt253] = local298.aByteArray7[local477];
						this.aByteArray6[this.anInt253] = local298.aByteArray6[local477];
					}
					this.anInt253++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!ai;ZZZZ)V")
	public Class6_Sub1(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt250 = arg0.anInt250;
		this.anInt251 = arg0.anInt251;
		this.anInt253 = arg0.anInt253;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray23 = arg0.anIntArray23;
			this.anIntArray22 = arg0.anIntArray22;
			this.anIntArray26 = arg0.anIntArray26;
		} else {
			this.anIntArray23 = new int[this.anInt250];
			this.anIntArray22 = new int[this.anInt250];
			this.anIntArray26 = new int[this.anInt250];
			for (local57 = 0; local57 < this.anInt250; local57++) {
				this.anIntArray23[local57] = arg0.anIntArray23[local57];
				this.anIntArray22[local57] = arg0.anIntArray22[local57];
				this.anIntArray26[local57] = arg0.anIntArray26[local57];
			}
		}
		if (arg2) {
			this.aShortArray6 = arg0.aShortArray6;
		} else {
			this.aShortArray6 = new short[this.anInt251];
			for (local57 = 0; local57 < this.anInt251; local57++) {
				this.aShortArray6[local57] = arg0.aShortArray6[local57];
			}
		}
		if (arg3 || arg0.aShortArray7 == null) {
			this.aShortArray7 = arg0.aShortArray7;
		} else {
			this.aShortArray7 = new short[this.anInt251];
			for (local57 = 0; local57 < this.anInt251; local57++) {
				this.aShortArray7[local57] = arg0.aShortArray7[local57];
			}
		}
		this.aByteArray1 = arg0.aByteArray1;
		this.anIntArray20 = arg0.anIntArray20;
		this.anIntArray21 = arg0.anIntArray21;
		this.anIntArray25 = arg0.anIntArray25;
		this.aByteArray8 = arg0.aByteArray8;
		this.aByteArray3 = arg0.aByteArray3;
		this.aByteArray4 = arg0.aByteArray4;
		this.aByte1 = arg0.aByte1;
		this.aByteArray9 = arg0.aByteArray9;
		this.aShortArray11 = arg0.aShortArray11;
		this.aShortArray9 = arg0.aShortArray9;
		this.aShortArray10 = arg0.aShortArray10;
		this.aShortArray5 = arg0.aShortArray5;
		this.aShortArray8 = arg0.aShortArray8;
		this.aShortArray12 = arg0.aShortArray12;
		this.aByteArray5 = arg0.aByteArray5;
		this.aByteArray2 = arg0.aByteArray2;
		this.aByteArray10 = arg0.aByteArray10;
		this.aByteArray7 = arg0.aByteArray7;
		this.aByteArray6 = arg0.aByteArray6;
		this.anIntArray19 = arg0.anIntArray19;
		this.anIntArray28 = arg0.anIntArray28;
		this.anIntArrayArray4 = arg0.anIntArrayArray4;
		this.anIntArrayArray5 = arg0.anIntArrayArray5;
		this.aClass11Array1 = arg0.aClass11Array1;
		this.aClass46Array1 = arg0.aClass46Array1;
		this.aClass11Array2 = arg0.aClass11Array2;
		this.aShort6 = arg0.aShort6;
		this.aShort2 = arg0.aShort2;
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "()V")
	public void method180() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt250; local1++) {
			this.anIntArray26[local1] = -this.anIntArray26[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt251; local18++) {
			@Pc(24) int local24 = this.anIntArray20[local18];
			this.anIntArray20[local18] = this.anIntArray25[local18];
			this.anIntArray25[local18] = local24;
		}
		this.method198();
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "()V")
	public void method181() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt250; local1++) {
			this.anIntArray23[local1] = -this.anIntArray23[local1];
			this.anIntArray26[local1] = -this.anIntArray26[local1];
		}
		this.method198();
	}

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "()V")
	public void method182() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt250; local1++) {
			@Pc(7) int local7 = this.anIntArray23[local1];
			this.anIntArray23[local1] = this.anIntArray26[local1];
			this.anIntArray26[local1] = -local7;
		}
		this.method198();
	}

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "()V")
	public void method183() {
		this.anIntArray19 = null;
		this.anIntArray28 = null;
		this.anIntArrayArray4 = null;
		this.anIntArrayArray5 = null;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIII)Lclient!bf;")
	public Class6_Sub3 method184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class6_Sub3_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(III)V")
	public void method185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt250; local1++) {
			this.anIntArray23[local1] += arg0;
			this.anIntArray22[local1] += arg1;
			this.anIntArray26[local1] += arg2;
		}
		this.method198();
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
	public void method186() {
		@Pc(3) int local3 = Static10.anIntArray24[256];
		@Pc(7) int local7 = Static10.anIntArray27[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt250; local9++) {
			@Pc(26) int local26 = this.anIntArray26[local9] * local3 + this.anIntArray23[local9] * local7 >> 16;
			this.anIntArray26[local9] = this.anIntArray26[local9] * local7 - this.anIntArray23[local9] * local3 >> 16;
			this.anIntArray23[local9] = local26;
		}
		this.method198();
	}

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "()V")
	private void method187() {
		if (this.aBoolean11) {
			return;
		}
		this.aBoolean11 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt250; local20++) {
			@Pc(26) int local26 = this.anIntArray23[local20];
			@Pc(31) int local31 = this.anIntArray22[local20];
			@Pc(36) int local36 = this.anIntArray26[local20];
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
		this.aShort3 = (short) local8;
		this.aShort8 = (short) local14;
		this.aShort1 = (short) local10;
		this.aShort4 = (short) local16;
		this.aShort7 = (short) local12;
		this.aShort5 = (short) local18;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "([B)V")
	private void method188(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class1_Sub14 local8 = new Class1_Sub14(arg0);
		@Pc(13) Class1_Sub14 local13 = new Class1_Sub14(arg0);
		@Pc(18) Class1_Sub14 local18 = new Class1_Sub14(arg0);
		@Pc(23) Class1_Sub14 local23 = new Class1_Sub14(arg0);
		@Pc(28) Class1_Sub14 local28 = new Class1_Sub14(arg0);
		local8.anInt2306 = arg0.length - 18;
		@Pc(38) int local38 = local8.method1753();
		@Pc(42) int local42 = local8.method1753();
		@Pc(46) int local46 = local8.method1738();
		@Pc(50) int local50 = local8.method1738();
		@Pc(54) int local54 = local8.method1738();
		@Pc(58) int local58 = local8.method1738();
		@Pc(62) int local62 = local8.method1738();
		@Pc(66) int local66 = local8.method1738();
		@Pc(70) int local70 = local8.method1753();
		@Pc(74) int local74 = local8.method1753();
		@Pc(78) int local78 = local8.method1753();
		@Pc(82) int local82 = local8.method1753();
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
		this.anInt250 = local38;
		this.anInt251 = local42;
		this.anInt253 = local46;
		this.anIntArray23 = new int[local38];
		this.anIntArray22 = new int[local38];
		this.anIntArray26 = new int[local38];
		this.anIntArray20 = new int[local42];
		this.anIntArray21 = new int[local42];
		this.anIntArray25 = new int[local42];
		if (local46 > 0) {
			this.aByteArray9 = new byte[local46];
			this.aShortArray11 = new short[local46];
			this.aShortArray9 = new short[local46];
			this.aShortArray10 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray19 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray8 = new byte[local42];
			this.aByteArray4 = new byte[local42];
			this.aShortArray7 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray3 = new byte[local42];
		} else {
			this.aByte1 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray1 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray28 = new int[local42];
		}
		this.aShortArray6 = new short[local42];
		local8.anInt2306 = 0;
		local13.anInt2306 = local165;
		local18.anInt2306 = local171;
		local23.anInt2306 = local90;
		local28.anInt2306 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method1738();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method1733();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method1733();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method1733();
			}
			this.anIntArray23[local307] = local301 + local314;
			this.anIntArray22[local307] = local303 + local324;
			this.anIntArray26[local307] = local305 + local334;
			local301 = this.anIntArray23[local307];
			local303 = this.anIntArray22[local307];
			local305 = this.anIntArray26[local307];
			if (local66 == 1) {
				this.anIntArray19[local307] = local28.method1738();
			}
		}
		local8.anInt2306 = local149;
		local13.anInt2306 = local116;
		local18.anInt2306 = local98;
		local23.anInt2306 = local134;
		local28.anInt2306 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray6[local312] = (short) local8.method1753();
			if (local50 == 1) {
				local314 = local13.method1738();
				if ((local314 & 0x1) == 1) {
					this.aByteArray8[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray8[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray4[local312] = (byte) (local314 >> 2);
					this.aShortArray7[local312] = this.aShortArray6[local312];
					this.aShortArray6[local312] = 127;
					if (this.aShortArray7[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray4[local312] = -1;
					this.aShortArray7[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray3[local312] = local18.method1720();
			}
			if (local58 == 1) {
				this.aByteArray1[local312] = local23.method1720();
			}
			if (local62 == 1) {
				this.anIntArray28[local312] = local28.method1738();
			}
		}
		local8.anInt2306 = local143;
		local13.anInt2306 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method1738();
			if (local543 == 1) {
				local314 = local8.method1733() + local536;
				local324 = local8.method1733() + local314;
				local334 = local8.method1733() + local324;
				local536 = local334;
				this.anIntArray20[local538] = local314;
				this.anIntArray21[local538] = local324;
				this.anIntArray25[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method1733() + local536;
				local536 = local334;
				this.anIntArray20[local538] = local314;
				this.anIntArray21[local538] = local324;
				this.anIntArray25[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method1733() + local536;
				local536 = local334;
				this.anIntArray20[local538] = local314;
				this.anIntArray21[local538] = local324;
				this.anIntArray25[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method1733() + local536;
				local536 = local334;
				this.anIntArray20[local538] = local314;
				this.anIntArray21[local538] = local646;
				this.anIntArray25[local538] = local334;
			}
		}
		local8.anInt2306 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray9[local543] = 0;
			this.aShortArray11[local543] = (short) local8.method1753();
			this.aShortArray9[local543] = (short) local8.method1753();
			this.aShortArray10[local543] = (short) local8.method1753();
		}
		if (this.aByteArray4 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray4[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray11[local731] & 0xFFFF) == this.anIntArray20[local723] && (this.aShortArray9[local731] & 0xFFFF) == this.anIntArray21[local723] && (this.aShortArray10[local731] & 0xFFFF) == this.anIntArray25[local723]) {
						this.aByteArray4[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray4 = null;
			}
		}
		if (!local3) {
			this.aShortArray7 = null;
		}
		if (!local1) {
			this.aByteArray8 = null;
		}
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(III)V")
	public void method189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt250; local1++) {
			this.anIntArray23[local1] = this.anIntArray23[local1] * arg0 / 128;
			this.anIntArray22[local1] = this.anIntArray22[local1] * arg1 / 128;
			this.anIntArray26[local1] = this.anIntArray26[local1] * arg2 / 128;
		}
		this.method198();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "([[IIIIZIZ)Lclient!ai;")
	public Class6_Sub1 method191(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method187();
		@Pc(6) int local6 = arg1 + this.aShort3;
		@Pc(11) int local11 = arg1 + this.aShort8;
		@Pc(16) int local16 = arg3 + this.aShort7;
		@Pc(21) int local21 = arg3 + this.aShort5;
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
		@Pc(101) Class6_Sub1 local101 = new Class6_Sub1();
		local101.anInt250 = this.anInt250;
		local101.anInt251 = this.anInt251;
		local101.anInt253 = this.anInt253;
		local101.anIntArray23 = this.anIntArray23;
		local101.anIntArray26 = this.anIntArray26;
		local101.anIntArray20 = this.anIntArray20;
		local101.anIntArray21 = this.anIntArray21;
		local101.anIntArray25 = this.anIntArray25;
		local101.aByteArray8 = this.aByteArray8;
		local101.aByteArray3 = this.aByteArray3;
		local101.aByteArray1 = this.aByteArray1;
		local101.aByteArray4 = this.aByteArray4;
		local101.aShortArray6 = this.aShortArray6;
		local101.aShortArray7 = this.aShortArray7;
		local101.aByte1 = this.aByte1;
		local101.aByteArray9 = this.aByteArray9;
		local101.aShortArray11 = this.aShortArray11;
		local101.aShortArray9 = this.aShortArray9;
		local101.aShortArray10 = this.aShortArray10;
		local101.aShortArray5 = this.aShortArray5;
		local101.aShortArray8 = this.aShortArray8;
		local101.aShortArray12 = this.aShortArray12;
		local101.aByteArray5 = this.aByteArray5;
		local101.aByteArray2 = this.aByteArray2;
		local101.aByteArray10 = this.aByteArray10;
		local101.aByteArray7 = this.aByteArray7;
		local101.aByteArray6 = this.aByteArray6;
		local101.anIntArray19 = this.anIntArray19;
		local101.anIntArray28 = this.anIntArray28;
		local101.anIntArrayArray4 = this.anIntArrayArray4;
		local101.anIntArrayArray5 = this.anIntArrayArray5;
		local101.aShort6 = this.aShort6;
		local101.aShort2 = this.aShort2;
		local101.aClass11Array1 = this.aClass11Array1;
		local101.aClass46Array1 = this.aClass46Array1;
		local101.aClass11Array2 = this.aClass11Array2;
		local101.anIntArray22 = new int[local101.anInt250];
		@Pc(257) int local257;
		@Pc(265) int local265;
		@Pc(272) int local272;
		@Pc(276) int local276;
		@Pc(280) int local280;
		@Pc(284) int local284;
		@Pc(288) int local288;
		@Pc(310) int local310;
		@Pc(336) int local336;
		@Pc(348) int local348;
		if (arg4 == 0) {
			for (local257 = 0; local257 < local101.anInt250; local257++) {
				local265 = this.anIntArray23[local257] + arg1;
				local272 = this.anIntArray26[local257] + arg3;
				local276 = local265 & 0x7F;
				local280 = local272 & 0x7F;
				local284 = local265 >> 7;
				local288 = local272 >> 7;
				local310 = arg0[local284][local288] * (128 - local276) + arg0[local284 + 1][local288] * local276 >> 7;
				local336 = arg0[local284][local288 + 1] * (128 - local276) + arg0[local284 + 1][local288 + 1] * local276 >> 7;
				local348 = local310 * (128 - local280) + local336 * local280 >> 7;
				local101.anIntArray22[local257] = this.anIntArray22[local257] + local348 - arg2;
			}
		} else {
			for (local257 = 0; local257 < local101.anInt250; local257++) {
				local265 = (this.anIntArray22[local257] << 16) / this.aShort1;
				if (local265 < arg4) {
					local272 = this.anIntArray23[local257] + arg1;
					local276 = this.anIntArray26[local257] + arg3;
					local280 = local272 & 0x7F;
					local284 = local276 & 0x7F;
					local288 = local272 >> 7;
					local310 = local276 >> 7;
					local336 = arg0[local288][local310] * (128 - local280) + arg0[local288 + 1][local310] * local280 >> 7;
					local348 = arg0[local288][local310 + 1] * (128 - local280) + arg0[local288 + 1][local310 + 1] * local280 >> 7;
					@Pc(472) int local472 = local336 * (128 - local284) + local348 * local284 >> 7;
					local101.anIntArray22[local257] = this.anIntArray22[local257] + (local472 - arg2) * (arg4 - local265) / arg4;
				} else {
					local101.anIntArray22[local257] = this.anIntArray22[local257];
				}
			}
		}
		this.aBoolean11 = false;
		return local101;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(SS)V")
	public void method192(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray7 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt251; local5++) {
			if (this.aShortArray7[local5] == arg0) {
				this.aShortArray7[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "()V")
	public void method194() {
		if (this.aClass11Array1 != null) {
			return;
		}
		this.aClass11Array1 = new Class11[this.anInt250];
		for (@Pc(10) int local10 = 0; local10 < this.anInt250; local10++) {
			this.aClass11Array1[local10] = new Class11();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt251; local25++) {
			@Pc(31) int local31 = this.anIntArray20[local25];
			@Pc(36) int local36 = this.anIntArray21[local25];
			@Pc(41) int local41 = this.anIntArray25[local25];
			@Pc(51) int local51 = this.anIntArray23[local36] - this.anIntArray23[local31];
			@Pc(61) int local61 = this.anIntArray22[local36] - this.anIntArray22[local31];
			@Pc(71) int local71 = this.anIntArray26[local36] - this.anIntArray26[local31];
			@Pc(81) int local81 = this.anIntArray23[local41] - this.anIntArray23[local31];
			@Pc(91) int local91 = this.anIntArray22[local41] - this.anIntArray22[local31];
			@Pc(101) int local101 = this.anIntArray26[local41] - this.anIntArray26[local31];
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
			if (this.aByteArray8 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray8[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class11 local211 = this.aClass11Array1[local31];
				local211.anInt735 += local109;
				local211.anInt734 += local117;
				local211.anInt732 += local125;
				local211.anInt736++;
				@Pc(240) Class11 local240 = this.aClass11Array1[local36];
				local240.anInt735 += local109;
				local240.anInt734 += local117;
				local240.anInt732 += local125;
				local240.anInt736++;
				@Pc(269) Class11 local269 = this.aClass11Array1[local41];
				local269.anInt735 += local109;
				local269.anInt734 += local117;
				local269.anInt732 += local125;
				local269.anInt736++;
			} else if (local198 == 1) {
				if (this.aClass46Array1 == null) {
					this.aClass46Array1 = new Class46[this.anInt251];
				}
				@Pc(314) Class46 local314 = this.aClass46Array1[local25] = new Class46();
				local314.anInt2070 = local109;
				local314.anInt2071 = local117;
				local314.anInt2073 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "()Lclient!ai;")
	public Class6_Sub1 method195() {
		@Pc(3) Class6_Sub1 local3 = new Class6_Sub1();
		if (this.aByteArray8 != null) {
			local3.aByteArray8 = new byte[this.anInt251];
			for (@Pc(13) int local13 = 0; local13 < this.anInt251; local13++) {
				local3.aByteArray8[local13] = this.aByteArray8[local13];
			}
		}
		local3.anInt250 = this.anInt250;
		local3.anInt251 = this.anInt251;
		local3.anInt253 = this.anInt253;
		local3.anIntArray23 = this.anIntArray23;
		local3.anIntArray22 = this.anIntArray22;
		local3.anIntArray26 = this.anIntArray26;
		local3.anIntArray20 = this.anIntArray20;
		local3.anIntArray21 = this.anIntArray21;
		local3.anIntArray25 = this.anIntArray25;
		local3.aByteArray3 = this.aByteArray3;
		local3.aByteArray1 = this.aByteArray1;
		local3.aByteArray4 = this.aByteArray4;
		local3.aShortArray6 = this.aShortArray6;
		local3.aShortArray7 = this.aShortArray7;
		local3.aByte1 = this.aByte1;
		local3.aByteArray9 = this.aByteArray9;
		local3.aShortArray11 = this.aShortArray11;
		local3.aShortArray9 = this.aShortArray9;
		local3.aShortArray10 = this.aShortArray10;
		local3.aShortArray5 = this.aShortArray5;
		local3.aShortArray8 = this.aShortArray8;
		local3.aShortArray12 = this.aShortArray12;
		local3.aByteArray5 = this.aByteArray5;
		local3.aByteArray2 = this.aByteArray2;
		local3.aByteArray10 = this.aByteArray10;
		local3.aByteArray7 = this.aByteArray7;
		local3.aByteArray6 = this.aByteArray6;
		local3.anIntArray19 = this.anIntArray19;
		local3.anIntArray28 = this.anIntArray28;
		local3.anIntArrayArray4 = this.anIntArrayArray4;
		local3.anIntArrayArray5 = this.anIntArrayArray5;
		local3.aClass11Array1 = this.aClass11Array1;
		local3.aClass46Array1 = this.aClass46Array1;
		local3.aShort6 = this.aShort6;
		local3.aShort2 = this.aShort2;
		return local3;
	}

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "()V")
	public void method196() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt250; local1++) {
			@Pc(7) int local7 = this.anIntArray26[local1];
			this.anIntArray26[local1] = this.anIntArray23[local1];
			this.anIntArray23[local1] = -local7;
		}
		this.method198();
	}

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "()V")
	public void method197() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray19 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt250; local9++) {
				local15 = this.anIntArray19[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray4 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray4[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt250) {
				local65 = this.anIntArray19[local59];
				this.anIntArrayArray4[local65][local5[local65]++] = local59++;
			}
			this.anIntArray19 = null;
		}
		if (this.anIntArray28 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt251; local9++) {
			local15 = this.anIntArray28[local9];
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
		while (local59 < this.anInt251) {
			local65 = this.anIntArray28[local59];
			this.anIntArrayArray5[local65][local5[local65]++] = local59++;
		}
		this.anIntArray28 = null;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
	}

	@OriginalMember(owner = "client!ai", name = "m", descriptor = "()V")
	private void method198() {
		this.aClass11Array1 = null;
		this.aClass11Array2 = null;
		this.aClass46Array1 = null;
		this.aBoolean11 = false;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "()I")
	@Override
	public int method2984() {
		if (!this.aBoolean11) {
			this.method187();
		}
		return this.aShort1;
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "()Z")
	@Override
	public boolean method2986() {
		return true;
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(SS)V")
	public void method199(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt251; local1++) {
			if (this.aShortArray6[local1] == arg0) {
				this.aShortArray6[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!wg;IIIZ)V")
	@Override
	public void method2990(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class6_Sub1 local2 = (Class6_Sub1) arg0;
		local2.method187();
		local2.method194();
		Static10.anInt252++;
		@Pc(12) int local12 = 0;
		@Pc(15) int[] local15 = local2.anIntArray23;
		@Pc(18) int local18 = local2.anInt250;
		@Pc(36) int local36;
		for (@Pc(20) int local20 = 0; local20 < this.anInt250; local20++) {
			@Pc(26) Class11 local26 = this.aClass11Array1[local20];
			if (local26.anInt736 != 0) {
				local36 = this.anIntArray22[local20] - arg2;
				if (local36 >= local2.aShort1 && local36 <= local2.aShort4) {
					@Pc(52) int local52 = this.anIntArray23[local20] - arg1;
					if (local52 >= local2.aShort3 && local52 <= local2.aShort8) {
						@Pc(68) int local68 = this.anIntArray26[local20] - arg3;
						if (local68 >= local2.aShort7 && local68 <= local2.aShort5) {
							for (@Pc(79) int local79 = 0; local79 < local18; local79++) {
								@Pc(85) Class11 local85 = local2.aClass11Array1[local79];
								if (local52 == local15[local79] && local68 == local2.anIntArray26[local79] && local36 == local2.anIntArray22[local79] && local85.anInt736 != 0) {
									if (this.aClass11Array2 == null) {
										this.aClass11Array2 = new Class11[this.anInt250];
									}
									if (local2.aClass11Array2 == null) {
										local2.aClass11Array2 = new Class11[local18];
									}
									@Pc(125) Class11 local125 = this.aClass11Array2[local20];
									if (local125 == null) {
										local125 = this.aClass11Array2[local20] = new Class11(local26);
									}
									@Pc(142) Class11 local142 = local2.aClass11Array2[local79];
									if (local142 == null) {
										local142 = local2.aClass11Array2[local79] = new Class11(local85);
									}
									local125.anInt735 += local85.anInt735;
									local125.anInt734 += local85.anInt734;
									local125.anInt732 += local85.anInt732;
									local125.anInt736 += local85.anInt736;
									local142.anInt735 += local26.anInt735;
									local142.anInt734 += local26.anInt734;
									local142.anInt732 += local26.anInt732;
									local142.anInt736 += local26.anInt736;
									local12++;
									Static10.anIntArray29[local20] = Static10.anInt252;
									Static10.anIntArray30[local79] = Static10.anInt252;
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
		for (@Pc(236) int local236 = 0; local236 < this.anInt251; local236++) {
			if (Static10.anIntArray29[this.anIntArray20[local236]] == Static10.anInt252 && Static10.anIntArray29[this.anIntArray21[local236]] == Static10.anInt252 && Static10.anIntArray29[this.anIntArray25[local236]] == Static10.anInt252) {
				if (this.aByteArray8 == null) {
					this.aByteArray8 = new byte[this.anInt251];
				}
				this.aByteArray8[local236] = 2;
			}
		}
		for (local36 = 0; local36 < local2.anInt251; local36++) {
			if (Static10.anIntArray30[local2.anIntArray20[local36]] == Static10.anInt252 && Static10.anIntArray30[local2.anIntArray21[local36]] == Static10.anInt252 && Static10.anIntArray30[local2.anIntArray25[local36]] == Static10.anInt252) {
				if (local2.aByteArray8 == null) {
					local2.aByteArray8 = new byte[local2.anInt251];
				}
				local2.aByteArray8[local36] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(IIIII)Lclient!h;")
	public Class6_Sub3_Sub1 method200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class6_Sub3_Sub1(this, arg0, arg1, -50, -10, -50);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!ai;I)I")
	private int method201(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray23[arg1];
		@Pc(11) int local11 = arg0.anIntArray22[arg1];
		@Pc(16) int local16 = arg0.anIntArray26[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt250; local18++) {
			if (local6 == this.anIntArray23[local18] && local11 == this.anIntArray22[local18] && local16 == this.anIntArray26[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray23[this.anInt250] = local6;
			this.anIntArray22[this.anInt250] = local11;
			this.anIntArray26[this.anInt250] = local16;
			if (arg0.anIntArray19 != null) {
				this.anIntArray19[this.anInt250] = arg0.anIntArray19[arg1];
			}
			local1 = this.anInt250++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "([B)V")
	private void method202(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class1_Sub14 local4 = new Class1_Sub14(arg0);
		@Pc(9) Class1_Sub14 local9 = new Class1_Sub14(arg0);
		@Pc(14) Class1_Sub14 local14 = new Class1_Sub14(arg0);
		@Pc(19) Class1_Sub14 local19 = new Class1_Sub14(arg0);
		@Pc(24) Class1_Sub14 local24 = new Class1_Sub14(arg0);
		@Pc(29) Class1_Sub14 local29 = new Class1_Sub14(arg0);
		@Pc(34) Class1_Sub14 local34 = new Class1_Sub14(arg0);
		local4.anInt2306 = arg0.length - 23;
		@Pc(44) int local44 = local4.method1753();
		@Pc(48) int local48 = local4.method1753();
		@Pc(52) int local52 = local4.method1738();
		@Pc(56) int local56 = local4.method1738();
		@Pc(60) int local60 = local4.method1738();
		@Pc(64) int local64 = local4.method1738();
		@Pc(68) int local68 = local4.method1738();
		@Pc(72) int local72 = local4.method1738();
		@Pc(76) int local76 = local4.method1738();
		@Pc(80) int local80 = local4.method1753();
		@Pc(84) int local84 = local4.method1753();
		@Pc(88) int local88 = local4.method1753();
		@Pc(92) int local92 = local4.method1753();
		@Pc(96) int local96 = local4.method1753();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray9 = new byte[local52];
			local4.anInt2306 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray9[local113] = local4.method1720();
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
		this.anInt250 = local44;
		this.anInt251 = local48;
		this.anInt253 = local52;
		this.anIntArray23 = new int[local44];
		this.anIntArray22 = new int[local44];
		this.anIntArray26 = new int[local44];
		this.anIntArray20 = new int[local48];
		this.anIntArray21 = new int[local48];
		this.anIntArray25 = new int[local48];
		if (local76 == 1) {
			this.anIntArray19 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray8 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray3 = new byte[local48];
		} else {
			this.aByte1 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray1 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray28 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray7 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray4 = new byte[local48];
		}
		this.aShortArray6 = new short[local48];
		if (local52 > 0) {
			this.aShortArray11 = new short[local52];
			this.aShortArray9 = new short[local52];
			this.aShortArray10 = new short[local52];
			if (local100 > 0) {
				this.aShortArray5 = new short[local100];
				this.aShortArray8 = new short[local100];
				this.aShortArray12 = new short[local100];
				this.aByteArray5 = new byte[local100];
				this.aByteArray2 = new byte[local100];
				this.aByteArray10 = new byte[local100];
			}
			if (local102 > 0) {
				this.aByteArray7 = new byte[local102];
				this.aByteArray6 = new byte[local102];
			}
		}
		local4.anInt2306 = local52;
		local9.anInt2306 = local233;
		local14.anInt2306 = local239;
		local19.anInt2306 = local245;
		local24.anInt2306 = local184;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(461) int local461 = 0;
		@Pc(468) int local468;
		@Pc(470) int local470;
		@Pc(480) int local480;
		@Pc(490) int local490;
		for (@Pc(463) int local463 = 0; local463 < local44; local463++) {
			local468 = local4.method1738();
			local470 = 0;
			if ((local468 & 0x1) != 0) {
				local470 = local9.method1733();
			}
			local480 = 0;
			if ((local468 & 0x2) != 0) {
				local480 = local14.method1733();
			}
			local490 = 0;
			if ((local468 & 0x4) != 0) {
				local490 = local19.method1733();
			}
			this.anIntArray23[local463] = local457 + local470;
			this.anIntArray22[local463] = local459 + local480;
			this.anIntArray26[local463] = local461 + local490;
			local457 = this.anIntArray23[local463];
			local459 = this.anIntArray22[local463];
			local461 = this.anIntArray26[local463];
			if (local76 == 1) {
				this.anIntArray19[local463] = local24.method1738();
			}
		}
		local4.anInt2306 = local225;
		local9.anInt2306 = local151;
		local14.anInt2306 = local166;
		local19.anInt2306 = local193;
		local24.anInt2306 = local175;
		local29.anInt2306 = local208;
		local34.anInt2306 = local219;
		for (local468 = 0; local468 < local48; local468++) {
			this.aShortArray6[local468] = (short) local4.method1753();
			if (local56 == 1) {
				this.aByteArray8[local468] = local9.method1720();
			}
			if (local60 == 255) {
				this.aByteArray3[local468] = local14.method1720();
			}
			if (local64 == 1) {
				this.aByteArray1[local468] = local19.method1720();
			}
			if (local68 == 1) {
				this.anIntArray28[local468] = local24.method1738();
			}
			if (local72 == 1) {
				this.aShortArray7[local468] = (short) (local29.method1753() - 1);
			}
			if (this.aByteArray4 != null) {
				if (this.aShortArray7[local468] == -1) {
					this.aByteArray4[local468] = -1;
				} else {
					this.aByteArray4[local468] = (byte) (local34.method1738() - 1);
				}
			}
		}
		local4.anInt2306 = local202;
		local9.anInt2306 = local160;
		local470 = 0;
		local480 = 0;
		local490 = 0;
		@Pc(676) int local676 = 0;
		@Pc(683) int local683;
		@Pc(786) int local786;
		for (@Pc(678) int local678 = 0; local678 < local48; local678++) {
			local683 = local9.method1738();
			if (local683 == 1) {
				local470 = local4.method1733() + local676;
				local480 = local4.method1733() + local470;
				local490 = local4.method1733() + local480;
				local676 = local490;
				this.anIntArray20[local678] = local470;
				this.anIntArray21[local678] = local480;
				this.anIntArray25[local678] = local490;
			}
			if (local683 == 2) {
				local480 = local490;
				local490 = local4.method1733() + local676;
				local676 = local490;
				this.anIntArray20[local678] = local470;
				this.anIntArray21[local678] = local480;
				this.anIntArray25[local678] = local490;
			}
			if (local683 == 3) {
				local470 = local490;
				local490 = local4.method1733() + local676;
				local676 = local490;
				this.anIntArray20[local678] = local470;
				this.anIntArray21[local678] = local480;
				this.anIntArray25[local678] = local490;
			}
			if (local683 == 4) {
				local786 = local470;
				local470 = local480;
				local480 = local786;
				local490 = local4.method1733() + local676;
				local676 = local490;
				this.anIntArray20[local678] = local470;
				this.anIntArray21[local678] = local786;
				this.anIntArray25[local678] = local490;
			}
		}
		local4.anInt2306 = local251;
		local9.anInt2306 = local259;
		local14.anInt2306 = local267;
		local19.anInt2306 = local275;
		local24.anInt2306 = local281;
		local29.anInt2306 = local287;
		for (local683 = 0; local683 < local52; local683++) {
			local786 = this.aByteArray9[local683] & 0xFF;
			if (local786 == 0) {
				this.aShortArray11[local683] = (short) local4.method1753();
				this.aShortArray9[local683] = (short) local4.method1753();
				this.aShortArray10[local683] = (short) local4.method1753();
			}
			if (local786 == 1) {
				this.aShortArray11[local683] = (short) local9.method1753();
				this.aShortArray9[local683] = (short) local9.method1753();
				this.aShortArray10[local683] = (short) local9.method1753();
				this.aShortArray5[local683] = (short) local14.method1753();
				this.aShortArray8[local683] = (short) local14.method1753();
				this.aShortArray12[local683] = (short) local14.method1753();
				this.aByteArray5[local683] = local19.method1720();
				this.aByteArray2[local683] = local24.method1720();
				this.aByteArray10[local683] = local29.method1720();
			}
			if (local786 == 2) {
				this.aShortArray11[local683] = (short) local9.method1753();
				this.aShortArray9[local683] = (short) local9.method1753();
				this.aShortArray10[local683] = (short) local9.method1753();
				this.aShortArray5[local683] = (short) local14.method1753();
				this.aShortArray8[local683] = (short) local14.method1753();
				this.aShortArray12[local683] = (short) local14.method1753();
				this.aByteArray5[local683] = local19.method1720();
				this.aByteArray2[local683] = local24.method1720();
				this.aByteArray10[local683] = local29.method1720();
				this.aByteArray7[local683] = local29.method1720();
				this.aByteArray6[local683] = local29.method1720();
			}
			if (local786 == 3) {
				this.aShortArray11[local683] = (short) local9.method1753();
				this.aShortArray9[local683] = (short) local9.method1753();
				this.aShortArray10[local683] = (short) local9.method1753();
				this.aShortArray5[local683] = (short) local14.method1753();
				this.aShortArray8[local683] = (short) local14.method1753();
				this.aShortArray12[local683] = (short) local14.method1753();
				this.aByteArray5[local683] = local19.method1720();
				this.aByteArray2[local683] = local24.method1720();
				this.aByteArray10[local683] = local29.method1720();
			}
		}
		local4.anInt2306 = local113;
		local786 = local4.method1738();
		if (local786 != 0) {
			local4.method1753();
			local4.method1753();
			local4.method1753();
			local4.method1700();
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)Lclient!wg;")
	@Override
	public Class6 method2988() {
		return this.method184(this.aShort6, this.aShort2, -50, -10, -50);
	}
}
