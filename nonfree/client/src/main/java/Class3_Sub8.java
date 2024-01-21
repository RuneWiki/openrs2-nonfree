import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public abstract class Class3_Sub8 extends Class3 {

	@OriginalMember(owner = "client!k", name = "y", descriptor = "I")
	public int anInt1396;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "()V")
	public abstract void method1044();

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!ab;)I")
	public abstract int method1045(@OriginalArg(0) Class3_Sub1_Sub1 arg0);
}
