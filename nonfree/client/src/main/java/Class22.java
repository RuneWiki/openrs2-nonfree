import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public abstract class Class22 {

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "Lclient!tb;")
	protected final Class129_Sub2 aClass129_Sub2_32;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!tb;)V")
	public Class22(@OriginalArg(0) Class129_Sub2 arg0) {
		this.aClass129_Sub2_32 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V")
	public abstract void method4338(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
	public abstract void method4339(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(Z)V")
	public abstract void method4340(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "()Z")
	public abstract boolean method4341();

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "()V")
	public abstract void method4342();

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!ue;)V")
	public abstract void method4343(@OriginalArg(0) Class56 arg0);
}
