import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public abstract class Class65 {

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "()V")
	protected Class65() {
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)V")
	public abstract void method1562();

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
	public abstract void method1564();

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(II)Z")
	public abstract boolean method1565(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(Z)Lclient!fo;")
	public abstract Interface7 method1567();
}
