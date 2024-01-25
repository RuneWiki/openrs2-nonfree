import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public abstract class Class38 {

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
	protected Class38() {
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
	public abstract void method795();

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
	public abstract void method796();

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)Z")
	public abstract boolean method799(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)Lclient!tda;")
	public abstract Interface24 method800();
}
