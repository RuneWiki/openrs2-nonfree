import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class183 {

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "Lclient!pn;")
	private Class1 aClass1_188;

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "Lclient!bb;")
	private Class16 aClass16_31;

	static {
		new Class34("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "()V")
	public Class183() {
	}

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!bb;)V")
	public Class183(@OriginalArg(0) Class16 arg0) {
		this.aClass16_31 = arg0;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!bb;I)V")
	public void method4844(@OriginalArg(0) Class16 arg0) {
		this.aClass16_31 = arg0;
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)Lclient!pn;")
	public Class1 method4847() {
		@Pc(6) Class1 local6 = this.aClass1_188;
		if (this.aClass16_31.aClass1_25 == local6) {
			this.aClass1_188 = null;
			return null;
		} else {
			this.aClass1_188 = local6.aClass1_252;
			return local6;
		}
	}

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "(I)Lclient!pn;")
	public Class1 method4850() {
		@Pc(14) Class1 local14 = this.aClass16_31.aClass1_25.aClass1_252;
		if (local14 == this.aClass16_31.aClass1_25) {
			this.aClass1_188 = null;
			return null;
		} else {
			this.aClass1_188 = local14.aClass1_252;
			return local14;
		}
	}
}
