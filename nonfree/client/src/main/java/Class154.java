import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public abstract class Class154 {

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "()V")
	protected Class154() {
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V")
	public abstract void method5011();

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Z)Lclient!oea;")
	public abstract Interface18 method5012();

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)Z")
	public abstract boolean method5014(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V")
	public abstract void method5016();
}
