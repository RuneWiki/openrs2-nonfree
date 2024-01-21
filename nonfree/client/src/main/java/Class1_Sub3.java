import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!da", name = "C", descriptor = "I")
	public int anInt478;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!e;)I")
	public abstract int method263(@OriginalArg(0) Class1_Sub4_Sub1 arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()V")
	public abstract void method264();
}
