import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public abstract class Class10_Sub32 extends Class10 {

	@OriginalMember(owner = "client!nq", name = "k", descriptor = "I")
	public int anInt4840;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V")
	private Class10_Sub32() {
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!ew;)I")
	public abstract int method3900(@OriginalArg(0) Class10_Sub7_Sub2 arg0);

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "()V")
	public abstract void method3901();
}
