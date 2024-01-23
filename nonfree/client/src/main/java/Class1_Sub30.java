import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public abstract class Class1_Sub30 extends Class1 {

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
	public int anInt5107;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!vf;)I")
	public abstract int method4365(@OriginalArg(0) Class1_Sub24_Sub3 arg0);

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "()V")
	public abstract void method4366();
}
