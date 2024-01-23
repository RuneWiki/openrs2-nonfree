import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public abstract class Class4 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
	public abstract void method1603();

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)I")
	public abstract int method1605(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
