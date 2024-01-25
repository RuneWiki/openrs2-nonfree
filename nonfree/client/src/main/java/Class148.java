import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public abstract class Class148 {

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "()V")
	protected Class148() {
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Z)V")
	public abstract void method3950();

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(B)V")
	public abstract void method3951();

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IZ)Z")
	public abstract boolean method3952(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)Lclient!m;")
	public abstract Interface17 method3953();
}
