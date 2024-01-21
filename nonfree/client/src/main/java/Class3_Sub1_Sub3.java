import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class3_Sub1_Sub3 extends Class3_Sub1 {

	@OriginalMember(owner = "client!db", name = "Q", descriptor = "[I")
	private int[] anIntArray70;

	@OriginalMember(owner = "client!db", name = "X", descriptor = "[I")
	public int[] anIntArray71;

	@OriginalMember(owner = "client!db", name = "fb", descriptor = "I")
	public int anInt667;

	@OriginalMember(owner = "client!db", name = "ib", descriptor = "I")
	private int anInt669;

	@OriginalMember(owner = "client!db", name = "mb", descriptor = "[I")
	private int[] anIntArray72;

	@OriginalMember(owner = "client!db", name = "Bb", descriptor = "[I")
	public int[] anIntArray73;

	@OriginalMember(owner = "client!db", name = "U", descriptor = "I")
	public int anInt657 = -1;

	@OriginalMember(owner = "client!db", name = "Y", descriptor = "I")
	public int anInt660 = 0;

	@OriginalMember(owner = "client!db", name = "db", descriptor = "I")
	public int anInt665 = 0;

	@OriginalMember(owner = "client!db", name = "V", descriptor = "I")
	private int anInt658 = -1;

	@OriginalMember(owner = "client!db", name = "jb", descriptor = "I")
	public int anInt670 = 0;

	@OriginalMember(owner = "client!db", name = "pb", descriptor = "I")
	private int anInt674 = -1;

	@OriginalMember(owner = "client!db", name = "Z", descriptor = "I")
	private int anInt661 = -1;

	@OriginalMember(owner = "client!db", name = "S", descriptor = "I")
	private int anInt655 = -1;

	@OriginalMember(owner = "client!db", name = "hb", descriptor = "I")
	public int anInt668 = 0;

	@OriginalMember(owner = "client!db", name = "kb", descriptor = "[Lclient!ae;")
	public Class5[] aClass5Array4 = new Class5[] { null, null, null, null, Static114.aClass5_1350 };

	@OriginalMember(owner = "client!db", name = "vb", descriptor = "I")
	private int anInt678 = -1;

	@OriginalMember(owner = "client!db", name = "nb", descriptor = "I")
	private int anInt672 = 0;

	@OriginalMember(owner = "client!db", name = "gb", descriptor = "Z")
	public boolean aBoolean30 = false;

	@OriginalMember(owner = "client!db", name = "cb", descriptor = "I")
	public int anInt664 = 2000;

	@OriginalMember(owner = "client!db", name = "wb", descriptor = "I")
	private int anInt679 = -1;

	@OriginalMember(owner = "client!db", name = "rb", descriptor = "Lclient!ae;")
	public Class5 aClass5_300 = Static81.aClass5_923;

	@OriginalMember(owner = "client!db", name = "Eb", descriptor = "I")
	public int anInt684 = 0;

	@OriginalMember(owner = "client!db", name = "eb", descriptor = "I")
	public int anInt666 = -1;

	@OriginalMember(owner = "client!db", name = "yb", descriptor = "I")
	private int anInt681 = -1;

	@OriginalMember(owner = "client!db", name = "xb", descriptor = "I")
	private int anInt680 = -1;

	@OriginalMember(owner = "client!db", name = "Ab", descriptor = "I")
	public int anInt683 = 0;

	@OriginalMember(owner = "client!db", name = "P", descriptor = "I")
	private int anInt653 = 128;

	@OriginalMember(owner = "client!db", name = "Ib", descriptor = "I")
	private int anInt688 = -1;

	@OriginalMember(owner = "client!db", name = "Fb", descriptor = "I")
	public int anInt685 = 0;

	@OriginalMember(owner = "client!db", name = "zb", descriptor = "I")
	private int anInt682 = 128;

	@OriginalMember(owner = "client!db", name = "sb", descriptor = "I")
	public int anInt676 = 0;

	@OriginalMember(owner = "client!db", name = "Jb", descriptor = "I")
	public int anInt689 = 0;

	@OriginalMember(owner = "client!db", name = "Lb", descriptor = "I")
	private int anInt691 = -1;

	@OriginalMember(owner = "client!db", name = "Mb", descriptor = "I")
	private int anInt692 = 0;

	@OriginalMember(owner = "client!db", name = "Db", descriptor = "[Lclient!ae;")
	public Class5[] aClass5Array5 = new Class5[] { null, null, Static34.aClass5_454, null, null };

	@OriginalMember(owner = "client!db", name = "Kb", descriptor = "I")
	private int anInt690 = 128;

	@OriginalMember(owner = "client!db", name = "Ub", descriptor = "I")
	public int anInt695 = 1;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZI)Z")
	public boolean method420(@OriginalArg(0) boolean arg0) {
		@Pc(11) int local11 = this.anInt658;
		@Pc(14) int local14 = this.anInt678;
		@Pc(17) int local17 = this.anInt674;
		if (arg0) {
			local17 = this.anInt680;
			local14 = this.anInt655;
			local11 = this.anInt681;
		}
		if (local11 == -1) {
			return true;
		}
		@Pc(35) boolean local35 = true;
		if (!Static5.aClass11_8.method1872(0, local11)) {
			local35 = false;
		}
		if (local14 != -1 && !Static5.aClass11_8.method1872(0, local14)) {
			local35 = false;
		}
		if (local17 != -1 && !Static5.aClass11_8.method1872(0, local17)) {
			local35 = false;
		}
		return local35;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!m;)V")
	public void method421(@OriginalArg(1) Class3_Sub6 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method1587();
			if (local12 == 0) {
				return;
			}
			this.method422(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BLclient!m;I)V")
	private void method422(@OriginalArg(1) Class3_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt669 = arg0.method1603();
		} else if (arg1 == 2) {
			this.aClass5_300 = arg0.method1627();
		} else if (arg1 == 4) {
			this.anInt664 = arg0.method1603();
		} else if (arg1 == 5) {
			this.anInt683 = arg0.method1603();
		} else if (arg1 == 6) {
			this.anInt689 = arg0.method1603();
		} else if (arg1 == 7) {
			this.anInt685 = arg0.method1603();
			if (this.anInt685 > 32767) {
				this.anInt685 -= 65536;
			}
		} else if (arg1 == 8) {
			this.anInt668 = arg0.method1603();
			if (this.anInt668 > 32767) {
				this.anInt668 -= 65536;
			}
		} else if (arg1 == 11) {
			this.anInt676 = 1;
		} else if (arg1 == 12) {
			this.anInt695 = arg0.method1614();
		} else if (arg1 == 16) {
			this.aBoolean30 = true;
		} else if (arg1 == 23) {
			this.anInt658 = arg0.method1603();
			this.anInt672 = arg0.method1587();
		} else if (arg1 == 24) {
			this.anInt678 = arg0.method1603();
		} else if (arg1 == 25) {
			this.anInt681 = arg0.method1603();
			this.anInt692 = arg0.method1587();
		} else if (arg1 == 26) {
			this.anInt655 = arg0.method1603();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass5Array5[arg1 - 30] = arg0.method1627();
			if (this.aClass5Array5[arg1 - 30].method171(Static108.aClass5_1282)) {
				this.aClass5Array5[arg1 - 30] = null;
			}
		} else if (arg1 >= 35 && arg1 < 40) {
			this.aClass5Array4[arg1 - 35] = arg0.method1627();
		} else if (arg1 == 40) {
			@Pc(210) int local210 = arg0.method1587();
			this.anIntArray72 = new int[local210];
			this.anIntArray70 = new int[local210];
			for (@Pc(220) int local220 = 0; local220 < local210; local220++) {
				this.anIntArray72[local220] = arg0.method1603();
				this.anIntArray70[local220] = arg0.method1603();
			}
		} else if (arg1 == 78) {
			this.anInt674 = arg0.method1603();
		} else if (arg1 == 79) {
			this.anInt680 = arg0.method1603();
		} else if (arg1 == 90) {
			this.anInt679 = arg0.method1603();
		} else if (arg1 == 91) {
			this.anInt661 = arg0.method1603();
		} else if (arg1 == 92) {
			this.anInt688 = arg0.method1603();
		} else if (arg1 == 93) {
			this.anInt691 = arg0.method1603();
		} else if (arg1 == 95) {
			this.anInt670 = arg0.method1603();
		} else if (arg1 == 97) {
			this.anInt666 = arg0.method1603();
		} else if (arg1 == 98) {
			this.anInt657 = arg0.method1603();
		} else if (arg1 >= 100 && arg1 < 110) {
			if (this.anIntArray73 == null) {
				this.anIntArray73 = new int[10];
				this.anIntArray71 = new int[10];
			}
			this.anIntArray73[arg1 - 100] = arg0.method1603();
			this.anIntArray71[arg1 - 100] = arg0.method1603();
		} else if (arg1 == 110) {
			this.anInt682 = arg0.method1603();
		} else if (arg1 == 111) {
			this.anInt690 = arg0.method1603();
		} else if (arg1 == 112) {
			this.anInt653 = arg0.method1603();
		} else if (arg1 == 113) {
			this.anInt660 = arg0.method1605();
		} else if (arg1 == 114) {
			this.anInt684 = arg0.method1605() * 5;
		} else if (arg1 == 115) {
			this.anInt665 = arg0.method1587();
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(IZ)Z")
	public boolean method423(@OriginalArg(1) boolean arg0) {
		@Pc(11) int local11 = this.anInt679;
		@Pc(14) int local14 = this.anInt688;
		if (arg0) {
			local11 = this.anInt661;
			local14 = this.anInt691;
		}
		if (local11 == -1) {
			return true;
		}
		@Pc(29) boolean local29 = true;
		if (!Static5.aClass11_8.method1872(0, local11)) {
			local29 = false;
		}
		if (local14 != -1 && !Static5.aClass11_8.method1872(0, local14)) {
			local29 = false;
		}
		return local29;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!db;Lclient!db;)V")
	public void method424(@OriginalArg(1) Class3_Sub1_Sub3 arg0, @OriginalArg(2) Class3_Sub1_Sub3 arg1) {
		this.anIntArray72 = arg1.anIntArray72;
		this.anInt676 = 1;
		this.anInt669 = arg1.anInt669;
		this.anIntArray70 = arg1.anIntArray70;
		this.anInt668 = arg1.anInt668;
		this.anInt689 = arg1.anInt689;
		this.anInt685 = arg1.anInt685;
		this.aClass5_300 = arg0.aClass5_300;
		this.anInt670 = arg1.anInt670;
		this.anInt695 = arg0.anInt695;
		this.anInt664 = arg1.anInt664;
		this.anInt683 = arg1.anInt683;
		this.aBoolean30 = arg0.aBoolean30;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZB)Lclient!v;")
	public Class3_Sub1_Sub1_Sub6 method425(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(17) int local17;
		if (this.anIntArray73 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (local17 = 0; local17 < 10; local17++) {
				if (this.anIntArray71[local17] <= arg0 && this.anIntArray71[local17] != 0) {
					local15 = this.anIntArray73[local17];
				}
			}
			if (local15 != -1) {
				return Static37.method694(local15).method425(1, arg1);
			}
		}
		@Pc(62) Class3_Sub1_Sub1_Sub6 local62;
		if (arg1) {
			local62 = (Class3_Sub1_Sub1_Sub6) Static106.aClass9_26.method282((long) this.anInt667);
			if (local62 != null) {
				return local62;
			}
		}
		local62 = Static107.method1799(Static5.aClass11_8, this.anInt669);
		if (local62 == null) {
			return null;
		}
		if (this.anInt682 != 128 || this.anInt690 != 128 || this.anInt653 != 128) {
			local62.method1817(this.anInt682, this.anInt690, this.anInt653);
		}
		if (this.anIntArray72 != null) {
			for (local17 = 0; local17 < this.anIntArray72.length; local17++) {
				local62.method1821(this.anIntArray72[local17], this.anIntArray70[local17]);
			}
		}
		if (arg1) {
			local62.method1806(this.anInt660 + 64, this.anInt684 + 768, -50, -10, -50, true);
			local62.aBoolean149 = true;
			Static106.aClass9_26.method284(local62, (long) this.anInt667);
		}
		return local62;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BZ)Lclient!v;")
	public Class3_Sub1_Sub1_Sub6 method426(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt688;
		@Pc(11) int local11 = this.anInt679;
		if (arg0) {
			local8 = this.anInt691;
			local11 = this.anInt661;
		}
		if (local11 == -1) {
			return null;
		}
		@Pc(30) Class3_Sub1_Sub1_Sub6 local30 = Static107.method1799(Static5.aClass11_8, local11);
		if (local8 != -1) {
			@Pc(44) Class3_Sub1_Sub1_Sub6 local44 = Static107.method1799(Static5.aClass11_8, local8);
			@Pc(55) Class3_Sub1_Sub1_Sub6[] local55 = new Class3_Sub1_Sub1_Sub6[] { local30, local44 };
			local30 = new Class3_Sub1_Sub1_Sub6(local55, 2);
		}
		if (this.anIntArray72 != null) {
			for (@Pc(66) int local66 = 0; local66 < this.anIntArray72.length; local66++) {
				local30.method1821(this.anIntArray72[local66], this.anIntArray70[local66]);
			}
		}
		return local30;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(ZI)Lclient!v;")
	public Class3_Sub1_Sub1_Sub6 method431(@OriginalArg(0) boolean arg0) {
		@Pc(16) int local16 = this.anInt678;
		@Pc(19) int local19 = this.anInt674;
		@Pc(22) int local22 = this.anInt658;
		if (arg0) {
			local19 = this.anInt680;
			local16 = this.anInt655;
			local22 = this.anInt681;
		}
		if (local22 == -1) {
			return null;
		}
		@Pc(43) Class3_Sub1_Sub1_Sub6 local43 = Static107.method1799(Static5.aClass11_8, local22);
		if (local16 != -1) {
			@Pc(52) Class3_Sub1_Sub1_Sub6 local52 = Static107.method1799(Static5.aClass11_8, local16);
			if (local19 == -1) {
				@Pc(95) Class3_Sub1_Sub1_Sub6[] local95 = new Class3_Sub1_Sub1_Sub6[] { local43, local52 };
				local43 = new Class3_Sub1_Sub1_Sub6(local95, 2);
			} else {
				@Pc(61) Class3_Sub1_Sub1_Sub6 local61 = Static107.method1799(Static5.aClass11_8, local19);
				@Pc(76) Class3_Sub1_Sub1_Sub6[] local76 = new Class3_Sub1_Sub1_Sub6[] { local43, local52, local61 };
				local43 = new Class3_Sub1_Sub1_Sub6(local76, 3);
			}
		}
		if (!arg0 && this.anInt672 != 0) {
			local43.method1812(0, this.anInt672, 0);
		}
		if (arg0 && this.anInt692 != 0) {
			local43.method1812(0, this.anInt692, 0);
		}
		if (this.anIntArray72 != null) {
			for (@Pc(131) int local131 = 0; local131 < this.anIntArray72.length; local131++) {
				local43.method1821(this.anIntArray72[local131], this.anIntArray70[local131]);
			}
		}
		return local43;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
	public void method432() {
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)Lclient!db;")
	public Class3_Sub1_Sub3 method433(@OriginalArg(0) int arg0) {
		if (this.anIntArray73 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
				if (this.anIntArray71[local17] <= arg0 && this.anIntArray71[local17] != 0) {
					local15 = this.anIntArray73[local17];
				}
			}
			if (local15 != -1) {
				return Static37.method694(local15);
			}
		}
		return this;
	}
}
