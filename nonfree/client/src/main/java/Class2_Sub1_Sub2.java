import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ae", name = "O", descriptor = "[I")
	public int[] anIntArray17;

	@OriginalMember(owner = "client!ae", name = "U", descriptor = "[I")
	private int[] anIntArray18;

	@OriginalMember(owner = "client!ae", name = "V", descriptor = "[I")
	public int[] anIntArray19;

	@OriginalMember(owner = "client!ae", name = "lb", descriptor = "[I")
	private int[] anIntArray20;

	@OriginalMember(owner = "client!ae", name = "pb", descriptor = "[I")
	public int[] anIntArray21;

	@OriginalMember(owner = "client!ae", name = "M", descriptor = "Z")
	public boolean aBoolean9 = false;

	@OriginalMember(owner = "client!ae", name = "Y", descriptor = "I")
	public int anInt168 = 2;

	@OriginalMember(owner = "client!ae", name = "L", descriptor = "I")
	public int anInt160 = -1;

	@OriginalMember(owner = "client!ae", name = "fb", descriptor = "I")
	public int anInt172 = -1;

	@OriginalMember(owner = "client!ae", name = "jb", descriptor = "I")
	public int anInt175 = -1;

	@OriginalMember(owner = "client!ae", name = "bb", descriptor = "I")
	public int anInt170 = 99;

	@OriginalMember(owner = "client!ae", name = "ob", descriptor = "I")
	public int anInt179 = 5;

	@OriginalMember(owner = "client!ae", name = "T", descriptor = "I")
	public int anInt165 = -1;

	@OriginalMember(owner = "client!ae", name = "kb", descriptor = "I")
	public int anInt176 = -1;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!wb;II)Lclient!wb;")
	public Class2_Sub1_Sub1_Sub7 method117(@OriginalArg(0) Class2_Sub1_Sub1_Sub7 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray19[arg1];
		@Pc(14) Class2_Sub1_Sub5 local14 = Static9.method174(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method2012(true);
		}
		@Pc(26) int local26 = 0;
		@Pc(28) Class2_Sub1_Sub5 local28 = null;
		if (this.anIntArray18 != null && arg1 < this.anIntArray18.length) {
			local26 = this.anIntArray18[arg1];
			local28 = Static9.method174(local26 >> 16);
			local26 &= 0xFFFF;
		}
		@Pc(73) Class2_Sub1_Sub1_Sub7 local73;
		if (local28 == null || local26 == 65535) {
			local73 = arg0.method2012(!local14.method670(local18));
			local73.method2010(local14, local18);
			return local73;
		} else {
			local73 = arg0.method2012(!local14.method670(local18) & !local28.method670(local26));
			local73.method2010(local14, local18);
			local73.method2010(local28, local26);
			return local73;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!ae;IIILclient!wb;)Lclient!wb;")
	public Class2_Sub1_Sub1_Sub7 method118(@OriginalArg(0) Class2_Sub1_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub1_Sub1_Sub7 arg3) {
		@Pc(8) int local8 = this.anIntArray19[arg1];
		@Pc(14) Class2_Sub1_Sub5 local14 = Static9.method174(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method120(arg2, arg3);
		}
		@Pc(31) int local31 = arg0.anIntArray19[arg2];
		@Pc(37) Class2_Sub1_Sub5 local37 = Static9.method174(local31 >> 16);
		@Pc(47) int local47 = local31 & 0xFFFF;
		@Pc(60) Class2_Sub1_Sub1_Sub7 local60;
		if (local37 == null) {
			local60 = arg3.method2012(!local14.method670(local18));
			local60.method2010(local14, local18);
			return local60;
		} else {
			local60 = arg3.method2012(!local14.method670(local18) & !local37.method670(local47));
			local60.method2019(local14, local18, local37, local47, this.anIntArray20);
			return local60;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBLclient!wb;)Lclient!wb;")
	public Class2_Sub1_Sub1_Sub7 method120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub1_Sub7 arg1) {
		@Pc(4) int local4 = this.anIntArray19[arg0];
		@Pc(23) Class2_Sub1_Sub5 local23 = Static9.method174(local4 >> 16);
		@Pc(27) int local27 = local4 & 0xFFFF;
		if (local23 == null) {
			return arg1.method2012(true);
		} else {
			@Pc(44) Class2_Sub1_Sub1_Sub7 local44 = arg1.method2012(!local23.method670(local27));
			local44.method2010(local23, local27);
			return local44;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILclient!wb;I)Lclient!wb;")
	public Class2_Sub1_Sub1_Sub7 method122(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub1_Sub7 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = this.anIntArray19[arg2];
		@Pc(16) Class2_Sub1_Sub5 local16 = Static9.method174(local6 >> 16);
		@Pc(20) int local20 = local6 & 0xFFFF;
		if (local16 == null) {
			return arg1.method2012(true);
		}
		@Pc(35) int local35 = arg0 & 0x3;
		@Pc(46) Class2_Sub1_Sub1_Sub7 local46 = arg1.method2012(!local16.method670(local20));
		if (local35 == 1) {
			local46.method2017();
		} else if (local35 == 2) {
			local46.method2001();
		} else if (local35 == 3) {
			local46.method2008();
		}
		local46.method2010(local16, local20);
		if (local35 == 1) {
			local46.method2008();
		} else if (local35 == 2) {
			local46.method2001();
		} else if (local35 == 3) {
			local46.method2017();
		}
		return local46;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILclient!wb;)Lclient!wb;")
	public Class2_Sub1_Sub1_Sub7 method123(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub1_Sub7 arg1) {
		@Pc(8) int local8 = this.anIntArray19[arg0];
		@Pc(25) Class2_Sub1_Sub5 local25 = Static9.method174(local8 >> 16);
		@Pc(29) int local29 = local8 & 0xFFFF;
		if (local25 == null) {
			return arg1.method1999(true);
		} else {
			@Pc(46) Class2_Sub1_Sub1_Sub7 local46 = arg1.method1999(!local25.method670(local29));
			local46.method2010(local25, local29);
			return local46;
		}
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(B)V")
	public void method124() {
		if (this.anInt165 == -1) {
			if (this.anIntArray20 == null) {
				this.anInt165 = 0;
			} else {
				this.anInt165 = 2;
			}
		}
		if (this.anInt172 != -1) {
			return;
		}
		if (this.anIntArray20 == null) {
			this.anInt172 = 0;
		} else {
			this.anInt172 = 2;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLclient!be;)V")
	public void method127(@OriginalArg(1) Class2_Sub4 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method933();
			if (local3 == 0) {
				return;
			}
			this.method128(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLclient!be;I)V")
	private void method128(@OriginalArg(1) Class2_Sub4 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11;
		@Pc(17) int local17;
		@Pc(39) int local39;
		if (arg1 == 1) {
			local11 = arg0.method896();
			this.anIntArray21 = new int[local11];
			for (local17 = 0; local17 < local11; local17++) {
				this.anIntArray21[local17] = arg0.method896();
			}
			this.anIntArray19 = new int[local11];
			for (local39 = 0; local39 < local11; local39++) {
				this.anIntArray19[local39] = arg0.method896();
			}
			for (@Pc(53) int local53 = 0; local53 < local11; local53++) {
				this.anIntArray19[local53] += arg0.method896() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt160 = arg0.method896();
		} else if (arg1 == 3) {
			local11 = arg0.method933();
			this.anIntArray20 = new int[local11 + 1];
			for (local17 = 0; local17 < local11; local17++) {
				this.anIntArray20[local17] = arg0.method933();
			}
			this.anIntArray20[local11] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean9 = true;
		} else if (arg1 == 5) {
			this.anInt179 = arg0.method933();
		} else if (arg1 == 6) {
			this.anInt175 = arg0.method896();
		} else if (arg1 == 7) {
			this.anInt176 = arg0.method896();
		} else if (arg1 == 8) {
			this.anInt170 = arg0.method933();
		} else if (arg1 == 9) {
			this.anInt165 = arg0.method933();
		} else if (arg1 == 10) {
			this.anInt172 = arg0.method933();
		} else if (arg1 == 11) {
			this.anInt168 = arg0.method933();
		} else if (arg1 == 12) {
			local11 = arg0.method933();
			this.anIntArray18 = new int[local11];
			for (local17 = 0; local17 < local11; local17++) {
				this.anIntArray18[local17] = arg0.method896();
			}
			for (local39 = 0; local39 < local11; local39++) {
				this.anIntArray18[local39] += arg0.method896() << 16;
			}
		} else if (arg1 == 13) {
			local11 = arg0.method933();
			this.anIntArray17 = new int[local11];
			for (local17 = 0; local17 < local11; local17++) {
				this.anIntArray17[local17] = arg0.method940();
			}
		}
	}
}
