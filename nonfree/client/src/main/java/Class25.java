import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public abstract class Class25 {

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
	public abstract void method1352();

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZII)I")
	public abstract int method1355(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)J")
	public abstract long method1357();
}
