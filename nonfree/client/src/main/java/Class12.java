import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public abstract class Class12 {

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "Lclient!rl;")
	protected final Class66_Sub2 aClass66_Sub2_41;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!rl;)V")
	public Class12(@OriginalArg(0) Class66_Sub2 arg0) {
		this.aClass66_Sub2_41 = arg0;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IBLclient!tu;)V")
	public abstract void method6090(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1);

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)Z")
	public abstract boolean method6091();

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZZ)V")
	public abstract void method6092(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(III)V")
	public abstract void method6094(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)V")
	public abstract void method6096();

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZI)V")
	public abstract void method6097(@OriginalArg(0) boolean arg0);
}
