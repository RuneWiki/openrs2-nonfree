import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class203 {

	@OriginalMember(owner = "client!pr", name = "h", descriptor = "Lclient!se;")
	private Class20_Sub1 aClass20_Sub1_8;

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "Lclient!se;")
	public final Class20_Sub1 aClass20_Sub1_7 = new Class20_Sub1();

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "()V")
	public Class203() {
		this.aClass20_Sub1_7.aClass20_Sub1_6 = this.aClass20_Sub1_7;
		this.aClass20_Sub1_7.aClass20_Sub1_5 = this.aClass20_Sub1_7;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)I")
	public int method4065() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class20_Sub1 local11 = this.aClass20_Sub1_7.aClass20_Sub1_5;
		while (local11 != this.aClass20_Sub1_7) {
			local11 = local11.aClass20_Sub1_5;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
	public void method4066() {
		while (true) {
			@Pc(7) Class20_Sub1 local7 = this.aClass20_Sub1_7.aClass20_Sub1_5;
			if (local7 == this.aClass20_Sub1_7) {
				this.aClass20_Sub1_8 = null;
				return;
			}
			local7.method514();
		}
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)Lclient!se;")
	public Class20_Sub1 method4067() {
		@Pc(13) Class20_Sub1 local13 = this.aClass20_Sub1_8;
		if (this.aClass20_Sub1_7 == local13) {
			this.aClass20_Sub1_8 = null;
			return null;
		} else {
			this.aClass20_Sub1_8 = local13.aClass20_Sub1_5;
			return local13;
		}
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)Lclient!se;")
	public Class20_Sub1 method4069() {
		@Pc(7) Class20_Sub1 local7 = this.aClass20_Sub1_7.aClass20_Sub1_5;
		if (this.aClass20_Sub1_7 == local7) {
			this.aClass20_Sub1_8 = null;
			return null;
		} else {
			this.aClass20_Sub1_8 = local7.aClass20_Sub1_5;
			return local7;
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!se;B)V")
	public void method4071(@OriginalArg(0) Class20_Sub1 arg0) {
		if (arg0.aClass20_Sub1_6 != null) {
			arg0.method514();
		}
		arg0.aClass20_Sub1_5 = this.aClass20_Sub1_7;
		arg0.aClass20_Sub1_6 = this.aClass20_Sub1_7.aClass20_Sub1_6;
		arg0.aClass20_Sub1_6.aClass20_Sub1_5 = arg0;
		arg0.aClass20_Sub1_5.aClass20_Sub1_6 = arg0;
	}
}
