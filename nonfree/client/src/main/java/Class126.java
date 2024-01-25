import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class126 {

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "Lclient!ffa;")
	public Class115 aClass115_1;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
	public int anInt2965 = 70;

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
	private int anInt2966 = -1;

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
	private int anInt2967 = -1;

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
	public int anInt2970 = 0;

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
	public int anInt2977 = -1;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
	public int anInt2969 = -1;

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
	public int anInt2981 = 0;

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
	public int anInt2985 = 16777215;

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
	public int anInt2973 = -1;

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
	private int anInt2971 = -1;

	@OriginalMember(owner = "client!gd", name = "A", descriptor = "Ljava/lang/String;")
	private String aString28 = "";

	@OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
	private int anInt2987 = -1;

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
	public int anInt2984 = 0;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!ha;I)Lclient!qda;")
	public Class59 method2640(@OriginalArg(0) Class143 arg0) {
		if (this.anInt2966 < 0) {
			return null;
		}
		@Pc(24) Class59 local24 = (Class59) this.aClass115_1.aClass265_6.method6577((long) this.anInt2966);
		if (local24 == null) {
			this.method2647(arg0);
			local24 = (Class59) this.aClass115_1.aClass265_6.method6577((long) this.anInt2966);
		}
		return local24;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!rv;B)V")
	public void method2642(@OriginalArg(0) Class5_Sub15 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method3642();
			if (local3 == 0) {
				return;
			}
			this.method2650(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!ha;)Lclient!qda;")
	public Class59 method2643(@OriginalArg(1) Class143 arg0) {
		if (this.anInt2967 < 0) {
			return null;
		}
		@Pc(21) Class59 local21 = (Class59) this.aClass115_1.aClass265_6.method6577((long) this.anInt2967);
		if (local21 == null) {
			this.method2647(arg0);
			local21 = (Class59) this.aClass115_1.aClass265_6.method6577((long) this.anInt2967);
		}
		return local21;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lclient!ha;I)Lclient!qda;")
	public Class59 method2645(@OriginalArg(0) Class143 arg0) {
		if (this.anInt2971 < 0) {
			return null;
		}
		@Pc(27) Class59 local27 = (Class59) this.aClass115_1.aClass265_6.method6577((long) this.anInt2971);
		if (local27 == null) {
			this.method2647(arg0);
			local27 = (Class59) this.aClass115_1.aClass265_6.method6577((long) this.anInt2971);
		}
		return local27;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(Lclient!ha;I)Lclient!qda;")
	public Class59 method2646(@OriginalArg(0) Class143 arg0) {
		if (this.anInt2987 < 0) {
			return null;
		}
		@Pc(18) Class59 local18 = (Class59) this.aClass115_1.aClass265_6.method6577((long) this.anInt2987);
		if (local18 == null) {
			this.method2647(arg0);
			local18 = (Class59) this.aClass115_1.aClass265_6.method6577((long) this.anInt2987);
		}
		return local18;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(ILclient!ha;)V")
	private void method2647(@OriginalArg(1) Class143 arg0) {
		@Pc(7) Class50 local7 = this.aClass115_1.aClass50_44;
		@Pc(32) Class301 local32;
		if (this.anInt2966 >= 0 && this.aClass115_1.aClass265_6.method6577((long) this.anInt2966) == null && local7.method897(this.anInt2966)) {
			local32 = Static684.method7235(local7, this.anInt2966);
			this.aClass115_1.aClass265_6.method6566(arg0.method6247(local32, true), (long) this.anInt2966);
		}
		if (this.anInt2987 >= 0 && this.aClass115_1.aClass265_6.method6577((long) this.anInt2987) == null && local7.method897(this.anInt2987)) {
			local32 = Static684.method7235(local7, this.anInt2987);
			this.aClass115_1.aClass265_6.method6566(arg0.method6247(local32, true), (long) this.anInt2987);
		}
		if (this.anInt2967 >= 0 && this.aClass115_1.aClass265_6.method6577((long) this.anInt2967) == null && local7.method897(this.anInt2967)) {
			local32 = Static684.method7235(local7, this.anInt2967);
			this.aClass115_1.aClass265_6.method6566(arg0.method6247(local32, true), (long) this.anInt2967);
		}
		if (this.anInt2971 >= 0 && this.aClass115_1.aClass265_6.method6577((long) this.anInt2971) == null && local7.method897(this.anInt2971)) {
			local32 = Static684.method7235(local7, this.anInt2971);
			this.aClass115_1.aClass265_6.method6566(arg0.method6247(local32, true), (long) this.anInt2971);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public String method2648(@OriginalArg(1) int arg0) {
		@Pc(11) String local11 = this.aString28;
		while (true) {
			@Pc(15) int local15 = local11.indexOf("%1");
			if (local15 < 0) {
				return local11;
			}
			local11 = local11.substring(0, local15) + Static436.method6548(false, arg0) + local11.substring(local15 + 2);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!rv;IB)V")
	private void method2650(@OriginalArg(0) Class5_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2973 = arg0.method3698();
		} else if (arg1 == 2) {
			this.anInt2985 = arg0.method3633();
		} else if (arg1 == 3) {
			this.anInt2966 = arg0.method3698();
		} else if (arg1 == 4) {
			this.anInt2967 = arg0.method3698();
		} else if (arg1 == 5) {
			this.anInt2987 = arg0.method3698();
		} else if (arg1 == 6) {
			this.anInt2971 = arg0.method3698();
		} else if (arg1 == 7) {
			this.anInt2981 = arg0.method3638();
		} else if (arg1 == 8) {
			this.aString28 = arg0.method3674();
		} else if (arg1 == 9) {
			this.anInt2965 = arg0.method3698();
		} else if (arg1 == 10) {
			this.anInt2984 = arg0.method3638();
		} else if (arg1 == 11) {
			this.anInt2977 = 0;
		} else if (arg1 == 12) {
			this.anInt2969 = arg0.method3642();
		} else if (arg1 == 13) {
			this.anInt2970 = arg0.method3638();
			return;
		} else if (arg1 == 14) {
			this.anInt2977 = arg0.method3698();
			return;
		}
	}
}
