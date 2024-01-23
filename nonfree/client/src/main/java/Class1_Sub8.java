import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!da", name = "n", descriptor = "I")
	public int anInt784;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()V")
	public abstract void method590();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!fb;)I")
	public abstract int method591(@OriginalArg(0) Class1_Sub12_Sub1 arg0);
}
