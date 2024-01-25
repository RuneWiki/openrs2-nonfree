import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class157 {

	@OriginalMember(owner = "client!js", name = "a", descriptor = "Lclient!kp;")
	private Class1 aClass1_139;

	@OriginalMember(owner = "client!js", name = "e", descriptor = "Lclient!bu;")
	private Class38 aClass38_36;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "()V")
	public Class157() {
	}

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lclient!bu;)V")
	public Class157(@OriginalArg(0) Class38 arg0) {
		this.aClass38_36 = arg0;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!bu;I)V")
	public void method4035(@OriginalArg(0) Class38 arg0) {
		this.aClass38_36 = arg0;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)Lclient!kp;")
	public Class1 method4036() {
		@Pc(13) Class1 local13 = this.aClass38_36.aClass1_27.aClass1_283;
		if (this.aClass38_36.aClass1_27 == local13) {
			this.aClass1_139 = null;
			return null;
		} else {
			this.aClass1_139 = local13.aClass1_283;
			return local13;
		}
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(I)Lclient!kp;")
	public Class1 method4037() {
		@Pc(13) Class1 local13 = this.aClass1_139;
		if (this.aClass38_36.aClass1_27 == local13) {
			this.aClass1_139 = null;
			return null;
		} else {
			this.aClass1_139 = local13.aClass1_283;
			return local13;
		}
	}
}
