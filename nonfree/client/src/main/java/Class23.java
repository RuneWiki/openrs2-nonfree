import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class23 {

	@OriginalMember(owner = "client!di", name = "m", descriptor = "Lclient!ni;")
	private final Class3_Sub3 aClass3_Sub3_19 = new Class3_Sub3();

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V")
	public Class23() {
		this.aClass3_Sub3_19.aClass3_Sub3_66 = this.aClass3_Sub3_19;
		this.aClass3_Sub3_19.aClass3_Sub3_65 = this.aClass3_Sub3_19;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILclient!ni;)V")
	public void method674(@OriginalArg(1) Class3_Sub3 arg0) {
		if (arg0.aClass3_Sub3_66 != null) {
			arg0.method3214();
		}
		arg0.aClass3_Sub3_66 = this.aClass3_Sub3_19.aClass3_Sub3_66;
		arg0.aClass3_Sub3_65 = this.aClass3_Sub3_19;
		arg0.aClass3_Sub3_66.aClass3_Sub3_65 = arg0;
		arg0.aClass3_Sub3_65.aClass3_Sub3_66 = arg0;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)Lclient!ni;")
	public Class3_Sub3 method675() {
		@Pc(7) Class3_Sub3 local7 = this.aClass3_Sub3_19.aClass3_Sub3_65;
		return this.aClass3_Sub3_19 == local7 ? null : local7;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!ni;B)V")
	public void method677(@OriginalArg(0) Class3_Sub3 arg0) {
		if (arg0.aClass3_Sub3_66 != null) {
			arg0.method3214();
		}
		arg0.aClass3_Sub3_66 = this.aClass3_Sub3_19;
		arg0.aClass3_Sub3_65 = this.aClass3_Sub3_19.aClass3_Sub3_65;
		arg0.aClass3_Sub3_66.aClass3_Sub3_65 = arg0;
		arg0.aClass3_Sub3_65.aClass3_Sub3_66 = arg0;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(I)Lclient!ni;")
	public Class3_Sub3 method678() {
		@Pc(10) Class3_Sub3 local10 = this.aClass3_Sub3_19.aClass3_Sub3_65;
		if (local10 == this.aClass3_Sub3_19) {
			return null;
		} else {
			local10.method3214();
			return local10;
		}
	}
}
