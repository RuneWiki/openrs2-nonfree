import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public final class Class1_Sub4_Sub4_Sub1 extends Class1_Sub4_Sub4 {

	@OriginalMember(owner = "client!ep", name = "E", descriptor = "Ljava/lang/Object;")
	private final Object anObject1;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class1_Sub4_Sub4_Sub1(@OriginalArg(0) Object arg0) {
		this.anObject1 = arg0;
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method1930() {
		return this.anObject1;
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method1929() {
		return false;
	}
}
