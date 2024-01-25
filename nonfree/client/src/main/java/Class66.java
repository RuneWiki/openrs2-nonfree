import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public abstract class Class66 {

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	protected Class66() {
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	public abstract void method1580();

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)Lclient!pm;")
	public abstract Interface12 method1581();

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BI)Z")
	public abstract boolean method1582(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
	public abstract void method1583();
}
