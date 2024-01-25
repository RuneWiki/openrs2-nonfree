import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public abstract class Class157 {

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "()V")
	protected Class157() {
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)Lclient!nfa;")
	public abstract Interface18 method3298();

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)Z")
	public abstract boolean method3300(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(I)V")
	public abstract void method3301();

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "(I)V")
	public abstract void method3302();
}
