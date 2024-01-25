import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class29 {

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "Lclient!sp;")
	private Class1_Sub2 aClass1_Sub2_9 = new Class1_Sub2();

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "Lclient!su;")
	private final Class227 aClass227_1 = new Class227();

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "I")
	private final int anInt857;

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "Lclient!gu;")
	private final Class96 aClass96_12;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(I)V")
	public Class29(@OriginalArg(0) int arg0) {
		this.anInt857 = arg0;
		this.anInt858 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass96_12 = new Class96(local19);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
	public void method754() {
		this.aClass227_1.method5111();
		this.aClass96_12.method2338();
		this.aClass1_Sub2_9 = new Class1_Sub2();
		this.anInt858 = this.anInt857;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!sp;JI)V")
	public void method756(@OriginalArg(0) Class1_Sub2 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt858 == 0) {
			@Pc(7) Class1_Sub2 local7 = this.aClass227_1.method5104();
			local7.method6020();
			local7.method5813();
			if (local7 == this.aClass1_Sub2_9) {
				local7 = this.aClass227_1.method5104();
				local7.method6020();
				local7.method5813();
			}
		} else {
			this.anInt858--;
		}
		this.aClass96_12.method2341(arg1, arg0);
		this.aClass227_1.method5106(arg0);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZJ)Lclient!sp;")
	public Class1_Sub2 method757(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub2 local10 = (Class1_Sub2) this.aClass96_12.method2335(arg0);
		if (local10 != null) {
			this.aClass227_1.method5106(local10);
		}
		return local10;
	}
}
