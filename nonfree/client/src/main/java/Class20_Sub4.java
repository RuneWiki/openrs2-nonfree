import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class20_Sub4 extends Class20 {

	@OriginalMember(owner = "client!ib", name = "n", descriptor = "[B")
	private byte[] aByteArray13;

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "[I")
	public int[] anIntArray155;

	@OriginalMember(owner = "client!ib", name = "q", descriptor = "[S")
	public short[] aShortArray18;

	@OriginalMember(owner = "client!ib", name = "r", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!ib", name = "s", descriptor = "[B")
	public byte[] aByteArray14;

	@OriginalMember(owner = "client!ib", name = "t", descriptor = "S")
	private short aShort10;

	@OriginalMember(owner = "client!ib", name = "v", descriptor = "[Lclient!p;")
	public Class85[] aClass85Array1;

	@OriginalMember(owner = "client!ib", name = "x", descriptor = "[I")
	public int[] anIntArray157;

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "[B")
	private byte[] aByteArray15;

	@OriginalMember(owner = "client!ib", name = "z", descriptor = "[Lclient!p;")
	public Class85[] aClass85Array2;

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
	public int anInt1861;

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "[B")
	private byte[] aByteArray16;

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "[I")
	private int[] anIntArray159;

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!ib", name = "H", descriptor = "S")
	private short aShort11;

	@OriginalMember(owner = "client!ib", name = "I", descriptor = "[I")
	private int[] anIntArray160;

	@OriginalMember(owner = "client!ib", name = "J", descriptor = "[[I")
	public int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!ib", name = "K", descriptor = "S")
	public short aShort12;

	@OriginalMember(owner = "client!ib", name = "M", descriptor = "[S")
	public short[] aShortArray22;

	@OriginalMember(owner = "client!ib", name = "N", descriptor = "S")
	private short aShort13;

	@OriginalMember(owner = "client!ib", name = "O", descriptor = "[S")
	public short[] aShortArray23;

	@OriginalMember(owner = "client!ib", name = "Q", descriptor = "S")
	public short aShort14;

	@OriginalMember(owner = "client!ib", name = "R", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!ib", name = "S", descriptor = "[I")
	public int[] anIntArray161;

	@OriginalMember(owner = "client!ib", name = "T", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "client!ib", name = "U", descriptor = "S")
	private short aShort15;

	@OriginalMember(owner = "client!ib", name = "V", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!ib", name = "W", descriptor = "[S")
	public short[] aShortArray24;

	@OriginalMember(owner = "client!ib", name = "X", descriptor = "[S")
	public short[] aShortArray25;

	@OriginalMember(owner = "client!ib", name = "Y", descriptor = "[I")
	public int[] anIntArray162;

	@OriginalMember(owner = "client!ib", name = "ab", descriptor = "[I")
	public int[] anIntArray163;

	@OriginalMember(owner = "client!ib", name = "bb", descriptor = "[B")
	private byte[] aByteArray20;

	@OriginalMember(owner = "client!ib", name = "cb", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!ib", name = "db", descriptor = "[I")
	public int[] anIntArray164;

	@OriginalMember(owner = "client!ib", name = "eb", descriptor = "[[I")
	public int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!ib", name = "fb", descriptor = "S")
	private short aShort16;

	@OriginalMember(owner = "client!ib", name = "hb", descriptor = "S")
	private short aShort17;

	@OriginalMember(owner = "client!ib", name = "ib", descriptor = "[B")
	public byte[] aByteArray22;

	@OriginalMember(owner = "client!ib", name = "jb", descriptor = "[Lclient!u;")
	public Class114[] aClass114Array1;

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
	public int anInt1862 = 0;

	@OriginalMember(owner = "client!ib", name = "L", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!ib", name = "Z", descriptor = "B")
	public byte aByte4 = 0;

	@OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
	public int anInt1860 = 0;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
	private Class20_Sub4() {
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([B)V")
	public Class20_Sub4(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1401(arg0);
		} else {
			this.method1407(arg0);
		}
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(III)V")
	public Class20_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray164 = new int[arg0];
		this.anIntArray161 = new int[arg0];
		this.anIntArray157 = new int[arg0];
		this.anIntArray159 = new int[arg0];
		this.anIntArray155 = new int[arg1];
		this.anIntArray162 = new int[arg1];
		this.anIntArray163 = new int[arg1];
		this.aByteArray19 = new byte[arg1];
		this.aByteArray21 = new byte[arg1];
		this.aByteArray18 = new byte[arg1];
		this.aShortArray23 = new short[arg1];
		this.aShortArray18 = new short[arg1];
		this.aByteArray22 = new byte[arg1];
		this.anIntArray160 = new int[arg1];
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([Lclient!ib;I)V")
	public Class20_Sub4(@OriginalArg(0) Class20_Sub4[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt1862 = 0;
		this.anInt1860 = 0;
		this.anInt1861 = 0;
		this.aByte4 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class20_Sub4 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt1862 += local44.anInt1862;
				this.anInt1860 += local44.anInt1860;
				this.anInt1861 += local44.anInt1861;
				if (local44.aByteArray21 == null) {
					if (this.aByte4 == -1) {
						this.aByte4 = local44.aByte4;
					}
					if (this.aByte4 != local44.aByte4) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray19 != null;
				local19 |= local44.aByteArray18 != null;
				local21 |= local44.anIntArray160 != null;
				local23 |= local44.aShortArray18 != null;
				local25 |= local44.aByteArray22 != null;
			}
		}
		this.anIntArray164 = new int[this.anInt1862];
		this.anIntArray161 = new int[this.anInt1862];
		this.anIntArray157 = new int[this.anInt1862];
		this.anIntArray159 = new int[this.anInt1862];
		this.anIntArray155 = new int[this.anInt1860];
		this.anIntArray162 = new int[this.anInt1860];
		this.anIntArray163 = new int[this.anInt1860];
		if (local15) {
			this.aByteArray19 = new byte[this.anInt1860];
		}
		if (local17) {
			this.aByteArray21 = new byte[this.anInt1860];
		}
		if (local19) {
			this.aByteArray18 = new byte[this.anInt1860];
		}
		if (local21) {
			this.anIntArray160 = new int[this.anInt1860];
		}
		if (local23) {
			this.aShortArray18 = new short[this.anInt1860];
		}
		if (local25) {
			this.aByteArray22 = new byte[this.anInt1860];
		}
		this.aShortArray23 = new short[this.anInt1860];
		if (this.anInt1861 > 0) {
			this.aByteArray14 = new byte[this.anInt1861];
			this.aShortArray24 = new short[this.anInt1861];
			this.aShortArray22 = new short[this.anInt1861];
			this.aShortArray25 = new short[this.anInt1861];
			this.aShortArray21 = new short[this.anInt1861];
			this.aShortArray20 = new short[this.anInt1861];
			this.aShortArray19 = new short[this.anInt1861];
			this.aByteArray17 = new byte[this.anInt1861];
			this.aByteArray15 = new byte[this.anInt1861];
			this.aByteArray20 = new byte[this.anInt1861];
			this.aByteArray16 = new byte[this.anInt1861];
			this.aByteArray13 = new byte[this.anInt1861];
		}
		this.anInt1862 = 0;
		this.anInt1860 = 0;
		this.anInt1861 = 0;
		for (@Pc(293) int local293 = 0; local293 < arg1; local293++) {
			@Pc(298) Class20_Sub4 local298 = arg0[local293];
			if (local298 != null) {
				for (@Pc(302) int local302 = 0; local302 < local298.anInt1860; local302++) {
					if (local15 && local298.aByteArray19 != null) {
						this.aByteArray19[this.anInt1860] = local298.aByteArray19[local302];
					}
					if (local17) {
						if (local298.aByteArray21 == null) {
							this.aByteArray21[this.anInt1860] = local298.aByte4;
						} else {
							this.aByteArray21[this.anInt1860] = local298.aByteArray21[local302];
						}
					}
					if (local19 && local298.aByteArray18 != null) {
						this.aByteArray18[this.anInt1860] = local298.aByteArray18[local302];
					}
					if (local21 && local298.anIntArray160 != null) {
						this.anIntArray160[this.anInt1860] = local298.anIntArray160[local302];
					}
					if (local23) {
						if (local298.aShortArray18 == null) {
							this.aShortArray18[this.anInt1860] = -1;
						} else {
							this.aShortArray18[this.anInt1860] = local298.aShortArray18[local302];
						}
					}
					if (local25) {
						if (local298.aByteArray22 == null || local298.aByteArray22[local302] == -1) {
							this.aByteArray22[this.anInt1860] = -1;
						} else {
							this.aByteArray22[this.anInt1860] = (byte) (local298.aByteArray22[local302] + this.anInt1861);
						}
					}
					this.aShortArray23[this.anInt1860] = local298.aShortArray23[local302];
					this.anIntArray155[this.anInt1860] = this.method1412(local298, local298.anIntArray155[local302]);
					this.anIntArray162[this.anInt1860] = this.method1412(local298, local298.anIntArray162[local302]);
					this.anIntArray163[this.anInt1860] = this.method1412(local298, local298.anIntArray163[local302]);
					this.anInt1860++;
				}
				for (@Pc(477) int local477 = 0; local477 < local298.anInt1861; local477++) {
					@Pc(489) byte local489 = this.aByteArray14[this.anInt1861] = local298.aByteArray14[local477];
					if (local489 == 0) {
						this.aShortArray24[this.anInt1861] = (short) this.method1412(local298, local298.aShortArray24[local477]);
						this.aShortArray22[this.anInt1861] = (short) this.method1412(local298, local298.aShortArray22[local477]);
						this.aShortArray25[this.anInt1861] = (short) this.method1412(local298, local298.aShortArray25[local477]);
					}
					if (local489 >= 1 && local489 <= 3) {
						this.aShortArray24[this.anInt1861] = local298.aShortArray24[local477];
						this.aShortArray22[this.anInt1861] = local298.aShortArray22[local477];
						this.aShortArray25[this.anInt1861] = local298.aShortArray25[local477];
						this.aShortArray21[this.anInt1861] = local298.aShortArray21[local477];
						this.aShortArray20[this.anInt1861] = local298.aShortArray20[local477];
						this.aShortArray19[this.anInt1861] = local298.aShortArray19[local477];
						this.aByteArray17[this.anInt1861] = local298.aByteArray17[local477];
						this.aByteArray15[this.anInt1861] = local298.aByteArray15[local477];
						this.aByteArray20[this.anInt1861] = local298.aByteArray20[local477];
					}
					if (local489 == 2) {
						this.aByteArray16[this.anInt1861] = local298.aByteArray16[local477];
						this.aByteArray13[this.anInt1861] = local298.aByteArray13[local477];
					}
					this.anInt1861++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!ib;ZZZZ)V")
	public Class20_Sub4(@OriginalArg(0) Class20_Sub4 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1862 = arg0.anInt1862;
		this.anInt1860 = arg0.anInt1860;
		this.anInt1861 = arg0.anInt1861;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray164 = arg0.anIntArray164;
			this.anIntArray161 = arg0.anIntArray161;
			this.anIntArray157 = arg0.anIntArray157;
		} else {
			this.anIntArray164 = new int[this.anInt1862];
			this.anIntArray161 = new int[this.anInt1862];
			this.anIntArray157 = new int[this.anInt1862];
			for (local57 = 0; local57 < this.anInt1862; local57++) {
				this.anIntArray164[local57] = arg0.anIntArray164[local57];
				this.anIntArray161[local57] = arg0.anIntArray161[local57];
				this.anIntArray157[local57] = arg0.anIntArray157[local57];
			}
		}
		if (arg2) {
			this.aShortArray23 = arg0.aShortArray23;
		} else {
			this.aShortArray23 = new short[this.anInt1860];
			for (local57 = 0; local57 < this.anInt1860; local57++) {
				this.aShortArray23[local57] = arg0.aShortArray23[local57];
			}
		}
		if (arg3 || arg0.aShortArray18 == null) {
			this.aShortArray18 = arg0.aShortArray18;
		} else {
			this.aShortArray18 = new short[this.anInt1860];
			for (local57 = 0; local57 < this.anInt1860; local57++) {
				this.aShortArray18[local57] = arg0.aShortArray18[local57];
			}
		}
		this.aByteArray18 = arg0.aByteArray18;
		this.anIntArray155 = arg0.anIntArray155;
		this.anIntArray162 = arg0.anIntArray162;
		this.anIntArray163 = arg0.anIntArray163;
		this.aByteArray19 = arg0.aByteArray19;
		this.aByteArray21 = arg0.aByteArray21;
		this.aByteArray22 = arg0.aByteArray22;
		this.aByte4 = arg0.aByte4;
		this.aByteArray14 = arg0.aByteArray14;
		this.aShortArray24 = arg0.aShortArray24;
		this.aShortArray22 = arg0.aShortArray22;
		this.aShortArray25 = arg0.aShortArray25;
		this.aShortArray21 = arg0.aShortArray21;
		this.aShortArray20 = arg0.aShortArray20;
		this.aShortArray19 = arg0.aShortArray19;
		this.aByteArray17 = arg0.aByteArray17;
		this.aByteArray15 = arg0.aByteArray15;
		this.aByteArray20 = arg0.aByteArray20;
		this.aByteArray16 = arg0.aByteArray16;
		this.aByteArray13 = arg0.aByteArray13;
		this.anIntArray159 = arg0.anIntArray159;
		this.anIntArray160 = arg0.anIntArray160;
		this.anIntArrayArray8 = arg0.anIntArrayArray8;
		this.anIntArrayArray9 = arg0.anIntArrayArray9;
		this.aClass85Array2 = arg0.aClass85Array2;
		this.aClass114Array1 = arg0.aClass114Array1;
		this.aClass85Array1 = arg0.aClass85Array1;
		this.aShort12 = arg0.aShort12;
		this.aShort14 = arg0.aShort14;
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
	public void method1396() {
		@Pc(3) int local3 = Static89.anIntArray165[256];
		@Pc(7) int local7 = Static89.anIntArray158[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1862; local9++) {
			@Pc(26) int local26 = this.anIntArray157[local9] * local3 + this.anIntArray164[local9] * local7 >> 16;
			this.anIntArray157[local9] = this.anIntArray157[local9] * local7 - this.anIntArray164[local9] * local3 >> 16;
			this.anIntArray164[local9] = local26;
		}
		this.method1403();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIBSB)I")
	public int method1397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) short arg3, @OriginalArg(5) byte arg4) {
		this.anIntArray155[this.anInt1860] = arg0;
		this.anIntArray162[this.anInt1860] = arg1;
		this.anIntArray163[this.anInt1860] = arg2;
		this.aByteArray19[this.anInt1860] = 1;
		this.aByteArray22[this.anInt1860] = -1;
		this.aShortArray23[this.anInt1860] = arg3;
		this.aShortArray18[this.anInt1860] = -1;
		this.aByteArray18[this.anInt1860] = arg4;
		return this.anInt1860++;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)Lclient!ta;")
	@Override
	public Class20 method3497() {
		return this.method1402(this.aShort12, this.aShort14, -50, -10, -50);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(SS)V")
	public void method1398(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray18 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt1860; local5++) {
			if (this.aShortArray18[local5] == arg0) {
				this.aShortArray18[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(IIIII)Lclient!kd;")
	public Class20_Sub5_Sub1 method1400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class20_Sub5_Sub1(this, arg0, arg1, -50, -10, -50);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([B)V")
	private void method1401(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class1_Sub17 local4 = new Class1_Sub17(arg0);
		@Pc(9) Class1_Sub17 local9 = new Class1_Sub17(arg0);
		@Pc(14) Class1_Sub17 local14 = new Class1_Sub17(arg0);
		@Pc(19) Class1_Sub17 local19 = new Class1_Sub17(arg0);
		@Pc(24) Class1_Sub17 local24 = new Class1_Sub17(arg0);
		@Pc(29) Class1_Sub17 local29 = new Class1_Sub17(arg0);
		@Pc(34) Class1_Sub17 local34 = new Class1_Sub17(arg0);
		local4.anInt2656 = arg0.length - 23;
		@Pc(44) int local44 = local4.method2178();
		@Pc(48) int local48 = local4.method2178();
		@Pc(52) int local52 = local4.method2142();
		@Pc(56) int local56 = local4.method2142();
		@Pc(60) int local60 = local4.method2142();
		@Pc(64) int local64 = local4.method2142();
		@Pc(68) int local68 = local4.method2142();
		@Pc(72) int local72 = local4.method2142();
		@Pc(76) int local76 = local4.method2142();
		@Pc(80) int local80 = local4.method2178();
		@Pc(84) int local84 = local4.method2178();
		@Pc(88) int local88 = local4.method2178();
		@Pc(92) int local92 = local4.method2178();
		@Pc(96) int local96 = local4.method2178();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray14 = new byte[local52];
			local4.anInt2656 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray14[local113] = local4.method2155();
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
		this.anInt1862 = local44;
		this.anInt1860 = local48;
		this.anInt1861 = local52;
		this.anIntArray164 = new int[local44];
		this.anIntArray161 = new int[local44];
		this.anIntArray157 = new int[local44];
		this.anIntArray155 = new int[local48];
		this.anIntArray162 = new int[local48];
		this.anIntArray163 = new int[local48];
		if (local76 == 1) {
			this.anIntArray159 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray19 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray21 = new byte[local48];
		} else {
			this.aByte4 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray18 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray160 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray18 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray22 = new byte[local48];
		}
		this.aShortArray23 = new short[local48];
		if (local52 > 0) {
			this.aShortArray24 = new short[local52];
			this.aShortArray22 = new short[local52];
			this.aShortArray25 = new short[local52];
			if (local100 > 0) {
				this.aShortArray21 = new short[local100];
				this.aShortArray20 = new short[local100];
				this.aShortArray19 = new short[local100];
				this.aByteArray17 = new byte[local100];
				this.aByteArray15 = new byte[local100];
				this.aByteArray20 = new byte[local100];
			}
			if (local102 > 0) {
				this.aByteArray16 = new byte[local102];
				this.aByteArray13 = new byte[local102];
			}
		}
		local4.anInt2656 = local52;
		local9.anInt2656 = local233;
		local14.anInt2656 = local239;
		local19.anInt2656 = local245;
		local24.anInt2656 = local184;
		@Pc(455) int local455 = 0;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(466) int local466;
		@Pc(468) int local468;
		@Pc(478) int local478;
		@Pc(488) int local488;
		for (@Pc(461) int local461 = 0; local461 < local44; local461++) {
			local466 = local4.method2142();
			local468 = 0;
			if ((local466 & 0x1) != 0) {
				local468 = local9.method2177();
			}
			local478 = 0;
			if ((local466 & 0x2) != 0) {
				local478 = local14.method2177();
			}
			local488 = 0;
			if ((local466 & 0x4) != 0) {
				local488 = local19.method2177();
			}
			this.anIntArray164[local461] = local455 + local468;
			this.anIntArray161[local461] = local457 + local478;
			this.anIntArray157[local461] = local459 + local488;
			local455 = this.anIntArray164[local461];
			local457 = this.anIntArray161[local461];
			local459 = this.anIntArray157[local461];
			if (local76 == 1) {
				this.anIntArray159[local461] = local24.method2142();
			}
		}
		local4.anInt2656 = local225;
		local9.anInt2656 = local151;
		local14.anInt2656 = local166;
		local19.anInt2656 = local193;
		local24.anInt2656 = local175;
		local29.anInt2656 = local208;
		local34.anInt2656 = local219;
		for (local466 = 0; local466 < local48; local466++) {
			this.aShortArray23[local466] = (short) local4.method2178();
			if (local56 == 1) {
				this.aByteArray19[local466] = local9.method2155();
			}
			if (local60 == 255) {
				this.aByteArray21[local466] = local14.method2155();
			}
			if (local64 == 1) {
				this.aByteArray18[local466] = local19.method2155();
			}
			if (local68 == 1) {
				this.anIntArray160[local466] = local24.method2142();
			}
			if (local72 == 1) {
				this.aShortArray18[local466] = (short) (local29.method2178() - 1);
			}
			if (this.aByteArray22 != null) {
				if (this.aShortArray18[local466] == -1) {
					this.aByteArray22[local466] = -1;
				} else {
					this.aByteArray22[local466] = (byte) (local34.method2142() - 1);
				}
			}
		}
		local4.anInt2656 = local202;
		local9.anInt2656 = local160;
		local468 = 0;
		local478 = 0;
		local488 = 0;
		@Pc(674) int local674 = 0;
		@Pc(681) int local681;
		@Pc(784) int local784;
		for (@Pc(676) int local676 = 0; local676 < local48; local676++) {
			local681 = local9.method2142();
			if (local681 == 1) {
				local468 = local4.method2177() + local674;
				local478 = local4.method2177() + local468;
				local488 = local4.method2177() + local478;
				local674 = local488;
				this.anIntArray155[local676] = local468;
				this.anIntArray162[local676] = local478;
				this.anIntArray163[local676] = local488;
			}
			if (local681 == 2) {
				local478 = local488;
				local488 = local4.method2177() + local674;
				local674 = local488;
				this.anIntArray155[local676] = local468;
				this.anIntArray162[local676] = local478;
				this.anIntArray163[local676] = local488;
			}
			if (local681 == 3) {
				local468 = local488;
				local488 = local4.method2177() + local674;
				local674 = local488;
				this.anIntArray155[local676] = local468;
				this.anIntArray162[local676] = local478;
				this.anIntArray163[local676] = local488;
			}
			if (local681 == 4) {
				local784 = local468;
				local468 = local478;
				local478 = local784;
				local488 = local4.method2177() + local674;
				local674 = local488;
				this.anIntArray155[local676] = local468;
				this.anIntArray162[local676] = local784;
				this.anIntArray163[local676] = local488;
			}
		}
		local4.anInt2656 = local251;
		local9.anInt2656 = local259;
		local14.anInt2656 = local267;
		local19.anInt2656 = local275;
		local24.anInt2656 = local281;
		local29.anInt2656 = local113;
		for (local681 = 0; local681 < local52; local681++) {
			local784 = this.aByteArray14[local681] & 0xFF;
			if (local784 == 0) {
				this.aShortArray24[local681] = (short) local4.method2178();
				this.aShortArray22[local681] = (short) local4.method2178();
				this.aShortArray25[local681] = (short) local4.method2178();
			}
			if (local784 == 1) {
				this.aShortArray24[local681] = (short) local9.method2178();
				this.aShortArray22[local681] = (short) local9.method2178();
				this.aShortArray25[local681] = (short) local9.method2178();
				this.aShortArray21[local681] = (short) local14.method2178();
				this.aShortArray20[local681] = (short) local14.method2178();
				this.aShortArray19[local681] = (short) local14.method2178();
				this.aByteArray17[local681] = local19.method2155();
				this.aByteArray15[local681] = local24.method2155();
				this.aByteArray20[local681] = local29.method2155();
			}
			if (local784 == 2) {
				this.aShortArray24[local681] = (short) local9.method2178();
				this.aShortArray22[local681] = (short) local9.method2178();
				this.aShortArray25[local681] = (short) local9.method2178();
				this.aShortArray21[local681] = (short) local14.method2178();
				this.aShortArray20[local681] = (short) local14.method2178();
				this.aShortArray19[local681] = (short) local14.method2178();
				this.aByteArray17[local681] = local19.method2155();
				this.aByteArray15[local681] = local24.method2155();
				this.aByteArray20[local681] = local29.method2155();
				this.aByteArray16[local681] = local29.method2155();
				this.aByteArray13[local681] = local29.method2155();
			}
			if (local784 == 3) {
				this.aShortArray24[local681] = (short) local9.method2178();
				this.aShortArray22[local681] = (short) local9.method2178();
				this.aShortArray25[local681] = (short) local9.method2178();
				this.aShortArray21[local681] = (short) local14.method2178();
				this.aShortArray20[local681] = (short) local14.method2178();
				this.aShortArray19[local681] = (short) local14.method2178();
				this.aByteArray17[local681] = local19.method2155();
				this.aByteArray15[local681] = local24.method2155();
				this.aByteArray20[local681] = local29.method2155();
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(IIIII)Lclient!ra;")
	public Class20_Sub5 method1402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class20_Sub5_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "()V")
	private void method1403() {
		this.aClass85Array2 = null;
		this.aClass85Array1 = null;
		this.aClass114Array1 = null;
		this.aBoolean82 = false;
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "()V")
	public void method1404() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1862; local1++) {
			this.anIntArray164[local1] = -this.anIntArray164[local1];
			this.anIntArray157[local1] = -this.anIntArray157[local1];
		}
		this.method1403();
	}

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "()V")
	public void method1405() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1862; local1++) {
			@Pc(7) int local7 = this.anIntArray164[local1];
			this.anIntArray164[local1] = this.anIntArray157[local1];
			this.anIntArray157[local1] = -local7;
		}
		this.method1403();
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "()I")
	@Override
	public int method3494() {
		if (!this.aBoolean82) {
			this.method1419();
		}
		return this.aShort15;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(SS)V")
	public void method1406(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1860; local1++) {
			if (this.aShortArray23[local1] == arg0) {
				this.aShortArray23[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "([B)V")
	private void method1407(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class1_Sub17 local8 = new Class1_Sub17(arg0);
		@Pc(13) Class1_Sub17 local13 = new Class1_Sub17(arg0);
		@Pc(18) Class1_Sub17 local18 = new Class1_Sub17(arg0);
		@Pc(23) Class1_Sub17 local23 = new Class1_Sub17(arg0);
		@Pc(28) Class1_Sub17 local28 = new Class1_Sub17(arg0);
		local8.anInt2656 = arg0.length - 18;
		@Pc(38) int local38 = local8.method2178();
		@Pc(42) int local42 = local8.method2178();
		@Pc(46) int local46 = local8.method2142();
		@Pc(50) int local50 = local8.method2142();
		@Pc(54) int local54 = local8.method2142();
		@Pc(58) int local58 = local8.method2142();
		@Pc(62) int local62 = local8.method2142();
		@Pc(66) int local66 = local8.method2142();
		@Pc(70) int local70 = local8.method2178();
		@Pc(74) int local74 = local8.method2178();
		@Pc(78) int local78 = local8.method2178();
		@Pc(82) int local82 = local8.method2178();
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
		this.anInt1862 = local38;
		this.anInt1860 = local42;
		this.anInt1861 = local46;
		this.anIntArray164 = new int[local38];
		this.anIntArray161 = new int[local38];
		this.anIntArray157 = new int[local38];
		this.anIntArray155 = new int[local42];
		this.anIntArray162 = new int[local42];
		this.anIntArray163 = new int[local42];
		if (local46 > 0) {
			this.aByteArray14 = new byte[local46];
			this.aShortArray24 = new short[local46];
			this.aShortArray22 = new short[local46];
			this.aShortArray25 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray159 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray19 = new byte[local42];
			this.aByteArray22 = new byte[local42];
			this.aShortArray18 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray21 = new byte[local42];
		} else {
			this.aByte4 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray18 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray160 = new int[local42];
		}
		this.aShortArray23 = new short[local42];
		local8.anInt2656 = 0;
		local13.anInt2656 = local165;
		local18.anInt2656 = local171;
		local23.anInt2656 = local90;
		local28.anInt2656 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method2142();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method2177();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method2177();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method2177();
			}
			this.anIntArray164[local307] = local301 + local314;
			this.anIntArray161[local307] = local303 + local324;
			this.anIntArray157[local307] = local305 + local334;
			local301 = this.anIntArray164[local307];
			local303 = this.anIntArray161[local307];
			local305 = this.anIntArray157[local307];
			if (local66 == 1) {
				this.anIntArray159[local307] = local28.method2142();
			}
		}
		local8.anInt2656 = local149;
		local13.anInt2656 = local116;
		local18.anInt2656 = local98;
		local23.anInt2656 = local134;
		local28.anInt2656 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray23[local312] = (short) local8.method2178();
			if (local50 == 1) {
				local314 = local13.method2142();
				if ((local314 & 0x1) == 1) {
					this.aByteArray19[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray19[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray22[local312] = (byte) (local314 >> 2);
					this.aShortArray18[local312] = this.aShortArray23[local312];
					this.aShortArray23[local312] = 127;
					if (this.aShortArray18[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray22[local312] = -1;
					this.aShortArray18[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray21[local312] = local18.method2155();
			}
			if (local58 == 1) {
				this.aByteArray18[local312] = local23.method2155();
			}
			if (local62 == 1) {
				this.anIntArray160[local312] = local28.method2142();
			}
		}
		local8.anInt2656 = local143;
		local13.anInt2656 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method2142();
			if (local543 == 1) {
				local314 = local8.method2177() + local536;
				local324 = local8.method2177() + local314;
				local334 = local8.method2177() + local324;
				local536 = local334;
				this.anIntArray155[local538] = local314;
				this.anIntArray162[local538] = local324;
				this.anIntArray163[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method2177() + local536;
				local536 = local334;
				this.anIntArray155[local538] = local314;
				this.anIntArray162[local538] = local324;
				this.anIntArray163[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method2177() + local536;
				local536 = local334;
				this.anIntArray155[local538] = local314;
				this.anIntArray162[local538] = local324;
				this.anIntArray163[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method2177() + local536;
				local536 = local334;
				this.anIntArray155[local538] = local314;
				this.anIntArray162[local538] = local646;
				this.anIntArray163[local538] = local334;
			}
		}
		local8.anInt2656 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray14[local543] = 0;
			this.aShortArray24[local543] = (short) local8.method2178();
			this.aShortArray22[local543] = (short) local8.method2178();
			this.aShortArray25[local543] = (short) local8.method2178();
		}
		if (this.aByteArray22 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray22[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray24[local731] & 0xFFFF) == this.anIntArray155[local723] && (this.aShortArray22[local731] & 0xFFFF) == this.anIntArray162[local723] && (this.aShortArray25[local731] & 0xFFFF) == this.anIntArray163[local723]) {
						this.aByteArray22[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray22 = null;
			}
		}
		if (!local3) {
			this.aShortArray18 = null;
		}
		if (!local1) {
			this.aByteArray19 = null;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "()Z")
	@Override
	public boolean method3487() {
		return true;
	}

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "()V")
	public void method1408() {
		if (this.aClass85Array2 != null) {
			return;
		}
		this.aClass85Array2 = new Class85[this.anInt1862];
		for (@Pc(10) int local10 = 0; local10 < this.anInt1862; local10++) {
			this.aClass85Array2[local10] = new Class85();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt1860; local25++) {
			@Pc(31) int local31 = this.anIntArray155[local25];
			@Pc(36) int local36 = this.anIntArray162[local25];
			@Pc(41) int local41 = this.anIntArray163[local25];
			@Pc(51) int local51 = this.anIntArray164[local36] - this.anIntArray164[local31];
			@Pc(61) int local61 = this.anIntArray161[local36] - this.anIntArray161[local31];
			@Pc(71) int local71 = this.anIntArray157[local36] - this.anIntArray157[local31];
			@Pc(81) int local81 = this.anIntArray164[local41] - this.anIntArray164[local31];
			@Pc(91) int local91 = this.anIntArray161[local41] - this.anIntArray161[local31];
			@Pc(101) int local101 = this.anIntArray157[local41] - this.anIntArray157[local31];
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
			if (this.aByteArray19 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray19[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class85 local211 = this.aClass85Array2[local31];
				local211.anInt3272 += local109;
				local211.anInt3276 += local117;
				local211.anInt3270 += local125;
				local211.anInt3277++;
				@Pc(240) Class85 local240 = this.aClass85Array2[local36];
				local240.anInt3272 += local109;
				local240.anInt3276 += local117;
				local240.anInt3270 += local125;
				local240.anInt3277++;
				@Pc(269) Class85 local269 = this.aClass85Array2[local41];
				local269.anInt3272 += local109;
				local269.anInt3276 += local117;
				local269.anInt3270 += local125;
				local269.anInt3277++;
			} else if (local198 == 1) {
				if (this.aClass114Array1 == null) {
					this.aClass114Array1 = new Class114[this.anInt1860];
				}
				@Pc(314) Class114 local314 = this.aClass114Array1[local25] = new Class114();
				local314.anInt4117 = local109;
				local314.anInt4119 = local117;
				local314.anInt4116 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
	private void method1409(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static89.anIntArray165[arg0];
		@Pc(7) int local7 = Static89.anIntArray158[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1862; local9++) {
			@Pc(26) int local26 = this.anIntArray161[local9] * local3 + this.anIntArray164[local9] * local7 >> 16;
			this.anIntArray161[local9] = this.anIntArray161[local9] * local7 - this.anIntArray164[local9] * local3 >> 16;
			this.anIntArray164[local9] = local26;
		}
		this.method1403();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([[IIIIII)V")
	private void method1410(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static89.method1423(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static89.method1423(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static89.method1423(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static89.method1423(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		@Pc(118) int local118 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
		if (local118 != 0) {
			this.method1418(local118);
		}
		@Pc(136) int local136 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
		if (local136 != 0) {
			this.method1409(local136);
		}
		@Pc(145) int local145 = local24 + local77;
		if (local42 + local60 < local145) {
			local145 = local42 + local60;
		}
		local145 = (local145 >> 1) - arg2;
		if (local145 != 0) {
			this.method1425(0, local145, 0);
		}
	}

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "()V")
	public void method1411() {
		this.anIntArray159 = null;
		this.anIntArray160 = null;
		this.anIntArrayArray8 = null;
		this.anIntArrayArray9 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!ib;I)I")
	private int method1412(@OriginalArg(0) Class20_Sub4 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray164[arg1];
		@Pc(11) int local11 = arg0.anIntArray161[arg1];
		@Pc(16) int local16 = arg0.anIntArray157[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt1862; local18++) {
			if (local6 == this.anIntArray164[local18] && local11 == this.anIntArray161[local18] && local16 == this.anIntArray157[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray164[this.anInt1862] = local6;
			this.anIntArray161[this.anInt1862] = local11;
			this.anIntArray157[this.anInt1862] = local16;
			if (arg0.anIntArray159 != null) {
				this.anIntArray159[this.anInt1862] = arg0.anIntArray159[arg1];
			}
			local1 = this.anInt1862++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "()V")
	public void method1413() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1862; local1++) {
			@Pc(7) int local7 = this.anIntArray157[local1];
			this.anIntArray157[local1] = this.anIntArray164[local1];
			this.anIntArray164[local1] = -local7;
		}
		this.method1403();
	}

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "()Lclient!ib;")
	public Class20_Sub4 method1414() {
		@Pc(3) Class20_Sub4 local3 = new Class20_Sub4();
		if (this.aByteArray19 != null) {
			local3.aByteArray19 = new byte[this.anInt1860];
			for (@Pc(13) int local13 = 0; local13 < this.anInt1860; local13++) {
				local3.aByteArray19[local13] = this.aByteArray19[local13];
			}
		}
		local3.anInt1862 = this.anInt1862;
		local3.anInt1860 = this.anInt1860;
		local3.anInt1861 = this.anInt1861;
		local3.anIntArray164 = this.anIntArray164;
		local3.anIntArray161 = this.anIntArray161;
		local3.anIntArray157 = this.anIntArray157;
		local3.anIntArray155 = this.anIntArray155;
		local3.anIntArray162 = this.anIntArray162;
		local3.anIntArray163 = this.anIntArray163;
		local3.aByteArray21 = this.aByteArray21;
		local3.aByteArray18 = this.aByteArray18;
		local3.aByteArray22 = this.aByteArray22;
		local3.aShortArray23 = this.aShortArray23;
		local3.aShortArray18 = this.aShortArray18;
		local3.aByte4 = this.aByte4;
		local3.aByteArray14 = this.aByteArray14;
		local3.aShortArray24 = this.aShortArray24;
		local3.aShortArray22 = this.aShortArray22;
		local3.aShortArray25 = this.aShortArray25;
		local3.aShortArray21 = this.aShortArray21;
		local3.aShortArray20 = this.aShortArray20;
		local3.aShortArray19 = this.aShortArray19;
		local3.aByteArray17 = this.aByteArray17;
		local3.aByteArray15 = this.aByteArray15;
		local3.aByteArray20 = this.aByteArray20;
		local3.aByteArray16 = this.aByteArray16;
		local3.aByteArray13 = this.aByteArray13;
		local3.anIntArray159 = this.anIntArray159;
		local3.anIntArray160 = this.anIntArray160;
		local3.anIntArrayArray8 = this.anIntArrayArray8;
		local3.anIntArrayArray9 = this.anIntArrayArray9;
		local3.aClass85Array2 = this.aClass85Array2;
		local3.aClass114Array1 = this.aClass114Array1;
		local3.aShort12 = this.aShort12;
		local3.aShort14 = this.aShort14;
		return local3;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(III)I")
	public int method1415(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1862; local1++) {
			if (this.anIntArray164[local1] == arg0 && this.anIntArray161[local1] == 0 && this.anIntArray157[local1] == arg1) {
				return local1;
			}
		}
		this.anIntArray164[this.anInt1862] = arg0;
		this.anIntArray161[this.anInt1862] = 0;
		this.anIntArray157[this.anInt1862] = arg1;
		return this.anInt1862++;
	}

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "()V")
	public void method1416() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1862; local1++) {
			this.anIntArray157[local1] = -this.anIntArray157[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt1860; local18++) {
			@Pc(24) int local24 = this.anIntArray155[local18];
			this.anIntArray155[local18] = this.anIntArray163[local18];
			this.anIntArray163[local18] = local24;
		}
		this.method1403();
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(III)V")
	public void method1417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1862; local1++) {
			this.anIntArray164[local1] = this.anIntArray164[local1] * arg0 / 128;
			this.anIntArray161[local1] = this.anIntArray161[local1] * arg1 / 128;
			this.anIntArray157[local1] = this.anIntArray157[local1] * arg2 / 128;
		}
		this.method1403();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!ta;IIIZ)V")
	@Override
	public void method3490(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class20_Sub4 local2 = (Class20_Sub4) arg0;
		local2.method1419();
		local2.method1408();
		Static89.anInt1863++;
		@Pc(12) int local12 = 0;
		@Pc(15) int[] local15 = local2.anIntArray164;
		@Pc(18) int local18 = local2.anInt1862;
		@Pc(36) int local36;
		for (@Pc(20) int local20 = 0; local20 < this.anInt1862; local20++) {
			@Pc(26) Class85 local26 = this.aClass85Array2[local20];
			if (local26.anInt3277 != 0) {
				local36 = this.anIntArray161[local20] - arg2;
				if (local36 >= local2.aShort15 && local36 <= local2.aShort11) {
					@Pc(52) int local52 = this.anIntArray164[local20] - arg1;
					if (local52 >= local2.aShort17 && local52 <= local2.aShort16) {
						@Pc(68) int local68 = this.anIntArray157[local20] - arg3;
						if (local68 >= local2.aShort10 && local68 <= local2.aShort13) {
							for (@Pc(79) int local79 = 0; local79 < local18; local79++) {
								@Pc(85) Class85 local85 = local2.aClass85Array2[local79];
								if (local52 == local15[local79] && local68 == local2.anIntArray157[local79] && local36 == local2.anIntArray161[local79] && local85.anInt3277 != 0) {
									if (this.aClass85Array1 == null) {
										this.aClass85Array1 = new Class85[this.anInt1862];
									}
									if (local2.aClass85Array1 == null) {
										local2.aClass85Array1 = new Class85[local18];
									}
									@Pc(125) Class85 local125 = this.aClass85Array1[local20];
									if (local125 == null) {
										local125 = this.aClass85Array1[local20] = new Class85(local26);
									}
									@Pc(142) Class85 local142 = local2.aClass85Array1[local79];
									if (local142 == null) {
										local142 = local2.aClass85Array1[local79] = new Class85(local85);
									}
									local125.anInt3272 += local85.anInt3272;
									local125.anInt3276 += local85.anInt3276;
									local125.anInt3270 += local85.anInt3270;
									local125.anInt3277 += local85.anInt3277;
									local142.anInt3272 += local26.anInt3272;
									local142.anInt3276 += local26.anInt3276;
									local142.anInt3270 += local26.anInt3270;
									local142.anInt3277 += local26.anInt3277;
									local12++;
									Static89.anIntArray156[local20] = Static89.anInt1863;
									Static89.anIntArray154[local79] = Static89.anInt1863;
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
		for (@Pc(236) int local236 = 0; local236 < this.anInt1860; local236++) {
			if (Static89.anIntArray156[this.anIntArray155[local236]] == Static89.anInt1863 && Static89.anIntArray156[this.anIntArray162[local236]] == Static89.anInt1863 && Static89.anIntArray156[this.anIntArray163[local236]] == Static89.anInt1863) {
				if (this.aByteArray19 == null) {
					this.aByteArray19 = new byte[this.anInt1860];
				}
				this.aByteArray19[local236] = 2;
			}
		}
		for (local36 = 0; local36 < local2.anInt1860; local36++) {
			if (Static89.anIntArray154[local2.anIntArray155[local36]] == Static89.anInt1863 && Static89.anIntArray154[local2.anIntArray162[local36]] == Static89.anInt1863 && Static89.anIntArray154[local2.anIntArray163[local36]] == Static89.anInt1863) {
				if (local2.aByteArray19 == null) {
					local2.aByteArray19 = new byte[local2.anInt1860];
				}
				local2.aByteArray19[local36] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V")
	private void method1418(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static89.anIntArray165[arg0];
		@Pc(7) int local7 = Static89.anIntArray158[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1862; local9++) {
			@Pc(26) int local26 = this.anIntArray161[local9] * local7 - this.anIntArray157[local9] * local3 >> 16;
			this.anIntArray157[local9] = this.anIntArray161[local9] * local3 + this.anIntArray157[local9] * local7 >> 16;
			this.anIntArray161[local9] = local26;
		}
		this.method1403();
	}

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "()V")
	private void method1419() {
		if (this.aBoolean82) {
			return;
		}
		this.aBoolean82 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt1862; local20++) {
			@Pc(26) int local26 = this.anIntArray164[local20];
			@Pc(31) int local31 = this.anIntArray161[local20];
			@Pc(36) int local36 = this.anIntArray157[local20];
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
		this.aShort17 = (short) local8;
		this.aShort16 = (short) local14;
		this.aShort15 = (short) local10;
		this.aShort11 = (short) local16;
		this.aShort10 = (short) local12;
		this.aShort13 = (short) local18;
	}

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "()V")
	public void method1420() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray159 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt1862; local9++) {
				local15 = this.anIntArray159[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray8 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray8[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt1862) {
				local65 = this.anIntArray159[local59];
				this.anIntArrayArray8[local65][local5[local65]++] = local59++;
			}
			this.anIntArray159 = null;
		}
		if (this.anIntArray160 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt1860; local9++) {
			local15 = this.anIntArray160[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray9 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray9[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt1860) {
			local65 = this.anIntArray160[local59];
			this.anIntArrayArray9[local65][local5[local65]++] = local59++;
		}
		this.anIntArray160 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II[[I[[IIIIZZ)Lclient!ib;")
	public Class20_Sub4 method1422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method1419();
		@Pc(6) int local6 = arg4 + this.aShort17;
		@Pc(11) int local11 = arg4 + this.aShort16;
		@Pc(16) int local16 = arg6 + this.aShort10;
		@Pc(21) int local21 = arg6 + this.aShort13;
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
		@Pc(147) Class20_Sub4 local147 = new Class20_Sub4();
		local147.anInt1862 = this.anInt1862;
		local147.anInt1860 = this.anInt1860;
		local147.anInt1861 = this.anInt1861;
		local147.anIntArray155 = this.anIntArray155;
		local147.anIntArray162 = this.anIntArray162;
		local147.anIntArray163 = this.anIntArray163;
		local147.aByteArray19 = this.aByteArray19;
		local147.aByteArray21 = this.aByteArray21;
		local147.aByteArray18 = this.aByteArray18;
		local147.aByteArray22 = this.aByteArray22;
		local147.aShortArray23 = this.aShortArray23;
		local147.aShortArray18 = this.aShortArray18;
		local147.aByte4 = this.aByte4;
		local147.aByteArray14 = this.aByteArray14;
		local147.aShortArray24 = this.aShortArray24;
		local147.aShortArray22 = this.aShortArray22;
		local147.aShortArray25 = this.aShortArray25;
		local147.aShortArray21 = this.aShortArray21;
		local147.aShortArray20 = this.aShortArray20;
		local147.aShortArray19 = this.aShortArray19;
		local147.aByteArray17 = this.aByteArray17;
		local147.aByteArray15 = this.aByteArray15;
		local147.aByteArray20 = this.aByteArray20;
		local147.aByteArray16 = this.aByteArray16;
		local147.aByteArray13 = this.aByteArray13;
		local147.anIntArray159 = this.anIntArray159;
		local147.anIntArray160 = this.anIntArray160;
		local147.anIntArrayArray8 = this.anIntArrayArray8;
		local147.anIntArrayArray9 = this.anIntArrayArray9;
		local147.aShort12 = this.aShort12;
		local147.aShort14 = this.aShort14;
		local147.aClass85Array2 = this.aClass85Array2;
		local147.aClass114Array1 = this.aClass114Array1;
		local147.aClass85Array1 = this.aClass85Array1;
		if (arg0 == 3) {
			local147.anIntArray164 = Static183.method3007(this.anIntArray164);
			local147.anIntArray161 = Static183.method3007(this.anIntArray161);
			local147.anIntArray157 = Static183.method3007(this.anIntArray157);
		} else {
			local147.anIntArray164 = this.anIntArray164;
			local147.anIntArray161 = new int[local147.anInt1862];
			local147.anIntArray157 = this.anIntArray157;
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
			for (local326 = 0; local326 < local147.anInt1862; local326++) {
				local334 = this.anIntArray164[local326] + arg4;
				local341 = this.anIntArray157[local326] + arg6;
				local345 = local334 & 0x7F;
				local349 = local341 & 0x7F;
				local353 = local334 >> 7;
				local357 = local341 >> 7;
				local379 = arg2[local353][local357] * (128 - local345) + arg2[local353 + 1][local357] * local345 >> 7;
				local405 = arg2[local353][local357 + 1] * (128 - local345) + arg2[local353 + 1][local357 + 1] * local345 >> 7;
				local417 = local379 * (128 - local349) + local405 * local349 >> 7;
				local147.anIntArray161[local326] = this.anIntArray161[local326] + local417 - arg5;
			}
		} else {
			@Pc(544) int local544;
			if (arg0 == 2) {
				for (local326 = 0; local326 < local147.anInt1862; local326++) {
					local334 = (this.anIntArray161[local326] << 16) / this.aShort15;
					if (local334 < arg1) {
						local341 = this.anIntArray164[local326] + arg4;
						local345 = this.anIntArray157[local326] + arg6;
						local349 = local341 & 0x7F;
						local353 = local345 & 0x7F;
						local357 = local341 >> 7;
						local379 = local345 >> 7;
						local405 = arg2[local357][local379] * (128 - local349) + arg2[local357 + 1][local379] * local349 >> 7;
						local417 = arg2[local357][local379 + 1] * (128 - local349) + arg2[local357 + 1][local379 + 1] * local349 >> 7;
						local544 = local405 * (128 - local353) + local417 * local353 >> 7;
						local147.anIntArray161[local326] = this.anIntArray161[local326] + (local544 - arg5) * (arg1 - local334) / arg1;
					} else {
						local147.anIntArray161[local326] = this.anIntArray161[local326];
					}
				}
			} else if (arg0 == 3) {
				local326 = (arg1 & 0xFF) * 4;
				local334 = (arg1 >> 8 & 0xFF) * 4;
				this.method1410(arg2, arg4, arg5, arg6, local326, local334);
			} else if (arg0 == 4) {
				local326 = this.aShort11 - this.aShort15;
				for (local334 = 0; local334 < this.anInt1862; local334++) {
					local341 = this.anIntArray164[local334] + arg4;
					local345 = this.anIntArray157[local334] + arg6;
					local349 = local341 & 0x7F;
					local353 = local345 & 0x7F;
					local357 = local341 >> 7;
					local379 = local345 >> 7;
					local405 = arg3[local357][local379] * (128 - local349) + arg3[local357 + 1][local379] * local349 >> 7;
					local417 = arg3[local357][local379 + 1] * (128 - local349) + arg3[local357 + 1][local379 + 1] * local349 >> 7;
					local544 = local405 * (128 - local353) + local417 * local353 >> 7;
					local147.anIntArray161[local334] = this.anIntArray161[local334] + local544 + local326 - arg5;
				}
			} else if (arg0 == 5) {
				local326 = this.aShort11 - this.aShort15;
				for (local334 = 0; local334 < this.anInt1862; local334++) {
					local341 = this.anIntArray164[local334] + arg4;
					local345 = this.anIntArray157[local334] + arg6;
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
					local147.anIntArray161[local334] = ((this.anIntArray161[local334] << 8) / local326 * local891 >> 8) - (arg5 - local544);
				}
			}
		}
		this.aBoolean82 = false;
		return local147;
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(III)V")
	public void method1424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5;
		@Pc(9) int local9;
		@Pc(11) int local11;
		@Pc(28) int local28;
		if (arg2 != 0) {
			local5 = Static89.anIntArray165[arg2];
			local9 = Static89.anIntArray158[arg2];
			for (local11 = 0; local11 < this.anInt1862; local11++) {
				local28 = this.anIntArray161[local11] * local5 + this.anIntArray164[local11] * local9 >> 16;
				this.anIntArray161[local11] = this.anIntArray161[local11] * local9 - this.anIntArray164[local11] * local5 >> 16;
				this.anIntArray164[local11] = local28;
			}
		}
		if (arg0 != 0) {
			local5 = Static89.anIntArray165[arg0];
			local9 = Static89.anIntArray158[arg0];
			for (local11 = 0; local11 < this.anInt1862; local11++) {
				local28 = this.anIntArray161[local11] * local9 - this.anIntArray157[local11] * local5 >> 16;
				this.anIntArray157[local11] = this.anIntArray161[local11] * local5 + this.anIntArray157[local11] * local9 >> 16;
				this.anIntArray161[local11] = local28;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local5 = Static89.anIntArray165[arg1];
		local9 = Static89.anIntArray158[arg1];
		for (local11 = 0; local11 < this.anInt1862; local11++) {
			local28 = this.anIntArray157[local11] * local5 + this.anIntArray164[local11] * local9 >> 16;
			this.anIntArray157[local11] = this.anIntArray157[local11] * local9 - this.anIntArray164[local11] * local5 >> 16;
			this.anIntArray164[local11] = local28;
		}
	}

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "(III)V")
	public void method1425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1862; local1++) {
			this.anIntArray164[local1] += arg0;
			this.anIntArray161[local1] += arg1;
			this.anIntArray157[local1] += arg2;
		}
		this.method1403();
	}
}
