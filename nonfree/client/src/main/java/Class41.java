import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public abstract class Class41 {

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
	public abstract void method1580();

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(III)I")
	public abstract int method1581(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
