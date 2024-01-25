import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public abstract class Class244 {

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "()V")
	protected Class244() {
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I)Lclient!ri;")
	public abstract Class30 method5483();

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(I)V")
	public abstract void method5486();

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(I)V")
	public abstract void method5487();

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(II)Z")
	public abstract boolean method5489(@OriginalArg(1) int arg0);
}
