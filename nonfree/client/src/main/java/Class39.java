import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public abstract class Class39 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	public abstract void method2141();

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)V")
	public abstract void method2143();

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)I")
	public abstract int method2145(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
