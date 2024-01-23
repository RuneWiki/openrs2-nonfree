import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class112 {

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "Lclient!ph;")
	private Class1_Sub5 aClass1_Sub5_42 = new Class1_Sub5();

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "Lclient!wg;")
	private Class189 aClass189_3 = new Class189();

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
	private int anInt3351;

	@OriginalMember(owner = "client!mi", name = "o", descriptor = "I")
	private int anInt3355;

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "Lclient!il;")
	private Class86 aClass86_19;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(I)V")
	public Class112(@OriginalArg(0) int arg0) {
		this.anInt3351 = arg0;
		this.anInt3355 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass86_19 = new Class86(local19);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IJLclient!ph;)V")
	public void method2950(@OriginalArg(1) long arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (this.anInt3351 == 0) {
			@Pc(14) Class1_Sub5 local14 = this.aClass189_3.method4602();
			local14.method4573();
			local14.method4577();
			if (local14 == this.aClass1_Sub5_42) {
				local14 = this.aClass189_3.method4602();
				local14.method4573();
				local14.method4577();
			}
		} else {
			this.anInt3351--;
		}
		this.aClass86_19.method2144(arg1, arg0);
		this.aClass189_3.method4603(arg1);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IJ)Lclient!ph;")
	public Class1_Sub5 method2951(@OriginalArg(1) long arg0) {
		@Pc(17) Class1_Sub5 local17 = (Class1_Sub5) this.aClass86_19.method2136(arg0);
		if (local17 != null) {
			this.aClass189_3.method4603(local17);
		}
		return local17;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)Lclient!ak;")
	public Class1 method2955() {
		return this.aClass86_19.method2134();
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)Lclient!ak;")
	public Class1 method2956() {
		return this.aClass86_19.method2141();
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V")
	public void method2959() {
		this.aClass189_3.method4604();
		this.aClass86_19.method2138();
		this.aClass1_Sub5_42 = new Class1_Sub5();
		this.anInt3351 = this.anInt3355;
	}
}
