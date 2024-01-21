import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class1_Sub2_Sub13 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ig", name = "Q", descriptor = "[I")
	private int[] anIntArray223;

	@OriginalMember(owner = "client!ig", name = "T", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!ig", name = "hb", descriptor = "I")
	public int anInt1998;

	@OriginalMember(owner = "client!ig", name = "jb", descriptor = "[I")
	public int[] anIntArray225;

	@OriginalMember(owner = "client!ig", name = "lb", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!ig", name = "pb", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!ig", name = "Fb", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!ig", name = "Sb", descriptor = "[I")
	public int[] anIntArray227;

	@OriginalMember(owner = "client!ig", name = "Vb", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!ig", name = "S", descriptor = "I")
	public int anInt1986 = -1;

	@OriginalMember(owner = "client!ig", name = "V", descriptor = "I")
	public int anInt1988 = 1;

	@OriginalMember(owner = "client!ig", name = "ab", descriptor = "I")
	private int anInt1992 = 0;

	@OriginalMember(owner = "client!ig", name = "eb", descriptor = "Z")
	private boolean aBoolean86 = false;

	@OriginalMember(owner = "client!ig", name = "nb", descriptor = "I")
	public int anInt2001 = 1;

	@OriginalMember(owner = "client!ig", name = "Y", descriptor = "Z")
	private boolean aBoolean85 = false;

	@OriginalMember(owner = "client!ig", name = "Z", descriptor = "I")
	public int anInt1991 = 0;

	@OriginalMember(owner = "client!ig", name = "L", descriptor = "Z")
	public boolean aBoolean84 = true;

	@OriginalMember(owner = "client!ig", name = "yb", descriptor = "I")
	public int anInt2010 = 16;

	@OriginalMember(owner = "client!ig", name = "K", descriptor = "Lclient!oc;")
	public Class65 aClass65_1214 = Static74.aClass65_1116;

	@OriginalMember(owner = "client!ig", name = "wb", descriptor = "I")
	private int anInt2008 = 0;

	@OriginalMember(owner = "client!ig", name = "M", descriptor = "I")
	public int anInt1981 = 0;

	@OriginalMember(owner = "client!ig", name = "U", descriptor = "I")
	private int anInt1987 = -1;

	@OriginalMember(owner = "client!ig", name = "Db", descriptor = "Z")
	public boolean aBoolean89 = false;

	@OriginalMember(owner = "client!ig", name = "rb", descriptor = "I")
	public int anInt2004 = 2;

	@OriginalMember(owner = "client!ig", name = "xb", descriptor = "I")
	public int anInt2009 = -1;

	@OriginalMember(owner = "client!ig", name = "Hb", descriptor = "Z")
	public boolean aBoolean91 = true;

	@OriginalMember(owner = "client!ig", name = "ub", descriptor = "Z")
	public boolean aBoolean88 = false;

	@OriginalMember(owner = "client!ig", name = "N", descriptor = "I")
	public int anInt1982 = -1;

	@OriginalMember(owner = "client!ig", name = "Mb", descriptor = "Z")
	public boolean aBoolean92 = false;

	@OriginalMember(owner = "client!ig", name = "Eb", descriptor = "Z")
	public boolean aBoolean90 = false;

	@OriginalMember(owner = "client!ig", name = "Kb", descriptor = "I")
	private int anInt2016 = 128;

	@OriginalMember(owner = "client!ig", name = "Ab", descriptor = "[Lclient!oc;")
	public final Class65[] aClass65Array27 = new Class65[5];

	@OriginalMember(owner = "client!ig", name = "Lb", descriptor = "I")
	public int anInt2017 = 0;

	@OriginalMember(owner = "client!ig", name = "zb", descriptor = "I")
	public int anInt2011 = -1;

	@OriginalMember(owner = "client!ig", name = "mb", descriptor = "Z")
	public boolean aBoolean87 = true;

	@OriginalMember(owner = "client!ig", name = "gb", descriptor = "I")
	public int anInt1997 = -1;

	@OriginalMember(owner = "client!ig", name = "cb", descriptor = "I")
	public int anInt1994 = -1;

	@OriginalMember(owner = "client!ig", name = "Ib", descriptor = "I")
	private int anInt2014 = 0;

	@OriginalMember(owner = "client!ig", name = "Cb", descriptor = "I")
	private int anInt2012 = -1;

	@OriginalMember(owner = "client!ig", name = "R", descriptor = "I")
	public int anInt1985 = 0;

	@OriginalMember(owner = "client!ig", name = "Pb", descriptor = "I")
	private int anInt2018 = 128;

	@OriginalMember(owner = "client!ig", name = "fb", descriptor = "I")
	private int anInt1996 = 0;

	@OriginalMember(owner = "client!ig", name = "vb", descriptor = "I")
	private int anInt2007 = -1;

	@OriginalMember(owner = "client!ig", name = "Ub", descriptor = "I")
	private int anInt2020 = 0;

	@OriginalMember(owner = "client!ig", name = "tb", descriptor = "I")
	private int anInt2006 = 128;

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)Z")
	public boolean method1423() {
		if (this.anIntArray227 == null) {
			return this.anInt1986 != -1 || this.anIntArray225 != null;
		}
		for (@Pc(33) int local33 = 0; local33 < this.anIntArray227.length; local33++) {
			if (this.anIntArray227[local33] != -1) {
				@Pc(48) Class1_Sub2_Sub13 local48 = Static5.method65(this.anIntArray227[local33]);
				if (local48.anInt1986 != -1 || local48.anIntArray225 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIII[[IIIILclient!kg;)Lclient!pa;")
	public Class1_Sub2_Sub19 method1425(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class1_Sub2_Sub14 arg7) {
		@Pc(27) long local27;
		if (this.anIntArray224 == null) {
			local27 = (this.anInt1998 << 10) + arg4;
		} else {
			local27 = arg4 + (arg0 << 3) + (this.anInt1998 << 10);
		}
		@Pc(42) Class6_Sub3_Sub1 local42 = (Class6_Sub3_Sub1) Static96.aClass67_4.method2570(local27);
		if (local42 == null) {
			@Pc(50) Class6_Sub1 local50 = this.method1428(arg4, arg0);
			if (local50 == null) {
				return null;
			}
			local42 = new Class6_Sub3_Sub1(local50, this.anInt2014 + 64, this.anInt2008 * 5 + 768, -50, -10, -50);
			Static96.aClass67_4.method2567(local42, local27);
		}
		if (arg7 != null) {
			local42 = (Class6_Sub3_Sub1) arg7.method1888(local42, arg5, arg4);
		}
		if (this.anInt1987 >= 0) {
			if (arg7 == null) {
				local42 = (Class6_Sub3_Sub1) local42.method1183(true);
			}
			local42 = local42.method1190(arg3, arg2, arg1, arg6, false, this.anInt1987);
		}
		Static81.aClass1_Sub2_Sub19_1.aClass6_9 = local42;
		return Static81.aClass1_Sub2_Sub19_1;
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)Z")
	public boolean method1426() {
		if (this.anIntArray223 == null) {
			return true;
		}
		@Pc(17) boolean local17 = true;
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray223.length; local19++) {
			local17 &= Static84.aClass60_20.method2317(this.anIntArray223[local19] & 0xFFFF, 0);
		}
		return local17;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!wa;)V")
	public void method1427(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method1738();
			if (local17 == 0) {
				return;
			}
			this.method1436(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)Lclient!ai;")
	private Class6_Sub1 method1428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class6_Sub1 local5 = null;
		@Pc(8) boolean local8 = this.aBoolean85;
		if (arg1 == 2 && arg0 > 3) {
			local8 = !local8;
		}
		@Pc(37) int local37;
		@Pc(39) int local39;
		@Pc(45) int local45;
		if (this.anIntArray224 == null) {
			if (arg1 != 10) {
				return null;
			}
			if (this.anIntArray223 == null) {
				return null;
			}
			local37 = this.anIntArray223.length;
			for (local39 = 0; local39 < local37; local39++) {
				local45 = this.anIntArray223[local39];
				if (local8) {
					local45 += 65536;
				}
				local5 = (Class6_Sub1) Static117.aClass67_6.method2570((long) local45);
				if (local5 == null) {
					local5 = Static10.method193(Static84.aClass60_20, local45 & 0xFFFF);
					if (local5 == null) {
						return null;
					}
					if (local8) {
						local5.method180();
					}
					Static117.aClass67_6.method2567(local5, (long) local45);
				}
				if (local37 > 1) {
					Static164.aClass6_Sub1Array1[local39] = local5;
				}
			}
			if (local37 > 1) {
				local5 = new Class6_Sub1(Static164.aClass6_Sub1Array1, local37);
			}
		} else {
			local37 = -1;
			for (local39 = 0; local39 < this.anIntArray224.length; local39++) {
				if (arg1 == this.anIntArray224[local39]) {
					local37 = local39;
					break;
				}
			}
			if (local37 == -1) {
				return null;
			}
			local45 = this.anIntArray223[local37];
			if (local8) {
				local45 += 65536;
			}
			local5 = (Class6_Sub1) Static117.aClass67_6.method2570((long) local45);
			if (local5 == null) {
				local5 = Static10.method193(Static84.aClass60_20, local45 & 0xFFFF);
				if (local5 == null) {
					return null;
				}
				if (local8) {
					local5.method180();
				}
				Static117.aClass67_6.method2567(local5, (long) local45);
			}
		}
		@Pc(198) boolean local198;
		if (this.anInt1996 == 0 && this.anInt1992 == 0 && this.anInt2020 == 0) {
			local198 = false;
		} else {
			local198 = true;
		}
		@Pc(217) boolean local217;
		if (this.anInt2016 == 128 && this.anInt2018 == 128 && this.anInt2006 == 128) {
			local217 = false;
		} else {
			local217 = true;
		}
		@Pc(250) Class6_Sub1 local250 = new Class6_Sub1(local5, arg0 == 0 && !local217 && !local198, this.aShortArray34 == null, this.aShortArray32 == null, true);
		if (arg1 == 4 && arg0 > 3) {
			local250.method186();
			local250.method185(45, 0, -45);
		}
		@Pc(270) int local270 = arg0 & 0x3;
		if (local270 == 1) {
			local250.method182();
		} else if (local270 == 2) {
			local250.method181();
		} else if (local270 == 3) {
			local250.method196();
		}
		@Pc(300) int local300;
		if (this.aShortArray34 != null) {
			for (local300 = 0; local300 < this.aShortArray34.length; local300++) {
				local250.method199(this.aShortArray34[local300], this.aShortArray31[local300]);
			}
		}
		if (this.aShortArray32 != null) {
			for (local300 = 0; local300 < this.aShortArray32.length; local300++) {
				local250.method192(this.aShortArray32[local300], this.aShortArray33[local300]);
			}
		}
		if (local217) {
			local250.method189(this.anInt2016, this.anInt2018, this.anInt2006);
		}
		if (local198) {
			local250.method185(this.anInt1996, this.anInt1992, this.anInt2020);
		}
		return local250;
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(B)Lclient!ig;")
	public Class1_Sub2_Sub13 method1430() {
		@Pc(1) int local1 = -1;
		if (this.anInt2007 != -1) {
			local1 = Static160.method2103(this.anInt2007);
		} else if (this.anInt2012 != -1) {
			local1 = Static135.anIntArray379[this.anInt2012];
		}
		return local1 < 0 || this.anIntArray227.length <= local1 || this.anIntArray227[local1] == -1 ? null : Static5.method65(this.anIntArray227[local1]);
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(II)Z")
	public boolean method1431(@OriginalArg(1) int arg0) {
		if (this.anIntArray224 != null) {
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray224.length; local13++) {
				if (arg0 == this.anIntArray224[local13]) {
					return Static84.aClass60_20.method2317(this.anIntArray223[local13] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray223 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(55) boolean local55 = true;
			for (@Pc(57) int local57 = 0; local57 < this.anIntArray223.length; local57++) {
				local55 &= Static84.aClass60_20.method2317(this.anIntArray223[local57] & 0xFFFF, 0);
			}
			return local55;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(Z)V")
	public void method1433() {
		if (this.anInt1982 == -1) {
			this.anInt1982 = 0;
			if (this.anIntArray223 != null && (this.anIntArray224 == null || this.anIntArray224[0] == 10)) {
				this.anInt1982 = 1;
			}
			for (@Pc(24) int local24 = 0; local24 < 5; local24++) {
				if (this.aClass65Array27[local24] != null) {
					this.anInt1982 = 1;
				}
			}
		}
		if (this.anInt1994 == -1) {
			this.anInt1994 = this.anInt2004 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIII[[IZ)Lclient!pa;")
	public Class1_Sub2_Sub19 method1434(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[][] arg5, @OriginalArg(7) boolean arg6) {
		@Pc(18) long local18;
		if (this.anIntArray224 == null) {
			local18 = (this.anInt1998 << 10) + arg3;
		} else {
			local18 = arg3 + (arg1 << 3) + (this.anInt1998 << 10);
		}
		@Pc(34) boolean local34;
		if (arg6 && this.aBoolean86) {
			local18 |= Long.MIN_VALUE;
			local34 = true;
		} else {
			local34 = false;
		}
		@Pc(52) Class6 local52 = Static197.aClass67_10.method2570(local18);
		if (local52 == null) {
			@Pc(60) Class6_Sub1 local60 = this.method1428(arg3, arg1);
			if (local60 == null) {
				Static81.aClass1_Sub2_Sub19_1.aClass6_9 = null;
				return Static81.aClass1_Sub2_Sub19_1;
			}
			local60.method183();
			if (local34) {
				local60.aShort2 = (short) (this.anInt2008 * 5 + 768);
				local60.aShort6 = (short) (this.anInt2014 + 64);
				local60.method194();
				local52 = local60;
			} else {
				local52 = new Class6_Sub3_Sub1(local60, this.anInt2014 + 64, this.anInt2008 * 5 + 768, -50, -10, -50);
			}
			Static197.aClass67_10.method2567(local52, local18);
		}
		if (local34) {
			local52 = ((Class6_Sub1) local52).method195();
		}
		if (this.anInt1987 >= 0) {
			if (local52 instanceof Class6_Sub3_Sub1) {
				local52 = ((Class6_Sub3_Sub1) local52).method1190(arg5, arg0, arg2, arg4, true, this.anInt1987);
			} else if (local52 instanceof Class6_Sub1) {
				local52 = ((Class6_Sub1) local52).method191(arg5, arg0, arg2, arg4, this.anInt1987);
			}
		}
		Static81.aClass1_Sub2_Sub19_1.aClass6_9 = local52;
		return Static81.aClass1_Sub2_Sub19_1;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZLclient!wa;I)V")
	private void method1436(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19;
		@Pc(35) int local35;
		if (arg1 == 1) {
			local19 = arg0.method1738();
			if (local19 > 0) {
				if (this.anIntArray223 == null || Static37.aBoolean41) {
					this.anIntArray223 = new int[local19];
					this.anIntArray224 = new int[local19];
					for (local35 = 0; local35 < local19; local35++) {
						this.anIntArray223[local35] = arg0.method1753();
						this.anIntArray224[local35] = arg0.method1738();
					}
				} else {
					arg0.anInt2306 += local19 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.aClass65_1214 = arg0.method1706();
		} else if (arg1 == 5) {
			local19 = arg0.method1738();
			if (local19 > 0) {
				if (this.anIntArray223 == null || Static37.aBoolean41) {
					this.anIntArray224 = null;
					this.anIntArray223 = new int[local19];
					for (local35 = 0; local35 < local19; local35++) {
						this.anIntArray223[local35] = arg0.method1753();
					}
				} else {
					arg0.anInt2306 += local19 * 2;
				}
			}
		} else if (arg1 == 14) {
			this.anInt1988 = arg0.method1738();
		} else if (arg1 == 15) {
			this.anInt2001 = arg0.method1738();
		} else if (arg1 == 17) {
			this.anInt2004 = 0;
			this.aBoolean87 = false;
		} else if (arg1 == 18) {
			this.aBoolean87 = false;
		} else if (arg1 == 19) {
			this.anInt1982 = arg0.method1738();
		} else if (arg1 == 21) {
			this.anInt1987 = 0;
		} else if (arg1 == 22) {
			this.aBoolean86 = true;
		} else if (arg1 == 23) {
			this.aBoolean92 = true;
		} else if (arg1 == 24) {
			this.anInt2011 = arg0.method1753();
			if (this.anInt2011 == 65535) {
				this.anInt2011 = -1;
			}
		} else if (arg1 == 27) {
			this.anInt2004 = 1;
		} else if (arg1 == 28) {
			this.anInt2010 = arg0.method1738();
		} else if (arg1 == 29) {
			this.anInt2014 = arg0.method1720();
		} else if (arg1 == 39) {
			this.anInt2008 = arg0.method1720() * 5;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass65Array27[arg1 - 30] = arg0.method1706();
			if (this.aClass65Array27[arg1 - 30].method2489(Static186.aClass65_2441)) {
				this.aClass65Array27[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local19 = arg0.method1738();
			this.aShortArray31 = new short[local19];
			this.aShortArray34 = new short[local19];
			for (local35 = 0; local35 < local19; local35++) {
				this.aShortArray34[local35] = (short) arg0.method1753();
				this.aShortArray31[local35] = (short) arg0.method1753();
			}
		} else if (arg1 == 41) {
			local19 = arg0.method1738();
			this.aShortArray33 = new short[local19];
			this.aShortArray32 = new short[local19];
			for (local35 = 0; local35 < local19; local35++) {
				this.aShortArray32[local35] = (short) arg0.method1753();
				this.aShortArray33[local35] = (short) arg0.method1753();
			}
		} else if (arg1 == 60) {
			this.anInt1997 = arg0.method1753();
		} else if (arg1 == 62) {
			this.aBoolean85 = true;
		} else if (arg1 == 64) {
			this.aBoolean91 = false;
		} else if (arg1 == 65) {
			this.anInt2016 = arg0.method1753();
		} else if (arg1 == 66) {
			this.anInt2018 = arg0.method1753();
		} else if (arg1 == 67) {
			this.anInt2006 = arg0.method1753();
		} else if (arg1 == 68) {
			this.anInt2009 = arg0.method1753();
		} else if (arg1 == 69) {
			this.anInt1981 = arg0.method1738();
		} else if (arg1 == 70) {
			this.anInt1996 = arg0.method1729();
		} else if (arg1 == 71) {
			this.anInt1992 = arg0.method1729();
		} else if (arg1 == 72) {
			this.anInt2020 = arg0.method1729();
		} else if (arg1 == 73) {
			this.aBoolean88 = true;
		} else if (arg1 == 74) {
			this.aBoolean90 = true;
		} else if (arg1 == 75) {
			this.anInt1994 = arg0.method1738();
		} else if (arg1 == 77) {
			this.anInt2007 = arg0.method1753();
			if (this.anInt2007 == 65535) {
				this.anInt2007 = -1;
			}
			this.anInt2012 = arg0.method1753();
			if (this.anInt2012 == 65535) {
				this.anInt2012 = -1;
			}
			local19 = arg0.method1738();
			this.anIntArray227 = new int[local19 + 1];
			for (local35 = 0; local35 <= local19; local35++) {
				this.anIntArray227[local35] = arg0.method1753();
				if (this.anIntArray227[local35] == 65535) {
					this.anIntArray227[local35] = -1;
				}
			}
		} else if (arg1 == 78) {
			this.anInt1986 = arg0.method1753();
			this.anInt2017 = arg0.method1738();
		} else if (arg1 == 79) {
			this.anInt1985 = arg0.method1753();
			this.anInt1991 = arg0.method1753();
			this.anInt2017 = arg0.method1738();
			local19 = arg0.method1738();
			this.anIntArray225 = new int[local19];
			for (local35 = 0; local35 < local19; local35++) {
				this.anIntArray225[local35] = arg0.method1753();
			}
		} else if (arg1 == 81) {
			this.anInt1987 = arg0.method1738() * 256;
		} else if (arg1 != 82) {
			if (arg1 == 83) {
				arg0.method1738();
			} else if (arg1 == 84) {
				arg0.method1729();
			} else if (arg1 == 85) {
				arg0.method1729();
			} else if (arg1 == 86) {
				arg0.method1729();
			} else if (arg1 == 87) {
				arg0.method1753();
			} else if (arg1 != 88) {
				if (arg1 == 89) {
					this.aBoolean84 = false;
				} else if (arg1 == 90) {
					this.aBoolean89 = true;
				}
			}
		}
	}
}
