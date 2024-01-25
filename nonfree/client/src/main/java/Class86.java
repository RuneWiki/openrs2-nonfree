import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public abstract class Class86 {

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "Lclient!mi;")
	protected final Class155_Sub1 aClass155_Sub1_39;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lclient!mi;)V")
	public Class86(@OriginalArg(0) Class155_Sub1 arg0) {
		this.aClass155_Sub1_39 = arg0;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!bl;)V")
	public abstract void method5357(@OriginalArg(0) Class30 arg0);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "()Z")
	public abstract boolean method5358();

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V")
	public abstract void method5359(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z)V")
	public abstract void method5360(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "()V")
	public abstract void method5361();

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(Z)V")
	public abstract void method5362(@OriginalArg(0) boolean arg0);
}
