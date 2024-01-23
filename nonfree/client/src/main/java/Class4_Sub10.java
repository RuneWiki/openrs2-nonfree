import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public abstract class Class4_Sub10 extends Class4 {

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
	public int anInt1167;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!rm;)I")
	public abstract int method1001(@OriginalArg(0) Class4_Sub6_Sub4 arg0);

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "()V")
	public abstract void method1002();
}
