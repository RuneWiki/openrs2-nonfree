import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public abstract class Class126 {

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)J")
	public abstract long method5252();

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V")
	public abstract void method5254();

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)I")
	public abstract int method5255(@OriginalArg(0) int arg0);
}
