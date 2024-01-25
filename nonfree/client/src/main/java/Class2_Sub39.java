import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public abstract class Class2_Sub39 extends Class2 {

	@OriginalMember(owner = "client!pu", name = "h", descriptor = "I")
	public int anInt6903;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "()V")
	private Class2_Sub39() {
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "()V")
	public abstract void method5660();

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lclient!tq;)I")
	public abstract int method5661(@OriginalArg(0) Class2_Sub3_Sub4 arg0);
}
