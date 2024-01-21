import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class7_Sub3 extends Class7 {

	@OriginalMember(owner = "client!gj", name = "s", descriptor = "S")
	private short aShort1;

	@OriginalMember(owner = "client!gj", name = "t", descriptor = "[I")
	public int[] anIntArray111;

	@OriginalMember(owner = "client!gj", name = "v", descriptor = "[B")
	public byte[] aByteArray11;

	@OriginalMember(owner = "client!gj", name = "x", descriptor = "[Lclient!ac;")
	public Class4[] aClass4Array1;

	@OriginalMember(owner = "client!gj", name = "y", descriptor = "[[I")
	public int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!gj", name = "z", descriptor = "S")
	private short aShort2;

	@OriginalMember(owner = "client!gj", name = "A", descriptor = "[[I")
	public int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!gj", name = "C", descriptor = "[I")
	public int[] anIntArray112;

	@OriginalMember(owner = "client!gj", name = "E", descriptor = "S")
	private short aShort3;

	@OriginalMember(owner = "client!gj", name = "F", descriptor = "[B")
	private byte[] aByteArray12;

	@OriginalMember(owner = "client!gj", name = "G", descriptor = "S")
	private short aShort4;

	@OriginalMember(owner = "client!gj", name = "H", descriptor = "[S")
	public short[] aShortArray45;

	@OriginalMember(owner = "client!gj", name = "I", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!gj", name = "K", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!gj", name = "L", descriptor = "[B")
	private byte[] aByteArray15;

	@OriginalMember(owner = "client!gj", name = "M", descriptor = "[I")
	public int[] anIntArray113;

	@OriginalMember(owner = "client!gj", name = "N", descriptor = "S")
	private short aShort5;

	@OriginalMember(owner = "client!gj", name = "O", descriptor = "I")
	public int anInt1451;

	@OriginalMember(owner = "client!gj", name = "R", descriptor = "[B")
	public byte[] aByteArray16;

	@OriginalMember(owner = "client!gj", name = "S", descriptor = "S")
	public short aShort6;

	@OriginalMember(owner = "client!gj", name = "T", descriptor = "[Lclient!ni;")
	public Class69[] aClass69Array1;

	@OriginalMember(owner = "client!gj", name = "U", descriptor = "[I")
	private int[] anIntArray116;

	@OriginalMember(owner = "client!gj", name = "V", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!gj", name = "W", descriptor = "[I")
	private int[] anIntArray117;

	@OriginalMember(owner = "client!gj", name = "X", descriptor = "[Lclient!ni;")
	public Class69[] aClass69Array2;

	@OriginalMember(owner = "client!gj", name = "Y", descriptor = "[I")
	public int[] anIntArray118;

	@OriginalMember(owner = "client!gj", name = "Z", descriptor = "S")
	public short aShort7;

	@OriginalMember(owner = "client!gj", name = "ab", descriptor = "[S")
	public short[] aShortArray46;

	@OriginalMember(owner = "client!gj", name = "cb", descriptor = "[S")
	public short[] aShortArray47;

	@OriginalMember(owner = "client!gj", name = "db", descriptor = "[S")
	public short[] aShortArray48;

	@OriginalMember(owner = "client!gj", name = "eb", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!gj", name = "gb", descriptor = "[S")
	private short[] aShortArray50;

	@OriginalMember(owner = "client!gj", name = "hb", descriptor = "[I")
	public int[] anIntArray121;

	@OriginalMember(owner = "client!gj", name = "ib", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "client!gj", name = "jb", descriptor = "[I")
	public int[] anIntArray122;

	@OriginalMember(owner = "client!gj", name = "kb", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!gj", name = "lb", descriptor = "[B")
	private byte[] aByteArray20;

	@OriginalMember(owner = "client!gj", name = "mb", descriptor = "S")
	private short aShort8;

	@OriginalMember(owner = "client!gj", name = "nb", descriptor = "[S")
	private short[] aShortArray51;

	@OriginalMember(owner = "client!gj", name = "ob", descriptor = "[S")
	public short[] aShortArray52;

	@OriginalMember(owner = "client!gj", name = "u", descriptor = "I")
	public int anInt1448 = 0;

	@OriginalMember(owner = "client!gj", name = "J", descriptor = "B")
	public byte aByte1 = 0;

	@OriginalMember(owner = "client!gj", name = "w", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!gj", name = "B", descriptor = "I")
	public int anInt1449 = 0;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
	private Class7_Sub3() {
	}

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "([B)V")
	public Class7_Sub3(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method983(arg0);
		} else {
			this.method964(arg0);
		}
	}

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "([Lclient!gj;I)V")
	public Class7_Sub3(@OriginalArg(0) Class7_Sub3[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt1448 = 0;
		this.anInt1449 = 0;
		this.anInt1451 = 0;
		this.aByte1 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class7_Sub3 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt1448 += local44.anInt1448;
				this.anInt1449 += local44.anInt1449;
				this.anInt1451 += local44.anInt1451;
				if (local44.aByteArray17 == null) {
					if (this.aByte1 == -1) {
						this.aByte1 = local44.aByte1;
					}
					if (this.aByte1 != local44.aByte1) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray13 != null;
				local19 |= local44.aByteArray18 != null;
				local21 |= local44.anIntArray117 != null;
				local23 |= local44.aShortArray46 != null;
				local25 |= local44.aByteArray11 != null;
			}
		}
		this.anIntArray122 = new int[this.anInt1448];
		this.anIntArray118 = new int[this.anInt1448];
		this.anIntArray121 = new int[this.anInt1448];
		this.anIntArray116 = new int[this.anInt1448];
		this.anIntArray112 = new int[this.anInt1449];
		this.anIntArray113 = new int[this.anInt1449];
		this.anIntArray111 = new int[this.anInt1449];
		if (local15) {
			this.aByteArray13 = new byte[this.anInt1449];
		}
		if (local17) {
			this.aByteArray17 = new byte[this.anInt1449];
		}
		if (local19) {
			this.aByteArray18 = new byte[this.anInt1449];
		}
		if (local21) {
			this.anIntArray117 = new int[this.anInt1449];
		}
		if (local23) {
			this.aShortArray46 = new short[this.anInt1449];
		}
		if (local25) {
			this.aByteArray11 = new byte[this.anInt1449];
		}
		this.aShortArray52 = new short[this.anInt1449];
		if (this.anInt1451 > 0) {
			this.aByteArray16 = new byte[this.anInt1451];
			this.aShortArray48 = new short[this.anInt1451];
			this.aShortArray45 = new short[this.anInt1451];
			this.aShortArray47 = new short[this.anInt1451];
			this.aShortArray50 = new short[this.anInt1451];
			this.aShortArray51 = new short[this.anInt1451];
			this.aShortArray49 = new short[this.anInt1451];
			this.aByteArray20 = new byte[this.anInt1451];
			this.aByteArray14 = new byte[this.anInt1451];
			this.aByteArray12 = new byte[this.anInt1451];
			this.aByteArray19 = new byte[this.anInt1451];
			this.aByteArray15 = new byte[this.anInt1451];
		}
		this.anInt1448 = 0;
		this.anInt1449 = 0;
		this.anInt1451 = 0;
		for (@Pc(293) int local293 = 0; local293 < arg1; local293++) {
			@Pc(298) Class7_Sub3 local298 = arg0[local293];
			if (local298 != null) {
				for (@Pc(302) int local302 = 0; local302 < local298.anInt1449; local302++) {
					if (local15 && local298.aByteArray13 != null) {
						this.aByteArray13[this.anInt1449] = local298.aByteArray13[local302];
					}
					if (local17) {
						if (local298.aByteArray17 == null) {
							this.aByteArray17[this.anInt1449] = local298.aByte1;
						} else {
							this.aByteArray17[this.anInt1449] = local298.aByteArray17[local302];
						}
					}
					if (local19 && local298.aByteArray18 != null) {
						this.aByteArray18[this.anInt1449] = local298.aByteArray18[local302];
					}
					if (local21 && local298.anIntArray117 != null) {
						this.anIntArray117[this.anInt1449] = local298.anIntArray117[local302];
					}
					if (local23) {
						if (local298.aShortArray46 == null) {
							this.aShortArray46[this.anInt1449] = -1;
						} else {
							this.aShortArray46[this.anInt1449] = local298.aShortArray46[local302];
						}
					}
					if (local25) {
						if (local298.aByteArray11 == null || local298.aByteArray11[local302] == -1) {
							this.aByteArray11[this.anInt1449] = -1;
						} else {
							this.aByteArray11[this.anInt1449] = (byte) (local298.aByteArray11[local302] + this.anInt1451);
						}
					}
					this.aShortArray52[this.anInt1449] = local298.aShortArray52[local302];
					this.anIntArray112[this.anInt1449] = this.method972(local298, local298.anIntArray112[local302]);
					this.anIntArray113[this.anInt1449] = this.method972(local298, local298.anIntArray113[local302]);
					this.anIntArray111[this.anInt1449] = this.method972(local298, local298.anIntArray111[local302]);
					this.anInt1449++;
				}
				for (@Pc(477) int local477 = 0; local477 < local298.anInt1451; local477++) {
					@Pc(489) byte local489 = this.aByteArray16[this.anInt1451] = local298.aByteArray16[local477];
					if (local489 == 0) {
						this.aShortArray48[this.anInt1451] = (short) this.method972(local298, local298.aShortArray48[local477]);
						this.aShortArray45[this.anInt1451] = (short) this.method972(local298, local298.aShortArray45[local477]);
						this.aShortArray47[this.anInt1451] = (short) this.method972(local298, local298.aShortArray47[local477]);
					}
					if (local489 >= 1 && local489 <= 3) {
						this.aShortArray48[this.anInt1451] = local298.aShortArray48[local477];
						this.aShortArray45[this.anInt1451] = local298.aShortArray45[local477];
						this.aShortArray47[this.anInt1451] = local298.aShortArray47[local477];
						this.aShortArray50[this.anInt1451] = local298.aShortArray50[local477];
						this.aShortArray51[this.anInt1451] = local298.aShortArray51[local477];
						this.aShortArray49[this.anInt1451] = local298.aShortArray49[local477];
						this.aByteArray20[this.anInt1451] = local298.aByteArray20[local477];
						this.aByteArray14[this.anInt1451] = local298.aByteArray14[local477];
						this.aByteArray12[this.anInt1451] = local298.aByteArray12[local477];
					}
					if (local489 == 2) {
						this.aByteArray19[this.anInt1451] = local298.aByteArray19[local477];
						this.aByteArray15[this.anInt1451] = local298.aByteArray15[local477];
					}
					this.anInt1451++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!gj;ZZZZ)V")
	public Class7_Sub3(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1448 = arg0.anInt1448;
		this.anInt1449 = arg0.anInt1449;
		this.anInt1451 = arg0.anInt1451;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray122 = arg0.anIntArray122;
			this.anIntArray118 = arg0.anIntArray118;
			this.anIntArray121 = arg0.anIntArray121;
		} else {
			this.anIntArray122 = new int[this.anInt1448];
			this.anIntArray118 = new int[this.anInt1448];
			this.anIntArray121 = new int[this.anInt1448];
			for (local57 = 0; local57 < this.anInt1448; local57++) {
				this.anIntArray122[local57] = arg0.anIntArray122[local57];
				this.anIntArray118[local57] = arg0.anIntArray118[local57];
				this.anIntArray121[local57] = arg0.anIntArray121[local57];
			}
		}
		if (arg2) {
			this.aShortArray52 = arg0.aShortArray52;
		} else {
			this.aShortArray52 = new short[this.anInt1449];
			for (local57 = 0; local57 < this.anInt1449; local57++) {
				this.aShortArray52[local57] = arg0.aShortArray52[local57];
			}
		}
		if (arg3 || arg0.aShortArray46 == null) {
			this.aShortArray46 = arg0.aShortArray46;
		} else {
			this.aShortArray46 = new short[this.anInt1449];
			for (local57 = 0; local57 < this.anInt1449; local57++) {
				this.aShortArray46[local57] = arg0.aShortArray46[local57];
			}
		}
		this.aByteArray18 = arg0.aByteArray18;
		this.anIntArray112 = arg0.anIntArray112;
		this.anIntArray113 = arg0.anIntArray113;
		this.anIntArray111 = arg0.anIntArray111;
		this.aByteArray13 = arg0.aByteArray13;
		this.aByteArray17 = arg0.aByteArray17;
		this.aByteArray11 = arg0.aByteArray11;
		this.aByte1 = arg0.aByte1;
		this.aByteArray16 = arg0.aByteArray16;
		this.aShortArray48 = arg0.aShortArray48;
		this.aShortArray45 = arg0.aShortArray45;
		this.aShortArray47 = arg0.aShortArray47;
		this.aShortArray50 = arg0.aShortArray50;
		this.aShortArray51 = arg0.aShortArray51;
		this.aShortArray49 = arg0.aShortArray49;
		this.aByteArray20 = arg0.aByteArray20;
		this.aByteArray14 = arg0.aByteArray14;
		this.aByteArray12 = arg0.aByteArray12;
		this.aByteArray19 = arg0.aByteArray19;
		this.aByteArray15 = arg0.aByteArray15;
		this.anIntArray116 = arg0.anIntArray116;
		this.anIntArray117 = arg0.anIntArray117;
		this.anIntArrayArray10 = arg0.anIntArrayArray10;
		this.anIntArrayArray11 = arg0.anIntArrayArray11;
		this.aClass69Array2 = arg0.aClass69Array2;
		this.aClass4Array1 = arg0.aClass4Array1;
		this.aClass69Array1 = arg0.aClass69Array1;
		this.aShort6 = arg0.aShort6;
		this.aShort7 = arg0.aShort7;
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "()V")
	public void method962() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray116 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt1448; local9++) {
				local15 = this.anIntArray116[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray10 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray10[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt1448) {
				local65 = this.anIntArray116[local59];
				this.anIntArrayArray10[local65][local5[local65]++] = local59++;
			}
			this.anIntArray116 = null;
		}
		if (this.anIntArray117 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt1449; local9++) {
			local15 = this.anIntArray117[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray11 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray11[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt1449) {
			local65 = this.anIntArray117[local59];
			this.anIntArrayArray11[local65][local5[local65]++] = local59++;
		}
		this.anIntArray117 = null;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(SS)V")
	public void method963(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray46 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt1449; local5++) {
			if (this.aShortArray46[local5] == arg0) {
				this.aShortArray46[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([B)V")
	private void method964(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class2_Sub11 local8 = new Class2_Sub11(arg0);
		@Pc(13) Class2_Sub11 local13 = new Class2_Sub11(arg0);
		@Pc(18) Class2_Sub11 local18 = new Class2_Sub11(arg0);
		@Pc(23) Class2_Sub11 local23 = new Class2_Sub11(arg0);
		@Pc(28) Class2_Sub11 local28 = new Class2_Sub11(arg0);
		local8.anInt2235 = arg0.length - 18;
		@Pc(38) int local38 = local8.method1557();
		@Pc(42) int local42 = local8.method1557();
		@Pc(46) int local46 = local8.method1534();
		@Pc(50) int local50 = local8.method1534();
		@Pc(54) int local54 = local8.method1534();
		@Pc(58) int local58 = local8.method1534();
		@Pc(62) int local62 = local8.method1534();
		@Pc(66) int local66 = local8.method1534();
		@Pc(70) int local70 = local8.method1557();
		@Pc(74) int local74 = local8.method1557();
		@Pc(78) int local78 = local8.method1557();
		@Pc(82) int local82 = local8.method1557();
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
		this.anInt1448 = local38;
		this.anInt1449 = local42;
		this.anInt1451 = local46;
		this.anIntArray122 = new int[local38];
		this.anIntArray118 = new int[local38];
		this.anIntArray121 = new int[local38];
		this.anIntArray112 = new int[local42];
		this.anIntArray113 = new int[local42];
		this.anIntArray111 = new int[local42];
		if (local46 > 0) {
			this.aByteArray16 = new byte[local46];
			this.aShortArray48 = new short[local46];
			this.aShortArray45 = new short[local46];
			this.aShortArray47 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray116 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray13 = new byte[local42];
			this.aByteArray11 = new byte[local42];
			this.aShortArray46 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray17 = new byte[local42];
		} else {
			this.aByte1 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray18 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray117 = new int[local42];
		}
		this.aShortArray52 = new short[local42];
		local8.anInt2235 = 0;
		local13.anInt2235 = local165;
		local18.anInt2235 = local171;
		local23.anInt2235 = local90;
		local28.anInt2235 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method1534();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method1553();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method1553();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method1553();
			}
			this.anIntArray122[local307] = local301 + local314;
			this.anIntArray118[local307] = local303 + local324;
			this.anIntArray121[local307] = local305 + local334;
			local301 = this.anIntArray122[local307];
			local303 = this.anIntArray118[local307];
			local305 = this.anIntArray121[local307];
			if (local66 == 1) {
				this.anIntArray116[local307] = local28.method1534();
			}
		}
		local8.anInt2235 = local149;
		local13.anInt2235 = local116;
		local18.anInt2235 = local98;
		local23.anInt2235 = local134;
		local28.anInt2235 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray52[local312] = (short) local8.method1557();
			if (local50 == 1) {
				local314 = local13.method1534();
				if ((local314 & 0x1) == 1) {
					this.aByteArray13[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray13[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray11[local312] = (byte) (local314 >> 2);
					this.aShortArray46[local312] = this.aShortArray52[local312];
					this.aShortArray52[local312] = 127;
					if (this.aShortArray46[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray11[local312] = -1;
					this.aShortArray46[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray17[local312] = local18.method1552();
			}
			if (local58 == 1) {
				this.aByteArray18[local312] = local23.method1552();
			}
			if (local62 == 1) {
				this.anIntArray117[local312] = local28.method1534();
			}
		}
		local8.anInt2235 = local143;
		local13.anInt2235 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method1534();
			if (local543 == 1) {
				local314 = local8.method1553() + local536;
				local324 = local8.method1553() + local314;
				local334 = local8.method1553() + local324;
				local536 = local334;
				this.anIntArray112[local538] = local314;
				this.anIntArray113[local538] = local324;
				this.anIntArray111[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method1553() + local536;
				local536 = local334;
				this.anIntArray112[local538] = local314;
				this.anIntArray113[local538] = local324;
				this.anIntArray111[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method1553() + local536;
				local536 = local334;
				this.anIntArray112[local538] = local314;
				this.anIntArray113[local538] = local324;
				this.anIntArray111[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method1553() + local536;
				local536 = local334;
				this.anIntArray112[local538] = local314;
				this.anIntArray113[local538] = local646;
				this.anIntArray111[local538] = local334;
			}
		}
		local8.anInt2235 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray16[local543] = 0;
			this.aShortArray48[local543] = (short) local8.method1557();
			this.aShortArray45[local543] = (short) local8.method1557();
			this.aShortArray47[local543] = (short) local8.method1557();
		}
		if (this.aByteArray11 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray11[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray48[local731] & 0xFFFF) == this.anIntArray112[local723] && (this.aShortArray45[local731] & 0xFFFF) == this.anIntArray113[local723] && (this.aShortArray47[local731] & 0xFFFF) == this.anIntArray111[local723]) {
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
			this.aShortArray46 = null;
		}
		if (!local1) {
			this.aByteArray13 = null;
		}
	}

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "()V")
	public void method965() {
		if (this.aClass69Array2 != null) {
			return;
		}
		this.aClass69Array2 = new Class69[this.anInt1448];
		for (@Pc(10) int local10 = 0; local10 < this.anInt1448; local10++) {
			this.aClass69Array2[local10] = new Class69();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt1449; local25++) {
			@Pc(31) int local31 = this.anIntArray112[local25];
			@Pc(36) int local36 = this.anIntArray113[local25];
			@Pc(41) int local41 = this.anIntArray111[local25];
			@Pc(51) int local51 = this.anIntArray122[local36] - this.anIntArray122[local31];
			@Pc(61) int local61 = this.anIntArray118[local36] - this.anIntArray118[local31];
			@Pc(71) int local71 = this.anIntArray121[local36] - this.anIntArray121[local31];
			@Pc(81) int local81 = this.anIntArray122[local41] - this.anIntArray122[local31];
			@Pc(91) int local91 = this.anIntArray118[local41] - this.anIntArray118[local31];
			@Pc(101) int local101 = this.anIntArray121[local41] - this.anIntArray121[local31];
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
			if (this.aByteArray13 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray13[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class69 local211 = this.aClass69Array2[local31];
				local211.anInt2879 += local109;
				local211.anInt2880 += local117;
				local211.anInt2875 += local125;
				local211.anInt2882++;
				@Pc(240) Class69 local240 = this.aClass69Array2[local36];
				local240.anInt2879 += local109;
				local240.anInt2880 += local117;
				local240.anInt2875 += local125;
				local240.anInt2882++;
				@Pc(269) Class69 local269 = this.aClass69Array2[local41];
				local269.anInt2879 += local109;
				local269.anInt2880 += local117;
				local269.anInt2875 += local125;
				local269.anInt2882++;
			} else if (local198 == 1) {
				if (this.aClass4Array1 == null) {
					this.aClass4Array1 = new Class4[this.anInt1449];
				}
				@Pc(314) Class4 local314 = this.aClass4Array1[local25] = new Class4();
				local314.anInt140 = local109;
				local314.anInt135 = local117;
				local314.anInt141 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(III)V")
	public void method966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1448; local1++) {
			this.anIntArray122[local1] += arg0;
			this.anIntArray118[local1] += arg1;
			this.anIntArray121[local1] += arg2;
		}
		this.method981();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIII)Lclient!wh;")
	public Class7_Sub7_Sub1 method967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class7_Sub7_Sub1(this, arg0, arg1, -50, -10, -50);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
	public void method968() {
		@Pc(3) int local3 = Static70.anIntArray115[256];
		@Pc(7) int local7 = Static70.anIntArray119[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1448; local9++) {
			@Pc(26) int local26 = this.anIntArray121[local9] * local3 + this.anIntArray122[local9] * local7 >> 16;
			this.anIntArray121[local9] = this.anIntArray121[local9] * local7 - this.anIntArray122[local9] * local3 >> 16;
			this.anIntArray122[local9] = local26;
		}
		this.method981();
	}

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "()V")
	public void method969() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1448; local1++) {
			this.anIntArray121[local1] = -this.anIntArray121[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt1449; local18++) {
			@Pc(24) int local24 = this.anIntArray112[local18];
			this.anIntArray112[local18] = this.anIntArray111[local18];
			this.anIntArray111[local18] = local24;
		}
		this.method981();
	}

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "()V")
	private void method970() {
		if (this.aBoolean63) {
			return;
		}
		this.aBoolean63 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt1448; local20++) {
			@Pc(26) int local26 = this.anIntArray122[local20];
			@Pc(31) int local31 = this.anIntArray118[local20];
			@Pc(36) int local36 = this.anIntArray121[local20];
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
		this.aShort8 = (short) local14;
		this.aShort2 = (short) local10;
		this.aShort5 = (short) local16;
		this.aShort3 = (short) local12;
		this.aShort1 = (short) local18;
	}

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "()V")
	public void method971() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1448; local1++) {
			@Pc(7) int local7 = this.anIntArray122[local1];
			this.anIntArray122[local1] = this.anIntArray121[local1];
			this.anIntArray121[local1] = -local7;
		}
		this.method981();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!gj;I)I")
	private int method972(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray122[arg1];
		@Pc(11) int local11 = arg0.anIntArray118[arg1];
		@Pc(16) int local16 = arg0.anIntArray121[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt1448; local18++) {
			if (local6 == this.anIntArray122[local18] && local11 == this.anIntArray118[local18] && local16 == this.anIntArray121[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray122[this.anInt1448] = local6;
			this.anIntArray118[this.anInt1448] = local11;
			this.anIntArray121[this.anInt1448] = local16;
			if (arg0.anIntArray116 != null) {
				this.anIntArray116[this.anInt1448] = arg0.anIntArray116[arg1];
			}
			local1 = this.anInt1448++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!mf;IIIZ)V")
	@Override
	public void method3144(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class7_Sub3 local2 = (Class7_Sub3) arg0;
		local2.method970();
		local2.method965();
		Static70.anInt1450++;
		@Pc(12) int local12 = 0;
		@Pc(15) int[] local15 = local2.anIntArray122;
		@Pc(18) int local18 = local2.anInt1448;
		@Pc(36) int local36;
		for (@Pc(20) int local20 = 0; local20 < this.anInt1448; local20++) {
			@Pc(26) Class69 local26 = this.aClass69Array2[local20];
			if (local26.anInt2882 != 0) {
				local36 = this.anIntArray118[local20] - arg2;
				if (local36 >= local2.aShort2 && local36 <= local2.aShort5) {
					@Pc(52) int local52 = this.anIntArray122[local20] - arg1;
					if (local52 >= local2.aShort4 && local52 <= local2.aShort8) {
						@Pc(68) int local68 = this.anIntArray121[local20] - arg3;
						if (local68 >= local2.aShort3 && local68 <= local2.aShort1) {
							for (@Pc(79) int local79 = 0; local79 < local18; local79++) {
								@Pc(85) Class69 local85 = local2.aClass69Array2[local79];
								if (local52 == local15[local79] && local68 == local2.anIntArray121[local79] && local36 == local2.anIntArray118[local79] && local85.anInt2882 != 0) {
									if (this.aClass69Array1 == null) {
										this.aClass69Array1 = new Class69[this.anInt1448];
									}
									if (local2.aClass69Array1 == null) {
										local2.aClass69Array1 = new Class69[local18];
									}
									@Pc(125) Class69 local125 = this.aClass69Array1[local20];
									if (local125 == null) {
										local125 = this.aClass69Array1[local20] = new Class69(local26);
									}
									@Pc(142) Class69 local142 = local2.aClass69Array1[local79];
									if (local142 == null) {
										local142 = local2.aClass69Array1[local79] = new Class69(local85);
									}
									local125.anInt2879 += local85.anInt2879;
									local125.anInt2880 += local85.anInt2880;
									local125.anInt2875 += local85.anInt2875;
									local125.anInt2882 += local85.anInt2882;
									local142.anInt2879 += local26.anInt2879;
									local142.anInt2880 += local26.anInt2880;
									local142.anInt2875 += local26.anInt2875;
									local142.anInt2882 += local26.anInt2882;
									local12++;
									Static70.anIntArray114[local20] = Static70.anInt1450;
									Static70.anIntArray120[local79] = Static70.anInt1450;
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
		for (@Pc(236) int local236 = 0; local236 < this.anInt1449; local236++) {
			if (Static70.anIntArray114[this.anIntArray112[local236]] == Static70.anInt1450 && Static70.anIntArray114[this.anIntArray113[local236]] == Static70.anInt1450 && Static70.anIntArray114[this.anIntArray111[local236]] == Static70.anInt1450) {
				if (this.aByteArray13 == null) {
					this.aByteArray13 = new byte[this.anInt1449];
				}
				this.aByteArray13[local236] = 2;
			}
		}
		for (local36 = 0; local36 < local2.anInt1449; local36++) {
			if (Static70.anIntArray120[local2.anIntArray112[local36]] == Static70.anInt1450 && Static70.anIntArray120[local2.anIntArray113[local36]] == Static70.anInt1450 && Static70.anIntArray120[local2.anIntArray111[local36]] == Static70.anInt1450) {
				if (local2.aByteArray13 == null) {
					local2.aByteArray13 = new byte[local2.anInt1449];
				}
				local2.aByteArray13[local36] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "()V")
	public void method973() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1448; local1++) {
			this.anIntArray122[local1] = -this.anIntArray122[local1];
			this.anIntArray121[local1] = -this.anIntArray121[local1];
		}
		this.method981();
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(SS)V")
	public void method974(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1449; local1++) {
			if (this.aShortArray52[local1] == arg0) {
				this.aShortArray52[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "()Z")
	@Override
	public boolean method3150() {
		return true;
	}

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "(III)V")
	public void method976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1448; local1++) {
			this.anIntArray122[local1] = this.anIntArray122[local1] * arg0 / 128;
			this.anIntArray118[local1] = this.anIntArray118[local1] * arg1 / 128;
			this.anIntArray121[local1] = this.anIntArray121[local1] * arg2 / 128;
		}
		this.method981();
	}

	@OriginalMember(owner = "client!gj", name = "i", descriptor = "()Lclient!gj;")
	public Class7_Sub3 method977() {
		@Pc(3) Class7_Sub3 local3 = new Class7_Sub3();
		if (this.aByteArray13 != null) {
			local3.aByteArray13 = new byte[this.anInt1449];
			for (@Pc(13) int local13 = 0; local13 < this.anInt1449; local13++) {
				local3.aByteArray13[local13] = this.aByteArray13[local13];
			}
		}
		local3.anInt1448 = this.anInt1448;
		local3.anInt1449 = this.anInt1449;
		local3.anInt1451 = this.anInt1451;
		local3.anIntArray122 = this.anIntArray122;
		local3.anIntArray118 = this.anIntArray118;
		local3.anIntArray121 = this.anIntArray121;
		local3.anIntArray112 = this.anIntArray112;
		local3.anIntArray113 = this.anIntArray113;
		local3.anIntArray111 = this.anIntArray111;
		local3.aByteArray17 = this.aByteArray17;
		local3.aByteArray18 = this.aByteArray18;
		local3.aByteArray11 = this.aByteArray11;
		local3.aShortArray52 = this.aShortArray52;
		local3.aShortArray46 = this.aShortArray46;
		local3.aByte1 = this.aByte1;
		local3.aByteArray16 = this.aByteArray16;
		local3.aShortArray48 = this.aShortArray48;
		local3.aShortArray45 = this.aShortArray45;
		local3.aShortArray47 = this.aShortArray47;
		local3.aShortArray50 = this.aShortArray50;
		local3.aShortArray51 = this.aShortArray51;
		local3.aShortArray49 = this.aShortArray49;
		local3.aByteArray20 = this.aByteArray20;
		local3.aByteArray14 = this.aByteArray14;
		local3.aByteArray12 = this.aByteArray12;
		local3.aByteArray19 = this.aByteArray19;
		local3.aByteArray15 = this.aByteArray15;
		local3.anIntArray116 = this.anIntArray116;
		local3.anIntArray117 = this.anIntArray117;
		local3.anIntArrayArray10 = this.anIntArrayArray10;
		local3.anIntArrayArray11 = this.anIntArrayArray11;
		local3.aClass69Array2 = this.aClass69Array2;
		local3.aClass4Array1 = this.aClass4Array1;
		local3.aShort6 = this.aShort6;
		local3.aShort7 = this.aShort7;
		return local3;
	}

	@OriginalMember(owner = "client!gj", name = "j", descriptor = "()V")
	public void method978() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1448; local1++) {
			@Pc(7) int local7 = this.anIntArray121[local1];
			this.anIntArray121[local1] = this.anIntArray122[local1];
			this.anIntArray122[local1] = -local7;
		}
		this.method981();
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(IIIII)Lclient!ug;")
	public Class7_Sub7 method979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class7_Sub7_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "()V")
	private void method981() {
		this.aClass69Array2 = null;
		this.aClass69Array1 = null;
		this.aClass4Array1 = null;
		this.aBoolean63 = false;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)Lclient!mf;")
	@Override
	public Class7 method3142() {
		return this.method979(this.aShort6, this.aShort7, -50, -10, -50);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "()I")
	@Override
	public int method3148() {
		if (!this.aBoolean63) {
			this.method970();
		}
		return this.aShort2;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([[IIIIZIZ)Lclient!gj;")
	public Class7_Sub3 method982(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method970();
		@Pc(6) int local6 = arg1 + this.aShort4;
		@Pc(11) int local11 = arg1 + this.aShort8;
		@Pc(16) int local16 = arg3 + this.aShort3;
		@Pc(21) int local21 = arg3 + this.aShort1;
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
		@Pc(101) Class7_Sub3 local101 = new Class7_Sub3();
		local101.anInt1448 = this.anInt1448;
		local101.anInt1449 = this.anInt1449;
		local101.anInt1451 = this.anInt1451;
		local101.anIntArray122 = this.anIntArray122;
		local101.anIntArray121 = this.anIntArray121;
		local101.anIntArray112 = this.anIntArray112;
		local101.anIntArray113 = this.anIntArray113;
		local101.anIntArray111 = this.anIntArray111;
		local101.aByteArray13 = this.aByteArray13;
		local101.aByteArray17 = this.aByteArray17;
		local101.aByteArray18 = this.aByteArray18;
		local101.aByteArray11 = this.aByteArray11;
		local101.aShortArray52 = this.aShortArray52;
		local101.aShortArray46 = this.aShortArray46;
		local101.aByte1 = this.aByte1;
		local101.aByteArray16 = this.aByteArray16;
		local101.aShortArray48 = this.aShortArray48;
		local101.aShortArray45 = this.aShortArray45;
		local101.aShortArray47 = this.aShortArray47;
		local101.aShortArray50 = this.aShortArray50;
		local101.aShortArray51 = this.aShortArray51;
		local101.aShortArray49 = this.aShortArray49;
		local101.aByteArray20 = this.aByteArray20;
		local101.aByteArray14 = this.aByteArray14;
		local101.aByteArray12 = this.aByteArray12;
		local101.aByteArray19 = this.aByteArray19;
		local101.aByteArray15 = this.aByteArray15;
		local101.anIntArray116 = this.anIntArray116;
		local101.anIntArray117 = this.anIntArray117;
		local101.anIntArrayArray10 = this.anIntArrayArray10;
		local101.anIntArrayArray11 = this.anIntArrayArray11;
		local101.aShort6 = this.aShort6;
		local101.aShort7 = this.aShort7;
		local101.aClass69Array2 = this.aClass69Array2;
		local101.aClass4Array1 = this.aClass4Array1;
		local101.aClass69Array1 = this.aClass69Array1;
		local101.anIntArray118 = new int[local101.anInt1448];
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
			for (local257 = 0; local257 < local101.anInt1448; local257++) {
				local265 = this.anIntArray122[local257] + arg1;
				local272 = this.anIntArray121[local257] + arg3;
				local276 = local265 & 0x7F;
				local280 = local272 & 0x7F;
				local284 = local265 >> 7;
				local288 = local272 >> 7;
				local310 = arg0[local284][local288] * (128 - local276) + arg0[local284 + 1][local288] * local276 >> 7;
				local336 = arg0[local284][local288 + 1] * (128 - local276) + arg0[local284 + 1][local288 + 1] * local276 >> 7;
				local348 = local310 * (128 - local280) + local336 * local280 >> 7;
				local101.anIntArray118[local257] = this.anIntArray118[local257] + local348 - arg2;
			}
		} else {
			for (local257 = 0; local257 < local101.anInt1448; local257++) {
				local265 = (this.anIntArray118[local257] << 16) / this.aShort2;
				if (local265 < arg4) {
					local272 = this.anIntArray122[local257] + arg1;
					local276 = this.anIntArray121[local257] + arg3;
					local280 = local272 & 0x7F;
					local284 = local276 & 0x7F;
					local288 = local272 >> 7;
					local310 = local276 >> 7;
					local336 = arg0[local288][local310] * (128 - local280) + arg0[local288 + 1][local310] * local280 >> 7;
					local348 = arg0[local288][local310 + 1] * (128 - local280) + arg0[local288 + 1][local310 + 1] * local280 >> 7;
					@Pc(472) int local472 = local336 * (128 - local284) + local348 * local284 >> 7;
					local101.anIntArray118[local257] = this.anIntArray118[local257] + (local472 - arg2) * (arg4 - local265) / arg4;
				} else {
					local101.anIntArray118[local257] = this.anIntArray118[local257];
				}
			}
		}
		this.aBoolean63 = false;
		return local101;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "([B)V")
	private void method983(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class2_Sub11 local4 = new Class2_Sub11(arg0);
		@Pc(9) Class2_Sub11 local9 = new Class2_Sub11(arg0);
		@Pc(14) Class2_Sub11 local14 = new Class2_Sub11(arg0);
		@Pc(19) Class2_Sub11 local19 = new Class2_Sub11(arg0);
		@Pc(24) Class2_Sub11 local24 = new Class2_Sub11(arg0);
		@Pc(29) Class2_Sub11 local29 = new Class2_Sub11(arg0);
		@Pc(34) Class2_Sub11 local34 = new Class2_Sub11(arg0);
		local4.anInt2235 = arg0.length - 23;
		@Pc(44) int local44 = local4.method1557();
		@Pc(48) int local48 = local4.method1557();
		@Pc(52) int local52 = local4.method1534();
		@Pc(56) int local56 = local4.method1534();
		@Pc(60) int local60 = local4.method1534();
		@Pc(64) int local64 = local4.method1534();
		@Pc(68) int local68 = local4.method1534();
		@Pc(72) int local72 = local4.method1534();
		@Pc(76) int local76 = local4.method1534();
		@Pc(80) int local80 = local4.method1557();
		@Pc(84) int local84 = local4.method1557();
		@Pc(88) int local88 = local4.method1557();
		@Pc(92) int local92 = local4.method1557();
		@Pc(96) int local96 = local4.method1557();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray16 = new byte[local52];
			local4.anInt2235 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray16[local113] = local4.method1552();
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
		this.anInt1448 = local44;
		this.anInt1449 = local48;
		this.anInt1451 = local52;
		this.anIntArray122 = new int[local44];
		this.anIntArray118 = new int[local44];
		this.anIntArray121 = new int[local44];
		this.anIntArray112 = new int[local48];
		this.anIntArray113 = new int[local48];
		this.anIntArray111 = new int[local48];
		if (local76 == 1) {
			this.anIntArray116 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray13 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray17 = new byte[local48];
		} else {
			this.aByte1 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray18 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray117 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray46 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray11 = new byte[local48];
		}
		this.aShortArray52 = new short[local48];
		if (local52 > 0) {
			this.aShortArray48 = new short[local52];
			this.aShortArray45 = new short[local52];
			this.aShortArray47 = new short[local52];
			if (local100 > 0) {
				this.aShortArray50 = new short[local100];
				this.aShortArray51 = new short[local100];
				this.aShortArray49 = new short[local100];
				this.aByteArray20 = new byte[local100];
				this.aByteArray14 = new byte[local100];
				this.aByteArray12 = new byte[local100];
			}
			if (local102 > 0) {
				this.aByteArray19 = new byte[local102];
				this.aByteArray15 = new byte[local102];
			}
		}
		local4.anInt2235 = local52;
		local9.anInt2235 = local233;
		local14.anInt2235 = local239;
		local19.anInt2235 = local245;
		local24.anInt2235 = local184;
		@Pc(455) int local455 = 0;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(466) int local466;
		@Pc(468) int local468;
		@Pc(478) int local478;
		@Pc(488) int local488;
		for (@Pc(461) int local461 = 0; local461 < local44; local461++) {
			local466 = local4.method1534();
			local468 = 0;
			if ((local466 & 0x1) != 0) {
				local468 = local9.method1553();
			}
			local478 = 0;
			if ((local466 & 0x2) != 0) {
				local478 = local14.method1553();
			}
			local488 = 0;
			if ((local466 & 0x4) != 0) {
				local488 = local19.method1553();
			}
			this.anIntArray122[local461] = local455 + local468;
			this.anIntArray118[local461] = local457 + local478;
			this.anIntArray121[local461] = local459 + local488;
			local455 = this.anIntArray122[local461];
			local457 = this.anIntArray118[local461];
			local459 = this.anIntArray121[local461];
			if (local76 == 1) {
				this.anIntArray116[local461] = local24.method1534();
			}
		}
		local4.anInt2235 = local225;
		local9.anInt2235 = local151;
		local14.anInt2235 = local166;
		local19.anInt2235 = local193;
		local24.anInt2235 = local175;
		local29.anInt2235 = local208;
		local34.anInt2235 = local219;
		for (local466 = 0; local466 < local48; local466++) {
			this.aShortArray52[local466] = (short) local4.method1557();
			if (local56 == 1) {
				this.aByteArray13[local466] = local9.method1552();
			}
			if (local60 == 255) {
				this.aByteArray17[local466] = local14.method1552();
			}
			if (local64 == 1) {
				this.aByteArray18[local466] = local19.method1552();
			}
			if (local68 == 1) {
				this.anIntArray117[local466] = local24.method1534();
			}
			if (local72 == 1) {
				this.aShortArray46[local466] = (short) (local29.method1557() - 1);
			}
			if (this.aByteArray11 != null) {
				if (this.aShortArray46[local466] == -1) {
					this.aByteArray11[local466] = -1;
				} else {
					this.aByteArray11[local466] = (byte) (local34.method1534() - 1);
				}
			}
		}
		local4.anInt2235 = local202;
		local9.anInt2235 = local160;
		local468 = 0;
		local478 = 0;
		local488 = 0;
		@Pc(674) int local674 = 0;
		@Pc(681) int local681;
		@Pc(784) int local784;
		for (@Pc(676) int local676 = 0; local676 < local48; local676++) {
			local681 = local9.method1534();
			if (local681 == 1) {
				local468 = local4.method1553() + local674;
				local478 = local4.method1553() + local468;
				local488 = local4.method1553() + local478;
				local674 = local488;
				this.anIntArray112[local676] = local468;
				this.anIntArray113[local676] = local478;
				this.anIntArray111[local676] = local488;
			}
			if (local681 == 2) {
				local478 = local488;
				local488 = local4.method1553() + local674;
				local674 = local488;
				this.anIntArray112[local676] = local468;
				this.anIntArray113[local676] = local478;
				this.anIntArray111[local676] = local488;
			}
			if (local681 == 3) {
				local468 = local488;
				local488 = local4.method1553() + local674;
				local674 = local488;
				this.anIntArray112[local676] = local468;
				this.anIntArray113[local676] = local478;
				this.anIntArray111[local676] = local488;
			}
			if (local681 == 4) {
				local784 = local468;
				local468 = local478;
				local478 = local784;
				local488 = local4.method1553() + local674;
				local674 = local488;
				this.anIntArray112[local676] = local468;
				this.anIntArray113[local676] = local784;
				this.anIntArray111[local676] = local488;
			}
		}
		local4.anInt2235 = local251;
		local9.anInt2235 = local259;
		local14.anInt2235 = local267;
		local19.anInt2235 = local275;
		local24.anInt2235 = local281;
		local29.anInt2235 = local113;
		for (local681 = 0; local681 < local52; local681++) {
			local784 = this.aByteArray16[local681] & 0xFF;
			if (local784 == 0) {
				this.aShortArray48[local681] = (short) local4.method1557();
				this.aShortArray45[local681] = (short) local4.method1557();
				this.aShortArray47[local681] = (short) local4.method1557();
			}
			if (local784 == 1) {
				this.aShortArray48[local681] = (short) local9.method1557();
				this.aShortArray45[local681] = (short) local9.method1557();
				this.aShortArray47[local681] = (short) local9.method1557();
				this.aShortArray50[local681] = (short) local14.method1557();
				this.aShortArray51[local681] = (short) local14.method1557();
				this.aShortArray49[local681] = (short) local14.method1557();
				this.aByteArray20[local681] = local19.method1552();
				this.aByteArray14[local681] = local24.method1552();
				this.aByteArray12[local681] = local29.method1552();
			}
			if (local784 == 2) {
				this.aShortArray48[local681] = (short) local9.method1557();
				this.aShortArray45[local681] = (short) local9.method1557();
				this.aShortArray47[local681] = (short) local9.method1557();
				this.aShortArray50[local681] = (short) local14.method1557();
				this.aShortArray51[local681] = (short) local14.method1557();
				this.aShortArray49[local681] = (short) local14.method1557();
				this.aByteArray20[local681] = local19.method1552();
				this.aByteArray14[local681] = local24.method1552();
				this.aByteArray12[local681] = local29.method1552();
				this.aByteArray19[local681] = local29.method1552();
				this.aByteArray15[local681] = local29.method1552();
			}
			if (local784 == 3) {
				this.aShortArray48[local681] = (short) local9.method1557();
				this.aShortArray45[local681] = (short) local9.method1557();
				this.aShortArray47[local681] = (short) local9.method1557();
				this.aShortArray50[local681] = (short) local14.method1557();
				this.aShortArray51[local681] = (short) local14.method1557();
				this.aShortArray49[local681] = (short) local14.method1557();
				this.aByteArray20[local681] = local19.method1552();
				this.aByteArray14[local681] = local24.method1552();
				this.aByteArray12[local681] = local29.method1552();
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "()V")
	public void method984() {
		this.anIntArray116 = null;
		this.anIntArray117 = null;
		this.anIntArrayArray10 = null;
		this.anIntArrayArray11 = null;
	}
}
