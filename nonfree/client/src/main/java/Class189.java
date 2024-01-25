import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class189 {

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "Lclient!cm;")
	private Class3_Sub3 aClass3_Sub3_46 = new Class3_Sub3();

	@OriginalMember(owner = "client!kl", name = "n", descriptor = "Lclient!cba;")
	private final Class38 aClass38_3 = new Class38();

	@OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
	private final int anInt5113;

	@OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
	private int anInt5114;

	@OriginalMember(owner = "client!kl", name = "l", descriptor = "Lclient!sl;")
	private final Class310 aClass310_18;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(I)V")
	public Class189(@OriginalArg(0) int arg0) {
		this.anInt5113 = arg0;
		this.anInt5114 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass310_18 = new Class310(local19);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(JBLclient!cm;)V")
	public void method4442(@OriginalArg(0) long arg0, @OriginalArg(2) Class3_Sub3 arg1) {
		if (this.anInt5114 == 0) {
			@Pc(29) Class3_Sub3 local29 = this.aClass38_3.method1073();
			local29.method7812();
			local29.method7720();
			if (this.aClass3_Sub3_46 == local29) {
				local29 = this.aClass38_3.method1073();
				local29.method7812();
				local29.method7720();
			}
		} else {
			this.anInt5114--;
		}
		this.aClass310_18.method6603(arg1, arg0);
		this.aClass38_3.method1069(arg1);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)V")
	public void method4444() {
		this.aClass38_3.method1067();
		this.aClass310_18.method6605();
		this.aClass3_Sub3_46 = new Class3_Sub3();
		this.anInt5114 = this.anInt5113;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IJ)Lclient!cm;")
	public Class3_Sub3 method4445(@OriginalArg(1) long arg0) {
		@Pc(18) Class3_Sub3 local18 = (Class3_Sub3) this.aClass310_18.method6601(arg0);
		if (local18 != null) {
			this.aClass38_3.method1069(local18);
		}
		return local18;
	}
}
