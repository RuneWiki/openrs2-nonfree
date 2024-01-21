import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public abstract class Class4 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
	public abstract void method706();

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZI)I")
	public abstract int method707(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
	public abstract void method708();
}
