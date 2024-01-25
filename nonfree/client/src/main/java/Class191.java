import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public abstract class Class191 {

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	protected Class191() {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	public abstract void method8961();

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)Lclient!tm;")
	public abstract Interface21 method8962();

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)Z")
	public abstract boolean method8963(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)V")
	public abstract void method8967();
}
