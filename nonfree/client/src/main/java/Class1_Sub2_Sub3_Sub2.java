import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public final class Class1_Sub2_Sub3_Sub2 extends Class1_Sub2_Sub3 {

	@OriginalMember(owner = "client!wf", name = "U", descriptor = "Ljava/lang/Object;")
	private Object anObject7;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class1_Sub2_Sub3_Sub2(@OriginalArg(0) Object arg0) {
		this.anObject7 = arg0;
	}

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method4489() {
		return false;
	}

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method4492() {
		return this.anObject7;
	}
}
