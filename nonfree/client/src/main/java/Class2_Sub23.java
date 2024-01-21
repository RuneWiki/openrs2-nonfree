import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public abstract class Class2_Sub23 extends Class2 {

	@OriginalMember(owner = "client!t", name = "o", descriptor = "I")
	public int anInt3798;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
	public abstract void method2629();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!sg;)I")
	public abstract int method2630(@OriginalArg(0) Class2_Sub2_Sub3 arg0);
}
