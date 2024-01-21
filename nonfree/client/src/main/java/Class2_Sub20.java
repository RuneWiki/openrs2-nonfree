import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public abstract class Class2_Sub20 extends Class2 {

	@OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
	public int anInt3599;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "()V")
	public abstract void method2498();

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!w;)I")
	public abstract int method2499(@OriginalArg(0) Class2_Sub9_Sub4 arg0);
}
