import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public abstract class Class3_Sub30 extends Class3 {

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
	public int anInt4350;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
	private Class3_Sub30() {
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "()V")
	public abstract void method3801();

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!bea;)I")
	public abstract int method3802(@OriginalArg(0) Class3_Sub4_Sub2 arg0);
}
