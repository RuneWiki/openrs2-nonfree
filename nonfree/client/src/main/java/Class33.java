import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public abstract class Class33 {

	@OriginalMember(owner = "client!te", name = "a", descriptor = "Lclient!mm;")
	protected final Class55_Sub1 aClass55_Sub1_42;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!mm;)V")
	public Class33(@OriginalArg(0) Class55_Sub1 arg0) {
		this.aClass55_Sub1_42 = arg0;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "()Z")
	public abstract boolean method6041();

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V")
	public abstract void method6042(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!te", name = "b", descriptor = "()V")
	public abstract void method6043();

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	public abstract void method6044(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!t;)V")
	public abstract void method6045(@OriginalArg(0) Class60 arg0);

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)V")
	public abstract void method6046(@OriginalArg(0) boolean arg0);
}
