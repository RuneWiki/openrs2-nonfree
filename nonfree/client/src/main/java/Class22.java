import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public abstract class Class22 {

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(III)[B")
	public abstract byte[] method424(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)[B")
	public abstract byte[] method426();

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "([BZ)V")
	public abstract void method428(@OriginalArg(0) byte[] arg0);
}
