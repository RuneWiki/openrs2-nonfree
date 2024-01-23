import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public abstract class Class24 {

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
	public abstract void method1678();

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)I")
	public abstract int method1679(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
