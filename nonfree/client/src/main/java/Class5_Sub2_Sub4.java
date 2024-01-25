import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public abstract class Class5_Sub2_Sub4 extends Class5_Sub2 {

	@OriginalMember(owner = "client!cv", name = "A", descriptor = "I")
	public final int anInt5016;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(I)V")
	protected Class5_Sub2_Sub4(@OriginalArg(0) int arg0) {
		this.anInt5016 = arg0;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)Z")
	public abstract boolean method3963();

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method3965();
}
