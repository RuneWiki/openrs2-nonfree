import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public final class Class1_Sub2_Sub2_Sub1 extends Class1_Sub2_Sub2 {

	@OriginalMember(owner = "client!c", name = "K", descriptor = "Ljava/lang/Object;")
	private Object anObject2;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class1_Sub2_Sub2_Sub1(@OriginalArg(0) Object arg0) {
		this.anObject2 = arg0;
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method1808() {
		return this.anObject2;
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method1802() {
		return false;
	}
}
