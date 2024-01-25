import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class102 {

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "Lclient!hv;")
	public Class137 aClass137_1;

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
	private int anInt3620 = -1;

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
	public int anInt3622 = -1;

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
	private int anInt3630 = -1;

	@OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
	public int anInt3625 = -1;

	@OriginalMember(owner = "client!fj", name = "q", descriptor = "I")
	public int anInt3633 = 0;

	@OriginalMember(owner = "client!fj", name = "o", descriptor = "I")
	public int anInt3632 = 16777215;

	@OriginalMember(owner = "client!fj", name = "u", descriptor = "I")
	public int anInt3637 = 70;

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
	private int anInt3623 = -1;

	@OriginalMember(owner = "client!fj", name = "v", descriptor = "I")
	private int anInt3638 = -1;

	@OriginalMember(owner = "client!fj", name = "x", descriptor = "I")
	public int anInt3640 = 0;

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
	public int anInt3626 = 0;

	@OriginalMember(owner = "client!fj", name = "z", descriptor = "I")
	public int anInt3641 = -1;

	@OriginalMember(owner = "client!fj", name = "y", descriptor = "Ljava/lang/String;")
	private String aString30 = "";

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILclient!ji;)V")
	private void method3110(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt3641 = arg1.method8220();
		} else if (arg0 == 2) {
			this.anInt3632 = arg1.method8203();
		} else if (arg0 == 3) {
			this.anInt3620 = arg1.method8220();
		} else if (arg0 == 4) {
			this.anInt3623 = arg1.method8220();
		} else if (arg0 == 5) {
			this.anInt3638 = arg1.method8220();
		} else if (arg0 == 6) {
			this.anInt3630 = arg1.method8220();
		} else if (arg0 == 7) {
			this.anInt3640 = arg1.method8231();
		} else if (arg0 == 8) {
			this.aString30 = arg1.method8240();
		} else if (arg0 == 9) {
			this.anInt3637 = arg1.method8220();
		} else if (arg0 == 10) {
			this.anInt3633 = arg1.method8231();
		} else if (arg0 == 11) {
			this.anInt3625 = 0;
		} else if (arg0 == 12) {
			this.anInt3622 = arg1.method8246();
		} else if (arg0 == 13) {
			this.anInt3626 = arg1.method8231();
		} else if (arg0 == 14) {
			this.anInt3625 = arg1.method8220();
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZLclient!ha;)Lclient!ufa;")
	public Class4 method3115(@OriginalArg(1) Class5 arg0) {
		if (this.anInt3620 < 0) {
			return null;
		}
		@Pc(24) Class4 local24 = (Class4) this.aClass137_1.aClass94_19.method2960((long) this.anInt3620);
		if (local24 == null) {
			this.method3116(arg0);
			local24 = (Class4) this.aClass137_1.aClass94_19.method2960((long) this.anInt3620);
		}
		return local24;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILclient!ha;)V")
	private void method3116(@OriginalArg(1) Class5 arg0) {
		@Pc(15) Class223 local15 = this.aClass137_1.aClass223_55;
		@Pc(38) Class331 local38;
		if (this.anInt3620 >= 0 && this.aClass137_1.aClass94_19.method2960((long) this.anInt3620) == null && local15.method5951(this.anInt3620)) {
			local38 = Static655.method7890(local15, this.anInt3620);
			this.aClass137_1.aClass94_19.method2963((long) this.anInt3620, arg0.method6121(local38, true));
		}
		if (this.anInt3638 >= 0 && this.aClass137_1.aClass94_19.method2960((long) this.anInt3638) == null && local15.method5951(this.anInt3638)) {
			local38 = Static655.method7890(local15, this.anInt3638);
			this.aClass137_1.aClass94_19.method2963((long) this.anInt3638, arg0.method6121(local38, true));
		}
		if (this.anInt3623 >= 0 && this.aClass137_1.aClass94_19.method2960((long) this.anInt3623) == null && local15.method5951(this.anInt3623)) {
			local38 = Static655.method7890(local15, this.anInt3623);
			this.aClass137_1.aClass94_19.method2963((long) this.anInt3623, arg0.method6121(local38, true));
		}
		if (this.anInt3630 >= 0 && this.aClass137_1.aClass94_19.method2960((long) this.anInt3630) == null && local15.method5951(this.anInt3630)) {
			local38 = Static655.method7890(local15, this.anInt3630);
			this.aClass137_1.aClass94_19.method2963((long) this.anInt3630, arg0.method6121(local38, true));
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method3117(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = this.aString30;
		while (true) {
			@Pc(18) int local18 = local8.indexOf("%1");
			if (local18 < 0) {
				return local8;
			}
			local8 = local8.substring(0, local18) + Static90.method2286(arg0, false) + local8.substring(local18 + 2);
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!ha;I)Lclient!ufa;")
	public Class4 method3118(@OriginalArg(0) Class5 arg0) {
		if (this.anInt3623 < 0) {
			return null;
		}
		@Pc(29) Class4 local29 = (Class4) this.aClass137_1.aClass94_19.method2960((long) this.anInt3623);
		if (local29 == null) {
			this.method3116(arg0);
			local29 = (Class4) this.aClass137_1.aClass94_19.method2960((long) this.anInt3623);
		}
		return local29;
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(ILclient!ha;)Lclient!ufa;")
	public Class4 method3119(@OriginalArg(1) Class5 arg0) {
		if (this.anInt3630 < 0) {
			return null;
		}
		@Pc(21) Class4 local21 = (Class4) this.aClass137_1.aClass94_19.method2960((long) this.anInt3630);
		if (local21 == null) {
			this.method3116(arg0);
			local21 = (Class4) this.aClass137_1.aClass94_19.method2960((long) this.anInt3630);
		}
		return local21;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!ji;I)V")
	public void method3120(@OriginalArg(0) Class6_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8246();
			if (local9 == 0) {
				return;
			}
			this.method3110(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(ILclient!ha;)Lclient!ufa;")
	public Class4 method3121(@OriginalArg(1) Class5 arg0) {
		if (this.anInt3638 < 0) {
			return null;
		}
		@Pc(18) Class4 local18 = (Class4) this.aClass137_1.aClass94_19.method2960((long) this.anInt3638);
		if (local18 == null) {
			this.method3116(arg0);
			local18 = (Class4) this.aClass137_1.aClass94_19.method2960((long) this.anInt3638);
		}
		return local18;
	}
}
