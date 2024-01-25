import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public abstract class Class69 {

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
	protected Class69() {
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)Lclient!mq;")
	public abstract Class162 method2260();

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)Z")
	public abstract boolean method2261(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
	public abstract void method2262();

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)V")
	public abstract void method2265();
}
