import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class1_Sub1_Sub8 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mb", name = "T", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!mb", name = "W", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
	public int anInt1999;

	@OriginalMember(owner = "client!mb", name = "db", descriptor = "[I")
	public int[] anIntArray230;

	@OriginalMember(owner = "client!mb", name = "Bb", descriptor = "[I")
	public int[] anIntArray231;

	@OriginalMember(owner = "client!mb", name = "Pb", descriptor = "I")
	private int anInt2034;

	@OriginalMember(owner = "client!mb", name = "U", descriptor = "I")
	private int anInt1998 = -1;

	@OriginalMember(owner = "client!mb", name = "fb", descriptor = "I")
	private int anInt2004 = -1;

	@OriginalMember(owner = "client!mb", name = "Y", descriptor = "I")
	private int anInt2000 = -1;

	@OriginalMember(owner = "client!mb", name = "hb", descriptor = "I")
	private int anInt2006 = 128;

	@OriginalMember(owner = "client!mb", name = "ab", descriptor = "I")
	public int anInt2002 = 0;

	@OriginalMember(owner = "client!mb", name = "gb", descriptor = "I")
	public int anInt2005 = 0;

	@OriginalMember(owner = "client!mb", name = "cb", descriptor = "I")
	public int anInt2003 = 0;

	@OriginalMember(owner = "client!mb", name = "Z", descriptor = "I")
	public int anInt2001 = 0;

	@OriginalMember(owner = "client!mb", name = "ob", descriptor = "I")
	private int anInt2013 = -1;

	@OriginalMember(owner = "client!mb", name = "pb", descriptor = "I")
	public int anInt2014 = 0;

	@OriginalMember(owner = "client!mb", name = "kb", descriptor = "I")
	public int anInt2009 = 0;

	@OriginalMember(owner = "client!mb", name = "qb", descriptor = "I")
	private int anInt2015 = -1;

	@OriginalMember(owner = "client!mb", name = "nb", descriptor = "I")
	public int anInt2012 = 0;

	@OriginalMember(owner = "client!mb", name = "vb", descriptor = "I")
	private int anInt2020 = -1;

	@OriginalMember(owner = "client!mb", name = "Mb", descriptor = "I")
	private int anInt2032 = -1;

	@OriginalMember(owner = "client!mb", name = "Eb", descriptor = "I")
	private int anInt2027 = 128;

	@OriginalMember(owner = "client!mb", name = "Lb", descriptor = "Lclient!id;")
	public Class34 aClass34_1002 = Static86.aClass34_1125;

	@OriginalMember(owner = "client!mb", name = "Nb", descriptor = "I")
	private int anInt2033 = -1;

	@OriginalMember(owner = "client!mb", name = "Jb", descriptor = "I")
	private int anInt2031 = -1;

	@OriginalMember(owner = "client!mb", name = "Rb", descriptor = "I")
	public int anInt2035 = 0;

	@OriginalMember(owner = "client!mb", name = "ib", descriptor = "I")
	private int anInt2007 = 0;

	@OriginalMember(owner = "client!mb", name = "mb", descriptor = "I")
	public int anInt2011 = 1;

	@OriginalMember(owner = "client!mb", name = "Ib", descriptor = "I")
	private int anInt2030 = 0;

	@OriginalMember(owner = "client!mb", name = "Vb", descriptor = "I")
	private int anInt2038 = -1;

	@OriginalMember(owner = "client!mb", name = "lb", descriptor = "I")
	public int anInt2010 = 2000;

	@OriginalMember(owner = "client!mb", name = "Wb", descriptor = "Z")
	public boolean aBoolean107 = false;

	@OriginalMember(owner = "client!mb", name = "Tb", descriptor = "I")
	public int anInt2037 = -1;

	@OriginalMember(owner = "client!mb", name = "eb", descriptor = "[Lclient!id;")
	public Class34[] aClass34Array17 = new Class34[] { null, null, null, null, Static105.aClass34_1295 };

	@OriginalMember(owner = "client!mb", name = "Sb", descriptor = "I")
	public int anInt2036 = 0;

	@OriginalMember(owner = "client!mb", name = "xb", descriptor = "I")
	public int anInt2022 = -1;

	@OriginalMember(owner = "client!mb", name = "Zb", descriptor = "I")
	private int anInt2039 = 128;

	@OriginalMember(owner = "client!mb", name = "Xb", descriptor = "[Lclient!id;")
	public Class34[] aClass34Array18 = new Class34[] { null, null, Static11.aClass34_249, null, null };

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)Lclient!nf;")
	public Class1_Sub1_Sub1_Sub4 method1322(@OriginalArg(0) boolean arg0) {
		@Pc(14) int local14 = this.anInt2004;
		@Pc(17) int local17 = this.anInt2032;
		@Pc(20) int local20 = this.anInt2033;
		if (arg0) {
			local20 = this.anInt2015;
			local14 = this.anInt2038;
			local17 = this.anInt2020;
		}
		if (local17 == -1) {
			return null;
		}
		@Pc(41) Class1_Sub1_Sub1_Sub4 local41 = Static83.method1412(Static20.aClass35_5, local17);
		if (local14 != -1) {
			@Pc(50) Class1_Sub1_Sub1_Sub4 local50 = Static83.method1412(Static20.aClass35_5, local14);
			if (local20 == -1) {
				@Pc(93) Class1_Sub1_Sub1_Sub4[] local93 = new Class1_Sub1_Sub1_Sub4[] { local41, local50 };
				local41 = new Class1_Sub1_Sub1_Sub4(local93, 2);
			} else {
				@Pc(59) Class1_Sub1_Sub1_Sub4 local59 = Static83.method1412(Static20.aClass35_5, local20);
				@Pc(74) Class1_Sub1_Sub1_Sub4[] local74 = new Class1_Sub1_Sub1_Sub4[] { local41, local50, local59 };
				local41 = new Class1_Sub1_Sub1_Sub4(local74, 3);
			}
		}
		if (!arg0 && this.anInt2030 != 0) {
			local41.method1416(0, this.anInt2030, 0);
		}
		if (arg0 && this.anInt2007 != 0) {
			local41.method1416(0, this.anInt2007, 0);
		}
		if (this.aShortArray7 != null) {
			for (@Pc(126) int local126 = 0; local126 < this.aShortArray7.length; local126++) {
				local41.method1415(this.aShortArray7[local126], this.aShortArray6[local126]);
			}
		}
		return local41;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZLclient!of;I)V")
	private void method1323(@OriginalArg(1) Class1_Sub19 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2034 = arg0.method2051();
		} else if (arg1 == 2) {
			this.aClass34_1002 = arg0.method2084();
		} else if (arg1 == 4) {
			this.anInt2010 = arg0.method2051();
		} else if (arg1 == 5) {
			this.anInt2002 = arg0.method2051();
		} else if (arg1 == 6) {
			this.anInt2001 = arg0.method2051();
		} else if (arg1 == 7) {
			this.anInt2035 = arg0.method2051();
			if (this.anInt2035 > 32767) {
				this.anInt2035 -= 65536;
			}
		} else if (arg1 == 8) {
			this.anInt2005 = arg0.method2051();
			if (this.anInt2005 > 32767) {
				this.anInt2005 -= 65536;
			}
		} else if (arg1 == 11) {
			this.anInt2012 = 1;
		} else if (arg1 == 12) {
			this.anInt2011 = arg0.method2046();
		} else if (arg1 == 16) {
			this.aBoolean107 = true;
		} else if (arg1 == 23) {
			this.anInt2032 = arg0.method2051();
			this.anInt2030 = arg0.method2072();
		} else if (arg1 == 24) {
			this.anInt2004 = arg0.method2051();
		} else if (arg1 == 25) {
			this.anInt2020 = arg0.method2051();
			this.anInt2007 = arg0.method2072();
		} else if (arg1 == 26) {
			this.anInt2038 = arg0.method2051();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass34Array18[arg1 - 30] = arg0.method2084();
			if (this.aClass34Array18[arg1 - 30].method961(Static23.aClass34_402)) {
				this.aClass34Array18[arg1 - 30] = null;
			}
		} else if (arg1 >= 35 && arg1 < 40) {
			this.aClass34Array17[arg1 - 35] = arg0.method2084();
		} else if (arg1 == 40) {
			@Pc(371) int local371 = arg0.method2072();
			this.aShortArray6 = new short[local371];
			this.aShortArray7 = new short[local371];
			for (@Pc(381) int local381 = 0; local381 < local371; local381++) {
				this.aShortArray7[local381] = (short) arg0.method2051();
				this.aShortArray6[local381] = (short) arg0.method2051();
			}
		} else if (arg1 == 78) {
			this.anInt2033 = arg0.method2051();
		} else if (arg1 == 79) {
			this.anInt2015 = arg0.method2051();
		} else if (arg1 == 90) {
			this.anInt1998 = arg0.method2051();
		} else if (arg1 == 91) {
			this.anInt2000 = arg0.method2051();
		} else if (arg1 == 92) {
			this.anInt2031 = arg0.method2051();
		} else if (arg1 == 93) {
			this.anInt2013 = arg0.method2051();
		} else if (arg1 == 95) {
			this.anInt2036 = arg0.method2051();
		} else if (arg1 == 97) {
			this.anInt2022 = arg0.method2051();
		} else if (arg1 == 98) {
			this.anInt2037 = arg0.method2051();
		} else if (arg1 >= 100 && arg1 < 110) {
			if (this.anIntArray231 == null) {
				this.anIntArray230 = new int[10];
				this.anIntArray231 = new int[10];
			}
			this.anIntArray231[arg1 - 100] = arg0.method2051();
			this.anIntArray230[arg1 - 100] = arg0.method2051();
		} else if (arg1 == 110) {
			this.anInt2006 = arg0.method2051();
		} else if (arg1 == 111) {
			this.anInt2027 = arg0.method2051();
		} else if (arg1 == 112) {
			this.anInt2039 = arg0.method2051();
		} else if (arg1 == 113) {
			this.anInt2009 = arg0.method2086();
		} else if (arg1 == 114) {
			this.anInt2014 = arg0.method2086() * 5;
		} else if (arg1 == 115) {
			this.anInt2003 = arg0.method2072();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BZ)Lclient!nf;")
	public Class1_Sub1_Sub1_Sub4 method1324(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt2031;
		@Pc(11) int local11 = this.anInt1998;
		if (arg0) {
			local8 = this.anInt2013;
			local11 = this.anInt2000;
		}
		if (local11 == -1) {
			return null;
		}
		@Pc(36) Class1_Sub1_Sub1_Sub4 local36 = Static83.method1412(Static20.aClass35_5, local11);
		if (local8 != -1) {
			@Pc(44) Class1_Sub1_Sub1_Sub4 local44 = Static83.method1412(Static20.aClass35_5, local8);
			@Pc(55) Class1_Sub1_Sub1_Sub4[] local55 = new Class1_Sub1_Sub1_Sub4[] { local36, local44 };
			local36 = new Class1_Sub1_Sub1_Sub4(local55, 2);
		}
		if (this.aShortArray7 != null) {
			for (@Pc(66) int local66 = 0; local66 < this.aShortArray7.length; local66++) {
				local36.method1415(this.aShortArray7[local66], this.aShortArray6[local66]);
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(BZ)Z")
	public boolean method1325(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt2032;
		@Pc(17) int local17 = this.anInt2004;
		@Pc(20) int local20 = this.anInt2033;
		if (arg0) {
			local6 = this.anInt2020;
			local17 = this.anInt2038;
			local20 = this.anInt2015;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(39) boolean local39 = true;
		if (!Static20.aClass35_5.method1561(0, local6)) {
			local39 = false;
		}
		if (local17 != -1 && !Static20.aClass35_5.method1561(0, local17)) {
			local39 = false;
		}
		if (local20 != -1 && !Static20.aClass35_5.method1561(0, local20)) {
			local39 = false;
		}
		return local39;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)Lclient!mb;")
	public Class1_Sub1_Sub8 method1326(@OriginalArg(0) int arg0) {
		if (this.anIntArray231 != null && arg0 > 1) {
			@Pc(23) int local23 = -1;
			for (@Pc(25) int local25 = 0; local25 < 10; local25++) {
				if (this.anIntArray230[local25] <= arg0 && this.anIntArray230[local25] != 0) {
					local23 = this.anIntArray231[local25];
				}
			}
			if (local23 != -1) {
				return Static74.method1334(local23);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLclient!mb;Lclient!mb;)V")
	public void method1328(@OriginalArg(1) Class1_Sub1_Sub8 arg0, @OriginalArg(2) Class1_Sub1_Sub8 arg1) {
		this.anInt2005 = arg1.anInt2005;
		this.aClass34_1002 = arg0.aClass34_1002;
		this.anInt2001 = arg1.anInt2001;
		this.anInt2035 = arg1.anInt2035;
		this.anInt2012 = 1;
		this.anInt2036 = arg1.anInt2036;
		this.anInt2011 = arg0.anInt2011;
		this.aShortArray6 = arg1.aShortArray6;
		this.anInt2002 = arg1.anInt2002;
		this.anInt2010 = arg1.anInt2010;
		this.aBoolean107 = arg0.aBoolean107;
		this.anInt2034 = arg1.anInt2034;
		this.aShortArray7 = arg1.aShortArray7;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)Z")
	public boolean method1329(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt2031;
		@Pc(17) int local17 = this.anInt1998;
		if (arg0) {
			local6 = this.anInt2013;
			local17 = this.anInt2000;
		}
		if (local17 == -1) {
			return true;
		}
		@Pc(32) boolean local32 = true;
		if (!Static20.aClass35_5.method1561(0, local17)) {
			local32 = false;
		}
		if (local6 != -1 && !Static20.aClass35_5.method1561(0, local6)) {
			local32 = false;
		}
		return local32;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZLclient!of;)V")
	public void method1330(@OriginalArg(1) Class1_Sub19 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2072();
			if (local5 == 0) {
				return;
			}
			this.method1323(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)Lclient!nf;")
	public Class1_Sub1_Sub1_Sub4 method1331(@OriginalArg(1) int arg0) {
		@Pc(17) int local17;
		if (this.anIntArray231 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (local17 = 0; local17 < 10; local17++) {
				if (arg0 >= this.anIntArray230[local17] && this.anIntArray230[local17] != 0) {
					local15 = this.anIntArray231[local17];
				}
			}
			if (local15 != -1) {
				return Static74.method1334(local15).method1331(1);
			}
		}
		@Pc(62) Class1_Sub1_Sub1_Sub4 local62 = Static83.method1412(Static20.aClass35_5, this.anInt2034);
		if (local62 == null) {
			return null;
		}
		if (this.anInt2006 != 128 || this.anInt2027 != 128 || this.anInt2039 != 128) {
			local62.method1427(this.anInt2006, this.anInt2027, this.anInt2039);
		}
		if (this.aShortArray7 != null) {
			for (local17 = 0; local17 < this.aShortArray7.length; local17++) {
				local62.method1415(this.aShortArray7[local17], this.aShortArray6[local17]);
			}
		}
		return local62;
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V")
	public void method1332() {
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)Lclient!ka;")
	public Class1_Sub1_Sub1_Sub2 method1333(@OriginalArg(1) int arg0) {
		if (this.anIntArray231 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (arg0 >= this.anIntArray230[local15] && this.anIntArray230[local15] != 0) {
					local13 = this.anIntArray231[local15];
				}
			}
			if (local13 != -1) {
				return Static74.method1334(local13).method1333(1);
			}
		}
		@Pc(64) Class1_Sub1_Sub1_Sub2 local64 = (Class1_Sub1_Sub1_Sub2) Static76.aClass63_13.method1663((long) this.anInt1999);
		if (local64 != null) {
			return local64;
		}
		@Pc(74) Class1_Sub1_Sub1_Sub4 local74 = Static83.method1412(Static20.aClass35_5, this.anInt2034);
		if (local74 == null) {
			return null;
		}
		if (this.anInt2006 != 128 || this.anInt2027 != 128 || this.anInt2039 != 128) {
			local74.method1427(this.anInt2006, this.anInt2027, this.anInt2039);
		}
		if (this.aShortArray7 != null) {
			for (@Pc(114) int local114 = 0; local114 < this.aShortArray7.length; local114++) {
				local74.method1415(this.aShortArray7[local114], this.aShortArray6[local114]);
			}
		}
		local64 = local74.method1410(this.anInt2009 + 64, this.anInt2014 + 768, -50, -10, -50);
		local64.aBoolean92 = true;
		Static76.aClass63_13.method1659(local64, (long) this.anInt1999);
		return local64;
	}
}
