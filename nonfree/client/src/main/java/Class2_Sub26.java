import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public abstract class Class2_Sub26 extends Class2 {

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
	public int anInt4947;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!wb;)I")
	public abstract int method3967(@OriginalArg(0) Class2_Sub3_Sub4 arg0);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "()V")
	public abstract void method3968();
}
