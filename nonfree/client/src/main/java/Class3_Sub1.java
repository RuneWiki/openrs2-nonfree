import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public abstract class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)I")
	public abstract int method5704();

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(Z)J")
	public abstract long method5709();

	@OriginalMember(owner = "client!aaa", name = "d", descriptor = "(B)I")
	public abstract int method5711();

	@OriginalMember(owner = "client!aaa", name = "e", descriptor = "(B)I")
	public abstract int method5713();

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(I)I")
	public abstract int method5714();
}
