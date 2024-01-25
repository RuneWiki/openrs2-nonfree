import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public abstract class Class5_Sub35 extends Class5 {

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
	public int anInt5772;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
	private Class5_Sub35() {
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!nw;)I")
	public abstract int method4578(@OriginalArg(0) Class5_Sub22_Sub3 arg0);

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "()V")
	public abstract void method4579();
}
