import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class1_Sub1_Sub6 extends Class1_Sub1 {

	@OriginalMember(owner = "client!hc", name = "Z", descriptor = "[I")
	public int[] anIntArray144;

	@OriginalMember(owner = "client!hc", name = "jb", descriptor = "I")
	public int anInt960;

	@OriginalMember(owner = "client!hc", name = "mb", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!hc", name = "qb", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!hc", name = "yb", descriptor = "[I")
	public int[] anIntArray145;

	@OriginalMember(owner = "client!hc", name = "Jb", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!hc", name = "ab", descriptor = "I")
	private int anInt952 = -1;

	@OriginalMember(owner = "client!hc", name = "fb", descriptor = "I")
	public int anInt956 = 0;

	@OriginalMember(owner = "client!hc", name = "gb", descriptor = "I")
	public int anInt957 = 0;

	@OriginalMember(owner = "client!hc", name = "eb", descriptor = "I")
	private int anInt955 = -1;

	@OriginalMember(owner = "client!hc", name = "rb", descriptor = "I")
	public int anInt967 = -1;

	@OriginalMember(owner = "client!hc", name = "sb", descriptor = "I")
	public int anInt968 = 0;

	@OriginalMember(owner = "client!hc", name = "ib", descriptor = "I")
	private int anInt959 = -1;

	@OriginalMember(owner = "client!hc", name = "Bb", descriptor = "[Lclient!rd;")
	public Class64[] aClass64Array10 = new Class64[] { null, null, Static16.aClass64_322, null, null };

	@OriginalMember(owner = "client!hc", name = "nb", descriptor = "I")
	private int anInt963 = -1;

	@OriginalMember(owner = "client!hc", name = "ob", descriptor = "I")
	private int anInt964 = 128;

	@OriginalMember(owner = "client!hc", name = "Ib", descriptor = "I")
	private int anInt977 = -1;

	@OriginalMember(owner = "client!hc", name = "wb", descriptor = "I")
	public int anInt972 = 0;

	@OriginalMember(owner = "client!hc", name = "vb", descriptor = "I")
	public int anInt971 = 0;

	@OriginalMember(owner = "client!hc", name = "Gb", descriptor = "[Lclient!rd;")
	public Class64[] aClass64Array11 = new Class64[] { null, null, null, null, Static69.aClass64_976 };

	@OriginalMember(owner = "client!hc", name = "cb", descriptor = "I")
	private int anInt953 = -1;

	@OriginalMember(owner = "client!hc", name = "Hb", descriptor = "I")
	private int anInt976 = 128;

	@OriginalMember(owner = "client!hc", name = "Sb", descriptor = "I")
	public int anInt984 = 2000;

	@OriginalMember(owner = "client!hc", name = "Lb", descriptor = "I")
	public int anInt979 = 0;

	@OriginalMember(owner = "client!hc", name = "Vb", descriptor = "I")
	private int anInt987 = -1;

	@OriginalMember(owner = "client!hc", name = "db", descriptor = "I")
	private int anInt954 = -1;

	@OriginalMember(owner = "client!hc", name = "Tb", descriptor = "I")
	private int anInt985 = 128;

	@OriginalMember(owner = "client!hc", name = "Wb", descriptor = "I")
	private int anInt988 = 0;

	@OriginalMember(owner = "client!hc", name = "Rb", descriptor = "Lclient!rd;")
	public Class64 aClass64_646 = Static100.aClass64_1416;

	@OriginalMember(owner = "client!hc", name = "Zb", descriptor = "I")
	private int anInt990 = 0;

	@OriginalMember(owner = "client!hc", name = "Nb", descriptor = "I")
	public int anInt981 = 0;

	@OriginalMember(owner = "client!hc", name = "Eb", descriptor = "I")
	public int anInt975 = -1;

	@OriginalMember(owner = "client!hc", name = "cc", descriptor = "I")
	private int anInt993 = -1;

	@OriginalMember(owner = "client!hc", name = "Yb", descriptor = "I")
	public int anInt989 = 1;

	@OriginalMember(owner = "client!hc", name = "bc", descriptor = "I")
	private int anInt992 = -1;

	@OriginalMember(owner = "client!hc", name = "fc", descriptor = "I")
	public int anInt995 = 0;

	@OriginalMember(owner = "client!hc", name = "dc", descriptor = "Z")
	public boolean aBoolean62 = false;

	@OriginalMember(owner = "client!hc", name = "ec", descriptor = "I")
	public int anInt994 = 0;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZB)Z")
	public boolean method713(@OriginalArg(0) boolean arg0) {
		@Pc(2) int local2 = this.anInt992;
		@Pc(9) int local9 = this.anInt953;
		@Pc(12) int local12 = this.anInt993;
		if (arg0) {
			local9 = this.anInt954;
			local12 = this.anInt959;
			local2 = this.anInt987;
		}
		if (local9 == -1) {
			return true;
		}
		@Pc(30) boolean local30 = true;
		if (!Static19.aClass41_12.method1072(0, local9)) {
			local30 = false;
		}
		if (local12 != -1 && !Static19.aClass41_12.method1072(0, local12)) {
			local30 = false;
		}
		if (local2 != -1 && !Static19.aClass41_12.method1072(0, local2)) {
			local30 = false;
		}
		return local30;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ)Z")
	public boolean method714(@OriginalArg(1) boolean arg0) {
		@Pc(14) int local14 = this.anInt955;
		@Pc(17) int local17 = this.anInt963;
		if (arg0) {
			local17 = this.anInt952;
			local14 = this.anInt977;
		}
		if (local14 == -1) {
			return true;
		}
		@Pc(32) boolean local32 = true;
		if (!Static19.aClass41_12.method1072(0, local14)) {
			local32 = false;
		}
		if (local17 != -1 && !Static19.aClass41_12.method1072(0, local17)) {
			local32 = false;
		}
		return local32;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!id;II)V")
	private void method715(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt966 = arg0.method1842();
		} else if (arg1 == 2) {
			this.aClass64_646 = arg0.method1831();
		} else if (arg1 == 4) {
			this.anInt984 = arg0.method1842();
		} else if (arg1 == 5) {
			this.anInt995 = arg0.method1842();
		} else if (arg1 == 6) {
			this.anInt971 = arg0.method1842();
		} else if (arg1 == 7) {
			this.anInt994 = arg0.method1842();
			if (this.anInt994 > 32767) {
				this.anInt994 -= 65536;
			}
		} else if (arg1 == 8) {
			this.anInt972 = arg0.method1842();
			if (this.anInt972 > 32767) {
				this.anInt972 -= 65536;
			}
		} else if (arg1 == 11) {
			this.anInt957 = 1;
		} else if (arg1 == 12) {
			this.anInt989 = arg0.method1817();
		} else if (arg1 == 16) {
			this.aBoolean62 = true;
		} else if (arg1 == 23) {
			this.anInt953 = arg0.method1842();
			this.anInt990 = arg0.method1837();
		} else if (arg1 == 24) {
			this.anInt993 = arg0.method1842();
		} else if (arg1 == 25) {
			this.anInt954 = arg0.method1842();
			this.anInt988 = arg0.method1837();
		} else if (arg1 == 26) {
			this.anInt959 = arg0.method1842();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass64Array10[arg1 - 30] = arg0.method1831();
			if (this.aClass64Array10[arg1 - 30].method1501(Static25.aClass64_1772)) {
				this.aClass64Array10[arg1 - 30] = null;
			}
		} else if (arg1 >= 35 && arg1 < 40) {
			this.aClass64Array11[arg1 - 35] = arg0.method1831();
		} else if (arg1 == 40) {
			@Pc(368) int local368 = arg0.method1837();
			this.aShortArray4 = new short[local368];
			this.aShortArray5 = new short[local368];
			for (@Pc(378) int local378 = 0; local378 < local368; local378++) {
				this.aShortArray4[local378] = (short) arg0.method1842();
				this.aShortArray5[local378] = (short) arg0.method1842();
			}
		} else if (arg1 == 78) {
			this.anInt992 = arg0.method1842();
		} else if (arg1 == 79) {
			this.anInt987 = arg0.method1842();
		} else if (arg1 == 90) {
			this.anInt955 = arg0.method1842();
		} else if (arg1 == 91) {
			this.anInt977 = arg0.method1842();
		} else if (arg1 == 92) {
			this.anInt963 = arg0.method1842();
		} else if (arg1 == 93) {
			this.anInt952 = arg0.method1842();
		} else if (arg1 == 95) {
			this.anInt979 = arg0.method1842();
		} else if (arg1 == 97) {
			this.anInt975 = arg0.method1842();
		} else if (arg1 == 98) {
			this.anInt967 = arg0.method1842();
		} else if (arg1 >= 100 && arg1 < 110) {
			if (this.anIntArray145 == null) {
				this.anIntArray145 = new int[10];
				this.anIntArray144 = new int[10];
			}
			this.anIntArray145[arg1 - 100] = arg0.method1842();
			this.anIntArray144[arg1 - 100] = arg0.method1842();
		} else if (arg1 == 110) {
			this.anInt985 = arg0.method1842();
		} else if (arg1 == 111) {
			this.anInt964 = arg0.method1842();
		} else if (arg1 == 112) {
			this.anInt976 = arg0.method1842();
		} else if (arg1 == 113) {
			this.anInt956 = arg0.method1824();
		} else if (arg1 == 114) {
			this.anInt968 = arg0.method1824() * 5;
		} else if (arg1 == 115) {
			this.anInt981 = arg0.method1837();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!hc;Lclient!hc;)V")
	public void method716(@OriginalArg(1) Class1_Sub1_Sub6 arg0, @OriginalArg(2) Class1_Sub1_Sub6 arg1) {
		this.anInt971 = arg0.anInt971;
		this.anInt995 = arg0.anInt995;
		this.aClass64_646 = arg1.aClass64_646;
		this.aShortArray5 = arg0.aShortArray5;
		this.anInt966 = arg0.anInt966;
		this.aBoolean62 = arg1.aBoolean62;
		this.anInt979 = arg0.anInt979;
		this.anInt972 = arg0.anInt972;
		this.anInt994 = arg0.anInt994;
		this.anInt989 = arg1.anInt989;
		this.aShortArray4 = arg0.aShortArray4;
		this.anInt984 = arg0.anInt984;
		this.anInt957 = 1;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!id;)V")
	public void method717(@OriginalArg(1) Class1_Sub6 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1837();
			if (local9 == 0) {
				return;
			}
			this.method715(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)Lclient!hc;")
	public Class1_Sub1_Sub6 method718(@OriginalArg(0) int arg0) {
		if (this.anIntArray145 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (this.anIntArray144[local15] <= arg0 && this.anIntArray144[local15] != 0) {
					local13 = this.anIntArray145[local15];
				}
			}
			if (local13 != -1) {
				return Static106.method1739(local13);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(IZ)Lclient!kc;")
	public Class1_Sub1_Sub2_Sub3 method719(@OriginalArg(1) boolean arg0) {
		@Pc(4) int local4 = this.anInt955;
		@Pc(11) int local11 = this.anInt963;
		if (arg0) {
			local4 = this.anInt977;
			local11 = this.anInt952;
		}
		if (local4 == -1) {
			return null;
		}
		@Pc(30) Class1_Sub1_Sub2_Sub3 local30 = Static59.method1010(Static19.aClass41_12, local4);
		if (local11 != -1) {
			@Pc(44) Class1_Sub1_Sub2_Sub3 local44 = Static59.method1010(Static19.aClass41_12, local11);
			@Pc(55) Class1_Sub1_Sub2_Sub3[] local55 = new Class1_Sub1_Sub2_Sub3[] { local30, local44 };
			local30 = new Class1_Sub1_Sub2_Sub3(local55, 2);
		}
		if (this.aShortArray4 != null) {
			for (@Pc(66) int local66 = 0; local66 < this.aShortArray4.length; local66++) {
				local30.method1013(this.aShortArray4[local66], this.aShortArray5[local66]);
			}
		}
		return local30;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)Lclient!kc;")
	public Class1_Sub1_Sub2_Sub3 method720(@OriginalArg(1) int arg0) {
		@Pc(15) int local15;
		if (this.anIntArray145 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (local15 = 0; local15 < 10; local15++) {
				if (arg0 >= this.anIntArray144[local15] && this.anIntArray144[local15] != 0) {
					local13 = this.anIntArray145[local15];
				}
			}
			if (local13 != -1) {
				return Static106.method1739(local13).method720(1);
			}
		}
		@Pc(59) Class1_Sub1_Sub2_Sub3 local59 = Static59.method1010(Static19.aClass41_12, this.anInt966);
		if (local59 == null) {
			return null;
		}
		if (this.anInt985 != 128 || this.anInt964 != 128 || this.anInt976 != 128) {
			local59.method1008(this.anInt985, this.anInt964, this.anInt976);
		}
		if (this.aShortArray4 != null) {
			for (local15 = 0; local15 < this.aShortArray4.length; local15++) {
				local59.method1013(this.aShortArray4[local15], this.aShortArray5[local15]);
			}
		}
		return local59;
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(IZ)Lclient!kc;")
	public Class1_Sub1_Sub2_Sub3 method722(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt992;
		@Pc(11) int local11 = this.anInt993;
		@Pc(18) int local18 = this.anInt953;
		if (arg0) {
			local11 = this.anInt959;
			local8 = this.anInt987;
			local18 = this.anInt954;
		}
		if (local18 == -1) {
			return null;
		}
		@Pc(39) Class1_Sub1_Sub2_Sub3 local39 = Static59.method1010(Static19.aClass41_12, local18);
		if (local11 != -1) {
			@Pc(47) Class1_Sub1_Sub2_Sub3 local47 = Static59.method1010(Static19.aClass41_12, local11);
			if (local8 == -1) {
				@Pc(89) Class1_Sub1_Sub2_Sub3[] local89 = new Class1_Sub1_Sub2_Sub3[] { local39, local47 };
				local39 = new Class1_Sub1_Sub2_Sub3(local89, 2);
			} else {
				@Pc(55) Class1_Sub1_Sub2_Sub3 local55 = Static59.method1010(Static19.aClass41_12, local8);
				@Pc(70) Class1_Sub1_Sub2_Sub3[] local70 = new Class1_Sub1_Sub2_Sub3[] { local39, local47, local55 };
				local39 = new Class1_Sub1_Sub2_Sub3(local70, 3);
			}
		}
		if (!arg0 && this.anInt990 != 0) {
			local39.method1009(0, this.anInt990, 0);
		}
		if (arg0 && this.anInt988 != 0) {
			local39.method1009(0, this.anInt988, 0);
		}
		if (this.aShortArray4 != null) {
			for (@Pc(122) int local122 = 0; local122 < this.aShortArray4.length; local122++) {
				local39.method1013(this.aShortArray4[local122], this.aShortArray5[local122]);
			}
		}
		return local39;
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(B)V")
	public void method723() {
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)Lclient!ue;")
	public Class1_Sub1_Sub2_Sub7 method724(@OriginalArg(0) int arg0) {
		if (this.anIntArray145 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
				if (arg0 >= this.anIntArray144[local17] && this.anIntArray144[local17] != 0) {
					local15 = this.anIntArray145[local17];
				}
			}
			if (local15 != -1) {
				return Static106.method1739(local15).method724(1);
			}
		}
		@Pc(66) Class1_Sub1_Sub2_Sub7 local66 = (Class1_Sub1_Sub2_Sub7) Static22.aClass19_23.method410((long) this.anInt960);
		if (local66 != null) {
			return local66;
		}
		@Pc(81) Class1_Sub1_Sub2_Sub3 local81 = Static59.method1010(Static19.aClass41_12, this.anInt966);
		if (local81 == null) {
			return null;
		}
		if (this.anInt985 != 128 || this.anInt964 != 128 || this.anInt976 != 128) {
			local81.method1008(this.anInt985, this.anInt964, this.anInt976);
		}
		if (this.aShortArray4 != null) {
			for (@Pc(116) int local116 = 0; local116 < this.aShortArray4.length; local116++) {
				local81.method1013(this.aShortArray4[local116], this.aShortArray5[local116]);
			}
		}
		local66 = local81.method1002(this.anInt956 + 64, this.anInt968 + 768, -50, -10, -50);
		local66.aBoolean157 = true;
		Static22.aClass19_23.method409(local66, (long) this.anInt960);
		return local66;
	}
}
