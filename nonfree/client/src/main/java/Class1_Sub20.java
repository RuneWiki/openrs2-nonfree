import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public abstract class Class1_Sub20 extends Class1 {

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
	public int anInt3902;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "()V")
	public abstract void method2836();

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!pa;)I")
	public abstract int method2837(@OriginalArg(0) Class1_Sub12_Sub2 arg0);
}
