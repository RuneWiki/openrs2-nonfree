import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class1_Sub3_Sub16 extends Class1_Sub3 {

	@OriginalMember(owner = "client!tc", name = "eb", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!tc", name = "ib", descriptor = "I")
	public int anInt2855;

	@OriginalMember(owner = "client!tc", name = "nb", descriptor = "[I")
	public int[] anIntArray432;

	@OriginalMember(owner = "client!tc", name = "Eb", descriptor = "I")
	private int anInt2870;

	@OriginalMember(owner = "client!tc", name = "Gb", descriptor = "[I")
	public int[] anIntArray433;

	@OriginalMember(owner = "client!tc", name = "Lb", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!tc", name = "R", descriptor = "I")
	private int anInt2842 = -1;

	@OriginalMember(owner = "client!tc", name = "gb", descriptor = "[Lclient!af;")
	public Class5[] aClass5Array23 = new Class5[] { null, null, null, null, Static25.aClass5_355 };

	@OriginalMember(owner = "client!tc", name = "kb", descriptor = "I")
	public int anInt2856 = 0;

	@OriginalMember(owner = "client!tc", name = "X", descriptor = "[Lclient!af;")
	public Class5[] aClass5Array22 = new Class5[] { null, null, Static105.aClass5_1338, null, null };

	@OriginalMember(owner = "client!tc", name = "S", descriptor = "I")
	private int anInt2843 = 0;

	@OriginalMember(owner = "client!tc", name = "db", descriptor = "I")
	public int anInt2852 = 0;

	@OriginalMember(owner = "client!tc", name = "zb", descriptor = "I")
	public int anInt2866 = 0;

	@OriginalMember(owner = "client!tc", name = "T", descriptor = "I")
	private int anInt2844 = 0;

	@OriginalMember(owner = "client!tc", name = "ab", descriptor = "I")
	private int anInt2849 = 128;

	@OriginalMember(owner = "client!tc", name = "jb", descriptor = "Z")
	public boolean aBoolean114 = false;

	@OriginalMember(owner = "client!tc", name = "qb", descriptor = "I")
	private int anInt2859 = -1;

	@OriginalMember(owner = "client!tc", name = "rb", descriptor = "Lclient!af;")
	public Class5 aClass5_1323 = Static89.aClass5_1361;

	@OriginalMember(owner = "client!tc", name = "tb", descriptor = "I")
	public int anInt2861 = 0;

	@OriginalMember(owner = "client!tc", name = "ob", descriptor = "I")
	private int anInt2858 = -1;

	@OriginalMember(owner = "client!tc", name = "bb", descriptor = "I")
	private int anInt2850 = -1;

	@OriginalMember(owner = "client!tc", name = "mb", descriptor = "I")
	public int anInt2857 = 0;

	@OriginalMember(owner = "client!tc", name = "Ib", descriptor = "I")
	private int anInt2873 = 128;

	@OriginalMember(owner = "client!tc", name = "sb", descriptor = "I")
	public int anInt2860 = -1;

	@OriginalMember(owner = "client!tc", name = "Ob", descriptor = "I")
	private int anInt2878 = -1;

	@OriginalMember(owner = "client!tc", name = "Jb", descriptor = "I")
	public int anInt2874 = 0;

	@OriginalMember(owner = "client!tc", name = "Hb", descriptor = "I")
	public int anInt2872 = 0;

	@OriginalMember(owner = "client!tc", name = "cb", descriptor = "I")
	public int anInt2851 = 2000;

	@OriginalMember(owner = "client!tc", name = "Nb", descriptor = "I")
	private int anInt2877 = 128;

	@OriginalMember(owner = "client!tc", name = "Pb", descriptor = "I")
	private int anInt2879 = -1;

	@OriginalMember(owner = "client!tc", name = "Mb", descriptor = "I")
	public int anInt2876 = -1;

	@OriginalMember(owner = "client!tc", name = "Sb", descriptor = "I")
	public int anInt2881 = 0;

	@OriginalMember(owner = "client!tc", name = "hb", descriptor = "I")
	public int anInt2854 = 0;

	@OriginalMember(owner = "client!tc", name = "vb", descriptor = "I")
	private int anInt2863 = -1;

	@OriginalMember(owner = "client!tc", name = "yb", descriptor = "I")
	public int anInt2865 = 1;

	@OriginalMember(owner = "client!tc", name = "Tb", descriptor = "I")
	private int anInt2882 = -1;

	@OriginalMember(owner = "client!tc", name = "Xb", descriptor = "I")
	private int anInt2886 = -1;

	@OriginalMember(owner = "client!tc", name = "Bb", descriptor = "I")
	private int anInt2867 = -1;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZ)Z")
	public boolean method2019(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt2886;
		@Pc(9) int local9 = this.anInt2882;
		if (arg0) {
			local6 = this.anInt2858;
			local9 = this.anInt2879;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(24) boolean local24 = true;
		if (!Static108.aClass41_25.method1722(local6, 0)) {
			local24 = false;
		}
		if (local9 != -1 && !Static108.aClass41_25.method1722(local9, 0)) {
			local24 = false;
		}
		return local24;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)Lclient!eb;")
	public Class1_Sub3_Sub4_Sub4 method2021(@OriginalArg(1) int arg0) {
		if (this.anIntArray433 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (arg0 >= this.anIntArray432[local15] && this.anIntArray432[local15] != 0) {
					local13 = this.anIntArray433[local15];
				}
			}
			if (local13 != -1) {
				return Static56.method1022(local13).method2021(1);
			}
		}
		@Pc(62) Class1_Sub3_Sub4_Sub4 local62 = (Class1_Sub3_Sub4_Sub4) Static30.aClass28_23.method796((long) this.anInt2855);
		if (local62 != null) {
			return local62;
		}
		@Pc(77) Class1_Sub3_Sub4_Sub1 local77 = Static14.method357(Static108.aClass41_25, this.anInt2870);
		if (local77 == null) {
			return null;
		}
		if (this.anInt2873 != 128 || this.anInt2849 != 128 || this.anInt2877 != 128) {
			local77.method354(this.anInt2873, this.anInt2849, this.anInt2877);
		}
		if (this.aShortArray12 != null) {
			for (@Pc(106) int local106 = 0; local106 < this.aShortArray12.length; local106++) {
				local77.method347(this.aShortArray12[local106], this.aShortArray13[local106]);
			}
		}
		local62 = local77.method356(this.anInt2854 + 64, this.anInt2881 + 768, -50, -10, -50);
		local62.aBoolean28 = true;
		Static30.aClass28_23.method789(local62, (long) this.anInt2855);
		return local62;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!tc;ZLclient!tc;)V")
	public void method2022(@OriginalArg(0) Class1_Sub3_Sub16 arg0, @OriginalArg(2) Class1_Sub3_Sub16 arg1) {
		this.anInt2861 = arg0.anInt2861;
		this.anInt2870 = arg0.anInt2870;
		this.anInt2857 = 1;
		this.anInt2866 = arg0.anInt2866;
		this.aShortArray13 = arg0.aShortArray13;
		this.anInt2851 = arg0.anInt2851;
		this.anInt2852 = arg0.anInt2852;
		this.aBoolean114 = arg1.aBoolean114;
		this.aShortArray12 = arg0.aShortArray12;
		this.anInt2874 = arg0.anInt2874;
		this.anInt2872 = arg0.anInt2872;
		this.anInt2865 = arg1.anInt2865;
		this.aClass5_1323 = arg1.aClass5_1323;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(IZ)Z")
	public boolean method2024(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt2863;
		@Pc(17) int local17 = this.anInt2859;
		@Pc(20) int local20 = this.anInt2878;
		if (arg0) {
			local17 = this.anInt2842;
			local20 = this.anInt2867;
			local6 = this.anInt2850;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(38) boolean local38 = true;
		if (!Static108.aClass41_25.method1722(local6, 0)) {
			local38 = false;
		}
		if (local17 != -1 && !Static108.aClass41_25.method1722(local17, 0)) {
			local38 = false;
		}
		if (local20 != -1 && !Static108.aClass41_25.method1722(local20, 0)) {
			local38 = false;
		}
		return local38;
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(B)V")
	public void method2025() {
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(II)Lclient!c;")
	public Class1_Sub3_Sub4_Sub1 method2027(@OriginalArg(1) int arg0) {
		@Pc(17) int local17;
		if (this.anIntArray433 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (local17 = 0; local17 < 10; local17++) {
				if (this.anIntArray432[local17] <= arg0 && this.anIntArray432[local17] != 0) {
					local15 = this.anIntArray433[local17];
				}
			}
			if (local15 != -1) {
				return Static56.method1022(local15).method2027(1);
			}
		}
		@Pc(58) Class1_Sub3_Sub4_Sub1 local58 = Static14.method357(Static108.aClass41_25, this.anInt2870);
		if (local58 == null) {
			return null;
		}
		if (this.anInt2873 != 128 || this.anInt2849 != 128 || this.anInt2877 != 128) {
			local58.method354(this.anInt2873, this.anInt2849, this.anInt2877);
		}
		if (this.aShortArray12 != null) {
			for (local17 = 0; local17 < this.aShortArray12.length; local17++) {
				local58.method347(this.aShortArray12[local17], this.aShortArray13[local17]);
			}
		}
		return local58;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)Lclient!tc;")
	public Class1_Sub3_Sub16 method2028(@OriginalArg(0) int arg0) {
		if (this.anIntArray433 != null && arg0 > 1) {
			@Pc(20) int local20 = -1;
			for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
				if (this.anIntArray432[local22] <= arg0 && this.anIntArray432[local22] != 0) {
					local20 = this.anIntArray433[local22];
				}
			}
			if (local20 != -1) {
				return Static56.method1022(local20);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(ILclient!rd;)V")
	public void method2029(@OriginalArg(1) Class1_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2053();
			if (local5 == 0) {
				return;
			}
			this.method2031(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZB)Lclient!c;")
	public Class1_Sub3_Sub4_Sub1 method2030(@OriginalArg(0) boolean arg0) {
		@Pc(10) int local10 = this.anInt2886;
		@Pc(13) int local13 = this.anInt2882;
		if (arg0) {
			local13 = this.anInt2879;
			local10 = this.anInt2858;
		}
		if (local10 == -1) {
			return null;
		}
		@Pc(36) Class1_Sub3_Sub4_Sub1 local36 = Static14.method357(Static108.aClass41_25, local10);
		if (local13 != -1) {
			@Pc(44) Class1_Sub3_Sub4_Sub1 local44 = Static14.method357(Static108.aClass41_25, local13);
			@Pc(55) Class1_Sub3_Sub4_Sub1[] local55 = new Class1_Sub3_Sub4_Sub1[] { local36, local44 };
			local36 = new Class1_Sub3_Sub4_Sub1(local55, 2);
		}
		if (this.aShortArray12 != null) {
			for (@Pc(66) int local66 = 0; local66 < this.aShortArray12.length; local66++) {
				local36.method347(this.aShortArray12[local66], this.aShortArray13[local66]);
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!rd;II)V")
	private void method2031(@OriginalArg(0) Class1_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2870 = arg0.method2087();
		} else if (arg1 == 2) {
			this.aClass5_1323 = arg0.method2101();
		} else if (arg1 == 4) {
			this.anInt2851 = arg0.method2087();
		} else if (arg1 == 5) {
			this.anInt2866 = arg0.method2087();
		} else if (arg1 == 6) {
			this.anInt2872 = arg0.method2087();
		} else if (arg1 == 7) {
			this.anInt2874 = arg0.method2087();
			if (this.anInt2874 > 32767) {
				this.anInt2874 -= 65536;
			}
		} else if (arg1 == 8) {
			this.anInt2852 = arg0.method2087();
			if (this.anInt2852 > 32767) {
				this.anInt2852 -= 65536;
			}
		} else if (arg1 == 11) {
			this.anInt2857 = 1;
		} else if (arg1 == 12) {
			this.anInt2865 = arg0.method2094();
		} else if (arg1 == 16) {
			this.aBoolean114 = true;
		} else if (arg1 == 23) {
			this.anInt2863 = arg0.method2087();
			this.anInt2844 = arg0.method2053();
		} else if (arg1 == 24) {
			this.anInt2859 = arg0.method2087();
		} else if (arg1 == 25) {
			this.anInt2850 = arg0.method2087();
			this.anInt2843 = arg0.method2053();
		} else if (arg1 == 26) {
			this.anInt2842 = arg0.method2087();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass5Array22[arg1 - 30] = arg0.method2101();
			if (this.aClass5Array22[arg1 - 30].method207(Static105.aClass5_1347)) {
				this.aClass5Array22[arg1 - 30] = null;
			}
		} else if (arg1 >= 35 && arg1 < 40) {
			this.aClass5Array23[arg1 - 35] = arg0.method2101();
		} else if (arg1 == 40) {
			@Pc(122) int local122 = arg0.method2053();
			this.aShortArray12 = new short[local122];
			this.aShortArray13 = new short[local122];
			for (@Pc(132) int local132 = 0; local132 < local122; local132++) {
				this.aShortArray12[local132] = (short) arg0.method2087();
				this.aShortArray13[local132] = (short) arg0.method2087();
			}
		} else if (arg1 == 78) {
			this.anInt2878 = arg0.method2087();
		} else if (arg1 == 79) {
			this.anInt2867 = arg0.method2087();
		} else if (arg1 == 90) {
			this.anInt2886 = arg0.method2087();
		} else if (arg1 == 91) {
			this.anInt2858 = arg0.method2087();
		} else if (arg1 == 92) {
			this.anInt2882 = arg0.method2087();
		} else if (arg1 == 93) {
			this.anInt2879 = arg0.method2087();
		} else if (arg1 == 95) {
			this.anInt2861 = arg0.method2087();
		} else if (arg1 == 97) {
			this.anInt2860 = arg0.method2087();
		} else if (arg1 == 98) {
			this.anInt2876 = arg0.method2087();
		} else if (arg1 >= 100 && arg1 < 110) {
			if (this.anIntArray433 == null) {
				this.anIntArray433 = new int[10];
				this.anIntArray432 = new int[10];
			}
			this.anIntArray433[arg1 - 100] = arg0.method2087();
			this.anIntArray432[arg1 - 100] = arg0.method2087();
		} else if (arg1 == 110) {
			this.anInt2873 = arg0.method2087();
		} else if (arg1 == 111) {
			this.anInt2849 = arg0.method2087();
		} else if (arg1 == 112) {
			this.anInt2877 = arg0.method2087();
		} else if (arg1 == 113) {
			this.anInt2854 = arg0.method2099();
		} else if (arg1 == 114) {
			this.anInt2881 = arg0.method2099() * 5;
		} else if (arg1 == 115) {
			this.anInt2856 = arg0.method2053();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZZ)Lclient!c;")
	public Class1_Sub3_Sub4_Sub1 method2032(@OriginalArg(0) boolean arg0) {
		@Pc(4) int local4 = this.anInt2863;
		@Pc(11) int local11 = this.anInt2878;
		@Pc(14) int local14 = this.anInt2859;
		if (arg0) {
			local4 = this.anInt2850;
			local14 = this.anInt2842;
			local11 = this.anInt2867;
		}
		if (local4 == -1) {
			return null;
		}
		@Pc(42) Class1_Sub3_Sub4_Sub1 local42 = Static14.method357(Static108.aClass41_25, local4);
		if (local14 != -1) {
			@Pc(51) Class1_Sub3_Sub4_Sub1 local51 = Static14.method357(Static108.aClass41_25, local14);
			if (local11 == -1) {
				@Pc(66) Class1_Sub3_Sub4_Sub1[] local66 = new Class1_Sub3_Sub4_Sub1[] { local42, local51 };
				local42 = new Class1_Sub3_Sub4_Sub1(local66, 2);
			} else {
				@Pc(79) Class1_Sub3_Sub4_Sub1 local79 = Static14.method357(Static108.aClass41_25, local11);
				@Pc(94) Class1_Sub3_Sub4_Sub1[] local94 = new Class1_Sub3_Sub4_Sub1[] { local42, local51, local79 };
				local42 = new Class1_Sub3_Sub4_Sub1(local94, 3);
			}
		}
		if (!arg0 && this.anInt2844 != 0) {
			local42.method358(0, this.anInt2844, 0);
		}
		if (arg0 && this.anInt2843 != 0) {
			local42.method358(0, this.anInt2843, 0);
		}
		if (this.aShortArray12 != null) {
			for (@Pc(130) int local130 = 0; local130 < this.aShortArray12.length; local130++) {
				local42.method347(this.aShortArray12[local130], this.aShortArray13[local130]);
			}
		}
		return local42;
	}
}
