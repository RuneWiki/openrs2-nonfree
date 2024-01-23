import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public final class Class2_Sub3_Sub20_Sub2 extends Class2_Sub3_Sub20 {

	@OriginalMember(owner = "client!ue", name = "O", descriptor = "Ljava/lang/Object;")
	private Object anObject7;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class2_Sub3_Sub20_Sub2(@OriginalArg(0) Object arg0) {
		this.anObject7 = arg0;
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method4413() {
		return this.anObject7;
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method4414() {
		return false;
	}
}
