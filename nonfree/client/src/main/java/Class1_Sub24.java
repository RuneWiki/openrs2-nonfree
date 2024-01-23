import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public abstract class Class1_Sub24 extends Class1 {

	@OriginalMember(owner = "client!pn", name = "l", descriptor = "I")
	public int anInt4281;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!de;)I")
	public abstract int method3435(@OriginalArg(0) Class1_Sub4_Sub2 arg0);

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "()V")
	public abstract void method3436();
}
