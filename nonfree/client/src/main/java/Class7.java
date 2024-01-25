import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public abstract class Class7 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "Lclient!fu;")
	protected final Class63_Sub2 aClass63_Sub2_41;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!fu;)V")
	public Class7(@OriginalArg(0) Class63_Sub2 arg0) {
		this.aClass63_Sub2_41 = arg0;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
	public abstract void method5471(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "()V")
	public abstract void method5472();

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "()Z")
	public abstract boolean method5473();

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public abstract void method5474(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!tp;)V")
	public abstract void method5475(@OriginalArg(0) Class20 arg0);

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(Z)V")
	public abstract void method5476(@OriginalArg(0) boolean arg0);
}
