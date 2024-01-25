import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public abstract class Class13 {

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "Lclient!uq;")
	protected final Class122_Sub3 aClass122_Sub3_40;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lclient!uq;)V")
	public Class13(@OriginalArg(0) Class122_Sub3 arg0) {
		this.aClass122_Sub3_40 = arg0;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZB)V")
	public abstract void method6727(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)V")
	public abstract void method6728();

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!ea;IZ)V")
	public abstract void method6729(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(III)V")
	public abstract void method6730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(ZB)V")
	public abstract void method6731(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)Z")
	public abstract boolean method6732();
}
