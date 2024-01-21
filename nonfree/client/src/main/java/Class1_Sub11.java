import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public abstract class Class1_Sub11 extends Class1 {

	@OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
	public int anInt1723;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "()V")
	public abstract void method1179();

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!ki;)I")
	public abstract int method1180(@OriginalArg(0) Class1_Sub12_Sub2 arg0);
}
