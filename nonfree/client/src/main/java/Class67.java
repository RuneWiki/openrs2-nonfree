import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public abstract class Class67 {

	@OriginalMember(owner = "client!se", name = "a", descriptor = "Lclient!cg;")
	protected final Class37_Sub1 aClass37_Sub1_27;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lclient!cg;)V")
	public Class67(@OriginalArg(0) Class37_Sub1 arg0) {
		this.aClass37_Sub1_27 = arg0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
	public abstract void method4163(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V")
	public abstract void method4164(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method4165(@OriginalArg(0) Class81 arg0);

	@OriginalMember(owner = "client!se", name = "a", descriptor = "()V")
	public abstract void method4166();

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
	public abstract void method4167(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!se", name = "b", descriptor = "()Z")
	public abstract boolean method4168();
}
