import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public abstract class Class35 {

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "Lclient!ao;")
	protected final Class4_Sub1 aClass4_Sub1_35;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!ao;)V")
	public Class35(@OriginalArg(0) Class4_Sub1 arg0) {
		this.aClass4_Sub1_35 = arg0;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V")
	public abstract void method5195(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!lp;)V")
	public abstract void method5196(@OriginalArg(0) Class124 arg0);

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "()V")
	public abstract void method5197();

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
	public abstract void method5198(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "()Z")
	public abstract boolean method5199();

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(Z)V")
	public abstract void method5200(@OriginalArg(0) boolean arg0);
}
