import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public abstract class Class20 {

	@OriginalMember(owner = "client!km", name = "a", descriptor = "Lclient!nf;")
	protected final Class105_Sub1 aClass105_Sub1_42;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!nf;)V")
	public Class20(@OriginalArg(0) Class105_Sub1 arg0) {
		this.aClass105_Sub1_42 = arg0;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!me;)V")
	public abstract void method5680(@OriginalArg(0) Class44 arg0);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V")
	public abstract void method5681(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(Z)V")
	public abstract void method5682(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "()Z")
	public abstract boolean method5683();

	@OriginalMember(owner = "client!km", name = "b", descriptor = "()V")
	public abstract void method5684();

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
	public abstract void method5685(@OriginalArg(0) int arg0);
}
