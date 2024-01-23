import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class187 {

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "Lclient!tg;")
	private Class170 aClass170_12 = new Class170();

	@OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
	private int anInt5323;

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
	private int anInt5314;

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "Lclient!qb;")
	private Class142 aClass142_25;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(I)V")
	public Class187(@OriginalArg(0) int arg0) {
		this.anInt5323 = arg0;
		this.anInt5314 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass142_25 = new Class142(local14);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(JLjava/lang/Object;I)V")
	public void method4524(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1) {
		this.method4529(arg0);
		if (this.anInt5323 == 0) {
			@Pc(19) Class1_Sub2_Sub3 local19 = (Class1_Sub2_Sub3) this.aClass170_12.method4211();
			local19.method4779();
			local19.method4493();
		} else {
			this.anInt5323--;
		}
		@Pc(40) Class1_Sub2_Sub3_Sub1 local40 = new Class1_Sub2_Sub3_Sub1(arg1);
		this.aClass142_25.method3537(local40, arg0);
		this.aClass170_12.method4210(local40);
		local40.aLong196 = 0L;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
	public void method4525() {
		for (@Pc(14) Class1_Sub2_Sub3 local14 = (Class1_Sub2_Sub3) this.aClass170_12.method4212(); local14 != null; local14 = (Class1_Sub2_Sub3) this.aClass170_12.method4207()) {
			if (local14.method2573()) {
				local14.method4779();
				local14.method4493();
				this.anInt5323++;
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method4527(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub2_Sub3 local10 = (Class1_Sub2_Sub3) this.aClass142_25.method3543(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(25) Object local25 = local10.method2576();
		if (local25 == null) {
			local10.method4779();
			local10.method4493();
			this.anInt5323++;
			return null;
		}
		if (local10.method2573()) {
			@Pc(51) Class1_Sub2_Sub3_Sub1 local51 = new Class1_Sub2_Sub3_Sub1(local25);
			this.aClass142_25.method3537(local51, local10.aLong214);
			this.aClass170_12.method4210(local51);
			local51.aLong196 = 0L;
			local10.method4779();
			local10.method4493();
		} else {
			this.aClass170_12.method4210(local10);
			local10.aLong196 = 0L;
		}
		return local25;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(JB)V")
	public void method4529(@OriginalArg(0) long arg0) {
		@Pc(18) Class1_Sub2_Sub3 local18 = (Class1_Sub2_Sub3) this.aClass142_25.method3543(arg0);
		if (local18 != null) {
			local18.method4779();
			local18.method4493();
			this.anInt5323++;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
	public void method4530() {
		this.aClass170_12.method4208();
		this.aClass142_25.method3542();
		this.anInt5323 = this.anInt5314;
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)I")
	public int method4531() {
		@Pc(3) int local3 = 0;
		for (@Pc(9) Class1_Sub2_Sub3 local9 = (Class1_Sub2_Sub3) this.aClass170_12.method4212(); local9 != null; local9 = (Class1_Sub2_Sub3) this.aClass170_12.method4207()) {
			if (!local9.method2573()) {
				local3++;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZ)V")
	public void method4534(@OriginalArg(0) int arg0) {
		if (Static263.aClass75_1 == null) {
			return;
		}
		for (@Pc(14) Class1_Sub2_Sub3 local14 = (Class1_Sub2_Sub3) this.aClass170_12.method4212(); local14 != null; local14 = (Class1_Sub2_Sub3) this.aClass170_12.method4207()) {
			if (local14.method2573()) {
				if (local14.method2576() == null) {
					local14.method4779();
					local14.method4493();
					this.anInt5323++;
				}
			} else if ((long) arg0 < ++local14.aLong196) {
				@Pc(61) Class1_Sub2_Sub3 local61 = Static263.aClass75_1.method2120(local14);
				this.aClass142_25.method3537(local61, local14.aLong214);
				Static61.method1111(local61, local14);
				local14.method4779();
				local14.method4493();
			}
		}
	}
}
