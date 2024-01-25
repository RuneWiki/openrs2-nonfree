import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public abstract class Class1_Sub26 extends Class1 {

	@OriginalMember(owner = "client!ju", name = "n", descriptor = "I")
	public int anInt3797;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "()V")
	private Class1_Sub26() {
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "()V")
	public abstract void method2983();

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!po;)I")
	public abstract int method2984(@OriginalArg(0) Class1_Sub9_Sub1 arg0);
}
