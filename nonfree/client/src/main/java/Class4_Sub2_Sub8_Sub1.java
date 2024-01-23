import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class Class4_Sub2_Sub8_Sub1 extends Class4_Sub2_Sub8 {

	@OriginalMember(owner = "client!hc", name = "P", descriptor = "Ljava/lang/Object;")
	private Object anObject2;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class4_Sub2_Sub8_Sub1(@OriginalArg(0) Object arg0) {
		this.anObject2 = arg0;
	}

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method1815() {
		return this.anObject2;
	}

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method1817() {
		return false;
	}
}
