import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public abstract class Class25 {

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)I")
	public abstract int method4574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
	public abstract void method4579();

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)J")
	public abstract long method4580();
}
