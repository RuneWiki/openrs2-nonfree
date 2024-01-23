import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public final class Class1_Sub1_Sub9_Sub1 extends Class1_Sub1_Sub9 {

	@OriginalMember(owner = "client!em", name = "O", descriptor = "Ljava/lang/Object;")
	private Object anObject3;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class1_Sub1_Sub9_Sub1(@OriginalArg(0) Object arg0) {
		this.anObject3 = arg0;
	}

	@OriginalMember(owner = "client!em", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method2983() {
		return false;
	}

	@OriginalMember(owner = "client!em", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method2981() {
		return this.anObject3;
	}
}
