import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public abstract class Class11 {

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)J")
	public abstract long method5104();

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)I")
	public abstract int method5105(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
	public abstract void method5107();
}
