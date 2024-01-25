import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public abstract class Class29 {

	@OriginalMember(owner = "client!es", name = "a", descriptor = "Lclient!h;")
	protected final Class32_Sub2 aClass32_Sub2_39;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!h;)V")
	public Class29(@OriginalArg(0) Class32_Sub2 arg0) {
		this.aClass32_Sub2_39 = arg0;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "()Z")
	public abstract boolean method5171();

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V")
	public abstract void method5172(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(Z)V")
	public abstract void method5173(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!sd;)V")
	public abstract void method5174(@OriginalArg(0) Class20 arg0);

	@OriginalMember(owner = "client!es", name = "b", descriptor = "()V")
	public abstract void method5175();

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V")
	public abstract void method5176(@OriginalArg(0) int arg0);
}
