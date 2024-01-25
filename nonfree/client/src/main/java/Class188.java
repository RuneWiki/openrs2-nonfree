import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class188 {

	@OriginalMember(owner = "client!of", name = "p", descriptor = "Lclient!em;")
	private final Class71 aClass71_4 = new Class71();

	@OriginalMember(owner = "client!of", name = "k", descriptor = "I")
	private int anInt5242;

	@OriginalMember(owner = "client!of", name = "y", descriptor = "I")
	private final int anInt5252;

	@OriginalMember(owner = "client!of", name = "r", descriptor = "Lclient!ru;")
	private final Class220 aClass220_26;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(I)V")
	public Class188(@OriginalArg(0) int arg0) {
		this.anInt5242 = arg0;
		this.anInt5252 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass220_26 = new Class220(local14);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)I")
	public int method4153() {
		@Pc(5) int local5 = 0;
		for (@Pc(13) Class2_Sub1_Sub3 local13 = (Class2_Sub1_Sub3) this.aClass71_4.method1431(); local13 != null; local13 = (Class2_Sub1_Sub3) this.aClass71_4.method1428()) {
			if (!local13.method5179()) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
	public void method4154() {
		for (@Pc(16) Class2_Sub1_Sub3 local16 = (Class2_Sub1_Sub3) this.aClass71_4.method1431(); local16 != null; local16 = (Class2_Sub1_Sub3) this.aClass71_4.method1428()) {
			if (local16.method5179()) {
				local16.method6260();
				local16.method5838();
				this.anInt5242 += local16.anInt6505;
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IJLjava/lang/Object;)V")
	public void method4155(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1) {
		this.method4166(arg1, arg0);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
	public void method4156() {
		this.aClass71_4.method1429();
		this.aClass220_26.method5105();
		this.anInt5242 = this.anInt5252;
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public Object method4157() {
		@Pc(17) Class2_Sub1_Sub3 local17 = (Class2_Sub1_Sub3) this.aClass220_26.method5096();
		while (local17 != null) {
			@Pc(23) Object local23 = local17.method5178();
			if (local23 != null) {
				return local23;
			}
			@Pc(29) Class2_Sub1_Sub3 local29 = local17;
			local17 = (Class2_Sub1_Sub3) this.aClass220_26.method5098();
			local29.method6260();
			local29.method5838();
			this.anInt5242 += local17.anInt6505;
		}
		return null;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
	public Object method4158(@OriginalArg(1) long arg0) {
		@Pc(15) Class2_Sub1_Sub3 local15 = (Class2_Sub1_Sub3) this.aClass220_26.method5099(arg0);
		if (local15 == null) {
			return null;
		}
		@Pc(23) Object local23 = local15.method5178();
		if (local23 == null) {
			local15.method6260();
			local15.method5838();
			this.anInt5242 += local15.anInt6505;
			return null;
		}
		if (local15.method5179()) {
			@Pc(62) Class2_Sub1_Sub3_Sub2 local62 = new Class2_Sub1_Sub3_Sub2(local23, local15.anInt6505);
			this.aClass220_26.method5104(local62, local15.aLong401);
			this.aClass71_4.method1430(local62);
			local62.aLong378 = 0L;
			local15.method6260();
			local15.method5838();
		} else {
			this.aClass71_4.method1430(local15);
			local15.aLong378 = 0L;
		}
		return local23;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!cr;)V")
	private void method4159(@OriginalArg(1) Class2_Sub1_Sub3 arg0) {
		if (arg0 != null) {
			arg0.method6260();
			arg0.method5838();
			this.anInt5242 += arg0.anInt6505;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IJ)V")
	private void method4162(@OriginalArg(1) long arg0) {
		@Pc(16) Class2_Sub1_Sub3 local16 = (Class2_Sub1_Sub3) this.aClass220_26.method5099(arg0);
		this.method4159(local16);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(B)I")
	public int method4163() {
		return this.anInt5242;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BILjava/lang/Object;J)V")
	private void method4166(@OriginalArg(2) Object arg0, @OriginalArg(3) long arg1) {
		if (this.anInt5252 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method4162(arg1);
		this.anInt5242--;
		while (this.anInt5242 < 0) {
			@Pc(33) Class2_Sub1_Sub3 local33 = (Class2_Sub1_Sub3) this.aClass71_4.method1434();
			this.method4159(local33);
		}
		@Pc(49) Class2_Sub1_Sub3_Sub2 local49 = new Class2_Sub1_Sub3_Sub2(arg0, 1);
		this.aClass220_26.method5104(local49, arg1);
		this.aClass71_4.method1430(local49);
		local49.aLong378 = 0L;
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(B)I")
	public int method4167() {
		return this.anInt5252;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(Z)Ljava/lang/Object;")
	public Object method4168() {
		@Pc(11) Class2_Sub1_Sub3 local11 = (Class2_Sub1_Sub3) this.aClass220_26.method5098();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method5178();
			if (local17 != null) {
				return local17;
			}
			@Pc(21) Class2_Sub1_Sub3 local21 = local11;
			local11 = (Class2_Sub1_Sub3) this.aClass220_26.method5098();
			local21.method6260();
			local21.method5838();
			this.anInt5242 += local11.anInt6505;
		}
		return null;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(II)V")
	public void method4169(@OriginalArg(1) int arg0) {
		if (Static287.aClass46_1 == null) {
			return;
		}
		for (@Pc(18) Class2_Sub1_Sub3 local18 = (Class2_Sub1_Sub3) this.aClass71_4.method1431(); local18 != null; local18 = (Class2_Sub1_Sub3) this.aClass71_4.method1428()) {
			if (local18.method5179()) {
				if (local18.method5178() == null) {
					local18.method6260();
					local18.method5838();
					this.anInt5242++;
				}
			} else if ((long) arg0 < ++local18.aLong378) {
				@Pc(45) Class2_Sub1_Sub3 local45 = Static287.aClass46_1.method5436(local18);
				this.aClass220_26.method5104(local45, local18.aLong401);
				Static420.method5764(local18, local45);
				local18.method6260();
				local18.method5838();
			}
		}
	}
}
