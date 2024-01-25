import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public abstract class Class11 {

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "Lclient!ig;")
	protected final Class47_Sub2 aClass47_Sub2_33;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!ig;)V")
	public Class11(@OriginalArg(0) Class47_Sub2 arg0) {
		this.aClass47_Sub2_33 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ee;)V")
	public abstract void method4746(@OriginalArg(0) Class52 arg0);

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "()Z")
	public abstract boolean method4747();

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
	public abstract void method4748(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)V")
	public abstract void method4749(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
	public abstract void method4750(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "()V")
	public abstract void method4751();
}
