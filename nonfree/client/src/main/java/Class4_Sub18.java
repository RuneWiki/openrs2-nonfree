import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public abstract class Class4_Sub18 extends Class4 {

	@OriginalMember(owner = "client!sa", name = "x", descriptor = "I")
	public int anInt2591;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "()V")
	public abstract void method1871();

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!d;)I")
	public abstract int method1872(@OriginalArg(0) Class4_Sub1_Sub2 arg0);
}
