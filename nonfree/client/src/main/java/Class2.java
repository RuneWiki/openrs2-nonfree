import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public abstract class Class2 {

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIB)I")
	public abstract int method1398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
	public abstract void method1399();
}
