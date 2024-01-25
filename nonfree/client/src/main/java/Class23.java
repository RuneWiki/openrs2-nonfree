import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public abstract class Class23 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "Lclient!po;")
	protected final Class59_Sub1 aClass59_Sub1_41;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!po;)V")
	public Class23(@OriginalArg(0) Class59_Sub1 arg0) {
		this.aClass59_Sub1_41 = arg0;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
	public abstract void method5762();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!fl;)V")
	public abstract void method5763(@OriginalArg(0) Class11 arg0);

	@OriginalMember(owner = "client!t", name = "b", descriptor = "()Z")
	public abstract boolean method5764();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	public abstract void method5765(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
	public abstract void method5766(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(Z)V")
	public abstract void method5767(@OriginalArg(0) boolean arg0);
}
