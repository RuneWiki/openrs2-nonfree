import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class1_Sub2_Sub19 extends Class1_Sub2 {

	@OriginalMember(owner = "client!tc", name = "F", descriptor = "[I")
	private int[] anIntArray429;

	@OriginalMember(owner = "client!tc", name = "T", descriptor = "[I")
	public int[] anIntArray430;

	@OriginalMember(owner = "client!tc", name = "W", descriptor = "[S")
	private short[] aShortArray45;

	@OriginalMember(owner = "client!tc", name = "Z", descriptor = "[I")
	private int[] anIntArray431;

	@OriginalMember(owner = "client!tc", name = "gb", descriptor = "[S")
	private short[] aShortArray46;

	@OriginalMember(owner = "client!tc", name = "mb", descriptor = "[S")
	private short[] aShortArray47;

	@OriginalMember(owner = "client!tc", name = "xb", descriptor = "[S")
	private short[] aShortArray48;

	@OriginalMember(owner = "client!tc", name = "Ab", descriptor = "I")
	public int anInt3854;

	@OriginalMember(owner = "client!tc", name = "J", descriptor = "I")
	public int anInt3831 = -1;

	@OriginalMember(owner = "client!tc", name = "V", descriptor = "I")
	private int anInt3839 = 128;

	@OriginalMember(owner = "client!tc", name = "I", descriptor = "I")
	public int anInt3830 = -1;

	@OriginalMember(owner = "client!tc", name = "O", descriptor = "Z")
	public boolean aBoolean296 = true;

	@OriginalMember(owner = "client!tc", name = "Y", descriptor = "[Lclient!dd;")
	public final Class13[] aClass13Array26 = new Class13[5];

	@OriginalMember(owner = "client!tc", name = "bb", descriptor = "I")
	public int anInt3842 = -1;

	@OriginalMember(owner = "client!tc", name = "M", descriptor = "I")
	private int anInt3833 = -1;

	@OriginalMember(owner = "client!tc", name = "P", descriptor = "I")
	private int anInt3835 = 128;

	@OriginalMember(owner = "client!tc", name = "U", descriptor = "I")
	public int anInt3838 = -1;

	@OriginalMember(owner = "client!tc", name = "jb", descriptor = "I")
	private int anInt3846 = 0;

	@OriginalMember(owner = "client!tc", name = "R", descriptor = "I")
	public int anInt3836 = 1;

	@OriginalMember(owner = "client!tc", name = "qb", descriptor = "I")
	public int anInt3849 = -1;

	@OriginalMember(owner = "client!tc", name = "hb", descriptor = "Z")
	public boolean aBoolean297 = true;

	@OriginalMember(owner = "client!tc", name = "G", descriptor = "S")
	public short aShort35 = 0;

	@OriginalMember(owner = "client!tc", name = "rb", descriptor = "I")
	public int anInt3850 = -1;

	@OriginalMember(owner = "client!tc", name = "nb", descriptor = "S")
	public short aShort36 = 0;

	@OriginalMember(owner = "client!tc", name = "vb", descriptor = "I")
	private int anInt3852 = -1;

	@OriginalMember(owner = "client!tc", name = "pb", descriptor = "Z")
	public boolean aBoolean298 = false;

	@OriginalMember(owner = "client!tc", name = "zb", descriptor = "Lclient!dd;")
	public Class13 aClass13_1325 = Static12.aClass13_178;

	@OriginalMember(owner = "client!tc", name = "ub", descriptor = "I")
	public int anInt3851 = 32;

	@OriginalMember(owner = "client!tc", name = "lb", descriptor = "I")
	private int anInt3848 = 0;

	@OriginalMember(owner = "client!tc", name = "yb", descriptor = "I")
	public int anInt3853 = -1;

	@OriginalMember(owner = "client!tc", name = "Db", descriptor = "I")
	public int anInt3857 = -1;

	@OriginalMember(owner = "client!tc", name = "Cb", descriptor = "I")
	public int anInt3856 = -1;

	@OriginalMember(owner = "client!tc", name = "sb", descriptor = "Z")
	public boolean aBoolean299 = true;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZLclient!ce;I)V")
	private void method2793(@OriginalArg(1) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		@Pc(83) int local83;
		@Pc(93) int local93;
		if (arg1 == 1) {
			local83 = arg0.method1607();
			this.anIntArray429 = new int[local83];
			for (local93 = 0; local93 < local83; local93++) {
				this.anIntArray429[local93] = arg0.method1642();
			}
		} else if (arg1 == 2) {
			this.aClass13_1325 = arg0.method1622();
		} else if (arg1 == 12) {
			this.anInt3836 = arg0.method1607();
		} else if (arg1 == 13) {
			this.anInt3857 = arg0.method1642();
		} else if (arg1 == 14) {
			this.anInt3838 = arg0.method1642();
		} else if (arg1 == 15) {
			this.anInt3850 = arg0.method1642();
		} else if (arg1 == 16) {
			this.anInt3849 = arg0.method1642();
		} else if (arg1 == 17) {
			this.anInt3838 = arg0.method1642();
			this.anInt3830 = arg0.method1642();
			this.anInt3831 = arg0.method1642();
			this.anInt3842 = arg0.method1642();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass13Array26[arg1 - 30] = arg0.method1622();
			if (this.aClass13Array26[arg1 - 30].method894(Static42.aClass13_486)) {
				this.aClass13Array26[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local83 = arg0.method1607();
			this.aShortArray45 = new short[local83];
			this.aShortArray48 = new short[local83];
			for (local93 = 0; local93 < local83; local93++) {
				this.aShortArray45[local93] = (short) arg0.method1642();
				this.aShortArray48[local93] = (short) arg0.method1642();
			}
		} else if (arg1 == 41) {
			local83 = arg0.method1607();
			this.aShortArray47 = new short[local83];
			this.aShortArray46 = new short[local83];
			for (local93 = 0; local93 < local83; local93++) {
				this.aShortArray46[local93] = (short) arg0.method1642();
				this.aShortArray47[local93] = (short) arg0.method1642();
			}
		} else if (arg1 == 60) {
			local83 = arg0.method1607();
			this.anIntArray431 = new int[local83];
			for (local93 = 0; local93 < local83; local93++) {
				this.anIntArray431[local93] = arg0.method1642();
			}
		} else if (arg1 == 93) {
			this.aBoolean299 = false;
		} else if (arg1 == 95) {
			this.anInt3856 = arg0.method1642();
		} else if (arg1 == 97) {
			this.anInt3839 = arg0.method1642();
		} else if (arg1 == 98) {
			this.anInt3835 = arg0.method1642();
		} else if (arg1 == 99) {
			this.aBoolean298 = true;
		} else if (arg1 == 100) {
			this.anInt3848 = arg0.method1611();
		} else if (arg1 == 101) {
			this.anInt3846 = arg0.method1611() * 5;
		} else if (arg1 == 102) {
			this.anInt3853 = arg0.method1642();
		} else if (arg1 == 103) {
			this.anInt3851 = arg0.method1642();
		} else if (arg1 == 106) {
			this.anInt3852 = arg0.method1642();
			if (this.anInt3852 == 65535) {
				this.anInt3852 = -1;
			}
			this.anInt3833 = arg0.method1642();
			if (this.anInt3833 == 65535) {
				this.anInt3833 = -1;
			}
			local83 = arg0.method1607();
			this.anIntArray430 = new int[local83 + 1];
			for (local93 = 0; local93 <= local83; local93++) {
				this.anIntArray430[local93] = arg0.method1642();
				if (this.anIntArray430[local93] == 65535) {
					this.anIntArray430[local93] = -1;
				}
			}
		} else if (arg1 == 107) {
			this.aBoolean297 = false;
		} else if (arg1 == 109) {
			this.aBoolean296 = false;
		} else if (arg1 != 111) {
			if (arg1 == 113) {
				arg0.method1642();
				arg0.method1642();
			} else if (arg1 == 114) {
				arg0.method1611();
				arg0.method1611();
			} else if (arg1 == 115) {
				this.aShort36 = (short) (arg0.method1607() * 4);
				this.aShort35 = (short) (arg0.method1607() * 4);
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILclient!fa;Lclient!fa;I)Lclient!ia;")
	public Class1_Sub2_Sub2_Sub5 method2794(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub2_Sub8 arg1, @OriginalArg(3) Class1_Sub2_Sub8 arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray430 != null) {
			@Pc(19) Class1_Sub2_Sub19 local19 = this.method2798();
			return local19 == null ? null : local19.method2794(arg0, arg1, arg2, arg3);
		}
		@Pc(39) Class1_Sub2_Sub2_Sub5 local39 = (Class1_Sub2_Sub2_Sub5) Static129.aClass47_26.method1999((long) this.anInt3854);
		if (local39 == null) {
			@Pc(43) boolean local43 = false;
			for (@Pc(45) int local45 = 0; local45 < this.anIntArray429.length; local45++) {
				if (!Static37.aClass4_38.method2247(this.anIntArray429[local45], 0)) {
					local43 = true;
				}
			}
			if (local43) {
				return null;
			}
			@Pc(73) Class1_Sub2_Sub2_Sub1[] local73 = new Class1_Sub2_Sub2_Sub1[this.anIntArray429.length];
			for (@Pc(75) int local75 = 0; local75 < this.anIntArray429.length; local75++) {
				local73[local75] = Static13.method505(Static37.aClass4_38, this.anIntArray429[local75]);
			}
			@Pc(107) Class1_Sub2_Sub2_Sub1 local107;
			if (local73.length == 1) {
				local107 = local73[0];
			} else {
				local107 = new Class1_Sub2_Sub2_Sub1(local73, local73.length);
			}
			@Pc(121) int local121;
			if (this.aShortArray45 != null) {
				for (local121 = 0; local121 < this.aShortArray45.length; local121++) {
					local107.method513(this.aShortArray45[local121], this.aShortArray48[local121]);
				}
			}
			if (this.aShortArray46 != null) {
				for (local121 = 0; local121 < this.aShortArray46.length; local121++) {
					local107.method503(this.aShortArray46[local121], this.aShortArray47[local121]);
				}
			}
			local39 = local107.method511(this.anInt3848 + 64, 850 - -this.anInt3846, -30, -50, -30, true);
			Static129.aClass47_26.method1998(local39, (long) this.anInt3854);
		}
		@Pc(208) Class1_Sub2_Sub2_Sub5 local208;
		if (arg2 != null && arg1 != null) {
			local208 = arg2.method1205(arg3, local39, arg0, arg1);
		} else if (arg2 != null) {
			local208 = arg2.method1202(arg0, local39);
		} else if (arg1 == null) {
			local208 = local39.method2721(true);
		} else {
			local208 = arg1.method1202(arg3, local39);
		}
		if (this.anInt3839 != 128 || this.anInt3835 != 128) {
			local208.method2719(this.anInt3839, this.anInt3835, this.anInt3839);
		}
		return local208;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)Z")
	public boolean method2797() {
		if (this.anIntArray430 == null) {
			return true;
		}
		@Pc(15) int local15 = -1;
		if (this.anInt3852 != -1) {
			local15 = Static108.method2112(this.anInt3852);
		} else if (this.anInt3833 != -1) {
			local15 = Static103.anIntArray266[this.anInt3833];
		}
		return local15 >= 0 && this.anIntArray430.length > local15 && this.anIntArray430[local15] != -1;
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)Lclient!tc;")
	public Class1_Sub2_Sub19 method2798() {
		@Pc(6) int local6 = -1;
		if (this.anInt3852 != -1) {
			local6 = Static108.method2112(this.anInt3852);
		} else if (this.anInt3833 != -1) {
			local6 = Static103.anIntArray266[this.anInt3833];
		}
		return local6 < 0 || local6 >= this.anIntArray430.length || this.anIntArray430[local6] == -1 ? null : Static165.method2827(this.anIntArray430[local6]);
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(Z)V")
	public void method2799() {
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!fa;IZ)Lclient!ia;")
	public Class1_Sub2_Sub2_Sub5 method2801(@OriginalArg(0) Class1_Sub2_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray430 != null) {
			@Pc(12) Class1_Sub2_Sub19 local12 = this.method2798();
			return local12 == null ? null : local12.method2801(arg0, arg1);
		} else if (this.anIntArray431 == null) {
			return null;
		} else {
			@Pc(35) Class1_Sub2_Sub2_Sub5 local35 = (Class1_Sub2_Sub2_Sub5) Static119.aClass47_25.method1999((long) this.anInt3854);
			if (local35 == null) {
				@Pc(39) boolean local39 = false;
				for (@Pc(41) int local41 = 0; local41 < this.anIntArray431.length; local41++) {
					if (!Static37.aClass4_38.method2247(this.anIntArray431[local41], 0)) {
						local39 = true;
					}
				}
				if (local39) {
					return null;
				}
				@Pc(69) Class1_Sub2_Sub2_Sub1[] local69 = new Class1_Sub2_Sub2_Sub1[this.anIntArray431.length];
				for (@Pc(71) int local71 = 0; local71 < this.anIntArray431.length; local71++) {
					local69[local71] = Static13.method505(Static37.aClass4_38, this.anIntArray431[local71]);
				}
				@Pc(102) Class1_Sub2_Sub2_Sub1 local102;
				if (local69.length == 1) {
					local102 = local69[0];
				} else {
					local102 = new Class1_Sub2_Sub2_Sub1(local69, local69.length);
				}
				@Pc(113) int local113;
				if (this.aShortArray45 != null) {
					for (local113 = 0; local113 < this.aShortArray45.length; local113++) {
						local102.method513(this.aShortArray45[local113], this.aShortArray48[local113]);
					}
				}
				if (this.aShortArray46 != null) {
					for (local113 = 0; local113 < this.aShortArray46.length; local113++) {
						local102.method503(this.aShortArray46[local113], this.aShortArray47[local113]);
					}
				}
				local35 = local102.method511(64, 768, -50, -10, -50, true);
				Static119.aClass47_25.method1998(local35, (long) this.anInt3854);
			}
			if (arg0 != null) {
				local35 = arg0.method1204(arg1, local35);
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(Lclient!ce;I)V")
	public void method2802(@OriginalArg(0) Class1_Sub8 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method1607();
			if (local12 == 0) {
				return;
			}
			this.method2793(arg0, local12);
		}
	}
}
