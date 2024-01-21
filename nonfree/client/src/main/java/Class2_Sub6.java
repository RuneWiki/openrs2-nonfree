import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public abstract class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!be", name = "p", descriptor = "I")
	public int anInt343;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!vg;)I")
	public abstract int method216(@OriginalArg(0) Class2_Sub10_Sub4 arg0);

	@OriginalMember(owner = "client!be", name = "a", descriptor = "()V")
	public abstract void method217();
}
