import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public abstract class Class54 {

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "Lclient!ge;")
	protected final Class81_Sub1 aClass81_Sub1_37;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class54(@OriginalArg(0) Class81_Sub1 arg0) {
		this.aClass81_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "()Z")
	public abstract boolean method5295();

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!mo;)V")
	public abstract void method5296(@OriginalArg(0) Class28 arg0);

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V")
	public abstract void method5297(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "()V")
	public abstract void method5298();

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(Z)V")
	public abstract void method5299(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
	public abstract void method5300(@OriginalArg(0) int arg0);
}
