import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public abstract class Class23 {

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
	public abstract void method1618();

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)I")
	public abstract int method1620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
