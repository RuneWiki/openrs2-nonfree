import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eja")
public final class Class102 {

	@OriginalMember(owner = "client!eja", name = "r", descriptor = "Lclient!cp;")
	public Class70 aClass70_1;

	@OriginalMember(owner = "client!eja", name = "b", descriptor = "I")
	public int anInt2761 = 0;

	@OriginalMember(owner = "client!eja", name = "c", descriptor = "I")
	public int anInt2762 = -1;

	@OriginalMember(owner = "client!eja", name = "e", descriptor = "I")
	private int anInt2764 = -1;

	@OriginalMember(owner = "client!eja", name = "i", descriptor = "I")
	public int anInt2767 = -1;

	@OriginalMember(owner = "client!eja", name = "d", descriptor = "I")
	public int anInt2763 = -1;

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "I")
	public int anInt2760 = 70;

	@OriginalMember(owner = "client!eja", name = "j", descriptor = "I")
	private int anInt2768 = -1;

	@OriginalMember(owner = "client!eja", name = "p", descriptor = "I")
	private int anInt2773 = -1;

	@OriginalMember(owner = "client!eja", name = "q", descriptor = "I")
	public int anInt2774 = 0;

	@OriginalMember(owner = "client!eja", name = "m", descriptor = "I")
	public int anInt2770 = 16777215;

	@OriginalMember(owner = "client!eja", name = "x", descriptor = "I")
	public int anInt2780 = 0;

	@OriginalMember(owner = "client!eja", name = "B", descriptor = "Ljava/lang/String;")
	private String aString15 = "";

	@OriginalMember(owner = "client!eja", name = "z", descriptor = "I")
	private int anInt2781 = -1;

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(Lclient!ha;B)V")
	private void method2481(@OriginalArg(0) Class65 arg0) {
		@Pc(7) Class390 local7 = this.aClass70_1.aClass390_17;
		@Pc(30) Class369 local30;
		if (this.anInt2773 >= 0 && this.aClass70_1.aClass340_7.method7999((long) this.anInt2773) == null && local7.method8905(this.anInt2773)) {
			local30 = Static689.method8548(local7, this.anInt2773);
			this.aClass70_1.aClass340_7.method7986((long) this.anInt2773, arg0.method6898(local30, true));
		}
		if (this.anInt2781 >= 0 && this.aClass70_1.aClass340_7.method7999((long) this.anInt2781) == null && local7.method8905(this.anInt2781)) {
			local30 = Static689.method8548(local7, this.anInt2781);
			this.aClass70_1.aClass340_7.method7986((long) this.anInt2781, arg0.method6898(local30, true));
		}
		if (this.anInt2768 >= 0 && this.aClass70_1.aClass340_7.method7999((long) this.anInt2768) == null && local7.method8905(this.anInt2768)) {
			local30 = Static689.method8548(local7, this.anInt2768);
			this.aClass70_1.aClass340_7.method7986((long) this.anInt2768, arg0.method6898(local30, true));
		}
		if (this.anInt2764 >= 0 && this.aClass70_1.aClass340_7.method7999((long) this.anInt2764) == null && local7.method8905(this.anInt2764)) {
			local30 = Static689.method8548(local7, this.anInt2764);
			this.aClass70_1.aClass340_7.method7986((long) this.anInt2764, arg0.method6898(local30, true));
		}
	}

	@OriginalMember(owner = "client!eja", name = "b", descriptor = "(Lclient!ha;B)Lclient!pu;")
	public Class50 method2483(@OriginalArg(0) Class65 arg0) {
		if (this.anInt2768 < 0) {
			return null;
		}
		@Pc(21) Class50 local21 = (Class50) this.aClass70_1.aClass340_7.method7999((long) this.anInt2768);
		if (local21 == null) {
			this.method2481(arg0);
			local21 = (Class50) this.aClass70_1.aClass340_7.method7999((long) this.anInt2768);
		}
		return local21;
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(ILclient!mc;I)V")
	private void method2484(@OriginalArg(1) Class5_Sub41 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2762 = arg0.method7860();
		} else if (arg1 == 2) {
			this.anInt2770 = arg0.method7807();
		} else if (arg1 == 3) {
			this.anInt2773 = arg0.method7860();
		} else if (arg1 == 4) {
			this.anInt2768 = arg0.method7860();
		} else if (arg1 == 5) {
			this.anInt2781 = arg0.method7860();
		} else if (arg1 == 6) {
			this.anInt2764 = arg0.method7860();
		} else if (arg1 == 7) {
			this.anInt2774 = arg0.method7849();
		} else if (arg1 == 8) {
			this.aString15 = arg0.method7813();
		} else if (arg1 == 9) {
			this.anInt2760 = arg0.method7860();
		} else if (arg1 == 10) {
			this.anInt2780 = arg0.method7849();
		} else if (arg1 == 11) {
			this.anInt2767 = 0;
		} else if (arg1 == 12) {
			this.anInt2763 = arg0.method7816();
		} else if (arg1 == 13) {
			this.anInt2761 = arg0.method7849();
			return;
		} else if (arg1 == 14) {
			this.anInt2767 = arg0.method7860();
			return;
		}
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(ILclient!mc;)V")
	public void method2485(@OriginalArg(1) Class5_Sub41 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method7816();
			if (local15 == 0) {
				return;
			}
			this.method2484(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public String method2487(@OriginalArg(1) int arg0) {
		@Pc(16) String local16 = this.aString15;
		while (true) {
			@Pc(20) int local20 = local16.indexOf("%1");
			if (local20 < 0) {
				return local16;
			}
			local16 = local16.substring(0, local20) + Static239.method3753(arg0, false) + local16.substring(local20 + 2);
		}
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(Lclient!ha;I)Lclient!pu;")
	public Class50 method2488(@OriginalArg(0) Class65 arg0) {
		if (this.anInt2781 < 0) {
			return null;
		}
		@Pc(19) Class50 local19 = (Class50) this.aClass70_1.aClass340_7.method7999((long) this.anInt2781);
		if (local19 == null) {
			this.method2481(arg0);
			local19 = (Class50) this.aClass70_1.aClass340_7.method7999((long) this.anInt2781);
		}
		return local19;
	}

	@OriginalMember(owner = "client!eja", name = "b", descriptor = "(Lclient!ha;I)Lclient!pu;")
	public Class50 method2489(@OriginalArg(0) Class65 arg0) {
		if (this.anInt2764 < 0) {
			return null;
		}
		@Pc(21) Class50 local21 = (Class50) this.aClass70_1.aClass340_7.method7999((long) this.anInt2764);
		if (local21 == null) {
			this.method2481(arg0);
			local21 = (Class50) this.aClass70_1.aClass340_7.method7999((long) this.anInt2764);
		}
		return local21;
	}

	@OriginalMember(owner = "client!eja", name = "c", descriptor = "(Lclient!ha;B)Lclient!pu;")
	public Class50 method2490(@OriginalArg(0) Class65 arg0) {
		if (this.anInt2773 < 0) {
			return null;
		}
		@Pc(23) Class50 local23 = (Class50) this.aClass70_1.aClass340_7.method7999((long) this.anInt2773);
		if (local23 == null) {
			this.method2481(arg0);
			local23 = (Class50) this.aClass70_1.aClass340_7.method7999((long) this.anInt2773);
		}
		return local23;
	}
}
