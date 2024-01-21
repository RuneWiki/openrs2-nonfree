import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public abstract class Class9 {

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
	public abstract void method3007();

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(III)I")
	public abstract int method3010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
