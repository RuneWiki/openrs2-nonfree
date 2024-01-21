import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class4_Sub4_Sub3_Sub5 extends Class4_Sub4_Sub3 {

	@OriginalMember(owner = "client!sd", name = "Y", descriptor = "[Lclient!le;")
	public Class44[] aClass44Array1;

	@OriginalMember(owner = "client!sd", name = "ab", descriptor = "[I")
	public int[] anIntArray331;

	@OriginalMember(owner = "client!sd", name = "bb", descriptor = "[I")
	public int[] anIntArray332;

	@OriginalMember(owner = "client!sd", name = "cb", descriptor = "[I")
	public int[] anIntArray333;

	@OriginalMember(owner = "client!sd", name = "db", descriptor = "I")
	private int anInt2385;

	@OriginalMember(owner = "client!sd", name = "fb", descriptor = "[B")
	private byte[] aByteArray52;

	@OriginalMember(owner = "client!sd", name = "gb", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!sd", name = "hb", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!sd", name = "ib", descriptor = "[B")
	public byte[] aByteArray53;

	@OriginalMember(owner = "client!sd", name = "jb", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!sd", name = "kb", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!sd", name = "lb", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!sd", name = "nb", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!sd", name = "ob", descriptor = "[Lclient!le;")
	public Class44[] aClass44Array2;

	@OriginalMember(owner = "client!sd", name = "pb", descriptor = "I")
	public int anInt2387;

	@OriginalMember(owner = "client!sd", name = "qb", descriptor = "I")
	public int anInt2388;

	@OriginalMember(owner = "client!sd", name = "rb", descriptor = "[I")
	public int[] anIntArray335;

	@OriginalMember(owner = "client!sd", name = "sb", descriptor = "[B")
	private byte[] aByteArray54;

	@OriginalMember(owner = "client!sd", name = "tb", descriptor = "[I")
	private int[] anIntArray336;

	@OriginalMember(owner = "client!sd", name = "ub", descriptor = "I")
	public int anInt2389;

	@OriginalMember(owner = "client!sd", name = "vb", descriptor = "[I")
	public int[] anIntArray337;

	@OriginalMember(owner = "client!sd", name = "wb", descriptor = "[S")
	private short[] aShortArray30;

	@OriginalMember(owner = "client!sd", name = "xb", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!sd", name = "yb", descriptor = "[I")
	private int[] anIntArray338;

	@OriginalMember(owner = "client!sd", name = "zb", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!sd", name = "Cb", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!sd", name = "Db", descriptor = "[B")
	private byte[] aByteArray55;

	@OriginalMember(owner = "client!sd", name = "Eb", descriptor = "S")
	public short aShort1;

	@OriginalMember(owner = "client!sd", name = "Fb", descriptor = "[I")
	public int[] anIntArray340;

	@OriginalMember(owner = "client!sd", name = "Hb", descriptor = "I")
	public int anInt2391;

	@OriginalMember(owner = "client!sd", name = "Ib", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!sd", name = "Jb", descriptor = "[B")
	private byte[] aByteArray56;

	@OriginalMember(owner = "client!sd", name = "Mb", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!sd", name = "Nb", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!sd", name = "Ob", descriptor = "[S")
	private short[] aShortArray35;

	@OriginalMember(owner = "client!sd", name = "Qb", descriptor = "[Lclient!tc;")
	private Class69[] aClass69Array1;

	@OriginalMember(owner = "client!sd", name = "Rb", descriptor = "[B")
	private byte[] aByteArray57;

	@OriginalMember(owner = "client!sd", name = "Sb", descriptor = "I")
	public int anInt2393;

	@OriginalMember(owner = "client!sd", name = "eb", descriptor = "I")
	public int anInt2386 = 0;

	@OriginalMember(owner = "client!sd", name = "Bb", descriptor = "I")
	public int anInt2390 = 0;

	@OriginalMember(owner = "client!sd", name = "Gb", descriptor = "B")
	private byte aByte5 = 0;

	@OriginalMember(owner = "client!sd", name = "Pb", descriptor = "Z")
	private boolean aBoolean141 = false;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
	private Class4_Sub4_Sub3_Sub5() {
	}

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "([B)V")
	public Class4_Sub4_Sub3_Sub5(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1661(arg0);
		} else {
			this.method1650(arg0);
		}
	}

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "([Lclient!sd;I)V")
	public Class4_Sub4_Sub3_Sub5(@OriginalArg(0) Class4_Sub4_Sub3_Sub5[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt2386 = 0;
		this.anInt2390 = 0;
		this.anInt2385 = 0;
		this.aByte5 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class4_Sub4_Sub3_Sub5 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt2386 += local44.anInt2386;
				this.anInt2390 += local44.anInt2390;
				this.anInt2385 += local44.anInt2385;
				if (local44.aByteArray52 == null) {
					if (this.aByte5 == -1) {
						this.aByte5 = local44.aByte5;
					}
					if (this.aByte5 != local44.aByte5) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray53 != null;
				local19 |= local44.aByteArray55 != null;
				local21 |= local44.anIntArray338 != null;
				local23 |= local44.aShortArray27 != null;
				local25 |= local44.aByteArray57 != null;
			}
		}
		this.anIntArray333 = new int[this.anInt2386];
		this.anIntArray340 = new int[this.anInt2386];
		this.anIntArray337 = new int[this.anInt2386];
		this.anIntArray336 = new int[this.anInt2386];
		this.anIntArray331 = new int[this.anInt2390];
		this.anIntArray332 = new int[this.anInt2390];
		this.anIntArray335 = new int[this.anInt2390];
		if (local15) {
			this.aByteArray53 = new byte[this.anInt2390];
		}
		if (local17) {
			this.aByteArray52 = new byte[this.anInt2390];
		}
		if (local19) {
			this.aByteArray55 = new byte[this.anInt2390];
		}
		if (local21) {
			this.anIntArray338 = new int[this.anInt2390];
		}
		if (local23) {
			this.aShortArray27 = new short[this.anInt2390];
		}
		if (local25) {
			this.aByteArray57 = new byte[this.anInt2390];
		}
		this.aShortArray30 = new short[this.anInt2390];
		if (this.anInt2385 > 0) {
			this.aByteArray56 = new byte[this.anInt2385];
			this.aShortArray29 = new short[this.anInt2385];
			this.aShortArray25 = new short[this.anInt2385];
			this.aShortArray28 = new short[this.anInt2385];
			this.aShortArray34 = new short[this.anInt2385];
			this.aShortArray33 = new short[this.anInt2385];
			this.aShortArray35 = new short[this.anInt2385];
			this.aShortArray31 = new short[this.anInt2385];
			this.aByteArray54 = new byte[this.anInt2385];
			this.aShortArray26 = new short[this.anInt2385];
			this.aShortArray32 = new short[this.anInt2385];
		}
		this.anInt2386 = 0;
		this.anInt2390 = 0;
		this.anInt2385 = 0;
		for (@Pc(288) int local288 = 0; local288 < arg1; local288++) {
			@Pc(293) Class4_Sub4_Sub3_Sub5 local293 = arg0[local288];
			if (local293 != null) {
				for (@Pc(297) int local297 = 0; local297 < local293.anInt2390; local297++) {
					if (local15 && local293.aByteArray53 != null) {
						this.aByteArray53[this.anInt2390] = local293.aByteArray53[local297];
					}
					if (local17) {
						if (local293.aByteArray52 == null) {
							this.aByteArray52[this.anInt2390] = local293.aByte5;
						} else {
							this.aByteArray52[this.anInt2390] = local293.aByteArray52[local297];
						}
					}
					if (local19 && local293.aByteArray55 != null) {
						this.aByteArray55[this.anInt2390] = local293.aByteArray55[local297];
					}
					if (local21 && local293.anIntArray338 != null) {
						this.anIntArray338[this.anInt2390] = local293.anIntArray338[local297];
					}
					if (local23) {
						if (local293.aShortArray27 == null) {
							this.aShortArray27[this.anInt2390] = -1;
						} else {
							this.aShortArray27[this.anInt2390] = local293.aShortArray27[local297];
						}
					}
					if (local25) {
						if (local293.aByteArray57 == null || local293.aByteArray57[local297] == -1) {
							this.aByteArray57[this.anInt2390] = -1;
						} else {
							this.aByteArray57[this.anInt2390] = (byte) (local293.aByteArray57[local297] + this.anInt2385);
						}
					}
					this.aShortArray30[this.anInt2390] = local293.aShortArray30[local297];
					this.anIntArray331[this.anInt2390] = this.method1662(local293, local293.anIntArray331[local297]);
					this.anIntArray332[this.anInt2390] = this.method1662(local293, local293.anIntArray332[local297]);
					this.anIntArray335[this.anInt2390] = this.method1662(local293, local293.anIntArray335[local297]);
					this.anInt2390++;
				}
				for (@Pc(472) int local472 = 0; local472 < local293.anInt2385; local472++) {
					@Pc(484) byte local484 = this.aByteArray56[this.anInt2385] = local293.aByteArray56[local472];
					if (local484 == 0) {
						this.aShortArray29[this.anInt2385] = (short) this.method1662(local293, local293.aShortArray29[local472]);
						this.aShortArray25[this.anInt2385] = (short) this.method1662(local293, local293.aShortArray25[local472]);
						this.aShortArray28[this.anInt2385] = (short) this.method1662(local293, local293.aShortArray28[local472]);
					}
					if (local484 >= 1 && local484 <= 3) {
						this.aShortArray29[this.anInt2385] = local293.aShortArray29[local472];
						this.aShortArray25[this.anInt2385] = local293.aShortArray25[local472];
						this.aShortArray28[this.anInt2385] = local293.aShortArray28[local472];
						this.aShortArray34[this.anInt2385] = local293.aShortArray34[local472];
						this.aShortArray33[this.anInt2385] = local293.aShortArray33[local472];
						this.aShortArray35[this.anInt2385] = local293.aShortArray35[local472];
						this.aShortArray31[this.anInt2385] = local293.aShortArray31[local472];
						this.aByteArray54[this.anInt2385] = local293.aByteArray54[local472];
						this.aShortArray26[this.anInt2385] = local293.aShortArray26[local472];
					}
					if (local484 == 2) {
						this.aShortArray32[this.anInt2385] = local293.aShortArray32[local472];
					}
					this.anInt2385++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!sd;ZZZZ)V")
	public Class4_Sub4_Sub3_Sub5(@OriginalArg(0) Class4_Sub4_Sub3_Sub5 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2386 = arg0.anInt2386;
		this.anInt2390 = arg0.anInt2390;
		this.anInt2385 = arg0.anInt2385;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray333 = arg0.anIntArray333;
			this.anIntArray340 = arg0.anIntArray340;
			this.anIntArray337 = arg0.anIntArray337;
		} else {
			this.anIntArray333 = new int[this.anInt2386];
			this.anIntArray340 = new int[this.anInt2386];
			this.anIntArray337 = new int[this.anInt2386];
			for (local57 = 0; local57 < this.anInt2386; local57++) {
				this.anIntArray333[local57] = arg0.anIntArray333[local57];
				this.anIntArray340[local57] = arg0.anIntArray340[local57];
				this.anIntArray337[local57] = arg0.anIntArray337[local57];
			}
		}
		if (arg2) {
			this.aShortArray30 = arg0.aShortArray30;
		} else {
			this.aShortArray30 = new short[this.anInt2390];
			for (local57 = 0; local57 < this.anInt2390; local57++) {
				this.aShortArray30[local57] = arg0.aShortArray30[local57];
			}
		}
		if (arg3 || arg0.aShortArray27 == null) {
			this.aShortArray27 = arg0.aShortArray27;
		} else {
			this.aShortArray27 = new short[this.anInt2390];
			for (local57 = 0; local57 < this.anInt2390; local57++) {
				this.aShortArray27[local57] = arg0.aShortArray27[local57];
			}
		}
		this.aByteArray55 = arg0.aByteArray55;
		this.anIntArray331 = arg0.anIntArray331;
		this.anIntArray332 = arg0.anIntArray332;
		this.anIntArray335 = arg0.anIntArray335;
		this.aByteArray53 = arg0.aByteArray53;
		this.aByteArray52 = arg0.aByteArray52;
		this.aByteArray57 = arg0.aByteArray57;
		this.aByte5 = arg0.aByte5;
		this.aByteArray56 = arg0.aByteArray56;
		this.aShortArray29 = arg0.aShortArray29;
		this.aShortArray25 = arg0.aShortArray25;
		this.aShortArray28 = arg0.aShortArray28;
		this.aShortArray34 = arg0.aShortArray34;
		this.aShortArray33 = arg0.aShortArray33;
		this.aShortArray35 = arg0.aShortArray35;
		this.aShortArray31 = arg0.aShortArray31;
		this.aByteArray54 = arg0.aByteArray54;
		this.aShortArray26 = arg0.aShortArray26;
		this.aShortArray32 = arg0.aShortArray32;
		this.anIntArray336 = arg0.anIntArray336;
		this.anIntArray338 = arg0.anIntArray338;
		this.anIntArrayArray19 = arg0.anIntArrayArray19;
		this.anIntArrayArray20 = arg0.anIntArrayArray20;
		this.aClass44Array1 = arg0.aClass44Array1;
		this.aClass69Array1 = arg0.aClass69Array1;
		this.aClass44Array2 = arg0.aClass44Array2;
		this.aShort1 = arg0.aShort1;
		this.aShort2 = arg0.aShort2;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "()V")
	public void method1641() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2386; local1++) {
			this.anIntArray337[local1] = -this.anIntArray337[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt2390; local18++) {
			@Pc(24) int local24 = this.anIntArray331[local18];
			this.anIntArray331[local18] = this.anIntArray335[local18];
			this.anIntArray335[local18] = local24;
		}
		this.method1647();
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "()V")
	public void method1642() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2386; local1++) {
			@Pc(7) int local7 = this.anIntArray333[local1];
			this.anIntArray333[local1] = this.anIntArray337[local1];
			this.anIntArray337[local1] = -local7;
		}
		this.method1647();
	}

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)V")
	public void method1643() {
		@Pc(3) int local3 = Static108.anIntArray341[256];
		@Pc(7) int local7 = Static108.anIntArray330[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2386; local9++) {
			@Pc(26) int local26 = this.anIntArray337[local9] * local3 + this.anIntArray333[local9] * local7 >> 16;
			this.anIntArray337[local9] = this.anIntArray337[local9] * local7 - this.anIntArray333[local9] * local3 >> 16;
			this.anIntArray333[local9] = local26;
		}
		this.method1647();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V")
	public void method1645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2386; local1++) {
			this.anIntArray333[local1] += arg0;
			this.anIntArray340[local1] += arg1;
			this.anIntArray337[local1] += arg2;
		}
		this.method1647();
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(III)V")
	public void method1646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2386; local1++) {
			this.anIntArray333[local1] = this.anIntArray333[local1] * arg0 / 128;
			this.anIntArray340[local1] = this.anIntArray340[local1] * arg1 / 128;
			this.anIntArray337[local1] = this.anIntArray337[local1] * arg2 / 128;
		}
		this.method1647();
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "()V")
	private void method1647() {
		this.aClass44Array1 = null;
		this.aClass44Array2 = null;
		this.aClass69Array1 = null;
		this.aBoolean141 = false;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([B)V")
	private void method1650(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class4_Sub10 local8 = new Class4_Sub10(arg0);
		@Pc(13) Class4_Sub10 local13 = new Class4_Sub10(arg0);
		@Pc(18) Class4_Sub10 local18 = new Class4_Sub10(arg0);
		@Pc(23) Class4_Sub10 local23 = new Class4_Sub10(arg0);
		@Pc(28) Class4_Sub10 local28 = new Class4_Sub10(arg0);
		local8.anInt931 = arg0.length - 18;
		@Pc(38) int local38 = local8.method604();
		@Pc(42) int local42 = local8.method604();
		@Pc(46) int local46 = local8.method599();
		@Pc(50) int local50 = local8.method599();
		@Pc(54) int local54 = local8.method599();
		@Pc(58) int local58 = local8.method599();
		@Pc(62) int local62 = local8.method599();
		@Pc(66) int local66 = local8.method599();
		@Pc(70) int local70 = local8.method604();
		@Pc(74) int local74 = local8.method604();
		@Pc(78) int local78 = local8.method604();
		@Pc(82) int local82 = local8.method604();
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
		this.anInt2386 = local38;
		this.anInt2390 = local42;
		this.anInt2385 = local46;
		this.anIntArray333 = new int[local38];
		this.anIntArray340 = new int[local38];
		this.anIntArray337 = new int[local38];
		this.anIntArray331 = new int[local42];
		this.anIntArray332 = new int[local42];
		this.anIntArray335 = new int[local42];
		if (local46 > 0) {
			this.aByteArray56 = new byte[local46];
			this.aShortArray29 = new short[local46];
			this.aShortArray25 = new short[local46];
			this.aShortArray28 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray336 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray53 = new byte[local42];
			this.aByteArray57 = new byte[local42];
			this.aShortArray27 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray52 = new byte[local42];
		} else {
			this.aByte5 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray55 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray338 = new int[local42];
		}
		this.aShortArray30 = new short[local42];
		local8.anInt931 = 0;
		local13.anInt931 = local165;
		local18.anInt931 = local171;
		local23.anInt931 = local90;
		local28.anInt931 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method599();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method580();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method580();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method580();
			}
			this.anIntArray333[local307] = local301 + local314;
			this.anIntArray340[local307] = local303 + local324;
			this.anIntArray337[local307] = local305 + local334;
			local301 = this.anIntArray333[local307];
			local303 = this.anIntArray340[local307];
			local305 = this.anIntArray337[local307];
			if (local66 == 1) {
				this.anIntArray336[local307] = local28.method599();
			}
		}
		local8.anInt931 = local149;
		local13.anInt931 = local116;
		local18.anInt931 = local98;
		local23.anInt931 = local134;
		local28.anInt931 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray30[local312] = (short) local8.method604();
			if (local50 == 1) {
				local314 = local13.method599();
				if ((local314 & 0x1) == 1) {
					this.aByteArray53[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray53[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray57[local312] = (byte) (local314 >> 2);
					this.aShortArray27[local312] = this.aShortArray30[local312];
					this.aShortArray30[local312] = 127;
					if (this.aShortArray27[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray57[local312] = -1;
					this.aShortArray27[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray52[local312] = local18.method579();
			}
			if (local58 == 1) {
				this.aByteArray55[local312] = local23.method579();
			}
			if (local62 == 1) {
				this.anIntArray338[local312] = local28.method599();
			}
		}
		local8.anInt931 = local143;
		local13.anInt931 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method599();
			if (local543 == 1) {
				local314 = local8.method580() + local536;
				local324 = local8.method580() + local314;
				local334 = local8.method580() + local324;
				local536 = local334;
				this.anIntArray331[local538] = local314;
				this.anIntArray332[local538] = local324;
				this.anIntArray335[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method580() + local536;
				local536 = local334;
				this.anIntArray331[local538] = local314;
				this.anIntArray332[local538] = local324;
				this.anIntArray335[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method580() + local536;
				local536 = local334;
				this.anIntArray331[local538] = local314;
				this.anIntArray332[local538] = local324;
				this.anIntArray335[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method580() + local536;
				local536 = local334;
				this.anIntArray331[local538] = local314;
				this.anIntArray332[local538] = local646;
				this.anIntArray335[local538] = local334;
			}
		}
		local8.anInt931 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray56[local543] = 0;
			this.aShortArray29[local543] = (short) local8.method604();
			this.aShortArray25[local543] = (short) local8.method604();
			this.aShortArray28[local543] = (short) local8.method604();
		}
		if (this.aByteArray57 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray57[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray29[local731] & 0xFFFF) == this.anIntArray331[local723] && (this.aShortArray25[local731] & 0xFFFF) == this.anIntArray332[local723] && (this.aShortArray28[local731] & 0xFFFF) == this.anIntArray335[local723]) {
						this.aByteArray57[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray57 = null;
			}
		}
		if (!local3) {
			this.aShortArray27 = null;
		}
		if (!local1) {
			this.aByteArray53 = null;
		}
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "()V")
	public void method1651() {
		if (this.aBoolean141) {
			return;
		}
		super.anInt2514 = 0;
		this.anInt2389 = 0;
		this.anInt2391 = 999999;
		this.anInt2393 = -999999;
		this.anInt2387 = -99999;
		this.anInt2388 = 99999;
		for (@Pc(23) int local23 = 0; local23 < this.anInt2386; local23++) {
			@Pc(29) int local29 = this.anIntArray333[local23];
			@Pc(34) int local34 = this.anIntArray340[local23];
			@Pc(39) int local39 = this.anIntArray337[local23];
			if (local29 < this.anInt2391) {
				this.anInt2391 = local29;
			}
			if (local29 > this.anInt2393) {
				this.anInt2393 = local29;
			}
			if (local39 < this.anInt2388) {
				this.anInt2388 = local39;
			}
			if (local39 > this.anInt2387) {
				this.anInt2387 = local39;
			}
			if (-local34 > super.anInt2514) {
				super.anInt2514 = -local34;
			}
			if (local34 > this.anInt2389) {
				this.anInt2389 = local34;
			}
		}
		this.aBoolean141 = true;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIII)Lclient!u;")
	public Class4_Sub4_Sub3_Sub7 method1652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1658();
		@Pc(16) int local16 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(22) int local22 = arg1 * local16 >> 8;
		@Pc(26) Class4_Sub4_Sub3_Sub7 local26 = new Class4_Sub4_Sub3_Sub7();
		local26.anIntArray363 = new int[this.anInt2390];
		local26.anIntArray360 = new int[this.anInt2390];
		local26.anIntArray352 = new int[this.anInt2390];
		@Pc(184) int local184;
		if (this.anInt2385 > 0 && this.aByteArray57 != null) {
			@Pc(51) int[] local51 = new int[this.anInt2385];
			for (@Pc(53) int local53 = 0; local53 < this.anInt2390; local53++) {
				if (this.aByteArray57[local53] != -1) {
					local51[this.aByteArray57[local53] & 0xFF]++;
				}
			}
			local26.anInt2523 = 0;
			for (@Pc(82) int local82 = 0; local82 < this.anInt2385; local82++) {
				if (local51[local82] > 0 && this.aByteArray56[local82] == 0) {
					local26.anInt2523++;
				}
			}
			local26.anIntArray353 = new int[local26.anInt2523];
			local26.anIntArray357 = new int[local26.anInt2523];
			local26.anIntArray354 = new int[local26.anInt2523];
			@Pc(120) int local120 = 0;
			for (@Pc(122) int local122 = 0; local122 < this.anInt2385; local122++) {
				if (local51[local122] > 0 && this.aByteArray56[local122] == 0) {
					local26.anIntArray353[local120] = this.aShortArray29[local122] & 0xFFFF;
					local26.anIntArray357[local120] = this.aShortArray25[local122] & 0xFFFF;
					local26.anIntArray354[local120] = this.aShortArray28[local122] & 0xFFFF;
					local51[local122] = local120++;
				} else {
					local51[local122] = -1;
				}
			}
			local26.aByteArray63 = new byte[this.anInt2390];
			for (local184 = 0; local184 < this.anInt2390; local184++) {
				if (this.aByteArray57[local184] == -1) {
					local26.aByteArray63[local184] = -1;
				} else {
					local26.aByteArray63[local184] = (byte) local51[this.aByteArray57[local184] & 0xFF];
				}
			}
		}
		for (@Pc(217) int local217 = 0; local217 < this.anInt2390; local217++) {
			@Pc(223) byte local223;
			if (this.aByteArray53 == null) {
				local223 = 0;
			} else {
				local223 = this.aByteArray53[local217];
			}
			@Pc(234) byte local234;
			if (this.aByteArray55 == null) {
				local234 = 0;
			} else {
				local234 = this.aByteArray55[local217];
			}
			@Pc(245) short local245;
			if (this.aShortArray27 == null) {
				local245 = -1;
			} else {
				local245 = this.aShortArray27[local217];
			}
			if (local234 == -2) {
				local223 = 3;
			}
			if (local234 == -1) {
				local223 = 2;
			}
			@Pc(292) Class44 local292;
			@Pc(453) Class69 local453;
			if (local245 == -1) {
				if (local223 == 0) {
					@Pc(273) int local273 = this.aShortArray30[local217] & 0xFFFF;
					if (this.aClass44Array2 == null || this.aClass44Array2[this.anIntArray331[local217]] == null) {
						local292 = this.aClass44Array1[this.anIntArray331[local217]];
					} else {
						local292 = this.aClass44Array2[this.anIntArray331[local217]];
					}
					local184 = arg0 + (arg2 * local292.anInt1731 + arg3 * local292.anInt1723 + arg4 * local292.anInt1724) / (local22 * local292.anInt1725);
					local26.anIntArray363[local217] = Static108.method1649(local273, local184);
					if (this.aClass44Array2 == null || this.aClass44Array2[this.anIntArray332[local217]] == null) {
						local292 = this.aClass44Array1[this.anIntArray332[local217]];
					} else {
						local292 = this.aClass44Array2[this.anIntArray332[local217]];
					}
					local184 = arg0 + (arg2 * local292.anInt1731 + arg3 * local292.anInt1723 + arg4 * local292.anInt1724) / (local22 * local292.anInt1725);
					local26.anIntArray360[local217] = Static108.method1649(local273, local184);
					if (this.aClass44Array2 == null || this.aClass44Array2[this.anIntArray335[local217]] == null) {
						local292 = this.aClass44Array1[this.anIntArray335[local217]];
					} else {
						local292 = this.aClass44Array2[this.anIntArray335[local217]];
					}
					local184 = arg0 + (arg2 * local292.anInt1731 + arg3 * local292.anInt1723 + arg4 * local292.anInt1724) / (local22 * local292.anInt1725);
					local26.anIntArray352[local217] = Static108.method1649(local273, local184);
				} else if (local223 == 1) {
					local453 = this.aClass69Array1[local217];
					local184 = arg0 + (arg2 * local453.anInt2449 + arg3 * local453.anInt2448 + arg4 * local453.anInt2447) / (local22 + local22 / 2);
					local26.anIntArray363[local217] = Static108.method1649(this.aShortArray30[local217] & 0xFFFF, local184);
					local26.anIntArray352[local217] = -1;
				} else if (local223 == 3) {
					local26.anIntArray363[local217] = 128;
					local26.anIntArray352[local217] = -1;
				} else {
					local26.anIntArray352[local217] = -2;
				}
			} else if (local223 == 0) {
				if (this.aClass44Array2 == null || this.aClass44Array2[this.anIntArray331[local217]] == null) {
					local292 = this.aClass44Array1[this.anIntArray331[local217]];
				} else {
					local292 = this.aClass44Array2[this.anIntArray331[local217]];
				}
				local184 = arg0 + (arg2 * local292.anInt1731 + arg3 * local292.anInt1723 + arg4 * local292.anInt1724) / (local22 * local292.anInt1725);
				local26.anIntArray363[local217] = Static108.method1644(local184);
				if (this.aClass44Array2 == null || this.aClass44Array2[this.anIntArray332[local217]] == null) {
					local292 = this.aClass44Array1[this.anIntArray332[local217]];
				} else {
					local292 = this.aClass44Array2[this.anIntArray332[local217]];
				}
				local184 = arg0 + (arg2 * local292.anInt1731 + arg3 * local292.anInt1723 + arg4 * local292.anInt1724) / (local22 * local292.anInt1725);
				local26.anIntArray360[local217] = Static108.method1644(local184);
				if (this.aClass44Array2 == null || this.aClass44Array2[this.anIntArray335[local217]] == null) {
					local292 = this.aClass44Array1[this.anIntArray335[local217]];
				} else {
					local292 = this.aClass44Array2[this.anIntArray335[local217]];
				}
				local184 = arg0 + (arg2 * local292.anInt1731 + arg3 * local292.anInt1723 + arg4 * local292.anInt1724) / (local22 * local292.anInt1725);
				local26.anIntArray352[local217] = Static108.method1644(local184);
			} else if (local223 == 1) {
				local453 = this.aClass69Array1[local217];
				local184 = arg0 + (arg2 * local453.anInt2449 + arg3 * local453.anInt2448 + arg4 * local453.anInt2447) / (local22 + local22 / 2);
				local26.anIntArray363[local217] = Static108.method1644(local184);
				local26.anIntArray352[local217] = -1;
			} else {
				local26.anIntArray352[local217] = -2;
			}
		}
		this.method1653();
		local26.anInt2522 = this.anInt2386;
		local26.anIntArray359 = this.anIntArray333;
		local26.anIntArray362 = this.anIntArray340;
		local26.anIntArray356 = this.anIntArray337;
		local26.anInt2526 = this.anInt2390;
		local26.anIntArray355 = this.anIntArray331;
		local26.anIntArray361 = this.anIntArray332;
		local26.anIntArray358 = this.anIntArray335;
		local26.aByteArray64 = this.aByteArray52;
		local26.aByteArray62 = this.aByteArray55;
		local26.aByte7 = this.aByte5;
		local26.anIntArrayArray22 = this.anIntArrayArray19;
		local26.anIntArrayArray23 = this.anIntArrayArray20;
		local26.aShortArray38 = this.aShortArray27;
		return local26;
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "()V")
	private void method1653() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray336 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt2386; local9++) {
				local15 = this.anIntArray336[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray19 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray19[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt2386) {
				local65 = this.anIntArray336[local59];
				this.anIntArrayArray19[local65][local5[local65]++] = local59++;
			}
			this.anIntArray336 = null;
		}
		if (this.anIntArray338 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt2390; local9++) {
			local15 = this.anIntArray338[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray20 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray20[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt2390) {
			local65 = this.anIntArray338[local59];
			this.anIntArrayArray20[local65][local5[local65]++] = local59++;
		}
		this.anIntArray338 = null;
	}

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "()V")
	public void method1654() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2386; local1++) {
			this.anIntArray333[local1] = -this.anIntArray333[local1];
			this.anIntArray337[local1] = -this.anIntArray337[local1];
		}
		this.method1647();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(SS)V")
	public void method1655(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray27 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt2390; local5++) {
			if (this.aShortArray27[local5] == arg0) {
				this.aShortArray27[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(SS)V")
	public void method1657(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2390; local1++) {
			if (this.aShortArray30[local1] == arg0) {
				this.aShortArray30[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "()V")
	public void method1658() {
		if (this.aClass44Array1 != null) {
			return;
		}
		this.aClass44Array1 = new Class44[this.anInt2386];
		for (@Pc(10) int local10 = 0; local10 < this.anInt2386; local10++) {
			this.aClass44Array1[local10] = new Class44();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt2390; local25++) {
			@Pc(31) int local31 = this.anIntArray331[local25];
			@Pc(36) int local36 = this.anIntArray332[local25];
			@Pc(41) int local41 = this.anIntArray335[local25];
			@Pc(51) int local51 = this.anIntArray333[local36] - this.anIntArray333[local31];
			@Pc(61) int local61 = this.anIntArray340[local36] - this.anIntArray340[local31];
			@Pc(71) int local71 = this.anIntArray337[local36] - this.anIntArray337[local31];
			@Pc(81) int local81 = this.anIntArray333[local41] - this.anIntArray333[local31];
			@Pc(91) int local91 = this.anIntArray340[local41] - this.anIntArray340[local31];
			@Pc(101) int local101 = this.anIntArray337[local41] - this.anIntArray337[local31];
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
			if (this.aByteArray53 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray53[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class44 local211 = this.aClass44Array1[local31];
				local211.anInt1731 += local109;
				local211.anInt1723 += local117;
				local211.anInt1724 += local125;
				local211.anInt1725++;
				@Pc(240) Class44 local240 = this.aClass44Array1[local36];
				local240.anInt1731 += local109;
				local240.anInt1723 += local117;
				local240.anInt1724 += local125;
				local240.anInt1725++;
				@Pc(269) Class44 local269 = this.aClass44Array1[local41];
				local269.anInt1731 += local109;
				local269.anInt1723 += local117;
				local269.anInt1724 += local125;
				local269.anInt1725++;
			} else if (local198 == 1) {
				if (this.aClass69Array1 == null) {
					this.aClass69Array1 = new Class69[this.anInt2390];
				}
				@Pc(314) Class69 local314 = this.aClass69Array1[local25] = new Class69();
				local314.anInt2449 = local109;
				local314.anInt2448 = local117;
				local314.anInt2447 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "()V")
	public void method1659() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2386; local1++) {
			@Pc(7) int local7 = this.anIntArray337[local1];
			this.anIntArray337[local1] = this.anIntArray333[local1];
			this.anIntArray333[local1] = -local7;
		}
		this.method1647();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([[IIIIZI)Lclient!sd;")
	public Class4_Sub4_Sub3_Sub5 method1660(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method1651();
		@Pc(6) int local6 = arg1 + this.anInt2391;
		@Pc(11) int local11 = arg1 + this.anInt2393;
		@Pc(16) int local16 = arg3 + this.anInt2388;
		@Pc(21) int local21 = arg3 + this.anInt2387;
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
		@Pc(101) Class4_Sub4_Sub3_Sub5 local101 = new Class4_Sub4_Sub3_Sub5();
		local101.anInt2386 = this.anInt2386;
		local101.anInt2390 = this.anInt2390;
		local101.anInt2385 = this.anInt2385;
		local101.anIntArray333 = this.anIntArray333;
		local101.anIntArray337 = this.anIntArray337;
		local101.anIntArray331 = this.anIntArray331;
		local101.anIntArray332 = this.anIntArray332;
		local101.anIntArray335 = this.anIntArray335;
		local101.aByteArray53 = this.aByteArray53;
		local101.aByteArray52 = this.aByteArray52;
		local101.aByteArray55 = this.aByteArray55;
		local101.aByteArray57 = this.aByteArray57;
		local101.aShortArray30 = this.aShortArray30;
		local101.aShortArray27 = this.aShortArray27;
		local101.aByte5 = this.aByte5;
		local101.aByteArray56 = this.aByteArray56;
		local101.aShortArray29 = this.aShortArray29;
		local101.aShortArray25 = this.aShortArray25;
		local101.aShortArray28 = this.aShortArray28;
		local101.aShortArray34 = this.aShortArray34;
		local101.aShortArray33 = this.aShortArray33;
		local101.aShortArray35 = this.aShortArray35;
		local101.aShortArray31 = this.aShortArray31;
		local101.aByteArray54 = this.aByteArray54;
		local101.aShortArray26 = this.aShortArray26;
		local101.aShortArray32 = this.aShortArray32;
		local101.anIntArray336 = this.anIntArray336;
		local101.anIntArray338 = this.anIntArray338;
		local101.anIntArrayArray19 = this.anIntArrayArray19;
		local101.anIntArrayArray20 = this.anIntArrayArray20;
		local101.aShort1 = this.aShort1;
		local101.aShort2 = this.aShort2;
		local101.anIntArray340 = new int[local101.anInt2386];
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
			for (local241 = 0; local241 < local101.anInt2386; local241++) {
				local249 = this.anIntArray333[local241] + arg1;
				local256 = this.anIntArray337[local241] + arg3;
				local260 = local249 & 0x7F;
				local264 = local256 & 0x7F;
				local268 = local249 >> 7;
				local272 = local256 >> 7;
				local294 = arg0[local268][local272] * (128 - local260) + arg0[local268 + 1][local272] * local260 >> 7;
				local320 = arg0[local268][local272 + 1] * (128 - local260) + arg0[local268 + 1][local272 + 1] * local260 >> 7;
				local332 = local294 * (128 - local264) + local320 * local264 >> 7;
				local101.anIntArray340[local241] = this.anIntArray340[local241] + local332 - arg2;
			}
		} else {
			for (local241 = 0; local241 < local101.anInt2386; local241++) {
				local249 = (-this.anIntArray340[local241] << 16) / super.anInt2514;
				if (local249 < arg4) {
					local256 = this.anIntArray333[local241] + arg1;
					local260 = this.anIntArray337[local241] + arg3;
					local264 = local256 & 0x7F;
					local268 = local260 & 0x7F;
					local272 = local256 >> 7;
					local294 = local260 >> 7;
					local320 = arg0[local272][local294] * (128 - local264) + arg0[local272 + 1][local294] * local264 >> 7;
					local332 = arg0[local272][local294 + 1] * (128 - local264) + arg0[local272 + 1][local294 + 1] * local264 >> 7;
					@Pc(457) int local457 = local320 * (128 - local268) + local332 * local268 >> 7;
					local101.anIntArray340[local241] = this.anIntArray340[local241] + (local457 - arg2) * (arg4 - local249) / arg4;
				}
			}
		}
		local101.method1647();
		return local101;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "([B)V")
	private void method1661(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class4_Sub10 local4 = new Class4_Sub10(arg0);
		@Pc(9) Class4_Sub10 local9 = new Class4_Sub10(arg0);
		@Pc(14) Class4_Sub10 local14 = new Class4_Sub10(arg0);
		@Pc(19) Class4_Sub10 local19 = new Class4_Sub10(arg0);
		@Pc(24) Class4_Sub10 local24 = new Class4_Sub10(arg0);
		@Pc(29) Class4_Sub10 local29 = new Class4_Sub10(arg0);
		@Pc(34) Class4_Sub10 local34 = new Class4_Sub10(arg0);
		local4.anInt931 = arg0.length - 23;
		@Pc(44) int local44 = local4.method604();
		@Pc(48) int local48 = local4.method604();
		@Pc(52) int local52 = local4.method599();
		@Pc(56) int local56 = local4.method599();
		@Pc(60) int local60 = local4.method599();
		@Pc(64) int local64 = local4.method599();
		@Pc(68) int local68 = local4.method599();
		@Pc(72) int local72 = local4.method599();
		@Pc(76) int local76 = local4.method599();
		@Pc(80) int local80 = local4.method604();
		@Pc(84) int local84 = local4.method604();
		@Pc(88) int local88 = local4.method604();
		@Pc(92) int local92 = local4.method604();
		@Pc(96) int local96 = local4.method604();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray56 = new byte[local52];
			local4.anInt931 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray56[local113] = local4.method579();
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
		this.anInt2386 = local44;
		this.anInt2390 = local48;
		this.anInt2385 = local52;
		this.anIntArray333 = new int[local44];
		this.anIntArray340 = new int[local44];
		this.anIntArray337 = new int[local44];
		this.anIntArray331 = new int[local48];
		this.anIntArray332 = new int[local48];
		this.anIntArray335 = new int[local48];
		if (local76 == 1) {
			this.anIntArray336 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray53 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray52 = new byte[local48];
		} else {
			this.aByte5 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray55 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray338 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray27 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray57 = new byte[local48];
		}
		this.aShortArray30 = new short[local48];
		if (local52 > 0) {
			this.aShortArray29 = new short[local52];
			this.aShortArray25 = new short[local52];
			this.aShortArray28 = new short[local52];
			if (local100 > 0) {
				this.aShortArray34 = new short[local100];
				this.aShortArray33 = new short[local100];
				this.aShortArray35 = new short[local100];
				this.aShortArray31 = new short[local100];
				this.aByteArray54 = new byte[local100];
				this.aShortArray26 = new short[local100];
			}
			if (local102 > 0) {
				this.aShortArray32 = new short[local102];
			}
		}
		local4.anInt931 = local52;
		local9.anInt931 = local233;
		local14.anInt931 = local239;
		local19.anInt931 = local245;
		local24.anInt931 = local184;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(461) int local461 = 0;
		@Pc(468) int local468;
		@Pc(470) int local470;
		@Pc(480) int local480;
		@Pc(490) int local490;
		for (@Pc(463) int local463 = 0; local463 < local44; local463++) {
			local468 = local4.method599();
			local470 = 0;
			if ((local468 & 0x1) != 0) {
				local470 = local9.method580();
			}
			local480 = 0;
			if ((local468 & 0x2) != 0) {
				local480 = local14.method580();
			}
			local490 = 0;
			if ((local468 & 0x4) != 0) {
				local490 = local19.method580();
			}
			this.anIntArray333[local463] = local457 + local470;
			this.anIntArray340[local463] = local459 + local480;
			this.anIntArray337[local463] = local461 + local490;
			local457 = this.anIntArray333[local463];
			local459 = this.anIntArray340[local463];
			local461 = this.anIntArray337[local463];
			if (local76 == 1) {
				this.anIntArray336[local463] = local24.method599();
			}
		}
		local4.anInt931 = local225;
		local9.anInt931 = local151;
		local14.anInt931 = local166;
		local19.anInt931 = local193;
		local24.anInt931 = local175;
		local29.anInt931 = local208;
		local34.anInt931 = local219;
		for (local468 = 0; local468 < local48; local468++) {
			this.aShortArray30[local468] = (short) local4.method604();
			if (local56 == 1) {
				this.aByteArray53[local468] = local9.method579();
			}
			if (local60 == 255) {
				this.aByteArray52[local468] = local14.method579();
			}
			if (local64 == 1) {
				this.aByteArray55[local468] = local19.method579();
			}
			if (local68 == 1) {
				this.anIntArray338[local468] = local24.method599();
			}
			if (local72 == 1) {
				this.aShortArray27[local468] = (short) (local29.method604() - 1);
			}
			if (this.aByteArray57 != null && this.aShortArray27[local468] != -1) {
				this.aByteArray57[local468] = (byte) (local34.method599() - 1);
			}
		}
		local4.anInt931 = local202;
		local9.anInt931 = local160;
		local470 = 0;
		local480 = 0;
		local490 = 0;
		@Pc(670) int local670 = 0;
		@Pc(677) int local677;
		@Pc(780) int local780;
		for (@Pc(672) int local672 = 0; local672 < local48; local672++) {
			local677 = local9.method599();
			if (local677 == 1) {
				local470 = local4.method580() + local670;
				local480 = local4.method580() + local470;
				local490 = local4.method580() + local480;
				local670 = local490;
				this.anIntArray331[local672] = local470;
				this.anIntArray332[local672] = local480;
				this.anIntArray335[local672] = local490;
			}
			if (local677 == 2) {
				local480 = local490;
				local490 = local4.method580() + local670;
				local670 = local490;
				this.anIntArray331[local672] = local470;
				this.anIntArray332[local672] = local480;
				this.anIntArray335[local672] = local490;
			}
			if (local677 == 3) {
				local470 = local490;
				local490 = local4.method580() + local670;
				local670 = local490;
				this.anIntArray331[local672] = local470;
				this.anIntArray332[local672] = local480;
				this.anIntArray335[local672] = local490;
			}
			if (local677 == 4) {
				local780 = local470;
				local470 = local480;
				local480 = local780;
				local490 = local4.method580() + local670;
				local670 = local490;
				this.anIntArray331[local672] = local470;
				this.anIntArray332[local672] = local780;
				this.anIntArray335[local672] = local490;
			}
		}
		local4.anInt931 = local251;
		local9.anInt931 = local259;
		local14.anInt931 = local267;
		local19.anInt931 = local275;
		local24.anInt931 = local283;
		local29.anInt931 = local289;
		for (local677 = 0; local677 < local52; local677++) {
			local780 = this.aByteArray56[local677] & 0xFF;
			if (local780 == 0) {
				this.aShortArray29[local677] = (short) local4.method604();
				this.aShortArray25[local677] = (short) local4.method604();
				this.aShortArray28[local677] = (short) local4.method604();
			}
			if (local780 == 1) {
				this.aShortArray29[local677] = (short) local9.method604();
				this.aShortArray25[local677] = (short) local9.method604();
				this.aShortArray28[local677] = (short) local9.method604();
				this.aShortArray34[local677] = (short) local14.method604();
				this.aShortArray33[local677] = (short) local14.method604();
				this.aShortArray35[local677] = (short) local14.method604();
				this.aShortArray31[local677] = (short) local19.method604();
				this.aByteArray54[local677] = local24.method579();
				this.aShortArray26[local677] = (short) local29.method604();
			}
			if (local780 == 2) {
				this.aShortArray29[local677] = (short) local9.method604();
				this.aShortArray25[local677] = (short) local9.method604();
				this.aShortArray28[local677] = (short) local9.method604();
				this.aShortArray34[local677] = (short) local14.method604();
				this.aShortArray33[local677] = (short) local14.method604();
				this.aShortArray35[local677] = (short) local14.method604();
				this.aShortArray31[local677] = (short) local19.method604();
				this.aByteArray54[local677] = local24.method579();
				this.aShortArray26[local677] = (short) local29.method604();
				this.aShortArray32[local677] = (short) local29.method604();
			}
			if (local780 == 3) {
				this.aShortArray29[local677] = (short) local9.method604();
				this.aShortArray25[local677] = (short) local9.method604();
				this.aShortArray28[local677] = (short) local9.method604();
				this.aShortArray34[local677] = (short) local14.method604();
				this.aShortArray33[local677] = (short) local14.method604();
				this.aShortArray35[local677] = (short) local14.method604();
				this.aShortArray31[local677] = (short) local19.method604();
				this.aByteArray54[local677] = local24.method579();
				this.aShortArray26[local677] = (short) local29.method604();
			}
		}
		local4.anInt931 = local113;
		local780 = local4.method599();
		if (local780 == 0) {
			return;
		}
		new Class60();
		local4.method604();
		local4.method604();
		local4.method604();
		local4.method549();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!sd;I)I")
	private int method1662(@OriginalArg(0) Class4_Sub4_Sub3_Sub5 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray333[arg1];
		@Pc(11) int local11 = arg0.anIntArray340[arg1];
		@Pc(16) int local16 = arg0.anIntArray337[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2386; local18++) {
			if (local6 == this.anIntArray333[local18] && local11 == this.anIntArray340[local18] && local16 == this.anIntArray337[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray333[this.anInt2386] = local6;
			this.anIntArray340[this.anInt2386] = local11;
			this.anIntArray337[this.anInt2386] = local16;
			if (arg0.anIntArray336 != null) {
				this.anIntArray336[this.anInt2386] = arg0.anIntArray336[arg1];
			}
			local1 = this.anInt2386++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "()Lclient!sd;")
	public Class4_Sub4_Sub3_Sub5 method1663() {
		@Pc(3) Class4_Sub4_Sub3_Sub5 local3 = new Class4_Sub4_Sub3_Sub5();
		if (this.aByteArray53 != null) {
			local3.aByteArray53 = new byte[this.anInt2390];
			for (@Pc(13) int local13 = 0; local13 < this.anInt2390; local13++) {
				local3.aByteArray53[local13] = this.aByteArray53[local13];
			}
		}
		local3.anInt2386 = this.anInt2386;
		local3.anInt2390 = this.anInt2390;
		local3.anInt2385 = this.anInt2385;
		local3.anIntArray333 = this.anIntArray333;
		local3.anIntArray340 = this.anIntArray340;
		local3.anIntArray337 = this.anIntArray337;
		local3.anIntArray331 = this.anIntArray331;
		local3.anIntArray332 = this.anIntArray332;
		local3.anIntArray335 = this.anIntArray335;
		local3.aByteArray52 = this.aByteArray52;
		local3.aByteArray55 = this.aByteArray55;
		local3.aByteArray57 = this.aByteArray57;
		local3.aShortArray30 = this.aShortArray30;
		local3.aShortArray27 = this.aShortArray27;
		local3.aByte5 = this.aByte5;
		local3.aByteArray56 = this.aByteArray56;
		local3.aShortArray29 = this.aShortArray29;
		local3.aShortArray25 = this.aShortArray25;
		local3.aShortArray28 = this.aShortArray28;
		local3.aShortArray34 = this.aShortArray34;
		local3.aShortArray33 = this.aShortArray33;
		local3.aShortArray35 = this.aShortArray35;
		local3.aShortArray31 = this.aShortArray31;
		local3.aByteArray54 = this.aByteArray54;
		local3.aShortArray26 = this.aShortArray26;
		local3.aShortArray32 = this.aShortArray32;
		local3.anIntArray336 = this.anIntArray336;
		local3.anIntArray338 = this.anIntArray338;
		local3.anIntArrayArray19 = this.anIntArrayArray19;
		local3.anIntArrayArray20 = this.anIntArrayArray20;
		local3.aClass44Array1 = this.aClass44Array1;
		local3.aClass69Array1 = this.aClass69Array1;
		local3.aShort1 = this.aShort1;
		local3.aShort2 = this.aShort2;
		return local3;
	}
}
