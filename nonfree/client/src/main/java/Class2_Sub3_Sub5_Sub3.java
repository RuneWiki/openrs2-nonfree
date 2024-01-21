import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class2_Sub3_Sub5_Sub3 extends Class2_Sub3_Sub5 {

	@OriginalMember(owner = "client!mc", name = "K", descriptor = "I")
	public int anInt2468;

	@OriginalMember(owner = "client!mc", name = "L", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!mc", name = "M", descriptor = "S")
	public short aShort6;

	@OriginalMember(owner = "client!mc", name = "N", descriptor = "[I")
	private int[] anIntArray192;

	@OriginalMember(owner = "client!mc", name = "O", descriptor = "[I")
	public int[] anIntArray193;

	@OriginalMember(owner = "client!mc", name = "P", descriptor = "S")
	public short aShort7;

	@OriginalMember(owner = "client!mc", name = "R", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!mc", name = "S", descriptor = "[Lclient!kg;")
	public Class47[] aClass47Array1;

	@OriginalMember(owner = "client!mc", name = "X", descriptor = "[S")
	public short[] aShortArray16;

	@OriginalMember(owner = "client!mc", name = "Y", descriptor = "[I")
	public int[] anIntArray195;

	@OriginalMember(owner = "client!mc", name = "Z", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!mc", name = "ab", descriptor = "[I")
	public int[] anIntArray196;

	@OriginalMember(owner = "client!mc", name = "bb", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!mc", name = "cb", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!mc", name = "db", descriptor = "[S")
	public short[] aShortArray19;

	@OriginalMember(owner = "client!mc", name = "eb", descriptor = "S")
	public short aShort8;

	@OriginalMember(owner = "client!mc", name = "fb", descriptor = "[I")
	public int[] anIntArray197;

	@OriginalMember(owner = "client!mc", name = "gb", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!mc", name = "ib", descriptor = "[Lclient!ge;")
	public Class29[] aClass29Array1;

	@OriginalMember(owner = "client!mc", name = "kb", descriptor = "[S")
	public short[] aShortArray20;

	@OriginalMember(owner = "client!mc", name = "mb", descriptor = "S")
	public short aShort9;

	@OriginalMember(owner = "client!mc", name = "nb", descriptor = "[I")
	private int[] anIntArray200;

	@OriginalMember(owner = "client!mc", name = "ob", descriptor = "[B")
	private byte[] aByteArray22;

	@OriginalMember(owner = "client!mc", name = "pb", descriptor = "[B")
	private byte[] aByteArray23;

	@OriginalMember(owner = "client!mc", name = "qb", descriptor = "[[I")
	public int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!mc", name = "rb", descriptor = "[B")
	private byte[] aByteArray24;

	@OriginalMember(owner = "client!mc", name = "sb", descriptor = "S")
	public short aShort10;

	@OriginalMember(owner = "client!mc", name = "tb", descriptor = "[I")
	public int[] anIntArray201;

	@OriginalMember(owner = "client!mc", name = "ub", descriptor = "[B")
	public byte[] aByteArray25;

	@OriginalMember(owner = "client!mc", name = "vb", descriptor = "[S")
	public short[] aShortArray21;

	@OriginalMember(owner = "client!mc", name = "wb", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!mc", name = "xb", descriptor = "[[I")
	public int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!mc", name = "zb", descriptor = "S")
	public short aShort11;

	@OriginalMember(owner = "client!mc", name = "Ab", descriptor = "[B")
	private byte[] aByteArray26;

	@OriginalMember(owner = "client!mc", name = "Bb", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!mc", name = "Cb", descriptor = "[Lclient!kg;")
	public Class47[] aClass47Array2;

	@OriginalMember(owner = "client!mc", name = "Db", descriptor = "S")
	public short aShort12;

	@OriginalMember(owner = "client!mc", name = "Fb", descriptor = "[I")
	public int[] anIntArray203;

	@OriginalMember(owner = "client!mc", name = "Gb", descriptor = "[S")
	public short[] aShortArray23;

	@OriginalMember(owner = "client!mc", name = "T", descriptor = "Z")
	private boolean aBoolean97 = false;

	@OriginalMember(owner = "client!mc", name = "V", descriptor = "B")
	public byte aByte3 = 0;

	@OriginalMember(owner = "client!mc", name = "lb", descriptor = "I")
	public int anInt2470 = 0;

	@OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
	public int anInt2469 = 0;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
	private Class2_Sub3_Sub5_Sub3() {
	}

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "([B)V")
	public Class2_Sub3_Sub5_Sub3(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1635(arg0);
		} else {
			this.method1632(arg0);
		}
	}

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "([Lclient!mc;I)V")
	public Class2_Sub3_Sub5_Sub3(@OriginalArg(0) Class2_Sub3_Sub5_Sub3[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt2470 = 0;
		this.anInt2469 = 0;
		this.anInt2468 = 0;
		this.aByte3 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class2_Sub3_Sub5_Sub3 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt2470 += local44.anInt2470;
				this.anInt2469 += local44.anInt2469;
				this.anInt2468 += local44.anInt2468;
				if (local44.aByteArray20 == null) {
					if (this.aByte3 == -1) {
						this.aByte3 = local44.aByte3;
					}
					if (this.aByte3 != local44.aByte3) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray25 != null;
				local19 |= local44.aByteArray19 != null;
				local21 |= local44.anIntArray192 != null;
				local23 |= local44.aShortArray20 != null;
				local25 |= local44.aByteArray21 != null;
			}
		}
		this.anIntArray201 = new int[this.anInt2470];
		this.anIntArray196 = new int[this.anInt2470];
		this.anIntArray193 = new int[this.anInt2470];
		this.anIntArray200 = new int[this.anInt2470];
		this.anIntArray195 = new int[this.anInt2469];
		this.anIntArray203 = new int[this.anInt2469];
		this.anIntArray197 = new int[this.anInt2469];
		if (local15) {
			this.aByteArray25 = new byte[this.anInt2469];
		}
		if (local17) {
			this.aByteArray20 = new byte[this.anInt2469];
		}
		if (local19) {
			this.aByteArray19 = new byte[this.anInt2469];
		}
		if (local21) {
			this.anIntArray192 = new int[this.anInt2469];
		}
		if (local23) {
			this.aShortArray20 = new short[this.anInt2469];
		}
		if (local25) {
			this.aByteArray21 = new byte[this.anInt2469];
		}
		this.aShortArray23 = new short[this.anInt2469];
		if (this.anInt2468 > 0) {
			this.aByteArray27 = new byte[this.anInt2468];
			this.aShortArray19 = new short[this.anInt2468];
			this.aShortArray21 = new short[this.anInt2468];
			this.aShortArray16 = new short[this.anInt2468];
			this.aShortArray18 = new short[this.anInt2468];
			this.aShortArray17 = new short[this.anInt2468];
			this.aShortArray22 = new short[this.anInt2468];
			this.aByteArray23 = new byte[this.anInt2468];
			this.aByteArray18 = new byte[this.anInt2468];
			this.aByteArray24 = new byte[this.anInt2468];
			this.aByteArray22 = new byte[this.anInt2468];
			this.aByteArray26 = new byte[this.anInt2468];
		}
		this.anInt2470 = 0;
		this.anInt2469 = 0;
		this.anInt2468 = 0;
		for (@Pc(293) int local293 = 0; local293 < arg1; local293++) {
			@Pc(298) Class2_Sub3_Sub5_Sub3 local298 = arg0[local293];
			if (local298 != null) {
				for (@Pc(302) int local302 = 0; local302 < local298.anInt2469; local302++) {
					if (local15 && local298.aByteArray25 != null) {
						this.aByteArray25[this.anInt2469] = local298.aByteArray25[local302];
					}
					if (local17) {
						if (local298.aByteArray20 == null) {
							this.aByteArray20[this.anInt2469] = local298.aByte3;
						} else {
							this.aByteArray20[this.anInt2469] = local298.aByteArray20[local302];
						}
					}
					if (local19 && local298.aByteArray19 != null) {
						this.aByteArray19[this.anInt2469] = local298.aByteArray19[local302];
					}
					if (local21 && local298.anIntArray192 != null) {
						this.anIntArray192[this.anInt2469] = local298.anIntArray192[local302];
					}
					if (local23) {
						if (local298.aShortArray20 == null) {
							this.aShortArray20[this.anInt2469] = -1;
						} else {
							this.aShortArray20[this.anInt2469] = local298.aShortArray20[local302];
						}
					}
					if (local25) {
						if (local298.aByteArray21 == null || local298.aByteArray21[local302] == -1) {
							this.aByteArray21[this.anInt2469] = -1;
						} else {
							this.aByteArray21[this.anInt2469] = (byte) (local298.aByteArray21[local302] + this.anInt2468);
						}
					}
					this.aShortArray23[this.anInt2469] = local298.aShortArray23[local302];
					this.anIntArray195[this.anInt2469] = this.method1626(local298, local298.anIntArray195[local302]);
					this.anIntArray203[this.anInt2469] = this.method1626(local298, local298.anIntArray203[local302]);
					this.anIntArray197[this.anInt2469] = this.method1626(local298, local298.anIntArray197[local302]);
					this.anInt2469++;
				}
				for (@Pc(477) int local477 = 0; local477 < local298.anInt2468; local477++) {
					@Pc(489) byte local489 = this.aByteArray27[this.anInt2468] = local298.aByteArray27[local477];
					if (local489 == 0) {
						this.aShortArray19[this.anInt2468] = (short) this.method1626(local298, local298.aShortArray19[local477]);
						this.aShortArray21[this.anInt2468] = (short) this.method1626(local298, local298.aShortArray21[local477]);
						this.aShortArray16[this.anInt2468] = (short) this.method1626(local298, local298.aShortArray16[local477]);
					}
					if (local489 >= 1 && local489 <= 3) {
						this.aShortArray19[this.anInt2468] = local298.aShortArray19[local477];
						this.aShortArray21[this.anInt2468] = local298.aShortArray21[local477];
						this.aShortArray16[this.anInt2468] = local298.aShortArray16[local477];
						this.aShortArray18[this.anInt2468] = local298.aShortArray18[local477];
						this.aShortArray17[this.anInt2468] = local298.aShortArray17[local477];
						this.aShortArray22[this.anInt2468] = local298.aShortArray22[local477];
						this.aByteArray23[this.anInt2468] = local298.aByteArray23[local477];
						this.aByteArray18[this.anInt2468] = local298.aByteArray18[local477];
						this.aByteArray24[this.anInt2468] = local298.aByteArray24[local477];
					}
					if (local489 == 2) {
						this.aByteArray22[this.anInt2468] = local298.aByteArray22[local477];
						this.aByteArray26[this.anInt2468] = local298.aByteArray26[local477];
					}
					this.anInt2468++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!mc;ZZZZ)V")
	public Class2_Sub3_Sub5_Sub3(@OriginalArg(0) Class2_Sub3_Sub5_Sub3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2470 = arg0.anInt2470;
		this.anInt2469 = arg0.anInt2469;
		this.anInt2468 = arg0.anInt2468;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray201 = arg0.anIntArray201;
			this.anIntArray196 = arg0.anIntArray196;
			this.anIntArray193 = arg0.anIntArray193;
		} else {
			this.anIntArray201 = new int[this.anInt2470];
			this.anIntArray196 = new int[this.anInt2470];
			this.anIntArray193 = new int[this.anInt2470];
			for (local57 = 0; local57 < this.anInt2470; local57++) {
				this.anIntArray201[local57] = arg0.anIntArray201[local57];
				this.anIntArray196[local57] = arg0.anIntArray196[local57];
				this.anIntArray193[local57] = arg0.anIntArray193[local57];
			}
		}
		if (arg2) {
			this.aShortArray23 = arg0.aShortArray23;
		} else {
			this.aShortArray23 = new short[this.anInt2469];
			for (local57 = 0; local57 < this.anInt2469; local57++) {
				this.aShortArray23[local57] = arg0.aShortArray23[local57];
			}
		}
		if (arg3 || arg0.aShortArray20 == null) {
			this.aShortArray20 = arg0.aShortArray20;
		} else {
			this.aShortArray20 = new short[this.anInt2469];
			for (local57 = 0; local57 < this.anInt2469; local57++) {
				this.aShortArray20[local57] = arg0.aShortArray20[local57];
			}
		}
		this.aByteArray19 = arg0.aByteArray19;
		this.anIntArray195 = arg0.anIntArray195;
		this.anIntArray203 = arg0.anIntArray203;
		this.anIntArray197 = arg0.anIntArray197;
		this.aByteArray25 = arg0.aByteArray25;
		this.aByteArray20 = arg0.aByteArray20;
		this.aByteArray21 = arg0.aByteArray21;
		this.aByte3 = arg0.aByte3;
		this.aByteArray27 = arg0.aByteArray27;
		this.aShortArray19 = arg0.aShortArray19;
		this.aShortArray21 = arg0.aShortArray21;
		this.aShortArray16 = arg0.aShortArray16;
		this.aShortArray18 = arg0.aShortArray18;
		this.aShortArray17 = arg0.aShortArray17;
		this.aShortArray22 = arg0.aShortArray22;
		this.aByteArray23 = arg0.aByteArray23;
		this.aByteArray18 = arg0.aByteArray18;
		this.aByteArray24 = arg0.aByteArray24;
		this.aByteArray22 = arg0.aByteArray22;
		this.aByteArray26 = arg0.aByteArray26;
		this.anIntArray200 = arg0.anIntArray200;
		this.anIntArray192 = arg0.anIntArray192;
		this.anIntArrayArray42 = arg0.anIntArrayArray42;
		this.anIntArrayArray43 = arg0.anIntArrayArray43;
		this.aClass47Array2 = arg0.aClass47Array2;
		this.aClass29Array1 = arg0.aClass29Array1;
		this.aClass47Array1 = arg0.aClass47Array1;
		this.aShort12 = arg0.aShort12;
		this.aShort8 = arg0.aShort8;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!mc;I)I")
	private int method1626(@OriginalArg(0) Class2_Sub3_Sub5_Sub3 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray201[arg1];
		@Pc(11) int local11 = arg0.anIntArray196[arg1];
		@Pc(16) int local16 = arg0.anIntArray193[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2470; local18++) {
			if (local6 == this.anIntArray201[local18] && local11 == this.anIntArray196[local18] && local16 == this.anIntArray193[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray201[this.anInt2470] = local6;
			this.anIntArray196[this.anInt2470] = local11;
			this.anIntArray193[this.anInt2470] = local16;
			if (arg0.anIntArray200 != null) {
				this.anIntArray200[this.anInt2470] = arg0.anIntArray200[arg1];
			}
			local1 = this.anInt2470++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIII)Lclient!sd;")
	public Class2_Sub3_Sub5_Sub7_Sub1 method1627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class2_Sub3_Sub5_Sub7_Sub1(this, arg0, arg1, -50, -10, -50);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)V")
	public void method1628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2470; local1++) {
			this.anIntArray201[local1] = this.anIntArray201[local1] * arg0 / 128;
			this.anIntArray196[local1] = this.anIntArray196[local1] * arg1 / 128;
			this.anIntArray193[local1] = this.anIntArray193[local1] * arg2 / 128;
		}
		this.method1641();
	}

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)V")
	public void method1629() {
		@Pc(3) int local3 = Static99.anIntArray198[256];
		@Pc(7) int local7 = Static99.anIntArray194[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2470; local9++) {
			@Pc(26) int local26 = this.anIntArray193[local9] * local3 + this.anIntArray201[local9] * local7 >> 16;
			this.anIntArray193[local9] = this.anIntArray193[local9] * local7 - this.anIntArray201[local9] * local3 >> 16;
			this.anIntArray201[local9] = local26;
		}
		this.method1641();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "()V")
	public void method1630() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2470; local1++) {
			@Pc(7) int local7 = this.anIntArray201[local1];
			this.anIntArray201[local1] = this.anIntArray193[local1];
			this.anIntArray193[local1] = -local7;
		}
		this.method1641();
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "()V")
	public void method1631() {
		if (this.aBoolean97) {
			return;
		}
		this.aBoolean97 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt2470; local20++) {
			@Pc(26) int local26 = this.anIntArray201[local20];
			@Pc(31) int local31 = this.anIntArray196[local20];
			@Pc(36) int local36 = this.anIntArray193[local20];
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
		this.aShort10 = (short) local8;
		this.aShort11 = (short) local14;
		super.aShort25 = (short) local10;
		this.aShort9 = (short) local16;
		this.aShort6 = (short) local12;
		this.aShort7 = (short) local18;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([B)V")
	private void method1632(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class2_Sub13 local8 = new Class2_Sub13(arg0);
		@Pc(13) Class2_Sub13 local13 = new Class2_Sub13(arg0);
		@Pc(18) Class2_Sub13 local18 = new Class2_Sub13(arg0);
		@Pc(23) Class2_Sub13 local23 = new Class2_Sub13(arg0);
		@Pc(28) Class2_Sub13 local28 = new Class2_Sub13(arg0);
		local8.anInt2154 = arg0.length - 18;
		@Pc(38) int local38 = local8.method1397();
		@Pc(42) int local42 = local8.method1397();
		@Pc(46) int local46 = local8.method1402();
		@Pc(50) int local50 = local8.method1402();
		@Pc(54) int local54 = local8.method1402();
		@Pc(58) int local58 = local8.method1402();
		@Pc(62) int local62 = local8.method1402();
		@Pc(66) int local66 = local8.method1402();
		@Pc(70) int local70 = local8.method1397();
		@Pc(74) int local74 = local8.method1397();
		@Pc(78) int local78 = local8.method1397();
		@Pc(82) int local82 = local8.method1397();
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
		this.anInt2470 = local38;
		this.anInt2469 = local42;
		this.anInt2468 = local46;
		this.anIntArray201 = new int[local38];
		this.anIntArray196 = new int[local38];
		this.anIntArray193 = new int[local38];
		this.anIntArray195 = new int[local42];
		this.anIntArray203 = new int[local42];
		this.anIntArray197 = new int[local42];
		if (local46 > 0) {
			this.aByteArray27 = new byte[local46];
			this.aShortArray19 = new short[local46];
			this.aShortArray21 = new short[local46];
			this.aShortArray16 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray200 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray25 = new byte[local42];
			this.aByteArray21 = new byte[local42];
			this.aShortArray20 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray20 = new byte[local42];
		} else {
			this.aByte3 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray19 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray192 = new int[local42];
		}
		this.aShortArray23 = new short[local42];
		local8.anInt2154 = 0;
		local13.anInt2154 = local165;
		local18.anInt2154 = local171;
		local23.anInt2154 = local90;
		local28.anInt2154 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method1402();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method1429();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method1429();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method1429();
			}
			this.anIntArray201[local307] = local301 + local314;
			this.anIntArray196[local307] = local303 + local324;
			this.anIntArray193[local307] = local305 + local334;
			local301 = this.anIntArray201[local307];
			local303 = this.anIntArray196[local307];
			local305 = this.anIntArray193[local307];
			if (local66 == 1) {
				this.anIntArray200[local307] = local28.method1402();
			}
		}
		local8.anInt2154 = local149;
		local13.anInt2154 = local116;
		local18.anInt2154 = local98;
		local23.anInt2154 = local134;
		local28.anInt2154 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray23[local312] = (short) local8.method1397();
			if (local50 == 1) {
				local314 = local13.method1402();
				if ((local314 & 0x1) == 1) {
					this.aByteArray25[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray25[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray21[local312] = (byte) (local314 >> 2);
					this.aShortArray20[local312] = this.aShortArray23[local312];
					this.aShortArray23[local312] = 127;
					if (this.aShortArray20[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray21[local312] = -1;
					this.aShortArray20[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray20[local312] = local18.method1394();
			}
			if (local58 == 1) {
				this.aByteArray19[local312] = local23.method1394();
			}
			if (local62 == 1) {
				this.anIntArray192[local312] = local28.method1402();
			}
		}
		local8.anInt2154 = local143;
		local13.anInt2154 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method1402();
			if (local543 == 1) {
				local314 = local8.method1429() + local536;
				local324 = local8.method1429() + local314;
				local334 = local8.method1429() + local324;
				local536 = local334;
				this.anIntArray195[local538] = local314;
				this.anIntArray203[local538] = local324;
				this.anIntArray197[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method1429() + local536;
				local536 = local334;
				this.anIntArray195[local538] = local314;
				this.anIntArray203[local538] = local324;
				this.anIntArray197[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method1429() + local536;
				local536 = local334;
				this.anIntArray195[local538] = local314;
				this.anIntArray203[local538] = local324;
				this.anIntArray197[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method1429() + local536;
				local536 = local334;
				this.anIntArray195[local538] = local314;
				this.anIntArray203[local538] = local646;
				this.anIntArray197[local538] = local334;
			}
		}
		local8.anInt2154 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray27[local543] = 0;
			this.aShortArray19[local543] = (short) local8.method1397();
			this.aShortArray21[local543] = (short) local8.method1397();
			this.aShortArray16[local543] = (short) local8.method1397();
		}
		if (this.aByteArray21 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray21[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray19[local731] & 0xFFFF) == this.anIntArray195[local723] && (this.aShortArray21[local731] & 0xFFFF) == this.anIntArray203[local723] && (this.aShortArray16[local731] & 0xFFFF) == this.anIntArray197[local723]) {
						this.aByteArray21[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray21 = null;
			}
		}
		if (!local3) {
			this.aShortArray20 = null;
		}
		if (!local1) {
			this.aByteArray25 = null;
		}
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "()V")
	public void method1634() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2470; local1++) {
			@Pc(7) int local7 = this.anIntArray193[local1];
			this.anIntArray193[local1] = this.anIntArray201[local1];
			this.anIntArray201[local1] = -local7;
		}
		this.method1641();
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "([B)V")
	private void method1635(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class2_Sub13 local4 = new Class2_Sub13(arg0);
		@Pc(9) Class2_Sub13 local9 = new Class2_Sub13(arg0);
		@Pc(14) Class2_Sub13 local14 = new Class2_Sub13(arg0);
		@Pc(19) Class2_Sub13 local19 = new Class2_Sub13(arg0);
		@Pc(24) Class2_Sub13 local24 = new Class2_Sub13(arg0);
		@Pc(29) Class2_Sub13 local29 = new Class2_Sub13(arg0);
		@Pc(34) Class2_Sub13 local34 = new Class2_Sub13(arg0);
		local4.anInt2154 = arg0.length - 23;
		@Pc(44) int local44 = local4.method1397();
		@Pc(48) int local48 = local4.method1397();
		@Pc(52) int local52 = local4.method1402();
		@Pc(56) int local56 = local4.method1402();
		@Pc(60) int local60 = local4.method1402();
		@Pc(64) int local64 = local4.method1402();
		@Pc(68) int local68 = local4.method1402();
		@Pc(72) int local72 = local4.method1402();
		@Pc(76) int local76 = local4.method1402();
		@Pc(80) int local80 = local4.method1397();
		@Pc(84) int local84 = local4.method1397();
		@Pc(88) int local88 = local4.method1397();
		@Pc(92) int local92 = local4.method1397();
		@Pc(96) int local96 = local4.method1397();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray27 = new byte[local52];
			local4.anInt2154 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray27[local113] = local4.method1394();
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
		this.anInt2470 = local44;
		this.anInt2469 = local48;
		this.anInt2468 = local52;
		this.anIntArray201 = new int[local44];
		this.anIntArray196 = new int[local44];
		this.anIntArray193 = new int[local44];
		this.anIntArray195 = new int[local48];
		this.anIntArray203 = new int[local48];
		this.anIntArray197 = new int[local48];
		if (local76 == 1) {
			this.anIntArray200 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray25 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray20 = new byte[local48];
		} else {
			this.aByte3 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray19 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray192 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray20 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray21 = new byte[local48];
		}
		this.aShortArray23 = new short[local48];
		if (local52 > 0) {
			this.aShortArray19 = new short[local52];
			this.aShortArray21 = new short[local52];
			this.aShortArray16 = new short[local52];
			if (local100 > 0) {
				this.aShortArray18 = new short[local100];
				this.aShortArray17 = new short[local100];
				this.aShortArray22 = new short[local100];
				this.aByteArray23 = new byte[local100];
				this.aByteArray18 = new byte[local100];
				this.aByteArray24 = new byte[local100];
			}
			if (local102 > 0) {
				this.aByteArray22 = new byte[local102];
				this.aByteArray26 = new byte[local102];
			}
		}
		local4.anInt2154 = local52;
		local9.anInt2154 = local233;
		local14.anInt2154 = local239;
		local19.anInt2154 = local245;
		local24.anInt2154 = local184;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(461) int local461 = 0;
		@Pc(468) int local468;
		@Pc(470) int local470;
		@Pc(480) int local480;
		@Pc(490) int local490;
		for (@Pc(463) int local463 = 0; local463 < local44; local463++) {
			local468 = local4.method1402();
			local470 = 0;
			if ((local468 & 0x1) != 0) {
				local470 = local9.method1429();
			}
			local480 = 0;
			if ((local468 & 0x2) != 0) {
				local480 = local14.method1429();
			}
			local490 = 0;
			if ((local468 & 0x4) != 0) {
				local490 = local19.method1429();
			}
			this.anIntArray201[local463] = local457 + local470;
			this.anIntArray196[local463] = local459 + local480;
			this.anIntArray193[local463] = local461 + local490;
			local457 = this.anIntArray201[local463];
			local459 = this.anIntArray196[local463];
			local461 = this.anIntArray193[local463];
			if (local76 == 1) {
				this.anIntArray200[local463] = local24.method1402();
			}
		}
		local4.anInt2154 = local225;
		local9.anInt2154 = local151;
		local14.anInt2154 = local166;
		local19.anInt2154 = local193;
		local24.anInt2154 = local175;
		local29.anInt2154 = local208;
		local34.anInt2154 = local219;
		for (local468 = 0; local468 < local48; local468++) {
			this.aShortArray23[local468] = (short) local4.method1397();
			if (local56 == 1) {
				this.aByteArray25[local468] = local9.method1394();
			}
			if (local60 == 255) {
				this.aByteArray20[local468] = local14.method1394();
			}
			if (local64 == 1) {
				this.aByteArray19[local468] = local19.method1394();
			}
			if (local68 == 1) {
				this.anIntArray192[local468] = local24.method1402();
			}
			if (local72 == 1) {
				this.aShortArray20[local468] = (short) (local29.method1397() - 1);
			}
			if (this.aByteArray21 != null) {
				if (this.aShortArray20[local468] == -1) {
					this.aByteArray21[local468] = -1;
				} else {
					this.aByteArray21[local468] = (byte) (local34.method1402() - 1);
				}
			}
		}
		local4.anInt2154 = local202;
		local9.anInt2154 = local160;
		local470 = 0;
		local480 = 0;
		local490 = 0;
		@Pc(676) int local676 = 0;
		@Pc(683) int local683;
		@Pc(786) int local786;
		for (@Pc(678) int local678 = 0; local678 < local48; local678++) {
			local683 = local9.method1402();
			if (local683 == 1) {
				local470 = local4.method1429() + local676;
				local480 = local4.method1429() + local470;
				local490 = local4.method1429() + local480;
				local676 = local490;
				this.anIntArray195[local678] = local470;
				this.anIntArray203[local678] = local480;
				this.anIntArray197[local678] = local490;
			}
			if (local683 == 2) {
				local480 = local490;
				local490 = local4.method1429() + local676;
				local676 = local490;
				this.anIntArray195[local678] = local470;
				this.anIntArray203[local678] = local480;
				this.anIntArray197[local678] = local490;
			}
			if (local683 == 3) {
				local470 = local490;
				local490 = local4.method1429() + local676;
				local676 = local490;
				this.anIntArray195[local678] = local470;
				this.anIntArray203[local678] = local480;
				this.anIntArray197[local678] = local490;
			}
			if (local683 == 4) {
				local786 = local470;
				local470 = local480;
				local480 = local786;
				local490 = local4.method1429() + local676;
				local676 = local490;
				this.anIntArray195[local678] = local470;
				this.anIntArray203[local678] = local786;
				this.anIntArray197[local678] = local490;
			}
		}
		local4.anInt2154 = local251;
		local9.anInt2154 = local259;
		local14.anInt2154 = local267;
		local19.anInt2154 = local275;
		local24.anInt2154 = local281;
		local29.anInt2154 = local287;
		for (local683 = 0; local683 < local52; local683++) {
			local786 = this.aByteArray27[local683] & 0xFF;
			if (local786 == 0) {
				this.aShortArray19[local683] = (short) local4.method1397();
				this.aShortArray21[local683] = (short) local4.method1397();
				this.aShortArray16[local683] = (short) local4.method1397();
			}
			if (local786 == 1) {
				this.aShortArray19[local683] = (short) local9.method1397();
				this.aShortArray21[local683] = (short) local9.method1397();
				this.aShortArray16[local683] = (short) local9.method1397();
				this.aShortArray18[local683] = (short) local14.method1397();
				this.aShortArray17[local683] = (short) local14.method1397();
				this.aShortArray22[local683] = (short) local14.method1397();
				this.aByteArray23[local683] = local19.method1394();
				this.aByteArray18[local683] = local24.method1394();
				this.aByteArray24[local683] = local29.method1394();
			}
			if (local786 == 2) {
				this.aShortArray19[local683] = (short) local9.method1397();
				this.aShortArray21[local683] = (short) local9.method1397();
				this.aShortArray16[local683] = (short) local9.method1397();
				this.aShortArray18[local683] = (short) local14.method1397();
				this.aShortArray17[local683] = (short) local14.method1397();
				this.aShortArray22[local683] = (short) local14.method1397();
				this.aByteArray23[local683] = local19.method1394();
				this.aByteArray18[local683] = local24.method1394();
				this.aByteArray24[local683] = local29.method1394();
				this.aByteArray22[local683] = local29.method1394();
				this.aByteArray26[local683] = local29.method1394();
			}
			if (local786 == 3) {
				this.aShortArray19[local683] = (short) local9.method1397();
				this.aShortArray21[local683] = (short) local9.method1397();
				this.aShortArray16[local683] = (short) local9.method1397();
				this.aShortArray18[local683] = (short) local14.method1397();
				this.aShortArray17[local683] = (short) local14.method1397();
				this.aShortArray22[local683] = (short) local14.method1397();
				this.aByteArray23[local683] = local19.method1394();
				this.aByteArray18[local683] = local24.method1394();
				this.aByteArray24[local683] = local29.method1394();
			}
		}
		local4.anInt2154 = local113;
		local786 = local4.method1402();
		if (local786 == 0) {
			return;
		}
		new Class30();
		local4.method1397();
		local4.method1397();
		local4.method1397();
		local4.method1396();
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "()V")
	public void method1636() {
		if (this.aClass47Array2 != null) {
			return;
		}
		this.aClass47Array2 = new Class47[this.anInt2470];
		for (@Pc(10) int local10 = 0; local10 < this.anInt2470; local10++) {
			this.aClass47Array2[local10] = new Class47();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt2469; local25++) {
			@Pc(31) int local31 = this.anIntArray195[local25];
			@Pc(36) int local36 = this.anIntArray203[local25];
			@Pc(41) int local41 = this.anIntArray197[local25];
			@Pc(51) int local51 = this.anIntArray201[local36] - this.anIntArray201[local31];
			@Pc(61) int local61 = this.anIntArray196[local36] - this.anIntArray196[local31];
			@Pc(71) int local71 = this.anIntArray193[local36] - this.anIntArray193[local31];
			@Pc(81) int local81 = this.anIntArray201[local41] - this.anIntArray201[local31];
			@Pc(91) int local91 = this.anIntArray196[local41] - this.anIntArray196[local31];
			@Pc(101) int local101 = this.anIntArray193[local41] - this.anIntArray193[local31];
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
			if (this.aByteArray25 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray25[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class47 local211 = this.aClass47Array2[local31];
				local211.anInt2210 += local109;
				local211.anInt2206 += local117;
				local211.anInt2212 += local125;
				local211.anInt2207++;
				@Pc(240) Class47 local240 = this.aClass47Array2[local36];
				local240.anInt2210 += local109;
				local240.anInt2206 += local117;
				local240.anInt2212 += local125;
				local240.anInt2207++;
				@Pc(269) Class47 local269 = this.aClass47Array2[local41];
				local269.anInt2210 += local109;
				local269.anInt2206 += local117;
				local269.anInt2212 += local125;
				local269.anInt2207++;
			} else if (local198 == 1) {
				if (this.aClass29Array1 == null) {
					this.aClass29Array1 = new Class29[this.anInt2469];
				}
				@Pc(314) Class29 local314 = this.aClass29Array1[local25] = new Class29();
				local314.anInt1435 = local109;
				local314.anInt1436 = local117;
				local314.anInt1432 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([[IIIIZI)Lclient!mc;")
	public Class2_Sub3_Sub5_Sub3 method1638(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method1631();
		@Pc(6) int local6 = arg1 + this.aShort10;
		@Pc(11) int local11 = arg1 + this.aShort11;
		@Pc(16) int local16 = arg3 + this.aShort6;
		@Pc(21) int local21 = arg3 + this.aShort7;
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
		@Pc(101) Class2_Sub3_Sub5_Sub3 local101 = new Class2_Sub3_Sub5_Sub3();
		local101.anInt2470 = this.anInt2470;
		local101.anInt2469 = this.anInt2469;
		local101.anInt2468 = this.anInt2468;
		local101.anIntArray201 = this.anIntArray201;
		local101.anIntArray193 = this.anIntArray193;
		local101.anIntArray195 = this.anIntArray195;
		local101.anIntArray203 = this.anIntArray203;
		local101.anIntArray197 = this.anIntArray197;
		local101.aByteArray25 = this.aByteArray25;
		local101.aByteArray20 = this.aByteArray20;
		local101.aByteArray19 = this.aByteArray19;
		local101.aByteArray21 = this.aByteArray21;
		local101.aShortArray23 = this.aShortArray23;
		local101.aShortArray20 = this.aShortArray20;
		local101.aByte3 = this.aByte3;
		local101.aByteArray27 = this.aByteArray27;
		local101.aShortArray19 = this.aShortArray19;
		local101.aShortArray21 = this.aShortArray21;
		local101.aShortArray16 = this.aShortArray16;
		local101.aShortArray18 = this.aShortArray18;
		local101.aShortArray17 = this.aShortArray17;
		local101.aShortArray22 = this.aShortArray22;
		local101.aByteArray23 = this.aByteArray23;
		local101.aByteArray18 = this.aByteArray18;
		local101.aByteArray24 = this.aByteArray24;
		local101.aByteArray22 = this.aByteArray22;
		local101.aByteArray26 = this.aByteArray26;
		local101.anIntArray200 = this.anIntArray200;
		local101.anIntArray192 = this.anIntArray192;
		local101.anIntArrayArray42 = this.anIntArrayArray42;
		local101.anIntArrayArray43 = this.anIntArrayArray43;
		local101.aShort12 = this.aShort12;
		local101.aShort8 = this.aShort8;
		local101.anIntArray196 = new int[local101.anInt2470];
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
			for (local245 = 0; local245 < local101.anInt2470; local245++) {
				local253 = this.anIntArray201[local245] + arg1;
				local260 = this.anIntArray193[local245] + arg3;
				local264 = local253 & 0x7F;
				local268 = local260 & 0x7F;
				local272 = local253 >> 7;
				local276 = local260 >> 7;
				local298 = arg0[local272][local276] * (128 - local264) + arg0[local272 + 1][local276] * local264 >> 7;
				local324 = arg0[local272][local276 + 1] * (128 - local264) + arg0[local272 + 1][local276 + 1] * local264 >> 7;
				local336 = local298 * (128 - local268) + local324 * local268 >> 7;
				local101.anIntArray196[local245] = this.anIntArray196[local245] + local336 - arg2;
			}
		} else {
			for (local245 = 0; local245 < local101.anInt2470; local245++) {
				local253 = (this.anIntArray196[local245] << 16) / super.aShort25;
				if (local253 < arg4) {
					local260 = this.anIntArray201[local245] + arg1;
					local264 = this.anIntArray193[local245] + arg3;
					local268 = local260 & 0x7F;
					local272 = local264 & 0x7F;
					local276 = local260 >> 7;
					local298 = local264 >> 7;
					local324 = arg0[local276][local298] * (128 - local268) + arg0[local276 + 1][local298] * local268 >> 7;
					local336 = arg0[local276][local298 + 1] * (128 - local268) + arg0[local276 + 1][local298 + 1] * local268 >> 7;
					@Pc(460) int local460 = local324 * (128 - local272) + local336 * local272 >> 7;
					local101.anIntArray196[local245] = this.anIntArray196[local245] + (local460 - arg2) * (arg4 - local253) / arg4;
				} else {
					local101.anIntArray196[local245] = this.anIntArray196[local245];
				}
			}
		}
		local101.method1641();
		return local101;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(III)V")
	public void method1639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2470; local1++) {
			this.anIntArray201[local1] += arg0;
			this.anIntArray196[local1] += arg1;
			this.anIntArray193[local1] += arg2;
		}
		this.method1641();
	}

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "()Lclient!mc;")
	public Class2_Sub3_Sub5_Sub3 method1640() {
		@Pc(3) Class2_Sub3_Sub5_Sub3 local3 = new Class2_Sub3_Sub5_Sub3();
		if (this.aByteArray25 != null) {
			local3.aByteArray25 = new byte[this.anInt2469];
			for (@Pc(13) int local13 = 0; local13 < this.anInt2469; local13++) {
				local3.aByteArray25[local13] = this.aByteArray25[local13];
			}
		}
		local3.anInt2470 = this.anInt2470;
		local3.anInt2469 = this.anInt2469;
		local3.anInt2468 = this.anInt2468;
		local3.anIntArray201 = this.anIntArray201;
		local3.anIntArray196 = this.anIntArray196;
		local3.anIntArray193 = this.anIntArray193;
		local3.anIntArray195 = this.anIntArray195;
		local3.anIntArray203 = this.anIntArray203;
		local3.anIntArray197 = this.anIntArray197;
		local3.aByteArray20 = this.aByteArray20;
		local3.aByteArray19 = this.aByteArray19;
		local3.aByteArray21 = this.aByteArray21;
		local3.aShortArray23 = this.aShortArray23;
		local3.aShortArray20 = this.aShortArray20;
		local3.aByte3 = this.aByte3;
		local3.aByteArray27 = this.aByteArray27;
		local3.aShortArray19 = this.aShortArray19;
		local3.aShortArray21 = this.aShortArray21;
		local3.aShortArray16 = this.aShortArray16;
		local3.aShortArray18 = this.aShortArray18;
		local3.aShortArray17 = this.aShortArray17;
		local3.aShortArray22 = this.aShortArray22;
		local3.aByteArray23 = this.aByteArray23;
		local3.aByteArray18 = this.aByteArray18;
		local3.aByteArray24 = this.aByteArray24;
		local3.aByteArray22 = this.aByteArray22;
		local3.aByteArray26 = this.aByteArray26;
		local3.anIntArray200 = this.anIntArray200;
		local3.anIntArray192 = this.anIntArray192;
		local3.anIntArrayArray42 = this.anIntArrayArray42;
		local3.anIntArrayArray43 = this.anIntArrayArray43;
		local3.aClass47Array2 = this.aClass47Array2;
		local3.aClass29Array1 = this.aClass29Array1;
		local3.aShort12 = this.aShort12;
		local3.aShort8 = this.aShort8;
		return local3;
	}

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "()V")
	private void method1641() {
		this.aClass47Array2 = null;
		this.aClass47Array1 = null;
		this.aClass29Array1 = null;
		this.aBoolean97 = false;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIZZ)Lclient!sa;")
	public Class2_Sub3_Sub5_Sub7 method1642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class2_Sub3_Sub5_Sub7_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "()V")
	public void method1643() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2470; local1++) {
			this.anIntArray201[local1] = -this.anIntArray201[local1];
			this.anIntArray193[local1] = -this.anIntArray193[local1];
		}
		this.method1641();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(SS)V")
	public void method1644(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2469; local1++) {
			if (this.aShortArray23[local1] == arg0) {
				this.aShortArray23[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "()V")
	public void method1646() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray200 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt2470; local9++) {
				local15 = this.anIntArray200[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray42 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray42[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt2470) {
				local65 = this.anIntArray200[local59];
				this.anIntArrayArray42[local65][local5[local65]++] = local59++;
			}
			this.anIntArray200 = null;
		}
		if (this.anIntArray192 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt2469; local9++) {
			local15 = this.anIntArray192[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray43 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray43[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt2469) {
			local65 = this.anIntArray192[local59];
			this.anIntArrayArray43[local65][local5[local65]++] = local59++;
		}
		this.anIntArray192 = null;
	}

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "()V")
	public void method1647() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2470; local1++) {
			this.anIntArray193[local1] = -this.anIntArray193[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt2469; local18++) {
			@Pc(24) int local24 = this.anIntArray195[local18];
			this.anIntArray195[local18] = this.anIntArray197[local18];
			this.anIntArray197[local18] = local24;
		}
		this.method1641();
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(SS)V")
	public void method1648(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray20 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt2469; local5++) {
			if (this.aShortArray20[local5] == arg0) {
				this.aShortArray20[local5] = arg1;
			}
		}
	}
}
