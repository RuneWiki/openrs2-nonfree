import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public abstract class Class51 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "Lclient!gk;")
	protected final Class75_Sub2 aClass75_Sub2_39;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!gk;)V")
	public Class51(@OriginalArg(0) Class75_Sub2 arg0) {
		this.aClass75_Sub2_39 = arg0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)Z")
	public abstract boolean method4955();

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZI)V")
	public abstract void method4956(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V")
	public abstract void method4957();

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BII)V")
	public abstract void method4958(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!rh;II)V")
	public abstract void method4960(@OriginalArg(0) Class42 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZZ)V")
	public abstract void method4961(@OriginalArg(1) boolean arg0);
}
