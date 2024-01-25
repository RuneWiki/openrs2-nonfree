import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public abstract class Class5_Sub41 extends Class5 {

	@OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
	public int anInt6058;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "()V")
	private Class5_Sub41() {
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "()V")
	public abstract void method5440();

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!vf;)I")
	public abstract int method5441(@OriginalArg(0) Class5_Sub16_Sub4 arg0);
}
