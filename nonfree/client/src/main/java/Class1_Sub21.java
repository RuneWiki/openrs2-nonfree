import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public abstract class Class1_Sub21 extends Class1 {

	@OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
	public int anInt3360;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "()V")
	public abstract void method2717();

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!wd;)I")
	public abstract int method2718(@OriginalArg(0) Class1_Sub5_Sub4 arg0);
}
