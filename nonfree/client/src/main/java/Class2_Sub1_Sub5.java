import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class2_Sub1_Sub5 extends Class2_Sub1 {

	@OriginalMember(owner = "client!cf", name = "R", descriptor = "[I")
	public int[] anIntArray97;

	@OriginalMember(owner = "client!cf", name = "T", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!cf", name = "Hb", descriptor = "I")
	private int anInt801;

	@OriginalMember(owner = "client!cf", name = "Ib", descriptor = "[I")
	public int[] anIntArray98;

	@OriginalMember(owner = "client!cf", name = "Xb", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!cf", name = "cc", descriptor = "I")
	public int anInt815;

	@OriginalMember(owner = "client!cf", name = "P", descriptor = "I")
	public int anInt768 = 0;

	@OriginalMember(owner = "client!cf", name = "Y", descriptor = "I")
	public int anInt773 = 0;

	@OriginalMember(owner = "client!cf", name = "cb", descriptor = "I")
	private int anInt775 = -1;

	@OriginalMember(owner = "client!cf", name = "sb", descriptor = "I")
	private int anInt788 = -1;

	@OriginalMember(owner = "client!cf", name = "eb", descriptor = "I")
	private int anInt777 = -1;

	@OriginalMember(owner = "client!cf", name = "xb", descriptor = "I")
	private int anInt793 = -1;

	@OriginalMember(owner = "client!cf", name = "ob", descriptor = "Lclient!wd;")
	public Class80 aClass80_271 = Static38.aClass80_432;

	@OriginalMember(owner = "client!cf", name = "lb", descriptor = "I")
	public int anInt783 = -1;

	@OriginalMember(owner = "client!cf", name = "Z", descriptor = "I")
	public int anInt774 = 2000;

	@OriginalMember(owner = "client!cf", name = "X", descriptor = "I")
	private int anInt772 = 128;

	@OriginalMember(owner = "client!cf", name = "Jb", descriptor = "I")
	public int anInt802 = 0;

	@OriginalMember(owner = "client!cf", name = "Eb", descriptor = "I")
	private int anInt799 = 128;

	@OriginalMember(owner = "client!cf", name = "db", descriptor = "I")
	public int anInt776 = 0;

	@OriginalMember(owner = "client!cf", name = "Cb", descriptor = "I")
	public int anInt797 = -1;

	@OriginalMember(owner = "client!cf", name = "kb", descriptor = "I")
	public int anInt782 = 1;

	@OriginalMember(owner = "client!cf", name = "Ob", descriptor = "I")
	public int anInt804 = 0;

	@OriginalMember(owner = "client!cf", name = "Db", descriptor = "I")
	public int anInt798 = 0;

	@OriginalMember(owner = "client!cf", name = "Qb", descriptor = "I")
	private int anInt806 = -1;

	@OriginalMember(owner = "client!cf", name = "U", descriptor = "I")
	private int anInt769 = -1;

	@OriginalMember(owner = "client!cf", name = "Mb", descriptor = "[Lclient!wd;")
	public Class80[] aClass80Array3 = new Class80[] { null, null, Static87.aClass80_894, null, null };

	@OriginalMember(owner = "client!cf", name = "wb", descriptor = "I")
	public int anInt792 = 0;

	@OriginalMember(owner = "client!cf", name = "V", descriptor = "I")
	private int anInt770 = 0;

	@OriginalMember(owner = "client!cf", name = "Vb", descriptor = "Z")
	public boolean aBoolean55 = false;

	@OriginalMember(owner = "client!cf", name = "ub", descriptor = "I")
	private int anInt790 = -1;

	@OriginalMember(owner = "client!cf", name = "dc", descriptor = "[Lclient!wd;")
	public Class80[] aClass80Array4 = new Class80[] { null, null, null, null, Static24.aClass80_314 };

	@OriginalMember(owner = "client!cf", name = "ac", descriptor = "I")
	private int anInt813 = 0;

	@OriginalMember(owner = "client!cf", name = "fc", descriptor = "I")
	public int anInt817 = 0;

	@OriginalMember(owner = "client!cf", name = "W", descriptor = "I")
	private int anInt771 = -1;

	@OriginalMember(owner = "client!cf", name = "gb", descriptor = "I")
	private int anInt779 = -1;

	@OriginalMember(owner = "client!cf", name = "hc", descriptor = "I")
	public int anInt818 = 0;

	@OriginalMember(owner = "client!cf", name = "bc", descriptor = "I")
	private int anInt814 = 128;

	@OriginalMember(owner = "client!cf", name = "zb", descriptor = "I")
	private int anInt795 = -1;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!cf;Lclient!cf;B)V")
	public void method422(@OriginalArg(0) Class2_Sub1_Sub5 arg0, @OriginalArg(1) Class2_Sub1_Sub5 arg1) {
		this.anInt774 = arg1.anInt774;
		this.anInt818 = arg1.anInt818;
		this.aBoolean55 = arg0.aBoolean55;
		this.anInt792 = 1;
		this.aShortArray4 = arg1.aShortArray4;
		this.anInt773 = arg1.anInt773;
		this.anInt801 = arg1.anInt801;
		this.anInt776 = arg1.anInt776;
		this.anInt817 = arg1.anInt817;
		this.anInt802 = arg1.anInt802;
		this.anInt782 = arg0.anInt782;
		this.aShortArray5 = arg1.aShortArray5;
		this.aClass80_271 = arg0.aClass80_271;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!wb;I)V")
	private void method423(@OriginalArg(1) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt801 = arg0.method1783();
		} else if (arg1 == 2) {
			this.aClass80_271 = arg0.method1797();
		} else if (arg1 == 4) {
			this.anInt774 = arg0.method1783();
		} else if (arg1 == 5) {
			this.anInt773 = arg0.method1783();
		} else if (arg1 == 6) {
			this.anInt802 = arg0.method1783();
		} else if (arg1 == 7) {
			this.anInt776 = arg0.method1783();
			if (this.anInt776 > 32767) {
				this.anInt776 -= 65536;
			}
		} else if (arg1 == 8) {
			this.anInt818 = arg0.method1783();
			if (this.anInt818 > 32767) {
				this.anInt818 -= 65536;
			}
		} else if (arg1 == 11) {
			this.anInt792 = 1;
		} else if (arg1 == 12) {
			this.anInt782 = arg0.method1747();
		} else if (arg1 == 16) {
			this.aBoolean55 = true;
		} else if (arg1 == 23) {
			this.anInt775 = arg0.method1783();
			this.anInt813 = arg0.method1780();
		} else if (arg1 == 24) {
			this.anInt788 = arg0.method1783();
		} else if (arg1 == 25) {
			this.anInt779 = arg0.method1783();
			this.anInt770 = arg0.method1780();
		} else if (arg1 == 26) {
			this.anInt793 = arg0.method1783();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass80Array3[arg1 - 30] = arg0.method1797();
			if (this.aClass80Array3[arg1 - 30].method2006(Static102.aClass80_1010)) {
				this.aClass80Array3[arg1 - 30] = null;
			}
		} else if (arg1 >= 35 && arg1 < 40) {
			this.aClass80Array4[arg1 - 35] = arg0.method1797();
		} else if (arg1 == 40) {
			@Pc(410) int local410 = arg0.method1780();
			this.aShortArray5 = new short[local410];
			this.aShortArray4 = new short[local410];
			for (@Pc(420) int local420 = 0; local420 < local410; local420++) {
				this.aShortArray4[local420] = (short) arg0.method1783();
				this.aShortArray5[local420] = (short) arg0.method1783();
			}
		} else if (arg1 == 78) {
			this.anInt769 = arg0.method1783();
		} else if (arg1 == 79) {
			this.anInt795 = arg0.method1783();
		} else if (arg1 == 90) {
			this.anInt806 = arg0.method1783();
		} else if (arg1 == 91) {
			this.anInt771 = arg0.method1783();
		} else if (arg1 == 92) {
			this.anInt790 = arg0.method1783();
		} else if (arg1 == 93) {
			this.anInt777 = arg0.method1783();
		} else if (arg1 == 95) {
			this.anInt817 = arg0.method1783();
		} else if (arg1 == 97) {
			this.anInt783 = arg0.method1783();
		} else if (arg1 == 98) {
			this.anInt797 = arg0.method1783();
		} else if (arg1 >= 100 && arg1 < 110) {
			if (this.anIntArray97 == null) {
				this.anIntArray97 = new int[10];
				this.anIntArray98 = new int[10];
			}
			this.anIntArray97[arg1 - 100] = arg0.method1783();
			this.anIntArray98[arg1 - 100] = arg0.method1783();
		} else if (arg1 == 110) {
			this.anInt814 = arg0.method1783();
		} else if (arg1 == 111) {
			this.anInt772 = arg0.method1783();
		} else if (arg1 == 112) {
			this.anInt799 = arg0.method1783();
		} else if (arg1 == 113) {
			this.anInt798 = arg0.method1767();
		} else if (arg1 == 114) {
			this.anInt768 = arg0.method1767() * 5;
		} else if (arg1 == 115) {
			this.anInt804 = arg0.method1780();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZB)Z")
	public boolean method424(@OriginalArg(0) boolean arg0) {
		@Pc(2) int local2 = this.anInt806;
		@Pc(17) int local17 = this.anInt790;
		if (arg0) {
			local2 = this.anInt771;
			local17 = this.anInt777;
		}
		if (local2 == -1) {
			return true;
		}
		@Pc(33) boolean local33 = true;
		if (!Static90.aClass11_36.method384(0, local2)) {
			local33 = false;
		}
		if (local17 != -1 && !Static90.aClass11_36.method384(0, local17)) {
			local33 = false;
		}
		return local33;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BZ)Lclient!de;")
	public Class2_Sub1_Sub1_Sub6 method425(@OriginalArg(1) boolean arg0) {
		@Pc(13) int local13 = this.anInt806;
		@Pc(16) int local16 = this.anInt790;
		if (arg0) {
			local16 = this.anInt777;
			local13 = this.anInt771;
		}
		if (local13 == -1) {
			return null;
		}
		@Pc(34) Class2_Sub1_Sub1_Sub6 local34 = Static26.method540(Static90.aClass11_36, local13);
		if (local16 != -1) {
			@Pc(42) Class2_Sub1_Sub1_Sub6 local42 = Static26.method540(Static90.aClass11_36, local16);
			@Pc(53) Class2_Sub1_Sub1_Sub6[] local53 = new Class2_Sub1_Sub1_Sub6[] { local34, local42 };
			local34 = new Class2_Sub1_Sub1_Sub6(local53, 2);
		}
		if (this.aShortArray4 != null) {
			for (@Pc(64) int local64 = 0; local64 < this.aShortArray4.length; local64++) {
				local34.method559(this.aShortArray4[local64], this.aShortArray5[local64]);
			}
		}
		return local34;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLclient!wb;)V")
	public void method430(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1780();
			if (local9 == 0) {
				return;
			}
			this.method423(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Lclient!cf;")
	public Class2_Sub1_Sub5 method431(@OriginalArg(1) int arg0) {
		if (this.anIntArray97 != null && arg0 > 1) {
			@Pc(20) int local20 = -1;
			for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
				if (arg0 >= this.anIntArray98[local22] && this.anIntArray98[local22] != 0) {
					local20 = this.anIntArray97[local22];
				}
			}
			if (local20 != -1) {
				return Static4.method95(local20);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "(B)V")
	public void method432() {
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ)Lclient!de;")
	public Class2_Sub1_Sub1_Sub6 method434(@OriginalArg(0) int arg0) {
		@Pc(17) int local17;
		if (this.anIntArray97 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (local17 = 0; local17 < 10; local17++) {
				if (this.anIntArray98[local17] <= arg0 && this.anIntArray98[local17] != 0) {
					local15 = this.anIntArray97[local17];
				}
			}
			if (local15 != -1) {
				return Static4.method95(local15).method434(1);
			}
		}
		@Pc(58) Class2_Sub1_Sub1_Sub6 local58 = Static26.method540(Static90.aClass11_36, this.anInt801);
		if (local58 == null) {
			return null;
		}
		if (this.anInt814 != 128 || this.anInt772 != 128 || this.anInt799 != 128) {
			local58.method542(this.anInt814, this.anInt772, this.anInt799);
		}
		if (this.aShortArray4 != null) {
			for (local17 = 0; local17 < this.aShortArray4.length; local17++) {
				local58.method559(this.aShortArray4[local17], this.aShortArray5[local17]);
			}
		}
		return local58;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(IZ)Lclient!de;")
	public Class2_Sub1_Sub1_Sub6 method435(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt775;
		@Pc(11) int local11 = this.anInt769;
		@Pc(14) int local14 = this.anInt788;
		if (arg0) {
			local14 = this.anInt793;
			local11 = this.anInt795;
			local8 = this.anInt779;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(35) Class2_Sub1_Sub1_Sub6 local35 = Static26.method540(Static90.aClass11_36, local8);
		if (local14 != -1) {
			@Pc(43) Class2_Sub1_Sub1_Sub6 local43 = Static26.method540(Static90.aClass11_36, local14);
			if (local11 == -1) {
				@Pc(85) Class2_Sub1_Sub1_Sub6[] local85 = new Class2_Sub1_Sub1_Sub6[] { local35, local43 };
				local35 = new Class2_Sub1_Sub1_Sub6(local85, 2);
			} else {
				@Pc(51) Class2_Sub1_Sub1_Sub6 local51 = Static26.method540(Static90.aClass11_36, local11);
				@Pc(66) Class2_Sub1_Sub1_Sub6[] local66 = new Class2_Sub1_Sub1_Sub6[] { local35, local43, local51 };
				local35 = new Class2_Sub1_Sub1_Sub6(local66, 3);
			}
		}
		if (!arg0 && this.anInt813 != 0) {
			local35.method545(0, this.anInt813, 0);
		}
		if (arg0 && this.anInt770 != 0) {
			local35.method545(0, this.anInt770, 0);
		}
		if (this.aShortArray4 != null) {
			for (@Pc(132) int local132 = 0; local132 < this.aShortArray4.length; local132++) {
				local35.method559(this.aShortArray4[local132], this.aShortArray5[local132]);
			}
		}
		return local35;
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(IZ)Z")
	public boolean method437(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt775;
		@Pc(9) int local9 = this.anInt769;
		@Pc(12) int local12 = this.anInt788;
		if (arg0) {
			local12 = this.anInt793;
			local9 = this.anInt795;
			local6 = this.anInt779;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(31) boolean local31 = true;
		if (!Static90.aClass11_36.method384(0, local6)) {
			local31 = false;
		}
		if (local12 != -1 && !Static90.aClass11_36.method384(0, local12)) {
			local31 = false;
		}
		if (local9 != -1 && !Static90.aClass11_36.method384(0, local9)) {
			local31 = false;
		}
		return local31;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI)Lclient!be;")
	public Class2_Sub1_Sub1_Sub2 method438(@OriginalArg(1) int arg0) {
		if (this.anIntArray97 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
				if (this.anIntArray98[local17] <= arg0 && this.anIntArray98[local17] != 0) {
					local15 = this.anIntArray97[local17];
				}
			}
			if (local15 != -1) {
				return Static4.method95(local15).method438(1);
			}
		}
		@Pc(66) Class2_Sub1_Sub1_Sub2 local66 = (Class2_Sub1_Sub1_Sub2) Static74.aClass32_37.method887((long) this.anInt815);
		if (local66 != null) {
			return local66;
		}
		@Pc(76) Class2_Sub1_Sub1_Sub6 local76 = Static26.method540(Static90.aClass11_36, this.anInt801);
		if (local76 == null) {
			return null;
		}
		if (this.anInt814 != 128 || this.anInt772 != 128 || this.anInt799 != 128) {
			local76.method542(this.anInt814, this.anInt772, this.anInt799);
		}
		if (this.aShortArray4 != null) {
			for (@Pc(107) int local107 = 0; local107 < this.aShortArray4.length; local107++) {
				local76.method559(this.aShortArray4[local107], this.aShortArray5[local107]);
			}
		}
		local66 = local76.method548(this.anInt798 + 64, this.anInt768 + 768, -50, -10, -50);
		local66.aBoolean30 = true;
		Static74.aClass32_37.method880(local66, (long) this.anInt815);
		return local66;
	}
}
