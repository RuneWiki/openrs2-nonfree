import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class4_Sub4_Sub11 extends Class4_Sub4 {

	@OriginalMember(owner = "client!of", name = "P", descriptor = "I")
	public int anInt2001;

	@OriginalMember(owner = "client!of", name = "Q", descriptor = "[I")
	private int[] anIntArray200;

	@OriginalMember(owner = "client!of", name = "S", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!of", name = "ib", descriptor = "[I")
	public int[] anIntArray201;

	@OriginalMember(owner = "client!of", name = "vb", descriptor = "[I")
	private int[] anIntArray202;

	@OriginalMember(owner = "client!of", name = "wb", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!of", name = "L", descriptor = "I")
	private int anInt1999 = 128;

	@OriginalMember(owner = "client!of", name = "X", descriptor = "I")
	public int anInt2006 = -1;

	@OriginalMember(owner = "client!of", name = "J", descriptor = "I")
	public int anInt1997 = -1;

	@OriginalMember(owner = "client!of", name = "K", descriptor = "I")
	public int anInt1998 = -1;

	@OriginalMember(owner = "client!of", name = "bb", descriptor = "I")
	public int anInt2008 = 1;

	@OriginalMember(owner = "client!of", name = "T", descriptor = "I")
	public int anInt2003 = -1;

	@OriginalMember(owner = "client!of", name = "Z", descriptor = "Z")
	public boolean aBoolean83 = true;

	@OriginalMember(owner = "client!of", name = "U", descriptor = "I")
	private int anInt2004 = 0;

	@OriginalMember(owner = "client!of", name = "Y", descriptor = "I")
	public int anInt2007 = -1;

	@OriginalMember(owner = "client!of", name = "cb", descriptor = "I")
	public int anInt2009 = -1;

	@OriginalMember(owner = "client!of", name = "M", descriptor = "Z")
	public boolean aBoolean82 = true;

	@OriginalMember(owner = "client!of", name = "jb", descriptor = "Z")
	public boolean aBoolean84 = false;

	@OriginalMember(owner = "client!of", name = "V", descriptor = "Lclient!qc;")
	public Class60 aClass60_830 = Static120.aClass60_786;

	@OriginalMember(owner = "client!of", name = "fb", descriptor = "I")
	public int anInt2011 = -1;

	@OriginalMember(owner = "client!of", name = "mb", descriptor = "I")
	private int anInt2015 = -1;

	@OriginalMember(owner = "client!of", name = "R", descriptor = "I")
	private int anInt2002 = 128;

	@OriginalMember(owner = "client!of", name = "kb", descriptor = "Z")
	public boolean aBoolean85 = true;

	@OriginalMember(owner = "client!of", name = "lb", descriptor = "I")
	public int anInt2014 = -1;

	@OriginalMember(owner = "client!of", name = "rb", descriptor = "[Lclient!qc;")
	public final Class60[] aClass60Array16 = new Class60[5];

	@OriginalMember(owner = "client!of", name = "xb", descriptor = "I")
	private int anInt2020 = -1;

	@OriginalMember(owner = "client!of", name = "gb", descriptor = "I")
	public int anInt2012 = -1;

	@OriginalMember(owner = "client!of", name = "Bb", descriptor = "I")
	public int anInt2024 = 32;

	@OriginalMember(owner = "client!of", name = "zb", descriptor = "I")
	private int anInt2022 = 0;

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)Lclient!u;")
	public Class4_Sub4_Sub1_Sub7 method1484() {
		if (this.anIntArray201 != null) {
			@Pc(12) Class4_Sub4_Sub11 local12 = this.method1494();
			return local12 == null ? null : local12.method1484();
		} else if (this.anIntArray202 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray202.length; local29++) {
				if (!Static22.aClass40_19.method1120(this.anIntArray202[local29], 0)) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(61) Class4_Sub4_Sub1_Sub7[] local61 = new Class4_Sub4_Sub1_Sub7[this.anIntArray202.length];
			for (@Pc(63) int local63 = 0; local63 < this.anIntArray202.length; local63++) {
				local61[local63] = Static118.method2001(Static22.aClass40_19, this.anIntArray202[local63]);
			}
			@Pc(91) Class4_Sub4_Sub1_Sub7 local91;
			if (local61.length == 1) {
				local91 = local61[0];
			} else {
				local91 = new Class4_Sub4_Sub1_Sub7(local61, local61.length);
			}
			if (this.aShortArray9 != null) {
				for (@Pc(105) int local105 = 0; local105 < this.aShortArray9.length; local105++) {
					local91.method1998(this.aShortArray9[local105], this.aShortArray10[local105]);
				}
			}
			return local91;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!re;I)V")
	public void method1487(@OriginalArg(0) Class4_Sub13 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method1223();
			if (local7 == 0) {
				return;
			}
			this.method1489(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "(B)V")
	public void method1488() {
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IILclient!re;)V")
	private void method1489(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub13 arg1) {
		@Pc(79) int local79;
		@Pc(89) int local89;
		if (arg0 == 1) {
			local79 = arg1.method1223();
			this.anIntArray200 = new int[local79];
			for (local89 = 0; local89 < local79; local89++) {
				this.anIntArray200[local89] = arg1.method1244();
			}
		} else if (arg0 == 2) {
			this.aClass60_830 = arg1.method1249();
		} else if (arg0 == 12) {
			this.anInt2008 = arg1.method1223();
		} else if (arg0 == 13) {
			this.anInt2009 = arg1.method1244();
		} else if (arg0 == 14) {
			this.anInt2014 = arg1.method1244();
		} else if (arg0 == 15) {
			this.anInt2007 = arg1.method1244();
		} else if (arg0 == 16) {
			this.anInt2011 = arg1.method1244();
		} else if (arg0 == 17) {
			this.anInt2014 = arg1.method1244();
			this.anInt1998 = arg1.method1244();
			this.anInt2006 = arg1.method1244();
			this.anInt2012 = arg1.method1244();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass60Array16[arg0 - 30] = arg1.method1249();
			if (this.aClass60Array16[arg0 - 30].method1661(Static95.aClass60_924)) {
				this.aClass60Array16[arg0 - 30] = null;
				return;
			}
		} else if (arg0 == 40) {
			local79 = arg1.method1223();
			this.aShortArray9 = new short[local79];
			this.aShortArray10 = new short[local79];
			for (local89 = 0; local89 < local79; local89++) {
				this.aShortArray9[local89] = (short) arg1.method1244();
				this.aShortArray10[local89] = (short) arg1.method1244();
			}
			return;
		} else if (arg0 == 60) {
			local79 = arg1.method1223();
			this.anIntArray202 = new int[local79];
			for (local89 = 0; local89 < local79; local89++) {
				this.anIntArray202[local89] = arg1.method1244();
			}
			return;
		} else if (arg0 == 93) {
			this.aBoolean83 = false;
			return;
		} else if (arg0 == 95) {
			this.anInt2003 = arg1.method1244();
			return;
		} else if (arg0 == 97) {
			this.anInt1999 = arg1.method1244();
			return;
		} else if (arg0 == 98) {
			this.anInt2002 = arg1.method1244();
			return;
		} else if (arg0 == 99) {
			this.aBoolean84 = true;
			return;
		} else if (arg0 == 100) {
			this.anInt2022 = arg1.method1224();
			return;
		} else if (arg0 == 101) {
			this.anInt2004 = arg1.method1224() * 5;
			return;
		} else if (arg0 == 102) {
			this.anInt1997 = arg1.method1244();
			return;
		} else if (arg0 == 103) {
			this.anInt2024 = arg1.method1244();
			return;
		} else if (arg0 == 106) {
			this.anInt2015 = arg1.method1244();
			if (this.anInt2015 == 65535) {
				this.anInt2015 = -1;
			}
			this.anInt2020 = arg1.method1244();
			if (this.anInt2020 == 65535) {
				this.anInt2020 = -1;
			}
			local79 = arg1.method1223();
			this.anIntArray201 = new int[local79 + 1];
			for (local89 = 0; local89 <= local79; local89++) {
				this.anIntArray201[local89] = arg1.method1244();
				if (this.anIntArray201[local89] == 65535) {
					this.anIntArray201[local89] = -1;
				}
			}
			return;
		} else {
			if (arg0 == 107) {
				this.aBoolean82 = false;
			} else if (arg0 == 109) {
				this.aBoolean85 = false;
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "(I)Z")
	public boolean method1491() {
		if (this.anIntArray201 == null) {
			return true;
		}
		@Pc(15) int local15 = -1;
		if (this.anInt2015 != -1) {
			local15 = Static121.method2046(this.anInt2015);
		} else if (this.anInt2020 != -1) {
			local15 = Static62.anIntArray168[this.anInt2020];
		}
		return local15 >= 0 && this.anIntArray201.length > local15 && this.anIntArray201[local15] != -1;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IILclient!t;ILclient!t;)Lclient!rb;")
	public Class4_Sub4_Sub1_Sub6 method1493(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub4_Sub14 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4_Sub4_Sub14 arg3) {
		if (this.anIntArray201 != null) {
			@Pc(12) Class4_Sub4_Sub11 local12 = this.method1494();
			return local12 == null ? null : local12.method1493(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class4_Sub4_Sub1_Sub6 local32 = (Class4_Sub4_Sub1_Sub6) Static56.aClass48_35.method1390((long) this.anInt2001);
		if (local32 == null) {
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < this.anIntArray200.length; local38++) {
				if (!Static22.aClass40_19.method1120(this.anIntArray200[local38], 0)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(68) Class4_Sub4_Sub1_Sub7[] local68 = new Class4_Sub4_Sub1_Sub7[this.anIntArray200.length];
			for (@Pc(70) int local70 = 0; local70 < this.anIntArray200.length; local70++) {
				local68[local70] = Static118.method2001(Static22.aClass40_19, this.anIntArray200[local70]);
			}
			@Pc(101) Class4_Sub4_Sub1_Sub7 local101;
			if (local68.length == 1) {
				local101 = local68[0];
			} else {
				local101 = new Class4_Sub4_Sub1_Sub7(local68, local68.length);
			}
			if (this.aShortArray9 != null) {
				for (@Pc(112) int local112 = 0; local112 < this.aShortArray9.length; local112++) {
					local101.method1998(this.aShortArray9[local112], this.aShortArray10[local112]);
				}
			}
			local32 = local101.method2003(this.anInt2022 + 64, this.anInt2004 + 850, -30, -50, -30);
			Static56.aClass48_35.method1392(local32, (long) this.anInt2001);
		}
		@Pc(170) Class4_Sub4_Sub1_Sub6 local170;
		if (arg1 != null && arg3 != null) {
			local170 = arg1.method1915(arg0, local32, arg2, arg3);
		} else if (arg1 != null) {
			local170 = arg1.method1917(local32, arg0);
		} else if (arg3 == null) {
			local170 = local32.method1798(true);
		} else {
			local170 = arg3.method1917(local32, arg2);
		}
		if (this.anInt1999 != 128 || this.anInt2002 != 128) {
			local170.method1793(this.anInt1999, this.anInt2002, this.anInt1999);
		}
		return local170;
	}

	@OriginalMember(owner = "client!of", name = "g", descriptor = "(B)Lclient!of;")
	public Class4_Sub4_Sub11 method1494() {
		@Pc(9) int local9 = -1;
		if (this.anInt2015 != -1) {
			local9 = Static121.method2046(this.anInt2015);
		} else if (this.anInt2020 != -1) {
			local9 = Static62.anIntArray168[this.anInt2020];
		}
		return local9 < 0 || this.anIntArray201.length <= local9 || this.anIntArray201[local9] == -1 ? null : Static122.method2060(this.anIntArray201[local9]);
	}
}
