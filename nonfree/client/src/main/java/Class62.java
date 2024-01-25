import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public abstract class Class62 {

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
	protected Class62() {
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
	public abstract void method1419();

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)Z")
	public abstract boolean method1421(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V")
	public abstract void method1422();

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)Lclient!up;")
	public abstract Interface26 method1425();
}
