import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public abstract class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!aba", name = "k", descriptor = "I")
	public int anInt59;

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "()V")
	private Class2_Sub3() {
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "()V")
	public abstract void method80();

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(Lclient!sga;)I")
	public abstract int method81(@OriginalArg(0) Class2_Sub13_Sub4 arg0);
}
