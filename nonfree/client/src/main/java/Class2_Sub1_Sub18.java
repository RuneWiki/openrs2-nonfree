import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class2_Sub1_Sub18 extends Class2_Sub1 {

	@OriginalMember(owner = "client!va", name = "hb", descriptor = "[I")
	private int[] anIntArray338;

	@OriginalMember(owner = "client!va", name = "ib", descriptor = "[I")
	private int[] anIntArray339;

	@OriginalMember(owner = "client!va", name = "lb", descriptor = "I")
	private int anInt2815;

	@OriginalMember(owner = "client!va", name = "mb", descriptor = "[I")
	public int[] anIntArray340;

	@OriginalMember(owner = "client!va", name = "Eb", descriptor = "I")
	public int anInt2828;

	@OriginalMember(owner = "client!va", name = "Gb", descriptor = "[I")
	public int[] anIntArray341;

	@OriginalMember(owner = "client!va", name = "W", descriptor = "I")
	public int anInt2804 = 1;

	@OriginalMember(owner = "client!va", name = "ab", descriptor = "I")
	private int anInt2808 = 0;

	@OriginalMember(owner = "client!va", name = "jb", descriptor = "I")
	public int anInt2813 = 0;

	@OriginalMember(owner = "client!va", name = "V", descriptor = "I")
	private int anInt2803 = 128;

	@OriginalMember(owner = "client!va", name = "fb", descriptor = "[Lclient!kc;")
	public Class36[] aClass36Array49 = new Class36[] { null, null, Static83.aClass36_989, null, null };

	@OriginalMember(owner = "client!va", name = "wb", descriptor = "I")
	public int anInt2822 = 0;

	@OriginalMember(owner = "client!va", name = "tb", descriptor = "I")
	private int anInt2819 = 128;

	@OriginalMember(owner = "client!va", name = "Cb", descriptor = "I")
	public int anInt2826 = 0;

	@OriginalMember(owner = "client!va", name = "Ib", descriptor = "I")
	public int anInt2831 = 0;

	@OriginalMember(owner = "client!va", name = "xb", descriptor = "I")
	public int anInt2823 = -1;

	@OriginalMember(owner = "client!va", name = "vb", descriptor = "I")
	private int anInt2821 = -1;

	@OriginalMember(owner = "client!va", name = "sb", descriptor = "I")
	private int anInt2818 = 0;

	@OriginalMember(owner = "client!va", name = "eb", descriptor = "I")
	private int anInt2811 = -1;

	@OriginalMember(owner = "client!va", name = "nb", descriptor = "I")
	private int anInt2816 = -1;

	@OriginalMember(owner = "client!va", name = "cb", descriptor = "I")
	private int anInt2809 = -1;

	@OriginalMember(owner = "client!va", name = "Kb", descriptor = "I")
	private int anInt2833 = -1;

	@OriginalMember(owner = "client!va", name = "rb", descriptor = "I")
	public int anInt2817 = 0;

	@OriginalMember(owner = "client!va", name = "Ab", descriptor = "[Lclient!kc;")
	public Class36[] aClass36Array50 = new Class36[] { null, null, null, null, Static88.aClass36_1076 };

	@OriginalMember(owner = "client!va", name = "Pb", descriptor = "Lclient!kc;")
	public Class36 aClass36_1397 = Static77.aClass36_944;

	@OriginalMember(owner = "client!va", name = "Fb", descriptor = "I")
	private int anInt2829 = 128;

	@OriginalMember(owner = "client!va", name = "Vb", descriptor = "I")
	public int anInt2838 = 2000;

	@OriginalMember(owner = "client!va", name = "Qb", descriptor = "I")
	public int anInt2837 = 0;

	@OriginalMember(owner = "client!va", name = "Mb", descriptor = "I")
	private int anInt2834 = -1;

	@OriginalMember(owner = "client!va", name = "zb", descriptor = "I")
	public int anInt2824 = 0;

	@OriginalMember(owner = "client!va", name = "Wb", descriptor = "Z")
	public boolean aBoolean132 = false;

	@OriginalMember(owner = "client!va", name = "Xb", descriptor = "I")
	private int anInt2839 = -1;

	@OriginalMember(owner = "client!va", name = "Nb", descriptor = "I")
	private int anInt2835 = -1;

	@OriginalMember(owner = "client!va", name = "ac", descriptor = "I")
	public int anInt2842 = 0;

	@OriginalMember(owner = "client!va", name = "Zb", descriptor = "I")
	private int anInt2841 = -1;

	@OriginalMember(owner = "client!va", name = "gb", descriptor = "I")
	private int anInt2812 = -1;

	@OriginalMember(owner = "client!va", name = "Ob", descriptor = "I")
	public int anInt2836 = -1;

	@OriginalMember(owner = "client!va", name = "cc", descriptor = "I")
	public int anInt2844 = 0;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(B)V")
	public void method1980() {
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZB)Lclient!fd;")
	public Class2_Sub1_Sub4_Sub1 method1981(@OriginalArg(0) boolean arg0) {
		@Pc(8) int local8 = this.anInt2841;
		@Pc(11) int local11 = this.anInt2812;
		if (arg0) {
			local8 = this.anInt2839;
			local11 = this.anInt2833;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(30) Class2_Sub1_Sub4_Sub1 local30 = Static30.method669(Static41.aClass3_6, local8);
		if (local11 != -1) {
			@Pc(46) Class2_Sub1_Sub4_Sub1 local46 = Static30.method669(Static41.aClass3_6, local11);
			@Pc(57) Class2_Sub1_Sub4_Sub1[] local57 = new Class2_Sub1_Sub4_Sub1[] { local30, local46 };
			local30 = new Class2_Sub1_Sub4_Sub1(local57, 2);
		}
		if (this.anIntArray339 != null) {
			for (@Pc(68) int local68 = 0; local68 < this.anIntArray339.length; local68++) {
				local30.method674(this.anIntArray339[local68], this.anIntArray338[local68]);
			}
		}
		return local30;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!wd;I)V")
	public void method1982(@OriginalArg(0) Class2_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1399();
			if (local5 == 0) {
				return;
			}
			this.method1990(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)Z")
	public boolean method1983(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt2841;
		@Pc(9) int local9 = this.anInt2812;
		if (arg0) {
			local6 = this.anInt2839;
			local9 = this.anInt2833;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(31) boolean local31 = true;
		if (!Static41.aClass3_6.method934(local6, 0)) {
			local31 = false;
		}
		if (local9 != -1 && !Static41.aClass3_6.method934(local9, 0)) {
			local31 = false;
		}
		return local31;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZII)Lclient!fd;")
	public Class2_Sub1_Sub4_Sub1 method1985(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15;
		if (this.anIntArray340 != null && arg1 > 1) {
			@Pc(13) int local13 = -1;
			for (local15 = 0; local15 < 10; local15++) {
				if (this.anIntArray341[local15] <= arg1 && this.anIntArray341[local15] != 0) {
					local13 = this.anIntArray340[local15];
				}
			}
			if (local13 != -1) {
				return Static43.method832(local13).method1985(arg0, 1);
			}
		}
		@Pc(63) Class2_Sub1_Sub4_Sub1 local63;
		if (arg0) {
			local63 = (Class2_Sub1_Sub4_Sub1) Static77.aClass22_26.method711((long) this.anInt2828);
			if (local63 != null) {
				return local63;
			}
		}
		local63 = Static30.method669(Static41.aClass3_6, this.anInt2815);
		if (local63 == null) {
			return null;
		}
		if (this.anInt2803 != 128 || this.anInt2829 != 128 || this.anInt2819 != 128) {
			local63.method665(this.anInt2803, this.anInt2829, this.anInt2819);
		}
		if (this.anIntArray339 != null) {
			for (local15 = 0; local15 < this.anIntArray339.length; local15++) {
				local63.method674(this.anIntArray339[local15], this.anIntArray338[local15]);
			}
		}
		if (arg0) {
			local63.method655(this.anInt2822 + 64, this.anInt2824 + 768, -50, -10, -50, true);
			local63.aBoolean45 = true;
			Static77.aClass22_26.method712(local63, (long) this.anInt2828);
		}
		return local63;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!va;ILclient!va;)V")
	public void method1986(@OriginalArg(0) Class2_Sub1_Sub18 arg0, @OriginalArg(2) Class2_Sub1_Sub18 arg1) {
		this.anInt2842 = arg0.anInt2842;
		this.anInt2804 = arg1.anInt2804;
		this.anIntArray338 = arg0.anIntArray338;
		this.anIntArray339 = arg0.anIntArray339;
		this.aClass36_1397 = arg1.aClass36_1397;
		this.aBoolean132 = arg1.aBoolean132;
		this.anInt2844 = arg0.anInt2844;
		this.anInt2837 = 1;
		this.anInt2815 = arg0.anInt2815;
		this.anInt2838 = arg0.anInt2838;
		this.anInt2813 = arg0.anInt2813;
		this.anInt2826 = arg0.anInt2826;
		this.anInt2831 = arg0.anInt2831;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BZ)Z")
	public boolean method1988(@OriginalArg(1) boolean arg0) {
		@Pc(2) int local2 = this.anInt2809;
		@Pc(9) int local9 = this.anInt2835;
		@Pc(12) int local12 = this.anInt2834;
		if (arg0) {
			local12 = this.anInt2811;
			local9 = this.anInt2816;
			local2 = this.anInt2821;
		}
		if (local2 == -1) {
			return true;
		}
		@Pc(36) boolean local36 = true;
		if (!Static41.aClass3_6.method934(local2, 0)) {
			local36 = false;
		}
		if (local12 != -1 && !Static41.aClass3_6.method934(local12, 0)) {
			local36 = false;
		}
		if (local9 != -1 && !Static41.aClass3_6.method934(local9, 0)) {
			local36 = false;
		}
		return local36;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)Lclient!va;")
	public Class2_Sub1_Sub18 method1989(@OriginalArg(0) int arg0) {
		if (this.anIntArray340 != null && arg0 > 1) {
			@Pc(18) int local18 = -1;
			for (@Pc(20) int local20 = 0; local20 < 10; local20++) {
				if (arg0 >= this.anIntArray341[local20] && this.anIntArray341[local20] != 0) {
					local18 = this.anIntArray340[local20];
				}
			}
			if (local18 != -1) {
				return Static43.method832(local18);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!wd;I)V")
	private void method1990(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt2815 = arg1.method1366();
		} else if (arg0 == 2) {
			this.aClass36_1397 = arg1.method1404();
		} else if (arg0 == 4) {
			this.anInt2838 = arg1.method1366();
		} else if (arg0 == 5) {
			this.anInt2813 = arg1.method1366();
		} else if (arg0 == 6) {
			this.anInt2826 = arg1.method1366();
		} else if (arg0 == 7) {
			this.anInt2842 = arg1.method1366();
			if (this.anInt2842 > 32767) {
				this.anInt2842 -= 65536;
			}
		} else if (arg0 == 8) {
			this.anInt2831 = arg1.method1366();
			if (this.anInt2831 > 32767) {
				this.anInt2831 -= 65536;
			}
		} else if (arg0 == 11) {
			this.anInt2837 = 1;
		} else if (arg0 == 12) {
			this.anInt2804 = arg1.method1412();
		} else if (arg0 == 16) {
			this.aBoolean132 = true;
		} else if (arg0 == 23) {
			this.anInt2809 = arg1.method1366();
			this.anInt2818 = arg1.method1399();
		} else if (arg0 == 24) {
			this.anInt2834 = arg1.method1366();
		} else if (arg0 == 25) {
			this.anInt2821 = arg1.method1366();
			this.anInt2808 = arg1.method1399();
		} else if (arg0 == 26) {
			this.anInt2811 = arg1.method1366();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass36Array49[arg0 - 30] = arg1.method1404();
			if (this.aClass36Array49[arg0 - 30].method1024(Static59.aClass36_761)) {
				this.aClass36Array49[arg0 - 30] = null;
			}
		} else if (arg0 >= 35 && arg0 < 40) {
			this.aClass36Array50[arg0 - 35] = arg1.method1404();
		} else if (arg0 == 40) {
			@Pc(399) int local399 = arg1.method1399();
			this.anIntArray338 = new int[local399];
			this.anIntArray339 = new int[local399];
			for (@Pc(409) int local409 = 0; local409 < local399; local409++) {
				this.anIntArray339[local409] = arg1.method1366();
				this.anIntArray338[local409] = arg1.method1366();
			}
		} else if (arg0 == 78) {
			this.anInt2835 = arg1.method1366();
		} else if (arg0 == 79) {
			this.anInt2816 = arg1.method1366();
		} else if (arg0 == 90) {
			this.anInt2841 = arg1.method1366();
		} else if (arg0 == 91) {
			this.anInt2839 = arg1.method1366();
		} else if (arg0 == 92) {
			this.anInt2812 = arg1.method1366();
		} else if (arg0 == 93) {
			this.anInt2833 = arg1.method1366();
		} else if (arg0 == 95) {
			this.anInt2844 = arg1.method1366();
		} else if (arg0 == 97) {
			this.anInt2836 = arg1.method1366();
		} else if (arg0 == 98) {
			this.anInt2823 = arg1.method1366();
		} else if (arg0 >= 100 && arg0 < 110) {
			if (this.anIntArray340 == null) {
				this.anIntArray341 = new int[10];
				this.anIntArray340 = new int[10];
			}
			this.anIntArray340[arg0 - 100] = arg1.method1366();
			this.anIntArray341[arg0 - 100] = arg1.method1366();
		} else if (arg0 == 110) {
			this.anInt2803 = arg1.method1366();
		} else if (arg0 == 111) {
			this.anInt2829 = arg1.method1366();
		} else if (arg0 == 112) {
			this.anInt2819 = arg1.method1366();
		} else if (arg0 == 113) {
			this.anInt2822 = arg1.method1406();
		} else if (arg0 == 114) {
			this.anInt2824 = arg1.method1406() * 5;
		} else if (arg0 == 115) {
			this.anInt2817 = arg1.method1399();
		}
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(ZI)Lclient!fd;")
	public Class2_Sub1_Sub4_Sub1 method1991(@OriginalArg(0) boolean arg0) {
		@Pc(8) int local8 = this.anInt2834;
		@Pc(11) int local11 = this.anInt2809;
		@Pc(14) int local14 = this.anInt2835;
		if (arg0) {
			local8 = this.anInt2811;
			local11 = this.anInt2821;
			local14 = this.anInt2816;
		}
		if (local11 == -1) {
			return null;
		}
		@Pc(37) Class2_Sub1_Sub4_Sub1 local37 = Static30.method669(Static41.aClass3_6, local11);
		if (local8 != -1) {
			@Pc(45) Class2_Sub1_Sub4_Sub1 local45 = Static30.method669(Static41.aClass3_6, local8);
			if (local14 == -1) {
				@Pc(87) Class2_Sub1_Sub4_Sub1[] local87 = new Class2_Sub1_Sub4_Sub1[] { local37, local45 };
				local37 = new Class2_Sub1_Sub4_Sub1(local87, 2);
			} else {
				@Pc(53) Class2_Sub1_Sub4_Sub1 local53 = Static30.method669(Static41.aClass3_6, local14);
				@Pc(68) Class2_Sub1_Sub4_Sub1[] local68 = new Class2_Sub1_Sub4_Sub1[] { local37, local45, local53 };
				local37 = new Class2_Sub1_Sub4_Sub1(local68, 3);
			}
		}
		if (!arg0 && this.anInt2818 != 0) {
			local37.method677(0, this.anInt2818, 0);
		}
		if (arg0 && this.anInt2808 != 0) {
			local37.method677(0, this.anInt2808, 0);
		}
		if (this.anIntArray339 != null) {
			for (@Pc(123) int local123 = 0; local123 < this.anIntArray339.length; local123++) {
				local37.method674(this.anIntArray339[local123], this.anIntArray338[local123]);
			}
		}
		return local37;
	}
}
