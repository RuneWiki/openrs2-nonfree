import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class89 {

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "Lclient!mg;")
	private Class108 aClass108_12 = new Class108();

	@OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
	private int anInt3064;

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
	private int anInt3059;

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "Lclient!vl;")
	private Class186 aClass186_11;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(I)V")
	public Class89(@OriginalArg(0) int arg0) {
		this.anInt3064 = arg0;
		this.anInt3059 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass186_11 = new Class186(local14);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(JI)V")
	public void method2264(@OriginalArg(0) long arg0) {
		@Pc(12) Class1_Sub3_Sub8 local12 = (Class1_Sub3_Sub8) this.aClass186_11.method4570(arg0);
		if (local12 != null) {
			local12.method4767();
			local12.method4652();
			this.anInt3059++;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
	public void method2265() {
		this.aClass108_12.method2757();
		this.aClass186_11.method4568();
		this.anInt3059 = this.anInt3064;
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V")
	public void method2266() {
		for (@Pc(15) Class1_Sub3_Sub8 local15 = (Class1_Sub3_Sub8) this.aClass108_12.method2754(); local15 != null; local15 = (Class1_Sub3_Sub8) this.aClass108_12.method2751()) {
			if (local15.method3395()) {
				local15.method4767();
				local15.method4652();
				this.anInt3059++;
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
	public Object method2268(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub3_Sub8 local10 = (Class1_Sub3_Sub8) this.aClass186_11.method4570(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(25) Object local25 = local10.method3401();
		if (local25 == null) {
			local10.method4767();
			local10.method4652();
			this.anInt3059++;
			return null;
		}
		if (local10.method3395()) {
			@Pc(53) Class1_Sub3_Sub8_Sub2 local53 = new Class1_Sub3_Sub8_Sub2(local25);
			this.aClass186_11.method4575(local10.aLong247, local53);
			this.aClass108_12.method2753(local53);
			local53.aLong237 = 0L;
			local10.method4767();
			local10.method4652();
		} else {
			this.aClass108_12.method2753(local10);
			local10.aLong237 = 0L;
		}
		return local25;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)I")
	public int method2270() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class1_Sub3_Sub8 local13 = (Class1_Sub3_Sub8) this.aClass108_12.method2754(); local13 != null; local13 = (Class1_Sub3_Sub8) this.aClass108_12.method2751()) {
			if (!local13.method3395()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(JILjava/lang/Object;)V")
	public void method2272(@OriginalArg(0) long arg0, @OriginalArg(2) Object arg1) {
		this.method2264(arg0);
		if (this.anInt3059 == 0) {
			@Pc(17) Class1_Sub3_Sub8 local17 = (Class1_Sub3_Sub8) this.aClass108_12.method2756();
			local17.method4767();
			local17.method4652();
		} else {
			this.anInt3059--;
		}
		@Pc(36) Class1_Sub3_Sub8_Sub2 local36 = new Class1_Sub3_Sub8_Sub2(arg1);
		this.aClass186_11.method4575(arg0, local36);
		this.aClass108_12.method2753(local36);
		local36.aLong237 = 0;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V")
	public void method2273(@OriginalArg(1) int arg0) {
		if (Static50.aClass123_5 == null) {
			return;
		}
		for (@Pc(9) Class1_Sub3_Sub8 local9 = (Class1_Sub3_Sub8) this.aClass108_12.method2754(); local9 != null; local9 = (Class1_Sub3_Sub8) this.aClass108_12.method2751()) {
			if (local9.method3395()) {
				if (local9.method3401() == null) {
					local9.method4767();
					local9.method4652();
					this.anInt3059++;
				}
			} else if ((long) arg0 < ++local9.aLong237) {
				@Pc(52) Class1_Sub3_Sub8 local52 = Static50.aClass123_5.method3197(local9);
				this.aClass186_11.method4575(local9.aLong247, local52);
				Static277.method4188(local52, local9);
				local9.method4767();
				local9.method4652();
			}
		}
	}
}
