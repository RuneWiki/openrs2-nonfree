import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class215 {

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "Lclient!at;")
	private Class20 aClass20_22;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "Lclient!ac;")
	private Class5 aClass5_176;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
	public Class215() {
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!at;)V")
	public Class215(@OriginalArg(0) Class20 arg0) {
		this.aClass20_22 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!at;B)V")
	public void method4910(@OriginalArg(0) Class20 arg0) {
		this.aClass20_22 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)Lclient!ac;")
	public Class5 method4911() {
		@Pc(6) Class5 local6 = this.aClass5_176;
		if (this.aClass20_22.aClass5_19 == local6) {
			this.aClass5_176 = null;
			return null;
		} else {
			this.aClass5_176 = local6.aClass5_338;
			return local6;
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)Lclient!ac;")
	public Class5 method4913() {
		@Pc(14) Class5 local14 = this.aClass20_22.aClass5_19.aClass5_338;
		if (this.aClass20_22.aClass5_19 == local14) {
			this.aClass5_176 = null;
			return null;
		} else {
			this.aClass5_176 = local14.aClass5_338;
			return local14;
		}
	}
}
