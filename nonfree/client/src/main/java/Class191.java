import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class191 {

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "Lclient!jia;")
	private Class193 aClass193_29;

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "Lclient!wk;")
	private Class3 aClass3_150;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
	public Class191() {
	}

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!jia;)V")
	public Class191(@OriginalArg(0) Class193 arg0) {
		this.aClass193_29 = arg0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!jia;)V")
	public void method4409(@OriginalArg(1) Class193 arg0) {
		this.aClass193_29 = arg0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)Lclient!wk;")
	public Class3 method4410() {
		@Pc(15) Class3 local15 = this.aClass193_29.aClass3_155.aClass3_337;
		if (local15 == this.aClass193_29.aClass3_155) {
			this.aClass3_150 = null;
			return null;
		} else {
			this.aClass3_150 = local15.aClass3_337;
			return local15;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)Lclient!wk;")
	public Class3 method4412() {
		@Pc(6) Class3 local6 = this.aClass3_150;
		if (local6 == this.aClass193_29.aClass3_155) {
			this.aClass3_150 = null;
			return null;
		} else {
			this.aClass3_150 = local6.aClass3_337;
			return local6;
		}
	}
}
