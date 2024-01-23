import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public abstract class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
	public int anInt1232;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!be;)I")
	public abstract int method1058(@OriginalArg(0) Class2_Sub5_Sub1 arg0);

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "()V")
	public abstract void method1059();
}
