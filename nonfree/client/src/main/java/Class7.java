import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public abstract class Class7 {

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
	public abstract void method1651();

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)V")
	public abstract void method1653();

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BII)I")
	public abstract int method1654(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
