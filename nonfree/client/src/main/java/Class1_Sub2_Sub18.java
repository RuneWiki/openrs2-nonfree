import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class1_Sub2_Sub18 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ub", name = "S", descriptor = "[I")
	public int[] anIntArray393;

	@OriginalMember(owner = "client!ub", name = "V", descriptor = "[I")
	public int[] anIntArray394;

	@OriginalMember(owner = "client!ub", name = "W", descriptor = "[I")
	private int[] anIntArray395;

	@OriginalMember(owner = "client!ub", name = "cb", descriptor = "[I")
	public int[] anIntArray396;

	@OriginalMember(owner = "client!ub", name = "fb", descriptor = "[I")
	private int[] anIntArray397;

	@OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
	public int anInt3793 = -1;

	@OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
	public int anInt3789 = 5;

	@OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
	public int anInt3797 = -1;

	@OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
	public int anInt3792 = 99;

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
	public int anInt3788 = -1;

	@OriginalMember(owner = "client!ub", name = "ab", descriptor = "I")
	public int anInt3803 = -1;

	@OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
	public int anInt3800 = 2;

	@OriginalMember(owner = "client!ub", name = "eb", descriptor = "I")
	public int anInt3806 = -1;

	@OriginalMember(owner = "client!ub", name = "hb", descriptor = "Z")
	public boolean aBoolean156 = false;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BILclient!oh;)Lclient!oh;")
	public Class1_Sub2_Sub1_Sub4 method2887(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub2_Sub1_Sub4 arg1) {
		@Pc(4) int local4 = this.anIntArray396[arg0];
		@Pc(10) Class1_Sub2_Sub6 local10 = Static21.method419(local4 >> 16);
		@Pc(14) int local14 = local4 & 0xFFFF;
		if (local10 == null) {
			return arg1.method1446(true);
		} else {
			@Pc(35) Class1_Sub2_Sub1_Sub4 local35 = arg1.method1446(!local10.method869(local14));
			local35.method1448(local10, local14);
			return local35;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!oh;II)Lclient!oh;")
	public Class1_Sub2_Sub1_Sub4 method2889(@OriginalArg(0) Class1_Sub2_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anIntArray396[arg1];
		@Pc(14) Class1_Sub2_Sub6 local14 = Static21.method419(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1446(true);
		}
		@Pc(26) Class1_Sub2_Sub6 local26 = null;
		@Pc(28) int local28 = 0;
		if (this.anIntArray397 != null && this.anIntArray397.length > arg1) {
			local28 = this.anIntArray397[arg1];
			local26 = Static21.method419(local28 >> 16);
			local28 &= 0xFFFF;
		}
		@Pc(73) Class1_Sub2_Sub1_Sub4 local73;
		if (local26 == null || local28 == 65535) {
			local73 = arg0.method1446(!local14.method869(local18));
			local73.method1448(local14, local18);
			return local73;
		} else {
			local73 = arg0.method1446(!local14.method869(local18) & !local26.method869(local28));
			local73.method1448(local14, local18);
			local73.method1448(local26, local28);
			return local73;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!ka;B)V")
	private void method2891(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub8 arg1) {
		@Pc(102) int local102;
		@Pc(108) int local108;
		@Pc(155) int local155;
		if (arg0 == 1) {
			local102 = arg1.method359();
			this.anIntArray394 = new int[local102];
			for (local108 = 0; local108 < local102; local108++) {
				this.anIntArray394[local108] = arg1.method359();
			}
			this.anIntArray396 = new int[local102];
			for (local155 = 0; local155 < local102; local155++) {
				this.anIntArray396[local155] = arg1.method359();
			}
			for (@Pc(280) int local280 = 0; local280 < local102; local280++) {
				this.anIntArray396[local280] = (arg1.method359() << 16) + this.anIntArray396[local280];
			}
		} else if (arg0 == 2) {
			this.anInt3793 = arg1.method359();
		} else if (arg0 == 3) {
			local102 = arg1.method336();
			this.anIntArray395 = new int[local102 + 1];
			for (local108 = 0; local108 < local102; local108++) {
				this.anIntArray395[local108] = arg1.method336();
			}
			this.anIntArray395[local102] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean156 = true;
		} else if (arg0 == 5) {
			this.anInt3789 = arg1.method336();
		} else if (arg0 == 6) {
			this.anInt3803 = arg1.method359();
		} else if (arg0 == 7) {
			this.anInt3797 = arg1.method359();
		} else if (arg0 == 8) {
			this.anInt3792 = arg1.method336();
		} else if (arg0 == 9) {
			this.anInt3788 = arg1.method336();
		} else if (arg0 == 10) {
			this.anInt3806 = arg1.method336();
		} else if (arg0 == 11) {
			this.anInt3800 = arg1.method336();
		} else if (arg0 == 12) {
			local102 = arg1.method336();
			this.anIntArray397 = new int[local102];
			for (local108 = 0; local108 < local102; local108++) {
				this.anIntArray397[local108] = arg1.method359();
			}
			for (local155 = 0; local155 < local102; local155++) {
				this.anIntArray397[local155] = (arg1.method359() << 16) + this.anIntArray397[local155];
			}
		} else if (arg0 == 13) {
			local102 = arg1.method336();
			this.anIntArray393 = new int[local102];
			for (local108 = 0; local108 < local102; local108++) {
				this.anIntArray393[local108] = arg1.method316();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!oh;IIB)Lclient!oh;")
	public Class1_Sub2_Sub1_Sub4 method2893(@OriginalArg(0) Class1_Sub2_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = this.anIntArray396[arg1];
		@Pc(16) Class1_Sub2_Sub6 local16 = Static21.method419(local10 >> 16);
		@Pc(20) int local20 = local10 & 0xFFFF;
		if (local16 == null) {
			return arg0.method1446(true);
		}
		@Pc(30) int local30 = arg2 & 0x3;
		@Pc(46) Class1_Sub2_Sub1_Sub4 local46 = arg0.method1446(!local16.method869(local20));
		if (local30 == 1) {
			local46.method1454();
		} else if (local30 == 2) {
			local46.method1455();
		} else if (local30 == 3) {
			local46.method1453();
		}
		local46.method1448(local16, local20);
		if (local30 == 1) {
			local46.method1453();
		} else if (local30 == 2) {
			local46.method1455();
		} else if (local30 == 3) {
			local46.method1454();
		}
		return local46;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!ka;)V")
	public void method2895(@OriginalArg(1) Class1_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method336();
			if (local9 == 0) {
				return;
			}
			this.method2891(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(Z)V")
	public void method2896() {
		if (this.anInt3806 == -1) {
			if (this.anIntArray395 == null) {
				this.anInt3806 = 0;
			} else {
				this.anInt3806 = 2;
			}
		}
		if (this.anInt3788 != -1) {
			return;
		}
		if (this.anIntArray395 == null) {
			this.anInt3788 = 0;
		} else {
			this.anInt3788 = 2;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!oh;B)Lclient!oh;")
	public Class1_Sub2_Sub1_Sub4 method2897(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2_Sub1_Sub4 arg1) {
		@Pc(8) int local8 = this.anIntArray396[arg0];
		@Pc(19) Class1_Sub2_Sub6 local19 = Static21.method419(local8 >> 16);
		@Pc(23) int local23 = local8 & 0xFFFF;
		if (local19 == null) {
			return arg1.method1461(true);
		} else {
			@Pc(40) Class1_Sub2_Sub1_Sub4 local40 = arg1.method1461(!local19.method869(local23));
			local40.method1448(local19, local23);
			return local40;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!oh;IILclient!ub;)Lclient!oh;")
	public Class1_Sub2_Sub1_Sub4 method2899(@OriginalArg(1) Class1_Sub2_Sub1_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub2_Sub18 arg3) {
		@Pc(8) int local8 = this.anIntArray396[arg1];
		@Pc(14) Class1_Sub2_Sub6 local14 = Static21.method419(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg3.method2887(arg2, arg0);
		}
		@Pc(31) int local31 = arg3.anIntArray396[arg2];
		@Pc(37) Class1_Sub2_Sub6 local37 = Static21.method419(local31 >> 16);
		@Pc(41) int local41 = local31 & 0xFFFF;
		@Pc(54) Class1_Sub2_Sub1_Sub4 local54;
		if (local37 == null) {
			local54 = arg0.method1446(!local14.method869(local18));
			local54.method1448(local14, local18);
			return local54;
		} else {
			local54 = arg0.method1446(!local14.method869(local18) & !local37.method869(local41));
			local54.method1451(local14, local18, local37, local41, this.anIntArray395);
			return local54;
		}
	}
}
