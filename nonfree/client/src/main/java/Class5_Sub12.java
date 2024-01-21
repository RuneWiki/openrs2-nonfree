import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public abstract class Class5_Sub12 extends Class5 {

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
	public int anInt2351;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!lb;)I")
	public abstract int method1624(@OriginalArg(0) Class5_Sub2_Sub2 arg0);

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "()V")
	public abstract void method1625();
}
