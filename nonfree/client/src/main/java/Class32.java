import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public abstract class Class32 {

	@OriginalMember(owner = "client!oga", name = "<init>", descriptor = "()V")
	protected Class32() {
	}

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(B)V")
	public abstract void method785();

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(Z)Lclient!ou;")
	public abstract Interface16 method786();

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)V")
	public abstract void method787();

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(II)Z")
	public abstract boolean method789(@OriginalArg(1) int arg0);
}
