import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class Class2 {

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
	protected Class2() {
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Z")
	public abstract boolean method1425(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
	public abstract void method1429();

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)V")
	public abstract void method1431();

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)Lclient!mb;")
	public abstract Class19 method1433();
}
