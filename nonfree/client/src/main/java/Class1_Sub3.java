import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!c", name = "z", descriptor = "I")
	public int anInt450;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "()V")
	public abstract void method283();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!re;)I")
	public abstract int method284(@OriginalArg(0) Class1_Sub2_Sub2 arg0);
}
