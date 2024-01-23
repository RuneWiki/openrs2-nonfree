import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public abstract class Class1_Sub19 extends Class1 {

	@OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
	public int anInt4104;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!ii;)I")
	public abstract int method3016(@OriginalArg(0) Class1_Sub10_Sub2 arg0);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "()V")
	public abstract void method3017();
}
