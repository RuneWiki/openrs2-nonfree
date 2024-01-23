import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class33 {

	@OriginalMember(owner = "client!di", name = "m", descriptor = "Lclient!qd;")
	private Class20 aClass20_6;

	@OriginalMember(owner = "client!di", name = "j", descriptor = "Lclient!qd;")
	public Class20 aClass20_5 = new Class20();

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V")
	public Class33() {
		this.aClass20_5.aClass20_12 = this.aClass20_5;
		this.aClass20_5.aClass20_11 = this.aClass20_5;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I)Lclient!qd;")
	public Class20 method978() {
		@Pc(7) Class20 local7 = this.aClass20_5.aClass20_12;
		if (local7 == this.aClass20_5) {
			this.aClass20_6 = null;
			return null;
		} else {
			this.aClass20_6 = local7.aClass20_12;
			return local7;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)Lclient!qd;")
	public Class20 method980() {
		@Pc(11) Class20 local11 = this.aClass20_6;
		if (local11 == this.aClass20_5) {
			this.aClass20_6 = null;
			return null;
		} else {
			this.aClass20_6 = local11.aClass20_12;
			return local11;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILclient!qd;)V")
	public void method981(@OriginalArg(1) Class20 arg0) {
		if (arg0.aClass20_11 != null) {
			arg0.method4753();
		}
		arg0.aClass20_12 = this.aClass20_5;
		arg0.aClass20_11 = this.aClass20_5.aClass20_11;
		arg0.aClass20_11.aClass20_12 = arg0;
		arg0.aClass20_12.aClass20_11 = arg0;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(I)I")
	public int method982() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class20 local11 = this.aClass20_5.aClass20_12; local11 != this.aClass20_5; local11 = local11.aClass20_12) {
			local7++;
		}
		return local7;
	}
}
