import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public final class Class1_Sub2_Sub3_Sub1 extends Class1_Sub2_Sub3 {

	@OriginalMember(owner = "client!di", name = "K", descriptor = "Ljava/lang/Object;")
	private Object anObject1;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class1_Sub2_Sub3_Sub1(@OriginalArg(0) Object arg0) {
		this.anObject1 = arg0;
	}

	@OriginalMember(owner = "client!di", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method2573() {
		return false;
	}

	@OriginalMember(owner = "client!di", name = "f", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method2576() {
		return this.anObject1;
	}
}
