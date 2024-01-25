import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public abstract class Class2 {

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "Lclient!ks;")
	protected final Class63_Sub1 aClass63_Sub1_30;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!ks;)V")
	public Class2(@OriginalArg(0) Class63_Sub1 arg0) {
		this.aClass63_Sub1_30 = arg0;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
	public abstract void method3765(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
	public abstract void method3766(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(Z)V")
	public abstract void method3767(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "()Z")
	public abstract boolean method3768();

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!vo;)V")
	public abstract void method3769(@OriginalArg(0) Class19 arg0);

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "()V")
	public abstract void method3770();
}
