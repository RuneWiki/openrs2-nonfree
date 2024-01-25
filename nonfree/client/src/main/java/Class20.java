import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public abstract class Class20 {

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "Lclient!kga;")
	protected final Class44_Sub3 aClass44_Sub3_42;

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lclient!kga;)V")
	public Class20(@OriginalArg(0) Class44_Sub3 arg0) {
		this.aClass44_Sub3_42 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(ZI)V")
	public abstract void method7862(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lclient!jf;II)V")
	public abstract void method7863(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(III)V")
	public abstract void method7864(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Z)V")
	public abstract void method7867();

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(Z)Z")
	public abstract boolean method7868();

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(ZZ)V")
	public abstract void method7870(@OriginalArg(1) boolean arg0);
}
