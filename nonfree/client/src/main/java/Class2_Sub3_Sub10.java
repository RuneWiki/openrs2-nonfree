import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class2_Sub3_Sub10 extends Class2_Sub3 {

	@OriginalMember(owner = "client!kc", name = "A", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!kc", name = "P", descriptor = "I")
	public int anInt2012;

	@OriginalMember(owner = "client!kc", name = "bb", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!kc", name = "db", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!kc", name = "hb", descriptor = "I")
	private int anInt2026;

	@OriginalMember(owner = "client!kc", name = "kb", descriptor = "[I")
	public int[] anIntArray147;

	@OriginalMember(owner = "client!kc", name = "Ab", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!kc", name = "Bb", descriptor = "[I")
	public int[] anIntArray148;

	@OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
	private int anInt1999 = -1;

	@OriginalMember(owner = "client!kc", name = "I", descriptor = "I")
	public int anInt2007 = 0;

	@OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
	private int anInt2009 = 0;

	@OriginalMember(owner = "client!kc", name = "O", descriptor = "I")
	private int anInt2011 = 128;

	@OriginalMember(owner = "client!kc", name = "F", descriptor = "I")
	public int anInt2004 = 0;

	@OriginalMember(owner = "client!kc", name = "E", descriptor = "I")
	private int anInt2003 = 0;

	@OriginalMember(owner = "client!kc", name = "C", descriptor = "I")
	private int anInt2001 = -1;

	@OriginalMember(owner = "client!kc", name = "M", descriptor = "Z")
	public boolean aBoolean78 = false;

	@OriginalMember(owner = "client!kc", name = "R", descriptor = "I")
	private int anInt2014 = 128;

	@OriginalMember(owner = "client!kc", name = "V", descriptor = "Z")
	public boolean aBoolean79 = false;

	@OriginalMember(owner = "client!kc", name = "S", descriptor = "I")
	private int anInt2015 = 128;

	@OriginalMember(owner = "client!kc", name = "D", descriptor = "I")
	private int anInt2002 = -1;

	@OriginalMember(owner = "client!kc", name = "W", descriptor = "I")
	private int anInt2018 = -1;

	@OriginalMember(owner = "client!kc", name = "eb", descriptor = "I")
	public int anInt2023 = 0;

	@OriginalMember(owner = "client!kc", name = "B", descriptor = "I")
	public int anInt2000 = 0;

	@OriginalMember(owner = "client!kc", name = "nb", descriptor = "I")
	public int anInt2031 = 0;

	@OriginalMember(owner = "client!kc", name = "ob", descriptor = "I")
	private int anInt2032 = -1;

	@OriginalMember(owner = "client!kc", name = "X", descriptor = "I")
	private int anInt2019 = -1;

	@OriginalMember(owner = "client!kc", name = "T", descriptor = "I")
	public int anInt2016 = 1;

	@OriginalMember(owner = "client!kc", name = "mb", descriptor = "I")
	private int anInt2030 = 0;

	@OriginalMember(owner = "client!kc", name = "ab", descriptor = "Lclient!ai;")
	public Class6 aClass6_612 = Static30.aClass6_210;

	@OriginalMember(owner = "client!kc", name = "sb", descriptor = "I")
	private int anInt2036 = -1;

	@OriginalMember(owner = "client!kc", name = "ub", descriptor = "[Lclient!ai;")
	public Class6[] aClass6Array11 = new Class6[] { null, null, Static158.aClass6_1067, null, null };

	@OriginalMember(owner = "client!kc", name = "tb", descriptor = "I")
	private int anInt2037 = -1;

	@OriginalMember(owner = "client!kc", name = "rb", descriptor = "I")
	public int anInt2035 = 0;

	@OriginalMember(owner = "client!kc", name = "L", descriptor = "I")
	public int anInt2010 = 2000;

	@OriginalMember(owner = "client!kc", name = "vb", descriptor = "I")
	private int anInt2038 = -1;

	@OriginalMember(owner = "client!kc", name = "zb", descriptor = "I")
	private int anInt2041 = -1;

	@OriginalMember(owner = "client!kc", name = "N", descriptor = "[Lclient!ai;")
	public Class6[] aClass6Array10 = new Class6[] { null, null, null, null, Static110.aClass6_752 };

	@OriginalMember(owner = "client!kc", name = "pb", descriptor = "I")
	public int anInt2033 = -1;

	@OriginalMember(owner = "client!kc", name = "ib", descriptor = "I")
	public int anInt2027 = 0;

	@OriginalMember(owner = "client!kc", name = "xb", descriptor = "I")
	public int anInt2040 = -1;

	@OriginalMember(owner = "client!kc", name = "qb", descriptor = "I")
	private int anInt2034 = 0;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)Z")
	public boolean method1314(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt2036;
		@Pc(9) int local9 = this.anInt2041;
		if (arg0) {
			local9 = this.anInt2002;
			local6 = this.anInt2018;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(32) boolean local32 = true;
		if (!Static106.aClass10_145.method1596(0, local6)) {
			local32 = false;
		}
		if (local9 != -1 && !Static106.aClass10_145.method1596(0, local9)) {
			local32 = false;
		}
		return local32;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(IZ)Lclient!kc;")
	public Class2_Sub3_Sub10 method1315(@OriginalArg(0) int arg0) {
		if (this.anIntArray148 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (this.anIntArray147[local15] <= arg0 && this.anIntArray147[local15] != 0) {
					local13 = this.anIntArray148[local15];
				}
			}
			if (local13 != -1) {
				return Static92.method1502(local13);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)Lclient!sd;")
	public Class2_Sub3_Sub5_Sub7_Sub1 method1317() {
		@Pc(7) Class2_Sub3_Sub5_Sub3 local7 = Static99.method1637(Static106.aClass10_145, this.anInt2026);
		if (local7 == null) {
			return null;
		}
		@Pc(20) int local20;
		if (this.aShortArray12 != null) {
			for (local20 = 0; local20 < this.aShortArray12.length; local20++) {
				local7.method1644(this.aShortArray12[local20], this.aShortArray11[local20]);
			}
		}
		if (this.aShortArray14 != null) {
			for (local20 = 0; local20 < this.aShortArray14.length; local20++) {
				local7.method1648(this.aShortArray14[local20], this.aShortArray13[local20]);
			}
		}
		@Pc(79) Class2_Sub3_Sub5_Sub7_Sub1 local79 = local7.method1627(this.anInt2003 + 64, this.anInt2034 + 768);
		local79.aBoolean142 = true;
		if (this.anInt2011 != 128 || this.anInt2014 != 128 || this.anInt2015 != 128) {
			local79.method2309(this.anInt2011, this.anInt2014, this.anInt2015);
		}
		return local79;
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(B)V")
	public void method1319() {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!me;)V")
	public void method1321(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1402();
			if (local9 == 0) {
				return;
			}
			this.method1323(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILclient!ic;I)Lclient!sa;")
	public Class2_Sub3_Sub5_Sub7 method1322(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3_Sub8 arg1, @OriginalArg(3) int arg2) {
		if (this.anIntArray148 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
				if (this.anIntArray147[local17] <= arg0 && this.anIntArray147[local17] != 0) {
					local15 = this.anIntArray148[local17];
				}
			}
			if (local15 != -1) {
				return Static92.method1502(local15).method1322(1, arg1, arg2);
			}
		}
		@Pc(64) Class2_Sub3_Sub5_Sub7 local64 = (Class2_Sub3_Sub5_Sub7) Static162.aClass17_25.method505((long) this.anInt2012);
		if (local64 == null) {
			@Pc(72) Class2_Sub3_Sub5_Sub3 local72 = Static99.method1637(Static106.aClass10_145, this.anInt2026);
			if (local72 == null) {
				return null;
			}
			@Pc(81) int local81;
			if (this.aShortArray12 != null) {
				for (local81 = 0; local81 < this.aShortArray12.length; local81++) {
					local72.method1644(this.aShortArray12[local81], this.aShortArray11[local81]);
				}
			}
			if (this.aShortArray14 != null) {
				for (local81 = 0; local81 < this.aShortArray14.length; local81++) {
					local72.method1648(this.aShortArray14[local81], this.aShortArray13[local81]);
				}
			}
			local64 = local72.method1642(this.anInt2003 + 64, this.anInt2034 + 768, -50, -10, -50, false);
			if (this.anInt2011 != 128 || this.anInt2014 != 128 || this.anInt2015 != 128) {
				local64.method2309(this.anInt2011, this.anInt2014, this.anInt2015);
			}
			Static162.aClass17_25.method508((long) this.anInt2012, local64);
		}
		if (arg1 != null) {
			local64 = arg1.method1074(local64, arg2);
		}
		return local64;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!me;II)V")
	private void method1323(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2026 = arg0.method1397();
		} else if (arg1 == 2) {
			this.aClass6_612 = arg0.method1399();
		} else if (arg1 == 4) {
			this.anInt2010 = arg0.method1397();
		} else if (arg1 == 5) {
			this.anInt2035 = arg0.method1397();
		} else if (arg1 == 6) {
			this.anInt2023 = arg0.method1397();
		} else if (arg1 == 7) {
			this.anInt2007 = arg0.method1397();
			if (this.anInt2007 > 32767) {
				this.anInt2007 -= 65536;
			}
		} else if (arg1 == 8) {
			this.anInt2004 = arg0.method1397();
			if (this.anInt2004 > 32767) {
				this.anInt2004 -= 65536;
			}
		} else if (arg1 == 11) {
			this.anInt2000 = 1;
		} else if (arg1 == 12) {
			this.anInt2016 = arg0.method1396();
		} else if (arg1 == 16) {
			this.aBoolean79 = true;
		} else if (arg1 == 23) {
			this.anInt2032 = arg0.method1397();
			this.anInt2009 = arg0.method1402();
		} else if (arg1 == 24) {
			this.anInt2038 = arg0.method1397();
		} else if (arg1 == 25) {
			this.anInt2001 = arg0.method1397();
			this.anInt2030 = arg0.method1402();
		} else if (arg1 == 26) {
			this.anInt2037 = arg0.method1397();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass6Array11[arg1 - 30] = arg0.method1399();
			if (this.aClass6Array11[arg1 - 30].method137(Static140.aClass6_953)) {
				this.aClass6Array11[arg1 - 30] = null;
			}
		} else if (arg1 >= 35 && arg1 < 40) {
			this.aClass6Array10[arg1 - 35] = arg0.method1399();
		} else {
			@Pc(397) int local397;
			@Pc(407) int local407;
			if (arg1 == 40) {
				local397 = arg0.method1402();
				this.aShortArray12 = new short[local397];
				this.aShortArray11 = new short[local397];
				for (local407 = 0; local407 < local397; local407++) {
					this.aShortArray12[local407] = (short) arg0.method1397();
					this.aShortArray11[local407] = (short) arg0.method1397();
				}
			} else if (arg1 == 41) {
				local397 = arg0.method1402();
				this.aShortArray14 = new short[local397];
				this.aShortArray13 = new short[local397];
				for (local407 = 0; local407 < local397; local407++) {
					this.aShortArray14[local407] = (short) arg0.method1397();
					this.aShortArray13[local407] = (short) arg0.method1397();
				}
			} else if (arg1 == 65) {
				this.aBoolean78 = true;
			} else if (arg1 == 78) {
				this.anInt1999 = arg0.method1397();
			} else if (arg1 == 79) {
				this.anInt2019 = arg0.method1397();
			} else if (arg1 == 90) {
				this.anInt2036 = arg0.method1397();
			} else if (arg1 == 91) {
				this.anInt2018 = arg0.method1397();
			} else if (arg1 == 92) {
				this.anInt2041 = arg0.method1397();
			} else if (arg1 == 93) {
				this.anInt2002 = arg0.method1397();
			} else if (arg1 == 95) {
				this.anInt2031 = arg0.method1397();
			} else if (arg1 == 97) {
				this.anInt2033 = arg0.method1397();
			} else if (arg1 == 98) {
				this.anInt2040 = arg0.method1397();
			} else if (arg1 >= 100 && arg1 < 110) {
				if (this.anIntArray148 == null) {
					this.anIntArray147 = new int[10];
					this.anIntArray148 = new int[10];
				}
				this.anIntArray148[arg1 - 100] = arg0.method1397();
				this.anIntArray147[arg1 - 100] = arg0.method1397();
			} else if (arg1 == 110) {
				this.anInt2011 = arg0.method1397();
			} else if (arg1 == 111) {
				this.anInt2014 = arg0.method1397();
			} else if (arg1 == 112) {
				this.anInt2015 = arg0.method1397();
			} else if (arg1 == 113) {
				this.anInt2003 = arg0.method1394();
			} else if (arg1 == 114) {
				this.anInt2034 = arg0.method1394() * 5;
			} else if (arg1 == 115) {
				this.anInt2027 = arg0.method1402();
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZB)Lclient!mc;")
	public Class2_Sub3_Sub5_Sub3 method1324(@OriginalArg(0) boolean arg0) {
		@Pc(4) int local4 = this.anInt2032;
		@Pc(7) int local7 = this.anInt2038;
		@Pc(14) int local14 = this.anInt1999;
		if (arg0) {
			local7 = this.anInt2037;
			local4 = this.anInt2001;
			local14 = this.anInt2019;
		}
		if (local4 == -1) {
			return null;
		}
		@Pc(35) Class2_Sub3_Sub5_Sub3 local35 = Static99.method1637(Static106.aClass10_145, local4);
		if (local7 != -1) {
			@Pc(43) Class2_Sub3_Sub5_Sub3 local43 = Static99.method1637(Static106.aClass10_145, local7);
			if (local14 == -1) {
				@Pc(57) Class2_Sub3_Sub5_Sub3[] local57 = new Class2_Sub3_Sub5_Sub3[] { local35, local43 };
				local35 = new Class2_Sub3_Sub5_Sub3(local57, 2);
			} else {
				@Pc(70) Class2_Sub3_Sub5_Sub3 local70 = Static99.method1637(Static106.aClass10_145, local14);
				@Pc(85) Class2_Sub3_Sub5_Sub3[] local85 = new Class2_Sub3_Sub5_Sub3[] { local35, local43, local70 };
				local35 = new Class2_Sub3_Sub5_Sub3(local85, 3);
			}
		}
		if (!arg0 && this.anInt2009 != 0) {
			local35.method1639(0, this.anInt2009, 0);
		}
		if (arg0 && this.anInt2030 != 0) {
			local35.method1639(0, this.anInt2030, 0);
		}
		@Pc(129) int local129;
		if (this.aShortArray12 != null) {
			for (local129 = 0; local129 < this.aShortArray12.length; local129++) {
				local35.method1644(this.aShortArray12[local129], this.aShortArray11[local129]);
			}
		}
		if (this.aShortArray14 != null) {
			for (local129 = 0; local129 < this.aShortArray14.length; local129++) {
				local35.method1648(this.aShortArray14[local129], this.aShortArray13[local129]);
			}
		}
		return local35;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!kc;ILclient!kc;)V")
	public void method1325(@OriginalArg(0) Class2_Sub3_Sub10 arg0, @OriginalArg(2) Class2_Sub3_Sub10 arg1) {
		this.anInt2010 = arg1.anInt2010;
		this.aShortArray12 = arg1.aShortArray12;
		this.anInt2000 = 1;
		this.anInt2026 = arg1.anInt2026;
		this.anInt2035 = arg1.anInt2035;
		this.aBoolean79 = arg0.aBoolean79;
		this.anInt2016 = arg0.anInt2016;
		this.aShortArray13 = arg1.aShortArray13;
		this.anInt2023 = arg1.anInt2023;
		this.anInt2031 = arg1.anInt2031;
		this.aShortArray11 = arg1.aShortArray11;
		this.aClass6_612 = arg0.aClass6_612;
		this.anInt2004 = arg1.anInt2004;
		this.aShortArray14 = arg1.aShortArray14;
		this.anInt2007 = arg1.anInt2007;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BZ)Z")
	public boolean method1326(@OriginalArg(1) boolean arg0) {
		@Pc(2) int local2 = this.anInt2032;
		@Pc(9) int local9 = this.anInt2038;
		@Pc(12) int local12 = this.anInt1999;
		if (arg0) {
			local9 = this.anInt2037;
			local2 = this.anInt2001;
			local12 = this.anInt2019;
		}
		if (local2 == -1) {
			return true;
		}
		@Pc(36) boolean local36 = true;
		if (!Static106.aClass10_145.method1596(0, local2)) {
			local36 = false;
		}
		if (local9 != -1 && !Static106.aClass10_145.method1596(0, local9)) {
			local36 = false;
		}
		if (local12 != -1 && !Static106.aClass10_145.method1596(0, local12)) {
			local36 = false;
		}
		return local36;
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(IZ)Lclient!mc;")
	public Class2_Sub3_Sub5_Sub3 method1327(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt2041;
		@Pc(11) int local11 = this.anInt2036;
		if (arg0) {
			local11 = this.anInt2018;
			local8 = this.anInt2002;
		}
		if (local11 == -1) {
			return null;
		}
		@Pc(29) Class2_Sub3_Sub5_Sub3 local29 = Static99.method1637(Static106.aClass10_145, local11);
		if (local8 != -1) {
			@Pc(44) Class2_Sub3_Sub5_Sub3 local44 = Static99.method1637(Static106.aClass10_145, local8);
			@Pc(55) Class2_Sub3_Sub5_Sub3[] local55 = new Class2_Sub3_Sub5_Sub3[] { local29, local44 };
			local29 = new Class2_Sub3_Sub5_Sub3(local55, 2);
		}
		@Pc(66) int local66;
		if (this.aShortArray12 != null) {
			for (local66 = 0; local66 < this.aShortArray12.length; local66++) {
				local29.method1644(this.aShortArray12[local66], this.aShortArray11[local66]);
			}
		}
		if (this.aShortArray14 != null) {
			for (local66 = 0; local66 < this.aShortArray14.length; local66++) {
				local29.method1648(this.aShortArray14[local66], this.aShortArray13[local66]);
			}
		}
		return local29;
	}
}
