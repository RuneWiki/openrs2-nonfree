import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class58 {

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "Lclient!lk;")
	private Class1_Sub2 aClass1_Sub2_31 = new Class1_Sub2();

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "Lclient!oh;")
	private Class99 aClass99_7 = new Class99();

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
	private int anInt2717;

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
	private int anInt2718;

	@OriginalMember(owner = "client!ic", name = "q", descriptor = "Lclient!vd;")
	private Class140 aClass140_7;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(I)V")
	public Class58(@OriginalArg(0) int arg0) {
		this.anInt2717 = arg0;
		this.anInt2718 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass140_7 = new Class140(local19);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)Lclient!jg;")
	public Class1 method2087() {
		return this.aClass140_7.method4012();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IJLclient!lk;)V")
	public void method2089(@OriginalArg(1) long arg0, @OriginalArg(2) Class1_Sub2 arg1) {
		if (this.anInt2717 == 0) {
			@Pc(15) Class1_Sub2 local15 = this.aClass99_7.method2963();
			local15.method4186();
			local15.method4198();
			if (local15 == this.aClass1_Sub2_31) {
				local15 = this.aClass99_7.method2963();
				local15.method4186();
				local15.method4198();
			}
		} else {
			this.anInt2717--;
		}
		this.aClass140_7.method4011(arg1, arg0);
		this.aClass99_7.method2973(arg1);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
	public void method2090() {
		this.aClass99_7.method2971();
		this.aClass140_7.method4010();
		this.aClass1_Sub2_31 = new Class1_Sub2();
		this.anInt2717 = this.anInt2718;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)Lclient!jg;")
	public Class1 method2092() {
		return this.aClass140_7.method4013();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(JI)Lclient!lk;")
	public Class1_Sub2 method2093(@OriginalArg(0) long arg0) {
		@Pc(15) Class1_Sub2 local15 = (Class1_Sub2) this.aClass140_7.method4014(arg0);
		if (local15 != null) {
			this.aClass99_7.method2973(local15);
		}
		return local15;
	}
}
