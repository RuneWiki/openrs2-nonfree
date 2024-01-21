import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public abstract class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!af", name = "B", descriptor = "I")
	public int anInt169;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!lb;)I")
	public abstract int method138(@OriginalArg(0) Class2_Sub5_Sub1 arg0);

	@OriginalMember(owner = "client!af", name = "a", descriptor = "()V")
	public abstract void method139();
}
