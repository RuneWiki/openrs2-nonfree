import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jba")
public final class Class157 {

	@OriginalMember(owner = "client!jba", name = "l", descriptor = "Lclient!vh;")
	private Class20_Sub6 aClass20_Sub6_2;

	@OriginalMember(owner = "client!jba", name = "e", descriptor = "Lclient!vh;")
	public final Class20_Sub6 aClass20_Sub6_1 = new Class20_Sub6();

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "()V")
	public Class157() {
		this.aClass20_Sub6_1.aClass20_Sub6_10 = this.aClass20_Sub6_1;
		this.aClass20_Sub6_1.aClass20_Sub6_9 = this.aClass20_Sub6_1;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)Lclient!vh;")
	public Class20_Sub6 method4486() {
		@Pc(13) Class20_Sub6 local13 = this.aClass20_Sub6_1.aClass20_Sub6_9;
		if (this.aClass20_Sub6_1 == local13) {
			this.aClass20_Sub6_2 = null;
			return null;
		} else {
			this.aClass20_Sub6_2 = local13.aClass20_Sub6_9;
			return local13;
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!vh;I)V")
	public void method4487(@OriginalArg(0) Class20_Sub6 arg0) {
		if (arg0.aClass20_Sub6_10 != null) {
			arg0.method7454();
		}
		arg0.aClass20_Sub6_9 = this.aClass20_Sub6_1;
		arg0.aClass20_Sub6_10 = this.aClass20_Sub6_1.aClass20_Sub6_10;
		arg0.aClass20_Sub6_10.aClass20_Sub6_9 = arg0;
		arg0.aClass20_Sub6_9.aClass20_Sub6_10 = arg0;
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)I")
	public int method4488() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class20_Sub6 local11 = this.aClass20_Sub6_1.aClass20_Sub6_9; local11 != this.aClass20_Sub6_1; local11 = local11.aClass20_Sub6_9) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "(I)V")
	public void method4492() {
		while (true) {
			@Pc(5) Class20_Sub6 local5 = this.aClass20_Sub6_1.aClass20_Sub6_9;
			if (this.aClass20_Sub6_1 == local5) {
				this.aClass20_Sub6_2 = null;
				return;
			}
			local5.method7454();
		}
	}

	@OriginalMember(owner = "client!jba", name = "e", descriptor = "(I)Lclient!vh;")
	public Class20_Sub6 method4493() {
		@Pc(6) Class20_Sub6 local6 = this.aClass20_Sub6_2;
		if (local6 == this.aClass20_Sub6_1) {
			this.aClass20_Sub6_2 = null;
			return null;
		} else {
			this.aClass20_Sub6_2 = local6.aClass20_Sub6_9;
			return local6;
		}
	}
}
