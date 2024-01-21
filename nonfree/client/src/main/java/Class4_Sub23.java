import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public abstract class Class4_Sub23 extends Class4 {

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
	public int anInt3455;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!ga;)I")
	public abstract int method2599(@OriginalArg(0) Class4_Sub2_Sub1 arg0);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "()V")
	public abstract void method2600();
}
