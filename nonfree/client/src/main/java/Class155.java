import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class155 {

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "Lclient!nb;")
	private Class104 aClass104_9 = new Class104();

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
	private int anInt5591;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
	private int anInt5586;

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "Lclient!ol;")
	private Class117 aClass117_22;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(I)V")
	public Class155(@OriginalArg(0) int arg0) {
		this.anInt5591 = arg0;
		this.anInt5586 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass117_22 = new Class117(local14);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)I")
	public int method4353() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class1_Sub2_Sub3 local13 = (Class1_Sub2_Sub3) this.aClass104_9.method3152(); local13 != null; local13 = (Class1_Sub2_Sub3) this.aClass104_9.method3151()) {
			if (!local13.method4237()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V")
	public void method4354() {
		for (@Pc(7) Class1_Sub2_Sub3 local7 = (Class1_Sub2_Sub3) this.aClass104_9.method3152(); local7 != null; local7 = (Class1_Sub2_Sub3) this.aClass104_9.method3151()) {
			if (local7.method4237()) {
				local7.method4742();
				local7.method4661();
				this.anInt5586++;
			}
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(JI)Ljava/lang/Object;")
	public Object method4358(@OriginalArg(0) long arg0) {
		@Pc(16) Class1_Sub2_Sub3 local16 = (Class1_Sub2_Sub3) this.aClass117_22.method3438(arg0);
		if (local16 == null) {
			return null;
		}
		@Pc(26) Object local26 = local16.method4241();
		if (local26 == null) {
			local16.method4742();
			local16.method4661();
			this.anInt5586++;
			return null;
		}
		if (local16.method4237()) {
			@Pc(63) Class1_Sub2_Sub3_Sub2 local63 = new Class1_Sub2_Sub3_Sub2(local26);
			this.aClass117_22.method3445(local63, local16.aLong201);
			this.aClass104_9.method3145(local63);
			local63.aLong198 = 0L;
			local16.method4742();
			local16.method4661();
		} else {
			this.aClass104_9.method3145(local16);
			local16.aLong198 = 0L;
		}
		return local26;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(JILjava/lang/Object;)V")
	public void method4360(@OriginalArg(0) long arg0, @OriginalArg(2) Object arg1) {
		this.method4363(arg0);
		if (this.anInt5586 == 0) {
			@Pc(19) Class1_Sub2_Sub3 local19 = (Class1_Sub2_Sub3) this.aClass104_9.method3149();
			local19.method4742();
			local19.method4661();
		} else {
			this.anInt5586--;
		}
		@Pc(46) Class1_Sub2_Sub3_Sub2 local46 = new Class1_Sub2_Sub3_Sub2(arg1);
		this.aClass117_22.method3445(local46, arg0);
		this.aClass104_9.method3145(local46);
		local46.aLong198 = 0L;
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)V")
	public void method4362() {
		this.aClass104_9.method3147();
		this.aClass117_22.method3440();
		this.anInt5586 = this.anInt5591;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(BJ)V")
	public void method4363(@OriginalArg(1) long arg0) {
		@Pc(18) Class1_Sub2_Sub3 local18 = (Class1_Sub2_Sub3) this.aClass117_22.method3438(arg0);
		if (local18 != null) {
			local18.method4742();
			local18.method4661();
			this.anInt5586++;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IB)V")
	public void method4364(@OriginalArg(0) int arg0) {
		if (Static18.aClass72_1 == null) {
			return;
		}
		for (@Pc(14) Class1_Sub2_Sub3 local14 = (Class1_Sub2_Sub3) this.aClass104_9.method3152(); local14 != null; local14 = (Class1_Sub2_Sub3) this.aClass104_9.method3151()) {
			if (local14.method4237()) {
				if (local14.method4241() == null) {
					local14.method4742();
					local14.method4661();
					this.anInt5586++;
				}
			} else if ((long) arg0 < ++local14.aLong198) {
				@Pc(57) Class1_Sub2_Sub3 local57 = Static18.aClass72_1.method2284(local14);
				this.aClass117_22.method3445(local57, local14.aLong201);
				Static46.method4783(local57, local14);
				local14.method4742();
				local14.method4661();
			}
		}
	}
}
