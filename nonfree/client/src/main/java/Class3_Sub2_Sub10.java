import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class3_Sub2_Sub10 extends Class3_Sub2 {

	@OriginalMember(owner = "client!i", name = "J", descriptor = "I")
	private int anInt1859;

	@OriginalMember(owner = "client!i", name = "W", descriptor = "I")
	public int anInt1869;

	@OriginalMember(owner = "client!i", name = "Z", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!i", name = "bb", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!i", name = "ub", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!i", name = "wb", descriptor = "[I")
	public int[] anIntArray321;

	@OriginalMember(owner = "client!i", name = "Bb", descriptor = "[I")
	public int[] anIntArray322;

	@OriginalMember(owner = "client!i", name = "Db", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!i", name = "fb", descriptor = "I")
	private int anInt1874 = -1;

	@OriginalMember(owner = "client!i", name = "M", descriptor = "I")
	private int anInt1861 = 0;

	@OriginalMember(owner = "client!i", name = "T", descriptor = "I")
	private int anInt1866 = -1;

	@OriginalMember(owner = "client!i", name = "eb", descriptor = "I")
	public int anInt1873 = 0;

	@OriginalMember(owner = "client!i", name = "hb", descriptor = "Z")
	public boolean aBoolean103 = false;

	@OriginalMember(owner = "client!i", name = "U", descriptor = "I")
	public int anInt1867 = 0;

	@OriginalMember(owner = "client!i", name = "S", descriptor = "I")
	private int anInt1865 = -1;

	@OriginalMember(owner = "client!i", name = "rb", descriptor = "I")
	public int anInt1884 = 0;

	@OriginalMember(owner = "client!i", name = "V", descriptor = "I")
	public int anInt1868 = -1;

	@OriginalMember(owner = "client!i", name = "ab", descriptor = "I")
	private int anInt1871 = 128;

	@OriginalMember(owner = "client!i", name = "lb", descriptor = "I")
	private int anInt1878 = 0;

	@OriginalMember(owner = "client!i", name = "gb", descriptor = "I")
	public int anInt1875 = 1;

	@OriginalMember(owner = "client!i", name = "jb", descriptor = "[Lclient!eh;")
	public Class28[] aClass28Array10 = new Class28[] { null, null, Static5.aClass28_44, null, null };

	@OriginalMember(owner = "client!i", name = "qb", descriptor = "I")
	private int anInt1883 = 0;

	@OriginalMember(owner = "client!i", name = "Q", descriptor = "I")
	private int anInt1863 = -1;

	@OriginalMember(owner = "client!i", name = "vb", descriptor = "I")
	private int anInt1886 = 128;

	@OriginalMember(owner = "client!i", name = "mb", descriptor = "I")
	public int anInt1879 = 0;

	@OriginalMember(owner = "client!i", name = "zb", descriptor = "I")
	private int anInt1889 = 0;

	@OriginalMember(owner = "client!i", name = "O", descriptor = "Lclient!eh;")
	public Class28 aClass28_566 = Static134.aClass28_1121;

	@OriginalMember(owner = "client!i", name = "Hb", descriptor = "I")
	public int anInt1895 = 0;

	@OriginalMember(owner = "client!i", name = "pb", descriptor = "I")
	private int anInt1882 = -1;

	@OriginalMember(owner = "client!i", name = "Eb", descriptor = "I")
	public int anInt1892 = -1;

	@OriginalMember(owner = "client!i", name = "yb", descriptor = "I")
	public int anInt1888 = 0;

	@OriginalMember(owner = "client!i", name = "xb", descriptor = "I")
	public int anInt1887 = -1;

	@OriginalMember(owner = "client!i", name = "Mb", descriptor = "Z")
	public boolean aBoolean104 = false;

	@OriginalMember(owner = "client!i", name = "Gb", descriptor = "I")
	private int anInt1894 = -1;

	@OriginalMember(owner = "client!i", name = "nb", descriptor = "I")
	public int anInt1880 = 2000;

	@OriginalMember(owner = "client!i", name = "sb", descriptor = "[Lclient!eh;")
	public Class28[] aClass28Array11 = new Class28[] { null, null, null, null, Static139.aClass28_1236 };

	@OriginalMember(owner = "client!i", name = "Qb", descriptor = "I")
	private int anInt1902 = -1;

	@OriginalMember(owner = "client!i", name = "Ab", descriptor = "I")
	public int anInt1890 = -1;

	@OriginalMember(owner = "client!i", name = "Kb", descriptor = "I")
	private int anInt1897 = -1;

	@OriginalMember(owner = "client!i", name = "Ob", descriptor = "I")
	private int anInt1900 = 128;

	@OriginalMember(owner = "client!i", name = "Jb", descriptor = "I")
	public int anInt1896 = 0;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!ca;II)Lclient!d;")
	public Class3_Sub2_Sub1_Sub1 method1453(@OriginalArg(1) Class3_Sub2_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.anIntArray322 != null && arg2 > 1) {
			@Pc(11) int local11 = -1;
			for (@Pc(13) int local13 = 0; local13 < 10; local13++) {
				if (arg2 >= this.anIntArray321[local13] && this.anIntArray321[local13] != 0) {
					local11 = this.anIntArray322[local13];
				}
			}
			if (local11 != -1) {
				return Static76.method1736(local11).method1453(arg0, arg1, 1);
			}
		}
		@Pc(58) Class3_Sub2_Sub1_Sub1 local58 = (Class3_Sub2_Sub1_Sub1) Static83.aClass63_15.method2337((long) this.anInt1869);
		if (local58 == null) {
			@Pc(74) Class3_Sub2_Sub1_Sub4 local74 = Static89.method2044(Static38.aClass7_21, this.anInt1859);
			if (local74 == null) {
				return null;
			}
			@Pc(83) int local83;
			if (this.aShortArray21 != null) {
				for (local83 = 0; local83 < this.aShortArray21.length; local83++) {
					local74.method2029(this.aShortArray21[local83], this.aShortArray22[local83]);
				}
			}
			if (this.aShortArray23 != null) {
				for (local83 = 0; local83 < this.aShortArray23.length; local83++) {
					local74.method2032(this.aShortArray23[local83], this.aShortArray20[local83]);
				}
			}
			local58 = local74.method2041(this.anInt1861 + 64, this.anInt1883 + 768, -50, -10, -50, false);
			if (this.anInt1886 != 128 || this.anInt1900 != 128 || this.anInt1871 != 128) {
				local58.method203(this.anInt1886, this.anInt1900, this.anInt1871);
			}
			Static83.aClass63_15.method2338((long) this.anInt1869, local58);
		}
		if (arg0 != null) {
			local58 = arg0.method570(arg1, local58);
		}
		return local58;
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(Z)V")
	public void method1454() {
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B)Lclient!af;")
	public Class3_Sub2_Sub1_Sub1_Sub1 method1455() {
		@Pc(14) Class3_Sub2_Sub1_Sub4 local14 = Static89.method2044(Static38.aClass7_21, this.anInt1859);
		if (local14 == null) {
			return null;
		}
		@Pc(23) int local23;
		if (this.aShortArray21 != null) {
			for (local23 = 0; local23 < this.aShortArray21.length; local23++) {
				local14.method2029(this.aShortArray21[local23], this.aShortArray22[local23]);
			}
		}
		if (this.aShortArray23 != null) {
			for (local23 = 0; local23 < this.aShortArray23.length; local23++) {
				local14.method2032(this.aShortArray23[local23], this.aShortArray20[local23]);
			}
		}
		@Pc(84) Class3_Sub2_Sub1_Sub1_Sub1 local84 = local14.method2031(this.anInt1861 + 64, this.anInt1883 + 768);
		local84.aBoolean13 = true;
		if (this.anInt1886 != 128 || this.anInt1900 != 128 || this.anInt1871 != 128) {
			local84.method203(this.anInt1886, this.anInt1900, this.anInt1871);
		}
		return local84;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ZZ)Z")
	public boolean method1456(@OriginalArg(0) boolean arg0) {
		@Pc(11) int local11 = this.anInt1865;
		@Pc(14) int local14 = this.anInt1902;
		if (arg0) {
			local11 = this.anInt1882;
			local14 = this.anInt1897;
		}
		if (local11 == -1) {
			return true;
		}
		@Pc(30) boolean local30 = true;
		if (!Static38.aClass7_21.method1014(0, local11)) {
			local30 = false;
		}
		if (local14 != -1 && !Static38.aClass7_21.method1014(0, local14)) {
			local30 = false;
		}
		return local30;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!hd;Z)V")
	public void method1458(@OriginalArg(0) Class3_Sub8 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1545();
			if (local14 == 0) {
				return;
			}
			this.method1465(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BZ)Lclient!lc;")
	public Class3_Sub2_Sub1_Sub4 method1460(@OriginalArg(1) boolean arg0) {
		@Pc(2) int local2 = this.anInt1868;
		@Pc(9) int local9 = this.anInt1866;
		@Pc(12) int local12 = this.anInt1894;
		if (arg0) {
			local9 = this.anInt1874;
			local12 = this.anInt1863;
			local2 = this.anInt1892;
		}
		if (local2 == -1) {
			return null;
		}
		@Pc(33) Class3_Sub2_Sub1_Sub4 local33 = Static89.method2044(Static38.aClass7_21, local2);
		if (local12 != -1) {
			@Pc(42) Class3_Sub2_Sub1_Sub4 local42 = Static89.method2044(Static38.aClass7_21, local12);
			if (local9 == -1) {
				@Pc(83) Class3_Sub2_Sub1_Sub4[] local83 = new Class3_Sub2_Sub1_Sub4[] { local33, local42 };
				local33 = new Class3_Sub2_Sub1_Sub4(local83, 2);
			} else {
				@Pc(50) Class3_Sub2_Sub1_Sub4 local50 = Static89.method2044(Static38.aClass7_21, local9);
				@Pc(65) Class3_Sub2_Sub1_Sub4[] local65 = new Class3_Sub2_Sub1_Sub4[] { local33, local42, local50 };
				local33 = new Class3_Sub2_Sub1_Sub4(local65, 3);
			}
		}
		if (!arg0 && this.anInt1889 != 0) {
			local33.method2038(0, this.anInt1889, 0);
		}
		if (arg0 && this.anInt1878 != 0) {
			local33.method2038(0, this.anInt1878, 0);
		}
		@Pc(124) int local124;
		if (this.aShortArray21 != null) {
			for (local124 = 0; local124 < this.aShortArray21.length; local124++) {
				local33.method2029(this.aShortArray21[local124], this.aShortArray22[local124]);
			}
		}
		if (this.aShortArray23 != null) {
			for (local124 = 0; local124 < this.aShortArray23.length; local124++) {
				local33.method2032(this.aShortArray23[local124], this.aShortArray20[local124]);
			}
		}
		return local33;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IZ)Lclient!lc;")
	public Class3_Sub2_Sub1_Sub4 method1461(@OriginalArg(1) boolean arg0) {
		@Pc(12) int local12 = this.anInt1902;
		@Pc(15) int local15 = this.anInt1865;
		if (arg0) {
			local12 = this.anInt1897;
			local15 = this.anInt1882;
		}
		if (local15 == -1) {
			return null;
		}
		@Pc(34) Class3_Sub2_Sub1_Sub4 local34 = Static89.method2044(Static38.aClass7_21, local15);
		if (local12 != -1) {
			@Pc(42) Class3_Sub2_Sub1_Sub4 local42 = Static89.method2044(Static38.aClass7_21, local12);
			@Pc(53) Class3_Sub2_Sub1_Sub4[] local53 = new Class3_Sub2_Sub1_Sub4[] { local34, local42 };
			local34 = new Class3_Sub2_Sub1_Sub4(local53, 2);
		}
		@Pc(64) int local64;
		if (this.aShortArray21 != null) {
			for (local64 = 0; local64 < this.aShortArray21.length; local64++) {
				local34.method2029(this.aShortArray21[local64], this.aShortArray22[local64]);
			}
		}
		if (this.aShortArray23 != null) {
			for (local64 = 0; local64 < this.aShortArray23.length; local64++) {
				local34.method2032(this.aShortArray23[local64], this.aShortArray20[local64]);
			}
		}
		return local34;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!i;BLclient!i;)V")
	public void method1462(@OriginalArg(0) Class3_Sub2_Sub10 arg0, @OriginalArg(2) Class3_Sub2_Sub10 arg1) {
		this.aShortArray21 = arg1.aShortArray21;
		this.anInt1896 = 1;
		this.anInt1873 = arg1.anInt1873;
		this.aShortArray20 = arg1.aShortArray20;
		this.anInt1880 = arg1.anInt1880;
		this.aClass28_566 = arg0.aClass28_566;
		this.anInt1884 = arg1.anInt1884;
		this.aShortArray22 = arg1.aShortArray22;
		this.anInt1859 = arg1.anInt1859;
		this.anInt1895 = arg1.anInt1895;
		this.anInt1879 = arg1.anInt1879;
		this.anInt1875 = arg0.anInt1875;
		this.anInt1867 = arg1.anInt1867;
		this.aShortArray23 = arg1.aShortArray23;
		this.aBoolean103 = arg0.aBoolean103;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IBLclient!hd;)V")
	private void method1465(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt1859 = arg1.method1510();
		} else if (arg0 == 2) {
			this.aClass28_566 = arg1.method1516();
		} else if (arg0 == 4) {
			this.anInt1880 = arg1.method1510();
		} else if (arg0 == 5) {
			this.anInt1895 = arg1.method1510();
		} else if (arg0 == 6) {
			this.anInt1873 = arg1.method1510();
		} else if (arg0 == 7) {
			this.anInt1879 = arg1.method1510();
			if (this.anInt1879 > 32767) {
				this.anInt1879 -= 65536;
			}
		} else if (arg0 == 8) {
			this.anInt1867 = arg1.method1510();
			if (this.anInt1867 > 32767) {
				this.anInt1867 -= 65536;
			}
		} else if (arg0 == 11) {
			this.anInt1896 = 1;
		} else if (arg0 == 12) {
			this.anInt1875 = arg1.method1540();
		} else if (arg0 == 16) {
			this.aBoolean103 = true;
		} else if (arg0 == 23) {
			this.anInt1868 = arg1.method1510();
			this.anInt1889 = arg1.method1545();
		} else if (arg0 == 24) {
			this.anInt1894 = arg1.method1510();
		} else if (arg0 == 25) {
			this.anInt1892 = arg1.method1510();
			this.anInt1878 = arg1.method1545();
		} else if (arg0 == 26) {
			this.anInt1863 = arg1.method1510();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass28Array10[arg0 - 30] = arg1.method1516();
			if (this.aClass28Array10[arg0 - 30].method936(Static4.aClass28_39)) {
				this.aClass28Array10[arg0 - 30] = null;
			}
		} else if (arg0 >= 35 && arg0 < 40) {
			this.aClass28Array11[arg0 - 35] = arg1.method1516();
		} else {
			@Pc(157) int local157;
			@Pc(167) int local167;
			if (arg0 == 40) {
				local157 = arg1.method1545();
				this.aShortArray21 = new short[local157];
				this.aShortArray22 = new short[local157];
				for (local167 = 0; local167 < local157; local167++) {
					this.aShortArray21[local167] = (short) arg1.method1510();
					this.aShortArray22[local167] = (short) arg1.method1510();
				}
			} else if (arg0 == 41) {
				local157 = arg1.method1545();
				this.aShortArray20 = new short[local157];
				this.aShortArray23 = new short[local157];
				for (local167 = 0; local167 < local157; local167++) {
					this.aShortArray23[local167] = (short) arg1.method1510();
					this.aShortArray20[local167] = (short) arg1.method1510();
				}
			} else if (arg0 == 65) {
				this.aBoolean104 = true;
			} else if (arg0 == 78) {
				this.anInt1866 = arg1.method1510();
			} else if (arg0 == 79) {
				this.anInt1874 = arg1.method1510();
			} else if (arg0 == 90) {
				this.anInt1865 = arg1.method1510();
			} else if (arg0 == 91) {
				this.anInt1882 = arg1.method1510();
			} else if (arg0 == 92) {
				this.anInt1902 = arg1.method1510();
			} else if (arg0 == 93) {
				this.anInt1897 = arg1.method1510();
			} else if (arg0 == 95) {
				this.anInt1884 = arg1.method1510();
			} else if (arg0 == 97) {
				this.anInt1887 = arg1.method1510();
			} else if (arg0 == 98) {
				this.anInt1890 = arg1.method1510();
			} else if (arg0 >= 100 && arg0 < 110) {
				if (this.anIntArray322 == null) {
					this.anIntArray322 = new int[10];
					this.anIntArray321 = new int[10];
				}
				this.anIntArray322[arg0 - 100] = arg1.method1510();
				this.anIntArray321[arg0 - 100] = arg1.method1510();
			} else if (arg0 == 110) {
				this.anInt1886 = arg1.method1510();
			} else if (arg0 == 111) {
				this.anInt1900 = arg1.method1510();
			} else if (arg0 == 112) {
				this.anInt1871 = arg1.method1510();
			} else if (arg0 == 113) {
				this.anInt1861 = arg1.method1508();
			} else if (arg0 == 114) {
				this.anInt1883 = arg1.method1508() * 5;
			} else if (arg0 == 115) {
				this.anInt1888 = arg1.method1545();
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)Lclient!i;")
	public Class3_Sub2_Sub10 method1466(@OriginalArg(0) int arg0) {
		if (this.anIntArray322 != null && arg0 > 1) {
			@Pc(21) int local21 = -1;
			for (@Pc(23) int local23 = 0; local23 < 10; local23++) {
				if (this.anIntArray321[local23] <= arg0 && this.anIntArray321[local23] != 0) {
					local21 = this.anIntArray322[local23];
				}
			}
			if (local21 != -1) {
				return Static76.method1736(local21);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(BZ)Z")
	public boolean method1467(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt1868;
		@Pc(9) int local9 = this.anInt1894;
		@Pc(17) int local17 = this.anInt1866;
		if (arg0) {
			local6 = this.anInt1892;
			local9 = this.anInt1863;
			local17 = this.anInt1874;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(35) boolean local35 = true;
		if (!Static38.aClass7_21.method1014(0, local6)) {
			local35 = false;
		}
		if (local9 != -1 && !Static38.aClass7_21.method1014(0, local9)) {
			local35 = false;
		}
		if (local17 != -1 && !Static38.aClass7_21.method1014(0, local17)) {
			local35 = false;
		}
		return local35;
	}
}
