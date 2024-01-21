import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class1_Sub1_Sub5_Sub5 extends Class1_Sub1_Sub5 {

	@OriginalMember(owner = "client!ja", name = "ab", descriptor = "[Lclient!wg;")
	public Class89[] aClass89Array1;

	@OriginalMember(owner = "client!ja", name = "bb", descriptor = "[S")
	public short[] aShortArray13;

	@OriginalMember(owner = "client!ja", name = "cb", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!ja", name = "db", descriptor = "[Lclient!wg;")
	public Class89[] aClass89Array2;

	@OriginalMember(owner = "client!ja", name = "eb", descriptor = "S")
	public short aShort1;

	@OriginalMember(owner = "client!ja", name = "fb", descriptor = "[I")
	private int[] anIntArray176;

	@OriginalMember(owner = "client!ja", name = "gb", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!ja", name = "hb", descriptor = "[I")
	public int[] anIntArray177;

	@OriginalMember(owner = "client!ja", name = "ib", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!ja", name = "jb", descriptor = "[I")
	public int[] anIntArray178;

	@OriginalMember(owner = "client!ja", name = "kb", descriptor = "[B")
	private byte[] aByteArray20;

	@OriginalMember(owner = "client!ja", name = "lb", descriptor = "[S")
	public short[] aShortArray15;

	@OriginalMember(owner = "client!ja", name = "mb", descriptor = "[S")
	public short[] aShortArray16;

	@OriginalMember(owner = "client!ja", name = "nb", descriptor = "[Lclient!hb;")
	public Class28[] aClass28Array1;

	@OriginalMember(owner = "client!ja", name = "ob", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!ja", name = "pb", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!ja", name = "qb", descriptor = "[I")
	public int[] anIntArray179;

	@OriginalMember(owner = "client!ja", name = "rb", descriptor = "[S")
	public short[] aShortArray18;

	@OriginalMember(owner = "client!ja", name = "sb", descriptor = "[B")
	public byte[] aByteArray22;

	@OriginalMember(owner = "client!ja", name = "ub", descriptor = "I")
	public int anInt2118;

	@OriginalMember(owner = "client!ja", name = "vb", descriptor = "[B")
	public byte[] aByteArray23;

	@OriginalMember(owner = "client!ja", name = "wb", descriptor = "I")
	public int anInt2119;

	@OriginalMember(owner = "client!ja", name = "xb", descriptor = "I")
	public int anInt2120;

	@OriginalMember(owner = "client!ja", name = "zb", descriptor = "[[I")
	public int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!ja", name = "Ab", descriptor = "[B")
	public byte[] aByteArray24;

	@OriginalMember(owner = "client!ja", name = "Bb", descriptor = "[B")
	public byte[] aByteArray25;

	@OriginalMember(owner = "client!ja", name = "Cb", descriptor = "[I")
	public int[] anIntArray180;

	@OriginalMember(owner = "client!ja", name = "Db", descriptor = "I")
	public int anInt2121;

	@OriginalMember(owner = "client!ja", name = "Eb", descriptor = "[B")
	private byte[] aByteArray26;

	@OriginalMember(owner = "client!ja", name = "Fb", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!ja", name = "Ib", descriptor = "I")
	public int anInt2123;

	@OriginalMember(owner = "client!ja", name = "Jb", descriptor = "[S")
	public short[] aShortArray20;

	@OriginalMember(owner = "client!ja", name = "Lb", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!ja", name = "Mb", descriptor = "[I")
	public int[] anIntArray182;

	@OriginalMember(owner = "client!ja", name = "Ob", descriptor = "[I")
	private int[] anIntArray184;

	@OriginalMember(owner = "client!ja", name = "Pb", descriptor = "[B")
	private byte[] aByteArray27;

	@OriginalMember(owner = "client!ja", name = "Sb", descriptor = "I")
	public int anInt2124;

	@OriginalMember(owner = "client!ja", name = "Tb", descriptor = "[[I")
	public int[][] anIntArrayArray61;

	@OriginalMember(owner = "client!ja", name = "Vb", descriptor = "[I")
	public int[] anIntArray187;

	@OriginalMember(owner = "client!ja", name = "yb", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!ja", name = "Gb", descriptor = "B")
	public byte aByte3 = 0;

	@OriginalMember(owner = "client!ja", name = "tb", descriptor = "I")
	public int anInt2117 = 0;

	@OriginalMember(owner = "client!ja", name = "Ub", descriptor = "I")
	public int anInt2125 = 0;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
	private Class1_Sub1_Sub5_Sub5() {
	}

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub5_Sub5(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1490(arg0);
		} else {
			this.method1477(arg0);
		}
	}

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "([Lclient!ja;I)V")
	public Class1_Sub1_Sub5_Sub5(@OriginalArg(0) Class1_Sub1_Sub5_Sub5[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt2125 = 0;
		this.anInt2117 = 0;
		this.anInt2123 = 0;
		this.aByte3 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class1_Sub1_Sub5_Sub5 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt2125 += local44.anInt2125;
				this.anInt2117 += local44.anInt2117;
				this.anInt2123 += local44.anInt2123;
				if (local44.aByteArray22 == null) {
					if (this.aByte3 == -1) {
						this.aByte3 = local44.aByte3;
					}
					if (this.aByte3 != local44.aByte3) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray24 != null;
				local19 |= local44.aByteArray23 != null;
				local21 |= local44.anIntArray176 != null;
				local23 |= local44.aShortArray15 != null;
				local25 |= local44.aByteArray21 != null;
			}
		}
		this.anIntArray179 = new int[this.anInt2125];
		this.anIntArray180 = new int[this.anInt2125];
		this.anIntArray178 = new int[this.anInt2125];
		this.anIntArray184 = new int[this.anInt2125];
		this.anIntArray177 = new int[this.anInt2117];
		this.anIntArray182 = new int[this.anInt2117];
		this.anIntArray187 = new int[this.anInt2117];
		if (local15) {
			this.aByteArray24 = new byte[this.anInt2117];
		}
		if (local17) {
			this.aByteArray22 = new byte[this.anInt2117];
		}
		if (local19) {
			this.aByteArray23 = new byte[this.anInt2117];
		}
		if (local21) {
			this.anIntArray176 = new int[this.anInt2117];
		}
		if (local23) {
			this.aShortArray15 = new short[this.anInt2117];
		}
		if (local25) {
			this.aByteArray21 = new byte[this.anInt2117];
		}
		this.aShortArray18 = new short[this.anInt2117];
		if (this.anInt2123 > 0) {
			this.aByteArray25 = new byte[this.anInt2123];
			this.aShortArray20 = new short[this.anInt2123];
			this.aShortArray16 = new short[this.anInt2123];
			this.aShortArray13 = new short[this.anInt2123];
			this.aShortArray14 = new short[this.anInt2123];
			this.aShortArray17 = new short[this.anInt2123];
			this.aShortArray19 = new short[this.anInt2123];
			this.aByteArray19 = new byte[this.anInt2123];
			this.aByteArray27 = new byte[this.anInt2123];
			this.aByteArray18 = new byte[this.anInt2123];
			this.aByteArray20 = new byte[this.anInt2123];
			this.aByteArray26 = new byte[this.anInt2123];
		}
		this.anInt2125 = 0;
		this.anInt2117 = 0;
		this.anInt2123 = 0;
		for (@Pc(293) int local293 = 0; local293 < arg1; local293++) {
			@Pc(298) Class1_Sub1_Sub5_Sub5 local298 = arg0[local293];
			if (local298 != null) {
				for (@Pc(302) int local302 = 0; local302 < local298.anInt2117; local302++) {
					if (local15 && local298.aByteArray24 != null) {
						this.aByteArray24[this.anInt2117] = local298.aByteArray24[local302];
					}
					if (local17) {
						if (local298.aByteArray22 == null) {
							this.aByteArray22[this.anInt2117] = local298.aByte3;
						} else {
							this.aByteArray22[this.anInt2117] = local298.aByteArray22[local302];
						}
					}
					if (local19 && local298.aByteArray23 != null) {
						this.aByteArray23[this.anInt2117] = local298.aByteArray23[local302];
					}
					if (local21 && local298.anIntArray176 != null) {
						this.anIntArray176[this.anInt2117] = local298.anIntArray176[local302];
					}
					if (local23) {
						if (local298.aShortArray15 == null) {
							this.aShortArray15[this.anInt2117] = -1;
						} else {
							this.aShortArray15[this.anInt2117] = local298.aShortArray15[local302];
						}
					}
					if (local25) {
						if (local298.aByteArray21 == null || local298.aByteArray21[local302] == -1) {
							this.aByteArray21[this.anInt2117] = -1;
						} else {
							this.aByteArray21[this.anInt2117] = (byte) (local298.aByteArray21[local302] + this.anInt2123);
						}
					}
					this.aShortArray18[this.anInt2117] = local298.aShortArray18[local302];
					this.anIntArray177[this.anInt2117] = this.method1480(local298, local298.anIntArray177[local302]);
					this.anIntArray182[this.anInt2117] = this.method1480(local298, local298.anIntArray182[local302]);
					this.anIntArray187[this.anInt2117] = this.method1480(local298, local298.anIntArray187[local302]);
					this.anInt2117++;
				}
				for (@Pc(477) int local477 = 0; local477 < local298.anInt2123; local477++) {
					@Pc(489) byte local489 = this.aByteArray25[this.anInt2123] = local298.aByteArray25[local477];
					if (local489 == 0) {
						this.aShortArray20[this.anInt2123] = (short) this.method1480(local298, local298.aShortArray20[local477]);
						this.aShortArray16[this.anInt2123] = (short) this.method1480(local298, local298.aShortArray16[local477]);
						this.aShortArray13[this.anInt2123] = (short) this.method1480(local298, local298.aShortArray13[local477]);
					}
					if (local489 >= 1 && local489 <= 3) {
						this.aShortArray20[this.anInt2123] = local298.aShortArray20[local477];
						this.aShortArray16[this.anInt2123] = local298.aShortArray16[local477];
						this.aShortArray13[this.anInt2123] = local298.aShortArray13[local477];
						this.aShortArray14[this.anInt2123] = local298.aShortArray14[local477];
						this.aShortArray17[this.anInt2123] = local298.aShortArray17[local477];
						this.aShortArray19[this.anInt2123] = local298.aShortArray19[local477];
						this.aByteArray19[this.anInt2123] = local298.aByteArray19[local477];
						this.aByteArray27[this.anInt2123] = local298.aByteArray27[local477];
						this.aByteArray18[this.anInt2123] = local298.aByteArray18[local477];
					}
					if (local489 == 2) {
						this.aByteArray20[this.anInt2123] = local298.aByteArray20[local477];
						this.aByteArray26[this.anInt2123] = local298.aByteArray26[local477];
					}
					this.anInt2123++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lclient!ja;ZZZZ)V")
	public Class1_Sub1_Sub5_Sub5(@OriginalArg(0) Class1_Sub1_Sub5_Sub5 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2125 = arg0.anInt2125;
		this.anInt2117 = arg0.anInt2117;
		this.anInt2123 = arg0.anInt2123;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray179 = arg0.anIntArray179;
			this.anIntArray180 = arg0.anIntArray180;
			this.anIntArray178 = arg0.anIntArray178;
		} else {
			this.anIntArray179 = new int[this.anInt2125];
			this.anIntArray180 = new int[this.anInt2125];
			this.anIntArray178 = new int[this.anInt2125];
			for (local57 = 0; local57 < this.anInt2125; local57++) {
				this.anIntArray179[local57] = arg0.anIntArray179[local57];
				this.anIntArray180[local57] = arg0.anIntArray180[local57];
				this.anIntArray178[local57] = arg0.anIntArray178[local57];
			}
		}
		if (arg2) {
			this.aShortArray18 = arg0.aShortArray18;
		} else {
			this.aShortArray18 = new short[this.anInt2117];
			for (local57 = 0; local57 < this.anInt2117; local57++) {
				this.aShortArray18[local57] = arg0.aShortArray18[local57];
			}
		}
		if (arg3 || arg0.aShortArray15 == null) {
			this.aShortArray15 = arg0.aShortArray15;
		} else {
			this.aShortArray15 = new short[this.anInt2117];
			for (local57 = 0; local57 < this.anInt2117; local57++) {
				this.aShortArray15[local57] = arg0.aShortArray15[local57];
			}
		}
		this.aByteArray23 = arg0.aByteArray23;
		this.anIntArray177 = arg0.anIntArray177;
		this.anIntArray182 = arg0.anIntArray182;
		this.anIntArray187 = arg0.anIntArray187;
		this.aByteArray24 = arg0.aByteArray24;
		this.aByteArray22 = arg0.aByteArray22;
		this.aByteArray21 = arg0.aByteArray21;
		this.aByte3 = arg0.aByte3;
		this.aByteArray25 = arg0.aByteArray25;
		this.aShortArray20 = arg0.aShortArray20;
		this.aShortArray16 = arg0.aShortArray16;
		this.aShortArray13 = arg0.aShortArray13;
		this.aShortArray14 = arg0.aShortArray14;
		this.aShortArray17 = arg0.aShortArray17;
		this.aShortArray19 = arg0.aShortArray19;
		this.aByteArray19 = arg0.aByteArray19;
		this.aByteArray27 = arg0.aByteArray27;
		this.aByteArray18 = arg0.aByteArray18;
		this.aByteArray20 = arg0.aByteArray20;
		this.aByteArray26 = arg0.aByteArray26;
		this.anIntArray184 = arg0.anIntArray184;
		this.anIntArray176 = arg0.anIntArray176;
		this.anIntArrayArray61 = arg0.anIntArrayArray61;
		this.anIntArrayArray60 = arg0.anIntArrayArray60;
		this.aClass89Array2 = arg0.aClass89Array2;
		this.aClass28Array1 = arg0.aClass28Array1;
		this.aClass89Array1 = arg0.aClass89Array1;
		this.aShort1 = arg0.aShort1;
		this.aShort2 = arg0.aShort2;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIZZ)Lclient!rg;")
	public Class1_Sub1_Sub5_Sub4 method1472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class1_Sub1_Sub5_Sub4_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "()V")
	public void method1473() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2125; local1++) {
			@Pc(7) int local7 = this.anIntArray178[local1];
			this.anIntArray178[local1] = this.anIntArray179[local1];
			this.anIntArray179[local1] = -local7;
		}
		this.method1482();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
	public void method1474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2125; local1++) {
			this.anIntArray179[local1] += arg0;
			this.anIntArray180[local1] += arg1;
			this.anIntArray178[local1] += arg2;
		}
		this.method1482();
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "()V")
	public void method1475() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2125; local1++) {
			@Pc(7) int local7 = this.anIntArray179[local1];
			this.anIntArray179[local1] = this.anIntArray178[local1];
			this.anIntArray178[local1] = -local7;
		}
		this.method1482();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "([B)V")
	private void method1477(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class1_Sub6 local8 = new Class1_Sub6(arg0);
		@Pc(13) Class1_Sub6 local13 = new Class1_Sub6(arg0);
		@Pc(18) Class1_Sub6 local18 = new Class1_Sub6(arg0);
		@Pc(23) Class1_Sub6 local23 = new Class1_Sub6(arg0);
		@Pc(28) Class1_Sub6 local28 = new Class1_Sub6(arg0);
		local8.anInt839 = arg0.length - 18;
		@Pc(38) int local38 = local8.method546();
		@Pc(42) int local42 = local8.method546();
		@Pc(46) int local46 = local8.method544();
		@Pc(50) int local50 = local8.method544();
		@Pc(54) int local54 = local8.method544();
		@Pc(58) int local58 = local8.method544();
		@Pc(62) int local62 = local8.method544();
		@Pc(66) int local66 = local8.method544();
		@Pc(70) int local70 = local8.method546();
		@Pc(74) int local74 = local8.method546();
		@Pc(78) int local78 = local8.method546();
		@Pc(82) int local82 = local8.method546();
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
		this.anInt2125 = local38;
		this.anInt2117 = local42;
		this.anInt2123 = local46;
		this.anIntArray179 = new int[local38];
		this.anIntArray180 = new int[local38];
		this.anIntArray178 = new int[local38];
		this.anIntArray177 = new int[local42];
		this.anIntArray182 = new int[local42];
		this.anIntArray187 = new int[local42];
		if (local46 > 0) {
			this.aByteArray25 = new byte[local46];
			this.aShortArray20 = new short[local46];
			this.aShortArray16 = new short[local46];
			this.aShortArray13 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray184 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray24 = new byte[local42];
			this.aByteArray21 = new byte[local42];
			this.aShortArray15 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray22 = new byte[local42];
		} else {
			this.aByte3 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray23 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray176 = new int[local42];
		}
		this.aShortArray18 = new short[local42];
		local8.anInt839 = 0;
		local13.anInt839 = local165;
		local18.anInt839 = local171;
		local23.anInt839 = local90;
		local28.anInt839 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method544();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method525();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method525();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method525();
			}
			this.anIntArray179[local307] = local301 + local314;
			this.anIntArray180[local307] = local303 + local324;
			this.anIntArray178[local307] = local305 + local334;
			local301 = this.anIntArray179[local307];
			local303 = this.anIntArray180[local307];
			local305 = this.anIntArray178[local307];
			if (local66 == 1) {
				this.anIntArray184[local307] = local28.method544();
			}
		}
		local8.anInt839 = local149;
		local13.anInt839 = local116;
		local18.anInt839 = local98;
		local23.anInt839 = local134;
		local28.anInt839 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray18[local312] = (short) local8.method546();
			if (local50 == 1) {
				local314 = local13.method544();
				if ((local314 & 0x1) == 1) {
					this.aByteArray24[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray24[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray21[local312] = (byte) (local314 >> 2);
					this.aShortArray15[local312] = this.aShortArray18[local312];
					this.aShortArray18[local312] = 127;
					if (this.aShortArray15[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray21[local312] = -1;
					this.aShortArray15[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray22[local312] = local18.method548();
			}
			if (local58 == 1) {
				this.aByteArray23[local312] = local23.method548();
			}
			if (local62 == 1) {
				this.anIntArray176[local312] = local28.method544();
			}
		}
		local8.anInt839 = local143;
		local13.anInt839 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method544();
			if (local543 == 1) {
				local314 = local8.method525() + local536;
				local324 = local8.method525() + local314;
				local334 = local8.method525() + local324;
				local536 = local334;
				this.anIntArray177[local538] = local314;
				this.anIntArray182[local538] = local324;
				this.anIntArray187[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method525() + local536;
				local536 = local334;
				this.anIntArray177[local538] = local314;
				this.anIntArray182[local538] = local324;
				this.anIntArray187[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method525() + local536;
				local536 = local334;
				this.anIntArray177[local538] = local314;
				this.anIntArray182[local538] = local324;
				this.anIntArray187[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method525() + local536;
				local536 = local334;
				this.anIntArray177[local538] = local314;
				this.anIntArray182[local538] = local646;
				this.anIntArray187[local538] = local334;
			}
		}
		local8.anInt839 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray25[local543] = 0;
			this.aShortArray20[local543] = (short) local8.method546();
			this.aShortArray16[local543] = (short) local8.method546();
			this.aShortArray13[local543] = (short) local8.method546();
		}
		if (this.aByteArray21 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray21[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray20[local731] & 0xFFFF) == this.anIntArray177[local723] && (this.aShortArray16[local731] & 0xFFFF) == this.anIntArray182[local723] && (this.aShortArray13[local731] & 0xFFFF) == this.anIntArray187[local723]) {
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
			this.aShortArray15 = null;
		}
		if (!local1) {
			this.aByteArray24 = null;
		}
	}

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "(I)V")
	public void method1478() {
		@Pc(3) int local3 = Static70.anIntArray186[256];
		@Pc(7) int local7 = Static70.anIntArray185[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2125; local9++) {
			@Pc(26) int local26 = this.anIntArray178[local9] * local3 + this.anIntArray179[local9] * local7 >> 16;
			this.anIntArray178[local9] = this.anIntArray178[local9] * local7 - this.anIntArray179[local9] * local3 >> 16;
			this.anIntArray179[local9] = local26;
		}
		this.method1482();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(SS)V")
	public void method1479(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray15 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt2117; local5++) {
			if (this.aShortArray15[local5] == arg0) {
				this.aShortArray15[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!ja;I)I")
	private int method1480(@OriginalArg(0) Class1_Sub1_Sub5_Sub5 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray179[arg1];
		@Pc(11) int local11 = arg0.anIntArray180[arg1];
		@Pc(16) int local16 = arg0.anIntArray178[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2125; local18++) {
			if (local6 == this.anIntArray179[local18] && local11 == this.anIntArray180[local18] && local16 == this.anIntArray178[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray179[this.anInt2125] = local6;
			this.anIntArray180[this.anInt2125] = local11;
			this.anIntArray178[this.anInt2125] = local16;
			if (arg0.anIntArray184 != null) {
				this.anIntArray184[this.anInt2125] = arg0.anIntArray184[arg1];
			}
			local1 = this.anInt2125++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "()V")
	public void method1481() {
		if (this.aBoolean82) {
			return;
		}
		super.anInt4233 = 0;
		this.anInt2121 = 0;
		this.anInt2120 = 999999;
		this.anInt2124 = -999999;
		this.anInt2118 = -99999;
		this.anInt2119 = 99999;
		for (@Pc(23) int local23 = 0; local23 < this.anInt2125; local23++) {
			@Pc(29) int local29 = this.anIntArray179[local23];
			@Pc(34) int local34 = this.anIntArray180[local23];
			@Pc(39) int local39 = this.anIntArray178[local23];
			if (local29 < this.anInt2120) {
				this.anInt2120 = local29;
			}
			if (local29 > this.anInt2124) {
				this.anInt2124 = local29;
			}
			if (local39 < this.anInt2119) {
				this.anInt2119 = local39;
			}
			if (local39 > this.anInt2118) {
				this.anInt2118 = local39;
			}
			if (-local34 > super.anInt4233) {
				super.anInt4233 = -local34;
			}
			if (local34 > this.anInt2121) {
				this.anInt2121 = local34;
			}
		}
		this.aBoolean82 = true;
	}

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "()V")
	private void method1482() {
		this.aClass89Array2 = null;
		this.aClass89Array1 = null;
		this.aClass28Array1 = null;
		this.aBoolean82 = false;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "([[IIIIZI)Lclient!ja;")
	public Class1_Sub1_Sub5_Sub5 method1485(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method1481();
		@Pc(6) int local6 = arg1 + this.anInt2120;
		@Pc(11) int local11 = arg1 + this.anInt2124;
		@Pc(16) int local16 = arg3 + this.anInt2119;
		@Pc(21) int local21 = arg3 + this.anInt2118;
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
		@Pc(101) Class1_Sub1_Sub5_Sub5 local101 = new Class1_Sub1_Sub5_Sub5();
		local101.anInt2125 = this.anInt2125;
		local101.anInt2117 = this.anInt2117;
		local101.anInt2123 = this.anInt2123;
		local101.anIntArray179 = this.anIntArray179;
		local101.anIntArray178 = this.anIntArray178;
		local101.anIntArray177 = this.anIntArray177;
		local101.anIntArray182 = this.anIntArray182;
		local101.anIntArray187 = this.anIntArray187;
		local101.aByteArray24 = this.aByteArray24;
		local101.aByteArray22 = this.aByteArray22;
		local101.aByteArray23 = this.aByteArray23;
		local101.aByteArray21 = this.aByteArray21;
		local101.aShortArray18 = this.aShortArray18;
		local101.aShortArray15 = this.aShortArray15;
		local101.aByte3 = this.aByte3;
		local101.aByteArray25 = this.aByteArray25;
		local101.aShortArray20 = this.aShortArray20;
		local101.aShortArray16 = this.aShortArray16;
		local101.aShortArray13 = this.aShortArray13;
		local101.aShortArray14 = this.aShortArray14;
		local101.aShortArray17 = this.aShortArray17;
		local101.aShortArray19 = this.aShortArray19;
		local101.aByteArray19 = this.aByteArray19;
		local101.aByteArray27 = this.aByteArray27;
		local101.aByteArray18 = this.aByteArray18;
		local101.aByteArray20 = this.aByteArray20;
		local101.aByteArray26 = this.aByteArray26;
		local101.anIntArray184 = this.anIntArray184;
		local101.anIntArray176 = this.anIntArray176;
		local101.anIntArrayArray61 = this.anIntArrayArray61;
		local101.anIntArrayArray60 = this.anIntArrayArray60;
		local101.aShort1 = this.aShort1;
		local101.aShort2 = this.aShort2;
		local101.anIntArray180 = new int[local101.anInt2125];
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
			for (local245 = 0; local245 < local101.anInt2125; local245++) {
				local253 = this.anIntArray179[local245] + arg1;
				local260 = this.anIntArray178[local245] + arg3;
				local264 = local253 & 0x7F;
				local268 = local260 & 0x7F;
				local272 = local253 >> 7;
				local276 = local260 >> 7;
				local298 = arg0[local272][local276] * (128 - local264) + arg0[local272 + 1][local276] * local264 >> 7;
				local324 = arg0[local272][local276 + 1] * (128 - local264) + arg0[local272 + 1][local276 + 1] * local264 >> 7;
				local336 = local298 * (128 - local268) + local324 * local268 >> 7;
				local101.anIntArray180[local245] = this.anIntArray180[local245] + local336 - arg2;
			}
		} else {
			for (local245 = 0; local245 < local101.anInt2125; local245++) {
				local253 = (-this.anIntArray180[local245] << 16) / super.anInt4233;
				if (local253 < arg4) {
					local260 = this.anIntArray179[local245] + arg1;
					local264 = this.anIntArray178[local245] + arg3;
					local268 = local260 & 0x7F;
					local272 = local264 & 0x7F;
					local276 = local260 >> 7;
					local298 = local264 >> 7;
					local324 = arg0[local276][local298] * (128 - local268) + arg0[local276 + 1][local298] * local268 >> 7;
					local336 = arg0[local276][local298 + 1] * (128 - local268) + arg0[local276 + 1][local298 + 1] * local268 >> 7;
					@Pc(461) int local461 = local324 * (128 - local272) + local336 * local272 >> 7;
					local101.anIntArray180[local245] = this.anIntArray180[local245] + (local461 - arg2) * (arg4 - local253) / arg4;
				}
			}
		}
		local101.method1482();
		return local101;
	}

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "()Lclient!ja;")
	public Class1_Sub1_Sub5_Sub5 method1486() {
		@Pc(3) Class1_Sub1_Sub5_Sub5 local3 = new Class1_Sub1_Sub5_Sub5();
		if (this.aByteArray24 != null) {
			local3.aByteArray24 = new byte[this.anInt2117];
			for (@Pc(13) int local13 = 0; local13 < this.anInt2117; local13++) {
				local3.aByteArray24[local13] = this.aByteArray24[local13];
			}
		}
		local3.anInt2125 = this.anInt2125;
		local3.anInt2117 = this.anInt2117;
		local3.anInt2123 = this.anInt2123;
		local3.anIntArray179 = this.anIntArray179;
		local3.anIntArray180 = this.anIntArray180;
		local3.anIntArray178 = this.anIntArray178;
		local3.anIntArray177 = this.anIntArray177;
		local3.anIntArray182 = this.anIntArray182;
		local3.anIntArray187 = this.anIntArray187;
		local3.aByteArray22 = this.aByteArray22;
		local3.aByteArray23 = this.aByteArray23;
		local3.aByteArray21 = this.aByteArray21;
		local3.aShortArray18 = this.aShortArray18;
		local3.aShortArray15 = this.aShortArray15;
		local3.aByte3 = this.aByte3;
		local3.aByteArray25 = this.aByteArray25;
		local3.aShortArray20 = this.aShortArray20;
		local3.aShortArray16 = this.aShortArray16;
		local3.aShortArray13 = this.aShortArray13;
		local3.aShortArray14 = this.aShortArray14;
		local3.aShortArray17 = this.aShortArray17;
		local3.aShortArray19 = this.aShortArray19;
		local3.aByteArray19 = this.aByteArray19;
		local3.aByteArray27 = this.aByteArray27;
		local3.aByteArray18 = this.aByteArray18;
		local3.aByteArray20 = this.aByteArray20;
		local3.aByteArray26 = this.aByteArray26;
		local3.anIntArray184 = this.anIntArray184;
		local3.anIntArray176 = this.anIntArray176;
		local3.anIntArrayArray61 = this.anIntArrayArray61;
		local3.anIntArrayArray60 = this.anIntArrayArray60;
		local3.aClass89Array2 = this.aClass89Array2;
		local3.aClass28Array1 = this.aClass28Array1;
		local3.aShort1 = this.aShort1;
		local3.aShort2 = this.aShort2;
		return local3;
	}

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "()V")
	public void method1487() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2125; local1++) {
			this.anIntArray179[local1] = -this.anIntArray179[local1];
			this.anIntArray178[local1] = -this.anIntArray178[local1];
		}
		this.method1482();
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V")
	public void method1488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2125; local1++) {
			this.anIntArray179[local1] = this.anIntArray179[local1] * arg0 / 128;
			this.anIntArray180[local1] = this.anIntArray180[local1] * arg1 / 128;
			this.anIntArray178[local1] = this.anIntArray178[local1] * arg2 / 128;
		}
		this.method1482();
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(SS)V")
	public void method1489(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2117; local1++) {
			if (this.aShortArray18[local1] == arg0) {
				this.aShortArray18[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "([B)V")
	private void method1490(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class1_Sub6 local4 = new Class1_Sub6(arg0);
		@Pc(9) Class1_Sub6 local9 = new Class1_Sub6(arg0);
		@Pc(14) Class1_Sub6 local14 = new Class1_Sub6(arg0);
		@Pc(19) Class1_Sub6 local19 = new Class1_Sub6(arg0);
		@Pc(24) Class1_Sub6 local24 = new Class1_Sub6(arg0);
		@Pc(29) Class1_Sub6 local29 = new Class1_Sub6(arg0);
		@Pc(34) Class1_Sub6 local34 = new Class1_Sub6(arg0);
		local4.anInt839 = arg0.length - 23;
		@Pc(44) int local44 = local4.method546();
		@Pc(48) int local48 = local4.method546();
		@Pc(52) int local52 = local4.method544();
		@Pc(56) int local56 = local4.method544();
		@Pc(60) int local60 = local4.method544();
		@Pc(64) int local64 = local4.method544();
		@Pc(68) int local68 = local4.method544();
		@Pc(72) int local72 = local4.method544();
		@Pc(76) int local76 = local4.method544();
		@Pc(80) int local80 = local4.method546();
		@Pc(84) int local84 = local4.method546();
		@Pc(88) int local88 = local4.method546();
		@Pc(92) int local92 = local4.method546();
		@Pc(96) int local96 = local4.method546();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray25 = new byte[local52];
			local4.anInt839 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray25[local113] = local4.method548();
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
		this.anInt2125 = local44;
		this.anInt2117 = local48;
		this.anInt2123 = local52;
		this.anIntArray179 = new int[local44];
		this.anIntArray180 = new int[local44];
		this.anIntArray178 = new int[local44];
		this.anIntArray177 = new int[local48];
		this.anIntArray182 = new int[local48];
		this.anIntArray187 = new int[local48];
		if (local76 == 1) {
			this.anIntArray184 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray24 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray22 = new byte[local48];
		} else {
			this.aByte3 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray23 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray176 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray15 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray21 = new byte[local48];
		}
		this.aShortArray18 = new short[local48];
		if (local52 > 0) {
			this.aShortArray20 = new short[local52];
			this.aShortArray16 = new short[local52];
			this.aShortArray13 = new short[local52];
			if (local100 > 0) {
				this.aShortArray14 = new short[local100];
				this.aShortArray17 = new short[local100];
				this.aShortArray19 = new short[local100];
				this.aByteArray19 = new byte[local100];
				this.aByteArray27 = new byte[local100];
				this.aByteArray18 = new byte[local100];
			}
			if (local102 > 0) {
				this.aByteArray20 = new byte[local102];
				this.aByteArray26 = new byte[local102];
			}
		}
		local4.anInt839 = local52;
		local9.anInt839 = local233;
		local14.anInt839 = local239;
		local19.anInt839 = local245;
		local24.anInt839 = local184;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(461) int local461 = 0;
		@Pc(468) int local468;
		@Pc(470) int local470;
		@Pc(480) int local480;
		@Pc(490) int local490;
		for (@Pc(463) int local463 = 0; local463 < local44; local463++) {
			local468 = local4.method544();
			local470 = 0;
			if ((local468 & 0x1) != 0) {
				local470 = local9.method525();
			}
			local480 = 0;
			if ((local468 & 0x2) != 0) {
				local480 = local14.method525();
			}
			local490 = 0;
			if ((local468 & 0x4) != 0) {
				local490 = local19.method525();
			}
			this.anIntArray179[local463] = local457 + local470;
			this.anIntArray180[local463] = local459 + local480;
			this.anIntArray178[local463] = local461 + local490;
			local457 = this.anIntArray179[local463];
			local459 = this.anIntArray180[local463];
			local461 = this.anIntArray178[local463];
			if (local76 == 1) {
				this.anIntArray184[local463] = local24.method544();
			}
		}
		local4.anInt839 = local225;
		local9.anInt839 = local151;
		local14.anInt839 = local166;
		local19.anInt839 = local193;
		local24.anInt839 = local175;
		local29.anInt839 = local208;
		local34.anInt839 = local219;
		for (local468 = 0; local468 < local48; local468++) {
			this.aShortArray18[local468] = (short) local4.method546();
			if (local56 == 1) {
				this.aByteArray24[local468] = local9.method548();
			}
			if (local60 == 255) {
				this.aByteArray22[local468] = local14.method548();
			}
			if (local64 == 1) {
				this.aByteArray23[local468] = local19.method548();
			}
			if (local68 == 1) {
				this.anIntArray176[local468] = local24.method544();
			}
			if (local72 == 1) {
				this.aShortArray15[local468] = (short) (local29.method546() - 1);
			}
			if (this.aByteArray21 != null) {
				if (this.aShortArray15[local468] == -1) {
					this.aByteArray21[local468] = -1;
				} else {
					this.aByteArray21[local468] = (byte) (local34.method544() - 1);
				}
			}
		}
		local4.anInt839 = local202;
		local9.anInt839 = local160;
		local470 = 0;
		local480 = 0;
		local490 = 0;
		@Pc(676) int local676 = 0;
		@Pc(683) int local683;
		@Pc(786) int local786;
		for (@Pc(678) int local678 = 0; local678 < local48; local678++) {
			local683 = local9.method544();
			if (local683 == 1) {
				local470 = local4.method525() + local676;
				local480 = local4.method525() + local470;
				local490 = local4.method525() + local480;
				local676 = local490;
				this.anIntArray177[local678] = local470;
				this.anIntArray182[local678] = local480;
				this.anIntArray187[local678] = local490;
			}
			if (local683 == 2) {
				local480 = local490;
				local490 = local4.method525() + local676;
				local676 = local490;
				this.anIntArray177[local678] = local470;
				this.anIntArray182[local678] = local480;
				this.anIntArray187[local678] = local490;
			}
			if (local683 == 3) {
				local470 = local490;
				local490 = local4.method525() + local676;
				local676 = local490;
				this.anIntArray177[local678] = local470;
				this.anIntArray182[local678] = local480;
				this.anIntArray187[local678] = local490;
			}
			if (local683 == 4) {
				local786 = local470;
				local470 = local480;
				local480 = local786;
				local490 = local4.method525() + local676;
				local676 = local490;
				this.anIntArray177[local678] = local470;
				this.anIntArray182[local678] = local786;
				this.anIntArray187[local678] = local490;
			}
		}
		local4.anInt839 = local251;
		local9.anInt839 = local259;
		local14.anInt839 = local267;
		local19.anInt839 = local275;
		local24.anInt839 = local281;
		local29.anInt839 = local287;
		for (local683 = 0; local683 < local52; local683++) {
			local786 = this.aByteArray25[local683] & 0xFF;
			if (local786 == 0) {
				this.aShortArray20[local683] = (short) local4.method546();
				this.aShortArray16[local683] = (short) local4.method546();
				this.aShortArray13[local683] = (short) local4.method546();
			}
			if (local786 == 1) {
				this.aShortArray20[local683] = (short) local9.method546();
				this.aShortArray16[local683] = (short) local9.method546();
				this.aShortArray13[local683] = (short) local9.method546();
				this.aShortArray14[local683] = (short) local14.method546();
				this.aShortArray17[local683] = (short) local14.method546();
				this.aShortArray19[local683] = (short) local14.method546();
				this.aByteArray19[local683] = local19.method548();
				this.aByteArray27[local683] = local24.method548();
				this.aByteArray18[local683] = local29.method548();
			}
			if (local786 == 2) {
				this.aShortArray20[local683] = (short) local9.method546();
				this.aShortArray16[local683] = (short) local9.method546();
				this.aShortArray13[local683] = (short) local9.method546();
				this.aShortArray14[local683] = (short) local14.method546();
				this.aShortArray17[local683] = (short) local14.method546();
				this.aShortArray19[local683] = (short) local14.method546();
				this.aByteArray19[local683] = local19.method548();
				this.aByteArray27[local683] = local24.method548();
				this.aByteArray18[local683] = local29.method548();
				this.aByteArray20[local683] = local29.method548();
				this.aByteArray26[local683] = local29.method548();
			}
			if (local786 == 3) {
				this.aShortArray20[local683] = (short) local9.method546();
				this.aShortArray16[local683] = (short) local9.method546();
				this.aShortArray13[local683] = (short) local9.method546();
				this.aShortArray14[local683] = (short) local14.method546();
				this.aShortArray17[local683] = (short) local14.method546();
				this.aShortArray19[local683] = (short) local14.method546();
				this.aByteArray19[local683] = local19.method548();
				this.aByteArray27[local683] = local24.method548();
				this.aByteArray18[local683] = local29.method548();
			}
		}
		local4.anInt839 = local113;
		local786 = local4.method544();
		if (local786 == 0) {
			return;
		}
		new Class11();
		local4.method546();
		local4.method546();
		local4.method546();
		local4.method499();
	}

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "()V")
	public void method1491() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray184 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt2125; local9++) {
				local15 = this.anIntArray184[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray61 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray61[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt2125) {
				local65 = this.anIntArray184[local59];
				this.anIntArrayArray61[local65][local5[local65]++] = local59++;
			}
			this.anIntArray184 = null;
		}
		if (this.anIntArray176 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt2117; local9++) {
			local15 = this.anIntArray176[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray60 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray60[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt2117) {
			local65 = this.anIntArray176[local59];
			this.anIntArrayArray60[local65][local5[local65]++] = local59++;
		}
		this.anIntArray176 = null;
	}

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "()V")
	public void method1492() {
		if (this.aClass89Array2 != null) {
			return;
		}
		this.aClass89Array2 = new Class89[this.anInt2125];
		for (@Pc(10) int local10 = 0; local10 < this.anInt2125; local10++) {
			this.aClass89Array2[local10] = new Class89();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt2117; local25++) {
			@Pc(31) int local31 = this.anIntArray177[local25];
			@Pc(36) int local36 = this.anIntArray182[local25];
			@Pc(41) int local41 = this.anIntArray187[local25];
			@Pc(51) int local51 = this.anIntArray179[local36] - this.anIntArray179[local31];
			@Pc(61) int local61 = this.anIntArray180[local36] - this.anIntArray180[local31];
			@Pc(71) int local71 = this.anIntArray178[local36] - this.anIntArray178[local31];
			@Pc(81) int local81 = this.anIntArray179[local41] - this.anIntArray179[local31];
			@Pc(91) int local91 = this.anIntArray180[local41] - this.anIntArray180[local31];
			@Pc(101) int local101 = this.anIntArray178[local41] - this.anIntArray178[local31];
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
			if (this.aByteArray24 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray24[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class89 local211 = this.aClass89Array2[local31];
				local211.anInt4742 += local109;
				local211.anInt4741 += local117;
				local211.anInt4740 += local125;
				local211.anInt4744++;
				@Pc(240) Class89 local240 = this.aClass89Array2[local36];
				local240.anInt4742 += local109;
				local240.anInt4741 += local117;
				local240.anInt4740 += local125;
				local240.anInt4744++;
				@Pc(269) Class89 local269 = this.aClass89Array2[local41];
				local269.anInt4742 += local109;
				local269.anInt4741 += local117;
				local269.anInt4740 += local125;
				local269.anInt4744++;
			} else if (local198 == 1) {
				if (this.aClass28Array1 == null) {
					this.aClass28Array1 = new Class28[this.anInt2117];
				}
				@Pc(314) Class28 local314 = this.aClass28Array1[local25] = new Class28();
				local314.anInt1811 = local109;
				local314.anInt1812 = local117;
				local314.anInt1807 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "()V")
	public void method1493() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2125; local1++) {
			this.anIntArray178[local1] = -this.anIntArray178[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt2117; local18++) {
			@Pc(24) int local24 = this.anIntArray177[local18];
			this.anIntArray177[local18] = this.anIntArray187[local18];
			this.anIntArray187[local18] = local24;
		}
		this.method1482();
	}
}
