import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public abstract class Class3_Sub24 extends Class3 {

	@OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
	public int anInt3047;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "()V")
	private Class3_Sub24() {
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "()V")
	public abstract void method2689();

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!fj;)I")
	public abstract int method2690(@OriginalArg(0) Class3_Sub8_Sub2 arg0);
}
