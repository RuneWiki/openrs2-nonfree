import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class5_Sub1_Sub17 extends Class5_Sub1 {

	@OriginalMember(owner = "client!wa", name = "Q", descriptor = "[I")
	public int[] anIntArray287;

	@OriginalMember(owner = "client!wa", name = "T", descriptor = "I")
	private int anInt2867;

	@OriginalMember(owner = "client!wa", name = "nb", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!wa", name = "tb", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!wa", name = "Eb", descriptor = "[I")
	public int[] anIntArray288;

	@OriginalMember(owner = "client!wa", name = "Qb", descriptor = "I")
	public int anInt2906;

	@OriginalMember(owner = "client!wa", name = "O", descriptor = "I")
	private int anInt2863 = 128;

	@OriginalMember(owner = "client!wa", name = "lb", descriptor = "I")
	public int anInt2881 = 0;

	@OriginalMember(owner = "client!wa", name = "gb", descriptor = "I")
	public int anInt2877 = 0;

	@OriginalMember(owner = "client!wa", name = "bb", descriptor = "I")
	public int anInt2872 = 0;

	@OriginalMember(owner = "client!wa", name = "cb", descriptor = "I")
	public int anInt2873 = 0;

	@OriginalMember(owner = "client!wa", name = "P", descriptor = "I")
	private int anInt2864 = -1;

	@OriginalMember(owner = "client!wa", name = "ab", descriptor = "[Lclient!vc;")
	public Class71[] aClass71Array17 = new Class71[] { null, null, Static100.aClass71_1166, null, null };

	@OriginalMember(owner = "client!wa", name = "Cb", descriptor = "I")
	private int anInt2894 = 0;

	@OriginalMember(owner = "client!wa", name = "sb", descriptor = "I")
	private int anInt2886 = 0;

	@OriginalMember(owner = "client!wa", name = "pb", descriptor = "I")
	private int anInt2884 = -1;

	@OriginalMember(owner = "client!wa", name = "zb", descriptor = "I")
	private int anInt2891 = -1;

	@OriginalMember(owner = "client!wa", name = "jb", descriptor = "I")
	public int anInt2880 = 1;

	@OriginalMember(owner = "client!wa", name = "db", descriptor = "I")
	private int anInt2874 = 128;

	@OriginalMember(owner = "client!wa", name = "hb", descriptor = "I")
	private int anInt2878 = -1;

	@OriginalMember(owner = "client!wa", name = "fb", descriptor = "I")
	private int anInt2876 = 128;

	@OriginalMember(owner = "client!wa", name = "qb", descriptor = "[Lclient!vc;")
	public Class71[] aClass71Array18 = new Class71[] { null, null, null, null, Static66.aClass71_818 };

	@OriginalMember(owner = "client!wa", name = "S", descriptor = "I")
	private int anInt2866 = -1;

	@OriginalMember(owner = "client!wa", name = "Y", descriptor = "I")
	public int anInt2870 = 0;

	@OriginalMember(owner = "client!wa", name = "xb", descriptor = "I")
	private int anInt2889 = -1;

	@OriginalMember(owner = "client!wa", name = "Ob", descriptor = "I")
	public int anInt2905 = -1;

	@OriginalMember(owner = "client!wa", name = "Z", descriptor = "I")
	public int anInt2871 = 0;

	@OriginalMember(owner = "client!wa", name = "Rb", descriptor = "Lclient!vc;")
	public Class71 aClass71_1359 = Static78.aClass71_525;

	@OriginalMember(owner = "client!wa", name = "Sb", descriptor = "I")
	private int anInt2907 = -1;

	@OriginalMember(owner = "client!wa", name = "Pb", descriptor = "Z")
	public boolean aBoolean127 = false;

	@OriginalMember(owner = "client!wa", name = "R", descriptor = "I")
	public int anInt2865 = 0;

	@OriginalMember(owner = "client!wa", name = "Jb", descriptor = "I")
	private int anInt2900 = -1;

	@OriginalMember(owner = "client!wa", name = "W", descriptor = "I")
	private int anInt2869 = -1;

	@OriginalMember(owner = "client!wa", name = "Hb", descriptor = "I")
	public int anInt2898 = 2000;

	@OriginalMember(owner = "client!wa", name = "yb", descriptor = "I")
	private int anInt2890 = -1;

	@OriginalMember(owner = "client!wa", name = "Db", descriptor = "I")
	public int anInt2895 = -1;

	@OriginalMember(owner = "client!wa", name = "Tb", descriptor = "I")
	public int anInt2908 = 0;

	@OriginalMember(owner = "client!wa", name = "Vb", descriptor = "I")
	public int anInt2909 = 0;

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)Lclient!wd;")
	public Class5_Sub1_Sub1_Sub7 method1920(@OriginalArg(1) int arg0) {
		@Pc(15) int local15;
		if (this.anIntArray288 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (local15 = 0; local15 < 10; local15++) {
				if (arg0 >= this.anIntArray287[local15] && this.anIntArray287[local15] != 0) {
					local13 = this.anIntArray288[local15];
				}
			}
			if (local13 != -1) {
				return Static33.method691(local13).method1920(1);
			}
		}
		@Pc(56) Class5_Sub1_Sub1_Sub7 local56 = Static120.method1985(Static85.aClass24_16, this.anInt2867);
		if (local56 == null) {
			return null;
		}
		if (this.anInt2876 != 128 || this.anInt2874 != 128 || this.anInt2863 != 128) {
			local56.method1982(this.anInt2876, this.anInt2874, this.anInt2863);
		}
		if (this.aShortArray11 != null) {
			for (local15 = 0; local15 < this.aShortArray11.length; local15++) {
				local56.method1988(this.aShortArray11[local15], this.aShortArray12[local15]);
			}
		}
		return local56;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BZ)Lclient!wd;")
	public Class5_Sub1_Sub1_Sub7 method1921(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt2866;
		@Pc(11) int local11 = this.anInt2907;
		if (arg0) {
			local11 = this.anInt2864;
			local8 = this.anInt2891;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(38) Class5_Sub1_Sub1_Sub7 local38 = Static120.method1985(Static85.aClass24_16, local8);
		if (local11 != -1) {
			@Pc(46) Class5_Sub1_Sub1_Sub7 local46 = Static120.method1985(Static85.aClass24_16, local11);
			@Pc(57) Class5_Sub1_Sub1_Sub7[] local57 = new Class5_Sub1_Sub1_Sub7[] { local38, local46 };
			local38 = new Class5_Sub1_Sub1_Sub7(local57, 2);
		}
		if (this.aShortArray11 != null) {
			for (@Pc(68) int local68 = 0; local68 < this.aShortArray11.length; local68++) {
				local38.method1988(this.aShortArray11[local68], this.aShortArray12[local68]);
			}
		}
		return local38;
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(II)Lclient!bf;")
	public Class5_Sub1_Sub1_Sub2 method1922(@OriginalArg(1) int arg0) {
		if (this.anIntArray288 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
				if (arg0 >= this.anIntArray287[local17] && this.anIntArray287[local17] != 0) {
					local15 = this.anIntArray288[local17];
				}
			}
			if (local15 != -1) {
				return Static33.method691(local15).method1922(1);
			}
		}
		@Pc(57) Class5_Sub1_Sub1_Sub2 local57 = (Class5_Sub1_Sub1_Sub2) Static56.aClass54_25.method1397((long) this.anInt2906);
		if (local57 != null) {
			return local57;
		}
		@Pc(75) Class5_Sub1_Sub1_Sub7 local75 = Static120.method1985(Static85.aClass24_16, this.anInt2867);
		if (local75 == null) {
			return null;
		}
		if (this.anInt2876 != 128 || this.anInt2874 != 128 || this.anInt2863 != 128) {
			local75.method1982(this.anInt2876, this.anInt2874, this.anInt2863);
		}
		if (this.aShortArray11 != null) {
			for (@Pc(106) int local106 = 0; local106 < this.aShortArray11.length; local106++) {
				local75.method1988(this.aShortArray11[local106], this.aShortArray12[local106]);
			}
		}
		local57 = local75.method1987(this.anInt2872 + 64, this.anInt2877 + 768, -50, -10, -50);
		local57.aBoolean8 = true;
		Static56.aClass54_25.method1399(local57, (long) this.anInt2906);
		return local57;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZZ)Lclient!wd;")
	public Class5_Sub1_Sub1_Sub7 method1925(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt2869;
		@Pc(11) int local11 = this.anInt2900;
		@Pc(14) int local14 = this.anInt2884;
		if (arg0) {
			local8 = this.anInt2890;
			local14 = this.anInt2889;
			local11 = this.anInt2878;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(40) Class5_Sub1_Sub1_Sub7 local40 = Static120.method1985(Static85.aClass24_16, local8);
		if (local11 != -1) {
			@Pc(49) Class5_Sub1_Sub1_Sub7 local49 = Static120.method1985(Static85.aClass24_16, local11);
			if (local14 == -1) {
				@Pc(63) Class5_Sub1_Sub1_Sub7[] local63 = new Class5_Sub1_Sub1_Sub7[] { local40, local49 };
				local40 = new Class5_Sub1_Sub1_Sub7(local63, 2);
			} else {
				@Pc(76) Class5_Sub1_Sub1_Sub7 local76 = Static120.method1985(Static85.aClass24_16, local14);
				@Pc(91) Class5_Sub1_Sub1_Sub7[] local91 = new Class5_Sub1_Sub1_Sub7[] { local40, local49, local76 };
				local40 = new Class5_Sub1_Sub1_Sub7(local91, 3);
			}
		}
		if (!arg0 && this.anInt2886 != 0) {
			local40.method1994(0, this.anInt2886, 0);
		}
		if (arg0 && this.anInt2894 != 0) {
			local40.method1994(0, this.anInt2894, 0);
		}
		if (this.aShortArray11 != null) {
			for (@Pc(127) int local127 = 0; local127 < this.aShortArray11.length; local127++) {
				local40.method1988(this.aShortArray11[local127], this.aShortArray12[local127]);
			}
		}
		return local40;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!wa;ILclient!wa;)V")
	public void method1926(@OriginalArg(0) Class5_Sub1_Sub17 arg0, @OriginalArg(2) Class5_Sub1_Sub17 arg1) {
		this.aShortArray12 = arg0.aShortArray12;
		this.aBoolean127 = arg1.aBoolean127;
		this.anInt2865 = arg0.anInt2865;
		this.anInt2867 = arg0.anInt2867;
		this.anInt2870 = 1;
		this.aClass71_1359 = arg1.aClass71_1359;
		this.anInt2881 = arg0.anInt2881;
		this.aShortArray11 = arg0.aShortArray11;
		this.anInt2880 = arg1.anInt2880;
		this.anInt2909 = arg0.anInt2909;
		this.anInt2873 = arg0.anInt2873;
		this.anInt2871 = arg0.anInt2871;
		this.anInt2898 = arg0.anInt2898;
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(B)V")
	public void method1928() {
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!qe;B)V")
	public void method1929(@OriginalArg(0) Class5_Sub11 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1546();
			if (local13 == 0) {
				return;
			}
			this.method1935(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(ZI)Z")
	public boolean method1930(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt2866;
		@Pc(9) int local9 = this.anInt2907;
		if (arg0) {
			local9 = this.anInt2864;
			local6 = this.anInt2891;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(30) boolean local30 = true;
		if (!Static85.aClass24_16.method656(local6, 0)) {
			local30 = false;
		}
		if (local9 != -1 && !Static85.aClass24_16.method656(local9, 0)) {
			local30 = false;
		}
		return local30;
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(II)Lclient!wa;")
	public Class5_Sub1_Sub17 method1931(@OriginalArg(1) int arg0) {
		if (this.anIntArray288 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
				if (this.anIntArray287[local17] <= arg0 && this.anIntArray287[local17] != 0) {
					local15 = this.anIntArray288[local17];
				}
			}
			if (local15 != -1) {
				return Static33.method691(local15);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)Z")
	public boolean method1933(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt2869;
		@Pc(9) int local9 = this.anInt2900;
		@Pc(12) int local12 = this.anInt2884;
		if (arg0) {
			local12 = this.anInt2889;
			local9 = this.anInt2878;
			local6 = this.anInt2890;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(30) boolean local30 = true;
		if (!Static85.aClass24_16.method656(local6, 0)) {
			local30 = false;
		}
		if (local9 != -1 && !Static85.aClass24_16.method656(local9, 0)) {
			local30 = false;
		}
		if (local12 != -1 && !Static85.aClass24_16.method656(local12, 0)) {
			local30 = false;
		}
		return local30;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IILclient!qe;)V")
	private void method1935(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt2867 = arg1.method1543();
		} else if (arg0 == 2) {
			this.aClass71_1359 = arg1.method1541();
		} else if (arg0 == 4) {
			this.anInt2898 = arg1.method1543();
		} else if (arg0 == 5) {
			this.anInt2871 = arg1.method1543();
		} else if (arg0 == 6) {
			this.anInt2909 = arg1.method1543();
		} else if (arg0 == 7) {
			this.anInt2865 = arg1.method1543();
			if (this.anInt2865 > 32767) {
				this.anInt2865 -= 65536;
			}
		} else if (arg0 == 8) {
			this.anInt2881 = arg1.method1543();
			if (this.anInt2881 > 32767) {
				this.anInt2881 -= 65536;
			}
		} else if (arg0 == 11) {
			this.anInt2870 = 1;
		} else if (arg0 == 12) {
			this.anInt2880 = arg1.method1540();
		} else if (arg0 == 16) {
			this.aBoolean127 = true;
		} else if (arg0 == 23) {
			this.anInt2869 = arg1.method1543();
			this.anInt2886 = arg1.method1546();
		} else if (arg0 == 24) {
			this.anInt2900 = arg1.method1543();
		} else if (arg0 == 25) {
			this.anInt2890 = arg1.method1543();
			this.anInt2894 = arg1.method1546();
		} else if (arg0 == 26) {
			this.anInt2878 = arg1.method1543();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass71Array17[arg0 - 30] = arg1.method1541();
			if (this.aClass71Array17[arg0 - 30].method1785(Static23.aClass71_420)) {
				this.aClass71Array17[arg0 - 30] = null;
			}
		} else if (arg0 >= 35 && arg0 < 40) {
			this.aClass71Array18[arg0 - 35] = arg1.method1541();
		} else if (arg0 == 40) {
			@Pc(203) int local203 = arg1.method1546();
			this.aShortArray12 = new short[local203];
			this.aShortArray11 = new short[local203];
			for (@Pc(213) int local213 = 0; local213 < local203; local213++) {
				this.aShortArray11[local213] = (short) arg1.method1543();
				this.aShortArray12[local213] = (short) arg1.method1543();
			}
		} else if (arg0 == 78) {
			this.anInt2884 = arg1.method1543();
		} else if (arg0 == 79) {
			this.anInt2889 = arg1.method1543();
		} else if (arg0 == 90) {
			this.anInt2866 = arg1.method1543();
		} else if (arg0 == 91) {
			this.anInt2891 = arg1.method1543();
		} else if (arg0 == 92) {
			this.anInt2907 = arg1.method1543();
		} else if (arg0 == 93) {
			this.anInt2864 = arg1.method1543();
		} else if (arg0 == 95) {
			this.anInt2873 = arg1.method1543();
		} else if (arg0 == 97) {
			this.anInt2895 = arg1.method1543();
		} else if (arg0 == 98) {
			this.anInt2905 = arg1.method1543();
		} else if (arg0 >= 100 && arg0 < 110) {
			if (this.anIntArray288 == null) {
				this.anIntArray287 = new int[10];
				this.anIntArray288 = new int[10];
			}
			this.anIntArray288[arg0 - 100] = arg1.method1543();
			this.anIntArray287[arg0 - 100] = arg1.method1543();
		} else if (arg0 == 110) {
			this.anInt2876 = arg1.method1543();
		} else if (arg0 == 111) {
			this.anInt2874 = arg1.method1543();
		} else if (arg0 == 112) {
			this.anInt2863 = arg1.method1543();
		} else if (arg0 == 113) {
			this.anInt2872 = arg1.method1524();
		} else if (arg0 == 114) {
			this.anInt2877 = arg1.method1524() * 5;
		} else if (arg0 == 115) {
			this.anInt2908 = arg1.method1546();
		}
	}
}
