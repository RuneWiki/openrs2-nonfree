import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public abstract class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
	public int anInt754;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!cc;)I")
	public abstract int method471(@OriginalArg(0) Class3_Sub2_Sub1 arg0);

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "()V")
	public abstract void method472();
}
