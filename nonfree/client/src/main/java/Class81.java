import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class Class81 {

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)[B")
	public abstract byte[] method1784();

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)[B")
	public abstract byte[] method1785(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z[B)V")
	public abstract void method1786(@OriginalArg(1) byte[] arg0);
}
