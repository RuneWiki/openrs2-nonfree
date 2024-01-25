import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class359 {

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
	private int anInt9762;

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "Lclient!dfa;")
	private final Class74 aClass74_68;

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "Lclient!dp;")
	private final Class82 aClass82_12;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
	private final int anInt9771;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(I)V")
	public Class359(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(II)V")
	public Class359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass82_12 = new Class82();
		this.anInt9762 = arg0;
		this.anInt9771 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0 && arg1 > local14; local14 += local14) {
		}
		this.aClass74_68 = new Class74(local14);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V")
	public void method8502(@OriginalArg(1) int arg0) {
		if (Static43.aClass194_1 == null) {
			return;
		}
		for (@Pc(9) Class6_Sub2_Sub3 local9 = (Class6_Sub2_Sub3) this.aClass82_12.method2071(); local9 != null; local9 = (Class6_Sub2_Sub3) this.aClass82_12.method2078()) {
			if (local9.method4998()) {
				if (local9.method4999() == null) {
					local9.method9051();
					local9.method8464();
					this.anInt9762 += local9.anInt5478;
				}
			} else if ((long) arg0 < ++local9.aLong317) {
				@Pc(62) Class6_Sub2_Sub3 local62 = Static43.aClass194_1.method8798(local9);
				this.aClass74_68.method1399(local62, local9.aLong346);
				Static548.method7755(local62, local9);
				local9.method9051();
				local9.method8464();
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/Object;IIJ)V")
	public void method8503(@OriginalArg(0) Object arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		if (this.anInt9771 < arg1) {
			throw new IllegalStateException("s>cs");
		}
		this.method8505(arg2);
		this.anInt9762 -= arg1;
		while (this.anInt9762 < 0) {
			@Pc(47) Class6_Sub2_Sub3 local47 = (Class6_Sub2_Sub3) this.aClass82_12.method2077();
			this.method8516(local47);
		}
		@Pc(63) Class6_Sub2_Sub3_Sub1 local63 = new Class6_Sub2_Sub3_Sub1(arg0, arg1);
		this.aClass74_68.method1399(local63, arg2);
		this.aClass82_12.method2076(local63);
		local63.aLong317 = 0L;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IJ)V")
	private void method8505(@OriginalArg(1) long arg0) {
		@Pc(14) Class6_Sub2_Sub3 local14 = (Class6_Sub2_Sub3) this.aClass74_68.method1401(arg0);
		this.method8516(local14);
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(Z)V")
	public void method8507() {
		this.aClass82_12.method2075();
		this.aClass74_68.method1398();
		this.anInt9762 = this.anInt9771;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)I")
	public int method8510() {
		return this.anInt9771;
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
	public void method8511() {
		for (@Pc(21) Class6_Sub2_Sub3 local21 = (Class6_Sub2_Sub3) this.aClass82_12.method2071(); local21 != null; local21 = (Class6_Sub2_Sub3) this.aClass82_12.method2078()) {
			if (local21.method4998()) {
				local21.method9051();
				local21.method8464();
				this.anInt9762 += local21.anInt5478;
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public Object method8513() {
		@Pc(20) Class6_Sub2_Sub3 local20 = (Class6_Sub2_Sub3) this.aClass74_68.method1404();
		while (local20 != null) {
			@Pc(26) Object local26 = local20.method4999();
			if (local26 != null) {
				return local26;
			}
			@Pc(33) Class6_Sub2_Sub3 local33 = local20;
			local20 = (Class6_Sub2_Sub3) this.aClass74_68.method1405();
			local33.method9051();
			local33.method8464();
			this.anInt9762 += local33.anInt5478;
		}
		return null;
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)I")
	public int method8514() {
		@Pc(7) int local7 = 0;
		for (@Pc(24) Class6_Sub2_Sub3 local24 = (Class6_Sub2_Sub3) this.aClass82_12.method2071(); local24 != null; local24 = (Class6_Sub2_Sub3) this.aClass82_12.method2078()) {
			if (!local24.method4998()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(JLjava/lang/Object;I)V")
	public void method8515(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1) {
		this.method8503(arg1, 1, arg0);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLclient!bs;)V")
	private void method8516(@OriginalArg(1) Class6_Sub2_Sub3 arg0) {
		if (arg0 != null) {
			arg0.method9051();
			arg0.method8464();
			this.anInt9762 += arg0.anInt5478;
		}
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method8517(@OriginalArg(1) long arg0) {
		@Pc(10) Class6_Sub2_Sub3 local10 = (Class6_Sub2_Sub3) this.aClass74_68.method1401(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(19) Object local19 = local10.method4999();
		if (local19 == null) {
			local10.method9051();
			local10.method8464();
			this.anInt9762 += local10.anInt5478;
			return null;
		}
		if (local10.method4998()) {
			@Pc(56) Class6_Sub2_Sub3_Sub1 local56 = new Class6_Sub2_Sub3_Sub1(local19, local10.anInt5478);
			this.aClass74_68.method1399(local56, local10.aLong346);
			this.aClass82_12.method2076(local56);
			local56.aLong317 = 0L;
			local10.method9051();
			local10.method8464();
		} else {
			this.aClass82_12.method2076(local10);
			local10.aLong317 = 0L;
		}
		return local19;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public Object method8518() {
		@Pc(17) Class6_Sub2_Sub3 local17 = (Class6_Sub2_Sub3) this.aClass74_68.method1405();
		while (local17 != null) {
			@Pc(23) Object local23 = local17.method4999();
			if (local23 != null) {
				return local23;
			}
			@Pc(27) Class6_Sub2_Sub3 local27 = local17;
			local17 = (Class6_Sub2_Sub3) this.aClass74_68.method1405();
			local27.method9051();
			local27.method8464();
			this.anInt9762 += local27.anInt5478;
		}
		return null;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)I")
	public int method8519() {
		return this.anInt9762;
	}
}
