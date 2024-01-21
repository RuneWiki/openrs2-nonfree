import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public abstract class Class3 {

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	public abstract void method1484();

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(III)I")
	public abstract int method1485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
