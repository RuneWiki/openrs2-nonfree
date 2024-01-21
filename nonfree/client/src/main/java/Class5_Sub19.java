import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public abstract class Class5_Sub19 extends Class5 {

	@OriginalMember(owner = "client!q", name = "v", descriptor = "I")
	public int anInt2531;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "()V")
	public abstract void method1647();

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!oa;)I")
	public abstract int method1648(@OriginalArg(0) Class5_Sub5_Sub4 arg0);
}
