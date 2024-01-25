import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public abstract class Class2_Sub38 extends Class2 {

	@OriginalMember(owner = "client!tq", name = "o", descriptor = "I")
	public int anInt6317;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "()V")
	private Class2_Sub38() {
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!rc;)I")
	public abstract int method5490(@OriginalArg(0) Class2_Sub11_Sub4 arg0);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "()V")
	public abstract void method5491();
}
