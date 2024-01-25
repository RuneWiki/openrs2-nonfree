import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class21 {

	@OriginalMember(owner = "client!bt", name = "l", descriptor = "Lclient!ig;")
	private final Class89 aClass89_1 = new Class89();

	@OriginalMember(owner = "client!bt", name = "m", descriptor = "I")
	private int anInt820;

	@OriginalMember(owner = "client!bt", name = "t", descriptor = "I")
	private final int anInt826;

	@OriginalMember(owner = "client!bt", name = "r", descriptor = "Lclient!dq;")
	private final Class38 aClass38_2;

	static {
		new Class106("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	}

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(I)V")
	public Class21(@OriginalArg(0) int arg0) {
		this.anInt820 = arg0;
		this.anInt826 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass38_2 = new Class38(local14);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZLjava/lang/Object;J)V")
	public void method843(@OriginalArg(1) Object arg0, @OriginalArg(2) long arg1) {
		this.method850(arg1, arg0);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IZ)V")
	public void method844(@OriginalArg(0) int arg0) {
		if (Static276.aClass57_1 == null) {
			return;
		}
		for (@Pc(19) Class1_Sub4_Sub14 local19 = (Class1_Sub4_Sub14) this.aClass89_1.method2718(); local19 != null; local19 = (Class1_Sub4_Sub14) this.aClass89_1.method2726()) {
			if (local19.method4960()) {
				if (local19.method4959() == null) {
					local19.method6045();
					local19.method5714();
					this.anInt820++;
				}
			} else if (++local19.aLong211 > (long) arg0) {
				@Pc(41) Class1_Sub4_Sub14 local41 = Static276.aClass57_1.method1819(local19);
				this.aClass38_2.method1472(local41, local19.aLong217);
				Static217.method4013(local19, local41);
				local19.method6045();
				local19.method5714();
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)I")
	public int method845() {
		return this.anInt820;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(B)Ljava/lang/Object;")
	public Object method846() {
		@Pc(19) Class1_Sub4_Sub14 local19 = (Class1_Sub4_Sub14) this.aClass38_2.method1470();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.method4959();
			if (local25 != null) {
				return local25;
			}
			@Pc(29) Class1_Sub4_Sub14 local29 = local19;
			local19 = (Class1_Sub4_Sub14) this.aClass38_2.method1470();
			local29.method6045();
			local29.method5714();
			this.anInt820 += local19.anInt5412;
		}
		return null;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public Object method848() {
		@Pc(18) Class1_Sub4_Sub14 local18 = (Class1_Sub4_Sub14) this.aClass38_2.method1474();
		while (local18 != null) {
			@Pc(24) Object local24 = local18.method4959();
			if (local24 != null) {
				return local24;
			}
			@Pc(30) Class1_Sub4_Sub14 local30 = local18;
			local18 = (Class1_Sub4_Sub14) this.aClass38_2.method1470();
			local30.method6045();
			local30.method5714();
			this.anInt820 += local18.anInt5412;
		}
		return null;
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(B)I")
	public int method849() {
		return this.anInt826;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIJLjava/lang/Object;)V")
	private void method850(@OriginalArg(2) long arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt826 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method858(arg0);
		this.anInt820--;
		while (this.anInt820 < 0) {
			@Pc(32) Class1_Sub4_Sub14 local32 = (Class1_Sub4_Sub14) this.aClass89_1.method2722();
			this.method852(local32);
		}
		@Pc(45) Class1_Sub4_Sub14_Sub1 local45 = new Class1_Sub4_Sub14_Sub1(arg1, 1);
		this.aClass38_2.method1472(local45, arg0);
		this.aClass89_1.method2720(local45);
		local45.aLong211 = 0L;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V")
	public void method851() {
		for (@Pc(15) Class1_Sub4_Sub14 local15 = (Class1_Sub4_Sub14) this.aClass89_1.method2718(); local15 != null; local15 = (Class1_Sub4_Sub14) this.aClass89_1.method2726()) {
			if (local15.method4960()) {
				local15.method6045();
				local15.method5714();
				this.anInt820 += local15.anInt5412;
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZLclient!jj;)V")
	private void method852(@OriginalArg(1) Class1_Sub4_Sub14 arg0) {
		if (arg0 != null) {
			arg0.method6045();
			arg0.method5714();
			this.anInt820 += arg0.anInt5412;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
	public Object method854(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub4_Sub14 local10 = (Class1_Sub4_Sub14) this.aClass38_2.method1475(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method4959();
		if (local18 == null) {
			local10.method6045();
			local10.method5714();
			this.anInt820 += local10.anInt5412;
			return null;
		}
		if (local10.method4960()) {
			@Pc(51) Class1_Sub4_Sub14_Sub1 local51 = new Class1_Sub4_Sub14_Sub1(local18, local10.anInt5412);
			this.aClass38_2.method1472(local51, local10.aLong217);
			this.aClass89_1.method2720(local51);
			local51.aLong211 = 0L;
			local10.method6045();
			local10.method5714();
		} else {
			this.aClass89_1.method2720(local10);
			local10.aLong211 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(I)I")
	public int method855() {
		@Pc(7) int local7 = 0;
		for (@Pc(21) Class1_Sub4_Sub14 local21 = (Class1_Sub4_Sub14) this.aClass89_1.method2718(); local21 != null; local21 = (Class1_Sub4_Sub14) this.aClass89_1.method2726()) {
			if (!local21.method4960()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(I)V")
	public void method857() {
		this.aClass89_1.method2723();
		this.aClass38_2.method1466();
		this.anInt820 = this.anInt826;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IJ)V")
	private void method858(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub4_Sub14 local10 = (Class1_Sub4_Sub14) this.aClass38_2.method1475(arg0);
		this.method852(local10);
	}
}
