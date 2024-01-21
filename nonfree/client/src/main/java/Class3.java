import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public abstract class Class3 {

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
	public abstract void method632();

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)I")
	public abstract int method635(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
