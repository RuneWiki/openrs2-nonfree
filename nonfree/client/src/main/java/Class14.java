import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public abstract class Class14 {

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "()V")
	protected Class14() {
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(BI)Z")
	public abstract boolean method1510(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(B)V")
	public abstract void method1512();

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(I)Lclient!sk;")
	public abstract Class150 method1513();

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(I)V")
	public abstract void method1514();
}
