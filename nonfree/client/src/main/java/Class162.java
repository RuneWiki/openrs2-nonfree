import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class162 {

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "Lclient!kh;")
	private Class1_Sub3 aClass1_Sub3_63 = new Class1_Sub3();

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "Lclient!mg;")
	private Class108 aClass108_13 = new Class108();

	@OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
	private int anInt5289;

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
	private int anInt5288;

	@OriginalMember(owner = "client!ta", name = "p", descriptor = "Lclient!vl;")
	private Class186 aClass186_23;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(I)V")
	public Class162(@OriginalArg(0) int arg0) {
		this.anInt5289 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.anInt5288 = arg0;
		this.aClass186_23 = new Class186(local16);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)Lclient!ec;")
	public Class1 method4000() {
		return this.aClass186_23.method4579();
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BJ)Lclient!kh;")
	public Class1_Sub3 method4003(@OriginalArg(1) long arg0) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) this.aClass186_23.method4570(arg0);
		if (local6 != null) {
			this.aClass108_13.method2753(local6);
		}
		return local6;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!kh;IJ)V")
	public void method4005(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt5288 == 0) {
			@Pc(16) Class1_Sub3 local16 = this.aClass108_13.method2756();
			local16.method4767();
			local16.method4652();
			if (this.aClass1_Sub3_63 == local16) {
				local16 = this.aClass108_13.method2756();
				local16.method4767();
				local16.method4652();
			}
		} else {
			this.anInt5288--;
		}
		this.aClass186_23.method4575(arg1, arg0);
		this.aClass108_13.method2753(arg0);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
	public void method4006() {
		this.aClass108_13.method2757();
		this.aClass186_23.method4568();
		this.aClass1_Sub3_63 = new Class1_Sub3();
		this.anInt5288 = this.anInt5289;
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)Lclient!ec;")
	public Class1 method4007() {
		return this.aClass186_23.method4567();
	}
}
