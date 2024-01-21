import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class Class4_Sub7 extends Class4 {

	@OriginalMember(owner = "client!da", name = "s", descriptor = "I")
	public int anInt358;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()V")
	public abstract void method246();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ta;)I")
	public abstract int method247(@OriginalArg(0) Class4_Sub12_Sub4 arg0);
}
