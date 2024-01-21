import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public abstract class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
	public int anInt197;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!ld;)I")
	public abstract int method137(@OriginalArg(0) Class3_Sub4_Sub2 arg0);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "()V")
	public abstract void method138();
}
